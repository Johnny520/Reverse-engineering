.class public final Lh0/q0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic a:I

.field public b:Z

.field public c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lf/p;Lp4/t;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lh0/q0;->a:I

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Lh0/q0;->c:Ljava/lang/Object;

    .line 16
    iput-object p2, p0, Lh0/q0;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lh0/d1;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lh0/q0;->a:I

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lh0/q0;->d:Ljava/lang/Object;

    const/4 p1, 0x1

    .line 23
    iput-boolean p1, p0, Lh0/q0;->b:Z

    return-void
.end method

.method public constructor <init>(Ljava/util/HashMap;ZLjava/util/ArrayList;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Lh0/q0;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lh0/q0;->c:Ljava/lang/Object;

    .line 8
    .line 9
    iput-boolean p2, p0, Lh0/q0;->b:Z

    .line 10
    .line 11
    iput-object p3, p0, Lh0/q0;->d:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(ZLh0/v;Lh0/s;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lh0/q0;->a:I

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-boolean p1, p0, Lh0/q0;->b:Z

    .line 19
    iput-object p2, p0, Lh0/q0;->c:Ljava/lang/Object;

    .line 20
    iput-object p3, p0, Lh0/q0;->d:Ljava/lang/Object;

    return-void
.end method

.method public static b(Ljava/lang/Class;)Ljava/lang/String;
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
    new-instance v0, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string v1, "Abstract classes can\'t be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: "

    .line 31
    .line 32
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string p0, "\nSee "

    .line 43
    .line 44
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string p0, "r8-abstract-class"

    .line 48
    .line 49
    const-string v1, "https://github.com/google/gson/blob/main/Troubleshooting.md#"

    .line 50
    .line 51
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0

    .line 63
    :cond_1
    const/4 p0, 0x0

    .line 64
    return-object p0
.end method


# virtual methods
.method public a(J)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lh0/q0;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lp4/t;

    .line 4
    .line 5
    iget-object v0, v0, Lp4/t;->h:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x0

    .line 14
    move v3, v2

    .line 15
    :goto_0
    if-ge v3, v1, :cond_1

    .line 16
    .line 17
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    move-object v5, v4

    .line 22
    check-cast v5, Ls1/v;

    .line 23
    .line 24
    iget-wide v5, v5, Ls1/v;->a:J

    .line 25
    .line 26
    invoke-static {v5, v6, p1, p2}, Ls1/s;->e(JJ)Z

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    if-eqz v5, :cond_0

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/4 v4, 0x0

    .line 37
    :goto_1
    check-cast v4, Ls1/v;

    .line 38
    .line 39
    if-eqz v4, :cond_2

    .line 40
    .line 41
    iget-boolean p1, v4, Ls1/v;->h:Z

    .line 42
    .line 43
    return p1

    .line 44
    :cond_2
    return v2
.end method

.method public c(Ln6/a;Z)Lj6/o;
    .locals 9

    .line 1
    iget-object v0, p1, Ln6/a;->b:Ljava/lang/reflect/Type;

    .line 2
    .line 3
    iget-object p1, p1, Ln6/a;->a:Ljava/lang/Class;

    .line 4
    .line 5
    iget-object v1, p0, Lh0/q0;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const/4 v3, 0x0

    .line 14
    if-nez v2, :cond_17

    .line 15
    .line 16
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    if-nez v1, :cond_16

    .line 21
    .line 22
    const-class v1, Ljava/util/EnumSet;

    .line 23
    .line 24
    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    const/4 v2, 0x0

    .line 29
    const/4 v4, 0x1

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    new-instance v1, Lj6/a;

    .line 33
    .line 34
    invoke-direct {v1, v0, v4}, Lj6/a;-><init>(Ljava/lang/reflect/Type;I)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const-class v1, Ljava/util/EnumMap;

    .line 39
    .line 40
    if-ne p1, v1, :cond_1

    .line 41
    .line 42
    new-instance v1, Lj6/a;

    .line 43
    .line 44
    invoke-direct {v1, v0, v2}, Lj6/a;-><init>(Ljava/lang/reflect/Type;I)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    move-object v1, v3

    .line 49
    :goto_0
    if-eqz v1, :cond_2

    .line 50
    .line 51
    return-object v1

    .line 52
    :cond_2
    iget-object v1, p0, Lh0/q0;->d:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v1, Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-static {v1}, Lj6/h;->d(Ljava/util/ArrayList;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/Class;->getModifiers()I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    const/16 v5, 0x11

    .line 68
    .line 69
    if-eqz v1, :cond_3

    .line 70
    .line 71
    :catch_0
    move-object v1, v3

    .line 72
    goto :goto_2

    .line 73
    :cond_3
    :try_start_0
    invoke-virtual {p1, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 74
    .line 75
    .line 76
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 77
    sget-object v6, Ll6/c;->a:Lf8/i;

    .line 78
    .line 79
    :try_start_1
    invoke-virtual {v1, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 80
    .line 81
    .line 82
    move-object v6, v3

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
    invoke-static {v1}, Ll6/c;->b(Ljava/lang/reflect/Constructor;)Ljava/lang/String;

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
    move-result-object v8

    .line 108
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-static {v6}, Ll6/c;->e(Ljava/lang/Exception;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v6

    .line 115
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v6

    .line 122
    :goto_1
    if-eqz v6, :cond_4

    .line 123
    .line 124
    new-instance v1, Lj6/b;

    .line 125
    .line 126
    invoke-direct {v1, v6, v2}, Lj6/b;-><init>(Ljava/lang/String;I)V

    .line 127
    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_4
    new-instance v6, Lke/h;

    .line 131
    .line 132
    invoke-direct {v6, v1, v5}, Lke/h;-><init>(Ljava/lang/Object;I)V

    .line 133
    .line 134
    .line 135
    move-object v1, v6

    .line 136
    :goto_2
    if-eqz v1, :cond_5

    .line 137
    .line 138
    return-object v1

    .line 139
    :cond_5
    const-class v1, Ljava/util/Collection;

    .line 140
    .line 141
    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    const/16 v6, 0x12

    .line 146
    .line 147
    if-eqz v1, :cond_9

    .line 148
    .line 149
    const-class v0, Ljava/util/ArrayList;

    .line 150
    .line 151
    invoke-virtual {p1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    if-eqz v0, :cond_6

    .line 156
    .line 157
    new-instance v3, Li8/f;

    .line 158
    .line 159
    const/16 v0, 0x16

    .line 160
    .line 161
    invoke-direct {v3, v0}, Li8/f;-><init>(I)V

    .line 162
    .line 163
    .line 164
    goto/16 :goto_5

    .line 165
    .line 166
    :cond_6
    const-class v0, Ljava/util/LinkedHashSet;

    .line 167
    .line 168
    invoke-virtual {p1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 169
    .line 170
    .line 171
    move-result v0

    .line 172
    if-eqz v0, :cond_7

    .line 173
    .line 174
    new-instance v3, Li8/f;

    .line 175
    .line 176
    const/16 v0, 0x17

    .line 177
    .line 178
    invoke-direct {v3, v0}, Li8/f;-><init>(I)V

    .line 179
    .line 180
    .line 181
    goto/16 :goto_5

    .line 182
    .line 183
    :cond_7
    const-class v0, Ljava/util/TreeSet;

    .line 184
    .line 185
    invoke-virtual {p1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 186
    .line 187
    .line 188
    move-result v0

    .line 189
    if-eqz v0, :cond_8

    .line 190
    .line 191
    new-instance v3, Li8/f;

    .line 192
    .line 193
    const/16 v0, 0x18

    .line 194
    .line 195
    invoke-direct {v3, v0}, Li8/f;-><init>(I)V

    .line 196
    .line 197
    .line 198
    goto/16 :goto_5

    .line 199
    .line 200
    :cond_8
    const-class v0, Ljava/util/ArrayDeque;

    .line 201
    .line 202
    invoke-virtual {p1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 203
    .line 204
    .line 205
    move-result v0

    .line 206
    if-eqz v0, :cond_10

    .line 207
    .line 208
    new-instance v3, Li8/f;

    .line 209
    .line 210
    const/16 v0, 0x19

    .line 211
    .line 212
    invoke-direct {v3, v0}, Li8/f;-><init>(I)V

    .line 213
    .line 214
    .line 215
    goto/16 :goto_5

    .line 216
    .line 217
    :cond_9
    const-class v1, Ljava/util/Map;

    .line 218
    .line 219
    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 220
    .line 221
    .line 222
    move-result v1

    .line 223
    if-eqz v1, :cond_10

    .line 224
    .line 225
    const-class v1, Lj6/n;

    .line 226
    .line 227
    invoke-virtual {p1, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 228
    .line 229
    .line 230
    move-result v1

    .line 231
    if-eqz v1, :cond_c

    .line 232
    .line 233
    instance-of v1, v0, Ljava/lang/reflect/ParameterizedType;

    .line 234
    .line 235
    if-nez v1, :cond_a

    .line 236
    .line 237
    goto :goto_3

    .line 238
    :cond_a
    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    .line 239
    .line 240
    invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    array-length v1, v0

    .line 245
    if-nez v1, :cond_b

    .line 246
    .line 247
    goto :goto_4

    .line 248
    :cond_b
    aget-object v0, v0, v2

    .line 249
    .line 250
    invoke-static {v0}, Lj6/h;->f(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    const-class v1, Ljava/lang/String;

    .line 255
    .line 256
    if-ne v0, v1, :cond_c

    .line 257
    .line 258
    :goto_3
    new-instance v3, Li8/f;

    .line 259
    .line 260
    invoke-direct {v3, v5}, Li8/f;-><init>(I)V

    .line 261
    .line 262
    .line 263
    goto :goto_5

    .line 264
    :cond_c
    :goto_4
    const-class v0, Ljava/util/LinkedHashMap;

    .line 265
    .line 266
    invoke-virtual {p1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 267
    .line 268
    .line 269
    move-result v0

    .line 270
    if-eqz v0, :cond_d

    .line 271
    .line 272
    new-instance v3, Li8/f;

    .line 273
    .line 274
    invoke-direct {v3, v6}, Li8/f;-><init>(I)V

    .line 275
    .line 276
    .line 277
    goto :goto_5

    .line 278
    :cond_d
    const-class v0, Ljava/util/TreeMap;

    .line 279
    .line 280
    invoke-virtual {p1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 281
    .line 282
    .line 283
    move-result v0

    .line 284
    if-eqz v0, :cond_e

    .line 285
    .line 286
    new-instance v3, Li8/f;

    .line 287
    .line 288
    const/16 v0, 0x13

    .line 289
    .line 290
    invoke-direct {v3, v0}, Li8/f;-><init>(I)V

    .line 291
    .line 292
    .line 293
    goto :goto_5

    .line 294
    :cond_e
    const-class v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 295
    .line 296
    invoke-virtual {p1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 297
    .line 298
    .line 299
    move-result v0

    .line 300
    if-eqz v0, :cond_f

    .line 301
    .line 302
    new-instance v3, Li8/f;

    .line 303
    .line 304
    const/16 v0, 0x14

    .line 305
    .line 306
    invoke-direct {v3, v0}, Li8/f;-><init>(I)V

    .line 307
    .line 308
    .line 309
    goto :goto_5

    .line 310
    :cond_f
    const-class v0, Ljava/util/concurrent/ConcurrentSkipListMap;

    .line 311
    .line 312
    invoke-virtual {p1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 313
    .line 314
    .line 315
    move-result v0

    .line 316
    if-eqz v0, :cond_10

    .line 317
    .line 318
    new-instance v3, Li8/f;

    .line 319
    .line 320
    const/16 v0, 0x15

    .line 321
    .line 322
    invoke-direct {v3, v0}, Li8/f;-><init>(I)V

    .line 323
    .line 324
    .line 325
    :cond_10
    :goto_5
    if-eqz v3, :cond_11

    .line 326
    .line 327
    return-object v3

    .line 328
    :cond_11
    invoke-static {p1}, Lh0/q0;->b(Ljava/lang/Class;)Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    if-eqz v0, :cond_12

    .line 333
    .line 334
    new-instance p1, Lj6/b;

    .line 335
    .line 336
    invoke-direct {p1, v0, v4}, Lj6/b;-><init>(Ljava/lang/String;I)V

    .line 337
    .line 338
    .line 339
    return-object p1

    .line 340
    :cond_12
    const-string v0, "Unable to create instance of "

    .line 341
    .line 342
    if-nez p2, :cond_13

    .line 343
    .line 344
    new-instance p2, Ljava/lang/StringBuilder;

    .line 345
    .line 346
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 347
    .line 348
    .line 349
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 350
    .line 351
    .line 352
    const-string p1, "; Register an InstanceCreator or a TypeAdapter for this type."

    .line 353
    .line 354
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 355
    .line 356
    .line 357
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object p1

    .line 361
    new-instance p2, Lj6/b;

    .line 362
    .line 363
    const/4 v0, 0x2

    .line 364
    invoke-direct {p2, p1, v0}, Lj6/b;-><init>(Ljava/lang/String;I)V

    .line 365
    .line 366
    .line 367
    return-object p2

    .line 368
    :cond_13
    iget-boolean p2, p0, Lh0/q0;->b:Z

    .line 369
    .line 370
    if-eqz p2, :cond_14

    .line 371
    .line 372
    new-instance p2, Lke/h;

    .line 373
    .line 374
    invoke-direct {p2, p1, v6}, Lke/h;-><init>(Ljava/lang/Object;I)V

    .line 375
    .line 376
    .line 377
    goto :goto_6

    .line 378
    :cond_14
    new-instance p2, Ljava/lang/StringBuilder;

    .line 379
    .line 380
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 381
    .line 382
    .line 383
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 384
    .line 385
    .line 386
    const-string v0, "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem."

    .line 387
    .line 388
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 389
    .line 390
    .line 391
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 392
    .line 393
    .line 394
    move-result-object p2

    .line 395
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    .line 396
    .line 397
    .line 398
    move-result-object p1

    .line 399
    array-length p1, p1

    .line 400
    if-nez p1, :cond_15

    .line 401
    .line 402
    const-string p1, " Or adjust your R8 configuration to keep the no-args constructor of the class."

    .line 403
    .line 404
    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object p2

    .line 408
    :cond_15
    new-instance p1, Lj6/b;

    .line 409
    .line 410
    const/4 v0, 0x3

    .line 411
    invoke-direct {p1, p2, v0}, Lj6/b;-><init>(Ljava/lang/String;I)V

    .line 412
    .line 413
    .line 414
    move-object p2, p1

    .line 415
    :goto_6
    return-object p2

    .line 416
    :cond_16
    invoke-static {}, Lah/a;->d()V

    .line 417
    .line 418
    .line 419
    return-object v3

    .line 420
    :cond_17
    invoke-static {}, Lah/a;->d()V

    .line 421
    .line 422
    .line 423
    return-object v3
.end method

.method public d()Lh0/h;
    .locals 2

    .line 1
    iget-object v0, p0, Lh0/q0;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lh0/s;

    .line 4
    .line 5
    iget v1, v0, Lh0/s;->b:I

    .line 6
    .line 7
    iget v0, v0, Lh0/s;->c:I

    .line 8
    .line 9
    if-ge v1, v0, :cond_0

    .line 10
    .line 11
    sget-object v0, Lh0/h;->h:Lh0/h;

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    if-le v1, v0, :cond_1

    .line 15
    .line 16
    sget-object v0, Lh0/h;->g:Lh0/h;

    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_1
    sget-object v0, Lh0/h;->i:Lh0/h;

    .line 20
    .line 21
    return-object v0
.end method

.method public e()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lh0/q0;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lh0/q0;->d:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lh0/d1;

    .line 8
    .line 9
    iget-object v1, p0, Lh0/q0;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Li2/m0;

    .line 12
    .line 13
    invoke-static {v0, v1}, Lh0/d1;->b(Lh0/d1;Li2/m0;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public f(Ln2/s;JZLg1/d;)J
    .locals 10

    .line 1
    iget-object v0, p0, Lh0/q0;->d:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    check-cast v1, Lh0/d1;

    .line 5
    .line 6
    const/4 v8, 0x0

    .line 7
    const/4 v9, 0x0

    .line 8
    const/4 v6, 0x0

    .line 9
    move-object v2, p1

    .line 10
    move-wide v3, p2

    .line 11
    move v5, p4

    .line 12
    move-object v7, p5

    .line 13
    invoke-static/range {v1 .. v9}, Lh0/d1;->c(Lh0/d1;Ln2/s;JZZLg1/d;ZLn1/b;)J

    .line 14
    .line 15
    .line 16
    move-result-wide p1

    .line 17
    iget-object p3, p0, Lh0/q0;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p3, Li2/m0;

    .line 20
    .line 21
    invoke-static {p3, p1, p2}, Li2/m0;->a(Ljava/lang/Object;J)Z

    .line 22
    .line 23
    .line 24
    move-result p3

    .line 25
    if-nez p3, :cond_0

    .line 26
    .line 27
    const/4 p3, 0x0

    .line 28
    iput-boolean p3, p0, Lh0/q0;->b:Z

    .line 29
    .line 30
    :cond_0
    invoke-static {p1, p2}, Li2/m0;->c(J)Z

    .line 31
    .line 32
    .line 33
    move-result p3

    .line 34
    if-eqz p3, :cond_1

    .line 35
    .line 36
    sget-object p3, Lw/h0;->i:Lw/h0;

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    sget-object p3, Lw/h0;->h:Lw/h0;

    .line 40
    .line 41
    :goto_0
    invoke-virtual {v1, p3}, Lh0/d1;->q(Lw/h0;)V

    .line 42
    .line 43
    .line 44
    return-wide p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, Lh0/q0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_1
    iget-object v0, p0, Lh0/q0;->c:Ljava/lang/Object;

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
    :pswitch_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v1, "SingleSelectionLayout(isStartHandle="

    .line 23
    .line 24
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iget-boolean v1, p0, Lh0/q0;->b:Z

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v1, ", crossed="

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lh0/q0;->d()Lh0/h;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v1, ", info=\n\t"

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    iget-object v1, p0, Lh0/q0;->d:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v1, Lh0/s;

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const/16 v1, 0x29

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    return-object v0

    .line 66
    nop

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
