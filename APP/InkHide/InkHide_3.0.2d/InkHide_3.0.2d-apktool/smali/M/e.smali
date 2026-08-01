.class public final LM/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public b:Z

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LM/f;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LM/e;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM/e;->c:Ljava/lang/Object;

    .line 2
    new-instance p1, LM/d;

    invoke-direct {p1}, LM/d;-><init>()V

    iput-object p1, p0, LM/e;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/util/HashMap;ZLjava/util/ArrayList;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LM/e;->a:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, LM/e;->c:Ljava/lang/Object;

    .line 5
    iput-boolean p2, p0, LM/e;->b:Z

    .line 6
    iput-object p3, p0, LM/e;->d:Ljava/lang/Object;

    return-void
.end method

.method public static a(Ljava/lang/Class;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->getModifiers()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isInterface(I)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const-string v0, "Interfaces can\'t be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: "

    .line 16
    .line 17
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :cond_0
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    const-string v0, "Abstract classes can\'t be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Class name: "

    .line 33
    .line 34
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :cond_1
    const/4 p0, 0x0

    .line 40
    return-object p0
.end method


# virtual methods
.method public b(La0/a;)LV/p;
    .locals 9

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object v3, p0, LM/e;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v3, Ljava/util/HashMap;

    .line 8
    .line 9
    iget-object v4, p1, La0/a;->b:Ljava/lang/reflect/Type;

    .line 10
    .line 11
    invoke-virtual {v3, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    if-nez v5, :cond_13

    .line 16
    .line 17
    iget-object p1, p1, La0/a;->a:Ljava/lang/Class;

    .line 18
    .line 19
    invoke-virtual {v3, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    if-nez v3, :cond_12

    .line 24
    .line 25
    const-class v3, Ljava/util/EnumSet;

    .line 26
    .line 27
    invoke-virtual {v3, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    const/4 v5, 0x0

    .line 32
    if-eqz v3, :cond_0

    .line 33
    .line 34
    new-instance v3, LV/f;

    .line 35
    .line 36
    invoke-direct {v3, v4, v2}, LV/f;-><init>(Ljava/lang/reflect/Type;I)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const-class v3, Ljava/util/EnumMap;

    .line 41
    .line 42
    if-ne p1, v3, :cond_1

    .line 43
    .line 44
    new-instance v3, LV/f;

    .line 45
    .line 46
    invoke-direct {v3, v4, v1}, LV/f;-><init>(Ljava/lang/reflect/Type;I)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    move-object v3, v5

    .line 51
    :goto_0
    if-eqz v3, :cond_2

    .line 52
    .line 53
    return-object v3

    .line 54
    :cond_2
    iget-object v3, p0, LM/e;->d:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v3, Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-static {v3}, LV/d;->e(Ljava/util/ArrayList;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/Class;->getModifiers()I

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    invoke-static {v3}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-eqz v3, :cond_3

    .line 70
    .line 71
    :catch_0
    move-object v3, v5

    .line 72
    goto :goto_2

    .line 73
    :cond_3
    :try_start_0
    invoke-virtual {p1, v5}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 74
    .line 75
    .line 76
    move-result-object v3
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 77
    sget-object v6, LY/c;->a:LD/h;

    .line 78
    .line 79
    :try_start_1
    invoke-virtual {v3, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 80
    .line 81
    .line 82
    move-object v6, v5

    .line 83
    goto :goto_1

    .line 84
    :catch_1
    move-exception v6

    .line 85
    new-instance v7, Ljava/lang/StringBuilder;

    .line 86
    .line 87
    const-string v8, "Failed making constructor \'"

    .line 88
    .line 89
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-static {v3}, LY/c;->b(Ljava/lang/reflect/Constructor;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v8

    .line 96
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    const-string v8, "\' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: "

    .line 100
    .line 101
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v6}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v6

    .line 115
    :goto_1
    if-eqz v6, :cond_4

    .line 116
    .line 117
    new-instance v3, LV/e;

    .line 118
    .line 119
    const/4 v7, 0x2

    .line 120
    invoke-direct {v3, v7, v6}, LV/e;-><init>(ILjava/lang/String;)V

    .line 121
    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_4
    new-instance v6, LC/j;

    .line 125
    .line 126
    invoke-direct {v6, v0, v3}, LC/j;-><init>(ILjava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    move-object v3, v6

    .line 130
    :goto_2
    if-eqz v3, :cond_5

    .line 131
    .line 132
    return-object v3

    .line 133
    :cond_5
    const-class v3, Ljava/util/Collection;

    .line 134
    .line 135
    invoke-virtual {v3, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 136
    .line 137
    .line 138
    move-result v3

    .line 139
    if-eqz v3, :cond_9

    .line 140
    .line 141
    const-class v3, Ljava/util/SortedSet;

    .line 142
    .line 143
    invoke-virtual {v3, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 144
    .line 145
    .line 146
    move-result v3

    .line 147
    if-eqz v3, :cond_6

    .line 148
    .line 149
    new-instance v5, LG/d;

    .line 150
    .line 151
    invoke-direct {v5, v0}, LG/d;-><init>(I)V

    .line 152
    .line 153
    .line 154
    goto/16 :goto_3

    .line 155
    .line 156
    :cond_6
    const-class v0, Ljava/util/Set;

    .line 157
    .line 158
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    if-eqz v0, :cond_7

    .line 163
    .line 164
    new-instance v5, LG/d;

    .line 165
    .line 166
    const/16 v0, 0x9

    .line 167
    .line 168
    invoke-direct {v5, v0}, LG/d;-><init>(I)V

    .line 169
    .line 170
    .line 171
    goto/16 :goto_3

    .line 172
    .line 173
    :cond_7
    const-class v0, Ljava/util/Queue;

    .line 174
    .line 175
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 176
    .line 177
    .line 178
    move-result v0

    .line 179
    if-eqz v0, :cond_8

    .line 180
    .line 181
    new-instance v5, LG/d;

    .line 182
    .line 183
    const/16 v0, 0xa

    .line 184
    .line 185
    invoke-direct {v5, v0}, LG/d;-><init>(I)V

    .line 186
    .line 187
    .line 188
    goto/16 :goto_3

    .line 189
    .line 190
    :cond_8
    new-instance v5, LG/d;

    .line 191
    .line 192
    const/16 v0, 0xb

    .line 193
    .line 194
    invoke-direct {v5, v0}, LG/d;-><init>(I)V

    .line 195
    .line 196
    .line 197
    goto :goto_3

    .line 198
    :cond_9
    const-class v0, Ljava/util/Map;

    .line 199
    .line 200
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 201
    .line 202
    .line 203
    move-result v0

    .line 204
    if-eqz v0, :cond_e

    .line 205
    .line 206
    const-class v0, Ljava/util/concurrent/ConcurrentNavigableMap;

    .line 207
    .line 208
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 209
    .line 210
    .line 211
    move-result v0

    .line 212
    if-eqz v0, :cond_a

    .line 213
    .line 214
    new-instance v5, LG/d;

    .line 215
    .line 216
    const/16 v0, 0xc

    .line 217
    .line 218
    invoke-direct {v5, v0}, LG/d;-><init>(I)V

    .line 219
    .line 220
    .line 221
    goto :goto_3

    .line 222
    :cond_a
    const-class v0, Ljava/util/concurrent/ConcurrentMap;

    .line 223
    .line 224
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 225
    .line 226
    .line 227
    move-result v0

    .line 228
    if-eqz v0, :cond_b

    .line 229
    .line 230
    new-instance v5, LG/d;

    .line 231
    .line 232
    const/16 v0, 0xd

    .line 233
    .line 234
    invoke-direct {v5, v0}, LG/d;-><init>(I)V

    .line 235
    .line 236
    .line 237
    goto :goto_3

    .line 238
    :cond_b
    const-class v0, Ljava/util/SortedMap;

    .line 239
    .line 240
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 241
    .line 242
    .line 243
    move-result v0

    .line 244
    if-eqz v0, :cond_c

    .line 245
    .line 246
    new-instance v5, LG/d;

    .line 247
    .line 248
    const/16 v0, 0xe

    .line 249
    .line 250
    invoke-direct {v5, v0}, LG/d;-><init>(I)V

    .line 251
    .line 252
    .line 253
    goto :goto_3

    .line 254
    :cond_c
    instance-of v0, v4, Ljava/lang/reflect/ParameterizedType;

    .line 255
    .line 256
    if-eqz v0, :cond_d

    .line 257
    .line 258
    check-cast v4, Ljava/lang/reflect/ParameterizedType;

    .line 259
    .line 260
    invoke-interface {v4}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    aget-object v0, v0, v2

    .line 265
    .line 266
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    invoke-static {v0}, LV/d;->a(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    invoke-static {v0}, LV/d;->g(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 274
    .line 275
    .line 276
    move-result-object v3

    .line 277
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 278
    .line 279
    .line 280
    const-class v0, Ljava/lang/String;

    .line 281
    .line 282
    invoke-virtual {v0, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 283
    .line 284
    .line 285
    move-result v0

    .line 286
    if-nez v0, :cond_d

    .line 287
    .line 288
    new-instance v5, LG/d;

    .line 289
    .line 290
    const/16 v0, 0xf

    .line 291
    .line 292
    invoke-direct {v5, v0}, LG/d;-><init>(I)V

    .line 293
    .line 294
    .line 295
    goto :goto_3

    .line 296
    :cond_d
    new-instance v5, LG/d;

    .line 297
    .line 298
    const/16 v0, 0x10

    .line 299
    .line 300
    invoke-direct {v5, v0}, LG/d;-><init>(I)V

    .line 301
    .line 302
    .line 303
    :cond_e
    :goto_3
    if-eqz v5, :cond_f

    .line 304
    .line 305
    return-object v5

    .line 306
    :cond_f
    invoke-static {p1}, LM/e;->a(Ljava/lang/Class;)Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    if-eqz v0, :cond_10

    .line 311
    .line 312
    new-instance p1, LV/e;

    .line 313
    .line 314
    invoke-direct {p1, v1, v0}, LV/e;-><init>(ILjava/lang/String;)V

    .line 315
    .line 316
    .line 317
    return-object p1

    .line 318
    :cond_10
    iget-boolean v0, p0, LM/e;->b:Z

    .line 319
    .line 320
    if-eqz v0, :cond_11

    .line 321
    .line 322
    new-instance v0, LC/j;

    .line 323
    .line 324
    const/4 v1, 0x7

    .line 325
    invoke-direct {v0, v1, p1}, LC/j;-><init>(ILjava/lang/Object;)V

    .line 326
    .line 327
    .line 328
    goto :goto_4

    .line 329
    :cond_11
    new-instance v0, Ljava/lang/StringBuilder;

    .line 330
    .line 331
    const-string v1, "Unable to create instance of "

    .line 332
    .line 333
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 334
    .line 335
    .line 336
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 337
    .line 338
    .line 339
    const-string p1, "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem."

    .line 340
    .line 341
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 342
    .line 343
    .line 344
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object p1

    .line 348
    new-instance v0, LV/e;

    .line 349
    .line 350
    invoke-direct {v0, v2, p1}, LV/e;-><init>(ILjava/lang/String;)V

    .line 351
    .line 352
    .line 353
    :goto_4
    return-object v0

    .line 354
    :cond_12
    new-instance p1, Ljava/lang/ClassCastException;

    .line 355
    .line 356
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 357
    .line 358
    .line 359
    throw p1

    .line 360
    :cond_13
    new-instance p1, Ljava/lang/ClassCastException;

    .line 361
    .line 362
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 363
    .line 364
    .line 365
    throw p1
.end method

.method public c()V
    .locals 4

    .line 1
    iget-object v0, p0, LM/e;->c:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/lifecycle/s;->c()Landroidx/lifecycle/u;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, v1, Landroidx/lifecycle/u;->c:Landroidx/lifecycle/n;

    .line 8
    .line 9
    sget-object v3, Landroidx/lifecycle/n;->b:Landroidx/lifecycle/n;

    .line 10
    .line 11
    if-ne v2, v3, :cond_1

    .line 12
    .line 13
    new-instance v2, Landroidx/savedstate/Recreator;

    .line 14
    .line 15
    invoke-direct {v2, v0}, Landroidx/savedstate/Recreator;-><init>(LM/f;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v2}, Landroidx/lifecycle/u;->a(Landroidx/lifecycle/r;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, LM/e;->d:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, LM/d;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    iget-boolean v2, v0, LM/d;->a:Z

    .line 29
    .line 30
    if-nez v2, :cond_0

    .line 31
    .line 32
    new-instance v2, LM/a;

    .line 33
    .line 34
    invoke-direct {v2, v0}, LM/a;-><init>(LM/d;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, v2}, Landroidx/lifecycle/u;->a(Landroidx/lifecycle/r;)V

    .line 38
    .line 39
    .line 40
    const/4 v1, 0x1

    .line 41
    iput-boolean v1, v0, LM/d;->a:Z

    .line 42
    .line 43
    iput-boolean v1, p0, LM/e;->b:Z

    .line 44
    .line 45
    return-void

    .line 46
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string v1, "SavedStateRegistry was already attached."

    .line 49
    .line 50
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw v0

    .line 54
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 55
    .line 56
    const-string v1, "Restarter must be created only during owner\'s initialization stage"

    .line 57
    .line 58
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw v0
.end method

.method public d(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, LM/e;->b:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, LM/e;->c()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, LM/e;->c:Ljava/lang/Object;

    .line 9
    .line 10
    invoke-interface {v0}, Landroidx/lifecycle/s;->c()Landroidx/lifecycle/u;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v1, v0, Landroidx/lifecycle/u;->c:Landroidx/lifecycle/n;

    .line 15
    .line 16
    sget-object v2, Landroidx/lifecycle/n;->d:Landroidx/lifecycle/n;

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-gez v1, :cond_4

    .line 23
    .line 24
    iget-object v0, p0, LM/e;->d:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, LM/d;

    .line 27
    .line 28
    iget-boolean v1, v0, LM/d;->a:Z

    .line 29
    .line 30
    if-eqz v1, :cond_3

    .line 31
    .line 32
    iget-boolean v1, v0, LM/d;->b:Z

    .line 33
    .line 34
    if-nez v1, :cond_2

    .line 35
    .line 36
    if-eqz p1, :cond_1

    .line 37
    .line 38
    const-string v1, "androidx.lifecycle.BundlableSavedStateRegistry.key"

    .line 39
    .line 40
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    goto :goto_0

    .line 45
    :cond_1
    const/4 p1, 0x0

    .line 46
    :goto_0
    iput-object p1, v0, LM/d;->e:Landroid/os/Parcelable;

    .line 47
    .line 48
    const/4 p1, 0x1

    .line 49
    iput-boolean p1, v0, LM/d;->b:Z

    .line 50
    .line 51
    return-void

    .line 52
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 53
    .line 54
    const-string v0, "SavedStateRegistry was already restored."

    .line 55
    .line 56
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p1

    .line 60
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 61
    .line 62
    const-string v0, "You must call performAttach() before calling performRestore(Bundle)."

    .line 63
    .line 64
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw p1

    .line 68
    :cond_4
    new-instance p1, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    const-string v1, "performRestore cannot be called when owner is "

    .line 71
    .line 72
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    iget-object v0, v0, Landroidx/lifecycle/u;->c:Landroidx/lifecycle/n;

    .line 76
    .line 77
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 85
    .line 86
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    throw v0
.end method

.method public e(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    iget-object v0, p0, LM/e;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LM/d;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    new-instance v1, Landroid/os/Bundle;

    .line 9
    .line 10
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 11
    .line 12
    .line 13
    iget-object v2, v0, LM/d;->e:Landroid/os/Parcelable;

    .line 14
    .line 15
    check-cast v2, Landroid/os/Bundle;

    .line 16
    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    iget-object v0, v0, LM/d;->d:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Lk/f;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    new-instance v2, Lk/d;

    .line 30
    .line 31
    invoke-direct {v2, v0}, Lk/d;-><init>(Lk/f;)V

    .line 32
    .line 33
    .line 34
    iget-object v0, v0, Lk/f;->c:Ljava/util/WeakHashMap;

    .line 35
    .line 36
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 37
    .line 38
    invoke-virtual {v0, v2, v3}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    :goto_0
    invoke-virtual {v2}, Lk/d;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    invoke-virtual {v2}, Lk/d;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, Ljava/util/Map$Entry;

    .line 52
    .line 53
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    check-cast v3, Ljava/lang/String;

    .line 58
    .line 59
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    check-cast v0, LM/c;

    .line 64
    .line 65
    invoke-interface {v0}, LM/c;->a()Landroid/os/Bundle;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-virtual {v1, v3, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_1
    invoke-virtual {v1}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-nez v0, :cond_2

    .line 78
    .line 79
    const-string v0, "androidx.lifecycle.BundlableSavedStateRegistry.key"

    .line 80
    .line 81
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 82
    .line 83
    .line 84
    :cond_2
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, LM/e;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    iget-object v0, p0, LM/e;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Ljava/util/HashMap;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
