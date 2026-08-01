.class public abstract Lcom/android/dx/ssa/back/RegisterAllocator;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field protected final interference:Lcom/android/dx/ssa/back/InterferenceGraph;

.field protected final ssaMeth:Lcom/android/dx/ssa/SsaMethod;


# direct methods
.method public constructor <init>(Lcom/android/dx/ssa/SsaMethod;Lcom/android/dx/ssa/back/InterferenceGraph;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/android/dx/ssa/back/RegisterAllocator;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/android/dx/ssa/back/RegisterAllocator;->interference:Lcom/android/dx/ssa/back/InterferenceGraph;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public abstract allocateRegisters()Lcom/android/dx/ssa/RegisterMapper;
.end method

.method public final getCategoryForSsaReg(I)I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/ssa/back/RegisterAllocator;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/android/dx/ssa/SsaMethod;->getDefinitionForRegister(I)Lcom/android/dx/ssa/SsaInsn;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    invoke-virtual {p0}, Lcom/android/dx/ssa/SsaInsn;->getResult()Lcom/android/dx/rop/code/RegisterSpec;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, Lcom/android/dx/rop/code/RegisterSpec;->getCategory()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0
.end method

.method public final getDefinitionSpecForSsaReg(I)Lcom/android/dx/rop/code/RegisterSpec;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/ssa/back/RegisterAllocator;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/android/dx/ssa/SsaMethod;->getDefinitionForRegister(I)Lcom/android/dx/ssa/SsaInsn;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return-object p0

    .line 11
    :cond_0
    invoke-virtual {p0}, Lcom/android/dx/ssa/SsaInsn;->getResult()Lcom/android/dx/rop/code/RegisterSpec;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public final insertMoveBefore(Lcom/android/dx/ssa/SsaInsn;Lcom/android/dx/rop/code/RegisterSpec;)Lcom/android/dx/rop/code/RegisterSpec;
    .locals 7

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaInsn;->getBlock()Lcom/android/dx/ssa/SsaBasicBlock;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/android/dx/ssa/SsaBasicBlock;->getInsns()Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/4 v3, 0x0

    .line 14
    if-ltz v2, :cond_3

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    add-int/lit8 v4, v4, -0x1

    .line 21
    .line 22
    if-ne v2, v4, :cond_2

    .line 23
    .line 24
    iget-object v3, p0, Lcom/android/dx/ssa/back/RegisterAllocator;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 25
    .line 26
    invoke-virtual {v3}, Lcom/android/dx/ssa/SsaMethod;->makeNewSsaReg()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    invoke-virtual {p2}, Lcom/android/dx/rop/code/RegisterSpec;->getTypeBearer()Lcom/android/dx/rop/type/TypeBearer;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    invoke-static {v3, v4}, Lcom/android/dx/rop/code/RegisterSpec;->make(ILcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/RegisterSpec;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    new-instance v4, Lcom/android/dx/rop/code/PlainInsn;

    .line 39
    .line 40
    invoke-virtual {v3}, Lcom/android/dx/rop/code/RegisterSpec;->getType()Lcom/android/dx/rop/type/Type;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    invoke-static {v5}, Lcom/android/dx/rop/code/Rops;->opMove(Lcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/Rop;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    sget-object v6, Lcom/android/dx/rop/code/SourcePosition;->NO_INFO:Lcom/android/dx/rop/code/SourcePosition;

    .line 49
    .line 50
    invoke-static {p2}, Lcom/android/dx/rop/code/RegisterSpecList;->make(Lcom/android/dx/rop/code/RegisterSpec;)Lcom/android/dx/rop/code/RegisterSpecList;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    invoke-direct {v4, v5, v6, v3, p2}, Lcom/android/dx/rop/code/PlainInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 55
    .line 56
    .line 57
    invoke-static {v4, v0}, Lcom/android/dx/ssa/SsaInsn;->makeFromRop(Lcom/android/dx/rop/code/Insn;Lcom/android/dx/ssa/SsaBasicBlock;)Lcom/android/dx/ssa/SsaInsn;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    invoke-virtual {v1, v2, p2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v3}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 65
    .line 66
    .line 67
    move-result p2

    .line 68
    invoke-virtual {v0}, Lcom/android/dx/ssa/SsaBasicBlock;->getLiveOutRegs()Lcom/android/dx/util/IntSet;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-interface {v0}, Lcom/android/dx/util/IntSet;->iterator()Lcom/android/dx/util/IntIterator;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    :goto_0
    invoke-interface {v0}, Lcom/android/dx/util/IntIterator;->hasNext()Z

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    if-eqz v1, :cond_0

    .line 81
    .line 82
    iget-object v1, p0, Lcom/android/dx/ssa/back/RegisterAllocator;->interference:Lcom/android/dx/ssa/back/InterferenceGraph;

    .line 83
    .line 84
    invoke-interface {v0}, Lcom/android/dx/util/IntIterator;->next()I

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    invoke-virtual {v1, p2, v2}, Lcom/android/dx/ssa/back/InterferenceGraph;->add(II)V

    .line 89
    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_0
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaInsn;->getSources()Lcom/android/dx/rop/code/RegisterSpecList;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-virtual {p1}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    const/4 v1, 0x0

    .line 101
    :goto_1
    if-ge v1, v0, :cond_1

    .line 102
    .line 103
    iget-object v2, p0, Lcom/android/dx/ssa/back/RegisterAllocator;->interference:Lcom/android/dx/ssa/back/InterferenceGraph;

    .line 104
    .line 105
    invoke-virtual {p1, v1}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    invoke-virtual {v4}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    invoke-virtual {v2, p2, v4}, Lcom/android/dx/ssa/back/InterferenceGraph;->add(II)V

    .line 114
    .line 115
    .line 116
    add-int/lit8 v1, v1, 0x1

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_1
    iget-object p0, p0, Lcom/android/dx/ssa/back/RegisterAllocator;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 120
    .line 121
    invoke-virtual {p0}, Lcom/android/dx/ssa/SsaMethod;->onInsnsChanged()V

    .line 122
    .line 123
    .line 124
    return-object v3

    .line 125
    :cond_2
    const-string p0, "Adding move here not supported:"

    .line 126
    .line 127
    invoke-interface {p1}, Lcom/android/dx/util/ToHuman;->toHuman()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    invoke-static {p1, p0}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    return-object v3

    .line 135
    :cond_3
    const-string p0, "specified insn is not in this block"

    .line 136
    .line 137
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    return-object v3
.end method

.method public isDefinitionMoveParam(I)Z
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/android/dx/ssa/back/RegisterAllocator;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/android/dx/ssa/SsaMethod;->getDefinitionForRegister(I)Lcom/android/dx/ssa/SsaInsn;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    instance-of p1, p0, Lcom/android/dx/ssa/NormalSsaInsn;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    check-cast p0, Lcom/android/dx/ssa/NormalSsaInsn;

    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/android/dx/ssa/NormalSsaInsn;->getOpcode()Lcom/android/dx/rop/code/Rop;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {p0}, Lcom/android/dx/rop/code/Rop;->getOpcode()I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    const/4 p1, 0x3

    .line 23
    if-ne p0, p1, :cond_0

    .line 24
    .line 25
    const/4 p0, 0x1

    .line 26
    return p0

    .line 27
    :cond_0
    return v0
.end method

.method public abstract wantsParamsMovedHigh()Z
.end method
