.class public abstract Lcom/typesafe/config/impl/飘花落叶言子楪哲兰苏世;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final 飘花落叶言子楪世苏哲兰:Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "path parameter"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lcom/typesafe/config/impl/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰:Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 8
    .line 9
    return-void
.end method

.method public static 飘花落叶言子楪世哲苏兰(Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;Ljava/lang/String;)Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;
    .locals 6

    .line 1
    sget-object v0, Lcom/typesafe/config/ConfigSyntax;->JSON:Lcom/typesafe/config/ConfigSyntax;

    .line 2
    .line 3
    new-instance v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lcom/typesafe/config/impl/飘花落叶言子楪哲兰世苏;

    .line 9
    .line 10
    invoke-direct {v1}, Lcom/typesafe/config/impl/飘花落叶言子楪哲兰世苏;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_b

    .line 21
    .line 22
    :goto_0
    invoke-virtual {p0}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    const/4 v2, 0x0

    .line 27
    if-eqz v1, :cond_6

    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰楪哲;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;

    .line 34
    .line 35
    sget-object v3, Lcom/typesafe/config/impl/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪世苏哲兰:Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;

    .line 36
    .line 37
    instance-of v3, v1, Lcom/typesafe/config/impl/飘花落叶言子世哲楪苏兰;

    .line 38
    .line 39
    if-eqz v3, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    sget-object v3, Lcom/typesafe/config/ConfigValueType;->STRING:Lcom/typesafe/config/ConfigValueType;

    .line 43
    .line 44
    instance-of v4, v1, Lcom/typesafe/config/impl/飘花落叶言子世哲兰苏楪;

    .line 45
    .line 46
    if-eqz v4, :cond_1

    .line 47
    .line 48
    invoke-static {v1}, Lcom/typesafe/config/impl/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪世苏哲兰(Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    invoke-interface {v5}, L飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世兰哲;->valueType()Lcom/typesafe/config/ConfigValueType;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    if-ne v5, v3, :cond_1

    .line 57
    .line 58
    invoke-static {v1}, Lcom/typesafe/config/impl/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪世苏哲兰(Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {v1}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->transformToString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    const/4 v2, 0x1

    .line 67
    invoke-static {v0, v2, v1}, Lcom/typesafe/config/impl/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰(Ljava/util/ArrayList;ZLjava/lang/String;)V

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_1
    sget-object v3, Lcom/typesafe/config/impl/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪世苏兰哲:Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;

    .line 72
    .line 73
    if-ne v1, v3, :cond_2

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_2
    if-eqz v4, :cond_3

    .line 77
    .line 78
    invoke-static {v1}, Lcom/typesafe/config/impl/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪世苏哲兰(Lcom/typesafe/config/impl/飘花落叶言子世苏哲兰楪;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-virtual {v1}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->transformToString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    goto :goto_1

    .line 87
    :cond_3
    instance-of v3, v1, Lcom/typesafe/config/impl/飘花落叶言子世哲兰楪苏;

    .line 88
    .line 89
    if-eqz v3, :cond_5

    .line 90
    .line 91
    if-eqz v3, :cond_4

    .line 92
    .line 93
    check-cast v1, Lcom/typesafe/config/impl/飘花落叶言子世哲兰楪苏;

    .line 94
    .line 95
    iget-object v1, v1, Lcom/typesafe/config/impl/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世哲兰苏:Ljava/lang/String;

    .line 96
    .line 97
    :goto_1
    const/4 v2, 0x0

    .line 98
    invoke-static {v0, v2, v1}, Lcom/typesafe/config/impl/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰(Ljava/util/ArrayList;ZLjava/lang/String;)V

    .line 99
    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_4
    const-string p0, "tried to get unquoted text from "

    .line 103
    .line 104
    invoke-static {v1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪兰世哲苏(Ljava/lang/Object;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    return-object v2

    .line 108
    :cond_5
    new-instance p0, Lcom/typesafe/config/ConfigException$BadPath;

    .line 109
    .line 110
    new-instance v0, Ljava/lang/StringBuilder;

    .line 111
    .line 112
    const-string v2, "Token not allowed in path expression: "

    .line 113
    .line 114
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    const-string v1, " (you can double-quote this token if you really want it here)"

    .line 121
    .line 122
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-direct {p0, p1, p2, v0}, Lcom/typesafe/config/ConfigException$BadPath;-><init>(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;Ljava/lang/String;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    throw p0

    .line 133
    :cond_6
    new-instance p0, Ljava/util/Stack;

    .line 134
    .line 135
    invoke-direct {p0}, Ljava/util/Stack;-><init>()V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 143
    .line 144
    .line 145
    move-result v1

    .line 146
    if-eqz v1, :cond_9

    .line 147
    .line 148
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    check-cast v1, Lcom/typesafe/config/impl/飘花落叶言子楪哲兰世苏;

    .line 153
    .line 154
    iget-object v3, v1, Lcom/typesafe/config/impl/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:Ljava/lang/StringBuilder;

    .line 155
    .line 156
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I

    .line 157
    .line 158
    .line 159
    move-result v3

    .line 160
    if-nez v3, :cond_8

    .line 161
    .line 162
    iget-boolean v3, v1, Lcom/typesafe/config/impl/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏兰哲:Z

    .line 163
    .line 164
    if-eqz v3, :cond_7

    .line 165
    .line 166
    goto :goto_3

    .line 167
    :cond_7
    new-instance p0, Lcom/typesafe/config/ConfigException$BadPath;

    .line 168
    .line 169
    const-string v0, "path has a leading, trailing, or two adjacent period \'.\' (use quoted \"\" empty string if you want an empty element)"

    .line 170
    .line 171
    invoke-direct {p0, p1, p2, v0}, Lcom/typesafe/config/ConfigException$BadPath;-><init>(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;Ljava/lang/String;Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    throw p0

    .line 175
    :cond_8
    :goto_3
    iget-object v1, v1, Lcom/typesafe/config/impl/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:Ljava/lang/StringBuilder;

    .line 176
    .line 177
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    invoke-virtual {p0, v1}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    goto :goto_2

    .line 185
    :cond_9
    :goto_4
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 186
    .line 187
    .line 188
    move-result p1

    .line 189
    if-nez p1, :cond_a

    .line 190
    .line 191
    invoke-virtual {p0}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    check-cast p1, Ljava/lang/String;

    .line 196
    .line 197
    new-instance p2, Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;

    .line 198
    .line 199
    invoke-direct {p2, p1, v2}, Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;-><init>(Ljava/lang/String;Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;)V

    .line 200
    .line 201
    .line 202
    move-object v2, p2

    .line 203
    goto :goto_4

    .line 204
    :cond_a
    return-object v2

    .line 205
    :cond_b
    new-instance p0, Lcom/typesafe/config/ConfigException$BadPath;

    .line 206
    .line 207
    const-string v0, "Expecting a field name or path here, but got nothing"

    .line 208
    .line 209
    invoke-direct {p0, p1, p2, v0}, Lcom/typesafe/config/ConfigException$BadPath;-><init>(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;Ljava/lang/String;Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    throw p0
.end method

.method public static 飘花落叶言子楪世苏兰哲(Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;Ljava/lang/String;I)Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;
    .locals 3

    .line 1
    add-int/lit8 v0, p2, -0x1

    .line 2
    .line 3
    const/16 v1, 0x2e

    .line 4
    .line 5
    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->lastIndexOf(II)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    new-instance v1, Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;

    .line 10
    .line 11
    add-int/lit8 v2, v0, 0x1

    .line 12
    .line 13
    invoke-virtual {p1, v2, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-direct {v1, p2, p0}, Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;-><init>(Ljava/lang/String;Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;)V

    .line 18
    .line 19
    .line 20
    if-gez v0, :cond_0

    .line 21
    .line 22
    return-object v1

    .line 23
    :cond_0
    invoke-static {v1, p1, v0}, Lcom/typesafe/config/impl/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲(Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;Ljava/lang/String;I)Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method

.method public static 飘花落叶言子楪世苏哲兰(Ljava/util/ArrayList;ZLjava/lang/String;)V
    .locals 4

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const/4 v0, -0x1

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    const/16 v0, 0x2e

    .line 6
    .line 7
    invoke-virtual {p2, v0}, Ljava/lang/String;->indexOf(I)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    :goto_0
    const/4 v1, 0x1

    .line 12
    invoke-static {v1, p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏世兰哲(ILjava/util/ArrayList;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    check-cast v2, Lcom/typesafe/config/impl/飘花落叶言子楪哲兰世苏;

    .line 17
    .line 18
    if-gez v0, :cond_2

    .line 19
    .line 20
    iget-object p0, v2, Lcom/typesafe/config/impl/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    if-eqz p1, :cond_1

    .line 26
    .line 27
    iget-object p0, v2, Lcom/typesafe/config/impl/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:Ljava/lang/StringBuilder;

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->length()I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    if-nez p0, :cond_1

    .line 34
    .line 35
    iput-boolean v1, v2, Lcom/typesafe/config/impl/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏兰哲:Z

    .line 36
    .line 37
    :cond_1
    return-void

    .line 38
    :cond_2
    iget-object p1, v2, Lcom/typesafe/config/impl/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:Ljava/lang/StringBuilder;

    .line 39
    .line 40
    const/4 v2, 0x0

    .line 41
    invoke-virtual {p2, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    new-instance p1, Lcom/typesafe/config/impl/飘花落叶言子楪哲兰世苏;

    .line 49
    .line 50
    invoke-direct {p1}, Lcom/typesafe/config/impl/飘花落叶言子楪哲兰世苏;-><init>()V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    add-int/2addr v0, v1

    .line 57
    invoke-virtual {p2, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-static {p0, v2, p1}, Lcom/typesafe/config/impl/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰(Ljava/util/ArrayList;ZLjava/lang/String;)V

    .line 62
    .line 63
    .line 64
    return-void
.end method
