.class public final Li2;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# instance fields
.field public final synthetic d:Lww;

.field public final synthetic e:Lww;

.field public final synthetic f:J

.field public final synthetic g:J

.field public final synthetic h:J

.field public final synthetic i:Lmh;


# direct methods
.method public constructor <init>(Lww;Lww;JJJJLmh;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Li2;->d:Lww;

    .line 5
    .line 6
    iput-object p2, p0, Li2;->e:Lww;

    .line 7
    .line 8
    iput-wide p5, p0, Li2;->f:J

    .line 9
    .line 10
    iput-wide p7, p0, Li2;->g:J

    .line 11
    .line 12
    iput-wide p9, p0, Li2;->h:J

    .line 13
    .line 14
    iput-object p11, p0, Li2;->i:Lmh;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    check-cast p1, Lji;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Number;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    and-int/lit8 v0, p2, 0x3

    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    const/4 v2, 0x1

    .line 13
    const/4 v3, 0x0

    .line 14
    if-eq v0, v1, :cond_0

    .line 15
    .line 16
    move v0, v2

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v0, v3

    .line 19
    :goto_0
    and-int/2addr p2, v2

    .line 20
    move-object v8, p1

    .line 21
    check-cast v8, Lpi;

    .line 22
    .line 23
    invoke-virtual {v8, p2, v0}, Lpi;->O(IZ)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_9

    .line 28
    .line 29
    sget-object p1, Lme0;->a:Lme0;

    .line 30
    .line 31
    sget-object p2, Lm2;->a:Lln0;

    .line 32
    .line 33
    invoke-static {p1, p2}, Lrd0;->C(Lpe0;Ljn0;)Lpe0;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    sget-object p2, Ln2;->q:Lfa;

    .line 38
    .line 39
    invoke-static {p2, v8, v3}, Ltf;->a(Lfa;Lji;I)Lvf;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-static {v8}, Lo30;->p(Lji;)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    invoke-virtual {v8}, Lpi;->l()Lfq0;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-static {v8, p1}, Ls91;->E(Lji;Lpe0;)Lpe0;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    sget-object v4, Lfi;->b:Lei;

    .line 56
    .line 57
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    sget-object v10, Lei;->b:Lcj;

    .line 61
    .line 62
    invoke-virtual {v8}, Lpi;->Z()V

    .line 63
    .line 64
    .line 65
    iget-boolean v4, v8, Lpi;->S:Z

    .line 66
    .line 67
    if-eqz v4, :cond_1

    .line 68
    .line 69
    invoke-virtual {v8, v10}, Lpi;->k(Lhw;)V

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_1
    invoke-virtual {v8}, Lpi;->j0()V

    .line 74
    .line 75
    .line 76
    :goto_1
    sget-object v11, Lei;->e:Lm7;

    .line 77
    .line 78
    invoke-static {v8, v11, p2}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    sget-object p2, Lei;->d:Lm7;

    .line 82
    .line 83
    invoke-static {v8, p2, v1}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    sget-object v1, Lei;->f:Lm7;

    .line 87
    .line 88
    iget-boolean v4, v8, Lpi;->S:Z

    .line 89
    .line 90
    if-nez v4, :cond_2

    .line 91
    .line 92
    invoke-virtual {v8}, Lpi;->L()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    invoke-static {v4, v5}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v4

    .line 104
    if-nez v4, :cond_3

    .line 105
    .line 106
    :cond_2
    invoke-static {v0, v8, v0, v1}, Lt1;->o(ILpi;ILm7;)V

    .line 107
    .line 108
    .line 109
    :cond_3
    sget-object v0, Lei;->c:Lm7;

    .line 110
    .line 111
    invoke-static {v8, v0, p1}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    const p1, 0x14a0f326

    .line 115
    .line 116
    .line 117
    invoke-virtual {v8, p1}, Lpi;->W(I)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v8, v3}, Lpi;->p(Z)V

    .line 121
    .line 122
    .line 123
    iget-object p1, p0, Li2;->d:Lww;

    .line 124
    .line 125
    if-nez p1, :cond_4

    .line 126
    .line 127
    const p1, 0x14a59771

    .line 128
    .line 129
    .line 130
    invoke-virtual {v8, p1}, Lpi;->W(I)V

    .line 131
    .line 132
    .line 133
    :goto_2
    invoke-virtual {v8, v3}, Lpi;->p(Z)V

    .line 134
    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_4
    const v4, 0x14a59772

    .line 138
    .line 139
    .line 140
    invoke-virtual {v8, v4}, Lpi;->W(I)V

    .line 141
    .line 142
    .line 143
    sget-object v4, Ls91;->g:Lea1;

    .line 144
    .line 145
    invoke-static {v4, v8}, Lfa1;->a(Lea1;Lpi;)Ls71;

    .line 146
    .line 147
    .line 148
    move-result-object v6

    .line 149
    new-instance v4, Lh2;

    .line 150
    .line 151
    invoke-direct {v4, v3, p1}, Lh2;-><init>(ILww;)V

    .line 152
    .line 153
    .line 154
    const p1, 0x43fb671

    .line 155
    .line 156
    .line 157
    invoke-static {p1, v4, v8}, Lkl;->w(ILex;Lji;)Lmh;

    .line 158
    .line 159
    .line 160
    move-result-object v7

    .line 161
    const/16 v9, 0x180

    .line 162
    .line 163
    iget-wide v4, p0, Li2;->f:J

    .line 164
    .line 165
    invoke-static/range {v4 .. v9}, Lr60;->c(JLs71;Lww;Lji;I)V

    .line 166
    .line 167
    .line 168
    goto :goto_2

    .line 169
    :goto_3
    iget-object p1, p0, Li2;->e:Lww;

    .line 170
    .line 171
    if-nez p1, :cond_5

    .line 172
    .line 173
    const p1, 0x14b17479

    .line 174
    .line 175
    .line 176
    invoke-virtual {v8, p1}, Lpi;->W(I)V

    .line 177
    .line 178
    .line 179
    :goto_4
    invoke-virtual {v8, v3}, Lpi;->p(Z)V

    .line 180
    .line 181
    .line 182
    goto :goto_5

    .line 183
    :cond_5
    const v4, 0x14b1747a

    .line 184
    .line 185
    .line 186
    invoke-virtual {v8, v4}, Lpi;->W(I)V

    .line 187
    .line 188
    .line 189
    sget-object v4, Ls91;->i:Lea1;

    .line 190
    .line 191
    invoke-static {v4, v8}, Lfa1;->a(Lea1;Lpi;)Ls71;

    .line 192
    .line 193
    .line 194
    move-result-object v6

    .line 195
    new-instance v4, Lh2;

    .line 196
    .line 197
    invoke-direct {v4, v2, p1}, Lh2;-><init>(ILww;)V

    .line 198
    .line 199
    .line 200
    const p1, 0x2a0e58f2

    .line 201
    .line 202
    .line 203
    invoke-static {p1, v4, v8}, Lkl;->w(ILex;Lji;)Lmh;

    .line 204
    .line 205
    .line 206
    move-result-object v7

    .line 207
    const/16 v9, 0x180

    .line 208
    .line 209
    iget-wide v4, p0, Li2;->g:J

    .line 210
    .line 211
    invoke-static/range {v4 .. v9}, Lr60;->c(JLs71;Lww;Lji;I)V

    .line 212
    .line 213
    .line 214
    goto :goto_4

    .line 215
    :goto_5
    sget-object p1, Ln2;->s:Lfa;

    .line 216
    .line 217
    new-instance v4, Laz;

    .line 218
    .line 219
    invoke-direct {v4, p1}, Laz;-><init>(Lfa;)V

    .line 220
    .line 221
    .line 222
    sget-object p1, Ln2;->e:Lha;

    .line 223
    .line 224
    invoke-static {p1, v3}, Lza;->d(Lha;Z)Lxd0;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    invoke-static {v8}, Lo30;->p(Lji;)I

    .line 229
    .line 230
    .line 231
    move-result v3

    .line 232
    invoke-virtual {v8}, Lpi;->l()Lfq0;

    .line 233
    .line 234
    .line 235
    move-result-object v5

    .line 236
    invoke-static {v8, v4}, Ls91;->E(Lji;Lpe0;)Lpe0;

    .line 237
    .line 238
    .line 239
    move-result-object v4

    .line 240
    invoke-virtual {v8}, Lpi;->Z()V

    .line 241
    .line 242
    .line 243
    iget-boolean v6, v8, Lpi;->S:Z

    .line 244
    .line 245
    if-eqz v6, :cond_6

    .line 246
    .line 247
    invoke-virtual {v8, v10}, Lpi;->k(Lhw;)V

    .line 248
    .line 249
    .line 250
    goto :goto_6

    .line 251
    :cond_6
    invoke-virtual {v8}, Lpi;->j0()V

    .line 252
    .line 253
    .line 254
    :goto_6
    invoke-static {v8, v11, p1}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 255
    .line 256
    .line 257
    invoke-static {v8, p2, v5}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 258
    .line 259
    .line 260
    iget-boolean p1, v8, Lpi;->S:Z

    .line 261
    .line 262
    if-nez p1, :cond_7

    .line 263
    .line 264
    invoke-virtual {v8}, Lpi;->L()Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object p1

    .line 268
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 269
    .line 270
    .line 271
    move-result-object p2

    .line 272
    invoke-static {p1, p2}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 273
    .line 274
    .line 275
    move-result p1

    .line 276
    if-nez p1, :cond_8

    .line 277
    .line 278
    :cond_7
    invoke-static {v3, v8, v3, v1}, Lt1;->o(ILpi;ILm7;)V

    .line 279
    .line 280
    .line 281
    :cond_8
    invoke-static {v8, v0, v4}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 282
    .line 283
    .line 284
    sget-object p1, Ls91;->c:Lea1;

    .line 285
    .line 286
    invoke-static {p1, v8}, Lfa1;->a(Lea1;Lpi;)Ls71;

    .line 287
    .line 288
    .line 289
    move-result-object v6

    .line 290
    const/4 v9, 0x0

    .line 291
    iget-wide v4, p0, Li2;->h:J

    .line 292
    .line 293
    iget-object v7, p0, Li2;->i:Lmh;

    .line 294
    .line 295
    invoke-static/range {v4 .. v9}, Lr60;->c(JLs71;Lww;Lji;I)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v8, v2}, Lpi;->p(Z)V

    .line 299
    .line 300
    .line 301
    invoke-virtual {v8, v2}, Lpi;->p(Z)V

    .line 302
    .line 303
    .line 304
    goto :goto_7

    .line 305
    :cond_9
    invoke-virtual {v8}, Lpi;->R()V

    .line 306
    .line 307
    .line 308
    :goto_7
    sget-object p0, Lna1;->a:Lna1;

    .line 309
    .line 310
    return-object p0
.end method
