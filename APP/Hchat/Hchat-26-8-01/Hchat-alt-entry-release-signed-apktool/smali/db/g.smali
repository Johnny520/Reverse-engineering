.class public final Ldb/g;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Landroid/content/SharedPreferences;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "Hchat_scheduled_task_config"

    .line 5
    .line 6
    invoke-static {p1, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Ldb/g;->a:Landroid/content/SharedPreferences;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ldb/g;->f()Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    new-instance v1, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    move-object v3, v2

    .line 28
    check-cast v3, Ldb/c;

    .line 29
    .line 30
    iget-object v3, v3, Ldb/c;->a:Ljava/lang/String;

    .line 31
    .line 32
    invoke-static {v3, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-nez v3, :cond_0

    .line 37
    .line 38
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    invoke-virtual {p0, v1}, Ldb/g;->e(Ljava/util/ArrayList;)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public final b(Ljava/lang/String;)Ldb/c;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ldb/g;->f()Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    move-object v2, v1

    .line 23
    check-cast v2, Ldb/c;

    .line 24
    .line 25
    iget-object v2, v2, Ldb/c;->a:Ljava/lang/String;

    .line 26
    .line 27
    invoke-static {v2, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    const/4 v1, 0x0

    .line 43
    :goto_0
    check-cast v1, Ldb/c;

    .line 44
    .line 45
    return-object v1
.end method

.method public final c()Z
    .locals 3

    .line 1
    const-string v0, "scheduled_task_enable"

    .line 2
    .line 3
    :try_start_0
    iget-object v1, p0, Ldb/g;->a:Landroid/content/SharedPreferences;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-interface {v1, v0, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    goto :goto_1

    .line 15
    :cond_0
    :goto_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 16
    .line 17
    .line 18
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    goto :goto_2

    .line 20
    :goto_1
    new-instance v1, Lsf/f;

    .line 21
    .line 22
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    move-object v0, v1

    .line 26
    :goto_2
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 27
    .line 28
    instance-of v2, v0, Lsf/f;

    .line 29
    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    move-object v0, v1

    .line 33
    :cond_1
    check-cast v0, Ljava/lang/Boolean;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    return v0
.end method

.method public final d(Ldb/c;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Ldb/g;->f()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    move-object v3, v2

    .line 25
    check-cast v3, Ldb/c;

    .line 26
    .line 27
    iget-object v3, v3, Ldb/c;->a:Ljava/lang/String;

    .line 28
    .line 29
    iget-object v4, p1, Ldb/c;->a:Ljava/lang/String;

    .line 30
    .line 31
    invoke-static {v3, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-nez v3, :cond_0

    .line 36
    .line 37
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    invoke-static {v1, p1}, Ltf/m;->G1(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p0, p1}, Ldb/g;->e(Ljava/util/ArrayList;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public final e(Ljava/util/ArrayList;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Ldb/g;->a:Landroid/content/SharedPreferences;

    .line 4
    .line 5
    if-eqz v1, :cond_22

    .line 6
    .line 7
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-eqz v1, :cond_22

    .line 12
    .line 13
    new-instance v2, Lorg/json/JSONArray;

    .line 14
    .line 15
    invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V

    .line 16
    .line 17
    .line 18
    new-instance v3, La9/h;

    .line 19
    .line 20
    const/16 v4, 0x9

    .line 21
    .line 22
    invoke-direct {v3, v4}, La9/h;-><init>(I)V

    .line 23
    .line 24
    .line 25
    move-object/from16 v4, p1

    .line 26
    .line 27
    invoke-static {v4, v3}, Ltf/m;->K1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-eqz v4, :cond_21

    .line 40
    .line 41
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    check-cast v4, Ldb/c;

    .line 46
    .line 47
    new-instance v5, Lorg/json/JSONObject;

    .line 48
    .line 49
    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    .line 50
    .line 51
    .line 52
    invoke-static {v4}, La2/a;->t(Ldb/c;)Ljava/util/ArrayList;

    .line 53
    .line 54
    .line 55
    move-result-object v6

    .line 56
    iget v7, v4, Ldb/c;->r:I

    .line 57
    .line 58
    invoke-static {v6}, Ltf/m;->v1(Ljava/util/List;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v8

    .line 62
    check-cast v8, Ldb/a;

    .line 63
    .line 64
    const/4 v10, 0x0

    .line 65
    if-eqz v8, :cond_0

    .line 66
    .line 67
    iget v8, v8, Ldb/a;->a:I

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_0
    iget v8, v4, Ldb/c;->b:I

    .line 71
    .line 72
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 73
    .line 74
    .line 75
    move-result-object v11

    .line 76
    if-ltz v8, :cond_1

    .line 77
    .line 78
    const/16 v12, 0x9

    .line 79
    .line 80
    if-ge v8, v12, :cond_1

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_1
    const/4 v11, 0x0

    .line 84
    :goto_1
    if-eqz v11, :cond_2

    .line 85
    .line 86
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 87
    .line 88
    .line 89
    move-result v8

    .line 90
    goto :goto_2

    .line 91
    :cond_2
    move v8, v10

    .line 92
    :goto_2
    const/4 v11, 0x6

    .line 93
    sget-object v12, Ltf/t;->g:Ltf/t;

    .line 94
    .line 95
    if-eqz v8, :cond_4

    .line 96
    .line 97
    if-ne v8, v11, :cond_3

    .line 98
    .line 99
    goto :goto_3

    .line 100
    :cond_3
    move-object v9, v12

    .line 101
    goto :goto_6

    .line 102
    :cond_4
    :goto_3
    new-instance v13, Ljava/util/ArrayList;

    .line 103
    .line 104
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 108
    .line 109
    .line 110
    move-result-object v14

    .line 111
    :cond_5
    :goto_4
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 112
    .line 113
    .line 114
    move-result v15

    .line 115
    if-eqz v15, :cond_6

    .line 116
    .line 117
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v15

    .line 121
    move-object v9, v15

    .line 122
    check-cast v9, Ldb/a;

    .line 123
    .line 124
    iget v9, v9, Ldb/a;->a:I

    .line 125
    .line 126
    if-ne v9, v8, :cond_5

    .line 127
    .line 128
    invoke-virtual {v13, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    goto :goto_4

    .line 132
    :cond_6
    new-instance v9, Ljava/util/ArrayList;

    .line 133
    .line 134
    invoke-static {v13}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 135
    .line 136
    .line 137
    move-result v14

    .line 138
    invoke-direct {v9, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 142
    .line 143
    .line 144
    move-result-object v13

    .line 145
    :goto_5
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 146
    .line 147
    .line 148
    move-result v14

    .line 149
    if-eqz v14, :cond_7

    .line 150
    .line 151
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v14

    .line 155
    check-cast v14, Ldb/a;

    .line 156
    .line 157
    iget-object v14, v14, Ldb/a;->b:Ljava/lang/String;

    .line 158
    .line 159
    invoke-virtual {v9, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    goto :goto_5

    .line 163
    :cond_7
    :goto_6
    if-eqz v8, :cond_c

    .line 164
    .line 165
    if-ne v8, v11, :cond_8

    .line 166
    .line 167
    goto :goto_9

    .line 168
    :cond_8
    const/16 v11, 0x8

    .line 169
    .line 170
    if-eq v8, v11, :cond_c

    .line 171
    .line 172
    new-instance v11, Ljava/util/ArrayList;

    .line 173
    .line 174
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 178
    .line 179
    .line 180
    move-result-object v12

    .line 181
    :cond_9
    :goto_7
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 182
    .line 183
    .line 184
    move-result v13

    .line 185
    if-eqz v13, :cond_a

    .line 186
    .line 187
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v13

    .line 191
    move-object v14, v13

    .line 192
    check-cast v14, Ldb/a;

    .line 193
    .line 194
    iget v14, v14, Ldb/a;->a:I

    .line 195
    .line 196
    if-ne v14, v8, :cond_9

    .line 197
    .line 198
    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    goto :goto_7

    .line 202
    :cond_a
    new-instance v12, Ljava/util/ArrayList;

    .line 203
    .line 204
    invoke-static {v11}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 205
    .line 206
    .line 207
    move-result v13

    .line 208
    invoke-direct {v12, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 212
    .line 213
    .line 214
    move-result-object v11

    .line 215
    :goto_8
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 216
    .line 217
    .line 218
    move-result v13

    .line 219
    if-eqz v13, :cond_b

    .line 220
    .line 221
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v13

    .line 225
    check-cast v13, Ldb/a;

    .line 226
    .line 227
    iget-object v13, v13, Ldb/a;->b:Ljava/lang/String;

    .line 228
    .line 229
    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    goto :goto_8

    .line 233
    :cond_b
    invoke-static {v12}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 234
    .line 235
    .line 236
    move-result-object v11

    .line 237
    invoke-static {v11}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 238
    .line 239
    .line 240
    move-result-object v12

    .line 241
    :cond_c
    :goto_9
    const-string v11, "id"

    .line 242
    .line 243
    iget-object v13, v4, Ldb/c;->a:Ljava/lang/String;

    .line 244
    .line 245
    invoke-virtual {v5, v11, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 246
    .line 247
    .line 248
    iget-object v11, v4, Ldb/c;->q:Ljava/lang/String;

    .line 249
    .line 250
    invoke-static {v11}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 251
    .line 252
    .line 253
    move-result-object v11

    .line 254
    invoke-virtual {v11}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v11

    .line 258
    const-string v13, "remark"

    .line 259
    .line 260
    invoke-virtual {v5, v13, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 261
    .line 262
    .line 263
    const-string v11, "type"

    .line 264
    .line 265
    invoke-virtual {v5, v11, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 266
    .line 267
    .line 268
    invoke-static {v9}, Ltf/m;->v1(Ljava/util/List;)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v8

    .line 272
    check-cast v8, Ljava/lang/String;

    .line 273
    .line 274
    if-nez v8, :cond_d

    .line 275
    .line 276
    const-string v8, ""

    .line 277
    .line 278
    :cond_d
    const-string v13, "content"

    .line 279
    .line 280
    invoke-virtual {v5, v13, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 281
    .line 282
    .line 283
    new-instance v8, Lorg/json/JSONArray;

    .line 284
    .line 285
    invoke-direct {v8}, Lorg/json/JSONArray;-><init>()V

    .line 286
    .line 287
    .line 288
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 289
    .line 290
    .line 291
    move-result-object v9

    .line 292
    :goto_a
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 293
    .line 294
    .line 295
    move-result v13

    .line 296
    if-eqz v13, :cond_e

    .line 297
    .line 298
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object v13

    .line 302
    check-cast v13, Ljava/lang/String;

    .line 303
    .line 304
    invoke-virtual {v8, v13}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 305
    .line 306
    .line 307
    goto :goto_a

    .line 308
    :cond_e
    const-string v9, "contentItems"

    .line 309
    .line 310
    invoke-virtual {v5, v9, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 311
    .line 312
    .line 313
    new-instance v8, Lorg/json/JSONArray;

    .line 314
    .line 315
    invoke-direct {v8}, Lorg/json/JSONArray;-><init>()V

    .line 316
    .line 317
    .line 318
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 319
    .line 320
    .line 321
    move-result-object v9

    .line 322
    :goto_b
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 323
    .line 324
    .line 325
    move-result v12

    .line 326
    if-eqz v12, :cond_f

    .line 327
    .line 328
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v12

    .line 332
    check-cast v12, Ljava/lang/String;

    .line 333
    .line 334
    invoke-virtual {v8, v12}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 335
    .line 336
    .line 337
    goto :goto_b

    .line 338
    :cond_f
    const-string v9, "mediaPaths"

    .line 339
    .line 340
    invoke-virtual {v5, v9, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 341
    .line 342
    .line 343
    new-instance v8, Lorg/json/JSONArray;

    .line 344
    .line 345
    invoke-direct {v8}, Lorg/json/JSONArray;-><init>()V

    .line 346
    .line 347
    .line 348
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 349
    .line 350
    .line 351
    move-result-object v6

    .line 352
    :goto_c
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 353
    .line 354
    .line 355
    move-result v9

    .line 356
    if-eqz v9, :cond_10

    .line 357
    .line 358
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object v9

    .line 362
    check-cast v9, Ldb/a;

    .line 363
    .line 364
    new-instance v12, Lorg/json/JSONObject;

    .line 365
    .line 366
    invoke-direct {v12}, Lorg/json/JSONObject;-><init>()V

    .line 367
    .line 368
    .line 369
    iget v13, v9, Ldb/a;->a:I

    .line 370
    .line 371
    invoke-virtual {v12, v11, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 372
    .line 373
    .line 374
    const-string v13, "value"

    .line 375
    .line 376
    iget-object v9, v9, Ldb/a;->b:Ljava/lang/String;

    .line 377
    .line 378
    invoke-virtual {v12, v13, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 379
    .line 380
    .line 381
    invoke-virtual {v8, v12}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 382
    .line 383
    .line 384
    goto :goto_c

    .line 385
    :cond_10
    const-string v6, "items"

    .line 386
    .line 387
    invoke-virtual {v5, v6, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 388
    .line 389
    .line 390
    new-instance v6, Lorg/json/JSONArray;

    .line 391
    .line 392
    invoke-direct {v6}, Lorg/json/JSONArray;-><init>()V

    .line 393
    .line 394
    .line 395
    iget-object v8, v4, Ldb/c;->f:Ljava/util/List;

    .line 396
    .line 397
    invoke-static {v8}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 398
    .line 399
    .line 400
    move-result-object v8

    .line 401
    invoke-static {v8}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 402
    .line 403
    .line 404
    move-result-object v8

    .line 405
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 406
    .line 407
    .line 408
    move-result-object v8

    .line 409
    :goto_d
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 410
    .line 411
    .line 412
    move-result v9

    .line 413
    if-eqz v9, :cond_11

    .line 414
    .line 415
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    move-result-object v9

    .line 419
    check-cast v9, Ljava/lang/String;

    .line 420
    .line 421
    invoke-virtual {v6, v9}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 422
    .line 423
    .line 424
    goto :goto_d

    .line 425
    :cond_11
    const-string v8, "targetIds"

    .line 426
    .line 427
    invoke-virtual {v5, v8, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 428
    .line 429
    .line 430
    invoke-static {v4}, La2/a;->v(Ldb/c;)Ljava/util/List;

    .line 431
    .line 432
    .line 433
    move-result-object v6

    .line 434
    invoke-static {v6}, Ltf/m;->v1(Ljava/util/List;)Ljava/lang/Object;

    .line 435
    .line 436
    .line 437
    move-result-object v8

    .line 438
    check-cast v8, Ljava/lang/Long;

    .line 439
    .line 440
    const-wide/16 v11, 0x0

    .line 441
    .line 442
    if-eqz v8, :cond_12

    .line 443
    .line 444
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    .line 445
    .line 446
    .line 447
    move-result-wide v8

    .line 448
    goto :goto_e

    .line 449
    :cond_12
    move-wide v8, v11

    .line 450
    :goto_e
    const-string v13, "planTime"

    .line 451
    .line 452
    invoke-virtual {v5, v13, v8, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 453
    .line 454
    .line 455
    new-instance v8, Lorg/json/JSONArray;

    .line 456
    .line 457
    invoke-direct {v8}, Lorg/json/JSONArray;-><init>()V

    .line 458
    .line 459
    .line 460
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 461
    .line 462
    .line 463
    move-result-object v6

    .line 464
    :goto_f
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 465
    .line 466
    .line 467
    move-result v9

    .line 468
    if-eqz v9, :cond_13

    .line 469
    .line 470
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 471
    .line 472
    .line 473
    move-result-object v9

    .line 474
    check-cast v9, Ljava/lang/Number;

    .line 475
    .line 476
    invoke-virtual {v9}, Ljava/lang/Number;->longValue()J

    .line 477
    .line 478
    .line 479
    move-result-wide v13

    .line 480
    invoke-virtual {v8, v13, v14}, Lorg/json/JSONArray;->put(J)Lorg/json/JSONArray;

    .line 481
    .line 482
    .line 483
    goto :goto_f

    .line 484
    :cond_13
    const-string v6, "planTimes"

    .line 485
    .line 486
    invoke-virtual {v5, v6, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 487
    .line 488
    .line 489
    const-string v6, "repeatType"

    .line 490
    .line 491
    iget v8, v4, Ldb/c;->h:I

    .line 492
    .line 493
    invoke-virtual {v5, v6, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 494
    .line 495
    .line 496
    new-instance v6, Lorg/json/JSONArray;

    .line 497
    .line 498
    invoke-direct {v6}, Lorg/json/JSONArray;-><init>()V

    .line 499
    .line 500
    .line 501
    iget-object v8, v4, Ldb/c;->i:Ljava/util/Set;

    .line 502
    .line 503
    check-cast v8, Ljava/lang/Iterable;

    .line 504
    .line 505
    invoke-static {v8}, Ltf/m;->J1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 506
    .line 507
    .line 508
    move-result-object v8

    .line 509
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 510
    .line 511
    .line 512
    move-result-object v8

    .line 513
    :goto_10
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 514
    .line 515
    .line 516
    move-result v9

    .line 517
    if-eqz v9, :cond_14

    .line 518
    .line 519
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 520
    .line 521
    .line 522
    move-result-object v9

    .line 523
    check-cast v9, Ljava/lang/Number;

    .line 524
    .line 525
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 526
    .line 527
    .line 528
    move-result v9

    .line 529
    invoke-virtual {v6, v9}, Lorg/json/JSONArray;->put(I)Lorg/json/JSONArray;

    .line 530
    .line 531
    .line 532
    goto :goto_10

    .line 533
    :cond_14
    const-string v8, "repeatDays"

    .line 534
    .line 535
    invoke-virtual {v5, v8, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 536
    .line 537
    .line 538
    iget v6, v4, Ldb/c;->j:I

    .line 539
    .line 540
    const/16 v8, 0xe10

    .line 541
    .line 542
    invoke-static {v6, v10, v8}, Lr9/e0;->r(III)I

    .line 543
    .line 544
    .line 545
    move-result v6

    .line 546
    const-string v9, "intervalSeconds"

    .line 547
    .line 548
    invoke-virtual {v5, v9, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 549
    .line 550
    .line 551
    iget v6, v4, Ldb/c;->k:I

    .line 552
    .line 553
    invoke-static {v6, v10, v8}, Lr9/e0;->r(III)I

    .line 554
    .line 555
    .line 556
    move-result v6

    .line 557
    const-string v8, "mediaIntervalSeconds"

    .line 558
    .line 559
    invoke-virtual {v5, v8, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 560
    .line 561
    .line 562
    const-string v6, "sendOnTimeout"

    .line 563
    .line 564
    iget-boolean v8, v4, Ldb/c;->l:Z

    .line 565
    .line 566
    invoke-virtual {v5, v6, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 567
    .line 568
    .line 569
    iget-object v6, v4, Ldb/c;->m:Ljava/lang/String;

    .line 570
    .line 571
    invoke-static {v6}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 572
    .line 573
    .line 574
    move-result v8

    .line 575
    if-eqz v8, :cond_15

    .line 576
    .line 577
    const-string v6, "pending"

    .line 578
    .line 579
    :cond_15
    const-string v8, "status"

    .line 580
    .line 581
    invoke-virtual {v5, v8, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 582
    .line 583
    .line 584
    iget-wide v8, v4, Ldb/c;->n:J

    .line 585
    .line 586
    cmp-long v6, v8, v11

    .line 587
    .line 588
    if-gez v6, :cond_16

    .line 589
    .line 590
    goto :goto_11

    .line 591
    :cond_16
    move-wide v11, v8

    .line 592
    :goto_11
    const-string v6, "lastExecutedTime"

    .line 593
    .line 594
    invoke-virtual {v5, v6, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 595
    .line 596
    .line 597
    iget v6, v4, Ldb/c;->o:I

    .line 598
    .line 599
    if-gez v6, :cond_17

    .line 600
    .line 601
    move v6, v10

    .line 602
    :cond_17
    const-string v8, "lastSuccessCount"

    .line 603
    .line 604
    invoke-virtual {v5, v8, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 605
    .line 606
    .line 607
    iget v6, v4, Ldb/c;->p:I

    .line 608
    .line 609
    if-gez v6, :cond_18

    .line 610
    .line 611
    move v6, v10

    .line 612
    :cond_18
    const-string v8, "lastFailCount"

    .line 613
    .line 614
    invoke-virtual {v5, v8, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 615
    .line 616
    .line 617
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 618
    .line 619
    .line 620
    move-result-object v6

    .line 621
    const/4 v8, 0x1

    .line 622
    if-eqz v7, :cond_1a

    .line 623
    .line 624
    if-ne v7, v8, :cond_19

    .line 625
    .line 626
    goto :goto_12

    .line 627
    :cond_19
    const/4 v6, 0x0

    .line 628
    :cond_1a
    :goto_12
    if-eqz v6, :cond_1b

    .line 629
    .line 630
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 631
    .line 632
    .line 633
    move-result v6

    .line 634
    goto :goto_13

    .line 635
    :cond_1b
    move v6, v10

    .line 636
    :goto_13
    const-string v9, "targetType"

    .line 637
    .line 638
    invoke-virtual {v5, v9, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 639
    .line 640
    .line 641
    iget v6, v4, Ldb/c;->s:I

    .line 642
    .line 643
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 644
    .line 645
    .line 646
    move-result-object v9

    .line 647
    if-ltz v6, :cond_1c

    .line 648
    .line 649
    const/4 v11, 0x5

    .line 650
    if-ge v6, v11, :cond_1c

    .line 651
    .line 652
    goto :goto_14

    .line 653
    :cond_1c
    const/4 v9, 0x0

    .line 654
    :goto_14
    if-eqz v9, :cond_1d

    .line 655
    .line 656
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 657
    .line 658
    .line 659
    move-result v6

    .line 660
    goto :goto_15

    .line 661
    :cond_1d
    move v6, v10

    .line 662
    :goto_15
    const-string v9, "momentsType"

    .line 663
    .line 664
    invoke-virtual {v5, v9, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 665
    .line 666
    .line 667
    if-nez v7, :cond_20

    .line 668
    .line 669
    iget v4, v4, Ldb/c;->u:I

    .line 670
    .line 671
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 672
    .line 673
    .line 674
    move-result-object v6

    .line 675
    if-eqz v4, :cond_1f

    .line 676
    .line 677
    if-ne v4, v8, :cond_1e

    .line 678
    .line 679
    goto :goto_16

    .line 680
    :cond_1e
    const/4 v9, 0x0

    .line 681
    goto :goto_17

    .line 682
    :cond_1f
    :goto_16
    move-object v9, v6

    .line 683
    :goto_17
    if-eqz v9, :cond_20

    .line 684
    .line 685
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 686
    .line 687
    .line 688
    move-result v10

    .line 689
    :cond_20
    const-string v4, "sendChannel"

    .line 690
    .line 691
    invoke-virtual {v5, v4, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 692
    .line 693
    .line 694
    invoke-virtual {v2, v5}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 695
    .line 696
    .line 697
    goto/16 :goto_0

    .line 698
    .line 699
    :cond_21
    invoke-virtual {v2}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 700
    .line 701
    .line 702
    move-result-object v2

    .line 703
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 704
    .line 705
    .line 706
    const-string v3, "scheduled_task_items_v1"

    .line 707
    .line 708
    invoke-interface {v1, v3, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 709
    .line 710
    .line 711
    move-result-object v1

    .line 712
    if-eqz v1, :cond_22

    .line 713
    .line 714
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 715
    .line 716
    .line 717
    :cond_22
    return-void
.end method

.method public final f()Ljava/util/List;
    .locals 41

    .line 1
    const-string v0, "scheduled_task_items_v1"

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    move-object/from16 v2, p0

    .line 6
    .line 7
    :try_start_0
    iget-object v3, v2, Ldb/g;->a:Landroid/content/SharedPreferences;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    invoke-interface {v3, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :catchall_0
    move-exception v0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-object v0, v1

    .line 21
    goto :goto_1

    .line 22
    :goto_0
    new-instance v3, Lsf/f;

    .line 23
    .line 24
    invoke-direct {v3, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    move-object v0, v3

    .line 28
    :goto_1
    nop

    .line 29
    instance-of v3, v0, Lsf/f;

    .line 30
    .line 31
    if-eqz v3, :cond_1

    .line 32
    .line 33
    move-object v0, v1

    .line 34
    :cond_1
    check-cast v0, Ljava/lang/String;

    .line 35
    .line 36
    const-string v3, "pending"

    .line 37
    .line 38
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    sget-object v5, Ltf/t;->g:Ltf/t;

    .line 43
    .line 44
    if-eqz v4, :cond_2

    .line 45
    .line 46
    goto/16 :goto_1a

    .line 47
    .line 48
    :cond_2
    :try_start_1
    new-instance v4, Lorg/json/JSONArray;

    .line 49
    .line 50
    invoke-direct {v4, v0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-static {}, La/a;->E()Luf/c;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    const/4 v7, 0x0

    .line 62
    move v8, v7

    .line 63
    :goto_2
    if-lt v8, v6, :cond_3

    .line 64
    .line 65
    invoke-static {v0}, La/a;->t(Luf/c;)Luf/c;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    new-instance v1, La9/h;

    .line 70
    .line 71
    const/16 v3, 0xa

    .line 72
    .line 73
    invoke-direct {v1, v3}, La9/h;-><init>(I)V

    .line 74
    .line 75
    .line 76
    invoke-static {v0, v1}, Ltf/m;->K1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    goto/16 :goto_18

    .line 81
    .line 82
    :catchall_1
    move-exception v0

    .line 83
    goto/16 :goto_17

    .line 84
    .line 85
    :cond_3
    invoke-virtual {v4, v8}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 86
    .line 87
    .line 88
    move-result-object v9

    .line 89
    if-eqz v9, :cond_4

    .line 90
    .line 91
    const-string v10, "id"

    .line 92
    .line 93
    invoke-virtual {v9, v10}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v10

    .line 97
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    invoke-static {v10}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 101
    .line 102
    .line 103
    move-result-object v10

    .line 104
    invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v12

    .line 108
    invoke-static {v12}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 109
    .line 110
    .line 111
    move-result v10

    .line 112
    if-eqz v10, :cond_5

    .line 113
    .line 114
    :cond_4
    move-object/from16 v33, v0

    .line 115
    .line 116
    move-object/from16 v38, v1

    .line 117
    .line 118
    move-object/from16 v39, v3

    .line 119
    .line 120
    move/from16 v36, v7

    .line 121
    .line 122
    move/from16 v37, v8

    .line 123
    .line 124
    goto/16 :goto_16

    .line 125
    .line 126
    :cond_5
    invoke-static {v9}, La2/a;->z(Lorg/json/JSONObject;)Ljava/util/List;

    .line 127
    .line 128
    .line 129
    move-result-object v35

    .line 130
    const-string v10, "remark"

    .line 131
    .line 132
    invoke-virtual {v9, v10, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v30

    .line 136
    invoke-virtual/range {v30 .. v30}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    const-string v10, "type"

    .line 140
    .line 141
    invoke-virtual {v9, v10, v7}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 142
    .line 143
    .line 144
    move-result v13

    .line 145
    const-string v10, "content"

    .line 146
    .line 147
    invoke-virtual {v9, v10, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v14

    .line 151
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    const-string v10, "contentItems"

    .line 155
    .line 156
    invoke-virtual {v9, v10}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 157
    .line 158
    .line 159
    move-result-object v10

    .line 160
    invoke-static {v10}, La2/a;->A(Lorg/json/JSONArray;)Ljava/util/List;

    .line 161
    .line 162
    .line 163
    move-result-object v15

    .line 164
    const-string v10, "mediaPaths"

    .line 165
    .line 166
    invoke-virtual {v9, v10}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 167
    .line 168
    .line 169
    move-result-object v10

    .line 170
    invoke-static {v10}, La2/a;->A(Lorg/json/JSONArray;)Ljava/util/List;

    .line 171
    .line 172
    .line 173
    move-result-object v16

    .line 174
    const-string v10, "targetIds"

    .line 175
    .line 176
    invoke-virtual {v9, v10}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 177
    .line 178
    .line 179
    move-result-object v10

    .line 180
    invoke-static {v10}, La2/a;->A(Lorg/json/JSONArray;)Ljava/util/List;

    .line 181
    .line 182
    .line 183
    move-result-object v17

    .line 184
    invoke-static/range {v35 .. v35}, Ltf/m;->v1(Ljava/util/List;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v10

    .line 188
    check-cast v10, Ljava/lang/Long;

    .line 189
    .line 190
    move/from16 v37, v8

    .line 191
    .line 192
    if-eqz v10, :cond_6

    .line 193
    .line 194
    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    .line 195
    .line 196
    .line 197
    move-result-wide v10

    .line 198
    move-wide/from16 v18, v10

    .line 199
    .line 200
    goto :goto_3

    .line 201
    :cond_6
    const-wide/16 v18, 0x0

    .line 202
    .line 203
    :goto_3
    const-string v10, "repeatType"

    .line 204
    .line 205
    const/4 v11, 0x0

    .line 206
    invoke-virtual {v9, v10, v11}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 207
    .line 208
    .line 209
    move-result v20

    .line 210
    const-string v10, "repeatDays"

    .line 211
    .line 212
    invoke-virtual {v9, v10}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 213
    .line 214
    .line 215
    move-result-object v10

    .line 216
    invoke-static {v10}, La2/a;->y(Lorg/json/JSONArray;)Ljava/util/Set;

    .line 217
    .line 218
    .line 219
    move-result-object v21

    .line 220
    const-string v10, "intervalSeconds"

    .line 221
    .line 222
    invoke-virtual {v9, v10, v11}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 223
    .line 224
    .line 225
    move-result v10

    .line 226
    const/16 v7, 0xe10

    .line 227
    .line 228
    invoke-static {v10, v11, v7}, Lr9/e0;->r(III)I

    .line 229
    .line 230
    .line 231
    move-result v8

    .line 232
    const-string v10, "mediaIntervalSeconds"

    .line 233
    .line 234
    invoke-virtual {v9, v10, v11}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 235
    .line 236
    .line 237
    move-result v10

    .line 238
    invoke-static {v10, v11, v7}, Lr9/e0;->r(III)I

    .line 239
    .line 240
    .line 241
    move-result v7

    .line 242
    const-string v10, "sendOnTimeout"

    .line 243
    .line 244
    const/4 v11, 0x1

    .line 245
    invoke-virtual {v9, v10, v11}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 246
    .line 247
    .line 248
    move-result v24

    .line 249
    const-string v10, "status"

    .line 250
    .line 251
    invoke-virtual {v9, v10, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v10

    .line 255
    invoke-static {v10}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 256
    .line 257
    .line 258
    move-result v25

    .line 259
    if-eqz v25, :cond_7

    .line 260
    .line 261
    move-object/from16 v25, v3

    .line 262
    .line 263
    goto :goto_4

    .line 264
    :cond_7
    move-object/from16 v25, v10

    .line 265
    .line 266
    :goto_4
    const-string v10, "lastExecutedTime"

    .line 267
    .line 268
    move-object/from16 v26, v12

    .line 269
    .line 270
    const-wide/16 v11, 0x0

    .line 271
    .line 272
    invoke-virtual {v9, v10, v11, v12}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 273
    .line 274
    .line 275
    move-result-wide v10

    .line 276
    const-string v12, "lastSuccessCount"

    .line 277
    .line 278
    move-object/from16 v38, v1

    .line 279
    .line 280
    const/4 v1, 0x0

    .line 281
    invoke-virtual {v9, v12, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 282
    .line 283
    .line 284
    move-result v36

    .line 285
    if-gez v36, :cond_8

    .line 286
    .line 287
    move/from16 v28, v1

    .line 288
    .line 289
    goto :goto_5

    .line 290
    :cond_8
    move/from16 v28, v36

    .line 291
    .line 292
    :goto_5
    const-string v12, "lastFailCount"

    .line 293
    .line 294
    invoke-virtual {v9, v12, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 295
    .line 296
    .line 297
    move-result v36

    .line 298
    if-gez v36, :cond_9

    .line 299
    .line 300
    move/from16 v29, v1

    .line 301
    .line 302
    goto :goto_6

    .line 303
    :cond_9
    move/from16 v29, v36

    .line 304
    .line 305
    :goto_6
    const-string v12, "targetType"

    .line 306
    .line 307
    invoke-virtual {v9, v12, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 308
    .line 309
    .line 310
    move-result v12

    .line 311
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 312
    .line 313
    .line 314
    move-result-object v1

    .line 315
    move-object/from16 v22, v1

    .line 316
    .line 317
    if-eqz v12, :cond_b

    .line 318
    .line 319
    const/4 v1, 0x1

    .line 320
    if-ne v12, v1, :cond_a

    .line 321
    .line 322
    goto :goto_7

    .line 323
    :cond_a
    const/4 v1, 0x0

    .line 324
    goto :goto_8

    .line 325
    :cond_b
    :goto_7
    const/4 v1, 0x1

    .line 326
    :goto_8
    if-eqz v1, :cond_c

    .line 327
    .line 328
    move-object/from16 v1, v22

    .line 329
    .line 330
    goto :goto_9

    .line 331
    :cond_c
    const/4 v1, 0x0

    .line 332
    :goto_9
    if-eqz v1, :cond_d

    .line 333
    .line 334
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 335
    .line 336
    .line 337
    move-result v1

    .line 338
    move/from16 v31, v1

    .line 339
    .line 340
    goto :goto_a

    .line 341
    :cond_d
    const/16 v31, 0x0

    .line 342
    .line 343
    :goto_a
    const-string v1, "momentsType"

    .line 344
    .line 345
    const/4 v12, 0x0

    .line 346
    invoke-virtual {v9, v1, v12}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 347
    .line 348
    .line 349
    move-result v1

    .line 350
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 351
    .line 352
    .line 353
    move-result-object v12

    .line 354
    if-ltz v1, :cond_e

    .line 355
    .line 356
    const/4 v2, 0x5

    .line 357
    if-ge v1, v2, :cond_e

    .line 358
    .line 359
    const/4 v1, 0x1

    .line 360
    goto :goto_b

    .line 361
    :cond_e
    const/4 v1, 0x0

    .line 362
    :goto_b
    if-eqz v1, :cond_f

    .line 363
    .line 364
    goto :goto_c

    .line 365
    :cond_f
    const/4 v12, 0x0

    .line 366
    :goto_c
    if-eqz v12, :cond_10

    .line 367
    .line 368
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 369
    .line 370
    .line 371
    move-result v1

    .line 372
    move/from16 v32, v1

    .line 373
    .line 374
    goto :goto_d

    .line 375
    :cond_10
    const/16 v32, 0x0

    .line 376
    .line 377
    :goto_d
    const-string v1, "items"

    .line 378
    .line 379
    invoke-virtual {v9, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 380
    .line 381
    .line 382
    move-result-object v1

    .line 383
    if-nez v1, :cond_11

    .line 384
    .line 385
    sget-object v1, Ltf/t;->g:Ltf/t;

    .line 386
    .line 387
    move-object/from16 v39, v3

    .line 388
    .line 389
    :goto_e
    move-object/from16 v33, v1

    .line 390
    .line 391
    goto :goto_10

    .line 392
    :cond_11
    invoke-static {}, La/a;->E()Luf/c;

    .line 393
    .line 394
    .line 395
    move-result-object v2

    .line 396
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    .line 397
    .line 398
    .line 399
    move-result v12

    .line 400
    move-object/from16 v39, v3

    .line 401
    .line 402
    const/4 v3, 0x0

    .line 403
    :goto_f
    if-lt v3, v12, :cond_16

    .line 404
    .line 405
    invoke-static {v2}, La/a;->t(Luf/c;)Luf/c;

    .line 406
    .line 407
    .line 408
    move-result-object v1

    .line 409
    goto :goto_e

    .line 410
    :goto_10
    const-string v1, "sendChannel"

    .line 411
    .line 412
    const/4 v2, 0x0

    .line 413
    invoke-virtual {v9, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 414
    .line 415
    .line 416
    move-result v1

    .line 417
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 418
    .line 419
    .line 420
    move-result-object v3

    .line 421
    const/4 v9, 0x1

    .line 422
    if-eqz v1, :cond_13

    .line 423
    .line 424
    if-ne v1, v9, :cond_12

    .line 425
    .line 426
    goto :goto_11

    .line 427
    :cond_12
    move v9, v2

    .line 428
    :cond_13
    :goto_11
    if-eqz v9, :cond_14

    .line 429
    .line 430
    move-object v12, v3

    .line 431
    goto :goto_12

    .line 432
    :cond_14
    const/4 v12, 0x0

    .line 433
    :goto_12
    if-eqz v12, :cond_15

    .line 434
    .line 435
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 436
    .line 437
    .line 438
    move-result v1

    .line 439
    move/from16 v34, v1

    .line 440
    .line 441
    :goto_13
    move-object/from16 v12, v26

    .line 442
    .line 443
    move-wide/from16 v26, v10

    .line 444
    .line 445
    goto :goto_14

    .line 446
    :cond_15
    move/from16 v34, v2

    .line 447
    .line 448
    goto :goto_13

    .line 449
    :goto_14
    new-instance v11, Ldb/c;

    .line 450
    .line 451
    move/from16 v23, v7

    .line 452
    .line 453
    move/from16 v22, v8

    .line 454
    .line 455
    invoke-direct/range {v11 .. v35}, Ldb/c;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;JILjava/util/Set;IIZLjava/lang/String;JIILjava/lang/String;IILjava/util/List;ILjava/util/List;)V

    .line 456
    .line 457
    .line 458
    invoke-virtual {v0, v11}, Luf/c;->add(Ljava/lang/Object;)Z

    .line 459
    .line 460
    .line 461
    move-object/from16 v33, v0

    .line 462
    .line 463
    move/from16 v36, v2

    .line 464
    .line 465
    goto :goto_16

    .line 466
    :cond_16
    move/from16 v27, v8

    .line 467
    .line 468
    move v8, v7

    .line 469
    move/from16 v7, v27

    .line 470
    .line 471
    move-object/from16 v33, v0

    .line 472
    .line 473
    const/16 v27, 0x1

    .line 474
    .line 475
    const/16 v36, 0x0

    .line 476
    .line 477
    invoke-virtual {v1, v3}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 478
    .line 479
    .line 480
    move-result-object v0

    .line 481
    if-eqz v0, :cond_17

    .line 482
    .line 483
    move-object/from16 v34, v1

    .line 484
    .line 485
    const-string v1, "type"

    .line 486
    .line 487
    move/from16 v40, v3

    .line 488
    .line 489
    const/4 v3, 0x0

    .line 490
    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 491
    .line 492
    .line 493
    move-result v1

    .line 494
    const-string v3, "value"

    .line 495
    .line 496
    invoke-static {v3, v0}, Lwb/en;->j(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 497
    .line 498
    .line 499
    move-result-object v0

    .line 500
    if-ltz v1, :cond_18

    .line 501
    .line 502
    const/16 v3, 0x9

    .line 503
    .line 504
    if-ge v1, v3, :cond_18

    .line 505
    .line 506
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 507
    .line 508
    .line 509
    move-result v3

    .line 510
    if-nez v3, :cond_18

    .line 511
    .line 512
    new-instance v3, Ldb/a;

    .line 513
    .line 514
    invoke-direct {v3, v1, v0}, Ldb/a;-><init>(ILjava/lang/String;)V

    .line 515
    .line 516
    .line 517
    invoke-virtual {v2, v3}, Luf/c;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 518
    .line 519
    .line 520
    goto :goto_15

    .line 521
    :cond_17
    move-object/from16 v34, v1

    .line 522
    .line 523
    move/from16 v40, v3

    .line 524
    .line 525
    :cond_18
    :goto_15
    add-int/lit8 v3, v40, 0x1

    .line 526
    .line 527
    move v0, v8

    .line 528
    move v8, v7

    .line 529
    move v7, v0

    .line 530
    move-object/from16 v0, v33

    .line 531
    .line 532
    move-object/from16 v1, v34

    .line 533
    .line 534
    goto/16 :goto_f

    .line 535
    .line 536
    :goto_16
    add-int/lit8 v8, v37, 0x1

    .line 537
    .line 538
    move-object/from16 v2, p0

    .line 539
    .line 540
    move-object/from16 v0, v33

    .line 541
    .line 542
    move/from16 v7, v36

    .line 543
    .line 544
    move-object/from16 v1, v38

    .line 545
    .line 546
    move-object/from16 v3, v39

    .line 547
    .line 548
    goto/16 :goto_2

    .line 549
    .line 550
    :goto_17
    new-instance v1, Lsf/f;

    .line 551
    .line 552
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 553
    .line 554
    .line 555
    move-object v0, v1

    .line 556
    :goto_18
    nop

    .line 557
    instance-of v1, v0, Lsf/f;

    .line 558
    .line 559
    if-eqz v1, :cond_19

    .line 560
    .line 561
    goto :goto_19

    .line 562
    :cond_19
    move-object v5, v0

    .line 563
    :goto_19
    check-cast v5, Ljava/util/List;

    .line 564
    .line 565
    :goto_1a
    return-object v5
.end method
