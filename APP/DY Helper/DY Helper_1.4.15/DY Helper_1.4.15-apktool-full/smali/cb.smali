.class public final synthetic Lcb;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/ClassLoader;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/ClassLoader;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcb;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lcb;->ζ:Ljava/lang/ClassLoader;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lcb;->ε:I

    .line 2
    .line 3
    const-string v1, "r398844d0f2b2fd7c"

    .line 4
    .line 5
    sget-object v2, Ls62;->α:Ls62;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    iget-object p0, p0, Lcb;->ζ:Ljava/lang/ClassLoader;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    invoke-static {p0, v3}, Lm20;->δ(Ljava/lang/ClassLoader;Z)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    return-object v2

    .line 17
    :pswitch_0
    sget-object v0, Ln10;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 18
    .line 19
    invoke-static {p0, v3}, Ln10;->ζ(Ljava/lang/ClassLoader;Z)Ljava/util/List;

    .line 20
    .line 21
    .line 22
    return-object v2

    .line 23
    :pswitch_1
    sget-object v0, Lc10;->α:Lc10;

    .line 24
    .line 25
    invoke-virtual {v0, p0, v3}, Lc10;->ζ(Ljava/lang/ClassLoader;Z)Ljava/util/List;

    .line 26
    .line 27
    .line 28
    return-object v2

    .line 29
    :pswitch_2
    invoke-static {p0, v3}, Lu00;->β(Ljava/lang/ClassLoader;Z)V

    .line 30
    .line 31
    .line 32
    return-object v2

    .line 33
    :pswitch_3
    sget-object v0, Lp00;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 34
    .line 35
    invoke-static {p0, v3}, Lp00;->β(Ljava/lang/ClassLoader;Z)V

    .line 36
    .line 37
    .line 38
    return-object v2

    .line 39
    :pswitch_4
    sget-object v0, Lst;->β:Ljava/util/concurrent/atomic/AtomicReference;

    .line 40
    .line 41
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    sget-object v0, Lst;->α:Lst;

    .line 45
    .line 46
    invoke-virtual {v0, p0, v3}, Lst;->Α(Ljava/lang/ClassLoader;Z)Ljava/util/List;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-static {p0}, Lxh;->К(Ljava/util/List;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    check-cast p0, Ljava/lang/reflect/Method;

    .line 55
    .line 56
    if-eqz p0, :cond_0

    .line 57
    .line 58
    sget-object v0, Lst;->γ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 59
    .line 60
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    invoke-static {p0}, Lst;->δ(Ljava/lang/reflect/Method;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    const-string v3, "\u9884\u70ed\u5b8c\u6210 IMUserRepository \u65b9\u6cd5: "

    .line 79
    .line 80
    const-string v4, "#"

    .line 81
    .line 82
    invoke-static {v3, v0, v4, p0, v1}, Lnx;->ψ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    :cond_0
    return-object v2

    .line 86
    :pswitch_5
    sget-object v0, Lst;->α:Lst;

    .line 87
    .line 88
    sget-object v0, Ljz;->ε:Ljz;

    .line 89
    .line 90
    :try_start_0
    const-string v2, "~7940193404FAD3677C47B093370E147D326D0A3396452FC2BA97BAC59C5D71B155FA7E485537B953059726D5F9466F197DD5864992"

    .line 91
    .line 92
    invoke-static {v2}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    invoke-static {p0, v2}, Lst;->Ξ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    if-nez p0, :cond_1

    .line 101
    .line 102
    move-object p0, v0

    .line 103
    goto/16 :goto_5

    .line 104
    .line 105
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    new-instance v2, Ljava/util/ArrayList;

    .line 113
    .line 114
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 115
    .line 116
    .line 117
    array-length v4, p0

    .line 118
    const/4 v5, 0x0

    .line 119
    :goto_0
    if-ge v5, v4, :cond_3

    .line 120
    .line 121
    aget-object v6, p0, v5

    .line 122
    .line 123
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    invoke-static {v6}, Lst;->Ζ(Ljava/lang/reflect/Method;)I

    .line 127
    .line 128
    .line 129
    move-result v7

    .line 130
    const/16 v8, 0x9c4

    .line 131
    .line 132
    if-lt v7, v8, :cond_2

    .line 133
    .line 134
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    goto :goto_1

    .line 138
    :catchall_0
    move-exception p0

    .line 139
    goto :goto_4

    .line 140
    :cond_2
    :goto_1
    add-int/lit8 v5, v5, 0x1

    .line 141
    .line 142
    goto :goto_0

    .line 143
    :cond_3
    new-instance p0, Ljava/util/HashSet;

    .line 144
    .line 145
    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 146
    .line 147
    .line 148
    new-instance v4, Ljava/util/ArrayList;

    .line 149
    .line 150
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    :cond_4
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 158
    .line 159
    .line 160
    move-result v5

    .line 161
    if-eqz v5, :cond_5

    .line 162
    .line 163
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v5

    .line 167
    move-object v6, v5

    .line 168
    check-cast v6, Ljava/lang/reflect/Method;

    .line 169
    .line 170
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    invoke-static {v6}, Lst;->χ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v6

    .line 177
    invoke-virtual {p0, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v6

    .line 181
    if-eqz v6, :cond_4

    .line 182
    .line 183
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    goto :goto_2

    .line 187
    :cond_5
    new-instance p0, Ltf;

    .line 188
    .line 189
    sget-object v2, Lst;->α:Lst;

    .line 190
    .line 191
    const/16 v2, 0x1b

    .line 192
    .line 193
    invoke-direct {p0, v2}, Ltf;-><init>(I)V

    .line 194
    .line 195
    .line 196
    invoke-static {v4, p0}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 205
    .line 206
    .line 207
    move-result v4

    .line 208
    if-eqz v4, :cond_6

    .line 209
    .line 210
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v4

    .line 214
    check-cast v4, Ljava/lang/reflect/Method;

    .line 215
    .line 216
    invoke-virtual {v4, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 217
    .line 218
    .line 219
    invoke-static {v4}, Lst;->δ(Ljava/lang/reflect/Method;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 220
    .line 221
    .line 222
    goto :goto_3

    .line 223
    :goto_4
    new-instance v2, Leo1;

    .line 224
    .line 225
    invoke-direct {v2, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 226
    .line 227
    .line 228
    move-object p0, v2

    .line 229
    :cond_6
    :goto_5
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 230
    .line 231
    .line 232
    move-result-object v2

    .line 233
    if-nez v2, :cond_7

    .line 234
    .line 235
    move-object v0, p0

    .line 236
    goto :goto_6

    .line 237
    :cond_7
    const-string p0, "IMUserRepository \u53cd\u5c04\u515c\u5e95\u5931\u8d25"

    .line 238
    .line 239
    invoke-static {v1, p0, v2}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 240
    .line 241
    .line 242
    :goto_6
    check-cast v0, Ljava/util/List;

    .line 243
    .line 244
    return-object v0

    .line 245
    :pswitch_6
    sget-object v0, Ljm;->α:Ljm;

    .line 246
    .line 247
    invoke-virtual {v0, p0, v3}, Ljm;->ι(Ljava/lang/ClassLoader;Z)Ljava/util/List;

    .line 248
    .line 249
    .line 250
    return-object v2

    .line 251
    :pswitch_7
    sget-object v0, Lyl;->α:Lyl;

    .line 252
    .line 253
    invoke-static {p0, v3}, Lyl;->ν(Ljava/lang/ClassLoader;Z)Ljava/util/List;

    .line 254
    .line 255
    .line 256
    return-object v2

    .line 257
    :pswitch_8
    sget-object v0, Lyl;->α:Lyl;

    .line 258
    .line 259
    invoke-static {p0, v3}, Lyl;->μ(Ljava/lang/ClassLoader;Z)Ljava/util/List;

    .line 260
    .line 261
    .line 262
    return-object v2

    .line 263
    :pswitch_9
    sget-object v0, Lql;->α:Lql;

    .line 264
    .line 265
    invoke-static {p0, v3}, Lql;->Μ(Ljava/lang/ClassLoader;Z)Ljava/util/List;

    .line 266
    .line 267
    .line 268
    return-object v2

    .line 269
    :pswitch_a
    sget-object v0, Lkk;->α:Lkk;

    .line 270
    .line 271
    invoke-virtual {v0, p0, v3}, Lkk;->ο(Ljava/lang/ClassLoader;Z)Ljk;

    .line 272
    .line 273
    .line 274
    return-object v2

    .line 275
    :pswitch_b
    invoke-static {p0}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->χ(Ljava/lang/ClassLoader;)Ls62;

    .line 276
    .line 277
    .line 278
    move-result-object p0

    .line 279
    return-object p0

    .line 280
    :pswitch_c
    invoke-static {p0}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->ζ(Ljava/lang/ClassLoader;)Ls62;

    .line 281
    .line 282
    .line 283
    move-result-object p0

    .line 284
    return-object p0

    .line 285
    :pswitch_d
    invoke-static {p0}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->φ(Ljava/lang/ClassLoader;)Ls62;

    .line 286
    .line 287
    .line 288
    move-result-object p0

    .line 289
    return-object p0

    .line 290
    :pswitch_e
    invoke-static {p0}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->ξ(Ljava/lang/ClassLoader;)Ls62;

    .line 291
    .line 292
    .line 293
    move-result-object p0

    .line 294
    return-object p0

    .line 295
    :pswitch_f
    sget-object v0, Lfj;->α:Lfj;

    .line 296
    .line 297
    invoke-static {p0, v3}, Lfj;->Γ(Ljava/lang/ClassLoader;Z)Ljava/util/List;

    .line 298
    .line 299
    .line 300
    return-object v2

    .line 301
    :pswitch_10
    sget-object v0, Lkh;->α:Lkh;

    .line 302
    .line 303
    invoke-virtual {v0, p0, v3}, Lkh;->ν(Ljava/lang/ClassLoader;Z)Ljava/util/List;

    .line 304
    .line 305
    .line 306
    return-object v2

    .line 307
    :pswitch_11
    sget-object v0, Lkh;->α:Lkh;

    .line 308
    .line 309
    invoke-virtual {v0, p0, v3}, Lkh;->μ(Ljava/lang/ClassLoader;Z)Ljava/util/List;

    .line 310
    .line 311
    .line 312
    return-object v2

    .line 313
    :pswitch_12
    sget-object v0, Lkh;->α:Lkh;

    .line 314
    .line 315
    invoke-virtual {v0, p0, v3}, Lkh;->λ(Ljava/lang/ClassLoader;Z)Ljava/util/List;

    .line 316
    .line 317
    .line 318
    return-object v2

    .line 319
    :pswitch_13
    sget-object v0, Lag;->α:Lag;

    .line 320
    .line 321
    invoke-virtual {v0, p0, v3}, Lag;->δ(Ljava/lang/ClassLoader;Z)Ljava/util/ArrayList;

    .line 322
    .line 323
    .line 324
    return-object v2

    .line 325
    :pswitch_14
    sget-object v0, Laf;->α:Laf;

    .line 326
    .line 327
    invoke-virtual {v0, p0, v3}, Laf;->θ(Ljava/lang/ClassLoader;Z)Ljava/util/List;

    .line 328
    .line 329
    .line 330
    return-object v2

    .line 331
    :pswitch_15
    sget-object v0, Lbf;->α:Lbf;

    .line 332
    .line 333
    invoke-virtual {v0, p0, v3}, Lbf;->θ(Ljava/lang/ClassLoader;Z)Ljava/util/List;

    .line 334
    .line 335
    .line 336
    return-object v2

    .line 337
    :pswitch_16
    sget-object v0, Lvb;->α:Ljava/util/List;

    .line 338
    .line 339
    invoke-static {p0, v3}, Lvb;->π(Ljava/lang/ClassLoader;Z)Ljava/util/List;

    .line 340
    .line 341
    .line 342
    return-object v2

    .line 343
    :pswitch_17
    sget-object v0, Lvb;->α:Ljava/util/List;

    .line 344
    .line 345
    invoke-static {p0, v3}, Lvb;->ο(Ljava/lang/ClassLoader;Z)Ljava/util/List;

    .line 346
    .line 347
    .line 348
    return-object v2

    .line 349
    :pswitch_18
    sget-object v0, Lvb;->α:Ljava/util/List;

    .line 350
    .line 351
    invoke-static {p0, v3}, Lvb;->ν(Ljava/lang/ClassLoader;Z)Ljava/util/List;

    .line 352
    .line 353
    .line 354
    return-object v2

    .line 355
    :pswitch_19
    sget-object v0, Lvb;->α:Ljava/util/List;

    .line 356
    .line 357
    invoke-static {p0, v3}, Lvb;->ρ(Ljava/lang/ClassLoader;Z)Ljava/util/List;

    .line 358
    .line 359
    .line 360
    return-object v2

    .line 361
    :pswitch_1a
    invoke-static {p0, v3}, Lfb;->η(Ljava/lang/ClassLoader;Z)Ljava/util/List;

    .line 362
    .line 363
    .line 364
    return-object v2

    .line 365
    :pswitch_1b
    invoke-static {p0, v3}, Lfb;->θ(Ljava/lang/ClassLoader;Z)Ljava/util/List;

    .line 366
    .line 367
    .line 368
    return-object v2

    .line 369
    :pswitch_1c
    invoke-static {p0, v3}, Lfb;->ι(Ljava/lang/ClassLoader;Z)Ljava/util/List;

    .line 370
    .line 371
    .line 372
    return-object v2

    .line 373
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
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
