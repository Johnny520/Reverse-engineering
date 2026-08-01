.class public final Lcom/android/dx/rop/code/BasicBlock;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lcom/android/dx/util/LabeledItem;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/dx/rop/code/BasicBlock$Visitor;
    }
.end annotation


# instance fields
.field private final insns:Lcom/android/dx/rop/code/InsnList;

.field private final label:I

.field private final primarySuccessor:I

.field private final successors:Lcom/android/dx/util/IntList;


# direct methods
.method public constructor <init>(ILcom/android/dx/rop/code/InsnList;Lcom/android/dx/util/IntList;I)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-ltz p1, :cond_7

    .line 6
    .line 7
    :try_start_0
    invoke-virtual {p2}, Lcom/android/dx/util/MutabilityControl;->throwIfMutable()V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_1

    .line 8
    .line 9
    .line 10
    invoke-virtual {p2}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_6

    .line 15
    .line 16
    add-int/lit8 v2, v1, -0x2

    .line 17
    .line 18
    :goto_0
    const/4 v3, 0x1

    .line 19
    if-ltz v2, :cond_1

    .line 20
    .line 21
    invoke-virtual {p2, v2}, Lcom/android/dx/rop/code/InsnList;->get(I)Lcom/android/dx/rop/code/Insn;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    invoke-virtual {v4}, Lcom/android/dx/rop/code/Insn;->getOpcode()Lcom/android/dx/rop/code/Rop;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    invoke-virtual {v4}, Lcom/android/dx/rop/code/Rop;->getBranchingness()I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-ne v4, v3, :cond_0

    .line 34
    .line 35
    add-int/lit8 v2, v2, -0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const-string p0, "insns["

    .line 39
    .line 40
    const-string p1, "] is a branch or can throw"

    .line 41
    .line 42
    invoke-static {v2, p0, p1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏兰哲世(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw v0

    .line 50
    :cond_1
    sub-int/2addr v1, v3

    .line 51
    invoke-virtual {p2, v1}, Lcom/android/dx/rop/code/InsnList;->get(I)Lcom/android/dx/rop/code/Insn;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {v1}, Lcom/android/dx/rop/code/Insn;->getOpcode()Lcom/android/dx/rop/code/Rop;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v1}, Lcom/android/dx/rop/code/Rop;->getBranchingness()I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eq v1, v3, :cond_5

    .line 64
    .line 65
    :try_start_1
    invoke-virtual {p3}, Lcom/android/dx/util/MutabilityControl;->throwIfMutable()V
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0

    .line 66
    .line 67
    .line 68
    const/4 v1, -0x1

    .line 69
    if-lt p4, v1, :cond_4

    .line 70
    .line 71
    if-ltz p4, :cond_3

    .line 72
    .line 73
    invoke-virtual {p3, p4}, Lcom/android/dx/util/IntList;->contains(I)Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-eqz v0, :cond_2

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 81
    .line 82
    new-instance p1, Ljava/lang/StringBuilder;

    .line 83
    .line 84
    const-string p2, "primarySuccessor "

    .line 85
    .line 86
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string p2, " not in successors "

    .line 93
    .line 94
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    throw p0

    .line 108
    :cond_3
    :goto_1
    iput p1, p0, Lcom/android/dx/rop/code/BasicBlock;->label:I

    .line 109
    .line 110
    iput-object p2, p0, Lcom/android/dx/rop/code/BasicBlock;->insns:Lcom/android/dx/rop/code/InsnList;

    .line 111
    .line 112
    iput-object p3, p0, Lcom/android/dx/rop/code/BasicBlock;->successors:Lcom/android/dx/util/IntList;

    .line 113
    .line 114
    iput p4, p0, Lcom/android/dx/rop/code/BasicBlock;->primarySuccessor:I

    .line 115
    .line 116
    return-void

    .line 117
    :cond_4
    const-string p0, "primarySuccessor < -1"

    .line 118
    .line 119
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    throw v0

    .line 123
    :catch_0
    const-string p0, "successors == null"

    .line 124
    .line 125
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    throw v0

    .line 129
    :cond_5
    const-string p0, "insns does not end with a branch or throwing instruction"

    .line 130
    .line 131
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    throw v0

    .line 135
    :cond_6
    const-string p0, "insns.size() == 0"

    .line 136
    .line 137
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    throw v0

    .line 141
    :catch_1
    const-string p0, "insns == null"

    .line 142
    .line 143
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    throw v0

    .line 147
    :cond_7
    const-string p0, "label < 0"

    .line 148
    .line 149
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    throw v0
.end method


# virtual methods
.method public canThrow()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/code/BasicBlock;->insns:Lcom/android/dx/rop/code/InsnList;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/rop/code/InsnList;->getLast()Lcom/android/dx/rop/code/Insn;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Lcom/android/dx/rop/code/Insn;->canThrow()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    return p0

    .line 5
    :cond_0
    const/4 p0, 0x0

    .line 6
    return p0
.end method

.method public getExceptionHandlerTypes()Lcom/android/dx/rop/type/TypeList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/code/BasicBlock;->insns:Lcom/android/dx/rop/code/InsnList;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/rop/code/InsnList;->getLast()Lcom/android/dx/rop/code/Insn;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Lcom/android/dx/rop/code/Insn;->getCatches()Lcom/android/dx/rop/type/TypeList;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public getFirstInsn()Lcom/android/dx/rop/code/Insn;
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/code/BasicBlock;->insns:Lcom/android/dx/rop/code/InsnList;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p0, v0}, Lcom/android/dx/rop/code/InsnList;->get(I)Lcom/android/dx/rop/code/Insn;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    return-object p0
.end method

.method public getInsns()Lcom/android/dx/rop/code/InsnList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/code/BasicBlock;->insns:Lcom/android/dx/rop/code/InsnList;

    .line 2
    .line 3
    return-object p0
.end method

.method public getLabel()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/rop/code/BasicBlock;->label:I

    .line 2
    .line 3
    return p0
.end method

.method public getLastInsn()Lcom/android/dx/rop/code/Insn;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/code/BasicBlock;->insns:Lcom/android/dx/rop/code/InsnList;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/rop/code/InsnList;->getLast()Lcom/android/dx/rop/code/Insn;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getPrimarySuccessor()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/rop/code/BasicBlock;->primarySuccessor:I

    .line 2
    .line 3
    return p0
.end method

.method public getSecondarySuccessor()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/android/dx/rop/code/BasicBlock;->successors:Lcom/android/dx/util/IntList;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/dx/util/IntList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x2

    .line 8
    if-ne v0, v1, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, Lcom/android/dx/rop/code/BasicBlock;->successors:Lcom/android/dx/util/IntList;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-virtual {v0, v1}, Lcom/android/dx/util/IntList;->get(I)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iget v1, p0, Lcom/android/dx/rop/code/BasicBlock;->primarySuccessor:I

    .line 18
    .line 19
    if-ne v0, v1, :cond_0

    .line 20
    .line 21
    iget-object p0, p0, Lcom/android/dx/rop/code/BasicBlock;->successors:Lcom/android/dx/util/IntList;

    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    invoke-virtual {p0, v0}, Lcom/android/dx/util/IntList;->get(I)I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    return p0

    .line 29
    :cond_0
    return v0

    .line 30
    :cond_1
    const-string p0, "block doesn\'t have exactly two successors"

    .line 31
    .line 32
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const/4 p0, 0x0

    .line 36
    return p0
.end method

.method public getSuccessors()Lcom/android/dx/util/IntList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/code/BasicBlock;->successors:Lcom/android/dx/util/IntList;

    .line 2
    .line 3
    return-object p0
.end method

.method public hasExceptionHandlers()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/code/BasicBlock;->insns:Lcom/android/dx/rop/code/InsnList;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/rop/code/InsnList;->getLast()Lcom/android/dx/rop/code/Insn;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Lcom/android/dx/rop/code/Insn;->getCatches()Lcom/android/dx/rop/type/TypeList;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-interface {p0}, Lcom/android/dx/rop/type/TypeList;->size()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return p0
.end method

.method public hashCode()I
    .locals 0

    .line 1
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "{"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget p0, p0, Lcom/android/dx/rop/code/BasicBlock;->label:I

    .line 9
    .line 10
    invoke-static {p0}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const/16 p0, 0x7d

    .line 18
    .line 19
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public withRegisterOffset(I)Lcom/android/dx/rop/code/BasicBlock;
    .locals 3

    .line 1
    new-instance v0, Lcom/android/dx/rop/code/BasicBlock;

    .line 2
    .line 3
    iget v1, p0, Lcom/android/dx/rop/code/BasicBlock;->label:I

    .line 4
    .line 5
    iget-object v2, p0, Lcom/android/dx/rop/code/BasicBlock;->insns:Lcom/android/dx/rop/code/InsnList;

    .line 6
    .line 7
    invoke-virtual {v2, p1}, Lcom/android/dx/rop/code/InsnList;->withRegisterOffset(I)Lcom/android/dx/rop/code/InsnList;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object v2, p0, Lcom/android/dx/rop/code/BasicBlock;->successors:Lcom/android/dx/util/IntList;

    .line 12
    .line 13
    iget p0, p0, Lcom/android/dx/rop/code/BasicBlock;->primarySuccessor:I

    .line 14
    .line 15
    invoke-direct {v0, v1, p1, v2, p0}, Lcom/android/dx/rop/code/BasicBlock;-><init>(ILcom/android/dx/rop/code/InsnList;Lcom/android/dx/util/IntList;I)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method
