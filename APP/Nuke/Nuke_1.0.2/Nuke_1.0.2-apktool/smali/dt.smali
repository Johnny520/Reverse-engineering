.class public abstract Ldt;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final a:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ldt;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 7
    .line 8
    return-void
.end method

.method public static final a(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    move-object p0, v0

    .line 5
    :cond_0
    if-eqz p0, :cond_1

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-static {p1, v1, p0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    goto :goto_0

    .line 13
    :cond_1
    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    :goto_0
    if-eqz p0, :cond_2

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_2
    const-string p0, "JVM class not resolved: "

    .line 21
    .line 22
    invoke-static {p0, p1}, Lc80;->u(Ljava/lang/String;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-object v0
.end method

.method public static final b(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_0

    .line 3
    .line 4
    array-length v1, p1

    .line 5
    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object v1, v0

    .line 15
    :goto_0
    if-nez v1, :cond_1

    .line 16
    .line 17
    move-object v1, v0

    .line 18
    :cond_1
    if-nez v1, :cond_3

    .line 19
    .line 20
    const/16 v1, 0x3f

    .line 21
    .line 22
    invoke-static {p1, v0, v0, v1}, Lmg;->p0([Ljava/lang/Object;Ljava/lang/String;Lin0;I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-static {p1}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    const-string p1, "(empty)"

    .line 33
    .line 34
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    const-string v1, "Could not find a suitable constructor for "

    .line 37
    .line 38
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string p0, " with arguments: "

    .line 45
    .line 46
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string p0, "."

    .line 53
    .line 54
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    new-instance p1, Ljava/lang/NoSuchMethodError;

    .line 62
    .line 63
    invoke-direct {p1, p0}, Ljava/lang/NoSuchMethodError;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw p1

    .line 67
    :cond_3
    return-object v1
.end method

.method public static c(Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    goto :goto_1

    .line 7
    :cond_0
    array-length v0, p1

    .line 8
    move v3, v2

    .line 9
    :goto_0
    if-ge v3, v0, :cond_17

    .line 10
    .line 11
    aget-object v4, p1, v3

    .line 12
    .line 13
    if-nez v4, :cond_1

    .line 14
    .line 15
    add-int/lit8 v3, v3, 0x1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    :goto_1
    new-instance v0, Ljava/util/ArrayList;

    .line 19
    .line 20
    array-length v3, p1

    .line 21
    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 22
    .line 23
    .line 24
    array-length v3, p1

    .line 25
    move v4, v2

    .line 26
    :goto_2
    if-ge v4, v3, :cond_3

    .line 27
    .line 28
    aget-object v5, p1, v4

    .line 29
    .line 30
    if-eqz v5, :cond_2

    .line 31
    .line 32
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    new-instance v6, Lp20;

    .line 37
    .line 38
    invoke-direct {v6, v5}, Lp20;-><init>(Ljava/lang/Class;)V

    .line 39
    .line 40
    .line 41
    goto :goto_3

    .line 42
    :cond_2
    sget-object v6, Lo20;->a:Lo20;

    .line 43
    .line 44
    :goto_3
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    add-int/lit8 v4, v4, 0x1

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_3
    new-instance v3, Lq20;

    .line 51
    .line 52
    invoke-direct {v3, p0, v0}, Lq20;-><init>(Ljava/lang/Class;Ljava/util/ArrayList;)V

    .line 53
    .line 54
    .line 55
    sget-object v0, Ldt;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 56
    .line 57
    invoke-virtual {v0, v3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    check-cast v4, Ljava/lang/reflect/Constructor;

    .line 62
    .line 63
    if-eqz v4, :cond_4

    .line 64
    .line 65
    invoke-static {v4, p1}, Ldt;->b(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    return-object p0

    .line 70
    :cond_4
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    array-length v4, p0

    .line 78
    if-nez v4, :cond_5

    .line 79
    .line 80
    sget-object p0, Lee0;->a:Lee0;

    .line 81
    .line 82
    goto :goto_4

    .line 83
    :cond_5
    new-instance v4, Lng;

    .line 84
    .line 85
    invoke-direct {v4, v2, p0}, Lng;-><init>(ILjava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    move-object p0, v4

    .line 89
    :goto_4
    new-instance v4, Lgs;

    .line 90
    .line 91
    const/4 v5, 0x2

    .line 92
    invoke-direct {v4, v5}, Lgs;-><init>(I)V

    .line 93
    .line 94
    .line 95
    new-instance v5, Lbj0;

    .line 96
    .line 97
    invoke-direct {v5, p0, v4, v2}, Lbj0;-><init>(Luo2;Lin0;I)V

    .line 98
    .line 99
    .line 100
    new-instance p0, Lv;

    .line 101
    .line 102
    const/4 v4, 0x7

    .line 103
    invoke-direct {p0, v4, p1}, Lv;-><init>(ILjava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    new-instance v4, Lbj0;

    .line 107
    .line 108
    invoke-direct {v4, v5, p0, v2}, Lbj0;-><init>(Luo2;Lin0;I)V

    .line 109
    .line 110
    .line 111
    new-instance p0, Laj0;

    .line 112
    .line 113
    invoke-direct {p0, v4}, Laj0;-><init>(Lbj0;)V

    .line 114
    .line 115
    .line 116
    :cond_6
    invoke-virtual {p0}, Laj0;->hasNext()Z

    .line 117
    .line 118
    .line 119
    move-result v4

    .line 120
    if-eqz v4, :cond_13

    .line 121
    .line 122
    invoke-virtual {p0}, Laj0;->next()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    move-object v5, v4

    .line 127
    check-cast v5, Ljava/lang/reflect/Constructor;

    .line 128
    .line 129
    invoke-virtual {v5}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    move-result-object v5

    .line 133
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    array-length v6, v5

    .line 137
    array-length v7, p1

    .line 138
    invoke-static {v6, v7}, Ljava/lang/Math;->min(II)I

    .line 139
    .line 140
    .line 141
    move-result v6

    .line 142
    new-instance v7, Ljava/util/ArrayList;

    .line 143
    .line 144
    invoke-direct {v7, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 145
    .line 146
    .line 147
    move v8, v2

    .line 148
    :goto_5
    if-ge v8, v6, :cond_7

    .line 149
    .line 150
    aget-object v9, v5, v8

    .line 151
    .line 152
    aget-object v10, p1, v8

    .line 153
    .line 154
    new-instance v11, Low1;

    .line 155
    .line 156
    invoke-direct {v11, v9, v10}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v7, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    add-int/lit8 v8, v8, 0x1

    .line 163
    .line 164
    goto :goto_5

    .line 165
    :cond_7
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 166
    .line 167
    .line 168
    move-result v5

    .line 169
    if-eqz v5, :cond_8

    .line 170
    .line 171
    goto/16 :goto_8

    .line 172
    .line 173
    :cond_8
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 174
    .line 175
    .line 176
    move-result-object v5

    .line 177
    :goto_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 178
    .line 179
    .line 180
    move-result v6

    .line 181
    if-eqz v6, :cond_14

    .line 182
    .line 183
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v6

    .line 187
    check-cast v6, Low1;

    .line 188
    .line 189
    iget-object v7, v6, Low1;->h:Ljava/lang/Object;

    .line 190
    .line 191
    check-cast v7, Ljava/lang/Class;

    .line 192
    .line 193
    iget-object v6, v6, Low1;->i:Ljava/lang/Object;

    .line 194
    .line 195
    if-nez v6, :cond_9

    .line 196
    .line 197
    invoke-virtual {v7}, Ljava/lang/Class;->isPrimitive()Z

    .line 198
    .line 199
    .line 200
    move-result v8

    .line 201
    if-nez v8, :cond_9

    .line 202
    .line 203
    goto :goto_6

    .line 204
    :cond_9
    if-eqz v6, :cond_6

    .line 205
    .line 206
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    move-result-object v6

    .line 210
    sget-object v8, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 211
    .line 212
    invoke-static {v7, v8}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    move-result v8

    .line 216
    if-eqz v8, :cond_a

    .line 217
    .line 218
    const-class v7, Ljava/lang/Boolean;

    .line 219
    .line 220
    goto :goto_7

    .line 221
    :cond_a
    sget-object v8, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 222
    .line 223
    invoke-static {v7, v8}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    move-result v8

    .line 227
    if-eqz v8, :cond_b

    .line 228
    .line 229
    const-class v7, Ljava/lang/Byte;

    .line 230
    .line 231
    goto :goto_7

    .line 232
    :cond_b
    sget-object v8, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 233
    .line 234
    invoke-static {v7, v8}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    move-result v8

    .line 238
    if-eqz v8, :cond_c

    .line 239
    .line 240
    const-class v7, Ljava/lang/Character;

    .line 241
    .line 242
    goto :goto_7

    .line 243
    :cond_c
    sget-object v8, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 244
    .line 245
    invoke-static {v7, v8}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    move-result v8

    .line 249
    if-eqz v8, :cond_d

    .line 250
    .line 251
    const-class v7, Ljava/lang/Short;

    .line 252
    .line 253
    goto :goto_7

    .line 254
    :cond_d
    sget-object v8, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 255
    .line 256
    invoke-static {v7, v8}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    move-result v8

    .line 260
    if-eqz v8, :cond_e

    .line 261
    .line 262
    const-class v7, Ljava/lang/Integer;

    .line 263
    .line 264
    goto :goto_7

    .line 265
    :cond_e
    sget-object v8, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 266
    .line 267
    invoke-static {v7, v8}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    move-result v8

    .line 271
    if-eqz v8, :cond_f

    .line 272
    .line 273
    const-class v7, Ljava/lang/Long;

    .line 274
    .line 275
    goto :goto_7

    .line 276
    :cond_f
    sget-object v8, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 277
    .line 278
    invoke-static {v7, v8}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 279
    .line 280
    .line 281
    move-result v8

    .line 282
    if-eqz v8, :cond_10

    .line 283
    .line 284
    const-class v7, Ljava/lang/Float;

    .line 285
    .line 286
    goto :goto_7

    .line 287
    :cond_10
    sget-object v8, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 288
    .line 289
    invoke-static {v7, v8}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    move-result v8

    .line 293
    if-eqz v8, :cond_11

    .line 294
    .line 295
    const-class v7, Ljava/lang/Double;

    .line 296
    .line 297
    goto :goto_7

    .line 298
    :cond_11
    sget-object v8, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 299
    .line 300
    invoke-static {v7, v8}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 301
    .line 302
    .line 303
    move-result v8

    .line 304
    if-eqz v8, :cond_12

    .line 305
    .line 306
    const-class v7, Ljava/lang/Void;

    .line 307
    .line 308
    :cond_12
    :goto_7
    invoke-virtual {v7, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 309
    .line 310
    .line 311
    move-result v6

    .line 312
    const/4 v7, 0x1

    .line 313
    if-ne v6, v7, :cond_6

    .line 314
    .line 315
    goto/16 :goto_6

    .line 316
    .line 317
    :cond_13
    move-object v4, v1

    .line 318
    :cond_14
    :goto_8
    check-cast v4, Ljava/lang/reflect/Constructor;

    .line 319
    .line 320
    if-eqz v4, :cond_16

    .line 321
    .line 322
    invoke-static {v4}, Lig1;->a(Ljava/lang/reflect/Member;)Z

    .line 323
    .line 324
    .line 325
    move-result p0

    .line 326
    if-eqz p0, :cond_15

    .line 327
    .line 328
    invoke-virtual {v0, v3, v4}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-object v1, v4

    .line 332
    goto :goto_9

    .line 333
    :cond_15
    const-string p0, "Failed to make the constructor \""

    .line 334
    .line 335
    const-string p1, "\" accessible. Please check if the constructor is accessible or if the security manager allows it."

    .line 336
    .line 337
    invoke-static {p0, v4, p1}, Lc80;->n(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 338
    .line 339
    .line 340
    return-object v1

    .line 341
    :cond_16
    :goto_9
    invoke-static {v1, p1}, Ldt;->b(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    move-result-object p0

    .line 345
    return-object p0

    .line 346
    :cond_17
    const-string p1, "Not allowed to create an instance with all null arguments for "

    .line 347
    .line 348
    const-string v0, "."

    .line 349
    .line 350
    invoke-static {p1, p0, v0}, Ls;->h(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 351
    .line 352
    .line 353
    return-object v1
.end method
