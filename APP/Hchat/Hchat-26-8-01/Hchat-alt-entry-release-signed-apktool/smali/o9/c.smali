.class public final Lo9/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Lo9/c;

.field public static volatile b:Z

.field public static volatile c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lo9/c;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lo9/c;->a:Lo9/c;

    .line 7
    .line 8
    return-void
.end method

.method public static a(Ljava/lang/String;ICC)Lo9/b;
    .locals 2

    .line 1
    add-int/lit8 p1, p1, -0x1

    .line 2
    .line 3
    :goto_0
    if-lez p1, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-static {v0}, La/a;->v0(C)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    const/16 v1, 0xa0

    .line 16
    .line 17
    if-eq v0, v1, :cond_0

    .line 18
    .line 19
    const/16 v1, 0x3000

    .line 20
    .line 21
    if-ne v0, v1, :cond_1

    .line 22
    .line 23
    :cond_0
    add-int/lit8 p1, p1, -0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    if-lez p1, :cond_5

    .line 27
    .line 28
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eq v0, p3, :cond_2

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_2
    const/4 p3, 0x4

    .line 36
    invoke-static {p0, p2, p1, p3}, Log/m;->w0(Ljava/lang/String;CII)I

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    if-ltz p2, :cond_5

    .line 41
    .line 42
    add-int/lit8 p2, p2, 0x1

    .line 43
    .line 44
    if-lt p2, p1, :cond_3

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_3
    invoke-virtual {p0, p2, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 60
    .line 61
    .line 62
    move-result p3

    .line 63
    if-nez p3, :cond_4

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_4
    new-instance p3, Lo9/b;

    .line 67
    .line 68
    invoke-direct {p3, p0, p2, p1}, Lo9/b;-><init>(Ljava/lang/String;II)V

    .line 69
    .line 70
    .line 71
    return-object p3

    .line 72
    :cond_5
    :goto_1
    const/4 p0, 0x0

    .line 73
    return-object p0
.end method

.method public static d(Ljava/lang/reflect/Method;)Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p0, :cond_1

    .line 7
    .line 8
    array-length v1, p0

    .line 9
    const/4 v2, 0x2

    .line 10
    if-lt v1, v2, :cond_1

    .line 11
    .line 12
    array-length v1, p0

    .line 13
    move v2, v0

    .line 14
    :goto_0
    if-ge v2, v1, :cond_1

    .line 15
    .line 16
    aget-object v3, p0, v2

    .line 17
    .line 18
    const-class v4, Landroid/view/View;

    .line 19
    .line 20
    invoke-virtual {v4, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_0

    .line 25
    .line 26
    const/4 p0, 0x1

    .line 27
    return p0

    .line 28
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    return v0
.end method

.method public static e(Ljava/lang/String;)Lo9/b;
    .locals 3

    .line 1
    const-string v0, "\u9000\u51fa\u4e86\u7fa4\u804a"

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    invoke-static {v1, p0, v0}, Log/m;->v0(ILjava/lang/String;Ljava/lang/String;)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-gtz v0, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    add-int/lit8 v0, v0, -0x1

    .line 12
    .line 13
    :goto_0
    if-lez v0, :cond_2

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-static {v1}, La/a;->v0(C)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-nez v2, :cond_1

    .line 24
    .line 25
    const/16 v2, 0xa0

    .line 26
    .line 27
    if-eq v1, v2, :cond_1

    .line 28
    .line 29
    const/16 v2, 0x3000

    .line 30
    .line 31
    if-ne v1, v2, :cond_2

    .line 32
    .line 33
    :cond_1
    add-int/lit8 v0, v0, -0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    if-lez v0, :cond_6

    .line 37
    .line 38
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    const/16 v2, 0x5d

    .line 43
    .line 44
    if-eq v1, v2, :cond_3

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_3
    const/16 v1, 0x5b

    .line 48
    .line 49
    const/4 v2, 0x4

    .line 50
    invoke-static {p0, v1, v0, v2}, Log/m;->w0(Ljava/lang/String;CII)I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-ltz v1, :cond_6

    .line 55
    .line 56
    add-int/lit8 v1, v1, 0x1

    .line 57
    .line 58
    if-lt v1, v0, :cond_4

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_4
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-nez v2, :cond_5

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_5
    new-instance v2, Lo9/b;

    .line 81
    .line 82
    invoke-direct {v2, p0, v1, v0}, Lo9/b;-><init>(Ljava/lang/String;II)V

    .line 83
    .line 84
    .line 85
    return-object v2

    .line 86
    :cond_6
    :goto_1
    const/4 p0, 0x0

    .line 87
    return-object p0
.end method

.method public static f(Lr8/g;ZLfg/p;)Ljava/util/List;
    .locals 11

    .line 1
    iget-object v0, p0, Lr8/g;->a:Landroid/content/Context;

    .line 2
    .line 3
    const-string v1, "Hchat_group_leave_monitor_method_cache"

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
    invoke-static {v1, v2}, Le8/b;->g(Landroid/content/Context;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    const/4 v4, 0x0

    .line 22
    if-nez v3, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move-object v1, v4

    .line 26
    :goto_0
    if-eqz v1, :cond_1

    .line 27
    .line 28
    const-string v3, "|group_leave_monitor_uri_click_v1"

    .line 29
    .line 30
    invoke-virtual {v1, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    move-object v1, v4

    .line 36
    :goto_1
    const-string v3, ""

    .line 37
    .line 38
    if-nez v1, :cond_2

    .line 39
    .line 40
    move-object v1, v3

    .line 41
    :cond_2
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    sget-object v6, Ltf/t;->g:Ltf/t;

    .line 46
    .line 47
    if-eqz v5, :cond_3

    .line 48
    .line 49
    goto :goto_3

    .line 50
    :cond_3
    const-string v5, "uri_span_click_methods"

    .line 51
    .line 52
    invoke-static {v0, v1, v2, v5}, Le8/b;->f(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/util/List;

    .line 53
    .line 54
    .line 55
    move-result-object v7

    .line 56
    new-instance v8, Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 59
    .line 60
    .line 61
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 62
    .line 63
    .line 64
    move-result-object v7

    .line 65
    :cond_4
    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result v9

    .line 69
    if-eqz v9, :cond_5

    .line 70
    .line 71
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v9

    .line 75
    move-object v10, v9

    .line 76
    check-cast v10, Ljava/lang/reflect/Method;

    .line 77
    .line 78
    invoke-static {v10}, Lo9/c;->d(Ljava/lang/reflect/Method;)Z

    .line 79
    .line 80
    .line 81
    move-result v10

    .line 82
    if-eqz v10, :cond_4

    .line 83
    .line 84
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_5
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 89
    .line 90
    .line 91
    move-result v7

    .line 92
    if-nez v7, :cond_6

    .line 93
    .line 94
    move-object v4, v8

    .line 95
    :cond_6
    if-eqz v4, :cond_7

    .line 96
    .line 97
    return-object v4

    .line 98
    :cond_7
    if-nez p1, :cond_8

    .line 99
    .line 100
    :goto_3
    return-object v6

    .line 101
    :cond_8
    :try_start_0
    iget-object p0, p0, Lr8/g;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 102
    .line 103
    new-instance p1, Lch/e;

    .line 104
    .line 105
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 106
    .line 107
    .line 108
    new-instance v4, Lfh/k;

    .line 109
    .line 110
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 111
    .line 112
    .line 113
    const-string v7, "MicroMsg.URISpanHandlerSet"

    .line 114
    .line 115
    const-string v8, "LuckyMoneyUriSpanHandler handleSpanClick() clickCallback == null"

    .line 116
    .line 117
    filled-new-array {v7, v8}, [Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v7

    .line 121
    invoke-virtual {v4, v7}, Lfh/k;->r0([Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    iput-object v4, p1, Lch/e;->h:Lfh/k;

    .line 125
    .line 126
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    new-instance p1, Ljava/util/ArrayList;

    .line 131
    .line 132
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 140
    .line 141
    .line 142
    move-result v4

    .line 143
    if-eqz v4, :cond_9

    .line 144
    .line 145
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v4

    .line 149
    check-cast v4, Lhh/o;

    .line 150
    .line 151
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v4}, Lhh/o;->p()Llh/d;

    .line 155
    .line 156
    .line 157
    move-result-object v4

    .line 158
    invoke-virtual {v4, v2}, Llh/d;->b(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 159
    .line 160
    .line 161
    move-result-object v4

    .line 162
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 163
    .line 164
    .line 165
    goto :goto_4

    .line 166
    :catchall_0
    move-exception p0

    .line 167
    new-instance p1, Lsf/f;

    .line 168
    .line 169
    invoke-direct {p1, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 170
    .line 171
    .line 172
    :cond_9
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    if-nez p0, :cond_a

    .line 177
    .line 178
    move-object v6, p1

    .line 179
    goto :goto_5

    .line 180
    :cond_a
    const-string p1, "\u9000\u7fa4\u76d1\u63a7\u94fe\u63a5\u70b9\u51fb\u65b9\u6cd5\u5b9a\u4f4d\u5931\u8d25"

    .line 181
    .line 182
    invoke-interface {p2, p1, p0}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    :goto_5
    check-cast v6, Ljava/lang/Iterable;

    .line 186
    .line 187
    new-instance p0, Ljava/util/ArrayList;

    .line 188
    .line 189
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 190
    .line 191
    .line 192
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    :cond_b
    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 197
    .line 198
    .line 199
    move-result p2

    .line 200
    if-eqz p2, :cond_c

    .line 201
    .line 202
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object p2

    .line 206
    move-object v2, p2

    .line 207
    check-cast v2, Ljava/lang/reflect/Method;

    .line 208
    .line 209
    invoke-static {v2}, Lo9/c;->d(Ljava/lang/reflect/Method;)Z

    .line 210
    .line 211
    .line 212
    move-result v2

    .line 213
    if-eqz v2, :cond_b

    .line 214
    .line 215
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    goto :goto_6

    .line 219
    :cond_c
    new-instance p1, Ljava/util/HashSet;

    .line 220
    .line 221
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 222
    .line 223
    .line 224
    new-instance p2, Ljava/util/ArrayList;

    .line 225
    .line 226
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 227
    .line 228
    .line 229
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 230
    .line 231
    .line 232
    move-result-object p0

    .line 233
    :cond_d
    :goto_7
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 234
    .line 235
    .line 236
    move-result v2

    .line 237
    if-eqz v2, :cond_e

    .line 238
    .line 239
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v2

    .line 243
    move-object v4, v2

    .line 244
    check-cast v4, Ljava/lang/reflect/Method;

    .line 245
    .line 246
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v4

    .line 250
    invoke-virtual {p1, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    move-result v4

    .line 254
    if-eqz v4, :cond_d

    .line 255
    .line 256
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    goto :goto_7

    .line 260
    :cond_e
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 261
    .line 262
    .line 263
    move-result p0

    .line 264
    if-nez p0, :cond_f

    .line 265
    .line 266
    sget-object p0, Le8/b;->a:Le8/b;

    .line 267
    .line 268
    invoke-virtual {p0, v0, v1, v5, p2}, Le8/b;->j(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 269
    .line 270
    .line 271
    goto :goto_8

    .line 272
    :cond_f
    const-string p0, "cache.key"

    .line 273
    .line 274
    :try_start_1
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 275
    .line 276
    .line 277
    move-result-object p1

    .line 278
    invoke-interface {v0, p0, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 283
    .line 284
    .line 285
    move-result v0

    .line 286
    if-nez v0, :cond_10

    .line 287
    .line 288
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    invoke-interface {v0, p0, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 293
    .line 294
    .line 295
    :cond_10
    invoke-interface {p1, v5}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 296
    .line 297
    .line 298
    move-result-object p0

    .line 299
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 300
    .line 301
    .line 302
    :catchall_1
    :goto_8
    return-object p2
.end method

.method public static g(Ljava/lang/String;)Ljava/lang/Integer;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_0

    .line 3
    .line 4
    const/16 v1, 0x2c

    .line 5
    .line 6
    invoke-static {p0, v1}, Log/m;->M0(Ljava/lang/String;C)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object p0, v0

    .line 20
    :goto_0
    if-nez p0, :cond_1

    .line 21
    .line 22
    const-string p0, ""

    .line 23
    .line 24
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_2

    .line 29
    .line 30
    goto :goto_5

    .line 31
    :cond_2
    const-string v1, "#"

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    invoke-static {p0, v1, v2}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eqz v3, :cond_3

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_3
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    :goto_1
    const/4 v3, 0x1

    .line 46
    invoke-virtual {p0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    const/4 v5, 0x6

    .line 55
    if-eq v4, v5, :cond_4

    .line 56
    .line 57
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    const/16 v5, 0x8

    .line 62
    .line 63
    if-ne v4, v5, :cond_8

    .line 64
    .line 65
    :cond_4
    move v4, v2

    .line 66
    :goto_2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    if-ge v4, v5, :cond_a

    .line 71
    .line 72
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    invoke-static {v5}, Ljava/lang/Character;->isDigit(C)Z

    .line 77
    .line 78
    .line 79
    move-result v6

    .line 80
    if-nez v6, :cond_7

    .line 81
    .line 82
    const/16 v6, 0x61

    .line 83
    .line 84
    if-gt v6, v5, :cond_5

    .line 85
    .line 86
    const/16 v6, 0x67

    .line 87
    .line 88
    if-ge v5, v6, :cond_5

    .line 89
    .line 90
    goto :goto_3

    .line 91
    :cond_5
    const/16 v6, 0x41

    .line 92
    .line 93
    if-gt v6, v5, :cond_6

    .line 94
    .line 95
    const/16 v6, 0x47

    .line 96
    .line 97
    if-ge v5, v6, :cond_6

    .line 98
    .line 99
    goto :goto_3

    .line 100
    :cond_6
    move v5, v3

    .line 101
    goto :goto_4

    .line 102
    :cond_7
    :goto_3
    move v5, v2

    .line 103
    :goto_4
    if-eqz v5, :cond_9

    .line 104
    .line 105
    :cond_8
    :goto_5
    return-object v0

    .line 106
    :cond_9
    add-int/lit8 v4, v4, 0x1

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_a
    :try_start_0
    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 110
    .line 111
    invoke-virtual {p0, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    new-instance v2, Ljava/lang/StringBuilder;

    .line 119
    .line 120
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    invoke-static {p0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 134
    .line 135
    .line 136
    move-result p0

    .line 137
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 138
    .line 139
    .line 140
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 141
    goto :goto_6

    .line 142
    :catchall_0
    move-exception p0

    .line 143
    new-instance v1, Lsf/f;

    .line 144
    .line 145
    invoke-direct {v1, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 146
    .line 147
    .line 148
    move-object p0, v1

    .line 149
    :goto_6
    nop

    .line 150
    instance-of v1, p0, Lsf/f;

    .line 151
    .line 152
    if-eqz v1, :cond_b

    .line 153
    .line 154
    goto :goto_7

    .line 155
    :cond_b
    move-object v0, p0

    .line 156
    :goto_7
    check-cast v0, Ljava/lang/Integer;

    .line 157
    .line 158
    return-object v0
.end method

.method public static h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    const-string v0, "<"

    .line 2
    .line 3
    const-string v1, ">(.*?)</"

    .line 4
    .line 5
    const-string v2, ">"

    .line 6
    .line 7
    invoke-static {v0, p1, v1, p1, v2}, Lbc/e;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const/16 v1, 0x20

    .line 12
    .line 13
    invoke-static {v1}, Ll3/w;->f(I)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-static {p1, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    invoke-static {p1, v1, p0}, La7/a;->b(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)Log/i;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    const-string p1, ""

    .line 37
    .line 38
    if-eqz p0, :cond_1

    .line 39
    .line 40
    invoke-virtual {p0}, Log/i;->a()Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    const/4 v3, 0x1

    .line 45
    invoke-static {v3, p0}, Ltf/m;->w1(ILjava/util/List;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    check-cast p0, Ljava/lang/String;

    .line 50
    .line 51
    if-nez p0, :cond_0

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    move-object p1, p0

    .line 55
    :goto_0
    invoke-static {p1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    const-string p1, "&lt;"

    .line 64
    .line 65
    invoke-static {p0, p1, v0, v1}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    const-string p1, "&gt;"

    .line 70
    .line 71
    invoke-static {p0, p1, v2, v1}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    const-string p1, "&quot;"

    .line 76
    .line 77
    const-string v0, "\""

    .line 78
    .line 79
    invoke-static {p0, p1, v0, v1}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    const-string p1, "&apos;"

    .line 84
    .line 85
    const-string v0, "\'"

    .line 86
    .line 87
    invoke-static {p0, p1, v0, v1}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    const-string p1, "&amp;"

    .line 92
    .line 93
    const-string v0, "&"

    .line 94
    .line 95
    invoke-static {p0, p1, v0, v1}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    return-object p0

    .line 100
    :cond_1
    return-object p1
.end method


# virtual methods
.method public final b(Lr8/g;Lfg/p;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-virtual {p0, p1, v0, p2}, Lo9/c;->c(Lr8/g;ZLfg/p;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    sget-object v0, Lr8/e;->a:Landroid/os/Handler;

    .line 12
    .line 13
    new-instance v0, Laa/c;

    .line 14
    .line 15
    invoke-direct {v0, p1, p2}, Laa/c;-><init>(Lr8/g;Lfg/p;)V

    .line 16
    .line 17
    .line 18
    const/16 p1, 0x8

    .line 19
    .line 20
    const-string p2, "group_leave_monitor_uri_click"

    .line 21
    .line 22
    const-string v1, "\u9000\u7fa4\u76d1\u63a7\u94fe\u63a5\u70b9\u51fb"

    .line 23
    .line 24
    sget-object v2, Lr8/c;->i:Lr8/c;

    .line 25
    .line 26
    invoke-static {p1, v0, p2, v1, v2}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    return-void
.end method

.method public final declared-synchronized c(Lr8/g;ZLfg/p;)Z
    .locals 8

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget-boolean v0, Lo9/c;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    monitor-exit p0

    .line 8
    return v1

    .line 9
    :cond_0
    :try_start_1
    invoke-static {p1, p2, p3}, Lo9/c;->f(Lr8/g;ZLfg/p;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 17
    const/4 v2, 0x0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    monitor-exit p0

    .line 21
    return v2

    .line 22
    :cond_1
    :try_start_2
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    const/4 v0, 0x0

    .line 27
    move v3, v2

    .line 28
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-eqz v4, :cond_3

    .line 33
    .line 34
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    check-cast v4, Ljava/lang/reflect/Method;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 39
    .line 40
    :try_start_3
    sget-object v5, Lr8/i;->b:Lr8/i;

    .line 41
    .line 42
    new-instance v6, Lc9/b2;

    .line 43
    .line 44
    invoke-direct {v6, p0, p1, v4}, Lc9/b2;-><init>(Lo9/c;Lr8/g;Ljava/lang/reflect/Method;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v5, v4, v6}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 48
    .line 49
    .line 50
    add-int/lit8 v4, v3, 0x1

    .line 51
    .line 52
    :try_start_4
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 53
    .line 54
    .line 55
    move-result-object v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 56
    goto :goto_2

    .line 57
    :catchall_0
    move-exception v3

    .line 58
    goto :goto_1

    .line 59
    :catchall_1
    move-exception v4

    .line 60
    move-object v7, v4

    .line 61
    move v4, v3

    .line 62
    move-object v3, v7

    .line 63
    :goto_1
    :try_start_5
    new-instance v5, Lsf/f;

    .line 64
    .line 65
    invoke-direct {v5, v3}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 66
    .line 67
    .line 68
    move-object v3, v5

    .line 69
    :goto_2
    invoke-static {v3}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    if-eqz v3, :cond_2

    .line 74
    .line 75
    move-object v0, v3

    .line 76
    :cond_2
    move v3, v4

    .line 77
    goto :goto_0

    .line 78
    :catchall_2
    move-exception p1

    .line 79
    goto :goto_4

    .line 80
    :cond_3
    if-lez v3, :cond_4

    .line 81
    .line 82
    goto :goto_3

    .line 83
    :cond_4
    move v1, v2

    .line 84
    :goto_3
    sput-boolean v1, Lo9/c;->c:Z

    .line 85
    .line 86
    sget-boolean p1, Lo9/c;->c:Z

    .line 87
    .line 88
    if-nez p1, :cond_5

    .line 89
    .line 90
    const-string p1, "\u9000\u7fa4\u76d1\u63a7\u94fe\u63a5\u70b9\u51fb Hook \u5b89\u88c5\u5931\u8d25"

    .line 91
    .line 92
    invoke-interface {p3, p1, v0}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    :cond_5
    sget-boolean p1, Lo9/c;->c:Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 96
    .line 97
    monitor-exit p0

    .line 98
    return p1

    .line 99
    :goto_4
    :try_start_6
    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 100
    throw p1
.end method
