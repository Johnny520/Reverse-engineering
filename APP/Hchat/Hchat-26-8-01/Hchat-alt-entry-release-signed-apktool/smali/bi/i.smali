.class public final synthetic Lbi/i;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ls0/d;


# direct methods
.method public synthetic constructor <init>(Ls0/d;I)V
    .locals 0

    .line 1
    iput p2, p0, Lbi/i;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lbi/i;->h:Ls0/d;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public synthetic constructor <init>(Ls0/d;II)V
    .locals 0

    .line 9
    iput p3, p0, Lbi/i;->g:I

    iput-object p1, p0, Lbi/i;->h:Ls0/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lbi/i;->g:I

    .line 2
    .line 3
    check-cast p1, Li0/h0;

    .line 4
    .line 5
    check-cast p2, Ljava/lang/Integer;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    and-int/lit8 v0, p2, 0x3

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    const/4 v2, 0x0

    .line 18
    const/4 v3, 0x1

    .line 19
    if-eq v0, v1, :cond_0

    .line 20
    .line 21
    move v0, v3

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v0, v2

    .line 24
    :goto_0
    and-int/2addr p2, v3

    .line 25
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    if-eqz p2, :cond_1

    .line 30
    .line 31
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    iget-object v0, p0, Lbi/i;->h:Ls0/d;

    .line 36
    .line 37
    invoke-virtual {v0, p1, p2}, Ls0/d;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 42
    .line 43
    .line 44
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 45
    .line 46
    return-object p1

    .line 47
    :pswitch_0
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 48
    .line 49
    .line 50
    move-result p2

    .line 51
    and-int/lit8 v0, p2, 0x3

    .line 52
    .line 53
    const/4 v1, 0x2

    .line 54
    const/4 v2, 0x0

    .line 55
    const/4 v3, 0x1

    .line 56
    if-eq v0, v1, :cond_2

    .line 57
    .line 58
    move v0, v3

    .line 59
    goto :goto_2

    .line 60
    :cond_2
    move v0, v2

    .line 61
    :goto_2
    and-int/2addr p2, v3

    .line 62
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    if-eqz p2, :cond_3

    .line 67
    .line 68
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    iget-object v0, p0, Lbi/i;->h:Ls0/d;

    .line 73
    .line 74
    invoke-virtual {v0, p1, p2}, Ls0/d;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_3
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 79
    .line 80
    .line 81
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 82
    .line 83
    return-object p1

    .line 84
    :pswitch_1
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 85
    .line 86
    .line 87
    move-result p2

    .line 88
    and-int/lit8 v0, p2, 0x3

    .line 89
    .line 90
    const/4 v1, 0x2

    .line 91
    const/4 v2, 0x0

    .line 92
    const/4 v3, 0x1

    .line 93
    if-eq v0, v1, :cond_4

    .line 94
    .line 95
    move v0, v3

    .line 96
    goto :goto_4

    .line 97
    :cond_4
    move v0, v2

    .line 98
    :goto_4
    and-int/2addr p2, v3

    .line 99
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 100
    .line 101
    .line 102
    move-result p2

    .line 103
    if-eqz p2, :cond_5

    .line 104
    .line 105
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 106
    .line 107
    .line 108
    move-result-object p2

    .line 109
    iget-object v0, p0, Lbi/i;->h:Ls0/d;

    .line 110
    .line 111
    invoke-virtual {v0, p1, p2}, Ls0/d;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    goto :goto_5

    .line 115
    :cond_5
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 116
    .line 117
    .line 118
    :goto_5
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 119
    .line 120
    return-object p1

    .line 121
    :pswitch_2
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 122
    .line 123
    .line 124
    move-result p2

    .line 125
    and-int/lit8 v0, p2, 0x3

    .line 126
    .line 127
    const/4 v1, 0x2

    .line 128
    const/4 v2, 0x0

    .line 129
    const/4 v3, 0x1

    .line 130
    if-eq v0, v1, :cond_6

    .line 131
    .line 132
    move v0, v3

    .line 133
    goto :goto_6

    .line 134
    :cond_6
    move v0, v2

    .line 135
    :goto_6
    and-int/2addr p2, v3

    .line 136
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 137
    .line 138
    .line 139
    move-result p2

    .line 140
    if-eqz p2, :cond_7

    .line 141
    .line 142
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 143
    .line 144
    .line 145
    move-result-object p2

    .line 146
    iget-object v0, p0, Lbi/i;->h:Ls0/d;

    .line 147
    .line 148
    invoke-virtual {v0, p1, p2}, Ls0/d;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    goto :goto_7

    .line 152
    :cond_7
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 153
    .line 154
    .line 155
    :goto_7
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 156
    .line 157
    return-object p1

    .line 158
    :pswitch_3
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 159
    .line 160
    .line 161
    move-result p2

    .line 162
    and-int/lit8 v0, p2, 0x3

    .line 163
    .line 164
    const/4 v1, 0x2

    .line 165
    const/4 v2, 0x0

    .line 166
    const/4 v3, 0x1

    .line 167
    if-eq v0, v1, :cond_8

    .line 168
    .line 169
    move v0, v3

    .line 170
    goto :goto_8

    .line 171
    :cond_8
    move v0, v2

    .line 172
    :goto_8
    and-int/2addr p2, v3

    .line 173
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 174
    .line 175
    .line 176
    move-result p2

    .line 177
    if-eqz p2, :cond_a

    .line 178
    .line 179
    sget-object p2, Ly0/b;->g:Ly0/g;

    .line 180
    .line 181
    invoke-static {p2, v2}, Lp/o;->d(Ly0/g;Z)Lv1/n0;

    .line 182
    .line 183
    .line 184
    move-result-object p2

    .line 185
    iget-wide v0, p1, Li0/h0;->T:J

    .line 186
    .line 187
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 188
    .line 189
    .line 190
    move-result v0

    .line 191
    invoke-virtual {p1}, Li0/h0;->l()Ls0/h;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    sget-object v4, Ly0/l;->a:Ly0/l;

    .line 196
    .line 197
    invoke-static {p1, v4}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 198
    .line 199
    .line 200
    move-result-object v4

    .line 201
    sget-object v5, Lx1/g;->f:Lx1/f;

    .line 202
    .line 203
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    sget-object v5, Lx1/f;->b:Lx1/y;

    .line 207
    .line 208
    invoke-virtual {p1}, Li0/h0;->d0()V

    .line 209
    .line 210
    .line 211
    iget-boolean v6, p1, Li0/h0;->S:Z

    .line 212
    .line 213
    if-eqz v6, :cond_9

    .line 214
    .line 215
    invoke-virtual {p1, v5}, Li0/h0;->k(Lfg/a;)V

    .line 216
    .line 217
    .line 218
    goto :goto_9

    .line 219
    :cond_9
    invoke-virtual {p1}, Li0/h0;->n0()V

    .line 220
    .line 221
    .line 222
    :goto_9
    sget-object v5, Lx1/f;->e:Lx1/e;

    .line 223
    .line 224
    invoke-static {v5, p1, p2}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 225
    .line 226
    .line 227
    sget-object p2, Lx1/f;->d:Lx1/e;

    .line 228
    .line 229
    invoke-static {p2, p1, v1}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 230
    .line 231
    .line 232
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 233
    .line 234
    .line 235
    move-result-object p2

    .line 236
    sget-object v0, Lx1/f;->f:Lx1/e;

    .line 237
    .line 238
    invoke-static {p1, p2, v0}, Li0/r;->t(Li0/h0;Ljava/lang/Integer;Lfg/p;)V

    .line 239
    .line 240
    .line 241
    sget-object p2, Lx1/f;->g:Lx1/d;

    .line 242
    .line 243
    invoke-static {p2, p1}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 244
    .line 245
    .line 246
    sget-object p2, Lx1/f;->c:Lx1/e;

    .line 247
    .line 248
    invoke-static {p2, p1, v4}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 249
    .line 250
    .line 251
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 252
    .line 253
    .line 254
    move-result-object p2

    .line 255
    iget-object v0, p0, Lbi/i;->h:Ls0/d;

    .line 256
    .line 257
    invoke-virtual {v0, p1, p2}, Ls0/d;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 261
    .line 262
    .line 263
    goto :goto_a

    .line 264
    :cond_a
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 265
    .line 266
    .line 267
    :goto_a
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 268
    .line 269
    return-object p1

    .line 270
    :pswitch_4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 271
    .line 272
    .line 273
    const/4 p2, 0x7

    .line 274
    invoke-static {p2}, Li0/r;->C(I)I

    .line 275
    .line 276
    .line 277
    move-result p2

    .line 278
    iget-object v0, p0, Lbi/i;->h:Ls0/d;

    .line 279
    .line 280
    invoke-static {v0, p1, p2}, Lsh/s;->g(Ls0/d;Li0/h0;I)V

    .line 281
    .line 282
    .line 283
    :goto_b
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 284
    .line 285
    return-object p1

    .line 286
    :pswitch_5
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 287
    .line 288
    .line 289
    const/4 p2, 0x7

    .line 290
    invoke-static {p2}, Li0/r;->C(I)I

    .line 291
    .line 292
    .line 293
    move-result p2

    .line 294
    iget-object v0, p0, Lbi/i;->h:Ls0/d;

    .line 295
    .line 296
    invoke-static {v0, p1, p2}, Ls/o;->c(Ls0/d;Li0/h0;I)V

    .line 297
    .line 298
    .line 299
    goto :goto_b

    .line 300
    :pswitch_6
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 301
    .line 302
    .line 303
    move-result p2

    .line 304
    and-int/lit8 v0, p2, 0x3

    .line 305
    .line 306
    const/4 v1, 0x2

    .line 307
    const/4 v2, 0x0

    .line 308
    const/4 v3, 0x1

    .line 309
    if-eq v0, v1, :cond_b

    .line 310
    .line 311
    move v0, v3

    .line 312
    goto :goto_c

    .line 313
    :cond_b
    move v0, v2

    .line 314
    :goto_c
    and-int/2addr p2, v3

    .line 315
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 316
    .line 317
    .line 318
    move-result p2

    .line 319
    if-eqz p2, :cond_c

    .line 320
    .line 321
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 322
    .line 323
    .line 324
    move-result-object p2

    .line 325
    iget-object v0, p0, Lbi/i;->h:Ls0/d;

    .line 326
    .line 327
    invoke-virtual {v0, p1, p2}, Ls0/d;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    goto :goto_d

    .line 331
    :cond_c
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 332
    .line 333
    .line 334
    :goto_d
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 335
    .line 336
    return-object p1

    .line 337
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
