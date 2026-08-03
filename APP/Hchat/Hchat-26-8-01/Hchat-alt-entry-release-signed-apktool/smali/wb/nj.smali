.class public final synthetic Lwb/nj;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lfg/l;

.field public final synthetic i:Lx8/b;

.field public final synthetic j:Lfg/l;


# direct methods
.method public synthetic constructor <init>(Lfg/l;Lx8/b;Lfg/l;I)V
    .locals 0

    .line 1
    iput p4, p0, Lwb/nj;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/nj;->h:Lfg/l;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/nj;->i:Lx8/b;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/nj;->j:Lfg/l;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Lwb/nj;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lwb/d4;

    .line 7
    .line 8
    iget-object v1, p0, Lwb/nj;->i:Lx8/b;

    .line 9
    .line 10
    iget-object v2, v1, Lx8/b;->k:Ljava/util/Set;

    .line 11
    .line 12
    check-cast v2, Ljava/lang/Iterable;

    .line 13
    .line 14
    invoke-static {v2}, Lwb/ho;->D5(Ljava/lang/Iterable;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    new-instance v3, Lwb/mj;

    .line 19
    .line 20
    const/16 v4, 0xf

    .line 21
    .line 22
    iget-object v5, p0, Lwb/nj;->j:Lfg/l;

    .line 23
    .line 24
    invoke-direct {v3, v4, v5, v1}, Lwb/mj;-><init>(ILfg/l;Lx8/b;)V

    .line 25
    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    const-string v4, "\u9009\u62e9\u6392\u9664\u7fa4\u6210\u5458"

    .line 29
    .line 30
    invoke-direct {v0, v4, v2, v3, v1}, Lwb/d4;-><init>(Ljava/lang/String;Ljava/lang/String;Lfg/l;Ljava/util/LinkedHashSet;)V

    .line 31
    .line 32
    .line 33
    iget-object v1, p0, Lwb/nj;->h:Lfg/l;

    .line 34
    .line 35
    invoke-interface {v1, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    :goto_0
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 39
    .line 40
    return-object v0

    .line 41
    :pswitch_0
    iget-object v0, p0, Lwb/nj;->i:Lx8/b;

    .line 42
    .line 43
    iget-object v1, v0, Lx8/b;->i:Ljava/util/Set;

    .line 44
    .line 45
    check-cast v1, Ljava/lang/Iterable;

    .line 46
    .line 47
    new-instance v2, Ljava/util/ArrayList;

    .line 48
    .line 49
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 50
    .line 51
    .line 52
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    :cond_0
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    if-eqz v3, :cond_1

    .line 61
    .line 62
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    move-object v4, v3

    .line 67
    check-cast v4, Ljava/lang/String;

    .line 68
    .line 69
    invoke-static {v4}, Lwb/ho;->Z5(Ljava/lang/String;)Z

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    if-eqz v4, :cond_0

    .line 74
    .line 75
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_1
    invoke-static {v2}, Lwb/ho;->D5(Ljava/lang/Iterable;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v9

    .line 83
    new-instance v10, Lwb/mj;

    .line 84
    .line 85
    const/16 v1, 0x10

    .line 86
    .line 87
    iget-object v2, p0, Lwb/nj;->j:Lfg/l;

    .line 88
    .line 89
    invoke-direct {v10, v1, v2, v0}, Lwb/mj;-><init>(ILfg/l;Lx8/b;)V

    .line 90
    .line 91
    .line 92
    new-instance v5, Lwb/v0;

    .line 93
    .line 94
    const-string v6, "\u9009\u62e9\u6392\u9664\u7fa4\u804a"

    .line 95
    .line 96
    sget-object v7, Lwb/u0;->h:Lwb/u0;

    .line 97
    .line 98
    const/4 v8, 0x1

    .line 99
    const/4 v11, 0x0

    .line 100
    const/16 v12, 0xe0

    .line 101
    .line 102
    invoke-direct/range {v5 .. v12}, Lwb/v0;-><init>(Ljava/lang/String;Lwb/u0;ZLjava/lang/String;Lfg/l;ZI)V

    .line 103
    .line 104
    .line 105
    iget-object v0, p0, Lwb/nj;->h:Lfg/l;

    .line 106
    .line 107
    invoke-interface {v0, v5}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    goto :goto_0

    .line 111
    :pswitch_1
    iget-object v0, p0, Lwb/nj;->i:Lx8/b;

    .line 112
    .line 113
    iget-object v1, v0, Lx8/b;->i:Ljava/util/Set;

    .line 114
    .line 115
    check-cast v1, Ljava/lang/Iterable;

    .line 116
    .line 117
    new-instance v2, Ljava/util/ArrayList;

    .line 118
    .line 119
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 120
    .line 121
    .line 122
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    :cond_2
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    if-eqz v3, :cond_3

    .line 131
    .line 132
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    move-object v4, v3

    .line 137
    check-cast v4, Ljava/lang/String;

    .line 138
    .line 139
    invoke-static {v4}, Lwb/ho;->Z5(Ljava/lang/String;)Z

    .line 140
    .line 141
    .line 142
    move-result v4

    .line 143
    if-nez v4, :cond_2

    .line 144
    .line 145
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    goto :goto_2

    .line 149
    :cond_3
    invoke-static {v2}, Lwb/ho;->D5(Ljava/lang/Iterable;)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v9

    .line 153
    new-instance v10, Lwb/mj;

    .line 154
    .line 155
    const/16 v1, 0xe

    .line 156
    .line 157
    iget-object v2, p0, Lwb/nj;->j:Lfg/l;

    .line 158
    .line 159
    invoke-direct {v10, v1, v2, v0}, Lwb/mj;-><init>(ILfg/l;Lx8/b;)V

    .line 160
    .line 161
    .line 162
    new-instance v5, Lwb/v0;

    .line 163
    .line 164
    const-string v6, "\u9009\u62e9\u6392\u9664\u597d\u53cb"

    .line 165
    .line 166
    sget-object v7, Lwb/u0;->g:Lwb/u0;

    .line 167
    .line 168
    const/4 v8, 0x1

    .line 169
    const/4 v11, 0x1

    .line 170
    const/16 v12, 0xc0

    .line 171
    .line 172
    invoke-direct/range {v5 .. v12}, Lwb/v0;-><init>(Ljava/lang/String;Lwb/u0;ZLjava/lang/String;Lfg/l;ZI)V

    .line 173
    .line 174
    .line 175
    iget-object v0, p0, Lwb/nj;->h:Lfg/l;

    .line 176
    .line 177
    invoke-interface {v0, v5}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    goto/16 :goto_0

    .line 181
    .line 182
    :pswitch_2
    new-instance v0, Lwb/d4;

    .line 183
    .line 184
    iget-object v1, p0, Lwb/nj;->i:Lx8/b;

    .line 185
    .line 186
    iget-object v2, v1, Lx8/b;->j:Ljava/util/Set;

    .line 187
    .line 188
    check-cast v2, Ljava/lang/Iterable;

    .line 189
    .line 190
    invoke-static {v2}, Lwb/ho;->D5(Ljava/lang/Iterable;)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    new-instance v3, Lwb/mj;

    .line 195
    .line 196
    const/16 v4, 0xd

    .line 197
    .line 198
    iget-object v5, p0, Lwb/nj;->j:Lfg/l;

    .line 199
    .line 200
    invoke-direct {v3, v4, v5, v1}, Lwb/mj;-><init>(ILfg/l;Lx8/b;)V

    .line 201
    .line 202
    .line 203
    const/4 v1, 0x0

    .line 204
    const-string v4, "\u9009\u62e9\u6307\u5b9a\u7fa4\u6210\u5458"

    .line 205
    .line 206
    invoke-direct {v0, v4, v2, v3, v1}, Lwb/d4;-><init>(Ljava/lang/String;Ljava/lang/String;Lfg/l;Ljava/util/LinkedHashSet;)V

    .line 207
    .line 208
    .line 209
    iget-object v1, p0, Lwb/nj;->h:Lfg/l;

    .line 210
    .line 211
    invoke-interface {v1, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    goto/16 :goto_0

    .line 215
    .line 216
    :pswitch_3
    iget-object v0, p0, Lwb/nj;->i:Lx8/b;

    .line 217
    .line 218
    iget-object v1, v0, Lx8/b;->h:Ljava/util/Set;

    .line 219
    .line 220
    check-cast v1, Ljava/lang/Iterable;

    .line 221
    .line 222
    new-instance v2, Ljava/util/ArrayList;

    .line 223
    .line 224
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 225
    .line 226
    .line 227
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    :cond_4
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 232
    .line 233
    .line 234
    move-result v3

    .line 235
    if-eqz v3, :cond_5

    .line 236
    .line 237
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v3

    .line 241
    move-object v4, v3

    .line 242
    check-cast v4, Ljava/lang/String;

    .line 243
    .line 244
    invoke-static {v4}, Lwb/ho;->Z5(Ljava/lang/String;)Z

    .line 245
    .line 246
    .line 247
    move-result v4

    .line 248
    if-eqz v4, :cond_4

    .line 249
    .line 250
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    goto :goto_3

    .line 254
    :cond_5
    invoke-static {v2}, Lwb/ho;->D5(Ljava/lang/Iterable;)Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v9

    .line 258
    new-instance v10, Lwb/mj;

    .line 259
    .line 260
    const/16 v1, 0x12

    .line 261
    .line 262
    iget-object v2, p0, Lwb/nj;->j:Lfg/l;

    .line 263
    .line 264
    invoke-direct {v10, v1, v2, v0}, Lwb/mj;-><init>(ILfg/l;Lx8/b;)V

    .line 265
    .line 266
    .line 267
    new-instance v5, Lwb/v0;

    .line 268
    .line 269
    const-string v6, "\u9009\u62e9\u6307\u5b9a\u7fa4\u804a"

    .line 270
    .line 271
    sget-object v7, Lwb/u0;->h:Lwb/u0;

    .line 272
    .line 273
    const/4 v8, 0x1

    .line 274
    const/4 v11, 0x0

    .line 275
    const/16 v12, 0xe0

    .line 276
    .line 277
    invoke-direct/range {v5 .. v12}, Lwb/v0;-><init>(Ljava/lang/String;Lwb/u0;ZLjava/lang/String;Lfg/l;ZI)V

    .line 278
    .line 279
    .line 280
    iget-object v0, p0, Lwb/nj;->h:Lfg/l;

    .line 281
    .line 282
    invoke-interface {v0, v5}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    goto/16 :goto_0

    .line 286
    .line 287
    :pswitch_4
    iget-object v0, p0, Lwb/nj;->i:Lx8/b;

    .line 288
    .line 289
    iget-object v1, v0, Lx8/b;->h:Ljava/util/Set;

    .line 290
    .line 291
    check-cast v1, Ljava/lang/Iterable;

    .line 292
    .line 293
    new-instance v2, Ljava/util/ArrayList;

    .line 294
    .line 295
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 296
    .line 297
    .line 298
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 299
    .line 300
    .line 301
    move-result-object v1

    .line 302
    :cond_6
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 303
    .line 304
    .line 305
    move-result v3

    .line 306
    if-eqz v3, :cond_7

    .line 307
    .line 308
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v3

    .line 312
    move-object v4, v3

    .line 313
    check-cast v4, Ljava/lang/String;

    .line 314
    .line 315
    invoke-static {v4}, Lwb/ho;->Z5(Ljava/lang/String;)Z

    .line 316
    .line 317
    .line 318
    move-result v4

    .line 319
    if-nez v4, :cond_6

    .line 320
    .line 321
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 322
    .line 323
    .line 324
    goto :goto_4

    .line 325
    :cond_7
    invoke-static {v2}, Lwb/ho;->D5(Ljava/lang/Iterable;)Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v9

    .line 329
    new-instance v10, Lwb/mj;

    .line 330
    .line 331
    const/16 v1, 0x11

    .line 332
    .line 333
    iget-object v2, p0, Lwb/nj;->j:Lfg/l;

    .line 334
    .line 335
    invoke-direct {v10, v1, v2, v0}, Lwb/mj;-><init>(ILfg/l;Lx8/b;)V

    .line 336
    .line 337
    .line 338
    new-instance v5, Lwb/v0;

    .line 339
    .line 340
    const-string v6, "\u9009\u62e9\u6307\u5b9a\u597d\u53cb"

    .line 341
    .line 342
    sget-object v7, Lwb/u0;->g:Lwb/u0;

    .line 343
    .line 344
    const/4 v8, 0x1

    .line 345
    const/4 v11, 0x1

    .line 346
    const/16 v12, 0xc0

    .line 347
    .line 348
    invoke-direct/range {v5 .. v12}, Lwb/v0;-><init>(Ljava/lang/String;Lwb/u0;ZLjava/lang/String;Lfg/l;ZI)V

    .line 349
    .line 350
    .line 351
    iget-object v0, p0, Lwb/nj;->h:Lfg/l;

    .line 352
    .line 353
    invoke-interface {v0, v5}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    goto/16 :goto_0

    .line 357
    .line 358
    nop

    .line 359
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
