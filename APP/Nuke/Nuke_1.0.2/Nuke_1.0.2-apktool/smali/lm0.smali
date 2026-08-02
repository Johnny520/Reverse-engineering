.class public final Llm0;
.super Lw92;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic j:I

.field public k:I

.field public l:Ljava/lang/Object;

.field public m:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lt00;I)V
    .locals 0

    .line 1
    iput p4, p0, Llm0;->j:I

    .line 2
    .line 3
    iput-object p1, p0, Llm0;->m:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Llm0;->n:Ljava/lang/Object;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p3}, Lw92;-><init>(ILt00;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lt00;I)V
    .locals 0

    .line 12
    iput p3, p0, Llm0;->j:I

    iput-object p1, p0, Llm0;->n:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lw92;-><init>(ILt00;)V

    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Llm0;->j:I

    .line 2
    .line 3
    sget-object v1, La83;->a:La83;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Lyw2;

    .line 9
    .line 10
    check-cast p2, Lt00;

    .line 11
    .line 12
    invoke-virtual {p0, p2, p1}, Llm0;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Llm0;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Llm0;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Lyw2;

    .line 24
    .line 25
    check-cast p2, Lt00;

    .line 26
    .line 27
    invoke-virtual {p0, p2, p1}, Llm0;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, Llm0;

    .line 32
    .line 33
    invoke-virtual {p0, v1}, Llm0;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    sget-object p0, Lk20;->h:Lk20;

    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_1
    check-cast p1, Lvo2;

    .line 40
    .line 41
    check-cast p2, Lt00;

    .line 42
    .line 43
    invoke-virtual {p0, p2, p1}, Llm0;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    check-cast p0, Llm0;

    .line 48
    .line 49
    invoke-virtual {p0, v1}, Llm0;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0

    .line 54
    :pswitch_2
    check-cast p1, Lyw2;

    .line 55
    .line 56
    check-cast p2, Lt00;

    .line 57
    .line 58
    invoke-virtual {p0, p2, p1}, Llm0;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    check-cast p0, Llm0;

    .line 63
    .line 64
    invoke-virtual {p0, v1}, Llm0;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    return-object p0

    .line 69
    :pswitch_3
    check-cast p1, Lyw2;

    .line 70
    .line 71
    check-cast p2, Lt00;

    .line 72
    .line 73
    invoke-virtual {p0, p2, p1}, Llm0;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    check-cast p0, Llm0;

    .line 78
    .line 79
    invoke-virtual {p0, v1}, Llm0;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    return-object p0

    .line 84
    nop

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final p(Lt00;Ljava/lang/Object;)Lt00;
    .locals 3

    .line 1
    iget v0, p0, Llm0;->j:I

    .line 2
    .line 3
    iget-object v1, p0, Llm0;->n:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, Llm0;

    .line 9
    .line 10
    iget-object p0, p0, Llm0;->m:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Li12;

    .line 13
    .line 14
    check-cast v1, Lo72;

    .line 15
    .line 16
    const/4 v2, 0x4

    .line 17
    invoke-direct {v0, p0, v1, p1, v2}, Llm0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lt00;I)V

    .line 18
    .line 19
    .line 20
    iput-object p2, v0, Llm0;->l:Ljava/lang/Object;

    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_0
    new-instance v0, Llm0;

    .line 24
    .line 25
    iget-object p0, p0, Llm0;->m:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p0, Lxk1;

    .line 28
    .line 29
    check-cast v1, Lxk1;

    .line 30
    .line 31
    const/4 v2, 0x3

    .line 32
    invoke-direct {v0, p0, v1, p1, v2}, Llm0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lt00;I)V

    .line 33
    .line 34
    .line 35
    iput-object p2, v0, Llm0;->l:Ljava/lang/Object;

    .line 36
    .line 37
    return-object v0

    .line 38
    :pswitch_1
    new-instance p0, Llm0;

    .line 39
    .line 40
    check-cast v1, Lxm0;

    .line 41
    .line 42
    const/4 v0, 0x2

    .line 43
    invoke-direct {p0, v1, p1, v0}, Llm0;-><init>(Ljava/lang/Object;Lt00;I)V

    .line 44
    .line 45
    .line 46
    iput-object p2, p0, Llm0;->m:Ljava/lang/Object;

    .line 47
    .line 48
    return-object p0

    .line 49
    :pswitch_2
    new-instance p0, Llm0;

    .line 50
    .line 51
    check-cast v1, Lkz2;

    .line 52
    .line 53
    const/4 v0, 0x1

    .line 54
    invoke-direct {p0, v1, p1, v0}, Llm0;-><init>(Ljava/lang/Object;Lt00;I)V

    .line 55
    .line 56
    .line 57
    iput-object p2, p0, Llm0;->l:Ljava/lang/Object;

    .line 58
    .line 59
    return-object p0

    .line 60
    :pswitch_3
    new-instance v0, Llm0;

    .line 61
    .line 62
    iget-object p0, p0, Llm0;->m:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast p0, La20;

    .line 65
    .line 66
    check-cast v1, Lmn0;

    .line 67
    .line 68
    const/4 v2, 0x0

    .line 69
    invoke-direct {v0, p0, v1, p1, v2}, Llm0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lt00;I)V

    .line 70
    .line 71
    .line 72
    iput-object p2, v0, Llm0;->l:Ljava/lang/Object;

    .line 73
    .line 74
    return-object v0

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Llm0;->j:I

    .line 4
    .line 5
    sget-object v2, Li12;->i:Li12;

    .line 6
    .line 7
    sget-object v3, Li12;->j:Li12;

    .line 8
    .line 9
    const/4 v5, 0x2

    .line 10
    sget-object v6, La83;->a:La83;

    .line 11
    .line 12
    const-string v7, "call to \'resume\' before \'invoke\' with coroutine"

    .line 13
    .line 14
    sget-object v8, Lk20;->h:Lk20;

    .line 15
    .line 16
    const/4 v9, 0x1

    .line 17
    iget-object v10, v1, Llm0;->n:Ljava/lang/Object;

    .line 18
    .line 19
    const/4 v11, 0x0

    .line 20
    packed-switch v0, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    check-cast v10, Lo72;

    .line 24
    .line 25
    iget v0, v1, Llm0;->k:I

    .line 26
    .line 27
    sget-object v2, Lyc1;->a:Lyc1;

    .line 28
    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    if-eq v0, v9, :cond_1

    .line 32
    .line 33
    if-ne v0, v5, :cond_0

    .line 34
    .line 35
    iget-object v0, v1, Llm0;->l:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, Lyw2;

    .line 38
    .line 39
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    move-object/from16 v4, p1

    .line 43
    .line 44
    goto/16 :goto_6

    .line 45
    .line 46
    :cond_0
    invoke-static {v7}, Ls;->l(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    move-object v6, v11

    .line 50
    goto/16 :goto_8

    .line 51
    .line 52
    :cond_1
    iget-object v0, v1, Llm0;->l:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v0, Lyw2;

    .line 55
    .line 56
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    move-object/from16 v7, p1

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_2
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    iget-object v0, v1, Llm0;->l:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v0, Lyw2;

    .line 68
    .line 69
    :goto_0
    iget-object v7, v1, Llm0;->m:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v7, Li12;

    .line 72
    .line 73
    iput-object v0, v1, Llm0;->l:Ljava/lang/Object;

    .line 74
    .line 75
    iput v9, v1, Llm0;->k:I

    .line 76
    .line 77
    invoke-virtual {v0, v7, v1}, Lyw2;->a(Li12;Lrj;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v7

    .line 81
    if-ne v7, v8, :cond_3

    .line 82
    .line 83
    goto :goto_5

    .line 84
    :cond_3
    :goto_1
    check-cast v7, Lh12;

    .line 85
    .line 86
    iget-object v11, v7, Lh12;->a:Ljava/util/List;

    .line 87
    .line 88
    invoke-interface {v11}, Ljava/util/Collection;->size()I

    .line 89
    .line 90
    .line 91
    move-result v12

    .line 92
    const/4 v13, 0x0

    .line 93
    :goto_2
    if-ge v13, v12, :cond_c

    .line 94
    .line 95
    invoke-interface {v11, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v14

    .line 99
    check-cast v14, Lo12;

    .line 100
    .line 101
    invoke-static {v14}, Ltp0;->p(Lo12;)Z

    .line 102
    .line 103
    .line 104
    move-result v14

    .line 105
    if-nez v14, :cond_b

    .line 106
    .line 107
    iget v7, v7, Lh12;->c:I

    .line 108
    .line 109
    if-ne v7, v5, :cond_4

    .line 110
    .line 111
    sget-object v0, Lad1;->a:Lad1;

    .line 112
    .line 113
    iput-object v0, v10, Lo72;->i:Ljava/lang/Object;

    .line 114
    .line 115
    goto/16 :goto_8

    .line 116
    .line 117
    :cond_4
    invoke-interface {v11}, Ljava/util/Collection;->size()I

    .line 118
    .line 119
    .line 120
    move-result v7

    .line 121
    const/4 v12, 0x0

    .line 122
    :goto_3
    if-ge v12, v7, :cond_7

    .line 123
    .line 124
    invoke-interface {v11, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v13

    .line 128
    check-cast v13, Lo12;

    .line 129
    .line 130
    invoke-virtual {v13}, Lo12;->b()Z

    .line 131
    .line 132
    .line 133
    move-result v14

    .line 134
    if-nez v14, :cond_6

    .line 135
    .line 136
    iget-object v14, v0, Lyw2;->m:Lzw2;

    .line 137
    .line 138
    iget-wide v14, v14, Lzw2;->E:J

    .line 139
    .line 140
    invoke-virtual {v0}, Lyw2;->c()J

    .line 141
    .line 142
    .line 143
    move-result-wide v4

    .line 144
    invoke-static {v13, v14, v15, v4, v5}, Ltp0;->z(Lo12;JJ)Z

    .line 145
    .line 146
    .line 147
    move-result v4

    .line 148
    if-eqz v4, :cond_5

    .line 149
    .line 150
    goto :goto_4

    .line 151
    :cond_5
    add-int/lit8 v12, v12, 0x1

    .line 152
    .line 153
    const/4 v5, 0x2

    .line 154
    goto :goto_3

    .line 155
    :cond_6
    :goto_4
    iput-object v2, v10, Lo72;->i:Ljava/lang/Object;

    .line 156
    .line 157
    goto :goto_8

    .line 158
    :cond_7
    iput-object v0, v1, Llm0;->l:Ljava/lang/Object;

    .line 159
    .line 160
    const/4 v4, 0x2

    .line 161
    iput v4, v1, Llm0;->k:I

    .line 162
    .line 163
    invoke-virtual {v0, v3, v1}, Lyw2;->a(Li12;Lrj;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v4

    .line 167
    if-ne v4, v8, :cond_8

    .line 168
    .line 169
    :goto_5
    move-object v6, v8

    .line 170
    goto :goto_8

    .line 171
    :cond_8
    :goto_6
    check-cast v4, Lh12;

    .line 172
    .line 173
    iget-object v4, v4, Lh12;->a:Ljava/util/List;

    .line 174
    .line 175
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 176
    .line 177
    .line 178
    move-result v5

    .line 179
    const/4 v7, 0x0

    .line 180
    :goto_7
    if-ge v7, v5, :cond_a

    .line 181
    .line 182
    invoke-interface {v4, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v11

    .line 186
    check-cast v11, Lo12;

    .line 187
    .line 188
    invoke-virtual {v11}, Lo12;->b()Z

    .line 189
    .line 190
    .line 191
    move-result v11

    .line 192
    if-eqz v11, :cond_9

    .line 193
    .line 194
    iput-object v2, v10, Lo72;->i:Ljava/lang/Object;

    .line 195
    .line 196
    goto :goto_8

    .line 197
    :cond_9
    add-int/lit8 v7, v7, 0x1

    .line 198
    .line 199
    goto :goto_7

    .line 200
    :cond_a
    const/4 v5, 0x2

    .line 201
    goto/16 :goto_0

    .line 202
    .line 203
    :cond_b
    add-int/lit8 v13, v13, 0x1

    .line 204
    .line 205
    const/4 v5, 0x2

    .line 206
    goto :goto_2

    .line 207
    :cond_c
    new-instance v0, Lzc1;

    .line 208
    .line 209
    const/4 v3, 0x0

    .line 210
    invoke-interface {v11, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    check-cast v1, Lo12;

    .line 215
    .line 216
    invoke-direct {v0, v1}, Lzc1;-><init>(Lo12;)V

    .line 217
    .line 218
    .line 219
    iput-object v0, v10, Lo72;->i:Ljava/lang/Object;

    .line 220
    .line 221
    :goto_8
    return-object v6

    .line 222
    :pswitch_0
    iget-object v0, v1, Llm0;->l:Ljava/lang/Object;

    .line 223
    .line 224
    check-cast v0, Lyw2;

    .line 225
    .line 226
    iget v3, v1, Llm0;->k:I

    .line 227
    .line 228
    if-eqz v3, :cond_e

    .line 229
    .line 230
    if-ne v3, v9, :cond_d

    .line 231
    .line 232
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    move-object/from16 v3, p1

    .line 236
    .line 237
    goto :goto_b

    .line 238
    :cond_d
    invoke-static {v7}, Ls;->l(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    move-object v8, v11

    .line 242
    goto :goto_a

    .line 243
    :cond_e
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 244
    .line 245
    .line 246
    :cond_f
    :goto_9
    iput-object v0, v1, Llm0;->l:Ljava/lang/Object;

    .line 247
    .line 248
    iput v9, v1, Llm0;->k:I

    .line 249
    .line 250
    invoke-virtual {v0, v2, v1}, Lyw2;->a(Li12;Lrj;)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v3

    .line 254
    if-ne v3, v8, :cond_10

    .line 255
    .line 256
    :goto_a
    return-object v8

    .line 257
    :cond_10
    :goto_b
    check-cast v3, Lh12;

    .line 258
    .line 259
    iget-object v3, v3, Lh12;->a:Ljava/util/List;

    .line 260
    .line 261
    invoke-static {v3}, Ldu;->q0(Ljava/util/List;)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v3

    .line 265
    check-cast v3, Lo12;

    .line 266
    .line 267
    if-eqz v3, :cond_f

    .line 268
    .line 269
    iget-object v4, v1, Llm0;->m:Ljava/lang/Object;

    .line 270
    .line 271
    check-cast v4, Lxk1;

    .line 272
    .line 273
    iget-wide v5, v3, Lo12;->c:J

    .line 274
    .line 275
    new-instance v3, Lrs1;

    .line 276
    .line 277
    invoke-direct {v3, v5, v6}, Lrs1;-><init>(J)V

    .line 278
    .line 279
    .line 280
    invoke-interface {v4, v3}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    move-object v3, v10

    .line 284
    check-cast v3, Lxk1;

    .line 285
    .line 286
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 287
    .line 288
    invoke-interface {v3, v4}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 289
    .line 290
    .line 291
    goto :goto_9

    .line 292
    :pswitch_1
    iget v0, v1, Llm0;->k:I

    .line 293
    .line 294
    if-eqz v0, :cond_12

    .line 295
    .line 296
    if-ne v0, v9, :cond_11

    .line 297
    .line 298
    iget-object v0, v1, Llm0;->l:Ljava/lang/Object;

    .line 299
    .line 300
    iget-object v2, v1, Llm0;->m:Ljava/lang/Object;

    .line 301
    .line 302
    check-cast v2, Lvo2;

    .line 303
    .line 304
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 305
    .line 306
    .line 307
    goto :goto_c

    .line 308
    :cond_11
    invoke-static {v7}, Ls;->l(Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    move-object v6, v11

    .line 312
    goto :goto_d

    .line 313
    :cond_12
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 314
    .line 315
    .line 316
    iget-object v0, v1, Llm0;->m:Ljava/lang/Object;

    .line 317
    .line 318
    check-cast v0, Lvo2;

    .line 319
    .line 320
    move-object v2, v0

    .line 321
    :cond_13
    move-object v0, v10

    .line 322
    check-cast v0, Lxm0;

    .line 323
    .line 324
    invoke-interface {v0}, Lxm0;->a()Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    if-eqz v0, :cond_14

    .line 329
    .line 330
    iput-object v2, v1, Llm0;->m:Ljava/lang/Object;

    .line 331
    .line 332
    iput-object v0, v1, Llm0;->l:Ljava/lang/Object;

    .line 333
    .line 334
    iput v9, v1, Llm0;->k:I

    .line 335
    .line 336
    invoke-virtual {v2, v1, v0}, Lvo2;->b(Lt00;Ljava/lang/Object;)V

    .line 337
    .line 338
    .line 339
    move-object v6, v8

    .line 340
    goto :goto_d

    .line 341
    :cond_14
    move-object v0, v11

    .line 342
    :goto_c
    if-nez v0, :cond_13

    .line 343
    .line 344
    :goto_d
    return-object v6

    .line 345
    :pswitch_2
    const/4 v3, 0x0

    .line 346
    check-cast v10, Lkz2;

    .line 347
    .line 348
    iget v0, v1, Llm0;->k:I

    .line 349
    .line 350
    if-eqz v0, :cond_17

    .line 351
    .line 352
    if-eq v0, v9, :cond_16

    .line 353
    .line 354
    const/4 v4, 0x2

    .line 355
    if-ne v0, v4, :cond_15

    .line 356
    .line 357
    iget-object v0, v1, Llm0;->m:Ljava/lang/Object;

    .line 358
    .line 359
    check-cast v0, Lo12;

    .line 360
    .line 361
    iget-object v4, v1, Llm0;->l:Ljava/lang/Object;

    .line 362
    .line 363
    check-cast v4, Lyw2;

    .line 364
    .line 365
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 366
    .line 367
    .line 368
    move-object v5, v4

    .line 369
    move-object/from16 v4, p1

    .line 370
    .line 371
    goto :goto_11

    .line 372
    :cond_15
    invoke-static {v7}, Ls;->l(Ljava/lang/String;)V

    .line 373
    .line 374
    .line 375
    move-object v6, v11

    .line 376
    goto :goto_13

    .line 377
    :cond_16
    iget-object v0, v1, Llm0;->l:Ljava/lang/Object;

    .line 378
    .line 379
    check-cast v0, Lyw2;

    .line 380
    .line 381
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 382
    .line 383
    .line 384
    move-object/from16 v5, p1

    .line 385
    .line 386
    const/4 v4, 0x2

    .line 387
    goto :goto_e

    .line 388
    :cond_17
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 389
    .line 390
    .line 391
    iget-object v0, v1, Llm0;->l:Ljava/lang/Object;

    .line 392
    .line 393
    check-cast v0, Lyw2;

    .line 394
    .line 395
    iput-object v0, v1, Llm0;->l:Ljava/lang/Object;

    .line 396
    .line 397
    iput v9, v1, Llm0;->k:I

    .line 398
    .line 399
    const/4 v4, 0x2

    .line 400
    invoke-static {v0, v1, v4}, Lay2;->b(Lyw2;Lrj;I)Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object v5

    .line 404
    if-ne v5, v8, :cond_18

    .line 405
    .line 406
    goto :goto_10

    .line 407
    :cond_18
    :goto_e
    check-cast v5, Lo12;

    .line 408
    .line 409
    iget-wide v11, v5, Lo12;->c:J

    .line 410
    .line 411
    invoke-interface {v10}, Lkz2;->d()V

    .line 412
    .line 413
    .line 414
    move-object/from16 v16, v5

    .line 415
    .line 416
    move-object v5, v0

    .line 417
    move-object/from16 v0, v16

    .line 418
    .line 419
    :goto_f
    iput-object v5, v1, Llm0;->l:Ljava/lang/Object;

    .line 420
    .line 421
    iput-object v0, v1, Llm0;->m:Ljava/lang/Object;

    .line 422
    .line 423
    iput v4, v1, Llm0;->k:I

    .line 424
    .line 425
    invoke-virtual {v5, v2, v1}, Lyw2;->a(Li12;Lrj;)Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object v4

    .line 429
    if-ne v4, v8, :cond_19

    .line 430
    .line 431
    :goto_10
    move-object v6, v8

    .line 432
    goto :goto_13

    .line 433
    :cond_19
    :goto_11
    check-cast v4, Lh12;

    .line 434
    .line 435
    iget-object v4, v4, Lh12;->a:Ljava/util/List;

    .line 436
    .line 437
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 438
    .line 439
    .line 440
    move-result v7

    .line 441
    move v9, v3

    .line 442
    :goto_12
    if-ge v9, v7, :cond_1b

    .line 443
    .line 444
    invoke-interface {v4, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object v11

    .line 448
    check-cast v11, Lo12;

    .line 449
    .line 450
    iget-wide v12, v11, Lo12;->a:J

    .line 451
    .line 452
    iget-wide v14, v0, Lo12;->a:J

    .line 453
    .line 454
    invoke-static {v12, v13, v14, v15}, Lup0;->s(JJ)Z

    .line 455
    .line 456
    .line 457
    move-result v12

    .line 458
    if-eqz v12, :cond_1a

    .line 459
    .line 460
    iget-boolean v11, v11, Lo12;->d:Z

    .line 461
    .line 462
    if-eqz v11, :cond_1a

    .line 463
    .line 464
    const/4 v4, 0x2

    .line 465
    goto :goto_f

    .line 466
    :cond_1a
    add-int/lit8 v9, v9, 0x1

    .line 467
    .line 468
    goto :goto_12

    .line 469
    :cond_1b
    invoke-interface {v10}, Lkz2;->c()V

    .line 470
    .line 471
    .line 472
    :goto_13
    return-object v6

    .line 473
    :pswitch_3
    iget-object v0, v1, Llm0;->m:Ljava/lang/Object;

    .line 474
    .line 475
    move-object v2, v0

    .line 476
    check-cast v2, La20;

    .line 477
    .line 478
    iget v0, v1, Llm0;->k:I

    .line 479
    .line 480
    const/4 v4, 0x3

    .line 481
    if-eqz v0, :cond_1f

    .line 482
    .line 483
    if-eq v0, v9, :cond_1e

    .line 484
    .line 485
    const/4 v5, 0x2

    .line 486
    if-eq v0, v5, :cond_1d

    .line 487
    .line 488
    if-ne v0, v4, :cond_1c

    .line 489
    .line 490
    iget-object v0, v1, Llm0;->l:Ljava/lang/Object;

    .line 491
    .line 492
    check-cast v0, Lyw2;

    .line 493
    .line 494
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 495
    .line 496
    .line 497
    move-object v5, v0

    .line 498
    goto :goto_14

    .line 499
    :cond_1c
    invoke-static {v7}, Ls;->l(Ljava/lang/String;)V

    .line 500
    .line 501
    .line 502
    move-object v6, v11

    .line 503
    goto :goto_19

    .line 504
    :cond_1d
    iget-object v0, v1, Llm0;->l:Ljava/lang/Object;

    .line 505
    .line 506
    move-object v5, v0

    .line 507
    check-cast v5, Lyw2;

    .line 508
    .line 509
    :try_start_0
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 510
    .line 511
    .line 512
    :goto_14
    const/4 v7, 0x2

    .line 513
    goto :goto_15

    .line 514
    :catch_0
    move-exception v0

    .line 515
    const/4 v7, 0x2

    .line 516
    goto :goto_17

    .line 517
    :cond_1e
    iget-object v0, v1, Llm0;->l:Ljava/lang/Object;

    .line 518
    .line 519
    move-object v5, v0

    .line 520
    check-cast v5, Lyw2;

    .line 521
    .line 522
    :try_start_1
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0

    .line 523
    .line 524
    .line 525
    goto :goto_16

    .line 526
    :cond_1f
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 527
    .line 528
    .line 529
    iget-object v0, v1, Llm0;->l:Ljava/lang/Object;

    .line 530
    .line 531
    check-cast v0, Lyw2;

    .line 532
    .line 533
    move-object v5, v0

    .line 534
    :cond_20
    :goto_15
    invoke-static {v2}, Lxe1;->I(La20;)Z

    .line 535
    .line 536
    .line 537
    move-result v0

    .line 538
    if-eqz v0, :cond_23

    .line 539
    .line 540
    :try_start_2
    move-object v0, v10

    .line 541
    check-cast v0, Lmn0;

    .line 542
    .line 543
    iput-object v5, v1, Llm0;->l:Ljava/lang/Object;

    .line 544
    .line 545
    iput v9, v1, Llm0;->k:I

    .line 546
    .line 547
    invoke-interface {v0, v5, v1}, Lmn0;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 548
    .line 549
    .line 550
    move-result-object v0

    .line 551
    if-ne v0, v8, :cond_21

    .line 552
    .line 553
    goto :goto_18

    .line 554
    :cond_21
    :goto_16
    iput-object v5, v1, Llm0;->l:Ljava/lang/Object;
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_0

    .line 555
    .line 556
    const/4 v7, 0x2

    .line 557
    :try_start_3
    iput v7, v1, Llm0;->k:I

    .line 558
    .line 559
    invoke-static {v5, v3, v1}, Lsp0;->o(Lyw2;Li12;Lrj;)Ljava/lang/Object;

    .line 560
    .line 561
    .line 562
    move-result-object v0
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_1

    .line 563
    if-ne v0, v8, :cond_20

    .line 564
    .line 565
    goto :goto_18

    .line 566
    :catch_1
    move-exception v0

    .line 567
    :goto_17
    invoke-static {v2}, Lxe1;->I(La20;)Z

    .line 568
    .line 569
    .line 570
    move-result v11

    .line 571
    if-eqz v11, :cond_22

    .line 572
    .line 573
    iput-object v5, v1, Llm0;->l:Ljava/lang/Object;

    .line 574
    .line 575
    iput v4, v1, Llm0;->k:I

    .line 576
    .line 577
    invoke-static {v5, v3, v1}, Lsp0;->o(Lyw2;Li12;Lrj;)Ljava/lang/Object;

    .line 578
    .line 579
    .line 580
    move-result-object v0

    .line 581
    if-ne v0, v8, :cond_20

    .line 582
    .line 583
    :goto_18
    move-object v6, v8

    .line 584
    goto :goto_19

    .line 585
    :cond_22
    throw v0

    .line 586
    :cond_23
    :goto_19
    return-object v6

    .line 587
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
