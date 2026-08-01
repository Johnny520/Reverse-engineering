.class public final Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪苏世兰哲;
.super Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏兰哲世;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏兰哲;


# instance fields
.field public 飘花落叶言子楪兰世哲苏:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Expression;

.field public 飘花落叶言子楪兰世苏哲:Ljava/util/List;

.field public 飘花落叶言子楪兰苏世哲:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Effect$InvocationKind;

.field public 飘花落叶言子楪兰苏哲世:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Effect$EffectConditionKind;

.field public 飘花落叶言子楪哲兰世苏:I

.field public 飘花落叶言子楪哲兰苏世:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Effect$EffectType;


# virtual methods
.method public final build()Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲()Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Effect;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Effect;->isInitialized()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance v0, Lkotlin/reflect/jvm/internal/impl/protobuf/UninitializedMessageException;

    .line 13
    .line 14
    invoke-direct {v0, p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/UninitializedMessageException;-><init>(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;)V

    .line 15
    .line 16
    .line 17
    throw v0
.end method

.method public final clone()Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪苏世兰哲;

    .line 2
    .line 3
    invoke-direct {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏兰哲世;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Effect$EffectType;->RETURNS_CONSTANT:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Effect$EffectType;

    .line 7
    .line 8
    iput-object v1, v0, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰苏世:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Effect$EffectType;

    .line 9
    .line 10
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 11
    .line 12
    iput-object v1, v0, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰世苏哲:Ljava/util/List;

    .line 13
    .line 14
    invoke-static {}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Expression;->getDefaultInstance()Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Expression;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    iput-object v1, v0, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰世哲苏:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Expression;

    .line 19
    .line 20
    sget-object v1, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Effect$InvocationKind;->AT_MOST_ONCE:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Effect$InvocationKind;

    .line 21
    .line 22
    iput-object v1, v0, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰苏世哲:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Effect$InvocationKind;

    .line 23
    .line 24
    sget-object v1, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Effect$EffectConditionKind;->CONCLUSION_CONDITION:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Effect$EffectConditionKind;

    .line 25
    .line 26
    iput-object v1, v0, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰苏哲世:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Effect$EffectConditionKind;

    .line 27
    .line 28
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲()Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Effect;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {v0, p0}, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Effect;)V

    .line 33
    .line 34
    .line 35
    return-object v0
.end method

.method public final 飘花落叶言子楪世哲苏兰(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Effect;)V
    .locals 4

    .line 1
    invoke-static {}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Effect;->getDefaultInstance()Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Effect;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-ne p1, v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Effect;->hasEffectType()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Effect;->getEffectType()Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Effect$EffectType;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iget v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:I

    .line 22
    .line 23
    or-int/lit8 v1, v1, 0x1

    .line 24
    .line 25
    iput v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:I

    .line 26
    .line 27
    iput-object v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰苏世:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Effect$EffectType;

    .line 28
    .line 29
    :cond_1
    invoke-static {p1}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Effect;->access$26400(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Effect;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_4

    .line 38
    .line 39
    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰世苏哲:Ljava/util/List;

    .line 40
    .line 41
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    invoke-static {p1}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Effect;->access$26400(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Effect;)Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iput-object v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰世苏哲:Ljava/util/List;

    .line 52
    .line 53
    iget v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:I

    .line 54
    .line 55
    and-int/lit8 v0, v0, -0x3

    .line 56
    .line 57
    iput v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:I

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    iget v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:I

    .line 61
    .line 62
    const/4 v1, 0x2

    .line 63
    and-int/2addr v0, v1

    .line 64
    if-eq v0, v1, :cond_3

    .line 65
    .line 66
    new-instance v0, Ljava/util/ArrayList;

    .line 67
    .line 68
    iget-object v2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰世苏哲:Ljava/util/List;

    .line 69
    .line 70
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 71
    .line 72
    .line 73
    iput-object v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰世苏哲:Ljava/util/List;

    .line 74
    .line 75
    iget v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:I

    .line 76
    .line 77
    or-int/2addr v0, v1

    .line 78
    iput v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:I

    .line 79
    .line 80
    :cond_3
    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰世苏哲:Ljava/util/List;

    .line 81
    .line 82
    invoke-static {p1}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Effect;->access$26400(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Effect;)Ljava/util/List;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 87
    .line 88
    .line 89
    :cond_4
    :goto_0
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Effect;->hasConclusionOfConditionalEffect()Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-eqz v0, :cond_6

    .line 94
    .line 95
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Effect;->getConclusionOfConditionalEffect()Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Expression;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    iget v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:I

    .line 100
    .line 101
    const/4 v2, 0x4

    .line 102
    and-int/2addr v1, v2

    .line 103
    if-ne v1, v2, :cond_5

    .line 104
    .line 105
    iget-object v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰世哲苏:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Expression;

    .line 106
    .line 107
    invoke-static {}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Expression;->getDefaultInstance()Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Expression;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    if-eq v1, v3, :cond_5

    .line 112
    .line 113
    iget-object v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰世哲苏:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Expression;

    .line 114
    .line 115
    invoke-static {v1}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Expression;->newBuilder(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Expression;)Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪苏兰哲世;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    invoke-virtual {v1, v0}, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Expression;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v1}, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲()Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Expression;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    iput-object v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰世哲苏:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Expression;

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_5
    iput-object v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰世哲苏:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Expression;

    .line 130
    .line 131
    :goto_1
    iget v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:I

    .line 132
    .line 133
    or-int/2addr v0, v2

    .line 134
    iput v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:I

    .line 135
    .line 136
    :cond_6
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Effect;->hasKind()Z

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    if-eqz v0, :cond_7

    .line 141
    .line 142
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Effect;->getKind()Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Effect$InvocationKind;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    iget v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:I

    .line 150
    .line 151
    or-int/lit8 v1, v1, 0x8

    .line 152
    .line 153
    iput v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:I

    .line 154
    .line 155
    iput-object v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰苏世哲:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Effect$InvocationKind;

    .line 156
    .line 157
    :cond_7
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Effect;->hasConditionKind()Z

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    if-eqz v0, :cond_8

    .line 162
    .line 163
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Effect;->getConditionKind()Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Effect$EffectConditionKind;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    iget v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:I

    .line 171
    .line 172
    or-int/lit8 v1, v1, 0x10

    .line 173
    .line 174
    iput v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:I

    .line 175
    .line 176
    iput-object v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰苏哲世:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Effect$EffectConditionKind;

    .line 177
    .line 178
    :cond_8
    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲苏兰世:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;

    .line 179
    .line 180
    invoke-static {p1}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Effect;->access$26900(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Effect;)Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    invoke-virtual {v0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;)Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲苏兰世:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;

    .line 189
    .line 190
    return-void
.end method

.method public final 飘花落叶言子楪世苏兰哲()Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Effect;
    .locals 5

    .line 1
    new-instance v0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Effect;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Effect;-><init>(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏兰哲世;L飘花落叶言世楪哲苏子兰/飘花落叶言子楪世苏哲兰;)V

    .line 5
    .line 6
    .line 7
    iget v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:I

    .line 8
    .line 9
    and-int/lit8 v2, v1, 0x1

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    if-ne v2, v3, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v3, 0x0

    .line 16
    :goto_0
    iget-object v2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰苏世:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Effect$EffectType;

    .line 17
    .line 18
    invoke-static {v0, v2}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Effect;->access$26302(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Effect;Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Effect$EffectType;)Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Effect$EffectType;

    .line 19
    .line 20
    .line 21
    iget v2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:I

    .line 22
    .line 23
    const/4 v4, 0x2

    .line 24
    and-int/2addr v2, v4

    .line 25
    if-ne v2, v4, :cond_1

    .line 26
    .line 27
    iget-object v2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰世苏哲:Ljava/util/List;

    .line 28
    .line 29
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    iput-object v2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰世苏哲:Ljava/util/List;

    .line 34
    .line 35
    iget v2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:I

    .line 36
    .line 37
    and-int/lit8 v2, v2, -0x3

    .line 38
    .line 39
    iput v2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:I

    .line 40
    .line 41
    :cond_1
    iget-object v2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰世苏哲:Ljava/util/List;

    .line 42
    .line 43
    invoke-static {v0, v2}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Effect;->access$26402(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Effect;Ljava/util/List;)Ljava/util/List;

    .line 44
    .line 45
    .line 46
    and-int/lit8 v2, v1, 0x4

    .line 47
    .line 48
    const/4 v4, 0x4

    .line 49
    if-ne v2, v4, :cond_2

    .line 50
    .line 51
    or-int/lit8 v3, v3, 0x2

    .line 52
    .line 53
    :cond_2
    iget-object v2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰世哲苏:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Expression;

    .line 54
    .line 55
    invoke-static {v0, v2}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Effect;->access$26502(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Effect;Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Expression;)Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Expression;

    .line 56
    .line 57
    .line 58
    and-int/lit8 v2, v1, 0x8

    .line 59
    .line 60
    const/16 v4, 0x8

    .line 61
    .line 62
    if-ne v2, v4, :cond_3

    .line 63
    .line 64
    or-int/lit8 v3, v3, 0x4

    .line 65
    .line 66
    :cond_3
    iget-object v2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰苏世哲:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Effect$InvocationKind;

    .line 67
    .line 68
    invoke-static {v0, v2}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Effect;->access$26602(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Effect;Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Effect$InvocationKind;)Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Effect$InvocationKind;

    .line 69
    .line 70
    .line 71
    const/16 v2, 0x10

    .line 72
    .line 73
    and-int/2addr v1, v2

    .line 74
    if-ne v1, v2, :cond_4

    .line 75
    .line 76
    or-int/lit8 v3, v3, 0x8

    .line 77
    .line 78
    :cond_4
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰苏哲世:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Effect$EffectConditionKind;

    .line 79
    .line 80
    invoke-static {v0, p0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Effect;->access$26702(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Effect;Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Effect$EffectConditionKind;)Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Effect$EffectConditionKind;

    .line 81
    .line 82
    .line 83
    invoke-static {v0, v3}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Effect;->access$26802(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Effect;I)I

    .line 84
    .line 85
    .line 86
    return-object v0
.end method

.method public final bridge synthetic 飘花落叶言子楪世苏哲兰(Lkotlin/reflect/jvm/internal/impl/protobuf/GeneratedMessageLite;)Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏兰哲世;
    .locals 0

    .line 1
    check-cast p1, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Effect;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Effect;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final 飘花落叶言子楪苏世哲兰(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏世兰哲;)Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪兰哲苏世;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    sget-object v1, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Effect;->PARSER:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪哲苏兰;

    .line 3
    .line 4
    invoke-interface {v1, p1, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪世苏哲兰(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏世兰哲;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Effect;
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Effect;)V

    .line 11
    .line 12
    .line 13
    return-object p0

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    goto :goto_0

    .line 16
    :catch_0
    move-exception p1

    .line 17
    :try_start_1
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->getUnfinishedMessage()Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    check-cast p2, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Effect;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    .line 23
    :try_start_2
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 24
    :catchall_1
    move-exception p1

    .line 25
    move-object v0, p2

    .line 26
    :goto_0
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-virtual {p0, v0}, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Effect;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    throw p1
.end method
