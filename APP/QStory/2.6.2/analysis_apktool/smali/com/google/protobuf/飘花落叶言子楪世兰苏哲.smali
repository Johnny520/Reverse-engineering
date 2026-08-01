.class public abstract Lcom/google/protobuf/飘花落叶言子楪世兰苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;


# instance fields
.field protected memoizedHashCode:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/google/protobuf/飘花落叶言子楪世兰苏哲;->memoizedHashCode:I

    .line 6
    .line 7
    return-void
.end method

.method public static addAll(Ljava/lang/Iterable;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Iterable<",
            "TT;>;",
            "Ljava/util/List<",
            "-TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-static {p0, p1}, Lcom/google/protobuf/飘花落叶言子楪世哲兰苏;->addAll(Ljava/lang/Iterable;Ljava/util/List;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static checkByteStringIsUtf8(Lcom/google/protobuf/ByteString;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/ByteString;->isValidUtf8()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const-string p0, "Byte string is not UTF-8."

    .line 9
    .line 10
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method private getSerializingExceptionMessage(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Serializing "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string p0, " to a "

    .line 20
    .line 21
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string p0, " threw an IOException (should never happen)."

    .line 28
    .line 29
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method


# virtual methods
.method public abstract synthetic getDefaultInstanceForType()Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;
.end method

.method public getMemoizedSerializedSize()I
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw p0
.end method

.method public abstract synthetic getParserForType()Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;
.end method

.method public abstract synthetic getSerializedSize()I
.end method

.method public getSerializedSize(Lcom/google/protobuf/飘花落叶言世兰子苏哲楪;)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子楪世兰苏哲;->getMemoizedSerializedSize()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    invoke-interface {p1, p0}, Lcom/google/protobuf/飘花落叶言世兰子苏哲楪;->飘花落叶言子楪苏哲世兰(Lcom/google/protobuf/飘花落叶言子楪世兰苏哲;)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言子楪世兰苏哲;->setMemoizedSerializedSize(I)V

    .line 13
    .line 14
    .line 15
    return p1

    .line 16
    :cond_0
    return v0
.end method

.method public abstract synthetic isInitialized()Z
.end method

.method public abstract synthetic newBuilderForType()Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;
.end method

.method public newUninitializedMessageException()Lcom/google/protobuf/UninitializedMessageException;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/protobuf/UninitializedMessageException;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/google/protobuf/UninitializedMessageException;-><init>(Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public setMemoizedSerializedSize(I)V
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw p0
.end method

.method public abstract synthetic toBuilder()Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;
.end method

.method public toByteArray()[B
    .locals 3

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子楪世兰苏哲;->getSerializedSize()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-array v1, v0, [B

    .line 6
    .line 7
    sget-boolean v2, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世苏兰哲:Z

    .line 8
    .line 9
    new-instance v2, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;

    .line 10
    .line 11
    invoke-direct {v2, v1, v0}, Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;-><init>([BI)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v2}, Lcom/google/protobuf/飘花落叶言子楪世兰苏哲;->writeTo(Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世苏兰哲()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    .line 19
    .line 20
    return-object v1

    .line 21
    :catch_0
    move-exception v0

    .line 22
    const-string v1, "byte array"

    .line 23
    .line 24
    invoke-direct {p0, v1}, Lcom/google/protobuf/飘花落叶言子楪世兰苏哲;->getSerializingExceptionMessage(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-static {p0, v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏兰哲世(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    return-object p0
.end method

.method public toByteString()Lcom/google/protobuf/ByteString;
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子楪世兰苏哲;->getSerializedSize()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->newCodedBuilder(I)Lcom/google/protobuf/飘花落叶言子世楪哲兰苏;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, v0, Lcom/google/protobuf/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;

    .line 10
    .line 11
    invoke-virtual {p0, v1}, Lcom/google/protobuf/飘花落叶言子楪世兰苏哲;->writeTo(Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;)V

    .line 12
    .line 13
    .line 14
    iget-object v1, v0, Lcom/google/protobuf/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言子世哲苏楪兰;

    .line 15
    .line 16
    invoke-virtual {v1}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世苏兰哲()V

    .line 17
    .line 18
    .line 19
    new-instance v1, Lcom/google/protobuf/ByteString$LiteralByteString;

    .line 20
    .line 21
    iget-object v0, v0, Lcom/google/protobuf/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏兰哲:[B

    .line 22
    .line 23
    invoke-direct {v1, v0}, Lcom/google/protobuf/ByteString$LiteralByteString;-><init>([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    .line 25
    .line 26
    return-object v1

    .line 27
    :catch_0
    move-exception v0

    .line 28
    const-string v1, "ByteString"

    .line 29
    .line 30
    invoke-direct {p0, v1}, Lcom/google/protobuf/飘花落叶言子楪世兰苏哲;->getSerializingExceptionMessage(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-static {p0, v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏兰哲世(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    const/4 p0, 0x0

    .line 38
    return-object p0
.end method

.method public writeDelimitedTo(Ljava/io/OutputStream;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子楪世兰苏哲;->getSerializedSize()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪哲世兰苏(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    add-int/2addr v1, v0

    .line 10
    const/16 v2, 0x1000

    .line 11
    .line 12
    if-le v1, v2, :cond_0

    .line 13
    .line 14
    move v1, v2

    .line 15
    :cond_0
    new-instance v2, Lcom/google/protobuf/飘花落叶言子世哲苏兰楪;

    .line 16
    .line 17
    invoke-direct {v2, p1, v1}, Lcom/google/protobuf/飘花落叶言子世哲苏兰楪;-><init>(Ljava/io/OutputStream;I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2, v0}, Lcom/google/protobuf/飘花落叶言子世哲苏兰楪;->飘花落叶言子世哲楪兰苏(I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v2}, Lcom/google/protobuf/飘花落叶言子楪世兰苏哲;->writeTo(Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;)V

    .line 24
    .line 25
    .line 26
    iget p0, v2, Lcom/google/protobuf/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世兰苏哲:I

    .line 27
    .line 28
    if-lez p0, :cond_1

    .line 29
    .line 30
    invoke-virtual {v2}, Lcom/google/protobuf/飘花落叶言子世哲苏兰楪;->飘花落叶言子世兰苏哲楪()V

    .line 31
    .line 32
    .line 33
    :cond_1
    return-void
.end method

.method public abstract synthetic writeTo(Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;)V
.end method

.method public writeTo(Ljava/io/OutputStream;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子楪世兰苏哲;->getSerializedSize()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sget-boolean v1, Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世苏兰哲:Z

    .line 6
    .line 7
    const/16 v1, 0x1000

    .line 8
    .line 9
    if-le v0, v1, :cond_0

    .line 10
    .line 11
    move v0, v1

    .line 12
    :cond_0
    new-instance v1, Lcom/google/protobuf/飘花落叶言子世哲苏兰楪;

    .line 13
    .line 14
    invoke-direct {v1, p1, v0}, Lcom/google/protobuf/飘花落叶言子世哲苏兰楪;-><init>(Ljava/io/OutputStream;I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v1}, Lcom/google/protobuf/飘花落叶言子楪世兰苏哲;->writeTo(Lcom/google/protobuf/飘花落叶言子世哲兰楪苏;)V

    .line 18
    .line 19
    .line 20
    iget p0, v1, Lcom/google/protobuf/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世兰苏哲:I

    .line 21
    .line 22
    if-lez p0, :cond_1

    .line 23
    .line 24
    invoke-virtual {v1}, Lcom/google/protobuf/飘花落叶言子世哲苏兰楪;->飘花落叶言子世兰苏哲楪()V

    .line 25
    .line 26
    .line 27
    :cond_1
    return-void
.end method
