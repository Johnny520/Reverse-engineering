.class public final Ldp1;
.super Ltw2;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic l:I

.field public m:I

.field public synthetic n:J

.field public final synthetic o:Lep1;

.field public final synthetic p:Lun0;


# direct methods
.method public synthetic constructor <init>(Lep1;Lxm0;Lt00;I)V
    .locals 0

    .line 14
    iput p4, p0, Ldp1;->l:I

    iput-object p1, p0, Ldp1;->o:Lep1;

    iput-object p2, p0, Ldp1;->p:Lun0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ltw2;-><init>(ILt00;)V

    return-void
.end method

.method public constructor <init>(Lmn0;JLep1;Lt00;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Ldp1;->l:I

    .line 3
    .line 4
    iput-object p1, p0, Ldp1;->p:Lun0;

    .line 5
    .line 6
    iput-wide p2, p0, Ldp1;->n:J

    .line 7
    .line 8
    iput-object p4, p0, Ldp1;->o:Lep1;

    .line 9
    .line 10
    invoke-direct {p0, v0, p5}, Ltw2;-><init>(ILt00;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Ldp1;->l:I

    .line 2
    .line 3
    sget-object v1, La83;->a:La83;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Lj20;

    .line 9
    .line 10
    check-cast p2, Lt00;

    .line 11
    .line 12
    invoke-virtual {p0, p2, p1}, Ldp1;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Ldp1;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Ldp1;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Ljava/lang/Number;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 26
    .line 27
    .line 28
    move-result-wide v2

    .line 29
    check-cast p2, Lt00;

    .line 30
    .line 31
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p0, p2, p1}, Ldp1;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    check-cast p0, Ldp1;

    .line 40
    .line 41
    invoke-virtual {p0, v1}, Ldp1;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0

    .line 46
    :pswitch_1
    check-cast p1, Ljava/lang/Number;

    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 49
    .line 50
    .line 51
    move-result-wide v2

    .line 52
    check-cast p2, Lt00;

    .line 53
    .line 54
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {p0, p2, p1}, Ldp1;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    check-cast p0, Ldp1;

    .line 63
    .line 64
    invoke-virtual {p0, v1}, Ldp1;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    return-object p0

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final p(Lt00;Ljava/lang/Object;)Lt00;
    .locals 9

    .line 1
    iget v0, p0, Ldp1;->l:I

    .line 2
    .line 3
    iget-object v1, p0, Ldp1;->o:Lep1;

    .line 4
    .line 5
    iget-object v2, p0, Ldp1;->p:Lun0;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v3, Ldp1;

    .line 11
    .line 12
    move-object v4, v2

    .line 13
    check-cast v4, Lmn0;

    .line 14
    .line 15
    iget-wide v5, p0, Ldp1;->n:J

    .line 16
    .line 17
    iget-object v7, p0, Ldp1;->o:Lep1;

    .line 18
    .line 19
    move-object v8, p1

    .line 20
    invoke-direct/range {v3 .. v8}, Ldp1;-><init>(Lmn0;JLep1;Lt00;)V

    .line 21
    .line 22
    .line 23
    return-object v3

    .line 24
    :pswitch_0
    move-object v8, p1

    .line 25
    new-instance p0, Ldp1;

    .line 26
    .line 27
    check-cast v2, Lxm0;

    .line 28
    .line 29
    const/4 p1, 0x1

    .line 30
    invoke-direct {p0, v1, v2, v8, p1}, Ldp1;-><init>(Lep1;Lxm0;Lt00;I)V

    .line 31
    .line 32
    .line 33
    check-cast p2, Ljava/lang/Number;

    .line 34
    .line 35
    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    .line 36
    .line 37
    .line 38
    move-result-wide p1

    .line 39
    iput-wide p1, p0, Ldp1;->n:J

    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_1
    move-object v8, p1

    .line 43
    new-instance p0, Ldp1;

    .line 44
    .line 45
    check-cast v2, Lxm0;

    .line 46
    .line 47
    const/4 p1, 0x0

    .line 48
    invoke-direct {p0, v1, v2, v8, p1}, Ldp1;-><init>(Lep1;Lxm0;Lt00;I)V

    .line 49
    .line 50
    .line 51
    check-cast p2, Ljava/lang/Number;

    .line 52
    .line 53
    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    .line 54
    .line 55
    .line 56
    move-result-wide p1

    .line 57
    iput-wide p1, p0, Ldp1;->n:J

    .line 58
    .line 59
    return-object p0

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Ldp1;->l:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    sget-object v3, La83;->a:La83;

    .line 6
    .line 7
    iget-object v4, p0, Ldp1;->p:Lun0;

    .line 8
    .line 9
    const-string v5, "call to \'resume\' before \'invoke\' with coroutine"

    .line 10
    .line 11
    sget-object v6, Lk20;->h:Lk20;

    .line 12
    .line 13
    iget-object v7, p0, Ldp1;->o:Lep1;

    .line 14
    .line 15
    const/4 v8, 0x1

    .line 16
    const/4 v9, 0x0

    .line 17
    packed-switch v0, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    iget-wide v0, p0, Ldp1;->n:J

    .line 21
    .line 22
    iget v2, p0, Ldp1;->m:I

    .line 23
    .line 24
    const/4 v10, 0x0

    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    if-ne v2, v8, :cond_0

    .line 28
    .line 29
    :try_start_0
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    move-exception p0

    .line 34
    goto :goto_2

    .line 35
    :cond_0
    invoke-static {v5}, Ls;->l(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    move-object v3, v9

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    :try_start_1
    check-cast v4, Lmn0;

    .line 44
    .line 45
    new-instance p1, Ljava/lang/Long;

    .line 46
    .line 47
    invoke-direct {p1, v0, v1}, Ljava/lang/Long;-><init>(J)V

    .line 48
    .line 49
    .line 50
    iput v8, p0, Ldp1;->m:I

    .line 51
    .line 52
    invoke-interface {v4, p1, p0}, Lmn0;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 56
    if-ne p0, v6, :cond_2

    .line 57
    .line 58
    move-object v3, v6

    .line 59
    goto :goto_1

    .line 60
    :cond_2
    :goto_0
    iget-wide p0, v7, Lep1;->e:J

    .line 61
    .line 62
    cmp-long p0, p0, v0

    .line 63
    .line 64
    if-nez p0, :cond_3

    .line 65
    .line 66
    iput-object v9, v7, Lep1;->d:Lzt2;

    .line 67
    .line 68
    iput-object v9, v7, Lep1;->f:Lfp1;

    .line 69
    .line 70
    invoke-virtual {v7, v10}, Lep1;->g(Z)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v7, v10}, Lep1;->f(Z)V

    .line 74
    .line 75
    .line 76
    :cond_3
    :goto_1
    return-object v3

    .line 77
    :goto_2
    iget-wide v2, v7, Lep1;->e:J

    .line 78
    .line 79
    cmp-long p1, v2, v0

    .line 80
    .line 81
    if-nez p1, :cond_4

    .line 82
    .line 83
    iput-object v9, v7, Lep1;->d:Lzt2;

    .line 84
    .line 85
    iput-object v9, v7, Lep1;->f:Lfp1;

    .line 86
    .line 87
    invoke-virtual {v7, v10}, Lep1;->g(Z)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v7, v10}, Lep1;->f(Z)V

    .line 91
    .line 92
    .line 93
    :cond_4
    throw p0

    .line 94
    :pswitch_0
    iget-wide v10, p0, Ldp1;->n:J

    .line 95
    .line 96
    iget v0, p0, Ldp1;->m:I

    .line 97
    .line 98
    const/4 v12, 0x3

    .line 99
    if-eqz v0, :cond_8

    .line 100
    .line 101
    if-eq v0, v8, :cond_7

    .line 102
    .line 103
    if-eq v0, v2, :cond_6

    .line 104
    .line 105
    if-ne v0, v12, :cond_5

    .line 106
    .line 107
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    goto :goto_6

    .line 111
    :cond_5
    invoke-static {v5}, Ls;->l(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    move-object v3, v9

    .line 115
    goto :goto_6

    .line 116
    :cond_6
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    goto :goto_4

    .line 120
    :cond_7
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_8
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    iget-object p1, v7, Lep1;->b:Lsc;

    .line 128
    .line 129
    new-instance v0, Ljava/lang/Float;

    .line 130
    .line 131
    invoke-direct {v0, v1}, Ljava/lang/Float;-><init>(F)V

    .line 132
    .line 133
    .line 134
    iput-wide v10, p0, Ldp1;->n:J

    .line 135
    .line 136
    iput v8, p0, Ldp1;->m:I

    .line 137
    .line 138
    invoke-virtual {p1, p0, v0}, Lsc;->e(Lt00;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    if-ne p1, v6, :cond_9

    .line 143
    .line 144
    goto :goto_5

    .line 145
    :cond_9
    :goto_3
    check-cast v4, Lxm0;

    .line 146
    .line 147
    invoke-interface {v4}, Lxm0;->a()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    iget-object p1, v7, Lep1;->i:Lnx1;

    .line 151
    .line 152
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 153
    .line 154
    invoke-virtual {p1, v0}, Lnx1;->setValue(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    new-instance p1, Lnx0;

    .line 158
    .line 159
    const/16 v0, 0x18

    .line 160
    .line 161
    invoke-direct {p1, v0}, Lnx0;-><init>(I)V

    .line 162
    .line 163
    .line 164
    iput-wide v10, p0, Ldp1;->n:J

    .line 165
    .line 166
    iput v2, p0, Ldp1;->m:I

    .line 167
    .line 168
    iget-object v0, p0, Lu00;->i:La20;

    .line 169
    .line 170
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    invoke-static {v0}, Lqp0;->A(La20;)Lxb;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    invoke-virtual {v0, p1, p0}, Lxb;->a(Lin0;Lt00;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    if-ne p1, v6, :cond_a

    .line 182
    .line 183
    goto :goto_5

    .line 184
    :cond_a
    :goto_4
    iput-wide v10, p0, Ldp1;->n:J

    .line 185
    .line 186
    iput v12, p0, Ldp1;->m:I

    .line 187
    .line 188
    invoke-static {v7, v10, v11, p0}, Lep1;->a(Lep1;JLu00;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    if-ne p0, v6, :cond_b

    .line 193
    .line 194
    :goto_5
    move-object v3, v6

    .line 195
    :cond_b
    :goto_6
    return-object v3

    .line 196
    :pswitch_1
    iget-wide v10, p0, Ldp1;->n:J

    .line 197
    .line 198
    iget v0, p0, Ldp1;->m:I

    .line 199
    .line 200
    if-eqz v0, :cond_e

    .line 201
    .line 202
    if-eq v0, v8, :cond_d

    .line 203
    .line 204
    if-ne v0, v2, :cond_c

    .line 205
    .line 206
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 207
    .line 208
    .line 209
    goto :goto_a

    .line 210
    :cond_c
    invoke-static {v5}, Ls;->l(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    move-object v3, v9

    .line 214
    goto :goto_b

    .line 215
    :cond_d
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 216
    .line 217
    .line 218
    goto :goto_8

    .line 219
    :cond_e
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 220
    .line 221
    .line 222
    iput-wide v10, p0, Ldp1;->n:J

    .line 223
    .line 224
    iput v8, p0, Ldp1;->m:I

    .line 225
    .line 226
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    new-instance p1, Lb2;

    .line 230
    .line 231
    const/16 v0, 0xb

    .line 232
    .line 233
    invoke-direct {p1, v7, v9, v0}, Lb2;-><init>(Ljava/lang/Object;Lt00;I)V

    .line 234
    .line 235
    .line 236
    invoke-static {p1, p0}, Lte;->u(Lmn0;Lt00;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object p1

    .line 240
    if-ne p1, v6, :cond_f

    .line 241
    .line 242
    goto :goto_7

    .line 243
    :cond_f
    move-object p1, v3

    .line 244
    :goto_7
    if-ne p1, v6, :cond_10

    .line 245
    .line 246
    goto :goto_9

    .line 247
    :cond_10
    :goto_8
    iget-wide v8, v7, Lep1;->e:J

    .line 248
    .line 249
    cmp-long p1, v8, v10

    .line 250
    .line 251
    if-eqz p1, :cond_11

    .line 252
    .line 253
    goto :goto_b

    .line 254
    :cond_11
    iget-object p1, v7, Lep1;->b:Lsc;

    .line 255
    .line 256
    new-instance v0, Ljava/lang/Float;

    .line 257
    .line 258
    invoke-direct {v0, v1}, Ljava/lang/Float;-><init>(F)V

    .line 259
    .line 260
    .line 261
    iput-wide v10, p0, Ldp1;->n:J

    .line 262
    .line 263
    iput v2, p0, Ldp1;->m:I

    .line 264
    .line 265
    invoke-virtual {p1, p0, v0}, Lsc;->e(Lt00;Ljava/lang/Object;)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object p0

    .line 269
    if-ne p0, v6, :cond_12

    .line 270
    .line 271
    :goto_9
    move-object v3, v6

    .line 272
    goto :goto_b

    .line 273
    :cond_12
    :goto_a
    iget-object p0, v7, Lep1;->i:Lnx1;

    .line 274
    .line 275
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 276
    .line 277
    invoke-virtual {p0, p1}, Lnx1;->setValue(Ljava/lang/Object;)V

    .line 278
    .line 279
    .line 280
    check-cast v4, Lxm0;

    .line 281
    .line 282
    invoke-interface {v4}, Lxm0;->a()Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    :goto_b
    return-object v3

    .line 286
    nop

    .line 287
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
