.class public final synthetic Lwb/ui;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/util/List;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Lfg/l;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Lfg/l;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    iput v0, p0, Lwb/ui;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwb/ui;->h:Ljava/util/List;

    .line 8
    .line 9
    iput-object p2, p0, Lwb/ui;->j:Lfg/l;

    .line 10
    .line 11
    iput-object p3, p0, Lwb/ui;->i:Ljava/lang/String;

    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Ljava/lang/String;Lfg/l;)V
    .locals 1

    .line 14
    const/4 v0, 0x2

    iput v0, p0, Lwb/ui;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwb/ui;->h:Ljava/util/List;

    iput-object p2, p0, Lwb/ui;->i:Ljava/lang/String;

    iput-object p3, p0, Lwb/ui;->j:Lfg/l;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Ljava/lang/String;Lfg/l;II)V
    .locals 0

    .line 15
    iput p5, p0, Lwb/ui;->g:I

    iput-object p1, p0, Lwb/ui;->h:Ljava/util/List;

    iput-object p2, p0, Lwb/ui;->i:Ljava/lang/String;

    iput-object p3, p0, Lwb/ui;->j:Lfg/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Lwb/ui;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v10, p1

    .line 7
    check-cast v10, Li0/h0;

    .line 8
    .line 9
    check-cast p2, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    and-int/lit8 p2, p1, 0x3

    .line 16
    .line 17
    const/4 v0, 0x2

    .line 18
    const/4 v1, 0x1

    .line 19
    if-eq p2, v0, :cond_0

    .line 20
    .line 21
    move p2, v1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 p2, 0x0

    .line 24
    :goto_0
    and-int/2addr p1, v1

    .line 25
    invoke-virtual {v10, p1, p2}, Li0/h0;->S(IZ)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_3

    .line 30
    .line 31
    sget-object p1, Ly0/l;->a:Ly0/l;

    .line 32
    .line 33
    const/high16 p2, 0x3f800000    # 1.0f

    .line 34
    .line 35
    invoke-static {p1, p2}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    const/16 p2, 0x168

    .line 40
    .line 41
    int-to-float p2, p2

    .line 42
    const/4 v0, 0x0

    .line 43
    invoke-static {p1, v0, p2, v1}, Lp/h1;->g(Ly0/o;FFI)Ly0/o;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    iget-object p1, p0, Lwb/ui;->h:Ljava/util/List;

    .line 48
    .line 49
    invoke-virtual {v10, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result p2

    .line 53
    iget-object v0, p0, Lwb/ui;->j:Lfg/l;

    .line 54
    .line 55
    invoke-virtual {v10, v0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    or-int/2addr p2, v2

    .line 60
    iget-object v2, p0, Lwb/ui;->i:Ljava/lang/String;

    .line 61
    .line 62
    invoke-virtual {v10, v2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    or-int/2addr p2, v3

    .line 67
    invoke-virtual {v10}, Li0/h0;->P()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    if-nez p2, :cond_1

    .line 72
    .line 73
    sget-object p2, Li0/l;->a:Li0/e;

    .line 74
    .line 75
    if-ne v3, p2, :cond_2

    .line 76
    .line 77
    :cond_1
    new-instance v3, Lc9/y0;

    .line 78
    .line 79
    invoke-direct {v3, p1, v0, v2}, Lc9/y0;-><init>(Ljava/util/List;Lfg/l;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v10, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    :cond_2
    move-object v9, v3

    .line 86
    check-cast v9, Lfg/l;

    .line 87
    .line 88
    const/4 v11, 0x6

    .line 89
    const/16 v12, 0x1fe

    .line 90
    .line 91
    const/4 v2, 0x0

    .line 92
    const/4 v3, 0x0

    .line 93
    const/4 v4, 0x0

    .line 94
    const/4 v5, 0x0

    .line 95
    const/4 v6, 0x0

    .line 96
    const/4 v7, 0x0

    .line 97
    const/4 v8, 0x0

    .line 98
    invoke-static/range {v1 .. v12}, La/a;->b(Ly0/o;Lr/z;Lp/x0;Lp/i;Ly0/e;Lm/p;ZLk/k1;Lfg/l;Li0/h0;II)V

    .line 99
    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_3
    invoke-virtual {v10}, Li0/h0;->V()V

    .line 103
    .line 104
    .line 105
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 106
    .line 107
    return-object p1

    .line 108
    :pswitch_0
    check-cast p1, Li0/h0;

    .line 109
    .line 110
    check-cast p2, Ljava/lang/Integer;

    .line 111
    .line 112
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 113
    .line 114
    .line 115
    move-result p2

    .line 116
    and-int/lit8 v0, p2, 0x3

    .line 117
    .line 118
    const/4 v1, 0x2

    .line 119
    const/4 v2, 0x1

    .line 120
    const/4 v3, 0x0

    .line 121
    if-eq v0, v1, :cond_4

    .line 122
    .line 123
    move v0, v2

    .line 124
    goto :goto_2

    .line 125
    :cond_4
    move v0, v3

    .line 126
    :goto_2
    and-int/2addr p2, v2

    .line 127
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 128
    .line 129
    .line 130
    move-result p2

    .line 131
    if-eqz p2, :cond_b

    .line 132
    .line 133
    iget-object p2, p0, Lwb/ui;->h:Ljava/util/List;

    .line 134
    .line 135
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    if-eqz v0, :cond_5

    .line 140
    .line 141
    const p2, -0x4e6dbb49

    .line 142
    .line 143
    .line 144
    invoke-virtual {p1, p2}, Li0/h0;->a0(I)V

    .line 145
    .line 146
    .line 147
    iget-object p2, p0, Lwb/ui;->i:Ljava/lang/String;

    .line 148
    .line 149
    invoke-static {p2, p1, v3}, Lwb/ho;->s0(Ljava/lang/String;Li0/h0;I)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 153
    .line 154
    .line 155
    goto :goto_5

    .line 156
    :cond_5
    const v0, -0x4e6cd68a

    .line 157
    .line 158
    .line 159
    invoke-virtual {p1, v0}, Li0/h0;->a0(I)V

    .line 160
    .line 161
    .line 162
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    move v1, v3

    .line 167
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 168
    .line 169
    .line 170
    move-result v4

    .line 171
    if-eqz v4, :cond_a

    .line 172
    .line 173
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v4

    .line 177
    add-int/lit8 v5, v1, 0x1

    .line 178
    .line 179
    if-ltz v1, :cond_9

    .line 180
    .line 181
    check-cast v4, Lvb/a;

    .line 182
    .line 183
    iget-object v6, p0, Lwb/ui;->j:Lfg/l;

    .line 184
    .line 185
    invoke-virtual {p1, v6}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    move-result v7

    .line 189
    invoke-virtual {p1, v4}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v8

    .line 193
    or-int/2addr v7, v8

    .line 194
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v8

    .line 198
    if-nez v7, :cond_6

    .line 199
    .line 200
    sget-object v7, Li0/l;->a:Li0/e;

    .line 201
    .line 202
    if-ne v8, v7, :cond_7

    .line 203
    .line 204
    :cond_6
    new-instance v8, Lsh/v1;

    .line 205
    .line 206
    const/16 v7, 0xb

    .line 207
    .line 208
    invoke-direct {v8, v6, v7, v4}, Lsh/v1;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {p1, v8}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    :cond_7
    check-cast v8, Lfg/a;

    .line 215
    .line 216
    invoke-static {v4, v8, p1, v3}, Lwb/ho;->I0(Lvb/a;Lfg/a;Li0/h0;I)V

    .line 217
    .line 218
    .line 219
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 220
    .line 221
    .line 222
    move-result v4

    .line 223
    sub-int/2addr v4, v2

    .line 224
    if-ge v1, v4, :cond_8

    .line 225
    .line 226
    const v1, -0x2273af4

    .line 227
    .line 228
    .line 229
    invoke-virtual {p1, v1}, Li0/h0;->a0(I)V

    .line 230
    .line 231
    .line 232
    const/4 v1, 0x0

    .line 233
    invoke-static {v1, p1, v3, v2}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 237
    .line 238
    .line 239
    goto :goto_4

    .line 240
    :cond_8
    const v1, -0x226703e

    .line 241
    .line 242
    .line 243
    invoke-virtual {p1, v1}, Li0/h0;->a0(I)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 247
    .line 248
    .line 249
    :goto_4
    move v1, v5

    .line 250
    goto :goto_3

    .line 251
    :cond_9
    invoke-static {}, La/a;->Q0()V

    .line 252
    .line 253
    .line 254
    const/4 p1, 0x0

    .line 255
    throw p1

    .line 256
    :cond_a
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 257
    .line 258
    .line 259
    goto :goto_5

    .line 260
    :cond_b
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 261
    .line 262
    .line 263
    :goto_5
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 264
    .line 265
    return-object p1

    .line 266
    :pswitch_1
    check-cast p1, Li0/h0;

    .line 267
    .line 268
    check-cast p2, Ljava/lang/Integer;

    .line 269
    .line 270
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 271
    .line 272
    .line 273
    const/4 p2, 0x1

    .line 274
    invoke-static {p2}, Li0/r;->C(I)I

    .line 275
    .line 276
    .line 277
    move-result p2

    .line 278
    iget-object v0, p0, Lwb/ui;->h:Ljava/util/List;

    .line 279
    .line 280
    iget-object v1, p0, Lwb/ui;->i:Ljava/lang/String;

    .line 281
    .line 282
    iget-object v2, p0, Lwb/ui;->j:Lfg/l;

    .line 283
    .line 284
    invoke-static {v0, v1, v2, p1, p2}, Lwb/ho;->Z(Ljava/util/List;Ljava/lang/String;Lfg/l;Li0/h0;I)V

    .line 285
    .line 286
    .line 287
    :goto_6
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 288
    .line 289
    return-object p1

    .line 290
    :pswitch_2
    check-cast p1, Li0/h0;

    .line 291
    .line 292
    check-cast p2, Ljava/lang/Integer;

    .line 293
    .line 294
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 295
    .line 296
    .line 297
    const/4 p2, 0x1

    .line 298
    invoke-static {p2}, Li0/r;->C(I)I

    .line 299
    .line 300
    .line 301
    move-result p2

    .line 302
    iget-object v0, p0, Lwb/ui;->h:Ljava/util/List;

    .line 303
    .line 304
    iget-object v1, p0, Lwb/ui;->i:Ljava/lang/String;

    .line 305
    .line 306
    iget-object v2, p0, Lwb/ui;->j:Lfg/l;

    .line 307
    .line 308
    invoke-static {v0, v1, v2, p1, p2}, Lwb/ho;->Z(Ljava/util/List;Ljava/lang/String;Lfg/l;Li0/h0;I)V

    .line 309
    .line 310
    .line 311
    goto :goto_6

    .line 312
    nop

    .line 313
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
