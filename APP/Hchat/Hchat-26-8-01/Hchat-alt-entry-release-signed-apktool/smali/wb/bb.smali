.class public final synthetic Lwb/bb;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/content/SharedPreferences;

.field public final synthetic i:Li0/a1;

.field public final synthetic j:Li0/a1;

.field public final synthetic k:Li0/a1;

.field public final synthetic l:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;Li0/a1;Li0/a1;I)V
    .locals 0

    .line 1
    iput p6, p0, Lwb/bb;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/bb;->h:Landroid/content/SharedPreferences;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/bb;->i:Li0/a1;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/bb;->j:Li0/a1;

    .line 8
    .line 9
    iput-object p4, p0, Lwb/bb;->k:Li0/a1;

    .line 10
    .line 11
    iput-object p5, p0, Lwb/bb;->l:Li0/a1;

    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lwb/bb;->g:I

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
    new-instance v2, Lwb/na;

    .line 37
    .line 38
    const/4 v8, 0x6

    .line 39
    iget-object v3, p0, Lwb/bb;->h:Landroid/content/SharedPreferences;

    .line 40
    .line 41
    iget-object v4, p0, Lwb/bb;->i:Li0/a1;

    .line 42
    .line 43
    iget-object v5, p0, Lwb/bb;->j:Li0/a1;

    .line 44
    .line 45
    iget-object v6, p0, Lwb/bb;->k:Li0/a1;

    .line 46
    .line 47
    iget-object v7, p0, Lwb/bb;->l:Li0/a1;

    .line 48
    .line 49
    invoke-direct/range {v2 .. v8}, Lwb/na;-><init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;Li0/a1;Li0/a1;I)V

    .line 50
    .line 51
    .line 52
    const p1, 0x18cd6498

    .line 53
    .line 54
    .line 55
    invoke-static {p1, v2, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    const/16 p3, 0x30

    .line 60
    .line 61
    const/4 v0, 0x0

    .line 62
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_1
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 67
    .line 68
    .line 69
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 70
    .line 71
    return-object p1

    .line 72
    :pswitch_0
    const/16 v0, 0x10

    .line 73
    .line 74
    const/4 v1, 0x1

    .line 75
    if-eq p1, v0, :cond_2

    .line 76
    .line 77
    move p1, v1

    .line 78
    goto :goto_2

    .line 79
    :cond_2
    const/4 p1, 0x0

    .line 80
    :goto_2
    and-int/2addr p3, v1

    .line 81
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    if-eqz p1, :cond_3

    .line 86
    .line 87
    new-instance v2, Lwb/na;

    .line 88
    .line 89
    const/4 v8, 0x0

    .line 90
    iget-object v3, p0, Lwb/bb;->h:Landroid/content/SharedPreferences;

    .line 91
    .line 92
    iget-object v4, p0, Lwb/bb;->i:Li0/a1;

    .line 93
    .line 94
    iget-object v5, p0, Lwb/bb;->j:Li0/a1;

    .line 95
    .line 96
    iget-object v6, p0, Lwb/bb;->k:Li0/a1;

    .line 97
    .line 98
    iget-object v7, p0, Lwb/bb;->l:Li0/a1;

    .line 99
    .line 100
    invoke-direct/range {v2 .. v8}, Lwb/na;-><init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;Li0/a1;Li0/a1;I)V

    .line 101
    .line 102
    .line 103
    const p1, -0x4e7215bf

    .line 104
    .line 105
    .line 106
    invoke-static {p1, v2, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    const/16 p3, 0x30

    .line 111
    .line 112
    const/4 v0, 0x0

    .line 113
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 114
    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_3
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 118
    .line 119
    .line 120
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 121
    .line 122
    return-object p1

    .line 123
    :pswitch_1
    const/16 v0, 0x10

    .line 124
    .line 125
    const/4 v1, 0x1

    .line 126
    if-eq p1, v0, :cond_4

    .line 127
    .line 128
    move p1, v1

    .line 129
    goto :goto_4

    .line 130
    :cond_4
    const/4 p1, 0x0

    .line 131
    :goto_4
    and-int/2addr p3, v1

    .line 132
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 133
    .line 134
    .line 135
    move-result p1

    .line 136
    if-eqz p1, :cond_5

    .line 137
    .line 138
    new-instance v2, Lwb/na;

    .line 139
    .line 140
    const/4 v8, 0x4

    .line 141
    iget-object v3, p0, Lwb/bb;->h:Landroid/content/SharedPreferences;

    .line 142
    .line 143
    iget-object v4, p0, Lwb/bb;->i:Li0/a1;

    .line 144
    .line 145
    iget-object v5, p0, Lwb/bb;->j:Li0/a1;

    .line 146
    .line 147
    iget-object v6, p0, Lwb/bb;->k:Li0/a1;

    .line 148
    .line 149
    iget-object v7, p0, Lwb/bb;->l:Li0/a1;

    .line 150
    .line 151
    invoke-direct/range {v2 .. v8}, Lwb/na;-><init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;Li0/a1;Li0/a1;I)V

    .line 152
    .line 153
    .line 154
    const p1, 0x3d4d1e81

    .line 155
    .line 156
    .line 157
    invoke-static {p1, v2, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    const/16 p3, 0x30

    .line 162
    .line 163
    const/4 v0, 0x0

    .line 164
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 165
    .line 166
    .line 167
    goto :goto_5

    .line 168
    :cond_5
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 169
    .line 170
    .line 171
    :goto_5
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 172
    .line 173
    return-object p1

    .line 174
    :pswitch_2
    const/16 v0, 0x10

    .line 175
    .line 176
    const/4 v1, 0x1

    .line 177
    if-eq p1, v0, :cond_6

    .line 178
    .line 179
    move p1, v1

    .line 180
    goto :goto_6

    .line 181
    :cond_6
    const/4 p1, 0x0

    .line 182
    :goto_6
    and-int/2addr p3, v1

    .line 183
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 184
    .line 185
    .line 186
    move-result p1

    .line 187
    if-eqz p1, :cond_7

    .line 188
    .line 189
    new-instance v2, Lwb/na;

    .line 190
    .line 191
    const/4 v8, 0x5

    .line 192
    iget-object v3, p0, Lwb/bb;->h:Landroid/content/SharedPreferences;

    .line 193
    .line 194
    iget-object v4, p0, Lwb/bb;->i:Li0/a1;

    .line 195
    .line 196
    iget-object v5, p0, Lwb/bb;->j:Li0/a1;

    .line 197
    .line 198
    iget-object v6, p0, Lwb/bb;->k:Li0/a1;

    .line 199
    .line 200
    iget-object v7, p0, Lwb/bb;->l:Li0/a1;

    .line 201
    .line 202
    invoke-direct/range {v2 .. v8}, Lwb/na;-><init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;Li0/a1;Li0/a1;I)V

    .line 203
    .line 204
    .line 205
    const p1, 0x6f5f21d0

    .line 206
    .line 207
    .line 208
    invoke-static {p1, v2, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    const/16 p3, 0x30

    .line 213
    .line 214
    const/4 v0, 0x0

    .line 215
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 216
    .line 217
    .line 218
    goto :goto_7

    .line 219
    :cond_7
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 220
    .line 221
    .line 222
    :goto_7
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 223
    .line 224
    return-object p1

    .line 225
    :pswitch_3
    const/16 v0, 0x10

    .line 226
    .line 227
    const/4 v1, 0x1

    .line 228
    if-eq p1, v0, :cond_8

    .line 229
    .line 230
    move p1, v1

    .line 231
    goto :goto_8

    .line 232
    :cond_8
    const/4 p1, 0x0

    .line 233
    :goto_8
    and-int/2addr p3, v1

    .line 234
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 235
    .line 236
    .line 237
    move-result p1

    .line 238
    if-eqz p1, :cond_9

    .line 239
    .line 240
    new-instance v2, Lwb/na;

    .line 241
    .line 242
    const/4 v8, 0x3

    .line 243
    iget-object v3, p0, Lwb/bb;->h:Landroid/content/SharedPreferences;

    .line 244
    .line 245
    iget-object v4, p0, Lwb/bb;->i:Li0/a1;

    .line 246
    .line 247
    iget-object v5, p0, Lwb/bb;->j:Li0/a1;

    .line 248
    .line 249
    iget-object v6, p0, Lwb/bb;->k:Li0/a1;

    .line 250
    .line 251
    iget-object v7, p0, Lwb/bb;->l:Li0/a1;

    .line 252
    .line 253
    invoke-direct/range {v2 .. v8}, Lwb/na;-><init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;Li0/a1;Li0/a1;I)V

    .line 254
    .line 255
    .line 256
    const p1, 0x40757eed

    .line 257
    .line 258
    .line 259
    invoke-static {p1, v2, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 260
    .line 261
    .line 262
    move-result-object p1

    .line 263
    const/16 p3, 0x30

    .line 264
    .line 265
    const/4 v0, 0x0

    .line 266
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 267
    .line 268
    .line 269
    goto :goto_9

    .line 270
    :cond_9
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 271
    .line 272
    .line 273
    :goto_9
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 274
    .line 275
    return-object p1

    .line 276
    :pswitch_4
    const/16 v0, 0x10

    .line 277
    .line 278
    const/4 v1, 0x1

    .line 279
    if-eq p1, v0, :cond_a

    .line 280
    .line 281
    move p1, v1

    .line 282
    goto :goto_a

    .line 283
    :cond_a
    const/4 p1, 0x0

    .line 284
    :goto_a
    and-int/2addr p3, v1

    .line 285
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 286
    .line 287
    .line 288
    move-result p1

    .line 289
    if-eqz p1, :cond_b

    .line 290
    .line 291
    new-instance v2, Lwb/na;

    .line 292
    .line 293
    const/4 v8, 0x1

    .line 294
    iget-object v3, p0, Lwb/bb;->h:Landroid/content/SharedPreferences;

    .line 295
    .line 296
    iget-object v4, p0, Lwb/bb;->i:Li0/a1;

    .line 297
    .line 298
    iget-object v5, p0, Lwb/bb;->j:Li0/a1;

    .line 299
    .line 300
    iget-object v6, p0, Lwb/bb;->k:Li0/a1;

    .line 301
    .line 302
    iget-object v7, p0, Lwb/bb;->l:Li0/a1;

    .line 303
    .line 304
    invoke-direct/range {v2 .. v8}, Lwb/na;-><init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;Li0/a1;Li0/a1;I)V

    .line 305
    .line 306
    .line 307
    const p1, 0x6a68d3ae

    .line 308
    .line 309
    .line 310
    invoke-static {p1, v2, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 311
    .line 312
    .line 313
    move-result-object p1

    .line 314
    const/16 p3, 0x30

    .line 315
    .line 316
    const/4 v0, 0x0

    .line 317
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 318
    .line 319
    .line 320
    goto :goto_b

    .line 321
    :cond_b
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 322
    .line 323
    .line 324
    :goto_b
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 325
    .line 326
    return-object p1

    .line 327
    :pswitch_5
    const/16 v0, 0x10

    .line 328
    .line 329
    const/4 v1, 0x1

    .line 330
    if-eq p1, v0, :cond_c

    .line 331
    .line 332
    move p1, v1

    .line 333
    goto :goto_c

    .line 334
    :cond_c
    const/4 p1, 0x0

    .line 335
    :goto_c
    and-int/2addr p3, v1

    .line 336
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 337
    .line 338
    .line 339
    move-result p1

    .line 340
    if-eqz p1, :cond_d

    .line 341
    .line 342
    new-instance v2, Lwb/na;

    .line 343
    .line 344
    const/4 v8, 0x2

    .line 345
    iget-object v3, p0, Lwb/bb;->h:Landroid/content/SharedPreferences;

    .line 346
    .line 347
    iget-object v4, p0, Lwb/bb;->i:Li0/a1;

    .line 348
    .line 349
    iget-object v5, p0, Lwb/bb;->j:Li0/a1;

    .line 350
    .line 351
    iget-object v6, p0, Lwb/bb;->k:Li0/a1;

    .line 352
    .line 353
    iget-object v7, p0, Lwb/bb;->l:Li0/a1;

    .line 354
    .line 355
    invoke-direct/range {v2 .. v8}, Lwb/na;-><init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;Li0/a1;Li0/a1;I)V

    .line 356
    .line 357
    .line 358
    const p1, -0x5f617f26

    .line 359
    .line 360
    .line 361
    invoke-static {p1, v2, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 362
    .line 363
    .line 364
    move-result-object p1

    .line 365
    const/16 p3, 0x30

    .line 366
    .line 367
    const/4 v0, 0x0

    .line 368
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 369
    .line 370
    .line 371
    goto :goto_d

    .line 372
    :cond_d
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 373
    .line 374
    .line 375
    :goto_d
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 376
    .line 377
    return-object p1

    .line 378
    nop

    .line 379
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
