.class public Lcom/android/dx/ssa/PhiTypeResolver;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field ssaMeth:Lcom/android/dx/ssa/SsaMethod;

.field private final worklist:Ljava/util/BitSet;


# direct methods
.method private constructor <init>(Lcom/android/dx/ssa/SsaMethod;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/android/dx/ssa/PhiTypeResolver;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 5
    .line 6
    new-instance v0, Ljava/util/BitSet;

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaMethod;->getRegCount()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    invoke-direct {v0, p1}, Ljava/util/BitSet;-><init>(I)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lcom/android/dx/ssa/PhiTypeResolver;->worklist:Ljava/util/BitSet;

    .line 16
    .line 17
    return-void
.end method

.method private static equalsHandlesNulls(Lcom/android/dx/rop/code/LocalItem;Lcom/android/dx/rop/code/LocalItem;)Z
    .locals 0

    .line 1
    if-eq p0, p1, :cond_1

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/android/dx/rop/code/LocalItem;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return p0

    .line 14
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 15
    return p0
.end method

.method public static process(Lcom/android/dx/ssa/SsaMethod;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/android/dx/ssa/PhiTypeResolver;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/android/dx/ssa/PhiTypeResolver;-><init>(Lcom/android/dx/ssa/SsaMethod;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {v0}, Lcom/android/dx/ssa/PhiTypeResolver;->run()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private run()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/android/dx/ssa/PhiTypeResolver;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/dx/ssa/SsaMethod;->getRegCount()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    move v2, v1

    .line 9
    :goto_0
    if-ge v2, v0, :cond_1

    .line 10
    .line 11
    iget-object v3, p0, Lcom/android/dx/ssa/PhiTypeResolver;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 12
    .line 13
    invoke-virtual {v3, v2}, Lcom/android/dx/ssa/SsaMethod;->getDefinitionForRegister(I)Lcom/android/dx/ssa/SsaInsn;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    invoke-virtual {v3}, Lcom/android/dx/ssa/SsaInsn;->getResult()Lcom/android/dx/rop/code/RegisterSpec;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {v3}, Lcom/android/dx/rop/code/RegisterSpec;->getBasicType()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-nez v3, :cond_0

    .line 28
    .line 29
    iget-object v3, p0, Lcom/android/dx/ssa/PhiTypeResolver;->worklist:Ljava/util/BitSet;

    .line 30
    .line 31
    invoke-virtual {v3, v2}, Ljava/util/BitSet;->set(I)V

    .line 32
    .line 33
    .line 34
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    iget-object v0, p0, Lcom/android/dx/ssa/PhiTypeResolver;->worklist:Ljava/util/BitSet;

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/util/BitSet;->nextSetBit(I)I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-ltz v0, :cond_3

    .line 44
    .line 45
    iget-object v2, p0, Lcom/android/dx/ssa/PhiTypeResolver;->worklist:Ljava/util/BitSet;

    .line 46
    .line 47
    invoke-virtual {v2, v0}, Ljava/util/BitSet;->clear(I)V

    .line 48
    .line 49
    .line 50
    iget-object v2, p0, Lcom/android/dx/ssa/PhiTypeResolver;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 51
    .line 52
    invoke-virtual {v2, v0}, Lcom/android/dx/ssa/SsaMethod;->getDefinitionForRegister(I)Lcom/android/dx/ssa/SsaInsn;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    check-cast v2, Lcom/android/dx/ssa/PhiInsn;

    .line 57
    .line 58
    invoke-virtual {p0, v2}, Lcom/android/dx/ssa/PhiTypeResolver;->resolveResultType(Lcom/android/dx/ssa/PhiInsn;)Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-eqz v2, :cond_1

    .line 63
    .line 64
    iget-object v2, p0, Lcom/android/dx/ssa/PhiTypeResolver;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 65
    .line 66
    invoke-virtual {v2, v0}, Lcom/android/dx/ssa/SsaMethod;->getUseListForRegister(I)Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    move v3, v1

    .line 75
    :goto_1
    if-ge v3, v2, :cond_1

    .line 76
    .line 77
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    check-cast v4, Lcom/android/dx/ssa/SsaInsn;

    .line 82
    .line 83
    invoke-virtual {v4}, Lcom/android/dx/ssa/SsaInsn;->getResult()Lcom/android/dx/rop/code/RegisterSpec;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    if-eqz v5, :cond_2

    .line 88
    .line 89
    instance-of v4, v4, Lcom/android/dx/ssa/PhiInsn;

    .line 90
    .line 91
    if-eqz v4, :cond_2

    .line 92
    .line 93
    iget-object v4, p0, Lcom/android/dx/ssa/PhiTypeResolver;->worklist:Ljava/util/BitSet;

    .line 94
    .line 95
    invoke-virtual {v5}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 96
    .line 97
    .line 98
    move-result v5

    .line 99
    invoke-virtual {v4, v5}, Ljava/util/BitSet;->set(I)V

    .line 100
    .line 101
    .line 102
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_3
    return-void
.end method


# virtual methods
.method public resolveResultType(Lcom/android/dx/ssa/PhiInsn;)Z
    .locals 11

    .line 1
    iget-object p0, p0, Lcom/android/dx/ssa/PhiTypeResolver;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Lcom/android/dx/ssa/PhiInsn;->updateSourcesToDefinitions(Lcom/android/dx/ssa/SsaMethod;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/android/dx/ssa/PhiInsn;->getSources()Lcom/android/dx/rop/code/RegisterSpecList;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x0

    .line 15
    const/4 v2, -0x1

    .line 16
    const/4 v3, 0x0

    .line 17
    move-object v5, v1

    .line 18
    move v4, v3

    .line 19
    :goto_0
    if-ge v4, v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0, v4}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 22
    .line 23
    .line 24
    move-result-object v6

    .line 25
    invoke-virtual {v6}, Lcom/android/dx/rop/code/RegisterSpec;->getBasicType()I

    .line 26
    .line 27
    .line 28
    move-result v7

    .line 29
    if-eqz v7, :cond_0

    .line 30
    .line 31
    move v2, v4

    .line 32
    move-object v5, v6

    .line 33
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    if-nez v5, :cond_2

    .line 37
    .line 38
    return v3

    .line 39
    :cond_2
    invoke-virtual {v5}, Lcom/android/dx/rop/code/RegisterSpec;->getLocalItem()Lcom/android/dx/rop/code/LocalItem;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-virtual {v5}, Lcom/android/dx/rop/code/RegisterSpec;->getType()Lcom/android/dx/rop/type/Type;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    const/4 v6, 0x1

    .line 48
    move v7, v3

    .line 49
    move v8, v6

    .line 50
    :goto_1
    if-ge v7, v0, :cond_6

    .line 51
    .line 52
    if-ne v7, v2, :cond_3

    .line 53
    .line 54
    goto :goto_3

    .line 55
    :cond_3
    invoke-virtual {p0, v7}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 56
    .line 57
    .line 58
    move-result-object v9

    .line 59
    invoke-virtual {v9}, Lcom/android/dx/rop/code/RegisterSpec;->getBasicType()I

    .line 60
    .line 61
    .line 62
    move-result v10

    .line 63
    if-nez v10, :cond_4

    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_4
    if-eqz v8, :cond_5

    .line 67
    .line 68
    invoke-virtual {v9}, Lcom/android/dx/rop/code/RegisterSpec;->getLocalItem()Lcom/android/dx/rop/code/LocalItem;

    .line 69
    .line 70
    .line 71
    move-result-object v8

    .line 72
    invoke-static {v4, v8}, Lcom/android/dx/ssa/PhiTypeResolver;->equalsHandlesNulls(Lcom/android/dx/rop/code/LocalItem;Lcom/android/dx/rop/code/LocalItem;)Z

    .line 73
    .line 74
    .line 75
    move-result v8

    .line 76
    if-eqz v8, :cond_5

    .line 77
    .line 78
    move v8, v6

    .line 79
    goto :goto_2

    .line 80
    :cond_5
    move v8, v3

    .line 81
    :goto_2
    invoke-virtual {v9}, Lcom/android/dx/rop/code/RegisterSpec;->getType()Lcom/android/dx/rop/type/Type;

    .line 82
    .line 83
    .line 84
    move-result-object v9

    .line 85
    invoke-static {v5, v9}, Lcom/android/dx/cf/code/Merger;->mergeType(Lcom/android/dx/rop/type/TypeBearer;Lcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/type/TypeBearer;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    :goto_3
    add-int/lit8 v7, v7, 0x1

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_6
    if-eqz v5, :cond_9

    .line 93
    .line 94
    if-eqz v8, :cond_7

    .line 95
    .line 96
    move-object v1, v4

    .line 97
    :cond_7
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaInsn;->getResult()Lcom/android/dx/rop/code/RegisterSpec;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    invoke-virtual {p0}, Lcom/android/dx/rop/code/RegisterSpec;->getTypeBearer()Lcom/android/dx/rop/type/TypeBearer;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    if-ne v0, v5, :cond_8

    .line 106
    .line 107
    invoke-virtual {p0}, Lcom/android/dx/rop/code/RegisterSpec;->getLocalItem()Lcom/android/dx/rop/code/LocalItem;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    invoke-static {v1, p0}, Lcom/android/dx/ssa/PhiTypeResolver;->equalsHandlesNulls(Lcom/android/dx/rop/code/LocalItem;Lcom/android/dx/rop/code/LocalItem;)Z

    .line 112
    .line 113
    .line 114
    move-result p0

    .line 115
    if-eqz p0, :cond_8

    .line 116
    .line 117
    return v3

    .line 118
    :cond_8
    invoke-virtual {p1, v5, v1}, Lcom/android/dx/ssa/PhiInsn;->changeResultType(Lcom/android/dx/rop/type/TypeBearer;Lcom/android/dx/rop/code/LocalItem;)V

    .line 119
    .line 120
    .line 121
    return v6

    .line 122
    :cond_9
    new-instance p1, Ljava/lang/StringBuilder;

    .line 123
    .line 124
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 125
    .line 126
    .line 127
    move v1, v3

    .line 128
    :goto_4
    if-ge v1, v0, :cond_a

    .line 129
    .line 130
    invoke-virtual {p0, v1}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    invoke-virtual {v2}, Lcom/android/dx/rop/code/RegisterSpec;->toString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    const/16 v2, 0x20

    .line 142
    .line 143
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    add-int/lit8 v1, v1, 0x1

    .line 147
    .line 148
    goto :goto_4

    .line 149
    :cond_a
    const-string p0, "Couldn\'t map types in phi insn:"

    .line 150
    .line 151
    invoke-static {p1, p0}, Lcom/google/protobuf/飘花落叶言楪苏兰哲子世;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    return v3
.end method
