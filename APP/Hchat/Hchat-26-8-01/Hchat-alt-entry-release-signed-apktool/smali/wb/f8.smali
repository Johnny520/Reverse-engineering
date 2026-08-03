.class public final synthetic Lwb/f8;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Li0/a1;

.field public final synthetic i:Li0/a1;

.field public final synthetic j:Li0/a1;

.field public final synthetic k:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Li0/a1;Li0/a1;Li0/a1;Li0/a1;I)V
    .locals 0

    .line 1
    iput p5, p0, Lwb/f8;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/f8;->h:Li0/a1;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/f8;->i:Li0/a1;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/f8;->j:Li0/a1;

    .line 8
    .line 9
    iput-object p4, p0, Lwb/f8;->k:Li0/a1;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lwb/f8;->g:I

    .line 2
    .line 3
    check-cast p1, Lr/d;

    .line 4
    .line 5
    check-cast p2, Li0/h0;

    .line 6
    .line 7
    check-cast p3, Ljava/lang/Integer;

    .line 8
    .line 9
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result p3

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    and-int/lit8 p1, p3, 0x11

    .line 17
    .line 18
    packed-switch v0, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    const/16 v0, 0x10

    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    if-eq p1, v0, :cond_0

    .line 25
    .line 26
    move p1, v1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 p1, 0x0

    .line 29
    :goto_0
    and-int/2addr p3, v1

    .line 30
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    new-instance v2, Lwb/y9;

    .line 37
    .line 38
    const/4 v7, 0x2

    .line 39
    iget-object v3, p0, Lwb/f8;->h:Li0/a1;

    .line 40
    .line 41
    iget-object v4, p0, Lwb/f8;->i:Li0/a1;

    .line 42
    .line 43
    iget-object v5, p0, Lwb/f8;->j:Li0/a1;

    .line 44
    .line 45
    iget-object v6, p0, Lwb/f8;->k:Li0/a1;

    .line 46
    .line 47
    invoke-direct/range {v2 .. v7}, Lwb/y9;-><init>(Li0/a1;Li0/a1;Li0/a1;Li0/a1;I)V

    .line 48
    .line 49
    .line 50
    const p1, -0x6d3f45b4

    .line 51
    .line 52
    .line 53
    invoke-static {p1, v2, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    const/16 p3, 0x30

    .line 58
    .line 59
    const/4 v0, 0x0

    .line 60
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_1
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 65
    .line 66
    .line 67
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 68
    .line 69
    return-object p1

    .line 70
    :pswitch_0
    const/16 v0, 0x10

    .line 71
    .line 72
    const/4 v1, 0x1

    .line 73
    if-eq p1, v0, :cond_2

    .line 74
    .line 75
    move p1, v1

    .line 76
    goto :goto_2

    .line 77
    :cond_2
    const/4 p1, 0x0

    .line 78
    :goto_2
    and-int/2addr p3, v1

    .line 79
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    if-eqz p1, :cond_3

    .line 84
    .line 85
    new-instance v2, Lwb/y9;

    .line 86
    .line 87
    const/4 v7, 0x1

    .line 88
    iget-object v3, p0, Lwb/f8;->h:Li0/a1;

    .line 89
    .line 90
    iget-object v4, p0, Lwb/f8;->i:Li0/a1;

    .line 91
    .line 92
    iget-object v5, p0, Lwb/f8;->j:Li0/a1;

    .line 93
    .line 94
    iget-object v6, p0, Lwb/f8;->k:Li0/a1;

    .line 95
    .line 96
    invoke-direct/range {v2 .. v7}, Lwb/y9;-><init>(Li0/a1;Li0/a1;Li0/a1;Li0/a1;I)V

    .line 97
    .line 98
    .line 99
    const p1, 0x53baf4b0

    .line 100
    .line 101
    .line 102
    invoke-static {p1, v2, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    const/16 p3, 0x30

    .line 107
    .line 108
    const/4 v0, 0x0

    .line 109
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 110
    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_3
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 114
    .line 115
    .line 116
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 117
    .line 118
    return-object p1

    .line 119
    :pswitch_1
    const/16 v0, 0x10

    .line 120
    .line 121
    const/4 v1, 0x1

    .line 122
    if-eq p1, v0, :cond_4

    .line 123
    .line 124
    move p1, v1

    .line 125
    goto :goto_4

    .line 126
    :cond_4
    const/4 p1, 0x0

    .line 127
    :goto_4
    and-int/2addr p3, v1

    .line 128
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 129
    .line 130
    .line 131
    move-result p1

    .line 132
    if-eqz p1, :cond_5

    .line 133
    .line 134
    new-instance v2, Lwb/y9;

    .line 135
    .line 136
    const/4 v7, 0x5

    .line 137
    iget-object v3, p0, Lwb/f8;->h:Li0/a1;

    .line 138
    .line 139
    iget-object v4, p0, Lwb/f8;->i:Li0/a1;

    .line 140
    .line 141
    iget-object v5, p0, Lwb/f8;->j:Li0/a1;

    .line 142
    .line 143
    iget-object v6, p0, Lwb/f8;->k:Li0/a1;

    .line 144
    .line 145
    invoke-direct/range {v2 .. v7}, Lwb/y9;-><init>(Li0/a1;Li0/a1;Li0/a1;Li0/a1;I)V

    .line 146
    .line 147
    .line 148
    const p1, -0x16850479

    .line 149
    .line 150
    .line 151
    invoke-static {p1, v2, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    const/16 p3, 0x30

    .line 156
    .line 157
    const/4 v0, 0x0

    .line 158
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 159
    .line 160
    .line 161
    goto :goto_5

    .line 162
    :cond_5
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 163
    .line 164
    .line 165
    :goto_5
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 166
    .line 167
    return-object p1

    .line 168
    :pswitch_2
    const/16 v0, 0x10

    .line 169
    .line 170
    const/4 v1, 0x1

    .line 171
    if-eq p1, v0, :cond_6

    .line 172
    .line 173
    move p1, v1

    .line 174
    goto :goto_6

    .line 175
    :cond_6
    const/4 p1, 0x0

    .line 176
    :goto_6
    and-int/2addr p3, v1

    .line 177
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 178
    .line 179
    .line 180
    move-result p1

    .line 181
    if-eqz p1, :cond_7

    .line 182
    .line 183
    new-instance v2, Lwb/y9;

    .line 184
    .line 185
    const/4 v7, 0x4

    .line 186
    iget-object v3, p0, Lwb/f8;->h:Li0/a1;

    .line 187
    .line 188
    iget-object v4, p0, Lwb/f8;->i:Li0/a1;

    .line 189
    .line 190
    iget-object v5, p0, Lwb/f8;->j:Li0/a1;

    .line 191
    .line 192
    iget-object v6, p0, Lwb/f8;->k:Li0/a1;

    .line 193
    .line 194
    invoke-direct/range {v2 .. v7}, Lwb/y9;-><init>(Li0/a1;Li0/a1;Li0/a1;Li0/a1;I)V

    .line 195
    .line 196
    .line 197
    const p1, -0x41750801

    .line 198
    .line 199
    .line 200
    invoke-static {p1, v2, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    const/16 p3, 0x30

    .line 205
    .line 206
    const/4 v0, 0x0

    .line 207
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 208
    .line 209
    .line 210
    goto :goto_7

    .line 211
    :cond_7
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 212
    .line 213
    .line 214
    :goto_7
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 215
    .line 216
    return-object p1

    .line 217
    :pswitch_3
    const/16 v0, 0x10

    .line 218
    .line 219
    const/4 v1, 0x1

    .line 220
    if-eq p1, v0, :cond_8

    .line 221
    .line 222
    move p1, v1

    .line 223
    goto :goto_8

    .line 224
    :cond_8
    const/4 p1, 0x0

    .line 225
    :goto_8
    and-int/2addr p3, v1

    .line 226
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 227
    .line 228
    .line 229
    move-result p1

    .line 230
    if-eqz p1, :cond_9

    .line 231
    .line 232
    new-instance v2, Lwb/y9;

    .line 233
    .line 234
    const/4 v7, 0x3

    .line 235
    iget-object v3, p0, Lwb/f8;->h:Li0/a1;

    .line 236
    .line 237
    iget-object v4, p0, Lwb/f8;->i:Li0/a1;

    .line 238
    .line 239
    iget-object v5, p0, Lwb/f8;->j:Li0/a1;

    .line 240
    .line 241
    iget-object v6, p0, Lwb/f8;->k:Li0/a1;

    .line 242
    .line 243
    invoke-direct/range {v2 .. v7}, Lwb/y9;-><init>(Li0/a1;Li0/a1;Li0/a1;Li0/a1;I)V

    .line 244
    .line 245
    .line 246
    const p1, -0x2807fa31

    .line 247
    .line 248
    .line 249
    invoke-static {p1, v2, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 250
    .line 251
    .line 252
    move-result-object p1

    .line 253
    const/16 p3, 0x30

    .line 254
    .line 255
    const/4 v0, 0x0

    .line 256
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 257
    .line 258
    .line 259
    goto :goto_9

    .line 260
    :cond_9
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 261
    .line 262
    .line 263
    :goto_9
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 264
    .line 265
    return-object p1

    .line 266
    :pswitch_4
    const/16 v0, 0x10

    .line 267
    .line 268
    const/4 v1, 0x1

    .line 269
    if-eq p1, v0, :cond_a

    .line 270
    .line 271
    move p1, v1

    .line 272
    goto :goto_a

    .line 273
    :cond_a
    const/4 p1, 0x0

    .line 274
    :goto_a
    and-int/2addr p3, v1

    .line 275
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 276
    .line 277
    .line 278
    move-result p1

    .line 279
    if-eqz p1, :cond_b

    .line 280
    .line 281
    new-instance v2, Lwb/y9;

    .line 282
    .line 283
    const/4 v7, 0x0

    .line 284
    iget-object v3, p0, Lwb/f8;->h:Li0/a1;

    .line 285
    .line 286
    iget-object v4, p0, Lwb/f8;->i:Li0/a1;

    .line 287
    .line 288
    iget-object v5, p0, Lwb/f8;->j:Li0/a1;

    .line 289
    .line 290
    iget-object v6, p0, Lwb/f8;->k:Li0/a1;

    .line 291
    .line 292
    invoke-direct/range {v2 .. v7}, Lwb/y9;-><init>(Li0/a1;Li0/a1;Li0/a1;Li0/a1;I)V

    .line 293
    .line 294
    .line 295
    const p1, 0x52a0cabb

    .line 296
    .line 297
    .line 298
    invoke-static {p1, v2, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 299
    .line 300
    .line 301
    move-result-object p1

    .line 302
    const/16 p3, 0x30

    .line 303
    .line 304
    const/4 v0, 0x0

    .line 305
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 306
    .line 307
    .line 308
    goto :goto_b

    .line 309
    :cond_b
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 310
    .line 311
    .line 312
    :goto_b
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 313
    .line 314
    return-object p1

    .line 315
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
