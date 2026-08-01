.class public final L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final 飘花落叶言子楪世兰哲苏:L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏哲兰;

.field public 飘花落叶言子楪世兰苏哲:I

.field public 飘花落叶言子楪世哲兰苏:[L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;

.field public 飘花落叶言子楪世哲苏兰:I

.field public 飘花落叶言子楪世苏兰哲:Ljava/lang/String;

.field public 飘花落叶言子楪世苏哲兰:I

.field public 飘花落叶言子楪苏世兰哲:[L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;

.field public 飘花落叶言子楪苏世哲兰:I


# direct methods
.method public constructor <init>(L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏兰哲;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 p1, 0x100

    .line 5
    .line 6
    new-array p1, p1, [L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;

    .line 7
    .line 8
    iput-object p1, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏:[L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;

    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    iput p1, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰苏哲:I

    .line 12
    .line 13
    new-instance p1, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏哲兰;

    .line 14
    .line 15
    invoke-direct {p1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏哲兰;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏:L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏哲兰;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰哲苏(ILjava/lang/String;)L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;
    .locals 4

    .line 1
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/2addr v0, p1

    .line 6
    const v1, 0x7fffffff

    .line 7
    .line 8
    .line 9
    and-int/2addr v0, v1

    .line 10
    invoke-virtual {p0, v0}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲世兰(I)L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :goto_0
    if-eqz v1, :cond_1

    .line 15
    .line 16
    iget v2, v1, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:I

    .line 17
    .line 18
    if-ne v2, p1, :cond_0

    .line 19
    .line 20
    iget v2, v1, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲:I

    .line 21
    .line 22
    if-ne v2, v0, :cond_0

    .line 23
    .line 24
    iget-object v2, v1, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v2, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    return-object v1

    .line 33
    :cond_0
    iget-object v1, v1, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v1, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    iget-object v1, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏:L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏哲兰;

    .line 39
    .line 40
    invoke-virtual {p0, p2}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    invoke-virtual {v1, p1, v2}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(II)V

    .line 45
    .line 46
    .line 47
    new-instance v1, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;

    .line 48
    .line 49
    iget v2, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰苏哲:I

    .line 50
    .line 51
    add-int/lit8 v3, v2, 0x1

    .line 52
    .line 53
    iput v3, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰苏哲:I

    .line 54
    .line 55
    invoke-direct {v1, v2, p1, p2, v0}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;-><init>(IILjava/lang/String;I)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;)V

    .line 59
    .line 60
    .line 61
    return-object v1
.end method

.method public final 飘花落叶言子楪世兰苏哲(Ljava/lang/String;)I
    .locals 13

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    add-int/2addr v0, v1

    .line 7
    const v2, 0x7fffffff

    .line 8
    .line 9
    .line 10
    and-int/2addr v0, v2

    .line 11
    invoke-virtual {p0, v0}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲世兰(I)L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    :goto_0
    if-eqz v2, :cond_1

    .line 16
    .line 17
    iget v3, v2, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:I

    .line 18
    .line 19
    if-ne v3, v1, :cond_0

    .line 20
    .line 21
    iget v3, v2, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲:I

    .line 22
    .line 23
    if-ne v3, v0, :cond_0

    .line 24
    .line 25
    iget-object v3, v2, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    iget p0, v2, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:I

    .line 34
    .line 35
    return p0

    .line 36
    :cond_0
    iget-object v2, v2, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v2, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    iget-object v2, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏:L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏哲兰;

    .line 42
    .line 43
    invoke-virtual {v2, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲(I)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    const/4 v4, 0x0

    .line 51
    const v5, 0xffff

    .line 52
    .line 53
    .line 54
    if-gt v3, v5, :cond_e

    .line 55
    .line 56
    iget v6, v2, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:I

    .line 57
    .line 58
    add-int/lit8 v7, v6, 0x2

    .line 59
    .line 60
    add-int v8, v7, v3

    .line 61
    .line 62
    iget-object v9, v2, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:[B

    .line 63
    .line 64
    array-length v9, v9

    .line 65
    if-le v8, v9, :cond_2

    .line 66
    .line 67
    add-int/lit8 v8, v3, 0x2

    .line 68
    .line 69
    invoke-virtual {v2, v8}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(I)V

    .line 70
    .line 71
    .line 72
    :cond_2
    iget-object v8, v2, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:[B

    .line 73
    .line 74
    add-int/lit8 v9, v6, 0x1

    .line 75
    .line 76
    ushr-int/lit8 v10, v3, 0x8

    .line 77
    .line 78
    int-to-byte v10, v10

    .line 79
    aput-byte v10, v8, v6

    .line 80
    .line 81
    int-to-byte v6, v3

    .line 82
    aput-byte v6, v8, v9

    .line 83
    .line 84
    move v6, v4

    .line 85
    :goto_1
    if-ge v6, v3, :cond_d

    .line 86
    .line 87
    invoke-virtual {p1, v6}, Ljava/lang/String;->charAt(I)C

    .line 88
    .line 89
    .line 90
    move-result v9

    .line 91
    const/16 v10, 0x7f

    .line 92
    .line 93
    if-lt v9, v1, :cond_3

    .line 94
    .line 95
    if-gt v9, v10, :cond_3

    .line 96
    .line 97
    add-int/lit8 v10, v7, 0x1

    .line 98
    .line 99
    int-to-byte v9, v9

    .line 100
    aput-byte v9, v8, v7

    .line 101
    .line 102
    add-int/lit8 v6, v6, 0x1

    .line 103
    .line 104
    move v7, v10

    .line 105
    goto :goto_1

    .line 106
    :cond_3
    iput v7, v2, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:I

    .line 107
    .line 108
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 109
    .line 110
    .line 111
    move-result v3

    .line 112
    move v7, v6

    .line 113
    move v8, v7

    .line 114
    :goto_2
    const/16 v9, 0x7ff

    .line 115
    .line 116
    if-ge v7, v3, :cond_6

    .line 117
    .line 118
    invoke-virtual {p1, v7}, Ljava/lang/String;->charAt(I)C

    .line 119
    .line 120
    .line 121
    move-result v11

    .line 122
    if-lt v11, v1, :cond_4

    .line 123
    .line 124
    if-gt v11, v10, :cond_4

    .line 125
    .line 126
    add-int/lit8 v8, v8, 0x1

    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_4
    if-gt v11, v9, :cond_5

    .line 130
    .line 131
    add-int/lit8 v8, v8, 0x2

    .line 132
    .line 133
    goto :goto_3

    .line 134
    :cond_5
    add-int/lit8 v8, v8, 0x3

    .line 135
    .line 136
    :goto_3
    add-int/lit8 v7, v7, 0x1

    .line 137
    .line 138
    goto :goto_2

    .line 139
    :cond_6
    if-gt v8, v5, :cond_c

    .line 140
    .line 141
    iget v4, v2, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:I

    .line 142
    .line 143
    sub-int v5, v4, v6

    .line 144
    .line 145
    add-int/lit8 v7, v5, -0x2

    .line 146
    .line 147
    if-ltz v7, :cond_7

    .line 148
    .line 149
    iget-object v11, v2, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:[B

    .line 150
    .line 151
    ushr-int/lit8 v12, v8, 0x8

    .line 152
    .line 153
    int-to-byte v12, v12

    .line 154
    aput-byte v12, v11, v7

    .line 155
    .line 156
    sub-int/2addr v5, v1

    .line 157
    int-to-byte v7, v8

    .line 158
    aput-byte v7, v11, v5

    .line 159
    .line 160
    :cond_7
    add-int/2addr v4, v8

    .line 161
    sub-int/2addr v4, v6

    .line 162
    iget-object v5, v2, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:[B

    .line 163
    .line 164
    array-length v5, v5

    .line 165
    if-le v4, v5, :cond_8

    .line 166
    .line 167
    sub-int/2addr v8, v6

    .line 168
    invoke-virtual {v2, v8}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(I)V

    .line 169
    .line 170
    .line 171
    :cond_8
    iget v4, v2, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:I

    .line 172
    .line 173
    :goto_4
    if-ge v6, v3, :cond_b

    .line 174
    .line 175
    invoke-virtual {p1, v6}, Ljava/lang/String;->charAt(I)C

    .line 176
    .line 177
    .line 178
    move-result v5

    .line 179
    if-lt v5, v1, :cond_9

    .line 180
    .line 181
    if-gt v5, v10, :cond_9

    .line 182
    .line 183
    iget-object v7, v2, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:[B

    .line 184
    .line 185
    add-int/lit8 v8, v4, 0x1

    .line 186
    .line 187
    int-to-byte v5, v5

    .line 188
    aput-byte v5, v7, v4

    .line 189
    .line 190
    move v4, v8

    .line 191
    goto :goto_5

    .line 192
    :cond_9
    iget-object v7, v2, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:[B

    .line 193
    .line 194
    if-gt v5, v9, :cond_a

    .line 195
    .line 196
    add-int/lit8 v8, v4, 0x1

    .line 197
    .line 198
    shr-int/lit8 v11, v5, 0x6

    .line 199
    .line 200
    and-int/lit8 v11, v11, 0x1f

    .line 201
    .line 202
    or-int/lit16 v11, v11, 0xc0

    .line 203
    .line 204
    int-to-byte v11, v11

    .line 205
    aput-byte v11, v7, v4

    .line 206
    .line 207
    add-int/lit8 v4, v4, 0x2

    .line 208
    .line 209
    and-int/lit8 v5, v5, 0x3f

    .line 210
    .line 211
    or-int/lit16 v5, v5, 0x80

    .line 212
    .line 213
    int-to-byte v5, v5

    .line 214
    aput-byte v5, v7, v8

    .line 215
    .line 216
    goto :goto_5

    .line 217
    :cond_a
    add-int/lit8 v8, v4, 0x1

    .line 218
    .line 219
    shr-int/lit8 v11, v5, 0xc

    .line 220
    .line 221
    and-int/lit8 v11, v11, 0xf

    .line 222
    .line 223
    or-int/lit16 v11, v11, 0xe0

    .line 224
    .line 225
    int-to-byte v11, v11

    .line 226
    aput-byte v11, v7, v4

    .line 227
    .line 228
    add-int/lit8 v11, v4, 0x2

    .line 229
    .line 230
    shr-int/lit8 v12, v5, 0x6

    .line 231
    .line 232
    and-int/lit8 v12, v12, 0x3f

    .line 233
    .line 234
    or-int/lit16 v12, v12, 0x80

    .line 235
    .line 236
    int-to-byte v12, v12

    .line 237
    aput-byte v12, v7, v8

    .line 238
    .line 239
    add-int/lit8 v4, v4, 0x3

    .line 240
    .line 241
    and-int/lit8 v5, v5, 0x3f

    .line 242
    .line 243
    or-int/lit16 v5, v5, 0x80

    .line 244
    .line 245
    int-to-byte v5, v5

    .line 246
    aput-byte v5, v7, v11

    .line 247
    .line 248
    :goto_5
    add-int/lit8 v6, v6, 0x1

    .line 249
    .line 250
    goto :goto_4

    .line 251
    :cond_b
    iput v4, v2, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:I

    .line 252
    .line 253
    goto :goto_6

    .line 254
    :cond_c
    invoke-static {}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰()V

    .line 255
    .line 256
    .line 257
    return v4

    .line 258
    :cond_d
    iput v7, v2, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:I

    .line 259
    .line 260
    :goto_6
    new-instance v2, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;

    .line 261
    .line 262
    iget v3, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰苏哲:I

    .line 263
    .line 264
    add-int/lit8 v4, v3, 0x1

    .line 265
    .line 266
    iput v4, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰苏哲:I

    .line 267
    .line 268
    invoke-direct {v2, v3, v1, p1, v0}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;-><init>(IILjava/lang/String;I)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {p0, v2}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;)V

    .line 272
    .line 273
    .line 274
    return v3

    .line 275
    :cond_e
    invoke-static {}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰()V

    .line 276
    .line 277
    .line 278
    return v4
.end method

.method public final 飘花落叶言子楪世哲兰苏(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;
    .locals 11

    .line 1
    move-object v5, p4

    .line 2
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    invoke-virtual {p3}, Ljava/lang/String;->hashCode()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    mul-int/2addr v1, v0

    .line 11
    invoke-virtual {p4}, Ljava/lang/String;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    mul-int/2addr v0, v1

    .line 16
    add-int/2addr v0, p1

    .line 17
    const v1, 0x7fffffff

    .line 18
    .line 19
    .line 20
    and-int v8, v0, v1

    .line 21
    .line 22
    invoke-virtual {p0, v8}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲世兰(I)L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    :goto_0
    if-eqz v0, :cond_1

    .line 27
    .line 28
    iget v6, v0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:I

    .line 29
    .line 30
    if-ne v6, p1, :cond_0

    .line 31
    .line 32
    iget v6, v0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲:I

    .line 33
    .line 34
    if-ne v6, v8, :cond_0

    .line 35
    .line 36
    iget-object v6, v0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {v6, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    if-eqz v6, :cond_0

    .line 43
    .line 44
    iget-object v6, v0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏:Ljava/lang/String;

    .line 45
    .line 46
    invoke-virtual {v6, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    if-eqz v6, :cond_0

    .line 51
    .line 52
    iget-object v6, v0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲:Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {v6, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    if-eqz v6, :cond_0

    .line 59
    .line 60
    return-object v0

    .line 61
    :cond_0
    iget-object v0, v0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    const/4 v0, 0x7

    .line 67
    invoke-virtual {p0, v0, p2}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏(ILjava/lang/String;)L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    iget v0, v0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:I

    .line 72
    .line 73
    invoke-virtual {p3}, Ljava/lang/String;->hashCode()I

    .line 74
    .line 75
    .line 76
    move-result v6

    .line 77
    invoke-virtual {p4}, Ljava/lang/String;->hashCode()I

    .line 78
    .line 79
    .line 80
    move-result v7

    .line 81
    mul-int/2addr v7, v6

    .line 82
    const/16 v6, 0xc

    .line 83
    .line 84
    add-int/2addr v7, v6

    .line 85
    and-int/2addr v1, v7

    .line 86
    invoke-virtual {p0, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲世兰(I)L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;

    .line 87
    .line 88
    .line 89
    move-result-object v7

    .line 90
    :goto_1
    iget-object v9, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏:L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏哲兰;

    .line 91
    .line 92
    if-eqz v7, :cond_3

    .line 93
    .line 94
    iget v10, v7, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:I

    .line 95
    .line 96
    if-ne v10, v6, :cond_2

    .line 97
    .line 98
    iget v10, v7, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲:I

    .line 99
    .line 100
    if-ne v10, v1, :cond_2

    .line 101
    .line 102
    iget-object v10, v7, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏:Ljava/lang/String;

    .line 103
    .line 104
    invoke-virtual {v10, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v10

    .line 108
    if-eqz v10, :cond_2

    .line 109
    .line 110
    iget-object v10, v7, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲:Ljava/lang/String;

    .line 111
    .line 112
    invoke-virtual {v10, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v10

    .line 116
    if-eqz v10, :cond_2

    .line 117
    .line 118
    iget v1, v7, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:I

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_2
    iget-object v7, v7, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v7, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;

    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_3
    invoke-virtual {p0, p3}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)I

    .line 127
    .line 128
    .line 129
    move-result v7

    .line 130
    invoke-virtual {p0, p4}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)I

    .line 131
    .line 132
    .line 133
    move-result v10

    .line 134
    invoke-virtual {v9, v6, v7, v10}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏(III)V

    .line 135
    .line 136
    .line 137
    new-instance v6, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;

    .line 138
    .line 139
    iget v7, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰苏哲:I

    .line 140
    .line 141
    add-int/lit8 v10, v7, 0x1

    .line 142
    .line 143
    iput v10, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰苏哲:I

    .line 144
    .line 145
    invoke-direct {v6, v7, v1, p3, p4}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;-><init>(IILjava/lang/String;Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {p0, v6}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;)V

    .line 149
    .line 150
    .line 151
    move v1, v7

    .line 152
    :goto_2
    invoke-virtual {v9, p1, v0, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏(III)V

    .line 153
    .line 154
    .line 155
    new-instance v0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;

    .line 156
    .line 157
    iget v1, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰苏哲:I

    .line 158
    .line 159
    add-int/lit8 v6, v1, 0x1

    .line 160
    .line 161
    iput v6, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰苏哲:I

    .line 162
    .line 163
    const-wide/16 v6, 0x0

    .line 164
    .line 165
    const/4 v9, 0x0

    .line 166
    move v2, p1

    .line 167
    move-object v3, p2

    .line 168
    move-object v4, p3

    .line 169
    invoke-direct/range {v0 .. v9}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JII)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {p0, v0}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;)V

    .line 173
    .line 174
    .line 175
    return-object v0
.end method

.method public final 飘花落叶言子楪世哲苏兰(IJ)L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;
    .locals 11

    .line 1
    long-to-int v0, p2

    .line 2
    add-int v1, p1, v0

    .line 3
    .line 4
    const/16 v2, 0x20

    .line 5
    .line 6
    ushr-long v2, p2, v2

    .line 7
    .line 8
    long-to-int v2, v2

    .line 9
    add-int/2addr v1, v2

    .line 10
    const v3, 0x7fffffff

    .line 11
    .line 12
    .line 13
    and-int v9, v1, v3

    .line 14
    .line 15
    invoke-virtual {p0, v9}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲世兰(I)L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    :goto_0
    if-eqz v1, :cond_1

    .line 20
    .line 21
    iget v3, v1, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:I

    .line 22
    .line 23
    if-ne v3, p1, :cond_0

    .line 24
    .line 25
    iget v3, v1, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲:I

    .line 26
    .line 27
    if-ne v3, v9, :cond_0

    .line 28
    .line 29
    iget-wide v3, v1, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏:J

    .line 30
    .line 31
    cmp-long v3, v3, p2

    .line 32
    .line 33
    if-nez v3, :cond_0

    .line 34
    .line 35
    return-object v1

    .line 36
    :cond_0
    iget-object v1, v1, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v1, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    iget v5, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰苏哲:I

    .line 42
    .line 43
    iget-object v1, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏:L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏哲兰;

    .line 44
    .line 45
    invoke-virtual {v1, p1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲(I)V

    .line 46
    .line 47
    .line 48
    iget v3, v1, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:I

    .line 49
    .line 50
    add-int/lit8 v4, v3, 0x8

    .line 51
    .line 52
    iget-object v6, v1, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:[B

    .line 53
    .line 54
    array-length v6, v6

    .line 55
    if-le v4, v6, :cond_2

    .line 56
    .line 57
    const/16 v6, 0x8

    .line 58
    .line 59
    invoke-virtual {v1, v6}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(I)V

    .line 60
    .line 61
    .line 62
    :cond_2
    iget-object v6, v1, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:[B

    .line 63
    .line 64
    add-int/lit8 v7, v3, 0x1

    .line 65
    .line 66
    ushr-int/lit8 v8, v2, 0x18

    .line 67
    .line 68
    int-to-byte v8, v8

    .line 69
    aput-byte v8, v6, v3

    .line 70
    .line 71
    add-int/lit8 v8, v3, 0x2

    .line 72
    .line 73
    ushr-int/lit8 v10, v2, 0x10

    .line 74
    .line 75
    int-to-byte v10, v10

    .line 76
    aput-byte v10, v6, v7

    .line 77
    .line 78
    add-int/lit8 v7, v3, 0x3

    .line 79
    .line 80
    ushr-int/lit8 v10, v2, 0x8

    .line 81
    .line 82
    int-to-byte v10, v10

    .line 83
    aput-byte v10, v6, v8

    .line 84
    .line 85
    add-int/lit8 v8, v3, 0x4

    .line 86
    .line 87
    int-to-byte v2, v2

    .line 88
    aput-byte v2, v6, v7

    .line 89
    .line 90
    add-int/lit8 v2, v3, 0x5

    .line 91
    .line 92
    ushr-int/lit8 v7, v0, 0x18

    .line 93
    .line 94
    int-to-byte v7, v7

    .line 95
    aput-byte v7, v6, v8

    .line 96
    .line 97
    add-int/lit8 v7, v3, 0x6

    .line 98
    .line 99
    ushr-int/lit8 v8, v0, 0x10

    .line 100
    .line 101
    int-to-byte v8, v8

    .line 102
    aput-byte v8, v6, v2

    .line 103
    .line 104
    add-int/lit8 v3, v3, 0x7

    .line 105
    .line 106
    ushr-int/lit8 v2, v0, 0x8

    .line 107
    .line 108
    int-to-byte v2, v2

    .line 109
    aput-byte v2, v6, v7

    .line 110
    .line 111
    int-to-byte v0, v0

    .line 112
    aput-byte v0, v6, v3

    .line 113
    .line 114
    iput v4, v1, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:I

    .line 115
    .line 116
    iget v0, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰苏哲:I

    .line 117
    .line 118
    add-int/lit8 v0, v0, 0x2

    .line 119
    .line 120
    iput v0, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰苏哲:I

    .line 121
    .line 122
    new-instance v4, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;

    .line 123
    .line 124
    move v6, p1

    .line 125
    move-wide v7, p2

    .line 126
    invoke-direct/range {v4 .. v9}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;-><init>(IIJI)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p0, v4}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;)V

    .line 130
    .line 131
    .line 132
    return-object v4
.end method

.method public final 飘花落叶言子楪世苏兰哲(II)L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;
    .locals 8

    .line 1
    const v0, 0x7fffffff

    .line 2
    .line 3
    .line 4
    add-int v1, p1, p2

    .line 5
    .line 6
    and-int v7, v1, v0

    .line 7
    .line 8
    invoke-virtual {p0, v7}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲世兰(I)L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :goto_0
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget v1, v0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:I

    .line 15
    .line 16
    if-ne v1, p1, :cond_0

    .line 17
    .line 18
    iget v1, v0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲:I

    .line 19
    .line 20
    if-ne v1, v7, :cond_0

    .line 21
    .line 22
    iget-wide v1, v0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏:J

    .line 23
    .line 24
    int-to-long v3, p2

    .line 25
    cmp-long v1, v1, v3

    .line 26
    .line 27
    if-nez v1, :cond_0

    .line 28
    .line 29
    return-object v0

    .line 30
    :cond_0
    iget-object v0, v0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    iget-object v0, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏:L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏哲兰;

    .line 36
    .line 37
    invoke-virtual {v0, p1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲(I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, p2}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰(I)V

    .line 41
    .line 42
    .line 43
    new-instance v2, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;

    .line 44
    .line 45
    iget v3, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰苏哲:I

    .line 46
    .line 47
    add-int/lit8 v0, v3, 0x1

    .line 48
    .line 49
    iput v0, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰苏哲:I

    .line 50
    .line 51
    int-to-long v5, p2

    .line 52
    move v4, p1

    .line 53
    invoke-direct/range {v2 .. v7}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;-><init>(IIJI)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0, v2}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;)V

    .line 57
    .line 58
    .line 59
    return-object v2
.end method

.method public final 飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;
    .locals 3

    .line 1
    instance-of v0, p1, Ljava/lang/Integer;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p1, Ljava/lang/Integer;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    invoke-virtual {p0, v1, p1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲(II)L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :cond_0
    instance-of v0, p1, Ljava/lang/Byte;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    check-cast p1, Ljava/lang/Byte;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Byte;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    invoke-virtual {p0, v1, p1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲(II)L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0

    .line 32
    :cond_1
    instance-of v0, p1, Ljava/lang/Character;

    .line 33
    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    check-cast p1, Ljava/lang/Character;

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    invoke-virtual {p0, v1, p1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲(II)L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :cond_2
    instance-of v0, p1, Ljava/lang/Short;

    .line 48
    .line 49
    if-eqz v0, :cond_3

    .line 50
    .line 51
    check-cast p1, Ljava/lang/Short;

    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/lang/Short;->intValue()I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    invoke-virtual {p0, v1, p1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲(II)L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0

    .line 62
    :cond_3
    instance-of v0, p1, Ljava/lang/Boolean;

    .line 63
    .line 64
    if-eqz v0, :cond_4

    .line 65
    .line 66
    check-cast p1, Ljava/lang/Boolean;

    .line 67
    .line 68
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    invoke-virtual {p0, v1, p1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲(II)L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    return-object p0

    .line 77
    :cond_4
    instance-of v0, p1, Ljava/lang/Float;

    .line 78
    .line 79
    if-eqz v0, :cond_5

    .line 80
    .line 81
    check-cast p1, Ljava/lang/Float;

    .line 82
    .line 83
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    const/4 v0, 0x4

    .line 88
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    invoke-virtual {p0, v0, p1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲(II)L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    return-object p0

    .line 97
    :cond_5
    instance-of v0, p1, Ljava/lang/Long;

    .line 98
    .line 99
    if-eqz v0, :cond_6

    .line 100
    .line 101
    check-cast p1, Ljava/lang/Long;

    .line 102
    .line 103
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 104
    .line 105
    .line 106
    move-result-wide v0

    .line 107
    const/4 p1, 0x5

    .line 108
    invoke-virtual {p0, p1, v0, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰(IJ)L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    return-object p0

    .line 113
    :cond_6
    instance-of v0, p1, Ljava/lang/Double;

    .line 114
    .line 115
    if-eqz v0, :cond_7

    .line 116
    .line 117
    check-cast p1, Ljava/lang/Double;

    .line 118
    .line 119
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    .line 120
    .line 121
    .line 122
    move-result-wide v0

    .line 123
    const/4 p1, 0x6

    .line 124
    invoke-static {v0, v1}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    .line 125
    .line 126
    .line 127
    move-result-wide v0

    .line 128
    invoke-virtual {p0, p1, v0, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰(IJ)L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    return-object p0

    .line 133
    :cond_7
    instance-of v0, p1, Ljava/lang/String;

    .line 134
    .line 135
    if-eqz v0, :cond_8

    .line 136
    .line 137
    check-cast p1, Ljava/lang/String;

    .line 138
    .line 139
    const/16 v0, 0x8

    .line 140
    .line 141
    invoke-virtual {p0, v0, p1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏(ILjava/lang/String;)L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    return-object p0

    .line 146
    :cond_8
    instance-of v0, p1, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世兰哲;

    .line 147
    .line 148
    if-eqz v0, :cond_c

    .line 149
    .line 150
    check-cast p1, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世兰哲;

    .line 151
    .line 152
    iget v0, p1, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:I

    .line 153
    .line 154
    const/16 v1, 0xc

    .line 155
    .line 156
    const/16 v2, 0xa

    .line 157
    .line 158
    if-ne v0, v1, :cond_9

    .line 159
    .line 160
    move v0, v2

    .line 161
    :cond_9
    const/4 v1, 0x7

    .line 162
    if-ne v0, v2, :cond_a

    .line 163
    .line 164
    iget-object v0, p1, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 165
    .line 166
    iget v2, p1, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:I

    .line 167
    .line 168
    iget p1, p1, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲兰苏:I

    .line 169
    .line 170
    invoke-virtual {v0, v2, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    invoke-virtual {p0, v1, p1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏(ILjava/lang/String;)L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    return-object p0

    .line 179
    :cond_a
    const/16 v2, 0xb

    .line 180
    .line 181
    if-ne v0, v2, :cond_b

    .line 182
    .line 183
    invoke-virtual {p1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    const/16 v0, 0x10

    .line 188
    .line 189
    invoke-virtual {p0, v0, p1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏(ILjava/lang/String;)L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;

    .line 190
    .line 191
    .line 192
    move-result-object p0

    .line 193
    return-object p0

    .line 194
    :cond_b
    invoke-virtual {p1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    invoke-virtual {p0, v1, p1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏(ILjava/lang/String;)L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    return-object p0

    .line 203
    :cond_c
    const-string p0, "value "

    .line 204
    .line 205
    invoke-static {p1, p0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲世兰苏(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    const/4 p0, 0x0

    .line 213
    return-object p0
.end method

.method public final 飘花落叶言子楪苏世兰哲(L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;)I
    .locals 4

    .line 1
    iget-object v0, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲:[L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/16 v0, 0x10

    .line 6
    .line 7
    new-array v0, v0, [L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;

    .line 8
    .line 9
    iput-object v0, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲:[L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;

    .line 10
    .line 11
    :cond_0
    iget v0, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰:I

    .line 12
    .line 13
    iget-object v1, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲:[L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;

    .line 14
    .line 15
    array-length v2, v1

    .line 16
    if-ne v0, v2, :cond_1

    .line 17
    .line 18
    array-length v0, v1

    .line 19
    mul-int/lit8 v0, v0, 0x2

    .line 20
    .line 21
    new-array v0, v0, [L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;

    .line 22
    .line 23
    array-length v2, v1

    .line 24
    const/4 v3, 0x0

    .line 25
    invoke-static {v1, v3, v0, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲:[L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;

    .line 29
    .line 30
    :cond_1
    iget-object v0, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲:[L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;

    .line 31
    .line 32
    iget v1, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰:I

    .line 33
    .line 34
    add-int/lit8 v2, v1, 0x1

    .line 35
    .line 36
    iput v2, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰:I

    .line 37
    .line 38
    aput-object p1, v0, v1

    .line 39
    .line 40
    invoke-virtual {p0, p1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;)V

    .line 41
    .line 42
    .line 43
    iget p0, p1, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:I

    .line 44
    .line 45
    return p0
.end method

.method public final 飘花落叶言子楪苏世哲兰(Ljava/lang/String;)I
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x80

    .line 6
    .line 7
    add-int/2addr v0, v1

    .line 8
    const v2, 0x7fffffff

    .line 9
    .line 10
    .line 11
    and-int/2addr v0, v2

    .line 12
    invoke-virtual {p0, v0}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲世兰(I)L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    :goto_0
    if-eqz v2, :cond_1

    .line 17
    .line 18
    iget v3, v2, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:I

    .line 19
    .line 20
    if-ne v3, v1, :cond_0

    .line 21
    .line 22
    iget v3, v2, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲:I

    .line 23
    .line 24
    if-ne v3, v0, :cond_0

    .line 25
    .line 26
    iget-object v3, v2, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_0

    .line 33
    .line 34
    iget p0, v2, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:I

    .line 35
    .line 36
    return p0

    .line 37
    :cond_0
    iget-object v2, v2, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v2, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    new-instance v2, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;

    .line 43
    .line 44
    iget v3, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰:I

    .line 45
    .line 46
    invoke-direct {v2, v3, v1, p1, v0}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;-><init>(IILjava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, v2}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;)I

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    return p0
.end method

.method public final 飘花落叶言子楪苏哲世兰(I)L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;
    .locals 1

    .line 1
    iget-object p0, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏:[L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;

    .line 2
    .line 3
    array-length v0, p0

    .line 4
    rem-int/2addr p1, v0

    .line 5
    aget-object p0, p0, p1

    .line 6
    .line 7
    return-object p0
.end method

.method public final 飘花落叶言子楪苏哲兰世(L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;)V
    .locals 7

    .line 1
    iget v0, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰:I

    .line 2
    .line 3
    iget-object v1, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏:[L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;

    .line 4
    .line 5
    array-length v2, v1

    .line 6
    mul-int/lit8 v2, v2, 0x3

    .line 7
    .line 8
    div-int/lit8 v2, v2, 0x4

    .line 9
    .line 10
    if-le v0, v2, :cond_2

    .line 11
    .line 12
    array-length v0, v1

    .line 13
    mul-int/lit8 v1, v0, 0x2

    .line 14
    .line 15
    add-int/lit8 v1, v1, 0x1

    .line 16
    .line 17
    new-array v2, v1, [L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;

    .line 18
    .line 19
    add-int/lit8 v0, v0, -0x1

    .line 20
    .line 21
    :goto_0
    if-ltz v0, :cond_1

    .line 22
    .line 23
    iget-object v3, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏:[L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;

    .line 24
    .line 25
    aget-object v3, v3, v0

    .line 26
    .line 27
    :goto_1
    if-eqz v3, :cond_0

    .line 28
    .line 29
    iget v4, v3, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲:I

    .line 30
    .line 31
    rem-int/2addr v4, v1

    .line 32
    iget-object v5, v3, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v5, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;

    .line 35
    .line 36
    aget-object v6, v2, v4

    .line 37
    .line 38
    iput-object v6, v3, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰:Ljava/lang/Object;

    .line 39
    .line 40
    aput-object v3, v2, v4

    .line 41
    .line 42
    move-object v3, v5

    .line 43
    goto :goto_1

    .line 44
    :cond_0
    add-int/lit8 v0, v0, -0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    iput-object v2, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏:[L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;

    .line 48
    .line 49
    :cond_2
    iget v0, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰:I

    .line 50
    .line 51
    add-int/lit8 v0, v0, 0x1

    .line 52
    .line 53
    iput v0, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰:I

    .line 54
    .line 55
    iget v0, p1, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲:I

    .line 56
    .line 57
    iget-object p0, p0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏:[L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;

    .line 58
    .line 59
    array-length v1, p0

    .line 60
    rem-int/2addr v0, v1

    .line 61
    aget-object v1, p0, v0

    .line 62
    .line 63
    iput-object v1, p1, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰:Ljava/lang/Object;

    .line 64
    .line 65
    aput-object p1, p0, v0

    .line 66
    .line 67
    return-void
.end method
