.class public Lcom/android/dx/ssa/back/FirstFitAllocator;
.super Lcom/android/dx/ssa/back/RegisterAllocator;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field private static final PRESLOT_PARAMS:Z = true


# instance fields
.field private final mapped:Ljava/util/BitSet;


# direct methods
.method public constructor <init>(Lcom/android/dx/ssa/SsaMethod;Lcom/android/dx/ssa/back/InterferenceGraph;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/android/dx/ssa/back/RegisterAllocator;-><init>(Lcom/android/dx/ssa/SsaMethod;Lcom/android/dx/ssa/back/InterferenceGraph;)V

    .line 2
    .line 3
    .line 4
    new-instance p2, Ljava/util/BitSet;

    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaMethod;->getRegCount()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    invoke-direct {p2, p1}, Ljava/util/BitSet;-><init>(I)V

    .line 11
    .line 12
    .line 13
    iput-object p2, p0, Lcom/android/dx/ssa/back/FirstFitAllocator;->mapped:Ljava/util/BitSet;

    .line 14
    .line 15
    return-void
.end method

.method private paramNumberFromMoveParam(Lcom/android/dx/ssa/NormalSsaInsn;)I
    .locals 0

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/ssa/NormalSsaInsn;->getOriginalRopInsn()Lcom/android/dx/rop/code/Insn;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/android/dx/rop/code/CstInsn;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/android/dx/rop/code/CstInsn;->getConstant()Lcom/android/dx/rop/cst/Constant;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Lcom/android/dx/rop/cst/CstInteger;

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstInteger;->getValue()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
.end method


# virtual methods
.method public allocateRegisters()Lcom/android/dx/ssa/RegisterMapper;
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/android/dx/ssa/back/RegisterAllocator;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/dx/ssa/SsaMethod;->getRegCount()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    new-instance v1, Lcom/android/dx/ssa/BasicRegisterMapper;

    .line 8
    .line 9
    invoke-direct {v1, v0}, Lcom/android/dx/ssa/BasicRegisterMapper;-><init>(I)V

    .line 10
    .line 11
    .line 12
    iget-object v2, p0, Lcom/android/dx/ssa/back/RegisterAllocator;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 13
    .line 14
    invoke-virtual {v2}, Lcom/android/dx/ssa/SsaMethod;->getParamWidth()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, 0x0

    .line 19
    move v4, v3

    .line 20
    :goto_0
    if-ge v4, v0, :cond_7

    .line 21
    .line 22
    iget-object v5, p0, Lcom/android/dx/ssa/back/FirstFitAllocator;->mapped:Ljava/util/BitSet;

    .line 23
    .line 24
    invoke-virtual {v5, v4}, Ljava/util/BitSet;->get(I)Z

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    if-eqz v5, :cond_0

    .line 29
    .line 30
    goto :goto_4

    .line 31
    :cond_0
    invoke-virtual {p0, v4}, Lcom/android/dx/ssa/back/RegisterAllocator;->getCategoryForSsaReg(I)I

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    new-instance v6, Lcom/android/dx/util/BitIntSet;

    .line 36
    .line 37
    invoke-direct {v6, v0}, Lcom/android/dx/util/BitIntSet;-><init>(I)V

    .line 38
    .line 39
    .line 40
    iget-object v7, p0, Lcom/android/dx/ssa/back/RegisterAllocator;->interference:Lcom/android/dx/ssa/back/InterferenceGraph;

    .line 41
    .line 42
    invoke-virtual {v7, v4, v6}, Lcom/android/dx/ssa/back/InterferenceGraph;->mergeInterferenceSet(ILcom/android/dx/util/IntSet;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, v4}, Lcom/android/dx/ssa/back/RegisterAllocator;->isDefinitionMoveParam(I)Z

    .line 46
    .line 47
    .line 48
    move-result v7

    .line 49
    if-eqz v7, :cond_1

    .line 50
    .line 51
    iget-object v7, p0, Lcom/android/dx/ssa/back/RegisterAllocator;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 52
    .line 53
    invoke-virtual {v7, v4}, Lcom/android/dx/ssa/SsaMethod;->getDefinitionForRegister(I)Lcom/android/dx/ssa/SsaInsn;

    .line 54
    .line 55
    .line 56
    move-result-object v7

    .line 57
    check-cast v7, Lcom/android/dx/ssa/NormalSsaInsn;

    .line 58
    .line 59
    invoke-direct {p0, v7}, Lcom/android/dx/ssa/back/FirstFitAllocator;->paramNumberFromMoveParam(Lcom/android/dx/ssa/NormalSsaInsn;)I

    .line 60
    .line 61
    .line 62
    move-result v7

    .line 63
    invoke-virtual {v1, v4, v7, v5}, Lcom/android/dx/ssa/BasicRegisterMapper;->addMapping(III)V

    .line 64
    .line 65
    .line 66
    const/4 v8, 0x1

    .line 67
    goto :goto_1

    .line 68
    :cond_1
    invoke-virtual {v1, v4, v2, v5}, Lcom/android/dx/ssa/BasicRegisterMapper;->addMapping(III)V

    .line 69
    .line 70
    .line 71
    move v7, v2

    .line 72
    move v8, v3

    .line 73
    :goto_1
    add-int/lit8 v9, v4, 0x1

    .line 74
    .line 75
    :goto_2
    iget-object v10, p0, Lcom/android/dx/ssa/back/FirstFitAllocator;->mapped:Ljava/util/BitSet;

    .line 76
    .line 77
    if-ge v9, v0, :cond_5

    .line 78
    .line 79
    invoke-virtual {v10, v9}, Ljava/util/BitSet;->get(I)Z

    .line 80
    .line 81
    .line 82
    move-result v10

    .line 83
    if-nez v10, :cond_4

    .line 84
    .line 85
    invoke-virtual {p0, v9}, Lcom/android/dx/ssa/back/RegisterAllocator;->isDefinitionMoveParam(I)Z

    .line 86
    .line 87
    .line 88
    move-result v10

    .line 89
    if-eqz v10, :cond_2

    .line 90
    .line 91
    goto :goto_3

    .line 92
    :cond_2
    invoke-interface {v6, v9}, Lcom/android/dx/util/IntSet;->has(I)Z

    .line 93
    .line 94
    .line 95
    move-result v10

    .line 96
    if-nez v10, :cond_4

    .line 97
    .line 98
    if-eqz v8, :cond_3

    .line 99
    .line 100
    invoke-virtual {p0, v9}, Lcom/android/dx/ssa/back/RegisterAllocator;->getCategoryForSsaReg(I)I

    .line 101
    .line 102
    .line 103
    move-result v10

    .line 104
    if-lt v5, v10, :cond_4

    .line 105
    .line 106
    :cond_3
    iget-object v10, p0, Lcom/android/dx/ssa/back/RegisterAllocator;->interference:Lcom/android/dx/ssa/back/InterferenceGraph;

    .line 107
    .line 108
    invoke-virtual {v10, v9, v6}, Lcom/android/dx/ssa/back/InterferenceGraph;->mergeInterferenceSet(ILcom/android/dx/util/IntSet;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0, v9}, Lcom/android/dx/ssa/back/RegisterAllocator;->getCategoryForSsaReg(I)I

    .line 112
    .line 113
    .line 114
    move-result v10

    .line 115
    invoke-static {v5, v10}, Ljava/lang/Math;->max(II)I

    .line 116
    .line 117
    .line 118
    move-result v5

    .line 119
    invoke-virtual {v1, v9, v7, v5}, Lcom/android/dx/ssa/BasicRegisterMapper;->addMapping(III)V

    .line 120
    .line 121
    .line 122
    iget-object v10, p0, Lcom/android/dx/ssa/back/FirstFitAllocator;->mapped:Ljava/util/BitSet;

    .line 123
    .line 124
    invoke-virtual {v10, v9}, Ljava/util/BitSet;->set(I)V

    .line 125
    .line 126
    .line 127
    :cond_4
    :goto_3
    add-int/lit8 v9, v9, 0x1

    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_5
    invoke-virtual {v10, v4}, Ljava/util/BitSet;->set(I)V

    .line 131
    .line 132
    .line 133
    if-nez v8, :cond_6

    .line 134
    .line 135
    add-int/2addr v2, v5

    .line 136
    :cond_6
    :goto_4
    add-int/lit8 v4, v4, 0x1

    .line 137
    .line 138
    goto :goto_0

    .line 139
    :cond_7
    return-object v1
.end method

.method public wantsParamsMovedHigh()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method
