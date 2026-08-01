.class public abstract Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪世苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;


# instance fields
.field public 飘花落叶言子楪哲兰世苏:[B

.field public 飘花落叶言子楪哲兰苏世:[B

.field public 飘花落叶言子楪哲苏兰世:J


# virtual methods
.method public final getCentralDirectoryData()[B
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:[B

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object p0, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:[B

    .line 9
    .line 10
    if-eqz p0, :cond_1

    .line 11
    .line 12
    array-length v0, p0

    .line 13
    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :cond_1
    const/4 p0, 0x0

    .line 19
    return-object p0
.end method

.method public final getCentralDirectoryLength()Lorg/apache/commons/compress/archivers/zip/ZipShort;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:[B

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object p0, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:[B

    .line 9
    .line 10
    invoke-static {p0}, Lorg/apache/commons/compress/archivers/zip/ZipShort;->lengthOf([B)Lorg/apache/commons/compress/archivers/zip/ZipShort;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public final getLocalFileDataData()[B
    .locals 0

    .line 1
    invoke-virtual {p0}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪世苏哲兰;->getCentralDirectoryData()[B

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final getLocalFileDataLength()Lorg/apache/commons/compress/archivers/zip/ZipShort;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪世苏哲兰;->getCentralDirectoryLength()Lorg/apache/commons/compress/archivers/zip/ZipShort;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final parseFromCentralDirectoryData([BII)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪世苏哲兰;->parseFromLocalFileData([BII)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final parseFromLocalFileData([BII)V
    .locals 3

    .line 1
    const/4 v0, 0x5

    .line 2
    if-lt p3, v0, :cond_1

    .line 3
    .line 4
    aget-byte v1, p1, p2

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    if-ne v1, v2, :cond_0

    .line 8
    .line 9
    add-int/lit8 v1, p2, 0x1

    .line 10
    .line 11
    invoke-static {p1, v1}, Lorg/apache/commons/compress/archivers/zip/ZipLong;->getValue([BI)J

    .line 12
    .line 13
    .line 14
    move-result-wide v1

    .line 15
    iput-wide v1, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:J

    .line 16
    .line 17
    sub-int/2addr p3, v0

    .line 18
    new-array v1, p3, [B

    .line 19
    .line 20
    iput-object v1, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:[B

    .line 21
    .line 22
    add-int/2addr p2, v0

    .line 23
    const/4 v0, 0x0

    .line 24
    invoke-static {p1, p2, v1, v0, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 25
    .line 26
    .line 27
    const/4 p1, 0x0

    .line 28
    iput-object p1, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:[B

    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    new-instance p0, Ljava/util/zip/ZipException;

    .line 32
    .line 33
    const-string p1, "Unsupported version ["

    .line 34
    .line 35
    const-string p2, "] for UniCode path extra data."

    .line 36
    .line 37
    invoke-static {v1, p1, p2}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏兰哲世(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-direct {p0, p1}, Ljava/util/zip/ZipException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw p0

    .line 45
    :cond_1
    new-instance p0, Ljava/util/zip/ZipException;

    .line 46
    .line 47
    const-string p1, "UniCode path extra data must have at least 5 bytes."

    .line 48
    .line 49
    invoke-direct {p0, p1}, Ljava/util/zip/ZipException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw p0
.end method

.method public final 飘花落叶言子楪世苏哲兰()V
    .locals 6

    .line 1
    iget-object v0, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:[B

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    array-length v0, v0

    .line 7
    const/4 v1, 0x5

    .line 8
    add-int/2addr v0, v1

    .line 9
    new-array v0, v0, [B

    .line 10
    .line 11
    iput-object v0, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:[B

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x1

    .line 15
    aput-byte v3, v0, v2

    .line 16
    .line 17
    iget-wide v4, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:J

    .line 18
    .line 19
    invoke-static {v4, v5}, Lorg/apache/commons/compress/archivers/zip/ZipLong;->getBytes(J)[B

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object v4, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:[B

    .line 24
    .line 25
    const/4 v5, 0x4

    .line 26
    invoke-static {v0, v2, v4, v3, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:[B

    .line 30
    .line 31
    iget-object p0, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:[B

    .line 32
    .line 33
    array-length v3, v0

    .line 34
    invoke-static {v0, v2, p0, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 35
    .line 36
    .line 37
    return-void
.end method
