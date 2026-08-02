.class public final Lfx2;
.super Lgx2;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final d:Lfx2;

.field public static final e:I

.field public static final f:I

.field public static final g:Lwm0;

.field public static final h:Ljava/lang/String;

.field public static final i:Z

.field public static volatile j:Ljava/lang/Object;

.field public static final k:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final l:Lhx2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lfx2;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lvj;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lfx2;->d:Lfx2;

    .line 8
    .line 9
    const v0, 0x790b0225

    .line 10
    .line 11
    .line 12
    sput v0, Lfx2;->e:I

    .line 13
    .line 14
    const v0, 0x790b0226

    .line 15
    .line 16
    .line 17
    sput v0, Lfx2;->f:I

    .line 18
    .line 19
    sget-object v0, Lwm0;->i:Lwm0;

    .line 20
    .line 21
    sput-object v0, Lfx2;->g:Lwm0;

    .line 22
    .line 23
    const-string v0, "SwipeToQuoteMessage"

    .line 24
    .line 25
    sput-object v0, Lfx2;->h:Ljava/lang/String;

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    sput-boolean v0, Lfx2;->i:Z

    .line 29
    .line 30
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 31
    .line 32
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lfx2;->k:Ljava/util/concurrent/ConcurrentHashMap;

    .line 36
    .line 37
    new-instance v0, Lhn1;

    .line 38
    .line 39
    const/16 v1, 0x19

    .line 40
    .line 41
    invoke-direct {v0, v1}, Lhn1;-><init>(I)V

    .line 42
    .line 43
    .line 44
    new-instance v1, Lhx2;

    .line 45
    .line 46
    invoke-direct {v1, v0}, Lhx2;-><init>(Lxm0;)V

    .line 47
    .line 48
    .line 49
    sput-object v1, Lfx2;->l:Lhx2;

    .line 50
    .line 51
    return-void
.end method

.method public static q(Landroid/view/View;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->cancelLongPress()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-virtual {p0, v0}, Landroid/view/View;->setPressed(Z)V

    .line 6
    .line 7
    .line 8
    instance-of v1, p0, Landroid/view/ViewGroup;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    check-cast p0, Landroid/view/ViewGroup;

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    :goto_0
    if-ge v0, v1, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-static {v2}, Lfx2;->q(Landroid/view/View;)V

    .line 28
    .line 29
    .line 30
    add-int/lit8 v0, v0, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    return-void
.end method

.method public static r(Ljava/lang/Object;Ljava/lang/Object;)Lcx2;
    .locals 11

    .line 1
    const-class v0, Ljava/lang/Boolean;

    .line 2
    .line 3
    :try_start_0
    invoke-static {p0}, Lop0;->y(Ljava/lang/Object;)Ln4;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Ln4;->v()Lsg1;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Lzf1;->b()V

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-static {v2}, Lp40;->A(Lbt;)Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    if-nez v2, :cond_0

    .line 23
    .line 24
    move-object v2, v0

    .line 25
    :cond_0
    iput-object v2, v1, Lsg1;->C:Ljava/lang/Class;

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v1, v2}, Lsg1;->d([Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Lsg1;->c()Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-static {v1}, Ldu;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    check-cast v1, Lzg1;

    .line 47
    .line 48
    iget-object v1, v1, Lzg1;->j:Ljava/lang/reflect/Method;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :catchall_0
    move-exception v1

    .line 52
    new-instance v2, Lx92;

    .line 53
    .line 54
    invoke-direct {v2, v1}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 55
    .line 56
    .line 57
    move-object v1, v2

    .line 58
    :goto_0
    nop

    .line 59
    instance-of v2, v1, Lx92;

    .line 60
    .line 61
    const/4 v3, 0x0

    .line 62
    if-eqz v2, :cond_1

    .line 63
    .line 64
    move-object v1, v3

    .line 65
    :cond_1
    check-cast v1, Ljava/lang/reflect/Method;

    .line 66
    .line 67
    const/4 v2, 0x0

    .line 68
    if-eqz v1, :cond_2

    .line 69
    .line 70
    invoke-static {v1}, Lig1;->a(Ljava/lang/reflect/Member;)Z

    .line 71
    .line 72
    .line 73
    new-instance p0, Lcx2;

    .line 74
    .line 75
    invoke-direct {p0, v1, v2}, Lcx2;-><init>(Ljava/lang/reflect/Method;Z)V

    .line 76
    .line 77
    .line 78
    return-object p0

    .line 79
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-static {}, Leu;->E()Lpb1;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    :goto_1
    if-eqz v1, :cond_4

    .line 88
    .line 89
    const-class v5, Ljava/lang/Object;

    .line 90
    .line 91
    invoke-static {v5}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 92
    .line 93
    .line 94
    move-result-object v6

    .line 95
    invoke-static {v6}, Lp40;->A(Lbt;)Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    move-result-object v6

    .line 99
    if-nez v6, :cond_3

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_3
    move-object v5, v6

    .line 103
    :goto_2
    invoke-virtual {v1, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v5

    .line 107
    if-nez v5, :cond_4

    .line 108
    .line 109
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    invoke-static {v4, v5}, Liu;->h0(Ljava/util/AbstractCollection;[Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    goto :goto_1

    .line 124
    :cond_4
    invoke-static {v4}, Leu;->z(Lpb1;)Lpb1;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    invoke-virtual {v1, v2}, Lpb1;->listIterator(I)Ljava/util/ListIterator;

    .line 129
    .line 130
    .line 131
    move-result-object v4

    .line 132
    :cond_5
    move-object v5, v4

    .line 133
    check-cast v5, Lvs0;

    .line 134
    .line 135
    invoke-virtual {v5}, Lvs0;->hasNext()Z

    .line 136
    .line 137
    .line 138
    move-result v6

    .line 139
    sget-object v7, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 140
    .line 141
    sget-object v8, Lfx2;->d:Lfx2;

    .line 142
    .line 143
    const/4 v9, 0x1

    .line 144
    if-eqz v6, :cond_7

    .line 145
    .line 146
    invoke-virtual {v5}, Lvs0;->next()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v5

    .line 150
    move-object v6, v5

    .line 151
    check-cast v6, Ljava/lang/reflect/Method;

    .line 152
    .line 153
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 154
    .line 155
    .line 156
    move-result v10

    .line 157
    invoke-static {v10}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 158
    .line 159
    .line 160
    move-result v10

    .line 161
    if-nez v10, :cond_5

    .line 162
    .line 163
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    move-result-object v10

    .line 170
    invoke-static {v10, v7}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v10

    .line 174
    if-nez v10, :cond_6

    .line 175
    .line 176
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    move-result-object v10

    .line 180
    invoke-static {v10, v0}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result v10

    .line 184
    if-eqz v10, :cond_5

    .line 185
    .line 186
    :cond_6
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterCount()I

    .line 187
    .line 188
    .line 189
    move-result v10

    .line 190
    if-ne v10, v9, :cond_5

    .line 191
    .line 192
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    move-result-object v6

    .line 196
    aget-object v6, v6, v2

    .line 197
    .line 198
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    move-result-object v10

    .line 202
    invoke-virtual {v6, v10}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 203
    .line 204
    .line 205
    move-result v6

    .line 206
    if-eqz v6, :cond_5

    .line 207
    .line 208
    goto :goto_3

    .line 209
    :cond_7
    move-object v5, v3

    .line 210
    :goto_3
    check-cast v5, Ljava/lang/reflect/Method;

    .line 211
    .line 212
    if-eqz v5, :cond_8

    .line 213
    .line 214
    invoke-static {v5}, Lig1;->a(Ljava/lang/reflect/Member;)Z

    .line 215
    .line 216
    .line 217
    new-instance p0, Lcx2;

    .line 218
    .line 219
    invoke-direct {p0, v5, v2}, Lcx2;-><init>(Ljava/lang/reflect/Method;Z)V

    .line 220
    .line 221
    .line 222
    return-object p0

    .line 223
    :cond_8
    invoke-virtual {v1, v2}, Lpb1;->listIterator(I)Ljava/util/ListIterator;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    :cond_9
    move-object v4, v1

    .line 228
    check-cast v4, Lvs0;

    .line 229
    .line 230
    invoke-virtual {v4}, Lvs0;->hasNext()Z

    .line 231
    .line 232
    .line 233
    move-result v5

    .line 234
    if-eqz v5, :cond_b

    .line 235
    .line 236
    invoke-virtual {v4}, Lvs0;->next()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v4

    .line 240
    move-object v5, v4

    .line 241
    check-cast v5, Ljava/lang/reflect/Method;

    .line 242
    .line 243
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 244
    .line 245
    .line 246
    move-result v6

    .line 247
    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 248
    .line 249
    .line 250
    move-result v6

    .line 251
    if-nez v6, :cond_9

    .line 252
    .line 253
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 257
    .line 258
    .line 259
    move-result-object v6

    .line 260
    invoke-static {v6, v7}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 261
    .line 262
    .line 263
    move-result v6

    .line 264
    if-nez v6, :cond_a

    .line 265
    .line 266
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 267
    .line 268
    .line 269
    move-result-object v6

    .line 270
    invoke-static {v6, v0}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    move-result v6

    .line 274
    if-eqz v6, :cond_9

    .line 275
    .line 276
    :cond_a
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterCount()I

    .line 277
    .line 278
    .line 279
    move-result v6

    .line 280
    const/4 v10, 0x2

    .line 281
    if-ne v6, v10, :cond_9

    .line 282
    .line 283
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 284
    .line 285
    .line 286
    move-result-object v6

    .line 287
    aget-object v6, v6, v2

    .line 288
    .line 289
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 290
    .line 291
    .line 292
    move-result-object v10

    .line 293
    invoke-virtual {v6, v10}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 294
    .line 295
    .line 296
    move-result v6

    .line 297
    if-eqz v6, :cond_9

    .line 298
    .line 299
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 300
    .line 301
    .line 302
    move-result-object v5

    .line 303
    aget-object v5, v5, v9

    .line 304
    .line 305
    invoke-virtual {v5}, Ljava/lang/Class;->isPrimitive()Z

    .line 306
    .line 307
    .line 308
    move-result v5

    .line 309
    if-nez v5, :cond_9

    .line 310
    .line 311
    move-object v3, v4

    .line 312
    :cond_b
    check-cast v3, Ljava/lang/reflect/Method;

    .line 313
    .line 314
    if-eqz v3, :cond_c

    .line 315
    .line 316
    invoke-static {v3}, Lig1;->a(Ljava/lang/reflect/Member;)Z

    .line 317
    .line 318
    .line 319
    new-instance p0, Lcx2;

    .line 320
    .line 321
    invoke-direct {p0, v3, v9}, Lcx2;-><init>(Ljava/lang/reflect/Method;Z)V

    .line 322
    .line 323
    .line 324
    return-object p0

    .line 325
    :cond_c
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 326
    .line 327
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 328
    .line 329
    .line 330
    move-result-object p0

    .line 331
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object p0

    .line 335
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 336
    .line 337
    .line 338
    move-result-object p1

    .line 339
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object p1

    .line 343
    new-instance v1, Ljava/lang/StringBuilder;

    .line 344
    .line 345
    const-string v2, "Quote method not found: footer="

    .line 346
    .line 347
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 348
    .line 349
    .line 350
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 351
    .line 352
    .line 353
    const-string p0, ", message="

    .line 354
    .line 355
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 356
    .line 357
    .line 358
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 359
    .line 360
    .line 361
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 362
    .line 363
    .line 364
    move-result-object p0

    .line 365
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object p0

    .line 369
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 370
    .line 371
    .line 372
    throw v0
.end method

.method public static s(Landroid/view/View;Z)V
    .locals 2

    .line 1
    const-class v0, Ljava/lang/Boolean;

    .line 2
    .line 3
    :try_start_0
    invoke-static {p0}, Lop0;->y(Ljava/lang/Object;)Ln4;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ln4;->r()Lhi0;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {v0}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {v1}, Lp40;->A(Lbt;)Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-object v0, v1

    .line 23
    :goto_0
    iput-object v0, p0, Lhi0;->g:Ljava/lang/Class;

    .line 24
    .line 25
    invoke-virtual {p0}, Lhi0;->c()Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-static {p0}, Ldu;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    check-cast p0, Lpi0;

    .line 34
    .line 35
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p0}, Ltl;->R()V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lpi0;->j:Ljava/lang/reflect/Field;

    .line 43
    .line 44
    iget-object p0, p0, Ll01;->i:Ljava/lang/Object;

    .line 45
    .line 46
    invoke-virtual {v0, p0, p1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    sget-object p0, La83;->a:La83;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :catchall_0
    move-exception p0

    .line 53
    new-instance p1, Lx92;

    .line 54
    .line 55
    invoke-direct {p1, p0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 56
    .line 57
    .line 58
    move-object p0, p1

    .line 59
    :goto_1
    invoke-static {p0}, Ly92;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    if-eqz p0, :cond_1

    .line 64
    .line 65
    sget-object p1, Lfx2;->d:Lfx2;

    .line 66
    .line 67
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    sget-object p0, Lfx2;->h:Ljava/lang/String;

    .line 74
    .line 75
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    :cond_1
    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Lfx2;->h:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final e()Z
    .locals 0

    .line 1
    sget-boolean p0, Lfx2;->i:Z

    .line 2
    .line 3
    return p0
.end method

.method public final g()V
    .locals 9

    .line 1
    sget-object v0, Ljs;->d:Ljs;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, Ljs;->f:Lhx2;

    .line 7
    .line 8
    invoke-virtual {v0}, Lhx2;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/reflect/Method;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    new-instance v1, Lml2;

    .line 18
    .line 19
    const/16 v2, 0x1b

    .line 20
    .line 21
    invoke-direct {v1, v2}, Lml2;-><init>(I)V

    .line 22
    .line 23
    .line 24
    new-instance v2, Lkg3;

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    invoke-direct {v2, p0, v3, v1}, Lkg3;-><init>(Lvj;Lin0;Lin0;)V

    .line 28
    .line 29
    .line 30
    invoke-static {v0, v2}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    sget-object v0, Ljs;->h:Lhx2;

    .line 38
    .line 39
    invoke-virtual {v0}, Lhx2;->getValue()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    check-cast v0, Ljava/lang/reflect/Method;

    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    new-instance v1, Lml2;

    .line 49
    .line 50
    const/16 v2, 0x1d

    .line 51
    .line 52
    invoke-direct {v1, v2}, Lml2;-><init>(I)V

    .line 53
    .line 54
    .line 55
    new-instance v2, Lkg3;

    .line 56
    .line 57
    invoke-direct {v2, p0, v1, v3}, Lkg3;-><init>(Lvj;Lin0;Lin0;)V

    .line 58
    .line 59
    .line 60
    invoke-static {v0, v2}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    sget-object v0, Ljs;->g:Lhx2;

    .line 68
    .line 69
    invoke-virtual {v0}, Lhx2;->getValue()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    check-cast v0, Ljava/lang/Class;

    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    array-length v2, v1

    .line 83
    const/4 v4, 0x0

    .line 84
    :goto_0
    if-ge v4, v2, :cond_0

    .line 85
    .line 86
    aget-object v5, v1, v4

    .line 87
    .line 88
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    new-instance v6, Lml2;

    .line 92
    .line 93
    const/16 v7, 0x1c

    .line 94
    .line 95
    invoke-direct {v6, v7}, Lml2;-><init>(I)V

    .line 96
    .line 97
    .line 98
    new-instance v7, Lkg3;

    .line 99
    .line 100
    sget-object v8, Lfx2;->d:Lfx2;

    .line 101
    .line 102
    invoke-direct {v7, v8, v3, v6}, Lkg3;-><init>(Lvj;Lin0;Lin0;)V

    .line 103
    .line 104
    .line 105
    invoke-static {v5, v7}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    add-int/lit8 v4, v4, 0x1

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_0
    const-class v1, Landroid/view/ViewGroup;

    .line 116
    .line 117
    invoke-static {v1}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    invoke-static {v2}, Lp40;->A(Lbt;)Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    if-nez v2, :cond_1

    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_1
    move-object v1, v2

    .line 129
    :goto_1
    const-class v2, Landroid/view/MotionEvent;

    .line 130
    .line 131
    invoke-static {v2}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    invoke-static {v4}, Lp40;->A(Lbt;)Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    move-result-object v4

    .line 139
    if-nez v4, :cond_2

    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_2
    move-object v2, v4

    .line 143
    :goto_2
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    const-string v4, "dispatchTouchEvent"

    .line 148
    .line 149
    invoke-virtual {v1, v4, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    new-instance v2, Lq90;

    .line 157
    .line 158
    const/4 v4, 0x2

    .line 159
    invoke-direct {v2, v4, v0}, Lq90;-><init>(ILjava/lang/Class;)V

    .line 160
    .line 161
    .line 162
    new-instance v0, Lkg3;

    .line 163
    .line 164
    invoke-direct {v0, p0, v2, v3}, Lkg3;-><init>(Lvj;Lin0;Lin0;)V

    .line 165
    .line 166
    .line 167
    invoke-static {v1, v0}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    return-void
.end method

.method public final k()Ljava/lang/Integer;
    .locals 0

    .line 1
    sget p0, Lfx2;->f:I

    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final m()I
    .locals 0

    .line 1
    sget p0, Lfx2;->e:I

    .line 2
    .line 3
    return p0
.end method

.method public final n()Lwm0;
    .locals 0

    .line 1
    sget-object p0, Lfx2;->g:Lwm0;

    .line 2
    .line 3
    return-object p0
.end method
