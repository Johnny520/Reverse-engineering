.class public final Lcom/android/dx/util/TwoColumnOutput;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field private final leftBuf:Ljava/lang/StringBuffer;

.field private final leftColumn:Lcom/android/dx/util/IndentingWriter;

.field private final leftWidth:I

.field private final out:Ljava/io/Writer;

.field private final rightBuf:Ljava/lang/StringBuffer;

.field private final rightColumn:Lcom/android/dx/util/IndentingWriter;


# direct methods
.method public constructor <init>(Ljava/io/OutputStream;IILjava/lang/String;)V
    .locals 1

    .line 81
    new-instance v0, Ljava/io/OutputStreamWriter;

    invoke-direct {v0, p1}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;)V

    invoke-direct {p0, v0, p2, p3, p4}, Lcom/android/dx/util/TwoColumnOutput;-><init>(Ljava/io/Writer;IILjava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/io/Writer;IILjava/lang/String;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-eqz p1, :cond_3

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    if-lt p2, v1, :cond_2

    .line 9
    .line 10
    if-lt p3, v1, :cond_1

    .line 11
    .line 12
    if-eqz p4, :cond_0

    .line 13
    .line 14
    new-instance v0, Ljava/io/StringWriter;

    .line 15
    .line 16
    const/16 v1, 0x3e8

    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/io/StringWriter;-><init>(I)V

    .line 19
    .line 20
    .line 21
    new-instance v2, Ljava/io/StringWriter;

    .line 22
    .line 23
    invoke-direct {v2, v1}, Ljava/io/StringWriter;-><init>(I)V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, Lcom/android/dx/util/TwoColumnOutput;->out:Ljava/io/Writer;

    .line 27
    .line 28
    iput p2, p0, Lcom/android/dx/util/TwoColumnOutput;->leftWidth:I

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/io/StringWriter;->getBuffer()Ljava/lang/StringBuffer;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iput-object p1, p0, Lcom/android/dx/util/TwoColumnOutput;->leftBuf:Ljava/lang/StringBuffer;

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/io/StringWriter;->getBuffer()Ljava/lang/StringBuffer;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iput-object p1, p0, Lcom/android/dx/util/TwoColumnOutput;->rightBuf:Ljava/lang/StringBuffer;

    .line 41
    .line 42
    new-instance p1, Lcom/android/dx/util/IndentingWriter;

    .line 43
    .line 44
    invoke-direct {p1, v0, p2}, Lcom/android/dx/util/IndentingWriter;-><init>(Ljava/io/Writer;I)V

    .line 45
    .line 46
    .line 47
    iput-object p1, p0, Lcom/android/dx/util/TwoColumnOutput;->leftColumn:Lcom/android/dx/util/IndentingWriter;

    .line 48
    .line 49
    new-instance p1, Lcom/android/dx/util/IndentingWriter;

    .line 50
    .line 51
    invoke-direct {p1, v2, p3, p4}, Lcom/android/dx/util/IndentingWriter;-><init>(Ljava/io/Writer;ILjava/lang/String;)V

    .line 52
    .line 53
    .line 54
    iput-object p1, p0, Lcom/android/dx/util/TwoColumnOutput;->rightColumn:Lcom/android/dx/util/IndentingWriter;

    .line 55
    .line 56
    return-void

    .line 57
    :cond_0
    const-string p0, "spacer == null"

    .line 58
    .line 59
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw v0

    .line 63
    :cond_1
    const-string p0, "rightWidth < 1"

    .line 64
    .line 65
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw v0

    .line 69
    :cond_2
    const-string p0, "leftWidth < 1"

    .line 70
    .line 71
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw v0

    .line 75
    :cond_3
    const-string p0, "out == null"

    .line 76
    .line 77
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    throw v0
.end method

.method private static appendNewlineIfNecessary(Ljava/lang/StringBuffer;Ljava/io/Writer;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/StringBuffer;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    add-int/lit8 v0, v0, -0x1

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Ljava/lang/StringBuffer;->charAt(I)C

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    const/16 v0, 0xa

    .line 14
    .line 15
    if-eq p0, v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(I)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method private flushLeft()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/android/dx/util/TwoColumnOutput;->leftBuf:Ljava/lang/StringBuffer;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/android/dx/util/TwoColumnOutput;->leftColumn:Lcom/android/dx/util/IndentingWriter;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/android/dx/util/TwoColumnOutput;->appendNewlineIfNecessary(Ljava/lang/StringBuffer;Ljava/io/Writer;)V

    .line 6
    .line 7
    .line 8
    :goto_0
    iget-object v0, p0, Lcom/android/dx/util/TwoColumnOutput;->leftBuf:Ljava/lang/StringBuffer;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->length()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lcom/android/dx/util/TwoColumnOutput;->rightColumn:Lcom/android/dx/util/IndentingWriter;

    .line 17
    .line 18
    const/16 v1, 0xa

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lcom/android/dx/util/IndentingWriter;->write(I)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0}, Lcom/android/dx/util/TwoColumnOutput;->outputFullLines()V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-void
.end method

.method private flushRight()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/android/dx/util/TwoColumnOutput;->rightBuf:Ljava/lang/StringBuffer;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/android/dx/util/TwoColumnOutput;->rightColumn:Lcom/android/dx/util/IndentingWriter;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/android/dx/util/TwoColumnOutput;->appendNewlineIfNecessary(Ljava/lang/StringBuffer;Ljava/io/Writer;)V

    .line 6
    .line 7
    .line 8
    :goto_0
    iget-object v0, p0, Lcom/android/dx/util/TwoColumnOutput;->rightBuf:Ljava/lang/StringBuffer;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->length()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lcom/android/dx/util/TwoColumnOutput;->leftColumn:Lcom/android/dx/util/IndentingWriter;

    .line 17
    .line 18
    const/16 v1, 0xa

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lcom/android/dx/util/IndentingWriter;->write(I)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0}, Lcom/android/dx/util/TwoColumnOutput;->outputFullLines()V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-void
.end method

.method private outputFullLines()V
    .locals 5

    .line 1
    :goto_0
    iget-object v0, p0, Lcom/android/dx/util/TwoColumnOutput;->leftBuf:Ljava/lang/StringBuffer;

    .line 2
    .line 3
    const-string v1, "\n"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->indexOf(Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-gez v0, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    iget-object v2, p0, Lcom/android/dx/util/TwoColumnOutput;->rightBuf:Ljava/lang/StringBuffer;

    .line 13
    .line 14
    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->indexOf(Ljava/lang/String;)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-gez v1, :cond_1

    .line 19
    .line 20
    :goto_1
    return-void

    .line 21
    :cond_1
    const/4 v2, 0x0

    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    iget-object v3, p0, Lcom/android/dx/util/TwoColumnOutput;->out:Ljava/io/Writer;

    .line 25
    .line 26
    iget-object v4, p0, Lcom/android/dx/util/TwoColumnOutput;->leftBuf:Ljava/lang/StringBuffer;

    .line 27
    .line 28
    invoke-virtual {v4, v2, v0}, Ljava/lang/StringBuffer;->substring(II)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    invoke-virtual {v3, v4}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    :cond_2
    if-eqz v1, :cond_3

    .line 36
    .line 37
    iget-object v3, p0, Lcom/android/dx/util/TwoColumnOutput;->out:Ljava/io/Writer;

    .line 38
    .line 39
    iget v4, p0, Lcom/android/dx/util/TwoColumnOutput;->leftWidth:I

    .line 40
    .line 41
    sub-int/2addr v4, v0

    .line 42
    invoke-static {v3, v4}, Lcom/android/dx/util/TwoColumnOutput;->writeSpaces(Ljava/io/Writer;I)V

    .line 43
    .line 44
    .line 45
    iget-object v3, p0, Lcom/android/dx/util/TwoColumnOutput;->out:Ljava/io/Writer;

    .line 46
    .line 47
    iget-object v4, p0, Lcom/android/dx/util/TwoColumnOutput;->rightBuf:Ljava/lang/StringBuffer;

    .line 48
    .line 49
    invoke-virtual {v4, v2, v1}, Ljava/lang/StringBuffer;->substring(II)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    invoke-virtual {v3, v4}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    :cond_3
    iget-object v3, p0, Lcom/android/dx/util/TwoColumnOutput;->out:Ljava/io/Writer;

    .line 57
    .line 58
    const/16 v4, 0xa

    .line 59
    .line 60
    invoke-virtual {v3, v4}, Ljava/io/Writer;->write(I)V

    .line 61
    .line 62
    .line 63
    iget-object v3, p0, Lcom/android/dx/util/TwoColumnOutput;->leftBuf:Ljava/lang/StringBuffer;

    .line 64
    .line 65
    add-int/lit8 v0, v0, 0x1

    .line 66
    .line 67
    invoke-virtual {v3, v2, v0}, Ljava/lang/StringBuffer;->delete(II)Ljava/lang/StringBuffer;

    .line 68
    .line 69
    .line 70
    iget-object v0, p0, Lcom/android/dx/util/TwoColumnOutput;->rightBuf:Ljava/lang/StringBuffer;

    .line 71
    .line 72
    add-int/lit8 v1, v1, 0x1

    .line 73
    .line 74
    invoke-virtual {v0, v2, v1}, Ljava/lang/StringBuffer;->delete(II)Ljava/lang/StringBuffer;

    .line 75
    .line 76
    .line 77
    goto :goto_0
.end method

.method public static toString(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    new-instance v2, Ljava/io/StringWriter;

    .line 10
    .line 11
    add-int/2addr v0, v1

    .line 12
    mul-int/lit8 v0, v0, 0x3

    .line 13
    .line 14
    invoke-direct {v2, v0}, Ljava/io/StringWriter;-><init>(I)V

    .line 15
    .line 16
    .line 17
    new-instance v0, Lcom/android/dx/util/TwoColumnOutput;

    .line 18
    .line 19
    invoke-direct {v0, v2, p1, p4, p2}, Lcom/android/dx/util/TwoColumnOutput;-><init>(Ljava/io/Writer;IILjava/lang/String;)V

    .line 20
    .line 21
    .line 22
    :try_start_0
    invoke-virtual {v0}, Lcom/android/dx/util/TwoColumnOutput;->getLeft()Ljava/io/Writer;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p1, p0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Lcom/android/dx/util/TwoColumnOutput;->getRight()Ljava/io/Writer;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {p0, p3}, Ljava/io/Writer;->write(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Lcom/android/dx/util/TwoColumnOutput;->flush()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0

    .line 44
    :catch_0
    move-exception p0

    .line 45
    const-string p1, "shouldn\'t happen"

    .line 46
    .line 47
    invoke-static {p1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲世苏兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 48
    .line 49
    .line 50
    const/4 p0, 0x0

    .line 51
    return-object p0
.end method

.method private static writeSpaces(Ljava/io/Writer;I)V
    .locals 1

    .line 1
    :goto_0
    if-lez p1, :cond_0

    .line 2
    .line 3
    const/16 v0, 0x20

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Ljava/io/Writer;->write(I)V

    .line 6
    .line 7
    .line 8
    add-int/lit8 p1, p1, -0x1

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    return-void
.end method


# virtual methods
.method public flush()V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/android/dx/util/TwoColumnOutput;->leftBuf:Ljava/lang/StringBuffer;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/android/dx/util/TwoColumnOutput;->leftColumn:Lcom/android/dx/util/IndentingWriter;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/android/dx/util/TwoColumnOutput;->appendNewlineIfNecessary(Ljava/lang/StringBuffer;Ljava/io/Writer;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/android/dx/util/TwoColumnOutput;->rightBuf:Ljava/lang/StringBuffer;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/android/dx/util/TwoColumnOutput;->rightColumn:Lcom/android/dx/util/IndentingWriter;

    .line 11
    .line 12
    invoke-static {v0, v1}, Lcom/android/dx/util/TwoColumnOutput;->appendNewlineIfNecessary(Ljava/lang/StringBuffer;Ljava/io/Writer;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0}, Lcom/android/dx/util/TwoColumnOutput;->outputFullLines()V

    .line 16
    .line 17
    .line 18
    invoke-direct {p0}, Lcom/android/dx/util/TwoColumnOutput;->flushLeft()V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Lcom/android/dx/util/TwoColumnOutput;->flushRight()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :catch_0
    move-exception p0

    .line 26
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏哲世兰(Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public getLeft()Ljava/io/Writer;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/util/TwoColumnOutput;->leftColumn:Lcom/android/dx/util/IndentingWriter;

    .line 2
    .line 3
    return-object p0
.end method

.method public getRight()Ljava/io/Writer;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/util/TwoColumnOutput;->rightColumn:Lcom/android/dx/util/IndentingWriter;

    .line 2
    .line 3
    return-object p0
.end method
