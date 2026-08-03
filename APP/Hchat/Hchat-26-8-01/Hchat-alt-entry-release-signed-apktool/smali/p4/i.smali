.class public final Lp4/i;
.super Lz4/e;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final i:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lz4/e;-><init>(I)V

    .line 2
    .line 3
    .line 4
    iput p2, p0, Lp4/i;->i:I

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final o()I
    .locals 2

    .line 1
    iget-object v0, p0, Lz4/e;->h:[Ljava/lang/Object;

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    return v0

    .line 8
    :cond_0
    add-int/lit8 v0, v0, -0x1

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Lp4/h;

    .line 15
    .line 16
    invoke-virtual {v0}, Lp4/h;->e()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-virtual {v0}, Lp4/h;->b()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    add-int/2addr v0, v1

    .line 25
    return v0
.end method

.method public final p(Lz4/d;)V
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget v2, v0, Lz4/d;->c:I

    .line 6
    .line 7
    iget-object v3, v1, Lz4/e;->h:[Ljava/lang/Object;

    .line 8
    .line 9
    array-length v3, v3

    .line 10
    invoke-virtual {v0}, Lz4/d;->d()Z

    .line 11
    .line 12
    .line 13
    move-result v4

    .line 14
    if-eqz v4, :cond_8

    .line 15
    .line 16
    iget-boolean v4, v0, Lz4/d;->d:Z

    .line 17
    .line 18
    const/4 v6, 0x0

    .line 19
    :goto_0
    if-ge v6, v3, :cond_8

    .line 20
    .line 21
    invoke-virtual {v1, v6}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v7

    .line 25
    check-cast v7, Lp4/h;

    .line 26
    .line 27
    invoke-virtual {v7}, Lp4/h;->b()I

    .line 28
    .line 29
    .line 30
    move-result v8

    .line 31
    mul-int/lit8 v8, v8, 0x2

    .line 32
    .line 33
    const-string v9, ""

    .line 34
    .line 35
    const/4 v10, 0x0

    .line 36
    if-nez v8, :cond_0

    .line 37
    .line 38
    if-eqz v4, :cond_5

    .line 39
    .line 40
    :cond_0
    iget v11, v0, Lz4/d;->g:I

    .line 41
    .line 42
    mul-int/lit8 v12, v11, 0x2

    .line 43
    .line 44
    add-int/lit8 v12, v12, 0x8

    .line 45
    .line 46
    div-int/lit8 v11, v11, 0x2

    .line 47
    .line 48
    add-int/2addr v11, v12

    .line 49
    iget v12, v0, Lz4/d;->f:I

    .line 50
    .line 51
    sub-int/2addr v12, v11

    .line 52
    invoke-virtual {v7}, Lp4/h;->g()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v11

    .line 56
    if-nez v11, :cond_1

    .line 57
    .line 58
    goto/16 :goto_4

    .line 59
    .line 60
    :cond_1
    new-instance v10, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    const-string v13, "  "

    .line 63
    .line 64
    invoke-direct {v10, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v7}, Lp4/h;->f()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v7

    .line 71
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    const-string v7, ": "

    .line 75
    .line 76
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 84
    .line 85
    .line 86
    move-result v10

    .line 87
    if-nez v12, :cond_2

    .line 88
    .line 89
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 90
    .line 91
    .line 92
    move-result v12

    .line 93
    goto :goto_1

    .line 94
    :cond_2
    sub-int/2addr v12, v10

    .line 95
    :goto_1
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 96
    .line 97
    .line 98
    move-result v13

    .line 99
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 100
    .line 101
    .line 102
    move-result v14

    .line 103
    new-instance v15, Ljava/io/StringWriter;

    .line 104
    .line 105
    add-int/2addr v13, v14

    .line 106
    mul-int/lit8 v13, v13, 0x3

    .line 107
    .line 108
    invoke-direct {v15, v13}, Ljava/io/StringWriter;-><init>(I)V

    .line 109
    .line 110
    .line 111
    new-instance v13, Lm8/c;

    .line 112
    .line 113
    invoke-direct {v13, v15, v10, v12, v9}, Lm8/c;-><init>(Ljava/io/StringWriter;IILjava/lang/String;)V

    .line 114
    .line 115
    .line 116
    :try_start_0
    iget-object v10, v13, Lm8/c;->e:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v10, Lz4/f;

    .line 119
    .line 120
    invoke-virtual {v10, v7}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    iget-object v7, v13, Lm8/c;->f:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v7, Lz4/f;

    .line 126
    .line 127
    invoke-virtual {v7, v11}, Ljava/io/Writer;->write(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 128
    .line 129
    .line 130
    iget-object v7, v13, Lm8/c;->d:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v7, Ljava/lang/StringBuffer;

    .line 133
    .line 134
    iget-object v10, v13, Lm8/c;->c:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v10, Ljava/lang/StringBuffer;

    .line 137
    .line 138
    iget-object v11, v13, Lm8/c;->f:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast v11, Lz4/f;

    .line 141
    .line 142
    iget-object v12, v13, Lm8/c;->e:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast v12, Lz4/f;

    .line 145
    .line 146
    :try_start_1
    invoke-static {v10, v12}, Lm8/c;->a(Ljava/lang/StringBuffer;Ljava/io/Writer;)V

    .line 147
    .line 148
    .line 149
    invoke-static {v7, v11}, Lm8/c;->a(Ljava/lang/StringBuffer;Ljava/io/Writer;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v13}, Lm8/c;->i()V

    .line 153
    .line 154
    .line 155
    invoke-static {v10, v12}, Lm8/c;->a(Ljava/lang/StringBuffer;Ljava/io/Writer;)V

    .line 156
    .line 157
    .line 158
    :goto_2
    invoke-virtual {v10}, Ljava/lang/StringBuffer;->length()I

    .line 159
    .line 160
    .line 161
    move-result v14

    .line 162
    const/16 v5, 0xa

    .line 163
    .line 164
    if-eqz v14, :cond_3

    .line 165
    .line 166
    invoke-virtual {v11, v5}, Lz4/f;->write(I)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v13}, Lm8/c;->i()V

    .line 170
    .line 171
    .line 172
    goto :goto_2

    .line 173
    :cond_3
    invoke-static {v7, v11}, Lm8/c;->a(Ljava/lang/StringBuffer;Ljava/io/Writer;)V

    .line 174
    .line 175
    .line 176
    :goto_3
    invoke-virtual {v7}, Ljava/lang/StringBuffer;->length()I

    .line 177
    .line 178
    .line 179
    move-result v10

    .line 180
    if-eqz v10, :cond_4

    .line 181
    .line 182
    invoke-virtual {v12, v5}, Lz4/f;->write(I)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v13}, Lm8/c;->i()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 186
    .line 187
    .line 188
    goto :goto_3

    .line 189
    :cond_4
    invoke-virtual {v15}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v10

    .line 193
    :cond_5
    :goto_4
    if-eqz v10, :cond_6

    .line 194
    .line 195
    invoke-virtual {v0, v8, v10}, Lz4/d;->b(ILjava/lang/String;)V

    .line 196
    .line 197
    .line 198
    goto :goto_5

    .line 199
    :cond_6
    if-eqz v8, :cond_7

    .line 200
    .line 201
    invoke-virtual {v0, v8, v9}, Lz4/d;->b(ILjava/lang/String;)V

    .line 202
    .line 203
    .line 204
    :cond_7
    :goto_5
    add-int/lit8 v6, v6, 0x1

    .line 205
    .line 206
    goto/16 :goto_0

    .line 207
    .line 208
    :catch_0
    move-exception v0

    .line 209
    new-instance v2, Ljava/lang/RuntimeException;

    .line 210
    .line 211
    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 212
    .line 213
    .line 214
    throw v2

    .line 215
    :catch_1
    move-exception v0

    .line 216
    const-string v2, "shouldn\'t happen"

    .line 217
    .line 218
    invoke-static {v2, v0}, Lah/a;->p(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 219
    .line 220
    .line 221
    return-void

    .line 222
    :cond_8
    const/4 v5, 0x0

    .line 223
    :goto_6
    if-ge v5, v3, :cond_9

    .line 224
    .line 225
    invoke-virtual {v1, v5}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v4

    .line 229
    check-cast v4, Lp4/h;

    .line 230
    .line 231
    :try_start_2
    invoke-virtual {v4, v0}, Lp4/h;->l(Lz4/d;)V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_2

    .line 232
    .line 233
    .line 234
    add-int/lit8 v5, v5, 0x1

    .line 235
    .line 236
    goto :goto_6

    .line 237
    :catch_2
    move-exception v0

    .line 238
    new-instance v2, Ljava/lang/StringBuilder;

    .line 239
    .line 240
    const-string v3, "...while writing "

    .line 241
    .line 242
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v2

    .line 252
    invoke-static {v2, v0}, Lf4/a;->b(Ljava/lang/String;Ljava/lang/Exception;)Lf4/a;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    throw v0

    .line 257
    :cond_9
    iget v0, v0, Lz4/d;->c:I

    .line 258
    .line 259
    sub-int/2addr v0, v2

    .line 260
    div-int/lit8 v0, v0, 0x2

    .line 261
    .line 262
    invoke-virtual {v1}, Lp4/i;->o()I

    .line 263
    .line 264
    .line 265
    move-result v2

    .line 266
    if-ne v0, v2, :cond_a

    .line 267
    .line 268
    return-void

    .line 269
    :cond_a
    new-instance v2, Ljava/lang/RuntimeException;

    .line 270
    .line 271
    invoke-virtual {v1}, Lp4/i;->o()I

    .line 272
    .line 273
    .line 274
    move-result v3

    .line 275
    new-instance v4, Ljava/lang/StringBuilder;

    .line 276
    .line 277
    const-string v5, "write length mismatch; expected "

    .line 278
    .line 279
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 283
    .line 284
    .line 285
    const-string v3, " but actually wrote "

    .line 286
    .line 287
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 288
    .line 289
    .line 290
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 291
    .line 292
    .line 293
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    throw v2
.end method
