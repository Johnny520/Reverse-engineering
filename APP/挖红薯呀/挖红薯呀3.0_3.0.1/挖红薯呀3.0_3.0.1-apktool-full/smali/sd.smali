.class public final Lsd;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Liu;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Ljava/io/Serializable;

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/io/Serializable;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p5, p0, Lsd;->d:I

    .line 2
    .line 3
    iput-object p1, p0, Lsd;->e:Ljava/io/Serializable;

    .line 4
    .line 5
    iput-object p2, p0, Lsd;->f:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Lsd;->g:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p4, p0, Lsd;->h:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;Lik;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lsd;->d:I

    .line 2
    .line 3
    sget-object v1, Lna1;->a:Lna1;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v3, p0, Lsd;->e:Ljava/io/Serializable;

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p1, Lf30;

    .line 13
    .line 14
    iget-object p2, p0, Lsd;->g:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p2, Lxt0;

    .line 17
    .line 18
    iget-object v0, p0, Lsd;->f:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lxt0;

    .line 21
    .line 22
    check-cast v3, Lxt0;

    .line 23
    .line 24
    instance-of v5, p1, Ljs0;

    .line 25
    .line 26
    if-eqz v5, :cond_0

    .line 27
    .line 28
    iget p1, v3, Lxt0;->d:I

    .line 29
    .line 30
    add-int/2addr p1, v2

    .line 31
    iput p1, v3, Lxt0;->d:I

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    instance-of v5, p1, Lks0;

    .line 35
    .line 36
    if-eqz v5, :cond_1

    .line 37
    .line 38
    iget p1, v3, Lxt0;->d:I

    .line 39
    .line 40
    add-int/lit8 p1, p1, -0x1

    .line 41
    .line 42
    iput p1, v3, Lxt0;->d:I

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    instance-of v5, p1, Lis0;

    .line 46
    .line 47
    if-eqz v5, :cond_2

    .line 48
    .line 49
    iget p1, v3, Lxt0;->d:I

    .line 50
    .line 51
    add-int/lit8 p1, p1, -0x1

    .line 52
    .line 53
    iput p1, v3, Lxt0;->d:I

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    instance-of v5, p1, Lgz;

    .line 57
    .line 58
    if-eqz v5, :cond_3

    .line 59
    .line 60
    iget p1, v0, Lxt0;->d:I

    .line 61
    .line 62
    add-int/2addr p1, v2

    .line 63
    iput p1, v0, Lxt0;->d:I

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_3
    instance-of v5, p1, Lhz;

    .line 67
    .line 68
    if-eqz v5, :cond_4

    .line 69
    .line 70
    iget p1, v0, Lxt0;->d:I

    .line 71
    .line 72
    add-int/lit8 p1, p1, -0x1

    .line 73
    .line 74
    iput p1, v0, Lxt0;->d:I

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_4
    instance-of v5, p1, Lru;

    .line 78
    .line 79
    if-eqz v5, :cond_5

    .line 80
    .line 81
    iget p1, p2, Lxt0;->d:I

    .line 82
    .line 83
    add-int/2addr p1, v2

    .line 84
    iput p1, p2, Lxt0;->d:I

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_5
    instance-of p1, p1, Lsu;

    .line 88
    .line 89
    if-eqz p1, :cond_6

    .line 90
    .line 91
    iget p1, p2, Lxt0;->d:I

    .line 92
    .line 93
    add-int/lit8 p1, p1, -0x1

    .line 94
    .line 95
    iput p1, p2, Lxt0;->d:I

    .line 96
    .line 97
    :cond_6
    :goto_0
    iget p1, v3, Lxt0;->d:I

    .line 98
    .line 99
    if-lez p1, :cond_7

    .line 100
    .line 101
    move p1, v2

    .line 102
    goto :goto_1

    .line 103
    :cond_7
    move p1, v4

    .line 104
    :goto_1
    iget v0, v0, Lxt0;->d:I

    .line 105
    .line 106
    if-lez v0, :cond_8

    .line 107
    .line 108
    move v0, v2

    .line 109
    goto :goto_2

    .line 110
    :cond_8
    move v0, v4

    .line 111
    :goto_2
    iget p2, p2, Lxt0;->d:I

    .line 112
    .line 113
    if-lez p2, :cond_9

    .line 114
    .line 115
    move p2, v2

    .line 116
    goto :goto_3

    .line 117
    :cond_9
    move p2, v4

    .line 118
    :goto_3
    iget-object p0, p0, Lsd;->h:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast p0, Lql;

    .line 121
    .line 122
    iget-boolean v3, p0, Lql;->s:Z

    .line 123
    .line 124
    if-eq v3, p1, :cond_a

    .line 125
    .line 126
    iput-boolean p1, p0, Lql;->s:Z

    .line 127
    .line 128
    move v4, v2

    .line 129
    :cond_a
    iget-boolean p1, p0, Lql;->t:Z

    .line 130
    .line 131
    if-eq p1, v0, :cond_b

    .line 132
    .line 133
    iput-boolean v0, p0, Lql;->t:Z

    .line 134
    .line 135
    move v4, v2

    .line 136
    :cond_b
    iget-boolean p1, p0, Lql;->u:Z

    .line 137
    .line 138
    if-eq p1, p2, :cond_c

    .line 139
    .line 140
    iput-boolean p2, p0, Lql;->u:Z

    .line 141
    .line 142
    goto :goto_4

    .line 143
    :cond_c
    move v2, v4

    .line 144
    :goto_4
    if-eqz v2, :cond_d

    .line 145
    .line 146
    invoke-static {p0}, Lkl;->r(Ltq;)V

    .line 147
    .line 148
    .line 149
    :cond_d
    return-object v1

    .line 150
    :pswitch_0
    instance-of v0, p2, Lrd;

    .line 151
    .line 152
    if-eqz v0, :cond_e

    .line 153
    .line 154
    move-object v0, p2

    .line 155
    check-cast v0, Lrd;

    .line 156
    .line 157
    iget v5, v0, Lrd;->k:I

    .line 158
    .line 159
    const/high16 v6, -0x80000000

    .line 160
    .line 161
    and-int v7, v5, v6

    .line 162
    .line 163
    if-eqz v7, :cond_e

    .line 164
    .line 165
    sub-int/2addr v5, v6

    .line 166
    iput v5, v0, Lrd;->k:I

    .line 167
    .line 168
    goto :goto_5

    .line 169
    :cond_e
    new-instance v0, Lrd;

    .line 170
    .line 171
    invoke-direct {v0, p0, p2}, Lrd;-><init>(Lsd;Lik;)V

    .line 172
    .line 173
    .line 174
    :goto_5
    iget-object p2, v0, Lrd;->i:Ljava/lang/Object;

    .line 175
    .line 176
    iget v5, v0, Lrd;->k:I

    .line 177
    .line 178
    const/4 v6, 0x0

    .line 179
    if-eqz v5, :cond_10

    .line 180
    .line 181
    if-ne v5, v2, :cond_f

    .line 182
    .line 183
    iget-object p1, v0, Lrd;->h:Ljava/lang/Object;

    .line 184
    .line 185
    iget-object p0, v0, Lrd;->g:Lsd;

    .line 186
    .line 187
    invoke-static {p2}, Lw60;->M(Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    goto :goto_6

    .line 191
    :cond_f
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 192
    .line 193
    invoke-static {p0}, Lxc;->o(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    move-object v1, v6

    .line 197
    goto :goto_7

    .line 198
    :cond_10
    invoke-static {p2}, Lw60;->M(Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    check-cast v3, Lzt0;

    .line 202
    .line 203
    iget-object p2, v3, Lzt0;->d:Ljava/lang/Object;

    .line 204
    .line 205
    check-cast p2, Lc40;

    .line 206
    .line 207
    if-eqz p2, :cond_11

    .line 208
    .line 209
    new-instance v3, Lbe;

    .line 210
    .line 211
    const-string v5, "Child of the scoped flow was cancelled"

    .line 212
    .line 213
    invoke-direct {v3, v5, v4}, Lbe;-><init>(Ljava/lang/String;I)V

    .line 214
    .line 215
    .line 216
    invoke-interface {p2, v3}, Lc40;->a(Ljava/util/concurrent/CancellationException;)V

    .line 217
    .line 218
    .line 219
    iput-object p0, v0, Lrd;->g:Lsd;

    .line 220
    .line 221
    iput-object p1, v0, Lrd;->h:Ljava/lang/Object;

    .line 222
    .line 223
    iput v2, v0, Lrd;->k:I

    .line 224
    .line 225
    invoke-interface {p2, v0}, Lc40;->v(Ljk;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object p2

    .line 229
    sget-object v0, Lzk;->d:Lzk;

    .line 230
    .line 231
    if-ne p2, v0, :cond_11

    .line 232
    .line 233
    move-object v1, v0

    .line 234
    goto :goto_7

    .line 235
    :cond_11
    :goto_6
    iget-object p2, p0, Lsd;->e:Ljava/io/Serializable;

    .line 236
    .line 237
    check-cast p2, Lzt0;

    .line 238
    .line 239
    iget-object v0, p0, Lsd;->f:Ljava/lang/Object;

    .line 240
    .line 241
    check-cast v0, Lyk;

    .line 242
    .line 243
    new-instance v3, Lqd;

    .line 244
    .line 245
    iget-object v4, p0, Lsd;->g:Ljava/lang/Object;

    .line 246
    .line 247
    check-cast v4, Ltd;

    .line 248
    .line 249
    iget-object p0, p0, Lsd;->h:Ljava/lang/Object;

    .line 250
    .line 251
    check-cast p0, Liu;

    .line 252
    .line 253
    invoke-direct {v3, v4, p0, p1, v6}, Lqd;-><init>(Ltd;Liu;Ljava/lang/Object;Lik;)V

    .line 254
    .line 255
    .line 256
    invoke-static {v0, v6, v3, v2}, Li4;->w(Lyk;Lpk;Lww;I)Lr31;

    .line 257
    .line 258
    .line 259
    move-result-object p0

    .line 260
    iput-object p0, p2, Lzt0;->d:Ljava/lang/Object;

    .line 261
    .line 262
    :goto_7
    return-object v1

    .line 263
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
