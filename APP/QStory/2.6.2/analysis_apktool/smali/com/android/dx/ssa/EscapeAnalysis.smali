.class public Lcom/android/dx/ssa/EscapeAnalysis;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;,
        Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;
    }
.end annotation


# instance fields
.field private final latticeValues:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;",
            ">;"
        }
    .end annotation
.end field

.field private final regCount:I

.field private final ssaMeth:Lcom/android/dx/ssa/SsaMethod;


# direct methods
.method private constructor <init>(Lcom/android/dx/ssa/SsaMethod;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/android/dx/ssa/EscapeAnalysis;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaMethod;->getRegCount()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    iput p1, p0, Lcom/android/dx/ssa/EscapeAnalysis;->regCount:I

    .line 11
    .line 12
    new-instance p1, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lcom/android/dx/ssa/EscapeAnalysis;->latticeValues:Ljava/util/ArrayList;

    .line 18
    .line 19
    return-void
.end method

.method public static synthetic access$000(Lcom/android/dx/ssa/EscapeAnalysis;)Lcom/android/dx/ssa/SsaMethod;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/ssa/EscapeAnalysis;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$100(Lcom/android/dx/ssa/EscapeAnalysis;Lcom/android/dx/ssa/SsaInsn;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/android/dx/ssa/EscapeAnalysis;->processInsn(Lcom/android/dx/ssa/SsaInsn;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private addEdge(Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;)V
    .locals 0

    .line 1
    iget-object p0, p2, Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;->parentSets:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    iget-object p0, p2, Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;->parentSets:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object p0, p1, Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;->childSets:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    if-nez p0, :cond_1

    .line 21
    .line 22
    iget-object p0, p1, Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;->childSets:Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    :cond_1
    return-void
.end method

.method private findSetIndex(Lcom/android/dx/rop/code/RegisterSpec;)I
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lcom/android/dx/ssa/EscapeAnalysis;->latticeValues:Ljava/util/ArrayList;

    .line 3
    .line 4
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-ge v0, v1, :cond_1

    .line 9
    .line 10
    iget-object v1, p0, Lcom/android/dx/ssa/EscapeAnalysis;->latticeValues:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;

    .line 17
    .line 18
    iget-object v1, v1, Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;->regSet:Ljava/util/BitSet;

    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    invoke-virtual {v1, v2}, Ljava/util/BitSet;->get(I)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    :goto_1
    return v0
.end method

.method private getInsnForMove(Lcom/android/dx/ssa/SsaInsn;)Lcom/android/dx/ssa/SsaInsn;
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaInsn;->getBlock()Lcom/android/dx/ssa/SsaBasicBlock;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaBasicBlock;->getPredecessors()Ljava/util/BitSet;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-virtual {p1, v0}, Ljava/util/BitSet;->nextSetBit(I)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    iget-object p0, p0, Lcom/android/dx/ssa/EscapeAnalysis;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/android/dx/ssa/SsaMethod;->getBlocks()Ljava/util/ArrayList;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    check-cast p0, Lcom/android/dx/ssa/SsaBasicBlock;

    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/android/dx/ssa/SsaBasicBlock;->getInsns()Ljava/util/ArrayList;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    const/4 p1, 0x1

    .line 31
    invoke-static {p1, p0}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏世哲兰(ILjava/util/ArrayList;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    check-cast p0, Lcom/android/dx/ssa/SsaInsn;

    .line 36
    .line 37
    return-object p0
.end method

.method private getMoveForInsn(Lcom/android/dx/ssa/SsaInsn;)Lcom/android/dx/ssa/SsaInsn;
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaInsn;->getBlock()Lcom/android/dx/ssa/SsaBasicBlock;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaBasicBlock;->getSuccessors()Ljava/util/BitSet;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-virtual {p1, v0}, Ljava/util/BitSet;->nextSetBit(I)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    iget-object p0, p0, Lcom/android/dx/ssa/EscapeAnalysis;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/android/dx/ssa/SsaMethod;->getBlocks()Ljava/util/ArrayList;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    check-cast p0, Lcom/android/dx/ssa/SsaBasicBlock;

    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/android/dx/ssa/SsaBasicBlock;->getInsns()Ljava/util/ArrayList;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, Lcom/android/dx/ssa/SsaInsn;

    .line 35
    .line 36
    return-object p0
.end method

.method private insertExceptionThrow(Lcom/android/dx/ssa/SsaInsn;Lcom/android/dx/rop/code/RegisterSpec;Ljava/util/HashSet;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/dx/ssa/SsaInsn;",
            "Lcom/android/dx/rop/code/RegisterSpec;",
            "Ljava/util/HashSet<",
            "Lcom/android/dx/ssa/SsaInsn;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v5, Lcom/android/dx/rop/cst/CstType;

    .line 2
    .line 3
    sget-object v0, Lcom/android/dx/rop/code/Exceptions;->TYPE_ArrayIndexOutOfBoundsException:Lcom/android/dx/rop/type/Type;

    .line 4
    .line 5
    invoke-direct {v5, v0}, Lcom/android/dx/rop/cst/CstType;-><init>(Lcom/android/dx/rop/type/Type;)V

    .line 6
    .line 7
    .line 8
    sget-object v2, Lcom/android/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    const/16 v4, 0x28

    .line 12
    .line 13
    move-object v0, p0

    .line 14
    move-object v1, p1

    .line 15
    invoke-direct/range {v0 .. v5}, Lcom/android/dx/ssa/EscapeAnalysis;->insertThrowingInsnBefore(Lcom/android/dx/ssa/SsaInsn;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/code/RegisterSpec;ILcom/android/dx/rop/cst/Constant;)V

    .line 16
    .line 17
    .line 18
    move-object v6, v0

    .line 19
    invoke-virtual {v1}, Lcom/android/dx/ssa/SsaInsn;->getBlock()Lcom/android/dx/ssa/SsaBasicBlock;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p0}, Lcom/android/dx/ssa/SsaBasicBlock;->getPrimarySuccessor()Lcom/android/dx/ssa/SsaBasicBlock;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p0, p1}, Lcom/android/dx/ssa/SsaBasicBlock;->insertNewSuccessor(Lcom/android/dx/ssa/SsaBasicBlock;)Lcom/android/dx/ssa/SsaBasicBlock;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {p0}, Lcom/android/dx/ssa/SsaBasicBlock;->getInsns()Ljava/util/ArrayList;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    const/4 v0, 0x0

    .line 36
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    move-object v7, p1

    .line 41
    check-cast v7, Lcom/android/dx/ssa/SsaInsn;

    .line 42
    .line 43
    iget-object p1, v6, Lcom/android/dx/ssa/EscapeAnalysis;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 44
    .line 45
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaMethod;->makeNewSsaReg()I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    invoke-static {p1, v5}, Lcom/android/dx/rop/code/RegisterSpec;->make(ILcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/RegisterSpec;

    .line 50
    .line 51
    .line 52
    move-result-object v9

    .line 53
    const/16 v10, 0x38

    .line 54
    .line 55
    const/4 v11, 0x0

    .line 56
    move-object v8, v2

    .line 57
    invoke-direct/range {v6 .. v11}, Lcom/android/dx/ssa/EscapeAnalysis;->insertPlainInsnBefore(Lcom/android/dx/ssa/SsaInsn;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/code/RegisterSpec;ILcom/android/dx/rop/cst/Constant;)V

    .line 58
    .line 59
    .line 60
    move-object p1, v9

    .line 61
    invoke-virtual {p0}, Lcom/android/dx/ssa/SsaBasicBlock;->getPrimarySuccessor()Lcom/android/dx/ssa/SsaBasicBlock;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-virtual {p0, v1}, Lcom/android/dx/ssa/SsaBasicBlock;->insertNewSuccessor(Lcom/android/dx/ssa/SsaBasicBlock;)Lcom/android/dx/ssa/SsaBasicBlock;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-virtual {p0}, Lcom/android/dx/ssa/SsaBasicBlock;->getInsns()Ljava/util/ArrayList;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    move-object v7, v1

    .line 78
    check-cast v7, Lcom/android/dx/ssa/SsaInsn;

    .line 79
    .line 80
    new-instance v1, Lcom/android/dx/rop/cst/CstNat;

    .line 81
    .line 82
    new-instance v2, Lcom/android/dx/rop/cst/CstString;

    .line 83
    .line 84
    const-string v3, "<init>"

    .line 85
    .line 86
    invoke-direct {v2, v3}, Lcom/android/dx/rop/cst/CstString;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    new-instance v3, Lcom/android/dx/rop/cst/CstString;

    .line 90
    .line 91
    const-string v4, "(I)V"

    .line 92
    .line 93
    invoke-direct {v3, v4}, Lcom/android/dx/rop/cst/CstString;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-direct {v1, v2, v3}, Lcom/android/dx/rop/cst/CstNat;-><init>(Lcom/android/dx/rop/cst/CstString;Lcom/android/dx/rop/cst/CstString;)V

    .line 97
    .line 98
    .line 99
    new-instance v11, Lcom/android/dx/rop/cst/CstMethodRef;

    .line 100
    .line 101
    invoke-direct {v11, v5, v1}, Lcom/android/dx/rop/cst/CstMethodRef;-><init>(Lcom/android/dx/rop/cst/CstType;Lcom/android/dx/rop/cst/CstNat;)V

    .line 102
    .line 103
    .line 104
    invoke-static {p1, p2}, Lcom/android/dx/rop/code/RegisterSpecList;->make(Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpec;)Lcom/android/dx/rop/code/RegisterSpecList;

    .line 105
    .line 106
    .line 107
    move-result-object v8

    .line 108
    const/4 v9, 0x0

    .line 109
    const/16 v10, 0x34

    .line 110
    .line 111
    invoke-direct/range {v6 .. v11}, Lcom/android/dx/ssa/EscapeAnalysis;->insertThrowingInsnBefore(Lcom/android/dx/ssa/SsaInsn;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/code/RegisterSpec;ILcom/android/dx/rop/cst/Constant;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p3, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0}, Lcom/android/dx/ssa/SsaBasicBlock;->getPrimarySuccessor()Lcom/android/dx/ssa/SsaBasicBlock;

    .line 118
    .line 119
    .line 120
    move-result-object p2

    .line 121
    invoke-virtual {p0, p2}, Lcom/android/dx/ssa/SsaBasicBlock;->insertNewSuccessor(Lcom/android/dx/ssa/SsaBasicBlock;)Lcom/android/dx/ssa/SsaBasicBlock;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    invoke-virtual {p0}, Lcom/android/dx/ssa/SsaBasicBlock;->getInsns()Ljava/util/ArrayList;

    .line 126
    .line 127
    .line 128
    move-result-object p2

    .line 129
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p2

    .line 133
    move-object v7, p2

    .line 134
    check-cast v7, Lcom/android/dx/ssa/SsaInsn;

    .line 135
    .line 136
    invoke-static {p1}, Lcom/android/dx/rop/code/RegisterSpecList;->make(Lcom/android/dx/rop/code/RegisterSpec;)Lcom/android/dx/rop/code/RegisterSpecList;

    .line 137
    .line 138
    .line 139
    move-result-object v8

    .line 140
    const/16 v10, 0x23

    .line 141
    .line 142
    const/4 v11, 0x0

    .line 143
    invoke-direct/range {v6 .. v11}, Lcom/android/dx/ssa/EscapeAnalysis;->insertThrowingInsnBefore(Lcom/android/dx/ssa/SsaInsn;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/code/RegisterSpec;ILcom/android/dx/rop/cst/Constant;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p0}, Lcom/android/dx/ssa/SsaBasicBlock;->getPrimarySuccessorIndex()I

    .line 147
    .line 148
    .line 149
    move-result p1

    .line 150
    iget-object p2, v6, Lcom/android/dx/ssa/EscapeAnalysis;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 151
    .line 152
    invoke-virtual {p2}, Lcom/android/dx/ssa/SsaMethod;->getExitBlock()Lcom/android/dx/ssa/SsaBasicBlock;

    .line 153
    .line 154
    .line 155
    move-result-object p2

    .line 156
    invoke-virtual {p2}, Lcom/android/dx/ssa/SsaBasicBlock;->getIndex()I

    .line 157
    .line 158
    .line 159
    move-result p2

    .line 160
    invoke-virtual {p0, p1, p2}, Lcom/android/dx/ssa/SsaBasicBlock;->replaceSuccessor(II)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {p3, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    return-void
.end method

.method private insertPlainInsnBefore(Lcom/android/dx/ssa/SsaInsn;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/code/RegisterSpec;ILcom/android/dx/rop/cst/Constant;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaInsn;->getOriginalRopInsn()Lcom/android/dx/rop/code/Insn;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/16 v1, 0x38

    .line 6
    .line 7
    if-ne p4, v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p3}, Lcom/android/dx/rop/code/RegisterSpec;->getType()Lcom/android/dx/rop/type/Type;

    .line 10
    .line 11
    .line 12
    move-result-object p4

    .line 13
    invoke-static {p4}, Lcom/android/dx/rop/code/Rops;->opMoveResultPseudo(Lcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/Rop;

    .line 14
    .line 15
    .line 16
    move-result-object p4

    .line 17
    :goto_0
    move-object v2, p4

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    invoke-static {p4, p3, p2, p5}, Lcom/android/dx/rop/code/Rops;->ropFor(ILcom/android/dx/rop/type/TypeBearer;Lcom/android/dx/rop/type/TypeList;Lcom/android/dx/rop/cst/Constant;)Lcom/android/dx/rop/code/Rop;

    .line 20
    .line 21
    .line 22
    move-result-object p4

    .line 23
    goto :goto_0

    .line 24
    :goto_1
    if-nez p5, :cond_1

    .line 25
    .line 26
    new-instance p4, Lcom/android/dx/rop/code/PlainInsn;

    .line 27
    .line 28
    invoke-virtual {v0}, Lcom/android/dx/rop/code/Insn;->getPosition()Lcom/android/dx/rop/code/SourcePosition;

    .line 29
    .line 30
    .line 31
    move-result-object p5

    .line 32
    invoke-direct {p4, v2, p5, p3, p2}, Lcom/android/dx/rop/code/PlainInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 33
    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_1
    new-instance v1, Lcom/android/dx/rop/code/PlainCstInsn;

    .line 37
    .line 38
    invoke-virtual {v0}, Lcom/android/dx/rop/code/Insn;->getPosition()Lcom/android/dx/rop/code/SourcePosition;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    move-object v5, p2

    .line 43
    move-object v4, p3

    .line 44
    move-object v6, p5

    .line 45
    invoke-direct/range {v1 .. v6}, Lcom/android/dx/rop/code/PlainCstInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/cst/Constant;)V

    .line 46
    .line 47
    .line 48
    move-object p4, v1

    .line 49
    :goto_2
    new-instance p2, Lcom/android/dx/ssa/NormalSsaInsn;

    .line 50
    .line 51
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaInsn;->getBlock()Lcom/android/dx/ssa/SsaBasicBlock;

    .line 52
    .line 53
    .line 54
    move-result-object p3

    .line 55
    invoke-direct {p2, p4, p3}, Lcom/android/dx/ssa/NormalSsaInsn;-><init>(Lcom/android/dx/rop/code/Insn;Lcom/android/dx/ssa/SsaBasicBlock;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaInsn;->getBlock()Lcom/android/dx/ssa/SsaBasicBlock;

    .line 59
    .line 60
    .line 61
    move-result-object p3

    .line 62
    invoke-virtual {p3}, Lcom/android/dx/ssa/SsaBasicBlock;->getInsns()Ljava/util/ArrayList;

    .line 63
    .line 64
    .line 65
    move-result-object p3

    .line 66
    invoke-interface {p3, p1}, Ljava/util/List;->lastIndexOf(Ljava/lang/Object;)I

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    invoke-interface {p3, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    iget-object p0, p0, Lcom/android/dx/ssa/EscapeAnalysis;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 74
    .line 75
    invoke-virtual {p0, p2}, Lcom/android/dx/ssa/SsaMethod;->onInsnAdded(Lcom/android/dx/ssa/SsaInsn;)V

    .line 76
    .line 77
    .line 78
    return-void
.end method

.method private insertThrowingInsnBefore(Lcom/android/dx/ssa/SsaInsn;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/code/RegisterSpec;ILcom/android/dx/rop/cst/Constant;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaInsn;->getOriginalRopInsn()Lcom/android/dx/rop/code/Insn;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p4, p3, p2, p5}, Lcom/android/dx/rop/code/Rops;->ropFor(ILcom/android/dx/rop/type/TypeBearer;Lcom/android/dx/rop/type/TypeList;Lcom/android/dx/rop/cst/Constant;)Lcom/android/dx/rop/code/Rop;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    if-nez p5, :cond_0

    .line 10
    .line 11
    new-instance p3, Lcom/android/dx/rop/code/ThrowingInsn;

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/android/dx/rop/code/Insn;->getPosition()Lcom/android/dx/rop/code/SourcePosition;

    .line 14
    .line 15
    .line 16
    move-result-object p4

    .line 17
    sget-object p5, Lcom/android/dx/rop/type/StdTypeList;->EMPTY:Lcom/android/dx/rop/type/StdTypeList;

    .line 18
    .line 19
    invoke-direct {p3, v2, p4, p2, p5}, Lcom/android/dx/rop/code/ThrowingInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/type/TypeList;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance v1, Lcom/android/dx/rop/code/ThrowingCstInsn;

    .line 24
    .line 25
    invoke-virtual {v0}, Lcom/android/dx/rop/code/Insn;->getPosition()Lcom/android/dx/rop/code/SourcePosition;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    sget-object v5, Lcom/android/dx/rop/type/StdTypeList;->EMPTY:Lcom/android/dx/rop/type/StdTypeList;

    .line 30
    .line 31
    move-object v4, p2

    .line 32
    move-object v6, p5

    .line 33
    invoke-direct/range {v1 .. v6}, Lcom/android/dx/rop/code/ThrowingCstInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/type/TypeList;Lcom/android/dx/rop/cst/Constant;)V

    .line 34
    .line 35
    .line 36
    move-object p3, v1

    .line 37
    :goto_0
    new-instance p2, Lcom/android/dx/ssa/NormalSsaInsn;

    .line 38
    .line 39
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaInsn;->getBlock()Lcom/android/dx/ssa/SsaBasicBlock;

    .line 40
    .line 41
    .line 42
    move-result-object p4

    .line 43
    invoke-direct {p2, p3, p4}, Lcom/android/dx/ssa/NormalSsaInsn;-><init>(Lcom/android/dx/rop/code/Insn;Lcom/android/dx/ssa/SsaBasicBlock;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaInsn;->getBlock()Lcom/android/dx/ssa/SsaBasicBlock;

    .line 47
    .line 48
    .line 49
    move-result-object p3

    .line 50
    invoke-virtual {p3}, Lcom/android/dx/ssa/SsaBasicBlock;->getInsns()Ljava/util/ArrayList;

    .line 51
    .line 52
    .line 53
    move-result-object p3

    .line 54
    invoke-interface {p3, p1}, Ljava/util/List;->lastIndexOf(Ljava/lang/Object;)I

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    invoke-interface {p3, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iget-object p0, p0, Lcom/android/dx/ssa/EscapeAnalysis;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 62
    .line 63
    invoke-virtual {p0, p2}, Lcom/android/dx/ssa/SsaMethod;->onInsnAdded(Lcom/android/dx/ssa/SsaInsn;)V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method private movePropagate()V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    iget-object v2, p0, Lcom/android/dx/ssa/EscapeAnalysis;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 4
    .line 5
    invoke-virtual {v2}, Lcom/android/dx/ssa/SsaMethod;->getRegCount()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-ge v1, v2, :cond_3

    .line 10
    .line 11
    iget-object v2, p0, Lcom/android/dx/ssa/EscapeAnalysis;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 12
    .line 13
    invoke-virtual {v2, v1}, Lcom/android/dx/ssa/SsaMethod;->getDefinitionForRegister(I)Lcom/android/dx/ssa/SsaInsn;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    if-eqz v2, :cond_2

    .line 18
    .line 19
    invoke-virtual {v2}, Lcom/android/dx/ssa/SsaInsn;->getOpcode()Lcom/android/dx/rop/code/Rop;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    if-eqz v3, :cond_2

    .line 24
    .line 25
    invoke-virtual {v2}, Lcom/android/dx/ssa/SsaInsn;->getOpcode()Lcom/android/dx/rop/code/Rop;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-virtual {v3}, Lcom/android/dx/rop/code/Rop;->getOpcode()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    const/4 v4, 0x2

    .line 34
    if-eq v3, v4, :cond_0

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_0
    iget-object v3, p0, Lcom/android/dx/ssa/EscapeAnalysis;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 38
    .line 39
    invoke-virtual {v3}, Lcom/android/dx/ssa/SsaMethod;->getUseListCopy()[Ljava/util/ArrayList;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-virtual {v2}, Lcom/android/dx/ssa/SsaInsn;->getSources()Lcom/android/dx/rop/code/RegisterSpecList;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    invoke-virtual {v4, v0}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    invoke-virtual {v2}, Lcom/android/dx/ssa/SsaInsn;->getResult()Lcom/android/dx/rop/code/RegisterSpec;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-virtual {v4}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    iget v6, p0, Lcom/android/dx/ssa/EscapeAnalysis;->regCount:I

    .line 60
    .line 61
    if-ge v5, v6, :cond_1

    .line 62
    .line 63
    invoke-virtual {v2}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    iget v6, p0, Lcom/android/dx/ssa/EscapeAnalysis;->regCount:I

    .line 68
    .line 69
    if-ge v5, v6, :cond_1

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_1
    new-instance v5, Lcom/android/dx/ssa/EscapeAnalysis$1;

    .line 73
    .line 74
    invoke-direct {v5, p0, v2, v4}, Lcom/android/dx/ssa/EscapeAnalysis$1;-><init>(Lcom/android/dx/ssa/EscapeAnalysis;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpec;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    aget-object v2, v3, v2

    .line 82
    .line 83
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    if-eqz v3, :cond_2

    .line 92
    .line 93
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    check-cast v3, Lcom/android/dx/ssa/SsaInsn;

    .line 98
    .line 99
    invoke-virtual {v3, v5}, Lcom/android/dx/ssa/SsaInsn;->mapSourceRegisters(Lcom/android/dx/ssa/RegisterMapper;)V

    .line 100
    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_2
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_3
    return-void
.end method

.method public static process(Lcom/android/dx/ssa/SsaMethod;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/android/dx/ssa/EscapeAnalysis;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/android/dx/ssa/EscapeAnalysis;-><init>(Lcom/android/dx/ssa/SsaMethod;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {v0}, Lcom/android/dx/ssa/EscapeAnalysis;->run()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private processInsn(Lcom/android/dx/ssa/SsaInsn;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaInsn;->getOpcode()Lcom/android/dx/rop/code/Rop;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/android/dx/rop/code/Rop;->getOpcode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaInsn;->getResult()Lcom/android/dx/rop/code/RegisterSpec;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const/16 v2, 0x38

    .line 14
    .line 15
    const/16 v3, 0x9

    .line 16
    .line 17
    if-ne v0, v2, :cond_0

    .line 18
    .line 19
    invoke-virtual {v1}, Lcom/android/dx/rop/code/RegisterSpec;->getTypeBearer()Lcom/android/dx/rop/type/TypeBearer;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-interface {v2}, Lcom/android/dx/rop/type/TypeBearer;->getBasicType()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-ne v2, v3, :cond_0

    .line 28
    .line 29
    invoke-direct {p0, p1}, Lcom/android/dx/ssa/EscapeAnalysis;->processMoveResultPseudoInsn(Lcom/android/dx/ssa/SsaInsn;)Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-direct {p0, v1, p1}, Lcom/android/dx/ssa/EscapeAnalysis;->processRegister(Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_0
    const/4 p1, 0x3

    .line 38
    if-ne v0, p1, :cond_1

    .line 39
    .line 40
    invoke-virtual {v1}, Lcom/android/dx/rop/code/RegisterSpec;->getTypeBearer()Lcom/android/dx/rop/type/TypeBearer;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-interface {p1}, Lcom/android/dx/rop/type/TypeBearer;->getBasicType()I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-ne p1, v3, :cond_1

    .line 49
    .line 50
    new-instance p1, Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;

    .line 51
    .line 52
    invoke-virtual {v1}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iget v2, p0, Lcom/android/dx/ssa/EscapeAnalysis;->regCount:I

    .line 57
    .line 58
    sget-object v3, Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;->NONE:Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;

    .line 59
    .line 60
    invoke-direct {p1, v0, v2, v3}, Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;-><init>(IILcom/android/dx/ssa/EscapeAnalysis$EscapeState;)V

    .line 61
    .line 62
    .line 63
    iget-object v0, p0, Lcom/android/dx/ssa/EscapeAnalysis;->latticeValues:Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    invoke-direct {p0, v1, p1}, Lcom/android/dx/ssa/EscapeAnalysis;->processRegister(Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;)V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :cond_1
    const/16 p1, 0x37

    .line 73
    .line 74
    if-ne v0, p1, :cond_2

    .line 75
    .line 76
    invoke-virtual {v1}, Lcom/android/dx/rop/code/RegisterSpec;->getTypeBearer()Lcom/android/dx/rop/type/TypeBearer;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-interface {p1}, Lcom/android/dx/rop/type/TypeBearer;->getBasicType()I

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-ne p1, v3, :cond_2

    .line 85
    .line 86
    new-instance p1, Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;

    .line 87
    .line 88
    invoke-virtual {v1}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    iget v2, p0, Lcom/android/dx/ssa/EscapeAnalysis;->regCount:I

    .line 93
    .line 94
    sget-object v3, Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;->NONE:Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;

    .line 95
    .line 96
    invoke-direct {p1, v0, v2, v3}, Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;-><init>(IILcom/android/dx/ssa/EscapeAnalysis$EscapeState;)V

    .line 97
    .line 98
    .line 99
    iget-object v0, p0, Lcom/android/dx/ssa/EscapeAnalysis;->latticeValues:Ljava/util/ArrayList;

    .line 100
    .line 101
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    invoke-direct {p0, v1, p1}, Lcom/android/dx/ssa/EscapeAnalysis;->processRegister(Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;)V

    .line 105
    .line 106
    .line 107
    :cond_2
    return-void
.end method

.method private processMoveResultPseudoInsn(Lcom/android/dx/ssa/SsaInsn;)Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;
    .locals 4

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaInsn;->getResult()Lcom/android/dx/rop/code/RegisterSpec;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0, p1}, Lcom/android/dx/ssa/EscapeAnalysis;->getInsnForMove(Lcom/android/dx/ssa/SsaInsn;)Lcom/android/dx/ssa/SsaInsn;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaInsn;->getOpcode()Lcom/android/dx/rop/code/Rop;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Lcom/android/dx/rop/code/Rop;->getOpcode()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v2, 0x5

    .line 18
    if-eq v1, v2, :cond_5

    .line 19
    .line 20
    const/16 v2, 0x26

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    if-eq v1, v2, :cond_2

    .line 24
    .line 25
    const/16 v2, 0x2d

    .line 26
    .line 27
    if-eq v1, v2, :cond_2

    .line 28
    .line 29
    const/16 v2, 0x2e

    .line 30
    .line 31
    if-eq v1, v2, :cond_1

    .line 32
    .line 33
    packed-switch v1, :pswitch_data_0

    .line 34
    .line 35
    .line 36
    const/4 p0, 0x0

    .line 37
    return-object p0

    .line 38
    :pswitch_0
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaInsn;->getSources()Lcom/android/dx/rop/code/RegisterSpecList;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p1, v3}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p1}, Lcom/android/dx/rop/code/RegisterSpec;->getTypeBearer()Lcom/android/dx/rop/type/TypeBearer;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-interface {p1}, Lcom/android/dx/rop/type/TypeBearer;->isConstant()Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    if-eqz p1, :cond_0

    .line 55
    .line 56
    new-instance p1, Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;

    .line 57
    .line 58
    invoke-virtual {v0}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    iget v1, p0, Lcom/android/dx/ssa/EscapeAnalysis;->regCount:I

    .line 63
    .line 64
    sget-object v2, Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;->NONE:Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;

    .line 65
    .line 66
    invoke-direct {p1, v0, v1, v2}, Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;-><init>(IILcom/android/dx/ssa/EscapeAnalysis$EscapeState;)V

    .line 67
    .line 68
    .line 69
    const/4 v0, 0x1

    .line 70
    iput-boolean v0, p1, Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;->replaceableArray:Z

    .line 71
    .line 72
    goto/16 :goto_0

    .line 73
    .line 74
    :cond_0
    new-instance p1, Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;

    .line 75
    .line 76
    invoke-virtual {v0}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    iget v1, p0, Lcom/android/dx/ssa/EscapeAnalysis;->regCount:I

    .line 81
    .line 82
    sget-object v2, Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;->GLOBAL:Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;

    .line 83
    .line 84
    invoke-direct {p1, v0, v1, v2}, Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;-><init>(IILcom/android/dx/ssa/EscapeAnalysis$EscapeState;)V

    .line 85
    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_1
    new-instance p1, Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;

    .line 89
    .line 90
    invoke-virtual {v0}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    iget v1, p0, Lcom/android/dx/ssa/EscapeAnalysis;->regCount:I

    .line 95
    .line 96
    sget-object v2, Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;->GLOBAL:Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;

    .line 97
    .line 98
    invoke-direct {p1, v0, v1, v2}, Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;-><init>(IILcom/android/dx/ssa/EscapeAnalysis$EscapeState;)V

    .line 99
    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_2
    :pswitch_1
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaInsn;->getSources()Lcom/android/dx/rop/code/RegisterSpecList;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    invoke-virtual {p1, v3}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-direct {p0, p1}, Lcom/android/dx/ssa/EscapeAnalysis;->findSetIndex(Lcom/android/dx/rop/code/RegisterSpec;)I

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    iget-object v2, p0, Lcom/android/dx/ssa/EscapeAnalysis;->latticeValues:Ljava/util/ArrayList;

    .line 115
    .line 116
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 117
    .line 118
    .line 119
    move-result v2

    .line 120
    if-eq v1, v2, :cond_3

    .line 121
    .line 122
    iget-object p0, p0, Lcom/android/dx/ssa/EscapeAnalysis;->latticeValues:Ljava/util/ArrayList;

    .line 123
    .line 124
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    check-cast p0, Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;

    .line 129
    .line 130
    iget-object p1, p0, Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;->regSet:Ljava/util/BitSet;

    .line 131
    .line 132
    invoke-virtual {v0}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    invoke-virtual {p1, v0}, Ljava/util/BitSet;->set(I)V

    .line 137
    .line 138
    .line 139
    return-object p0

    .line 140
    :cond_3
    invoke-virtual {p1}, Lcom/android/dx/rop/code/RegisterSpec;->getType()Lcom/android/dx/rop/type/Type;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    sget-object v1, Lcom/android/dx/rop/type/Type;->KNOWN_NULL:Lcom/android/dx/rop/type/Type;

    .line 145
    .line 146
    if-ne p1, v1, :cond_4

    .line 147
    .line 148
    new-instance p1, Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;

    .line 149
    .line 150
    invoke-virtual {v0}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    iget v1, p0, Lcom/android/dx/ssa/EscapeAnalysis;->regCount:I

    .line 155
    .line 156
    sget-object v2, Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;->NONE:Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;

    .line 157
    .line 158
    invoke-direct {p1, v0, v1, v2}, Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;-><init>(IILcom/android/dx/ssa/EscapeAnalysis$EscapeState;)V

    .line 159
    .line 160
    .line 161
    goto :goto_0

    .line 162
    :cond_4
    new-instance p1, Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;

    .line 163
    .line 164
    invoke-virtual {v0}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    iget v1, p0, Lcom/android/dx/ssa/EscapeAnalysis;->regCount:I

    .line 169
    .line 170
    sget-object v2, Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;->GLOBAL:Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;

    .line 171
    .line 172
    invoke-direct {p1, v0, v1, v2}, Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;-><init>(IILcom/android/dx/ssa/EscapeAnalysis$EscapeState;)V

    .line 173
    .line 174
    .line 175
    goto :goto_0

    .line 176
    :cond_5
    :pswitch_2
    new-instance p1, Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;

    .line 177
    .line 178
    invoke-virtual {v0}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    iget v1, p0, Lcom/android/dx/ssa/EscapeAnalysis;->regCount:I

    .line 183
    .line 184
    sget-object v2, Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;->NONE:Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;

    .line 185
    .line 186
    invoke-direct {p1, v0, v1, v2}, Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;-><init>(IILcom/android/dx/ssa/EscapeAnalysis$EscapeState;)V

    .line 187
    .line 188
    .line 189
    :goto_0
    iget-object p0, p0, Lcom/android/dx/ssa/EscapeAnalysis;->latticeValues:Ljava/util/ArrayList;

    .line 190
    .line 191
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    return-object p1

    .line 195
    :pswitch_data_0
    .packed-switch 0x28
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private processPhiUse(Lcom/android/dx/ssa/SsaInsn;Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;Ljava/util/ArrayList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/dx/ssa/SsaInsn;",
            "Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;",
            "Ljava/util/ArrayList<",
            "Lcom/android/dx/rop/code/RegisterSpec;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaInsn;->getResult()Lcom/android/dx/rop/code/RegisterSpec;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0, v0}, Lcom/android/dx/ssa/EscapeAnalysis;->findSetIndex(Lcom/android/dx/rop/code/RegisterSpec;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget-object v1, p0, Lcom/android/dx/ssa/EscapeAnalysis;->latticeValues:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eq v0, v1, :cond_2

    .line 16
    .line 17
    iget-object p1, p0, Lcom/android/dx/ssa/EscapeAnalysis;->latticeValues:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    check-cast p1, Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;

    .line 24
    .line 25
    if-eq p1, p2, :cond_1

    .line 26
    .line 27
    const/4 p3, 0x0

    .line 28
    iput-boolean p3, p2, Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;->replaceableArray:Z

    .line 29
    .line 30
    iget-object p3, p2, Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;->regSet:Ljava/util/BitSet;

    .line 31
    .line 32
    iget-object v1, p1, Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;->regSet:Ljava/util/BitSet;

    .line 33
    .line 34
    invoke-virtual {p3, v1}, Ljava/util/BitSet;->or(Ljava/util/BitSet;)V

    .line 35
    .line 36
    .line 37
    iget-object p3, p2, Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;->escape:Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;

    .line 38
    .line 39
    iget-object v1, p1, Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;->escape:Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;

    .line 40
    .line 41
    invoke-virtual {p3, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 42
    .line 43
    .line 44
    move-result p3

    .line 45
    if-gez p3, :cond_0

    .line 46
    .line 47
    iget-object p3, p1, Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;->escape:Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;

    .line 48
    .line 49
    iput-object p3, p2, Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;->escape:Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;

    .line 50
    .line 51
    :cond_0
    invoke-direct {p0, p2, p1}, Lcom/android/dx/ssa/EscapeAnalysis;->replaceNode(Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;)V

    .line 52
    .line 53
    .line 54
    iget-object p0, p0, Lcom/android/dx/ssa/EscapeAnalysis;->latticeValues:Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    :cond_1
    return-void

    .line 60
    :cond_2
    iget-object p0, p2, Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;->regSet:Ljava/util/BitSet;

    .line 61
    .line 62
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaInsn;->getResult()Lcom/android/dx/rop/code/RegisterSpec;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    invoke-virtual {p2}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 67
    .line 68
    .line 69
    move-result p2

    .line 70
    invoke-virtual {p0, p2}, Ljava/util/BitSet;->set(I)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaInsn;->getResult()Lcom/android/dx/rop/code/RegisterSpec;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    invoke-virtual {p3, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    return-void
.end method

.method private processRegister(Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;)V
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-nez p1, :cond_2

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    add-int/lit8 p1, p1, -0x1

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Lcom/android/dx/rop/code/RegisterSpec;

    .line 26
    .line 27
    iget-object v1, p0, Lcom/android/dx/ssa/EscapeAnalysis;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    invoke-virtual {v1, v2}, Lcom/android/dx/ssa/SsaMethod;->getUseListForRegister(I)Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_0

    .line 46
    .line 47
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    check-cast v2, Lcom/android/dx/ssa/SsaInsn;

    .line 52
    .line 53
    invoke-virtual {v2}, Lcom/android/dx/ssa/SsaInsn;->getOpcode()Lcom/android/dx/rop/code/Rop;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    if-nez v3, :cond_1

    .line 58
    .line 59
    invoke-direct {p0, v2, p2, v0}, Lcom/android/dx/ssa/EscapeAnalysis;->processPhiUse(Lcom/android/dx/ssa/SsaInsn;Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;Ljava/util/ArrayList;)V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    invoke-direct {p0, p1, v2, p2, v0}, Lcom/android/dx/ssa/EscapeAnalysis;->processUse(Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/ssa/SsaInsn;Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;Ljava/util/ArrayList;)V

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    return-void
.end method

.method private processUse(Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/ssa/SsaInsn;Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;Ljava/util/ArrayList;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/dx/rop/code/RegisterSpec;",
            "Lcom/android/dx/ssa/SsaInsn;",
            "Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;",
            "Ljava/util/ArrayList<",
            "Lcom/android/dx/rop/code/RegisterSpec;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Lcom/android/dx/ssa/SsaInsn;->getOpcode()Lcom/android/dx/rop/code/Rop;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/android/dx/rop/code/Rop;->getOpcode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x2

    .line 10
    if-eq v0, v1, :cond_8

    .line 11
    .line 12
    const/16 p4, 0x21

    .line 13
    .line 14
    if-eq v0, p4, :cond_7

    .line 15
    .line 16
    const/16 p4, 0x23

    .line 17
    .line 18
    if-eq v0, p4, :cond_7

    .line 19
    .line 20
    const/16 p4, 0x2b

    .line 21
    .line 22
    if-eq v0, p4, :cond_5

    .line 23
    .line 24
    const/4 p4, 0x7

    .line 25
    if-eq v0, p4, :cond_5

    .line 26
    .line 27
    const/16 p4, 0x8

    .line 28
    .line 29
    if-eq v0, p4, :cond_5

    .line 30
    .line 31
    const/16 p4, 0x26

    .line 32
    .line 33
    const/4 v2, 0x1

    .line 34
    const/4 v3, 0x0

    .line 35
    if-eq v0, p4, :cond_4

    .line 36
    .line 37
    const/16 p4, 0x27

    .line 38
    .line 39
    if-eq v0, p4, :cond_0

    .line 40
    .line 41
    packed-switch v0, :pswitch_data_0

    .line 42
    .line 43
    .line 44
    goto/16 :goto_0

    .line 45
    .line 46
    :pswitch_0
    sget-object p0, Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;->GLOBAL:Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;

    .line 47
    .line 48
    iput-object p0, p3, Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;->escape:Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;

    .line 49
    .line 50
    return-void

    .line 51
    :cond_0
    invoke-virtual {p2}, Lcom/android/dx/ssa/SsaInsn;->getSources()Lcom/android/dx/rop/code/RegisterSpecList;

    .line 52
    .line 53
    .line 54
    move-result-object p4

    .line 55
    invoke-virtual {p4, v1}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 56
    .line 57
    .line 58
    move-result-object p4

    .line 59
    invoke-virtual {p4}, Lcom/android/dx/rop/code/RegisterSpec;->getTypeBearer()Lcom/android/dx/rop/type/TypeBearer;

    .line 60
    .line 61
    .line 62
    move-result-object p4

    .line 63
    invoke-interface {p4}, Lcom/android/dx/rop/type/TypeBearer;->isConstant()Z

    .line 64
    .line 65
    .line 66
    move-result p4

    .line 67
    if-nez p4, :cond_1

    .line 68
    .line 69
    iput-boolean v3, p3, Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;->replaceableArray:Z

    .line 70
    .line 71
    :cond_1
    :pswitch_1
    invoke-virtual {p2}, Lcom/android/dx/ssa/SsaInsn;->getSources()Lcom/android/dx/rop/code/RegisterSpecList;

    .line 72
    .line 73
    .line 74
    move-result-object p4

    .line 75
    invoke-virtual {p4, v3}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 76
    .line 77
    .line 78
    move-result-object p4

    .line 79
    invoke-virtual {p4}, Lcom/android/dx/rop/code/RegisterSpec;->getTypeBearer()Lcom/android/dx/rop/type/TypeBearer;

    .line 80
    .line 81
    .line 82
    move-result-object p4

    .line 83
    invoke-interface {p4}, Lcom/android/dx/rop/type/TypeBearer;->getBasicType()I

    .line 84
    .line 85
    .line 86
    move-result p4

    .line 87
    const/16 v0, 0x9

    .line 88
    .line 89
    if-eq p4, v0, :cond_2

    .line 90
    .line 91
    goto/16 :goto_0

    .line 92
    .line 93
    :cond_2
    iput-boolean v3, p3, Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;->replaceableArray:Z

    .line 94
    .line 95
    invoke-virtual {p2}, Lcom/android/dx/ssa/SsaInsn;->getSources()Lcom/android/dx/rop/code/RegisterSpecList;

    .line 96
    .line 97
    .line 98
    move-result-object p2

    .line 99
    invoke-virtual {p2, v3}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 100
    .line 101
    .line 102
    move-result-object p4

    .line 103
    invoke-virtual {p4}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 104
    .line 105
    .line 106
    move-result p4

    .line 107
    invoke-virtual {p1}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    if-ne p4, p1, :cond_3

    .line 112
    .line 113
    invoke-virtual {p2, v2}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    invoke-direct {p0, p1}, Lcom/android/dx/ssa/EscapeAnalysis;->findSetIndex(Lcom/android/dx/rop/code/RegisterSpec;)I

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    iget-object p2, p0, Lcom/android/dx/ssa/EscapeAnalysis;->latticeValues:Ljava/util/ArrayList;

    .line 122
    .line 123
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 124
    .line 125
    .line 126
    move-result p2

    .line 127
    if-eq p1, p2, :cond_6

    .line 128
    .line 129
    iget-object p2, p0, Lcom/android/dx/ssa/EscapeAnalysis;->latticeValues:Ljava/util/ArrayList;

    .line 130
    .line 131
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    check-cast p1, Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;

    .line 136
    .line 137
    invoke-direct {p0, p1, p3}, Lcom/android/dx/ssa/EscapeAnalysis;->addEdge(Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;)V

    .line 138
    .line 139
    .line 140
    iget-object p0, p3, Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;->escape:Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;

    .line 141
    .line 142
    iget-object p2, p1, Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;->escape:Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;

    .line 143
    .line 144
    invoke-virtual {p0, p2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 145
    .line 146
    .line 147
    move-result p0

    .line 148
    if-gez p0, :cond_6

    .line 149
    .line 150
    iget-object p0, p1, Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;->escape:Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;

    .line 151
    .line 152
    iput-object p0, p3, Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;->escape:Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;

    .line 153
    .line 154
    return-void

    .line 155
    :cond_3
    invoke-virtual {p2, v3}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    invoke-direct {p0, p1}, Lcom/android/dx/ssa/EscapeAnalysis;->findSetIndex(Lcom/android/dx/rop/code/RegisterSpec;)I

    .line 160
    .line 161
    .line 162
    move-result p1

    .line 163
    iget-object p2, p0, Lcom/android/dx/ssa/EscapeAnalysis;->latticeValues:Ljava/util/ArrayList;

    .line 164
    .line 165
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 166
    .line 167
    .line 168
    move-result p2

    .line 169
    if-eq p1, p2, :cond_6

    .line 170
    .line 171
    iget-object p2, p0, Lcom/android/dx/ssa/EscapeAnalysis;->latticeValues:Ljava/util/ArrayList;

    .line 172
    .line 173
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    check-cast p1, Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;

    .line 178
    .line 179
    invoke-direct {p0, p3, p1}, Lcom/android/dx/ssa/EscapeAnalysis;->addEdge(Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;)V

    .line 180
    .line 181
    .line 182
    iget-object p0, p1, Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;->escape:Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;

    .line 183
    .line 184
    iget-object p2, p3, Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;->escape:Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;

    .line 185
    .line 186
    invoke-virtual {p0, p2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 187
    .line 188
    .line 189
    move-result p0

    .line 190
    if-gez p0, :cond_6

    .line 191
    .line 192
    iget-object p0, p3, Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;->escape:Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;

    .line 193
    .line 194
    iput-object p0, p1, Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;->escape:Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;

    .line 195
    .line 196
    return-void

    .line 197
    :cond_4
    invoke-virtual {p2}, Lcom/android/dx/ssa/SsaInsn;->getSources()Lcom/android/dx/rop/code/RegisterSpecList;

    .line 198
    .line 199
    .line 200
    move-result-object p0

    .line 201
    invoke-virtual {p0, v2}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 202
    .line 203
    .line 204
    move-result-object p0

    .line 205
    invoke-virtual {p0}, Lcom/android/dx/rop/code/RegisterSpec;->getTypeBearer()Lcom/android/dx/rop/type/TypeBearer;

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    invoke-interface {p0}, Lcom/android/dx/rop/type/TypeBearer;->isConstant()Z

    .line 210
    .line 211
    .line 212
    move-result p0

    .line 213
    if-nez p0, :cond_6

    .line 214
    .line 215
    iput-boolean v3, p3, Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;->replaceableArray:Z

    .line 216
    .line 217
    return-void

    .line 218
    :cond_5
    iget-object p0, p3, Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;->escape:Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;

    .line 219
    .line 220
    sget-object p1, Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;->METHOD:Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;

    .line 221
    .line 222
    invoke-virtual {p0, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 223
    .line 224
    .line 225
    move-result p0

    .line 226
    if-gez p0, :cond_6

    .line 227
    .line 228
    iput-object p1, p3, Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;->escape:Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;

    .line 229
    .line 230
    :cond_6
    :goto_0
    return-void

    .line 231
    :cond_7
    :pswitch_2
    sget-object p0, Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;->INTER:Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;

    .line 232
    .line 233
    iput-object p0, p3, Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;->escape:Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;

    .line 234
    .line 235
    return-void

    .line 236
    :cond_8
    iget-object p0, p3, Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;->regSet:Ljava/util/BitSet;

    .line 237
    .line 238
    invoke-virtual {p2}, Lcom/android/dx/ssa/SsaInsn;->getResult()Lcom/android/dx/rop/code/RegisterSpec;

    .line 239
    .line 240
    .line 241
    move-result-object p1

    .line 242
    invoke-virtual {p1}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 243
    .line 244
    .line 245
    move-result p1

    .line 246
    invoke-virtual {p0, p1}, Ljava/util/BitSet;->set(I)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {p2}, Lcom/android/dx/ssa/SsaInsn;->getResult()Lcom/android/dx/rop/code/RegisterSpec;

    .line 250
    .line 251
    .line 252
    move-result-object p0

    .line 253
    invoke-virtual {p4, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    return-void

    .line 257
    :pswitch_data_0
    .packed-switch 0x2f
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method

.method private replaceDef(Lcom/android/dx/ssa/SsaInsn;Lcom/android/dx/ssa/SsaInsn;ILjava/util/ArrayList;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/dx/ssa/SsaInsn;",
            "Lcom/android/dx/ssa/SsaInsn;",
            "I",
            "Ljava/util/ArrayList<",
            "Lcom/android/dx/rop/code/RegisterSpec;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaInsn;->getResult()Lcom/android/dx/rop/code/RegisterSpec;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-virtual {p2}, Lcom/android/dx/rop/code/RegisterSpec;->getType()Lcom/android/dx/rop/type/Type;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    const/4 v0, 0x0

    .line 10
    :goto_0
    if-ge v0, p3, :cond_0

    .line 11
    .line 12
    invoke-virtual {p2}, Lcom/android/dx/rop/type/Type;->getComponentType()Lcom/android/dx/rop/type/Type;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-static {v1}, Lcom/android/dx/rop/cst/Zeroes;->zeroFor(Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/cst/Constant;

    .line 17
    .line 18
    .line 19
    move-result-object v7

    .line 20
    move-object v1, v7

    .line 21
    check-cast v1, Lcom/android/dx/rop/cst/TypedConstant;

    .line 22
    .line 23
    iget-object v2, p0, Lcom/android/dx/ssa/EscapeAnalysis;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 24
    .line 25
    invoke-virtual {v2}, Lcom/android/dx/ssa/SsaMethod;->makeNewSsaReg()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    invoke-static {v2, v1}, Lcom/android/dx/rop/code/RegisterSpec;->make(ILcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/RegisterSpec;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    invoke-virtual {p4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    sget-object v4, Lcom/android/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 37
    .line 38
    const/4 v6, 0x5

    .line 39
    move-object v2, p0

    .line 40
    move-object v3, p1

    .line 41
    invoke-direct/range {v2 .. v7}, Lcom/android/dx/ssa/EscapeAnalysis;->insertPlainInsnBefore(Lcom/android/dx/ssa/SsaInsn;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/code/RegisterSpec;ILcom/android/dx/rop/cst/Constant;)V

    .line 42
    .line 43
    .line 44
    add-int/lit8 v0, v0, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    return-void
.end method

.method private replaceNode(Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;)V
    .locals 2

    .line 1
    iget-object p0, p2, Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;->parentSets:Ljava/util/ArrayList;

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
    check-cast v0, Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;

    .line 18
    .line 19
    iget-object v1, v0, Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;->childSets:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    iget-object v1, v0, Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;->childSets:Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    iget-object v1, p1, Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;->parentSets:Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    iget-object p0, p2, Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;->childSets:Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;

    .line 52
    .line 53
    iget-object v1, v0, Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;->parentSets:Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    iget-object v1, v0, Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;->parentSets:Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    iget-object v1, p1, Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;->childSets:Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_1
    return-void
.end method

.method private replaceUse(Lcom/android/dx/ssa/SsaInsn;Lcom/android/dx/ssa/SsaInsn;Ljava/util/ArrayList;Ljava/util/HashSet;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/dx/ssa/SsaInsn;",
            "Lcom/android/dx/ssa/SsaInsn;",
            "Ljava/util/ArrayList<",
            "Lcom/android/dx/rop/code/RegisterSpec;",
            ">;",
            "Ljava/util/HashSet<",
            "Lcom/android/dx/ssa/SsaInsn;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaInsn;->getOpcode()Lcom/android/dx/rop/code/Rop;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Lcom/android/dx/rop/code/Rop;->getOpcode()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/16 v2, 0x22

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    if-eq v1, v2, :cond_6

    .line 17
    .line 18
    const/16 p2, 0x39

    .line 19
    .line 20
    if-eq v1, p2, :cond_4

    .line 21
    .line 22
    const/16 p2, 0x26

    .line 23
    .line 24
    const/4 v2, 0x2

    .line 25
    if-eq v1, p2, :cond_2

    .line 26
    .line 27
    const/16 p2, 0x27

    .line 28
    .line 29
    if-eq v1, p2, :cond_0

    .line 30
    .line 31
    goto/16 :goto_2

    .line 32
    .line 33
    :cond_0
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaInsn;->getSources()Lcom/android/dx/rop/code/RegisterSpecList;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    invoke-virtual {p2, v2}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v1}, Lcom/android/dx/rop/code/RegisterSpec;->getTypeBearer()Lcom/android/dx/rop/type/TypeBearer;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    check-cast v1, Lcom/android/dx/rop/cst/CstLiteralBits;

    .line 46
    .line 47
    invoke-virtual {v1}, Lcom/android/dx/rop/cst/CstLiteralBits;->getIntBits()I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-ge v1, v0, :cond_1

    .line 52
    .line 53
    invoke-virtual {p2, v3}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    invoke-virtual {p3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p4

    .line 61
    check-cast p4, Lcom/android/dx/rop/code/RegisterSpec;

    .line 62
    .line 63
    invoke-virtual {p4}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 64
    .line 65
    .line 66
    move-result p4

    .line 67
    invoke-virtual {p2, p4}, Lcom/android/dx/rop/code/RegisterSpec;->withReg(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    invoke-static {p2}, Lcom/android/dx/rop/code/RegisterSpecList;->make(Lcom/android/dx/rop/code/RegisterSpec;)Lcom/android/dx/rop/code/RegisterSpecList;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    const/4 v6, 0x2

    .line 76
    const/4 v7, 0x0

    .line 77
    move-object v2, p0

    .line 78
    move-object v3, p1

    .line 79
    invoke-direct/range {v2 .. v7}, Lcom/android/dx/ssa/EscapeAnalysis;->insertPlainInsnBefore(Lcom/android/dx/ssa/SsaInsn;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/code/RegisterSpec;ILcom/android/dx/rop/cst/Constant;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v5}, Lcom/android/dx/rop/code/RegisterSpec;->withSimpleType()Lcom/android/dx/rop/code/RegisterSpec;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    invoke-virtual {p3, v1, p0}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :cond_1
    move v8, v2

    .line 91
    move-object v2, p0

    .line 92
    move-object p0, p1

    .line 93
    move p1, v8

    .line 94
    invoke-virtual {p2, p1}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-direct {v2, p0, p1, p4}, Lcom/android/dx/ssa/EscapeAnalysis;->insertExceptionThrow(Lcom/android/dx/ssa/SsaInsn;Lcom/android/dx/rop/code/RegisterSpec;Ljava/util/HashSet;)V

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :cond_2
    move v8, v2

    .line 103
    move-object v2, p0

    .line 104
    move-object p0, p1

    .line 105
    move p1, v8

    .line 106
    invoke-direct {v2, p0}, Lcom/android/dx/ssa/EscapeAnalysis;->getMoveForInsn(Lcom/android/dx/ssa/SsaInsn;)Lcom/android/dx/ssa/SsaInsn;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    invoke-virtual {p0}, Lcom/android/dx/ssa/SsaInsn;->getSources()Lcom/android/dx/rop/code/RegisterSpecList;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    const/4 p2, 0x1

    .line 115
    invoke-virtual {p0, p2}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    invoke-virtual {v1}, Lcom/android/dx/rop/code/RegisterSpec;->getTypeBearer()Lcom/android/dx/rop/type/TypeBearer;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    check-cast v1, Lcom/android/dx/rop/cst/CstLiteralBits;

    .line 124
    .line 125
    invoke-virtual {v1}, Lcom/android/dx/rop/cst/CstLiteralBits;->getIntBits()I

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    if-ge v1, v0, :cond_3

    .line 130
    .line 131
    invoke-virtual {p3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    check-cast p0, Lcom/android/dx/rop/code/RegisterSpec;

    .line 136
    .line 137
    invoke-virtual {v3}, Lcom/android/dx/ssa/SsaInsn;->getResult()Lcom/android/dx/rop/code/RegisterSpec;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    invoke-virtual {p1}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 142
    .line 143
    .line 144
    move-result p1

    .line 145
    invoke-virtual {p0, p1}, Lcom/android/dx/rop/code/RegisterSpec;->withReg(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 146
    .line 147
    .line 148
    move-result-object v5

    .line 149
    invoke-static {p0}, Lcom/android/dx/rop/code/RegisterSpecList;->make(Lcom/android/dx/rop/code/RegisterSpec;)Lcom/android/dx/rop/code/RegisterSpecList;

    .line 150
    .line 151
    .line 152
    move-result-object v4

    .line 153
    const/4 v6, 0x2

    .line 154
    const/4 v7, 0x0

    .line 155
    invoke-direct/range {v2 .. v7}, Lcom/android/dx/ssa/EscapeAnalysis;->insertPlainInsnBefore(Lcom/android/dx/ssa/SsaInsn;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/code/RegisterSpec;ILcom/android/dx/rop/cst/Constant;)V

    .line 156
    .line 157
    .line 158
    goto :goto_0

    .line 159
    :cond_3
    invoke-virtual {p0, p2}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    invoke-direct {v2, v3, p0, p4}, Lcom/android/dx/ssa/EscapeAnalysis;->insertExceptionThrow(Lcom/android/dx/ssa/SsaInsn;Lcom/android/dx/rop/code/RegisterSpec;Ljava/util/HashSet;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v3}, Lcom/android/dx/ssa/SsaInsn;->getBlock()Lcom/android/dx/ssa/SsaBasicBlock;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    invoke-virtual {p0}, Lcom/android/dx/ssa/SsaBasicBlock;->getInsns()Ljava/util/ArrayList;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    check-cast p0, Lcom/android/dx/ssa/SsaInsn;

    .line 179
    .line 180
    invoke-virtual {p4, p0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    :goto_0
    invoke-virtual {p4, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    return-void

    .line 187
    :cond_4
    move-object v2, p0

    .line 188
    move-object p0, p1

    .line 189
    invoke-virtual {p0}, Lcom/android/dx/ssa/SsaInsn;->getOriginalRopInsn()Lcom/android/dx/rop/code/Insn;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    check-cast p1, Lcom/android/dx/rop/code/FillArrayDataInsn;

    .line 194
    .line 195
    invoke-virtual {p1}, Lcom/android/dx/rop/code/FillArrayDataInsn;->getInitValues()Ljava/util/ArrayList;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    move p2, v3

    .line 200
    :goto_1
    if-ge p2, v0, :cond_5

    .line 201
    .line 202
    invoke-virtual {p3, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object p4

    .line 206
    check-cast p4, Lcom/android/dx/rop/code/RegisterSpec;

    .line 207
    .line 208
    invoke-virtual {p4}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 209
    .line 210
    .line 211
    move-result p4

    .line 212
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    check-cast v1, Lcom/android/dx/rop/type/TypeBearer;

    .line 217
    .line 218
    invoke-static {p4, v1}, Lcom/android/dx/rop/code/RegisterSpec;->make(ILcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/RegisterSpec;

    .line 219
    .line 220
    .line 221
    move-result-object v5

    .line 222
    sget-object v4, Lcom/android/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 223
    .line 224
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object p4

    .line 228
    move-object v7, p4

    .line 229
    check-cast v7, Lcom/android/dx/rop/cst/Constant;

    .line 230
    .line 231
    const/4 v6, 0x5

    .line 232
    move-object v3, p0

    .line 233
    invoke-direct/range {v2 .. v7}, Lcom/android/dx/ssa/EscapeAnalysis;->insertPlainInsnBefore(Lcom/android/dx/ssa/SsaInsn;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/code/RegisterSpec;ILcom/android/dx/rop/cst/Constant;)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {p3, p2, v5}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    add-int/lit8 p2, p2, 0x1

    .line 240
    .line 241
    goto :goto_1

    .line 242
    :cond_5
    :goto_2
    return-void

    .line 243
    :cond_6
    move-object v2, p0

    .line 244
    move-object p0, p1

    .line 245
    invoke-virtual {p2}, Lcom/android/dx/ssa/SsaInsn;->getSources()Lcom/android/dx/rop/code/RegisterSpecList;

    .line 246
    .line 247
    .line 248
    move-result-object p1

    .line 249
    invoke-virtual {p1, v3}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 250
    .line 251
    .line 252
    move-result-object p1

    .line 253
    invoke-virtual {p1}, Lcom/android/dx/rop/code/RegisterSpec;->getTypeBearer()Lcom/android/dx/rop/type/TypeBearer;

    .line 254
    .line 255
    .line 256
    move-result-object p1

    .line 257
    invoke-direct {v2, p0}, Lcom/android/dx/ssa/EscapeAnalysis;->getMoveForInsn(Lcom/android/dx/ssa/SsaInsn;)Lcom/android/dx/ssa/SsaInsn;

    .line 258
    .line 259
    .line 260
    move-result-object v3

    .line 261
    sget-object v4, Lcom/android/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 262
    .line 263
    invoke-virtual {v3}, Lcom/android/dx/ssa/SsaInsn;->getResult()Lcom/android/dx/rop/code/RegisterSpec;

    .line 264
    .line 265
    .line 266
    move-result-object v5

    .line 267
    const/4 v6, 0x5

    .line 268
    move-object v7, p1

    .line 269
    check-cast v7, Lcom/android/dx/rop/cst/Constant;

    .line 270
    .line 271
    invoke-direct/range {v2 .. v7}, Lcom/android/dx/ssa/EscapeAnalysis;->insertPlainInsnBefore(Lcom/android/dx/ssa/SsaInsn;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/code/RegisterSpec;ILcom/android/dx/rop/cst/Constant;)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {p4, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 275
    .line 276
    .line 277
    return-void
.end method

.method private run()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/android/dx/ssa/EscapeAnalysis;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 2
    .line 3
    new-instance v1, Lcom/android/dx/ssa/EscapeAnalysis$2;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lcom/android/dx/ssa/EscapeAnalysis$2;-><init>(Lcom/android/dx/ssa/EscapeAnalysis;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lcom/android/dx/ssa/SsaMethod;->forEachBlockDepthFirstDom(Lcom/android/dx/ssa/SsaBasicBlock$Visitor;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/android/dx/ssa/EscapeAnalysis;->latticeValues:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;

    .line 28
    .line 29
    iget-object v2, v1, Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;->escape:Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;

    .line 30
    .line 31
    sget-object v3, Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;->NONE:Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;

    .line 32
    .line 33
    if-eq v2, v3, :cond_0

    .line 34
    .line 35
    iget-object v2, v1, Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;->childSets:Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eqz v3, :cond_0

    .line 46
    .line 47
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    check-cast v3, Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;

    .line 52
    .line 53
    iget-object v4, v1, Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;->escape:Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;

    .line 54
    .line 55
    iget-object v5, v3, Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;->escape:Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;

    .line 56
    .line 57
    invoke-virtual {v4, v5}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    if-lez v4, :cond_1

    .line 62
    .line 63
    iget-object v4, v1, Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;->escape:Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;

    .line 64
    .line 65
    iput-object v4, v3, Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;->escape:Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    invoke-direct {p0}, Lcom/android/dx/ssa/EscapeAnalysis;->scalarReplacement()V

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method private scalarReplacement()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/android/dx/ssa/EscapeAnalysis;->latticeValues:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_3

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;

    .line 18
    .line 19
    iget-boolean v2, v1, Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;->replaceableArray:Z

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    iget-object v2, v1, Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;->escape:Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;

    .line 24
    .line 25
    sget-object v3, Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;->NONE:Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;

    .line 26
    .line 27
    if-eq v2, v3, :cond_1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    iget-object v1, v1, Lcom/android/dx/ssa/EscapeAnalysis$EscapeSet;->regSet:Ljava/util/BitSet;

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    invoke-virtual {v1, v2}, Ljava/util/BitSet;->nextSetBit(I)I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    iget-object v3, p0, Lcom/android/dx/ssa/EscapeAnalysis;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 38
    .line 39
    invoke-virtual {v3, v1}, Lcom/android/dx/ssa/SsaMethod;->getDefinitionForRegister(I)Lcom/android/dx/ssa/SsaInsn;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-direct {p0, v3}, Lcom/android/dx/ssa/EscapeAnalysis;->getInsnForMove(Lcom/android/dx/ssa/SsaInsn;)Lcom/android/dx/ssa/SsaInsn;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    invoke-virtual {v4}, Lcom/android/dx/ssa/SsaInsn;->getSources()Lcom/android/dx/rop/code/RegisterSpecList;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    invoke-virtual {v5, v2}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-virtual {v2}, Lcom/android/dx/rop/code/RegisterSpec;->getTypeBearer()Lcom/android/dx/rop/type/TypeBearer;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    check-cast v2, Lcom/android/dx/rop/cst/CstLiteralBits;

    .line 60
    .line 61
    invoke-virtual {v2}, Lcom/android/dx/rop/cst/CstLiteralBits;->getIntBits()I

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    new-instance v5, Ljava/util/ArrayList;

    .line 66
    .line 67
    invoke-direct {v5, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 68
    .line 69
    .line 70
    new-instance v6, Ljava/util/HashSet;

    .line 71
    .line 72
    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    .line 73
    .line 74
    .line 75
    invoke-direct {p0, v3, v4, v2, v5}, Lcom/android/dx/ssa/EscapeAnalysis;->replaceDef(Lcom/android/dx/ssa/SsaInsn;Lcom/android/dx/ssa/SsaInsn;ILjava/util/ArrayList;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v6, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    invoke-virtual {v6, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    iget-object v2, p0, Lcom/android/dx/ssa/EscapeAnalysis;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 85
    .line 86
    invoke-virtual {v2, v1}, Lcom/android/dx/ssa/SsaMethod;->getUseListForRegister(I)Ljava/util/List;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    if-eqz v2, :cond_2

    .line 99
    .line 100
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    check-cast v2, Lcom/android/dx/ssa/SsaInsn;

    .line 105
    .line 106
    invoke-direct {p0, v2, v4, v5, v6}, Lcom/android/dx/ssa/EscapeAnalysis;->replaceUse(Lcom/android/dx/ssa/SsaInsn;Lcom/android/dx/ssa/SsaInsn;Ljava/util/ArrayList;Ljava/util/HashSet;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v6, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_2
    iget-object v1, p0, Lcom/android/dx/ssa/EscapeAnalysis;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 114
    .line 115
    invoke-virtual {v1, v6}, Lcom/android/dx/ssa/SsaMethod;->deleteInsns(Ljava/util/Set;)V

    .line 116
    .line 117
    .line 118
    iget-object v1, p0, Lcom/android/dx/ssa/EscapeAnalysis;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 119
    .line 120
    invoke-virtual {v1}, Lcom/android/dx/ssa/SsaMethod;->onInsnsChanged()V

    .line 121
    .line 122
    .line 123
    iget-object v1, p0, Lcom/android/dx/ssa/EscapeAnalysis;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 124
    .line 125
    iget v2, p0, Lcom/android/dx/ssa/EscapeAnalysis;->regCount:I

    .line 126
    .line 127
    invoke-static {v1, v2}, Lcom/android/dx/ssa/SsaConverter;->updateSsaMethod(Lcom/android/dx/ssa/SsaMethod;I)V

    .line 128
    .line 129
    .line 130
    invoke-direct {p0}, Lcom/android/dx/ssa/EscapeAnalysis;->movePropagate()V

    .line 131
    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_3
    return-void
.end method
