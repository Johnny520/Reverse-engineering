.class public final Lz8/g;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final g:Ljava/util/List;

.field public static final h:[Ljava/lang/String;


# instance fields
.field public final a:Lr8/g;

.field public final b:Ly9/b;

.field public final c:Landroid/content/SharedPreferences;

.field public final d:Landroid/content/SharedPreferences;

.field public final e:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

.field public volatile f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    const-string v0, "scene"

    .line 2
    .line 3
    const-string v1, "start"

    .line 4
    .line 5
    const-string v2, "MicroMsg.VoIP.VoIPAudioManager"

    .line 6
    .line 7
    const-string v3, "continuePlayStartRing username:"

    .line 8
    .line 9
    const-string v4, "isOutCall"

    .line 10
    .line 11
    filled-new-array {v2, v3, v4, v0, v1}, [Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v5, "scene"

    .line 16
    .line 17
    const-string v6, "start"

    .line 18
    .line 19
    const-string v1, "startRing() called with: username = "

    .line 20
    .line 21
    const-string v2, "isOutCall"

    .line 22
    .line 23
    const-string v3, "isSpeakOn"

    .line 24
    .line 25
    const-string v4, "seekStartMs"

    .line 26
    .line 27
    filled-new-array/range {v1 .. v6}, [Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    filled-new-array {v0, v1}, [[Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sput-object v0, Lz8/g;->g:Ljava/util/List;

    .line 40
    .line 41
    const-string v0, ", roomType = "

    .line 42
    .line 43
    const-string v1, ", roomRole = "

    .line 44
    .line 45
    const-string v2, "MicroMsg.VoIPMP.CoreV2"

    .line 46
    .line 47
    const-string v3, "startRing() called with: username = "

    .line 48
    .line 49
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    sput-object v0, Lz8/g;->h:[Ljava/lang/String;

    .line 54
    .line 55
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
    iput-object p1, p0, Lz8/g;->a:Lr8/g;

    .line 8
    .line 9
    iput-object p2, p0, Lz8/g;->b:Ly9/b;

    .line 10
    .line 11
    iget-object p1, p1, Lr8/g;->a:Landroid/content/Context;

    .line 12
    .line 13
    const-string p2, "Hchat_call_media_limit_config"

    .line 14
    .line 15
    invoke-static {p1, p2}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    iput-object p2, p0, Lz8/g;->c:Landroid/content/SharedPreferences;

    .line 20
    .line 21
    const-string p2, "Hchat_call_ringtone_block_method_cache"

    .line 22
    .line 23
    invoke-static {p1, p2}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, Lz8/g;->d:Landroid/content/SharedPreferences;

    .line 28
    .line 29
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iput-object p1, p0, Lz8/g;->e:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 34
    .line 35
    return-void
.end method

.method public static a(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {v1, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    const/4 v1, 0x0

    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    array-length p1, v0

    .line 21
    const/4 v2, 0x1

    .line 22
    if-ne p1, v2, :cond_0

    .line 23
    .line 24
    aget-object p1, v0, v1

    .line 25
    .line 26
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 27
    .line 28
    invoke-static {p1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eqz p1, :cond_0

    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 39
    .line 40
    invoke-static {p1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-eqz p1, :cond_0

    .line 45
    .line 46
    invoke-static {p0}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Method;)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-nez p1, :cond_0

    .line 51
    .line 52
    invoke-static {p0}, Lh/Hchat/utils/KavaReflector;->isAbstract(Ljava/lang/reflect/Method;)Z

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    if-nez p0, :cond_0

    .line 57
    .line 58
    return v2

    .line 59
    :cond_0
    return v1
.end method

.method public static b(Ljava/lang/reflect/Method;)Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v1, v0

    .line 6
    const/4 v2, 0x4

    .line 7
    const/4 v3, 0x0

    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    aget-object v1, v0, v3

    .line 11
    .line 12
    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 13
    .line 14
    invoke-static {v1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    aget-object v2, v0, v1

    .line 22
    .line 23
    const-class v4, [B

    .line 24
    .line 25
    invoke-static {v2, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    const/4 v2, 0x2

    .line 32
    aget-object v2, v0, v2

    .line 33
    .line 34
    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 35
    .line 36
    invoke-static {v2, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_0

    .line 41
    .line 42
    const/4 v2, 0x3

    .line 43
    aget-object v0, v0, v2

    .line 44
    .line 45
    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 46
    .line 47
    invoke-static {v0, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_0

    .line 52
    .line 53
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    sget-object v2, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 58
    .line 59
    invoke-static {v0, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-eqz v0, :cond_0

    .line 64
    .line 65
    invoke-static {p0}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Method;)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-nez v0, :cond_0

    .line 70
    .line 71
    invoke-static {p0}, Lh/Hchat/utils/KavaReflector;->isAbstract(Ljava/lang/reflect/Method;)Z

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    if-nez p0, :cond_0

    .line 76
    .line 77
    return v1

    .line 78
    :cond_0
    return v3
.end method

.method public static c(Ljava/lang/reflect/Method;)Z
    .locals 10

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v1, v0

    .line 6
    const/4 v2, 0x2

    .line 7
    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 8
    .line 9
    const-class v4, Ljava/lang/String;

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    const/4 v6, 0x0

    .line 13
    const/4 v7, 0x3

    .line 14
    if-ne v1, v7, :cond_0

    .line 15
    .line 16
    aget-object v1, v0, v6

    .line 17
    .line 18
    invoke-static {v1, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    aget-object v1, v0, v5

    .line 25
    .line 26
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    aget-object v1, v0, v2

    .line 33
    .line 34
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_0

    .line 39
    .line 40
    move v1, v5

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    move v1, v6

    .line 43
    :goto_0
    array-length v8, v0

    .line 44
    const/4 v9, 0x5

    .line 45
    if-ne v8, v9, :cond_1

    .line 46
    .line 47
    aget-object v8, v0, v6

    .line 48
    .line 49
    invoke-static {v8, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    if-eqz v4, :cond_1

    .line 54
    .line 55
    aget-object v4, v0, v5

    .line 56
    .line 57
    invoke-static {v4, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    if-eqz v4, :cond_1

    .line 62
    .line 63
    aget-object v2, v0, v2

    .line 64
    .line 65
    invoke-static {v2, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-eqz v2, :cond_1

    .line 70
    .line 71
    aget-object v2, v0, v7

    .line 72
    .line 73
    sget-object v4, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 74
    .line 75
    invoke-static {v2, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    if-eqz v2, :cond_1

    .line 80
    .line 81
    const/4 v2, 0x4

    .line 82
    aget-object v0, v0, v2

    .line 83
    .line 84
    invoke-static {v0, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-eqz v0, :cond_1

    .line 89
    .line 90
    move v0, v5

    .line 91
    goto :goto_1

    .line 92
    :cond_1
    move v0, v6

    .line 93
    :goto_1
    if-nez v1, :cond_2

    .line 94
    .line 95
    if-eqz v0, :cond_3

    .line 96
    .line 97
    :cond_2
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 102
    .line 103
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-eqz v0, :cond_3

    .line 108
    .line 109
    invoke-static {p0}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Method;)Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-nez v0, :cond_3

    .line 114
    .line 115
    invoke-static {p0}, Lh/Hchat/utils/KavaReflector;->isAbstract(Ljava/lang/reflect/Method;)Z

    .line 116
    .line 117
    .line 118
    move-result p0

    .line 119
    if-nez p0, :cond_3

    .line 120
    .line 121
    return v5

    .line 122
    :cond_3
    return v6
.end method


# virtual methods
.method public final d()Ljava/util/List;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lz8/g;->a:Lr8/g;

    .line 4
    .line 5
    iget-object v2, v0, Lr8/g;->a:Landroid/content/Context;

    .line 6
    .line 7
    iget-object v3, v0, Lr8/g;->c:Ljava/lang/ClassLoader;

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
    iget-object v3, v0, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 19
    .line 20
    iget-object v4, v1, Lz8/g;->d:Landroid/content/SharedPreferences;

    .line 21
    .line 22
    const-string v5, "core_start_methods_v1"

    .line 23
    .line 24
    invoke-static {v4, v2, v3, v5}, Le8/b;->f(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    iget-object v6, v0, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 29
    .line 30
    const-string v7, "core_ack_methods_v1"

    .line 31
    .line 32
    invoke-static {v4, v2, v6, v7}, Le8/b;->f(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object v8

    .line 36
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 37
    .line 38
    .line 39
    move-result v9

    .line 40
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 41
    .line 42
    .line 43
    move-result v10

    .line 44
    if-ne v9, v10, :cond_6

    .line 45
    .line 46
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 47
    .line 48
    .line 49
    move-result v9

    .line 50
    if-nez v9, :cond_6

    .line 51
    .line 52
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object v9

    .line 56
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object v10

    .line 60
    new-instance v11, Ljava/util/ArrayList;

    .line 61
    .line 62
    invoke-static {v3}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 63
    .line 64
    .line 65
    move-result v12

    .line 66
    invoke-static {v8}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 67
    .line 68
    .line 69
    move-result v13

    .line 70
    invoke-static {v12, v13}, Ljava/lang/Math;->min(II)I

    .line 71
    .line 72
    .line 73
    move-result v12

    .line 74
    invoke-direct {v11, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 75
    .line 76
    .line 77
    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 78
    .line 79
    .line 80
    move-result v12

    .line 81
    if-eqz v12, :cond_0

    .line 82
    .line 83
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 84
    .line 85
    .line 86
    move-result v12

    .line 87
    if-eqz v12, :cond_0

    .line 88
    .line 89
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v12

    .line 93
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v13

    .line 97
    new-instance v14, Lsf/e;

    .line 98
    .line 99
    invoke-direct {v14, v12, v13}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v11, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_0
    new-instance v9, Ljava/util/ArrayList;

    .line 107
    .line 108
    invoke-static {v11}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 109
    .line 110
    .line 111
    move-result v10

    .line 112
    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 116
    .line 117
    .line 118
    move-result-object v10

    .line 119
    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 120
    .line 121
    .line 122
    move-result v11

    .line 123
    if-eqz v11, :cond_1

    .line 124
    .line 125
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v11

    .line 129
    check-cast v11, Lsf/e;

    .line 130
    .line 131
    iget-object v12, v11, Lsf/e;->g:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v12, Ljava/lang/reflect/Method;

    .line 134
    .line 135
    iget-object v11, v11, Lsf/e;->h:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast v11, Ljava/lang/reflect/Method;

    .line 138
    .line 139
    new-instance v13, Lz8/f;

    .line 140
    .line 141
    invoke-direct {v13, v12, v11}, Lz8/f;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v9, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    goto :goto_1

    .line 148
    :cond_1
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    .line 149
    .line 150
    .line 151
    move-result v10

    .line 152
    if-eqz v10, :cond_2

    .line 153
    .line 154
    goto :goto_3

    .line 155
    :cond_2
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 156
    .line 157
    .line 158
    move-result-object v10

    .line 159
    :cond_3
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 160
    .line 161
    .line 162
    move-result v11

    .line 163
    if-eqz v11, :cond_5

    .line 164
    .line 165
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v11

    .line 169
    check-cast v11, Lz8/f;

    .line 170
    .line 171
    iget-object v12, v11, Lz8/f;->a:Ljava/lang/reflect/Method;

    .line 172
    .line 173
    invoke-static {v12}, Lz8/g;->b(Ljava/lang/reflect/Method;)Z

    .line 174
    .line 175
    .line 176
    move-result v12

    .line 177
    if-eqz v12, :cond_4

    .line 178
    .line 179
    iget-object v12, v11, Lz8/f;->b:Ljava/lang/reflect/Method;

    .line 180
    .line 181
    iget-object v11, v11, Lz8/f;->a:Ljava/lang/reflect/Method;

    .line 182
    .line 183
    invoke-static {v12, v11}, Lz8/g;->a(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)Z

    .line 184
    .line 185
    .line 186
    move-result v11

    .line 187
    if-eqz v11, :cond_4

    .line 188
    .line 189
    const/4 v11, 0x1

    .line 190
    goto :goto_2

    .line 191
    :cond_4
    const/4 v11, 0x0

    .line 192
    :goto_2
    if-nez v11, :cond_3

    .line 193
    .line 194
    goto :goto_4

    .line 195
    :cond_5
    :goto_3
    return-object v9

    .line 196
    :cond_6
    :goto_4
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 197
    .line 198
    .line 199
    move-result v3

    .line 200
    const-string v9, "core_scan_runtime_v1"

    .line 201
    .line 202
    if-eqz v3, :cond_7

    .line 203
    .line 204
    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    .line 205
    .line 206
    .line 207
    move-result v3

    .line 208
    if-nez v3, :cond_8

    .line 209
    .line 210
    :cond_7
    invoke-interface {v4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 211
    .line 212
    .line 213
    move-result-object v3

    .line 214
    invoke-interface {v3, v9}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 215
    .line 216
    .line 217
    move-result-object v3

    .line 218
    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 219
    .line 220
    .line 221
    :cond_8
    invoke-static {v4, v2, v5}, Le8/b;->a(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    invoke-static {v4, v2, v7}, Le8/b;->a(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    const-string v3, ""

    .line 228
    .line 229
    invoke-interface {v4, v9, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v3

    .line 233
    invoke-static {v3, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move-result v3

    .line 237
    sget-object v8, Ltf/t;->g:Ltf/t;

    .line 238
    .line 239
    if-eqz v3, :cond_9

    .line 240
    .line 241
    return-object v8

    .line 242
    :cond_9
    :try_start_0
    iget-object v0, v0, Lr8/g;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 243
    .line 244
    new-instance v3, Lch/e;

    .line 245
    .line 246
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 247
    .line 248
    .line 249
    new-instance v10, Lfh/k;

    .line 250
    .line 251
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 252
    .line 253
    .line 254
    sget-object v11, Lz8/g;->h:[Ljava/lang/String;

    .line 255
    .line 256
    array-length v12, v11

    .line 257
    invoke-static {v11, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v11

    .line 261
    check-cast v11, [Ljava/lang/String;

    .line 262
    .line 263
    invoke-virtual {v10, v11}, Lfh/k;->r0([Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    iput-object v10, v3, Lch/e;->h:Lfh/k;

    .line 267
    .line 268
    invoke-virtual {v0, v3}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 269
    .line 270
    .line 271
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 272
    goto :goto_5

    .line 273
    :catchall_0
    move-exception v0

    .line 274
    new-instance v3, Lsf/f;

    .line 275
    .line 276
    invoke-direct {v3, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 277
    .line 278
    .line 279
    move-object v0, v3

    .line 280
    :goto_5
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 281
    .line 282
    .line 283
    move-result-object v3

    .line 284
    if-nez v3, :cond_1c

    .line 285
    .line 286
    check-cast v0, Lhh/p;

    .line 287
    .line 288
    new-instance v3, Ljava/util/ArrayList;

    .line 289
    .line 290
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 294
    .line 295
    .line 296
    move-result-object v10

    .line 297
    :cond_a
    :goto_6
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 298
    .line 299
    .line 300
    move-result v0

    .line 301
    if-eqz v0, :cond_16

    .line 302
    .line 303
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    move-object v11, v0

    .line 308
    check-cast v11, Lhh/o;

    .line 309
    .line 310
    :try_start_1
    invoke-virtual {v11, v6}, Lhh/o;->r(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 311
    .line 312
    .line 313
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 314
    goto :goto_7

    .line 315
    :catchall_1
    move-exception v0

    .line 316
    new-instance v12, Lsf/f;

    .line 317
    .line 318
    invoke-direct {v12, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 319
    .line 320
    .line 321
    move-object v0, v12

    .line 322
    :goto_7
    nop

    .line 323
    instance-of v12, v0, Lsf/f;

    .line 324
    .line 325
    if-eqz v12, :cond_b

    .line 326
    .line 327
    const/4 v0, 0x0

    .line 328
    :cond_b
    check-cast v0, Ljava/lang/reflect/Method;

    .line 329
    .line 330
    if-eqz v0, :cond_15

    .line 331
    .line 332
    invoke-static {v0}, Lz8/g;->b(Ljava/lang/reflect/Method;)Z

    .line 333
    .line 334
    .line 335
    move-result v12

    .line 336
    if-eqz v12, :cond_c

    .line 337
    .line 338
    move-object v12, v0

    .line 339
    goto :goto_8

    .line 340
    :cond_c
    const/4 v12, 0x0

    .line 341
    :goto_8
    if-eqz v12, :cond_15

    .line 342
    .line 343
    :try_start_2
    invoke-virtual {v11}, Lhh/o;->q()Lhh/p;

    .line 344
    .line 345
    .line 346
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 347
    goto :goto_9

    .line 348
    :catchall_2
    move-exception v0

    .line 349
    new-instance v11, Lsf/f;

    .line 350
    .line 351
    invoke-direct {v11, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 352
    .line 353
    .line 354
    move-object v0, v11

    .line 355
    :goto_9
    nop

    .line 356
    instance-of v11, v0, Lsf/f;

    .line 357
    .line 358
    if-eqz v11, :cond_d

    .line 359
    .line 360
    move-object v0, v8

    .line 361
    :cond_d
    check-cast v0, Ljava/lang/Iterable;

    .line 362
    .line 363
    new-instance v11, Ljava/util/ArrayList;

    .line 364
    .line 365
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 366
    .line 367
    .line 368
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 369
    .line 370
    .line 371
    move-result-object v14

    .line 372
    :cond_e
    :goto_a
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 373
    .line 374
    .line 375
    move-result v0

    .line 376
    if-eqz v0, :cond_10

    .line 377
    .line 378
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    check-cast v0, Lhh/o;

    .line 383
    .line 384
    :try_start_3
    invoke-virtual {v0, v6}, Lhh/o;->r(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 385
    .line 386
    .line 387
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 388
    goto :goto_b

    .line 389
    :catchall_3
    move-exception v0

    .line 390
    new-instance v15, Lsf/f;

    .line 391
    .line 392
    invoke-direct {v15, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 393
    .line 394
    .line 395
    move-object v0, v15

    .line 396
    :goto_b
    nop

    .line 397
    instance-of v15, v0, Lsf/f;

    .line 398
    .line 399
    if-eqz v15, :cond_f

    .line 400
    .line 401
    const/4 v0, 0x0

    .line 402
    :cond_f
    check-cast v0, Ljava/lang/reflect/Method;

    .line 403
    .line 404
    if-eqz v0, :cond_e

    .line 405
    .line 406
    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 407
    .line 408
    .line 409
    goto :goto_a

    .line 410
    :cond_10
    new-instance v0, Ljava/util/ArrayList;

    .line 411
    .line 412
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 413
    .line 414
    .line 415
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 416
    .line 417
    .line 418
    move-result-object v11

    .line 419
    :cond_11
    :goto_c
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 420
    .line 421
    .line 422
    move-result v14

    .line 423
    if-eqz v14, :cond_12

    .line 424
    .line 425
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object v14

    .line 429
    move-object v15, v14

    .line 430
    check-cast v15, Ljava/lang/reflect/Method;

    .line 431
    .line 432
    invoke-static {v15, v12}, Lz8/g;->a(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)Z

    .line 433
    .line 434
    .line 435
    move-result v15

    .line 436
    if-eqz v15, :cond_11

    .line 437
    .line 438
    invoke-virtual {v0, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 439
    .line 440
    .line 441
    goto :goto_c

    .line 442
    :cond_12
    new-instance v11, Ljava/util/HashSet;

    .line 443
    .line 444
    invoke-direct {v11}, Ljava/util/HashSet;-><init>()V

    .line 445
    .line 446
    .line 447
    new-instance v14, Ljava/util/ArrayList;

    .line 448
    .line 449
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 450
    .line 451
    .line 452
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 453
    .line 454
    .line 455
    move-result-object v0

    .line 456
    :cond_13
    :goto_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 457
    .line 458
    .line 459
    move-result v15

    .line 460
    if-eqz v15, :cond_14

    .line 461
    .line 462
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    move-result-object v15

    .line 466
    move-object/from16 v16, v15

    .line 467
    .line 468
    check-cast v16, Ljava/lang/reflect/Method;

    .line 469
    .line 470
    invoke-virtual/range {v16 .. v16}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 471
    .line 472
    .line 473
    move-result-object v13

    .line 474
    invoke-virtual {v11, v13}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 475
    .line 476
    .line 477
    move-result v13

    .line 478
    if-eqz v13, :cond_13

    .line 479
    .line 480
    invoke-virtual {v14, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 481
    .line 482
    .line 483
    goto :goto_d

    .line 484
    :cond_14
    invoke-static {v14}, Ltf/m;->I1(Ljava/util/List;)Ljava/lang/Object;

    .line 485
    .line 486
    .line 487
    move-result-object v0

    .line 488
    check-cast v0, Ljava/lang/reflect/Method;

    .line 489
    .line 490
    if-eqz v0, :cond_15

    .line 491
    .line 492
    new-instance v13, Lz8/f;

    .line 493
    .line 494
    invoke-direct {v13, v12, v0}, Lz8/f;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V

    .line 495
    .line 496
    .line 497
    goto :goto_e

    .line 498
    :cond_15
    const/4 v13, 0x0

    .line 499
    :goto_e
    if-eqz v13, :cond_a

    .line 500
    .line 501
    invoke-virtual {v3, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 502
    .line 503
    .line 504
    goto/16 :goto_6

    .line 505
    .line 506
    :cond_16
    new-instance v0, Ljava/util/HashSet;

    .line 507
    .line 508
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 509
    .line 510
    .line 511
    new-instance v6, Ljava/util/ArrayList;

    .line 512
    .line 513
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 514
    .line 515
    .line 516
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 517
    .line 518
    .line 519
    move-result-object v3

    .line 520
    :cond_17
    :goto_f
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 521
    .line 522
    .line 523
    move-result v8

    .line 524
    if-eqz v8, :cond_18

    .line 525
    .line 526
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 527
    .line 528
    .line 529
    move-result-object v8

    .line 530
    move-object v10, v8

    .line 531
    check-cast v10, Lz8/f;

    .line 532
    .line 533
    iget-object v10, v10, Lz8/f;->a:Ljava/lang/reflect/Method;

    .line 534
    .line 535
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 536
    .line 537
    .line 538
    move-result-object v10

    .line 539
    invoke-virtual {v0, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 540
    .line 541
    .line 542
    move-result v10

    .line 543
    if-eqz v10, :cond_17

    .line 544
    .line 545
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 546
    .line 547
    .line 548
    goto :goto_f

    .line 549
    :cond_18
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 550
    .line 551
    .line 552
    move-result v0

    .line 553
    if-nez v0, :cond_1b

    .line 554
    .line 555
    new-instance v0, Ljava/util/ArrayList;

    .line 556
    .line 557
    invoke-static {v6}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 558
    .line 559
    .line 560
    move-result v3

    .line 561
    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 562
    .line 563
    .line 564
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 565
    .line 566
    .line 567
    move-result-object v3

    .line 568
    :goto_10
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 569
    .line 570
    .line 571
    move-result v8

    .line 572
    if-eqz v8, :cond_19

    .line 573
    .line 574
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 575
    .line 576
    .line 577
    move-result-object v8

    .line 578
    check-cast v8, Lz8/f;

    .line 579
    .line 580
    iget-object v8, v8, Lz8/f;->a:Ljava/lang/reflect/Method;

    .line 581
    .line 582
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 583
    .line 584
    .line 585
    goto :goto_10

    .line 586
    :cond_19
    sget-object v3, Le8/b;->a:Le8/b;

    .line 587
    .line 588
    invoke-virtual {v3, v4, v2, v5, v0}, Le8/b;->j(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 589
    .line 590
    .line 591
    new-instance v0, Ljava/util/ArrayList;

    .line 592
    .line 593
    invoke-static {v6}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 594
    .line 595
    .line 596
    move-result v5

    .line 597
    invoke-direct {v0, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 598
    .line 599
    .line 600
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 601
    .line 602
    .line 603
    move-result-object v5

    .line 604
    :goto_11
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 605
    .line 606
    .line 607
    move-result v8

    .line 608
    if-eqz v8, :cond_1a

    .line 609
    .line 610
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 611
    .line 612
    .line 613
    move-result-object v8

    .line 614
    check-cast v8, Lz8/f;

    .line 615
    .line 616
    iget-object v8, v8, Lz8/f;->b:Ljava/lang/reflect/Method;

    .line 617
    .line 618
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 619
    .line 620
    .line 621
    goto :goto_11

    .line 622
    :cond_1a
    invoke-virtual {v3, v4, v2, v7, v0}, Le8/b;->j(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 623
    .line 624
    .line 625
    :cond_1b
    invoke-interface {v4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 626
    .line 627
    .line 628
    move-result-object v0

    .line 629
    invoke-interface {v0, v9, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 630
    .line 631
    .line 632
    move-result-object v0

    .line 633
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 634
    .line 635
    .line 636
    return-object v6

    .line 637
    :cond_1c
    iget-object v0, v1, Lz8/g;->b:Ly9/b;

    .line 638
    .line 639
    const-string v2, "\u5b9a\u4f4d\u5fae\u4fe1 CoreV2 \u901a\u8bdd\u94c3\u58f0\u5165\u53e3\u5931\u8d25"

    .line 640
    .line 641
    invoke-virtual {v0, v2, v3}, Ly9/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 642
    .line 643
    .line 644
    return-object v8
.end method

.method public final e()Ljava/util/List;
    .locals 14

    .line 1
    iget-object v0, p0, Lz8/g;->a:Lr8/g;

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
    iget-object v2, v0, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 17
    .line 18
    iget-object v3, p0, Lz8/g;->d:Landroid/content/SharedPreferences;

    .line 19
    .line 20
    const-string v4, "direction_methods_v1"

    .line 21
    .line 22
    invoke-static {v3, v1, v2, v4}, Le8/b;->f(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    const/4 v6, 0x0

    .line 31
    if-nez v5, :cond_2

    .line 32
    .line 33
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    if-eqz v5, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    :cond_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v7

    .line 48
    if-eqz v7, :cond_3

    .line 49
    .line 50
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    check-cast v7, Ljava/lang/reflect/Method;

    .line 55
    .line 56
    invoke-static {v7}, Lz8/g;->c(Ljava/lang/reflect/Method;)Z

    .line 57
    .line 58
    .line 59
    move-result v7

    .line 60
    if-nez v7, :cond_1

    .line 61
    .line 62
    :cond_2
    move-object v2, v6

    .line 63
    :cond_3
    :goto_0
    if-eqz v2, :cond_4

    .line 64
    .line 65
    return-object v2

    .line 66
    :cond_4
    new-instance v2, Ljava/util/LinkedHashSet;

    .line 67
    .line 68
    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 69
    .line 70
    .line 71
    sget-object v5, Lz8/g;->g:Ljava/util/List;

    .line 72
    .line 73
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    :cond_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 78
    .line 79
    .line 80
    move-result v7

    .line 81
    const-string v8, ""

    .line 82
    .line 83
    iget-object v9, p0, Lz8/g;->b:Ly9/b;

    .line 84
    .line 85
    if-eqz v7, :cond_c

    .line 86
    .line 87
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v7

    .line 91
    check-cast v7, [Ljava/lang/String;

    .line 92
    .line 93
    :try_start_0
    iget-object v10, v0, Lr8/g;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 94
    .line 95
    new-instance v11, Lch/e;

    .line 96
    .line 97
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 98
    .line 99
    .line 100
    new-instance v12, Lfh/k;

    .line 101
    .line 102
    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    .line 103
    .line 104
    .line 105
    array-length v13, v7

    .line 106
    invoke-static {v7, v13}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v13

    .line 110
    check-cast v13, [Ljava/lang/String;

    .line 111
    .line 112
    invoke-virtual {v12, v13}, Lfh/k;->r0([Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    iput-object v12, v11, Lch/e;->h:Lfh/k;

    .line 116
    .line 117
    invoke-virtual {v10, v11}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 118
    .line 119
    .line 120
    move-result-object v10

    .line 121
    new-instance v11, Ljava/util/ArrayList;

    .line 122
    .line 123
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 127
    .line 128
    .line 129
    move-result-object v10

    .line 130
    :cond_6
    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 131
    .line 132
    .line 133
    move-result v12

    .line 134
    if-eqz v12, :cond_8

    .line 135
    .line 136
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v12

    .line 140
    check-cast v12, Lhh/o;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 141
    .line 142
    :try_start_1
    iget-object v13, v0, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 143
    .line 144
    invoke-virtual {v12, v13}, Lhh/o;->r(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 145
    .line 146
    .line 147
    move-result-object v12
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 148
    goto :goto_2

    .line 149
    :catchall_0
    move-exception v12

    .line 150
    :try_start_2
    new-instance v13, Lsf/f;

    .line 151
    .line 152
    invoke-direct {v13, v12}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 153
    .line 154
    .line 155
    move-object v12, v13

    .line 156
    :goto_2
    nop

    .line 157
    instance-of v13, v12, Lsf/f;

    .line 158
    .line 159
    if-eqz v13, :cond_7

    .line 160
    .line 161
    move-object v12, v6

    .line 162
    :cond_7
    check-cast v12, Ljava/lang/reflect/Method;

    .line 163
    .line 164
    if-eqz v12, :cond_6

    .line 165
    .line 166
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 167
    .line 168
    .line 169
    goto :goto_1

    .line 170
    :catchall_1
    move-exception v10

    .line 171
    new-instance v11, Lsf/f;

    .line 172
    .line 173
    invoke-direct {v11, v10}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 174
    .line 175
    .line 176
    :cond_8
    invoke-static {v11}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 177
    .line 178
    .line 179
    move-result-object v10

    .line 180
    if-nez v10, :cond_9

    .line 181
    .line 182
    goto :goto_4

    .line 183
    :cond_9
    invoke-static {v7}, Ltf/l;->z0([Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v7

    .line 187
    check-cast v7, Ljava/lang/String;

    .line 188
    .line 189
    if-nez v7, :cond_a

    .line 190
    .line 191
    goto :goto_3

    .line 192
    :cond_a
    move-object v8, v7

    .line 193
    :goto_3
    const-string v7, "\u5b9a\u4f4d\u5fae\u4fe1\u901a\u8bdd\u94c3\u58f0\u5165\u53e3\u5931\u8d25: "

    .line 194
    .line 195
    invoke-virtual {v7, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v7

    .line 199
    invoke-virtual {v9, v7, v10}, Ly9/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    sget-object v11, Ltf/t;->g:Ltf/t;

    .line 203
    .line 204
    :goto_4
    check-cast v11, Ljava/util/List;

    .line 205
    .line 206
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 207
    .line 208
    .line 209
    move-result-object v7

    .line 210
    :cond_b
    :goto_5
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 211
    .line 212
    .line 213
    move-result v8

    .line 214
    if-eqz v8, :cond_5

    .line 215
    .line 216
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v8

    .line 220
    move-object v9, v8

    .line 221
    check-cast v9, Ljava/lang/reflect/Method;

    .line 222
    .line 223
    invoke-static {v9}, Lz8/g;->c(Ljava/lang/reflect/Method;)Z

    .line 224
    .line 225
    .line 226
    move-result v9

    .line 227
    if-eqz v9, :cond_b

    .line 228
    .line 229
    invoke-interface {v2, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    goto :goto_5

    .line 233
    :cond_c
    new-instance v0, Ljava/util/HashSet;

    .line 234
    .line 235
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 236
    .line 237
    .line 238
    new-instance v5, Ljava/util/ArrayList;

    .line 239
    .line 240
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 241
    .line 242
    .line 243
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 244
    .line 245
    .line 246
    move-result-object v2

    .line 247
    :cond_d
    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 248
    .line 249
    .line 250
    move-result v7

    .line 251
    if-eqz v7, :cond_e

    .line 252
    .line 253
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v7

    .line 257
    move-object v10, v7

    .line 258
    check-cast v10, Ljava/lang/reflect/Method;

    .line 259
    .line 260
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v10

    .line 264
    invoke-virtual {v0, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    move-result v10

    .line 268
    if-eqz v10, :cond_d

    .line 269
    .line 270
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    goto :goto_6

    .line 274
    :cond_e
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 275
    .line 276
    .line 277
    move-result v0

    .line 278
    if-eqz v0, :cond_10

    .line 279
    .line 280
    const-string v0, "cache.key"

    .line 281
    .line 282
    :try_start_3
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 283
    .line 284
    .line 285
    move-result-object v2

    .line 286
    invoke-interface {v3, v0, v8}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v3

    .line 290
    invoke-static {v3, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 291
    .line 292
    .line 293
    move-result v3

    .line 294
    if-nez v3, :cond_f

    .line 295
    .line 296
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 297
    .line 298
    .line 299
    move-result-object v3

    .line 300
    invoke-interface {v3, v0, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 301
    .line 302
    .line 303
    :cond_f
    invoke-interface {v2, v4}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 308
    .line 309
    .line 310
    :catchall_2
    const-string v0, "\u672a\u5b9a\u4f4d\u5fae\u4fe1\u901a\u8bdd\u94c3\u58f0\u5165\u53e3"

    .line 311
    .line 312
    invoke-virtual {v9, v0, v6}, Ly9/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    goto :goto_7

    .line 316
    :cond_10
    sget-object v0, Le8/b;->a:Le8/b;

    .line 317
    .line 318
    invoke-virtual {v0, v3, v1, v4, v5}, Le8/b;->j(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 319
    .line 320
    .line 321
    :goto_7
    return-object v5
.end method
