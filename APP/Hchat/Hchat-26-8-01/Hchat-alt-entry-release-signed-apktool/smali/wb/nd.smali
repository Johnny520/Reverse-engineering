.class public final synthetic Lwb/nd;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(ILjava/util/List;)V
    .locals 0

    .line 1
    iput p1, p0, Lwb/nd;->g:I

    .line 2
    .line 3
    iput-object p2, p0, Lwb/nd;->h:Ljava/util/List;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lwb/nd;->g:I

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
    const/16 p1, 0xa

    .line 37
    .line 38
    int-to-float v2, p1

    .line 39
    const/4 v4, 0x0

    .line 40
    const/16 v5, 0xd

    .line 41
    .line 42
    sget-object v0, Ly0/l;->a:Ly0/l;

    .line 43
    .line 44
    const/4 v1, 0x0

    .line 45
    const/4 v3, 0x0

    .line 46
    invoke-static/range {v0 .. v5}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    iget-object p3, p0, Lwb/nd;->h:Ljava/util/List;

    .line 51
    .line 52
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 53
    .line 54
    .line 55
    move-result p3

    .line 56
    const-string v0, "\u63d2\u4ef6("

    .line 57
    .line 58
    const-string v1, ")"

    .line 59
    .line 60
    invoke-static {p3, v0, v1}, Leh/a;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p3

    .line 64
    const/16 v0, 0x30

    .line 65
    .line 66
    const/16 v1, 0xc

    .line 67
    .line 68
    invoke-static {p3, p1, p2, v0, v1}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_1
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 73
    .line 74
    .line 75
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 76
    .line 77
    return-object p1

    .line 78
    :pswitch_0
    const/16 v0, 0x10

    .line 79
    .line 80
    const/4 v1, 0x1

    .line 81
    if-eq p1, v0, :cond_2

    .line 82
    .line 83
    move p1, v1

    .line 84
    goto :goto_2

    .line 85
    :cond_2
    const/4 p1, 0x0

    .line 86
    :goto_2
    and-int/2addr p3, v1

    .line 87
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    if-eqz p1, :cond_3

    .line 92
    .line 93
    const/16 p1, 0xa

    .line 94
    .line 95
    int-to-float v2, p1

    .line 96
    const/4 v4, 0x0

    .line 97
    const/16 v5, 0xd

    .line 98
    .line 99
    sget-object v0, Ly0/l;->a:Ly0/l;

    .line 100
    .line 101
    const/4 v1, 0x0

    .line 102
    const/4 v3, 0x0

    .line 103
    invoke-static/range {v0 .. v5}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    iget-object p3, p0, Lwb/nd;->h:Ljava/util/List;

    .line 108
    .line 109
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 110
    .line 111
    .line 112
    move-result p3

    .line 113
    const-string v0, "\u529f\u80fd("

    .line 114
    .line 115
    const-string v1, ")"

    .line 116
    .line 117
    invoke-static {p3, v0, v1}, Leh/a;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p3

    .line 121
    const/16 v0, 0x30

    .line 122
    .line 123
    const/16 v1, 0xc

    .line 124
    .line 125
    invoke-static {p3, p1, p2, v0, v1}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 126
    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_3
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 130
    .line 131
    .line 132
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 133
    .line 134
    return-object p1

    .line 135
    :pswitch_1
    const/16 v0, 0x10

    .line 136
    .line 137
    const/4 v1, 0x1

    .line 138
    if-eq p1, v0, :cond_4

    .line 139
    .line 140
    move p1, v1

    .line 141
    goto :goto_4

    .line 142
    :cond_4
    const/4 p1, 0x0

    .line 143
    :goto_4
    and-int/2addr p3, v1

    .line 144
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 145
    .line 146
    .line 147
    move-result p1

    .line 148
    if-eqz p1, :cond_5

    .line 149
    .line 150
    const/16 p1, 0xa

    .line 151
    .line 152
    int-to-float v2, p1

    .line 153
    const/4 v4, 0x0

    .line 154
    const/16 v5, 0xd

    .line 155
    .line 156
    sget-object v0, Ly0/l;->a:Ly0/l;

    .line 157
    .line 158
    const/4 v1, 0x0

    .line 159
    const/4 v3, 0x0

    .line 160
    invoke-static/range {v0 .. v5}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    iget-object p3, p0, Lwb/nd;->h:Ljava/util/List;

    .line 165
    .line 166
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 167
    .line 168
    .line 169
    move-result p3

    .line 170
    const-string v0, "\u6a21\u578b\u5217\u8868 \u00b7 "

    .line 171
    .line 172
    invoke-static {p3, v0}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object p3

    .line 176
    const/16 v0, 0x30

    .line 177
    .line 178
    const/16 v1, 0xc

    .line 179
    .line 180
    invoke-static {p3, p1, p2, v0, v1}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 181
    .line 182
    .line 183
    goto :goto_5

    .line 184
    :cond_5
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 185
    .line 186
    .line 187
    :goto_5
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 188
    .line 189
    return-object p1

    .line 190
    :pswitch_2
    const/16 v0, 0x10

    .line 191
    .line 192
    const/4 v1, 0x1

    .line 193
    if-eq p1, v0, :cond_6

    .line 194
    .line 195
    move p1, v1

    .line 196
    goto :goto_6

    .line 197
    :cond_6
    const/4 p1, 0x0

    .line 198
    :goto_6
    and-int/2addr p3, v1

    .line 199
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 200
    .line 201
    .line 202
    move-result p1

    .line 203
    if-eqz p1, :cond_7

    .line 204
    .line 205
    const/16 p1, 0xa

    .line 206
    .line 207
    int-to-float v2, p1

    .line 208
    const/4 v4, 0x0

    .line 209
    const/16 v5, 0xd

    .line 210
    .line 211
    sget-object v0, Ly0/l;->a:Ly0/l;

    .line 212
    .line 213
    const/4 v1, 0x0

    .line 214
    const/4 v3, 0x0

    .line 215
    invoke-static/range {v0 .. v5}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    iget-object p3, p0, Lwb/nd;->h:Ljava/util/List;

    .line 220
    .line 221
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 222
    .line 223
    .line 224
    move-result p3

    .line 225
    const-string v0, "\u5df2\u76d1\u542c\u7fa4 \u00b7 "

    .line 226
    .line 227
    const-string v1, " \u9879"

    .line 228
    .line 229
    invoke-static {p3, v0, v1}, Leh/a;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object p3

    .line 233
    const/16 v0, 0x30

    .line 234
    .line 235
    const/16 v1, 0xc

    .line 236
    .line 237
    invoke-static {p3, p1, p2, v0, v1}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 238
    .line 239
    .line 240
    goto :goto_7

    .line 241
    :cond_7
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 242
    .line 243
    .line 244
    :goto_7
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 245
    .line 246
    return-object p1

    .line 247
    :pswitch_3
    const/16 v0, 0x10

    .line 248
    .line 249
    const/4 v1, 0x1

    .line 250
    if-eq p1, v0, :cond_8

    .line 251
    .line 252
    move p1, v1

    .line 253
    goto :goto_8

    .line 254
    :cond_8
    const/4 p1, 0x0

    .line 255
    :goto_8
    and-int/2addr p3, v1

    .line 256
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 257
    .line 258
    .line 259
    move-result p1

    .line 260
    if-eqz p1, :cond_9

    .line 261
    .line 262
    const/16 p1, 0xa

    .line 263
    .line 264
    int-to-float v2, p1

    .line 265
    const/4 v4, 0x0

    .line 266
    const/16 v5, 0xd

    .line 267
    .line 268
    sget-object v0, Ly0/l;->a:Ly0/l;

    .line 269
    .line 270
    const/4 v1, 0x0

    .line 271
    const/4 v3, 0x0

    .line 272
    invoke-static/range {v0 .. v5}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 273
    .line 274
    .line 275
    move-result-object p1

    .line 276
    iget-object p3, p0, Lwb/nd;->h:Ljava/util/List;

    .line 277
    .line 278
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 279
    .line 280
    .line 281
    move-result p3

    .line 282
    const-string v0, "\u5df2\u76d1\u542c\u7fa4 \u00b7 "

    .line 283
    .line 284
    const-string v1, " \u9879"

    .line 285
    .line 286
    invoke-static {p3, v0, v1}, Leh/a;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object p3

    .line 290
    const/16 v0, 0x30

    .line 291
    .line 292
    const/16 v1, 0xc

    .line 293
    .line 294
    invoke-static {p3, p1, p2, v0, v1}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 295
    .line 296
    .line 297
    goto :goto_9

    .line 298
    :cond_9
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 299
    .line 300
    .line 301
    :goto_9
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 302
    .line 303
    return-object p1

    .line 304
    :pswitch_4
    const/16 v0, 0x10

    .line 305
    .line 306
    const/4 v1, 0x1

    .line 307
    if-eq p1, v0, :cond_a

    .line 308
    .line 309
    move p1, v1

    .line 310
    goto :goto_a

    .line 311
    :cond_a
    const/4 p1, 0x0

    .line 312
    :goto_a
    and-int/2addr p3, v1

    .line 313
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 314
    .line 315
    .line 316
    move-result p1

    .line 317
    if-eqz p1, :cond_c

    .line 318
    .line 319
    const/16 p1, 0xa

    .line 320
    .line 321
    int-to-float v2, p1

    .line 322
    const/4 v4, 0x0

    .line 323
    const/16 v5, 0xd

    .line 324
    .line 325
    sget-object v0, Ly0/l;->a:Ly0/l;

    .line 326
    .line 327
    const/4 v1, 0x0

    .line 328
    const/4 v3, 0x0

    .line 329
    invoke-static/range {v0 .. v5}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 330
    .line 331
    .line 332
    move-result-object p1

    .line 333
    iget-object p3, p0, Lwb/nd;->h:Ljava/util/List;

    .line 334
    .line 335
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    .line 336
    .line 337
    .line 338
    move-result v0

    .line 339
    if-eqz v0, :cond_b

    .line 340
    .line 341
    const-string p3, "\u89c4\u5219"

    .line 342
    .line 343
    goto :goto_b

    .line 344
    :cond_b
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 345
    .line 346
    .line 347
    move-result p3

    .line 348
    const-string v0, "\u89c4\u5219 \u00b7 "

    .line 349
    .line 350
    const-string v1, " \u9879"

    .line 351
    .line 352
    invoke-static {p3, v0, v1}, Leh/a;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object p3

    .line 356
    :goto_b
    const/16 v0, 0x30

    .line 357
    .line 358
    const/16 v1, 0xc

    .line 359
    .line 360
    invoke-static {p3, p1, p2, v0, v1}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 361
    .line 362
    .line 363
    goto :goto_c

    .line 364
    :cond_c
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 365
    .line 366
    .line 367
    :goto_c
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 368
    .line 369
    return-object p1

    .line 370
    nop

    .line 371
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
