.class public final Lcom/google/protobuf/飘花落叶言世子苏兰哲楪;
.super Ljava/io/InputStream;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public 飘花落叶言子楪兰世哲苏:I

.field public 飘花落叶言子楪兰世苏哲:I

.field public 飘花落叶言子楪兰哲世苏:I

.field public 飘花落叶言子楪兰哲苏世:J

.field public 飘花落叶言子楪兰苏世哲:Z

.field public 飘花落叶言子楪兰苏哲世:[B

.field public 飘花落叶言子楪哲兰世苏:Ljava/nio/ByteBuffer;

.field public 飘花落叶言子楪哲兰苏世:I

.field public 飘花落叶言子楪哲苏兰世:Ljava/util/Iterator;


# virtual methods
.method public final read()I
    .locals 6

    .line 64
    iget v0, p0, Lcom/google/protobuf/飘花落叶言世子苏兰哲楪;->飘花落叶言子楪兰世苏哲:I

    iget v1, p0, Lcom/google/protobuf/飘花落叶言世子苏兰哲楪;->飘花落叶言子楪哲兰苏世:I

    if-ne v0, v1, :cond_0

    const/4 p0, -0x1

    return p0

    .line 65
    :cond_0
    iget-boolean v0, p0, Lcom/google/protobuf/飘花落叶言世子苏兰哲楪;->飘花落叶言子楪兰苏世哲:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    .line 66
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言世子苏兰哲楪;->飘花落叶言子楪兰苏哲世:[B

    iget v2, p0, Lcom/google/protobuf/飘花落叶言世子苏兰哲楪;->飘花落叶言子楪兰世哲苏:I

    iget v3, p0, Lcom/google/protobuf/飘花落叶言世子苏兰哲楪;->飘花落叶言子楪兰哲世苏:I

    add-int/2addr v2, v3

    aget-byte v0, v0, v2

    and-int/lit16 v0, v0, 0xff

    .line 67
    invoke-virtual {p0, v1}, Lcom/google/protobuf/飘花落叶言世子苏兰哲楪;->飘花落叶言子楪世哲苏兰(I)V

    return v0

    .line 68
    :cond_1
    iget v0, p0, Lcom/google/protobuf/飘花落叶言世子苏兰哲楪;->飘花落叶言子楪兰世哲苏:I

    int-to-long v2, v0

    iget-wide v4, p0, Lcom/google/protobuf/飘花落叶言世子苏兰哲楪;->飘花落叶言子楪兰哲苏世:J

    add-long/2addr v2, v4

    .line 69
    sget-object v0, Lcom/google/protobuf/飘花落叶言苏楪世子兰哲;->飘花落叶言子楪世哲苏兰:Lcom/google/protobuf/飘花落叶言苏楪世子哲兰;

    invoke-virtual {v0, v2, v3}, Lcom/google/protobuf/飘花落叶言苏楪世子哲兰;->飘花落叶言子楪世哲兰苏(J)B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    .line 70
    invoke-virtual {p0, v1}, Lcom/google/protobuf/飘花落叶言世子苏兰哲楪;->飘花落叶言子楪世哲苏兰(I)V

    return v0
.end method

.method public final read([BII)I
    .locals 3

    .line 1
    iget v0, p0, Lcom/google/protobuf/飘花落叶言世子苏兰哲楪;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    iget v1, p0, Lcom/google/protobuf/飘花落叶言世子苏兰哲楪;->飘花落叶言子楪哲兰苏世:I

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    const/4 p0, -0x1

    .line 8
    return p0

    .line 9
    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言世子苏兰哲楪;->飘花落叶言子楪哲兰世苏:Ljava/nio/ByteBuffer;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iget v1, p0, Lcom/google/protobuf/飘花落叶言世子苏兰哲楪;->飘花落叶言子楪兰世哲苏:I

    .line 16
    .line 17
    sub-int/2addr v0, v1

    .line 18
    if-le p3, v0, :cond_1

    .line 19
    .line 20
    move p3, v0

    .line 21
    :cond_1
    iget-boolean v0, p0, Lcom/google/protobuf/飘花落叶言世子苏兰哲楪;->飘花落叶言子楪兰苏世哲:Z

    .line 22
    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言世子苏兰哲楪;->飘花落叶言子楪兰苏哲世:[B

    .line 26
    .line 27
    iget v2, p0, Lcom/google/protobuf/飘花落叶言世子苏兰哲楪;->飘花落叶言子楪兰哲世苏:I

    .line 28
    .line 29
    add-int/2addr v1, v2

    .line 30
    invoke-static {v0, v1, p1, p2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, p3}, Lcom/google/protobuf/飘花落叶言世子苏兰哲楪;->飘花落叶言子楪世哲苏兰(I)V

    .line 34
    .line 35
    .line 36
    return p3

    .line 37
    :cond_2
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言世子苏兰哲楪;->飘花落叶言子楪哲兰世苏:Ljava/nio/ByteBuffer;

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    iget-object v1, p0, Lcom/google/protobuf/飘花落叶言世子苏兰哲楪;->飘花落叶言子楪哲兰世苏:Ljava/nio/ByteBuffer;

    .line 44
    .line 45
    iget v2, p0, Lcom/google/protobuf/飘花落叶言世子苏兰哲楪;->飘花落叶言子楪兰世哲苏:I

    .line 46
    .line 47
    invoke-virtual {v1, v2}, Ljava/nio/Buffer;->position(I)Ljava/nio/Buffer;

    .line 48
    .line 49
    .line 50
    iget-object v1, p0, Lcom/google/protobuf/飘花落叶言世子苏兰哲楪;->飘花落叶言子楪哲兰世苏:Ljava/nio/ByteBuffer;

    .line 51
    .line 52
    invoke-virtual {v1, p1, p2, p3}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 53
    .line 54
    .line 55
    iget-object p1, p0, Lcom/google/protobuf/飘花落叶言世子苏兰哲楪;->飘花落叶言子楪哲兰世苏:Ljava/nio/ByteBuffer;

    .line 56
    .line 57
    invoke-virtual {p1, v0}, Ljava/nio/Buffer;->position(I)Ljava/nio/Buffer;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, p3}, Lcom/google/protobuf/飘花落叶言世子苏兰哲楪;->飘花落叶言子楪世哲苏兰(I)V

    .line 61
    .line 62
    .line 63
    return p3
.end method

.method public final 飘花落叶言子楪世哲苏兰(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/飘花落叶言世子苏兰哲楪;->飘花落叶言子楪兰世哲苏:I

    .line 2
    .line 3
    add-int/2addr v0, p1

    .line 4
    iput v0, p0, Lcom/google/protobuf/飘花落叶言世子苏兰哲楪;->飘花落叶言子楪兰世哲苏:I

    .line 5
    .line 6
    iget-object p1, p0, Lcom/google/protobuf/飘花落叶言世子苏兰哲楪;->飘花落叶言子楪哲兰世苏:Ljava/nio/ByteBuffer;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-ne v0, p1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言世子苏兰哲楪;->飘花落叶言子楪世苏兰哲()Z

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final 飘花落叶言子楪世苏兰哲()Z
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言世子苏兰哲楪;->飘花落叶言子楪哲苏兰世:Ljava/util/Iterator;

    .line 2
    .line 3
    :cond_0
    iget v1, p0, Lcom/google/protobuf/飘花落叶言世子苏兰哲楪;->飘花落叶言子楪兰世苏哲:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    add-int/2addr v1, v2

    .line 7
    iput v1, p0, Lcom/google/protobuf/飘花落叶言世子苏兰哲楪;->飘花落叶言子楪兰世苏哲:I

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v3, 0x0

    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    return v3

    .line 17
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Ljava/nio/ByteBuffer;

    .line 22
    .line 23
    iput-object v1, p0, Lcom/google/protobuf/飘花落叶言世子苏兰哲楪;->飘花落叶言子楪哲兰世苏:Ljava/nio/ByteBuffer;

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言世子苏兰哲楪;->飘花落叶言子楪哲兰世苏:Ljava/nio/ByteBuffer;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    iput v0, p0, Lcom/google/protobuf/飘花落叶言世子苏兰哲楪;->飘花落叶言子楪兰世哲苏:I

    .line 38
    .line 39
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言世子苏兰哲楪;->飘花落叶言子楪哲兰世苏:Ljava/nio/ByteBuffer;

    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->hasArray()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    iput-boolean v2, p0, Lcom/google/protobuf/飘花落叶言世子苏兰哲楪;->飘花落叶言子楪兰苏世哲:Z

    .line 48
    .line 49
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言世子苏兰哲楪;->飘花落叶言子楪哲兰世苏:Ljava/nio/ByteBuffer;

    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iput-object v0, p0, Lcom/google/protobuf/飘花落叶言世子苏兰哲楪;->飘花落叶言子楪兰苏哲世:[B

    .line 56
    .line 57
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言世子苏兰哲楪;->飘花落叶言子楪哲兰世苏:Ljava/nio/ByteBuffer;

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->arrayOffset()I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    iput v0, p0, Lcom/google/protobuf/飘花落叶言世子苏兰哲楪;->飘花落叶言子楪兰哲世苏:I

    .line 64
    .line 65
    return v2

    .line 66
    :cond_2
    iput-boolean v3, p0, Lcom/google/protobuf/飘花落叶言世子苏兰哲楪;->飘花落叶言子楪兰苏世哲:Z

    .line 67
    .line 68
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言世子苏兰哲楪;->飘花落叶言子楪哲兰世苏:Ljava/nio/ByteBuffer;

    .line 69
    .line 70
    sget-object v1, Lcom/google/protobuf/飘花落叶言苏楪世子兰哲;->飘花落叶言子楪世哲苏兰:Lcom/google/protobuf/飘花落叶言苏楪世子哲兰;

    .line 71
    .line 72
    sget-wide v3, Lcom/google/protobuf/飘花落叶言苏楪世子兰哲;->飘花落叶言子楪苏世哲兰:J

    .line 73
    .line 74
    invoke-virtual {v1, v0, v3, v4}, Lcom/google/protobuf/飘花落叶言苏楪世子哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/Object;J)J

    .line 75
    .line 76
    .line 77
    move-result-wide v0

    .line 78
    iput-wide v0, p0, Lcom/google/protobuf/飘花落叶言世子苏兰哲楪;->飘花落叶言子楪兰哲苏世:J

    .line 79
    .line 80
    const/4 v0, 0x0

    .line 81
    iput-object v0, p0, Lcom/google/protobuf/飘花落叶言世子苏兰哲楪;->飘花落叶言子楪兰苏哲世:[B

    .line 82
    .line 83
    return v2
.end method
