.class public final Landroidx/savedstate/Recreator;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛳᛸᛸᛶ;


# instance fields
.field public final ᲀᛲᛳᲀ:Lyyds/ᲁᛱᲀᛱ;


# direct methods
.method public constructor <init>(Lyyds/ᲁᛱᲀᛱ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/savedstate/Recreator;->ᲀᛲᛳᲀ:Lyyds/ᲁᛱᲀᛱ;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final ᲇᲈᛵᛷ(Lyyds/ᲁᲇᛴᲀ;Lyyds/ᛳᛷᛵᛷ;)V
    .locals 9

    .line 1
    sget-object v0, Lyyds/ᛳᛷᛵᛷ;->ON_CREATE:Lyyds/ᛳᛷᛵᛷ;

    .line 2
    .line 3
    if-ne p2, v0, :cond_a

    .line 4
    .line 5
    invoke-interface {p1}, Lyyds/ᲁᲇᛴᲀ;->ᛲᛴᛳᛲ()Landroidx/lifecycle/ᛲᲈᲁ;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1, p0}, Landroidx/lifecycle/ᛲᲈᲁ;->ᲇᲇᲇᛱ(Lyyds/ᛳᛶᲁᛴ;)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Landroidx/savedstate/Recreator;->ᲀᛲᛳᲀ:Lyyds/ᲁᛱᲀᛱ;

    .line 13
    .line 14
    invoke-interface {p1}, Lyyds/ᲁᛱᲀᛱ;->ᛵᛸᛸᛷ()Lyyds/ᛲᛴᛴᛱ;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const-string p2, "androidx.savedstate.Restarter"

    .line 19
    .line 20
    invoke-virtual {p1, p2}, Lyyds/ᛲᛴᛴᛱ;->ᲀᛲᛳᲀ(Ljava/lang/String;)Landroid/os/Bundle;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    if-nez p1, :cond_0

    .line 25
    .line 26
    goto/16 :goto_1

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
    if-eqz p1, :cond_9

    .line 35
    .line 36
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    if-eqz p2, :cond_8

    .line 45
    .line 46
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    check-cast p2, Ljava/lang/String;

    .line 51
    .line 52
    :try_start_0
    const-class v0, Landroidx/savedstate/Recreator;

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    const/4 v1, 0x0

    .line 59
    invoke-static {p2, v1, v0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    const-class v1, Lyyds/ᛲᲁᛵᛷ;

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_3

    .line 69
    const/4 v1, 0x0

    .line 70
    :try_start_1
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 71
    .line 72
    .line 73
    move-result-object v0
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_2

    .line 74
    const/4 v2, 0x1

    .line 75
    invoke-virtual {v0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 76
    .line 77
    .line 78
    :try_start_2
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    check-cast v0, Lyyds/ᛲᲁᛵᛷ;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 83
    .line 84
    iget-object p2, p0, Landroidx/savedstate/Recreator;->ᲀᛲᛳᲀ:Lyyds/ᲁᛱᲀᛱ;

    .line 85
    .line 86
    instance-of v0, p2, Lyyds/ᛳᛲᛷᛷ;

    .line 87
    .line 88
    if-eqz v0, :cond_7

    .line 89
    .line 90
    move-object v0, p2

    .line 91
    check-cast v0, Lyyds/ᛳᛲᛷᛷ;

    .line 92
    .line 93
    invoke-interface {v0}, Lyyds/ᛳᛲᛷᛷ;->ᲇᲈᛵᛷ()Lyyds/ᲁᛵᛱᲇ;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-interface {p2}, Lyyds/ᲁᛱᲀᛱ;->ᛵᛸᛸᛷ()Lyyds/ᛲᛴᛴᛱ;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    new-instance v4, Ljava/util/HashSet;

    .line 105
    .line 106
    iget-object v5, v0, Lyyds/ᲁᛵᛱᲇ;->ᛲᲈᲁ:Ljava/util/LinkedHashMap;

    .line 107
    .line 108
    invoke-virtual {v5}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    invoke-direct {v4, v5}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v4}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    :cond_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 120
    .line 121
    .line 122
    move-result v5

    .line 123
    if-eqz v5, :cond_4

    .line 124
    .line 125
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    check-cast v5, Ljava/lang/String;

    .line 130
    .line 131
    iget-object v6, v0, Lyyds/ᲁᛵᛱᲇ;->ᛲᲈᲁ:Ljava/util/LinkedHashMap;

    .line 132
    .line 133
    invoke-virtual {v6, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v5

    .line 137
    check-cast v5, Lyyds/ᛲᛸᛶᲁ;

    .line 138
    .line 139
    invoke-interface {p2}, Lyyds/ᲁᲇᛴᲀ;->ᛲᛴᛳᛲ()Landroidx/lifecycle/ᛲᲈᲁ;

    .line 140
    .line 141
    .line 142
    move-result-object v6

    .line 143
    const-string v7, "androidx.lifecycle.savedstate.vm.tag"

    .line 144
    .line 145
    iget-object v8, v5, Lyyds/ᛲᛸᛶᲁ;->ᛲᲈᲁ:Ljava/util/HashMap;

    .line 146
    .line 147
    monitor-enter v8

    .line 148
    :try_start_3
    iget-object v5, v5, Lyyds/ᛲᛸᛶᲁ;->ᛲᲈᲁ:Ljava/util/HashMap;

    .line 149
    .line 150
    invoke-virtual {v5, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v5

    .line 154
    monitor-exit v8
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 155
    check-cast v5, Landroidx/lifecycle/SavedStateHandleController;

    .line 156
    .line 157
    if-eqz v5, :cond_2

    .line 158
    .line 159
    iget-boolean v7, v5, Landroidx/lifecycle/SavedStateHandleController;->ᲀᛲᛳᲀ:Z

    .line 160
    .line 161
    if-nez v7, :cond_2

    .line 162
    .line 163
    if-eqz v7, :cond_3

    .line 164
    .line 165
    const-string p0, "Already attached to lifecycleOwner"

    .line 166
    .line 167
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    return-void

    .line 171
    :cond_3
    iput-boolean v2, v5, Landroidx/lifecycle/SavedStateHandleController;->ᲀᛲᛳᲀ:Z

    .line 172
    .line 173
    invoke-virtual {v6, v5}, Landroidx/lifecycle/ᛲᲈᲁ;->ᛲᲈᲁ(Lyyds/ᛳᛶᲁᛴ;)V

    .line 174
    .line 175
    .line 176
    throw v1

    .line 177
    :catchall_0
    move-exception p0

    .line 178
    :try_start_4
    monitor-exit v8
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 179
    throw p0

    .line 180
    :cond_4
    new-instance p2, Ljava/util/HashSet;

    .line 181
    .line 182
    iget-object v0, v0, Lyyds/ᲁᛵᛱᲇ;->ᛲᲈᲁ:Ljava/util/LinkedHashMap;

    .line 183
    .line 184
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    invoke-direct {p2, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {p2}, Ljava/util/HashSet;->isEmpty()Z

    .line 192
    .line 193
    .line 194
    move-result p2

    .line 195
    if-nez p2, :cond_1

    .line 196
    .line 197
    const-class p2, Lyyds/ᛵᛲᛱᛶ;

    .line 198
    .line 199
    iget-boolean v0, v3, Lyyds/ᛲᛴᛴᛱ;->ᛲᛴᛳᛲ:Z

    .line 200
    .line 201
    if-eqz v0, :cond_6

    .line 202
    .line 203
    iget-object v0, v3, Lyyds/ᛲᛴᛴᛱ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 204
    .line 205
    check-cast v0, Lyyds/ᛵᛸᲇᛵ;

    .line 206
    .line 207
    if-nez v0, :cond_5

    .line 208
    .line 209
    new-instance v0, Lyyds/ᛵᛸᲇᛵ;

    .line 210
    .line 211
    invoke-direct {v0, v3}, Lyyds/ᛵᛸᲇᛵ;-><init>(Lyyds/ᛲᛴᛴᛱ;)V

    .line 212
    .line 213
    .line 214
    :cond_5
    iput-object v0, v3, Lyyds/ᛲᛴᛴᛱ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 215
    .line 216
    :try_start_5
    invoke-virtual {p2, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    :try_end_5
    .catch Ljava/lang/NoSuchMethodException; {:try_start_5 .. :try_end_5} :catch_0

    .line 217
    .line 218
    .line 219
    iget-object v0, v3, Lyyds/ᛲᛴᛴᛱ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 220
    .line 221
    check-cast v0, Lyyds/ᛵᛸᲇᛵ;

    .line 222
    .line 223
    if-eqz v0, :cond_1

    .line 224
    .line 225
    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object p2

    .line 229
    iget-object v0, v0, Lyyds/ᛵᛸᲇᛵ;->ᛲᲈᲁ:Ljava/util/LinkedHashSet;

    .line 230
    .line 231
    invoke-interface {v0, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    goto/16 :goto_0

    .line 235
    .line 236
    :catch_0
    move-exception p0

    .line 237
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 238
    .line 239
    const-string v0, "Class "

    .line 240
    .line 241
    invoke-virtual {p2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object p2

    .line 245
    new-instance v1, Ljava/lang/StringBuilder;

    .line 246
    .line 247
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    const-string p2, " must have default constructor in order to be automatically recreated"

    .line 254
    .line 255
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object p2

    .line 262
    invoke-direct {p1, p2, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 263
    .line 264
    .line 265
    throw p1

    .line 266
    :cond_6
    const-string p0, "Can not perform this action after onSaveInstanceState"

    .line 267
    .line 268
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    return-void

    .line 272
    :cond_7
    const-string p0, "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner"

    .line 273
    .line 274
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    return-void

    .line 278
    :catch_1
    move-exception p0

    .line 279
    new-instance p1, Ljava/lang/RuntimeException;

    .line 280
    .line 281
    new-instance v0, Ljava/lang/StringBuilder;

    .line 282
    .line 283
    const-string v1, "Failed to instantiate "

    .line 284
    .line 285
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 289
    .line 290
    .line 291
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object p2

    .line 295
    invoke-direct {p1, p2, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 296
    .line 297
    .line 298
    throw p1

    .line 299
    :catch_2
    move-exception p0

    .line 300
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 301
    .line 302
    const-string p2, "Class "

    .line 303
    .line 304
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    new-instance v1, Ljava/lang/StringBuilder;

    .line 309
    .line 310
    invoke-direct {v1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 314
    .line 315
    .line 316
    const-string p2, " must have default constructor in order to be automatically recreated"

    .line 317
    .line 318
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 319
    .line 320
    .line 321
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object p2

    .line 325
    invoke-direct {p1, p2, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 326
    .line 327
    .line 328
    throw p1

    .line 329
    :catch_3
    move-exception p0

    .line 330
    const-string p1, "Class "

    .line 331
    .line 332
    const-string v0, " wasn\'t found"

    .line 333
    .line 334
    invoke-static {p1, p2, v0}, Lyyds/ᲀᲁᲈᲇ;->ᛷᛲᲈᛱ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object p1

    .line 338
    invoke-static {p1, p0}, Lyyds/ᛷᲈᲈᛶ;->ᛷᲈᲈᲁ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 339
    .line 340
    .line 341
    :cond_8
    :goto_1
    return-void

    .line 342
    :cond_9
    const-string p0, "Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\""

    .line 343
    .line 344
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 345
    .line 346
    .line 347
    return-void

    .line 348
    :cond_a
    new-instance p0, Ljava/lang/AssertionError;

    .line 349
    .line 350
    const-string p1, "Next event must be ON_CREATE"

    .line 351
    .line 352
    invoke-direct {p0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 353
    .line 354
    .line 355
    throw p0
.end method
