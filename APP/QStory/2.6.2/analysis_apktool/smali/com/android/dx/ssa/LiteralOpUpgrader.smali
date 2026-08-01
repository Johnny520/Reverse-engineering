.class public Lcom/android/dx/ssa/LiteralOpUpgrader;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field private final ssaMeth:Lcom/android/dx/ssa/SsaMethod;


# direct methods
.method private constructor <init>(Lcom/android/dx/ssa/SsaMethod;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/android/dx/ssa/LiteralOpUpgrader;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 5
    .line 6
    return-void
.end method

.method public static synthetic access$000(Lcom/android/dx/ssa/LiteralOpUpgrader;Lcom/android/dx/ssa/NormalSsaInsn;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/android/dx/ssa/LiteralOpUpgrader;->tryReplacingWithConstant(Lcom/android/dx/ssa/NormalSsaInsn;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic access$100(Lcom/android/dx/rop/code/RegisterSpec;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/android/dx/ssa/LiteralOpUpgrader;->isConstIntZeroOrKnownNull(Lcom/android/dx/rop/code/RegisterSpec;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic access$200(Lcom/android/dx/ssa/LiteralOpUpgrader;Lcom/android/dx/ssa/NormalSsaInsn;Lcom/android/dx/rop/code/RegisterSpecList;ILcom/android/dx/rop/cst/Constant;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/android/dx/ssa/LiteralOpUpgrader;->replacePlainInsn(Lcom/android/dx/ssa/NormalSsaInsn;Lcom/android/dx/rop/code/RegisterSpecList;ILcom/android/dx/rop/cst/Constant;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static isConstIntZeroOrKnownNull(Lcom/android/dx/rop/code/RegisterSpec;)Z
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/rop/code/RegisterSpec;->getTypeBearer()Lcom/android/dx/rop/type/TypeBearer;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    instance-of v0, p0, Lcom/android/dx/rop/cst/CstLiteralBits;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    check-cast p0, Lcom/android/dx/rop/cst/CstLiteralBits;

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstLiteralBits;->getLongBits()J

    .line 13
    .line 14
    .line 15
    move-result-wide v2

    .line 16
    const-wide/16 v4, 0x0

    .line 17
    .line 18
    cmp-long p0, v2, v4

    .line 19
    .line 20
    if-nez p0, :cond_0

    .line 21
    .line 22
    const/4 p0, 0x1

    .line 23
    return p0

    .line 24
    :cond_0
    return v1
.end method

.method public static process(Lcom/android/dx/ssa/SsaMethod;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/android/dx/ssa/LiteralOpUpgrader;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/android/dx/ssa/LiteralOpUpgrader;-><init>(Lcom/android/dx/ssa/SsaMethod;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {v0}, Lcom/android/dx/ssa/LiteralOpUpgrader;->run()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private replacePlainInsn(Lcom/android/dx/ssa/NormalSsaInsn;Lcom/android/dx/rop/code/RegisterSpecList;ILcom/android/dx/rop/cst/Constant;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/ssa/NormalSsaInsn;->getOriginalRopInsn()Lcom/android/dx/rop/code/Insn;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaInsn;->getResult()Lcom/android/dx/rop/code/RegisterSpec;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {p3, v1, p2, p4}, Lcom/android/dx/rop/code/Rops;->ropFor(ILcom/android/dx/rop/type/TypeBearer;Lcom/android/dx/rop/type/TypeList;Lcom/android/dx/rop/cst/Constant;)Lcom/android/dx/rop/code/Rop;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    if-nez p4, :cond_0

    .line 14
    .line 15
    new-instance p3, Lcom/android/dx/rop/code/PlainInsn;

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/android/dx/rop/code/Insn;->getPosition()Lcom/android/dx/rop/code/SourcePosition;

    .line 18
    .line 19
    .line 20
    move-result-object p4

    .line 21
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaInsn;->getResult()Lcom/android/dx/rop/code/RegisterSpec;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-direct {p3, v3, p4, v0, p2}, Lcom/android/dx/rop/code/PlainInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    new-instance v2, Lcom/android/dx/rop/code/PlainCstInsn;

    .line 30
    .line 31
    invoke-virtual {v0}, Lcom/android/dx/rop/code/Insn;->getPosition()Lcom/android/dx/rop/code/SourcePosition;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaInsn;->getResult()Lcom/android/dx/rop/code/RegisterSpec;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    move-object v6, p2

    .line 40
    move-object v7, p4

    .line 41
    invoke-direct/range {v2 .. v7}, Lcom/android/dx/rop/code/PlainCstInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/cst/Constant;)V

    .line 42
    .line 43
    .line 44
    move-object p3, v2

    .line 45
    :goto_0
    new-instance p2, Lcom/android/dx/ssa/NormalSsaInsn;

    .line 46
    .line 47
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaInsn;->getBlock()Lcom/android/dx/ssa/SsaBasicBlock;

    .line 48
    .line 49
    .line 50
    move-result-object p4

    .line 51
    invoke-direct {p2, p3, p4}, Lcom/android/dx/ssa/NormalSsaInsn;-><init>(Lcom/android/dx/rop/code/Insn;Lcom/android/dx/ssa/SsaBasicBlock;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaInsn;->getBlock()Lcom/android/dx/ssa/SsaBasicBlock;

    .line 55
    .line 56
    .line 57
    move-result-object p3

    .line 58
    invoke-virtual {p3}, Lcom/android/dx/ssa/SsaBasicBlock;->getInsns()Ljava/util/ArrayList;

    .line 59
    .line 60
    .line 61
    move-result-object p3

    .line 62
    iget-object p4, p0, Lcom/android/dx/ssa/LiteralOpUpgrader;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 63
    .line 64
    invoke-virtual {p4, p1}, Lcom/android/dx/ssa/SsaMethod;->onInsnRemoved(Lcom/android/dx/ssa/SsaInsn;)V

    .line 65
    .line 66
    .line 67
    invoke-interface {p3, p1}, Ljava/util/List;->lastIndexOf(Ljava/lang/Object;)I

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    invoke-interface {p3, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    iget-object p0, p0, Lcom/android/dx/ssa/LiteralOpUpgrader;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 75
    .line 76
    invoke-virtual {p0, p2}, Lcom/android/dx/ssa/SsaMethod;->onInsnAdded(Lcom/android/dx/ssa/SsaInsn;)V

    .line 77
    .line 78
    .line 79
    return-void
.end method

.method private run()V
    .locals 3

    .line 1
    invoke-static {}, Lcom/android/dx/ssa/Optimizer;->getAdvice()Lcom/android/dx/rop/code/TranslationAdvice;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/android/dx/ssa/LiteralOpUpgrader;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 6
    .line 7
    new-instance v2, Lcom/android/dx/ssa/LiteralOpUpgrader$1;

    .line 8
    .line 9
    invoke-direct {v2, p0, v0}, Lcom/android/dx/ssa/LiteralOpUpgrader$1;-><init>(Lcom/android/dx/ssa/LiteralOpUpgrader;Lcom/android/dx/rop/code/TranslationAdvice;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, v2}, Lcom/android/dx/ssa/SsaMethod;->forEachInsn(Lcom/android/dx/ssa/SsaInsn$Visitor;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method private tryReplacingWithConstant(Lcom/android/dx/ssa/NormalSsaInsn;)Z
    .locals 6

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/ssa/NormalSsaInsn;->getOriginalRopInsn()Lcom/android/dx/rop/code/Insn;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/android/dx/rop/code/Insn;->getOpcode()Lcom/android/dx/rop/code/Rop;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaInsn;->getResult()Lcom/android/dx/rop/code/RegisterSpec;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    iget-object v3, p0, Lcom/android/dx/ssa/LiteralOpUpgrader;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 17
    .line 18
    invoke-virtual {v3, v1}, Lcom/android/dx/ssa/SsaMethod;->isRegALocal(Lcom/android/dx/rop/code/RegisterSpec;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-nez v1, :cond_1

    .line 23
    .line 24
    invoke-virtual {v0}, Lcom/android/dx/rop/code/Rop;->getOpcode()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    const/4 v3, 0x5

    .line 29
    if-eq v1, v3, :cond_1

    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaInsn;->getResult()Lcom/android/dx/rop/code/RegisterSpec;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v1}, Lcom/android/dx/rop/code/RegisterSpec;->getTypeBearer()Lcom/android/dx/rop/type/TypeBearer;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-interface {v1}, Lcom/android/dx/rop/type/TypeBearer;->isConstant()Z

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    if-eqz v4, :cond_1

    .line 44
    .line 45
    invoke-interface {v1}, Lcom/android/dx/rop/type/TypeBearer;->getBasicType()I

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    const/4 v5, 0x6

    .line 50
    if-ne v4, v5, :cond_1

    .line 51
    .line 52
    sget-object v4, Lcom/android/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 53
    .line 54
    check-cast v1, Lcom/android/dx/rop/cst/Constant;

    .line 55
    .line 56
    invoke-direct {p0, p1, v4, v3, v1}, Lcom/android/dx/ssa/LiteralOpUpgrader;->replacePlainInsn(Lcom/android/dx/ssa/NormalSsaInsn;Lcom/android/dx/rop/code/RegisterSpecList;ILcom/android/dx/rop/cst/Constant;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Lcom/android/dx/rop/code/Rop;->getOpcode()I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    const/16 v1, 0x38

    .line 64
    .line 65
    const/4 v3, 0x1

    .line 66
    if-ne v0, v1, :cond_0

    .line 67
    .line 68
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaInsn;->getBlock()Lcom/android/dx/ssa/SsaBasicBlock;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaBasicBlock;->getPredecessors()Ljava/util/BitSet;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {p1, v2}, Ljava/util/BitSet;->nextSetBit(I)I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    iget-object v0, p0, Lcom/android/dx/ssa/LiteralOpUpgrader;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 81
    .line 82
    invoke-virtual {v0}, Lcom/android/dx/ssa/SsaMethod;->getBlocks()Ljava/util/ArrayList;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    check-cast p1, Lcom/android/dx/ssa/SsaBasicBlock;

    .line 91
    .line 92
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaBasicBlock;->getInsns()Ljava/util/ArrayList;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-static {v3, p1}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏世哲兰(ILjava/util/ArrayList;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    check-cast p1, Lcom/android/dx/ssa/NormalSsaInsn;

    .line 101
    .line 102
    const/4 v0, 0x0

    .line 103
    invoke-direct {p0, p1, v4, v5, v0}, Lcom/android/dx/ssa/LiteralOpUpgrader;->replacePlainInsn(Lcom/android/dx/ssa/NormalSsaInsn;Lcom/android/dx/rop/code/RegisterSpecList;ILcom/android/dx/rop/cst/Constant;)V

    .line 104
    .line 105
    .line 106
    :cond_0
    return v3

    .line 107
    :cond_1
    return v2
.end method
