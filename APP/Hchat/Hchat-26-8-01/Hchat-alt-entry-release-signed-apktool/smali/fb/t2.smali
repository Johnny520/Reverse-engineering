.class public final Lfb/t2;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final b:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 15

    .line 1
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lfb/t2;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 7
    .line 8
    const-string v13, "show_diff"

    .line 9
    .line 10
    const-string v14, "workspace_status"

    .line 11
    .line 12
    const-string v1, "check_access"

    .line 13
    .line 14
    const-string v2, "list_files"

    .line 15
    .line 16
    const-string v3, "read_file"

    .line 17
    .line 18
    const-string v4, "search_files"

    .line 19
    .line 20
    const-string v5, "create_directory"

    .line 21
    .line 22
    const-string v6, "write_file"

    .line 23
    .line 24
    const-string v7, "apply_patch"

    .line 25
    .line 26
    const-string v8, "move_path"

    .line 27
    .line 28
    const-string v9, "delete_path"

    .line 29
    .line 30
    const-string v10, "restore_path"

    .line 31
    .line 32
    const-string v11, "reset_workspace"

    .line 33
    .line 34
    const-string v12, "delete_plugin"

    .line 35
    .line 36
    filled-new-array/range {v1 .. v14}, [Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-static {v0}, Ltf/d0;->W([Ljava/lang/Object;)Ljava/util/Set;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    sput-object v0, Lfb/t2;->b:Ljava/util/Set;

    .line 45
    .line 46
    return-void
.end method

.method public static A(Ljava/lang/String;IILjava/lang/Integer;)Lorg/json/JSONObject;
    .locals 3

    .line 1
    const-string v0, "integer"

    .line 2
    .line 3
    const-string v1, "description"

    .line 4
    .line 5
    const-string v2, "type"

    .line 6
    .line 7
    invoke-static {v2, v0, v1, p0}, Lwb/en;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const-string v0, "default"

    .line 12
    .line 13
    invoke-virtual {p0, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 14
    .line 15
    .line 16
    const-string p1, "minimum"

    .line 17
    .line 18
    invoke-virtual {p0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 19
    .line 20
    .line 21
    if-eqz p3, :cond_0

    .line 22
    .line 23
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    const-string p2, "maximum"

    .line 28
    .line 29
    invoke-virtual {p0, p2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 30
    .line 31
    .line 32
    :cond_0
    return-object p0
.end method

.method public static final B(Ljava/lang/String;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    const-string v0, "local."

    .line 13
    .line 14
    invoke-static {p0, v0}, Log/m;->A0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const-string v0, "hchat.workspace."

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-static {p0, v0, v1}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    sget-object v0, Lfb/t2;->b:Ljava/util/Set;

    .line 28
    .line 29
    invoke-static {p0}, Lfb/t2;->E(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-interface {v0, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-eqz p0, :cond_0

    .line 38
    .line 39
    const/4 p0, 0x1

    .line 40
    return p0

    .line 41
    :cond_0
    return v1
.end method

.method public static C([B)Z
    .locals 6

    .line 1
    array-length v0, p0

    .line 2
    const/16 v1, 0x2000

    .line 3
    .line 4
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x0

    .line 9
    move v2, v1

    .line 10
    move v3, v2

    .line 11
    :goto_0
    if-lt v2, v0, :cond_1

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    mul-int/lit8 v3, v3, 0xa

    .line 16
    .line 17
    if-ge v3, v0, :cond_2

    .line 18
    .line 19
    :cond_0
    const/4 p0, 0x1

    .line 20
    return p0

    .line 21
    :cond_1
    aget-byte v4, p0, v2

    .line 22
    .line 23
    and-int/lit16 v4, v4, 0xff

    .line 24
    .line 25
    if-nez v4, :cond_3

    .line 26
    .line 27
    :cond_2
    return v1

    .line 28
    :cond_3
    const/16 v5, 0x9

    .line 29
    .line 30
    if-lt v4, v5, :cond_4

    .line 31
    .line 32
    const/16 v5, 0xe

    .line 33
    .line 34
    if-gt v5, v4, :cond_5

    .line 35
    .line 36
    const/16 v5, 0x20

    .line 37
    .line 38
    if-ge v4, v5, :cond_5

    .line 39
    .line 40
    :cond_4
    add-int/lit8 v3, v3, 0x1

    .line 41
    .line 42
    :cond_5
    add-int/lit8 v2, v2, 0x1

    .line 43
    .line 44
    goto :goto_0
.end method

.method public static final D(Ljava/lang/String;)Z
    .locals 8

    .line 1
    const-string v6, "reset_workspace"

    .line 2
    .line 3
    const-string v7, "delete_plugin"

    .line 4
    .line 5
    const-string v0, "create_directory"

    .line 6
    .line 7
    const-string v1, "write_file"

    .line 8
    .line 9
    const-string v2, "apply_patch"

    .line 10
    .line 11
    const-string v3, "move_path"

    .line 12
    .line 13
    const-string v4, "delete_path"

    .line 14
    .line 15
    const-string v5, "restore_path"

    .line 16
    .line 17
    filled-new-array/range {v0 .. v7}, [Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v0}, Ltf/d0;->W([Ljava/lang/Object;)Ljava/util/Set;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {p0}, Lfb/t2;->E(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-interface {v0, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    return p0
.end method

.method public static E(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-string v0, "local."

    .line 10
    .line 11
    invoke-static {p0, v0}, Log/m;->A0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const-string v0, "hchat.workspace."

    .line 16
    .line 17
    invoke-static {p0, v0}, Log/m;->A0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method public static final F(Landroid/content/Context;Ljava/lang/String;)Lfb/s2;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lfb/t2;->j(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    sget-object v1, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->ensureDirs(Landroid/content/Context;)Ljava/io/File;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v2}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-static {v2}, Lfb/t2;->N(Ljava/io/File;)V

    .line 23
    .line 24
    .line 25
    invoke-static {v2}, Lfb/t2;->M(Ljava/io/File;)V

    .line 26
    .line 27
    .line 28
    invoke-static/range {p1 .. p1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-nez v4, :cond_d

    .line 41
    .line 42
    invoke-virtual {v1, v0}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->listPlugins(Landroid/content/Context;)Ljava/util/List;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    if-eqz v4, :cond_1

    .line 55
    .line 56
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    move-object v5, v4

    .line 61
    check-cast v5, Leb/c0;

    .line 62
    .line 63
    iget-object v6, v5, Leb/c0;->a:Ljava/lang/String;

    .line 64
    .line 65
    invoke-virtual {v6, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 66
    .line 67
    .line 68
    move-result v6

    .line 69
    if-nez v6, :cond_2

    .line 70
    .line 71
    iget-object v6, v5, Leb/c0;->b:Ljava/lang/String;

    .line 72
    .line 73
    invoke-virtual {v6, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 74
    .line 75
    .line 76
    move-result v6

    .line 77
    if-nez v6, :cond_2

    .line 78
    .line 79
    iget-object v5, v5, Leb/c0;->h:Ljava/lang/String;

    .line 80
    .line 81
    if-eqz v5, :cond_0

    .line 82
    .line 83
    invoke-virtual {v5, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    const/4 v6, 0x1

    .line 88
    if-ne v5, v6, :cond_0

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_1
    const/4 v4, 0x0

    .line 92
    :cond_2
    :goto_0
    check-cast v4, Leb/c0;

    .line 93
    .line 94
    if-eqz v4, :cond_3

    .line 95
    .line 96
    iget-object v3, v4, Leb/c0;->a:Ljava/lang/String;

    .line 97
    .line 98
    :cond_3
    move-object v7, v3

    .line 99
    invoke-static {v7}, Lfb/a2;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-virtual {v7, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    if-eqz v1, :cond_c

    .line 108
    .line 109
    const-string v1, ".."

    .line 110
    .line 111
    const/4 v3, 0x0

    .line 112
    invoke-static {v7, v1, v3}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    if-nez v1, :cond_c

    .line 117
    .line 118
    new-instance v1, Ljava/io/File;

    .line 119
    .line 120
    invoke-direct {v1, v2, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v1}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    invoke-virtual {v1}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    .line 128
    .line 129
    .line 130
    move-result-object v8

    .line 131
    invoke-virtual {v8}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    invoke-static {v3, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v2

    .line 139
    if-eqz v2, :cond_b

    .line 140
    .line 141
    invoke-virtual {v1, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    if-eqz v1, :cond_b

    .line 146
    .line 147
    invoke-virtual {v8}, Ljava/io/File;->isDirectory()Z

    .line 148
    .line 149
    .line 150
    move-result v10

    .line 151
    if-eqz v10, :cond_4

    .line 152
    .line 153
    invoke-static {v8}, Lfb/t2;->u(Ljava/io/File;)V

    .line 154
    .line 155
    .line 156
    :cond_4
    new-instance v9, Ljava/io/File;

    .line 157
    .line 158
    invoke-static {v0}, Lfb/t2;->c0(Landroid/content/Context;)Ljava/io/File;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    invoke-direct {v9, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v9}, Ljava/io/File;->mkdirs()Z

    .line 174
    .line 175
    .line 176
    move-result v1

    .line 177
    if-eqz v1, :cond_a

    .line 178
    .line 179
    if-eqz v10, :cond_5

    .line 180
    .line 181
    :try_start_0
    invoke-static {v8}, Lfb/t2;->s(Ljava/io/File;)V

    .line 182
    .line 183
    .line 184
    invoke-static {v8, v9}, Lfb/t2;->n(Ljava/io/File;Ljava/io/File;)V

    .line 185
    .line 186
    .line 187
    invoke-static {v9}, Lfb/t2;->S(Ljava/io/File;)Ljava/util/Map;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    goto :goto_1

    .line 192
    :catchall_0
    move-exception v0

    .line 193
    goto :goto_6

    .line 194
    :cond_5
    sget-object v1, Ltf/u;->g:Ltf/u;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 195
    .line 196
    :goto_1
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    if-eqz v2, :cond_6

    .line 201
    .line 202
    move-object v6, v2

    .line 203
    goto :goto_2

    .line 204
    :cond_6
    move-object v6, v0

    .line 205
    :goto_2
    invoke-static {v1}, Lfb/t2;->a0(Ljava/util/Map;)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v11

    .line 209
    new-instance v12, Ljava/util/LinkedHashMap;

    .line 210
    .line 211
    invoke-interface {v1}, Ljava/util/Map;->size()I

    .line 212
    .line 213
    .line 214
    move-result v0

    .line 215
    invoke-static {v0}, Ltf/y;->a0(I)I

    .line 216
    .line 217
    .line 218
    move-result v0

    .line 219
    invoke-direct {v12, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 220
    .line 221
    .line 222
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    check-cast v0, Ljava/lang/Iterable;

    .line 227
    .line 228
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 233
    .line 234
    .line 235
    move-result v1

    .line 236
    if-eqz v1, :cond_7

    .line 237
    .line 238
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    check-cast v1, Ljava/util/Map$Entry;

    .line 243
    .line 244
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v2

    .line 248
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v1

    .line 252
    check-cast v1, Lfb/q2;

    .line 253
    .line 254
    invoke-static {v1}, Lfb/t2;->R(Lfb/q2;)Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    invoke-interface {v12, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    goto :goto_3

    .line 262
    :cond_7
    if-eqz v4, :cond_8

    .line 263
    .line 264
    iget-object v0, v4, Leb/c0;->h:Ljava/lang/String;

    .line 265
    .line 266
    if-eqz v0, :cond_8

    .line 267
    .line 268
    :goto_4
    move-object v13, v0

    .line 269
    goto :goto_5

    .line 270
    :cond_8
    if-eqz v4, :cond_9

    .line 271
    .line 272
    iget-object v0, v4, Leb/c0;->b:Ljava/lang/String;

    .line 273
    .line 274
    goto :goto_4

    .line 275
    :cond_9
    move-object v13, v7

    .line 276
    :goto_5
    new-instance v5, Lfb/s2;

    .line 277
    .line 278
    const/16 v16, -0x1

    .line 279
    .line 280
    const/16 v17, 0x0

    .line 281
    .line 282
    const/4 v14, 0x0

    .line 283
    const/4 v15, -0x1

    .line 284
    invoke-direct/range {v5 .. v17}, Lfb/s2;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;Ljava/io/File;ZLjava/lang/String;Ljava/util/LinkedHashMap;Ljava/lang/String;IIIZ)V

    .line 285
    .line 286
    .line 287
    return-object v5

    .line 288
    :goto_6
    :try_start_1
    invoke-static {v9}, Lfb/t2;->q(Ljava/io/File;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 289
    .line 290
    .line 291
    :catchall_1
    throw v0

    .line 292
    :cond_a
    const-string v0, "\u521b\u5efa\u63d2\u4ef6\u6682\u5b58\u5de5\u4f5c\u533a\u5931\u8d25"

    .line 293
    .line 294
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    :goto_7
    const/4 v0, 0x0

    .line 298
    return-object v0

    .line 299
    :cond_b
    const-string v0, "\u63d2\u4ef6\u76ee\u5f55\u4e0d\u5728\u811a\u672c\u6839\u76ee\u5f55\u5185\u6216\u4f7f\u7528\u4e86\u7b26\u53f7\u94fe\u63a5"

    .line 300
    .line 301
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 302
    .line 303
    .line 304
    goto :goto_7

    .line 305
    :cond_c
    const-string v0, "plugin_id \u5305\u542b\u4e0d\u5141\u8bb8\u7684\u8def\u5f84\u5b57\u7b26"

    .line 306
    .line 307
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    goto :goto_7

    .line 311
    :cond_d
    const-string v0, "plugin_id \u4e0d\u80fd\u4e3a\u7a7a"

    .line 312
    .line 313
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 314
    .line 315
    .line 316
    goto :goto_7
.end method

.method public static G(Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_3

    .line 19
    .line 20
    invoke-static {v1, p0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    const/4 v2, 0x0

    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    sget-object v3, Ljava/io/File;->separator:Ljava/lang/String;

    .line 39
    .line 40
    new-instance v4, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-static {v0, p0, v2}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    if-eqz p0, :cond_3

    .line 60
    .line 61
    :cond_0
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    if-nez p0, :cond_1

    .line 66
    .line 67
    const/4 p0, 0x0

    .line 68
    goto :goto_0

    .line 69
    :cond_1
    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    if-eqz p0, :cond_2

    .line 74
    .line 75
    new-instance p0, Lfb/q2;

    .line 76
    .line 77
    const-wide/16 v0, 0x0

    .line 78
    .line 79
    const-string p1, ""

    .line 80
    .line 81
    const/4 v2, 0x1

    .line 82
    invoke-direct {p0, v2, v0, v1, p1}, Lfb/q2;-><init>(ZJLjava/lang/String;)V

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_2
    new-instance p0, Lfb/q2;

    .line 87
    .line 88
    invoke-virtual {v1}, Ljava/io/File;->length()J

    .line 89
    .line 90
    .line 91
    move-result-wide v3

    .line 92
    invoke-static {v1}, Lfb/t2;->y(Ljava/io/File;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-direct {p0, v2, v3, v4, p1}, Lfb/q2;-><init>(ZJLjava/lang/String;)V

    .line 97
    .line 98
    .line 99
    :goto_0
    invoke-static {p0}, Lfb/t2;->R(Lfb/q2;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    return-object p0

    .line 104
    :cond_3
    const-string p0, "\u53d8\u66f4\u8def\u5f84\u8d85\u51fa\u63d2\u4ef6\u76ee\u5f55\u6216\u4f7f\u7528\u4e86\u7b26\u53f7\u94fe\u63a5: "

    .line 105
    .line 106
    invoke-static {p0, p1}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-static {p0}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    const/4 p0, 0x0

    .line 114
    return-object p0
.end method

.method public static H(Ljava/io/File;)Lfb/o2;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

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
    new-instance p0, Lfb/o2;

    .line 9
    .line 10
    const-string v0, "\u76ee\u5f55\u4e0d\u5b58\u5728"

    .line 11
    .line 12
    invoke-direct {p0, v1, v0}, Lfb/o2;-><init>(ZLjava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    invoke-virtual {p0}, Ljava/io/File;->canWrite()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_6

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/io/File;->canExecute()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    goto/16 :goto_3

    .line 29
    .line 30
    :cond_1
    new-instance v0, Ljava/io/File;

    .line 31
    .line 32
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    const/16 v3, 0x8

    .line 44
    .line 45
    invoke-static {v3, v2}, Log/m;->P0(ILjava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    const-string v3, ".hchat-agent-access-"

    .line 50
    .line 51
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-direct {v0, p0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    :try_start_0
    new-instance p0, Ljava/io/FileOutputStream;

    .line 59
    .line 60
    invoke-direct {p0, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    .line 62
    .line 63
    :try_start_1
    invoke-virtual {p0, v1}, Ljava/io/FileOutputStream;->write(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 64
    .line 65
    .line 66
    :try_start_2
    invoke-virtual {p0}, Ljava/io/FileOutputStream;->close()V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    if-eqz p0, :cond_2

    .line 74
    .line 75
    new-instance p0, Lfb/o2;

    .line 76
    .line 77
    const-string v2, "\u5199\u5165\u63a2\u9488\u6210\u529f"

    .line 78
    .line 79
    const/4 v3, 0x1

    .line 80
    invoke-direct {p0, v3, v2}, Lfb/o2;-><init>(ZLjava/lang/String;)V

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :catchall_0
    move-exception p0

    .line 85
    goto :goto_0

    .line 86
    :cond_2
    const-string p0, "\u65e0\u6cd5\u6e05\u7406\u6743\u9650\u63a2\u9488"

    .line 87
    .line 88
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 89
    .line 90
    invoke-direct {v2, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    throw v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 94
    :catchall_1
    move-exception v2

    .line 95
    :try_start_3
    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 96
    :catchall_2
    move-exception v3

    .line 97
    :try_start_4
    invoke-static {p0, v2}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 98
    .line 99
    .line 100
    throw v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 101
    :goto_0
    new-instance v2, Lsf/f;

    .line 102
    .line 103
    invoke-direct {v2, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 104
    .line 105
    .line 106
    move-object p0, v2

    .line 107
    :goto_1
    invoke-static {p0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    if-nez v2, :cond_3

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_3
    :try_start_5
    invoke-virtual {v0}, Ljava/io/File;->delete()Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 115
    .line 116
    .line 117
    :catchall_3
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    if-nez v0, :cond_4

    .line 130
    .line 131
    const-string v0, ""

    .line 132
    .line 133
    :cond_4
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 134
    .line 135
    .line 136
    move-result v2

    .line 137
    if-eqz v2, :cond_5

    .line 138
    .line 139
    const-string v0, "\u672a\u77e5\u5199\u5165\u9519\u8bef"

    .line 140
    .line 141
    :cond_5
    new-instance v2, Ljava/lang/StringBuilder;

    .line 142
    .line 143
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    const-string p0, ": "

    .line 150
    .line 151
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    new-instance v0, Lfb/o2;

    .line 162
    .line 163
    invoke-direct {v0, v1, p0}, Lfb/o2;-><init>(ZLjava/lang/String;)V

    .line 164
    .line 165
    .line 166
    move-object p0, v0

    .line 167
    :goto_2
    check-cast p0, Lfb/o2;

    .line 168
    .line 169
    return-object p0

    .line 170
    :cond_6
    :goto_3
    new-instance p0, Lfb/o2;

    .line 171
    .line 172
    const-string v0, "File.canWrite/canExecute=false"

    .line 173
    .line 174
    invoke-direct {p0, v1, v0}, Lfb/o2;-><init>(ZLjava/lang/String;)V

    .line 175
    .line 176
    .line 177
    return-object p0
.end method

.method public static I(Ljava/io/File;)Lfb/r2;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance p0, Lfb/r2;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    sget-object v1, Ltf/t;->g:Ltf/t;

    .line 11
    .line 12
    invoke-direct {p0, v1, v0}, Lfb/r2;-><init>(Ljava/util/List;Z)V

    .line 13
    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    new-instance v1, Lgg/s;

    .line 22
    .line 23
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v1, p0, p0}, Lfb/t2;->J(Ljava/util/ArrayList;Lgg/s;Ljava/io/File;Ljava/io/File;)V

    .line 27
    .line 28
    .line 29
    new-instance p0, Lfb/r2;

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    invoke-direct {p0, v0, v1}, Lfb/r2;-><init>(Ljava/util/List;Z)V

    .line 36
    .line 37
    .line 38
    return-object p0
.end method

.method public static final J(Ljava/util/ArrayList;Lgg/s;Ljava/io/File;Ljava/io/File;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x8

    .line 6
    .line 7
    if-lt v0, v1, :cond_0

    .line 8
    .line 9
    goto/16 :goto_4

    .line 10
    .line 11
    :cond_0
    iget v0, p1, Lgg/s;->g:I

    .line 12
    .line 13
    add-int/lit8 v0, v0, 0x1

    .line 14
    .line 15
    iput v0, p1, Lgg/s;->g:I

    .line 16
    .line 17
    const/16 v1, 0x1000

    .line 18
    .line 19
    if-le v0, v1, :cond_1

    .line 20
    .line 21
    const-string p1, "\u76ee\u5f55\u9879\u8fc7\u591a\uff0c\u65e0\u6cd5\u5b8c\u6210\u5b89\u5168\u66ff\u6362\u9884\u68c0"

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    :try_start_0
    invoke-virtual {p3}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    .line 28
    .line 29
    .line 30
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception v0

    .line 33
    new-instance v1, Lsf/f;

    .line 34
    .line 35
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 36
    .line 37
    .line 38
    move-object v0, v1

    .line 39
    :goto_0
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    if-nez v1, :cond_b

    .line 44
    .line 45
    check-cast v0, Ljava/io/File;

    .line 46
    .line 47
    invoke-virtual {p3}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-static {v1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-nez v0, :cond_2

    .line 56
    .line 57
    invoke-static {p2, p3}, Lfb/t2;->K(Ljava/io/File;Ljava/io/File;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    const-string p2, " \u662f\u4e0d\u652f\u6301\u7684\u7b26\u53f7\u94fe\u63a5"

    .line 62
    .line 63
    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :cond_2
    invoke-virtual {p3}, Ljava/io/File;->isDirectory()Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-eqz v0, :cond_7

    .line 76
    .line 77
    invoke-virtual {p3}, Ljava/io/File;->canRead()Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-eqz v0, :cond_6

    .line 82
    .line 83
    invoke-virtual {p3}, Ljava/io/File;->canExecute()Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-nez v0, :cond_3

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_3
    invoke-static {p3}, Lfb/t2;->H(Ljava/io/File;)Lfb/o2;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    iget-boolean v1, v0, Lfb/o2;->a:Z

    .line 95
    .line 96
    if-nez v1, :cond_4

    .line 97
    .line 98
    invoke-static {p2, p3}, Lfb/t2;->K(Ljava/io/File;Ljava/io/File;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    iget-object p2, v0, Lfb/o2;->b:Ljava/lang/String;

    .line 103
    .line 104
    new-instance p3, Ljava/lang/StringBuilder;

    .line 105
    .line 106
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    const-string p1, " \u76ee\u5f55\u4e0d\u53ef\u4fee\u6539\uff1a"

    .line 113
    .line 114
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    return-void

    .line 128
    :cond_4
    invoke-virtual {p3}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    if-nez v0, :cond_5

    .line 133
    .line 134
    invoke-static {p2, p3}, Lfb/t2;->K(Ljava/io/File;Ljava/io/File;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    const-string p2, " \u65e0\u6cd5\u5217\u51fa\u76ee\u5f55\u5185\u5bb9"

    .line 139
    .line 140
    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    return-void

    .line 148
    :cond_5
    array-length p3, v0

    .line 149
    const/4 v1, 0x0

    .line 150
    :goto_1
    if-ge v1, p3, :cond_a

    .line 151
    .line 152
    aget-object v2, v0, v1

    .line 153
    .line 154
    invoke-static {p0, p1, p2, v2}, Lfb/t2;->J(Ljava/util/ArrayList;Lgg/s;Ljava/io/File;Ljava/io/File;)V

    .line 155
    .line 156
    .line 157
    add-int/lit8 v1, v1, 0x1

    .line 158
    .line 159
    goto :goto_1

    .line 160
    :cond_6
    :goto_2
    invoke-static {p2, p3}, Lfb/t2;->K(Ljava/io/File;Ljava/io/File;)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    const-string p2, " \u76ee\u5f55\u4e0d\u53ef\u8bfb\u6216\u4e0d\u53ef\u8fdb\u5165"

    .line 165
    .line 166
    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    return-void

    .line 174
    :cond_7
    invoke-virtual {p3}, Ljava/io/File;->isFile()Z

    .line 175
    .line 176
    .line 177
    move-result p1

    .line 178
    if-nez p1, :cond_8

    .line 179
    .line 180
    invoke-static {p2, p3}, Lfb/t2;->K(Ljava/io/File;Ljava/io/File;)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    const-string p2, " \u4e0d\u662f\u666e\u901a\u6587\u4ef6"

    .line 185
    .line 186
    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    goto :goto_4

    .line 194
    :cond_8
    invoke-virtual {p3}, Ljava/io/File;->canRead()Z

    .line 195
    .line 196
    .line 197
    move-result p1

    .line 198
    if-eqz p1, :cond_9

    .line 199
    .line 200
    :try_start_1
    new-instance p1, Ljava/io/FileInputStream;

    .line 201
    .line 202
    invoke-direct {p1, p3}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {p1}, Ljava/io/FileInputStream;->close()V

    .line 206
    .line 207
    .line 208
    sget-object p1, Lsf/n;->a:Lsf/n;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 209
    .line 210
    goto :goto_3

    .line 211
    :catchall_1
    move-exception p1

    .line 212
    new-instance v0, Lsf/f;

    .line 213
    .line 214
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 215
    .line 216
    .line 217
    move-object p1, v0

    .line 218
    :goto_3
    instance-of p1, p1, Lsf/f;

    .line 219
    .line 220
    if-eqz p1, :cond_a

    .line 221
    .line 222
    :cond_9
    invoke-static {p2, p3}, Lfb/t2;->K(Ljava/io/File;Ljava/io/File;)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object p1

    .line 226
    const-string p2, " \u6587\u4ef6\u4e0d\u53ef\u8bfb\uff0c\u65e0\u6cd5\u521b\u5efa\u5907\u4efd"

    .line 227
    .line 228
    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object p1

    .line 232
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 233
    .line 234
    .line 235
    :cond_a
    :goto_4
    return-void

    .line 236
    :cond_b
    invoke-static {p2, p3}, Lfb/t2;->K(Ljava/io/File;Ljava/io/File;)Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object p1

    .line 240
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object p2

    .line 244
    if-nez p2, :cond_c

    .line 245
    .line 246
    const-string p2, ""

    .line 247
    .line 248
    :cond_c
    new-instance p3, Ljava/lang/StringBuilder;

    .line 249
    .line 250
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 251
    .line 252
    .line 253
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 254
    .line 255
    .line 256
    const-string p1, " \u65e0\u6cd5\u89e3\u6790\u771f\u5b9e\u8def\u5f84\uff1a"

    .line 257
    .line 258
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 259
    .line 260
    .line 261
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 262
    .line 263
    .line 264
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object p1

    .line 268
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    return-void
.end method

.method public static final K(Ljava/io/File;Ljava/io/File;)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-static {p1, p0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string p0, "."

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    sget-object v2, Ljava/io/File;->separator:Ljava/lang/String;

    .line 22
    .line 23
    new-instance v3, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    const/4 v2, 0x0

    .line 39
    invoke-static {v0, v1, v2}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    invoke-static {p1, p0}, Ldg/l;->i0(Ljava/io/File;Ljava/io/File;)Ljava/io/File;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-static {p0}, Ldg/l;->d0(Ljava/io/File;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0

    .line 54
    :cond_1
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    return-object p0
.end method

.method public static L(Ljava/io/File;)Ljava/lang/String;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/io/File;->isFile()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/io/File;->length()J

    .line 9
    .line 10
    .line 11
    move-result-wide v2

    .line 12
    const-wide/32 v4, 0x200000

    .line 13
    .line 14
    .line 15
    cmp-long v0, v2, v4

    .line 16
    .line 17
    if-lez v0, :cond_0

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    :try_start_0
    invoke-static {p0}, Ldg/l;->g0(Ljava/io/File;)[B

    .line 21
    .line 22
    .line 23
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception p0

    .line 26
    new-instance v0, Lsf/f;

    .line 27
    .line 28
    invoke-direct {v0, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    move-object p0, v0

    .line 32
    :goto_0
    nop

    .line 33
    instance-of v0, p0, Lsf/f;

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    move-object p0, v1

    .line 38
    :cond_1
    check-cast p0, [B

    .line 39
    .line 40
    if-eqz p0, :cond_2

    .line 41
    .line 42
    new-instance v0, Ljava/lang/String;

    .line 43
    .line 44
    sget-object v2, Log/a;->a:Ljava/nio/charset/Charset;

    .line 45
    .line 46
    invoke-direct {v0, p0, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 47
    .line 48
    .line 49
    invoke-static {p0}, Lfb/t2;->C([B)Z

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    if-eqz p0, :cond_2

    .line 54
    .line 55
    move-object v1, v0

    .line 56
    :cond_2
    :goto_1
    return-object v1
.end method

.method public static M(Ljava/io/File;)V
    .locals 14

    .line 1
    const-string v0, "^\\.(.+)\\.agent-(new|old|copy)-([A-Za-z0-9]+)$"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v1, :cond_4

    .line 16
    .line 17
    new-instance v3, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    array-length v4, v1

    .line 23
    const/4 v5, 0x0

    .line 24
    :goto_0
    if-ge v5, v4, :cond_5

    .line 25
    .line 26
    aget-object v6, v1, v5

    .line 27
    .line 28
    invoke-virtual {v6}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v7

    .line 32
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v7}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 36
    .line 37
    .line 38
    move-result-object v8

    .line 39
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v8}, Ljava/util/regex/Matcher;->matches()Z

    .line 43
    .line 44
    .line 45
    move-result v9

    .line 46
    if-nez v9, :cond_0

    .line 47
    .line 48
    move-object v9, v2

    .line 49
    goto :goto_1

    .line 50
    :cond_0
    new-instance v9, Log/i;

    .line 51
    .line 52
    invoke-direct {v9, v8, v7}, Log/i;-><init>(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V

    .line 53
    .line 54
    .line 55
    :goto_1
    if-eqz v9, :cond_1

    .line 56
    .line 57
    invoke-virtual {v9}, Log/i;->a()Ljava/util/List;

    .line 58
    .line 59
    .line 60
    move-result-object v7

    .line 61
    check-cast v7, Log/g;

    .line 62
    .line 63
    const/4 v8, 0x1

    .line 64
    invoke-virtual {v7, v8}, Log/g;->get(I)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v7

    .line 68
    check-cast v7, Ljava/lang/String;

    .line 69
    .line 70
    invoke-static {v7}, Lfb/a2;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v8

    .line 74
    invoke-virtual {v7, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v8

    .line 78
    if-nez v8, :cond_2

    .line 79
    .line 80
    :cond_1
    move-object v8, v2

    .line 81
    goto :goto_2

    .line 82
    :cond_2
    new-instance v8, Lsf/j;

    .line 83
    .line 84
    invoke-virtual {v9}, Log/i;->a()Ljava/util/List;

    .line 85
    .line 86
    .line 87
    move-result-object v9

    .line 88
    const/4 v10, 0x2

    .line 89
    check-cast v9, Log/g;

    .line 90
    .line 91
    invoke-virtual {v9, v10}, Log/g;->get(I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v9

    .line 95
    invoke-direct {v8, v7, v9, v6}, Lsf/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    :goto_2
    if-eqz v8, :cond_3

    .line 99
    .line 100
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    :cond_3
    add-int/lit8 v5, v5, 0x1

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_4
    move-object v3, v2

    .line 107
    :cond_5
    if-nez v3, :cond_6

    .line 108
    .line 109
    sget-object v3, Ltf/t;->g:Ltf/t;

    .line 110
    .line 111
    :cond_6
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 112
    .line 113
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 114
    .line 115
    .line 116
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 121
    .line 122
    .line 123
    move-result v3

    .line 124
    if-eqz v3, :cond_8

    .line 125
    .line 126
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    move-object v4, v3

    .line 131
    check-cast v4, Lsf/j;

    .line 132
    .line 133
    iget-object v4, v4, Lsf/j;->g:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v4, Ljava/lang/String;

    .line 136
    .line 137
    invoke-virtual {v0, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v5

    .line 141
    if-nez v5, :cond_7

    .line 142
    .line 143
    new-instance v5, Ljava/util/ArrayList;

    .line 144
    .line 145
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 146
    .line 147
    .line 148
    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    :cond_7
    check-cast v5, Ljava/util/List;

    .line 152
    .line 153
    invoke-interface {v5, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    goto :goto_3

    .line 157
    :cond_8
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    if-eqz v0, :cond_26

    .line 170
    .line 171
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    check-cast v0, Ljava/util/Map$Entry;

    .line 176
    .line 177
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    check-cast v3, Ljava/lang/String;

    .line 182
    .line 183
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    move-object v4, v0

    .line 188
    check-cast v4, Ljava/util/List;

    .line 189
    .line 190
    new-instance v0, Lfb/g0;

    .line 191
    .line 192
    const/16 v5, 0x19

    .line 193
    .line 194
    invoke-direct {v0, v5}, Lfb/g0;-><init>(I)V

    .line 195
    .line 196
    .line 197
    new-instance v5, Lbc/j;

    .line 198
    .line 199
    const/16 v6, 0x9

    .line 200
    .line 201
    invoke-direct {v5, v0, v6}, Lbc/j;-><init>(Ljava/lang/Object;I)V

    .line 202
    .line 203
    .line 204
    sget-object v0, Lfb/t2;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 205
    .line 206
    invoke-virtual {v0, v3, v5}, Ljava/util/concurrent/ConcurrentHashMap;->computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    move-object v5, v0

    .line 214
    check-cast v5, Ljava/util/concurrent/locks/ReentrantLock;

    .line 215
    .line 216
    invoke-interface {v5}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 217
    .line 218
    .line 219
    :try_start_0
    new-instance v0, Ljava/io/File;

    .line 220
    .line 221
    invoke-direct {v0, p0, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v0}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;

    .line 225
    .line 226
    .line 227
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 228
    :try_start_1
    invoke-virtual {v3}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    .line 229
    .line 230
    .line 231
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 232
    goto :goto_5

    .line 233
    :catchall_0
    move-exception v0

    .line 234
    :try_start_2
    new-instance v6, Lsf/f;

    .line 235
    .line 236
    invoke-direct {v6, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 237
    .line 238
    .line 239
    move-object v0, v6

    .line 240
    :goto_5
    nop

    .line 241
    instance-of v6, v0, Lsf/f;

    .line 242
    .line 243
    if-eqz v6, :cond_9

    .line 244
    .line 245
    move-object v0, v2

    .line 246
    :cond_9
    move-object v6, v0

    .line 247
    check-cast v6, Ljava/io/File;

    .line 248
    .line 249
    if-eqz v6, :cond_25

    .line 250
    .line 251
    invoke-virtual {v6}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    invoke-static {v0, p0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    move-result v0

    .line 259
    if-eqz v0, :cond_25

    .line 260
    .line 261
    invoke-static {v3, v6}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    move-result v0

    .line 265
    if-nez v0, :cond_a

    .line 266
    .line 267
    goto/16 :goto_14

    .line 268
    .line 269
    :cond_a
    new-instance v0, Ljava/util/ArrayList;

    .line 270
    .line 271
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 272
    .line 273
    .line 274
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 275
    .line 276
    .line 277
    move-result-object v3

    .line 278
    :cond_b
    :goto_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 279
    .line 280
    .line 281
    move-result v7

    .line 282
    if-eqz v7, :cond_c

    .line 283
    .line 284
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v7

    .line 288
    move-object v8, v7

    .line 289
    check-cast v8, Lsf/j;

    .line 290
    .line 291
    iget-object v8, v8, Lsf/j;->h:Ljava/lang/Object;

    .line 292
    .line 293
    const-string v9, "old"

    .line 294
    .line 295
    invoke-static {v8, v9}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 296
    .line 297
    .line 298
    move-result v8

    .line 299
    if-eqz v8, :cond_b

    .line 300
    .line 301
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 302
    .line 303
    .line 304
    goto :goto_6

    .line 305
    :catchall_1
    move-exception v0

    .line 306
    move-object p0, v0

    .line 307
    goto/16 :goto_15

    .line 308
    .line 309
    :cond_c
    new-instance v3, Ljava/util/ArrayList;

    .line 310
    .line 311
    invoke-static {v0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 312
    .line 313
    .line 314
    move-result v7

    .line 315
    invoke-direct {v3, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 323
    .line 324
    .line 325
    move-result v7

    .line 326
    if-eqz v7, :cond_d

    .line 327
    .line 328
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v7

    .line 332
    check-cast v7, Lsf/j;

    .line 333
    .line 334
    iget-object v7, v7, Lsf/j;->i:Ljava/lang/Object;

    .line 335
    .line 336
    check-cast v7, Ljava/io/File;

    .line 337
    .line 338
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 339
    .line 340
    .line 341
    goto :goto_7

    .line 342
    :cond_d
    new-instance v0, Lfb/r;

    .line 343
    .line 344
    const/16 v7, 0xc

    .line 345
    .line 346
    invoke-direct {v0, v7}, Lfb/r;-><init>(I)V

    .line 347
    .line 348
    .line 349
    invoke-static {v3, v0}, Ltf/m;->K1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 350
    .line 351
    .line 352
    move-result-object v0

    .line 353
    new-instance v3, Ljava/util/ArrayList;

    .line 354
    .line 355
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 356
    .line 357
    .line 358
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 359
    .line 360
    .line 361
    move-result-object v7

    .line 362
    :cond_e
    :goto_8
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 363
    .line 364
    .line 365
    move-result v8

    .line 366
    if-eqz v8, :cond_f

    .line 367
    .line 368
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object v8

    .line 372
    move-object v9, v8

    .line 373
    check-cast v9, Lsf/j;

    .line 374
    .line 375
    iget-object v9, v9, Lsf/j;->h:Ljava/lang/Object;

    .line 376
    .line 377
    const-string v10, "copy"

    .line 378
    .line 379
    invoke-static {v9, v10}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 380
    .line 381
    .line 382
    move-result v9

    .line 383
    if-eqz v9, :cond_e

    .line 384
    .line 385
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 386
    .line 387
    .line 388
    goto :goto_8

    .line 389
    :cond_f
    new-instance v7, Ljava/util/ArrayList;

    .line 390
    .line 391
    invoke-static {v3}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 392
    .line 393
    .line 394
    move-result v8

    .line 395
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 396
    .line 397
    .line 398
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 399
    .line 400
    .line 401
    move-result-object v3

    .line 402
    :goto_9
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 403
    .line 404
    .line 405
    move-result v8

    .line 406
    if-eqz v8, :cond_10

    .line 407
    .line 408
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    move-result-object v8

    .line 412
    check-cast v8, Lsf/j;

    .line 413
    .line 414
    iget-object v8, v8, Lsf/j;->i:Ljava/lang/Object;

    .line 415
    .line 416
    check-cast v8, Ljava/io/File;

    .line 417
    .line 418
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 419
    .line 420
    .line 421
    goto :goto_9

    .line 422
    :cond_10
    new-instance v3, Lfb/r;

    .line 423
    .line 424
    const/16 v8, 0xd

    .line 425
    .line 426
    invoke-direct {v3, v8}, Lfb/r;-><init>(I)V

    .line 427
    .line 428
    .line 429
    invoke-static {v7, v3}, Ltf/m;->K1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 430
    .line 431
    .line 432
    move-result-object v3

    .line 433
    invoke-static {v0, v3}, Ltf/m;->F1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 434
    .line 435
    .line 436
    move-result-object v3

    .line 437
    new-instance v7, Ljava/util/ArrayList;

    .line 438
    .line 439
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 440
    .line 441
    .line 442
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 443
    .line 444
    .line 445
    move-result-object v8

    .line 446
    :cond_11
    :goto_a
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 447
    .line 448
    .line 449
    move-result v9
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 450
    const-string v10, "complete"

    .line 451
    .line 452
    if-eqz v9, :cond_12

    .line 453
    .line 454
    :try_start_3
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 455
    .line 456
    .line 457
    move-result-object v9

    .line 458
    move-object v11, v9

    .line 459
    check-cast v11, Ljava/io/File;

    .line 460
    .line 461
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 462
    .line 463
    .line 464
    invoke-static {v11}, Lfb/t2;->X(Ljava/io/File;)Ljava/io/File;

    .line 465
    .line 466
    .line 467
    move-result-object v12

    .line 468
    invoke-static {v12}, Lfb/t2;->Y(Ljava/io/File;)Ljava/lang/String;

    .line 469
    .line 470
    .line 471
    move-result-object v12

    .line 472
    invoke-static {v12, v10}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 473
    .line 474
    .line 475
    move-result v10

    .line 476
    if-nez v10, :cond_11

    .line 477
    .line 478
    invoke-static {v11}, Lfb/t2;->Z(Ljava/io/File;)Ljava/io/File;

    .line 479
    .line 480
    .line 481
    move-result-object v10

    .line 482
    invoke-virtual {v10}, Ljava/io/File;->isFile()Z

    .line 483
    .line 484
    .line 485
    move-result v10

    .line 486
    if-eqz v10, :cond_11

    .line 487
    .line 488
    invoke-static {v11}, Lfb/t2;->z(Ljava/io/File;)Z

    .line 489
    .line 490
    .line 491
    move-result v10

    .line 492
    if-nez v10, :cond_11

    .line 493
    .line 494
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 495
    .line 496
    .line 497
    goto :goto_a

    .line 498
    :cond_12
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 499
    .line 500
    .line 501
    move-result v8

    .line 502
    if-nez v8, :cond_13

    .line 503
    .line 504
    new-instance v11, Lfb/g0;

    .line 505
    .line 506
    const/16 v0, 0x16

    .line 507
    .line 508
    invoke-direct {v11, v0}, Lfb/g0;-><init>(I)V

    .line 509
    .line 510
    .line 511
    const/16 v12, 0x1f

    .line 512
    .line 513
    const/4 v8, 0x0

    .line 514
    const/4 v9, 0x0

    .line 515
    const/4 v10, 0x0

    .line 516
    invoke-static/range {v7 .. v12}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 517
    .line 518
    .line 519
    move-result-object v0

    .line 520
    new-instance v3, Ljava/lang/StringBuilder;

    .line 521
    .line 522
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 523
    .line 524
    .line 525
    const-string v4, "[Hchat:ScriptAgent] \u63d2\u4ef6\u4e8b\u52a1\u5907\u4efd\u6821\u9a8c\u5931\u8d25\uff0c\u5df2\u4fdd\u7559\u73b0\u573a: "

    .line 526
    .line 527
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 528
    .line 529
    .line 530
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 531
    .line 532
    .line 533
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 534
    .line 535
    .line 536
    move-result-object v0

    .line 537
    invoke-static {v0}, Lfb/v0;->m(Ljava/lang/String;)V

    .line 538
    .line 539
    .line 540
    goto/16 :goto_14

    .line 541
    .line 542
    :cond_13
    new-instance v7, Ljava/util/ArrayList;

    .line 543
    .line 544
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 545
    .line 546
    .line 547
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 548
    .line 549
    .line 550
    move-result-object v3

    .line 551
    :cond_14
    :goto_b
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 552
    .line 553
    .line 554
    move-result v8

    .line 555
    if-eqz v8, :cond_15

    .line 556
    .line 557
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 558
    .line 559
    .line 560
    move-result-object v8

    .line 561
    move-object v9, v8

    .line 562
    check-cast v9, Ljava/io/File;

    .line 563
    .line 564
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 565
    .line 566
    .line 567
    invoke-static {v9}, Lfb/t2;->z(Ljava/io/File;)Z

    .line 568
    .line 569
    .line 570
    move-result v11

    .line 571
    if-eqz v11, :cond_14

    .line 572
    .line 573
    invoke-static {v9}, Lfb/t2;->X(Ljava/io/File;)Ljava/io/File;

    .line 574
    .line 575
    .line 576
    move-result-object v9

    .line 577
    invoke-static {v9}, Lfb/t2;->Y(Ljava/io/File;)Ljava/lang/String;

    .line 578
    .line 579
    .line 580
    move-result-object v9

    .line 581
    invoke-static {v9, v10}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 582
    .line 583
    .line 584
    move-result v9

    .line 585
    if-nez v9, :cond_14

    .line 586
    .line 587
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 588
    .line 589
    .line 590
    goto :goto_b

    .line 591
    :cond_15
    new-instance v3, Ljava/util/ArrayList;

    .line 592
    .line 593
    invoke-direct {v3, v7}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 594
    .line 595
    .line 596
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    .line 597
    .line 598
    .line 599
    move-result v7

    .line 600
    if-nez v7, :cond_18

    .line 601
    .line 602
    new-instance v7, Ljava/util/ArrayList;

    .line 603
    .line 604
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 605
    .line 606
    .line 607
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 608
    .line 609
    .line 610
    move-result-object v0

    .line 611
    :cond_16
    :goto_c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 612
    .line 613
    .line 614
    move-result v8

    .line 615
    if-eqz v8, :cond_17

    .line 616
    .line 617
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 618
    .line 619
    .line 620
    move-result-object v8

    .line 621
    move-object v9, v8

    .line 622
    check-cast v9, Ljava/io/File;

    .line 623
    .line 624
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 625
    .line 626
    .line 627
    invoke-static {v9}, Lfb/t2;->Z(Ljava/io/File;)Ljava/io/File;

    .line 628
    .line 629
    .line 630
    move-result-object v11

    .line 631
    invoke-virtual {v11}, Ljava/io/File;->exists()Z

    .line 632
    .line 633
    .line 634
    move-result v11

    .line 635
    if-nez v11, :cond_16

    .line 636
    .line 637
    invoke-static {v9}, Lfb/t2;->X(Ljava/io/File;)Ljava/io/File;

    .line 638
    .line 639
    .line 640
    move-result-object v9

    .line 641
    invoke-static {v9}, Lfb/t2;->Y(Ljava/io/File;)Ljava/lang/String;

    .line 642
    .line 643
    .line 644
    move-result-object v9

    .line 645
    invoke-static {v9, v10}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 646
    .line 647
    .line 648
    move-result v9

    .line 649
    if-nez v9, :cond_16

    .line 650
    .line 651
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 652
    .line 653
    .line 654
    goto :goto_c

    .line 655
    :cond_17
    invoke-static {v3, v7}, Ltf/r;->h1(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 656
    .line 657
    .line 658
    :cond_18
    invoke-static {v3}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 659
    .line 660
    .line 661
    move-result-object v0

    .line 662
    invoke-static {v0}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 663
    .line 664
    .line 665
    move-result-object v0

    .line 666
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 667
    .line 668
    .line 669
    move-result-object v0

    .line 670
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 671
    .line 672
    .line 673
    move-result v3

    .line 674
    if-nez v3, :cond_19

    .line 675
    .line 676
    move-object v3, v2

    .line 677
    goto :goto_d

    .line 678
    :cond_19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 679
    .line 680
    .line 681
    move-result-object v3

    .line 682
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 683
    .line 684
    .line 685
    move-result v7

    .line 686
    if-nez v7, :cond_1a

    .line 687
    .line 688
    goto :goto_d

    .line 689
    :cond_1a
    move-object v7, v3

    .line 690
    check-cast v7, Ljava/io/File;

    .line 691
    .line 692
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 693
    .line 694
    .line 695
    invoke-static {v7}, Lfb/t2;->Z(Ljava/io/File;)Ljava/io/File;

    .line 696
    .line 697
    .line 698
    move-result-object v8

    .line 699
    invoke-virtual {v8}, Ljava/io/File;->lastModified()J

    .line 700
    .line 701
    .line 702
    move-result-wide v8

    .line 703
    invoke-virtual {v7}, Ljava/io/File;->lastModified()J

    .line 704
    .line 705
    .line 706
    move-result-wide v10

    .line 707
    cmp-long v7, v8, v10

    .line 708
    .line 709
    if-gez v7, :cond_1b

    .line 710
    .line 711
    move-wide v8, v10

    .line 712
    :cond_1b
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 713
    .line 714
    .line 715
    move-result-object v7

    .line 716
    :cond_1c
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 717
    .line 718
    .line 719
    move-result-object v8

    .line 720
    move-object v9, v8

    .line 721
    check-cast v9, Ljava/io/File;

    .line 722
    .line 723
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 724
    .line 725
    .line 726
    invoke-static {v9}, Lfb/t2;->Z(Ljava/io/File;)Ljava/io/File;

    .line 727
    .line 728
    .line 729
    move-result-object v10

    .line 730
    invoke-virtual {v10}, Ljava/io/File;->lastModified()J

    .line 731
    .line 732
    .line 733
    move-result-wide v10

    .line 734
    invoke-virtual {v9}, Ljava/io/File;->lastModified()J

    .line 735
    .line 736
    .line 737
    move-result-wide v12

    .line 738
    cmp-long v9, v10, v12

    .line 739
    .line 740
    if-gez v9, :cond_1d

    .line 741
    .line 742
    move-wide v10, v12

    .line 743
    :cond_1d
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 744
    .line 745
    .line 746
    move-result-object v9

    .line 747
    invoke-virtual {v7, v9}, Ljava/lang/Long;->compareTo(Ljava/lang/Object;)I

    .line 748
    .line 749
    .line 750
    move-result v10

    .line 751
    if-gez v10, :cond_1e

    .line 752
    .line 753
    move-object v3, v8

    .line 754
    move-object v7, v9

    .line 755
    :cond_1e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 756
    .line 757
    .line 758
    move-result v8

    .line 759
    if-nez v8, :cond_1c

    .line 760
    .line 761
    :goto_d
    check-cast v3, Ljava/io/File;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 762
    .line 763
    sget-object v7, Lsf/n;->a:Lsf/n;

    .line 764
    .line 765
    if-eqz v3, :cond_20

    .line 766
    .line 767
    :try_start_4
    const-string v0, "\u6062\u590d\u63d2\u4ef6\u4e8b\u52a1\u5907\u4efd\u5931\u8d25"

    .line 768
    .line 769
    invoke-static {v3, v6, v0}, Lfb/t2;->P(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 770
    .line 771
    .line 772
    move-object v8, v7

    .line 773
    goto :goto_e

    .line 774
    :catchall_2
    move-exception v0

    .line 775
    :try_start_5
    new-instance v8, Lsf/f;

    .line 776
    .line 777
    invoke-direct {v8, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 778
    .line 779
    .line 780
    :goto_e
    invoke-static {v8}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 781
    .line 782
    .line 783
    move-result-object v0

    .line 784
    if-eqz v0, :cond_1f

    .line 785
    .line 786
    invoke-virtual {v3}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 787
    .line 788
    .line 789
    move-result-object v3

    .line 790
    new-instance v9, Ljava/lang/StringBuilder;

    .line 791
    .line 792
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 793
    .line 794
    .line 795
    const-string v10, "[Hchat:ScriptAgent] \u6062\u590d\u63d2\u4ef6\u4e8b\u52a1\u5931\u8d25: "

    .line 796
    .line 797
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 798
    .line 799
    .line 800
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 801
    .line 802
    .line 803
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 804
    .line 805
    .line 806
    move-result-object v3

    .line 807
    invoke-static {v3, v0}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 808
    .line 809
    .line 810
    :cond_1f
    instance-of v0, v8, Lsf/f;

    .line 811
    .line 812
    if-eqz v0, :cond_20

    .line 813
    .line 814
    goto/16 :goto_14

    .line 815
    .line 816
    :cond_20
    new-instance v0, Ljava/util/ArrayList;

    .line 817
    .line 818
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 819
    .line 820
    .line 821
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 822
    .line 823
    .line 824
    move-result-object v3

    .line 825
    :cond_21
    :goto_f
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 826
    .line 827
    .line 828
    move-result v4

    .line 829
    if-eqz v4, :cond_22

    .line 830
    .line 831
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 832
    .line 833
    .line 834
    move-result-object v4

    .line 835
    move-object v8, v4

    .line 836
    check-cast v8, Lsf/j;

    .line 837
    .line 838
    iget-object v8, v8, Lsf/j;->i:Ljava/lang/Object;

    .line 839
    .line 840
    invoke-static {v8, v6}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 841
    .line 842
    .line 843
    move-result v8

    .line 844
    if-nez v8, :cond_21

    .line 845
    .line 846
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 847
    .line 848
    .line 849
    goto :goto_f

    .line 850
    :cond_22
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 851
    .line 852
    .line 853
    move-result-object v3

    .line 854
    :cond_23
    :goto_10
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 855
    .line 856
    .line 857
    move-result v0

    .line 858
    if-eqz v0, :cond_25

    .line 859
    .line 860
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 861
    .line 862
    .line 863
    move-result-object v0

    .line 864
    check-cast v0, Lsf/j;

    .line 865
    .line 866
    iget-object v4, v0, Lsf/j;->h:Ljava/lang/Object;

    .line 867
    .line 868
    check-cast v4, Ljava/lang/String;

    .line 869
    .line 870
    iget-object v0, v0, Lsf/j;->i:Ljava/lang/Object;

    .line 871
    .line 872
    move-object v6, v0

    .line 873
    check-cast v6, Ljava/io/File;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 874
    .line 875
    :try_start_6
    const-string v0, "new"

    .line 876
    .line 877
    invoke-static {v4, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 878
    .line 879
    .line 880
    move-result v0

    .line 881
    if-eqz v0, :cond_24

    .line 882
    .line 883
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 884
    .line 885
    .line 886
    invoke-static {v6}, Lfb/t2;->q(Ljava/io/File;)V

    .line 887
    .line 888
    .line 889
    goto :goto_11

    .line 890
    :catchall_3
    move-exception v0

    .line 891
    goto :goto_12

    .line 892
    :cond_24
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 893
    .line 894
    .line 895
    invoke-static {v6}, Lfb/t2;->o(Ljava/io/File;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 896
    .line 897
    .line 898
    :goto_11
    move-object v4, v7

    .line 899
    goto :goto_13

    .line 900
    :goto_12
    :try_start_7
    new-instance v4, Lsf/f;

    .line 901
    .line 902
    invoke-direct {v4, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 903
    .line 904
    .line 905
    :goto_13
    invoke-static {v4}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 906
    .line 907
    .line 908
    move-result-object v0

    .line 909
    if-eqz v0, :cond_23

    .line 910
    .line 911
    invoke-virtual {v6}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 912
    .line 913
    .line 914
    move-result-object v4

    .line 915
    new-instance v6, Ljava/lang/StringBuilder;

    .line 916
    .line 917
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 918
    .line 919
    .line 920
    const-string v8, "[Hchat:ScriptAgent] \u6e05\u7406\u63d2\u4ef6\u4e8b\u52a1\u6b8b\u7559\u5931\u8d25: "

    .line 921
    .line 922
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 923
    .line 924
    .line 925
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 926
    .line 927
    .line 928
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 929
    .line 930
    .line 931
    move-result-object v4

    .line 932
    invoke-static {v4, v0}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 933
    .line 934
    .line 935
    goto :goto_10

    .line 936
    :cond_25
    :goto_14
    invoke-interface {v5}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 937
    .line 938
    .line 939
    goto/16 :goto_4

    .line 940
    .line 941
    :goto_15
    invoke-interface {v5}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 942
    .line 943
    .line 944
    throw p0

    .line 945
    :cond_26
    return-void
.end method

.method public static N(Ljava/io/File;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    const/4 v0, 0x1

    .line 9
    :try_start_0
    invoke-virtual {p0, v0, v0}, Ljava/io/File;->setReadable(ZZ)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    :catchall_0
    :try_start_1
    invoke-virtual {p0, v0, v0}, Ljava/io/File;->setWritable(ZZ)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 13
    .line 14
    .line 15
    :catchall_1
    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    :try_start_2
    invoke-virtual {p0, v0, v0}, Ljava/io/File;->setExecutable(ZZ)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 22
    .line 23
    .line 24
    :catchall_2
    :cond_1
    :try_start_3
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {v0}, Landroid/system/Os;->stat(Ljava/lang/String;)Landroid/system/StructStat;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    const/16 v1, 0x1c0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    const/16 v1, 0x180

    .line 42
    .line 43
    :goto_0
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    iget v0, v0, Landroid/system/StructStat;->st_mode:I

    .line 48
    .line 49
    and-int/lit16 v0, v0, 0xfff

    .line 50
    .line 51
    or-int/2addr v0, v1

    .line 52
    invoke-static {p0, v0}, Landroid/system/Os;->chmod(Ljava/lang/String;I)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 53
    .line 54
    .line 55
    :catchall_3
    :goto_1
    return-void
.end method

.method public static O(Ljava/io/File;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p0}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    invoke-static {p0}, Lfb/t2;->N(Ljava/io/File;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    if-eqz p0, :cond_1

    .line 36
    .line 37
    array-length v0, p0

    .line 38
    const/4 v1, 0x0

    .line 39
    :goto_0
    if-ge v1, v0, :cond_1

    .line 40
    .line 41
    aget-object v2, p0, v1

    .line 42
    .line 43
    invoke-static {v2}, Lfb/t2;->O(Ljava/io/File;)V

    .line 44
    .line 45
    .line 46
    add-int/lit8 v1, v1, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    :goto_1
    return-void
.end method

.method public static P(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)V
    .locals 4

    .line 1
    const-string v0, "\uff1a\u76ee\u6807\u4e0d\u662f\u76ee\u5f55"

    .line 2
    .line 3
    const-string v1, "\uff1a\u521b\u5efa\u76ee\u6807\u76ee\u5f55\u5931\u8d25"

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-eqz v2, :cond_7

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    :try_start_0
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-static {v2, v3}, Landroid/system/Os;->rename(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    sget-object v2, Lsf/n;->a:Lsf/n;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception v2

    .line 32
    new-instance v3, Lsf/f;

    .line 33
    .line 34
    invoke-direct {v3, v2}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    move-object v2, v3

    .line 38
    :goto_0
    instance-of v2, v2, Lsf/f;

    .line 39
    .line 40
    if-nez v2, :cond_0

    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_0
    invoke-static {p0}, Lfb/t2;->S(Ljava/io/File;)Ljava/util/Map;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-static {v2}, Lfb/t2;->a0(Ljava/util/Map;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    :try_start_1
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-nez v3, :cond_2

    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/io/File;->mkdirs()Z

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    if-eqz v3, :cond_1

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_1
    invoke-virtual {p2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 69
    .line 70
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    throw p1

    .line 78
    :catchall_1
    move-exception p0

    .line 79
    goto :goto_3

    .line 80
    :cond_2
    :goto_1
    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-eqz v1, :cond_5

    .line 85
    .line 86
    invoke-static {p0, p1}, Lfb/t2;->U(Ljava/io/File;Ljava/io/File;)V

    .line 87
    .line 88
    .line 89
    invoke-static {p0}, Lfb/t2;->S(Ljava/io/File;)Ljava/util/Map;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    invoke-static {p0}, Lfb/t2;->a0(Ljava/util/Map;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    invoke-virtual {p0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result p0

    .line 101
    if-eqz p0, :cond_4

    .line 102
    .line 103
    invoke-static {p1}, Lfb/t2;->S(Ljava/io/File;)Ljava/util/Map;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    invoke-static {p0}, Lfb/t2;->a0(Ljava/util/Map;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    invoke-virtual {p0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result p0

    .line 115
    if-eqz p0, :cond_3

    .line 116
    .line 117
    :goto_2
    return-void

    .line 118
    :cond_3
    const-string p0, "\u76ee\u6807\u76ee\u5f55\u5185\u5bb9\u4e0d\u5b8c\u6574"

    .line 119
    .line 120
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 121
    .line 122
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    throw p1

    .line 126
    :cond_4
    const-string p0, "\u6e90\u76ee\u5f55\u5728\u590d\u5236\u65f6\u53d1\u751f\u53d8\u5316"

    .line 127
    .line 128
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 129
    .line 130
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    throw p1

    .line 134
    :cond_5
    invoke-virtual {p2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 139
    .line 140
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 148
    :goto_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 149
    .line 150
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    if-eqz v0, :cond_6

    .line 155
    .line 156
    goto :goto_4

    .line 157
    :cond_6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    :goto_4
    const-string v1, "\uff1a"

    .line 166
    .line 167
    invoke-static {p2, v1, v0}, Lwb/en;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object p2

    .line 171
    invoke-direct {p1, p2, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 172
    .line 173
    .line 174
    throw p1

    .line 175
    :cond_7
    const-string p0, "\uff1a\u6e90\u76ee\u5f55\u4e0d\u5b58\u5728"

    .line 176
    .line 177
    invoke-virtual {p2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object p0

    .line 181
    invoke-static {p0}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    return-void
.end method

.method public static final Q(Landroid/content/Context;Lfb/j2;)Lfb/s2;
    .locals 13

    .line 1
    iget-object v6, p1, Lfb/j2;->d:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v7, p1, Lfb/j2;->f:Ljava/util/LinkedHashMap;

    .line 4
    .line 5
    iget-object v0, p1, Lfb/j2;->e:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {p0}, Lfb/t2;->j(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    iget-wide v1, p1, Lfb/j2;->l:J

    .line 11
    .line 12
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 13
    .line 14
    .line 15
    move-result-wide v3

    .line 16
    const-wide/32 v8, 0x5265c00

    .line 17
    .line 18
    .line 19
    sub-long/2addr v3, v8

    .line 20
    cmp-long v1, v1, v3

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    if-ltz v1, :cond_e

    .line 24
    .line 25
    sget-object v1, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 26
    .line 27
    invoke-virtual {v1, p0}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->ensureDirs(Landroid/content/Context;)Ljava/io/File;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v1}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-static {v1}, Lfb/t2;->N(Ljava/io/File;)V

    .line 39
    .line 40
    .line 41
    invoke-static {v1}, Lfb/t2;->M(Ljava/io/File;)V

    .line 42
    .line 43
    .line 44
    iget-object v3, p1, Lfb/j2;->b:Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {v3}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-static {v3}, Lfb/a2;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    if-eqz v4, :cond_d

    .line 63
    .line 64
    const-string v4, ".."

    .line 65
    .line 66
    const/4 v5, 0x0

    .line 67
    invoke-static {v3, v4, v5}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 68
    .line 69
    .line 70
    move-result v8

    .line 71
    if-nez v8, :cond_d

    .line 72
    .line 73
    new-instance v8, Ljava/io/File;

    .line 74
    .line 75
    invoke-direct {v8, v1, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v8}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;

    .line 79
    .line 80
    .line 81
    move-result-object v8

    .line 82
    move-object v9, v2

    .line 83
    move-object v2, v3

    .line 84
    invoke-virtual {v8}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    invoke-virtual {v3}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 89
    .line 90
    .line 91
    move-result-object v10

    .line 92
    invoke-static {v10, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    if-eqz v1, :cond_c

    .line 97
    .line 98
    invoke-virtual {v8, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    if-eqz v1, :cond_c

    .line 103
    .line 104
    const-string v1, "[0-9a-f]{64}"

    .line 105
    .line 106
    invoke-static {v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 107
    .line 108
    .line 109
    move-result-object v8

    .line 110
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v8, v6}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 114
    .line 115
    .line 116
    move-result-object v8

    .line 117
    invoke-virtual {v8}, Ljava/util/regex/Matcher;->matches()Z

    .line 118
    .line 119
    .line 120
    move-result v8

    .line 121
    if-eqz v8, :cond_b

    .line 122
    .line 123
    invoke-static {v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v1, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    if-eqz v1, :cond_a

    .line 139
    .line 140
    invoke-interface {v7}, Ljava/util/Map;->size()I

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    const/16 v8, 0x1000

    .line 145
    .line 146
    if-gt v1, v8, :cond_9

    .line 147
    .line 148
    invoke-interface {v7}, Ljava/util/Map;->isEmpty()Z

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    if-eqz v1, :cond_0

    .line 153
    .line 154
    goto/16 :goto_3

    .line 155
    .line 156
    :cond_0
    invoke-virtual {v7}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 165
    .line 166
    .line 167
    move-result v8

    .line 168
    if-eqz v8, :cond_4

    .line 169
    .line 170
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v8

    .line 174
    check-cast v8, Ljava/util/Map$Entry;

    .line 175
    .line 176
    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v10

    .line 180
    check-cast v10, Ljava/lang/String;

    .line 181
    .line 182
    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v8

    .line 186
    check-cast v8, Ljava/lang/String;

    .line 187
    .line 188
    invoke-static {v10}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 189
    .line 190
    .line 191
    move-result v11

    .line 192
    if-nez v11, :cond_3

    .line 193
    .line 194
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 195
    .line 196
    .line 197
    move-result v11

    .line 198
    const/16 v12, 0xf0

    .line 199
    .line 200
    if-gt v11, v12, :cond_3

    .line 201
    .line 202
    invoke-static {v10, v5}, Log/m;->i0(Ljava/lang/CharSequence;C)Z

    .line 203
    .line 204
    .line 205
    move-result v11

    .line 206
    if-nez v11, :cond_3

    .line 207
    .line 208
    const/16 v11, 0x5c

    .line 209
    .line 210
    invoke-static {v10, v11}, Log/m;->i0(Ljava/lang/CharSequence;C)Z

    .line 211
    .line 212
    .line 213
    move-result v11

    .line 214
    if-nez v11, :cond_3

    .line 215
    .line 216
    const/16 v11, 0x2f

    .line 217
    .line 218
    invoke-static {v10, v11}, Log/m;->I0(Ljava/lang/String;C)Z

    .line 219
    .line 220
    .line 221
    move-result v12

    .line 222
    if-nez v12, :cond_3

    .line 223
    .line 224
    invoke-static {v10, v11}, Log/m;->l0(Ljava/lang/CharSequence;C)Z

    .line 225
    .line 226
    .line 227
    move-result v12

    .line 228
    if-nez v12, :cond_3

    .line 229
    .line 230
    const/4 v12, 0x1

    .line 231
    new-array v12, v12, [C

    .line 232
    .line 233
    aput-char v11, v12, v5

    .line 234
    .line 235
    const/4 v11, 0x6

    .line 236
    invoke-static {v10, v12, v11}, Log/m;->F0(Ljava/lang/CharSequence;[CI)Ljava/util/List;

    .line 237
    .line 238
    .line 239
    move-result-object v10

    .line 240
    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    .line 241
    .line 242
    .line 243
    move-result v11

    .line 244
    if-eqz v11, :cond_1

    .line 245
    .line 246
    goto :goto_2

    .line 247
    :cond_1
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 248
    .line 249
    .line 250
    move-result-object v10

    .line 251
    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 252
    .line 253
    .line 254
    move-result v11

    .line 255
    if-eqz v11, :cond_2

    .line 256
    .line 257
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v11

    .line 261
    check-cast v11, Ljava/lang/String;

    .line 262
    .line 263
    invoke-static {v11}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 264
    .line 265
    .line 266
    move-result v12

    .line 267
    if-nez v12, :cond_3

    .line 268
    .line 269
    const-string v12, "."

    .line 270
    .line 271
    invoke-virtual {v11, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 272
    .line 273
    .line 274
    move-result v12

    .line 275
    if-nez v12, :cond_3

    .line 276
    .line 277
    invoke-virtual {v11, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 278
    .line 279
    .line 280
    move-result v11

    .line 281
    if-nez v11, :cond_3

    .line 282
    .line 283
    goto :goto_1

    .line 284
    :cond_2
    :goto_2
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 285
    .line 286
    .line 287
    move-result v8

    .line 288
    const/16 v10, 0x100

    .line 289
    .line 290
    if-gt v8, v10, :cond_3

    .line 291
    .line 292
    goto/16 :goto_0

    .line 293
    .line 294
    :cond_3
    const-string p0, "\u63d2\u4ef6\u5de5\u4f5c\u533a\u6062\u590d\u70b9\u5305\u542b\u65e0\u6548\u8def\u5f84"

    .line 295
    .line 296
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    return-object v9

    .line 300
    :cond_4
    :goto_3
    iget v1, p1, Lfb/j2;->h:I

    .line 301
    .line 302
    if-ltz v1, :cond_8

    .line 303
    .line 304
    iget v4, p1, Lfb/j2;->i:I

    .line 305
    .line 306
    const/4 v5, -0x1

    .line 307
    if-gt v5, v4, :cond_8

    .line 308
    .line 309
    if-gt v4, v1, :cond_8

    .line 310
    .line 311
    iget v4, p1, Lfb/j2;->j:I

    .line 312
    .line 313
    if-gt v5, v4, :cond_8

    .line 314
    .line 315
    if-gt v4, v1, :cond_8

    .line 316
    .line 317
    iget-object v1, p1, Lfb/j2;->a:Ljava/lang/String;

    .line 318
    .line 319
    invoke-static {p0, v1}, Lfb/t2;->i(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    .line 320
    .line 321
    .line 322
    move-result-object v4

    .line 323
    invoke-static {v4}, Lfb/t2;->u(Ljava/io/File;)V

    .line 324
    .line 325
    .line 326
    invoke-static {v4}, Lfb/t2;->s(Ljava/io/File;)V

    .line 327
    .line 328
    .line 329
    invoke-static {v4}, Lfb/t2;->S(Ljava/io/File;)Ljava/util/Map;

    .line 330
    .line 331
    .line 332
    move-result-object v1

    .line 333
    invoke-static {v1}, Lfb/t2;->a0(Ljava/util/Map;)Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object v1

    .line 337
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 338
    .line 339
    .line 340
    move-result v0

    .line 341
    if-eqz v0, :cond_7

    .line 342
    .line 343
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 344
    .line 345
    .line 346
    move-result-wide v0

    .line 347
    invoke-virtual {v4, v0, v1}, Ljava/io/File;->setLastModified(J)Z

    .line 348
    .line 349
    .line 350
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    if-eqz v0, :cond_5

    .line 355
    .line 356
    move-object v1, v0

    .line 357
    goto :goto_4

    .line 358
    :cond_5
    move-object v1, p0

    .line 359
    :goto_4
    iget-boolean v5, p1, Lfb/j2;->c:Z

    .line 360
    .line 361
    iget-object p0, p1, Lfb/j2;->g:Ljava/lang/String;

    .line 362
    .line 363
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 364
    .line 365
    .line 366
    move-result v0

    .line 367
    if-eqz v0, :cond_6

    .line 368
    .line 369
    move-object v8, v2

    .line 370
    goto :goto_5

    .line 371
    :cond_6
    move-object v8, p0

    .line 372
    :goto_5
    iget v9, p1, Lfb/j2;->h:I

    .line 373
    .line 374
    iget v10, p1, Lfb/j2;->i:I

    .line 375
    .line 376
    iget v11, p1, Lfb/j2;->j:I

    .line 377
    .line 378
    iget-boolean v12, p1, Lfb/j2;->k:Z

    .line 379
    .line 380
    new-instance v0, Lfb/s2;

    .line 381
    .line 382
    invoke-direct/range {v0 .. v12}, Lfb/s2;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;Ljava/io/File;ZLjava/lang/String;Ljava/util/LinkedHashMap;Ljava/lang/String;IIIZ)V

    .line 383
    .line 384
    .line 385
    return-object v0

    .line 386
    :cond_7
    const-string p0, "\u63d2\u4ef6\u5de5\u4f5c\u533a\u5185\u5bb9\u4e0e\u6062\u590d\u70b9\u4e0d\u4e00\u81f4"

    .line 387
    .line 388
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 389
    .line 390
    .line 391
    return-object v9

    .line 392
    :cond_8
    const-string p0, "\u63d2\u4ef6\u5de5\u4f5c\u533a\u6062\u590d\u70b9\u7684 revision \u65e0\u6548"

    .line 393
    .line 394
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 395
    .line 396
    .line 397
    return-object v9

    .line 398
    :cond_9
    const-string p0, "\u63d2\u4ef6\u5de5\u4f5c\u533a\u6062\u590d\u70b9\u5305\u542b\u8fc7\u591a\u8def\u5f84"

    .line 399
    .line 400
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 401
    .line 402
    .line 403
    return-object v9

    .line 404
    :cond_a
    const-string p0, "\u63d2\u4ef6\u5de5\u4f5c\u533a\u6062\u590d\u70b9\u7f3a\u5c11\u6709\u6548\u5185\u5bb9\u6307\u7eb9"

    .line 405
    .line 406
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 407
    .line 408
    .line 409
    return-object v9

    .line 410
    :cond_b
    const-string p0, "\u63d2\u4ef6\u5de5\u4f5c\u533a\u6062\u590d\u70b9\u7f3a\u5c11\u6709\u6548\u57fa\u7ebf"

    .line 411
    .line 412
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 413
    .line 414
    .line 415
    return-object v9

    .line 416
    :cond_c
    const-string p0, "\u63d2\u4ef6\u5de5\u4f5c\u533a\u6062\u590d\u70b9\u4e0d\u5728\u811a\u672c\u6839\u76ee\u5f55\u5185"

    .line 417
    .line 418
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 419
    .line 420
    .line 421
    return-object v9

    .line 422
    :cond_d
    move-object v9, v2

    .line 423
    const-string p0, "\u63d2\u4ef6\u5de5\u4f5c\u533a\u6062\u590d\u70b9\u7684 plugin_id \u65e0\u6548"

    .line 424
    .line 425
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 426
    .line 427
    .line 428
    return-object v9

    .line 429
    :cond_e
    move-object v9, v2

    .line 430
    const-string p0, "\u63d2\u4ef6\u5de5\u4f5c\u533a\u6062\u590d\u70b9\u5df2\u8fc7\u671f"

    .line 431
    .line 432
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 433
    .line 434
    .line 435
    return-object v9
.end method

.method public static R(Lfb/q2;)Ljava/lang/String;
    .locals 4

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, "missing"

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    iget-boolean v0, p0, Lfb/q2;->a:Z

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    const-string v0, "directory"

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_1
    const-string v0, "file"

    .line 14
    .line 15
    :goto_0
    iget-wide v1, p0, Lfb/q2;->b:J

    .line 16
    .line 17
    iget-object p0, p0, Lfb/q2;->c:Ljava/lang/String;

    .line 18
    .line 19
    new-instance v3, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v0, ":"

    .line 28
    .line 29
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0
.end method

.method public static S(Ljava/io/File;)Ljava/util/Map;
    .locals 9

    .line 1
    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    sget-object p0, Ltf/u;->g:Ltf/u;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 13
    .line 14
    .line 15
    new-instance v1, Ldg/j;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    sget-object v3, Ldg/k;->g:Ldg/k;

    .line 19
    .line 20
    invoke-direct {v1, p0, v3, v2}, Ldg/j;-><init>(Ljava/io/File;Ldg/k;Lc9/x;)V

    .line 21
    .line 22
    .line 23
    new-instance v2, Lfb/l2;

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    invoke-direct {v2, p0, v3}, Lfb/l2;-><init>(Ljava/io/File;I)V

    .line 27
    .line 28
    .line 29
    new-instance v3, Lng/i;

    .line 30
    .line 31
    const/4 v4, 0x1

    .line 32
    invoke-direct {v3, v1, v4, v2}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 33
    .line 34
    .line 35
    new-instance v1, Lng/h;

    .line 36
    .line 37
    invoke-direct {v1, v3}, Lng/h;-><init>(Lng/i;)V

    .line 38
    .line 39
    .line 40
    :goto_0
    invoke-virtual {v1}, Lng/h;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-eqz v2, :cond_2

    .line 45
    .line 46
    invoke-virtual {v1}, Lng/h;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    check-cast v2, Ljava/io/File;

    .line 51
    .line 52
    invoke-static {v2, p0}, Ldg/l;->i0(Ljava/io/File;Ljava/io/File;)Ljava/io/File;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    invoke-static {v3}, Ldg/l;->d0(Ljava/io/File;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    if-eqz v5, :cond_1

    .line 65
    .line 66
    new-instance v2, Lfb/q2;

    .line 67
    .line 68
    const-wide/16 v5, 0x0

    .line 69
    .line 70
    const-string v7, ""

    .line 71
    .line 72
    invoke-direct {v2, v4, v5, v6, v7}, Lfb/q2;-><init>(ZJLjava/lang/String;)V

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_1
    new-instance v5, Lfb/q2;

    .line 77
    .line 78
    invoke-virtual {v2}, Ljava/io/File;->length()J

    .line 79
    .line 80
    .line 81
    move-result-wide v6

    .line 82
    invoke-static {v2}, Lfb/t2;->y(Ljava/io/File;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    const/4 v8, 0x0

    .line 87
    invoke-direct {v5, v8, v6, v7, v2}, Lfb/q2;-><init>(ZJLjava/lang/String;)V

    .line 88
    .line 89
    .line 90
    move-object v2, v5

    .line 91
    :goto_1
    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_2
    return-object v0
.end method

.method public static T(ILjava/lang/String;)Lorg/json/JSONObject;
    .locals 3

    .line 1
    const-string v0, "string"

    .line 2
    .line 3
    const-string v1, "description"

    .line 4
    .line 5
    const-string v2, "type"

    .line 6
    .line 7
    invoke-static {v2, v0, v1, p1}, Lwb/en;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const-string v0, "minLength"

    .line 12
    .line 13
    invoke-virtual {p1, v0, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 14
    .line 15
    .line 16
    return-object p1
.end method

.method public static U(Ljava/io/File;Ljava/io/File;)V
    .locals 7

    .line 1
    invoke-static {p0}, Lfb/t2;->S(Ljava/io/File;)Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p1}, Lfb/t2;->S(Ljava/io/File;)Ljava/util/Map;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    check-cast v2, Ljava/lang/Iterable;

    .line 14
    .line 15
    new-instance v3, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    if-eqz v4, :cond_3

    .line 29
    .line 30
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    move-object v5, v4

    .line 35
    check-cast v5, Ljava/lang/String;

    .line 36
    .line 37
    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v6

    .line 41
    check-cast v6, Lfb/q2;

    .line 42
    .line 43
    if-eqz v6, :cond_2

    .line 44
    .line 45
    iget-boolean v6, v6, Lfb/q2;->a:Z

    .line 46
    .line 47
    invoke-static {v5, v1}, Ltf/y;->Y(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    check-cast v5, Lfb/q2;

    .line 52
    .line 53
    iget-boolean v5, v5, Lfb/q2;->a:Z

    .line 54
    .line 55
    if-eq v6, v5, :cond_1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    const/4 v5, 0x0

    .line 59
    goto :goto_2

    .line 60
    :cond_2
    :goto_1
    const/4 v5, 0x1

    .line 61
    :goto_2
    if-eqz v5, :cond_0

    .line 62
    .line 63
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_3
    new-instance v2, Lfb/r;

    .line 68
    .line 69
    const/16 v4, 0xf

    .line 70
    .line 71
    invoke-direct {v2, v4}, Lfb/r;-><init>(I)V

    .line 72
    .line 73
    .line 74
    invoke-static {v3, v2}, Ltf/m;->K1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    if-eqz v3, :cond_4

    .line 87
    .line 88
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    check-cast v3, Ljava/lang/String;

    .line 93
    .line 94
    new-instance v4, Ljava/io/File;

    .line 95
    .line 96
    invoke-direct {v4, p1, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    invoke-static {v4}, Lfb/t2;->q(Ljava/io/File;)V

    .line 100
    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_4
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    check-cast v2, Ljava/lang/Iterable;

    .line 108
    .line 109
    new-instance v3, Ljava/util/ArrayList;

    .line 110
    .line 111
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 112
    .line 113
    .line 114
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    :cond_5
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 119
    .line 120
    .line 121
    move-result v4

    .line 122
    if-eqz v4, :cond_6

    .line 123
    .line 124
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    move-object v5, v4

    .line 129
    check-cast v5, Ljava/util/Map$Entry;

    .line 130
    .line 131
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v5

    .line 135
    check-cast v5, Lfb/q2;

    .line 136
    .line 137
    iget-boolean v5, v5, Lfb/q2;->a:Z

    .line 138
    .line 139
    if-eqz v5, :cond_5

    .line 140
    .line 141
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    goto :goto_4

    .line 145
    :cond_6
    new-instance v2, Lfb/r;

    .line 146
    .line 147
    const/16 v4, 0xe

    .line 148
    .line 149
    invoke-direct {v2, v4}, Lfb/r;-><init>(I)V

    .line 150
    .line 151
    .line 152
    invoke-static {v3, v2}, Ltf/m;->K1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    :cond_7
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 161
    .line 162
    .line 163
    move-result v3

    .line 164
    if-eqz v3, :cond_9

    .line 165
    .line 166
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v3

    .line 170
    check-cast v3, Ljava/util/Map$Entry;

    .line 171
    .line 172
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v3

    .line 176
    check-cast v3, Ljava/lang/String;

    .line 177
    .line 178
    new-instance v4, Ljava/io/File;

    .line 179
    .line 180
    invoke-direct {v4, p1, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v4}, Ljava/io/File;->isDirectory()Z

    .line 184
    .line 185
    .line 186
    move-result v5

    .line 187
    if-nez v5, :cond_7

    .line 188
    .line 189
    invoke-virtual {v4}, Ljava/io/File;->mkdirs()Z

    .line 190
    .line 191
    .line 192
    move-result v4

    .line 193
    if-eqz v4, :cond_8

    .line 194
    .line 195
    goto :goto_5

    .line 196
    :cond_8
    const-string p0, "\u521b\u5efa\u76ee\u5f55\u5931\u8d25: "

    .line 197
    .line 198
    invoke-static {p0, v3}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    invoke-static {p0}, Lah/a;->h(Ljava/lang/Object;)V

    .line 203
    .line 204
    .line 205
    return-void

    .line 206
    :cond_9
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    check-cast v0, Ljava/lang/Iterable;

    .line 211
    .line 212
    new-instance v2, Ljava/util/ArrayList;

    .line 213
    .line 214
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 215
    .line 216
    .line 217
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    :cond_a
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 222
    .line 223
    .line 224
    move-result v3

    .line 225
    if-eqz v3, :cond_b

    .line 226
    .line 227
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v3

    .line 231
    move-object v4, v3

    .line 232
    check-cast v4, Ljava/util/Map$Entry;

    .line 233
    .line 234
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v4

    .line 238
    check-cast v4, Lfb/q2;

    .line 239
    .line 240
    iget-boolean v4, v4, Lfb/q2;->a:Z

    .line 241
    .line 242
    if-nez v4, :cond_a

    .line 243
    .line 244
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 245
    .line 246
    .line 247
    goto :goto_6

    .line 248
    :cond_b
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 253
    .line 254
    .line 255
    move-result v2

    .line 256
    if-eqz v2, :cond_d

    .line 257
    .line 258
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v2

    .line 262
    check-cast v2, Ljava/util/Map$Entry;

    .line 263
    .line 264
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v3

    .line 268
    check-cast v3, Ljava/lang/String;

    .line 269
    .line 270
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v2

    .line 274
    check-cast v2, Lfb/q2;

    .line 275
    .line 276
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v4

    .line 280
    invoke-static {v4, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    move-result v2

    .line 284
    if-eqz v2, :cond_c

    .line 285
    .line 286
    goto :goto_7

    .line 287
    :cond_c
    new-instance v2, Ljava/io/File;

    .line 288
    .line 289
    invoke-direct {v2, p1, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    invoke-static {v2}, Lfb/t2;->q(Ljava/io/File;)V

    .line 293
    .line 294
    .line 295
    new-instance v4, Ljava/io/File;

    .line 296
    .line 297
    invoke-direct {v4, p0, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    invoke-static {v4, v2}, Lfb/t2;->m(Ljava/io/File;Ljava/io/File;)V

    .line 301
    .line 302
    .line 303
    goto :goto_7

    .line 304
    :cond_d
    invoke-static {p1}, Lfb/t2;->s(Ljava/io/File;)V

    .line 305
    .line 306
    .line 307
    return-void
.end method

.method public static V(Lorg/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/util/LinkedHashMap;Ljava/util/List;)V
    .locals 2

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "hchat.workspace."

    .line 7
    .line 8
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const-string v1, "name"

    .line 13
    .line 14
    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 15
    .line 16
    .line 17
    const-string p1, "description"

    .line 18
    .line 19
    invoke-virtual {v0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 20
    .line 21
    .line 22
    new-instance p1, Lorg/json/JSONObject;

    .line 23
    .line 24
    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    .line 25
    .line 26
    .line 27
    const-string p2, "type"

    .line 28
    .line 29
    const-string v1, "object"

    .line 30
    .line 31
    invoke-virtual {p1, p2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 32
    .line 33
    .line 34
    new-instance p2, Lorg/json/JSONObject;

    .line 35
    .line 36
    invoke-direct {p2, p3}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 37
    .line 38
    .line 39
    const-string p3, "properties"

    .line 40
    .line 41
    invoke-virtual {p1, p3, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 42
    .line 43
    .line 44
    new-instance p2, Lorg/json/JSONArray;

    .line 45
    .line 46
    invoke-direct {p2, p4}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 47
    .line 48
    .line 49
    const-string p3, "required"

    .line 50
    .line 51
    invoke-virtual {p1, p3, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 52
    .line 53
    .line 54
    const-string p2, "additionalProperties"

    .line 55
    .line 56
    const/4 p3, 0x0

    .line 57
    invoke-virtual {p1, p2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 58
    .line 59
    .line 60
    const-string p2, "inputSchema"

    .line 61
    .line 62
    invoke-virtual {v0, p2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method public static final W()Ljava/lang/String;
    .locals 19

    .line 1
    new-instance v0, Lorg/json/JSONArray;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    const-string v2, "\u63d2\u4ef6\u76ee\u5f55\u540d\uff1b\u5fc5\u987b\u4f7f\u7528\u63d2\u4ef6\u5217\u8868\u4e2d\u7684\u51c6\u786e ID"

    .line 8
    .line 9
    invoke-static {v1, v2}, Lfb/t2;->T(ILjava/lang/String;)Lorg/json/JSONObject;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    new-instance v3, Lsf/e;

    .line 14
    .line 15
    const-string v4, "plugin_id"

    .line 16
    .line 17
    invoke-direct {v3, v4, v2}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    const-string v5, "\u76f8\u5bf9\u63d2\u4ef6\u76ee\u5f55\u7684\u8def\u5f84\uff0c\u9ed8\u8ba4 ."

    .line 22
    .line 23
    invoke-static {v2, v5}, Lfb/t2;->T(ILjava/lang/String;)Lorg/json/JSONObject;

    .line 24
    .line 25
    .line 26
    move-result-object v6

    .line 27
    new-instance v7, Lsf/e;

    .line 28
    .line 29
    const-string v8, "path"

    .line 30
    .line 31
    invoke-direct {v7, v8, v6}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    const-string v6, "\u662f\u5426\u9012\u5f52\u68c0\u67e5\u5b50\u6587\u4ef6\u548c\u76ee\u5f55"

    .line 35
    .line 36
    invoke-static {v6, v1}, Lfb/t2;->e(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    new-instance v9, Lsf/e;

    .line 41
    .line 42
    const-string v10, "recursive"

    .line 43
    .line 44
    invoke-direct {v9, v10, v6}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    const-string v6, "\u662f\u5426\u5c1d\u8bd5\u8865\u9f50\u5f53\u524d\u6587\u4ef6\u6240\u6709\u8005\u7684\u8bfb\u5199\u6743\u9650\u548c\u76ee\u5f55\u8fdb\u5165\u6743\u9650"

    .line 48
    .line 49
    invoke-static {v6, v2}, Lfb/t2;->e(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 50
    .line 51
    .line 52
    move-result-object v6

    .line 53
    new-instance v11, Lsf/e;

    .line 54
    .line 55
    const-string v12, "repair"

    .line 56
    .line 57
    invoke-direct {v11, v12, v6}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    filled-new-array {v3, v7, v9, v11}, [Lsf/e;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-static {v3}, Ltf/y;->Z([Lsf/e;)Ljava/util/LinkedHashMap;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-static {v4}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    const-string v7, "check_access"

    .line 73
    .line 74
    const-string v9, "\u68c0\u67e5\u63d2\u4ef6\u6587\u4ef6\u662f\u5426\u53ef\u8bfb\u3001\u53ef\u5199\u6216\u53ef\u66ff\u6362\uff0c\u5e76\u53ef\u5c1d\u8bd5\u4fee\u590d\u5f53\u524d\u5fae\u4fe1\u8fdb\u7a0b\u6709\u6743\u4fee\u6539\u7684\u6587\u4ef6\u6743\u9650"

    .line 75
    .line 76
    invoke-static {v0, v7, v9, v3, v6}, Lfb/t2;->V(Lorg/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/util/LinkedHashMap;Ljava/util/List;)V

    .line 77
    .line 78
    .line 79
    const-string v3, "\u63d2\u4ef6\u76ee\u5f55\u540d\uff1b\u4fee\u6539\u73b0\u6709\u63d2\u4ef6\u65f6\u4f7f\u7528\u63d2\u4ef6\u5217\u8868\u4e2d\u7684\u51c6\u786e ID"

    .line 80
    .line 81
    invoke-static {v1, v3}, Lfb/t2;->T(ILjava/lang/String;)Lorg/json/JSONObject;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    new-instance v6, Lsf/e;

    .line 86
    .line 87
    invoke-direct {v6, v4, v3}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    invoke-static {v2, v5}, Lfb/t2;->T(ILjava/lang/String;)Lorg/json/JSONObject;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    new-instance v5, Lsf/e;

    .line 95
    .line 96
    invoke-direct {v5, v8, v3}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    const-string v3, "\u662f\u5426\u9012\u5f52\u5217\u51fa"

    .line 100
    .line 101
    invoke-static {v3, v2}, Lfb/t2;->e(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    new-instance v7, Lsf/e;

    .line 106
    .line 107
    invoke-direct {v7, v10, v3}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    const/16 v3, 0x8

    .line 111
    .line 112
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    const-string v9, "\u9012\u5f52\u6700\u5927\u6df1\u5ea6"

    .line 117
    .line 118
    const/4 v10, 0x3

    .line 119
    invoke-static {v9, v10, v1, v3}, Lfb/t2;->A(Ljava/lang/String;IILjava/lang/Integer;)Lorg/json/JSONObject;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    new-instance v9, Lsf/e;

    .line 124
    .line 125
    const-string v10, "max_depth"

    .line 126
    .line 127
    invoke-direct {v9, v10, v3}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    filled-new-array {v6, v5, v7, v9}, [Lsf/e;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    invoke-static {v3}, Ltf/y;->Z([Lsf/e;)Ljava/util/LinkedHashMap;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    invoke-static {v4}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 139
    .line 140
    .line 141
    move-result-object v5

    .line 142
    const-string v6, "list_files"

    .line 143
    .line 144
    const-string v7, "\u5217\u51fa\u63d2\u4ef6\u5de5\u4f5c\u533a\u5185\u7684\u6587\u4ef6\u548c\u76ee\u5f55"

    .line 145
    .line 146
    invoke-static {v0, v6, v7, v3, v5}, Lfb/t2;->V(Lorg/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/util/LinkedHashMap;Ljava/util/List;)V

    .line 147
    .line 148
    .line 149
    const-string v3, "\u63d2\u4ef6\u76ee\u5f55\u540d"

    .line 150
    .line 151
    invoke-static {v1, v3}, Lfb/t2;->T(ILjava/lang/String;)Lorg/json/JSONObject;

    .line 152
    .line 153
    .line 154
    move-result-object v5

    .line 155
    new-instance v9, Lsf/e;

    .line 156
    .line 157
    invoke-direct {v9, v4, v5}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    const-string v5, "\u76f8\u5bf9\u63d2\u4ef6\u76ee\u5f55\u7684\u6587\u4ef6\u8def\u5f84"

    .line 161
    .line 162
    invoke-static {v1, v5}, Lfb/t2;->T(ILjava/lang/String;)Lorg/json/JSONObject;

    .line 163
    .line 164
    .line 165
    move-result-object v6

    .line 166
    new-instance v10, Lsf/e;

    .line 167
    .line 168
    invoke-direct {v10, v8, v6}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    const-string v6, "\u8d77\u59cb\u884c\uff0c\u4ece 1 \u5f00\u59cb"

    .line 172
    .line 173
    const/4 v7, 0x0

    .line 174
    invoke-static {v6, v1, v1, v7}, Lfb/t2;->A(Ljava/lang/String;IILjava/lang/Integer;)Lorg/json/JSONObject;

    .line 175
    .line 176
    .line 177
    move-result-object v6

    .line 178
    new-instance v11, Lsf/e;

    .line 179
    .line 180
    const-string v12, "start_line"

    .line 181
    .line 182
    invoke-direct {v11, v12, v6}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    const-string v6, "\u8d77\u59cb\u884c\u5185\u7684\u5b57\u7b26\u4f4d\u7f6e\uff0c\u4ece 1 \u5f00\u59cb"

    .line 186
    .line 187
    invoke-static {v6, v1, v1, v7}, Lfb/t2;->A(Ljava/lang/String;IILjava/lang/Integer;)Lorg/json/JSONObject;

    .line 188
    .line 189
    .line 190
    move-result-object v6

    .line 191
    new-instance v12, Lsf/e;

    .line 192
    .line 193
    const-string v13, "start_column"

    .line 194
    .line 195
    invoke-direct {v12, v13, v6}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    const-string v6, "\u53ef\u9009\u7ed3\u675f\u884c\uff0c0 \u8868\u793a\u6309 max_lines"

    .line 199
    .line 200
    invoke-static {v6, v2, v2, v7}, Lfb/t2;->A(Ljava/lang/String;IILjava/lang/Integer;)Lorg/json/JSONObject;

    .line 201
    .line 202
    .line 203
    move-result-object v6

    .line 204
    new-instance v13, Lsf/e;

    .line 205
    .line 206
    const-string v7, "end_line"

    .line 207
    .line 208
    invoke-direct {v13, v7, v6}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    const/16 v6, 0x7d0

    .line 212
    .line 213
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 214
    .line 215
    .line 216
    move-result-object v6

    .line 217
    const-string v7, "\u672a\u6307\u5b9a end_line \u65f6\u6700\u591a\u8fd4\u56de\u884c\u6570"

    .line 218
    .line 219
    const/16 v14, 0x190

    .line 220
    .line 221
    invoke-static {v7, v14, v1, v6}, Lfb/t2;->A(Ljava/lang/String;IILjava/lang/Integer;)Lorg/json/JSONObject;

    .line 222
    .line 223
    .line 224
    move-result-object v6

    .line 225
    new-instance v14, Lsf/e;

    .line 226
    .line 227
    const-string v7, "max_lines"

    .line 228
    .line 229
    invoke-direct {v14, v7, v6}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 230
    .line 231
    .line 232
    const-string v6, "\u662f\u5426\u5728\u5185\u5bb9\u524d\u663e\u793a\u884c\u53f7"

    .line 233
    .line 234
    invoke-static {v6, v1}, Lfb/t2;->e(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 235
    .line 236
    .line 237
    move-result-object v6

    .line 238
    new-instance v15, Lsf/e;

    .line 239
    .line 240
    const-string v7, "include_line_numbers"

    .line 241
    .line 242
    invoke-direct {v15, v7, v6}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    filled-new-array/range {v9 .. v15}, [Lsf/e;

    .line 246
    .line 247
    .line 248
    move-result-object v6

    .line 249
    invoke-static {v6}, Ltf/y;->Z([Lsf/e;)Ljava/util/LinkedHashMap;

    .line 250
    .line 251
    .line 252
    move-result-object v6

    .line 253
    filled-new-array {v4, v8}, [Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v7

    .line 257
    invoke-static {v7}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 258
    .line 259
    .line 260
    move-result-object v7

    .line 261
    const-string v9, "read_file"

    .line 262
    .line 263
    const-string v10, "\u6309\u884c\u8bfb\u53d6\u63d2\u4ef6\u5de5\u4f5c\u533a\u5185\u7684\u6587\u672c\u6587\u4ef6\u5e76\u8fd4\u56de\u7a33\u5b9a\u884c\u53f7"

    .line 264
    .line 265
    invoke-static {v0, v9, v10, v6, v7}, Lfb/t2;->V(Lorg/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/util/LinkedHashMap;Ljava/util/List;)V

    .line 266
    .line 267
    .line 268
    invoke-static {v1, v3}, Lfb/t2;->T(ILjava/lang/String;)Lorg/json/JSONObject;

    .line 269
    .line 270
    .line 271
    move-result-object v6

    .line 272
    new-instance v9, Lsf/e;

    .line 273
    .line 274
    invoke-direct {v9, v4, v6}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 275
    .line 276
    .line 277
    const-string v6, "\u641c\u7d22\u6587\u672c\u6216\u6b63\u5219\u8868\u8fbe\u5f0f"

    .line 278
    .line 279
    invoke-static {v1, v6}, Lfb/t2;->T(ILjava/lang/String;)Lorg/json/JSONObject;

    .line 280
    .line 281
    .line 282
    move-result-object v6

    .line 283
    new-instance v10, Lsf/e;

    .line 284
    .line 285
    const-string v7, "query"

    .line 286
    .line 287
    invoke-direct {v10, v7, v6}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 288
    .line 289
    .line 290
    const-string v6, "\u641c\u7d22\u8d77\u59cb\u76ee\u5f55\uff0c\u9ed8\u8ba4 ."

    .line 291
    .line 292
    invoke-static {v2, v6}, Lfb/t2;->T(ILjava/lang/String;)Lorg/json/JSONObject;

    .line 293
    .line 294
    .line 295
    move-result-object v6

    .line 296
    new-instance v11, Lsf/e;

    .line 297
    .line 298
    invoke-direct {v11, v8, v6}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 299
    .line 300
    .line 301
    const-string v6, "\u662f\u5426\u6309\u6b63\u5219\u8868\u8fbe\u5f0f\u641c\u7d22"

    .line 302
    .line 303
    invoke-static {v6, v2}, Lfb/t2;->e(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 304
    .line 305
    .line 306
    move-result-object v6

    .line 307
    new-instance v12, Lsf/e;

    .line 308
    .line 309
    const-string v13, "regex"

    .line 310
    .line 311
    invoke-direct {v12, v13, v6}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 312
    .line 313
    .line 314
    const-string v6, "\u662f\u5426\u533a\u5206\u5927\u5c0f\u5199"

    .line 315
    .line 316
    invoke-static {v6, v2}, Lfb/t2;->e(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 317
    .line 318
    .line 319
    move-result-object v6

    .line 320
    new-instance v13, Lsf/e;

    .line 321
    .line 322
    const-string v14, "case_sensitive"

    .line 323
    .line 324
    invoke-direct {v13, v14, v6}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 325
    .line 326
    .line 327
    const-string v6, "\u53ef\u9009\u8def\u5f84\u901a\u914d\u7b26\uff0c\u4f8b\u5982 **/*.java"

    .line 328
    .line 329
    invoke-static {v2, v6}, Lfb/t2;->T(ILjava/lang/String;)Lorg/json/JSONObject;

    .line 330
    .line 331
    .line 332
    move-result-object v6

    .line 333
    new-instance v14, Lsf/e;

    .line 334
    .line 335
    const-string v15, "file_pattern"

    .line 336
    .line 337
    invoke-direct {v14, v15, v6}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 338
    .line 339
    .line 340
    const-string v6, "\u53ef\u9009\u6392\u9664\u8def\u5f84\u901a\u914d\u7b26"

    .line 341
    .line 342
    invoke-static {v2, v6}, Lfb/t2;->T(ILjava/lang/String;)Lorg/json/JSONObject;

    .line 343
    .line 344
    .line 345
    move-result-object v6

    .line 346
    new-instance v15, Lsf/e;

    .line 347
    .line 348
    const-string v1, "exclude_pattern"

    .line 349
    .line 350
    invoke-direct {v15, v1, v6}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 351
    .line 352
    .line 353
    const/16 v1, 0xa

    .line 354
    .line 355
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 356
    .line 357
    .line 358
    move-result-object v1

    .line 359
    const-string v6, "\u8fd4\u56de\u5339\u914d\u884c\u4e4b\u524d\u7684\u4e0a\u4e0b\u6587\u884c\u6570"

    .line 360
    .line 361
    invoke-static {v6, v2, v2, v1}, Lfb/t2;->A(Ljava/lang/String;IILjava/lang/Integer;)Lorg/json/JSONObject;

    .line 362
    .line 363
    .line 364
    move-result-object v6

    .line 365
    new-instance v2, Lsf/e;

    .line 366
    .line 367
    move-object/from16 v16, v9

    .line 368
    .line 369
    const-string v9, "before_context"

    .line 370
    .line 371
    invoke-direct {v2, v9, v6}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 372
    .line 373
    .line 374
    const-string v6, "\u8fd4\u56de\u5339\u914d\u884c\u4e4b\u540e\u7684\u4e0a\u4e0b\u6587\u884c\u6570"

    .line 375
    .line 376
    const/4 v9, 0x0

    .line 377
    invoke-static {v6, v9, v9, v1}, Lfb/t2;->A(Ljava/lang/String;IILjava/lang/Integer;)Lorg/json/JSONObject;

    .line 378
    .line 379
    .line 380
    move-result-object v1

    .line 381
    new-instance v6, Lsf/e;

    .line 382
    .line 383
    const-string v9, "after_context"

    .line 384
    .line 385
    invoke-direct {v6, v9, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 386
    .line 387
    .line 388
    const/16 v1, 0xc8

    .line 389
    .line 390
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 391
    .line 392
    .line 393
    move-result-object v1

    .line 394
    const-string v9, "\u6700\u591a\u8fd4\u56de\u5339\u914d\u6570\u91cf"

    .line 395
    .line 396
    move-object/from16 v17, v2

    .line 397
    .line 398
    const/16 v2, 0x32

    .line 399
    .line 400
    move-object/from16 v18, v6

    .line 401
    .line 402
    const/4 v6, 0x1

    .line 403
    invoke-static {v9, v2, v6, v1}, Lfb/t2;->A(Ljava/lang/String;IILjava/lang/Integer;)Lorg/json/JSONObject;

    .line 404
    .line 405
    .line 406
    move-result-object v1

    .line 407
    new-instance v2, Lsf/e;

    .line 408
    .line 409
    const-string v9, "limit"

    .line 410
    .line 411
    invoke-direct {v2, v9, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 412
    .line 413
    .line 414
    move-object/from16 v9, v16

    .line 415
    .line 416
    move-object/from16 v16, v17

    .line 417
    .line 418
    move-object/from16 v17, v18

    .line 419
    .line 420
    move-object/from16 v18, v2

    .line 421
    .line 422
    filled-new-array/range {v9 .. v18}, [Lsf/e;

    .line 423
    .line 424
    .line 425
    move-result-object v1

    .line 426
    invoke-static {v1}, Ltf/y;->Z([Lsf/e;)Ljava/util/LinkedHashMap;

    .line 427
    .line 428
    .line 429
    move-result-object v1

    .line 430
    filled-new-array {v4, v7}, [Ljava/lang/String;

    .line 431
    .line 432
    .line 433
    move-result-object v2

    .line 434
    invoke-static {v2}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 435
    .line 436
    .line 437
    move-result-object v2

    .line 438
    const-string v7, "search_files"

    .line 439
    .line 440
    const-string v9, "\u641c\u7d22\u63d2\u4ef6\u5de5\u4f5c\u533a\u5185\u6587\u672c\u6587\u4ef6\u7684\u5185\u5bb9"

    .line 441
    .line 442
    invoke-static {v0, v7, v9, v1, v2}, Lfb/t2;->V(Lorg/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/util/LinkedHashMap;Ljava/util/List;)V

    .line 443
    .line 444
    .line 445
    invoke-static {v6, v3}, Lfb/t2;->T(ILjava/lang/String;)Lorg/json/JSONObject;

    .line 446
    .line 447
    .line 448
    move-result-object v1

    .line 449
    new-instance v2, Lsf/e;

    .line 450
    .line 451
    invoke-direct {v2, v4, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 452
    .line 453
    .line 454
    const-string v1, "\u8981\u521b\u5efa\u7684\u76f8\u5bf9\u76ee\u5f55\u8def\u5f84"

    .line 455
    .line 456
    invoke-static {v6, v1}, Lfb/t2;->T(ILjava/lang/String;)Lorg/json/JSONObject;

    .line 457
    .line 458
    .line 459
    move-result-object v1

    .line 460
    new-instance v7, Lsf/e;

    .line 461
    .line 462
    invoke-direct {v7, v8, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 463
    .line 464
    .line 465
    filled-new-array {v2, v7}, [Lsf/e;

    .line 466
    .line 467
    .line 468
    move-result-object v1

    .line 469
    invoke-static {v1}, Ltf/y;->Z([Lsf/e;)Ljava/util/LinkedHashMap;

    .line 470
    .line 471
    .line 472
    move-result-object v1

    .line 473
    filled-new-array {v4, v8}, [Ljava/lang/String;

    .line 474
    .line 475
    .line 476
    move-result-object v2

    .line 477
    invoke-static {v2}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 478
    .line 479
    .line 480
    move-result-object v2

    .line 481
    const-string v7, "create_directory"

    .line 482
    .line 483
    const-string v9, "\u5728\u63d2\u4ef6\u5de5\u4f5c\u533a\u5185\u521b\u5efa\u76ee\u5f55"

    .line 484
    .line 485
    invoke-static {v0, v7, v9, v1, v2}, Lfb/t2;->V(Lorg/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/util/LinkedHashMap;Ljava/util/List;)V

    .line 486
    .line 487
    .line 488
    invoke-static {v6, v3}, Lfb/t2;->T(ILjava/lang/String;)Lorg/json/JSONObject;

    .line 489
    .line 490
    .line 491
    move-result-object v1

    .line 492
    new-instance v2, Lsf/e;

    .line 493
    .line 494
    invoke-direct {v2, v4, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 495
    .line 496
    .line 497
    invoke-static {v6, v5}, Lfb/t2;->T(ILjava/lang/String;)Lorg/json/JSONObject;

    .line 498
    .line 499
    .line 500
    move-result-object v1

    .line 501
    new-instance v5, Lsf/e;

    .line 502
    .line 503
    invoke-direct {v5, v8, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 504
    .line 505
    .line 506
    const-string v1, "\u5b8c\u6574\u6587\u4ef6\u5185\u5bb9"

    .line 507
    .line 508
    const/4 v9, 0x0

    .line 509
    invoke-static {v9, v1}, Lfb/t2;->T(ILjava/lang/String;)Lorg/json/JSONObject;

    .line 510
    .line 511
    .line 512
    move-result-object v1

    .line 513
    new-instance v6, Lsf/e;

    .line 514
    .line 515
    const-string v7, "content"

    .line 516
    .line 517
    invoke-direct {v6, v7, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 518
    .line 519
    .line 520
    const-string v1, "\u662f\u5426\u5141\u8bb8\u8986\u5199\u73b0\u6709\u6587\u4ef6"

    .line 521
    .line 522
    invoke-static {v1, v9}, Lfb/t2;->e(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 523
    .line 524
    .line 525
    move-result-object v1

    .line 526
    new-instance v9, Lsf/e;

    .line 527
    .line 528
    const-string v10, "overwrite"

    .line 529
    .line 530
    invoke-direct {v9, v10, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 531
    .line 532
    .line 533
    filled-new-array {v2, v5, v6, v9}, [Lsf/e;

    .line 534
    .line 535
    .line 536
    move-result-object v1

    .line 537
    invoke-static {v1}, Ltf/y;->Z([Lsf/e;)Ljava/util/LinkedHashMap;

    .line 538
    .line 539
    .line 540
    move-result-object v1

    .line 541
    filled-new-array {v4, v8, v7}, [Ljava/lang/String;

    .line 542
    .line 543
    .line 544
    move-result-object v2

    .line 545
    invoke-static {v2}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 546
    .line 547
    .line 548
    move-result-object v2

    .line 549
    const-string v5, "write_file"

    .line 550
    .line 551
    const-string v6, "\u65b0\u5efa\u6587\u672c\u6587\u4ef6\uff0c\u6216\u5728 overwrite=true \u65f6\u5b8c\u6574\u8986\u5199\u6587\u4ef6"

    .line 552
    .line 553
    invoke-static {v0, v5, v6, v1, v2}, Lfb/t2;->V(Lorg/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/util/LinkedHashMap;Ljava/util/List;)V

    .line 554
    .line 555
    .line 556
    const/4 v6, 0x1

    .line 557
    invoke-static {v6, v3}, Lfb/t2;->T(ILjava/lang/String;)Lorg/json/JSONObject;

    .line 558
    .line 559
    .line 560
    move-result-object v1

    .line 561
    new-instance v2, Lsf/e;

    .line 562
    .line 563
    invoke-direct {v2, v4, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 564
    .line 565
    .line 566
    const-string v1, "\u4ee5 *** Begin Patch \u5f00\u59cb\u3001*** End Patch \u7ed3\u675f\u7684\u5b8c\u6574\u7edf\u4e00\u8865\u4e01"

    .line 567
    .line 568
    invoke-static {v6, v1}, Lfb/t2;->T(ILjava/lang/String;)Lorg/json/JSONObject;

    .line 569
    .line 570
    .line 571
    move-result-object v1

    .line 572
    new-instance v5, Lsf/e;

    .line 573
    .line 574
    const-string v7, "patch"

    .line 575
    .line 576
    invoke-direct {v5, v7, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 577
    .line 578
    .line 579
    filled-new-array {v2, v5}, [Lsf/e;

    .line 580
    .line 581
    .line 582
    move-result-object v1

    .line 583
    invoke-static {v1}, Ltf/y;->Z([Lsf/e;)Ljava/util/LinkedHashMap;

    .line 584
    .line 585
    .line 586
    move-result-object v1

    .line 587
    filled-new-array {v4, v7}, [Ljava/lang/String;

    .line 588
    .line 589
    .line 590
    move-result-object v2

    .line 591
    invoke-static {v2}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 592
    .line 593
    .line 594
    move-result-object v2

    .line 595
    const-string v5, "apply_patch"

    .line 596
    .line 597
    const-string v7, "\u5e94\u7528 Codex \u98ce\u683c\u7edf\u4e00\u8865\u4e01\uff0c\u53ef\u5728\u4e00\u6b21\u8c03\u7528\u4e2d\u65b0\u589e\u3001\u66f4\u65b0\u3001\u79fb\u52a8\u6216\u5220\u9664\u591a\u4e2a\u6587\u4ef6"

    .line 598
    .line 599
    invoke-static {v0, v5, v7, v1, v2}, Lfb/t2;->V(Lorg/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/util/LinkedHashMap;Ljava/util/List;)V

    .line 600
    .line 601
    .line 602
    invoke-static {v6, v3}, Lfb/t2;->T(ILjava/lang/String;)Lorg/json/JSONObject;

    .line 603
    .line 604
    .line 605
    move-result-object v1

    .line 606
    new-instance v2, Lsf/e;

    .line 607
    .line 608
    invoke-direct {v2, v4, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 609
    .line 610
    .line 611
    const-string v1, "\u6e90\u76f8\u5bf9\u8def\u5f84"

    .line 612
    .line 613
    invoke-static {v6, v1}, Lfb/t2;->T(ILjava/lang/String;)Lorg/json/JSONObject;

    .line 614
    .line 615
    .line 616
    move-result-object v1

    .line 617
    new-instance v5, Lsf/e;

    .line 618
    .line 619
    const-string v7, "source"

    .line 620
    .line 621
    invoke-direct {v5, v7, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 622
    .line 623
    .line 624
    const-string v1, "\u76ee\u6807\u76f8\u5bf9\u8def\u5f84"

    .line 625
    .line 626
    invoke-static {v6, v1}, Lfb/t2;->T(ILjava/lang/String;)Lorg/json/JSONObject;

    .line 627
    .line 628
    .line 629
    move-result-object v1

    .line 630
    new-instance v6, Lsf/e;

    .line 631
    .line 632
    const-string v9, "destination"

    .line 633
    .line 634
    invoke-direct {v6, v9, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 635
    .line 636
    .line 637
    const-string v1, "\u662f\u5426\u8986\u76d6\u76ee\u6807"

    .line 638
    .line 639
    const/4 v11, 0x0

    .line 640
    invoke-static {v1, v11}, Lfb/t2;->e(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 641
    .line 642
    .line 643
    move-result-object v1

    .line 644
    new-instance v11, Lsf/e;

    .line 645
    .line 646
    invoke-direct {v11, v10, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 647
    .line 648
    .line 649
    filled-new-array {v2, v5, v6, v11}, [Lsf/e;

    .line 650
    .line 651
    .line 652
    move-result-object v1

    .line 653
    invoke-static {v1}, Ltf/y;->Z([Lsf/e;)Ljava/util/LinkedHashMap;

    .line 654
    .line 655
    .line 656
    move-result-object v1

    .line 657
    filled-new-array {v4, v7, v9}, [Ljava/lang/String;

    .line 658
    .line 659
    .line 660
    move-result-object v2

    .line 661
    invoke-static {v2}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 662
    .line 663
    .line 664
    move-result-object v2

    .line 665
    const-string v5, "move_path"

    .line 666
    .line 667
    const-string v6, "\u79fb\u52a8\u6216\u91cd\u547d\u540d\u63d2\u4ef6\u5de5\u4f5c\u533a\u5185\u7684\u6587\u4ef6\u6216\u76ee\u5f55"

    .line 668
    .line 669
    invoke-static {v0, v5, v6, v1, v2}, Lfb/t2;->V(Lorg/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/util/LinkedHashMap;Ljava/util/List;)V

    .line 670
    .line 671
    .line 672
    const/4 v6, 0x1

    .line 673
    invoke-static {v6, v3}, Lfb/t2;->T(ILjava/lang/String;)Lorg/json/JSONObject;

    .line 674
    .line 675
    .line 676
    move-result-object v1

    .line 677
    new-instance v2, Lsf/e;

    .line 678
    .line 679
    invoke-direct {v2, v4, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 680
    .line 681
    .line 682
    const-string v1, "\u8981\u5220\u9664\u7684\u76f8\u5bf9\u8def\u5f84"

    .line 683
    .line 684
    invoke-static {v6, v1}, Lfb/t2;->T(ILjava/lang/String;)Lorg/json/JSONObject;

    .line 685
    .line 686
    .line 687
    move-result-object v1

    .line 688
    new-instance v5, Lsf/e;

    .line 689
    .line 690
    invoke-direct {v5, v8, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 691
    .line 692
    .line 693
    filled-new-array {v2, v5}, [Lsf/e;

    .line 694
    .line 695
    .line 696
    move-result-object v1

    .line 697
    invoke-static {v1}, Ltf/y;->Z([Lsf/e;)Ljava/util/LinkedHashMap;

    .line 698
    .line 699
    .line 700
    move-result-object v1

    .line 701
    filled-new-array {v4, v8}, [Ljava/lang/String;

    .line 702
    .line 703
    .line 704
    move-result-object v2

    .line 705
    invoke-static {v2}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 706
    .line 707
    .line 708
    move-result-object v2

    .line 709
    const-string v5, "delete_path"

    .line 710
    .line 711
    const-string v9, "\u5220\u9664\u63d2\u4ef6\u5de5\u4f5c\u533a\u5185\u7684\u6587\u4ef6\u6216\u5b50\u76ee\u5f55\uff1b\u4e0d\u80fd\u5220\u9664\u63d2\u4ef6\u6839\u76ee\u5f55"

    .line 712
    .line 713
    invoke-static {v0, v5, v9, v1, v2}, Lfb/t2;->V(Lorg/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/util/LinkedHashMap;Ljava/util/List;)V

    .line 714
    .line 715
    .line 716
    invoke-static {v6, v3}, Lfb/t2;->T(ILjava/lang/String;)Lorg/json/JSONObject;

    .line 717
    .line 718
    .line 719
    move-result-object v1

    .line 720
    new-instance v2, Lsf/e;

    .line 721
    .line 722
    invoke-direct {v2, v4, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 723
    .line 724
    .line 725
    const-string v1, "\u8981\u6062\u590d\u7684\u76f8\u5bf9\u8def\u5f84"

    .line 726
    .line 727
    invoke-static {v6, v1}, Lfb/t2;->T(ILjava/lang/String;)Lorg/json/JSONObject;

    .line 728
    .line 729
    .line 730
    move-result-object v1

    .line 731
    new-instance v5, Lsf/e;

    .line 732
    .line 733
    invoke-direct {v5, v8, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 734
    .line 735
    .line 736
    filled-new-array {v2, v5}, [Lsf/e;

    .line 737
    .line 738
    .line 739
    move-result-object v1

    .line 740
    invoke-static {v1}, Ltf/y;->Z([Lsf/e;)Ljava/util/LinkedHashMap;

    .line 741
    .line 742
    .line 743
    move-result-object v1

    .line 744
    filled-new-array {v4, v8}, [Ljava/lang/String;

    .line 745
    .line 746
    .line 747
    move-result-object v2

    .line 748
    invoke-static {v2}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 749
    .line 750
    .line 751
    move-result-object v2

    .line 752
    const-string v5, "restore_path"

    .line 753
    .line 754
    const-string v9, "\u628a\u6587\u4ef6\u6216\u76ee\u5f55\u6062\u590d\u5230\u672c\u8f6e\u5f00\u59cb\u65f6\u7684\u72b6\u6001\uff1b\u65b0\u5efa\u8def\u5f84\u4f1a\u88ab\u79fb\u9664"

    .line 755
    .line 756
    invoke-static {v0, v5, v9, v1, v2}, Lfb/t2;->V(Lorg/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/util/LinkedHashMap;Ljava/util/List;)V

    .line 757
    .line 758
    .line 759
    invoke-static {v6, v3}, Lfb/t2;->T(ILjava/lang/String;)Lorg/json/JSONObject;

    .line 760
    .line 761
    .line 762
    move-result-object v1

    .line 763
    new-instance v2, Lsf/e;

    .line 764
    .line 765
    invoke-direct {v2, v4, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 766
    .line 767
    .line 768
    filled-new-array {v2}, [Lsf/e;

    .line 769
    .line 770
    .line 771
    move-result-object v1

    .line 772
    invoke-static {v1}, Ltf/y;->Z([Lsf/e;)Ljava/util/LinkedHashMap;

    .line 773
    .line 774
    .line 775
    move-result-object v1

    .line 776
    invoke-static {v4}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 777
    .line 778
    .line 779
    move-result-object v2

    .line 780
    const-string v5, "reset_workspace"

    .line 781
    .line 782
    const-string v9, "\u4e22\u5f03\u672c\u8f6e\u5168\u90e8\u6682\u5b58\u4fee\u6539\u5e76\u6062\u590d\u5230\u4efb\u52a1\u5f00\u59cb\u72b6\u6001"

    .line 783
    .line 784
    invoke-static {v0, v5, v9, v1, v2}, Lfb/t2;->V(Lorg/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/util/LinkedHashMap;Ljava/util/List;)V

    .line 785
    .line 786
    .line 787
    invoke-static {v6, v3}, Lfb/t2;->T(ILjava/lang/String;)Lorg/json/JSONObject;

    .line 788
    .line 789
    .line 790
    move-result-object v1

    .line 791
    new-instance v2, Lsf/e;

    .line 792
    .line 793
    invoke-direct {v2, v4, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 794
    .line 795
    .line 796
    filled-new-array {v2}, [Lsf/e;

    .line 797
    .line 798
    .line 799
    move-result-object v1

    .line 800
    invoke-static {v1}, Ltf/y;->Z([Lsf/e;)Ljava/util/LinkedHashMap;

    .line 801
    .line 802
    .line 803
    move-result-object v1

    .line 804
    invoke-static {v4}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 805
    .line 806
    .line 807
    move-result-object v2

    .line 808
    const-string v5, "delete_plugin"

    .line 809
    .line 810
    const-string v9, "\u6807\u8bb0\u5220\u9664\u6574\u4e2a\u73b0\u6709\u63d2\u4ef6\uff1b\u6700\u7ec8\u63d0\u4ea4\u524d\u5ba2\u6237\u7aef\u4e00\u5b9a\u4f1a\u8981\u6c42\u7528\u6237\u786e\u8ba4"

    .line 811
    .line 812
    invoke-static {v0, v5, v9, v1, v2}, Lfb/t2;->V(Lorg/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/util/LinkedHashMap;Ljava/util/List;)V

    .line 813
    .line 814
    .line 815
    invoke-static {v6, v3}, Lfb/t2;->T(ILjava/lang/String;)Lorg/json/JSONObject;

    .line 816
    .line 817
    .line 818
    move-result-object v1

    .line 819
    new-instance v2, Lsf/e;

    .line 820
    .line 821
    invoke-direct {v2, v4, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 822
    .line 823
    .line 824
    const-string v1, "\u53ef\u9009\u76f8\u5bf9\u8def\u5f84\uff0c\u53ea\u663e\u793a\u8be5\u8def\u5f84\u4e0b\u7684\u5dee\u5f02"

    .line 825
    .line 826
    const/4 v9, 0x0

    .line 827
    invoke-static {v9, v1}, Lfb/t2;->T(ILjava/lang/String;)Lorg/json/JSONObject;

    .line 828
    .line 829
    .line 830
    move-result-object v1

    .line 831
    new-instance v5, Lsf/e;

    .line 832
    .line 833
    invoke-direct {v5, v8, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 834
    .line 835
    .line 836
    filled-new-array {v2, v5}, [Lsf/e;

    .line 837
    .line 838
    .line 839
    move-result-object v1

    .line 840
    invoke-static {v1}, Ltf/y;->Z([Lsf/e;)Ljava/util/LinkedHashMap;

    .line 841
    .line 842
    .line 843
    move-result-object v1

    .line 844
    invoke-static {v4}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 845
    .line 846
    .line 847
    move-result-object v2

    .line 848
    const-string v5, "show_diff"

    .line 849
    .line 850
    const-string v6, "\u663e\u793a\u5f53\u524d\u6682\u5b58\u5de5\u4f5c\u533a\u76f8\u5bf9\u539f\u63d2\u4ef6\u7684\u6807\u51c6\u7edf\u4e00 diff"

    .line 851
    .line 852
    invoke-static {v0, v5, v6, v1, v2}, Lfb/t2;->V(Lorg/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/util/LinkedHashMap;Ljava/util/List;)V

    .line 853
    .line 854
    .line 855
    const/4 v6, 0x1

    .line 856
    invoke-static {v6, v3}, Lfb/t2;->T(ILjava/lang/String;)Lorg/json/JSONObject;

    .line 857
    .line 858
    .line 859
    move-result-object v1

    .line 860
    new-instance v2, Lsf/e;

    .line 861
    .line 862
    invoke-direct {v2, v4, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 863
    .line 864
    .line 865
    filled-new-array {v2}, [Lsf/e;

    .line 866
    .line 867
    .line 868
    move-result-object v1

    .line 869
    invoke-static {v1}, Ltf/y;->Z([Lsf/e;)Ljava/util/LinkedHashMap;

    .line 870
    .line 871
    .line 872
    move-result-object v1

    .line 873
    invoke-static {v4}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 874
    .line 875
    .line 876
    move-result-object v2

    .line 877
    const-string v3, "workspace_status"

    .line 878
    .line 879
    const-string v4, "\u68c0\u67e5\u5de5\u4f5c\u533a\u53d8\u66f4\u3001\u5fc5\u9700\u6587\u4ef6\u548c\u9759\u6001\u6821\u9a8c\u7ed3\u679c"

    .line 880
    .line 881
    invoke-static {v0, v3, v4, v1, v2}, Lfb/t2;->V(Lorg/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/util/LinkedHashMap;Ljava/util/List;)V

    .line 882
    .line 883
    .line 884
    new-instance v1, Lorg/json/JSONObject;

    .line 885
    .line 886
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 887
    .line 888
    .line 889
    const-string v2, "Hchat \u63d2\u4ef6\u5de5\u4f5c\u533a\u5de5\u5177"

    .line 890
    .line 891
    invoke-virtual {v1, v7, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 892
    .line 893
    .line 894
    const-string v2, "instructions"

    .line 895
    .line 896
    const-string v3, "\u6240\u6709\u8def\u5f84\u5747\u76f8\u5bf9\u5355\u4e2a\u63d2\u4ef6\u76ee\u5f55\u3002\u6743\u9650\u5f02\u5e38\u6216\u5199\u5165\u5931\u8d25\u65f6\u5148\u8c03\u7528 check_access\uff0c\u5fc5\u8981\u65f6\u8bbe\u7f6e repair=true\uff1b\u4fee\u6539\u4ee3\u7801\u5148 list/read/search\uff0c\u518d\u4f7f\u7528 Codex \u98ce\u683c apply_patch\u3002\u5b8c\u6210\u524d\u5fc5\u987b\u4f9d\u6b21\u8c03\u7528 workspace_status \u548c show_diff\u3002"

    .line 897
    .line 898
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 899
    .line 900
    .line 901
    const-string v2, "tools"

    .line 902
    .line 903
    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 904
    .line 905
    .line 906
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 907
    .line 908
    .line 909
    move-result-object v0

    .line 910
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 911
    .line 912
    .line 913
    return-object v0
.end method

.method public static X(Ljava/io/File;)Ljava/io/File;
    .locals 3

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const-string v2, ".committed"

    .line 12
    .line 13
    invoke-static {p0, v2}, Lbc/e;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-direct {v0, v1, p0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public static Y(Ljava/io/File;)Ljava/lang/String;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/io/File;->isFile()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/io/File;->length()J

    .line 9
    .line 10
    .line 11
    move-result-wide v2

    .line 12
    const-wide/16 v4, 0x1

    .line 13
    .line 14
    cmp-long v0, v4, v2

    .line 15
    .line 16
    if-gtz v0, :cond_1

    .line 17
    .line 18
    const-wide/16 v4, 0x81

    .line 19
    .line 20
    cmp-long v0, v2, v4

    .line 21
    .line 22
    if-gez v0, :cond_1

    .line 23
    .line 24
    :try_start_0
    sget-object v0, Log/a;->a:Ljava/nio/charset/Charset;

    .line 25
    .line 26
    invoke-static {p0, v0}, Ldg/l;->h0(Ljava/io/File;Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception p0

    .line 32
    new-instance v0, Lsf/f;

    .line 33
    .line 34
    invoke-direct {v0, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    move-object p0, v0

    .line 38
    :goto_0
    nop

    .line 39
    instance-of v0, p0, Lsf/f;

    .line 40
    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_0
    move-object v1, p0

    .line 45
    :goto_1
    check-cast v1, Ljava/lang/String;

    .line 46
    .line 47
    :cond_1
    return-object v1
.end method

.method public static Z(Ljava/io/File;)Ljava/io/File;
    .locals 3

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const-string v2, ".ready"

    .line 12
    .line 13
    invoke-static {p0, v2}, Lbc/e;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-direct {v0, v1, p0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public static final a(Ljava/io/File;Ljava/lang/String;)V
    .locals 5

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    const-string v3, "."

    .line 12
    .line 13
    const-string v4, ".agent.tmp"

    .line 14
    .line 15
    invoke-static {v3, v2, v4}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    new-instance v1, Ljava/io/FileOutputStream;

    .line 23
    .line 24
    invoke-direct {v1, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 25
    .line 26
    .line 27
    :try_start_0
    sget-object v2, Log/a;->a:Ljava/nio/charset/Charset;

    .line 28
    .line 29
    invoke-virtual {p1, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, p1}, Ljava/io/FileOutputStream;->write([B)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->getFD()Ljava/io/FileDescriptor;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p1}, Ljava/io/FileDescriptor;->sync()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V

    .line 47
    .line 48
    .line 49
    :try_start_1
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-static {p1, v1}, Landroid/system/Os;->rename(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :catchall_0
    move-exception p1

    .line 62
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 63
    .line 64
    .line 65
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 66
    .line 67
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    const-string v1, "\u5199\u5165\u6587\u4ef6\u5931\u8d25: "

    .line 72
    .line 73
    invoke-static {v1, p0}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    invoke-direct {v0, p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 78
    .line 79
    .line 80
    throw v0

    .line 81
    :catchall_1
    move-exception p0

    .line 82
    :try_start_2
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 83
    :catchall_2
    move-exception p1

    .line 84
    invoke-static {v1, p0}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 85
    .line 86
    .line 87
    throw p1
.end method

.method public static a0(Ljava/util/Map;)Ljava/lang/String;
    .locals 4

    .line 1
    const-string v0, "SHA-256"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Ljava/util/TreeMap;

    .line 8
    .line 9
    invoke-direct {v1, p0}, Ljava/util/TreeMap;-><init>(Ljava/util/Map;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Ljava/util/Map$Entry;

    .line 31
    .line 32
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, Ljava/lang/String;

    .line 37
    .line 38
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    check-cast v1, Lfb/q2;

    .line 43
    .line 44
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    sget-object v3, Log/a;->a:Ljava/nio/charset/Charset;

    .line 48
    .line 49
    invoke-virtual {v2, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v2}, Ljava/security/MessageDigest;->update([B)V

    .line 57
    .line 58
    .line 59
    iget-boolean v2, v1, Lfb/q2;->a:Z

    .line 60
    .line 61
    invoke-virtual {v0, v2}, Ljava/security/MessageDigest;->update(B)V

    .line 62
    .line 63
    .line 64
    iget-wide v2, v1, Lfb/q2;->b:J

    .line 65
    .line 66
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    sget-object v3, Log/a;->b:Ljava/nio/charset/Charset;

    .line 71
    .line 72
    invoke-virtual {v2, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, v2}, Ljava/security/MessageDigest;->update([B)V

    .line 80
    .line 81
    .line 82
    iget-object v1, v1, Lfb/q2;->c:Ljava/lang/String;

    .line 83
    .line 84
    invoke-virtual {v1, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0, v1}, Ljava/security/MessageDigest;->update([B)V

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_0
    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    new-instance v0, Lfb/g0;

    .line 103
    .line 104
    const/16 v1, 0x18

    .line 105
    .line 106
    invoke-direct {v0, v1}, Lfb/g0;-><init>(I)V

    .line 107
    .line 108
    .line 109
    invoke-static {p0, v0}, Ltf/l;->E0([BLfg/l;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    return-object p0
.end method

.method public static final b(Ljava/util/List;II)Lorg/json/JSONArray;
    .locals 4

    .line 1
    new-instance v0, Lorg/json/JSONArray;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 4
    .line 5
    .line 6
    if-gez p1, :cond_0

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-le p2, v1, :cond_1

    .line 14
    .line 15
    move p2, v1

    .line 16
    :cond_1
    :goto_0
    if-lt p1, p2, :cond_2

    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_2
    new-instance v1, Lorg/json/JSONObject;

    .line 20
    .line 21
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 22
    .line 23
    .line 24
    add-int/lit8 v2, p1, 0x1

    .line 25
    .line 26
    const-string v3, "line"

    .line 27
    .line 28
    invoke-virtual {v1, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 29
    .line 30
    .line 31
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, Ljava/lang/String;

    .line 36
    .line 37
    const/16 v3, 0x1f4

    .line 38
    .line 39
    invoke-static {v3, p1}, Log/m;->P0(ILjava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    const-string v3, "text"

    .line 44
    .line 45
    invoke-virtual {v1, v3, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 49
    .line 50
    .line 51
    move p1, v2

    .line 52
    goto :goto_0
.end method

.method public static b0(Ljava/io/File;Ljava/lang/String;)Lfb/p2;
    .locals 14

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    const-string v1, "main.java"

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Ljava/io/File;

    .line 9
    .line 10
    const-string v2, "info.prop"

    .line 11
    .line 12
    invoke-direct {v1, p0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const/4 v3, 0x0

    .line 20
    if-eqz v2, :cond_e

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/io/File;->isFile()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_d

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/io/File;->length()J

    .line 29
    .line 30
    .line 31
    move-result-wide v4

    .line 32
    const-wide/32 v6, 0x200000

    .line 33
    .line 34
    .line 35
    cmp-long v2, v4, v6

    .line 36
    .line 37
    if-gtz v2, :cond_c

    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/io/File;->length()J

    .line 40
    .line 41
    .line 42
    move-result-wide v4

    .line 43
    cmp-long v2, v4, v6

    .line 44
    .line 45
    if-gtz v2, :cond_c

    .line 46
    .line 47
    sget-object v2, Log/a;->a:Ljava/nio/charset/Charset;

    .line 48
    .line 49
    invoke-static {v1, v2}, Ldg/l;->h0(Ljava/io/File;Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v11

    .line 53
    new-instance v1, Ljava/util/Properties;

    .line 54
    .line 55
    invoke-direct {v1}, Ljava/util/Properties;-><init>()V

    .line 56
    .line 57
    .line 58
    :try_start_0
    new-instance v2, Ljava/io/StringReader;

    .line 59
    .line 60
    invoke-direct {v2, v11}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1, v2}, Ljava/util/Properties;->load(Ljava/io/Reader;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    .line 65
    .line 66
    :catchall_0
    sget-object v2, Lfb/a2;->a:Log/k;

    .line 67
    .line 68
    new-instance v8, Lfb/y;

    .line 69
    .line 70
    const-string v2, "name"

    .line 71
    .line 72
    invoke-virtual {v1, v2}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    if-nez v1, :cond_0

    .line 77
    .line 78
    const-string v1, ""

    .line 79
    .line 80
    :cond_0
    move-object v9, v1

    .line 81
    sget-object v1, Log/a;->a:Ljava/nio/charset/Charset;

    .line 82
    .line 83
    invoke-static {v0, v1}, Ldg/l;->h0(Ljava/io/File;Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v12

    .line 87
    const-string v13, ""

    .line 88
    .line 89
    move-object v10, p1

    .line 90
    invoke-direct/range {v8 .. v13}, Lfb/y;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-static {v8}, Lfb/a2;->c(Lfb/y;)Lfb/y;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-static {p1}, Lfb/a2;->f(Lfb/y;)Lfb/z1;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    iget-object v0, v0, Lfb/z1;->a:Ljava/util/List;

    .line 102
    .line 103
    new-instance v1, Ljava/util/ArrayList;

    .line 104
    .line 105
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 106
    .line 107
    .line 108
    new-instance v0, Ldg/j;

    .line 109
    .line 110
    sget-object v2, Ldg/k;->g:Ldg/k;

    .line 111
    .line 112
    invoke-direct {v0, p0, v2, v3}, Ldg/j;-><init>(Ljava/io/File;Ldg/k;Lc9/x;)V

    .line 113
    .line 114
    .line 115
    new-instance v2, Lfb/g0;

    .line 116
    .line 117
    const/16 v4, 0x15

    .line 118
    .line 119
    invoke-direct {v2, v4}, Lfb/g0;-><init>(I)V

    .line 120
    .line 121
    .line 122
    new-instance v4, Lng/i;

    .line 123
    .line 124
    const/4 v5, 0x1

    .line 125
    invoke-direct {v4, v0, v5, v2}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 126
    .line 127
    .line 128
    new-instance v2, Lng/h;

    .line 129
    .line 130
    invoke-direct {v2, v4}, Lng/h;-><init>(Lng/i;)V

    .line 131
    .line 132
    .line 133
    :goto_0
    invoke-virtual {v2}, Lng/h;->hasNext()Z

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    if-eqz v0, :cond_9

    .line 138
    .line 139
    invoke-virtual {v2}, Lng/h;->next()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    check-cast v0, Ljava/io/File;

    .line 144
    .line 145
    invoke-static {v0, p0}, Ldg/l;->i0(Ljava/io/File;Ljava/io/File;)Ljava/io/File;

    .line 146
    .line 147
    .line 148
    move-result-object v4

    .line 149
    invoke-static {v4}, Ldg/l;->d0(Ljava/io/File;)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v4

    .line 153
    invoke-virtual {v0}, Ljava/io/File;->length()J

    .line 154
    .line 155
    .line 156
    move-result-wide v8

    .line 157
    cmp-long v5, v8, v6

    .line 158
    .line 159
    sget-object v8, Lfb/b0;->g:Lfb/b0;

    .line 160
    .line 161
    const/4 v9, 0x0

    .line 162
    if-lez v5, :cond_1

    .line 163
    .line 164
    new-instance v0, Lfb/a0;

    .line 165
    .line 166
    const-string v5, " \u8d85\u8fc7 2 MB\uff0c\u4e0d\u80fd\u6267\u884c\u9759\u6001\u68c0\u67e5"

    .line 167
    .line 168
    invoke-virtual {v4, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v4

    .line 172
    invoke-direct {v0, v8, v4, v9}, Lfb/a0;-><init>(Lfb/b0;Ljava/lang/String;Z)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    goto :goto_0

    .line 179
    :cond_1
    :try_start_1
    invoke-static {v0}, Ldg/l;->g0(Ljava/io/File;)[B

    .line 180
    .line 181
    .line 182
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 183
    goto :goto_1

    .line 184
    :catchall_1
    move-exception v0

    .line 185
    new-instance v5, Lsf/f;

    .line 186
    .line 187
    invoke-direct {v5, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 188
    .line 189
    .line 190
    move-object v0, v5

    .line 191
    :goto_1
    nop

    .line 192
    instance-of v5, v0, Lsf/f;

    .line 193
    .line 194
    if-eqz v5, :cond_2

    .line 195
    .line 196
    move-object v0, v3

    .line 197
    :cond_2
    check-cast v0, [B

    .line 198
    .line 199
    if-eqz v0, :cond_8

    .line 200
    .line 201
    invoke-static {v0}, Lfb/t2;->C([B)Z

    .line 202
    .line 203
    .line 204
    move-result v5

    .line 205
    if-nez v5, :cond_3

    .line 206
    .line 207
    goto/16 :goto_3

    .line 208
    .line 209
    :cond_3
    sget-object v5, Lfb/a2;->a:Log/k;

    .line 210
    .line 211
    new-instance v5, Ljava/lang/String;

    .line 212
    .line 213
    sget-object v10, Log/a;->a:Ljava/nio/charset/Charset;

    .line 214
    .line 215
    invoke-direct {v5, v0, v10}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 216
    .line 217
    .line 218
    new-instance v0, Ljava/util/ArrayList;

    .line 219
    .line 220
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 221
    .line 222
    .line 223
    const-string v10, "```"

    .line 224
    .line 225
    invoke-static {v5, v10, v9}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 226
    .line 227
    .line 228
    move-result v10

    .line 229
    if-eqz v10, :cond_4

    .line 230
    .line 231
    new-instance v10, Lfb/a0;

    .line 232
    .line 233
    const-string v11, " \u4ecd\u5305\u542b Markdown \u4ee3\u7801\u56f4\u680f"

    .line 234
    .line 235
    invoke-virtual {v4, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v11

    .line 239
    invoke-direct {v10, v8, v11, v9}, Lfb/a0;-><init>(Lfb/b0;Ljava/lang/String;Z)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    :cond_4
    sget-object v10, Lfb/a2;->b:Log/k;

    .line 246
    .line 247
    invoke-virtual {v10, v5}, Log/k;->a(Ljava/lang/CharSequence;)Z

    .line 248
    .line 249
    .line 250
    move-result v10

    .line 251
    if-eqz v10, :cond_5

    .line 252
    .line 253
    new-instance v10, Lfb/a0;

    .line 254
    .line 255
    const-string v11, " \u5305\u542b\u7edd\u5bf9\u8def\u5f84\u6216 .. \u8def\u5f84\uff0c\u8bf7\u6539\u7528 pluginDir\u3001pluginDirFile \u6216 cacheDir"

    .line 256
    .line 257
    invoke-virtual {v4, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v11

    .line 261
    invoke-direct {v10, v8, v11, v9}, Lfb/a0;-><init>(Lfb/b0;Ljava/lang/String;Z)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    :cond_5
    invoke-static {v5}, Lfb/a2;->b(Ljava/lang/String;)Z

    .line 268
    .line 269
    .line 270
    move-result v10

    .line 271
    if-eqz v10, :cond_6

    .line 272
    .line 273
    new-instance v10, Lfb/a0;

    .line 274
    .line 275
    const-string v11, ": BeanShell \u9876\u5c42 native \u65b9\u6cd5\u65e0\u6cd5\u7ed1\u5b9a JNI\uff0c\u8bf7\u628a native \u58f0\u660e\u653e\u8fdb\u7c7b\u5e76\u5c06\u8be5\u7c7b\u7684 ClassLoader \u4f20\u7ed9 loadSo"

    .line 276
    .line 277
    invoke-virtual {v4, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v11

    .line 281
    invoke-direct {v10, v8, v11, v9}, Lfb/a0;-><init>(Lfb/b0;Ljava/lang/String;Z)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 285
    .line 286
    .line 287
    :cond_6
    invoke-static {v5}, Lfb/a2;->d(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 288
    .line 289
    .line 290
    move-result-object v5

    .line 291
    new-instance v8, Ljava/util/ArrayList;

    .line 292
    .line 293
    invoke-static {v5}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 294
    .line 295
    .line 296
    move-result v9

    .line 297
    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 301
    .line 302
    .line 303
    move-result-object v5

    .line 304
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 305
    .line 306
    .line 307
    move-result v9

    .line 308
    if-eqz v9, :cond_7

    .line 309
    .line 310
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v9

    .line 314
    check-cast v9, Lfb/a0;

    .line 315
    .line 316
    iget-object v10, v9, Lfb/a0;->b:Ljava/lang/String;

    .line 317
    .line 318
    const-string v11, ": "

    .line 319
    .line 320
    invoke-static {v4, v11, v10}, Lwb/en;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v10

    .line 324
    iget-object v11, v9, Lfb/a0;->a:Lfb/b0;

    .line 325
    .line 326
    iget-boolean v9, v9, Lfb/a0;->c:Z

    .line 327
    .line 328
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 329
    .line 330
    .line 331
    new-instance v12, Lfb/a0;

    .line 332
    .line 333
    invoke-direct {v12, v11, v10, v9}, Lfb/a0;-><init>(Lfb/b0;Ljava/lang/String;Z)V

    .line 334
    .line 335
    .line 336
    invoke-virtual {v8, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 337
    .line 338
    .line 339
    goto :goto_2

    .line 340
    :cond_7
    invoke-static {v0, v8}, Ltf/r;->h1(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 341
    .line 342
    .line 343
    invoke-static {v1, v0}, Ltf/r;->h1(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 344
    .line 345
    .line 346
    goto/16 :goto_0

    .line 347
    .line 348
    :cond_8
    :goto_3
    new-instance v0, Lfb/a0;

    .line 349
    .line 350
    const-string v5, " \u4e0d\u662f\u53ef\u9759\u6001\u68c0\u67e5\u7684\u6587\u672c\u4ee3\u7801"

    .line 351
    .line 352
    invoke-virtual {v4, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object v4

    .line 356
    invoke-direct {v0, v8, v4, v9}, Lfb/a0;-><init>(Lfb/b0;Ljava/lang/String;Z)V

    .line 357
    .line 358
    .line 359
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 360
    .line 361
    .line 362
    goto/16 :goto_0

    .line 363
    .line 364
    :cond_9
    new-instance p0, Ljava/util/HashSet;

    .line 365
    .line 366
    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 367
    .line 368
    .line 369
    new-instance v0, Ljava/util/ArrayList;

    .line 370
    .line 371
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 372
    .line 373
    .line 374
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 375
    .line 376
    .line 377
    move-result-object v1

    .line 378
    :cond_a
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 379
    .line 380
    .line 381
    move-result v2

    .line 382
    if-eqz v2, :cond_b

    .line 383
    .line 384
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    move-result-object v2

    .line 388
    move-object v3, v2

    .line 389
    check-cast v3, Lfb/a0;

    .line 390
    .line 391
    iget-object v4, v3, Lfb/a0;->a:Lfb/b0;

    .line 392
    .line 393
    iget-object v3, v3, Lfb/a0;->b:Ljava/lang/String;

    .line 394
    .line 395
    new-instance v5, Lsf/e;

    .line 396
    .line 397
    invoke-direct {v5, v4, v3}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 398
    .line 399
    .line 400
    invoke-virtual {p0, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 401
    .line 402
    .line 403
    move-result v3

    .line 404
    if-eqz v3, :cond_a

    .line 405
    .line 406
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 407
    .line 408
    .line 409
    goto :goto_4

    .line 410
    :cond_b
    new-instance p0, Lfb/z1;

    .line 411
    .line 412
    invoke-direct {p0, v0}, Lfb/z1;-><init>(Ljava/util/List;)V

    .line 413
    .line 414
    .line 415
    new-instance v0, Lfb/p2;

    .line 416
    .line 417
    invoke-direct {v0, p1, p0}, Lfb/p2;-><init>(Lfb/y;Lfb/z1;)V

    .line 418
    .line 419
    .line 420
    return-object v0

    .line 421
    :cond_c
    const-string p0, "\u63d2\u4ef6\u4e3b\u6587\u4ef6\u8d85\u8fc7\u5927\u5c0f\u9650\u5236"

    .line 422
    .line 423
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 424
    .line 425
    .line 426
    return-object v3

    .line 427
    :cond_d
    const-string p0, "\u63d2\u4ef6\u7f3a\u5c11 info.prop"

    .line 428
    .line 429
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 430
    .line 431
    .line 432
    return-object v3

    .line 433
    :cond_e
    const-string p0, "\u63d2\u4ef6\u7f3a\u5c11 main.java"

    .line 434
    .line 435
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 436
    .line 437
    .line 438
    return-object v3
.end method

.method public static final c(Ljava/lang/String;)Log/k;
    .locals 9

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "^"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const/16 v1, 0x5c

    .line 9
    .line 10
    const/16 v2, 0x2f

    .line 11
    .line 12
    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-static {p0, v2}, Log/m;->i0(Ljava/lang/CharSequence;C)Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    const-string v4, "(?:.*/)?"

    .line 24
    .line 25
    if-nez v3, :cond_0

    .line 26
    .line 27
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    :cond_0
    const/4 v3, 0x0

    .line 31
    move v5, v3

    .line 32
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    const/16 v7, 0x24

    .line 37
    .line 38
    if-ge v5, v6, :cond_7

    .line 39
    .line 40
    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    .line 41
    .line 42
    .line 43
    move-result v6

    .line 44
    if-eq v6, v7, :cond_6

    .line 45
    .line 46
    const/16 v7, 0x2e

    .line 47
    .line 48
    if-eq v6, v7, :cond_6

    .line 49
    .line 50
    const/16 v7, 0x3f

    .line 51
    .line 52
    if-eq v6, v7, :cond_5

    .line 53
    .line 54
    packed-switch v6, :pswitch_data_0

    .line 55
    .line 56
    .line 57
    packed-switch v6, :pswitch_data_1

    .line 58
    .line 59
    .line 60
    packed-switch v6, :pswitch_data_2

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    goto :goto_3

    .line 67
    :pswitch_0
    add-int/lit8 v6, v5, 0x1

    .line 68
    .line 69
    invoke-static {p0, v6}, Log/m;->n0(Ljava/lang/CharSequence;I)Ljava/lang/Character;

    .line 70
    .line 71
    .line 72
    move-result-object v7

    .line 73
    if-nez v7, :cond_1

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_1
    invoke-virtual {v7}, Ljava/lang/Character;->charValue()C

    .line 77
    .line 78
    .line 79
    move-result v7

    .line 80
    const/16 v8, 0x2a

    .line 81
    .line 82
    if-ne v7, v8, :cond_4

    .line 83
    .line 84
    add-int/lit8 v5, v5, 0x2

    .line 85
    .line 86
    invoke-static {p0, v5}, Log/m;->n0(Ljava/lang/CharSequence;I)Ljava/lang/Character;

    .line 87
    .line 88
    .line 89
    move-result-object v7

    .line 90
    if-nez v7, :cond_2

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_2
    invoke-virtual {v7}, Ljava/lang/Character;->charValue()C

    .line 94
    .line 95
    .line 96
    move-result v7

    .line 97
    if-ne v7, v2, :cond_3

    .line 98
    .line 99
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_3
    :goto_1
    const-string v5, ".*"

    .line 104
    .line 105
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    move v5, v6

    .line 109
    goto :goto_3

    .line 110
    :cond_4
    :goto_2
    const-string v6, "[^/]*"

    .line 111
    .line 112
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_5
    const-string v6, "[^/]"

    .line 117
    .line 118
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    goto :goto_3

    .line 122
    :cond_6
    :pswitch_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    :goto_3
    add-int/lit8 v5, v5, 0x1

    .line 129
    .line 130
    goto :goto_0

    .line 131
    :cond_7
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    new-instance v0, Log/k;

    .line 139
    .line 140
    invoke-direct {v0, p0, v3}, Log/k;-><init>(Ljava/lang/String;I)V

    .line 141
    .line 142
    .line 143
    return-object v0

    .line 144
    nop

    .line 145
    :pswitch_data_0
    .packed-switch 0x28
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch

    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    :pswitch_data_1
    .packed-switch 0x5b
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch

    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    :pswitch_data_2
    .packed-switch 0x7b
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public static c0(Landroid/content/Context;)Ljava/io/File;
    .locals 2

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-string v1, "Hchat_agent_plugin_workspaces"

    .line 8
    .line 9
    invoke-direct {v0, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    if-nez p0, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const-string p0, "\u521b\u5efa Agent \u5de5\u4f5c\u533a\u76ee\u5f55\u5931\u8d25"

    .line 26
    .line 27
    invoke-static {p0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const/4 p0, 0x0

    .line 31
    return-object p0

    .line 32
    :cond_1
    :goto_0
    return-object v0
.end method

.method public static d(Ljava/io/File;Ljava/io/File;Lfb/i2;)V
    .locals 4

    .line 1
    iget-object v0, p2, Lfb/i2;->h:Ljava/util/List;

    .line 2
    .line 3
    new-instance v1, Lfb/r;

    .line 4
    .line 5
    const/16 v2, 0xa

    .line 6
    .line 7
    invoke-direct {v1, v2}, Lfb/r;-><init>(I)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1}, Ltf/m;->K1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Ljava/lang/String;

    .line 29
    .line 30
    new-instance v2, Ljava/io/File;

    .line 31
    .line 32
    invoke-direct {v2, p1, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-static {v2}, Lfb/t2;->q(Ljava/io/File;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    iget-object v0, p2, Lfb/i2;->f:Ljava/util/List;

    .line 40
    .line 41
    iget-object p2, p2, Lfb/i2;->g:Ljava/util/List;

    .line 42
    .line 43
    invoke-static {v0, p2}, Ltf/m;->F1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    invoke-static {p2}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    invoke-static {p2}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    new-instance v0, Lfb/r;

    .line 56
    .line 57
    const/16 v1, 0x9

    .line 58
    .line 59
    invoke-direct {v0, v1}, Lfb/r;-><init>(I)V

    .line 60
    .line 61
    .line 62
    invoke-static {p2, v0}, Ltf/m;->K1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    :cond_1
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-eqz v0, :cond_6

    .line 75
    .line 76
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    check-cast v0, Ljava/lang/String;

    .line 81
    .line 82
    new-instance v1, Ljava/io/File;

    .line 83
    .line 84
    invoke-direct {v1, p0, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    new-instance v2, Ljava/io/File;

    .line 88
    .line 89
    invoke-direct {v2, p1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    if-eqz v3, :cond_5

    .line 97
    .line 98
    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    if-eqz v3, :cond_4

    .line 103
    .line 104
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    if-eqz v1, :cond_2

    .line 109
    .line 110
    invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    if-nez v1, :cond_2

    .line 115
    .line 116
    invoke-static {v2}, Lfb/t2;->p(Ljava/io/File;)V

    .line 117
    .line 118
    .line 119
    :cond_2
    invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    if-nez v1, :cond_1

    .line 124
    .line 125
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    if-eqz v1, :cond_3

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_3
    const-string p0, "\u521b\u5efa\u76ee\u5f55\u5931\u8d25: "

    .line 133
    .line 134
    invoke-static {p0, v0}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    invoke-static {p0}, Lah/a;->h(Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    return-void

    .line 142
    :cond_4
    invoke-static {v2}, Lfb/t2;->q(Ljava/io/File;)V

    .line 143
    .line 144
    .line 145
    invoke-static {v1, v2}, Lfb/t2;->m(Ljava/io/File;Ljava/io/File;)V

    .line 146
    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_5
    const-string p0, "\u6682\u5b58\u53d8\u66f4\u8def\u5f84\u4e0d\u5b58\u5728: "

    .line 150
    .line 151
    invoke-static {p0, v0}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    invoke-static {p0}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    :cond_6
    return-void
.end method

.method public static d0(Ljava/io/File;Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/io/FileOutputStream;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    sget-object p0, Log/a;->a:Ljava/nio/charset/Charset;

    .line 7
    .line 8
    invoke-virtual {p1, p0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/io/FileOutputStream;->write([B)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->getFD()Ljava/io/FileDescriptor;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {p0}, Ljava/io/FileDescriptor;->sync()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :catchall_0
    move-exception p0

    .line 30
    :try_start_1
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 31
    :catchall_1
    move-exception p1

    .line 32
    invoke-static {v0, p0}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 33
    .line 34
    .line 35
    throw p1
.end method

.method public static e(Ljava/lang/String;Z)Lorg/json/JSONObject;
    .locals 3

    .line 1
    const-string v0, "boolean"

    .line 2
    .line 3
    const-string v1, "description"

    .line 4
    .line 5
    const-string v2, "type"

    .line 6
    .line 7
    invoke-static {v2, v0, v1, p0}, Lwb/en;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const-string v0, "default"

    .line 12
    .line 13
    invoke-virtual {p0, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 14
    .line 15
    .line 16
    return-object p0
.end method

.method public static final f(Landroid/content/Context;Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;
    .locals 20

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    invoke-static/range {p1 .. p1}, Lfb/t2;->E(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-string v2, "check_access"

    .line 8
    .line 9
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz v1, :cond_29

    .line 15
    .line 16
    invoke-static/range {p0 .. p0}, Lfb/t2;->j(Landroid/content/Context;)V

    .line 17
    .line 18
    .line 19
    sget-object v1, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 20
    .line 21
    move-object/from16 v3, p0

    .line 22
    .line 23
    invoke-virtual {v1, v3}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->ensureDirs(Landroid/content/Context;)Ljava/io/File;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-static {v1}, Lfb/t2;->M(Ljava/io/File;)V

    .line 35
    .line 36
    .line 37
    const-string v3, "plugin_id"

    .line 38
    .line 39
    const-string v4, ""

    .line 40
    .line 41
    invoke-static {v3, v4, v0}, Lbc/e;->l(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    if-nez v4, :cond_28

    .line 50
    .line 51
    invoke-static {v3}, Lfb/a2;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    if-eqz v4, :cond_27

    .line 60
    .line 61
    const-string v4, ".."

    .line 62
    .line 63
    const/4 v5, 0x0

    .line 64
    invoke-static {v3, v4, v5}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    if-nez v6, :cond_27

    .line 69
    .line 70
    new-instance v6, Ljava/io/File;

    .line 71
    .line 72
    invoke-direct {v6, v1, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v6}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    invoke-virtual {v6}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    .line 80
    .line 81
    .line 82
    move-result-object v9

    .line 83
    invoke-virtual {v9}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 84
    .line 85
    .line 86
    move-result-object v7

    .line 87
    invoke-static {v7, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v7

    .line 91
    if-eqz v7, :cond_26

    .line 92
    .line 93
    invoke-virtual {v6, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v6

    .line 97
    if-eqz v6, :cond_26

    .line 98
    .line 99
    const-string v6, "path"

    .line 100
    .line 101
    const-string v7, "."

    .line 102
    .line 103
    invoke-virtual {v0, v6, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v8

    .line 107
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    invoke-static {v8}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 111
    .line 112
    .line 113
    move-result-object v8

    .line 114
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v8

    .line 118
    const/16 v10, 0x5c

    .line 119
    .line 120
    const/16 v11, 0x2f

    .line 121
    .line 122
    invoke-static {v8, v10, v11}, Log/t;->b0(Ljava/lang/String;CC)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v8

    .line 126
    const/4 v13, 0x1

    .line 127
    new-array v10, v13, [C

    .line 128
    .line 129
    aput-char v11, v10, v5

    .line 130
    .line 131
    invoke-static {v8, v10}, Log/m;->S0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v8

    .line 135
    invoke-static {v8}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 136
    .line 137
    .line 138
    move-result v10

    .line 139
    if-nez v10, :cond_6

    .line 140
    .line 141
    invoke-virtual {v8, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v10

    .line 145
    if-eqz v10, :cond_0

    .line 146
    .line 147
    goto :goto_2

    .line 148
    :cond_0
    invoke-static {v8, v11}, Log/m;->I0(Ljava/lang/String;C)Z

    .line 149
    .line 150
    .line 151
    move-result v10

    .line 152
    if-nez v10, :cond_5

    .line 153
    .line 154
    invoke-static {v8, v5}, Log/m;->i0(Ljava/lang/CharSequence;C)Z

    .line 155
    .line 156
    .line 157
    move-result v10

    .line 158
    if-nez v10, :cond_5

    .line 159
    .line 160
    new-array v10, v13, [C

    .line 161
    .line 162
    aput-char v11, v10, v5

    .line 163
    .line 164
    const/4 v11, 0x6

    .line 165
    invoke-static {v8, v10, v11}, Log/m;->F0(Ljava/lang/CharSequence;[CI)Ljava/util/List;

    .line 166
    .line 167
    .line 168
    move-result-object v14

    .line 169
    invoke-interface {v14}, Ljava/util/Collection;->isEmpty()Z

    .line 170
    .line 171
    .line 172
    move-result v10

    .line 173
    if-eqz v10, :cond_1

    .line 174
    .line 175
    goto :goto_1

    .line 176
    :cond_1
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 177
    .line 178
    .line 179
    move-result-object v10

    .line 180
    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 181
    .line 182
    .line 183
    move-result v11

    .line 184
    if-eqz v11, :cond_3

    .line 185
    .line 186
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v11

    .line 190
    check-cast v11, Ljava/lang/String;

    .line 191
    .line 192
    invoke-static {v11}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 193
    .line 194
    .line 195
    move-result v12

    .line 196
    if-nez v12, :cond_2

    .line 197
    .line 198
    invoke-virtual {v11, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result v12

    .line 202
    if-nez v12, :cond_2

    .line 203
    .line 204
    invoke-virtual {v11, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    move-result v11

    .line 208
    if-nez v11, :cond_2

    .line 209
    .line 210
    goto :goto_0

    .line 211
    :cond_2
    const-string v0, "\u8def\u5f84\u5305\u542b\u4e0d\u5141\u8bb8\u7684\u7247\u6bb5"

    .line 212
    .line 213
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    return-object v2

    .line 217
    :cond_3
    :goto_1
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 218
    .line 219
    .line 220
    move-result v4

    .line 221
    const/16 v8, 0xf0

    .line 222
    .line 223
    if-gt v4, v8, :cond_4

    .line 224
    .line 225
    const/16 v18, 0x0

    .line 226
    .line 227
    const/16 v19, 0x3e

    .line 228
    .line 229
    const-string v15, "/"

    .line 230
    .line 231
    const/16 v16, 0x0

    .line 232
    .line 233
    const/16 v17, 0x0

    .line 234
    .line 235
    invoke-static/range {v14 .. v19}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v4

    .line 239
    goto :goto_3

    .line 240
    :cond_4
    const-string v0, "\u8def\u5f84\u8fc7\u957f"

    .line 241
    .line 242
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    return-object v2

    .line 246
    :cond_5
    const-string v0, "\u5fc5\u987b\u4f7f\u7528\u63d2\u4ef6\u76ee\u5f55\u5185\u7684\u76f8\u5bf9\u8def\u5f84"

    .line 247
    .line 248
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    return-object v2

    .line 252
    :cond_6
    :goto_2
    move-object v4, v7

    .line 253
    :goto_3
    invoke-virtual {v4, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    move-result v7

    .line 257
    if-eqz v7, :cond_7

    .line 258
    .line 259
    move-object v7, v9

    .line 260
    goto :goto_4

    .line 261
    :cond_7
    new-instance v7, Ljava/io/File;

    .line 262
    .line 263
    invoke-direct {v7, v9, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {v7}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;

    .line 267
    .line 268
    .line 269
    move-result-object v7

    .line 270
    :goto_4
    invoke-virtual {v7}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    .line 271
    .line 272
    .line 273
    move-result-object v12

    .line 274
    invoke-virtual {v7, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 275
    .line 276
    .line 277
    move-result v7

    .line 278
    if-eqz v7, :cond_25

    .line 279
    .line 280
    invoke-static {v12, v9}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    move-result v7

    .line 284
    if-nez v7, :cond_8

    .line 285
    .line 286
    invoke-virtual {v12}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v7

    .line 290
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 291
    .line 292
    .line 293
    invoke-virtual {v9}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v8

    .line 297
    sget-object v10, Ljava/io/File;->separator:Ljava/lang/String;

    .line 298
    .line 299
    new-instance v11, Ljava/lang/StringBuilder;

    .line 300
    .line 301
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 305
    .line 306
    .line 307
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 308
    .line 309
    .line 310
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v8

    .line 314
    invoke-static {v7, v8, v5}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 315
    .line 316
    .line 317
    move-result v7

    .line 318
    if-eqz v7, :cond_25

    .line 319
    .line 320
    :cond_8
    const-string v2, "recursive"

    .line 321
    .line 322
    invoke-virtual {v0, v2, v13}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 323
    .line 324
    .line 325
    move-result v11

    .line 326
    const-string v2, "repair"

    .line 327
    .line 328
    invoke-virtual {v0, v2, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 329
    .line 330
    .line 331
    move-result v0

    .line 332
    if-eqz v0, :cond_c

    .line 333
    .line 334
    invoke-static {v1}, Lfb/t2;->N(Ljava/io/File;)V

    .line 335
    .line 336
    .line 337
    invoke-virtual {v9}, Ljava/io/File;->exists()Z

    .line 338
    .line 339
    .line 340
    move-result v2

    .line 341
    if-eqz v2, :cond_9

    .line 342
    .line 343
    invoke-static {v9}, Lfb/t2;->O(Ljava/io/File;)V

    .line 344
    .line 345
    .line 346
    goto :goto_8

    .line 347
    :cond_9
    invoke-virtual {v12}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 348
    .line 349
    .line 350
    move-result-object v2

    .line 351
    new-instance v7, Ljava/util/ArrayList;

    .line 352
    .line 353
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 354
    .line 355
    .line 356
    :goto_5
    if-eqz v2, :cond_b

    .line 357
    .line 358
    invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v8

    .line 362
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 363
    .line 364
    .line 365
    invoke-virtual {v9}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object v10

    .line 369
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 370
    .line 371
    .line 372
    invoke-static {v8, v10, v5}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 373
    .line 374
    .line 375
    move-result v8

    .line 376
    if-eqz v8, :cond_b

    .line 377
    .line 378
    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 379
    .line 380
    .line 381
    invoke-virtual {v2, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 382
    .line 383
    .line 384
    move-result v8

    .line 385
    if-eqz v8, :cond_a

    .line 386
    .line 387
    goto :goto_6

    .line 388
    :cond_a
    invoke-virtual {v2}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 389
    .line 390
    .line 391
    move-result-object v2

    .line 392
    goto :goto_5

    .line 393
    :cond_b
    :goto_6
    new-instance v2, Ltf/a0;

    .line 394
    .line 395
    invoke-direct {v2, v7}, Ltf/a0;-><init>(Ljava/util/ArrayList;)V

    .line 396
    .line 397
    .line 398
    invoke-virtual {v2}, Ltf/a0;->iterator()Ljava/util/Iterator;

    .line 399
    .line 400
    .line 401
    move-result-object v2

    .line 402
    :goto_7
    move-object v7, v2

    .line 403
    check-cast v7, Ltf/z;

    .line 404
    .line 405
    iget-object v7, v7, Ltf/z;->h:Ljava/lang/Object;

    .line 406
    .line 407
    check-cast v7, Ljava/util/ListIterator;

    .line 408
    .line 409
    invoke-interface {v7}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 410
    .line 411
    .line 412
    move-result v8

    .line 413
    if-eqz v8, :cond_c

    .line 414
    .line 415
    invoke-interface {v7}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    move-result-object v7

    .line 419
    check-cast v7, Ljava/io/File;

    .line 420
    .line 421
    invoke-static {v7}, Lfb/t2;->N(Ljava/io/File;)V

    .line 422
    .line 423
    .line 424
    goto :goto_7

    .line 425
    :cond_c
    :goto_8
    new-instance v7, Ljava/util/ArrayList;

    .line 426
    .line 427
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 428
    .line 429
    .line 430
    new-instance v10, Ljava/util/ArrayList;

    .line 431
    .line 432
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 433
    .line 434
    .line 435
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 436
    .line 437
    .line 438
    new-instance v8, Lgg/q;

    .line 439
    .line 440
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 441
    .line 442
    .line 443
    invoke-static/range {v7 .. v12}, Lfb/t2;->k(Ljava/util/ArrayList;Lgg/q;Ljava/io/File;Ljava/util/ArrayList;ZLjava/io/File;)V

    .line 444
    .line 445
    .line 446
    iget-boolean v2, v8, Lgg/q;->g:Z

    .line 447
    .line 448
    invoke-static {v1}, Lfb/t2;->H(Ljava/io/File;)Lfb/o2;

    .line 449
    .line 450
    .line 451
    move-result-object v1

    .line 452
    invoke-static {v9}, Lfb/t2;->I(Ljava/io/File;)Lfb/r2;

    .line 453
    .line 454
    .line 455
    move-result-object v8

    .line 456
    iget-boolean v9, v1, Lfb/o2;->a:Z

    .line 457
    .line 458
    if-nez v2, :cond_10

    .line 459
    .line 460
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 461
    .line 462
    .line 463
    move-result v11

    .line 464
    if-eqz v11, :cond_d

    .line 465
    .line 466
    goto :goto_a

    .line 467
    :cond_d
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 468
    .line 469
    .line 470
    move-result-object v11

    .line 471
    :cond_e
    :goto_9
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 472
    .line 473
    .line 474
    move-result v12

    .line 475
    if-eqz v12, :cond_f

    .line 476
    .line 477
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 478
    .line 479
    .line 480
    move-result-object v12

    .line 481
    check-cast v12, Lfb/m2;

    .line 482
    .line 483
    iget-boolean v14, v12, Lfb/m2;->b:Z

    .line 484
    .line 485
    if-eqz v14, :cond_e

    .line 486
    .line 487
    iget-boolean v12, v12, Lfb/m2;->j:Z

    .line 488
    .line 489
    if-eqz v12, :cond_10

    .line 490
    .line 491
    goto :goto_9

    .line 492
    :cond_f
    :goto_a
    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    .line 493
    .line 494
    .line 495
    move-result v11

    .line 496
    if-eqz v11, :cond_10

    .line 497
    .line 498
    move v11, v13

    .line 499
    goto :goto_b

    .line 500
    :cond_10
    move v11, v5

    .line 501
    :goto_b
    if-nez v2, :cond_14

    .line 502
    .line 503
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 504
    .line 505
    .line 506
    move-result v12

    .line 507
    if-eqz v12, :cond_11

    .line 508
    .line 509
    goto :goto_c

    .line 510
    :cond_11
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 511
    .line 512
    .line 513
    move-result-object v12

    .line 514
    :cond_12
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 515
    .line 516
    .line 517
    move-result v14

    .line 518
    if-eqz v14, :cond_13

    .line 519
    .line 520
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 521
    .line 522
    .line 523
    move-result-object v14

    .line 524
    check-cast v14, Lfb/m2;

    .line 525
    .line 526
    iget-boolean v14, v14, Lfb/m2;->k:Z

    .line 527
    .line 528
    if-nez v14, :cond_12

    .line 529
    .line 530
    goto :goto_d

    .line 531
    :cond_13
    :goto_c
    move v12, v13

    .line 532
    goto :goto_e

    .line 533
    :cond_14
    :goto_d
    move v12, v5

    .line 534
    :goto_e
    if-eqz v9, :cond_15

    .line 535
    .line 536
    iget-boolean v14, v8, Lfb/r2;->a:Z

    .line 537
    .line 538
    if-eqz v14, :cond_15

    .line 539
    .line 540
    move v5, v13

    .line 541
    :cond_15
    new-instance v14, Ljava/util/ArrayList;

    .line 542
    .line 543
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 544
    .line 545
    .line 546
    invoke-virtual {v14, v10}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 547
    .line 548
    .line 549
    new-instance v10, Ljava/util/ArrayList;

    .line 550
    .line 551
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 552
    .line 553
    .line 554
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 555
    .line 556
    .line 557
    move-result-object v15

    .line 558
    :goto_f
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    .line 559
    .line 560
    .line 561
    move-result v16

    .line 562
    if-eqz v16, :cond_17

    .line 563
    .line 564
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 565
    .line 566
    .line 567
    move-result-object v13

    .line 568
    move-object/from16 p1, v7

    .line 569
    .line 570
    move-object v7, v13

    .line 571
    check-cast v7, Lfb/m2;

    .line 572
    .line 573
    move-object/from16 p2, v15

    .line 574
    .line 575
    iget-boolean v15, v7, Lfb/m2;->b:Z

    .line 576
    .line 577
    if-eqz v15, :cond_16

    .line 578
    .line 579
    iget-boolean v7, v7, Lfb/m2;->j:Z

    .line 580
    .line 581
    if-nez v7, :cond_16

    .line 582
    .line 583
    invoke-virtual {v10, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 584
    .line 585
    .line 586
    :cond_16
    move-object/from16 v7, p1

    .line 587
    .line 588
    move-object/from16 v15, p2

    .line 589
    .line 590
    const/4 v13, 0x1

    .line 591
    goto :goto_f

    .line 592
    :cond_17
    move-object/from16 p1, v7

    .line 593
    .line 594
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 595
    .line 596
    .line 597
    move-result-object v7

    .line 598
    :goto_10
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 599
    .line 600
    .line 601
    move-result v10

    .line 602
    if-eqz v10, :cond_18

    .line 603
    .line 604
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 605
    .line 606
    .line 607
    move-result-object v10

    .line 608
    check-cast v10, Lfb/m2;

    .line 609
    .line 610
    iget-object v10, v10, Lfb/m2;->a:Ljava/lang/String;

    .line 611
    .line 612
    const-string v13, " \u5f53\u524d\u4e0d\u53ef\u8bfb"

    .line 613
    .line 614
    invoke-virtual {v10, v13}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 615
    .line 616
    .line 617
    move-result-object v10

    .line 618
    invoke-virtual {v14, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 619
    .line 620
    .line 621
    goto :goto_10

    .line 622
    :cond_18
    new-instance v7, Ljava/util/ArrayList;

    .line 623
    .line 624
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 625
    .line 626
    .line 627
    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 628
    .line 629
    .line 630
    move-result-object v10

    .line 631
    :cond_19
    :goto_11
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 632
    .line 633
    .line 634
    move-result v13

    .line 635
    if-eqz v13, :cond_1a

    .line 636
    .line 637
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 638
    .line 639
    .line 640
    move-result-object v13

    .line 641
    move-object v15, v13

    .line 642
    check-cast v15, Lfb/m2;

    .line 643
    .line 644
    iget-boolean v15, v15, Lfb/m2;->k:Z

    .line 645
    .line 646
    if-nez v15, :cond_19

    .line 647
    .line 648
    invoke-virtual {v7, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 649
    .line 650
    .line 651
    goto :goto_11

    .line 652
    :cond_1a
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 653
    .line 654
    .line 655
    move-result-object v7

    .line 656
    :goto_12
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 657
    .line 658
    .line 659
    move-result v10

    .line 660
    if-eqz v10, :cond_1b

    .line 661
    .line 662
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 663
    .line 664
    .line 665
    move-result-object v10

    .line 666
    check-cast v10, Lfb/m2;

    .line 667
    .line 668
    iget-object v10, v10, Lfb/m2;->a:Ljava/lang/String;

    .line 669
    .line 670
    const-string v13, " \u5f53\u524d\u4e0d\u53ef\u4fee\u6539\u6216\u66ff\u6362"

    .line 671
    .line 672
    invoke-virtual {v10, v13}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 673
    .line 674
    .line 675
    move-result-object v10

    .line 676
    invoke-virtual {v14, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 677
    .line 678
    .line 679
    goto :goto_12

    .line 680
    :cond_1b
    if-eqz v2, :cond_1c

    .line 681
    .line 682
    const-string v7, "\u6743\u9650\u68c0\u67e5\u7ed3\u679c\u8d85\u8fc7 500 \u9879\uff0c\u8bf7\u7f29\u5c0f path \u540e\u7ee7\u7eed\u68c0\u67e5"

    .line 683
    .line 684
    invoke-virtual {v14, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 685
    .line 686
    .line 687
    :cond_1c
    if-nez v9, :cond_1d

    .line 688
    .line 689
    iget-object v1, v1, Lfb/o2;->b:Ljava/lang/String;

    .line 690
    .line 691
    const-string v7, "\u811a\u672c\u63d2\u4ef6\u6839\u76ee\u5f55\u4e0d\u53ef\u5199\uff0c\u65e0\u6cd5\u63d0\u4ea4\u63d2\u4ef6\u76ee\u5f55\uff1a"

    .line 692
    .line 693
    invoke-virtual {v7, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 694
    .line 695
    .line 696
    move-result-object v1

    .line 697
    invoke-virtual {v14, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 698
    .line 699
    .line 700
    :cond_1d
    iget-object v1, v8, Lfb/r2;->b:Ljava/lang/Object;

    .line 701
    .line 702
    new-instance v7, Ljava/util/ArrayList;

    .line 703
    .line 704
    invoke-static {v1}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 705
    .line 706
    .line 707
    move-result v8

    .line 708
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 709
    .line 710
    .line 711
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 712
    .line 713
    .line 714
    move-result-object v1

    .line 715
    :goto_13
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 716
    .line 717
    .line 718
    move-result v8

    .line 719
    if-eqz v8, :cond_1e

    .line 720
    .line 721
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 722
    .line 723
    .line 724
    move-result-object v8

    .line 725
    check-cast v8, Ljava/lang/String;

    .line 726
    .line 727
    new-instance v10, Ljava/lang/StringBuilder;

    .line 728
    .line 729
    const-string v13, "\u63d2\u4ef6\u76ee\u5f55\u65e0\u6cd5\u5b89\u5168\u66ff\u6362\uff1a"

    .line 730
    .line 731
    invoke-direct {v10, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 732
    .line 733
    .line 734
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 735
    .line 736
    .line 737
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 738
    .line 739
    .line 740
    move-result-object v8

    .line 741
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 742
    .line 743
    .line 744
    goto :goto_13

    .line 745
    :cond_1e
    invoke-virtual {v14, v7}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 746
    .line 747
    .line 748
    invoke-static {v14}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 749
    .line 750
    .line 751
    move-result-object v1

    .line 752
    invoke-static {v1}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 753
    .line 754
    .line 755
    move-result-object v1

    .line 756
    new-instance v7, Lorg/json/JSONObject;

    .line 757
    .line 758
    invoke-direct {v7}, Lorg/json/JSONObject;-><init>()V

    .line 759
    .line 760
    .line 761
    const-string v8, "ok"

    .line 762
    .line 763
    const/4 v10, 0x1

    .line 764
    invoke-virtual {v7, v8, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 765
    .line 766
    .line 767
    const-string v8, "pluginId"

    .line 768
    .line 769
    invoke-virtual {v7, v8, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 770
    .line 771
    .line 772
    invoke-virtual {v7, v6, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 773
    .line 774
    .line 775
    const-string v3, "repairAttempted"

    .line 776
    .line 777
    invoke-virtual {v7, v3, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 778
    .line 779
    .line 780
    const-string v3, "appUid"

    .line 781
    .line 782
    invoke-static {}, Landroid/os/Process;->myUid()I

    .line 783
    .line 784
    .line 785
    move-result v4

    .line 786
    invoke-virtual {v7, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 787
    .line 788
    .line 789
    const-string v3, "scriptRootWritable"

    .line 790
    .line 791
    invoke-virtual {v7, v3, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 792
    .line 793
    .line 794
    const-string v3, "canRead"

    .line 795
    .line 796
    invoke-virtual {v7, v3, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 797
    .line 798
    .line 799
    const-string v3, "canModify"

    .line 800
    .line 801
    invoke-virtual {v7, v3, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 802
    .line 803
    .line 804
    const-string v3, "canCommitPlugin"

    .line 805
    .line 806
    invoke-virtual {v7, v3, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 807
    .line 808
    .line 809
    new-instance v3, Lorg/json/JSONArray;

    .line 810
    .line 811
    invoke-direct {v3, v1}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 812
    .line 813
    .line 814
    const-string v4, "issues"

    .line 815
    .line 816
    invoke-virtual {v7, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 817
    .line 818
    .line 819
    new-instance v3, Lorg/json/JSONArray;

    .line 820
    .line 821
    invoke-direct {v3}, Lorg/json/JSONArray;-><init>()V

    .line 822
    .line 823
    .line 824
    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 825
    .line 826
    .line 827
    move-result-object v4

    .line 828
    :goto_14
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 829
    .line 830
    .line 831
    move-result v5

    .line 832
    if-eqz v5, :cond_22

    .line 833
    .line 834
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 835
    .line 836
    .line 837
    move-result-object v5

    .line 838
    check-cast v5, Lfb/m2;

    .line 839
    .line 840
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 841
    .line 842
    .line 843
    new-instance v8, Lorg/json/JSONObject;

    .line 844
    .line 845
    invoke-direct {v8}, Lorg/json/JSONObject;-><init>()V

    .line 846
    .line 847
    .line 848
    iget-object v9, v5, Lfb/m2;->a:Ljava/lang/String;

    .line 849
    .line 850
    invoke-virtual {v8, v6, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 851
    .line 852
    .line 853
    const-string v9, "exists"

    .line 854
    .line 855
    iget-boolean v10, v5, Lfb/m2;->b:Z

    .line 856
    .line 857
    invoke-virtual {v8, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 858
    .line 859
    .line 860
    const-string v9, "type"

    .line 861
    .line 862
    iget-object v10, v5, Lfb/m2;->c:Ljava/lang/String;

    .line 863
    .line 864
    invoke-virtual {v8, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 865
    .line 866
    .line 867
    const-string v9, "readable"

    .line 868
    .line 869
    iget-boolean v10, v5, Lfb/m2;->d:Z

    .line 870
    .line 871
    invoke-virtual {v8, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 872
    .line 873
    .line 874
    const-string v9, "writable"

    .line 875
    .line 876
    iget-boolean v10, v5, Lfb/m2;->e:Z

    .line 877
    .line 878
    invoke-virtual {v8, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 879
    .line 880
    .line 881
    const-string v9, "executable"

    .line 882
    .line 883
    iget-boolean v10, v5, Lfb/m2;->f:Z

    .line 884
    .line 885
    invoke-virtual {v8, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 886
    .line 887
    .line 888
    const-string v9, "symbolicLink"

    .line 889
    .line 890
    iget-boolean v10, v5, Lfb/m2;->g:Z

    .line 891
    .line 892
    invoke-virtual {v8, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 893
    .line 894
    .line 895
    const-string v9, "parentWritable"

    .line 896
    .line 897
    iget-boolean v10, v5, Lfb/m2;->h:Z

    .line 898
    .line 899
    invoke-virtual {v8, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 900
    .line 901
    .line 902
    const-string v9, "replaceable"

    .line 903
    .line 904
    iget-boolean v10, v5, Lfb/m2;->i:Z

    .line 905
    .line 906
    invoke-virtual {v8, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 907
    .line 908
    .line 909
    const-string v9, "workspaceReadable"

    .line 910
    .line 911
    iget-boolean v10, v5, Lfb/m2;->j:Z

    .line 912
    .line 913
    invoke-virtual {v8, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 914
    .line 915
    .line 916
    const-string v9, "modifiable"

    .line 917
    .line 918
    iget-boolean v10, v5, Lfb/m2;->k:Z

    .line 919
    .line 920
    invoke-virtual {v8, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 921
    .line 922
    .line 923
    iget-object v9, v5, Lfb/m2;->l:Ljava/lang/String;

    .line 924
    .line 925
    invoke-static {v9}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 926
    .line 927
    .line 928
    move-result v10

    .line 929
    if-nez v10, :cond_1f

    .line 930
    .line 931
    const-string v10, "mode"

    .line 932
    .line 933
    invoke-virtual {v8, v10, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 934
    .line 935
    .line 936
    :cond_1f
    iget-object v9, v5, Lfb/m2;->m:Ljava/lang/Integer;

    .line 937
    .line 938
    if-eqz v9, :cond_20

    .line 939
    .line 940
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 941
    .line 942
    .line 943
    move-result v9

    .line 944
    const-string v10, "ownerUid"

    .line 945
    .line 946
    invoke-virtual {v8, v10, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 947
    .line 948
    .line 949
    :cond_20
    iget-object v5, v5, Lfb/m2;->n:Ljava/lang/Integer;

    .line 950
    .line 951
    if-eqz v5, :cond_21

    .line 952
    .line 953
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 954
    .line 955
    .line 956
    move-result v5

    .line 957
    const-string v9, "ownerGid"

    .line 958
    .line 959
    invoke-virtual {v8, v9, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 960
    .line 961
    .line 962
    :cond_21
    invoke-virtual {v3, v8}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 963
    .line 964
    .line 965
    goto/16 :goto_14

    .line 966
    .line 967
    :cond_22
    const-string v4, "items"

    .line 968
    .line 969
    invoke-virtual {v7, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 970
    .line 971
    .line 972
    const-string v3, "truncated"

    .line 973
    .line 974
    invoke-virtual {v7, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 975
    .line 976
    .line 977
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 978
    .line 979
    .line 980
    move-result v1

    .line 981
    if-eqz v1, :cond_23

    .line 982
    .line 983
    const-string v0, "\u5f53\u524d\u8def\u5f84\u53ef\u7531\u63d2\u4ef6 Agent \u8bfb\u53d6\u548c\u4fee\u6539"

    .line 984
    .line 985
    goto :goto_15

    .line 986
    :cond_23
    if-nez v0, :cond_24

    .line 987
    .line 988
    const-string v0, "\u8bf7\u518d\u6b21\u8c03\u7528 check_access \u5e76\u8bbe\u7f6e repair=true"

    .line 989
    .line 990
    goto :goto_15

    .line 991
    :cond_24
    const-string v0, "\u5f53\u524d\u5fae\u4fe1\u8fdb\u7a0b\u65e0\u6cd5\u4fee\u590d\u8fd9\u4e9b\u6743\u9650\uff0c\u8bf7\u7528\u7cfb\u7edf\u6587\u4ef6\u7ba1\u7406\u5668\u91cd\u65b0\u590d\u5236\u8be5\u63d2\u4ef6\u76ee\u5f55\u540e\u518d\u8bd5"

    .line 992
    .line 993
    :goto_15
    const-string v1, "recommendation"

    .line 994
    .line 995
    invoke-virtual {v7, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 996
    .line 997
    .line 998
    invoke-virtual {v7}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 999
    .line 1000
    .line 1001
    move-result-object v0

    .line 1002
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1003
    .line 1004
    .line 1005
    return-object v0

    .line 1006
    :cond_25
    const-string v0, "\u68c0\u67e5\u8def\u5f84\u8d85\u51fa\u63d2\u4ef6\u76ee\u5f55\u6216\u4f7f\u7528\u4e86\u7b26\u53f7\u94fe\u63a5"

    .line 1007
    .line 1008
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 1009
    .line 1010
    .line 1011
    return-object v2

    .line 1012
    :cond_26
    const-string v0, "\u63d2\u4ef6\u76ee\u5f55\u4e0d\u5728\u811a\u672c\u6839\u76ee\u5f55\u5185\u6216\u4f7f\u7528\u4e86\u7b26\u53f7\u94fe\u63a5"

    .line 1013
    .line 1014
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 1015
    .line 1016
    .line 1017
    return-object v2

    .line 1018
    :cond_27
    const-string v0, "plugin_id \u5305\u542b\u4e0d\u5141\u8bb8\u7684\u8def\u5f84\u5b57\u7b26"

    .line 1019
    .line 1020
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 1021
    .line 1022
    .line 1023
    return-object v2

    .line 1024
    :cond_28
    const-string v0, "plugin_id \u4e0d\u80fd\u4e3a\u7a7a"

    .line 1025
    .line 1026
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 1027
    .line 1028
    .line 1029
    return-object v2

    .line 1030
    :cond_29
    const-string v0, "\u4e0d\u662f\u5de5\u4f5c\u533a\u9884\u68c0\u5de5\u5177: "

    .line 1031
    .line 1032
    move-object/from16 v1, p1

    .line 1033
    .line 1034
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1035
    .line 1036
    .line 1037
    move-result-object v0

    .line 1038
    invoke-static {v0}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 1039
    .line 1040
    .line 1041
    return-object v2
.end method

.method public static g(Landroid/content/Context;Lfb/i2;)Ljava/io/File;
    .locals 1

    .line 1
    invoke-static {p0}, Lfb/t2;->c0(Landroid/content/Context;)Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    new-instance v0, Ljava/io/File;

    .line 10
    .line 11
    iget-object p1, p1, Lfb/i2;->c:Ljava/lang/String;

    .line 12
    .line 13
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {v0, p0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    if-eqz p0, :cond_0

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-eqz p0, :cond_0

    .line 35
    .line 36
    return-object p1

    .line 37
    :cond_0
    const-string p0, "\u63d2\u4ef6\u6682\u5b58\u5de5\u4f5c\u533a\u65e0\u6548\u6216\u5df2\u5931\u6548"

    .line 38
    .line 39
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const/4 p0, 0x0

    .line 43
    return-object p0
.end method

.method public static final h(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    .line 1
    const-string v0, "."

    .line 2
    .line 3
    invoke-static {p0, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    invoke-static {p1, p0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    new-instance v0, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string p0, "/"

    .line 24
    .line 25
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    const/4 v0, 0x0

    .line 33
    invoke-static {p1, p0, v0}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-eqz p0, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    return v0

    .line 41
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 42
    return p0
.end method

.method public static i(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;
    .locals 1

    .line 1
    invoke-static {p0}, Lfb/t2;->c0(Landroid/content/Context;)Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    new-instance v0, Ljava/io/File;

    .line 10
    .line 11
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-static {p1, p0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    if-eqz p0, :cond_0

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    if-eqz p0, :cond_0

    .line 43
    .line 44
    return-object v0

    .line 45
    :cond_0
    const-string p0, "\u63d2\u4ef6\u6682\u5b58\u5de5\u4f5c\u533a\u65e0\u6548\u6216\u5df2\u5931\u6548"

    .line 46
    .line 47
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const/4 p0, 0x0

    .line 51
    return-object p0
.end method

.method public static j(Landroid/content/Context;)V
    .locals 8

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/32 v2, 0x5265c00

    .line 6
    .line 7
    .line 8
    sub-long/2addr v0, v2

    .line 9
    invoke-static {p0}, Lfb/t2;->c0(Landroid/content/Context;)Ljava/io/File;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    if-eqz p0, :cond_2

    .line 18
    .line 19
    new-instance v2, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    array-length v3, p0

    .line 25
    const/4 v4, 0x0

    .line 26
    :goto_0
    if-ge v4, v3, :cond_1

    .line 27
    .line 28
    aget-object v5, p0, v4

    .line 29
    .line 30
    invoke-virtual {v5}, Ljava/io/File;->isDirectory()Z

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    if-eqz v6, :cond_0

    .line 35
    .line 36
    invoke-virtual {v5}, Ljava/io/File;->lastModified()J

    .line 37
    .line 38
    .line 39
    move-result-wide v6

    .line 40
    cmp-long v6, v6, v0

    .line 41
    .line 42
    if-gez v6, :cond_0

    .line 43
    .line 44
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    :catchall_0
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_2

    .line 59
    .line 60
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    check-cast v0, Ljava/io/File;

    .line 65
    .line 66
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    invoke-static {v0}, Lfb/t2;->p(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_2
    return-void
.end method

.method public static final k(Ljava/util/ArrayList;Lgg/q;Ljava/io/File;Ljava/util/ArrayList;ZLjava/io/File;)V
    .locals 22

    .line 1
    move-object/from16 v2, p1

    .line 2
    .line 3
    move-object/from16 v3, p2

    .line 4
    .line 5
    move-object/from16 v4, p3

    .line 6
    .line 7
    move-object/from16 v1, p5

    .line 8
    .line 9
    invoke-virtual/range {p0 .. p0}, Ljava/util/ArrayList;->size()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/16 v5, 0x1f4

    .line 14
    .line 15
    const/4 v6, 0x1

    .line 16
    if-lt v0, v5, :cond_0

    .line 17
    .line 18
    iput-boolean v6, v2, Lgg/q;->g:Z

    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 22
    .line 23
    .line 24
    move-result v9

    .line 25
    :try_start_0
    invoke-virtual {v1}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v1}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    invoke-static {v0, v5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    xor-int/2addr v0, v6

    .line 38
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 39
    .line 40
    .line 41
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    goto :goto_0

    .line 43
    :catchall_0
    move-exception v0

    .line 44
    new-instance v5, Lsf/f;

    .line 45
    .line 46
    invoke-direct {v5, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 47
    .line 48
    .line 49
    move-object v0, v5

    .line 50
    :goto_0
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 51
    .line 52
    instance-of v7, v0, Lsf/f;

    .line 53
    .line 54
    if-eqz v7, :cond_1

    .line 55
    .line 56
    move-object v0, v5

    .line 57
    :cond_1
    check-cast v0, Ljava/lang/Boolean;

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 60
    .line 61
    .line 62
    move-result v14

    .line 63
    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    invoke-virtual {v1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    if-eqz v0, :cond_3

    .line 72
    .line 73
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    .line 74
    .line 75
    .line 76
    move-result v8

    .line 77
    if-eqz v8, :cond_2

    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/io/File;->canWrite()Z

    .line 80
    .line 81
    .line 82
    move-result v8

    .line 83
    if-eqz v8, :cond_2

    .line 84
    .line 85
    invoke-virtual {v0}, Ljava/io/File;->canExecute()Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-eqz v0, :cond_2

    .line 90
    .line 91
    move v0, v6

    .line 92
    goto :goto_1

    .line 93
    :cond_2
    const/4 v0, 0x0

    .line 94
    :goto_1
    move v15, v0

    .line 95
    goto :goto_2

    .line 96
    :cond_3
    const/4 v15, 0x0

    .line 97
    :goto_2
    if-eqz v9, :cond_4

    .line 98
    .line 99
    invoke-virtual {v1}, Ljava/io/File;->canRead()Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-eqz v0, :cond_4

    .line 104
    .line 105
    move v11, v6

    .line 106
    goto :goto_3

    .line 107
    :cond_4
    const/4 v11, 0x0

    .line 108
    :goto_3
    if-eqz v9, :cond_5

    .line 109
    .line 110
    invoke-virtual {v1}, Ljava/io/File;->canWrite()Z

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    if-eqz v0, :cond_5

    .line 115
    .line 116
    move v12, v6

    .line 117
    goto :goto_4

    .line 118
    :cond_5
    const/4 v12, 0x0

    .line 119
    :goto_4
    if-eqz v9, :cond_6

    .line 120
    .line 121
    invoke-virtual {v1}, Ljava/io/File;->canExecute()Z

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    if-eqz v0, :cond_6

    .line 126
    .line 127
    move v13, v6

    .line 128
    goto :goto_5

    .line 129
    :cond_6
    const/4 v13, 0x0

    .line 130
    :goto_5
    if-eqz v14, :cond_8

    .line 131
    .line 132
    :cond_7
    const/16 v17, 0x0

    .line 133
    .line 134
    goto :goto_9

    .line 135
    :cond_8
    if-nez v9, :cond_9

    .line 136
    .line 137
    :goto_6
    move/from16 v17, v6

    .line 138
    .line 139
    goto :goto_9

    .line 140
    :cond_9
    if-eqz v5, :cond_b

    .line 141
    .line 142
    if-eqz v11, :cond_a

    .line 143
    .line 144
    if-eqz v13, :cond_a

    .line 145
    .line 146
    invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    if-eqz v0, :cond_a

    .line 151
    .line 152
    move v0, v6

    .line 153
    goto :goto_7

    .line 154
    :cond_a
    const/4 v0, 0x0

    .line 155
    :goto_7
    move/from16 v17, v0

    .line 156
    .line 157
    goto :goto_9

    .line 158
    :cond_b
    if-eqz v11, :cond_7

    .line 159
    .line 160
    :try_start_1
    new-instance v0, Ljava/io/FileInputStream;

    .line 161
    .line 162
    invoke-direct {v0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V

    .line 166
    .line 167
    .line 168
    sget-object v0, Lsf/n;->a:Lsf/n;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 169
    .line 170
    goto :goto_8

    .line 171
    :catchall_1
    move-exception v0

    .line 172
    new-instance v8, Lsf/f;

    .line 173
    .line 174
    invoke-direct {v8, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 175
    .line 176
    .line 177
    move-object v0, v8

    .line 178
    :goto_8
    instance-of v0, v0, Lsf/f;

    .line 179
    .line 180
    if-nez v0, :cond_7

    .line 181
    .line 182
    goto :goto_6

    .line 183
    :goto_9
    if-eqz v14, :cond_d

    .line 184
    .line 185
    :cond_c
    const/16 v18, 0x0

    .line 186
    .line 187
    goto :goto_b

    .line 188
    :cond_d
    if-nez v9, :cond_e

    .line 189
    .line 190
    move/from16 v18, v15

    .line 191
    .line 192
    goto :goto_b

    .line 193
    :cond_e
    if-eqz v5, :cond_10

    .line 194
    .line 195
    if-eqz v12, :cond_f

    .line 196
    .line 197
    if-eqz v13, :cond_f

    .line 198
    .line 199
    move v0, v6

    .line 200
    goto :goto_a

    .line 201
    :cond_f
    const/4 v0, 0x0

    .line 202
    :goto_a
    move/from16 v18, v0

    .line 203
    .line 204
    goto :goto_b

    .line 205
    :cond_10
    if-nez v12, :cond_11

    .line 206
    .line 207
    if-eqz v15, :cond_c

    .line 208
    .line 209
    :cond_11
    move/from16 v18, v6

    .line 210
    .line 211
    :goto_b
    :try_start_2
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    invoke-static {v0}, Landroid/system/Os;->stat(Ljava/lang/String;)Landroid/system/StructStat;

    .line 216
    .line 217
    .line 218
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 219
    goto :goto_c

    .line 220
    :catchall_2
    move-exception v0

    .line 221
    new-instance v8, Lsf/f;

    .line 222
    .line 223
    invoke-direct {v8, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 224
    .line 225
    .line 226
    move-object v0, v8

    .line 227
    :goto_c
    nop

    .line 228
    instance-of v8, v0, Lsf/f;

    .line 229
    .line 230
    if-eqz v8, :cond_12

    .line 231
    .line 232
    const/4 v0, 0x0

    .line 233
    :cond_12
    check-cast v0, Landroid/system/StructStat;

    .line 234
    .line 235
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    move-result v8

    .line 239
    if-eqz v8, :cond_13

    .line 240
    .line 241
    const-string v7, "."

    .line 242
    .line 243
    :goto_d
    move-object v8, v7

    .line 244
    goto :goto_e

    .line 245
    :cond_13
    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v8

    .line 249
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v3}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v10

    .line 256
    sget-object v6, Ljava/io/File;->separator:Ljava/lang/String;

    .line 257
    .line 258
    new-instance v7, Ljava/lang/StringBuilder;

    .line 259
    .line 260
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 267
    .line 268
    .line 269
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v6

    .line 273
    const/4 v7, 0x0

    .line 274
    invoke-static {v8, v6, v7}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 275
    .line 276
    .line 277
    move-result v6

    .line 278
    if-eqz v6, :cond_14

    .line 279
    .line 280
    invoke-static {v1, v3}, Ldg/l;->i0(Ljava/io/File;Ljava/io/File;)Ljava/io/File;

    .line 281
    .line 282
    .line 283
    move-result-object v6

    .line 284
    invoke-static {v6}, Ldg/l;->d0(Ljava/io/File;)Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v7

    .line 288
    goto :goto_d

    .line 289
    :cond_14
    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v7

    .line 293
    goto :goto_d

    .line 294
    :goto_e
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 295
    .line 296
    .line 297
    if-eqz v14, :cond_15

    .line 298
    .line 299
    const-string v5, "symbolic_link"

    .line 300
    .line 301
    :goto_f
    move-object v10, v5

    .line 302
    goto :goto_10

    .line 303
    :cond_15
    if-nez v9, :cond_16

    .line 304
    .line 305
    const-string v5, "missing"

    .line 306
    .line 307
    goto :goto_f

    .line 308
    :cond_16
    if-eqz v5, :cond_17

    .line 309
    .line 310
    const-string v5, "directory"

    .line 311
    .line 312
    goto :goto_f

    .line 313
    :cond_17
    invoke-virtual {v1}, Ljava/io/File;->isFile()Z

    .line 314
    .line 315
    .line 316
    move-result v5

    .line 317
    if-eqz v5, :cond_18

    .line 318
    .line 319
    const-string v5, "file"

    .line 320
    .line 321
    goto :goto_f

    .line 322
    :cond_18
    const-string v5, "other"

    .line 323
    .line 324
    goto :goto_f

    .line 325
    :goto_10
    if-eqz v0, :cond_19

    .line 326
    .line 327
    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 328
    .line 329
    iget v6, v0, Landroid/system/StructStat;->st_mode:I

    .line 330
    .line 331
    and-int/lit16 v6, v6, 0xfff

    .line 332
    .line 333
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 334
    .line 335
    .line 336
    move-result-object v6

    .line 337
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object v6

    .line 341
    const/4 v7, 0x1

    .line 342
    invoke-static {v6, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object v6

    .line 346
    const-string v7, "%04o"

    .line 347
    .line 348
    invoke-static {v5, v7, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object v5

    .line 352
    goto :goto_11

    .line 353
    :cond_19
    const/4 v5, 0x0

    .line 354
    :goto_11
    if-nez v5, :cond_1a

    .line 355
    .line 356
    const-string v5, ""

    .line 357
    .line 358
    :cond_1a
    move-object/from16 v19, v5

    .line 359
    .line 360
    if-eqz v0, :cond_1b

    .line 361
    .line 362
    iget v5, v0, Landroid/system/StructStat;->st_uid:I

    .line 363
    .line 364
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 365
    .line 366
    .line 367
    move-result-object v5

    .line 368
    move-object/from16 v20, v5

    .line 369
    .line 370
    goto :goto_12

    .line 371
    :cond_1b
    const/16 v20, 0x0

    .line 372
    .line 373
    :goto_12
    if-eqz v0, :cond_1c

    .line 374
    .line 375
    iget v0, v0, Landroid/system/StructStat;->st_gid:I

    .line 376
    .line 377
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 378
    .line 379
    .line 380
    move-result-object v0

    .line 381
    move-object/from16 v21, v0

    .line 382
    .line 383
    goto :goto_13

    .line 384
    :cond_1c
    const/16 v21, 0x0

    .line 385
    .line 386
    :goto_13
    new-instance v7, Lfb/m2;

    .line 387
    .line 388
    move/from16 v16, v15

    .line 389
    .line 390
    invoke-direct/range {v7 .. v21}, Lfb/m2;-><init>(Ljava/lang/String;ZLjava/lang/String;ZZZZZZZZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 391
    .line 392
    .line 393
    move-object/from16 v5, p0

    .line 394
    .line 395
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 396
    .line 397
    .line 398
    if-eqz v14, :cond_1d

    .line 399
    .line 400
    const-string v0, " \u662f\u4e0d\u652f\u6301\u7684\u7b26\u53f7\u94fe\u63a5"

    .line 401
    .line 402
    invoke-virtual {v8, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 403
    .line 404
    .line 405
    move-result-object v0

    .line 406
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 407
    .line 408
    .line 409
    return-void

    .line 410
    :cond_1d
    if-eqz p4, :cond_20

    .line 411
    .line 412
    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    .line 413
    .line 414
    .line 415
    move-result v0

    .line 416
    if-eqz v0, :cond_20

    .line 417
    .line 418
    iget-boolean v0, v2, Lgg/q;->g:Z

    .line 419
    .line 420
    if-eqz v0, :cond_1e

    .line 421
    .line 422
    goto :goto_15

    .line 423
    :cond_1e
    invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 424
    .line 425
    .line 426
    move-result-object v0

    .line 427
    if-nez v0, :cond_1f

    .line 428
    .line 429
    const-string v0, " \u65e0\u6cd5\u5217\u51fa\u76ee\u5f55\u5185\u5bb9"

    .line 430
    .line 431
    invoke-virtual {v8, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 436
    .line 437
    .line 438
    return-void

    .line 439
    :cond_1f
    new-instance v1, Lfb/r;

    .line 440
    .line 441
    const/16 v6, 0xb

    .line 442
    .line 443
    invoke-direct {v1, v6}, Lfb/r;-><init>(I)V

    .line 444
    .line 445
    .line 446
    invoke-static {v0, v1}, Ltf/l;->H0([Ljava/lang/Object;Ljava/util/Comparator;)Ljava/util/List;

    .line 447
    .line 448
    .line 449
    move-result-object v0

    .line 450
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 451
    .line 452
    .line 453
    move-result-object v0

    .line 454
    :goto_14
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 455
    .line 456
    .line 457
    move-result v1

    .line 458
    if-eqz v1, :cond_20

    .line 459
    .line 460
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object v1

    .line 464
    move-object v6, v1

    .line 465
    check-cast v6, Ljava/io/File;

    .line 466
    .line 467
    move-object v1, v5

    .line 468
    move/from16 v5, p4

    .line 469
    .line 470
    invoke-static/range {v1 .. v6}, Lfb/t2;->k(Ljava/util/ArrayList;Lgg/q;Ljava/io/File;Ljava/util/ArrayList;ZLjava/io/File;)V

    .line 471
    .line 472
    .line 473
    move-object/from16 v5, p0

    .line 474
    .line 475
    move-object/from16 v2, p1

    .line 476
    .line 477
    move-object/from16 v3, p2

    .line 478
    .line 479
    move-object/from16 v4, p3

    .line 480
    .line 481
    goto :goto_14

    .line 482
    :cond_20
    :goto_15
    return-void
.end method

.method public static l(Ljava/io/File;Ljava/io/File;)V
    .locals 2

    .line 1
    invoke-static {p0}, Lfb/t2;->S(Ljava/io/File;)Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lfb/t2;->a0(Ljava/util/Map;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :try_start_0
    invoke-static {p1}, Lfb/t2;->o(Ljava/io/File;)V

    .line 10
    .line 11
    .line 12
    invoke-static {p0, p1}, Lfb/t2;->n(Ljava/io/File;Ljava/io/File;)V

    .line 13
    .line 14
    .line 15
    invoke-static {p0}, Lfb/t2;->S(Ljava/io/File;)Ljava/util/Map;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-static {p0}, Lfb/t2;->a0(Ljava/util/Map;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-eqz p0, :cond_1

    .line 28
    .line 29
    invoke-static {p1}, Lfb/t2;->S(Ljava/io/File;)Ljava/util/Map;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-static {p0}, Lfb/t2;->a0(Ljava/util/Map;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-eqz p0, :cond_0

    .line 42
    .line 43
    invoke-static {p1}, Lfb/t2;->Z(Ljava/io/File;)Ljava/io/File;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-static {p0, v0}, Lfb/t2;->d0(Ljava/io/File;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :catchall_0
    move-exception p0

    .line 52
    goto :goto_0

    .line 53
    :cond_0
    const-string p0, "\u5907\u4efd\u76ee\u5f55\u5185\u5bb9\u4e0d\u5b8c\u6574"

    .line 54
    .line 55
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 56
    .line 57
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw v0

    .line 61
    :cond_1
    const-string p0, "\u6e90\u63d2\u4ef6\u76ee\u5f55\u5728\u5907\u4efd\u65f6\u53d1\u751f\u53d8\u5316"

    .line 62
    .line 63
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 64
    .line 65
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    :goto_0
    :try_start_1
    invoke-static {p1}, Lfb/t2;->o(Ljava/io/File;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 70
    .line 71
    .line 72
    :catchall_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 73
    .line 74
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    if-eqz v0, :cond_2

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    :goto_1
    const-string v1, "\u5907\u4efd\u539f\u63d2\u4ef6\u76ee\u5f55\u5931\u8d25\uff1a"

    .line 90
    .line 91
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-direct {p1, v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 96
    .line 97
    .line 98
    throw p1
.end method

.method public static m(Ljava/io/File;Ljava/io/File;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_3

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-static {p0, p1}, Lfb/t2;->n(Ljava/io/File;Ljava/io/File;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    invoke-virtual {p1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-nez v1, :cond_2

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    const-string p1, "\u521b\u5efa\u6062\u590d\u76ee\u5f55\u5931\u8d25: "

    .line 49
    .line 50
    invoke-static {p1, p0}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-static {p0}, Lah/a;->h(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_2
    :goto_0
    new-instance v0, Ljava/io/FileInputStream;

    .line 59
    .line 60
    invoke-direct {v0, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 61
    .line 62
    .line 63
    :try_start_0
    new-instance p0, Ljava/io/FileOutputStream;

    .line 64
    .line 65
    invoke-direct {p0, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    .line 67
    .line 68
    :try_start_1
    invoke-static {v0, p0}, Lg4/a;->j(Ljava/io/InputStream;Ljava/io/OutputStream;)J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 69
    .line 70
    .line 71
    :try_start_2
    invoke-virtual {p0}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :catchall_0
    move-exception p0

    .line 79
    goto :goto_1

    .line 80
    :catchall_1
    move-exception p1

    .line 81
    :try_start_3
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 82
    :catchall_2
    move-exception v1

    .line 83
    :try_start_4
    invoke-static {p0, p1}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 84
    .line 85
    .line 86
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 87
    :goto_1
    :try_start_5
    throw p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 88
    :catchall_3
    move-exception p1

    .line 89
    invoke-static {v0, p0}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 90
    .line 91
    .line 92
    throw p1

    .line 93
    :cond_3
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    const-string p1, "\u4e0d\u652f\u6301\u6062\u590d\u7b26\u53f7\u94fe\u63a5: "

    .line 98
    .line 99
    invoke-static {p1, p0}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    invoke-static {p0}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    return-void
.end method

.method public static n(Ljava/io/File;Ljava/io/File;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_6

    .line 6
    .line 7
    new-instance v0, Ldg/j;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    sget-object v2, Ldg/k;->g:Ldg/k;

    .line 11
    .line 12
    invoke-direct {v0, p0, v2, v1}, Ldg/j;-><init>(Ljava/io/File;Ldg/k;Lc9/x;)V

    .line 13
    .line 14
    .line 15
    new-instance v1, Ldg/h;

    .line 16
    .line 17
    invoke-direct {v1, v0}, Ldg/h;-><init>(Ldg/j;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    :goto_0
    invoke-virtual {v1}, Ltf/b;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_5

    .line 25
    .line 26
    invoke-virtual {v1}, Ltf/b;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Ljava/io/File;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {v0}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-static {v2, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-eqz v2, :cond_4

    .line 45
    .line 46
    invoke-static {v0, p0}, Ldg/l;->i0(Ljava/io/File;Ljava/io/File;)Ljava/io/File;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    new-instance v3, Ljava/io/File;

    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-direct {v3, p1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_2

    .line 64
    .line 65
    invoke-virtual {v3}, Ljava/io/File;->isDirectory()Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-nez v0, :cond_0

    .line 70
    .line 71
    invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-eqz v0, :cond_1

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_1
    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    const-string p1, "\u521b\u5efa\u76ee\u5f55\u5931\u8d25: "

    .line 83
    .line 84
    invoke-static {p1, p0}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-static {p0}, Lah/a;->h(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :cond_2
    invoke-virtual {v3}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    if-eqz v2, :cond_3

    .line 97
    .line 98
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    .line 99
    .line 100
    .line 101
    :cond_3
    new-instance v2, Ljava/io/FileInputStream;

    .line 102
    .line 103
    invoke-direct {v2, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 104
    .line 105
    .line 106
    :try_start_0
    new-instance v0, Ljava/io/FileOutputStream;

    .line 107
    .line 108
    invoke-direct {v0, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 109
    .line 110
    .line 111
    :try_start_1
    invoke-static {v2, v0}, Lg4/a;->j(Ljava/io/InputStream;Ljava/io/OutputStream;)J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 112
    .line 113
    .line 114
    :try_start_2
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V

    .line 118
    .line 119
    .line 120
    goto :goto_0

    .line 121
    :catchall_0
    move-exception p0

    .line 122
    goto :goto_1

    .line 123
    :catchall_1
    move-exception p0

    .line 124
    :try_start_3
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 125
    :catchall_2
    move-exception p1

    .line 126
    :try_start_4
    invoke-static {v0, p0}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 127
    .line 128
    .line 129
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 130
    :goto_1
    :try_start_5
    throw p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 131
    :catchall_3
    move-exception p1

    .line 132
    invoke-static {v2, p0}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 133
    .line 134
    .line 135
    throw p1

    .line 136
    :cond_4
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    const-string p1, "\u4e0d\u652f\u6301\u7b26\u53f7\u94fe\u63a5: "

    .line 141
    .line 142
    invoke-static {p1, p0}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    invoke-static {p0}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    return-void

    .line 150
    :cond_5
    invoke-static {p1}, Lfb/t2;->s(Ljava/io/File;)V

    .line 151
    .line 152
    .line 153
    return-void

    .line 154
    :cond_6
    invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    const-string p1, "\u6e90\u76ee\u5f55\u4e0d\u5b58\u5728: "

    .line 159
    .line 160
    invoke-static {p1, p0}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    invoke-static {p0}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    return-void
.end method

.method public static o(Ljava/io/File;)V
    .locals 2

    .line 1
    invoke-static {p0}, Lfb/t2;->q(Ljava/io/File;)V

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Lfb/t2;->Z(Ljava/io/File;)Ljava/io/File;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-static {p0}, Lfb/t2;->X(Ljava/io/File;)Ljava/io/File;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    filled-new-array {v0, p0}, [Ljava/io/File;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-static {p0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Ljava/io/File;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_0

    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    const-string v0, "\u5220\u9664\u4e8b\u52a1\u6807\u8bb0\u5931\u8d25: "

    .line 54
    .line 55
    invoke-static {v0, p0}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-static {p0}, Lah/a;->h(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    :cond_2
    return-void
.end method

.method public static p(Ljava/io/File;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    array-length v1, v0

    .line 28
    const/4 v2, 0x0

    .line 29
    :goto_0
    if-ge v2, v1, :cond_0

    .line 30
    .line 31
    aget-object v3, v0, v2

    .line 32
    .line 33
    invoke-static {v3}, Lfb/t2;->p(Ljava/io/File;)V

    .line 34
    .line 35
    .line 36
    add-int/lit8 v2, v2, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    return-void

    .line 46
    :cond_1
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    const-string v0, "\u5220\u9664\u5931\u8d25: "

    .line 51
    .line 52
    invoke-static {v0, p0}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-static {p0}, Lah/a;->h(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_2
    const-string p0, "\u4e0d\u652f\u6301\u5220\u9664\u7b26\u53f7\u94fe\u63a5"

    .line 61
    .line 62
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public static q(Ljava/io/File;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, Lfb/t2;->p(Ljava/io/File;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public static final r(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Lfb/t2;->E(Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    sparse-switch v1, :sswitch_data_0

    .line 13
    .line 14
    .line 15
    goto/16 :goto_0

    .line 16
    .line 17
    :sswitch_0
    const-string v1, "create_directory"

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    goto/16 :goto_0

    .line 26
    .line 27
    :cond_0
    const-string p0, "\u521b\u5efa\u63d2\u4ef6\u76ee\u5f55"

    .line 28
    .line 29
    return-object p0

    .line 30
    :sswitch_1
    const-string v1, "restore_path"

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    goto/16 :goto_0

    .line 39
    .line 40
    :cond_1
    const-string p0, "\u6062\u590d\u63d2\u4ef6\u8def\u5f84"

    .line 41
    .line 42
    return-object p0

    .line 43
    :sswitch_2
    const-string v1, "move_path"

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-nez v0, :cond_2

    .line 50
    .line 51
    goto/16 :goto_0

    .line 52
    .line 53
    :cond_2
    const-string p0, "\u79fb\u52a8\u63d2\u4ef6\u8def\u5f84"

    .line 54
    .line 55
    return-object p0

    .line 56
    :sswitch_3
    const-string v1, "list_files"

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-nez v0, :cond_3

    .line 63
    .line 64
    goto/16 :goto_0

    .line 65
    .line 66
    :cond_3
    const-string p0, "\u5217\u51fa\u63d2\u4ef6\u6587\u4ef6"

    .line 67
    .line 68
    return-object p0

    .line 69
    :sswitch_4
    const-string v1, "search_files"

    .line 70
    .line 71
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-nez v0, :cond_4

    .line 76
    .line 77
    goto/16 :goto_0

    .line 78
    .line 79
    :cond_4
    const-string p0, "\u641c\u7d22\u63d2\u4ef6\u6587\u4ef6"

    .line 80
    .line 81
    return-object p0

    .line 82
    :sswitch_5
    const-string v1, "workspace_status"

    .line 83
    .line 84
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-nez v0, :cond_5

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_5
    const-string p0, "\u68c0\u67e5\u63d2\u4ef6\u53d8\u66f4"

    .line 92
    .line 93
    return-object p0

    .line 94
    :sswitch_6
    const-string v1, "delete_plugin"

    .line 95
    .line 96
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-nez v0, :cond_6

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_6
    const-string p0, "\u5220\u9664\u6574\u4e2a\u63d2\u4ef6"

    .line 104
    .line 105
    return-object p0

    .line 106
    :sswitch_7
    const-string v1, "check_access"

    .line 107
    .line 108
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    if-nez v0, :cond_7

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_7
    const-string p0, "\u68c0\u67e5\u63d2\u4ef6\u6587\u4ef6\u6743\u9650"

    .line 116
    .line 117
    return-object p0

    .line 118
    :sswitch_8
    const-string v1, "write_file"

    .line 119
    .line 120
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    if-nez v0, :cond_8

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_8
    const-string p0, "\u5199\u5165\u63d2\u4ef6\u6587\u4ef6"

    .line 128
    .line 129
    return-object p0

    .line 130
    :sswitch_9
    const-string v1, "read_file"

    .line 131
    .line 132
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    if-nez v0, :cond_9

    .line 137
    .line 138
    goto :goto_0

    .line 139
    :cond_9
    const-string p0, "\u8bfb\u53d6\u63d2\u4ef6\u6587\u4ef6"

    .line 140
    .line 141
    return-object p0

    .line 142
    :sswitch_a
    const-string v1, "delete_path"

    .line 143
    .line 144
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    if-nez v0, :cond_a

    .line 149
    .line 150
    goto :goto_0

    .line 151
    :cond_a
    const-string p0, "\u5220\u9664\u63d2\u4ef6\u8def\u5f84"

    .line 152
    .line 153
    return-object p0

    .line 154
    :sswitch_b
    const-string v1, "reset_workspace"

    .line 155
    .line 156
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    if-nez v0, :cond_b

    .line 161
    .line 162
    goto :goto_0

    .line 163
    :cond_b
    const-string p0, "\u91cd\u7f6e\u63d2\u4ef6\u5de5\u4f5c\u533a"

    .line 164
    .line 165
    return-object p0

    .line 166
    :sswitch_c
    const-string v1, "apply_patch"

    .line 167
    .line 168
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result v0

    .line 172
    if-nez v0, :cond_c

    .line 173
    .line 174
    goto :goto_0

    .line 175
    :cond_c
    const-string p0, "\u4fee\u6539\u63d2\u4ef6\u6587\u4ef6"

    .line 176
    .line 177
    return-object p0

    .line 178
    :sswitch_d
    const-string v1, "show_diff"

    .line 179
    .line 180
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    if-nez v0, :cond_d

    .line 185
    .line 186
    :goto_0
    return-object p0

    .line 187
    :cond_d
    const-string p0, "\u67e5\u770b\u4ee3\u7801\u5dee\u5f02"

    .line 188
    .line 189
    return-object p0

    .line 190
    nop

    .line 191
    :sswitch_data_0
    .sparse-switch
        -0x7179bff9 -> :sswitch_d
        -0x5b00c3c9 -> :sswitch_c
        -0x50de125b -> :sswitch_b
        -0x42df95c7 -> :sswitch_a
        -0x42641d7b -> :sswitch_9
        -0x25f09624 -> :sswitch_8
        -0x1a3e6b85 -> :sswitch_7
        -0x8b5bfb9 -> :sswitch_6
        -0x24c8124 -> :sswitch_5
        0x1adca520 -> :sswitch_4
        0x29725f96 -> :sswitch_3
        0x3fad9bd3 -> :sswitch_2
        0x6247b336 -> :sswitch_1
        0x63deaeea -> :sswitch_0
    .end sparse-switch
.end method

.method public static s(Ljava/io/File;)V
    .locals 7

    .line 1
    new-instance v0, Ldg/j;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, Ldg/k;->g:Ldg/k;

    .line 5
    .line 6
    invoke-direct {v0, p0, v2, v1}, Ldg/j;-><init>(Ljava/io/File;Ldg/k;Lc9/x;)V

    .line 7
    .line 8
    .line 9
    new-instance p0, Lfb/g0;

    .line 10
    .line 11
    const/16 v1, 0x17

    .line 12
    .line 13
    invoke-direct {p0, v1}, Lfb/g0;-><init>(I)V

    .line 14
    .line 15
    .line 16
    new-instance v1, Lng/i;

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    invoke-direct {v1, v0, v2, p0}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 20
    .line 21
    .line 22
    new-instance p0, Lng/h;

    .line 23
    .line 24
    invoke-direct {p0, v1}, Lng/h;-><init>(Lng/i;)V

    .line 25
    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    const-wide/16 v3, 0x0

    .line 29
    .line 30
    :goto_0
    invoke-virtual {p0}, Lng/h;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    invoke-virtual {p0}, Lng/h;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, Ljava/io/File;

    .line 41
    .line 42
    add-int/2addr v0, v2

    .line 43
    invoke-virtual {v1}, Ljava/io/File;->length()J

    .line 44
    .line 45
    .line 46
    move-result-wide v5

    .line 47
    add-long/2addr v3, v5

    .line 48
    const/16 v1, 0x200

    .line 49
    .line 50
    if-gt v0, v1, :cond_1

    .line 51
    .line 52
    const-wide/32 v5, 0x2000000

    .line 53
    .line 54
    .line 55
    cmp-long v1, v3, v5

    .line 56
    .line 57
    if-gtz v1, :cond_0

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    const-string p0, "\u63d2\u4ef6\u603b\u5927\u5c0f\u8d85\u8fc7 32 MB"

    .line 61
    .line 62
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_1
    const-string p0, "\u63d2\u4ef6\u6587\u4ef6\u6570\u91cf\u8d85\u8fc7 512"

    .line 67
    .line 68
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    :cond_2
    return-void
.end method

.method public static t(Ljava/io/File;Ljava/io/File;)V
    .locals 2

    .line 1
    invoke-static {p0}, Lfb/t2;->N(Ljava/io/File;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-static {p1}, Lfb/t2;->O(Ljava/io/File;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    const-string v0, "\u811a\u672c\u63d2\u4ef6\u6839\u76ee\u5f55"

    .line 14
    .line 15
    invoke-static {p0, v0}, Lfb/t2;->w(Ljava/io/File;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    if-eqz p0, :cond_1

    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    new-instance v0, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string v1, "\u63d2\u4ef6\u76ee\u5f55 "

    .line 31
    .line 32
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-static {p1, p0}, Lfb/t2;->w(Ljava/io/File;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    :cond_1
    return-void
.end method

.method public static u(Ljava/io/File;)V
    .locals 6

    .line 1
    invoke-static {p0}, Lfb/t2;->O(Ljava/io/File;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-static {v0, p0}, Lfb/t2;->v(Ljava/util/ArrayList;Ljava/io/File;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    const/4 v4, 0x0

    .line 20
    const/16 v5, 0x3e

    .line 21
    .line 22
    const-string v1, "\uff1b"

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    const/4 v3, 0x0

    .line 26
    invoke-static/range {v0 .. v5}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    const-string v0, "\u63d2\u4ef6\u6587\u4ef6\u6743\u9650\u4e0d\u53ef\u7528\uff0c\u5f53\u524d\u5fae\u4fe1\u8fdb\u7a0b\u65e0\u6cd5\u4fee\u590d\uff1a"

    .line 31
    .line 32
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-static {p0}, Lah/a;->h(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public static final v(Ljava/util/ArrayList;Ljava/io/File;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x8

    .line 6
    .line 7
    if-lt v0, v1, :cond_0

    .line 8
    .line 9
    goto/16 :goto_3

    .line 10
    .line 11
    :cond_0
    invoke-virtual {p1}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p1}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    new-instance v0, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string p1, ": \u4e0d\u652f\u6301\u7b26\u53f7\u94fe\u63a5"

    .line 38
    .line 39
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_1
    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_5

    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/io/File;->canRead()Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-eqz v0, :cond_4

    .line 61
    .line 62
    invoke-virtual {p1}, Ljava/io/File;->canExecute()Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-nez v0, :cond_2

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_2
    invoke-virtual {p1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    if-nez v0, :cond_3

    .line 74
    .line 75
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    new-instance v0, Ljava/lang/StringBuilder;

    .line 80
    .line 81
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    const-string p1, ": \u65e0\u6cd5\u5217\u51fa\u76ee\u5f55\u5185\u5bb9"

    .line 88
    .line 89
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :cond_3
    array-length p1, v0

    .line 101
    const/4 v1, 0x0

    .line 102
    :goto_0
    if-ge v1, p1, :cond_7

    .line 103
    .line 104
    aget-object v2, v0, v1

    .line 105
    .line 106
    invoke-static {p0, v2}, Lfb/t2;->v(Ljava/util/ArrayList;Ljava/io/File;)V

    .line 107
    .line 108
    .line 109
    add-int/lit8 v1, v1, 0x1

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_4
    :goto_1
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    new-instance v0, Ljava/lang/StringBuilder;

    .line 117
    .line 118
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    const-string p1, ": \u76ee\u5f55\u4e0d\u53ef\u8bfb\u6216\u4e0d\u53ef\u8fdb\u5165"

    .line 125
    .line 126
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    return-void

    .line 137
    :cond_5
    invoke-virtual {p1}, Ljava/io/File;->canRead()Z

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    if-eqz v0, :cond_6

    .line 142
    .line 143
    :try_start_0
    new-instance v0, Ljava/io/FileInputStream;

    .line 144
    .line 145
    invoke-direct {v0, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V

    .line 149
    .line 150
    .line 151
    sget-object v0, Lsf/n;->a:Lsf/n;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 152
    .line 153
    goto :goto_2

    .line 154
    :catchall_0
    move-exception v0

    .line 155
    new-instance v1, Lsf/f;

    .line 156
    .line 157
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 158
    .line 159
    .line 160
    move-object v0, v1

    .line 161
    :goto_2
    instance-of v0, v0, Lsf/f;

    .line 162
    .line 163
    if-eqz v0, :cond_7

    .line 164
    .line 165
    :cond_6
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    new-instance v0, Ljava/lang/StringBuilder;

    .line 170
    .line 171
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    const-string p1, ": \u6587\u4ef6\u4e0d\u53ef\u8bfb"

    .line 178
    .line 179
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    :cond_7
    :goto_3
    return-void
.end method

.method public static w(Ljava/io/File;Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-static {p0}, Lfb/t2;->N(Ljava/io/File;)V

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Lfb/t2;->H(Ljava/io/File;)Lfb/o2;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-boolean v1, v0, Lfb/o2;->a:Z

    .line 9
    .line 10
    if-nez v1, :cond_2

    .line 11
    .line 12
    :try_start_0
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-static {p0}, Landroid/system/Os;->stat(Ljava/lang/String;)Landroid/system/StructStat;

    .line 17
    .line 18
    .line 19
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception p0

    .line 22
    new-instance v1, Lsf/f;

    .line 23
    .line 24
    invoke-direct {v1, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    move-object p0, v1

    .line 28
    :goto_0
    nop

    .line 29
    instance-of v1, p0, Lsf/f;

    .line 30
    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    const/4 p0, 0x0

    .line 34
    :cond_0
    check-cast p0, Landroid/system/StructStat;

    .line 35
    .line 36
    if-eqz p0, :cond_1

    .line 37
    .line 38
    iget v1, p0, Landroid/system/StructStat;->st_uid:I

    .line 39
    .line 40
    iget p0, p0, Landroid/system/StructStat;->st_gid:I

    .line 41
    .line 42
    const-string v2, "uid="

    .line 43
    .line 44
    const-string v3, ", gid="

    .line 45
    .line 46
    invoke-static {v1, v2, v3, p0}, Lp/a;->j(ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    goto :goto_1

    .line 51
    :cond_1
    const-string p0, "\u65e0\u6cd5\u8bfb\u53d6\u6240\u6709\u8005"

    .line 52
    .line 53
    :goto_1
    invoke-static {}, Landroid/os/Process;->myUid()I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    iget-object v0, v0, Lfb/o2;->b:Ljava/lang/String;

    .line 58
    .line 59
    new-instance v2, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    const-string p1, " \u4e0d\u53ef\u5199\uff0c\u5f53\u524d\u5fae\u4fe1\u8fdb\u7a0b uid="

    .line 68
    .line 69
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    const-string p1, "\uff0c"

    .line 76
    .line 77
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-static {v2, p1, v0}, Leh/a;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    invoke-static {p0}, Lah/a;->h(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    :cond_2
    return-void
.end method

.method public static x(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;
    .locals 21

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const-string v2, " b/"

    .line 5
    .line 6
    const-string v3, "diff --git a/"

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    invoke-virtual/range {p0 .. p0}, Ljava/io/File;->isDirectory()Z

    .line 11
    .line 12
    .line 13
    move-result v4

    .line 14
    if-ne v4, v1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    if-eqz p1, :cond_3

    .line 18
    .line 19
    invoke-virtual/range {p1 .. p1}, Ljava/io/File;->isDirectory()Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-ne v4, v1, :cond_3

    .line 24
    .line 25
    :goto_0
    if-nez p0, :cond_1

    .line 26
    .line 27
    const-string v1, "\nnew directory "

    .line 28
    .line 29
    invoke-static {v3, v0, v2, v0, v1}, Lbc/e;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    return-object v0

    .line 41
    :cond_1
    if-nez p1, :cond_2

    .line 42
    .line 43
    const-string v1, "\ndeleted directory "

    .line 44
    .line 45
    invoke-static {v3, v0, v2, v0, v1}, Lbc/e;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    return-object v0

    .line 57
    :cond_2
    const-string v1, "\npath type changed "

    .line 58
    .line 59
    invoke-static {v3, v0, v2, v0, v1}, Lbc/e;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    return-object v0

    .line 71
    :cond_3
    if-eqz p0, :cond_4

    .line 72
    .line 73
    invoke-static/range {p0 .. p0}, Lfb/t2;->L(Ljava/io/File;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    goto :goto_1

    .line 78
    :cond_4
    const/4 v5, 0x0

    .line 79
    :goto_1
    if-eqz p1, :cond_5

    .line 80
    .line 81
    invoke-static/range {p1 .. p1}, Lfb/t2;->L(Ljava/io/File;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    goto :goto_2

    .line 86
    :cond_5
    const/4 v6, 0x0

    .line 87
    :goto_2
    if-eqz p0, :cond_6

    .line 88
    .line 89
    if-eqz v5, :cond_7

    .line 90
    .line 91
    :cond_6
    if-eqz p1, :cond_8

    .line 92
    .line 93
    if-nez v6, :cond_8

    .line 94
    .line 95
    :cond_7
    const-string v1, "\nBinary files differ"

    .line 96
    .line 97
    invoke-static {v3, v0, v2, v0, v1}, Lbc/e;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    return-object v0

    .line 102
    :cond_8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    const-string v7, ""

    .line 106
    .line 107
    if-nez v5, :cond_9

    .line 108
    .line 109
    move-object v8, v7

    .line 110
    goto :goto_3

    .line 111
    :cond_9
    move-object v8, v5

    .line 112
    :goto_3
    invoke-static {v8}, Lx6/d;->J(Ljava/lang/String;)Ljava/util/List;

    .line 113
    .line 114
    .line 115
    move-result-object v8

    .line 116
    if-nez v6, :cond_a

    .line 117
    .line 118
    goto :goto_4

    .line 119
    :cond_a
    move-object v7, v6

    .line 120
    :goto_4
    invoke-static {v7}, Lx6/d;->J(Ljava/lang/String;)Ljava/util/List;

    .line 121
    .line 122
    .line 123
    move-result-object v7

    .line 124
    const/4 v10, 0x0

    .line 125
    :goto_5
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 126
    .line 127
    .line 128
    move-result v11

    .line 129
    if-ge v10, v11, :cond_b

    .line 130
    .line 131
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 132
    .line 133
    .line 134
    move-result v11

    .line 135
    if-ge v10, v11, :cond_b

    .line 136
    .line 137
    invoke-interface {v8, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v11

    .line 141
    invoke-interface {v7, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v12

    .line 145
    invoke-static {v11, v12}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v11

    .line 149
    if-eqz v11, :cond_b

    .line 150
    .line 151
    add-int/lit8 v10, v10, 0x1

    .line 152
    .line 153
    goto :goto_5

    .line 154
    :cond_b
    const/4 v11, 0x0

    .line 155
    :goto_6
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 156
    .line 157
    .line 158
    move-result v12

    .line 159
    sub-int/2addr v12, v10

    .line 160
    if-ge v11, v12, :cond_c

    .line 161
    .line 162
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 163
    .line 164
    .line 165
    move-result v12

    .line 166
    sub-int/2addr v12, v10

    .line 167
    if-ge v11, v12, :cond_c

    .line 168
    .line 169
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 170
    .line 171
    .line 172
    move-result v12

    .line 173
    sub-int/2addr v12, v1

    .line 174
    sub-int/2addr v12, v11

    .line 175
    invoke-interface {v8, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v12

    .line 179
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 180
    .line 181
    .line 182
    move-result v13

    .line 183
    sub-int/2addr v13, v1

    .line 184
    sub-int/2addr v13, v11

    .line 185
    invoke-interface {v7, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v13

    .line 189
    invoke-static {v12, v13}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v12

    .line 193
    if-eqz v12, :cond_c

    .line 194
    .line 195
    add-int/lit8 v11, v11, 0x1

    .line 196
    .line 197
    goto :goto_6

    .line 198
    :cond_c
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 199
    .line 200
    .line 201
    move-result v12

    .line 202
    sub-int/2addr v12, v11

    .line 203
    invoke-interface {v8, v10, v12}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 204
    .line 205
    .line 206
    move-result-object v12

    .line 207
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 208
    .line 209
    .line 210
    move-result v13

    .line 211
    sub-int/2addr v13, v11

    .line 212
    invoke-interface {v7, v10, v13}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 213
    .line 214
    .line 215
    move-result-object v13

    .line 216
    new-instance v14, Ljava/util/ArrayList;

    .line 217
    .line 218
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 219
    .line 220
    .line 221
    move-result v15

    .line 222
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 223
    .line 224
    .line 225
    move-result v7

    .line 226
    add-int/2addr v7, v15

    .line 227
    invoke-direct {v14, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 228
    .line 229
    .line 230
    invoke-static {v10, v8}, Ltf/m;->L1(ILjava/lang/Iterable;)Ljava/util/List;

    .line 231
    .line 232
    .line 233
    move-result-object v7

    .line 234
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 235
    .line 236
    .line 237
    move-result-object v7

    .line 238
    :goto_7
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 239
    .line 240
    .line 241
    move-result v10

    .line 242
    sget-object v15, Lfb/u1;->g:Lfb/u1;

    .line 243
    .line 244
    if-eqz v10, :cond_d

    .line 245
    .line 246
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v10

    .line 250
    check-cast v10, Ljava/lang/String;

    .line 251
    .line 252
    const/16 v16, 0x0

    .line 253
    .line 254
    new-instance v4, Lfb/v1;

    .line 255
    .line 256
    invoke-direct {v4, v15, v10}, Lfb/v1;-><init>(Lfb/u1;Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v14, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    goto :goto_7

    .line 263
    :cond_d
    const/16 v16, 0x0

    .line 264
    .line 265
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 266
    .line 267
    .line 268
    move-result v4

    .line 269
    int-to-long v9, v4

    .line 270
    invoke-interface {v13}, Ljava/util/List;->size()I

    .line 271
    .line 272
    .line 273
    move-result v4

    .line 274
    move v7, v1

    .line 275
    move-object/from16 v17, v2

    .line 276
    .line 277
    int-to-long v1, v4

    .line 278
    mul-long/2addr v9, v1

    .line 279
    const-wide/32 v1, 0x1e8480

    .line 280
    .line 281
    .line 282
    cmp-long v1, v9, v1

    .line 283
    .line 284
    sget-object v2, Lfb/u1;->h:Lfb/u1;

    .line 285
    .line 286
    sget-object v4, Lfb/u1;->i:Lfb/u1;

    .line 287
    .line 288
    if-gtz v1, :cond_18

    .line 289
    .line 290
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 291
    .line 292
    .line 293
    move-result v1

    .line 294
    add-int/2addr v1, v7

    .line 295
    new-array v9, v1, [[I

    .line 296
    .line 297
    const/4 v10, 0x0

    .line 298
    :goto_8
    if-ge v10, v1, :cond_e

    .line 299
    .line 300
    invoke-interface {v13}, Ljava/util/List;->size()I

    .line 301
    .line 302
    .line 303
    move-result v18

    .line 304
    move/from16 p1, v7

    .line 305
    .line 306
    add-int/lit8 v7, v18, 0x1

    .line 307
    .line 308
    new-array v7, v7, [I

    .line 309
    .line 310
    aput-object v7, v9, v10

    .line 311
    .line 312
    add-int/lit8 v10, v10, 0x1

    .line 313
    .line 314
    move/from16 v7, p1

    .line 315
    .line 316
    goto :goto_8

    .line 317
    :cond_e
    move/from16 p1, v7

    .line 318
    .line 319
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 320
    .line 321
    .line 322
    move-result v1

    .line 323
    add-int/lit8 v1, v1, -0x1

    .line 324
    .line 325
    :goto_9
    const/4 v7, -0x1

    .line 326
    if-lt v7, v1, :cond_15

    .line 327
    .line 328
    const/4 v1, 0x0

    .line 329
    const/4 v7, 0x0

    .line 330
    :goto_a
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 331
    .line 332
    .line 333
    move-result v10

    .line 334
    if-lt v1, v10, :cond_10

    .line 335
    .line 336
    invoke-interface {v13}, Ljava/util/List;->size()I

    .line 337
    .line 338
    .line 339
    move-result v10

    .line 340
    if-ge v7, v10, :cond_f

    .line 341
    .line 342
    goto :goto_b

    .line 343
    :cond_f
    move-object/from16 v18, v5

    .line 344
    .line 345
    goto/16 :goto_11

    .line 346
    .line 347
    :cond_10
    :goto_b
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 348
    .line 349
    .line 350
    move-result v10

    .line 351
    if-ge v1, v10, :cond_11

    .line 352
    .line 353
    invoke-interface {v13}, Ljava/util/List;->size()I

    .line 354
    .line 355
    .line 356
    move-result v10

    .line 357
    if-ge v7, v10, :cond_11

    .line 358
    .line 359
    invoke-interface {v12, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object v10

    .line 363
    move-object/from16 v18, v5

    .line 364
    .line 365
    invoke-interface {v13, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object v5

    .line 369
    invoke-static {v10, v5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 370
    .line 371
    .line 372
    move-result v5

    .line 373
    if-eqz v5, :cond_12

    .line 374
    .line 375
    new-instance v5, Lfb/v1;

    .line 376
    .line 377
    invoke-interface {v12, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object v10

    .line 381
    check-cast v10, Ljava/lang/String;

    .line 382
    .line 383
    invoke-direct {v5, v15, v10}, Lfb/v1;-><init>(Lfb/u1;Ljava/lang/String;)V

    .line 384
    .line 385
    .line 386
    invoke-virtual {v14, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 387
    .line 388
    .line 389
    add-int/lit8 v1, v1, 0x1

    .line 390
    .line 391
    add-int/lit8 v7, v7, 0x1

    .line 392
    .line 393
    goto :goto_c

    .line 394
    :cond_11
    move-object/from16 v18, v5

    .line 395
    .line 396
    :cond_12
    invoke-interface {v13}, Ljava/util/List;->size()I

    .line 397
    .line 398
    .line 399
    move-result v5

    .line 400
    if-ge v7, v5, :cond_14

    .line 401
    .line 402
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 403
    .line 404
    .line 405
    move-result v5

    .line 406
    if-ge v1, v5, :cond_13

    .line 407
    .line 408
    aget-object v5, v9, v1

    .line 409
    .line 410
    add-int/lit8 v10, v7, 0x1

    .line 411
    .line 412
    aget v5, v5, v10

    .line 413
    .line 414
    add-int/lit8 v10, v1, 0x1

    .line 415
    .line 416
    aget-object v10, v9, v10

    .line 417
    .line 418
    aget v10, v10, v7

    .line 419
    .line 420
    if-le v5, v10, :cond_14

    .line 421
    .line 422
    :cond_13
    new-instance v5, Lfb/v1;

    .line 423
    .line 424
    add-int/lit8 v10, v7, 0x1

    .line 425
    .line 426
    invoke-interface {v13, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 427
    .line 428
    .line 429
    move-result-object v7

    .line 430
    check-cast v7, Ljava/lang/String;

    .line 431
    .line 432
    invoke-direct {v5, v4, v7}, Lfb/v1;-><init>(Lfb/u1;Ljava/lang/String;)V

    .line 433
    .line 434
    .line 435
    invoke-virtual {v14, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 436
    .line 437
    .line 438
    move v7, v10

    .line 439
    goto :goto_c

    .line 440
    :cond_14
    new-instance v5, Lfb/v1;

    .line 441
    .line 442
    add-int/lit8 v10, v1, 0x1

    .line 443
    .line 444
    invoke-interface {v12, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object v1

    .line 448
    check-cast v1, Ljava/lang/String;

    .line 449
    .line 450
    invoke-direct {v5, v2, v1}, Lfb/v1;-><init>(Lfb/u1;Ljava/lang/String;)V

    .line 451
    .line 452
    .line 453
    invoke-virtual {v14, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 454
    .line 455
    .line 456
    move v1, v10

    .line 457
    :goto_c
    move-object/from16 v5, v18

    .line 458
    .line 459
    goto/16 :goto_a

    .line 460
    .line 461
    :cond_15
    move-object/from16 v18, v5

    .line 462
    .line 463
    invoke-interface {v13}, Ljava/util/List;->size()I

    .line 464
    .line 465
    .line 466
    move-result v5

    .line 467
    add-int/lit8 v5, v5, -0x1

    .line 468
    .line 469
    :goto_d
    if-lt v7, v5, :cond_16

    .line 470
    .line 471
    add-int/lit8 v1, v1, -0x1

    .line 472
    .line 473
    move-object/from16 v5, v18

    .line 474
    .line 475
    goto/16 :goto_9

    .line 476
    .line 477
    :cond_16
    aget-object v10, v9, v1

    .line 478
    .line 479
    invoke-interface {v12, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 480
    .line 481
    .line 482
    move-result-object v7

    .line 483
    move/from16 v19, v1

    .line 484
    .line 485
    invoke-interface {v13, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 486
    .line 487
    .line 488
    move-result-object v1

    .line 489
    invoke-static {v7, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 490
    .line 491
    .line 492
    move-result v1

    .line 493
    if-eqz v1, :cond_17

    .line 494
    .line 495
    add-int/lit8 v1, v19, 0x1

    .line 496
    .line 497
    aget-object v1, v9, v1

    .line 498
    .line 499
    add-int/lit8 v7, v5, 0x1

    .line 500
    .line 501
    aget v1, v1, v7

    .line 502
    .line 503
    add-int/lit8 v1, v1, 0x1

    .line 504
    .line 505
    goto :goto_e

    .line 506
    :cond_17
    add-int/lit8 v1, v19, 0x1

    .line 507
    .line 508
    aget-object v1, v9, v1

    .line 509
    .line 510
    aget v1, v1, v5

    .line 511
    .line 512
    aget-object v7, v9, v19

    .line 513
    .line 514
    add-int/lit8 v20, v5, 0x1

    .line 515
    .line 516
    aget v7, v7, v20

    .line 517
    .line 518
    invoke-static {v1, v7}, Ljava/lang/Math;->max(II)I

    .line 519
    .line 520
    .line 521
    move-result v1

    .line 522
    :goto_e
    aput v1, v10, v5

    .line 523
    .line 524
    add-int/lit8 v5, v5, -0x1

    .line 525
    .line 526
    move/from16 v1, v19

    .line 527
    .line 528
    const/4 v7, -0x1

    .line 529
    goto :goto_d

    .line 530
    :cond_18
    move-object/from16 v18, v5

    .line 531
    .line 532
    move/from16 p1, v7

    .line 533
    .line 534
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 535
    .line 536
    .line 537
    move-result-object v1

    .line 538
    :goto_f
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 539
    .line 540
    .line 541
    move-result v5

    .line 542
    if-eqz v5, :cond_19

    .line 543
    .line 544
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 545
    .line 546
    .line 547
    move-result-object v5

    .line 548
    check-cast v5, Ljava/lang/String;

    .line 549
    .line 550
    new-instance v7, Lfb/v1;

    .line 551
    .line 552
    invoke-direct {v7, v2, v5}, Lfb/v1;-><init>(Lfb/u1;Ljava/lang/String;)V

    .line 553
    .line 554
    .line 555
    invoke-virtual {v14, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 556
    .line 557
    .line 558
    goto :goto_f

    .line 559
    :cond_19
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 560
    .line 561
    .line 562
    move-result-object v1

    .line 563
    :goto_10
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 564
    .line 565
    .line 566
    move-result v5

    .line 567
    if-eqz v5, :cond_1a

    .line 568
    .line 569
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 570
    .line 571
    .line 572
    move-result-object v5

    .line 573
    check-cast v5, Ljava/lang/String;

    .line 574
    .line 575
    new-instance v7, Lfb/v1;

    .line 576
    .line 577
    invoke-direct {v7, v4, v5}, Lfb/v1;-><init>(Lfb/u1;Ljava/lang/String;)V

    .line 578
    .line 579
    .line 580
    invoke-virtual {v14, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 581
    .line 582
    .line 583
    goto :goto_10

    .line 584
    :cond_1a
    :goto_11
    if-lez v11, :cond_1b

    .line 585
    .line 586
    invoke-static {v11, v8}, Ltf/m;->M1(ILjava/util/List;)Ljava/util/List;

    .line 587
    .line 588
    .line 589
    move-result-object v1

    .line 590
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 591
    .line 592
    .line 593
    move-result-object v1

    .line 594
    :goto_12
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 595
    .line 596
    .line 597
    move-result v5

    .line 598
    if-eqz v5, :cond_1b

    .line 599
    .line 600
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 601
    .line 602
    .line 603
    move-result-object v5

    .line 604
    check-cast v5, Ljava/lang/String;

    .line 605
    .line 606
    new-instance v7, Lfb/v1;

    .line 607
    .line 608
    invoke-direct {v7, v15, v5}, Lfb/v1;-><init>(Lfb/u1;Ljava/lang/String;)V

    .line 609
    .line 610
    .line 611
    invoke-virtual {v14, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 612
    .line 613
    .line 614
    goto :goto_12

    .line 615
    :cond_1b
    invoke-static {v14}, La/a;->X(Ljava/util/Collection;)Llg/d;

    .line 616
    .line 617
    .line 618
    move-result-object v1

    .line 619
    new-instance v5, Ljava/util/ArrayList;

    .line 620
    .line 621
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 622
    .line 623
    .line 624
    invoke-virtual {v1}, Llg/b;->iterator()Ljava/util/Iterator;

    .line 625
    .line 626
    .line 627
    move-result-object v1

    .line 628
    :cond_1c
    :goto_13
    move-object v7, v1

    .line 629
    check-cast v7, Llg/c;

    .line 630
    .line 631
    iget-boolean v8, v7, Llg/c;->i:Z

    .line 632
    .line 633
    if-eqz v8, :cond_1d

    .line 634
    .line 635
    invoke-virtual {v7}, Llg/c;->next()Ljava/lang/Object;

    .line 636
    .line 637
    .line 638
    move-result-object v7

    .line 639
    move-object v8, v7

    .line 640
    check-cast v8, Ljava/lang/Number;

    .line 641
    .line 642
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 643
    .line 644
    .line 645
    move-result v8

    .line 646
    invoke-virtual {v14, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 647
    .line 648
    .line 649
    move-result-object v8

    .line 650
    check-cast v8, Lfb/v1;

    .line 651
    .line 652
    iget-object v8, v8, Lfb/v1;->a:Lfb/u1;

    .line 653
    .line 654
    if-eq v8, v15, :cond_1c

    .line 655
    .line 656
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 657
    .line 658
    .line 659
    goto :goto_13

    .line 660
    :cond_1d
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 661
    .line 662
    .line 663
    move-result v1

    .line 664
    if-eqz v1, :cond_1e

    .line 665
    .line 666
    const-string v1, "\n--- a/"

    .line 667
    .line 668
    move-object/from16 v7, v17

    .line 669
    .line 670
    invoke-static {v3, v0, v7, v0, v1}, Lbc/e;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 671
    .line 672
    .line 673
    move-result-object v1

    .line 674
    const-string v2, "\n+++ b/"

    .line 675
    .line 676
    const-string v3, "\nFile bytes changed without line-level text changes"

    .line 677
    .line 678
    invoke-static {v1, v0, v2, v0, v3}, Lj8/b;->k(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 679
    .line 680
    .line 681
    move-result-object v0

    .line 682
    return-object v0

    .line 683
    :cond_1e
    move-object/from16 v7, v17

    .line 684
    .line 685
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    .line 686
    .line 687
    .line 688
    move-result v1

    .line 689
    add-int/lit8 v1, v1, 0x1

    .line 690
    .line 691
    new-array v1, v1, [I

    .line 692
    .line 693
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    .line 694
    .line 695
    .line 696
    move-result v8

    .line 697
    add-int/lit8 v8, v8, 0x1

    .line 698
    .line 699
    new-array v8, v8, [I

    .line 700
    .line 701
    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 702
    .line 703
    .line 704
    move-result-object v9

    .line 705
    move/from16 v10, p1

    .line 706
    .line 707
    move v11, v10

    .line 708
    const/4 v12, 0x0

    .line 709
    :goto_14
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 710
    .line 711
    .line 712
    move-result v13

    .line 713
    if-eqz v13, :cond_22

    .line 714
    .line 715
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 716
    .line 717
    .line 718
    move-result-object v13

    .line 719
    add-int/lit8 v17, v12, 0x1

    .line 720
    .line 721
    if-ltz v12, :cond_21

    .line 722
    .line 723
    check-cast v13, Lfb/v1;

    .line 724
    .line 725
    aput v10, v1, v12

    .line 726
    .line 727
    aput v11, v8, v12

    .line 728
    .line 729
    iget-object v12, v13, Lfb/v1;->a:Lfb/u1;

    .line 730
    .line 731
    if-eq v12, v4, :cond_1f

    .line 732
    .line 733
    add-int/lit8 v10, v10, 0x1

    .line 734
    .line 735
    :cond_1f
    if-eq v12, v2, :cond_20

    .line 736
    .line 737
    add-int/lit8 v11, v11, 0x1

    .line 738
    .line 739
    :cond_20
    move/from16 v12, v17

    .line 740
    .line 741
    goto :goto_14

    .line 742
    :cond_21
    invoke-static {}, La/a;->Q0()V

    .line 743
    .line 744
    .line 745
    throw v16

    .line 746
    :cond_22
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    .line 747
    .line 748
    .line 749
    move-result v9

    .line 750
    aput v10, v1, v9

    .line 751
    .line 752
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    .line 753
    .line 754
    .line 755
    move-result v9

    .line 756
    aput v11, v8, v9

    .line 757
    .line 758
    const-string v9, "\n--- "

    .line 759
    .line 760
    invoke-static {v3, v0, v7, v0, v9}, Lbc/e;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 761
    .line 762
    .line 763
    move-result-object v3

    .line 764
    const-string v7, "/dev/null"

    .line 765
    .line 766
    if-nez v18, :cond_23

    .line 767
    .line 768
    move-object v9, v7

    .line 769
    goto :goto_15

    .line 770
    :cond_23
    const-string v9, "a/"

    .line 771
    .line 772
    invoke-virtual {v9, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 773
    .line 774
    .line 775
    move-result-object v9

    .line 776
    :goto_15
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 777
    .line 778
    .line 779
    const-string v9, "\n+++ "

    .line 780
    .line 781
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 782
    .line 783
    .line 784
    if-nez v6, :cond_24

    .line 785
    .line 786
    goto :goto_16

    .line 787
    :cond_24
    const-string v6, "b/"

    .line 788
    .line 789
    invoke-virtual {v6, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 790
    .line 791
    .line 792
    move-result-object v7

    .line 793
    :goto_16
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 794
    .line 795
    .line 796
    const/16 v0, 0xa

    .line 797
    .line 798
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 799
    .line 800
    .line 801
    new-instance v6, Ljava/util/ArrayList;

    .line 802
    .line 803
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 804
    .line 805
    .line 806
    invoke-static {v5}, Ltf/m;->t1(Ljava/util/List;)Ljava/lang/Object;

    .line 807
    .line 808
    .line 809
    move-result-object v7

    .line 810
    check-cast v7, Ljava/lang/Number;

    .line 811
    .line 812
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 813
    .line 814
    .line 815
    move-result v9

    .line 816
    move/from16 v7, p1

    .line 817
    .line 818
    invoke-static {v7, v5}, Ltf/m;->q1(ILjava/lang/Iterable;)Ljava/util/List;

    .line 819
    .line 820
    .line 821
    move-result-object v5

    .line 822
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 823
    .line 824
    .line 825
    move-result-object v5

    .line 826
    move v10, v9

    .line 827
    :goto_17
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 828
    .line 829
    .line 830
    move-result v11

    .line 831
    if-eqz v11, :cond_2a

    .line 832
    .line 833
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 834
    .line 835
    .line 836
    move-result-object v11

    .line 837
    check-cast v11, Ljava/lang/Number;

    .line 838
    .line 839
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 840
    .line 841
    .line 842
    move-result v11

    .line 843
    add-int/lit8 v12, v10, 0x1

    .line 844
    .line 845
    invoke-virtual {v14, v12, v11}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    .line 846
    .line 847
    .line 848
    move-result-object v12

    .line 849
    if-eqz v12, :cond_25

    .line 850
    .line 851
    invoke-interface {v12}, Ljava/util/Collection;->isEmpty()Z

    .line 852
    .line 853
    .line 854
    move-result v13

    .line 855
    if-eqz v13, :cond_25

    .line 856
    .line 857
    const/4 v13, 0x0

    .line 858
    goto :goto_19

    .line 859
    :cond_25
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 860
    .line 861
    .line 862
    move-result-object v12

    .line 863
    const/4 v13, 0x0

    .line 864
    :cond_26
    :goto_18
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 865
    .line 866
    .line 867
    move-result v17

    .line 868
    if-eqz v17, :cond_28

    .line 869
    .line 870
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 871
    .line 872
    .line 873
    move-result-object v17

    .line 874
    move-object/from16 v7, v17

    .line 875
    .line 876
    check-cast v7, Lfb/v1;

    .line 877
    .line 878
    iget-object v7, v7, Lfb/v1;->a:Lfb/u1;

    .line 879
    .line 880
    if-ne v7, v15, :cond_26

    .line 881
    .line 882
    add-int/lit8 v13, v13, 0x1

    .line 883
    .line 884
    if-ltz v13, :cond_27

    .line 885
    .line 886
    goto :goto_18

    .line 887
    :cond_27
    invoke-static {}, La/a;->P0()V

    .line 888
    .line 889
    .line 890
    throw v16

    .line 891
    :cond_28
    :goto_19
    const/4 v7, 0x6

    .line 892
    if-le v13, v7, :cond_29

    .line 893
    .line 894
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 895
    .line 896
    .line 897
    move-result-object v7

    .line 898
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 899
    .line 900
    .line 901
    move-result-object v9

    .line 902
    new-instance v10, Lsf/e;

    .line 903
    .line 904
    invoke-direct {v10, v7, v9}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 905
    .line 906
    .line 907
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 908
    .line 909
    .line 910
    move v9, v11

    .line 911
    :cond_29
    move v10, v11

    .line 912
    goto :goto_17

    .line 913
    :cond_2a
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 914
    .line 915
    .line 916
    move-result-object v5

    .line 917
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 918
    .line 919
    .line 920
    move-result-object v7

    .line 921
    new-instance v9, Lsf/e;

    .line 922
    .line 923
    invoke-direct {v9, v5, v7}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 924
    .line 925
    .line 926
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 927
    .line 928
    .line 929
    new-instance v5, Ljava/util/ArrayList;

    .line 930
    .line 931
    invoke-static {v6}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 932
    .line 933
    .line 934
    move-result v7

    .line 935
    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 936
    .line 937
    .line 938
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 939
    .line 940
    .line 941
    move-result-object v6

    .line 942
    :goto_1a
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 943
    .line 944
    .line 945
    move-result v7

    .line 946
    if-eqz v7, :cond_2f

    .line 947
    .line 948
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 949
    .line 950
    .line 951
    move-result-object v7

    .line 952
    check-cast v7, Lsf/e;

    .line 953
    .line 954
    iget-object v9, v7, Lsf/e;->g:Ljava/lang/Object;

    .line 955
    .line 956
    check-cast v9, Ljava/lang/Number;

    .line 957
    .line 958
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 959
    .line 960
    .line 961
    move-result v9

    .line 962
    iget-object v7, v7, Lsf/e;->h:Ljava/lang/Object;

    .line 963
    .line 964
    check-cast v7, Ljava/lang/Number;

    .line 965
    .line 966
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 967
    .line 968
    .line 969
    move-result v7

    .line 970
    const/4 v10, 0x0

    .line 971
    :goto_1b
    const/4 v11, 0x3

    .line 972
    if-ge v10, v11, :cond_2c

    .line 973
    .line 974
    if-lez v9, :cond_2b

    .line 975
    .line 976
    add-int/lit8 v11, v9, -0x1

    .line 977
    .line 978
    invoke-virtual {v14, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 979
    .line 980
    .line 981
    move-result-object v11

    .line 982
    check-cast v11, Lfb/v1;

    .line 983
    .line 984
    iget-object v11, v11, Lfb/v1;->a:Lfb/u1;

    .line 985
    .line 986
    if-ne v11, v15, :cond_2b

    .line 987
    .line 988
    add-int/lit8 v9, v9, -0x1

    .line 989
    .line 990
    :cond_2b
    add-int/lit8 v10, v10, 0x1

    .line 991
    .line 992
    goto :goto_1b

    .line 993
    :cond_2c
    const/4 v10, 0x0

    .line 994
    :goto_1c
    if-ge v10, v11, :cond_2e

    .line 995
    .line 996
    add-int/lit8 v12, v7, 0x1

    .line 997
    .line 998
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    .line 999
    .line 1000
    .line 1001
    move-result v13

    .line 1002
    if-ge v12, v13, :cond_2d

    .line 1003
    .line 1004
    invoke-virtual {v14, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1005
    .line 1006
    .line 1007
    move-result-object v13

    .line 1008
    check-cast v13, Lfb/v1;

    .line 1009
    .line 1010
    iget-object v13, v13, Lfb/v1;->a:Lfb/u1;

    .line 1011
    .line 1012
    if-ne v13, v15, :cond_2d

    .line 1013
    .line 1014
    move v7, v12

    .line 1015
    :cond_2d
    add-int/lit8 v10, v10, 0x1

    .line 1016
    .line 1017
    goto :goto_1c

    .line 1018
    :cond_2e
    new-instance v10, Llg/d;

    .line 1019
    .line 1020
    const/4 v11, 0x1

    .line 1021
    invoke-direct {v10, v9, v7, v11}, Llg/b;-><init>(III)V

    .line 1022
    .line 1023
    .line 1024
    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1025
    .line 1026
    .line 1027
    goto :goto_1a

    .line 1028
    :cond_2f
    const/4 v11, 0x1

    .line 1029
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1030
    .line 1031
    .line 1032
    move-result-object v5

    .line 1033
    :goto_1d
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 1034
    .line 1035
    .line 1036
    move-result v6

    .line 1037
    if-eqz v6, :cond_3e

    .line 1038
    .line 1039
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1040
    .line 1041
    .line 1042
    move-result-object v6

    .line 1043
    check-cast v6, Llg/d;

    .line 1044
    .line 1045
    iget v9, v6, Llg/b;->g:I

    .line 1046
    .line 1047
    iget v6, v6, Llg/b;->h:I

    .line 1048
    .line 1049
    add-int/2addr v6, v11

    .line 1050
    invoke-virtual {v14, v9, v6}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v6

    .line 1054
    if-eqz v6, :cond_30

    .line 1055
    .line 1056
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 1057
    .line 1058
    .line 1059
    move-result v10

    .line 1060
    if-eqz v10, :cond_30

    .line 1061
    .line 1062
    const/4 v11, 0x0

    .line 1063
    goto :goto_20

    .line 1064
    :cond_30
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1065
    .line 1066
    .line 1067
    move-result-object v10

    .line 1068
    const/4 v11, 0x0

    .line 1069
    :cond_31
    :goto_1e
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 1070
    .line 1071
    .line 1072
    move-result v12

    .line 1073
    if-eqz v12, :cond_34

    .line 1074
    .line 1075
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1076
    .line 1077
    .line 1078
    move-result-object v12

    .line 1079
    check-cast v12, Lfb/v1;

    .line 1080
    .line 1081
    iget-object v12, v12, Lfb/v1;->a:Lfb/u1;

    .line 1082
    .line 1083
    if-eq v12, v4, :cond_32

    .line 1084
    .line 1085
    const/4 v12, 0x1

    .line 1086
    goto :goto_1f

    .line 1087
    :cond_32
    const/4 v12, 0x0

    .line 1088
    :goto_1f
    if-eqz v12, :cond_31

    .line 1089
    .line 1090
    add-int/lit8 v11, v11, 0x1

    .line 1091
    .line 1092
    if-ltz v11, :cond_33

    .line 1093
    .line 1094
    goto :goto_1e

    .line 1095
    :cond_33
    invoke-static {}, La/a;->P0()V

    .line 1096
    .line 1097
    .line 1098
    throw v16

    .line 1099
    :cond_34
    :goto_20
    if-eqz v6, :cond_35

    .line 1100
    .line 1101
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 1102
    .line 1103
    .line 1104
    move-result v10

    .line 1105
    if-eqz v10, :cond_35

    .line 1106
    .line 1107
    const/4 v12, 0x0

    .line 1108
    goto :goto_23

    .line 1109
    :cond_35
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1110
    .line 1111
    .line 1112
    move-result-object v10

    .line 1113
    const/4 v12, 0x0

    .line 1114
    :cond_36
    :goto_21
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 1115
    .line 1116
    .line 1117
    move-result v13

    .line 1118
    if-eqz v13, :cond_39

    .line 1119
    .line 1120
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1121
    .line 1122
    .line 1123
    move-result-object v13

    .line 1124
    check-cast v13, Lfb/v1;

    .line 1125
    .line 1126
    iget-object v13, v13, Lfb/v1;->a:Lfb/u1;

    .line 1127
    .line 1128
    if-eq v13, v2, :cond_37

    .line 1129
    .line 1130
    const/4 v13, 0x1

    .line 1131
    goto :goto_22

    .line 1132
    :cond_37
    const/4 v13, 0x0

    .line 1133
    :goto_22
    if-eqz v13, :cond_36

    .line 1134
    .line 1135
    add-int/lit8 v12, v12, 0x1

    .line 1136
    .line 1137
    if-ltz v12, :cond_38

    .line 1138
    .line 1139
    goto :goto_21

    .line 1140
    :cond_38
    invoke-static {}, La/a;->P0()V

    .line 1141
    .line 1142
    .line 1143
    throw v16

    .line 1144
    :cond_39
    :goto_23
    const-string v10, "@@ -"

    .line 1145
    .line 1146
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1147
    .line 1148
    .line 1149
    aget v10, v1, v9

    .line 1150
    .line 1151
    invoke-static {v10, v11}, Lx6/d;->W(II)Ljava/lang/String;

    .line 1152
    .line 1153
    .line 1154
    move-result-object v10

    .line 1155
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1156
    .line 1157
    .line 1158
    const-string v10, " +"

    .line 1159
    .line 1160
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1161
    .line 1162
    .line 1163
    aget v9, v8, v9

    .line 1164
    .line 1165
    invoke-static {v9, v12}, Lx6/d;->W(II)Ljava/lang/String;

    .line 1166
    .line 1167
    .line 1168
    move-result-object v9

    .line 1169
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1170
    .line 1171
    .line 1172
    const-string v9, " @@\n"

    .line 1173
    .line 1174
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1175
    .line 1176
    .line 1177
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1178
    .line 1179
    .line 1180
    move-result-object v6

    .line 1181
    :goto_24
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 1182
    .line 1183
    .line 1184
    move-result v9

    .line 1185
    if-eqz v9, :cond_3d

    .line 1186
    .line 1187
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1188
    .line 1189
    .line 1190
    move-result-object v9

    .line 1191
    check-cast v9, Lfb/v1;

    .line 1192
    .line 1193
    iget-object v10, v9, Lfb/v1;->a:Lfb/u1;

    .line 1194
    .line 1195
    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    .line 1196
    .line 1197
    .line 1198
    move-result v10

    .line 1199
    if-eqz v10, :cond_3c

    .line 1200
    .line 1201
    const/4 v7, 0x1

    .line 1202
    if-eq v10, v7, :cond_3b

    .line 1203
    .line 1204
    const/4 v11, 0x2

    .line 1205
    if-ne v10, v11, :cond_3a

    .line 1206
    .line 1207
    const/16 v10, 0x2b

    .line 1208
    .line 1209
    goto :goto_25

    .line 1210
    :cond_3a
    invoke-static {}, Lokio/a;->k()V

    .line 1211
    .line 1212
    .line 1213
    const/4 v0, 0x0

    .line 1214
    return-object v0

    .line 1215
    :cond_3b
    const/16 v10, 0x2d

    .line 1216
    .line 1217
    goto :goto_25

    .line 1218
    :cond_3c
    const/4 v7, 0x1

    .line 1219
    const/16 v10, 0x20

    .line 1220
    .line 1221
    :goto_25
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1222
    .line 1223
    .line 1224
    iget-object v9, v9, Lfb/v1;->b:Ljava/lang/String;

    .line 1225
    .line 1226
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1227
    .line 1228
    .line 1229
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1230
    .line 1231
    .line 1232
    goto :goto_24

    .line 1233
    :cond_3d
    const/4 v7, 0x1

    .line 1234
    move v11, v7

    .line 1235
    goto/16 :goto_1d

    .line 1236
    .line 1237
    :cond_3e
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1238
    .line 1239
    .line 1240
    move-result-object v0

    .line 1241
    invoke-static {v0}, Log/m;->T0(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 1242
    .line 1243
    .line 1244
    move-result-object v0

    .line 1245
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1246
    .line 1247
    .line 1248
    move-result-object v0

    .line 1249
    return-object v0
.end method

.method public static y(Ljava/io/File;)Ljava/lang/String;
    .locals 4

    .line 1
    const-string v0, "SHA-256"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Ljava/io/FileInputStream;

    .line 8
    .line 9
    invoke-direct {v1, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 10
    .line 11
    .line 12
    const p0, 0x8000

    .line 13
    .line 14
    .line 15
    :try_start_0
    new-array p0, p0, [B

    .line 16
    .line 17
    :goto_0
    invoke-virtual {v1, p0}, Ljava/io/FileInputStream;->read([B)I

    .line 18
    .line 19
    .line 20
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    if-gtz v2, :cond_0

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    new-instance v0, Lfb/g0;

    .line 34
    .line 35
    const/16 v1, 0x18

    .line 36
    .line 37
    invoke-direct {v0, v1}, Lfb/g0;-><init>(I)V

    .line 38
    .line 39
    .line 40
    invoke-static {p0, v0}, Ltf/l;->E0([BLfg/l;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0

    .line 45
    :cond_0
    const/4 v3, 0x0

    .line 46
    :try_start_1
    invoke-virtual {v0, p0, v3, v2}, Ljava/security/MessageDigest;->update([BII)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :catchall_0
    move-exception p0

    .line 51
    :try_start_2
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 52
    :catchall_1
    move-exception v0

    .line 53
    invoke-static {v1, p0}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 54
    .line 55
    .line 56
    throw v0
.end method

.method public static z(Ljava/io/File;)Z
    .locals 2

    .line 1
    invoke-static {p0}, Lfb/t2;->Z(Ljava/io/File;)Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lfb/t2;->Y(Ljava/io/File;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    const-string v1, "[0-9a-f]{64}"

    .line 12
    .line 13
    invoke-static {v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_0

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_0
    :try_start_0
    invoke-static {p0}, Lfb/t2;->S(Ljava/io/File;)Ljava/util/Map;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-static {p0}, Lfb/t2;->a0(Ljava/util/Map;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 44
    .line 45
    .line 46
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    goto :goto_0

    .line 48
    :catchall_0
    move-exception p0

    .line 49
    new-instance v0, Lsf/f;

    .line 50
    .line 51
    invoke-direct {v0, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    move-object p0, v0

    .line 55
    :goto_0
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 56
    .line 57
    instance-of v1, p0, Lsf/f;

    .line 58
    .line 59
    if-eqz v1, :cond_1

    .line 60
    .line 61
    move-object p0, v0

    .line 62
    :cond_1
    check-cast p0, Ljava/lang/Boolean;

    .line 63
    .line 64
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    return p0

    .line 69
    :cond_2
    :goto_1
    const/4 p0, 0x0

    .line 70
    return p0
.end method
