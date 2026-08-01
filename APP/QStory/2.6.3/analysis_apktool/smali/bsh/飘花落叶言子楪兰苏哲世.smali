.class public final Lbsh/飘花落叶言子楪兰苏哲世;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final 飘花落叶言子楪世兰哲苏:Ljava/lang/String;

.field public final 飘花落叶言子楪世兰苏哲:Ljava/lang/Class;

.field public final 飘花落叶言子楪世哲兰苏:Ljava/lang/String;

.field public final 飘花落叶言子楪世哲苏兰:Ljava/lang/String;

.field public final 飘花落叶言子楪世苏兰哲:Ljava/lang/String;

.field public final 飘花落叶言子楪世苏哲兰:Ljava/lang/String;

.field public final 飘花落叶言子楪苏世兰哲:[Lbsh/Variable;

.field public final 飘花落叶言子楪苏世哲兰:[Ljava/lang/Class;

.field public final 飘花落叶言子楪苏哲世兰:[Lbsh/DelayedEvalBshMethod;

.field public final 飘花落叶言子楪苏哲兰世:[Lbsh/DelayedEvalBshMethod;


# direct methods
.method public constructor <init>(Lbsh/Modifiers;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;[Lbsh/Variable;[Lbsh/DelayedEvalBshMethod;Lbsh/NameSpace;Lbsh/ClassGenerator$Type;)V
    .locals 10

    .line 1
    move-object/from16 v0, p6

    .line 2
    .line 3
    move-object/from16 v1, p7

    .line 4
    .line 5
    move-object/from16 v2, p8

    .line 6
    .line 7
    move-object/from16 v3, p9

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p2, p0, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 13
    .line 14
    const/16 v4, 0x2f

    .line 15
    .line 16
    const/16 v5, 0x2e

    .line 17
    .line 18
    if-eqz p3, :cond_0

    .line 19
    .line 20
    new-instance v6, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p3, v5, v4}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p3

    .line 29
    invoke-virtual {v6, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string p3, "/"

    .line 33
    .line 34
    invoke-virtual {v6, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p3

    .line 44
    iput-object p3, p0, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    iput-object p2, p0, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 48
    .line 49
    :goto_0
    new-instance p3, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    const-string v6, "L"

    .line 52
    .line 53
    invoke-direct {p3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    iget-object v6, p0, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {v6, v5, v4}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    invoke-virtual {p3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string v6, ";"

    .line 66
    .line 67
    invoke-virtual {p3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p3

    .line 74
    iput-object p3, p0, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 75
    .line 76
    if-nez p4, :cond_2

    .line 77
    .line 78
    sget-object p3, Lbsh/ClassGenerator$Type;->ENUM:Lbsh/ClassGenerator$Type;

    .line 79
    .line 80
    if-ne v3, p3, :cond_1

    .line 81
    .line 82
    const-class p3, Ljava/lang/Enum;

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_1
    const-class p3, Ljava/lang/Object;

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_2
    move-object p3, p4

    .line 89
    :goto_1
    iput-object p3, p0, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世兰苏哲:Ljava/lang/Class;

    .line 90
    .line 91
    invoke-virtual {p3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p3

    .line 95
    invoke-virtual {p3, v5, v4}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p3

    .line 99
    iput-object p3, p0, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世兰哲苏:Ljava/lang/String;

    .line 100
    .line 101
    if-nez p5, :cond_3

    .line 102
    .line 103
    sget-object p3, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世苏兰哲:[Ljava/lang/Class;

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_3
    move-object p3, p5

    .line 107
    :goto_2
    iput-object p3, p0, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪苏世哲兰:[Ljava/lang/Class;

    .line 108
    .line 109
    iput-object v0, p0, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪苏世兰哲:[Lbsh/Variable;

    .line 110
    .line 111
    sget-object p3, Lbsh/ClassGenerator$Type;->INTERFACE:Lbsh/ClassGenerator$Type;

    .line 112
    .line 113
    const/4 v4, 0x0

    .line 114
    const/4 v5, 0x1

    .line 115
    if-ne v3, p3, :cond_4

    .line 116
    .line 117
    move p3, v5

    .line 118
    goto :goto_3

    .line 119
    :cond_4
    move p3, v4

    .line 120
    :goto_3
    iput-boolean p3, v2, Lbsh/NameSpace;->isInterface:Z

    .line 121
    .line 122
    sget-object p3, Lbsh/ClassGenerator$Type;->ENUM:Lbsh/ClassGenerator$Type;

    .line 123
    .line 124
    if-ne v3, p3, :cond_5

    .line 125
    .line 126
    goto :goto_4

    .line 127
    :cond_5
    move v5, v4

    .line 128
    :goto_4
    iput-boolean v5, v2, Lbsh/NameSpace;->isEnum:Z

    .line 129
    .line 130
    sget-object p3, Lbsh/This;->contextStore:Ljava/util/Map;

    .line 131
    .line 132
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 133
    .line 134
    .line 135
    move-result-object v5

    .line 136
    invoke-virtual {v5}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v5

    .line 140
    iput-object v5, p0, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲兰苏:Ljava/lang/String;

    .line 141
    .line 142
    invoke-interface {p3, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    new-instance p3, Ljava/util/ArrayList;

    .line 146
    .line 147
    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 148
    .line 149
    .line 150
    new-instance v2, Ljava/util/ArrayList;

    .line 151
    .line 152
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 153
    .line 154
    .line 155
    invoke-static {p2}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object p2

    .line 159
    array-length v5, v1

    .line 160
    :goto_5
    if-ge v4, v5, :cond_8

    .line 161
    .line 162
    aget-object v6, v1, v4

    .line 163
    .line 164
    invoke-virtual {v6}, Lbsh/BshMethod;->getName()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v7

    .line 168
    invoke-virtual {v7, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result v7

    .line 172
    if-eqz v7, :cond_7

    .line 173
    .line 174
    iget-object v7, v6, Lbsh/BshMethod;->modifiers:Lbsh/Modifiers;

    .line 175
    .line 176
    const/4 v8, 0x5

    .line 177
    invoke-virtual {v7, v8}, Lbsh/Modifiers;->isAppliedContext(I)Z

    .line 178
    .line 179
    .line 180
    move-result v7

    .line 181
    if-nez v7, :cond_6

    .line 182
    .line 183
    iget-object v7, v6, Lbsh/BshMethod;->modifiers:Lbsh/Modifiers;

    .line 184
    .line 185
    invoke-virtual {v7, v8}, Lbsh/Modifiers;->changeContext(I)V

    .line 186
    .line 187
    .line 188
    :cond_6
    invoke-virtual {p3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    goto :goto_6

    .line 192
    :cond_7
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    :goto_6
    add-int/lit8 v4, v4, 0x1

    .line 196
    .line 197
    goto :goto_5

    .line 198
    :cond_8
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    .line 199
    .line 200
    .line 201
    move-result p2

    .line 202
    new-array p2, p2, [Lbsh/DelayedEvalBshMethod;

    .line 203
    .line 204
    invoke-virtual {p3, p2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object p2

    .line 208
    check-cast p2, [Lbsh/DelayedEvalBshMethod;

    .line 209
    .line 210
    iput-object p2, p0, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪苏哲世兰:[Lbsh/DelayedEvalBshMethod;

    .line 211
    .line 212
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 213
    .line 214
    .line 215
    move-result p2

    .line 216
    new-array p2, p2, [Lbsh/DelayedEvalBshMethod;

    .line 217
    .line 218
    invoke-virtual {v2, p2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object p2

    .line 222
    check-cast p2, [Lbsh/DelayedEvalBshMethod;

    .line 223
    .line 224
    iput-object p2, p0, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪苏哲兰世:[Lbsh/DelayedEvalBshMethod;

    .line 225
    .line 226
    iget-object p0, p0, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 227
    .line 228
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    .line 229
    .line 230
    .line 231
    move-result p2

    .line 232
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 233
    .line 234
    .line 235
    move-result-object v5

    .line 236
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 237
    .line 238
    .line 239
    move-result p2

    .line 240
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 241
    .line 242
    .line 243
    move-result-object v7

    .line 244
    array-length p2, v0

    .line 245
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 246
    .line 247
    .line 248
    move-result-object v9

    .line 249
    const-string v0, "Generate class "

    .line 250
    .line 251
    const-string v2, " "

    .line 252
    .line 253
    const-string v4, " cons:"

    .line 254
    .line 255
    const-string v6, " meths:"

    .line 256
    .line 257
    const-string v8, " vars:"

    .line 258
    .line 259
    move-object v1, v3

    .line 260
    move-object v3, p0

    .line 261
    filled-new-array/range {v0 .. v9}, [Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object p0

    .line 265
    invoke-static {p0}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 266
    .line 267
    .line 268
    sget-object p0, Lbsh/ClassGenerator$Type;->INTERFACE:Lbsh/ClassGenerator$Type;

    .line 269
    .line 270
    if-ne v1, p0, :cond_9

    .line 271
    .line 272
    const-string p0, "abstract"

    .line 273
    .line 274
    invoke-virtual {p1, p0}, Lbsh/Modifiers;->hasModifier(Ljava/lang/String;)Z

    .line 275
    .line 276
    .line 277
    move-result p2

    .line 278
    if-nez p2, :cond_9

    .line 279
    .line 280
    invoke-virtual {p1, p0}, Lbsh/Modifiers;->addModifier(Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    :cond_9
    sget-object p0, Lbsh/ClassGenerator$Type;->ENUM:Lbsh/ClassGenerator$Type;

    .line 284
    .line 285
    if-ne v1, p0, :cond_a

    .line 286
    .line 287
    const-string p0, "static"

    .line 288
    .line 289
    invoke-virtual {p1, p0}, Lbsh/Modifiers;->hasModifier(Ljava/lang/String;)Z

    .line 290
    .line 291
    .line 292
    move-result p2

    .line 293
    if-nez p2, :cond_a

    .line 294
    .line 295
    invoke-virtual {p1, p0}, Lbsh/Modifiers;->addModifier(Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    :cond_a
    return-void
.end method

.method public static 飘花落叶言子楪世兰哲苏(Ljava/lang/String;L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;)V
    .locals 2

    .line 1
    const-string v0, "V"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/16 p0, 0xb1

    .line 10
    .line 11
    invoke-virtual {p1, p0}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰(I)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v1, 0x1

    .line 20
    if-ne v0, v1, :cond_4

    .line 21
    .line 22
    const-string v0, "D"

    .line 23
    .line 24
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    const/16 p0, 0xaf

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const-string v0, "F"

    .line 34
    .line 35
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    const/16 p0, 0xae

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    const-string v0, "J"

    .line 45
    .line 46
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    if-eqz p0, :cond_3

    .line 51
    .line 52
    const/16 p0, 0xad

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_3
    const/16 p0, 0xac

    .line 56
    .line 57
    :goto_0
    invoke-virtual {p1, p0}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰(I)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_4
    const/16 v0, 0xc0

    .line 62
    .line 63
    invoke-static {p0}, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-virtual {p1, v0, p0}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世兰苏(ILjava/lang/String;)V

    .line 68
    .line 69
    .line 70
    const/16 p0, 0xb0

    .line 71
    .line 72
    invoke-virtual {p1, p0}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰(I)V

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method public static 飘花落叶言子楪世兰苏哲([Ljava/lang/String;ZL飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;)V
    .locals 13

    .line 1
    array-length v0, p0

    .line 2
    const/16 v1, 0x11

    .line 3
    .line 4
    invoke-virtual {p2, v1, v0}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世兰哲(II)V

    .line 5
    .line 6
    .line 7
    const/16 v0, 0xbd

    .line 8
    .line 9
    const-string v2, "java/lang/Object"

    .line 10
    .line 11
    invoke-virtual {p2, v0, v2}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世兰苏(ILjava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    xor-int/2addr p1, v0

    .line 16
    const/4 v2, 0x0

    .line 17
    :goto_0
    array-length v3, p0

    .line 18
    if-ge v2, v3, :cond_6

    .line 19
    .line 20
    aget-object v3, p0, v2

    .line 21
    .line 22
    const/16 v4, 0x59

    .line 23
    .line 24
    invoke-virtual {p2, v4}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰(I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p2, v1, v2}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世兰哲(II)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    const-string v6, "bsh/Primitive"

    .line 35
    .line 36
    const-string v7, "J"

    .line 37
    .line 38
    const-string v8, "D"

    .line 39
    .line 40
    const/16 v9, 0x53

    .line 41
    .line 42
    if-ne v5, v0, :cond_3

    .line 43
    .line 44
    const-string v5, "F"

    .line 45
    .line 46
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    if-eqz v5, :cond_0

    .line 51
    .line 52
    const/16 v5, 0x17

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_0
    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    if-eqz v5, :cond_1

    .line 60
    .line 61
    const/16 v5, 0x18

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_1
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    if-eqz v5, :cond_2

    .line 69
    .line 70
    const/16 v5, 0x16

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_2
    const/16 v5, 0x15

    .line 74
    .line 75
    :goto_1
    const/16 v10, 0xbb

    .line 76
    .line 77
    invoke-virtual {p2, v10, v6}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世兰苏(ILjava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p2, v4}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰(I)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p2, v5, p1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏世兰(II)V

    .line 84
    .line 85
    .line 86
    new-instance v4, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    const-string v5, "("

    .line 89
    .line 90
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    const-string v5, ")V"

    .line 94
    .line 95
    invoke-static {v4, v3, v5}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    const/16 v5, 0xb7

    .line 100
    .line 101
    const-string v10, "<init>"

    .line 102
    .line 103
    invoke-virtual {p2, v5, v6, v10, v4}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世苏兰(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p2, v9}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰(I)V

    .line 107
    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_3
    const/16 v4, 0x19

    .line 111
    .line 112
    invoke-virtual {p2, v4, p1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏世兰(II)V

    .line 113
    .line 114
    .line 115
    new-instance v5, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;

    .line 116
    .line 117
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 118
    .line 119
    .line 120
    const/16 v10, 0xc7

    .line 121
    .line 122
    invoke-virtual {p2, v10, v5}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲世兰(IL飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;)V

    .line 123
    .line 124
    .line 125
    const-string v10, "NULL"

    .line 126
    .line 127
    const-string v11, "Lbsh/Primitive;"

    .line 128
    .line 129
    const/16 v12, 0xb2

    .line 130
    .line 131
    invoke-virtual {p2, v12, v6, v10, v11}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p2, v9}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰(I)V

    .line 135
    .line 136
    .line 137
    new-instance v6, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;

    .line 138
    .line 139
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 140
    .line 141
    .line 142
    const/16 v10, 0xa7

    .line 143
    .line 144
    invoke-virtual {p2, v10, v6}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲世兰(IL飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p2, v5}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲兰世(L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p2, v4, p1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏世兰(II)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p2, v9}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰(I)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {p2, v6}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲兰世(L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;)V

    .line 157
    .line 158
    .line 159
    :goto_2
    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v4

    .line 163
    if-nez v4, :cond_5

    .line 164
    .line 165
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v3

    .line 169
    if-eqz v3, :cond_4

    .line 170
    .line 171
    goto :goto_3

    .line 172
    :cond_4
    move v3, v0

    .line 173
    goto :goto_4

    .line 174
    :cond_5
    :goto_3
    const/4 v3, 0x2

    .line 175
    :goto_4
    add-int/2addr p1, v3

    .line 176
    add-int/lit8 v2, v2, 0x1

    .line 177
    .line 178
    goto/16 :goto_0

    .line 179
    .line 180
    :cond_6
    return-void
.end method

.method public static 飘花落叶言子楪世哲兰苏(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏兰哲;)V
    .locals 6

    .line 1
    new-instance v0, Landroidx/collection/飘花落叶言子楪兰苏哲世;

    .line 2
    .line 3
    iget-object v1, p4, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;

    .line 4
    .line 5
    move-object v3, p0

    .line 6
    move-object v4, p1

    .line 7
    move v2, p2

    .line 8
    move-object v5, p3

    .line 9
    invoke-direct/range {v0 .. v5}, Landroidx/collection/飘花落叶言子楪兰苏哲世;-><init>(L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object p0, p4, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世兰哲:Landroidx/collection/飘花落叶言子楪兰苏哲世;

    .line 13
    .line 14
    if-nez p0, :cond_0

    .line 15
    .line 16
    iput-object v0, p4, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世兰哲:Landroidx/collection/飘花落叶言子楪兰苏哲世;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object p0, p4, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲世兰:Landroidx/collection/飘花落叶言子楪兰苏哲世;

    .line 20
    .line 21
    iput-object v0, p0, Landroidx/collection/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 22
    .line 23
    :goto_0
    iput-object v0, p4, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲世兰:Landroidx/collection/飘花落叶言子楪兰苏哲世;

    .line 24
    .line 25
    return-void
.end method

.method public static 飘花落叶言子楪世苏兰哲(ILjava/lang/String;[Ljava/lang/String;L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;[L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;IL飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;)V
    .locals 7

    .line 1
    aget-object p0, p4, p0

    .line 2
    .line 3
    invoke-virtual {p6, p0}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲兰世(L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;)V

    .line 4
    .line 5
    .line 6
    const/16 p0, 0x19

    .line 7
    .line 8
    const/4 p4, 0x0

    .line 9
    invoke-virtual {p6, p0, p4}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏世兰(II)V

    .line 10
    .line 11
    .line 12
    array-length v0, p2

    .line 13
    :goto_0
    if-ge p4, v0, :cond_a

    .line 14
    .line 15
    aget-object v1, p2, p4

    .line 16
    .line 17
    const-string v2, "Z"

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    const-string v3, "getObject"

    .line 24
    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    const-string v2, "getBoolean"

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    const-string v2, "B"

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    const-string v2, "getByte"

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const-string v2, "C"

    .line 42
    .line 43
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eqz v2, :cond_2

    .line 48
    .line 49
    const-string v2, "getChar"

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_2
    const-string v2, "S"

    .line 53
    .line 54
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-eqz v2, :cond_3

    .line 59
    .line 60
    const-string v2, "getShort"

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_3
    const-string v2, "I"

    .line 64
    .line 65
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-eqz v2, :cond_4

    .line 70
    .line 71
    const-string v2, "getInt"

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_4
    const-string v2, "J"

    .line 75
    .line 76
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    if-eqz v2, :cond_5

    .line 81
    .line 82
    const-string v2, "getLong"

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_5
    const-string v2, "D"

    .line 86
    .line 87
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    if-eqz v2, :cond_6

    .line 92
    .line 93
    const-string v2, "getDouble"

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_6
    const-string v2, "F"

    .line 97
    .line 98
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    if-eqz v2, :cond_7

    .line 103
    .line 104
    const-string v2, "getFloat"

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_7
    move-object v2, v3

    .line 108
    :goto_1
    invoke-virtual {p6, p0, p5}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏世兰(II)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v4

    .line 115
    if-eqz v4, :cond_8

    .line 116
    .line 117
    const-string v4, "Ljava/lang/Object;"

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_8
    move-object v4, v1

    .line 121
    :goto_2
    const-string v5, "()"

    .line 122
    .line 123
    invoke-virtual {v5, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    const/16 v5, 0xb6

    .line 128
    .line 129
    const-string v6, "bsh/This$ConstructorArgs"

    .line 130
    .line 131
    invoke-virtual {p6, v5, v6, v2, v4}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世苏兰(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v2

    .line 138
    if-eqz v2, :cond_9

    .line 139
    .line 140
    const/16 v2, 0xc0

    .line 141
    .line 142
    invoke-static {v1}, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    invoke-virtual {p6, v2, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世兰苏(ILjava/lang/String;)V

    .line 147
    .line 148
    .line 149
    :cond_9
    add-int/lit8 p4, p4, 0x1

    .line 150
    .line 151
    goto/16 :goto_0

    .line 152
    .line 153
    :cond_a
    const-string p0, "V"

    .line 154
    .line 155
    invoke-static {p0, p2}, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    const/16 p2, 0xb7

    .line 160
    .line 161
    const-string p4, "<init>"

    .line 162
    .line 163
    invoke-virtual {p6, p2, p1, p4, p0}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世苏兰(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    const/16 p0, 0xa7

    .line 167
    .line 168
    invoke-virtual {p6, p0, p3}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲世兰(IL飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;)V

    .line 169
    .line 170
    .line 171
    return-void
.end method

.method public static 飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "["

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const-string v0, "L"

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x1

    .line 19
    invoke-static {v0, v0, p0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏兰世哲(IILjava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    :cond_1
    :goto_0
    return-object p0
.end method

.method public static 飘花落叶言子楪苏世兰哲(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "("

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    array-length v1, p1

    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_0
    if-ge v2, v1, :cond_0

    .line 11
    .line 12
    aget-object v3, p1, v2

    .line 13
    .line 14
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    add-int/lit8 v2, v2, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/16 p1, 0x29

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method

.method public static 飘花落叶言子楪苏世哲兰(Lbsh/Modifiers;)I
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lbsh/Modifiers;->hasModifier(I)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const/4 v2, 0x2

    .line 7
    invoke-virtual {p0, v2}, Lbsh/Modifiers;->hasModifier(I)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    or-int/lit8 v1, v1, 0x2

    .line 14
    .line 15
    :cond_0
    const/4 v2, 0x4

    .line 16
    invoke-virtual {p0, v2}, Lbsh/Modifiers;->hasModifier(I)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    or-int/lit8 v1, v1, 0x4

    .line 23
    .line 24
    :cond_1
    const/16 v2, 0x8

    .line 25
    .line 26
    invoke-virtual {p0, v2}, Lbsh/Modifiers;->hasModifier(I)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_2

    .line 31
    .line 32
    or-int/lit8 v1, v1, 0x8

    .line 33
    .line 34
    :cond_2
    const/16 v2, 0x20

    .line 35
    .line 36
    invoke-virtual {p0, v2}, Lbsh/Modifiers;->hasModifier(I)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_3

    .line 41
    .line 42
    or-int/lit8 v1, v1, 0x20

    .line 43
    .line 44
    :cond_3
    const/16 v2, 0x400

    .line 45
    .line 46
    invoke-virtual {p0, v2}, Lbsh/Modifiers;->hasModifier(I)Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-eqz v2, :cond_4

    .line 51
    .line 52
    or-int/lit16 v1, v1, 0x400

    .line 53
    .line 54
    :cond_4
    invoke-virtual {p0}, Lbsh/Modifiers;->getModifiers()I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    and-int/lit8 v2, v2, 0x7

    .line 59
    .line 60
    if-nez v2, :cond_5

    .line 61
    .line 62
    or-int/2addr v1, v0

    .line 63
    invoke-virtual {p0, v0}, Lbsh/Modifiers;->addModifier(I)V

    .line 64
    .line 65
    .line 66
    :cond_5
    return v1
.end method

.method public static 飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/String;L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lbsh/This$Keys;->BSHSTATIC:Lbsh/This$Keys;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const-string v0, "Lbsh/This;"

    .line 19
    .line 20
    const/16 v1, 0xb2

    .line 21
    .line 22
    invoke-virtual {p2, v1, p0, p1, v0}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世哲苏兰(I[Ljava/lang/String;IL飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏兰哲;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    array-length v2, v1

    .line 6
    const/4 v3, 0x1

    .line 7
    add-int/2addr v2, v3

    .line 8
    array-length v4, v1

    .line 9
    add-int/lit8 v10, v4, 0x2

    .line 10
    .line 11
    const-string v4, "V"

    .line 12
    .line 13
    invoke-static {v4, v1}, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    const-string v12, "<init>"

    .line 18
    .line 19
    move/from16 v5, p3

    .line 20
    .line 21
    move-object/from16 v6, p4

    .line 22
    .line 23
    invoke-virtual {v6, v5, v12, v4}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(ILjava/lang/String;Ljava/lang/String;)L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;

    .line 24
    .line 25
    .line 26
    move-result-object v11

    .line 27
    const/4 v4, 0x0

    .line 28
    invoke-static {v1, v4, v11}, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世兰苏哲([Ljava/lang/String;ZL飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;)V

    .line 29
    .line 30
    .line 31
    const/16 v1, 0x3a

    .line 32
    .line 33
    invoke-virtual {v11, v1, v2}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏世兰(II)V

    .line 34
    .line 35
    .line 36
    new-instance v13, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;

    .line 37
    .line 38
    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    .line 39
    .line 40
    .line 41
    new-instance v8, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;

    .line 42
    .line 43
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 44
    .line 45
    .line 46
    sget-object v5, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世兰哲:L飘花落叶言楪子世哲兰苏/飘花落叶言子楪世苏哲兰;

    .line 47
    .line 48
    iget-object v6, v0, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世兰苏哲:Ljava/lang/Class;

    .line 49
    .line 50
    invoke-virtual {v5, v6}, L飘花落叶言楪子世哲兰苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    check-cast v5, Lbsh/飘花落叶言子楪苏世兰哲;

    .line 55
    .line 56
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v7

    .line 60
    invoke-virtual {v5, v7}, Lbsh/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰哲苏(Ljava/lang/String;)Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object v14

    .line 64
    invoke-interface {v14}, Ljava/util/List;->size()I

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    iget-object v15, v0, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪苏哲世兰:[Lbsh/DelayedEvalBshMethod;

    .line 69
    .line 70
    array-length v7, v15

    .line 71
    add-int/2addr v5, v7

    .line 72
    new-array v9, v5, [L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;

    .line 73
    .line 74
    move v7, v4

    .line 75
    :goto_0
    if-ge v7, v5, :cond_0

    .line 76
    .line 77
    new-instance v16, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;

    .line 78
    .line 79
    invoke-direct/range {v16 .. v16}, Ljava/lang/Object;-><init>()V

    .line 80
    .line 81
    .line 82
    aput-object v16, v9, v7

    .line 83
    .line 84
    add-int/lit8 v7, v7, 0x1

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_0
    invoke-static {v6}, Lbsh/BSHType;->getTypeDescriptor(Ljava/lang/Class;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v6

    .line 91
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 92
    .line 93
    .line 94
    move-result v7

    .line 95
    invoke-static {v4, v7, v6}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰(IILjava/lang/String;)L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世兰哲;

    .line 96
    .line 97
    .line 98
    move-result-object v6

    .line 99
    invoke-virtual {v11, v6}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏兰世哲(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    iget-object v6, v0, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 103
    .line 104
    iget-object v7, v0, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 105
    .line 106
    invoke-static {v6, v7, v11}, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/String;L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;)V

    .line 107
    .line 108
    .line 109
    const/16 v6, 0x19

    .line 110
    .line 111
    invoke-virtual {v11, v6, v2}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏世兰(II)V

    .line 112
    .line 113
    .line 114
    const/16 v4, 0x10

    .line 115
    .line 116
    move/from16 v3, p1

    .line 117
    .line 118
    invoke-virtual {v11, v4, v3}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世兰哲(II)V

    .line 119
    .line 120
    .line 121
    const-string v3, "getConstructorArgs"

    .line 122
    .line 123
    const-string v4, "(Ljava/lang/Class;Lbsh/This;[Ljava/lang/Object;I)Lbsh/This$ConstructorArgs;"

    .line 124
    .line 125
    const/16 v6, 0xb8

    .line 126
    .line 127
    move/from16 v17, v2

    .line 128
    .line 129
    const-string v2, "bsh/This"

    .line 130
    .line 131
    invoke-virtual {v11, v6, v2, v3, v4}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世苏兰(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v11, v1, v10}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏世兰(II)V

    .line 135
    .line 136
    .line 137
    const/16 v1, 0x19

    .line 138
    .line 139
    invoke-virtual {v11, v1, v10}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏世兰(II)V

    .line 140
    .line 141
    .line 142
    const-string v3, "selector"

    .line 143
    .line 144
    const-string v4, "I"

    .line 145
    .line 146
    const/16 v1, 0xb4

    .line 147
    .line 148
    const-string v6, "bsh/This$ConstructorArgs"

    .line 149
    .line 150
    invoke-virtual {v11, v1, v6, v3, v4}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    add-int/lit8 v1, v5, -0x1

    .line 154
    .line 155
    iget-object v3, v11, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲世兰:L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏哲兰;

    .line 156
    .line 157
    iget v4, v3, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:I

    .line 158
    .line 159
    iput v4, v11, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪苏兰哲:I

    .line 160
    .line 161
    const/16 v4, 0xaa

    .line 162
    .line 163
    invoke-virtual {v3, v4}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲(I)V

    .line 164
    .line 165
    .line 166
    iget v4, v3, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:I

    .line 167
    .line 168
    const/4 v6, 0x4

    .line 169
    rem-int/2addr v4, v6

    .line 170
    rsub-int/lit8 v4, v4, 0x4

    .line 171
    .line 172
    rem-int/2addr v4, v6

    .line 173
    const/4 v6, 0x0

    .line 174
    invoke-virtual {v3, v6, v4}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏([BI)V

    .line 175
    .line 176
    .line 177
    iget v4, v11, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪苏兰哲:I

    .line 178
    .line 179
    const/4 v6, 0x1

    .line 180
    invoke-virtual {v13, v3, v4, v6}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏(L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏哲兰;IZ)V

    .line 181
    .line 182
    .line 183
    const/4 v4, 0x0

    .line 184
    invoke-virtual {v3, v4}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰(I)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v3, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰(I)V

    .line 188
    .line 189
    .line 190
    const/4 v1, 0x0

    .line 191
    :goto_1
    if-ge v1, v5, :cond_1

    .line 192
    .line 193
    aget-object v4, v9, v1

    .line 194
    .line 195
    move/from16 v18, v1

    .line 196
    .line 197
    iget v1, v11, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪苏兰哲:I

    .line 198
    .line 199
    invoke-virtual {v4, v3, v1, v6}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏(L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏哲兰;IZ)V

    .line 200
    .line 201
    .line 202
    add-int/lit8 v1, v18, 0x1

    .line 203
    .line 204
    const/4 v6, 0x1

    .line 205
    goto :goto_1

    .line 206
    :cond_1
    iget-object v1, v11, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世苏哲:L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;

    .line 207
    .line 208
    if-eqz v1, :cond_4

    .line 209
    .line 210
    iget v3, v11, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:I

    .line 211
    .line 212
    const/4 v4, 0x4

    .line 213
    if-ne v3, v4, :cond_2

    .line 214
    .line 215
    iget-object v1, v1, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏世兰哲:L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;

    .line 216
    .line 217
    const/16 v3, 0xab

    .line 218
    .line 219
    const/4 v4, 0x0

    .line 220
    const/4 v6, 0x0

    .line 221
    invoke-virtual {v1, v3, v4, v6, v6}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰(IIL飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v11, v4, v13}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰(IL飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v13}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲()L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    iget-short v3, v1, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:S

    .line 232
    .line 233
    or-int/lit8 v3, v3, 0x2

    .line 234
    .line 235
    int-to-short v3, v3

    .line 236
    iput-short v3, v1, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:S

    .line 237
    .line 238
    move v1, v4

    .line 239
    :goto_2
    if-ge v1, v5, :cond_3

    .line 240
    .line 241
    aget-object v3, v9, v1

    .line 242
    .line 243
    invoke-virtual {v11, v4, v3}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰(IL飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v3}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲()L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;

    .line 247
    .line 248
    .line 249
    move-result-object v3

    .line 250
    iget-short v4, v3, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:S

    .line 251
    .line 252
    or-int/lit8 v4, v4, 0x2

    .line 253
    .line 254
    int-to-short v4, v4

    .line 255
    iput-short v4, v3, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:S

    .line 256
    .line 257
    add-int/lit8 v1, v1, 0x1

    .line 258
    .line 259
    const/4 v4, 0x0

    .line 260
    goto :goto_2

    .line 261
    :cond_2
    const/4 v6, 0x1

    .line 262
    if-ne v3, v6, :cond_3

    .line 263
    .line 264
    iget v1, v11, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世哲苏:I

    .line 265
    .line 266
    sub-int/2addr v1, v6

    .line 267
    iput v1, v11, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世哲苏:I

    .line 268
    .line 269
    invoke-virtual {v11, v1, v13}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰(IL飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;)V

    .line 270
    .line 271
    .line 272
    const/4 v4, 0x0

    .line 273
    :goto_3
    if-ge v4, v5, :cond_3

    .line 274
    .line 275
    aget-object v1, v9, v4

    .line 276
    .line 277
    iget v3, v11, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世哲苏:I

    .line 278
    .line 279
    invoke-virtual {v11, v3, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰(IL飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;)V

    .line 280
    .line 281
    .line 282
    add-int/lit8 v4, v4, 0x1

    .line 283
    .line 284
    goto :goto_3

    .line 285
    :cond_3
    invoke-virtual {v11}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲()V

    .line 286
    .line 287
    .line 288
    :cond_4
    const/4 v4, 0x0

    .line 289
    const/4 v5, 0x0

    .line 290
    :goto_4
    invoke-interface {v14}, Ljava/util/List;->size()I

    .line 291
    .line 292
    .line 293
    move-result v1

    .line 294
    if-ge v4, v1, :cond_5

    .line 295
    .line 296
    invoke-interface {v14, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v1

    .line 300
    check-cast v1, Lbsh/飘花落叶言子世哲苏楪兰;

    .line 301
    .line 302
    invoke-virtual {v1}, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世哲兰苏()[Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object v1

    .line 306
    iget-object v6, v0, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世兰哲苏:Ljava/lang/String;

    .line 307
    .line 308
    move-object v3, v7

    .line 309
    move-object v7, v1

    .line 310
    const/16 v1, 0x19

    .line 311
    .line 312
    invoke-static/range {v5 .. v11}, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏兰哲(ILjava/lang/String;[Ljava/lang/String;L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;[L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;IL飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;)V

    .line 313
    .line 314
    .line 315
    add-int/lit8 v4, v4, 0x1

    .line 316
    .line 317
    add-int/lit8 v5, v5, 0x1

    .line 318
    .line 319
    move-object v7, v3

    .line 320
    goto :goto_4

    .line 321
    :cond_5
    move-object v3, v7

    .line 322
    const/16 v1, 0x19

    .line 323
    .line 324
    const/4 v4, 0x0

    .line 325
    :goto_5
    array-length v6, v15

    .line 326
    if-ge v4, v6, :cond_6

    .line 327
    .line 328
    aget-object v6, v15, v4

    .line 329
    .line 330
    invoke-virtual {v6}, Lbsh/DelayedEvalBshMethod;->getParamTypeDescriptors()[Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v7

    .line 334
    iget-object v6, v0, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 335
    .line 336
    invoke-static/range {v5 .. v11}, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏兰哲(ILjava/lang/String;[Ljava/lang/String;L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;[L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;IL飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;)V

    .line 337
    .line 338
    .line 339
    add-int/lit8 v4, v4, 0x1

    .line 340
    .line 341
    const/16 v16, 0x1

    .line 342
    .line 343
    add-int/lit8 v5, v5, 0x1

    .line 344
    .line 345
    goto :goto_5

    .line 346
    :cond_6
    invoke-virtual {v11, v13}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲兰世(L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;)V

    .line 347
    .line 348
    .line 349
    const/4 v4, 0x0

    .line 350
    invoke-virtual {v11, v1, v4}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏世兰(II)V

    .line 351
    .line 352
    .line 353
    iget-object v0, v0, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世兰哲苏:Ljava/lang/String;

    .line 354
    .line 355
    const-string v5, "()V"

    .line 356
    .line 357
    const/16 v6, 0xb7

    .line 358
    .line 359
    invoke-virtual {v11, v6, v0, v12, v5}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世苏兰(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 360
    .line 361
    .line 362
    invoke-virtual {v11, v8}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲兰世(L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世哲兰苏;)V

    .line 363
    .line 364
    .line 365
    invoke-virtual {v11, v1, v4}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏世兰(II)V

    .line 366
    .line 367
    .line 368
    invoke-virtual {v11, v3}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏兰世哲(Ljava/lang/Object;)V

    .line 369
    .line 370
    .line 371
    move/from16 v0, v17

    .line 372
    .line 373
    invoke-virtual {v11, v1, v0}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏世兰(II)V

    .line 374
    .line 375
    .line 376
    const-string v0, "initInstance"

    .line 377
    .line 378
    const-string v1, "(Lbsh/GeneratedClass;Ljava/lang/String;[Ljava/lang/Object;)V"

    .line 379
    .line 380
    const/16 v3, 0xb8

    .line 381
    .line 382
    invoke-virtual {v11, v3, v2, v0, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世苏兰(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 383
    .line 384
    .line 385
    const/16 v0, 0xb1

    .line 386
    .line 387
    invoke-virtual {v11, v0}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰(I)V

    .line 388
    .line 389
    .line 390
    invoke-virtual {v11}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏兰哲世()V

    .line 391
    .line 392
    .line 393
    return-void
.end method
