.class public final Lcom/android/dx/dex/code/ArrayData;
.super Lcom/android/dx/dex/code/VariableSizeInsn;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field private final arrayType:Lcom/android/dx/rop/cst/Constant;

.field private final elemWidth:I

.field private final initLength:I

.field private final user:Lcom/android/dx/dex/code/CodeAddress;

.field private final values:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/android/dx/rop/cst/Constant;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/dex/code/CodeAddress;Ljava/util/ArrayList;Lcom/android/dx/rop/cst/Constant;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/dx/rop/code/SourcePosition;",
            "Lcom/android/dx/dex/code/CodeAddress;",
            "Ljava/util/ArrayList<",
            "Lcom/android/dx/rop/cst/Constant;",
            ">;",
            "Lcom/android/dx/rop/cst/Constant;",
            ")V"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/android/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 2
    .line 3
    invoke-direct {p0, p1, v0}, Lcom/android/dx/dex/code/VariableSizeInsn;-><init>(Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    if-eqz p2, :cond_a

    .line 8
    .line 9
    if-eqz p3, :cond_9

    .line 10
    .line 11
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-lez v0, :cond_8

    .line 16
    .line 17
    iput-object p4, p0, Lcom/android/dx/dex/code/ArrayData;->arrayType:Lcom/android/dx/rop/cst/Constant;

    .line 18
    .line 19
    sget-object v0, Lcom/android/dx/rop/cst/CstType;->BYTE_ARRAY:Lcom/android/dx/rop/cst/CstType;

    .line 20
    .line 21
    if-eq p4, v0, :cond_7

    .line 22
    .line 23
    sget-object v0, Lcom/android/dx/rop/cst/CstType;->BOOLEAN_ARRAY:Lcom/android/dx/rop/cst/CstType;

    .line 24
    .line 25
    if-ne p4, v0, :cond_0

    .line 26
    .line 27
    goto :goto_3

    .line 28
    :cond_0
    sget-object v0, Lcom/android/dx/rop/cst/CstType;->SHORT_ARRAY:Lcom/android/dx/rop/cst/CstType;

    .line 29
    .line 30
    if-eq p4, v0, :cond_6

    .line 31
    .line 32
    sget-object v0, Lcom/android/dx/rop/cst/CstType;->CHAR_ARRAY:Lcom/android/dx/rop/cst/CstType;

    .line 33
    .line 34
    if-ne p4, v0, :cond_1

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_1
    sget-object v0, Lcom/android/dx/rop/cst/CstType;->INT_ARRAY:Lcom/android/dx/rop/cst/CstType;

    .line 38
    .line 39
    if-eq p4, v0, :cond_5

    .line 40
    .line 41
    sget-object v0, Lcom/android/dx/rop/cst/CstType;->FLOAT_ARRAY:Lcom/android/dx/rop/cst/CstType;

    .line 42
    .line 43
    if-ne p4, v0, :cond_2

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    sget-object v0, Lcom/android/dx/rop/cst/CstType;->LONG_ARRAY:Lcom/android/dx/rop/cst/CstType;

    .line 47
    .line 48
    if-eq p4, v0, :cond_4

    .line 49
    .line 50
    sget-object v0, Lcom/android/dx/rop/cst/CstType;->DOUBLE_ARRAY:Lcom/android/dx/rop/cst/CstType;

    .line 51
    .line 52
    if-ne p4, v0, :cond_3

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_3
    const-string p0, "Unexpected constant type"

    .line 56
    .line 57
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw p1

    .line 61
    :cond_4
    :goto_0
    const/16 p1, 0x8

    .line 62
    .line 63
    iput p1, p0, Lcom/android/dx/dex/code/ArrayData;->elemWidth:I

    .line 64
    .line 65
    goto :goto_4

    .line 66
    :cond_5
    :goto_1
    const/4 p1, 0x4

    .line 67
    iput p1, p0, Lcom/android/dx/dex/code/ArrayData;->elemWidth:I

    .line 68
    .line 69
    goto :goto_4

    .line 70
    :cond_6
    :goto_2
    const/4 p1, 0x2

    .line 71
    iput p1, p0, Lcom/android/dx/dex/code/ArrayData;->elemWidth:I

    .line 72
    .line 73
    goto :goto_4

    .line 74
    :cond_7
    :goto_3
    const/4 p1, 0x1

    .line 75
    iput p1, p0, Lcom/android/dx/dex/code/ArrayData;->elemWidth:I

    .line 76
    .line 77
    :goto_4
    iput-object p2, p0, Lcom/android/dx/dex/code/ArrayData;->user:Lcom/android/dx/dex/code/CodeAddress;

    .line 78
    .line 79
    iput-object p3, p0, Lcom/android/dx/dex/code/ArrayData;->values:Ljava/util/ArrayList;

    .line 80
    .line 81
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    iput p1, p0, Lcom/android/dx/dex/code/ArrayData;->initLength:I

    .line 86
    .line 87
    return-void

    .line 88
    :cond_8
    const-string p0, "Illegal number of init values"

    .line 89
    .line 90
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    throw p1

    .line 94
    :cond_9
    const-string p0, "values == null"

    .line 95
    .line 96
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    throw p1

    .line 100
    :cond_a
    const-string p0, "user == null"

    .line 101
    .line 102
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    throw p1
.end method


# virtual methods
.method public argString()Ljava/lang/String;
    .locals 4

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
    iget-object v1, p0, Lcom/android/dx/dex/code/ArrayData;->values:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x0

    .line 15
    :goto_0
    if-ge v2, v1, :cond_0

    .line 16
    .line 17
    const-string v3, "\n    "

    .line 18
    .line 19
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v3, ": "

    .line 26
    .line 27
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget-object v3, p0, Lcom/android/dx/dex/code/ArrayData;->values:Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    check-cast v3, Lcom/android/dx/rop/cst/Constant;

    .line 37
    .line 38
    invoke-interface {v3}, Lcom/android/dx/util/ToHuman;->toHuman()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    add-int/lit8 v2, v2, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0
.end method

.method public codeSize()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/android/dx/dex/code/ArrayData;->initLength:I

    .line 2
    .line 3
    iget p0, p0, Lcom/android/dx/dex/code/ArrayData;->elemWidth:I

    .line 4
    .line 5
    mul-int/2addr v0, p0

    .line 6
    add-int/lit8 v0, v0, 0x1

    .line 7
    .line 8
    div-int/lit8 v0, v0, 0x2

    .line 9
    .line 10
    add-int/lit8 v0, v0, 0x4

    .line 11
    .line 12
    return v0
.end method

.method public listingString0(Z)Ljava/lang/String;
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/android/dx/dex/code/ArrayData;->user:Lcom/android/dx/dex/code/CodeAddress;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/android/dx/dex/code/DalvInsn;->getAddress()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const/16 v1, 0x64

    .line 10
    .line 11
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Lcom/android/dx/dex/code/ArrayData;->values:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const-string v2, "fill-array-data-payload // for fill-array-data @ "

    .line 21
    .line 22
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-static {p1}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const/4 p1, 0x0

    .line 33
    :goto_0
    if-ge p1, v1, :cond_0

    .line 34
    .line 35
    const-string v2, "\n  "

    .line 36
    .line 37
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v2, ": "

    .line 44
    .line 45
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object v2, p0, Lcom/android/dx/dex/code/ArrayData;->values:Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    check-cast v2, Lcom/android/dx/rop/cst/Constant;

    .line 55
    .line 56
    invoke-interface {v2}, Lcom/android/dx/util/ToHuman;->toHuman()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    add-int/lit8 p1, p1, 0x1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    return-object p0
.end method

.method public withRegisters(Lcom/android/dx/rop/code/RegisterSpecList;)Lcom/android/dx/dex/code/DalvInsn;
    .locals 3

    .line 1
    new-instance p1, Lcom/android/dx/dex/code/ArrayData;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/dex/code/DalvInsn;->getPosition()Lcom/android/dx/rop/code/SourcePosition;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/android/dx/dex/code/ArrayData;->user:Lcom/android/dx/dex/code/CodeAddress;

    .line 8
    .line 9
    iget-object v2, p0, Lcom/android/dx/dex/code/ArrayData;->values:Ljava/util/ArrayList;

    .line 10
    .line 11
    iget-object p0, p0, Lcom/android/dx/dex/code/ArrayData;->arrayType:Lcom/android/dx/rop/cst/Constant;

    .line 12
    .line 13
    invoke-direct {p1, v0, v1, v2, p0}, Lcom/android/dx/dex/code/ArrayData;-><init>(Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/dex/code/CodeAddress;Ljava/util/ArrayList;Lcom/android/dx/rop/cst/Constant;)V

    .line 14
    .line 15
    .line 16
    return-object p1
.end method

.method public writeTo(Lcom/android/dx/util/AnnotatedOutput;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/android/dx/dex/code/ArrayData;->values:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x300

    .line 8
    .line 9
    invoke-interface {p1, v1}, Lcom/android/dx/util/Output;->writeShort(I)V

    .line 10
    .line 11
    .line 12
    iget v1, p0, Lcom/android/dx/dex/code/ArrayData;->elemWidth:I

    .line 13
    .line 14
    invoke-interface {p1, v1}, Lcom/android/dx/util/Output;->writeShort(I)V

    .line 15
    .line 16
    .line 17
    iget v1, p0, Lcom/android/dx/dex/code/ArrayData;->initLength:I

    .line 18
    .line 19
    invoke-interface {p1, v1}, Lcom/android/dx/util/Output;->writeInt(I)V

    .line 20
    .line 21
    .line 22
    iget v1, p0, Lcom/android/dx/dex/code/ArrayData;->elemWidth:I

    .line 23
    .line 24
    const/4 v2, 0x2

    .line 25
    const/4 v3, 0x0

    .line 26
    const/4 v4, 0x1

    .line 27
    if-eq v1, v4, :cond_3

    .line 28
    .line 29
    if-eq v1, v2, :cond_2

    .line 30
    .line 31
    const/4 v5, 0x4

    .line 32
    if-eq v1, v5, :cond_1

    .line 33
    .line 34
    const/16 v5, 0x8

    .line 35
    .line 36
    if-eq v1, v5, :cond_0

    .line 37
    .line 38
    goto :goto_4

    .line 39
    :cond_0
    move v1, v3

    .line 40
    :goto_0
    if-ge v1, v0, :cond_4

    .line 41
    .line 42
    iget-object v5, p0, Lcom/android/dx/dex/code/ArrayData;->values:Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    check-cast v5, Lcom/android/dx/rop/cst/Constant;

    .line 49
    .line 50
    check-cast v5, Lcom/android/dx/rop/cst/CstLiteral64;

    .line 51
    .line 52
    invoke-virtual {v5}, Lcom/android/dx/rop/cst/CstLiteral64;->getLongBits()J

    .line 53
    .line 54
    .line 55
    move-result-wide v5

    .line 56
    invoke-interface {p1, v5, v6}, Lcom/android/dx/util/Output;->writeLong(J)V

    .line 57
    .line 58
    .line 59
    add-int/lit8 v1, v1, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    move v1, v3

    .line 63
    :goto_1
    if-ge v1, v0, :cond_4

    .line 64
    .line 65
    iget-object v5, p0, Lcom/android/dx/dex/code/ArrayData;->values:Ljava/util/ArrayList;

    .line 66
    .line 67
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    check-cast v5, Lcom/android/dx/rop/cst/Constant;

    .line 72
    .line 73
    check-cast v5, Lcom/android/dx/rop/cst/CstLiteral32;

    .line 74
    .line 75
    invoke-virtual {v5}, Lcom/android/dx/rop/cst/CstLiteral32;->getIntBits()I

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    invoke-interface {p1, v5}, Lcom/android/dx/util/Output;->writeInt(I)V

    .line 80
    .line 81
    .line 82
    add-int/lit8 v1, v1, 0x1

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_2
    move v1, v3

    .line 86
    :goto_2
    if-ge v1, v0, :cond_4

    .line 87
    .line 88
    iget-object v5, p0, Lcom/android/dx/dex/code/ArrayData;->values:Ljava/util/ArrayList;

    .line 89
    .line 90
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    check-cast v5, Lcom/android/dx/rop/cst/Constant;

    .line 95
    .line 96
    check-cast v5, Lcom/android/dx/rop/cst/CstLiteral32;

    .line 97
    .line 98
    invoke-virtual {v5}, Lcom/android/dx/rop/cst/CstLiteral32;->getIntBits()I

    .line 99
    .line 100
    .line 101
    move-result v5

    .line 102
    int-to-short v5, v5

    .line 103
    invoke-interface {p1, v5}, Lcom/android/dx/util/Output;->writeShort(I)V

    .line 104
    .line 105
    .line 106
    add-int/lit8 v1, v1, 0x1

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_3
    move v1, v3

    .line 110
    :goto_3
    if-ge v1, v0, :cond_4

    .line 111
    .line 112
    iget-object v5, p0, Lcom/android/dx/dex/code/ArrayData;->values:Ljava/util/ArrayList;

    .line 113
    .line 114
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    check-cast v5, Lcom/android/dx/rop/cst/Constant;

    .line 119
    .line 120
    check-cast v5, Lcom/android/dx/rop/cst/CstLiteral32;

    .line 121
    .line 122
    invoke-virtual {v5}, Lcom/android/dx/rop/cst/CstLiteral32;->getIntBits()I

    .line 123
    .line 124
    .line 125
    move-result v5

    .line 126
    int-to-byte v5, v5

    .line 127
    invoke-interface {p1, v5}, Lcom/android/dx/util/Output;->writeByte(I)V

    .line 128
    .line 129
    .line 130
    add-int/lit8 v1, v1, 0x1

    .line 131
    .line 132
    goto :goto_3

    .line 133
    :cond_4
    :goto_4
    iget p0, p0, Lcom/android/dx/dex/code/ArrayData;->elemWidth:I

    .line 134
    .line 135
    if-ne p0, v4, :cond_5

    .line 136
    .line 137
    rem-int/2addr v0, v2

    .line 138
    if-eqz v0, :cond_5

    .line 139
    .line 140
    invoke-interface {p1, v3}, Lcom/android/dx/util/Output;->writeByte(I)V

    .line 141
    .line 142
    .line 143
    :cond_5
    return-void
.end method
