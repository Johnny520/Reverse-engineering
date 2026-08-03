.class public final Lc0/g;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lc0/g;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lc0/g;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ls1/x;Lwf/c;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Lc0/g;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lc0/g;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lxb/o;

    .line 9
    .line 10
    new-instance v2, Lxb/l;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-direct {v2, v0, v1}, Lxb/l;-><init>(Lxb/o;I)V

    .line 14
    .line 15
    .line 16
    new-instance v5, Lxb/l;

    .line 17
    .line 18
    const/4 v1, 0x2

    .line 19
    invoke-direct {v5, v0, v1}, Lxb/l;-><init>(Lxb/o;I)V

    .line 20
    .line 21
    .line 22
    new-instance v4, Lv0/a;

    .line 23
    .line 24
    const/16 v1, 0x9

    .line 25
    .line 26
    invoke-direct {v4, v0, v1}, Lv0/a;-><init>(Ljava/lang/Object;I)V

    .line 27
    .line 28
    .line 29
    new-instance v3, Lwb/jj;

    .line 30
    .line 31
    const/4 v1, 0x3

    .line 32
    invoke-direct {v3, v0, v1}, Lwb/jj;-><init>(Ljava/lang/Object;I)V

    .line 33
    .line 34
    .line 35
    new-instance v1, Lxb/j;

    .line 36
    .line 37
    const/4 v6, 0x0

    .line 38
    invoke-direct/range {v1 .. v6}, Lxb/j;-><init>(Lfg/l;Lfg/p;Lfg/a;Lfg/l;Lwf/c;)V

    .line 39
    .line 40
    .line 41
    invoke-static {p1, v1, p2}, La/a;->n(Ls1/x;Lfg/p;Lwf/c;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    return-object p1

    .line 46
    :pswitch_0
    iget-object v0, p0, Lc0/g;->b:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v0, Lxb/i;

    .line 49
    .line 50
    new-instance v2, Lwb/f3;

    .line 51
    .line 52
    const/4 v1, 0x3

    .line 53
    invoke-direct {v2, v0, v1}, Lwb/f3;-><init>(Lxb/i;I)V

    .line 54
    .line 55
    .line 56
    new-instance v5, Lwb/f3;

    .line 57
    .line 58
    const/4 v1, 0x4

    .line 59
    invoke-direct {v5, v0, v1}, Lwb/f3;-><init>(Lxb/i;I)V

    .line 60
    .line 61
    .line 62
    new-instance v4, Lwb/h3;

    .line 63
    .line 64
    const/4 v1, 0x2

    .line 65
    invoke-direct {v4, v0, v1}, Lwb/h3;-><init>(Lxb/i;I)V

    .line 66
    .line 67
    .line 68
    new-instance v3, Lwb/zi;

    .line 69
    .line 70
    const/16 v1, 0xa

    .line 71
    .line 72
    invoke-direct {v3, v0, v1, p1}, Lwb/zi;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    new-instance v1, Lxb/j;

    .line 76
    .line 77
    const/4 v6, 0x0

    .line 78
    invoke-direct/range {v1 .. v6}, Lxb/j;-><init>(Lfg/l;Lfg/p;Lfg/a;Lfg/l;Lwf/c;)V

    .line 79
    .line 80
    .line 81
    invoke-static {p1, v1, p2}, La/a;->n(Ls1/x;Lfg/p;Lwf/c;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    return-object p1

    .line 86
    :pswitch_1
    iget-object v0, p0, Lc0/g;->b:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v0, Lfg/a;

    .line 89
    .line 90
    new-instance v1, Lh0/g1;

    .line 91
    .line 92
    const/4 v2, 0x3

    .line 93
    invoke-direct {v1, v0, v2}, Lh0/g1;-><init>(Lfg/a;I)V

    .line 94
    .line 95
    .line 96
    const/4 v0, 0x7

    .line 97
    const/4 v2, 0x0

    .line 98
    invoke-static {p1, v2, v1, p2, v0}, Lm/y2;->d(Ls1/x;Lwb/l7;Lfg/l;Lwf/c;I)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    return-object p1

    .line 103
    :pswitch_2
    iget-object v0, p0, Lc0/g;->b:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v0, Lh0/d1;

    .line 106
    .line 107
    iget-object v1, v0, Lh0/d1;->z:Lh0/q0;

    .line 108
    .line 109
    iget-object v0, v0, Lh0/d1;->y:Lh0/b1;

    .line 110
    .line 111
    new-instance v2, Lac/k;

    .line 112
    .line 113
    move-object v3, p1

    .line 114
    check-cast v3, Ls1/l0;

    .line 115
    .line 116
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    invoke-static {v3}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    iget-object v3, v3, Lx1/f0;->G:Ly1/l2;

    .line 124
    .line 125
    invoke-direct {v2, v3}, Lac/k;-><init>(Ly1/l2;)V

    .line 126
    .line 127
    .line 128
    new-instance v3, Le0/c;

    .line 129
    .line 130
    const/4 v4, 0x0

    .line 131
    invoke-direct {v3, v2, v1, v0, v4}, Le0/c;-><init>(Lac/k;Lh0/q0;Lw/y0;Lwf/c;)V

    .line 132
    .line 133
    .line 134
    invoke-static {p1, v3, p2}, La/a;->n(Ls1/x;Lfg/p;Lwf/c;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    sget-object p2, Lxf/a;->g:Lxf/a;

    .line 139
    .line 140
    if-ne p1, p2, :cond_0

    .line 141
    .line 142
    goto :goto_0

    .line 143
    :cond_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 144
    .line 145
    :goto_0
    sget-object p2, Lxf/a;->g:Lxf/a;

    .line 146
    .line 147
    if-ne p1, p2, :cond_1

    .line 148
    .line 149
    goto :goto_1

    .line 150
    :cond_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 151
    .line 152
    :goto_1
    return-object p1

    .line 153
    :pswitch_3
    new-instance v0, La0/b;

    .line 154
    .line 155
    iget-object v1, p0, Lc0/g;->b:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v1, Lk/i;

    .line 158
    .line 159
    const/4 v2, 0x0

    .line 160
    const/4 v3, 0x2

    .line 161
    invoke-direct {v0, v1, v2, v3}, La0/b;-><init>(Ljava/lang/Object;Lwf/c;I)V

    .line 162
    .line 163
    .line 164
    invoke-static {p1, v0, p2}, La/a;->n(Ls1/x;Lfg/p;Lwf/c;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    sget-object p2, Lxf/a;->g:Lxf/a;

    .line 169
    .line 170
    if-ne p1, p2, :cond_2

    .line 171
    .line 172
    goto :goto_2

    .line 173
    :cond_2
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 174
    .line 175
    :goto_2
    return-object p1

    .line 176
    :pswitch_4
    iget-object v0, p0, Lc0/g;->b:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast v0, Lw/y0;

    .line 179
    .line 180
    new-instance v1, Lw/u0;

    .line 181
    .line 182
    const/4 v2, 0x0

    .line 183
    const/4 v3, 0x0

    .line 184
    invoke-direct {v1, p1, v0, v2, v3}, Lw/u0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 185
    .line 186
    .line 187
    invoke-static {v1, p2}, Lqg/v;->e(Lfg/p;Lwf/c;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 192
    .line 193
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 194
    .line 195
    if-ne p1, v0, :cond_3

    .line 196
    .line 197
    goto :goto_3

    .line 198
    :cond_3
    move-object p1, p2

    .line 199
    :goto_3
    if-ne p1, v0, :cond_4

    .line 200
    .line 201
    move-object p2, p1

    .line 202
    :cond_4
    return-object p2

    .line 203
    :pswitch_5
    new-instance v0, La0/b;

    .line 204
    .line 205
    iget-object v1, p0, Lc0/g;->b:Ljava/lang/Object;

    .line 206
    .line 207
    check-cast v1, Lw/w;

    .line 208
    .line 209
    const/4 v2, 0x0

    .line 210
    const/4 v3, 0x1

    .line 211
    invoke-direct {v0, v1, v2, v3}, La0/b;-><init>(Ljava/lang/Object;Lwf/c;I)V

    .line 212
    .line 213
    .line 214
    check-cast p1, Ls1/l0;

    .line 215
    .line 216
    invoke-virtual {p1, v0, p2}, Ls1/l0;->k1(Lfg/p;Lwf/c;)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object p1

    .line 220
    sget-object p2, Lxf/a;->g:Lxf/a;

    .line 221
    .line 222
    if-ne p1, p2, :cond_5

    .line 223
    .line 224
    goto :goto_4

    .line 225
    :cond_5
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 226
    .line 227
    :goto_4
    return-object p1

    .line 228
    :pswitch_6
    new-instance v0, Le0/c;

    .line 229
    .line 230
    iget-object v1, p0, Lc0/g;->b:Ljava/lang/Object;

    .line 231
    .line 232
    check-cast v1, Le0/d;

    .line 233
    .line 234
    const/4 v2, 0x0

    .line 235
    invoke-direct {v0, v1, v2}, Le0/c;-><init>(Le0/d;Lwf/c;)V

    .line 236
    .line 237
    .line 238
    invoke-static {p1, v0, p2}, La/a;->n(Ls1/x;Lfg/p;Lwf/c;)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object p1

    .line 242
    sget-object p2, Lxf/a;->g:Lxf/a;

    .line 243
    .line 244
    if-ne p1, p2, :cond_6

    .line 245
    .line 246
    goto :goto_5

    .line 247
    :cond_6
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 248
    .line 249
    :goto_5
    return-object p1

    .line 250
    :pswitch_7
    iget-object v0, p0, Lc0/g;->b:Ljava/lang/Object;

    .line 251
    .line 252
    move-object v3, v0

    .line 253
    check-cast v3, Lci/l0;

    .line 254
    .line 255
    new-instance v4, Lci/f;

    .line 256
    .line 257
    const/4 v5, 0x0

    .line 258
    invoke-direct {v4, v3, v5}, Lci/f;-><init>(Lci/l0;Lwf/c;)V

    .line 259
    .line 260
    .line 261
    new-instance v1, Lci/e;

    .line 262
    .line 263
    const/4 v6, 0x0

    .line 264
    move-object v2, p1

    .line 265
    invoke-direct/range {v1 .. v6}, Lci/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 266
    .line 267
    .line 268
    invoke-static {v1, p2}, Lqg/v;->e(Lfg/p;Lwf/c;)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object p1

    .line 272
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 273
    .line 274
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 275
    .line 276
    if-ne p1, v0, :cond_7

    .line 277
    .line 278
    goto :goto_6

    .line 279
    :cond_7
    move-object p1, p2

    .line 280
    :goto_6
    if-ne p1, v0, :cond_8

    .line 281
    .line 282
    move-object p2, p1

    .line 283
    :cond_8
    return-object p2

    .line 284
    :pswitch_8
    move-object v2, p1

    .line 285
    new-instance v3, Lc0/f;

    .line 286
    .line 287
    iget-object p1, p0, Lc0/g;->b:Ljava/lang/Object;

    .line 288
    .line 289
    move-object v5, p1

    .line 290
    check-cast v5, Lc0/j;

    .line 291
    .line 292
    const/4 v10, 0x0

    .line 293
    const/4 v11, 0x0

    .line 294
    const/4 v4, 0x1

    .line 295
    const-class v6, Lc0/j;

    .line 296
    .line 297
    const-string v7, "tryShowContextMenu"

    .line 298
    .line 299
    const-string v8, "tryShowContextMenu-k-4lQ0M(J)V"

    .line 300
    .line 301
    const/4 v9, 0x0

    .line 302
    invoke-direct/range {v3 .. v11}, Lc0/f;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 303
    .line 304
    .line 305
    new-instance p1, La0/b;

    .line 306
    .line 307
    const/4 v0, 0x0

    .line 308
    const/4 v1, 0x0

    .line 309
    invoke-direct {p1, v3, v0, v1}, La0/b;-><init>(Ljava/lang/Object;Lwf/c;I)V

    .line 310
    .line 311
    .line 312
    invoke-static {v2, p1, p2}, La/a;->n(Ls1/x;Lfg/p;Lwf/c;)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object p1

    .line 316
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 317
    .line 318
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 319
    .line 320
    if-ne p1, v0, :cond_9

    .line 321
    .line 322
    goto :goto_7

    .line 323
    :cond_9
    move-object p1, p2

    .line 324
    :goto_7
    if-ne p1, v0, :cond_a

    .line 325
    .line 326
    move-object p2, p1

    .line 327
    :cond_a
    return-object p2

    .line 328
    nop

    .line 329
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
