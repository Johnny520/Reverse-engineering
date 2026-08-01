.class public final L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言楪子兰哲世苏/飘花落叶言子楪世苏哲兰;
.implements L飘花落叶言楪子兰哲世苏/飘花落叶言子楪世苏兰哲;


# instance fields
.field public final synthetic 飘花落叶言子楪世哲兰苏:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

.field public final 飘花落叶言子楪世哲苏兰:I

.field public final 飘花落叶言子楪世苏兰哲:Ljava/nio/ByteBuffer;

.field public final 飘花落叶言子楪世苏哲兰:Ljava/lang/String;


# direct methods
.method public constructor <init>(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;Ljava/lang/String;Ljava/nio/ByteBuffer;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲兰苏:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 5
    .line 6
    iput-object p2, p0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:Ljava/nio/ByteBuffer;

    .line 9
    .line 10
    invoke-virtual {p3}, Ljava/nio/Buffer;->position()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    iput p1, p0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲苏兰:I

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final readByte()B
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final write([B)V
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final writeByte(I)V
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    int-to-byte p1, p1

    .line 4
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final writeInt(I)V
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final 飘花落叶言子楪世兰哲苏()I
    .locals 1

    .line 1
    iget-object v0, p0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget p0, p0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲苏兰:I

    .line 8
    .line 9
    sub-int/2addr v0, p0

    .line 10
    return v0
.end method

.method public final 飘花落叶言子楪世兰苏哲()I
    .locals 1

    .line 1
    iget-object p0, p0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getShort()S

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    const v0, 0xffff

    .line 8
    .line 9
    .line 10
    and-int/2addr p0, v0

    .line 11
    return p0
.end method

.method public final 飘花落叶言子楪世哲兰苏()L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰苏世哲;
    .locals 5

    .line 1
    iget-object v0, p0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    sget-object v1, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏哲兰世:[S

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    new-array v2, v1, [S

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    :goto_0
    if-ge v3, v1, :cond_1

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getShort()S

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    aput-short v4, v2, v3

    .line 22
    .line 23
    add-int/lit8 v3, v3, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    move-object v1, v2

    .line 27
    :goto_1
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    add-int/lit8 v2, v2, 0x3

    .line 32
    .line 33
    and-int/lit8 v2, v2, -0x4

    .line 34
    .line 35
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 40
    .line 41
    new-instance v0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰苏世哲;

    .line 42
    .line 43
    iget-object p0, p0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲兰苏:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 44
    .line 45
    invoke-direct {v0, p0, v1}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪兰苏世哲;-><init>(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;[S)V

    .line 46
    .line 47
    .line 48
    return-object v0
.end method

.method public final 飘花落叶言子楪世哲苏兰()Ljava/lang/String;
    .locals 7

    .line 1
    const-string v0, "Declared length "

    .line 2
    .line 3
    iget-object v1, p0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    invoke-virtual {v1}, Ljava/nio/Buffer;->position()I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    invoke-virtual {v1}, Ljava/nio/Buffer;->limit()I

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Ljava/nio/ByteBuffer;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/nio/Buffer;->capacity()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, Ljava/nio/ByteBuffer;

    .line 32
    .line 33
    :try_start_0
    invoke-static {p0}, Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰哲世苏(L飘花落叶言楪子兰哲世苏/飘花落叶言子楪世苏哲兰;)I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    new-array v5, v2, [C

    .line 38
    .line 39
    invoke-static {p0, v5}, Lcom/bumptech/glide/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世哲兰(L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;[C)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 44
    .line 45
    .line 46
    move-result v5
    :try_end_0
    .catch Ljava/io/UTFDataFormatException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    if-ne v5, v2, :cond_0

    .line 48
    .line 49
    invoke-virtual {v1, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 54
    .line 55
    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 60
    .line 61
    return-object p0

    .line 62
    :cond_0
    :try_start_1
    new-instance v5, Lcom/android/dex/DexException;

    .line 63
    .line 64
    new-instance v6, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    invoke-direct {v6, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string v0, " doesn\'t match decoded length of "

    .line 73
    .line 74
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    invoke-virtual {v6, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-direct {v5, p0}, Lcom/android/dex/DexException;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    throw v5
    :try_end_1
    .catch Ljava/io/UTFDataFormatException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 92
    :catchall_0
    move-exception p0

    .line 93
    goto :goto_0

    .line 94
    :catch_0
    move-exception p0

    .line 95
    :try_start_2
    new-instance v0, Lcom/android/dex/DexException;

    .line 96
    .line 97
    invoke-direct {v0, p0}, Lcom/android/dex/DexException;-><init>(Ljava/lang/Throwable;)V

    .line 98
    .line 99
    .line 100
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 101
    :goto_0
    invoke-virtual {v1, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 106
    .line 107
    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 112
    .line 113
    throw p0
.end method

.method public final 飘花落叶言子楪世苏兰哲(I)[L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世哲兰苏;
    .locals 6

    .line 1
    new-array v0, p1, [L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世哲兰苏;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    move v2, v1

    .line 5
    :goto_0
    if-ge v1, p1, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰哲世苏(L飘花落叶言楪子兰哲世苏/飘花落叶言子楪世苏哲兰;)I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    add-int/2addr v2, v3

    .line 12
    invoke-static {p0}, Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰哲世苏(L飘花落叶言楪子兰哲世苏/飘花落叶言子楪世苏哲兰;)I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    invoke-static {p0}, Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰哲世苏(L飘花落叶言楪子兰哲世苏/飘花落叶言子楪世苏哲兰;)I

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    new-instance v5, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世哲兰苏;

    .line 21
    .line 22
    invoke-direct {v5, v2, v3, v4}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪世哲兰苏;-><init>(III)V

    .line 23
    .line 24
    .line 25
    aput-object v5, v0, v1

    .line 26
    .line 27
    add-int/lit8 v1, v1, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    return-object v0
.end method

.method public final 飘花落叶言子楪世苏哲兰()V
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    and-int/lit8 p0, p0, 0x3

    .line 8
    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const-string p0, "Not four byte aligned!"

    .line 13
    .line 14
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final 飘花落叶言子楪苏世兰哲(I)V
    .locals 3

    .line 1
    :try_start_0
    invoke-static {p0, p1}, Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;->飘花落叶言子世哲楪苏兰(L飘花落叶言楪子兰哲世苏/飘花落叶言子楪世苏兰哲;I)V
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2
    .line 3
    .line 4
    return-void

    .line 5
    :catch_0
    new-instance p1, Lcom/android/dex/DexException;

    .line 6
    .line 7
    iget-object v0, p0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:Ljava/nio/ByteBuffer;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v2, "Section limit "

    .line 16
    .line 17
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v0, " exceeded by "

    .line 24
    .line 25
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object p0, p0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-direct {p1, p0}, Lcom/android/dex/DexException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw p1
.end method

.method public final 飘花落叶言子楪苏世哲兰(S)V
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final 飘花落叶言子楪苏哲世兰(I)V
    .locals 3

    .line 1
    :try_start_0
    invoke-static {p0, p1}, Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;->飘花落叶言子世哲楪兰苏(L飘花落叶言楪子兰哲世苏/飘花落叶言子楪世苏兰哲;I)V
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2
    .line 3
    .line 4
    return-void

    .line 5
    :catch_0
    new-instance p1, Lcom/android/dex/DexException;

    .line 6
    .line 7
    iget-object v0, p0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:Ljava/nio/ByteBuffer;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v2, "Section limit "

    .line 16
    .line 17
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v0, " exceeded by "

    .line 24
    .line 25
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object p0, p0, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-direct {p1, p0}, Lcom/android/dex/DexException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw p1
.end method

.method public final 飘花落叶言子楪苏哲兰世(I)V
    .locals 2

    .line 1
    int-to-short v0, p1

    .line 2
    const v1, 0xffff

    .line 3
    .line 4
    .line 5
    and-int/2addr v1, v0

    .line 6
    if-ne p1, v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, v0}, L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏世哲兰(S)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const-string p0, "Expected an unsigned short: "

    .line 13
    .line 14
    invoke-static {p1, p0}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(ILjava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method
