.class public abstract Lac/p;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static volatile a:Ljava/util/concurrent/ExecutorService;

.field public static volatile b:Lia/a0;


# direct methods
.method public static A(Ljava/lang/reflect/Method;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 6
    .line 7
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    array-length v0, v0

    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_0

    .line 33
    .line 34
    const-string v0, "com.tencent.mm.ui.chatting.component."

    .line 35
    .line 36
    invoke-static {p0, v1, v0}, Leh/a;->A(Ljava/lang/reflect/Method;ZLjava/lang/String;)Z

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    if-eqz p0, :cond_0

    .line 41
    .line 42
    const/4 p0, 0x1

    .line 43
    return p0

    .line 44
    :cond_0
    return v1
.end method

.method public static B(Ljava/lang/Class;Ljava/lang/reflect/Method;)Z
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x0

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    array-length v1, v0

    .line 17
    const/4 v3, 0x2

    .line 18
    if-ne v1, v3, :cond_0

    .line 19
    .line 20
    aget-object v1, v0, v2

    .line 21
    .line 22
    const-class v3, Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    const/4 v1, 0x1

    .line 31
    aget-object v0, v0, v1

    .line 32
    .line 33
    sget-object v3, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 34
    .line 35
    invoke-static {v0, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-static {p1, p0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    if-eqz p0, :cond_0

    .line 50
    .line 51
    return v1

    .line 52
    :cond_0
    return v2
.end method

.method public static C(Ljava/lang/Class;Ljava/lang/reflect/Method;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    array-length v0, v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-static {p1, p0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-eqz p0, :cond_0

    .line 30
    .line 31
    const/4 p0, 0x1

    .line 32
    return p0

    .line 33
    :cond_0
    const/4 p0, 0x0

    .line 34
    return p0
.end method

.method public static D(Ljava/util/List;)Ljava/lang/String;
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, "null"

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    const-string p0, ""

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_1
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v1, 0x1

    .line 20
    if-ne v0, v1, :cond_2

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-static {p0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0

    .line 32
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_3

    .line 53
    .line 54
    const-string v1, ", "

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    return-object p0
.end method

.method public static final E(Lr8/g;Lfg/p;)Ljava/lang/reflect/Method;
    .locals 9

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lr8/g;->a:Landroid/content/Context;

    .line 8
    .line 9
    const-string v1, "Hchat_multi_select_menu_method_cache"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    iget-object v1, p0, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 16
    .line 17
    invoke-static {v0, v1}, Le8/b;->g(Landroid/content/Context;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    const-string v0, "menu_click_v1"

    .line 22
    .line 23
    invoke-static {v2, v3, v1, v0}, Le8/b;->c(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const/4 v4, 0x0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    invoke-static {v0}, Lac/p;->y(Ljava/lang/reflect/Method;)Z

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    if-eqz v5, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move-object v0, v4

    .line 38
    :goto_0
    if-eqz v0, :cond_1

    .line 39
    .line 40
    return-object v0

    .line 41
    :cond_1
    :try_start_0
    iget-object p0, p0, Lr8/g;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 42
    .line 43
    new-instance v0, Lch/e;

    .line 44
    .line 45
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 46
    .line 47
    .line 48
    new-instance v5, Lfh/k;

    .line 49
    .line 50
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 51
    .line 52
    .line 53
    const-string v6, "onMMMenuItemSelected"

    .line 54
    .line 55
    new-instance v7, Lgh/c;

    .line 56
    .line 57
    const/4 v8, 0x5

    .line 58
    invoke-direct {v7, v6, v8}, Lgh/c;-><init>(Ljava/lang/String;I)V

    .line 59
    .line 60
    .line 61
    iput-object v7, v5, Lfh/k;->g:Lgh/c;

    .line 62
    .line 63
    const-string v6, "void"

    .line 64
    .line 65
    invoke-static {v5, v6}, Lfh/k;->q0(Lfh/k;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    const-string v6, "android.view.MenuItem"

    .line 69
    .line 70
    const-string v7, "int"

    .line 71
    .line 72
    filled-new-array {v6, v7}, [Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    invoke-virtual {v5, v6}, Lfh/k;->o0([Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    const-string v6, "FinalShareCountByType"

    .line 80
    .line 81
    filled-new-array {v6}, [Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    invoke-virtual {v5, v6}, Lfh/k;->r0([Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    iput-object v5, v0, Lch/e;->h:Lfh/k;

    .line 89
    .line 90
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    new-instance v5, Ljava/util/ArrayList;

    .line 95
    .line 96
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    :cond_2
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-eqz v0, :cond_4

    .line 108
    .line 109
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    check-cast v0, Lhh/o;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 114
    .line 115
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0}, Lhh/o;->p()Llh/d;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-virtual {v0, v1}, Llh/d;->b(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 123
    .line 124
    .line 125
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 126
    goto :goto_2

    .line 127
    :catchall_0
    move-exception v0

    .line 128
    :try_start_2
    new-instance v6, Lsf/f;

    .line 129
    .line 130
    invoke-direct {v6, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 131
    .line 132
    .line 133
    move-object v0, v6

    .line 134
    :goto_2
    nop

    .line 135
    instance-of v6, v0, Lsf/f;

    .line 136
    .line 137
    if-eqz v6, :cond_3

    .line 138
    .line 139
    move-object v0, v4

    .line 140
    :cond_3
    check-cast v0, Ljava/lang/reflect/Method;

    .line 141
    .line 142
    if-eqz v0, :cond_2

    .line 143
    .line 144
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    goto :goto_1

    .line 148
    :catchall_1
    move-exception v0

    .line 149
    move-object p0, v0

    .line 150
    goto :goto_5

    .line 151
    :cond_4
    new-instance p0, Ljava/util/ArrayList;

    .line 152
    .line 153
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    :cond_5
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 161
    .line 162
    .line 163
    move-result v1

    .line 164
    if-eqz v1, :cond_6

    .line 165
    .line 166
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    move-object v4, v1

    .line 171
    check-cast v4, Ljava/lang/reflect/Method;

    .line 172
    .line 173
    invoke-static {v4}, Lac/p;->y(Ljava/lang/reflect/Method;)Z

    .line 174
    .line 175
    .line 176
    move-result v4

    .line 177
    if-eqz v4, :cond_5

    .line 178
    .line 179
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    goto :goto_3

    .line 183
    :cond_6
    new-instance v0, Ljava/util/HashSet;

    .line 184
    .line 185
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 186
    .line 187
    .line 188
    new-instance v1, Ljava/util/ArrayList;

    .line 189
    .line 190
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 191
    .line 192
    .line 193
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    :cond_7
    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 198
    .line 199
    .line 200
    move-result v4

    .line 201
    if-eqz v4, :cond_8

    .line 202
    .line 203
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v4

    .line 207
    move-object v5, v4

    .line 208
    check-cast v5, Ljava/lang/reflect/Method;

    .line 209
    .line 210
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v5

    .line 214
    invoke-virtual {v0, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result v5

    .line 218
    if-eqz v5, :cond_7

    .line 219
    .line 220
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 221
    .line 222
    .line 223
    goto :goto_4

    .line 224
    :goto_5
    new-instance v1, Lsf/f;

    .line 225
    .line 226
    invoke-direct {v1, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 227
    .line 228
    .line 229
    :cond_8
    invoke-static {v1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 230
    .line 231
    .line 232
    move-result-object p0

    .line 233
    if-eqz p0, :cond_9

    .line 234
    .line 235
    const-string v0, "\u5b9a\u4f4d\u591a\u9009\u6d88\u606f\u83dc\u5355\u70b9\u51fb\u65b9\u6cd5\u5931\u8d25"

    .line 236
    .line 237
    invoke-interface {p1, v0, p0}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    :cond_9
    instance-of p0, v1, Lsf/f;

    .line 241
    .line 242
    if-eqz p0, :cond_a

    .line 243
    .line 244
    sget-object v1, Ltf/t;->g:Ltf/t;

    .line 245
    .line 246
    :cond_a
    move-object v5, v1

    .line 247
    check-cast v5, Ljava/util/List;

    .line 248
    .line 249
    const-string v4, "menu_click_v1"

    .line 250
    .line 251
    const-string v6, "\u83dc\u5355\u70b9\u51fb"

    .line 252
    .line 253
    move-object v7, p1

    .line 254
    invoke-static/range {v2 .. v7}, Lac/p;->M(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lfg/p;)Ljava/lang/reflect/Method;

    .line 255
    .line 256
    .line 257
    move-result-object p0

    .line 258
    return-object p0
.end method

.method public static final F(Lr8/g;Lfg/p;)Ljava/lang/reflect/Method;
    .locals 9

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lr8/g;->a:Landroid/content/Context;

    .line 8
    .line 9
    const-string v1, "Hchat_multi_select_menu_method_cache"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    iget-object v1, p0, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 16
    .line 17
    invoke-static {v0, v1}, Le8/b;->g(Landroid/content/Context;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    const-string v0, "menu_create_v2"

    .line 22
    .line 23
    invoke-static {v2, v3, v1, v0}, Le8/b;->c(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const/4 v4, 0x0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    invoke-static {v0}, Lac/p;->z(Ljava/lang/reflect/Method;)Z

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    if-eqz v5, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move-object v0, v4

    .line 38
    :goto_0
    if-eqz v0, :cond_1

    .line 39
    .line 40
    return-object v0

    .line 41
    :cond_1
    :try_start_0
    iget-object p0, p0, Lr8/g;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 42
    .line 43
    new-instance v0, Lch/e;

    .line 44
    .line 45
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 46
    .line 47
    .line 48
    new-instance v5, Lfh/k;

    .line 49
    .line 50
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 51
    .line 52
    .line 53
    const-string v6, "onCreateMMMenu"

    .line 54
    .line 55
    new-instance v7, Lgh/c;

    .line 56
    .line 57
    const/4 v8, 0x5

    .line 58
    invoke-direct {v7, v6, v8}, Lgh/c;-><init>(Ljava/lang/String;I)V

    .line 59
    .line 60
    .line 61
    iput-object v7, v5, Lfh/k;->g:Lgh/c;

    .line 62
    .line 63
    const-string v6, "void"

    .line 64
    .line 65
    invoke-static {v5, v6}, Lfh/k;->q0(Lfh/k;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    new-instance v6, Lfh/k;

    .line 69
    .line 70
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 71
    .line 72
    .line 73
    const-string v7, "com.tencent.wework.api.WWAPIFactory"

    .line 74
    .line 75
    invoke-virtual {v6, v8, v7}, Lfh/k;->l0(ILjava/lang/String;)V

    .line 76
    .line 77
    .line 78
    iget-object v7, v5, Lfh/k;->m:Lfh/l;

    .line 79
    .line 80
    if-nez v7, :cond_2

    .line 81
    .line 82
    new-instance v7, Lfh/l;

    .line 83
    .line 84
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 85
    .line 86
    .line 87
    :cond_2
    iput-object v7, v5, Lfh/k;->m:Lfh/l;

    .line 88
    .line 89
    invoke-virtual {v7, v6}, Lfh/l;->k0(Lfh/k;)V

    .line 90
    .line 91
    .line 92
    iput-object v5, v0, Lch/e;->h:Lfh/k;

    .line 93
    .line 94
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    new-instance v5, Ljava/util/ArrayList;

    .line 99
    .line 100
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    :cond_3
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    if-eqz v0, :cond_5

    .line 112
    .line 113
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    check-cast v0, Lhh/o;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 118
    .line 119
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0}, Lhh/o;->p()Llh/d;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-virtual {v0, v1}, Llh/d;->b(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 127
    .line 128
    .line 129
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 130
    goto :goto_2

    .line 131
    :catchall_0
    move-exception v0

    .line 132
    :try_start_2
    new-instance v6, Lsf/f;

    .line 133
    .line 134
    invoke-direct {v6, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 135
    .line 136
    .line 137
    move-object v0, v6

    .line 138
    :goto_2
    nop

    .line 139
    instance-of v6, v0, Lsf/f;

    .line 140
    .line 141
    if-eqz v6, :cond_4

    .line 142
    .line 143
    move-object v0, v4

    .line 144
    :cond_4
    check-cast v0, Ljava/lang/reflect/Method;

    .line 145
    .line 146
    if-eqz v0, :cond_3

    .line 147
    .line 148
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    goto :goto_1

    .line 152
    :catchall_1
    move-exception v0

    .line 153
    move-object p0, v0

    .line 154
    goto :goto_5

    .line 155
    :cond_5
    new-instance p0, Ljava/util/ArrayList;

    .line 156
    .line 157
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    :cond_6
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 165
    .line 166
    .line 167
    move-result v1

    .line 168
    if-eqz v1, :cond_7

    .line 169
    .line 170
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    move-object v4, v1

    .line 175
    check-cast v4, Ljava/lang/reflect/Method;

    .line 176
    .line 177
    invoke-static {v4}, Lac/p;->z(Ljava/lang/reflect/Method;)Z

    .line 178
    .line 179
    .line 180
    move-result v4

    .line 181
    if-eqz v4, :cond_6

    .line 182
    .line 183
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    goto :goto_3

    .line 187
    :cond_7
    new-instance v0, Ljava/util/HashSet;

    .line 188
    .line 189
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 190
    .line 191
    .line 192
    new-instance v1, Ljava/util/ArrayList;

    .line 193
    .line 194
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 195
    .line 196
    .line 197
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 198
    .line 199
    .line 200
    move-result-object p0

    .line 201
    :cond_8
    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 202
    .line 203
    .line 204
    move-result v4

    .line 205
    if-eqz v4, :cond_9

    .line 206
    .line 207
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v4

    .line 211
    move-object v5, v4

    .line 212
    check-cast v5, Ljava/lang/reflect/Method;

    .line 213
    .line 214
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v5

    .line 218
    invoke-virtual {v0, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    move-result v5

    .line 222
    if-eqz v5, :cond_8

    .line 223
    .line 224
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 225
    .line 226
    .line 227
    goto :goto_4

    .line 228
    :goto_5
    new-instance v1, Lsf/f;

    .line 229
    .line 230
    invoke-direct {v1, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 231
    .line 232
    .line 233
    :cond_9
    invoke-static {v1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 234
    .line 235
    .line 236
    move-result-object p0

    .line 237
    if-eqz p0, :cond_a

    .line 238
    .line 239
    const-string v0, "\u5b9a\u4f4d\u591a\u9009\u6d88\u606f\u83dc\u5355\u521b\u5efa\u65b9\u6cd5\u5931\u8d25"

    .line 240
    .line 241
    invoke-interface {p1, v0, p0}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    :cond_a
    instance-of p0, v1, Lsf/f;

    .line 245
    .line 246
    if-eqz p0, :cond_b

    .line 247
    .line 248
    sget-object v1, Ltf/t;->g:Ltf/t;

    .line 249
    .line 250
    :cond_b
    move-object v5, v1

    .line 251
    check-cast v5, Ljava/util/List;

    .line 252
    .line 253
    const-string v4, "menu_create_v2"

    .line 254
    .line 255
    const-string v6, "\u83dc\u5355\u521b\u5efa"

    .line 256
    .line 257
    move-object v7, p1

    .line 258
    invoke-static/range {v2 .. v7}, Lac/p;->M(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lfg/p;)Ljava/lang/reflect/Method;

    .line 259
    .line 260
    .line 261
    move-result-object p0

    .line 262
    return-object p0
.end method

.method public static final G(Lr8/g;Ljava/lang/reflect/Method;Lfg/p;)Ljava/lang/reflect/Method;
    .locals 9

    .line 1
    sget-object v1, Ltf/t;->g:Ltf/t;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lr8/g;->a:Landroid/content/Context;

    .line 10
    .line 11
    const-string v2, "Hchat_multi_select_menu_method_cache"

    .line 12
    .line 13
    invoke-static {v0, v2}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    iget-object v2, p0, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 18
    .line 19
    invoke-static {v0, v2}, Le8/b;->g(Landroid/content/Context;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    const-string v0, "multi_select_exit_v1"

    .line 24
    .line 25
    invoke-static {v3, v4, v2, v0}, Le8/b;->c(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const/4 v5, 0x0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    invoke-static {v0}, Lac/p;->A(Ljava/lang/reflect/Method;)Z

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    if-eqz v6, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    move-object v0, v5

    .line 40
    :goto_0
    if-eqz v0, :cond_1

    .line 41
    .line 42
    return-object v0

    .line 43
    :cond_1
    :try_start_0
    iget-object p0, p0, Lr8/g;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 44
    .line 45
    new-instance v0, Lch/e;

    .line 46
    .line 47
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 48
    .line 49
    .line 50
    new-instance v6, Lfh/k;

    .line 51
    .line 52
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 53
    .line 54
    .line 55
    const-string v7, "void"

    .line 56
    .line 57
    invoke-static {v6, v7}, Lfh/k;->q0(Lfh/k;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    new-instance v7, Lfh/j;

    .line 61
    .line 62
    const/4 v8, 0x1

    .line 63
    invoke-direct {v7, v8}, Lfh/j;-><init>(I)V

    .line 64
    .line 65
    .line 66
    new-instance v8, Ljava/util/ArrayList;

    .line 67
    .line 68
    invoke-direct {v8, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 69
    .line 70
    .line 71
    iput-object v8, v7, Lfh/j;->h:Ljava/util/List;

    .line 72
    .line 73
    iput-object v7, v6, Lfh/k;->j:Lfh/j;

    .line 74
    .line 75
    const-string v7, "com.tencent.mm.ui.chatting.component."

    .line 76
    .line 77
    const/4 v8, 0x2

    .line 78
    invoke-virtual {v6, v8, v7}, Lfh/k;->l0(ILjava/lang/String;)V

    .line 79
    .line 80
    .line 81
    new-instance v7, Lfh/k;

    .line 82
    .line 83
    invoke-direct {v7, p1}, Lfh/k;-><init>(Ljava/lang/reflect/Method;)V

    .line 84
    .line 85
    .line 86
    iget-object p1, v6, Lfh/k;->n:Lfh/l;

    .line 87
    .line 88
    if-nez p1, :cond_2

    .line 89
    .line 90
    new-instance p1, Lfh/l;

    .line 91
    .line 92
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 93
    .line 94
    .line 95
    :cond_2
    iput-object p1, v6, Lfh/k;->n:Lfh/l;

    .line 96
    .line 97
    invoke-virtual {p1, v7}, Lfh/l;->k0(Lfh/k;)V

    .line 98
    .line 99
    .line 100
    iput-object v6, v0, Lch/e;->h:Lfh/k;

    .line 101
    .line 102
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    new-instance p1, Ljava/util/ArrayList;

    .line 107
    .line 108
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    :cond_3
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    if-eqz v0, :cond_5

    .line 120
    .line 121
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    check-cast v0, Lhh/o;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 126
    .line 127
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0}, Lhh/o;->p()Llh/d;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-virtual {v0, v2}, Llh/d;->b(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 135
    .line 136
    .line 137
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 138
    goto :goto_2

    .line 139
    :catchall_0
    move-exception v0

    .line 140
    :try_start_2
    new-instance v6, Lsf/f;

    .line 141
    .line 142
    invoke-direct {v6, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 143
    .line 144
    .line 145
    move-object v0, v6

    .line 146
    :goto_2
    nop

    .line 147
    instance-of v6, v0, Lsf/f;

    .line 148
    .line 149
    if-eqz v6, :cond_4

    .line 150
    .line 151
    move-object v0, v5

    .line 152
    :cond_4
    check-cast v0, Ljava/lang/reflect/Method;

    .line 153
    .line 154
    if-eqz v0, :cond_3

    .line 155
    .line 156
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    goto :goto_1

    .line 160
    :catchall_1
    move-exception v0

    .line 161
    move-object p0, v0

    .line 162
    goto :goto_5

    .line 163
    :cond_5
    new-instance p0, Ljava/util/ArrayList;

    .line 164
    .line 165
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 166
    .line 167
    .line 168
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    :cond_6
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    if-eqz v0, :cond_7

    .line 177
    .line 178
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    move-object v2, v0

    .line 183
    check-cast v2, Ljava/lang/reflect/Method;

    .line 184
    .line 185
    invoke-static {v2}, Lac/p;->A(Ljava/lang/reflect/Method;)Z

    .line 186
    .line 187
    .line 188
    move-result v2

    .line 189
    if-eqz v2, :cond_6

    .line 190
    .line 191
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    goto :goto_3

    .line 195
    :cond_7
    new-instance p1, Ljava/util/HashSet;

    .line 196
    .line 197
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 198
    .line 199
    .line 200
    new-instance v0, Ljava/util/ArrayList;

    .line 201
    .line 202
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 203
    .line 204
    .line 205
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    :cond_8
    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 210
    .line 211
    .line 212
    move-result v2

    .line 213
    if-eqz v2, :cond_9

    .line 214
    .line 215
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    move-object v5, v2

    .line 220
    check-cast v5, Ljava/lang/reflect/Method;

    .line 221
    .line 222
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v5

    .line 226
    invoke-virtual {p1, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    move-result v5

    .line 230
    if-eqz v5, :cond_8

    .line 231
    .line 232
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 233
    .line 234
    .line 235
    goto :goto_4

    .line 236
    :goto_5
    new-instance v0, Lsf/f;

    .line 237
    .line 238
    invoke-direct {v0, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 239
    .line 240
    .line 241
    :cond_9
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 242
    .line 243
    .line 244
    move-result-object p0

    .line 245
    if-eqz p0, :cond_a

    .line 246
    .line 247
    const-string p1, "\u5b9a\u4f4d\u591a\u9009\u6d88\u606f\u539f\u751f\u9000\u51fa\u65b9\u6cd5\u5931\u8d25"

    .line 248
    .line 249
    invoke-interface {p2, p1, p0}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    :cond_a
    instance-of p0, v0, Lsf/f;

    .line 253
    .line 254
    if-eqz p0, :cond_b

    .line 255
    .line 256
    goto :goto_6

    .line 257
    :cond_b
    move-object v1, v0

    .line 258
    :goto_6
    move-object v6, v1

    .line 259
    check-cast v6, Ljava/util/List;

    .line 260
    .line 261
    const-string v5, "multi_select_exit_v1"

    .line 262
    .line 263
    const-string v7, "\u539f\u751f\u9000\u51fa"

    .line 264
    .line 265
    move-object v8, p2

    .line 266
    invoke-static/range {v3 .. v8}, Lac/p;->M(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lfg/p;)Ljava/lang/reflect/Method;

    .line 267
    .line 268
    .line 269
    move-result-object p0

    .line 270
    return-object p0
.end method

.method public static final H(Lp1/b;Lm/p1;Lp1/a;Z)J
    .locals 8

    .line 1
    iget-wide v0, p0, Lp1/b;->g:J

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    goto :goto_2

    .line 6
    :cond_0
    iget v2, p2, Lp1/a;->a:I

    .line 7
    .line 8
    const-wide v3, 0xffffffffL

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    const/16 v5, 0x20

    .line 14
    .line 15
    const/4 v6, 0x1

    .line 16
    if-ne v2, v6, :cond_1

    .line 17
    .line 18
    shr-long/2addr v0, v5

    .line 19
    long-to-int v0, v0

    .line 20
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const/4 v6, 0x2

    .line 26
    if-ne v2, v6, :cond_3

    .line 27
    .line 28
    and-long/2addr v0, v3

    .line 29
    long-to-int v0, v0

    .line 30
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    :goto_0
    sget-object v1, Lm/p1;->h:Lm/p1;

    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    if-ne p1, v1, :cond_2

    .line 38
    .line 39
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    int-to-long v0, v0

    .line 44
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    int-to-long v6, v2

    .line 49
    shl-long/2addr v0, v5

    .line 50
    :goto_1
    and-long v2, v6, v3

    .line 51
    .line 52
    or-long/2addr v0, v2

    .line 53
    goto :goto_2

    .line 54
    :cond_2
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    int-to-long v1, v1

    .line 59
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    int-to-long v6, v0

    .line 64
    shl-long v0, v1, v5

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_3
    :goto_2
    invoke-static {p0, p1, p2}, Lac/p;->I(Lp1/b;Lm/p1;Lp1/a;)J

    .line 68
    .line 69
    .line 70
    move-result-wide p1

    .line 71
    invoke-static {p1, p2, v0, v1}, Le1/b;->d(JJ)J

    .line 72
    .line 73
    .line 74
    move-result-wide p1

    .line 75
    if-nez p3, :cond_4

    .line 76
    .line 77
    iget-boolean p0, p0, Lp1/b;->i:Z

    .line 78
    .line 79
    if-eqz p0, :cond_4

    .line 80
    .line 81
    const-wide/16 p0, 0x0

    .line 82
    .line 83
    return-wide p0

    .line 84
    :cond_4
    return-wide p1
.end method

.method public static final I(Lp1/b;Lm/p1;Lp1/a;)J
    .locals 5

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    iget-wide p0, p0, Lp1/b;->c:J

    .line 4
    .line 5
    return-wide p0

    .line 6
    :cond_0
    iget p2, p2, Lp1/a;->a:I

    .line 7
    .line 8
    const-wide v0, 0xffffffffL

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    const/16 v2, 0x20

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    if-ne p2, v3, :cond_1

    .line 17
    .line 18
    iget-wide v3, p0, Lp1/b;->c:J

    .line 19
    .line 20
    shr-long/2addr v3, v2

    .line 21
    long-to-int p0, v3

    .line 22
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/4 v3, 0x2

    .line 28
    if-ne p2, v3, :cond_3

    .line 29
    .line 30
    iget-wide v3, p0, Lp1/b;->c:J

    .line 31
    .line 32
    and-long/2addr v3, v0

    .line 33
    long-to-int p0, v3

    .line 34
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    :goto_0
    sget-object p2, Lm/p1;->h:Lm/p1;

    .line 39
    .line 40
    const/4 v3, 0x0

    .line 41
    if-ne p1, p2, :cond_2

    .line 42
    .line 43
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    int-to-long p0, p0

    .line 48
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 49
    .line 50
    .line 51
    move-result p2

    .line 52
    int-to-long v3, p2

    .line 53
    shl-long/2addr p0, v2

    .line 54
    :goto_1
    and-long/2addr v0, v3

    .line 55
    or-long/2addr p0, v0

    .line 56
    return-wide p0

    .line 57
    :cond_2
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    int-to-long p1, p1

    .line 62
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    int-to-long v3, p0

    .line 67
    shl-long p0, p1, v2

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_3
    iget-wide p0, p0, Lp1/b;->c:J

    .line 71
    .line 72
    return-wide p0
.end method

.method public static J(Landroid/content/res/Resources;I)Ljava/util/List;
    .locals 8

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->obtainTypedArray(I)Landroid/content/res/TypedArray;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    :try_start_0
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->length()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 19
    .line 20
    .line 21
    return-object p0

    .line 22
    :catchall_0
    move-exception p0

    .line 23
    goto :goto_3

    .line 24
    :cond_1
    :try_start_1
    new-instance v1, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 27
    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    invoke-virtual {v0, v2}, Landroid/content/res/TypedArray;->getType(I)I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    const/4 v4, 0x1

    .line 35
    if-ne v3, v4, :cond_4

    .line 36
    .line 37
    move p1, v2

    .line 38
    :goto_0
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->length()I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-ge p1, v3, :cond_6

    .line 43
    .line 44
    invoke-virtual {v0, p1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-eqz v3, :cond_3

    .line 49
    .line 50
    invoke-virtual {p0, v3}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    new-instance v4, Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 57
    .line 58
    .line 59
    array-length v5, v3

    .line 60
    move v6, v2

    .line 61
    :goto_1
    if-ge v6, v5, :cond_2

    .line 62
    .line 63
    aget-object v7, v3, v6

    .line 64
    .line 65
    invoke-static {v7, v2}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 66
    .line 67
    .line 68
    move-result-object v7

    .line 69
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    add-int/lit8 v6, v6, 0x1

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_2
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    :cond_3
    add-int/lit8 p1, p1, 0x1

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_4
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    new-instance p1, Ljava/util/ArrayList;

    .line 86
    .line 87
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 88
    .line 89
    .line 90
    array-length v3, p0

    .line 91
    move v4, v2

    .line 92
    :goto_2
    if-ge v4, v3, :cond_5

    .line 93
    .line 94
    aget-object v5, p0, v4

    .line 95
    .line 96
    invoke-static {v5, v2}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    add-int/lit8 v4, v4, 0x1

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_5
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 107
    .line 108
    .line 109
    :cond_6
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 110
    .line 111
    .line 112
    return-object v1

    .line 113
    :goto_3
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 114
    .line 115
    .line 116
    throw p0
.end method

.method public static final K(JFLz6/c;)Lf1/c0;
    .locals 38

    .line 1
    move/from16 v0, p2

    .line 2
    .line 3
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/16 v1, 0x20

    .line 7
    .line 8
    shr-long v2, p0, v1

    .line 9
    .line 10
    long-to-int v2, v2

    .line 11
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 12
    .line 13
    .line 14
    move-result v6

    .line 15
    const-wide v3, 0xffffffffL

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    and-long v7, p0, v3

    .line 21
    .line 22
    long-to-int v5, v7

    .line 23
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 24
    .line 25
    .line 26
    move-result v7

    .line 27
    invoke-static/range {p0 .. p1}, Le1/e;->b(J)F

    .line 28
    .line 29
    .line 30
    move-result v8

    .line 31
    const/high16 v9, 0x3f000000    # 0.5f

    .line 32
    .line 33
    mul-float/2addr v8, v9

    .line 34
    const/4 v9, 0x0

    .line 35
    cmpg-float v10, v0, v9

    .line 36
    .line 37
    if-nez v10, :cond_0

    .line 38
    .line 39
    new-instance v0, Lf1/k0;

    .line 40
    .line 41
    new-instance v1, Le1/c;

    .line 42
    .line 43
    invoke-direct {v1, v9, v9, v6, v7}, Le1/c;-><init>(FFFF)V

    .line 44
    .line 45
    .line 46
    invoke-direct {v0, v1}, Lf1/k0;-><init>(Le1/c;)V

    .line 47
    .line 48
    .line 49
    return-object v0

    .line 50
    :cond_0
    sget-object v9, Lz6/c;->g:Lz6/c;

    .line 51
    .line 52
    move-object/from16 v10, p3

    .line 53
    .line 54
    if-eq v10, v9, :cond_d

    .line 55
    .line 56
    cmpg-float v9, v6, v7

    .line 57
    .line 58
    if-nez v9, :cond_1

    .line 59
    .line 60
    cmpl-float v8, v0, v8

    .line 61
    .line 62
    if-ltz v8, :cond_1

    .line 63
    .line 64
    goto/16 :goto_3

    .line 65
    .line 66
    :cond_1
    new-instance v1, Lf1/j0;

    .line 67
    .line 68
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    invoke-static {}, Lf1/l;->a()Lf1/j;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    iget-object v11, v4, Lf1/j;->a:Landroid/graphics/Path;

    .line 81
    .line 82
    sget-object v5, Lz6/b;->l:Lz6/b;

    .line 83
    .line 84
    float-to-double v6, v2

    .line 85
    float-to-double v2, v3

    .line 86
    float-to-double v12, v0

    .line 87
    const-wide/high16 v8, 0x3fe0000000000000L    # 0.5

    .line 88
    .line 89
    mul-double v14, v6, v8

    .line 90
    .line 91
    sub-double/2addr v14, v12

    .line 92
    div-double/2addr v14, v12

    .line 93
    const-wide/16 v16, 0x0

    .line 94
    .line 95
    cmpg-double v0, v14, v16

    .line 96
    .line 97
    if-gez v0, :cond_2

    .line 98
    .line 99
    move-wide/from16 v14, v16

    .line 100
    .line 101
    :cond_2
    const-wide/high16 v18, 0x3ff0000000000000L    # 1.0

    .line 102
    .line 103
    cmpl-double v0, v14, v18

    .line 104
    .line 105
    if-lez v0, :cond_3

    .line 106
    .line 107
    move-wide/from16 v14, v18

    .line 108
    .line 109
    :cond_3
    mul-double/2addr v8, v2

    .line 110
    sub-double/2addr v8, v12

    .line 111
    div-double/2addr v8, v12

    .line 112
    cmpg-double v0, v8, v16

    .line 113
    .line 114
    if-gez v0, :cond_4

    .line 115
    .line 116
    move-wide/from16 v8, v16

    .line 117
    .line 118
    :cond_4
    cmpl-double v0, v8, v18

    .line 119
    .line 120
    if-lez v0, :cond_5

    .line 121
    .line 122
    move-wide/from16 v8, v18

    .line 123
    .line 124
    :cond_5
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    cmpg-double v0, v14, v16

    .line 128
    .line 129
    const/16 v20, 0x0

    .line 130
    .line 131
    const/16 v21, 0x1

    .line 132
    .line 133
    if-nez v0, :cond_6

    .line 134
    .line 135
    move/from16 v0, v20

    .line 136
    .line 137
    goto :goto_0

    .line 138
    :cond_6
    cmpg-double v0, v14, v18

    .line 139
    .line 140
    if-nez v0, :cond_a

    .line 141
    .line 142
    move/from16 v0, v21

    .line 143
    .line 144
    :goto_0
    cmpg-double v10, v8, v16

    .line 145
    .line 146
    if-nez v10, :cond_7

    .line 147
    .line 148
    move/from16 v8, v20

    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_7
    cmpg-double v10, v8, v18

    .line 152
    .line 153
    if-nez v10, :cond_8

    .line 154
    .line 155
    move/from16 v8, v21

    .line 156
    .line 157
    :goto_1
    iget-object v5, v5, Lz6/b;->k:[[[D

    .line 158
    .line 159
    aget-object v0, v5, v0

    .line 160
    .line 161
    aget-object v0, v0, v8

    .line 162
    .line 163
    goto :goto_2

    .line 164
    :cond_8
    cmpg-double v0, v14, v8

    .line 165
    .line 166
    if-nez v0, :cond_9

    .line 167
    .line 168
    invoke-virtual {v5, v14, v15}, Lz6/b;->a(D)[D

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    goto :goto_2

    .line 173
    :cond_9
    invoke-virtual {v5, v14, v15, v8, v9}, Lz6/b;->b(DD)[D

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    goto :goto_2

    .line 178
    :cond_a
    cmpg-double v0, v14, v8

    .line 179
    .line 180
    if-nez v0, :cond_b

    .line 181
    .line 182
    invoke-virtual {v5, v14, v15}, Lz6/b;->a(D)[D

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    goto :goto_2

    .line 187
    :cond_b
    invoke-virtual {v5, v14, v15, v8, v9}, Lz6/b;->b(DD)[D

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    :goto_2
    array-length v5, v0

    .line 192
    const/16 v8, 0x14

    .line 193
    .line 194
    if-lt v5, v8, :cond_c

    .line 195
    .line 196
    sub-double v14, v6, v12

    .line 197
    .line 198
    aget-wide v5, v0, v20

    .line 199
    .line 200
    mul-double/2addr v5, v12

    .line 201
    add-double/2addr v5, v14

    .line 202
    double-to-float v5, v5

    .line 203
    aget-wide v6, v0, v21

    .line 204
    .line 205
    mul-double/2addr v6, v12

    .line 206
    add-double v6, v6, v16

    .line 207
    .line 208
    double-to-float v6, v6

    .line 209
    invoke-virtual {v11, v5, v6}, Landroid/graphics/Path;->moveTo(FF)V

    .line 210
    .line 211
    .line 212
    const/16 v18, 0x2

    .line 213
    .line 214
    aget-wide v5, v0, v18

    .line 215
    .line 216
    mul-double/2addr v5, v12

    .line 217
    add-double/2addr v5, v14

    .line 218
    double-to-float v5, v5

    .line 219
    const/16 v19, 0x3

    .line 220
    .line 221
    aget-wide v6, v0, v19

    .line 222
    .line 223
    mul-double/2addr v6, v12

    .line 224
    add-double v6, v6, v16

    .line 225
    .line 226
    double-to-float v6, v6

    .line 227
    const/16 v22, 0x4

    .line 228
    .line 229
    aget-wide v7, v0, v22

    .line 230
    .line 231
    mul-double/2addr v7, v12

    .line 232
    add-double/2addr v7, v14

    .line 233
    double-to-float v7, v7

    .line 234
    const/16 v23, 0x5

    .line 235
    .line 236
    aget-wide v8, v0, v23

    .line 237
    .line 238
    mul-double/2addr v8, v12

    .line 239
    add-double v8, v8, v16

    .line 240
    .line 241
    double-to-float v8, v8

    .line 242
    const/16 v24, 0x6

    .line 243
    .line 244
    aget-wide v9, v0, v24

    .line 245
    .line 246
    mul-double/2addr v9, v12

    .line 247
    add-double/2addr v9, v14

    .line 248
    double-to-float v9, v9

    .line 249
    const/16 v25, 0x7

    .line 250
    .line 251
    aget-wide v26, v0, v25

    .line 252
    .line 253
    mul-double v26, v26, v12

    .line 254
    .line 255
    move-wide/from16 p0, v2

    .line 256
    .line 257
    add-double v2, v26, v16

    .line 258
    .line 259
    double-to-float v10, v2

    .line 260
    invoke-virtual/range {v4 .. v10}, Lf1/j;->d(FFFFFF)V

    .line 261
    .line 262
    .line 263
    const/16 v2, 0x8

    .line 264
    .line 265
    aget-wide v5, v0, v2

    .line 266
    .line 267
    mul-double/2addr v5, v12

    .line 268
    add-double/2addr v5, v14

    .line 269
    double-to-float v5, v5

    .line 270
    const/16 v3, 0x9

    .line 271
    .line 272
    aget-wide v6, v0, v3

    .line 273
    .line 274
    mul-double/2addr v6, v12

    .line 275
    add-double v6, v6, v16

    .line 276
    .line 277
    double-to-float v6, v6

    .line 278
    const/16 v26, 0xa

    .line 279
    .line 280
    aget-wide v7, v0, v26

    .line 281
    .line 282
    mul-double/2addr v7, v12

    .line 283
    add-double/2addr v7, v14

    .line 284
    double-to-float v7, v7

    .line 285
    const/16 v27, 0xb

    .line 286
    .line 287
    aget-wide v8, v0, v27

    .line 288
    .line 289
    mul-double/2addr v8, v12

    .line 290
    add-double v8, v8, v16

    .line 291
    .line 292
    double-to-float v8, v8

    .line 293
    const/16 v28, 0xc

    .line 294
    .line 295
    aget-wide v9, v0, v28

    .line 296
    .line 297
    mul-double/2addr v9, v12

    .line 298
    add-double/2addr v9, v14

    .line 299
    double-to-float v9, v9

    .line 300
    const/16 v29, 0xd

    .line 301
    .line 302
    aget-wide v30, v0, v29

    .line 303
    .line 304
    mul-double v30, v30, v12

    .line 305
    .line 306
    move/from16 p2, v2

    .line 307
    .line 308
    move/from16 p3, v3

    .line 309
    .line 310
    add-double v2, v30, v16

    .line 311
    .line 312
    double-to-float v10, v2

    .line 313
    invoke-virtual/range {v4 .. v10}, Lf1/j;->d(FFFFFF)V

    .line 314
    .line 315
    .line 316
    const/16 v2, 0xe

    .line 317
    .line 318
    aget-wide v5, v0, v2

    .line 319
    .line 320
    mul-double/2addr v5, v12

    .line 321
    add-double/2addr v5, v14

    .line 322
    double-to-float v5, v5

    .line 323
    const/16 v3, 0xf

    .line 324
    .line 325
    aget-wide v6, v0, v3

    .line 326
    .line 327
    mul-double/2addr v6, v12

    .line 328
    add-double v6, v6, v16

    .line 329
    .line 330
    double-to-float v6, v6

    .line 331
    const/16 v30, 0x10

    .line 332
    .line 333
    aget-wide v7, v0, v30

    .line 334
    .line 335
    mul-double/2addr v7, v12

    .line 336
    add-double/2addr v7, v14

    .line 337
    double-to-float v7, v7

    .line 338
    const/16 v31, 0x11

    .line 339
    .line 340
    aget-wide v8, v0, v31

    .line 341
    .line 342
    mul-double/2addr v8, v12

    .line 343
    add-double v8, v8, v16

    .line 344
    .line 345
    double-to-float v8, v8

    .line 346
    const/16 v32, 0x12

    .line 347
    .line 348
    aget-wide v9, v0, v32

    .line 349
    .line 350
    mul-double/2addr v9, v12

    .line 351
    add-double/2addr v9, v14

    .line 352
    double-to-float v9, v9

    .line 353
    const/16 v33, 0x13

    .line 354
    .line 355
    aget-wide v34, v0, v33

    .line 356
    .line 357
    mul-double v34, v34, v12

    .line 358
    .line 359
    move/from16 v36, v2

    .line 360
    .line 361
    move/from16 v37, v3

    .line 362
    .line 363
    add-double v2, v34, v16

    .line 364
    .line 365
    double-to-float v10, v2

    .line 366
    invoke-virtual/range {v4 .. v10}, Lf1/j;->d(FFFFFF)V

    .line 367
    .line 368
    .line 369
    aget-wide v2, v0, v32

    .line 370
    .line 371
    mul-double/2addr v2, v12

    .line 372
    add-double/2addr v2, v14

    .line 373
    double-to-float v2, v2

    .line 374
    aget-wide v5, v0, v33

    .line 375
    .line 376
    mul-double/2addr v5, v12

    .line 377
    sub-double v5, p0, v5

    .line 378
    .line 379
    double-to-float v3, v5

    .line 380
    invoke-virtual {v4, v2, v3}, Lf1/j;->f(FF)V

    .line 381
    .line 382
    .line 383
    aget-wide v2, v0, v30

    .line 384
    .line 385
    mul-double/2addr v2, v12

    .line 386
    add-double/2addr v2, v14

    .line 387
    double-to-float v5, v2

    .line 388
    aget-wide v2, v0, v31

    .line 389
    .line 390
    mul-double/2addr v2, v12

    .line 391
    sub-double v2, p0, v2

    .line 392
    .line 393
    double-to-float v6, v2

    .line 394
    aget-wide v2, v0, v36

    .line 395
    .line 396
    mul-double/2addr v2, v12

    .line 397
    add-double/2addr v2, v14

    .line 398
    double-to-float v7, v2

    .line 399
    aget-wide v2, v0, v37

    .line 400
    .line 401
    mul-double/2addr v2, v12

    .line 402
    sub-double v2, p0, v2

    .line 403
    .line 404
    double-to-float v8, v2

    .line 405
    aget-wide v2, v0, v28

    .line 406
    .line 407
    mul-double/2addr v2, v12

    .line 408
    add-double/2addr v2, v14

    .line 409
    double-to-float v9, v2

    .line 410
    aget-wide v2, v0, v29

    .line 411
    .line 412
    mul-double/2addr v2, v12

    .line 413
    sub-double v2, p0, v2

    .line 414
    .line 415
    double-to-float v10, v2

    .line 416
    invoke-virtual/range {v4 .. v10}, Lf1/j;->d(FFFFFF)V

    .line 417
    .line 418
    .line 419
    aget-wide v2, v0, v26

    .line 420
    .line 421
    mul-double/2addr v2, v12

    .line 422
    add-double/2addr v2, v14

    .line 423
    double-to-float v5, v2

    .line 424
    aget-wide v2, v0, v27

    .line 425
    .line 426
    mul-double/2addr v2, v12

    .line 427
    sub-double v2, p0, v2

    .line 428
    .line 429
    double-to-float v6, v2

    .line 430
    aget-wide v2, v0, p2

    .line 431
    .line 432
    mul-double/2addr v2, v12

    .line 433
    add-double/2addr v2, v14

    .line 434
    double-to-float v7, v2

    .line 435
    aget-wide v2, v0, p3

    .line 436
    .line 437
    mul-double/2addr v2, v12

    .line 438
    sub-double v2, p0, v2

    .line 439
    .line 440
    double-to-float v8, v2

    .line 441
    aget-wide v2, v0, v24

    .line 442
    .line 443
    mul-double/2addr v2, v12

    .line 444
    add-double/2addr v2, v14

    .line 445
    double-to-float v9, v2

    .line 446
    aget-wide v2, v0, v25

    .line 447
    .line 448
    mul-double/2addr v2, v12

    .line 449
    sub-double v2, p0, v2

    .line 450
    .line 451
    double-to-float v10, v2

    .line 452
    invoke-virtual/range {v4 .. v10}, Lf1/j;->d(FFFFFF)V

    .line 453
    .line 454
    .line 455
    aget-wide v2, v0, v22

    .line 456
    .line 457
    mul-double/2addr v2, v12

    .line 458
    add-double/2addr v2, v14

    .line 459
    double-to-float v5, v2

    .line 460
    aget-wide v2, v0, v23

    .line 461
    .line 462
    mul-double/2addr v2, v12

    .line 463
    sub-double v2, p0, v2

    .line 464
    .line 465
    double-to-float v6, v2

    .line 466
    aget-wide v2, v0, v18

    .line 467
    .line 468
    mul-double/2addr v2, v12

    .line 469
    add-double/2addr v2, v14

    .line 470
    double-to-float v7, v2

    .line 471
    aget-wide v2, v0, v19

    .line 472
    .line 473
    mul-double/2addr v2, v12

    .line 474
    sub-double v2, p0, v2

    .line 475
    .line 476
    double-to-float v8, v2

    .line 477
    aget-wide v2, v0, v20

    .line 478
    .line 479
    mul-double/2addr v2, v12

    .line 480
    add-double/2addr v2, v14

    .line 481
    double-to-float v9, v2

    .line 482
    aget-wide v2, v0, v21

    .line 483
    .line 484
    mul-double/2addr v2, v12

    .line 485
    sub-double v2, p0, v2

    .line 486
    .line 487
    double-to-float v10, v2

    .line 488
    invoke-virtual/range {v4 .. v10}, Lf1/j;->d(FFFFFF)V

    .line 489
    .line 490
    .line 491
    aget-wide v2, v0, v20

    .line 492
    .line 493
    mul-double/2addr v2, v12

    .line 494
    sub-double v2, v12, v2

    .line 495
    .line 496
    double-to-float v2, v2

    .line 497
    aget-wide v5, v0, v21

    .line 498
    .line 499
    mul-double/2addr v5, v12

    .line 500
    sub-double v5, p0, v5

    .line 501
    .line 502
    double-to-float v3, v5

    .line 503
    invoke-virtual {v4, v2, v3}, Lf1/j;->f(FF)V

    .line 504
    .line 505
    .line 506
    aget-wide v2, v0, v18

    .line 507
    .line 508
    mul-double/2addr v2, v12

    .line 509
    sub-double v2, v12, v2

    .line 510
    .line 511
    double-to-float v5, v2

    .line 512
    aget-wide v2, v0, v19

    .line 513
    .line 514
    mul-double/2addr v2, v12

    .line 515
    sub-double v2, p0, v2

    .line 516
    .line 517
    double-to-float v6, v2

    .line 518
    aget-wide v2, v0, v22

    .line 519
    .line 520
    mul-double/2addr v2, v12

    .line 521
    sub-double v2, v12, v2

    .line 522
    .line 523
    double-to-float v7, v2

    .line 524
    aget-wide v2, v0, v23

    .line 525
    .line 526
    mul-double/2addr v2, v12

    .line 527
    sub-double v2, p0, v2

    .line 528
    .line 529
    double-to-float v8, v2

    .line 530
    aget-wide v2, v0, v24

    .line 531
    .line 532
    mul-double/2addr v2, v12

    .line 533
    sub-double v2, v12, v2

    .line 534
    .line 535
    double-to-float v9, v2

    .line 536
    aget-wide v2, v0, v25

    .line 537
    .line 538
    mul-double/2addr v2, v12

    .line 539
    sub-double v2, p0, v2

    .line 540
    .line 541
    double-to-float v10, v2

    .line 542
    invoke-virtual/range {v4 .. v10}, Lf1/j;->d(FFFFFF)V

    .line 543
    .line 544
    .line 545
    aget-wide v2, v0, p2

    .line 546
    .line 547
    mul-double/2addr v2, v12

    .line 548
    sub-double v2, v12, v2

    .line 549
    .line 550
    double-to-float v5, v2

    .line 551
    aget-wide v2, v0, p3

    .line 552
    .line 553
    mul-double/2addr v2, v12

    .line 554
    sub-double v2, p0, v2

    .line 555
    .line 556
    double-to-float v6, v2

    .line 557
    aget-wide v2, v0, v26

    .line 558
    .line 559
    mul-double/2addr v2, v12

    .line 560
    sub-double v2, v12, v2

    .line 561
    .line 562
    double-to-float v7, v2

    .line 563
    aget-wide v2, v0, v27

    .line 564
    .line 565
    mul-double/2addr v2, v12

    .line 566
    sub-double v2, p0, v2

    .line 567
    .line 568
    double-to-float v8, v2

    .line 569
    aget-wide v2, v0, v28

    .line 570
    .line 571
    mul-double/2addr v2, v12

    .line 572
    sub-double v2, v12, v2

    .line 573
    .line 574
    double-to-float v9, v2

    .line 575
    aget-wide v2, v0, v29

    .line 576
    .line 577
    mul-double/2addr v2, v12

    .line 578
    sub-double v2, p0, v2

    .line 579
    .line 580
    double-to-float v10, v2

    .line 581
    invoke-virtual/range {v4 .. v10}, Lf1/j;->d(FFFFFF)V

    .line 582
    .line 583
    .line 584
    aget-wide v2, v0, v36

    .line 585
    .line 586
    mul-double/2addr v2, v12

    .line 587
    sub-double v2, v12, v2

    .line 588
    .line 589
    double-to-float v5, v2

    .line 590
    aget-wide v2, v0, v37

    .line 591
    .line 592
    mul-double/2addr v2, v12

    .line 593
    sub-double v2, p0, v2

    .line 594
    .line 595
    double-to-float v6, v2

    .line 596
    aget-wide v2, v0, v30

    .line 597
    .line 598
    mul-double/2addr v2, v12

    .line 599
    sub-double v2, v12, v2

    .line 600
    .line 601
    double-to-float v7, v2

    .line 602
    aget-wide v2, v0, v31

    .line 603
    .line 604
    mul-double/2addr v2, v12

    .line 605
    sub-double v2, p0, v2

    .line 606
    .line 607
    double-to-float v8, v2

    .line 608
    aget-wide v2, v0, v32

    .line 609
    .line 610
    mul-double/2addr v2, v12

    .line 611
    sub-double v2, v12, v2

    .line 612
    .line 613
    double-to-float v9, v2

    .line 614
    aget-wide v2, v0, v33

    .line 615
    .line 616
    mul-double/2addr v2, v12

    .line 617
    sub-double v2, p0, v2

    .line 618
    .line 619
    double-to-float v10, v2

    .line 620
    invoke-virtual/range {v4 .. v10}, Lf1/j;->d(FFFFFF)V

    .line 621
    .line 622
    .line 623
    aget-wide v2, v0, v32

    .line 624
    .line 625
    mul-double/2addr v2, v12

    .line 626
    sub-double v2, v12, v2

    .line 627
    .line 628
    double-to-float v2, v2

    .line 629
    aget-wide v5, v0, v33

    .line 630
    .line 631
    mul-double/2addr v5, v12

    .line 632
    add-double v5, v5, v16

    .line 633
    .line 634
    double-to-float v3, v5

    .line 635
    invoke-virtual {v4, v2, v3}, Lf1/j;->f(FF)V

    .line 636
    .line 637
    .line 638
    aget-wide v2, v0, v30

    .line 639
    .line 640
    mul-double/2addr v2, v12

    .line 641
    sub-double v2, v12, v2

    .line 642
    .line 643
    double-to-float v5, v2

    .line 644
    aget-wide v2, v0, v31

    .line 645
    .line 646
    mul-double/2addr v2, v12

    .line 647
    add-double v2, v2, v16

    .line 648
    .line 649
    double-to-float v6, v2

    .line 650
    aget-wide v2, v0, v36

    .line 651
    .line 652
    mul-double/2addr v2, v12

    .line 653
    sub-double v2, v12, v2

    .line 654
    .line 655
    double-to-float v7, v2

    .line 656
    aget-wide v2, v0, v37

    .line 657
    .line 658
    mul-double/2addr v2, v12

    .line 659
    add-double v2, v2, v16

    .line 660
    .line 661
    double-to-float v8, v2

    .line 662
    aget-wide v2, v0, v28

    .line 663
    .line 664
    mul-double/2addr v2, v12

    .line 665
    sub-double v2, v12, v2

    .line 666
    .line 667
    double-to-float v9, v2

    .line 668
    aget-wide v2, v0, v29

    .line 669
    .line 670
    mul-double/2addr v2, v12

    .line 671
    add-double v2, v2, v16

    .line 672
    .line 673
    double-to-float v10, v2

    .line 674
    invoke-virtual/range {v4 .. v10}, Lf1/j;->d(FFFFFF)V

    .line 675
    .line 676
    .line 677
    aget-wide v2, v0, v26

    .line 678
    .line 679
    mul-double/2addr v2, v12

    .line 680
    sub-double v2, v12, v2

    .line 681
    .line 682
    double-to-float v5, v2

    .line 683
    aget-wide v2, v0, v27

    .line 684
    .line 685
    mul-double/2addr v2, v12

    .line 686
    add-double v2, v2, v16

    .line 687
    .line 688
    double-to-float v6, v2

    .line 689
    aget-wide v2, v0, p2

    .line 690
    .line 691
    mul-double/2addr v2, v12

    .line 692
    sub-double v2, v12, v2

    .line 693
    .line 694
    double-to-float v7, v2

    .line 695
    aget-wide v2, v0, p3

    .line 696
    .line 697
    mul-double/2addr v2, v12

    .line 698
    add-double v2, v2, v16

    .line 699
    .line 700
    double-to-float v8, v2

    .line 701
    aget-wide v2, v0, v24

    .line 702
    .line 703
    mul-double/2addr v2, v12

    .line 704
    sub-double v2, v12, v2

    .line 705
    .line 706
    double-to-float v9, v2

    .line 707
    aget-wide v2, v0, v25

    .line 708
    .line 709
    mul-double/2addr v2, v12

    .line 710
    add-double v2, v2, v16

    .line 711
    .line 712
    double-to-float v10, v2

    .line 713
    invoke-virtual/range {v4 .. v10}, Lf1/j;->d(FFFFFF)V

    .line 714
    .line 715
    .line 716
    aget-wide v2, v0, v22

    .line 717
    .line 718
    mul-double/2addr v2, v12

    .line 719
    sub-double v2, v12, v2

    .line 720
    .line 721
    double-to-float v5, v2

    .line 722
    aget-wide v2, v0, v23

    .line 723
    .line 724
    mul-double/2addr v2, v12

    .line 725
    add-double v2, v2, v16

    .line 726
    .line 727
    double-to-float v6, v2

    .line 728
    aget-wide v2, v0, v18

    .line 729
    .line 730
    mul-double/2addr v2, v12

    .line 731
    sub-double v2, v12, v2

    .line 732
    .line 733
    double-to-float v7, v2

    .line 734
    aget-wide v2, v0, v19

    .line 735
    .line 736
    mul-double/2addr v2, v12

    .line 737
    add-double v2, v2, v16

    .line 738
    .line 739
    double-to-float v8, v2

    .line 740
    aget-wide v2, v0, v20

    .line 741
    .line 742
    mul-double/2addr v2, v12

    .line 743
    sub-double v2, v12, v2

    .line 744
    .line 745
    double-to-float v9, v2

    .line 746
    aget-wide v2, v0, v21

    .line 747
    .line 748
    mul-double/2addr v2, v12

    .line 749
    add-double v2, v2, v16

    .line 750
    .line 751
    double-to-float v10, v2

    .line 752
    invoke-virtual/range {v4 .. v10}, Lf1/j;->d(FFFFFF)V

    .line 753
    .line 754
    .line 755
    invoke-virtual {v11}, Landroid/graphics/Path;->close()V

    .line 756
    .line 757
    .line 758
    :cond_c
    invoke-direct {v1, v4}, Lf1/j0;-><init>(Lf1/j;)V

    .line 759
    .line 760
    .line 761
    return-object v1

    .line 762
    :cond_d
    :goto_3
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 763
    .line 764
    .line 765
    move-result v2

    .line 766
    int-to-long v8, v2

    .line 767
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 768
    .line 769
    .line 770
    move-result v0

    .line 771
    int-to-long v10, v0

    .line 772
    shl-long v0, v8, v1

    .line 773
    .line 774
    and-long v2, v10, v3

    .line 775
    .line 776
    or-long v8, v0, v2

    .line 777
    .line 778
    new-instance v0, Lf1/l0;

    .line 779
    .line 780
    new-instance v3, Le1/d;

    .line 781
    .line 782
    const/4 v4, 0x0

    .line 783
    const/4 v5, 0x0

    .line 784
    move-wide v10, v8

    .line 785
    move-wide v12, v8

    .line 786
    move-wide v14, v8

    .line 787
    invoke-direct/range {v3 .. v15}, Le1/d;-><init>(FFFFJJJJ)V

    .line 788
    .line 789
    .line 790
    invoke-direct {v0, v3}, Lf1/l0;-><init>(Le1/d;)V

    .line 791
    .line 792
    .line 793
    return-object v0
.end method

.method public static final L(Lai/b;Ljava/lang/String;)Lf1/m;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lai/b;->a:Landroid/graphics/RuntimeShader;

    .line 5
    .line 6
    invoke-static {p0, p1}, Lai/a;->d(Landroid/graphics/RuntimeShader;Ljava/lang/String;)Landroid/graphics/RenderEffect;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    new-instance p1, Lf1/m;

    .line 14
    .line 15
    invoke-direct {p1, p0}, Lf1/m;-><init>(Landroid/graphics/RenderEffect;)V

    .line 16
    .line 17
    .line 18
    return-object p1
.end method

.method public static M(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lfg/p;)Ljava/lang/reflect/Method;
    .locals 7

    .line 1
    invoke-static {p3}, Ltf/m;->I1(Ljava/util/List;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Ljava/lang/reflect/Method;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {p0, p1, p2, v0}, Le8/b;->h(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 10
    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_0
    const-string v1, "cache.key"

    .line 14
    .line 15
    :try_start_0
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const-string v3, ""

    .line 20
    .line 21
    invoke-interface {p0, v1, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-static {p0, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-nez p0, :cond_1

    .line 30
    .line 31
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-interface {p0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 36
    .line 37
    .line 38
    :cond_1
    invoke-interface {v2, p2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    :catchall_0
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    const/4 p1, 0x1

    .line 50
    if-le p0, p1, :cond_2

    .line 51
    .line 52
    new-instance v5, Li2/z;

    .line 53
    .line 54
    const/16 p0, 0x12

    .line 55
    .line 56
    invoke-direct {v5, p0}, Li2/z;-><init>(I)V

    .line 57
    .line 58
    .line 59
    const/16 v6, 0x1f

    .line 60
    .line 61
    const/4 v2, 0x0

    .line 62
    const/4 v3, 0x0

    .line 63
    const/4 v4, 0x0

    .line 64
    move-object v1, p3

    .line 65
    invoke-static/range {v1 .. v6}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    const-string p1, "\u591a\u9009\u6d88\u606f"

    .line 70
    .line 71
    const-string p2, "\u5019\u9009\u4e0d\u552f\u4e00: "

    .line 72
    .line 73
    invoke-static {p1, p4, p2, p0}, Lbc/e;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    const/4 p1, 0x0

    .line 78
    invoke-interface {p5, p0, p1}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    :cond_2
    return-object v0
.end method

.method public static N(Ljava/lang/Object;)Ljava/util/Set;
    .locals 0

    .line 1
    invoke-static {p0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    return-object p0
.end method

.method public static final O(Lv1/t;)Le1/c;
    .locals 11

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {p0, v0}, Lv1/w;->f(Lv1/t;Z)Le1/c;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    invoke-virtual {v0}, Le1/c;->d()J

    .line 7
    .line 8
    .line 9
    move-result-wide v1

    .line 10
    invoke-interface {p0, v1, v2}, Lv1/t;->R(J)J

    .line 11
    .line 12
    .line 13
    move-result-wide v1

    .line 14
    iget v3, v0, Le1/c;->c:F

    .line 15
    .line 16
    iget v0, v0, Le1/c;->d:F

    .line 17
    .line 18
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    int-to-long v3, v3

    .line 23
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    int-to-long v5, v0

    .line 28
    const/16 v0, 0x20

    .line 29
    .line 30
    shl-long/2addr v3, v0

    .line 31
    const-wide v7, 0xffffffffL

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    and-long/2addr v5, v7

    .line 37
    or-long/2addr v3, v5

    .line 38
    invoke-interface {p0, v3, v4}, Lv1/t;->R(J)J

    .line 39
    .line 40
    .line 41
    move-result-wide v3

    .line 42
    new-instance p0, Le1/c;

    .line 43
    .line 44
    shr-long v5, v1, v0

    .line 45
    .line 46
    long-to-int v5, v5

    .line 47
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    and-long/2addr v1, v7

    .line 52
    long-to-int v1, v1

    .line 53
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    shr-long v9, v3, v0

    .line 58
    .line 59
    long-to-int v0, v9

    .line 60
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    and-long v2, v3, v7

    .line 65
    .line 66
    long-to-int v2, v2

    .line 67
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    invoke-direct {p0, v5, v1, v0, v2}, Le1/c;-><init>(FFFF)V

    .line 72
    .line 73
    .line 74
    return-object p0
.end method

.method public static final P(Lr/p;)I
    .locals 5

    .line 1
    iget-object v0, p0, Lr/p;->k:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    return v2

    .line 11
    :cond_0
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    move v3, v2

    .line 16
    :goto_0
    if-ge v2, v1, :cond_1

    .line 17
    .line 18
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    check-cast v4, Lr/q;

    .line 23
    .line 24
    iget v4, v4, Lr/q;->p:I

    .line 25
    .line 26
    add-int/2addr v3, v4

    .line 27
    add-int/lit8 v2, v2, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    div-int/2addr v3, v0

    .line 35
    iget p0, p0, Lr/p;->q:I

    .line 36
    .line 37
    add-int/2addr v3, p0

    .line 38
    return v3
.end method

.method public static Q(Le5/a;Ljava/util/Set;)V
    .locals 4

    .line 1
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x1

    .line 6
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_2

    .line 11
    .line 12
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Lk5/b;

    .line 17
    .line 18
    const/16 v2, 0xa

    .line 19
    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0, v2}, Lq5/a;->write(I)V

    .line 23
    .line 24
    .line 25
    :cond_0
    const-string v0, ".annotation "

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Lq5/a;->write(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    iget v0, v1, Lk5/b;->h:I

    .line 31
    .line 32
    if-ltz v0, :cond_1

    .line 33
    .line 34
    const/4 v3, 0x3

    .line 35
    if-ge v0, v3, :cond_1

    .line 36
    .line 37
    sget-object v3, Lf5/b;->a:[Ljava/lang/String;

    .line 38
    .line 39
    aget-object v0, v3, v0

    .line 40
    .line 41
    invoke-virtual {p0, v0}, Lq5/a;->write(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    const/16 v0, 0x20

    .line 45
    .line 46
    invoke-virtual {p0, v0}, Lq5/a;->write(I)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Lk5/b;->getType()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {p0, v0}, Lq5/a;->write(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0, v2}, Lq5/a;->write(I)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1}, Lk5/b;->a()Lk5/a;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {p0, v0}, Le5/a;->x(Ljava/util/Set;)V

    .line 64
    .line 65
    .line 66
    const-string v0, ".end annotation\n"

    .line 67
    .line 68
    invoke-virtual {p0, v0}, Lq5/a;->write(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    const/4 v0, 0x0

    .line 72
    goto :goto_0

    .line 73
    :cond_1
    new-instance p0, Ld6/f;

    .line 74
    .line 75
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    const/4 v0, 0x0

    .line 84
    const-string v1, "Invalid annotation visibility %d"

    .line 85
    .line 86
    invoke-direct {p0, v0, v1, p1}, Ld6/f;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    throw p0

    .line 90
    :cond_2
    return-void
.end method

.method public static final a(JJ)Le1/c;
    .locals 8

    .line 1
    new-instance v0, Le1/c;

    .line 2
    .line 3
    const/16 v1, 0x20

    .line 4
    .line 5
    shr-long v2, p0, v1

    .line 6
    .line 7
    long-to-int v2, v2

    .line 8
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    const-wide v4, 0xffffffffL

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    and-long/2addr p0, v4

    .line 18
    long-to-int p0, p0

    .line 19
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    shr-long v6, p2, v1

    .line 28
    .line 29
    long-to-int v1, v6

    .line 30
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    add-float/2addr v1, v2

    .line 35
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    and-long/2addr p2, v4

    .line 40
    long-to-int p2, p2

    .line 41
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    add-float/2addr p2, p0

    .line 46
    invoke-direct {v0, v3, p1, v1, p2}, Le1/c;-><init>(FFFF)V

    .line 47
    .line 48
    .line 49
    return-object v0
.end method

.method public static final b(Lm/a;Lp1/b;Lm/p1;Lp1/a;La5/a;J)V
    .locals 13

    .line 1
    move-object/from16 v1, p4

    .line 2
    .line 3
    iget-object v2, v1, La5/a;->i:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v2, Lf/f0;

    .line 6
    .line 7
    iget-wide v3, p1, Lp1/b;->c:J

    .line 8
    .line 9
    const/16 v5, 0x20

    .line 10
    .line 11
    shr-long/2addr v3, v5

    .line 12
    long-to-int v3, v3

    .line 13
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    iget-wide v6, p1, Lp1/b;->c:J

    .line 18
    .line 19
    const-wide v8, 0xffffffffL

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    and-long/2addr v6, v8

    .line 25
    long-to-int v4, v6

    .line 26
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    invoke-static {p1}, Lac/p;->j(Lp1/b;)Z

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    const/4 v7, 0x0

    .line 35
    if-eqz v6, :cond_0

    .line 36
    .line 37
    iput v7, v1, La5/a;->h:I

    .line 38
    .line 39
    invoke-virtual {v2}, Lf/f0;->d()V

    .line 40
    .line 41
    .line 42
    :cond_0
    invoke-static {p1}, Lac/p;->c(Lp1/b;)Z

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    const/4 v10, 0x0

    .line 47
    if-nez v6, :cond_5

    .line 48
    .line 49
    invoke-static {p1}, Lac/p;->j(Lp1/b;)Z

    .line 50
    .line 51
    .line 52
    move-result v6

    .line 53
    if-nez v6, :cond_5

    .line 54
    .line 55
    iget v3, v2, Lf/f0;->b:I

    .line 56
    .line 57
    const/4 v4, 0x3

    .line 58
    if-ne v3, v4, :cond_1

    .line 59
    .line 60
    iget v3, v1, La5/a;->h:I

    .line 61
    .line 62
    add-int/lit8 v6, v3, 0x1

    .line 63
    .line 64
    iput v6, v1, La5/a;->h:I

    .line 65
    .line 66
    invoke-virtual {v2, v3, p1}, Lf/f0;->n(ILjava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    invoke-virtual {v2, p1}, Lf/f0;->a(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    :goto_0
    iget v3, v1, La5/a;->h:I

    .line 74
    .line 75
    if-ne v3, v4, :cond_2

    .line 76
    .line 77
    iput v7, v1, La5/a;->h:I

    .line 78
    .line 79
    :cond_2
    iget-object v1, v2, Lf/f0;->a:[Ljava/lang/Object;

    .line 80
    .line 81
    iget v3, v2, Lf/f0;->b:I

    .line 82
    .line 83
    move v4, v7

    .line 84
    move v6, v10

    .line 85
    :goto_1
    if-ge v4, v3, :cond_3

    .line 86
    .line 87
    aget-object v11, v1, v4

    .line 88
    .line 89
    check-cast v11, Lp1/b;

    .line 90
    .line 91
    iget-wide v11, v11, Lp1/b;->c:J

    .line 92
    .line 93
    shr-long/2addr v11, v5

    .line 94
    long-to-int v11, v11

    .line 95
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 96
    .line 97
    .line 98
    move-result v11

    .line 99
    add-float/2addr v6, v11

    .line 100
    add-int/lit8 v4, v4, 0x1

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_3
    iget v1, v2, Lf/f0;->b:I

    .line 104
    .line 105
    int-to-float v3, v1

    .line 106
    div-float v3, v6, v3

    .line 107
    .line 108
    iget-object v4, v2, Lf/f0;->a:[Ljava/lang/Object;

    .line 109
    .line 110
    move v6, v10

    .line 111
    :goto_2
    if-ge v7, v1, :cond_4

    .line 112
    .line 113
    aget-object v11, v4, v7

    .line 114
    .line 115
    check-cast v11, Lp1/b;

    .line 116
    .line 117
    iget-wide v11, v11, Lp1/b;->c:J

    .line 118
    .line 119
    and-long/2addr v11, v8

    .line 120
    long-to-int v11, v11

    .line 121
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 122
    .line 123
    .line 124
    move-result v11

    .line 125
    add-float/2addr v6, v11

    .line 126
    add-int/lit8 v7, v7, 0x1

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_4
    iget v1, v2, Lf/f0;->b:I

    .line 130
    .line 131
    int-to-float v1, v1

    .line 132
    div-float v4, v6, v1

    .line 133
    .line 134
    :cond_5
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    int-to-long v1, v1

    .line 139
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 140
    .line 141
    .line 142
    move-result v3

    .line 143
    int-to-long v3, v3

    .line 144
    shl-long/2addr v1, v5

    .line 145
    and-long/2addr v3, v8

    .line 146
    or-long/2addr v1, v3

    .line 147
    if-nez p2, :cond_6

    .line 148
    .line 149
    goto :goto_4

    .line 150
    :cond_6
    move-object/from16 v3, p3

    .line 151
    .line 152
    iget v3, v3, Lp1/a;->a:I

    .line 153
    .line 154
    const/4 v4, 0x1

    .line 155
    if-ne v3, v4, :cond_7

    .line 156
    .line 157
    shr-long/2addr v1, v5

    .line 158
    long-to-int v1, v1

    .line 159
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    goto :goto_3

    .line 164
    :cond_7
    const/4 v4, 0x2

    .line 165
    if-ne v3, v4, :cond_9

    .line 166
    .line 167
    and-long/2addr v1, v8

    .line 168
    long-to-int v1, v1

    .line 169
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 170
    .line 171
    .line 172
    move-result v1

    .line 173
    :goto_3
    sget-object v2, Lm/p1;->h:Lm/p1;

    .line 174
    .line 175
    if-ne p2, v2, :cond_8

    .line 176
    .line 177
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 178
    .line 179
    .line 180
    move-result v0

    .line 181
    int-to-long v0, v0

    .line 182
    invoke-static {v10}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 183
    .line 184
    .line 185
    move-result v2

    .line 186
    int-to-long v2, v2

    .line 187
    shl-long/2addr v0, v5

    .line 188
    and-long/2addr v2, v8

    .line 189
    or-long v1, v0, v2

    .line 190
    .line 191
    goto :goto_4

    .line 192
    :cond_8
    invoke-static {v10}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    int-to-long v2, v0

    .line 197
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 198
    .line 199
    .line 200
    move-result v0

    .line 201
    int-to-long v0, v0

    .line 202
    shl-long/2addr v2, v5

    .line 203
    and-long/2addr v0, v8

    .line 204
    or-long v1, v2, v0

    .line 205
    .line 206
    :cond_9
    :goto_4
    iget-wide v3, p1, Lp1/b;->b:J

    .line 207
    .line 208
    move-wide/from16 v5, p5

    .line 209
    .line 210
    invoke-static {v1, v2, v5, v6}, Le1/b;->e(JJ)J

    .line 211
    .line 212
    .line 213
    move-result-wide v0

    .line 214
    iget-object p0, p0, Lm/a;->h:Ljava/lang/Object;

    .line 215
    .line 216
    check-cast p0, Lt1/b;

    .line 217
    .line 218
    invoke-virtual {p0, v3, v4, v0, v1}, Lt1/b;->a(JJ)V

    .line 219
    .line 220
    .line 221
    return-void
.end method

.method public static final c(Lp1/b;)Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lp1/b;->h:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean p0, p0, Lp1/b;->d:Z

    .line 6
    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public static final d(Lna/j;Ljava/lang/String;Lna/a;)Lna/a;
    .locals 44

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    invoke-static/range {p1 .. p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    iget-object v2, v0, Lna/j;->b:Ljava/lang/String;

    .line 12
    .line 13
    move-object v4, v2

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object/from16 v4, p1

    .line 16
    .line 17
    :goto_0
    iget-boolean v5, v0, Lna/j;->c:Z

    .line 18
    .line 19
    iget v6, v0, Lna/j;->d:I

    .line 20
    .line 21
    iget v7, v0, Lna/j;->e:I

    .line 22
    .line 23
    iget-wide v8, v0, Lna/j;->f:J

    .line 24
    .line 25
    iget-wide v10, v0, Lna/j;->g:J

    .line 26
    .line 27
    iget-wide v12, v0, Lna/j;->h:J

    .line 28
    .line 29
    iget-boolean v14, v0, Lna/j;->i:Z

    .line 30
    .line 31
    iget v2, v0, Lna/j;->m:I

    .line 32
    .line 33
    iget-object v3, v0, Lna/j;->n:Ljava/lang/String;

    .line 34
    .line 35
    iget-boolean v15, v0, Lna/j;->o:Z

    .line 36
    .line 37
    move/from16 v18, v2

    .line 38
    .line 39
    iget v2, v0, Lna/j;->p:I

    .line 40
    .line 41
    move/from16 v21, v2

    .line 42
    .line 43
    iget v2, v0, Lna/j;->q:I

    .line 44
    .line 45
    move/from16 v22, v2

    .line 46
    .line 47
    iget v2, v0, Lna/j;->r:I

    .line 48
    .line 49
    move/from16 v23, v2

    .line 50
    .line 51
    iget-object v2, v0, Lna/j;->s:Ljava/lang/String;

    .line 52
    .line 53
    move-object/from16 v24, v2

    .line 54
    .line 55
    move-object/from16 v19, v3

    .line 56
    .line 57
    iget-wide v2, v0, Lna/j;->t:J

    .line 58
    .line 59
    move-wide/from16 v25, v2

    .line 60
    .line 61
    iget-boolean v2, v0, Lna/j;->u:Z

    .line 62
    .line 63
    iget-object v3, v0, Lna/j;->v:Ljava/util/List;

    .line 64
    .line 65
    move/from16 v27, v2

    .line 66
    .line 67
    iget-object v2, v0, Lna/j;->w:Ljava/util/List;

    .line 68
    .line 69
    if-eqz v2, :cond_1

    .line 70
    .line 71
    move-object/from16 v29, v2

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_1
    move-object/from16 v29, v3

    .line 75
    .line 76
    :goto_1
    iget-boolean v2, v0, Lna/j;->x:Z

    .line 77
    .line 78
    if-eqz v2, :cond_2

    .line 79
    .line 80
    move/from16 v16, v2

    .line 81
    .line 82
    iget-boolean v2, v0, Lna/j;->y:Z

    .line 83
    .line 84
    :goto_2
    move/from16 v30, v2

    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_2
    move/from16 v16, v2

    .line 88
    .line 89
    iget-boolean v2, v1, Lna/a;->w:Z

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :goto_3
    if-eqz v16, :cond_3

    .line 93
    .line 94
    iget-boolean v2, v0, Lna/j;->z:Z

    .line 95
    .line 96
    :goto_4
    move/from16 v31, v2

    .line 97
    .line 98
    goto :goto_5

    .line 99
    :cond_3
    iget-boolean v2, v1, Lna/a;->x:Z

    .line 100
    .line 101
    goto :goto_4

    .line 102
    :goto_5
    if-eqz v16, :cond_4

    .line 103
    .line 104
    iget-boolean v2, v0, Lna/j;->A:Z

    .line 105
    .line 106
    :goto_6
    move/from16 v32, v2

    .line 107
    .line 108
    goto :goto_7

    .line 109
    :cond_4
    iget-boolean v2, v1, Lna/a;->y:Z

    .line 110
    .line 111
    goto :goto_6

    .line 112
    :goto_7
    if-eqz v16, :cond_5

    .line 113
    .line 114
    iget v2, v0, Lna/j;->B:I

    .line 115
    .line 116
    :goto_8
    move/from16 v33, v2

    .line 117
    .line 118
    goto :goto_9

    .line 119
    :cond_5
    iget v2, v1, Lna/a;->z:I

    .line 120
    .line 121
    goto :goto_8

    .line 122
    :goto_9
    if-eqz v16, :cond_6

    .line 123
    .line 124
    iget-boolean v2, v0, Lna/j;->C:Z

    .line 125
    .line 126
    :goto_a
    move/from16 v34, v2

    .line 127
    .line 128
    goto :goto_b

    .line 129
    :cond_6
    iget-boolean v2, v1, Lna/a;->A:Z

    .line 130
    .line 131
    goto :goto_a

    .line 132
    :goto_b
    if-eqz v16, :cond_7

    .line 133
    .line 134
    iget-object v2, v0, Lna/j;->D:Ljava/lang/String;

    .line 135
    .line 136
    :goto_c
    move-object/from16 v35, v2

    .line 137
    .line 138
    goto :goto_d

    .line 139
    :cond_7
    iget-object v2, v1, Lna/a;->B:Ljava/lang/String;

    .line 140
    .line 141
    goto :goto_c

    .line 142
    :goto_d
    if-eqz v16, :cond_8

    .line 143
    .line 144
    iget-object v2, v0, Lna/j;->E:Ljava/lang/String;

    .line 145
    .line 146
    :goto_e
    move-object/from16 v36, v2

    .line 147
    .line 148
    goto :goto_f

    .line 149
    :cond_8
    iget-object v2, v1, Lna/a;->C:Ljava/lang/String;

    .line 150
    .line 151
    goto :goto_e

    .line 152
    :goto_f
    if-eqz v16, :cond_9

    .line 153
    .line 154
    iget-object v2, v0, Lna/j;->F:Ljava/lang/String;

    .line 155
    .line 156
    :goto_10
    move-object/from16 v37, v2

    .line 157
    .line 158
    goto :goto_11

    .line 159
    :cond_9
    iget-object v2, v1, Lna/a;->D:Ljava/lang/String;

    .line 160
    .line 161
    goto :goto_10

    .line 162
    :goto_11
    if-eqz v16, :cond_a

    .line 163
    .line 164
    iget-boolean v2, v0, Lna/j;->G:Z

    .line 165
    .line 166
    :goto_12
    move/from16 v38, v2

    .line 167
    .line 168
    goto :goto_13

    .line 169
    :cond_a
    iget-boolean v2, v1, Lna/a;->E:Z

    .line 170
    .line 171
    goto :goto_12

    .line 172
    :goto_13
    if-eqz v16, :cond_b

    .line 173
    .line 174
    iget-boolean v2, v0, Lna/j;->H:Z

    .line 175
    .line 176
    :goto_14
    move/from16 v39, v2

    .line 177
    .line 178
    goto :goto_15

    .line 179
    :cond_b
    iget-boolean v2, v1, Lna/a;->F:Z

    .line 180
    .line 181
    goto :goto_14

    .line 182
    :goto_15
    if-eqz v16, :cond_c

    .line 183
    .line 184
    iget-object v2, v0, Lna/j;->I:Ljava/lang/String;

    .line 185
    .line 186
    :goto_16
    move-object/from16 v40, v2

    .line 187
    .line 188
    goto :goto_17

    .line 189
    :cond_c
    iget-object v2, v1, Lna/a;->G:Ljava/lang/String;

    .line 190
    .line 191
    goto :goto_16

    .line 192
    :goto_17
    if-eqz v16, :cond_d

    .line 193
    .line 194
    iget-object v2, v0, Lna/j;->J:Ljava/lang/String;

    .line 195
    .line 196
    :goto_18
    move-object/from16 v41, v2

    .line 197
    .line 198
    goto :goto_19

    .line 199
    :cond_d
    iget-object v2, v1, Lna/a;->H:Ljava/lang/String;

    .line 200
    .line 201
    goto :goto_18

    .line 202
    :goto_19
    if-eqz v16, :cond_e

    .line 203
    .line 204
    iget-boolean v2, v0, Lna/j;->K:Z

    .line 205
    .line 206
    :goto_1a
    move/from16 v42, v2

    .line 207
    .line 208
    goto :goto_1b

    .line 209
    :cond_e
    iget-boolean v2, v1, Lna/a;->I:Z

    .line 210
    .line 211
    goto :goto_1a

    .line 212
    :goto_1b
    if-eqz v16, :cond_f

    .line 213
    .line 214
    iget-object v0, v0, Lna/j;->L:Ljava/lang/String;

    .line 215
    .line 216
    :goto_1c
    move-object/from16 v43, v0

    .line 217
    .line 218
    move-object/from16 v28, v3

    .line 219
    .line 220
    goto :goto_1d

    .line 221
    :cond_f
    iget-object v0, v1, Lna/a;->J:Ljava/lang/String;

    .line 222
    .line 223
    goto :goto_1c

    .line 224
    :goto_1d
    new-instance v3, Lna/a;

    .line 225
    .line 226
    move/from16 v20, v15

    .line 227
    .line 228
    const/4 v15, 0x0

    .line 229
    const-string v16, ""

    .line 230
    .line 231
    const-string v17, ""

    .line 232
    .line 233
    invoke-direct/range {v3 .. v43}, Lna/a;-><init>(Ljava/lang/String;ZIIJJJZILjava/lang/String;Ljava/lang/String;ILjava/lang/String;ZIIILjava/lang/String;JZLjava/util/List;Ljava/util/List;ZZZIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    .line 234
    .line 235
    .line 236
    return-object v3
.end method

.method public static e(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    if-eq p0, p1, :cond_3

    .line 8
    .line 9
    sget-object v0, Lbg/a;->a:Ljava/lang/Integer;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/16 v1, 0x13

    .line 18
    .line 19
    if-lt v0, v1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 25
    :goto_1
    if-eqz v0, :cond_2

    .line 26
    .line 27
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_2
    sget-object v0, Lag/a;->a:Ljava/lang/reflect/Method;

    .line 32
    .line 33
    if-eqz v0, :cond_3

    .line 34
    .line 35
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {v0, p0, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    :cond_3
    return-void
.end method

.method public static f(Ljava/lang/StringBuilder;Ljava/lang/Object;Lfg/l;)V
    .locals 0

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-interface {p2, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/lang/CharSequence;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    if-nez p1, :cond_1

    .line 14
    .line 15
    const/4 p2, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_1
    instance-of p2, p1, Ljava/lang/CharSequence;

    .line 18
    .line 19
    :goto_0
    if-eqz p2, :cond_2

    .line 20
    .line 21
    check-cast p1, Ljava/lang/CharSequence;

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_2
    instance-of p2, p1, Ljava/lang/Character;

    .line 28
    .line 29
    if-eqz p2, :cond_3

    .line 30
    .line 31
    check-cast p1, Ljava/lang/Character;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public static g(Ljava/lang/String;Ljava/util/Map;)Z
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-interface {p1, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    :goto_0
    instance-of p1, p0, Ljava/lang/Boolean;

    .line 10
    .line 11
    if-eqz p1, :cond_1

    .line 12
    .line 13
    check-cast p0, Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    :cond_1
    instance-of p1, p0, Ljava/lang/Number;

    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    if-eqz p1, :cond_2

    .line 24
    .line 25
    check-cast p0, Ljava/lang/Number;

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-eqz p0, :cond_3

    .line 32
    .line 33
    return v0

    .line 34
    :cond_2
    instance-of p1, p0, Ljava/lang/String;

    .line 35
    .line 36
    if-eqz p1, :cond_4

    .line 37
    .line 38
    check-cast p0, Ljava/lang/String;

    .line 39
    .line 40
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    sget-object p1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 49
    .line 50
    invoke-virtual {p0, p1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    sparse-switch p1, :sswitch_data_0

    .line 62
    .line 63
    .line 64
    goto :goto_2

    .line 65
    :sswitch_0
    const-string p1, "false"

    .line 66
    .line 67
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    if-nez p0, :cond_3

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :sswitch_1
    const-string p1, "true"

    .line 75
    .line 76
    :goto_1
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    return v0

    .line 80
    :sswitch_2
    const-string p1, "yes"

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :sswitch_3
    const-string p1, "off"

    .line 84
    .line 85
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result p0

    .line 89
    if-nez p0, :cond_3

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :sswitch_4
    const-string p1, "on"

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :sswitch_5
    const-string p1, "no"

    .line 96
    .line 97
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result p0

    .line 101
    if-nez p0, :cond_3

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :sswitch_6
    const-string p1, "1"

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :sswitch_7
    const-string p1, "0"

    .line 108
    .line 109
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result p0

    .line 113
    if-nez p0, :cond_3

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_3
    const/4 p0, 0x0

    .line 117
    return p0

    .line 118
    :cond_4
    :goto_2
    return v0

    .line 119
    :sswitch_data_0
    .sparse-switch
        0x30 -> :sswitch_7
        0x31 -> :sswitch_6
        0xdc1 -> :sswitch_5
        0xddf -> :sswitch_4
        0x1ad6f -> :sswitch_3
        0x1d2e7 -> :sswitch_2
        0x36758e -> :sswitch_1
        0x5cb1923 -> :sswitch_0
    .end sparse-switch
.end method

.method public static h(Luf/i;)Luf/i;
    .locals 1

    .line 1
    iget-object v0, p0, Luf/i;->g:Luf/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Luf/g;->c()Luf/g;

    .line 4
    .line 5
    .line 6
    iget v0, v0, Luf/g;->o:I

    .line 7
    .line 8
    if-lez v0, :cond_0

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    sget-object p0, Luf/i;->h:Luf/i;

    .line 12
    .line 13
    return-object p0
.end method

.method public static final i(Lf1/n0;Lf1/n0;)Lf1/n0;
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Lf1/n0;->f()Landroid/graphics/RenderEffect;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0}, Lf1/n0;->f()Landroid/graphics/RenderEffect;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p1, p0}, La1/c;->g(Landroid/graphics/RenderEffect;Landroid/graphics/RenderEffect;)Landroid/graphics/RenderEffect;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    new-instance p1, Lf1/m;

    .line 19
    .line 20
    invoke-direct {p1, p0}, Lf1/m;-><init>(Landroid/graphics/RenderEffect;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-object p1
.end method

.method public static final j(Lp1/b;)Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lp1/b;->h:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-boolean p0, p0, Lp1/b;->d:Z

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public static k(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public static l(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    move-object p0, v0

    .line 6
    :cond_0
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-nez v1, :cond_1

    .line 19
    .line 20
    goto :goto_4

    .line 21
    :cond_1
    const-string v1, "#"

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    invoke-static {p0, v1, v2}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_2

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    :goto_0
    const/4 v3, 0x1

    .line 36
    invoke-virtual {p0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    const/4 v5, 0x6

    .line 45
    if-eq v4, v5, :cond_3

    .line 46
    .line 47
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    const/16 v5, 0x8

    .line 52
    .line 53
    if-eq v4, v5, :cond_3

    .line 54
    .line 55
    goto :goto_4

    .line 56
    :cond_3
    move v4, v2

    .line 57
    :goto_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    if-ge v4, v5, :cond_8

    .line 62
    .line 63
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    const/16 v6, 0x30

    .line 68
    .line 69
    if-gt v6, v5, :cond_4

    .line 70
    .line 71
    const/16 v6, 0x3a

    .line 72
    .line 73
    if-ge v5, v6, :cond_4

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_4
    const/16 v6, 0x61

    .line 77
    .line 78
    if-gt v6, v5, :cond_5

    .line 79
    .line 80
    const/16 v6, 0x67

    .line 81
    .line 82
    if-ge v5, v6, :cond_5

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_5
    const/16 v6, 0x41

    .line 86
    .line 87
    if-gt v6, v5, :cond_6

    .line 88
    .line 89
    const/16 v6, 0x47

    .line 90
    .line 91
    if-ge v5, v6, :cond_6

    .line 92
    .line 93
    :goto_2
    move v5, v3

    .line 94
    goto :goto_3

    .line 95
    :cond_6
    move v5, v2

    .line 96
    :goto_3
    if-nez v5, :cond_7

    .line 97
    .line 98
    :goto_4
    return-object v0

    .line 99
    :cond_7
    add-int/lit8 v4, v4, 0x1

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_8
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 103
    .line 104
    invoke-virtual {p0, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    return-object p0
.end method

.method public static m(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    move-object p0, v0

    .line 6
    :cond_0
    const/4 v1, 0x1

    .line 7
    new-array v2, v1, [C

    .line 8
    .line 9
    const/16 v3, 0x2c

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    aput-char v3, v2, v4

    .line 13
    .line 14
    const/4 v3, 0x6

    .line 15
    invoke-static {p0, v2, v3}, Log/m;->F0(Ljava/lang/CharSequence;[CI)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    new-instance v2, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_4

    .line 33
    .line 34
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    check-cast v3, Ljava/lang/String;

    .line 39
    .line 40
    invoke-static {v3}, Lac/p;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    if-lez v5, :cond_2

    .line 49
    .line 50
    move v5, v1

    .line 51
    goto :goto_1

    .line 52
    :cond_2
    move v5, v4

    .line 53
    :goto_1
    if-eqz v5, :cond_3

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_3
    const/4 v3, 0x0

    .line 57
    :goto_2
    if-eqz v3, :cond_1

    .line 58
    .line 59
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_4
    const/4 p0, 0x2

    .line 64
    invoke-static {p0, v2}, Ltf/m;->L1(ILjava/lang/Iterable;)Ljava/util/List;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    if-eqz v2, :cond_5

    .line 73
    .line 74
    return-object v0

    .line 75
    :cond_5
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-eq v0, v1, :cond_7

    .line 80
    .line 81
    invoke-interface {p0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    invoke-static {v0, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-eqz v0, :cond_6

    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_6
    invoke-interface {p0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    new-instance v1, Ljava/lang/StringBuilder;

    .line 105
    .line 106
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    const-string v0, ","

    .line 113
    .line 114
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    return-object p0

    .line 125
    :cond_7
    :goto_3
    invoke-interface {p0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    check-cast p0, Ljava/lang/String;

    .line 130
    .line 131
    return-object p0
.end method

.method public static final n(Ln/k;Li0/h0;)Li0/a1;
    .locals 4

    .line 1
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Li0/l;->a:Li0/e;

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-static {v0}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p1, v0}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    check-cast v0, Li0/a1;

    .line 19
    .line 20
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    if-ne v2, v1, :cond_1

    .line 25
    .line 26
    new-instance v2, Ln/e;

    .line 27
    .line 28
    const/4 v1, 0x2

    .line 29
    const/4 v3, 0x0

    .line 30
    invoke-direct {v2, p0, v0, v3, v1}, Ln/e;-><init>(Ln/k;Li0/a1;Lwf/c;I)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    check-cast v2, Lfg/p;

    .line 37
    .line 38
    invoke-static {v2, p1, p0}, Li0/r;->f(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    return-object v0
.end method

.method public static o(Ljava/util/List;Ljava/util/List;)Ljava/util/List;
    .locals 3

    .line 1
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    if-nez v0, :cond_1

    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_1
    if-nez v1, :cond_2

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_2
    new-instance v2, Ljava/util/LinkedHashSet;

    .line 23
    .line 24
    add-int/2addr v0, v1

    .line 25
    invoke-direct {v2, v0}, Ljava/util/LinkedHashSet;-><init>(I)V

    .line 26
    .line 27
    .line 28
    invoke-interface {v2, p0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 29
    .line 30
    .line 31
    invoke-interface {v2, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 32
    .line 33
    .line 34
    new-instance p0, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-direct {p0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 37
    .line 38
    .line 39
    return-object p0
.end method

.method public static p()Lh6/g;
    .locals 3

    .line 1
    new-instance v0, Lh6/g;

    .line 2
    .line 3
    invoke-direct {v0}, Lh6/g;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    iput-boolean v1, v0, Lh6/g;->l:Z

    .line 8
    .line 9
    iget-object v2, v0, Lh6/g;->a:Lj6/d;

    .line 10
    .line 11
    invoke-virtual {v2}, Lj6/d;->b()Lj6/d;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    iput-boolean v1, v2, Lj6/d;->g:Z

    .line 16
    .line 17
    iput-object v2, v0, Lh6/g;->a:Lj6/d;

    .line 18
    .line 19
    const/4 v1, 0x3

    .line 20
    iput v1, v0, Lh6/g;->k:I

    .line 21
    .line 22
    sget-object v1, Lh6/a;->e:Lh6/a;

    .line 23
    .line 24
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    iput-object v1, v0, Lh6/g;->j:Lh6/a;

    .line 28
    .line 29
    return-object v0
.end method

.method public static final q(JZIF)J
    .locals 0

    .line 1
    if-nez p2, :cond_2

    .line 2
    .line 3
    const/4 p2, 0x2

    .line 4
    if-ne p3, p2, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 p2, 0x4

    .line 8
    if-ne p3, p2, :cond_1

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_1
    const/4 p2, 0x5

    .line 12
    if-ne p3, p2, :cond_3

    .line 13
    .line 14
    :cond_2
    :goto_0
    invoke-static {p0, p1}, Lu2/a;->d(J)Z

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    if-eqz p2, :cond_3

    .line 19
    .line 20
    invoke-static {p0, p1}, Lu2/a;->h(J)I

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    goto :goto_1

    .line 25
    :cond_3
    const p2, 0x7fffffff

    .line 26
    .line 27
    .line 28
    :goto_1
    invoke-static {p0, p1}, Lu2/a;->j(J)I

    .line 29
    .line 30
    .line 31
    move-result p3

    .line 32
    if-ne p3, p2, :cond_4

    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_4
    invoke-static {p4}, Lw/s;->n(F)I

    .line 36
    .line 37
    .line 38
    move-result p3

    .line 39
    invoke-static {p0, p1}, Lu2/a;->j(J)I

    .line 40
    .line 41
    .line 42
    move-result p4

    .line 43
    invoke-static {p3, p4, p2}, Lr9/e0;->r(III)I

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    :goto_2
    invoke-static {p0, p1}, Lu2/a;->g(J)I

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    const/4 p1, 0x0

    .line 52
    invoke-static {p1, p2, p1, p0}, Lf8/i;->u(IIII)J

    .line 53
    .line 54
    .line 55
    move-result-wide p0

    .line 56
    return-wide p0
.end method

.method public static r(Ljava/lang/String;Ljava/util/Map;)F
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    invoke-interface {p1, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object p0, v0

    .line 10
    :goto_0
    instance-of p1, p0, Ljava/lang/Number;

    .line 11
    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    check-cast p0, Ljava/lang/Number;

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    return p0

    .line 21
    :cond_1
    instance-of p1, p0, Ljava/lang/String;

    .line 22
    .line 23
    if-eqz p1, :cond_3

    .line 24
    .line 25
    check-cast p0, Ljava/lang/String;

    .line 26
    .line 27
    :try_start_0
    invoke-static {p0}, Log/s;->T(Ljava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_2

    .line 32
    .line 33
    invoke-static {p0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 38
    .line 39
    .line 40
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    :catch_0
    :cond_2
    if-eqz v0, :cond_3

    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    return p0

    .line 48
    :cond_3
    const/high16 p0, 0x41400000    # 12.0f

    .line 49
    .line 50
    return p0
.end method

.method public static s(Lorg/luckypray/dexkit/DexKitBridge;Ljh/c;)Lhh/a;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const/4 v2, 0x4

    .line 9
    invoke-virtual {v1, v2}, Lg6/c;->b(I)I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-eqz v3, :cond_0

    .line 14
    .line 15
    iget-object v4, v1, Lg6/c;->b:Ljava/nio/ByteBuffer;

    .line 16
    .line 17
    iget v5, v1, Lg6/c;->a:I

    .line 18
    .line 19
    add-int/2addr v3, v5

    .line 20
    invoke-virtual {v4, v3}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 21
    .line 22
    .line 23
    :cond_0
    const/4 v3, 0x6

    .line 24
    invoke-virtual {v1, v3}, Lg6/c;->b(I)I

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    if-eqz v4, :cond_1

    .line 29
    .line 30
    iget-object v5, v1, Lg6/c;->b:Ljava/nio/ByteBuffer;

    .line 31
    .line 32
    iget v6, v1, Lg6/c;->a:I

    .line 33
    .line 34
    add-int/2addr v4, v6

    .line 35
    invoke-virtual {v5, v4}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 36
    .line 37
    .line 38
    :cond_1
    const/16 v4, 0x8

    .line 39
    .line 40
    invoke-virtual {v1, v4}, Lg6/c;->b(I)I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    if-eqz v4, :cond_2

    .line 45
    .line 46
    iget v6, v1, Lg6/c;->a:I

    .line 47
    .line 48
    add-int/2addr v4, v6

    .line 49
    invoke-virtual {v1, v4}, Lg6/c;->d(I)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    goto :goto_0

    .line 54
    :cond_2
    const/4 v4, 0x0

    .line 55
    :goto_0
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    const/16 v6, 0xa

    .line 59
    .line 60
    invoke-virtual {v1, v6}, Lg6/c;->b(I)I

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    const/4 v7, 0x0

    .line 65
    if-eqz v6, :cond_3

    .line 66
    .line 67
    iget-object v8, v1, Lg6/c;->b:Ljava/nio/ByteBuffer;

    .line 68
    .line 69
    iget v9, v1, Lg6/c;->a:I

    .line 70
    .line 71
    add-int/2addr v6, v9

    .line 72
    invoke-virtual {v8, v6}, Ljava/nio/ByteBuffer;->get(I)B

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    goto :goto_1

    .line 77
    :cond_3
    move v6, v7

    .line 78
    :goto_1
    const/4 v8, 0x1

    .line 79
    if-nez v6, :cond_4

    .line 80
    .line 81
    move v9, v8

    .line 82
    goto :goto_2

    .line 83
    :cond_4
    const/4 v9, 0x2

    .line 84
    if-ne v6, v8, :cond_5

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_5
    const/4 v10, 0x3

    .line 88
    if-ne v6, v9, :cond_6

    .line 89
    .line 90
    move v9, v10

    .line 91
    goto :goto_2

    .line 92
    :cond_6
    if-ne v6, v10, :cond_16

    .line 93
    .line 94
    move v9, v7

    .line 95
    :goto_2
    new-instance v6, Ljava/util/ArrayList;

    .line 96
    .line 97
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 98
    .line 99
    .line 100
    const/16 v10, 0xc

    .line 101
    .line 102
    invoke-virtual {v1, v10}, Lg6/c;->b(I)I

    .line 103
    .line 104
    .line 105
    move-result v11

    .line 106
    if-eqz v11, :cond_7

    .line 107
    .line 108
    invoke-virtual {v1, v11}, Lg6/c;->f(I)I

    .line 109
    .line 110
    .line 111
    move-result v11

    .line 112
    goto :goto_3

    .line 113
    :cond_7
    move v11, v7

    .line 114
    :goto_3
    move v12, v7

    .line 115
    :goto_4
    if-ge v12, v11, :cond_15

    .line 116
    .line 117
    new-instance v13, Ljh/a;

    .line 118
    .line 119
    invoke-direct {v13}, Lg6/c;-><init>()V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v1, v10}, Lg6/c;->b(I)I

    .line 123
    .line 124
    .line 125
    move-result v14

    .line 126
    if-eqz v14, :cond_8

    .line 127
    .line 128
    invoke-virtual {v1, v14}, Lg6/c;->e(I)I

    .line 129
    .line 130
    .line 131
    move-result v14

    .line 132
    mul-int/lit8 v15, v12, 0x4

    .line 133
    .line 134
    add-int/2addr v15, v14

    .line 135
    invoke-virtual {v1, v15}, Lg6/c;->a(I)I

    .line 136
    .line 137
    .line 138
    move-result v14

    .line 139
    iget-object v15, v1, Lg6/c;->b:Ljava/nio/ByteBuffer;

    .line 140
    .line 141
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v13, v14, v15}, Lg6/c;->c(ILjava/nio/ByteBuffer;)V

    .line 145
    .line 146
    .line 147
    goto :goto_5

    .line 148
    :cond_8
    const/4 v13, 0x0

    .line 149
    :goto_5
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    new-instance v14, Ljh/a;

    .line 153
    .line 154
    invoke-direct {v14}, Lg6/c;-><init>()V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v13, v3}, Lg6/c;->b(I)I

    .line 158
    .line 159
    .line 160
    move-result v15

    .line 161
    if-eqz v15, :cond_9

    .line 162
    .line 163
    iget v5, v13, Lg6/c;->a:I

    .line 164
    .line 165
    add-int/2addr v15, v5

    .line 166
    invoke-virtual {v13, v15}, Lg6/c;->a(I)I

    .line 167
    .line 168
    .line 169
    move-result v5

    .line 170
    iget-object v15, v13, Lg6/c;->b:Ljava/nio/ByteBuffer;

    .line 171
    .line 172
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v14, v5, v15}, Lg6/c;->c(ILjava/nio/ByteBuffer;)V

    .line 176
    .line 177
    .line 178
    goto :goto_6

    .line 179
    :cond_9
    const/4 v14, 0x0

    .line 180
    :goto_6
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    new-instance v5, Lhh/b;

    .line 184
    .line 185
    invoke-virtual {v13, v2}, Lg6/c;->b(I)I

    .line 186
    .line 187
    .line 188
    move-result v15

    .line 189
    if-eqz v15, :cond_a

    .line 190
    .line 191
    iget v8, v13, Lg6/c;->a:I

    .line 192
    .line 193
    add-int/2addr v15, v8

    .line 194
    invoke-virtual {v13, v15}, Lg6/c;->d(I)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v8

    .line 198
    goto :goto_7

    .line 199
    :cond_a
    const/4 v8, 0x0

    .line 200
    :goto_7
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v14, v3}, Lg6/c;->b(I)I

    .line 204
    .line 205
    .line 206
    move-result v13

    .line 207
    if-eqz v13, :cond_b

    .line 208
    .line 209
    iget-object v15, v14, Lg6/c;->b:Ljava/nio/ByteBuffer;

    .line 210
    .line 211
    iget v3, v14, Lg6/c;->a:I

    .line 212
    .line 213
    add-int/2addr v13, v3

    .line 214
    invoke-virtual {v15, v13}, Ljava/nio/ByteBuffer;->get(I)B

    .line 215
    .line 216
    .line 217
    move-result v3

    .line 218
    goto :goto_8

    .line 219
    :cond_b
    move v3, v7

    .line 220
    :goto_8
    invoke-static {v3}, La7/a;->u(B)I

    .line 221
    .line 222
    .line 223
    move-result v3

    .line 224
    invoke-static {v3}, Lt3/c;->b(I)I

    .line 225
    .line 226
    .line 227
    move-result v13

    .line 228
    packed-switch v13, :pswitch_data_0

    .line 229
    .line 230
    .line 231
    invoke-static {}, Lokio/a;->k()V

    .line 232
    .line 233
    .line 234
    :goto_9
    const/4 v0, 0x0

    .line 235
    return-object v0

    .line 236
    :pswitch_0
    new-instance v13, Ljh/e;

    .line 237
    .line 238
    invoke-direct {v13}, Lg6/c;-><init>()V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v14, v13}, Ljh/a;->p(Lg6/c;)Lg6/c;

    .line 242
    .line 243
    .line 244
    move-result-object v13

    .line 245
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 246
    .line 247
    .line 248
    check-cast v13, Ljh/e;

    .line 249
    .line 250
    invoke-virtual {v13, v2}, Lg6/c;->b(I)I

    .line 251
    .line 252
    .line 253
    move-result v14

    .line 254
    if-eqz v14, :cond_c

    .line 255
    .line 256
    int-to-byte v15, v7

    .line 257
    iget-object v7, v13, Lg6/c;->b:Ljava/nio/ByteBuffer;

    .line 258
    .line 259
    iget v13, v13, Lg6/c;->a:I

    .line 260
    .line 261
    add-int/2addr v14, v13

    .line 262
    invoke-virtual {v7, v14}, Ljava/nio/ByteBuffer;->get(I)B

    .line 263
    .line 264
    .line 265
    move-result v7

    .line 266
    if-eq v15, v7, :cond_c

    .line 267
    .line 268
    const/4 v7, 0x1

    .line 269
    goto :goto_a

    .line 270
    :cond_c
    const/4 v7, 0x0

    .line 271
    :goto_a
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 272
    .line 273
    .line 274
    move-result-object v7

    .line 275
    goto/16 :goto_13

    .line 276
    .line 277
    :pswitch_1
    new-instance v7, Ljh/l;

    .line 278
    .line 279
    invoke-direct {v7}, Lg6/c;-><init>()V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v14, v7}, Ljh/a;->p(Lg6/c;)Lg6/c;

    .line 283
    .line 284
    .line 285
    move-result-object v7

    .line 286
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 287
    .line 288
    .line 289
    check-cast v7, Ljh/l;

    .line 290
    .line 291
    goto/16 :goto_13

    .line 292
    .line 293
    :pswitch_2
    new-instance v7, Ljh/c;

    .line 294
    .line 295
    invoke-direct {v7}, Lg6/c;-><init>()V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v14, v7}, Ljh/a;->p(Lg6/c;)Lg6/c;

    .line 299
    .line 300
    .line 301
    move-result-object v7

    .line 302
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 303
    .line 304
    .line 305
    check-cast v7, Ljh/c;

    .line 306
    .line 307
    invoke-static {v0, v7}, Lac/p;->s(Lorg/luckypray/dexkit/DexKitBridge;Ljh/c;)Lhh/a;

    .line 308
    .line 309
    .line 310
    move-result-object v7

    .line 311
    goto/16 :goto_13

    .line 312
    .line 313
    :pswitch_3
    new-instance v7, Ljh/b;

    .line 314
    .line 315
    invoke-direct {v7}, Lg6/c;-><init>()V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v14, v7}, Ljh/a;->p(Lg6/c;)Lg6/c;

    .line 319
    .line 320
    .line 321
    move-result-object v7

    .line 322
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 323
    .line 324
    .line 325
    check-cast v7, Ljh/b;

    .line 326
    .line 327
    invoke-static {v0, v7}, Lbe/h;->z(Lorg/luckypray/dexkit/DexKitBridge;Ljh/b;)Lhh/c;

    .line 328
    .line 329
    .line 330
    move-result-object v7

    .line 331
    goto/16 :goto_13

    .line 332
    .line 333
    :pswitch_4
    new-instance v7, Ljh/o;

    .line 334
    .line 335
    invoke-direct {v7}, Lg6/c;-><init>()V

    .line 336
    .line 337
    .line 338
    invoke-virtual {v14, v7}, Ljh/a;->p(Lg6/c;)Lg6/c;

    .line 339
    .line 340
    .line 341
    move-result-object v7

    .line 342
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 343
    .line 344
    .line 345
    check-cast v7, Ljh/o;

    .line 346
    .line 347
    invoke-static {v0, v7}, Lfb/v0;->r(Lorg/luckypray/dexkit/DexKitBridge;Ljh/o;)Lhh/l;

    .line 348
    .line 349
    .line 350
    move-result-object v7

    .line 351
    goto/16 :goto_13

    .line 352
    .line 353
    :pswitch_5
    new-instance v7, Ljh/p;

    .line 354
    .line 355
    invoke-direct {v7}, Lg6/c;-><init>()V

    .line 356
    .line 357
    .line 358
    invoke-virtual {v14, v7}, Ljh/a;->p(Lg6/c;)Lg6/c;

    .line 359
    .line 360
    .line 361
    move-result-object v7

    .line 362
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 363
    .line 364
    .line 365
    check-cast v7, Ljh/p;

    .line 366
    .line 367
    invoke-static {v0, v7}, Lg4/a;->p(Lorg/luckypray/dexkit/DexKitBridge;Ljh/p;)Lhh/o;

    .line 368
    .line 369
    .line 370
    move-result-object v7

    .line 371
    goto/16 :goto_13

    .line 372
    .line 373
    :pswitch_6
    new-instance v7, Ljh/d;

    .line 374
    .line 375
    invoke-direct {v7}, Lg6/c;-><init>()V

    .line 376
    .line 377
    .line 378
    invoke-virtual {v14, v7}, Ljh/a;->p(Lg6/c;)Lg6/c;

    .line 379
    .line 380
    .line 381
    move-result-object v7

    .line 382
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 383
    .line 384
    .line 385
    check-cast v7, Ljh/d;

    .line 386
    .line 387
    invoke-static {v0, v7}, Lf8/i;->v(Lorg/luckypray/dexkit/DexKitBridge;Ljh/d;)Lhh/i;

    .line 388
    .line 389
    .line 390
    move-result-object v7

    .line 391
    goto/16 :goto_13

    .line 392
    .line 393
    :pswitch_7
    new-instance v7, Ljh/n;

    .line 394
    .line 395
    invoke-direct {v7}, Lg6/c;-><init>()V

    .line 396
    .line 397
    .line 398
    invoke-virtual {v14, v7}, Ljh/a;->p(Lg6/c;)Lg6/c;

    .line 399
    .line 400
    .line 401
    move-result-object v7

    .line 402
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 403
    .line 404
    .line 405
    check-cast v7, Ljh/n;

    .line 406
    .line 407
    invoke-virtual {v7, v2}, Lg6/c;->b(I)I

    .line 408
    .line 409
    .line 410
    move-result v13

    .line 411
    if-eqz v13, :cond_d

    .line 412
    .line 413
    iget v14, v7, Lg6/c;->a:I

    .line 414
    .line 415
    add-int/2addr v13, v14

    .line 416
    invoke-virtual {v7, v13}, Lg6/c;->d(I)Ljava/lang/String;

    .line 417
    .line 418
    .line 419
    move-result-object v7

    .line 420
    goto :goto_b

    .line 421
    :cond_d
    const/4 v7, 0x0

    .line 422
    :goto_b
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 423
    .line 424
    .line 425
    goto/16 :goto_13

    .line 426
    .line 427
    :pswitch_8
    new-instance v7, Ljh/h;

    .line 428
    .line 429
    invoke-direct {v7}, Lg6/c;-><init>()V

    .line 430
    .line 431
    .line 432
    invoke-virtual {v14, v7}, Ljh/a;->p(Lg6/c;)Lg6/c;

    .line 433
    .line 434
    .line 435
    move-result-object v7

    .line 436
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 437
    .line 438
    .line 439
    check-cast v7, Ljh/h;

    .line 440
    .line 441
    invoke-virtual {v7, v2}, Lg6/c;->b(I)I

    .line 442
    .line 443
    .line 444
    move-result v13

    .line 445
    if-eqz v13, :cond_e

    .line 446
    .line 447
    iget-object v14, v7, Lg6/c;->b:Ljava/nio/ByteBuffer;

    .line 448
    .line 449
    iget v7, v7, Lg6/c;->a:I

    .line 450
    .line 451
    add-int/2addr v13, v7

    .line 452
    invoke-virtual {v14, v13}, Ljava/nio/ByteBuffer;->getDouble(I)D

    .line 453
    .line 454
    .line 455
    move-result-wide v13

    .line 456
    goto :goto_c

    .line 457
    :cond_e
    const-wide/16 v13, 0x0

    .line 458
    .line 459
    :goto_c
    invoke-static {v13, v14}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 460
    .line 461
    .line 462
    move-result-object v7

    .line 463
    goto/16 :goto_13

    .line 464
    .line 465
    :pswitch_9
    new-instance v7, Ljh/i;

    .line 466
    .line 467
    invoke-direct {v7}, Lg6/c;-><init>()V

    .line 468
    .line 469
    .line 470
    invoke-virtual {v14, v7}, Ljh/a;->p(Lg6/c;)Lg6/c;

    .line 471
    .line 472
    .line 473
    move-result-object v7

    .line 474
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 475
    .line 476
    .line 477
    check-cast v7, Ljh/i;

    .line 478
    .line 479
    invoke-virtual {v7, v2}, Lg6/c;->b(I)I

    .line 480
    .line 481
    .line 482
    move-result v13

    .line 483
    if-eqz v13, :cond_f

    .line 484
    .line 485
    iget-object v14, v7, Lg6/c;->b:Ljava/nio/ByteBuffer;

    .line 486
    .line 487
    iget v7, v7, Lg6/c;->a:I

    .line 488
    .line 489
    add-int/2addr v13, v7

    .line 490
    invoke-virtual {v14, v13}, Ljava/nio/ByteBuffer;->getFloat(I)F

    .line 491
    .line 492
    .line 493
    move-result v7

    .line 494
    goto :goto_d

    .line 495
    :cond_f
    const/4 v7, 0x0

    .line 496
    :goto_d
    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 497
    .line 498
    .line 499
    move-result-object v7

    .line 500
    goto/16 :goto_13

    .line 501
    .line 502
    :pswitch_a
    new-instance v7, Ljh/k;

    .line 503
    .line 504
    invoke-direct {v7}, Lg6/c;-><init>()V

    .line 505
    .line 506
    .line 507
    invoke-virtual {v14, v7}, Ljh/a;->p(Lg6/c;)Lg6/c;

    .line 508
    .line 509
    .line 510
    move-result-object v7

    .line 511
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 512
    .line 513
    .line 514
    check-cast v7, Ljh/k;

    .line 515
    .line 516
    invoke-virtual {v7, v2}, Lg6/c;->b(I)I

    .line 517
    .line 518
    .line 519
    move-result v13

    .line 520
    if-eqz v13, :cond_10

    .line 521
    .line 522
    iget-object v14, v7, Lg6/c;->b:Ljava/nio/ByteBuffer;

    .line 523
    .line 524
    iget v7, v7, Lg6/c;->a:I

    .line 525
    .line 526
    add-int/2addr v13, v7

    .line 527
    invoke-virtual {v14, v13}, Ljava/nio/ByteBuffer;->getLong(I)J

    .line 528
    .line 529
    .line 530
    move-result-wide v13

    .line 531
    goto :goto_e

    .line 532
    :cond_10
    const-wide/16 v13, 0x0

    .line 533
    .line 534
    :goto_e
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 535
    .line 536
    .line 537
    move-result-object v7

    .line 538
    goto/16 :goto_13

    .line 539
    .line 540
    :pswitch_b
    new-instance v7, Ljh/j;

    .line 541
    .line 542
    invoke-direct {v7}, Lg6/c;-><init>()V

    .line 543
    .line 544
    .line 545
    invoke-virtual {v14, v7}, Ljh/a;->p(Lg6/c;)Lg6/c;

    .line 546
    .line 547
    .line 548
    move-result-object v7

    .line 549
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 550
    .line 551
    .line 552
    check-cast v7, Ljh/j;

    .line 553
    .line 554
    invoke-virtual {v7, v2}, Lg6/c;->b(I)I

    .line 555
    .line 556
    .line 557
    move-result v13

    .line 558
    if-eqz v13, :cond_11

    .line 559
    .line 560
    iget-object v14, v7, Lg6/c;->b:Ljava/nio/ByteBuffer;

    .line 561
    .line 562
    iget v7, v7, Lg6/c;->a:I

    .line 563
    .line 564
    add-int/2addr v13, v7

    .line 565
    invoke-virtual {v14, v13}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 566
    .line 567
    .line 568
    move-result v7

    .line 569
    goto :goto_f

    .line 570
    :cond_11
    const/4 v7, 0x0

    .line 571
    :goto_f
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 572
    .line 573
    .line 574
    move-result-object v7

    .line 575
    goto :goto_13

    .line 576
    :pswitch_c
    new-instance v7, Ljh/g;

    .line 577
    .line 578
    invoke-direct {v7}, Lg6/c;-><init>()V

    .line 579
    .line 580
    .line 581
    invoke-virtual {v14, v7}, Ljh/a;->p(Lg6/c;)Lg6/c;

    .line 582
    .line 583
    .line 584
    move-result-object v7

    .line 585
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 586
    .line 587
    .line 588
    check-cast v7, Ljh/g;

    .line 589
    .line 590
    invoke-virtual {v7, v2}, Lg6/c;->b(I)I

    .line 591
    .line 592
    .line 593
    move-result v13

    .line 594
    if-eqz v13, :cond_12

    .line 595
    .line 596
    iget-object v14, v7, Lg6/c;->b:Ljava/nio/ByteBuffer;

    .line 597
    .line 598
    iget v7, v7, Lg6/c;->a:I

    .line 599
    .line 600
    add-int/2addr v13, v7

    .line 601
    invoke-virtual {v14, v13}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 602
    .line 603
    .line 604
    move-result v7

    .line 605
    goto :goto_10

    .line 606
    :cond_12
    const/4 v7, 0x0

    .line 607
    :goto_10
    invoke-static {v7}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 608
    .line 609
    .line 610
    move-result-object v7

    .line 611
    goto :goto_13

    .line 612
    :pswitch_d
    new-instance v7, Ljh/m;

    .line 613
    .line 614
    invoke-direct {v7}, Lg6/c;-><init>()V

    .line 615
    .line 616
    .line 617
    invoke-virtual {v14, v7}, Ljh/a;->p(Lg6/c;)Lg6/c;

    .line 618
    .line 619
    .line 620
    move-result-object v7

    .line 621
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 622
    .line 623
    .line 624
    check-cast v7, Ljh/m;

    .line 625
    .line 626
    invoke-virtual {v7, v2}, Lg6/c;->b(I)I

    .line 627
    .line 628
    .line 629
    move-result v13

    .line 630
    if-eqz v13, :cond_13

    .line 631
    .line 632
    iget-object v14, v7, Lg6/c;->b:Ljava/nio/ByteBuffer;

    .line 633
    .line 634
    iget v7, v7, Lg6/c;->a:I

    .line 635
    .line 636
    add-int/2addr v13, v7

    .line 637
    invoke-virtual {v14, v13}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 638
    .line 639
    .line 640
    move-result v7

    .line 641
    goto :goto_11

    .line 642
    :cond_13
    const/4 v7, 0x0

    .line 643
    :goto_11
    invoke-static {v7}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 644
    .line 645
    .line 646
    move-result-object v7

    .line 647
    goto :goto_13

    .line 648
    :pswitch_e
    new-instance v7, Ljh/f;

    .line 649
    .line 650
    invoke-direct {v7}, Lg6/c;-><init>()V

    .line 651
    .line 652
    .line 653
    invoke-virtual {v14, v7}, Ljh/a;->p(Lg6/c;)Lg6/c;

    .line 654
    .line 655
    .line 656
    move-result-object v7

    .line 657
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 658
    .line 659
    .line 660
    check-cast v7, Ljh/f;

    .line 661
    .line 662
    invoke-virtual {v7, v2}, Lg6/c;->b(I)I

    .line 663
    .line 664
    .line 665
    move-result v13

    .line 666
    if-eqz v13, :cond_14

    .line 667
    .line 668
    iget-object v14, v7, Lg6/c;->b:Ljava/nio/ByteBuffer;

    .line 669
    .line 670
    iget v7, v7, Lg6/c;->a:I

    .line 671
    .line 672
    add-int/2addr v13, v7

    .line 673
    invoke-virtual {v14, v13}, Ljava/nio/ByteBuffer;->get(I)B

    .line 674
    .line 675
    .line 676
    move-result v7

    .line 677
    goto :goto_12

    .line 678
    :cond_14
    const/4 v7, 0x0

    .line 679
    :goto_12
    invoke-static {v7}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 680
    .line 681
    .line 682
    move-result-object v7

    .line 683
    :goto_13
    new-instance v13, Lhh/d;

    .line 684
    .line 685
    invoke-direct {v13, v7, v3}, Lhh/d;-><init>(Ljava/lang/Object;I)V

    .line 686
    .line 687
    .line 688
    invoke-direct {v5, v0, v8, v13}, Lhh/b;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/String;Lhh/d;)V

    .line 689
    .line 690
    .line 691
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 692
    .line 693
    .line 694
    add-int/lit8 v12, v12, 0x1

    .line 695
    .line 696
    const/4 v3, 0x6

    .line 697
    const/4 v7, 0x0

    .line 698
    const/4 v8, 0x1

    .line 699
    goto/16 :goto_4

    .line 700
    .line 701
    :cond_15
    new-instance v1, Lhh/a;

    .line 702
    .line 703
    invoke-direct {v1, v0, v4, v9, v6}, Lhh/a;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/String;ILjava/util/ArrayList;)V

    .line 704
    .line 705
    .line 706
    return-object v1

    .line 707
    :cond_16
    const-string v0, "Unknown AnnotationVisibilityType: "

    .line 708
    .line 709
    invoke-static {v6, v0}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 710
    .line 711
    .line 712
    move-result-object v0

    .line 713
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 714
    .line 715
    .line 716
    goto/16 :goto_9

    .line 717
    .line 718
    nop

    .line 719
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static final t(Landroid/view/View;)Lu3/c;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :goto_0
    const/4 v0, 0x0

    .line 5
    if-eqz p0, :cond_3

    .line 6
    .line 7
    const v1, 0x7f060080

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    instance-of v2, v1, Lu3/c;

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    check-cast v1, Lu3/c;

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    move-object v1, v0

    .line 22
    :goto_1
    if-eqz v1, :cond_1

    .line 23
    .line 24
    return-object v1

    .line 25
    :cond_1
    invoke-static {p0}, Lfb/v0;->t(Landroid/view/View;)Landroid/view/ViewParent;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    instance-of v1, p0, Landroid/view/View;

    .line 30
    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    check-cast p0, Landroid/view/View;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    move-object p0, v0

    .line 37
    goto :goto_0

    .line 38
    :cond_3
    return-object v0
.end method

.method public static u(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    const-string v0, "[]"

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-static {p1, v0, v1}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    add-int/lit8 v0, v0, -0x2

    .line 21
    .line 22
    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-static {p0, p1}, Lac/p;->u(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-static {p0, v1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 44
    .line 45
    sparse-switch v0, :sswitch_data_0

    .line 46
    .line 47
    .line 48
    goto/16 :goto_0

    .line 49
    .line 50
    :sswitch_0
    const-string v0, "short"

    .line 51
    .line 52
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-nez v0, :cond_1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    sget-object v1, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 60
    .line 61
    goto/16 :goto_1

    .line 62
    .line 63
    :sswitch_1
    const-string v0, "float"

    .line 64
    .line 65
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-nez v0, :cond_2

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_2
    sget-object v1, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :sswitch_2
    const-string v0, "boolean"

    .line 76
    .line 77
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-nez v0, :cond_8

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :sswitch_3
    const-string v0, "void"

    .line 85
    .line 86
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-nez v0, :cond_3

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_3
    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :sswitch_4
    const-string v0, "long"

    .line 97
    .line 98
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-nez v0, :cond_4

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_4
    sget-object v1, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :sswitch_5
    const-string v0, "char"

    .line 109
    .line 110
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    if-nez v0, :cond_5

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_5
    sget-object v1, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :sswitch_6
    const-string v0, "byte"

    .line 121
    .line 122
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    if-nez v0, :cond_6

    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_6
    sget-object v1, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :sswitch_7
    const-string v0, "int"

    .line 133
    .line 134
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    if-nez v0, :cond_8

    .line 139
    .line 140
    goto :goto_0

    .line 141
    :sswitch_8
    const-string v0, "double"

    .line 142
    .line 143
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    if-nez v0, :cond_7

    .line 148
    .line 149
    :goto_0
    invoke-virtual {p0, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    goto :goto_1

    .line 154
    :cond_7
    sget-object v1, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 155
    .line 156
    :cond_8
    :goto_1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    return-object v1

    .line 160
    nop

    .line 161
    :sswitch_data_0
    .sparse-switch
        -0x4f08842f -> :sswitch_8
        0x197ef -> :sswitch_7
        0x2e6108 -> :sswitch_6
        0x2e9356 -> :sswitch_5
        0x32c67c -> :sswitch_4
        0x375194 -> :sswitch_3
        0x3db6c28 -> :sswitch_2
        0x5d0225c -> :sswitch_1
        0x685847c -> :sswitch_0
    .end sparse-switch
.end method

.method public static v()Ljava/util/Set;
    .locals 3

    .line 1
    :try_start_0
    const-string v0, "android.text.EmojiConsistency"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "getEmojiConsistencySet"

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0, v2, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 21
    .line 22
    return-object v0

    .line 23
    :cond_0
    check-cast v0, Ljava/util/Set;

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    instance-of v2, v2, [I

    .line 40
    .line 41
    if-nez v2, :cond_1

    .line 42
    .line 43
    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    :cond_2
    return-object v0

    .line 46
    :catchall_0
    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 47
    .line 48
    return-object v0
.end method

.method public static w()Ljava/util/concurrent/Executor;
    .locals 2

    .line 1
    sget-object v0, Lac/p;->a:Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const-class v0, Lac/p;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lac/p;->a:Ljava/util/concurrent/ExecutorService;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    sput-object v1, Lac/p;->a:Ljava/util/concurrent/ExecutorService;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception v1

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    :goto_0
    monitor-exit v0

    .line 22
    goto :goto_2

    .line 23
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    throw v1

    .line 25
    :cond_1
    :goto_2
    sget-object v0, Lac/p;->a:Ljava/util/concurrent/ExecutorService;

    .line 26
    .line 27
    return-object v0
.end method

.method public static x(Ljava/lang/Class;Ljava/lang/reflect/Method;)Z
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v1, v0

    .line 6
    const/4 v2, 0x2

    .line 7
    const/4 v3, 0x0

    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    aget-object v1, v0, v3

    .line 11
    .line 12
    invoke-static {v1, p0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    const/4 p0, 0x1

    .line 19
    aget-object v0, v0, p0

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Class;->isPrimitive()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0}, Ljava/lang/Class;->isPrimitive()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-nez v0, :cond_0

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 42
    .line 43
    invoke-static {p1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-nez p1, :cond_0

    .line 48
    .line 49
    return p0

    .line 50
    :cond_0
    return v3
.end method

.method public static y(Ljava/lang/reflect/Method;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    sget-object v2, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 10
    .line 11
    invoke-static {v1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x0

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const-string v3, "onMMMenuItemSelected"

    .line 23
    .line 24
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    array-length v1, v0

    .line 31
    const/4 v3, 0x2

    .line 32
    if-ne v1, v3, :cond_0

    .line 33
    .line 34
    const-class v1, Landroid/view/MenuItem;

    .line 35
    .line 36
    aget-object v0, v0, v2

    .line 37
    .line 38
    invoke-virtual {v1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_0

    .line 43
    .line 44
    const-string v0, "com.tencent.mm.ui.chatting.component."

    .line 45
    .line 46
    invoke-static {p0, v2, v0}, Leh/a;->A(Ljava/lang/reflect/Method;ZLjava/lang/String;)Z

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    if-eqz p0, :cond_0

    .line 51
    .line 52
    const/4 p0, 0x1

    .line 53
    return p0

    .line 54
    :cond_0
    return v2
.end method

.method public static z(Ljava/lang/reflect/Method;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 6
    .line 7
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v2, "onCreateMMMenu"

    .line 19
    .line 20
    invoke-static {v0, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    array-length v0, v0

    .line 31
    const/4 v2, 0x1

    .line 32
    if-ne v0, v2, :cond_0

    .line 33
    .line 34
    const-string v0, "com.tencent.mm.ui.chatting.component."

    .line 35
    .line 36
    invoke-static {p0, v1, v0}, Leh/a;->A(Ljava/lang/reflect/Method;ZLjava/lang/String;)Z

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    if-eqz p0, :cond_0

    .line 41
    .line 42
    return v2

    .line 43
    :cond_0
    return v1
.end method
