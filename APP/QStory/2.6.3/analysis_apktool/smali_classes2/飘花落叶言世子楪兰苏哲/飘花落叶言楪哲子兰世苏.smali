.class public final L飘花落叶言世子楪兰苏哲/飘花落叶言楪哲子兰世苏;
.super L飘花落叶言世苏兰哲子楪/飘花落叶言子世哲楪兰苏;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final 飘花落叶言子楪世哲兰苏:L飘花落叶言世子楪兰苏哲/飘花落叶言楪哲子兰世苏;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, L飘花落叶言世子楪兰苏哲/飘花落叶言楪哲子兰世苏;

    .line 2
    .line 3
    const-class v1, L飘花落叶言世子楪兰苏哲/飘花落叶言楪哲子苏兰世;

    .line 4
    .line 5
    sget-object v2, Lkotlin/jvm/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:Lkotlin/jvm/internal/飘花落叶言子楪苏兰哲世;

    .line 6
    .line 7
    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)Lkotlin/reflect/飘花落叶言子楪世哲兰苏;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, L飘花落叶言世苏兰哲子楪/飘花落叶言子世哲楪兰苏;-><init>(Lkotlin/reflect/飘花落叶言子楪世哲兰苏;)V

    .line 12
    .line 13
    .line 14
    sput-object v0, L飘花落叶言世子楪兰苏哲/飘花落叶言楪哲子兰世苏;->飘花落叶言子楪世哲兰苏:L飘花落叶言世子楪兰苏哲/飘花落叶言楪哲子兰世苏;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世哲苏兰(L飘花落叶言世苏兰哲楪子/飘花落叶言子楪苏兰哲世;)L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p0, L飘花落叶言世子楪兰苏哲/飘花落叶言世楪子哲苏兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪兰子哲苏世/飘花落叶言子楪世苏哲兰;

    .line 5
    .line 6
    invoke-static {p1}, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世兰苏哲(L飘花落叶言世苏兰哲楪子/飘花落叶言子楪苏兰哲世;)L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const-string v0, "model"

    .line 11
    .line 12
    invoke-virtual {p0, v0}, L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;->containsKey(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    sget-object p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子世哲兰楪苏;->Companion:L飘花落叶言世子楪兰苏哲/飘花落叶言子世哲苏兰楪;

    .line 20
    .line 21
    invoke-virtual {p0}, L飘花落叶言世子楪兰苏哲/飘花落叶言子世哲苏兰楪;->serializer()L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const-string v0, "roots"

    .line 29
    .line 30
    invoke-virtual {p0, v0}, L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;->containsKey(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-eqz p0, :cond_1

    .line 35
    .line 36
    sget-object p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子兰苏哲世楪;->Companion:L飘花落叶言世子楪兰苏哲/飘花落叶言子兰苏哲楪世;

    .line 37
    .line 38
    invoke-virtual {p0}, L飘花落叶言世子楪兰苏哲/飘花落叶言子兰苏哲楪世;->serializer()L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    check-cast p0, L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    move-object p0, v1

    .line 46
    :goto_0
    if-nez p0, :cond_d

    .line 47
    .line 48
    invoke-static {p1}, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世兰苏哲(L飘花落叶言世苏兰哲楪子/飘花落叶言子楪苏兰哲世;)L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    const-string p1, "tools"

    .line 53
    .line 54
    invoke-virtual {p0, p1}, L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;->containsKey(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-eqz p1, :cond_2

    .line 59
    .line 60
    sget-object p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子兰哲苏世楪;->Companion:L飘花落叶言世子楪兰苏哲/飘花落叶言子兰哲苏楪世;

    .line 61
    .line 62
    invoke-virtual {p0}, L飘花落叶言世子楪兰苏哲/飘花落叶言子兰哲苏楪世;->serializer()L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    move-object v1, p0

    .line 67
    check-cast v1, L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;

    .line 68
    .line 69
    goto/16 :goto_1

    .line 70
    .line 71
    :cond_2
    const-string p1, "resources"

    .line 72
    .line 73
    invoke-virtual {p0, p1}, L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;->containsKey(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    if-eqz p1, :cond_3

    .line 78
    .line 79
    sget-object p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子兰世哲苏楪;->Companion:L飘花落叶言世子楪兰苏哲/飘花落叶言子兰世哲楪苏;

    .line 80
    .line 81
    invoke-virtual {p0}, L飘花落叶言世子楪兰苏哲/飘花落叶言子兰世哲楪苏;->serializer()L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    move-object v1, p0

    .line 86
    check-cast v1, L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;

    .line 87
    .line 88
    goto/16 :goto_1

    .line 89
    .line 90
    :cond_3
    const-string p1, "resourceTemplates"

    .line 91
    .line 92
    invoke-virtual {p0, p1}, L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;->containsKey(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    if-eqz p1, :cond_4

    .line 97
    .line 98
    sget-object p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子兰楪哲苏世;->Companion:L飘花落叶言世子楪兰苏哲/飘花落叶言子兰楪哲世苏;

    .line 99
    .line 100
    invoke-virtual {p0}, L飘花落叶言世子楪兰苏哲/飘花落叶言子兰楪哲世苏;->serializer()L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    move-object v1, p0

    .line 105
    check-cast v1, L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;

    .line 106
    .line 107
    goto/16 :goto_1

    .line 108
    .line 109
    :cond_4
    const-string p1, "prompts"

    .line 110
    .line 111
    invoke-virtual {p0, p1}, L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;->containsKey(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    if-eqz p1, :cond_5

    .line 116
    .line 117
    sget-object p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲兰苏世楪;->Companion:L飘花落叶言世子楪兰苏哲/飘花落叶言子哲兰苏楪世;

    .line 118
    .line 119
    invoke-virtual {p0}, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲兰苏楪世;->serializer()L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    move-object v1, p0

    .line 124
    check-cast v1, L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_5
    const-string p1, "capabilities"

    .line 128
    .line 129
    invoke-virtual {p0, p1}, L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;->containsKey(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result p1

    .line 133
    if-eqz p1, :cond_6

    .line 134
    .line 135
    sget-object p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子苏兰哲世楪;->Companion:L飘花落叶言世子楪兰苏哲/飘花落叶言子苏兰哲楪世;

    .line 136
    .line 137
    invoke-virtual {p0}, L飘花落叶言世子楪兰苏哲/飘花落叶言子苏兰哲楪世;->serializer()L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    move-object v1, p0

    .line 142
    check-cast v1, L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;

    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_6
    const-string p1, "description"

    .line 146
    .line 147
    invoke-virtual {p0, p1}, L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;->containsKey(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result p1

    .line 151
    if-eqz p1, :cond_7

    .line 152
    .line 153
    sget-object p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子苏世兰哲楪;->Companion:L飘花落叶言世子楪兰苏哲/飘花落叶言子苏世兰楪哲;

    .line 154
    .line 155
    invoke-virtual {p0}, L飘花落叶言世子楪兰苏哲/飘花落叶言子苏世兰楪哲;->serializer()L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    move-object v1, p0

    .line 160
    check-cast v1, L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;

    .line 161
    .line 162
    goto :goto_1

    .line 163
    :cond_7
    const-string p1, "completion"

    .line 164
    .line 165
    invoke-virtual {p0, p1}, L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;->containsKey(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result p1

    .line 169
    if-eqz p1, :cond_8

    .line 170
    .line 171
    sget-object p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子世苏哲楪兰;->Companion:L飘花落叶言世子楪兰苏哲/飘花落叶言子世楪兰苏哲;

    .line 172
    .line 173
    invoke-virtual {p0}, L飘花落叶言世子楪兰苏哲/飘花落叶言子世楪兰苏哲;->serializer()L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    move-object v1, p0

    .line 178
    check-cast v1, L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;

    .line 179
    .line 180
    goto :goto_1

    .line 181
    :cond_8
    const-string p1, "toolResult"

    .line 182
    .line 183
    invoke-virtual {p0, p1}, L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;->containsKey(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-result p1

    .line 187
    if-eqz p1, :cond_9

    .line 188
    .line 189
    sget-object p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子楪兰苏世哲;->Companion:L飘花落叶言世子楪兰苏哲/飘花落叶言子楪兰世哲苏;

    .line 190
    .line 191
    invoke-virtual {p0}, L飘花落叶言世子楪兰苏哲/飘花落叶言子楪兰世哲苏;->serializer()L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    move-object v1, p0

    .line 196
    check-cast v1, L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;

    .line 197
    .line 198
    goto :goto_1

    .line 199
    :cond_9
    const-string p1, "contents"

    .line 200
    .line 201
    invoke-virtual {p0, p1}, L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;->containsKey(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    move-result p1

    .line 205
    if-eqz p1, :cond_a

    .line 206
    .line 207
    sget-object p0, L飘花落叶言世子楪兰苏哲/飘花落叶言楪苏世哲兰子;->Companion:L飘花落叶言世子楪兰苏哲/飘花落叶言楪苏世哲子兰;

    .line 208
    .line 209
    invoke-virtual {p0}, L飘花落叶言世子楪兰苏哲/飘花落叶言楪苏世哲子兰;->serializer()L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;

    .line 210
    .line 211
    .line 212
    move-result-object p0

    .line 213
    move-object v1, p0

    .line 214
    check-cast v1, L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;

    .line 215
    .line 216
    goto :goto_1

    .line 217
    :cond_a
    const-string p1, "content"

    .line 218
    .line 219
    invoke-virtual {p0, p1}, L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;->containsKey(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    move-result p0

    .line 223
    if-eqz p0, :cond_b

    .line 224
    .line 225
    sget-object p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子楪苏哲世兰;->Companion:L飘花落叶言世子楪兰苏哲/飘花落叶言子楪苏世兰哲;

    .line 226
    .line 227
    invoke-virtual {p0}, L飘花落叶言世子楪兰苏哲/飘花落叶言子楪苏世兰哲;->serializer()L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;

    .line 228
    .line 229
    .line 230
    move-result-object p0

    .line 231
    move-object v1, p0

    .line 232
    check-cast v1, L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;

    .line 233
    .line 234
    :cond_b
    :goto_1
    if-nez v1, :cond_c

    .line 235
    .line 236
    sget-object p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子世兰哲楪苏;->Companion:L飘花落叶言世子楪兰苏哲/飘花落叶言子世兰苏哲楪;

    .line 237
    .line 238
    invoke-virtual {p0}, L飘花落叶言世子楪兰苏哲/飘花落叶言子世兰苏哲楪;->serializer()L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;

    .line 239
    .line 240
    .line 241
    move-result-object p0

    .line 242
    check-cast p0, L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;

    .line 243
    .line 244
    return-object p0

    .line 245
    :cond_c
    return-object v1

    .line 246
    :cond_d
    return-object p0
.end method
