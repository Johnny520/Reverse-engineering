.class public final Lm8/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public a:I

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public final f:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 270
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x20

    .line 271
    new-array v1, v0, [Lv1/l;

    iput-object v1, p0, Lm8/c;->b:Ljava/lang/Object;

    .line 272
    new-array v1, v0, [F

    iput-object v1, p0, Lm8/c;->c:Ljava/lang/Object;

    .line 273
    new-array v0, v0, [B

    iput-object v0, p0, Lm8/c;->d:Ljava/lang/Object;

    .line 274
    sget-object v0, Lf/s0;->a:Lf/l0;

    .line 275
    new-instance v0, Lf/l0;

    invoke-direct {v0}, Lf/l0;-><init>()V

    .line 276
    iput-object v0, p0, Lm8/c;->e:Ljava/lang/Object;

    .line 277
    new-instance v0, Lf/l0;

    invoke-direct {v0}, Lf/l0;-><init>()V

    .line 278
    iput-object v0, p0, Lm8/c;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/io/StringWriter;IILjava/lang/String;)V
    .locals 3

    .line 250
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_2

    const/4 v0, 0x1

    if-lt p2, v0, :cond_1

    if-lt p3, v0, :cond_0

    .line 251
    new-instance v0, Ljava/io/StringWriter;

    const/16 v1, 0x3e8

    invoke-direct {v0, v1}, Ljava/io/StringWriter;-><init>(I)V

    .line 252
    new-instance v2, Ljava/io/StringWriter;

    invoke-direct {v2, v1}, Ljava/io/StringWriter;-><init>(I)V

    .line 253
    iput-object p1, p0, Lm8/c;->b:Ljava/lang/Object;

    .line 254
    iput p2, p0, Lm8/c;->a:I

    .line 255
    invoke-virtual {v0}, Ljava/io/StringWriter;->getBuffer()Ljava/lang/StringBuffer;

    move-result-object p1

    iput-object p1, p0, Lm8/c;->c:Ljava/lang/Object;

    .line 256
    invoke-virtual {v2}, Ljava/io/StringWriter;->getBuffer()Ljava/lang/StringBuffer;

    move-result-object p1

    iput-object p1, p0, Lm8/c;->d:Ljava/lang/Object;

    .line 257
    new-instance p1, Lz4/f;

    .line 258
    const-string v1, ""

    invoke-direct {p1, v0, p2, v1}, Lz4/f;-><init>(Ljava/io/StringWriter;ILjava/lang/String;)V

    .line 259
    iput-object p1, p0, Lm8/c;->e:Ljava/lang/Object;

    .line 260
    new-instance p1, Lz4/f;

    invoke-direct {p1, v2, p3, p4}, Lz4/f;-><init>(Ljava/io/StringWriter;ILjava/lang/String;)V

    iput-object p1, p0, Lm8/c;->f:Ljava/lang/Object;

    return-void

    .line 261
    :cond_0
    const-string p1, "rightWidth < 1"

    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    .line 262
    :cond_1
    const-string p1, "leftWidth < 1"

    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    .line 263
    :cond_2
    const-string p1, "out == null"

    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public constructor <init>(Ljava/math/BigInteger;)V
    .locals 8

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/math/BigInteger;

    .line 5
    .line 6
    const-string v1, "ffffffffffffffff"

    .line 7
    .line 8
    const/16 v2, 0x10

    .line 9
    .line 10
    invoke-direct {v0, v1, v2}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lm8/c;->b:Ljava/lang/Object;

    .line 14
    .line 15
    const/16 v0, 0x8

    .line 16
    .line 17
    new-array v1, v0, [Ljava/math/BigInteger;

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    move v4, v3

    .line 21
    :goto_0
    if-ge v4, v0, :cond_0

    .line 22
    .line 23
    new-instance v5, Ljava/math/BigInteger;

    .line 24
    .line 25
    const-string v6, "9e3779b97f4a7c13"

    .line 26
    .line 27
    invoke-direct {v5, v6, v2}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;I)V

    .line 28
    .line 29
    .line 30
    aput-object v5, v1, v4

    .line 31
    .line 32
    add-int/lit8 v4, v4, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    iput-object v1, p0, Lm8/c;->c:Ljava/lang/Object;

    .line 36
    .line 37
    const/16 v1, 0x100

    .line 38
    .line 39
    new-array v2, v1, [Ljava/math/BigInteger;

    .line 40
    .line 41
    move v4, v3

    .line 42
    :goto_1
    if-ge v4, v1, :cond_1

    .line 43
    .line 44
    sget-object v5, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    .line 45
    .line 46
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    aput-object v5, v2, v4

    .line 50
    .line 51
    add-int/lit8 v4, v4, 0x1

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    iput-object v2, p0, Lm8/c;->d:Ljava/lang/Object;

    .line 55
    .line 56
    new-array v2, v1, [Ljava/math/BigInteger;

    .line 57
    .line 58
    move v4, v3

    .line 59
    :goto_2
    if-ge v4, v1, :cond_2

    .line 60
    .line 61
    sget-object v5, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    .line 62
    .line 63
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    aput-object v5, v2, v4

    .line 67
    .line 68
    add-int/lit8 v4, v4, 0x1

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_2
    iput-object v2, p0, Lm8/c;->e:Ljava/lang/Object;

    .line 72
    .line 73
    new-array v2, v1, [Ljava/math/BigInteger;

    .line 74
    .line 75
    move v4, v3

    .line 76
    :goto_3
    if-ge v4, v1, :cond_3

    .line 77
    .line 78
    sget-object v5, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    .line 79
    .line 80
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    aput-object v5, v2, v4

    .line 84
    .line 85
    add-int/lit8 v4, v4, 0x1

    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_3
    iput-object v2, p0, Lm8/c;->f:Ljava/lang/Object;

    .line 89
    .line 90
    const/16 v2, 0xff

    .line 91
    .line 92
    iput v2, p0, Lm8/c;->a:I

    .line 93
    .line 94
    iget-object v2, p0, Lm8/c;->d:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v2, [Ljava/math/BigInteger;

    .line 97
    .line 98
    aput-object p1, v2, v3

    .line 99
    .line 100
    move p1, v3

    .line 101
    :goto_4
    const/4 v2, 0x4

    .line 102
    if-ge p1, v2, :cond_4

    .line 103
    .line 104
    iget-object v2, p0, Lm8/c;->c:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v2, [Ljava/math/BigInteger;

    .line 107
    .line 108
    invoke-virtual {p0, v2}, Lm8/c;->g([Ljava/math/BigInteger;)V

    .line 109
    .line 110
    .line 111
    add-int/lit8 p1, p1, 0x1

    .line 112
    .line 113
    goto :goto_4

    .line 114
    :cond_4
    move p1, v3

    .line 115
    :goto_5
    if-ge p1, v1, :cond_7

    .line 116
    .line 117
    move v2, v3

    .line 118
    :goto_6
    iget-object v4, p0, Lm8/c;->c:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v4, [Ljava/math/BigInteger;

    .line 121
    .line 122
    if-lt v2, v0, :cond_6

    .line 123
    .line 124
    invoke-virtual {p0, v4}, Lm8/c;->g([Ljava/math/BigInteger;)V

    .line 125
    .line 126
    .line 127
    move v2, v3

    .line 128
    :goto_7
    if-lt v2, v0, :cond_5

    .line 129
    .line 130
    add-int/lit8 p1, p1, 0x8

    .line 131
    .line 132
    goto :goto_5

    .line 133
    :cond_5
    iget-object v4, p0, Lm8/c;->e:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v4, [Ljava/math/BigInteger;

    .line 136
    .line 137
    add-int v5, p1, v2

    .line 138
    .line 139
    iget-object v6, p0, Lm8/c;->c:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v6, [Ljava/math/BigInteger;

    .line 142
    .line 143
    aget-object v6, v6, v2

    .line 144
    .line 145
    aput-object v6, v4, v5

    .line 146
    .line 147
    add-int/lit8 v2, v2, 0x1

    .line 148
    .line 149
    goto :goto_7

    .line 150
    :cond_6
    aget-object v5, v4, v2

    .line 151
    .line 152
    iget-object v6, p0, Lm8/c;->d:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast v6, [Ljava/math/BigInteger;

    .line 155
    .line 156
    add-int v7, p1, v2

    .line 157
    .line 158
    aget-object v6, v6, v7

    .line 159
    .line 160
    invoke-virtual {v5, v6}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 161
    .line 162
    .line 163
    move-result-object v5

    .line 164
    iget-object v6, p0, Lm8/c;->b:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v6, Ljava/math/BigInteger;

    .line 167
    .line 168
    invoke-virtual {v5, v6}, Ljava/math/BigInteger;->and(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 169
    .line 170
    .line 171
    move-result-object v5

    .line 172
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    aput-object v5, v4, v2

    .line 176
    .line 177
    add-int/lit8 v2, v2, 0x1

    .line 178
    .line 179
    goto :goto_6

    .line 180
    :cond_7
    move p1, v3

    .line 181
    :goto_8
    if-ge p1, v1, :cond_a

    .line 182
    .line 183
    move v2, v3

    .line 184
    :goto_9
    iget-object v4, p0, Lm8/c;->c:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v4, [Ljava/math/BigInteger;

    .line 187
    .line 188
    if-lt v2, v0, :cond_9

    .line 189
    .line 190
    invoke-virtual {p0, v4}, Lm8/c;->g([Ljava/math/BigInteger;)V

    .line 191
    .line 192
    .line 193
    move v2, v3

    .line 194
    :goto_a
    if-lt v2, v0, :cond_8

    .line 195
    .line 196
    add-int/lit8 p1, p1, 0x8

    .line 197
    .line 198
    goto :goto_8

    .line 199
    :cond_8
    iget-object v4, p0, Lm8/c;->e:Ljava/lang/Object;

    .line 200
    .line 201
    check-cast v4, [Ljava/math/BigInteger;

    .line 202
    .line 203
    add-int v5, p1, v2

    .line 204
    .line 205
    iget-object v6, p0, Lm8/c;->c:Ljava/lang/Object;

    .line 206
    .line 207
    check-cast v6, [Ljava/math/BigInteger;

    .line 208
    .line 209
    aget-object v6, v6, v2

    .line 210
    .line 211
    aput-object v6, v4, v5

    .line 212
    .line 213
    add-int/lit8 v2, v2, 0x1

    .line 214
    .line 215
    goto :goto_a

    .line 216
    :cond_9
    aget-object v5, v4, v2

    .line 217
    .line 218
    iget-object v6, p0, Lm8/c;->e:Ljava/lang/Object;

    .line 219
    .line 220
    check-cast v6, [Ljava/math/BigInteger;

    .line 221
    .line 222
    add-int v7, p1, v2

    .line 223
    .line 224
    aget-object v6, v6, v7

    .line 225
    .line 226
    invoke-virtual {v5, v6}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 227
    .line 228
    .line 229
    move-result-object v5

    .line 230
    iget-object v6, p0, Lm8/c;->b:Ljava/lang/Object;

    .line 231
    .line 232
    check-cast v6, Ljava/math/BigInteger;

    .line 233
    .line 234
    invoke-virtual {v5, v6}, Ljava/math/BigInteger;->and(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 235
    .line 236
    .line 237
    move-result-object v5

    .line 238
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 239
    .line 240
    .line 241
    aput-object v5, v4, v2

    .line 242
    .line 243
    add-int/lit8 v2, v2, 0x1

    .line 244
    .line 245
    goto :goto_9

    .line 246
    :cond_a
    invoke-virtual {p0}, Lm8/c;->n()V

    .line 247
    .line 248
    .line 249
    return-void
.end method

.method public constructor <init>(Lm8/b;)V
    .locals 1

    .line 264
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 265
    iput v0, p0, Lm8/c;->a:I

    .line 266
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Lm8/c;->e:Ljava/lang/Object;

    .line 267
    invoke-static {}, Lj8/b;->o()Ljava/util/Set;

    move-result-object v0

    .line 268
    iput-object v0, p0, Lm8/c;->f:Ljava/lang/Object;

    .line 269
    iput-object p1, p0, Lm8/c;->b:Ljava/lang/Object;

    return-void
.end method

.method public static a(Ljava/lang/StringBuffer;Ljava/io/Writer;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/StringBuffer;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    add-int/lit8 v0, v0, -0x1

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Ljava/lang/StringBuffer;->charAt(I)C

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    const/16 v0, 0xa

    .line 14
    .line 15
    if-eq p0, v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(I)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public static d(Ljava/lang/Class;Ljava/lang/reflect/Method;)Z
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    goto/16 :goto_0

    .line 5
    .line 6
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const-string v2, "equals"

    .line 11
    .line 12
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-nez v2, :cond_9

    .line 17
    .line 18
    const-string v2, "hashCode"

    .line 19
    .line 20
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-nez v2, :cond_9

    .line 25
    .line 26
    const-string v2, "toString"

    .line 27
    .line 28
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-nez v2, :cond_9

    .line 33
    .line 34
    const-string v2, "wait"

    .line 35
    .line 36
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-nez v2, :cond_9

    .line 41
    .line 42
    const-string v2, "notify"

    .line 43
    .line 44
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-nez v2, :cond_9

    .line 49
    .line 50
    const-string v2, "notifyAll"

    .line 51
    .line 52
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_1

    .line 57
    .line 58
    goto/16 :goto_0

    .line 59
    .line 60
    :cond_1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    if-eqz v1, :cond_9

    .line 65
    .line 66
    array-length v2, v1

    .line 67
    const/4 v3, 0x2

    .line 68
    const/4 v4, 0x1

    .line 69
    if-eq v2, v4, :cond_2

    .line 70
    .line 71
    array-length v2, v1

    .line 72
    if-eq v2, v3, :cond_2

    .line 73
    .line 74
    goto/16 :goto_0

    .line 75
    .line 76
    :cond_2
    array-length v2, v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 77
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 78
    .line 79
    if-ne v2, v3, :cond_3

    .line 80
    .line 81
    :try_start_1
    aget-object v2, v1, v4

    .line 82
    .line 83
    if-eq v2, v5, :cond_3

    .line 84
    .line 85
    const-class v3, Ljava/lang/Integer;

    .line 86
    .line 87
    if-eq v2, v3, :cond_3

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_3
    aget-object v1, v1, v0

    .line 91
    .line 92
    if-eqz v1, :cond_9

    .line 93
    .line 94
    invoke-virtual {v1}, Ljava/lang/Class;->isPrimitive()Z

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    if-nez v2, :cond_9

    .line 99
    .line 100
    const-class v2, Ljava/lang/String;

    .line 101
    .line 102
    if-eq v1, v2, :cond_9

    .line 103
    .line 104
    const-class v2, Ljava/lang/Object;

    .line 105
    .line 106
    if-ne v1, v2, :cond_4

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_4
    if-eqz p0, :cond_5

    .line 110
    .line 111
    invoke-virtual {v1, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    if-nez v2, :cond_5

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_5
    if-nez p0, :cond_7

    .line 119
    .line 120
    invoke-virtual {v1}, Ljava/lang/Class;->isPrimitive()Z

    .line 121
    .line 122
    .line 123
    move-result p0

    .line 124
    if-nez p0, :cond_9

    .line 125
    .line 126
    invoke-virtual {v1}, Ljava/lang/Class;->isInterface()Z

    .line 127
    .line 128
    .line 129
    move-result p0

    .line 130
    if-eqz p0, :cond_6

    .line 131
    .line 132
    goto :goto_0

    .line 133
    :cond_6
    const-string p0, "getType"

    .line 134
    .line 135
    new-array v2, v0, [Ljava/lang/Class;

    .line 136
    .line 137
    invoke-static {v1, p0, v2}, Lh/Hchat/utils/KavaReflector;->findMethodRecursive(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    if-eqz p0, :cond_9

    .line 142
    .line 143
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    array-length v1, v1

    .line 148
    if-nez v1, :cond_9

    .line 149
    .line 150
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    if-ne p0, v5, :cond_9

    .line 155
    .line 156
    :cond_7
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    sget-object p1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 161
    .line 162
    if-eq p0, p1, :cond_8

    .line 163
    .line 164
    const-class p1, Ljava/lang/Boolean;

    .line 165
    .line 166
    if-eq p0, p1, :cond_8

    .line 167
    .line 168
    if-eq p0, v5, :cond_8

    .line 169
    .line 170
    sget-object p1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 171
    .line 172
    if-ne p0, p1, :cond_9

    .line 173
    .line 174
    :cond_8
    return v4

    .line 175
    :catchall_0
    :cond_9
    :goto_0
    return v0
.end method

.method public static f(Ljava/lang/reflect/Method;)I
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "g"

    .line 10
    .line 11
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-nez v2, :cond_1

    .line 16
    .line 17
    const-string v2, "f"

    .line 18
    .line 19
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_2

    .line 24
    .line 25
    :cond_1
    const/16 v0, 0x50

    .line 26
    .line 27
    :cond_2
    const-string v2, "h"

    .line 28
    .line 29
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_3

    .line 34
    .line 35
    add-int/lit8 v0, v0, 0x46

    .line 36
    .line 37
    :cond_3
    const-string v2, "doScene"

    .line 38
    .line 39
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-nez v2, :cond_4

    .line 44
    .line 45
    const-string v2, "doSceneImp"

    .line 46
    .line 47
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_5

    .line 52
    .line 53
    :cond_4
    add-int/lit8 v0, v0, 0x50

    .line 54
    .line 55
    :cond_5
    const-string v2, "d"

    .line 56
    .line 57
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-nez v2, :cond_6

    .line 62
    .line 63
    const-string v2, "cancel"

    .line 64
    .line 65
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-eqz v1, :cond_7

    .line 70
    .line 71
    :cond_6
    add-int/lit8 v0, v0, -0x64

    .line 72
    .line 73
    :cond_7
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 78
    .line 79
    if-eq v1, v2, :cond_8

    .line 80
    .line 81
    const-class v2, Ljava/lang/Boolean;

    .line 82
    .line 83
    if-ne v1, v2, :cond_9

    .line 84
    .line 85
    :cond_8
    add-int/lit8 v0, v0, 0x64

    .line 86
    .line 87
    :cond_9
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 88
    .line 89
    if-eq v1, v2, :cond_a

    .line 90
    .line 91
    const-class v2, Ljava/lang/Integer;

    .line 92
    .line 93
    if-ne v1, v2, :cond_b

    .line 94
    .line 95
    :cond_a
    add-int/lit8 v0, v0, 0x14

    .line 96
    .line 97
    :cond_b
    sget-object v2, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 98
    .line 99
    if-ne v1, v2, :cond_c

    .line 100
    .line 101
    add-int/lit8 v0, v0, -0x32

    .line 102
    .line 103
    :cond_c
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    array-length p0, p0

    .line 108
    const/4 v1, 0x2

    .line 109
    if-ne p0, v1, :cond_d

    .line 110
    .line 111
    add-int/lit8 v0, v0, 0xa

    .line 112
    .line 113
    :cond_d
    return v0
.end method

.method public static h(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p0, Ljava/lang/Boolean;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Ljava/lang/Boolean;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    instance-of v0, p0, Ljava/lang/Number;

    .line 13
    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    check-cast p0, Ljava/lang/Number;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    if-ltz p0, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const/4 p0, 0x0

    .line 26
    return p0

    .line 27
    :cond_2
    :goto_0
    const/4 p0, 0x1

    .line 28
    return p0
.end method

.method public static k(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    goto :goto_0

    .line 5
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Ljava/lang/Class;->isPrimitive()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-nez v2, :cond_4

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Class;->isEnum()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-nez v2, :cond_4

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Class;->isArray()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    instance-of v2, p0, Ljava/lang/String;

    .line 29
    .line 30
    if-nez v2, :cond_4

    .line 31
    .line 32
    instance-of v2, p0, Ljava/lang/Number;

    .line 33
    .line 34
    if-nez v2, :cond_4

    .line 35
    .line 36
    instance-of v2, p0, Ljava/lang/Boolean;

    .line 37
    .line 38
    if-nez v2, :cond_4

    .line 39
    .line 40
    instance-of v2, p0, Ljava/lang/Character;

    .line 41
    .line 42
    if-nez v2, :cond_4

    .line 43
    .line 44
    instance-of v2, p0, Landroid/content/Context;

    .line 45
    .line 46
    if-nez v2, :cond_4

    .line 47
    .line 48
    instance-of v2, p0, Landroid/app/Activity;

    .line 49
    .line 50
    if-nez v2, :cond_4

    .line 51
    .line 52
    instance-of v2, p0, Ljava/lang/Class;

    .line 53
    .line 54
    if-nez v2, :cond_4

    .line 55
    .line 56
    instance-of v2, p0, Ljava/lang/reflect/Method;

    .line 57
    .line 58
    if-nez v2, :cond_4

    .line 59
    .line 60
    instance-of p0, p0, Ljava/lang/reflect/Field;

    .line 61
    .line 62
    if-eqz p0, :cond_2

    .line 63
    .line 64
    return v0

    .line 65
    :cond_2
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    const-string v1, "java."

    .line 70
    .line 71
    invoke-virtual {p0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-nez v1, :cond_4

    .line 76
    .line 77
    const-string v1, "android.view."

    .line 78
    .line 79
    invoke-virtual {p0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-nez v1, :cond_4

    .line 84
    .line 85
    const-string v1, "android.widget."

    .line 86
    .line 87
    invoke-virtual {p0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-nez v1, :cond_4

    .line 92
    .line 93
    const-string v1, "android.graphics."

    .line 94
    .line 95
    invoke-virtual {p0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 96
    .line 97
    .line 98
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 99
    if-eqz p0, :cond_3

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_3
    const/4 p0, 0x0

    .line 103
    return p0

    .line 104
    :catchall_0
    :cond_4
    :goto_0
    return v0
.end method


# virtual methods
.method public b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/reflect/Method;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    if-nez p3, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iput-object p1, p0, Lm8/c;->c:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, Lm8/c;->d:Ljava/lang/Object;

    .line 9
    .line 10
    invoke-virtual {p3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    array-length v0, v0

    .line 15
    iput v0, p0, Lm8/c;->a:I

    .line 16
    .line 17
    const-string v0, ": "

    .line 18
    .line 19
    invoke-static {p2, v0}, Lbc/e;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string p1, "#"

    .line 35
    .line 36
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p0, p1}, Lm8/c;->e(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    :cond_1
    :goto_0
    return-void
.end method

.method public declared-synchronized c(Ljava/lang/Class;Ljava/util/List;)V
    .locals 8

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 3
    .line 4
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 5
    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    move-exception p1

    .line 14
    goto/16 :goto_4

    .line 15
    .line 16
    :cond_0
    :goto_0
    if-eqz p2, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0, p2}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 19
    .line 20
    .line 21
    :cond_1
    new-instance p1, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, Lm8/c;->e:Ljava/lang/Object;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eqz p1, :cond_2

    .line 33
    .line 34
    const-string p1, "\u7f51\u7edc\u961f\u5217\u7c7b\u4e3anull\uff0c\u4e14\u6ca1\u6709\u5019\u9009\u7c7b"

    .line 35
    .line 36
    invoke-virtual {p0, p1}, Lm8/c;->e(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    monitor-exit p0

    .line 40
    return-void

    .line 41
    :cond_2
    :try_start_1
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    const/4 p2, 0x0

    .line 46
    :cond_3
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_7

    .line 51
    .line 52
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    check-cast v1, Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 57
    .line 58
    if-nez v1, :cond_4

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_4
    :try_start_2
    invoke-static {v1}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    :cond_5
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    if-eqz v3, :cond_3

    .line 74
    .line 75
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    check-cast v3, Ljava/lang/reflect/Method;

    .line 80
    .line 81
    const/4 v4, 0x0

    .line 82
    invoke-static {v4, v3}, Lm8/c;->d(Ljava/lang/Class;Ljava/lang/reflect/Method;)Z

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    if-eqz v4, :cond_5

    .line 87
    .line 88
    iget-object v4, p0, Lm8/c;->f:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v4, Ljava/util/Set;

    .line 91
    .line 92
    invoke-interface {v4, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 96
    if-nez v4, :cond_6

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_6
    :try_start_3
    sget-object v4, Lr8/i;->b:Lr8/i;

    .line 100
    .line 101
    new-instance v5, Lc9/c2;

    .line 102
    .line 103
    const/16 v6, 0x8

    .line 104
    .line 105
    const/4 v7, 0x0

    .line 106
    invoke-direct {v5, v6, p0, v3, v7}, Lc9/c2;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v4, v3, v5}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 110
    .line 111
    .line 112
    add-int/lit8 p2, p2, 0x1

    .line 113
    .line 114
    goto :goto_2

    .line 115
    :catchall_1
    move-exception v4

    .line 116
    :try_start_4
    iget-object v5, p0, Lm8/c;->f:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v5, Ljava/util/Set;

    .line 119
    .line 120
    invoke-interface {v5, v3}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    new-instance v5, Ljava/lang/StringBuilder;

    .line 124
    .line 125
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 126
    .line 127
    .line 128
    const-string v6, "\u7f51\u7edc\u961f\u5217\u65b9\u6cd5Hook\u5931\u8d25: "

    .line 129
    .line 130
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    const-string v3, " "

    .line 141
    .line 142
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    invoke-virtual {p0, v3}, Lm8/c;->e(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 157
    .line 158
    .line 159
    goto :goto_2

    .line 160
    :catchall_2
    move-exception v2

    .line 161
    :try_start_5
    new-instance v3, Ljava/lang/StringBuilder;

    .line 162
    .line 163
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 164
    .line 165
    .line 166
    const-string v4, "\u7f51\u7edc\u961f\u5217\u7c7b\u626b\u63cf\u5931\u8d25: "

    .line 167
    .line 168
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    const-string v1, " "

    .line 179
    .line 180
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    invoke-virtual {p0, v1}, Lm8/c;->e(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    goto/16 :goto_1

    .line 198
    .line 199
    :cond_7
    if-nez p2, :cond_8

    .line 200
    .line 201
    iget-object p1, p0, Lm8/c;->f:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast p1, Ljava/util/Set;

    .line 204
    .line 205
    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    .line 206
    .line 207
    .line 208
    move-result p1

    .line 209
    if-eqz p1, :cond_8

    .line 210
    .line 211
    new-instance p1, Ljava/lang/StringBuilder;

    .line 212
    .line 213
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 214
    .line 215
    .line 216
    const-string p2, "\u7f51\u7edc\u961f\u5217\u5019\u9009\u7c7b\u65e0\u5408\u9002\u65b9\u6cd5\u53efHook: "

    .line 217
    .line 218
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    .line 222
    .line 223
    .line 224
    move-result p2

    .line 225
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object p1

    .line 232
    invoke-virtual {p0, p1}, Lm8/c;->e(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    goto :goto_3

    .line 236
    :cond_8
    if-lez p2, :cond_9

    .line 237
    .line 238
    new-instance p1, Ljava/lang/StringBuilder;

    .line 239
    .line 240
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 241
    .line 242
    .line 243
    const-string v1, "\u7f51\u7edc\u961f\u5217\u8865\u88c5Hook: classes="

    .line 244
    .line 245
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    .line 249
    .line 250
    .line 251
    move-result v0

    .line 252
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    const-string v0, " methods="

    .line 256
    .line 257
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object p1

    .line 267
    invoke-virtual {p0, p1}, Lm8/c;->e(Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 268
    .line 269
    .line 270
    :cond_9
    :goto_3
    monitor-exit p0

    .line 271
    return-void

    .line 272
    :goto_4
    :try_start_6
    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 273
    throw p1
.end method

.method public e(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lm8/c;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lm8/b;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0, p1}, Lm8/b;->a(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public g([Ljava/math/BigInteger;)V
    .locals 12

    .line 1
    const/4 v0, 0x0

    .line 2
    aget-object v1, p1, v0

    .line 3
    .line 4
    const/4 v2, 0x4

    .line 5
    aget-object v3, p1, v2

    .line 6
    .line 7
    invoke-virtual {v1, v3}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v3, p0, Lm8/c;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v3, Ljava/math/BigInteger;

    .line 14
    .line 15
    invoke-virtual {v1, v3}, Ljava/math/BigInteger;->and(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    aput-object v1, p1, v0

    .line 23
    .line 24
    const/4 v1, 0x5

    .line 25
    aget-object v4, p1, v1

    .line 26
    .line 27
    const/4 v5, 0x7

    .line 28
    aget-object v6, p1, v5

    .line 29
    .line 30
    const/16 v7, 0x9

    .line 31
    .line 32
    invoke-virtual {v6, v7}, Ljava/math/BigInteger;->shiftRight(I)Ljava/math/BigInteger;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    invoke-virtual {v4, v6}, Ljava/math/BigInteger;->xor(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    invoke-virtual {v4, v3}, Ljava/math/BigInteger;->and(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    aput-object v4, p1, v1

    .line 48
    .line 49
    aget-object v4, p1, v5

    .line 50
    .line 51
    aget-object v6, p1, v0

    .line 52
    .line 53
    invoke-virtual {v4, v6}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    invoke-virtual {v4, v3}, Ljava/math/BigInteger;->and(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    aput-object v4, p1, v5

    .line 65
    .line 66
    const/4 v4, 0x1

    .line 67
    aget-object v6, p1, v4

    .line 68
    .line 69
    aget-object v8, p1, v1

    .line 70
    .line 71
    invoke-virtual {v6, v8}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    invoke-virtual {v6, v3}, Ljava/math/BigInteger;->and(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    aput-object v6, p1, v4

    .line 83
    .line 84
    const/4 v6, 0x6

    .line 85
    aget-object v8, p1, v6

    .line 86
    .line 87
    aget-object v9, p1, v0

    .line 88
    .line 89
    invoke-virtual {v9, v7}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    .line 90
    .line 91
    .line 92
    move-result-object v7

    .line 93
    invoke-virtual {v8, v7}, Ljava/math/BigInteger;->xor(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 94
    .line 95
    .line 96
    move-result-object v7

    .line 97
    invoke-virtual {v7, v3}, Ljava/math/BigInteger;->and(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 98
    .line 99
    .line 100
    move-result-object v7

    .line 101
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    aput-object v7, p1, v6

    .line 105
    .line 106
    aget-object v7, p1, v0

    .line 107
    .line 108
    aget-object v8, p1, v4

    .line 109
    .line 110
    invoke-virtual {v7, v8}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 111
    .line 112
    .line 113
    move-result-object v7

    .line 114
    invoke-virtual {v7, v3}, Ljava/math/BigInteger;->and(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 115
    .line 116
    .line 117
    move-result-object v7

    .line 118
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    aput-object v7, p1, v0

    .line 122
    .line 123
    const/4 v7, 0x2

    .line 124
    aget-object v8, p1, v7

    .line 125
    .line 126
    aget-object v9, p1, v6

    .line 127
    .line 128
    invoke-virtual {v8, v9}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 129
    .line 130
    .line 131
    move-result-object v8

    .line 132
    invoke-virtual {v8, v3}, Ljava/math/BigInteger;->and(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 133
    .line 134
    .line 135
    move-result-object v8

    .line 136
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    aput-object v8, p1, v7

    .line 140
    .line 141
    aget-object v8, p1, v5

    .line 142
    .line 143
    aget-object v9, p1, v4

    .line 144
    .line 145
    const/16 v10, 0x17

    .line 146
    .line 147
    invoke-virtual {v9, v10}, Ljava/math/BigInteger;->shiftRight(I)Ljava/math/BigInteger;

    .line 148
    .line 149
    .line 150
    move-result-object v9

    .line 151
    invoke-virtual {v8, v9}, Ljava/math/BigInteger;->xor(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 152
    .line 153
    .line 154
    move-result-object v8

    .line 155
    invoke-virtual {v8, v3}, Ljava/math/BigInteger;->and(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 156
    .line 157
    .line 158
    move-result-object v8

    .line 159
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    aput-object v8, p1, v5

    .line 163
    .line 164
    aget-object v8, p1, v4

    .line 165
    .line 166
    aget-object v9, p1, v7

    .line 167
    .line 168
    invoke-virtual {v8, v9}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 169
    .line 170
    .line 171
    move-result-object v8

    .line 172
    invoke-virtual {v8, v3}, Ljava/math/BigInteger;->and(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 173
    .line 174
    .line 175
    move-result-object v8

    .line 176
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    aput-object v8, p1, v4

    .line 180
    .line 181
    const/4 v8, 0x3

    .line 182
    aget-object v9, p1, v8

    .line 183
    .line 184
    aget-object v10, p1, v5

    .line 185
    .line 186
    invoke-virtual {v9, v10}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 187
    .line 188
    .line 189
    move-result-object v9

    .line 190
    invoke-virtual {v9, v3}, Ljava/math/BigInteger;->and(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 191
    .line 192
    .line 193
    move-result-object v9

    .line 194
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    aput-object v9, p1, v8

    .line 198
    .line 199
    aget-object v9, p1, v0

    .line 200
    .line 201
    aget-object v10, p1, v7

    .line 202
    .line 203
    const/16 v11, 0xf

    .line 204
    .line 205
    invoke-virtual {v10, v11}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    .line 206
    .line 207
    .line 208
    move-result-object v10

    .line 209
    invoke-virtual {v9, v10}, Ljava/math/BigInteger;->xor(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 210
    .line 211
    .line 212
    move-result-object v9

    .line 213
    invoke-virtual {v9, v3}, Ljava/math/BigInteger;->and(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 214
    .line 215
    .line 216
    move-result-object v9

    .line 217
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    aput-object v9, p1, v0

    .line 221
    .line 222
    aget-object v9, p1, v7

    .line 223
    .line 224
    aget-object v10, p1, v8

    .line 225
    .line 226
    invoke-virtual {v9, v10}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 227
    .line 228
    .line 229
    move-result-object v9

    .line 230
    invoke-virtual {v9, v3}, Ljava/math/BigInteger;->and(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 231
    .line 232
    .line 233
    move-result-object v9

    .line 234
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 235
    .line 236
    .line 237
    aput-object v9, p1, v7

    .line 238
    .line 239
    aget-object v9, p1, v2

    .line 240
    .line 241
    aget-object v0, p1, v0

    .line 242
    .line 243
    invoke-virtual {v9, v0}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    invoke-virtual {v0, v3}, Ljava/math/BigInteger;->and(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    .line 253
    .line 254
    aput-object v0, p1, v2

    .line 255
    .line 256
    aget-object v0, p1, v4

    .line 257
    .line 258
    aget-object v9, p1, v8

    .line 259
    .line 260
    const/16 v10, 0xe

    .line 261
    .line 262
    invoke-virtual {v9, v10}, Ljava/math/BigInteger;->shiftRight(I)Ljava/math/BigInteger;

    .line 263
    .line 264
    .line 265
    move-result-object v9

    .line 266
    invoke-virtual {v0, v9}, Ljava/math/BigInteger;->xor(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    invoke-virtual {v0, v3}, Ljava/math/BigInteger;->and(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 275
    .line 276
    .line 277
    aput-object v0, p1, v4

    .line 278
    .line 279
    aget-object v0, p1, v8

    .line 280
    .line 281
    aget-object v9, p1, v2

    .line 282
    .line 283
    invoke-virtual {v0, v9}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    invoke-virtual {v0, v3}, Ljava/math/BigInteger;->and(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 292
    .line 293
    .line 294
    aput-object v0, p1, v8

    .line 295
    .line 296
    aget-object v0, p1, v1

    .line 297
    .line 298
    aget-object v4, p1, v4

    .line 299
    .line 300
    invoke-virtual {v0, v4}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    invoke-virtual {v0, v3}, Ljava/math/BigInteger;->and(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 309
    .line 310
    .line 311
    aput-object v0, p1, v1

    .line 312
    .line 313
    aget-object v0, p1, v7

    .line 314
    .line 315
    aget-object v4, p1, v2

    .line 316
    .line 317
    const/16 v9, 0x14

    .line 318
    .line 319
    invoke-virtual {v4, v9}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    .line 320
    .line 321
    .line 322
    move-result-object v4

    .line 323
    invoke-virtual {v0, v4}, Ljava/math/BigInteger;->xor(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    invoke-virtual {v0, v3}, Ljava/math/BigInteger;->and(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 328
    .line 329
    .line 330
    move-result-object v0

    .line 331
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 332
    .line 333
    .line 334
    aput-object v0, p1, v7

    .line 335
    .line 336
    aget-object v0, p1, v2

    .line 337
    .line 338
    aget-object v4, p1, v1

    .line 339
    .line 340
    invoke-virtual {v0, v4}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 341
    .line 342
    .line 343
    move-result-object v0

    .line 344
    invoke-virtual {v0, v3}, Ljava/math/BigInteger;->and(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 349
    .line 350
    .line 351
    aput-object v0, p1, v2

    .line 352
    .line 353
    aget-object v0, p1, v6

    .line 354
    .line 355
    aget-object v4, p1, v7

    .line 356
    .line 357
    invoke-virtual {v0, v4}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    invoke-virtual {v0, v3}, Ljava/math/BigInteger;->and(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 366
    .line 367
    .line 368
    aput-object v0, p1, v6

    .line 369
    .line 370
    aget-object v0, p1, v8

    .line 371
    .line 372
    aget-object v4, p1, v1

    .line 373
    .line 374
    const/16 v7, 0x11

    .line 375
    .line 376
    invoke-virtual {v4, v7}, Ljava/math/BigInteger;->shiftRight(I)Ljava/math/BigInteger;

    .line 377
    .line 378
    .line 379
    move-result-object v4

    .line 380
    invoke-virtual {v0, v4}, Ljava/math/BigInteger;->xor(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 381
    .line 382
    .line 383
    move-result-object v0

    .line 384
    invoke-virtual {v0, v3}, Ljava/math/BigInteger;->and(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 385
    .line 386
    .line 387
    move-result-object v0

    .line 388
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 389
    .line 390
    .line 391
    aput-object v0, p1, v8

    .line 392
    .line 393
    aget-object v0, p1, v1

    .line 394
    .line 395
    aget-object v4, p1, v6

    .line 396
    .line 397
    invoke-virtual {v0, v4}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 398
    .line 399
    .line 400
    move-result-object v0

    .line 401
    invoke-virtual {v0, v3}, Ljava/math/BigInteger;->and(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 406
    .line 407
    .line 408
    aput-object v0, p1, v1

    .line 409
    .line 410
    aget-object v0, p1, v5

    .line 411
    .line 412
    aget-object v1, p1, v8

    .line 413
    .line 414
    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 415
    .line 416
    .line 417
    move-result-object v0

    .line 418
    invoke-virtual {v0, v3}, Ljava/math/BigInteger;->and(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 419
    .line 420
    .line 421
    move-result-object v0

    .line 422
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 423
    .line 424
    .line 425
    aput-object v0, p1, v5

    .line 426
    .line 427
    aget-object v0, p1, v2

    .line 428
    .line 429
    aget-object v1, p1, v6

    .line 430
    .line 431
    invoke-virtual {v1, v10}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    .line 432
    .line 433
    .line 434
    move-result-object v1

    .line 435
    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->xor(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 436
    .line 437
    .line 438
    move-result-object v0

    .line 439
    invoke-virtual {v0, v3}, Ljava/math/BigInteger;->and(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 440
    .line 441
    .line 442
    move-result-object v0

    .line 443
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 444
    .line 445
    .line 446
    aput-object v0, p1, v2

    .line 447
    .line 448
    aget-object v0, p1, v6

    .line 449
    .line 450
    aget-object v1, p1, v5

    .line 451
    .line 452
    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 453
    .line 454
    .line 455
    move-result-object v0

    .line 456
    invoke-virtual {v0, v3}, Ljava/math/BigInteger;->and(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 457
    .line 458
    .line 459
    move-result-object v0

    .line 460
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 461
    .line 462
    .line 463
    aput-object v0, p1, v6

    .line 464
    .line 465
    return-void
.end method

.method public i()V
    .locals 8

    .line 1
    iget-object v0, p0, Lm8/c;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/StringBuffer;

    .line 4
    .line 5
    iget-object v1, p0, Lm8/c;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/lang/StringBuffer;

    .line 8
    .line 9
    iget-object v2, p0, Lm8/c;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Ljava/io/Writer;

    .line 12
    .line 13
    :goto_0
    const-string v3, "\n"

    .line 14
    .line 15
    invoke-virtual {v1, v3}, Ljava/lang/StringBuffer;->indexOf(Ljava/lang/String;)I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    if-gez v4, :cond_0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->indexOf(Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-gez v3, :cond_1

    .line 27
    .line 28
    :goto_1
    return-void

    .line 29
    :cond_1
    const/4 v5, 0x0

    .line 30
    if-eqz v4, :cond_2

    .line 31
    .line 32
    invoke-virtual {v1, v5, v4}, Ljava/lang/StringBuffer;->substring(II)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    invoke-virtual {v2, v6}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :cond_2
    if-eqz v3, :cond_4

    .line 40
    .line 41
    iget v6, p0, Lm8/c;->a:I

    .line 42
    .line 43
    sub-int/2addr v6, v4

    .line 44
    :goto_2
    if-lez v6, :cond_3

    .line 45
    .line 46
    const/16 v7, 0x20

    .line 47
    .line 48
    invoke-virtual {v2, v7}, Ljava/io/Writer;->write(I)V

    .line 49
    .line 50
    .line 51
    add-int/lit8 v6, v6, -0x1

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_3
    invoke-virtual {v0, v5, v3}, Ljava/lang/StringBuffer;->substring(II)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    invoke-virtual {v2, v6}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    :cond_4
    const/16 v6, 0xa

    .line 62
    .line 63
    invoke-virtual {v2, v6}, Ljava/io/Writer;->write(I)V

    .line 64
    .line 65
    .line 66
    add-int/lit8 v4, v4, 0x1

    .line 67
    .line 68
    invoke-virtual {v1, v5, v4}, Ljava/lang/StringBuffer;->delete(II)Ljava/lang/StringBuffer;

    .line 69
    .line 70
    .line 71
    add-int/lit8 v3, v3, 0x1

    .line 72
    .line 73
    invoke-virtual {v0, v5, v3}, Ljava/lang/StringBuffer;->delete(II)Ljava/lang/StringBuffer;

    .line 74
    .line 75
    .line 76
    goto :goto_0
.end method

.method public j(Ljava/lang/Object;)Z
    .locals 14

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    goto/16 :goto_9

    .line 9
    .line 10
    :cond_0
    instance-of v2, p1, [Ljava/lang/Object;

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    move-object v2, p1

    .line 16
    check-cast v2, [Ljava/lang/Object;

    .line 17
    .line 18
    array-length v4, v2

    .line 19
    if-ne v4, v3, :cond_1

    .line 20
    .line 21
    aget-object p1, v2, v0

    .line 22
    .line 23
    :cond_1
    if-nez p1, :cond_2

    .line 24
    .line 25
    goto/16 :goto_9

    .line 26
    .line 27
    :cond_2
    iget-object v2, p0, Lm8/c;->c:Ljava/lang/Object;

    .line 28
    .line 29
    if-eqz v2, :cond_4

    .line 30
    .line 31
    iget-object v2, p0, Lm8/c;->d:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v2, Ljava/lang/reflect/Method;

    .line 34
    .line 35
    if-nez v2, :cond_3

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_3
    invoke-static {v2}, Lm8/c;->f(Ljava/lang/reflect/Method;)I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    const/16 v4, 0x64

    .line 43
    .line 44
    if-ge v2, v4, :cond_11

    .line 45
    .line 46
    iget-object v2, p0, Lm8/c;->c:Ljava/lang/Object;

    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-virtual {p0, v2, v4}, Lm8/c;->l(Ljava/lang/Object;Ljava/lang/Class;)Z

    .line 53
    .line 54
    .line 55
    goto/16 :goto_4

    .line 56
    .line 57
    :cond_4
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    iget-object v4, p0, Lm8/c;->c:Ljava/lang/Object;

    .line 62
    .line 63
    if-eqz v4, :cond_5

    .line 64
    .line 65
    iget-object v4, p0, Lm8/c;->d:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v4, Ljava/lang/reflect/Method;

    .line 68
    .line 69
    if-eqz v4, :cond_5

    .line 70
    .line 71
    goto/16 :goto_4

    .line 72
    .line 73
    :cond_5
    iget-object v4, p0, Lm8/c;->e:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v4, Ljava/util/List;

    .line 76
    .line 77
    if-eqz v4, :cond_11

    .line 78
    .line 79
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    :catchall_0
    :cond_6
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    if-eqz v5, :cond_11

    .line 88
    .line 89
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    check-cast v5, Ljava/lang/Class;

    .line 94
    .line 95
    if-eqz v5, :cond_6

    .line 96
    .line 97
    new-instance v6, Ljava/util/IdentityHashMap;

    .line 98
    .line 99
    invoke-direct {v6}, Ljava/util/IdentityHashMap;-><init>()V

    .line 100
    .line 101
    .line 102
    invoke-static {v6}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    move-object v7, v5

    .line 107
    :goto_1
    const-string v8, "\u7f51\u7edc\u53d1\u5305\u5668\u4e3b\u52a8\u7f13\u5b58\u6210\u529f: "

    .line 108
    .line 109
    const/4 v9, 0x3

    .line 110
    const/4 v10, 0x0

    .line 111
    if-eqz v7, :cond_b

    .line 112
    .line 113
    :try_start_0
    const-class v11, Ljava/lang/Object;

    .line 114
    .line 115
    if-eq v7, v11, :cond_b

    .line 116
    .line 117
    invoke-static {v7}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 118
    .line 119
    .line 120
    move-result-object v11

    .line 121
    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 122
    .line 123
    .line 124
    move-result-object v11

    .line 125
    :catchall_1
    :cond_7
    :goto_2
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 126
    .line 127
    .line 128
    move-result v12

    .line 129
    if-eqz v12, :cond_a

    .line 130
    .line 131
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v12

    .line 135
    check-cast v12, Ljava/lang/reflect/Field;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 136
    .line 137
    :try_start_1
    invoke-static {v12}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Field;)Z

    .line 138
    .line 139
    .line 140
    move-result v13

    .line 141
    if-nez v13, :cond_8

    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_8
    invoke-static {v12, v10}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v12

    .line 148
    invoke-static {v12}, Lm8/c;->k(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v13

    .line 152
    if-eqz v13, :cond_9

    .line 153
    .line 154
    goto :goto_2

    .line 155
    :cond_9
    invoke-virtual {p0, v12, v2, v9, v6}, Lm8/c;->m(Ljava/lang/Object;Ljava/lang/Class;ILjava/util/Set;)Z

    .line 156
    .line 157
    .line 158
    move-result v12

    .line 159
    if-eqz v12, :cond_7

    .line 160
    .line 161
    new-instance v12, Ljava/lang/StringBuilder;

    .line 162
    .line 163
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v13

    .line 173
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v12

    .line 180
    invoke-virtual {p0, v12}, Lm8/c;->e(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 181
    .line 182
    .line 183
    goto/16 :goto_4

    .line 184
    .line 185
    :cond_a
    :try_start_2
    invoke-virtual {v7}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    move-result-object v7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 189
    goto :goto_1

    .line 190
    :catchall_2
    :cond_b
    :try_start_3
    invoke-static {v5}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 191
    .line 192
    .line 193
    move-result-object v7

    .line 194
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 195
    .line 196
    .line 197
    move-result-object v7

    .line 198
    :catchall_3
    :cond_c
    :goto_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 199
    .line 200
    .line 201
    move-result v11

    .line 202
    if-eqz v11, :cond_6

    .line 203
    .line 204
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v11

    .line 208
    check-cast v11, Ljava/lang/reflect/Method;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 209
    .line 210
    :try_start_4
    invoke-static {v11}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Method;)Z

    .line 211
    .line 212
    .line 213
    move-result v12

    .line 214
    if-nez v12, :cond_d

    .line 215
    .line 216
    goto :goto_3

    .line 217
    :cond_d
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    move-result-object v12

    .line 221
    array-length v12, v12

    .line 222
    if-eqz v12, :cond_e

    .line 223
    .line 224
    goto :goto_3

    .line 225
    :cond_e
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 226
    .line 227
    .line 228
    move-result-object v12

    .line 229
    if-eqz v12, :cond_c

    .line 230
    .line 231
    sget-object v13, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 232
    .line 233
    if-eq v12, v13, :cond_c

    .line 234
    .line 235
    invoke-virtual {v12}, Ljava/lang/Class;->isPrimitive()Z

    .line 236
    .line 237
    .line 238
    move-result v13

    .line 239
    if-nez v13, :cond_c

    .line 240
    .line 241
    const-class v13, Ljava/lang/String;

    .line 242
    .line 243
    if-ne v12, v13, :cond_f

    .line 244
    .line 245
    goto :goto_3

    .line 246
    :cond_f
    new-array v12, v0, [Ljava/lang/Object;

    .line 247
    .line 248
    invoke-static {v11, v10, v12}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v12

    .line 252
    invoke-static {v12}, Lm8/c;->k(Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    move-result v13

    .line 256
    if-eqz v13, :cond_10

    .line 257
    .line 258
    goto :goto_3

    .line 259
    :cond_10
    invoke-virtual {p0, v12, v2, v9, v6}, Lm8/c;->m(Ljava/lang/Object;Ljava/lang/Class;ILjava/util/Set;)Z

    .line 260
    .line 261
    .line 262
    move-result v12

    .line 263
    if-eqz v12, :cond_c

    .line 264
    .line 265
    new-instance v12, Ljava/lang/StringBuilder;

    .line 266
    .line 267
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v13

    .line 277
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 278
    .line 279
    .line 280
    const-string v13, "#"

    .line 281
    .line 282
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 283
    .line 284
    .line 285
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v11

    .line 289
    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 290
    .line 291
    .line 292
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v11

    .line 296
    invoke-virtual {p0, v11}, Lm8/c;->e(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 297
    .line 298
    .line 299
    :cond_11
    :goto_4
    iget-object v2, p0, Lm8/c;->c:Ljava/lang/Object;

    .line 300
    .line 301
    if-eqz v2, :cond_14

    .line 302
    .line 303
    iget-object v4, p0, Lm8/c;->d:Ljava/lang/Object;

    .line 304
    .line 305
    check-cast v4, Ljava/lang/reflect/Method;

    .line 306
    .line 307
    if-eqz v4, :cond_14

    .line 308
    .line 309
    const/4 v3, 0x2

    .line 310
    :try_start_5
    iget v5, p0, Lm8/c;->a:I

    .line 311
    .line 312
    if-ne v5, v3, :cond_12

    .line 313
    .line 314
    filled-new-array {p1, v1}, [Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v5

    .line 318
    invoke-static {v4, v2, v5}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v2

    .line 322
    goto :goto_5

    .line 323
    :cond_12
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v5

    .line 327
    invoke-static {v4, v2, v5}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object v2

    .line 331
    :goto_5
    invoke-static {v2}, Lm8/c;->h(Ljava/lang/Object;)Z

    .line 332
    .line 333
    .line 334
    move-result p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 335
    return p1

    .line 336
    :catchall_4
    :try_start_6
    iget v2, p0, Lm8/c;->a:I
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 337
    .line 338
    iget-object v4, p0, Lm8/c;->c:Ljava/lang/Object;

    .line 339
    .line 340
    iget-object v5, p0, Lm8/c;->d:Ljava/lang/Object;

    .line 341
    .line 342
    check-cast v5, Ljava/lang/reflect/Method;

    .line 343
    .line 344
    if-ne v2, v3, :cond_13

    .line 345
    .line 346
    :try_start_7
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v2

    .line 350
    filled-new-array {p1, v1}, [Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object p1

    .line 354
    invoke-static {v4, v2, p1}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object p1

    .line 358
    invoke-static {p1}, Lm8/c;->h(Ljava/lang/Object;)Z

    .line 359
    .line 360
    .line 361
    move-result p1

    .line 362
    return p1

    .line 363
    :catchall_5
    move-exception p1

    .line 364
    goto :goto_6

    .line 365
    :cond_13
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object v1

    .line 369
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object p1

    .line 373
    invoke-static {v4, v1, p1}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    move-result-object p1

    .line 377
    invoke-static {p1}, Lm8/c;->h(Ljava/lang/Object;)Z

    .line 378
    .line 379
    .line 380
    move-result p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 381
    return p1

    .line 382
    :goto_6
    new-instance v1, Ljava/lang/StringBuilder;

    .line 383
    .line 384
    const-string v2, "sendNetworkRequest \u5f02\u5e38: "

    .line 385
    .line 386
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 387
    .line 388
    .line 389
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 390
    .line 391
    .line 392
    move-result-object p1

    .line 393
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 394
    .line 395
    .line 396
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 397
    .line 398
    .line 399
    move-result-object p1

    .line 400
    invoke-virtual {p0, p1}, Lm8/c;->e(Ljava/lang/String;)V

    .line 401
    .line 402
    .line 403
    goto :goto_9

    .line 404
    :cond_14
    new-instance p1, Ljava/lang/StringBuilder;

    .line 405
    .line 406
    const-string v1, "sendNetworkRequest \u5931\u8d25: dispatcher="

    .line 407
    .line 408
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 409
    .line 410
    .line 411
    iget-object v1, p0, Lm8/c;->c:Ljava/lang/Object;

    .line 412
    .line 413
    if-eqz v1, :cond_15

    .line 414
    .line 415
    move v1, v3

    .line 416
    goto :goto_7

    .line 417
    :cond_15
    move v1, v0

    .line 418
    :goto_7
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 419
    .line 420
    .line 421
    const-string v1, " method="

    .line 422
    .line 423
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 424
    .line 425
    .line 426
    iget-object v1, p0, Lm8/c;->d:Ljava/lang/Object;

    .line 427
    .line 428
    check-cast v1, Ljava/lang/reflect/Method;

    .line 429
    .line 430
    if-eqz v1, :cond_16

    .line 431
    .line 432
    goto :goto_8

    .line 433
    :cond_16
    move v3, v0

    .line 434
    :goto_8
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 435
    .line 436
    .line 437
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 438
    .line 439
    .line 440
    move-result-object p1

    .line 441
    invoke-virtual {p0, p1}, Lm8/c;->e(Ljava/lang/String;)V

    .line 442
    .line 443
    .line 444
    :goto_9
    return v0
.end method

.method public l(Ljava/lang/Object;Ljava/lang/Class;)Z
    .locals 10

    .line 1
    const-string v0, "\u7f51\u7edc\u53d1\u5305\u5668\u65b9\u6cd5\u5339\u914d"

    .line 2
    .line 3
    if-eqz p1, :cond_9

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    invoke-static {v3}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    move-object v4, v2

    .line 20
    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    if-eqz v5, :cond_2

    .line 25
    .line 26
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    check-cast v5, Ljava/lang/reflect/Method;

    .line 31
    .line 32
    invoke-static {p2, v5}, Lm8/c;->d(Ljava/lang/Class;Ljava/lang/reflect/Method;)Z

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    if-eqz v6, :cond_0

    .line 37
    .line 38
    if-eqz v4, :cond_1

    .line 39
    .line 40
    invoke-static {v5}, Lm8/c;->f(Ljava/lang/reflect/Method;)I

    .line 41
    .line 42
    .line 43
    move-result v6

    .line 44
    invoke-static {v4}, Lm8/c;->f(Ljava/lang/reflect/Method;)I

    .line 45
    .line 46
    .line 47
    move-result v7

    .line 48
    if-le v6, v7, :cond_0

    .line 49
    .line 50
    :cond_1
    move-object v4, v5

    .line 51
    goto :goto_0

    .line 52
    :cond_2
    if-eqz v4, :cond_3

    .line 53
    .line 54
    invoke-virtual {p0, p1, v0, v4}, Lm8/c;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/reflect/Method;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    .line 56
    .line 57
    return v1

    .line 58
    :catchall_0
    :cond_3
    :try_start_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    invoke-static {v3}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    :catchall_1
    :cond_4
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    if-eqz v4, :cond_9

    .line 75
    .line 76
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    check-cast v4, Ljava/lang/reflect/Field;

    .line 81
    .line 82
    invoke-static {v4, p1}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 86
    if-eqz v4, :cond_4

    .line 87
    .line 88
    if-ne v4, p1, :cond_5

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_5
    :try_start_2
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    invoke-static {v5}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    move-object v6, v2

    .line 104
    :cond_6
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 105
    .line 106
    .line 107
    move-result v7

    .line 108
    if-eqz v7, :cond_8

    .line 109
    .line 110
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v7

    .line 114
    check-cast v7, Ljava/lang/reflect/Method;

    .line 115
    .line 116
    invoke-static {p2, v7}, Lm8/c;->d(Ljava/lang/Class;Ljava/lang/reflect/Method;)Z

    .line 117
    .line 118
    .line 119
    move-result v8

    .line 120
    if-eqz v8, :cond_6

    .line 121
    .line 122
    if-eqz v6, :cond_7

    .line 123
    .line 124
    invoke-static {v7}, Lm8/c;->f(Ljava/lang/reflect/Method;)I

    .line 125
    .line 126
    .line 127
    move-result v8

    .line 128
    invoke-static {v6}, Lm8/c;->f(Ljava/lang/reflect/Method;)I

    .line 129
    .line 130
    .line 131
    move-result v9

    .line 132
    if-le v8, v9, :cond_6

    .line 133
    .line 134
    :cond_7
    move-object v6, v7

    .line 135
    goto :goto_2

    .line 136
    :cond_8
    if-eqz v6, :cond_4

    .line 137
    .line 138
    invoke-virtual {p0, v4, v0, v6}, Lm8/c;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/reflect/Method;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 139
    .line 140
    .line 141
    return v1

    .line 142
    :catchall_2
    :cond_9
    const/4 p1, 0x0

    .line 143
    return p1
.end method

.method public m(Ljava/lang/Object;Ljava/lang/Class;ILjava/util/Set;)Z
    .locals 5

    .line 1
    if-eqz p1, :cond_7

    .line 2
    .line 3
    if-eqz p4, :cond_1

    .line 4
    .line 5
    :try_start_0
    invoke-interface {p4, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_3

    .line 12
    :cond_0
    invoke-interface {p4, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    .line 15
    :catchall_0
    :cond_1
    invoke-virtual {p0, p1, p2}, Lm8/c;->l(Ljava/lang/Object;Ljava/lang/Class;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v1, 0x1

    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    goto :goto_2

    .line 23
    :cond_2
    if-gtz p3, :cond_3

    .line 24
    .line 25
    goto :goto_3

    .line 26
    :cond_3
    :try_start_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    :goto_0
    if-eqz v0, :cond_7

    .line 31
    .line 32
    const-class v2, Ljava/lang/Object;

    .line 33
    .line 34
    if-eq v0, v2, :cond_7

    .line 35
    .line 36
    invoke-static {v0}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    :catchall_1
    :cond_4
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-eqz v3, :cond_6

    .line 49
    .line 50
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    check-cast v3, Ljava/lang/reflect/Field;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 55
    .line 56
    :try_start_2
    invoke-static {v3, p1}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-static {v3}, Lm8/c;->k(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    if-eqz v4, :cond_5

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_5
    add-int/lit8 v4, p3, -0x1

    .line 68
    .line 69
    invoke-virtual {p0, v3, p2, v4, p4}, Lm8/c;->m(Ljava/lang/Object;Ljava/lang/Class;ILjava/util/Set;)Z

    .line 70
    .line 71
    .line 72
    move-result v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 73
    if-eqz v3, :cond_4

    .line 74
    .line 75
    :goto_2
    return v1

    .line 76
    :cond_6
    :try_start_3
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 80
    goto :goto_0

    .line 81
    :catchall_2
    :cond_7
    :goto_3
    const/4 p1, 0x0

    .line 82
    return p1
.end method

.method public n()V
    .locals 12

    .line 1
    iget-object v0, p0, Lm8/c;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [Ljava/math/BigInteger;

    .line 4
    .line 5
    iget-object v1, p0, Lm8/c;->f:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, [Ljava/math/BigInteger;

    .line 8
    .line 9
    const/4 v2, 0x2

    .line 10
    aget-object v3, v1, v2

    .line 11
    .line 12
    sget-object v4, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;

    .line 13
    .line 14
    invoke-virtual {v3, v4}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    iget-object v4, p0, Lm8/c;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v4, Ljava/math/BigInteger;

    .line 21
    .line 22
    invoke-virtual {v3, v4}, Ljava/math/BigInteger;->and(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    aput-object v3, v1, v2

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    aget-object v5, v1, v3

    .line 33
    .line 34
    aget-object v6, v1, v2

    .line 35
    .line 36
    invoke-virtual {v5, v6}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    invoke-virtual {v5, v4}, Ljava/math/BigInteger;->and(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    aput-object v5, v1, v3

    .line 48
    .line 49
    const/4 v5, 0x0

    .line 50
    move v6, v5

    .line 51
    :goto_0
    const/16 v7, 0x100

    .line 52
    .line 53
    if-lt v6, v7, :cond_0

    .line 54
    .line 55
    return-void

    .line 56
    :cond_0
    rem-int/lit8 v8, v6, 0x4

    .line 57
    .line 58
    const/4 v9, 0x3

    .line 59
    if-eqz v8, :cond_4

    .line 60
    .line 61
    if-eq v8, v3, :cond_3

    .line 62
    .line 63
    if-eq v8, v2, :cond_2

    .line 64
    .line 65
    if-eq v8, v9, :cond_1

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_1
    aget-object v8, v1, v5

    .line 69
    .line 70
    const/16 v10, 0x21

    .line 71
    .line 72
    invoke-virtual {v8, v10}, Ljava/math/BigInteger;->shiftRight(I)Ljava/math/BigInteger;

    .line 73
    .line 74
    .line 75
    move-result-object v10

    .line 76
    invoke-virtual {v8, v10}, Ljava/math/BigInteger;->xor(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 77
    .line 78
    .line 79
    move-result-object v8

    .line 80
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    aput-object v8, v1, v5

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_2
    aget-object v8, v1, v5

    .line 87
    .line 88
    const/16 v10, 0xc

    .line 89
    .line 90
    invoke-virtual {v8, v10}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    .line 91
    .line 92
    .line 93
    move-result-object v10

    .line 94
    invoke-virtual {v8, v10}, Ljava/math/BigInteger;->xor(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 95
    .line 96
    .line 97
    move-result-object v8

    .line 98
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    aput-object v8, v1, v5

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_3
    aget-object v8, v1, v5

    .line 105
    .line 106
    const/4 v10, 0x5

    .line 107
    invoke-virtual {v8, v10}, Ljava/math/BigInteger;->shiftRight(I)Ljava/math/BigInteger;

    .line 108
    .line 109
    .line 110
    move-result-object v10

    .line 111
    invoke-virtual {v8, v10}, Ljava/math/BigInteger;->xor(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 112
    .line 113
    .line 114
    move-result-object v8

    .line 115
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    aput-object v8, v1, v5

    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_4
    aget-object v8, v1, v5

    .line 122
    .line 123
    const/16 v10, 0x15

    .line 124
    .line 125
    invoke-virtual {v8, v10}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    .line 126
    .line 127
    .line 128
    move-result-object v10

    .line 129
    invoke-virtual {v8, v10}, Ljava/math/BigInteger;->xor(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 130
    .line 131
    .line 132
    move-result-object v8

    .line 133
    invoke-virtual {v8}, Ljava/math/BigInteger;->not()Ljava/math/BigInteger;

    .line 134
    .line 135
    .line 136
    move-result-object v8

    .line 137
    invoke-virtual {v8, v4}, Ljava/math/BigInteger;->and(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 138
    .line 139
    .line 140
    move-result-object v8

    .line 141
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    aput-object v8, v1, v5

    .line 145
    .line 146
    :goto_1
    aget-object v8, v1, v5

    .line 147
    .line 148
    add-int/lit16 v10, v6, 0x80

    .line 149
    .line 150
    rem-int/2addr v10, v7

    .line 151
    aget-object v7, v0, v10

    .line 152
    .line 153
    invoke-virtual {v8, v7}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 154
    .line 155
    .line 156
    move-result-object v7

    .line 157
    invoke-virtual {v7, v4}, Ljava/math/BigInteger;->and(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 158
    .line 159
    .line 160
    move-result-object v7

    .line 161
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    aput-object v7, v1, v5

    .line 165
    .line 166
    aget-object v7, v0, v6

    .line 167
    .line 168
    invoke-virtual {v7, v9}, Ljava/math/BigInteger;->shiftRight(I)Ljava/math/BigInteger;

    .line 169
    .line 170
    .line 171
    move-result-object v8

    .line 172
    const-wide/16 v9, 0x100

    .line 173
    .line 174
    invoke-static {v9, v10}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 175
    .line 176
    .line 177
    move-result-object v11

    .line 178
    invoke-virtual {v8, v11}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 179
    .line 180
    .line 181
    move-result-object v8

    .line 182
    invoke-virtual {v8}, Ljava/math/BigInteger;->intValue()I

    .line 183
    .line 184
    .line 185
    move-result v8

    .line 186
    aget-object v8, v0, v8

    .line 187
    .line 188
    aget-object v11, v1, v5

    .line 189
    .line 190
    invoke-virtual {v8, v11}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 191
    .line 192
    .line 193
    move-result-object v8

    .line 194
    aget-object v11, v1, v3

    .line 195
    .line 196
    invoke-virtual {v8, v11}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 197
    .line 198
    .line 199
    move-result-object v8

    .line 200
    invoke-virtual {v8, v4}, Ljava/math/BigInteger;->and(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 201
    .line 202
    .line 203
    move-result-object v8

    .line 204
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    aput-object v8, v0, v6

    .line 208
    .line 209
    const/16 v11, 0xb

    .line 210
    .line 211
    invoke-virtual {v8, v11}, Ljava/math/BigInteger;->shiftRight(I)Ljava/math/BigInteger;

    .line 212
    .line 213
    .line 214
    move-result-object v8

    .line 215
    invoke-static {v9, v10}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 216
    .line 217
    .line 218
    move-result-object v9

    .line 219
    invoke-virtual {v8, v9}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 220
    .line 221
    .line 222
    move-result-object v8

    .line 223
    invoke-virtual {v8}, Ljava/math/BigInteger;->intValue()I

    .line 224
    .line 225
    .line 226
    move-result v8

    .line 227
    aget-object v8, v0, v8

    .line 228
    .line 229
    invoke-virtual {v8, v7}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 230
    .line 231
    .line 232
    move-result-object v7

    .line 233
    invoke-virtual {v7, v4}, Ljava/math/BigInteger;->and(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 234
    .line 235
    .line 236
    move-result-object v7

    .line 237
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 238
    .line 239
    .line 240
    aput-object v7, v1, v3

    .line 241
    .line 242
    iget-object v7, p0, Lm8/c;->d:Ljava/lang/Object;

    .line 243
    .line 244
    check-cast v7, [Ljava/math/BigInteger;

    .line 245
    .line 246
    aget-object v8, v1, v3

    .line 247
    .line 248
    aput-object v8, v7, v6

    .line 249
    .line 250
    add-int/lit8 v6, v6, 0x1

    .line 251
    .line 252
    goto/16 :goto_0
.end method
