.class public final Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪兰苏哲世;
.super Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪苏兰哲世;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final 飘花落叶言子楪兰世苏哲:Lorg/apache/commons/compress/archivers/zip/ZipShort;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lorg/apache/commons/compress/archivers/zip/ZipShort;

    .line 2
    .line 3
    const/16 v1, 0x15

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lorg/apache/commons/compress/archivers/zip/ZipShort;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰世苏哲:Lorg/apache/commons/compress/archivers/zip/ZipShort;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final parseFromCentralDirectoryData([BII)V
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-virtual {p0, v0, p3}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰(II)V

    .line 3
    .line 4
    .line 5
    invoke-super {p0, p1, p2, p3}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪苏兰哲世;->parseFromCentralDirectoryData([BII)V

    .line 6
    .line 7
    .line 8
    invoke-static {p1, p2}, Lorg/apache/commons/compress/archivers/zip/ZipShort;->getValue([BI)I

    .line 9
    .line 10
    .line 11
    add-int/lit8 p2, p2, 0x2

    .line 12
    .line 13
    invoke-static {p1, p2}, Lorg/apache/commons/compress/archivers/zip/ZipShort;->getValue([BI)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    invoke-static {p0}, Lorg/apache/commons/compress/archivers/zip/PKWareExtraHeader$HashAlgorithm;->getAlgorithmByCode(I)Lorg/apache/commons/compress/archivers/zip/PKWareExtraHeader$HashAlgorithm;

    .line 18
    .line 19
    .line 20
    return-void
.end method
