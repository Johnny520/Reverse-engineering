.class public final Lu9/h;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/lang/ClassLoader;

.field public c:Lfg/a;

.field public final d:Lgg/j;

.field public final e:Landroid/content/SharedPreferences;

.field public final f:Landroid/content/SharedPreferences;

.field public final g:Ljava/util/Map;

.field public final h:Ljava/util/Map;

.field public final i:Ljava/util/Map;

.field public final j:Ljava/util/Map;

.field public final k:Lsf/i;

.field public final l:Lsf/i;

.field public final m:Lsf/i;

.field public volatile n:Z

.field public volatile o:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/ClassLoader;Lc9/f;Lfg/p;)V
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
    iput-object p1, p0, Lu9/h;->a:Landroid/content/Context;

    .line 8
    .line 9
    iput-object p2, p0, Lu9/h;->b:Ljava/lang/ClassLoader;

    .line 10
    .line 11
    iput-object p3, p0, Lu9/h;->c:Lfg/a;

    .line 12
    .line 13
    check-cast p4, Lgg/j;

    .line 14
    .line 15
    iput-object p4, p0, Lu9/h;->d:Lgg/j;

    .line 16
    .line 17
    const-string p2, "Hchat_hide_wechat_bottom_bar_config"

    .line 18
    .line 19
    invoke-static {p1, p2}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    iput-object p2, p0, Lu9/h;->e:Landroid/content/SharedPreferences;

    .line 24
    .line 25
    const-string p3, "Hchat_hide_wechat_bottom_bar_method_cache"

    .line 26
    .line 27
    invoke-static {p1, p3}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iput-object p1, p0, Lu9/h;->f:Landroid/content/SharedPreferences;

    .line 32
    .line 33
    invoke-static {}, Lp/a;->p()Ljava/util/Map;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iput-object p1, p0, Lu9/h;->g:Ljava/util/Map;

    .line 38
    .line 39
    invoke-static {}, Lp/a;->p()Ljava/util/Map;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    iput-object p1, p0, Lu9/h;->h:Ljava/util/Map;

    .line 44
    .line 45
    invoke-static {}, Lp/a;->p()Ljava/util/Map;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    iput-object p1, p0, Lu9/h;->i:Ljava/util/Map;

    .line 50
    .line 51
    invoke-static {}, Lp/a;->p()Ljava/util/Map;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    iput-object p1, p0, Lu9/h;->j:Ljava/util/Map;

    .line 56
    .line 57
    new-instance p1, Lu9/d;

    .line 58
    .line 59
    const/4 p3, 0x0

    .line 60
    invoke-direct {p1, p0, p3}, Lu9/d;-><init>(Lu9/h;I)V

    .line 61
    .line 62
    .line 63
    new-instance p3, Lsf/i;

    .line 64
    .line 65
    invoke-direct {p3, p1}, Lsf/i;-><init>(Lfg/a;)V

    .line 66
    .line 67
    .line 68
    iput-object p3, p0, Lu9/h;->k:Lsf/i;

    .line 69
    .line 70
    new-instance p1, Lu9/d;

    .line 71
    .line 72
    const/4 p3, 0x1

    .line 73
    invoke-direct {p1, p0, p3}, Lu9/d;-><init>(Lu9/h;I)V

    .line 74
    .line 75
    .line 76
    new-instance p3, Lsf/i;

    .line 77
    .line 78
    invoke-direct {p3, p1}, Lsf/i;-><init>(Lfg/a;)V

    .line 79
    .line 80
    .line 81
    iput-object p3, p0, Lu9/h;->l:Lsf/i;

    .line 82
    .line 83
    new-instance p1, Lu9/d;

    .line 84
    .line 85
    const/4 p3, 0x2

    .line 86
    invoke-direct {p1, p0, p3}, Lu9/d;-><init>(Lu9/h;I)V

    .line 87
    .line 88
    .line 89
    new-instance p3, Lsf/i;

    .line 90
    .line 91
    invoke-direct {p3, p1}, Lsf/i;-><init>(Lfg/a;)V

    .line 92
    .line 93
    .line 94
    iput-object p3, p0, Lu9/h;->m:Lsf/i;

    .line 95
    .line 96
    new-instance p1, Lb9/b;

    .line 97
    .line 98
    const/16 p3, 0xa

    .line 99
    .line 100
    invoke-direct {p1, p0, p3}, Lb9/b;-><init>(Ljava/lang/Object;I)V

    .line 101
    .line 102
    .line 103
    invoke-interface {p2, p1}, Landroid/content/SharedPreferences;->registerOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    .line 104
    .line 105
    .line 106
    return-void
.end method

.method public static d(Landroid/view/View;)Landroid/view/View;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "com.tencent.mm.ui.LauncherUIBottomTabView"

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 19
    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    check-cast p0, Landroid/view/ViewGroup;

    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    const/4 v1, 0x0

    .line 30
    :goto_0
    if-lt v1, v0, :cond_2

    .line 31
    .line 32
    :goto_1
    const/4 p0, 0x0

    .line 33
    return-object p0

    .line 34
    :cond_2
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-static {v2}, Lu9/h;->d(Landroid/view/View;)Landroid/view/View;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    if-eqz v2, :cond_3

    .line 46
    .line 47
    return-object v2

    .line 48
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 49
    .line 50
    goto :goto_0
.end method

.method public static i(Ljava/lang/reflect/Method;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "com.tencent.mm.ui.MainTabUI"

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 22
    .line 23
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    array-length v0, v0

    .line 37
    if-nez v0, :cond_0

    .line 38
    .line 39
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-nez v0, :cond_0

    .line 48
    .line 49
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    invoke-static {p0}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    if-nez p0, :cond_0

    .line 58
    .line 59
    const/4 p0, 0x1

    .line 60
    return p0

    .line 61
    :cond_0
    const/4 p0, 0x0

    .line 62
    return p0
.end method


# virtual methods
.method public final a(Landroid/view/View;Z)V
    .locals 5

    .line 1
    iget-object v0, p0, Lu9/h;->g:Ljava/util/Map;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    iget-object v1, p0, Lu9/h;->g:Ljava/util/Map;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    check-cast v1, Ljava/util/Map;

    .line 13
    .line 14
    sget-object v2, Lsf/n;->a:Lsf/n;

    .line 15
    .line 16
    invoke-interface {v1, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 17
    .line 18
    .line 19
    monitor-exit v0

    .line 20
    if-eqz p2, :cond_3

    .line 21
    .line 22
    iget-object p2, p0, Lu9/h;->i:Ljava/util/Map;

    .line 23
    .line 24
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    monitor-enter p2

    .line 28
    :try_start_1
    iget-object v0, p0, Lu9/h;->i:Ljava/util/Map;

    .line 29
    .line 30
    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    monitor-exit p2

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    monitor-exit p2

    .line 39
    invoke-virtual {p1}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-virtual {p2}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-nez v1, :cond_1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    new-instance v1, Lu9/e;

    .line 55
    .line 56
    invoke-direct {v1, p0, p1}, Lu9/e;-><init>(Lu9/h;Landroid/view/View;)V

    .line 57
    .line 58
    .line 59
    new-instance v2, Lf1/e;

    .line 60
    .line 61
    const/4 v3, 0x1

    .line 62
    invoke-direct {v2, p0, v3}, Lf1/e;-><init>(Ljava/lang/Object;I)V

    .line 63
    .line 64
    .line 65
    new-instance v3, Lu9/a;

    .line 66
    .line 67
    invoke-direct {v3, p2, v1, v2}, Lu9/a;-><init>(Landroid/view/View;Lu9/e;Lf1/e;)V

    .line 68
    .line 69
    .line 70
    iget-object p2, p0, Lu9/h;->i:Ljava/util/Map;

    .line 71
    .line 72
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    monitor-enter p2

    .line 76
    :try_start_2
    iget-object v4, p0, Lu9/h;->i:Ljava/util/Map;

    .line 77
    .line 78
    invoke-interface {v4, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 82
    if-eqz v4, :cond_2

    .line 83
    .line 84
    monitor-exit p2

    .line 85
    goto :goto_0

    .line 86
    :cond_2
    :try_start_3
    iget-object v4, p0, Lu9/h;->i:Ljava/util/Map;

    .line 87
    .line 88
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    check-cast v4, Ljava/util/Map;

    .line 92
    .line 93
    invoke-interface {v4, p1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 94
    .line 95
    .line 96
    monitor-exit p2

    .line 97
    invoke-virtual {p1, v2}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 101
    .line 102
    .line 103
    :goto_0
    invoke-virtual {p0, p1}, Lu9/h;->e(Landroid/view/View;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0, p1}, Lu9/h;->b(Landroid/view/View;)V

    .line 114
    .line 115
    .line 116
    return-void

    .line 117
    :catchall_0
    move-exception p1

    .line 118
    monitor-exit p2

    .line 119
    throw p1

    .line 120
    :catchall_1
    move-exception p1

    .line 121
    monitor-exit p2

    .line 122
    throw p1

    .line 123
    :cond_3
    iget-object p2, p0, Lu9/h;->h:Ljava/util/Map;

    .line 124
    .line 125
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    monitor-enter p2

    .line 129
    :try_start_4
    iget-object v0, p0, Lu9/h;->h:Ljava/util/Map;

    .line 130
    .line 131
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    check-cast v0, Ljava/lang/Integer;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 136
    .line 137
    monitor-exit p2

    .line 138
    if-eqz v0, :cond_4

    .line 139
    .line 140
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 141
    .line 142
    .line 143
    move-result p2

    .line 144
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    if-eq v0, p2, :cond_4

    .line 149
    .line 150
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 151
    .line 152
    .line 153
    :cond_4
    invoke-virtual {p1}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 154
    .line 155
    .line 156
    move-result-object p2

    .line 157
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    invoke-virtual {p0, p2}, Lu9/h;->k(Landroid/view/View;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {p0, p1}, Lu9/h;->j(Landroid/view/View;)V

    .line 164
    .line 165
    .line 166
    return-void

    .line 167
    :catchall_2
    move-exception p1

    .line 168
    monitor-exit p2

    .line 169
    throw p1

    .line 170
    :catchall_3
    move-exception p1

    .line 171
    monitor-exit v0

    .line 172
    throw p1
.end method

.method public final b(Landroid/view/View;)V
    .locals 6

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1, v0}, Lu9/h;->c(Landroid/view/View;Ljava/util/ArrayList;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_3

    .line 18
    .line 19
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Landroid/view/View;

    .line 24
    .line 25
    iget-object v1, p0, Lu9/h;->l:Lsf/i;

    .line 26
    .line 27
    invoke-virtual {v1}, Lsf/i;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Ljava/lang/reflect/Method;

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    new-array v3, v2, [Ljava/lang/Object;

    .line 35
    .line 36
    invoke-static {v1, v0, v3}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    instance-of v3, v1, Ljava/lang/Integer;

    .line 41
    .line 42
    if-eqz v3, :cond_1

    .line 43
    .line 44
    check-cast v1, Ljava/lang/Integer;

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    const/4 v1, 0x0

    .line 48
    :goto_1
    if-eqz v1, :cond_0

    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    iget-object v4, p0, Lu9/h;->j:Ljava/util/Map;

    .line 55
    .line 56
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    monitor-enter v4

    .line 60
    :try_start_0
    iget-object v5, p0, Lu9/h;->j:Ljava/util/Map;

    .line 61
    .line 62
    invoke-interface {v5, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    if-nez v5, :cond_2

    .line 67
    .line 68
    iget-object v5, p0, Lu9/h;->j:Ljava/util/Map;

    .line 69
    .line 70
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    check-cast v5, Ljava/util/Map;

    .line 74
    .line 75
    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    .line 77
    .line 78
    goto :goto_2

    .line 79
    :catchall_0
    move-exception p1

    .line 80
    goto :goto_3

    .line 81
    :cond_2
    :goto_2
    monitor-exit v4

    .line 82
    if-eqz v3, :cond_0

    .line 83
    .line 84
    iget-object v1, p0, Lu9/h;->m:Lsf/i;

    .line 85
    .line 86
    invoke-virtual {v1}, Lsf/i;->getValue()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    check-cast v1, Ljava/lang/reflect/Method;

    .line 91
    .line 92
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    invoke-static {v1, v0, v2}, Lh/Hchat/utils/KavaReflector;->invokeSuccessfully(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-eqz v1, :cond_0

    .line 105
    .line 106
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 107
    .line 108
    .line 109
    goto :goto_0

    .line 110
    :goto_3
    monitor-exit v4

    .line 111
    throw p1

    .line 112
    :cond_3
    return-void
.end method

.method public final c(Landroid/view/View;Ljava/util/ArrayList;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lu9/h;->k:Lsf/i;

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
    if-eqz v0, :cond_3

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 22
    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    check-cast p1, Landroid/view/ViewGroup;

    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    const/4 v1, 0x0

    .line 33
    :goto_0
    if-lt v1, v0, :cond_2

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_2
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, v2, p2}, Lu9/h;->c(Landroid/view/View;Ljava/util/ArrayList;)V

    .line 44
    .line 45
    .line 46
    add-int/lit8 v1, v1, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_3
    :goto_1
    return-void
.end method

.method public final e(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lu9/h;->h:Ljava/util/Map;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    iget-object v1, p0, Lu9/h;->h:Ljava/util/Map;

    .line 8
    .line 9
    invoke-interface {v1, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    iget-object v1, p0, Lu9/h;->h:Ljava/util/Map;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    check-cast v1, Ljava/util/Map;

    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-interface {v1, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception p1

    .line 35
    goto :goto_1

    .line 36
    :cond_0
    :goto_0
    monitor-exit v0

    .line 37
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    const/16 v1, 0x8

    .line 42
    .line 43
    if-eq v0, v1, :cond_1

    .line 44
    .line 45
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 46
    .line 47
    .line 48
    :cond_1
    return-void

    .line 49
    :goto_1
    monitor-exit v0

    .line 50
    throw p1
.end method

.method public final declared-synchronized f(Z)Z
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Lu9/h;->g()Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    invoke-virtual {p0, p1}, Lu9/h;->h(Z)Z

    .line 7
    .line 8
    .line 9
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    :goto_0
    monitor-exit p0

    .line 18
    return p1

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    throw p1
.end method

.method public final g()Z
    .locals 10

    .line 1
    iget-boolean v0, p0, Lu9/h;->o:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    const-string v0, "com.tencent.mm.ui.LauncherUI"

    .line 8
    .line 9
    iget-object v2, p0, Lu9/h;->b:Ljava/lang/ClassLoader;

    .line 10
    .line 11
    invoke-static {v0, v2}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/4 v2, 0x0

    .line 16
    if-eqz v0, :cond_7

    .line 17
    .line 18
    invoke-static {v0}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const/4 v3, 0x0

    .line 27
    move v4, v2

    .line 28
    move-object v5, v3

    .line 29
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v6

    .line 33
    if-eqz v6, :cond_4

    .line 34
    .line 35
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    move-object v7, v6

    .line 40
    check-cast v7, Ljava/lang/reflect/Method;

    .line 41
    .line 42
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v8

    .line 46
    const-string v9, "onResume"

    .line 47
    .line 48
    invoke-static {v8, v9}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v8

    .line 52
    if-eqz v8, :cond_2

    .line 53
    .line 54
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    move-result-object v8

    .line 58
    sget-object v9, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 59
    .line 60
    invoke-static {v8, v9}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v8

    .line 64
    if-eqz v8, :cond_2

    .line 65
    .line 66
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    move-result-object v8

    .line 70
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    array-length v8, v8

    .line 74
    if-nez v8, :cond_2

    .line 75
    .line 76
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 77
    .line 78
    .line 79
    move-result v8

    .line 80
    invoke-static {v8}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 81
    .line 82
    .line 83
    move-result v8

    .line 84
    if-nez v8, :cond_2

    .line 85
    .line 86
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 87
    .line 88
    .line 89
    move-result v7

    .line 90
    invoke-static {v7}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 91
    .line 92
    .line 93
    move-result v7

    .line 94
    if-nez v7, :cond_2

    .line 95
    .line 96
    move v7, v1

    .line 97
    goto :goto_1

    .line 98
    :cond_2
    move v7, v2

    .line 99
    :goto_1
    if-eqz v7, :cond_1

    .line 100
    .line 101
    if-eqz v4, :cond_3

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_3
    move v4, v1

    .line 105
    move-object v5, v6

    .line 106
    goto :goto_0

    .line 107
    :cond_4
    if-nez v4, :cond_5

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_5
    move-object v3, v5

    .line 111
    :goto_2
    check-cast v3, Ljava/lang/reflect/Method;

    .line 112
    .line 113
    if-eqz v3, :cond_7

    .line 114
    .line 115
    :try_start_0
    sget-object v0, Lr8/i;->b:Lr8/i;

    .line 116
    .line 117
    new-instance v2, Lu9/g;

    .line 118
    .line 119
    const/4 v4, 0x0

    .line 120
    invoke-direct {v2, p0, v4}, Lu9/g;-><init>(Lu9/h;I)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0, v3, v2}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 124
    .line 125
    .line 126
    iput-boolean v1, p0, Lu9/h;->o:Z

    .line 127
    .line 128
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 129
    .line 130
    goto :goto_3

    .line 131
    :catchall_0
    move-exception v0

    .line 132
    new-instance v1, Lsf/f;

    .line 133
    .line 134
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 135
    .line 136
    .line 137
    move-object v0, v1

    .line 138
    :goto_3
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    if-nez v1, :cond_6

    .line 143
    .line 144
    goto :goto_4

    .line 145
    :cond_6
    iget-object v0, p0, Lu9/h;->d:Lgg/j;

    .line 146
    .line 147
    const-string v2, "\u5fae\u4fe1\u5e95\u680f\u6062\u590d\u5165\u53e3 Hook \u5b89\u88c5\u5931\u8d25"

    .line 148
    .line 149
    invoke-interface {v0, v2, v1}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 153
    .line 154
    :goto_4
    check-cast v0, Ljava/lang/Boolean;

    .line 155
    .line 156
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    return v0

    .line 161
    :cond_7
    return v2
.end method

.method public final h(Z)Z
    .locals 23

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-boolean v0, v1, Lu9/h;->n:Z

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v2

    .line 9
    :cond_0
    iget-object v3, v1, Lu9/h;->d:Lgg/j;

    .line 10
    .line 11
    iget-object v4, v1, Lu9/h;->f:Landroid/content/SharedPreferences;

    .line 12
    .line 13
    iget-object v0, v1, Lu9/h;->a:Landroid/content/Context;

    .line 14
    .line 15
    iget-object v5, v1, Lu9/h;->b:Ljava/lang/ClassLoader;

    .line 16
    .line 17
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v5}, Lo8/k;->a(Landroid/content/Context;Ljava/lang/ClassLoader;)Ll8/i;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-object v0, v0, Ll8/i;->h:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 27
    .line 28
    .line 29
    move-result v6

    .line 30
    const/4 v7, 0x0

    .line 31
    if-nez v6, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    move-object v0, v7

    .line 35
    :goto_0
    if-eqz v0, :cond_2

    .line 36
    .line 37
    const-string v6, "|hide_wechat_bottom_bar_v1_main_tab"

    .line 38
    .line 39
    invoke-virtual {v0, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    goto :goto_1

    .line 44
    :cond_2
    move-object v0, v7

    .line 45
    :goto_1
    const-string v6, ""

    .line 46
    .line 47
    if-nez v0, :cond_3

    .line 48
    .line 49
    move-object v8, v6

    .line 50
    goto :goto_2

    .line 51
    :cond_3
    move-object v8, v0

    .line 52
    :goto_2
    const-string v9, "main_tab_create_method"

    .line 53
    .line 54
    invoke-static {v4, v8, v5, v9}, Le8/b;->c(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    if-eqz v0, :cond_5

    .line 59
    .line 60
    invoke-static {v0}, Lu9/h;->i(Ljava/lang/reflect/Method;)Z

    .line 61
    .line 62
    .line 63
    move-result v11

    .line 64
    if-eqz v11, :cond_4

    .line 65
    .line 66
    move-object v7, v0

    .line 67
    const/16 v16, 0x0

    .line 68
    .line 69
    goto/16 :goto_e

    .line 70
    .line 71
    :cond_4
    invoke-static {v4, v8, v9}, Le8/b;->a(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    :cond_5
    const-string v0, "com.tencent.mm.ui.MainTabUI"

    .line 75
    .line 76
    invoke-static {v0, v5}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    if-eqz v0, :cond_a

    .line 81
    .line 82
    invoke-static {v0}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    move-object v12, v7

    .line 91
    const/4 v11, 0x0

    .line 92
    :cond_6
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 93
    .line 94
    .line 95
    move-result v13

    .line 96
    if-eqz v13, :cond_8

    .line 97
    .line 98
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v13

    .line 102
    move-object v14, v13

    .line 103
    check-cast v14, Ljava/lang/reflect/Method;

    .line 104
    .line 105
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v15

    .line 109
    const/16 v16, 0x0

    .line 110
    .line 111
    const-string v10, "d"

    .line 112
    .line 113
    invoke-static {v15, v10}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v10

    .line 117
    if-eqz v10, :cond_6

    .line 118
    .line 119
    invoke-static {v14}, Lu9/h;->i(Ljava/lang/reflect/Method;)Z

    .line 120
    .line 121
    .line 122
    move-result v10

    .line 123
    if-eqz v10, :cond_6

    .line 124
    .line 125
    if-eqz v11, :cond_7

    .line 126
    .line 127
    :goto_4
    move-object v12, v7

    .line 128
    goto :goto_5

    .line 129
    :cond_7
    move v11, v2

    .line 130
    move-object v12, v13

    .line 131
    goto :goto_3

    .line 132
    :cond_8
    const/16 v16, 0x0

    .line 133
    .line 134
    if-nez v11, :cond_9

    .line 135
    .line 136
    goto :goto_4

    .line 137
    :cond_9
    :goto_5
    check-cast v12, Ljava/lang/reflect/Method;

    .line 138
    .line 139
    goto :goto_6

    .line 140
    :cond_a
    const/16 v16, 0x0

    .line 141
    .line 142
    move-object v12, v7

    .line 143
    :goto_6
    if-eqz v12, :cond_b

    .line 144
    .line 145
    invoke-static {v4, v8, v9, v12}, Le8/b;->h(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 146
    .line 147
    .line 148
    move-object v7, v12

    .line 149
    goto/16 :goto_e

    .line 150
    .line 151
    :cond_b
    if-nez p1, :cond_c

    .line 152
    .line 153
    goto/16 :goto_e

    .line 154
    .line 155
    :cond_c
    iget-object v0, v1, Lu9/h;->c:Lfg/a;

    .line 156
    .line 157
    if-eqz v0, :cond_18

    .line 158
    .line 159
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    check-cast v0, Lorg/luckypray/dexkit/DexKitBridge;

    .line 164
    .line 165
    if-eqz v0, :cond_18

    .line 166
    .line 167
    :try_start_0
    new-instance v10, Lch/e;

    .line 168
    .line 169
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 170
    .line 171
    .line 172
    new-instance v11, Lfh/k;

    .line 173
    .line 174
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 175
    .line 176
    .line 177
    const-string v12, "MicroMsg.LauncherUI.MainTabUI"

    .line 178
    .line 179
    const-string v13, "doOnCreate"

    .line 180
    .line 181
    filled-new-array {v12, v13}, [Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v12

    .line 185
    invoke-virtual {v11, v12}, Lfh/k;->r0([Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    iput-object v11, v10, Lch/e;->h:Lfh/k;

    .line 189
    .line 190
    invoke-virtual {v0, v10}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    new-instance v10, Ljava/util/ArrayList;

    .line 195
    .line 196
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 200
    .line 201
    .line 202
    move-result-object v11

    .line 203
    :cond_d
    :goto_7
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 204
    .line 205
    .line 206
    move-result v0

    .line 207
    if-eqz v0, :cond_f

    .line 208
    .line 209
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    check-cast v0, Lhh/o;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 214
    .line 215
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v0}, Lhh/o;->p()Llh/d;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    invoke-virtual {v0, v5}, Llh/d;->b(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 223
    .line 224
    .line 225
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 226
    goto :goto_8

    .line 227
    :catchall_0
    move-exception v0

    .line 228
    :try_start_2
    new-instance v12, Lsf/f;

    .line 229
    .line 230
    invoke-direct {v12, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 231
    .line 232
    .line 233
    move-object v0, v12

    .line 234
    :goto_8
    nop

    .line 235
    instance-of v12, v0, Lsf/f;

    .line 236
    .line 237
    if-eqz v12, :cond_e

    .line 238
    .line 239
    move-object v0, v7

    .line 240
    :cond_e
    check-cast v0, Ljava/lang/reflect/Method;

    .line 241
    .line 242
    if-eqz v0, :cond_d

    .line 243
    .line 244
    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 245
    .line 246
    .line 247
    goto :goto_7

    .line 248
    :catchall_1
    move-exception v0

    .line 249
    goto :goto_b

    .line 250
    :cond_f
    new-instance v0, Ljava/util/ArrayList;

    .line 251
    .line 252
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 256
    .line 257
    .line 258
    move-result-object v5

    .line 259
    :cond_10
    :goto_9
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 260
    .line 261
    .line 262
    move-result v10

    .line 263
    if-eqz v10, :cond_11

    .line 264
    .line 265
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v10

    .line 269
    move-object v11, v10

    .line 270
    check-cast v11, Ljava/lang/reflect/Method;

    .line 271
    .line 272
    invoke-static {v11}, Lu9/h;->i(Ljava/lang/reflect/Method;)Z

    .line 273
    .line 274
    .line 275
    move-result v11

    .line 276
    if-eqz v11, :cond_10

    .line 277
    .line 278
    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 279
    .line 280
    .line 281
    goto :goto_9

    .line 282
    :cond_11
    new-instance v5, Ljava/util/HashSet;

    .line 283
    .line 284
    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    .line 285
    .line 286
    .line 287
    new-instance v10, Ljava/util/ArrayList;

    .line 288
    .line 289
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    :cond_12
    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 297
    .line 298
    .line 299
    move-result v11

    .line 300
    if-eqz v11, :cond_13

    .line 301
    .line 302
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v11

    .line 306
    move-object v12, v11

    .line 307
    check-cast v12, Ljava/lang/reflect/Method;

    .line 308
    .line 309
    invoke-virtual {v12}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v12

    .line 313
    invoke-virtual {v5, v12}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 314
    .line 315
    .line 316
    move-result v12

    .line 317
    if-eqz v12, :cond_12

    .line 318
    .line 319
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 320
    .line 321
    .line 322
    goto :goto_a

    .line 323
    :goto_b
    new-instance v10, Lsf/f;

    .line 324
    .line 325
    invoke-direct {v10, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 326
    .line 327
    .line 328
    :cond_13
    invoke-static {v10}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    if-nez v0, :cond_14

    .line 333
    .line 334
    goto :goto_c

    .line 335
    :cond_14
    const-string v5, "\u5b9a\u4f4d\u5fae\u4fe1\u5e95\u680f\u521b\u5efa\u5165\u53e3\u5931\u8d25"

    .line 336
    .line 337
    invoke-interface {v3, v5, v0}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    sget-object v10, Ltf/t;->g:Ltf/t;

    .line 341
    .line 342
    :goto_c
    move-object/from16 v17, v10

    .line 343
    .line 344
    check-cast v17, Ljava/util/List;

    .line 345
    .line 346
    invoke-static/range {v17 .. v17}, Ltf/m;->I1(Ljava/util/List;)Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    check-cast v0, Ljava/lang/reflect/Method;

    .line 351
    .line 352
    if-eqz v0, :cond_15

    .line 353
    .line 354
    invoke-static {v4, v8, v9, v0}, Le8/b;->h(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 355
    .line 356
    .line 357
    goto :goto_d

    .line 358
    :cond_15
    const-string v5, "cache.key"

    .line 359
    .line 360
    :try_start_3
    invoke-interface {v4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 361
    .line 362
    .line 363
    move-result-object v10

    .line 364
    invoke-interface {v4, v5, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object v4

    .line 368
    invoke-static {v4, v8}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 369
    .line 370
    .line 371
    move-result v4

    .line 372
    if-nez v4, :cond_16

    .line 373
    .line 374
    invoke-interface {v10}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 375
    .line 376
    .line 377
    move-result-object v4

    .line 378
    invoke-interface {v4, v5, v8}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 379
    .line 380
    .line 381
    :cond_16
    invoke-interface {v10, v9}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 382
    .line 383
    .line 384
    move-result-object v4

    .line 385
    invoke-interface {v4}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 386
    .line 387
    .line 388
    :catchall_2
    invoke-interface/range {v17 .. v17}, Ljava/util/List;->size()I

    .line 389
    .line 390
    .line 391
    move-result v4

    .line 392
    if-le v4, v2, :cond_17

    .line 393
    .line 394
    new-instance v4, Lr9/p;

    .line 395
    .line 396
    const/16 v5, 0x9

    .line 397
    .line 398
    invoke-direct {v4, v5}, Lr9/p;-><init>(I)V

    .line 399
    .line 400
    .line 401
    const/16 v22, 0x1f

    .line 402
    .line 403
    const/16 v18, 0x0

    .line 404
    .line 405
    const/16 v19, 0x0

    .line 406
    .line 407
    const/16 v20, 0x0

    .line 408
    .line 409
    move-object/from16 v21, v4

    .line 410
    .line 411
    invoke-static/range {v17 .. v22}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object v4

    .line 415
    const-string v5, "\u5fae\u4fe1\u5e95\u680f\u521b\u5efa\u5165\u53e3\u5b9a\u4f4d\u7ed3\u679c\u4e0d\u552f\u4e00: "

    .line 416
    .line 417
    invoke-virtual {v5, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 418
    .line 419
    .line 420
    move-result-object v4

    .line 421
    invoke-interface {v3, v4, v7}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 422
    .line 423
    .line 424
    :cond_17
    :goto_d
    move-object v7, v0

    .line 425
    :cond_18
    :goto_e
    if-eqz v7, :cond_1a

    .line 426
    .line 427
    :try_start_4
    sget-object v0, Lr8/i;->b:Lr8/i;

    .line 428
    .line 429
    new-instance v3, Lu9/g;

    .line 430
    .line 431
    const/4 v4, 0x1

    .line 432
    invoke-direct {v3, v1, v4}, Lu9/g;-><init>(Lu9/h;I)V

    .line 433
    .line 434
    .line 435
    invoke-virtual {v0, v7, v3}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 436
    .line 437
    .line 438
    iput-boolean v2, v1, Lu9/h;->n:Z

    .line 439
    .line 440
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 441
    .line 442
    goto :goto_f

    .line 443
    :catchall_3
    move-exception v0

    .line 444
    new-instance v2, Lsf/f;

    .line 445
    .line 446
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 447
    .line 448
    .line 449
    move-object v0, v2

    .line 450
    :goto_f
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 451
    .line 452
    .line 453
    move-result-object v2

    .line 454
    if-nez v2, :cond_19

    .line 455
    .line 456
    goto :goto_10

    .line 457
    :cond_19
    iget-object v0, v1, Lu9/h;->d:Lgg/j;

    .line 458
    .line 459
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 460
    .line 461
    .line 462
    move-result-object v3

    .line 463
    new-instance v4, Ljava/lang/StringBuilder;

    .line 464
    .line 465
    const-string v5, "\u5fae\u4fe1\u5e95\u680f\u521b\u5efa\u5165\u53e3 Hook \u5b89\u88c5\u5931\u8d25: "

    .line 466
    .line 467
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 468
    .line 469
    .line 470
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 471
    .line 472
    .line 473
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 474
    .line 475
    .line 476
    move-result-object v3

    .line 477
    invoke-interface {v0, v3, v2}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 478
    .line 479
    .line 480
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 481
    .line 482
    :goto_10
    check-cast v0, Ljava/lang/Boolean;

    .line 483
    .line 484
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 485
    .line 486
    .line 487
    move-result v0

    .line 488
    return v0

    .line 489
    :cond_1a
    return v16
.end method

.method public final j(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lu9/h;->i:Ljava/util/Map;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    iget-object v1, p0, Lu9/h;->i:Ljava/util/Map;

    .line 8
    .line 9
    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Lu9/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    monitor-exit v0

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    iget-object v0, v1, Lu9/a;->c:Lf1/e;

    .line 19
    .line 20
    invoke-virtual {p1, v0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 21
    .line 22
    .line 23
    iget-object p1, v1, Lu9/a;->a:Landroid/view/View;

    .line 24
    .line 25
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p1}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    iget-object v0, v1, Lu9/a;->b:Lu9/e;

    .line 36
    .line 37
    invoke-virtual {p1, v0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    return-void

    .line 41
    :catchall_0
    move-exception p1

    .line 42
    monitor-exit v0

    .line 43
    throw p1
.end method

.method public final k(Landroid/view/View;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lu9/h;->j:Ljava/util/Map;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    iget-object v1, p0, Lu9/h;->j:Ljava/util/Map;

    .line 8
    .line 9
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Ljava/lang/Iterable;

    .line 14
    .line 15
    new-instance v2, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_2

    .line 29
    .line 30
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    move-object v4, v3

    .line 35
    check-cast v4, Ljava/util/Map$Entry;

    .line 36
    .line 37
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    check-cast v4, Landroid/view/View;

    .line 42
    .line 43
    invoke-virtual {v4}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    if-ne v4, p1, :cond_1

    .line 48
    .line 49
    const/4 v4, 0x1

    .line 50
    goto :goto_1

    .line 51
    :cond_1
    const/4 v4, 0x0

    .line 52
    :goto_1
    if-eqz v4, :cond_0

    .line 53
    .line 54
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :catchall_0
    move-exception p1

    .line 59
    goto/16 :goto_5

    .line 60
    .line 61
    :cond_2
    new-instance p1, Ljava/util/ArrayList;

    .line 62
    .line 63
    invoke-static {v2}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-eqz v2, :cond_3

    .line 79
    .line 80
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    check-cast v2, Ljava/util/Map$Entry;

    .line 85
    .line 86
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    new-instance v4, Lsf/e;

    .line 95
    .line 96
    invoke-direct {v4, v3, v2}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_3
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    if-eqz v2, :cond_4

    .line 112
    .line 113
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    check-cast v2, Lsf/e;

    .line 118
    .line 119
    iget-object v3, p0, Lu9/h;->j:Ljava/util/Map;

    .line 120
    .line 121
    iget-object v2, v2, Lsf/e;->g:Ljava/lang/Object;

    .line 122
    .line 123
    invoke-interface {v3, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 124
    .line 125
    .line 126
    goto :goto_3

    .line 127
    :cond_4
    monitor-exit v0

    .line 128
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    :cond_5
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    if-eqz v0, :cond_6

    .line 137
    .line 138
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    check-cast v0, Lsf/e;

    .line 143
    .line 144
    iget-object v1, v0, Lsf/e;->g:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast v1, Landroid/view/View;

    .line 147
    .line 148
    iget-object v0, v0, Lsf/e;->h:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast v0, Ljava/lang/Integer;

    .line 151
    .line 152
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    iget-object v2, p0, Lu9/h;->m:Lsf/i;

    .line 159
    .line 160
    invoke-virtual {v2}, Lsf/i;->getValue()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    check-cast v2, Ljava/lang/reflect/Method;

    .line 165
    .line 166
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    invoke-static {v2, v1, v0}, Lh/Hchat/utils/KavaReflector;->invokeSuccessfully(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    if-eqz v0, :cond_5

    .line 175
    .line 176
    invoke-virtual {v1}, Landroid/view/View;->invalidate()V

    .line 177
    .line 178
    .line 179
    goto :goto_4

    .line 180
    :cond_6
    return-void

    .line 181
    :goto_5
    monitor-exit v0

    .line 182
    throw p1
.end method
