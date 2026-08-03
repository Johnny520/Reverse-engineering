.class public abstract Ld1/d;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# direct methods
.method public static final A(ILb1/g;Ld1/b0;Le1/c;)Z
    .locals 10

    .line 1
    new-instance v0, Lj0/b;

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    new-array v2, v1, [Ld1/b0;

    .line 6
    .line 7
    invoke-direct {v0, v2}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object v2, p2, Ly0/n;->g:Ly0/n;

    .line 11
    .line 12
    iget-boolean v2, v2, Ly0/n;->t:Z

    .line 13
    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    const-string v2, "visitChildren called on an unattached node"

    .line 17
    .line 18
    invoke-static {v2}, Lu1/a;->b(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    new-instance v2, Lj0/b;

    .line 22
    .line 23
    new-array v3, v1, [Ly0/n;

    .line 24
    .line 25
    invoke-direct {v2, v3}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-object p2, p2, Ly0/n;->g:Ly0/n;

    .line 29
    .line 30
    iget-object v3, p2, Ly0/n;->l:Ly0/n;

    .line 31
    .line 32
    if-nez v3, :cond_1

    .line 33
    .line 34
    invoke-static {v2, p2}, Lx1/k;->b(Lj0/b;Ly0/n;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    invoke-virtual {v2, v3}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    :cond_2
    :goto_0
    iget p2, v2, Lj0/b;->i:I

    .line 42
    .line 43
    const/4 v3, 0x1

    .line 44
    const/4 v4, 0x0

    .line 45
    if-eqz p2, :cond_c

    .line 46
    .line 47
    add-int/lit8 p2, p2, -0x1

    .line 48
    .line 49
    invoke-virtual {v2, p2}, Lj0/b;->k(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    check-cast p2, Ly0/n;

    .line 54
    .line 55
    iget v5, p2, Ly0/n;->j:I

    .line 56
    .line 57
    and-int/lit16 v5, v5, 0x400

    .line 58
    .line 59
    if-nez v5, :cond_3

    .line 60
    .line 61
    invoke-static {v2, p2}, Lx1/k;->b(Lj0/b;Ly0/n;)V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_3
    :goto_1
    if-eqz p2, :cond_2

    .line 66
    .line 67
    iget v5, p2, Ly0/n;->i:I

    .line 68
    .line 69
    and-int/lit16 v5, v5, 0x400

    .line 70
    .line 71
    if-eqz v5, :cond_b

    .line 72
    .line 73
    const/4 v5, 0x0

    .line 74
    move-object v6, v5

    .line 75
    :goto_2
    if-eqz p2, :cond_2

    .line 76
    .line 77
    instance-of v7, p2, Ld1/b0;

    .line 78
    .line 79
    if-eqz v7, :cond_4

    .line 80
    .line 81
    check-cast p2, Ld1/b0;

    .line 82
    .line 83
    iget-boolean v7, p2, Ly0/n;->t:Z

    .line 84
    .line 85
    if-eqz v7, :cond_a

    .line 86
    .line 87
    invoke-virtual {v0, p2}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    goto :goto_5

    .line 91
    :cond_4
    iget v7, p2, Ly0/n;->i:I

    .line 92
    .line 93
    and-int/lit16 v7, v7, 0x400

    .line 94
    .line 95
    if-eqz v7, :cond_a

    .line 96
    .line 97
    instance-of v7, p2, Lx1/j;

    .line 98
    .line 99
    if-eqz v7, :cond_a

    .line 100
    .line 101
    move-object v7, p2

    .line 102
    check-cast v7, Lx1/j;

    .line 103
    .line 104
    iget-object v7, v7, Lx1/j;->v:Ly0/n;

    .line 105
    .line 106
    move v8, v4

    .line 107
    :goto_3
    if-eqz v7, :cond_9

    .line 108
    .line 109
    iget v9, v7, Ly0/n;->i:I

    .line 110
    .line 111
    and-int/lit16 v9, v9, 0x400

    .line 112
    .line 113
    if-eqz v9, :cond_8

    .line 114
    .line 115
    add-int/lit8 v8, v8, 0x1

    .line 116
    .line 117
    if-ne v8, v3, :cond_5

    .line 118
    .line 119
    move-object p2, v7

    .line 120
    goto :goto_4

    .line 121
    :cond_5
    if-nez v6, :cond_6

    .line 122
    .line 123
    new-instance v6, Lj0/b;

    .line 124
    .line 125
    new-array v9, v1, [Ly0/n;

    .line 126
    .line 127
    invoke-direct {v6, v9}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    :cond_6
    if-eqz p2, :cond_7

    .line 131
    .line 132
    invoke-virtual {v6, p2}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    move-object p2, v5

    .line 136
    :cond_7
    invoke-virtual {v6, v7}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    :cond_8
    :goto_4
    iget-object v7, v7, Ly0/n;->l:Ly0/n;

    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_9
    if-ne v8, v3, :cond_a

    .line 143
    .line 144
    goto :goto_2

    .line 145
    :cond_a
    :goto_5
    invoke-static {v6}, Lx1/k;->e(Lj0/b;)Ly0/n;

    .line 146
    .line 147
    .line 148
    move-result-object p2

    .line 149
    goto :goto_2

    .line 150
    :cond_b
    iget-object p2, p2, Ly0/n;->l:Ly0/n;

    .line 151
    .line 152
    goto :goto_1

    .line 153
    :cond_c
    :goto_6
    iget p2, v0, Lj0/b;->i:I

    .line 154
    .line 155
    if-eqz p2, :cond_10

    .line 156
    .line 157
    invoke-static {v0, p3, p0}, Ld1/d;->g(Lj0/b;Le1/c;I)Ld1/b0;

    .line 158
    .line 159
    .line 160
    move-result-object p2

    .line 161
    if-nez p2, :cond_d

    .line 162
    .line 163
    goto :goto_7

    .line 164
    :cond_d
    invoke-virtual {p2}, Ld1/b0;->m1()Ld1/t;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    iget-boolean v1, v1, Ld1/t;->a:Z

    .line 169
    .line 170
    if-eqz v1, :cond_e

    .line 171
    .line 172
    invoke-virtual {p1, p2}, Lb1/g;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    check-cast p0, Ljava/lang/Boolean;

    .line 177
    .line 178
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 179
    .line 180
    .line 181
    move-result p0

    .line 182
    return p0

    .line 183
    :cond_e
    invoke-static {p0, p1, p2, p3}, Ld1/d;->l(ILb1/g;Ld1/b0;Le1/c;)Z

    .line 184
    .line 185
    .line 186
    move-result v1

    .line 187
    if-eqz v1, :cond_f

    .line 188
    .line 189
    return v3

    .line 190
    :cond_f
    invoke-virtual {v0, p2}, Lj0/b;->j(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    goto :goto_6

    .line 194
    :cond_10
    :goto_7
    return v4
.end method

.method public static final B(Ld1/b0;Ld1/b0;ILb1/g;)Z
    .locals 12

    .line 1
    invoke-virtual {p0}, Ld1/b0;->p1()Ld1/z;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Ld1/z;->h:Ld1/z;

    .line 6
    .line 7
    if-ne v0, v1, :cond_24

    .line 8
    .line 9
    const/16 v0, 0x10

    .line 10
    .line 11
    new-array v1, v0, [Ld1/b0;

    .line 12
    .line 13
    iget-object v2, p0, Ly0/n;->g:Ly0/n;

    .line 14
    .line 15
    iget-boolean v2, v2, Ly0/n;->t:Z

    .line 16
    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    const-string v2, "visitChildren called on an unattached node"

    .line 20
    .line 21
    invoke-static {v2}, Lu1/a;->b(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    new-instance v2, Lj0/b;

    .line 25
    .line 26
    new-array v3, v0, [Ly0/n;

    .line 27
    .line 28
    invoke-direct {v2, v3}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object v3, p0, Ly0/n;->g:Ly0/n;

    .line 32
    .line 33
    iget-object v4, v3, Ly0/n;->l:Ly0/n;

    .line 34
    .line 35
    const/4 v5, 0x0

    .line 36
    if-nez v4, :cond_1

    .line 37
    .line 38
    invoke-static {v2, v3}, Lx1/k;->b(Lj0/b;Ly0/n;)V

    .line 39
    .line 40
    .line 41
    :goto_0
    move v3, v5

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    invoke-virtual {v2, v4}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    :goto_1
    iget v4, v2, Lj0/b;->i:I

    .line 48
    .line 49
    const/4 v6, 0x0

    .line 50
    const/4 v7, 0x1

    .line 51
    if-eqz v4, :cond_d

    .line 52
    .line 53
    add-int/lit8 v4, v4, -0x1

    .line 54
    .line 55
    invoke-virtual {v2, v4}, Lj0/b;->k(I)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    check-cast v4, Ly0/n;

    .line 60
    .line 61
    iget v8, v4, Ly0/n;->j:I

    .line 62
    .line 63
    and-int/lit16 v8, v8, 0x400

    .line 64
    .line 65
    if-nez v8, :cond_3

    .line 66
    .line 67
    invoke-static {v2, v4}, Lx1/k;->b(Lj0/b;Ly0/n;)V

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_3
    :goto_2
    if-eqz v4, :cond_2

    .line 72
    .line 73
    iget v8, v4, Ly0/n;->i:I

    .line 74
    .line 75
    and-int/lit16 v8, v8, 0x400

    .line 76
    .line 77
    if-eqz v8, :cond_c

    .line 78
    .line 79
    move-object v8, v6

    .line 80
    :goto_3
    if-eqz v4, :cond_2

    .line 81
    .line 82
    instance-of v9, v4, Ld1/b0;

    .line 83
    .line 84
    if-eqz v9, :cond_5

    .line 85
    .line 86
    check-cast v4, Ld1/b0;

    .line 87
    .line 88
    add-int/lit8 v9, v3, 0x1

    .line 89
    .line 90
    array-length v10, v1

    .line 91
    if-ge v10, v9, :cond_4

    .line 92
    .line 93
    array-length v10, v1

    .line 94
    mul-int/lit8 v11, v10, 0x2

    .line 95
    .line 96
    invoke-static {v9, v11}, Ljava/lang/Math;->max(II)I

    .line 97
    .line 98
    .line 99
    move-result v11

    .line 100
    new-array v11, v11, [Ljava/lang/Object;

    .line 101
    .line 102
    invoke-static {v1, v5, v11, v5, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 103
    .line 104
    .line 105
    move-object v1, v11

    .line 106
    :cond_4
    aput-object v4, v1, v3

    .line 107
    .line 108
    move v3, v9

    .line 109
    goto :goto_6

    .line 110
    :cond_5
    iget v9, v4, Ly0/n;->i:I

    .line 111
    .line 112
    and-int/lit16 v9, v9, 0x400

    .line 113
    .line 114
    if-eqz v9, :cond_b

    .line 115
    .line 116
    instance-of v9, v4, Lx1/j;

    .line 117
    .line 118
    if-eqz v9, :cond_b

    .line 119
    .line 120
    move-object v9, v4

    .line 121
    check-cast v9, Lx1/j;

    .line 122
    .line 123
    iget-object v9, v9, Lx1/j;->v:Ly0/n;

    .line 124
    .line 125
    move v10, v5

    .line 126
    :goto_4
    if-eqz v9, :cond_a

    .line 127
    .line 128
    iget v11, v9, Ly0/n;->i:I

    .line 129
    .line 130
    and-int/lit16 v11, v11, 0x400

    .line 131
    .line 132
    if-eqz v11, :cond_9

    .line 133
    .line 134
    add-int/lit8 v10, v10, 0x1

    .line 135
    .line 136
    if-ne v10, v7, :cond_6

    .line 137
    .line 138
    move-object v4, v9

    .line 139
    goto :goto_5

    .line 140
    :cond_6
    if-nez v8, :cond_7

    .line 141
    .line 142
    new-instance v8, Lj0/b;

    .line 143
    .line 144
    new-array v11, v0, [Ly0/n;

    .line 145
    .line 146
    invoke-direct {v8, v11}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    :cond_7
    if-eqz v4, :cond_8

    .line 150
    .line 151
    invoke-virtual {v8, v4}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    move-object v4, v6

    .line 155
    :cond_8
    invoke-virtual {v8, v9}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    :cond_9
    :goto_5
    iget-object v9, v9, Ly0/n;->l:Ly0/n;

    .line 159
    .line 160
    goto :goto_4

    .line 161
    :cond_a
    if-ne v10, v7, :cond_b

    .line 162
    .line 163
    goto :goto_3

    .line 164
    :cond_b
    :goto_6
    invoke-static {v8}, Lx1/k;->e(Lj0/b;)Ly0/n;

    .line 165
    .line 166
    .line 167
    move-result-object v4

    .line 168
    goto :goto_3

    .line 169
    :cond_c
    iget-object v4, v4, Ly0/n;->l:Ly0/n;

    .line 170
    .line 171
    goto :goto_2

    .line 172
    :cond_d
    sget-object v2, Ld1/d0;->g:Ld1/d0;

    .line 173
    .line 174
    invoke-static {v1, v5, v3, v2}, Ljava/util/Arrays;->sort([Ljava/lang/Object;IILjava/util/Comparator;)V

    .line 175
    .line 176
    .line 177
    if-ne p2, v7, :cond_10

    .line 178
    .line 179
    invoke-static {v5, v3}, Lr9/e0;->r0(II)Llg/d;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    iget v3, v2, Llg/b;->g:I

    .line 184
    .line 185
    iget v2, v2, Llg/b;->h:I

    .line 186
    .line 187
    if-gt v3, v2, :cond_13

    .line 188
    .line 189
    move v4, v5

    .line 190
    :goto_7
    if-eqz v4, :cond_e

    .line 191
    .line 192
    aget-object v8, v1, v3

    .line 193
    .line 194
    check-cast v8, Ld1/b0;

    .line 195
    .line 196
    invoke-static {v8}, Ld1/d;->r(Ld1/b0;)Z

    .line 197
    .line 198
    .line 199
    move-result v9

    .line 200
    if-eqz v9, :cond_e

    .line 201
    .line 202
    invoke-static {v8, p3}, Ld1/d;->k(Ld1/b0;Lb1/g;)Z

    .line 203
    .line 204
    .line 205
    move-result v8

    .line 206
    if-eqz v8, :cond_e

    .line 207
    .line 208
    goto :goto_9

    .line 209
    :cond_e
    aget-object v8, v1, v3

    .line 210
    .line 211
    invoke-static {v8, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v8

    .line 215
    if-eqz v8, :cond_f

    .line 216
    .line 217
    move v4, v7

    .line 218
    :cond_f
    if-eq v3, v2, :cond_13

    .line 219
    .line 220
    add-int/lit8 v3, v3, 0x1

    .line 221
    .line 222
    goto :goto_7

    .line 223
    :cond_10
    const/4 v2, 0x2

    .line 224
    if-ne p2, v2, :cond_23

    .line 225
    .line 226
    invoke-static {v5, v3}, Lr9/e0;->r0(II)Llg/d;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    iget v3, v2, Llg/b;->g:I

    .line 231
    .line 232
    iget v2, v2, Llg/b;->h:I

    .line 233
    .line 234
    if-gt v3, v2, :cond_13

    .line 235
    .line 236
    move v4, v5

    .line 237
    :goto_8
    if-eqz v4, :cond_11

    .line 238
    .line 239
    aget-object v8, v1, v2

    .line 240
    .line 241
    check-cast v8, Ld1/b0;

    .line 242
    .line 243
    invoke-static {v8}, Ld1/d;->r(Ld1/b0;)Z

    .line 244
    .line 245
    .line 246
    move-result v9

    .line 247
    if-eqz v9, :cond_11

    .line 248
    .line 249
    invoke-static {v8, p3}, Ld1/d;->a(Ld1/b0;Lb1/g;)Z

    .line 250
    .line 251
    .line 252
    move-result v8

    .line 253
    if-eqz v8, :cond_11

    .line 254
    .line 255
    :goto_9
    return v7

    .line 256
    :cond_11
    aget-object v8, v1, v2

    .line 257
    .line 258
    invoke-static {v8, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    move-result v8

    .line 262
    if-eqz v8, :cond_12

    .line 263
    .line 264
    move v4, v7

    .line 265
    :cond_12
    if-eq v2, v3, :cond_13

    .line 266
    .line 267
    add-int/lit8 v2, v2, -0x1

    .line 268
    .line 269
    goto :goto_8

    .line 270
    :cond_13
    if-ne p2, v7, :cond_14

    .line 271
    .line 272
    goto/16 :goto_10

    .line 273
    .line 274
    :cond_14
    invoke-virtual {p0}, Ld1/b0;->m1()Ld1/t;

    .line 275
    .line 276
    .line 277
    move-result-object p1

    .line 278
    iget-boolean p1, p1, Ld1/t;->a:Z

    .line 279
    .line 280
    if-eqz p1, :cond_22

    .line 281
    .line 282
    iget-object p1, p0, Ly0/n;->g:Ly0/n;

    .line 283
    .line 284
    iget-boolean p1, p1, Ly0/n;->t:Z

    .line 285
    .line 286
    if-nez p1, :cond_15

    .line 287
    .line 288
    const-string p1, "visitAncestors called on an unattached node"

    .line 289
    .line 290
    invoke-static {p1}, Lu1/a;->b(Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    :cond_15
    iget-object p1, p0, Ly0/n;->g:Ly0/n;

    .line 294
    .line 295
    iget-object p1, p1, Ly0/n;->k:Ly0/n;

    .line 296
    .line 297
    invoke-static {p0}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 298
    .line 299
    .line 300
    move-result-object p2

    .line 301
    :goto_a
    if-eqz p2, :cond_20

    .line 302
    .line 303
    iget-object v1, p2, Lx1/f0;->L:Lx1/b1;

    .line 304
    .line 305
    iget-object v1, v1, Lx1/b1;->f:Ly0/n;

    .line 306
    .line 307
    iget v1, v1, Ly0/n;->j:I

    .line 308
    .line 309
    and-int/lit16 v1, v1, 0x400

    .line 310
    .line 311
    if-eqz v1, :cond_1e

    .line 312
    .line 313
    :goto_b
    if-eqz p1, :cond_1e

    .line 314
    .line 315
    iget v1, p1, Ly0/n;->i:I

    .line 316
    .line 317
    and-int/lit16 v1, v1, 0x400

    .line 318
    .line 319
    if-eqz v1, :cond_1d

    .line 320
    .line 321
    move-object v1, p1

    .line 322
    move-object v2, v6

    .line 323
    :goto_c
    if-eqz v1, :cond_1d

    .line 324
    .line 325
    instance-of v3, v1, Ld1/b0;

    .line 326
    .line 327
    if-eqz v3, :cond_16

    .line 328
    .line 329
    move-object v6, v1

    .line 330
    goto :goto_f

    .line 331
    :cond_16
    iget v3, v1, Ly0/n;->i:I

    .line 332
    .line 333
    and-int/lit16 v3, v3, 0x400

    .line 334
    .line 335
    if-eqz v3, :cond_1c

    .line 336
    .line 337
    instance-of v3, v1, Lx1/j;

    .line 338
    .line 339
    if-eqz v3, :cond_1c

    .line 340
    .line 341
    move-object v3, v1

    .line 342
    check-cast v3, Lx1/j;

    .line 343
    .line 344
    iget-object v3, v3, Lx1/j;->v:Ly0/n;

    .line 345
    .line 346
    move v4, v5

    .line 347
    :goto_d
    if-eqz v3, :cond_1b

    .line 348
    .line 349
    iget v8, v3, Ly0/n;->i:I

    .line 350
    .line 351
    and-int/lit16 v8, v8, 0x400

    .line 352
    .line 353
    if-eqz v8, :cond_1a

    .line 354
    .line 355
    add-int/lit8 v4, v4, 0x1

    .line 356
    .line 357
    if-ne v4, v7, :cond_17

    .line 358
    .line 359
    move-object v1, v3

    .line 360
    goto :goto_e

    .line 361
    :cond_17
    if-nez v2, :cond_18

    .line 362
    .line 363
    new-instance v2, Lj0/b;

    .line 364
    .line 365
    new-array v8, v0, [Ly0/n;

    .line 366
    .line 367
    invoke-direct {v2, v8}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 368
    .line 369
    .line 370
    :cond_18
    if-eqz v1, :cond_19

    .line 371
    .line 372
    invoke-virtual {v2, v1}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 373
    .line 374
    .line 375
    move-object v1, v6

    .line 376
    :cond_19
    invoke-virtual {v2, v3}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 377
    .line 378
    .line 379
    :cond_1a
    :goto_e
    iget-object v3, v3, Ly0/n;->l:Ly0/n;

    .line 380
    .line 381
    goto :goto_d

    .line 382
    :cond_1b
    if-ne v4, v7, :cond_1c

    .line 383
    .line 384
    goto :goto_c

    .line 385
    :cond_1c
    invoke-static {v2}, Lx1/k;->e(Lj0/b;)Ly0/n;

    .line 386
    .line 387
    .line 388
    move-result-object v1

    .line 389
    goto :goto_c

    .line 390
    :cond_1d
    iget-object p1, p1, Ly0/n;->k:Ly0/n;

    .line 391
    .line 392
    goto :goto_b

    .line 393
    :cond_1e
    invoke-virtual {p2}, Lx1/f0;->u()Lx1/f0;

    .line 394
    .line 395
    .line 396
    move-result-object p2

    .line 397
    if-eqz p2, :cond_1f

    .line 398
    .line 399
    iget-object p1, p2, Lx1/f0;->L:Lx1/b1;

    .line 400
    .line 401
    if-eqz p1, :cond_1f

    .line 402
    .line 403
    iget-object p1, p1, Lx1/b1;->e:Lx1/b2;

    .line 404
    .line 405
    goto :goto_a

    .line 406
    :cond_1f
    move-object p1, v6

    .line 407
    goto :goto_a

    .line 408
    :cond_20
    :goto_f
    if-nez v6, :cond_21

    .line 409
    .line 410
    goto :goto_10

    .line 411
    :cond_21
    invoke-virtual {p3, p0}, Lb1/g;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    move-result-object p0

    .line 415
    check-cast p0, Ljava/lang/Boolean;

    .line 416
    .line 417
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 418
    .line 419
    .line 420
    move-result p0

    .line 421
    return p0

    .line 422
    :cond_22
    :goto_10
    return v5

    .line 423
    :cond_23
    const-string p0, "This function should only be used for 1-D focus search"

    .line 424
    .line 425
    invoke-static {p0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 426
    .line 427
    .line 428
    const/4 p0, 0x0

    .line 429
    return p0

    .line 430
    :cond_24
    const-string p0, "This function should only be used within a parent that has focus."

    .line 431
    .line 432
    invoke-static {p0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 433
    .line 434
    .line 435
    const/4 p0, 0x0

    .line 436
    return p0
.end method

.method public static final C(ILb1/g;Ld1/b0;Le1/c;)Ljava/lang/Boolean;
    .locals 6

    .line 1
    invoke-virtual {p2}, Ld1/b0;->p1()Ld1/z;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_d

    .line 10
    .line 11
    const/4 v1, 0x3

    .line 12
    const/4 v2, 0x2

    .line 13
    const/4 v3, 0x1

    .line 14
    if-eq v0, v3, :cond_3

    .line 15
    .line 16
    if-eq v0, v2, :cond_d

    .line 17
    .line 18
    if-ne v0, v1, :cond_2

    .line 19
    .line 20
    invoke-virtual {p2}, Ld1/b0;->m1()Ld1/t;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-boolean v0, v0, Ld1/t;->a:Z

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-virtual {p1, p2}, Lb1/g;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    check-cast p0, Ljava/lang/Boolean;

    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_0
    if-nez p3, :cond_1

    .line 36
    .line 37
    invoke-static {p2, p0, p1}, Ld1/d;->h(Ld1/b0;ILfg/l;)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0

    .line 46
    :cond_1
    invoke-static {p0, p1, p2, p3}, Ld1/d;->A(ILb1/g;Ld1/b0;Le1/c;)Z

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0

    .line 55
    :cond_2
    invoke-static {}, Lokio/a;->k()V

    .line 56
    .line 57
    .line 58
    const/4 p0, 0x0

    .line 59
    return-object p0

    .line 60
    :cond_3
    invoke-static {p2}, Ld1/d;->n(Ld1/b0;)Ld1/b0;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    const-string v4, "ActiveParent must have a focusedChild"

    .line 65
    .line 66
    if-eqz v0, :cond_c

    .line 67
    .line 68
    invoke-virtual {v0}, Ld1/b0;->p1()Ld1/z;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    if-eqz v5, :cond_a

    .line 77
    .line 78
    if-eq v5, v3, :cond_5

    .line 79
    .line 80
    if-eq v5, v2, :cond_a

    .line 81
    .line 82
    if-eq v5, v1, :cond_4

    .line 83
    .line 84
    invoke-static {}, Lokio/a;->k()V

    .line 85
    .line 86
    .line 87
    const/4 p0, 0x0

    .line 88
    return-object p0

    .line 89
    :cond_4
    invoke-static {v4}, Lj8/o;->A(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    const/4 p0, 0x0

    .line 93
    return-object p0

    .line 94
    :cond_5
    invoke-static {p0, p1, v0, p3}, Ld1/d;->C(ILb1/g;Ld1/b0;Le1/c;)Ljava/lang/Boolean;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 99
    .line 100
    invoke-static {v1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    if-nez v2, :cond_6

    .line 105
    .line 106
    return-object v1

    .line 107
    :cond_6
    if-nez p3, :cond_9

    .line 108
    .line 109
    invoke-virtual {v0}, Ld1/b0;->p1()Ld1/z;

    .line 110
    .line 111
    .line 112
    move-result-object p3

    .line 113
    sget-object v1, Ld1/z;->h:Ld1/z;

    .line 114
    .line 115
    if-ne p3, v1, :cond_8

    .line 116
    .line 117
    invoke-static {v0}, Ld1/d;->f(Ld1/b0;)Ld1/b0;

    .line 118
    .line 119
    .line 120
    move-result-object p3

    .line 121
    if-eqz p3, :cond_7

    .line 122
    .line 123
    invoke-static {p3}, Ld1/d;->i(Ld1/b0;)Le1/c;

    .line 124
    .line 125
    .line 126
    move-result-object p3

    .line 127
    goto :goto_0

    .line 128
    :cond_7
    invoke-static {v4}, Lj8/o;->A(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    const/4 p0, 0x0

    .line 132
    return-object p0

    .line 133
    :cond_8
    const-string p0, "Searching for active node in inactive hierarchy"

    .line 134
    .line 135
    invoke-static {p0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    const/4 p0, 0x0

    .line 139
    return-object p0

    .line 140
    :cond_9
    :goto_0
    invoke-static {p0, p1, p2, p3}, Ld1/d;->l(ILb1/g;Ld1/b0;Le1/c;)Z

    .line 141
    .line 142
    .line 143
    move-result p0

    .line 144
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    return-object p0

    .line 149
    :cond_a
    if-nez p3, :cond_b

    .line 150
    .line 151
    invoke-static {v0}, Ld1/d;->i(Ld1/b0;)Le1/c;

    .line 152
    .line 153
    .line 154
    move-result-object p3

    .line 155
    :cond_b
    invoke-static {p0, p1, p2, p3}, Ld1/d;->l(ILb1/g;Ld1/b0;Le1/c;)Z

    .line 156
    .line 157
    .line 158
    move-result p0

    .line 159
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    return-object p0

    .line 164
    :cond_c
    invoke-static {v4}, Lj8/o;->A(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    const/4 p0, 0x0

    .line 168
    return-object p0

    .line 169
    :cond_d
    invoke-static {p2, p0, p1}, Ld1/d;->h(Ld1/b0;ILfg/l;)Z

    .line 170
    .line 171
    .line 172
    move-result p0

    .line 173
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    return-object p0
.end method

.method public static final a(Ld1/b0;Lb1/g;)Z
    .locals 7

    .line 1
    invoke-virtual {p0}, Ld1/b0;->p1()Ld1/z;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_9

    .line 10
    .line 11
    const/4 v1, 0x3

    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x2

    .line 14
    const/4 v4, 0x1

    .line 15
    if-eq v0, v4, :cond_2

    .line 16
    .line 17
    if-eq v0, v3, :cond_9

    .line 18
    .line 19
    if-ne v0, v1, :cond_1

    .line 20
    .line 21
    invoke-static {p0, p1}, Ld1/d;->x(Ld1/b0;Lb1/g;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_6

    .line 26
    .line 27
    invoke-virtual {p0}, Ld1/b0;->m1()Ld1/t;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget-boolean v0, v0, Ld1/t;->a:Z

    .line 32
    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    invoke-virtual {p1, p0}, Lb1/g;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    check-cast p0, Ljava/lang/Boolean;

    .line 40
    .line 41
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    move p0, v2

    .line 47
    :goto_0
    if-eqz p0, :cond_5

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_1
    invoke-static {}, Lokio/a;->k()V

    .line 51
    .line 52
    .line 53
    :goto_1
    const/4 p0, 0x0

    .line 54
    return p0

    .line 55
    :cond_2
    invoke-static {p0}, Ld1/d;->n(Ld1/b0;)Ld1/b0;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    const-string v5, "ActiveParent must have a focusedChild"

    .line 60
    .line 61
    if-eqz v0, :cond_8

    .line 62
    .line 63
    invoke-virtual {v0}, Ld1/b0;->p1()Ld1/z;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 68
    .line 69
    .line 70
    move-result v6

    .line 71
    if-eqz v6, :cond_7

    .line 72
    .line 73
    if-eq v6, v4, :cond_4

    .line 74
    .line 75
    if-eq v6, v3, :cond_7

    .line 76
    .line 77
    if-eq v6, v1, :cond_3

    .line 78
    .line 79
    invoke-static {}, Lokio/a;->k()V

    .line 80
    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_3
    invoke-static {v5}, Lj8/o;->A(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_4
    invoke-static {v0, p1}, Ld1/d;->a(Ld1/b0;Lb1/g;)Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-nez v1, :cond_6

    .line 92
    .line 93
    invoke-static {p0, v0, v3, p1}, Ld1/d;->m(Ld1/b0;Ld1/b0;ILb1/g;)Z

    .line 94
    .line 95
    .line 96
    move-result p0

    .line 97
    if-nez p0, :cond_6

    .line 98
    .line 99
    invoke-virtual {v0}, Ld1/b0;->m1()Ld1/t;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    iget-boolean p0, p0, Ld1/t;->a:Z

    .line 104
    .line 105
    if-eqz p0, :cond_5

    .line 106
    .line 107
    invoke-virtual {p1, v0}, Lb1/g;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    check-cast p0, Ljava/lang/Boolean;

    .line 112
    .line 113
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 114
    .line 115
    .line 116
    move-result p0

    .line 117
    if-eqz p0, :cond_5

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_5
    return v2

    .line 121
    :cond_6
    :goto_2
    return v4

    .line 122
    :cond_7
    invoke-static {p0, v0, v3, p1}, Ld1/d;->m(Ld1/b0;Ld1/b0;ILb1/g;)Z

    .line 123
    .line 124
    .line 125
    move-result p0

    .line 126
    return p0

    .line 127
    :cond_8
    invoke-static {v5}, Lj8/o;->A(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_9
    invoke-static {p0, p1}, Ld1/d;->x(Ld1/b0;Lb1/g;)Z

    .line 132
    .line 133
    .line 134
    move-result p0

    .line 135
    return p0
.end method

.method public static final b(Le1/c;Le1/c;Le1/c;I)Z
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move/from16 v3, p3

    .line 8
    .line 9
    invoke-static {v3, v2, v0}, Ld1/d;->c(ILe1/c;Le1/c;)Z

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    iget v5, v2, Le1/c;->b:F

    .line 14
    .line 15
    iget v6, v2, Le1/c;->d:F

    .line 16
    .line 17
    iget v7, v2, Le1/c;->a:F

    .line 18
    .line 19
    iget v2, v2, Le1/c;->c:F

    .line 20
    .line 21
    iget v8, v0, Le1/c;->d:F

    .line 22
    .line 23
    iget v9, v0, Le1/c;->b:F

    .line 24
    .line 25
    iget v10, v0, Le1/c;->c:F

    .line 26
    .line 27
    iget v11, v0, Le1/c;->a:F

    .line 28
    .line 29
    const/4 v12, 0x0

    .line 30
    if-nez v4, :cond_13

    .line 31
    .line 32
    invoke-static {v3, v1, v0}, Ld1/d;->c(ILe1/c;Le1/c;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_0

    .line 37
    .line 38
    goto/16 :goto_5

    .line 39
    .line 40
    :cond_0
    const-string v4, "This function should only be used for 2-D focus search"

    .line 41
    .line 42
    const/4 v13, 0x6

    .line 43
    const/4 v14, 0x5

    .line 44
    const/4 v15, 0x4

    .line 45
    const/16 p0, 0x1

    .line 46
    .line 47
    const/4 v0, 0x3

    .line 48
    if-ne v3, v0, :cond_1

    .line 49
    .line 50
    cmpl-float v16, v11, v2

    .line 51
    .line 52
    if-ltz v16, :cond_11

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    if-ne v3, v15, :cond_2

    .line 56
    .line 57
    cmpg-float v16, v10, v7

    .line 58
    .line 59
    if-gtz v16, :cond_11

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    if-ne v3, v14, :cond_3

    .line 63
    .line 64
    cmpl-float v16, v9, v6

    .line 65
    .line 66
    if-ltz v16, :cond_11

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_3
    if-ne v3, v13, :cond_12

    .line 70
    .line 71
    cmpg-float v16, v8, v5

    .line 72
    .line 73
    if-gtz v16, :cond_11

    .line 74
    .line 75
    :goto_0
    if-ne v3, v0, :cond_4

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_4
    if-ne v3, v15, :cond_5

    .line 79
    .line 80
    :goto_1
    return p0

    .line 81
    :cond_5
    if-ne v3, v0, :cond_6

    .line 82
    .line 83
    iget v1, v1, Le1/c;->c:F

    .line 84
    .line 85
    sub-float v1, v11, v1

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_6
    if-ne v3, v15, :cond_7

    .line 89
    .line 90
    iget v1, v1, Le1/c;->a:F

    .line 91
    .line 92
    sub-float/2addr v1, v10

    .line 93
    goto :goto_2

    .line 94
    :cond_7
    if-ne v3, v14, :cond_8

    .line 95
    .line 96
    iget v1, v1, Le1/c;->d:F

    .line 97
    .line 98
    sub-float v1, v9, v1

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_8
    if-ne v3, v13, :cond_10

    .line 102
    .line 103
    iget v1, v1, Le1/c;->b:F

    .line 104
    .line 105
    sub-float/2addr v1, v8

    .line 106
    :goto_2
    const/16 v16, 0x0

    .line 107
    .line 108
    cmpg-float v17, v1, v16

    .line 109
    .line 110
    if-gez v17, :cond_9

    .line 111
    .line 112
    move/from16 v1, v16

    .line 113
    .line 114
    :cond_9
    if-ne v3, v0, :cond_a

    .line 115
    .line 116
    sub-float/2addr v11, v7

    .line 117
    goto :goto_3

    .line 118
    :cond_a
    if-ne v3, v15, :cond_b

    .line 119
    .line 120
    sub-float v11, v2, v10

    .line 121
    .line 122
    goto :goto_3

    .line 123
    :cond_b
    if-ne v3, v14, :cond_c

    .line 124
    .line 125
    sub-float v11, v9, v5

    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_c
    if-ne v3, v13, :cond_f

    .line 129
    .line 130
    sub-float v11, v6, v8

    .line 131
    .line 132
    :goto_3
    const/high16 v0, 0x3f800000    # 1.0f

    .line 133
    .line 134
    cmpg-float v2, v11, v0

    .line 135
    .line 136
    if-gez v2, :cond_d

    .line 137
    .line 138
    move v11, v0

    .line 139
    :cond_d
    cmpg-float v0, v1, v11

    .line 140
    .line 141
    if-gez v0, :cond_e

    .line 142
    .line 143
    return p0

    .line 144
    :cond_e
    return v12

    .line 145
    :cond_f
    invoke-static {v4}, Lj8/o;->A(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    :goto_4
    const/4 v0, 0x0

    .line 149
    return v0

    .line 150
    :cond_10
    invoke-static {v4}, Lj8/o;->A(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    goto :goto_4

    .line 154
    :cond_11
    return p0

    .line 155
    :cond_12
    invoke-static {v4}, Lj8/o;->A(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    goto :goto_4

    .line 159
    :cond_13
    :goto_5
    return v12
.end method

.method public static final c(ILe1/c;Le1/c;)Z
    .locals 3

    .line 1
    const/4 v0, 0x3

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x1

    .line 4
    if-ne p0, v0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x4

    .line 8
    if-ne p0, v0, :cond_2

    .line 9
    .line 10
    :goto_0
    iget p0, p1, Le1/c;->d:F

    .line 11
    .line 12
    iget v0, p2, Le1/c;->b:F

    .line 13
    .line 14
    cmpl-float p0, p0, v0

    .line 15
    .line 16
    if-lez p0, :cond_1

    .line 17
    .line 18
    iget p0, p1, Le1/c;->b:F

    .line 19
    .line 20
    iget p1, p2, Le1/c;->d:F

    .line 21
    .line 22
    cmpg-float p0, p0, p1

    .line 23
    .line 24
    if-gez p0, :cond_1

    .line 25
    .line 26
    return v2

    .line 27
    :cond_1
    return v1

    .line 28
    :cond_2
    const/4 v0, 0x5

    .line 29
    if-ne p0, v0, :cond_3

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_3
    const/4 v0, 0x6

    .line 33
    if-ne p0, v0, :cond_5

    .line 34
    .line 35
    :goto_1
    iget p0, p1, Le1/c;->c:F

    .line 36
    .line 37
    iget v0, p2, Le1/c;->a:F

    .line 38
    .line 39
    cmpl-float p0, p0, v0

    .line 40
    .line 41
    if-lez p0, :cond_4

    .line 42
    .line 43
    iget p0, p1, Le1/c;->a:F

    .line 44
    .line 45
    iget p1, p2, Le1/c;->c:F

    .line 46
    .line 47
    cmpg-float p0, p0, p1

    .line 48
    .line 49
    if-gez p0, :cond_4

    .line 50
    .line 51
    return v2

    .line 52
    :cond_4
    return v1

    .line 53
    :cond_5
    const-string p0, "This function should only be used for 2-D focus search"

    .line 54
    .line 55
    invoke-static {p0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    const/4 p0, 0x0

    .line 59
    return p0
.end method

.method public static final d(Ld1/b0;Z)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ld1/b0;->p1()Ld1/z;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-eqz v0, :cond_5

    .line 11
    .line 12
    if-eq v0, v1, :cond_2

    .line 13
    .line 14
    const/4 p0, 0x2

    .line 15
    if-eq v0, p0, :cond_1

    .line 16
    .line 17
    const/4 p0, 0x3

    .line 18
    if-ne v0, p0, :cond_0

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    invoke-static {}, Lokio/a;->k()V

    .line 22
    .line 23
    .line 24
    const/4 p0, 0x0

    .line 25
    return p0

    .line 26
    :cond_1
    return p1

    .line 27
    :cond_2
    invoke-static {p0}, Ld1/d;->n(Ld1/b0;)Ld1/b0;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-eqz v0, :cond_3

    .line 32
    .line 33
    invoke-static {v0, p1}, Ld1/d;->d(Ld1/b0;Z)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    goto :goto_0

    .line 38
    :cond_3
    move p1, v1

    .line 39
    :goto_0
    if-eqz p1, :cond_4

    .line 40
    .line 41
    sget-object p1, Ld1/z;->h:Ld1/z;

    .line 42
    .line 43
    sget-object v0, Ld1/z;->i:Ld1/z;

    .line 44
    .line 45
    invoke-virtual {p0, p1, v0}, Ld1/b0;->l1(Ld1/z;Ld1/z;)V

    .line 46
    .line 47
    .line 48
    return v1

    .line 49
    :cond_4
    const/4 p0, 0x0

    .line 50
    return p0

    .line 51
    :cond_5
    :goto_1
    return v1
.end method

.method public static final e(Ld1/b0;Lj0/b;)V
    .locals 8

    .line 1
    iget-object v0, p0, Ly0/n;->g:Ly0/n;

    .line 2
    .line 3
    iget-boolean v0, v0, Ly0/n;->t:Z

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "visitChildren called on an unattached node"

    .line 8
    .line 9
    invoke-static {v0}, Lu1/a;->b(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    new-instance v0, Lj0/b;

    .line 13
    .line 14
    const/16 v1, 0x10

    .line 15
    .line 16
    new-array v2, v1, [Ly0/n;

    .line 17
    .line 18
    invoke-direct {v0, v2}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iget-object p0, p0, Ly0/n;->g:Ly0/n;

    .line 22
    .line 23
    iget-object v2, p0, Ly0/n;->l:Ly0/n;

    .line 24
    .line 25
    if-nez v2, :cond_1

    .line 26
    .line 27
    invoke-static {v0, p0}, Lx1/k;->b(Lj0/b;Ly0/n;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    invoke-virtual {v0, v2}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    :cond_2
    :goto_0
    iget p0, v0, Lj0/b;->i:I

    .line 35
    .line 36
    if-eqz p0, :cond_e

    .line 37
    .line 38
    add-int/lit8 p0, p0, -0x1

    .line 39
    .line 40
    invoke-virtual {v0, p0}, Lj0/b;->k(I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    check-cast p0, Ly0/n;

    .line 45
    .line 46
    iget v2, p0, Ly0/n;->j:I

    .line 47
    .line 48
    and-int/lit16 v2, v2, 0x400

    .line 49
    .line 50
    if-nez v2, :cond_3

    .line 51
    .line 52
    invoke-static {v0, p0}, Lx1/k;->b(Lj0/b;Ly0/n;)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_3
    :goto_1
    if-eqz p0, :cond_2

    .line 57
    .line 58
    iget v2, p0, Ly0/n;->i:I

    .line 59
    .line 60
    and-int/lit16 v2, v2, 0x400

    .line 61
    .line 62
    if-eqz v2, :cond_d

    .line 63
    .line 64
    const/4 v2, 0x0

    .line 65
    move-object v3, v2

    .line 66
    :goto_2
    if-eqz p0, :cond_2

    .line 67
    .line 68
    instance-of v4, p0, Ld1/b0;

    .line 69
    .line 70
    if-eqz v4, :cond_6

    .line 71
    .line 72
    check-cast p0, Ld1/b0;

    .line 73
    .line 74
    iget-boolean v4, p0, Ly0/n;->t:Z

    .line 75
    .line 76
    if-eqz v4, :cond_c

    .line 77
    .line 78
    invoke-static {p0}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    iget-boolean v4, v4, Lx1/f0;->W:Z

    .line 83
    .line 84
    if-eqz v4, :cond_4

    .line 85
    .line 86
    goto :goto_5

    .line 87
    :cond_4
    invoke-virtual {p0}, Ld1/b0;->m1()Ld1/t;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    iget-boolean v4, v4, Ld1/t;->a:Z

    .line 92
    .line 93
    if-eqz v4, :cond_5

    .line 94
    .line 95
    invoke-virtual {p1, p0}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    goto :goto_5

    .line 99
    :cond_5
    invoke-static {p0, p1}, Ld1/d;->e(Ld1/b0;Lj0/b;)V

    .line 100
    .line 101
    .line 102
    goto :goto_5

    .line 103
    :cond_6
    iget v4, p0, Ly0/n;->i:I

    .line 104
    .line 105
    and-int/lit16 v4, v4, 0x400

    .line 106
    .line 107
    if-eqz v4, :cond_c

    .line 108
    .line 109
    instance-of v4, p0, Lx1/j;

    .line 110
    .line 111
    if-eqz v4, :cond_c

    .line 112
    .line 113
    move-object v4, p0

    .line 114
    check-cast v4, Lx1/j;

    .line 115
    .line 116
    iget-object v4, v4, Lx1/j;->v:Ly0/n;

    .line 117
    .line 118
    const/4 v5, 0x0

    .line 119
    :goto_3
    const/4 v6, 0x1

    .line 120
    if-eqz v4, :cond_b

    .line 121
    .line 122
    iget v7, v4, Ly0/n;->i:I

    .line 123
    .line 124
    and-int/lit16 v7, v7, 0x400

    .line 125
    .line 126
    if-eqz v7, :cond_a

    .line 127
    .line 128
    add-int/lit8 v5, v5, 0x1

    .line 129
    .line 130
    if-ne v5, v6, :cond_7

    .line 131
    .line 132
    move-object p0, v4

    .line 133
    goto :goto_4

    .line 134
    :cond_7
    if-nez v3, :cond_8

    .line 135
    .line 136
    new-instance v3, Lj0/b;

    .line 137
    .line 138
    new-array v6, v1, [Ly0/n;

    .line 139
    .line 140
    invoke-direct {v3, v6}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    :cond_8
    if-eqz p0, :cond_9

    .line 144
    .line 145
    invoke-virtual {v3, p0}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    move-object p0, v2

    .line 149
    :cond_9
    invoke-virtual {v3, v4}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    :cond_a
    :goto_4
    iget-object v4, v4, Ly0/n;->l:Ly0/n;

    .line 153
    .line 154
    goto :goto_3

    .line 155
    :cond_b
    if-ne v5, v6, :cond_c

    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_c
    :goto_5
    invoke-static {v3}, Lx1/k;->e(Lj0/b;)Ly0/n;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    goto :goto_2

    .line 163
    :cond_d
    iget-object p0, p0, Ly0/n;->l:Ly0/n;

    .line 164
    .line 165
    goto :goto_1

    .line 166
    :cond_e
    return-void
.end method

.method public static final f(Ld1/b0;)Ld1/b0;
    .locals 1

    .line 1
    invoke-static {p0}, Lx1/k;->x(Lx1/i;)Lx1/r1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ly1/t;

    .line 6
    .line 7
    invoke-virtual {p0}, Ly1/t;->getFocusOwner()Ld1/l;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Ld1/p;

    .line 12
    .line 13
    invoke-virtual {p0}, Ld1/p;->f()Ld1/b0;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    iget-boolean v0, p0, Ly0/n;->t:Z

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_0
    const/4 p0, 0x0

    .line 25
    return-object p0
.end method

.method public static final g(Lj0/b;Le1/c;I)Ld1/b0;
    .locals 7

    .line 1
    const/4 v0, 0x3

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x1

    .line 4
    if-ne p2, v0, :cond_0

    .line 5
    .line 6
    iget v0, p1, Le1/c;->c:F

    .line 7
    .line 8
    iget v3, p1, Le1/c;->a:F

    .line 9
    .line 10
    sub-float/2addr v0, v3

    .line 11
    int-to-float v2, v2

    .line 12
    add-float/2addr v0, v2

    .line 13
    invoke-virtual {p1, v0, v1}, Le1/c;->h(FF)Le1/c;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x4

    .line 19
    if-ne p2, v0, :cond_1

    .line 20
    .line 21
    iget v0, p1, Le1/c;->c:F

    .line 22
    .line 23
    iget v3, p1, Le1/c;->a:F

    .line 24
    .line 25
    sub-float/2addr v0, v3

    .line 26
    int-to-float v2, v2

    .line 27
    add-float/2addr v0, v2

    .line 28
    neg-float v0, v0

    .line 29
    invoke-virtual {p1, v0, v1}, Le1/c;->h(FF)Le1/c;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const/4 v0, 0x5

    .line 35
    if-ne p2, v0, :cond_2

    .line 36
    .line 37
    iget v0, p1, Le1/c;->d:F

    .line 38
    .line 39
    iget v3, p1, Le1/c;->b:F

    .line 40
    .line 41
    sub-float/2addr v0, v3

    .line 42
    int-to-float v2, v2

    .line 43
    add-float/2addr v0, v2

    .line 44
    invoke-virtual {p1, v1, v0}, Le1/c;->h(FF)Le1/c;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    goto :goto_0

    .line 49
    :cond_2
    const/4 v0, 0x6

    .line 50
    if-ne p2, v0, :cond_5

    .line 51
    .line 52
    iget v0, p1, Le1/c;->d:F

    .line 53
    .line 54
    iget v3, p1, Le1/c;->b:F

    .line 55
    .line 56
    sub-float/2addr v0, v3

    .line 57
    int-to-float v2, v2

    .line 58
    add-float/2addr v0, v2

    .line 59
    neg-float v0, v0

    .line 60
    invoke-virtual {p1, v1, v0}, Le1/c;->h(FF)Le1/c;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    :goto_0
    iget-object v1, p0, Lj0/b;->g:[Ljava/lang/Object;

    .line 65
    .line 66
    iget p0, p0, Lj0/b;->i:I

    .line 67
    .line 68
    const/4 v2, 0x0

    .line 69
    const/4 v3, 0x0

    .line 70
    :goto_1
    if-ge v3, p0, :cond_4

    .line 71
    .line 72
    aget-object v4, v1, v3

    .line 73
    .line 74
    check-cast v4, Ld1/b0;

    .line 75
    .line 76
    invoke-static {v4}, Ld1/d;->r(Ld1/b0;)Z

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    if-eqz v5, :cond_3

    .line 81
    .line 82
    invoke-static {v4}, Ld1/d;->i(Ld1/b0;)Le1/c;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    invoke-static {v5, v0, p1, p2}, Ld1/d;->o(Le1/c;Le1/c;Le1/c;I)Z

    .line 87
    .line 88
    .line 89
    move-result v6

    .line 90
    if-eqz v6, :cond_3

    .line 91
    .line 92
    move-object v2, v4

    .line 93
    move-object v0, v5

    .line 94
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_4
    return-object v2

    .line 98
    :cond_5
    const-string p0, "This function should only be used for 2-D focus search"

    .line 99
    .line 100
    invoke-static {p0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    const/4 p0, 0x0

    .line 104
    return-object p0
.end method

.method public static final h(Ld1/b0;ILfg/l;)Z
    .locals 4

    .line 1
    new-instance v0, Lj0/b;

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    new-array v1, v1, [Ld1/b0;

    .line 6
    .line 7
    invoke-direct {v0, v1}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-static {p0, v0}, Ld1/d;->e(Ld1/b0;Lj0/b;)V

    .line 11
    .line 12
    .line 13
    iget v1, v0, Lj0/b;->i:I

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    const/4 v3, 0x0

    .line 17
    if-gt v1, v2, :cond_1

    .line 18
    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object p0, v0, Lj0/b;->g:[Ljava/lang/Object;

    .line 24
    .line 25
    aget-object p0, p0, v3

    .line 26
    .line 27
    :goto_0
    check-cast p0, Ld1/b0;

    .line 28
    .line 29
    if-eqz p0, :cond_6

    .line 30
    .line 31
    invoke-interface {p2, p0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    check-cast p0, Ljava/lang/Boolean;

    .line 36
    .line 37
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    return p0

    .line 42
    :cond_1
    const/4 v1, 0x7

    .line 43
    const/4 v2, 0x4

    .line 44
    if-ne p1, v1, :cond_2

    .line 45
    .line 46
    move p1, v2

    .line 47
    :cond_2
    if-ne p1, v2, :cond_3

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_3
    const/4 v1, 0x6

    .line 51
    if-ne p1, v1, :cond_4

    .line 52
    .line 53
    :goto_1
    invoke-static {p0}, Ld1/d;->i(Ld1/b0;)Le1/c;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    new-instance v1, Le1/c;

    .line 58
    .line 59
    iget v2, p0, Le1/c;->a:F

    .line 60
    .line 61
    iget p0, p0, Le1/c;->b:F

    .line 62
    .line 63
    invoke-direct {v1, v2, p0, v2, p0}, Le1/c;-><init>(FFFF)V

    .line 64
    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_4
    const/4 v1, 0x3

    .line 68
    if-ne p1, v1, :cond_5

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_5
    const/4 v1, 0x5

    .line 72
    if-ne p1, v1, :cond_7

    .line 73
    .line 74
    :goto_2
    invoke-static {p0}, Ld1/d;->i(Ld1/b0;)Le1/c;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    new-instance v1, Le1/c;

    .line 79
    .line 80
    iget v2, p0, Le1/c;->c:F

    .line 81
    .line 82
    iget p0, p0, Le1/c;->d:F

    .line 83
    .line 84
    invoke-direct {v1, v2, p0, v2, p0}, Le1/c;-><init>(FFFF)V

    .line 85
    .line 86
    .line 87
    :goto_3
    invoke-static {v0, v1, p1}, Ld1/d;->g(Lj0/b;Le1/c;I)Ld1/b0;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    if-eqz p0, :cond_6

    .line 92
    .line 93
    invoke-interface {p2, p0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    check-cast p0, Ljava/lang/Boolean;

    .line 98
    .line 99
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 100
    .line 101
    .line 102
    move-result p0

    .line 103
    return p0

    .line 104
    :cond_6
    return v3

    .line 105
    :cond_7
    const-string p0, "This function should only be used for 2-D focus search"

    .line 106
    .line 107
    invoke-static {p0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    const/4 p0, 0x0

    .line 111
    return p0
.end method

.method public static final i(Ld1/b0;)Le1/c;
    .locals 2

    .line 1
    iget-boolean v0, p0, Ly0/n;->t:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    iget-object v0, p0, Ly0/n;->n:Lx1/i1;

    .line 7
    .line 8
    if-eqz v0, :cond_3

    .line 9
    .line 10
    invoke-static {v0}, Lv1/w;->h(Lv1/t;)Lv1/t;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Lv1/t;->C()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    const/4 v0, 0x0

    .line 22
    :goto_0
    if-nez v0, :cond_2

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_2
    invoke-virtual {p0, v0}, Ld1/b0;->n1(Lv1/t;)Le1/c;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0

    .line 30
    :cond_3
    :goto_1
    sget-object p0, Le1/c;->e:Le1/c;

    .line 31
    .line 32
    return-object p0
.end method

.method public static final j(Ly0/o;Ld1/v;)Ly0/o;
    .locals 1

    .line 1
    new-instance v0, Ld1/w;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ld1/w;-><init>(Ld1/v;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, v0}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static final k(Ld1/b0;Lb1/g;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Ld1/b0;->p1()Ld1/z;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_6

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    if-eq v0, v1, :cond_2

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    if-eq v0, v1, :cond_6

    .line 16
    .line 17
    const/4 v1, 0x3

    .line 18
    if-ne v0, v1, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0}, Ld1/b0;->m1()Ld1/t;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-boolean v0, v0, Ld1/t;->a:Z

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-virtual {p1, p0}, Lb1/g;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    check-cast p0, Ljava/lang/Boolean;

    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    return p0

    .line 39
    :cond_0
    invoke-static {p0, p1}, Ld1/d;->y(Ld1/b0;Lb1/g;)Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    return p0

    .line 44
    :cond_1
    invoke-static {}, Lokio/a;->k()V

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    return p0

    .line 49
    :cond_2
    invoke-static {p0}, Ld1/d;->n(Ld1/b0;)Ld1/b0;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    if-eqz v0, :cond_5

    .line 54
    .line 55
    invoke-static {v0, p1}, Ld1/d;->k(Ld1/b0;Lb1/g;)Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-nez v2, :cond_4

    .line 60
    .line 61
    invoke-static {p0, v0, v1, p1}, Ld1/d;->m(Ld1/b0;Ld1/b0;ILb1/g;)Z

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    if-eqz p0, :cond_3

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_3
    const/4 p0, 0x0

    .line 69
    return p0

    .line 70
    :cond_4
    :goto_0
    return v1

    .line 71
    :cond_5
    const-string p0, "ActiveParent must have a focusedChild"

    .line 72
    .line 73
    invoke-static {p0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    const/4 p0, 0x0

    .line 77
    return p0

    .line 78
    :cond_6
    invoke-static {p0, p1}, Ld1/d;->y(Ld1/b0;Lb1/g;)Z

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    return p0
.end method

.method public static final l(ILb1/g;Ld1/b0;Le1/c;)Z
    .locals 8

    .line 1
    invoke-static {p0, p1, p2, p3}, Ld1/d;->A(ILb1/g;Ld1/b0;Le1/c;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    invoke-static {p2}, Lx1/k;->x(Lx1/i;)Lx1/r1;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ly1/t;

    .line 14
    .line 15
    invoke-virtual {v0}, Ly1/t;->getFocusOwner()Ld1/l;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Ld1/p;

    .line 20
    .line 21
    invoke-virtual {v0}, Ld1/p;->f()Ld1/b0;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    new-instance v1, Ld1/e0;

    .line 26
    .line 27
    const/4 v7, 0x1

    .line 28
    move v5, p0

    .line 29
    move-object v6, p1

    .line 30
    move-object v3, p2

    .line 31
    move-object v4, p3

    .line 32
    invoke-direct/range {v1 .. v7}, Ld1/e0;-><init>(Ld1/b0;Ld1/b0;Ljava/lang/Object;ILb1/g;I)V

    .line 33
    .line 34
    .line 35
    invoke-static {v3, v5, v1}, Ld1/d;->z(Ld1/b0;ILfg/l;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    check-cast p0, Ljava/lang/Boolean;

    .line 40
    .line 41
    if-eqz p0, :cond_1

    .line 42
    .line 43
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    return p0

    .line 48
    :cond_1
    const/4 p0, 0x0

    .line 49
    return p0
.end method

.method public static final m(Ld1/b0;Ld1/b0;ILb1/g;)Z
    .locals 8

    .line 1
    invoke-static {p0, p1, p2, p3}, Ld1/d;->B(Ld1/b0;Ld1/b0;ILb1/g;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    invoke-static {p0}, Lx1/k;->x(Lx1/i;)Lx1/r1;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ly1/t;

    .line 14
    .line 15
    invoke-virtual {v0}, Ly1/t;->getFocusOwner()Ld1/l;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Ld1/p;

    .line 20
    .line 21
    invoke-virtual {v0}, Ld1/p;->f()Ld1/b0;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    new-instance v1, Ld1/e0;

    .line 26
    .line 27
    const/4 v7, 0x0

    .line 28
    move-object v3, p0

    .line 29
    move-object v4, p1

    .line 30
    move v5, p2

    .line 31
    move-object v6, p3

    .line 32
    invoke-direct/range {v1 .. v7}, Ld1/e0;-><init>(Ld1/b0;Ld1/b0;Ljava/lang/Object;ILb1/g;I)V

    .line 33
    .line 34
    .line 35
    invoke-static {v3, v5, v1}, Ld1/d;->z(Ld1/b0;ILfg/l;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    check-cast p0, Ljava/lang/Boolean;

    .line 40
    .line 41
    if-eqz p0, :cond_1

    .line 42
    .line 43
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    return p0

    .line 48
    :cond_1
    const/4 p0, 0x0

    .line 49
    return p0
.end method

.method public static final n(Ld1/b0;)Ld1/b0;
    .locals 8

    .line 1
    iget-object v0, p0, Ly0/n;->g:Ly0/n;

    .line 2
    .line 3
    iget-boolean v0, v0, Ly0/n;->t:Z

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    goto/16 :goto_6

    .line 9
    .line 10
    :cond_0
    if-nez v0, :cond_1

    .line 11
    .line 12
    const-string v0, "visitChildren called on an unattached node"

    .line 13
    .line 14
    invoke-static {v0}, Lu1/a;->b(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    :cond_1
    new-instance v0, Lj0/b;

    .line 18
    .line 19
    const/16 v2, 0x10

    .line 20
    .line 21
    new-array v3, v2, [Ly0/n;

    .line 22
    .line 23
    invoke-direct {v0, v3}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iget-object p0, p0, Ly0/n;->g:Ly0/n;

    .line 27
    .line 28
    iget-object v3, p0, Ly0/n;->l:Ly0/n;

    .line 29
    .line 30
    if-nez v3, :cond_2

    .line 31
    .line 32
    invoke-static {v0, p0}, Lx1/k;->b(Lj0/b;Ly0/n;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    invoke-virtual {v0, v3}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    :cond_3
    :goto_0
    iget p0, v0, Lj0/b;->i:I

    .line 40
    .line 41
    if-eqz p0, :cond_f

    .line 42
    .line 43
    add-int/lit8 p0, p0, -0x1

    .line 44
    .line 45
    invoke-virtual {v0, p0}, Lj0/b;->k(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    check-cast p0, Ly0/n;

    .line 50
    .line 51
    iget v3, p0, Ly0/n;->j:I

    .line 52
    .line 53
    and-int/lit16 v3, v3, 0x400

    .line 54
    .line 55
    if-nez v3, :cond_4

    .line 56
    .line 57
    invoke-static {v0, p0}, Lx1/k;->b(Lj0/b;Ly0/n;)V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_4
    :goto_1
    if-eqz p0, :cond_3

    .line 62
    .line 63
    iget v3, p0, Ly0/n;->i:I

    .line 64
    .line 65
    and-int/lit16 v3, v3, 0x400

    .line 66
    .line 67
    if-eqz v3, :cond_e

    .line 68
    .line 69
    move-object v3, v1

    .line 70
    :goto_2
    if-eqz p0, :cond_3

    .line 71
    .line 72
    instance-of v4, p0, Ld1/b0;

    .line 73
    .line 74
    const/4 v5, 0x1

    .line 75
    if-eqz v4, :cond_7

    .line 76
    .line 77
    check-cast p0, Ld1/b0;

    .line 78
    .line 79
    iget-object v4, p0, Ly0/n;->g:Ly0/n;

    .line 80
    .line 81
    iget-boolean v4, v4, Ly0/n;->t:Z

    .line 82
    .line 83
    if-eqz v4, :cond_d

    .line 84
    .line 85
    invoke-virtual {p0}, Ld1/b0;->p1()Ld1/z;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 90
    .line 91
    .line 92
    move-result v4

    .line 93
    if-eqz v4, :cond_6

    .line 94
    .line 95
    if-eq v4, v5, :cond_6

    .line 96
    .line 97
    const/4 v5, 0x2

    .line 98
    if-eq v4, v5, :cond_6

    .line 99
    .line 100
    const/4 p0, 0x3

    .line 101
    if-ne v4, p0, :cond_5

    .line 102
    .line 103
    goto :goto_5

    .line 104
    :cond_5
    invoke-static {}, Lokio/a;->k()V

    .line 105
    .line 106
    .line 107
    const/4 p0, 0x0

    .line 108
    :cond_6
    return-object p0

    .line 109
    :cond_7
    iget v4, p0, Ly0/n;->i:I

    .line 110
    .line 111
    and-int/lit16 v4, v4, 0x400

    .line 112
    .line 113
    if-eqz v4, :cond_d

    .line 114
    .line 115
    instance-of v4, p0, Lx1/j;

    .line 116
    .line 117
    if-eqz v4, :cond_d

    .line 118
    .line 119
    move-object v4, p0

    .line 120
    check-cast v4, Lx1/j;

    .line 121
    .line 122
    iget-object v4, v4, Lx1/j;->v:Ly0/n;

    .line 123
    .line 124
    const/4 v6, 0x0

    .line 125
    :goto_3
    if-eqz v4, :cond_c

    .line 126
    .line 127
    iget v7, v4, Ly0/n;->i:I

    .line 128
    .line 129
    and-int/lit16 v7, v7, 0x400

    .line 130
    .line 131
    if-eqz v7, :cond_b

    .line 132
    .line 133
    add-int/lit8 v6, v6, 0x1

    .line 134
    .line 135
    if-ne v6, v5, :cond_8

    .line 136
    .line 137
    move-object p0, v4

    .line 138
    goto :goto_4

    .line 139
    :cond_8
    if-nez v3, :cond_9

    .line 140
    .line 141
    new-instance v3, Lj0/b;

    .line 142
    .line 143
    new-array v7, v2, [Ly0/n;

    .line 144
    .line 145
    invoke-direct {v3, v7}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    :cond_9
    if-eqz p0, :cond_a

    .line 149
    .line 150
    invoke-virtual {v3, p0}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    move-object p0, v1

    .line 154
    :cond_a
    invoke-virtual {v3, v4}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    :cond_b
    :goto_4
    iget-object v4, v4, Ly0/n;->l:Ly0/n;

    .line 158
    .line 159
    goto :goto_3

    .line 160
    :cond_c
    if-ne v6, v5, :cond_d

    .line 161
    .line 162
    goto :goto_2

    .line 163
    :cond_d
    :goto_5
    invoke-static {v3}, Lx1/k;->e(Lj0/b;)Ly0/n;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    goto :goto_2

    .line 168
    :cond_e
    iget-object p0, p0, Ly0/n;->l:Ly0/n;

    .line 169
    .line 170
    goto :goto_1

    .line 171
    :cond_f
    :goto_6
    return-object v1
.end method

.method public static final o(Le1/c;Le1/c;Le1/c;I)Z
    .locals 2

    .line 1
    invoke-static {p3, p0, p2}, Ld1/d;->p(ILe1/c;Le1/c;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    invoke-static {p3, p1, p2}, Ld1/d;->p(ILe1/c;Le1/c;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    invoke-static {p2, p0, p1, p3}, Ld1/d;->b(Le1/c;Le1/c;Le1/c;I)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    invoke-static {p2, p1, p0, p3}, Ld1/d;->b(Le1/c;Le1/c;Le1/c;I)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_3

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_3
    invoke-static {p3, p2, p0}, Ld1/d;->q(ILe1/c;Le1/c;)J

    .line 30
    .line 31
    .line 32
    move-result-wide v0

    .line 33
    invoke-static {p3, p2, p1}, Ld1/d;->q(ILe1/c;Le1/c;)J

    .line 34
    .line 35
    .line 36
    move-result-wide p0

    .line 37
    cmp-long p0, v0, p0

    .line 38
    .line 39
    if-gez p0, :cond_4

    .line 40
    .line 41
    :goto_0
    const/4 p0, 0x1

    .line 42
    return p0

    .line 43
    :cond_4
    :goto_1
    const/4 p0, 0x0

    .line 44
    return p0
.end method

.method public static final p(ILe1/c;Le1/c;)Z
    .locals 3

    .line 1
    const/4 v0, 0x3

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x1

    .line 4
    if-ne p0, v0, :cond_2

    .line 5
    .line 6
    iget p0, p2, Le1/c;->c:F

    .line 7
    .line 8
    iget p2, p2, Le1/c;->a:F

    .line 9
    .line 10
    iget v0, p1, Le1/c;->c:F

    .line 11
    .line 12
    cmpl-float p0, p0, v0

    .line 13
    .line 14
    if-gtz p0, :cond_0

    .line 15
    .line 16
    cmpl-float p0, p2, v0

    .line 17
    .line 18
    if-ltz p0, :cond_1

    .line 19
    .line 20
    :cond_0
    iget p0, p1, Le1/c;->a:F

    .line 21
    .line 22
    cmpl-float p0, p2, p0

    .line 23
    .line 24
    if-lez p0, :cond_1

    .line 25
    .line 26
    return v2

    .line 27
    :cond_1
    return v1

    .line 28
    :cond_2
    const/4 v0, 0x4

    .line 29
    if-ne p0, v0, :cond_5

    .line 30
    .line 31
    iget p0, p2, Le1/c;->a:F

    .line 32
    .line 33
    iget p2, p2, Le1/c;->c:F

    .line 34
    .line 35
    iget v0, p1, Le1/c;->a:F

    .line 36
    .line 37
    cmpg-float p0, p0, v0

    .line 38
    .line 39
    if-ltz p0, :cond_3

    .line 40
    .line 41
    cmpg-float p0, p2, v0

    .line 42
    .line 43
    if-gtz p0, :cond_4

    .line 44
    .line 45
    :cond_3
    iget p0, p1, Le1/c;->c:F

    .line 46
    .line 47
    cmpg-float p0, p2, p0

    .line 48
    .line 49
    if-gez p0, :cond_4

    .line 50
    .line 51
    return v2

    .line 52
    :cond_4
    return v1

    .line 53
    :cond_5
    const/4 v0, 0x5

    .line 54
    if-ne p0, v0, :cond_8

    .line 55
    .line 56
    iget p0, p2, Le1/c;->d:F

    .line 57
    .line 58
    iget p2, p2, Le1/c;->b:F

    .line 59
    .line 60
    iget v0, p1, Le1/c;->d:F

    .line 61
    .line 62
    cmpl-float p0, p0, v0

    .line 63
    .line 64
    if-gtz p0, :cond_6

    .line 65
    .line 66
    cmpl-float p0, p2, v0

    .line 67
    .line 68
    if-ltz p0, :cond_7

    .line 69
    .line 70
    :cond_6
    iget p0, p1, Le1/c;->b:F

    .line 71
    .line 72
    cmpl-float p0, p2, p0

    .line 73
    .line 74
    if-lez p0, :cond_7

    .line 75
    .line 76
    return v2

    .line 77
    :cond_7
    return v1

    .line 78
    :cond_8
    const/4 v0, 0x6

    .line 79
    if-ne p0, v0, :cond_b

    .line 80
    .line 81
    iget p0, p2, Le1/c;->b:F

    .line 82
    .line 83
    iget p2, p2, Le1/c;->d:F

    .line 84
    .line 85
    iget v0, p1, Le1/c;->b:F

    .line 86
    .line 87
    cmpg-float p0, p0, v0

    .line 88
    .line 89
    if-ltz p0, :cond_9

    .line 90
    .line 91
    cmpg-float p0, p2, v0

    .line 92
    .line 93
    if-gtz p0, :cond_a

    .line 94
    .line 95
    :cond_9
    iget p0, p1, Le1/c;->d:F

    .line 96
    .line 97
    cmpg-float p0, p2, p0

    .line 98
    .line 99
    if-gez p0, :cond_a

    .line 100
    .line 101
    return v2

    .line 102
    :cond_a
    return v1

    .line 103
    :cond_b
    const-string p0, "This function should only be used for 2-D focus search"

    .line 104
    .line 105
    invoke-static {p0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    const/4 p0, 0x0

    .line 109
    return p0
.end method

.method public static final q(ILe1/c;Le1/c;)J
    .locals 8

    .line 1
    const-string v0, "This function should only be used for 2-D focus search"

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    const/4 v2, 0x5

    .line 5
    const/4 v3, 0x4

    .line 6
    const/4 v4, 0x3

    .line 7
    if-ne p0, v4, :cond_0

    .line 8
    .line 9
    iget v5, p1, Le1/c;->a:F

    .line 10
    .line 11
    iget v6, p2, Le1/c;->c:F

    .line 12
    .line 13
    :goto_0
    sub-float/2addr v5, v6

    .line 14
    goto :goto_1

    .line 15
    :cond_0
    if-ne p0, v3, :cond_1

    .line 16
    .line 17
    iget v5, p2, Le1/c;->a:F

    .line 18
    .line 19
    iget v6, p1, Le1/c;->c:F

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    if-ne p0, v2, :cond_2

    .line 23
    .line 24
    iget v5, p1, Le1/c;->b:F

    .line 25
    .line 26
    iget v6, p2, Le1/c;->d:F

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_2
    if-ne p0, v1, :cond_8

    .line 30
    .line 31
    iget v5, p2, Le1/c;->b:F

    .line 32
    .line 33
    iget v6, p1, Le1/c;->d:F

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :goto_1
    const/4 v6, 0x0

    .line 37
    cmpg-float v7, v5, v6

    .line 38
    .line 39
    if-gez v7, :cond_3

    .line 40
    .line 41
    move v5, v6

    .line 42
    :cond_3
    float-to-long v5, v5

    .line 43
    const/4 v7, 0x2

    .line 44
    if-ne p0, v4, :cond_4

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_4
    if-ne p0, v3, :cond_5

    .line 48
    .line 49
    :goto_2
    iget p0, p1, Le1/c;->b:F

    .line 50
    .line 51
    iget p1, p1, Le1/c;->d:F

    .line 52
    .line 53
    sub-float/2addr p1, p0

    .line 54
    int-to-float v0, v7

    .line 55
    div-float/2addr p1, v0

    .line 56
    add-float/2addr p1, p0

    .line 57
    iget p0, p2, Le1/c;->b:F

    .line 58
    .line 59
    iget p2, p2, Le1/c;->d:F

    .line 60
    .line 61
    :goto_3
    sub-float/2addr p2, p0

    .line 62
    div-float/2addr p2, v0

    .line 63
    add-float/2addr p2, p0

    .line 64
    sub-float/2addr p1, p2

    .line 65
    goto :goto_5

    .line 66
    :cond_5
    if-ne p0, v2, :cond_6

    .line 67
    .line 68
    goto :goto_4

    .line 69
    :cond_6
    if-ne p0, v1, :cond_7

    .line 70
    .line 71
    :goto_4
    iget p0, p1, Le1/c;->a:F

    .line 72
    .line 73
    iget p1, p1, Le1/c;->c:F

    .line 74
    .line 75
    sub-float/2addr p1, p0

    .line 76
    int-to-float v0, v7

    .line 77
    div-float/2addr p1, v0

    .line 78
    add-float/2addr p1, p0

    .line 79
    iget p0, p2, Le1/c;->a:F

    .line 80
    .line 81
    iget p2, p2, Le1/c;->c:F

    .line 82
    .line 83
    goto :goto_3

    .line 84
    :goto_5
    float-to-long p0, p1

    .line 85
    const/16 p2, 0xd

    .line 86
    .line 87
    int-to-long v0, p2

    .line 88
    mul-long/2addr v0, v5

    .line 89
    mul-long/2addr v0, v5

    .line 90
    mul-long/2addr p0, p0

    .line 91
    add-long/2addr p0, v0

    .line 92
    return-wide p0

    .line 93
    :cond_7
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    const-wide/16 p0, 0x0

    .line 97
    .line 98
    return-wide p0

    .line 99
    :cond_8
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    const-wide/16 p0, 0x0

    .line 103
    .line 104
    return-wide p0
.end method

.method public static final r(Ld1/b0;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Ly0/n;->n:Lx1/i1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Lx1/i1;->u:Lx1/f0;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Lx1/f0;->H()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x1

    .line 14
    if-ne v0, v1, :cond_0

    .line 15
    .line 16
    iget-object p0, p0, Ly0/n;->n:Lx1/i1;

    .line 17
    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    iget-object p0, p0, Lx1/i1;->u:Lx1/f0;

    .line 21
    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    invoke-virtual {p0}, Lx1/f0;->G()Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    if-ne p0, v1, :cond_0

    .line 29
    .line 30
    return v1

    .line 31
    :cond_0
    const/4 p0, 0x0

    .line 32
    return p0
.end method

.method public static final s(Ly0/o;Lfg/l;)Ly0/o;
    .locals 1

    .line 1
    new-instance v0, Ld1/c;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ld1/c;-><init>(Lfg/l;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, v0}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static final t(Ld1/b0;I)Ld1/b;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ld1/b0;->p1()Ld1/z;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    sget-object v1, Ld1/b;->g:Ld1/b;

    .line 10
    .line 11
    if-eqz v0, :cond_a

    .line 12
    .line 13
    sget-object v2, Ld1/b;->h:Ld1/b;

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    const/4 v4, 0x1

    .line 17
    if-eq v0, v4, :cond_2

    .line 18
    .line 19
    const/4 p0, 0x2

    .line 20
    if-eq v0, p0, :cond_1

    .line 21
    .line 22
    const/4 p0, 0x3

    .line 23
    if-ne v0, p0, :cond_0

    .line 24
    .line 25
    goto :goto_2

    .line 26
    :cond_0
    invoke-static {}, Lokio/a;->k()V

    .line 27
    .line 28
    .line 29
    return-object v3

    .line 30
    :cond_1
    return-object v2

    .line 31
    :cond_2
    invoke-static {p0}, Ld1/d;->n(Ld1/b0;)Ld1/b0;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    if-eqz v0, :cond_9

    .line 36
    .line 37
    invoke-static {v0, p1}, Ld1/d;->t(Ld1/b0;I)Ld1/b;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    if-ne v0, v1, :cond_3

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_3
    move-object v3, v0

    .line 45
    :goto_0
    if-nez v3, :cond_8

    .line 46
    .line 47
    iget-boolean v0, p0, Ld1/b0;->w:Z

    .line 48
    .line 49
    if-nez v0, :cond_7

    .line 50
    .line 51
    iput-boolean v4, p0, Ld1/b0;->w:Z

    .line 52
    .line 53
    const/4 v0, 0x0

    .line 54
    :try_start_0
    invoke-virtual {p0}, Ld1/b0;->m1()Ld1/t;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    new-instance v4, Ld1/a;

    .line 59
    .line 60
    invoke-direct {v4, p1}, Ld1/a;-><init>(I)V

    .line 61
    .line 62
    .line 63
    invoke-static {p0}, Lx1/k;->x(Lx1/i;)Lx1/r1;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    check-cast p1, Ly1/t;

    .line 68
    .line 69
    invoke-virtual {p1}, Ly1/t;->getFocusOwner()Ld1/l;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    check-cast p1, Ld1/p;

    .line 74
    .line 75
    invoke-virtual {p1}, Ld1/p;->f()Ld1/b0;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    iget-object v3, v3, Ld1/t;->k:Lgg/m;

    .line 80
    .line 81
    invoke-interface {v3, v4}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1}, Ld1/p;->f()Ld1/b0;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    iget-boolean v3, v4, Ld1/a;->b:Z

    .line 89
    .line 90
    if-eqz v3, :cond_4

    .line 91
    .line 92
    sget-object p1, Ld1/v;->b:Ld1/v;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 93
    .line 94
    iput-boolean v0, p0, Ld1/b0;->w:Z

    .line 95
    .line 96
    return-object v2

    .line 97
    :catchall_0
    move-exception p1

    .line 98
    goto :goto_1

    .line 99
    :cond_4
    if-eq v5, p1, :cond_6

    .line 100
    .line 101
    if-eqz p1, :cond_6

    .line 102
    .line 103
    :try_start_1
    sget-object p1, Ld1/v;->d:Ld1/v;

    .line 104
    .line 105
    sget-object v1, Ld1/v;->c:Ld1/v;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 106
    .line 107
    if-ne p1, v1, :cond_5

    .line 108
    .line 109
    iput-boolean v0, p0, Ld1/b0;->w:Z

    .line 110
    .line 111
    return-object v2

    .line 112
    :cond_5
    :try_start_2
    sget-object p1, Ld1/b;->i:Ld1/b;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 113
    .line 114
    iput-boolean v0, p0, Ld1/b0;->w:Z

    .line 115
    .line 116
    return-object p1

    .line 117
    :cond_6
    iput-boolean v0, p0, Ld1/b0;->w:Z

    .line 118
    .line 119
    return-object v1

    .line 120
    :goto_1
    iput-boolean v0, p0, Ld1/b0;->w:Z

    .line 121
    .line 122
    throw p1

    .line 123
    :cond_7
    return-object v1

    .line 124
    :cond_8
    return-object v3

    .line 125
    :cond_9
    const-string p0, "ActiveParent with no focused child"

    .line 126
    .line 127
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    return-object v3

    .line 131
    :cond_a
    :goto_2
    return-object v1
.end method

.method public static final u(Ld1/b0;I)Ld1/b;
    .locals 4

    .line 1
    iget-boolean v0, p0, Ld1/b0;->x:Z

    .line 2
    .line 3
    if-nez v0, :cond_3

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Ld1/b0;->x:Z

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    :try_start_0
    invoke-virtual {p0}, Ld1/b0;->m1()Ld1/t;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    new-instance v2, Ld1/a;

    .line 14
    .line 15
    invoke-direct {v2, p1}, Ld1/a;-><init>(I)V

    .line 16
    .line 17
    .line 18
    invoke-static {p0}, Lx1/k;->x(Lx1/i;)Lx1/r1;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    check-cast p1, Ly1/t;

    .line 23
    .line 24
    invoke-virtual {p1}, Ly1/t;->getFocusOwner()Ld1/l;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, Ld1/p;

    .line 29
    .line 30
    invoke-virtual {p1}, Ld1/p;->f()Ld1/b0;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    iget-object v1, v1, Ld1/t;->j:Lgg/m;

    .line 35
    .line 36
    invoke-interface {v1, v2}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Ld1/p;->f()Ld1/b0;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    iget-boolean v1, v2, Ld1/a;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    sget-object v2, Ld1/b;->h:Ld1/b;

    .line 46
    .line 47
    if-eqz v1, :cond_0

    .line 48
    .line 49
    :try_start_1
    sget-object p1, Ld1/v;->b:Ld1/v;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 50
    .line 51
    iput-boolean v0, p0, Ld1/b0;->x:Z

    .line 52
    .line 53
    return-object v2

    .line 54
    :catchall_0
    move-exception p1

    .line 55
    goto :goto_0

    .line 56
    :cond_0
    if-eq v3, p1, :cond_2

    .line 57
    .line 58
    if-eqz p1, :cond_2

    .line 59
    .line 60
    :try_start_2
    sget-object p1, Ld1/v;->d:Ld1/v;

    .line 61
    .line 62
    sget-object v1, Ld1/v;->c:Ld1/v;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 63
    .line 64
    if-ne p1, v1, :cond_1

    .line 65
    .line 66
    iput-boolean v0, p0, Ld1/b0;->x:Z

    .line 67
    .line 68
    return-object v2

    .line 69
    :cond_1
    :try_start_3
    sget-object p1, Ld1/b;->i:Ld1/b;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 70
    .line 71
    iput-boolean v0, p0, Ld1/b0;->x:Z

    .line 72
    .line 73
    return-object p1

    .line 74
    :cond_2
    iput-boolean v0, p0, Ld1/b0;->x:Z

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :goto_0
    iput-boolean v0, p0, Ld1/b0;->x:Z

    .line 78
    .line 79
    throw p1

    .line 80
    :cond_3
    :goto_1
    sget-object p0, Ld1/b;->g:Ld1/b;

    .line 81
    .line 82
    return-object p0
.end method

.method public static final v(Ld1/b0;I)Ld1/b;
    .locals 11

    .line 1
    invoke-virtual {p0}, Ld1/b0;->p1()Ld1/z;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    sget-object v1, Ld1/b;->g:Ld1/b;

    .line 10
    .line 11
    if-eqz v0, :cond_16

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    if-eq v0, v2, :cond_14

    .line 15
    .line 16
    const/4 v3, 0x2

    .line 17
    if-eq v0, v3, :cond_16

    .line 18
    .line 19
    const/4 v4, 0x3

    .line 20
    if-ne v0, v4, :cond_13

    .line 21
    .line 22
    iget-object v0, p0, Ly0/n;->g:Ly0/n;

    .line 23
    .line 24
    iget-boolean v0, v0, Ly0/n;->t:Z

    .line 25
    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    const-string v0, "visitAncestors called on an unattached node"

    .line 29
    .line 30
    invoke-static {v0}, Lu1/a;->b(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_0
    iget-object v0, p0, Ly0/n;->g:Ly0/n;

    .line 34
    .line 35
    iget-object v0, v0, Ly0/n;->k:Ly0/n;

    .line 36
    .line 37
    invoke-static {p0}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    :goto_0
    const/4 v5, 0x0

    .line 42
    if-eqz p0, :cond_b

    .line 43
    .line 44
    iget-object v6, p0, Lx1/f0;->L:Lx1/b1;

    .line 45
    .line 46
    iget-object v6, v6, Lx1/b1;->f:Ly0/n;

    .line 47
    .line 48
    iget v6, v6, Ly0/n;->j:I

    .line 49
    .line 50
    and-int/lit16 v6, v6, 0x400

    .line 51
    .line 52
    if-eqz v6, :cond_9

    .line 53
    .line 54
    :goto_1
    if-eqz v0, :cond_9

    .line 55
    .line 56
    iget v6, v0, Ly0/n;->i:I

    .line 57
    .line 58
    and-int/lit16 v6, v6, 0x400

    .line 59
    .line 60
    if-eqz v6, :cond_8

    .line 61
    .line 62
    move-object v6, v0

    .line 63
    move-object v7, v5

    .line 64
    :goto_2
    if-eqz v6, :cond_8

    .line 65
    .line 66
    instance-of v8, v6, Ld1/b0;

    .line 67
    .line 68
    if-eqz v8, :cond_1

    .line 69
    .line 70
    goto :goto_5

    .line 71
    :cond_1
    iget v8, v6, Ly0/n;->i:I

    .line 72
    .line 73
    and-int/lit16 v8, v8, 0x400

    .line 74
    .line 75
    if-eqz v8, :cond_7

    .line 76
    .line 77
    instance-of v8, v6, Lx1/j;

    .line 78
    .line 79
    if-eqz v8, :cond_7

    .line 80
    .line 81
    move-object v8, v6

    .line 82
    check-cast v8, Lx1/j;

    .line 83
    .line 84
    iget-object v8, v8, Lx1/j;->v:Ly0/n;

    .line 85
    .line 86
    const/4 v9, 0x0

    .line 87
    :goto_3
    if-eqz v8, :cond_6

    .line 88
    .line 89
    iget v10, v8, Ly0/n;->i:I

    .line 90
    .line 91
    and-int/lit16 v10, v10, 0x400

    .line 92
    .line 93
    if-eqz v10, :cond_5

    .line 94
    .line 95
    add-int/lit8 v9, v9, 0x1

    .line 96
    .line 97
    if-ne v9, v2, :cond_2

    .line 98
    .line 99
    move-object v6, v8

    .line 100
    goto :goto_4

    .line 101
    :cond_2
    if-nez v7, :cond_3

    .line 102
    .line 103
    new-instance v7, Lj0/b;

    .line 104
    .line 105
    const/16 v10, 0x10

    .line 106
    .line 107
    new-array v10, v10, [Ly0/n;

    .line 108
    .line 109
    invoke-direct {v7, v10}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    :cond_3
    if-eqz v6, :cond_4

    .line 113
    .line 114
    invoke-virtual {v7, v6}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    move-object v6, v5

    .line 118
    :cond_4
    invoke-virtual {v7, v8}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    :cond_5
    :goto_4
    iget-object v8, v8, Ly0/n;->l:Ly0/n;

    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_6
    if-ne v9, v2, :cond_7

    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_7
    invoke-static {v7}, Lx1/k;->e(Lj0/b;)Ly0/n;

    .line 128
    .line 129
    .line 130
    move-result-object v6

    .line 131
    goto :goto_2

    .line 132
    :cond_8
    iget-object v0, v0, Ly0/n;->k:Ly0/n;

    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_9
    invoke-virtual {p0}, Lx1/f0;->u()Lx1/f0;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    if-eqz p0, :cond_a

    .line 140
    .line 141
    iget-object v0, p0, Lx1/f0;->L:Lx1/b1;

    .line 142
    .line 143
    if-eqz v0, :cond_a

    .line 144
    .line 145
    iget-object v0, v0, Lx1/b1;->e:Lx1/b2;

    .line 146
    .line 147
    goto :goto_0

    .line 148
    :cond_a
    move-object v0, v5

    .line 149
    goto :goto_0

    .line 150
    :cond_b
    move-object v6, v5

    .line 151
    :goto_5
    check-cast v6, Ld1/b0;

    .line 152
    .line 153
    if-nez v6, :cond_c

    .line 154
    .line 155
    return-object v1

    .line 156
    :cond_c
    invoke-virtual {v6}, Ld1/b0;->p1()Ld1/z;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 161
    .line 162
    .line 163
    move-result p0

    .line 164
    if-eqz p0, :cond_12

    .line 165
    .line 166
    if-eq p0, v2, :cond_11

    .line 167
    .line 168
    if-eq p0, v3, :cond_10

    .line 169
    .line 170
    if-ne p0, v4, :cond_f

    .line 171
    .line 172
    invoke-static {v6, p1}, Ld1/d;->v(Ld1/b0;I)Ld1/b;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    if-ne p0, v1, :cond_d

    .line 177
    .line 178
    goto :goto_6

    .line 179
    :cond_d
    move-object v5, p0

    .line 180
    :goto_6
    if-nez v5, :cond_e

    .line 181
    .line 182
    invoke-static {v6, p1}, Ld1/d;->u(Ld1/b0;I)Ld1/b;

    .line 183
    .line 184
    .line 185
    move-result-object p0

    .line 186
    return-object p0

    .line 187
    :cond_e
    return-object v5

    .line 188
    :cond_f
    invoke-static {}, Lokio/a;->k()V

    .line 189
    .line 190
    .line 191
    :goto_7
    const/4 p0, 0x0

    .line 192
    return-object p0

    .line 193
    :cond_10
    sget-object p0, Ld1/b;->h:Ld1/b;

    .line 194
    .line 195
    return-object p0

    .line 196
    :cond_11
    invoke-static {v6, p1}, Ld1/d;->v(Ld1/b0;I)Ld1/b;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    return-object p0

    .line 201
    :cond_12
    invoke-static {v6, p1}, Ld1/d;->u(Ld1/b0;I)Ld1/b;

    .line 202
    .line 203
    .line 204
    move-result-object p0

    .line 205
    return-object p0

    .line 206
    :cond_13
    invoke-static {}, Lokio/a;->k()V

    .line 207
    .line 208
    .line 209
    goto :goto_7

    .line 210
    :cond_14
    invoke-static {p0}, Ld1/d;->n(Ld1/b0;)Ld1/b0;

    .line 211
    .line 212
    .line 213
    move-result-object p0

    .line 214
    if-eqz p0, :cond_15

    .line 215
    .line 216
    invoke-static {p0, p1}, Ld1/d;->t(Ld1/b0;I)Ld1/b;

    .line 217
    .line 218
    .line 219
    move-result-object p0

    .line 220
    return-object p0

    .line 221
    :cond_15
    const-string p0, "ActiveParent with no focused child"

    .line 222
    .line 223
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    goto :goto_7

    .line 227
    :cond_16
    return-object v1
.end method

.method public static final w(Ld1/b0;)Z
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static {v0}, Lx1/k;->x(Lx1/i;)Lx1/r1;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Ly1/t;

    .line 8
    .line 9
    invoke-virtual {v1}, Ly1/t;->getFocusOwner()Ld1/l;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Ld1/p;

    .line 14
    .line 15
    invoke-virtual {v1}, Ld1/p;->f()Ld1/b0;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v0}, Ld1/b0;->p1()Ld1/z;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    const/4 v4, 0x1

    .line 24
    if-ne v2, v0, :cond_0

    .line 25
    .line 26
    invoke-virtual {v0, v3, v3}, Ld1/b0;->l1(Ld1/z;Ld1/z;)V

    .line 27
    .line 28
    .line 29
    return v4

    .line 30
    :cond_0
    if-eqz v2, :cond_1

    .line 31
    .line 32
    iget-boolean v6, v2, Ld1/b0;->u:Z

    .line 33
    .line 34
    if-nez v6, :cond_1

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    iget-boolean v6, v0, Ld1/b0;->u:Z

    .line 38
    .line 39
    if-nez v6, :cond_2

    .line 40
    .line 41
    invoke-static {v0}, Lx1/k;->x(Lx1/i;)Lx1/r1;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    check-cast v6, Ly1/t;

    .line 46
    .line 47
    invoke-virtual {v6}, Ly1/t;->getFocusOwner()Ld1/l;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    check-cast v6, Ld1/p;

    .line 52
    .line 53
    iget-object v6, v6, Ld1/p;->a:Ly1/t;

    .line 54
    .line 55
    invoke-virtual {v6}, Ly1/t;->H()Z

    .line 56
    .line 57
    .line 58
    move-result v6

    .line 59
    if-nez v6, :cond_2

    .line 60
    .line 61
    :goto_0
    const/16 v19, 0x0

    .line 62
    .line 63
    goto/16 :goto_19

    .line 64
    .line 65
    :cond_2
    :goto_1
    const-string v6, "visitAncestors called on an unattached node"

    .line 66
    .line 67
    const/16 v7, 0x10

    .line 68
    .line 69
    if-eqz v2, :cond_e

    .line 70
    .line 71
    new-instance v9, Lj0/b;

    .line 72
    .line 73
    new-array v10, v7, [Ld1/b0;

    .line 74
    .line 75
    invoke-direct {v9, v10}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    iget-object v10, v2, Ly0/n;->g:Ly0/n;

    .line 79
    .line 80
    iget-boolean v10, v10, Ly0/n;->t:Z

    .line 81
    .line 82
    if-nez v10, :cond_3

    .line 83
    .line 84
    invoke-static {v6}, Lu1/a;->b(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    :cond_3
    iget-object v10, v2, Ly0/n;->g:Ly0/n;

    .line 88
    .line 89
    iget-object v10, v10, Ly0/n;->k:Ly0/n;

    .line 90
    .line 91
    invoke-static {v2}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 92
    .line 93
    .line 94
    move-result-object v11

    .line 95
    :goto_2
    if-eqz v11, :cond_f

    .line 96
    .line 97
    iget-object v12, v11, Lx1/f0;->L:Lx1/b1;

    .line 98
    .line 99
    iget-object v12, v12, Lx1/b1;->f:Ly0/n;

    .line 100
    .line 101
    iget v12, v12, Ly0/n;->j:I

    .line 102
    .line 103
    and-int/lit16 v12, v12, 0x400

    .line 104
    .line 105
    if-eqz v12, :cond_c

    .line 106
    .line 107
    :goto_3
    if-eqz v10, :cond_c

    .line 108
    .line 109
    iget v12, v10, Ly0/n;->i:I

    .line 110
    .line 111
    and-int/lit16 v12, v12, 0x400

    .line 112
    .line 113
    if-eqz v12, :cond_b

    .line 114
    .line 115
    move-object v12, v10

    .line 116
    const/4 v13, 0x0

    .line 117
    :goto_4
    if-eqz v12, :cond_b

    .line 118
    .line 119
    instance-of v14, v12, Ld1/b0;

    .line 120
    .line 121
    if-eqz v14, :cond_4

    .line 122
    .line 123
    check-cast v12, Ld1/b0;

    .line 124
    .line 125
    invoke-virtual {v9, v12}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    goto :goto_7

    .line 129
    :cond_4
    iget v14, v12, Ly0/n;->i:I

    .line 130
    .line 131
    and-int/lit16 v14, v14, 0x400

    .line 132
    .line 133
    if-eqz v14, :cond_a

    .line 134
    .line 135
    instance-of v14, v12, Lx1/j;

    .line 136
    .line 137
    if-eqz v14, :cond_a

    .line 138
    .line 139
    move-object v14, v12

    .line 140
    check-cast v14, Lx1/j;

    .line 141
    .line 142
    iget-object v14, v14, Lx1/j;->v:Ly0/n;

    .line 143
    .line 144
    const/4 v15, 0x0

    .line 145
    :goto_5
    if-eqz v14, :cond_9

    .line 146
    .line 147
    iget v8, v14, Ly0/n;->i:I

    .line 148
    .line 149
    and-int/lit16 v8, v8, 0x400

    .line 150
    .line 151
    if-eqz v8, :cond_8

    .line 152
    .line 153
    add-int/lit8 v15, v15, 0x1

    .line 154
    .line 155
    if-ne v15, v4, :cond_5

    .line 156
    .line 157
    move-object v12, v14

    .line 158
    goto :goto_6

    .line 159
    :cond_5
    if-nez v13, :cond_6

    .line 160
    .line 161
    new-instance v13, Lj0/b;

    .line 162
    .line 163
    new-array v8, v7, [Ly0/n;

    .line 164
    .line 165
    invoke-direct {v13, v8}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    :cond_6
    if-eqz v12, :cond_7

    .line 169
    .line 170
    invoke-virtual {v13, v12}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    const/4 v12, 0x0

    .line 174
    :cond_7
    invoke-virtual {v13, v14}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    :cond_8
    :goto_6
    iget-object v14, v14, Ly0/n;->l:Ly0/n;

    .line 178
    .line 179
    goto :goto_5

    .line 180
    :cond_9
    if-ne v15, v4, :cond_a

    .line 181
    .line 182
    goto :goto_4

    .line 183
    :cond_a
    :goto_7
    invoke-static {v13}, Lx1/k;->e(Lj0/b;)Ly0/n;

    .line 184
    .line 185
    .line 186
    move-result-object v12

    .line 187
    goto :goto_4

    .line 188
    :cond_b
    iget-object v10, v10, Ly0/n;->k:Ly0/n;

    .line 189
    .line 190
    goto :goto_3

    .line 191
    :cond_c
    invoke-virtual {v11}, Lx1/f0;->u()Lx1/f0;

    .line 192
    .line 193
    .line 194
    move-result-object v11

    .line 195
    if-eqz v11, :cond_d

    .line 196
    .line 197
    iget-object v8, v11, Lx1/f0;->L:Lx1/b1;

    .line 198
    .line 199
    if-eqz v8, :cond_d

    .line 200
    .line 201
    iget-object v8, v8, Lx1/b1;->e:Lx1/b2;

    .line 202
    .line 203
    move-object v10, v8

    .line 204
    goto :goto_2

    .line 205
    :cond_d
    const/4 v10, 0x0

    .line 206
    goto :goto_2

    .line 207
    :cond_e
    const/4 v9, 0x0

    .line 208
    :cond_f
    new-array v8, v7, [Ld1/b0;

    .line 209
    .line 210
    new-array v10, v7, [Ld1/b0;

    .line 211
    .line 212
    iget-object v11, v0, Ly0/n;->g:Ly0/n;

    .line 213
    .line 214
    iget-boolean v11, v11, Ly0/n;->t:Z

    .line 215
    .line 216
    if-nez v11, :cond_10

    .line 217
    .line 218
    invoke-static {v6}, Lu1/a;->b(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    :cond_10
    iget-object v6, v0, Ly0/n;->g:Ly0/n;

    .line 222
    .line 223
    iget-object v6, v6, Ly0/n;->k:Ly0/n;

    .line 224
    .line 225
    invoke-static {v0}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 226
    .line 227
    .line 228
    move-result-object v11

    .line 229
    move v12, v4

    .line 230
    const/4 v13, 0x0

    .line 231
    const/4 v14, 0x0

    .line 232
    :goto_8
    if-eqz v11, :cond_21

    .line 233
    .line 234
    iget-object v15, v11, Lx1/f0;->L:Lx1/b1;

    .line 235
    .line 236
    iget-object v15, v15, Lx1/b1;->f:Ly0/n;

    .line 237
    .line 238
    iget v15, v15, Ly0/n;->j:I

    .line 239
    .line 240
    and-int/lit16 v15, v15, 0x400

    .line 241
    .line 242
    if-eqz v15, :cond_1f

    .line 243
    .line 244
    :goto_9
    if-eqz v6, :cond_1f

    .line 245
    .line 246
    iget v15, v6, Ly0/n;->i:I

    .line 247
    .line 248
    and-int/lit16 v15, v15, 0x400

    .line 249
    .line 250
    if-eqz v15, :cond_1e

    .line 251
    .line 252
    move-object v15, v6

    .line 253
    const/16 v16, 0x0

    .line 254
    .line 255
    :goto_a
    if-eqz v15, :cond_1e

    .line 256
    .line 257
    instance-of v7, v15, Ld1/b0;

    .line 258
    .line 259
    if-eqz v7, :cond_16

    .line 260
    .line 261
    move-object v7, v15

    .line 262
    check-cast v7, Ld1/b0;

    .line 263
    .line 264
    if-eqz v9, :cond_11

    .line 265
    .line 266
    invoke-virtual {v9, v7}, Lj0/b;->j(Ljava/lang/Object;)Z

    .line 267
    .line 268
    .line 269
    move-result v18

    .line 270
    invoke-static/range {v18 .. v18}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 271
    .line 272
    .line 273
    move-result-object v18

    .line 274
    move-object/from16 v4, v18

    .line 275
    .line 276
    goto :goto_b

    .line 277
    :cond_11
    const/4 v4, 0x0

    .line 278
    :goto_b
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 279
    .line 280
    invoke-static {v4, v5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    move-result v4

    .line 284
    if-eqz v4, :cond_13

    .line 285
    .line 286
    add-int/lit8 v4, v13, 0x1

    .line 287
    .line 288
    array-length v5, v8

    .line 289
    if-ge v5, v4, :cond_12

    .line 290
    .line 291
    array-length v5, v8

    .line 292
    move-object/from16 v20, v1

    .line 293
    .line 294
    mul-int/lit8 v1, v5, 0x2

    .line 295
    .line 296
    invoke-static {v4, v1}, Ljava/lang/Math;->max(II)I

    .line 297
    .line 298
    .line 299
    move-result v1

    .line 300
    new-array v1, v1, [Ljava/lang/Object;

    .line 301
    .line 302
    move/from16 v21, v4

    .line 303
    .line 304
    const/4 v4, 0x0

    .line 305
    invoke-static {v8, v4, v1, v4, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 306
    .line 307
    .line 308
    move-object v8, v1

    .line 309
    goto :goto_c

    .line 310
    :cond_12
    move-object/from16 v20, v1

    .line 311
    .line 312
    move/from16 v21, v4

    .line 313
    .line 314
    :goto_c
    aput-object v7, v8, v13

    .line 315
    .line 316
    move/from16 v13, v21

    .line 317
    .line 318
    goto :goto_e

    .line 319
    :cond_13
    move-object/from16 v20, v1

    .line 320
    .line 321
    add-int/lit8 v1, v14, 0x1

    .line 322
    .line 323
    array-length v4, v10

    .line 324
    if-ge v4, v1, :cond_14

    .line 325
    .line 326
    array-length v4, v10

    .line 327
    mul-int/lit8 v5, v4, 0x2

    .line 328
    .line 329
    invoke-static {v1, v5}, Ljava/lang/Math;->max(II)I

    .line 330
    .line 331
    .line 332
    move-result v5

    .line 333
    new-array v5, v5, [Ljava/lang/Object;

    .line 334
    .line 335
    move/from16 v21, v1

    .line 336
    .line 337
    const/4 v1, 0x0

    .line 338
    invoke-static {v10, v1, v5, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 339
    .line 340
    .line 341
    move-object v10, v5

    .line 342
    goto :goto_d

    .line 343
    :cond_14
    move/from16 v21, v1

    .line 344
    .line 345
    :goto_d
    aput-object v7, v10, v14

    .line 346
    .line 347
    move/from16 v14, v21

    .line 348
    .line 349
    :goto_e
    if-ne v7, v2, :cond_15

    .line 350
    .line 351
    const/4 v12, 0x0

    .line 352
    :cond_15
    const/4 v1, 0x0

    .line 353
    goto :goto_f

    .line 354
    :cond_16
    move-object/from16 v20, v1

    .line 355
    .line 356
    const/4 v1, 0x1

    .line 357
    :goto_f
    if-eqz v1, :cond_1c

    .line 358
    .line 359
    iget v1, v15, Ly0/n;->i:I

    .line 360
    .line 361
    and-int/lit16 v1, v1, 0x400

    .line 362
    .line 363
    if-eqz v1, :cond_1c

    .line 364
    .line 365
    instance-of v1, v15, Lx1/j;

    .line 366
    .line 367
    if-eqz v1, :cond_1c

    .line 368
    .line 369
    move-object v1, v15

    .line 370
    check-cast v1, Lx1/j;

    .line 371
    .line 372
    iget-object v1, v1, Lx1/j;->v:Ly0/n;

    .line 373
    .line 374
    const/4 v4, 0x0

    .line 375
    :goto_10
    if-eqz v1, :cond_1b

    .line 376
    .line 377
    iget v5, v1, Ly0/n;->i:I

    .line 378
    .line 379
    and-int/lit16 v5, v5, 0x400

    .line 380
    .line 381
    if-eqz v5, :cond_1a

    .line 382
    .line 383
    add-int/lit8 v4, v4, 0x1

    .line 384
    .line 385
    const/4 v5, 0x1

    .line 386
    if-ne v4, v5, :cond_17

    .line 387
    .line 388
    move-object v15, v1

    .line 389
    move/from16 v17, v4

    .line 390
    .line 391
    const/16 v7, 0x10

    .line 392
    .line 393
    goto :goto_12

    .line 394
    :cond_17
    if-nez v16, :cond_18

    .line 395
    .line 396
    new-instance v5, Lj0/b;

    .line 397
    .line 398
    move/from16 v17, v4

    .line 399
    .line 400
    const/16 v7, 0x10

    .line 401
    .line 402
    new-array v4, v7, [Ly0/n;

    .line 403
    .line 404
    invoke-direct {v5, v4}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 405
    .line 406
    .line 407
    goto :goto_11

    .line 408
    :cond_18
    move/from16 v17, v4

    .line 409
    .line 410
    const/16 v7, 0x10

    .line 411
    .line 412
    move-object/from16 v5, v16

    .line 413
    .line 414
    :goto_11
    if-eqz v15, :cond_19

    .line 415
    .line 416
    invoke-virtual {v5, v15}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 417
    .line 418
    .line 419
    const/4 v15, 0x0

    .line 420
    :cond_19
    invoke-virtual {v5, v1}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 421
    .line 422
    .line 423
    move-object/from16 v16, v5

    .line 424
    .line 425
    :goto_12
    move/from16 v4, v17

    .line 426
    .line 427
    goto :goto_13

    .line 428
    :cond_1a
    const/16 v7, 0x10

    .line 429
    .line 430
    :goto_13
    iget-object v1, v1, Ly0/n;->l:Ly0/n;

    .line 431
    .line 432
    goto :goto_10

    .line 433
    :cond_1b
    const/4 v5, 0x1

    .line 434
    const/16 v7, 0x10

    .line 435
    .line 436
    if-ne v4, v5, :cond_1d

    .line 437
    .line 438
    move v4, v5

    .line 439
    move-object/from16 v1, v20

    .line 440
    .line 441
    goto/16 :goto_a

    .line 442
    .line 443
    :cond_1c
    const/16 v7, 0x10

    .line 444
    .line 445
    :cond_1d
    invoke-static/range {v16 .. v16}, Lx1/k;->e(Lj0/b;)Ly0/n;

    .line 446
    .line 447
    .line 448
    move-result-object v15

    .line 449
    move-object/from16 v1, v20

    .line 450
    .line 451
    const/4 v4, 0x1

    .line 452
    goto/16 :goto_a

    .line 453
    .line 454
    :cond_1e
    move-object/from16 v20, v1

    .line 455
    .line 456
    iget-object v6, v6, Ly0/n;->k:Ly0/n;

    .line 457
    .line 458
    move-object/from16 v1, v20

    .line 459
    .line 460
    const/4 v4, 0x1

    .line 461
    goto/16 :goto_9

    .line 462
    .line 463
    :cond_1f
    move-object/from16 v20, v1

    .line 464
    .line 465
    invoke-virtual {v11}, Lx1/f0;->u()Lx1/f0;

    .line 466
    .line 467
    .line 468
    move-result-object v11

    .line 469
    if-eqz v11, :cond_20

    .line 470
    .line 471
    iget-object v1, v11, Lx1/f0;->L:Lx1/b1;

    .line 472
    .line 473
    if-eqz v1, :cond_20

    .line 474
    .line 475
    iget-object v1, v1, Lx1/b1;->e:Lx1/b2;

    .line 476
    .line 477
    move-object v6, v1

    .line 478
    goto :goto_14

    .line 479
    :cond_20
    const/4 v6, 0x0

    .line 480
    :goto_14
    move-object/from16 v1, v20

    .line 481
    .line 482
    const/4 v4, 0x1

    .line 483
    goto/16 :goto_8

    .line 484
    .line 485
    :cond_21
    move-object/from16 v20, v1

    .line 486
    .line 487
    if-eqz v12, :cond_22

    .line 488
    .line 489
    if-eqz v2, :cond_22

    .line 490
    .line 491
    const/4 v1, 0x0

    .line 492
    invoke-static {v2, v1}, Ld1/d;->d(Ld1/b0;Z)Z

    .line 493
    .line 494
    .line 495
    move-result v4

    .line 496
    if-nez v4, :cond_22

    .line 497
    .line 498
    goto/16 :goto_0

    .line 499
    .line 500
    :cond_22
    new-instance v1, Ld1/c0;

    .line 501
    .line 502
    const/4 v4, 0x0

    .line 503
    invoke-direct {v1, v0, v4}, Ld1/c0;-><init>(Ljava/lang/Object;I)V

    .line 504
    .line 505
    .line 506
    invoke-static {v0, v1}, Lx1/k;->r(Ly0/n;Lfg/a;)V

    .line 507
    .line 508
    .line 509
    invoke-virtual {v0}, Ld1/b0;->p1()Ld1/z;

    .line 510
    .line 511
    .line 512
    move-result-object v1

    .line 513
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 514
    .line 515
    .line 516
    move-result v1

    .line 517
    if-eqz v1, :cond_25

    .line 518
    .line 519
    const/4 v5, 0x1

    .line 520
    if-eq v1, v5, :cond_24

    .line 521
    .line 522
    const/4 v4, 0x2

    .line 523
    if-eq v1, v4, :cond_25

    .line 524
    .line 525
    const/4 v4, 0x3

    .line 526
    if-ne v1, v4, :cond_23

    .line 527
    .line 528
    goto :goto_15

    .line 529
    :cond_23
    invoke-static {}, Lokio/a;->k()V

    .line 530
    .line 531
    .line 532
    const/4 v0, 0x0

    .line 533
    return v0

    .line 534
    :cond_24
    :goto_15
    invoke-static {v0}, Lx1/k;->x(Lx1/i;)Lx1/r1;

    .line 535
    .line 536
    .line 537
    move-result-object v1

    .line 538
    check-cast v1, Ly1/t;

    .line 539
    .line 540
    invoke-virtual {v1}, Ly1/t;->getFocusOwner()Ld1/l;

    .line 541
    .line 542
    .line 543
    move-result-object v1

    .line 544
    check-cast v1, Ld1/p;

    .line 545
    .line 546
    invoke-virtual {v1, v0}, Ld1/p;->i(Ld1/b0;)V

    .line 547
    .line 548
    .line 549
    :cond_25
    sget-object v1, Ld1/z;->i:Ld1/z;

    .line 550
    .line 551
    sget-object v4, Ld1/z;->g:Ld1/z;

    .line 552
    .line 553
    if-eqz v12, :cond_26

    .line 554
    .line 555
    if-eqz v2, :cond_26

    .line 556
    .line 557
    invoke-virtual {v2, v4, v1}, Ld1/b0;->l1(Ld1/z;Ld1/z;)V

    .line 558
    .line 559
    .line 560
    :cond_26
    sget-object v5, Ld1/z;->h:Ld1/z;

    .line 561
    .line 562
    if-eqz v9, :cond_28

    .line 563
    .line 564
    iget v6, v9, Lj0/b;->i:I

    .line 565
    .line 566
    const/16 v18, 0x1

    .line 567
    .line 568
    add-int/lit8 v6, v6, -0x1

    .line 569
    .line 570
    iget-object v7, v9, Lj0/b;->g:[Ljava/lang/Object;

    .line 571
    .line 572
    array-length v8, v7

    .line 573
    if-ge v6, v8, :cond_28

    .line 574
    .line 575
    :goto_16
    if-ltz v6, :cond_28

    .line 576
    .line 577
    aget-object v8, v7, v6

    .line 578
    .line 579
    check-cast v8, Ld1/b0;

    .line 580
    .line 581
    invoke-virtual/range {v20 .. v20}, Ld1/p;->f()Ld1/b0;

    .line 582
    .line 583
    .line 584
    move-result-object v9

    .line 585
    if-eq v9, v0, :cond_27

    .line 586
    .line 587
    goto/16 :goto_0

    .line 588
    .line 589
    :cond_27
    invoke-virtual {v8, v5, v1}, Ld1/b0;->l1(Ld1/z;Ld1/z;)V

    .line 590
    .line 591
    .line 592
    add-int/lit8 v6, v6, -0x1

    .line 593
    .line 594
    goto :goto_16

    .line 595
    :cond_28
    const/16 v18, 0x1

    .line 596
    .line 597
    add-int/lit8 v14, v14, -0x1

    .line 598
    .line 599
    array-length v6, v10

    .line 600
    if-ge v14, v6, :cond_2b

    .line 601
    .line 602
    :goto_17
    if-ltz v14, :cond_2b

    .line 603
    .line 604
    aget-object v6, v10, v14

    .line 605
    .line 606
    check-cast v6, Ld1/b0;

    .line 607
    .line 608
    invoke-virtual/range {v20 .. v20}, Ld1/p;->f()Ld1/b0;

    .line 609
    .line 610
    .line 611
    move-result-object v7

    .line 612
    if-eq v7, v0, :cond_29

    .line 613
    .line 614
    goto/16 :goto_0

    .line 615
    .line 616
    :cond_29
    if-ne v6, v2, :cond_2a

    .line 617
    .line 618
    move-object v7, v4

    .line 619
    goto :goto_18

    .line 620
    :cond_2a
    move-object v7, v1

    .line 621
    :goto_18
    invoke-virtual {v6, v7, v5}, Ld1/b0;->l1(Ld1/z;Ld1/z;)V

    .line 622
    .line 623
    .line 624
    add-int/lit8 v14, v14, -0x1

    .line 625
    .line 626
    goto :goto_17

    .line 627
    :cond_2b
    invoke-virtual/range {v20 .. v20}, Ld1/p;->f()Ld1/b0;

    .line 628
    .line 629
    .line 630
    move-result-object v1

    .line 631
    if-eq v1, v0, :cond_2c

    .line 632
    .line 633
    goto/16 :goto_0

    .line 634
    .line 635
    :cond_2c
    invoke-virtual {v0, v3, v4}, Ld1/b0;->l1(Ld1/z;Ld1/z;)V

    .line 636
    .line 637
    .line 638
    invoke-virtual/range {v20 .. v20}, Ld1/p;->f()Ld1/b0;

    .line 639
    .line 640
    .line 641
    move-result-object v1

    .line 642
    if-eq v1, v0, :cond_2d

    .line 643
    .line 644
    goto/16 :goto_0

    .line 645
    .line 646
    :goto_19
    return v19

    .line 647
    :cond_2d
    const/16 v18, 0x1

    .line 648
    .line 649
    return v18
.end method

.method public static final x(Ld1/b0;Lb1/g;)Z
    .locals 11

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    new-array v1, v0, [Ld1/b0;

    .line 4
    .line 5
    iget-object v2, p0, Ly0/n;->g:Ly0/n;

    .line 6
    .line 7
    iget-boolean v2, v2, Ly0/n;->t:Z

    .line 8
    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    const-string v2, "visitChildren called on an unattached node"

    .line 12
    .line 13
    invoke-static {v2}, Lu1/a;->b(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    new-instance v2, Lj0/b;

    .line 17
    .line 18
    new-array v3, v0, [Ly0/n;

    .line 19
    .line 20
    invoke-direct {v2, v3}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iget-object p0, p0, Ly0/n;->g:Ly0/n;

    .line 24
    .line 25
    iget-object v3, p0, Ly0/n;->l:Ly0/n;

    .line 26
    .line 27
    const/4 v4, 0x0

    .line 28
    if-nez v3, :cond_1

    .line 29
    .line 30
    invoke-static {v2, p0}, Lx1/k;->b(Lj0/b;Ly0/n;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    move p0, v4

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    invoke-virtual {v2, v3}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    :goto_1
    iget v3, v2, Lj0/b;->i:I

    .line 40
    .line 41
    const/4 v5, 0x1

    .line 42
    if-eqz v3, :cond_d

    .line 43
    .line 44
    add-int/lit8 v3, v3, -0x1

    .line 45
    .line 46
    invoke-virtual {v2, v3}, Lj0/b;->k(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    check-cast v3, Ly0/n;

    .line 51
    .line 52
    iget v6, v3, Ly0/n;->j:I

    .line 53
    .line 54
    and-int/lit16 v6, v6, 0x400

    .line 55
    .line 56
    if-nez v6, :cond_3

    .line 57
    .line 58
    invoke-static {v2, v3}, Lx1/k;->b(Lj0/b;Ly0/n;)V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_3
    :goto_2
    if-eqz v3, :cond_2

    .line 63
    .line 64
    iget v6, v3, Ly0/n;->i:I

    .line 65
    .line 66
    and-int/lit16 v6, v6, 0x400

    .line 67
    .line 68
    if-eqz v6, :cond_c

    .line 69
    .line 70
    const/4 v6, 0x0

    .line 71
    move-object v7, v6

    .line 72
    :goto_3
    if-eqz v3, :cond_2

    .line 73
    .line 74
    instance-of v8, v3, Ld1/b0;

    .line 75
    .line 76
    if-eqz v8, :cond_5

    .line 77
    .line 78
    check-cast v3, Ld1/b0;

    .line 79
    .line 80
    add-int/lit8 v8, p0, 0x1

    .line 81
    .line 82
    array-length v9, v1

    .line 83
    if-ge v9, v8, :cond_4

    .line 84
    .line 85
    array-length v9, v1

    .line 86
    mul-int/lit8 v10, v9, 0x2

    .line 87
    .line 88
    invoke-static {v8, v10}, Ljava/lang/Math;->max(II)I

    .line 89
    .line 90
    .line 91
    move-result v10

    .line 92
    new-array v10, v10, [Ljava/lang/Object;

    .line 93
    .line 94
    invoke-static {v1, v4, v10, v4, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 95
    .line 96
    .line 97
    move-object v1, v10

    .line 98
    :cond_4
    aput-object v3, v1, p0

    .line 99
    .line 100
    move p0, v8

    .line 101
    goto :goto_6

    .line 102
    :cond_5
    iget v8, v3, Ly0/n;->i:I

    .line 103
    .line 104
    and-int/lit16 v8, v8, 0x400

    .line 105
    .line 106
    if-eqz v8, :cond_b

    .line 107
    .line 108
    instance-of v8, v3, Lx1/j;

    .line 109
    .line 110
    if-eqz v8, :cond_b

    .line 111
    .line 112
    move-object v8, v3

    .line 113
    check-cast v8, Lx1/j;

    .line 114
    .line 115
    iget-object v8, v8, Lx1/j;->v:Ly0/n;

    .line 116
    .line 117
    move v9, v4

    .line 118
    :goto_4
    if-eqz v8, :cond_a

    .line 119
    .line 120
    iget v10, v8, Ly0/n;->i:I

    .line 121
    .line 122
    and-int/lit16 v10, v10, 0x400

    .line 123
    .line 124
    if-eqz v10, :cond_9

    .line 125
    .line 126
    add-int/lit8 v9, v9, 0x1

    .line 127
    .line 128
    if-ne v9, v5, :cond_6

    .line 129
    .line 130
    move-object v3, v8

    .line 131
    goto :goto_5

    .line 132
    :cond_6
    if-nez v7, :cond_7

    .line 133
    .line 134
    new-instance v7, Lj0/b;

    .line 135
    .line 136
    new-array v10, v0, [Ly0/n;

    .line 137
    .line 138
    invoke-direct {v7, v10}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    :cond_7
    if-eqz v3, :cond_8

    .line 142
    .line 143
    invoke-virtual {v7, v3}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    move-object v3, v6

    .line 147
    :cond_8
    invoke-virtual {v7, v8}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    :cond_9
    :goto_5
    iget-object v8, v8, Ly0/n;->l:Ly0/n;

    .line 151
    .line 152
    goto :goto_4

    .line 153
    :cond_a
    if-ne v9, v5, :cond_b

    .line 154
    .line 155
    goto :goto_3

    .line 156
    :cond_b
    :goto_6
    invoke-static {v7}, Lx1/k;->e(Lj0/b;)Ly0/n;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    goto :goto_3

    .line 161
    :cond_c
    iget-object v3, v3, Ly0/n;->l:Ly0/n;

    .line 162
    .line 163
    goto :goto_2

    .line 164
    :cond_d
    sget-object v0, Ld1/d0;->g:Ld1/d0;

    .line 165
    .line 166
    invoke-static {v1, v4, p0, v0}, Ljava/util/Arrays;->sort([Ljava/lang/Object;IILjava/util/Comparator;)V

    .line 167
    .line 168
    .line 169
    sub-int/2addr p0, v5

    .line 170
    array-length v0, v1

    .line 171
    if-ge p0, v0, :cond_f

    .line 172
    .line 173
    :goto_7
    if-ltz p0, :cond_f

    .line 174
    .line 175
    aget-object v0, v1, p0

    .line 176
    .line 177
    check-cast v0, Ld1/b0;

    .line 178
    .line 179
    invoke-static {v0}, Ld1/d;->r(Ld1/b0;)Z

    .line 180
    .line 181
    .line 182
    move-result v2

    .line 183
    if-eqz v2, :cond_e

    .line 184
    .line 185
    invoke-static {v0, p1}, Ld1/d;->a(Ld1/b0;Lb1/g;)Z

    .line 186
    .line 187
    .line 188
    move-result v0

    .line 189
    if-eqz v0, :cond_e

    .line 190
    .line 191
    return v5

    .line 192
    :cond_e
    add-int/lit8 p0, p0, -0x1

    .line 193
    .line 194
    goto :goto_7

    .line 195
    :cond_f
    return v4
.end method

.method public static final y(Ld1/b0;Lb1/g;)Z
    .locals 11

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    new-array v1, v0, [Ld1/b0;

    .line 4
    .line 5
    iget-object v2, p0, Ly0/n;->g:Ly0/n;

    .line 6
    .line 7
    iget-boolean v2, v2, Ly0/n;->t:Z

    .line 8
    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    const-string v2, "visitChildren called on an unattached node"

    .line 12
    .line 13
    invoke-static {v2}, Lu1/a;->b(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    new-instance v2, Lj0/b;

    .line 17
    .line 18
    new-array v3, v0, [Ly0/n;

    .line 19
    .line 20
    invoke-direct {v2, v3}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iget-object p0, p0, Ly0/n;->g:Ly0/n;

    .line 24
    .line 25
    iget-object v3, p0, Ly0/n;->l:Ly0/n;

    .line 26
    .line 27
    const/4 v4, 0x0

    .line 28
    if-nez v3, :cond_1

    .line 29
    .line 30
    invoke-static {v2, p0}, Lx1/k;->b(Lj0/b;Ly0/n;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    move p0, v4

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    invoke-virtual {v2, v3}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    :goto_1
    iget v3, v2, Lj0/b;->i:I

    .line 40
    .line 41
    const/4 v5, 0x1

    .line 42
    if-eqz v3, :cond_d

    .line 43
    .line 44
    add-int/lit8 v3, v3, -0x1

    .line 45
    .line 46
    invoke-virtual {v2, v3}, Lj0/b;->k(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    check-cast v3, Ly0/n;

    .line 51
    .line 52
    iget v6, v3, Ly0/n;->j:I

    .line 53
    .line 54
    and-int/lit16 v6, v6, 0x400

    .line 55
    .line 56
    if-nez v6, :cond_3

    .line 57
    .line 58
    invoke-static {v2, v3}, Lx1/k;->b(Lj0/b;Ly0/n;)V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_3
    :goto_2
    if-eqz v3, :cond_2

    .line 63
    .line 64
    iget v6, v3, Ly0/n;->i:I

    .line 65
    .line 66
    and-int/lit16 v6, v6, 0x400

    .line 67
    .line 68
    if-eqz v6, :cond_c

    .line 69
    .line 70
    const/4 v6, 0x0

    .line 71
    move-object v7, v6

    .line 72
    :goto_3
    if-eqz v3, :cond_2

    .line 73
    .line 74
    instance-of v8, v3, Ld1/b0;

    .line 75
    .line 76
    if-eqz v8, :cond_5

    .line 77
    .line 78
    check-cast v3, Ld1/b0;

    .line 79
    .line 80
    add-int/lit8 v8, p0, 0x1

    .line 81
    .line 82
    array-length v9, v1

    .line 83
    if-ge v9, v8, :cond_4

    .line 84
    .line 85
    array-length v9, v1

    .line 86
    mul-int/lit8 v10, v9, 0x2

    .line 87
    .line 88
    invoke-static {v8, v10}, Ljava/lang/Math;->max(II)I

    .line 89
    .line 90
    .line 91
    move-result v10

    .line 92
    new-array v10, v10, [Ljava/lang/Object;

    .line 93
    .line 94
    invoke-static {v1, v4, v10, v4, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 95
    .line 96
    .line 97
    move-object v1, v10

    .line 98
    :cond_4
    aput-object v3, v1, p0

    .line 99
    .line 100
    move p0, v8

    .line 101
    goto :goto_6

    .line 102
    :cond_5
    iget v8, v3, Ly0/n;->i:I

    .line 103
    .line 104
    and-int/lit16 v8, v8, 0x400

    .line 105
    .line 106
    if-eqz v8, :cond_b

    .line 107
    .line 108
    instance-of v8, v3, Lx1/j;

    .line 109
    .line 110
    if-eqz v8, :cond_b

    .line 111
    .line 112
    move-object v8, v3

    .line 113
    check-cast v8, Lx1/j;

    .line 114
    .line 115
    iget-object v8, v8, Lx1/j;->v:Ly0/n;

    .line 116
    .line 117
    move v9, v4

    .line 118
    :goto_4
    if-eqz v8, :cond_a

    .line 119
    .line 120
    iget v10, v8, Ly0/n;->i:I

    .line 121
    .line 122
    and-int/lit16 v10, v10, 0x400

    .line 123
    .line 124
    if-eqz v10, :cond_9

    .line 125
    .line 126
    add-int/lit8 v9, v9, 0x1

    .line 127
    .line 128
    if-ne v9, v5, :cond_6

    .line 129
    .line 130
    move-object v3, v8

    .line 131
    goto :goto_5

    .line 132
    :cond_6
    if-nez v7, :cond_7

    .line 133
    .line 134
    new-instance v7, Lj0/b;

    .line 135
    .line 136
    new-array v10, v0, [Ly0/n;

    .line 137
    .line 138
    invoke-direct {v7, v10}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    :cond_7
    if-eqz v3, :cond_8

    .line 142
    .line 143
    invoke-virtual {v7, v3}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    move-object v3, v6

    .line 147
    :cond_8
    invoke-virtual {v7, v8}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    :cond_9
    :goto_5
    iget-object v8, v8, Ly0/n;->l:Ly0/n;

    .line 151
    .line 152
    goto :goto_4

    .line 153
    :cond_a
    if-ne v9, v5, :cond_b

    .line 154
    .line 155
    goto :goto_3

    .line 156
    :cond_b
    :goto_6
    invoke-static {v7}, Lx1/k;->e(Lj0/b;)Ly0/n;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    goto :goto_3

    .line 161
    :cond_c
    iget-object v3, v3, Ly0/n;->l:Ly0/n;

    .line 162
    .line 163
    goto :goto_2

    .line 164
    :cond_d
    sget-object v0, Ld1/d0;->g:Ld1/d0;

    .line 165
    .line 166
    invoke-static {v1, v4, p0, v0}, Ljava/util/Arrays;->sort([Ljava/lang/Object;IILjava/util/Comparator;)V

    .line 167
    .line 168
    .line 169
    move v0, v4

    .line 170
    :goto_7
    if-ge v0, p0, :cond_f

    .line 171
    .line 172
    aget-object v2, v1, v0

    .line 173
    .line 174
    check-cast v2, Ld1/b0;

    .line 175
    .line 176
    invoke-static {v2}, Ld1/d;->r(Ld1/b0;)Z

    .line 177
    .line 178
    .line 179
    move-result v3

    .line 180
    if-eqz v3, :cond_e

    .line 181
    .line 182
    invoke-static {v2, p1}, Ld1/d;->k(Ld1/b0;Lb1/g;)Z

    .line 183
    .line 184
    .line 185
    move-result v2

    .line 186
    if-eqz v2, :cond_e

    .line 187
    .line 188
    return v5

    .line 189
    :cond_e
    add-int/lit8 v0, v0, 0x1

    .line 190
    .line 191
    goto :goto_7

    .line 192
    :cond_f
    return v4
.end method

.method public static final z(Ld1/b0;ILfg/l;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-object v0, p0, Ly0/n;->g:Ly0/n;

    .line 2
    .line 3
    iget-boolean v0, v0, Ly0/n;->t:Z

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "visitAncestors called on an unattached node"

    .line 8
    .line 9
    invoke-static {v0}, Lu1/a;->b(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Ly0/n;->g:Ly0/n;

    .line 13
    .line 14
    iget-object v0, v0, Ly0/n;->k:Ly0/n;

    .line 15
    .line 16
    invoke-static {p0}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    :goto_0
    const/4 v2, 0x0

    .line 21
    const/4 v3, 0x1

    .line 22
    const/4 v4, 0x0

    .line 23
    if-eqz v1, :cond_b

    .line 24
    .line 25
    iget-object v5, v1, Lx1/f0;->L:Lx1/b1;

    .line 26
    .line 27
    iget-object v5, v5, Lx1/b1;->f:Ly0/n;

    .line 28
    .line 29
    iget v5, v5, Ly0/n;->j:I

    .line 30
    .line 31
    and-int/lit16 v5, v5, 0x400

    .line 32
    .line 33
    if-eqz v5, :cond_9

    .line 34
    .line 35
    :goto_1
    if-eqz v0, :cond_9

    .line 36
    .line 37
    iget v5, v0, Ly0/n;->i:I

    .line 38
    .line 39
    and-int/lit16 v5, v5, 0x400

    .line 40
    .line 41
    if-eqz v5, :cond_8

    .line 42
    .line 43
    move-object v5, v0

    .line 44
    move-object v6, v4

    .line 45
    :goto_2
    if-eqz v5, :cond_8

    .line 46
    .line 47
    instance-of v7, v5, Ld1/b0;

    .line 48
    .line 49
    if-eqz v7, :cond_1

    .line 50
    .line 51
    goto :goto_5

    .line 52
    :cond_1
    iget v7, v5, Ly0/n;->i:I

    .line 53
    .line 54
    and-int/lit16 v7, v7, 0x400

    .line 55
    .line 56
    if-eqz v7, :cond_7

    .line 57
    .line 58
    instance-of v7, v5, Lx1/j;

    .line 59
    .line 60
    if-eqz v7, :cond_7

    .line 61
    .line 62
    move-object v7, v5

    .line 63
    check-cast v7, Lx1/j;

    .line 64
    .line 65
    iget-object v7, v7, Lx1/j;->v:Ly0/n;

    .line 66
    .line 67
    move v8, v2

    .line 68
    :goto_3
    if-eqz v7, :cond_6

    .line 69
    .line 70
    iget v9, v7, Ly0/n;->i:I

    .line 71
    .line 72
    and-int/lit16 v9, v9, 0x400

    .line 73
    .line 74
    if-eqz v9, :cond_5

    .line 75
    .line 76
    add-int/lit8 v8, v8, 0x1

    .line 77
    .line 78
    if-ne v8, v3, :cond_2

    .line 79
    .line 80
    move-object v5, v7

    .line 81
    goto :goto_4

    .line 82
    :cond_2
    if-nez v6, :cond_3

    .line 83
    .line 84
    new-instance v6, Lj0/b;

    .line 85
    .line 86
    const/16 v9, 0x10

    .line 87
    .line 88
    new-array v9, v9, [Ly0/n;

    .line 89
    .line 90
    invoke-direct {v6, v9}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    :cond_3
    if-eqz v5, :cond_4

    .line 94
    .line 95
    invoke-virtual {v6, v5}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    move-object v5, v4

    .line 99
    :cond_4
    invoke-virtual {v6, v7}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    :cond_5
    :goto_4
    iget-object v7, v7, Ly0/n;->l:Ly0/n;

    .line 103
    .line 104
    goto :goto_3

    .line 105
    :cond_6
    if-ne v8, v3, :cond_7

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_7
    invoke-static {v6}, Lx1/k;->e(Lj0/b;)Ly0/n;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    goto :goto_2

    .line 113
    :cond_8
    iget-object v0, v0, Ly0/n;->k:Ly0/n;

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_9
    invoke-virtual {v1}, Lx1/f0;->u()Lx1/f0;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    if-eqz v1, :cond_a

    .line 121
    .line 122
    iget-object v0, v1, Lx1/f0;->L:Lx1/b1;

    .line 123
    .line 124
    if-eqz v0, :cond_a

    .line 125
    .line 126
    iget-object v0, v0, Lx1/b1;->e:Lx1/b2;

    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_a
    move-object v0, v4

    .line 130
    goto :goto_0

    .line 131
    :cond_b
    move-object v5, v4

    .line 132
    :goto_5
    check-cast v5, Ld1/b0;

    .line 133
    .line 134
    if-eqz v5, :cond_c

    .line 135
    .line 136
    invoke-virtual {v5}, Ld1/b0;->o1()Ls/r;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-virtual {p0}, Ld1/b0;->o1()Ls/r;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    if-eqz v0, :cond_c

    .line 149
    .line 150
    goto/16 :goto_e

    .line 151
    .line 152
    :cond_c
    invoke-virtual {p0}, Ld1/b0;->o1()Ls/r;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    if-eqz p0, :cond_1d

    .line 157
    .line 158
    const/4 v0, 0x5

    .line 159
    const/4 v1, 0x2

    .line 160
    if-ne p1, v0, :cond_d

    .line 161
    .line 162
    goto :goto_6

    .line 163
    :cond_d
    const/4 v0, 0x6

    .line 164
    if-ne p1, v0, :cond_e

    .line 165
    .line 166
    goto :goto_6

    .line 167
    :cond_e
    const/4 v0, 0x3

    .line 168
    if-ne p1, v0, :cond_f

    .line 169
    .line 170
    goto :goto_6

    .line 171
    :cond_f
    const/4 v0, 0x4

    .line 172
    if-ne p1, v0, :cond_10

    .line 173
    .line 174
    goto :goto_6

    .line 175
    :cond_10
    if-ne p1, v3, :cond_11

    .line 176
    .line 177
    move v0, v1

    .line 178
    goto :goto_6

    .line 179
    :cond_11
    if-ne p1, v1, :cond_1c

    .line 180
    .line 181
    move v0, v3

    .line 182
    :goto_6
    iget-object p1, p0, Ls/r;->u:Lr/g;

    .line 183
    .line 184
    iget-object p1, p1, Lr/g;->a:Lr/z;

    .line 185
    .line 186
    invoke-virtual {p1}, Lr/z;->j()Lr/p;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    iget p1, p1, Lr/p;->n:I

    .line 191
    .line 192
    if-lez p1, :cond_1b

    .line 193
    .line 194
    iget-object p1, p0, Ls/r;->u:Lr/g;

    .line 195
    .line 196
    iget-object p1, p1, Lr/g;->a:Lr/z;

    .line 197
    .line 198
    invoke-virtual {p1}, Lr/z;->j()Lr/p;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    iget-object p1, p1, Lr/p;->k:Ljava/lang/Object;

    .line 203
    .line 204
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 205
    .line 206
    .line 207
    move-result p1

    .line 208
    if-nez p1, :cond_1b

    .line 209
    .line 210
    iget-boolean p1, p0, Ly0/n;->t:Z

    .line 211
    .line 212
    if-nez p1, :cond_12

    .line 213
    .line 214
    goto/16 :goto_d

    .line 215
    .line 216
    :cond_12
    invoke-virtual {p0, v0}, Ls/r;->l1(I)Z

    .line 217
    .line 218
    .line 219
    move-result p1

    .line 220
    iget-object v5, p0, Ls/r;->u:Lr/g;

    .line 221
    .line 222
    if-eqz p1, :cond_13

    .line 223
    .line 224
    iget-object p1, v5, Lr/g;->a:Lr/z;

    .line 225
    .line 226
    invoke-virtual {p1}, Lr/z;->j()Lr/p;

    .line 227
    .line 228
    .line 229
    move-result-object p1

    .line 230
    iget p1, p1, Lr/p;->n:I

    .line 231
    .line 232
    sub-int/2addr p1, v3

    .line 233
    iget-object v5, v5, Lr/g;->a:Lr/z;

    .line 234
    .line 235
    invoke-virtual {v5}, Lr/z;->j()Lr/p;

    .line 236
    .line 237
    .line 238
    move-result-object v5

    .line 239
    iget-object v5, v5, Lr/p;->k:Ljava/lang/Object;

    .line 240
    .line 241
    invoke-static {v5}, Ltf/m;->B1(Ljava/util/List;)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v5

    .line 245
    check-cast v5, Lr/q;

    .line 246
    .line 247
    iget v5, v5, Lr/q;->a:I

    .line 248
    .line 249
    invoke-static {p1, v5}, Ljava/lang/Math;->min(II)I

    .line 250
    .line 251
    .line 252
    move-result p1

    .line 253
    goto :goto_7

    .line 254
    :cond_13
    iget-object p1, v5, Lr/g;->a:Lr/z;

    .line 255
    .line 256
    invoke-virtual {p1}, Lr/z;->h()I

    .line 257
    .line 258
    .line 259
    move-result p1

    .line 260
    invoke-static {v2, p1}, Ljava/lang/Math;->max(II)I

    .line 261
    .line 262
    .line 263
    move-result p1

    .line 264
    :goto_7
    new-instance v5, Lgg/u;

    .line 265
    .line 266
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 267
    .line 268
    .line 269
    iget-object v6, p0, Ls/r;->v:Lm/c;

    .line 270
    .line 271
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 272
    .line 273
    .line 274
    new-instance v7, Ls/m;

    .line 275
    .line 276
    invoke-direct {v7, p1, p1}, Ls/m;-><init>(II)V

    .line 277
    .line 278
    .line 279
    iget-object p1, v6, Lm/c;->a:Lj0/b;

    .line 280
    .line 281
    invoke-virtual {p1, v7}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 282
    .line 283
    .line 284
    iput-object v7, v5, Lgg/u;->g:Ljava/lang/Object;

    .line 285
    .line 286
    iget-object p1, p0, Ls/r;->u:Lr/g;

    .line 287
    .line 288
    iget-object p1, p1, Lr/g;->a:Lr/z;

    .line 289
    .line 290
    invoke-virtual {p1}, Lr/z;->j()Lr/p;

    .line 291
    .line 292
    .line 293
    move-result-object v6

    .line 294
    iget-object v6, v6, Lr/p;->k:Ljava/lang/Object;

    .line 295
    .line 296
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    .line 297
    .line 298
    .line 299
    move-result v6

    .line 300
    if-eqz v6, :cond_14

    .line 301
    .line 302
    move v3, v2

    .line 303
    goto :goto_a

    .line 304
    :cond_14
    invoke-virtual {p1}, Lr/z;->j()Lr/p;

    .line 305
    .line 306
    .line 307
    move-result-object v6

    .line 308
    iget-object v7, v6, Lr/p;->o:Lm/p1;

    .line 309
    .line 310
    sget-object v8, Lm/p1;->g:Lm/p1;

    .line 311
    .line 312
    if-ne v7, v8, :cond_15

    .line 313
    .line 314
    invoke-virtual {v6}, Lr/p;->b()J

    .line 315
    .line 316
    .line 317
    move-result-wide v6

    .line 318
    const-wide v8, 0xffffffffL

    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    and-long/2addr v6, v8

    .line 324
    :goto_8
    long-to-int v6, v6

    .line 325
    goto :goto_9

    .line 326
    :cond_15
    invoke-virtual {v6}, Lr/p;->b()J

    .line 327
    .line 328
    .line 329
    move-result-wide v6

    .line 330
    const/16 v8, 0x20

    .line 331
    .line 332
    shr-long/2addr v6, v8

    .line 333
    goto :goto_8

    .line 334
    :goto_9
    invoke-virtual {p1}, Lr/z;->j()Lr/p;

    .line 335
    .line 336
    .line 337
    move-result-object p1

    .line 338
    invoke-static {p1}, Lac/p;->P(Lr/p;)I

    .line 339
    .line 340
    .line 341
    move-result p1

    .line 342
    if-nez p1, :cond_16

    .line 343
    .line 344
    goto :goto_a

    .line 345
    :cond_16
    div-int/2addr v6, p1

    .line 346
    if-ge v6, v3, :cond_17

    .line 347
    .line 348
    goto :goto_a

    .line 349
    :cond_17
    move v3, v6

    .line 350
    :goto_a
    mul-int/2addr v3, v1

    .line 351
    iget-object p1, p0, Ls/r;->u:Lr/g;

    .line 352
    .line 353
    iget-object p1, p1, Lr/g;->a:Lr/z;

    .line 354
    .line 355
    invoke-virtual {p1}, Lr/z;->j()Lr/p;

    .line 356
    .line 357
    .line 358
    move-result-object p1

    .line 359
    iget p1, p1, Lr/p;->n:I

    .line 360
    .line 361
    if-le v3, p1, :cond_18

    .line 362
    .line 363
    move v3, p1

    .line 364
    :cond_18
    :goto_b
    if-nez v4, :cond_1a

    .line 365
    .line 366
    iget-object p1, v5, Lgg/u;->g:Ljava/lang/Object;

    .line 367
    .line 368
    check-cast p1, Ls/m;

    .line 369
    .line 370
    invoke-virtual {p0, p1, v0}, Ls/r;->k1(Ls/m;I)Z

    .line 371
    .line 372
    .line 373
    move-result p1

    .line 374
    if-eqz p1, :cond_1a

    .line 375
    .line 376
    if-ge v2, v3, :cond_1a

    .line 377
    .line 378
    iget-object p1, v5, Lgg/u;->g:Ljava/lang/Object;

    .line 379
    .line 380
    check-cast p1, Ls/m;

    .line 381
    .line 382
    iget v1, p1, Ls/m;->a:I

    .line 383
    .line 384
    iget p1, p1, Ls/m;->b:I

    .line 385
    .line 386
    invoke-virtual {p0, v0}, Ls/r;->l1(I)Z

    .line 387
    .line 388
    .line 389
    move-result v4

    .line 390
    if-eqz v4, :cond_19

    .line 391
    .line 392
    add-int/lit8 p1, p1, 0x1

    .line 393
    .line 394
    goto :goto_c

    .line 395
    :cond_19
    add-int/lit8 v1, v1, -0x1

    .line 396
    .line 397
    :goto_c
    iget-object v4, p0, Ls/r;->v:Lm/c;

    .line 398
    .line 399
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 400
    .line 401
    .line 402
    new-instance v6, Ls/m;

    .line 403
    .line 404
    invoke-direct {v6, v1, p1}, Ls/m;-><init>(II)V

    .line 405
    .line 406
    .line 407
    iget-object p1, v4, Lm/c;->a:Lj0/b;

    .line 408
    .line 409
    invoke-virtual {p1, v6}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 410
    .line 411
    .line 412
    iget-object p1, p0, Ls/r;->v:Lm/c;

    .line 413
    .line 414
    iget-object v1, v5, Lgg/u;->g:Ljava/lang/Object;

    .line 415
    .line 416
    check-cast v1, Ls/m;

    .line 417
    .line 418
    iget-object p1, p1, Lm/c;->a:Lj0/b;

    .line 419
    .line 420
    invoke-virtual {p1, v1}, Lj0/b;->j(Ljava/lang/Object;)Z

    .line 421
    .line 422
    .line 423
    iput-object v6, v5, Lgg/u;->g:Ljava/lang/Object;

    .line 424
    .line 425
    add-int/lit8 v2, v2, 0x1

    .line 426
    .line 427
    invoke-static {p0}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 428
    .line 429
    .line 430
    move-result-object p1

    .line 431
    invoke-virtual {p1}, Lx1/f0;->k()V

    .line 432
    .line 433
    .line 434
    new-instance p1, Ls/q;

    .line 435
    .line 436
    invoke-direct {p1, p0, v5, v0}, Ls/q;-><init>(Ls/r;Lgg/u;I)V

    .line 437
    .line 438
    .line 439
    invoke-interface {p2, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 440
    .line 441
    .line 442
    move-result-object v4

    .line 443
    goto :goto_b

    .line 444
    :cond_1a
    iget-object p1, p0, Ls/r;->v:Lm/c;

    .line 445
    .line 446
    iget-object p2, v5, Lgg/u;->g:Ljava/lang/Object;

    .line 447
    .line 448
    check-cast p2, Ls/m;

    .line 449
    .line 450
    iget-object p1, p1, Lm/c;->a:Lj0/b;

    .line 451
    .line 452
    invoke-virtual {p1, p2}, Lj0/b;->j(Ljava/lang/Object;)Z

    .line 453
    .line 454
    .line 455
    invoke-static {p0}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 456
    .line 457
    .line 458
    move-result-object p0

    .line 459
    invoke-virtual {p0}, Lx1/f0;->k()V

    .line 460
    .line 461
    .line 462
    return-object v4

    .line 463
    :cond_1b
    :goto_d
    sget-object p0, Ls/r;->x:Ls/p;

    .line 464
    .line 465
    invoke-interface {p2, p0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 466
    .line 467
    .line 468
    move-result-object p0

    .line 469
    return-object p0

    .line 470
    :cond_1c
    const-string p0, "Unsupported direction for beyond bounds layout"

    .line 471
    .line 472
    invoke-static {p0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 473
    .line 474
    .line 475
    const/4 p0, 0x0

    .line 476
    return-object p0

    .line 477
    :cond_1d
    :goto_e
    return-object v4
.end method
