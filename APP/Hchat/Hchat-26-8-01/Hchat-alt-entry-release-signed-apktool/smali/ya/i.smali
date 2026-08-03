.class public abstract Lya/i;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static volatile b:Lr8/g;

.field public static volatile c:Ljava/lang/reflect/Method;

.field public static volatile d:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lya/i;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    return-void
.end method

.method public static a(Lr8/g;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sput-object p0, Lya/i;->b:Lr8/g;

    .line 5
    .line 6
    sget-object v0, Lya/i;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {v0, v2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    invoke-static {p0, v2}, Lya/i;->d(Lr8/g;Z)Ljava/lang/reflect/Method;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->database()Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    invoke-static {v1, v0}, Lya/i;->g(Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;Ljava/lang/reflect/Method;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    :cond_1
    sget-object v0, Lr8/e;->a:Landroid/os/Handler;

    .line 34
    .line 35
    sget-object v0, Lr8/c;->j:Lr8/c;

    .line 36
    .line 37
    new-instance v1, Lc9/f;

    .line 38
    .line 39
    const/16 v2, 0x9

    .line 40
    .line 41
    invoke-direct {v1, p0, v2}, Lc9/f;-><init>(Lr8/g;I)V

    .line 42
    .line 43
    .line 44
    const/16 p0, 0x8

    .line 45
    .line 46
    const-string v2, "quick_mark_read:native_mark_read"

    .line 47
    .line 48
    const-string v3, "\u5feb\u6377\u5df2\u8bfb\u539f\u751f\u5df2\u8bfb\u5165\u53e3"

    .line 49
    .line 50
    invoke-static {p0, v1, v2, v3, v0}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public static b(Ljava/lang/reflect/Method;)Z
    .locals 3

    .line 1
    invoke-static {p0}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Method;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 18
    .line 19
    invoke-static {v0, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-nez v2, :cond_1

    .line 24
    .line 25
    const-class v2, Ljava/lang/Boolean;

    .line 26
    .line 27
    invoke-static {v0, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    :cond_1
    array-length v0, p0

    .line 34
    const/4 v2, 0x1

    .line 35
    if-ne v0, v2, :cond_2

    .line 36
    .line 37
    aget-object p0, p0, v1

    .line 38
    .line 39
    const-class v0, Ljava/lang/String;

    .line 40
    .line 41
    invoke-static {p0, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    if-eqz p0, :cond_2

    .line 46
    .line 47
    return v2

    .line 48
    :cond_2
    :goto_0
    return v1
.end method

.method public static final c(Landroid/content/Context;)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const-string v1, "Hchat_quick_mark_read_config"

    .line 6
    .line 7
    invoke-static {p0, v1}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const-string v1, "plus_menu_read_enable"

    .line 12
    .line 13
    invoke-interface {p0, v1, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
.end method

.method public static d(Lr8/g;Z)Ljava/lang/reflect/Method;
    .locals 10

    .line 1
    iget-object v0, p0, Lr8/g;->a:Landroid/content/Context;

    .line 2
    .line 3
    const-string v1, "Hchat_quick_mark_read_method_cache"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lr8/g;->a:Landroid/content/Context;

    .line 10
    .line 11
    iget-object v2, p0, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-static {v1, v2}, Lo8/k;->a(Landroid/content/Context;Ljava/lang/ClassLoader;)Ll8/i;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    iget-object v1, v1, Ll8/i;->h:Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    const/4 v3, 0x0

    .line 27
    if-nez v2, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move-object v1, v3

    .line 31
    :goto_0
    if-eqz v1, :cond_1

    .line 32
    .line 33
    const-string v2, "|quick_mark_read_native_v1"

    .line 34
    .line 35
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    move-object v1, v3

    .line 41
    :goto_1
    const-string v2, ""

    .line 42
    .line 43
    if-nez v1, :cond_2

    .line 44
    .line 45
    move-object v1, v2

    .line 46
    :cond_2
    iget-object v4, p0, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 47
    .line 48
    const-string v5, "native_mark_read"

    .line 49
    .line 50
    invoke-static {v0, v1, v4, v5}, Le8/b;->c(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    if-eqz v4, :cond_3

    .line 55
    .line 56
    invoke-static {v4}, Lya/i;->b(Ljava/lang/reflect/Method;)Z

    .line 57
    .line 58
    .line 59
    move-result v6

    .line 60
    if-eqz v6, :cond_3

    .line 61
    .line 62
    sput-object v4, Lya/i;->c:Ljava/lang/reflect/Method;

    .line 63
    .line 64
    return-object v4

    .line 65
    :cond_3
    if-eqz v4, :cond_4

    .line 66
    .line 67
    invoke-static {v0, v1, v5}, Le8/b;->a(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    sput-object v3, Lya/i;->c:Ljava/lang/reflect/Method;

    .line 71
    .line 72
    sput-object v3, Lya/i;->d:Ljava/lang/Object;

    .line 73
    .line 74
    :cond_4
    if-nez p1, :cond_5

    .line 75
    .line 76
    return-object v3

    .line 77
    :cond_5
    :try_start_0
    iget-object p1, p0, Lr8/g;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 78
    .line 79
    new-instance v4, Lch/e;

    .line 80
    .line 81
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 82
    .line 83
    .line 84
    new-instance v6, Lfh/k;

    .line 85
    .line 86
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 87
    .line 88
    .line 89
    const-string v7, "updateUnreadByTalker %s"

    .line 90
    .line 91
    const-string v8, "unReadMuteCount"

    .line 92
    .line 93
    const-string v9, "atCount"

    .line 94
    .line 95
    filled-new-array {v7, v8, v9}, [Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v7

    .line 99
    invoke-virtual {v6, v7}, Lfh/k;->r0([Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    iput-object v6, v4, Lch/e;->h:Lfh/k;

    .line 103
    .line 104
    invoke-virtual {p1, v4}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    new-instance v4, Ljava/util/ArrayList;

    .line 109
    .line 110
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 118
    .line 119
    .line 120
    move-result v6

    .line 121
    if-eqz v6, :cond_6

    .line 122
    .line 123
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v6

    .line 127
    check-cast v6, Lhh/o;

    .line 128
    .line 129
    iget-object v7, p0, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 130
    .line 131
    invoke-virtual {v6, v7}, Lhh/o;->r(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 132
    .line 133
    .line 134
    move-result-object v6

    .line 135
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 136
    .line 137
    .line 138
    goto :goto_2

    .line 139
    :catchall_0
    move-exception p0

    .line 140
    new-instance v4, Lsf/f;

    .line 141
    .line 142
    invoke-direct {v4, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 143
    .line 144
    .line 145
    :cond_6
    invoke-static {v4}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    if-nez p0, :cond_7

    .line 150
    .line 151
    goto :goto_3

    .line 152
    :cond_7
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    const-string v4, "[Hchat:QuickRead] DexKit \u5b9a\u4f4d\u539f\u751f\u5df2\u8bfb\u5165\u53e3\u5931\u8d25: "

    .line 157
    .line 158
    invoke-static {v4, p1, p0}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 159
    .line 160
    .line 161
    sget-object v4, Ltf/t;->g:Ltf/t;

    .line 162
    .line 163
    :goto_3
    check-cast v4, Ljava/util/List;

    .line 164
    .line 165
    new-instance p0, Ljava/util/ArrayList;

    .line 166
    .line 167
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 168
    .line 169
    .line 170
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    :cond_8
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 175
    .line 176
    .line 177
    move-result v4

    .line 178
    if-eqz v4, :cond_9

    .line 179
    .line 180
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v4

    .line 184
    move-object v6, v4

    .line 185
    check-cast v6, Ljava/lang/reflect/Method;

    .line 186
    .line 187
    invoke-static {v6}, Lya/i;->b(Ljava/lang/reflect/Method;)Z

    .line 188
    .line 189
    .line 190
    move-result v6

    .line 191
    if-eqz v6, :cond_8

    .line 192
    .line 193
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    goto :goto_4

    .line 197
    :cond_9
    new-instance p1, Ljava/util/HashSet;

    .line 198
    .line 199
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 200
    .line 201
    .line 202
    new-instance v4, Ljava/util/ArrayList;

    .line 203
    .line 204
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 205
    .line 206
    .line 207
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 208
    .line 209
    .line 210
    move-result-object p0

    .line 211
    :cond_a
    :goto_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 212
    .line 213
    .line 214
    move-result v6

    .line 215
    if-eqz v6, :cond_b

    .line 216
    .line 217
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v6

    .line 221
    move-object v7, v6

    .line 222
    check-cast v7, Ljava/lang/reflect/Method;

    .line 223
    .line 224
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v7

    .line 228
    invoke-virtual {p1, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    move-result v7

    .line 232
    if-eqz v7, :cond_a

    .line 233
    .line 234
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    goto :goto_5

    .line 238
    :cond_b
    invoke-static {v4}, Ltf/m;->I1(Ljava/util/List;)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object p0

    .line 242
    check-cast p0, Ljava/lang/reflect/Method;

    .line 243
    .line 244
    if-eqz p0, :cond_c

    .line 245
    .line 246
    sput-object p0, Lya/i;->c:Ljava/lang/reflect/Method;

    .line 247
    .line 248
    sput-object v3, Lya/i;->d:Ljava/lang/Object;

    .line 249
    .line 250
    invoke-static {v0, v1, v5, p0}, Le8/b;->h(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 251
    .line 252
    .line 253
    return-object p0

    .line 254
    :cond_c
    const-string p0, "cache.key"

    .line 255
    .line 256
    :try_start_1
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 257
    .line 258
    .line 259
    move-result-object p1

    .line 260
    invoke-interface {v0, p0, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    move-result v0

    .line 268
    if-nez v0, :cond_d

    .line 269
    .line 270
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    invoke-interface {v0, p0, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 275
    .line 276
    .line 277
    :cond_d
    invoke-interface {p1, v5}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 278
    .line 279
    .line 280
    move-result-object p0

    .line 281
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 282
    .line 283
    .line 284
    :catchall_1
    sput-object v3, Lya/i;->c:Ljava/lang/reflect/Method;

    .line 285
    .line 286
    sput-object v3, Lya/i;->d:Ljava/lang/Object;

    .line 287
    .line 288
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 289
    .line 290
    .line 291
    move-result p0

    .line 292
    new-instance p1, Ljava/lang/StringBuilder;

    .line 293
    .line 294
    const-string v0, "[Hchat:QuickRead] \u539f\u751f\u5df2\u8bfb\u5165\u53e3\u5b9a\u4f4d\u5931\u8d25\uff0c\u5019\u9009\u6570="

    .line 295
    .line 296
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 300
    .line 301
    .line 302
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object p0

    .line 306
    invoke-static {p0}, Lfb/v0;->m(Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    return-object v3
.end method

.method public static final e(Landroid/content/Context;Z)I
    .locals 10

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    move-object p0, v0

    .line 10
    :cond_0
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->database()Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, "\u6570\u636e\u5e93\u672a\u5c31\u7eea"

    .line 15
    .line 16
    const/4 v2, -0x1

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    if-eqz p1, :cond_b

    .line 20
    .line 21
    invoke-static {p0, v1}, Lya/i;->h(Landroid/content/Context;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return v2

    .line 25
    :cond_1
    const-string v3, "SELECT username FROM rconversation WHERE IFNULL(unReadCount,0)>0 OR IFNULL(unReadMuteCount,0)>0 OR IFNULL(atCount,0)>0"

    .line 26
    .line 27
    const/4 v4, 0x0

    .line 28
    invoke-virtual {v0, v3, v4}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->query(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    new-instance v5, Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    :cond_2
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    if-eqz v6, :cond_4

    .line 49
    .line 50
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    check-cast v6, Ljava/util/Map;

    .line 55
    .line 56
    const-string v7, "username"

    .line 57
    .line 58
    invoke-interface {v6, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    if-eqz v6, :cond_3

    .line 63
    .line 64
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    if-eqz v6, :cond_3

    .line 69
    .line 70
    invoke-static {v6}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 71
    .line 72
    .line 73
    move-result v7

    .line 74
    if-nez v7, :cond_3

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_3
    move-object v6, v4

    .line 78
    :goto_1
    if-eqz v6, :cond_2

    .line 79
    .line 80
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_4
    invoke-static {v5}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    invoke-static {v3}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    invoke-virtual {v0}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->isReady()Z

    .line 93
    .line 94
    .line 95
    move-result v5

    .line 96
    if-nez v5, :cond_5

    .line 97
    .line 98
    if-eqz p1, :cond_b

    .line 99
    .line 100
    invoke-static {p0, v1}, Lya/i;->h(Landroid/content/Context;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    return v2

    .line 104
    :cond_5
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    const/4 v5, 0x0

    .line 109
    if-eqz v1, :cond_7

    .line 110
    .line 111
    if-eqz p1, :cond_6

    .line 112
    .line 113
    const-string p1, "\u6ca1\u6709\u672a\u8bfb\u4f1a\u8bdd"

    .line 114
    .line 115
    invoke-static {p0, p1}, Lya/i;->h(Landroid/content/Context;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    :cond_6
    return v5

    .line 119
    :cond_7
    sget-object v1, Lya/i;->c:Ljava/lang/reflect/Method;

    .line 120
    .line 121
    if-eqz v1, :cond_8

    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_8
    sget-object v1, Lya/i;->b:Lr8/g;

    .line 125
    .line 126
    if-eqz v1, :cond_9

    .line 127
    .line 128
    invoke-static {v1, v5}, Lya/i;->d(Lr8/g;Z)Ljava/lang/reflect/Method;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    goto :goto_2

    .line 133
    :cond_9
    move-object v1, v4

    .line 134
    :goto_2
    if-nez v1, :cond_a

    .line 135
    .line 136
    if-eqz p1, :cond_b

    .line 137
    .line 138
    const-string p1, "\u539f\u751f\u5df2\u8bfb\u5165\u53e3\u672a\u5c31\u7eea"

    .line 139
    .line 140
    invoke-static {p0, p1}, Lya/i;->h(Landroid/content/Context;Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    return v2

    .line 144
    :cond_a
    invoke-static {v0, v1}, Lya/i;->g(Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;Ljava/lang/reflect/Method;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    if-nez v0, :cond_c

    .line 149
    .line 150
    if-eqz p1, :cond_b

    .line 151
    .line 152
    const-string p1, "\u539f\u751f\u4f1a\u8bdd\u5b58\u50a8\u672a\u5c31\u7eea"

    .line 153
    .line 154
    invoke-static {p0, p1}, Lya/i;->h(Landroid/content/Context;Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    :cond_b
    return v2

    .line 158
    :cond_c
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    :cond_d
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 163
    .line 164
    .line 165
    move-result v6

    .line 166
    if-eqz v6, :cond_11

    .line 167
    .line 168
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v6

    .line 172
    check-cast v6, Ljava/lang/String;

    .line 173
    .line 174
    :try_start_0
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v7

    .line 178
    invoke-static {v1, v0, v7}, Lh/Hchat/utils/KavaReflector;->invokeOrThrow(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v7

    .line 182
    instance-of v8, v7, Ljava/lang/Boolean;

    .line 183
    .line 184
    if-eqz v8, :cond_e

    .line 185
    .line 186
    check-cast v7, Ljava/lang/Boolean;

    .line 187
    .line 188
    goto :goto_4

    .line 189
    :catchall_0
    move-exception v7

    .line 190
    goto :goto_5

    .line 191
    :cond_e
    move-object v7, v4

    .line 192
    :goto_4
    sget-object v8, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 193
    .line 194
    invoke-static {v7, v8}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result v7

    .line 198
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 199
    .line 200
    .line 201
    move-result-object v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 202
    goto :goto_6

    .line 203
    :goto_5
    new-instance v8, Lsf/f;

    .line 204
    .line 205
    invoke-direct {v8, v7}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 206
    .line 207
    .line 208
    move-object v7, v8

    .line 209
    :goto_6
    invoke-static {v7}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 210
    .line 211
    .line 212
    move-result-object v8

    .line 213
    if-eqz v8, :cond_f

    .line 214
    .line 215
    const-string v9, "[Hchat:QuickRead] \u8c03\u7528\u539f\u751f\u5df2\u8bfb\u5931\u8d25: "

    .line 216
    .line 217
    invoke-static {v9, v6, v8}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 218
    .line 219
    .line 220
    :cond_f
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 221
    .line 222
    instance-of v8, v7, Lsf/f;

    .line 223
    .line 224
    if-eqz v8, :cond_10

    .line 225
    .line 226
    move-object v7, v6

    .line 227
    :cond_10
    check-cast v7, Ljava/lang/Boolean;

    .line 228
    .line 229
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 230
    .line 231
    .line 232
    move-result v6

    .line 233
    if-eqz v6, :cond_d

    .line 234
    .line 235
    add-int/lit8 v5, v5, 0x1

    .line 236
    .line 237
    goto :goto_3

    .line 238
    :cond_11
    if-gtz v5, :cond_13

    .line 239
    .line 240
    if-eqz p1, :cond_12

    .line 241
    .line 242
    const-string p1, "\u5168\u90e8\u5df2\u8bfb\u5931\u8d25"

    .line 243
    .line 244
    invoke-static {p0, p1}, Lya/i;->h(Landroid/content/Context;Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    :cond_12
    const-string p0, "[Hchat:QuickRead] \u539f\u751f\u5df2\u8bfb\u672a\u6210\u529f\u5904\u7406\u4f1a\u8bdd"

    .line 248
    .line 249
    invoke-static {p0}, Lfb/v0;->m(Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    return v2

    .line 253
    :cond_13
    if-nez p0, :cond_14

    .line 254
    .line 255
    goto :goto_a

    .line 256
    :cond_14
    :try_start_1
    const-string v0, "notification"

    .line 257
    .line 258
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    instance-of v1, v0, Landroid/app/NotificationManager;

    .line 263
    .line 264
    if-eqz v1, :cond_15

    .line 265
    .line 266
    check-cast v0, Landroid/app/NotificationManager;

    .line 267
    .line 268
    goto :goto_7

    .line 269
    :catchall_1
    move-exception v0

    .line 270
    goto :goto_8

    .line 271
    :cond_15
    move-object v0, v4

    .line 272
    :goto_7
    if-eqz v0, :cond_16

    .line 273
    .line 274
    invoke-virtual {v0}, Landroid/app/NotificationManager;->cancelAll()V

    .line 275
    .line 276
    .line 277
    sget-object v4, Lsf/n;->a:Lsf/n;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 278
    .line 279
    goto :goto_9

    .line 280
    :goto_8
    new-instance v4, Lsf/f;

    .line 281
    .line 282
    invoke-direct {v4, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 283
    .line 284
    .line 285
    :cond_16
    :goto_9
    invoke-static {v4}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    if-eqz v0, :cond_17

    .line 290
    .line 291
    const-string v1, "[Hchat:QuickRead] \u6e05\u7406\u5fae\u4fe1\u901a\u77e5\u5931\u8d25"

    .line 292
    .line 293
    invoke-static {v1, v0}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 294
    .line 295
    .line 296
    :cond_17
    :goto_a
    if-eqz p1, :cond_18

    .line 297
    .line 298
    new-instance p1, Ljava/lang/StringBuilder;

    .line 299
    .line 300
    const-string v0, "\u5df2\u8bfb "

    .line 301
    .line 302
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 306
    .line 307
    .line 308
    const-string v0, " \u4e2a\u4f1a\u8bdd"

    .line 309
    .line 310
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 311
    .line 312
    .line 313
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object p1

    .line 317
    invoke-static {p0, p1}, Lya/i;->h(Landroid/content/Context;Ljava/lang/String;)V

    .line 318
    .line 319
    .line 320
    :cond_18
    return v5
.end method

.method public static final f(Landroid/content/Context;Ljava/lang/String;Z)Z
    .locals 4

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    move-object p0, v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    if-eqz p1, :cond_1

    .line 12
    .line 13
    invoke-static {p1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    move-object p1, v0

    .line 23
    :goto_0
    if-nez p1, :cond_2

    .line 24
    .line 25
    const-string p1, ""

    .line 26
    .line 27
    :cond_2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    const/4 v2, 0x0

    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    if-eqz p2, :cond_e

    .line 35
    .line 36
    const-string p1, "\u4f1a\u8bdd\u65e0\u6548"

    .line 37
    .line 38
    invoke-static {p0, p1}, Lya/i;->h(Landroid/content/Context;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    return v2

    .line 42
    :cond_3
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->database()Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    if-eqz v1, :cond_d

    .line 47
    .line 48
    invoke-virtual {v1}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->isReady()Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-nez v3, :cond_4

    .line 53
    .line 54
    goto/16 :goto_5

    .line 55
    .line 56
    :cond_4
    sget-object v3, Lya/i;->c:Ljava/lang/reflect/Method;

    .line 57
    .line 58
    if-eqz v3, :cond_5

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_5
    sget-object v3, Lya/i;->b:Lr8/g;

    .line 62
    .line 63
    if-eqz v3, :cond_6

    .line 64
    .line 65
    invoke-static {v3, v2}, Lya/i;->d(Lr8/g;Z)Ljava/lang/reflect/Method;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    goto :goto_1

    .line 70
    :cond_6
    move-object v3, v0

    .line 71
    :goto_1
    if-nez v3, :cond_7

    .line 72
    .line 73
    if-eqz p2, :cond_e

    .line 74
    .line 75
    const-string p1, "\u539f\u751f\u5df2\u8bfb\u5165\u53e3\u672a\u5c31\u7eea"

    .line 76
    .line 77
    invoke-static {p0, p1}, Lya/i;->h(Landroid/content/Context;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    return v2

    .line 81
    :cond_7
    invoke-static {v1, v3}, Lya/i;->g(Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;Ljava/lang/reflect/Method;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    if-nez v1, :cond_8

    .line 86
    .line 87
    if-eqz p2, :cond_e

    .line 88
    .line 89
    const-string p1, "\u539f\u751f\u4f1a\u8bdd\u5b58\u50a8\u672a\u5c31\u7eea"

    .line 90
    .line 91
    invoke-static {p0, p1}, Lya/i;->h(Landroid/content/Context;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    return v2

    .line 95
    :cond_8
    :try_start_0
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    invoke-static {v3, v1, v2}, Lh/Hchat/utils/KavaReflector;->invokeOrThrow(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    instance-of v2, v1, Ljava/lang/Boolean;

    .line 104
    .line 105
    if-eqz v2, :cond_9

    .line 106
    .line 107
    move-object v0, v1

    .line 108
    check-cast v0, Ljava/lang/Boolean;

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :catchall_0
    move-exception v0

    .line 112
    goto :goto_3

    .line 113
    :cond_9
    :goto_2
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 114
    .line 115
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 120
    .line 121
    .line 122
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 123
    goto :goto_4

    .line 124
    :goto_3
    new-instance v1, Lsf/f;

    .line 125
    .line 126
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 127
    .line 128
    .line 129
    move-object v0, v1

    .line 130
    :goto_4
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    if-eqz v1, :cond_a

    .line 135
    .line 136
    const-string v2, "[Hchat:QuickRead] \u8c03\u7528\u539f\u751f\u5df2\u8bfb\u5931\u8d25: "

    .line 137
    .line 138
    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    invoke-static {p1, v1}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 143
    .line 144
    .line 145
    :cond_a
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 146
    .line 147
    instance-of v1, v0, Lsf/f;

    .line 148
    .line 149
    if-eqz v1, :cond_b

    .line 150
    .line 151
    move-object v0, p1

    .line 152
    :cond_b
    check-cast v0, Ljava/lang/Boolean;

    .line 153
    .line 154
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 155
    .line 156
    .line 157
    move-result p1

    .line 158
    if-nez p1, :cond_c

    .line 159
    .line 160
    if-eqz p2, :cond_c

    .line 161
    .line 162
    const-string p2, "\u4f1a\u8bdd\u5df2\u8bfb\u5931\u8d25"

    .line 163
    .line 164
    invoke-static {p0, p2}, Lya/i;->h(Landroid/content/Context;Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    :cond_c
    return p1

    .line 168
    :cond_d
    :goto_5
    if-eqz p2, :cond_e

    .line 169
    .line 170
    const-string p1, "\u6570\u636e\u5e93\u672a\u5c31\u7eea"

    .line 171
    .line 172
    invoke-static {p0, p1}, Lya/i;->h(Landroid/content/Context;Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    :cond_e
    return v2
.end method

.method public static g(Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;Ljava/lang/reflect/Method;)Ljava/lang/Object;
    .locals 3

    .line 1
    sget-object v0, Lya/i;->d:Ljava/lang/Object;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    invoke-virtual {v2, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_0
    sput-object v1, Lya/i;->d:Ljava/lang/Object;

    .line 18
    .line 19
    :cond_1
    invoke-virtual {p0, p1}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->storageObjectForMethod(Ljava/lang/reflect/Method;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    if-eqz p0, :cond_2

    .line 24
    .line 25
    sput-object p0, Lya/i;->d:Ljava/lang/Object;

    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_2
    return-object v1
.end method

.method public static h(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance v0, Landroid/os/Handler;

    .line 5
    .line 6
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 11
    .line 12
    .line 13
    new-instance v1, Leb/w;

    .line 14
    .line 15
    const/16 v2, 0x8

    .line 16
    .line 17
    invoke-direct {v1, p0, p1, v2}, Leb/w;-><init>(Landroid/content/Context;Ljava/lang/String;I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 21
    .line 22
    .line 23
    return-void
.end method
