.class public final L飘花落叶言苏楪子哲世兰/飘花落叶言子楪世苏兰哲;
.super L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public 飘花落叶言子楪世哲兰苏:I

.field public 飘花落叶言子楪世哲苏兰:I


# virtual methods
.method public final 飘花落叶言子世苏兰哲楪(Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;)I
    .locals 5

    .line 1
    iget v0, p0, L飘花落叶言苏楪子哲世兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:I

    .line 2
    .line 3
    iget p0, p0, L飘花落叶言苏楪子哲世兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏:I

    .line 4
    .line 5
    const/4 v1, 0x2

    .line 6
    invoke-virtual {p1, v1}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏世兰(I)V

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x4

    .line 10
    const/4 v2, 0x0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1, v1, v2}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲世苏兰(II)V

    .line 14
    .line 15
    .line 16
    iget-object v3, p1, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/nio/ByteBuffer;

    .line 17
    .line 18
    iget v4, p1, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:I

    .line 19
    .line 20
    sub-int/2addr v4, v1

    .line 21
    iput v4, p1, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:I

    .line 22
    .line 23
    invoke-virtual {v3, v4, p0}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 24
    .line 25
    .line 26
    const/4 p0, 0x1

    .line 27
    invoke-virtual {p1, p0}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲世兰苏(I)V

    .line 28
    .line 29
    .line 30
    :cond_0
    if-eqz v0, :cond_1

    .line 31
    .line 32
    invoke-virtual {p1, v1, v2}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲世苏兰(II)V

    .line 33
    .line 34
    .line 35
    iget-object p0, p1, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/nio/ByteBuffer;

    .line 36
    .line 37
    iget v3, p1, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:I

    .line 38
    .line 39
    sub-int/2addr v3, v1

    .line 40
    iput v3, p1, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:I

    .line 41
    .line 42
    invoke-virtual {p0, v3, v0}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, v2}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲世兰苏(I)V

    .line 46
    .line 47
    .line 48
    :cond_1
    invoke-virtual {p1}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲世兰()I

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    invoke-virtual {p1, p0}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏兰世哲(I)V

    .line 53
    .line 54
    .line 55
    return p0
.end method
