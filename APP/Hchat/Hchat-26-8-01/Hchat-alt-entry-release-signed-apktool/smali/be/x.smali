.class public final Lbe/x;
.super Lbe/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lbe/x;

    .line 2
    .line 3
    invoke-static {v0}, Lmh/d;->b(Ljava/lang/Class;)Lmh/b;

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final g(Lud/r;)V
    .locals 8

    .line 1
    iget-boolean v0, p1, Lud/r;->p:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_6

    .line 6
    .line 7
    :cond_0
    iget-object v0, p1, Lud/r;->z:Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_7

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    move-object v6, v1

    .line 24
    check-cast v6, Lud/a;

    .line 25
    .line 26
    iget-object v1, v6, Lud/a;->l:Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    check-cast v2, Lud/p;

    .line 43
    .line 44
    iget-object v3, v2, Lud/p;->k:Lpd/k;

    .line 45
    .line 46
    sget-object v4, Lpd/k;->O:Lpd/k;

    .line 47
    .line 48
    if-ne v3, v4, :cond_6

    .line 49
    .line 50
    move-object v7, v2

    .line 51
    check-cast v7, Lpd/n;

    .line 52
    .line 53
    const-string v2, "Failed to check method for inline after forced process"

    .line 54
    .line 55
    const-string v3, "Class process forced to load method for inline: "

    .line 56
    .line 57
    sget-object v4, Lmd/b;->I:Lmd/b;

    .line 58
    .line 59
    iget-object v5, v7, Lmd/e;->g:Lmd/f;

    .line 60
    .line 61
    invoke-virtual {v5, v4}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    check-cast v4, Lud/m;

    .line 66
    .line 67
    instance-of v5, v4, Lud/r;

    .line 68
    .line 69
    if-nez v5, :cond_2

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_2
    check-cast v4, Lud/r;

    .line 73
    .line 74
    :try_start_0
    invoke-static {v4}, Lbe/b;->Q(Lud/r;)Lnd/w;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    if-nez v5, :cond_3

    .line 79
    .line 80
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    invoke-virtual {v3, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    invoke-virtual {p1, v3}, Lnd/b0;->I(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    iget-object v3, p1, Lud/r;->l:Lud/e;

    .line 92
    .line 93
    iget-object v3, v3, Lud/e;->k:Lud/u;

    .line 94
    .line 95
    iget-object v3, v3, Lud/u;->r:Ldd/b;

    .line 96
    .line 97
    iget-object v5, v4, Lud/r;->l:Lud/e;

    .line 98
    .line 99
    invoke-virtual {v3, v5}, Ldd/b;->a(Lud/e;)V

    .line 100
    .line 101
    .line 102
    invoke-static {v4}, Lbe/b;->Q(Lud/r;)Lnd/w;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    if-nez v5, :cond_3

    .line 107
    .line 108
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    invoke-virtual {p1, v2}, Lnd/b0;->L(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    goto :goto_4

    .line 120
    :catch_0
    move-exception v0

    .line 121
    move-object p1, v0

    .line 122
    goto :goto_3

    .line 123
    :cond_3
    iget-object v2, v5, Lnd/w;->g:Lud/p;

    .line 124
    .line 125
    if-nez v2, :cond_4

    .line 126
    .line 127
    const/4 v2, 0x1

    .line 128
    goto :goto_1

    .line 129
    :cond_4
    const/4 v2, 0x0

    .line 130
    :goto_1
    if-eqz v2, :cond_5

    .line 131
    .line 132
    :goto_2
    goto :goto_4

    .line 133
    :cond_5
    move-object v2, p0

    .line 134
    move-object v3, p1

    .line 135
    invoke-virtual/range {v2 .. v7}, Lbe/x;->i(Lud/r;Lud/r;Lnd/w;Lud/a;Lpd/n;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 136
    .line 137
    .line 138
    goto :goto_5

    .line 139
    :goto_3
    new-instance v0, Laf/g;

    .line 140
    .line 141
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    const-string v2, "Failed to process method for inline: "

    .line 146
    .line 147
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    invoke-direct {v0, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 152
    .line 153
    .line 154
    throw v0

    .line 155
    :cond_6
    :goto_4
    move-object v3, p1

    .line 156
    :goto_5
    move-object p1, v3

    .line 157
    goto :goto_0

    .line 158
    :cond_7
    :goto_6
    return-void
.end method

.method public final i(Lud/r;Lud/r;Lnd/w;Lud/a;Lpd/n;)V
    .locals 8

    .line 1
    iget-object v0, p3, Lnd/w;->g:Lud/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Lud/p;->O()Lud/p;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x0

    .line 8
    :try_start_0
    iget-object v3, p2, Lud/r;->k:Lod/d;

    .line 9
    .line 10
    iget-object v3, v3, Lod/d;->i:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-nez v3, :cond_4

    .line 17
    .line 18
    iget v3, p2, Lud/r;->q:I

    .line 19
    .line 20
    new-array v4, v3, [Lqd/l;

    .line 21
    .line 22
    iget-object p3, p3, Lnd/w;->h:[I

    .line 23
    .line 24
    move v5, v2

    .line 25
    :goto_0
    array-length v6, p3

    .line 26
    if-ge v5, v6, :cond_0

    .line 27
    .line 28
    invoke-virtual {p5, v5}, Lud/p;->S(I)Lqd/l;

    .line 29
    .line 30
    .line 31
    move-result-object v6

    .line 32
    aget v7, p3, v5

    .line 33
    .line 34
    aput-object v6, v4, v7

    .line 35
    .line 36
    add-int/lit8 v5, v5, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catch_0
    move-exception p3

    .line 40
    goto/16 :goto_4

    .line 41
    .line 42
    :cond_0
    new-instance p3, Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, p3}, Lud/p;->U(Ljava/util/Collection;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 51
    .line 52
    .line 53
    move-result-object p3

    .line 54
    :cond_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    if-eqz v5, :cond_4

    .line 59
    .line 60
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    check-cast v5, Lqd/r;

    .line 65
    .line 66
    iget v6, v5, Lqd/r;->l:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 67
    .line 68
    const-string v7, "\' in method call: "

    .line 69
    .line 70
    if-lt v6, v3, :cond_2

    .line 71
    .line 72
    :try_start_1
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p3

    .line 76
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    new-instance v4, Ljava/lang/StringBuilder;

    .line 81
    .line 82
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 83
    .line 84
    .line 85
    const-string v5, "Unknown register number \'"

    .line 86
    .line 87
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p3

    .line 103
    invoke-virtual {p1, p3}, Lnd/b0;->L(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    goto/16 :goto_5

    .line 107
    .line 108
    :cond_2
    aget-object v6, v4, v6

    .line 109
    .line 110
    if-nez v6, :cond_3

    .line 111
    .line 112
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p3

    .line 116
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    new-instance v4, Ljava/lang/StringBuilder;

    .line 121
    .line 122
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 123
    .line 124
    .line 125
    const-string v5, "Not passed register \'"

    .line 126
    .line 127
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object p3

    .line 143
    invoke-virtual {p1, p3}, Lnd/b0;->L(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    goto/16 :goto_5

    .line 147
    .line 148
    :cond_3
    invoke-virtual {v6}, Lqd/l;->H()Lqd/l;

    .line 149
    .line 150
    .line 151
    move-result-object v6

    .line 152
    invoke-virtual {v1, v5, v6}, Lud/p;->b0(Lqd/l;Lqd/l;)Z

    .line 153
    .line 154
    .line 155
    move-result v6

    .line 156
    if-nez v6, :cond_1

    .line 157
    .line 158
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object p3

    .line 162
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    new-instance v4, Ljava/lang/StringBuilder;

    .line 167
    .line 168
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 169
    .line 170
    .line 171
    const-string v5, "Failed to replace arg "

    .line 172
    .line 173
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    const-string p3, " for method inline: "

    .line 180
    .line 181
    invoke-virtual {v4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object p3

    .line 191
    invoke-virtual {p1, p3}, Lnd/b0;->L(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    goto :goto_5

    .line 195
    :cond_4
    iget-object p3, p5, Lud/p;->l:Lqd/r;

    .line 196
    .line 197
    const/4 v3, 0x1

    .line 198
    if-eqz p3, :cond_5

    .line 199
    .line 200
    invoke-virtual {p3}, Lqd/r;->c0()Lqd/r;

    .line 201
    .line 202
    .line 203
    move-result-object p3

    .line 204
    invoke-virtual {v1, p3}, Lud/p;->d0(Lqd/r;)V

    .line 205
    .line 206
    .line 207
    goto :goto_3

    .line 208
    :cond_5
    if-eqz p3, :cond_6

    .line 209
    .line 210
    :goto_1
    move p3, v2

    .line 211
    goto :goto_2

    .line 212
    :cond_6
    sget-object p3, Lmd/a;->S:Lmd/a;

    .line 213
    .line 214
    iget-object v4, p5, Lmd/e;->g:Lmd/f;

    .line 215
    .line 216
    invoke-virtual {v4, p3}, Lmd/f;->a(Lmd/a;)Z

    .line 217
    .line 218
    .line 219
    move-result p3

    .line 220
    if-eqz p3, :cond_7

    .line 221
    .line 222
    goto :goto_1

    .line 223
    :cond_7
    iget-object p3, v0, Lud/p;->k:Lpd/k;

    .line 224
    .line 225
    sget-object v4, Lpd/k;->L:Lpd/k;

    .line 226
    .line 227
    if-ne p3, v4, :cond_8

    .line 228
    .line 229
    goto :goto_1

    .line 230
    :cond_8
    invoke-virtual {p2}, Lud/r;->Z()Z

    .line 231
    .line 232
    .line 233
    move-result p3

    .line 234
    xor-int/2addr p3, v3

    .line 235
    :goto_2
    if-eqz p3, :cond_9

    .line 236
    .line 237
    iget-object p3, p2, Lud/r;->t:Lqd/j;

    .line 238
    .line 239
    const-string v4, "unused"

    .line 240
    .line 241
    invoke-virtual {p1, p3}, Lud/r;->c0(Lqd/j;)Lqd/r;

    .line 242
    .line 243
    .line 244
    move-result-object p3

    .line 245
    invoke-virtual {p3, v4}, Lqd/r;->p(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v1, p3}, Lud/p;->d0(Lqd/r;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 249
    .line 250
    .line 251
    :cond_9
    :goto_3
    move v2, v3

    .line 252
    goto :goto_5

    .line 253
    :goto_4
    const-string v3, "Method inline failed with exception"

    .line 254
    .line 255
    invoke-virtual {p1, v3, p3}, Lnd/b0;->M(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 256
    .line 257
    .line 258
    :goto_5
    if-eqz v2, :cond_b

    .line 259
    .line 260
    sget-object p3, Lmd/b;->I:Lmd/b;

    .line 261
    .line 262
    iget-object v2, v1, Lmd/e;->g:Lmd/f;

    .line 263
    .line 264
    invoke-virtual {v2, p3}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 265
    .line 266
    .line 267
    move-result-object p3

    .line 268
    check-cast p3, Lud/m;

    .line 269
    .line 270
    invoke-static {p1, p4, p5, v1}, La/a;->K0(Lud/r;Lud/a;Lud/p;Lud/p;)Z

    .line 271
    .line 272
    .line 273
    move-result p4

    .line 274
    if-eqz p4, :cond_b

    .line 275
    .line 276
    if-eqz p3, :cond_a

    .line 277
    .line 278
    invoke-virtual {v1, p3}, Lmd/e;->y(Loc/b;)V

    .line 279
    .line 280
    .line 281
    :cond_a
    iget-object p3, p2, Lud/r;->H:Ljava/util/List;

    .line 282
    .line 283
    invoke-interface {p3, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 284
    .line 285
    .line 286
    new-instance p3, Lbe/w;

    .line 287
    .line 288
    invoke-direct {p3, p0, p1, p2}, Lbe/w;-><init>(Lbe/x;Lud/r;Lud/r;)V

    .line 289
    .line 290
    .line 291
    invoke-virtual {v0, p3}, Lud/p;->h0(Ljava/util/function/Consumer;)V

    .line 292
    .line 293
    .line 294
    return-void

    .line 295
    :cond_b
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object p2

    .line 299
    const-string p3, "Failed to inline method: "

    .line 300
    .line 301
    invoke-virtual {p3, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object p2

    .line 305
    invoke-virtual {p1, p2}, Lnd/b0;->L(Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    invoke-static {p1, v1}, Lxe/l;->j(Lud/r;Lud/p;)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {p5}, Lud/p;->Z()V

    .line 312
    .line 313
    .line 314
    return-void
.end method
