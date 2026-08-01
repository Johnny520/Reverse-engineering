.class public final Lcom/android/dx/rop/code/RopMethod;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field private final blocks:Lcom/android/dx/rop/code/BasicBlockList;

.field private exitPredecessors:Lcom/android/dx/util/IntList;

.field private final firstLabel:I

.field private predecessors:[Lcom/android/dx/util/IntList;


# direct methods
.method public constructor <init>(Lcom/android/dx/rop/code/BasicBlockList;I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    if-ltz p2, :cond_0

    .line 8
    .line 9
    iput-object p1, p0, Lcom/android/dx/rop/code/RopMethod;->blocks:Lcom/android/dx/rop/code/BasicBlockList;

    .line 10
    .line 11
    iput p2, p0, Lcom/android/dx/rop/code/RopMethod;->firstLabel:I

    .line 12
    .line 13
    iput-object v0, p0, Lcom/android/dx/rop/code/RopMethod;->predecessors:[Lcom/android/dx/util/IntList;

    .line 14
    .line 15
    iput-object v0, p0, Lcom/android/dx/rop/code/RopMethod;->exitPredecessors:Lcom/android/dx/util/IntList;

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    const-string p0, "firstLabel < 0"

    .line 19
    .line 20
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw v0

    .line 24
    :cond_1
    const-string p0, "blocks == null"

    .line 25
    .line 26
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw v0
.end method

.method private calcPredecessors()V
    .locals 13

    .line 1
    iget-object v0, p0, Lcom/android/dx/rop/code/RopMethod;->blocks:Lcom/android/dx/rop/code/BasicBlockList;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/dx/util/LabeledList;->getMaxLabel()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    new-array v1, v0, [Lcom/android/dx/util/IntList;

    .line 8
    .line 9
    new-instance v2, Lcom/android/dx/util/IntList;

    .line 10
    .line 11
    const/16 v3, 0xa

    .line 12
    .line 13
    invoke-direct {v2, v3}, Lcom/android/dx/util/IntList;-><init>(I)V

    .line 14
    .line 15
    .line 16
    iget-object v4, p0, Lcom/android/dx/rop/code/RopMethod;->blocks:Lcom/android/dx/rop/code/BasicBlockList;

    .line 17
    .line 18
    invoke-virtual {v4}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    const/4 v5, 0x0

    .line 23
    move v6, v5

    .line 24
    :goto_0
    if-ge v6, v4, :cond_3

    .line 25
    .line 26
    iget-object v7, p0, Lcom/android/dx/rop/code/RopMethod;->blocks:Lcom/android/dx/rop/code/BasicBlockList;

    .line 27
    .line 28
    invoke-virtual {v7, v6}, Lcom/android/dx/rop/code/BasicBlockList;->get(I)Lcom/android/dx/rop/code/BasicBlock;

    .line 29
    .line 30
    .line 31
    move-result-object v7

    .line 32
    invoke-virtual {v7}, Lcom/android/dx/rop/code/BasicBlock;->getLabel()I

    .line 33
    .line 34
    .line 35
    move-result v8

    .line 36
    invoke-virtual {v7}, Lcom/android/dx/rop/code/BasicBlock;->getSuccessors()Lcom/android/dx/util/IntList;

    .line 37
    .line 38
    .line 39
    move-result-object v7

    .line 40
    invoke-virtual {v7}, Lcom/android/dx/util/IntList;->size()I

    .line 41
    .line 42
    .line 43
    move-result v9

    .line 44
    if-nez v9, :cond_0

    .line 45
    .line 46
    invoke-virtual {v2, v8}, Lcom/android/dx/util/IntList;->add(I)V

    .line 47
    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_0
    move v10, v5

    .line 51
    :goto_1
    if-ge v10, v9, :cond_2

    .line 52
    .line 53
    invoke-virtual {v7, v10}, Lcom/android/dx/util/IntList;->get(I)I

    .line 54
    .line 55
    .line 56
    move-result v11

    .line 57
    aget-object v12, v1, v11

    .line 58
    .line 59
    if-nez v12, :cond_1

    .line 60
    .line 61
    new-instance v12, Lcom/android/dx/util/IntList;

    .line 62
    .line 63
    invoke-direct {v12, v3}, Lcom/android/dx/util/IntList;-><init>(I)V

    .line 64
    .line 65
    .line 66
    aput-object v12, v1, v11

    .line 67
    .line 68
    :cond_1
    invoke-virtual {v12, v8}, Lcom/android/dx/util/IntList;->add(I)V

    .line 69
    .line 70
    .line 71
    add-int/lit8 v10, v10, 0x1

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_2
    :goto_2
    add-int/lit8 v6, v6, 0x1

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_3
    :goto_3
    if-ge v5, v0, :cond_5

    .line 78
    .line 79
    aget-object v3, v1, v5

    .line 80
    .line 81
    if-eqz v3, :cond_4

    .line 82
    .line 83
    invoke-virtual {v3}, Lcom/android/dx/util/IntList;->sort()V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v3}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 87
    .line 88
    .line 89
    :cond_4
    add-int/lit8 v5, v5, 0x1

    .line 90
    .line 91
    goto :goto_3

    .line 92
    :cond_5
    invoke-virtual {v2}, Lcom/android/dx/util/IntList;->sort()V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v2}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 96
    .line 97
    .line 98
    iget v0, p0, Lcom/android/dx/rop/code/RopMethod;->firstLabel:I

    .line 99
    .line 100
    aget-object v3, v1, v0

    .line 101
    .line 102
    if-nez v3, :cond_6

    .line 103
    .line 104
    sget-object v3, Lcom/android/dx/util/IntList;->EMPTY:Lcom/android/dx/util/IntList;

    .line 105
    .line 106
    aput-object v3, v1, v0

    .line 107
    .line 108
    :cond_6
    iput-object v1, p0, Lcom/android/dx/rop/code/RopMethod;->predecessors:[Lcom/android/dx/util/IntList;

    .line 109
    .line 110
    iput-object v2, p0, Lcom/android/dx/rop/code/RopMethod;->exitPredecessors:Lcom/android/dx/util/IntList;

    .line 111
    .line 112
    return-void
.end method


# virtual methods
.method public getBlocks()Lcom/android/dx/rop/code/BasicBlockList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/code/RopMethod;->blocks:Lcom/android/dx/rop/code/BasicBlockList;

    .line 2
    .line 3
    return-object p0
.end method

.method public getExitPredecessors()Lcom/android/dx/util/IntList;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/dx/rop/code/RopMethod;->exitPredecessors:Lcom/android/dx/util/IntList;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/android/dx/rop/code/RopMethod;->calcPredecessors()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object p0, p0, Lcom/android/dx/rop/code/RopMethod;->exitPredecessors:Lcom/android/dx/util/IntList;

    .line 9
    .line 10
    return-object p0
.end method

.method public getFirstLabel()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/rop/code/RopMethod;->firstLabel:I

    .line 2
    .line 3
    return p0
.end method

.method public labelToPredecessors(I)Lcom/android/dx/util/IntList;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/dx/rop/code/RopMethod;->exitPredecessors:Lcom/android/dx/util/IntList;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/android/dx/rop/code/RopMethod;->calcPredecessors()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object p0, p0, Lcom/android/dx/rop/code/RopMethod;->predecessors:[Lcom/android/dx/util/IntList;

    .line 9
    .line 10
    aget-object p0, p0, p1

    .line 11
    .line 12
    if-eqz p0, :cond_1

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_1
    new-instance p0, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v0, "no such block: "

    .line 18
    .line 19
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-static {p0, p1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪兰哲苏(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const/4 p0, 0x0

    .line 30
    return-object p0
.end method

.method public withRegisterOffset(I)Lcom/android/dx/rop/code/RopMethod;
    .locals 2

    .line 1
    new-instance v0, Lcom/android/dx/rop/code/RopMethod;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/android/dx/rop/code/RopMethod;->blocks:Lcom/android/dx/rop/code/BasicBlockList;

    .line 4
    .line 5
    invoke-virtual {v1, p1}, Lcom/android/dx/rop/code/BasicBlockList;->withRegisterOffset(I)Lcom/android/dx/rop/code/BasicBlockList;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget v1, p0, Lcom/android/dx/rop/code/RopMethod;->firstLabel:I

    .line 10
    .line 11
    invoke-direct {v0, p1, v1}, Lcom/android/dx/rop/code/RopMethod;-><init>(Lcom/android/dx/rop/code/BasicBlockList;I)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lcom/android/dx/rop/code/RopMethod;->exitPredecessors:Lcom/android/dx/util/IntList;

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    iput-object p1, v0, Lcom/android/dx/rop/code/RopMethod;->exitPredecessors:Lcom/android/dx/util/IntList;

    .line 19
    .line 20
    iget-object p0, p0, Lcom/android/dx/rop/code/RopMethod;->predecessors:[Lcom/android/dx/util/IntList;

    .line 21
    .line 22
    iput-object p0, v0, Lcom/android/dx/rop/code/RopMethod;->predecessors:[Lcom/android/dx/util/IntList;

    .line 23
    .line 24
    :cond_0
    return-object v0
.end method
