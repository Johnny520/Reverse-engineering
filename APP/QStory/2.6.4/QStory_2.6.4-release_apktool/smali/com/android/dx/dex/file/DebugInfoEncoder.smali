.class public final Lcom/android/dx/dex/file/DebugInfoEncoder;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field private static final DEBUG:Z = false


# instance fields
.field private address:I

.field private annotateTo:Lcom/android/dx/util/AnnotatedOutput;

.field private final codeSize:I

.field private debugPrint:Ljava/io/PrintWriter;

.field private final desc:Lcom/android/dx/rop/type/Prototype;

.field private final file:Lcom/android/dx/dex/file/DexFile;

.field private final isStatic:Z

.field private final lastEntryForReg:[Lcom/android/dx/dex/code/LocalList$Entry;

.field private line:I

.field private final locals:Lcom/android/dx/dex/code/LocalList;

.field private final output:Lcom/android/dx/util/ByteArrayAnnotatedOutput;

.field private final positions:Lcom/android/dx/dex/code/PositionList;

.field private prefix:Ljava/lang/String;

.field private final regSize:I

.field private shouldConsume:Z


# direct methods
.method public constructor <init>(Lcom/android/dx/dex/code/PositionList;Lcom/android/dx/dex/code/LocalList;Lcom/android/dx/dex/file/DexFile;IIZLcom/android/dx/rop/cst/CstMethodRef;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->address:I

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput v0, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->line:I

    .line 9
    .line 10
    iput-object p1, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->positions:Lcom/android/dx/dex/code/PositionList;

    .line 11
    .line 12
    iput-object p2, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->locals:Lcom/android/dx/dex/code/LocalList;

    .line 13
    .line 14
    iput-object p3, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->file:Lcom/android/dx/dex/file/DexFile;

    .line 15
    .line 16
    invoke-virtual {p7}, Lcom/android/dx/rop/cst/CstBaseMethodRef;->getPrototype()Lcom/android/dx/rop/type/Prototype;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->desc:Lcom/android/dx/rop/type/Prototype;

    .line 21
    .line 22
    iput-boolean p6, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->isStatic:Z

    .line 23
    .line 24
    iput p4, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->codeSize:I

    .line 25
    .line 26
    iput p5, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->regSize:I

    .line 27
    .line 28
    new-instance p1, Lcom/android/dx/util/ByteArrayAnnotatedOutput;

    .line 29
    .line 30
    invoke-direct {p1}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->output:Lcom/android/dx/util/ByteArrayAnnotatedOutput;

    .line 34
    .line 35
    new-array p1, p5, [Lcom/android/dx/dex/code/LocalList$Entry;

    .line 36
    .line 37
    iput-object p1, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->lastEntryForReg:[Lcom/android/dx/dex/code/LocalList$Entry;

    .line 38
    .line 39
    return-void
.end method

.method private annotate(ILjava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->prefix:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->prefix:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, p2}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    :cond_0
    iget-object v0, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->annotateTo:Lcom/android/dx/util/AnnotatedOutput;

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    iget-boolean v1, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->shouldConsume:Z

    .line 21
    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const/4 p1, 0x0

    .line 26
    :goto_0
    invoke-interface {v0, p1, p2}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 27
    .line 28
    .line 29
    :cond_2
    iget-object p0, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->debugPrint:Ljava/io/PrintWriter;

    .line 30
    .line 31
    if-eqz p0, :cond_3

    .line 32
    .line 33
    invoke-virtual {p0, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    :cond_3
    return-void
.end method

.method private buildSortedPositions()Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/android/dx/dex/code/PositionList$Entry;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->positions:Lcom/android/dx/dex/code/PositionList;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    move v0, v1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v0}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    :goto_0
    new-instance v2, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 15
    .line 16
    .line 17
    :goto_1
    if-ge v1, v0, :cond_1

    .line 18
    .line 19
    iget-object v3, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->positions:Lcom/android/dx/dex/code/PositionList;

    .line 20
    .line 21
    invoke-virtual {v3, v1}, Lcom/android/dx/dex/code/PositionList;->get(I)Lcom/android/dx/dex/code/PositionList$Entry;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    add-int/lit8 v1, v1, 0x1

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    new-instance v0, Lcom/android/dx/dex/file/DebugInfoEncoder$1;

    .line 32
    .line 33
    invoke-direct {v0, p0}, Lcom/android/dx/dex/file/DebugInfoEncoder$1;-><init>(Lcom/android/dx/dex/file/DebugInfoEncoder;)V

    .line 34
    .line 35
    .line 36
    invoke-static {v2, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 37
    .line 38
    .line 39
    return-object v2
.end method

.method private static computeOpcode(II)I
    .locals 2

    .line 1
    const/4 v0, -0x4

    .line 2
    if-lt p0, v0, :cond_0

    .line 3
    .line 4
    const/16 v1, 0xa

    .line 5
    .line 6
    if-gt p0, v1, :cond_0

    .line 7
    .line 8
    sub-int/2addr p0, v0

    .line 9
    const/16 v0, 0xf

    .line 10
    .line 11
    invoke-static {p1, v0, p0, v1}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(IIII)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_0
    const-string p0, "Parameter out of range"

    .line 17
    .line 18
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    return p0
.end method

.method private convert0()[B
    .locals 10

    .line 1
    invoke-direct {p0}, Lcom/android/dx/dex/file/DebugInfoEncoder;->buildSortedPositions()Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0}, Lcom/android/dx/dex/file/DebugInfoEncoder;->extractMethodArguments()Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {p0, v0, v1}, Lcom/android/dx/dex/file/DebugInfoEncoder;->emitHeader(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->output:Lcom/android/dx/util/ByteArrayAnnotatedOutput;

    .line 13
    .line 14
    const/4 v2, 0x7

    .line 15
    invoke-virtual {v1, v2}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->writeByte(I)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->annotateTo:Lcom/android/dx/util/AnnotatedOutput;

    .line 19
    .line 20
    if-nez v1, :cond_0

    .line 21
    .line 22
    iget-object v1, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->debugPrint:Ljava/io/PrintWriter;

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    :cond_0
    iget v1, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->address:I

    .line 27
    .line 28
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    const-string v2, "%04x: prologue end"

    .line 37
    .line 38
    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    const/4 v2, 0x1

    .line 43
    invoke-direct {p0, v2, v1}, Lcom/android/dx/dex/file/DebugInfoEncoder;->annotate(ILjava/lang/String;)V

    .line 44
    .line 45
    .line 46
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    iget-object v2, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->locals:Lcom/android/dx/dex/code/LocalList;

    .line 51
    .line 52
    invoke-virtual {v2}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    const/4 v3, 0x0

    .line 57
    move v4, v3

    .line 58
    :goto_0
    invoke-direct {p0, v3}, Lcom/android/dx/dex/file/DebugInfoEncoder;->emitLocalsAtAddress(I)I

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    invoke-direct {p0, v4, v0}, Lcom/android/dx/dex/file/DebugInfoEncoder;->emitPositionsAtAddress(ILjava/util/ArrayList;)I

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    const v5, 0x7fffffff

    .line 67
    .line 68
    .line 69
    if-ge v3, v2, :cond_2

    .line 70
    .line 71
    iget-object v6, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->locals:Lcom/android/dx/dex/code/LocalList;

    .line 72
    .line 73
    invoke-virtual {v6, v3}, Lcom/android/dx/dex/code/LocalList;->get(I)Lcom/android/dx/dex/code/LocalList$Entry;

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    invoke-virtual {v6}, Lcom/android/dx/dex/code/LocalList$Entry;->getAddress()I

    .line 78
    .line 79
    .line 80
    move-result v6

    .line 81
    goto :goto_1

    .line 82
    :cond_2
    move v6, v5

    .line 83
    :goto_1
    if-ge v4, v1, :cond_3

    .line 84
    .line 85
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v7

    .line 89
    check-cast v7, Lcom/android/dx/dex/code/PositionList$Entry;

    .line 90
    .line 91
    invoke-virtual {v7}, Lcom/android/dx/dex/code/PositionList$Entry;->getAddress()I

    .line 92
    .line 93
    .line 94
    move-result v7

    .line 95
    goto :goto_2

    .line 96
    :cond_3
    move v7, v5

    .line 97
    :goto_2
    invoke-static {v7, v6}, Ljava/lang/Math;->min(II)I

    .line 98
    .line 99
    .line 100
    move-result v8

    .line 101
    if-ne v8, v5, :cond_4

    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_4
    iget v9, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->codeSize:I

    .line 105
    .line 106
    if-ne v8, v9, :cond_5

    .line 107
    .line 108
    if-ne v6, v5, :cond_5

    .line 109
    .line 110
    if-ne v7, v5, :cond_5

    .line 111
    .line 112
    :goto_3
    invoke-direct {p0}, Lcom/android/dx/dex/file/DebugInfoEncoder;->emitEndSequence()V

    .line 113
    .line 114
    .line 115
    iget-object p0, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->output:Lcom/android/dx/util/ByteArrayAnnotatedOutput;

    .line 116
    .line 117
    invoke-virtual {p0}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->toByteArray()[B

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    return-object p0

    .line 122
    :cond_5
    if-ne v8, v7, :cond_6

    .line 123
    .line 124
    add-int/lit8 v5, v4, 0x1

    .line 125
    .line 126
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v4

    .line 130
    check-cast v4, Lcom/android/dx/dex/code/PositionList$Entry;

    .line 131
    .line 132
    invoke-direct {p0, v4}, Lcom/android/dx/dex/file/DebugInfoEncoder;->emitPosition(Lcom/android/dx/dex/code/PositionList$Entry;)V

    .line 133
    .line 134
    .line 135
    move v4, v5

    .line 136
    goto :goto_0

    .line 137
    :cond_6
    iget v5, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->address:I

    .line 138
    .line 139
    sub-int/2addr v8, v5

    .line 140
    invoke-direct {p0, v8}, Lcom/android/dx/dex/file/DebugInfoEncoder;->emitAdvancePc(I)V

    .line 141
    .line 142
    .line 143
    goto :goto_0
.end method

.method private emitAdvanceLine(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->output:Lcom/android/dx/util/ByteArrayAnnotatedOutput;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->getCursor()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->output:Lcom/android/dx/util/ByteArrayAnnotatedOutput;

    .line 8
    .line 9
    const/4 v2, 0x2

    .line 10
    invoke-virtual {v1, v2}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->writeByte(I)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->output:Lcom/android/dx/util/ByteArrayAnnotatedOutput;

    .line 14
    .line 15
    invoke-virtual {v1, p1}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->writeSleb128(I)I

    .line 16
    .line 17
    .line 18
    iget v1, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->line:I

    .line 19
    .line 20
    add-int/2addr v1, p1

    .line 21
    iput v1, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->line:I

    .line 22
    .line 23
    iget-object p1, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->annotateTo:Lcom/android/dx/util/AnnotatedOutput;

    .line 24
    .line 25
    if-nez p1, :cond_1

    .line 26
    .line 27
    iget-object p1, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->debugPrint:Ljava/io/PrintWriter;

    .line 28
    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    return-void

    .line 33
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->output:Lcom/android/dx/util/ByteArrayAnnotatedOutput;

    .line 34
    .line 35
    invoke-virtual {p1}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->getCursor()I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    sub-int/2addr p1, v0

    .line 40
    iget v0, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->line:I

    .line 41
    .line 42
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    const-string v1, "line = %d"

    .line 51
    .line 52
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-direct {p0, p1, v0}, Lcom/android/dx/dex/file/DebugInfoEncoder;->annotate(ILjava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method private emitAdvancePc(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->output:Lcom/android/dx/util/ByteArrayAnnotatedOutput;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->getCursor()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->output:Lcom/android/dx/util/ByteArrayAnnotatedOutput;

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    invoke-virtual {v1, v2}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->writeByte(I)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->output:Lcom/android/dx/util/ByteArrayAnnotatedOutput;

    .line 14
    .line 15
    invoke-virtual {v1, p1}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->writeUleb128(I)I

    .line 16
    .line 17
    .line 18
    iget v1, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->address:I

    .line 19
    .line 20
    add-int/2addr v1, p1

    .line 21
    iput v1, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->address:I

    .line 22
    .line 23
    iget-object p1, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->annotateTo:Lcom/android/dx/util/AnnotatedOutput;

    .line 24
    .line 25
    if-nez p1, :cond_1

    .line 26
    .line 27
    iget-object p1, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->debugPrint:Ljava/io/PrintWriter;

    .line 28
    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    return-void

    .line 33
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->output:Lcom/android/dx/util/ByteArrayAnnotatedOutput;

    .line 34
    .line 35
    invoke-virtual {p1}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->getCursor()I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    sub-int/2addr p1, v0

    .line 40
    iget v0, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->address:I

    .line 41
    .line 42
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    const-string v1, "%04x: advance pc"

    .line 51
    .line 52
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-direct {p0, p1, v0}, Lcom/android/dx/dex/file/DebugInfoEncoder;->annotate(ILjava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method private emitEndSequence()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->output:Lcom/android/dx/util/ByteArrayAnnotatedOutput;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->writeByte(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->annotateTo:Lcom/android/dx/util/AnnotatedOutput;

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->debugPrint:Ljava/io/PrintWriter;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    return-void

    .line 17
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 18
    const-string v1, "end sequence"

    .line 19
    .line 20
    invoke-direct {p0, v0, v1}, Lcom/android/dx/dex/file/DebugInfoEncoder;->annotate(ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method private emitHeader(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/android/dx/dex/code/PositionList$Entry;",
            ">;",
            "Ljava/util/ArrayList<",
            "Lcom/android/dx/dex/code/LocalList$Entry;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->annotateTo:Lcom/android/dx/util/AnnotatedOutput;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->debugPrint:Ljava/io/PrintWriter;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v0, v1

    .line 12
    goto :goto_1

    .line 13
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 14
    :goto_1
    iget-object v2, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->output:Lcom/android/dx/util/ByteArrayAnnotatedOutput;

    .line 15
    .line 16
    invoke-virtual {v2}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->getCursor()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-lez v3, :cond_2

    .line 25
    .line 26
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, Lcom/android/dx/dex/code/PositionList$Entry;

    .line 31
    .line 32
    invoke-virtual {p1}, Lcom/android/dx/dex/code/PositionList$Entry;->getPosition()Lcom/android/dx/rop/code/SourcePosition;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1}, Lcom/android/dx/rop/code/SourcePosition;->getLine()I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    iput p1, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->line:I

    .line 41
    .line 42
    :cond_2
    iget-object p1, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->output:Lcom/android/dx/util/ByteArrayAnnotatedOutput;

    .line 43
    .line 44
    iget v3, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->line:I

    .line 45
    .line 46
    invoke-virtual {p1, v3}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->writeUleb128(I)I

    .line 47
    .line 48
    .line 49
    if-eqz v0, :cond_3

    .line 50
    .line 51
    iget-object p1, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->output:Lcom/android/dx/util/ByteArrayAnnotatedOutput;

    .line 52
    .line 53
    invoke-virtual {p1}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->getCursor()I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    sub-int/2addr p1, v2

    .line 58
    new-instance v2, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    const-string v3, "line_start: "

    .line 61
    .line 62
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    iget v3, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->line:I

    .line 66
    .line 67
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-direct {p0, p1, v2}, Lcom/android/dx/dex/file/DebugInfoEncoder;->annotate(ILjava/lang/String;)V

    .line 75
    .line 76
    .line 77
    :cond_3
    invoke-direct {p0}, Lcom/android/dx/dex/file/DebugInfoEncoder;->getParamBase()I

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    iget-object v2, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->desc:Lcom/android/dx/rop/type/Prototype;

    .line 82
    .line 83
    invoke-virtual {v2}, Lcom/android/dx/rop/type/Prototype;->getParameterTypes()Lcom/android/dx/rop/type/StdTypeList;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    invoke-virtual {v2}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    iget-boolean v4, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->isStatic:Z

    .line 92
    .line 93
    if-nez v4, :cond_6

    .line 94
    .line 95
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    :cond_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result v5

    .line 103
    if-eqz v5, :cond_5

    .line 104
    .line 105
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    check-cast v5, Lcom/android/dx/dex/code/LocalList$Entry;

    .line 110
    .line 111
    invoke-virtual {v5}, Lcom/android/dx/dex/code/LocalList$Entry;->getRegister()I

    .line 112
    .line 113
    .line 114
    move-result v6

    .line 115
    if-ne p1, v6, :cond_4

    .line 116
    .line 117
    iget-object v4, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->lastEntryForReg:[Lcom/android/dx/dex/code/LocalList$Entry;

    .line 118
    .line 119
    aput-object v5, v4, p1

    .line 120
    .line 121
    :cond_5
    add-int/lit8 p1, p1, 0x1

    .line 122
    .line 123
    :cond_6
    iget-object v4, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->output:Lcom/android/dx/util/ByteArrayAnnotatedOutput;

    .line 124
    .line 125
    invoke-virtual {v4}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->getCursor()I

    .line 126
    .line 127
    .line 128
    move-result v4

    .line 129
    iget-object v5, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->output:Lcom/android/dx/util/ByteArrayAnnotatedOutput;

    .line 130
    .line 131
    invoke-virtual {v5, v3}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->writeUleb128(I)I

    .line 132
    .line 133
    .line 134
    if-eqz v0, :cond_7

    .line 135
    .line 136
    iget-object v5, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->output:Lcom/android/dx/util/ByteArrayAnnotatedOutput;

    .line 137
    .line 138
    invoke-virtual {v5}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->getCursor()I

    .line 139
    .line 140
    .line 141
    move-result v5

    .line 142
    sub-int/2addr v5, v4

    .line 143
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v4

    .line 151
    const-string v6, "parameters_size: %04x"

    .line 152
    .line 153
    invoke-static {v6, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    invoke-direct {p0, v5, v4}, Lcom/android/dx/dex/file/DebugInfoEncoder;->annotate(ILjava/lang/String;)V

    .line 158
    .line 159
    .line 160
    :cond_7
    move v4, v1

    .line 161
    :goto_2
    if-ge v4, v3, :cond_f

    .line 162
    .line 163
    invoke-virtual {v2, v4}, Lcom/android/dx/rop/type/StdTypeList;->get(I)Lcom/android/dx/rop/type/Type;

    .line 164
    .line 165
    .line 166
    move-result-object v5

    .line 167
    iget-object v6, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->output:Lcom/android/dx/util/ByteArrayAnnotatedOutput;

    .line 168
    .line 169
    invoke-virtual {v6}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->getCursor()I

    .line 170
    .line 171
    .line 172
    move-result v6

    .line 173
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 174
    .line 175
    .line 176
    move-result-object v7

    .line 177
    :cond_8
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 178
    .line 179
    .line 180
    move-result v8

    .line 181
    const/4 v9, 0x0

    .line 182
    if-eqz v8, :cond_a

    .line 183
    .line 184
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v8

    .line 188
    check-cast v8, Lcom/android/dx/dex/code/LocalList$Entry;

    .line 189
    .line 190
    invoke-virtual {v8}, Lcom/android/dx/dex/code/LocalList$Entry;->getRegister()I

    .line 191
    .line 192
    .line 193
    move-result v10

    .line 194
    if-ne p1, v10, :cond_8

    .line 195
    .line 196
    invoke-virtual {v8}, Lcom/android/dx/dex/code/LocalList$Entry;->getSignature()Lcom/android/dx/rop/cst/CstString;

    .line 197
    .line 198
    .line 199
    move-result-object v7

    .line 200
    if-eqz v7, :cond_9

    .line 201
    .line 202
    invoke-direct {p0, v9}, Lcom/android/dx/dex/file/DebugInfoEncoder;->emitStringIndex(Lcom/android/dx/rop/cst/CstString;)V

    .line 203
    .line 204
    .line 205
    goto :goto_3

    .line 206
    :cond_9
    invoke-virtual {v8}, Lcom/android/dx/dex/code/LocalList$Entry;->getName()Lcom/android/dx/rop/cst/CstString;

    .line 207
    .line 208
    .line 209
    move-result-object v7

    .line 210
    invoke-direct {p0, v7}, Lcom/android/dx/dex/file/DebugInfoEncoder;->emitStringIndex(Lcom/android/dx/rop/cst/CstString;)V

    .line 211
    .line 212
    .line 213
    :goto_3
    iget-object v7, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->lastEntryForReg:[Lcom/android/dx/dex/code/LocalList$Entry;

    .line 214
    .line 215
    aput-object v8, v7, p1

    .line 216
    .line 217
    goto :goto_4

    .line 218
    :cond_a
    move-object v8, v9

    .line 219
    :goto_4
    if-nez v8, :cond_b

    .line 220
    .line 221
    invoke-direct {p0, v9}, Lcom/android/dx/dex/file/DebugInfoEncoder;->emitStringIndex(Lcom/android/dx/rop/cst/CstString;)V

    .line 222
    .line 223
    .line 224
    :cond_b
    if-eqz v0, :cond_e

    .line 225
    .line 226
    if-eqz v8, :cond_d

    .line 227
    .line 228
    invoke-virtual {v8}, Lcom/android/dx/dex/code/LocalList$Entry;->getSignature()Lcom/android/dx/rop/cst/CstString;

    .line 229
    .line 230
    .line 231
    move-result-object v7

    .line 232
    if-eqz v7, :cond_c

    .line 233
    .line 234
    goto :goto_5

    .line 235
    :cond_c
    invoke-virtual {v8}, Lcom/android/dx/dex/code/LocalList$Entry;->getName()Lcom/android/dx/rop/cst/CstString;

    .line 236
    .line 237
    .line 238
    move-result-object v7

    .line 239
    invoke-virtual {v7}, Lcom/android/dx/rop/cst/CstString;->toHuman()Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v7

    .line 243
    goto :goto_6

    .line 244
    :cond_d
    :goto_5
    const-string v7, "<unnamed>"

    .line 245
    .line 246
    :goto_6
    iget-object v8, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->output:Lcom/android/dx/util/ByteArrayAnnotatedOutput;

    .line 247
    .line 248
    invoke-virtual {v8}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->getCursor()I

    .line 249
    .line 250
    .line 251
    move-result v8

    .line 252
    sub-int/2addr v8, v6

    .line 253
    new-instance v6, Ljava/lang/StringBuilder;

    .line 254
    .line 255
    const-string v9, "parameter "

    .line 256
    .line 257
    invoke-direct {v6, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    const-string v7, " v"

    .line 264
    .line 265
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 266
    .line 267
    .line 268
    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 269
    .line 270
    .line 271
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v6

    .line 275
    invoke-direct {p0, v8, v6}, Lcom/android/dx/dex/file/DebugInfoEncoder;->annotate(ILjava/lang/String;)V

    .line 276
    .line 277
    .line 278
    :cond_e
    invoke-virtual {v5}, Lcom/android/dx/rop/type/Type;->getCategory()I

    .line 279
    .line 280
    .line 281
    move-result v5

    .line 282
    add-int/2addr p1, v5

    .line 283
    add-int/lit8 v4, v4, 0x1

    .line 284
    .line 285
    goto :goto_2

    .line 286
    :cond_f
    iget-object p1, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->lastEntryForReg:[Lcom/android/dx/dex/code/LocalList$Entry;

    .line 287
    .line 288
    array-length p2, p1

    .line 289
    :goto_7
    if-ge v1, p2, :cond_12

    .line 290
    .line 291
    aget-object v0, p1, v1

    .line 292
    .line 293
    if-nez v0, :cond_10

    .line 294
    .line 295
    goto :goto_8

    .line 296
    :cond_10
    invoke-virtual {v0}, Lcom/android/dx/dex/code/LocalList$Entry;->getSignature()Lcom/android/dx/rop/cst/CstString;

    .line 297
    .line 298
    .line 299
    move-result-object v2

    .line 300
    if-eqz v2, :cond_11

    .line 301
    .line 302
    invoke-direct {p0, v0}, Lcom/android/dx/dex/file/DebugInfoEncoder;->emitLocalStartExtended(Lcom/android/dx/dex/code/LocalList$Entry;)V

    .line 303
    .line 304
    .line 305
    :cond_11
    :goto_8
    add-int/lit8 v1, v1, 0x1

    .line 306
    .line 307
    goto :goto_7

    .line 308
    :cond_12
    return-void
.end method

.method private emitLocalEnd(Lcom/android/dx/dex/code/LocalList$Entry;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->output:Lcom/android/dx/util/ByteArrayAnnotatedOutput;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->getCursor()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->output:Lcom/android/dx/util/ByteArrayAnnotatedOutput;

    .line 8
    .line 9
    const/4 v2, 0x5

    .line 10
    invoke-virtual {v1, v2}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->writeByte(I)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->output:Lcom/android/dx/util/ByteArrayAnnotatedOutput;

    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/android/dx/dex/code/LocalList$Entry;->getRegister()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    invoke-virtual {v1, v2}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->writeUleb128(I)I

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->annotateTo:Lcom/android/dx/util/AnnotatedOutput;

    .line 23
    .line 24
    if-nez v1, :cond_1

    .line 25
    .line 26
    iget-object v1, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->debugPrint:Ljava/io/PrintWriter;

    .line 27
    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    return-void

    .line 32
    :cond_1
    :goto_0
    iget-object v1, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->output:Lcom/android/dx/util/ByteArrayAnnotatedOutput;

    .line 33
    .line 34
    invoke-virtual {v1}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->getCursor()I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    sub-int/2addr v1, v0

    .line 39
    iget v0, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->address:I

    .line 40
    .line 41
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-direct {p0, p1}, Lcom/android/dx/dex/file/DebugInfoEncoder;->entryAnnotationString(Lcom/android/dx/dex/code/LocalList$Entry;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    filled-new-array {v0, p1}, [Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    const-string v0, "%04x: -local %s"

    .line 54
    .line 55
    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-direct {p0, v1, p1}, Lcom/android/dx/dex/file/DebugInfoEncoder;->annotate(ILjava/lang/String;)V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method private emitLocalRestart(Lcom/android/dx/dex/code/LocalList$Entry;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->output:Lcom/android/dx/util/ByteArrayAnnotatedOutput;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->getCursor()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->output:Lcom/android/dx/util/ByteArrayAnnotatedOutput;

    .line 8
    .line 9
    const/4 v2, 0x6

    .line 10
    invoke-virtual {v1, v2}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->writeByte(I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/android/dx/dex/code/LocalList$Entry;->getRegister()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-direct {p0, v1}, Lcom/android/dx/dex/file/DebugInfoEncoder;->emitUnsignedLeb128(I)V

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->annotateTo:Lcom/android/dx/util/AnnotatedOutput;

    .line 21
    .line 22
    if-nez v1, :cond_1

    .line 23
    .line 24
    iget-object v1, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->debugPrint:Ljava/io/PrintWriter;

    .line 25
    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    return-void

    .line 30
    :cond_1
    :goto_0
    iget-object v1, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->output:Lcom/android/dx/util/ByteArrayAnnotatedOutput;

    .line 31
    .line 32
    invoke-virtual {v1}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->getCursor()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    sub-int/2addr v1, v0

    .line 37
    iget v0, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->address:I

    .line 38
    .line 39
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-direct {p0, p1}, Lcom/android/dx/dex/file/DebugInfoEncoder;->entryAnnotationString(Lcom/android/dx/dex/code/LocalList$Entry;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    filled-new-array {v0, p1}, [Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    const-string v0, "%04x: +local restart %s"

    .line 52
    .line 53
    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-direct {p0, v1, p1}, Lcom/android/dx/dex/file/DebugInfoEncoder;->annotate(ILjava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method private emitLocalStart(Lcom/android/dx/dex/code/LocalList$Entry;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/dex/code/LocalList$Entry;->getSignature()Lcom/android/dx/rop/cst/CstString;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0, p1}, Lcom/android/dx/dex/file/DebugInfoEncoder;->emitLocalStartExtended(Lcom/android/dx/dex/code/LocalList$Entry;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    iget-object v0, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->output:Lcom/android/dx/util/ByteArrayAnnotatedOutput;

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->getCursor()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iget-object v1, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->output:Lcom/android/dx/util/ByteArrayAnnotatedOutput;

    .line 18
    .line 19
    const/4 v2, 0x3

    .line 20
    invoke-virtual {v1, v2}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->writeByte(I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/android/dx/dex/code/LocalList$Entry;->getRegister()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-direct {p0, v1}, Lcom/android/dx/dex/file/DebugInfoEncoder;->emitUnsignedLeb128(I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Lcom/android/dx/dex/code/LocalList$Entry;->getName()Lcom/android/dx/rop/cst/CstString;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-direct {p0, v1}, Lcom/android/dx/dex/file/DebugInfoEncoder;->emitStringIndex(Lcom/android/dx/rop/cst/CstString;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Lcom/android/dx/dex/code/LocalList$Entry;->getType()Lcom/android/dx/rop/cst/CstType;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-direct {p0, v1}, Lcom/android/dx/dex/file/DebugInfoEncoder;->emitTypeIndex(Lcom/android/dx/rop/cst/CstType;)V

    .line 42
    .line 43
    .line 44
    iget-object v1, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->annotateTo:Lcom/android/dx/util/AnnotatedOutput;

    .line 45
    .line 46
    if-nez v1, :cond_2

    .line 47
    .line 48
    iget-object v1, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->debugPrint:Ljava/io/PrintWriter;

    .line 49
    .line 50
    if-eqz v1, :cond_1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    return-void

    .line 54
    :cond_2
    :goto_0
    iget-object v1, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->output:Lcom/android/dx/util/ByteArrayAnnotatedOutput;

    .line 55
    .line 56
    invoke-virtual {v1}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->getCursor()I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    sub-int/2addr v1, v0

    .line 61
    iget v0, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->address:I

    .line 62
    .line 63
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-direct {p0, p1}, Lcom/android/dx/dex/file/DebugInfoEncoder;->entryAnnotationString(Lcom/android/dx/dex/code/LocalList$Entry;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    filled-new-array {v0, p1}, [Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    const-string v0, "%04x: +local %s"

    .line 76
    .line 77
    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-direct {p0, v1, p1}, Lcom/android/dx/dex/file/DebugInfoEncoder;->annotate(ILjava/lang/String;)V

    .line 82
    .line 83
    .line 84
    return-void
.end method

.method private emitLocalStartExtended(Lcom/android/dx/dex/code/LocalList$Entry;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->output:Lcom/android/dx/util/ByteArrayAnnotatedOutput;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->getCursor()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->output:Lcom/android/dx/util/ByteArrayAnnotatedOutput;

    .line 8
    .line 9
    const/4 v2, 0x4

    .line 10
    invoke-virtual {v1, v2}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->writeByte(I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/android/dx/dex/code/LocalList$Entry;->getRegister()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-direct {p0, v1}, Lcom/android/dx/dex/file/DebugInfoEncoder;->emitUnsignedLeb128(I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/android/dx/dex/code/LocalList$Entry;->getName()Lcom/android/dx/rop/cst/CstString;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-direct {p0, v1}, Lcom/android/dx/dex/file/DebugInfoEncoder;->emitStringIndex(Lcom/android/dx/rop/cst/CstString;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/android/dx/dex/code/LocalList$Entry;->getType()Lcom/android/dx/rop/cst/CstType;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-direct {p0, v1}, Lcom/android/dx/dex/file/DebugInfoEncoder;->emitTypeIndex(Lcom/android/dx/rop/cst/CstType;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Lcom/android/dx/dex/code/LocalList$Entry;->getSignature()Lcom/android/dx/rop/cst/CstString;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-direct {p0, v1}, Lcom/android/dx/dex/file/DebugInfoEncoder;->emitStringIndex(Lcom/android/dx/rop/cst/CstString;)V

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->annotateTo:Lcom/android/dx/util/AnnotatedOutput;

    .line 42
    .line 43
    if-nez v1, :cond_1

    .line 44
    .line 45
    iget-object v1, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->debugPrint:Ljava/io/PrintWriter;

    .line 46
    .line 47
    if-eqz v1, :cond_0

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    return-void

    .line 51
    :cond_1
    :goto_0
    iget-object v1, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->output:Lcom/android/dx/util/ByteArrayAnnotatedOutput;

    .line 52
    .line 53
    invoke-virtual {v1}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->getCursor()I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    sub-int/2addr v1, v0

    .line 58
    iget v0, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->address:I

    .line 59
    .line 60
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-direct {p0, p1}, Lcom/android/dx/dex/file/DebugInfoEncoder;->entryAnnotationString(Lcom/android/dx/dex/code/LocalList$Entry;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    filled-new-array {v0, p1}, [Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    const-string v0, "%04x: +localx %s"

    .line 73
    .line 74
    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-direct {p0, v1, p1}, Lcom/android/dx/dex/file/DebugInfoEncoder;->annotate(ILjava/lang/String;)V

    .line 79
    .line 80
    .line 81
    return-void
.end method

.method private emitLocalsAtAddress(I)I
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->locals:Lcom/android/dx/dex/code/LocalList;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    :goto_0
    if-ge p1, v0, :cond_5

    .line 8
    .line 9
    iget-object v1, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->locals:Lcom/android/dx/dex/code/LocalList;

    .line 10
    .line 11
    invoke-virtual {v1, p1}, Lcom/android/dx/dex/code/LocalList;->get(I)Lcom/android/dx/dex/code/LocalList$Entry;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1}, Lcom/android/dx/dex/code/LocalList$Entry;->getAddress()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    iget v2, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->address:I

    .line 20
    .line 21
    if-ne v1, v2, :cond_5

    .line 22
    .line 23
    iget-object v1, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->locals:Lcom/android/dx/dex/code/LocalList;

    .line 24
    .line 25
    add-int/lit8 v2, p1, 0x1

    .line 26
    .line 27
    invoke-virtual {v1, p1}, Lcom/android/dx/dex/code/LocalList;->get(I)Lcom/android/dx/dex/code/LocalList$Entry;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1}, Lcom/android/dx/dex/code/LocalList$Entry;->getRegister()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    iget-object v3, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->lastEntryForReg:[Lcom/android/dx/dex/code/LocalList$Entry;

    .line 36
    .line 37
    aget-object v4, v3, v1

    .line 38
    .line 39
    if-ne p1, v4, :cond_0

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_0
    aput-object p1, v3, v1

    .line 43
    .line 44
    invoke-virtual {p1}, Lcom/android/dx/dex/code/LocalList$Entry;->isStart()Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_3

    .line 49
    .line 50
    if-eqz v4, :cond_2

    .line 51
    .line 52
    invoke-virtual {p1, v4}, Lcom/android/dx/dex/code/LocalList$Entry;->matches(Lcom/android/dx/dex/code/LocalList$Entry;)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_2

    .line 57
    .line 58
    invoke-virtual {v4}, Lcom/android/dx/dex/code/LocalList$Entry;->isStart()Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-nez v1, :cond_1

    .line 63
    .line 64
    invoke-direct {p0, p1}, Lcom/android/dx/dex/file/DebugInfoEncoder;->emitLocalRestart(Lcom/android/dx/dex/code/LocalList$Entry;)V

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_1
    const-string p0, "shouldn\'t happen"

    .line 69
    .line 70
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    const/4 p0, 0x0

    .line 74
    return p0

    .line 75
    :cond_2
    invoke-direct {p0, p1}, Lcom/android/dx/dex/file/DebugInfoEncoder;->emitLocalStart(Lcom/android/dx/dex/code/LocalList$Entry;)V

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_3
    invoke-virtual {p1}, Lcom/android/dx/dex/code/LocalList$Entry;->getDisposition()Lcom/android/dx/dex/code/LocalList$Disposition;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    sget-object v3, Lcom/android/dx/dex/code/LocalList$Disposition;->END_REPLACED:Lcom/android/dx/dex/code/LocalList$Disposition;

    .line 84
    .line 85
    if-eq v1, v3, :cond_4

    .line 86
    .line 87
    invoke-direct {p0, p1}, Lcom/android/dx/dex/file/DebugInfoEncoder;->emitLocalEnd(Lcom/android/dx/dex/code/LocalList$Entry;)V

    .line 88
    .line 89
    .line 90
    :cond_4
    :goto_1
    move p1, v2

    .line 91
    goto :goto_0

    .line 92
    :cond_5
    return p1
.end method

.method private emitPosition(Lcom/android/dx/dex/code/PositionList$Entry;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/dex/code/PositionList$Entry;->getPosition()Lcom/android/dx/rop/code/SourcePosition;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/android/dx/rop/code/SourcePosition;->getLine()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p1}, Lcom/android/dx/dex/code/PositionList$Entry;->getAddress()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    iget v1, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->line:I

    .line 14
    .line 15
    sub-int/2addr v0, v1

    .line 16
    iget v1, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->address:I

    .line 17
    .line 18
    sub-int/2addr p1, v1

    .line 19
    if-ltz p1, :cond_6

    .line 20
    .line 21
    const/4 v1, -0x4

    .line 22
    const/4 v2, 0x0

    .line 23
    if-lt v0, v1, :cond_0

    .line 24
    .line 25
    const/16 v1, 0xa

    .line 26
    .line 27
    if-le v0, v1, :cond_1

    .line 28
    .line 29
    :cond_0
    invoke-direct {p0, v0}, Lcom/android/dx/dex/file/DebugInfoEncoder;->emitAdvanceLine(I)V

    .line 30
    .line 31
    .line 32
    move v0, v2

    .line 33
    :cond_1
    invoke-static {v0, p1}, Lcom/android/dx/dex/file/DebugInfoEncoder;->computeOpcode(II)I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    and-int/lit16 v3, v1, -0x100

    .line 38
    .line 39
    if-lez v3, :cond_3

    .line 40
    .line 41
    invoke-direct {p0, p1}, Lcom/android/dx/dex/file/DebugInfoEncoder;->emitAdvancePc(I)V

    .line 42
    .line 43
    .line 44
    invoke-static {v0, v2}, Lcom/android/dx/dex/file/DebugInfoEncoder;->computeOpcode(II)I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    and-int/lit16 p1, v1, -0x100

    .line 49
    .line 50
    if-lez p1, :cond_2

    .line 51
    .line 52
    invoke-direct {p0, v0}, Lcom/android/dx/dex/file/DebugInfoEncoder;->emitAdvanceLine(I)V

    .line 53
    .line 54
    .line 55
    invoke-static {v2, v2}, Lcom/android/dx/dex/file/DebugInfoEncoder;->computeOpcode(II)I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    move p1, v2

    .line 60
    goto :goto_0

    .line 61
    :cond_2
    move p1, v2

    .line 62
    :cond_3
    move v2, v0

    .line 63
    :goto_0
    iget-object v0, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->output:Lcom/android/dx/util/ByteArrayAnnotatedOutput;

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->writeByte(I)V

    .line 66
    .line 67
    .line 68
    iget v0, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->line:I

    .line 69
    .line 70
    add-int/2addr v0, v2

    .line 71
    iput v0, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->line:I

    .line 72
    .line 73
    iget v0, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->address:I

    .line 74
    .line 75
    add-int/2addr v0, p1

    .line 76
    iput v0, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->address:I

    .line 77
    .line 78
    iget-object p1, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->annotateTo:Lcom/android/dx/util/AnnotatedOutput;

    .line 79
    .line 80
    if-nez p1, :cond_5

    .line 81
    .line 82
    iget-object p1, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->debugPrint:Ljava/io/PrintWriter;

    .line 83
    .line 84
    if-eqz p1, :cond_4

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_4
    return-void

    .line 88
    :cond_5
    :goto_1
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    iget v0, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->line:I

    .line 93
    .line 94
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    filled-new-array {p1, v0}, [Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    const-string v0, "%04x: line %d"

    .line 103
    .line 104
    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    const/4 v0, 0x1

    .line 109
    invoke-direct {p0, v0, p1}, Lcom/android/dx/dex/file/DebugInfoEncoder;->annotate(ILjava/lang/String;)V

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :cond_6
    const-string p0, "Position entries must be in ascending address order"

    .line 114
    .line 115
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    return-void
.end method

.method private emitPositionsAtAddress(ILjava/util/ArrayList;)I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/ArrayList<",
            "Lcom/android/dx/dex/code/PositionList$Entry;",
            ">;)I"
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    :goto_0
    if-ge p1, v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Lcom/android/dx/dex/code/PositionList$Entry;

    .line 12
    .line 13
    invoke-virtual {v1}, Lcom/android/dx/dex/code/PositionList$Entry;->getAddress()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    iget v2, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->address:I

    .line 18
    .line 19
    if-ne v1, v2, :cond_0

    .line 20
    .line 21
    add-int/lit8 v1, p1, 0x1

    .line 22
    .line 23
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lcom/android/dx/dex/code/PositionList$Entry;

    .line 28
    .line 29
    invoke-direct {p0, p1}, Lcom/android/dx/dex/file/DebugInfoEncoder;->emitPosition(Lcom/android/dx/dex/code/PositionList$Entry;)V

    .line 30
    .line 31
    .line 32
    move p1, v1

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    return p1
.end method

.method private emitStringIndex(Lcom/android/dx/rop/cst/CstString;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->file:Lcom/android/dx/dex/file/DexFile;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object p0, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->output:Lcom/android/dx/util/ByteArrayAnnotatedOutput;

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/android/dx/dex/file/DexFile;->getStringIds()Lcom/android/dx/dex/file/StringIdsSection;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0, p1}, Lcom/android/dx/dex/file/StringIdsSection;->indexOf(Lcom/android/dx/rop/cst/CstString;)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    add-int/lit8 p1, p1, 0x1

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->writeUleb128(I)I

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    :goto_0
    iget-object p0, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->output:Lcom/android/dx/util/ByteArrayAnnotatedOutput;

    .line 25
    .line 26
    const/4 p1, 0x0

    .line 27
    invoke-virtual {p0, p1}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->writeUleb128(I)I

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method private emitTypeIndex(Lcom/android/dx/rop/cst/CstType;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->file:Lcom/android/dx/dex/file/DexFile;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object p0, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->output:Lcom/android/dx/util/ByteArrayAnnotatedOutput;

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/android/dx/dex/file/DexFile;->getTypeIds()Lcom/android/dx/dex/file/TypeIdsSection;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0, p1}, Lcom/android/dx/dex/file/TypeIdsSection;->indexOf(Lcom/android/dx/rop/cst/CstType;)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    add-int/lit8 p1, p1, 0x1

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->writeUleb128(I)I

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    :goto_0
    iget-object p0, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->output:Lcom/android/dx/util/ByteArrayAnnotatedOutput;

    .line 25
    .line 26
    const/4 p1, 0x0

    .line 27
    invoke-virtual {p0, p1}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->writeUleb128(I)I

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method private emitUnsignedLeb128(I)V
    .locals 0

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    iget-object p0, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->output:Lcom/android/dx/util/ByteArrayAnnotatedOutput;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->writeUleb128(I)I

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    const-string p0, "Signed value where unsigned required: "

    .line 10
    .line 11
    invoke-static {p1, p0}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(ILjava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method private entryAnnotationString(Lcom/android/dx/dex/code/LocalList$Entry;)Ljava/lang/String;
    .locals 3

    .line 1
    new-instance p0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v0, "v"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/android/dx/dex/code/LocalList$Entry;->getRegister()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const/16 v0, 0x20

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/android/dx/dex/code/LocalList$Entry;->getName()Lcom/android/dx/rop/cst/CstString;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    const-string v2, "null"

    .line 25
    .line 26
    if-nez v1, :cond_0

    .line 27
    .line 28
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-virtual {v1}, Lcom/android/dx/rop/cst/CstString;->toHuman()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    :goto_0
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Lcom/android/dx/dex/code/LocalList$Entry;->getType()Lcom/android/dx/rop/cst/CstType;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    if-nez v1, :cond_1

    .line 47
    .line 48
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    invoke-virtual {v1}, Lcom/android/dx/rop/cst/CstType;->toHuman()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    :goto_1
    invoke-virtual {p1}, Lcom/android/dx/dex/code/LocalList$Entry;->getSignature()Lcom/android/dx/rop/cst/CstString;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    if-eqz p1, :cond_2

    .line 64
    .line 65
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1}, Lcom/android/dx/rop/cst/CstString;->toHuman()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    :cond_2
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    return-object p0
.end method

.method private extractMethodArguments()Ljava/util/ArrayList;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/android/dx/dex/code/LocalList$Entry;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->desc:Lcom/android/dx/rop/type/Prototype;

    .line 4
    .line 5
    invoke-virtual {v1}, Lcom/android/dx/rop/type/Prototype;->getParameterTypes()Lcom/android/dx/rop/type/StdTypeList;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Lcom/android/dx/dex/file/DebugInfoEncoder;->getParamBase()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    new-instance v2, Ljava/util/BitSet;

    .line 21
    .line 22
    iget v3, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->regSize:I

    .line 23
    .line 24
    sub-int/2addr v3, v1

    .line 25
    invoke-direct {v2, v3}, Ljava/util/BitSet;-><init>(I)V

    .line 26
    .line 27
    .line 28
    iget-object v3, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->locals:Lcom/android/dx/dex/code/LocalList;

    .line 29
    .line 30
    invoke-virtual {v3}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    const/4 v4, 0x0

    .line 35
    :goto_0
    if-ge v4, v3, :cond_2

    .line 36
    .line 37
    iget-object v5, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->locals:Lcom/android/dx/dex/code/LocalList;

    .line 38
    .line 39
    invoke-virtual {v5, v4}, Lcom/android/dx/dex/code/LocalList;->get(I)Lcom/android/dx/dex/code/LocalList$Entry;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    invoke-virtual {v5}, Lcom/android/dx/dex/code/LocalList$Entry;->getRegister()I

    .line 44
    .line 45
    .line 46
    move-result v6

    .line 47
    if-ge v6, v1, :cond_0

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_0
    sub-int/2addr v6, v1

    .line 51
    invoke-virtual {v2, v6}, Ljava/util/BitSet;->get(I)Z

    .line 52
    .line 53
    .line 54
    move-result v7

    .line 55
    if-eqz v7, :cond_1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    invoke-virtual {v2, v6}, Ljava/util/BitSet;->set(I)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    :goto_1
    add-int/lit8 v4, v4, 0x1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    new-instance v1, Lcom/android/dx/dex/file/DebugInfoEncoder$2;

    .line 68
    .line 69
    invoke-direct {v1, p0}, Lcom/android/dx/dex/file/DebugInfoEncoder$2;-><init>(Lcom/android/dx/dex/file/DebugInfoEncoder;)V

    .line 70
    .line 71
    .line 72
    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 73
    .line 74
    .line 75
    return-object v0
.end method

.method private getParamBase()I
    .locals 2

    .line 1
    iget v0, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->regSize:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->desc:Lcom/android/dx/rop/type/Prototype;

    .line 4
    .line 5
    invoke-virtual {v1}, Lcom/android/dx/rop/type/Prototype;->getParameterTypes()Lcom/android/dx/rop/type/StdTypeList;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Lcom/android/dx/rop/type/StdTypeList;->getWordCount()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    sub-int/2addr v0, v1

    .line 14
    iget-boolean p0, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->isStatic:Z

    .line 15
    .line 16
    xor-int/lit8 p0, p0, 0x1

    .line 17
    .line 18
    sub-int/2addr v0, p0

    .line 19
    return v0
.end method


# virtual methods
.method public convert()[B
    .locals 1

    .line 1
    :try_start_0
    invoke-direct {p0}, Lcom/android/dx/dex/file/DebugInfoEncoder;->convert0()[B

    .line 2
    .line 3
    .line 4
    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    return-object p0

    .line 6
    :catch_0
    move-exception p0

    .line 7
    const-string v0, "...while encoding debug info"

    .line 8
    .line 9
    invoke-static {p0, v0}, Lcom/android/dex/util/ExceptionWithContext;->withContext(Ljava/lang/Throwable;Ljava/lang/String;)Lcom/android/dex/util/ExceptionWithContext;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    throw p0
.end method

.method public convertAndAnnotate(Ljava/lang/String;Ljava/io/PrintWriter;Lcom/android/dx/util/AnnotatedOutput;Z)[B
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->prefix:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->debugPrint:Ljava/io/PrintWriter;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->annotateTo:Lcom/android/dx/util/AnnotatedOutput;

    .line 6
    .line 7
    iput-boolean p4, p0, Lcom/android/dx/dex/file/DebugInfoEncoder;->shouldConsume:Z

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/android/dx/dex/file/DebugInfoEncoder;->convert()[B

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method
