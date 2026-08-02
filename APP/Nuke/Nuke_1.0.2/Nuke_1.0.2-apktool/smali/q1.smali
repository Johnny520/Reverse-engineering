.class public final synthetic Lq1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(ILjava/util/List;)V
    .locals 0

    .line 1
    iput p1, p0, Lq1;->h:I

    .line 2
    .line 3
    iput-object p2, p0, Lq1;->i:Ljava/util/List;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;II)V
    .locals 0

    .line 9
    iput p3, p0, Lq1;->h:I

    iput-object p1, p0, Lq1;->i:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Lq1;->h:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    sget-object v3, La83;->a:La83;

    .line 6
    .line 7
    const/4 v4, 0x1

    .line 8
    iget-object p0, p0, Lq1;->i:Ljava/util/List;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    move-object v7, p1

    .line 14
    check-cast v7, Ljava/lang/CharSequence;

    .line 15
    .line 16
    check-cast p2, Ljava/lang/Integer;

    .line 17
    .line 18
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    const/4 v0, 0x0

    .line 30
    if-ne p2, v4, :cond_4

    .line 31
    .line 32
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    if-eqz p2, :cond_3

    .line 37
    .line 38
    if-ne p2, v4, :cond_2

    .line 39
    .line 40
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    check-cast p0, Ljava/lang/String;

    .line 45
    .line 46
    const/4 p2, 0x4

    .line 47
    invoke-static {v7, p0, p1, v2, p2}, Lpv2;->q0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-gez p1, :cond_1

    .line 52
    .line 53
    :cond_0
    move-object p2, v0

    .line 54
    goto/16 :goto_4

    .line 55
    .line 56
    :cond_1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    new-instance p2, Low1;

    .line 61
    .line 62
    invoke-direct {p2, p1, p0}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    goto/16 :goto_4

    .line 66
    .line 67
    :cond_2
    const-string p0, "List has more than one element."

    .line 68
    .line 69
    invoke-static {p0}, Ls;->j(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    goto/16 :goto_5

    .line 73
    .line 74
    :cond_3
    const-string p0, "List is empty."

    .line 75
    .line 76
    invoke-static {p0}, Lum2;->i(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    goto/16 :goto_5

    .line 80
    .line 81
    :cond_4
    new-instance p2, Lc11;

    .line 82
    .line 83
    if-gez p1, :cond_5

    .line 84
    .line 85
    move p1, v2

    .line 86
    :cond_5
    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    invoke-direct {p2, p1, v1, v4}, La11;-><init>(III)V

    .line 91
    .line 92
    .line 93
    instance-of v1, v7, Ljava/lang/String;

    .line 94
    .line 95
    iget v3, p2, La11;->j:I

    .line 96
    .line 97
    iget p2, p2, La11;->i:I

    .line 98
    .line 99
    if-eqz v1, :cond_b

    .line 100
    .line 101
    if-lez v3, :cond_6

    .line 102
    .line 103
    if-le p1, p2, :cond_7

    .line 104
    .line 105
    :cond_6
    if-gez v3, :cond_0

    .line 106
    .line 107
    if-gt p2, p1, :cond_0

    .line 108
    .line 109
    :cond_7
    :goto_0
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    :cond_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 114
    .line 115
    .line 116
    move-result v4

    .line 117
    if-eqz v4, :cond_9

    .line 118
    .line 119
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    move-object v5, v4

    .line 124
    check-cast v5, Ljava/lang/String;

    .line 125
    .line 126
    move-object v6, v7

    .line 127
    check-cast v6, Ljava/lang/String;

    .line 128
    .line 129
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 130
    .line 131
    .line 132
    move-result v8

    .line 133
    invoke-virtual {v5, v2, v6, p1, v8}, Ljava/lang/String;->regionMatches(ILjava/lang/String;II)Z

    .line 134
    .line 135
    .line 136
    move-result v5

    .line 137
    if-eqz v5, :cond_8

    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_9
    move-object v4, v0

    .line 141
    :goto_1
    check-cast v4, Ljava/lang/String;

    .line 142
    .line 143
    if-eqz v4, :cond_a

    .line 144
    .line 145
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    new-instance p2, Low1;

    .line 150
    .line 151
    invoke-direct {p2, p0, v4}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    goto :goto_4

    .line 155
    :cond_a
    if-eq p1, p2, :cond_0

    .line 156
    .line 157
    add-int/2addr p1, v3

    .line 158
    goto :goto_0

    .line 159
    :cond_b
    if-lez v3, :cond_c

    .line 160
    .line 161
    if-le p1, p2, :cond_d

    .line 162
    .line 163
    :cond_c
    if-gez v3, :cond_0

    .line 164
    .line 165
    if-gt p2, p1, :cond_0

    .line 166
    .line 167
    :cond_d
    move v8, p1

    .line 168
    :goto_2
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    :cond_e
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 173
    .line 174
    .line 175
    move-result v1

    .line 176
    if-eqz v1, :cond_f

    .line 177
    .line 178
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    move-object v5, v1

    .line 183
    check-cast v5, Ljava/lang/String;

    .line 184
    .line 185
    const/4 v6, 0x0

    .line 186
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 187
    .line 188
    .line 189
    move-result v9

    .line 190
    const/4 v10, 0x0

    .line 191
    invoke-static/range {v5 .. v10}, Lpv2;->x0(Ljava/lang/CharSequence;ILjava/lang/CharSequence;IIZ)Z

    .line 192
    .line 193
    .line 194
    move-result v2

    .line 195
    if-eqz v2, :cond_e

    .line 196
    .line 197
    goto :goto_3

    .line 198
    :cond_f
    move-object v1, v0

    .line 199
    :goto_3
    check-cast v1, Ljava/lang/String;

    .line 200
    .line 201
    if-eqz v1, :cond_10

    .line 202
    .line 203
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 204
    .line 205
    .line 206
    move-result-object p0

    .line 207
    new-instance p2, Low1;

    .line 208
    .line 209
    invoke-direct {p2, p0, v1}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    goto :goto_4

    .line 213
    :cond_10
    if-eq v8, p2, :cond_0

    .line 214
    .line 215
    add-int/2addr v8, v3

    .line 216
    goto :goto_2

    .line 217
    :goto_4
    if-eqz p2, :cond_11

    .line 218
    .line 219
    iget-object p0, p2, Low1;->h:Ljava/lang/Object;

    .line 220
    .line 221
    iget-object p1, p2, Low1;->i:Ljava/lang/Object;

    .line 222
    .line 223
    check-cast p1, Ljava/lang/String;

    .line 224
    .line 225
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 226
    .line 227
    .line 228
    move-result p1

    .line 229
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    new-instance v0, Low1;

    .line 234
    .line 235
    invoke-direct {v0, p0, p1}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 236
    .line 237
    .line 238
    :cond_11
    :goto_5
    return-object v0

    .line 239
    :pswitch_0
    check-cast p1, Lpx;

    .line 240
    .line 241
    check-cast p2, Ljava/lang/Integer;

    .line 242
    .line 243
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    invoke-static {v4}, Lpp0;->N(I)I

    .line 247
    .line 248
    .line 249
    move-result p2

    .line 250
    invoke-static {p0, p1, p2}, Ls11;->n(Ljava/util/List;Lpx;I)V

    .line 251
    .line 252
    .line 253
    return-object v3

    .line 254
    :pswitch_1
    check-cast p1, Lpx;

    .line 255
    .line 256
    check-cast p2, Ljava/lang/Integer;

    .line 257
    .line 258
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 259
    .line 260
    .line 261
    invoke-static {v4}, Lpp0;->N(I)I

    .line 262
    .line 263
    .line 264
    move-result p2

    .line 265
    invoke-static {p0, p1, p2}, Lte;->c(Ljava/util/List;Lpx;I)V

    .line 266
    .line 267
    .line 268
    return-object v3

    .line 269
    :pswitch_2
    check-cast p1, Lpx;

    .line 270
    .line 271
    check-cast p2, Ljava/lang/Integer;

    .line 272
    .line 273
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 274
    .line 275
    .line 276
    invoke-static {v4}, Lpp0;->N(I)I

    .line 277
    .line 278
    .line 279
    move-result p2

    .line 280
    invoke-static {p0, p1, p2}, Lte;->h(Ljava/util/List;Lpx;I)V

    .line 281
    .line 282
    .line 283
    return-object v3

    .line 284
    :pswitch_3
    check-cast p1, Lpx;

    .line 285
    .line 286
    check-cast p2, Ljava/lang/Integer;

    .line 287
    .line 288
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 289
    .line 290
    .line 291
    move-result p2

    .line 292
    and-int/lit8 v0, p2, 0x3

    .line 293
    .line 294
    if-eq v0, v1, :cond_12

    .line 295
    .line 296
    move v0, v4

    .line 297
    goto :goto_6

    .line 298
    :cond_12
    move v0, v2

    .line 299
    :goto_6
    and-int/2addr p2, v4

    .line 300
    check-cast p1, Lgo0;

    .line 301
    .line 302
    invoke-virtual {p1, p2, v0}, Lgo0;->O(IZ)Z

    .line 303
    .line 304
    .line 305
    move-result p2

    .line 306
    if-eqz p2, :cond_13

    .line 307
    .line 308
    invoke-static {p0, p1, v2}, Lte;->h(Ljava/util/List;Lpx;I)V

    .line 309
    .line 310
    .line 311
    goto :goto_7

    .line 312
    :cond_13
    invoke-virtual {p1}, Lgo0;->R()V

    .line 313
    .line 314
    .line 315
    :goto_7
    return-object v3

    .line 316
    :pswitch_4
    check-cast p1, Lpx;

    .line 317
    .line 318
    check-cast p2, Ljava/lang/Integer;

    .line 319
    .line 320
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 321
    .line 322
    .line 323
    move-result p2

    .line 324
    and-int/lit8 v0, p2, 0x3

    .line 325
    .line 326
    if-eq v0, v1, :cond_14

    .line 327
    .line 328
    move v0, v4

    .line 329
    goto :goto_8

    .line 330
    :cond_14
    move v0, v2

    .line 331
    :goto_8
    and-int/2addr p2, v4

    .line 332
    check-cast p1, Lgo0;

    .line 333
    .line 334
    invoke-virtual {p1, p2, v0}, Lgo0;->O(IZ)Z

    .line 335
    .line 336
    .line 337
    move-result p2

    .line 338
    if-eqz p2, :cond_15

    .line 339
    .line 340
    invoke-static {p0, p1, v2}, Lte;->c(Ljava/util/List;Lpx;I)V

    .line 341
    .line 342
    .line 343
    goto :goto_9

    .line 344
    :cond_15
    invoke-virtual {p1}, Lgo0;->R()V

    .line 345
    .line 346
    .line 347
    :goto_9
    return-object v3

    .line 348
    nop

    .line 349
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
