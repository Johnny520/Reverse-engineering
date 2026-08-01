.class public Lcom/android/dx/ssa/LocalVariableExtractor;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field private final blocks:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/android/dx/ssa/SsaBasicBlock;",
            ">;"
        }
    .end annotation
.end field

.field private final method:Lcom/android/dx/ssa/SsaMethod;

.field private final resultInfo:Lcom/android/dx/ssa/LocalVariableInfo;

.field private final workSet:Ljava/util/BitSet;


# direct methods
.method private constructor <init>(Lcom/android/dx/ssa/SsaMethod;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaMethod;->getBlocks()Ljava/util/ArrayList;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object p1, p0, Lcom/android/dx/ssa/LocalVariableExtractor;->method:Lcom/android/dx/ssa/SsaMethod;

    .line 11
    .line 12
    iput-object v0, p0, Lcom/android/dx/ssa/LocalVariableExtractor;->blocks:Ljava/util/ArrayList;

    .line 13
    .line 14
    new-instance v1, Lcom/android/dx/ssa/LocalVariableInfo;

    .line 15
    .line 16
    invoke-direct {v1, p1}, Lcom/android/dx/ssa/LocalVariableInfo;-><init>(Lcom/android/dx/ssa/SsaMethod;)V

    .line 17
    .line 18
    .line 19
    iput-object v1, p0, Lcom/android/dx/ssa/LocalVariableExtractor;->resultInfo:Lcom/android/dx/ssa/LocalVariableInfo;

    .line 20
    .line 21
    new-instance p1, Ljava/util/BitSet;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-direct {p1, v0}, Ljava/util/BitSet;-><init>(I)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lcom/android/dx/ssa/LocalVariableExtractor;->workSet:Ljava/util/BitSet;

    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    const-string p0, "method == null"

    .line 34
    .line 35
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const/4 p0, 0x0

    .line 39
    throw p0
.end method

.method private doit()Lcom/android/dx/ssa/LocalVariableInfo;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/android/dx/ssa/LocalVariableExtractor;->method:Lcom/android/dx/ssa/SsaMethod;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/dx/ssa/SsaMethod;->getRegCount()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-lez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/android/dx/ssa/LocalVariableExtractor;->method:Lcom/android/dx/ssa/SsaMethod;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/android/dx/ssa/SsaMethod;->getEntryBlockIndex()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    :goto_0
    if-ltz v0, :cond_0

    .line 16
    .line 17
    iget-object v1, p0, Lcom/android/dx/ssa/LocalVariableExtractor;->workSet:Ljava/util/BitSet;

    .line 18
    .line 19
    invoke-virtual {v1, v0}, Ljava/util/BitSet;->clear(I)V

    .line 20
    .line 21
    .line 22
    invoke-direct {p0, v0}, Lcom/android/dx/ssa/LocalVariableExtractor;->processBlock(I)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lcom/android/dx/ssa/LocalVariableExtractor;->workSet:Ljava/util/BitSet;

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    invoke-virtual {v0, v1}, Ljava/util/BitSet;->nextSetBit(I)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    iget-object v0, p0, Lcom/android/dx/ssa/LocalVariableExtractor;->resultInfo:Lcom/android/dx/ssa/LocalVariableInfo;

    .line 34
    .line 35
    invoke-virtual {v0}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 36
    .line 37
    .line 38
    iget-object p0, p0, Lcom/android/dx/ssa/LocalVariableExtractor;->resultInfo:Lcom/android/dx/ssa/LocalVariableInfo;

    .line 39
    .line 40
    return-object p0
.end method

.method public static extract(Lcom/android/dx/ssa/SsaMethod;)Lcom/android/dx/ssa/LocalVariableInfo;
    .locals 1

    .line 1
    new-instance v0, Lcom/android/dx/ssa/LocalVariableExtractor;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/android/dx/ssa/LocalVariableExtractor;-><init>(Lcom/android/dx/ssa/SsaMethod;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {v0}, Lcom/android/dx/ssa/LocalVariableExtractor;->doit()Lcom/android/dx/ssa/LocalVariableInfo;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method private processBlock(I)V
    .locals 13

    .line 1
    iget-object v0, p0, Lcom/android/dx/ssa/LocalVariableExtractor;->resultInfo:Lcom/android/dx/ssa/LocalVariableInfo;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/android/dx/ssa/LocalVariableInfo;->mutableCopyOfStarts(I)Lcom/android/dx/rop/code/RegisterSpecSet;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/android/dx/ssa/LocalVariableExtractor;->blocks:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Lcom/android/dx/ssa/SsaBasicBlock;

    .line 14
    .line 15
    invoke-virtual {v1}, Lcom/android/dx/ssa/SsaBasicBlock;->getInsns()Ljava/util/ArrayList;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    iget-object v4, p0, Lcom/android/dx/ssa/LocalVariableExtractor;->method:Lcom/android/dx/ssa/SsaMethod;

    .line 24
    .line 25
    invoke-virtual {v4}, Lcom/android/dx/ssa/SsaMethod;->getExitBlockIndex()I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-ne p1, v4, :cond_0

    .line 30
    .line 31
    goto/16 :goto_5

    .line 32
    .line 33
    :cond_0
    add-int/lit8 p1, v3, -0x1

    .line 34
    .line 35
    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    check-cast v4, Lcom/android/dx/ssa/SsaInsn;

    .line 40
    .line 41
    invoke-virtual {v4}, Lcom/android/dx/ssa/SsaInsn;->getOriginalRopInsn()Lcom/android/dx/rop/code/Insn;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    invoke-virtual {v5}, Lcom/android/dx/rop/code/Insn;->getCatches()Lcom/android/dx/rop/type/TypeList;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    invoke-interface {v5}, Lcom/android/dx/rop/type/TypeList;->size()I

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    const/4 v6, 0x0

    .line 54
    if-eqz v5, :cond_1

    .line 55
    .line 56
    invoke-virtual {v4}, Lcom/android/dx/ssa/SsaInsn;->getResult()Lcom/android/dx/rop/code/RegisterSpec;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    if-eqz v4, :cond_1

    .line 61
    .line 62
    const/4 v4, 0x1

    .line 63
    goto :goto_0

    .line 64
    :cond_1
    move v4, v6

    .line 65
    :goto_0
    move-object v7, v0

    .line 66
    move v5, v6

    .line 67
    :goto_1
    if-ge v5, v3, :cond_6

    .line 68
    .line 69
    if-eqz v4, :cond_2

    .line 70
    .line 71
    if-ne v5, p1, :cond_2

    .line 72
    .line 73
    invoke-virtual {v7}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v7}, Lcom/android/dx/rop/code/RegisterSpecSet;->mutableCopy()Lcom/android/dx/rop/code/RegisterSpecSet;

    .line 77
    .line 78
    .line 79
    move-result-object v7

    .line 80
    :cond_2
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v8

    .line 84
    check-cast v8, Lcom/android/dx/ssa/SsaInsn;

    .line 85
    .line 86
    invoke-virtual {v8}, Lcom/android/dx/ssa/SsaInsn;->getLocalAssignment()Lcom/android/dx/rop/code/RegisterSpec;

    .line 87
    .line 88
    .line 89
    move-result-object v9

    .line 90
    if-nez v9, :cond_3

    .line 91
    .line 92
    invoke-virtual {v8}, Lcom/android/dx/ssa/SsaInsn;->getResult()Lcom/android/dx/rop/code/RegisterSpec;

    .line 93
    .line 94
    .line 95
    move-result-object v8

    .line 96
    if-eqz v8, :cond_5

    .line 97
    .line 98
    invoke-virtual {v8}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 99
    .line 100
    .line 101
    move-result v9

    .line 102
    invoke-virtual {v7, v9}, Lcom/android/dx/rop/code/RegisterSpecSet;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 103
    .line 104
    .line 105
    move-result-object v9

    .line 106
    if-eqz v9, :cond_5

    .line 107
    .line 108
    invoke-virtual {v8}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 109
    .line 110
    .line 111
    move-result v8

    .line 112
    invoke-virtual {v7, v8}, Lcom/android/dx/rop/code/RegisterSpecSet;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 113
    .line 114
    .line 115
    move-result-object v8

    .line 116
    invoke-virtual {v7, v8}, Lcom/android/dx/rop/code/RegisterSpecSet;->remove(Lcom/android/dx/rop/code/RegisterSpec;)V

    .line 117
    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_3
    invoke-virtual {v9}, Lcom/android/dx/rop/code/RegisterSpec;->withSimpleType()Lcom/android/dx/rop/code/RegisterSpec;

    .line 121
    .line 122
    .line 123
    move-result-object v9

    .line 124
    invoke-virtual {v7, v9}, Lcom/android/dx/rop/code/RegisterSpecSet;->get(Lcom/android/dx/rop/code/RegisterSpec;)Lcom/android/dx/rop/code/RegisterSpec;

    .line 125
    .line 126
    .line 127
    move-result-object v10

    .line 128
    invoke-virtual {v9, v10}, Lcom/android/dx/rop/code/RegisterSpec;->equals(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v10

    .line 132
    if-nez v10, :cond_5

    .line 133
    .line 134
    invoke-virtual {v9}, Lcom/android/dx/rop/code/RegisterSpec;->getLocalItem()Lcom/android/dx/rop/code/LocalItem;

    .line 135
    .line 136
    .line 137
    move-result-object v10

    .line 138
    invoke-virtual {v7, v10}, Lcom/android/dx/rop/code/RegisterSpecSet;->localItemToSpec(Lcom/android/dx/rop/code/LocalItem;)Lcom/android/dx/rop/code/RegisterSpec;

    .line 139
    .line 140
    .line 141
    move-result-object v10

    .line 142
    if-eqz v10, :cond_4

    .line 143
    .line 144
    invoke-virtual {v10}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 145
    .line 146
    .line 147
    move-result v11

    .line 148
    invoke-virtual {v9}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 149
    .line 150
    .line 151
    move-result v12

    .line 152
    if-eq v11, v12, :cond_4

    .line 153
    .line 154
    invoke-virtual {v7, v10}, Lcom/android/dx/rop/code/RegisterSpecSet;->remove(Lcom/android/dx/rop/code/RegisterSpec;)V

    .line 155
    .line 156
    .line 157
    :cond_4
    iget-object v10, p0, Lcom/android/dx/ssa/LocalVariableExtractor;->resultInfo:Lcom/android/dx/ssa/LocalVariableInfo;

    .line 158
    .line 159
    invoke-virtual {v10, v8, v9}, Lcom/android/dx/ssa/LocalVariableInfo;->addAssignment(Lcom/android/dx/ssa/SsaInsn;Lcom/android/dx/rop/code/RegisterSpec;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v7, v9}, Lcom/android/dx/rop/code/RegisterSpecSet;->put(Lcom/android/dx/rop/code/RegisterSpec;)V

    .line 163
    .line 164
    .line 165
    :cond_5
    :goto_2
    add-int/lit8 v5, v5, 0x1

    .line 166
    .line 167
    goto :goto_1

    .line 168
    :cond_6
    invoke-virtual {v7}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v1}, Lcom/android/dx/ssa/SsaBasicBlock;->getSuccessorList()Lcom/android/dx/util/IntList;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    invoke-virtual {p1}, Lcom/android/dx/util/IntList;->size()I

    .line 176
    .line 177
    .line 178
    move-result v2

    .line 179
    invoke-virtual {v1}, Lcom/android/dx/ssa/SsaBasicBlock;->getPrimarySuccessorIndex()I

    .line 180
    .line 181
    .line 182
    move-result v1

    .line 183
    :goto_3
    if-ge v6, v2, :cond_9

    .line 184
    .line 185
    invoke-virtual {p1, v6}, Lcom/android/dx/util/IntList;->get(I)I

    .line 186
    .line 187
    .line 188
    move-result v3

    .line 189
    if-ne v3, v1, :cond_7

    .line 190
    .line 191
    move-object v4, v7

    .line 192
    goto :goto_4

    .line 193
    :cond_7
    move-object v4, v0

    .line 194
    :goto_4
    iget-object v5, p0, Lcom/android/dx/ssa/LocalVariableExtractor;->resultInfo:Lcom/android/dx/ssa/LocalVariableInfo;

    .line 195
    .line 196
    invoke-virtual {v5, v3, v4}, Lcom/android/dx/ssa/LocalVariableInfo;->mergeStarts(ILcom/android/dx/rop/code/RegisterSpecSet;)Z

    .line 197
    .line 198
    .line 199
    move-result v4

    .line 200
    if-eqz v4, :cond_8

    .line 201
    .line 202
    iget-object v4, p0, Lcom/android/dx/ssa/LocalVariableExtractor;->workSet:Ljava/util/BitSet;

    .line 203
    .line 204
    invoke-virtual {v4, v3}, Ljava/util/BitSet;->set(I)V

    .line 205
    .line 206
    .line 207
    :cond_8
    add-int/lit8 v6, v6, 0x1

    .line 208
    .line 209
    goto :goto_3

    .line 210
    :cond_9
    :goto_5
    return-void
.end method
