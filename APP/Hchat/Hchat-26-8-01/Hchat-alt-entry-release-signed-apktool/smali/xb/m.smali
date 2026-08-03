.class public final Lxb/m;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic h:I

.field public i:I

.field public final synthetic j:Lxb/o;


# direct methods
.method public synthetic constructor <init>(Lxb/o;Lwf/c;I)V
    .locals 0

    .line 1
    iput p3, p0, Lxb/m;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Lxb/m;->j:Lxb/o;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p2}, Lyf/i;-><init>(ILwf/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lwf/c;)Lwf/c;
    .locals 2

    .line 1
    iget p1, p0, Lxb/m;->h:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Lxb/m;

    .line 7
    .line 8
    iget-object v0, p0, Lxb/m;->j:Lxb/o;

    .line 9
    .line 10
    const/4 v1, 0x5

    .line 11
    invoke-direct {p1, v0, p2, v1}, Lxb/m;-><init>(Lxb/o;Lwf/c;I)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, Lxb/m;

    .line 16
    .line 17
    iget-object v0, p0, Lxb/m;->j:Lxb/o;

    .line 18
    .line 19
    const/4 v1, 0x4

    .line 20
    invoke-direct {p1, v0, p2, v1}, Lxb/m;-><init>(Lxb/o;Lwf/c;I)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_1
    new-instance p1, Lxb/m;

    .line 25
    .line 26
    iget-object v0, p0, Lxb/m;->j:Lxb/o;

    .line 27
    .line 28
    const/4 v1, 0x3

    .line 29
    invoke-direct {p1, v0, p2, v1}, Lxb/m;-><init>(Lxb/o;Lwf/c;I)V

    .line 30
    .line 31
    .line 32
    return-object p1

    .line 33
    :pswitch_2
    new-instance p1, Lxb/m;

    .line 34
    .line 35
    iget-object v0, p0, Lxb/m;->j:Lxb/o;

    .line 36
    .line 37
    const/4 v1, 0x2

    .line 38
    invoke-direct {p1, v0, p2, v1}, Lxb/m;-><init>(Lxb/o;Lwf/c;I)V

    .line 39
    .line 40
    .line 41
    return-object p1

    .line 42
    :pswitch_3
    new-instance p1, Lxb/m;

    .line 43
    .line 44
    iget-object v0, p0, Lxb/m;->j:Lxb/o;

    .line 45
    .line 46
    const/4 v1, 0x1

    .line 47
    invoke-direct {p1, v0, p2, v1}, Lxb/m;-><init>(Lxb/o;Lwf/c;I)V

    .line 48
    .line 49
    .line 50
    return-object p1

    .line 51
    :pswitch_4
    new-instance p1, Lxb/m;

    .line 52
    .line 53
    iget-object v0, p0, Lxb/m;->j:Lxb/o;

    .line 54
    .line 55
    const/4 v1, 0x0

    .line 56
    invoke-direct {p1, v0, p2, v1}, Lxb/m;-><init>(Lxb/o;Lwf/c;I)V

    .line 57
    .line 58
    .line 59
    return-object p1

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lxb/m;->h:I

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
    invoke-virtual {p0, p1, p2}, Lxb/m;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lxb/m;

    .line 15
    .line 16
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lxb/m;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lxb/m;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lxb/m;

    .line 28
    .line 29
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Lxb/m;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, Lxb/m;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, Lxb/m;

    .line 41
    .line 42
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 43
    .line 44
    invoke-virtual {p1, p2}, Lxb/m;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    return-object p1

    .line 49
    :pswitch_2
    invoke-virtual {p0, p1, p2}, Lxb/m;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    check-cast p1, Lxb/m;

    .line 54
    .line 55
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 56
    .line 57
    invoke-virtual {p1, p2}, Lxb/m;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    return-object p1

    .line 62
    :pswitch_3
    invoke-virtual {p0, p1, p2}, Lxb/m;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    check-cast p1, Lxb/m;

    .line 67
    .line 68
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 69
    .line 70
    invoke-virtual {p1, p2}, Lxb/m;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    return-object p1

    .line 75
    :pswitch_4
    invoke-virtual {p0, p1, p2}, Lxb/m;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    check-cast p1, Lxb/m;

    .line 80
    .line 81
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 82
    .line 83
    invoke-virtual {p1, p2}, Lxb/m;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    return-object p1

    .line 88
    nop

    .line 89
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lxb/m;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lxb/m;->i:I

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
    move-object v4, p0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    move-object v4, p0

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Lxb/m;->j:Lxb/o;

    .line 30
    .line 31
    iget-object v2, p1, Lxb/o;->f:Li/c;

    .line 32
    .line 33
    iget-wide v3, p1, Lxb/o;->g:J

    .line 34
    .line 35
    move-wide v4, v3

    .line 36
    new-instance v3, Le1/b;

    .line 37
    .line 38
    invoke-direct {v3, v4, v5}, Le1/b;-><init>(J)V

    .line 39
    .line 40
    .line 41
    iget-object v4, p1, Lxb/o;->d:Li/r0;

    .line 42
    .line 43
    iput v1, p0, Lxb/m;->i:I

    .line 44
    .line 45
    const/4 v5, 0x0

    .line 46
    const/16 v7, 0xc

    .line 47
    .line 48
    move-object v6, p0

    .line 49
    invoke-static/range {v2 .. v7}, Li/c;->c(Li/c;Ljava/lang/Object;Li/k;Lfg/l;Lwf/c;I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    move-object v4, v6

    .line 54
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 55
    .line 56
    if-ne p1, v0, :cond_2

    .line 57
    .line 58
    move-object p1, v0

    .line 59
    goto :goto_1

    .line 60
    :cond_2
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 61
    .line 62
    :goto_1
    return-object p1

    .line 63
    :pswitch_0
    move-object v4, p0

    .line 64
    iget v0, v4, Lxb/m;->i:I

    .line 65
    .line 66
    const/4 v1, 0x1

    .line 67
    if-eqz v0, :cond_4

    .line 68
    .line 69
    if-ne v0, v1, :cond_3

    .line 70
    .line 71
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_3
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 76
    .line 77
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    const/4 p1, 0x0

    .line 81
    goto :goto_3

    .line 82
    :cond_4
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    iget-object p1, v4, Lxb/m;->j:Lxb/o;

    .line 86
    .line 87
    iget-object v0, p1, Lxb/o;->e:Li/c;

    .line 88
    .line 89
    move v2, v1

    .line 90
    new-instance v1, Ljava/lang/Float;

    .line 91
    .line 92
    const/4 v3, 0x0

    .line 93
    invoke-direct {v1, v3}, Ljava/lang/Float;-><init>(F)V

    .line 94
    .line 95
    .line 96
    iget-object p1, p1, Lxb/o;->c:Li/r0;

    .line 97
    .line 98
    iput v2, v4, Lxb/m;->i:I

    .line 99
    .line 100
    const/4 v3, 0x0

    .line 101
    const/16 v5, 0xc

    .line 102
    .line 103
    move-object v2, p1

    .line 104
    invoke-static/range {v0 .. v5}, Li/c;->c(Li/c;Ljava/lang/Object;Li/k;Lfg/l;Lwf/c;I)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 109
    .line 110
    if-ne p1, v0, :cond_5

    .line 111
    .line 112
    move-object p1, v0

    .line 113
    goto :goto_3

    .line 114
    :cond_5
    :goto_2
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 115
    .line 116
    :goto_3
    return-object p1

    .line 117
    :pswitch_1
    move-object v4, p0

    .line 118
    iget v0, v4, Lxb/m;->i:I

    .line 119
    .line 120
    const/4 v1, 0x1

    .line 121
    if-eqz v0, :cond_7

    .line 122
    .line 123
    if-ne v0, v1, :cond_6

    .line 124
    .line 125
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    goto :goto_4

    .line 129
    :cond_6
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 130
    .line 131
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    const/4 p1, 0x0

    .line 135
    goto :goto_5

    .line 136
    :cond_7
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    iget-object p1, v4, Lxb/m;->j:Lxb/o;

    .line 140
    .line 141
    iget-object v0, p1, Lxb/o;->f:Li/c;

    .line 142
    .line 143
    iget-wide v2, p1, Lxb/o;->g:J

    .line 144
    .line 145
    move v5, v1

    .line 146
    new-instance v1, Le1/b;

    .line 147
    .line 148
    invoke-direct {v1, v2, v3}, Le1/b;-><init>(J)V

    .line 149
    .line 150
    .line 151
    iget-object v2, p1, Lxb/o;->d:Li/r0;

    .line 152
    .line 153
    iput v5, v4, Lxb/m;->i:I

    .line 154
    .line 155
    const/4 v3, 0x0

    .line 156
    const/16 v5, 0xc

    .line 157
    .line 158
    invoke-static/range {v0 .. v5}, Li/c;->c(Li/c;Ljava/lang/Object;Li/k;Lfg/l;Lwf/c;I)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 163
    .line 164
    if-ne p1, v0, :cond_8

    .line 165
    .line 166
    move-object p1, v0

    .line 167
    goto :goto_5

    .line 168
    :cond_8
    :goto_4
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 169
    .line 170
    :goto_5
    return-object p1

    .line 171
    :pswitch_2
    move-object v4, p0

    .line 172
    iget v0, v4, Lxb/m;->i:I

    .line 173
    .line 174
    const/4 v1, 0x1

    .line 175
    if-eqz v0, :cond_a

    .line 176
    .line 177
    if-ne v0, v1, :cond_9

    .line 178
    .line 179
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    goto :goto_6

    .line 183
    :cond_9
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 184
    .line 185
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    const/4 p1, 0x0

    .line 189
    goto :goto_7

    .line 190
    :cond_a
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    iget-object p1, v4, Lxb/m;->j:Lxb/o;

    .line 194
    .line 195
    iget-object v0, p1, Lxb/o;->e:Li/c;

    .line 196
    .line 197
    move v2, v1

    .line 198
    new-instance v1, Ljava/lang/Float;

    .line 199
    .line 200
    const/4 v3, 0x0

    .line 201
    invoke-direct {v1, v3}, Ljava/lang/Float;-><init>(F)V

    .line 202
    .line 203
    .line 204
    iget-object p1, p1, Lxb/o;->c:Li/r0;

    .line 205
    .line 206
    iput v2, v4, Lxb/m;->i:I

    .line 207
    .line 208
    const/4 v3, 0x0

    .line 209
    const/16 v5, 0xc

    .line 210
    .line 211
    move-object v2, p1

    .line 212
    invoke-static/range {v0 .. v5}, Li/c;->c(Li/c;Ljava/lang/Object;Li/k;Lfg/l;Lwf/c;I)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 217
    .line 218
    if-ne p1, v0, :cond_b

    .line 219
    .line 220
    move-object p1, v0

    .line 221
    goto :goto_7

    .line 222
    :cond_b
    :goto_6
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 223
    .line 224
    :goto_7
    return-object p1

    .line 225
    :pswitch_3
    move-object v4, p0

    .line 226
    iget v0, v4, Lxb/m;->i:I

    .line 227
    .line 228
    const/4 v1, 0x1

    .line 229
    if-eqz v0, :cond_d

    .line 230
    .line 231
    if-ne v0, v1, :cond_c

    .line 232
    .line 233
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    goto :goto_8

    .line 237
    :cond_c
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 238
    .line 239
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    const/4 p1, 0x0

    .line 243
    goto :goto_9

    .line 244
    :cond_d
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    iget-object p1, v4, Lxb/m;->j:Lxb/o;

    .line 248
    .line 249
    iget-object v0, p1, Lxb/o;->f:Li/c;

    .line 250
    .line 251
    iget-wide v2, p1, Lxb/o;->g:J

    .line 252
    .line 253
    new-instance p1, Le1/b;

    .line 254
    .line 255
    invoke-direct {p1, v2, v3}, Le1/b;-><init>(J)V

    .line 256
    .line 257
    .line 258
    iput v1, v4, Lxb/m;->i:I

    .line 259
    .line 260
    invoke-virtual {v0, p1, p0}, Li/c;->e(Ljava/lang/Object;Lwf/c;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object p1

    .line 264
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 265
    .line 266
    if-ne p1, v0, :cond_e

    .line 267
    .line 268
    move-object p1, v0

    .line 269
    goto :goto_9

    .line 270
    :cond_e
    :goto_8
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 271
    .line 272
    :goto_9
    return-object p1

    .line 273
    :pswitch_4
    move-object v4, p0

    .line 274
    iget v0, v4, Lxb/m;->i:I

    .line 275
    .line 276
    const/4 v1, 0x1

    .line 277
    if-eqz v0, :cond_10

    .line 278
    .line 279
    if-ne v0, v1, :cond_f

    .line 280
    .line 281
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 282
    .line 283
    .line 284
    goto :goto_a

    .line 285
    :cond_f
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 286
    .line 287
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    const/4 p1, 0x0

    .line 291
    goto :goto_b

    .line 292
    :cond_10
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 293
    .line 294
    .line 295
    iget-object p1, v4, Lxb/m;->j:Lxb/o;

    .line 296
    .line 297
    iget-object v0, p1, Lxb/o;->e:Li/c;

    .line 298
    .line 299
    move v2, v1

    .line 300
    new-instance v1, Ljava/lang/Float;

    .line 301
    .line 302
    const/high16 v3, 0x3f800000    # 1.0f

    .line 303
    .line 304
    invoke-direct {v1, v3}, Ljava/lang/Float;-><init>(F)V

    .line 305
    .line 306
    .line 307
    iget-object p1, p1, Lxb/o;->c:Li/r0;

    .line 308
    .line 309
    iput v2, v4, Lxb/m;->i:I

    .line 310
    .line 311
    const/4 v3, 0x0

    .line 312
    const/16 v5, 0xc

    .line 313
    .line 314
    move-object v2, p1

    .line 315
    invoke-static/range {v0 .. v5}, Li/c;->c(Li/c;Ljava/lang/Object;Li/k;Lfg/l;Lwf/c;I)Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object p1

    .line 319
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 320
    .line 321
    if-ne p1, v0, :cond_11

    .line 322
    .line 323
    move-object p1, v0

    .line 324
    goto :goto_b

    .line 325
    :cond_11
    :goto_a
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 326
    .line 327
    :goto_b
    return-object p1

    .line 328
    nop

    .line 329
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
