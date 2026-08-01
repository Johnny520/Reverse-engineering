.class public Lcom/android/dx/ssa/SsaConverter;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final DEBUG:Z = false


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static convertToSsaMethod(Lcom/android/dx/rop/code/RopMethod;IZ)Lcom/android/dx/ssa/SsaMethod;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/android/dx/ssa/SsaMethod;->newFromRopMethod(Lcom/android/dx/rop/code/RopMethod;IZ)Lcom/android/dx/ssa/SsaMethod;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lcom/android/dx/ssa/SsaConverter;->edgeSplit(Lcom/android/dx/ssa/SsaMethod;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Lcom/android/dx/ssa/LocalVariableExtractor;->extract(Lcom/android/dx/ssa/SsaMethod;)Lcom/android/dx/ssa/LocalVariableInfo;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const/4 p2, 0x0

    .line 13
    invoke-static {p0, p1, p2}, Lcom/android/dx/ssa/SsaConverter;->placePhiFunctions(Lcom/android/dx/ssa/SsaMethod;Lcom/android/dx/ssa/LocalVariableInfo;I)V

    .line 14
    .line 15
    .line 16
    new-instance p1, Lcom/android/dx/ssa/SsaRenamer;

    .line 17
    .line 18
    invoke-direct {p1, p0}, Lcom/android/dx/ssa/SsaRenamer;-><init>(Lcom/android/dx/ssa/SsaMethod;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaRenamer;->run()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/android/dx/ssa/SsaMethod;->makeExitBlock()V

    .line 25
    .line 26
    .line 27
    return-object p0
.end method

.method private static edgeSplit(Lcom/android/dx/ssa/SsaMethod;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/android/dx/ssa/SsaConverter;->edgeSplitPredecessors(Lcom/android/dx/ssa/SsaMethod;)V

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Lcom/android/dx/ssa/SsaConverter;->edgeSplitMoveExceptionsAndResults(Lcom/android/dx/ssa/SsaMethod;)V

    .line 5
    .line 6
    .line 7
    invoke-static {p0}, Lcom/android/dx/ssa/SsaConverter;->edgeSplitSuccessors(Lcom/android/dx/ssa/SsaMethod;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private static edgeSplitMoveExceptionsAndResults(Lcom/android/dx/ssa/SsaMethod;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/ssa/SsaMethod;->getBlocks()Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    sub-int/2addr v0, v1

    .line 11
    :goto_0
    if-ltz v0, :cond_2

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Lcom/android/dx/ssa/SsaBasicBlock;

    .line 18
    .line 19
    invoke-virtual {v2}, Lcom/android/dx/ssa/SsaBasicBlock;->isExitBlock()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-nez v3, :cond_1

    .line 24
    .line 25
    invoke-virtual {v2}, Lcom/android/dx/ssa/SsaBasicBlock;->getPredecessors()Ljava/util/BitSet;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-virtual {v3}, Ljava/util/BitSet;->cardinality()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-le v3, v1, :cond_1

    .line 34
    .line 35
    invoke-virtual {v2}, Lcom/android/dx/ssa/SsaBasicBlock;->getInsns()Ljava/util/ArrayList;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    const/4 v4, 0x0

    .line 40
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    check-cast v3, Lcom/android/dx/ssa/SsaInsn;

    .line 45
    .line 46
    invoke-virtual {v3}, Lcom/android/dx/ssa/SsaInsn;->isMoveException()Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-eqz v3, :cond_1

    .line 51
    .line 52
    invoke-virtual {v2}, Lcom/android/dx/ssa/SsaBasicBlock;->getPredecessors()Ljava/util/BitSet;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    invoke-virtual {v3}, Ljava/util/BitSet;->clone()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    check-cast v3, Ljava/util/BitSet;

    .line 61
    .line 62
    invoke-virtual {v3, v4}, Ljava/util/BitSet;->nextSetBit(I)I

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    :goto_1
    if-ltz v5, :cond_0

    .line 67
    .line 68
    invoke-virtual {p0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    check-cast v6, Lcom/android/dx/ssa/SsaBasicBlock;

    .line 73
    .line 74
    invoke-virtual {v6, v2}, Lcom/android/dx/ssa/SsaBasicBlock;->insertNewSuccessor(Lcom/android/dx/ssa/SsaBasicBlock;)Lcom/android/dx/ssa/SsaBasicBlock;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    invoke-virtual {v6}, Lcom/android/dx/ssa/SsaBasicBlock;->getInsns()Ljava/util/ArrayList;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    invoke-virtual {v2}, Lcom/android/dx/ssa/SsaBasicBlock;->getInsns()Ljava/util/ArrayList;

    .line 83
    .line 84
    .line 85
    move-result-object v7

    .line 86
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v7

    .line 90
    check-cast v7, Lcom/android/dx/ssa/SsaInsn;

    .line 91
    .line 92
    invoke-virtual {v7}, Lcom/android/dx/ssa/SsaInsn;->clone()Lcom/android/dx/ssa/SsaInsn;

    .line 93
    .line 94
    .line 95
    move-result-object v7

    .line 96
    invoke-virtual {v6, v4, v7}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    add-int/lit8 v5, v5, 0x1

    .line 100
    .line 101
    invoke-virtual {v3, v5}, Ljava/util/BitSet;->nextSetBit(I)I

    .line 102
    .line 103
    .line 104
    move-result v5

    .line 105
    goto :goto_1

    .line 106
    :cond_0
    invoke-virtual {v2}, Lcom/android/dx/ssa/SsaBasicBlock;->getInsns()Ljava/util/ArrayList;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    :cond_1
    add-int/lit8 v0, v0, -0x1

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_2
    return-void
.end method

.method private static edgeSplitPredecessors(Lcom/android/dx/ssa/SsaMethod;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/ssa/SsaMethod;->getBlocks()Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    add-int/lit8 v0, v0, -0x1

    .line 10
    .line 11
    :goto_0
    if-ltz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lcom/android/dx/ssa/SsaBasicBlock;

    .line 18
    .line 19
    invoke-static {v1}, Lcom/android/dx/ssa/SsaConverter;->nodeNeedsUniquePredecessor(Lcom/android/dx/ssa/SsaBasicBlock;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    invoke-virtual {v1}, Lcom/android/dx/ssa/SsaBasicBlock;->insertNewPredecessor()Lcom/android/dx/ssa/SsaBasicBlock;

    .line 26
    .line 27
    .line 28
    :cond_0
    add-int/lit8 v0, v0, -0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    return-void
.end method

.method private static edgeSplitSuccessors(Lcom/android/dx/ssa/SsaMethod;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/ssa/SsaMethod;->getBlocks()Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    add-int/lit8 v0, v0, -0x1

    .line 10
    .line 11
    :goto_0
    if-ltz v0, :cond_2

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lcom/android/dx/ssa/SsaBasicBlock;

    .line 18
    .line 19
    invoke-virtual {v1}, Lcom/android/dx/ssa/SsaBasicBlock;->getSuccessors()Ljava/util/BitSet;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v2}, Ljava/util/BitSet;->clone()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Ljava/util/BitSet;

    .line 28
    .line 29
    const/4 v3, 0x0

    .line 30
    invoke-virtual {v2, v3}, Ljava/util/BitSet;->nextSetBit(I)I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    :goto_1
    if-ltz v3, :cond_1

    .line 35
    .line 36
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    check-cast v4, Lcom/android/dx/ssa/SsaBasicBlock;

    .line 41
    .line 42
    invoke-static {v1, v4}, Lcom/android/dx/ssa/SsaConverter;->needsNewSuccessor(Lcom/android/dx/ssa/SsaBasicBlock;Lcom/android/dx/ssa/SsaBasicBlock;)Z

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    if-eqz v5, :cond_0

    .line 47
    .line 48
    invoke-virtual {v1, v4}, Lcom/android/dx/ssa/SsaBasicBlock;->insertNewSuccessor(Lcom/android/dx/ssa/SsaBasicBlock;)Lcom/android/dx/ssa/SsaBasicBlock;

    .line 49
    .line 50
    .line 51
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 52
    .line 53
    invoke-virtual {v2, v3}, Ljava/util/BitSet;->nextSetBit(I)I

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    goto :goto_1

    .line 58
    :cond_1
    add-int/lit8 v0, v0, -0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    return-void
.end method

.method private static needsNewSuccessor(Lcom/android/dx/ssa/SsaBasicBlock;Lcom/android/dx/ssa/SsaBasicBlock;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/ssa/SsaBasicBlock;->getInsns()Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-static {v1, v0}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰(ILjava/util/ArrayList;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Lcom/android/dx/ssa/SsaInsn;

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/android/dx/ssa/SsaBasicBlock;->getSuccessors()Ljava/util/BitSet;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0}, Ljava/util/BitSet;->cardinality()I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    if-le p0, v1, :cond_0

    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaBasicBlock;->getPredecessors()Ljava/util/BitSet;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0}, Ljava/util/BitSet;->cardinality()I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-le p0, v1, :cond_0

    .line 31
    .line 32
    return v1

    .line 33
    :cond_0
    invoke-virtual {v0}, Lcom/android/dx/ssa/SsaInsn;->getResult()Lcom/android/dx/rop/code/RegisterSpec;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    if-nez p0, :cond_1

    .line 38
    .line 39
    invoke-virtual {v0}, Lcom/android/dx/ssa/SsaInsn;->getSources()Lcom/android/dx/rop/code/RegisterSpecList;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {p0}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    if-lez p0, :cond_2

    .line 48
    .line 49
    :cond_1
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaBasicBlock;->getPredecessors()Ljava/util/BitSet;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-virtual {p0}, Ljava/util/BitSet;->cardinality()I

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    if-le p0, v1, :cond_2

    .line 58
    .line 59
    return v1

    .line 60
    :cond_2
    const/4 p0, 0x0

    .line 61
    return p0
.end method

.method private static nodeNeedsUniquePredecessor(Lcom/android/dx/ssa/SsaBasicBlock;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/ssa/SsaBasicBlock;->getPredecessors()Ljava/util/BitSet;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/util/BitSet;->cardinality()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p0}, Lcom/android/dx/ssa/SsaBasicBlock;->getSuccessors()Ljava/util/BitSet;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Ljava/util/BitSet;->cardinality()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    const/4 v1, 0x1

    .line 18
    if-le v0, v1, :cond_0

    .line 19
    .line 20
    if-le p0, v1, :cond_0

    .line 21
    .line 22
    return v1

    .line 23
    :cond_0
    const/4 p0, 0x0

    .line 24
    return p0
.end method

.method private static placePhiFunctions(Lcom/android/dx/ssa/SsaMethod;Lcom/android/dx/ssa/LocalVariableInfo;I)V
    .locals 11

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/ssa/SsaMethod;->getBlocks()Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p0}, Lcom/android/dx/ssa/SsaMethod;->getRegCount()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    sub-int/2addr v2, p2

    .line 14
    new-instance v3, Lcom/android/dx/ssa/DomFront;

    .line 15
    .line 16
    invoke-direct {v3, p0}, Lcom/android/dx/ssa/DomFront;-><init>(Lcom/android/dx/ssa/SsaMethod;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v3}, Lcom/android/dx/ssa/DomFront;->run()[Lcom/android/dx/ssa/DomFront$DomInfo;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    new-array v3, v2, [Ljava/util/BitSet;

    .line 24
    .line 25
    new-array v4, v2, [Ljava/util/BitSet;

    .line 26
    .line 27
    const/4 v5, 0x0

    .line 28
    move v6, v5

    .line 29
    :goto_0
    if-ge v6, v2, :cond_0

    .line 30
    .line 31
    new-instance v7, Ljava/util/BitSet;

    .line 32
    .line 33
    invoke-direct {v7, v1}, Ljava/util/BitSet;-><init>(I)V

    .line 34
    .line 35
    .line 36
    aput-object v7, v3, v6

    .line 37
    .line 38
    new-instance v7, Ljava/util/BitSet;

    .line 39
    .line 40
    invoke-direct {v7, v1}, Ljava/util/BitSet;-><init>(I)V

    .line 41
    .line 42
    .line 43
    aput-object v7, v4, v6

    .line 44
    .line 45
    add-int/lit8 v6, v6, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    move v6, v5

    .line 53
    :goto_1
    if-ge v6, v1, :cond_3

    .line 54
    .line 55
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v7

    .line 59
    check-cast v7, Lcom/android/dx/ssa/SsaBasicBlock;

    .line 60
    .line 61
    invoke-virtual {v7}, Lcom/android/dx/ssa/SsaBasicBlock;->getInsns()Ljava/util/ArrayList;

    .line 62
    .line 63
    .line 64
    move-result-object v7

    .line 65
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object v7

    .line 69
    :cond_1
    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result v8

    .line 73
    if-eqz v8, :cond_2

    .line 74
    .line 75
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v8

    .line 79
    check-cast v8, Lcom/android/dx/ssa/SsaInsn;

    .line 80
    .line 81
    invoke-virtual {v8}, Lcom/android/dx/ssa/SsaInsn;->getResult()Lcom/android/dx/rop/code/RegisterSpec;

    .line 82
    .line 83
    .line 84
    move-result-object v8

    .line 85
    if-eqz v8, :cond_1

    .line 86
    .line 87
    invoke-virtual {v8}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 88
    .line 89
    .line 90
    move-result v9

    .line 91
    sub-int/2addr v9, p2

    .line 92
    if-ltz v9, :cond_1

    .line 93
    .line 94
    invoke-virtual {v8}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 95
    .line 96
    .line 97
    move-result v8

    .line 98
    sub-int/2addr v8, p2

    .line 99
    aget-object v8, v3, v8

    .line 100
    .line 101
    invoke-virtual {v8, v6}, Ljava/util/BitSet;->set(I)V

    .line 102
    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_2
    add-int/lit8 v6, v6, 0x1

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_3
    move v1, v5

    .line 109
    :goto_3
    if-ge v1, v2, :cond_8

    .line 110
    .line 111
    aget-object v6, v3, v1

    .line 112
    .line 113
    invoke-virtual {v6}, Ljava/util/BitSet;->clone()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v6

    .line 117
    check-cast v6, Ljava/util/BitSet;

    .line 118
    .line 119
    :cond_4
    invoke-virtual {v6, v5}, Ljava/util/BitSet;->nextSetBit(I)I

    .line 120
    .line 121
    .line 122
    move-result v7

    .line 123
    if-ltz v7, :cond_7

    .line 124
    .line 125
    invoke-virtual {v6, v7}, Ljava/util/BitSet;->clear(I)V

    .line 126
    .line 127
    .line 128
    aget-object v7, p0, v7

    .line 129
    .line 130
    iget-object v7, v7, Lcom/android/dx/ssa/DomFront$DomInfo;->dominanceFrontiers:Lcom/android/dx/util/IntSet;

    .line 131
    .line 132
    invoke-interface {v7}, Lcom/android/dx/util/IntSet;->iterator()Lcom/android/dx/util/IntIterator;

    .line 133
    .line 134
    .line 135
    move-result-object v7

    .line 136
    :cond_5
    :goto_4
    invoke-interface {v7}, Lcom/android/dx/util/IntIterator;->hasNext()Z

    .line 137
    .line 138
    .line 139
    move-result v8

    .line 140
    if-eqz v8, :cond_4

    .line 141
    .line 142
    invoke-interface {v7}, Lcom/android/dx/util/IntIterator;->next()I

    .line 143
    .line 144
    .line 145
    move-result v8

    .line 146
    aget-object v9, v4, v1

    .line 147
    .line 148
    invoke-virtual {v9, v8}, Ljava/util/BitSet;->get(I)Z

    .line 149
    .line 150
    .line 151
    move-result v9

    .line 152
    if-nez v9, :cond_5

    .line 153
    .line 154
    aget-object v9, v4, v1

    .line 155
    .line 156
    invoke-virtual {v9, v8}, Ljava/util/BitSet;->set(I)V

    .line 157
    .line 158
    .line 159
    add-int v9, v1, p2

    .line 160
    .line 161
    invoke-virtual {p1, v8}, Lcom/android/dx/ssa/LocalVariableInfo;->getStarts(I)Lcom/android/dx/rop/code/RegisterSpecSet;

    .line 162
    .line 163
    .line 164
    move-result-object v10

    .line 165
    invoke-virtual {v10, v9}, Lcom/android/dx/rop/code/RegisterSpecSet;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 166
    .line 167
    .line 168
    move-result-object v10

    .line 169
    if-nez v10, :cond_6

    .line 170
    .line 171
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v10

    .line 175
    check-cast v10, Lcom/android/dx/ssa/SsaBasicBlock;

    .line 176
    .line 177
    invoke-virtual {v10, v9}, Lcom/android/dx/ssa/SsaBasicBlock;->addPhiInsnForReg(I)V

    .line 178
    .line 179
    .line 180
    goto :goto_5

    .line 181
    :cond_6
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v9

    .line 185
    check-cast v9, Lcom/android/dx/ssa/SsaBasicBlock;

    .line 186
    .line 187
    invoke-virtual {v9, v10}, Lcom/android/dx/ssa/SsaBasicBlock;->addPhiInsnForReg(Lcom/android/dx/rop/code/RegisterSpec;)V

    .line 188
    .line 189
    .line 190
    :goto_5
    aget-object v9, v3, v1

    .line 191
    .line 192
    invoke-virtual {v9, v8}, Ljava/util/BitSet;->get(I)Z

    .line 193
    .line 194
    .line 195
    move-result v9

    .line 196
    if-nez v9, :cond_5

    .line 197
    .line 198
    invoke-virtual {v6, v8}, Ljava/util/BitSet;->set(I)V

    .line 199
    .line 200
    .line 201
    goto :goto_4

    .line 202
    :cond_7
    add-int/lit8 v1, v1, 0x1

    .line 203
    .line 204
    goto :goto_3

    .line 205
    :cond_8
    return-void
.end method

.method public static testEdgeSplit(Lcom/android/dx/rop/code/RopMethod;IZ)Lcom/android/dx/ssa/SsaMethod;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/android/dx/ssa/SsaMethod;->newFromRopMethod(Lcom/android/dx/rop/code/RopMethod;IZ)Lcom/android/dx/ssa/SsaMethod;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lcom/android/dx/ssa/SsaConverter;->edgeSplit(Lcom/android/dx/ssa/SsaMethod;)V

    .line 6
    .line 7
    .line 8
    return-object p0
.end method

.method public static testPhiPlacement(Lcom/android/dx/rop/code/RopMethod;IZ)Lcom/android/dx/ssa/SsaMethod;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/android/dx/ssa/SsaMethod;->newFromRopMethod(Lcom/android/dx/rop/code/RopMethod;IZ)Lcom/android/dx/ssa/SsaMethod;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lcom/android/dx/ssa/SsaConverter;->edgeSplit(Lcom/android/dx/ssa/SsaMethod;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Lcom/android/dx/ssa/LocalVariableExtractor;->extract(Lcom/android/dx/ssa/SsaMethod;)Lcom/android/dx/ssa/LocalVariableInfo;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const/4 p2, 0x0

    .line 13
    invoke-static {p0, p1, p2}, Lcom/android/dx/ssa/SsaConverter;->placePhiFunctions(Lcom/android/dx/ssa/SsaMethod;Lcom/android/dx/ssa/LocalVariableInfo;I)V

    .line 14
    .line 15
    .line 16
    return-object p0
.end method

.method public static updateSsaMethod(Lcom/android/dx/ssa/SsaMethod;I)V
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/android/dx/ssa/LocalVariableExtractor;->extract(Lcom/android/dx/ssa/SsaMethod;)Lcom/android/dx/ssa/LocalVariableInfo;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p0, v0, p1}, Lcom/android/dx/ssa/SsaConverter;->placePhiFunctions(Lcom/android/dx/ssa/SsaMethod;Lcom/android/dx/ssa/LocalVariableInfo;I)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Lcom/android/dx/ssa/SsaRenamer;

    .line 9
    .line 10
    invoke-direct {v0, p0, p1}, Lcom/android/dx/ssa/SsaRenamer;-><init>(Lcom/android/dx/ssa/SsaMethod;I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/android/dx/ssa/SsaRenamer;->run()V

    .line 14
    .line 15
    .line 16
    return-void
.end method
