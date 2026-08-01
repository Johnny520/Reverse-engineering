.class final Lcom/google/protobuf/ByteString$BoundedByteString;
.super Lcom/google/protobuf/ByteString$LeafByteString;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/ByteString;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "BoundedByteString"
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private final bytes:[B

.field private final length:I

.field private final offset:I


# direct methods
.method public constructor <init>([BII)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lcom/google/protobuf/ByteString$LeafByteString;-><init>(Lcom/google/protobuf/飘花落叶言子楪兰苏哲世;)V

    .line 3
    .line 4
    .line 5
    add-int v0, p2, p3

    .line 6
    .line 7
    array-length v1, p1

    .line 8
    invoke-static {p2, v0, v1}, Lcom/google/protobuf/ByteString;->checkRange(III)I

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lcom/google/protobuf/ByteString$BoundedByteString;->bytes:[B

    .line 12
    .line 13
    iput p2, p0, Lcom/google/protobuf/ByteString$BoundedByteString;->offset:I

    .line 14
    .line 15
    iput p3, p0, Lcom/google/protobuf/ByteString$BoundedByteString;->length:I

    .line 16
    .line 17
    return-void
.end method

.method public static synthetic access$600(Lcom/google/protobuf/ByteString$BoundedByteString;)[B
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/ByteString$BoundedByteString;->bytes:[B

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$700(Lcom/google/protobuf/ByteString$BoundedByteString;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/ByteString$BoundedByteString;->offset:I

    .line 2
    .line 3
    return p0
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 0

    .line 1
    new-instance p0, Ljava/io/InvalidObjectException;

    .line 2
    .line 3
    const-string p1, "BoundedByteStream instances are not to be serialized directly"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method


# virtual methods
.method public asReadOnlyByteBuffer()Ljava/nio/ByteBuffer;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/ByteString$BoundedByteString;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/google/protobuf/ByteString$BoundedByteString;->offset:I

    .line 4
    .line 5
    iget p0, p0, Lcom/google/protobuf/ByteString$BoundedByteString;->length:I

    .line 6
    .line 7
    invoke-static {v0, v1, p0}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->asReadOnlyBuffer()Ljava/nio/ByteBuffer;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public asReadOnlyByteBufferList()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/nio/ByteBuffer;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/ByteString$BoundedByteString;->asReadOnlyByteBuffer()Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public byteAt(I)B
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/ByteString$BoundedByteString;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p1, v0}, Lcom/google/protobuf/ByteString;->checkIndex(II)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/google/protobuf/ByteString$BoundedByteString;->bytes:[B

    .line 9
    .line 10
    iget p0, p0, Lcom/google/protobuf/ByteString$BoundedByteString;->offset:I

    .line 11
    .line 12
    add-int/2addr p0, p1

    .line 13
    aget-byte p0, v0, p0

    .line 14
    .line 15
    return p0
.end method

.method public copyTo(Ljava/nio/ByteBuffer;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/ByteString$BoundedByteString;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/google/protobuf/ByteString$BoundedByteString;->offset:I

    .line 4
    .line 5
    iget p0, p0, Lcom/google/protobuf/ByteString$BoundedByteString;->length:I

    .line 6
    .line 7
    invoke-virtual {p1, v0, v1, p0}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public copyToInternal([BIII)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/ByteString$BoundedByteString;->bytes:[B

    .line 2
    .line 3
    iget p0, p0, Lcom/google/protobuf/ByteString$BoundedByteString;->offset:I

    .line 4
    .line 5
    add-int/2addr p0, p2

    .line 6
    invoke-static {v0, p0, p1, p3, p4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public equalsInternal(Lcom/google/protobuf/ByteString;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lcom/google/protobuf/ByteString$LiteralByteString;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    instance-of v0, p1, Lcom/google/protobuf/ByteString$BoundedByteString;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p1, p0}, Lcom/google/protobuf/ByteString;->equalsInternal(Lcom/google/protobuf/ByteString;)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0

    .line 15
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 16
    invoke-virtual {p0}, Lcom/google/protobuf/ByteString$BoundedByteString;->size()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-virtual {p0, p1, v0, v1}, Lcom/google/protobuf/ByteString$BoundedByteString;->equalsRange(Lcom/google/protobuf/ByteString;II)Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    return p0
.end method

.method public equalsRange(Lcom/google/protobuf/ByteString;II)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/google/protobuf/ByteString;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-gt p3, v0, :cond_3

    .line 6
    .line 7
    add-int v0, p2, p3

    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/google/protobuf/ByteString;->size()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-gt v0, v1, :cond_2

    .line 14
    .line 15
    instance-of v1, p1, Lcom/google/protobuf/ByteString$LiteralByteString;

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    check-cast p1, Lcom/google/protobuf/ByteString$LiteralByteString;

    .line 20
    .line 21
    iget-object v0, p0, Lcom/google/protobuf/ByteString$BoundedByteString;->bytes:[B

    .line 22
    .line 23
    iget p0, p0, Lcom/google/protobuf/ByteString$BoundedByteString;->offset:I

    .line 24
    .line 25
    invoke-static {p1}, Lcom/google/protobuf/ByteString$LiteralByteString;->access$800(Lcom/google/protobuf/ByteString$LiteralByteString;)[B

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-static {v0, p0, p1, p2, p3}, Lcom/google/protobuf/ByteString;->access$500([BI[BII)Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    return p0

    .line 34
    :cond_0
    instance-of v1, p1, Lcom/google/protobuf/ByteString$BoundedByteString;

    .line 35
    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    check-cast p1, Lcom/google/protobuf/ByteString$BoundedByteString;

    .line 39
    .line 40
    iget-object v0, p0, Lcom/google/protobuf/ByteString$BoundedByteString;->bytes:[B

    .line 41
    .line 42
    iget p0, p0, Lcom/google/protobuf/ByteString$BoundedByteString;->offset:I

    .line 43
    .line 44
    iget-object v1, p1, Lcom/google/protobuf/ByteString$BoundedByteString;->bytes:[B

    .line 45
    .line 46
    iget p1, p1, Lcom/google/protobuf/ByteString$BoundedByteString;->offset:I

    .line 47
    .line 48
    add-int/2addr p1, p2

    .line 49
    invoke-static {v0, p0, v1, p1, p3}, Lcom/google/protobuf/ByteString;->access$500([BI[BII)Z

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    return p0

    .line 54
    :cond_1
    invoke-virtual {p1, p2, v0}, Lcom/google/protobuf/ByteString;->substring(II)Lcom/google/protobuf/ByteString;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iget p2, p0, Lcom/google/protobuf/ByteString$BoundedByteString;->offset:I

    .line 59
    .line 60
    add-int/2addr p3, p2

    .line 61
    invoke-virtual {p0, p2, p3}, Lcom/google/protobuf/ByteString$BoundedByteString;->substring(II)Lcom/google/protobuf/ByteString;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-virtual {p1, p0}, Lcom/google/protobuf/ByteString;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    return p0

    .line 70
    :cond_2
    const-string p0, "Ran off end of other: "

    .line 71
    .line 72
    const-string v0, ", "

    .line 73
    .line 74
    invoke-static {p2, p3, p0, v0, v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰苏哲世(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-virtual {p1}, Lcom/google/protobuf/ByteString;->size()I

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    invoke-static {p0, p1}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲兰世(Ljava/lang/StringBuilder;I)V

    .line 83
    .line 84
    .line 85
    const/4 p0, 0x0

    .line 86
    return p0

    .line 87
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 88
    .line 89
    invoke-virtual {p0}, Lcom/google/protobuf/ByteString$BoundedByteString;->size()I

    .line 90
    .line 91
    .line 92
    move-result p0

    .line 93
    new-instance p2, Ljava/lang/StringBuilder;

    .line 94
    .line 95
    const-string v0, "Length too large: "

    .line 96
    .line 97
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    throw p1
.end method

.method public internalByteAt(I)B
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/ByteString$BoundedByteString;->bytes:[B

    .line 2
    .line 3
    iget p0, p0, Lcom/google/protobuf/ByteString$BoundedByteString;->offset:I

    .line 4
    .line 5
    add-int/2addr p0, p1

    .line 6
    aget-byte p0, v0, p0

    .line 7
    .line 8
    return p0
.end method

.method public isValidUtf8()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/ByteString$BoundedByteString;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/google/protobuf/ByteString$BoundedByteString;->offset:I

    .line 4
    .line 5
    iget p0, p0, Lcom/google/protobuf/ByteString$BoundedByteString;->length:I

    .line 6
    .line 7
    add-int/2addr p0, v1

    .line 8
    sget-object v2, Lcom/google/protobuf/飘花落叶言苏楪世哲兰子;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世楪哲兰子苏;

    .line 9
    .line 10
    invoke-virtual {v2, v1, v0, p0}, Lcom/google/protobuf/飘花落叶言世楪哲兰子苏;->飘花落叶言子楪苏兰世哲(I[BI)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0
.end method

.method public newCodedInput()Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/ByteString$BoundedByteString;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/google/protobuf/ByteString$BoundedByteString;->offset:I

    .line 4
    .line 5
    iget p0, p0, Lcom/google/protobuf/ByteString$BoundedByteString;->length:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-static {v0, v1, p0, v2}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪苏哲世兰([BIIZ)Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public newInput()Ljava/io/InputStream;
    .locals 3

    .line 1
    new-instance v0, Ljava/io/ByteArrayInputStream;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/protobuf/ByteString$BoundedByteString;->bytes:[B

    .line 4
    .line 5
    iget v2, p0, Lcom/google/protobuf/ByteString$BoundedByteString;->offset:I

    .line 6
    .line 7
    iget p0, p0, Lcom/google/protobuf/ByteString$BoundedByteString;->length:I

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, p0}, Ljava/io/ByteArrayInputStream;-><init>([BII)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public partialHash(III)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/ByteString$BoundedByteString;->bytes:[B

    .line 2
    .line 3
    iget p0, p0, Lcom/google/protobuf/ByteString$BoundedByteString;->offset:I

    .line 4
    .line 5
    add-int/2addr p0, p2

    .line 6
    invoke-static {p1, v0, p0, p3}, Lcom/google/protobuf/飘花落叶言世子苏兰楪哲;->飘花落叶言子楪世兰苏哲(I[BII)I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method

.method public size()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/ByteString$BoundedByteString;->length:I

    .line 2
    .line 3
    return p0
.end method

.method public substring(II)Lcom/google/protobuf/ByteString;
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/protobuf/ByteString$BoundedByteString;->length:I

    .line 2
    .line 3
    invoke-static {p1, p2, v0}, Lcom/google/protobuf/ByteString;->checkRange(III)I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    if-nez p2, :cond_0

    .line 8
    .line 9
    sget-object p0, Lcom/google/protobuf/ByteString;->EMPTY:Lcom/google/protobuf/ByteString;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance v0, Lcom/google/protobuf/ByteString$BoundedByteString;

    .line 13
    .line 14
    iget-object v1, p0, Lcom/google/protobuf/ByteString$BoundedByteString;->bytes:[B

    .line 15
    .line 16
    iget p0, p0, Lcom/google/protobuf/ByteString$BoundedByteString;->offset:I

    .line 17
    .line 18
    add-int/2addr p0, p1

    .line 19
    invoke-direct {v0, v1, p0, p2}, Lcom/google/protobuf/ByteString$BoundedByteString;-><init>([BII)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method

.method public toStringInternal(Ljava/nio/charset/Charset;)Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/protobuf/ByteString$BoundedByteString;->bytes:[B

    .line 4
    .line 5
    iget v2, p0, Lcom/google/protobuf/ByteString$BoundedByteString;->offset:I

    .line 6
    .line 7
    iget p0, p0, Lcom/google/protobuf/ByteString$BoundedByteString;->length:I

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, p0, p1}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public writeReplace()Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/ByteString;->toByteArray()[B

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lcom/google/protobuf/ByteString;->wrap([B)Lcom/google/protobuf/ByteString;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public writeTo(Lcom/google/protobuf/飘花落叶言子楪兰苏世哲;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/ByteString$BoundedByteString;->bytes:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/google/protobuf/ByteString$BoundedByteString;->offset:I

    .line 4
    .line 5
    iget p0, p0, Lcom/google/protobuf/ByteString$BoundedByteString;->length:I

    .line 6
    .line 7
    invoke-virtual {p1, v1, v0, p0}, Lcom/google/protobuf/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世苏哲兰(I[BI)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public writeTo(Ljava/io/OutputStream;)V
    .locals 0

    .line 11
    invoke-virtual {p0}, Lcom/google/protobuf/ByteString;->toByteArray()[B

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/io/OutputStream;->write([B)V

    return-void
.end method

.method public writeToInternal(Ljava/io/OutputStream;II)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/ByteString$BoundedByteString;->bytes:[B

    .line 2
    .line 3
    iget p0, p0, Lcom/google/protobuf/ByteString$BoundedByteString;->offset:I

    .line 4
    .line 5
    add-int/2addr p0, p2

    .line 6
    invoke-virtual {p1, v0, p0, p3}, Ljava/io/OutputStream;->write([BII)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
