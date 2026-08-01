.class public Lcom/android/dx/ssa/DeadCodeRemover;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/dx/ssa/DeadCodeRemover$NoSideEffectVisitor;
    }
.end annotation


# instance fields
.field private final regCount:I

.field private final ssaMeth:Lcom/android/dx/ssa/SsaMethod;

.field private final useList:[Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/util/ArrayList<",
            "Lcom/android/dx/ssa/SsaInsn;",
            ">;"
        }
    .end annotation
.end field

.field private final worklist:Ljava/util/BitSet;


# direct methods
.method private constructor <init>(Lcom/android/dx/ssa/SsaMethod;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/android/dx/ssa/DeadCodeRemover;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaMethod;->getRegCount()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iput v0, p0, Lcom/android/dx/ssa/DeadCodeRemover;->regCount:I

    .line 11
    .line 12
    new-instance v1, Ljava/util/BitSet;

    .line 13
    .line 14
    invoke-direct {v1, v0}, Ljava/util/BitSet;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object v1, p0, Lcom/android/dx/ssa/DeadCodeRemover;->worklist:Ljava/util/BitSet;

    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaMethod;->getUseListCopy()[Ljava/util/ArrayList;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, p0, Lcom/android/dx/ssa/DeadCodeRemover;->useList:[Ljava/util/ArrayList;

    .line 24
    .line 25
    return-void
.end method

.method public static synthetic access$000(Lcom/android/dx/ssa/SsaInsn;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/android/dx/ssa/DeadCodeRemover;->hasSideEffect(Lcom/android/dx/ssa/SsaInsn;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private static hasSideEffect(Lcom/android/dx/ssa/SsaInsn;)Z
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    return p0

    .line 5
    :cond_0
    invoke-virtual {p0}, Lcom/android/dx/ssa/SsaInsn;->hasSideEffect()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method private isCircularNoSideEffect(ILjava/util/BitSet;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eqz p2, :cond_0

    .line 3
    .line 4
    invoke-virtual {p2, p1}, Ljava/util/BitSet;->get(I)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    return v0

    .line 11
    :cond_0
    iget-object v1, p0, Lcom/android/dx/ssa/DeadCodeRemover;->useList:[Ljava/util/ArrayList;

    .line 12
    .line 13
    aget-object v1, v1, p1

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    const/4 v3, 0x0

    .line 24
    if-eqz v2, :cond_2

    .line 25
    .line 26
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Lcom/android/dx/ssa/SsaInsn;

    .line 31
    .line 32
    invoke-static {v2}, Lcom/android/dx/ssa/DeadCodeRemover;->hasSideEffect(Lcom/android/dx/ssa/SsaInsn;)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    return v3

    .line 39
    :cond_2
    if-nez p2, :cond_3

    .line 40
    .line 41
    new-instance p2, Ljava/util/BitSet;

    .line 42
    .line 43
    iget v1, p0, Lcom/android/dx/ssa/DeadCodeRemover;->regCount:I

    .line 44
    .line 45
    invoke-direct {p2, v1}, Ljava/util/BitSet;-><init>(I)V

    .line 46
    .line 47
    .line 48
    :cond_3
    invoke-virtual {p2, p1}, Ljava/util/BitSet;->set(I)V

    .line 49
    .line 50
    .line 51
    iget-object v1, p0, Lcom/android/dx/ssa/DeadCodeRemover;->useList:[Ljava/util/ArrayList;

    .line 52
    .line 53
    aget-object p1, v1, p1

    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    :cond_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_6

    .line 64
    .line 65
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    check-cast v1, Lcom/android/dx/ssa/SsaInsn;

    .line 70
    .line 71
    invoke-virtual {v1}, Lcom/android/dx/ssa/SsaInsn;->getResult()Lcom/android/dx/rop/code/RegisterSpec;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    if-eqz v1, :cond_5

    .line 76
    .line 77
    invoke-virtual {v1}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    invoke-direct {p0, v1, p2}, Lcom/android/dx/ssa/DeadCodeRemover;->isCircularNoSideEffect(ILjava/util/BitSet;)Z

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    if-nez v1, :cond_4

    .line 86
    .line 87
    :cond_5
    return v3

    .line 88
    :cond_6
    return v0
.end method

.method public static process(Lcom/android/dx/ssa/SsaMethod;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/android/dx/ssa/DeadCodeRemover;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/android/dx/ssa/DeadCodeRemover;-><init>(Lcom/android/dx/ssa/SsaMethod;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {v0}, Lcom/android/dx/ssa/DeadCodeRemover;->run()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private pruneDeadInstructions()V
    .locals 13

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/android/dx/ssa/DeadCodeRemover;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 7
    .line 8
    invoke-virtual {v1}, Lcom/android/dx/ssa/SsaMethod;->computeReachability()Ljava/util/BitSet;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iget-object v2, p0, Lcom/android/dx/ssa/DeadCodeRemover;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 13
    .line 14
    invoke-virtual {v2}, Lcom/android/dx/ssa/SsaMethod;->getBlocks()Ljava/util/ArrayList;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    const/4 v3, 0x0

    .line 19
    move v4, v3

    .line 20
    :cond_0
    invoke-virtual {v1, v4}, Ljava/util/BitSet;->nextClearBit(I)I

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    if-ge v4, v5, :cond_6

    .line 29
    .line 30
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    check-cast v5, Lcom/android/dx/ssa/SsaBasicBlock;

    .line 35
    .line 36
    add-int/lit8 v4, v4, 0x1

    .line 37
    .line 38
    move v6, v3

    .line 39
    :goto_0
    invoke-virtual {v5}, Lcom/android/dx/ssa/SsaBasicBlock;->getInsns()Ljava/util/ArrayList;

    .line 40
    .line 41
    .line 42
    move-result-object v7

    .line 43
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 44
    .line 45
    .line 46
    move-result v7

    .line 47
    if-ge v6, v7, :cond_0

    .line 48
    .line 49
    invoke-virtual {v5}, Lcom/android/dx/ssa/SsaBasicBlock;->getInsns()Ljava/util/ArrayList;

    .line 50
    .line 51
    .line 52
    move-result-object v7

    .line 53
    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v7

    .line 57
    check-cast v7, Lcom/android/dx/ssa/SsaInsn;

    .line 58
    .line 59
    invoke-virtual {v7}, Lcom/android/dx/ssa/SsaInsn;->getSources()Lcom/android/dx/rop/code/RegisterSpecList;

    .line 60
    .line 61
    .line 62
    move-result-object v8

    .line 63
    invoke-virtual {v8}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 64
    .line 65
    .line 66
    move-result v9

    .line 67
    if-eqz v9, :cond_1

    .line 68
    .line 69
    invoke-virtual {v0, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    :cond_1
    move v10, v3

    .line 73
    :goto_1
    if-ge v10, v9, :cond_2

    .line 74
    .line 75
    invoke-virtual {v8, v10}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 76
    .line 77
    .line 78
    move-result-object v11

    .line 79
    iget-object v12, p0, Lcom/android/dx/ssa/DeadCodeRemover;->useList:[Ljava/util/ArrayList;

    .line 80
    .line 81
    invoke-virtual {v11}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 82
    .line 83
    .line 84
    move-result v11

    .line 85
    aget-object v11, v12, v11

    .line 86
    .line 87
    invoke-virtual {v11, v7}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    add-int/lit8 v10, v10, 0x1

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_2
    invoke-virtual {v7}, Lcom/android/dx/ssa/SsaInsn;->getResult()Lcom/android/dx/rop/code/RegisterSpec;

    .line 94
    .line 95
    .line 96
    move-result-object v7

    .line 97
    if-nez v7, :cond_3

    .line 98
    .line 99
    goto :goto_3

    .line 100
    :cond_3
    iget-object v8, p0, Lcom/android/dx/ssa/DeadCodeRemover;->useList:[Ljava/util/ArrayList;

    .line 101
    .line 102
    invoke-virtual {v7}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 103
    .line 104
    .line 105
    move-result v9

    .line 106
    aget-object v8, v8, v9

    .line 107
    .line 108
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 109
    .line 110
    .line 111
    move-result-object v8

    .line 112
    :cond_4
    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 113
    .line 114
    .line 115
    move-result v9

    .line 116
    if-eqz v9, :cond_5

    .line 117
    .line 118
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v9

    .line 122
    check-cast v9, Lcom/android/dx/ssa/SsaInsn;

    .line 123
    .line 124
    instance-of v10, v9, Lcom/android/dx/ssa/PhiInsn;

    .line 125
    .line 126
    if-eqz v10, :cond_4

    .line 127
    .line 128
    check-cast v9, Lcom/android/dx/ssa/PhiInsn;

    .line 129
    .line 130
    invoke-virtual {v9, v7}, Lcom/android/dx/ssa/PhiInsn;->removePhiRegister(Lcom/android/dx/rop/code/RegisterSpec;)V

    .line 131
    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_5
    :goto_3
    add-int/lit8 v6, v6, 0x1

    .line 135
    .line 136
    goto :goto_0

    .line 137
    :cond_6
    iget-object p0, p0, Lcom/android/dx/ssa/DeadCodeRemover;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 138
    .line 139
    invoke-virtual {p0, v0}, Lcom/android/dx/ssa/SsaMethod;->deleteInsns(Ljava/util/Set;)V

    .line 140
    .line 141
    .line 142
    return-void
.end method

.method private run()V
    .locals 8

    .line 1
    invoke-direct {p0}, Lcom/android/dx/ssa/DeadCodeRemover;->pruneDeadInstructions()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashSet;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, Lcom/android/dx/ssa/DeadCodeRemover;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 10
    .line 11
    new-instance v2, Lcom/android/dx/ssa/DeadCodeRemover$NoSideEffectVisitor;

    .line 12
    .line 13
    iget-object v3, p0, Lcom/android/dx/ssa/DeadCodeRemover;->worklist:Ljava/util/BitSet;

    .line 14
    .line 15
    invoke-direct {v2, v3}, Lcom/android/dx/ssa/DeadCodeRemover$NoSideEffectVisitor;-><init>(Ljava/util/BitSet;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v2}, Lcom/android/dx/ssa/SsaMethod;->forEachInsn(Lcom/android/dx/ssa/SsaInsn$Visitor;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    :goto_0
    iget-object v1, p0, Lcom/android/dx/ssa/DeadCodeRemover;->worklist:Ljava/util/BitSet;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    invoke-virtual {v1, v2}, Ljava/util/BitSet;->nextSetBit(I)I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-ltz v1, :cond_5

    .line 29
    .line 30
    iget-object v3, p0, Lcom/android/dx/ssa/DeadCodeRemover;->worklist:Ljava/util/BitSet;

    .line 31
    .line 32
    invoke-virtual {v3, v1}, Ljava/util/BitSet;->clear(I)V

    .line 33
    .line 34
    .line 35
    iget-object v3, p0, Lcom/android/dx/ssa/DeadCodeRemover;->useList:[Ljava/util/ArrayList;

    .line 36
    .line 37
    aget-object v3, v3, v1

    .line 38
    .line 39
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-eqz v3, :cond_1

    .line 44
    .line 45
    const/4 v3, 0x0

    .line 46
    invoke-direct {p0, v1, v3}, Lcom/android/dx/ssa/DeadCodeRemover;->isCircularNoSideEffect(ILjava/util/BitSet;)Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-eqz v3, :cond_0

    .line 51
    .line 52
    :cond_1
    iget-object v3, p0, Lcom/android/dx/ssa/DeadCodeRemover;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 53
    .line 54
    invoke-virtual {v3, v1}, Lcom/android/dx/ssa/SsaMethod;->getDefinitionForRegister(I)Lcom/android/dx/ssa/SsaInsn;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    if-eqz v3, :cond_2

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    invoke-virtual {v1}, Lcom/android/dx/ssa/SsaInsn;->getSources()Lcom/android/dx/rop/code/RegisterSpecList;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    invoke-virtual {v3}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    :goto_1
    if-ge v2, v4, :cond_4

    .line 74
    .line 75
    invoke-virtual {v3, v2}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    iget-object v6, p0, Lcom/android/dx/ssa/DeadCodeRemover;->useList:[Ljava/util/ArrayList;

    .line 80
    .line 81
    invoke-virtual {v5}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 82
    .line 83
    .line 84
    move-result v7

    .line 85
    aget-object v6, v6, v7

    .line 86
    .line 87
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    iget-object v6, p0, Lcom/android/dx/ssa/DeadCodeRemover;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 91
    .line 92
    invoke-virtual {v5}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 93
    .line 94
    .line 95
    move-result v7

    .line 96
    invoke-virtual {v6, v7}, Lcom/android/dx/ssa/SsaMethod;->getDefinitionForRegister(I)Lcom/android/dx/ssa/SsaInsn;

    .line 97
    .line 98
    .line 99
    move-result-object v6

    .line 100
    invoke-static {v6}, Lcom/android/dx/ssa/DeadCodeRemover;->hasSideEffect(Lcom/android/dx/ssa/SsaInsn;)Z

    .line 101
    .line 102
    .line 103
    move-result v6

    .line 104
    if-nez v6, :cond_3

    .line 105
    .line 106
    iget-object v6, p0, Lcom/android/dx/ssa/DeadCodeRemover;->worklist:Ljava/util/BitSet;

    .line 107
    .line 108
    invoke-virtual {v5}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 109
    .line 110
    .line 111
    move-result v5

    .line 112
    invoke-virtual {v6, v5}, Ljava/util/BitSet;->set(I)V

    .line 113
    .line 114
    .line 115
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_4
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_5
    iget-object p0, p0, Lcom/android/dx/ssa/DeadCodeRemover;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 123
    .line 124
    invoke-virtual {p0, v0}, Lcom/android/dx/ssa/SsaMethod;->deleteInsns(Ljava/util/Set;)V

    .line 125
    .line 126
    .line 127
    return-void
.end method
