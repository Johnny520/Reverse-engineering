.class public final synthetic Lc9/g0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Lfg/l;


# direct methods
.method public synthetic constructor <init>(ILfg/l;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput p1, p0, Lc9/g0;->g:I

    .line 2
    .line 3
    iput-object p3, p0, Lc9/g0;->h:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p2, p0, Lc9/g0;->i:Lfg/l;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lc9/g0;->g:I

    .line 2
    .line 3
    check-cast p1, Lr/d;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p2, Li0/h0;

    .line 9
    .line 10
    check-cast p3, Ljava/lang/Integer;

    .line 11
    .line 12
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 13
    .line 14
    .line 15
    move-result p3

    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    and-int/lit8 p1, p3, 0x11

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
    new-instance p1, Lwb/tf;

    .line 37
    .line 38
    const/4 p3, 0x1

    .line 39
    iget-object v0, p0, Lc9/g0;->i:Lfg/l;

    .line 40
    .line 41
    iget-object v2, p0, Lc9/g0;->h:Ljava/lang/String;

    .line 42
    .line 43
    invoke-direct {p1, p3, v0, v2}, Lwb/tf;-><init>(ILfg/l;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const p3, -0x19b50009

    .line 47
    .line 48
    .line 49
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    const/16 p3, 0x30

    .line 54
    .line 55
    const/4 v0, 0x0

    .line 56
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 61
    .line 62
    .line 63
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 64
    .line 65
    return-object p1

    .line 66
    :pswitch_0
    check-cast p2, Li0/h0;

    .line 67
    .line 68
    check-cast p3, Ljava/lang/Integer;

    .line 69
    .line 70
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 71
    .line 72
    .line 73
    move-result p3

    .line 74
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    and-int/lit8 p1, p3, 0x11

    .line 78
    .line 79
    const/16 v0, 0x10

    .line 80
    .line 81
    const/4 v1, 0x1

    .line 82
    if-eq p1, v0, :cond_2

    .line 83
    .line 84
    move p1, v1

    .line 85
    goto :goto_2

    .line 86
    :cond_2
    const/4 p1, 0x0

    .line 87
    :goto_2
    and-int/2addr p3, v1

    .line 88
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    if-eqz p1, :cond_3

    .line 93
    .line 94
    new-instance p1, Lwb/tf;

    .line 95
    .line 96
    const/4 p3, 0x0

    .line 97
    iget-object v0, p0, Lc9/g0;->i:Lfg/l;

    .line 98
    .line 99
    iget-object v2, p0, Lc9/g0;->h:Ljava/lang/String;

    .line 100
    .line 101
    invoke-direct {p1, p3, v0, v2}, Lwb/tf;-><init>(ILfg/l;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    const p3, 0x506fed2f

    .line 105
    .line 106
    .line 107
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    const/16 p3, 0x30

    .line 112
    .line 113
    const/4 v0, 0x0

    .line 114
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 115
    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_3
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 119
    .line 120
    .line 121
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 122
    .line 123
    return-object p1

    .line 124
    :pswitch_1
    check-cast p2, Li0/h0;

    .line 125
    .line 126
    check-cast p3, Ljava/lang/Integer;

    .line 127
    .line 128
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 129
    .line 130
    .line 131
    move-result p3

    .line 132
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    and-int/lit8 p1, p3, 0x11

    .line 136
    .line 137
    const/16 v0, 0x10

    .line 138
    .line 139
    const/4 v1, 0x1

    .line 140
    if-eq p1, v0, :cond_4

    .line 141
    .line 142
    move p1, v1

    .line 143
    goto :goto_4

    .line 144
    :cond_4
    const/4 p1, 0x0

    .line 145
    :goto_4
    and-int/2addr p3, v1

    .line 146
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 147
    .line 148
    .line 149
    move-result p1

    .line 150
    if-eqz p1, :cond_5

    .line 151
    .line 152
    new-instance p1, Lwb/tf;

    .line 153
    .line 154
    const/4 p3, 0x2

    .line 155
    iget-object v0, p0, Lc9/g0;->i:Lfg/l;

    .line 156
    .line 157
    iget-object v2, p0, Lc9/g0;->h:Ljava/lang/String;

    .line 158
    .line 159
    invoke-direct {p1, p3, v0, v2}, Lwb/tf;-><init>(ILfg/l;Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    const p3, -0x1728a79f

    .line 163
    .line 164
    .line 165
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    const/16 p3, 0x30

    .line 170
    .line 171
    const/4 v0, 0x0

    .line 172
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 173
    .line 174
    .line 175
    goto :goto_5

    .line 176
    :cond_5
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 177
    .line 178
    .line 179
    :goto_5
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 180
    .line 181
    return-object p1

    .line 182
    :pswitch_2
    check-cast p2, Li0/h0;

    .line 183
    .line 184
    check-cast p3, Ljava/lang/Integer;

    .line 185
    .line 186
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 187
    .line 188
    .line 189
    move-result p3

    .line 190
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    and-int/lit8 p1, p3, 0x11

    .line 194
    .line 195
    const/16 v0, 0x10

    .line 196
    .line 197
    const/4 v1, 0x1

    .line 198
    if-eq p1, v0, :cond_6

    .line 199
    .line 200
    move p1, v1

    .line 201
    goto :goto_6

    .line 202
    :cond_6
    const/4 p1, 0x0

    .line 203
    :goto_6
    and-int/2addr p3, v1

    .line 204
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 205
    .line 206
    .line 207
    move-result p1

    .line 208
    if-eqz p1, :cond_7

    .line 209
    .line 210
    new-instance p1, Lwb/tf;

    .line 211
    .line 212
    const/4 p3, 0x3

    .line 213
    iget-object v0, p0, Lc9/g0;->i:Lfg/l;

    .line 214
    .line 215
    iget-object v2, p0, Lc9/g0;->h:Ljava/lang/String;

    .line 216
    .line 217
    invoke-direct {p1, p3, v0, v2}, Lwb/tf;-><init>(ILfg/l;Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    const p3, -0x7e3e551d

    .line 221
    .line 222
    .line 223
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 224
    .line 225
    .line 226
    move-result-object p1

    .line 227
    const/16 p3, 0x30

    .line 228
    .line 229
    const/4 v0, 0x0

    .line 230
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 231
    .line 232
    .line 233
    goto :goto_7

    .line 234
    :cond_7
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 235
    .line 236
    .line 237
    :goto_7
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 238
    .line 239
    return-object p1

    .line 240
    :pswitch_3
    move-object v4, p2

    .line 241
    check-cast v4, Li0/h0;

    .line 242
    .line 243
    check-cast p3, Ljava/lang/Integer;

    .line 244
    .line 245
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 246
    .line 247
    .line 248
    move-result p2

    .line 249
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    and-int/lit8 p1, p2, 0x11

    .line 253
    .line 254
    const/16 p3, 0x10

    .line 255
    .line 256
    const/4 v0, 0x0

    .line 257
    const/4 v1, 0x1

    .line 258
    if-eq p1, p3, :cond_8

    .line 259
    .line 260
    move p1, v1

    .line 261
    goto :goto_8

    .line 262
    :cond_8
    move p1, v0

    .line 263
    :goto_8
    and-int/2addr p2, v1

    .line 264
    invoke-virtual {v4, p2, p1}, Li0/h0;->S(IZ)Z

    .line 265
    .line 266
    .line 267
    move-result p1

    .line 268
    if-eqz p1, :cond_c

    .line 269
    .line 270
    move p1, v0

    .line 271
    sget-object v0, Lc9/j1;->a:Lc9/j1;

    .line 272
    .line 273
    iget-object p2, p0, Lc9/g0;->h:Ljava/lang/String;

    .line 274
    .line 275
    if-nez p2, :cond_9

    .line 276
    .line 277
    move v7, v1

    .line 278
    goto :goto_9

    .line 279
    :cond_9
    move v7, p1

    .line 280
    :goto_9
    iget-object p1, p0, Lc9/g0;->i:Lfg/l;

    .line 281
    .line 282
    invoke-virtual {v4, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 283
    .line 284
    .line 285
    move-result p2

    .line 286
    invoke-virtual {v4}, Li0/h0;->P()Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object p3

    .line 290
    if-nez p2, :cond_a

    .line 291
    .line 292
    sget-object p2, Li0/l;->a:Li0/e;

    .line 293
    .line 294
    if-ne p3, p2, :cond_b

    .line 295
    .line 296
    :cond_a
    new-instance p3, Lc9/o0;

    .line 297
    .line 298
    const/4 p2, 0x0

    .line 299
    invoke-direct {p3, p1, p2}, Lc9/o0;-><init>(Lfg/l;I)V

    .line 300
    .line 301
    .line 302
    invoke-virtual {v4, p3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 303
    .line 304
    .line 305
    :cond_b
    move-object v3, p3

    .line 306
    check-cast v3, Lfg/a;

    .line 307
    .line 308
    const v2, 0x301b6

    .line 309
    .line 310
    .line 311
    const/4 v1, 0x0

    .line 312
    const-string v5, "\u5fae\u4fe1\u9996\u9875"

    .line 313
    .line 314
    const-string v6, "\u4f5c\u4e3a\u4e00\u7ea7\u5206\u7ec4"

    .line 315
    .line 316
    invoke-virtual/range {v0 .. v7}, Lc9/j1;->i(IILfg/a;Li0/h0;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 317
    .line 318
    .line 319
    goto :goto_a

    .line 320
    :cond_c
    invoke-virtual {v4}, Li0/h0;->V()V

    .line 321
    .line 322
    .line 323
    :goto_a
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 324
    .line 325
    return-object p1

    .line 326
    nop

    .line 327
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
