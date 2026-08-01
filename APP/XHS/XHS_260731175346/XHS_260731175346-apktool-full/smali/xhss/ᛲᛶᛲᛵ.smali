.class public abstract Lxhss/ᛲᛶᛲᛵ;
.super Lxhss/ᛶᛵᛱ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    return p0

    .line 5
    :cond_0
    if-eqz p1, :cond_2

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    check-cast p1, Lxhss/ᛲᛶᛲᛵ;

    .line 23
    .line 24
    invoke-virtual {p0}, Lxhss/ᛲᛶᛲᛵ;->ᛵᛲᲁᛶ()[B

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p1}, Lxhss/ᛲᛶᛲᛵ;->ᛵᛲᲁᛶ()[B

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([B[B)Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    return p0

    .line 37
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 38
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    invoke-virtual {p0}, Lxhss/ᛲᛶᛲᛵ;->ᛵᛲᲁᛶ()[B

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    array-length v0, p0

    .line 6
    const v1, -0x7ee3623b

    .line 7
    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_0
    if-ge v2, v0, :cond_0

    .line 11
    .line 12
    aget-byte v3, p0, v2

    .line 13
    .line 14
    and-int/lit16 v3, v3, 0xff

    .line 15
    .line 16
    xor-int/2addr v1, v3

    .line 17
    const v3, 0x1000193

    .line 18
    .line 19
    .line 20
    mul-int/2addr v1, v3

    .line 21
    add-int/lit8 v2, v2, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    return v1
.end method

.method public final ᛵᛲᲁᛶ()[B
    .locals 3

    .line 1
    new-instance v0, Lxhss/ᛱᲁᛴᲈ;

    .line 2
    .line 3
    invoke-direct {v0}, Lxhss/ᛱᲁᛴᲈ;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lxhss/ᛶᛵᛱ;->ᛸᛶᲈᛶ(Lxhss/ᛱᲁᛴᲈ;)I

    .line 7
    .line 8
    .line 9
    iget p0, v0, Lxhss/ᛱᲁᛴᲈ;->ᛱᛱᛲᲇ:I

    .line 10
    .line 11
    iget-object v1, v0, Lxhss/ᛱᲁᛴᲈ;->ᛷᛵᛵᲈ:Ljava/nio/ByteBuffer;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/nio/Buffer;->capacity()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    iget v2, v0, Lxhss/ᛱᲁᛴᲈ;->ᛱᛱᛲᲇ:I

    .line 18
    .line 19
    sub-int/2addr v1, v2

    .line 20
    iget-boolean v2, v0, Lxhss/ᛱᲁᛴᲈ;->ᲀᲇᛳᲁ:Z

    .line 21
    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    new-array v1, v1, [B

    .line 25
    .line 26
    iget-object v2, v0, Lxhss/ᛱᲁᛴᲈ;->ᛷᛵᛵᲈ:Ljava/nio/ByteBuffer;

    .line 27
    .line 28
    invoke-virtual {v2, p0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 29
    .line 30
    .line 31
    iget-object p0, v0, Lxhss/ᛱᲁᛴᲈ;->ᛷᛵᛵᲈ:Ljava/nio/ByteBuffer;

    .line 32
    .line 33
    invoke-virtual {p0, v1}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 34
    .line 35
    .line 36
    return-object v1

    .line 37
    :cond_0
    new-instance p0, Ljava/lang/AssertionError;

    .line 38
    .line 39
    const-string v0, "FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish()."

    .line 40
    .line 41
    invoke-direct {p0, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    throw p0
.end method
