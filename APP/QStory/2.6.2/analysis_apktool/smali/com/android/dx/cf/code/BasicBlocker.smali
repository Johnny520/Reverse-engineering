.class public final Lcom/android/dx/cf/code/BasicBlocker;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lcom/android/dx/cf/code/BytecodeArray$Visitor;


# instance fields
.field private final blockSet:[I

.field private final catchLists:[Lcom/android/dx/cf/code/ByteCatchList;

.field private final liveSet:[I

.field private final method:Lcom/android/dx/cf/code/ConcreteMethod;

.field private previousOffset:I

.field private final targetLists:[Lcom/android/dx/util/IntList;

.field private final workSet:[I


# direct methods
.method private constructor <init>(Lcom/android/dx/cf/code/ConcreteMethod;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    iput-object p1, p0, Lcom/android/dx/cf/code/BasicBlocker;->method:Lcom/android/dx/cf/code/ConcreteMethod;

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/android/dx/cf/code/ConcreteMethod;->getCode()Lcom/android/dx/cf/code/BytecodeArray;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Lcom/android/dx/cf/code/BytecodeArray;->size()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    add-int/lit8 p1, p1, 0x1

    .line 17
    .line 18
    invoke-static {p1}, Lcom/android/dx/util/Bits;->makeBitSet(I)[I

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, Lcom/android/dx/cf/code/BasicBlocker;->workSet:[I

    .line 23
    .line 24
    invoke-static {p1}, Lcom/android/dx/util/Bits;->makeBitSet(I)[I

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iput-object v0, p0, Lcom/android/dx/cf/code/BasicBlocker;->liveSet:[I

    .line 29
    .line 30
    invoke-static {p1}, Lcom/android/dx/util/Bits;->makeBitSet(I)[I

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iput-object v0, p0, Lcom/android/dx/cf/code/BasicBlocker;->blockSet:[I

    .line 35
    .line 36
    new-array v0, p1, [Lcom/android/dx/util/IntList;

    .line 37
    .line 38
    iput-object v0, p0, Lcom/android/dx/cf/code/BasicBlocker;->targetLists:[Lcom/android/dx/util/IntList;

    .line 39
    .line 40
    new-array p1, p1, [Lcom/android/dx/cf/code/ByteCatchList;

    .line 41
    .line 42
    iput-object p1, p0, Lcom/android/dx/cf/code/BasicBlocker;->catchLists:[Lcom/android/dx/cf/code/ByteCatchList;

    .line 43
    .line 44
    const/4 p1, -0x1

    .line 45
    iput p1, p0, Lcom/android/dx/cf/code/BasicBlocker;->previousOffset:I

    .line 46
    .line 47
    return-void

    .line 48
    :cond_0
    const-string p0, "method == null"

    .line 49
    .line 50
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    const/4 p0, 0x0

    .line 54
    throw p0
.end method

.method private addWorkIfNecessary(IZ)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/dx/cf/code/BasicBlocker;->liveSet:[I

    .line 2
    .line 3
    invoke-static {v0, p1}, Lcom/android/dx/util/Bits;->get([II)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/android/dx/cf/code/BasicBlocker;->workSet:[I

    .line 10
    .line 11
    invoke-static {v0, p1}, Lcom/android/dx/util/Bits;->set([II)V

    .line 12
    .line 13
    .line 14
    :cond_0
    if-eqz p2, :cond_1

    .line 15
    .line 16
    iget-object p0, p0, Lcom/android/dx/cf/code/BasicBlocker;->blockSet:[I

    .line 17
    .line 18
    invoke-static {p0, p1}, Lcom/android/dx/util/Bits;->set([II)V

    .line 19
    .line 20
    .line 21
    :cond_1
    return-void
.end method

.method private doit()V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/android/dx/cf/code/BasicBlocker;->method:Lcom/android/dx/cf/code/ConcreteMethod;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/dx/cf/code/ConcreteMethod;->getCode()Lcom/android/dx/cf/code/BytecodeArray;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/android/dx/cf/code/BasicBlocker;->method:Lcom/android/dx/cf/code/ConcreteMethod;

    .line 8
    .line 9
    invoke-virtual {v1}, Lcom/android/dx/cf/code/ConcreteMethod;->getCatches()Lcom/android/dx/cf/code/ByteCatchList;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    iget-object v3, p0, Lcom/android/dx/cf/code/BasicBlocker;->workSet:[I

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    invoke-static {v3, v4}, Lcom/android/dx/util/Bits;->set([II)V

    .line 21
    .line 22
    .line 23
    iget-object v3, p0, Lcom/android/dx/cf/code/BasicBlocker;->blockSet:[I

    .line 24
    .line 25
    invoke-static {v3, v4}, Lcom/android/dx/util/Bits;->set([II)V

    .line 26
    .line 27
    .line 28
    :cond_0
    iget-object v3, p0, Lcom/android/dx/cf/code/BasicBlocker;->workSet:[I

    .line 29
    .line 30
    invoke-static {v3}, Lcom/android/dx/util/Bits;->isEmpty([I)Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-nez v3, :cond_2

    .line 35
    .line 36
    :try_start_0
    iget-object v3, p0, Lcom/android/dx/cf/code/BasicBlocker;->workSet:[I

    .line 37
    .line 38
    invoke-virtual {v0, v3, p0}, Lcom/android/dx/cf/code/BytecodeArray;->processWorkSet([ILcom/android/dx/cf/code/BytecodeArray$Visitor;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 39
    .line 40
    .line 41
    move v3, v4

    .line 42
    :goto_0
    if-ge v3, v2, :cond_0

    .line 43
    .line 44
    invoke-virtual {v1, v3}, Lcom/android/dx/cf/code/ByteCatchList;->get(I)Lcom/android/dx/cf/code/ByteCatchList$Item;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    invoke-virtual {v5}, Lcom/android/dx/cf/code/ByteCatchList$Item;->getStartPc()I

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    invoke-virtual {v5}, Lcom/android/dx/cf/code/ByteCatchList$Item;->getEndPc()I

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    iget-object v8, p0, Lcom/android/dx/cf/code/BasicBlocker;->liveSet:[I

    .line 57
    .line 58
    invoke-static {v8, v6, v7}, Lcom/android/dx/util/Bits;->anyInRange([III)Z

    .line 59
    .line 60
    .line 61
    move-result v8

    .line 62
    if-eqz v8, :cond_1

    .line 63
    .line 64
    iget-object v8, p0, Lcom/android/dx/cf/code/BasicBlocker;->blockSet:[I

    .line 65
    .line 66
    invoke-static {v8, v6}, Lcom/android/dx/util/Bits;->set([II)V

    .line 67
    .line 68
    .line 69
    iget-object v6, p0, Lcom/android/dx/cf/code/BasicBlocker;->blockSet:[I

    .line 70
    .line 71
    invoke-static {v6, v7}, Lcom/android/dx/util/Bits;->set([II)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v5}, Lcom/android/dx/cf/code/ByteCatchList$Item;->getHandlerPc()I

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    const/4 v6, 0x1

    .line 79
    invoke-direct {p0, v5, v6}, Lcom/android/dx/cf/code/BasicBlocker;->addWorkIfNecessary(IZ)V

    .line 80
    .line 81
    .line 82
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :catch_0
    move-exception p0

    .line 86
    new-instance v0, Lcom/android/dx/cf/code/SimException;

    .line 87
    .line 88
    const-string v1, "flow of control falls off end of method"

    .line 89
    .line 90
    invoke-direct {v0, v1, p0}, Lcom/android/dx/cf/code/SimException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 91
    .line 92
    .line 93
    throw v0

    .line 94
    :cond_2
    return-void
.end method

.method private getBlockList()Lcom/android/dx/cf/code/ByteBlockList;
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/android/dx/cf/code/BasicBlocker;->method:Lcom/android/dx/cf/code/ConcreteMethod;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/dx/cf/code/ConcreteMethod;->getCode()Lcom/android/dx/cf/code/BytecodeArray;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/android/dx/cf/code/BytecodeArray;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    new-array v0, v0, [Lcom/android/dx/cf/code/ByteBlock;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    move v3, v1

    .line 15
    move v8, v3

    .line 16
    :goto_0
    iget-object v2, p0, Lcom/android/dx/cf/code/BasicBlocker;->blockSet:[I

    .line 17
    .line 18
    add-int/lit8 v4, v3, 0x1

    .line 19
    .line 20
    invoke-static {v2, v4}, Lcom/android/dx/util/Bits;->findFirst([II)I

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    if-gez v5, :cond_1

    .line 25
    .line 26
    new-instance p0, Lcom/android/dx/cf/code/ByteBlockList;

    .line 27
    .line 28
    invoke-direct {p0, v8}, Lcom/android/dx/cf/code/ByteBlockList;-><init>(I)V

    .line 29
    .line 30
    .line 31
    :goto_1
    if-ge v1, v8, :cond_0

    .line 32
    .line 33
    aget-object v2, v0, v1

    .line 34
    .line 35
    invoke-virtual {p0, v1, v2}, Lcom/android/dx/cf/code/ByteBlockList;->set(ILcom/android/dx/cf/code/ByteBlock;)V

    .line 36
    .line 37
    .line 38
    add-int/lit8 v1, v1, 0x1

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_0
    return-object p0

    .line 42
    :cond_1
    iget-object v2, p0, Lcom/android/dx/cf/code/BasicBlocker;->liveSet:[I

    .line 43
    .line 44
    invoke-static {v2, v3}, Lcom/android/dx/util/Bits;->get([II)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_6

    .line 49
    .line 50
    add-int/lit8 v2, v5, -0x1

    .line 51
    .line 52
    const/4 v4, 0x0

    .line 53
    :goto_2
    if-lt v2, v3, :cond_3

    .line 54
    .line 55
    iget-object v4, p0, Lcom/android/dx/cf/code/BasicBlocker;->targetLists:[Lcom/android/dx/util/IntList;

    .line 56
    .line 57
    aget-object v4, v4, v2

    .line 58
    .line 59
    if-eqz v4, :cond_2

    .line 60
    .line 61
    goto :goto_3

    .line 62
    :cond_2
    add-int/lit8 v2, v2, -0x1

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_3
    const/4 v2, -0x1

    .line 66
    :goto_3
    if-nez v4, :cond_5

    .line 67
    .line 68
    invoke-static {v5}, Lcom/android/dx/util/IntList;->makeImmutable(I)Lcom/android/dx/util/IntList;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    sget-object v2, Lcom/android/dx/cf/code/ByteCatchList;->EMPTY:Lcom/android/dx/cf/code/ByteCatchList;

    .line 73
    .line 74
    :cond_4
    :goto_4
    move-object v7, v2

    .line 75
    move-object v6, v4

    .line 76
    goto :goto_5

    .line 77
    :cond_5
    iget-object v6, p0, Lcom/android/dx/cf/code/BasicBlocker;->catchLists:[Lcom/android/dx/cf/code/ByteCatchList;

    .line 78
    .line 79
    aget-object v2, v6, v2

    .line 80
    .line 81
    if-nez v2, :cond_4

    .line 82
    .line 83
    sget-object v2, Lcom/android/dx/cf/code/ByteCatchList;->EMPTY:Lcom/android/dx/cf/code/ByteCatchList;

    .line 84
    .line 85
    goto :goto_4

    .line 86
    :goto_5
    new-instance v2, Lcom/android/dx/cf/code/ByteBlock;

    .line 87
    .line 88
    move v4, v3

    .line 89
    invoke-direct/range {v2 .. v7}, Lcom/android/dx/cf/code/ByteBlock;-><init>(IIILcom/android/dx/util/IntList;Lcom/android/dx/cf/code/ByteCatchList;)V

    .line 90
    .line 91
    .line 92
    aput-object v2, v0, v8

    .line 93
    .line 94
    add-int/lit8 v8, v8, 0x1

    .line 95
    .line 96
    :cond_6
    move v3, v5

    .line 97
    goto :goto_0
.end method

.method public static identifyBlocks(Lcom/android/dx/cf/code/ConcreteMethod;)Lcom/android/dx/cf/code/ByteBlockList;
    .locals 1

    .line 1
    new-instance v0, Lcom/android/dx/cf/code/BasicBlocker;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/android/dx/cf/code/BasicBlocker;-><init>(Lcom/android/dx/cf/code/ConcreteMethod;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {v0}, Lcom/android/dx/cf/code/BasicBlocker;->doit()V

    .line 7
    .line 8
    .line 9
    invoke-direct {v0}, Lcom/android/dx/cf/code/BasicBlocker;->getBlockList()Lcom/android/dx/cf/code/ByteBlockList;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method private visitCommon(IIZ)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/dx/cf/code/BasicBlocker;->liveSet:[I

    .line 2
    .line 3
    invoke-static {v0, p1}, Lcom/android/dx/util/Bits;->set([II)V

    .line 4
    .line 5
    .line 6
    if-eqz p3, :cond_0

    .line 7
    .line 8
    add-int/2addr p1, p2

    .line 9
    const/4 p2, 0x0

    .line 10
    invoke-direct {p0, p1, p2}, Lcom/android/dx/cf/code/BasicBlocker;->addWorkIfNecessary(IZ)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object p0, p0, Lcom/android/dx/cf/code/BasicBlocker;->blockSet:[I

    .line 15
    .line 16
    add-int/2addr p1, p2

    .line 17
    invoke-static {p0, p1}, Lcom/android/dx/util/Bits;->set([II)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method private visitThrowing(IIZ)V
    .locals 2

    .line 1
    add-int/2addr p2, p1

    .line 2
    if-eqz p3, :cond_0

    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    invoke-direct {p0, p2, v0}, Lcom/android/dx/cf/code/BasicBlocker;->addWorkIfNecessary(IZ)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lcom/android/dx/cf/code/BasicBlocker;->method:Lcom/android/dx/cf/code/ConcreteMethod;

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/android/dx/cf/code/ConcreteMethod;->getCatches()Lcom/android/dx/cf/code/ByteCatchList;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0, p1}, Lcom/android/dx/cf/code/ByteCatchList;->listFor(I)Lcom/android/dx/cf/code/ByteCatchList;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v1, p0, Lcom/android/dx/cf/code/BasicBlocker;->catchLists:[Lcom/android/dx/cf/code/ByteCatchList;

    .line 19
    .line 20
    aput-object v0, v1, p1

    .line 21
    .line 22
    iget-object p0, p0, Lcom/android/dx/cf/code/BasicBlocker;->targetLists:[Lcom/android/dx/util/IntList;

    .line 23
    .line 24
    if-eqz p3, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/4 p2, -0x1

    .line 28
    :goto_0
    invoke-virtual {v0, p2}, Lcom/android/dx/cf/code/ByteCatchList;->toTargetList(I)Lcom/android/dx/util/IntList;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    aput-object p2, p0, p1

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public getPreviousOffset()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/cf/code/BasicBlocker;->previousOffset:I

    .line 2
    .line 3
    return p0
.end method

.method public setPreviousOffset(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/android/dx/cf/code/BasicBlocker;->previousOffset:I

    .line 2
    .line 3
    return-void
.end method

.method public visitBranch(IIII)V
    .locals 2

    .line 1
    const/16 v0, 0xa7

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eq p1, v0, :cond_1

    .line 5
    .line 6
    const/16 v0, 0xa8

    .line 7
    .line 8
    if-eq p1, v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-direct {p0, p2, v1}, Lcom/android/dx/cf/code/BasicBlocker;->addWorkIfNecessary(IZ)V

    .line 12
    .line 13
    .line 14
    :goto_0
    add-int p1, p2, p3

    .line 15
    .line 16
    invoke-direct {p0, p2, p3, v1}, Lcom/android/dx/cf/code/BasicBlocker;->visitCommon(IIZ)V

    .line 17
    .line 18
    .line 19
    invoke-direct {p0, p1, v1}, Lcom/android/dx/cf/code/BasicBlocker;->addWorkIfNecessary(IZ)V

    .line 20
    .line 21
    .line 22
    iget-object p3, p0, Lcom/android/dx/cf/code/BasicBlocker;->targetLists:[Lcom/android/dx/util/IntList;

    .line 23
    .line 24
    invoke-static {p1, p4}, Lcom/android/dx/util/IntList;->makeImmutable(II)Lcom/android/dx/util/IntList;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    aput-object p1, p3, p2

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    const/4 p1, 0x0

    .line 32
    invoke-direct {p0, p2, p3, p1}, Lcom/android/dx/cf/code/BasicBlocker;->visitCommon(IIZ)V

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Lcom/android/dx/cf/code/BasicBlocker;->targetLists:[Lcom/android/dx/util/IntList;

    .line 36
    .line 37
    invoke-static {p4}, Lcom/android/dx/util/IntList;->makeImmutable(I)Lcom/android/dx/util/IntList;

    .line 38
    .line 39
    .line 40
    move-result-object p3

    .line 41
    aput-object p3, p1, p2

    .line 42
    .line 43
    :goto_1
    invoke-direct {p0, p4, v1}, Lcom/android/dx/cf/code/BasicBlocker;->addWorkIfNecessary(IZ)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public visitConstant(IIILcom/android/dx/rop/cst/Constant;I)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    invoke-direct {p0, p2, p3, p1}, Lcom/android/dx/cf/code/BasicBlocker;->visitCommon(IIZ)V

    .line 3
    .line 4
    .line 5
    instance-of p5, p4, Lcom/android/dx/rop/cst/CstMemberRef;

    .line 6
    .line 7
    if-nez p5, :cond_1

    .line 8
    .line 9
    instance-of p5, p4, Lcom/android/dx/rop/cst/CstType;

    .line 10
    .line 11
    if-nez p5, :cond_1

    .line 12
    .line 13
    instance-of p5, p4, Lcom/android/dx/rop/cst/CstString;

    .line 14
    .line 15
    if-nez p5, :cond_1

    .line 16
    .line 17
    instance-of p5, p4, Lcom/android/dx/rop/cst/CstInvokeDynamic;

    .line 18
    .line 19
    if-nez p5, :cond_1

    .line 20
    .line 21
    instance-of p5, p4, Lcom/android/dx/rop/cst/CstMethodHandle;

    .line 22
    .line 23
    if-nez p5, :cond_1

    .line 24
    .line 25
    instance-of p4, p4, Lcom/android/dx/rop/cst/CstProtoRef;

    .line 26
    .line 27
    if-eqz p4, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    return-void

    .line 31
    :cond_1
    :goto_0
    invoke-direct {p0, p2, p3, p1}, Lcom/android/dx/cf/code/BasicBlocker;->visitThrowing(IIZ)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public visitInvalid(III)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    invoke-direct {p0, p2, p3, p1}, Lcom/android/dx/cf/code/BasicBlocker;->visitCommon(IIZ)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public visitLocal(IIIILcom/android/dx/rop/type/Type;I)V
    .locals 0

    .line 1
    const/16 p4, 0xa9

    .line 2
    .line 3
    if-ne p1, p4, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p2, p3, p1}, Lcom/android/dx/cf/code/BasicBlocker;->visitCommon(IIZ)V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Lcom/android/dx/cf/code/BasicBlocker;->targetLists:[Lcom/android/dx/util/IntList;

    .line 10
    .line 11
    sget-object p1, Lcom/android/dx/util/IntList;->EMPTY:Lcom/android/dx/util/IntList;

    .line 12
    .line 13
    aput-object p1, p0, p2

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    const/4 p1, 0x1

    .line 17
    invoke-direct {p0, p2, p3, p1}, Lcom/android/dx/cf/code/BasicBlocker;->visitCommon(IIZ)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public visitNewarray(IILcom/android/dx/rop/cst/CstType;Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Lcom/android/dx/rop/cst/CstType;",
            "Ljava/util/ArrayList<",
            "Lcom/android/dx/rop/cst/Constant;",
            ">;)V"
        }
    .end annotation

    .line 1
    const/4 p3, 0x1

    .line 2
    invoke-direct {p0, p1, p2, p3}, Lcom/android/dx/cf/code/BasicBlocker;->visitCommon(IIZ)V

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, p1, p2, p3}, Lcom/android/dx/cf/code/BasicBlocker;->visitThrowing(IIZ)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public visitNoArgs(IIILcom/android/dx/rop/type/Type;)V
    .locals 2

    .line 1
    const/16 v0, 0x6c

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eq p1, v0, :cond_3

    .line 5
    .line 6
    const/16 v0, 0x70

    .line 7
    .line 8
    if-eq p1, v0, :cond_3

    .line 9
    .line 10
    const/16 p4, 0xac

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    if-eq p1, p4, :cond_2

    .line 14
    .line 15
    const/16 p4, 0xb1

    .line 16
    .line 17
    if-eq p1, p4, :cond_2

    .line 18
    .line 19
    const/16 p4, 0xbe

    .line 20
    .line 21
    if-eq p1, p4, :cond_1

    .line 22
    .line 23
    const/16 p4, 0xbf

    .line 24
    .line 25
    if-eq p1, p4, :cond_0

    .line 26
    .line 27
    const/16 p4, 0xc2

    .line 28
    .line 29
    if-eq p1, p4, :cond_1

    .line 30
    .line 31
    const/16 p4, 0xc3

    .line 32
    .line 33
    if-eq p1, p4, :cond_1

    .line 34
    .line 35
    packed-switch p1, :pswitch_data_0

    .line 36
    .line 37
    .line 38
    packed-switch p1, :pswitch_data_1

    .line 39
    .line 40
    .line 41
    invoke-direct {p0, p2, p3, v1}, Lcom/android/dx/cf/code/BasicBlocker;->visitCommon(IIZ)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_0
    invoke-direct {p0, p2, p3, v0}, Lcom/android/dx/cf/code/BasicBlocker;->visitCommon(IIZ)V

    .line 46
    .line 47
    .line 48
    invoke-direct {p0, p2, p3, v0}, Lcom/android/dx/cf/code/BasicBlocker;->visitThrowing(IIZ)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_1
    :pswitch_0
    invoke-direct {p0, p2, p3, v1}, Lcom/android/dx/cf/code/BasicBlocker;->visitCommon(IIZ)V

    .line 53
    .line 54
    .line 55
    invoke-direct {p0, p2, p3, v1}, Lcom/android/dx/cf/code/BasicBlocker;->visitThrowing(IIZ)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_2
    invoke-direct {p0, p2, p3, v0}, Lcom/android/dx/cf/code/BasicBlocker;->visitCommon(IIZ)V

    .line 60
    .line 61
    .line 62
    iget-object p0, p0, Lcom/android/dx/cf/code/BasicBlocker;->targetLists:[Lcom/android/dx/util/IntList;

    .line 63
    .line 64
    sget-object p1, Lcom/android/dx/util/IntList;->EMPTY:Lcom/android/dx/util/IntList;

    .line 65
    .line 66
    aput-object p1, p0, p2

    .line 67
    .line 68
    return-void

    .line 69
    :cond_3
    invoke-direct {p0, p2, p3, v1}, Lcom/android/dx/cf/code/BasicBlocker;->visitCommon(IIZ)V

    .line 70
    .line 71
    .line 72
    sget-object p1, Lcom/android/dx/rop/type/Type;->INT:Lcom/android/dx/rop/type/Type;

    .line 73
    .line 74
    if-eq p4, p1, :cond_5

    .line 75
    .line 76
    sget-object p1, Lcom/android/dx/rop/type/Type;->LONG:Lcom/android/dx/rop/type/Type;

    .line 77
    .line 78
    if-ne p4, p1, :cond_4

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_4
    return-void

    .line 82
    :cond_5
    :goto_0
    invoke-direct {p0, p2, p3, v1}, Lcom/android/dx/cf/code/BasicBlocker;->visitThrowing(IIZ)V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    nop

    .line 87
    :pswitch_data_0
    .packed-switch 0x2e
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    :pswitch_data_1
    .packed-switch 0x4f
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public visitSwitch(IIILcom/android/dx/cf/code/SwitchList;I)V
    .locals 1

    .line 1
    const/4 p1, 0x0

    .line 2
    invoke-direct {p0, p2, p3, p1}, Lcom/android/dx/cf/code/BasicBlocker;->visitCommon(IIZ)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p4}, Lcom/android/dx/cf/code/SwitchList;->getDefaultTarget()I

    .line 6
    .line 7
    .line 8
    move-result p3

    .line 9
    const/4 p5, 0x1

    .line 10
    invoke-direct {p0, p3, p5}, Lcom/android/dx/cf/code/BasicBlocker;->addWorkIfNecessary(IZ)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p4}, Lcom/android/dx/cf/code/SwitchList;->size()I

    .line 14
    .line 15
    .line 16
    move-result p3

    .line 17
    :goto_0
    if-ge p1, p3, :cond_0

    .line 18
    .line 19
    invoke-virtual {p4, p1}, Lcom/android/dx/cf/code/SwitchList;->getTarget(I)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-direct {p0, v0, p5}, Lcom/android/dx/cf/code/BasicBlocker;->addWorkIfNecessary(IZ)V

    .line 24
    .line 25
    .line 26
    add-int/lit8 p1, p1, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iget-object p0, p0, Lcom/android/dx/cf/code/BasicBlocker;->targetLists:[Lcom/android/dx/util/IntList;

    .line 30
    .line 31
    invoke-virtual {p4}, Lcom/android/dx/cf/code/SwitchList;->getTargets()Lcom/android/dx/util/IntList;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    aput-object p1, p0, p2

    .line 36
    .line 37
    return-void
.end method
