.class public final Lh9/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final e:Ljava/util/List;


# instance fields
.field public final a:Lr8/g;

.field public final b:Lab/b;

.field public final c:Landroid/content/SharedPreferences;

.field public volatile d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const-string v0, "MicroMsg.SLocationListener"

    .line 2
    .line 3
    filled-new-array {v0}, [Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "MicroMsg.SLocationListenerWgs84"

    .line 8
    .line 9
    filled-new-array {v1}, [Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, "MicroMsg.DefaultTencentLocationManager"

    .line 14
    .line 15
    const-string v3, "[mlocationListener]error:%d, reason:%s"

    .line 16
    .line 17
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    filled-new-array {v0, v1, v2}, [[Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sput-object v0, Lh9/b;->e:Ljava/util/List;

    .line 30
    .line 31
    return-void
.end method

.method public constructor <init>(Lr8/g;Lab/b;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lh9/b;->a:Lr8/g;

    .line 8
    .line 9
    iput-object p2, p0, Lh9/b;->b:Lab/b;

    .line 10
    .line 11
    iget-object p1, p1, Lr8/g;->a:Landroid/content/Context;

    .line 12
    .line 13
    const-string p2, "Hchat_fake_location_method_cache"

    .line 14
    .line 15
    invoke-static {p1, p2}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, Lh9/b;->c:Landroid/content/SharedPreferences;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final a()Ljava/util/ArrayList;
    .locals 14

    .line 1
    iget-object v0, p0, Lh9/b;->a:Lr8/g;

    .line 2
    .line 3
    iget-object v1, v0, Lr8/g;->a:Landroid/content/Context;

    .line 4
    .line 5
    iget-object v2, v0, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 6
    .line 7
    invoke-static {v1, v2}, Le8/b;->g(Landroid/content/Context;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v3, p0, Lh9/b;->c:Landroid/content/SharedPreferences;

    .line 12
    .line 13
    const-string v4, "location_callbacks_v1"

    .line 14
    .line 15
    invoke-static {v3, v1, v2, v4}, Le8/b;->f(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    new-instance v6, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    :cond_0
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v7

    .line 32
    if-eqz v7, :cond_1

    .line 33
    .line 34
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v7

    .line 38
    move-object v8, v7

    .line 39
    check-cast v8, Ljava/lang/reflect/Method;

    .line 40
    .line 41
    invoke-static {v8}, Lig/a;->c(Ljava/lang/reflect/Method;)Z

    .line 42
    .line 43
    .line 44
    move-result v8

    .line 45
    if-eqz v8, :cond_0

    .line 46
    .line 47
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    const/4 v7, 0x0

    .line 56
    if-nez v5, :cond_2

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    move-object v6, v7

    .line 60
    :goto_1
    if-eqz v6, :cond_3

    .line 61
    .line 62
    return-object v6

    .line 63
    :cond_3
    new-instance v5, Ljava/util/LinkedHashSet;

    .line 64
    .line 65
    invoke-direct {v5}, Ljava/util/LinkedHashSet;-><init>()V

    .line 66
    .line 67
    .line 68
    sget-object v6, Lh9/b;->e:Ljava/util/List;

    .line 69
    .line 70
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    :cond_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v8

    .line 78
    iget-object v9, p0, Lh9/b;->b:Lab/b;

    .line 79
    .line 80
    if-eqz v8, :cond_9

    .line 81
    .line 82
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v8

    .line 86
    check-cast v8, [Ljava/lang/String;

    .line 87
    .line 88
    :try_start_0
    iget-object v10, v0, Lr8/g;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 89
    .line 90
    new-instance v11, Lch/e;

    .line 91
    .line 92
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 93
    .line 94
    .line 95
    new-instance v12, Lfh/k;

    .line 96
    .line 97
    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    .line 98
    .line 99
    .line 100
    array-length v13, v8

    .line 101
    invoke-static {v8, v13}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v13

    .line 105
    check-cast v13, [Ljava/lang/String;

    .line 106
    .line 107
    invoke-virtual {v12, v13}, Lfh/k;->r0([Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    iput-object v12, v11, Lch/e;->h:Lfh/k;

    .line 111
    .line 112
    invoke-virtual {v10, v11}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 113
    .line 114
    .line 115
    move-result-object v10
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 116
    goto :goto_2

    .line 117
    :catchall_0
    move-exception v10

    .line 118
    new-instance v11, Lsf/f;

    .line 119
    .line 120
    invoke-direct {v11, v10}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 121
    .line 122
    .line 123
    move-object v10, v11

    .line 124
    :goto_2
    invoke-static {v10}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 125
    .line 126
    .line 127
    move-result-object v11

    .line 128
    if-nez v11, :cond_5

    .line 129
    .line 130
    goto :goto_3

    .line 131
    :cond_5
    const/16 v10, 0x3f

    .line 132
    .line 133
    invoke-static {v8, v7, v10}, Ltf/l;->F0([Ljava/lang/Object;Lfg/l;I)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v8

    .line 137
    const-string v10, "\u5b9a\u4f4d\u5fae\u4fe1\u5b9a\u4f4d\u56de\u8c03\u5931\u8d25: "

    .line 138
    .line 139
    invoke-virtual {v10, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v8

    .line 143
    invoke-virtual {v9, v8, v11}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    sget-object v10, Ltf/t;->g:Ltf/t;

    .line 147
    .line 148
    :goto_3
    check-cast v10, Ljava/util/List;

    .line 149
    .line 150
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 151
    .line 152
    .line 153
    move-result-object v8

    .line 154
    :cond_6
    :goto_4
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 155
    .line 156
    .line 157
    move-result v9

    .line 158
    if-eqz v9, :cond_4

    .line 159
    .line 160
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v9

    .line 164
    check-cast v9, Lhh/o;

    .line 165
    .line 166
    :try_start_1
    invoke-virtual {v9, v2}, Lhh/o;->r(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 167
    .line 168
    .line 169
    move-result-object v9
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 170
    goto :goto_5

    .line 171
    :catchall_1
    move-exception v9

    .line 172
    new-instance v10, Lsf/f;

    .line 173
    .line 174
    invoke-direct {v10, v9}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 175
    .line 176
    .line 177
    move-object v9, v10

    .line 178
    :goto_5
    nop

    .line 179
    instance-of v10, v9, Lsf/f;

    .line 180
    .line 181
    if-eqz v10, :cond_7

    .line 182
    .line 183
    move-object v9, v7

    .line 184
    :cond_7
    check-cast v9, Ljava/lang/reflect/Method;

    .line 185
    .line 186
    if-eqz v9, :cond_8

    .line 187
    .line 188
    invoke-static {v9}, Lig/a;->c(Ljava/lang/reflect/Method;)Z

    .line 189
    .line 190
    .line 191
    move-result v10

    .line 192
    if-eqz v10, :cond_8

    .line 193
    .line 194
    goto :goto_6

    .line 195
    :cond_8
    move-object v9, v7

    .line 196
    :goto_6
    if-eqz v9, :cond_6

    .line 197
    .line 198
    invoke-interface {v5, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    goto :goto_4

    .line 202
    :cond_9
    new-instance v0, Ljava/util/HashSet;

    .line 203
    .line 204
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 205
    .line 206
    .line 207
    new-instance v2, Ljava/util/ArrayList;

    .line 208
    .line 209
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 210
    .line 211
    .line 212
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 213
    .line 214
    .line 215
    move-result-object v5

    .line 216
    :cond_a
    :goto_7
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 217
    .line 218
    .line 219
    move-result v6

    .line 220
    if-eqz v6, :cond_b

    .line 221
    .line 222
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v6

    .line 226
    move-object v8, v6

    .line 227
    check-cast v8, Ljava/lang/reflect/Method;

    .line 228
    .line 229
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v8

    .line 233
    invoke-virtual {v0, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move-result v8

    .line 237
    if-eqz v8, :cond_a

    .line 238
    .line 239
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    goto :goto_7

    .line 243
    :cond_b
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 244
    .line 245
    .line 246
    move-result v0

    .line 247
    if-eqz v0, :cond_d

    .line 248
    .line 249
    const-string v0, "cache.key"

    .line 250
    .line 251
    :try_start_2
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 252
    .line 253
    .line 254
    move-result-object v5

    .line 255
    const-string v6, ""

    .line 256
    .line 257
    invoke-interface {v3, v0, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v3

    .line 261
    invoke-static {v3, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    move-result v3

    .line 265
    if-nez v3, :cond_c

    .line 266
    .line 267
    invoke-interface {v5}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 268
    .line 269
    .line 270
    move-result-object v3

    .line 271
    invoke-interface {v3, v0, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 272
    .line 273
    .line 274
    :cond_c
    invoke-interface {v5, v4}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 279
    .line 280
    .line 281
    :catchall_2
    const-string v0, "\u672a\u627e\u5230\u5fae\u4fe1\u5b9a\u4f4d\u56de\u8c03\u65b9\u6cd5"

    .line 282
    .line 283
    invoke-virtual {v9, v0, v7}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    goto :goto_8

    .line 287
    :cond_d
    sget-object v0, Le8/b;->a:Le8/b;

    .line 288
    .line 289
    invoke-virtual {v0, v3, v1, v4, v2}, Le8/b;->j(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 290
    .line 291
    .line 292
    :goto_8
    return-object v2
.end method
