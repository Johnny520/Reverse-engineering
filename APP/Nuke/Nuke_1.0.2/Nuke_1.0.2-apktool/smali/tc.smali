.class public final Ltc;
.super Ltw2;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic l:I

.field public m:Ljava/lang/Object;

.field public n:I

.field public o:Ljava/lang/Object;

.field public p:Ljava/lang/Object;

.field public synthetic q:Ljava/lang/Object;

.field public final synthetic r:Ljava/lang/Object;

.field public final synthetic s:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcq1;Lxk1;Lxk1;Landroid/content/Context;Lxk1;Lt00;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    iput v0, p0, Ltc;->l:I

    .line 3
    .line 4
    iput-object p1, p0, Ltc;->o:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Ltc;->r:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, Ltc;->s:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p4, p0, Ltc;->p:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p5, p0, Ltc;->q:Ljava/lang/Object;

    .line 13
    .line 14
    const/4 p1, 0x2

    .line 15
    invoke-direct {p0, p1, p6}, Ltw2;-><init>(ILt00;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public constructor <init>(Lfq;Lsc;Lxk1;Lxk1;Lt00;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ltc;->l:I

    .line 19
    iput-object p1, p0, Ltc;->p:Ljava/lang/Object;

    iput-object p2, p0, Ltc;->q:Ljava/lang/Object;

    iput-object p3, p0, Ltc;->r:Ljava/lang/Object;

    iput-object p4, p0, Ltc;->s:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ltw2;-><init>(ILt00;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lin0;Lt00;I)V
    .locals 0

    .line 20
    iput p4, p0, Ltc;->l:I

    iput-object p1, p0, Ltc;->r:Ljava/lang/Object;

    iput-object p2, p0, Ltc;->s:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ltw2;-><init>(ILt00;)V

    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Ltc;->l:I

    .line 2
    .line 3
    sget-object v1, La83;->a:La83;

    .line 4
    .line 5
    check-cast p1, Lj20;

    .line 6
    .line 7
    check-cast p2, Lt00;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p2, p1}, Ltc;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Ltc;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Ltc;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p2, p1}, Ltc;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Ltc;

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Ltc;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :pswitch_1
    invoke-virtual {p0, p2, p1}, Ltc;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, Ltc;

    .line 39
    .line 40
    invoke-virtual {p0, v1}, Ltc;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0

    .line 45
    :pswitch_2
    invoke-virtual {p0, p2, p1}, Ltc;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    check-cast p0, Ltc;

    .line 50
    .line 51
    invoke-virtual {p0, v1}, Ltc;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0

    .line 56
    nop

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final p(Lt00;Ljava/lang/Object;)Lt00;
    .locals 10

    .line 1
    iget v0, p0, Ltc;->l:I

    .line 2
    .line 3
    iget-object v1, p0, Ltc;->s:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Ltc;->r:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v3, Ltc;

    .line 11
    .line 12
    iget-object v0, p0, Ltc;->o:Ljava/lang/Object;

    .line 13
    .line 14
    move-object v4, v0

    .line 15
    check-cast v4, Lcq1;

    .line 16
    .line 17
    move-object v5, v2

    .line 18
    check-cast v5, Lxk1;

    .line 19
    .line 20
    move-object v6, v1

    .line 21
    check-cast v6, Lxk1;

    .line 22
    .line 23
    iget-object v0, p0, Ltc;->p:Ljava/lang/Object;

    .line 24
    .line 25
    move-object v7, v0

    .line 26
    check-cast v7, Landroid/content/Context;

    .line 27
    .line 28
    iget-object p0, p0, Ltc;->q:Ljava/lang/Object;

    .line 29
    .line 30
    move-object v8, p0

    .line 31
    check-cast v8, Lxk1;

    .line 32
    .line 33
    move-object v9, p1

    .line 34
    invoke-direct/range {v3 .. v9}, Ltc;-><init>(Lcq1;Lxk1;Lxk1;Landroid/content/Context;Lxk1;Lt00;)V

    .line 35
    .line 36
    .line 37
    iput-object p2, v3, Ltc;->m:Ljava/lang/Object;

    .line 38
    .line 39
    return-object v3

    .line 40
    :pswitch_0
    move-object v9, p1

    .line 41
    new-instance p0, Ltc;

    .line 42
    .line 43
    check-cast v2, Lhl1;

    .line 44
    .line 45
    check-cast v1, Lin0;

    .line 46
    .line 47
    const/4 p1, 0x2

    .line 48
    invoke-direct {p0, v2, v1, v9, p1}, Ltc;-><init>(Ljava/lang/Object;Lin0;Lt00;I)V

    .line 49
    .line 50
    .line 51
    iput-object p2, p0, Ltc;->q:Ljava/lang/Object;

    .line 52
    .line 53
    return-object p0

    .line 54
    :pswitch_1
    move-object v9, p1

    .line 55
    new-instance p0, Ltc;

    .line 56
    .line 57
    check-cast v2, Lgl1;

    .line 58
    .line 59
    check-cast v1, Lin0;

    .line 60
    .line 61
    const/4 p1, 0x1

    .line 62
    invoke-direct {p0, v2, v1, v9, p1}, Ltc;-><init>(Ljava/lang/Object;Lin0;Lt00;I)V

    .line 63
    .line 64
    .line 65
    iput-object p2, p0, Ltc;->q:Ljava/lang/Object;

    .line 66
    .line 67
    return-object p0

    .line 68
    :pswitch_2
    move-object v9, p1

    .line 69
    new-instance v4, Ltc;

    .line 70
    .line 71
    iget-object p1, p0, Ltc;->p:Ljava/lang/Object;

    .line 72
    .line 73
    move-object v5, p1

    .line 74
    check-cast v5, Lfq;

    .line 75
    .line 76
    iget-object p0, p0, Ltc;->q:Ljava/lang/Object;

    .line 77
    .line 78
    move-object v6, p0

    .line 79
    check-cast v6, Lsc;

    .line 80
    .line 81
    move-object v7, v2

    .line 82
    check-cast v7, Lxk1;

    .line 83
    .line 84
    move-object v8, v1

    .line 85
    check-cast v8, Lxk1;

    .line 86
    .line 87
    invoke-direct/range {v4 .. v9}, Ltc;-><init>(Lfq;Lsc;Lxk1;Lxk1;Lt00;)V

    .line 88
    .line 89
    .line 90
    iput-object p2, v4, Ltc;->m:Ljava/lang/Object;

    .line 91
    .line 92
    return-object v4

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Ltc;->l:I

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    sget-object v3, La83;->a:La83;

    .line 7
    .line 8
    iget-object v4, v1, Ltc;->r:Ljava/lang/Object;

    .line 9
    .line 10
    const-string v5, "call to \'resume\' before \'invoke\' with coroutine"

    .line 11
    .line 12
    sget-object v6, Lk20;->h:Lk20;

    .line 13
    .line 14
    iget-object v7, v1, Ltc;->s:Ljava/lang/Object;

    .line 15
    .line 16
    const/4 v8, 0x1

    .line 17
    const/4 v9, 0x0

    .line 18
    packed-switch v0, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    check-cast v7, Lxk1;

    .line 22
    .line 23
    iget-object v0, v1, Ltc;->m:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Lj20;

    .line 26
    .line 27
    iget v0, v1, Ltc;->n:I

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    if-ne v0, v8, :cond_0

    .line 32
    .line 33
    :try_start_0
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception v0

    .line 38
    goto :goto_1

    .line 39
    :cond_0
    invoke-static {v5}, Ls;->l(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    move-object v3, v9

    .line 43
    goto :goto_3

    .line 44
    :cond_1
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    iget-object v0, v1, Ltc;->o:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v0, Lcq1;

    .line 50
    .line 51
    :try_start_1
    sget-object v2, Lsq1;->a:Lsq1;

    .line 52
    .line 53
    iget-object v0, v0, Lcq1;->a:Ljava/lang/String;

    .line 54
    .line 55
    iput-object v9, v1, Ltc;->m:Ljava/lang/Object;

    .line 56
    .line 57
    iput v8, v1, Ltc;->n:I

    .line 58
    .line 59
    invoke-virtual {v2, v0, v1}, Lsq1;->l(Ljava/lang/String;Lu00;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 63
    if-ne v0, v6, :cond_2

    .line 64
    .line 65
    move-object v3, v6

    .line 66
    goto :goto_3

    .line 67
    :cond_2
    :goto_0
    move-object v2, v3

    .line 68
    goto :goto_2

    .line 69
    :goto_1
    new-instance v2, Lx92;

    .line 70
    .line 71
    invoke-direct {v2, v0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 72
    .line 73
    .line 74
    :goto_2
    check-cast v4, Lxk1;

    .line 75
    .line 76
    instance-of v0, v2, Lx92;

    .line 77
    .line 78
    if-nez v0, :cond_3

    .line 79
    .line 80
    move-object v0, v2

    .line 81
    check-cast v0, La83;

    .line 82
    .line 83
    invoke-interface {v4, v9}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    invoke-interface {v7, v9}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    :cond_3
    iget-object v0, v1, Ltc;->p:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v0, Landroid/content/Context;

    .line 92
    .line 93
    invoke-static {v2}, Ly92;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    if-eqz v2, :cond_5

    .line 98
    .line 99
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    if-nez v2, :cond_4

    .line 104
    .line 105
    const v2, 0x790b0214

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    :cond_4
    invoke-interface {v7, v2}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    :cond_5
    iget-object v0, v1, Ltc;->q:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v0, Lxk1;

    .line 121
    .line 122
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 123
    .line 124
    invoke-interface {v0, v1}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    :goto_3
    return-object v3

    .line 128
    :pswitch_0
    move-object v0, v4

    .line 129
    check-cast v0, Lhl1;

    .line 130
    .line 131
    iget v3, v1, Ltc;->n:I

    .line 132
    .line 133
    if-eqz v3, :cond_8

    .line 134
    .line 135
    if-eq v3, v8, :cond_7

    .line 136
    .line 137
    if-ne v3, v2, :cond_6

    .line 138
    .line 139
    iget-object v0, v1, Ltc;->m:Ljava/lang/Object;

    .line 140
    .line 141
    move-object v2, v0

    .line 142
    check-cast v2, Lhl1;

    .line 143
    .line 144
    iget-object v0, v1, Ltc;->o:Ljava/lang/Object;

    .line 145
    .line 146
    move-object v3, v0

    .line 147
    check-cast v3, Lil1;

    .line 148
    .line 149
    iget-object v0, v1, Ltc;->q:Ljava/lang/Object;

    .line 150
    .line 151
    move-object v1, v0

    .line 152
    check-cast v1, Lel1;

    .line 153
    .line 154
    :try_start_2
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 155
    .line 156
    .line 157
    move-object/from16 v0, p1

    .line 158
    .line 159
    goto/16 :goto_8

    .line 160
    .line 161
    :catchall_1
    move-exception v0

    .line 162
    goto/16 :goto_b

    .line 163
    .line 164
    :cond_6
    invoke-static {v5}, Ls;->l(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    move-object v6, v9

    .line 168
    goto/16 :goto_a

    .line 169
    .line 170
    :cond_7
    iget-object v0, v1, Ltc;->p:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast v0, Lhl1;

    .line 173
    .line 174
    iget-object v3, v1, Ltc;->m:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast v3, Lin0;

    .line 177
    .line 178
    iget-object v4, v1, Ltc;->o:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast v4, Lil1;

    .line 181
    .line 182
    iget-object v5, v1, Ltc;->q:Ljava/lang/Object;

    .line 183
    .line 184
    check-cast v5, Lel1;

    .line 185
    .line 186
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    move-object v7, v4

    .line 190
    move-object v4, v3

    .line 191
    :goto_4
    move-object v3, v0

    .line 192
    goto :goto_7

    .line 193
    :cond_8
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    iget-object v3, v1, Ltc;->q:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast v3, Lj20;

    .line 199
    .line 200
    new-instance v10, Lel1;

    .line 201
    .line 202
    invoke-interface {v3}, Lj20;->g()La20;

    .line 203
    .line 204
    .line 205
    move-result-object v3

    .line 206
    sget-object v4, Lsn;->K:Lsn;

    .line 207
    .line 208
    invoke-interface {v3, v4}, La20;->o(Lz10;)Ly10;

    .line 209
    .line 210
    .line 211
    move-result-object v3

    .line 212
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    check-cast v3, Lk21;

    .line 216
    .line 217
    invoke-direct {v10, v3}, Lel1;-><init>(Lk21;)V

    .line 218
    .line 219
    .line 220
    iget-object v3, v0, Lhl1;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 221
    .line 222
    :goto_5
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v4

    .line 226
    move-object v11, v4

    .line 227
    check-cast v11, Lel1;

    .line 228
    .line 229
    if-eqz v11, :cond_a

    .line 230
    .line 231
    sget-object v4, Lcl1;->h:Lcl1;

    .line 232
    .line 233
    invoke-virtual {v4, v4}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 234
    .line 235
    .line 236
    move-result v4

    .line 237
    if-ltz v4, :cond_9

    .line 238
    .line 239
    goto :goto_6

    .line 240
    :cond_9
    new-instance v0, Ljava/util/concurrent/CancellationException;

    .line 241
    .line 242
    const-string v1, "Current mutation had a higher priority"

    .line 243
    .line 244
    invoke-direct {v0, v1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    throw v0

    .line 248
    :cond_a
    :goto_6
    invoke-virtual {v3, v11, v10}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    move-result v4

    .line 252
    if-eqz v4, :cond_11

    .line 253
    .line 254
    if-eqz v11, :cond_b

    .line 255
    .line 256
    iget-object v3, v11, Lel1;->a:Lk21;

    .line 257
    .line 258
    new-instance v4, Lks;

    .line 259
    .line 260
    const-string v5, "Mutation interrupted"

    .line 261
    .line 262
    invoke-direct {v4, v5, v8}, Lks;-><init>(Ljava/lang/String;I)V

    .line 263
    .line 264
    .line 265
    invoke-interface {v3, v4}, Lk21;->c(Ljava/util/concurrent/CancellationException;)V

    .line 266
    .line 267
    .line 268
    :cond_b
    iget-object v3, v0, Lhl1;->b:Lkl1;

    .line 269
    .line 270
    move-object v4, v7

    .line 271
    check-cast v4, Lin0;

    .line 272
    .line 273
    iput-object v10, v1, Ltc;->q:Ljava/lang/Object;

    .line 274
    .line 275
    iput-object v3, v1, Ltc;->o:Ljava/lang/Object;

    .line 276
    .line 277
    iput-object v4, v1, Ltc;->m:Ljava/lang/Object;

    .line 278
    .line 279
    iput-object v0, v1, Ltc;->p:Ljava/lang/Object;

    .line 280
    .line 281
    iput v8, v1, Ltc;->n:I

    .line 282
    .line 283
    invoke-virtual {v3, v1}, Lkl1;->d(Lu00;)Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v5

    .line 287
    if-ne v5, v6, :cond_c

    .line 288
    .line 289
    goto :goto_a

    .line 290
    :cond_c
    move-object v7, v3

    .line 291
    move-object v5, v10

    .line 292
    goto :goto_4

    .line 293
    :goto_7
    :try_start_3
    iput-object v5, v1, Ltc;->q:Ljava/lang/Object;

    .line 294
    .line 295
    iput-object v7, v1, Ltc;->o:Ljava/lang/Object;

    .line 296
    .line 297
    iput-object v3, v1, Ltc;->m:Ljava/lang/Object;

    .line 298
    .line 299
    iput-object v9, v1, Ltc;->p:Ljava/lang/Object;

    .line 300
    .line 301
    iput v2, v1, Ltc;->n:I

    .line 302
    .line 303
    invoke-interface {v4, v1}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 307
    if-ne v0, v6, :cond_d

    .line 308
    .line 309
    goto :goto_a

    .line 310
    :cond_d
    move-object v2, v3

    .line 311
    move-object v1, v5

    .line 312
    move-object v3, v7

    .line 313
    :goto_8
    :try_start_4
    iget-object v2, v2, Lhl1;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 314
    .line 315
    :cond_e
    invoke-virtual {v2, v1, v9}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 316
    .line 317
    .line 318
    move-result v4

    .line 319
    if-eqz v4, :cond_f

    .line 320
    .line 321
    goto :goto_9

    .line 322
    :cond_f
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 326
    if-eq v4, v1, :cond_e

    .line 327
    .line 328
    :goto_9
    check-cast v3, Lkl1;

    .line 329
    .line 330
    invoke-virtual {v3, v9}, Lkl1;->f(Ljava/lang/Object;)V

    .line 331
    .line 332
    .line 333
    move-object v6, v0

    .line 334
    :goto_a
    return-object v6

    .line 335
    :catchall_2
    move-exception v0

    .line 336
    goto :goto_d

    .line 337
    :catchall_3
    move-exception v0

    .line 338
    move-object v2, v3

    .line 339
    move-object v1, v5

    .line 340
    move-object v3, v7

    .line 341
    :goto_b
    :try_start_5
    iget-object v2, v2, Lhl1;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 342
    .line 343
    :goto_c
    invoke-virtual {v2, v1, v9}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 344
    .line 345
    .line 346
    move-result v4

    .line 347
    if-nez v4, :cond_10

    .line 348
    .line 349
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v4

    .line 353
    if-ne v4, v1, :cond_10

    .line 354
    .line 355
    goto :goto_c

    .line 356
    :cond_10
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 357
    :goto_d
    check-cast v3, Lkl1;

    .line 358
    .line 359
    invoke-virtual {v3, v9}, Lkl1;->f(Ljava/lang/Object;)V

    .line 360
    .line 361
    .line 362
    throw v0

    .line 363
    :cond_11
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    move-result-object v4

    .line 367
    if-eq v4, v11, :cond_a

    .line 368
    .line 369
    goto/16 :goto_5

    .line 370
    .line 371
    :pswitch_1
    check-cast v4, Lgl1;

    .line 372
    .line 373
    iget v0, v1, Ltc;->n:I

    .line 374
    .line 375
    if-eqz v0, :cond_14

    .line 376
    .line 377
    if-eq v0, v8, :cond_13

    .line 378
    .line 379
    if-ne v0, v2, :cond_12

    .line 380
    .line 381
    iget-object v0, v1, Ltc;->m:Ljava/lang/Object;

    .line 382
    .line 383
    move-object v2, v0

    .line 384
    check-cast v2, Lgl1;

    .line 385
    .line 386
    iget-object v0, v1, Ltc;->o:Ljava/lang/Object;

    .line 387
    .line 388
    move-object v3, v0

    .line 389
    check-cast v3, Lil1;

    .line 390
    .line 391
    iget-object v0, v1, Ltc;->q:Ljava/lang/Object;

    .line 392
    .line 393
    move-object v1, v0

    .line 394
    check-cast v1, Ldl1;

    .line 395
    .line 396
    :try_start_6
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 397
    .line 398
    .line 399
    move-object/from16 v0, p1

    .line 400
    .line 401
    goto/16 :goto_10

    .line 402
    .line 403
    :catchall_4
    move-exception v0

    .line 404
    goto/16 :goto_13

    .line 405
    .line 406
    :cond_12
    invoke-static {v5}, Ls;->l(Ljava/lang/String;)V

    .line 407
    .line 408
    .line 409
    move-object v6, v9

    .line 410
    goto/16 :goto_12

    .line 411
    .line 412
    :cond_13
    iget-object v0, v1, Ltc;->p:Ljava/lang/Object;

    .line 413
    .line 414
    move-object v4, v0

    .line 415
    check-cast v4, Lgl1;

    .line 416
    .line 417
    iget-object v0, v1, Ltc;->m:Ljava/lang/Object;

    .line 418
    .line 419
    check-cast v0, Lin0;

    .line 420
    .line 421
    iget-object v3, v1, Ltc;->o:Ljava/lang/Object;

    .line 422
    .line 423
    check-cast v3, Lil1;

    .line 424
    .line 425
    iget-object v5, v1, Ltc;->q:Ljava/lang/Object;

    .line 426
    .line 427
    check-cast v5, Ldl1;

    .line 428
    .line 429
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 430
    .line 431
    .line 432
    move-object/from16 v19, v4

    .line 433
    .line 434
    move-object v4, v3

    .line 435
    move-object v3, v5

    .line 436
    :goto_e
    move-object/from16 v5, v19

    .line 437
    .line 438
    goto :goto_f

    .line 439
    :cond_14
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 440
    .line 441
    .line 442
    iget-object v0, v1, Ltc;->q:Ljava/lang/Object;

    .line 443
    .line 444
    check-cast v0, Lj20;

    .line 445
    .line 446
    new-instance v3, Ldl1;

    .line 447
    .line 448
    invoke-interface {v0}, Lj20;->g()La20;

    .line 449
    .line 450
    .line 451
    move-result-object v0

    .line 452
    sget-object v5, Lsn;->K:Lsn;

    .line 453
    .line 454
    invoke-interface {v0, v5}, La20;->o(Lz10;)Ly10;

    .line 455
    .line 456
    .line 457
    move-result-object v0

    .line 458
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 459
    .line 460
    .line 461
    check-cast v0, Lk21;

    .line 462
    .line 463
    sget-object v5, Lbl1;->h:Lbl1;

    .line 464
    .line 465
    invoke-direct {v3, v5, v0}, Ldl1;-><init>(Lbl1;Lk21;)V

    .line 466
    .line 467
    .line 468
    invoke-static {v4, v3}, Lgl1;->a(Lgl1;Ldl1;)V

    .line 469
    .line 470
    .line 471
    iget-object v0, v4, Lgl1;->b:Lkl1;

    .line 472
    .line 473
    move-object v5, v7

    .line 474
    check-cast v5, Lin0;

    .line 475
    .line 476
    iput-object v3, v1, Ltc;->q:Ljava/lang/Object;

    .line 477
    .line 478
    iput-object v0, v1, Ltc;->o:Ljava/lang/Object;

    .line 479
    .line 480
    iput-object v5, v1, Ltc;->m:Ljava/lang/Object;

    .line 481
    .line 482
    iput-object v4, v1, Ltc;->p:Ljava/lang/Object;

    .line 483
    .line 484
    iput v8, v1, Ltc;->n:I

    .line 485
    .line 486
    invoke-virtual {v0, v1}, Lkl1;->d(Lu00;)Ljava/lang/Object;

    .line 487
    .line 488
    .line 489
    move-result-object v7

    .line 490
    if-ne v7, v6, :cond_15

    .line 491
    .line 492
    goto :goto_12

    .line 493
    :cond_15
    move-object/from16 v19, v4

    .line 494
    .line 495
    move-object v4, v0

    .line 496
    move-object v0, v5

    .line 497
    goto :goto_e

    .line 498
    :goto_f
    :try_start_7
    iput-object v3, v1, Ltc;->q:Ljava/lang/Object;

    .line 499
    .line 500
    iput-object v4, v1, Ltc;->o:Ljava/lang/Object;

    .line 501
    .line 502
    iput-object v5, v1, Ltc;->m:Ljava/lang/Object;

    .line 503
    .line 504
    iput-object v9, v1, Ltc;->p:Ljava/lang/Object;

    .line 505
    .line 506
    iput v2, v1, Ltc;->n:I

    .line 507
    .line 508
    invoke-interface {v0, v1}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 509
    .line 510
    .line 511
    move-result-object v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 512
    if-ne v0, v6, :cond_16

    .line 513
    .line 514
    goto :goto_12

    .line 515
    :cond_16
    move-object v1, v3

    .line 516
    move-object v3, v4

    .line 517
    move-object v2, v5

    .line 518
    :goto_10
    :try_start_8
    iget-object v2, v2, Lgl1;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 519
    .line 520
    :cond_17
    invoke-virtual {v2, v1, v9}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 521
    .line 522
    .line 523
    move-result v4

    .line 524
    if-eqz v4, :cond_18

    .line 525
    .line 526
    goto :goto_11

    .line 527
    :cond_18
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 528
    .line 529
    .line 530
    move-result-object v4
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 531
    if-eq v4, v1, :cond_17

    .line 532
    .line 533
    :goto_11
    check-cast v3, Lkl1;

    .line 534
    .line 535
    invoke-virtual {v3, v9}, Lkl1;->f(Ljava/lang/Object;)V

    .line 536
    .line 537
    .line 538
    move-object v6, v0

    .line 539
    :goto_12
    return-object v6

    .line 540
    :catchall_5
    move-exception v0

    .line 541
    goto :goto_15

    .line 542
    :catchall_6
    move-exception v0

    .line 543
    move-object v1, v3

    .line 544
    move-object v3, v4

    .line 545
    move-object v2, v5

    .line 546
    :goto_13
    :try_start_9
    iget-object v2, v2, Lgl1;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 547
    .line 548
    :goto_14
    invoke-virtual {v2, v1, v9}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 549
    .line 550
    .line 551
    move-result v4

    .line 552
    if-nez v4, :cond_19

    .line 553
    .line 554
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 555
    .line 556
    .line 557
    move-result-object v4

    .line 558
    if-ne v4, v1, :cond_19

    .line 559
    .line 560
    goto :goto_14

    .line 561
    :cond_19
    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .line 562
    :goto_15
    check-cast v3, Lkl1;

    .line 563
    .line 564
    invoke-virtual {v3, v9}, Lkl1;->f(Ljava/lang/Object;)V

    .line 565
    .line 566
    .line 567
    throw v0

    .line 568
    :pswitch_2
    iget-object v0, v1, Ltc;->p:Ljava/lang/Object;

    .line 569
    .line 570
    check-cast v0, Lfq;

    .line 571
    .line 572
    iget v2, v1, Ltc;->n:I

    .line 573
    .line 574
    if-eqz v2, :cond_1b

    .line 575
    .line 576
    if-ne v2, v8, :cond_1a

    .line 577
    .line 578
    iget-object v2, v1, Ltc;->o:Ljava/lang/Object;

    .line 579
    .line 580
    check-cast v2, Lin;

    .line 581
    .line 582
    iget-object v5, v1, Ltc;->m:Ljava/lang/Object;

    .line 583
    .line 584
    check-cast v5, Lj20;

    .line 585
    .line 586
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 587
    .line 588
    .line 589
    move-object/from16 v10, p1

    .line 590
    .line 591
    goto :goto_17

    .line 592
    :cond_1a
    invoke-static {v5}, Ls;->l(Ljava/lang/String;)V

    .line 593
    .line 594
    .line 595
    move-object v3, v9

    .line 596
    goto :goto_1a

    .line 597
    :cond_1b
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 598
    .line 599
    .line 600
    iget-object v2, v1, Ltc;->m:Ljava/lang/Object;

    .line 601
    .line 602
    check-cast v2, Lj20;

    .line 603
    .line 604
    invoke-interface {v0}, Lfq;->iterator()Lin;

    .line 605
    .line 606
    .line 607
    move-result-object v5

    .line 608
    move-object/from16 v19, v5

    .line 609
    .line 610
    move-object v5, v2

    .line 611
    move-object/from16 v2, v19

    .line 612
    .line 613
    :goto_16
    iput-object v5, v1, Ltc;->m:Ljava/lang/Object;

    .line 614
    .line 615
    iput-object v2, v1, Ltc;->o:Ljava/lang/Object;

    .line 616
    .line 617
    iput v8, v1, Ltc;->n:I

    .line 618
    .line 619
    invoke-virtual {v2, v1}, Lin;->b(Lu00;)Ljava/lang/Object;

    .line 620
    .line 621
    .line 622
    move-result-object v10

    .line 623
    if-ne v10, v6, :cond_1c

    .line 624
    .line 625
    move-object v3, v6

    .line 626
    goto :goto_1a

    .line 627
    :cond_1c
    :goto_17
    check-cast v10, Ljava/lang/Boolean;

    .line 628
    .line 629
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    .line 630
    .line 631
    .line 632
    move-result v10

    .line 633
    if-eqz v10, :cond_1f

    .line 634
    .line 635
    invoke-virtual {v2}, Lin;->c()Ljava/lang/Object;

    .line 636
    .line 637
    .line 638
    move-result-object v10

    .line 639
    invoke-interface {v0}, Lfq;->m()Ljava/lang/Object;

    .line 640
    .line 641
    .line 642
    move-result-object v11

    .line 643
    instance-of v12, v11, Loq;

    .line 644
    .line 645
    if-nez v12, :cond_1d

    .line 646
    .line 647
    goto :goto_18

    .line 648
    :cond_1d
    move-object v11, v9

    .line 649
    :goto_18
    if-nez v11, :cond_1e

    .line 650
    .line 651
    move-object v13, v10

    .line 652
    goto :goto_19

    .line 653
    :cond_1e
    move-object v13, v11

    .line 654
    :goto_19
    new-instance v12, Lk9;

    .line 655
    .line 656
    iget-object v10, v1, Ltc;->q:Ljava/lang/Object;

    .line 657
    .line 658
    move-object v14, v10

    .line 659
    check-cast v14, Lsc;

    .line 660
    .line 661
    move-object v15, v4

    .line 662
    check-cast v15, Lxk1;

    .line 663
    .line 664
    move-object/from16 v16, v7

    .line 665
    .line 666
    check-cast v16, Lxk1;

    .line 667
    .line 668
    const/16 v17, 0x0

    .line 669
    .line 670
    const/16 v18, 0x1

    .line 671
    .line 672
    invoke-direct/range {v12 .. v18}, Lk9;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lt00;I)V

    .line 673
    .line 674
    .line 675
    const/4 v10, 0x3

    .line 676
    invoke-static {v5, v9, v12, v10}, Lp7;->A(Lj20;La20;Lmn0;I)Lzt2;

    .line 677
    .line 678
    .line 679
    goto :goto_16

    .line 680
    :cond_1f
    :goto_1a
    return-object v3

    .line 681
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
