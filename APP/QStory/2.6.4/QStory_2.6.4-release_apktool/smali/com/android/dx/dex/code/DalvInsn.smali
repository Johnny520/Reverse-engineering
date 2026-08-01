.class public abstract Lcom/android/dx/dex/code/DalvInsn;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field private address:I

.field private final opcode:Lcom/android/dx/dex/code/Dop;

.field private final position:Lcom/android/dx/rop/code/SourcePosition;

.field private final registers:Lcom/android/dx/rop/code/RegisterSpecList;


# direct methods
.method public constructor <init>(Lcom/android/dx/dex/code/Dop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;)V
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
    const/4 v0, -0x1

    .line 12
    iput v0, p0, Lcom/android/dx/dex/code/DalvInsn;->address:I

    .line 13
    .line 14
    iput-object p1, p0, Lcom/android/dx/dex/code/DalvInsn;->opcode:Lcom/android/dx/dex/code/Dop;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/android/dx/dex/code/DalvInsn;->position:Lcom/android/dx/rop/code/SourcePosition;

    .line 17
    .line 18
    iput-object p3, p0, Lcom/android/dx/dex/code/DalvInsn;->registers:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    const-string p0, "registers == null"

    .line 22
    .line 23
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw v0

    .line 27
    :cond_1
    const-string p0, "position == null"

    .line 28
    .line 29
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw v0

    .line 33
    :cond_2
    const-string p0, "opcode == null"

    .line 34
    .line 35
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw v0
.end method

.method public static makeMove(Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpec;)Lcom/android/dx/dex/code/SimpleInsn;
    .locals 5

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/rop/code/RegisterSpec;->getCategory()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v1, 0x0

    .line 10
    :goto_0
    invoke-virtual {p1}, Lcom/android/dx/rop/code/RegisterSpec;->getType()Lcom/android/dx/rop/type/Type;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Lcom/android/dx/rop/type/Type;->isReference()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-virtual {p1}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    invoke-virtual {p2}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    or-int/2addr v3, v2

    .line 27
    const/16 v4, 0x10

    .line 28
    .line 29
    if-ge v3, v4, :cond_3

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    sget-object v0, Lcom/android/dx/dex/code/Dops;->MOVE_OBJECT:Lcom/android/dx/dex/code/Dop;

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    if-eqz v1, :cond_2

    .line 37
    .line 38
    sget-object v0, Lcom/android/dx/dex/code/Dops;->MOVE:Lcom/android/dx/dex/code/Dop;

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_2
    sget-object v0, Lcom/android/dx/dex/code/Dops;->MOVE_WIDE:Lcom/android/dx/dex/code/Dop;

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_3
    const/16 v3, 0x100

    .line 45
    .line 46
    if-ge v2, v3, :cond_6

    .line 47
    .line 48
    if-eqz v0, :cond_4

    .line 49
    .line 50
    sget-object v0, Lcom/android/dx/dex/code/Dops;->MOVE_OBJECT_FROM16:Lcom/android/dx/dex/code/Dop;

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_4
    if-eqz v1, :cond_5

    .line 54
    .line 55
    sget-object v0, Lcom/android/dx/dex/code/Dops;->MOVE_FROM16:Lcom/android/dx/dex/code/Dop;

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_5
    sget-object v0, Lcom/android/dx/dex/code/Dops;->MOVE_WIDE_FROM16:Lcom/android/dx/dex/code/Dop;

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_6
    if-eqz v0, :cond_7

    .line 62
    .line 63
    sget-object v0, Lcom/android/dx/dex/code/Dops;->MOVE_OBJECT_16:Lcom/android/dx/dex/code/Dop;

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_7
    if-eqz v1, :cond_8

    .line 67
    .line 68
    sget-object v0, Lcom/android/dx/dex/code/Dops;->MOVE_16:Lcom/android/dx/dex/code/Dop;

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_8
    sget-object v0, Lcom/android/dx/dex/code/Dops;->MOVE_WIDE_16:Lcom/android/dx/dex/code/Dop;

    .line 72
    .line 73
    :goto_1
    new-instance v1, Lcom/android/dx/dex/code/SimpleInsn;

    .line 74
    .line 75
    invoke-static {p1, p2}, Lcom/android/dx/rop/code/RegisterSpecList;->make(Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpec;)Lcom/android/dx/rop/code/RegisterSpecList;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-direct {v1, v0, p0, p1}, Lcom/android/dx/dex/code/SimpleInsn;-><init>(Lcom/android/dx/dex/code/Dop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 80
    .line 81
    .line 82
    return-object v1
.end method


# virtual methods
.method public abstract argString()Ljava/lang/String;
.end method

.method public abstract codeSize()I
.end method

.method public cstComment()Ljava/lang/String;
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v0, "Not supported."

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public cstString()Ljava/lang/String;
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v0, "Not supported."

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public expandedPrefix(Ljava/util/BitSet;)Lcom/android/dx/dex/code/DalvInsn;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/android/dx/dex/code/DalvInsn;->registers:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p1, v1}, Ljava/util/BitSet;->get(I)Z

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    invoke-virtual {p0}, Lcom/android/dx/dex/code/DalvInsn;->hasResult()Z

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    if-eqz v3, :cond_0

    .line 13
    .line 14
    invoke-virtual {p1, v1}, Ljava/util/BitSet;->set(I)V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {v0, p1}, Lcom/android/dx/rop/code/RegisterSpecList;->subset(Ljava/util/BitSet;)Lcom/android/dx/rop/code/RegisterSpecList;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {p0}, Lcom/android/dx/dex/code/DalvInsn;->hasResult()Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_1

    .line 26
    .line 27
    invoke-virtual {p1, v1, v2}, Ljava/util/BitSet;->set(IZ)V

    .line 28
    .line 29
    .line 30
    :cond_1
    invoke-virtual {v0}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-nez p1, :cond_2

    .line 35
    .line 36
    const/4 p0, 0x0

    .line 37
    return-object p0

    .line 38
    :cond_2
    new-instance p1, Lcom/android/dx/dex/code/HighRegisterPrefix;

    .line 39
    .line 40
    iget-object p0, p0, Lcom/android/dx/dex/code/DalvInsn;->position:Lcom/android/dx/rop/code/SourcePosition;

    .line 41
    .line 42
    invoke-direct {p1, p0, v0}, Lcom/android/dx/dex/code/HighRegisterPrefix;-><init>(Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 43
    .line 44
    .line 45
    return-object p1
.end method

.method public expandedSuffix(Ljava/util/BitSet;)Lcom/android/dx/dex/code/DalvInsn;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/dex/code/DalvInsn;->hasResult()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p1, v0}, Ljava/util/BitSet;->get(I)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    iget-object p1, p0, Lcom/android/dx/dex/code/DalvInsn;->registers:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget-object p0, p0, Lcom/android/dx/dex/code/DalvInsn;->position:Lcom/android/dx/rop/code/SourcePosition;

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Lcom/android/dx/rop/code/RegisterSpec;->withReg(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {p0, p1, v0}, Lcom/android/dx/dex/code/DalvInsn;->makeMove(Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpec;)Lcom/android/dx/dex/code/SimpleInsn;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :cond_0
    const/4 p0, 0x0

    .line 32
    return-object p0
.end method

.method public expandedVersion(Ljava/util/BitSet;)Lcom/android/dx/dex/code/DalvInsn;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/android/dx/dex/code/DalvInsn;->registers:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0}, Lcom/android/dx/dex/code/DalvInsn;->hasResult()Z

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    invoke-virtual {v0, v1, v2, p1}, Lcom/android/dx/rop/code/RegisterSpecList;->withExpandedRegisters(IZLjava/util/BitSet;)Lcom/android/dx/rop/code/RegisterSpecList;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p0, p1}, Lcom/android/dx/dex/code/DalvInsn;->withRegisters(Lcom/android/dx/rop/code/RegisterSpecList;)Lcom/android/dx/dex/code/DalvInsn;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public final getAddress()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/dex/code/DalvInsn;->address:I

    .line 2
    .line 3
    if-ltz p0, :cond_0

    .line 4
    .line 5
    return p0

    .line 6
    :cond_0
    const-string p0, "address not yet known"

    .line 7
    .line 8
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public getLowRegVersion()Lcom/android/dx/dex/code/DalvInsn;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/android/dx/dex/code/DalvInsn;->registers:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/dex/code/DalvInsn;->hasResult()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    invoke-virtual {v0, v3, v1, v2}, Lcom/android/dx/rop/code/RegisterSpecList;->withExpandedRegisters(IZLjava/util/BitSet;)Lcom/android/dx/rop/code/RegisterSpecList;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p0, v0}, Lcom/android/dx/dex/code/DalvInsn;->withRegisters(Lcom/android/dx/rop/code/RegisterSpecList;)Lcom/android/dx/dex/code/DalvInsn;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final getMinimumRegisterRequirement(Ljava/util/BitSet;)I
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/dex/code/DalvInsn;->hasResult()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lcom/android/dx/dex/code/DalvInsn;->registers:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p1, v2}, Ljava/util/BitSet;->get(I)Z

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    if-nez v3, :cond_0

    .line 19
    .line 20
    iget-object v3, p0, Lcom/android/dx/dex/code/DalvInsn;->registers:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 21
    .line 22
    invoke-virtual {v3, v2}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v3}, Lcom/android/dx/rop/code/RegisterSpec;->getCategory()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move v3, v2

    .line 32
    :goto_0
    if-ge v0, v1, :cond_2

    .line 33
    .line 34
    invoke-virtual {p1, v0}, Ljava/util/BitSet;->get(I)Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-nez v4, :cond_1

    .line 39
    .line 40
    iget-object v4, p0, Lcom/android/dx/dex/code/DalvInsn;->registers:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 41
    .line 42
    invoke-virtual {v4, v0}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    invoke-virtual {v4}, Lcom/android/dx/rop/code/RegisterSpec;->getCategory()I

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    add-int/2addr v4, v2

    .line 51
    move v2, v4

    .line 52
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    return p0
.end method

.method public final getNextAddress()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/dex/code/DalvInsn;->getAddress()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Lcom/android/dx/dex/code/DalvInsn;->codeSize()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    add-int/2addr p0, v0

    .line 10
    return p0
.end method

.method public final getOpcode()Lcom/android/dx/dex/code/Dop;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/code/DalvInsn;->opcode:Lcom/android/dx/dex/code/Dop;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getPosition()Lcom/android/dx/rop/code/SourcePosition;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/code/DalvInsn;->position:Lcom/android/dx/rop/code/SourcePosition;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getRegisters()Lcom/android/dx/rop/code/RegisterSpecList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/code/DalvInsn;->registers:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 2
    .line 3
    return-object p0
.end method

.method public final hasAddress()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/dex/code/DalvInsn;->address:I

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

.method public final hasResult()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/code/DalvInsn;->opcode:Lcom/android/dx/dex/code/Dop;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/dex/code/Dop;->hasResult()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final identifierString()Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, Lcom/android/dx/dex/code/DalvInsn;->address:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    const-string v0, "%04x"

    .line 15
    .line 16
    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :cond_0
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    invoke-static {p0}, Lcom/android/dx/util/Hex;->u4(I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method

.method public final listingString(Ljava/lang/String;IZ)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0, p3}, Lcom/android/dx/dex/code/DalvInsn;->listingString0(Z)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    if-nez p3, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return-object p0

    .line 9
    :cond_0
    invoke-static {p1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子世楪苏哲兰(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p0}, Lcom/android/dx/dex/code/DalvInsn;->identifierString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string p0, ": "

    .line 21
    .line 22
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-nez p2, :cond_1

    .line 34
    .line 35
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    sub-int/2addr p2, p1

    .line 41
    :goto_0
    const-string v0, ""

    .line 42
    .line 43
    invoke-static {p0, p1, v0, p3, p2}, Lcom/android/dx/util/TwoColumnOutput;->toString(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0
.end method

.method public abstract listingString0(Z)Ljava/lang/String;
.end method

.method public final setAddress(I)V
    .locals 0

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    iput p1, p0, Lcom/android/dx/dex/code/DalvInsn;->address:I

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const-string p0, "address < 0"

    .line 7
    .line 8
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x64

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/android/dx/dex/code/DalvInsn;->identifierString()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const/16 v1, 0x20

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget-object v2, p0, Lcom/android/dx/dex/code/DalvInsn;->position:Lcom/android/dx/rop/code/SourcePosition;

    .line 21
    .line 22
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v2, ": "

    .line 26
    .line 27
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget-object v2, p0, Lcom/android/dx/dex/code/DalvInsn;->opcode:Lcom/android/dx/dex/code/Dop;

    .line 31
    .line 32
    invoke-virtual {v2}, Lcom/android/dx/dex/code/Dop;->getName()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    iget-object v2, p0, Lcom/android/dx/dex/code/DalvInsn;->registers:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 40
    .line 41
    invoke-virtual {v2}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_0

    .line 46
    .line 47
    iget-object v2, p0, Lcom/android/dx/dex/code/DalvInsn;->registers:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 48
    .line 49
    const-string v3, ", "

    .line 50
    .line 51
    const/4 v4, 0x0

    .line 52
    const-string v5, " "

    .line 53
    .line 54
    invoke-virtual {v2, v5, v3, v4}, Lcom/android/dx/util/FixedSizeList;->toHuman(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const/4 v2, 0x1

    .line 62
    goto :goto_0

    .line 63
    :cond_0
    const/4 v2, 0x0

    .line 64
    :goto_0
    invoke-virtual {p0}, Lcom/android/dx/dex/code/DalvInsn;->argString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    if-eqz p0, :cond_2

    .line 69
    .line 70
    if-eqz v2, :cond_1

    .line 71
    .line 72
    const/16 v2, 0x2c

    .line 73
    .line 74
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    :cond_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    return-object p0
.end method

.method public withMapper(Lcom/android/dx/ssa/RegisterMapper;)Lcom/android/dx/dex/code/DalvInsn;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/dex/code/DalvInsn;->getRegisters()Lcom/android/dx/rop/code/RegisterSpecList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1, v0}, Lcom/android/dx/ssa/RegisterMapper;->map(Lcom/android/dx/rop/code/RegisterSpecList;)Lcom/android/dx/rop/code/RegisterSpecList;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lcom/android/dx/dex/code/DalvInsn;->withRegisters(Lcom/android/dx/rop/code/RegisterSpecList;)Lcom/android/dx/dex/code/DalvInsn;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public abstract withOpcode(Lcom/android/dx/dex/code/Dop;)Lcom/android/dx/dex/code/DalvInsn;
.end method

.method public abstract withRegisterOffset(I)Lcom/android/dx/dex/code/DalvInsn;
.end method

.method public abstract withRegisters(Lcom/android/dx/rop/code/RegisterSpecList;)Lcom/android/dx/dex/code/DalvInsn;
.end method

.method public abstract writeTo(Lcom/android/dx/util/AnnotatedOutput;)V
.end method
