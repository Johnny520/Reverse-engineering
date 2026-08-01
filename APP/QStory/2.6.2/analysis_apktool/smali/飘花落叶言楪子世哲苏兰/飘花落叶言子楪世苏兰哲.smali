.class public final L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final 飘花落叶言子楪世苏哲兰:Ljava/util/HashSet;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashSet;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/HashSet;

    .line 10
    .line 11
    new-instance p0, L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏哲兰;

    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰哲苏(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-static {p3}, Lbsh/Primitive;->unwrap(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    iget-object p0, p0, L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/HashSet;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏哲兰;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    instance-of v0, p1, L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏兰哲;

    .line 27
    .line 28
    if-nez v0, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-static {p1, p2, p3}, Lbsh/security/SecurityError;->cantSetField(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Lbsh/security/SecurityError;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    throw p0

    .line 36
    :cond_1
    return-void
.end method

.method public final 飘花落叶言子楪世兰苏哲(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-static {p3}, Lbsh/Primitive;->unwrap([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    iget-object v0, p0, L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/HashSet;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏哲兰;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const-string v0, "getLength"

    .line 28
    .line 29
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    if-eqz p2, :cond_2

    .line 34
    .line 35
    array-length p2, p3

    .line 36
    const/4 v0, 0x1

    .line 37
    if-ne p2, v0, :cond_2

    .line 38
    .line 39
    const-class p2, Ljava/lang/reflect/Array;

    .line 40
    .line 41
    invoke-virtual {p1, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-nez p1, :cond_1

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    const/4 p1, 0x0

    .line 49
    aget-object p1, p3, p1

    .line 50
    .line 51
    :try_start_0
    invoke-virtual {p0}, L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲()V
    :try_end_0
    .catch Lbsh/security/SecurityError; {:try_start_0 .. :try_end_0} :catch_0

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :catch_0
    const-string p0, "length"

    .line 56
    .line 57
    invoke-static {p1, p0}, Lbsh/security/SecurityError;->reflectCantGetField(Ljava/lang/Object;Ljava/lang/String;)Lbsh/security/SecurityError;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    throw p0

    .line 62
    :cond_2
    :goto_1
    return-void
.end method

.method public final 飘花落叶言子楪世哲兰苏(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 7

    .line 1
    invoke-static {p3}, Lbsh/Primitive;->unwrap([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    iget-object v0, p0, L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/HashSet;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏哲兰;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    instance-of v1, p1, L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏兰哲;

    .line 27
    .line 28
    if-nez v1, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-static {p1, p2, p3}, Lbsh/security/SecurityError;->cantInvokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Lbsh/security/SecurityError;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    throw p0

    .line 36
    :cond_1
    const-string v0, "set"

    .line 37
    .line 38
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    const/4 v1, 0x2

    .line 43
    const/4 v2, 0x0

    .line 44
    const/4 v3, 0x1

    .line 45
    if-eqz v0, :cond_4

    .line 46
    .line 47
    array-length v0, p3

    .line 48
    if-ne v0, v1, :cond_4

    .line 49
    .line 50
    instance-of v0, p1, Ljava/lang/reflect/Field;

    .line 51
    .line 52
    if-nez v0, :cond_2

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_2
    move-object v0, p1

    .line 56
    check-cast v0, Ljava/lang/reflect/Field;

    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    aget-object v5, p3, v3

    .line 63
    .line 64
    sget-object v6, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世苏哲兰:[Ljava/lang/Object;

    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 71
    .line 72
    .line 73
    move-result v6

    .line 74
    if-eqz v6, :cond_3

    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    :try_start_0
    invoke-virtual {p0, v0, v4, v5}, L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Lbsh/security/SecurityError; {:try_start_0 .. :try_end_0} :catch_0

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :catch_0
    invoke-static {v0, v4, v5}, Lbsh/security/SecurityError;->reflectCantSetStaticField(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Lbsh/security/SecurityError;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    throw p0

    .line 89
    :cond_3
    aget-object v0, p3, v2

    .line 90
    .line 91
    :try_start_1
    invoke-virtual {p0, v0, v4, v5}, L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_1
    .catch Lbsh/security/SecurityError; {:try_start_1 .. :try_end_1} :catch_1

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :catch_1
    invoke-static {v0, v4, v5}, Lbsh/security/SecurityError;->reflectCantSetField(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Lbsh/security/SecurityError;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    throw p0

    .line 100
    :cond_4
    :goto_1
    const-string v0, "get"

    .line 101
    .line 102
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    if-eqz v0, :cond_7

    .line 107
    .line 108
    array-length v0, p3

    .line 109
    if-ne v0, v3, :cond_7

    .line 110
    .line 111
    instance-of v0, p1, Ljava/lang/reflect/Field;

    .line 112
    .line 113
    if-nez v0, :cond_5

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_5
    move-object v0, p1

    .line 117
    check-cast v0, Ljava/lang/reflect/Field;

    .line 118
    .line 119
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    sget-object v5, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世苏哲兰:[Ljava/lang/Object;

    .line 124
    .line 125
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 126
    .line 127
    .line 128
    move-result v5

    .line 129
    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 130
    .line 131
    .line 132
    move-result v5

    .line 133
    if-eqz v5, :cond_6

    .line 134
    .line 135
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    :try_start_2
    invoke-virtual {p0, v0, v4}, L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Class;Ljava/lang/String;)V
    :try_end_2
    .catch Lbsh/security/SecurityError; {:try_start_2 .. :try_end_2} :catch_2

    .line 140
    .line 141
    .line 142
    goto :goto_2

    .line 143
    :catch_2
    invoke-static {v0, v4}, Lbsh/security/SecurityError;->reflectCantGetStaticField(Ljava/lang/Class;Ljava/lang/String;)Lbsh/security/SecurityError;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    throw p0

    .line 148
    :cond_6
    aget-object v0, p3, v2

    .line 149
    .line 150
    :try_start_3
    invoke-virtual {p0}, L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲()V
    :try_end_3
    .catch Lbsh/security/SecurityError; {:try_start_3 .. :try_end_3} :catch_3

    .line 151
    .line 152
    .line 153
    goto :goto_2

    .line 154
    :catch_3
    invoke-static {v0, v4}, Lbsh/security/SecurityError;->reflectCantGetField(Ljava/lang/Object;Ljava/lang/String;)Lbsh/security/SecurityError;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    throw p0

    .line 159
    :cond_7
    :goto_2
    instance-of v0, p1, Ljava/lang/Class;

    .line 160
    .line 161
    const-string v4, "newInstance"

    .line 162
    .line 163
    if-eqz v0, :cond_8

    .line 164
    .line 165
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    if-eqz v0, :cond_8

    .line 170
    .line 171
    move-object v0, p1

    .line 172
    check-cast v0, Ljava/lang/Class;

    .line 173
    .line 174
    new-array v4, v2, [Ljava/lang/Object;

    .line 175
    .line 176
    :try_start_4
    invoke-virtual {p0, v0, v4}, L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;[Ljava/lang/Object;)V
    :try_end_4
    .catch Lbsh/security/SecurityError; {:try_start_4 .. :try_end_4} :catch_4

    .line 177
    .line 178
    .line 179
    goto :goto_4

    .line 180
    :catch_4
    invoke-static {v0, v4}, Lbsh/security/SecurityError;->reflectCantConstruct(Ljava/lang/Class;[Ljava/lang/Object;)Lbsh/security/SecurityError;

    .line 181
    .line 182
    .line 183
    move-result-object p0

    .line 184
    throw p0

    .line 185
    :cond_8
    instance-of v0, p1, Ljava/lang/reflect/Constructor;

    .line 186
    .line 187
    if-eqz v0, :cond_a

    .line 188
    .line 189
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v0

    .line 193
    if-eqz v0, :cond_a

    .line 194
    .line 195
    move-object v0, p1

    .line 196
    check-cast v0, Ljava/lang/reflect/Constructor;

    .line 197
    .line 198
    invoke-virtual {v0}, Ljava/lang/reflect/Constructor;->getDeclaringClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    array-length v4, p3

    .line 203
    if-ne v4, v3, :cond_9

    .line 204
    .line 205
    aget-object v4, p3, v2

    .line 206
    .line 207
    instance-of v5, v4, [Ljava/lang/Object;

    .line 208
    .line 209
    if-eqz v5, :cond_9

    .line 210
    .line 211
    check-cast v4, [Ljava/lang/Object;

    .line 212
    .line 213
    goto :goto_3

    .line 214
    :cond_9
    move-object v4, p3

    .line 215
    :goto_3
    :try_start_5
    invoke-virtual {p0, v0, v4}, L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;[Ljava/lang/Object;)V
    :try_end_5
    .catch Lbsh/security/SecurityError; {:try_start_5 .. :try_end_5} :catch_5

    .line 216
    .line 217
    .line 218
    goto :goto_4

    .line 219
    :catch_5
    invoke-static {v0, v4}, Lbsh/security/SecurityError;->reflectCantConstruct(Ljava/lang/Class;[Ljava/lang/Object;)Lbsh/security/SecurityError;

    .line 220
    .line 221
    .line 222
    move-result-object p0

    .line 223
    throw p0

    .line 224
    :cond_a
    :goto_4
    const-string v0, "invoke"

    .line 225
    .line 226
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    move-result p2

    .line 230
    if-eqz p2, :cond_e

    .line 231
    .line 232
    array-length p2, p3

    .line 233
    if-eqz p2, :cond_e

    .line 234
    .line 235
    instance-of p2, p1, Ljava/lang/reflect/Method;

    .line 236
    .line 237
    if-nez p2, :cond_b

    .line 238
    .line 239
    goto :goto_6

    .line 240
    :cond_b
    check-cast p1, Ljava/lang/reflect/Method;

    .line 241
    .line 242
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object p2

    .line 246
    array-length v0, p3

    .line 247
    if-ne v0, v1, :cond_c

    .line 248
    .line 249
    aget-object v0, p3, v3

    .line 250
    .line 251
    instance-of v1, v0, [Ljava/lang/Object;

    .line 252
    .line 253
    if-eqz v1, :cond_c

    .line 254
    .line 255
    check-cast v0, [Ljava/lang/Object;

    .line 256
    .line 257
    goto :goto_5

    .line 258
    :cond_c
    array-length v0, p3

    .line 259
    invoke-static {p3, v3, v0}, Ljava/util/Arrays;->copyOfRange([Ljava/lang/Object;II)[Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    :goto_5
    sget-object v1, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世苏哲兰:[Ljava/lang/Object;

    .line 264
    .line 265
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 266
    .line 267
    .line 268
    move-result v1

    .line 269
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 270
    .line 271
    .line 272
    move-result v1

    .line 273
    if-eqz v1, :cond_d

    .line 274
    .line 275
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 276
    .line 277
    .line 278
    move-result-object p1

    .line 279
    :try_start_6
    invoke-virtual {p0, p1, p2, v0}, L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_6
    .catch Lbsh/security/SecurityError; {:try_start_6 .. :try_end_6} :catch_6

    .line 280
    .line 281
    .line 282
    return-void

    .line 283
    :catch_6
    invoke-static {p1, p2, v0}, Lbsh/security/SecurityError;->reflectCantInvokeStaticMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lbsh/security/SecurityError;

    .line 284
    .line 285
    .line 286
    move-result-object p0

    .line 287
    throw p0

    .line 288
    :cond_d
    aget-object p1, p3, v2

    .line 289
    .line 290
    :try_start_7
    invoke-virtual {p0, p1, p2, v0}, L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_7
    .catch Lbsh/security/SecurityError; {:try_start_7 .. :try_end_7} :catch_7

    .line 291
    .line 292
    .line 293
    return-void

    .line 294
    :catch_7
    invoke-static {p1, p2, v0}, Lbsh/security/SecurityError;->reflectCantInvokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Lbsh/security/SecurityError;

    .line 295
    .line 296
    .line 297
    move-result-object p0

    .line 298
    throw p0

    .line 299
    :cond_e
    :goto_6
    return-void
.end method

.method public final 飘花落叶言子楪世哲苏兰(Ljava/lang/Class;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object p0, p0, L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏哲兰;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    const-class v0, Lbsh/Interpreter;

    .line 23
    .line 24
    if-ne p1, v0, :cond_0

    .line 25
    .line 26
    const-string v0, "mainSecurityGuard"

    .line 27
    .line 28
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    invoke-static {p1, p2}, Lbsh/security/SecurityError;->cantGetStaticField(Ljava/lang/Class;Ljava/lang/String;)Lbsh/security/SecurityError;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    throw p0

    .line 40
    :cond_2
    return-void
.end method

.method public final 飘花落叶言子楪世苏兰哲()V
    .locals 1

    .line 1
    iget-object p0, p0, L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏哲兰;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-void
.end method

.method public final 飘花落叶言子楪世苏哲兰(Ljava/lang/Class;[Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-static {p2}, Lbsh/Primitive;->unwrap([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    iget-object p0, p0, L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/HashSet;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏哲兰;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    const-class v0, L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏兰哲;

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_0

    .line 33
    .line 34
    const-class v0, L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏哲兰;

    .line 35
    .line 36
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-nez v0, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    invoke-static {p1, p2}, Lbsh/security/SecurityError;->cantConstruct(Ljava/lang/Class;[Ljava/lang/Object;)Lbsh/security/SecurityError;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    throw p0

    .line 48
    :cond_1
    return-void
.end method

.method public final 飘花落叶言子楪苏世哲兰(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-static {p3}, Lbsh/Primitive;->unwrap(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    iget-object p0, p0, L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/HashSet;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏哲兰;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    const-class v0, Lbsh/Interpreter;

    .line 27
    .line 28
    if-ne p1, v0, :cond_0

    .line 29
    .line 30
    const-string v0, "mainSecurityGuard"

    .line 31
    .line 32
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    invoke-static {p1, p2, p3}, Lbsh/security/SecurityError;->cantSetStaticField(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Lbsh/security/SecurityError;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    throw p0

    .line 44
    :cond_2
    return-void
.end method
