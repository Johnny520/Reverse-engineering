.class public final Lcom/android/dx/rop/code/SwitchInsn;
.super Lcom/android/dx/rop/code/Insn;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field private final cases:Lcom/android/dx/util/IntList;


# direct methods
.method public constructor <init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/util/IntList;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/android/dx/rop/code/Insn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lcom/android/dx/rop/code/Rop;->getBranchingness()I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    const/4 p2, 0x5

    .line 9
    const/4 p3, 0x0

    .line 10
    if-ne p1, p2, :cond_1

    .line 11
    .line 12
    if-eqz p5, :cond_0

    .line 13
    .line 14
    iput-object p5, p0, Lcom/android/dx/rop/code/SwitchInsn;->cases:Lcom/android/dx/util/IntList;

    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    const-string p0, "cases == null"

    .line 18
    .line 19
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw p3

    .line 23
    :cond_1
    const-string p0, "bogus branchingness"

    .line 24
    .line 25
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p3
.end method


# virtual methods
.method public accept(Lcom/android/dx/rop/code/Insn$Visitor;)V
    .locals 0

    .line 1
    invoke-interface {p1, p0}, Lcom/android/dx/rop/code/Insn$Visitor;->visitSwitchInsn(Lcom/android/dx/rop/code/SwitchInsn;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public contentEquals(Lcom/android/dx/rop/code/Insn;)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public getCases()Lcom/android/dx/util/IntList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/code/SwitchInsn;->cases:Lcom/android/dx/util/IntList;

    .line 2
    .line 3
    return-object p0
.end method

.method public getCatches()Lcom/android/dx/rop/type/TypeList;
    .locals 0

    .line 1
    sget-object p0, Lcom/android/dx/rop/type/StdTypeList;->EMPTY:Lcom/android/dx/rop/type/StdTypeList;

    .line 2
    .line 3
    return-object p0
.end method

.method public getInlineString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/code/SwitchInsn;->cases:Lcom/android/dx/util/IntList;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/util/IntList;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public withAddedCatch(Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/code/Insn;
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string p1, "unsupported"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public withNewRegisters(Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;)Lcom/android/dx/rop/code/Insn;
    .locals 6

    .line 1
    new-instance v0, Lcom/android/dx/rop/code/SwitchInsn;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/rop/code/Insn;->getOpcode()Lcom/android/dx/rop/code/Rop;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p0}, Lcom/android/dx/rop/code/Insn;->getPosition()Lcom/android/dx/rop/code/SourcePosition;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    iget-object v5, p0, Lcom/android/dx/rop/code/SwitchInsn;->cases:Lcom/android/dx/util/IntList;

    .line 12
    .line 13
    move-object v3, p1

    .line 14
    move-object v4, p2

    .line 15
    invoke-direct/range {v0 .. v5}, Lcom/android/dx/rop/code/SwitchInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/util/IntList;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public withRegisterOffset(I)Lcom/android/dx/rop/code/Insn;
    .locals 6

    .line 1
    new-instance v0, Lcom/android/dx/rop/code/SwitchInsn;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/rop/code/Insn;->getOpcode()Lcom/android/dx/rop/code/Rop;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p0}, Lcom/android/dx/rop/code/Insn;->getPosition()Lcom/android/dx/rop/code/SourcePosition;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {p0}, Lcom/android/dx/rop/code/Insn;->getResult()Lcom/android/dx/rop/code/RegisterSpec;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    invoke-virtual {v3, p1}, Lcom/android/dx/rop/code/RegisterSpec;->withOffset(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-virtual {p0}, Lcom/android/dx/rop/code/Insn;->getSources()Lcom/android/dx/rop/code/RegisterSpecList;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-virtual {v4, p1}, Lcom/android/dx/rop/code/RegisterSpecList;->withOffset(I)Lcom/android/dx/rop/code/RegisterSpecList;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    iget-object v5, p0, Lcom/android/dx/rop/code/SwitchInsn;->cases:Lcom/android/dx/util/IntList;

    .line 28
    .line 29
    invoke-direct/range {v0 .. v5}, Lcom/android/dx/rop/code/SwitchInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/util/IntList;)V

    .line 30
    .line 31
    .line 32
    return-object v0
.end method
