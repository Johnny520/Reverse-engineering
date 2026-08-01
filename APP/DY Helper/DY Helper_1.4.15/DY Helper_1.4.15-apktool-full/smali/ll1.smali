.class public final Lll1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lfr0;


# instance fields
.field public final synthetic ε:I

.field public final ζ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lll1;->ε:I

    .line 2
    .line 3
    iput-object p2, p0, Lll1;->ζ:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final κ(Lhr0;Lbr0;)V
    .locals 4

    .line 1
    iget v0, p0, Lll1;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object v0, Lbr0;->ON_CREATE:Lbr0;

    .line 7
    .line 8
    if-ne p2, v0, :cond_2

    .line 9
    .line 10
    invoke-interface {p1}, Lhr0;->δ()Ljr0;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p1, p0}, Ljr0;->ζ(Lgr0;)V

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, Lll1;->ζ:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, Leq1;

    .line 20
    .line 21
    iget-boolean p1, p0, Leq1;->β:Z

    .line 22
    .line 23
    if-nez p1, :cond_3

    .line 24
    .line 25
    iget-object p1, p0, Leq1;->α:Ln5;

    .line 26
    .line 27
    const-string p2, "androidx.lifecycle.internal.SavedStateHandlesProvider"

    .line 28
    .line 29
    invoke-virtual {p1, p2}, Ln5;->ν(Ljava/lang/String;)Landroid/os/Bundle;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    const/4 p2, 0x0

    .line 34
    new-array v0, p2, [Ll91;

    .line 35
    .line 36
    invoke-static {v0, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    check-cast p2, [Ll91;

    .line 41
    .line 42
    invoke-static {p2}, Ljx0;->κ([Ll91;)Landroid/os/Bundle;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    iget-object v0, p0, Leq1;->γ:Landroid/os/Bundle;

    .line 47
    .line 48
    if-eqz v0, :cond_0

    .line 49
    .line 50
    invoke-virtual {p2, v0}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 51
    .line 52
    .line 53
    :cond_0
    if-eqz p1, :cond_1

    .line 54
    .line 55
    invoke-virtual {p2, p1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 56
    .line 57
    .line 58
    :cond_1
    iput-object p2, p0, Leq1;->γ:Landroid/os/Bundle;

    .line 59
    .line 60
    const/4 p1, 0x1

    .line 61
    iput-boolean p1, p0, Leq1;->β:Z

    .line 62
    .line 63
    iget-object p0, p0, Leq1;->δ:Lh22;

    .line 64
    .line 65
    invoke-virtual {p0}, Lh22;->getValue()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    check-cast p0, Lfq1;

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_2
    const-string p0, "Next event must be ON_CREATE, it was "

    .line 73
    .line 74
    invoke-static {p2, p0}, Lγ;->υ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    :cond_3
    :goto_0
    return-void

    .line 78
    :pswitch_0
    sget-object p1, Lbr0;->ON_STOP:Lbr0;

    .line 79
    .line 80
    if-ne p2, p1, :cond_4

    .line 81
    .line 82
    iget-object p0, p0, Lll1;->ζ:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast p0, Ln60;

    .line 85
    .line 86
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    :cond_4
    return-void

    .line 90
    :pswitch_1
    new-instance p1, Ljava/util/HashMap;

    .line 91
    .line 92
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 93
    .line 94
    .line 95
    iget-object p0, p0, Lll1;->ζ:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast p0, [Le90;

    .line 98
    .line 99
    array-length p1, p0

    .line 100
    const/4 p2, 0x0

    .line 101
    const/4 v0, 0x0

    .line 102
    if-gtz p1, :cond_6

    .line 103
    .line 104
    array-length p1, p0

    .line 105
    if-gtz p1, :cond_5

    .line 106
    .line 107
    return-void

    .line 108
    :cond_5
    aget-object p0, p0, v0

    .line 109
    .line 110
    throw p2

    .line 111
    :cond_6
    aget-object p0, p0, v0

    .line 112
    .line 113
    throw p2

    .line 114
    :pswitch_2
    iget-object v0, p0, Lll1;->ζ:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v0, Lkq1;

    .line 117
    .line 118
    sget-object v1, Lbr0;->ON_CREATE:Lbr0;

    .line 119
    .line 120
    if-ne p2, v1, :cond_e

    .line 121
    .line 122
    invoke-interface {p1}, Lhr0;->δ()Ljr0;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    invoke-virtual {p1, p0}, Ljr0;->ζ(Lgr0;)V

    .line 127
    .line 128
    .line 129
    invoke-interface {v0}, Lkq1;->α()Ln5;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    const-string p1, "androidx.savedstate.Restarter"

    .line 134
    .line 135
    invoke-virtual {p0, p1}, Ln5;->ν(Ljava/lang/String;)Landroid/os/Bundle;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    if-nez p0, :cond_7

    .line 140
    .line 141
    goto/16 :goto_3

    .line 142
    .line 143
    :cond_7
    const-string p1, "classes_to_restore"

    .line 144
    .line 145
    invoke-virtual {p0, p1}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    if-eqz p0, :cond_c

    .line 150
    .line 151
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    :cond_8
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 156
    .line 157
    .line 158
    move-result p1

    .line 159
    if-eqz p1, :cond_d

    .line 160
    .line 161
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    check-cast p1, Ljava/lang/String;

    .line 166
    .line 167
    const-string p2, "Class "

    .line 168
    .line 169
    :try_start_0
    const-class v1, Lll1;

    .line 170
    .line 171
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    const/4 v2, 0x0

    .line 176
    invoke-static {p1, v2, v1}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    const-class v2, Lgq1;

    .line 181
    .line 182
    invoke-virtual {v1, v2}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2

    .line 187
    .line 188
    .line 189
    const/4 v2, 0x0

    .line 190
    :try_start_1
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 191
    .line 192
    .line 193
    move-result-object p2
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1

    .line 194
    const/4 v1, 0x1

    .line 195
    invoke-virtual {p2, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 196
    .line 197
    .line 198
    :try_start_2
    invoke-virtual {p2, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object p2

    .line 202
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    check-cast p2, Lgq1;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 206
    .line 207
    instance-of p1, v0, Lr92;

    .line 208
    .line 209
    if-eqz p1, :cond_b

    .line 210
    .line 211
    move-object p1, v0

    .line 212
    check-cast p1, Lr92;

    .line 213
    .line 214
    invoke-interface {p1}, Lr92;->γ()Lq92;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    invoke-interface {v0}, Lkq1;->α()Ln5;

    .line 219
    .line 220
    .line 221
    move-result-object p2

    .line 222
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    iget-object p1, p1, Lq92;->α:Ljava/util/LinkedHashMap;

    .line 226
    .line 227
    new-instance v1, Ljava/util/HashSet;

    .line 228
    .line 229
    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 230
    .line 231
    .line 232
    move-result-object v2

    .line 233
    check-cast v2, Ljava/util/Collection;

    .line 234
    .line 235
    invoke-direct {v1, v2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 243
    .line 244
    .line 245
    move-result v2

    .line 246
    if-eqz v2, :cond_a

    .line 247
    .line 248
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v2

    .line 252
    check-cast v2, Ljava/lang/String;

    .line 253
    .line 254
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 255
    .line 256
    .line 257
    invoke-virtual {p1, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v2

    .line 261
    check-cast v2, Lm92;

    .line 262
    .line 263
    if-nez v2, :cond_9

    .line 264
    .line 265
    goto :goto_2

    .line 266
    :cond_9
    invoke-interface {v0}, Lhr0;->δ()Ljr0;

    .line 267
    .line 268
    .line 269
    move-result-object v3

    .line 270
    invoke-static {v2, p2, v3}, Ljx0;->ι(Lm92;Ln5;Ljr0;)V

    .line 271
    .line 272
    .line 273
    goto :goto_2

    .line 274
    :cond_a
    new-instance v1, Ljava/util/HashSet;

    .line 275
    .line 276
    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 277
    .line 278
    .line 279
    move-result-object p1

    .line 280
    check-cast p1, Ljava/util/Collection;

    .line 281
    .line 282
    invoke-direct {v1, p1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v1}, Ljava/util/HashSet;->isEmpty()Z

    .line 286
    .line 287
    .line 288
    move-result p1

    .line 289
    if-nez p1, :cond_8

    .line 290
    .line 291
    invoke-virtual {p2}, Ln5;->Τ()V

    .line 292
    .line 293
    .line 294
    goto/16 :goto_1

    .line 295
    .line 296
    :cond_b
    const-string p0, "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: "

    .line 297
    .line 298
    invoke-static {v0, p0}, Lγ;->υ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 299
    .line 300
    .line 301
    goto :goto_3

    .line 302
    :catch_0
    move-exception p0

    .line 303
    new-instance p2, Ljava/lang/RuntimeException;

    .line 304
    .line 305
    const-string v0, "Failed to instantiate "

    .line 306
    .line 307
    invoke-static {v0, p1}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object p1

    .line 311
    invoke-direct {p2, p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 312
    .line 313
    .line 314
    throw p2

    .line 315
    :catch_1
    move-exception p0

    .line 316
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 317
    .line 318
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    new-instance v1, Ljava/lang/StringBuilder;

    .line 323
    .line 324
    invoke-direct {v1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 325
    .line 326
    .line 327
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 328
    .line 329
    .line 330
    const-string p2, " must have default constructor in order to be automatically recreated"

    .line 331
    .line 332
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 333
    .line 334
    .line 335
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 336
    .line 337
    .line 338
    move-result-object p2

    .line 339
    invoke-direct {p1, p2, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 340
    .line 341
    .line 342
    throw p1

    .line 343
    :catch_2
    move-exception p0

    .line 344
    new-instance v0, Ljava/lang/RuntimeException;

    .line 345
    .line 346
    const-string v1, " wasn\'t found"

    .line 347
    .line 348
    invoke-static {p2, p1, v1}, Llz1;->Δ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object p1

    .line 352
    invoke-direct {v0, p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 353
    .line 354
    .line 355
    throw v0

    .line 356
    :cond_c
    const-string p0, "SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\""

    .line 357
    .line 358
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 359
    .line 360
    .line 361
    :cond_d
    :goto_3
    return-void

    .line 362
    :cond_e
    new-instance p0, Ljava/lang/AssertionError;

    .line 363
    .line 364
    const-string p1, "Next event must be ON_CREATE"

    .line 365
    .line 366
    invoke-direct {p0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 367
    .line 368
    .line 369
    throw p0

    .line 370
    nop

    .line 371
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
