.class public final synthetic Lwb/q8;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lba/a;

.field public final synthetic i:Landroid/content/Context;

.field public final synthetic j:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Lba/a;Landroid/content/Context;Li0/a1;I)V
    .locals 0

    .line 1
    iput p4, p0, Lwb/q8;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/q8;->h:Lba/a;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/q8;->i:Landroid/content/Context;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/q8;->j:Li0/a1;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Lwb/q8;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v5, p1

    .line 7
    check-cast v5, Li0/h0;

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
    const/4 v7, 0x0

    .line 19
    const/4 v8, 0x1

    .line 20
    if-eq p2, v0, :cond_0

    .line 21
    .line 22
    move p2, v8

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move p2, v7

    .line 25
    :goto_0
    and-int/2addr p1, v8

    .line 26
    invoke-virtual {v5, p1, p2}, Li0/h0;->S(IZ)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_5

    .line 31
    .line 32
    sget-object p1, Lba/a;->k:Lba/a;

    .line 33
    .line 34
    sget-object p2, Lba/n;->l:La2/a;

    .line 35
    .line 36
    iget-object v0, p0, Lwb/q8;->h:Lba/a;

    .line 37
    .line 38
    iget-object v1, p0, Lwb/q8;->i:Landroid/content/Context;

    .line 39
    .line 40
    iget-object v9, p0, Lwb/q8;->j:Li0/a1;

    .line 41
    .line 42
    sget-object v10, Li0/l;->a:Li0/e;

    .line 43
    .line 44
    if-ne v0, p1, :cond_2

    .line 45
    .line 46
    const p1, -0x25af309

    .line 47
    .line 48
    .line 49
    invoke-virtual {v5, p1}, Li0/h0;->a0(I)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-static {v0, v7, v8}, La2/a;->E(Lba/a;ZZ)Lba/n;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-static {v9}, Lwb/ho;->g2(Li0/a1;)I

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    if-ne p1, v10, :cond_1

    .line 68
    .line 69
    new-instance p1, Lwb/ud;

    .line 70
    .line 71
    const/4 p2, 0x2

    .line 72
    invoke-direct {p1, v9, p2}, Lwb/ud;-><init>(Li0/a1;I)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v5, p1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    :cond_1
    move-object v4, p1

    .line 79
    check-cast v4, Lfg/a;

    .line 80
    .line 81
    const/16 v6, 0xc00

    .line 82
    .line 83
    invoke-static/range {v1 .. v6}, Lwb/ho;->e2(Landroid/content/Context;Lba/n;ILfg/a;Li0/h0;I)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v5, v7}, Li0/h0;->p(Z)V

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_2
    const p1, -0x2554f5b

    .line 91
    .line 92
    .line 93
    invoke-virtual {v5, p1}, Li0/h0;->a0(I)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    invoke-static {v0, v7, v8}, La2/a;->E(Lba/a;ZZ)Lba/n;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-static {v9}, Lwb/ho;->g2(Li0/a1;)I

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    if-ne p1, v10, :cond_3

    .line 112
    .line 113
    new-instance p1, Lwb/ud;

    .line 114
    .line 115
    const/4 p2, 0x3

    .line 116
    invoke-direct {p1, v9, p2}, Lwb/ud;-><init>(Li0/a1;I)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v5, p1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    :cond_3
    move-object v4, p1

    .line 123
    check-cast v4, Lfg/a;

    .line 124
    .line 125
    const/16 v6, 0xc00

    .line 126
    .line 127
    invoke-static/range {v1 .. v6}, Lwb/ho;->e2(Landroid/content/Context;Lba/n;ILfg/a;Li0/h0;I)V

    .line 128
    .line 129
    .line 130
    const/4 p1, 0x0

    .line 131
    invoke-static {p1, v5, v7, v8}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 132
    .line 133
    .line 134
    invoke-static {v0, v8, v8}, La2/a;->E(Lba/a;ZZ)Lba/n;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    invoke-interface {v9}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    check-cast p1, Ljava/lang/Number;

    .line 143
    .line 144
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 145
    .line 146
    .line 147
    move-result v3

    .line 148
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    if-ne p1, v10, :cond_4

    .line 153
    .line 154
    new-instance p1, Lwb/ud;

    .line 155
    .line 156
    const/4 p2, 0x4

    .line 157
    invoke-direct {p1, v9, p2}, Lwb/ud;-><init>(Li0/a1;I)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v5, p1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    :cond_4
    move-object v4, p1

    .line 164
    check-cast v4, Lfg/a;

    .line 165
    .line 166
    const/16 v6, 0xc00

    .line 167
    .line 168
    invoke-static/range {v1 .. v6}, Lwb/ho;->e2(Landroid/content/Context;Lba/n;ILfg/a;Li0/h0;I)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v5, v7}, Li0/h0;->p(Z)V

    .line 172
    .line 173
    .line 174
    goto :goto_1

    .line 175
    :cond_5
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 176
    .line 177
    .line 178
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 179
    .line 180
    return-object p1

    .line 181
    :pswitch_0
    move-object v4, p1

    .line 182
    check-cast v4, Li0/h0;

    .line 183
    .line 184
    check-cast p2, Ljava/lang/Integer;

    .line 185
    .line 186
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 187
    .line 188
    .line 189
    move-result p1

    .line 190
    and-int/lit8 p2, p1, 0x3

    .line 191
    .line 192
    const/4 v0, 0x2

    .line 193
    const/4 v6, 0x1

    .line 194
    const/4 v7, 0x0

    .line 195
    if-eq p2, v0, :cond_6

    .line 196
    .line 197
    move p2, v6

    .line 198
    goto :goto_2

    .line 199
    :cond_6
    move p2, v7

    .line 200
    :goto_2
    and-int/2addr p1, v6

    .line 201
    invoke-virtual {v4, p1, p2}, Li0/h0;->S(IZ)Z

    .line 202
    .line 203
    .line 204
    move-result p1

    .line 205
    if-eqz p1, :cond_b

    .line 206
    .line 207
    sget-object p1, Lba/a;->k:Lba/a;

    .line 208
    .line 209
    sget-object p2, Lba/n;->l:La2/a;

    .line 210
    .line 211
    iget-object v8, p0, Lwb/q8;->h:Lba/a;

    .line 212
    .line 213
    iget-object v0, p0, Lwb/q8;->i:Landroid/content/Context;

    .line 214
    .line 215
    iget-object v9, p0, Lwb/q8;->j:Li0/a1;

    .line 216
    .line 217
    sget-object v10, Li0/l;->a:Li0/e;

    .line 218
    .line 219
    if-ne v8, p1, :cond_8

    .line 220
    .line 221
    const p1, -0x42adbaae

    .line 222
    .line 223
    .line 224
    invoke-virtual {v4, p1}, Li0/h0;->a0(I)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 228
    .line 229
    .line 230
    invoke-static {v8, v7, v7}, La2/a;->E(Lba/a;ZZ)Lba/n;

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    invoke-static {v9}, Lwb/ho;->g2(Li0/a1;)I

    .line 235
    .line 236
    .line 237
    move-result v2

    .line 238
    invoke-virtual {v4}, Li0/h0;->P()Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object p1

    .line 242
    if-ne p1, v10, :cond_7

    .line 243
    .line 244
    new-instance p1, Lwb/l9;

    .line 245
    .line 246
    const/16 p2, 0x1d

    .line 247
    .line 248
    invoke-direct {p1, v9, p2}, Lwb/l9;-><init>(Li0/a1;I)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v4, p1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    :cond_7
    move-object v3, p1

    .line 255
    check-cast v3, Lfg/a;

    .line 256
    .line 257
    const/16 v5, 0xc00

    .line 258
    .line 259
    invoke-static/range {v0 .. v5}, Lwb/ho;->e2(Landroid/content/Context;Lba/n;ILfg/a;Li0/h0;I)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v4, v7}, Li0/h0;->p(Z)V

    .line 263
    .line 264
    .line 265
    goto :goto_3

    .line 266
    :cond_8
    const p1, -0x42a872e9

    .line 267
    .line 268
    .line 269
    invoke-virtual {v4, p1}, Li0/h0;->a0(I)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 273
    .line 274
    .line 275
    invoke-static {v8, v7, v7}, La2/a;->E(Lba/a;ZZ)Lba/n;

    .line 276
    .line 277
    .line 278
    move-result-object v1

    .line 279
    invoke-static {v9}, Lwb/ho;->g2(Li0/a1;)I

    .line 280
    .line 281
    .line 282
    move-result v2

    .line 283
    invoke-virtual {v4}, Li0/h0;->P()Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object p1

    .line 287
    if-ne p1, v10, :cond_9

    .line 288
    .line 289
    new-instance p1, Lwb/ud;

    .line 290
    .line 291
    const/4 p2, 0x0

    .line 292
    invoke-direct {p1, v9, p2}, Lwb/ud;-><init>(Li0/a1;I)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v4, p1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 296
    .line 297
    .line 298
    :cond_9
    move-object v3, p1

    .line 299
    check-cast v3, Lfg/a;

    .line 300
    .line 301
    const/16 v5, 0xc00

    .line 302
    .line 303
    invoke-static/range {v0 .. v5}, Lwb/ho;->e2(Landroid/content/Context;Lba/n;ILfg/a;Li0/h0;I)V

    .line 304
    .line 305
    .line 306
    const/4 p1, 0x0

    .line 307
    invoke-static {p1, v4, v7, v6}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 308
    .line 309
    .line 310
    invoke-static {v8, v6, v7}, La2/a;->E(Lba/a;ZZ)Lba/n;

    .line 311
    .line 312
    .line 313
    move-result-object v1

    .line 314
    invoke-interface {v9}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object p1

    .line 318
    check-cast p1, Ljava/lang/Number;

    .line 319
    .line 320
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 321
    .line 322
    .line 323
    move-result v2

    .line 324
    invoke-virtual {v4}, Li0/h0;->P()Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object p1

    .line 328
    if-ne p1, v10, :cond_a

    .line 329
    .line 330
    new-instance p1, Lwb/ud;

    .line 331
    .line 332
    const/4 p2, 0x1

    .line 333
    invoke-direct {p1, v9, p2}, Lwb/ud;-><init>(Li0/a1;I)V

    .line 334
    .line 335
    .line 336
    invoke-virtual {v4, p1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 337
    .line 338
    .line 339
    :cond_a
    move-object v3, p1

    .line 340
    check-cast v3, Lfg/a;

    .line 341
    .line 342
    const/16 v5, 0xc00

    .line 343
    .line 344
    invoke-static/range {v0 .. v5}, Lwb/ho;->e2(Landroid/content/Context;Lba/n;ILfg/a;Li0/h0;I)V

    .line 345
    .line 346
    .line 347
    invoke-virtual {v4, v7}, Li0/h0;->p(Z)V

    .line 348
    .line 349
    .line 350
    goto :goto_3

    .line 351
    :cond_b
    invoke-virtual {v4}, Li0/h0;->V()V

    .line 352
    .line 353
    .line 354
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 355
    .line 356
    return-object p1

    .line 357
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
