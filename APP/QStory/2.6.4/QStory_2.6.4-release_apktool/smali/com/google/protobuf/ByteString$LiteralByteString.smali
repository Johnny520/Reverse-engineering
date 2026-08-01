.class final Lcom/google/protobuf/ByteString$LiteralByteString;
.super Lcom/google/protobuf/ByteString$LeafByteString;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/ByteString;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "LiteralByteString"
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private final bytes:[B


# direct methods
.method public constructor <init>([B)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lcom/google/protobuf/ByteString$LeafByteString;-><init>(Lcom/google/protobuf/飘花落叶言子楪兰苏哲世;)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lcom/google/protobuf/ByteString$LiteralByteString;->bytes:[B

    .line 9
    .line 10
    return-void
.end method

.method public static synthetic access$800(Lcom/google/protobuf/ByteString$LiteralByteString;)[B
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/ByteString$LiteralByteString;->bytes:[B

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public asReadOnlyByteBuffer()Ljava/nio/ByteBuffer;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/ByteString$LiteralByteString;->bytes:[B

    .line 2
    .line 3
    invoke-static {p0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->asReadOnlyBuffer()Ljava/nio/ByteBuffer;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
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
    invoke-virtual {p0}, Lcom/google/protobuf/ByteString$LiteralByteString;->asReadOnlyByteBuffer()Ljava/nio/ByteBuffer;

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
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/ByteString$LiteralByteString;->bytes:[B

    .line 2
    .line 3
    aget-byte p0, p0, p1

    .line 4
    .line 5
    return p0
.end method

.method public copyTo(Ljava/nio/ByteBuffer;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/ByteString$LiteralByteString;->bytes:[B

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public copyToInternal([BIII)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/ByteString$LiteralByteString;->bytes:[B

    .line 2
    .line 3
    invoke-static {p0, p2, p1, p3, p4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final equalsInternal(Lcom/google/protobuf/ByteString;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lcom/google/protobuf/ByteString$LiteralByteString;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lcom/google/protobuf/ByteString$LiteralByteString;->bytes:[B

    .line 6
    .line 7
    check-cast p1, Lcom/google/protobuf/ByteString$LiteralByteString;

    .line 8
    .line 9
    iget-object p1, p1, Lcom/google/protobuf/ByteString$LiteralByteString;->bytes:[B

    .line 10
    .line 11
    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([B[B)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_0
    instance-of v0, p1, Lcom/google/protobuf/ByteString$BoundedByteString;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-virtual {p0}, Lcom/google/protobuf/ByteString$LiteralByteString;->size()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-virtual {p0, p1, v0, v1}, Lcom/google/protobuf/ByteString$LiteralByteString;->equalsRange(Lcom/google/protobuf/ByteString;II)Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    return p0

    .line 30
    :cond_1
    invoke-virtual {p1, p0}, Lcom/google/protobuf/ByteString;->equalsInternal(Lcom/google/protobuf/ByteString;)Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    return p0
.end method

.method public equalsRange(Lcom/google/protobuf/ByteString;II)Z
    .locals 3

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
    const/4 v2, 0x0

    .line 14
    if-gt v0, v1, :cond_2

    .line 15
    .line 16
    instance-of v1, p1, Lcom/google/protobuf/ByteString$LiteralByteString;

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    check-cast p1, Lcom/google/protobuf/ByteString$LiteralByteString;

    .line 21
    .line 22
    iget-object p0, p0, Lcom/google/protobuf/ByteString$LiteralByteString;->bytes:[B

    .line 23
    .line 24
    iget-object p1, p1, Lcom/google/protobuf/ByteString$LiteralByteString;->bytes:[B

    .line 25
    .line 26
    invoke-static {p0, v2, p1, p2, p3}, Lcom/google/protobuf/ByteString;->access$500([BI[BII)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    return p0

    .line 31
    :cond_0
    instance-of v1, p1, Lcom/google/protobuf/ByteString$BoundedByteString;

    .line 32
    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    check-cast p1, Lcom/google/protobuf/ByteString$BoundedByteString;

    .line 36
    .line 37
    iget-object p0, p0, Lcom/google/protobuf/ByteString$LiteralByteString;->bytes:[B

    .line 38
    .line 39
    invoke-static {p1}, Lcom/google/protobuf/ByteString$BoundedByteString;->access$600(Lcom/google/protobuf/ByteString$BoundedByteString;)[B

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-static {p1}, Lcom/google/protobuf/ByteString$BoundedByteString;->access$700(Lcom/google/protobuf/ByteString$BoundedByteString;)I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    add-int/2addr p1, p2

    .line 48
    invoke-static {p0, v2, v0, p1, p3}, Lcom/google/protobuf/ByteString;->access$500([BI[BII)Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    return p0

    .line 53
    :cond_1
    invoke-virtual {p1, p2, v0}, Lcom/google/protobuf/ByteString;->substringNoCopy(II)Lcom/google/protobuf/ByteString;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {p0, v2, p3}, Lcom/google/protobuf/ByteString$LiteralByteString;->substringNoCopy(II)Lcom/google/protobuf/ByteString;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-virtual {p1, p0}, Lcom/google/protobuf/ByteString;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    return p0

    .line 66
    :cond_2
    const-string p0, "Ran off end of other: "

    .line 67
    .line 68
    const-string v0, ", "

    .line 69
    .line 70
    invoke-static {p2, p3, p0, v0, v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲世苏(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-virtual {p1}, Lcom/google/protobuf/ByteString;->size()I

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    invoke-static {p0, p1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏兰哲世(Ljava/lang/StringBuilder;I)V

    .line 79
    .line 80
    .line 81
    return v2

    .line 82
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 83
    .line 84
    invoke-virtual {p0}, Lcom/google/protobuf/ByteString$LiteralByteString;->size()I

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    new-instance p2, Ljava/lang/StringBuilder;

    .line 89
    .line 90
    const-string v0, "Length too large: "

    .line 91
    .line 92
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    throw p1
.end method

.method public internalByteAt(I)B
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/ByteString$LiteralByteString;->bytes:[B

    .line 2
    .line 3
    aget-byte p0, p0, p1

    .line 4
    .line 5
    return p0
.end method

.method public isValidUtf8()Z
    .locals 3

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/ByteString$LiteralByteString;->bytes:[B

    .line 2
    .line 3
    sget-object v0, Lcom/google/protobuf/飘花落叶言苏楪世哲兰子;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世楪哲兰子苏;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    array-length v2, p0

    .line 7
    invoke-virtual {v0, v1, p0, v2}, Lcom/google/protobuf/飘花落叶言世楪哲兰子苏;->飘花落叶言子楪苏兰世哲(I[BI)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public newCodedInput()Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/ByteString$LiteralByteString;->bytes:[B

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/protobuf/ByteString$LiteralByteString;->size()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    const/4 v1, 0x1

    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-static {v0, v2, p0, v1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪苏哲世兰([BIIZ)Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public newInput()Ljava/io/InputStream;
    .locals 3

    .line 1
    new-instance v0, Ljava/io/ByteArrayInputStream;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/protobuf/ByteString$LiteralByteString;->bytes:[B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-virtual {p0}, Lcom/google/protobuf/ByteString$LiteralByteString;->size()I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    invoke-direct {v0, v1, v2, p0}, Ljava/io/ByteArrayInputStream;-><init>([BII)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public partialHash(III)I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/ByteString$LiteralByteString;->bytes:[B

    .line 2
    .line 3
    invoke-static {p1, p0, p2, p3}, Lcom/google/protobuf/飘花落叶言世子苏兰楪哲;->飘花落叶言子楪世兰苏哲(I[BII)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public size()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/ByteString$LiteralByteString;->bytes:[B

    .line 2
    .line 3
    array-length p0, p0

    .line 4
    return p0
.end method

.method public substring(II)Lcom/google/protobuf/ByteString;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/ByteString$LiteralByteString;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p1, p2, v0}, Lcom/google/protobuf/ByteString;->checkRange(III)I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    if-nez p2, :cond_0

    .line 10
    .line 11
    sget-object p0, Lcom/google/protobuf/ByteString;->EMPTY:Lcom/google/protobuf/ByteString;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    new-instance v0, Lcom/google/protobuf/ByteString$BoundedByteString;

    .line 15
    .line 16
    iget-object p0, p0, Lcom/google/protobuf/ByteString$LiteralByteString;->bytes:[B

    .line 17
    .line 18
    invoke-direct {v0, p0, p1, p2}, Lcom/google/protobuf/ByteString$BoundedByteString;-><init>([BII)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public substringNoCopy(II)Lcom/google/protobuf/ByteString;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/ByteString$LiteralByteString;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p1, p2, v0}, Lcom/google/protobuf/ByteString;->checkRange(III)I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    if-nez p2, :cond_0

    .line 10
    .line 11
    sget-object p0, Lcom/google/protobuf/ByteString;->EMPTY:Lcom/google/protobuf/ByteString;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    new-instance v0, Lcom/google/protobuf/ByteString$BoundedByteString;

    .line 15
    .line 16
    iget-object p0, p0, Lcom/google/protobuf/ByteString$LiteralByteString;->bytes:[B

    .line 17
    .line 18
    invoke-direct {v0, p0, p1, p2}, Lcom/google/protobuf/ByteString$BoundedByteString;-><init>([BII)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public toStringInternal(Ljava/nio/charset/Charset;)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/String;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/google/protobuf/ByteString$LiteralByteString;->bytes:[B

    .line 4
    .line 5
    invoke-direct {v0, p0, p1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public writeTo(Lcom/google/protobuf/飘花落叶言子楪兰苏世哲;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/ByteString$LiteralByteString;->bytes:[B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0}, Lcom/google/protobuf/ByteString$LiteralByteString;->size()I

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    invoke-virtual {p1, v1, v0, p0}, Lcom/google/protobuf/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世苏哲兰(I[BI)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public writeTo(Ljava/io/OutputStream;)V
    .locals 0

    .line 12
    invoke-virtual {p0}, Lcom/google/protobuf/ByteString;->toByteArray()[B

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/io/OutputStream;->write([B)V

    return-void
.end method

.method public writeToInternal(Ljava/io/OutputStream;II)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/ByteString$LiteralByteString;->bytes:[B

    .line 2
    .line 3
    invoke-virtual {p1, p0, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
