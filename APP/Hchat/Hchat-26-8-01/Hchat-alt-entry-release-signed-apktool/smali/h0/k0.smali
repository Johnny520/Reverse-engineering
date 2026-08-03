.class public final Lh0/k0;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic h:I

.field public i:I

.field public final synthetic j:J

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(JLjava/lang/Object;Lwf/c;I)V
    .locals 0

    .line 1
    iput p5, p0, Lh0/k0;->h:I

    .line 2
    .line 3
    iput-wide p1, p0, Lh0/k0;->j:J

    .line 4
    .line 5
    iput-object p3, p0, Lh0/k0;->k:Ljava/lang/Object;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lyf/i;-><init>(ILwf/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;JLwf/c;I)V
    .locals 0

    .line 12
    iput p5, p0, Lh0/k0;->h:I

    iput-object p1, p0, Lh0/k0;->k:Ljava/lang/Object;

    iput-wide p2, p0, Lh0/k0;->j:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lyf/i;-><init>(ILwf/c;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lwf/c;)Lwf/c;
    .locals 7

    .line 1
    iget p1, p0, Lh0/k0;->h:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lh0/k0;

    .line 7
    .line 8
    iget-object p1, p0, Lh0/k0;->k:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v1, p1

    .line 11
    check-cast v1, Lx2/h;

    .line 12
    .line 13
    iget-wide v2, p0, Lh0/k0;->j:J

    .line 14
    .line 15
    const/4 v5, 0x3

    .line 16
    move-object v4, p2

    .line 17
    invoke-direct/range {v0 .. v5}, Lh0/k0;-><init>(Ljava/lang/Object;JLwf/c;I)V

    .line 18
    .line 19
    .line 20
    return-object v0

    .line 21
    :pswitch_0
    move-object v5, p2

    .line 22
    new-instance v1, Lh0/k0;

    .line 23
    .line 24
    iget-object p1, p0, Lh0/k0;->k:Ljava/lang/Object;

    .line 25
    .line 26
    move-object v4, p1

    .line 27
    check-cast v4, Li0/a1;

    .line 28
    .line 29
    const/4 v6, 0x2

    .line 30
    iget-wide v2, p0, Lh0/k0;->j:J

    .line 31
    .line 32
    invoke-direct/range {v1 .. v6}, Lh0/k0;-><init>(JLjava/lang/Object;Lwf/c;I)V

    .line 33
    .line 34
    .line 35
    return-object v1

    .line 36
    :pswitch_1
    move-object v5, p2

    .line 37
    new-instance v1, Lh0/k0;

    .line 38
    .line 39
    iget-object p1, p0, Lh0/k0;->k:Ljava/lang/Object;

    .line 40
    .line 41
    move-object v4, p1

    .line 42
    check-cast v4, Ls1/k0;

    .line 43
    .line 44
    const/4 v6, 0x1

    .line 45
    iget-wide v2, p0, Lh0/k0;->j:J

    .line 46
    .line 47
    invoke-direct/range {v1 .. v6}, Lh0/k0;-><init>(JLjava/lang/Object;Lwf/c;I)V

    .line 48
    .line 49
    .line 50
    return-object v1

    .line 51
    :pswitch_2
    move-object v5, p2

    .line 52
    new-instance v1, Lh0/k0;

    .line 53
    .line 54
    iget-object p1, p0, Lh0/k0;->k:Ljava/lang/Object;

    .line 55
    .line 56
    move-object v2, p1

    .line 57
    check-cast v2, Li/c;

    .line 58
    .line 59
    iget-wide v3, p0, Lh0/k0;->j:J

    .line 60
    .line 61
    const/4 v6, 0x0

    .line 62
    invoke-direct/range {v1 .. v6}, Lh0/k0;-><init>(Ljava/lang/Object;JLwf/c;I)V

    .line 63
    .line 64
    .line 65
    return-object v1

    .line 66
    nop

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lh0/k0;->h:I

    .line 2
    .line 3
    check-cast p1, Lqg/t;

    .line 4
    .line 5
    check-cast p2, Lwf/c;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Lh0/k0;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lh0/k0;

    .line 15
    .line 16
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lh0/k0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lh0/k0;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lh0/k0;

    .line 28
    .line 29
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Lh0/k0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    sget-object p1, Lxf/a;->g:Lxf/a;

    .line 35
    .line 36
    return-object p1

    .line 37
    :pswitch_1
    invoke-virtual {p0, p1, p2}, Lh0/k0;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    check-cast p1, Lh0/k0;

    .line 42
    .line 43
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 44
    .line 45
    invoke-virtual {p1, p2}, Lh0/k0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    return-object p1

    .line 50
    :pswitch_2
    invoke-virtual {p0, p1, p2}, Lh0/k0;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    check-cast p1, Lh0/k0;

    .line 55
    .line 56
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 57
    .line 58
    invoke-virtual {p1, p2}, Lh0/k0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    return-object p1

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lh0/k0;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lh0/k0;->i:I

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 18
    .line 19
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lh0/k0;->k:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p1, Lx2/h;

    .line 30
    .line 31
    iget-object p1, p1, Lx2/h;->g:Lr1/d;

    .line 32
    .line 33
    iput v1, p0, Lh0/k0;->i:I

    .line 34
    .line 35
    iget-wide v0, p0, Lh0/k0;->j:J

    .line 36
    .line 37
    invoke-virtual {p1, v0, v1, p0}, Lr1/d;->c(JLyf/c;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 42
    .line 43
    if-ne p1, v0, :cond_2

    .line 44
    .line 45
    move-object p1, v0

    .line 46
    goto :goto_1

    .line 47
    :cond_2
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 48
    .line 49
    :goto_1
    return-object p1

    .line 50
    :pswitch_0
    iget v0, p0, Lh0/k0;->i:I

    .line 51
    .line 52
    const/4 v1, 0x1

    .line 53
    if-eqz v0, :cond_4

    .line 54
    .line 55
    if-ne v0, v1, :cond_3

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_3
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 59
    .line 60
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    const/4 p1, 0x0

    .line 64
    goto :goto_3

    .line 65
    :cond_4
    :goto_2
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    :cond_5
    iget-object p1, p0, Lh0/k0;->k:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast p1, Li0/a1;

    .line 71
    .line 72
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 73
    .line 74
    .line 75
    move-result-wide v2

    .line 76
    iget-wide v4, p0, Lh0/k0;->j:J

    .line 77
    .line 78
    sub-long/2addr v2, v4

    .line 79
    const-wide/16 v4, 0x0

    .line 80
    .line 81
    cmp-long v0, v2, v4

    .line 82
    .line 83
    if-gez v0, :cond_6

    .line 84
    .line 85
    move-wide v2, v4

    .line 86
    :cond_6
    const-wide/16 v4, 0x3e8

    .line 87
    .line 88
    div-long/2addr v2, v4

    .line 89
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-interface {p1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    iput v1, p0, Lh0/k0;->i:I

    .line 97
    .line 98
    invoke-static {v4, v5, p0}, Lqg/v;->f(JLwf/c;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 103
    .line 104
    if-ne p1, v0, :cond_5

    .line 105
    .line 106
    move-object p1, v0

    .line 107
    :goto_3
    return-object p1

    .line 108
    :pswitch_1
    iget v0, p0, Lh0/k0;->i:I

    .line 109
    .line 110
    const-wide/16 v1, 0x8

    .line 111
    .line 112
    iget-wide v3, p0, Lh0/k0;->j:J

    .line 113
    .line 114
    const/4 v5, 0x2

    .line 115
    const/4 v6, 0x1

    .line 116
    sget-object v7, Lxf/a;->g:Lxf/a;

    .line 117
    .line 118
    if-eqz v0, :cond_9

    .line 119
    .line 120
    if-eq v0, v6, :cond_8

    .line 121
    .line 122
    if-ne v0, v5, :cond_7

    .line 123
    .line 124
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    goto :goto_5

    .line 128
    :cond_7
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 129
    .line 130
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    const/4 v7, 0x0

    .line 134
    goto :goto_6

    .line 135
    :cond_8
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    goto :goto_4

    .line 139
    :cond_9
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    sub-long v8, v3, v1

    .line 143
    .line 144
    iput v6, p0, Lh0/k0;->i:I

    .line 145
    .line 146
    invoke-static {v8, v9, p0}, Lqg/v;->f(JLwf/c;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    if-ne p1, v7, :cond_a

    .line 151
    .line 152
    goto :goto_6

    .line 153
    :cond_a
    :goto_4
    iput v5, p0, Lh0/k0;->i:I

    .line 154
    .line 155
    invoke-static {v1, v2, p0}, Lqg/v;->f(JLwf/c;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    if-ne p1, v7, :cond_b

    .line 160
    .line 161
    goto :goto_6

    .line 162
    :cond_b
    :goto_5
    iget-object p1, p0, Lh0/k0;->k:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast p1, Ls1/k0;

    .line 165
    .line 166
    iget-object p1, p1, Ls1/k0;->i:Lqg/g;

    .line 167
    .line 168
    if-eqz p1, :cond_c

    .line 169
    .line 170
    new-instance v0, Ls1/m;

    .line 171
    .line 172
    invoke-direct {v0, v3, v4}, Ls1/m;-><init>(J)V

    .line 173
    .line 174
    .line 175
    new-instance v1, Lsf/f;

    .line 176
    .line 177
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {p1, v1}, Lqg/g;->resumeWith(Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    :cond_c
    sget-object v7, Lsf/n;->a:Lsf/n;

    .line 184
    .line 185
    :goto_6
    return-object v7

    .line 186
    :pswitch_2
    iget v0, p0, Lh0/k0;->i:I

    .line 187
    .line 188
    const/4 v1, 0x1

    .line 189
    if-eqz v0, :cond_e

    .line 190
    .line 191
    if-ne v0, v1, :cond_d

    .line 192
    .line 193
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    goto :goto_7

    .line 197
    :cond_d
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 198
    .line 199
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    const/4 p1, 0x0

    .line 203
    goto :goto_8

    .line 204
    :cond_e
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    iget-object p1, p0, Lh0/k0;->k:Ljava/lang/Object;

    .line 208
    .line 209
    move-object v2, p1

    .line 210
    check-cast v2, Li/c;

    .line 211
    .line 212
    new-instance v3, Le1/b;

    .line 213
    .line 214
    iget-wide v4, p0, Lh0/k0;->j:J

    .line 215
    .line 216
    invoke-direct {v3, v4, v5}, Le1/b;-><init>(J)V

    .line 217
    .line 218
    .line 219
    sget-object v4, Lh0/m0;->d:Li/r0;

    .line 220
    .line 221
    iput v1, p0, Lh0/k0;->i:I

    .line 222
    .line 223
    const/4 v5, 0x0

    .line 224
    const/16 v7, 0xc

    .line 225
    .line 226
    move-object v6, p0

    .line 227
    invoke-static/range {v2 .. v7}, Li/c;->c(Li/c;Ljava/lang/Object;Li/k;Lfg/l;Lwf/c;I)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 232
    .line 233
    if-ne p1, v0, :cond_f

    .line 234
    .line 235
    move-object p1, v0

    .line 236
    goto :goto_8

    .line 237
    :cond_f
    :goto_7
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 238
    .line 239
    :goto_8
    return-object p1

    .line 240
    nop

    .line 241
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
