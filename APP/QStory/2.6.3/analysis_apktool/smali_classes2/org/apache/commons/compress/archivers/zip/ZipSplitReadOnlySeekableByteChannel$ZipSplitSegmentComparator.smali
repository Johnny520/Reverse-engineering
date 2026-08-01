.class final Lorg/apache/commons/compress/archivers/zip/ZipSplitReadOnlySeekableByteChannel$ZipSplitSegmentComparator;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/util/Comparator;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Ljava/nio/file/Path;",
        ">;",
        "Ljava/io/Serializable;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x1343abbL


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public synthetic constructor <init>(Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世哲苏楪兰;)V
    .locals 0

    .line 5
    invoke-direct {p0}, Lorg/apache/commons/compress/archivers/zip/ZipSplitReadOnlySeekableByteChannel$ZipSplitSegmentComparator;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 71
    check-cast p1, Ljava/nio/file/Path;

    check-cast p2, Ljava/nio/file/Path;

    invoke-virtual {p0, p1, p2}, Lorg/apache/commons/compress/archivers/zip/ZipSplitReadOnlySeekableByteChannel$ZipSplitSegmentComparator;->compare(Ljava/nio/file/Path;Ljava/nio/file/Path;)I

    move-result p0

    return p0
.end method

.method public compare(Ljava/nio/file/Path;Ljava/nio/file/Path;)I
    .locals 1

    .line 1
    invoke-static {p1}, L飘花落叶言苏子世楪哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰(Ljava/nio/file/Path;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 p1, 0x0

    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-static {p0}, L飘花落叶言苏子楪兰世哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object p0, p1

    .line 14
    :goto_0
    invoke-static {p2}, L飘花落叶言苏子世楪哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰(Ljava/nio/file/Path;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    if-eqz p2, :cond_1

    .line 19
    .line 20
    invoke-static {p2}, L飘花落叶言苏子楪兰世哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    :cond_1
    const-string p2, "z"

    .line 25
    .line 26
    invoke-virtual {p0, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_2

    .line 31
    .line 32
    const/4 p0, -0x1

    .line 33
    return p0

    .line 34
    :cond_2
    invoke-virtual {p1, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    const/4 v0, 0x1

    .line 39
    if-nez p2, :cond_3

    .line 40
    .line 41
    return v0

    .line 42
    :cond_3
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p0, p1}, Ljava/lang/Integer;->compareTo(Ljava/lang/Integer;)I

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    return p0
.end method
