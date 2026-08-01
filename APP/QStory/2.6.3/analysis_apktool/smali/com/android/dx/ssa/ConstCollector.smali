.class public Lcom/android/dx/ssa/ConstCollector;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field private static final COLLECT_ONE_LOCAL:Z = false

.field private static final COLLECT_STRINGS:Z = false

.field private static final MAX_COLLECTED_CONSTANTS:I = 0x5


# instance fields
.field private final ssaMeth:Lcom/android/dx/ssa/SsaMethod;


# direct methods
.method private constructor <init>(Lcom/android/dx/ssa/SsaMethod;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/android/dx/ssa/ConstCollector;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 5
    .line 6
    return-void
.end method

.method public static synthetic access$000(Lcom/android/dx/ssa/ConstCollector;)Lcom/android/dx/ssa/SsaMethod;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/ssa/ConstCollector;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 2
    .line 3
    return-object p0
.end method

.method private fixLocalAssignment(Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpec;)V
    .locals 5

    .line 1
    iget-object p0, p0, Lcom/android/dx/ssa/ConstCollector;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-virtual {p0, p1}, Lcom/android/dx/ssa/SsaMethod;->getUseListForRegister(I)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_2

    .line 20
    .line 21
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Lcom/android/dx/ssa/SsaInsn;

    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaInsn;->getLocalAssignment()Lcom/android/dx/rop/code/RegisterSpec;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-nez v0, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaInsn;->getResult()Lcom/android/dx/rop/code/RegisterSpec;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    if-nez v1, :cond_1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    invoke-virtual {v0}, Lcom/android/dx/rop/code/RegisterSpec;->getLocalItem()Lcom/android/dx/rop/code/LocalItem;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    const/4 v1, 0x0

    .line 46
    invoke-virtual {p1, v1}, Lcom/android/dx/ssa/SsaInsn;->setResultLocal(Lcom/android/dx/rop/code/LocalItem;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p2, v0}, Lcom/android/dx/rop/code/RegisterSpec;->withLocalItem(Lcom/android/dx/rop/code/LocalItem;)Lcom/android/dx/rop/code/RegisterSpec;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    new-instance v0, Lcom/android/dx/rop/code/PlainInsn;

    .line 54
    .line 55
    invoke-static {p2}, Lcom/android/dx/rop/code/Rops;->opMarkLocal(Lcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/Rop;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    sget-object v3, Lcom/android/dx/rop/code/SourcePosition;->NO_INFO:Lcom/android/dx/rop/code/SourcePosition;

    .line 60
    .line 61
    invoke-static {p2}, Lcom/android/dx/rop/code/RegisterSpecList;->make(Lcom/android/dx/rop/code/RegisterSpec;)Lcom/android/dx/rop/code/RegisterSpecList;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    invoke-direct {v0, v2, v3, v1, v4}, Lcom/android/dx/rop/code/PlainInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaInsn;->getBlock()Lcom/android/dx/ssa/SsaBasicBlock;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-static {v0, v1}, Lcom/android/dx/ssa/SsaInsn;->makeFromRop(Lcom/android/dx/rop/code/Insn;Lcom/android/dx/ssa/SsaBasicBlock;)Lcom/android/dx/ssa/SsaInsn;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaInsn;->getBlock()Lcom/android/dx/ssa/SsaBasicBlock;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-virtual {v1}, Lcom/android/dx/ssa/SsaBasicBlock;->getInsns()Ljava/util/ArrayList;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    add-int/lit8 p1, p1, 0x1

    .line 89
    .line 90
    invoke-virtual {v1, p1, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_2
    return-void
.end method

.method private getConstsSortedByCountUse()Ljava/util/ArrayList;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/android/dx/rop/cst/TypedConstant;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/android/dx/ssa/ConstCollector;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/dx/ssa/SsaMethod;->getRegCount()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    new-instance v1, Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 10
    .line 11
    .line 12
    new-instance v2, Ljava/util/HashSet;

    .line 13
    .line 14
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 15
    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    move v3, v2

    .line 19
    :goto_0
    const/4 v4, 0x1

    .line 20
    if-ge v3, v0, :cond_7

    .line 21
    .line 22
    iget-object v5, p0, Lcom/android/dx/ssa/ConstCollector;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 23
    .line 24
    invoke-virtual {v5, v3}, Lcom/android/dx/ssa/SsaMethod;->getDefinitionForRegister(I)Lcom/android/dx/ssa/SsaInsn;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    if-eqz v5, :cond_6

    .line 29
    .line 30
    invoke-virtual {v5}, Lcom/android/dx/ssa/SsaInsn;->getOpcode()Lcom/android/dx/rop/code/Rop;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    if-nez v6, :cond_0

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_0
    invoke-virtual {v5}, Lcom/android/dx/ssa/SsaInsn;->getResult()Lcom/android/dx/rop/code/RegisterSpec;

    .line 38
    .line 39
    .line 40
    move-result-object v6

    .line 41
    invoke-virtual {v6}, Lcom/android/dx/rop/code/RegisterSpec;->getTypeBearer()Lcom/android/dx/rop/type/TypeBearer;

    .line 42
    .line 43
    .line 44
    move-result-object v7

    .line 45
    invoke-interface {v7}, Lcom/android/dx/rop/type/TypeBearer;->isConstant()Z

    .line 46
    .line 47
    .line 48
    move-result v8

    .line 49
    if-nez v8, :cond_1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    check-cast v7, Lcom/android/dx/rop/cst/TypedConstant;

    .line 53
    .line 54
    invoke-virtual {v5}, Lcom/android/dx/ssa/SsaInsn;->getOpcode()Lcom/android/dx/rop/code/Rop;

    .line 55
    .line 56
    .line 57
    move-result-object v8

    .line 58
    invoke-virtual {v8}, Lcom/android/dx/rop/code/Rop;->getOpcode()I

    .line 59
    .line 60
    .line 61
    move-result v8

    .line 62
    const/16 v9, 0x38

    .line 63
    .line 64
    if-ne v8, v9, :cond_2

    .line 65
    .line 66
    invoke-virtual {v5}, Lcom/android/dx/ssa/SsaInsn;->getBlock()Lcom/android/dx/ssa/SsaBasicBlock;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    invoke-virtual {v5}, Lcom/android/dx/ssa/SsaBasicBlock;->getPredecessors()Ljava/util/BitSet;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    invoke-virtual {v5, v2}, Ljava/util/BitSet;->nextSetBit(I)I

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    iget-object v8, p0, Lcom/android/dx/ssa/ConstCollector;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 79
    .line 80
    invoke-virtual {v8}, Lcom/android/dx/ssa/SsaMethod;->getBlocks()Ljava/util/ArrayList;

    .line 81
    .line 82
    .line 83
    move-result-object v8

    .line 84
    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    check-cast v5, Lcom/android/dx/ssa/SsaBasicBlock;

    .line 89
    .line 90
    invoke-virtual {v5}, Lcom/android/dx/ssa/SsaBasicBlock;->getInsns()Ljava/util/ArrayList;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    invoke-static {v4, v5}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏世兰哲(ILjava/util/ArrayList;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    check-cast v5, Lcom/android/dx/ssa/SsaInsn;

    .line 99
    .line 100
    :cond_2
    invoke-virtual {v5}, Lcom/android/dx/ssa/SsaInsn;->canThrow()Z

    .line 101
    .line 102
    .line 103
    move-result v5

    .line 104
    if-eqz v5, :cond_3

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_3
    iget-object v5, p0, Lcom/android/dx/ssa/ConstCollector;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 108
    .line 109
    invoke-virtual {v5, v6}, Lcom/android/dx/ssa/SsaMethod;->isRegALocal(Lcom/android/dx/rop/code/RegisterSpec;)Z

    .line 110
    .line 111
    .line 112
    move-result v5

    .line 113
    if-eqz v5, :cond_4

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_4
    invoke-virtual {v1, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v5

    .line 120
    check-cast v5, Ljava/lang/Integer;

    .line 121
    .line 122
    if-nez v5, :cond_5

    .line 123
    .line 124
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    invoke-virtual {v1, v7, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_5
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 133
    .line 134
    .line 135
    move-result v5

    .line 136
    add-int/2addr v5, v4

    .line 137
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    invoke-virtual {v1, v7, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    :cond_6
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 145
    .line 146
    goto :goto_0

    .line 147
    :cond_7
    new-instance v0, Ljava/util/ArrayList;

    .line 148
    .line 149
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    :cond_8
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 161
    .line 162
    .line 163
    move-result v3

    .line 164
    if-eqz v3, :cond_9

    .line 165
    .line 166
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v3

    .line 170
    check-cast v3, Ljava/util/Map$Entry;

    .line 171
    .line 172
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v5

    .line 176
    check-cast v5, Ljava/lang/Integer;

    .line 177
    .line 178
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 179
    .line 180
    .line 181
    move-result v5

    .line 182
    if-le v5, v4, :cond_8

    .line 183
    .line 184
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v3

    .line 188
    check-cast v3, Lcom/android/dx/rop/cst/TypedConstant;

    .line 189
    .line 190
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    goto :goto_2

    .line 194
    :cond_9
    new-instance v2, Lcom/android/dx/ssa/ConstCollector$1;

    .line 195
    .line 196
    invoke-direct {v2, p0, v1}, Lcom/android/dx/ssa/ConstCollector$1;-><init>(Lcom/android/dx/ssa/ConstCollector;Ljava/util/HashMap;)V

    .line 197
    .line 198
    .line 199
    invoke-static {v0, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 200
    .line 201
    .line 202
    return-object v0
.end method

.method public static process(Lcom/android/dx/ssa/SsaMethod;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/android/dx/ssa/ConstCollector;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/android/dx/ssa/ConstCollector;-><init>(Lcom/android/dx/ssa/SsaMethod;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {v0}, Lcom/android/dx/ssa/ConstCollector;->run()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private run()V
    .locals 15

    .line 1
    iget-object v0, p0, Lcom/android/dx/ssa/ConstCollector;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/dx/ssa/SsaMethod;->getRegCount()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-direct {p0}, Lcom/android/dx/ssa/ConstCollector;->getConstsSortedByCountUse()Ljava/util/ArrayList;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, 0x5

    .line 16
    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    iget-object v3, p0, Lcom/android/dx/ssa/ConstCollector;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 21
    .line 22
    invoke-virtual {v3}, Lcom/android/dx/ssa/SsaMethod;->getEntryBlock()Lcom/android/dx/ssa/SsaBasicBlock;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    new-instance v4, Ljava/util/HashMap;

    .line 27
    .line 28
    invoke-direct {v4, v2}, Ljava/util/HashMap;-><init>(I)V

    .line 29
    .line 30
    .line 31
    const/4 v5, 0x0

    .line 32
    :goto_0
    if-ge v5, v2, :cond_1

    .line 33
    .line 34
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    move-object v12, v6

    .line 39
    check-cast v12, Lcom/android/dx/rop/cst/TypedConstant;

    .line 40
    .line 41
    iget-object v6, p0, Lcom/android/dx/ssa/ConstCollector;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 42
    .line 43
    invoke-virtual {v6}, Lcom/android/dx/ssa/SsaMethod;->makeNewSsaReg()I

    .line 44
    .line 45
    .line 46
    move-result v6

    .line 47
    invoke-static {v6, v12}, Lcom/android/dx/rop/code/RegisterSpec;->make(ILcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/RegisterSpec;

    .line 48
    .line 49
    .line 50
    move-result-object v10

    .line 51
    invoke-static {v12}, Lcom/android/dx/rop/code/Rops;->opConst(Lcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/Rop;

    .line 52
    .line 53
    .line 54
    move-result-object v8

    .line 55
    invoke-virtual {v8}, Lcom/android/dx/rop/code/Rop;->getBranchingness()I

    .line 56
    .line 57
    .line 58
    move-result v6

    .line 59
    const/4 v7, 0x1

    .line 60
    if-ne v6, v7, :cond_0

    .line 61
    .line 62
    new-instance v7, Lcom/android/dx/rop/code/PlainCstInsn;

    .line 63
    .line 64
    invoke-static {v12}, Lcom/android/dx/rop/code/Rops;->opConst(Lcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/Rop;

    .line 65
    .line 66
    .line 67
    move-result-object v8

    .line 68
    sget-object v9, Lcom/android/dx/rop/code/SourcePosition;->NO_INFO:Lcom/android/dx/rop/code/SourcePosition;

    .line 69
    .line 70
    sget-object v11, Lcom/android/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 71
    .line 72
    invoke-direct/range {v7 .. v12}, Lcom/android/dx/rop/code/PlainCstInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/cst/Constant;)V

    .line 73
    .line 74
    .line 75
    move-object v6, v10

    .line 76
    invoke-virtual {v3, v7}, Lcom/android/dx/ssa/SsaBasicBlock;->addInsnToHead(Lcom/android/dx/rop/code/Insn;)V

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_0
    move-object v6, v10

    .line 81
    iget-object v7, p0, Lcom/android/dx/ssa/ConstCollector;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 82
    .line 83
    invoke-virtual {v7}, Lcom/android/dx/ssa/SsaMethod;->getEntryBlock()Lcom/android/dx/ssa/SsaBasicBlock;

    .line 84
    .line 85
    .line 86
    move-result-object v7

    .line 87
    invoke-virtual {v7}, Lcom/android/dx/ssa/SsaBasicBlock;->getPrimarySuccessor()Lcom/android/dx/ssa/SsaBasicBlock;

    .line 88
    .line 89
    .line 90
    move-result-object v13

    .line 91
    invoke-virtual {v7, v13}, Lcom/android/dx/ssa/SsaBasicBlock;->insertNewSuccessor(Lcom/android/dx/ssa/SsaBasicBlock;)Lcom/android/dx/ssa/SsaBasicBlock;

    .line 92
    .line 93
    .line 94
    move-result-object v14

    .line 95
    new-instance v7, Lcom/android/dx/rop/code/ThrowingCstInsn;

    .line 96
    .line 97
    sget-object v9, Lcom/android/dx/rop/code/SourcePosition;->NO_INFO:Lcom/android/dx/rop/code/SourcePosition;

    .line 98
    .line 99
    sget-object v10, Lcom/android/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 100
    .line 101
    sget-object v11, Lcom/android/dx/rop/type/StdTypeList;->EMPTY:Lcom/android/dx/rop/type/StdTypeList;

    .line 102
    .line 103
    invoke-direct/range {v7 .. v12}, Lcom/android/dx/rop/code/ThrowingCstInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/type/TypeList;Lcom/android/dx/rop/cst/Constant;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v14, v7}, Lcom/android/dx/ssa/SsaBasicBlock;->replaceLastInsn(Lcom/android/dx/rop/code/Insn;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v14, v13}, Lcom/android/dx/ssa/SsaBasicBlock;->insertNewSuccessor(Lcom/android/dx/ssa/SsaBasicBlock;)Lcom/android/dx/ssa/SsaBasicBlock;

    .line 110
    .line 111
    .line 112
    move-result-object v7

    .line 113
    new-instance v8, Lcom/android/dx/rop/code/PlainInsn;

    .line 114
    .line 115
    invoke-virtual {v6}, Lcom/android/dx/rop/code/RegisterSpec;->getTypeBearer()Lcom/android/dx/rop/type/TypeBearer;

    .line 116
    .line 117
    .line 118
    move-result-object v11

    .line 119
    invoke-static {v11}, Lcom/android/dx/rop/code/Rops;->opMoveResultPseudo(Lcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/Rop;

    .line 120
    .line 121
    .line 122
    move-result-object v11

    .line 123
    invoke-direct {v8, v11, v9, v6, v10}, Lcom/android/dx/rop/code/PlainInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v7, v8}, Lcom/android/dx/ssa/SsaBasicBlock;->addInsnToHead(Lcom/android/dx/rop/code/Insn;)V

    .line 127
    .line 128
    .line 129
    :goto_1
    invoke-virtual {v4, v12, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    add-int/lit8 v5, v5, 0x1

    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_1
    invoke-direct {p0, v4, v0}, Lcom/android/dx/ssa/ConstCollector;->updateConstUses(Ljava/util/HashMap;I)V

    .line 136
    .line 137
    .line 138
    return-void
.end method

.method private updateConstUses(Ljava/util/HashMap;I)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Lcom/android/dx/rop/cst/TypedConstant;",
            "Lcom/android/dx/rop/code/RegisterSpec;",
            ">;I)V"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/android/dx/ssa/ConstCollector;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/android/dx/ssa/SsaMethod;->getUseListCopy()[Ljava/util/ArrayList;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x0

    .line 13
    :goto_0
    if-ge v1, p2, :cond_6

    .line 14
    .line 15
    iget-object v2, p0, Lcom/android/dx/ssa/ConstCollector;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 16
    .line 17
    invoke-virtual {v2, v1}, Lcom/android/dx/ssa/SsaMethod;->getDefinitionForRegister(I)Lcom/android/dx/ssa/SsaInsn;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    if-nez v2, :cond_0

    .line 22
    .line 23
    goto :goto_2

    .line 24
    :cond_0
    invoke-virtual {v2}, Lcom/android/dx/ssa/SsaInsn;->getResult()Lcom/android/dx/rop/code/RegisterSpec;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-virtual {v2}, Lcom/android/dx/ssa/SsaInsn;->getResult()Lcom/android/dx/rop/code/RegisterSpec;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v2}, Lcom/android/dx/rop/code/RegisterSpec;->getTypeBearer()Lcom/android/dx/rop/type/TypeBearer;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-interface {v2}, Lcom/android/dx/rop/type/TypeBearer;->isConstant()Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-nez v4, :cond_1

    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_1
    check-cast v2, Lcom/android/dx/rop/cst/TypedConstant;

    .line 44
    .line 45
    invoke-virtual {p1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    check-cast v2, Lcom/android/dx/rop/code/RegisterSpec;

    .line 50
    .line 51
    if-nez v2, :cond_2

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_2
    iget-object v4, p0, Lcom/android/dx/ssa/ConstCollector;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 55
    .line 56
    invoke-virtual {v4, v3}, Lcom/android/dx/ssa/SsaMethod;->isRegALocal(Lcom/android/dx/rop/code/RegisterSpec;)Z

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    if-eqz v4, :cond_3

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_3
    new-instance v4, Lcom/android/dx/ssa/ConstCollector$2;

    .line 64
    .line 65
    invoke-direct {v4, p0, v3, v2}, Lcom/android/dx/ssa/ConstCollector$2;-><init>(Lcom/android/dx/ssa/ConstCollector;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpec;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v3}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    aget-object v2, v0, v2

    .line 73
    .line 74
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    if-eqz v3, :cond_5

    .line 83
    .line 84
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    check-cast v3, Lcom/android/dx/ssa/SsaInsn;

    .line 89
    .line 90
    invoke-virtual {v3}, Lcom/android/dx/ssa/SsaInsn;->canThrow()Z

    .line 91
    .line 92
    .line 93
    move-result v5

    .line 94
    if-eqz v5, :cond_4

    .line 95
    .line 96
    invoke-virtual {v3}, Lcom/android/dx/ssa/SsaInsn;->getBlock()Lcom/android/dx/ssa/SsaBasicBlock;

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    invoke-virtual {v5}, Lcom/android/dx/ssa/SsaBasicBlock;->getSuccessors()Ljava/util/BitSet;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    invoke-virtual {v5}, Ljava/util/BitSet;->cardinality()I

    .line 105
    .line 106
    .line 107
    move-result v5

    .line 108
    const/4 v6, 0x1

    .line 109
    if-le v5, v6, :cond_4

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_4
    invoke-virtual {v3, v4}, Lcom/android/dx/ssa/SsaInsn;->mapSourceRegisters(Lcom/android/dx/ssa/RegisterMapper;)V

    .line 113
    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_5
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_6
    return-void
.end method
