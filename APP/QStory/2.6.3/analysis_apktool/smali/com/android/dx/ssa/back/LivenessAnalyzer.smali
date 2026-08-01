.class public Lcom/android/dx/ssa/back/LivenessAnalyzer;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/dx/ssa/back/LivenessAnalyzer$NextFunction;
    }
.end annotation


# instance fields
.field private blockN:Lcom/android/dx/ssa/SsaBasicBlock;

.field private final interference:Lcom/android/dx/ssa/back/InterferenceGraph;

.field private final liveOutBlocks:Ljava/util/BitSet;

.field private nextFunction:Lcom/android/dx/ssa/back/LivenessAnalyzer$NextFunction;

.field private final regV:I

.field private final ssaMeth:Lcom/android/dx/ssa/SsaMethod;

.field private statementIndex:I

.field private final visitedBlocks:Ljava/util/BitSet;


# direct methods
.method private constructor <init>(Lcom/android/dx/ssa/SsaMethod;ILcom/android/dx/ssa/back/InterferenceGraph;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaMethod;->getBlocks()Ljava/util/ArrayList;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iput-object p1, p0, Lcom/android/dx/ssa/back/LivenessAnalyzer;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 13
    .line 14
    iput p2, p0, Lcom/android/dx/ssa/back/LivenessAnalyzer;->regV:I

    .line 15
    .line 16
    new-instance p1, Ljava/util/BitSet;

    .line 17
    .line 18
    invoke-direct {p1, v0}, Ljava/util/BitSet;-><init>(I)V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Lcom/android/dx/ssa/back/LivenessAnalyzer;->visitedBlocks:Ljava/util/BitSet;

    .line 22
    .line 23
    new-instance p1, Ljava/util/BitSet;

    .line 24
    .line 25
    invoke-direct {p1, v0}, Ljava/util/BitSet;-><init>(I)V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lcom/android/dx/ssa/back/LivenessAnalyzer;->liveOutBlocks:Ljava/util/BitSet;

    .line 29
    .line 30
    iput-object p3, p0, Lcom/android/dx/ssa/back/LivenessAnalyzer;->interference:Lcom/android/dx/ssa/back/InterferenceGraph;

    .line 31
    .line 32
    return-void
.end method

.method private static coInterferePhiRegisters(Lcom/android/dx/ssa/back/InterferenceGraph;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, 0x0

    .line 6
    :goto_0
    invoke-virtual {p2}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-ge v0, v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p2, v0}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-virtual {p0, p1, v1}, Lcom/android/dx/ssa/back/InterferenceGraph;->add(II)V

    .line 21
    .line 22
    .line 23
    add-int/lit8 v0, v0, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return-void
.end method

.method private static coInterferePhis(Lcom/android/dx/ssa/SsaMethod;Lcom/android/dx/ssa/back/InterferenceGraph;)V
    .locals 9

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/ssa/SsaMethod;->getBlocks()Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_3

    .line 14
    .line 15
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lcom/android/dx/ssa/SsaBasicBlock;

    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/android/dx/ssa/SsaBasicBlock;->getPhiInsns()Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    const/4 v2, 0x0

    .line 30
    move v3, v2

    .line 31
    :goto_0
    if-ge v3, v1, :cond_0

    .line 32
    .line 33
    move v4, v2

    .line 34
    :goto_1
    if-ge v4, v1, :cond_2

    .line 35
    .line 36
    if-ne v3, v4, :cond_1

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_1
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    check-cast v5, Lcom/android/dx/ssa/SsaInsn;

    .line 44
    .line 45
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    check-cast v6, Lcom/android/dx/ssa/SsaInsn;

    .line 50
    .line 51
    invoke-virtual {v5}, Lcom/android/dx/ssa/SsaInsn;->getResult()Lcom/android/dx/rop/code/RegisterSpec;

    .line 52
    .line 53
    .line 54
    move-result-object v7

    .line 55
    invoke-virtual {v6}, Lcom/android/dx/ssa/SsaInsn;->getSources()Lcom/android/dx/rop/code/RegisterSpecList;

    .line 56
    .line 57
    .line 58
    move-result-object v8

    .line 59
    invoke-static {p1, v7, v8}, Lcom/android/dx/ssa/back/LivenessAnalyzer;->coInterferePhiRegisters(Lcom/android/dx/ssa/back/InterferenceGraph;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v6}, Lcom/android/dx/ssa/SsaInsn;->getResult()Lcom/android/dx/rop/code/RegisterSpec;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    invoke-virtual {v5}, Lcom/android/dx/ssa/SsaInsn;->getSources()Lcom/android/dx/rop/code/RegisterSpecList;

    .line 67
    .line 68
    .line 69
    move-result-object v8

    .line 70
    invoke-static {p1, v7, v8}, Lcom/android/dx/ssa/back/LivenessAnalyzer;->coInterferePhiRegisters(Lcom/android/dx/ssa/back/InterferenceGraph;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v5}, Lcom/android/dx/ssa/SsaInsn;->getResult()Lcom/android/dx/rop/code/RegisterSpec;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    invoke-virtual {v5}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    invoke-virtual {v6}, Lcom/android/dx/ssa/SsaInsn;->getResult()Lcom/android/dx/rop/code/RegisterSpec;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    invoke-virtual {v6}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 86
    .line 87
    .line 88
    move-result v6

    .line 89
    invoke-virtual {p1, v5, v6}, Lcom/android/dx/ssa/back/InterferenceGraph;->add(II)V

    .line 90
    .line 91
    .line 92
    :goto_2
    add-int/lit8 v4, v4, 0x1

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_3
    return-void
.end method

.method public static constructInterferenceGraph(Lcom/android/dx/ssa/SsaMethod;)Lcom/android/dx/ssa/back/InterferenceGraph;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/ssa/SsaMethod;->getRegCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-instance v1, Lcom/android/dx/ssa/back/InterferenceGraph;

    .line 6
    .line 7
    invoke-direct {v1, v0}, Lcom/android/dx/ssa/back/InterferenceGraph;-><init>(I)V

    .line 8
    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    :goto_0
    if-ge v2, v0, :cond_0

    .line 12
    .line 13
    new-instance v3, Lcom/android/dx/ssa/back/LivenessAnalyzer;

    .line 14
    .line 15
    invoke-direct {v3, p0, v2, v1}, Lcom/android/dx/ssa/back/LivenessAnalyzer;-><init>(Lcom/android/dx/ssa/SsaMethod;ILcom/android/dx/ssa/back/InterferenceGraph;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v3}, Lcom/android/dx/ssa/back/LivenessAnalyzer;->run()V

    .line 19
    .line 20
    .line 21
    add-int/lit8 v2, v2, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-static {p0, v1}, Lcom/android/dx/ssa/back/LivenessAnalyzer;->coInterferePhis(Lcom/android/dx/ssa/SsaMethod;Lcom/android/dx/ssa/back/InterferenceGraph;)V

    .line 25
    .line 26
    .line 27
    return-object v1
.end method

.method private handleTailRecursion()V
    .locals 3

    .line 1
    :goto_0
    iget-object v0, p0, Lcom/android/dx/ssa/back/LivenessAnalyzer;->nextFunction:Lcom/android/dx/ssa/back/LivenessAnalyzer$NextFunction;

    .line 2
    .line 3
    sget-object v1, Lcom/android/dx/ssa/back/LivenessAnalyzer$NextFunction;->DONE:Lcom/android/dx/ssa/back/LivenessAnalyzer$NextFunction;

    .line 4
    .line 5
    if-eq v0, v1, :cond_3

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    if-eq v0, v2, :cond_1

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    if-eq v0, v2, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iput-object v1, p0, Lcom/android/dx/ssa/back/LivenessAnalyzer;->nextFunction:Lcom/android/dx/ssa/back/LivenessAnalyzer$NextFunction;

    .line 21
    .line 22
    invoke-direct {p0}, Lcom/android/dx/ssa/back/LivenessAnalyzer;->liveOutAtBlock()V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    iput-object v1, p0, Lcom/android/dx/ssa/back/LivenessAnalyzer;->nextFunction:Lcom/android/dx/ssa/back/LivenessAnalyzer$NextFunction;

    .line 27
    .line 28
    invoke-direct {p0}, Lcom/android/dx/ssa/back/LivenessAnalyzer;->liveOutAtStatement()V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    iput-object v1, p0, Lcom/android/dx/ssa/back/LivenessAnalyzer;->nextFunction:Lcom/android/dx/ssa/back/LivenessAnalyzer$NextFunction;

    .line 33
    .line 34
    invoke-direct {p0}, Lcom/android/dx/ssa/back/LivenessAnalyzer;->liveInAtStatement()V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_3
    return-void
.end method

.method private liveInAtStatement()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/android/dx/ssa/back/LivenessAnalyzer;->statementIndex:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/android/dx/ssa/back/LivenessAnalyzer;->blockN:Lcom/android/dx/ssa/SsaBasicBlock;

    .line 6
    .line 7
    iget v1, p0, Lcom/android/dx/ssa/back/LivenessAnalyzer;->regV:I

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lcom/android/dx/ssa/SsaBasicBlock;->addLiveIn(I)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/android/dx/ssa/back/LivenessAnalyzer;->blockN:Lcom/android/dx/ssa/SsaBasicBlock;

    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/android/dx/ssa/SsaBasicBlock;->getPredecessors()Ljava/util/BitSet;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object p0, p0, Lcom/android/dx/ssa/back/LivenessAnalyzer;->liveOutBlocks:Ljava/util/BitSet;

    .line 19
    .line 20
    invoke-virtual {p0, v0}, Ljava/util/BitSet;->or(Ljava/util/BitSet;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    add-int/lit8 v0, v0, -0x1

    .line 25
    .line 26
    iput v0, p0, Lcom/android/dx/ssa/back/LivenessAnalyzer;->statementIndex:I

    .line 27
    .line 28
    sget-object v0, Lcom/android/dx/ssa/back/LivenessAnalyzer$NextFunction;->LIVE_OUT_AT_STATEMENT:Lcom/android/dx/ssa/back/LivenessAnalyzer$NextFunction;

    .line 29
    .line 30
    iput-object v0, p0, Lcom/android/dx/ssa/back/LivenessAnalyzer;->nextFunction:Lcom/android/dx/ssa/back/LivenessAnalyzer$NextFunction;

    .line 31
    .line 32
    return-void
.end method

.method private liveOutAtBlock()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/android/dx/ssa/back/LivenessAnalyzer;->visitedBlocks:Ljava/util/BitSet;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/android/dx/ssa/back/LivenessAnalyzer;->blockN:Lcom/android/dx/ssa/SsaBasicBlock;

    .line 4
    .line 5
    invoke-virtual {v1}, Lcom/android/dx/ssa/SsaBasicBlock;->getIndex()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {v0, v1}, Ljava/util/BitSet;->get(I)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lcom/android/dx/ssa/back/LivenessAnalyzer;->visitedBlocks:Ljava/util/BitSet;

    .line 16
    .line 17
    iget-object v1, p0, Lcom/android/dx/ssa/back/LivenessAnalyzer;->blockN:Lcom/android/dx/ssa/SsaBasicBlock;

    .line 18
    .line 19
    invoke-virtual {v1}, Lcom/android/dx/ssa/SsaBasicBlock;->getIndex()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lcom/android/dx/ssa/back/LivenessAnalyzer;->blockN:Lcom/android/dx/ssa/SsaBasicBlock;

    .line 27
    .line 28
    iget v1, p0, Lcom/android/dx/ssa/back/LivenessAnalyzer;->regV:I

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Lcom/android/dx/ssa/SsaBasicBlock;->addLiveOut(I)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lcom/android/dx/ssa/back/LivenessAnalyzer;->blockN:Lcom/android/dx/ssa/SsaBasicBlock;

    .line 34
    .line 35
    invoke-virtual {v0}, Lcom/android/dx/ssa/SsaBasicBlock;->getInsns()Ljava/util/ArrayList;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    add-int/lit8 v0, v0, -0x1

    .line 44
    .line 45
    iput v0, p0, Lcom/android/dx/ssa/back/LivenessAnalyzer;->statementIndex:I

    .line 46
    .line 47
    sget-object v0, Lcom/android/dx/ssa/back/LivenessAnalyzer$NextFunction;->LIVE_OUT_AT_STATEMENT:Lcom/android/dx/ssa/back/LivenessAnalyzer$NextFunction;

    .line 48
    .line 49
    iput-object v0, p0, Lcom/android/dx/ssa/back/LivenessAnalyzer;->nextFunction:Lcom/android/dx/ssa/back/LivenessAnalyzer$NextFunction;

    .line 50
    .line 51
    :cond_0
    return-void
.end method

.method private liveOutAtStatement()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/android/dx/ssa/back/LivenessAnalyzer;->blockN:Lcom/android/dx/ssa/SsaBasicBlock;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/dx/ssa/SsaBasicBlock;->getInsns()Ljava/util/ArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v1, p0, Lcom/android/dx/ssa/back/LivenessAnalyzer;->statementIndex:I

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lcom/android/dx/ssa/SsaInsn;

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/android/dx/ssa/SsaInsn;->getResult()Lcom/android/dx/rop/code/RegisterSpec;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iget v2, p0, Lcom/android/dx/ssa/back/LivenessAnalyzer;->regV:I

    .line 20
    .line 21
    invoke-virtual {v0, v2}, Lcom/android/dx/ssa/SsaInsn;->isResultReg(I)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    iget-object v0, p0, Lcom/android/dx/ssa/back/LivenessAnalyzer;->interference:Lcom/android/dx/ssa/back/InterferenceGraph;

    .line 30
    .line 31
    iget v2, p0, Lcom/android/dx/ssa/back/LivenessAnalyzer;->regV:I

    .line 32
    .line 33
    invoke-virtual {v1}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    invoke-virtual {v0, v2, v1}, Lcom/android/dx/ssa/back/InterferenceGraph;->add(II)V

    .line 38
    .line 39
    .line 40
    :cond_0
    sget-object v0, Lcom/android/dx/ssa/back/LivenessAnalyzer$NextFunction;->LIVE_IN_AT_STATEMENT:Lcom/android/dx/ssa/back/LivenessAnalyzer$NextFunction;

    .line 41
    .line 42
    iput-object v0, p0, Lcom/android/dx/ssa/back/LivenessAnalyzer;->nextFunction:Lcom/android/dx/ssa/back/LivenessAnalyzer$NextFunction;

    .line 43
    .line 44
    :cond_1
    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/android/dx/ssa/back/LivenessAnalyzer;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 2
    .line 3
    iget v1, p0, Lcom/android/dx/ssa/back/LivenessAnalyzer;->regV:I

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/android/dx/ssa/SsaMethod;->getUseListForRegister(I)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_3

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Lcom/android/dx/ssa/SsaInsn;

    .line 24
    .line 25
    sget-object v2, Lcom/android/dx/ssa/back/LivenessAnalyzer$NextFunction;->DONE:Lcom/android/dx/ssa/back/LivenessAnalyzer$NextFunction;

    .line 26
    .line 27
    iput-object v2, p0, Lcom/android/dx/ssa/back/LivenessAnalyzer;->nextFunction:Lcom/android/dx/ssa/back/LivenessAnalyzer$NextFunction;

    .line 28
    .line 29
    instance-of v2, v1, Lcom/android/dx/ssa/PhiInsn;

    .line 30
    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    check-cast v1, Lcom/android/dx/ssa/PhiInsn;

    .line 34
    .line 35
    iget v2, p0, Lcom/android/dx/ssa/back/LivenessAnalyzer;->regV:I

    .line 36
    .line 37
    iget-object v3, p0, Lcom/android/dx/ssa/back/LivenessAnalyzer;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 38
    .line 39
    invoke-virtual {v1, v2, v3}, Lcom/android/dx/ssa/PhiInsn;->predBlocksForReg(ILcom/android/dx/ssa/SsaMethod;)Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_0

    .line 52
    .line 53
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    check-cast v2, Lcom/android/dx/ssa/SsaBasicBlock;

    .line 58
    .line 59
    iput-object v2, p0, Lcom/android/dx/ssa/back/LivenessAnalyzer;->blockN:Lcom/android/dx/ssa/SsaBasicBlock;

    .line 60
    .line 61
    sget-object v2, Lcom/android/dx/ssa/back/LivenessAnalyzer$NextFunction;->LIVE_OUT_AT_BLOCK:Lcom/android/dx/ssa/back/LivenessAnalyzer$NextFunction;

    .line 62
    .line 63
    iput-object v2, p0, Lcom/android/dx/ssa/back/LivenessAnalyzer;->nextFunction:Lcom/android/dx/ssa/back/LivenessAnalyzer$NextFunction;

    .line 64
    .line 65
    invoke-direct {p0}, Lcom/android/dx/ssa/back/LivenessAnalyzer;->handleTailRecursion()V

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_1
    invoke-virtual {v1}, Lcom/android/dx/ssa/SsaInsn;->getBlock()Lcom/android/dx/ssa/SsaBasicBlock;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    iput-object v2, p0, Lcom/android/dx/ssa/back/LivenessAnalyzer;->blockN:Lcom/android/dx/ssa/SsaBasicBlock;

    .line 74
    .line 75
    invoke-virtual {v2}, Lcom/android/dx/ssa/SsaBasicBlock;->getInsns()Ljava/util/ArrayList;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    iput v1, p0, Lcom/android/dx/ssa/back/LivenessAnalyzer;->statementIndex:I

    .line 84
    .line 85
    if-ltz v1, :cond_2

    .line 86
    .line 87
    sget-object v1, Lcom/android/dx/ssa/back/LivenessAnalyzer$NextFunction;->LIVE_IN_AT_STATEMENT:Lcom/android/dx/ssa/back/LivenessAnalyzer$NextFunction;

    .line 88
    .line 89
    iput-object v1, p0, Lcom/android/dx/ssa/back/LivenessAnalyzer;->nextFunction:Lcom/android/dx/ssa/back/LivenessAnalyzer$NextFunction;

    .line 90
    .line 91
    invoke-direct {p0}, Lcom/android/dx/ssa/back/LivenessAnalyzer;->handleTailRecursion()V

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_2
    const-string p0, "insn not found in it\'s own block"

    .line 96
    .line 97
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :cond_3
    :goto_2
    iget-object v0, p0, Lcom/android/dx/ssa/back/LivenessAnalyzer;->liveOutBlocks:Ljava/util/BitSet;

    .line 102
    .line 103
    const/4 v1, 0x0

    .line 104
    invoke-virtual {v0, v1}, Ljava/util/BitSet;->nextSetBit(I)I

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-ltz v0, :cond_4

    .line 109
    .line 110
    iget-object v1, p0, Lcom/android/dx/ssa/back/LivenessAnalyzer;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 111
    .line 112
    invoke-virtual {v1}, Lcom/android/dx/ssa/SsaMethod;->getBlocks()Ljava/util/ArrayList;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    check-cast v1, Lcom/android/dx/ssa/SsaBasicBlock;

    .line 121
    .line 122
    iput-object v1, p0, Lcom/android/dx/ssa/back/LivenessAnalyzer;->blockN:Lcom/android/dx/ssa/SsaBasicBlock;

    .line 123
    .line 124
    iget-object v1, p0, Lcom/android/dx/ssa/back/LivenessAnalyzer;->liveOutBlocks:Ljava/util/BitSet;

    .line 125
    .line 126
    invoke-virtual {v1, v0}, Ljava/util/BitSet;->clear(I)V

    .line 127
    .line 128
    .line 129
    sget-object v0, Lcom/android/dx/ssa/back/LivenessAnalyzer$NextFunction;->LIVE_OUT_AT_BLOCK:Lcom/android/dx/ssa/back/LivenessAnalyzer$NextFunction;

    .line 130
    .line 131
    iput-object v0, p0, Lcom/android/dx/ssa/back/LivenessAnalyzer;->nextFunction:Lcom/android/dx/ssa/back/LivenessAnalyzer$NextFunction;

    .line 132
    .line 133
    invoke-direct {p0}, Lcom/android/dx/ssa/back/LivenessAnalyzer;->handleTailRecursion()V

    .line 134
    .line 135
    .line 136
    goto :goto_2

    .line 137
    :cond_4
    return-void
.end method
