.class public abstract Lcom/google/flatbuffers/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected bb:Ljava/nio/ByteBuffer;

.field protected bb_pos:I

.field utf8:Lcom/google/flatbuffers/e;

.field private vtable_size:I

.field private vtable_start:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/google/flatbuffers/e;->a:Lcom/google/flatbuffers/g;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/flatbuffers/g;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/flatbuffers/e;->a:Lcom/google/flatbuffers/g;

    :cond_0
    sget-object v0, Lcom/google/flatbuffers/e;->a:Lcom/google/flatbuffers/g;

    iput-object v0, p0, Lcom/google/flatbuffers/d;->utf8:Lcom/google/flatbuffers/e;

    return-void
.end method

.method public static __has_identifier(Ljava/nio/ByteBuffer;Ljava/lang/String;)Z
    .locals 5

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_2

    const/4 v0, 0x0

    move v2, v0

    :goto_0
    if-ge v2, v1, :cond_1

    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    move-result v4

    add-int/2addr v4, v1

    add-int/2addr v4, v2

    invoke-virtual {p0, v4}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v4

    int-to-char v4, v4

    if-eq v3, v4, :cond_0

    return v0

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x1

    return p0

    :cond_2
    new-instance p0, Ljava/lang/AssertionError;

    const-string p1, "FlatBuffers: file identifier must be length 4"

    invoke-direct {p0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p0
.end method

.method public static __indirect(ILjava/nio/ByteBuffer;)I
    .locals 0

    .line 2
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result p1

    add-int/2addr p1, p0

    return p1
.end method

.method public static __offset(IILjava/nio/ByteBuffer;)I
    .locals 1

    .line 2
    invoke-virtual {p2}, Ljava/nio/Buffer;->capacity()I

    move-result v0

    sub-int/2addr v0, p1

    add-int/2addr p0, v0

    .line 3
    invoke-virtual {p2, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result p1

    sub-int/2addr p0, p1

    invoke-virtual {p2, p0}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result p0

    add-int/2addr p0, v0

    return p0
.end method

.method public static __string(ILjava/nio/ByteBuffer;Lcom/google/flatbuffers/e;)Ljava/lang/String;
    .locals 12

    .line 2
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    add-int/2addr v0, p0

    .line 3
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result p0

    add-int/lit8 v0, v0, 0x4

    .line 4
    check-cast p2, Lcom/google/flatbuffers/g;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->hasArray()Z

    move-result p2

    const/16 v1, -0x10

    const/16 v2, -0x20

    const-string v3, "Invalid UTF-8"

    const/4 v4, 0x0

    if-eqz p2, :cond_c

    .line 6
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p2

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result p1

    add-int/2addr p1, v0

    or-int v0, p1, p0

    .line 7
    array-length v5, p2

    sub-int/2addr v5, p1

    sub-int/2addr v5, p0

    or-int/2addr v0, v5

    if-ltz v0, :cond_b

    add-int v0, p1, p0

    .line 8
    new-array p0, p0, [C

    move v5, v4

    :goto_0
    if-ge p1, v0, :cond_1

    .line 9
    aget-byte v6, p2, p1

    .line 10
    invoke-static {v6}, LU/S;->G(B)Z

    move-result v7

    if-nez v7, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 p1, p1, 0x1

    add-int/lit8 v7, v5, 0x1

    int-to-char v6, v6

    .line 11
    aput-char v6, p0, v5

    move v5, v7

    goto :goto_0

    :cond_1
    :goto_1
    move v11, v5

    :goto_2
    if-ge p1, v0, :cond_a

    add-int/lit8 v5, p1, 0x1

    .line 12
    aget-byte v6, p2, p1

    .line 13
    invoke-static {v6}, LU/S;->G(B)Z

    move-result v7

    if-eqz v7, :cond_4

    add-int/lit8 p1, v11, 0x1

    int-to-char v6, v6

    .line 14
    aput-char v6, p0, v11

    :goto_3
    if-ge v5, v0, :cond_3

    .line 15
    aget-byte v6, p2, v5

    .line 16
    invoke-static {v6}, LU/S;->G(B)Z

    move-result v7

    if-nez v7, :cond_2

    goto :goto_4

    :cond_2
    add-int/lit8 v5, v5, 0x1

    add-int/lit8 v7, p1, 0x1

    int-to-char v6, v6

    .line 17
    aput-char v6, p0, p1

    move p1, v7

    goto :goto_3

    :cond_3
    :goto_4
    move v11, p1

    move p1, v5

    goto :goto_2

    :cond_4
    if-ge v6, v2, :cond_6

    if-ge v5, v0, :cond_5

    add-int/lit8 p1, p1, 0x2

    .line 18
    aget-byte v5, p2, v5

    add-int/lit8 v7, v11, 0x1

    invoke-static {v6, v5, p0, v11}, LU/S;->C(BB[CI)V

    move v11, v7

    goto :goto_2

    .line 19
    :cond_5
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    if-ge v6, v1, :cond_8

    add-int/lit8 v7, v0, -0x1

    if-ge v5, v7, :cond_7

    add-int/lit8 v7, p1, 0x2

    .line 20
    aget-byte v5, p2, v5

    add-int/lit8 p1, p1, 0x3

    aget-byte v7, p2, v7

    add-int/lit8 v8, v11, 0x1

    invoke-static {v6, v5, v7, p0, v11}, LU/S;->B(BBB[CI)V

    move v11, v8

    goto :goto_2

    .line 21
    :cond_7
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_8
    add-int/lit8 v7, v0, -0x2

    if-ge v5, v7, :cond_9

    add-int/lit8 v7, p1, 0x2

    .line 22
    aget-byte v8, p2, v5

    add-int/lit8 v5, p1, 0x3

    aget-byte v7, p2, v7

    add-int/lit8 p1, p1, 0x4

    aget-byte v9, p2, v5

    move v5, v6

    move v6, v8

    move v8, v9

    move-object v9, p0

    move v10, v11

    invoke-static/range {v5 .. v10}, LU/S;->A(BBBB[CI)V

    add-int/lit8 v11, v11, 0x2

    goto :goto_2

    .line 23
    :cond_9
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 24
    :cond_a
    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, p0, v4, v11}, Ljava/lang/String;-><init>([CII)V

    goto/16 :goto_a

    .line 25
    :cond_b
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    array-length p2, p2

    .line 26
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {p2, p1, p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string p1, "buffer length=%d, index=%d, size=%d"

    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    or-int p2, v0, p0

    .line 27
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    move-result v5

    sub-int/2addr v5, v0

    sub-int/2addr v5, p0

    or-int/2addr p2, v5

    if-ltz p2, :cond_18

    add-int p2, v0, p0

    .line 28
    new-array p0, p0, [C

    move v5, v4

    :goto_5
    if-ge v0, p2, :cond_e

    .line 29
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v6

    .line 30
    invoke-static {v6}, LU/S;->G(B)Z

    move-result v7

    if-nez v7, :cond_d

    goto :goto_6

    :cond_d
    add-int/lit8 v0, v0, 0x1

    add-int/lit8 v7, v5, 0x1

    int-to-char v6, v6

    .line 31
    aput-char v6, p0, v5

    move v5, v7

    goto :goto_5

    :cond_e
    :goto_6
    move v11, v5

    :goto_7
    if-ge v0, p2, :cond_17

    add-int/lit8 v5, v0, 0x1

    .line 32
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v6

    .line 33
    invoke-static {v6}, LU/S;->G(B)Z

    move-result v7

    if-eqz v7, :cond_11

    add-int/lit8 v0, v11, 0x1

    int-to-char v6, v6

    .line 34
    aput-char v6, p0, v11

    :goto_8
    if-ge v5, p2, :cond_10

    .line 35
    invoke-virtual {p1, v5}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v6

    .line 36
    invoke-static {v6}, LU/S;->G(B)Z

    move-result v7

    if-nez v7, :cond_f

    goto :goto_9

    :cond_f
    add-int/lit8 v5, v5, 0x1

    add-int/lit8 v7, v0, 0x1

    int-to-char v6, v6

    .line 37
    aput-char v6, p0, v0

    move v0, v7

    goto :goto_8

    :cond_10
    :goto_9
    move v11, v0

    move v0, v5

    goto :goto_7

    :cond_11
    if-ge v6, v2, :cond_13

    if-ge v5, p2, :cond_12

    add-int/lit8 v0, v0, 0x2

    .line 38
    invoke-virtual {p1, v5}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v5

    add-int/lit8 v7, v11, 0x1

    .line 39
    invoke-static {v6, v5, p0, v11}, LU/S;->C(BB[CI)V

    move v11, v7

    goto :goto_7

    .line 40
    :cond_12
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_13
    if-ge v6, v1, :cond_15

    add-int/lit8 v7, p2, -0x1

    if-ge v5, v7, :cond_14

    add-int/lit8 v7, v0, 0x2

    .line 41
    invoke-virtual {p1, v5}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v5

    add-int/lit8 v0, v0, 0x3

    .line 42
    invoke-virtual {p1, v7}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v7

    add-int/lit8 v8, v11, 0x1

    .line 43
    invoke-static {v6, v5, v7, p0, v11}, LU/S;->B(BBB[CI)V

    move v11, v8

    goto :goto_7

    .line 44
    :cond_14
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_15
    add-int/lit8 v7, p2, -0x2

    if-ge v5, v7, :cond_16

    add-int/lit8 v7, v0, 0x2

    .line 45
    invoke-virtual {p1, v5}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v8

    add-int/lit8 v5, v0, 0x3

    .line 46
    invoke-virtual {p1, v7}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v7

    add-int/lit8 v0, v0, 0x4

    .line 47
    invoke-virtual {p1, v5}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v9

    move v5, v6

    move v6, v8

    move v8, v9

    move-object v9, p0

    move v10, v11

    .line 48
    invoke-static/range {v5 .. v10}, LU/S;->A(BBBB[CI)V

    add-int/lit8 v11, v11, 0x2

    goto/16 :goto_7

    .line 49
    :cond_16
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 50
    :cond_17
    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, p0, v4, v11}, Ljava/lang/String;-><init>([CII)V

    :goto_a
    return-object p1

    .line 51
    :cond_18
    new-instance p2, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 52
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    .line 53
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {p1, v0, p0}, [Ljava/lang/Object;

    move-result-object p0

    .line 54
    const-string p1, "buffer limit=%d, index=%d, limit=%d"

    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p2, p0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public static __union(Lcom/google/flatbuffers/d;ILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/d;
    .locals 0

    .line 2
    invoke-static {p1, p2}, Lcom/google/flatbuffers/d;->__indirect(ILjava/nio/ByteBuffer;)I

    move-result p1

    invoke-virtual {p0, p1, p2}, Lcom/google/flatbuffers/d;->__reset(ILjava/nio/ByteBuffer;)V

    return-object p0
.end method

.method public static compareStrings(IILjava/nio/ByteBuffer;)I
    .locals 8

    .line 1
    invoke-virtual {p2, p0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    add-int/2addr v0, p0

    .line 2
    invoke-virtual {p2, p1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result p0

    add-int/2addr p0, p1

    .line 3
    invoke-virtual {p2, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result p1

    .line 4
    invoke-virtual {p2, p0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v1

    add-int/lit8 v0, v0, 0x4

    add-int/lit8 p0, p0, 0x4

    .line 5
    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    add-int v4, v3, v0

    .line 6
    invoke-virtual {p2, v4}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v5

    add-int v6, v3, p0

    invoke-virtual {p2, v6}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v7

    if-eq v5, v7, :cond_0

    .line 7
    invoke-virtual {p2, v4}, Ljava/nio/ByteBuffer;->get(I)B

    move-result p0

    invoke-virtual {p2, v6}, Ljava/nio/ByteBuffer;->get(I)B

    move-result p1

    sub-int/2addr p0, p1

    return p0

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    sub-int/2addr p1, v1

    return p1
.end method

.method public static compareStrings(I[BLjava/nio/ByteBuffer;)I
    .locals 7

    .line 8
    invoke-virtual {p2, p0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    add-int/2addr v0, p0

    .line 9
    invoke-virtual {p2, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result p0

    .line 10
    array-length v1, p1

    add-int/lit8 v0, v0, 0x4

    .line 11
    invoke-static {p0, v1}, Ljava/lang/Math;->min(II)I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    add-int v4, v3, v0

    .line 12
    invoke-virtual {p2, v4}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v5

    aget-byte v6, p1, v3

    if-eq v5, v6, :cond_0

    .line 13
    invoke-virtual {p2, v4}, Ljava/nio/ByteBuffer;->get(I)B

    move-result p0

    aget-byte p1, p1, v3

    sub-int/2addr p0, p1

    return p0

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    sub-int/2addr p0, v1

    return p0
.end method


# virtual methods
.method public __indirect(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/flatbuffers/d;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    add-int/2addr v0, p1

    return v0
.end method

.method public __offset(I)I
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/flatbuffers/d;->vtable_size:I

    if-ge p1, v0, :cond_0

    iget-object v0, p0, Lcom/google/flatbuffers/d;->bb:Ljava/nio/ByteBuffer;

    iget v1, p0, Lcom/google/flatbuffers/d;->vtable_start:I

    add-int/2addr v1, p1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public __reset()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 8
    invoke-virtual {p0, v0, v1}, Lcom/google/flatbuffers/d;->__reset(ILjava/nio/ByteBuffer;)V

    return-void
.end method

.method public __reset(ILjava/nio/ByteBuffer;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lcom/google/flatbuffers/d;->bb:Ljava/nio/ByteBuffer;

    if-eqz p2, :cond_0

    .line 2
    iput p1, p0, Lcom/google/flatbuffers/d;->bb_pos:I

    .line 3
    invoke-virtual {p2, p1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result p2

    sub-int/2addr p1, p2

    iput p1, p0, Lcom/google/flatbuffers/d;->vtable_start:I

    .line 4
    iget-object p2, p0, Lcom/google/flatbuffers/d;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {p2, p1}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result p1

    iput p1, p0, Lcom/google/flatbuffers/d;->vtable_size:I

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 5
    iput p1, p0, Lcom/google/flatbuffers/d;->bb_pos:I

    .line 6
    iput p1, p0, Lcom/google/flatbuffers/d;->vtable_start:I

    .line 7
    iput p1, p0, Lcom/google/flatbuffers/d;->vtable_size:I

    :goto_0
    return-void
.end method

.method public __string(I)Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/flatbuffers/d;->bb:Ljava/nio/ByteBuffer;

    iget-object v1, p0, Lcom/google/flatbuffers/d;->utf8:Lcom/google/flatbuffers/e;

    invoke-static {p1, v0, v1}, Lcom/google/flatbuffers/d;->__string(ILjava/nio/ByteBuffer;Lcom/google/flatbuffers/e;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public __union(Lcom/google/flatbuffers/d;I)Lcom/google/flatbuffers/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/flatbuffers/d;->bb:Ljava/nio/ByteBuffer;

    invoke-static {p1, p2, v0}, Lcom/google/flatbuffers/d;->__union(Lcom/google/flatbuffers/d;ILjava/nio/ByteBuffer;)Lcom/google/flatbuffers/d;

    move-result-object p1

    return-object p1
.end method

.method public __vector(I)I
    .locals 1

    iget v0, p0, Lcom/google/flatbuffers/d;->bb_pos:I

    add-int/2addr p1, v0

    iget-object v0, p0, Lcom/google/flatbuffers/d;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    add-int/2addr v0, p1

    add-int/lit8 v0, v0, 0x4

    return v0
.end method

.method public __vector_as_bytebuffer(II)Ljava/nio/ByteBuffer;
    .locals 2

    invoke-virtual {p0, p1}, Lcom/google/flatbuffers/d;->__offset(I)I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Lcom/google/flatbuffers/d;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    move-result-object v0

    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {p0, p1}, Lcom/google/flatbuffers/d;->__vector(I)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-virtual {p0, p1}, Lcom/google/flatbuffers/d;->__vector_len(I)I

    move-result p1

    mul-int/2addr p1, p2

    add-int/2addr p1, v1

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    return-object v0
.end method

.method public __vector_in_bytebuffer(Ljava/nio/ByteBuffer;II)Ljava/nio/ByteBuffer;
    .locals 1

    invoke-virtual {p0, p2}, Lcom/google/flatbuffers/d;->__offset(I)I

    move-result p2

    if-nez p2, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p0, p2}, Lcom/google/flatbuffers/d;->__vector(I)I

    move-result v0

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    invoke-virtual {p0, p2}, Lcom/google/flatbuffers/d;->__vector_len(I)I

    move-result p2

    mul-int/2addr p2, p3

    add-int/2addr p2, v0

    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    return-object p1
.end method

.method public __vector_len(I)I
    .locals 1

    iget v0, p0, Lcom/google/flatbuffers/d;->bb_pos:I

    add-int/2addr p1, v0

    iget-object v0, p0, Lcom/google/flatbuffers/d;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    add-int/2addr v0, p1

    iget-object p1, p0, Lcom/google/flatbuffers/d;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result p1

    return p1
.end method

.method public getByteBuffer()Ljava/nio/ByteBuffer;
    .locals 1

    iget-object v0, p0, Lcom/google/flatbuffers/d;->bb:Ljava/nio/ByteBuffer;

    return-object v0
.end method

.method public keysCompare(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/nio/ByteBuffer;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public sortTables([ILjava/nio/ByteBuffer;)V
    .locals 4

    array-length v0, p1

    new-array v0, v0, [Ljava/lang/Integer;

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    array-length v3, p1

    if-ge v2, v3, :cond_0

    aget v3, p1, v2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/google/flatbuffers/c;

    invoke-direct {v2, p0, p2}, Lcom/google/flatbuffers/c;-><init>(Lcom/google/flatbuffers/d;Ljava/nio/ByteBuffer;)V

    invoke-static {v0, v2}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    :goto_1
    array-length p2, p1

    if-ge v1, p2, :cond_1

    aget-object p2, v0, v1

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    aput p2, p1, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method
