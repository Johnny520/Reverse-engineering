.class public final synthetic Log/u;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(ILjava/util/List;)V
    .locals 0

    .line 1
    iput p1, p0, Log/u;->g:I

    .line 2
    .line 3
    iput-object p2, p0, Log/u;->h:Ljava/util/List;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Log/u;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/String;

    .line 7
    .line 8
    check-cast p2, Ljava/util/List;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    if-nez p2, :cond_0

    .line 14
    .line 15
    sget-object p2, Ltf/t;->g:Ltf/t;

    .line 16
    .line 17
    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget-object v1, p0, Log/u;->h:Ljava/util/List;

    .line 31
    .line 32
    if-eqz v0, :cond_4

    .line 33
    .line 34
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    move-object v2, v0

    .line 39
    check-cast v2, Lokhttp3/Cookie;

    .line 40
    .line 41
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eqz v3, :cond_1

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    if-eqz v3, :cond_3

    .line 57
    .line 58
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    check-cast v3, Lokhttp3/Cookie;

    .line 63
    .line 64
    invoke-virtual {v3}, Lokhttp3/Cookie;->name()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    invoke-virtual {v2}, Lokhttp3/Cookie;->name()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    invoke-static {v4, v5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    if-eqz v4, :cond_2

    .line 77
    .line 78
    invoke-virtual {v3}, Lokhttp3/Cookie;->domain()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    invoke-virtual {v2}, Lokhttp3/Cookie;->domain()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    invoke-static {v4, v5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    if-eqz v4, :cond_2

    .line 91
    .line 92
    invoke-virtual {v3}, Lokhttp3/Cookie;->path()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    invoke-virtual {v2}, Lokhttp3/Cookie;->path()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    invoke-static {v3, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    if-eqz v3, :cond_2

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_3
    :goto_1
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_4
    new-instance p2, Ljava/util/ArrayList;

    .line 112
    .line 113
    invoke-direct {p2, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 117
    .line 118
    .line 119
    return-object p2

    .line 120
    :pswitch_0
    move-object v4, p1

    .line 121
    check-cast v4, Ljava/lang/CharSequence;

    .line 122
    .line 123
    check-cast p2, Ljava/lang/Integer;

    .line 124
    .line 125
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 126
    .line 127
    .line 128
    move-result p1

    .line 129
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    iget-object p2, p0, Log/u;->h:Ljava/util/List;

    .line 133
    .line 134
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    const/4 v1, 0x0

    .line 139
    const/4 v2, 0x1

    .line 140
    const/4 v8, 0x0

    .line 141
    if-ne v0, v2, :cond_7

    .line 142
    .line 143
    invoke-static {p2}, Ltf/m;->H1(Ljava/util/List;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object p2

    .line 147
    check-cast p2, Ljava/lang/String;

    .line 148
    .line 149
    const/4 v0, 0x4

    .line 150
    invoke-static {v4, p2, p1, v1, v0}, Log/m;->r0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 151
    .line 152
    .line 153
    move-result p1

    .line 154
    if-gez p1, :cond_6

    .line 155
    .line 156
    :cond_5
    move-object v0, v8

    .line 157
    goto/16 :goto_6

    .line 158
    .line 159
    :cond_6
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    new-instance v0, Lsf/e;

    .line 164
    .line 165
    invoke-direct {v0, p1, p2}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    goto/16 :goto_6

    .line 169
    .line 170
    :cond_7
    new-instance v0, Llg/d;

    .line 171
    .line 172
    if-gez p1, :cond_8

    .line 173
    .line 174
    move p1, v1

    .line 175
    :cond_8
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 176
    .line 177
    .line 178
    move-result v3

    .line 179
    invoke-direct {v0, p1, v3, v2}, Llg/b;-><init>(III)V

    .line 180
    .line 181
    .line 182
    instance-of v2, v4, Ljava/lang/String;

    .line 183
    .line 184
    iget v9, v0, Llg/b;->i:I

    .line 185
    .line 186
    iget v0, v0, Llg/b;->h:I

    .line 187
    .line 188
    if-eqz v2, :cond_e

    .line 189
    .line 190
    if-lez v9, :cond_9

    .line 191
    .line 192
    if-le p1, v0, :cond_a

    .line 193
    .line 194
    :cond_9
    if-gez v9, :cond_5

    .line 195
    .line 196
    if-gt v0, p1, :cond_5

    .line 197
    .line 198
    :cond_a
    :goto_2
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    :cond_b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 203
    .line 204
    .line 205
    move-result v3

    .line 206
    if-eqz v3, :cond_c

    .line 207
    .line 208
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v3

    .line 212
    move-object v5, v3

    .line 213
    check-cast v5, Ljava/lang/String;

    .line 214
    .line 215
    move-object v6, v4

    .line 216
    check-cast v6, Ljava/lang/String;

    .line 217
    .line 218
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 219
    .line 220
    .line 221
    move-result v7

    .line 222
    invoke-virtual {v5, v1, v6, p1, v7}, Ljava/lang/String;->regionMatches(ILjava/lang/String;II)Z

    .line 223
    .line 224
    .line 225
    move-result v5

    .line 226
    if-eqz v5, :cond_b

    .line 227
    .line 228
    goto :goto_3

    .line 229
    :cond_c
    move-object v3, v8

    .line 230
    :goto_3
    check-cast v3, Ljava/lang/String;

    .line 231
    .line 232
    if-eqz v3, :cond_d

    .line 233
    .line 234
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 235
    .line 236
    .line 237
    move-result-object p1

    .line 238
    new-instance v0, Lsf/e;

    .line 239
    .line 240
    invoke-direct {v0, p1, v3}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    goto :goto_6

    .line 244
    :cond_d
    if-eq p1, v0, :cond_5

    .line 245
    .line 246
    add-int/2addr p1, v9

    .line 247
    goto :goto_2

    .line 248
    :cond_e
    if-lez v9, :cond_f

    .line 249
    .line 250
    if-le p1, v0, :cond_10

    .line 251
    .line 252
    :cond_f
    if-gez v9, :cond_5

    .line 253
    .line 254
    if-gt v0, p1, :cond_5

    .line 255
    .line 256
    :cond_10
    move v5, p1

    .line 257
    :goto_4
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 258
    .line 259
    .line 260
    move-result-object p1

    .line 261
    :cond_11
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 262
    .line 263
    .line 264
    move-result v1

    .line 265
    if-eqz v1, :cond_12

    .line 266
    .line 267
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v1

    .line 271
    move-object v2, v1

    .line 272
    check-cast v2, Ljava/lang/String;

    .line 273
    .line 274
    const/4 v3, 0x0

    .line 275
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 276
    .line 277
    .line 278
    move-result v6

    .line 279
    const/4 v7, 0x0

    .line 280
    invoke-static/range {v2 .. v7}, Log/m;->z0(Ljava/lang/CharSequence;ILjava/lang/CharSequence;IIZ)Z

    .line 281
    .line 282
    .line 283
    move-result v2

    .line 284
    if-eqz v2, :cond_11

    .line 285
    .line 286
    goto :goto_5

    .line 287
    :cond_12
    move-object v1, v8

    .line 288
    :goto_5
    check-cast v1, Ljava/lang/String;

    .line 289
    .line 290
    if-eqz v1, :cond_13

    .line 291
    .line 292
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 293
    .line 294
    .line 295
    move-result-object p1

    .line 296
    new-instance v0, Lsf/e;

    .line 297
    .line 298
    invoke-direct {v0, p1, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 299
    .line 300
    .line 301
    goto :goto_6

    .line 302
    :cond_13
    if-eq v5, v0, :cond_5

    .line 303
    .line 304
    add-int/2addr v5, v9

    .line 305
    goto :goto_4

    .line 306
    :goto_6
    if-eqz v0, :cond_14

    .line 307
    .line 308
    iget-object p1, v0, Lsf/e;->g:Ljava/lang/Object;

    .line 309
    .line 310
    iget-object p2, v0, Lsf/e;->h:Ljava/lang/Object;

    .line 311
    .line 312
    check-cast p2, Ljava/lang/String;

    .line 313
    .line 314
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 315
    .line 316
    .line 317
    move-result p2

    .line 318
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 319
    .line 320
    .line 321
    move-result-object p2

    .line 322
    new-instance v8, Lsf/e;

    .line 323
    .line 324
    invoke-direct {v8, p1, p2}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 325
    .line 326
    .line 327
    :cond_14
    return-object v8

    .line 328
    nop

    .line 329
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
