.class public abstract Lcom/android/dx/dex/code/InsnFormat;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final ALLOW_EXTENDED_OPCODES:Z = true


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static argIndex(Lcom/android/dx/dex/code/DalvInsn;)I
    .locals 0

    .line 1
    check-cast p0, Lcom/android/dx/dex/code/CstInsn;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/dex/code/CstInsn;->getConstant()Lcom/android/dx/rop/cst/Constant;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/android/dx/rop/cst/CstInteger;

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstInteger;->getValue()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-ltz p0, :cond_0

    .line 14
    .line 15
    return p0

    .line 16
    :cond_0
    const-string p0, "bogus insn"

    .line 17
    .line 18
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    return p0
.end method

.method public static branchComment(Lcom/android/dx/dex/code/DalvInsn;)Ljava/lang/String;
    .locals 1

    .line 1
    check-cast p0, Lcom/android/dx/dex/code/TargetInsn;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/dex/code/TargetInsn;->getTargetOffset()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    int-to-short v0, p0

    .line 8
    if-ne p0, v0, :cond_0

    .line 9
    .line 10
    invoke-static {p0}, Lcom/android/dx/util/Hex;->s2(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :cond_0
    invoke-static {p0}, Lcom/android/dx/util/Hex;->s4(I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public static branchString(Lcom/android/dx/dex/code/DalvInsn;)Ljava/lang/String;
    .locals 1

    .line 1
    check-cast p0, Lcom/android/dx/dex/code/TargetInsn;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/dex/code/TargetInsn;->getTargetAddress()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    int-to-char v0, p0

    .line 8
    if-ne p0, v0, :cond_0

    .line 9
    .line 10
    invoke-static {p0}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :cond_0
    invoke-static {p0}, Lcom/android/dx/util/Hex;->u4(I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public static codeUnit(II)S
    .locals 1

    and-int/lit16 v0, p0, 0xff

    if-ne v0, p0, :cond_1

    and-int/lit16 v0, p1, 0xff

    if-ne v0, p1, :cond_0

    shl-int/lit8 p1, p1, 0x8

    or-int/2addr p0, p1

    int-to-short p0, p0

    return p0

    .line 56
    :cond_0
    const-string p0, "high out of range 0..255"

    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    const/4 p0, 0x0

    return p0

    .line 57
    :cond_1
    const-string p0, "low out of range 0..255"

    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    const/4 p0, 0x0

    return p0
.end method

.method public static codeUnit(IIII)S
    .locals 1

    .line 1
    and-int/lit8 v0, p0, 0xf

    .line 2
    .line 3
    if-ne v0, p0, :cond_3

    .line 4
    .line 5
    and-int/lit8 v0, p1, 0xf

    .line 6
    .line 7
    if-ne v0, p1, :cond_2

    .line 8
    .line 9
    and-int/lit8 v0, p2, 0xf

    .line 10
    .line 11
    if-ne v0, p2, :cond_1

    .line 12
    .line 13
    and-int/lit8 v0, p3, 0xf

    .line 14
    .line 15
    if-ne v0, p3, :cond_0

    .line 16
    .line 17
    shl-int/lit8 p1, p1, 0x4

    .line 18
    .line 19
    or-int/2addr p0, p1

    .line 20
    shl-int/lit8 p1, p2, 0x8

    .line 21
    .line 22
    or-int/2addr p0, p1

    .line 23
    shl-int/lit8 p1, p3, 0xc

    .line 24
    .line 25
    or-int/2addr p0, p1

    .line 26
    int-to-short p0, p0

    .line 27
    return p0

    .line 28
    :cond_0
    const-string p0, "n3 out of range 0..15"

    .line 29
    .line 30
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const/4 p0, 0x0

    .line 34
    return p0

    .line 35
    :cond_1
    const-string p0, "n2 out of range 0..15"

    .line 36
    .line 37
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const/4 p0, 0x0

    .line 41
    return p0

    .line 42
    :cond_2
    const-string p0, "n1 out of range 0..15"

    .line 43
    .line 44
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    return p0

    .line 49
    :cond_3
    const-string p0, "n0 out of range 0..15"

    .line 50
    .line 51
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const/4 p0, 0x0

    .line 55
    return p0
.end method

.method public static isRegListSequential(Lcom/android/dx/rop/code/RegisterSpecList;)Z
    .locals 7

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x2

    .line 6
    const/4 v2, 0x1

    .line 7
    if-ge v0, v1, :cond_0

    .line 8
    .line 9
    return v2

    .line 10
    :cond_0
    const/4 v1, 0x0

    .line 11
    invoke-virtual {p0, v1}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    invoke-virtual {v3}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    move v4, v1

    .line 20
    :goto_0
    if-ge v4, v0, :cond_2

    .line 21
    .line 22
    invoke-virtual {p0, v4}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    invoke-virtual {v5}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 27
    .line 28
    .line 29
    move-result v6

    .line 30
    if-eq v6, v3, :cond_1

    .line 31
    .line 32
    return v1

    .line 33
    :cond_1
    invoke-virtual {v5}, Lcom/android/dx/rop/code/RegisterSpec;->getCategory()I

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    add-int/2addr v3, v5

    .line 38
    add-int/lit8 v4, v4, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    return v2
.end method

.method public static literalBitsComment(Lcom/android/dx/rop/cst/CstLiteralBits;I)Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x14

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 6
    .line 7
    .line 8
    const-string v1, "#"

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    instance-of v1, p0, Lcom/android/dx/rop/cst/CstLiteral64;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    check-cast p0, Lcom/android/dx/rop/cst/CstLiteral64;

    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstLiteral64;->getLongBits()J

    .line 20
    .line 21
    .line 22
    move-result-wide v1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstLiteralBits;->getIntBits()I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    int-to-long v1, p0

    .line 29
    :goto_0
    const/4 p0, 0x4

    .line 30
    if-eq p1, p0, :cond_5

    .line 31
    .line 32
    const/16 p0, 0x8

    .line 33
    .line 34
    if-eq p1, p0, :cond_4

    .line 35
    .line 36
    const/16 p0, 0x10

    .line 37
    .line 38
    if-eq p1, p0, :cond_3

    .line 39
    .line 40
    const/16 p0, 0x20

    .line 41
    .line 42
    if-eq p1, p0, :cond_2

    .line 43
    .line 44
    const/16 p0, 0x40

    .line 45
    .line 46
    if-ne p1, p0, :cond_1

    .line 47
    .line 48
    invoke-static {v1, v2}, Lcom/android/dx/util/Hex;->u8(J)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    const-string p0, "shouldn\'t happen"

    .line 57
    .line 58
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    const/4 p0, 0x0

    .line 62
    return-object p0

    .line 63
    :cond_2
    long-to-int p0, v1

    .line 64
    invoke-static {p0}, Lcom/android/dx/util/Hex;->u4(I)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_3
    long-to-int p0, v1

    .line 73
    invoke-static {p0}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_4
    long-to-int p0, v1

    .line 82
    invoke-static {p0}, Lcom/android/dx/util/Hex;->u1(I)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_5
    long-to-int p0, v1

    .line 91
    invoke-static {p0}, Lcom/android/dx/util/Hex;->uNibble(I)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    :goto_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    return-object p0
.end method

.method public static literalBitsString(Lcom/android/dx/rop/cst/CstLiteralBits;)Ljava/lang/String;
    .locals 2

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
    const/16 v1, 0x23

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    instance-of v1, p0, Lcom/android/dx/rop/cst/CstKnownNull;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    const-string p0, "null"

    .line 18
    .line 19
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/Constant;->typeName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const/16 v1, 0x20

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-interface {p0}, Lcom/android/dx/util/ToHuman;->toHuman()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    :goto_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0
.end method

.method public static makeByte(II)I
    .locals 1

    .line 1
    and-int/lit8 v0, p0, 0xf

    .line 2
    .line 3
    if-ne v0, p0, :cond_1

    .line 4
    .line 5
    and-int/lit8 v0, p1, 0xf

    .line 6
    .line 7
    if-ne v0, p1, :cond_0

    .line 8
    .line 9
    shl-int/lit8 p1, p1, 0x4

    .line 10
    .line 11
    or-int/2addr p0, p1

    .line 12
    return p0

    .line 13
    :cond_0
    const-string p0, "high out of range 0..15"

    .line 14
    .line 15
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    return p0

    .line 20
    :cond_1
    const-string p0, "low out of range 0..15"

    .line 21
    .line 22
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    return p0
.end method

.method public static opcodeUnit(Lcom/android/dx/dex/code/DalvInsn;)S
    .locals 1

    .line 36
    invoke-virtual {p0}, Lcom/android/dx/dex/code/DalvInsn;->getOpcode()Lcom/android/dx/dex/code/Dop;

    move-result-object p0

    invoke-virtual {p0}, Lcom/android/dx/dex/code/Dop;->getOpcode()I

    move-result p0

    const/16 v0, 0x100

    if-lt p0, v0, :cond_0

    const v0, 0xffff

    if-gt p0, v0, :cond_0

    int-to-short p0, p0

    return p0

    .line 37
    :cond_0
    const-string p0, "opcode out of range 0..65535"

    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    const/4 p0, 0x0

    return p0
.end method

.method public static opcodeUnit(Lcom/android/dx/dex/code/DalvInsn;I)S
    .locals 1

    .line 1
    and-int/lit16 v0, p1, 0xff

    .line 2
    .line 3
    if-ne v0, p1, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/android/dx/dex/code/DalvInsn;->getOpcode()Lcom/android/dx/dex/code/Dop;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Lcom/android/dx/dex/code/Dop;->getOpcode()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    and-int/lit16 v0, p0, 0xff

    .line 14
    .line 15
    if-ne v0, p0, :cond_0

    .line 16
    .line 17
    shl-int/lit8 p1, p1, 0x8

    .line 18
    .line 19
    or-int/2addr p0, p1

    .line 20
    int-to-short p0, p0

    .line 21
    return p0

    .line 22
    :cond_0
    const-string p0, "opcode out of range 0..255"

    .line 23
    .line 24
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const/4 p0, 0x0

    .line 28
    return p0

    .line 29
    :cond_1
    const-string p0, "arg out of range 0..255"

    .line 30
    .line 31
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const/4 p0, 0x0

    .line 35
    return p0
.end method

.method public static regListString(Lcom/android/dx/rop/code/RegisterSpecList;)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    mul-int/lit8 v2, v0, 0x5

    .line 8
    .line 9
    add-int/lit8 v2, v2, 0x2

    .line 10
    .line 11
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 12
    .line 13
    .line 14
    const/16 v2, 0x7b

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    :goto_0
    if-ge v2, v0, :cond_1

    .line 21
    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    const-string v3, ", "

    .line 25
    .line 26
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    :cond_0
    invoke-virtual {p0, v2}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-virtual {v3}, Lcom/android/dx/rop/code/RegisterSpec;->regString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    add-int/lit8 v2, v2, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    const/16 p0, 0x7d

    .line 44
    .line 45
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0
.end method

.method public static regRangeString(Lcom/android/dx/rop/code/RegisterSpecList;)Ljava/lang/String;
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    const/16 v2, 0x1e

    .line 8
    .line 9
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 10
    .line 11
    .line 12
    const-string v2, "{"

    .line 13
    .line 14
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    const/4 v3, 0x1

    .line 21
    if-eq v0, v3, :cond_1

    .line 22
    .line 23
    sub-int/2addr v0, v3

    .line 24
    invoke-virtual {p0, v0}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Lcom/android/dx/rop/code/RegisterSpec;->getCategory()I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    const/4 v5, 0x2

    .line 33
    if-ne v4, v5, :cond_0

    .line 34
    .line 35
    invoke-virtual {v0, v3}, Lcom/android/dx/rop/code/RegisterSpec;->withOffset(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    :cond_0
    invoke-virtual {p0, v2}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {p0}, Lcom/android/dx/rop/code/RegisterSpec;->regString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string p0, ".."

    .line 51
    .line 52
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Lcom/android/dx/rop/code/RegisterSpec;->regString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    invoke-virtual {p0, v2}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-virtual {p0}, Lcom/android/dx/rop/code/RegisterSpec;->regString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    :cond_2
    :goto_0
    const-string p0, "}"

    .line 75
    .line 76
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    return-object p0
.end method

.method public static signedFitsInByte(I)Z
    .locals 1

    .line 1
    int-to-byte v0, p0

    .line 2
    if-ne v0, p0, :cond_0

    .line 3
    .line 4
    const/4 p0, 0x1

    .line 5
    return p0

    .line 6
    :cond_0
    const/4 p0, 0x0

    .line 7
    return p0
.end method

.method public static signedFitsInNibble(I)Z
    .locals 1

    .line 1
    const/4 v0, -0x8

    .line 2
    if-lt p0, v0, :cond_0

    .line 3
    .line 4
    const/4 v0, 0x7

    .line 5
    if-gt p0, v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public static signedFitsInShort(I)Z
    .locals 1

    .line 1
    int-to-short v0, p0

    .line 2
    if-ne v0, p0, :cond_0

    .line 3
    .line 4
    const/4 p0, 0x1

    .line 5
    return p0

    .line 6
    :cond_0
    const/4 p0, 0x0

    .line 7
    return p0
.end method

.method public static unsignedFitsInByte(I)Z
    .locals 1

    .line 1
    and-int/lit16 v0, p0, 0xff

    .line 2
    .line 3
    if-ne p0, v0, :cond_0

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

.method public static unsignedFitsInNibble(I)Z
    .locals 1

    .line 1
    and-int/lit8 v0, p0, 0xf

    .line 2
    .line 3
    if-ne p0, v0, :cond_0

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

.method public static unsignedFitsInShort(I)Z
    .locals 1

    .line 1
    const v0, 0xffff

    .line 2
    .line 3
    .line 4
    and-int/2addr v0, p0

    .line 5
    if-ne p0, v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public static write(Lcom/android/dx/util/AnnotatedOutput;S)V
    .locals 0

    .line 43
    invoke-interface {p0, p1}, Lcom/android/dx/util/Output;->writeShort(I)V

    return-void
.end method

.method public static write(Lcom/android/dx/util/AnnotatedOutput;SI)V
    .locals 1

    int-to-short v0, p2

    shr-int/lit8 p2, p2, 0x10

    int-to-short p2, p2

    .line 40
    invoke-static {p0, p1, v0, p2}, Lcom/android/dx/dex/code/InsnFormat;->write(Lcom/android/dx/util/AnnotatedOutput;SSS)V

    return-void
.end method

.method public static write(Lcom/android/dx/util/AnnotatedOutput;SIS)V
    .locals 1

    int-to-short v0, p2

    shr-int/lit8 p2, p2, 0x10

    int-to-short p2, p2

    .line 41
    invoke-static {p0, p1, v0, p2, p3}, Lcom/android/dx/dex/code/InsnFormat;->write(Lcom/android/dx/util/AnnotatedOutput;SSSS)V

    return-void
.end method

.method public static write(Lcom/android/dx/util/AnnotatedOutput;SISS)V
    .locals 6

    int-to-short v2, p2

    shr-int/lit8 p2, p2, 0x10

    int-to-short v3, p2

    move-object v0, p0

    move v1, p1

    move v4, p3

    move v5, p4

    .line 42
    invoke-static/range {v0 .. v5}, Lcom/android/dx/dex/code/InsnFormat;->write(Lcom/android/dx/util/AnnotatedOutput;SSSSS)V

    return-void
.end method

.method public static write(Lcom/android/dx/util/AnnotatedOutput;SJ)V
    .locals 7

    .line 1
    long-to-int v0, p2

    .line 2
    int-to-short v3, v0

    .line 3
    const/16 v0, 0x10

    .line 4
    .line 5
    shr-long v0, p2, v0

    .line 6
    .line 7
    long-to-int v0, v0

    .line 8
    int-to-short v4, v0

    .line 9
    const/16 v0, 0x20

    .line 10
    .line 11
    shr-long v0, p2, v0

    .line 12
    .line 13
    long-to-int v0, v0

    .line 14
    int-to-short v5, v0

    .line 15
    const/16 v0, 0x30

    .line 16
    .line 17
    shr-long/2addr p2, v0

    .line 18
    long-to-int p2, p2

    .line 19
    int-to-short v6, p2

    .line 20
    move-object v1, p0

    .line 21
    move v2, p1

    .line 22
    invoke-static/range {v1 .. v6}, Lcom/android/dx/dex/code/InsnFormat;->write(Lcom/android/dx/util/AnnotatedOutput;SSSSS)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public static write(Lcom/android/dx/util/AnnotatedOutput;SS)V
    .locals 0

    .line 26
    invoke-interface {p0, p1}, Lcom/android/dx/util/Output;->writeShort(I)V

    .line 27
    invoke-interface {p0, p2}, Lcom/android/dx/util/Output;->writeShort(I)V

    return-void
.end method

.method public static write(Lcom/android/dx/util/AnnotatedOutput;SSS)V
    .locals 0

    .line 28
    invoke-interface {p0, p1}, Lcom/android/dx/util/Output;->writeShort(I)V

    .line 29
    invoke-interface {p0, p2}, Lcom/android/dx/util/Output;->writeShort(I)V

    .line 30
    invoke-interface {p0, p3}, Lcom/android/dx/util/Output;->writeShort(I)V

    return-void
.end method

.method public static write(Lcom/android/dx/util/AnnotatedOutput;SSSS)V
    .locals 0

    .line 31
    invoke-interface {p0, p1}, Lcom/android/dx/util/Output;->writeShort(I)V

    .line 32
    invoke-interface {p0, p2}, Lcom/android/dx/util/Output;->writeShort(I)V

    .line 33
    invoke-interface {p0, p3}, Lcom/android/dx/util/Output;->writeShort(I)V

    .line 34
    invoke-interface {p0, p4}, Lcom/android/dx/util/Output;->writeShort(I)V

    return-void
.end method

.method public static write(Lcom/android/dx/util/AnnotatedOutput;SSSSS)V
    .locals 0

    .line 35
    invoke-interface {p0, p1}, Lcom/android/dx/util/Output;->writeShort(I)V

    .line 36
    invoke-interface {p0, p2}, Lcom/android/dx/util/Output;->writeShort(I)V

    .line 37
    invoke-interface {p0, p3}, Lcom/android/dx/util/Output;->writeShort(I)V

    .line 38
    invoke-interface {p0, p4}, Lcom/android/dx/util/Output;->writeShort(I)V

    .line 39
    invoke-interface {p0, p5}, Lcom/android/dx/util/Output;->writeShort(I)V

    return-void
.end method


# virtual methods
.method public branchFits(Lcom/android/dx/dex/code/TargetInsn;)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public abstract codeSize()I
.end method

.method public compatibleRegs(Lcom/android/dx/dex/code/DalvInsn;)Ljava/util/BitSet;
    .locals 0

    .line 1
    new-instance p0, Ljava/util/BitSet;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/BitSet;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public abstract insnArgString(Lcom/android/dx/dex/code/DalvInsn;)Ljava/lang/String;
.end method

.method public abstract insnCommentString(Lcom/android/dx/dex/code/DalvInsn;Z)Ljava/lang/String;
.end method

.method public abstract isCompatible(Lcom/android/dx/dex/code/DalvInsn;)Z
.end method

.method public final listingString(Lcom/android/dx/dex/code/DalvInsn;Z)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/dex/code/DalvInsn;->getOpcode()Lcom/android/dx/dex/code/Dop;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/android/dx/dex/code/Dop;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0, p1}, Lcom/android/dx/dex/code/InsnFormat;->insnArgString(Lcom/android/dx/dex/code/DalvInsn;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {p0, p1, p2}, Lcom/android/dx/dex/code/InsnFormat;->insnCommentString(Lcom/android/dx/dex/code/DalvInsn;Z)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    new-instance p1, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    const/16 p2, 0x64

    .line 20
    .line 21
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    if-eqz p2, :cond_0

    .line 32
    .line 33
    const/16 p2, 0x20

    .line 34
    .line 35
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    if-eqz p2, :cond_1

    .line 46
    .line 47
    const-string p2, " // "

    .line 48
    .line 49
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    :cond_1
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0
.end method

.method public abstract writeTo(Lcom/android/dx/util/AnnotatedOutput;Lcom/android/dx/dex/code/DalvInsn;)V
.end method
