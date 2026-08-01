.class public abstract Lxhss/ᲈᛸᛲᲈ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# static fields
.field public static final ᛱᛱᛲᲇ:Ljava/util/HashMap;

.field public static final ᛷᛵᛵᲈ:Ljava/util/HashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lxhss/ᲈᛸᛲᲈ;->ᛷᛵᛵᲈ:Ljava/util/HashMap;

    .line 7
    .line 8
    new-instance v0, Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lxhss/ᲈᛸᛲᲈ;->ᛱᛱᛲᲇ:Ljava/util/HashMap;

    .line 14
    .line 15
    return-void
.end method

.method public static ᛱᛱᛲᲇ(Ljava/lang/Class;)I
    .locals 13

    .line 1
    sget-object v0, Lxhss/ᲈᛸᛲᲈ;->ᛷᛵᛵᲈ:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Ljava/lang/Integer;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const/4 v2, 0x1

    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    goto/16 :goto_8

    .line 24
    .line 25
    :cond_1
    const/4 v1, 0x0

    .line 26
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-virtual {p0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    if-eqz v3, :cond_2

    .line 35
    .line 36
    invoke-virtual {v3}, Ljava/lang/Package;->getName()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    goto :goto_0

    .line 41
    :cond_2
    const-string v3, ""

    .line 42
    .line 43
    :goto_0
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    if-nez v5, :cond_3

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_3
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    add-int/2addr v5, v2

    .line 55
    invoke-virtual {v4, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    :goto_1
    const-string v5, "."

    .line 60
    .line 61
    const-string v6, "_"

    .line 62
    .line 63
    invoke-static {v4, v5, v6}, Lxhss/ᛲᲈᛷᛸ;->ᛴᲀᛸᛵ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    const-string v5, "_LifecycleAdapter"

    .line 68
    .line 69
    invoke-virtual {v4, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 74
    .line 75
    .line 76
    move-result v5

    .line 77
    if-nez v5, :cond_4

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_4
    new-instance v5, Ljava/lang/StringBuilder;

    .line 81
    .line 82
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    const/16 v3, 0x2e

    .line 89
    .line 90
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    :goto_2
    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    filled-new-array {p0}, [Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    invoke-virtual {v3, v4}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    invoke-virtual {v3}, Ljava/lang/reflect/AccessibleObject;->isAccessible()Z

    .line 113
    .line 114
    .line 115
    move-result v4

    .line 116
    if-nez v4, :cond_5

    .line 117
    .line 118
    invoke-virtual {v3, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 119
    .line 120
    .line 121
    goto :goto_3

    .line 122
    :catch_0
    move-exception p0

    .line 123
    new-instance v0, Ljava/lang/RuntimeException;

    .line 124
    .line 125
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 126
    .line 127
    .line 128
    throw v0

    .line 129
    :catch_1
    move-object v3, v1

    .line 130
    :cond_5
    :goto_3
    const/4 v4, 0x2

    .line 131
    sget-object v5, Lxhss/ᲈᛸᛲᲈ;->ᛱᛱᛲᲇ:Ljava/util/HashMap;

    .line 132
    .line 133
    if-eqz v3, :cond_6

    .line 134
    .line 135
    invoke-static {v3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    invoke-virtual {v5, p0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    :goto_4
    move v2, v4

    .line 143
    goto/16 :goto_8

    .line 144
    .line 145
    :cond_6
    sget-object v3, Lxhss/ᛷᲈᛱᲇ;->ᛳᲁᲇᛸ:Lxhss/ᛷᲈᛱᲇ;

    .line 146
    .line 147
    iget-object v6, v3, Lxhss/ᛷᲈᛱᲇ;->ᛱᛱᛲᲇ:Ljava/util/HashMap;

    .line 148
    .line 149
    invoke-virtual {v6, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v7

    .line 153
    check-cast v7, Ljava/lang/Boolean;

    .line 154
    .line 155
    const/4 v8, 0x0

    .line 156
    if-eqz v7, :cond_7

    .line 157
    .line 158
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 159
    .line 160
    .line 161
    move-result v3

    .line 162
    goto :goto_6

    .line 163
    :cond_7
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 164
    .line 165
    .line 166
    move-result-object v7
    :try_end_1
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_1 .. :try_end_1} :catch_2

    .line 167
    array-length v9, v7

    .line 168
    move v10, v8

    .line 169
    :goto_5
    if-ge v10, v9, :cond_9

    .line 170
    .line 171
    aget-object v11, v7, v10

    .line 172
    .line 173
    const-class v12, Lxhss/ᛲᛵᲁᛵ;

    .line 174
    .line 175
    invoke-virtual {v11, v12}, Ljava/lang/reflect/Method;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 176
    .line 177
    .line 178
    move-result-object v11

    .line 179
    check-cast v11, Lxhss/ᛲᛵᲁᛵ;

    .line 180
    .line 181
    if-eqz v11, :cond_8

    .line 182
    .line 183
    invoke-virtual {v3, p0, v7}, Lxhss/ᛷᲈᛱᲇ;->ᛷᛵᛵᲈ(Ljava/lang/Class;[Ljava/lang/reflect/Method;)Lxhss/ᲀᛱᲁᛳ;

    .line 184
    .line 185
    .line 186
    move v3, v2

    .line 187
    goto :goto_6

    .line 188
    :cond_8
    add-int/lit8 v10, v10, 0x1

    .line 189
    .line 190
    goto :goto_5

    .line 191
    :cond_9
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 192
    .line 193
    invoke-virtual {v6, p0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move v3, v8

    .line 197
    :goto_6
    if-eqz v3, :cond_a

    .line 198
    .line 199
    goto :goto_8

    .line 200
    :cond_a
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    move-result-object v3

    .line 204
    const-class v6, Lxhss/ᛱᲀᛲᲁ;

    .line 205
    .line 206
    if-eqz v3, :cond_c

    .line 207
    .line 208
    invoke-virtual {v6, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 209
    .line 210
    .line 211
    move-result v7

    .line 212
    if-eqz v7, :cond_c

    .line 213
    .line 214
    invoke-static {v3}, Lxhss/ᲈᛸᛲᲈ;->ᛱᛱᛲᲇ(Ljava/lang/Class;)I

    .line 215
    .line 216
    .line 217
    move-result v1

    .line 218
    if-ne v1, v2, :cond_b

    .line 219
    .line 220
    goto :goto_8

    .line 221
    :cond_b
    new-instance v1, Ljava/util/ArrayList;

    .line 222
    .line 223
    invoke-virtual {v5, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v3

    .line 227
    check-cast v3, Ljava/util/Collection;

    .line 228
    .line 229
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 230
    .line 231
    .line 232
    :cond_c
    invoke-virtual {p0}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    .line 233
    .line 234
    .line 235
    move-result-object v3

    .line 236
    array-length v7, v3

    .line 237
    :goto_7
    if-ge v8, v7, :cond_10

    .line 238
    .line 239
    aget-object v9, v3, v8

    .line 240
    .line 241
    if-eqz v9, :cond_f

    .line 242
    .line 243
    invoke-virtual {v6, v9}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 244
    .line 245
    .line 246
    move-result v10

    .line 247
    if-eqz v10, :cond_f

    .line 248
    .line 249
    invoke-static {v9}, Lxhss/ᲈᛸᛲᲈ;->ᛱᛱᛲᲇ(Ljava/lang/Class;)I

    .line 250
    .line 251
    .line 252
    move-result v10

    .line 253
    if-ne v10, v2, :cond_d

    .line 254
    .line 255
    goto :goto_8

    .line 256
    :cond_d
    if-nez v1, :cond_e

    .line 257
    .line 258
    new-instance v1, Ljava/util/ArrayList;

    .line 259
    .line 260
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 261
    .line 262
    .line 263
    :cond_e
    invoke-virtual {v5, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v9

    .line 267
    check-cast v9, Ljava/util/Collection;

    .line 268
    .line 269
    invoke-interface {v1, v9}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 270
    .line 271
    .line 272
    :cond_f
    add-int/lit8 v8, v8, 0x1

    .line 273
    .line 274
    goto :goto_7

    .line 275
    :cond_10
    if-eqz v1, :cond_11

    .line 276
    .line 277
    invoke-virtual {v5, p0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    goto/16 :goto_4

    .line 281
    .line 282
    :cond_11
    :goto_8
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 283
    .line 284
    .line 285
    move-result-object v1

    .line 286
    invoke-virtual {v0, p0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    return v2

    .line 290
    :catch_2
    move-exception p0

    .line 291
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 292
    .line 293
    const-string v1, "The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor."

    .line 294
    .line 295
    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 296
    .line 297
    .line 298
    throw v0
.end method

.method public static ᛷᛵᛵᲈ(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)V
    .locals 0

    .line 1
    :try_start_0
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    new-instance p0, Ljava/lang/ClassCastException;

    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 11
    .line 12
    .line 13
    throw p0
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    :catch_0
    move-exception p0

    .line 15
    new-instance p1, Ljava/lang/RuntimeException;

    .line 16
    .line 17
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 18
    .line 19
    .line 20
    throw p1

    .line 21
    :catch_1
    move-exception p0

    .line 22
    new-instance p1, Ljava/lang/RuntimeException;

    .line 23
    .line 24
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :catch_2
    move-exception p0

    .line 29
    new-instance p1, Ljava/lang/RuntimeException;

    .line 30
    .line 31
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    throw p1
.end method
