.class public final Lha/z;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lr8/g;

.field public final b:Lab/b;

.field public final c:Landroid/content/SharedPreferences;

.field public final d:Landroid/content/SharedPreferences;

.field public final e:Landroid/os/Handler;

.field public final f:Ljava/util/Map;

.field public final g:Ljava/util/Map;

.field public final h:Ljava/lang/Object;

.field public final i:Ljava/util/concurrent/ConcurrentHashMap;

.field public final j:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

.field public final k:Lsf/i;

.field public final l:La1/a;

.field public volatile m:Z

.field public volatile n:Z

.field public volatile o:Z

.field public volatile p:Z

.field public volatile q:Ljava/lang/String;

.field public volatile r:Ljava/util/Set;


# direct methods
.method public constructor <init>(Lr8/g;Lab/b;)V
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
    iput-object p1, p0, Lha/z;->a:Lr8/g;

    .line 8
    .line 9
    iput-object p2, p0, Lha/z;->b:Lab/b;

    .line 10
    .line 11
    iget-object p2, p1, Lr8/g;->a:Landroid/content/Context;

    .line 12
    .line 13
    const-string v0, "Hchat_moments_keyword_block_config"

    .line 14
    .line 15
    invoke-static {p2, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    iput-object p2, p0, Lha/z;->c:Landroid/content/SharedPreferences;

    .line 20
    .line 21
    iget-object p1, p1, Lr8/g;->a:Landroid/content/Context;

    .line 22
    .line 23
    const-string v0, "Hchat_moments_keyword_block_method_cache"

    .line 24
    .line 25
    invoke-static {p1, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, p0, Lha/z;->d:Landroid/content/SharedPreferences;

    .line 30
    .line 31
    new-instance p1, Landroid/os/Handler;

    .line 32
    .line 33
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 38
    .line 39
    .line 40
    iput-object p1, p0, Lha/z;->e:Landroid/os/Handler;

    .line 41
    .line 42
    invoke-static {}, Lp/a;->p()Ljava/util/Map;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    iput-object p1, p0, Lha/z;->f:Ljava/util/Map;

    .line 47
    .line 48
    invoke-static {}, Lp/a;->p()Ljava/util/Map;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iput-object p1, p0, Lha/z;->g:Ljava/util/Map;

    .line 53
    .line 54
    new-instance p1, Ljava/lang/Object;

    .line 55
    .line 56
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 57
    .line 58
    .line 59
    iput-object p1, p0, Lha/z;->h:Ljava/lang/Object;

    .line 60
    .line 61
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 62
    .line 63
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 64
    .line 65
    .line 66
    iput-object p1, p0, Lha/z;->i:Ljava/util/concurrent/ConcurrentHashMap;

    .line 67
    .line 68
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    iput-object p1, p0, Lha/z;->j:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 73
    .line 74
    new-instance p1, Lab/a;

    .line 75
    .line 76
    const/16 v0, 0x1a

    .line 77
    .line 78
    invoke-direct {p1, p0, v0}, Lab/a;-><init>(Ljava/lang/Object;I)V

    .line 79
    .line 80
    .line 81
    new-instance v0, Lsf/i;

    .line 82
    .line 83
    invoke-direct {v0, p1}, Lsf/i;-><init>(Lfg/a;)V

    .line 84
    .line 85
    .line 86
    iput-object v0, p0, Lha/z;->k:Lsf/i;

    .line 87
    .line 88
    new-instance p1, La1/a;

    .line 89
    .line 90
    const/16 v0, 0xb

    .line 91
    .line 92
    invoke-direct {p1, p0, v0}, La1/a;-><init>(Ljava/lang/Object;I)V

    .line 93
    .line 94
    .line 95
    iput-object p1, p0, Lha/z;->l:La1/a;

    .line 96
    .line 97
    new-instance p1, Lb9/b;

    .line 98
    .line 99
    const/4 v0, 0x6

    .line 100
    invoke-direct {p1, p0, v0}, Lb9/b;-><init>(Ljava/lang/Object;I)V

    .line 101
    .line 102
    .line 103
    sget-object v0, Ltf/v;->g:Ltf/v;

    .line 104
    .line 105
    iput-object v0, p0, Lha/z;->r:Ljava/util/Set;

    .line 106
    .line 107
    invoke-interface {p2, p1}, Landroid/content/SharedPreferences;->registerOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    .line 108
    .line 109
    .line 110
    return-void
.end method

.method public static final a(Lha/z;Landroid/view/View;Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lha/z;->g:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lha/z;->q(Landroid/view/View;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p2}, Lha/z;->j(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object v0, p0, Lha/z;->g:Ljava/util/Map;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    check-cast v0, Ljava/util/Map;

    .line 22
    .line 23
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, p2}, Lha/z;->r(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    if-eqz p2, :cond_1

    .line 31
    .line 32
    invoke-virtual {p0, p1}, Lha/z;->d(Landroid/view/View;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    :goto_0
    return-void
.end method

.method public static e(Ljava/lang/Class;)Ljava/util/ArrayList;
    .locals 5

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    :goto_0
    if-eqz p0, :cond_3

    .line 7
    .line 8
    const-class v1, Ljava/lang/Object;

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_3

    .line 15
    .line 16
    invoke-static {p0}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    :cond_0
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_2

    .line 29
    .line 30
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    move-object v3, v2

    .line 35
    check-cast v3, Ljava/lang/reflect/Method;

    .line 36
    .line 37
    invoke-static {v3}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Method;)Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-nez v4, :cond_1

    .line 42
    .line 43
    invoke-static {v3}, Lh/Hchat/utils/KavaReflector;->isAbstract(Ljava/lang/reflect/Method;)Z

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    if-nez v4, :cond_1

    .line 48
    .line 49
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    array-length v3, v3

    .line 57
    if-nez v3, :cond_1

    .line 58
    .line 59
    const/4 v3, 0x1

    .line 60
    goto :goto_2

    .line 61
    :cond_1
    const/4 v3, 0x0

    .line 62
    :goto_2
    if-eqz v3, :cond_0

    .line 63
    .line 64
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    goto :goto_0

    .line 73
    :cond_3
    new-instance p0, Ljava/util/HashSet;

    .line 74
    .line 75
    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 76
    .line 77
    .line 78
    new-instance v1, Ljava/util/ArrayList;

    .line 79
    .line 80
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    :cond_4
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    if-eqz v2, :cond_5

    .line 92
    .line 93
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    move-object v3, v2

    .line 98
    check-cast v3, Ljava/lang/reflect/Method;

    .line 99
    .line 100
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    invoke-virtual {p0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    if-eqz v3, :cond_4

    .line 109
    .line 110
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_5
    return-object v1
.end method

.method public static f(Ljava/lang/reflect/Method;)Z
    .locals 1

    .line 1
    invoke-static {p0}, Lh/Hchat/utils/KavaReflector;->isAbstract(Ljava/lang/reflect/Method;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Class;->isInterface()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    array-length v0, v0

    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 32
    .line 33
    invoke-static {p0, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    const/4 p0, 0x0

    .line 42
    return p0
.end method

.method public static h(Ljava/lang/reflect/Method;)Z
    .locals 5

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
    if-nez v1, :cond_0

    .line 11
    .line 12
    invoke-static {p0}, Lh/Hchat/utils/KavaReflector;->isAbstract(Ljava/lang/reflect/Method;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1}, Ljava/lang/Class;->isInterface()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-nez v1, :cond_0

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    const-class v1, Landroid/view/View;

    .line 33
    .line 34
    invoke-virtual {v1, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    if-eqz p0, :cond_0

    .line 39
    .line 40
    array-length p0, v0

    .line 41
    const/4 v3, 0x4

    .line 42
    if-ne p0, v3, :cond_0

    .line 43
    .line 44
    aget-object p0, v0, v2

    .line 45
    .line 46
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    const-string v3, "com.tencent.mm.plugin.sns.storage.SnsInfo"

    .line 51
    .line 52
    invoke-virtual {p0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    if-eqz p0, :cond_0

    .line 57
    .line 58
    const/4 p0, 0x1

    .line 59
    aget-object v3, v0, p0

    .line 60
    .line 61
    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 62
    .line 63
    invoke-static {v3, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-eqz v3, :cond_0

    .line 68
    .line 69
    const/4 v3, 0x2

    .line 70
    aget-object v3, v0, v3

    .line 71
    .line 72
    invoke-static {v3, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    if-eqz v3, :cond_0

    .line 77
    .line 78
    const/4 v3, 0x3

    .line 79
    aget-object v0, v0, v3

    .line 80
    .line 81
    invoke-virtual {v1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-eqz v0, :cond_0

    .line 86
    .line 87
    return p0

    .line 88
    :cond_0
    return v2
.end method

.method public static i(Ljava/lang/reflect/Method;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "getView"

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
    invoke-static {p0}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Method;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-nez v1, :cond_0

    .line 23
    .line 24
    invoke-static {p0}, Lh/Hchat/utils/KavaReflector;->isAbstract(Ljava/lang/reflect/Method;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_0

    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v1}, Ljava/lang/Class;->isInterface()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-nez v1, :cond_0

    .line 39
    .line 40
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    const-class v1, Landroid/view/View;

    .line 45
    .line 46
    invoke-virtual {v1, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    if-eqz p0, :cond_0

    .line 51
    .line 52
    array-length p0, v0

    .line 53
    const/4 v3, 0x3

    .line 54
    if-ne p0, v3, :cond_0

    .line 55
    .line 56
    aget-object p0, v0, v2

    .line 57
    .line 58
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 59
    .line 60
    invoke-static {p0, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    if-eqz p0, :cond_0

    .line 65
    .line 66
    const/4 p0, 0x1

    .line 67
    aget-object v3, v0, p0

    .line 68
    .line 69
    invoke-virtual {v1, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-eqz v1, :cond_0

    .line 74
    .line 75
    const/4 v1, 0x2

    .line 76
    aget-object v0, v0, v1

    .line 77
    .line 78
    const-class v1, Landroid/view/ViewGroup;

    .line 79
    .line 80
    invoke-virtual {v1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-eqz v0, :cond_0

    .line 85
    .line 86
    return p0

    .line 87
    :cond_0
    return v2
.end method


# virtual methods
.method public final b()Ljava/util/Set;
    .locals 3

    .line 1
    iget-object v0, p0, Lha/z;->c:Landroid/content/SharedPreferences;

    .line 2
    .line 3
    const-string v1, "moments_keyword_block_enable"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    sget-object v0, Ltf/v;->g:Ltf/v;

    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    iget-object v0, p0, Lha/z;->c:Landroid/content/SharedPreferences;

    .line 16
    .line 17
    const-string v1, "moments_keyword_block_keywords"

    .line 18
    .line 19
    const-string v2, ""

    .line 20
    .line 21
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    const-string v0, ""

    .line 28
    .line 29
    :cond_1
    iget-object v1, p0, Lha/z;->q:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    iget-object v0, p0, Lha/z;->r:Ljava/util/Set;

    .line 38
    .line 39
    return-object v0

    .line 40
    :cond_2
    iget-object v1, p0, Lha/z;->h:Ljava/lang/Object;

    .line 41
    .line 42
    monitor-enter v1

    .line 43
    :try_start_0
    iget-object v2, p0, Lha/z;->q:Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-nez v2, :cond_3

    .line 50
    .line 51
    invoke-static {v0}, Lr9/e0;->T(Ljava/lang/String;)Ljava/util/Set;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    iput-object v2, p0, Lha/z;->r:Ljava/util/Set;

    .line 56
    .line 57
    iput-object v0, p0, Lha/z;->q:Ljava/lang/String;

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :catchall_0
    move-exception v0

    .line 61
    goto :goto_1

    .line 62
    :cond_3
    :goto_0
    iget-object v0, p0, Lha/z;->r:Ljava/util/Set;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    .line 64
    monitor-exit v1

    .line 65
    return-object v0

    .line 66
    :goto_1
    monitor-exit v1

    .line 67
    throw v0
.end method

.method public final c(Lfh/k;Lfg/l;)Ljava/lang/reflect/Method;
    .locals 5

    .line 1
    iget-object v0, p0, Lha/z;->a:Lr8/g;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    iget-object v2, v0, Lr8/g;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 5
    .line 6
    new-instance v3, Lch/e;

    .line 7
    .line 8
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, v3, Lch/e;->h:Lfh/k;

    .line 12
    .line 13
    invoke-virtual {v2, v3}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    new-instance v2, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_2

    .line 31
    .line 32
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    check-cast v3, Lhh/o;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 37
    .line 38
    :try_start_1
    iget-object v4, v0, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 39
    .line 40
    invoke-virtual {v3, v4}, Lhh/o;->r(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 41
    .line 42
    .line 43
    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 44
    goto :goto_1

    .line 45
    :catchall_0
    move-exception v3

    .line 46
    :try_start_2
    new-instance v4, Lsf/f;

    .line 47
    .line 48
    invoke-direct {v4, v3}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 49
    .line 50
    .line 51
    move-object v3, v4

    .line 52
    :goto_1
    nop

    .line 53
    instance-of v4, v3, Lsf/f;

    .line 54
    .line 55
    if-eqz v4, :cond_1

    .line 56
    .line 57
    move-object v3, v1

    .line 58
    :cond_1
    check-cast v3, Ljava/lang/reflect/Method;

    .line 59
    .line 60
    if-eqz v3, :cond_0

    .line 61
    .line 62
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :catchall_1
    move-exception p1

    .line 67
    goto :goto_3

    .line 68
    :cond_2
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_4

    .line 77
    .line 78
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-interface {p2, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    check-cast v2, Ljava/lang/Boolean;

    .line 87
    .line 88
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    if-eqz v2, :cond_3

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_4
    move-object v0, v1

    .line 96
    :goto_2
    check-cast v0, Ljava/lang/reflect/Method;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 97
    .line 98
    goto :goto_4

    .line 99
    :goto_3
    new-instance v0, Lsf/f;

    .line 100
    .line 101
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 102
    .line 103
    .line 104
    :goto_4
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    if-eqz p1, :cond_5

    .line 109
    .line 110
    iget-object p2, p0, Lha/z;->b:Lab/b;

    .line 111
    .line 112
    const-string v2, "\u670b\u53cb\u5708\u5173\u952e\u8bcd\u5c4f\u853d DexKit \u5b9a\u4f4d\u5931\u8d25"

    .line 113
    .line 114
    invoke-virtual {p2, v2, p1}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    :cond_5
    instance-of p1, v0, Lsf/f;

    .line 118
    .line 119
    if-eqz p1, :cond_6

    .line 120
    .line 121
    goto :goto_5

    .line 122
    :cond_6
    move-object v1, v0

    .line 123
    :goto_5
    check-cast v1, Ljava/lang/reflect/Method;

    .line 124
    .line 125
    return-object v1
.end method

.method public final d(Landroid/view/View;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lha/z;->f:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v0, Ljava/util/Map;

    .line 15
    .line 16
    new-instance v2, Lha/w;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    iget v4, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 25
    .line 26
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const/4 v4, 0x0

    .line 32
    :goto_0
    invoke-direct {v2, v4, v3}, Lha/w;-><init>(Ljava/lang/Integer;I)V

    .line 33
    .line 34
    .line 35
    invoke-interface {v0, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    const/16 v0, 0x8

    .line 39
    .line 40
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 41
    .line 42
    .line 43
    if-eqz v1, :cond_2

    .line 44
    .line 45
    iget v0, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 46
    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    const/4 v0, 0x0

    .line 50
    iput v0, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 51
    .line 52
    invoke-virtual {p1, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 53
    .line 54
    .line 55
    :cond_2
    :goto_1
    return-void
.end method

.method public final g(Ljava/lang/reflect/Method;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p1}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Method;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    invoke-static {p1}, Lh/Hchat/utils/KavaReflector;->isAbstract(Ljava/lang/reflect/Method;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1}, Ljava/lang/Class;->isInterface()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    const-class v1, Landroid/view/View;

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v1, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_0

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 44
    .line 45
    invoke-static {p1, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-eqz p1, :cond_0

    .line 50
    .line 51
    array-length p1, v0

    .line 52
    const/4 v1, 0x3

    .line 53
    if-ne p1, v1, :cond_0

    .line 54
    .line 55
    const/4 p1, 0x2

    .line 56
    aget-object p1, v0, p1

    .line 57
    .line 58
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 59
    .line 60
    invoke-static {p1, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-eqz p1, :cond_0

    .line 65
    .line 66
    const/4 p1, 0x1

    .line 67
    aget-object v0, v0, p1

    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0, v0}, Lha/z;->p(Ljava/lang/Class;)Lha/x;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    if-eqz v0, :cond_0

    .line 77
    .line 78
    return p1

    .line 79
    :cond_0
    const/4 p1, 0x0

    .line 80
    return p1
.end method

.method public final j(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lha/z;->k:Lsf/i;

    .line 2
    .line 3
    invoke-virtual {v0}, Lsf/i;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Class;

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-ne v0, v1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    const-string v0, "com.tencent.mm.plugin.sns.storage.SnsInfo"

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    :goto_0
    return v1

    .line 36
    :cond_1
    const/4 p1, 0x0

    .line 37
    return p1
.end method

.method public final k()Ljava/lang/reflect/Method;
    .locals 14

    .line 1
    invoke-virtual {p0}, Lha/z;->o()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lha/z;->a:Lr8/g;

    .line 6
    .line 7
    iget-object v1, v1, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 8
    .line 9
    iget-object v2, p0, Lha/z;->d:Landroid/content/SharedPreferences;

    .line 10
    .line 11
    const-string v3, "flutter_profile_switch"

    .line 12
    .line 13
    invoke-static {v2, v0, v1, v3}, Le8/b;->c(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    invoke-static {v1}, Lha/z;->f(Ljava/lang/reflect/Method;)Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-eqz v4, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v1, 0x0

    .line 27
    :goto_0
    if-eqz v1, :cond_1

    .line 28
    .line 29
    return-object v1

    .line 30
    :cond_1
    new-instance v1, Lfh/k;

    .line 31
    .line 32
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 33
    .line 34
    .line 35
    const-string v4, "enableFlutterSNSPage"

    .line 36
    .line 37
    const-string v5, "com.tencent.mm.plugin.sns.router.SnsRouter"

    .line 38
    .line 39
    filled-new-array {v4, v5}, [Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-virtual {v1, v4}, Lfh/k;->r0([Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    new-instance v5, Lc0/f;

    .line 47
    .line 48
    const-class v4, Lha/z;

    .line 49
    .line 50
    invoke-static {v4}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    move-result-object v8

    .line 54
    const/4 v12, 0x0

    .line 55
    const/16 v13, 0x12

    .line 56
    .line 57
    const/4 v6, 0x1

    .line 58
    const-string v9, "isFlutterProfileSwitchMethod"

    .line 59
    .line 60
    const-string v10, "isFlutterProfileSwitchMethod(Ljava/lang/reflect/Method;)Z"

    .line 61
    .line 62
    const/4 v11, 0x0

    .line 63
    move-object v7, p0

    .line 64
    invoke-direct/range {v5 .. v13}, Lc0/f;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0, v1, v5}, Lha/z;->c(Lfh/k;Lfg/l;)Ljava/lang/reflect/Method;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    if-eqz v1, :cond_2

    .line 72
    .line 73
    invoke-static {v2, v0, v3, v1}, Le8/b;->h(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 74
    .line 75
    .line 76
    return-object v1

    .line 77
    :cond_2
    invoke-static {v2, v0, v3}, Le8/b;->a(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    return-object v1
.end method

.method public final l()Ljava/lang/reflect/Method;
    .locals 15

    .line 1
    invoke-virtual {p0}, Lha/z;->o()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lha/z;->a:Lr8/g;

    .line 6
    .line 7
    iget-object v1, v1, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 8
    .line 9
    iget-object v2, p0, Lha/z;->d:Landroid/content/SharedPreferences;

    .line 10
    .line 11
    const-string v3, "improve_timeline_bind"

    .line 12
    .line 13
    invoke-static {v2, v0, v1, v3}, Le8/b;->c(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const/4 v4, 0x0

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0, v1}, Lha/z;->g(Ljava/lang/reflect/Method;)Z

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    if-eqz v5, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move-object v1, v4

    .line 28
    :goto_0
    if-eqz v1, :cond_1

    .line 29
    .line 30
    return-object v1

    .line 31
    :cond_1
    new-instance v1, Lfh/k;

    .line 32
    .line 33
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 34
    .line 35
    .line 36
    const-string v5, "measure"

    .line 37
    .line 38
    const-string v6, "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure"

    .line 39
    .line 40
    filled-new-array {v5, v6}, [Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    invoke-virtual {v1, v5}, Lfh/k;->r0([Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    new-instance v6, Lc0/f;

    .line 48
    .line 49
    const-class v5, Lha/z;

    .line 50
    .line 51
    invoke-static {v5}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    move-result-object v9

    .line 55
    const/4 v13, 0x0

    .line 56
    const/16 v14, 0x13

    .line 57
    .line 58
    const/4 v7, 0x1

    .line 59
    const-string v10, "isImproveTimelineBindMethod"

    .line 60
    .line 61
    const-string v11, "isImproveTimelineBindMethod(Ljava/lang/reflect/Method;)Z"

    .line 62
    .line 63
    const/4 v12, 0x0

    .line 64
    move-object v8, p0

    .line 65
    invoke-direct/range {v6 .. v14}, Lc0/f;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0, v1, v6}, Lha/z;->c(Lfh/k;Lfg/l;)Ljava/lang/reflect/Method;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    if-eqz v1, :cond_2

    .line 73
    .line 74
    invoke-static {v2, v0, v3, v1}, Le8/b;->h(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 75
    .line 76
    .line 77
    return-object v1

    .line 78
    :cond_2
    invoke-static {v2, v0, v3}, Le8/b;->a(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    iget-object v0, v8, Lha/z;->b:Lab/b;

    .line 82
    .line 83
    const-string v2, "\u670b\u53cb\u5708\u5173\u952e\u8bcd\u5c4f\u853d\u672a\u627e\u5230\u65b0\u7248\u65f6\u95f4\u7ebf\u7ed1\u5b9a\u65b9\u6cd5"

    .line 84
    .line 85
    invoke-virtual {v0, v2, v4}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    return-object v1
.end method

.method public final m()Ljava/lang/reflect/Method;
    .locals 14

    .line 1
    invoke-virtual {p0}, Lha/z;->o()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lha/z;->a:Lr8/g;

    .line 6
    .line 7
    iget-object v1, v1, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 8
    .line 9
    iget-object v2, p0, Lha/z;->d:Landroid/content/SharedPreferences;

    .line 10
    .line 11
    const-string v3, "legacy_timeline_create_view"

    .line 12
    .line 13
    invoke-static {v2, v0, v1, v3}, Le8/b;->c(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    invoke-static {v1}, Lha/z;->h(Ljava/lang/reflect/Method;)Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-eqz v4, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v1, 0x0

    .line 27
    :goto_0
    if-eqz v1, :cond_1

    .line 28
    .line 29
    return-object v1

    .line 30
    :cond_1
    new-instance v1, Lfh/k;

    .line 31
    .line 32
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 33
    .line 34
    .line 35
    const-string v4, "createView"

    .line 36
    .line 37
    const-string v5, "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter"

    .line 38
    .line 39
    filled-new-array {v4, v5}, [Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-virtual {v1, v4}, Lfh/k;->r0([Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    new-instance v5, Lc0/f;

    .line 47
    .line 48
    const-class v4, Lha/z;

    .line 49
    .line 50
    invoke-static {v4}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    move-result-object v8

    .line 54
    const/4 v12, 0x0

    .line 55
    const/16 v13, 0x14

    .line 56
    .line 57
    const/4 v6, 0x1

    .line 58
    const-string v9, "isLegacyTimelineCreateViewMethod"

    .line 59
    .line 60
    const-string v10, "isLegacyTimelineCreateViewMethod(Ljava/lang/reflect/Method;)Z"

    .line 61
    .line 62
    const/4 v11, 0x0

    .line 63
    move-object v7, p0

    .line 64
    invoke-direct/range {v5 .. v13}, Lc0/f;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0, v1, v5}, Lha/z;->c(Lfh/k;Lfg/l;)Ljava/lang/reflect/Method;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    if-eqz v1, :cond_2

    .line 72
    .line 73
    invoke-static {v2, v0, v3, v1}, Le8/b;->h(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 74
    .line 75
    .line 76
    return-object v1

    .line 77
    :cond_2
    invoke-static {v2, v0, v3}, Le8/b;->a(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    return-object v1
.end method

.method public final n()Ljava/lang/reflect/Method;
    .locals 15

    .line 1
    invoke-virtual {p0}, Lha/z;->o()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lha/z;->a:Lr8/g;

    .line 6
    .line 7
    iget-object v1, v1, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 8
    .line 9
    iget-object v2, p0, Lha/z;->d:Landroid/content/SharedPreferences;

    .line 10
    .line 11
    const-string v3, "profile_list_bind"

    .line 12
    .line 13
    invoke-static {v2, v0, v1, v3}, Le8/b;->c(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const/4 v4, 0x0

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-static {v1}, Lha/z;->i(Ljava/lang/reflect/Method;)Z

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    if-eqz v5, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move-object v1, v4

    .line 28
    :goto_0
    if-eqz v1, :cond_1

    .line 29
    .line 30
    return-object v1

    .line 31
    :cond_1
    new-instance v1, Lfh/k;

    .line 32
    .line 33
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 34
    .line 35
    .line 36
    const-string v5, "getView"

    .line 37
    .line 38
    const-string v6, "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter"

    .line 39
    .line 40
    filled-new-array {v5, v6}, [Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    invoke-virtual {v1, v5}, Lfh/k;->r0([Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    new-instance v6, Lc0/f;

    .line 48
    .line 49
    const-class v5, Lha/z;

    .line 50
    .line 51
    invoke-static {v5}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    move-result-object v9

    .line 55
    const/4 v13, 0x0

    .line 56
    const/16 v14, 0x15

    .line 57
    .line 58
    const/4 v7, 0x1

    .line 59
    const-string v10, "isProfileListBindMethod"

    .line 60
    .line 61
    const-string v11, "isProfileListBindMethod(Ljava/lang/reflect/Method;)Z"

    .line 62
    .line 63
    const/4 v12, 0x0

    .line 64
    move-object v8, p0

    .line 65
    invoke-direct/range {v6 .. v14}, Lc0/f;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0, v1, v6}, Lha/z;->c(Lfh/k;Lfg/l;)Ljava/lang/reflect/Method;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    if-eqz v1, :cond_2

    .line 73
    .line 74
    invoke-static {v2, v0, v3, v1}, Le8/b;->h(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 75
    .line 76
    .line 77
    return-object v1

    .line 78
    :cond_2
    invoke-static {v2, v0, v3}, Le8/b;->a(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    iget-object v0, v8, Lha/z;->b:Lab/b;

    .line 82
    .line 83
    const-string v2, "\u670b\u53cb\u5708\u5173\u952e\u8bcd\u5c4f\u853d\u672a\u627e\u5230\u4e2a\u4eba\u4e3b\u9875\u5217\u8868\u7ed1\u5b9a\u65b9\u6cd5"

    .line 84
    .line 85
    invoke-virtual {v0, v2, v4}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    return-object v1
.end method

.method public final o()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lha/z;->a:Lr8/g;

    .line 2
    .line 3
    iget-object v1, v0, Lr8/g;->a:Landroid/content/Context;

    .line 4
    .line 5
    iget-object v0, v0, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {v1, v0}, Lo8/k;->a(Landroid/content/Context;Ljava/lang/ClassLoader;)Ll8/i;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v0, v0, Ll8/i;->h:Ljava/lang/String;

    .line 15
    .line 16
    return-object v0
.end method

.method public final p(Ljava/lang/Class;)Lha/x;
    .locals 14

    .line 1
    iget-object v0, p0, Lha/z;->i:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Lha/x;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    return-object v1

    .line 12
    :cond_0
    iget-object v1, p0, Lha/z;->j:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 13
    .line 14
    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->contains(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    return-object p1

    .line 22
    :cond_1
    invoke-static {p1}, Lha/z;->e(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-static {}, La/a;->E()Luf/c;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    new-instance v4, Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    :cond_2
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v6

    .line 43
    const-string v7, "com.tencent.mm.plugin.sns.storage.SnsInfo"

    .line 44
    .line 45
    iget-object v8, p0, Lha/z;->k:Lsf/i;

    .line 46
    .line 47
    const/4 v9, 0x0

    .line 48
    const/4 v10, 0x1

    .line 49
    if-eqz v6, :cond_5

    .line 50
    .line 51
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    move-object v11, v6

    .line 56
    check-cast v11, Ljava/lang/reflect/Method;

    .line 57
    .line 58
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    move-result-object v11

    .line 62
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v8}, Lsf/i;->getValue()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v8

    .line 69
    check-cast v8, Ljava/lang/Class;

    .line 70
    .line 71
    if-eqz v8, :cond_3

    .line 72
    .line 73
    invoke-virtual {v8, v11}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 74
    .line 75
    .line 76
    move-result v8

    .line 77
    if-ne v8, v10, :cond_3

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_3
    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v8

    .line 84
    invoke-virtual {v8, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v7

    .line 88
    if-eqz v7, :cond_4

    .line 89
    .line 90
    :goto_1
    move v9, v10

    .line 91
    :cond_4
    if-eqz v9, :cond_2

    .line 92
    .line 93
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_5
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 102
    .line 103
    .line 104
    move-result v5

    .line 105
    if-eqz v5, :cond_6

    .line 106
    .line 107
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    check-cast v5, Ljava/lang/reflect/Method;

    .line 112
    .line 113
    new-instance v6, Lha/x;

    .line 114
    .line 115
    invoke-static {v5}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 116
    .line 117
    .line 118
    move-result-object v5

    .line 119
    invoke-direct {v6, v5}, Lha/x;-><init>(Ljava/util/List;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v3, v6}, Luf/c;->add(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_6
    new-instance v4, Ldg/n;

    .line 127
    .line 128
    const/4 v5, 0x6

    .line 129
    invoke-direct {v4, v2, v5}, Ldg/n;-><init>(Ljava/lang/Object;I)V

    .line 130
    .line 131
    .line 132
    new-instance v2, Lha/q;

    .line 133
    .line 134
    const/4 v5, 0x2

    .line 135
    invoke-direct {v2, p1, v5}, Lha/q;-><init>(Ljava/lang/Class;I)V

    .line 136
    .line 137
    .line 138
    new-instance v5, Lng/i;

    .line 139
    .line 140
    invoke-direct {v5, v4, v10, v2}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 141
    .line 142
    .line 143
    new-instance v2, Lng/h;

    .line 144
    .line 145
    invoke-direct {v2, v5}, Lng/h;-><init>(Lng/i;)V

    .line 146
    .line 147
    .line 148
    :cond_7
    invoke-virtual {v2}, Lng/h;->hasNext()Z

    .line 149
    .line 150
    .line 151
    move-result v4

    .line 152
    if-eqz v4, :cond_c

    .line 153
    .line 154
    invoke-virtual {v2}, Lng/h;->next()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v4

    .line 158
    check-cast v4, Ljava/lang/reflect/Method;

    .line 159
    .line 160
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    move-result-object v5

    .line 164
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    invoke-static {v5}, Lha/z;->e(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 168
    .line 169
    .line 170
    move-result-object v5

    .line 171
    new-instance v6, Ljava/util/ArrayList;

    .line 172
    .line 173
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 177
    .line 178
    .line 179
    move-result-object v5

    .line 180
    :cond_8
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 181
    .line 182
    .line 183
    move-result v11

    .line 184
    if-eqz v11, :cond_b

    .line 185
    .line 186
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v11

    .line 190
    move-object v12, v11

    .line 191
    check-cast v12, Ljava/lang/reflect/Method;

    .line 192
    .line 193
    invoke-virtual {v12}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    move-result-object v12

    .line 197
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v8}, Lsf/i;->getValue()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v13

    .line 204
    check-cast v13, Ljava/lang/Class;

    .line 205
    .line 206
    if-eqz v13, :cond_9

    .line 207
    .line 208
    invoke-virtual {v13, v12}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 209
    .line 210
    .line 211
    move-result v13

    .line 212
    if-ne v13, v10, :cond_9

    .line 213
    .line 214
    goto :goto_4

    .line 215
    :cond_9
    invoke-virtual {v12}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v12

    .line 219
    invoke-virtual {v12, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    move-result v12

    .line 223
    if-eqz v12, :cond_a

    .line 224
    .line 225
    :goto_4
    move v12, v10

    .line 226
    goto :goto_5

    .line 227
    :cond_a
    move v12, v9

    .line 228
    :goto_5
    if-eqz v12, :cond_8

    .line 229
    .line 230
    invoke-virtual {v6, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    goto :goto_3

    .line 234
    :cond_b
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 235
    .line 236
    .line 237
    move-result-object v5

    .line 238
    :goto_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 239
    .line 240
    .line 241
    move-result v6

    .line 242
    if-eqz v6, :cond_7

    .line 243
    .line 244
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v6

    .line 248
    check-cast v6, Ljava/lang/reflect/Method;

    .line 249
    .line 250
    new-instance v11, Lha/x;

    .line 251
    .line 252
    filled-new-array {v4, v6}, [Ljava/lang/reflect/Method;

    .line 253
    .line 254
    .line 255
    move-result-object v6

    .line 256
    invoke-static {v6}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 257
    .line 258
    .line 259
    move-result-object v6

    .line 260
    invoke-direct {v11, v6}, Lha/x;-><init>(Ljava/util/List;)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v3, v11}, Luf/c;->add(Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    goto :goto_6

    .line 267
    :cond_c
    invoke-static {v3}, La/a;->t(Luf/c;)Luf/c;

    .line 268
    .line 269
    .line 270
    move-result-object v2

    .line 271
    new-instance v3, Ljava/util/HashSet;

    .line 272
    .line 273
    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 274
    .line 275
    .line 276
    new-instance v4, Ljava/util/ArrayList;

    .line 277
    .line 278
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v2, v9}, Luf/c;->listIterator(I)Ljava/util/ListIterator;

    .line 282
    .line 283
    .line 284
    move-result-object v2

    .line 285
    :cond_d
    :goto_7
    move-object v5, v2

    .line 286
    check-cast v5, Luf/a;

    .line 287
    .line 288
    invoke-virtual {v5}, Luf/a;->hasNext()Z

    .line 289
    .line 290
    .line 291
    move-result v6

    .line 292
    if-eqz v6, :cond_e

    .line 293
    .line 294
    invoke-virtual {v5}, Luf/a;->next()Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v5

    .line 298
    move-object v6, v5

    .line 299
    check-cast v6, Lha/x;

    .line 300
    .line 301
    iget-object v7, v6, Lha/x;->a:Ljava/util/List;

    .line 302
    .line 303
    new-instance v11, Lg0/o;

    .line 304
    .line 305
    const/4 v6, 0x7

    .line 306
    invoke-direct {v11, v6}, Lg0/o;-><init>(I)V

    .line 307
    .line 308
    .line 309
    const/16 v12, 0x1e

    .line 310
    .line 311
    const-string v8, "|"

    .line 312
    .line 313
    const/4 v9, 0x0

    .line 314
    const/4 v10, 0x0

    .line 315
    invoke-static/range {v7 .. v12}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v6

    .line 319
    invoke-virtual {v3, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 320
    .line 321
    .line 322
    move-result v6

    .line 323
    if-eqz v6, :cond_d

    .line 324
    .line 325
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    goto :goto_7

    .line 329
    :cond_e
    invoke-static {v4}, Ltf/m;->I1(Ljava/util/List;)Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object v2

    .line 333
    check-cast v2, Lha/x;

    .line 334
    .line 335
    if-eqz v2, :cond_f

    .line 336
    .line 337
    invoke-virtual {v0, p1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    return-object v2

    .line 341
    :cond_f
    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 342
    .line 343
    .line 344
    return-object v2
.end method

.method public final q(Landroid/view/View;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lha/z;->f:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lha/w;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget v1, v0, Lha/w;->a:I

    .line 12
    .line 13
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 14
    .line 15
    .line 16
    iget-object v0, v0, Lha/w;->b:Ljava/lang/Integer;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    iget v2, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eq v2, v3, :cond_0

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    iput v0, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 39
    .line 40
    invoke-virtual {p1, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 41
    .line 42
    .line 43
    :cond_0
    return-void
.end method

.method public final r(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Lha/z;->b()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    return v2

    .line 13
    :cond_0
    invoke-static {p1}, Lr9/e0;->L(Ljava/lang/Object;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_3

    .line 22
    .line 23
    check-cast v0, Ljava/lang/Iterable;

    .line 24
    .line 25
    instance-of v1, v0, Ljava/util/Collection;

    .line 26
    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    move-object v1, v0

    .line 30
    check-cast v1, Ljava/util/Collection;

    .line 31
    .line 32
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_3

    .line 48
    .line 49
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    check-cast v1, Ljava/lang/String;

    .line 54
    .line 55
    const/4 v3, 0x1

    .line 56
    invoke-static {p1, v1, v3}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-eqz v1, :cond_2

    .line 69
    .line 70
    return v3

    .line 71
    :cond_3
    :goto_0
    return v2
.end method
