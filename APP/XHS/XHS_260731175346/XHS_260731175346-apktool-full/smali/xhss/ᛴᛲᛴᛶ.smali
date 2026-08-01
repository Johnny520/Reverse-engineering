.class public final Lxhss/ᛴᛲᛴᛶ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᲀᛶᛷᛳ;
.implements Lxhss/ᲈᛳᲈᲀ;
.implements Ljava/lang/Cloneable;
.implements Ljava/nio/channels/ByteChannel;


# instance fields
.field public ᛱᛱᛲᲇ:Lxhss/ᛲᛳᲁᛳ;

.field public ᛳᲁᲇᛸ:J


# virtual methods
.method public final clone()Ljava/lang/Object;
    .locals 6

    .line 1
    new-instance v0, Lxhss/ᛴᛲᛴᛶ;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-wide v1, p0, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 7
    .line 8
    const-wide/16 v3, 0x0

    .line 9
    .line 10
    cmp-long v1, v1, v3

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    iget-object v1, p0, Lxhss/ᛴᛲᛴᛶ;->ᛱᛱᛲᲇ:Lxhss/ᛲᛳᲁᛳ;

    .line 16
    .line 17
    invoke-virtual {v1}, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ()Lxhss/ᛲᛳᲁᛳ;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    iput-object v2, v0, Lxhss/ᛴᛲᛴᛶ;->ᛱᛱᛲᲇ:Lxhss/ᛲᛳᲁᛳ;

    .line 22
    .line 23
    iput-object v2, v2, Lxhss/ᛲᛳᲁᛳ;->ᲀᲇᛳᲁ:Lxhss/ᛲᛳᲁᛳ;

    .line 24
    .line 25
    iput-object v2, v2, Lxhss/ᛲᛳᲁᛳ;->ᲇᛶᛴᲀ:Lxhss/ᛲᛳᲁᛳ;

    .line 26
    .line 27
    iget-object v3, v1, Lxhss/ᛲᛳᲁᛳ;->ᲇᛶᛴᲀ:Lxhss/ᛲᛳᲁᛳ;

    .line 28
    .line 29
    :goto_0
    if-eq v3, v1, :cond_1

    .line 30
    .line 31
    iget-object v4, v2, Lxhss/ᛲᛳᲁᛳ;->ᲀᲇᛳᲁ:Lxhss/ᛲᛳᲁᛳ;

    .line 32
    .line 33
    invoke-virtual {v3}, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ()Lxhss/ᛲᛳᲁᛳ;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    invoke-virtual {v4, v5}, Lxhss/ᛲᛳᲁᛳ;->ᛱᛱᛲᲇ(Lxhss/ᛲᛳᲁᛳ;)V

    .line 38
    .line 39
    .line 40
    iget-object v3, v3, Lxhss/ᛲᛳᲁᛳ;->ᲇᛶᛴᲀ:Lxhss/ᛲᛳᲁᛳ;

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    iget-wide v1, p0, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 44
    .line 45
    iput-wide v1, v0, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 46
    .line 47
    return-object v0
.end method

.method public final close()V
    .locals 0

    .line 1
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
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
    instance-of v3, v1, Lxhss/ᛴᛲᛴᛶ;

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
    iget-wide v5, v0, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 16
    .line 17
    check-cast v1, Lxhss/ᛴᛲᛴᛶ;

    .line 18
    .line 19
    iget-wide v7, v1, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 20
    .line 21
    cmp-long v3, v5, v7

    .line 22
    .line 23
    if-eqz v3, :cond_2

    .line 24
    .line 25
    return v4

    .line 26
    :cond_2
    const-wide/16 v7, 0x0

    .line 27
    .line 28
    cmp-long v3, v5, v7

    .line 29
    .line 30
    if-nez v3, :cond_3

    .line 31
    .line 32
    return v2

    .line 33
    :cond_3
    iget-object v3, v0, Lxhss/ᛴᛲᛴᛶ;->ᛱᛱᛲᲇ:Lxhss/ᛲᛳᲁᛳ;

    .line 34
    .line 35
    iget-object v1, v1, Lxhss/ᛴᛲᛴᛶ;->ᛱᛱᛲᲇ:Lxhss/ᛲᛳᲁᛳ;

    .line 36
    .line 37
    iget v5, v3, Lxhss/ᛲᛳᲁᛳ;->ᛱᛱᛲᲇ:I

    .line 38
    .line 39
    iget v6, v1, Lxhss/ᛲᛳᲁᛳ;->ᛱᛱᛲᲇ:I

    .line 40
    .line 41
    move-wide v9, v7

    .line 42
    :goto_0
    iget-wide v11, v0, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 43
    .line 44
    cmp-long v11, v9, v11

    .line 45
    .line 46
    if-gez v11, :cond_8

    .line 47
    .line 48
    iget v11, v3, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 49
    .line 50
    sub-int/2addr v11, v5

    .line 51
    iget v12, v1, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 52
    .line 53
    sub-int/2addr v12, v6

    .line 54
    invoke-static {v11, v12}, Ljava/lang/Math;->min(II)I

    .line 55
    .line 56
    .line 57
    move-result v11

    .line 58
    int-to-long v11, v11

    .line 59
    move-wide v13, v7

    .line 60
    :goto_1
    cmp-long v15, v13, v11

    .line 61
    .line 62
    if-gez v15, :cond_5

    .line 63
    .line 64
    iget-object v15, v3, Lxhss/ᛲᛳᲁᛳ;->ᛷᛵᛵᲈ:[B

    .line 65
    .line 66
    add-int/lit8 v16, v5, 0x1

    .line 67
    .line 68
    aget-byte v5, v15, v5

    .line 69
    .line 70
    iget-object v15, v1, Lxhss/ᛲᛳᲁᛳ;->ᛷᛵᛵᲈ:[B

    .line 71
    .line 72
    add-int/lit8 v17, v6, 0x1

    .line 73
    .line 74
    aget-byte v6, v15, v6

    .line 75
    .line 76
    if-eq v5, v6, :cond_4

    .line 77
    .line 78
    return v4

    .line 79
    :cond_4
    const-wide/16 v5, 0x1

    .line 80
    .line 81
    add-long/2addr v13, v5

    .line 82
    move/from16 v5, v16

    .line 83
    .line 84
    move/from16 v6, v17

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_5
    iget v13, v3, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 88
    .line 89
    if-ne v5, v13, :cond_6

    .line 90
    .line 91
    iget-object v3, v3, Lxhss/ᛲᛳᲁᛳ;->ᲇᛶᛴᲀ:Lxhss/ᛲᛳᲁᛳ;

    .line 92
    .line 93
    iget v5, v3, Lxhss/ᛲᛳᲁᛳ;->ᛱᛱᛲᲇ:I

    .line 94
    .line 95
    :cond_6
    iget v13, v1, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 96
    .line 97
    if-ne v6, v13, :cond_7

    .line 98
    .line 99
    iget-object v1, v1, Lxhss/ᛲᛳᲁᛳ;->ᲇᛶᛴᲀ:Lxhss/ᛲᛳᲁᛳ;

    .line 100
    .line 101
    iget v6, v1, Lxhss/ᛲᛳᲁᛳ;->ᛱᛱᛲᲇ:I

    .line 102
    .line 103
    :cond_7
    add-long/2addr v9, v11

    .line 104
    goto :goto_0

    .line 105
    :cond_8
    return v2
.end method

.method public final flush()V
    .locals 0

    .line 1
    return-void
.end method

.method public final hashCode()I
    .locals 5

    .line 1
    iget-object v0, p0, Lxhss/ᛴᛲᛴᛶ;->ᛱᛱᛲᲇ:Lxhss/ᛲᛳᲁᛳ;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 v1, 0x1

    .line 8
    :cond_1
    iget v2, v0, Lxhss/ᛲᛳᲁᛳ;->ᛱᛱᛲᲇ:I

    .line 9
    .line 10
    iget v3, v0, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 11
    .line 12
    :goto_0
    if-ge v2, v3, :cond_2

    .line 13
    .line 14
    mul-int/lit8 v1, v1, 0x1f

    .line 15
    .line 16
    iget-object v4, v0, Lxhss/ᛲᛳᲁᛳ;->ᛷᛵᛵᲈ:[B

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
    iget-object v0, v0, Lxhss/ᛲᛳᲁᛳ;->ᲇᛶᛴᲀ:Lxhss/ᛲᛳᲁᛳ;

    .line 25
    .line 26
    iget-object v2, p0, Lxhss/ᛴᛲᛴᛶ;->ᛱᛱᛲᲇ:Lxhss/ᛲᛳᲁᛳ;

    .line 27
    .line 28
    if-ne v0, v2, :cond_1

    .line 29
    .line 30
    return v1
.end method

.method public final isOpen()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final read(Ljava/nio/ByteBuffer;)I
    .locals 6

    .line 58
    iget-object v0, p0, Lxhss/ᛴᛲᛴᛶ;->ᛱᛱᛲᲇ:Lxhss/ᛲᛳᲁᛳ;

    if-nez v0, :cond_0

    const/4 p0, -0x1

    return p0

    .line 59
    :cond_0
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v1

    iget v2, v0, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    iget v3, v0, Lxhss/ᛲᛳᲁᛳ;->ᛱᛱᛲᲇ:I

    sub-int/2addr v2, v3

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 60
    iget-object v2, v0, Lxhss/ᛲᛳᲁᛳ;->ᛷᛵᛵᲈ:[B

    iget v3, v0, Lxhss/ᛲᛳᲁᛳ;->ᛱᛱᛲᲇ:I

    invoke-virtual {p1, v2, v3, v1}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    .line 61
    iget p1, v0, Lxhss/ᛲᛳᲁᛳ;->ᛱᛱᛲᲇ:I

    add-int/2addr p1, v1

    iput p1, v0, Lxhss/ᛲᛳᲁᛳ;->ᛱᛱᛲᲇ:I

    .line 62
    iget-wide v2, p0, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    int-to-long v4, v1

    sub-long/2addr v2, v4

    iput-wide v2, p0, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 63
    iget v2, v0, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    if-ne p1, v2, :cond_1

    .line 64
    invoke-virtual {v0}, Lxhss/ᛲᛳᲁᛳ;->ᛷᛵᛵᲈ()Lxhss/ᛲᛳᲁᛳ;

    move-result-object p1

    iput-object p1, p0, Lxhss/ᛴᛲᛴᛶ;->ᛱᛱᛲᲇ:Lxhss/ᛲᛳᲁᛳ;

    .line 65
    invoke-static {v0}, Lxhss/ᛲᛷᛲᲁ;->ᛷᛵᛵᲈ(Lxhss/ᛲᛳᲁᛳ;)V

    :cond_1
    return v1
.end method

.method public final read([BII)I
    .locals 7

    .line 1
    array-length v0, p1

    .line 2
    int-to-long v1, v0

    .line 3
    int-to-long v3, p2

    .line 4
    int-to-long v5, p3

    .line 5
    invoke-static/range {v1 .. v6}, Lxhss/ᛷᛸᲀᲀ;->ᛸᛷᲈᲈ(JJJ)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lxhss/ᛴᛲᛴᛶ;->ᛱᛱᛲᲇ:Lxhss/ᛲᛳᲁᛳ;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const/4 p0, -0x1

    .line 13
    return p0

    .line 14
    :cond_0
    iget v1, v0, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 15
    .line 16
    iget v2, v0, Lxhss/ᛲᛳᲁᛳ;->ᛱᛱᛲᲇ:I

    .line 17
    .line 18
    sub-int/2addr v1, v2

    .line 19
    invoke-static {p3, v1}, Ljava/lang/Math;->min(II)I

    .line 20
    .line 21
    .line 22
    move-result p3

    .line 23
    iget-object v1, v0, Lxhss/ᛲᛳᲁᛳ;->ᛷᛵᛵᲈ:[B

    .line 24
    .line 25
    iget v2, v0, Lxhss/ᛲᛳᲁᛳ;->ᛱᛱᛲᲇ:I

    .line 26
    .line 27
    add-int v3, v2, p3

    .line 28
    .line 29
    sub-int/2addr v3, v2

    .line 30
    invoke-static {v1, v2, p1, p2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 31
    .line 32
    .line 33
    iget p1, v0, Lxhss/ᛲᛳᲁᛳ;->ᛱᛱᛲᲇ:I

    .line 34
    .line 35
    add-int/2addr p1, p3

    .line 36
    iput p1, v0, Lxhss/ᛲᛳᲁᛳ;->ᛱᛱᛲᲇ:I

    .line 37
    .line 38
    iget-wide v1, p0, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 39
    .line 40
    int-to-long v3, p3

    .line 41
    sub-long/2addr v1, v3

    .line 42
    iput-wide v1, p0, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 43
    .line 44
    iget p2, v0, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 45
    .line 46
    if-ne p1, p2, :cond_1

    .line 47
    .line 48
    invoke-virtual {v0}, Lxhss/ᛲᛳᲁᛳ;->ᛷᛵᛵᲈ()Lxhss/ᛲᛳᲁᛳ;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iput-object p1, p0, Lxhss/ᛴᛲᛴᛶ;->ᛱᛱᛲᲇ:Lxhss/ᛲᛳᲁᛳ;

    .line 53
    .line 54
    invoke-static {v0}, Lxhss/ᛲᛷᛲᲁ;->ᛷᛵᛵᲈ(Lxhss/ᛲᛳᲁᛳ;)V

    .line 55
    .line 56
    .line 57
    :cond_1
    return p3
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    iget-wide v0, p0, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 2
    .line 3
    const-wide/32 v2, 0x7fffffff

    .line 4
    .line 5
    .line 6
    cmp-long v2, v0, v2

    .line 7
    .line 8
    if-gtz v2, :cond_0

    .line 9
    .line 10
    long-to-int v0, v0

    .line 11
    invoke-virtual {p0, v0}, Lxhss/ᛴᛲᛴᛶ;->ᛸᛲᛷᛱ(I)Lxhss/ᛳᛶᲈᲈ;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, Lxhss/ᛳᛶᲈᲈ;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :cond_0
    iget-wide v0, p0, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 21
    .line 22
    new-instance p0, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-string v2, "size > Int.MAX_VALUE: "

    .line 25
    .line 26
    invoke-direct {p0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 37
    .line 38
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw v0
.end method

.method public final write(Ljava/nio/ByteBuffer;)I
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    move v1, v0

    .line 6
    :goto_0
    if-lez v1, :cond_0

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    invoke-virtual {p0, v2}, Lxhss/ᛴᛲᛴᛶ;->ᛴᲈᛱᛴ(I)Lxhss/ᛲᛳᲁᛳ;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    iget v3, v2, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 14
    .line 15
    rsub-int v3, v3, 0x2000

    .line 16
    .line 17
    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    iget-object v4, v2, Lxhss/ᛲᛳᲁᛳ;->ᛷᛵᛵᲈ:[B

    .line 22
    .line 23
    iget v5, v2, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 24
    .line 25
    invoke-virtual {p1, v4, v5, v3}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 26
    .line 27
    .line 28
    sub-int/2addr v1, v3

    .line 29
    iget v4, v2, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 30
    .line 31
    add-int/2addr v4, v3

    .line 32
    iput v4, v2, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    iget-wide v1, p0, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 36
    .line 37
    int-to-long v3, v0

    .line 38
    add-long/2addr v1, v3

    .line 39
    iput-wide v1, p0, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 40
    .line 41
    return v0
.end method

.method public final ᛱᛱᛲᲇ()Z
    .locals 4

    .line 1
    iget-wide v0, p0, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long p0, v0, v2

    .line 6
    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public final ᛱᛳᲁᲈ(J)V
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
    invoke-virtual {p0, p1}, Lxhss/ᛴᛲᛴᛶ;->ᲁᛴᲇᛲ(I)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const/4 v0, 0x1

    .line 14
    ushr-long v1, p1, v0

    .line 15
    .line 16
    or-long/2addr v1, p1

    .line 17
    const/4 v3, 0x2

    .line 18
    ushr-long v4, v1, v3

    .line 19
    .line 20
    or-long/2addr v1, v4

    .line 21
    const/4 v4, 0x4

    .line 22
    ushr-long v5, v1, v4

    .line 23
    .line 24
    or-long/2addr v1, v5

    .line 25
    const/16 v5, 0x8

    .line 26
    .line 27
    ushr-long v6, v1, v5

    .line 28
    .line 29
    or-long/2addr v1, v6

    .line 30
    const/16 v6, 0x10

    .line 31
    .line 32
    ushr-long v7, v1, v6

    .line 33
    .line 34
    or-long/2addr v1, v7

    .line 35
    const/16 v7, 0x20

    .line 36
    .line 37
    ushr-long v8, v1, v7

    .line 38
    .line 39
    or-long/2addr v1, v8

    .line 40
    ushr-long v8, v1, v0

    .line 41
    .line 42
    const-wide v10, 0x5555555555555555L    # 1.1945305291614955E103

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    and-long/2addr v8, v10

    .line 48
    sub-long/2addr v1, v8

    .line 49
    ushr-long v8, v1, v3

    .line 50
    .line 51
    const-wide v10, 0x3333333333333333L    # 4.667261458395856E-62

    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    and-long/2addr v8, v10

    .line 57
    and-long/2addr v1, v10

    .line 58
    add-long/2addr v8, v1

    .line 59
    ushr-long v1, v8, v4

    .line 60
    .line 61
    add-long/2addr v1, v8

    .line 62
    const-wide v8, 0xf0f0f0f0f0f0f0fL    # 3.815736827118017E-236

    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    and-long/2addr v1, v8

    .line 68
    ushr-long v8, v1, v5

    .line 69
    .line 70
    add-long/2addr v1, v8

    .line 71
    ushr-long v5, v1, v6

    .line 72
    .line 73
    add-long/2addr v1, v5

    .line 74
    const-wide/16 v5, 0x3f

    .line 75
    .line 76
    and-long v8, v1, v5

    .line 77
    .line 78
    ushr-long/2addr v1, v7

    .line 79
    and-long/2addr v1, v5

    .line 80
    add-long/2addr v8, v1

    .line 81
    const-wide/16 v1, 0x3

    .line 82
    .line 83
    add-long/2addr v8, v1

    .line 84
    const-wide/16 v1, 0x4

    .line 85
    .line 86
    div-long/2addr v8, v1

    .line 87
    long-to-int v1, v8

    .line 88
    invoke-virtual {p0, v1}, Lxhss/ᛴᛲᛴᛶ;->ᛴᲈᛱᛴ(I)Lxhss/ᛲᛳᲁᛳ;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    iget-object v3, v2, Lxhss/ᛲᛳᲁᛳ;->ᛷᛵᛵᲈ:[B

    .line 93
    .line 94
    iget v5, v2, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

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
    sget-object v0, Lxhss/ᛱᛱᛲᲇ;->ᛷᛵᛵᲈ:[B

    .line 102
    .line 103
    const-wide/16 v7, 0xf

    .line 104
    .line 105
    and-long/2addr v7, p1

    .line 106
    long-to-int v7, v7

    .line 107
    aget-byte v0, v0, v7

    .line 108
    .line 109
    aput-byte v0, v3, v6

    .line 110
    .line 111
    ushr-long/2addr p1, v4

    .line 112
    add-int/lit8 v6, v6, -0x1

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_1
    iget p1, v2, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 116
    .line 117
    add-int/2addr p1, v1

    .line 118
    iput p1, v2, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 119
    .line 120
    iget-wide p1, p0, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 121
    .line 122
    int-to-long v0, v1

    .line 123
    add-long/2addr p1, v0

    .line 124
    iput-wide p1, p0, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 125
    .line 126
    return-void
.end method

.method public final ᛲᛴᲀᲈ(I)V
    .locals 7

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-virtual {p0, v0}, Lxhss/ᛴᛲᛴᛶ;->ᛴᲈᛱᛴ(I)Lxhss/ᛲᛳᲁᛳ;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    iget-object v2, v1, Lxhss/ᛲᛳᲁᛳ;->ᛷᛵᛵᲈ:[B

    .line 7
    .line 8
    iget v3, v1, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

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
    iput v3, v1, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 44
    .line 45
    iget-wide v0, p0, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 46
    .line 47
    const-wide/16 v2, 0x4

    .line 48
    .line 49
    add-long/2addr v0, v2

    .line 50
    iput-wide v0, p0, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 51
    .line 52
    return-void
.end method

.method public final ᛲᛴᲇᛲ(Ljava/lang/String;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    invoke-virtual {p0, p1, v0, v1}, Lxhss/ᛴᛲᛴᛶ;->ᲁᲁᛴᲁ(Ljava/lang/String;II)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final ᛳᛶᛷᲀ(Lxhss/ᛳᛶᲈᲈ;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lxhss/ᛳᛶᲈᲈ;->ᛷᛵᛵᲈ()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1, p0, v0}, Lxhss/ᛳᛶᲈᲈ;->ᲈᛳᲀ(Lxhss/ᛴᛲᛴᛶ;I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final ᛳᛸᛵᲀ(I)V
    .locals 8

    .line 1
    const/16 v0, 0x80

    .line 2
    .line 3
    if-ge p1, v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lxhss/ᛴᛲᛴᛶ;->ᲁᛴᲇᛲ(I)V

    .line 6
    .line 7
    .line 8
    return-void

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
    invoke-virtual {p0, v1}, Lxhss/ᛴᛲᛴᛶ;->ᛴᲈᛱᛴ(I)Lxhss/ᛲᛳᲁᛳ;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    iget-object v4, v3, Lxhss/ᛲᛳᲁᛳ;->ᛷᛵᛵᲈ:[B

    .line 21
    .line 22
    iget v5, v3, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

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
    iput v5, v3, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 40
    .line 41
    iget-wide v0, p0, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 42
    .line 43
    const-wide/16 v2, 0x2

    .line 44
    .line 45
    add-long/2addr v0, v2

    .line 46
    iput-wide v0, p0, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 47
    .line 48
    return-void

    .line 49
    :cond_1
    const v1, 0xd800

    .line 50
    .line 51
    .line 52
    if-gt v1, p1, :cond_2

    .line 53
    .line 54
    const v1, 0xe000

    .line 55
    .line 56
    .line 57
    if-ge p1, v1, :cond_2

    .line 58
    .line 59
    invoke-virtual {p0, v2}, Lxhss/ᛴᛲᛴᛶ;->ᲁᛴᲇᛲ(I)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_2
    const/high16 v1, 0x10000

    .line 64
    .line 65
    if-ge p1, v1, :cond_3

    .line 66
    .line 67
    const/4 v1, 0x3

    .line 68
    invoke-virtual {p0, v1}, Lxhss/ᛴᛲᛴᛶ;->ᛴᲈᛱᛴ(I)Lxhss/ᛲᛳᲁᛳ;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    iget-object v4, v3, Lxhss/ᛲᛳᲁᛳ;->ᛷᛵᛵᲈ:[B

    .line 73
    .line 74
    iget v5, v3, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 75
    .line 76
    shr-int/lit8 v6, p1, 0xc

    .line 77
    .line 78
    or-int/lit16 v6, v6, 0xe0

    .line 79
    .line 80
    int-to-byte v6, v6

    .line 81
    aput-byte v6, v4, v5

    .line 82
    .line 83
    add-int/lit8 v6, v5, 0x1

    .line 84
    .line 85
    shr-int/lit8 v7, p1, 0x6

    .line 86
    .line 87
    and-int/2addr v7, v2

    .line 88
    or-int/2addr v7, v0

    .line 89
    int-to-byte v7, v7

    .line 90
    aput-byte v7, v4, v6

    .line 91
    .line 92
    add-int/lit8 v6, v5, 0x2

    .line 93
    .line 94
    and-int/2addr p1, v2

    .line 95
    or-int/2addr p1, v0

    .line 96
    int-to-byte p1, p1

    .line 97
    aput-byte p1, v4, v6

    .line 98
    .line 99
    add-int/2addr v5, v1

    .line 100
    iput v5, v3, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 101
    .line 102
    iget-wide v0, p0, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 103
    .line 104
    const-wide/16 v2, 0x3

    .line 105
    .line 106
    add-long/2addr v0, v2

    .line 107
    iput-wide v0, p0, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 108
    .line 109
    return-void

    .line 110
    :cond_3
    const v1, 0x10ffff

    .line 111
    .line 112
    .line 113
    if-gt p1, v1, :cond_4

    .line 114
    .line 115
    const/4 v1, 0x4

    .line 116
    invoke-virtual {p0, v1}, Lxhss/ᛴᛲᛴᛶ;->ᛴᲈᛱᛴ(I)Lxhss/ᛲᛳᲁᛳ;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    iget-object v4, v3, Lxhss/ᛲᛳᲁᛳ;->ᛷᛵᛵᲈ:[B

    .line 121
    .line 122
    iget v5, v3, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 123
    .line 124
    shr-int/lit8 v6, p1, 0x12

    .line 125
    .line 126
    or-int/lit16 v6, v6, 0xf0

    .line 127
    .line 128
    int-to-byte v6, v6

    .line 129
    aput-byte v6, v4, v5

    .line 130
    .line 131
    add-int/lit8 v6, v5, 0x1

    .line 132
    .line 133
    shr-int/lit8 v7, p1, 0xc

    .line 134
    .line 135
    and-int/2addr v7, v2

    .line 136
    or-int/2addr v7, v0

    .line 137
    int-to-byte v7, v7

    .line 138
    aput-byte v7, v4, v6

    .line 139
    .line 140
    add-int/lit8 v6, v5, 0x2

    .line 141
    .line 142
    shr-int/lit8 v7, p1, 0x6

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
    add-int/lit8 v6, v5, 0x3

    .line 150
    .line 151
    and-int/2addr p1, v2

    .line 152
    or-int/2addr p1, v0

    .line 153
    int-to-byte p1, p1

    .line 154
    aput-byte p1, v4, v6

    .line 155
    .line 156
    add-int/2addr v5, v1

    .line 157
    iput v5, v3, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 158
    .line 159
    iget-wide v0, p0, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 160
    .line 161
    const-wide/16 v2, 0x4

    .line 162
    .line 163
    add-long/2addr v0, v2

    .line 164
    iput-wide v0, p0, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 165
    .line 166
    return-void

    .line 167
    :cond_4
    invoke-static {p1}, Lxhss/ᛷᛸᲀᲀ;->ᛵᛲᲁᛶ(I)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    const-string p1, "Unexpected code point: 0x"

    .line 172
    .line 173
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᲀᲇᛳᲁ(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    return-void
.end method

.method public final ᛳᲁᲇᛸ(J)B
    .locals 6

    .line 1
    iget-wide v0, p0, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 2
    .line 3
    const-wide/16 v4, 0x1

    .line 4
    .line 5
    move-wide v2, p1

    .line 6
    invoke-static/range {v0 .. v5}, Lxhss/ᛷᛸᲀᲀ;->ᛸᛷᲈᲈ(JJJ)V

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Lxhss/ᛴᛲᛴᛶ;->ᛱᛱᛲᲇ:Lxhss/ᛲᛳᲁᛳ;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-wide v0, p0, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 15
    .line 16
    sub-long v4, v0, v2

    .line 17
    .line 18
    cmp-long p0, v4, v2

    .line 19
    .line 20
    if-gez p0, :cond_1

    .line 21
    .line 22
    :goto_0
    cmp-long p0, v0, v2

    .line 23
    .line 24
    if-lez p0, :cond_0

    .line 25
    .line 26
    iget-object p1, p1, Lxhss/ᛲᛳᲁᛳ;->ᲀᲇᛳᲁ:Lxhss/ᛲᛳᲁᛳ;

    .line 27
    .line 28
    iget p0, p1, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 29
    .line 30
    iget p2, p1, Lxhss/ᛲᛳᲁᛳ;->ᛱᛱᛲᲇ:I

    .line 31
    .line 32
    sub-int/2addr p0, p2

    .line 33
    int-to-long v4, p0

    .line 34
    sub-long/2addr v0, v4

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    iget-object p0, p1, Lxhss/ᛲᛳᲁᛳ;->ᛷᛵᛵᲈ:[B

    .line 37
    .line 38
    iget p1, p1, Lxhss/ᛲᛳᲁᛳ;->ᛱᛱᛲᲇ:I

    .line 39
    .line 40
    int-to-long p1, p1

    .line 41
    add-long/2addr p1, v2

    .line 42
    sub-long/2addr p1, v0

    .line 43
    long-to-int p1, p1

    .line 44
    aget-byte p0, p0, p1

    .line 45
    .line 46
    return p0

    .line 47
    :cond_1
    const-wide/16 v0, 0x0

    .line 48
    .line 49
    :goto_1
    iget p0, p1, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 50
    .line 51
    iget p2, p1, Lxhss/ᛲᛳᲁᛳ;->ᛱᛱᛲᲇ:I

    .line 52
    .line 53
    sub-int/2addr p0, p2

    .line 54
    int-to-long v4, p0

    .line 55
    add-long/2addr v4, v0

    .line 56
    cmp-long p0, v4, v2

    .line 57
    .line 58
    if-gtz p0, :cond_2

    .line 59
    .line 60
    iget-object p1, p1, Lxhss/ᛲᛳᲁᛳ;->ᲇᛶᛴᲀ:Lxhss/ᛲᛳᲁᛳ;

    .line 61
    .line 62
    move-wide v0, v4

    .line 63
    goto :goto_1

    .line 64
    :cond_2
    iget-object p0, p1, Lxhss/ᛲᛳᲁᛳ;->ᛷᛵᛵᲈ:[B

    .line 65
    .line 66
    int-to-long p1, p2

    .line 67
    add-long/2addr p1, v2

    .line 68
    sub-long/2addr p1, v0

    .line 69
    long-to-int p1, p1

    .line 70
    aget-byte p0, p0, p1

    .line 71
    .line 72
    return p0
.end method

.method public final ᛳᲈᲈᛲ(JLjava/nio/charset/Charset;)Ljava/lang/String;
    .locals 6

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-ltz v0, :cond_4

    .line 6
    .line 7
    const-wide/32 v1, 0x7fffffff

    .line 8
    .line 9
    .line 10
    cmp-long v1, p1, v1

    .line 11
    .line 12
    if-gtz v1, :cond_4

    .line 13
    .line 14
    iget-wide v1, p0, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 15
    .line 16
    cmp-long v1, v1, p1

    .line 17
    .line 18
    if-ltz v1, :cond_3

    .line 19
    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    const-string p0, ""

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_0
    iget-object v0, p0, Lxhss/ᛴᛲᛴᛶ;->ᛱᛱᛲᲇ:Lxhss/ᛲᛳᲁᛳ;

    .line 26
    .line 27
    iget v1, v0, Lxhss/ᛲᛳᲁᛳ;->ᛱᛱᛲᲇ:I

    .line 28
    .line 29
    int-to-long v2, v1

    .line 30
    add-long/2addr v2, p1

    .line 31
    iget v4, v0, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 32
    .line 33
    int-to-long v4, v4

    .line 34
    cmp-long v2, v2, v4

    .line 35
    .line 36
    if-lez v2, :cond_1

    .line 37
    .line 38
    new-instance v0, Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {p0, p1, p2}, Lxhss/ᛴᛲᛴᛶ;->ᲀᲇᛳᲁ(J)[B

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-direct {v0, p0, p3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 45
    .line 46
    .line 47
    return-object v0

    .line 48
    :cond_1
    new-instance v2, Ljava/lang/String;

    .line 49
    .line 50
    iget-object v3, v0, Lxhss/ᛲᛳᲁᛳ;->ᛷᛵᛵᲈ:[B

    .line 51
    .line 52
    long-to-int v4, p1

    .line 53
    invoke-direct {v2, v3, v1, v4, p3}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 54
    .line 55
    .line 56
    iget p3, v0, Lxhss/ᛲᛳᲁᛳ;->ᛱᛱᛲᲇ:I

    .line 57
    .line 58
    add-int/2addr p3, v4

    .line 59
    iput p3, v0, Lxhss/ᛲᛳᲁᛳ;->ᛱᛱᛲᲇ:I

    .line 60
    .line 61
    iget-wide v3, p0, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 62
    .line 63
    sub-long/2addr v3, p1

    .line 64
    iput-wide v3, p0, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 65
    .line 66
    iget p1, v0, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 67
    .line 68
    if-ne p3, p1, :cond_2

    .line 69
    .line 70
    invoke-virtual {v0}, Lxhss/ᛲᛳᲁᛳ;->ᛷᛵᛵᲈ()Lxhss/ᛲᛳᲁᛳ;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    iput-object p1, p0, Lxhss/ᛴᛲᛴᛶ;->ᛱᛱᛲᲇ:Lxhss/ᛲᛳᲁᛳ;

    .line 75
    .line 76
    invoke-static {v0}, Lxhss/ᛲᛷᛲᲁ;->ᛷᛵᛵᲈ(Lxhss/ᛲᛳᲁᛳ;)V

    .line 77
    .line 78
    .line 79
    :cond_2
    return-object v2

    .line 80
    :cond_3
    new-instance p0, Ljava/io/EOFException;

    .line 81
    .line 82
    invoke-direct {p0}, Ljava/io/EOFException;-><init>()V

    .line 83
    .line 84
    .line 85
    throw p0

    .line 86
    :cond_4
    const-string p0, "byteCount: "

    .line 87
    .line 88
    invoke-static {p0, p1, p2}, Lxhss/ᛵᲈᲁᲈ;->ᛷᲁᲁ(Ljava/lang/String;J)V

    .line 89
    .line 90
    .line 91
    const/4 p0, 0x0

    .line 92
    return-object p0
.end method

.method public final ᛴᲈᛱᛴ(I)Lxhss/ᛲᛳᲁᛳ;
    .locals 2

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
    iget-object v1, p0, Lxhss/ᛴᛲᛴᛶ;->ᛱᛱᛲᲇ:Lxhss/ᛲᛳᲁᛳ;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    invoke-static {}, Lxhss/ᛲᛷᛲᲁ;->ᛱᛱᛲᲇ()Lxhss/ᛲᛳᲁᛳ;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, Lxhss/ᛴᛲᛴᛶ;->ᛱᛱᛲᲇ:Lxhss/ᛲᛳᲁᛳ;

    .line 17
    .line 18
    iput-object p1, p1, Lxhss/ᛲᛳᲁᛳ;->ᲀᲇᛳᲁ:Lxhss/ᛲᛳᲁᛳ;

    .line 19
    .line 20
    iput-object p1, p1, Lxhss/ᛲᛳᲁᛳ;->ᲇᛶᛴᲀ:Lxhss/ᛲᛳᲁᛳ;

    .line 21
    .line 22
    return-object p1

    .line 23
    :cond_0
    iget-object p0, v1, Lxhss/ᛲᛳᲁᛳ;->ᲀᲇᛳᲁ:Lxhss/ᛲᛳᲁᛳ;

    .line 24
    .line 25
    iget v1, p0, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 26
    .line 27
    add-int/2addr v1, p1

    .line 28
    if-gt v1, v0, :cond_2

    .line 29
    .line 30
    iget-boolean p1, p0, Lxhss/ᛲᛳᲁᛳ;->ᛷᛴᛷᛱ:Z

    .line 31
    .line 32
    if-nez p1, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    return-object p0

    .line 36
    :cond_2
    :goto_0
    invoke-static {}, Lxhss/ᛲᛷᛲᲁ;->ᛱᛱᛲᲇ()Lxhss/ᛲᛳᲁᛳ;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p0, p1}, Lxhss/ᛲᛳᲁᛳ;->ᛱᛱᛲᲇ(Lxhss/ᛲᛳᲁᛳ;)V

    .line 41
    .line 42
    .line 43
    return-object p1

    .line 44
    :cond_3
    const-string p0, "unexpected capacity"

    .line 45
    .line 46
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᲀᲇᛳᲁ(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const/4 p0, 0x0

    .line 50
    return-object p0
.end method

.method public final ᛶᲇᲈᛸ()Ljava/lang/String;
    .locals 3

    .line 1
    iget-wide v0, p0, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 2
    .line 3
    sget-object v2, Lxhss/ᛶᲈᲇᲇ;->ᛷᛵᛵᲈ:Ljava/nio/charset/Charset;

    .line 4
    .line 5
    invoke-virtual {p0, v0, v1, v2}, Lxhss/ᛴᛲᛴᛶ;->ᛳᲈᲈᛲ(JLjava/nio/charset/Charset;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final ᛷᛴᛷᛱ(JLxhss/ᛴᛲᛴᛶ;)V
    .locals 8

    .line 1
    if-eq p3, p0, :cond_c

    .line 2
    .line 3
    iget-wide v0, p3, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 4
    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    move-wide v4, p1

    .line 8
    invoke-static/range {v0 .. v5}, Lxhss/ᛷᛸᲀᲀ;->ᛸᛷᲈᲈ(JJJ)V

    .line 9
    .line 10
    .line 11
    :goto_0
    const-wide/16 v0, 0x0

    .line 12
    .line 13
    cmp-long v0, p1, v0

    .line 14
    .line 15
    if-lez v0, :cond_b

    .line 16
    .line 17
    iget-object v0, p3, Lxhss/ᛴᛲᛴᛶ;->ᛱᛱᛲᲇ:Lxhss/ᛲᛳᲁᛳ;

    .line 18
    .line 19
    iget v1, v0, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 20
    .line 21
    iget v2, v0, Lxhss/ᛲᛳᲁᛳ;->ᛱᛱᛲᲇ:I

    .line 22
    .line 23
    sub-int/2addr v1, v2

    .line 24
    int-to-long v2, v1

    .line 25
    cmp-long v2, p1, v2

    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    if-gez v2, :cond_5

    .line 29
    .line 30
    iget-object v2, p0, Lxhss/ᛴᛲᛴᛶ;->ᛱᛱᛲᲇ:Lxhss/ᛲᛳᲁᛳ;

    .line 31
    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    iget-object v2, v2, Lxhss/ᛲᛳᲁᛳ;->ᲀᲇᛳᲁ:Lxhss/ᛲᛳᲁᛳ;

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_0
    const/4 v2, 0x0

    .line 38
    :goto_1
    if-eqz v2, :cond_2

    .line 39
    .line 40
    iget-boolean v4, v2, Lxhss/ᛲᛳᲁᛳ;->ᛷᛴᛷᛱ:Z

    .line 41
    .line 42
    if-eqz v4, :cond_2

    .line 43
    .line 44
    iget v4, v2, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 45
    .line 46
    int-to-long v4, v4

    .line 47
    add-long/2addr v4, p1

    .line 48
    iget-boolean v6, v2, Lxhss/ᛲᛳᲁᛳ;->ᲇᛴᲇᛵ:Z

    .line 49
    .line 50
    if-eqz v6, :cond_1

    .line 51
    .line 52
    move v6, v3

    .line 53
    goto :goto_2

    .line 54
    :cond_1
    iget v6, v2, Lxhss/ᛲᛳᲁᛳ;->ᛱᛱᛲᲇ:I

    .line 55
    .line 56
    :goto_2
    int-to-long v6, v6

    .line 57
    sub-long/2addr v4, v6

    .line 58
    const-wide/16 v6, 0x2000

    .line 59
    .line 60
    cmp-long v4, v4, v6

    .line 61
    .line 62
    if-gtz v4, :cond_2

    .line 63
    .line 64
    long-to-int v1, p1

    .line 65
    invoke-virtual {v0, v2, v1}, Lxhss/ᛲᛳᲁᛳ;->ᲇᛴᲇᛵ(Lxhss/ᛲᛳᲁᛳ;I)V

    .line 66
    .line 67
    .line 68
    iget-wide v0, p3, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 69
    .line 70
    sub-long/2addr v0, p1

    .line 71
    iput-wide v0, p3, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 72
    .line 73
    iget-wide v0, p0, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 74
    .line 75
    add-long/2addr v0, p1

    .line 76
    iput-wide v0, p0, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 77
    .line 78
    return-void

    .line 79
    :cond_2
    long-to-int v2, p1

    .line 80
    if-lez v2, :cond_4

    .line 81
    .line 82
    if-gt v2, v1, :cond_4

    .line 83
    .line 84
    const/16 v1, 0x400

    .line 85
    .line 86
    if-lt v2, v1, :cond_3

    .line 87
    .line 88
    invoke-virtual {v0}, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ()Lxhss/ᛲᛳᲁᛳ;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    goto :goto_3

    .line 93
    :cond_3
    invoke-static {}, Lxhss/ᛲᛷᛲᲁ;->ᛱᛱᛲᲇ()Lxhss/ᛲᛳᲁᛳ;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    iget-object v4, v0, Lxhss/ᛲᛳᲁᛳ;->ᛷᛵᛵᲈ:[B

    .line 98
    .line 99
    iget-object v5, v1, Lxhss/ᛲᛳᲁᛳ;->ᛷᛵᛵᲈ:[B

    .line 100
    .line 101
    iget v6, v0, Lxhss/ᛲᛳᲁᛳ;->ᛱᛱᛲᲇ:I

    .line 102
    .line 103
    add-int v7, v6, v2

    .line 104
    .line 105
    invoke-static {v4, v5, v6, v7}, Lxhss/ᛲᛷᲁᲁ;->ᛸᛶᛴᲈ([B[BII)V

    .line 106
    .line 107
    .line 108
    :goto_3
    iget v4, v1, Lxhss/ᛲᛳᲁᛳ;->ᛱᛱᛲᲇ:I

    .line 109
    .line 110
    add-int/2addr v4, v2

    .line 111
    iput v4, v1, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 112
    .line 113
    iget v4, v0, Lxhss/ᛲᛳᲁᛳ;->ᛱᛱᛲᲇ:I

    .line 114
    .line 115
    add-int/2addr v4, v2

    .line 116
    iput v4, v0, Lxhss/ᛲᛳᲁᛳ;->ᛱᛱᛲᲇ:I

    .line 117
    .line 118
    iget-object v0, v0, Lxhss/ᛲᛳᲁᛳ;->ᲀᲇᛳᲁ:Lxhss/ᛲᛳᲁᛳ;

    .line 119
    .line 120
    invoke-virtual {v0, v1}, Lxhss/ᛲᛳᲁᛳ;->ᛱᛱᛲᲇ(Lxhss/ᛲᛳᲁᛳ;)V

    .line 121
    .line 122
    .line 123
    iput-object v1, p3, Lxhss/ᛴᛲᛴᛶ;->ᛱᛱᛲᲇ:Lxhss/ᛲᛳᲁᛳ;

    .line 124
    .line 125
    move-object v0, v1

    .line 126
    goto :goto_4

    .line 127
    :cond_4
    const-string p0, "byteCount out of range"

    .line 128
    .line 129
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᲀᲇᛳᲁ(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    return-void

    .line 133
    :cond_5
    :goto_4
    iget v1, v0, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 134
    .line 135
    iget v2, v0, Lxhss/ᛲᛳᲁᛳ;->ᛱᛱᛲᲇ:I

    .line 136
    .line 137
    sub-int/2addr v1, v2

    .line 138
    int-to-long v1, v1

    .line 139
    invoke-virtual {v0}, Lxhss/ᛲᛳᲁᛳ;->ᛷᛵᛵᲈ()Lxhss/ᛲᛳᲁᛳ;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    iput-object v4, p3, Lxhss/ᛴᛲᛴᛶ;->ᛱᛱᛲᲇ:Lxhss/ᛲᛳᲁᛳ;

    .line 144
    .line 145
    iget-object v4, p0, Lxhss/ᛴᛲᛴᛶ;->ᛱᛱᛲᲇ:Lxhss/ᛲᛳᲁᛳ;

    .line 146
    .line 147
    if-nez v4, :cond_6

    .line 148
    .line 149
    iput-object v0, p0, Lxhss/ᛴᛲᛴᛶ;->ᛱᛱᛲᲇ:Lxhss/ᛲᛳᲁᛳ;

    .line 150
    .line 151
    iput-object v0, v0, Lxhss/ᛲᛳᲁᛳ;->ᲀᲇᛳᲁ:Lxhss/ᛲᛳᲁᛳ;

    .line 152
    .line 153
    iput-object v0, v0, Lxhss/ᛲᛳᲁᛳ;->ᲇᛶᛴᲀ:Lxhss/ᛲᛳᲁᛳ;

    .line 154
    .line 155
    goto :goto_6

    .line 156
    :cond_6
    iget-object v4, v4, Lxhss/ᛲᛳᲁᛳ;->ᲀᲇᛳᲁ:Lxhss/ᛲᛳᲁᛳ;

    .line 157
    .line 158
    invoke-virtual {v4, v0}, Lxhss/ᛲᛳᲁᛳ;->ᛱᛱᛲᲇ(Lxhss/ᛲᛳᲁᛳ;)V

    .line 159
    .line 160
    .line 161
    iget-object v4, v0, Lxhss/ᛲᛳᲁᛳ;->ᲀᲇᛳᲁ:Lxhss/ᛲᛳᲁᛳ;

    .line 162
    .line 163
    if-eq v4, v0, :cond_a

    .line 164
    .line 165
    iget-boolean v5, v4, Lxhss/ᛲᛳᲁᛳ;->ᛷᛴᛷᛱ:Z

    .line 166
    .line 167
    if-nez v5, :cond_7

    .line 168
    .line 169
    goto :goto_6

    .line 170
    :cond_7
    iget v5, v0, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 171
    .line 172
    iget v6, v0, Lxhss/ᛲᛳᲁᛳ;->ᛱᛱᛲᲇ:I

    .line 173
    .line 174
    sub-int/2addr v5, v6

    .line 175
    iget v6, v4, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 176
    .line 177
    rsub-int v6, v6, 0x2000

    .line 178
    .line 179
    iget-boolean v7, v4, Lxhss/ᛲᛳᲁᛳ;->ᲇᛴᲇᛵ:Z

    .line 180
    .line 181
    if-eqz v7, :cond_8

    .line 182
    .line 183
    goto :goto_5

    .line 184
    :cond_8
    iget v3, v4, Lxhss/ᛲᛳᲁᛳ;->ᛱᛱᛲᲇ:I

    .line 185
    .line 186
    :goto_5
    add-int/2addr v6, v3

    .line 187
    if-le v5, v6, :cond_9

    .line 188
    .line 189
    goto :goto_6

    .line 190
    :cond_9
    invoke-virtual {v0, v4, v5}, Lxhss/ᛲᛳᲁᛳ;->ᲇᛴᲇᛵ(Lxhss/ᛲᛳᲁᛳ;I)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v0}, Lxhss/ᛲᛳᲁᛳ;->ᛷᛵᛵᲈ()Lxhss/ᛲᛳᲁᛳ;

    .line 194
    .line 195
    .line 196
    invoke-static {v0}, Lxhss/ᛲᛷᛲᲁ;->ᛷᛵᛵᲈ(Lxhss/ᛲᛳᲁᛳ;)V

    .line 197
    .line 198
    .line 199
    :goto_6
    iget-wide v3, p3, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 200
    .line 201
    sub-long/2addr v3, v1

    .line 202
    iput-wide v3, p3, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 203
    .line 204
    iget-wide v3, p0, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 205
    .line 206
    add-long/2addr v3, v1

    .line 207
    iput-wide v3, p0, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 208
    .line 209
    sub-long/2addr p1, v1

    .line 210
    goto/16 :goto_0

    .line 211
    .line 212
    :cond_a
    const-string p0, "cannot compact"

    .line 213
    .line 214
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᛶᲇᲈᛸ(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    :cond_b
    return-void

    .line 218
    :cond_c
    const-string p0, "source == this"

    .line 219
    .line 220
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᲀᲇᛳᲁ(Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    return-void
.end method

.method public final ᛷᛵᛵᲈ()Lxhss/ᛲᲁᲈᛲ;
    .locals 0

    .line 1
    sget-object p0, Lxhss/ᛲᲁᲈᛲ;->ᲇᛴᲇᛵ:Lxhss/ᛳᲁᲁᛲ;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᛷᲁᲁ()J
    .locals 15

    .line 1
    iget-wide v0, p0, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-eqz v0, :cond_9

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    move v1, v0

    .line 11
    move v6, v1

    .line 12
    move-wide v4, v2

    .line 13
    :cond_0
    iget-object v7, p0, Lxhss/ᛴᛲᛴᛶ;->ᛱᛱᛲᲇ:Lxhss/ᛲᛳᲁᛳ;

    .line 14
    .line 15
    iget-object v8, v7, Lxhss/ᛲᛳᲁᛳ;->ᛷᛵᛵᲈ:[B

    .line 16
    .line 17
    iget v9, v7, Lxhss/ᛲᛳᲁᛳ;->ᛱᛱᛲᲇ:I

    .line 18
    .line 19
    iget v10, v7, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 20
    .line 21
    :goto_0
    if-ge v9, v10, :cond_6

    .line 22
    .line 23
    aget-byte v11, v8, v9

    .line 24
    .line 25
    const/16 v12, 0x30

    .line 26
    .line 27
    if-lt v11, v12, :cond_1

    .line 28
    .line 29
    const/16 v12, 0x39

    .line 30
    .line 31
    if-gt v11, v12, :cond_1

    .line 32
    .line 33
    add-int/lit8 v12, v11, -0x30

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    const/16 v12, 0x61

    .line 37
    .line 38
    if-lt v11, v12, :cond_2

    .line 39
    .line 40
    const/16 v12, 0x66

    .line 41
    .line 42
    if-gt v11, v12, :cond_2

    .line 43
    .line 44
    add-int/lit8 v12, v11, -0x57

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_2
    const/16 v12, 0x41

    .line 48
    .line 49
    if-lt v11, v12, :cond_4

    .line 50
    .line 51
    const/16 v12, 0x46

    .line 52
    .line 53
    if-gt v11, v12, :cond_4

    .line 54
    .line 55
    add-int/lit8 v12, v11, -0x37

    .line 56
    .line 57
    :goto_1
    const-wide/high16 v13, -0x1000000000000000L    # -3.105036184601418E231

    .line 58
    .line 59
    and-long/2addr v13, v4

    .line 60
    cmp-long v13, v13, v2

    .line 61
    .line 62
    if-nez v13, :cond_3

    .line 63
    .line 64
    const/4 v11, 0x4

    .line 65
    shl-long/2addr v4, v11

    .line 66
    int-to-long v11, v12

    .line 67
    or-long/2addr v4, v11

    .line 68
    add-int/lit8 v9, v9, 0x1

    .line 69
    .line 70
    add-int/lit8 v1, v1, 0x1

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_3
    new-instance p0, Lxhss/ᛴᛲᛴᛶ;

    .line 74
    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0, v4, v5}, Lxhss/ᛴᛲᛴᛶ;->ᛱᛳᲁᲈ(J)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, v11}, Lxhss/ᛴᛲᛴᛶ;->ᲁᛴᲇᛲ(I)V

    .line 82
    .line 83
    .line 84
    new-instance v0, Ljava/lang/NumberFormatException;

    .line 85
    .line 86
    invoke-virtual {p0}, Lxhss/ᛴᛲᛴᛶ;->ᛶᲇᲈᛸ()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    const-string v1, "Number too large: "

    .line 91
    .line 92
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    invoke-direct {v0, p0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    throw v0

    .line 100
    :cond_4
    const/4 v6, 0x1

    .line 101
    if-eqz v1, :cond_5

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_5
    new-instance p0, Ljava/lang/NumberFormatException;

    .line 105
    .line 106
    sget-object v1, Lxhss/ᛷᛸᲀᲀ;->ᛱᛱᛲᲇ:[C

    .line 107
    .line 108
    shr-int/lit8 v2, v11, 0x4

    .line 109
    .line 110
    and-int/lit8 v2, v2, 0xf

    .line 111
    .line 112
    aget-char v2, v1, v2

    .line 113
    .line 114
    and-int/lit8 v3, v11, 0xf

    .line 115
    .line 116
    aget-char v1, v1, v3

    .line 117
    .line 118
    const/4 v3, 0x2

    .line 119
    new-array v3, v3, [C

    .line 120
    .line 121
    aput-char v2, v3, v0

    .line 122
    .line 123
    aput-char v1, v3, v6

    .line 124
    .line 125
    new-instance v0, Ljava/lang/String;

    .line 126
    .line 127
    invoke-direct {v0, v3}, Ljava/lang/String;-><init>([C)V

    .line 128
    .line 129
    .line 130
    const-string v1, "Expected leading [0-9a-fA-F] character but was 0x"

    .line 131
    .line 132
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-direct {p0, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    throw p0

    .line 140
    :cond_6
    :goto_2
    if-ne v9, v10, :cond_7

    .line 141
    .line 142
    invoke-virtual {v7}, Lxhss/ᛲᛳᲁᛳ;->ᛷᛵᛵᲈ()Lxhss/ᛲᛳᲁᛳ;

    .line 143
    .line 144
    .line 145
    move-result-object v8

    .line 146
    iput-object v8, p0, Lxhss/ᛴᛲᛴᛶ;->ᛱᛱᛲᲇ:Lxhss/ᛲᛳᲁᛳ;

    .line 147
    .line 148
    invoke-static {v7}, Lxhss/ᛲᛷᛲᲁ;->ᛷᛵᛵᲈ(Lxhss/ᛲᛳᲁᛳ;)V

    .line 149
    .line 150
    .line 151
    goto :goto_3

    .line 152
    :cond_7
    iput v9, v7, Lxhss/ᛲᛳᲁᛳ;->ᛱᛱᛲᲇ:I

    .line 153
    .line 154
    :goto_3
    if-nez v6, :cond_8

    .line 155
    .line 156
    iget-object v7, p0, Lxhss/ᛴᛲᛴᛶ;->ᛱᛱᛲᲇ:Lxhss/ᛲᛳᲁᛳ;

    .line 157
    .line 158
    if-nez v7, :cond_0

    .line 159
    .line 160
    :cond_8
    iget-wide v2, p0, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 161
    .line 162
    int-to-long v0, v1

    .line 163
    sub-long/2addr v2, v0

    .line 164
    iput-wide v2, p0, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 165
    .line 166
    return-wide v4

    .line 167
    :cond_9
    new-instance p0, Ljava/io/EOFException;

    .line 168
    .line 169
    invoke-direct {p0}, Ljava/io/EOFException;-><init>()V

    .line 170
    .line 171
    .line 172
    throw p0
.end method

.method public final ᛸᛲᛷᛱ(I)Lxhss/ᛳᛶᲈᲈ;
    .locals 7

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p0, Lxhss/ᛳᛶᲈᲈ;->ᛷᛴᛷᛱ:Lxhss/ᛳᛶᲈᲈ;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    iget-wide v0, p0, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 7
    .line 8
    const-wide/16 v2, 0x0

    .line 9
    .line 10
    int-to-long v4, p1

    .line 11
    invoke-static/range {v0 .. v5}, Lxhss/ᛷᛸᲀᲀ;->ᛸᛷᲈᲈ(JJJ)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lxhss/ᛴᛲᛴᛶ;->ᛱᛱᛲᲇ:Lxhss/ᛲᛳᲁᛳ;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    move v2, v1

    .line 18
    move v3, v2

    .line 19
    :goto_0
    if-ge v2, p1, :cond_2

    .line 20
    .line 21
    iget v4, v0, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 22
    .line 23
    iget v5, v0, Lxhss/ᛲᛳᲁᛳ;->ᛱᛱᛲᲇ:I

    .line 24
    .line 25
    if-eq v4, v5, :cond_1

    .line 26
    .line 27
    sub-int/2addr v4, v5

    .line 28
    add-int/2addr v2, v4

    .line 29
    add-int/lit8 v3, v3, 0x1

    .line 30
    .line 31
    iget-object v0, v0, Lxhss/ᛲᛳᲁᛳ;->ᲇᛶᛴᲀ:Lxhss/ᛲᛳᲁᛳ;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    new-instance p0, Ljava/lang/AssertionError;

    .line 35
    .line 36
    const-string p1, "s.limit == s.pos"

    .line 37
    .line 38
    invoke-direct {p0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    throw p0

    .line 42
    :cond_2
    new-array v0, v3, [[B

    .line 43
    .line 44
    mul-int/lit8 v2, v3, 0x2

    .line 45
    .line 46
    new-array v2, v2, [I

    .line 47
    .line 48
    iget-object p0, p0, Lxhss/ᛴᛲᛴᛶ;->ᛱᛱᛲᲇ:Lxhss/ᛲᛳᲁᛳ;

    .line 49
    .line 50
    move v4, v1

    .line 51
    :goto_1
    if-ge v1, p1, :cond_3

    .line 52
    .line 53
    iget-object v5, p0, Lxhss/ᛲᛳᲁᛳ;->ᛷᛵᛵᲈ:[B

    .line 54
    .line 55
    aput-object v5, v0, v4

    .line 56
    .line 57
    iget v5, p0, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 58
    .line 59
    iget v6, p0, Lxhss/ᛲᛳᲁᛳ;->ᛱᛱᛲᲇ:I

    .line 60
    .line 61
    sub-int/2addr v5, v6

    .line 62
    add-int/2addr v1, v5

    .line 63
    invoke-static {v1, p1}, Ljava/lang/Math;->min(II)I

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    aput v5, v2, v4

    .line 68
    .line 69
    add-int v5, v4, v3

    .line 70
    .line 71
    iget v6, p0, Lxhss/ᛲᛳᲁᛳ;->ᛱᛱᛲᲇ:I

    .line 72
    .line 73
    aput v6, v2, v5

    .line 74
    .line 75
    const/4 v5, 0x1

    .line 76
    iput-boolean v5, p0, Lxhss/ᛲᛳᲁᛳ;->ᲇᛴᲇᛵ:Z

    .line 77
    .line 78
    add-int/2addr v4, v5

    .line 79
    iget-object p0, p0, Lxhss/ᛲᛳᲁᛳ;->ᲇᛶᛴᲀ:Lxhss/ᛲᛳᲁᛳ;

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_3
    new-instance p0, Lxhss/ᛷᛷᛱᛵ;

    .line 83
    .line 84
    invoke-direct {p0, v0, v2}, Lxhss/ᛷᛷᛱᛵ;-><init>([[B[I)V

    .line 85
    .line 86
    .line 87
    return-object p0
.end method

.method public final ᛸᛲᲀᛵ(J)Lxhss/ᛳᛶᲈᲈ;
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
    iget-wide v0, p0, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 15
    .line 16
    cmp-long v0, v0, p1

    .line 17
    .line 18
    if-ltz v0, :cond_1

    .line 19
    .line 20
    const-wide/16 v0, 0x1000

    .line 21
    .line 22
    cmp-long v0, p1, v0

    .line 23
    .line 24
    if-ltz v0, :cond_0

    .line 25
    .line 26
    long-to-int v0, p1

    .line 27
    invoke-virtual {p0, v0}, Lxhss/ᛴᛲᛴᛶ;->ᛸᛲᛷᛱ(I)Lxhss/ᛳᛶᲈᲈ;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {p0, p1, p2}, Lxhss/ᛴᛲᛴᛶ;->ᛸᛶᛴᲈ(J)V

    .line 32
    .line 33
    .line 34
    return-object v0

    .line 35
    :cond_0
    new-instance v0, Lxhss/ᛳᛶᲈᲈ;

    .line 36
    .line 37
    invoke-virtual {p0, p1, p2}, Lxhss/ᛴᛲᛴᛶ;->ᲀᲇᛳᲁ(J)[B

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-direct {v0, p0}, Lxhss/ᛳᛶᲈᲈ;-><init>([B)V

    .line 42
    .line 43
    .line 44
    return-object v0

    .line 45
    :cond_1
    new-instance p0, Ljava/io/EOFException;

    .line 46
    .line 47
    invoke-direct {p0}, Ljava/io/EOFException;-><init>()V

    .line 48
    .line 49
    .line 50
    throw p0

    .line 51
    :cond_2
    const-string p0, "byteCount: "

    .line 52
    .line 53
    invoke-static {p0, p1, p2}, Lxhss/ᛵᲈᲁᲈ;->ᛷᲁᲁ(Ljava/lang/String;J)V

    .line 54
    .line 55
    .line 56
    const/4 p0, 0x0

    .line 57
    return-object p0
.end method

.method public final ᛸᛴᛶᛳ(JLxhss/ᛴᛲᛴᛶ;)J
    .locals 4

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v2, p1, v0

    .line 4
    .line 5
    if-ltz v2, :cond_2

    .line 6
    .line 7
    iget-wide v2, p0, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 8
    .line 9
    cmp-long v0, v2, v0

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    const-wide/16 p0, -0x1

    .line 14
    .line 15
    return-wide p0

    .line 16
    :cond_0
    cmp-long v0, p1, v2

    .line 17
    .line 18
    if-lez v0, :cond_1

    .line 19
    .line 20
    move-wide p1, v2

    .line 21
    :cond_1
    invoke-virtual {p3, p1, p2, p0}, Lxhss/ᛴᛲᛴᛶ;->ᛷᛴᛷᛱ(JLxhss/ᛴᛲᛴᛶ;)V

    .line 22
    .line 23
    .line 24
    return-wide p1

    .line 25
    :cond_2
    const-string p0, "byteCount < 0: "

    .line 26
    .line 27
    invoke-static {p0, p1, p2}, Lxhss/ᛵᲈᲁᲈ;->ᛷᲁᲁ(Ljava/lang/String;J)V

    .line 28
    .line 29
    .line 30
    return-wide v0
.end method

.method public final ᛸᛶᛴᲈ(J)V
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
    iget-object v0, p0, Lxhss/ᛴᛲᛴᛶ;->ᛱᛱᛲᲇ:Lxhss/ᛲᛳᲁᛳ;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget v1, v0, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 12
    .line 13
    iget v2, v0, Lxhss/ᛲᛳᲁᛳ;->ᛱᛱᛲᲇ:I

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
    iget-wide v2, p0, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 23
    .line 24
    int-to-long v4, v1

    .line 25
    sub-long/2addr v2, v4

    .line 26
    iput-wide v2, p0, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 27
    .line 28
    sub-long/2addr p1, v4

    .line 29
    iget v2, v0, Lxhss/ᛲᛳᲁᛳ;->ᛱᛱᛲᲇ:I

    .line 30
    .line 31
    add-int/2addr v2, v1

    .line 32
    iput v2, v0, Lxhss/ᛲᛳᲁᛳ;->ᛱᛱᛲᲇ:I

    .line 33
    .line 34
    iget v1, v0, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 35
    .line 36
    if-ne v2, v1, :cond_0

    .line 37
    .line 38
    invoke-virtual {v0}, Lxhss/ᛲᛳᲁᛳ;->ᛷᛵᛵᲈ()Lxhss/ᛲᛳᲁᛳ;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    iput-object v1, p0, Lxhss/ᛴᛲᛴᛶ;->ᛱᛱᛲᲇ:Lxhss/ᛲᛳᲁᛳ;

    .line 43
    .line 44
    invoke-static {v0}, Lxhss/ᛲᛷᛲᲁ;->ᛷᛵᛵᲈ(Lxhss/ᛲᛳᲁᛳ;)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    new-instance p0, Ljava/io/EOFException;

    .line 49
    .line 50
    invoke-direct {p0}, Ljava/io/EOFException;-><init>()V

    .line 51
    .line 52
    .line 53
    throw p0

    .line 54
    :cond_2
    return-void
.end method

.method public final ᛸᛶᲈᛶ()I
    .locals 11

    .line 1
    iget-wide v0, p0, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 2
    .line 3
    const-wide/16 v2, 0x4

    .line 4
    .line 5
    cmp-long v4, v0, v2

    .line 6
    .line 7
    if-ltz v4, :cond_2

    .line 8
    .line 9
    iget-object v4, p0, Lxhss/ᛴᛲᛴᛶ;->ᛱᛱᛲᲇ:Lxhss/ᛲᛳᲁᛳ;

    .line 10
    .line 11
    iget v5, v4, Lxhss/ᛲᛳᲁᛳ;->ᛱᛱᛲᲇ:I

    .line 12
    .line 13
    iget v6, v4, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 14
    .line 15
    sub-int v7, v6, v5

    .line 16
    .line 17
    int-to-long v7, v7

    .line 18
    cmp-long v7, v7, v2

    .line 19
    .line 20
    if-gez v7, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0}, Lxhss/ᛴᛲᛴᛶ;->ᲇᛴᲇᛵ()B

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    and-int/lit16 v0, v0, 0xff

    .line 27
    .line 28
    shl-int/lit8 v0, v0, 0x18

    .line 29
    .line 30
    invoke-virtual {p0}, Lxhss/ᛴᛲᛴᛶ;->ᲇᛴᲇᛵ()B

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    and-int/lit16 v1, v1, 0xff

    .line 35
    .line 36
    shl-int/lit8 v1, v1, 0x10

    .line 37
    .line 38
    or-int/2addr v0, v1

    .line 39
    invoke-virtual {p0}, Lxhss/ᛴᛲᛴᛶ;->ᲇᛴᲇᛵ()B

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    and-int/lit16 v1, v1, 0xff

    .line 44
    .line 45
    shl-int/lit8 v1, v1, 0x8

    .line 46
    .line 47
    or-int/2addr v0, v1

    .line 48
    invoke-virtual {p0}, Lxhss/ᛴᛲᛴᛶ;->ᲇᛴᲇᛵ()B

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    and-int/lit16 p0, p0, 0xff

    .line 53
    .line 54
    or-int/2addr p0, v0

    .line 55
    return p0

    .line 56
    :cond_0
    iget-object v7, v4, Lxhss/ᛲᛳᲁᛳ;->ᛷᛵᛵᲈ:[B

    .line 57
    .line 58
    add-int/lit8 v8, v5, 0x1

    .line 59
    .line 60
    aget-byte v9, v7, v5

    .line 61
    .line 62
    and-int/lit16 v9, v9, 0xff

    .line 63
    .line 64
    shl-int/lit8 v9, v9, 0x18

    .line 65
    .line 66
    add-int/lit8 v10, v5, 0x2

    .line 67
    .line 68
    aget-byte v8, v7, v8

    .line 69
    .line 70
    and-int/lit16 v8, v8, 0xff

    .line 71
    .line 72
    shl-int/lit8 v8, v8, 0x10

    .line 73
    .line 74
    or-int/2addr v8, v9

    .line 75
    add-int/lit8 v9, v5, 0x3

    .line 76
    .line 77
    aget-byte v10, v7, v10

    .line 78
    .line 79
    and-int/lit16 v10, v10, 0xff

    .line 80
    .line 81
    shl-int/lit8 v10, v10, 0x8

    .line 82
    .line 83
    or-int/2addr v8, v10

    .line 84
    add-int/lit8 v5, v5, 0x4

    .line 85
    .line 86
    aget-byte v7, v7, v9

    .line 87
    .line 88
    and-int/lit16 v7, v7, 0xff

    .line 89
    .line 90
    or-int/2addr v7, v8

    .line 91
    sub-long/2addr v0, v2

    .line 92
    iput-wide v0, p0, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 93
    .line 94
    if-ne v5, v6, :cond_1

    .line 95
    .line 96
    invoke-virtual {v4}, Lxhss/ᛲᛳᲁᛳ;->ᛷᛵᛵᲈ()Lxhss/ᛲᛳᲁᛳ;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    iput-object v0, p0, Lxhss/ᛴᛲᛴᛶ;->ᛱᛱᛲᲇ:Lxhss/ᛲᛳᲁᛳ;

    .line 101
    .line 102
    invoke-static {v4}, Lxhss/ᛲᛷᛲᲁ;->ᛷᛵᛵᲈ(Lxhss/ᛲᛳᲁᛳ;)V

    .line 103
    .line 104
    .line 105
    return v7

    .line 106
    :cond_1
    iput v5, v4, Lxhss/ᛲᛳᲁᛳ;->ᛱᛱᛲᲇ:I

    .line 107
    .line 108
    return v7

    .line 109
    :cond_2
    new-instance p0, Ljava/io/EOFException;

    .line 110
    .line 111
    invoke-direct {p0}, Ljava/io/EOFException;-><init>()V

    .line 112
    .line 113
    .line 114
    throw p0
.end method

.method public final bridge synthetic ᛸᛷᲈᲈ(Ljava/lang/String;)Lxhss/ᲈᛳᲈᲀ;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lxhss/ᛴᛲᛴᛶ;->ᛲᛴᲇᛲ(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-object p0
.end method

.method public final ᲀᛷᲁᲀ(J)V
    .locals 11

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
    invoke-virtual {p0, p1}, Lxhss/ᛴᛲᛴᛶ;->ᲁᛴᲇᛲ(I)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x1

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
    invoke-virtual {p0, p1}, Lxhss/ᛴᛲᛴᛶ;->ᛲᛴᲇᛲ(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    move v2, v4

    .line 29
    goto :goto_0

    .line 30
    :cond_2
    move v2, v3

    .line 31
    :goto_0
    sget-object v5, Lxhss/ᛱᛱᛲᲇ;->ᛷᛵᛵᲈ:[B

    .line 32
    .line 33
    invoke-static {p1, p2}, Ljava/lang/Long;->numberOfLeadingZeros(J)I

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    rsub-int/lit8 v5, v5, 0x40

    .line 38
    .line 39
    mul-int/lit8 v5, v5, 0xa

    .line 40
    .line 41
    ushr-int/lit8 v5, v5, 0x5

    .line 42
    .line 43
    sget-object v6, Lxhss/ᛱᛱᛲᲇ;->ᛱᛱᛲᲇ:[J

    .line 44
    .line 45
    aget-wide v6, v6, v5

    .line 46
    .line 47
    cmp-long v6, p1, v6

    .line 48
    .line 49
    if-lez v6, :cond_3

    .line 50
    .line 51
    move v3, v4

    .line 52
    :cond_3
    add-int/2addr v5, v3

    .line 53
    if-eqz v2, :cond_4

    .line 54
    .line 55
    add-int/lit8 v5, v5, 0x1

    .line 56
    .line 57
    :cond_4
    invoke-virtual {p0, v5}, Lxhss/ᛴᛲᛴᛶ;->ᛴᲈᛱᛴ(I)Lxhss/ᛲᛳᲁᛳ;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    iget-object v4, v3, Lxhss/ᛲᛳᲁᛳ;->ᛷᛵᛵᲈ:[B

    .line 62
    .line 63
    iget v6, v3, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 64
    .line 65
    add-int/2addr v6, v5

    .line 66
    :goto_1
    cmp-long v7, p1, v0

    .line 67
    .line 68
    if-eqz v7, :cond_5

    .line 69
    .line 70
    const-wide/16 v7, 0xa

    .line 71
    .line 72
    rem-long v9, p1, v7

    .line 73
    .line 74
    long-to-int v9, v9

    .line 75
    add-int/lit8 v6, v6, -0x1

    .line 76
    .line 77
    sget-object v10, Lxhss/ᛱᛱᛲᲇ;->ᛷᛵᛵᲈ:[B

    .line 78
    .line 79
    aget-byte v9, v10, v9

    .line 80
    .line 81
    aput-byte v9, v4, v6

    .line 82
    .line 83
    div-long/2addr p1, v7

    .line 84
    goto :goto_1

    .line 85
    :cond_5
    if-eqz v2, :cond_6

    .line 86
    .line 87
    add-int/lit8 v6, v6, -0x1

    .line 88
    .line 89
    const/16 p1, 0x2d

    .line 90
    .line 91
    aput-byte p1, v4, v6

    .line 92
    .line 93
    :cond_6
    iget p1, v3, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 94
    .line 95
    add-int/2addr p1, v5

    .line 96
    iput p1, v3, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 97
    .line 98
    iget-wide p1, p0, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 99
    .line 100
    int-to-long v0, v5

    .line 101
    add-long/2addr p1, v0

    .line 102
    iput-wide p1, p0, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 103
    .line 104
    return-void
.end method

.method public final ᲀᲇᛳᲁ(J)[B
    .locals 3

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
    const-wide/32 v0, 0x7fffffff

    .line 8
    .line 9
    .line 10
    cmp-long v0, p1, v0

    .line 11
    .line 12
    if-gtz v0, :cond_3

    .line 13
    .line 14
    iget-wide v0, p0, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 15
    .line 16
    cmp-long v0, v0, p1

    .line 17
    .line 18
    if-ltz v0, :cond_2

    .line 19
    .line 20
    long-to-int p1, p1

    .line 21
    new-array p2, p1, [B

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    :goto_0
    if-ge v0, p1, :cond_1

    .line 25
    .line 26
    sub-int v1, p1, v0

    .line 27
    .line 28
    invoke-virtual {p0, p2, v0, v1}, Lxhss/ᛴᛲᛴᛶ;->read([BII)I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    const/4 v2, -0x1

    .line 33
    if-eq v1, v2, :cond_0

    .line 34
    .line 35
    add-int/2addr v0, v1

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    new-instance p0, Ljava/io/EOFException;

    .line 38
    .line 39
    invoke-direct {p0}, Ljava/io/EOFException;-><init>()V

    .line 40
    .line 41
    .line 42
    throw p0

    .line 43
    :cond_1
    return-object p2

    .line 44
    :cond_2
    new-instance p0, Ljava/io/EOFException;

    .line 45
    .line 46
    invoke-direct {p0}, Ljava/io/EOFException;-><init>()V

    .line 47
    .line 48
    .line 49
    throw p0

    .line 50
    :cond_3
    const-string p0, "byteCount: "

    .line 51
    .line 52
    invoke-static {p0, p1, p2}, Lxhss/ᛵᲈᲁᲈ;->ᛷᲁᲁ(Ljava/lang/String;J)V

    .line 53
    .line 54
    .line 55
    const/4 p0, 0x0

    .line 56
    return-object p0
.end method

.method public final ᲁᛲᛴᛴ([BI)V
    .locals 9

    .line 1
    array-length v0, p1

    .line 2
    int-to-long v1, v0

    .line 3
    int-to-long v5, p2

    .line 4
    const-wide/16 v3, 0x0

    .line 5
    .line 6
    invoke-static/range {v1 .. v6}, Lxhss/ᛷᛸᲀᲀ;->ᛸᛷᲈᲈ(JJJ)V

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    :goto_0
    if-ge v0, p2, :cond_0

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-virtual {p0, v1}, Lxhss/ᛴᛲᛴᛶ;->ᛴᲈᛱᛴ(I)Lxhss/ᛲᛳᲁᛳ;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    sub-int v2, p2, v0

    .line 18
    .line 19
    iget v3, v1, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 20
    .line 21
    rsub-int v3, v3, 0x2000

    .line 22
    .line 23
    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    iget-object v3, v1, Lxhss/ᛲᛳᲁᛳ;->ᛷᛵᛵᲈ:[B

    .line 28
    .line 29
    iget v4, v1, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 30
    .line 31
    add-int v7, v0, v2

    .line 32
    .line 33
    sub-int v8, v7, v0

    .line 34
    .line 35
    invoke-static {p1, v0, v3, v4, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 36
    .line 37
    .line 38
    iget v0, v1, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 39
    .line 40
    add-int/2addr v0, v2

    .line 41
    iput v0, v1, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 42
    .line 43
    move v0, v7

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    iget-wide p1, p0, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 46
    .line 47
    add-long/2addr p1, v5

    .line 48
    iput-wide p1, p0, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 49
    .line 50
    return-void
.end method

.method public final ᲁᛴᲇᛲ(I)V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lxhss/ᛴᛲᛴᛶ;->ᛴᲈᛱᛴ(I)Lxhss/ᛲᛳᲁᛳ;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    iget-object v1, v0, Lxhss/ᛲᛳᲁᛳ;->ᛷᛵᛵᲈ:[B

    .line 7
    .line 8
    iget v2, v0, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 9
    .line 10
    add-int/lit8 v3, v2, 0x1

    .line 11
    .line 12
    iput v3, v0, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 13
    .line 14
    int-to-byte p1, p1

    .line 15
    aput-byte p1, v1, v2

    .line 16
    .line 17
    iget-wide v0, p0, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 18
    .line 19
    const-wide/16 v2, 0x1

    .line 20
    .line 21
    add-long/2addr v0, v2

    .line 22
    iput-wide v0, p0, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 23
    .line 24
    return-void
.end method

.method public final ᲁᲁᛴᲁ(Ljava/lang/String;II)V
    .locals 9

    .line 1
    if-ltz p2, :cond_a

    .line 2
    .line 3
    if-lt p3, p2, :cond_9

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-gt p3, v0, :cond_8

    .line 10
    .line 11
    :goto_0
    if-ge p2, p3, :cond_7

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/16 v1, 0x80

    .line 18
    .line 19
    if-ge v0, v1, :cond_1

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    invoke-virtual {p0, v2}, Lxhss/ᛴᛲᛴᛶ;->ᛴᲈᛱᛴ(I)Lxhss/ᛲᛳᲁᛳ;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    iget-object v3, v2, Lxhss/ᛲᛳᲁᛳ;->ᛷᛵᛵᲈ:[B

    .line 27
    .line 28
    iget v4, v2, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 29
    .line 30
    sub-int/2addr v4, p2

    .line 31
    rsub-int v5, v4, 0x2000

    .line 32
    .line 33
    invoke-static {p3, v5}, Ljava/lang/Math;->min(II)I

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    add-int/lit8 v6, p2, 0x1

    .line 38
    .line 39
    add-int/2addr p2, v4

    .line 40
    int-to-byte v0, v0

    .line 41
    aput-byte v0, v3, p2

    .line 42
    .line 43
    :goto_1
    move p2, v6

    .line 44
    if-ge p2, v5, :cond_0

    .line 45
    .line 46
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-ge v0, v1, :cond_0

    .line 51
    .line 52
    add-int/lit8 v6, p2, 0x1

    .line 53
    .line 54
    add-int/2addr p2, v4

    .line 55
    int-to-byte v0, v0

    .line 56
    aput-byte v0, v3, p2

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_0
    add-int/2addr v4, p2

    .line 60
    iget v0, v2, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 61
    .line 62
    sub-int/2addr v4, v0

    .line 63
    add-int/2addr v0, v4

    .line 64
    iput v0, v2, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 65
    .line 66
    iget-wide v0, p0, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 67
    .line 68
    int-to-long v2, v4

    .line 69
    add-long/2addr v0, v2

    .line 70
    iput-wide v0, p0, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_1
    const/16 v2, 0x800

    .line 74
    .line 75
    if-ge v0, v2, :cond_2

    .line 76
    .line 77
    const/4 v2, 0x2

    .line 78
    invoke-virtual {p0, v2}, Lxhss/ᛴᛲᛴᛶ;->ᛴᲈᛱᛴ(I)Lxhss/ᛲᛳᲁᛳ;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    iget-object v4, v3, Lxhss/ᛲᛳᲁᛳ;->ᛷᛵᛵᲈ:[B

    .line 83
    .line 84
    iget v5, v3, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 85
    .line 86
    shr-int/lit8 v6, v0, 0x6

    .line 87
    .line 88
    or-int/lit16 v6, v6, 0xc0

    .line 89
    .line 90
    int-to-byte v6, v6

    .line 91
    aput-byte v6, v4, v5

    .line 92
    .line 93
    add-int/lit8 v6, v5, 0x1

    .line 94
    .line 95
    and-int/lit8 v0, v0, 0x3f

    .line 96
    .line 97
    or-int/2addr v0, v1

    .line 98
    int-to-byte v0, v0

    .line 99
    aput-byte v0, v4, v6

    .line 100
    .line 101
    add-int/2addr v5, v2

    .line 102
    iput v5, v3, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 103
    .line 104
    iget-wide v0, p0, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 105
    .line 106
    const-wide/16 v2, 0x2

    .line 107
    .line 108
    add-long/2addr v0, v2

    .line 109
    iput-wide v0, p0, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 110
    .line 111
    :goto_2
    add-int/lit8 p2, p2, 0x1

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_2
    const v2, 0xd800

    .line 115
    .line 116
    .line 117
    const/16 v3, 0x3f

    .line 118
    .line 119
    if-lt v0, v2, :cond_6

    .line 120
    .line 121
    const v2, 0xdfff

    .line 122
    .line 123
    .line 124
    if-le v0, v2, :cond_3

    .line 125
    .line 126
    goto :goto_4

    .line 127
    :cond_3
    add-int/lit8 v2, p2, 0x1

    .line 128
    .line 129
    if-ge v2, p3, :cond_4

    .line 130
    .line 131
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    .line 132
    .line 133
    .line 134
    move-result v4

    .line 135
    goto :goto_3

    .line 136
    :cond_4
    const/4 v4, 0x0

    .line 137
    :goto_3
    const v5, 0xdbff

    .line 138
    .line 139
    .line 140
    if-gt v0, v5, :cond_5

    .line 141
    .line 142
    const v5, 0xdc00

    .line 143
    .line 144
    .line 145
    if-gt v5, v4, :cond_5

    .line 146
    .line 147
    const v5, 0xe000

    .line 148
    .line 149
    .line 150
    if-ge v4, v5, :cond_5

    .line 151
    .line 152
    and-int/lit16 v0, v0, 0x3ff

    .line 153
    .line 154
    shl-int/lit8 v0, v0, 0xa

    .line 155
    .line 156
    and-int/lit16 v2, v4, 0x3ff

    .line 157
    .line 158
    or-int/2addr v0, v2

    .line 159
    const/high16 v2, 0x10000

    .line 160
    .line 161
    add-int/2addr v0, v2

    .line 162
    const/4 v2, 0x4

    .line 163
    invoke-virtual {p0, v2}, Lxhss/ᛴᛲᛴᛶ;->ᛴᲈᛱᛴ(I)Lxhss/ᛲᛳᲁᛳ;

    .line 164
    .line 165
    .line 166
    move-result-object v4

    .line 167
    iget-object v5, v4, Lxhss/ᛲᛳᲁᛳ;->ᛷᛵᛵᲈ:[B

    .line 168
    .line 169
    iget v6, v4, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 170
    .line 171
    shr-int/lit8 v7, v0, 0x12

    .line 172
    .line 173
    or-int/lit16 v7, v7, 0xf0

    .line 174
    .line 175
    int-to-byte v7, v7

    .line 176
    aput-byte v7, v5, v6

    .line 177
    .line 178
    add-int/lit8 v7, v6, 0x1

    .line 179
    .line 180
    shr-int/lit8 v8, v0, 0xc

    .line 181
    .line 182
    and-int/2addr v8, v3

    .line 183
    or-int/2addr v8, v1

    .line 184
    int-to-byte v8, v8

    .line 185
    aput-byte v8, v5, v7

    .line 186
    .line 187
    add-int/lit8 v7, v6, 0x2

    .line 188
    .line 189
    shr-int/lit8 v8, v0, 0x6

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
    add-int/lit8 v7, v6, 0x3

    .line 197
    .line 198
    and-int/2addr v0, v3

    .line 199
    or-int/2addr v0, v1

    .line 200
    int-to-byte v0, v0

    .line 201
    aput-byte v0, v5, v7

    .line 202
    .line 203
    add-int/2addr v6, v2

    .line 204
    iput v6, v4, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 205
    .line 206
    iget-wide v0, p0, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 207
    .line 208
    const-wide/16 v2, 0x4

    .line 209
    .line 210
    add-long/2addr v0, v2

    .line 211
    iput-wide v0, p0, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 212
    .line 213
    add-int/lit8 p2, p2, 0x2

    .line 214
    .line 215
    goto/16 :goto_0

    .line 216
    .line 217
    :cond_5
    invoke-virtual {p0, v3}, Lxhss/ᛴᛲᛴᛶ;->ᲁᛴᲇᛲ(I)V

    .line 218
    .line 219
    .line 220
    move p2, v2

    .line 221
    goto/16 :goto_0

    .line 222
    .line 223
    :cond_6
    :goto_4
    const/4 v2, 0x3

    .line 224
    invoke-virtual {p0, v2}, Lxhss/ᛴᛲᛴᛶ;->ᛴᲈᛱᛴ(I)Lxhss/ᛲᛳᲁᛳ;

    .line 225
    .line 226
    .line 227
    move-result-object v4

    .line 228
    iget-object v5, v4, Lxhss/ᛲᛳᲁᛳ;->ᛷᛵᛵᲈ:[B

    .line 229
    .line 230
    iget v6, v4, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 231
    .line 232
    shr-int/lit8 v7, v0, 0xc

    .line 233
    .line 234
    or-int/lit16 v7, v7, 0xe0

    .line 235
    .line 236
    int-to-byte v7, v7

    .line 237
    aput-byte v7, v5, v6

    .line 238
    .line 239
    add-int/lit8 v7, v6, 0x1

    .line 240
    .line 241
    shr-int/lit8 v8, v0, 0x6

    .line 242
    .line 243
    and-int/2addr v3, v8

    .line 244
    or-int/2addr v3, v1

    .line 245
    int-to-byte v3, v3

    .line 246
    aput-byte v3, v5, v7

    .line 247
    .line 248
    add-int/lit8 v3, v6, 0x2

    .line 249
    .line 250
    and-int/lit8 v0, v0, 0x3f

    .line 251
    .line 252
    or-int/2addr v0, v1

    .line 253
    int-to-byte v0, v0

    .line 254
    aput-byte v0, v5, v3

    .line 255
    .line 256
    add-int/2addr v6, v2

    .line 257
    iput v6, v4, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 258
    .line 259
    iget-wide v0, p0, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 260
    .line 261
    const-wide/16 v2, 0x3

    .line 262
    .line 263
    add-long/2addr v0, v2

    .line 264
    iput-wide v0, p0, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 265
    .line 266
    goto/16 :goto_2

    .line 267
    .line 268
    :cond_7
    return-void

    .line 269
    :cond_8
    const-string p0, " > "

    .line 270
    .line 271
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 272
    .line 273
    .line 274
    move-result p1

    .line 275
    const-string p2, "endIndex > string.length: "

    .line 276
    .line 277
    invoke-static {p2, p3, p0, p1}, Lxhss/ᛵᲈᲁᲈ;->ᲈᛳᲀ(Ljava/lang/String;ILjava/lang/Object;I)V

    .line 278
    .line 279
    .line 280
    return-void

    .line 281
    :cond_9
    const-string p0, "endIndex < beginIndex: "

    .line 282
    .line 283
    const-string p1, " < "

    .line 284
    .line 285
    invoke-static {p3, p2, p0, p1}, Lxhss/ᛴᛸᛲᛳ;->ᛸᛶᲈᛶ(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object p0

    .line 289
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᛱᛱᛲᲇ(Ljava/lang/Object;)V

    .line 290
    .line 291
    .line 292
    return-void

    .line 293
    :cond_a
    const-string p0, "beginIndex < 0: "

    .line 294
    .line 295
    invoke-static {p0, p2}, Lxhss/ᛴᛸᛲᛳ;->ᛶᲇᲈᛸ(Ljava/lang/String;I)Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object p0

    .line 299
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᛱᛱᛲᲇ(Ljava/lang/Object;)V

    .line 300
    .line 301
    .line 302
    return-void
.end method

.method public final ᲇᛴᲇᛵ()B
    .locals 9

    .line 1
    iget-wide v0, p0, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v2, v0, v2

    .line 6
    .line 7
    if-eqz v2, :cond_1

    .line 8
    .line 9
    iget-object v2, p0, Lxhss/ᛴᛲᛴᛶ;->ᛱᛱᛲᲇ:Lxhss/ᛲᛳᲁᛳ;

    .line 10
    .line 11
    iget v3, v2, Lxhss/ᛲᛳᲁᛳ;->ᛱᛱᛲᲇ:I

    .line 12
    .line 13
    iget v4, v2, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 14
    .line 15
    iget-object v5, v2, Lxhss/ᛲᛳᲁᛳ;->ᛷᛵᛵᲈ:[B

    .line 16
    .line 17
    add-int/lit8 v6, v3, 0x1

    .line 18
    .line 19
    aget-byte v3, v5, v3

    .line 20
    .line 21
    const-wide/16 v7, 0x1

    .line 22
    .line 23
    sub-long/2addr v0, v7

    .line 24
    iput-wide v0, p0, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 25
    .line 26
    if-ne v6, v4, :cond_0

    .line 27
    .line 28
    invoke-virtual {v2}, Lxhss/ᛲᛳᲁᛳ;->ᛷᛵᛵᲈ()Lxhss/ᛲᛳᲁᛳ;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iput-object v0, p0, Lxhss/ᛴᛲᛴᛶ;->ᛱᛱᛲᲇ:Lxhss/ᛲᛳᲁᛳ;

    .line 33
    .line 34
    invoke-static {v2}, Lxhss/ᛲᛷᛲᲁ;->ᛷᛵᛵᲈ(Lxhss/ᛲᛳᲁᛳ;)V

    .line 35
    .line 36
    .line 37
    return v3

    .line 38
    :cond_0
    iput v6, v2, Lxhss/ᛲᛳᲁᛳ;->ᛱᛱᛲᲇ:I

    .line 39
    .line 40
    return v3

    .line 41
    :cond_1
    new-instance p0, Ljava/io/EOFException;

    .line 42
    .line 43
    invoke-direct {p0}, Ljava/io/EOFException;-><init>()V

    .line 44
    .line 45
    .line 46
    throw p0
.end method

.method public final ᲇᛶᛴᲀ()[B
    .locals 2

    .line 1
    iget-wide v0, p0, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 2
    .line 3
    invoke-virtual {p0, v0, v1}, Lxhss/ᛴᛲᛴᛶ;->ᲀᲇᛳᲁ(J)[B

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final ᲇᛸᛳᲁ()S
    .locals 11

    .line 1
    iget-wide v0, p0, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 2
    .line 3
    const-wide/16 v2, 0x2

    .line 4
    .line 5
    cmp-long v4, v0, v2

    .line 6
    .line 7
    if-ltz v4, :cond_2

    .line 8
    .line 9
    iget-object v4, p0, Lxhss/ᛴᛲᛴᛶ;->ᛱᛱᛲᲇ:Lxhss/ᛲᛳᲁᛳ;

    .line 10
    .line 11
    iget v5, v4, Lxhss/ᛲᛳᲁᛳ;->ᛱᛱᛲᲇ:I

    .line 12
    .line 13
    iget v6, v4, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 14
    .line 15
    sub-int v7, v6, v5

    .line 16
    .line 17
    const/4 v8, 0x2

    .line 18
    if-ge v7, v8, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0}, Lxhss/ᛴᛲᛴᛶ;->ᲇᛴᲇᛵ()B

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    and-int/lit16 v0, v0, 0xff

    .line 25
    .line 26
    shl-int/lit8 v0, v0, 0x8

    .line 27
    .line 28
    invoke-virtual {p0}, Lxhss/ᛴᛲᛴᛶ;->ᲇᛴᲇᛵ()B

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    and-int/lit16 p0, p0, 0xff

    .line 33
    .line 34
    or-int/2addr p0, v0

    .line 35
    int-to-short p0, p0

    .line 36
    return p0

    .line 37
    :cond_0
    iget-object v7, v4, Lxhss/ᛲᛳᲁᛳ;->ᛷᛵᛵᲈ:[B

    .line 38
    .line 39
    add-int/lit8 v9, v5, 0x1

    .line 40
    .line 41
    aget-byte v10, v7, v5

    .line 42
    .line 43
    and-int/lit16 v10, v10, 0xff

    .line 44
    .line 45
    shl-int/lit8 v10, v10, 0x8

    .line 46
    .line 47
    add-int/2addr v5, v8

    .line 48
    aget-byte v7, v7, v9

    .line 49
    .line 50
    and-int/lit16 v7, v7, 0xff

    .line 51
    .line 52
    or-int/2addr v7, v10

    .line 53
    sub-long/2addr v0, v2

    .line 54
    iput-wide v0, p0, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 55
    .line 56
    if-ne v5, v6, :cond_1

    .line 57
    .line 58
    invoke-virtual {v4}, Lxhss/ᛲᛳᲁᛳ;->ᛷᛵᛵᲈ()Lxhss/ᛲᛳᲁᛳ;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    iput-object v0, p0, Lxhss/ᛴᛲᛴᛶ;->ᛱᛱᛲᲇ:Lxhss/ᛲᛳᲁᛳ;

    .line 63
    .line 64
    invoke-static {v4}, Lxhss/ᛲᛷᛲᲁ;->ᛷᛵᛵᲈ(Lxhss/ᛲᛳᲁᛳ;)V

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    iput v5, v4, Lxhss/ᛲᛳᲁᛳ;->ᛱᛱᛲᲇ:I

    .line 69
    .line 70
    :goto_0
    int-to-short p0, v7

    .line 71
    return p0

    .line 72
    :cond_2
    new-instance p0, Ljava/io/EOFException;

    .line 73
    .line 74
    invoke-direct {p0}, Ljava/io/EOFException;-><init>()V

    .line 75
    .line 76
    .line 77
    throw p0
.end method

.method public final ᲈᛲᛵᲁ(Lxhss/ᲇᲁᲀᲇ;)V
    .locals 4

    .line 1
    :goto_0
    const-wide/16 v0, 0x2000

    .line 2
    .line 3
    invoke-interface {p1, v0, v1, p0}, Lxhss/ᲇᲁᲀᲇ;->ᛸᛴᛶᛳ(JLxhss/ᛴᛲᛴᛶ;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    const-wide/16 v2, -0x1

    .line 8
    .line 9
    cmp-long v0, v0, v2

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    return-void
.end method

.method public final ᲈᛳᲀ()Ljava/io/InputStream;
    .locals 2

    .line 1
    new-instance v0, Lxhss/ᲀᲈᲈ;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lxhss/ᲀᲈᲈ;-><init>(Lxhss/ᲀᛶᛷᛳ;I)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method
