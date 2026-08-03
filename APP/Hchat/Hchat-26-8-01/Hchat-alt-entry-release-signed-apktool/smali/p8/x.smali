.class public final Lp8/x;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/lang/ClassLoader;

.field public final c:Lorg/luckypray/dexkit/DexKitBridge;

.field public final d:Lp8/p;

.field public final e:Landroid/content/SharedPreferences;

.field public volatile f:Ljava/lang/reflect/Method;

.field public volatile g:Ljava/lang/reflect/Method;

.field public volatile h:Ljava/lang/Object;

.field public volatile i:Ljava/lang/reflect/Constructor;


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
    iput-object p1, p0, Lp8/x;->a:Landroid/content/Context;

    .line 8
    .line 9
    iput-object p2, p0, Lp8/x;->b:Ljava/lang/ClassLoader;

    .line 10
    .line 11
    iput-object p3, p0, Lp8/x;->c:Lorg/luckypray/dexkit/DexKitBridge;

    .line 12
    .line 13
    iput-object p4, p0, Lp8/x;->d:Lp8/p;

    .line 14
    .line 15
    const-string p2, "Hchat_sns_interaction_method_cache"

    .line 16
    .line 17
    invoke-static {p1, p2}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, Lp8/x;->e:Landroid/content/SharedPreferences;

    .line 22
    .line 23
    sget-object p1, Ltf/t;->g:Ltf/t;

    .line 24
    .line 25
    iput-object p1, p0, Lp8/x;->h:Ljava/lang/Object;

    .line 26
    .line 27
    return-void
.end method

.method public static a(Ljava/util/List;)Z
    .locals 2

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_4

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Ljava/lang/reflect/Method;

    .line 25
    .line 26
    invoke-static {v1}, Lp8/x;->b(Ljava/lang/reflect/Method;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    :cond_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_4

    .line 48
    .line 49
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    check-cast v0, Ljava/lang/reflect/Method;

    .line 54
    .line 55
    invoke-static {v0}, Lp8/x;->c(Ljava/lang/reflect/Method;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_3

    .line 60
    .line 61
    const/4 p0, 0x1

    .line 62
    return p0

    .line 63
    :cond_4
    :goto_0
    const/4 p0, 0x0

    .line 64
    return p0
.end method

.method public static b(Ljava/lang/reflect/Method;)Z
    .locals 6

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
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 21
    .line 22
    invoke-static {p0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    if-nez p0, :cond_0

    .line 27
    .line 28
    array-length p0, v0

    .line 29
    const/4 v1, 0x7

    .line 30
    if-ne p0, v1, :cond_0

    .line 31
    .line 32
    aget-object p0, v0, v2

    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    const-string v1, "com.tencent.mm.plugin.sns.storage.SnsInfo"

    .line 39
    .line 40
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    if-eqz p0, :cond_0

    .line 45
    .line 46
    const/4 p0, 0x1

    .line 47
    aget-object v1, v0, p0

    .line 48
    .line 49
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 50
    .line 51
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-eqz v1, :cond_0

    .line 56
    .line 57
    const/4 v1, 0x2

    .line 58
    aget-object v1, v0, v1

    .line 59
    .line 60
    const-class v4, Ljava/lang/String;

    .line 61
    .line 62
    invoke-static {v1, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-eqz v1, :cond_0

    .line 67
    .line 68
    const/4 v1, 0x3

    .line 69
    aget-object v1, v0, v1

    .line 70
    .line 71
    sget-object v5, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 72
    .line 73
    invoke-static {v1, v5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-eqz v1, :cond_0

    .line 78
    .line 79
    const/4 v1, 0x4

    .line 80
    aget-object v1, v0, v1

    .line 81
    .line 82
    invoke-static {v1, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    if-eqz v1, :cond_0

    .line 87
    .line 88
    const/4 v1, 0x5

    .line 89
    aget-object v1, v0, v1

    .line 90
    .line 91
    sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 92
    .line 93
    invoke-static {v1, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    if-eqz v1, :cond_0

    .line 98
    .line 99
    const/4 v1, 0x6

    .line 100
    aget-object v0, v0, v1

    .line 101
    .line 102
    invoke-static {v0, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    if-eqz v0, :cond_0

    .line 107
    .line 108
    return p0

    .line 109
    :cond_0
    return v2
.end method

.method public static c(Ljava/lang/reflect/Method;)Z
    .locals 7

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
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz v1, :cond_2

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    sget-object v3, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 21
    .line 22
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-nez v1, :cond_2

    .line 27
    .line 28
    array-length v1, v0

    .line 29
    const/4 v3, 0x7

    .line 30
    if-eq v1, v3, :cond_0

    .line 31
    .line 32
    array-length v1, v0

    .line 33
    const/16 v4, 0x8

    .line 34
    .line 35
    if-ne v1, v4, :cond_2

    .line 36
    .line 37
    :cond_0
    aget-object v1, v0, v2

    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    const-string v4, "com.tencent.mm.plugin.sns.storage.SnsInfo"

    .line 44
    .line 45
    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_2

    .line 50
    .line 51
    const/4 v1, 0x1

    .line 52
    aget-object v4, v0, v1

    .line 53
    .line 54
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 55
    .line 56
    invoke-static {v4, v5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    if-eqz v4, :cond_2

    .line 61
    .line 62
    const/4 v4, 0x2

    .line 63
    aget-object v4, v0, v4

    .line 64
    .line 65
    invoke-virtual {v4}, Ljava/lang/Class;->isPrimitive()Z

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    if-nez v4, :cond_2

    .line 70
    .line 71
    const/4 v4, 0x3

    .line 72
    aget-object v6, v0, v4

    .line 73
    .line 74
    invoke-virtual {v6}, Ljava/lang/Class;->isPrimitive()Z

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    if-nez v6, :cond_2

    .line 79
    .line 80
    aget-object v4, v0, v4

    .line 81
    .line 82
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    invoke-static {v4, p0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    if-eqz p0, :cond_2

    .line 91
    .line 92
    const/4 p0, 0x4

    .line 93
    aget-object p0, v0, p0

    .line 94
    .line 95
    sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 96
    .line 97
    invoke-static {p0, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result p0

    .line 101
    if-eqz p0, :cond_2

    .line 102
    .line 103
    const/4 p0, 0x5

    .line 104
    aget-object p0, v0, p0

    .line 105
    .line 106
    invoke-static {p0, v5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result p0

    .line 110
    if-eqz p0, :cond_2

    .line 111
    .line 112
    const/4 p0, 0x6

    .line 113
    aget-object p0, v0, p0

    .line 114
    .line 115
    invoke-static {p0, v5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result p0

    .line 119
    if-eqz p0, :cond_2

    .line 120
    .line 121
    array-length p0, v0

    .line 122
    if-eq p0, v3, :cond_1

    .line 123
    .line 124
    aget-object p0, v0, v3

    .line 125
    .line 126
    const-class v0, Ljava/lang/String;

    .line 127
    .line 128
    invoke-static {p0, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result p0

    .line 132
    if-eqz p0, :cond_2

    .line 133
    .line 134
    :cond_1
    return v1

    .line 135
    :cond_2
    return v2
.end method

.method public static d(Ljava/lang/reflect/Method;)Z
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
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 21
    .line 22
    invoke-static {p0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    if-nez p0, :cond_0

    .line 27
    .line 28
    array-length p0, v0

    .line 29
    const/4 v1, 0x4

    .line 30
    if-ne p0, v1, :cond_0

    .line 31
    .line 32
    aget-object p0, v0, v2

    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    const-string v1, "com.tencent.mm.plugin.sns.storage.SnsInfo"

    .line 39
    .line 40
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    if-eqz p0, :cond_0

    .line 45
    .line 46
    const/4 p0, 0x1

    .line 47
    aget-object v1, v0, p0

    .line 48
    .line 49
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 50
    .line 51
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-eqz v1, :cond_0

    .line 56
    .line 57
    const/4 v1, 0x2

    .line 58
    aget-object v1, v0, v1

    .line 59
    .line 60
    invoke-virtual {v1}, Ljava/lang/Class;->isPrimitive()Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-nez v1, :cond_0

    .line 65
    .line 66
    const/4 v1, 0x3

    .line 67
    aget-object v0, v0, v1

    .line 68
    .line 69
    invoke-static {v0, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-eqz v0, :cond_0

    .line 74
    .line 75
    return p0

    .line 76
    :cond_0
    return v2
.end method

.method public static e(Ljava/lang/reflect/Constructor;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    array-length v0, p0

    .line 6
    const/4 v1, 0x3

    .line 7
    const/4 v2, 0x0

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    aget-object v0, p0, v2

    .line 11
    .line 12
    sget-object v1, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 13
    .line 14
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    aget-object v3, p0, v0

    .line 22
    .line 23
    invoke-static {v3, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    const/4 v1, 0x2

    .line 30
    aget-object p0, p0, v1

    .line 31
    .line 32
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 33
    .line 34
    invoke-static {p0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    if-eqz p0, :cond_0

    .line 39
    .line 40
    return v0

    .line 41
    :cond_0
    return v2
.end method


# virtual methods
.method public final declared-synchronized f()Ljava/lang/reflect/Method;
    .locals 7

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lp8/x;->g:Ljava/lang/reflect/Method;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-static {v0}, Lp8/x;->b(Ljava/lang/reflect/Method;)Z

    .line 8
    .line 9
    .line 10
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object v0, v1

    .line 15
    :goto_0
    if-eqz v0, :cond_1

    .line 16
    .line 17
    monitor-exit p0

    .line 18
    return-object v0

    .line 19
    :catchall_0
    move-exception v0

    .line 20
    goto/16 :goto_6

    .line 21
    .line 22
    :cond_1
    :try_start_1
    iget-object v0, p0, Lp8/x;->a:Landroid/content/Context;

    .line 23
    .line 24
    iget-object v2, p0, Lp8/x;->b:Ljava/lang/ClassLoader;

    .line 25
    .line 26
    invoke-static {v0, v2}, Le8/b;->g(Landroid/content/Context;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-object v2, p0, Lp8/x;->e:Landroid/content/SharedPreferences;

    .line 31
    .line 32
    iget-object v3, p0, Lp8/x;->b:Ljava/lang/ClassLoader;

    .line 33
    .line 34
    const-string v4, "native_comment_v1"

    .line 35
    .line 36
    invoke-static {v2, v0, v3, v4}, Le8/b;->c(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    if-eqz v2, :cond_3

    .line 41
    .line 42
    invoke-static {v2}, Lp8/x;->b(Ljava/lang/reflect/Method;)Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-eqz v3, :cond_2

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    move-object v2, v1

    .line 50
    :goto_1
    if-eqz v2, :cond_3

    .line 51
    .line 52
    iput-object v2, p0, Lp8/x;->g:Ljava/lang/reflect/Method;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 53
    .line 54
    monitor-exit p0

    .line 55
    return-object v2

    .line 56
    :cond_3
    :try_start_2
    iget-object v2, p0, Lp8/x;->c:Lorg/luckypray/dexkit/DexKitBridge;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 57
    .line 58
    if-eqz v2, :cond_9

    .line 59
    .line 60
    :try_start_3
    new-instance v3, Lch/c;

    .line 61
    .line 62
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 63
    .line 64
    .line 65
    new-instance v4, Lfh/a;

    .line 66
    .line 67
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 68
    .line 69
    .line 70
    const-string v5, "MicroMsg.SnsService"

    .line 71
    .line 72
    const-string v6, "can not add Comment"

    .line 73
    .line 74
    filled-new-array {v5, v6}, [Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    invoke-virtual {v4, v5}, Lfh/a;->p0([Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    iput-object v4, v3, Lch/c;->h:Lfh/a;

    .line 82
    .line 83
    invoke-virtual {v2, v3}, Lorg/luckypray/dexkit/DexKitBridge;->findClass(Lch/c;)Lhh/j;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    invoke-static {v2}, Ltf/m;->m1(Ljava/lang/Iterable;)Ldg/n;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    new-instance v3, Lp8/w;

    .line 92
    .line 93
    const/4 v4, 0x1

    .line 94
    invoke-direct {v3, p0, v4}, Lp8/w;-><init>(Lp8/x;I)V

    .line 95
    .line 96
    .line 97
    invoke-static {v2, v3}, Lng/m;->X(Lng/j;Lfg/l;)Lng/i;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    new-instance v3, Lo9/e;

    .line 102
    .line 103
    const/16 v4, 0xe

    .line 104
    .line 105
    invoke-direct {v3, v4}, Lo9/e;-><init>(I)V

    .line 106
    .line 107
    .line 108
    new-instance v4, Ldg/j;

    .line 109
    .line 110
    sget-object v5, Lng/q;->n:Lng/q;

    .line 111
    .line 112
    invoke-direct {v4, v2, v3, v5}, Ldg/j;-><init>(Lng/j;Lfg/l;Lfg/l;)V

    .line 113
    .line 114
    .line 115
    new-instance v2, Lng/h;

    .line 116
    .line 117
    invoke-direct {v2, v4}, Lng/h;-><init>(Ldg/j;)V

    .line 118
    .line 119
    .line 120
    :cond_4
    invoke-virtual {v2}, Lng/h;->hasNext()Z

    .line 121
    .line 122
    .line 123
    move-result v3

    .line 124
    if-eqz v3, :cond_5

    .line 125
    .line 126
    invoke-virtual {v2}, Lng/h;->next()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    move-object v4, v3

    .line 131
    check-cast v4, Ljava/lang/reflect/Method;

    .line 132
    .line 133
    invoke-static {v4}, Lp8/x;->b(Ljava/lang/reflect/Method;)Z

    .line 134
    .line 135
    .line 136
    move-result v4

    .line 137
    if-eqz v4, :cond_4

    .line 138
    .line 139
    goto :goto_2

    .line 140
    :catchall_1
    move-exception v0

    .line 141
    goto :goto_3

    .line 142
    :cond_5
    move-object v3, v1

    .line 143
    :goto_2
    check-cast v3, Ljava/lang/reflect/Method;

    .line 144
    .line 145
    if-eqz v3, :cond_6

    .line 146
    .line 147
    iput-object v3, p0, Lp8/x;->g:Ljava/lang/reflect/Method;

    .line 148
    .line 149
    iget-object v2, p0, Lp8/x;->e:Landroid/content/SharedPreferences;

    .line 150
    .line 151
    const-string v4, "native_comment_v1"

    .line 152
    .line 153
    invoke-static {v2, v0, v4, v3}, Le8/b;->h(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 154
    .line 155
    .line 156
    goto :goto_4

    .line 157
    :cond_6
    move-object v3, v1

    .line 158
    goto :goto_4

    .line 159
    :goto_3
    :try_start_4
    new-instance v3, Lsf/f;

    .line 160
    .line 161
    invoke-direct {v3, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 162
    .line 163
    .line 164
    :goto_4
    invoke-static {v3}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    if-eqz v0, :cond_7

    .line 169
    .line 170
    iget-object v2, p0, Lp8/x;->d:Lp8/p;

    .line 171
    .line 172
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    new-instance v4, Ljava/lang/StringBuilder;

    .line 177
    .line 178
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 179
    .line 180
    .line 181
    const-string v5, "\u5b9a\u4f4d\u670b\u53cb\u5708\u539f\u751f\u8bc4\u8bba\u65b9\u6cd5\u5931\u8d25: "

    .line 182
    .line 183
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    invoke-virtual {v2, v0}, Lp8/p;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    :cond_7
    instance-of v0, v3, Lsf/f;

    .line 197
    .line 198
    if-eqz v0, :cond_8

    .line 199
    .line 200
    goto :goto_5

    .line 201
    :cond_8
    move-object v1, v3

    .line 202
    :goto_5
    check-cast v1, Ljava/lang/reflect/Method;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 203
    .line 204
    monitor-exit p0

    .line 205
    return-object v1

    .line 206
    :cond_9
    monitor-exit p0

    .line 207
    return-object v1

    .line 208
    :goto_6
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 209
    throw v0
.end method

.method public final declared-synchronized g()Ljava/lang/reflect/Method;
    .locals 7

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lp8/x;->f:Ljava/lang/reflect/Method;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-static {v0}, Lp8/x;->d(Ljava/lang/reflect/Method;)Z

    .line 8
    .line 9
    .line 10
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object v0, v1

    .line 15
    :goto_0
    if-eqz v0, :cond_1

    .line 16
    .line 17
    monitor-exit p0

    .line 18
    return-object v0

    .line 19
    :catchall_0
    move-exception v0

    .line 20
    goto/16 :goto_6

    .line 21
    .line 22
    :cond_1
    :try_start_1
    iget-object v0, p0, Lp8/x;->a:Landroid/content/Context;

    .line 23
    .line 24
    iget-object v2, p0, Lp8/x;->b:Ljava/lang/ClassLoader;

    .line 25
    .line 26
    invoke-static {v0, v2}, Le8/b;->g(Landroid/content/Context;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-object v2, p0, Lp8/x;->e:Landroid/content/SharedPreferences;

    .line 31
    .line 32
    iget-object v3, p0, Lp8/x;->b:Ljava/lang/ClassLoader;

    .line 33
    .line 34
    const-string v4, "native_like_v1"

    .line 35
    .line 36
    invoke-static {v2, v0, v3, v4}, Le8/b;->c(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    if-eqz v2, :cond_3

    .line 41
    .line 42
    invoke-static {v2}, Lp8/x;->d(Ljava/lang/reflect/Method;)Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-eqz v3, :cond_2

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    move-object v2, v1

    .line 50
    :goto_1
    if-eqz v2, :cond_3

    .line 51
    .line 52
    iput-object v2, p0, Lp8/x;->f:Ljava/lang/reflect/Method;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 53
    .line 54
    monitor-exit p0

    .line 55
    return-object v2

    .line 56
    :cond_3
    :try_start_2
    iget-object v2, p0, Lp8/x;->c:Lorg/luckypray/dexkit/DexKitBridge;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 57
    .line 58
    if-eqz v2, :cond_9

    .line 59
    .line 60
    :try_start_3
    new-instance v3, Lch/c;

    .line 61
    .line 62
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 63
    .line 64
    .line 65
    new-instance v4, Lfh/a;

    .line 66
    .line 67
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 68
    .line 69
    .line 70
    const-string v5, "MicroMsg.SnsService"

    .line 71
    .line 72
    const-string v6, "can not add Comment"

    .line 73
    .line 74
    filled-new-array {v5, v6}, [Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    invoke-virtual {v4, v5}, Lfh/a;->p0([Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    iput-object v4, v3, Lch/c;->h:Lfh/a;

    .line 82
    .line 83
    invoke-virtual {v2, v3}, Lorg/luckypray/dexkit/DexKitBridge;->findClass(Lch/c;)Lhh/j;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    invoke-static {v2}, Ltf/m;->m1(Ljava/lang/Iterable;)Ldg/n;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    new-instance v3, Lp8/w;

    .line 92
    .line 93
    const/4 v4, 0x0

    .line 94
    invoke-direct {v3, p0, v4}, Lp8/w;-><init>(Lp8/x;I)V

    .line 95
    .line 96
    .line 97
    invoke-static {v2, v3}, Lng/m;->X(Lng/j;Lfg/l;)Lng/i;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    new-instance v3, Lo9/e;

    .line 102
    .line 103
    const/16 v4, 0xd

    .line 104
    .line 105
    invoke-direct {v3, v4}, Lo9/e;-><init>(I)V

    .line 106
    .line 107
    .line 108
    new-instance v4, Ldg/j;

    .line 109
    .line 110
    sget-object v5, Lng/q;->n:Lng/q;

    .line 111
    .line 112
    invoke-direct {v4, v2, v3, v5}, Ldg/j;-><init>(Lng/j;Lfg/l;Lfg/l;)V

    .line 113
    .line 114
    .line 115
    new-instance v2, Lng/h;

    .line 116
    .line 117
    invoke-direct {v2, v4}, Lng/h;-><init>(Ldg/j;)V

    .line 118
    .line 119
    .line 120
    :cond_4
    invoke-virtual {v2}, Lng/h;->hasNext()Z

    .line 121
    .line 122
    .line 123
    move-result v3

    .line 124
    if-eqz v3, :cond_5

    .line 125
    .line 126
    invoke-virtual {v2}, Lng/h;->next()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    move-object v4, v3

    .line 131
    check-cast v4, Ljava/lang/reflect/Method;

    .line 132
    .line 133
    invoke-static {v4}, Lp8/x;->d(Ljava/lang/reflect/Method;)Z

    .line 134
    .line 135
    .line 136
    move-result v4

    .line 137
    if-eqz v4, :cond_4

    .line 138
    .line 139
    goto :goto_2

    .line 140
    :catchall_1
    move-exception v0

    .line 141
    goto :goto_3

    .line 142
    :cond_5
    move-object v3, v1

    .line 143
    :goto_2
    check-cast v3, Ljava/lang/reflect/Method;

    .line 144
    .line 145
    if-eqz v3, :cond_6

    .line 146
    .line 147
    iput-object v3, p0, Lp8/x;->f:Ljava/lang/reflect/Method;

    .line 148
    .line 149
    iget-object v2, p0, Lp8/x;->e:Landroid/content/SharedPreferences;

    .line 150
    .line 151
    const-string v4, "native_like_v1"

    .line 152
    .line 153
    invoke-static {v2, v0, v4, v3}, Le8/b;->h(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 154
    .line 155
    .line 156
    goto :goto_4

    .line 157
    :cond_6
    move-object v3, v1

    .line 158
    goto :goto_4

    .line 159
    :goto_3
    :try_start_4
    new-instance v3, Lsf/f;

    .line 160
    .line 161
    invoke-direct {v3, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 162
    .line 163
    .line 164
    :goto_4
    invoke-static {v3}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    if-eqz v0, :cond_7

    .line 169
    .line 170
    iget-object v2, p0, Lp8/x;->d:Lp8/p;

    .line 171
    .line 172
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    new-instance v4, Ljava/lang/StringBuilder;

    .line 177
    .line 178
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 179
    .line 180
    .line 181
    const-string v5, "\u5b9a\u4f4d\u670b\u53cb\u5708\u539f\u751f\u70b9\u8d5e\u65b9\u6cd5\u5931\u8d25: "

    .line 182
    .line 183
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    invoke-virtual {v2, v0}, Lp8/p;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    :cond_7
    instance-of v0, v3, Lsf/f;

    .line 197
    .line 198
    if-eqz v0, :cond_8

    .line 199
    .line 200
    goto :goto_5

    .line 201
    :cond_8
    move-object v1, v3

    .line 202
    :goto_5
    check-cast v1, Ljava/lang/reflect/Method;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 203
    .line 204
    monitor-exit p0

    .line 205
    return-object v1

    .line 206
    :cond_9
    monitor-exit p0

    .line 207
    return-object v1

    .line 208
    :goto_6
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 209
    throw v0
.end method

.method public final declared-synchronized h()Ljava/lang/reflect/Constructor;
    .locals 6

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lp8/x;->i:Ljava/lang/reflect/Constructor;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-static {v0}, Lp8/x;->e(Ljava/lang/reflect/Constructor;)Z

    .line 8
    .line 9
    .line 10
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object v0, v1

    .line 15
    :goto_0
    if-eqz v0, :cond_1

    .line 16
    .line 17
    monitor-exit p0

    .line 18
    return-object v0

    .line 19
    :catchall_0
    move-exception v0

    .line 20
    goto/16 :goto_6

    .line 21
    .line 22
    :cond_1
    :try_start_1
    iget-object v0, p0, Lp8/x;->a:Landroid/content/Context;

    .line 23
    .line 24
    iget-object v2, p0, Lp8/x;->b:Ljava/lang/ClassLoader;

    .line 25
    .line 26
    invoke-static {v0, v2}, Le8/b;->g(Landroid/content/Context;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-object v2, p0, Lp8/x;->e:Landroid/content/SharedPreferences;

    .line 31
    .line 32
    iget-object v3, p0, Lp8/x;->b:Ljava/lang/ClassLoader;

    .line 33
    .line 34
    const-string v4, "timeline_refresh_v1"

    .line 35
    .line 36
    invoke-static {v2, v0, v3, v4}, Le8/b;->d(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Constructor;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    if-eqz v2, :cond_3

    .line 41
    .line 42
    invoke-static {v2}, Lp8/x;->e(Ljava/lang/reflect/Constructor;)Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-eqz v3, :cond_2

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    move-object v2, v1

    .line 50
    :goto_1
    if-eqz v2, :cond_3

    .line 51
    .line 52
    iput-object v2, p0, Lp8/x;->i:Ljava/lang/reflect/Constructor;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 53
    .line 54
    monitor-exit p0

    .line 55
    return-object v2

    .line 56
    :cond_3
    :try_start_2
    iget-object v2, p0, Lp8/x;->c:Lorg/luckypray/dexkit/DexKitBridge;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 57
    .line 58
    if-eqz v2, :cond_9

    .line 59
    .line 60
    :try_start_3
    new-instance v3, Lch/c;

    .line 61
    .line 62
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 63
    .line 64
    .line 65
    new-instance v4, Lfh/a;

    .line 66
    .line 67
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 68
    .line 69
    .line 70
    const-string v5, "MicroMsg.NetSceneSnsTimeLine"

    .line 71
    .line 72
    filled-new-array {v5}, [Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    invoke-virtual {v4, v5}, Lfh/a;->p0([Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    iput-object v4, v3, Lch/c;->h:Lfh/a;

    .line 80
    .line 81
    invoke-virtual {v2, v3}, Lorg/luckypray/dexkit/DexKitBridge;->findClass(Lch/c;)Lhh/j;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    invoke-static {v2}, Ltf/m;->m1(Ljava/lang/Iterable;)Ldg/n;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    new-instance v3, Lp8/w;

    .line 90
    .line 91
    const/4 v4, 0x2

    .line 92
    invoke-direct {v3, p0, v4}, Lp8/w;-><init>(Lp8/x;I)V

    .line 93
    .line 94
    .line 95
    invoke-static {v2, v3}, Lng/m;->X(Lng/j;Lfg/l;)Lng/i;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    new-instance v3, Lo9/e;

    .line 100
    .line 101
    const/16 v4, 0xf

    .line 102
    .line 103
    invoke-direct {v3, v4}, Lo9/e;-><init>(I)V

    .line 104
    .line 105
    .line 106
    new-instance v4, Ldg/j;

    .line 107
    .line 108
    sget-object v5, Lng/q;->n:Lng/q;

    .line 109
    .line 110
    invoke-direct {v4, v2, v3, v5}, Ldg/j;-><init>(Lng/j;Lfg/l;Lfg/l;)V

    .line 111
    .line 112
    .line 113
    new-instance v2, Lng/h;

    .line 114
    .line 115
    invoke-direct {v2, v4}, Lng/h;-><init>(Ldg/j;)V

    .line 116
    .line 117
    .line 118
    :cond_4
    invoke-virtual {v2}, Lng/h;->hasNext()Z

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    if-eqz v3, :cond_5

    .line 123
    .line 124
    invoke-virtual {v2}, Lng/h;->next()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    move-object v4, v3

    .line 129
    check-cast v4, Ljava/lang/reflect/Constructor;

    .line 130
    .line 131
    invoke-static {v4}, Lp8/x;->e(Ljava/lang/reflect/Constructor;)Z

    .line 132
    .line 133
    .line 134
    move-result v4

    .line 135
    if-eqz v4, :cond_4

    .line 136
    .line 137
    goto :goto_2

    .line 138
    :catchall_1
    move-exception v0

    .line 139
    goto :goto_3

    .line 140
    :cond_5
    move-object v3, v1

    .line 141
    :goto_2
    check-cast v3, Ljava/lang/reflect/Constructor;

    .line 142
    .line 143
    if-eqz v3, :cond_6

    .line 144
    .line 145
    iput-object v3, p0, Lp8/x;->i:Ljava/lang/reflect/Constructor;

    .line 146
    .line 147
    iget-object v2, p0, Lp8/x;->e:Landroid/content/SharedPreferences;

    .line 148
    .line 149
    const-string v4, "timeline_refresh_v1"

    .line 150
    .line 151
    invoke-static {v2, v0, v4, v3}, Le8/b;->i(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Constructor;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 152
    .line 153
    .line 154
    goto :goto_4

    .line 155
    :cond_6
    move-object v3, v1

    .line 156
    goto :goto_4

    .line 157
    :goto_3
    :try_start_4
    new-instance v3, Lsf/f;

    .line 158
    .line 159
    invoke-direct {v3, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 160
    .line 161
    .line 162
    :goto_4
    invoke-static {v3}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    if-eqz v0, :cond_7

    .line 167
    .line 168
    iget-object v2, p0, Lp8/x;->d:Lp8/p;

    .line 169
    .line 170
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    new-instance v4, Ljava/lang/StringBuilder;

    .line 175
    .line 176
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 177
    .line 178
    .line 179
    const-string v5, "\u5b9a\u4f4d\u670b\u53cb\u5708\u539f\u751f\u5237\u65b0\u8bf7\u6c42\u5931\u8d25: "

    .line 180
    .line 181
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    invoke-virtual {v2, v0}, Lp8/p;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    :cond_7
    instance-of v0, v3, Lsf/f;

    .line 195
    .line 196
    if-eqz v0, :cond_8

    .line 197
    .line 198
    goto :goto_5

    .line 199
    :cond_8
    move-object v1, v3

    .line 200
    :goto_5
    check-cast v1, Ljava/lang/reflect/Constructor;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 201
    .line 202
    monitor-exit p0

    .line 203
    return-object v1

    .line 204
    :cond_9
    monitor-exit p0

    .line 205
    return-object v1

    .line 206
    :goto_6
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 207
    throw v0
.end method
