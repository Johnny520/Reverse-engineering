.class public final Lcom/android/dx/dex/code/form/Form45cc;
.super Lcom/android/dx/dex/code/InsnFormat;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field private static final MAX_NUM_OPS:I = 0x5

.field public static final THE_ONE:Lcom/android/dx/dex/code/InsnFormat;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/android/dx/dex/code/form/Form45cc;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/android/dx/dex/code/form/Form45cc;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/android/dx/dex/code/form/Form45cc;->THE_ONE:Lcom/android/dx/dex/code/InsnFormat;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/android/dx/dex/code/InsnFormat;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static explicitize(Lcom/android/dx/rop/code/RegisterSpecList;)Lcom/android/dx/rop/code/RegisterSpecList;
    .locals 7

    .line 1
    invoke-static {p0}, Lcom/android/dx/dex/code/form/Form45cc;->wordCount(Lcom/android/dx/rop/code/RegisterSpecList;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance v2, Lcom/android/dx/rop/code/RegisterSpecList;

    .line 13
    .line 14
    invoke-direct {v2, v0}, Lcom/android/dx/rop/code/RegisterSpecList;-><init>(I)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    move v3, v0

    .line 19
    :goto_0
    if-ge v0, v1, :cond_2

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    invoke-virtual {v2, v3, v4}, Lcom/android/dx/rop/code/RegisterSpecList;->set(ILcom/android/dx/rop/code/RegisterSpec;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v4}, Lcom/android/dx/rop/code/RegisterSpec;->getCategory()I

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    const/4 v6, 0x2

    .line 33
    if-ne v5, v6, :cond_1

    .line 34
    .line 35
    add-int/lit8 v5, v3, 0x1

    .line 36
    .line 37
    invoke-virtual {v4}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    add-int/lit8 v4, v4, 0x1

    .line 42
    .line 43
    sget-object v6, Lcom/android/dx/rop/type/Type;->VOID:Lcom/android/dx/rop/type/Type;

    .line 44
    .line 45
    invoke-static {v4, v6}, Lcom/android/dx/rop/code/RegisterSpec;->make(ILcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/RegisterSpec;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    invoke-virtual {v2, v5, v4}, Lcom/android/dx/rop/code/RegisterSpecList;->set(ILcom/android/dx/rop/code/RegisterSpec;)V

    .line 50
    .line 51
    .line 52
    add-int/lit8 v3, v3, 0x2

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 56
    .line 57
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    invoke-virtual {v2}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 61
    .line 62
    .line 63
    return-object v2
.end method

.method private static wordCount(Lcom/android/dx/rop/code/RegisterSpecList;)I
    .locals 7

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    const/4 v2, 0x5

    .line 7
    if-le v0, v2, :cond_0

    .line 8
    .line 9
    return v1

    .line 10
    :cond_0
    const/4 v3, 0x0

    .line 11
    move v4, v3

    .line 12
    :goto_0
    if-ge v3, v0, :cond_2

    .line 13
    .line 14
    invoke-virtual {p0, v3}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 15
    .line 16
    .line 17
    move-result-object v5

    .line 18
    invoke-virtual {v5}, Lcom/android/dx/rop/code/RegisterSpec;->getCategory()I

    .line 19
    .line 20
    .line 21
    move-result v6

    .line 22
    add-int/2addr v4, v6

    .line 23
    invoke-virtual {v5}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    invoke-virtual {v5}, Lcom/android/dx/rop/code/RegisterSpec;->getCategory()I

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    add-int/2addr v5, v6

    .line 32
    add-int/lit8 v5, v5, -0x1

    .line 33
    .line 34
    invoke-static {v5}, Lcom/android/dx/dex/code/InsnFormat;->unsignedFitsInNibble(I)Z

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    if-nez v5, :cond_1

    .line 39
    .line 40
    return v1

    .line 41
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    if-gt v4, v2, :cond_3

    .line 45
    .line 46
    return v4

    .line 47
    :cond_3
    return v1
.end method


# virtual methods
.method public codeSize()I
    .locals 0

    .line 1
    const/4 p0, 0x4

    .line 2
    return p0
.end method

.method public compatibleRegs(Lcom/android/dx/dex/code/DalvInsn;)Ljava/util/BitSet;
    .locals 4

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/dex/code/DalvInsn;->getRegisters()Lcom/android/dx/rop/code/RegisterSpecList;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    new-instance v0, Ljava/util/BitSet;

    .line 10
    .line 11
    invoke-direct {v0, p1}, Ljava/util/BitSet;-><init>(I)V

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    :goto_0
    if-ge v1, p1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0, v1}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v2}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    invoke-virtual {v2}, Lcom/android/dx/rop/code/RegisterSpec;->getCategory()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    add-int/2addr v2, v3

    .line 30
    add-int/lit8 v2, v2, -0x1

    .line 31
    .line 32
    invoke-static {v2}, Lcom/android/dx/dex/code/InsnFormat;->unsignedFitsInNibble(I)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    invoke-virtual {v0, v1, v2}, Ljava/util/BitSet;->set(IZ)V

    .line 37
    .line 38
    .line 39
    add-int/lit8 v1, v1, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    return-object v0
.end method

.method public insnArgString(Lcom/android/dx/dex/code/DalvInsn;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/dex/code/DalvInsn;->getRegisters()Lcom/android/dx/rop/code/RegisterSpecList;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lcom/android/dx/dex/code/form/Form45cc;->explicitize(Lcom/android/dx/rop/code/RegisterSpecList;)Lcom/android/dx/rop/code/RegisterSpecList;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-static {p0}, Lcom/android/dx/dex/code/InsnFormat;->regListString(Lcom/android/dx/rop/code/RegisterSpecList;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string p0, ", "

    .line 22
    .line 23
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Lcom/android/dx/dex/code/DalvInsn;->cstString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0
.end method

.method public insnCommentString(Lcom/android/dx/dex/code/DalvInsn;Z)Ljava/lang/String;
    .locals 0

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/android/dx/dex/code/DalvInsn;->cstComment()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0

    .line 8
    :cond_0
    const-string p0, ""

    .line 9
    .line 10
    return-object p0
.end method

.method public isCompatible(Lcom/android/dx/dex/code/DalvInsn;)Z
    .locals 3

    .line 1
    instance-of p0, p1, Lcom/android/dx/dex/code/MultiCstInsn;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-nez p0, :cond_0

    .line 5
    .line 6
    return v0

    .line 7
    :cond_0
    check-cast p1, Lcom/android/dx/dex/code/MultiCstInsn;

    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/android/dx/dex/code/MultiCstInsn;->getNumberOfConstants()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    const/4 v1, 0x2

    .line 14
    if-eq p0, v1, :cond_1

    .line 15
    .line 16
    return v0

    .line 17
    :cond_1
    invoke-virtual {p1, v0}, Lcom/android/dx/dex/code/MultiCstInsn;->getIndex(I)I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    const/4 v1, 0x1

    .line 22
    invoke-virtual {p1, v1}, Lcom/android/dx/dex/code/MultiCstInsn;->getIndex(I)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    invoke-static {p0}, Lcom/android/dx/dex/code/InsnFormat;->unsignedFitsInShort(I)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-eqz p0, :cond_5

    .line 31
    .line 32
    invoke-static {v2}, Lcom/android/dx/dex/code/InsnFormat;->unsignedFitsInShort(I)Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    if-nez p0, :cond_2

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    invoke-virtual {p1, v0}, Lcom/android/dx/dex/code/MultiCstInsn;->getConstant(I)Lcom/android/dx/rop/cst/Constant;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    instance-of p0, p0, Lcom/android/dx/rop/cst/CstMethodRef;

    .line 44
    .line 45
    if-nez p0, :cond_3

    .line 46
    .line 47
    return v0

    .line 48
    :cond_3
    invoke-virtual {p1, v1}, Lcom/android/dx/dex/code/MultiCstInsn;->getConstant(I)Lcom/android/dx/rop/cst/Constant;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    instance-of p0, p0, Lcom/android/dx/rop/cst/CstProtoRef;

    .line 53
    .line 54
    if-nez p0, :cond_4

    .line 55
    .line 56
    return v0

    .line 57
    :cond_4
    invoke-virtual {p1}, Lcom/android/dx/dex/code/DalvInsn;->getRegisters()Lcom/android/dx/rop/code/RegisterSpecList;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-static {p0}, Lcom/android/dx/dex/code/form/Form45cc;->wordCount(Lcom/android/dx/rop/code/RegisterSpecList;)I

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    if-ltz p0, :cond_5

    .line 66
    .line 67
    return v1

    .line 68
    :cond_5
    :goto_0
    return v0
.end method

.method public writeTo(Lcom/android/dx/util/AnnotatedOutput;Lcom/android/dx/dex/code/DalvInsn;)V
    .locals 9

    .line 1
    move-object p0, p2

    .line 2
    check-cast p0, Lcom/android/dx/dex/code/MultiCstInsn;

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-virtual {p0, v0}, Lcom/android/dx/dex/code/MultiCstInsn;->getIndex(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    int-to-short v1, v1

    .line 10
    const/4 v2, 0x1

    .line 11
    invoke-virtual {p0, v2}, Lcom/android/dx/dex/code/MultiCstInsn;->getIndex(I)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    int-to-short p0, p0

    .line 16
    invoke-virtual {p2}, Lcom/android/dx/dex/code/DalvInsn;->getRegisters()Lcom/android/dx/rop/code/RegisterSpecList;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-static {v3}, Lcom/android/dx/dex/code/form/Form45cc;->explicitize(Lcom/android/dx/rop/code/RegisterSpecList;)Lcom/android/dx/rop/code/RegisterSpecList;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-virtual {v3}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    if-lez v4, :cond_0

    .line 29
    .line 30
    invoke-virtual {v3, v0}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    invoke-virtual {v5}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    move v5, v0

    .line 40
    :goto_0
    if-le v4, v2, :cond_1

    .line 41
    .line 42
    invoke-virtual {v3, v2}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-virtual {v2}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    goto :goto_1

    .line 51
    :cond_1
    move v2, v0

    .line 52
    :goto_1
    const/4 v6, 0x2

    .line 53
    if-le v4, v6, :cond_2

    .line 54
    .line 55
    invoke-virtual {v3, v6}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    invoke-virtual {v6}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 60
    .line 61
    .line 62
    move-result v6

    .line 63
    goto :goto_2

    .line 64
    :cond_2
    move v6, v0

    .line 65
    :goto_2
    const/4 v7, 0x3

    .line 66
    if-le v4, v7, :cond_3

    .line 67
    .line 68
    invoke-virtual {v3, v7}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 69
    .line 70
    .line 71
    move-result-object v7

    .line 72
    invoke-virtual {v7}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 73
    .line 74
    .line 75
    move-result v7

    .line 76
    goto :goto_3

    .line 77
    :cond_3
    move v7, v0

    .line 78
    :goto_3
    const/4 v8, 0x4

    .line 79
    if-le v4, v8, :cond_4

    .line 80
    .line 81
    invoke-virtual {v3, v8}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {v0}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    :cond_4
    invoke-static {v0, v4}, Lcom/android/dx/dex/code/InsnFormat;->makeByte(II)I

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    invoke-static {p2, v0}, Lcom/android/dx/dex/code/InsnFormat;->opcodeUnit(Lcom/android/dx/dex/code/DalvInsn;I)S

    .line 94
    .line 95
    .line 96
    move-result p2

    .line 97
    invoke-static {v5, v2, v6, v7}, Lcom/android/dx/dex/code/InsnFormat;->codeUnit(IIII)S

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    invoke-static {p1, p2, v1, v0, p0}, Lcom/android/dx/dex/code/InsnFormat;->write(Lcom/android/dx/util/AnnotatedOutput;SSSS)V

    .line 102
    .line 103
    .line 104
    return-void
.end method
