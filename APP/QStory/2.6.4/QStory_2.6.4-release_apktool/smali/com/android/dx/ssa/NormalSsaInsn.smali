.class public final Lcom/android/dx/ssa/NormalSsaInsn;
.super Lcom/android/dx/ssa/SsaInsn;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field private insn:Lcom/android/dx/rop/code/Insn;


# direct methods
.method public constructor <init>(Lcom/android/dx/rop/code/Insn;Lcom/android/dx/ssa/SsaBasicBlock;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/rop/code/Insn;->getResult()Lcom/android/dx/rop/code/RegisterSpec;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0, v0, p2}, Lcom/android/dx/ssa/SsaInsn;-><init>(Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/ssa/SsaBasicBlock;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lcom/android/dx/ssa/NormalSsaInsn;->insn:Lcom/android/dx/rop/code/Insn;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public accept(Lcom/android/dx/ssa/SsaInsn$Visitor;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/ssa/NormalSsaInsn;->isNormalMoveInsn()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {p1, p0}, Lcom/android/dx/ssa/SsaInsn$Visitor;->visitMoveInsn(Lcom/android/dx/ssa/NormalSsaInsn;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-interface {p1, p0}, Lcom/android/dx/ssa/SsaInsn$Visitor;->visitNonMoveInsn(Lcom/android/dx/ssa/NormalSsaInsn;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public canThrow()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/ssa/NormalSsaInsn;->insn:Lcom/android/dx/rop/code/Insn;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/rop/code/Insn;->canThrow()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final changeOneSource(ILcom/android/dx/rop/code/RegisterSpec;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/android/dx/ssa/NormalSsaInsn;->insn:Lcom/android/dx/rop/code/Insn;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/dx/rop/code/Insn;->getSources()Lcom/android/dx/rop/code/RegisterSpecList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    new-instance v2, Lcom/android/dx/rop/code/RegisterSpecList;

    .line 12
    .line 13
    invoke-direct {v2, v1}, Lcom/android/dx/rop/code/RegisterSpecList;-><init>(I)V

    .line 14
    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    :goto_0
    if-ge v3, v1, :cond_1

    .line 18
    .line 19
    if-ne v3, p1, :cond_0

    .line 20
    .line 21
    move-object v4, p2

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    invoke-virtual {v0, v3}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    :goto_1
    invoke-virtual {v2, v3, v4}, Lcom/android/dx/rop/code/RegisterSpecList;->set(ILcom/android/dx/rop/code/RegisterSpec;)V

    .line 28
    .line 29
    .line 30
    add-int/lit8 v3, v3, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    invoke-virtual {v2}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, p1}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p1}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    invoke-virtual {p2}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eq v0, v1, :cond_2

    .line 49
    .line 50
    invoke-virtual {p0}, Lcom/android/dx/ssa/SsaInsn;->getBlock()Lcom/android/dx/ssa/SsaBasicBlock;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0}, Lcom/android/dx/ssa/SsaBasicBlock;->getParent()Lcom/android/dx/ssa/SsaMethod;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v0, p0, p1, p2}, Lcom/android/dx/ssa/SsaMethod;->onSourceChanged(Lcom/android/dx/ssa/SsaInsn;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpec;)V

    .line 59
    .line 60
    .line 61
    :cond_2
    iget-object p1, p0, Lcom/android/dx/ssa/NormalSsaInsn;->insn:Lcom/android/dx/rop/code/Insn;

    .line 62
    .line 63
    invoke-virtual {p0}, Lcom/android/dx/ssa/SsaInsn;->getResult()Lcom/android/dx/rop/code/RegisterSpec;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    invoke-virtual {p1, p2, v2}, Lcom/android/dx/rop/code/Insn;->withNewRegisters(Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;)Lcom/android/dx/rop/code/Insn;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    iput-object p1, p0, Lcom/android/dx/ssa/NormalSsaInsn;->insn:Lcom/android/dx/rop/code/Insn;

    .line 72
    .line 73
    return-void
.end method

.method public clone()Lcom/android/dx/ssa/NormalSsaInsn;
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/android/dx/ssa/SsaInsn;->clone()Lcom/android/dx/ssa/SsaInsn;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/android/dx/ssa/NormalSsaInsn;

    .line 6
    .line 7
    return-object p0
.end method

.method public bridge synthetic clone()Lcom/android/dx/ssa/SsaInsn;
    .locals 0

    .line 9
    invoke-virtual {p0}, Lcom/android/dx/ssa/NormalSsaInsn;->clone()Lcom/android/dx/ssa/NormalSsaInsn;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 0

    .line 8
    invoke-virtual {p0}, Lcom/android/dx/ssa/NormalSsaInsn;->clone()Lcom/android/dx/ssa/NormalSsaInsn;

    move-result-object p0

    return-object p0
.end method

.method public getLocalAssignment()Lcom/android/dx/rop/code/RegisterSpec;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/android/dx/ssa/NormalSsaInsn;->insn:Lcom/android/dx/rop/code/Insn;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/dx/rop/code/Insn;->getOpcode()Lcom/android/dx/rop/code/Rop;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/android/dx/rop/code/Rop;->getOpcode()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/16 v1, 0x36

    .line 12
    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    iget-object p0, p0, Lcom/android/dx/ssa/NormalSsaInsn;->insn:Lcom/android/dx/rop/code/Insn;

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/android/dx/rop/code/Insn;->getSources()Lcom/android/dx/rop/code/RegisterSpecList;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const/4 v0, 0x0

    .line 22
    invoke-virtual {p0, v0}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-virtual {p0}, Lcom/android/dx/ssa/SsaInsn;->getResult()Lcom/android/dx/rop/code/RegisterSpec;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    :goto_0
    const/4 v0, 0x0

    .line 32
    if-nez p0, :cond_1

    .line 33
    .line 34
    return-object v0

    .line 35
    :cond_1
    invoke-virtual {p0}, Lcom/android/dx/rop/code/RegisterSpec;->getLocalItem()Lcom/android/dx/rop/code/LocalItem;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    if-nez v1, :cond_2

    .line 40
    .line 41
    return-object v0

    .line 42
    :cond_2
    return-object p0
.end method

.method public getOpcode()Lcom/android/dx/rop/code/Rop;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/ssa/NormalSsaInsn;->insn:Lcom/android/dx/rop/code/Insn;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/rop/code/Insn;->getOpcode()Lcom/android/dx/rop/code/Rop;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getOriginalRopInsn()Lcom/android/dx/rop/code/Insn;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/ssa/NormalSsaInsn;->insn:Lcom/android/dx/rop/code/Insn;

    .line 2
    .line 3
    return-object p0
.end method

.method public getSources()Lcom/android/dx/rop/code/RegisterSpecList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/ssa/NormalSsaInsn;->insn:Lcom/android/dx/rop/code/Insn;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/rop/code/Insn;->getSources()Lcom/android/dx/rop/code/RegisterSpecList;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public hasSideEffect()Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/ssa/NormalSsaInsn;->getOpcode()Lcom/android/dx/rop/code/Rop;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/android/dx/rop/code/Rop;->getBranchingness()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    if-eq v1, v2, :cond_0

    .line 11
    .line 12
    return v2

    .line 13
    :cond_0
    invoke-static {}, Lcom/android/dx/ssa/Optimizer;->getPreserveLocals()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/android/dx/ssa/NormalSsaInsn;->getLocalAssignment()Lcom/android/dx/rop/code/RegisterSpec;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    if-eqz p0, :cond_1

    .line 24
    .line 25
    move p0, v2

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/4 p0, 0x0

    .line 28
    :goto_0
    invoke-virtual {v0}, Lcom/android/dx/rop/code/Rop;->getOpcode()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    const/4 v1, 0x2

    .line 33
    if-eq v0, v1, :cond_2

    .line 34
    .line 35
    const/4 v1, 0x5

    .line 36
    if-eq v0, v1, :cond_2

    .line 37
    .line 38
    const/16 v1, 0x37

    .line 39
    .line 40
    if-eq v0, v1, :cond_2

    .line 41
    .line 42
    return v2

    .line 43
    :cond_2
    return p0
.end method

.method public isMoveException()Z
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/android/dx/ssa/NormalSsaInsn;->insn:Lcom/android/dx/rop/code/Insn;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/rop/code/Insn;->getOpcode()Lcom/android/dx/rop/code/Rop;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Lcom/android/dx/rop/code/Rop;->getOpcode()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    const/4 v0, 0x4

    .line 12
    if-ne p0, v0, :cond_0

    .line 13
    .line 14
    const/4 p0, 0x1

    .line 15
    return p0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return p0
.end method

.method public isNormalMoveInsn()Z
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/android/dx/ssa/NormalSsaInsn;->insn:Lcom/android/dx/rop/code/Insn;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/rop/code/Insn;->getOpcode()Lcom/android/dx/rop/code/Rop;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Lcom/android/dx/rop/code/Rop;->getOpcode()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    const/4 v0, 0x2

    .line 12
    if-ne p0, v0, :cond_0

    .line 13
    .line 14
    const/4 p0, 0x1

    .line 15
    return p0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return p0
.end method

.method public isPhiOrMove()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/ssa/NormalSsaInsn;->isNormalMoveInsn()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final mapSourceRegisters(Lcom/android/dx/ssa/RegisterMapper;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/android/dx/ssa/NormalSsaInsn;->insn:Lcom/android/dx/rop/code/Insn;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/dx/rop/code/Insn;->getSources()Lcom/android/dx/rop/code/RegisterSpecList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p1, v0}, Lcom/android/dx/ssa/RegisterMapper;->map(Lcom/android/dx/rop/code/RegisterSpecList;)Lcom/android/dx/rop/code/RegisterSpecList;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    if-eq p1, v0, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, Lcom/android/dx/ssa/NormalSsaInsn;->insn:Lcom/android/dx/rop/code/Insn;

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/android/dx/ssa/SsaInsn;->getResult()Lcom/android/dx/rop/code/RegisterSpec;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v1, v2, p1}, Lcom/android/dx/rop/code/Insn;->withNewRegisters(Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;)Lcom/android/dx/rop/code/Insn;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, p0, Lcom/android/dx/ssa/NormalSsaInsn;->insn:Lcom/android/dx/rop/code/Insn;

    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/android/dx/ssa/SsaInsn;->getBlock()Lcom/android/dx/ssa/SsaBasicBlock;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaBasicBlock;->getParent()Lcom/android/dx/ssa/SsaMethod;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p1, p0, v0}, Lcom/android/dx/ssa/SsaMethod;->onSourcesChanged(Lcom/android/dx/ssa/SsaInsn;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    return-void
.end method

.method public final setNewSources(Lcom/android/dx/rop/code/RegisterSpecList;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/android/dx/ssa/NormalSsaInsn;->insn:Lcom/android/dx/rop/code/Insn;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/dx/rop/code/Insn;->getSources()Lcom/android/dx/rop/code/RegisterSpecList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-virtual {p1}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Lcom/android/dx/ssa/NormalSsaInsn;->insn:Lcom/android/dx/rop/code/Insn;

    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/android/dx/ssa/SsaInsn;->getResult()Lcom/android/dx/rop/code/RegisterSpec;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v0, v1, p1}, Lcom/android/dx/rop/code/Insn;->withNewRegisters(Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;)Lcom/android/dx/rop/code/Insn;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, Lcom/android/dx/ssa/NormalSsaInsn;->insn:Lcom/android/dx/rop/code/Insn;

    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    const-string p0, "Sources counts don\'t match"

    .line 31
    .line 32
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public toHuman()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/ssa/NormalSsaInsn;->toRopInsn()Lcom/android/dx/rop/code/Insn;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/android/dx/rop/code/Insn;->toHuman()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public toRopInsn()Lcom/android/dx/rop/code/Insn;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/android/dx/ssa/NormalSsaInsn;->insn:Lcom/android/dx/rop/code/Insn;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/ssa/SsaInsn;->getResult()Lcom/android/dx/rop/code/RegisterSpec;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object p0, p0, Lcom/android/dx/ssa/NormalSsaInsn;->insn:Lcom/android/dx/rop/code/Insn;

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/android/dx/rop/code/Insn;->getSources()Lcom/android/dx/rop/code/RegisterSpecList;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {v0, v1, p0}, Lcom/android/dx/rop/code/Insn;->withNewRegisters(Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;)Lcom/android/dx/rop/code/Insn;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public upgradeToLiteral()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/android/dx/ssa/NormalSsaInsn;->insn:Lcom/android/dx/rop/code/Insn;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/dx/rop/code/Insn;->getSources()Lcom/android/dx/rop/code/RegisterSpecList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/android/dx/ssa/NormalSsaInsn;->insn:Lcom/android/dx/rop/code/Insn;

    .line 8
    .line 9
    invoke-virtual {v1}, Lcom/android/dx/rop/code/Insn;->withSourceLiteral()Lcom/android/dx/rop/code/Insn;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iput-object v1, p0, Lcom/android/dx/ssa/NormalSsaInsn;->insn:Lcom/android/dx/rop/code/Insn;

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/android/dx/ssa/SsaInsn;->getBlock()Lcom/android/dx/ssa/SsaBasicBlock;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1}, Lcom/android/dx/ssa/SsaBasicBlock;->getParent()Lcom/android/dx/ssa/SsaMethod;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v1, p0, v0}, Lcom/android/dx/ssa/SsaMethod;->onSourcesChanged(Lcom/android/dx/ssa/SsaInsn;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method
