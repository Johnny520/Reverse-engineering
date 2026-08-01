.class public final Landroidx/savedstate/Recreator;
.super Ljava/lang/Object;

# interfaces
.implements Lqq;


# instance fields
.field public final a:Lb20;


# direct methods
.method public constructor <init>(Lb20;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/savedstate/Recreator;->a:Lb20;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final b(Lsq;Lmq;)V
    .locals 12

    .line 1
    sget-object v0, Lmq;->ON_CREATE:Lmq;

    .line 2
    .line 3
    if-ne p2, v0, :cond_b

    .line 4
    .line 5
    invoke-interface {p1}, Lsq;->e()Landroidx/lifecycle/a;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1, p0}, Landroidx/lifecycle/a;->f(Lrq;)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Landroidx/savedstate/Recreator;->a:Lb20;

    .line 13
    .line 14
    invoke-interface {p1}, Lb20;->b()La3;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const-string p2, "androidx.savedstate.Restarter"

    .line 19
    .line 20
    invoke-virtual {p1, p2}, La3;->c(Ljava/lang/String;)Landroid/os/Bundle;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    if-nez p1, :cond_0

    .line 25
    .line 26
    goto/16 :goto_2

    .line 27
    .line 28
    :cond_0
    const-string p2, "classes_to_restore"

    .line 29
    .line 30
    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    if-eqz p1, :cond_a

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    const/4 v0, 0x0

    .line 41
    move v1, v0

    .line 42
    :cond_1
    :goto_0
    if-ge v1, p2, :cond_9

    .line 43
    .line 44
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    add-int/lit8 v1, v1, 0x1

    .line 49
    .line 50
    check-cast v2, Ljava/lang/String;

    .line 51
    .line 52
    :try_start_0
    const-class v3, Landroidx/savedstate/Recreator;

    .line 53
    .line 54
    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    invoke-static {v2, v0, v3}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    const-class v4, Lz10;

    .line 63
    .line 64
    invoke-virtual {v3, v4}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    const-string v4, "{\n                Class.\u2026class.java)\n            }"

    .line 69
    .line 70
    invoke-static {v4, v3}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_3

    .line 71
    .line 72
    .line 73
    const/4 v4, 0x0

    .line 74
    :try_start_1
    invoke-virtual {v3, v4}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 75
    .line 76
    .line 77
    move-result-object v3
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_2

    .line 78
    const/4 v5, 0x1

    .line 79
    invoke-virtual {v3, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 80
    .line 81
    .line 82
    :try_start_2
    invoke-virtual {v3, v4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    const-string v6, "{\n                constr\u2026wInstance()\n            }"

    .line 87
    .line 88
    invoke-static {v6, v3}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    check-cast v3, Lz10;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 92
    .line 93
    iget-object v2, p0, Landroidx/savedstate/Recreator;->a:Lb20;

    .line 94
    .line 95
    instance-of v3, v2, Lxa0;

    .line 96
    .line 97
    if-eqz v3, :cond_8

    .line 98
    .line 99
    move-object v3, v2

    .line 100
    check-cast v3, Lxa0;

    .line 101
    .line 102
    invoke-interface {v3}, Lxa0;->d()Lwa0;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    invoke-interface {v2}, Lb20;->b()La3;

    .line 107
    .line 108
    .line 109
    move-result-object v6

    .line 110
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    new-instance v7, Ljava/util/HashSet;

    .line 114
    .line 115
    iget-object v8, v3, Lwa0;->a:Ljava/util/LinkedHashMap;

    .line 116
    .line 117
    invoke-virtual {v8}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 118
    .line 119
    .line 120
    move-result-object v8

    .line 121
    invoke-direct {v7, v8}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v7}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 125
    .line 126
    .line 127
    move-result-object v7

    .line 128
    :cond_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 129
    .line 130
    .line 131
    move-result v8

    .line 132
    if-eqz v8, :cond_5

    .line 133
    .line 134
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v8

    .line 138
    check-cast v8, Ljava/lang/String;

    .line 139
    .line 140
    const-string v9, "key"

    .line 141
    .line 142
    invoke-static {v9, v8}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    iget-object v9, v3, Lwa0;->a:Ljava/util/LinkedHashMap;

    .line 146
    .line 147
    invoke-virtual {v9, v8}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v8

    .line 151
    check-cast v8, Lua0;

    .line 152
    .line 153
    invoke-static {v8}, Lmp;->d(Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    invoke-interface {v2}, Lsq;->e()Landroidx/lifecycle/a;

    .line 157
    .line 158
    .line 159
    move-result-object v9

    .line 160
    const-string v10, "registry"

    .line 161
    .line 162
    invoke-static {v10, v6}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    const-string v10, "lifecycle"

    .line 166
    .line 167
    invoke-static {v10, v9}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    const-string v10, "androidx.lifecycle.savedstate.vm.tag"

    .line 171
    .line 172
    iget-object v11, v8, Lua0;->a:Ljava/util/HashMap;

    .line 173
    .line 174
    if-nez v11, :cond_3

    .line 175
    .line 176
    move-object v8, v4

    .line 177
    goto :goto_1

    .line 178
    :cond_3
    monitor-enter v11

    .line 179
    :try_start_3
    iget-object v8, v8, Lua0;->a:Ljava/util/HashMap;

    .line 180
    .line 181
    invoke-virtual {v8, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v8

    .line 185
    monitor-exit v11
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 186
    :goto_1
    check-cast v8, Landroidx/lifecycle/SavedStateHandleController;

    .line 187
    .line 188
    if-eqz v8, :cond_2

    .line 189
    .line 190
    iget-boolean v10, v8, Landroidx/lifecycle/SavedStateHandleController;->a:Z

    .line 191
    .line 192
    if-nez v10, :cond_2

    .line 193
    .line 194
    if-eqz v10, :cond_4

    .line 195
    .line 196
    const-string p1, "Already attached to lifecycleOwner"

    .line 197
    .line 198
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 199
    .line 200
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    throw p2

    .line 204
    :cond_4
    iput-boolean v5, v8, Landroidx/lifecycle/SavedStateHandleController;->a:Z

    .line 205
    .line 206
    invoke-virtual {v9, v8}, Landroidx/lifecycle/a;->a(Lrq;)V

    .line 207
    .line 208
    .line 209
    throw v4

    .line 210
    :catchall_0
    move-exception p1

    .line 211
    :try_start_4
    monitor-exit v11
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 212
    throw p1

    .line 213
    :cond_5
    new-instance v2, Ljava/util/HashSet;

    .line 214
    .line 215
    iget-object v3, v3, Lwa0;->a:Ljava/util/LinkedHashMap;

    .line 216
    .line 217
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 218
    .line 219
    .line 220
    move-result-object v3

    .line 221
    invoke-direct {v2, v3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v2}, Ljava/util/HashSet;->isEmpty()Z

    .line 225
    .line 226
    .line 227
    move-result v2

    .line 228
    if-nez v2, :cond_1

    .line 229
    .line 230
    const-class v2, Ljq;

    .line 231
    .line 232
    iget-boolean v3, v6, La3;->e:Z

    .line 233
    .line 234
    if-eqz v3, :cond_7

    .line 235
    .line 236
    iget-object v3, v6, La3;->b:Ljava/lang/Object;

    .line 237
    .line 238
    check-cast v3, Ls2;

    .line 239
    .line 240
    if-nez v3, :cond_6

    .line 241
    .line 242
    new-instance v3, Ls2;

    .line 243
    .line 244
    invoke-direct {v3, v6}, Ls2;-><init>(La3;)V

    .line 245
    .line 246
    .line 247
    :cond_6
    iput-object v3, v6, La3;->b:Ljava/lang/Object;

    .line 248
    .line 249
    :try_start_5
    invoke-virtual {v2, v4}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    :try_end_5
    .catch Ljava/lang/NoSuchMethodException; {:try_start_5 .. :try_end_5} :catch_0

    .line 250
    .line 251
    .line 252
    iget-object v3, v6, La3;->b:Ljava/lang/Object;

    .line 253
    .line 254
    check-cast v3, Ls2;

    .line 255
    .line 256
    if-eqz v3, :cond_1

    .line 257
    .line 258
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v2

    .line 262
    iget-object v3, v3, Ls2;->b:Ljava/lang/Object;

    .line 263
    .line 264
    check-cast v3, Ljava/util/LinkedHashSet;

    .line 265
    .line 266
    invoke-interface {v3, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 267
    .line 268
    .line 269
    goto/16 :goto_0

    .line 270
    .line 271
    :catch_0
    move-exception p1

    .line 272
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 273
    .line 274
    new-instance v0, Ljava/lang/StringBuilder;

    .line 275
    .line 276
    const-string v1, "Class "

    .line 277
    .line 278
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v1

    .line 285
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 286
    .line 287
    .line 288
    const-string v1, " must have default constructor in order to be automatically recreated"

    .line 289
    .line 290
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 291
    .line 292
    .line 293
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    invoke-direct {p2, v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 298
    .line 299
    .line 300
    throw p2

    .line 301
    :cond_7
    const-string p1, "Can not perform this action after onSaveInstanceState"

    .line 302
    .line 303
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 304
    .line 305
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    throw p2

    .line 309
    :cond_8
    const-string p1, "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner"

    .line 310
    .line 311
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 312
    .line 313
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 314
    .line 315
    .line 316
    throw p2

    .line 317
    :catch_1
    move-exception p1

    .line 318
    new-instance p2, Ljava/lang/RuntimeException;

    .line 319
    .line 320
    const-string v0, "Failed to instantiate "

    .line 321
    .line 322
    invoke-static {v0, v2}, Lg40;->r(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    invoke-direct {p2, v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 327
    .line 328
    .line 329
    throw p2

    .line 330
    :catch_2
    move-exception p1

    .line 331
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 332
    .line 333
    new-instance v0, Ljava/lang/StringBuilder;

    .line 334
    .line 335
    const-string v1, "Class "

    .line 336
    .line 337
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 338
    .line 339
    .line 340
    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object v1

    .line 344
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 345
    .line 346
    .line 347
    const-string v1, " must have default constructor in order to be automatically recreated"

    .line 348
    .line 349
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 350
    .line 351
    .line 352
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    invoke-direct {p2, v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 357
    .line 358
    .line 359
    throw p2

    .line 360
    :catch_3
    move-exception p1

    .line 361
    new-instance p2, Ljava/lang/RuntimeException;

    .line 362
    .line 363
    const-string v0, "Class "

    .line 364
    .line 365
    const-string v1, " wasn\'t found"

    .line 366
    .line 367
    invoke-static {v0, v2, v1}, Lg40;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 368
    .line 369
    .line 370
    move-result-object v0

    .line 371
    invoke-direct {p2, v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 372
    .line 373
    .line 374
    throw p2

    .line 375
    :cond_9
    :goto_2
    return-void

    .line 376
    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 377
    .line 378
    const-string p2, "Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\""

    .line 379
    .line 380
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 381
    .line 382
    .line 383
    throw p1

    .line 384
    :cond_b
    new-instance p1, Ljava/lang/AssertionError;

    .line 385
    .line 386
    const-string p2, "Next event must be ON_CREATE"

    .line 387
    .line 388
    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 389
    .line 390
    .line 391
    throw p1
.end method
