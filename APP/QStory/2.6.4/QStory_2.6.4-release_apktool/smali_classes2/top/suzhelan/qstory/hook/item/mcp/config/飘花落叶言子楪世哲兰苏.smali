.class public final Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世哲兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# direct methods
.method public static 飘花落叶言子楪世兰哲苏(Ljava/util/ArrayList;)V
    .locals 7

    .line 1
    const-string v0, "\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u545c\u55b5"

    .line 2
    .line 3
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/HashSet;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v1, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    move-object v3, v2

    .line 31
    check-cast v3, Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世兰苏哲;

    .line 32
    .line 33
    iget-object v3, v3, Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {v0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_0

    .line 40
    .line 41
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    sget-object p0, Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲兰世:L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;

    .line 46
    .line 47
    const/16 v0, 0x970

    .line 48
    .line 49
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    new-instance v2, Ljava/util/ArrayList;

    .line 54
    .line 55
    const/16 v3, 0xa

    .line 56
    .line 57
    invoke-static {v1, v3}, Lkotlin/collections/飘花落叶言子楪哲兰苏世;->飘花落叶言子苏世兰哲楪(Ljava/lang/Iterable;I)I

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    if-eqz v5, :cond_2

    .line 73
    .line 74
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    check-cast v5, Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世兰苏哲;

    .line 79
    .line 80
    iget-object v5, v5, Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 81
    .line 82
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_2
    invoke-virtual {p0, v2, v0}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    const/16 v2, 0x971

    .line 98
    .line 99
    if-eqz v0, :cond_3

    .line 100
    .line 101
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    check-cast v0, Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世兰苏哲;

    .line 106
    .line 107
    sget-object v4, Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲兰世:L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;

    .line 108
    .line 109
    new-instance v5, Ljava/lang/StringBuilder;

    .line 110
    .line 111
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 112
    .line 113
    .line 114
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    iget-object v2, v0, Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 122
    .line 123
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    iget-boolean v0, v0, Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏:Z

    .line 131
    .line 132
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-virtual {v4, v0, v2}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_3
    sget-object p0, Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰世哲:Ljava/util/ArrayList;

    .line 141
    .line 142
    new-instance v0, Ljava/util/ArrayList;

    .line 143
    .line 144
    invoke-static {p0, v3}, Lkotlin/collections/飘花落叶言子楪哲兰苏世;->飘花落叶言子苏世兰哲楪(Ljava/lang/Iterable;I)I

    .line 145
    .line 146
    .line 147
    move-result v3

    .line 148
    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 156
    .line 157
    .line 158
    move-result v3

    .line 159
    if-eqz v3, :cond_4

    .line 160
    .line 161
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    check-cast v3, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪哲苏兰世;

    .line 166
    .line 167
    invoke-interface {v3}, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪哲苏兰世;->getId()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v3

    .line 171
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    goto :goto_3

    .line 175
    :cond_4
    new-instance p0, Ljava/util/ArrayList;

    .line 176
    .line 177
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 185
    .line 186
    .line 187
    move-result v3

    .line 188
    if-eqz v3, :cond_8

    .line 189
    .line 190
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v3

    .line 194
    move-object v4, v3

    .line 195
    check-cast v4, Ljava/lang/String;

    .line 196
    .line 197
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 198
    .line 199
    .line 200
    move-result v5

    .line 201
    if-eqz v5, :cond_5

    .line 202
    .line 203
    goto :goto_5

    .line 204
    :cond_5
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 205
    .line 206
    .line 207
    move-result-object v5

    .line 208
    :cond_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 209
    .line 210
    .line 211
    move-result v6

    .line 212
    if-eqz v6, :cond_7

    .line 213
    .line 214
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v6

    .line 218
    check-cast v6, Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世兰苏哲;

    .line 219
    .line 220
    iget-object v6, v6, Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 221
    .line 222
    invoke-static {v6, v4}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    move-result v6

    .line 226
    if-eqz v6, :cond_6

    .line 227
    .line 228
    goto :goto_4

    .line 229
    :cond_7
    :goto_5
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    goto :goto_4

    .line 233
    :cond_8
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 234
    .line 235
    .line 236
    move-result-object p0

    .line 237
    :goto_6
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 238
    .line 239
    .line 240
    move-result v0

    .line 241
    if-eqz v0, :cond_9

    .line 242
    .line 243
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    check-cast v0, Ljava/lang/String;

    .line 248
    .line 249
    sget-object v1, Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲兰世:L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;

    .line 250
    .line 251
    new-instance v3, Ljava/lang/StringBuilder;

    .line 252
    .line 253
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 254
    .line 255
    .line 256
    invoke-static {v3, v0, v2}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世兰苏(Ljava/lang/StringBuilder;Ljava/lang/String;I)Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 261
    .line 262
    invoke-virtual {v1, v3, v0}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    goto :goto_6

    .line 266
    :cond_9
    sget-object p0, Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世哲兰:Lkotlinx/coroutines/internal/飘花落叶言子楪世哲兰苏;

    .line 267
    .line 268
    new-instance v0, Ltop/suzhelan/qstory/hook/item/mcp/config/McpServerManager$Companion$saveToolConfig$6;

    .line 269
    .line 270
    const/4 v1, 0x0

    .line 271
    invoke-direct {v0, v1}, Ltop/suzhelan/qstory/hook/item/mcp/config/McpServerManager$Companion$saveToolConfig$6;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 272
    .line 273
    .line 274
    const/4 v2, 0x3

    .line 275
    invoke-static {p0, v1, v1, v0, v2}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世楪兰苏哲(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Lkotlinx/coroutines/CoroutineStart;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;I)Lkotlinx/coroutines/飘花落叶言子哲楪兰世苏;

    .line 276
    .line 277
    .line 278
    return-void
.end method

.method public static 飘花落叶言子楪世兰苏哲(Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世哲兰苏;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p0, Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世哲兰:Lkotlinx/coroutines/internal/飘花落叶言子楪世哲兰苏;

    .line 5
    .line 6
    new-instance v0, Ltop/suzhelan/qstory/hook/item/mcp/config/McpServerManager$Companion$run$1;

    .line 7
    .line 8
    const/16 v1, 0x2328

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v0, v1, v2}, Ltop/suzhelan/qstory/hook/item/mcp/config/McpServerManager$Companion$run$1;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x3

    .line 15
    invoke-static {p0, v2, v2, v0, v1}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世楪兰苏哲(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Lkotlinx/coroutines/CoroutineStart;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;I)Lkotlinx/coroutines/飘花落叶言子哲楪兰世苏;

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public static 飘花落叶言子楪世哲兰苏(Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世哲兰苏;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p0, Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世哲兰:Lkotlinx/coroutines/internal/飘花落叶言子楪世哲兰苏;

    .line 5
    .line 6
    new-instance v0, Ltop/suzhelan/qstory/hook/item/mcp/config/McpServerManager$Companion$refreshServerForCurrentProcess$1;

    .line 7
    .line 8
    const/16 v1, 0x2328

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v0, v1, v2}, Ltop/suzhelan/qstory/hook/item/mcp/config/McpServerManager$Companion$refreshServerForCurrentProcess$1;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x3

    .line 15
    invoke-static {p0, v2, v2, v0, v1}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世楪兰苏哲(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Lkotlinx/coroutines/CoroutineStart;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;I)Lkotlinx/coroutines/飘花落叶言子哲楪兰世苏;

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public static 飘花落叶言子楪世哲苏兰(Ljava/lang/String;)Z
    .locals 3

    .line 1
    sget-object v0, Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲兰世:L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const/16 v2, 0x971

    .line 9
    .line 10
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    iget-object v0, v0, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言楪兰世子哲苏/飘花落叶言子楪哲世苏兰;

    .line 28
    .line 29
    const/4 v1, 0x1

    .line 30
    invoke-virtual {v0, p0, v1}, L飘花落叶言楪兰世子哲苏/飘花落叶言子楪哲世苏兰;->getBoolean(Ljava/lang/String;Z)Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    return p0
.end method

.method public static 飘花落叶言子楪世苏兰哲()Ljava/util/ArrayList;
    .locals 9

    .line 1
    sget-object v0, Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲兰世:L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    const/16 v1, 0x970

    .line 4
    .line 5
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-virtual {v0, v2}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sget-object v2, Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰世哲:Ljava/util/ArrayList;

    .line 14
    .line 15
    const/16 v3, 0xa

    .line 16
    .line 17
    invoke-static {v2, v3}, Lkotlin/collections/飘花落叶言子楪哲兰苏世;->飘花落叶言子苏世兰哲楪(Ljava/lang/Iterable;I)I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    invoke-static {v4}, Lkotlin/collections/飘花落叶言子世楪苏兰哲;->飘花落叶言子世哲楪兰苏(I)I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    const/16 v5, 0x10

    .line 26
    .line 27
    if-ge v4, v5, :cond_0

    .line 28
    .line 29
    move v4, v5

    .line 30
    :cond_0
    new-instance v5, Ljava/util/LinkedHashMap;

    .line 31
    .line 32
    invoke-direct {v5, v4}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    if-eqz v4, :cond_1

    .line 44
    .line 45
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    move-object v6, v4

    .line 50
    check-cast v6, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪哲苏兰世;

    .line 51
    .line 52
    invoke-interface {v6}, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪哲苏兰世;->getId()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v6

    .line 56
    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    .line 61
    .line 62
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    :cond_2
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    if-eqz v6, :cond_3

    .line 74
    .line 75
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    check-cast v6, Ljava/lang/String;

    .line 80
    .line 81
    invoke-virtual {v5, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    check-cast v6, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪哲苏兰世;

    .line 86
    .line 87
    if-eqz v6, :cond_2

    .line 88
    .line 89
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_3
    sget-object v4, Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰世哲:Ljava/util/ArrayList;

    .line 94
    .line 95
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result v5

    .line 103
    if-eqz v5, :cond_7

    .line 104
    .line 105
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    check-cast v5, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪哲苏兰世;

    .line 110
    .line 111
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 112
    .line 113
    .line 114
    move-result v6

    .line 115
    if-eqz v6, :cond_4

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_4
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 119
    .line 120
    .line 121
    move-result-object v6

    .line 122
    :cond_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 123
    .line 124
    .line 125
    move-result v7

    .line 126
    if-eqz v7, :cond_6

    .line 127
    .line 128
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v7

    .line 132
    check-cast v7, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪哲苏兰世;

    .line 133
    .line 134
    invoke-interface {v7}, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪哲苏兰世;->getId()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v7

    .line 138
    invoke-interface {v5}, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪哲苏兰世;->getId()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v8

    .line 142
    invoke-static {v7, v8}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v7

    .line 146
    if-eqz v7, :cond_5

    .line 147
    .line 148
    goto :goto_2

    .line 149
    :cond_6
    :goto_3
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    goto :goto_2

    .line 153
    :cond_7
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 154
    .line 155
    .line 156
    move-result v4

    .line 157
    if-nez v4, :cond_9

    .line 158
    .line 159
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 160
    .line 161
    .line 162
    move-result v4

    .line 163
    invoke-static {v0}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子兰世楪苏哲(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    invoke-static {v0}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子兰楪苏世哲(Ljava/lang/Iterable;)Ljava/util/List;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 172
    .line 173
    .line 174
    move-result v0

    .line 175
    if-eq v4, v0, :cond_8

    .line 176
    .line 177
    goto :goto_4

    .line 178
    :cond_8
    return-object v2

    .line 179
    :cond_9
    :goto_4
    sget-object v0, Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲兰世:L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;

    .line 180
    .line 181
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    new-instance v4, Ljava/util/ArrayList;

    .line 186
    .line 187
    invoke-static {v2, v3}, Lkotlin/collections/飘花落叶言子楪哲兰苏世;->飘花落叶言子苏世兰哲楪(Ljava/lang/Iterable;I)I

    .line 188
    .line 189
    .line 190
    move-result v3

    .line 191
    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 195
    .line 196
    .line 197
    move-result-object v3

    .line 198
    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 199
    .line 200
    .line 201
    move-result v5

    .line 202
    if-eqz v5, :cond_a

    .line 203
    .line 204
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v5

    .line 208
    check-cast v5, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪哲苏兰世;

    .line 209
    .line 210
    invoke-interface {v5}, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪哲苏兰世;->getId()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v5

    .line 214
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    goto :goto_5

    .line 218
    :cond_a
    invoke-virtual {v0, v4, v1}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    return-object v2
.end method

.method public static final 飘花落叶言子楪世苏哲兰(Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世哲兰苏;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p0, L飘花落叶言世兰子楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/util/LinkedHashMap;

    .line 5
    .line 6
    const-class v0, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪世苏哲兰;

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    instance-of v0, p0, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪世苏哲兰;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    check-cast p0, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪世苏哲兰;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    :goto_0
    if-eqz p0, :cond_1

    .line 21
    .line 22
    iget-object p0, p0, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    const/4 v0, 0x1

    .line 29
    if-ne p0, v0, :cond_1

    .line 30
    .line 31
    return v0

    .line 32
    :cond_1
    const/4 p0, 0x0

    .line 33
    return p0
.end method
