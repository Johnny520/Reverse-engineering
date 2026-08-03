.class public final Lk6/w;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lh6/o;


# instance fields
.field public final g:Lh0/q0;

.field public final h:I

.field public final i:Lj6/d;

.field public final j:Lk6/l;

.field public final k:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Lh0/q0;ILj6/d;Lk6/l;Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk6/w;->g:Lh0/q0;

    .line 5
    .line 6
    iput p2, p0, Lk6/w;->h:I

    .line 7
    .line 8
    iput-object p3, p0, Lk6/w;->i:Lj6/d;

    .line 9
    .line 10
    iput-object p4, p0, Lk6/w;->j:Lk6/l;

    .line 11
    .line 12
    iput-object p5, p0, Lk6/w;->k:Ljava/util/ArrayList;

    .line 13
    .line 14
    return-void
.end method

.method public static b(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;)V
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
    invoke-static {p2}, Ll6/c;->c(Ljava/lang/reflect/Field;)Ljava/lang/String;

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
    invoke-static {p3}, Ll6/c;->c(Ljava/lang/reflect/Field;)Ljava/lang/String;

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
.method public final a(Lh6/f;Ln6/a;)Lh6/n;
    .locals 3

    .line 1
    iget-object v0, p2, Ln6/a;->a:Ljava/lang/Class;

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
    const/4 p1, 0x0

    .line 12
    return-object p1

    .line 13
    :cond_0
    sget-object v1, Ll6/c;->a:Lf8/i;

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
    const/4 v2, 0x1

    .line 24
    if-nez v1, :cond_2

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Class;->isAnonymousClass()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_1

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Class;->isLocalClass()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    :cond_1
    new-instance p1, Lk6/o;

    .line 39
    .line 40
    invoke-direct {p1, v2}, Lk6/o;-><init>(I)V

    .line 41
    .line 42
    .line 43
    return-object p1

    .line 44
    :cond_2
    iget-object v1, p0, Lk6/w;->k:Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-static {v1}, Lj6/h;->d(Ljava/util/ArrayList;)V

    .line 47
    .line 48
    .line 49
    sget-object v1, Ll6/c;->a:Lf8/i;

    .line 50
    .line 51
    invoke-virtual {v1, v0}, Lf8/i;->X(Ljava/lang/Class;)Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-eqz v1, :cond_3

    .line 56
    .line 57
    new-instance v1, Lk6/v;

    .line 58
    .line 59
    invoke-virtual {p0, p1, p2, v0, v2}, Lk6/w;->c(Lh6/f;Ln6/a;Ljava/lang/Class;Z)Lk6/u;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-direct {v1, v0, p1}, Lk6/v;-><init>(Ljava/lang/Class;Lk6/u;)V

    .line 64
    .line 65
    .line 66
    return-object v1

    .line 67
    :cond_3
    iget-object v1, p0, Lk6/w;->g:Lh0/q0;

    .line 68
    .line 69
    invoke-virtual {v1, p2, v2}, Lh0/q0;->c(Ln6/a;Z)Lj6/o;

    .line 70
    .line 71
    .line 72
    new-instance v1, Lk6/t;

    .line 73
    .line 74
    const/4 v2, 0x0

    .line 75
    invoke-virtual {p0, p1, p2, v0, v2}, Lk6/w;->c(Lh6/f;Ln6/a;Ljava/lang/Class;Z)Lk6/u;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-direct {v1, p1}, Lk6/s;-><init>(Lk6/u;)V

    .line 80
    .line 81
    .line 82
    return-object v1
.end method

.method public final c(Lh6/f;Ln6/a;Ljava/lang/Class;Z)Lk6/u;
    .locals 23

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
    sget-object v1, Lk6/u;->b:Lk6/u;

    .line 12
    .line 13
    return-object v1

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
    iget-object v11, v1, Ln6/a;->b:Ljava/lang/reflect/Type;

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
    iget-object v1, v0, Lk6/w;->k:Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-static {v1}, Lj6/h;->d(Ljava/util/ArrayList;)V

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
    invoke-virtual {v0, v1, v2}, Lk6/w;->d(Ljava/lang/reflect/Field;Z)Z

    .line 56
    .line 57
    .line 58
    move-result v16

    .line 59
    invoke-virtual {v0, v1, v14}, Lk6/w;->d(Ljava/lang/reflect/Field;Z)Z

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-nez v16, :cond_2

    .line 64
    .line 65
    if-nez v3, :cond_2

    .line 66
    .line 67
    move-object/from16 v3, p1

    .line 68
    .line 69
    move-object/from16 p2, v12

    .line 70
    .line 71
    move/from16 v20, v13

    .line 72
    .line 73
    move/from16 v21, v14

    .line 74
    .line 75
    goto/16 :goto_c

    .line 76
    .line 77
    :cond_2
    const-class v4, Li6/b;

    .line 78
    .line 79
    const/16 v17, 0x0

    .line 80
    .line 81
    if-eqz p4, :cond_6

    .line 82
    .line 83
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 88
    .line 89
    .line 90
    move-result v5

    .line 91
    if-eqz v5, :cond_3

    .line 92
    .line 93
    move/from16 v18, v14

    .line 94
    .line 95
    :goto_2
    move-object/from16 v5, v17

    .line 96
    .line 97
    goto :goto_4

    .line 98
    :cond_3
    sget-object v5, Ll6/c;->a:Lf8/i;

    .line 99
    .line 100
    invoke-virtual {v5, v10, v1}, Lf8/i;->x(Ljava/lang/Class;Ljava/lang/reflect/Field;)Ljava/lang/reflect/Method;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    invoke-static {v5}, Ll6/c;->f(Ljava/lang/reflect/AccessibleObject;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v5, v4}, Ljava/lang/reflect/Method;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    if-eqz v6, :cond_5

    .line 112
    .line 113
    invoke-virtual {v1, v4}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 114
    .line 115
    .line 116
    move-result-object v6

    .line 117
    if-eqz v6, :cond_4

    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_4
    invoke-static {v5, v14}, Ll6/c;->d(Ljava/lang/reflect/AccessibleObject;Z)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    new-instance v2, Laf/d;

    .line 125
    .line 126
    const-string v3, "@SerializedName on "

    .line 127
    .line 128
    const-string v4, " is not supported"

    .line 129
    .line 130
    invoke-static {v3, v1, v4}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    invoke-direct {v2, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    throw v2

    .line 138
    :cond_5
    :goto_3
    move/from16 v18, v3

    .line 139
    .line 140
    goto :goto_4

    .line 141
    :cond_6
    move/from16 v18, v3

    .line 142
    .line 143
    goto :goto_2

    .line 144
    :goto_4
    if-nez v5, :cond_7

    .line 145
    .line 146
    invoke-static {v1}, Ll6/c;->f(Ljava/lang/reflect/AccessibleObject;)V

    .line 147
    .line 148
    .line 149
    :cond_7
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getGenericType()Ljava/lang/reflect/Type;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    new-instance v6, Ljava/util/HashMap;

    .line 154
    .line 155
    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 156
    .line 157
    .line 158
    invoke-static {v11, v10, v3, v6}, Lj6/h;->h(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/HashMap;)Ljava/lang/reflect/Type;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    invoke-virtual {v1, v4}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 163
    .line 164
    .line 165
    move-result-object v4

    .line 166
    check-cast v4, Li6/b;

    .line 167
    .line 168
    if-nez v4, :cond_8

    .line 169
    .line 170
    iget v4, v0, Lk6/w;->h:I

    .line 171
    .line 172
    packed-switch v4, :pswitch_data_0

    .line 173
    .line 174
    .line 175
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v4

    .line 179
    const/16 v6, 0x2e

    .line 180
    .line 181
    invoke-static {v4, v6}, Leh/a;->a(Ljava/lang/String;C)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v4

    .line 185
    sget-object v6, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 186
    .line 187
    invoke-virtual {v4, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v4

    .line 191
    goto :goto_5

    .line 192
    :pswitch_0
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v4

    .line 196
    const/16 v6, 0x2d

    .line 197
    .line 198
    invoke-static {v4, v6}, Leh/a;->a(Ljava/lang/String;C)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v4

    .line 202
    sget-object v6, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 203
    .line 204
    invoke-virtual {v4, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v4

    .line 208
    goto :goto_5

    .line 209
    :pswitch_1
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v4

    .line 213
    const/16 v6, 0x5f

    .line 214
    .line 215
    invoke-static {v4, v6}, Leh/a;->a(Ljava/lang/String;C)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v4

    .line 219
    sget-object v6, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 220
    .line 221
    invoke-virtual {v4, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v4

    .line 225
    goto :goto_5

    .line 226
    :pswitch_2
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v4

    .line 230
    const/16 v6, 0x5f

    .line 231
    .line 232
    invoke-static {v4, v6}, Leh/a;->a(Ljava/lang/String;C)Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v4

    .line 236
    sget-object v6, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 237
    .line 238
    invoke-virtual {v4, v6}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v4

    .line 242
    goto :goto_5

    .line 243
    :pswitch_3
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v4

    .line 247
    const/16 v6, 0x20

    .line 248
    .line 249
    invoke-static {v4, v6}, Leh/a;->a(Ljava/lang/String;C)Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v4

    .line 253
    invoke-static {v4}, Leh/a;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v4

    .line 257
    goto :goto_5

    .line 258
    :pswitch_4
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v4

    .line 262
    invoke-static {v4}, Leh/a;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v4

    .line 266
    goto :goto_5

    .line 267
    :pswitch_5
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v4

    .line 271
    :goto_5
    sget-object v6, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 272
    .line 273
    goto :goto_6

    .line 274
    :cond_8
    invoke-interface {v4}, Li6/b;->value()Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v6

    .line 278
    invoke-interface {v4}, Li6/b;->alternate()[Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v4

    .line 282
    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 283
    .line 284
    .line 285
    move-result-object v4

    .line 286
    move-object/from16 v22, v6

    .line 287
    .line 288
    move-object v6, v4

    .line 289
    move-object/from16 v4, v22

    .line 290
    .line 291
    :goto_6
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    .line 292
    .line 293
    .line 294
    move-result v19

    .line 295
    if-eqz v19, :cond_9

    .line 296
    .line 297
    invoke-static {v4}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 298
    .line 299
    .line 300
    move-result-object v4

    .line 301
    move/from16 p2, v2

    .line 302
    .line 303
    move v2, v14

    .line 304
    move-object v14, v4

    .line 305
    goto :goto_7

    .line 306
    :cond_9
    move/from16 p2, v2

    .line 307
    .line 308
    new-instance v2, Ljava/util/ArrayList;

    .line 309
    .line 310
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 311
    .line 312
    .line 313
    move-result v19

    .line 314
    add-int/lit8 v14, v19, 0x1

    .line 315
    .line 316
    invoke-direct {v2, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 317
    .line 318
    .line 319
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 320
    .line 321
    .line 322
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 323
    .line 324
    .line 325
    move-object v14, v2

    .line 326
    const/4 v2, 0x0

    .line 327
    :goto_7
    invoke-interface {v14, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object v4

    .line 331
    check-cast v4, Ljava/lang/String;

    .line 332
    .line 333
    move-object v6, v4

    .line 334
    new-instance v4, Ln6/a;

    .line 335
    .line 336
    invoke-direct {v4, v3}, Ln6/a;-><init>(Ljava/lang/reflect/Type;)V

    .line 337
    .line 338
    .line 339
    iget-object v3, v4, Ln6/a;->a:Ljava/lang/Class;

    .line 340
    .line 341
    if-eqz v3, :cond_a

    .line 342
    .line 343
    invoke-virtual {v3}, Ljava/lang/Class;->isPrimitive()Z

    .line 344
    .line 345
    .line 346
    move-result v3

    .line 347
    :cond_a
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
    move-result v19

    .line 355
    if-eqz v19, :cond_b

    .line 356
    .line 357
    invoke-static {v3}, Ljava/lang/reflect/Modifier;->isFinal(I)Z

    .line 358
    .line 359
    .line 360
    move-result v3

    .line 361
    :cond_b
    const-class v3, Li6/a;

    .line 362
    .line 363
    invoke-virtual {v1, v3}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 364
    .line 365
    .line 366
    move-result-object v3

    .line 367
    check-cast v3, Li6/a;

    .line 368
    .line 369
    if-eqz v3, :cond_c

    .line 370
    .line 371
    move/from16 v20, v2

    .line 372
    .line 373
    iget-object v2, v0, Lk6/w;->g:Lh0/q0;

    .line 374
    .line 375
    move-object/from16 v19, v6

    .line 376
    .line 377
    const/4 v6, 0x0

    .line 378
    move-object/from16 v21, v1

    .line 379
    .line 380
    iget-object v1, v0, Lk6/w;->j:Lk6/l;

    .line 381
    .line 382
    move-object/from16 v0, v21

    .line 383
    .line 384
    move/from16 v21, v20

    .line 385
    .line 386
    move/from16 v20, v13

    .line 387
    .line 388
    move-object/from16 v13, v19

    .line 389
    .line 390
    move/from16 v19, p2

    .line 391
    .line 392
    move-object/from16 p2, v12

    .line 393
    .line 394
    move-object v12, v5

    .line 395
    move-object v5, v3

    .line 396
    move-object/from16 v3, p1

    .line 397
    .line 398
    invoke-virtual/range {v1 .. v6}, Lk6/l;->b(Lh0/q0;Lh6/f;Ln6/a;Li6/a;Z)Lh6/n;

    .line 399
    .line 400
    .line 401
    move-result-object v1

    .line 402
    goto :goto_8

    .line 403
    :cond_c
    move-object/from16 v3, p1

    .line 404
    .line 405
    move/from16 v19, p2

    .line 406
    .line 407
    move-object v0, v1

    .line 408
    move/from16 v21, v2

    .line 409
    .line 410
    move-object/from16 p2, v12

    .line 411
    .line 412
    move/from16 v20, v13

    .line 413
    .line 414
    move-object v12, v5

    .line 415
    move-object v13, v6

    .line 416
    move-object/from16 v1, v17

    .line 417
    .line 418
    :goto_8
    if-eqz v1, :cond_d

    .line 419
    .line 420
    move/from16 v2, v19

    .line 421
    .line 422
    goto :goto_9

    .line 423
    :cond_d
    move/from16 v2, v21

    .line 424
    .line 425
    :goto_9
    if-nez v1, :cond_e

    .line 426
    .line 427
    invoke-virtual {v3, v4}, Lh6/f;->b(Ln6/a;)Lh6/n;

    .line 428
    .line 429
    .line 430
    move-result-object v1

    .line 431
    :cond_e
    if-eqz v16, :cond_10

    .line 432
    .line 433
    if-eqz v2, :cond_f

    .line 434
    .line 435
    goto :goto_a

    .line 436
    :cond_f
    new-instance v2, Lk6/y;

    .line 437
    .line 438
    iget-object v4, v4, Ln6/a;->b:Ljava/lang/reflect/Type;

    .line 439
    .line 440
    invoke-direct {v2, v3, v1, v4}, Lk6/y;-><init>(Lh6/f;Lh6/n;Ljava/lang/reflect/Type;)V

    .line 441
    .line 442
    .line 443
    move-object v1, v2

    .line 444
    :cond_10
    :goto_a
    new-instance v2, Lk6/r;

    .line 445
    .line 446
    invoke-direct {v2, v13, v0, v12, v1}, Lk6/r;-><init>(Ljava/lang/String;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;Lh6/n;)V

    .line 447
    .line 448
    .line 449
    if-eqz v18, :cond_12

    .line 450
    .line 451
    invoke-interface {v14}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 452
    .line 453
    .line 454
    move-result-object v1

    .line 455
    :goto_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 456
    .line 457
    .line 458
    move-result v4

    .line 459
    if-eqz v4, :cond_12

    .line 460
    .line 461
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 462
    .line 463
    .line 464
    move-result-object v4

    .line 465
    check-cast v4, Ljava/lang/String;

    .line 466
    .line 467
    invoke-interface {v8, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 468
    .line 469
    .line 470
    move-result-object v5

    .line 471
    check-cast v5, Lk6/r;

    .line 472
    .line 473
    if-nez v5, :cond_11

    .line 474
    .line 475
    goto :goto_b

    .line 476
    :cond_11
    iget-object v1, v5, Lk6/r;->b:Ljava/lang/reflect/Field;

    .line 477
    .line 478
    invoke-static {v7, v4, v1, v0}, Lk6/w;->b(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;)V

    .line 479
    .line 480
    .line 481
    throw v17

    .line 482
    :cond_12
    if-eqz v16, :cond_14

    .line 483
    .line 484
    invoke-interface {v9, v13, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 485
    .line 486
    .line 487
    move-result-object v1

    .line 488
    check-cast v1, Lk6/r;

    .line 489
    .line 490
    if-nez v1, :cond_13

    .line 491
    .line 492
    goto :goto_c

    .line 493
    :cond_13
    iget-object v1, v1, Lk6/r;->b:Ljava/lang/reflect/Field;

    .line 494
    .line 495
    invoke-static {v7, v13, v1, v0}, Lk6/w;->b(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;)V

    .line 496
    .line 497
    .line 498
    throw v17

    .line 499
    :cond_14
    :goto_c
    add-int/lit8 v15, v15, 0x1

    .line 500
    .line 501
    move-object/from16 v0, p0

    .line 502
    .line 503
    move-object/from16 v12, p2

    .line 504
    .line 505
    move/from16 v13, v20

    .line 506
    .line 507
    move/from16 v14, v21

    .line 508
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
    move-result-object v0

    .line 517
    new-instance v1, Ljava/util/HashMap;

    .line 518
    .line 519
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 520
    .line 521
    .line 522
    invoke-static {v11, v10, v0, v1}, Lj6/h;->h(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/HashMap;)Ljava/lang/reflect/Type;

    .line 523
    .line 524
    .line 525
    move-result-object v0

    .line 526
    new-instance v1, Ln6/a;

    .line 527
    .line 528
    invoke-direct {v1, v0}, Ln6/a;-><init>(Ljava/lang/reflect/Type;)V

    .line 529
    .line 530
    .line 531
    iget-object v10, v1, Ln6/a;->a:Ljava/lang/Class;

    .line 532
    .line 533
    move-object/from16 v0, p0

    .line 534
    .line 535
    goto/16 :goto_0

    .line 536
    .line 537
    :cond_16
    new-instance v0, Lk6/u;

    .line 538
    .line 539
    new-instance v1, Ljava/util/ArrayList;

    .line 540
    .line 541
    invoke-virtual {v9}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 542
    .line 543
    .line 544
    move-result-object v2

    .line 545
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 546
    .line 547
    .line 548
    invoke-direct {v0, v1}, Lk6/u;-><init>(Ljava/util/List;)V

    .line 549
    .line 550
    .line 551
    return-object v0

    .line 552
    nop

    .line 553
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

.method public final d(Ljava/lang/reflect/Field;Z)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lk6/w;->i:Lj6/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/16 v1, 0x88

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    and-int/2addr v1, v2

    .line 13
    const/4 v2, 0x1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    :goto_0
    move p1, v2

    .line 17
    goto :goto_3

    .line 18
    :cond_0
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->isSynthetic()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_1

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
    invoke-virtual {v0, p1, p2}, Lj6/d;->c(Ljava/lang/Class;Z)Z

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
    iget-object p1, v0, Lj6/d;->h:Ljava/util/List;

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_3
    iget-object p1, v0, Lj6/d;->i:Ljava/util/List;

    .line 42
    .line 43
    :goto_1
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    if-nez p2, :cond_5

    .line 48
    .line 49
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result p2

    .line 57
    if-nez p2, :cond_4

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_4
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    invoke-static {}, Lah/a;->d()V

    .line 68
    .line 69
    .line 70
    const/4 p1, 0x0

    .line 71
    return p1

    .line 72
    :cond_5
    :goto_2
    const/4 p1, 0x0

    .line 73
    :goto_3
    xor-int/2addr p1, v2

    .line 74
    return p1
.end method
