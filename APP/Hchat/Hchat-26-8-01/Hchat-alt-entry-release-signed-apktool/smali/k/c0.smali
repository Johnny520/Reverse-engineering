.class public final Lk/c0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ltg/e;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p5, p0, Lk/c0;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lk/c0;->h:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lk/c0;->i:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Lk/c0;->j:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p4, p0, Lk/c0;->k:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Lwf/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lk/c0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Boolean;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iget-object p2, p0, Lk/c0;->j:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p2, Lh0/d1;

    .line 15
    .line 16
    iget-object v0, p0, Lk/c0;->h:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lw/q0;

    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    invoke-virtual {v0}, Lw/q0;->b()Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    iget-object p1, p0, Lk/c0;->i:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p1, Ln2/t;

    .line 31
    .line 32
    invoke-virtual {p2}, Lh0/d1;->n()Ln2/s;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    iget-object v2, p0, Lk/c0;->k:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v2, Ln2/j;

    .line 39
    .line 40
    iget-object p2, p2, Lh0/d1;->b:Lb5/k;

    .line 41
    .line 42
    invoke-static {p1, v0, v1, v2, p2}, Lw/s;->y(Ln2/t;Lw/q0;Ln2/s;Ln2/j;Lb5/k;)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    invoke-static {v0}, Lw/s;->o(Lw/q0;)V

    .line 47
    .line 48
    .line 49
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 50
    .line 51
    return-object p1

    .line 52
    :pswitch_0
    instance-of v0, p2, Lug/f;

    .line 53
    .line 54
    if-eqz v0, :cond_1

    .line 55
    .line 56
    move-object v0, p2

    .line 57
    check-cast v0, Lug/f;

    .line 58
    .line 59
    iget v1, v0, Lug/f;->k:I

    .line 60
    .line 61
    const/high16 v2, -0x80000000

    .line 62
    .line 63
    and-int v3, v1, v2

    .line 64
    .line 65
    if-eqz v3, :cond_1

    .line 66
    .line 67
    sub-int/2addr v1, v2

    .line 68
    iput v1, v0, Lug/f;->k:I

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_1
    new-instance v0, Lug/f;

    .line 72
    .line 73
    invoke-direct {v0, p0, p2}, Lug/f;-><init>(Lk/c0;Lwf/c;)V

    .line 74
    .line 75
    .line 76
    :goto_1
    iget-object p2, v0, Lug/f;->i:Ljava/lang/Object;

    .line 77
    .line 78
    iget v1, v0, Lug/f;->k:I

    .line 79
    .line 80
    const/4 v2, 0x1

    .line 81
    if-eqz v1, :cond_3

    .line 82
    .line 83
    if-ne v1, v2, :cond_2

    .line 84
    .line 85
    iget-object p1, v0, Lug/f;->h:Ljava/lang/Object;

    .line 86
    .line 87
    iget-object v0, v0, Lug/f;->g:Lk/c0;

    .line 88
    .line 89
    invoke-static {p2}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_2
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 94
    .line 95
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    const/4 p1, 0x0

    .line 99
    goto :goto_3

    .line 100
    :cond_3
    invoke-static {p2}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    iget-object p2, p0, Lk/c0;->h:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast p2, Lgg/u;

    .line 106
    .line 107
    iget-object p2, p2, Lgg/u;->g:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast p2, Lqg/r0;

    .line 110
    .line 111
    if-eqz p2, :cond_4

    .line 112
    .line 113
    new-instance v1, Li/l0;

    .line 114
    .line 115
    const-string v3, "Child of the scoped flow was cancelled"

    .line 116
    .line 117
    const/4 v4, 0x1

    .line 118
    invoke-direct {v1, v3, v4}, Li/l0;-><init>(Ljava/lang/String;I)V

    .line 119
    .line 120
    .line 121
    invoke-interface {p2, v1}, Lqg/r0;->a(Ljava/util/concurrent/CancellationException;)V

    .line 122
    .line 123
    .line 124
    iput-object p0, v0, Lug/f;->g:Lk/c0;

    .line 125
    .line 126
    iput-object p1, v0, Lug/f;->h:Ljava/lang/Object;

    .line 127
    .line 128
    iput v2, v0, Lug/f;->k:I

    .line 129
    .line 130
    invoke-interface {p2, v0}, Lqg/r0;->g(Lyf/c;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object p2

    .line 134
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 135
    .line 136
    if-ne p2, v0, :cond_4

    .line 137
    .line 138
    move-object p1, v0

    .line 139
    goto :goto_3

    .line 140
    :cond_4
    move-object v0, p0

    .line 141
    :goto_2
    iget-object p2, v0, Lk/c0;->h:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast p2, Lgg/u;

    .line 144
    .line 145
    iget-object v1, v0, Lk/c0;->i:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v1, Lqg/t;

    .line 148
    .line 149
    new-instance v3, Lug/e;

    .line 150
    .line 151
    iget-object v4, v0, Lk/c0;->j:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v4, Lug/g;

    .line 154
    .line 155
    iget-object v0, v0, Lk/c0;->k:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v0, Ltg/e;

    .line 158
    .line 159
    const/4 v5, 0x0

    .line 160
    invoke-direct {v3, v4, v0, p1, v5}, Lug/e;-><init>(Lug/g;Ltg/e;Ljava/lang/Object;Lwf/c;)V

    .line 161
    .line 162
    .line 163
    invoke-static {v1, v5, v3, v2}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    iput-object p1, p2, Lgg/u;->g:Ljava/lang/Object;

    .line 168
    .line 169
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 170
    .line 171
    :goto_3
    return-object p1

    .line 172
    :pswitch_1
    check-cast p1, Ln/j;

    .line 173
    .line 174
    iget-object p2, p0, Lk/c0;->j:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast p2, Lgg/s;

    .line 177
    .line 178
    iget-object v0, p0, Lk/c0;->i:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast v0, Lgg/s;

    .line 181
    .line 182
    iget-object v1, p0, Lk/c0;->h:Ljava/lang/Object;

    .line 183
    .line 184
    check-cast v1, Lgg/s;

    .line 185
    .line 186
    instance-of v2, p1, Ln/m;

    .line 187
    .line 188
    const/4 v3, 0x1

    .line 189
    if-eqz v2, :cond_5

    .line 190
    .line 191
    iget p1, v1, Lgg/s;->g:I

    .line 192
    .line 193
    add-int/2addr p1, v3

    .line 194
    iput p1, v1, Lgg/s;->g:I

    .line 195
    .line 196
    goto :goto_4

    .line 197
    :cond_5
    instance-of v2, p1, Ln/n;

    .line 198
    .line 199
    if-eqz v2, :cond_6

    .line 200
    .line 201
    iget p1, v1, Lgg/s;->g:I

    .line 202
    .line 203
    add-int/lit8 p1, p1, -0x1

    .line 204
    .line 205
    iput p1, v1, Lgg/s;->g:I

    .line 206
    .line 207
    goto :goto_4

    .line 208
    :cond_6
    instance-of v2, p1, Ln/l;

    .line 209
    .line 210
    if-eqz v2, :cond_7

    .line 211
    .line 212
    iget p1, v1, Lgg/s;->g:I

    .line 213
    .line 214
    add-int/lit8 p1, p1, -0x1

    .line 215
    .line 216
    iput p1, v1, Lgg/s;->g:I

    .line 217
    .line 218
    goto :goto_4

    .line 219
    :cond_7
    instance-of v2, p1, Ln/h;

    .line 220
    .line 221
    if-eqz v2, :cond_8

    .line 222
    .line 223
    iget p1, v0, Lgg/s;->g:I

    .line 224
    .line 225
    add-int/2addr p1, v3

    .line 226
    iput p1, v0, Lgg/s;->g:I

    .line 227
    .line 228
    goto :goto_4

    .line 229
    :cond_8
    instance-of v2, p1, Ln/i;

    .line 230
    .line 231
    if-eqz v2, :cond_9

    .line 232
    .line 233
    iget p1, v0, Lgg/s;->g:I

    .line 234
    .line 235
    add-int/lit8 p1, p1, -0x1

    .line 236
    .line 237
    iput p1, v0, Lgg/s;->g:I

    .line 238
    .line 239
    goto :goto_4

    .line 240
    :cond_9
    instance-of v2, p1, Ln/f;

    .line 241
    .line 242
    if-eqz v2, :cond_a

    .line 243
    .line 244
    iget p1, p2, Lgg/s;->g:I

    .line 245
    .line 246
    add-int/2addr p1, v3

    .line 247
    iput p1, p2, Lgg/s;->g:I

    .line 248
    .line 249
    goto :goto_4

    .line 250
    :cond_a
    instance-of p1, p1, Ln/g;

    .line 251
    .line 252
    if-eqz p1, :cond_b

    .line 253
    .line 254
    iget p1, p2, Lgg/s;->g:I

    .line 255
    .line 256
    add-int/lit8 p1, p1, -0x1

    .line 257
    .line 258
    iput p1, p2, Lgg/s;->g:I

    .line 259
    .line 260
    :cond_b
    :goto_4
    iget p1, v1, Lgg/s;->g:I

    .line 261
    .line 262
    const/4 v1, 0x0

    .line 263
    if-lez p1, :cond_c

    .line 264
    .line 265
    move p1, v3

    .line 266
    goto :goto_5

    .line 267
    :cond_c
    move p1, v1

    .line 268
    :goto_5
    iget v0, v0, Lgg/s;->g:I

    .line 269
    .line 270
    if-lez v0, :cond_d

    .line 271
    .line 272
    move v0, v3

    .line 273
    goto :goto_6

    .line 274
    :cond_d
    move v0, v1

    .line 275
    :goto_6
    iget p2, p2, Lgg/s;->g:I

    .line 276
    .line 277
    if-lez p2, :cond_e

    .line 278
    .line 279
    move p2, v3

    .line 280
    goto :goto_7

    .line 281
    :cond_e
    move p2, v1

    .line 282
    :goto_7
    iget-object v2, p0, Lk/c0;->k:Ljava/lang/Object;

    .line 283
    .line 284
    check-cast v2, Lk/d0;

    .line 285
    .line 286
    iget-boolean v4, v2, Lk/d0;->v:Z

    .line 287
    .line 288
    if-eq v4, p1, :cond_f

    .line 289
    .line 290
    iput-boolean p1, v2, Lk/d0;->v:Z

    .line 291
    .line 292
    move v1, v3

    .line 293
    :cond_f
    iget-boolean p1, v2, Lk/d0;->w:Z

    .line 294
    .line 295
    if-eq p1, v0, :cond_10

    .line 296
    .line 297
    iput-boolean v0, v2, Lk/d0;->w:Z

    .line 298
    .line 299
    move v1, v3

    .line 300
    :cond_10
    iget-boolean p1, v2, Lk/d0;->x:Z

    .line 301
    .line 302
    if-eq p1, p2, :cond_11

    .line 303
    .line 304
    iput-boolean p2, v2, Lk/d0;->x:Z

    .line 305
    .line 306
    goto :goto_8

    .line 307
    :cond_11
    move v3, v1

    .line 308
    :goto_8
    if-eqz v3, :cond_12

    .line 309
    .line 310
    invoke-static {v2}, Lx1/k;->l(Lx1/m;)V

    .line 311
    .line 312
    .line 313
    :cond_12
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 314
    .line 315
    return-object p1

    .line 316
    nop

    .line 317
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
