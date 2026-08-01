.class public final Landroidx/lifecycle/F;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final f:[Ljava/lang/Class;


# instance fields
.field public final a:Ljava/util/LinkedHashMap;

.field public final b:Ljava/util/LinkedHashMap;

.field public final c:Ljava/util/LinkedHashMap;

.field public final d:Ljava/util/LinkedHashMap;

.field public final e:LM/c;


# direct methods
.method static constructor <clinit>()V
    .locals 30

    .line 1
    const-class v28, Landroid/util/Size;

    .line 2
    .line 3
    const-class v29, Landroid/util/SizeF;

    .line 4
    .line 5
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 6
    .line 7
    const-class v2, [Z

    .line 8
    .line 9
    sget-object v3, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 10
    .line 11
    const-class v4, [D

    .line 12
    .line 13
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 14
    .line 15
    const-class v6, [I

    .line 16
    .line 17
    sget-object v7, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 18
    .line 19
    const-class v8, [J

    .line 20
    .line 21
    const-class v9, Ljava/lang/String;

    .line 22
    .line 23
    const-class v10, [Ljava/lang/String;

    .line 24
    .line 25
    const-class v11, Landroid/os/Binder;

    .line 26
    .line 27
    const-class v12, Landroid/os/Bundle;

    .line 28
    .line 29
    sget-object v13, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 30
    .line 31
    const-class v14, [B

    .line 32
    .line 33
    sget-object v15, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 34
    .line 35
    const-class v16, [C

    .line 36
    .line 37
    const-class v17, Ljava/lang/CharSequence;

    .line 38
    .line 39
    const-class v18, [Ljava/lang/CharSequence;

    .line 40
    .line 41
    const-class v19, Ljava/util/ArrayList;

    .line 42
    .line 43
    sget-object v20, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 44
    .line 45
    const-class v21, [F

    .line 46
    .line 47
    const-class v22, Landroid/os/Parcelable;

    .line 48
    .line 49
    const-class v23, [Landroid/os/Parcelable;

    .line 50
    .line 51
    const-class v24, Ljava/io/Serializable;

    .line 52
    .line 53
    sget-object v25, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 54
    .line 55
    const-class v26, [S

    .line 56
    .line 57
    const-class v27, Landroid/util/SparseArray;

    .line 58
    .line 59
    filled-new-array/range {v1 .. v29}, [Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    sput-object v0, Landroidx/lifecycle/F;->f:[Ljava/lang/Class;

    .line 64
    .line 65
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Landroidx/lifecycle/F;->a:Ljava/util/LinkedHashMap;

    .line 10
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Landroidx/lifecycle/F;->b:Ljava/util/LinkedHashMap;

    .line 11
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Landroidx/lifecycle/F;->c:Ljava/util/LinkedHashMap;

    .line 12
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Landroidx/lifecycle/F;->d:Ljava/util/LinkedHashMap;

    .line 13
    new-instance v0, Landroidx/activity/c;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0}, Landroidx/activity/c;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, Landroidx/lifecycle/F;->e:LM/c;

    return-void
.end method

.method public constructor <init>(Ljava/util/HashMap;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Landroidx/lifecycle/F;->a:Ljava/util/LinkedHashMap;

    .line 3
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v1, p0, Landroidx/lifecycle/F;->b:Ljava/util/LinkedHashMap;

    .line 4
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v1, p0, Landroidx/lifecycle/F;->c:Ljava/util/LinkedHashMap;

    .line 5
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v1, p0, Landroidx/lifecycle/F;->d:Ljava/util/LinkedHashMap;

    .line 6
    new-instance v1, Landroidx/activity/c;

    const/4 v2, 0x1

    invoke-direct {v1, v2, p0}, Landroidx/activity/c;-><init>(ILjava/lang/Object;)V

    iput-object v1, p0, Landroidx/lifecycle/F;->e:LM/c;

    .line 7
    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-void
.end method

.method public static a(Landroidx/lifecycle/F;)Landroid/os/Bundle;
    .locals 10

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/lifecycle/F;->b:Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    const-string v1, "<this>"

    .line 9
    .line 10
    invoke-static {v0, v1}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Map;->size()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    if-eq v1, v2, :cond_0

    .line 21
    .line 22
    invoke-static {v0}, LF0/v;->d0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const-string v1, "<this>"

    .line 28
    .line 29
    invoke-static {v0, v1}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    check-cast v0, Ljava/util/Map$Entry;

    .line 45
    .line 46
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-static {v1, v0}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    const-string v1, "with(...)"

    .line 59
    .line 60
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    sget-object v0, LF0/t;->a:LF0/t;

    .line 65
    .line 66
    :goto_0
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    iget-object v2, p0, Landroidx/lifecycle/F;->a:Ljava/util/LinkedHashMap;

    .line 79
    .line 80
    const/4 v3, 0x0

    .line 81
    const/4 v4, 0x0

    .line 82
    if-eqz v1, :cond_8

    .line 83
    .line 84
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    check-cast v1, Ljava/util/Map$Entry;

    .line 89
    .line 90
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    check-cast v5, Ljava/lang/String;

    .line 95
    .line 96
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    check-cast v1, LM/c;

    .line 101
    .line 102
    invoke-interface {v1}, LM/c;->a()Landroid/os/Bundle;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    const-string v6, "key"

    .line 107
    .line 108
    invoke-static {v5, v6}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    if-nez v1, :cond_2

    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_2
    sget-object v6, Landroidx/lifecycle/F;->f:[Ljava/lang/Class;

    .line 115
    .line 116
    :goto_2
    const/16 v7, 0x1d

    .line 117
    .line 118
    if-ge v4, v7, :cond_7

    .line 119
    .line 120
    aget-object v7, v6, v4

    .line 121
    .line 122
    invoke-static {v7}, LN0/g;->b(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v7, v1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v7

    .line 129
    if-eqz v7, :cond_6

    .line 130
    .line 131
    :goto_3
    iget-object v4, p0, Landroidx/lifecycle/F;->c:Ljava/util/LinkedHashMap;

    .line 132
    .line 133
    invoke-virtual {v4, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    instance-of v6, v4, Landroidx/lifecycle/x;

    .line 138
    .line 139
    if-eqz v6, :cond_3

    .line 140
    .line 141
    move-object v3, v4

    .line 142
    check-cast v3, Landroidx/lifecycle/x;

    .line 143
    .line 144
    :cond_3
    if-eqz v3, :cond_4

    .line 145
    .line 146
    invoke-virtual {v3, v1}, Landroidx/lifecycle/x;->a(Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    goto :goto_4

    .line 150
    :cond_4
    invoke-interface {v2, v5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    :goto_4
    iget-object v1, p0, Landroidx/lifecycle/F;->d:Ljava/util/LinkedHashMap;

    .line 154
    .line 155
    invoke-virtual {v1, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    if-nez v1, :cond_5

    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_5
    new-instance p0, Ljava/lang/ClassCastException;

    .line 163
    .line 164
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 165
    .line 166
    .line 167
    throw p0

    .line 168
    :cond_6
    add-int/lit8 v4, v4, 0x1

    .line 169
    .line 170
    goto :goto_2

    .line 171
    :cond_7
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 172
    .line 173
    new-instance v0, Ljava/lang/StringBuilder;

    .line 174
    .line 175
    const-string v2, "Can\'t put value with type "

    .line 176
    .line 177
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    const-string v1, " into saved state"

    .line 188
    .line 189
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    throw p0

    .line 200
    :cond_8
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 201
    .line 202
    .line 203
    move-result-object p0

    .line 204
    new-instance v0, Ljava/util/ArrayList;

    .line 205
    .line 206
    invoke-interface {p0}, Ljava/util/Set;->size()I

    .line 207
    .line 208
    .line 209
    move-result v1

    .line 210
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 211
    .line 212
    .line 213
    new-instance v1, Ljava/util/ArrayList;

    .line 214
    .line 215
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 216
    .line 217
    .line 218
    move-result v5

    .line 219
    invoke-direct {v1, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 220
    .line 221
    .line 222
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 223
    .line 224
    .line 225
    move-result-object p0

    .line 226
    :goto_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 227
    .line 228
    .line 229
    move-result v5

    .line 230
    if-eqz v5, :cond_9

    .line 231
    .line 232
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v5

    .line 236
    check-cast v5, Ljava/lang/String;

    .line 237
    .line 238
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    invoke-virtual {v2, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v5

    .line 245
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    goto :goto_5

    .line 249
    :cond_9
    new-instance p0, LE0/c;

    .line 250
    .line 251
    const-string v2, "keys"

    .line 252
    .line 253
    invoke-direct {p0, v2, v0}, LE0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 254
    .line 255
    .line 256
    new-instance v0, LE0/c;

    .line 257
    .line 258
    const-string v2, "values"

    .line 259
    .line 260
    invoke-direct {v0, v2, v1}, LE0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 261
    .line 262
    .line 263
    filled-new-array {p0, v0}, [LE0/c;

    .line 264
    .line 265
    .line 266
    move-result-object p0

    .line 267
    new-instance v0, Landroid/os/Bundle;

    .line 268
    .line 269
    const/4 v1, 0x2

    .line 270
    invoke-direct {v0, v1}, Landroid/os/Bundle;-><init>(I)V

    .line 271
    .line 272
    .line 273
    :goto_6
    if-ge v4, v1, :cond_27

    .line 274
    .line 275
    aget-object v2, p0, v4

    .line 276
    .line 277
    iget-object v5, v2, LE0/c;->a:Ljava/lang/Object;

    .line 278
    .line 279
    check-cast v5, Ljava/lang/String;

    .line 280
    .line 281
    iget-object v2, v2, LE0/c;->b:Ljava/lang/Object;

    .line 282
    .line 283
    if-nez v2, :cond_a

    .line 284
    .line 285
    invoke-virtual {v0, v5, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    goto/16 :goto_7

    .line 289
    .line 290
    :cond_a
    instance-of v6, v2, Ljava/lang/Boolean;

    .line 291
    .line 292
    if-eqz v6, :cond_b

    .line 293
    .line 294
    check-cast v2, Ljava/lang/Boolean;

    .line 295
    .line 296
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 297
    .line 298
    .line 299
    move-result v2

    .line 300
    invoke-virtual {v0, v5, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 301
    .line 302
    .line 303
    goto/16 :goto_7

    .line 304
    .line 305
    :cond_b
    instance-of v6, v2, Ljava/lang/Byte;

    .line 306
    .line 307
    if-eqz v6, :cond_c

    .line 308
    .line 309
    check-cast v2, Ljava/lang/Number;

    .line 310
    .line 311
    invoke-virtual {v2}, Ljava/lang/Number;->byteValue()B

    .line 312
    .line 313
    .line 314
    move-result v2

    .line 315
    invoke-virtual {v0, v5, v2}, Landroid/os/Bundle;->putByte(Ljava/lang/String;B)V

    .line 316
    .line 317
    .line 318
    goto/16 :goto_7

    .line 319
    .line 320
    :cond_c
    instance-of v6, v2, Ljava/lang/Character;

    .line 321
    .line 322
    if-eqz v6, :cond_d

    .line 323
    .line 324
    check-cast v2, Ljava/lang/Character;

    .line 325
    .line 326
    invoke-virtual {v2}, Ljava/lang/Character;->charValue()C

    .line 327
    .line 328
    .line 329
    move-result v2

    .line 330
    invoke-virtual {v0, v5, v2}, Landroid/os/Bundle;->putChar(Ljava/lang/String;C)V

    .line 331
    .line 332
    .line 333
    goto/16 :goto_7

    .line 334
    .line 335
    :cond_d
    instance-of v6, v2, Ljava/lang/Double;

    .line 336
    .line 337
    if-eqz v6, :cond_e

    .line 338
    .line 339
    check-cast v2, Ljava/lang/Number;

    .line 340
    .line 341
    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    .line 342
    .line 343
    .line 344
    move-result-wide v6

    .line 345
    invoke-virtual {v0, v5, v6, v7}, Landroid/os/BaseBundle;->putDouble(Ljava/lang/String;D)V

    .line 346
    .line 347
    .line 348
    goto/16 :goto_7

    .line 349
    .line 350
    :cond_e
    instance-of v6, v2, Ljava/lang/Float;

    .line 351
    .line 352
    if-eqz v6, :cond_f

    .line 353
    .line 354
    check-cast v2, Ljava/lang/Number;

    .line 355
    .line 356
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 357
    .line 358
    .line 359
    move-result v2

    .line 360
    invoke-virtual {v0, v5, v2}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 361
    .line 362
    .line 363
    goto/16 :goto_7

    .line 364
    .line 365
    :cond_f
    instance-of v6, v2, Ljava/lang/Integer;

    .line 366
    .line 367
    if-eqz v6, :cond_10

    .line 368
    .line 369
    check-cast v2, Ljava/lang/Number;

    .line 370
    .line 371
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 372
    .line 373
    .line 374
    move-result v2

    .line 375
    invoke-virtual {v0, v5, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 376
    .line 377
    .line 378
    goto/16 :goto_7

    .line 379
    .line 380
    :cond_10
    instance-of v6, v2, Ljava/lang/Long;

    .line 381
    .line 382
    if-eqz v6, :cond_11

    .line 383
    .line 384
    check-cast v2, Ljava/lang/Number;

    .line 385
    .line 386
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 387
    .line 388
    .line 389
    move-result-wide v6

    .line 390
    invoke-virtual {v0, v5, v6, v7}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 391
    .line 392
    .line 393
    goto/16 :goto_7

    .line 394
    .line 395
    :cond_11
    instance-of v6, v2, Ljava/lang/Short;

    .line 396
    .line 397
    if-eqz v6, :cond_12

    .line 398
    .line 399
    check-cast v2, Ljava/lang/Number;

    .line 400
    .line 401
    invoke-virtual {v2}, Ljava/lang/Number;->shortValue()S

    .line 402
    .line 403
    .line 404
    move-result v2

    .line 405
    invoke-virtual {v0, v5, v2}, Landroid/os/Bundle;->putShort(Ljava/lang/String;S)V

    .line 406
    .line 407
    .line 408
    goto/16 :goto_7

    .line 409
    .line 410
    :cond_12
    instance-of v6, v2, Landroid/os/Bundle;

    .line 411
    .line 412
    if-eqz v6, :cond_13

    .line 413
    .line 414
    check-cast v2, Landroid/os/Bundle;

    .line 415
    .line 416
    invoke-virtual {v0, v5, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 417
    .line 418
    .line 419
    goto/16 :goto_7

    .line 420
    .line 421
    :cond_13
    instance-of v6, v2, Ljava/lang/CharSequence;

    .line 422
    .line 423
    if-eqz v6, :cond_14

    .line 424
    .line 425
    check-cast v2, Ljava/lang/CharSequence;

    .line 426
    .line 427
    invoke-virtual {v0, v5, v2}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 428
    .line 429
    .line 430
    goto/16 :goto_7

    .line 431
    .line 432
    :cond_14
    instance-of v6, v2, Landroid/os/Parcelable;

    .line 433
    .line 434
    if-eqz v6, :cond_15

    .line 435
    .line 436
    check-cast v2, Landroid/os/Parcelable;

    .line 437
    .line 438
    invoke-virtual {v0, v5, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 439
    .line 440
    .line 441
    goto/16 :goto_7

    .line 442
    .line 443
    :cond_15
    instance-of v6, v2, [Z

    .line 444
    .line 445
    if-eqz v6, :cond_16

    .line 446
    .line 447
    check-cast v2, [Z

    .line 448
    .line 449
    invoke-virtual {v0, v5, v2}, Landroid/os/BaseBundle;->putBooleanArray(Ljava/lang/String;[Z)V

    .line 450
    .line 451
    .line 452
    goto/16 :goto_7

    .line 453
    .line 454
    :cond_16
    instance-of v6, v2, [B

    .line 455
    .line 456
    if-eqz v6, :cond_17

    .line 457
    .line 458
    check-cast v2, [B

    .line 459
    .line 460
    invoke-virtual {v0, v5, v2}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    .line 461
    .line 462
    .line 463
    goto/16 :goto_7

    .line 464
    .line 465
    :cond_17
    instance-of v6, v2, [C

    .line 466
    .line 467
    if-eqz v6, :cond_18

    .line 468
    .line 469
    check-cast v2, [C

    .line 470
    .line 471
    invoke-virtual {v0, v5, v2}, Landroid/os/Bundle;->putCharArray(Ljava/lang/String;[C)V

    .line 472
    .line 473
    .line 474
    goto/16 :goto_7

    .line 475
    .line 476
    :cond_18
    instance-of v6, v2, [D

    .line 477
    .line 478
    if-eqz v6, :cond_19

    .line 479
    .line 480
    check-cast v2, [D

    .line 481
    .line 482
    invoke-virtual {v0, v5, v2}, Landroid/os/BaseBundle;->putDoubleArray(Ljava/lang/String;[D)V

    .line 483
    .line 484
    .line 485
    goto/16 :goto_7

    .line 486
    .line 487
    :cond_19
    instance-of v6, v2, [F

    .line 488
    .line 489
    if-eqz v6, :cond_1a

    .line 490
    .line 491
    check-cast v2, [F

    .line 492
    .line 493
    invoke-virtual {v0, v5, v2}, Landroid/os/Bundle;->putFloatArray(Ljava/lang/String;[F)V

    .line 494
    .line 495
    .line 496
    goto/16 :goto_7

    .line 497
    .line 498
    :cond_1a
    instance-of v6, v2, [I

    .line 499
    .line 500
    if-eqz v6, :cond_1b

    .line 501
    .line 502
    check-cast v2, [I

    .line 503
    .line 504
    invoke-virtual {v0, v5, v2}, Landroid/os/BaseBundle;->putIntArray(Ljava/lang/String;[I)V

    .line 505
    .line 506
    .line 507
    goto/16 :goto_7

    .line 508
    .line 509
    :cond_1b
    instance-of v6, v2, [J

    .line 510
    .line 511
    if-eqz v6, :cond_1c

    .line 512
    .line 513
    check-cast v2, [J

    .line 514
    .line 515
    invoke-virtual {v0, v5, v2}, Landroid/os/BaseBundle;->putLongArray(Ljava/lang/String;[J)V

    .line 516
    .line 517
    .line 518
    goto/16 :goto_7

    .line 519
    .line 520
    :cond_1c
    instance-of v6, v2, [S

    .line 521
    .line 522
    if-eqz v6, :cond_1d

    .line 523
    .line 524
    check-cast v2, [S

    .line 525
    .line 526
    invoke-virtual {v0, v5, v2}, Landroid/os/Bundle;->putShortArray(Ljava/lang/String;[S)V

    .line 527
    .line 528
    .line 529
    goto/16 :goto_7

    .line 530
    .line 531
    :cond_1d
    instance-of v6, v2, [Ljava/lang/Object;

    .line 532
    .line 533
    const/16 v7, 0x22

    .line 534
    .line 535
    const-string v8, " for key \""

    .line 536
    .line 537
    if-eqz v6, :cond_22

    .line 538
    .line 539
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 540
    .line 541
    .line 542
    move-result-object v6

    .line 543
    invoke-virtual {v6}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 544
    .line 545
    .line 546
    move-result-object v6

    .line 547
    invoke-static {v6}, LN0/g;->b(Ljava/lang/Object;)V

    .line 548
    .line 549
    .line 550
    const-class v9, Landroid/os/Parcelable;

    .line 551
    .line 552
    invoke-virtual {v9, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 553
    .line 554
    .line 555
    move-result v9

    .line 556
    if-eqz v9, :cond_1e

    .line 557
    .line 558
    check-cast v2, [Landroid/os/Parcelable;

    .line 559
    .line 560
    invoke-virtual {v0, v5, v2}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    .line 561
    .line 562
    .line 563
    goto/16 :goto_7

    .line 564
    .line 565
    :cond_1e
    const-class v9, Ljava/lang/String;

    .line 566
    .line 567
    invoke-virtual {v9, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 568
    .line 569
    .line 570
    move-result v9

    .line 571
    if-eqz v9, :cond_1f

    .line 572
    .line 573
    check-cast v2, [Ljava/lang/String;

    .line 574
    .line 575
    invoke-virtual {v0, v5, v2}, Landroid/os/BaseBundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V

    .line 576
    .line 577
    .line 578
    goto :goto_7

    .line 579
    :cond_1f
    const-class v9, Ljava/lang/CharSequence;

    .line 580
    .line 581
    invoke-virtual {v9, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 582
    .line 583
    .line 584
    move-result v9

    .line 585
    if-eqz v9, :cond_20

    .line 586
    .line 587
    check-cast v2, [Ljava/lang/CharSequence;

    .line 588
    .line 589
    invoke-virtual {v0, v5, v2}, Landroid/os/Bundle;->putCharSequenceArray(Ljava/lang/String;[Ljava/lang/CharSequence;)V

    .line 590
    .line 591
    .line 592
    goto :goto_7

    .line 593
    :cond_20
    const-class v9, Ljava/io/Serializable;

    .line 594
    .line 595
    invoke-virtual {v9, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 596
    .line 597
    .line 598
    move-result v9

    .line 599
    if-eqz v9, :cond_21

    .line 600
    .line 601
    check-cast v2, Ljava/io/Serializable;

    .line 602
    .line 603
    invoke-virtual {v0, v5, v2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 604
    .line 605
    .line 606
    goto :goto_7

    .line 607
    :cond_21
    invoke-virtual {v6}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 608
    .line 609
    .line 610
    move-result-object p0

    .line 611
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 612
    .line 613
    new-instance v1, Ljava/lang/StringBuilder;

    .line 614
    .line 615
    const-string v2, "Illegal value array type "

    .line 616
    .line 617
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 618
    .line 619
    .line 620
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 621
    .line 622
    .line 623
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 624
    .line 625
    .line 626
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 627
    .line 628
    .line 629
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 630
    .line 631
    .line 632
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 633
    .line 634
    .line 635
    move-result-object p0

    .line 636
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 637
    .line 638
    .line 639
    throw v0

    .line 640
    :cond_22
    instance-of v6, v2, Ljava/io/Serializable;

    .line 641
    .line 642
    if-eqz v6, :cond_23

    .line 643
    .line 644
    check-cast v2, Ljava/io/Serializable;

    .line 645
    .line 646
    invoke-virtual {v0, v5, v2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 647
    .line 648
    .line 649
    goto :goto_7

    .line 650
    :cond_23
    instance-of v6, v2, Landroid/os/IBinder;

    .line 651
    .line 652
    if-eqz v6, :cond_24

    .line 653
    .line 654
    check-cast v2, Landroid/os/IBinder;

    .line 655
    .line 656
    invoke-virtual {v0, v5, v2}, Landroid/os/Bundle;->putBinder(Ljava/lang/String;Landroid/os/IBinder;)V

    .line 657
    .line 658
    .line 659
    goto :goto_7

    .line 660
    :cond_24
    instance-of v6, v2, Landroid/util/Size;

    .line 661
    .line 662
    if-eqz v6, :cond_25

    .line 663
    .line 664
    check-cast v2, Landroid/util/Size;

    .line 665
    .line 666
    invoke-static {v0, v5, v2}, Lu/a;->a(Landroid/os/Bundle;Ljava/lang/String;Landroid/util/Size;)V

    .line 667
    .line 668
    .line 669
    goto :goto_7

    .line 670
    :cond_25
    instance-of v6, v2, Landroid/util/SizeF;

    .line 671
    .line 672
    if-eqz v6, :cond_26

    .line 673
    .line 674
    check-cast v2, Landroid/util/SizeF;

    .line 675
    .line 676
    invoke-static {v0, v5, v2}, Lu/a;->b(Landroid/os/Bundle;Ljava/lang/String;Landroid/util/SizeF;)V

    .line 677
    .line 678
    .line 679
    :goto_7
    add-int/lit8 v4, v4, 0x1

    .line 680
    .line 681
    goto/16 :goto_6

    .line 682
    .line 683
    :cond_26
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 684
    .line 685
    .line 686
    move-result-object p0

    .line 687
    invoke-virtual {p0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 688
    .line 689
    .line 690
    move-result-object p0

    .line 691
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 692
    .line 693
    new-instance v1, Ljava/lang/StringBuilder;

    .line 694
    .line 695
    const-string v2, "Illegal value type "

    .line 696
    .line 697
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 698
    .line 699
    .line 700
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 701
    .line 702
    .line 703
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 704
    .line 705
    .line 706
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 707
    .line 708
    .line 709
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 710
    .line 711
    .line 712
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 713
    .line 714
    .line 715
    move-result-object p0

    .line 716
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 717
    .line 718
    .line 719
    throw v0

    .line 720
    :cond_27
    return-object v0
.end method
