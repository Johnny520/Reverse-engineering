.class public final Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪哲兰世苏;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;


# static fields
.field public static final 飘花落叶言子楪哲兰苏世:Lorg/apache/commons/compress/archivers/zip/ZipShort;


# instance fields
.field public 飘花落叶言子楪哲兰世苏:[B

.field public 飘花落叶言子楪哲苏兰世:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lorg/apache/commons/compress/archivers/zip/ZipShort;

    .line 2
    .line 3
    const v1, 0xacc1

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lorg/apache/commons/compress/archivers/zip/ZipShort;-><init>(I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲兰苏世:Lorg/apache/commons/compress/archivers/zip/ZipShort;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final getCentralDirectoryData()[B
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲兰世苏:[B

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲苏兰世:[B

    .line 6
    .line 7
    invoke-static {p0}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世苏哲兰([B)[B

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    invoke-static {v0}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世苏哲兰([B)[B

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
    iget-object v0, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲兰世苏:[B

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲苏兰世:[B

    .line 6
    .line 7
    invoke-static {p0}, Lorg/apache/commons/compress/archivers/zip/ZipShort;->lengthOf([B)Lorg/apache/commons/compress/archivers/zip/ZipShort;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance v0, Lorg/apache/commons/compress/archivers/zip/ZipShort;

    .line 13
    .line 14
    iget-object p0, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲兰世苏:[B

    .line 15
    .line 16
    array-length p0, p0

    .line 17
    invoke-direct {v0, p0}, Lorg/apache/commons/compress/archivers/zip/ZipShort;-><init>(I)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public final getHeaderId()Lorg/apache/commons/compress/archivers/zip/ZipShort;
    .locals 0

    .line 1
    sget-object p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲兰苏世:Lorg/apache/commons/compress/archivers/zip/ZipShort;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getLocalFileDataData()[B
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲苏兰世:[B

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
    iget-object p0, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲苏兰世:[B

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
    .locals 1

    .line 1
    add-int v0, p2, p3

    .line 2
    .line 3
    invoke-static {p1, p2, v0}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iput-object v0, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲兰世苏:[B

    .line 8
    .line 9
    iget-object v0, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲苏兰世:[B

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0, p1, p2, p3}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪哲兰世苏;->parseFromLocalFileData([BII)V

    .line 14
    .line 15
    .line 16
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
    iput-object p1, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲苏兰世:[B

    .line 7
    .line 8
    return-void
.end method
