.class public final Lcom/android/dx/dex/code/StdCatchBuilder;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lcom/android/dx/dex/code/CatchBuilder;


# static fields
.field private static final MAX_CATCH_RANGE:I = 0xffff


# instance fields
.field private final addresses:Lcom/android/dx/dex/code/BlockAddresses;

.field private final method:Lcom/android/dx/rop/code/RopMethod;

.field private final order:[I


# direct methods
.method public constructor <init>(Lcom/android/dx/rop/code/RopMethod;[ILcom/android/dx/dex/code/BlockAddresses;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-eqz p1, :cond_2

    .line 6
    .line 7
    if-eqz p2, :cond_1

    .line 8
    .line 9
    if-eqz p3, :cond_0

    .line 10
    .line 11
    iput-object p1, p0, Lcom/android/dx/dex/code/StdCatchBuilder;->method:Lcom/android/dx/rop/code/RopMethod;

    .line 12
    .line 13
    iput-object p2, p0, Lcom/android/dx/dex/code/StdCatchBuilder;->order:[I

    .line 14
    .line 15
    iput-object p3, p0, Lcom/android/dx/dex/code/StdCatchBuilder;->addresses:Lcom/android/dx/dex/code/BlockAddresses;

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    const-string p0, "addresses == null"

    .line 19
    .line 20
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw v0

    .line 24
    :cond_1
    const-string p0, "order == null"

    .line 25
    .line 26
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw v0

    .line 30
    :cond_2
    const-string p0, "method == null"

    .line 31
    .line 32
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw v0
.end method

.method public static build(Lcom/android/dx/rop/code/RopMethod;[ILcom/android/dx/dex/code/BlockAddresses;)Lcom/android/dx/dex/code/CatchTable;
    .locals 10

    .line 1
    array-length v0, p1

    .line 2
    invoke-virtual {p0}, Lcom/android/dx/rop/code/RopMethod;->getBlocks()Lcom/android/dx/rop/code/BasicBlockList;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    new-instance v1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 9
    .line 10
    .line 11
    sget-object v2, Lcom/android/dx/dex/code/CatchHandlerList;->EMPTY:Lcom/android/dx/dex/code/CatchHandlerList;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x0

    .line 15
    move-object v5, v3

    .line 16
    move v6, v4

    .line 17
    :goto_0
    if-ge v6, v0, :cond_4

    .line 18
    .line 19
    aget v7, p1, v6

    .line 20
    .line 21
    invoke-virtual {p0, v7}, Lcom/android/dx/rop/code/BasicBlockList;->labelToBlock(I)Lcom/android/dx/rop/code/BasicBlock;

    .line 22
    .line 23
    .line 24
    move-result-object v7

    .line 25
    invoke-virtual {v7}, Lcom/android/dx/rop/code/BasicBlock;->canThrow()Z

    .line 26
    .line 27
    .line 28
    move-result v8

    .line 29
    if-nez v8, :cond_0

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_0
    invoke-static {v7, p2}, Lcom/android/dx/dex/code/StdCatchBuilder;->handlersFor(Lcom/android/dx/rop/code/BasicBlock;Lcom/android/dx/dex/code/BlockAddresses;)Lcom/android/dx/dex/code/CatchHandlerList;

    .line 33
    .line 34
    .line 35
    move-result-object v8

    .line 36
    invoke-virtual {v2}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 37
    .line 38
    .line 39
    move-result v9

    .line 40
    if-nez v9, :cond_1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    invoke-virtual {v2, v8}, Lcom/android/dx/util/FixedSizeList;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v9

    .line 47
    if-eqz v9, :cond_2

    .line 48
    .line 49
    invoke-static {v3, v7, p2}, Lcom/android/dx/dex/code/StdCatchBuilder;->rangeIsValid(Lcom/android/dx/rop/code/BasicBlock;Lcom/android/dx/rop/code/BasicBlock;Lcom/android/dx/dex/code/BlockAddresses;)Z

    .line 50
    .line 51
    .line 52
    move-result v9

    .line 53
    if-eqz v9, :cond_2

    .line 54
    .line 55
    move-object v5, v7

    .line 56
    goto :goto_2

    .line 57
    :cond_2
    invoke-virtual {v2}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 58
    .line 59
    .line 60
    move-result v9

    .line 61
    if-eqz v9, :cond_3

    .line 62
    .line 63
    invoke-static {v3, v5, v2, p2}, Lcom/android/dx/dex/code/StdCatchBuilder;->makeEntry(Lcom/android/dx/rop/code/BasicBlock;Lcom/android/dx/rop/code/BasicBlock;Lcom/android/dx/dex/code/CatchHandlerList;Lcom/android/dx/dex/code/BlockAddresses;)Lcom/android/dx/dex/code/CatchTable$Entry;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    :cond_3
    :goto_1
    move-object v3, v7

    .line 71
    move-object v5, v3

    .line 72
    move-object v2, v8

    .line 73
    :goto_2
    add-int/lit8 v6, v6, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_4
    invoke-virtual {v2}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 77
    .line 78
    .line 79
    move-result p0

    .line 80
    if-eqz p0, :cond_5

    .line 81
    .line 82
    invoke-static {v3, v5, v2, p2}, Lcom/android/dx/dex/code/StdCatchBuilder;->makeEntry(Lcom/android/dx/rop/code/BasicBlock;Lcom/android/dx/rop/code/BasicBlock;Lcom/android/dx/dex/code/CatchHandlerList;Lcom/android/dx/dex/code/BlockAddresses;)Lcom/android/dx/dex/code/CatchTable$Entry;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    :cond_5
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 90
    .line 91
    .line 92
    move-result p0

    .line 93
    if-nez p0, :cond_6

    .line 94
    .line 95
    sget-object p0, Lcom/android/dx/dex/code/CatchTable;->EMPTY:Lcom/android/dx/dex/code/CatchTable;

    .line 96
    .line 97
    return-object p0

    .line 98
    :cond_6
    new-instance p1, Lcom/android/dx/dex/code/CatchTable;

    .line 99
    .line 100
    invoke-direct {p1, p0}, Lcom/android/dx/dex/code/CatchTable;-><init>(I)V

    .line 101
    .line 102
    .line 103
    :goto_3
    if-ge v4, p0, :cond_7

    .line 104
    .line 105
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p2

    .line 109
    check-cast p2, Lcom/android/dx/dex/code/CatchTable$Entry;

    .line 110
    .line 111
    invoke-virtual {p1, v4, p2}, Lcom/android/dx/dex/code/CatchTable;->set(ILcom/android/dx/dex/code/CatchTable$Entry;)V

    .line 112
    .line 113
    .line 114
    add-int/lit8 v4, v4, 0x1

    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_7
    invoke-virtual {p1}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 118
    .line 119
    .line 120
    return-object p1
.end method

.method private static handlersFor(Lcom/android/dx/rop/code/BasicBlock;Lcom/android/dx/dex/code/BlockAddresses;)Lcom/android/dx/dex/code/CatchHandlerList;
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/rop/code/BasicBlock;->getSuccessors()Lcom/android/dx/util/IntList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/android/dx/util/IntList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p0}, Lcom/android/dx/rop/code/BasicBlock;->getPrimarySuccessor()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-virtual {p0}, Lcom/android/dx/rop/code/BasicBlock;->getLastInsn()Lcom/android/dx/rop/code/Insn;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0}, Lcom/android/dx/rop/code/Insn;->getCatches()Lcom/android/dx/rop/type/TypeList;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-interface {p0}, Lcom/android/dx/rop/type/TypeList;->size()I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-nez v3, :cond_0

    .line 26
    .line 27
    sget-object p0, Lcom/android/dx/dex/code/CatchHandlerList;->EMPTY:Lcom/android/dx/dex/code/CatchHandlerList;

    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_0
    const/4 v4, -0x1

    .line 31
    if-ne v2, v4, :cond_1

    .line 32
    .line 33
    if-ne v1, v3, :cond_2

    .line 34
    .line 35
    :cond_1
    if-eq v2, v4, :cond_3

    .line 36
    .line 37
    add-int/lit8 v4, v3, 0x1

    .line 38
    .line 39
    if-ne v1, v4, :cond_2

    .line 40
    .line 41
    invoke-virtual {v0, v3}, Lcom/android/dx/util/IntList;->get(I)I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-ne v2, v1, :cond_2

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    const-string p0, "shouldn\'t happen: weird successors list"

    .line 49
    .line 50
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    const/4 p0, 0x0

    .line 54
    return-object p0

    .line 55
    :cond_3
    :goto_0
    const/4 v1, 0x0

    .line 56
    move v2, v1

    .line 57
    :goto_1
    if-ge v2, v3, :cond_5

    .line 58
    .line 59
    invoke-interface {p0, v2}, Lcom/android/dx/rop/type/TypeList;->getType(I)Lcom/android/dx/rop/type/Type;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    sget-object v5, Lcom/android/dx/rop/type/Type;->OBJECT:Lcom/android/dx/rop/type/Type;

    .line 64
    .line 65
    invoke-virtual {v4, v5}, Lcom/android/dx/rop/type/Type;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    if-eqz v4, :cond_4

    .line 70
    .line 71
    add-int/lit8 v3, v2, 0x1

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_5
    :goto_2
    new-instance v2, Lcom/android/dx/dex/code/CatchHandlerList;

    .line 78
    .line 79
    invoke-direct {v2, v3}, Lcom/android/dx/dex/code/CatchHandlerList;-><init>(I)V

    .line 80
    .line 81
    .line 82
    :goto_3
    if-ge v1, v3, :cond_6

    .line 83
    .line 84
    new-instance v4, Lcom/android/dx/rop/cst/CstType;

    .line 85
    .line 86
    invoke-interface {p0, v1}, Lcom/android/dx/rop/type/TypeList;->getType(I)Lcom/android/dx/rop/type/Type;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    invoke-direct {v4, v5}, Lcom/android/dx/rop/cst/CstType;-><init>(Lcom/android/dx/rop/type/Type;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, v1}, Lcom/android/dx/util/IntList;->get(I)I

    .line 94
    .line 95
    .line 96
    move-result v5

    .line 97
    invoke-virtual {p1, v5}, Lcom/android/dx/dex/code/BlockAddresses;->getStart(I)Lcom/android/dx/dex/code/CodeAddress;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    invoke-virtual {v5}, Lcom/android/dx/dex/code/DalvInsn;->getAddress()I

    .line 102
    .line 103
    .line 104
    move-result v5

    .line 105
    invoke-virtual {v2, v1, v4, v5}, Lcom/android/dx/dex/code/CatchHandlerList;->set(ILcom/android/dx/rop/cst/CstType;I)V

    .line 106
    .line 107
    .line 108
    add-int/lit8 v1, v1, 0x1

    .line 109
    .line 110
    goto :goto_3

    .line 111
    :cond_6
    invoke-virtual {v2}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 112
    .line 113
    .line 114
    return-object v2
.end method

.method private static makeEntry(Lcom/android/dx/rop/code/BasicBlock;Lcom/android/dx/rop/code/BasicBlock;Lcom/android/dx/dex/code/CatchHandlerList;Lcom/android/dx/dex/code/BlockAddresses;)Lcom/android/dx/dex/code/CatchTable$Entry;
    .locals 0

    .line 1
    invoke-virtual {p3, p0}, Lcom/android/dx/dex/code/BlockAddresses;->getLast(Lcom/android/dx/rop/code/BasicBlock;)Lcom/android/dx/dex/code/CodeAddress;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p3, p1}, Lcom/android/dx/dex/code/BlockAddresses;->getEnd(Lcom/android/dx/rop/code/BasicBlock;)Lcom/android/dx/dex/code/CodeAddress;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    new-instance p3, Lcom/android/dx/dex/code/CatchTable$Entry;

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/android/dx/dex/code/DalvInsn;->getAddress()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    invoke-virtual {p1}, Lcom/android/dx/dex/code/DalvInsn;->getAddress()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    invoke-direct {p3, p0, p1, p2}, Lcom/android/dx/dex/code/CatchTable$Entry;-><init>(IILcom/android/dx/dex/code/CatchHandlerList;)V

    .line 20
    .line 21
    .line 22
    return-object p3
.end method

.method private static rangeIsValid(Lcom/android/dx/rop/code/BasicBlock;Lcom/android/dx/rop/code/BasicBlock;Lcom/android/dx/dex/code/BlockAddresses;)Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_2

    .line 3
    .line 4
    if-eqz p1, :cond_1

    .line 5
    .line 6
    invoke-virtual {p2, p0}, Lcom/android/dx/dex/code/BlockAddresses;->getLast(Lcom/android/dx/rop/code/BasicBlock;)Lcom/android/dx/dex/code/CodeAddress;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Lcom/android/dx/dex/code/DalvInsn;->getAddress()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    invoke-virtual {p2, p1}, Lcom/android/dx/dex/code/BlockAddresses;->getEnd(Lcom/android/dx/rop/code/BasicBlock;)Lcom/android/dx/dex/code/CodeAddress;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1}, Lcom/android/dx/dex/code/DalvInsn;->getAddress()I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    sub-int/2addr p1, p0

    .line 23
    const p0, 0xffff

    .line 24
    .line 25
    .line 26
    if-gt p1, p0, :cond_0

    .line 27
    .line 28
    const/4 p0, 0x1

    .line 29
    return p0

    .line 30
    :cond_0
    return v0

    .line 31
    :cond_1
    const-string p0, "end == null"

    .line 32
    .line 33
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return v0

    .line 37
    :cond_2
    const-string p0, "start == null"

    .line 38
    .line 39
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return v0
.end method


# virtual methods
.method public build()Lcom/android/dx/dex/code/CatchTable;
    .locals 2

    .line 121
    iget-object v0, p0, Lcom/android/dx/dex/code/StdCatchBuilder;->method:Lcom/android/dx/rop/code/RopMethod;

    iget-object v1, p0, Lcom/android/dx/dex/code/StdCatchBuilder;->order:[I

    iget-object p0, p0, Lcom/android/dx/dex/code/StdCatchBuilder;->addresses:Lcom/android/dx/dex/code/BlockAddresses;

    invoke-static {v0, v1, p0}, Lcom/android/dx/dex/code/StdCatchBuilder;->build(Lcom/android/dx/rop/code/RopMethod;[ILcom/android/dx/dex/code/BlockAddresses;)Lcom/android/dx/dex/code/CatchTable;

    move-result-object p0

    return-object p0
.end method

.method public getCatchTypes()Ljava/util/HashSet;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashSet<",
            "Lcom/android/dx/rop/type/Type;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    const/16 v1, 0x14

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lcom/android/dx/dex/code/StdCatchBuilder;->method:Lcom/android/dx/rop/code/RopMethod;

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/android/dx/rop/code/RopMethod;->getBlocks()Lcom/android/dx/rop/code/BasicBlockList;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v2, 0x0

    .line 19
    move v3, v2

    .line 20
    :goto_0
    if-ge v3, v1, :cond_1

    .line 21
    .line 22
    invoke-virtual {p0, v3}, Lcom/android/dx/rop/code/BasicBlockList;->get(I)Lcom/android/dx/rop/code/BasicBlock;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    invoke-virtual {v4}, Lcom/android/dx/rop/code/BasicBlock;->getLastInsn()Lcom/android/dx/rop/code/Insn;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    invoke-virtual {v4}, Lcom/android/dx/rop/code/Insn;->getCatches()Lcom/android/dx/rop/type/TypeList;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    invoke-interface {v4}, Lcom/android/dx/rop/type/TypeList;->size()I

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    move v6, v2

    .line 39
    :goto_1
    if-ge v6, v5, :cond_0

    .line 40
    .line 41
    invoke-interface {v4, v6}, Lcom/android/dx/rop/type/TypeList;->getType(I)Lcom/android/dx/rop/type/Type;

    .line 42
    .line 43
    .line 44
    move-result-object v7

    .line 45
    invoke-virtual {v0, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    add-int/lit8 v6, v6, 0x1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    return-object v0
.end method

.method public hasAnyCatches()Z
    .locals 4

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/code/StdCatchBuilder;->method:Lcom/android/dx/rop/code/RopMethod;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/rop/code/RopMethod;->getBlocks()Lcom/android/dx/rop/code/BasicBlockList;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    move v2, v1

    .line 13
    :goto_0
    if-ge v2, v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0, v2}, Lcom/android/dx/rop/code/BasicBlockList;->get(I)Lcom/android/dx/rop/code/BasicBlock;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-virtual {v3}, Lcom/android/dx/rop/code/BasicBlock;->getLastInsn()Lcom/android/dx/rop/code/Insn;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {v3}, Lcom/android/dx/rop/code/Insn;->getCatches()Lcom/android/dx/rop/type/TypeList;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-interface {v3}, Lcom/android/dx/rop/type/TypeList;->size()I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    const/4 p0, 0x1

    .line 34
    return p0

    .line 35
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    return v1
.end method
