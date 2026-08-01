.class public final Lcom/android/dx/dex/code/CstInsn;
.super Lcom/android/dx/dex/code/FixedSizeInsn;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field private classIndex:I

.field private final constant:Lcom/android/dx/rop/cst/Constant;

.field private index:I


# direct methods
.method public constructor <init>(Lcom/android/dx/dex/code/Dop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/cst/Constant;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/android/dx/dex/code/FixedSizeInsn;-><init>(Lcom/android/dx/dex/code/Dop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 2
    .line 3
    .line 4
    if-eqz p4, :cond_0

    .line 5
    .line 6
    iput-object p4, p0, Lcom/android/dx/dex/code/CstInsn;->constant:Lcom/android/dx/rop/cst/Constant;

    .line 7
    .line 8
    const/4 p1, -0x1

    .line 9
    iput p1, p0, Lcom/android/dx/dex/code/CstInsn;->index:I

    .line 10
    .line 11
    iput p1, p0, Lcom/android/dx/dex/code/CstInsn;->classIndex:I

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    const-string p0, "constant == null"

    .line 15
    .line 16
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    throw p0
.end method


# virtual methods
.method public argString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/code/CstInsn;->constant:Lcom/android/dx/rop/cst/Constant;

    .line 2
    .line 3
    invoke-interface {p0}, Lcom/android/dx/util/ToHuman;->toHuman()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public cstComment()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/dex/code/CstInsn;->hasIndex()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string p0, ""

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const/16 v1, 0x14

    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/android/dx/dex/code/CstInsn;->getConstant()Lcom/android/dx/rop/cst/Constant;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1}, Lcom/android/dx/rop/cst/Constant;->typeName()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const/16 v1, 0x40

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    iget p0, p0, Lcom/android/dx/dex/code/CstInsn;->index:I

    .line 34
    .line 35
    const/high16 v1, 0x10000

    .line 36
    .line 37
    if-ge p0, v1, :cond_1

    .line 38
    .line 39
    invoke-static {p0}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    invoke-static {p0}, Lcom/android/dx/util/Hex;->u4(I)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    :goto_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0
.end method

.method public cstString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/code/CstInsn;->constant:Lcom/android/dx/rop/cst/Constant;

    .line 2
    .line 3
    instance-of v0, p0, Lcom/android/dx/rop/cst/CstString;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p0, Lcom/android/dx/rop/cst/CstString;

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstString;->toQuoted()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    invoke-interface {p0}, Lcom/android/dx/util/ToHuman;->toHuman()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method

.method public getClassIndex()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/dex/code/CstInsn;->classIndex:I

    .line 2
    .line 3
    if-ltz p0, :cond_0

    .line 4
    .line 5
    return p0

    .line 6
    :cond_0
    const-string p0, "class index not yet set"

    .line 7
    .line 8
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public getConstant()Lcom/android/dx/rop/cst/Constant;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/code/CstInsn;->constant:Lcom/android/dx/rop/cst/Constant;

    .line 2
    .line 3
    return-object p0
.end method

.method public getIndex()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/android/dx/dex/code/CstInsn;->index:I

    .line 2
    .line 3
    if-ltz v0, :cond_0

    .line 4
    .line 5
    return v0

    .line 6
    :cond_0
    const-string v0, "index not yet set for "

    .line 7
    .line 8
    iget-object p0, p0, Lcom/android/dx/dex/code/CstInsn;->constant:Lcom/android/dx/rop/cst/Constant;

    .line 9
    .line 10
    invoke-static {p0, v0}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰哲世苏(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method public hasClassIndex()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/dex/code/CstInsn;->classIndex:I

    .line 2
    .line 3
    if-ltz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public hasIndex()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/dex/code/CstInsn;->index:I

    .line 2
    .line 3
    if-ltz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public setClassIndex(I)V
    .locals 1

    .line 1
    if-ltz p1, :cond_1

    .line 2
    .line 3
    iget v0, p0, Lcom/android/dx/dex/code/CstInsn;->classIndex:I

    .line 4
    .line 5
    if-gez v0, :cond_0

    .line 6
    .line 7
    iput p1, p0, Lcom/android/dx/dex/code/CstInsn;->classIndex:I

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const-string p0, "class index already set"

    .line 11
    .line 12
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_1
    const-string p0, "index < 0"

    .line 17
    .line 18
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public setIndex(I)V
    .locals 1

    .line 1
    if-ltz p1, :cond_1

    .line 2
    .line 3
    iget v0, p0, Lcom/android/dx/dex/code/CstInsn;->index:I

    .line 4
    .line 5
    if-gez v0, :cond_0

    .line 6
    .line 7
    iput p1, p0, Lcom/android/dx/dex/code/CstInsn;->index:I

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const-string p0, "index already set"

    .line 11
    .line 12
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_1
    const-string p0, "index < 0"

    .line 17
    .line 18
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public withOpcode(Lcom/android/dx/dex/code/Dop;)Lcom/android/dx/dex/code/DalvInsn;
    .locals 4

    .line 1
    new-instance v0, Lcom/android/dx/dex/code/CstInsn;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/dex/code/DalvInsn;->getPosition()Lcom/android/dx/rop/code/SourcePosition;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p0}, Lcom/android/dx/dex/code/DalvInsn;->getRegisters()Lcom/android/dx/rop/code/RegisterSpecList;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    iget-object v3, p0, Lcom/android/dx/dex/code/CstInsn;->constant:Lcom/android/dx/rop/cst/Constant;

    .line 12
    .line 13
    invoke-direct {v0, p1, v1, v2, v3}, Lcom/android/dx/dex/code/CstInsn;-><init>(Lcom/android/dx/dex/code/Dop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/cst/Constant;)V

    .line 14
    .line 15
    .line 16
    iget p1, p0, Lcom/android/dx/dex/code/CstInsn;->index:I

    .line 17
    .line 18
    if-ltz p1, :cond_0

    .line 19
    .line 20
    invoke-virtual {v0, p1}, Lcom/android/dx/dex/code/CstInsn;->setIndex(I)V

    .line 21
    .line 22
    .line 23
    :cond_0
    iget p0, p0, Lcom/android/dx/dex/code/CstInsn;->classIndex:I

    .line 24
    .line 25
    if-ltz p0, :cond_1

    .line 26
    .line 27
    invoke-virtual {v0, p0}, Lcom/android/dx/dex/code/CstInsn;->setClassIndex(I)V

    .line 28
    .line 29
    .line 30
    :cond_1
    return-object v0
.end method

.method public withRegisters(Lcom/android/dx/rop/code/RegisterSpecList;)Lcom/android/dx/dex/code/DalvInsn;
    .locals 4

    .line 1
    new-instance v0, Lcom/android/dx/dex/code/CstInsn;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/dex/code/DalvInsn;->getOpcode()Lcom/android/dx/dex/code/Dop;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p0}, Lcom/android/dx/dex/code/DalvInsn;->getPosition()Lcom/android/dx/rop/code/SourcePosition;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    iget-object v3, p0, Lcom/android/dx/dex/code/CstInsn;->constant:Lcom/android/dx/rop/cst/Constant;

    .line 12
    .line 13
    invoke-direct {v0, v1, v2, p1, v3}, Lcom/android/dx/dex/code/CstInsn;-><init>(Lcom/android/dx/dex/code/Dop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/cst/Constant;)V

    .line 14
    .line 15
    .line 16
    iget p1, p0, Lcom/android/dx/dex/code/CstInsn;->index:I

    .line 17
    .line 18
    if-ltz p1, :cond_0

    .line 19
    .line 20
    invoke-virtual {v0, p1}, Lcom/android/dx/dex/code/CstInsn;->setIndex(I)V

    .line 21
    .line 22
    .line 23
    :cond_0
    iget p0, p0, Lcom/android/dx/dex/code/CstInsn;->classIndex:I

    .line 24
    .line 25
    if-ltz p0, :cond_1

    .line 26
    .line 27
    invoke-virtual {v0, p0}, Lcom/android/dx/dex/code/CstInsn;->setClassIndex(I)V

    .line 28
    .line 29
    .line 30
    :cond_1
    return-object v0
.end method
