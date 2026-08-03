.class public final Ls9/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lr8/g;

.field public final b:Landroid/content/SharedPreferences;

.field public final c:Landroid/content/SharedPreferences;

.field public final d:Ljava/util/concurrent/ConcurrentHashMap;

.field public final e:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

.field public final f:Ljava/util/Map;

.field public volatile g:Z


# direct methods
.method public constructor <init>(Lr8/g;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ls9/b;->a:Lr8/g;

    .line 8
    .line 9
    iget-object p1, p1, Lr8/g;->a:Landroid/content/Context;

    .line 10
    .line 11
    const-string v0, "Hchat_hide_chat_avatar_config"

    .line 12
    .line 13
    invoke-static {p1, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Ls9/b;->b:Landroid/content/SharedPreferences;

    .line 18
    .line 19
    const-string v0, "Hchat_hide_chat_avatar_method_cache"

    .line 20
    .line 21
    invoke-static {p1, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iput-object p1, p0, Ls9/b;->c:Landroid/content/SharedPreferences;

    .line 26
    .line 27
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 28
    .line 29
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, Ls9/b;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 33
    .line 34
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iput-object p1, p0, Ls9/b;->e:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 39
    .line 40
    invoke-static {}, Lp/a;->p()Ljava/util/Map;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    iput-object p1, p0, Ls9/b;->f:Ljava/util/Map;

    .line 45
    .line 46
    return-void
.end method

.method public static d(Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 3

    .line 1
    instance-of v0, p0, Ljava/lang/Boolean;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Ljava/lang/Boolean;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    instance-of v0, p0, Ljava/lang/Number;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    const/4 v2, 0x1

    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    check-cast p0, Ljava/lang/Number;

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    if-ne p0, v2, :cond_1

    .line 21
    .line 22
    move v1, v2

    .line 23
    :cond_1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0

    .line 28
    :cond_2
    instance-of v0, p0, Ljava/lang/String;

    .line 29
    .line 30
    if-eqz v0, :cond_4

    .line 31
    .line 32
    check-cast p0, Ljava/lang/String;

    .line 33
    .line 34
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-static {p0}, Log/t;->f0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    if-eqz p0, :cond_4

    .line 47
    .line 48
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-ne p0, v2, :cond_3

    .line 53
    .line 54
    move v1, v2

    .line 55
    :cond_3
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    :cond_4
    const/4 p0, 0x0

    .line 61
    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/Class;)Ls9/a;
    .locals 11

    .line 1
    iget-object v0, p0, Ls9/b;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Ls9/a;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    return-object v1

    .line 12
    :cond_0
    iget-object v1, p0, Ls9/b;->e:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 13
    .line 14
    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->contains(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, 0x0

    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    return-object v3

    .line 22
    :cond_1
    move-object v2, p1

    .line 23
    move-object v4, v3

    .line 24
    move-object v5, v4

    .line 25
    :goto_0
    if-eqz v2, :cond_7

    .line 26
    .line 27
    const-class v6, Ljava/lang/Object;

    .line 28
    .line 29
    invoke-virtual {v2, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v6

    .line 33
    if-nez v6, :cond_7

    .line 34
    .line 35
    invoke-static {v2}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    :cond_2
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v7

    .line 47
    if-eqz v7, :cond_6

    .line 48
    .line 49
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v7

    .line 53
    check-cast v7, Ljava/lang/reflect/Field;

    .line 54
    .line 55
    if-nez v4, :cond_4

    .line 56
    .line 57
    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v8

    .line 61
    const-string v9, "avatarIV"

    .line 62
    .line 63
    invoke-static {v8, v9}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v8

    .line 67
    if-nez v8, :cond_3

    .line 68
    .line 69
    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    move-result-object v8

    .line 73
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v8

    .line 77
    const-string v9, ".ChattingAvatarImageView"

    .line 78
    .line 79
    const/4 v10, 0x0

    .line 80
    invoke-static {v8, v9, v10}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 81
    .line 82
    .line 83
    move-result v8

    .line 84
    if-eqz v8, :cond_4

    .line 85
    .line 86
    :cond_3
    move-object v4, v7

    .line 87
    goto :goto_1

    .line 88
    :cond_4
    if-nez v5, :cond_2

    .line 89
    .line 90
    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v8

    .line 94
    const-string v9, "avatarMask"

    .line 95
    .line 96
    invoke-static {v8, v9}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v8

    .line 100
    if-nez v8, :cond_5

    .line 101
    .line 102
    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    move-result-object v8

    .line 106
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v8

    .line 110
    const-string v9, "com.tencent.mm.ui.base.MaskLayout"

    .line 111
    .line 112
    invoke-virtual {v8, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v8

    .line 116
    if-eqz v8, :cond_2

    .line 117
    .line 118
    :cond_5
    move-object v5, v7

    .line 119
    goto :goto_1

    .line 120
    :cond_6
    invoke-virtual {v2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    goto :goto_0

    .line 125
    :cond_7
    if-eqz v4, :cond_8

    .line 126
    .line 127
    new-instance v3, Ls9/a;

    .line 128
    .line 129
    invoke-direct {v3, v4, v5}, Ls9/a;-><init>(Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;)V

    .line 130
    .line 131
    .line 132
    :cond_8
    if-nez v3, :cond_9

    .line 133
    .line 134
    invoke-interface {v1, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    return-object v3

    .line 138
    :cond_9
    invoke-virtual {v0, p1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    return-object v3
.end method

.method public final b(Ljava/lang/reflect/Method;)Z
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 10
    .line 11
    invoke-static {p1, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    const/4 v1, 0x0

    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    array-length p1, v0

    .line 19
    const/4 v2, 0x4

    .line 20
    if-ne p1, v2, :cond_1

    .line 21
    .line 22
    const/4 p1, 0x2

    .line 23
    aget-object p1, v0, p1

    .line 24
    .line 25
    const-class v2, Ljava/lang/String;

    .line 26
    .line 27
    invoke-static {p1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    aget-object p1, v0, v1

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, p1}, Ls9/b;->a(Ljava/lang/Class;)Ls9/a;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-eqz p1, :cond_1

    .line 43
    .line 44
    array-length p1, v0

    .line 45
    move v2, v1

    .line 46
    :goto_0
    if-ge v2, p1, :cond_1

    .line 47
    .line 48
    aget-object v3, v0, v2

    .line 49
    .line 50
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    const-string v4, "com.tencent.mm.storage."

    .line 55
    .line 56
    invoke-static {v3, v4, v1}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    if-eqz v3, :cond_0

    .line 61
    .line 62
    const/4 p1, 0x1

    .line 63
    return p1

    .line 64
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_1
    return v1
.end method

.method public final c()Ljava/lang/reflect/Method;
    .locals 10

    .line 1
    iget-object v0, p0, Ls9/b;->a:Lr8/g;

    .line 2
    .line 3
    iget-object v1, v0, Lr8/g;->a:Landroid/content/Context;

    .line 4
    .line 5
    iget-object v2, v0, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {v1, v2}, Lo8/k;->a(Landroid/content/Context;Ljava/lang/ClassLoader;)Ll8/i;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iget-object v1, v1, Ll8/i;->h:Ljava/lang/String;

    .line 15
    .line 16
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    const/4 v4, 0x0

    .line 21
    if-nez v3, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move-object v1, v4

    .line 25
    :goto_0
    if-eqz v1, :cond_1

    .line 26
    .line 27
    const-string v3, "|hide_chat_avatar_v1"

    .line 28
    .line 29
    invoke-virtual {v1, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move-object v1, v4

    .line 35
    :goto_1
    const-string v3, ""

    .line 36
    .line 37
    if-nez v1, :cond_2

    .line 38
    .line 39
    move-object v1, v3

    .line 40
    :cond_2
    iget-object v5, p0, Ls9/b;->c:Landroid/content/SharedPreferences;

    .line 41
    .line 42
    const-string v6, "avatar_bind"

    .line 43
    .line 44
    invoke-static {v5, v1, v2, v6}, Le8/b;->c(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 45
    .line 46
    .line 47
    move-result-object v7

    .line 48
    if-eqz v7, :cond_4

    .line 49
    .line 50
    invoke-virtual {p0, v7}, Ls9/b;->b(Ljava/lang/reflect/Method;)Z

    .line 51
    .line 52
    .line 53
    move-result v8

    .line 54
    if-eqz v8, :cond_3

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_3
    move-object v7, v4

    .line 58
    :goto_2
    if-eqz v7, :cond_4

    .line 59
    .line 60
    return-object v7

    .line 61
    :cond_4
    const-string v7, "MicroMsg.ChattingItem"

    .line 62
    .line 63
    const-string v8, "attachAvatarClickListener: getBizKfWorker:%s"

    .line 64
    .line 65
    filled-new-array {v7, v8}, [Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v7

    .line 69
    :try_start_0
    iget-object v0, v0, Lr8/g;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 70
    .line 71
    new-instance v8, Lch/e;

    .line 72
    .line 73
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 74
    .line 75
    .line 76
    new-instance v9, Lfh/k;

    .line 77
    .line 78
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 79
    .line 80
    .line 81
    invoke-static {v7}, Ltf/l;->L0([Ljava/lang/Object;)Ljava/util/List;

    .line 82
    .line 83
    .line 84
    move-result-object v7

    .line 85
    invoke-static {v9, v7}, Lfh/k;->u0(Lfh/k;Ljava/util/Collection;)V

    .line 86
    .line 87
    .line 88
    iput-object v9, v8, Lch/e;->h:Lfh/k;

    .line 89
    .line 90
    invoke-virtual {v0, v8}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    new-instance v7, Ljava/util/ArrayList;

    .line 95
    .line 96
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    :cond_5
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 104
    .line 105
    .line 106
    move-result v8

    .line 107
    if-eqz v8, :cond_7

    .line 108
    .line 109
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v8

    .line 113
    check-cast v8, Lhh/o;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 114
    .line 115
    :try_start_1
    invoke-virtual {v8, v2}, Lhh/o;->r(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 116
    .line 117
    .line 118
    move-result-object v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 119
    goto :goto_4

    .line 120
    :catchall_0
    move-exception v8

    .line 121
    :try_start_2
    new-instance v9, Lsf/f;

    .line 122
    .line 123
    invoke-direct {v9, v8}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 124
    .line 125
    .line 126
    move-object v8, v9

    .line 127
    :goto_4
    nop

    .line 128
    instance-of v9, v8, Lsf/f;

    .line 129
    .line 130
    if-eqz v9, :cond_6

    .line 131
    .line 132
    move-object v8, v4

    .line 133
    :cond_6
    check-cast v8, Ljava/lang/reflect/Method;

    .line 134
    .line 135
    if-eqz v8, :cond_5

    .line 136
    .line 137
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 138
    .line 139
    .line 140
    goto :goto_3

    .line 141
    :catchall_1
    move-exception v0

    .line 142
    new-instance v7, Lsf/f;

    .line 143
    .line 144
    invoke-direct {v7, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 145
    .line 146
    .line 147
    :cond_7
    invoke-static {v7}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    if-nez v0, :cond_8

    .line 152
    .line 153
    goto :goto_5

    .line 154
    :cond_8
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    const-string v7, "[Hchat:HideChatAvatar] \u5b9a\u4f4d\u804a\u5929\u5934\u50cf\u7ed1\u5b9a\u65b9\u6cd5\u5f02\u5e38: "

    .line 159
    .line 160
    invoke-static {v7, v2, v0}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 161
    .line 162
    .line 163
    sget-object v7, Ltf/t;->g:Ltf/t;

    .line 164
    .line 165
    :goto_5
    check-cast v7, Ljava/util/List;

    .line 166
    .line 167
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    :cond_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 172
    .line 173
    .line 174
    move-result v2

    .line 175
    if-eqz v2, :cond_a

    .line 176
    .line 177
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    move-object v7, v2

    .line 182
    check-cast v7, Ljava/lang/reflect/Method;

    .line 183
    .line 184
    invoke-virtual {p0, v7}, Ls9/b;->b(Ljava/lang/reflect/Method;)Z

    .line 185
    .line 186
    .line 187
    move-result v7

    .line 188
    if-eqz v7, :cond_9

    .line 189
    .line 190
    move-object v4, v2

    .line 191
    :cond_a
    check-cast v4, Ljava/lang/reflect/Method;

    .line 192
    .line 193
    if-eqz v4, :cond_b

    .line 194
    .line 195
    invoke-static {v5, v1, v6, v4}, Le8/b;->h(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 196
    .line 197
    .line 198
    goto :goto_6

    .line 199
    :cond_b
    const-string v0, "cache.key"

    .line 200
    .line 201
    :try_start_3
    invoke-interface {v5}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    invoke-interface {v5, v0, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v3

    .line 209
    invoke-static {v3, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    move-result v3

    .line 213
    if-nez v3, :cond_c

    .line 214
    .line 215
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 216
    .line 217
    .line 218
    move-result-object v3

    .line 219
    invoke-interface {v3, v0, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 220
    .line 221
    .line 222
    :cond_c
    invoke-interface {v2, v6}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 227
    .line 228
    .line 229
    :catchall_2
    :goto_6
    return-object v4
.end method
