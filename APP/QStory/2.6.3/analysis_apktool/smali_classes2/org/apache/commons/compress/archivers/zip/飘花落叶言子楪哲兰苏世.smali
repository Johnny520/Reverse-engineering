.class public final Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪哲兰苏世;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;


# instance fields
.field public 飘花落叶言子楪哲兰世苏:[B

.field public 飘花落叶言子楪哲兰苏世:[B

.field public 飘花落叶言子楪哲苏兰世:Lorg/apache/commons/compress/archivers/zip/ZipShort;


# virtual methods
.method public final getCentralDirectoryData()[B
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲兰苏世:[B

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世苏哲兰([B)[B

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    iget-object p0, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲兰世苏:[B

    .line 11
    .line 12
    invoke-static {p0}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世苏哲兰([B)[B

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public final getCentralDirectoryLength()Lorg/apache/commons/compress/archivers/zip/ZipShort;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲兰苏世:[B

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lorg/apache/commons/compress/archivers/zip/ZipShort;

    .line 6
    .line 7
    iget-object p0, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲兰苏世:[B

    .line 8
    .line 9
    array-length p0, p0

    .line 10
    invoke-direct {v0, p0}, Lorg/apache/commons/compress/archivers/zip/ZipShort;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    iget-object p0, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲兰世苏:[B

    .line 15
    .line 16
    invoke-static {p0}, Lorg/apache/commons/compress/archivers/zip/ZipShort;->lengthOf([B)Lorg/apache/commons/compress/archivers/zip/ZipShort;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public final getHeaderId()Lorg/apache/commons/compress/archivers/zip/ZipShort;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲苏兰世:Lorg/apache/commons/compress/archivers/zip/ZipShort;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getLocalFileDataData()[B
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲兰世苏:[B

    .line 2
    .line 3
    invoke-static {p0}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世苏哲兰([B)[B

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final getLocalFileDataLength()Lorg/apache/commons/compress/archivers/zip/ZipShort;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲兰世苏:[B

    .line 2
    .line 3
    invoke-static {p0}, Lorg/apache/commons/compress/archivers/zip/ZipShort;->lengthOf([B)Lorg/apache/commons/compress/archivers/zip/ZipShort;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final parseFromCentralDirectoryData([BII)V
    .locals 0

    .line 1
    add-int/2addr p3, p2

    .line 2
    invoke-static {p1, p2, p3}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    invoke-static {p1}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世苏哲兰([B)[B

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    iput-object p2, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲兰苏世:[B

    .line 11
    .line 12
    iget-object p2, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲兰世苏:[B

    .line 13
    .line 14
    if-nez p2, :cond_0

    .line 15
    .line 16
    invoke-static {p1}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世苏哲兰([B)[B

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲兰世苏:[B

    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public final parseFromLocalFileData([BII)V
    .locals 0

    .line 1
    add-int/2addr p3, p2

    .line 2
    invoke-static {p1, p2, p3}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    invoke-static {p1}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世苏哲兰([B)[B

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲兰世苏:[B

    .line 11
    .line 12
    return-void
.end method
