.class public abstract Luv0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Luv0;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    return-void
.end method

.method public static α(Ljava/lang/ClassLoader;Z)Ljava/util/List;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lox;->α:Ljava/lang/Object;

    .line 5
    .line 6
    sget-object v0, Lkx;->р:Lkx;

    .line 7
    .line 8
    invoke-static {v0, p0}, Lox;->σ(Lkx;Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const/4 v2, 0x1

    .line 13
    if-eqz v1, :cond_2

    .line 14
    .line 15
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-nez v3, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v1, 0x0

    .line 23
    :goto_0
    if-eqz v1, :cond_2

    .line 24
    .line 25
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast p1, Ljava/lang/reflect/Method;

    .line 40
    .line 41
    invoke-virtual {p1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    return-object v1

    .line 46
    :cond_2
    sget-object v1, Ljz;->ε:Ljz;

    .line 47
    .line 48
    if-eqz p1, :cond_6

    .line 49
    .line 50
    sget-object p1, Lox;->ι:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-nez p1, :cond_3

    .line 57
    .line 58
    goto :goto_3

    .line 59
    :cond_3
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-static {p1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    if-eqz p1, :cond_4

    .line 72
    .line 73
    const-string p0, "rf5644a5272eb2eef"

    .line 74
    .line 75
    const-string p1, "skip comment DexKit scan on main thread"

    .line 76
    .line 77
    invoke-static {p0, p1}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    return-object v1

    .line 81
    :cond_4
    new-instance p1, Lt20;

    .line 82
    .line 83
    const/16 v1, 0xe

    .line 84
    .line 85
    invoke-direct {p1, p0, v1}, Lt20;-><init>(Ljava/lang/ClassLoader;I)V

    .line 86
    .line 87
    .line 88
    const-string v1, "\u5b9a\u4f4d\u8bc4\u8bba\u957f\u6309\u64cd\u4f5c\u9879\u5217\u8868\u5165\u53e3"

    .line 89
    .line 90
    invoke-static {v0, p0, v1, p1}, Lox;->λ(Lkx;Ljava/lang/ClassLoader;Ljava/lang/String;La80;)Ljava/util/List;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-eqz v0, :cond_5

    .line 103
    .line 104
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    check-cast v0, Ljava/lang/reflect/Method;

    .line 109
    .line 110
    invoke-virtual {v0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 111
    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_5
    return-object p0

    .line 115
    :cond_6
    :goto_3
    return-object v1
.end method

.method public static β(Ljava/lang/ClassLoader;Z)Ljava/util/List;
    .locals 10

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lox;->α:Ljava/lang/Object;

    .line 5
    .line 6
    sget-object v0, Lkx;->с:Lkx;

    .line 7
    .line 8
    invoke-static {v0, p0}, Lox;->σ(Lkx;Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const/4 v2, 0x1

    .line 13
    const/4 v3, 0x0

    .line 14
    if-eqz v1, :cond_2

    .line 15
    .line 16
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    if-nez v4, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move-object v1, v3

    .line 24
    :goto_0
    if-eqz v1, :cond_2

    .line 25
    .line 26
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, Ljava/lang/reflect/Method;

    .line 41
    .line 42
    invoke-virtual {p1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    return-object v1

    .line 47
    :cond_2
    const-string v1, "~78F34A746881AA3660EE86BE622F7993067D6CB566F11858AD9BFDFAF7546DEFBE6F7A699FA0B4E1E231EAB579946FE2D2FA5C5B0B85A1F36EBFE6A126665CE055B3E4F9F2C8200D94DA2CD0520C73EF472A0B678E1F90F349"

    .line 48
    .line 49
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    const-string v4, "~781A9FBE2FBD8F61F657275D326874C55508DE7AC4D364B88930CC7C2AF8B2F6F1F42FB5723DCF19FDB169E3B07C1571F28AB7C03C50DB95F93145BAB7A004FEEA08CD9ED47324A2FC64074299E44EC1B9FF3E0358910EF4B9C33D8620934304D760AC"

    .line 54
    .line 55
    invoke-static {v4}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    filled-new-array {v1, v4}, [Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-static {v1}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    new-instance v4, Ljava/util/ArrayList;

    .line 68
    .line 69
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 70
    .line 71
    .line 72
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    :cond_3
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    if-eqz v5, :cond_4

    .line 81
    .line 82
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    check-cast v5, Ljava/lang/String;

    .line 87
    .line 88
    invoke-static {p0, v5}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    if-eqz v5, :cond_3

    .line 93
    .line 94
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_4
    new-instance v1, Ljava/util/ArrayList;

    .line 99
    .line 100
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    :cond_5
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 108
    .line 109
    .line 110
    move-result v5

    .line 111
    if-eqz v5, :cond_a

    .line 112
    .line 113
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    check-cast v5, Ljava/lang/Class;

    .line 118
    .line 119
    invoke-virtual {v5}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 120
    .line 121
    .line 122
    move-result-object v5

    .line 123
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    invoke-static {v5}, Lg7;->Θ([Ljava/lang/Object;)Lss1;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    new-instance v6, Lsv0;

    .line 131
    .line 132
    invoke-direct {v6, v2}, Lsv0;-><init>(I)V

    .line 133
    .line 134
    .line 135
    new-instance v7, Ly30;

    .line 136
    .line 137
    invoke-direct {v7, v5, v2, v6}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 138
    .line 139
    .line 140
    new-instance v5, Lsv0;

    .line 141
    .line 142
    const/4 v6, 0x2

    .line 143
    invoke-direct {v5, v6}, Lsv0;-><init>(I)V

    .line 144
    .line 145
    .line 146
    new-instance v6, Ly30;

    .line 147
    .line 148
    invoke-direct {v6, v7, v2, v5}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 149
    .line 150
    .line 151
    new-instance v5, Lgp0;

    .line 152
    .line 153
    const/16 v7, 0x1a

    .line 154
    .line 155
    invoke-direct {v5, v7}, Lgp0;-><init>(I)V

    .line 156
    .line 157
    .line 158
    new-instance v7, Ly30;

    .line 159
    .line 160
    invoke-direct {v7, v6, v2, v5}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 161
    .line 162
    .line 163
    new-instance v5, Lgp0;

    .line 164
    .line 165
    const/16 v6, 0x1b

    .line 166
    .line 167
    invoke-direct {v5, v6}, Lgp0;-><init>(I)V

    .line 168
    .line 169
    .line 170
    invoke-static {v7, v5}, Lus1;->Γ(Lss1;La80;)Lt52;

    .line 171
    .line 172
    .line 173
    move-result-object v5

    .line 174
    new-instance v6, Lgp0;

    .line 175
    .line 176
    const/16 v7, 0x1c

    .line 177
    .line 178
    invoke-direct {v6, v7}, Lgp0;-><init>(I)V

    .line 179
    .line 180
    .line 181
    new-instance v7, Ly30;

    .line 182
    .line 183
    invoke-direct {v7, v5, v2, v6}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 184
    .line 185
    .line 186
    new-instance v5, Lx30;

    .line 187
    .line 188
    invoke-direct {v5, v7}, Lx30;-><init>(Ly30;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v5}, Lx30;->hasNext()Z

    .line 192
    .line 193
    .line 194
    move-result v6

    .line 195
    if-nez v6, :cond_6

    .line 196
    .line 197
    move-object v6, v3

    .line 198
    goto :goto_4

    .line 199
    :cond_6
    invoke-virtual {v5}, Lx30;->next()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v6

    .line 203
    invoke-virtual {v5}, Lx30;->hasNext()Z

    .line 204
    .line 205
    .line 206
    move-result v7

    .line 207
    if-nez v7, :cond_7

    .line 208
    .line 209
    goto :goto_4

    .line 210
    :cond_7
    move-object v7, v6

    .line 211
    check-cast v7, Ljava/lang/reflect/Method;

    .line 212
    .line 213
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    invoke-static {v7}, Luv0;->δ(Ljava/lang/reflect/Method;)I

    .line 217
    .line 218
    .line 219
    move-result v7

    .line 220
    :cond_8
    invoke-virtual {v5}, Lx30;->next()Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v8

    .line 224
    move-object v9, v8

    .line 225
    check-cast v9, Ljava/lang/reflect/Method;

    .line 226
    .line 227
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 228
    .line 229
    .line 230
    invoke-static {v9}, Luv0;->δ(Ljava/lang/reflect/Method;)I

    .line 231
    .line 232
    .line 233
    move-result v9

    .line 234
    if-ge v7, v9, :cond_9

    .line 235
    .line 236
    move-object v6, v8

    .line 237
    move v7, v9

    .line 238
    :cond_9
    invoke-virtual {v5}, Lx30;->hasNext()Z

    .line 239
    .line 240
    .line 241
    move-result v8

    .line 242
    if-nez v8, :cond_8

    .line 243
    .line 244
    :goto_4
    check-cast v6, Ljava/lang/reflect/Method;

    .line 245
    .line 246
    if-eqz v6, :cond_5

    .line 247
    .line 248
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    goto/16 :goto_3

    .line 252
    .line 253
    :cond_a
    new-instance v3, Ljava/util/HashSet;

    .line 254
    .line 255
    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 256
    .line 257
    .line 258
    new-instance v4, Ljava/util/ArrayList;

    .line 259
    .line 260
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 264
    .line 265
    .line 266
    move-result-object v1

    .line 267
    :cond_b
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 268
    .line 269
    .line 270
    move-result v5

    .line 271
    if-eqz v5, :cond_c

    .line 272
    .line 273
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v5

    .line 277
    move-object v6, v5

    .line 278
    check-cast v6, Ljava/lang/reflect/Method;

    .line 279
    .line 280
    invoke-static {v6}, Luv0;->ε(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v6

    .line 284
    invoke-virtual {v3, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 285
    .line 286
    .line 287
    move-result v6

    .line 288
    if-eqz v6, :cond_b

    .line 289
    .line 290
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 291
    .line 292
    .line 293
    goto :goto_5

    .line 294
    :cond_c
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 295
    .line 296
    .line 297
    move-result v1

    .line 298
    if-nez v1, :cond_e

    .line 299
    .line 300
    if-eqz p1, :cond_d

    .line 301
    .line 302
    sget-object p0, Lox;->α:Ljava/lang/Object;

    .line 303
    .line 304
    invoke-static {v0, v4}, Lox;->χ(Lkx;Ljava/util/List;)V

    .line 305
    .line 306
    .line 307
    :cond_d
    return-object v4

    .line 308
    :cond_e
    sget-object v1, Ljz;->ε:Ljz;

    .line 309
    .line 310
    if-eqz p1, :cond_12

    .line 311
    .line 312
    sget-object p1, Lox;->α:Ljava/lang/Object;

    .line 313
    .line 314
    sget-object p1, Lox;->ι:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 315
    .line 316
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 317
    .line 318
    .line 319
    move-result p1

    .line 320
    if-nez p1, :cond_f

    .line 321
    .line 322
    goto :goto_7

    .line 323
    :cond_f
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 324
    .line 325
    .line 326
    move-result-object p1

    .line 327
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 328
    .line 329
    .line 330
    move-result-object v3

    .line 331
    invoke-static {p1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 332
    .line 333
    .line 334
    move-result p1

    .line 335
    if-eqz p1, :cond_10

    .line 336
    .line 337
    const-string p0, "rf5644a5272eb2eef"

    .line 338
    .line 339
    const-string p1, "skip feed DexKit scan on main thread"

    .line 340
    .line 341
    invoke-static {p0, p1}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 342
    .line 343
    .line 344
    return-object v1

    .line 345
    :cond_10
    new-instance p1, Lt20;

    .line 346
    .line 347
    const/16 v1, 0xd

    .line 348
    .line 349
    invoke-direct {p1, p0, v1}, Lt20;-><init>(Ljava/lang/ClassLoader;I)V

    .line 350
    .line 351
    .line 352
    const-string v1, "\u5b9a\u4f4d Feed \u957f\u6309\u9762\u677f\u5206\u7ec4 View \u5165\u53e3"

    .line 353
    .line 354
    invoke-static {v0, p0, v1, p1}, Lox;->λ(Lkx;Ljava/lang/ClassLoader;Ljava/lang/String;La80;)Ljava/util/List;

    .line 355
    .line 356
    .line 357
    move-result-object p0

    .line 358
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 359
    .line 360
    .line 361
    move-result-object p1

    .line 362
    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 363
    .line 364
    .line 365
    move-result v0

    .line 366
    if-eqz v0, :cond_11

    .line 367
    .line 368
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    check-cast v0, Ljava/lang/reflect/Method;

    .line 373
    .line 374
    invoke-virtual {v0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 375
    .line 376
    .line 377
    goto :goto_6

    .line 378
    :cond_11
    return-object p0

    .line 379
    :cond_12
    :goto_7
    return-object v1
.end method

.method public static γ(Ljava/lang/reflect/Method;Ltv0;)I
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const/16 v0, 0x258

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move v0, v1

    .line 16
    :goto_0
    const-class v2, Ljava/util/List;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-virtual {v2, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    add-int/lit16 v0, v0, 0x320

    .line 29
    .line 30
    :cond_1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    array-length v2, p0

    .line 35
    const/4 v3, 0x2

    .line 36
    if-ne v2, v3, :cond_2

    .line 37
    .line 38
    add-int/lit16 v0, v0, 0x12c

    .line 39
    .line 40
    :cond_2
    invoke-static {v1, p0}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    check-cast v1, Ljava/lang/Class;

    .line 45
    .line 46
    const/4 v2, 0x0

    .line 47
    if-eqz v1, :cond_3

    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    goto :goto_1

    .line 54
    :cond_3
    move-object v1, v2

    .line 55
    :goto_1
    iget-object v3, p1, Ltv0;->α:Ljava/lang/String;

    .line 56
    .line 57
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_4

    .line 62
    .line 63
    add-int/lit16 v0, v0, 0x5dc

    .line 64
    .line 65
    :cond_4
    const/4 v1, 0x1

    .line 66
    invoke-static {v1, p0}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    check-cast p0, Ljava/lang/Class;

    .line 71
    .line 72
    if-eqz p0, :cond_5

    .line 73
    .line 74
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    :cond_5
    iget-object p0, p1, Ltv0;->β:Ljava/lang/String;

    .line 79
    .line 80
    invoke-static {v2, p0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    if-eqz p0, :cond_6

    .line 85
    .line 86
    add-int/lit16 v0, v0, 0x5dc

    .line 87
    .line 88
    :cond_6
    return v0
.end method

.method public static δ(Ljava/lang/reflect/Method;)I
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "~78F34A746881AA3660EE86BE622F7993067D6CB566F11858AD9BFDFAF7546DEFBE6F7A699FA0B4E1E231EAB579946FE2D2FA5C5B0B85A1F36EBFE6A126665CE055B3E4F9F2C8200D94DA2CD0520C73EF472A0B678E1F90F349"

    .line 10
    .line 11
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    const/16 v0, 0x640

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v0, 0x0

    .line 25
    :goto_0
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    const-string v2, "~781A9FBE2FBD8F61F657275D326874C55508DE7AC4D364B88930CC7C2AF8B2F6F1F42FB5723DCF19FDB169E3B07C1571F28AB7C03C50DB95F93145BAB7A004FEEA08CD9ED47324A2FC64074299E44EC1B9FF3E0358910EF4B9C33D8620934304D760AC"

    .line 34
    .line 35
    invoke-static {v2}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    add-int/lit16 v0, v0, 0x708

    .line 46
    .line 47
    :cond_1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-nez v1, :cond_2

    .line 56
    .line 57
    add-int/lit16 v0, v0, 0x12c

    .line 58
    .line 59
    :cond_2
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    array-length v1, v1

    .line 67
    if-nez v1, :cond_3

    .line 68
    .line 69
    add-int/lit16 v0, v0, 0x190

    .line 70
    .line 71
    :cond_3
    const-class v1, Ljava/util/List;

    .line 72
    .line 73
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    invoke-virtual {v1, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    if-eqz p0, :cond_4

    .line 82
    .line 83
    add-int/lit16 v0, v0, 0x320

    .line 84
    .line 85
    :cond_4
    return v0
.end method

.method public static ε(Ljava/lang/reflect/Method;)Ljava/lang/String;
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const/16 v1, 0x23

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const/16 v1, 0x28

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    new-instance v2, Lgp0;

    .line 42
    .line 43
    const/16 v3, 0x1d

    .line 44
    .line 45
    invoke-direct {v2, v3}, Lgp0;-><init>(I)V

    .line 46
    .line 47
    .line 48
    const/16 v3, 0x1e

    .line 49
    .line 50
    const-string v4, ","

    .line 51
    .line 52
    const/4 v5, 0x0

    .line 53
    invoke-static {v1, v4, v5, v2, v3}, Lg7;->з([Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;La80;I)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    const-string v2, "):"

    .line 58
    .line 59
    invoke-static {v0, v1, v2, p0}, Llz1;->ρ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    return-object p0
.end method
