.class public final Lp8/e0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/lang/ClassLoader;

.field public final c:Lorg/luckypray/dexkit/DexKitBridge;

.field public final d:Lp8/p;

.field public final e:Landroid/content/SharedPreferences;

.field public final f:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final g:Ljava/lang/ThreadLocal;

.field public volatile h:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/ClassLoader;Lorg/luckypray/dexkit/DexKitBridge;Lp8/p;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lp8/e0;->a:Landroid/content/Context;

    .line 8
    .line 9
    iput-object p2, p0, Lp8/e0;->b:Ljava/lang/ClassLoader;

    .line 10
    .line 11
    iput-object p3, p0, Lp8/e0;->c:Lorg/luckypray/dexkit/DexKitBridge;

    .line 12
    .line 13
    iput-object p4, p0, Lp8/e0;->d:Lp8/p;

    .line 14
    .line 15
    const-string p2, "Hchat_sns_post_observer_cache"

    .line 16
    .line 17
    invoke-static {p1, p2}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, Lp8/e0;->e:Landroid/content/SharedPreferences;

    .line 22
    .line 23
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 24
    .line 25
    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lp8/e0;->f:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 29
    .line 30
    new-instance p1, Ljava/lang/ThreadLocal;

    .line 31
    .line 32
    invoke-direct {p1}, Ljava/lang/ThreadLocal;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, Lp8/e0;->g:Ljava/lang/ThreadLocal;

    .line 36
    .line 37
    return-void
.end method

.method public static a(Ljava/lang/reflect/Method;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

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
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 21
    .line 22
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    array-length v1, v0

    .line 29
    const/4 v3, 0x2

    .line 30
    if-ne v1, v3, :cond_0

    .line 31
    .line 32
    aget-object v1, v0, v2

    .line 33
    .line 34
    sget-object v3, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 35
    .line 36
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_0

    .line 41
    .line 42
    const/4 v1, 0x1

    .line 43
    aget-object v0, v0, v1

    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    const-string v3, "com.tencent.mm.plugin.sns.storage.SnsInfo"

    .line 50
    .line 51
    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_0

    .line 56
    .line 57
    const-string v0, "com.tencent.mm.plugin.sns.storage."

    .line 58
    .line 59
    invoke-static {p0, v2, v0}, Leh/a;->A(Ljava/lang/reflect/Method;ZLjava/lang/String;)Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    if-eqz p0, :cond_0

    .line 64
    .line 65
    return v1

    .line 66
    :cond_0
    return v2
.end method


# virtual methods
.method public final b()Ljava/lang/reflect/Method;
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lp8/e0;->c:Lorg/luckypray/dexkit/DexKitBridge;

    .line 3
    .line 4
    if-eqz v1, :cond_a

    .line 5
    .line 6
    :try_start_0
    new-instance v2, Lch/e;

    .line 7
    .line 8
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v3, Lfh/k;

    .line 12
    .line 13
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string v4, "com.tencent.mm.plugin.sns.storage.SnsInfoStorage"

    .line 17
    .line 18
    const-string v5, "replaceUserBySnsId"

    .line 19
    .line 20
    filled-new-array {v4, v5}, [Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    invoke-static {v4}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-static {v3, v4}, Lfh/k;->u0(Lfh/k;Ljava/util/Collection;)V

    .line 29
    .line 30
    .line 31
    iput-object v3, v2, Lch/e;->h:Lfh/k;

    .line 32
    .line 33
    invoke-virtual {v1, v2}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    new-instance v2, Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-eqz v3, :cond_2

    .line 51
    .line 52
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    check-cast v3, Lhh/o;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 57
    .line 58
    :try_start_1
    iget-object v4, p0, Lp8/e0;->b:Ljava/lang/ClassLoader;

    .line 59
    .line 60
    invoke-virtual {v3, v4}, Lhh/o;->r(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 61
    .line 62
    .line 63
    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 64
    goto :goto_1

    .line 65
    :catchall_0
    move-exception v3

    .line 66
    :try_start_2
    new-instance v4, Lsf/f;

    .line 67
    .line 68
    invoke-direct {v4, v3}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 69
    .line 70
    .line 71
    move-object v3, v4

    .line 72
    :goto_1
    nop

    .line 73
    instance-of v4, v3, Lsf/f;

    .line 74
    .line 75
    if-eqz v4, :cond_1

    .line 76
    .line 77
    move-object v3, v0

    .line 78
    :cond_1
    check-cast v3, Ljava/lang/reflect/Method;

    .line 79
    .line 80
    if-eqz v3, :cond_0

    .line 81
    .line 82
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :catchall_1
    move-exception v1

    .line 87
    goto :goto_4

    .line 88
    :cond_2
    new-instance v1, Ljava/util/ArrayList;

    .line 89
    .line 90
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    :cond_3
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 98
    .line 99
    .line 100
    move-result v3

    .line 101
    if-eqz v3, :cond_4

    .line 102
    .line 103
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    move-object v4, v3

    .line 108
    check-cast v4, Ljava/lang/reflect/Method;

    .line 109
    .line 110
    invoke-static {v4}, Lp8/e0;->a(Ljava/lang/reflect/Method;)Z

    .line 111
    .line 112
    .line 113
    move-result v4

    .line 114
    if-eqz v4, :cond_3

    .line 115
    .line 116
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_4
    new-instance v2, Ljava/util/HashSet;

    .line 121
    .line 122
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 123
    .line 124
    .line 125
    new-instance v3, Ljava/util/ArrayList;

    .line 126
    .line 127
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    :cond_5
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 135
    .line 136
    .line 137
    move-result v4

    .line 138
    if-eqz v4, :cond_6

    .line 139
    .line 140
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    move-object v5, v4

    .line 145
    check-cast v5, Ljava/lang/reflect/Method;

    .line 146
    .line 147
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v5

    .line 151
    invoke-virtual {v2, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v5

    .line 155
    if-eqz v5, :cond_5

    .line 156
    .line 157
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 158
    .line 159
    .line 160
    goto :goto_3

    .line 161
    :goto_4
    new-instance v3, Lsf/f;

    .line 162
    .line 163
    invoke-direct {v3, v1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 164
    .line 165
    .line 166
    :cond_6
    invoke-static {v3}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    iget-object v2, p0, Lp8/e0;->d:Lp8/p;

    .line 171
    .line 172
    if-eqz v1, :cond_7

    .line 173
    .line 174
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    new-instance v4, Ljava/lang/StringBuilder;

    .line 179
    .line 180
    const-string v5, "\u5b9a\u4f4d\u670b\u53cb\u5708\u5165\u5e93\u65b9\u6cd5\u5931\u8d25: "

    .line 181
    .line 182
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    invoke-virtual {v2, v1}, Lp8/p;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    :cond_7
    instance-of v1, v3, Lsf/f;

    .line 196
    .line 197
    if-eqz v1, :cond_8

    .line 198
    .line 199
    sget-object v3, Ltf/t;->g:Ltf/t;

    .line 200
    .line 201
    :cond_8
    check-cast v3, Ljava/util/List;

    .line 202
    .line 203
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 204
    .line 205
    .line 206
    move-result v1

    .line 207
    const/4 v4, 0x1

    .line 208
    if-eq v1, v4, :cond_9

    .line 209
    .line 210
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 211
    .line 212
    .line 213
    move-result v1

    .line 214
    new-instance v3, Ljava/lang/StringBuilder;

    .line 215
    .line 216
    const-string v4, "\u670b\u53cb\u5708\u5165\u5e93\u65b9\u6cd5\u6570\u91cf\u5f02\u5e38: "

    .line 217
    .line 218
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    invoke-virtual {v2, v1}, Lp8/p;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    return-object v0

    .line 232
    :cond_9
    invoke-static {v3}, Ltf/m;->H1(Ljava/util/List;)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    check-cast v0, Ljava/lang/reflect/Method;

    .line 237
    .line 238
    :cond_a
    return-object v0
.end method
