.class public final Lj8/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Lj8/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lj8/a;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lj8/a;->a:Lj8/a;

    .line 7
    .line 8
    return-void
.end method

.method public static a(Lr8/g;Ljava/lang/String;Lfg/l;)Ljava/util/ArrayList;
    .locals 2

    .line 1
    iget-object v0, p0, Lr8/g;->a:Landroid/content/Context;

    .line 2
    .line 3
    const-string v1, "Hchat_favorite_menu_method_cache"

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
    iget-object p0, p0, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 12
    .line 13
    invoke-static {v1, p0}, Le8/b;->g(Landroid/content/Context;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-static {v0, v1, p0, p1}, Le8/b;->f(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    new-instance p1, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-interface {p2, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    check-cast v1, Ljava/lang/Boolean;

    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_0

    .line 51
    .line 52
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    new-instance p0, Ljava/util/HashSet;

    .line 57
    .line 58
    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 59
    .line 60
    .line 61
    new-instance p2, Ljava/util/ArrayList;

    .line 62
    .line 63
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-eqz v0, :cond_3

    .line 75
    .line 76
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    move-object v1, v0

    .line 81
    check-cast v1, Ljava/lang/reflect/Method;

    .line 82
    .line 83
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-virtual {p0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-eqz v1, :cond_2

    .line 92
    .line 93
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_3
    return-object p2
.end method

.method public static b(Lr8/g;Lfh/k;Ljava/lang/String;Lfg/p;)Ljava/util/List;
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
    goto :goto_3

    .line 65
    :cond_2
    new-instance p0, Ljava/util/HashSet;

    .line 66
    .line 67
    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 68
    .line 69
    .line 70
    new-instance p1, Ljava/util/ArrayList;

    .line 71
    .line 72
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    :cond_3
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-eqz v1, :cond_4

    .line 84
    .line 85
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    move-object v2, v1

    .line 90
    check-cast v2, Ljava/lang/reflect/Method;

    .line 91
    .line 92
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    invoke-virtual {p0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    if-eqz v2, :cond_3

    .line 101
    .line 102
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 103
    .line 104
    .line 105
    goto :goto_2

    .line 106
    :goto_3
    new-instance p1, Lsf/f;

    .line 107
    .line 108
    invoke-direct {p1, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 109
    .line 110
    .line 111
    :cond_4
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    if-eqz p0, :cond_5

    .line 116
    .line 117
    invoke-interface {p3, p2, p0}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    :cond_5
    instance-of p0, p1, Lsf/f;

    .line 121
    .line 122
    if-eqz p0, :cond_6

    .line 123
    .line 124
    sget-object p1, Ltf/t;->g:Ltf/t;

    .line 125
    .line 126
    :cond_6
    check-cast p1, Ljava/util/List;

    .line 127
    .line 128
    return-object p1
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
    array-length v1, v0

    .line 19
    const/4 v3, 0x2

    .line 20
    if-ne v1, v3, :cond_0

    .line 21
    .line 22
    const-class v1, Landroid/view/MenuItem;

    .line 23
    .line 24
    aget-object v0, v0, v2

    .line 25
    .line 26
    invoke-virtual {v1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    const-string v0, "com.tencent.mm.plugin.fav.ui."

    .line 33
    .line 34
    invoke-static {p0, v2, v0}, Leh/a;->A(Ljava/lang/reflect/Method;ZLjava/lang/String;)Z

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    if-eqz p0, :cond_0

    .line 39
    .line 40
    const/4 p0, 0x1

    .line 41
    return p0

    .line 42
    :cond_0
    return v2
.end method

.method public static d(Ljava/lang/reflect/Method;)Z
    .locals 5

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
    if-eqz v1, :cond_1

    .line 17
    .line 18
    const-string v1, "com.tencent.mm.plugin.fav.ui."

    .line 19
    .line 20
    invoke-static {p0, v2, v1}, Leh/a;->A(Ljava/lang/reflect/Method;ZLjava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    array-length v1, v0

    .line 27
    const/4 v3, 0x3

    .line 28
    if-ne v1, v3, :cond_1

    .line 29
    .line 30
    const-class v1, Landroid/view/View;

    .line 31
    .line 32
    const/4 v3, 0x1

    .line 33
    aget-object v4, v0, v3

    .line 34
    .line 35
    invoke-virtual {v1, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    const-class v1, Landroid/view/ContextMenu;

    .line 42
    .line 43
    aget-object v0, v0, v2

    .line 44
    .line 45
    invoke-virtual {v1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-nez v0, :cond_0

    .line 50
    .line 51
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    const-string v0, "a"

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
    return v3

    .line 64
    :cond_1
    return v2
.end method

.method public static e(Ljava/lang/reflect/Method;)Z
    .locals 4

    .line 1
    invoke-static {p0}, Lj8/a;->d(Ljava/lang/reflect/Method;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

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
    sget-object v2, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 14
    .line 15
    invoke-static {v0, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v2, 0x0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const-string v3, "onCreateMMMenu"

    .line 27
    .line 28
    invoke-static {v0, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    array-length v0, v0

    .line 39
    if-ne v0, v1, :cond_1

    .line 40
    .line 41
    const-string v0, "com.tencent.mm.plugin.fav.ui.detail."

    .line 42
    .line 43
    invoke-static {p0, v2, v0}, Leh/a;->A(Ljava/lang/reflect/Method;ZLjava/lang/String;)Z

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    if-eqz p0, :cond_1

    .line 48
    .line 49
    :goto_0
    return v1

    .line 50
    :cond_1
    return v2
.end method

.method public static final f(Lr8/g;ZLfg/p;)Ljava/util/ArrayList;
    .locals 10

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    const-string v0, "menu_click_all_v1"

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const-string v0, "menu_click_list_v1"

    .line 10
    .line 11
    :goto_0
    new-instance v1, Lc0/f;

    .line 12
    .line 13
    const-class v2, Lj8/a;

    .line 14
    .line 15
    invoke-static {v2}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    const/4 v8, 0x0

    .line 20
    const/16 v9, 0x18

    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    sget-object v3, Lj8/a;->a:Lj8/a;

    .line 24
    .line 25
    const-string v5, "isFavoriteClickMethod"

    .line 26
    .line 27
    const-string v6, "isFavoriteClickMethod(Ljava/lang/reflect/Method;)Z"

    .line 28
    .line 29
    const/4 v7, 0x0

    .line 30
    invoke-direct/range {v1 .. v9}, Lc0/f;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 31
    .line 32
    .line 33
    invoke-static {p0, v0, v1}, Lj8/a;->a(Lr8/g;Ljava/lang/String;Lfg/l;)Ljava/util/ArrayList;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-nez v2, :cond_1

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    const/4 v1, 0x0

    .line 45
    :goto_1
    if-eqz v1, :cond_2

    .line 46
    .line 47
    return-object v1

    .line 48
    :cond_2
    new-instance v1, Lfh/k;

    .line 49
    .line 50
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 51
    .line 52
    .line 53
    new-instance v2, Lgh/c;

    .line 54
    .line 55
    const-string v3, "onMMMenuItemSelected"

    .line 56
    .line 57
    const/4 v4, 0x5

    .line 58
    invoke-direct {v2, v3, v4}, Lgh/c;-><init>(Ljava/lang/String;I)V

    .line 59
    .line 60
    .line 61
    iput-object v2, v1, Lfh/k;->g:Lgh/c;

    .line 62
    .line 63
    const-string v2, "void"

    .line 64
    .line 65
    invoke-static {v1, v2}, Lfh/k;->q0(Lfh/k;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    const-string v2, "android.view.MenuItem"

    .line 69
    .line 70
    const-string v3, "int"

    .line 71
    .line 72
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-virtual {v1, v2}, Lfh/k;->o0([Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    if-nez p1, :cond_3

    .line 80
    .line 81
    const-string p1, "do edit, long click info is %s"

    .line 82
    .line 83
    const-string v2, "do tag, long click info is %s"

    .line 84
    .line 85
    const-string v3, "do transmit, long click info is %s"

    .line 86
    .line 87
    filled-new-array {v3, p1, v2}, [Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-static {p1}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-static {v1, p1}, Lfh/k;->u0(Lfh/k;Ljava/util/Collection;)V

    .line 96
    .line 97
    .line 98
    :cond_3
    const-string p1, "\u5b9a\u4f4d\u6536\u85cf\u83dc\u5355\u70b9\u51fb\u65b9\u6cd5\u5931\u8d25"

    .line 99
    .line 100
    invoke-static {p0, v1, p1, p2}, Lj8/a;->b(Lr8/g;Lfh/k;Ljava/lang/String;Lfg/p;)Ljava/util/List;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    new-instance p2, Ljava/util/ArrayList;

    .line 105
    .line 106
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 107
    .line 108
    .line 109
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    :cond_4
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    if-eqz v1, :cond_5

    .line 118
    .line 119
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    move-object v2, v1

    .line 124
    check-cast v2, Ljava/lang/reflect/Method;

    .line 125
    .line 126
    invoke-static {v2}, Lj8/a;->c(Ljava/lang/reflect/Method;)Z

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    if-eqz v2, :cond_4

    .line 131
    .line 132
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_5
    invoke-static {p0, v0, p2}, Lj8/a;->h(Lr8/g;Ljava/lang/String;Ljava/util/List;)Ljava/util/ArrayList;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    return-object p0
.end method

.method public static final g(Lr8/g;ZLfg/p;)Ljava/util/ArrayList;
    .locals 10

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    const-string v0, "menu_create_all_v1"

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const-string v0, "menu_create_list_v1"

    .line 10
    .line 11
    :goto_0
    new-instance v1, Lc0/f;

    .line 12
    .line 13
    const-class v2, Lj8/a;

    .line 14
    .line 15
    invoke-static {v2}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    const/4 v8, 0x0

    .line 20
    const/16 v9, 0x19

    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    sget-object v3, Lj8/a;->a:Lj8/a;

    .line 24
    .line 25
    const-string v5, "isFavoriteMenuCreateMethod"

    .line 26
    .line 27
    const-string v6, "isFavoriteMenuCreateMethod(Ljava/lang/reflect/Method;)Z"

    .line 28
    .line 29
    const/4 v7, 0x0

    .line 30
    invoke-direct/range {v1 .. v9}, Lc0/f;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 31
    .line 32
    .line 33
    invoke-static {p0, v0, v1}, Lj8/a;->a(Lr8/g;Ljava/lang/String;Lfg/l;)Ljava/util/ArrayList;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-nez v2, :cond_1

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    const/4 v1, 0x0

    .line 45
    :goto_1
    if-eqz v1, :cond_2

    .line 46
    .line 47
    return-object v1

    .line 48
    :cond_2
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 49
    .line 50
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 51
    .line 52
    .line 53
    new-instance v2, Lfh/k;

    .line 54
    .line 55
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 56
    .line 57
    .line 58
    const-string v3, "OnCreateContextMMMenu"

    .line 59
    .line 60
    invoke-static {v3}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-static {v2, v3}, Lfh/k;->u0(Lfh/k;Ljava/util/Collection;)V

    .line 65
    .line 66
    .line 67
    const-string v3, "\u5b9a\u4f4d\u6536\u85cf\u5217\u8868\u83dc\u5355\u521b\u5efa\u65b9\u6cd5\u5931\u8d25"

    .line 68
    .line 69
    invoke-static {p0, v2, v3, p2}, Lj8/a;->b(Lr8/g;Lfh/k;Ljava/lang/String;Lfg/p;)Ljava/util/List;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    :cond_3
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    if-eqz v3, :cond_4

    .line 82
    .line 83
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    move-object v4, v3

    .line 88
    check-cast v4, Ljava/lang/reflect/Method;

    .line 89
    .line 90
    invoke-static {v4}, Lj8/a;->d(Ljava/lang/reflect/Method;)Z

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    if-eqz v4, :cond_3

    .line 95
    .line 96
    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_4
    if-eqz p1, :cond_8

    .line 101
    .line 102
    new-instance p1, Lfh/k;

    .line 103
    .line 104
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 105
    .line 106
    .line 107
    new-instance v2, Lgh/c;

    .line 108
    .line 109
    const-string v3, "onCreateContextMenu"

    .line 110
    .line 111
    const/4 v4, 0x5

    .line 112
    invoke-direct {v2, v3, v4}, Lgh/c;-><init>(Ljava/lang/String;I)V

    .line 113
    .line 114
    .line 115
    iput-object v2, p1, Lfh/k;->g:Lgh/c;

    .line 116
    .line 117
    const-string v2, "void"

    .line 118
    .line 119
    invoke-static {p1, v2}, Lfh/k;->q0(Lfh/k;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    const-string v3, "android.view.View"

    .line 123
    .line 124
    const-string v5, "android.view.ContextMenu$ContextMenuInfo"

    .line 125
    .line 126
    const-string v6, "android.view.ContextMenu"

    .line 127
    .line 128
    filled-new-array {v6, v3, v5}, [Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    invoke-virtual {p1, v3}, Lfh/k;->o0([Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    const-string v3, "\u5b9a\u4f4d\u6536\u85cf\u641c\u7d22\u83dc\u5355\u521b\u5efa\u65b9\u6cd5\u5931\u8d25"

    .line 136
    .line 137
    invoke-static {p0, p1, v3, p2}, Lj8/a;->b(Lr8/g;Lfh/k;Ljava/lang/String;Lfg/p;)Ljava/util/List;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    :cond_5
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 146
    .line 147
    .line 148
    move-result v3

    .line 149
    if-eqz v3, :cond_6

    .line 150
    .line 151
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    move-object v5, v3

    .line 156
    check-cast v5, Ljava/lang/reflect/Method;

    .line 157
    .line 158
    invoke-static {v5}, Lj8/a;->e(Ljava/lang/reflect/Method;)Z

    .line 159
    .line 160
    .line 161
    move-result v5

    .line 162
    if-eqz v5, :cond_5

    .line 163
    .line 164
    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    goto :goto_3

    .line 168
    :cond_6
    new-instance p1, Lfh/k;

    .line 169
    .line 170
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 171
    .line 172
    .line 173
    new-instance v3, Lgh/c;

    .line 174
    .line 175
    const-string v5, "onCreateMMMenu"

    .line 176
    .line 177
    invoke-direct {v3, v5, v4}, Lgh/c;-><init>(Ljava/lang/String;I)V

    .line 178
    .line 179
    .line 180
    iput-object v3, p1, Lfh/k;->g:Lgh/c;

    .line 181
    .line 182
    invoke-static {p1, v2}, Lfh/k;->q0(Lfh/k;Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    const-string v2, "\u5b9a\u4f4d\u6536\u85cf\u8be6\u60c5\u83dc\u5355\u521b\u5efa\u65b9\u6cd5\u5931\u8d25"

    .line 186
    .line 187
    invoke-static {p0, p1, v2, p2}, Lj8/a;->b(Lr8/g;Lfh/k;Ljava/lang/String;Lfg/p;)Ljava/util/List;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    :cond_7
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 196
    .line 197
    .line 198
    move-result p2

    .line 199
    if-eqz p2, :cond_8

    .line 200
    .line 201
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object p2

    .line 205
    move-object v2, p2

    .line 206
    check-cast v2, Ljava/lang/reflect/Method;

    .line 207
    .line 208
    invoke-static {v2}, Lj8/a;->e(Ljava/lang/reflect/Method;)Z

    .line 209
    .line 210
    .line 211
    move-result v2

    .line 212
    if-eqz v2, :cond_7

    .line 213
    .line 214
    invoke-interface {v1, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    goto :goto_4

    .line 218
    :cond_8
    invoke-static {v1}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    invoke-static {p0, v0, p1}, Lj8/a;->h(Lr8/g;Ljava/lang/String;Ljava/util/List;)Ljava/util/ArrayList;

    .line 223
    .line 224
    .line 225
    move-result-object p0

    .line 226
    return-object p0
.end method

.method public static h(Lr8/g;Ljava/lang/String;Ljava/util/List;)Ljava/util/ArrayList;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    move-object v3, v2

    .line 26
    check-cast v3, Ljava/lang/reflect/Method;

    .line 27
    .line 28
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-virtual {v0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_0

    .line 37
    .line 38
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    iget-object p2, p0, Lr8/g;->a:Landroid/content/Context;

    .line 43
    .line 44
    const-string v0, "Hchat_favorite_menu_method_cache"

    .line 45
    .line 46
    invoke-static {p2, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    iget-object v0, p0, Lr8/g;->a:Landroid/content/Context;

    .line 51
    .line 52
    iget-object p0, p0, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 53
    .line 54
    invoke-static {v0, p0}, Le8/b;->g(Landroid/content/Context;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_2

    .line 63
    .line 64
    invoke-static {p2, p0, p1}, Le8/b;->a(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    return-object v1

    .line 68
    :cond_2
    sget-object v0, Le8/b;->a:Le8/b;

    .line 69
    .line 70
    invoke-virtual {v0, p2, p0, p1, v1}, Le8/b;->j(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 71
    .line 72
    .line 73
    return-object v1
.end method
