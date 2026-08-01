.class public final Lcom/google/protobuf/飘花落叶言子世楪兰苏哲;
.super Ljava/io/OutputStream;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public 飘花落叶言子楪兰世哲苏:I

.field public 飘花落叶言子楪兰世苏哲:[B

.field public final 飘花落叶言子楪哲兰世苏:Ljava/util/ArrayList;

.field public 飘花落叶言子楪哲兰苏世:I

.field public final 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    .line 2
    .line 3
    .line 4
    if-ltz p1, :cond_0

    .line 5
    .line 6
    iput p1, p0, Lcom/google/protobuf/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪哲苏兰世:I

    .line 7
    .line 8
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lcom/google/protobuf/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/util/ArrayList;

    .line 14
    .line 15
    new-array p1, p1, [B

    .line 16
    .line 17
    iput-object p1, p0, Lcom/google/protobuf/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪兰世苏哲:[B

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    const-string p0, "Buffer size < 0"

    .line 21
    .line 22
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    throw p0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    monitor-enter p0

    .line 12
    :try_start_0
    iget v1, p0, Lcom/google/protobuf/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪哲兰苏世:I

    .line 13
    .line 14
    iget v2, p0, Lcom/google/protobuf/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪兰世哲苏:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    add-int/2addr v1, v2

    .line 17
    monitor-exit p0

    .line 18
    new-instance p0, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string v2, "<ByteString.Output@"

    .line 21
    .line 22
    invoke-direct {p0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v0, " size="

    .line 29
    .line 30
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v0, ">"

    .line 37
    .line 38
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0

    .line 46
    :catchall_0
    move-exception v0

    .line 47
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 48
    throw v0
.end method

.method public final declared-synchronized write(I)V
    .locals 3

    monitor-enter p0

    .line 43
    :try_start_0
    iget v0, p0, Lcom/google/protobuf/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪兰世哲苏:I

    iget-object v1, p0, Lcom/google/protobuf/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪兰世苏哲:[B

    array-length v1, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    .line 44
    invoke-virtual {p0, v0}, Lcom/google/protobuf/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世苏兰哲(I)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 45
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪兰世苏哲:[B

    iget v1, p0, Lcom/google/protobuf/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪兰世哲苏:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/google/protobuf/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪兰世哲苏:I

    int-to-byte p1, p1

    aput-byte p1, v0, v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized write([BII)V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪兰世苏哲:[B

    .line 3
    .line 4
    array-length v1, v0

    .line 5
    iget v2, p0, Lcom/google/protobuf/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪兰世哲苏:I

    .line 6
    .line 7
    sub-int/2addr v1, v2

    .line 8
    if-gt p3, v1, :cond_0

    .line 9
    .line 10
    invoke-static {p1, p2, v0, v2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 11
    .line 12
    .line 13
    iget p1, p0, Lcom/google/protobuf/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪兰世哲苏:I

    .line 14
    .line 15
    add-int/2addr p1, p3

    .line 16
    iput p1, p0, Lcom/google/protobuf/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪兰世哲苏:I

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    array-length v1, v0

    .line 22
    sub-int/2addr v1, v2

    .line 23
    invoke-static {p1, p2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 24
    .line 25
    .line 26
    add-int/2addr p2, v1

    .line 27
    sub-int/2addr p3, v1

    .line 28
    invoke-virtual {p0, p3}, Lcom/google/protobuf/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世苏兰哲(I)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪兰世苏哲:[B

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 35
    .line 36
    .line 37
    iput p3, p0, Lcom/google/protobuf/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪兰世哲苏:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    :goto_0
    monitor-exit p0

    .line 40
    return-void

    .line 41
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    throw p1
.end method

.method public final 飘花落叶言子楪世苏兰哲(I)V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/protobuf/ByteString$LiteralByteString;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/protobuf/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪兰世苏哲:[B

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/google/protobuf/ByteString$LiteralByteString;-><init>([B)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lcom/google/protobuf/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    iget v0, p0, Lcom/google/protobuf/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪哲兰苏世:I

    .line 14
    .line 15
    iget-object v1, p0, Lcom/google/protobuf/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪兰世苏哲:[B

    .line 16
    .line 17
    array-length v1, v1

    .line 18
    add-int/2addr v0, v1

    .line 19
    iput v0, p0, Lcom/google/protobuf/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪哲兰苏世:I

    .line 20
    .line 21
    ushr-int/lit8 v0, v0, 0x1

    .line 22
    .line 23
    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    iget v0, p0, Lcom/google/protobuf/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪哲苏兰世:I

    .line 28
    .line 29
    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    new-array p1, p1, [B

    .line 34
    .line 35
    iput-object p1, p0, Lcom/google/protobuf/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪兰世苏哲:[B

    .line 36
    .line 37
    const/4 p1, 0x0

    .line 38
    iput p1, p0, Lcom/google/protobuf/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪兰世哲苏:I

    .line 39
    .line 40
    return-void
.end method
