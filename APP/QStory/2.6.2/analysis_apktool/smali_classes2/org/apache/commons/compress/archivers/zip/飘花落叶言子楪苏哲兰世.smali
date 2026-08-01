.class public final Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪苏哲兰世;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;


# static fields
.field public static final 飘花落叶言子楪哲兰世苏:Lorg/apache/commons/compress/archivers/zip/ZipShort;

.field public static final 飘花落叶言子楪哲苏兰世:Lorg/apache/commons/compress/archivers/zip/ZipShort;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lorg/apache/commons/compress/archivers/zip/ZipShort;

    .line 2
    .line 3
    const v1, 0xcafe

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lorg/apache/commons/compress/archivers/zip/ZipShort;-><init>(I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲苏兰世:Lorg/apache/commons/compress/archivers/zip/ZipShort;

    .line 10
    .line 11
    new-instance v0, Lorg/apache/commons/compress/archivers/zip/ZipShort;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-direct {v0, v1}, Lorg/apache/commons/compress/archivers/zip/ZipShort;-><init>(I)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰世苏:Lorg/apache/commons/compress/archivers/zip/ZipShort;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final getCentralDirectoryData()[B
    .locals 0

    .line 1
    sget-object p0, L飘花落叶言苏子楪兰世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:[B

    .line 2
    .line 3
    return-object p0
.end method

.method public final getCentralDirectoryLength()Lorg/apache/commons/compress/archivers/zip/ZipShort;
    .locals 0

    .line 1
    sget-object p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰世苏:Lorg/apache/commons/compress/archivers/zip/ZipShort;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getHeaderId()Lorg/apache/commons/compress/archivers/zip/ZipShort;
    .locals 0

    .line 1
    sget-object p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲苏兰世:Lorg/apache/commons/compress/archivers/zip/ZipShort;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getLocalFileDataData()[B
    .locals 0

    .line 1
    sget-object p0, L飘花落叶言苏子楪兰世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:[B

    .line 2
    .line 3
    return-object p0
.end method

.method public final getLocalFileDataLength()Lorg/apache/commons/compress/archivers/zip/ZipShort;
    .locals 0

    .line 1
    sget-object p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰世苏:Lorg/apache/commons/compress/archivers/zip/ZipShort;

    .line 2
    .line 3
    return-object p0
.end method

.method public final parseFromCentralDirectoryData([BII)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪苏哲兰世;->parseFromLocalFileData([BII)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final parseFromLocalFileData([BII)V
    .locals 0

    .line 1
    if-nez p3, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance p0, Ljava/util/zip/ZipException;

    .line 5
    .line 6
    const-string p1, "JarMarker doesn\'t expect any data"

    .line 7
    .line 8
    invoke-direct {p0, p1}, Ljava/util/zip/ZipException;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    throw p0
.end method
