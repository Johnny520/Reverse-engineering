.class public final Lcom/android/dx/ssa/SsaMethod;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field private backMode:Z

.field private blocks:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/android/dx/ssa/SsaBasicBlock;",
            ">;"
        }
    .end annotation
.end field

.field private borrowedSpareRegisters:I

.field private definitionList:[Lcom/android/dx/ssa/SsaInsn;

.field private entryBlockIndex:I

.field private exitBlockIndex:I

.field private final isStatic:Z

.field private maxLabel:I

.field private final paramWidth:I

.field private registerCount:I

.field private spareRegisterBase:I

.field private unmodifiableUseList:[Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/util/List<",
            "Lcom/android/dx/ssa/SsaInsn;",
            ">;"
        }
    .end annotation
.end field

.field private useList:[Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/util/ArrayList<",
            "Lcom/android/dx/ssa/SsaInsn;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/android/dx/rop/code/RopMethod;IZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p2, p0, Lcom/android/dx/ssa/SsaMethod;->paramWidth:I

    .line 5
    .line 6
    iput-boolean p3, p0, Lcom/android/dx/ssa/SsaMethod;->isStatic:Z

    .line 7
    .line 8
    const/4 p2, 0x0

    .line 9
    iput-boolean p2, p0, Lcom/android/dx/ssa/SsaMethod;->backMode:Z

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/android/dx/rop/code/RopMethod;->getBlocks()Lcom/android/dx/rop/code/BasicBlockList;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-virtual {p2}, Lcom/android/dx/util/LabeledList;->getMaxLabel()I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    iput p2, p0, Lcom/android/dx/ssa/SsaMethod;->maxLabel:I

    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/android/dx/rop/code/RopMethod;->getBlocks()Lcom/android/dx/rop/code/BasicBlockList;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, Lcom/android/dx/rop/code/BasicBlockList;->getRegCount()I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    iput p1, p0, Lcom/android/dx/ssa/SsaMethod;->registerCount:I

    .line 30
    .line 31
    iput p1, p0, Lcom/android/dx/ssa/SsaMethod;->spareRegisterBase:I

    .line 32
    .line 33
    return-void
.end method

.method public static synthetic access$000(Lcom/android/dx/ssa/SsaMethod;)[Lcom/android/dx/ssa/SsaInsn;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/ssa/SsaMethod;->definitionList:[Lcom/android/dx/ssa/SsaInsn;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$100(Lcom/android/dx/ssa/SsaMethod;)[Ljava/util/ArrayList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/ssa/SsaMethod;->useList:[Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object p0
.end method

.method public static bitSetFromLabelList(Lcom/android/dx/rop/code/BasicBlockList;Lcom/android/dx/util/IntList;)Ljava/util/BitSet;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/BitSet;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-direct {v0, v1}, Ljava/util/BitSet;-><init>(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/android/dx/util/IntList;->size()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x0

    .line 15
    :goto_0
    if-ge v2, v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1, v2}, Lcom/android/dx/util/IntList;->get(I)I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    invoke-virtual {p0, v3}, Lcom/android/dx/util/LabeledList;->indexOfLabel(I)I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    invoke-virtual {v0, v3}, Ljava/util/BitSet;->set(I)V

    .line 26
    .line 27
    .line 28
    add-int/lit8 v2, v2, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    return-object v0
.end method

.method private buildUseList()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/android/dx/ssa/SsaMethod;->backMode:Z

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    iget v0, p0, Lcom/android/dx/ssa/SsaMethod;->registerCount:I

    .line 6
    .line 7
    new-array v0, v0, [Ljava/util/ArrayList;

    .line 8
    .line 9
    iput-object v0, p0, Lcom/android/dx/ssa/SsaMethod;->useList:[Ljava/util/ArrayList;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    move v1, v0

    .line 13
    :goto_0
    iget v2, p0, Lcom/android/dx/ssa/SsaMethod;->registerCount:I

    .line 14
    .line 15
    if-ge v1, v2, :cond_0

    .line 16
    .line 17
    iget-object v2, p0, Lcom/android/dx/ssa/SsaMethod;->useList:[Ljava/util/ArrayList;

    .line 18
    .line 19
    new-instance v3, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    aput-object v3, v2, v1

    .line 25
    .line 26
    add-int/lit8 v1, v1, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    new-instance v1, Lcom/android/dx/ssa/SsaMethod$2;

    .line 30
    .line 31
    invoke-direct {v1, p0}, Lcom/android/dx/ssa/SsaMethod$2;-><init>(Lcom/android/dx/ssa/SsaMethod;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v1}, Lcom/android/dx/ssa/SsaMethod;->forEachInsn(Lcom/android/dx/ssa/SsaInsn$Visitor;)V

    .line 35
    .line 36
    .line 37
    iget v1, p0, Lcom/android/dx/ssa/SsaMethod;->registerCount:I

    .line 38
    .line 39
    new-array v1, v1, [Ljava/util/List;

    .line 40
    .line 41
    iput-object v1, p0, Lcom/android/dx/ssa/SsaMethod;->unmodifiableUseList:[Ljava/util/List;

    .line 42
    .line 43
    :goto_1
    iget v1, p0, Lcom/android/dx/ssa/SsaMethod;->registerCount:I

    .line 44
    .line 45
    if-ge v0, v1, :cond_1

    .line 46
    .line 47
    iget-object v1, p0, Lcom/android/dx/ssa/SsaMethod;->unmodifiableUseList:[Ljava/util/List;

    .line 48
    .line 49
    iget-object v2, p0, Lcom/android/dx/ssa/SsaMethod;->useList:[Ljava/util/ArrayList;

    .line 50
    .line 51
    aget-object v2, v2, v0

    .line 52
    .line 53
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    aput-object v2, v1, v0

    .line 58
    .line 59
    add-int/lit8 v0, v0, 0x1

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_1
    return-void

    .line 63
    :cond_2
    const-string p0, "No use list in back mode"

    .line 64
    .line 65
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method private convertRopToSsaBlocks(Lcom/android/dx/rop/code/RopMethod;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/rop/code/RopMethod;->getBlocks()Lcom/android/dx/rop/code/BasicBlockList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    new-instance v1, Ljava/util/ArrayList;

    .line 10
    .line 11
    add-int/lit8 v2, v0, 0x2

    .line 12
    .line 13
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Lcom/android/dx/ssa/SsaMethod;->blocks:Ljava/util/ArrayList;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    :goto_0
    if-ge v1, v0, :cond_0

    .line 20
    .line 21
    invoke-static {p1, v1, p0}, Lcom/android/dx/ssa/SsaBasicBlock;->newFromRop(Lcom/android/dx/rop/code/RopMethod;ILcom/android/dx/ssa/SsaMethod;)Lcom/android/dx/ssa/SsaBasicBlock;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    iget-object v3, p0, Lcom/android/dx/ssa/SsaMethod;->blocks:Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    add-int/lit8 v1, v1, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-virtual {p1}, Lcom/android/dx/rop/code/RopMethod;->getBlocks()Lcom/android/dx/rop/code/BasicBlockList;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {p1}, Lcom/android/dx/rop/code/RopMethod;->getFirstLabel()I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    invoke-virtual {v0, p1}, Lcom/android/dx/util/LabeledList;->indexOfLabel(I)I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    iget-object v0, p0, Lcom/android/dx/ssa/SsaMethod;->blocks:Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    check-cast p1, Lcom/android/dx/ssa/SsaBasicBlock;

    .line 52
    .line 53
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaBasicBlock;->insertNewPredecessor()Lcom/android/dx/ssa/SsaBasicBlock;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaBasicBlock;->getIndex()I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    iput p1, p0, Lcom/android/dx/ssa/SsaMethod;->entryBlockIndex:I

    .line 62
    .line 63
    const/4 p1, -0x1

    .line 64
    iput p1, p0, Lcom/android/dx/ssa/SsaMethod;->exitBlockIndex:I

    .line 65
    .line 66
    return-void
.end method

.method private static getGoto(Lcom/android/dx/ssa/SsaBasicBlock;)Lcom/android/dx/ssa/SsaInsn;
    .locals 6

    .line 1
    new-instance v0, Lcom/android/dx/ssa/NormalSsaInsn;

    .line 2
    .line 3
    new-instance v1, Lcom/android/dx/rop/code/PlainInsn;

    .line 4
    .line 5
    sget-object v2, Lcom/android/dx/rop/code/Rops;->GOTO:Lcom/android/dx/rop/code/Rop;

    .line 6
    .line 7
    sget-object v3, Lcom/android/dx/rop/code/SourcePosition;->NO_INFO:Lcom/android/dx/rop/code/SourcePosition;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    sget-object v5, Lcom/android/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 11
    .line 12
    invoke-direct {v1, v2, v3, v4, v5}, Lcom/android/dx/rop/code/PlainInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, v1, p0}, Lcom/android/dx/ssa/NormalSsaInsn;-><init>(Lcom/android/dx/rop/code/Insn;Lcom/android/dx/ssa/SsaBasicBlock;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public static indexListFromLabelList(Lcom/android/dx/rop/code/BasicBlockList;Lcom/android/dx/util/IntList;)Lcom/android/dx/util/IntList;
    .locals 4

    .line 1
    new-instance v0, Lcom/android/dx/util/IntList;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/android/dx/util/IntList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-direct {v0, v1}, Lcom/android/dx/util/IntList;-><init>(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/android/dx/util/IntList;->size()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x0

    .line 15
    :goto_0
    if-ge v2, v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1, v2}, Lcom/android/dx/util/IntList;->get(I)I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    invoke-virtual {p0, v3}, Lcom/android/dx/util/LabeledList;->indexOfLabel(I)I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    invoke-virtual {v0, v3}, Lcom/android/dx/util/IntList;->add(I)V

    .line 26
    .line 27
    .line 28
    add-int/lit8 v2, v2, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    return-object v0
.end method

.method public static newFromRopMethod(Lcom/android/dx/rop/code/RopMethod;IZ)Lcom/android/dx/ssa/SsaMethod;
    .locals 1

    .line 1
    new-instance v0, Lcom/android/dx/ssa/SsaMethod;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Lcom/android/dx/ssa/SsaMethod;-><init>(Lcom/android/dx/rop/code/RopMethod;IZ)V

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, p0}, Lcom/android/dx/ssa/SsaMethod;->convertRopToSsaBlocks(Lcom/android/dx/rop/code/RopMethod;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method private removeFromUseList(Lcom/android/dx/ssa/SsaInsn;Lcom/android/dx/rop/code/RegisterSpecList;)V
    .locals 4

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    invoke-virtual {p2}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x0

    .line 9
    :goto_0
    if-ge v1, v0, :cond_2

    .line 10
    .line 11
    iget-object v2, p0, Lcom/android/dx/ssa/SsaMethod;->useList:[Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {p2, v1}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-virtual {v3}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    aget-object v2, v2, v3

    .line 22
    .line 23
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    add-int/lit8 v1, v1, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const-string p0, "use not found"

    .line 33
    .line 34
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :cond_2
    :goto_1
    return-void
.end method


# virtual methods
.method public blockIndexToRopLabel(I)I
    .locals 0

    .line 1
    if-gez p1, :cond_0

    .line 2
    .line 3
    const/4 p0, -0x1

    .line 4
    return p0

    .line 5
    :cond_0
    iget-object p0, p0, Lcom/android/dx/ssa/SsaMethod;->blocks:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Lcom/android/dx/ssa/SsaBasicBlock;

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/android/dx/ssa/SsaBasicBlock;->getRopLabel()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
.end method

.method public borrowSpareRegister(I)I
    .locals 2

    .line 1
    iget v0, p0, Lcom/android/dx/ssa/SsaMethod;->spareRegisterBase:I

    .line 2
    .line 3
    iget v1, p0, Lcom/android/dx/ssa/SsaMethod;->borrowedSpareRegisters:I

    .line 4
    .line 5
    add-int/2addr v0, v1

    .line 6
    add-int/2addr v1, p1

    .line 7
    iput v1, p0, Lcom/android/dx/ssa/SsaMethod;->borrowedSpareRegisters:I

    .line 8
    .line 9
    iget v1, p0, Lcom/android/dx/ssa/SsaMethod;->registerCount:I

    .line 10
    .line 11
    add-int/2addr p1, v0

    .line 12
    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    iput p1, p0, Lcom/android/dx/ssa/SsaMethod;->registerCount:I

    .line 17
    .line 18
    return v0
.end method

.method public computeReachability()Ljava/util/BitSet;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/android/dx/ssa/SsaMethod;->blocks:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    new-instance v1, Ljava/util/BitSet;

    .line 8
    .line 9
    invoke-direct {v1, v0}, Ljava/util/BitSet;-><init>(I)V

    .line 10
    .line 11
    .line 12
    new-instance v2, Ljava/util/BitSet;

    .line 13
    .line 14
    invoke-direct {v2, v0}, Ljava/util/BitSet;-><init>(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/android/dx/ssa/SsaMethod;->getEntryBlock()Lcom/android/dx/ssa/SsaBasicBlock;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Lcom/android/dx/ssa/SsaBasicBlock;->getIndex()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    invoke-virtual {v1, v0}, Ljava/util/BitSet;->set(I)V

    .line 26
    .line 27
    .line 28
    :goto_0
    const/4 v0, 0x0

    .line 29
    invoke-virtual {v1, v0}, Ljava/util/BitSet;->nextSetBit(I)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    const/4 v3, -0x1

    .line 34
    if-eq v0, v3, :cond_0

    .line 35
    .line 36
    invoke-virtual {v2, v0}, Ljava/util/BitSet;->set(I)V

    .line 37
    .line 38
    .line 39
    iget-object v3, p0, Lcom/android/dx/ssa/SsaMethod;->blocks:Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, Lcom/android/dx/ssa/SsaBasicBlock;

    .line 46
    .line 47
    invoke-virtual {v0}, Lcom/android/dx/ssa/SsaBasicBlock;->getSuccessors()Ljava/util/BitSet;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {v1, v0}, Ljava/util/BitSet;->or(Ljava/util/BitSet;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, v2}, Ljava/util/BitSet;->andNot(Ljava/util/BitSet;)V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    return-object v2
.end method

.method public deleteInsns(Ljava/util/Set;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lcom/android/dx/ssa/SsaInsn;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_6

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lcom/android/dx/ssa/SsaInsn;

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/android/dx/ssa/SsaInsn;->getBlock()Lcom/android/dx/ssa/SsaBasicBlock;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1}, Lcom/android/dx/ssa/SsaBasicBlock;->getInsns()Ljava/util/ArrayList;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    const/4 v4, 0x1

    .line 30
    sub-int/2addr v3, v4

    .line 31
    :goto_0
    if-ltz v3, :cond_2

    .line 32
    .line 33
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    check-cast v5, Lcom/android/dx/ssa/SsaInsn;

    .line 38
    .line 39
    if-ne v0, v5, :cond_1

    .line 40
    .line 41
    invoke-virtual {p0, v5}, Lcom/android/dx/ssa/SsaMethod;->onInsnRemoved(Lcom/android/dx/ssa/SsaInsn;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    add-int/lit8 v3, v3, -0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    :goto_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    const/4 v3, 0x0

    .line 56
    if-nez v0, :cond_3

    .line 57
    .line 58
    move-object v5, v3

    .line 59
    goto :goto_2

    .line 60
    :cond_3
    add-int/lit8 v5, v0, -0x1

    .line 61
    .line 62
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    check-cast v5, Lcom/android/dx/ssa/SsaInsn;

    .line 67
    .line 68
    :goto_2
    invoke-virtual {p0}, Lcom/android/dx/ssa/SsaMethod;->getExitBlock()Lcom/android/dx/ssa/SsaBasicBlock;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    if-eq v1, v6, :cond_0

    .line 73
    .line 74
    if-eqz v0, :cond_4

    .line 75
    .line 76
    invoke-virtual {v5}, Lcom/android/dx/ssa/SsaInsn;->getOriginalRopInsn()Lcom/android/dx/rop/code/Insn;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    if-eqz v0, :cond_4

    .line 81
    .line 82
    invoke-virtual {v5}, Lcom/android/dx/ssa/SsaInsn;->getOriginalRopInsn()Lcom/android/dx/rop/code/Insn;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-virtual {v0}, Lcom/android/dx/rop/code/Insn;->getOpcode()Lcom/android/dx/rop/code/Rop;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-virtual {v0}, Lcom/android/dx/rop/code/Rop;->getBranchingness()I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-ne v0, v4, :cond_0

    .line 95
    .line 96
    :cond_4
    new-instance v0, Lcom/android/dx/rop/code/PlainInsn;

    .line 97
    .line 98
    sget-object v4, Lcom/android/dx/rop/code/Rops;->GOTO:Lcom/android/dx/rop/code/Rop;

    .line 99
    .line 100
    sget-object v5, Lcom/android/dx/rop/code/SourcePosition;->NO_INFO:Lcom/android/dx/rop/code/SourcePosition;

    .line 101
    .line 102
    sget-object v6, Lcom/android/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 103
    .line 104
    invoke-direct {v0, v4, v5, v3, v6}, Lcom/android/dx/rop/code/PlainInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 105
    .line 106
    .line 107
    invoke-static {v0, v1}, Lcom/android/dx/ssa/SsaInsn;->makeFromRop(Lcom/android/dx/rop/code/Insn;Lcom/android/dx/ssa/SsaBasicBlock;)Lcom/android/dx/ssa/SsaInsn;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    invoke-virtual {v1}, Lcom/android/dx/ssa/SsaBasicBlock;->getSuccessors()Ljava/util/BitSet;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    const/4 v2, 0x0

    .line 119
    invoke-virtual {v0, v2}, Ljava/util/BitSet;->nextSetBit(I)I

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    :goto_3
    if-ltz v2, :cond_0

    .line 124
    .line 125
    invoke-virtual {v1}, Lcom/android/dx/ssa/SsaBasicBlock;->getPrimarySuccessorIndex()I

    .line 126
    .line 127
    .line 128
    move-result v3

    .line 129
    if-eq v2, v3, :cond_5

    .line 130
    .line 131
    invoke-virtual {v1, v2}, Lcom/android/dx/ssa/SsaBasicBlock;->removeSuccessor(I)V

    .line 132
    .line 133
    .line 134
    :cond_5
    add-int/lit8 v2, v2, 0x1

    .line 135
    .line 136
    invoke-virtual {v0, v2}, Ljava/util/BitSet;->nextSetBit(I)I

    .line 137
    .line 138
    .line 139
    move-result v2

    .line 140
    goto :goto_3

    .line 141
    :cond_6
    return-void
.end method

.method public forEachBlockDepthFirst(ZLcom/android/dx/ssa/SsaBasicBlock$Visitor;)V
    .locals 7

    .line 1
    new-instance v0, Ljava/util/BitSet;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/android/dx/ssa/SsaMethod;->blocks:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-direct {v0, v1}, Ljava/util/BitSet;-><init>(I)V

    .line 10
    .line 11
    .line 12
    new-instance v1, Ljava/util/Stack;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/util/Stack;-><init>()V

    .line 15
    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/android/dx/ssa/SsaMethod;->getExitBlock()Lcom/android/dx/ssa/SsaBasicBlock;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {p0}, Lcom/android/dx/ssa/SsaMethod;->getEntryBlock()Lcom/android/dx/ssa/SsaBasicBlock;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    :goto_0
    if-nez v2, :cond_1

    .line 29
    .line 30
    goto :goto_4

    .line 31
    :cond_1
    const/4 v3, 0x0

    .line 32
    invoke-virtual {v1, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    :cond_2
    :goto_1
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-lez v2, :cond_5

    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    check-cast v2, Lcom/android/dx/ssa/SsaBasicBlock;

    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    check-cast v3, Lcom/android/dx/ssa/SsaBasicBlock;

    .line 55
    .line 56
    invoke-virtual {v2}, Lcom/android/dx/ssa/SsaBasicBlock;->getIndex()I

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    invoke-virtual {v0, v4}, Ljava/util/BitSet;->get(I)Z

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    if-nez v4, :cond_2

    .line 65
    .line 66
    if-eqz p1, :cond_3

    .line 67
    .line 68
    invoke-virtual {v2}, Lcom/android/dx/ssa/SsaBasicBlock;->getPredecessors()Ljava/util/BitSet;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    goto :goto_2

    .line 73
    :cond_3
    invoke-virtual {v2}, Lcom/android/dx/ssa/SsaBasicBlock;->getSuccessors()Ljava/util/BitSet;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    :goto_2
    const/4 v5, 0x0

    .line 78
    invoke-virtual {v4, v5}, Ljava/util/BitSet;->nextSetBit(I)I

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    :goto_3
    if-ltz v5, :cond_4

    .line 83
    .line 84
    invoke-virtual {v1, v2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    iget-object v6, p0, Lcom/android/dx/ssa/SsaMethod;->blocks:Ljava/util/ArrayList;

    .line 88
    .line 89
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v6

    .line 93
    check-cast v6, Lcom/android/dx/ssa/SsaBasicBlock;

    .line 94
    .line 95
    invoke-virtual {v1, v6}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    add-int/lit8 v5, v5, 0x1

    .line 99
    .line 100
    invoke-virtual {v4, v5}, Ljava/util/BitSet;->nextSetBit(I)I

    .line 101
    .line 102
    .line 103
    move-result v5

    .line 104
    goto :goto_3

    .line 105
    :cond_4
    invoke-virtual {v2}, Lcom/android/dx/ssa/SsaBasicBlock;->getIndex()I

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    invoke-virtual {v0, v4}, Ljava/util/BitSet;->set(I)V

    .line 110
    .line 111
    .line 112
    invoke-interface {p2, v2, v3}, Lcom/android/dx/ssa/SsaBasicBlock$Visitor;->visitBlock(Lcom/android/dx/ssa/SsaBasicBlock;Lcom/android/dx/ssa/SsaBasicBlock;)V

    .line 113
    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_5
    :goto_4
    return-void
.end method

.method public forEachBlockDepthFirstDom(Lcom/android/dx/ssa/SsaBasicBlock$Visitor;)V
    .locals 5

    .line 1
    new-instance v0, Ljava/util/BitSet;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/ssa/SsaMethod;->getBlocks()Ljava/util/ArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-direct {v0, v1}, Ljava/util/BitSet;-><init>(I)V

    .line 12
    .line 13
    .line 14
    new-instance v1, Ljava/util/Stack;

    .line 15
    .line 16
    invoke-direct {v1}, Ljava/util/Stack;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/android/dx/ssa/SsaMethod;->getEntryBlock()Lcom/android/dx/ssa/SsaBasicBlock;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {v1, p0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    :cond_0
    :goto_0
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-lez p0, :cond_2

    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    check-cast p0, Lcom/android/dx/ssa/SsaBasicBlock;

    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/android/dx/ssa/SsaBasicBlock;->getDomChildren()Ljava/util/ArrayList;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {p0}, Lcom/android/dx/ssa/SsaBasicBlock;->getIndex()I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    invoke-virtual {v0, v3}, Ljava/util/BitSet;->get(I)Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-nez v3, :cond_0

    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    add-int/lit8 v3, v3, -0x1

    .line 57
    .line 58
    :goto_1
    if-ltz v3, :cond_1

    .line 59
    .line 60
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    check-cast v4, Lcom/android/dx/ssa/SsaBasicBlock;

    .line 65
    .line 66
    invoke-virtual {v1, v4}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    add-int/lit8 v3, v3, -0x1

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_1
    invoke-virtual {p0}, Lcom/android/dx/ssa/SsaBasicBlock;->getIndex()I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    invoke-virtual {v0, v2}, Ljava/util/BitSet;->set(I)V

    .line 77
    .line 78
    .line 79
    const/4 v2, 0x0

    .line 80
    invoke-interface {p1, p0, v2}, Lcom/android/dx/ssa/SsaBasicBlock$Visitor;->visitBlock(Lcom/android/dx/ssa/SsaBasicBlock;Lcom/android/dx/ssa/SsaBasicBlock;)V

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_2
    return-void
.end method

.method public forEachInsn(Lcom/android/dx/ssa/SsaInsn$Visitor;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/android/dx/ssa/SsaMethod;->blocks:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lcom/android/dx/ssa/SsaBasicBlock;

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Lcom/android/dx/ssa/SsaBasicBlock;->forEachInsn(Lcom/android/dx/ssa/SsaInsn$Visitor;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-void
.end method

.method public forEachPhiInsn(Lcom/android/dx/ssa/PhiInsn$Visitor;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/android/dx/ssa/SsaMethod;->blocks:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lcom/android/dx/ssa/SsaBasicBlock;

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Lcom/android/dx/ssa/SsaBasicBlock;->forEachPhiInsn(Lcom/android/dx/ssa/PhiInsn$Visitor;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-void
.end method

.method public getBlocks()Ljava/util/ArrayList;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/android/dx/ssa/SsaBasicBlock;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/android/dx/ssa/SsaMethod;->blocks:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object p0
.end method

.method public getDefinitionForRegister(I)Lcom/android/dx/ssa/SsaInsn;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/android/dx/ssa/SsaMethod;->backMode:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/android/dx/ssa/SsaMethod;->definitionList:[Lcom/android/dx/ssa/SsaInsn;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    aget-object p0, v0, p1

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    invoke-virtual {p0}, Lcom/android/dx/ssa/SsaMethod;->getRegCount()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    new-array v0, v0, [Lcom/android/dx/ssa/SsaInsn;

    .line 17
    .line 18
    iput-object v0, p0, Lcom/android/dx/ssa/SsaMethod;->definitionList:[Lcom/android/dx/ssa/SsaInsn;

    .line 19
    .line 20
    new-instance v0, Lcom/android/dx/ssa/SsaMethod$1;

    .line 21
    .line 22
    invoke-direct {v0, p0}, Lcom/android/dx/ssa/SsaMethod$1;-><init>(Lcom/android/dx/ssa/SsaMethod;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v0}, Lcom/android/dx/ssa/SsaMethod;->forEachInsn(Lcom/android/dx/ssa/SsaInsn$Visitor;)V

    .line 26
    .line 27
    .line 28
    iget-object p0, p0, Lcom/android/dx/ssa/SsaMethod;->definitionList:[Lcom/android/dx/ssa/SsaInsn;

    .line 29
    .line 30
    aget-object p0, p0, p1

    .line 31
    .line 32
    return-object p0

    .line 33
    :cond_1
    const-string p0, "No def list in back mode"

    .line 34
    .line 35
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const/4 p0, 0x0

    .line 39
    return-object p0
.end method

.method public getEntryBlock()Lcom/android/dx/ssa/SsaBasicBlock;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/dx/ssa/SsaMethod;->blocks:Ljava/util/ArrayList;

    .line 2
    .line 3
    iget p0, p0, Lcom/android/dx/ssa/SsaMethod;->entryBlockIndex:I

    .line 4
    .line 5
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lcom/android/dx/ssa/SsaBasicBlock;

    .line 10
    .line 11
    return-object p0
.end method

.method public getEntryBlockIndex()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/ssa/SsaMethod;->entryBlockIndex:I

    .line 2
    .line 3
    return p0
.end method

.method public getExitBlock()Lcom/android/dx/ssa/SsaBasicBlock;
    .locals 1

    .line 1
    iget v0, p0, Lcom/android/dx/ssa/SsaMethod;->exitBlockIndex:I

    .line 2
    .line 3
    if-gez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return-object p0

    .line 7
    :cond_0
    iget-object p0, p0, Lcom/android/dx/ssa/SsaMethod;->blocks:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Lcom/android/dx/ssa/SsaBasicBlock;

    .line 14
    .line 15
    return-object p0
.end method

.method public getExitBlockIndex()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/ssa/SsaMethod;->exitBlockIndex:I

    .line 2
    .line 3
    return p0
.end method

.method public getParamWidth()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/ssa/SsaMethod;->paramWidth:I

    .line 2
    .line 3
    return p0
.end method

.method public getRegCount()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/ssa/SsaMethod;->registerCount:I

    .line 2
    .line 3
    return p0
.end method

.method public getUseListCopy()[Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Ljava/util/ArrayList<",
            "Lcom/android/dx/ssa/SsaInsn;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/android/dx/ssa/SsaMethod;->useList:[Ljava/util/ArrayList;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/android/dx/ssa/SsaMethod;->buildUseList()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget v0, p0, Lcom/android/dx/ssa/SsaMethod;->registerCount:I

    .line 9
    .line 10
    new-array v0, v0, [Ljava/util/ArrayList;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    :goto_0
    iget v2, p0, Lcom/android/dx/ssa/SsaMethod;->registerCount:I

    .line 14
    .line 15
    if-ge v1, v2, :cond_1

    .line 16
    .line 17
    new-instance v2, Ljava/util/ArrayList;

    .line 18
    .line 19
    iget-object v3, p0, Lcom/android/dx/ssa/SsaMethod;->useList:[Ljava/util/ArrayList;

    .line 20
    .line 21
    aget-object v3, v3, v1

    .line 22
    .line 23
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 24
    .line 25
    .line 26
    aput-object v2, v0, v1

    .line 27
    .line 28
    add-int/lit8 v1, v1, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    return-object v0
.end method

.method public getUseListForRegister(I)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Lcom/android/dx/ssa/SsaInsn;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/android/dx/ssa/SsaMethod;->unmodifiableUseList:[Ljava/util/List;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/android/dx/ssa/SsaMethod;->buildUseList()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object p0, p0, Lcom/android/dx/ssa/SsaMethod;->unmodifiableUseList:[Ljava/util/List;

    .line 9
    .line 10
    aget-object p0, p0, p1

    .line 11
    .line 12
    return-object p0
.end method

.method public isRegALocal(Lcom/android/dx/rop/code/RegisterSpec;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0, v0}, Lcom/android/dx/ssa/SsaMethod;->getDefinitionForRegister(I)Lcom/android/dx/ssa/SsaInsn;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    return v1

    .line 13
    :cond_0
    invoke-virtual {v0}, Lcom/android/dx/ssa/SsaInsn;->getLocalAssignment()Lcom/android/dx/rop/code/RegisterSpec;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const/4 v2, 0x1

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    return v2

    .line 21
    :cond_1
    invoke-virtual {p1}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    invoke-virtual {p0, p1}, Lcom/android/dx/ssa/SsaMethod;->getUseListForRegister(I)Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eqz p1, :cond_3

    .line 38
    .line 39
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    check-cast p1, Lcom/android/dx/ssa/SsaInsn;

    .line 44
    .line 45
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaInsn;->getOriginalRopInsn()Lcom/android/dx/rop/code/Insn;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    if-eqz p1, :cond_2

    .line 50
    .line 51
    invoke-virtual {p1}, Lcom/android/dx/rop/code/Insn;->getOpcode()Lcom/android/dx/rop/code/Rop;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-virtual {p1}, Lcom/android/dx/rop/code/Rop;->getOpcode()I

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    const/16 v0, 0x36

    .line 60
    .line 61
    if-ne p1, v0, :cond_2

    .line 62
    .line 63
    return v2

    .line 64
    :cond_3
    return v1
.end method

.method public isStatic()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/android/dx/ssa/SsaMethod;->isStatic:Z

    .line 2
    .line 3
    return p0
.end method

.method public makeExitBlock()V
    .locals 4

    .line 1
    iget v0, p0, Lcom/android/dx/ssa/SsaMethod;->exitBlockIndex:I

    .line 2
    .line 3
    if-gez v0, :cond_2

    .line 4
    .line 5
    iget-object v0, p0, Lcom/android/dx/ssa/SsaMethod;->blocks:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iput v0, p0, Lcom/android/dx/ssa/SsaMethod;->exitBlockIndex:I

    .line 12
    .line 13
    new-instance v0, Lcom/android/dx/ssa/SsaBasicBlock;

    .line 14
    .line 15
    iget v1, p0, Lcom/android/dx/ssa/SsaMethod;->exitBlockIndex:I

    .line 16
    .line 17
    iget v2, p0, Lcom/android/dx/ssa/SsaMethod;->maxLabel:I

    .line 18
    .line 19
    add-int/lit8 v3, v2, 0x1

    .line 20
    .line 21
    iput v3, p0, Lcom/android/dx/ssa/SsaMethod;->maxLabel:I

    .line 22
    .line 23
    invoke-direct {v0, v1, v2, p0}, Lcom/android/dx/ssa/SsaBasicBlock;-><init>(IILcom/android/dx/ssa/SsaMethod;)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Lcom/android/dx/ssa/SsaMethod;->blocks:Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, Lcom/android/dx/ssa/SsaMethod;->blocks:Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_0

    .line 42
    .line 43
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    check-cast v2, Lcom/android/dx/ssa/SsaBasicBlock;

    .line 48
    .line 49
    invoke-virtual {v2, v0}, Lcom/android/dx/ssa/SsaBasicBlock;->exitBlockFixup(Lcom/android/dx/ssa/SsaBasicBlock;)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    invoke-virtual {v0}, Lcom/android/dx/ssa/SsaBasicBlock;->getPredecessors()Ljava/util/BitSet;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v0}, Ljava/util/BitSet;->cardinality()I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-nez v0, :cond_1

    .line 62
    .line 63
    iget-object v0, p0, Lcom/android/dx/ssa/SsaMethod;->blocks:Ljava/util/ArrayList;

    .line 64
    .line 65
    iget v1, p0, Lcom/android/dx/ssa/SsaMethod;->exitBlockIndex:I

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    const/4 v0, -0x1

    .line 71
    iput v0, p0, Lcom/android/dx/ssa/SsaMethod;->exitBlockIndex:I

    .line 72
    .line 73
    iget v0, p0, Lcom/android/dx/ssa/SsaMethod;->maxLabel:I

    .line 74
    .line 75
    add-int/lit8 v0, v0, -0x1

    .line 76
    .line 77
    iput v0, p0, Lcom/android/dx/ssa/SsaMethod;->maxLabel:I

    .line 78
    .line 79
    :cond_1
    return-void

    .line 80
    :cond_2
    const-string p0, "must be called at most once"

    .line 81
    .line 82
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    return-void
.end method

.method public makeNewGotoBlock()Lcom/android/dx/ssa/SsaBasicBlock;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/android/dx/ssa/SsaMethod;->blocks:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    new-instance v1, Lcom/android/dx/ssa/SsaBasicBlock;

    .line 8
    .line 9
    iget v2, p0, Lcom/android/dx/ssa/SsaMethod;->maxLabel:I

    .line 10
    .line 11
    add-int/lit8 v3, v2, 0x1

    .line 12
    .line 13
    iput v3, p0, Lcom/android/dx/ssa/SsaMethod;->maxLabel:I

    .line 14
    .line 15
    invoke-direct {v1, v0, v2, p0}, Lcom/android/dx/ssa/SsaBasicBlock;-><init>(IILcom/android/dx/ssa/SsaMethod;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Lcom/android/dx/ssa/SsaBasicBlock;->getInsns()Ljava/util/ArrayList;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {v1}, Lcom/android/dx/ssa/SsaMethod;->getGoto(Lcom/android/dx/ssa/SsaBasicBlock;)Lcom/android/dx/ssa/SsaInsn;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    iget-object p0, p0, Lcom/android/dx/ssa/SsaMethod;->blocks:Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    return-object v1
.end method

.method public makeNewSsaReg()I
    .locals 2

    .line 1
    iget v0, p0, Lcom/android/dx/ssa/SsaMethod;->registerCount:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    iput v1, p0, Lcom/android/dx/ssa/SsaMethod;->registerCount:I

    .line 6
    .line 7
    iput v1, p0, Lcom/android/dx/ssa/SsaMethod;->spareRegisterBase:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/android/dx/ssa/SsaMethod;->onInsnsChanged()V

    .line 10
    .line 11
    .line 12
    return v0
.end method

.method public mapRegisters(Lcom/android/dx/ssa/RegisterMapper;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/ssa/SsaMethod;->getBlocks()Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Lcom/android/dx/ssa/SsaBasicBlock;

    .line 20
    .line 21
    invoke-virtual {v1}, Lcom/android/dx/ssa/SsaBasicBlock;->getInsns()Ljava/util/ArrayList;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_0

    .line 34
    .line 35
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    check-cast v2, Lcom/android/dx/ssa/SsaInsn;

    .line 40
    .line 41
    invoke-virtual {v2, p1}, Lcom/android/dx/ssa/SsaInsn;->mapRegisters(Lcom/android/dx/ssa/RegisterMapper;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    invoke-virtual {p1}, Lcom/android/dx/ssa/RegisterMapper;->getNewRegisterCount()I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    iput p1, p0, Lcom/android/dx/ssa/SsaMethod;->registerCount:I

    .line 50
    .line 51
    iput p1, p0, Lcom/android/dx/ssa/SsaMethod;->spareRegisterBase:I

    .line 52
    .line 53
    return-void
.end method

.method public onInsnAdded(Lcom/android/dx/ssa/SsaInsn;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, Lcom/android/dx/ssa/SsaMethod;->onSourcesChanged(Lcom/android/dx/ssa/SsaInsn;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, v0}, Lcom/android/dx/ssa/SsaMethod;->updateOneDefinition(Lcom/android/dx/ssa/SsaInsn;Lcom/android/dx/rop/code/RegisterSpec;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public onInsnRemoved(Lcom/android/dx/ssa/SsaInsn;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/dx/ssa/SsaMethod;->useList:[Ljava/util/ArrayList;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaInsn;->getSources()Lcom/android/dx/rop/code/RegisterSpecList;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-direct {p0, p1, v0}, Lcom/android/dx/ssa/SsaMethod;->removeFromUseList(Lcom/android/dx/ssa/SsaInsn;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaInsn;->getResult()Lcom/android/dx/rop/code/RegisterSpec;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iget-object p0, p0, Lcom/android/dx/ssa/SsaMethod;->definitionList:[Lcom/android/dx/ssa/SsaInsn;

    .line 17
    .line 18
    if-eqz p0, :cond_1

    .line 19
    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    const/4 v0, 0x0

    .line 27
    aput-object v0, p0, p1

    .line 28
    .line 29
    :cond_1
    return-void
.end method

.method public onInsnsChanged()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/android/dx/ssa/SsaMethod;->definitionList:[Lcom/android/dx/ssa/SsaInsn;

    .line 3
    .line 4
    iput-object v0, p0, Lcom/android/dx/ssa/SsaMethod;->useList:[Ljava/util/ArrayList;

    .line 5
    .line 6
    iput-object v0, p0, Lcom/android/dx/ssa/SsaMethod;->unmodifiableUseList:[Ljava/util/List;

    .line 7
    .line 8
    return-void
.end method

.method public onSourceChanged(Lcom/android/dx/ssa/SsaInsn;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpec;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/dx/ssa/SsaMethod;->useList:[Ljava/util/ArrayList;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    if-eqz p2, :cond_1

    .line 7
    .line 8
    invoke-virtual {p2}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    iget-object v0, p0, Lcom/android/dx/ssa/SsaMethod;->useList:[Ljava/util/ArrayList;

    .line 13
    .line 14
    aget-object p2, v0, p2

    .line 15
    .line 16
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    :cond_1
    invoke-virtual {p3}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    iget-object p3, p0, Lcom/android/dx/ssa/SsaMethod;->useList:[Ljava/util/ArrayList;

    .line 24
    .line 25
    array-length v0, p3

    .line 26
    if-gt v0, p2, :cond_2

    .line 27
    .line 28
    const/4 p1, 0x0

    .line 29
    iput-object p1, p0, Lcom/android/dx/ssa/SsaMethod;->useList:[Ljava/util/ArrayList;

    .line 30
    .line 31
    return-void

    .line 32
    :cond_2
    aget-object p0, p3, p2

    .line 33
    .line 34
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public onSourcesChanged(Lcom/android/dx/ssa/SsaInsn;Lcom/android/dx/rop/code/RegisterSpecList;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/android/dx/ssa/SsaMethod;->useList:[Ljava/util/ArrayList;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    if-eqz p2, :cond_1

    .line 7
    .line 8
    invoke-direct {p0, p1, p2}, Lcom/android/dx/ssa/SsaMethod;->removeFromUseList(Lcom/android/dx/ssa/SsaInsn;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 9
    .line 10
    .line 11
    :cond_1
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaInsn;->getSources()Lcom/android/dx/rop/code/RegisterSpecList;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-virtual {p2}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v1, 0x0

    .line 20
    :goto_0
    if-ge v1, v0, :cond_2

    .line 21
    .line 22
    invoke-virtual {p2, v1}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v2}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    iget-object v3, p0, Lcom/android/dx/ssa/SsaMethod;->useList:[Ljava/util/ArrayList;

    .line 31
    .line 32
    aget-object v2, v3, v2

    .line 33
    .line 34
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    add-int/lit8 v1, v1, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    :goto_1
    return-void
.end method

.method public returnSpareRegisters()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/android/dx/ssa/SsaMethod;->borrowedSpareRegisters:I

    .line 3
    .line 4
    return-void
.end method

.method public setBackMode()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/android/dx/ssa/SsaMethod;->backMode:Z

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/android/dx/ssa/SsaMethod;->useList:[Ljava/util/ArrayList;

    .line 6
    .line 7
    iput-object v0, p0, Lcom/android/dx/ssa/SsaMethod;->definitionList:[Lcom/android/dx/ssa/SsaInsn;

    .line 8
    .line 9
    return-void
.end method

.method public setNewRegCount(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/android/dx/ssa/SsaMethod;->registerCount:I

    .line 2
    .line 3
    iput p1, p0, Lcom/android/dx/ssa/SsaMethod;->spareRegisterBase:I

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/android/dx/ssa/SsaMethod;->onInsnsChanged()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public updateOneDefinition(Lcom/android/dx/ssa/SsaInsn;Lcom/android/dx/rop/code/RegisterSpec;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/android/dx/ssa/SsaMethod;->definitionList:[Lcom/android/dx/ssa/SsaInsn;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    if-eqz p2, :cond_1

    .line 7
    .line 8
    invoke-virtual {p2}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    iget-object v0, p0, Lcom/android/dx/ssa/SsaMethod;->definitionList:[Lcom/android/dx/ssa/SsaInsn;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    aput-object v1, v0, p2

    .line 16
    .line 17
    :cond_1
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaInsn;->getResult()Lcom/android/dx/rop/code/RegisterSpec;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    if-eqz p2, :cond_3

    .line 22
    .line 23
    invoke-virtual {p2}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    iget-object p0, p0, Lcom/android/dx/ssa/SsaMethod;->definitionList:[Lcom/android/dx/ssa/SsaInsn;

    .line 28
    .line 29
    aget-object v0, p0, v0

    .line 30
    .line 31
    if-nez v0, :cond_2

    .line 32
    .line 33
    invoke-virtual {p2}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    aput-object p1, p0, p2

    .line 38
    .line 39
    return-void

    .line 40
    :cond_2
    const-string p0, "Duplicate add of insn"

    .line 41
    .line 42
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    :cond_3
    :goto_0
    return-void
.end method
