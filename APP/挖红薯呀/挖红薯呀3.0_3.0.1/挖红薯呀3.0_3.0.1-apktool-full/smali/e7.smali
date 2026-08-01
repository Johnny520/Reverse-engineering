.class public final Le7;
.super Lm51;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# instance fields
.field public final synthetic h:I

.field public i:Ljava/lang/Object;

.field public j:I

.field public k:Ljava/lang/Object;

.field public l:Ljava/lang/Object;

.field public synthetic m:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/Object;

.field public final synthetic o:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lbi0;Lsw;Lik;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Le7;->h:I

    .line 18
    iput-object p1, p0, Le7;->n:Ljava/lang/Object;

    iput-object p2, p0, Le7;->o:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lm51;-><init>(ILik;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lik;I)V
    .locals 0

    .line 1
    iput p7, p0, Le7;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Le7;->k:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Le7;->l:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Le7;->m:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p4, p0, Le7;->n:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p5, p0, Le7;->o:Ljava/lang/Object;

    .line 12
    .line 13
    const/4 p1, 0x2

    .line 14
    invoke-direct {p0, p1, p6}, Lm51;-><init>(ILik;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Lmd;Lb7;Loh0;Loh0;Lik;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Le7;->h:I

    .line 19
    iput-object p1, p0, Le7;->l:Ljava/lang/Object;

    iput-object p2, p0, Le7;->m:Ljava/lang/Object;

    iput-object p3, p0, Le7;->n:Ljava/lang/Object;

    iput-object p4, p0, Le7;->o:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lm51;-><init>(ILik;)V

    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Lik;)Lik;
    .locals 12

    .line 1
    iget v0, p0, Le7;->h:I

    .line 2
    .line 3
    iget-object v1, p0, Le7;->o:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Le7;->n:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v3, Le7;

    .line 11
    .line 12
    iget-object v0, p0, Le7;->k:Ljava/lang/Object;

    .line 13
    .line 14
    move-object v4, v0

    .line 15
    check-cast v4, Lzt0;

    .line 16
    .line 17
    iget-object v0, p0, Le7;->l:Ljava/lang/Object;

    .line 18
    .line 19
    move-object v5, v0

    .line 20
    check-cast v5, Lot0;

    .line 21
    .line 22
    iget-object p0, p0, Le7;->m:Ljava/lang/Object;

    .line 23
    .line 24
    move-object v6, p0

    .line 25
    check-cast v6, Lx90;

    .line 26
    .line 27
    move-object v7, v2

    .line 28
    check-cast v7, Lme1;

    .line 29
    .line 30
    move-object v8, v1

    .line 31
    check-cast v8, Landroid/view/View;

    .line 32
    .line 33
    const/4 v10, 0x3

    .line 34
    move-object v9, p2

    .line 35
    invoke-direct/range {v3 .. v10}, Le7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lik;I)V

    .line 36
    .line 37
    .line 38
    iput-object p1, v3, Le7;->i:Ljava/lang/Object;

    .line 39
    .line 40
    return-object v3

    .line 41
    :pswitch_0
    move-object v9, p2

    .line 42
    new-instance v4, Le7;

    .line 43
    .line 44
    iget-object p2, p0, Le7;->k:Ljava/lang/Object;

    .line 45
    .line 46
    move-object v5, p2

    .line 47
    check-cast v5, Lrr0;

    .line 48
    .line 49
    iget-object p2, p0, Le7;->l:Ljava/lang/Object;

    .line 50
    .line 51
    move-object v6, p2

    .line 52
    check-cast v6, Lbg;

    .line 53
    .line 54
    iget-object p0, p0, Le7;->m:Ljava/lang/Object;

    .line 55
    .line 56
    move-object v7, p0

    .line 57
    check-cast v7, Lsw;

    .line 58
    .line 59
    move-object v8, v2

    .line 60
    check-cast v8, Lsw;

    .line 61
    .line 62
    check-cast v1, Lag;

    .line 63
    .line 64
    const/4 v11, 0x2

    .line 65
    move-object v10, v9

    .line 66
    move-object v9, v1

    .line 67
    invoke-direct/range {v4 .. v11}, Le7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lik;I)V

    .line 68
    .line 69
    .line 70
    iput-object p1, v4, Le7;->i:Ljava/lang/Object;

    .line 71
    .line 72
    return-object v4

    .line 73
    :pswitch_1
    move-object v9, p2

    .line 74
    new-instance p0, Le7;

    .line 75
    .line 76
    check-cast v2, Lbi0;

    .line 77
    .line 78
    check-cast v1, Lsw;

    .line 79
    .line 80
    invoke-direct {p0, v2, v1, v9}, Le7;-><init>(Lbi0;Lsw;Lik;)V

    .line 81
    .line 82
    .line 83
    iput-object p1, p0, Le7;->m:Ljava/lang/Object;

    .line 84
    .line 85
    return-object p0

    .line 86
    :pswitch_2
    move-object v9, p2

    .line 87
    new-instance v4, Le7;

    .line 88
    .line 89
    iget-object p2, p0, Le7;->l:Ljava/lang/Object;

    .line 90
    .line 91
    move-object v5, p2

    .line 92
    check-cast v5, Lmd;

    .line 93
    .line 94
    iget-object p0, p0, Le7;->m:Ljava/lang/Object;

    .line 95
    .line 96
    move-object v6, p0

    .line 97
    check-cast v6, Lb7;

    .line 98
    .line 99
    move-object v7, v2

    .line 100
    check-cast v7, Loh0;

    .line 101
    .line 102
    move-object v8, v1

    .line 103
    check-cast v8, Loh0;

    .line 104
    .line 105
    invoke-direct/range {v4 .. v9}, Le7;-><init>(Lmd;Lb7;Loh0;Loh0;Lik;)V

    .line 106
    .line 107
    .line 108
    iput-object p1, v4, Le7;->i:Ljava/lang/Object;

    .line 109
    .line 110
    return-object v4

    .line 111
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Le7;->h:I

    .line 2
    .line 3
    sget-object v1, Lna1;->a:Lna1;

    .line 4
    .line 5
    check-cast p1, Lyk;

    .line 6
    .line 7
    check-cast p2, Lik;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1, p2}, Le7;->g(Ljava/lang/Object;Lik;)Lik;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Le7;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Le7;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Le7;->g(Ljava/lang/Object;Lik;)Lik;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Le7;

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Le7;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :pswitch_1
    invoke-virtual {p0, p1, p2}, Le7;->g(Ljava/lang/Object;Lik;)Lik;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, Le7;

    .line 39
    .line 40
    invoke-virtual {p0, v1}, Le7;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0

    .line 45
    :pswitch_2
    invoke-virtual {p0, p1, p2}, Le7;->g(Ljava/lang/Object;Lik;)Lik;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    check-cast p0, Le7;

    .line 50
    .line 51
    invoke-virtual {p0, v1}, Le7;->m(Ljava/lang/Object;)Ljava/lang/Object;

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

.method public final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Le7;->h:I

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    sget-object v3, Lna1;->a:Lna1;

    .line 7
    .line 8
    iget-object v4, v0, Le7;->o:Ljava/lang/Object;

    .line 9
    .line 10
    const-string v5, "call to \'resume\' before \'invoke\' with coroutine"

    .line 11
    .line 12
    sget-object v6, Lzk;->d:Lzk;

    .line 13
    .line 14
    iget-object v7, v0, Le7;->n:Ljava/lang/Object;

    .line 15
    .line 16
    const/4 v8, 0x1

    .line 17
    const/4 v9, 0x0

    .line 18
    packed-switch v1, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    check-cast v7, Lme1;

    .line 22
    .line 23
    iget-object v1, v0, Le7;->m:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v1, Lx90;

    .line 26
    .line 27
    iget v10, v0, Le7;->j:I

    .line 28
    .line 29
    if-eqz v10, :cond_1

    .line 30
    .line 31
    if-ne v10, v8, :cond_0

    .line 32
    .line 33
    iget-object v0, v0, Le7;->i:Ljava/lang/Object;

    .line 34
    .line 35
    move-object v2, v0

    .line 36
    check-cast v2, Lc40;

    .line 37
    .line 38
    :try_start_0
    invoke-static/range {p1 .. p1}, Lw60;->M(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    goto/16 :goto_3

    .line 42
    .line 43
    :catchall_0
    move-exception v0

    .line 44
    goto/16 :goto_5

    .line 45
    .line 46
    :cond_0
    invoke-static {v5}, Lxc;->o(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    move-object v3, v9

    .line 50
    goto/16 :goto_4

    .line 51
    .line 52
    :cond_1
    invoke-static/range {p1 .. p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iget-object v5, v0, Le7;->i:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v5, Lyk;

    .line 58
    .line 59
    :try_start_1
    iget-object v10, v0, Le7;->k:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v10, Lzt0;

    .line 62
    .line 63
    iget-object v10, v10, Lzt0;->d:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v10, Lyf0;

    .line 66
    .line 67
    if-eqz v10, :cond_2

    .line 68
    .line 69
    check-cast v4, Landroid/view/View;

    .line 70
    .line 71
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    invoke-virtual {v4}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    invoke-static {v4}, Loe1;->a(Landroid/content/Context;)Lx31;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    invoke-interface {v4}, Lx31;->getValue()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v11

    .line 87
    check-cast v11, Ljava/lang/Number;

    .line 88
    .line 89
    invoke-virtual {v11}, Ljava/lang/Number;->floatValue()F

    .line 90
    .line 91
    .line 92
    move-result v11

    .line 93
    iget-object v12, v10, Lyf0;->d:Lcp0;

    .line 94
    .line 95
    invoke-virtual {v12, v11}, Lcp0;->h(F)V

    .line 96
    .line 97
    .line 98
    new-instance v11, Le;

    .line 99
    .line 100
    const/16 v12, 0xf

    .line 101
    .line 102
    invoke-direct {v11, v4, v10, v9, v12}, Le;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lik;I)V

    .line 103
    .line 104
    .line 105
    invoke-static {v5, v9, v11, v2}, Li4;->w(Lyk;Lpk;Lww;I)Lr31;

    .line 106
    .line 107
    .line 108
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 109
    goto :goto_0

    .line 110
    :catchall_1
    move-exception v0

    .line 111
    move-object v2, v9

    .line 112
    goto :goto_5

    .line 113
    :cond_2
    move-object v2, v9

    .line 114
    :goto_0
    :try_start_2
    iget-object v4, v0, Le7;->l:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v4, Lot0;

    .line 117
    .line 118
    iput-object v2, v0, Le7;->i:Ljava/lang/Object;

    .line 119
    .line 120
    iput v8, v0, Le7;->j:I

    .line 121
    .line 122
    new-instance v5, Lnt0;

    .line 123
    .line 124
    invoke-direct {v5, v4, v9}, Lnt0;-><init>(Lot0;Lik;)V

    .line 125
    .line 126
    .line 127
    invoke-interface {v0}, Lik;->e()Lpk;

    .line 128
    .line 129
    .line 130
    move-result-object v8

    .line 131
    invoke-static {v8}, Lv50;->l(Lpk;)Ls6;

    .line 132
    .line 133
    .line 134
    move-result-object v8

    .line 135
    iget-object v10, v4, Lot0;->a:Ls6;

    .line 136
    .line 137
    new-instance v11, Llt0;

    .line 138
    .line 139
    invoke-direct {v11, v4, v5, v8, v9}, Llt0;-><init>(Lot0;Lnt0;Ls6;Lik;)V

    .line 140
    .line 141
    .line 142
    invoke-static {v10, v11, v0}, Li4;->H(Lpk;Lww;Ljk;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 146
    if-ne v0, v6, :cond_3

    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_3
    move-object v0, v3

    .line 150
    :goto_1
    if-ne v0, v6, :cond_4

    .line 151
    .line 152
    goto :goto_2

    .line 153
    :cond_4
    move-object v0, v3

    .line 154
    :goto_2
    if-ne v0, v6, :cond_5

    .line 155
    .line 156
    move-object v3, v6

    .line 157
    goto :goto_4

    .line 158
    :cond_5
    :goto_3
    if-eqz v2, :cond_6

    .line 159
    .line 160
    invoke-interface {v2, v9}, Lc40;->a(Ljava/util/concurrent/CancellationException;)V

    .line 161
    .line 162
    .line 163
    :cond_6
    invoke-interface {v1}, Lx90;->getLifecycle()Ls90;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    invoke-virtual {v0, v7}, Ls90;->b(Lw90;)V

    .line 168
    .line 169
    .line 170
    :goto_4
    return-object v3

    .line 171
    :goto_5
    if-eqz v2, :cond_7

    .line 172
    .line 173
    invoke-interface {v2, v9}, Lc40;->a(Ljava/util/concurrent/CancellationException;)V

    .line 174
    .line 175
    .line 176
    :cond_7
    invoke-interface {v1}, Lx90;->getLifecycle()Ls90;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    invoke-virtual {v1, v7}, Ls90;->b(Lw90;)V

    .line 181
    .line 182
    .line 183
    throw v0

    .line 184
    :pswitch_0
    iget-object v1, v0, Le7;->k:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v1, Lrr0;

    .line 187
    .line 188
    iget v2, v0, Le7;->j:I

    .line 189
    .line 190
    if-eqz v2, :cond_9

    .line 191
    .line 192
    if-ne v2, v8, :cond_8

    .line 193
    .line 194
    invoke-static/range {p1 .. p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    goto :goto_6

    .line 198
    :cond_8
    invoke-static {v5}, Lxc;->o(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    move-object v3, v9

    .line 202
    goto :goto_6

    .line 203
    :cond_9
    invoke-static/range {p1 .. p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    iget-object v2, v0, Le7;->i:Ljava/lang/Object;

    .line 207
    .line 208
    move-object v10, v2

    .line 209
    check-cast v10, Lyk;

    .line 210
    .line 211
    new-instance v15, Lhs0;

    .line 212
    .line 213
    invoke-direct {v15, v1}, Lhs0;-><init>(Lym;)V

    .line 214
    .line 215
    .line 216
    new-instance v9, Lj61;

    .line 217
    .line 218
    iget-object v2, v0, Le7;->l:Ljava/lang/Object;

    .line 219
    .line 220
    move-object v11, v2

    .line 221
    check-cast v11, Lbg;

    .line 222
    .line 223
    iget-object v2, v0, Le7;->m:Ljava/lang/Object;

    .line 224
    .line 225
    move-object v12, v2

    .line 226
    check-cast v12, Lsw;

    .line 227
    .line 228
    move-object v13, v7

    .line 229
    check-cast v13, Lsw;

    .line 230
    .line 231
    move-object v14, v4

    .line 232
    check-cast v14, Lag;

    .line 233
    .line 234
    const/16 v16, 0x0

    .line 235
    .line 236
    invoke-direct/range {v9 .. v16}, Lj61;-><init>(Lyk;Lbg;Lsw;Lsw;Lag;Lhs0;Lik;)V

    .line 237
    .line 238
    .line 239
    iput v8, v0, Le7;->j:I

    .line 240
    .line 241
    invoke-static {v1, v9, v0}, Lp30;->o(Lrr0;Lww;Lik;)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    if-ne v0, v6, :cond_a

    .line 246
    .line 247
    move-object v3, v6

    .line 248
    :cond_a
    :goto_6
    return-object v3

    .line 249
    :pswitch_1
    move-object v1, v7

    .line 250
    check-cast v1, Lbi0;

    .line 251
    .line 252
    iget v2, v0, Le7;->j:I

    .line 253
    .line 254
    const/4 v10, 0x2

    .line 255
    if-eqz v2, :cond_d

    .line 256
    .line 257
    if-eq v2, v8, :cond_c

    .line 258
    .line 259
    if-ne v2, v10, :cond_b

    .line 260
    .line 261
    iget-object v1, v0, Le7;->i:Ljava/lang/Object;

    .line 262
    .line 263
    check-cast v1, Lbi0;

    .line 264
    .line 265
    iget-object v2, v0, Le7;->k:Ljava/lang/Object;

    .line 266
    .line 267
    check-cast v2, Ldi0;

    .line 268
    .line 269
    iget-object v0, v0, Le7;->m:Ljava/lang/Object;

    .line 270
    .line 271
    move-object v3, v0

    .line 272
    check-cast v3, Lyh0;

    .line 273
    .line 274
    :try_start_3
    invoke-static/range {p1 .. p1}, Lw60;->M(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 275
    .line 276
    .line 277
    move-object/from16 v0, p1

    .line 278
    .line 279
    goto/16 :goto_a

    .line 280
    .line 281
    :catchall_2
    move-exception v0

    .line 282
    goto/16 :goto_d

    .line 283
    .line 284
    :cond_b
    invoke-static {v5}, Lxc;->o(Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    move-object v6, v9

    .line 288
    goto/16 :goto_c

    .line 289
    .line 290
    :cond_c
    iget-object v1, v0, Le7;->l:Ljava/lang/Object;

    .line 291
    .line 292
    check-cast v1, Lbi0;

    .line 293
    .line 294
    iget-object v2, v0, Le7;->i:Ljava/lang/Object;

    .line 295
    .line 296
    check-cast v2, Lsw;

    .line 297
    .line 298
    iget-object v3, v0, Le7;->k:Ljava/lang/Object;

    .line 299
    .line 300
    check-cast v3, Ldi0;

    .line 301
    .line 302
    iget-object v4, v0, Le7;->m:Ljava/lang/Object;

    .line 303
    .line 304
    check-cast v4, Lyh0;

    .line 305
    .line 306
    invoke-static/range {p1 .. p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 307
    .line 308
    .line 309
    goto :goto_9

    .line 310
    :cond_d
    invoke-static/range {p1 .. p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 311
    .line 312
    .line 313
    iget-object v2, v0, Le7;->m:Ljava/lang/Object;

    .line 314
    .line 315
    check-cast v2, Lyk;

    .line 316
    .line 317
    new-instance v11, Lyh0;

    .line 318
    .line 319
    invoke-interface {v2}, Lyk;->f()Lpk;

    .line 320
    .line 321
    .line 322
    move-result-object v2

    .line 323
    sget-object v3, Ln2;->I:Ln2;

    .line 324
    .line 325
    invoke-interface {v2, v3}, Lpk;->l(Lok;)Lnk;

    .line 326
    .line 327
    .line 328
    move-result-object v2

    .line 329
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 330
    .line 331
    .line 332
    check-cast v2, Lc40;

    .line 333
    .line 334
    invoke-direct {v11, v2}, Lyh0;-><init>(Lc40;)V

    .line 335
    .line 336
    .line 337
    iget-object v12, v1, Lbi0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 338
    .line 339
    :goto_7
    invoke-virtual {v12}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object v2

    .line 343
    move-object v13, v2

    .line 344
    check-cast v13, Lyh0;

    .line 345
    .line 346
    if-eqz v13, :cond_f

    .line 347
    .line 348
    sget-object v2, Lwh0;->d:Lwh0;

    .line 349
    .line 350
    invoke-virtual {v2, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 351
    .line 352
    .line 353
    move-result v2

    .line 354
    if-ltz v2, :cond_e

    .line 355
    .line 356
    goto :goto_8

    .line 357
    :cond_e
    new-instance v0, Ljava/util/concurrent/CancellationException;

    .line 358
    .line 359
    const-string v1, "Current mutation had a higher priority"

    .line 360
    .line 361
    invoke-direct {v0, v1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 362
    .line 363
    .line 364
    throw v0

    .line 365
    :cond_f
    :goto_8
    invoke-virtual {v12, v13, v11}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 366
    .line 367
    .line 368
    move-result v2

    .line 369
    if-eqz v2, :cond_16

    .line 370
    .line 371
    if-eqz v13, :cond_10

    .line 372
    .line 373
    iget-object v2, v13, Lyh0;->a:Lc40;

    .line 374
    .line 375
    new-instance v3, Lbe;

    .line 376
    .line 377
    const-string v5, "Mutation interrupted"

    .line 378
    .line 379
    invoke-direct {v3, v5, v8}, Lbe;-><init>(Ljava/lang/String;I)V

    .line 380
    .line 381
    .line 382
    invoke-interface {v2, v3}, Lc40;->a(Ljava/util/concurrent/CancellationException;)V

    .line 383
    .line 384
    .line 385
    :cond_10
    iget-object v2, v1, Lbi0;->b:Ldi0;

    .line 386
    .line 387
    move-object v3, v4

    .line 388
    check-cast v3, Lsw;

    .line 389
    .line 390
    iput-object v11, v0, Le7;->m:Ljava/lang/Object;

    .line 391
    .line 392
    iput-object v2, v0, Le7;->k:Ljava/lang/Object;

    .line 393
    .line 394
    iput-object v3, v0, Le7;->i:Ljava/lang/Object;

    .line 395
    .line 396
    iput-object v1, v0, Le7;->l:Ljava/lang/Object;

    .line 397
    .line 398
    iput v8, v0, Le7;->j:I

    .line 399
    .line 400
    invoke-virtual {v2, v0}, Ldi0;->e(Ljk;)Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object v4

    .line 404
    if-ne v4, v6, :cond_11

    .line 405
    .line 406
    goto :goto_c

    .line 407
    :cond_11
    move-object v4, v3

    .line 408
    move-object v3, v2

    .line 409
    move-object v2, v4

    .line 410
    move-object v4, v11

    .line 411
    :goto_9
    :try_start_4
    iput-object v4, v0, Le7;->m:Ljava/lang/Object;

    .line 412
    .line 413
    iput-object v3, v0, Le7;->k:Ljava/lang/Object;

    .line 414
    .line 415
    iput-object v1, v0, Le7;->i:Ljava/lang/Object;

    .line 416
    .line 417
    iput-object v9, v0, Le7;->l:Ljava/lang/Object;

    .line 418
    .line 419
    iput v10, v0, Le7;->j:I

    .line 420
    .line 421
    invoke-interface {v2, v0}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 422
    .line 423
    .line 424
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 425
    if-ne v0, v6, :cond_12

    .line 426
    .line 427
    goto :goto_c

    .line 428
    :cond_12
    move-object v2, v3

    .line 429
    move-object v3, v4

    .line 430
    :goto_a
    :try_start_5
    iget-object v1, v1, Lbi0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 431
    .line 432
    :cond_13
    invoke-virtual {v1, v3, v9}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 433
    .line 434
    .line 435
    move-result v4

    .line 436
    if-eqz v4, :cond_14

    .line 437
    .line 438
    goto :goto_b

    .line 439
    :cond_14
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 440
    .line 441
    .line 442
    move-result-object v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 443
    if-eq v4, v3, :cond_13

    .line 444
    .line 445
    :goto_b
    invoke-virtual {v2, v9}, Ldi0;->g(Ljava/lang/Object;)V

    .line 446
    .line 447
    .line 448
    move-object v6, v0

    .line 449
    :goto_c
    return-object v6

    .line 450
    :catchall_3
    move-exception v0

    .line 451
    goto :goto_f

    .line 452
    :catchall_4
    move-exception v0

    .line 453
    move-object v2, v3

    .line 454
    move-object v3, v4

    .line 455
    :goto_d
    :try_start_6
    iget-object v1, v1, Lbi0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 456
    .line 457
    :goto_e
    invoke-virtual {v1, v3, v9}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 458
    .line 459
    .line 460
    move-result v4

    .line 461
    if-nez v4, :cond_15

    .line 462
    .line 463
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 464
    .line 465
    .line 466
    move-result-object v4

    .line 467
    if-ne v4, v3, :cond_15

    .line 468
    .line 469
    goto :goto_e

    .line 470
    :cond_15
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 471
    :goto_f
    invoke-virtual {v2, v9}, Ldi0;->g(Ljava/lang/Object;)V

    .line 472
    .line 473
    .line 474
    throw v0

    .line 475
    :cond_16
    invoke-virtual {v12}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 476
    .line 477
    .line 478
    move-result-object v2

    .line 479
    if-eq v2, v13, :cond_f

    .line 480
    .line 481
    goto/16 :goto_7

    .line 482
    .line 483
    :pswitch_2
    iget-object v1, v0, Le7;->l:Ljava/lang/Object;

    .line 484
    .line 485
    check-cast v1, Lmd;

    .line 486
    .line 487
    iget v10, v0, Le7;->j:I

    .line 488
    .line 489
    if-eqz v10, :cond_18

    .line 490
    .line 491
    if-ne v10, v8, :cond_17

    .line 492
    .line 493
    iget-object v5, v0, Le7;->k:Ljava/lang/Object;

    .line 494
    .line 495
    check-cast v5, Lub;

    .line 496
    .line 497
    iget-object v10, v0, Le7;->i:Ljava/lang/Object;

    .line 498
    .line 499
    check-cast v10, Lyk;

    .line 500
    .line 501
    invoke-static/range {p1 .. p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 502
    .line 503
    .line 504
    move-object/from16 v11, p1

    .line 505
    .line 506
    goto :goto_11

    .line 507
    :cond_17
    invoke-static {v5}, Lxc;->o(Ljava/lang/String;)V

    .line 508
    .line 509
    .line 510
    move-object v3, v9

    .line 511
    goto :goto_14

    .line 512
    :cond_18
    invoke-static/range {p1 .. p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 513
    .line 514
    .line 515
    iget-object v5, v0, Le7;->i:Ljava/lang/Object;

    .line 516
    .line 517
    check-cast v5, Lyk;

    .line 518
    .line 519
    invoke-interface {v1}, Lmd;->iterator()Lub;

    .line 520
    .line 521
    .line 522
    move-result-object v10

    .line 523
    move-object/from16 v20, v10

    .line 524
    .line 525
    move-object v10, v5

    .line 526
    move-object/from16 v5, v20

    .line 527
    .line 528
    :goto_10
    iput-object v10, v0, Le7;->i:Ljava/lang/Object;

    .line 529
    .line 530
    iput-object v5, v0, Le7;->k:Ljava/lang/Object;

    .line 531
    .line 532
    iput v8, v0, Le7;->j:I

    .line 533
    .line 534
    invoke-virtual {v5, v0}, Lub;->b(Ljk;)Ljava/lang/Object;

    .line 535
    .line 536
    .line 537
    move-result-object v11

    .line 538
    if-ne v11, v6, :cond_19

    .line 539
    .line 540
    move-object v3, v6

    .line 541
    goto :goto_14

    .line 542
    :cond_19
    :goto_11
    check-cast v11, Ljava/lang/Boolean;

    .line 543
    .line 544
    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    .line 545
    .line 546
    .line 547
    move-result v11

    .line 548
    if-eqz v11, :cond_1c

    .line 549
    .line 550
    invoke-virtual {v5}, Lub;->c()Ljava/lang/Object;

    .line 551
    .line 552
    .line 553
    move-result-object v11

    .line 554
    invoke-interface {v1}, Lmd;->q()Ljava/lang/Object;

    .line 555
    .line 556
    .line 557
    move-result-object v12

    .line 558
    instance-of v13, v12, Lvd;

    .line 559
    .line 560
    if-nez v13, :cond_1a

    .line 561
    .line 562
    goto :goto_12

    .line 563
    :cond_1a
    move-object v12, v9

    .line 564
    :goto_12
    if-nez v12, :cond_1b

    .line 565
    .line 566
    move-object v14, v11

    .line 567
    goto :goto_13

    .line 568
    :cond_1b
    move-object v14, v12

    .line 569
    :goto_13
    new-instance v13, Ld7;

    .line 570
    .line 571
    iget-object v11, v0, Le7;->m:Ljava/lang/Object;

    .line 572
    .line 573
    move-object v15, v11

    .line 574
    check-cast v15, Lb7;

    .line 575
    .line 576
    move-object/from16 v16, v7

    .line 577
    .line 578
    check-cast v16, Loh0;

    .line 579
    .line 580
    move-object/from16 v17, v4

    .line 581
    .line 582
    check-cast v17, Loh0;

    .line 583
    .line 584
    const/16 v18, 0x0

    .line 585
    .line 586
    const/16 v19, 0x0

    .line 587
    .line 588
    invoke-direct/range {v13 .. v19}, Ld7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lik;I)V

    .line 589
    .line 590
    .line 591
    invoke-static {v10, v9, v13, v2}, Li4;->w(Lyk;Lpk;Lww;I)Lr31;

    .line 592
    .line 593
    .line 594
    goto :goto_10

    .line 595
    :cond_1c
    :goto_14
    return-object v3

    .line 596
    nop

    .line 597
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
