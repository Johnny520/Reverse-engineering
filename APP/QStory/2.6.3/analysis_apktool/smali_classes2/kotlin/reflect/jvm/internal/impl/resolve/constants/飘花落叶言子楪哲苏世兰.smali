.class public abstract Lkotlin/reflect/jvm/internal/impl/resolve/constants/飘花落叶言子楪哲苏世兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# direct methods
.method public static 飘花落叶言子楪世苏哲兰(Ljava/util/ArrayList;)Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世楪兰哲苏;
    .locals 8

    .line 1
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/resolve/constants/IntegerLiteralTypeConstructor$Companion$Mode;->INTERSECTION_TYPE:Lkotlin/reflect/jvm/internal/impl/resolve/constants/IntegerLiteralTypeConstructor$Companion$Mode;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    return-object v2

    .line 11
    :cond_0
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_b

    .line 20
    .line 21
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_a

    .line 30
    .line 31
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    check-cast v3, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世楪兰哲苏;

    .line 36
    .line 37
    check-cast v1, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世楪兰哲苏;

    .line 38
    .line 39
    if-eqz v1, :cond_8

    .line 40
    .line 41
    if-nez v3, :cond_1

    .line 42
    .line 43
    goto/16 :goto_4

    .line 44
    .line 45
    :cond_1
    invoke-virtual {v1}, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世楪苏兰哲;->飘花落叶言子世楪兰哲苏()Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲兰苏楪;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    invoke-virtual {v3}, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世楪苏兰哲;->飘花落叶言子世楪兰哲苏()Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲兰苏楪;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    instance-of v6, v4, Lkotlin/reflect/jvm/internal/impl/resolve/constants/飘花落叶言子楪哲苏兰世;

    .line 54
    .line 55
    if-eqz v6, :cond_7

    .line 56
    .line 57
    instance-of v7, v5, Lkotlin/reflect/jvm/internal/impl/resolve/constants/飘花落叶言子楪哲苏兰世;

    .line 58
    .line 59
    if-eqz v7, :cond_7

    .line 60
    .line 61
    check-cast v4, Lkotlin/reflect/jvm/internal/impl/resolve/constants/飘花落叶言子楪哲苏兰世;

    .line 62
    .line 63
    iget-object v1, v4, Lkotlin/reflect/jvm/internal/impl/resolve/constants/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏兰世:Ljava/util/Set;

    .line 64
    .line 65
    check-cast v5, Lkotlin/reflect/jvm/internal/impl/resolve/constants/飘花落叶言子楪哲苏兰世;

    .line 66
    .line 67
    iget-object v3, v5, Lkotlin/reflect/jvm/internal/impl/resolve/constants/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏兰世:Ljava/util/Set;

    .line 68
    .line 69
    sget-object v4, Lkotlin/reflect/jvm/internal/impl/resolve/constants/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰:[I

    .line 70
    .line 71
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    aget v4, v4, v5

    .line 76
    .line 77
    const/4 v5, 0x1

    .line 78
    if-eq v4, v5, :cond_3

    .line 79
    .line 80
    const/4 v6, 0x2

    .line 81
    if-ne v4, v6, :cond_2

    .line 82
    .line 83
    check-cast v1, Ljava/lang/Iterable;

    .line 84
    .line 85
    check-cast v3, Ljava/lang/Iterable;

    .line 86
    .line 87
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    invoke-static {v1}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子兰哲世苏楪(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-static {v3, v1}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子哲世楪苏兰(Ljava/lang/Iterable;Ljava/util/Collection;)V

    .line 98
    .line 99
    .line 100
    goto :goto_3

    .line 101
    :cond_2
    invoke-static {}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰世苏()V

    .line 102
    .line 103
    .line 104
    return-object v2

    .line 105
    :cond_3
    check-cast v1, Ljava/lang/Iterable;

    .line 106
    .line 107
    check-cast v3, Ljava/lang/Iterable;

    .line 108
    .line 109
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    instance-of v4, v3, Ljava/util/Collection;

    .line 116
    .line 117
    if-eqz v4, :cond_4

    .line 118
    .line 119
    check-cast v3, Ljava/util/Collection;

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_4
    invoke-static {v3}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子兰苏哲世楪(Ljava/lang/Iterable;)Ljava/util/List;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    :goto_1
    new-instance v4, Ljava/util/LinkedHashSet;

    .line 127
    .line 128
    invoke-direct {v4}, Ljava/util/LinkedHashSet;-><init>()V

    .line 129
    .line 130
    .line 131
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    :cond_5
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 136
    .line 137
    .line 138
    move-result v6

    .line 139
    if-eqz v6, :cond_6

    .line 140
    .line 141
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v6

    .line 145
    invoke-interface {v3, v6}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v7

    .line 149
    if-eqz v7, :cond_5

    .line 150
    .line 151
    invoke-interface {v4, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    goto :goto_2

    .line 155
    :cond_6
    move-object v1, v4

    .line 156
    :goto_3
    new-instance v3, Lkotlin/reflect/jvm/internal/impl/resolve/constants/飘花落叶言子楪哲苏兰世;

    .line 157
    .line 158
    invoke-direct {v3, v1}, Lkotlin/reflect/jvm/internal/impl/resolve/constants/飘花落叶言子楪哲苏兰世;-><init>(Ljava/util/Set;)V

    .line 159
    .line 160
    .line 161
    sget-object v1, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪哲兰世苏:Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪苏兰;

    .line 162
    .line 163
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    sget-object v1, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪哲兰苏世:Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪兰苏;

    .line 167
    .line 168
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    sget-object v4, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 172
    .line 173
    sget-object v6, Lkotlin/reflect/jvm/internal/impl/types/error/ErrorScopeKind;->INTEGER_LITERAL_TYPE_SCOPE:Lkotlin/reflect/jvm/internal/impl/types/error/ErrorScopeKind;

    .line 174
    .line 175
    const-string v7, "unknown integer literal type"

    .line 176
    .line 177
    filled-new-array {v7}, [Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v7

    .line 181
    invoke-static {v6, v5, v7}, L飘花落叶言世苏子哲兰楪/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰(Lkotlin/reflect/jvm/internal/impl/types/error/ErrorScopeKind;Z[Ljava/lang/String;)L飘花落叶言世苏子哲兰楪/飘花落叶言子楪世兰哲苏;

    .line 182
    .line 183
    .line 184
    move-result-object v5

    .line 185
    const/4 v6, 0x0

    .line 186
    invoke-static {v4, v1, v3, v5, v6}, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏哲世(Ljava/util/List;Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪兰苏;Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲兰苏楪;L飘花落叶言世苏子楪哲兰/飘花落叶言子楪哲世兰苏;Z)Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世楪兰哲苏;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    goto/16 :goto_0

    .line 191
    .line 192
    :cond_7
    if-eqz v6, :cond_9

    .line 193
    .line 194
    check-cast v4, Lkotlin/reflect/jvm/internal/impl/resolve/constants/飘花落叶言子楪哲苏兰世;

    .line 195
    .line 196
    iget-object v1, v4, Lkotlin/reflect/jvm/internal/impl/resolve/constants/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏兰世:Ljava/util/Set;

    .line 197
    .line 198
    invoke-interface {v1, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result v1

    .line 202
    if-eqz v1, :cond_8

    .line 203
    .line 204
    move-object v1, v3

    .line 205
    goto/16 :goto_0

    .line 206
    .line 207
    :cond_8
    :goto_4
    move-object v1, v2

    .line 208
    goto/16 :goto_0

    .line 209
    .line 210
    :cond_9
    instance-of v3, v5, Lkotlin/reflect/jvm/internal/impl/resolve/constants/飘花落叶言子楪哲苏兰世;

    .line 211
    .line 212
    if-eqz v3, :cond_8

    .line 213
    .line 214
    check-cast v5, Lkotlin/reflect/jvm/internal/impl/resolve/constants/飘花落叶言子楪哲苏兰世;

    .line 215
    .line 216
    iget-object v3, v5, Lkotlin/reflect/jvm/internal/impl/resolve/constants/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏兰世:Ljava/util/Set;

    .line 217
    .line 218
    invoke-interface {v3, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    move-result v3

    .line 222
    if-eqz v3, :cond_8

    .line 223
    .line 224
    goto/16 :goto_0

    .line 225
    .line 226
    :cond_a
    check-cast v1, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世楪兰哲苏;

    .line 227
    .line 228
    return-object v1

    .line 229
    :cond_b
    const-string p0, "Empty collection can\'t be reduced."

    .line 230
    .line 231
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲世苏兰(Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    return-object v2
.end method
