.class public final Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪苏世哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪哲苏兰世;


# static fields
.field public static final 飘花落叶言子楪兰世苏哲:Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪苏世哲兰;

.field public static final 飘花落叶言子楪哲兰世苏:Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪苏世哲兰;

.field public static final 飘花落叶言子楪哲兰苏世:Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪苏世哲兰;


# instance fields
.field public final 飘花落叶言子楪哲苏兰世:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪苏世哲兰;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪苏世哲兰;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪苏世哲兰;

    .line 8
    .line 9
    new-instance v0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪苏世哲兰;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪苏世哲兰;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪苏世哲兰;

    .line 16
    .line 17
    new-instance v0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪苏世哲兰;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-direct {v0, v1}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪苏世哲兰;-><init>(I)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世苏哲:Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪苏世哲兰;

    .line 24
    .line 25
    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onUnparseableExtraField([BIIZI)Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;
    .locals 1

    .line 1
    iget p0, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    if-eqz p0, :cond_3

    .line 4
    .line 5
    const/4 p5, 0x1

    .line 6
    if-eq p0, p5, :cond_2

    .line 7
    .line 8
    const/4 p5, 0x2

    .line 9
    if-ne p0, p5, :cond_1

    .line 10
    .line 11
    new-instance p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪哲兰世苏;

    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    if-eqz p4, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0, p1, p2, p3}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪哲兰世苏;->parseFromLocalFileData([BII)V

    .line 19
    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪哲兰世苏;->parseFromCentralDirectoryData([BII)V

    .line 23
    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_1
    new-instance p1, Ljava/util/zip/ZipException;

    .line 27
    .line 28
    const-string p2, "Unknown UnparseableExtraField key: "

    .line 29
    .line 30
    invoke-static {p0, p2}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-direct {p1, p0}, Ljava/util/zip/ZipException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw p1

    .line 38
    :cond_2
    const/4 p0, 0x0

    .line 39
    return-object p0

    .line 40
    :cond_3
    new-instance p0, Ljava/util/zip/ZipException;

    .line 41
    .line 42
    const-string p1, ".  Block length of "

    .line 43
    .line 44
    const-string p4, " bytes exceeds remaining data of "

    .line 45
    .line 46
    const-string v0, "Bad extra field starting at "

    .line 47
    .line 48
    invoke-static {p2, p5, v0, p1, p4}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲世苏(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    add-int/lit8 p3, p3, -0x4

    .line 53
    .line 54
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string p2, " bytes."

    .line 58
    .line 59
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-direct {p0, p1}, Ljava/util/zip/ZipException;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw p0
.end method
