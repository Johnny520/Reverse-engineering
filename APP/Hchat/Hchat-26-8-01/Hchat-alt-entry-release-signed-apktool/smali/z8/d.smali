.class public final Lz8/d;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final h:Ljava/util/List;


# instance fields
.field public final a:Lr8/g;

.field public final b:Ly9/b;

.field public final c:Landroid/content/SharedPreferences;

.field public final d:Ljava/lang/ThreadLocal;

.field public final e:Ljava/util/concurrent/ConcurrentHashMap;

.field public final f:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

.field public volatile g:Z


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const-string v0, "isVoiceUsing"

    .line 2
    .line 3
    const-string v1, "checkAppBrandVoiceUsingAndShowToast isVoiceUsing:%b, isCameraUsing:%b"

    .line 4
    .line 5
    const-string v2, "isMultiTalking"

    .line 6
    .line 7
    const-string v3, "isCameraUsing"

    .line 8
    .line 9
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Lz8/d;->h:Ljava/util/List;

    .line 18
    .line 19
    return-void
.end method

.method public constructor <init>(Lr8/g;Ly9/b;)V
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
    iput-object p1, p0, Lz8/d;->a:Lr8/g;

    .line 8
    .line 9
    iput-object p2, p0, Lz8/d;->b:Ly9/b;

    .line 10
    .line 11
    iget-object p1, p1, Lr8/g;->a:Landroid/content/Context;

    .line 12
    .line 13
    const-string p2, "Hchat_call_media_limit_method_cache"

    .line 14
    .line 15
    invoke-static {p1, p2}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, Lz8/d;->c:Landroid/content/SharedPreferences;

    .line 20
    .line 21
    new-instance p1, Ljava/lang/ThreadLocal;

    .line 22
    .line 23
    invoke-direct {p1}, Ljava/lang/ThreadLocal;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, Lz8/d;->d:Ljava/lang/ThreadLocal;

    .line 27
    .line 28
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 29
    .line 30
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, Lz8/d;->e:Ljava/util/concurrent/ConcurrentHashMap;

    .line 34
    .line 35
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iput-object p1, p0, Lz8/d;->f:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 40
    .line 41
    return-void
.end method

.method public static a(Ljava/lang/reflect/Method;)Z
    .locals 2

    .line 1
    invoke-static {p0}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Method;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 12
    .line 13
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-class v1, Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    :cond_0
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    array-length p0, p0

    .line 36
    const/4 v0, 0x3

    .line 37
    if-gt p0, v0, :cond_1

    .line 38
    .line 39
    const/4 p0, 0x1

    .line 40
    return p0

    .line 41
    :cond_1
    const/4 p0, 0x0

    .line 42
    return p0
.end method

.method public static b(Ljava/util/List;)Z
    .locals 3

    .line 1
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x7

    .line 6
    if-ge v0, v1, :cond_0

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-static {p0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, Ljava/lang/reflect/Method;

    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    invoke-static {v0}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-static {v0}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    const/4 v1, 0x1

    .line 55
    if-eq v0, v1, :cond_2

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_3

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_3
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    :cond_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-eqz v0, :cond_5

    .line 74
    .line 75
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    check-cast v0, Ljava/lang/reflect/Method;

    .line 80
    .line 81
    invoke-static {v0}, Lz8/d;->a(Ljava/lang/reflect/Method;)Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-nez v0, :cond_4

    .line 86
    .line 87
    :goto_1
    const/4 p0, 0x0

    .line 88
    return p0

    .line 89
    :cond_5
    :goto_2
    return v1
.end method

.method public static c(Ljava/lang/reflect/Method;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p0}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Method;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    const-string v1, "com.tencent.mm.ui.chatting.viewitems."

    .line 13
    .line 14
    invoke-static {p0, v2, v1}, Leh/a;->A(Ljava/lang/reflect/Method;ZLjava/lang/String;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    array-length v1, v0

    .line 21
    const/4 v3, 0x3

    .line 22
    if-ne v1, v3, :cond_1

    .line 23
    .line 24
    const/4 v1, 0x2

    .line 25
    aget-object v0, v0, v1

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const-string v1, "com.tencent.mm.plugin.msgquote.model.MsgQuoteItem"

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 44
    .line 45
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-nez v0, :cond_0

    .line 50
    .line 51
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 56
    .line 57
    invoke-static {p0, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    if-eqz p0, :cond_1

    .line 62
    .line 63
    :cond_0
    const/4 p0, 0x1

    .line 64
    return p0

    .line 65
    :cond_1
    return v2
.end method


# virtual methods
.method public final d()Ljava/util/List;
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v2, v1, Lz8/d;->a:Lr8/g;

    .line 4
    .line 5
    iget-object v0, v2, Lr8/g;->a:Landroid/content/Context;

    .line 6
    .line 7
    iget-object v3, v2, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 8
    .line 9
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v3}, Lo8/k;->a(Landroid/content/Context;Ljava/lang/ClassLoader;)Ll8/i;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v3, v0, Ll8/i;->h:Ljava/lang/String;

    .line 17
    .line 18
    iget-object v0, v2, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 19
    .line 20
    iget-object v4, v2, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 21
    .line 22
    iget-object v5, v1, Lz8/d;->c:Landroid/content/SharedPreferences;

    .line 23
    .line 24
    const-string v6, "device_occupy_methods_v1"

    .line 25
    .line 26
    invoke-static {v5, v3, v0, v6}, Le8/b;->f(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-static {v0}, Lz8/d;->b(Ljava/util/List;)Z

    .line 31
    .line 32
    .line 33
    move-result v7

    .line 34
    if-eqz v7, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const/4 v0, 0x0

    .line 38
    :goto_0
    if-eqz v0, :cond_1

    .line 39
    .line 40
    return-object v0

    .line 41
    :cond_1
    new-instance v7, Ljava/util/LinkedHashSet;

    .line 42
    .line 43
    invoke-direct {v7}, Ljava/util/LinkedHashSet;-><init>()V

    .line 44
    .line 45
    .line 46
    new-instance v9, Ljava/util/LinkedHashSet;

    .line 47
    .line 48
    invoke-direct {v9}, Ljava/util/LinkedHashSet;-><init>()V

    .line 49
    .line 50
    .line 51
    sget-object v0, Lz8/d;->h:Ljava/util/List;

    .line 52
    .line 53
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object v10

    .line 57
    const/4 v0, 0x0

    .line 58
    move v11, v0

    .line 59
    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    iget-object v12, v1, Lz8/d;->b:Ly9/b;

    .line 64
    .line 65
    sget-object v13, Ltf/t;->g:Ltf/t;

    .line 66
    .line 67
    if-eqz v0, :cond_d

    .line 68
    .line 69
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    add-int/lit8 v14, v11, 0x1

    .line 74
    .line 75
    if-ltz v11, :cond_c

    .line 76
    .line 77
    move-object v15, v0

    .line 78
    check-cast v15, Ljava/lang/String;

    .line 79
    .line 80
    :try_start_0
    iget-object v0, v2, Lr8/g;->d:Lorg/luckypray/dexkit/DexKitBridge;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 81
    .line 82
    const/16 v16, 0x0

    .line 83
    .line 84
    :try_start_1
    new-instance v8, Lch/e;

    .line 85
    .line 86
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 87
    .line 88
    .line 89
    new-instance v1, Lfh/k;

    .line 90
    .line 91
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 92
    .line 93
    .line 94
    move-object/from16 v17, v2

    .line 95
    .line 96
    :try_start_2
    const-string v2, "MicroMsg.DeviceOccupy"

    .line 97
    .line 98
    filled-new-array {v2, v15}, [Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    invoke-virtual {v1, v2}, Lfh/k;->r0([Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    iput-object v1, v8, Lch/e;->h:Lfh/k;

    .line 106
    .line 107
    invoke-virtual {v0, v8}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 108
    .line 109
    .line 110
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 111
    goto :goto_3

    .line 112
    :catchall_0
    move-exception v0

    .line 113
    goto :goto_2

    .line 114
    :catchall_1
    move-exception v0

    .line 115
    move-object/from16 v17, v2

    .line 116
    .line 117
    goto :goto_2

    .line 118
    :catchall_2
    move-exception v0

    .line 119
    move-object/from16 v17, v2

    .line 120
    .line 121
    const/16 v16, 0x0

    .line 122
    .line 123
    :goto_2
    new-instance v1, Lsf/f;

    .line 124
    .line 125
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 126
    .line 127
    .line 128
    move-object v0, v1

    .line 129
    :goto_3
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    if-nez v1, :cond_2

    .line 134
    .line 135
    goto :goto_4

    .line 136
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 137
    .line 138
    const-string v2, "\u5b9a\u4f4d\u901a\u8bdd\u5360\u7528\u65b9\u6cd5\u5931\u8d25: "

    .line 139
    .line 140
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-virtual {v12, v0, v1}, Ly9/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-object v0, v13

    .line 154
    :goto_4
    check-cast v0, Ljava/util/List;

    .line 155
    .line 156
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    :cond_3
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    if-eqz v0, :cond_b

    .line 165
    .line 166
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    move-object v2, v0

    .line 171
    check-cast v2, Lhh/o;

    .line 172
    .line 173
    :try_start_3
    invoke-virtual {v2, v4}, Lhh/o;->r(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 174
    .line 175
    .line 176
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 177
    goto :goto_6

    .line 178
    :catchall_3
    move-exception v0

    .line 179
    new-instance v8, Lsf/f;

    .line 180
    .line 181
    invoke-direct {v8, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 182
    .line 183
    .line 184
    move-object v0, v8

    .line 185
    :goto_6
    nop

    .line 186
    instance-of v8, v0, Lsf/f;

    .line 187
    .line 188
    if-eqz v8, :cond_4

    .line 189
    .line 190
    move-object/from16 v0, v16

    .line 191
    .line 192
    :cond_4
    move-object v8, v0

    .line 193
    check-cast v8, Ljava/lang/reflect/Method;

    .line 194
    .line 195
    if-eqz v8, :cond_3

    .line 196
    .line 197
    invoke-static {v8}, Lz8/d;->a(Ljava/lang/reflect/Method;)Z

    .line 198
    .line 199
    .line 200
    move-result v0

    .line 201
    if-nez v0, :cond_5

    .line 202
    .line 203
    goto :goto_5

    .line 204
    :cond_5
    invoke-virtual {v7, v8}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    if-eqz v11, :cond_6

    .line 208
    .line 209
    goto :goto_5

    .line 210
    :cond_6
    :try_start_4
    invoke-virtual {v2}, Lhh/o;->q()Lhh/p;

    .line 211
    .line 212
    .line 213
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 214
    goto :goto_7

    .line 215
    :catchall_4
    move-exception v0

    .line 216
    new-instance v2, Lsf/f;

    .line 217
    .line 218
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 219
    .line 220
    .line 221
    move-object v0, v2

    .line 222
    :goto_7
    nop

    .line 223
    instance-of v2, v0, Lsf/f;

    .line 224
    .line 225
    if-eqz v2, :cond_7

    .line 226
    .line 227
    move-object v0, v13

    .line 228
    :cond_7
    check-cast v0, Ljava/lang/Iterable;

    .line 229
    .line 230
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 231
    .line 232
    .line 233
    move-result-object v2

    .line 234
    :cond_8
    :goto_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 235
    .line 236
    .line 237
    move-result v0

    .line 238
    if-eqz v0, :cond_3

    .line 239
    .line 240
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    check-cast v0, Lhh/o;

    .line 245
    .line 246
    :try_start_5
    invoke-virtual {v0, v4}, Lhh/o;->r(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 247
    .line 248
    .line 249
    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 250
    goto :goto_9

    .line 251
    :catchall_5
    move-exception v0

    .line 252
    new-instance v12, Lsf/f;

    .line 253
    .line 254
    invoke-direct {v12, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 255
    .line 256
    .line 257
    move-object v0, v12

    .line 258
    :goto_9
    nop

    .line 259
    instance-of v12, v0, Lsf/f;

    .line 260
    .line 261
    if-eqz v12, :cond_9

    .line 262
    .line 263
    move-object/from16 v0, v16

    .line 264
    .line 265
    :cond_9
    check-cast v0, Ljava/lang/reflect/Method;

    .line 266
    .line 267
    if-eqz v0, :cond_8

    .line 268
    .line 269
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 270
    .line 271
    .line 272
    move-result-object v12

    .line 273
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 277
    .line 278
    .line 279
    move-result-object v15

    .line 280
    invoke-static {v15, v12}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    move-result v12

    .line 284
    if-eqz v12, :cond_8

    .line 285
    .line 286
    invoke-static {v0}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Method;)Z

    .line 287
    .line 288
    .line 289
    move-result v12

    .line 290
    if-eqz v12, :cond_8

    .line 291
    .line 292
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 293
    .line 294
    .line 295
    move-result-object v12

    .line 296
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 297
    .line 298
    .line 299
    array-length v12, v12

    .line 300
    if-nez v12, :cond_8

    .line 301
    .line 302
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 303
    .line 304
    .line 305
    move-result-object v12

    .line 306
    sget-object v15, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 307
    .line 308
    invoke-static {v12, v15}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 309
    .line 310
    .line 311
    move-result v12

    .line 312
    if-nez v12, :cond_a

    .line 313
    .line 314
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 315
    .line 316
    .line 317
    move-result-object v12

    .line 318
    const-class v15, Ljava/lang/Boolean;

    .line 319
    .line 320
    invoke-static {v12, v15}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 321
    .line 322
    .line 323
    move-result v12

    .line 324
    if-eqz v12, :cond_8

    .line 325
    .line 326
    :cond_a
    invoke-virtual {v9, v0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    goto :goto_8

    .line 330
    :cond_b
    move-object/from16 v1, p0

    .line 331
    .line 332
    move v11, v14

    .line 333
    move-object/from16 v2, v17

    .line 334
    .line 335
    goto/16 :goto_1

    .line 336
    .line 337
    :cond_c
    const/16 v16, 0x0

    .line 338
    .line 339
    invoke-static {}, La/a;->Q0()V

    .line 340
    .line 341
    .line 342
    throw v16

    .line 343
    :cond_d
    const/16 v16, 0x0

    .line 344
    .line 345
    invoke-virtual {v7, v9}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 346
    .line 347
    .line 348
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 349
    .line 350
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 351
    .line 352
    .line 353
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 354
    .line 355
    .line 356
    move-result-object v1

    .line 357
    :goto_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 358
    .line 359
    .line 360
    move-result v2

    .line 361
    if-eqz v2, :cond_f

    .line 362
    .line 363
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    move-result-object v2

    .line 367
    move-object v4, v2

    .line 368
    check-cast v4, Ljava/lang/reflect/Method;

    .line 369
    .line 370
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 371
    .line 372
    .line 373
    move-result-object v4

    .line 374
    invoke-virtual {v0, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    move-result-object v7

    .line 378
    if-nez v7, :cond_e

    .line 379
    .line 380
    new-instance v7, Ljava/util/ArrayList;

    .line 381
    .line 382
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 383
    .line 384
    .line 385
    invoke-interface {v0, v4, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    :cond_e
    check-cast v7, Ljava/util/List;

    .line 389
    .line 390
    invoke-interface {v7, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 391
    .line 392
    .line 393
    goto :goto_a

    .line 394
    :cond_f
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    check-cast v0, Ljava/lang/Iterable;

    .line 399
    .line 400
    new-instance v1, Ljava/util/ArrayList;

    .line 401
    .line 402
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 403
    .line 404
    .line 405
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 406
    .line 407
    .line 408
    move-result-object v0

    .line 409
    :cond_10
    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 410
    .line 411
    .line 412
    move-result v2

    .line 413
    if-eqz v2, :cond_11

    .line 414
    .line 415
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    move-result-object v2

    .line 419
    move-object v4, v2

    .line 420
    check-cast v4, Ljava/util/List;

    .line 421
    .line 422
    invoke-static {v4}, Lz8/d;->b(Ljava/util/List;)Z

    .line 423
    .line 424
    .line 425
    move-result v4

    .line 426
    if-eqz v4, :cond_10

    .line 427
    .line 428
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 429
    .line 430
    .line 431
    goto :goto_b

    .line 432
    :cond_11
    invoke-static {v1}, Ltf/m;->I1(Ljava/util/List;)Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    move-result-object v0

    .line 436
    check-cast v0, Ljava/util/List;

    .line 437
    .line 438
    if-eqz v0, :cond_13

    .line 439
    .line 440
    new-instance v1, Ljava/util/HashSet;

    .line 441
    .line 442
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 443
    .line 444
    .line 445
    new-instance v2, Ljava/util/ArrayList;

    .line 446
    .line 447
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 448
    .line 449
    .line 450
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 451
    .line 452
    .line 453
    move-result-object v0

    .line 454
    :cond_12
    :goto_c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 455
    .line 456
    .line 457
    move-result v4

    .line 458
    if-eqz v4, :cond_14

    .line 459
    .line 460
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object v4

    .line 464
    move-object v7, v4

    .line 465
    check-cast v7, Ljava/lang/reflect/Method;

    .line 466
    .line 467
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 468
    .line 469
    .line 470
    move-result-object v7

    .line 471
    invoke-virtual {v1, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 472
    .line 473
    .line 474
    move-result v7

    .line 475
    if-eqz v7, :cond_12

    .line 476
    .line 477
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 478
    .line 479
    .line 480
    goto :goto_c

    .line 481
    :cond_13
    move-object/from16 v2, v16

    .line 482
    .line 483
    :cond_14
    if-nez v2, :cond_15

    .line 484
    .line 485
    goto :goto_d

    .line 486
    :cond_15
    move-object v13, v2

    .line 487
    :goto_d
    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    .line 488
    .line 489
    .line 490
    move-result v0

    .line 491
    if-eqz v0, :cond_17

    .line 492
    .line 493
    const-string v0, "cache.key"

    .line 494
    .line 495
    :try_start_6
    invoke-interface {v5}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 496
    .line 497
    .line 498
    move-result-object v1

    .line 499
    const-string v2, ""

    .line 500
    .line 501
    invoke-interface {v5, v0, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 502
    .line 503
    .line 504
    move-result-object v2

    .line 505
    invoke-static {v2, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 506
    .line 507
    .line 508
    move-result v2

    .line 509
    if-nez v2, :cond_16

    .line 510
    .line 511
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 512
    .line 513
    .line 514
    move-result-object v2

    .line 515
    invoke-interface {v2, v0, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 516
    .line 517
    .line 518
    :cond_16
    invoke-interface {v1, v6}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 519
    .line 520
    .line 521
    move-result-object v0

    .line 522
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 523
    .line 524
    .line 525
    :catchall_6
    const-string v0, "\u901a\u8bdd\u5360\u7528\u65b9\u6cd5\u7ec4\u4e0d\u5b8c\u6574\u6216\u5019\u9009\u4e0d\u552f\u4e00"

    .line 526
    .line 527
    move-object/from16 v1, v16

    .line 528
    .line 529
    invoke-virtual {v12, v0, v1}, Ly9/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 530
    .line 531
    .line 532
    goto :goto_e

    .line 533
    :cond_17
    sget-object v0, Le8/b;->a:Le8/b;

    .line 534
    .line 535
    invoke-virtual {v0, v5, v3, v6, v13}, Le8/b;->j(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 536
    .line 537
    .line 538
    :goto_e
    return-object v13
.end method

.method public final e()Ljava/lang/reflect/Method;
    .locals 13

    .line 1
    sget-object v0, Ltf/t;->g:Ltf/t;

    .line 2
    .line 3
    iget-object v1, p0, Lz8/d;->a:Lr8/g;

    .line 4
    .line 5
    iget-object v2, v1, Lr8/g;->a:Landroid/content/Context;

    .line 6
    .line 7
    iget-object v3, v1, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 8
    .line 9
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-static {v2, v3}, Lo8/k;->a(Landroid/content/Context;Ljava/lang/ClassLoader;)Ll8/i;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    iget-object v2, v2, Ll8/i;->h:Ljava/lang/String;

    .line 17
    .line 18
    iget-object v3, v1, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 19
    .line 20
    iget-object v4, p0, Lz8/d;->c:Landroid/content/SharedPreferences;

    .line 21
    .line 22
    const-string v5, "voice_playback_guard_v1"

    .line 23
    .line 24
    invoke-static {v4, v2, v3, v5}, Le8/b;->c(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    const/4 v6, 0x0

    .line 29
    if-eqz v3, :cond_1

    .line 30
    .line 31
    invoke-static {v3}, Lz8/d;->c(Ljava/lang/reflect/Method;)Z

    .line 32
    .line 33
    .line 34
    move-result v7

    .line 35
    if-eqz v7, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move-object v3, v6

    .line 39
    :goto_0
    if-eqz v3, :cond_1

    .line 40
    .line 41
    return-object v3

    .line 42
    :cond_1
    :try_start_0
    iget-object v3, v1, Lr8/g;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 43
    .line 44
    new-instance v7, Lch/e;

    .line 45
    .line 46
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    new-instance v8, Lfh/k;

    .line 50
    .line 51
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 52
    .line 53
    .line 54
    const-string v9, "com.tencent.mm.ui.chatting.viewitems."

    .line 55
    .line 56
    const/4 v10, 0x2

    .line 57
    invoke-virtual {v8, v10, v9}, Lfh/k;->l0(ILjava/lang/String;)V

    .line 58
    .line 59
    .line 60
    new-instance v9, Lfh/k;

    .line 61
    .line 62
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 63
    .line 64
    .line 65
    const-string v10, "com.tencent.mm.autogen.events.VoipCheckIsDeviceUsingEvent"

    .line 66
    .line 67
    const/4 v11, 0x5

    .line 68
    invoke-virtual {v9, v11, v10}, Lfh/k;->l0(ILjava/lang/String;)V

    .line 69
    .line 70
    .line 71
    const-string v10, "<init>"

    .line 72
    .line 73
    new-instance v12, Lgh/c;

    .line 74
    .line 75
    invoke-direct {v12, v10, v11}, Lgh/c;-><init>(Ljava/lang/String;I)V

    .line 76
    .line 77
    .line 78
    iput-object v12, v9, Lfh/k;->g:Lgh/c;

    .line 79
    .line 80
    new-instance v10, Lfh/j;

    .line 81
    .line 82
    const/4 v11, 0x1

    .line 83
    invoke-direct {v10, v11}, Lfh/j;-><init>(I)V

    .line 84
    .line 85
    .line 86
    new-instance v11, Ljava/util/ArrayList;

    .line 87
    .line 88
    invoke-direct {v11, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 89
    .line 90
    .line 91
    iput-object v11, v10, Lfh/j;->h:Ljava/util/List;

    .line 92
    .line 93
    iput-object v10, v9, Lfh/k;->j:Lfh/j;

    .line 94
    .line 95
    iget-object v10, v8, Lfh/k;->m:Lfh/l;

    .line 96
    .line 97
    if-nez v10, :cond_2

    .line 98
    .line 99
    new-instance v10, Lfh/l;

    .line 100
    .line 101
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 102
    .line 103
    .line 104
    :cond_2
    iput-object v10, v8, Lfh/k;->m:Lfh/l;

    .line 105
    .line 106
    invoke-virtual {v10, v9}, Lfh/l;->k0(Lfh/k;)V

    .line 107
    .line 108
    .line 109
    iput-object v8, v7, Lch/e;->h:Lfh/k;

    .line 110
    .line 111
    invoke-virtual {v3, v7}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    new-instance v7, Ljava/util/ArrayList;

    .line 116
    .line 117
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    :cond_3
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 125
    .line 126
    .line 127
    move-result v8

    .line 128
    if-eqz v8, :cond_5

    .line 129
    .line 130
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v8

    .line 134
    check-cast v8, Lhh/o;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 135
    .line 136
    :try_start_1
    iget-object v9, v1, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 137
    .line 138
    invoke-virtual {v8, v9}, Lhh/o;->r(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 139
    .line 140
    .line 141
    move-result-object v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 142
    goto :goto_2

    .line 143
    :catchall_0
    move-exception v8

    .line 144
    :try_start_2
    new-instance v9, Lsf/f;

    .line 145
    .line 146
    invoke-direct {v9, v8}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 147
    .line 148
    .line 149
    move-object v8, v9

    .line 150
    :goto_2
    nop

    .line 151
    instance-of v9, v8, Lsf/f;

    .line 152
    .line 153
    if-eqz v9, :cond_4

    .line 154
    .line 155
    move-object v8, v6

    .line 156
    :cond_4
    check-cast v8, Ljava/lang/reflect/Method;

    .line 157
    .line 158
    if-eqz v8, :cond_3

    .line 159
    .line 160
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    goto :goto_1

    .line 164
    :catchall_1
    move-exception v1

    .line 165
    goto :goto_5

    .line 166
    :cond_5
    new-instance v1, Ljava/util/ArrayList;

    .line 167
    .line 168
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 172
    .line 173
    .line 174
    move-result-object v3

    .line 175
    :cond_6
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 176
    .line 177
    .line 178
    move-result v7

    .line 179
    if-eqz v7, :cond_7

    .line 180
    .line 181
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v7

    .line 185
    move-object v8, v7

    .line 186
    check-cast v8, Ljava/lang/reflect/Method;

    .line 187
    .line 188
    invoke-static {v8}, Lz8/d;->c(Ljava/lang/reflect/Method;)Z

    .line 189
    .line 190
    .line 191
    move-result v8

    .line 192
    if-eqz v8, :cond_6

    .line 193
    .line 194
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    goto :goto_3

    .line 198
    :cond_7
    new-instance v3, Ljava/util/HashSet;

    .line 199
    .line 200
    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 201
    .line 202
    .line 203
    new-instance v7, Ljava/util/ArrayList;

    .line 204
    .line 205
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    :cond_8
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 213
    .line 214
    .line 215
    move-result v8

    .line 216
    if-eqz v8, :cond_9

    .line 217
    .line 218
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v8

    .line 222
    move-object v9, v8

    .line 223
    check-cast v9, Ljava/lang/reflect/Method;

    .line 224
    .line 225
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v9

    .line 229
    invoke-virtual {v3, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    move-result v9

    .line 233
    if-eqz v9, :cond_8

    .line 234
    .line 235
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 236
    .line 237
    .line 238
    goto :goto_4

    .line 239
    :goto_5
    new-instance v7, Lsf/f;

    .line 240
    .line 241
    invoke-direct {v7, v1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 242
    .line 243
    .line 244
    :cond_9
    invoke-static {v7}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 245
    .line 246
    .line 247
    move-result-object v1

    .line 248
    iget-object v3, p0, Lz8/d;->b:Ly9/b;

    .line 249
    .line 250
    if-nez v1, :cond_a

    .line 251
    .line 252
    move-object v0, v7

    .line 253
    goto :goto_6

    .line 254
    :cond_a
    const-string v7, "\u5b9a\u4f4d\u8bed\u97f3\u6d88\u606f\u901a\u8bdd\u68c0\u67e5\u65b9\u6cd5\u5931\u8d25"

    .line 255
    .line 256
    invoke-virtual {v3, v7, v1}, Ly9/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    :goto_6
    check-cast v0, Ljava/util/List;

    .line 260
    .line 261
    invoke-static {v0}, Ltf/m;->I1(Ljava/util/List;)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    check-cast v0, Ljava/lang/reflect/Method;

    .line 266
    .line 267
    if-nez v0, :cond_c

    .line 268
    .line 269
    const-string v1, "cache.key"

    .line 270
    .line 271
    :try_start_3
    invoke-interface {v4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 272
    .line 273
    .line 274
    move-result-object v7

    .line 275
    const-string v8, ""

    .line 276
    .line 277
    invoke-interface {v4, v1, v8}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v4

    .line 281
    invoke-static {v4, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    move-result v4

    .line 285
    if-nez v4, :cond_b

    .line 286
    .line 287
    invoke-interface {v7}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 288
    .line 289
    .line 290
    move-result-object v4

    .line 291
    invoke-interface {v4, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 292
    .line 293
    .line 294
    :cond_b
    invoke-interface {v7, v5}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 295
    .line 296
    .line 297
    move-result-object v1

    .line 298
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 299
    .line 300
    .line 301
    :catchall_2
    const-string v1, "\u8bed\u97f3\u6d88\u606f\u901a\u8bdd\u68c0\u67e5\u65b9\u6cd5\u7f3a\u5931\u6216\u5019\u9009\u4e0d\u552f\u4e00"

    .line 302
    .line 303
    invoke-virtual {v3, v1, v6}, Ly9/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    goto :goto_7

    .line 307
    :cond_c
    invoke-static {v4, v2, v5, v0}, Le8/b;->h(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 308
    .line 309
    .line 310
    :goto_7
    return-object v0
.end method

.method public final f()Lz8/b;
    .locals 12

    .line 1
    iget-object v0, p0, Lz8/d;->a:Lr8/g;

    .line 2
    .line 3
    iget-object v0, v0, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 4
    .line 5
    const-string v1, "com.tencent.mm.autogen.events.VoipCheckIsDeviceUsingEvent"

    .line 6
    .line 7
    invoke-static {v1, v0}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, Lz8/d;->b:Ly9/b;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz v0, :cond_10

    .line 15
    .line 16
    new-instance v3, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    move-object v4, v0

    .line 22
    :goto_0
    if-eqz v4, :cond_3

    .line 23
    .line 24
    const-class v5, Ljava/lang/Object;

    .line 25
    .line 26
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    if-nez v5, :cond_3

    .line 31
    .line 32
    invoke-static {v4}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    new-instance v6, Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    :cond_0
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 46
    .line 47
    .line 48
    move-result v7

    .line 49
    if-eqz v7, :cond_1

    .line 50
    .line 51
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v7

    .line 55
    move-object v8, v7

    .line 56
    check-cast v8, Ljava/lang/reflect/Method;

    .line 57
    .line 58
    invoke-static {v8}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Method;)Z

    .line 59
    .line 60
    .line 61
    move-result v8

    .line 62
    if-nez v8, :cond_0

    .line 63
    .line 64
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_1
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    if-eqz v6, :cond_2

    .line 77
    .line 78
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    check-cast v6, Ljava/lang/reflect/Method;

    .line 83
    .line 84
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_2
    invoke-virtual {v4}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    goto :goto_0

    .line 93
    :cond_3
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    const/4 v4, 0x0

    .line 98
    move-object v6, v2

    .line 99
    move v5, v4

    .line 100
    :cond_4
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 101
    .line 102
    .line 103
    move-result v7

    .line 104
    const/4 v8, 0x1

    .line 105
    if-eqz v7, :cond_7

    .line 106
    .line 107
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v7

    .line 111
    move-object v9, v7

    .line 112
    check-cast v9, Ljava/lang/reflect/Method;

    .line 113
    .line 114
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    move-result-object v10

    .line 118
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    array-length v10, v10

    .line 122
    if-nez v10, :cond_5

    .line 123
    .line 124
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    move-result-object v10

    .line 128
    sget-object v11, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 129
    .line 130
    invoke-static {v10, v11}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v10

    .line 134
    if-eqz v10, :cond_5

    .line 135
    .line 136
    invoke-static {v9}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Method;)Z

    .line 137
    .line 138
    .line 139
    move-result v10

    .line 140
    if-nez v10, :cond_5

    .line 141
    .line 142
    invoke-static {v9}, Lh/Hchat/utils/KavaReflector;->isAbstract(Ljava/lang/reflect/Method;)Z

    .line 143
    .line 144
    .line 145
    move-result v9

    .line 146
    if-nez v9, :cond_5

    .line 147
    .line 148
    move v9, v8

    .line 149
    goto :goto_4

    .line 150
    :cond_5
    move v9, v4

    .line 151
    :goto_4
    if-eqz v9, :cond_4

    .line 152
    .line 153
    if-eqz v5, :cond_6

    .line 154
    .line 155
    :goto_5
    move-object v6, v2

    .line 156
    goto :goto_6

    .line 157
    :cond_6
    move-object v6, v7

    .line 158
    move v5, v8

    .line 159
    goto :goto_3

    .line 160
    :cond_7
    if-nez v5, :cond_8

    .line 161
    .line 162
    goto :goto_5

    .line 163
    :cond_8
    :goto_6
    check-cast v6, Ljava/lang/reflect/Method;

    .line 164
    .line 165
    if-eqz v6, :cond_f

    .line 166
    .line 167
    invoke-static {v0}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    move-object v5, v2

    .line 176
    move v3, v4

    .line 177
    :cond_9
    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 178
    .line 179
    .line 180
    move-result v7

    .line 181
    if-eqz v7, :cond_c

    .line 182
    .line 183
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v7

    .line 187
    move-object v9, v7

    .line 188
    check-cast v9, Ljava/lang/reflect/Field;

    .line 189
    .line 190
    invoke-static {v9}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Field;)Z

    .line 191
    .line 192
    .line 193
    move-result v10

    .line 194
    if-nez v10, :cond_a

    .line 195
    .line 196
    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    move-result-object v9

    .line 200
    invoke-virtual {v9}, Ljava/lang/Class;->isPrimitive()Z

    .line 201
    .line 202
    .line 203
    move-result v9

    .line 204
    if-nez v9, :cond_a

    .line 205
    .line 206
    move v9, v8

    .line 207
    goto :goto_8

    .line 208
    :cond_a
    move v9, v4

    .line 209
    :goto_8
    if-eqz v9, :cond_9

    .line 210
    .line 211
    if-eqz v3, :cond_b

    .line 212
    .line 213
    :goto_9
    move-object v5, v2

    .line 214
    goto :goto_a

    .line 215
    :cond_b
    move-object v5, v7

    .line 216
    move v3, v8

    .line 217
    goto :goto_7

    .line 218
    :cond_c
    if-nez v3, :cond_d

    .line 219
    .line 220
    goto :goto_9

    .line 221
    :cond_d
    :goto_a
    check-cast v5, Ljava/lang/reflect/Field;

    .line 222
    .line 223
    if-eqz v5, :cond_e

    .line 224
    .line 225
    new-instance v0, Lz8/b;

    .line 226
    .line 227
    invoke-direct {v0, v6, v5}, Lz8/b;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;)V

    .line 228
    .line 229
    .line 230
    return-object v0

    .line 231
    :cond_e
    const-string v0, "\u5fae\u4fe1\u901a\u8bdd\u72b6\u6001\u4e8b\u4ef6\u7ed3\u679c\u5b57\u6bb5\u7f3a\u5931\u6216\u5019\u9009\u4e0d\u552f\u4e00"

    .line 232
    .line 233
    invoke-virtual {v1, v0, v2}, Ly9/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    return-object v2

    .line 237
    :cond_f
    const-string v0, "\u5fae\u4fe1\u901a\u8bdd\u72b6\u6001\u4e8b\u4ef6\u6d3e\u53d1\u65b9\u6cd5\u7f3a\u5931\u6216\u5019\u9009\u4e0d\u552f\u4e00"

    .line 238
    .line 239
    invoke-virtual {v1, v0, v2}, Ly9/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    return-object v2

    .line 243
    :cond_10
    const-string v0, "\u5fae\u4fe1\u901a\u8bdd\u72b6\u6001\u4e8b\u4ef6\u7c7b\u7f3a\u5931"

    .line 244
    .line 245
    invoke-virtual {v1, v0, v2}, Ly9/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    return-object v2
.end method
