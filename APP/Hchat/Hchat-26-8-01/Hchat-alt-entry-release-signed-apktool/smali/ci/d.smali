.class public final Lci/d;
.super Lyf/h;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public h:I

.field public synthetic i:Ljava/lang/Object;

.field public j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;

.field public final synthetic m:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lk/s1;Lf0/h;Lb0/t;Lw/t0;Lb0/d0;Lwf/c;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lci/d;->g:I

    .line 3
    .line 4
    iput-object p1, p0, Lci/d;->j:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lci/d;->k:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, Lci/d;->l:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p4, p0, Lci/d;->m:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p5, p0, Lci/d;->n:Ljava/lang/Object;

    .line 13
    .line 14
    invoke-direct {p0, p6}, Lyf/h;-><init>(Lwf/c;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public synthetic constructor <init>(Lqg/t;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V
    .locals 0

    .line 18
    iput p6, p0, Lci/d;->g:I

    iput-object p1, p0, Lci/d;->k:Ljava/lang/Object;

    iput-object p2, p0, Lci/d;->l:Ljava/lang/Object;

    iput-object p3, p0, Lci/d;->m:Ljava/lang/Object;

    iput-object p4, p0, Lci/d;->n:Ljava/lang/Object;

    invoke-direct {p0, p5}, Lyf/h;-><init>(Lwf/c;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lwf/c;)Lwf/c;
    .locals 9

    .line 1
    iget v0, p0, Lci/d;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v1, Lci/d;

    .line 7
    .line 8
    iget-object v0, p0, Lci/d;->k:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v2, v0

    .line 11
    check-cast v2, Lqg/t;

    .line 12
    .line 13
    iget-object v0, p0, Lci/d;->l:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v3, v0

    .line 16
    check-cast v3, Lw/e1;

    .line 17
    .line 18
    iget-object v0, p0, Lci/d;->m:Ljava/lang/Object;

    .line 19
    .line 20
    move-object v4, v0

    .line 21
    check-cast v4, Lb0/l;

    .line 22
    .line 23
    iget-object v0, p0, Lci/d;->n:Ljava/lang/Object;

    .line 24
    .line 25
    move-object v5, v0

    .line 26
    check-cast v5, Lm/t1;

    .line 27
    .line 28
    const/4 v7, 0x2

    .line 29
    move-object v6, p2

    .line 30
    invoke-direct/range {v1 .. v7}, Lci/d;-><init>(Lqg/t;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 31
    .line 32
    .line 33
    iput-object p1, v1, Lci/d;->i:Ljava/lang/Object;

    .line 34
    .line 35
    return-object v1

    .line 36
    :pswitch_0
    move-object v6, p2

    .line 37
    new-instance v2, Lci/d;

    .line 38
    .line 39
    iget-object p2, p0, Lci/d;->j:Ljava/lang/Object;

    .line 40
    .line 41
    move-object v3, p2

    .line 42
    check-cast v3, Lk/s1;

    .line 43
    .line 44
    iget-object p2, p0, Lci/d;->k:Ljava/lang/Object;

    .line 45
    .line 46
    move-object v4, p2

    .line 47
    check-cast v4, Lf0/h;

    .line 48
    .line 49
    iget-object p2, p0, Lci/d;->l:Ljava/lang/Object;

    .line 50
    .line 51
    move-object v5, p2

    .line 52
    check-cast v5, Lb0/t;

    .line 53
    .line 54
    iget-object p2, p0, Lci/d;->m:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p2, Lw/t0;

    .line 57
    .line 58
    iget-object v0, p0, Lci/d;->n:Ljava/lang/Object;

    .line 59
    .line 60
    move-object v7, v0

    .line 61
    check-cast v7, Lb0/d0;

    .line 62
    .line 63
    move-object v8, v6

    .line 64
    move-object v6, p2

    .line 65
    invoke-direct/range {v2 .. v8}, Lci/d;-><init>(Lk/s1;Lf0/h;Lb0/t;Lw/t0;Lb0/d0;Lwf/c;)V

    .line 66
    .line 67
    .line 68
    iput-object p1, v2, Lci/d;->i:Ljava/lang/Object;

    .line 69
    .line 70
    return-object v2

    .line 71
    :pswitch_1
    move-object v6, p2

    .line 72
    new-instance v2, Lci/d;

    .line 73
    .line 74
    iget-object p2, p0, Lci/d;->k:Ljava/lang/Object;

    .line 75
    .line 76
    move-object v3, p2

    .line 77
    check-cast v3, Lqg/t;

    .line 78
    .line 79
    iget-object p2, p0, Lci/d;->l:Ljava/lang/Object;

    .line 80
    .line 81
    move-object v4, p2

    .line 82
    check-cast v4, Lci/l0;

    .line 83
    .line 84
    iget-object p2, p0, Lci/d;->m:Ljava/lang/Object;

    .line 85
    .line 86
    move-object v5, p2

    .line 87
    check-cast v5, Lci/h0;

    .line 88
    .line 89
    iget-object p2, p0, Lci/d;->n:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast p2, Lci/f;

    .line 92
    .line 93
    const/4 v8, 0x0

    .line 94
    move-object v7, v6

    .line 95
    move-object v6, p2

    .line 96
    invoke-direct/range {v2 .. v8}, Lci/d;-><init>(Lqg/t;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 97
    .line 98
    .line 99
    iput-object p1, v2, Lci/d;->i:Ljava/lang/Object;

    .line 100
    .line 101
    return-object v2

    .line 102
    nop

    .line 103
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lci/d;->g:I

    .line 2
    .line 3
    check-cast p1, Ls1/k0;

    .line 4
    .line 5
    check-cast p2, Lwf/c;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Lci/d;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lci/d;

    .line 15
    .line 16
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lci/d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lci/d;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lci/d;

    .line 28
    .line 29
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Lci/d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, Lci/d;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, Lci/d;

    .line 41
    .line 42
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 43
    .line 44
    invoke-virtual {p1, p2}, Lci/d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    return-object p1

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Lci/d;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lci/d;->k:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lqg/t;

    .line 9
    .line 10
    iget-object v1, p0, Lci/d;->n:Ljava/lang/Object;

    .line 11
    .line 12
    move-object v4, v1

    .line 13
    check-cast v4, Lm/t1;

    .line 14
    .line 15
    iget v1, p0, Lci/d;->h:I

    .line 16
    .line 17
    const/4 v8, 0x2

    .line 18
    const/4 v2, 0x1

    .line 19
    const/4 v6, 0x0

    .line 20
    sget-object v9, Lxf/a;->g:Lxf/a;

    .line 21
    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    if-eq v1, v2, :cond_1

    .line 25
    .line 26
    if-ne v1, v8, :cond_0

    .line 27
    .line 28
    iget-object v1, p0, Lci/d;->i:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v1, Lqg/r0;

    .line 31
    .line 32
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_0
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 37
    .line 38
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const/4 v9, 0x0

    .line 42
    goto/16 :goto_3

    .line 43
    .line 44
    :cond_1
    iget-object v1, p0, Lci/d;->j:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v1, Lqg/e1;

    .line 47
    .line 48
    iget-object v2, p0, Lci/d;->i:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v2, Ls1/k0;

    .line 51
    .line 52
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    move-object v10, v2

    .line 56
    goto :goto_0

    .line 57
    :cond_2
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    iget-object p1, p0, Lci/d;->i:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast p1, Ls1/k0;

    .line 63
    .line 64
    new-instance v1, Lm/s2;

    .line 65
    .line 66
    const/4 v3, 0x0

    .line 67
    invoke-direct {v1, v4, v6, v3}, Lm/s2;-><init>(Lm/t1;Lwf/c;I)V

    .line 68
    .line 69
    .line 70
    invoke-static {v0, v6, v1, v2}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    iput-object p1, p0, Lci/d;->i:Ljava/lang/Object;

    .line 75
    .line 76
    iput-object v1, p0, Lci/d;->j:Ljava/lang/Object;

    .line 77
    .line 78
    iput v2, p0, Lci/d;->h:I

    .line 79
    .line 80
    const/4 v2, 0x3

    .line 81
    invoke-static {p1, p0, v2}, Lm/y2;->b(Ls1/k0;Lwf/c;I)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    if-ne v2, v9, :cond_3

    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_3
    move-object v10, p1

    .line 89
    move-object p1, v2

    .line 90
    :goto_0
    move-object v5, p1

    .line 91
    check-cast v5, Ls1/t;

    .line 92
    .line 93
    invoke-virtual {v5}, Ls1/t;->a()V

    .line 94
    .line 95
    .line 96
    iget-object p1, p0, Lci/d;->l:Ljava/lang/Object;

    .line 97
    .line 98
    move-object v3, p1

    .line 99
    check-cast v3, Lw/e1;

    .line 100
    .line 101
    sget-object p1, Lm/y2;->a:Lm/r0;

    .line 102
    .line 103
    if-eq v3, p1, :cond_4

    .line 104
    .line 105
    new-instance v2, Lc0/m;

    .line 106
    .line 107
    const/16 v7, 0xf

    .line 108
    .line 109
    invoke-direct/range {v2 .. v7}, Lc0/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 110
    .line 111
    .line 112
    invoke-static {v0, v1, v2}, Lm/y2;->f(Lqg/t;Lqg/r0;Lfg/p;)Lqg/e1;

    .line 113
    .line 114
    .line 115
    :cond_4
    iput-object v1, p0, Lci/d;->i:Ljava/lang/Object;

    .line 116
    .line 117
    iput-object v6, p0, Lci/d;->j:Ljava/lang/Object;

    .line 118
    .line 119
    iput v8, p0, Lci/d;->h:I

    .line 120
    .line 121
    sget-object p1, Ls1/l;->h:Ls1/l;

    .line 122
    .line 123
    invoke-static {v10, p1, p0}, Lm/y2;->i(Ls1/k0;Ls1/l;Lyf/a;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    if-ne p1, v9, :cond_5

    .line 128
    .line 129
    goto :goto_3

    .line 130
    :cond_5
    :goto_1
    check-cast p1, Ls1/t;

    .line 131
    .line 132
    if-nez p1, :cond_6

    .line 133
    .line 134
    new-instance p1, Lm/r2;

    .line 135
    .line 136
    const/4 v2, 0x0

    .line 137
    invoke-direct {p1, v4, v6, v2}, Lm/r2;-><init>(Lm/t1;Lwf/c;I)V

    .line 138
    .line 139
    .line 140
    invoke-static {v0, v1, p1}, Lm/y2;->f(Lqg/t;Lqg/r0;Lfg/p;)Lqg/e1;

    .line 141
    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_6
    invoke-virtual {p1}, Ls1/t;->a()V

    .line 145
    .line 146
    .line 147
    new-instance v2, Lm/r2;

    .line 148
    .line 149
    const/4 v3, 0x1

    .line 150
    invoke-direct {v2, v4, v6, v3}, Lm/r2;-><init>(Lm/t1;Lwf/c;I)V

    .line 151
    .line 152
    .line 153
    invoke-static {v0, v1, v2}, Lm/y2;->f(Lqg/t;Lqg/r0;Lfg/p;)Lqg/e1;

    .line 154
    .line 155
    .line 156
    iget-object v0, p0, Lci/d;->m:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v0, Lb0/l;

    .line 159
    .line 160
    iget-wide v1, p1, Ls1/t;->c:J

    .line 161
    .line 162
    new-instance p1, Le1/b;

    .line 163
    .line 164
    invoke-direct {p1, v1, v2}, Le1/b;-><init>(J)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v0, p1}, Lb0/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    :goto_2
    sget-object v9, Lsf/n;->a:Lsf/n;

    .line 171
    .line 172
    :goto_3
    return-object v9

    .line 173
    :pswitch_0
    iget v0, p0, Lci/d;->h:I

    .line 174
    .line 175
    const/4 v1, 0x2

    .line 176
    const/4 v2, 0x1

    .line 177
    sget-object v3, Lxf/a;->g:Lxf/a;

    .line 178
    .line 179
    if-eqz v0, :cond_a

    .line 180
    .line 181
    if-eq v0, v2, :cond_8

    .line 182
    .line 183
    if-ne v0, v1, :cond_7

    .line 184
    .line 185
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    move-object v11, p0

    .line 189
    goto :goto_6

    .line 190
    :cond_7
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 191
    .line 192
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    const/4 v3, 0x0

    .line 196
    :goto_4
    move-object v11, p0

    .line 197
    goto :goto_7

    .line 198
    :cond_8
    iget-object v0, p0, Lci/d;->i:Ljava/lang/Object;

    .line 199
    .line 200
    check-cast v0, Ls1/k0;

    .line 201
    .line 202
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 203
    .line 204
    .line 205
    :cond_9
    move-object v4, v0

    .line 206
    goto :goto_5

    .line 207
    :cond_a
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 208
    .line 209
    .line 210
    iget-object p1, p0, Lci/d;->i:Ljava/lang/Object;

    .line 211
    .line 212
    move-object v0, p1

    .line 213
    check-cast v0, Ls1/k0;

    .line 214
    .line 215
    iput-object v0, p0, Lci/d;->i:Ljava/lang/Object;

    .line 216
    .line 217
    iput v2, p0, Lci/d;->h:I

    .line 218
    .line 219
    const/4 p1, 0x0

    .line 220
    sget-object v2, Ls1/l;->g:Ls1/l;

    .line 221
    .line 222
    invoke-static {v0, p1, v2, p0}, Lm/y2;->a(Ls1/k0;ZLs1/l;Lwf/c;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object p1

    .line 226
    if-ne p1, v3, :cond_9

    .line 227
    .line 228
    goto :goto_4

    .line 229
    :goto_5
    move-object v5, p1

    .line 230
    check-cast v5, Ls1/t;

    .line 231
    .line 232
    iget-object p1, p0, Lci/d;->j:Ljava/lang/Object;

    .line 233
    .line 234
    move-object v6, p1

    .line 235
    check-cast v6, Lk/s1;

    .line 236
    .line 237
    iget-object p1, p0, Lci/d;->k:Ljava/lang/Object;

    .line 238
    .line 239
    move-object v7, p1

    .line 240
    check-cast v7, Lf0/h;

    .line 241
    .line 242
    iget-object p1, p0, Lci/d;->l:Ljava/lang/Object;

    .line 243
    .line 244
    move-object v8, p1

    .line 245
    check-cast v8, Lb0/t;

    .line 246
    .line 247
    iget-object p1, p0, Lci/d;->m:Ljava/lang/Object;

    .line 248
    .line 249
    move-object v9, p1

    .line 250
    check-cast v9, Lw/t0;

    .line 251
    .line 252
    iget-object p1, p0, Lci/d;->n:Ljava/lang/Object;

    .line 253
    .line 254
    move-object v10, p1

    .line 255
    check-cast v10, Lb0/d0;

    .line 256
    .line 257
    const/4 p1, 0x0

    .line 258
    iput-object p1, p0, Lci/d;->i:Ljava/lang/Object;

    .line 259
    .line 260
    iput v1, p0, Lci/d;->h:I

    .line 261
    .line 262
    move-object v11, p0

    .line 263
    invoke-static/range {v4 .. v11}, Lm/j0;->g(Ls1/k0;Ls1/t;Lk/s1;Lf0/h;Lb0/t;Lw/t0;Lb0/d0;Lyf/a;)Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object p1

    .line 267
    if-ne p1, v3, :cond_b

    .line 268
    .line 269
    goto :goto_7

    .line 270
    :cond_b
    :goto_6
    sget-object v3, Lsf/n;->a:Lsf/n;

    .line 271
    .line 272
    :goto_7
    return-object v3

    .line 273
    :pswitch_1
    move-object v11, p0

    .line 274
    iget-object v0, v11, Lci/d;->l:Ljava/lang/Object;

    .line 275
    .line 276
    check-cast v0, Lci/l0;

    .line 277
    .line 278
    iget-object v1, v11, Lci/d;->k:Ljava/lang/Object;

    .line 279
    .line 280
    check-cast v1, Lqg/t;

    .line 281
    .line 282
    iget-object v2, v11, Lci/d;->m:Ljava/lang/Object;

    .line 283
    .line 284
    move-object v5, v2

    .line 285
    check-cast v5, Lci/h0;

    .line 286
    .line 287
    iget-object v2, v11, Lci/d;->i:Ljava/lang/Object;

    .line 288
    .line 289
    check-cast v2, Ls1/k0;

    .line 290
    .line 291
    iget v3, v11, Lci/d;->h:I

    .line 292
    .line 293
    const/4 v9, 0x2

    .line 294
    const/4 v4, 0x1

    .line 295
    const/4 v7, 0x0

    .line 296
    sget-object v10, Lxf/a;->g:Lxf/a;

    .line 297
    .line 298
    if-eqz v3, :cond_e

    .line 299
    .line 300
    if-eq v3, v4, :cond_d

    .line 301
    .line 302
    if-ne v3, v9, :cond_c

    .line 303
    .line 304
    iget-object v2, v11, Lci/d;->j:Ljava/lang/Object;

    .line 305
    .line 306
    check-cast v2, Lqg/e1;

    .line 307
    .line 308
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 309
    .line 310
    .line 311
    goto :goto_9

    .line 312
    :cond_c
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 313
    .line 314
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 315
    .line 316
    .line 317
    const/4 v10, 0x0

    .line 318
    goto :goto_b

    .line 319
    :cond_d
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 320
    .line 321
    .line 322
    goto :goto_8

    .line 323
    :cond_e
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 324
    .line 325
    .line 326
    iput-object v2, v11, Lci/d;->i:Ljava/lang/Object;

    .line 327
    .line 328
    iput v4, v11, Lci/d;->h:I

    .line 329
    .line 330
    invoke-static {v2, p0, v9}, Lm/y2;->b(Ls1/k0;Lwf/c;I)Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object p1

    .line 334
    if-ne p1, v10, :cond_f

    .line 335
    .line 336
    goto :goto_b

    .line 337
    :cond_f
    :goto_8
    move-object v6, p1

    .line 338
    check-cast v6, Ls1/t;

    .line 339
    .line 340
    new-instance p1, Lci/c;

    .line 341
    .line 342
    const/4 v3, 0x0

    .line 343
    invoke-direct {p1, v5, v7, v3}, Lci/c;-><init>(Ljava/lang/Object;Lwf/c;I)V

    .line 344
    .line 345
    .line 346
    const/4 v3, 0x3

    .line 347
    invoke-static {v1, v7, p1, v3}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 348
    .line 349
    .line 350
    move-result-object p1

    .line 351
    new-instance v3, Lc0/m;

    .line 352
    .line 353
    iget-object v4, v11, Lci/d;->n:Ljava/lang/Object;

    .line 354
    .line 355
    check-cast v4, Lci/f;

    .line 356
    .line 357
    const/4 v8, 0x1

    .line 358
    invoke-direct/range {v3 .. v8}, Lc0/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 359
    .line 360
    .line 361
    invoke-static {v0, v1, p1, v3}, Lci/l0;->n1(Lci/l0;Lqg/t;Lqg/r0;Lfg/p;)V

    .line 362
    .line 363
    .line 364
    iput-object v7, v11, Lci/d;->i:Ljava/lang/Object;

    .line 365
    .line 366
    iput-object p1, v11, Lci/d;->j:Ljava/lang/Object;

    .line 367
    .line 368
    iput v9, v11, Lci/d;->h:I

    .line 369
    .line 370
    sget-object v3, Ls1/l;->h:Ls1/l;

    .line 371
    .line 372
    invoke-static {v2, v3, p0}, Lm/y2;->i(Ls1/k0;Ls1/l;Lyf/a;)Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v2

    .line 376
    if-ne v2, v10, :cond_10

    .line 377
    .line 378
    goto :goto_b

    .line 379
    :cond_10
    move-object v12, v2

    .line 380
    move-object v2, p1

    .line 381
    move-object p1, v12

    .line 382
    :goto_9
    check-cast p1, Ls1/t;

    .line 383
    .line 384
    if-nez p1, :cond_11

    .line 385
    .line 386
    new-instance p1, Lci/b;

    .line 387
    .line 388
    const/4 v3, 0x0

    .line 389
    invoke-direct {p1, v5, v7, v3}, Lci/b;-><init>(Lci/h0;Lwf/c;I)V

    .line 390
    .line 391
    .line 392
    invoke-static {v0, v1, v2, p1}, Lci/l0;->n1(Lci/l0;Lqg/t;Lqg/r0;Lfg/p;)V

    .line 393
    .line 394
    .line 395
    goto :goto_a

    .line 396
    :cond_11
    new-instance p1, Lci/b;

    .line 397
    .line 398
    const/4 v3, 0x1

    .line 399
    invoke-direct {p1, v5, v7, v3}, Lci/b;-><init>(Lci/h0;Lwf/c;I)V

    .line 400
    .line 401
    .line 402
    invoke-static {v0, v1, v2, p1}, Lci/l0;->n1(Lci/l0;Lqg/t;Lqg/r0;Lfg/p;)V

    .line 403
    .line 404
    .line 405
    :goto_a
    sget-object v10, Lsf/n;->a:Lsf/n;

    .line 406
    .line 407
    :goto_b
    return-object v10

    .line 408
    nop

    .line 409
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
