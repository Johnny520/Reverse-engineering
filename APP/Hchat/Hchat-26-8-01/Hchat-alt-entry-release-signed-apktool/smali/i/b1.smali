.class public final synthetic Li/b1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILfg/a;Lfg/l;I)V
    .locals 0

    .line 1
    const/16 p4, 0xa

    .line 2
    .line 3
    iput p4, p0, Li/b1;->g:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput p1, p0, Li/b1;->h:I

    .line 9
    .line 10
    iput-object p2, p0, Li/b1;->i:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p3, p0, Li/b1;->j:Ljava/lang/Object;

    .line 13
    .line 14
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILsf/b;II)V
    .locals 0

    .line 15
    iput p5, p0, Li/b1;->g:I

    iput-object p1, p0, Li/b1;->i:Ljava/lang/Object;

    iput p2, p0, Li/b1;->h:I

    iput-object p3, p0, Li/b1;->j:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 0

    .line 16
    iput p4, p0, Li/b1;->g:I

    iput-object p1, p0, Li/b1;->i:Ljava/lang/Object;

    iput-object p2, p0, Li/b1;->j:Ljava/lang/Object;

    iput p3, p0, Li/b1;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Li/b1;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Li/b1;->i:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lwb/y2;

    .line 9
    .line 10
    iget-object v1, p0, Li/b1;->j:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lwb/jv;

    .line 13
    .line 14
    check-cast p1, Li0/h0;

    .line 15
    .line 16
    check-cast p2, Ljava/lang/Integer;

    .line 17
    .line 18
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iget p2, p0, Li/b1;->h:I

    .line 22
    .line 23
    or-int/lit8 p2, p2, 0x1

    .line 24
    .line 25
    invoke-static {p2}, Li0/r;->C(I)I

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    invoke-virtual {v0, v1, p1, p2}, Lwb/y2;->f(Lwb/jv;Li0/h0;I)V

    .line 30
    .line 31
    .line 32
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 33
    .line 34
    return-object p1

    .line 35
    :pswitch_0
    iget-object v0, p0, Li/b1;->i:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, Lwb/y2;

    .line 38
    .line 39
    iget-object v1, p0, Li/b1;->j:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v1, Ljava/lang/String;

    .line 42
    .line 43
    check-cast p1, Li0/h0;

    .line 44
    .line 45
    check-cast p2, Ljava/lang/Integer;

    .line 46
    .line 47
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    iget p2, p0, Li/b1;->h:I

    .line 51
    .line 52
    or-int/lit8 p2, p2, 0x1

    .line 53
    .line 54
    invoke-static {p2}, Li0/r;->C(I)I

    .line 55
    .line 56
    .line 57
    move-result p2

    .line 58
    invoke-virtual {v0, v1, p1, p2}, Lwb/y2;->T(Ljava/lang/String;Li0/h0;I)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :pswitch_1
    iget-object v0, p0, Li/b1;->i:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v0, Lfg/a;

    .line 65
    .line 66
    iget-object v1, p0, Li/b1;->j:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v1, Lfg/l;

    .line 69
    .line 70
    check-cast p1, Li0/h0;

    .line 71
    .line 72
    check-cast p2, Ljava/lang/Integer;

    .line 73
    .line 74
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    const/16 p2, 0x31

    .line 78
    .line 79
    invoke-static {p2}, Li0/r;->C(I)I

    .line 80
    .line 81
    .line 82
    move-result p2

    .line 83
    iget v2, p0, Li/b1;->h:I

    .line 84
    .line 85
    invoke-static {v2, v0, v1, p1, p2}, Lwb/ho;->i0(ILfg/a;Lfg/l;Li0/h0;I)V

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :pswitch_2
    iget-object v0, p0, Li/b1;->i:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v0, Ljava/lang/String;

    .line 92
    .line 93
    iget-object v1, p0, Li/b1;->j:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v1, Lfg/l;

    .line 96
    .line 97
    check-cast p1, Li0/h0;

    .line 98
    .line 99
    check-cast p2, Ljava/lang/Integer;

    .line 100
    .line 101
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    const/16 p2, 0x187

    .line 105
    .line 106
    invoke-static {p2}, Li0/r;->C(I)I

    .line 107
    .line 108
    .line 109
    move-result p2

    .line 110
    iget v2, p0, Li/b1;->h:I

    .line 111
    .line 112
    invoke-static {v2, p2, v1, p1, v0}, Lwb/ho;->X0(IILfg/l;Li0/h0;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    goto :goto_0

    .line 116
    :pswitch_3
    iget-object v0, p0, Li/b1;->i:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v0, Ln9/a;

    .line 119
    .line 120
    iget-object v1, p0, Li/b1;->j:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v1, Lfg/a;

    .line 123
    .line 124
    check-cast p1, Li0/h0;

    .line 125
    .line 126
    check-cast p2, Ljava/lang/Integer;

    .line 127
    .line 128
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    const/16 p2, 0x9

    .line 132
    .line 133
    invoke-static {p2}, Li0/r;->C(I)I

    .line 134
    .line 135
    .line 136
    move-result p2

    .line 137
    iget v2, p0, Li/b1;->h:I

    .line 138
    .line 139
    invoke-static {v0, v2, v1, p1, p2}, Lwb/ho;->f1(Ln9/a;ILfg/a;Li0/h0;I)V

    .line 140
    .line 141
    .line 142
    goto :goto_0

    .line 143
    :pswitch_4
    iget-object v0, p0, Li/b1;->i:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v0, Lvb/a;

    .line 146
    .line 147
    iget-object v1, p0, Li/b1;->j:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v1, Lfg/a;

    .line 150
    .line 151
    check-cast p1, Li0/h0;

    .line 152
    .line 153
    check-cast p2, Ljava/lang/Integer;

    .line 154
    .line 155
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 156
    .line 157
    .line 158
    iget p2, p0, Li/b1;->h:I

    .line 159
    .line 160
    or-int/lit8 p2, p2, 0x1

    .line 161
    .line 162
    invoke-static {p2}, Li0/r;->C(I)I

    .line 163
    .line 164
    .line 165
    move-result p2

    .line 166
    invoke-static {v0, v1, p1, p2}, Lwb/ho;->f4(Lvb/a;Lfg/a;Li0/h0;I)V

    .line 167
    .line 168
    .line 169
    goto/16 :goto_0

    .line 170
    .line 171
    :pswitch_5
    iget-object v0, p0, Li/b1;->i:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast v0, Lwb/b3;

    .line 174
    .line 175
    iget-object v1, p0, Li/b1;->j:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v1, Lfg/a;

    .line 178
    .line 179
    check-cast p1, Li0/h0;

    .line 180
    .line 181
    check-cast p2, Ljava/lang/Integer;

    .line 182
    .line 183
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 184
    .line 185
    .line 186
    iget p2, p0, Li/b1;->h:I

    .line 187
    .line 188
    or-int/lit8 p2, p2, 0x1

    .line 189
    .line 190
    invoke-static {p2}, Li0/r;->C(I)I

    .line 191
    .line 192
    .line 193
    move-result p2

    .line 194
    invoke-static {v0, v1, p1, p2}, Lwb/ho;->E0(Lwb/b3;Lfg/a;Li0/h0;I)V

    .line 195
    .line 196
    .line 197
    goto/16 :goto_0

    .line 198
    .line 199
    :pswitch_6
    iget-object v0, p0, Li/b1;->i:Ljava/lang/Object;

    .line 200
    .line 201
    check-cast v0, Lwb/y2;

    .line 202
    .line 203
    iget-object v1, p0, Li/b1;->j:Ljava/lang/Object;

    .line 204
    .line 205
    check-cast v1, Ljava/lang/String;

    .line 206
    .line 207
    check-cast p1, Li0/h0;

    .line 208
    .line 209
    check-cast p2, Ljava/lang/Integer;

    .line 210
    .line 211
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    iget p2, p0, Li/b1;->h:I

    .line 215
    .line 216
    or-int/lit8 p2, p2, 0x1

    .line 217
    .line 218
    invoke-static {p2}, Li0/r;->C(I)I

    .line 219
    .line 220
    .line 221
    move-result p2

    .line 222
    invoke-virtual {v0, v1, p1, p2}, Lwb/y2;->e(Ljava/lang/String;Li0/h0;I)V

    .line 223
    .line 224
    .line 225
    goto/16 :goto_0

    .line 226
    .line 227
    :pswitch_7
    iget-object v0, p0, Li/b1;->i:Ljava/lang/Object;

    .line 228
    .line 229
    check-cast v0, Li2/g;

    .line 230
    .line 231
    iget-object v1, p0, Li/b1;->j:Ljava/lang/Object;

    .line 232
    .line 233
    check-cast v1, Ljava/util/List;

    .line 234
    .line 235
    check-cast p1, Li0/h0;

    .line 236
    .line 237
    check-cast p2, Ljava/lang/Integer;

    .line 238
    .line 239
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 240
    .line 241
    .line 242
    iget p2, p0, Li/b1;->h:I

    .line 243
    .line 244
    or-int/lit8 p2, p2, 0x1

    .line 245
    .line 246
    invoke-static {p2}, Li0/r;->C(I)I

    .line 247
    .line 248
    .line 249
    move-result p2

    .line 250
    invoke-static {v0, v1, p1, p2}, Lw/d;->a(Li2/g;Ljava/util/List;Li0/h0;I)V

    .line 251
    .line 252
    .line 253
    goto/16 :goto_0

    .line 254
    .line 255
    :pswitch_8
    iget-object v0, p0, Li/b1;->i:Ljava/lang/Object;

    .line 256
    .line 257
    check-cast v0, Ls0/d;

    .line 258
    .line 259
    check-cast p1, Li0/h0;

    .line 260
    .line 261
    check-cast p2, Ljava/lang/Integer;

    .line 262
    .line 263
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 264
    .line 265
    .line 266
    iget p2, p0, Li/b1;->h:I

    .line 267
    .line 268
    invoke-static {p2}, Li0/r;->C(I)I

    .line 269
    .line 270
    .line 271
    move-result p2

    .line 272
    or-int/lit8 p2, p2, 0x1

    .line 273
    .line 274
    iget-object v1, p0, Li/b1;->j:Ljava/lang/Object;

    .line 275
    .line 276
    invoke-virtual {v0, v1, p1, p2}, Ls0/d;->g(Ljava/lang/Object;Li0/h0;I)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    goto/16 :goto_0

    .line 280
    .line 281
    :pswitch_9
    iget-object v0, p0, Li/b1;->i:Ljava/lang/Object;

    .line 282
    .line 283
    check-cast v0, [Li0/q1;

    .line 284
    .line 285
    iget-object v1, p0, Li/b1;->j:Ljava/lang/Object;

    .line 286
    .line 287
    check-cast v1, Lfg/p;

    .line 288
    .line 289
    check-cast p1, Li0/h0;

    .line 290
    .line 291
    check-cast p2, Ljava/lang/Integer;

    .line 292
    .line 293
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 294
    .line 295
    .line 296
    iget p2, p0, Li/b1;->h:I

    .line 297
    .line 298
    or-int/lit8 p2, p2, 0x1

    .line 299
    .line 300
    invoke-static {p2}, Li0/r;->C(I)I

    .line 301
    .line 302
    .line 303
    move-result p2

    .line 304
    invoke-static {v0, v1, p1, p2}, Li0/r;->b([Li0/q1;Lfg/p;Li0/h0;I)V

    .line 305
    .line 306
    .line 307
    goto/16 :goto_0

    .line 308
    .line 309
    :pswitch_a
    iget-object v0, p0, Li/b1;->i:Ljava/lang/Object;

    .line 310
    .line 311
    check-cast v0, Li0/q1;

    .line 312
    .line 313
    iget-object v1, p0, Li/b1;->j:Ljava/lang/Object;

    .line 314
    .line 315
    check-cast v1, Ls0/d;

    .line 316
    .line 317
    check-cast p1, Li0/h0;

    .line 318
    .line 319
    check-cast p2, Ljava/lang/Integer;

    .line 320
    .line 321
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 322
    .line 323
    .line 324
    iget p2, p0, Li/b1;->h:I

    .line 325
    .line 326
    or-int/lit8 p2, p2, 0x1

    .line 327
    .line 328
    invoke-static {p2}, Li0/r;->C(I)I

    .line 329
    .line 330
    .line 331
    move-result p2

    .line 332
    invoke-static {v0, v1, p1, p2}, Li0/r;->a(Li0/q1;Ls0/d;Li0/h0;I)V

    .line 333
    .line 334
    .line 335
    goto/16 :goto_0

    .line 336
    .line 337
    :pswitch_b
    iget-object v0, p0, Li/b1;->i:Ljava/lang/Object;

    .line 338
    .line 339
    check-cast v0, Li/k1;

    .line 340
    .line 341
    check-cast p1, Li0/h0;

    .line 342
    .line 343
    check-cast p2, Ljava/lang/Integer;

    .line 344
    .line 345
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 346
    .line 347
    .line 348
    iget p2, p0, Li/b1;->h:I

    .line 349
    .line 350
    or-int/lit8 p2, p2, 0x1

    .line 351
    .line 352
    invoke-static {p2}, Li0/r;->C(I)I

    .line 353
    .line 354
    .line 355
    move-result p2

    .line 356
    iget-object v1, p0, Li/b1;->j:Ljava/lang/Object;

    .line 357
    .line 358
    invoke-virtual {v0, v1, p1, p2}, Li/k1;->a(Ljava/lang/Object;Li0/h0;I)V

    .line 359
    .line 360
    .line 361
    goto/16 :goto_0

    .line 362
    .line 363
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
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
