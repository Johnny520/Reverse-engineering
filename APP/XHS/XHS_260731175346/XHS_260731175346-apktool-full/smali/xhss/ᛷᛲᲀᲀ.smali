.class public final Lxhss/ᛷᛲᲀᲀ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᛴᛲᲀᛵ;


# instance fields
.field public final ᛱᛱᛲᲇ:Lxhss/ᛳᛱᛲᲀ;

.field public final ᛳᲁᲇᛸ:I

.field public final ᛷᛴᛷᛱ:Lxhss/ᛱᲁᲈᛷ;

.field public final ᲇᛴᲇᛵ:Lxhss/ᛱᛷᲈᛱ;

.field public final ᲇᛶᛴᲀ:Ljava/util/List;


# direct methods
.method public constructor <init>(Lxhss/ᛳᛱᛲᲀ;ILxhss/ᛱᛷᲈᛱ;Lxhss/ᛱᲁᲈᛷ;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxhss/ᛷᛲᲀᲀ;->ᛱᛱᛲᲇ:Lxhss/ᛳᛱᛲᲀ;

    .line 5
    .line 6
    iput p2, p0, Lxhss/ᛷᛲᲀᲀ;->ᛳᲁᲇᛸ:I

    .line 7
    .line 8
    iput-object p3, p0, Lxhss/ᛷᛲᲀᲀ;->ᲇᛴᲇᛵ:Lxhss/ᛱᛷᲈᛱ;

    .line 9
    .line 10
    iput-object p4, p0, Lxhss/ᛷᛲᲀᲀ;->ᛷᛴᛷᛱ:Lxhss/ᛱᲁᲈᛷ;

    .line 11
    .line 12
    iput-object p5, p0, Lxhss/ᛷᛲᲀᲀ;->ᲇᛶᛴᲀ:Ljava/util/List;

    .line 13
    .line 14
    return-void
.end method

.method public static ᛱᛱᛲᲇ(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "Class "

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string p0, " declares multiple JSON fields named \'"

    .line 18
    .line 19
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string p0, "\'; conflict is caused by fields "

    .line 26
    .line 27
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-static {p2}, Lxhss/ᲇᛴᛷᲇ;->ᛳᲁᲇᛸ(Ljava/lang/reflect/Field;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string p0, " and "

    .line 38
    .line 39
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-static {p3}, Lxhss/ᲇᛴᛷᲇ;->ᛳᲁᲇᛸ(Ljava/lang/reflect/Field;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string p0, "\nSee "

    .line 50
    .line 51
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string p0, "duplicate-fields"

    .line 55
    .line 56
    const-string p1, "https://github.com/google/gson/blob/main/Troubleshooting.md#"

    .line 57
    .line 58
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw v0
.end method


# virtual methods
.method public final ᛳᲁᲇᛸ(Lxhss/ᲈᛲᛶᛴ;Lxhss/ᛱᛳᲈᛷ;Ljava/lang/Class;Z)Lxhss/ᛲᛸᲈᲇ;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v7, p3

    .line 4
    .line 5
    invoke-virtual {v7}, Ljava/lang/Class;->isInterface()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    sget-object v0, Lxhss/ᛲᛸᲈᲇ;->ᛳᲁᲇᛸ:Lxhss/ᛲᛸᲈᲇ;

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    new-instance v8, Ljava/util/LinkedHashMap;

    .line 15
    .line 16
    invoke-direct {v8}, Ljava/util/LinkedHashMap;-><init>()V

    .line 17
    .line 18
    .line 19
    new-instance v9, Ljava/util/LinkedHashMap;

    .line 20
    .line 21
    invoke-direct {v9}, Ljava/util/LinkedHashMap;-><init>()V

    .line 22
    .line 23
    .line 24
    move-object/from16 v1, p2

    .line 25
    .line 26
    move-object v10, v7

    .line 27
    :goto_0
    iget-object v11, v1, Lxhss/ᛱᛳᲈᛷ;->ᛱᛱᛲᲇ:Ljava/lang/reflect/Type;

    .line 28
    .line 29
    const-class v1, Ljava/lang/Object;

    .line 30
    .line 31
    if-eq v10, v1, :cond_16

    .line 32
    .line 33
    invoke-virtual {v10}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 34
    .line 35
    .line 36
    move-result-object v12

    .line 37
    if-eq v10, v7, :cond_1

    .line 38
    .line 39
    array-length v1, v12

    .line 40
    if-lez v1, :cond_1

    .line 41
    .line 42
    iget-object v1, v0, Lxhss/ᛷᛲᲀᲀ;->ᲇᛶᛴᲀ:Ljava/util/List;

    .line 43
    .line 44
    invoke-static {v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛴᛶᛳ(Ljava/util/List;)V

    .line 45
    .line 46
    .line 47
    :cond_1
    array-length v13, v12

    .line 48
    const/4 v14, 0x0

    .line 49
    move v15, v14

    .line 50
    :goto_1
    if-ge v15, v13, :cond_15

    .line 51
    .line 52
    aget-object v1, v12, v15

    .line 53
    .line 54
    const/4 v2, 0x1

    .line 55
    invoke-virtual {v0, v1, v2}, Lxhss/ᛷᛲᲀᲀ;->ᲇᛴᲇᛵ(Ljava/lang/reflect/Field;Z)Z

    .line 56
    .line 57
    .line 58
    move-result v24

    .line 59
    invoke-virtual {v0, v1, v14}, Lxhss/ᛷᛲᲀᲀ;->ᲇᛴᲇᛵ(Ljava/lang/reflect/Field;Z)Z

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-nez v24, :cond_2

    .line 64
    .line 65
    if-nez v3, :cond_2

    .line 66
    .line 67
    move-object/from16 v3, p1

    .line 68
    .line 69
    goto/16 :goto_f

    .line 70
    .line 71
    :cond_2
    const-class v4, Lxhss/ᛶᲁᲈᛲ;

    .line 72
    .line 73
    const/16 v25, 0x0

    .line 74
    .line 75
    if-eqz p4, :cond_6

    .line 76
    .line 77
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    if-eqz v5, :cond_3

    .line 86
    .line 87
    move/from16 v26, v14

    .line 88
    .line 89
    :goto_2
    move-object/from16 v19, v25

    .line 90
    .line 91
    goto :goto_4

    .line 92
    :cond_3
    sget-object v5, Lxhss/ᲇᛴᛷᲇ;->ᛷᛵᛵᲈ:Lxhss/ᲈᲀᲀᛱ;

    .line 93
    .line 94
    invoke-virtual {v5, v10, v1}, Lxhss/ᲈᲀᲀᛱ;->ᲇᛶᛴᲀ(Ljava/lang/Class;Ljava/lang/reflect/Field;)Ljava/lang/reflect/Method;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    invoke-static {v5}, Lxhss/ᲇᛴᛷᲇ;->ᲇᛶᛴᲀ(Ljava/lang/reflect/AccessibleObject;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v5, v4}, Ljava/lang/reflect/Method;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 102
    .line 103
    .line 104
    move-result-object v6

    .line 105
    if-eqz v6, :cond_5

    .line 106
    .line 107
    invoke-virtual {v1, v4}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    if-eqz v6, :cond_4

    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_4
    invoke-static {v5, v14}, Lxhss/ᲇᛴᛷᲇ;->ᲇᛴᲇᛵ(Ljava/lang/reflect/AccessibleObject;Z)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    new-instance v1, Lxhss/ᛱᲈᛲᛷ;

    .line 119
    .line 120
    const-string v2, "@SerializedName on "

    .line 121
    .line 122
    const-string v3, " is not supported"

    .line 123
    .line 124
    invoke-static {v2, v0, v3}, Lxhss/ᛴᛸᛲᛳ;->ᛸᛶᛴᲈ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    throw v1

    .line 132
    :cond_5
    :goto_3
    move/from16 v26, v3

    .line 133
    .line 134
    move-object/from16 v19, v5

    .line 135
    .line 136
    goto :goto_4

    .line 137
    :cond_6
    move/from16 v26, v3

    .line 138
    .line 139
    goto :goto_2

    .line 140
    :goto_4
    if-nez v19, :cond_7

    .line 141
    .line 142
    invoke-static {v1}, Lxhss/ᲇᛴᛷᲇ;->ᲇᛶᛴᲀ(Ljava/lang/reflect/AccessibleObject;)V

    .line 143
    .line 144
    .line 145
    :cond_7
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getGenericType()Ljava/lang/reflect/Type;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    new-instance v5, Ljava/util/HashMap;

    .line 150
    .line 151
    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 152
    .line 153
    .line 154
    invoke-static {v11, v10, v3, v5}, Lxhss/ᲀᲈᛵᛸ;->ᛳᛶᛷᲀ(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/HashMap;)Ljava/lang/reflect/Type;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    invoke-virtual {v1, v4}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 159
    .line 160
    .line 161
    move-result-object v4

    .line 162
    check-cast v4, Lxhss/ᛶᲁᲈᛲ;

    .line 163
    .line 164
    if-nez v4, :cond_8

    .line 165
    .line 166
    const/16 v4, 0x5f

    .line 167
    .line 168
    iget v5, v0, Lxhss/ᛷᛲᲀᲀ;->ᛳᲁᲇᛸ:I

    .line 169
    .line 170
    packed-switch v5, :pswitch_data_0

    .line 171
    .line 172
    .line 173
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v4

    .line 177
    const/16 v5, 0x2e

    .line 178
    .line 179
    invoke-static {v4, v5}, Lxhss/ᛴᛸᛲᛳ;->ᲇᛴᲇᛵ(Ljava/lang/String;C)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v4

    .line 183
    sget-object v5, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 184
    .line 185
    invoke-virtual {v4, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v4

    .line 189
    goto :goto_5

    .line 190
    :pswitch_0
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v4

    .line 194
    const/16 v5, 0x2d

    .line 195
    .line 196
    invoke-static {v4, v5}, Lxhss/ᛴᛸᛲᛳ;->ᲇᛴᲇᛵ(Ljava/lang/String;C)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v4

    .line 200
    sget-object v5, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 201
    .line 202
    invoke-virtual {v4, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v4

    .line 206
    goto :goto_5

    .line 207
    :pswitch_1
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v5

    .line 211
    invoke-static {v5, v4}, Lxhss/ᛴᛸᛲᛳ;->ᲇᛴᲇᛵ(Ljava/lang/String;C)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v4

    .line 215
    sget-object v5, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 216
    .line 217
    invoke-virtual {v4, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v4

    .line 221
    goto :goto_5

    .line 222
    :pswitch_2
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v5

    .line 226
    invoke-static {v5, v4}, Lxhss/ᛴᛸᛲᛳ;->ᲇᛴᲇᛵ(Ljava/lang/String;C)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v4

    .line 230
    sget-object v5, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 231
    .line 232
    invoke-virtual {v4, v5}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v4

    .line 236
    goto :goto_5

    .line 237
    :pswitch_3
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v4

    .line 241
    const/16 v5, 0x20

    .line 242
    .line 243
    invoke-static {v4, v5}, Lxhss/ᛴᛸᛲᛳ;->ᲇᛴᲇᛵ(Ljava/lang/String;C)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v4

    .line 247
    invoke-static {v4}, Lxhss/ᛴᛸᛲᛳ;->ᛷᛴᛷᛱ(Ljava/lang/String;)Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v4

    .line 251
    goto :goto_5

    .line 252
    :pswitch_4
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v4

    .line 256
    invoke-static {v4}, Lxhss/ᛴᛸᛲᛳ;->ᛷᛴᛷᛱ(Ljava/lang/String;)Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v4

    .line 260
    goto :goto_5

    .line 261
    :pswitch_5
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v4

    .line 265
    :goto_5
    sget-object v5, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 266
    .line 267
    goto :goto_6

    .line 268
    :cond_8
    invoke-interface {v4}, Lxhss/ᛶᲁᲈᛲ;->value()Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v5

    .line 272
    invoke-interface {v4}, Lxhss/ᛶᲁᲈᛲ;->alternate()[Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v4

    .line 276
    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 277
    .line 278
    .line 279
    move-result-object v4

    .line 280
    move-object/from16 v28, v5

    .line 281
    .line 282
    move-object v5, v4

    .line 283
    move-object/from16 v4, v28

    .line 284
    .line 285
    :goto_6
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 286
    .line 287
    .line 288
    move-result v6

    .line 289
    if-eqz v6, :cond_9

    .line 290
    .line 291
    invoke-static {v4}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 292
    .line 293
    .line 294
    move-result-object v4

    .line 295
    move/from16 p2, v2

    .line 296
    .line 297
    move-object v2, v4

    .line 298
    goto :goto_7

    .line 299
    :cond_9
    new-instance v6, Ljava/util/ArrayList;

    .line 300
    .line 301
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 302
    .line 303
    .line 304
    move-result v16

    .line 305
    move/from16 p2, v2

    .line 306
    .line 307
    add-int/lit8 v2, v16, 0x1

    .line 308
    .line 309
    invoke-direct {v6, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 313
    .line 314
    .line 315
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 316
    .line 317
    .line 318
    move-object v2, v6

    .line 319
    :goto_7
    invoke-interface {v2, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v4

    .line 323
    move-object/from16 v17, v4

    .line 324
    .line 325
    check-cast v17, Ljava/lang/String;

    .line 326
    .line 327
    new-instance v4, Lxhss/ᛱᛳᲈᛷ;

    .line 328
    .line 329
    invoke-direct {v4, v3}, Lxhss/ᛱᛳᲈᛷ;-><init>(Ljava/lang/reflect/Type;)V

    .line 330
    .line 331
    .line 332
    iget-object v3, v4, Lxhss/ᛱᛳᲈᛷ;->ᛷᛵᛵᲈ:Ljava/lang/Class;

    .line 333
    .line 334
    if-eqz v3, :cond_a

    .line 335
    .line 336
    invoke-virtual {v3}, Ljava/lang/Class;->isPrimitive()Z

    .line 337
    .line 338
    .line 339
    move-result v3

    .line 340
    if-eqz v3, :cond_a

    .line 341
    .line 342
    move/from16 v22, p2

    .line 343
    .line 344
    goto :goto_8

    .line 345
    :cond_a
    move/from16 v22, v14

    .line 346
    .line 347
    :goto_8
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 348
    .line 349
    .line 350
    move-result v3

    .line 351
    invoke-static {v3}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 352
    .line 353
    .line 354
    move-result v5

    .line 355
    if-eqz v5, :cond_b

    .line 356
    .line 357
    invoke-static {v3}, Ljava/lang/reflect/Modifier;->isFinal(I)Z

    .line 358
    .line 359
    .line 360
    move-result v3

    .line 361
    if-eqz v3, :cond_b

    .line 362
    .line 363
    move/from16 v23, p2

    .line 364
    .line 365
    goto :goto_9

    .line 366
    :cond_b
    move/from16 v23, v14

    .line 367
    .line 368
    :goto_9
    const-class v3, Lxhss/ᛸᛱᲀᛷ;

    .line 369
    .line 370
    invoke-virtual {v1, v3}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 371
    .line 372
    .line 373
    move-result-object v3

    .line 374
    move-object v5, v3

    .line 375
    check-cast v5, Lxhss/ᛸᛱᲀᛷ;

    .line 376
    .line 377
    if-eqz v5, :cond_c

    .line 378
    .line 379
    move-object v6, v2

    .line 380
    iget-object v2, v0, Lxhss/ᛷᛲᲀᲀ;->ᛱᛱᛲᲇ:Lxhss/ᛳᛱᛲᲀ;

    .line 381
    .line 382
    move-object v3, v6

    .line 383
    const/4 v6, 0x0

    .line 384
    move-object/from16 v18, v1

    .line 385
    .line 386
    iget-object v1, v0, Lxhss/ᛷᛲᲀᲀ;->ᛷᛴᛷᛱ:Lxhss/ᛱᲁᲈᛷ;

    .line 387
    .line 388
    move/from16 v16, p2

    .line 389
    .line 390
    move-object/from16 v27, v3

    .line 391
    .line 392
    move-object/from16 v3, p1

    .line 393
    .line 394
    invoke-virtual/range {v1 .. v6}, Lxhss/ᛱᲁᲈᛷ;->ᛱᛱᛲᲇ(Lxhss/ᛳᛱᛲᲀ;Lxhss/ᲈᛲᛶᛴ;Lxhss/ᛱᛳᲈᛷ;Lxhss/ᛸᛱᲀᛷ;Z)Lxhss/ᛲᛱᛶᛴ;

    .line 395
    .line 396
    .line 397
    move-result-object v1

    .line 398
    goto :goto_a

    .line 399
    :cond_c
    move-object/from16 v3, p1

    .line 400
    .line 401
    move/from16 v16, p2

    .line 402
    .line 403
    move-object/from16 v18, v1

    .line 404
    .line 405
    move-object/from16 v27, v2

    .line 406
    .line 407
    move-object/from16 v1, v25

    .line 408
    .line 409
    :goto_a
    if-eqz v1, :cond_d

    .line 410
    .line 411
    move/from16 v2, v16

    .line 412
    .line 413
    goto :goto_b

    .line 414
    :cond_d
    move v2, v14

    .line 415
    :goto_b
    if-nez v1, :cond_e

    .line 416
    .line 417
    invoke-virtual {v3, v4}, Lxhss/ᲈᛲᛶᛴ;->ᛳᲁᲇᛸ(Lxhss/ᛱᛳᲈᛷ;)Lxhss/ᛲᛱᛶᛴ;

    .line 418
    .line 419
    .line 420
    move-result-object v1

    .line 421
    :cond_e
    if-eqz v24, :cond_10

    .line 422
    .line 423
    if-eqz v2, :cond_f

    .line 424
    .line 425
    move-object v2, v1

    .line 426
    goto :goto_c

    .line 427
    :cond_f
    new-instance v2, Lxhss/ᲈᛱᛲᛴ;

    .line 428
    .line 429
    iget-object v4, v4, Lxhss/ᛱᛳᲈᛷ;->ᛱᛱᛲᲇ:Ljava/lang/reflect/Type;

    .line 430
    .line 431
    const/4 v5, 0x2

    .line 432
    invoke-direct {v2, v3, v1, v4, v5}, Lxhss/ᲈᛱᛲᛴ;-><init>(Ljava/lang/Object;Lxhss/ᛲᛱᛶᛴ;Ljava/lang/Object;I)V

    .line 433
    .line 434
    .line 435
    :goto_c
    move-object/from16 v20, v2

    .line 436
    .line 437
    goto :goto_d

    .line 438
    :cond_10
    move-object/from16 v20, v1

    .line 439
    .line 440
    :goto_d
    new-instance v16, Lxhss/ᲁᲀᛸᛲ;

    .line 441
    .line 442
    move-object/from16 v21, v1

    .line 443
    .line 444
    invoke-direct/range {v16 .. v23}, Lxhss/ᲁᲀᛸᛲ;-><init>(Ljava/lang/String;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;Lxhss/ᛲᛱᛶᛴ;Lxhss/ᛲᛱᛶᛴ;ZZ)V

    .line 445
    .line 446
    .line 447
    move-object/from16 v2, v16

    .line 448
    .line 449
    move-object/from16 v4, v17

    .line 450
    .line 451
    move-object/from16 v1, v18

    .line 452
    .line 453
    if-eqz v26, :cond_12

    .line 454
    .line 455
    invoke-interface/range {v27 .. v27}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 456
    .line 457
    .line 458
    move-result-object v5

    .line 459
    :goto_e
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 460
    .line 461
    .line 462
    move-result v6

    .line 463
    if-eqz v6, :cond_12

    .line 464
    .line 465
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 466
    .line 467
    .line 468
    move-result-object v6

    .line 469
    check-cast v6, Ljava/lang/String;

    .line 470
    .line 471
    invoke-interface {v8, v6, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 472
    .line 473
    .line 474
    move-result-object v16

    .line 475
    move-object/from16 v14, v16

    .line 476
    .line 477
    check-cast v14, Lxhss/ᲁᲀᛸᛲ;

    .line 478
    .line 479
    if-nez v14, :cond_11

    .line 480
    .line 481
    const/4 v14, 0x0

    .line 482
    goto :goto_e

    .line 483
    :cond_11
    iget-object v0, v14, Lxhss/ᲁᲀᛸᛲ;->ᛱᛱᛲᲇ:Ljava/lang/reflect/Field;

    .line 484
    .line 485
    invoke-static {v7, v6, v0, v1}, Lxhss/ᛷᛲᲀᲀ;->ᛱᛱᛲᲇ(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;)V

    .line 486
    .line 487
    .line 488
    throw v25

    .line 489
    :cond_12
    if-eqz v24, :cond_14

    .line 490
    .line 491
    invoke-interface {v9, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 492
    .line 493
    .line 494
    move-result-object v2

    .line 495
    check-cast v2, Lxhss/ᲁᲀᛸᛲ;

    .line 496
    .line 497
    if-nez v2, :cond_13

    .line 498
    .line 499
    goto :goto_f

    .line 500
    :cond_13
    iget-object v0, v2, Lxhss/ᲁᲀᛸᛲ;->ᛱᛱᛲᲇ:Ljava/lang/reflect/Field;

    .line 501
    .line 502
    invoke-static {v7, v4, v0, v1}, Lxhss/ᛷᛲᲀᲀ;->ᛱᛱᛲᲇ(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;)V

    .line 503
    .line 504
    .line 505
    throw v25

    .line 506
    :cond_14
    :goto_f
    add-int/lit8 v15, v15, 0x1

    .line 507
    .line 508
    const/4 v14, 0x0

    .line 509
    goto/16 :goto_1

    .line 510
    .line 511
    :cond_15
    move-object/from16 v3, p1

    .line 512
    .line 513
    invoke-virtual {v10}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    .line 514
    .line 515
    .line 516
    move-result-object v1

    .line 517
    new-instance v2, Ljava/util/HashMap;

    .line 518
    .line 519
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 520
    .line 521
    .line 522
    invoke-static {v11, v10, v1, v2}, Lxhss/ᲀᲈᛵᛸ;->ᛳᛶᛷᲀ(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/HashMap;)Ljava/lang/reflect/Type;

    .line 523
    .line 524
    .line 525
    move-result-object v1

    .line 526
    new-instance v2, Lxhss/ᛱᛳᲈᛷ;

    .line 527
    .line 528
    invoke-direct {v2, v1}, Lxhss/ᛱᛳᲈᛷ;-><init>(Ljava/lang/reflect/Type;)V

    .line 529
    .line 530
    .line 531
    iget-object v10, v2, Lxhss/ᛱᛳᲈᛷ;->ᛷᛵᛵᲈ:Ljava/lang/Class;

    .line 532
    .line 533
    move-object v1, v2

    .line 534
    goto/16 :goto_0

    .line 535
    .line 536
    :cond_16
    new-instance v0, Lxhss/ᛲᛸᲈᲇ;

    .line 537
    .line 538
    new-instance v1, Ljava/util/ArrayList;

    .line 539
    .line 540
    invoke-virtual {v9}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 541
    .line 542
    .line 543
    move-result-object v2

    .line 544
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 545
    .line 546
    .line 547
    invoke-direct {v0, v8, v1}, Lxhss/ᛲᛸᲈᲇ;-><init>(Ljava/util/Map;Ljava/util/List;)V

    .line 548
    .line 549
    .line 550
    return-object v0

    .line 551
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ᛷᛵᛵᲈ(Lxhss/ᲈᛲᛶᛴ;Lxhss/ᛱᛳᲈᛷ;)Lxhss/ᛲᛱᛶᛴ;
    .locals 4

    .line 1
    iget-object v0, p2, Lxhss/ᛱᛳᲈᛷ;->ᛷᛵᛵᲈ:Ljava/lang/Class;

    .line 2
    .line 3
    const-class v1, Ljava/lang/Object;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0

    .line 13
    :cond_0
    sget-object v1, Lxhss/ᲇᛴᛷᲇ;->ᛷᛵᛵᲈ:Lxhss/ᲈᲀᲀᛱ;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Class;->getModifiers()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_2

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Class;->isAnonymousClass()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-nez v1, :cond_1

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/Class;->isLocalClass()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    :cond_1
    new-instance p0, Lxhss/ᛴᛳᛲ;

    .line 38
    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    .line 41
    .line 42
    return-object p0

    .line 43
    :cond_2
    iget-object v1, p0, Lxhss/ᛷᛲᲀᲀ;->ᲇᛶᛴᲀ:Ljava/util/List;

    .line 44
    .line 45
    invoke-static {v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛴᛶᛳ(Ljava/util/List;)V

    .line 46
    .line 47
    .line 48
    sget-object v1, Lxhss/ᲇᛴᛷᲇ;->ᛷᛵᛵᲈ:Lxhss/ᲈᲀᲀᛱ;

    .line 49
    .line 50
    invoke-virtual {v1, v0}, Lxhss/ᲈᲀᲀᛱ;->ᛱᛳᲁᲈ(Ljava/lang/Class;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    const/4 v2, 0x1

    .line 55
    if-eqz v1, :cond_3

    .line 56
    .line 57
    new-instance v1, Lxhss/ᛴᛶᲇᛸ;

    .line 58
    .line 59
    invoke-virtual {p0, p1, p2, v0, v2}, Lxhss/ᛷᛲᲀᲀ;->ᛳᲁᲇᛸ(Lxhss/ᲈᛲᛶᛴ;Lxhss/ᛱᛳᲈᛷ;Ljava/lang/Class;Z)Lxhss/ᛲᛸᲈᲇ;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-direct {v1, v0, p0}, Lxhss/ᛴᛶᲇᛸ;-><init>(Ljava/lang/Class;Lxhss/ᛲᛸᲈᲇ;)V

    .line 64
    .line 65
    .line 66
    return-object v1

    .line 67
    :cond_3
    iget-object v1, p0, Lxhss/ᛷᛲᲀᲀ;->ᛱᛱᛲᲇ:Lxhss/ᛳᛱᛲᲀ;

    .line 68
    .line 69
    invoke-virtual {v1, p2, v2}, Lxhss/ᛳᛱᛲᲀ;->ᛸᛶᲈᛶ(Lxhss/ᛱᛳᲈᛷ;Z)Lxhss/ᲁᲀᛶᛲ;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    new-instance v2, Lxhss/ᛱᲁᲈᛲ;

    .line 74
    .line 75
    const/4 v3, 0x0

    .line 76
    invoke-virtual {p0, p1, p2, v0, v3}, Lxhss/ᛷᛲᲀᲀ;->ᛳᲁᲇᛸ(Lxhss/ᲈᛲᛶᛴ;Lxhss/ᛱᛳᲈᛷ;Ljava/lang/Class;Z)Lxhss/ᛲᛸᲈᲇ;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-direct {v2, v1, p0}, Lxhss/ᛱᲁᲈᛲ;-><init>(Lxhss/ᲁᲀᛶᛲ;Lxhss/ᛲᛸᲈᲇ;)V

    .line 81
    .line 82
    .line 83
    return-object v2
.end method

.method public final ᲇᛴᲇᛵ(Ljava/lang/reflect/Field;Z)Z
    .locals 2

    .line 1
    iget-object p0, p0, Lxhss/ᛷᛲᲀᲀ;->ᲇᛴᲇᛵ:Lxhss/ᛱᛷᲈᛱ;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/16 v0, 0x88

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    and-int/2addr v0, v1

    .line 13
    const/4 v1, 0x1

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    :goto_0
    move p0, v1

    .line 17
    goto :goto_3

    .line 18
    :cond_0
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->isSynthetic()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p0, p1, p2}, Lxhss/ᛱᛷᲈᛱ;->ᛱᛱᛲᲇ(Ljava/lang/Class;Z)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_2

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    if-eqz p2, :cond_3

    .line 37
    .line 38
    iget-object p0, p0, Lxhss/ᛱᛷᲈᛱ;->ᛱᛱᛲᲇ:Ljava/util/List;

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_3
    iget-object p0, p0, Lxhss/ᛱᛷᲈᛱ;->ᛳᲁᲇᛸ:Ljava/util/List;

    .line 42
    .line 43
    :goto_1
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-nez p1, :cond_5

    .line 48
    .line 49
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    if-nez p1, :cond_4

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_4
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    new-instance p0, Ljava/lang/ClassCastException;

    .line 68
    .line 69
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 70
    .line 71
    .line 72
    throw p0

    .line 73
    :cond_5
    :goto_2
    const/4 p0, 0x0

    .line 74
    :goto_3
    xor-int/2addr p0, v1

    .line 75
    return p0
.end method
