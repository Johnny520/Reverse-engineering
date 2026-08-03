.class public final Lxa/n;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Lxa/n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lxa/n;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lxa/n;->a:Lxa/n;

    .line 7
    .line 8
    return-void
.end method

.method public static a(Lr8/g;Lfh/k;Lfg/l;Lia/t;)Ljava/util/List;
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lr8/g;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 2
    .line 3
    new-instance v1, Lch/e;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p1, v1, Lch/e;->h:Lfh/k;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    new-instance v0, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, Lhh/o;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 34
    .line 35
    :try_start_1
    iget-object v2, p0, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 36
    .line 37
    invoke-virtual {v1, v2}, Lhh/o;->r(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 38
    .line 39
    .line 40
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 41
    goto :goto_1

    .line 42
    :catchall_0
    move-exception v1

    .line 43
    :try_start_2
    new-instance v2, Lsf/f;

    .line 44
    .line 45
    invoke-direct {v2, v1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 46
    .line 47
    .line 48
    move-object v1, v2

    .line 49
    :goto_1
    nop

    .line 50
    instance-of v2, v1, Lsf/f;

    .line 51
    .line 52
    if-eqz v2, :cond_1

    .line 53
    .line 54
    const/4 v1, 0x0

    .line 55
    :cond_1
    check-cast v1, Ljava/lang/reflect/Method;

    .line 56
    .line 57
    if-eqz v1, :cond_0

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :catchall_1
    move-exception p0

    .line 64
    goto :goto_4

    .line 65
    :cond_2
    new-instance p0, Ljava/util/ArrayList;

    .line 66
    .line 67
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    :cond_3
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_4

    .line 79
    .line 80
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-interface {p2, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    check-cast v1, Ljava/lang/Boolean;

    .line 89
    .line 90
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    if-eqz v1, :cond_3

    .line 95
    .line 96
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_4
    new-instance p1, Ljava/util/HashSet;

    .line 101
    .line 102
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 103
    .line 104
    .line 105
    new-instance p2, Ljava/util/ArrayList;

    .line 106
    .line 107
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    :cond_5
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-eqz v0, :cond_6

    .line 119
    .line 120
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    move-object v1, v0

    .line 125
    check-cast v1, Ljava/lang/reflect/Method;

    .line 126
    .line 127
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    invoke-virtual {p1, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    if-eqz v1, :cond_5

    .line 136
    .line 137
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 138
    .line 139
    .line 140
    goto :goto_3

    .line 141
    :goto_4
    new-instance p2, Lsf/f;

    .line 142
    .line 143
    invoke-direct {p2, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 144
    .line 145
    .line 146
    :cond_6
    invoke-static {p2}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    if-eqz p0, :cond_7

    .line 151
    .line 152
    const-string p1, "\u5b9a\u4f4d\u670b\u53cb\u5708\u5934\u50cf\u957f\u6309\u83dc\u5355\u65b9\u6cd5\u5931\u8d25"

    .line 153
    .line 154
    invoke-virtual {p3, p1, p0}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    :cond_7
    instance-of p0, p2, Lsf/f;

    .line 158
    .line 159
    if-eqz p0, :cond_8

    .line 160
    .line 161
    sget-object p2, Ltf/t;->g:Ltf/t;

    .line 162
    .line 163
    :cond_8
    check-cast p2, Ljava/util/List;

    .line 164
    .line 165
    return-object p2
.end method

.method public static b(Ljava/lang/reflect/Method;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p0}, Lxa/n;->d(Ljava/lang/reflect/Method;)Z

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
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    sget-object v3, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 17
    .line 18
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-nez v1, :cond_0

    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 29
    .line 30
    invoke-static {p0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-eqz p0, :cond_1

    .line 35
    .line 36
    :cond_0
    array-length p0, v0

    .line 37
    const/4 v1, 0x2

    .line 38
    if-ne p0, v1, :cond_1

    .line 39
    .line 40
    const-class p0, Landroid/view/MenuItem;

    .line 41
    .line 42
    aget-object v1, v0, v2

    .line 43
    .line 44
    invoke-virtual {p0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    if-eqz p0, :cond_1

    .line 49
    .line 50
    const/4 p0, 0x1

    .line 51
    aget-object v0, v0, p0

    .line 52
    .line 53
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 54
    .line 55
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_1

    .line 60
    .line 61
    return p0

    .line 62
    :cond_1
    return v2
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
    invoke-static {p0}, Lxa/n;->d(Ljava/lang/reflect/Method;)Z

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
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 17
    .line 18
    invoke-static {p0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    array-length p0, v0

    .line 25
    const/4 v1, 0x3

    .line 26
    if-ne p0, v1, :cond_0

    .line 27
    .line 28
    const-class p0, Landroid/view/ContextMenu;

    .line 29
    .line 30
    aget-object v1, v0, v2

    .line 31
    .line 32
    invoke-virtual {p0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    if-eqz p0, :cond_0

    .line 37
    .line 38
    const-class p0, Landroid/view/View;

    .line 39
    .line 40
    const/4 v1, 0x1

    .line 41
    aget-object v3, v0, v1

    .line 42
    .line 43
    invoke-virtual {p0, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    if-eqz p0, :cond_0

    .line 48
    .line 49
    const/4 p0, 0x2

    .line 50
    aget-object p0, v0, p0

    .line 51
    .line 52
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    const-string v0, "android.view.ContextMenu$ContextMenuInfo"

    .line 57
    .line 58
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    if-eqz p0, :cond_0

    .line 63
    .line 64
    return v1

    .line 65
    :cond_0
    return v2
.end method

.method public static d(Ljava/lang/reflect/Method;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getModifiers()I

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
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0}, Ljava/lang/Class;->isInterface()Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-nez p0, :cond_0

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


# virtual methods
.method public final e(Lr8/g;Lia/t;)Lxa/o;
    .locals 27

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v2, v0, Lr8/g;->a:Landroid/content/Context;

    .line 9
    .line 10
    const-string v3, "Hchat_sns_avatar_menu_method_cache"

    .line 11
    .line 12
    invoke-static {v2, v3}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    iget-object v4, v0, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 17
    .line 18
    invoke-static {v2, v4}, Le8/b;->g(Landroid/content/Context;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    const-string v5, "avatar_menu_create_v2"

    .line 23
    .line 24
    invoke-static {v3, v2, v4, v5}, Le8/b;->f(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v6

    .line 28
    new-instance v7, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    :cond_0
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v8

    .line 41
    if-eqz v8, :cond_1

    .line 42
    .line 43
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v8

    .line 47
    move-object v9, v8

    .line 48
    check-cast v9, Ljava/lang/reflect/Method;

    .line 49
    .line 50
    invoke-static {v9}, Lxa/n;->c(Ljava/lang/reflect/Method;)Z

    .line 51
    .line 52
    .line 53
    move-result v9

    .line 54
    if-eqz v9, :cond_0

    .line 55
    .line 56
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    const-string v6, "avatar_menu_click_v2"

    .line 61
    .line 62
    invoke-static {v3, v2, v4, v6}, Le8/b;->f(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    new-instance v8, Ljava/util/ArrayList;

    .line 67
    .line 68
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 69
    .line 70
    .line 71
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    :cond_2
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 76
    .line 77
    .line 78
    move-result v9

    .line 79
    if-eqz v9, :cond_3

    .line 80
    .line 81
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v9

    .line 85
    move-object v10, v9

    .line 86
    check-cast v10, Ljava/lang/reflect/Method;

    .line 87
    .line 88
    invoke-static {v10}, Lxa/n;->b(Ljava/lang/reflect/Method;)Z

    .line 89
    .line 90
    .line 91
    move-result v10

    .line 92
    if-eqz v10, :cond_2

    .line 93
    .line 94
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_3
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    if-nez v4, :cond_4

    .line 103
    .line 104
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 105
    .line 106
    .line 107
    move-result v4

    .line 108
    if-nez v4, :cond_4

    .line 109
    .line 110
    new-instance v0, Lxa/o;

    .line 111
    .line 112
    invoke-direct {v0, v8, v7}, Lxa/o;-><init>(Ljava/util/ArrayList;Ljava/util/List;)V

    .line 113
    .line 114
    .line 115
    return-object v0

    .line 116
    :cond_4
    new-instance v4, Lfh/k;

    .line 117
    .line 118
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 119
    .line 120
    .line 121
    const-string v7, "void"

    .line 122
    .line 123
    invoke-static {v4, v7}, Lfh/k;->q0(Lfh/k;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    const-string v8, "android.view.View"

    .line 127
    .line 128
    const-string v9, "android.view.ContextMenu$ContextMenuInfo"

    .line 129
    .line 130
    const-string v10, "android.view.ContextMenu"

    .line 131
    .line 132
    filled-new-array {v10, v8, v9}, [Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v8

    .line 136
    invoke-virtual {v4, v8}, Lfh/k;->o0([Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    const-string v8, "MMSocialBlackListFlag"

    .line 140
    .line 141
    const-string v9, "3552365301"

    .line 142
    .line 143
    filled-new-array {v8, v9}, [Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v8

    .line 147
    invoke-virtual {v4, v8}, Lfh/k;->r0([Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    new-instance v9, Lp8/p;

    .line 151
    .line 152
    const-class v8, Lxa/n;

    .line 153
    .line 154
    invoke-static {v8}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    move-result-object v12

    .line 158
    const/16 v16, 0x0

    .line 159
    .line 160
    const/16 v17, 0xf

    .line 161
    .line 162
    const/4 v10, 0x1

    .line 163
    const-string v13, "isCreateMethod"

    .line 164
    .line 165
    const-string v14, "isCreateMethod(Ljava/lang/reflect/Method;)Z"

    .line 166
    .line 167
    const/4 v15, 0x0

    .line 168
    move-object/from16 v11, p0

    .line 169
    .line 170
    invoke-direct/range {v9 .. v17}, Lp8/p;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 171
    .line 172
    .line 173
    invoke-static {v0, v4, v9, v1}, Lxa/n;->a(Lr8/g;Lfh/k;Lfg/l;Lia/t;)Ljava/util/List;

    .line 174
    .line 175
    .line 176
    move-result-object v4

    .line 177
    new-instance v9, Lfh/k;

    .line 178
    .line 179
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 180
    .line 181
    .line 182
    invoke-static {v9, v7}, Lfh/k;->q0(Lfh/k;Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    const-string v10, "android.view.MenuItem"

    .line 186
    .line 187
    const-string v11, "int"

    .line 188
    .line 189
    filled-new-array {v10, v11}, [Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v12

    .line 193
    invoke-virtual {v9, v12}, Lfh/k;->o0([Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    const-string v12, "sns_permission_userName"

    .line 197
    .line 198
    const-string v13, "clicfg_sns_expose_config_switch_android"

    .line 199
    .line 200
    filled-new-array {v12, v13}, [Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v12

    .line 204
    invoke-virtual {v9, v12}, Lfh/k;->r0([Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    new-instance v18, Lp8/p;

    .line 208
    .line 209
    invoke-static {v8}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    move-result-object v21

    .line 213
    const/16 v25, 0x0

    .line 214
    .line 215
    const/16 v26, 0x11

    .line 216
    .line 217
    const/16 v19, 0x1

    .line 218
    .line 219
    const-string v22, "isClickMethod"

    .line 220
    .line 221
    const-string v23, "isClickMethod(Ljava/lang/reflect/Method;)Z"

    .line 222
    .line 223
    const/16 v24, 0x0

    .line 224
    .line 225
    move-object/from16 v20, p0

    .line 226
    .line 227
    invoke-direct/range {v18 .. v26}, Lp8/p;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 228
    .line 229
    .line 230
    move-object/from16 v12, v18

    .line 231
    .line 232
    invoke-static {v0, v9, v12, v1}, Lxa/n;->a(Lr8/g;Lfh/k;Lfg/l;Lia/t;)Ljava/util/List;

    .line 233
    .line 234
    .line 235
    move-result-object v9

    .line 236
    new-instance v12, Lfh/k;

    .line 237
    .line 238
    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    .line 239
    .line 240
    .line 241
    const-string v13, "boolean"

    .line 242
    .line 243
    invoke-static {v12, v13}, Lfh/k;->q0(Lfh/k;Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    filled-new-array {v10, v11}, [Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v13

    .line 250
    invoke-virtual {v12, v13}, Lfh/k;->o0([Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    const-string v13, "click AVATER_MENU_ID_PERMISSION"

    .line 254
    .line 255
    const-string v14, "click AVATER_MENU_ID_EXPOSE"

    .line 256
    .line 257
    filled-new-array {v13, v14}, [Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v13

    .line 261
    invoke-virtual {v12, v13}, Lfh/k;->r0([Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    new-instance v18, Lp8/p;

    .line 265
    .line 266
    invoke-static {v8}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 267
    .line 268
    .line 269
    move-result-object v21

    .line 270
    const/16 v26, 0x10

    .line 271
    .line 272
    const-string v22, "isClickMethod"

    .line 273
    .line 274
    const-string v23, "isClickMethod(Ljava/lang/reflect/Method;)Z"

    .line 275
    .line 276
    invoke-direct/range {v18 .. v26}, Lp8/p;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 277
    .line 278
    .line 279
    move-object/from16 v13, v18

    .line 280
    .line 281
    invoke-static {v0, v12, v13, v1}, Lxa/n;->a(Lr8/g;Lfh/k;Lfg/l;Lia/t;)Ljava/util/List;

    .line 282
    .line 283
    .line 284
    move-result-object v12

    .line 285
    new-instance v13, Lfh/k;

    .line 286
    .line 287
    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    .line 288
    .line 289
    .line 290
    invoke-static {v13, v7}, Lfh/k;->q0(Lfh/k;Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    filled-new-array {v10, v11}, [Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v7

    .line 297
    invoke-virtual {v13, v7}, Lfh/k;->o0([Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    const-string v7, "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemClick$popPermissionMenuWindow$2"

    .line 301
    .line 302
    filled-new-array {v7}, [Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object v7

    .line 306
    invoke-virtual {v13, v7}, Lfh/k;->r0([Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    new-instance v18, Lp8/p;

    .line 310
    .line 311
    invoke-static {v8}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 312
    .line 313
    .line 314
    move-result-object v21

    .line 315
    const/16 v26, 0x12

    .line 316
    .line 317
    const-string v22, "isClickMethod"

    .line 318
    .line 319
    const-string v23, "isClickMethod(Ljava/lang/reflect/Method;)Z"

    .line 320
    .line 321
    invoke-direct/range {v18 .. v26}, Lp8/p;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 322
    .line 323
    .line 324
    move-object/from16 v7, v18

    .line 325
    .line 326
    invoke-static {v0, v13, v7, v1}, Lxa/n;->a(Lr8/g;Lfh/k;Lfg/l;Lia/t;)Ljava/util/List;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    invoke-static {v9, v12}, Ltf/m;->F1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 331
    .line 332
    .line 333
    move-result-object v1

    .line 334
    invoke-static {v1, v0}, Ltf/m;->F1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    new-instance v1, Ljava/util/HashSet;

    .line 339
    .line 340
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 341
    .line 342
    .line 343
    new-instance v7, Ljava/util/ArrayList;

    .line 344
    .line 345
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 346
    .line 347
    .line 348
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 349
    .line 350
    .line 351
    move-result-object v0

    .line 352
    :cond_5
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 353
    .line 354
    .line 355
    move-result v8

    .line 356
    if-eqz v8, :cond_6

    .line 357
    .line 358
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object v8

    .line 362
    move-object v9, v8

    .line 363
    check-cast v9, Ljava/lang/reflect/Method;

    .line 364
    .line 365
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object v9

    .line 369
    invoke-virtual {v1, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 370
    .line 371
    .line 372
    move-result v9

    .line 373
    if-eqz v9, :cond_5

    .line 374
    .line 375
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 376
    .line 377
    .line 378
    goto :goto_2

    .line 379
    :cond_6
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 380
    .line 381
    .line 382
    move-result v0

    .line 383
    const-string v1, ""

    .line 384
    .line 385
    const-string v8, "cache.key"

    .line 386
    .line 387
    sget-object v9, Le8/b;->a:Le8/b;

    .line 388
    .line 389
    if-nez v0, :cond_7

    .line 390
    .line 391
    invoke-virtual {v9, v3, v2, v5, v4}, Le8/b;->j(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 392
    .line 393
    .line 394
    goto :goto_3

    .line 395
    :cond_7
    :try_start_0
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 396
    .line 397
    .line 398
    move-result-object v0

    .line 399
    invoke-interface {v3, v8, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object v10

    .line 403
    invoke-static {v10, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 404
    .line 405
    .line 406
    move-result v10

    .line 407
    if-nez v10, :cond_8

    .line 408
    .line 409
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 410
    .line 411
    .line 412
    move-result-object v10

    .line 413
    invoke-interface {v10, v8, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 414
    .line 415
    .line 416
    :cond_8
    invoke-interface {v0, v5}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 417
    .line 418
    .line 419
    move-result-object v0

    .line 420
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 421
    .line 422
    .line 423
    :catchall_0
    :goto_3
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 424
    .line 425
    .line 426
    move-result v0

    .line 427
    if-nez v0, :cond_9

    .line 428
    .line 429
    invoke-virtual {v9, v3, v2, v6, v7}, Le8/b;->j(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 430
    .line 431
    .line 432
    goto :goto_4

    .line 433
    :cond_9
    :try_start_1
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 434
    .line 435
    .line 436
    move-result-object v0

    .line 437
    invoke-interface {v3, v8, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 438
    .line 439
    .line 440
    move-result-object v1

    .line 441
    invoke-static {v1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 442
    .line 443
    .line 444
    move-result v1

    .line 445
    if-nez v1, :cond_a

    .line 446
    .line 447
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 448
    .line 449
    .line 450
    move-result-object v1

    .line 451
    invoke-interface {v1, v8, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 452
    .line 453
    .line 454
    :cond_a
    invoke-interface {v0, v6}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 455
    .line 456
    .line 457
    move-result-object v0

    .line 458
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 459
    .line 460
    .line 461
    :catchall_1
    :goto_4
    new-instance v0, Lxa/o;

    .line 462
    .line 463
    invoke-direct {v0, v7, v4}, Lxa/o;-><init>(Ljava/util/ArrayList;Ljava/util/List;)V

    .line 464
    .line 465
    .line 466
    return-object v0
.end method
