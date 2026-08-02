.class public abstract Lvh2;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final a:Lt21;

.field public static final b:Ljava/util/Set;

.field public static final c:Ljava/util/Set;

.field public static final d:Ljava/util/Set;

.field public static final e:Ljava/util/Set;

.field public static final f:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 1
    sget-object v0, Lu21;->d:Lt21;

    .line 2
    .line 3
    sput-object v0, Lvh2;->a:Lt21;

    .line 4
    .line 5
    const-string v10, "configSchema"

    .line 6
    .line 7
    const-string v11, "permissions"

    .line 8
    .line 9
    const-string v1, "manifestVersion"

    .line 10
    .line 11
    const-string v2, "apiVersion"

    .line 12
    .line 13
    const-string v3, "id"

    .line 14
    .line 15
    const-string v4, "name"

    .line 16
    .line 17
    const-string v5, "version"

    .line 18
    .line 19
    const-string v6, "versionCode"

    .line 20
    .line 21
    const-string v7, "entry"

    .line 22
    .line 23
    const-string v8, "description"

    .line 24
    .line 25
    const-string v9, "author"

    .line 26
    .line 27
    filled-new-array/range {v1 .. v11}, [Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-static {v0}, Lmg;->u0([Ljava/lang/Object;)Ljava/util/Set;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Lvh2;->b:Ljava/util/Set;

    .line 36
    .line 37
    const-string v0, "filesystem"

    .line 38
    .line 39
    const-string v1, "network"

    .line 40
    .line 41
    const-string v2, "host"

    .line 42
    .line 43
    filled-new-array {v1, v2, v0}, [Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-static {v0}, Lmg;->u0([Ljava/lang/Object;)Ljava/util/Set;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    sput-object v0, Lvh2;->c:Ljava/util/Set;

    .line 52
    .line 53
    const-string v0, "privateNetwork"

    .line 54
    .line 55
    const-string v1, "any"

    .line 56
    .line 57
    const-string v3, "origins"

    .line 58
    .line 59
    filled-new-array {v3, v0, v1}, [Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-static {v0}, Lmg;->u0([Ljava/lang/Object;)Ljava/util/Set;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    sput-object v0, Lvh2;->d:Ljava/util/Set;

    .line 68
    .line 69
    const-string v0, "reflect"

    .line 70
    .line 71
    const-string v1, "hook"

    .line 72
    .line 73
    const-string v3, "classes"

    .line 74
    .line 75
    const-string v4, "reason"

    .line 76
    .line 77
    filled-new-array {v0, v1, v3, v4}, [Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-static {v0}, Lmg;->u0([Ljava/lang/Object;)Ljava/util/Set;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    sput-object v0, Lvh2;->e:Ljava/util/Set;

    .line 86
    .line 87
    const-string v0, "external"

    .line 88
    .line 89
    filled-new-array {v0, v2, v4}, [Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-static {v0}, Lmg;->u0([Ljava/lang/Object;)Ljava/util/Set;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    sput-object v0, Lvh2;->f:Ljava/util/Set;

    .line 98
    .line 99
    return-void
.end method

.method public static a(Ld41;Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 4

    .line 1
    invoke-virtual {p0, p1}, Ld41;->containsKey(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    invoke-static {p0, p1}, Lvh2;->f(Ld41;Ljava/lang/String;)Li41;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Li41;->b()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const-string v2, "\' must be a boolean."

    .line 18
    .line 19
    const-string v3, "Manifest field \'"

    .line 20
    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    invoke-static {p0}, Ll31;->d(Li41;)Ljava/lang/Boolean;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    if-eqz p0, :cond_1

    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_1
    invoke-static {v3, p1, v2}, Lvi0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-static {p0}, Ls;->j(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-object v1

    .line 38
    :cond_2
    invoke-static {v3, p1, v2}, Lvi0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-static {p0}, Ls;->c(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    return-object v1
.end method

.method public static b(Ld41;Ljava/lang/String;)Ld41;
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Ld41;->containsKey(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    invoke-virtual {p0, p1}, Ld41;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    instance-of v0, p0, Ld41;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    check-cast p0, Ld41;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    move-object p0, v1

    .line 21
    :goto_0
    if-eqz p0, :cond_2

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_2
    const-string p0, "Manifest field \'"

    .line 25
    .line 26
    const-string v0, "\' must be an object."

    .line 27
    .line 28
    invoke-static {p0, p1, v0}, Lvi0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-static {p0}, Ls;->j(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return-object v1
.end method

.method public static c(Ld41;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Ld41;->containsKey(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return-object p0

    .line 9
    :cond_0
    invoke-static {p0, p1}, Lvh2;->g(Ld41;Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public static d(Ljava/lang/String;)Lth2;
    .locals 17

    .line 1
    const-string v1, "\'."

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const-string v0, "\ufeff"

    .line 7
    .line 8
    move-object/from16 v2, p0

    .line 9
    .line 10
    invoke-static {v2, v0}, Lpv2;->y0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sget-object v2, Lvh2;->a:Lt21;

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    sget-object v3, Lo31;->a:Lo31;

    .line 20
    .line 21
    invoke-virtual {v2, v3, v0}, Lu21;->a(Lw41;Ljava/lang/String;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Lj31;

    .line 26
    .line 27
    instance-of v2, v0, Ld41;

    .line 28
    .line 29
    const/4 v3, 0x0

    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    check-cast v0, Ld41;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move-object v0, v3

    .line 36
    :goto_0
    if-eqz v0, :cond_1f

    .line 37
    .line 38
    iget-object v2, v0, Ld41;->h:Ljava/util/Map;

    .line 39
    .line 40
    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    sget-object v4, Lvh2;->b:Ljava/util/Set;

    .line 45
    .line 46
    check-cast v4, Ljava/lang/Iterable;

    .line 47
    .line 48
    invoke-static {v2, v4}, Lnp2;->b0(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-interface {v2}, Ljava/util/Set;->isEmpty()Z

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-eqz v4, :cond_1e

    .line 57
    .line 58
    const-string v2, "manifestVersion"

    .line 59
    .line 60
    invoke-static {v0, v2}, Lvh2;->e(Ld41;Ljava/lang/String;)I

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    const/4 v2, 0x1

    .line 65
    if-ne v5, v2, :cond_1d

    .line 66
    .line 67
    const-string v4, "entry"

    .line 68
    .line 69
    invoke-static {v0, v4}, Lvh2;->c(Ld41;Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    if-nez v4, :cond_1

    .line 74
    .line 75
    const-string v4, "main.js"

    .line 76
    .line 77
    :cond_1
    :try_start_0
    sget-object v6, Loi2;->i:Lo72;

    .line 78
    .line 79
    invoke-static {v4}, Lxe1;->Y(Ljava/lang/String;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v12
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    .line 83
    const-string v4, "permissions"

    .line 84
    .line 85
    invoke-static {v0, v4}, Lvh2;->b(Ld41;Ljava/lang/String;)Ld41;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    if-eqz v4, :cond_19

    .line 90
    .line 91
    iget-object v6, v4, Ld41;->h:Ljava/util/Map;

    .line 92
    .line 93
    invoke-interface {v6}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 94
    .line 95
    .line 96
    move-result-object v6

    .line 97
    sget-object v7, Lvh2;->c:Ljava/util/Set;

    .line 98
    .line 99
    check-cast v7, Ljava/lang/Iterable;

    .line 100
    .line 101
    invoke-static {v6, v7}, Lnp2;->b0(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    .line 102
    .line 103
    .line 104
    move-result-object v6

    .line 105
    invoke-interface {v6}, Ljava/util/Set;->isEmpty()Z

    .line 106
    .line 107
    .line 108
    move-result v7

    .line 109
    if-eqz v7, :cond_18

    .line 110
    .line 111
    new-instance v6, Lri2;

    .line 112
    .line 113
    const-string v7, "network"

    .line 114
    .line 115
    invoke-virtual {v4, v7}, Ld41;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v7

    .line 119
    check-cast v7, Lj31;

    .line 120
    .line 121
    const/4 v8, 0x0

    .line 122
    if-nez v7, :cond_2

    .line 123
    .line 124
    move-object v7, v3

    .line 125
    goto/16 :goto_6

    .line 126
    .line 127
    :cond_2
    instance-of v9, v7, Li41;

    .line 128
    .line 129
    const-string v10, "Manifest field \'network\' must be a boolean or object."

    .line 130
    .line 131
    sget-object v11, Lbe0;->h:Lbe0;

    .line 132
    .line 133
    if-eqz v9, :cond_5

    .line 134
    .line 135
    move-object v9, v7

    .line 136
    check-cast v9, Li41;

    .line 137
    .line 138
    invoke-virtual {v9}, Li41;->b()Z

    .line 139
    .line 140
    .line 141
    move-result v13

    .line 142
    if-nez v13, :cond_5

    .line 143
    .line 144
    invoke-static {v9}, Ll31;->d(Li41;)Ljava/lang/Boolean;

    .line 145
    .line 146
    .line 147
    move-result-object v7

    .line 148
    if-eqz v7, :cond_4

    .line 149
    .line 150
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 151
    .line 152
    .line 153
    move-result v7

    .line 154
    if-eqz v7, :cond_3

    .line 155
    .line 156
    new-instance v7, Lji2;

    .line 157
    .line 158
    invoke-direct {v7, v11, v8, v2}, Lji2;-><init>(Ljava/util/List;ZZ)V

    .line 159
    .line 160
    .line 161
    goto/16 :goto_6

    .line 162
    .line 163
    :cond_3
    const-string v0, "Manifest field \'network\' must be true or an object when present."

    .line 164
    .line 165
    invoke-static {v0}, Ls;->j(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    return-object v3

    .line 169
    :cond_4
    invoke-static {v10}, Ls;->j(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    return-object v3

    .line 173
    :cond_5
    instance-of v2, v7, Ld41;

    .line 174
    .line 175
    if-eqz v2, :cond_6

    .line 176
    .line 177
    check-cast v7, Ld41;

    .line 178
    .line 179
    goto :goto_1

    .line 180
    :cond_6
    move-object v7, v3

    .line 181
    :goto_1
    if-eqz v7, :cond_17

    .line 182
    .line 183
    iget-object v2, v7, Ld41;->h:Ljava/util/Map;

    .line 184
    .line 185
    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    sget-object v9, Lvh2;->d:Ljava/util/Set;

    .line 190
    .line 191
    check-cast v9, Ljava/lang/Iterable;

    .line 192
    .line 193
    invoke-static {v2, v9}, Lnp2;->b0(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    invoke-interface {v2}, Ljava/util/Set;->isEmpty()Z

    .line 198
    .line 199
    .line 200
    move-result v9

    .line 201
    if-eqz v9, :cond_16

    .line 202
    .line 203
    const-string v2, "any"

    .line 204
    .line 205
    invoke-static {v7, v2}, Lvh2;->a(Ld41;Ljava/lang/String;)Ljava/lang/Boolean;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    if-eqz v2, :cond_7

    .line 210
    .line 211
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 212
    .line 213
    .line 214
    move-result v2

    .line 215
    goto :goto_2

    .line 216
    :cond_7
    move v2, v8

    .line 217
    :goto_2
    new-instance v9, Lji2;

    .line 218
    .line 219
    const-string v10, "origins"

    .line 220
    .line 221
    if-eqz v2, :cond_a

    .line 222
    .line 223
    invoke-virtual {v7, v10}, Ld41;->containsKey(Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    move-result v13

    .line 227
    if-nez v13, :cond_8

    .line 228
    .line 229
    move-object v10, v3

    .line 230
    goto :goto_3

    .line 231
    :cond_8
    invoke-static {v7, v10}, Lvh2;->h(Ld41;Ljava/lang/String;)Ljava/util/ArrayList;

    .line 232
    .line 233
    .line 234
    move-result-object v10

    .line 235
    :goto_3
    if-nez v10, :cond_9

    .line 236
    .line 237
    goto :goto_4

    .line 238
    :cond_9
    move-object v11, v10

    .line 239
    goto :goto_4

    .line 240
    :cond_a
    invoke-static {v7, v10}, Lvh2;->h(Ld41;Ljava/lang/String;)Ljava/util/ArrayList;

    .line 241
    .line 242
    .line 243
    move-result-object v11

    .line 244
    :goto_4
    const-string v10, "privateNetwork"

    .line 245
    .line 246
    invoke-static {v7, v10}, Lvh2;->a(Ld41;Ljava/lang/String;)Ljava/lang/Boolean;

    .line 247
    .line 248
    .line 249
    move-result-object v7

    .line 250
    if-eqz v7, :cond_b

    .line 251
    .line 252
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 253
    .line 254
    .line 255
    move-result v7

    .line 256
    goto :goto_5

    .line 257
    :cond_b
    move v7, v8

    .line 258
    :goto_5
    invoke-direct {v9, v11, v7, v2}, Lji2;-><init>(Ljava/util/List;ZZ)V

    .line 259
    .line 260
    .line 261
    move-object v7, v9

    .line 262
    :goto_6
    const-string v2, "host"

    .line 263
    .line 264
    invoke-static {v4, v2}, Lvh2;->b(Ld41;Ljava/lang/String;)Ld41;

    .line 265
    .line 266
    .line 267
    move-result-object v9

    .line 268
    const-string v10, "reason"

    .line 269
    .line 270
    if-eqz v9, :cond_11

    .line 271
    .line 272
    iget-object v11, v9, Ld41;->h:Ljava/util/Map;

    .line 273
    .line 274
    invoke-interface {v11}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 275
    .line 276
    .line 277
    move-result-object v11

    .line 278
    sget-object v13, Lvh2;->e:Ljava/util/Set;

    .line 279
    .line 280
    check-cast v13, Ljava/lang/Iterable;

    .line 281
    .line 282
    invoke-static {v11, v13}, Lnp2;->b0(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    .line 283
    .line 284
    .line 285
    move-result-object v11

    .line 286
    invoke-interface {v11}, Ljava/util/Set;->isEmpty()Z

    .line 287
    .line 288
    .line 289
    move-result v13

    .line 290
    if-eqz v13, :cond_10

    .line 291
    .line 292
    new-instance v11, Lkh2;

    .line 293
    .line 294
    const-string v13, "reflect"

    .line 295
    .line 296
    invoke-static {v9, v13}, Lvh2;->a(Ld41;Ljava/lang/String;)Ljava/lang/Boolean;

    .line 297
    .line 298
    .line 299
    move-result-object v13

    .line 300
    if-eqz v13, :cond_c

    .line 301
    .line 302
    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    .line 303
    .line 304
    .line 305
    move-result v13

    .line 306
    goto :goto_7

    .line 307
    :cond_c
    move v13, v8

    .line 308
    :goto_7
    const-string v14, "hook"

    .line 309
    .line 310
    invoke-static {v9, v14}, Lvh2;->a(Ld41;Ljava/lang/String;)Ljava/lang/Boolean;

    .line 311
    .line 312
    .line 313
    move-result-object v14

    .line 314
    if-eqz v14, :cond_d

    .line 315
    .line 316
    invoke-virtual {v14}, Ljava/lang/Boolean;->booleanValue()Z

    .line 317
    .line 318
    .line 319
    move-result v14

    .line 320
    goto :goto_8

    .line 321
    :cond_d
    move v14, v8

    .line 322
    :goto_8
    const-string v15, "classes"

    .line 323
    .line 324
    invoke-virtual {v9, v15}, Ld41;->containsKey(Ljava/lang/Object;)Z

    .line 325
    .line 326
    .line 327
    move-result v16

    .line 328
    if-nez v16, :cond_e

    .line 329
    .line 330
    move-object v15, v3

    .line 331
    goto :goto_9

    .line 332
    :cond_e
    invoke-static {v9, v15}, Lvh2;->h(Ld41;Ljava/lang/String;)Ljava/util/ArrayList;

    .line 333
    .line 334
    .line 335
    move-result-object v15

    .line 336
    :goto_9
    if-nez v15, :cond_f

    .line 337
    .line 338
    sget-object v15, Lkh2;->e:Ljava/util/List;

    .line 339
    .line 340
    :cond_f
    invoke-static {v9, v10}, Lvh2;->c(Ld41;Ljava/lang/String;)Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object v9

    .line 344
    invoke-direct {v11, v13, v14, v15, v9}, Lkh2;-><init>(ZZLjava/util/List;Ljava/lang/String;)V

    .line 345
    .line 346
    .line 347
    goto :goto_a

    .line 348
    :cond_10
    check-cast v11, Ljava/lang/Iterable;

    .line 349
    .line 350
    invoke-static {v11}, Ldu;->z0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 351
    .line 352
    .line 353
    move-result-object v4

    .line 354
    const/4 v8, 0x0

    .line 355
    const/16 v9, 0x3f

    .line 356
    .line 357
    const/4 v5, 0x0

    .line 358
    const/4 v6, 0x0

    .line 359
    const/4 v7, 0x0

    .line 360
    invoke-static/range {v4 .. v9}, Ldu;->u0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lin0;I)Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object v0

    .line 364
    const-string v1, "Manifest host permission contains unknown fields: "

    .line 365
    .line 366
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    invoke-static {v0}, Ls;->c(Ljava/lang/Object;)V

    .line 371
    .line 372
    .line 373
    return-object v3

    .line 374
    :cond_11
    move-object v11, v3

    .line 375
    :goto_a
    const-string v9, "filesystem"

    .line 376
    .line 377
    invoke-static {v4, v9}, Lvh2;->b(Ld41;Ljava/lang/String;)Ld41;

    .line 378
    .line 379
    .line 380
    move-result-object v4

    .line 381
    if-eqz v4, :cond_15

    .line 382
    .line 383
    iget-object v9, v4, Ld41;->h:Ljava/util/Map;

    .line 384
    .line 385
    invoke-interface {v9}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 386
    .line 387
    .line 388
    move-result-object v9

    .line 389
    sget-object v13, Lvh2;->f:Ljava/util/Set;

    .line 390
    .line 391
    check-cast v13, Ljava/lang/Iterable;

    .line 392
    .line 393
    invoke-static {v9, v13}, Lnp2;->b0(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    .line 394
    .line 395
    .line 396
    move-result-object v9

    .line 397
    invoke-interface {v9}, Ljava/util/Set;->isEmpty()Z

    .line 398
    .line 399
    .line 400
    move-result v13

    .line 401
    if-eqz v13, :cond_14

    .line 402
    .line 403
    new-instance v9, Lch2;

    .line 404
    .line 405
    const-string v13, "external"

    .line 406
    .line 407
    invoke-static {v4, v13}, Lvh2;->a(Ld41;Ljava/lang/String;)Ljava/lang/Boolean;

    .line 408
    .line 409
    .line 410
    move-result-object v13

    .line 411
    if-eqz v13, :cond_12

    .line 412
    .line 413
    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    .line 414
    .line 415
    .line 416
    move-result v13

    .line 417
    goto :goto_b

    .line 418
    :cond_12
    move v13, v8

    .line 419
    :goto_b
    invoke-static {v4, v2}, Lvh2;->a(Ld41;Ljava/lang/String;)Ljava/lang/Boolean;

    .line 420
    .line 421
    .line 422
    move-result-object v2

    .line 423
    if-eqz v2, :cond_13

    .line 424
    .line 425
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 426
    .line 427
    .line 428
    move-result v8

    .line 429
    :cond_13
    invoke-static {v4, v10}, Lvh2;->c(Ld41;Ljava/lang/String;)Ljava/lang/String;

    .line 430
    .line 431
    .line 432
    move-result-object v2

    .line 433
    invoke-direct {v9, v2, v13, v8}, Lch2;-><init>(Ljava/lang/String;ZZ)V

    .line 434
    .line 435
    .line 436
    goto :goto_c

    .line 437
    :cond_14
    check-cast v9, Ljava/lang/Iterable;

    .line 438
    .line 439
    invoke-static {v9}, Ldu;->z0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 440
    .line 441
    .line 442
    move-result-object v10

    .line 443
    const/4 v14, 0x0

    .line 444
    const/16 v15, 0x3f

    .line 445
    .line 446
    const/4 v11, 0x0

    .line 447
    const/4 v12, 0x0

    .line 448
    const/4 v13, 0x0

    .line 449
    invoke-static/range {v10 .. v15}, Ldu;->u0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lin0;I)Ljava/lang/String;

    .line 450
    .line 451
    .line 452
    move-result-object v0

    .line 453
    const-string v1, "Manifest filesystem permission contains unknown fields: "

    .line 454
    .line 455
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 456
    .line 457
    .line 458
    move-result-object v0

    .line 459
    invoke-static {v0}, Ls;->c(Ljava/lang/Object;)V

    .line 460
    .line 461
    .line 462
    return-object v3

    .line 463
    :cond_15
    move-object v9, v3

    .line 464
    :goto_c
    invoke-direct {v6, v7, v11, v9}, Lri2;-><init>(Lji2;Lkh2;Lch2;)V

    .line 465
    .line 466
    .line 467
    :goto_d
    move-object/from16 v16, v6

    .line 468
    .line 469
    goto :goto_e

    .line 470
    :cond_16
    check-cast v2, Ljava/lang/Iterable;

    .line 471
    .line 472
    invoke-static {v2}, Ldu;->z0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 473
    .line 474
    .line 475
    move-result-object v4

    .line 476
    const/4 v8, 0x0

    .line 477
    const/16 v9, 0x3f

    .line 478
    .line 479
    const/4 v5, 0x0

    .line 480
    const/4 v6, 0x0

    .line 481
    const/4 v7, 0x0

    .line 482
    invoke-static/range {v4 .. v9}, Ldu;->u0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lin0;I)Ljava/lang/String;

    .line 483
    .line 484
    .line 485
    move-result-object v0

    .line 486
    const-string v1, "Manifest network permission contains unknown fields: "

    .line 487
    .line 488
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 489
    .line 490
    .line 491
    move-result-object v0

    .line 492
    invoke-static {v0}, Ls;->c(Ljava/lang/Object;)V

    .line 493
    .line 494
    .line 495
    return-object v3

    .line 496
    :cond_17
    invoke-static {v10}, Ls;->j(Ljava/lang/String;)V

    .line 497
    .line 498
    .line 499
    return-object v3

    .line 500
    :cond_18
    check-cast v6, Ljava/lang/Iterable;

    .line 501
    .line 502
    invoke-static {v6}, Ldu;->z0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 503
    .line 504
    .line 505
    move-result-object v7

    .line 506
    const/4 v11, 0x0

    .line 507
    const/16 v12, 0x3f

    .line 508
    .line 509
    const/4 v8, 0x0

    .line 510
    const/4 v9, 0x0

    .line 511
    const/4 v10, 0x0

    .line 512
    invoke-static/range {v7 .. v12}, Ldu;->u0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lin0;I)Ljava/lang/String;

    .line 513
    .line 514
    .line 515
    move-result-object v0

    .line 516
    const-string v1, "Manifest permissions contain unknown fields: "

    .line 517
    .line 518
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 519
    .line 520
    .line 521
    move-result-object v0

    .line 522
    invoke-static {v0}, Ls;->c(Ljava/lang/Object;)V

    .line 523
    .line 524
    .line 525
    return-object v3

    .line 526
    :cond_19
    new-instance v6, Lri2;

    .line 527
    .line 528
    invoke-direct {v6, v3, v3, v3}, Lri2;-><init>(Lji2;Lkh2;Lch2;)V

    .line 529
    .line 530
    .line 531
    goto :goto_d

    .line 532
    :goto_e
    const-string v2, "configSchema"

    .line 533
    .line 534
    invoke-static {v0, v2}, Lvh2;->c(Ld41;Ljava/lang/String;)Ljava/lang/String;

    .line 535
    .line 536
    .line 537
    move-result-object v2

    .line 538
    if-eqz v2, :cond_1a

    .line 539
    .line 540
    :try_start_1
    invoke-static {v2}, Lxe1;->Y(Ljava/lang/String;)Ljava/lang/String;

    .line 541
    .line 542
    .line 543
    move-result-object v1
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0

    .line 544
    move-object v15, v1

    .line 545
    goto :goto_f

    .line 546
    :catch_0
    move-exception v0

    .line 547
    new-instance v3, Ljava/lang/IllegalArgumentException;

    .line 548
    .line 549
    const-string v4, "Invalid manifest configSchema \'"

    .line 550
    .line 551
    invoke-static {v4, v2, v1}, Lvi0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 552
    .line 553
    .line 554
    move-result-object v1

    .line 555
    invoke-direct {v3, v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 556
    .line 557
    .line 558
    throw v3

    .line 559
    :cond_1a
    move-object v15, v3

    .line 560
    :goto_f
    new-instance v4, Lth2;

    .line 561
    .line 562
    const-string v1, "apiVersion"

    .line 563
    .line 564
    invoke-static {v0, v1}, Lvh2;->e(Ld41;Ljava/lang/String;)I

    .line 565
    .line 566
    .line 567
    move-result v6

    .line 568
    const-string v1, "id"

    .line 569
    .line 570
    invoke-static {v0, v1}, Lvh2;->g(Ld41;Ljava/lang/String;)Ljava/lang/String;

    .line 571
    .line 572
    .line 573
    move-result-object v7

    .line 574
    const-string v1, "name"

    .line 575
    .line 576
    invoke-static {v0, v1}, Lvh2;->g(Ld41;Ljava/lang/String;)Ljava/lang/String;

    .line 577
    .line 578
    .line 579
    move-result-object v8

    .line 580
    const-string v1, "version"

    .line 581
    .line 582
    invoke-static {v0, v1}, Lvh2;->g(Ld41;Ljava/lang/String;)Ljava/lang/String;

    .line 583
    .line 584
    .line 585
    move-result-object v9

    .line 586
    const-string v1, "versionCode"

    .line 587
    .line 588
    invoke-static {v0, v1}, Lvh2;->f(Ld41;Ljava/lang/String;)Li41;

    .line 589
    .line 590
    .line 591
    move-result-object v1

    .line 592
    invoke-virtual {v1}, Li41;->b()Z

    .line 593
    .line 594
    .line 595
    move-result v2

    .line 596
    const-string v10, "Manifest field \'versionCode\' must be an integer."

    .line 597
    .line 598
    if-nez v2, :cond_1c

    .line 599
    .line 600
    invoke-static {v1}, Ll31;->f(Li41;)Ljava/lang/Long;

    .line 601
    .line 602
    .line 603
    move-result-object v1

    .line 604
    if-eqz v1, :cond_1b

    .line 605
    .line 606
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 607
    .line 608
    .line 609
    move-result-wide v10

    .line 610
    const-string v1, "description"

    .line 611
    .line 612
    invoke-static {v0, v1}, Lvh2;->c(Ld41;Ljava/lang/String;)Ljava/lang/String;

    .line 613
    .line 614
    .line 615
    move-result-object v13

    .line 616
    const-string v1, "author"

    .line 617
    .line 618
    invoke-static {v0, v1}, Lvh2;->c(Ld41;Ljava/lang/String;)Ljava/lang/String;

    .line 619
    .line 620
    .line 621
    move-result-object v14

    .line 622
    invoke-direct/range {v4 .. v16}, Lth2;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lri2;)V

    .line 623
    .line 624
    .line 625
    return-object v4

    .line 626
    :cond_1b
    invoke-static {v10}, Ls;->j(Ljava/lang/String;)V

    .line 627
    .line 628
    .line 629
    return-object v3

    .line 630
    :cond_1c
    invoke-static {v10}, Ls;->j(Ljava/lang/String;)V

    .line 631
    .line 632
    .line 633
    return-object v3

    .line 634
    :catch_1
    move-exception v0

    .line 635
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 636
    .line 637
    const-string v3, "Invalid manifest entry \'"

    .line 638
    .line 639
    invoke-static {v3, v4, v1}, Lvi0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 640
    .line 641
    .line 642
    move-result-object v1

    .line 643
    invoke-direct {v2, v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 644
    .line 645
    .line 646
    throw v2

    .line 647
    :cond_1d
    const-string v0, "Unsupported manifest version: "

    .line 648
    .line 649
    invoke-static {v0, v5}, Lvi0;->g(Ljava/lang/String;I)Ljava/lang/String;

    .line 650
    .line 651
    .line 652
    move-result-object v0

    .line 653
    invoke-static {v0}, Ls;->c(Ljava/lang/Object;)V

    .line 654
    .line 655
    .line 656
    return-object v3

    .line 657
    :cond_1e
    check-cast v2, Ljava/lang/Iterable;

    .line 658
    .line 659
    invoke-static {v2}, Ldu;->z0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 660
    .line 661
    .line 662
    move-result-object v4

    .line 663
    const/4 v8, 0x0

    .line 664
    const/16 v9, 0x3f

    .line 665
    .line 666
    const/4 v5, 0x0

    .line 667
    const/4 v6, 0x0

    .line 668
    const/4 v7, 0x0

    .line 669
    invoke-static/range {v4 .. v9}, Ldu;->u0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lin0;I)Ljava/lang/String;

    .line 670
    .line 671
    .line 672
    move-result-object v0

    .line 673
    const-string v1, "Manifest contains unknown fields: "

    .line 674
    .line 675
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 676
    .line 677
    .line 678
    move-result-object v0

    .line 679
    invoke-static {v0}, Ls;->c(Ljava/lang/Object;)V

    .line 680
    .line 681
    .line 682
    return-object v3

    .line 683
    :cond_1f
    const-string v0, "Manifest root must be a JSON object."

    .line 684
    .line 685
    invoke-static {v0}, Ls;->j(Ljava/lang/String;)V

    .line 686
    .line 687
    .line 688
    return-object v3
.end method

.method public static e(Ld41;Ljava/lang/String;)I
    .locals 4

    .line 1
    invoke-static {p0, p1}, Lvh2;->f(Ld41;Ljava/lang/String;)Li41;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Li41;->b()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    const-string v2, "\' must be an integer."

    .line 11
    .line 12
    const-string v3, "Manifest field \'"

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    invoke-static {p0}, Ll31;->e(Li41;)Ljava/lang/Integer;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    return p0

    .line 27
    :cond_0
    invoke-static {v3, p1, v2}, Lvi0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-static {p0}, Ls;->j(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return v1

    .line 35
    :cond_1
    invoke-static {v3, p1, v2}, Lvi0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-static {p0}, Ls;->c(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    return v1
.end method

.method public static f(Ld41;Ljava/lang/String;)Li41;
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Ld41;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lj31;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    const-string v1, "Manifest field \'"

    .line 9
    .line 10
    if-eqz p0, :cond_2

    .line 11
    .line 12
    instance-of v2, p0, Li41;

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    check-cast p0, Li41;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object p0, v0

    .line 20
    :goto_0
    if-eqz p0, :cond_1

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_1
    const-string p0, "\' must be a primitive value."

    .line 24
    .line 25
    invoke-static {v1, p1, p0}, Lvi0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-static {p0}, Ls;->j(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-object v0

    .line 33
    :cond_2
    const-string p0, "\' is required."

    .line 34
    .line 35
    invoke-static {v1, p1, p0}, Lvi0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-static {p0}, Ls;->j(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-object v0
.end method

.method public static g(Ld41;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {p0, p1}, Lvh2;->f(Ld41;Ljava/lang/String;)Li41;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Li41;->b()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Li41;->a()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    const-string p0, "Manifest field \'"

    .line 17
    .line 18
    const-string v0, "\' must be a string."

    .line 19
    .line 20
    invoke-static {p0, p1, v0}, Lvi0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-static {p0}, Ls;->c(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    const/4 p0, 0x0

    .line 28
    return-object p0
.end method

.method public static h(Ld41;Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 9

    .line 1
    invoke-virtual {p0, p1}, Ld41;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    instance-of v0, p0, Lz21;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    check-cast p0, Lz21;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object p0, v1

    .line 14
    :goto_0
    const-string v0, "Manifest field \'"

    .line 15
    .line 16
    if-eqz p0, :cond_6

    .line 17
    .line 18
    new-instance v2, Ljava/util/ArrayList;

    .line 19
    .line 20
    const/16 v3, 0xa

    .line 21
    .line 22
    invoke-static {p0, v3}, Leu;->B(Ljava/lang/Iterable;I)I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 27
    .line 28
    .line 29
    iget-object p0, p0, Lz21;->h:Ljava/util/List;

    .line 30
    .line 31
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    const/4 v3, 0x0

    .line 36
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-eqz v4, :cond_5

    .line 41
    .line 42
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    add-int/lit8 v5, v3, 0x1

    .line 47
    .line 48
    if-ltz v3, :cond_4

    .line 49
    .line 50
    check-cast v4, Lj31;

    .line 51
    .line 52
    instance-of v6, v4, Li41;

    .line 53
    .line 54
    if-eqz v6, :cond_1

    .line 55
    .line 56
    check-cast v4, Li41;

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_1
    move-object v4, v1

    .line 60
    :goto_2
    const-string v6, "]\' must be a string."

    .line 61
    .line 62
    const-string v7, "["

    .line 63
    .line 64
    if-eqz v4, :cond_3

    .line 65
    .line 66
    invoke-virtual {v4}, Li41;->b()Z

    .line 67
    .line 68
    .line 69
    move-result v8

    .line 70
    if-eqz v8, :cond_2

    .line 71
    .line 72
    invoke-virtual {v4}, Li41;->a()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move v3, v5

    .line 80
    goto :goto_1

    .line 81
    :cond_2
    new-instance p0, Ljava/lang/StringBuilder;

    .line 82
    .line 83
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 103
    .line 104
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    throw p1

    .line 112
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 113
    .line 114
    new-instance v1, Ljava/lang/StringBuilder;

    .line 115
    .line 116
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    throw p0

    .line 139
    :cond_4
    invoke-static {}, Leu;->a0()V

    .line 140
    .line 141
    .line 142
    throw v1

    .line 143
    :cond_5
    return-object v2

    .line 144
    :cond_6
    const-string p0, "\' must be an array."

    .line 145
    .line 146
    invoke-static {v0, p1, p0}, Lvi0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    invoke-static {p0}, Ls;->j(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    return-object v1
.end method
