.class public Laf/e;
.super Ljava/lang/Exception;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# direct methods
.method public constructor <init>(Ljava/lang/String;Lqh/a;)V
    .locals 13

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, " "

    .line 7
    .line 8
    invoke-virtual {p1, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    const-string v1, ""

    .line 17
    .line 18
    if-nez p2, :cond_0

    .line 19
    .line 20
    move-object v2, v1

    .line 21
    goto/16 :goto_6

    .line 22
    .line 23
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    const-string v3, "(position:"

    .line 26
    .line 27
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    move-object v3, p2

    .line 31
    check-cast v3, Lc8/b;

    .line 32
    .line 33
    new-instance v4, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    const-string v5, "["

    .line 36
    .line 37
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v3}, Lc8/b;->e()I

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v5, ":"

    .line 48
    .line 49
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    iget v6, v3, Lc8/b;->t:I

    .line 53
    .line 54
    move v7, p1

    .line 55
    :goto_0
    iget v8, v3, Lc8/b;->q:I

    .line 56
    .line 57
    if-ge v7, v8, :cond_2

    .line 58
    .line 59
    iget-object v8, v3, Lc8/b;->p:[C

    .line 60
    .line 61
    aget-char v8, v8, v7

    .line 62
    .line 63
    const/16 v9, 0xa

    .line 64
    .line 65
    if-ne v8, v9, :cond_1

    .line 66
    .line 67
    move v6, p1

    .line 68
    goto :goto_1

    .line 69
    :cond_1
    add-int/lit8 v6, v6, 0x1

    .line 70
    .line 71
    :goto_1
    add-int/lit8 v7, v7, 0x1

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_2
    add-int/lit8 v6, v6, 0x1

    .line 75
    .line 76
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    const-string v6, "]\n"

    .line 80
    .line 81
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    iget v6, v3, Lc8/b;->u:I

    .line 85
    .line 86
    const/16 v7, 0xb

    .line 87
    .line 88
    if-ge v6, v7, :cond_3

    .line 89
    .line 90
    sget-object v7, Lqh/a;->d:[Ljava/lang/String;

    .line 91
    .line 92
    aget-object v6, v7, v6

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_3
    const-string v6, "unknown"

    .line 96
    .line 97
    :goto_2
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    const/16 v6, 0x20

    .line 101
    .line 102
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    iget v7, v3, Lc8/b;->u:I

    .line 106
    .line 107
    const/4 v8, 0x2

    .line 108
    const/4 v9, 0x4

    .line 109
    const/4 v10, 0x3

    .line 110
    if-eq v7, v8, :cond_9

    .line 111
    .line 112
    if-ne v7, v10, :cond_4

    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_4
    const/4 v5, 0x7

    .line 116
    const-string v6, "(whitespace)"

    .line 117
    .line 118
    if-ne v7, v5, :cond_5

    .line 119
    .line 120
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    goto/16 :goto_5

    .line 124
    .line 125
    :cond_5
    if-eq v7, v9, :cond_6

    .line 126
    .line 127
    invoke-virtual {v3}, Lc8/b;->h()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    goto/16 :goto_5

    .line 135
    .line 136
    :cond_6
    iget-boolean v5, v3, Lc8/b;->v:Z

    .line 137
    .line 138
    if-eqz v5, :cond_7

    .line 139
    .line 140
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    goto/16 :goto_5

    .line 144
    .line 145
    :cond_7
    invoke-virtual {v3}, Lc8/b;->h()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 150
    .line 151
    .line 152
    move-result v5

    .line 153
    const/16 v6, 0x10

    .line 154
    .line 155
    if-le v5, v6, :cond_8

    .line 156
    .line 157
    invoke-virtual {v3, p1, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    const-string v5, "..."

    .line 162
    .line 163
    invoke-virtual {v3, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    :cond_8
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    goto/16 :goto_5

    .line 171
    .line 172
    :cond_9
    :goto_3
    iget-boolean v7, v3, Lc8/b;->A:Z

    .line 173
    .line 174
    if-eqz v7, :cond_a

    .line 175
    .line 176
    const-string v7, "(empty) "

    .line 177
    .line 178
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    :cond_a
    const/16 v7, 0x3c

    .line 182
    .line 183
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    iget v7, v3, Lc8/b;->u:I

    .line 187
    .line 188
    if-ne v7, v10, :cond_b

    .line 189
    .line 190
    const/16 v7, 0x2f

    .line 191
    .line 192
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    :cond_b
    iget-object v7, v3, Lc8/b;->x:Ljava/lang/String;

    .line 196
    .line 197
    const-string v8, "}"

    .line 198
    .line 199
    const-string v10, "{"

    .line 200
    .line 201
    if-eqz v7, :cond_c

    .line 202
    .line 203
    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    iget-object v7, v3, Lc8/b;->w:Ljava/lang/String;

    .line 207
    .line 208
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    iget-object v7, v3, Lc8/b;->x:Ljava/lang/String;

    .line 215
    .line 216
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    :cond_c
    iget-object v7, v3, Lc8/b;->y:Ljava/lang/String;

    .line 223
    .line 224
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    iget v7, v3, Lc8/b;->B:I

    .line 228
    .line 229
    mul-int/2addr v7, v9

    .line 230
    move v9, p1

    .line 231
    :goto_4
    if-ge v9, v7, :cond_e

    .line 232
    .line 233
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    iget-object v11, v3, Lc8/b;->D:[Ljava/lang/String;

    .line 237
    .line 238
    add-int/lit8 v12, v9, 0x1

    .line 239
    .line 240
    aget-object v11, v11, v12

    .line 241
    .line 242
    if-eqz v11, :cond_d

    .line 243
    .line 244
    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    iget-object v11, v3, Lc8/b;->D:[Ljava/lang/String;

    .line 248
    .line 249
    aget-object v11, v11, v9

    .line 250
    .line 251
    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    iget-object v11, v3, Lc8/b;->D:[Ljava/lang/String;

    .line 258
    .line 259
    aget-object v11, v11, v12

    .line 260
    .line 261
    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 262
    .line 263
    .line 264
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    :cond_d
    iget-object v11, v3, Lc8/b;->D:[Ljava/lang/String;

    .line 268
    .line 269
    add-int/lit8 v12, v9, 0x2

    .line 270
    .line 271
    aget-object v11, v11, v12

    .line 272
    .line 273
    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 274
    .line 275
    .line 276
    const-string v11, "=\'"

    .line 277
    .line 278
    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 279
    .line 280
    .line 281
    iget-object v11, v3, Lc8/b;->D:[Ljava/lang/String;

    .line 282
    .line 283
    add-int/lit8 v12, v9, 0x3

    .line 284
    .line 285
    aget-object v11, v11, v12

    .line 286
    .line 287
    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 288
    .line 289
    .line 290
    const-string v11, "\'"

    .line 291
    .line 292
    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 293
    .line 294
    .line 295
    add-int/lit8 v9, v9, 0x4

    .line 296
    .line 297
    goto :goto_4

    .line 298
    :cond_e
    const/16 v3, 0x3e

    .line 299
    .line 300
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 301
    .line 302
    .line 303
    :goto_5
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v3

    .line 307
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 308
    .line 309
    .line 310
    const-string v3, ") "

    .line 311
    .line 312
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 313
    .line 314
    .line 315
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v2

    .line 319
    :goto_6
    invoke-static {v0, v2, v1}, Leh/a;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    if-eqz p2, :cond_f

    .line 327
    .line 328
    check-cast p2, Lc8/b;

    .line 329
    .line 330
    invoke-virtual {p2}, Lc8/b;->e()I

    .line 331
    .line 332
    .line 333
    :goto_7
    iget v0, p2, Lc8/b;->q:I

    .line 334
    .line 335
    if-ge p1, v0, :cond_f

    .line 336
    .line 337
    iget-object v0, p2, Lc8/b;->p:[C

    .line 338
    .line 339
    aget-char v0, v0, p1

    .line 340
    .line 341
    add-int/lit8 p1, p1, 0x1

    .line 342
    .line 343
    goto :goto_7

    .line 344
    :cond_f
    return-void
.end method

.method public constructor <init>(Lud/r;Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 0

    .line 345
    invoke-static {p1, p2}, Lxe/h;->b(Lud/k;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1, p3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
