.class public final Lxb/b;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic h:I

.field public i:I

.field public final synthetic j:Lxb/i;


# direct methods
.method public synthetic constructor <init>(Lxb/i;Lwf/c;I)V
    .locals 0

    .line 1
    iput p3, p0, Lxb/b;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Lxb/b;->j:Lxb/i;

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
    iget p1, p0, Lxb/b;->h:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Lxb/b;

    .line 7
    .line 8
    iget-object v0, p0, Lxb/b;->j:Lxb/i;

    .line 9
    .line 10
    const/4 v1, 0x6

    .line 11
    invoke-direct {p1, v0, p2, v1}, Lxb/b;-><init>(Lxb/i;Lwf/c;I)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, Lxb/b;

    .line 16
    .line 17
    iget-object v0, p0, Lxb/b;->j:Lxb/i;

    .line 18
    .line 19
    const/4 v1, 0x5

    .line 20
    invoke-direct {p1, v0, p2, v1}, Lxb/b;-><init>(Lxb/i;Lwf/c;I)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_1
    new-instance p1, Lxb/b;

    .line 25
    .line 26
    iget-object v0, p0, Lxb/b;->j:Lxb/i;

    .line 27
    .line 28
    const/4 v1, 0x4

    .line 29
    invoke-direct {p1, v0, p2, v1}, Lxb/b;-><init>(Lxb/i;Lwf/c;I)V

    .line 30
    .line 31
    .line 32
    return-object p1

    .line 33
    :pswitch_2
    new-instance p1, Lxb/b;

    .line 34
    .line 35
    iget-object v0, p0, Lxb/b;->j:Lxb/i;

    .line 36
    .line 37
    const/4 v1, 0x3

    .line 38
    invoke-direct {p1, v0, p2, v1}, Lxb/b;-><init>(Lxb/i;Lwf/c;I)V

    .line 39
    .line 40
    .line 41
    return-object p1

    .line 42
    :pswitch_3
    new-instance p1, Lxb/b;

    .line 43
    .line 44
    iget-object v0, p0, Lxb/b;->j:Lxb/i;

    .line 45
    .line 46
    const/4 v1, 0x2

    .line 47
    invoke-direct {p1, v0, p2, v1}, Lxb/b;-><init>(Lxb/i;Lwf/c;I)V

    .line 48
    .line 49
    .line 50
    return-object p1

    .line 51
    :pswitch_4
    new-instance p1, Lxb/b;

    .line 52
    .line 53
    iget-object v0, p0, Lxb/b;->j:Lxb/i;

    .line 54
    .line 55
    const/4 v1, 0x1

    .line 56
    invoke-direct {p1, v0, p2, v1}, Lxb/b;-><init>(Lxb/i;Lwf/c;I)V

    .line 57
    .line 58
    .line 59
    return-object p1

    .line 60
    :pswitch_5
    new-instance p1, Lxb/b;

    .line 61
    .line 62
    iget-object v0, p0, Lxb/b;->j:Lxb/i;

    .line 63
    .line 64
    const/4 v1, 0x0

    .line 65
    invoke-direct {p1, v0, p2, v1}, Lxb/b;-><init>(Lxb/i;Lwf/c;I)V

    .line 66
    .line 67
    .line 68
    return-object p1

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
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
    iget v0, p0, Lxb/b;->h:I

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
    invoke-virtual {p0, p1, p2}, Lxb/b;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lxb/b;

    .line 15
    .line 16
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lxb/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lxb/b;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lxb/b;

    .line 28
    .line 29
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Lxb/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, Lxb/b;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, Lxb/b;

    .line 41
    .line 42
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 43
    .line 44
    invoke-virtual {p1, p2}, Lxb/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    return-object p1

    .line 49
    :pswitch_2
    invoke-virtual {p0, p1, p2}, Lxb/b;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    check-cast p1, Lxb/b;

    .line 54
    .line 55
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 56
    .line 57
    invoke-virtual {p1, p2}, Lxb/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    return-object p1

    .line 62
    :pswitch_3
    invoke-virtual {p0, p1, p2}, Lxb/b;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    check-cast p1, Lxb/b;

    .line 67
    .line 68
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 69
    .line 70
    invoke-virtual {p1, p2}, Lxb/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    return-object p1

    .line 75
    :pswitch_4
    invoke-virtual {p0, p1, p2}, Lxb/b;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    check-cast p1, Lxb/b;

    .line 80
    .line 81
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 82
    .line 83
    invoke-virtual {p1, p2}, Lxb/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    return-object p1

    .line 88
    :pswitch_5
    invoke-virtual {p0, p1, p2}, Lxb/b;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    check-cast p1, Lxb/b;

    .line 93
    .line 94
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 95
    .line 96
    invoke-virtual {p1, p2}, Lxb/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    return-object p1

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
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
    iget v0, p0, Lxb/b;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lxb/b;->i:I

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
    iget-object p1, p0, Lxb/b;->j:Lxb/i;

    .line 30
    .line 31
    iget-object v2, p1, Lxb/i;->o:Li/c;

    .line 32
    .line 33
    new-instance v3, Ljava/lang/Float;

    .line 34
    .line 35
    const/high16 v0, 0x3f800000    # 1.0f

    .line 36
    .line 37
    invoke-direct {v3, v0}, Ljava/lang/Float;-><init>(F)V

    .line 38
    .line 39
    .line 40
    iget-object v4, p1, Lxb/i;->j:Li/r0;

    .line 41
    .line 42
    iput v1, p0, Lxb/b;->i:I

    .line 43
    .line 44
    const/4 v5, 0x0

    .line 45
    const/16 v7, 0xc

    .line 46
    .line 47
    move-object v6, p0

    .line 48
    invoke-static/range {v2 .. v7}, Li/c;->c(Li/c;Ljava/lang/Object;Li/k;Lfg/l;Lwf/c;I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    move-object v4, v6

    .line 53
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 54
    .line 55
    if-ne p1, v0, :cond_2

    .line 56
    .line 57
    move-object p1, v0

    .line 58
    goto :goto_1

    .line 59
    :cond_2
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 60
    .line 61
    :goto_1
    return-object p1

    .line 62
    :pswitch_0
    move-object v4, p0

    .line 63
    iget v0, v4, Lxb/b;->i:I

    .line 64
    .line 65
    const/4 v1, 0x1

    .line 66
    if-eqz v0, :cond_4

    .line 67
    .line 68
    if-ne v0, v1, :cond_3

    .line 69
    .line 70
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_3
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 75
    .line 76
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    const/4 p1, 0x0

    .line 80
    goto :goto_3

    .line 81
    :cond_4
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    iget-object p1, v4, Lxb/b;->j:Lxb/i;

    .line 85
    .line 86
    iget-object v0, p1, Lxb/i;->n:Li/c;

    .line 87
    .line 88
    move v2, v1

    .line 89
    new-instance v1, Ljava/lang/Float;

    .line 90
    .line 91
    const/high16 v3, 0x3f800000    # 1.0f

    .line 92
    .line 93
    invoke-direct {v1, v3}, Ljava/lang/Float;-><init>(F)V

    .line 94
    .line 95
    .line 96
    iget-object p1, p1, Lxb/i;->i:Li/r0;

    .line 97
    .line 98
    iput v2, v4, Lxb/b;->i:I

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
    iget v0, v4, Lxb/b;->i:I

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
    iget-object p1, v4, Lxb/b;->j:Lxb/i;

    .line 140
    .line 141
    iget-object v0, p1, Lxb/i;->m:Li/c;

    .line 142
    .line 143
    move v2, v1

    .line 144
    new-instance v1, Ljava/lang/Float;

    .line 145
    .line 146
    const/4 v3, 0x0

    .line 147
    invoke-direct {v1, v3}, Ljava/lang/Float;-><init>(F)V

    .line 148
    .line 149
    .line 150
    iget-object p1, p1, Lxb/i;->h:Li/r0;

    .line 151
    .line 152
    iput v2, v4, Lxb/b;->i:I

    .line 153
    .line 154
    const/4 v3, 0x0

    .line 155
    const/16 v5, 0xc

    .line 156
    .line 157
    move-object v2, p1

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
    iget v0, v4, Lxb/b;->i:I

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
    iget-object p1, v4, Lxb/b;->j:Lxb/i;

    .line 194
    .line 195
    iget-object v0, p1, Lxb/i;->o:Li/c;

    .line 196
    .line 197
    move v2, v1

    .line 198
    new-instance v1, Ljava/lang/Float;

    .line 199
    .line 200
    const v3, 0x3fb24925

    .line 201
    .line 202
    .line 203
    invoke-direct {v1, v3}, Ljava/lang/Float;-><init>(F)V

    .line 204
    .line 205
    .line 206
    iget-object p1, p1, Lxb/i;->j:Li/r0;

    .line 207
    .line 208
    iput v2, v4, Lxb/b;->i:I

    .line 209
    .line 210
    const/4 v3, 0x0

    .line 211
    const/16 v5, 0xc

    .line 212
    .line 213
    move-object v2, p1

    .line 214
    invoke-static/range {v0 .. v5}, Li/c;->c(Li/c;Ljava/lang/Object;Li/k;Lfg/l;Lwf/c;I)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 219
    .line 220
    if-ne p1, v0, :cond_b

    .line 221
    .line 222
    move-object p1, v0

    .line 223
    goto :goto_7

    .line 224
    :cond_b
    :goto_6
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 225
    .line 226
    :goto_7
    return-object p1

    .line 227
    :pswitch_3
    move-object v4, p0

    .line 228
    iget v0, v4, Lxb/b;->i:I

    .line 229
    .line 230
    const/4 v1, 0x1

    .line 231
    if-eqz v0, :cond_d

    .line 232
    .line 233
    if-ne v0, v1, :cond_c

    .line 234
    .line 235
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 236
    .line 237
    .line 238
    goto :goto_8

    .line 239
    :cond_c
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 240
    .line 241
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    const/4 p1, 0x0

    .line 245
    goto :goto_9

    .line 246
    :cond_d
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 247
    .line 248
    .line 249
    iget-object p1, v4, Lxb/b;->j:Lxb/i;

    .line 250
    .line 251
    iget-object v0, p1, Lxb/i;->n:Li/c;

    .line 252
    .line 253
    move v2, v1

    .line 254
    new-instance v1, Ljava/lang/Float;

    .line 255
    .line 256
    const v3, 0x3fb24925

    .line 257
    .line 258
    .line 259
    invoke-direct {v1, v3}, Ljava/lang/Float;-><init>(F)V

    .line 260
    .line 261
    .line 262
    iget-object p1, p1, Lxb/i;->i:Li/r0;

    .line 263
    .line 264
    iput v2, v4, Lxb/b;->i:I

    .line 265
    .line 266
    const/4 v3, 0x0

    .line 267
    const/16 v5, 0xc

    .line 268
    .line 269
    move-object v2, p1

    .line 270
    invoke-static/range {v0 .. v5}, Li/c;->c(Li/c;Ljava/lang/Object;Li/k;Lfg/l;Lwf/c;I)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object p1

    .line 274
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 275
    .line 276
    if-ne p1, v0, :cond_e

    .line 277
    .line 278
    move-object p1, v0

    .line 279
    goto :goto_9

    .line 280
    :cond_e
    :goto_8
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 281
    .line 282
    :goto_9
    return-object p1

    .line 283
    :pswitch_4
    move-object v4, p0

    .line 284
    iget v0, v4, Lxb/b;->i:I

    .line 285
    .line 286
    const/4 v1, 0x1

    .line 287
    if-eqz v0, :cond_10

    .line 288
    .line 289
    if-ne v0, v1, :cond_f

    .line 290
    .line 291
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 292
    .line 293
    .line 294
    goto :goto_a

    .line 295
    :cond_f
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 296
    .line 297
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    const/4 p1, 0x0

    .line 301
    goto :goto_b

    .line 302
    :cond_10
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 303
    .line 304
    .line 305
    iget-object p1, v4, Lxb/b;->j:Lxb/i;

    .line 306
    .line 307
    iget-object v0, p1, Lxb/i;->m:Li/c;

    .line 308
    .line 309
    move v2, v1

    .line 310
    new-instance v1, Ljava/lang/Float;

    .line 311
    .line 312
    const/high16 v3, 0x3f800000    # 1.0f

    .line 313
    .line 314
    invoke-direct {v1, v3}, Ljava/lang/Float;-><init>(F)V

    .line 315
    .line 316
    .line 317
    iget-object p1, p1, Lxb/i;->h:Li/r0;

    .line 318
    .line 319
    iput v2, v4, Lxb/b;->i:I

    .line 320
    .line 321
    const/4 v3, 0x0

    .line 322
    const/16 v5, 0xc

    .line 323
    .line 324
    move-object v2, p1

    .line 325
    invoke-static/range {v0 .. v5}, Li/c;->c(Li/c;Ljava/lang/Object;Li/k;Lfg/l;Lwf/c;I)Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object p1

    .line 329
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 330
    .line 331
    if-ne p1, v0, :cond_11

    .line 332
    .line 333
    move-object p1, v0

    .line 334
    goto :goto_b

    .line 335
    :cond_11
    :goto_a
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 336
    .line 337
    :goto_b
    return-object p1

    .line 338
    :pswitch_5
    move-object v4, p0

    .line 339
    iget v0, v4, Lxb/b;->i:I

    .line 340
    .line 341
    const/4 v1, 0x1

    .line 342
    if-eqz v0, :cond_13

    .line 343
    .line 344
    if-ne v0, v1, :cond_12

    .line 345
    .line 346
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 347
    .line 348
    .line 349
    goto :goto_c

    .line 350
    :cond_12
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 351
    .line 352
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 353
    .line 354
    .line 355
    const/4 p1, 0x0

    .line 356
    goto :goto_d

    .line 357
    :cond_13
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 358
    .line 359
    .line 360
    iget-object p1, v4, Lxb/b;->j:Lxb/i;

    .line 361
    .line 362
    iget-object v0, p1, Lxb/i;->l:Li/c;

    .line 363
    .line 364
    move v2, v1

    .line 365
    new-instance v1, Ljava/lang/Float;

    .line 366
    .line 367
    const/4 v3, 0x0

    .line 368
    invoke-direct {v1, v3}, Ljava/lang/Float;-><init>(F)V

    .line 369
    .line 370
    .line 371
    iget-object p1, p1, Lxb/i;->g:Li/r0;

    .line 372
    .line 373
    iput v2, v4, Lxb/b;->i:I

    .line 374
    .line 375
    const/4 v3, 0x0

    .line 376
    const/16 v5, 0xc

    .line 377
    .line 378
    move-object v2, p1

    .line 379
    invoke-static/range {v0 .. v5}, Li/c;->c(Li/c;Ljava/lang/Object;Li/k;Lfg/l;Lwf/c;I)Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object p1

    .line 383
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 384
    .line 385
    if-ne p1, v0, :cond_14

    .line 386
    .line 387
    move-object p1, v0

    .line 388
    goto :goto_d

    .line 389
    :cond_14
    :goto_c
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 390
    .line 391
    :goto_d
    return-object p1

    .line 392
    nop

    .line 393
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
