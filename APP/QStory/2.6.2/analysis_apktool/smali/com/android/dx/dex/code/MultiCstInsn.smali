.class public final Lcom/android/dx/dex/code/MultiCstInsn;
.super Lcom/android/dx/dex/code/FixedSizeInsn;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field private static final NOT_SET:I = -0x1


# instance fields
.field private classIndex:I

.field private final constants:[Lcom/android/dx/rop/cst/Constant;

.field private final index:[I


# direct methods
.method public constructor <init>(Lcom/android/dx/dex/code/Dop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;[Lcom/android/dx/rop/cst/Constant;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/android/dx/dex/code/FixedSizeInsn;-><init>(Lcom/android/dx/dex/code/Dop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    if-eqz p4, :cond_2

    .line 6
    .line 7
    iput-object p4, p0, Lcom/android/dx/dex/code/MultiCstInsn;->constants:[Lcom/android/dx/rop/cst/Constant;

    .line 8
    .line 9
    array-length p2, p4

    .line 10
    new-array p2, p2, [I

    .line 11
    .line 12
    iput-object p2, p0, Lcom/android/dx/dex/code/MultiCstInsn;->index:[I

    .line 13
    .line 14
    const/4 p2, 0x0

    .line 15
    :goto_0
    iget-object p3, p0, Lcom/android/dx/dex/code/MultiCstInsn;->index:[I

    .line 16
    .line 17
    array-length v0, p3

    .line 18
    const/4 v1, -0x1

    .line 19
    if-ge p2, v0, :cond_1

    .line 20
    .line 21
    aget-object v0, p4, p2

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    aput v1, p3, p2

    .line 26
    .line 27
    add-int/lit8 p2, p2, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const-string p0, "constants[i] == null"

    .line 31
    .line 32
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw p1

    .line 36
    :cond_1
    iput v1, p0, Lcom/android/dx/dex/code/MultiCstInsn;->classIndex:I

    .line 37
    .line 38
    return-void

    .line 39
    :cond_2
    const-string p0, "constants == null"

    .line 40
    .line 41
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw p1
.end method

.method private constructor <init>(Lcom/android/dx/dex/code/Dop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;[Lcom/android/dx/rop/cst/Constant;[II)V
    .locals 0

    .line 45
    invoke-direct {p0, p1, p2, p3}, Lcom/android/dx/dex/code/FixedSizeInsn;-><init>(Lcom/android/dx/dex/code/Dop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 46
    iput-object p4, p0, Lcom/android/dx/dex/code/MultiCstInsn;->constants:[Lcom/android/dx/rop/cst/Constant;

    .line 47
    iput-object p5, p0, Lcom/android/dx/dex/code/MultiCstInsn;->index:[I

    .line 48
    iput p6, p0, Lcom/android/dx/dex/code/MultiCstInsn;->classIndex:I

    return-void
.end method


# virtual methods
.method public argString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    iget-object v2, p0, Lcom/android/dx/dex/code/MultiCstInsn;->constants:[Lcom/android/dx/rop/cst/Constant;

    .line 8
    .line 9
    array-length v2, v2

    .line 10
    if-ge v1, v2, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-lez v2, :cond_0

    .line 17
    .line 18
    const-string v2, ", "

    .line 19
    .line 20
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    :cond_0
    iget-object v2, p0, Lcom/android/dx/dex/code/MultiCstInsn;->constants:[Lcom/android/dx/rop/cst/Constant;

    .line 24
    .line 25
    aget-object v2, v2, v1

    .line 26
    .line 27
    invoke-interface {v2}, Lcom/android/dx/util/ToHuman;->toHuman()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    add-int/lit8 v1, v1, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0
.end method

.method public cstComment()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    iget-object v2, p0, Lcom/android/dx/dex/code/MultiCstInsn;->constants:[Lcom/android/dx/rop/cst/Constant;

    .line 8
    .line 9
    array-length v2, v2

    .line 10
    if-ge v1, v2, :cond_3

    .line 11
    .line 12
    invoke-virtual {p0, v1}, Lcom/android/dx/dex/code/MultiCstInsn;->hasIndex(I)Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-nez v2, :cond_0

    .line 17
    .line 18
    const-string p0, ""

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_0
    if-lez v1, :cond_1

    .line 22
    .line 23
    const-string v2, ", "

    .line 24
    .line 25
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    :cond_1
    invoke-virtual {p0, v1}, Lcom/android/dx/dex/code/MultiCstInsn;->getConstant(I)Lcom/android/dx/rop/cst/Constant;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v2}, Lcom/android/dx/rop/cst/Constant;->typeName()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const/16 v2, 0x40

    .line 40
    .line 41
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, v1}, Lcom/android/dx/dex/code/MultiCstInsn;->getIndex(I)I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    const/high16 v3, 0x10000

    .line 49
    .line 50
    if-ge v2, v3, :cond_2

    .line 51
    .line 52
    invoke-static {v2}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_2
    invoke-static {v2}, Lcom/android/dx/util/Hex;->u4(I)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    return-object p0
.end method

.method public cstString()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/dex/code/MultiCstInsn;->argString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getClassIndex()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/dex/code/MultiCstInsn;->hasClassIndex()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget p0, p0, Lcom/android/dx/dex/code/MultiCstInsn;->classIndex:I

    .line 8
    .line 9
    return p0

    .line 10
    :cond_0
    const-string p0, "class index not yet set"

    .line 11
    .line 12
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    return p0
.end method

.method public getConstant(I)Lcom/android/dx/rop/cst/Constant;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/code/MultiCstInsn;->constants:[Lcom/android/dx/rop/cst/Constant;

    .line 2
    .line 3
    aget-object p0, p0, p1

    .line 4
    .line 5
    return-object p0
.end method

.method public getIndex(I)I
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Lcom/android/dx/dex/code/MultiCstInsn;->hasIndex(I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lcom/android/dx/dex/code/MultiCstInsn;->index:[I

    .line 8
    .line 9
    aget p0, p0, p1

    .line 10
    .line 11
    return p0

    .line 12
    :cond_0
    const-string v0, "index not yet set for constant "

    .line 13
    .line 14
    const-string v1, " value = "

    .line 15
    .line 16
    invoke-static {p1, v0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲世苏(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget-object p0, p0, Lcom/android/dx/dex/code/MultiCstInsn;->constants:[Lcom/android/dx/rop/cst/Constant;

    .line 21
    .line 22
    aget-object p0, p0, p1

    .line 23
    .line 24
    invoke-static {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;Ljava/lang/StringBuilder;)V

    .line 25
    .line 26
    .line 27
    const/4 p0, 0x0

    .line 28
    return p0
.end method

.method public getNumberOfConstants()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/code/MultiCstInsn;->constants:[Lcom/android/dx/rop/cst/Constant;

    .line 2
    .line 3
    array-length p0, p0

    .line 4
    return p0
.end method

.method public hasClassIndex()Z
    .locals 1

    .line 1
    iget p0, p0, Lcom/android/dx/dex/code/MultiCstInsn;->classIndex:I

    .line 2
    .line 3
    const/4 v0, -0x1

    .line 4
    if-eq p0, v0, :cond_0

    .line 5
    .line 6
    const/4 p0, 0x1

    .line 7
    return p0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    return p0
.end method

.method public hasIndex(I)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/code/MultiCstInsn;->index:[I

    .line 2
    .line 3
    aget p0, p0, p1

    .line 4
    .line 5
    const/4 p1, -0x1

    .line 6
    if-eq p0, p1, :cond_0

    .line 7
    .line 8
    const/4 p0, 0x1

    .line 9
    return p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return p0
.end method

.method public setClassIndex(I)V
    .locals 1

    .line 1
    if-ltz p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/dex/code/MultiCstInsn;->hasClassIndex()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iput p1, p0, Lcom/android/dx/dex/code/MultiCstInsn;->classIndex:I

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const-string p0, "class index already set"

    .line 13
    .line 14
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    const-string p0, "index < 0"

    .line 19
    .line 20
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public setIndex(II)V
    .locals 1

    .line 1
    if-ltz p2, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/android/dx/dex/code/MultiCstInsn;->hasIndex(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Lcom/android/dx/dex/code/MultiCstInsn;->index:[I

    .line 10
    .line 11
    aput p2, p0, p1

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    const-string p0, "index already set"

    .line 15
    .line 16
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_1
    const-string p0, "index < 0"

    .line 21
    .line 22
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public withOpcode(Lcom/android/dx/dex/code/Dop;)Lcom/android/dx/dex/code/DalvInsn;
    .locals 7

    .line 1
    new-instance v0, Lcom/android/dx/dex/code/MultiCstInsn;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/dex/code/DalvInsn;->getPosition()Lcom/android/dx/rop/code/SourcePosition;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    invoke-virtual {p0}, Lcom/android/dx/dex/code/DalvInsn;->getRegisters()Lcom/android/dx/rop/code/RegisterSpecList;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    iget-object v4, p0, Lcom/android/dx/dex/code/MultiCstInsn;->constants:[Lcom/android/dx/rop/cst/Constant;

    .line 12
    .line 13
    iget-object v5, p0, Lcom/android/dx/dex/code/MultiCstInsn;->index:[I

    .line 14
    .line 15
    iget v6, p0, Lcom/android/dx/dex/code/MultiCstInsn;->classIndex:I

    .line 16
    .line 17
    move-object v1, p1

    .line 18
    invoke-direct/range {v0 .. v6}, Lcom/android/dx/dex/code/MultiCstInsn;-><init>(Lcom/android/dx/dex/code/Dop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;[Lcom/android/dx/rop/cst/Constant;[II)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public withRegisters(Lcom/android/dx/rop/code/RegisterSpecList;)Lcom/android/dx/dex/code/DalvInsn;
    .locals 7

    .line 1
    new-instance v0, Lcom/android/dx/dex/code/MultiCstInsn;

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
    iget-object v4, p0, Lcom/android/dx/dex/code/MultiCstInsn;->constants:[Lcom/android/dx/rop/cst/Constant;

    .line 12
    .line 13
    iget-object v5, p0, Lcom/android/dx/dex/code/MultiCstInsn;->index:[I

    .line 14
    .line 15
    iget v6, p0, Lcom/android/dx/dex/code/MultiCstInsn;->classIndex:I

    .line 16
    .line 17
    move-object v3, p1

    .line 18
    invoke-direct/range {v0 .. v6}, Lcom/android/dx/dex/code/MultiCstInsn;-><init>(Lcom/android/dx/dex/code/Dop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;[Lcom/android/dx/rop/cst/Constant;[II)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method
