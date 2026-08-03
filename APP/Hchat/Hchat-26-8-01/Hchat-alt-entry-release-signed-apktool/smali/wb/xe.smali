.class public final synthetic Lwb/xe;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lsh/x;

.field public final synthetic i:Lr/z;

.field public final synthetic j:Landroid/content/SharedPreferences;

.field public final synthetic k:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Lsh/x;Lr/z;Landroid/content/SharedPreferences;Li0/a1;I)V
    .locals 0

    .line 1
    iput p5, p0, Lwb/xe;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/xe;->h:Lsh/x;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/xe;->i:Lr/z;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/xe;->j:Landroid/content/SharedPreferences;

    .line 8
    .line 9
    iput-object p4, p0, Lwb/xe;->k:Li0/a1;

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
    .locals 12

    .line 1
    iget v0, p0, Lwb/xe;->g:I

    .line 2
    .line 3
    check-cast p1, Lp/x0;

    .line 4
    .line 5
    move-object v9, p2

    .line 6
    check-cast v9, Li0/h0;

    .line 7
    .line 8
    check-cast p3, Ljava/lang/Integer;

    .line 9
    .line 10
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    and-int/lit8 p3, p2, 0x6

    .line 18
    .line 19
    packed-switch v0, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    if-nez p3, :cond_1

    .line 23
    .line 24
    invoke-virtual {v9, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p3

    .line 28
    if-eqz p3, :cond_0

    .line 29
    .line 30
    const/4 p3, 0x4

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 p3, 0x2

    .line 33
    :goto_0
    or-int/2addr p2, p3

    .line 34
    :cond_1
    and-int/lit8 p3, p2, 0x13

    .line 35
    .line 36
    const/16 v0, 0x12

    .line 37
    .line 38
    const/4 v1, 0x1

    .line 39
    if-eq p3, v0, :cond_2

    .line 40
    .line 41
    move p3, v1

    .line 42
    goto :goto_1

    .line 43
    :cond_2
    const/4 p3, 0x0

    .line 44
    :goto_1
    and-int/2addr p2, v1

    .line 45
    invoke-virtual {v9, p2, p3}, Li0/h0;->S(IZ)Z

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    if-eqz p2, :cond_5

    .line 50
    .line 51
    sget-object p2, Lp/h1;->c:Lp/a0;

    .line 52
    .line 53
    iget-object p3, p0, Lwb/xe;->h:Lsh/x;

    .line 54
    .line 55
    iget-object p3, p3, Lsh/x;->e:Lm/a;

    .line 56
    .line 57
    const/4 v0, 0x0

    .line 58
    invoke-static {p2, p3, v0}, Lr1/f;->a(Ly0/o;Lr1/a;Lr1/d;)Ly0/o;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-interface {p1}, Lp/x0;->c()F

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    const/16 p3, 0x8

    .line 67
    .line 68
    int-to-float p3, p3

    .line 69
    add-float/2addr p2, p3

    .line 70
    invoke-interface {p1}, Lp/x0;->a()F

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    const/16 p3, 0x54

    .line 75
    .line 76
    int-to-float p3, p3

    .line 77
    add-float/2addr p1, p3

    .line 78
    const/4 p3, 0x5

    .line 79
    invoke-static {p2, p1, p3}, Lp/d;->b(FFI)Lp/z0;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    iget-object p1, p0, Lwb/xe;->j:Landroid/content/SharedPreferences;

    .line 84
    .line 85
    invoke-virtual {v9, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result p2

    .line 89
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p3

    .line 93
    if-nez p2, :cond_3

    .line 94
    .line 95
    sget-object p2, Li0/l;->a:Li0/e;

    .line 96
    .line 97
    if-ne p3, p2, :cond_4

    .line 98
    .line 99
    :cond_3
    new-instance p3, Lwb/di;

    .line 100
    .line 101
    const/16 p2, 0xf

    .line 102
    .line 103
    iget-object v1, p0, Lwb/xe;->k:Li0/a1;

    .line 104
    .line 105
    invoke-direct {p3, p1, v1, p2}, Lwb/di;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v9, p3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    :cond_4
    move-object v8, p3

    .line 112
    check-cast v8, Lfg/l;

    .line 113
    .line 114
    const/4 v10, 0x0

    .line 115
    const/16 v11, 0x1f8

    .line 116
    .line 117
    iget-object v1, p0, Lwb/xe;->i:Lr/z;

    .line 118
    .line 119
    const/4 v3, 0x0

    .line 120
    const/4 v4, 0x0

    .line 121
    const/4 v5, 0x0

    .line 122
    const/4 v6, 0x0

    .line 123
    const/4 v7, 0x0

    .line 124
    invoke-static/range {v0 .. v11}, La/a;->b(Ly0/o;Lr/z;Lp/x0;Lp/i;Ly0/e;Lm/p;ZLk/k1;Lfg/l;Li0/h0;II)V

    .line 125
    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_5
    invoke-virtual {v9}, Li0/h0;->V()V

    .line 129
    .line 130
    .line 131
    :goto_2
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 132
    .line 133
    return-object p1

    .line 134
    :pswitch_0
    if-nez p3, :cond_7

    .line 135
    .line 136
    invoke-virtual {v9, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result p3

    .line 140
    if-eqz p3, :cond_6

    .line 141
    .line 142
    const/4 p3, 0x4

    .line 143
    goto :goto_3

    .line 144
    :cond_6
    const/4 p3, 0x2

    .line 145
    :goto_3
    or-int/2addr p2, p3

    .line 146
    :cond_7
    and-int/lit8 p3, p2, 0x13

    .line 147
    .line 148
    const/16 v0, 0x12

    .line 149
    .line 150
    const/4 v1, 0x1

    .line 151
    if-eq p3, v0, :cond_8

    .line 152
    .line 153
    move p3, v1

    .line 154
    goto :goto_4

    .line 155
    :cond_8
    const/4 p3, 0x0

    .line 156
    :goto_4
    and-int/2addr p2, v1

    .line 157
    invoke-virtual {v9, p2, p3}, Li0/h0;->S(IZ)Z

    .line 158
    .line 159
    .line 160
    move-result p2

    .line 161
    if-eqz p2, :cond_b

    .line 162
    .line 163
    sget-object p2, Lp/h1;->c:Lp/a0;

    .line 164
    .line 165
    iget-object p3, p0, Lwb/xe;->h:Lsh/x;

    .line 166
    .line 167
    iget-object p3, p3, Lsh/x;->e:Lm/a;

    .line 168
    .line 169
    const/4 v0, 0x0

    .line 170
    invoke-static {p2, p3, v0}, Lr1/f;->a(Ly0/o;Lr1/a;Lr1/d;)Ly0/o;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    invoke-interface {p1}, Lp/x0;->c()F

    .line 175
    .line 176
    .line 177
    move-result p2

    .line 178
    const/16 p3, 0x8

    .line 179
    .line 180
    int-to-float p3, p3

    .line 181
    add-float/2addr p2, p3

    .line 182
    invoke-interface {p1}, Lp/x0;->a()F

    .line 183
    .line 184
    .line 185
    move-result p1

    .line 186
    const/16 p3, 0x54

    .line 187
    .line 188
    int-to-float p3, p3

    .line 189
    add-float/2addr p1, p3

    .line 190
    const/4 p3, 0x5

    .line 191
    invoke-static {p2, p1, p3}, Lp/d;->b(FFI)Lp/z0;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    iget-object p1, p0, Lwb/xe;->j:Landroid/content/SharedPreferences;

    .line 196
    .line 197
    invoke-virtual {v9, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result p2

    .line 201
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object p3

    .line 205
    if-nez p2, :cond_9

    .line 206
    .line 207
    sget-object p2, Li0/l;->a:Li0/e;

    .line 208
    .line 209
    if-ne p3, p2, :cond_a

    .line 210
    .line 211
    :cond_9
    new-instance p3, Lwb/di;

    .line 212
    .line 213
    const/16 p2, 0xc

    .line 214
    .line 215
    iget-object v1, p0, Lwb/xe;->k:Li0/a1;

    .line 216
    .line 217
    invoke-direct {p3, p1, v1, p2}, Lwb/di;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v9, p3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    :cond_a
    move-object v8, p3

    .line 224
    check-cast v8, Lfg/l;

    .line 225
    .line 226
    const/4 v10, 0x0

    .line 227
    const/16 v11, 0x1f8

    .line 228
    .line 229
    iget-object v1, p0, Lwb/xe;->i:Lr/z;

    .line 230
    .line 231
    const/4 v3, 0x0

    .line 232
    const/4 v4, 0x0

    .line 233
    const/4 v5, 0x0

    .line 234
    const/4 v6, 0x0

    .line 235
    const/4 v7, 0x0

    .line 236
    invoke-static/range {v0 .. v11}, La/a;->b(Ly0/o;Lr/z;Lp/x0;Lp/i;Ly0/e;Lm/p;ZLk/k1;Lfg/l;Li0/h0;II)V

    .line 237
    .line 238
    .line 239
    goto :goto_5

    .line 240
    :cond_b
    invoke-virtual {v9}, Li0/h0;->V()V

    .line 241
    .line 242
    .line 243
    :goto_5
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 244
    .line 245
    return-object p1

    .line 246
    :pswitch_1
    if-nez p3, :cond_d

    .line 247
    .line 248
    invoke-virtual {v9, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    move-result p3

    .line 252
    if-eqz p3, :cond_c

    .line 253
    .line 254
    const/4 p3, 0x4

    .line 255
    goto :goto_6

    .line 256
    :cond_c
    const/4 p3, 0x2

    .line 257
    :goto_6
    or-int/2addr p2, p3

    .line 258
    :cond_d
    and-int/lit8 p3, p2, 0x13

    .line 259
    .line 260
    const/16 v0, 0x12

    .line 261
    .line 262
    const/4 v1, 0x1

    .line 263
    if-eq p3, v0, :cond_e

    .line 264
    .line 265
    move p3, v1

    .line 266
    goto :goto_7

    .line 267
    :cond_e
    const/4 p3, 0x0

    .line 268
    :goto_7
    and-int/2addr p2, v1

    .line 269
    invoke-virtual {v9, p2, p3}, Li0/h0;->S(IZ)Z

    .line 270
    .line 271
    .line 272
    move-result p2

    .line 273
    if-eqz p2, :cond_11

    .line 274
    .line 275
    sget-object p2, Lp/h1;->c:Lp/a0;

    .line 276
    .line 277
    iget-object p3, p0, Lwb/xe;->h:Lsh/x;

    .line 278
    .line 279
    iget-object p3, p3, Lsh/x;->e:Lm/a;

    .line 280
    .line 281
    const/4 v0, 0x0

    .line 282
    invoke-static {p2, p3, v0}, Lr1/f;->a(Ly0/o;Lr1/a;Lr1/d;)Ly0/o;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    invoke-interface {p1}, Lp/x0;->c()F

    .line 287
    .line 288
    .line 289
    move-result p2

    .line 290
    const/16 p3, 0x8

    .line 291
    .line 292
    int-to-float p3, p3

    .line 293
    add-float/2addr p2, p3

    .line 294
    invoke-interface {p1}, Lp/x0;->a()F

    .line 295
    .line 296
    .line 297
    move-result p1

    .line 298
    const/16 p3, 0x54

    .line 299
    .line 300
    int-to-float p3, p3

    .line 301
    add-float/2addr p1, p3

    .line 302
    const/4 p3, 0x5

    .line 303
    invoke-static {p2, p1, p3}, Lp/d;->b(FFI)Lp/z0;

    .line 304
    .line 305
    .line 306
    move-result-object v2

    .line 307
    iget-object p1, p0, Lwb/xe;->j:Landroid/content/SharedPreferences;

    .line 308
    .line 309
    invoke-virtual {v9, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    move-result p2

    .line 313
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object p3

    .line 317
    if-nez p2, :cond_f

    .line 318
    .line 319
    sget-object p2, Li0/l;->a:Li0/e;

    .line 320
    .line 321
    if-ne p3, p2, :cond_10

    .line 322
    .line 323
    :cond_f
    new-instance p3, Lwb/di;

    .line 324
    .line 325
    const/16 p2, 0xa

    .line 326
    .line 327
    iget-object v1, p0, Lwb/xe;->k:Li0/a1;

    .line 328
    .line 329
    invoke-direct {p3, p1, v1, p2}, Lwb/di;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {v9, p3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 333
    .line 334
    .line 335
    :cond_10
    move-object v8, p3

    .line 336
    check-cast v8, Lfg/l;

    .line 337
    .line 338
    const/4 v10, 0x0

    .line 339
    const/16 v11, 0x1f8

    .line 340
    .line 341
    iget-object v1, p0, Lwb/xe;->i:Lr/z;

    .line 342
    .line 343
    const/4 v3, 0x0

    .line 344
    const/4 v4, 0x0

    .line 345
    const/4 v5, 0x0

    .line 346
    const/4 v6, 0x0

    .line 347
    const/4 v7, 0x0

    .line 348
    invoke-static/range {v0 .. v11}, La/a;->b(Ly0/o;Lr/z;Lp/x0;Lp/i;Ly0/e;Lm/p;ZLk/k1;Lfg/l;Li0/h0;II)V

    .line 349
    .line 350
    .line 351
    goto :goto_8

    .line 352
    :cond_11
    invoke-virtual {v9}, Li0/h0;->V()V

    .line 353
    .line 354
    .line 355
    :goto_8
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 356
    .line 357
    return-object p1

    .line 358
    nop

    .line 359
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
