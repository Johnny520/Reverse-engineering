.class public interface abstract Lb8/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# virtual methods
.method public abstract b()I
.end method

.method public abstract e()I
.end method

.method public abstract f()I
.end method

.method public abstract getTagName()Ljava/lang/String;
.end method

.method public abstract j()Ljava/lang/String;
.end method

.method public l()Lb8/f;
    .locals 16

    .line 1
    new-instance v0, Lb8/f;

    .line 2
    .line 3
    invoke-direct {v0}, Lb8/f;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface/range {p0 .. p0}, Lb8/b;->getTagName()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Lb8/f;->t(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-interface/range {p0 .. p0}, Lb8/b;->j()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    if-eqz v1, :cond_15

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    invoke-virtual {v0}, Lb8/f;->q()V

    .line 24
    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    move v4, v3

    .line 28
    :goto_0
    add-int/lit8 v5, v2, -0x1

    .line 29
    .line 30
    move v6, v4

    .line 31
    :goto_1
    const/16 v8, 0x3d

    .line 32
    .line 33
    if-ge v6, v5, :cond_a

    .line 34
    .line 35
    invoke-virtual {v1, v6}, Ljava/lang/String;->charAt(I)C

    .line 36
    .line 37
    .line 38
    move-result v9

    .line 39
    if-ne v9, v8, :cond_b

    .line 40
    .line 41
    invoke-virtual {v1, v4, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v9

    .line 45
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 46
    .line 47
    .line 48
    move-result v10

    .line 49
    if-nez v10, :cond_0

    .line 50
    .line 51
    goto :goto_5

    .line 52
    :cond_0
    invoke-virtual {v9, v3}, Ljava/lang/String;->charAt(I)C

    .line 53
    .line 54
    .line 55
    move-result v11

    .line 56
    const/16 v12, 0x7a

    .line 57
    .line 58
    const/16 v13, 0x61

    .line 59
    .line 60
    const/16 v14, 0x5a

    .line 61
    .line 62
    const/16 v15, 0x41

    .line 63
    .line 64
    if-lt v11, v15, :cond_1

    .line 65
    .line 66
    if-le v11, v14, :cond_2

    .line 67
    .line 68
    :cond_1
    if-lt v11, v13, :cond_a

    .line 69
    .line 70
    if-gt v11, v12, :cond_a

    .line 71
    .line 72
    :cond_2
    const/4 v11, 0x1

    .line 73
    :goto_2
    if-ge v11, v10, :cond_7

    .line 74
    .line 75
    invoke-virtual {v9, v11}, Ljava/lang/String;->charAt(I)C

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    if-lt v3, v15, :cond_3

    .line 80
    .line 81
    if-le v3, v14, :cond_6

    .line 82
    .line 83
    :cond_3
    if-lt v3, v13, :cond_4

    .line 84
    .line 85
    if-le v3, v12, :cond_6

    .line 86
    .line 87
    :cond_4
    const/16 v7, 0x30

    .line 88
    .line 89
    if-lt v3, v7, :cond_5

    .line 90
    .line 91
    const/16 v7, 0x39

    .line 92
    .line 93
    if-gt v3, v7, :cond_5

    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_5
    const/16 v7, 0x5f

    .line 97
    .line 98
    if-ne v3, v7, :cond_a

    .line 99
    .line 100
    :cond_6
    :goto_3
    add-int/lit8 v11, v11, 0x1

    .line 101
    .line 102
    const/4 v3, 0x0

    .line 103
    goto :goto_2

    .line 104
    :cond_7
    iget-object v3, v0, Lb8/f;->k:Lz7/c;

    .line 105
    .line 106
    invoke-virtual {v3}, Lz7/c;->size()I

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    if-eqz v3, :cond_8

    .line 111
    .line 112
    add-int/lit8 v3, v3, -0x1

    .line 113
    .line 114
    iget-object v7, v0, Lb8/f;->k:Lz7/c;

    .line 115
    .line 116
    iget-object v7, v7, Lz7/c;->g:[Ljava/lang/Object;

    .line 117
    .line 118
    aget-object v3, v7, v3

    .line 119
    .line 120
    check-cast v3, Lb8/d;

    .line 121
    .line 122
    goto :goto_4

    .line 123
    :cond_8
    const/4 v3, 0x0

    .line 124
    :goto_4
    if-eqz v3, :cond_9

    .line 125
    .line 126
    iget-object v3, v3, Lb8/d;->h:Ljava/lang/String;

    .line 127
    .line 128
    invoke-virtual {v9, v3}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    if-gez v3, :cond_9

    .line 133
    .line 134
    goto :goto_5

    .line 135
    :cond_9
    add-int/lit8 v4, v6, 0x1

    .line 136
    .line 137
    goto :goto_6

    .line 138
    :cond_a
    :goto_5
    const/4 v9, 0x0

    .line 139
    goto :goto_6

    .line 140
    :cond_b
    add-int/lit8 v6, v6, 0x1

    .line 141
    .line 142
    const/4 v3, 0x0

    .line 143
    goto :goto_1

    .line 144
    :goto_6
    move v3, v4

    .line 145
    :goto_7
    const/16 v6, 0x3b

    .line 146
    .line 147
    if-ge v3, v5, :cond_d

    .line 148
    .line 149
    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    .line 150
    .line 151
    .line 152
    move-result v7

    .line 153
    if-ne v7, v6, :cond_c

    .line 154
    .line 155
    invoke-virtual {v1, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v4

    .line 159
    add-int/lit8 v3, v3, 0x1

    .line 160
    .line 161
    goto :goto_8

    .line 162
    :cond_c
    add-int/lit8 v3, v3, 0x1

    .line 163
    .line 164
    goto :goto_7

    .line 165
    :cond_d
    if-ge v4, v2, :cond_e

    .line 166
    .line 167
    invoke-virtual {v1, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v4

    .line 171
    move v3, v2

    .line 172
    goto :goto_8

    .line 173
    :cond_e
    move v3, v4

    .line 174
    const/4 v4, 0x0

    .line 175
    :goto_8
    if-nez v9, :cond_f

    .line 176
    .line 177
    if-nez v4, :cond_f

    .line 178
    .line 179
    goto :goto_d

    .line 180
    :cond_f
    if-eqz v9, :cond_11

    .line 181
    .line 182
    if-nez v4, :cond_10

    .line 183
    .line 184
    goto :goto_9

    .line 185
    :cond_10
    new-instance v5, Lb8/d;

    .line 186
    .line 187
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 188
    .line 189
    .line 190
    iput-object v9, v5, Lb8/d;->h:Ljava/lang/String;

    .line 191
    .line 192
    iput-object v4, v5, Lb8/d;->i:Ljava/lang/String;

    .line 193
    .line 194
    invoke-virtual {v0, v5}, Lb8/f;->p(Lb8/d;)V

    .line 195
    .line 196
    .line 197
    goto :goto_c

    .line 198
    :cond_11
    :goto_9
    iget-object v5, v0, Lb8/f;->k:Lz7/c;

    .line 199
    .line 200
    invoke-virtual {v5}, Lz7/c;->size()I

    .line 201
    .line 202
    .line 203
    move-result v5

    .line 204
    if-eqz v5, :cond_12

    .line 205
    .line 206
    add-int/lit8 v5, v5, -0x1

    .line 207
    .line 208
    iget-object v7, v0, Lb8/f;->k:Lz7/c;

    .line 209
    .line 210
    iget-object v7, v7, Lz7/c;->g:[Ljava/lang/Object;

    .line 211
    .line 212
    aget-object v5, v7, v5

    .line 213
    .line 214
    move-object v7, v5

    .line 215
    check-cast v7, Lb8/d;

    .line 216
    .line 217
    goto :goto_a

    .line 218
    :cond_12
    const/4 v7, 0x0

    .line 219
    :goto_a
    if-eqz v7, :cond_14

    .line 220
    .line 221
    new-instance v5, Ljava/lang/StringBuilder;

    .line 222
    .line 223
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v7}, Lb8/d;->n()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v10

    .line 230
    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    if-nez v9, :cond_13

    .line 237
    .line 238
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    goto :goto_b

    .line 242
    :cond_13
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    :goto_b
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v4

    .line 252
    iput-object v4, v7, Lb8/d;->i:Ljava/lang/String;

    .line 253
    .line 254
    :goto_c
    move v4, v3

    .line 255
    const/4 v3, 0x0

    .line 256
    goto/16 :goto_0

    .line 257
    .line 258
    :cond_14
    invoke-virtual {v0}, Lb8/f;->q()V

    .line 259
    .line 260
    .line 261
    new-instance v2, Lb8/d;

    .line 262
    .line 263
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 264
    .line 265
    .line 266
    const-string v3, "raw_style_tag_attribute"

    .line 267
    .line 268
    iput-object v3, v2, Lb8/d;->h:Ljava/lang/String;

    .line 269
    .line 270
    iput-object v1, v2, Lb8/d;->i:Ljava/lang/String;

    .line 271
    .line 272
    invoke-virtual {v0, v2}, Lb8/f;->p(Lb8/d;)V

    .line 273
    .line 274
    .line 275
    :cond_15
    :goto_d
    return-object v0
.end method
