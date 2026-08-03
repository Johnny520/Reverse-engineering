.class public final Lqb/k;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lr8/g;

.field public final b:Lia/t;

.field public final c:Landroid/content/SharedPreferences;

.field public final d:Landroid/content/SharedPreferences;

.field public final e:Landroid/content/SharedPreferences;

.field public final f:Ljava/util/Set;

.field public final g:Ljava/util/concurrent/ConcurrentHashMap;

.field public final h:Ljava/util/concurrent/ConcurrentHashMap;

.field public final i:Ljava/util/concurrent/ConcurrentHashMap;

.field public final j:Ljava/util/concurrent/ConcurrentHashMap;

.field public final k:Ljava/util/concurrent/ConcurrentHashMap;

.field public final l:Ljava/util/Set;

.field public final m:Ljava/util/Map;

.field public final n:Ljava/util/Map;

.field public final o:Ljava/util/Map;

.field public final p:Ljava/util/Map;

.field public final q:Ljava/util/concurrent/ExecutorService;

.field public volatile r:Lqb/f;

.field public volatile s:Ljava/lang/Object;

.field public volatile t:Lqb/i;

.field public final u:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lr8/g;Lia/t;)V
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
    iput-object p1, p0, Lqb/k;->a:Lr8/g;

    .line 8
    .line 9
    iput-object p2, p0, Lqb/k;->b:Lia/t;

    .line 10
    .line 11
    iget-object p1, p1, Lr8/g;->a:Landroid/content/Context;

    .line 12
    .line 13
    const-string p2, "Hchat_voice_forward_config"

    .line 14
    .line 15
    invoke-static {p1, p2}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    iput-object p2, p0, Lqb/k;->c:Landroid/content/SharedPreferences;

    .line 20
    .line 21
    const-string p2, "Hchat_message_forward_config"

    .line 22
    .line 23
    invoke-static {p1, p2}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    iput-object p2, p0, Lqb/k;->d:Landroid/content/SharedPreferences;

    .line 28
    .line 29
    const-string p2, "Hchat_voice_forward_method_cache"

    .line 30
    .line 31
    invoke-static {p1, p2}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iput-object p1, p0, Lqb/k;->e:Landroid/content/SharedPreferences;

    .line 36
    .line 37
    invoke-static {}, Lj8/b;->o()Ljava/util/Set;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    iput-object p1, p0, Lqb/k;->f:Ljava/util/Set;

    .line 42
    .line 43
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 44
    .line 45
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 46
    .line 47
    .line 48
    iput-object p1, p0, Lqb/k;->g:Ljava/util/concurrent/ConcurrentHashMap;

    .line 49
    .line 50
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 51
    .line 52
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 53
    .line 54
    .line 55
    iput-object p1, p0, Lqb/k;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 56
    .line 57
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 58
    .line 59
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 60
    .line 61
    .line 62
    iput-object p1, p0, Lqb/k;->i:Ljava/util/concurrent/ConcurrentHashMap;

    .line 63
    .line 64
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 65
    .line 66
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 67
    .line 68
    .line 69
    iput-object p1, p0, Lqb/k;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 70
    .line 71
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 72
    .line 73
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 74
    .line 75
    .line 76
    iput-object p1, p0, Lqb/k;->k:Ljava/util/concurrent/ConcurrentHashMap;

    .line 77
    .line 78
    new-instance p1, Ljava/util/WeakHashMap;

    .line 79
    .line 80
    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    .line 81
    .line 82
    .line 83
    invoke-static {p1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    iput-object p1, p0, Lqb/k;->l:Ljava/util/Set;

    .line 88
    .line 89
    invoke-static {}, Lp/a;->p()Ljava/util/Map;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    iput-object p1, p0, Lqb/k;->m:Ljava/util/Map;

    .line 94
    .line 95
    invoke-static {}, Lp/a;->p()Ljava/util/Map;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    iput-object p1, p0, Lqb/k;->n:Ljava/util/Map;

    .line 100
    .line 101
    invoke-static {}, Lp/a;->p()Ljava/util/Map;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    iput-object p1, p0, Lqb/k;->o:Ljava/util/Map;

    .line 106
    .line 107
    invoke-static {}, Lp/a;->p()Ljava/util/Map;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    iput-object p1, p0, Lqb/k;->p:Ljava/util/Map;

    .line 112
    .line 113
    new-instance p1, Lc9/q;

    .line 114
    .line 115
    const/16 p2, 0x16

    .line 116
    .line 117
    invoke-direct {p1, p2}, Lc9/q;-><init>(I)V

    .line 118
    .line 119
    .line 120
    invoke-static {p1}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    iput-object p1, p0, Lqb/k;->q:Ljava/util/concurrent/ExecutorService;

    .line 125
    .line 126
    new-instance p1, Lk/s1;

    .line 127
    .line 128
    const/4 p2, 0x4

    .line 129
    invoke-direct {p1, p2}, Lk/s1;-><init>(I)V

    .line 130
    .line 131
    .line 132
    sget-object p2, Lsf/d;->g:Lsf/d;

    .line 133
    .line 134
    invoke-static {p2, p1}, Lbe/h;->G(Lsf/d;Lfg/a;)Lsf/c;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    iput-object p1, p0, Lqb/k;->u:Ljava/lang/Object;

    .line 139
    .line 140
    return-void
.end method

.method public static M(Lh/Hchat/hooks/api/model/WeChatContact;ZLjava/util/List;)Lqb/g;
    .locals 9

    .line 1
    if-eqz p0, :cond_3

    .line 2
    .line 3
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatContact;->wxId:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    iget-object v2, p0, Lh/Hchat/hooks/api/model/WeChatContact;->wxId:Ljava/lang/String;

    .line 13
    .line 14
    invoke-static {p0, p1}, Lr9/e0;->Z(Lh/Hchat/hooks/api/model/WeChatContact;Z)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    iget-object v5, p0, Lh/Hchat/hooks/api/model/WeChatContact;->avatarUrl:Ljava/lang/String;

    .line 19
    .line 20
    iget-object v6, p0, Lh/Hchat/hooks/api/model/WeChatContact;->avatarBackupUrl:Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {p2}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    invoke-static {p2}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object v7

    .line 30
    iget-object p2, p0, Lh/Hchat/hooks/api/model/WeChatContact;->remarkName:Ljava/lang/String;

    .line 31
    .line 32
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatContact;->nickname:Ljava/lang/String;

    .line 33
    .line 34
    iget-object p0, p0, Lh/Hchat/hooks/api/model/WeChatContact;->customWxId:Ljava/lang/String;

    .line 35
    .line 36
    filled-new-array {p2, v0, p0}, [Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-static {p0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    new-instance p2, Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 47
    .line 48
    .line 49
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_2

    .line 58
    .line 59
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    move-object v1, v0

    .line 64
    check-cast v1, Ljava/lang/String;

    .line 65
    .line 66
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-nez v1, :cond_1

    .line 71
    .line 72
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_2
    invoke-static {p2}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-static {p0}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 81
    .line 82
    .line 83
    move-result-object v8

    .line 84
    new-instance v1, Lqb/g;

    .line 85
    .line 86
    move v4, p1

    .line 87
    invoke-direct/range {v1 .. v8}, Lqb/g;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    .line 88
    .line 89
    .line 90
    return-object v1

    .line 91
    :cond_3
    :goto_1
    const/4 p0, 0x0

    .line 92
    return-object p0
.end method

.method public static N(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 3

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->currentActivity()Lq8/o;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    if-eqz p0, :cond_1

    .line 9
    .line 10
    invoke-virtual {p0}, Lq8/o;->a()Landroid/app/Activity;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    goto :goto_0

    .line 15
    :cond_1
    const/4 p0, 0x0

    .line 16
    :goto_0
    if-nez p0, :cond_2

    .line 17
    .line 18
    return-void

    .line 19
    :cond_2
    new-instance v0, Landroid/os/Handler;

    .line 20
    .line 21
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 26
    .line 27
    .line 28
    new-instance v1, Lc9/t;

    .line 29
    .line 30
    const/16 v2, 0x9

    .line 31
    .line 32
    invoke-direct {v1, p0, p1, v2}, Lc9/t;-><init>(Landroid/app/Activity;Ljava/lang/String;I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public static a(Ljava/lang/Object;Landroid/view/View;IILjava/lang/String;Ljava/lang/String;)V
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    const-string v3, "findItem"

    .line 15
    .line 16
    invoke-static {p0, v3, v2}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    goto/16 :goto_5

    .line 23
    .line 24
    :cond_0
    const/4 v2, 0x2

    .line 25
    const/4 v3, 0x0

    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->currentActivity()Lq8/o;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    if-eqz p1, :cond_2

    .line 40
    .line 41
    invoke-virtual {p1}, Lq8/o;->a()Landroid/app/Activity;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    goto :goto_0

    .line 46
    :cond_2
    move-object p1, v3

    .line 47
    :goto_0
    if-eqz p1, :cond_3

    .line 48
    .line 49
    :goto_1
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    const-string v5, "raw"

    .line 58
    .line 59
    const-string v6, "drawable"

    .line 60
    .line 61
    filled-new-array {v5, v6}, [Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    move v6, v0

    .line 66
    :goto_2
    if-lt v6, v2, :cond_4

    .line 67
    .line 68
    :cond_3
    move v7, v0

    .line 69
    goto :goto_3

    .line 70
    :cond_4
    aget-object v7, v5, v6

    .line 71
    .line 72
    invoke-virtual {v4, p5, v7, p1}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 73
    .line 74
    .line 75
    move-result v7

    .line 76
    if-eqz v7, :cond_5

    .line 77
    .line 78
    goto :goto_3

    .line 79
    :cond_5
    add-int/lit8 v6, v6, 0x1

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :goto_3
    if-eqz v7, :cond_8

    .line 83
    .line 84
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-static {p1}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    :cond_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 97
    .line 98
    .line 99
    move-result p5

    .line 100
    if-eqz p5, :cond_7

    .line 101
    .line 102
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p5

    .line 106
    move-object v4, p5

    .line 107
    check-cast v4, Ljava/lang/reflect/Method;

    .line 108
    .line 109
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    const-string v6, "c"

    .line 118
    .line 119
    invoke-static {v4, v6}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v4

    .line 123
    if-eqz v4, :cond_6

    .line 124
    .line 125
    array-length v4, v5

    .line 126
    const/4 v6, 0x5

    .line 127
    if-ne v4, v6, :cond_6

    .line 128
    .line 129
    aget-object v4, v5, v0

    .line 130
    .line 131
    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 132
    .line 133
    invoke-static {v4, v6}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v4

    .line 137
    if-eqz v4, :cond_6

    .line 138
    .line 139
    const/4 v4, 0x1

    .line 140
    aget-object v4, v5, v4

    .line 141
    .line 142
    invoke-static {v4, v6}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v4

    .line 146
    if-eqz v4, :cond_6

    .line 147
    .line 148
    aget-object v4, v5, v2

    .line 149
    .line 150
    invoke-static {v4, v6}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result v4

    .line 154
    if-eqz v4, :cond_6

    .line 155
    .line 156
    const/4 v4, 0x3

    .line 157
    aget-object v4, v5, v4

    .line 158
    .line 159
    const-class v8, Ljava/lang/String;

    .line 160
    .line 161
    invoke-virtual {v4, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 162
    .line 163
    .line 164
    move-result v4

    .line 165
    if-eqz v4, :cond_6

    .line 166
    .line 167
    const/4 v4, 0x4

    .line 168
    aget-object v4, v5, v4

    .line 169
    .line 170
    invoke-static {v4, v6}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v4

    .line 174
    if-eqz v4, :cond_6

    .line 175
    .line 176
    move-object v3, p5

    .line 177
    :cond_7
    check-cast v3, Ljava/lang/reflect/Method;

    .line 178
    .line 179
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 184
    .line 185
    .line 186
    move-result-object p5

    .line 187
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    filled-new-array {p1, p5, v1, p4, v0}, [Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    invoke-static {v3, p0, p1}, Lh/Hchat/utils/KavaReflector;->invokeSuccessfully(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    move-result p1

    .line 199
    if-eqz p1, :cond_8

    .line 200
    .line 201
    goto :goto_5

    .line 202
    :cond_8
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 207
    .line 208
    .line 209
    move-result-object p5

    .line 210
    filled-new-array {p1, p5, v1, p4}, [Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    const-string p5, "add"

    .line 215
    .line 216
    invoke-static {p0, p5, p1}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object p1

    .line 220
    if-eqz p1, :cond_9

    .line 221
    .line 222
    goto :goto_4

    .line 223
    :cond_9
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 224
    .line 225
    .line 226
    move-result-object p1

    .line 227
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 228
    .line 229
    .line 230
    move-result-object p2

    .line 231
    filled-new-array {p1, p2, v1, p4}, [Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    invoke-static {p0, p5, p1}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    :goto_4
    instance-of p2, p1, Landroid/view/MenuItem;

    .line 240
    .line 241
    if-eqz p2, :cond_a

    .line 242
    .line 243
    if-eqz v7, :cond_a

    .line 244
    .line 245
    :try_start_0
    check-cast p1, Landroid/view/MenuItem;

    .line 246
    .line 247
    invoke-interface {p1, v7}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 248
    .line 249
    .line 250
    return-void

    .line 251
    :cond_a
    if-eqz p1, :cond_b

    .line 252
    .line 253
    goto :goto_5

    .line 254
    :cond_b
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 255
    .line 256
    .line 257
    move-result-object p1

    .line 258
    filled-new-array {p1, p4}, [Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object p1

    .line 262
    const-string p2, "f"

    .line 263
    .line 264
    invoke-static {p0, p2, p1}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object p1

    .line 268
    if-eqz p1, :cond_c

    .line 269
    .line 270
    :catchall_0
    :goto_5
    return-void

    .line 271
    :cond_c
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 272
    .line 273
    .line 274
    move-result-object p1

    .line 275
    filled-new-array {p1, p4}, [Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object p1

    .line 279
    invoke-static {p0, p2, p1}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    return-void
.end method

.method public static b(Ljava/io/File;Ljava/io/File;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/io/File;->isFile()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-nez v2, :cond_1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    const/4 v0, 0x0

    .line 23
    :goto_0
    if-eqz v0, :cond_2

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 26
    .line 27
    .line 28
    :cond_2
    new-instance v0, Ljava/io/FileInputStream;

    .line 29
    .line 30
    invoke-direct {v0, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 31
    .line 32
    .line 33
    :try_start_1
    new-instance p0, Ljava/io/FileOutputStream;

    .line 34
    .line 35
    const/4 v2, 0x1

    .line 36
    invoke-direct {p0, p1, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 37
    .line 38
    .line 39
    const/16 p1, 0x4000

    .line 40
    .line 41
    :try_start_2
    new-array p1, p1, [B

    .line 42
    .line 43
    :goto_1
    invoke-virtual {v0, p1}, Ljava/io/FileInputStream;->read([B)I

    .line 44
    .line 45
    .line 46
    move-result v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 47
    if-gtz v2, :cond_3

    .line 48
    .line 49
    :try_start_3
    invoke-virtual {p0}, Ljava/io/FileOutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 50
    .line 51
    .line 52
    :try_start_4
    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V

    .line 53
    .line 54
    .line 55
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 56
    .line 57
    goto :goto_3

    .line 58
    :catchall_0
    move-exception p0

    .line 59
    goto :goto_2

    .line 60
    :cond_3
    :try_start_5
    invoke-virtual {p0, p1, v1, v2}, Ljava/io/FileOutputStream;->write([BII)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :catchall_1
    move-exception p1

    .line 65
    :try_start_6
    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 66
    :catchall_2
    move-exception v1

    .line 67
    :try_start_7
    invoke-static {p0, p1}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 68
    .line 69
    .line 70
    throw v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 71
    :goto_2
    :try_start_8
    throw p0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 72
    :catchall_3
    move-exception p1

    .line 73
    :try_start_9
    invoke-static {v0, p0}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 74
    .line 75
    .line 76
    throw p1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 77
    :catchall_4
    move-exception p0

    .line 78
    new-instance p1, Lsf/f;

    .line 79
    .line 80
    invoke-direct {p1, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 81
    .line 82
    .line 83
    move-object p0, p1

    .line 84
    :goto_3
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 85
    .line 86
    instance-of v0, p0, Lsf/f;

    .line 87
    .line 88
    if-eqz v0, :cond_4

    .line 89
    .line 90
    move-object p0, p1

    .line 91
    :cond_4
    check-cast p0, Ljava/lang/Boolean;

    .line 92
    .line 93
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 94
    .line 95
    .line 96
    move-result p0

    .line 97
    return p0
.end method

.method public static e(Ljava/util/Collection;)V
    .locals 3

    .line 1
    check-cast p0, Ljava/lang/Iterable;

    .line 2
    .line 3
    invoke-static {p0}, Ltf/m;->m1(Ljava/lang/Iterable;)Ldg/n;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    new-instance v0, Lo9/e;

    .line 8
    .line 9
    const/16 v1, 0x16

    .line 10
    .line 11
    invoke-direct {v0, v1}, Lo9/e;-><init>(I)V

    .line 12
    .line 13
    .line 14
    new-instance v1, Lng/i;

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    invoke-direct {v1, p0, v2, v0}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 18
    .line 19
    .line 20
    new-instance p0, Lo9/e;

    .line 21
    .line 22
    const/16 v0, 0x17

    .line 23
    .line 24
    invoke-direct {p0, v0}, Lo9/e;-><init>(I)V

    .line 25
    .line 26
    .line 27
    invoke-static {v1, p0}, Lng/m;->W(Lng/j;Lfg/l;)Lng/t;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-static {p0}, Lng/m;->S(Lng/j;)Lng/c;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-virtual {p0}, Lng/c;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    :catchall_0
    :goto_0
    move-object v0, p0

    .line 40
    check-cast v0, Ltf/b;

    .line 41
    .line 42
    invoke-virtual {v0}, Ltf/b;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_0

    .line 47
    .line 48
    invoke-virtual {v0}, Ltf/b;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    check-cast v0, Ljava/lang/String;

    .line 53
    .line 54
    :try_start_0
    new-instance v1, Ljava/io/File;

    .line 55
    .line 56
    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/io/File;->delete()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    return-void
.end method

.method public static g(Ljava/io/File;Ljava/io/File;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/io/File;->isFile()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-nez v2, :cond_1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    const/4 v0, 0x0

    .line 23
    :goto_0
    if-eqz v0, :cond_2

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 26
    .line 27
    .line 28
    :cond_2
    new-instance v0, Ljava/io/FileInputStream;

    .line 29
    .line 30
    invoke-direct {v0, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 31
    .line 32
    .line 33
    :try_start_1
    new-instance p0, Ljava/io/FileOutputStream;

    .line 34
    .line 35
    invoke-direct {p0, p1, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    .line 37
    .line 38
    const/16 p1, 0x2000

    .line 39
    .line 40
    :try_start_2
    new-array p1, p1, [B

    .line 41
    .line 42
    :goto_1
    invoke-virtual {v0, p1}, Ljava/io/FileInputStream;->read([B)I

    .line 43
    .line 44
    .line 45
    move-result v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 46
    if-gtz v2, :cond_3

    .line 47
    .line 48
    :try_start_3
    invoke-virtual {p0}, Ljava/io/FileOutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 49
    .line 50
    .line 51
    :try_start_4
    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V

    .line 52
    .line 53
    .line 54
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 55
    .line 56
    goto :goto_3

    .line 57
    :catchall_0
    move-exception p0

    .line 58
    goto :goto_2

    .line 59
    :cond_3
    :try_start_5
    invoke-virtual {p0, p1, v1, v2}, Ljava/io/FileOutputStream;->write([BII)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :catchall_1
    move-exception p1

    .line 64
    :try_start_6
    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 65
    :catchall_2
    move-exception v1

    .line 66
    :try_start_7
    invoke-static {p0, p1}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 67
    .line 68
    .line 69
    throw v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 70
    :goto_2
    :try_start_8
    throw p0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 71
    :catchall_3
    move-exception p1

    .line 72
    :try_start_9
    invoke-static {v0, p0}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 73
    .line 74
    .line 75
    throw p1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 76
    :catchall_4
    move-exception p0

    .line 77
    new-instance p1, Lsf/f;

    .line 78
    .line 79
    invoke-direct {p1, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 80
    .line 81
    .line 82
    move-object p0, p1

    .line 83
    :goto_3
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 84
    .line 85
    instance-of v0, p0, Lsf/f;

    .line 86
    .line 87
    if-eqz v0, :cond_4

    .line 88
    .line 89
    move-object p0, p1

    .line 90
    :cond_4
    check-cast p0, Ljava/lang/Boolean;

    .line 91
    .line 92
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    return p0
.end method

.method public static i(Ljava/util/List;)V
    .locals 2

    .line 1
    new-instance v0, Ldg/n;

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    invoke-direct {v0, p0, v1}, Ldg/n;-><init>(Ljava/lang/Object;I)V

    .line 5
    .line 6
    .line 7
    new-instance p0, Lo9/e;

    .line 8
    .line 9
    const/16 v1, 0x18

    .line 10
    .line 11
    invoke-direct {p0, v1}, Lo9/e;-><init>(I)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0, p0}, Lng/m;->W(Lng/j;Lfg/l;)Lng/t;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-static {p0}, Lng/m;->S(Lng/j;)Lng/c;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {p0}, Lng/c;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    :catchall_0
    :goto_0
    move-object v0, p0

    .line 27
    check-cast v0, Ltf/b;

    .line 28
    .line 29
    invoke-virtual {v0}, Ltf/b;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_0

    .line 34
    .line 35
    invoke-virtual {v0}, Ltf/b;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, Ljava/lang/String;

    .line 40
    .line 41
    :try_start_0
    new-instance v1, Ljava/io/File;

    .line 42
    .line 43
    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/io/File;->delete()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    return-void
.end method

.method public static j(Ljava/lang/Object;)Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "T"

    .line 2
    .line 3
    const-string v1, "Z"

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    :goto_0
    const/4 v2, 0x2

    .line 11
    if-lt v1, v2, :cond_0

    .line 12
    .line 13
    const-string p0, ""

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    aget-object v2, v0, v1

    .line 17
    .line 18
    invoke-static {p0, v2}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    instance-of v3, v2, Ljava/lang/String;

    .line 23
    .line 24
    const/4 v4, 0x0

    .line 25
    if-eqz v3, :cond_1

    .line 26
    .line 27
    check-cast v2, Ljava/lang/String;

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move-object v2, v4

    .line 31
    :goto_1
    if-eqz v2, :cond_3

    .line 32
    .line 33
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-nez v3, :cond_2

    .line 38
    .line 39
    move-object v4, v2

    .line 40
    :cond_2
    if-eqz v4, :cond_3

    .line 41
    .line 42
    return-object v4

    .line 43
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 44
    .line 45
    goto :goto_0
.end method

.method public static varargs l(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Number;
    .locals 4

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_0
    if-lt v1, v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return-object p0

    .line 7
    :cond_0
    aget-object v2, p1, v1

    .line 8
    .line 9
    invoke-static {p0, v2}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    instance-of v3, v2, Ljava/lang/Number;

    .line 14
    .line 15
    if-eqz v3, :cond_1

    .line 16
    .line 17
    check-cast v2, Ljava/lang/Number;

    .line 18
    .line 19
    return-object v2

    .line 20
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    goto :goto_0
.end method

.method public static q(Ljava/lang/Class;Ljava/lang/reflect/Method;)Z
    .locals 3

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
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const-class v1, Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {p1, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    array-length p1, v0

    .line 29
    const/4 v1, 0x1

    .line 30
    if-ne p1, v1, :cond_0

    .line 31
    .line 32
    aget-object p1, v0, v2

    .line 33
    .line 34
    invoke-virtual {p1, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    if-eqz p0, :cond_0

    .line 39
    .line 40
    return v1

    .line 41
    :cond_0
    return v2
.end method

.method public static r(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const-string v0, "field_type"

    .line 2
    .line 3
    const-string v1, "type"

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {p0, v0}, Lqb/k;->l(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Number;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v0, v1

    .line 22
    :goto_0
    const/4 v2, 0x3

    .line 23
    if-ne v0, v2, :cond_3

    .line 24
    .line 25
    const-string v0, "field_favProto"

    .line 26
    .line 27
    invoke-static {p0, v0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    const/4 v0, 0x0

    .line 32
    if-eqz p0, :cond_2

    .line 33
    .line 34
    const-string v2, "f"

    .line 35
    .line 36
    invoke-static {p0, v2}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    instance-of v2, p0, Ljava/util/List;

    .line 41
    .line 42
    if-eqz v2, :cond_1

    .line 43
    .line 44
    check-cast p0, Ljava/util/List;

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    move-object p0, v0

    .line 48
    :goto_1
    if-eqz p0, :cond_2

    .line 49
    .line 50
    invoke-static {p0}, Ltf/m;->v1(Ljava/util/List;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    :cond_2
    if-eqz v0, :cond_3

    .line 55
    .line 56
    const/4 p0, 0x1

    .line 57
    return p0

    .line 58
    :cond_3
    return v1
.end method

.method public static s(Ljava/lang/String;)Z
    .locals 2

    .line 1
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_2

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/16 v1, 0x80

    .line 20
    .line 21
    if-le v0, v1, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/16 v0, 0x2f

    .line 25
    .line 26
    invoke-static {p0, v0}, Log/m;->i0(Ljava/lang/CharSequence;C)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_2

    .line 31
    .line 32
    const/16 v0, 0x5c

    .line 33
    .line 34
    invoke-static {p0, v0}, Log/m;->i0(Ljava/lang/CharSequence;C)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-nez v0, :cond_2

    .line 39
    .line 40
    const/16 v0, 0x3c

    .line 41
    .line 42
    invoke-static {p0, v0}, Log/m;->i0(Ljava/lang/CharSequence;C)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-nez v0, :cond_2

    .line 47
    .line 48
    const/16 v0, 0xa

    .line 49
    .line 50
    invoke-static {p0, v0}, Log/m;->i0(Ljava/lang/CharSequence;C)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    const-string v0, "[A-Za-z0-9_@.\\-]+"

    .line 58
    .line 59
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->matches()Z

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    return p0

    .line 75
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 76
    return p0
.end method

.method public static t(Ljava/lang/reflect/Method;)Z
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
    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

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
    const/4 v3, 0x3

    .line 20
    if-lt v1, v3, :cond_0

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
    const-string v0, "com.tencent.mm.ui.chatting.viewitems."

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

.method public static u(Ljava/lang/Object;)Z
    .locals 6

    .line 1
    const-string v0, "getMsgType"

    .line 2
    .line 3
    const-string v1, "getMsgTypeValue"

    .line 4
    .line 5
    const-string v2, "getType"

    .line 6
    .line 7
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x0

    .line 12
    move v2, v1

    .line 13
    :goto_0
    const/4 v3, 0x3

    .line 14
    if-lt v2, v3, :cond_0

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    aget-object v3, v0, v2

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    new-array v5, v1, [Ljava/lang/Class;

    .line 25
    .line 26
    invoke-static {v4, v3, v5}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    new-array v4, v1, [Ljava/lang/Object;

    .line 31
    .line 32
    invoke-static {v3, p0, v4}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    instance-of v4, v3, Ljava/lang/Number;

    .line 37
    .line 38
    if-eqz v4, :cond_3

    .line 39
    .line 40
    move-object v0, v3

    .line 41
    check-cast v0, Ljava/lang/Number;

    .line 42
    .line 43
    :goto_1
    if-eqz v0, :cond_1

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_1
    const-string v0, "field_type"

    .line 47
    .line 48
    const-string v2, "type"

    .line 49
    .line 50
    filled-new-array {v0, v2}, [Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-static {p0, v0}, Lqb/k;->l(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Number;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    :goto_2
    if-eqz v0, :cond_2

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    const/16 v0, 0x22

    .line 65
    .line 66
    if-ne p0, v0, :cond_2

    .line 67
    .line 68
    const/4 p0, 0x1

    .line 69
    return p0

    .line 70
    :cond_2
    return v1

    .line 71
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 72
    .line 73
    goto :goto_0
.end method

.method public static v()Ljava/util/List;
    .locals 9

    .line 1
    invoke-static {}, Lwb/en;->c()Lg8/i;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Ltf/t;->g:Ltf/t;

    .line 6
    .line 7
    if-eqz v0, :cond_13

    .line 8
    .line 9
    invoke-virtual {v0}, Lg8/i;->G()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    goto/16 :goto_9

    .line 16
    .line 17
    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 23
    .line 24
    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    .line 25
    .line 26
    .line 27
    :try_start_0
    invoke-virtual {v0}, Lg8/i;->p()Ljava/util/ArrayList;

    .line 28
    .line 29
    .line 30
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception v4

    .line 33
    new-instance v5, Lsf/f;

    .line 34
    .line 35
    invoke-direct {v5, v4}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 36
    .line 37
    .line 38
    move-object v4, v5

    .line 39
    :goto_0
    nop

    .line 40
    instance-of v5, v4, Lsf/f;

    .line 41
    .line 42
    if-eqz v5, :cond_1

    .line 43
    .line 44
    move-object v4, v1

    .line 45
    :cond_1
    check-cast v4, Ljava/lang/Iterable;

    .line 46
    .line 47
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    :cond_2
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    if-eqz v5, :cond_7

    .line 56
    .line 57
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    check-cast v5, Lh/Hchat/hooks/api/model/ContactLabelBean;

    .line 62
    .line 63
    iget-object v6, v5, Lh/Hchat/hooks/api/model/ContactLabelBean;->labelName:Ljava/lang/String;

    .line 64
    .line 65
    invoke-static {v6}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 66
    .line 67
    .line 68
    move-result v7

    .line 69
    if-eqz v7, :cond_3

    .line 70
    .line 71
    iget-object v6, v5, Lh/Hchat/hooks/api/model/ContactLabelBean;->labelId:Ljava/lang/String;

    .line 72
    .line 73
    :cond_3
    invoke-static {v6}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 74
    .line 75
    .line 76
    move-result v7

    .line 77
    if-eqz v7, :cond_4

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_4
    iget-object v5, v5, Lh/Hchat/hooks/api/model/ContactLabelBean;->userNameList:Ljava/util/List;

    .line 81
    .line 82
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    :cond_5
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 87
    .line 88
    .line 89
    move-result v7

    .line 90
    if-eqz v7, :cond_2

    .line 91
    .line 92
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v7

    .line 96
    check-cast v7, Ljava/lang/String;

    .line 97
    .line 98
    invoke-static {v7}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 99
    .line 100
    .line 101
    move-result v8

    .line 102
    if-nez v8, :cond_5

    .line 103
    .line 104
    invoke-virtual {v3, v7}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v8

    .line 108
    if-nez v8, :cond_6

    .line 109
    .line 110
    new-instance v8, Ljava/util/ArrayList;

    .line 111
    .line 112
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 113
    .line 114
    .line 115
    invoke-interface {v3, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    :cond_6
    check-cast v8, Ljava/util/List;

    .line 119
    .line 120
    invoke-interface {v8, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_7
    invoke-virtual {v0}, Lg8/i;->y()Ljava/util/ArrayList;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    new-instance v5, Ljava/util/ArrayList;

    .line 129
    .line 130
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    :cond_8
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 138
    .line 139
    .line 140
    move-result v6

    .line 141
    const/4 v7, 0x0

    .line 142
    if-eqz v6, :cond_a

    .line 143
    .line 144
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v6

    .line 148
    check-cast v6, Lh/Hchat/hooks/api/model/WeChatContact;

    .line 149
    .line 150
    iget-object v8, v6, Lh/Hchat/hooks/api/model/WeChatContact;->wxId:Ljava/lang/String;

    .line 151
    .line 152
    invoke-virtual {v3, v8}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v8

    .line 156
    check-cast v8, Ljava/util/List;

    .line 157
    .line 158
    if-nez v8, :cond_9

    .line 159
    .line 160
    move-object v8, v1

    .line 161
    :cond_9
    invoke-static {v6, v7, v8}, Lqb/k;->M(Lh/Hchat/hooks/api/model/WeChatContact;ZLjava/util/List;)Lqb/g;

    .line 162
    .line 163
    .line 164
    move-result-object v6

    .line 165
    if-eqz v6, :cond_8

    .line 166
    .line 167
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    goto :goto_3

    .line 171
    :cond_a
    invoke-static {v2, v5}, Ltf/r;->h1(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v0}, Lg8/i;->x()Ljava/util/ArrayList;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    new-instance v3, Ljava/util/ArrayList;

    .line 179
    .line 180
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    :cond_b
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 188
    .line 189
    .line 190
    move-result v4

    .line 191
    if-eqz v4, :cond_c

    .line 192
    .line 193
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v4

    .line 197
    check-cast v4, Lh/Hchat/hooks/api/model/WeChatContact;

    .line 198
    .line 199
    const/4 v5, 0x1

    .line 200
    invoke-static {v4, v5, v1}, Lqb/k;->M(Lh/Hchat/hooks/api/model/WeChatContact;ZLjava/util/List;)Lqb/g;

    .line 201
    .line 202
    .line 203
    move-result-object v4

    .line 204
    if-eqz v4, :cond_b

    .line 205
    .line 206
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    goto :goto_4

    .line 210
    :cond_c
    invoke-static {v2, v3}, Ltf/r;->h1(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 211
    .line 212
    .line 213
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->conversations()Lh8/a;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    const/4 v3, 0x0

    .line 218
    if-eqz v0, :cond_d

    .line 219
    .line 220
    invoke-virtual {v0}, Lh8/a;->c()Ljava/util/ArrayList;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    goto :goto_5

    .line 225
    :cond_d
    move-object v0, v3

    .line 226
    :goto_5
    if-nez v0, :cond_e

    .line 227
    .line 228
    goto :goto_6

    .line 229
    :cond_e
    move-object v1, v0

    .line 230
    :goto_6
    new-instance v0, Ljava/util/ArrayList;

    .line 231
    .line 232
    invoke-static {v1}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 233
    .line 234
    .line 235
    move-result v4

    .line 236
    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 237
    .line 238
    .line 239
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 240
    .line 241
    .line 242
    move-result-object v1

    .line 243
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 244
    .line 245
    .line 246
    move-result v4

    .line 247
    if-eqz v4, :cond_10

    .line 248
    .line 249
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v4

    .line 253
    add-int/lit8 v5, v7, 0x1

    .line 254
    .line 255
    if-ltz v7, :cond_f

    .line 256
    .line 257
    check-cast v4, Ll8/b;

    .line 258
    .line 259
    iget-object v4, v4, Ll8/b;->a:Ljava/lang/String;

    .line 260
    .line 261
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 262
    .line 263
    .line 264
    move-result-object v6

    .line 265
    new-instance v7, Lsf/e;

    .line 266
    .line 267
    invoke-direct {v7, v4, v6}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    move v7, v5

    .line 274
    goto :goto_7

    .line 275
    :cond_f
    invoke-static {}, La/a;->Q0()V

    .line 276
    .line 277
    .line 278
    throw v3

    .line 279
    :cond_10
    invoke-static {v0}, Ltf/y;->e0(Ljava/util/ArrayList;)Ljava/util/Map;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    new-instance v1, Ljava/util/HashSet;

    .line 284
    .line 285
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 286
    .line 287
    .line 288
    new-instance v3, Ljava/util/ArrayList;

    .line 289
    .line 290
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 294
    .line 295
    .line 296
    move-result-object v2

    .line 297
    :cond_11
    :goto_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 298
    .line 299
    .line 300
    move-result v4

    .line 301
    if-eqz v4, :cond_12

    .line 302
    .line 303
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v4

    .line 307
    move-object v5, v4

    .line 308
    check-cast v5, Lqb/g;

    .line 309
    .line 310
    iget-object v5, v5, Lqb/g;->a:Ljava/lang/String;

    .line 311
    .line 312
    invoke-virtual {v1, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 313
    .line 314
    .line 315
    move-result v5

    .line 316
    if-eqz v5, :cond_11

    .line 317
    .line 318
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 319
    .line 320
    .line 321
    goto :goto_8

    .line 322
    :cond_12
    new-instance v1, Lc9/z;

    .line 323
    .line 324
    const/4 v2, 0x3

    .line 325
    invoke-direct {v1, v0, v2}, Lc9/z;-><init>(Ljava/util/Map;I)V

    .line 326
    .line 327
    .line 328
    new-instance v0, Lc9/a0;

    .line 329
    .line 330
    const/16 v2, 0x17

    .line 331
    .line 332
    invoke-direct {v0, v1, v2}, Lc9/a0;-><init>(Ljava/lang/Object;I)V

    .line 333
    .line 334
    .line 335
    new-instance v1, Lc9/a0;

    .line 336
    .line 337
    const/16 v2, 0x18

    .line 338
    .line 339
    invoke-direct {v1, v0, v2}, Lc9/a0;-><init>(Ljava/lang/Object;I)V

    .line 340
    .line 341
    .line 342
    invoke-static {v3, v1}, Ltf/m;->K1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    return-object v0

    .line 347
    :cond_13
    :goto_9
    return-object v1
.end method


# virtual methods
.method public final A(Ljava/lang/String;)Z
    .locals 10

    .line 1
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-static {p1}, Leh/a;->y(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v2, 0x1

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    return v2

    .line 17
    :cond_1
    const-string v0, "j"

    .line 18
    .line 19
    const-string v3, "k"

    .line 20
    .line 21
    filled-new-array {v0, v3}, [Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const-string v3, "com.tencent.mm.vfs.w6"

    .line 26
    .line 27
    const-string v4, "com.tencent.mm.vfs.p6"

    .line 28
    .line 29
    filled-new-array {v3, v4}, [Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    move v4, v1

    .line 34
    :goto_0
    const/4 v5, 0x2

    .line 35
    if-lt v4, v5, :cond_2

    .line 36
    .line 37
    return v1

    .line 38
    :cond_2
    aget-object v5, v3, v4

    .line 39
    .line 40
    iget-object v6, p0, Lqb/k;->a:Lr8/g;

    .line 41
    .line 42
    iget-object v6, v6, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 43
    .line 44
    invoke-static {v5, v6}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    if-eqz v5, :cond_8

    .line 49
    .line 50
    invoke-static {v5}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    :cond_3
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    if-eqz v6, :cond_8

    .line 63
    .line 64
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    check-cast v6, Ljava/lang/reflect/Method;

    .line 69
    .line 70
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v7

    .line 74
    invoke-static {v0, v7}, Ltf/l;->m0([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v7

    .line 78
    if-nez v7, :cond_4

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_4
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 82
    .line 83
    .line 84
    move-result v7

    .line 85
    invoke-static {v7}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 86
    .line 87
    .line 88
    move-result v7

    .line 89
    if-nez v7, :cond_5

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_5
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    move-result-object v7

    .line 96
    array-length v8, v7

    .line 97
    if-ne v8, v2, :cond_3

    .line 98
    .line 99
    aget-object v7, v7, v1

    .line 100
    .line 101
    const-class v8, Ljava/lang/String;

    .line 102
    .line 103
    invoke-static {v7, v8}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v7

    .line 107
    if-nez v7, :cond_6

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_6
    const/4 v7, 0x0

    .line 111
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v8

    .line 115
    invoke-static {v6, v7, v8}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v6

    .line 119
    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 120
    .line 121
    invoke-static {v6, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v7

    .line 125
    if-eqz v7, :cond_7

    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_7
    instance-of v7, v6, Ljava/lang/Number;

    .line 129
    .line 130
    if-eqz v7, :cond_3

    .line 131
    .line 132
    check-cast v6, Ljava/lang/Number;

    .line 133
    .line 134
    invoke-virtual {v6}, Ljava/lang/Number;->longValue()J

    .line 135
    .line 136
    .line 137
    move-result-wide v6

    .line 138
    const-wide/16 v8, 0x0

    .line 139
    .line 140
    cmp-long v6, v6, v8

    .line 141
    .line 142
    if-lez v6, :cond_3

    .line 143
    .line 144
    :goto_2
    return v2

    .line 145
    :cond_8
    add-int/lit8 v4, v4, 0x1

    .line 146
    .line 147
    goto :goto_0
.end method

.method public final B(Ljava/lang/Object;)Lqb/i;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-static/range {p1 .. p1}, Lqb/k;->r(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    :cond_0
    move-object/from16 v16, v2

    .line 11
    .line 12
    goto/16 :goto_15

    .line 13
    .line 14
    :cond_1
    const-string v0, "field_favProto"

    .line 15
    .line 16
    move-object/from16 v3, p1

    .line 17
    .line 18
    invoke-static {v3, v0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz v0, :cond_3

    .line 23
    .line 24
    const-string v4, "f"

    .line 25
    .line 26
    invoke-static {v0, v4}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    instance-of v4, v0, Ljava/util/List;

    .line 31
    .line 32
    if-eqz v4, :cond_2

    .line 33
    .line 34
    check-cast v0, Ljava/util/List;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    move-object v0, v2

    .line 38
    :goto_0
    if-eqz v0, :cond_3

    .line 39
    .line 40
    invoke-static {v0}, Ltf/m;->v1(Ljava/util/List;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    move-object v4, v0

    .line 45
    goto :goto_1

    .line 46
    :cond_3
    move-object v4, v2

    .line 47
    :goto_1
    if-eqz v4, :cond_0

    .line 48
    .line 49
    new-instance v5, Ljava/util/LinkedHashSet;

    .line 50
    .line 51
    invoke-direct {v5}, Ljava/util/LinkedHashSet;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    invoke-static {v4}, Lqb/k;->j(Ljava/lang/Object;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    new-instance v8, Ljava/util/LinkedHashSet;

    .line 63
    .line 64
    invoke-direct {v8}, Ljava/util/LinkedHashSet;-><init>()V

    .line 65
    .line 66
    .line 67
    iget-object v9, v1, Lqb/k;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 68
    .line 69
    invoke-virtual {v9, v6}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    check-cast v0, Ljava/lang/reflect/Method;

    .line 74
    .line 75
    if-eqz v0, :cond_6

    .line 76
    .line 77
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v10

    .line 81
    invoke-static {v0, v2, v10}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v10

    .line 85
    instance-of v11, v10, Ljava/lang/String;

    .line 86
    .line 87
    if-eqz v11, :cond_4

    .line 88
    .line 89
    check-cast v10, Ljava/lang/String;

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_4
    move-object v10, v2

    .line 93
    :goto_2
    if-eqz v10, :cond_6

    .line 94
    .line 95
    invoke-virtual {v1, v10, v7, v0}, Lqb/k;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)I

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-ltz v0, :cond_5

    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_5
    move-object v10, v2

    .line 103
    :goto_3
    if-eqz v10, :cond_6

    .line 104
    .line 105
    invoke-interface {v8, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    :cond_6
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    const-string v10, "fav_data_path_v2_"

    .line 113
    .line 114
    invoke-virtual {v10, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v10

    .line 118
    invoke-virtual {v1}, Lqb/k;->z()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    iget-object v11, v1, Lqb/k;->a:Lr8/g;

    .line 123
    .line 124
    iget-object v12, v11, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 125
    .line 126
    iget-object v13, v1, Lqb/k;->e:Landroid/content/SharedPreferences;

    .line 127
    .line 128
    invoke-static {v13, v0, v12, v10}, Le8/b;->c(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    if-eqz v0, :cond_9

    .line 133
    .line 134
    invoke-static {v6, v0}, Lqb/k;->q(Ljava/lang/Class;Ljava/lang/reflect/Method;)Z

    .line 135
    .line 136
    .line 137
    move-result v12

    .line 138
    if-eqz v12, :cond_9

    .line 139
    .line 140
    invoke-virtual {v9, v6, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v12

    .line 147
    invoke-static {v0, v2, v12}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v12

    .line 151
    instance-of v14, v12, Ljava/lang/String;

    .line 152
    .line 153
    if-eqz v14, :cond_7

    .line 154
    .line 155
    check-cast v12, Ljava/lang/String;

    .line 156
    .line 157
    goto :goto_4

    .line 158
    :cond_7
    move-object v12, v2

    .line 159
    :goto_4
    if-eqz v12, :cond_9

    .line 160
    .line 161
    invoke-virtual {v1, v12, v7, v0}, Lqb/k;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)I

    .line 162
    .line 163
    .line 164
    move-result v0

    .line 165
    if-ltz v0, :cond_8

    .line 166
    .line 167
    goto :goto_5

    .line 168
    :cond_8
    move-object v12, v2

    .line 169
    :goto_5
    if-eqz v12, :cond_9

    .line 170
    .line 171
    invoke-interface {v8, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    :cond_9
    :try_start_0
    iget-object v0, v11, Lr8/g;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 175
    .line 176
    new-instance v12, Lch/e;

    .line 177
    .line 178
    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    .line 179
    .line 180
    .line 181
    new-instance v14, Lfh/k;

    .line 182
    .line 183
    invoke-direct {v14}, Ljava/lang/Object;-><init>()V

    .line 184
    .line 185
    .line 186
    const-string v15, "java.lang.String"

    .line 187
    .line 188
    invoke-static {v14, v15}, Lfh/k;->q0(Lfh/k;Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v15

    .line 195
    filled-new-array {v15}, [Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v15

    .line 199
    invoke-virtual {v14, v15}, Lfh/k;->o0([Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    iput-object v14, v12, Lch/e;->h:Lfh/k;

    .line 203
    .line 204
    invoke-virtual {v0, v12}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    new-instance v12, Ljava/util/ArrayList;

    .line 209
    .line 210
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 214
    .line 215
    .line 216
    move-result-object v14

    .line 217
    :cond_a
    :goto_6
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 218
    .line 219
    .line 220
    move-result v0

    .line 221
    if-eqz v0, :cond_c

    .line 222
    .line 223
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    check-cast v0, Lhh/o;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 228
    .line 229
    :try_start_1
    iget-object v15, v11, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 230
    .line 231
    invoke-virtual {v0, v15}, Lhh/o;->r(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 232
    .line 233
    .line 234
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 235
    goto :goto_7

    .line 236
    :catchall_0
    move-exception v0

    .line 237
    :try_start_2
    new-instance v15, Lsf/f;

    .line 238
    .line 239
    invoke-direct {v15, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 240
    .line 241
    .line 242
    move-object v0, v15

    .line 243
    :goto_7
    nop

    .line 244
    instance-of v15, v0, Lsf/f;

    .line 245
    .line 246
    if-eqz v15, :cond_b

    .line 247
    .line 248
    move-object v0, v2

    .line 249
    :cond_b
    check-cast v0, Ljava/lang/reflect/Method;

    .line 250
    .line 251
    if-eqz v0, :cond_a

    .line 252
    .line 253
    invoke-virtual {v12, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    goto :goto_6

    .line 257
    :catchall_1
    move-exception v0

    .line 258
    goto :goto_a

    .line 259
    :cond_c
    new-instance v0, Ljava/util/ArrayList;

    .line 260
    .line 261
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 265
    .line 266
    .line 267
    move-result-object v11

    .line 268
    :cond_d
    :goto_8
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 269
    .line 270
    .line 271
    move-result v12

    .line 272
    if-eqz v12, :cond_e

    .line 273
    .line 274
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v12

    .line 278
    move-object v14, v12

    .line 279
    check-cast v14, Ljava/lang/reflect/Method;

    .line 280
    .line 281
    invoke-static {v6, v14}, Lqb/k;->q(Ljava/lang/Class;Ljava/lang/reflect/Method;)Z

    .line 282
    .line 283
    .line 284
    move-result v14

    .line 285
    if-eqz v14, :cond_d

    .line 286
    .line 287
    invoke-virtual {v0, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 288
    .line 289
    .line 290
    goto :goto_8

    .line 291
    :cond_e
    new-instance v11, Ljava/util/HashSet;

    .line 292
    .line 293
    invoke-direct {v11}, Ljava/util/HashSet;-><init>()V

    .line 294
    .line 295
    .line 296
    new-instance v12, Ljava/util/ArrayList;

    .line 297
    .line 298
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 299
    .line 300
    .line 301
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    :cond_f
    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 306
    .line 307
    .line 308
    move-result v14

    .line 309
    if-eqz v14, :cond_10

    .line 310
    .line 311
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v14

    .line 315
    move-object v15, v14

    .line 316
    check-cast v15, Ljava/lang/reflect/Method;

    .line 317
    .line 318
    invoke-virtual {v15}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object v15

    .line 322
    invoke-virtual {v11, v15}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 323
    .line 324
    .line 325
    move-result v15

    .line 326
    if-eqz v15, :cond_f

    .line 327
    .line 328
    invoke-virtual {v12, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 329
    .line 330
    .line 331
    goto :goto_9

    .line 332
    :goto_a
    new-instance v12, Lsf/f;

    .line 333
    .line 334
    invoke-direct {v12, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 335
    .line 336
    .line 337
    :cond_10
    invoke-static {v12}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    if-nez v0, :cond_11

    .line 342
    .line 343
    goto :goto_b

    .line 344
    :cond_11
    iget-object v11, v1, Lqb/k;->b:Lia/t;

    .line 345
    .line 346
    const-string v12, "\u6536\u85cf\u8bed\u97f3\u5b9a\u4f4d\u6587\u4ef6\u8def\u5f84\u65b9\u6cd5\u5931\u8d25"

    .line 347
    .line 348
    invoke-virtual {v11, v12, v0}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    sget-object v12, Ltf/t;->g:Ltf/t;

    .line 352
    .line 353
    :goto_b
    check-cast v12, Ljava/util/List;

    .line 354
    .line 355
    new-instance v0, Ljava/util/ArrayList;

    .line 356
    .line 357
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 358
    .line 359
    .line 360
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 361
    .line 362
    .line 363
    move-result-object v11

    .line 364
    :goto_c
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 365
    .line 366
    .line 367
    move-result v12

    .line 368
    if-eqz v12, :cond_16

    .line 369
    .line 370
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    move-result-object v12

    .line 374
    check-cast v12, Ljava/lang/reflect/Method;

    .line 375
    .line 376
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object v14

    .line 380
    invoke-static {v12, v2, v14}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    move-result-object v14

    .line 384
    instance-of v15, v14, Ljava/lang/String;

    .line 385
    .line 386
    if-eqz v15, :cond_12

    .line 387
    .line 388
    check-cast v14, Ljava/lang/String;

    .line 389
    .line 390
    goto :goto_d

    .line 391
    :cond_12
    move-object v14, v2

    .line 392
    :goto_d
    if-eqz v14, :cond_13

    .line 393
    .line 394
    invoke-virtual {v1, v14, v7, v12}, Lqb/k;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)I

    .line 395
    .line 396
    .line 397
    move-result v15

    .line 398
    if-gez v15, :cond_14

    .line 399
    .line 400
    :cond_13
    move-object/from16 v16, v2

    .line 401
    .line 402
    goto :goto_e

    .line 403
    :cond_14
    move-object/from16 v16, v2

    .line 404
    .line 405
    new-instance v2, Lsf/j;

    .line 406
    .line 407
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 408
    .line 409
    .line 410
    move-result-object v15

    .line 411
    invoke-direct {v2, v12, v14, v15}, Lsf/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 412
    .line 413
    .line 414
    :goto_e
    if-eqz v2, :cond_15

    .line 415
    .line 416
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 417
    .line 418
    .line 419
    :cond_15
    move-object/from16 v2, v16

    .line 420
    .line 421
    goto :goto_c

    .line 422
    :cond_16
    move-object/from16 v16, v2

    .line 423
    .line 424
    new-instance v2, La9/h;

    .line 425
    .line 426
    const/16 v7, 0x1c

    .line 427
    .line 428
    invoke-direct {v2, v7}, La9/h;-><init>(I)V

    .line 429
    .line 430
    .line 431
    invoke-static {v0, v2}, Ltf/m;->K1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    invoke-static {v0}, Ltf/m;->v1(Ljava/util/List;)Ljava/lang/Object;

    .line 436
    .line 437
    .line 438
    move-result-object v2

    .line 439
    check-cast v2, Lsf/j;

    .line 440
    .line 441
    if-eqz v2, :cond_17

    .line 442
    .line 443
    iget-object v2, v2, Lsf/j;->g:Ljava/lang/Object;

    .line 444
    .line 445
    invoke-virtual {v9, v6, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    invoke-virtual {v1}, Lqb/k;->z()Ljava/lang/String;

    .line 449
    .line 450
    .line 451
    move-result-object v6

    .line 452
    check-cast v2, Ljava/lang/reflect/Method;

    .line 453
    .line 454
    invoke-static {v13, v6, v10, v2}, Le8/b;->h(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 455
    .line 456
    .line 457
    :cond_17
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 458
    .line 459
    .line 460
    move-result-object v0

    .line 461
    :goto_f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 462
    .line 463
    .line 464
    move-result v2

    .line 465
    if-eqz v2, :cond_18

    .line 466
    .line 467
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 468
    .line 469
    .line 470
    move-result-object v2

    .line 471
    check-cast v2, Lsf/j;

    .line 472
    .line 473
    iget-object v2, v2, Lsf/j;->h:Ljava/lang/Object;

    .line 474
    .line 475
    invoke-interface {v8, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 476
    .line 477
    .line 478
    goto :goto_f

    .line 479
    :cond_18
    invoke-static {v8}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 480
    .line 481
    .line 482
    move-result-object v0

    .line 483
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 484
    .line 485
    .line 486
    move-result-object v0

    .line 487
    :goto_10
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 488
    .line 489
    .line 490
    move-result v2

    .line 491
    if-eqz v2, :cond_19

    .line 492
    .line 493
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 494
    .line 495
    .line 496
    move-result-object v2

    .line 497
    check-cast v2, Ljava/lang/String;

    .line 498
    .line 499
    invoke-interface {v5, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 500
    .line 501
    .line 502
    goto :goto_10

    .line 503
    :cond_19
    invoke-virtual {v1, v4}, Lqb/k;->F(Ljava/lang/Object;)Ljava/lang/String;

    .line 504
    .line 505
    .line 506
    move-result-object v0

    .line 507
    if-eqz v0, :cond_1a

    .line 508
    .line 509
    invoke-interface {v5, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 510
    .line 511
    .line 512
    :cond_1a
    invoke-virtual/range {p0 .. p1}, Lqb/k;->F(Ljava/lang/Object;)Ljava/lang/String;

    .line 513
    .line 514
    .line 515
    move-result-object v0

    .line 516
    if-eqz v0, :cond_1b

    .line 517
    .line 518
    invoke-interface {v5, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 519
    .line 520
    .line 521
    :cond_1b
    new-instance v0, Ldg/n;

    .line 522
    .line 523
    const/4 v2, 0x6

    .line 524
    invoke-direct {v0, v5, v2}, Ldg/n;-><init>(Ljava/lang/Object;I)V

    .line 525
    .line 526
    .line 527
    new-instance v2, Lnb/a;

    .line 528
    .line 529
    const/4 v3, 0x2

    .line 530
    invoke-direct {v2, v1, v3}, Lnb/a;-><init>(Ljava/lang/Object;I)V

    .line 531
    .line 532
    .line 533
    invoke-static {v0, v2}, Lng/m;->X(Lng/j;Lfg/l;)Lng/i;

    .line 534
    .line 535
    .line 536
    move-result-object v0

    .line 537
    invoke-static {v0}, Lng/m;->U(Lng/j;)Ljava/lang/Object;

    .line 538
    .line 539
    .line 540
    move-result-object v0

    .line 541
    check-cast v0, Ljava/lang/String;

    .line 542
    .line 543
    if-eqz v0, :cond_23

    .line 544
    .line 545
    const-string v2, "duration"

    .line 546
    .line 547
    const-string v3, "length"

    .line 548
    .line 549
    const-string v5, "y"

    .line 550
    .line 551
    filled-new-array {v5, v2, v3}, [Ljava/lang/String;

    .line 552
    .line 553
    .line 554
    move-result-object v2

    .line 555
    invoke-static {v4, v2}, Lqb/k;->l(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Number;

    .line 556
    .line 557
    .line 558
    move-result-object v2

    .line 559
    if-eqz v2, :cond_1c

    .line 560
    .line 561
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 562
    .line 563
    .line 564
    move-result-wide v2

    .line 565
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 566
    .line 567
    .line 568
    move-result-object v2

    .line 569
    goto :goto_11

    .line 570
    :cond_1c
    move-object/from16 v2, v16

    .line 571
    .line 572
    :goto_11
    if-eqz v2, :cond_1d

    .line 573
    .line 574
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 575
    .line 576
    .line 577
    move-result-wide v2

    .line 578
    const-wide/16 v4, 0x0

    .line 579
    .line 580
    cmp-long v4, v2, v4

    .line 581
    .line 582
    if-gtz v4, :cond_1e

    .line 583
    .line 584
    :cond_1d
    move-object/from16 v2, v16

    .line 585
    .line 586
    goto :goto_13

    .line 587
    :cond_1e
    const-wide/16 v4, 0x1

    .line 588
    .line 589
    cmp-long v6, v4, v2

    .line 590
    .line 591
    if-gtz v6, :cond_1f

    .line 592
    .line 593
    const-wide/16 v6, 0x259

    .line 594
    .line 595
    cmp-long v6, v2, v6

    .line 596
    .line 597
    if-gez v6, :cond_1f

    .line 598
    .line 599
    const-wide/16 v6, 0x3e8

    .line 600
    .line 601
    mul-long/2addr v2, v6

    .line 602
    :cond_1f
    cmp-long v6, v2, v4

    .line 603
    .line 604
    if-gez v6, :cond_20

    .line 605
    .line 606
    goto :goto_12

    .line 607
    :cond_20
    move-wide v4, v2

    .line 608
    :goto_12
    const-wide/32 v2, 0x7fffffff

    .line 609
    .line 610
    .line 611
    cmp-long v6, v4, v2

    .line 612
    .line 613
    if-lez v6, :cond_21

    .line 614
    .line 615
    move-wide v4, v2

    .line 616
    :cond_21
    long-to-int v2, v4

    .line 617
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 618
    .line 619
    .line 620
    move-result-object v2

    .line 621
    :goto_13
    if-eqz v2, :cond_22

    .line 622
    .line 623
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 624
    .line 625
    .line 626
    move-result v2

    .line 627
    goto :goto_14

    .line 628
    :cond_22
    const/16 v2, 0x3e8

    .line 629
    .line 630
    :goto_14
    new-instance v3, Lqb/i;

    .line 631
    .line 632
    const/4 v4, 0x0

    .line 633
    invoke-direct {v3, v0, v2, v4}, Lqb/i;-><init>(Ljava/lang/String;IZ)V

    .line 634
    .line 635
    .line 636
    return-object v3

    .line 637
    :cond_23
    :goto_15
    return-object v16
.end method

.method public final C(ILjava/lang/Object;Ljava/util/Set;)Ljava/lang/Object;
    .locals 6

    .line 1
    if-eqz p2, :cond_f

    .line 2
    .line 3
    const/4 v0, 0x5

    .line 4
    if-gt p1, v0, :cond_f

    .line 5
    .line 6
    invoke-interface {p3, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    goto/16 :goto_4

    .line 13
    .line 14
    :cond_0
    const-string v0, "com.tencent.mm.storage."

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-static {v0, p2, v1}, Leh/a;->z(Ljava/lang/String;Ljava/lang/Object;Z)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_4

    .line 22
    .line 23
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_5

    .line 49
    .line 50
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    check-cast v2, Ljava/lang/reflect/Method;

    .line 55
    .line 56
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    array-length v3, v3

    .line 64
    if-nez v3, :cond_2

    .line 65
    .line 66
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    const-string v4, "getMsgId"

    .line 71
    .line 72
    invoke-static {v3, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    if-nez v3, :cond_3

    .line 77
    .line 78
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    const-string v4, "getMsgID"

    .line 83
    .line 84
    invoke-static {v3, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    if-eqz v3, :cond_2

    .line 89
    .line 90
    :cond_3
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    sget-object v4, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 95
    .line 96
    invoke-static {v3, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    if-nez v3, :cond_4

    .line 101
    .line 102
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    const-class v3, Ljava/lang/Long;

    .line 107
    .line 108
    invoke-static {v2, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    if-eqz v2, :cond_2

    .line 113
    .line 114
    :cond_4
    invoke-virtual {p0, p2}, Lqb/k;->y(Ljava/lang/Object;)J

    .line 115
    .line 116
    .line 117
    move-result-wide v2

    .line 118
    const-wide/16 v4, 0x0

    .line 119
    .line 120
    cmp-long v0, v2, v4

    .line 121
    .line 122
    if-lez v0, :cond_5

    .line 123
    .line 124
    return-object p2

    .line 125
    :cond_5
    :goto_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    const-string v2, "java."

    .line 134
    .line 135
    invoke-static {v0, v2, v1}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 136
    .line 137
    .line 138
    move-result v2

    .line 139
    if-nez v2, :cond_f

    .line 140
    .line 141
    const-string v2, "android."

    .line 142
    .line 143
    invoke-static {v0, v2, v1}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    if-eqz v0, :cond_6

    .line 148
    .line 149
    goto/16 :goto_4

    .line 150
    .line 151
    :cond_6
    instance-of v0, p2, Landroid/view/View;

    .line 152
    .line 153
    if-eqz v0, :cond_7

    .line 154
    .line 155
    check-cast p2, Landroid/view/View;

    .line 156
    .line 157
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object p2

    .line 161
    add-int/lit8 p1, p1, 0x1

    .line 162
    .line 163
    invoke-virtual {p0, p1, p2, p3}, Lqb/k;->C(ILjava/lang/Object;Ljava/util/Set;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    return-object p1

    .line 168
    :cond_7
    instance-of v0, p2, [Ljava/lang/Object;

    .line 169
    .line 170
    if-eqz v0, :cond_9

    .line 171
    .line 172
    check-cast p2, [Ljava/lang/Object;

    .line 173
    .line 174
    array-length v0, p2

    .line 175
    :goto_1
    if-ge v1, v0, :cond_f

    .line 176
    .line 177
    aget-object v2, p2, v1

    .line 178
    .line 179
    add-int/lit8 v3, p1, 0x1

    .line 180
    .line 181
    invoke-virtual {p0, v3, v2, p3}, Lqb/k;->C(ILjava/lang/Object;Ljava/util/Set;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    if-eqz v2, :cond_8

    .line 186
    .line 187
    return-object v2

    .line 188
    :cond_8
    add-int/lit8 v1, v1, 0x1

    .line 189
    .line 190
    goto :goto_1

    .line 191
    :cond_9
    instance-of v0, p2, Ljava/util/Collection;

    .line 192
    .line 193
    if-eqz v0, :cond_b

    .line 194
    .line 195
    check-cast p2, Ljava/lang/Iterable;

    .line 196
    .line 197
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 198
    .line 199
    .line 200
    move-result-object p2

    .line 201
    :cond_a
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 202
    .line 203
    .line 204
    move-result v0

    .line 205
    if-eqz v0, :cond_f

    .line 206
    .line 207
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    add-int/lit8 v1, p1, 0x1

    .line 212
    .line 213
    invoke-virtual {p0, v1, v0, p3}, Lqb/k;->C(ILjava/lang/Object;Ljava/util/Set;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    if-eqz v0, :cond_a

    .line 218
    .line 219
    return-object v0

    .line 220
    :cond_b
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    :goto_2
    if-eqz v0, :cond_f

    .line 225
    .line 226
    const-class v1, Ljava/lang/Object;

    .line 227
    .line 228
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    move-result v1

    .line 232
    if-nez v1, :cond_f

    .line 233
    .line 234
    invoke-static {v0}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    :cond_c
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 243
    .line 244
    .line 245
    move-result v2

    .line 246
    if-eqz v2, :cond_e

    .line 247
    .line 248
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v2

    .line 252
    check-cast v2, Ljava/lang/reflect/Field;

    .line 253
    .line 254
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 255
    .line 256
    .line 257
    move-result-object v3

    .line 258
    invoke-virtual {v3}, Ljava/lang/Class;->isPrimitive()Z

    .line 259
    .line 260
    .line 261
    move-result v4

    .line 262
    if-nez v4, :cond_c

    .line 263
    .line 264
    invoke-virtual {v3}, Ljava/lang/Class;->isArray()Z

    .line 265
    .line 266
    .line 267
    move-result v4

    .line 268
    if-nez v4, :cond_c

    .line 269
    .line 270
    const-class v4, Ljava/lang/String;

    .line 271
    .line 272
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 273
    .line 274
    .line 275
    move-result v3

    .line 276
    if-eqz v3, :cond_d

    .line 277
    .line 278
    goto :goto_3

    .line 279
    :cond_d
    invoke-static {v2, p2}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v2

    .line 283
    if-eqz v2, :cond_c

    .line 284
    .line 285
    add-int/lit8 v3, p1, 0x1

    .line 286
    .line 287
    invoke-virtual {p0, v3, v2, p3}, Lqb/k;->C(ILjava/lang/Object;Ljava/util/Set;)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v2

    .line 291
    if-eqz v2, :cond_c

    .line 292
    .line 293
    return-object v2

    .line 294
    :cond_e
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    goto :goto_2

    .line 299
    :cond_f
    :goto_4
    const/4 p1, 0x0

    .line 300
    return-object p1
.end method

.method public final D(Ljava/lang/Object;)Lqb/i;
    .locals 12

    .line 1
    const-string v0, "voicePath"

    .line 2
    .line 3
    const-string v1, "fileName"

    .line 4
    .line 5
    const-string v2, "field_imgPath"

    .line 6
    .line 7
    const-string v3, "imgPath"

    .line 8
    .line 9
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x0

    .line 14
    move v2, v1

    .line 15
    :goto_0
    const-string v3, ""

    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    const/4 v5, 0x4

    .line 19
    if-lt v2, v5, :cond_7

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object v6

    .line 25
    iget-object v7, p0, Lqb/k;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 26
    .line 27
    invoke-virtual {v7, v6}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Ljava/lang/reflect/Method;

    .line 32
    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    goto :goto_3

    .line 36
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object v8

    .line 40
    const-string v0, "getFileName"

    .line 41
    .line 42
    const-string v2, "getVoiceFileName"

    .line 43
    .line 44
    const-string v9, "z0"

    .line 45
    .line 46
    const-string v10, "m0"

    .line 47
    .line 48
    filled-new-array {v9, v10, v0, v2}, [Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v9

    .line 52
    move v0, v1

    .line 53
    :goto_1
    if-lt v0, v5, :cond_1

    .line 54
    .line 55
    move-object v0, v4

    .line 56
    goto :goto_2

    .line 57
    :cond_1
    aget-object v2, v9, v0

    .line 58
    .line 59
    new-array v10, v1, [Ljava/lang/Class;

    .line 60
    .line 61
    invoke-static {v8, v2, v10}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    if-eqz v2, :cond_6

    .line 66
    .line 67
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    move-result-object v10

    .line 71
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    array-length v10, v10

    .line 75
    if-nez v10, :cond_6

    .line 76
    .line 77
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    move-result-object v10

    .line 81
    const-class v11, Ljava/lang/String;

    .line 82
    .line 83
    invoke-static {v10, v11}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v10

    .line 87
    if-eqz v10, :cond_6

    .line 88
    .line 89
    move-object v0, v2

    .line 90
    :goto_2
    if-eqz v0, :cond_2

    .line 91
    .line 92
    invoke-virtual {v7, v6, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_2
    move-object v0, v4

    .line 97
    :goto_3
    if-eqz v0, :cond_5

    .line 98
    .line 99
    new-array v2, v1, [Ljava/lang/Object;

    .line 100
    .line 101
    invoke-static {v0, p1, v2}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    instance-of v2, v0, Ljava/lang/String;

    .line 106
    .line 107
    if-eqz v2, :cond_3

    .line 108
    .line 109
    check-cast v0, Ljava/lang/String;

    .line 110
    .line 111
    goto :goto_4

    .line 112
    :cond_3
    move-object v0, v4

    .line 113
    :goto_4
    if-eqz v0, :cond_5

    .line 114
    .line 115
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    if-nez v2, :cond_4

    .line 120
    .line 121
    goto :goto_5

    .line 122
    :cond_4
    move-object v0, v4

    .line 123
    :goto_5
    if-eqz v0, :cond_5

    .line 124
    .line 125
    goto :goto_8

    .line 126
    :cond_5
    move-object v0, v3

    .line 127
    goto :goto_8

    .line 128
    :cond_6
    add-int/lit8 v0, v0, 0x1

    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_7
    aget-object v5, v0, v2

    .line 132
    .line 133
    invoke-static {p1, v5}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v5

    .line 137
    instance-of v6, v5, Ljava/lang/String;

    .line 138
    .line 139
    if-eqz v6, :cond_8

    .line 140
    .line 141
    check-cast v5, Ljava/lang/String;

    .line 142
    .line 143
    goto :goto_6

    .line 144
    :cond_8
    move-object v5, v4

    .line 145
    :goto_6
    if-eqz v5, :cond_15

    .line 146
    .line 147
    invoke-static {v5}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 148
    .line 149
    .line 150
    move-result v6

    .line 151
    if-nez v6, :cond_9

    .line 152
    .line 153
    goto :goto_7

    .line 154
    :cond_9
    move-object v5, v4

    .line 155
    :goto_7
    if-eqz v5, :cond_15

    .line 156
    .line 157
    move-object v0, v5

    .line 158
    :goto_8
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 159
    .line 160
    .line 161
    move-result v2

    .line 162
    if-nez v2, :cond_a

    .line 163
    .line 164
    move-object v6, v0

    .line 165
    goto :goto_9

    .line 166
    :cond_a
    move-object v6, v4

    .line 167
    :goto_9
    if-eqz v6, :cond_14

    .line 168
    .line 169
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->media()Lj8/p;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    if-eqz v0, :cond_b

    .line 174
    .line 175
    iget-object v0, v0, Lj8/p;->b:Lj8/y;

    .line 176
    .line 177
    if-eqz v0, :cond_b

    .line 178
    .line 179
    invoke-virtual {v0, v6}, Lj8/y;->q(Ljava/lang/String;)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    goto :goto_a

    .line 184
    :cond_b
    move-object v0, v4

    .line 185
    :goto_a
    if-nez v0, :cond_c

    .line 186
    .line 187
    goto :goto_b

    .line 188
    :cond_c
    move-object v3, v0

    .line 189
    :goto_b
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 190
    .line 191
    .line 192
    move-result v0

    .line 193
    if-nez v0, :cond_14

    .line 194
    .line 195
    invoke-static {v3}, Leh/a;->y(Ljava/lang/String;)Z

    .line 196
    .line 197
    .line 198
    move-result v0

    .line 199
    if-nez v0, :cond_d

    .line 200
    .line 201
    goto :goto_f

    .line 202
    :cond_d
    new-instance v2, Lqb/i;

    .line 203
    .line 204
    invoke-virtual {p0, p1}, Lqb/k;->y(Ljava/lang/Object;)J

    .line 205
    .line 206
    .line 207
    move-result-wide v7

    .line 208
    :try_start_0
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->messageStore()Lk8/s;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    if-eqz v0, :cond_e

    .line 213
    .line 214
    invoke-virtual {v0, v7, v8}, Lk8/s;->c(J)Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 215
    .line 216
    .line 217
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 218
    goto :goto_d

    .line 219
    :catchall_0
    move-exception v0

    .line 220
    goto :goto_c

    .line 221
    :cond_e
    move-object v0, v4

    .line 222
    goto :goto_d

    .line 223
    :goto_c
    new-instance v5, Lsf/f;

    .line 224
    .line 225
    invoke-direct {v5, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 226
    .line 227
    .line 228
    move-object v0, v5

    .line 229
    :goto_d
    nop

    .line 230
    instance-of v5, v0, Lsf/f;

    .line 231
    .line 232
    if-eqz v5, :cond_f

    .line 233
    .line 234
    move-object v0, v4

    .line 235
    :cond_f
    check-cast v0, Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 236
    .line 237
    invoke-static {}, La/a;->E()Luf/c;

    .line 238
    .line 239
    .line 240
    move-result-object v5

    .line 241
    if-eqz v0, :cond_11

    .line 242
    .line 243
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->bodyContent()Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v9

    .line 247
    if-eqz v9, :cond_11

    .line 248
    .line 249
    invoke-static {v9}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 250
    .line 251
    .line 252
    move-result v10

    .line 253
    if-nez v10, :cond_10

    .line 254
    .line 255
    goto :goto_e

    .line 256
    :cond_10
    move-object v9, v4

    .line 257
    :goto_e
    if-eqz v9, :cond_11

    .line 258
    .line 259
    invoke-virtual {v5, v9}, Luf/c;->add(Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    :cond_11
    if-eqz v0, :cond_13

    .line 263
    .line 264
    iget-object v0, v0, Lh/Hchat/hooks/api/model/WeChatMessage;->content:Ljava/lang/String;

    .line 265
    .line 266
    if-eqz v0, :cond_13

    .line 267
    .line 268
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 269
    .line 270
    .line 271
    move-result v9

    .line 272
    if-nez v9, :cond_12

    .line 273
    .line 274
    move-object v4, v0

    .line 275
    :cond_12
    if-eqz v4, :cond_13

    .line 276
    .line 277
    invoke-virtual {v5, v4}, Luf/c;->add(Ljava/lang/Object;)Z

    .line 278
    .line 279
    .line 280
    :cond_13
    invoke-static {v5}, La/a;->t(Luf/c;)Luf/c;

    .line 281
    .line 282
    .line 283
    move-result-object v9

    .line 284
    const/16 v10, 0x3e8

    .line 285
    .line 286
    move-object v5, p1

    .line 287
    invoke-static/range {v5 .. v10}, Lj8/e;->d(Ljava/lang/Object;Ljava/lang/String;JLjava/util/List;I)I

    .line 288
    .line 289
    .line 290
    move-result p1

    .line 291
    invoke-direct {v2, v3, p1, v1}, Lqb/i;-><init>(Ljava/lang/String;IZ)V

    .line 292
    .line 293
    .line 294
    return-object v2

    .line 295
    :cond_14
    :goto_f
    return-object v4

    .line 296
    :cond_15
    move-object v5, p1

    .line 297
    add-int/lit8 v2, v2, 0x1

    .line 298
    .line 299
    move-object p1, v5

    .line 300
    goto/16 :goto_0
.end method

.method public final E(Ljava/io/File;Ljava/io/File;)Z
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/io/File;->isFile()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    :try_start_0
    invoke-virtual {p2}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-nez v2, :cond_1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    const/4 v0, 0x0

    .line 23
    :goto_0
    if-eqz v0, :cond_2

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 26
    .line 27
    .line 28
    goto :goto_1

    .line 29
    :catchall_0
    move-exception p1

    .line 30
    goto/16 :goto_7

    .line 31
    .line 32
    :cond_2
    :goto_1
    invoke-static {p1}, Ldg/l;->c0(Ljava/io/File;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const-string v2, "mp3"

    .line 37
    .line 38
    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 39
    .line 40
    .line 41
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    const/4 v2, 0x1

    .line 43
    if-eqz v0, :cond_3

    .line 44
    .line 45
    move v0, v2

    .line 46
    goto :goto_4

    .line 47
    :cond_3
    :try_start_1
    invoke-virtual {p0}, Lqb/k;->m()Lme/yun/silk/SilkCodec;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-virtual {v0, v3}, Lme/yun/silk/SilkCodec;->getFileType(Ljava/lang/String;)I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    const/4 v3, 0x2

    .line 60
    if-ne v0, v3, :cond_4

    .line 61
    .line 62
    move v0, v2

    .line 63
    goto :goto_2

    .line 64
    :cond_4
    move v0, v1

    .line 65
    :goto_2
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 66
    .line 67
    .line 68
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 69
    goto :goto_3

    .line 70
    :catchall_1
    move-exception v0

    .line 71
    :try_start_2
    new-instance v3, Lsf/f;

    .line 72
    .line 73
    invoke-direct {v3, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 74
    .line 75
    .line 76
    move-object v0, v3

    .line 77
    :goto_3
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 78
    .line 79
    instance-of v4, v0, Lsf/f;

    .line 80
    .line 81
    if-eqz v4, :cond_5

    .line 82
    .line 83
    move-object v0, v3

    .line 84
    :cond_5
    check-cast v0, Ljava/lang/Boolean;

    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    :goto_4
    if-eqz v0, :cond_6

    .line 91
    .line 92
    invoke-static {p1, p2}, Lqb/k;->g(Ljava/io/File;Ljava/io/File;)Z

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    goto :goto_6

    .line 97
    :cond_6
    invoke-virtual {p0}, Lqb/k;->m()Lme/yun/silk/SilkCodec;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    const/16 v4, 0x5dc0

    .line 110
    .line 111
    invoke-virtual {v0, p1, v3, v4}, Lme/yun/silk/SilkCodec;->silkToMp3(Ljava/lang/String;Ljava/lang/String;I)I

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    if-nez p1, :cond_8

    .line 116
    .line 117
    invoke-virtual {p2}, Ljava/io/File;->isFile()Z

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    if-eqz p1, :cond_8

    .line 122
    .line 123
    invoke-virtual {p2}, Ljava/io/File;->length()J

    .line 124
    .line 125
    .line 126
    move-result-wide v3

    .line 127
    const-wide/16 v5, 0x0

    .line 128
    .line 129
    cmp-long p1, v3, v5

    .line 130
    .line 131
    if-gtz p1, :cond_7

    .line 132
    .line 133
    goto :goto_5

    .line 134
    :cond_7
    move v1, v2

    .line 135
    goto :goto_6

    .line 136
    :cond_8
    :goto_5
    invoke-virtual {p2}, Ljava/io/File;->delete()Z

    .line 137
    .line 138
    .line 139
    :goto_6
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 140
    .line 141
    .line 142
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 143
    goto :goto_8

    .line 144
    :goto_7
    new-instance v0, Lsf/f;

    .line 145
    .line 146
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 147
    .line 148
    .line 149
    move-object p1, v0

    .line 150
    :goto_8
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    if-nez v0, :cond_9

    .line 155
    .line 156
    goto :goto_9

    .line 157
    :cond_9
    iget-object p1, p0, Lqb/k;->b:Lia/t;

    .line 158
    .line 159
    const-string v1, "\u8bed\u97f3\u8f6c MP3 \u5931\u8d25"

    .line 160
    .line 161
    invoke-virtual {p1, v1, v0}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    invoke-virtual {p2}, Ljava/io/File;->delete()Z

    .line 165
    .line 166
    .line 167
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 168
    .line 169
    :goto_9
    check-cast p1, Ljava/lang/Boolean;

    .line 170
    .line 171
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 172
    .line 173
    .line 174
    move-result p1

    .line 175
    return p1
.end method

.method public final F(Ljava/lang/Object;)Ljava/lang/String;
    .locals 6

    .line 1
    invoke-static {p1}, Lqb/k;->j(Ljava/lang/Object;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v2

    .line 5
    new-instance v3, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance v0, Ljava/util/WeakHashMap;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-object v4, v0

    .line 23
    check-cast v4, Ljava/util/Set;

    .line 24
    .line 25
    const/4 v5, 0x0

    .line 26
    move-object v0, p0

    .line 27
    move-object v1, p1

    .line 28
    invoke-virtual/range {v0 .. v5}, Lqb/k;->f(Ljava/lang/Object;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/Set;I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    const/4 v1, 0x0

    .line 40
    if-nez v0, :cond_0

    .line 41
    .line 42
    move-object v0, v1

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-nez v2, :cond_1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    move-object v2, v0

    .line 56
    check-cast v2, Lsf/e;

    .line 57
    .line 58
    iget-object v2, v2, Lsf/e;->h:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v2, Ljava/lang/Number;

    .line 61
    .line 62
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    move-object v4, v3

    .line 75
    check-cast v4, Lsf/e;

    .line 76
    .line 77
    iget-object v4, v4, Lsf/e;->h:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v4, Ljava/lang/Number;

    .line 80
    .line 81
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    invoke-virtual {v2, v4}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    .line 90
    .line 91
    .line 92
    move-result v5

    .line 93
    if-gez v5, :cond_3

    .line 94
    .line 95
    move-object v0, v3

    .line 96
    move-object v2, v4

    .line 97
    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 98
    .line 99
    .line 100
    move-result v3

    .line 101
    if-nez v3, :cond_2

    .line 102
    .line 103
    :goto_0
    check-cast v0, Lsf/e;

    .line 104
    .line 105
    if-eqz v0, :cond_4

    .line 106
    .line 107
    iget-object p1, v0, Lsf/e;->g:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast p1, Ljava/lang/String;

    .line 110
    .line 111
    return-object p1

    .line 112
    :cond_4
    return-object v1
.end method

.method public final G(Lqb/i;Ljava/lang/String;)Z
    .locals 4

    .line 1
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->media()Lj8/p;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    iget-object v0, v0, Lj8/p;->b:Lj8/y;

    .line 9
    .line 10
    if-eqz v0, :cond_3

    .line 11
    .line 12
    invoke-virtual {v0}, Lj8/y;->b()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_3

    .line 17
    .line 18
    new-instance v2, Ljava/io/File;

    .line 19
    .line 20
    iget-object v3, p1, Lqb/i;->a:Ljava/lang/String;

    .line 21
    .line 22
    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2}, Ljava/io/File;->isFile()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-nez v2, :cond_0

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_0
    :try_start_0
    iget-object v2, p1, Lqb/i;->a:Ljava/lang/String;

    .line 33
    .line 34
    iget p1, p1, Lqb/i;->b:I

    .line 35
    .line 36
    invoke-virtual {v0, p1, p2, v2}, Lj8/y;->s(ILjava/lang/String;Ljava/lang/String;)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 41
    .line 42
    .line 43
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    goto :goto_0

    .line 45
    :catchall_0
    move-exception p1

    .line 46
    new-instance p2, Lsf/f;

    .line 47
    .line 48
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 49
    .line 50
    .line 51
    move-object p1, p2

    .line 52
    :goto_0
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    if-nez p2, :cond_1

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_1
    iget-object p1, p0, Lqb/k;->b:Lia/t;

    .line 60
    .line 61
    const-string v0, "\u8bed\u97f3\u8f6c\u53d1\u53d1\u9001\u5f02\u5e38"

    .line 62
    .line 63
    invoke-virtual {p1, v0, p2}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 67
    .line 68
    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-nez p1, :cond_2

    .line 75
    .line 76
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->network()Lm8/a;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    if-eqz p1, :cond_3

    .line 81
    .line 82
    iget-object p1, p1, Lm8/a;->a:Lm8/c;

    .line 83
    .line 84
    iget-object p2, p1, Lm8/c;->c:Ljava/lang/Object;

    .line 85
    .line 86
    if-eqz p2, :cond_3

    .line 87
    .line 88
    iget-object p1, p1, Lm8/c;->d:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast p1, Ljava/lang/reflect/Method;

    .line 91
    .line 92
    if-eqz p1, :cond_3

    .line 93
    .line 94
    :cond_2
    const/4 v1, 0x1

    .line 95
    :cond_3
    :goto_2
    return v1
.end method

.method public final H(Landroid/app/Activity;Ljava/util/List;Ljava/util/List;)V
    .locals 8

    .line 1
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-static {p2}, Lqb/k;->e(Ljava/util/Collection;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    new-instance v4, Landroid/os/Handler;

    .line 19
    .line 20
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-direct {v4, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 25
    .line 26
    .line 27
    new-instance v1, Lca/x;

    .line 28
    .line 29
    const/16 v7, 0xc

    .line 30
    .line 31
    move-object v5, p0

    .line 32
    move-object v6, p1

    .line 33
    move-object v3, p2

    .line 34
    move-object v2, p3

    .line 35
    invoke-direct/range {v1 .. v7}, Lca/x;-><init>(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroid/app/Activity;I)V

    .line 36
    .line 37
    .line 38
    iget-object p1, v5, Lqb/k;->q:Ljava/util/concurrent/ExecutorService;

    .line 39
    .line 40
    invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public final I(Landroid/app/Activity;Ljava/util/ArrayList;Lb/e;Lqb/b;)V
    .locals 8

    .line 1
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object v2, p0, Lqb/k;->l:Ljava/util/Set;

    .line 9
    .line 10
    invoke-interface {v2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    if-eqz v3, :cond_1

    .line 15
    .line 16
    :goto_0
    return-void

    .line 17
    :cond_1
    invoke-interface {v2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lqb/k;->d()Lqb/f;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    if-eqz v2, :cond_2

    .line 25
    .line 26
    iget-object v3, v2, Lqb/f;->a:Ljava/util/List;

    .line 27
    .line 28
    move-object v0, p0

    .line 29
    move-object v1, p1

    .line 30
    move-object v2, p2

    .line 31
    move-object v4, p3

    .line 32
    move-object v5, p4

    .line 33
    invoke-virtual/range {v0 .. v5}, Lqb/k;->K(Landroid/app/Activity;Ljava/util/ArrayList;Ljava/util/List;Lb/e;Lfg/l;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_2
    new-instance v2, Landroid/os/Handler;

    .line 38
    .line 39
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-direct {v2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 44
    .line 45
    .line 46
    new-instance v7, Ljava/lang/Thread;

    .line 47
    .line 48
    new-instance v0, Lc9/w;

    .line 49
    .line 50
    move-object v1, p0

    .line 51
    move-object v3, p1

    .line 52
    move-object v4, p2

    .line 53
    move-object v5, p3

    .line 54
    move-object v6, p4

    .line 55
    invoke-direct/range {v0 .. v6}, Lc9/w;-><init>(Lqb/k;Landroid/os/Handler;Landroid/app/Activity;Ljava/util/ArrayList;Lb/e;Lfg/l;)V

    .line 56
    .line 57
    .line 58
    const-string v1, "Hchat-VoiceForwardContacts"

    .line 59
    .line 60
    invoke-direct {v7, v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v7}, Ljava/lang/Thread;->start()V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public final J(Landroid/app/Activity;Lqb/i;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lqb/k;->l:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lqb/k;->d()Lqb/f;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget-object v0, v0, Lqb/f;->a:Ljava/util/List;

    .line 20
    .line 21
    invoke-virtual {p0, p1, p2, v0}, Lqb/k;->L(Landroid/app/Activity;Lqb/i;Ljava/util/List;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    new-instance v3, Landroid/os/Handler;

    .line 26
    .line 27
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-direct {v3, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 32
    .line 33
    .line 34
    new-instance v0, Ljava/lang/Thread;

    .line 35
    .line 36
    new-instance v1, Lb9/c;

    .line 37
    .line 38
    const/16 v6, 0x10

    .line 39
    .line 40
    move-object v2, p0

    .line 41
    move-object v4, p1

    .line 42
    move-object v5, p2

    .line 43
    invoke-direct/range {v1 .. v6}, Lb9/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 44
    .line 45
    .line 46
    const-string p1, "Hchat-VoiceForwardContacts"

    .line 47
    .line 48
    invoke-direct {v0, v1, p1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public final K(Landroid/app/Activity;Ljava/util/ArrayList;Ljava/util/List;Lb/e;Lfg/l;)V
    .locals 19

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-static/range {p2 .. p2}, Lqb/k;->e(Ljava/util/Collection;)V

    .line 10
    .line 11
    .line 12
    move-object/from16 v2, p0

    .line 13
    .line 14
    iget-object v1, v2, Lqb/k;->l:Ljava/util/Set;

    .line 15
    .line 16
    invoke-interface {v1, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    const-string v1, "\u6ca1\u6709\u53ef\u7528\u8054\u7cfb\u4eba"

    .line 20
    .line 21
    invoke-static {v0, v1}, Lqb/k;->N(Landroid/app/Activity;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    move-object/from16 v2, p0

    .line 26
    .line 27
    new-instance v7, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    invoke-direct {v7, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 31
    .line 32
    .line 33
    new-instance v8, Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-static/range {p3 .. p3}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    invoke-direct {v8, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 40
    .line 41
    .line 42
    invoke-interface/range {p3 .. p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-eqz v3, :cond_1

    .line 51
    .line 52
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    check-cast v3, Lqb/g;

    .line 57
    .line 58
    new-instance v9, Lwb/jv;

    .line 59
    .line 60
    iget-object v10, v3, Lqb/g;->a:Ljava/lang/String;

    .line 61
    .line 62
    iget-object v11, v3, Lqb/g;->b:Ljava/lang/String;

    .line 63
    .line 64
    iget-boolean v12, v3, Lqb/g;->c:Z

    .line 65
    .line 66
    iget-object v13, v3, Lqb/g;->d:Ljava/lang/String;

    .line 67
    .line 68
    iget-object v14, v3, Lqb/g;->e:Ljava/lang/String;

    .line 69
    .line 70
    iget-object v15, v3, Lqb/g;->f:Ljava/util/List;

    .line 71
    .line 72
    iget-object v3, v3, Lqb/g;->g:Ljava/util/List;

    .line 73
    .line 74
    const/16 v18, 0x40

    .line 75
    .line 76
    const/16 v16, 0x0

    .line 77
    .line 78
    move-object/from16 v17, v3

    .line 79
    .line 80
    invoke-direct/range {v9 .. v18}, Lwb/jv;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/util/List;I)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_1
    new-instance v1, Leb/o;

    .line 88
    .line 89
    const/4 v6, 0x4

    .line 90
    move-object/from16 v4, p2

    .line 91
    .line 92
    move-object/from16 v5, p4

    .line 93
    .line 94
    move-object v3, v0

    .line 95
    move-object v0, v1

    .line 96
    move-object/from16 v1, p5

    .line 97
    .line 98
    invoke-direct/range {v0 .. v6}, Leb/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 99
    .line 100
    .line 101
    move-object v6, v0

    .line 102
    new-instance v0, Lc9/n0;

    .line 103
    .line 104
    const/4 v5, 0x7

    .line 105
    move-object/from16 v2, p0

    .line 106
    .line 107
    move-object/from16 v4, p1

    .line 108
    .line 109
    move-object/from16 v3, p2

    .line 110
    .line 111
    move-object v1, v7

    .line 112
    invoke-direct/range {v0 .. v5}, Lc9/n0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 113
    .line 114
    .line 115
    new-instance v7, Lc9/v;

    .line 116
    .line 117
    const/4 v2, 0x1

    .line 118
    invoke-direct {v7, v1, v2}, Lc9/v;-><init>(Ljava/util/concurrent/atomic/AtomicBoolean;I)V

    .line 119
    .line 120
    .line 121
    const/4 v9, 0x0

    .line 122
    const/16 v10, 0xf70

    .line 123
    .line 124
    const/4 v4, 0x0

    .line 125
    const/4 v5, 0x0

    .line 126
    move-object v2, v6

    .line 127
    const/4 v6, 0x0

    .line 128
    move-object v1, v8

    .line 129
    const/4 v8, 0x0

    .line 130
    move-object v3, v0

    .line 131
    move-object/from16 v0, p1

    .line 132
    .line 133
    invoke-static/range {v0 .. v10}, Lwb/y2;->U1(Landroid/app/Activity;Ljava/util/List;Lfg/l;Lfg/a;Ljava/lang/String;Ljava/lang/String;ZLc9/v;Ljava/util/Set;ZI)V

    .line 134
    .line 135
    .line 136
    return-void
.end method

.method public final L(Landroid/app/Activity;Lqb/i;Ljava/util/List;)V
    .locals 12

    .line 1
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object p2, p0, Lqb/k;->l:Ljava/util/Set;

    .line 8
    .line 9
    invoke-interface {p2, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    const-string p2, "\u6ca1\u6709\u53ef\u7528\u8054\u7cfb\u4eba"

    .line 13
    .line 14
    invoke-static {p1, p2}, Lqb/k;->N(Landroid/app/Activity;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-static {p3}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 25
    .line 26
    .line 27
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object p3

    .line 31
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, Lqb/g;

    .line 42
    .line 43
    new-instance v2, Lwb/jv;

    .line 44
    .line 45
    iget-object v3, v0, Lqb/g;->a:Ljava/lang/String;

    .line 46
    .line 47
    iget-object v4, v0, Lqb/g;->b:Ljava/lang/String;

    .line 48
    .line 49
    iget-boolean v5, v0, Lqb/g;->c:Z

    .line 50
    .line 51
    iget-object v6, v0, Lqb/g;->d:Ljava/lang/String;

    .line 52
    .line 53
    iget-object v7, v0, Lqb/g;->e:Ljava/lang/String;

    .line 54
    .line 55
    iget-object v8, v0, Lqb/g;->f:Ljava/util/List;

    .line 56
    .line 57
    iget-object v10, v0, Lqb/g;->g:Ljava/util/List;

    .line 58
    .line 59
    const/16 v11, 0x40

    .line 60
    .line 61
    const/4 v9, 0x0

    .line 62
    invoke-direct/range {v2 .. v11}, Lwb/jv;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/util/List;I)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_1
    new-instance v2, Lb0/s;

    .line 70
    .line 71
    const/16 p3, 0x10

    .line 72
    .line 73
    invoke-direct {v2, p0, p1, p2, p3}, Lb0/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 74
    .line 75
    .line 76
    new-instance v3, Lqb/c;

    .line 77
    .line 78
    const/4 p2, 0x0

    .line 79
    invoke-direct {v3, p0, p1, p2}, Lqb/c;-><init>(Lqb/k;Landroid/app/Activity;I)V

    .line 80
    .line 81
    .line 82
    const/4 v9, 0x0

    .line 83
    const/16 v10, 0xff0

    .line 84
    .line 85
    const/4 v4, 0x0

    .line 86
    const/4 v5, 0x0

    .line 87
    const/4 v6, 0x0

    .line 88
    const/4 v7, 0x0

    .line 89
    const/4 v8, 0x0

    .line 90
    move-object v0, p1

    .line 91
    invoke-static/range {v0 .. v10}, Lwb/y2;->U1(Landroid/app/Activity;Ljava/util/List;Lfg/l;Lfg/a;Ljava/lang/String;Ljava/lang/String;ZLc9/v;Ljava/util/Set;ZI)V

    .line 92
    .line 93
    .line 94
    return-void
.end method

.method public final O(Ljava/lang/String;)Z
    .locals 3

    .line 1
    const-string v0, "voice_forward_enable"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lqb/k;->c:Landroid/content/SharedPreferences;

    .line 5
    .line 6
    invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-interface {v2, p1, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1
.end method

.method public final c()Ljava/io/File;
    .locals 5

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    invoke-virtual {p0}, Lqb/k;->n()Ljava/io/File;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-string v2, "Voice"

    .line 8
    .line 9
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-nez v1, :cond_0

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    return-object v0

    .line 26
    :cond_0
    new-instance v1, Ljava/text/SimpleDateFormat;

    .line 27
    .line 28
    const-string v2, "yyyyMMdd_HHmmss_SSS"

    .line 29
    .line 30
    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 31
    .line 32
    invoke-direct {v1, v2, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 33
    .line 34
    .line 35
    new-instance v2, Ljava/util/Date;

    .line 36
    .line 37
    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, v2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    new-instance v2, Ljava/io/File;

    .line 45
    .line 46
    const-string v3, "Hchat_voice_"

    .line 47
    .line 48
    const-string v4, ".mp3"

    .line 49
    .line 50
    invoke-static {v3, v1, v4}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-direct {v2, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return-object v2
.end method

.method public final d()Lqb/f;
    .locals 6

    .line 1
    iget-object v0, p0, Lqb/k;->r:Lqb/f;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget-object v2, v0, Lqb/f;->a:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 15
    .line 16
    .line 17
    move-result-wide v2

    .line 18
    iget-wide v4, v0, Lqb/f;->b:J

    .line 19
    .line 20
    sub-long/2addr v2, v4

    .line 21
    const-wide/32 v4, 0xea60

    .line 22
    .line 23
    .line 24
    cmp-long v2, v2, v4

    .line 25
    .line 26
    if-gtz v2, :cond_0

    .line 27
    .line 28
    return-object v0

    .line 29
    :cond_0
    iput-object v1, p0, Lqb/k;->r:Lqb/f;

    .line 30
    .line 31
    :cond_1
    return-object v1
.end method

.method public final f(Ljava/lang/Object;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/Set;I)V
    .locals 10

    .line 1
    if-eqz p1, :cond_18

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    if-gt p5, v1, :cond_18

    .line 5
    .line 6
    invoke-interface {p4, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    goto/16 :goto_9

    .line 13
    .line 14
    :cond_0
    instance-of v1, p1, Ljava/lang/String;

    .line 15
    .line 16
    const/4 v8, 0x1

    .line 17
    const/4 v2, 0x0

    .line 18
    if-eqz v1, :cond_10

    .line 19
    .line 20
    move-object v0, p1

    .line 21
    check-cast v0, Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    const/4 v3, -0x1

    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    goto/16 :goto_2

    .line 31
    .line 32
    :cond_1
    const/16 v1, 0x2f

    .line 33
    .line 34
    invoke-static {v0, v1}, Log/m;->i0(Ljava/lang/CharSequence;C)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-nez v1, :cond_2

    .line 39
    .line 40
    const-string v1, "://"

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-nez v1, :cond_2

    .line 47
    .line 48
    goto/16 :goto_2

    .line 49
    .line 50
    :cond_2
    new-instance v1, Ljava/io/File;

    .line 51
    .line 52
    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, v0}, Lqb/k;->A(Ljava/lang/String;)Z

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    if-nez v4, :cond_3

    .line 60
    .line 61
    goto/16 :goto_2

    .line 62
    .line 63
    :cond_3
    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 64
    .line 65
    invoke-static {v3, v0, v3}, Lj8/b;->l(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v5, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    if-nez v5, :cond_4

    .line 88
    .line 89
    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    invoke-static {v5, p2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v5

    .line 97
    if-eqz v5, :cond_4

    .line 98
    .line 99
    const/16 v5, 0x1e

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_4
    move v5, v2

    .line 103
    :goto_0
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 104
    .line 105
    .line 106
    move-result v6

    .line 107
    if-nez v6, :cond_5

    .line 108
    .line 109
    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v6

    .line 113
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    invoke-static {v6, p2, v2}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 117
    .line 118
    .line 119
    move-result v6

    .line 120
    if-eqz v6, :cond_5

    .line 121
    .line 122
    add-int/lit8 v5, v5, 0x18

    .line 123
    .line 124
    :cond_5
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 125
    .line 126
    .line 127
    move-result v6

    .line 128
    if-nez v6, :cond_6

    .line 129
    .line 130
    invoke-static {v0, p2, v2}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 131
    .line 132
    .line 133
    move-result p2

    .line 134
    if-eqz p2, :cond_6

    .line 135
    .line 136
    add-int/lit8 v5, v5, 0x12

    .line 137
    .line 138
    :cond_6
    const-string p2, "_t"

    .line 139
    .line 140
    invoke-static {v3, p2, v2}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 141
    .line 142
    .line 143
    move-result p2

    .line 144
    if-nez p2, :cond_7

    .line 145
    .line 146
    add-int/lit8 v5, v5, 0xc

    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_7
    add-int/lit8 v5, v5, -0x1e

    .line 150
    .line 151
    :goto_1
    const-string p2, ".silk"

    .line 152
    .line 153
    invoke-static {v3, p2, v2}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 154
    .line 155
    .line 156
    move-result p2

    .line 157
    if-nez p2, :cond_8

    .line 158
    .line 159
    const-string p2, ".slk"

    .line 160
    .line 161
    invoke-static {v3, p2, v2}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 162
    .line 163
    .line 164
    move-result p2

    .line 165
    if-nez p2, :cond_8

    .line 166
    .line 167
    const-string p2, ".amr"

    .line 168
    .line 169
    invoke-static {v3, p2, v2}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 170
    .line 171
    .line 172
    move-result p2

    .line 173
    if-nez p2, :cond_8

    .line 174
    .line 175
    const-string p2, ".spx"

    .line 176
    .line 177
    invoke-static {v3, p2, v2}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 178
    .line 179
    .line 180
    move-result p2

    .line 181
    if-nez p2, :cond_8

    .line 182
    .line 183
    const-string p2, ".speex"

    .line 184
    .line 185
    invoke-static {v3, p2, v2}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 186
    .line 187
    .line 188
    move-result p2

    .line 189
    if-nez p2, :cond_8

    .line 190
    .line 191
    const-string p2, ".mp3"

    .line 192
    .line 193
    invoke-static {v3, p2, v2}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 194
    .line 195
    .line 196
    move-result p2

    .line 197
    if-eqz p2, :cond_9

    .line 198
    .line 199
    :cond_8
    add-int/lit8 v5, v5, 0x10

    .line 200
    .line 201
    :cond_9
    const-string p2, "/favorite"

    .line 202
    .line 203
    invoke-static {v4, p2, v2}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 204
    .line 205
    .line 206
    move-result p2

    .line 207
    if-nez p2, :cond_a

    .line 208
    .line 209
    const-string p2, "/fav/"

    .line 210
    .line 211
    invoke-static {v4, p2, v2}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 212
    .line 213
    .line 214
    move-result p2

    .line 215
    if-eqz p2, :cond_b

    .line 216
    .line 217
    :cond_a
    add-int/lit8 v5, v5, 0x4

    .line 218
    .line 219
    :cond_b
    const-string p2, "voice"

    .line 220
    .line 221
    invoke-static {v4, p2, v2}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 222
    .line 223
    .line 224
    move-result p2

    .line 225
    if-eqz p2, :cond_c

    .line 226
    .line 227
    add-int/lit8 v5, v5, 0x4

    .line 228
    .line 229
    :cond_c
    move v3, v5

    .line 230
    invoke-virtual {v1}, Ljava/io/File;->isFile()Z

    .line 231
    .line 232
    .line 233
    move-result p2

    .line 234
    if-eqz p2, :cond_d

    .line 235
    .line 236
    invoke-virtual {v1}, Ljava/io/File;->length()J

    .line 237
    .line 238
    .line 239
    move-result-wide v0

    .line 240
    const-wide/16 v4, 0x0

    .line 241
    .line 242
    cmp-long p2, v0, v4

    .line 243
    .line 244
    if-lez p2, :cond_d

    .line 245
    .line 246
    add-int/lit8 v3, v3, 0x2

    .line 247
    .line 248
    :cond_d
    :goto_2
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 249
    .line 250
    .line 251
    move-result-object p2

    .line 252
    if-ltz v3, :cond_e

    .line 253
    .line 254
    goto :goto_3

    .line 255
    :cond_e
    move v8, v2

    .line 256
    :goto_3
    if-eqz v8, :cond_f

    .line 257
    .line 258
    goto :goto_4

    .line 259
    :cond_f
    const/4 p2, 0x0

    .line 260
    :goto_4
    if-eqz p2, :cond_18

    .line 261
    .line 262
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 263
    .line 264
    .line 265
    move-result p2

    .line 266
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 267
    .line 268
    .line 269
    move-result-object p2

    .line 270
    new-instance v0, Lsf/e;

    .line 271
    .line 272
    invoke-direct {v0, p1, p2}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {p3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    return-void

    .line 279
    :cond_10
    instance-of v1, p1, [Ljava/lang/Object;

    .line 280
    .line 281
    if-eqz v1, :cond_11

    .line 282
    .line 283
    check-cast p1, [Ljava/lang/Object;

    .line 284
    .line 285
    array-length v1, p1

    .line 286
    move v9, v2

    .line 287
    :goto_5
    if-ge v9, v1, :cond_18

    .line 288
    .line 289
    aget-object v3, p1, v9

    .line 290
    .line 291
    add-int/lit8 v7, p5, 0x1

    .line 292
    .line 293
    move-object v2, p0

    .line 294
    move-object v4, p2

    .line 295
    move-object v5, p3

    .line 296
    move-object v6, p4

    .line 297
    invoke-virtual/range {v2 .. v7}, Lqb/k;->f(Ljava/lang/Object;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/Set;I)V

    .line 298
    .line 299
    .line 300
    add-int/lit8 v9, v9, 0x1

    .line 301
    .line 302
    goto :goto_5

    .line 303
    :cond_11
    instance-of v1, p1, Ljava/util/Collection;

    .line 304
    .line 305
    if-eqz v1, :cond_12

    .line 306
    .line 307
    check-cast p1, Ljava/lang/Iterable;

    .line 308
    .line 309
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 310
    .line 311
    .line 312
    move-result-object p1

    .line 313
    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 314
    .line 315
    .line 316
    move-result v1

    .line 317
    if-eqz v1, :cond_18

    .line 318
    .line 319
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v3

    .line 323
    add-int/lit8 v7, p5, 0x1

    .line 324
    .line 325
    move-object v2, p0

    .line 326
    move-object v4, p2

    .line 327
    move-object v5, p3

    .line 328
    move-object v6, p4

    .line 329
    invoke-virtual/range {v2 .. v7}, Lqb/k;->f(Ljava/lang/Object;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/Set;I)V

    .line 330
    .line 331
    .line 332
    goto :goto_6

    .line 333
    :cond_12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 334
    .line 335
    .line 336
    move-result-object v1

    .line 337
    invoke-virtual {v1}, Ljava/lang/Class;->isArray()Z

    .line 338
    .line 339
    .line 340
    move-result v1

    .line 341
    if-eqz v1, :cond_13

    .line 342
    .line 343
    goto :goto_9

    .line 344
    :cond_13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 345
    .line 346
    .line 347
    move-result-object v1

    .line 348
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object v1

    .line 352
    const-string v3, "android."

    .line 353
    .line 354
    invoke-static {v1, v3, v2}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 355
    .line 356
    .line 357
    move-result v3

    .line 358
    if-nez v3, :cond_18

    .line 359
    .line 360
    const-string v3, "java.lang."

    .line 361
    .line 362
    invoke-static {v1, v3, v2}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 363
    .line 364
    .line 365
    move-result v3

    .line 366
    if-nez v3, :cond_18

    .line 367
    .line 368
    const-string v3, "java.io."

    .line 369
    .line 370
    invoke-static {v1, v3, v2}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 371
    .line 372
    .line 373
    move-result v1

    .line 374
    if-eqz v1, :cond_14

    .line 375
    .line 376
    goto :goto_9

    .line 377
    :cond_14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 378
    .line 379
    .line 380
    move-result-object v1

    .line 381
    :goto_7
    if-eqz v1, :cond_18

    .line 382
    .line 383
    const-class v2, Ljava/lang/Object;

    .line 384
    .line 385
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 386
    .line 387
    .line 388
    move-result v2

    .line 389
    if-nez v2, :cond_18

    .line 390
    .line 391
    invoke-static {v1}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 392
    .line 393
    .line 394
    move-result-object v2

    .line 395
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 396
    .line 397
    .line 398
    move-result-object v9

    .line 399
    :cond_15
    :goto_8
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 400
    .line 401
    .line 402
    move-result v2

    .line 403
    if-eqz v2, :cond_17

    .line 404
    .line 405
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    move-result-object v2

    .line 409
    check-cast v2, Ljava/lang/reflect/Field;

    .line 410
    .line 411
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 412
    .line 413
    .line 414
    move-result-object v3

    .line 415
    invoke-virtual {v3}, Ljava/lang/Class;->isPrimitive()Z

    .line 416
    .line 417
    .line 418
    move-result v3

    .line 419
    if-eqz v3, :cond_16

    .line 420
    .line 421
    goto :goto_8

    .line 422
    :cond_16
    invoke-static {v2, p1}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    move-result-object v3

    .line 426
    if-eqz v3, :cond_15

    .line 427
    .line 428
    add-int/lit8 v7, p5, 0x1

    .line 429
    .line 430
    move-object v2, p0

    .line 431
    move-object v4, p2

    .line 432
    move-object v5, p3

    .line 433
    move-object v6, p4

    .line 434
    invoke-virtual/range {v2 .. v7}, Lqb/k;->f(Ljava/lang/Object;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/Set;I)V

    .line 435
    .line 436
    .line 437
    goto :goto_8

    .line 438
    :cond_17
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 439
    .line 440
    .line 441
    move-result-object v1

    .line 442
    goto :goto_7

    .line 443
    :cond_18
    :goto_9
    return-void
.end method

.method public final h(Ljava/io/File;Ljava/io/File;Ljava/io/File;)Z
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/io/File;->isFile()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Lqb/k;->m()Lme/yun/silk/SilkCodec;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v0, v2}, Lme/yun/silk/SilkCodec;->getFileType(Ljava/lang/String;)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception v0

    .line 27
    new-instance v2, Lsf/f;

    .line 28
    .line 29
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    move-object v0, v2

    .line 33
    :goto_0
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    instance-of v3, v0, Lsf/f;

    .line 38
    .line 39
    if-eqz v3, :cond_1

    .line 40
    .line 41
    move-object v0, v2

    .line 42
    :cond_1
    check-cast v0, Ljava/lang/Number;

    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    const/4 v2, 0x1

    .line 49
    const/16 v3, 0x5dc0

    .line 50
    .line 51
    if-ne v0, v2, :cond_2

    .line 52
    .line 53
    invoke-virtual {p0}, Lqb/k;->m()Lme/yun/silk/SilkCodec;

    .line 54
    .line 55
    .line 56
    move-result-object p3

    .line 57
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {p3, p1, v0, v3}, Lme/yun/silk/SilkCodec;->silkToPcm(Ljava/lang/String;Ljava/lang/String;I)I

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    goto :goto_1

    .line 70
    :cond_2
    new-instance v0, Ljava/io/File;

    .line 71
    .line 72
    invoke-static {p2}, Ldg/l;->e0(Ljava/io/File;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    const-string v5, ".silk"

    .line 77
    .line 78
    invoke-virtual {v4, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    invoke-direct {v0, p3, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p3

    .line 93
    invoke-virtual {p0}, Lqb/k;->m()Lme/yun/silk/SilkCodec;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    invoke-static {p1, p3, v4, v3}, Lme/yun/silk/AacCodec;->autoToSilkCompat(Ljava/lang/String;Ljava/lang/String;Lme/yun/silk/SilkCodec;I)I

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    if-eqz p1, :cond_3

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_3
    invoke-virtual {p0}, Lqb/k;->m()Lme/yun/silk/SilkCodec;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p3

    .line 112
    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-virtual {p1, p3, v0, v3}, Lme/yun/silk/SilkCodec;->silkToPcm(Ljava/lang/String;Ljava/lang/String;I)I

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    :goto_1
    if-nez p1, :cond_4

    .line 121
    .line 122
    invoke-virtual {p2}, Ljava/io/File;->isFile()Z

    .line 123
    .line 124
    .line 125
    move-result p1

    .line 126
    if-eqz p1, :cond_4

    .line 127
    .line 128
    invoke-virtual {p2}, Ljava/io/File;->length()J

    .line 129
    .line 130
    .line 131
    move-result-wide p1

    .line 132
    const-wide/16 v3, 0x0

    .line 133
    .line 134
    cmp-long p1, p1, v3

    .line 135
    .line 136
    if-lez p1, :cond_4

    .line 137
    .line 138
    move v1, v2

    .line 139
    :cond_4
    return v1
.end method

.method public final k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)I
    .locals 6

    .line 1
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_10

    .line 6
    .line 7
    const/16 v0, 0x2f

    .line 8
    .line 9
    invoke-static {p1, v0}, Log/m;->i0(Ljava/lang/CharSequence;C)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    const-string v0, "://"

    .line 17
    .line 18
    invoke-static {p1, v0, v1}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    goto/16 :goto_4

    .line 25
    .line 26
    :cond_0
    new-instance v0, Ljava/io/File;

    .line 27
    .line 28
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 32
    .line 33
    invoke-static {v2, p1, v2}, Lj8/b;->l(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v4, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    if-eqz p3, :cond_1

    .line 52
    .line 53
    invoke-virtual {p3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p3

    .line 57
    goto :goto_0

    .line 58
    :cond_1
    const/4 p3, 0x0

    .line 59
    :goto_0
    if-eqz p3, :cond_7

    .line 60
    .line 61
    invoke-virtual {p3}, Ljava/lang/String;->hashCode()I

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    const/16 v5, 0x58

    .line 66
    .line 67
    if-eq v4, v5, :cond_5

    .line 68
    .line 69
    const/16 v5, 0x77

    .line 70
    .line 71
    if-eq v4, v5, :cond_3

    .line 72
    .line 73
    const/16 v5, 0x78

    .line 74
    .line 75
    if-eq v4, v5, :cond_2

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_2
    const-string v4, "x"

    .line 79
    .line 80
    invoke-virtual {p3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result p3

    .line 84
    if-nez p3, :cond_4

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_3
    const-string v4, "w"

    .line 88
    .line 89
    invoke-virtual {p3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result p3

    .line 93
    if-nez p3, :cond_4

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_4
    const/16 p3, 0x50

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_5
    const-string v4, "X"

    .line 100
    .line 101
    invoke-virtual {p3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result p3

    .line 105
    if-nez p3, :cond_6

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_6
    const/16 p3, -0x14

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_7
    :goto_1
    move p3, v1

    .line 112
    :goto_2
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 113
    .line 114
    .line 115
    move-result v4

    .line 116
    if-nez v4, :cond_8

    .line 117
    .line 118
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    invoke-static {v4, p2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v4

    .line 126
    if-eqz v4, :cond_8

    .line 127
    .line 128
    add-int/lit8 p3, p3, 0x28

    .line 129
    .line 130
    :cond_8
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 131
    .line 132
    .line 133
    move-result v4

    .line 134
    if-nez v4, :cond_9

    .line 135
    .line 136
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    invoke-static {v0, p2, v1}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    if-eqz v0, :cond_9

    .line 148
    .line 149
    add-int/lit8 p3, p3, 0x1e

    .line 150
    .line 151
    :cond_9
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    if-nez v0, :cond_a

    .line 156
    .line 157
    invoke-static {p1, p2, v1}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 158
    .line 159
    .line 160
    move-result p2

    .line 161
    if-eqz p2, :cond_a

    .line 162
    .line 163
    add-int/lit8 p3, p3, 0x14

    .line 164
    .line 165
    :cond_a
    const-string p2, "_t"

    .line 166
    .line 167
    invoke-static {v2, p2, v1}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 168
    .line 169
    .line 170
    move-result p2

    .line 171
    if-nez p2, :cond_b

    .line 172
    .line 173
    add-int/lit8 p3, p3, 0xa

    .line 174
    .line 175
    goto :goto_3

    .line 176
    :cond_b
    add-int/lit8 p3, p3, -0x1e

    .line 177
    .line 178
    :goto_3
    const-string p2, "/favorite"

    .line 179
    .line 180
    invoke-static {v3, p2, v1}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 181
    .line 182
    .line 183
    move-result p2

    .line 184
    if-nez p2, :cond_c

    .line 185
    .line 186
    const-string p2, "/fav/"

    .line 187
    .line 188
    invoke-static {v3, p2, v1}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 189
    .line 190
    .line 191
    move-result p2

    .line 192
    if-eqz p2, :cond_d

    .line 193
    .line 194
    :cond_c
    add-int/lit8 p3, p3, 0x8

    .line 195
    .line 196
    :cond_d
    const-string p2, "voice"

    .line 197
    .line 198
    invoke-static {v3, p2, v1}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 199
    .line 200
    .line 201
    move-result p2

    .line 202
    if-eqz p2, :cond_e

    .line 203
    .line 204
    add-int/lit8 p3, p3, 0x6

    .line 205
    .line 206
    :cond_e
    invoke-virtual {p0, p1}, Lqb/k;->A(Ljava/lang/String;)Z

    .line 207
    .line 208
    .line 209
    move-result p1

    .line 210
    if-eqz p1, :cond_f

    .line 211
    .line 212
    add-int/lit8 p3, p3, 0x18

    .line 213
    .line 214
    :cond_f
    return p3

    .line 215
    :cond_10
    :goto_4
    const/4 p1, -0x1

    .line 216
    return p1
.end method

.method public final m()Lme/yun/silk/SilkCodec;
    .locals 1

    .line 1
    iget-object v0, p0, Lqb/k;->u:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-interface {v0}, Lsf/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lme/yun/silk/SilkCodec;

    .line 8
    .line 9
    return-object v0
.end method

.method public final n()Ljava/io/File;
    .locals 8

    .line 1
    iget-object v0, p0, Lqb/k;->a:Lr8/g;

    .line 2
    .line 3
    iget-object v1, v0, Lr8/g;->a:Landroid/content/Context;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v1, v0, Lr8/g;->a:Landroid/content/Context;

    .line 13
    .line 14
    :goto_0
    const/4 v0, 0x0

    .line 15
    :try_start_0
    invoke-virtual {v1}, Landroid/content/Context;->getExternalMediaDirs()[Ljava/io/File;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    if-eqz v2, :cond_3

    .line 20
    .line 21
    array-length v3, v2

    .line 22
    const/4 v4, 0x0

    .line 23
    move v5, v4

    .line 24
    :goto_1
    if-ge v5, v3, :cond_3

    .line 25
    .line 26
    aget-object v6, v2, v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    if-eqz v6, :cond_1

    .line 29
    .line 30
    const/4 v7, 0x1

    .line 31
    goto :goto_2

    .line 32
    :cond_1
    move v7, v4

    .line 33
    :goto_2
    if-eqz v7, :cond_2

    .line 34
    .line 35
    goto :goto_4

    .line 36
    :cond_2
    add-int/lit8 v5, v5, 0x1

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :catchall_0
    move-exception v2

    .line 40
    goto :goto_3

    .line 41
    :cond_3
    move-object v6, v0

    .line 42
    goto :goto_4

    .line 43
    :goto_3
    new-instance v6, Lsf/f;

    .line 44
    .line 45
    invoke-direct {v6, v2}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 46
    .line 47
    .line 48
    :goto_4
    instance-of v2, v6, Lsf/f;

    .line 49
    .line 50
    if-eqz v2, :cond_4

    .line 51
    .line 52
    goto :goto_5

    .line 53
    :cond_4
    move-object v0, v6

    .line 54
    :goto_5
    check-cast v0, Ljava/io/File;

    .line 55
    .line 56
    new-instance v2, Ljava/io/File;

    .line 57
    .line 58
    if-eqz v0, :cond_5

    .line 59
    .line 60
    goto :goto_6

    .line 61
    :cond_5
    new-instance v0, Ljava/io/File;

    .line 62
    .line 63
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    const-string v3, "/storage/emulated/0/Android/media/"

    .line 68
    .line 69
    invoke-static {v3, v1}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    :goto_6
    const-string v1, "Hchat"

    .line 77
    .line 78
    invoke-direct {v2, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    return-object v2
.end method

.method public final o(Ljava/lang/reflect/Method;Lde/robv/android/xposed/XC_MethodHook;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lqb/k;->f:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x1

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    return v2

    .line 11
    :cond_0
    :try_start_0
    sget-object v1, Lr8/i;->b:Lr8/i;

    .line 12
    .line 13
    invoke-virtual {v1, p1, p2}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    .line 16
    return v2

    .line 17
    :catchall_0
    move-exception p2

    .line 18
    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    new-instance v0, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    const-string v1, "\u8f6c\u53d1\u8bed\u97f3Hook\u5b89\u88c5\u5931\u8d25: "

    .line 28
    .line 29
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iget-object v0, p0, Lqb/k;->b:Lia/t;

    .line 40
    .line 41
    invoke-virtual {v0, p1, p2}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    const/4 p1, 0x0

    .line 45
    return p1
.end method

.method public final p()Z
    .locals 3

    .line 1
    const-string v0, "voice_forward_chat_forward_enable"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lqb/k;->O(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const-string v0, "voice_forward_chat_save_enable"

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lqb/k;->O(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    const-string v0, "voice_forward_chat_multi_forward_enable"

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Lqb/k;->O(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    iget-object v0, p0, Lqb/k;->c:Landroid/content/SharedPreferences;

    .line 26
    .line 27
    const-string v1, "voice_forward_chat_multi_merge_enable"

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_1

    .line 35
    .line 36
    const-string v0, "voice_forward_favorite_forward_enable"

    .line 37
    .line 38
    invoke-virtual {p0, v0}, Lqb/k;->O(Ljava/lang/String;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-nez v0, :cond_1

    .line 43
    .line 44
    const-string v0, "voice_forward_favorite_save_enable"

    .line 45
    .line 46
    invoke-virtual {p0, v0}, Lqb/k;->O(Ljava/lang/String;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_0

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    return v2

    .line 54
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 55
    return v0
.end method

.method public final w(Landroid/app/Activity;Ljava/util/ArrayList;ZLb/e;Ljava/util/List;)V
    .locals 11

    .line 1
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x2

    .line 6
    if-ge v0, v1, :cond_0

    .line 7
    .line 8
    const-string p2, "\u81f3\u5c11\u9009\u62e9\u4e24\u6761\u8bed\u97f3"

    .line 9
    .line 10
    invoke-static {p1, p2}, Lqb/k;->N(Landroid/app/Activity;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    new-instance v4, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-direct {v4, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 18
    .line 19
    .line 20
    new-instance v5, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 21
    .line 22
    invoke-direct {v5, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    const-string v1, "\u6b63\u5728\u5408\u5e76 "

    .line 30
    .line 31
    const-string v2, " \u6761\u8bed\u97f3..."

    .line 32
    .line 33
    invoke-static {v0, v1, v2}, Leh/a;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    new-instance v1, Lc9/h;

    .line 38
    .line 39
    const/4 v2, 0x5

    .line 40
    invoke-direct {v1, v5, v4, v2}, Lc9/h;-><init>(Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/concurrent/atomic/AtomicBoolean;I)V

    .line 41
    .line 42
    .line 43
    const-string v2, "\u5408\u5e76\u8bed\u97f3"

    .line 44
    .line 45
    invoke-static {p1, v1, v2, v0}, Lwb/y2;->X1(Landroid/app/Activity;Lfg/a;Ljava/lang/String;Ljava/lang/String;)Lwb/kv;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    new-instance v10, Ljava/lang/Thread;

    .line 50
    .line 51
    new-instance v0, Lc9/m;

    .line 52
    .line 53
    move-object v1, p0

    .line 54
    move-object v7, p1

    .line 55
    move-object v2, p2

    .line 56
    move v3, p3

    .line 57
    move-object v8, p4

    .line 58
    move-object/from16 v9, p5

    .line 59
    .line 60
    invoke-direct/range {v0 .. v9}, Lc9/m;-><init>(Lqb/k;Ljava/util/ArrayList;ZLjava/util/concurrent/atomic/AtomicBoolean;Ljava/util/concurrent/atomic/AtomicBoolean;Lwb/kv;Landroid/app/Activity;Lb/e;Ljava/util/List;)V

    .line 61
    .line 62
    .line 63
    const-string p1, "Hchat-VoiceMerge"

    .line 64
    .line 65
    invoke-direct {v10, v0, p1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v10}, Ljava/lang/Thread;->start()V

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method public final x(Ljava/util/ArrayList;Z)Lqb/i;
    .locals 20

    .line 1
    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x2

    .line 6
    const/4 v2, 0x0

    .line 7
    if-ge v0, v1, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    new-instance v0, Ljava/io/File;

    .line 11
    .line 12
    invoke-virtual/range {p0 .. p0}, Lqb/k;->n()Ljava/io/File;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const-string v3, "Cache"

    .line 17
    .line 18
    invoke-direct {v0, v1, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_1

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-nez v1, :cond_1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    const-string v1, "Hchat_merged_voice_"

    .line 35
    .line 36
    if-eqz p2, :cond_4

    .line 37
    .line 38
    new-instance v3, Ljava/io/File;

    .line 39
    .line 40
    invoke-virtual/range {p0 .. p0}, Lqb/k;->n()Ljava/io/File;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    const-string v5, "Voice"

    .line 45
    .line 46
    invoke-direct {v3, v4, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3}, Ljava/io/File;->isDirectory()Z

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    if-nez v4, :cond_2

    .line 54
    .line 55
    invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    if-nez v4, :cond_2

    .line 60
    .line 61
    move-object v5, v2

    .line 62
    goto :goto_0

    .line 63
    :cond_2
    new-instance v4, Ljava/text/SimpleDateFormat;

    .line 64
    .line 65
    const-string v5, "yyyyMMdd_HHmmss_SSS"

    .line 66
    .line 67
    sget-object v6, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 68
    .line 69
    invoke-direct {v4, v5, v6}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 70
    .line 71
    .line 72
    new-instance v5, Ljava/util/Date;

    .line 73
    .line 74
    invoke-direct {v5}, Ljava/util/Date;-><init>()V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v4, v5}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    new-instance v5, Ljava/io/File;

    .line 82
    .line 83
    const-string v6, ".mp3"

    .line 84
    .line 85
    invoke-static {v1, v4, v6}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-direct {v5, v3, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    :goto_0
    if-eqz v5, :cond_3

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_3
    :goto_1
    return-object v2

    .line 96
    :cond_4
    new-instance v5, Ljava/io/File;

    .line 97
    .line 98
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 99
    .line 100
    .line 101
    move-result-wide v3

    .line 102
    new-instance v6, Ljava/lang/StringBuilder;

    .line 103
    .line 104
    invoke-direct {v6, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v6, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    const-string v1, ".silk"

    .line 111
    .line 112
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    invoke-direct {v5, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    :goto_2
    new-instance v1, Ljava/io/File;

    .line 123
    .line 124
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 125
    .line 126
    .line 127
    move-result-wide v3

    .line 128
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 129
    .line 130
    .line 131
    move-result-object v6

    .line 132
    invoke-virtual {v6}, Ljava/lang/Thread;->getId()J

    .line 133
    .line 134
    .line 135
    move-result-wide v6

    .line 136
    const-string v8, "voice_merge_"

    .line 137
    .line 138
    const-string v9, "_"

    .line 139
    .line 140
    invoke-static {v3, v4, v8, v9}, Lp/a;->o(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    invoke-virtual {v3, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    invoke-direct {v1, v0, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    if-nez v0, :cond_5

    .line 159
    .line 160
    invoke-virtual {v5}, Ljava/io/File;->delete()Z

    .line 161
    .line 162
    .line 163
    return-object v2

    .line 164
    :cond_5
    const/4 v3, 0x0

    .line 165
    :try_start_0
    new-instance v0, Ljava/io/File;

    .line 166
    .line 167
    const-string v4, "merged.pcm"

    .line 168
    .line 169
    invoke-direct {v0, v1, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 173
    .line 174
    .line 175
    move-result-object v4

    .line 176
    move v6, v3

    .line 177
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 178
    .line 179
    .line 180
    move-result v7

    .line 181
    if-eqz v7, :cond_9

    .line 182
    .line 183
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v7

    .line 187
    add-int/lit8 v8, v6, 0x1

    .line 188
    .line 189
    if-ltz v6, :cond_8

    .line 190
    .line 191
    check-cast v7, Lqb/i;

    .line 192
    .line 193
    new-instance v9, Ljava/io/File;

    .line 194
    .line 195
    new-instance v10, Ljava/lang/StringBuilder;

    .line 196
    .line 197
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 198
    .line 199
    .line 200
    const-string v11, "part_"

    .line 201
    .line 202
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    const-string v6, ".pcm"

    .line 209
    .line 210
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v6

    .line 217
    invoke-direct {v9, v1, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    new-instance v6, Ljava/io/File;

    .line 221
    .line 222
    iget-object v7, v7, Lqb/i;->a:Ljava/lang/String;

    .line 223
    .line 224
    invoke-direct {v6, v7}, Ljava/io/File;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 225
    .line 226
    .line 227
    move-object/from16 v7, p0

    .line 228
    .line 229
    :try_start_1
    invoke-virtual {v7, v6, v9, v1}, Lqb/k;->h(Ljava/io/File;Ljava/io/File;Ljava/io/File;)Z

    .line 230
    .line 231
    .line 232
    move-result v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 233
    const-string v10, "\u7b2c "

    .line 234
    .line 235
    if-eqz v6, :cond_7

    .line 236
    .line 237
    :try_start_2
    invoke-static {v9, v0}, Lqb/k;->b(Ljava/io/File;Ljava/io/File;)Z

    .line 238
    .line 239
    .line 240
    move-result v6

    .line 241
    if-eqz v6, :cond_6

    .line 242
    .line 243
    move v6, v8

    .line 244
    goto :goto_3

    .line 245
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 246
    .line 247
    new-instance v2, Ljava/lang/StringBuilder;

    .line 248
    .line 249
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 256
    .line 257
    .line 258
    const-string v4, " \u6761\u8bed\u97f3\u62fc\u63a5\u5931\u8d25"

    .line 259
    .line 260
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v2

    .line 267
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    throw v0

    .line 271
    :catchall_0
    move-exception v0

    .line 272
    goto/16 :goto_8

    .line 273
    .line 274
    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 275
    .line 276
    new-instance v2, Ljava/lang/StringBuilder;

    .line 277
    .line 278
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 282
    .line 283
    .line 284
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 285
    .line 286
    .line 287
    const-string v4, " \u6761\u8bed\u97f3\u89e3\u7801\u5931\u8d25"

    .line 288
    .line 289
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 290
    .line 291
    .line 292
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v2

    .line 296
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    throw v0

    .line 300
    :catchall_1
    move-exception v0

    .line 301
    move-object/from16 v7, p0

    .line 302
    .line 303
    goto/16 :goto_8

    .line 304
    .line 305
    :cond_8
    move-object/from16 v7, p0

    .line 306
    .line 307
    invoke-static {}, La/a;->Q0()V

    .line 308
    .line 309
    .line 310
    throw v2

    .line 311
    :cond_9
    move-object/from16 v7, p0

    .line 312
    .line 313
    new-instance v2, Ljava/io/File;

    .line 314
    .line 315
    const-string v4, "merged.silk"

    .line 316
    .line 317
    invoke-direct {v2, v1, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {v7}, Lqb/k;->m()Lme/yun/silk/SilkCodec;

    .line 321
    .line 322
    .line 323
    move-result-object v8

    .line 324
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v9

    .line 328
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object v10

    .line 332
    const/16 v12, 0x5dc0

    .line 333
    .line 334
    const/4 v13, 0x1

    .line 335
    const/16 v11, 0x5dc0

    .line 336
    .line 337
    invoke-virtual/range {v8 .. v13}, Lme/yun/silk/SilkCodec;->pcmToSilk(Ljava/lang/String;Ljava/lang/String;III)I

    .line 338
    .line 339
    .line 340
    move-result v0

    .line 341
    if-nez v0, :cond_11

    .line 342
    .line 343
    invoke-virtual {v2}, Ljava/io/File;->isFile()Z

    .line 344
    .line 345
    .line 346
    move-result v4

    .line 347
    if-eqz v4, :cond_11

    .line 348
    .line 349
    invoke-virtual {v2}, Ljava/io/File;->length()J

    .line 350
    .line 351
    .line 352
    move-result-wide v8

    .line 353
    const-wide/16 v10, 0x0

    .line 354
    .line 355
    cmp-long v4, v8, v10

    .line 356
    .line 357
    if-lez v4, :cond_11

    .line 358
    .line 359
    if-eqz p2, :cond_b

    .line 360
    .line 361
    invoke-virtual {v7}, Lqb/k;->m()Lme/yun/silk/SilkCodec;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object v4

    .line 369
    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    move-result-object v6

    .line 373
    const/16 v8, 0x5dc0

    .line 374
    .line 375
    invoke-virtual {v0, v4, v6, v8}, Lme/yun/silk/SilkCodec;->silkToMp3(Ljava/lang/String;Ljava/lang/String;I)I

    .line 376
    .line 377
    .line 378
    move-result v0

    .line 379
    if-nez v0, :cond_a

    .line 380
    .line 381
    invoke-virtual {v5}, Ljava/io/File;->isFile()Z

    .line 382
    .line 383
    .line 384
    move-result v4

    .line 385
    if-eqz v4, :cond_a

    .line 386
    .line 387
    invoke-virtual {v5}, Ljava/io/File;->length()J

    .line 388
    .line 389
    .line 390
    move-result-wide v8

    .line 391
    cmp-long v4, v8, v10

    .line 392
    .line 393
    if-lez v4, :cond_a

    .line 394
    .line 395
    goto :goto_4

    .line 396
    :cond_a
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 397
    .line 398
    new-instance v4, Ljava/lang/StringBuilder;

    .line 399
    .line 400
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 401
    .line 402
    .line 403
    const-string v6, "Silk \u8f6c MP3 \u5931\u8d25: "

    .line 404
    .line 405
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 406
    .line 407
    .line 408
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 409
    .line 410
    .line 411
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object v0

    .line 415
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 416
    .line 417
    .line 418
    throw v2

    .line 419
    :cond_b
    invoke-static {v2, v5}, Lqb/k;->g(Ljava/io/File;Ljava/io/File;)Z

    .line 420
    .line 421
    .line 422
    move-result v0

    .line 423
    if-eqz v0, :cond_10

    .line 424
    .line 425
    invoke-virtual {v5}, Ljava/io/File;->isFile()Z

    .line 426
    .line 427
    .line 428
    move-result v0

    .line 429
    if-eqz v0, :cond_10

    .line 430
    .line 431
    invoke-virtual {v5}, Ljava/io/File;->length()J

    .line 432
    .line 433
    .line 434
    move-result-wide v8
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 435
    cmp-long v0, v8, v10

    .line 436
    .line 437
    if-lez v0, :cond_10

    .line 438
    .line 439
    :goto_4
    const/4 v3, 0x1

    .line 440
    :try_start_3
    invoke-virtual {v7}, Lqb/k;->m()Lme/yun/silk/SilkCodec;

    .line 441
    .line 442
    .line 443
    move-result-object v0

    .line 444
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 445
    .line 446
    .line 447
    move-result-object v2

    .line 448
    invoke-virtual {v0, v2}, Lme/yun/silk/SilkCodec;->getDuration(Ljava/lang/String;)J

    .line 449
    .line 450
    .line 451
    move-result-wide v8

    .line 452
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 453
    .line 454
    .line 455
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 456
    goto :goto_5

    .line 457
    :catchall_2
    move-exception v0

    .line 458
    :try_start_4
    new-instance v2, Lsf/f;

    .line 459
    .line 460
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 461
    .line 462
    .line 463
    move-object v0, v2

    .line 464
    :goto_5
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 465
    .line 466
    .line 467
    move-result-object v2

    .line 468
    instance-of v4, v0, Lsf/f;

    .line 469
    .line 470
    if-eqz v4, :cond_c

    .line 471
    .line 472
    move-object v0, v2

    .line 473
    :cond_c
    check-cast v0, Ljava/lang/Number;

    .line 474
    .line 475
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 476
    .line 477
    .line 478
    move-result-wide v8

    .line 479
    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 480
    .line 481
    .line 482
    move-result-object v0

    .line 483
    move-wide v12, v10

    .line 484
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 485
    .line 486
    .line 487
    move-result v2

    .line 488
    if-eqz v2, :cond_e

    .line 489
    .line 490
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 491
    .line 492
    .line 493
    move-result-object v2

    .line 494
    check-cast v2, Lqb/i;

    .line 495
    .line 496
    iget v2, v2, Lqb/i;->b:I

    .line 497
    .line 498
    int-to-long v14, v2

    .line 499
    const-wide/16 v16, 0x1

    .line 500
    .line 501
    cmp-long v2, v14, v16

    .line 502
    .line 503
    if-gez v2, :cond_d

    .line 504
    .line 505
    move-wide/from16 v14, v16

    .line 506
    .line 507
    :cond_d
    add-long/2addr v12, v14

    .line 508
    goto :goto_6

    .line 509
    :cond_e
    cmp-long v0, v8, v10

    .line 510
    .line 511
    if-lez v0, :cond_f

    .line 512
    .line 513
    move-wide v14, v8

    .line 514
    goto :goto_7

    .line 515
    :cond_f
    move-wide v14, v12

    .line 516
    :goto_7
    const-wide/16 v16, 0x1

    .line 517
    .line 518
    const-wide/32 v18, 0x7fffffff

    .line 519
    .line 520
    .line 521
    invoke-static/range {v14 .. v19}, Lr9/e0;->s(JJJ)J

    .line 522
    .line 523
    .line 524
    move-result-wide v8

    .line 525
    long-to-int v0, v8

    .line 526
    new-instance v2, Lqb/i;

    .line 527
    .line 528
    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 529
    .line 530
    .line 531
    move-result-object v4

    .line 532
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 533
    .line 534
    .line 535
    xor-int/lit8 v6, p2, 0x1

    .line 536
    .line 537
    invoke-direct {v2, v4, v0, v6}, Lqb/i;-><init>(Ljava/lang/String;IZ)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 538
    .line 539
    .line 540
    invoke-static {v1}, Ldg/l;->b0(Ljava/io/File;)V

    .line 541
    .line 542
    .line 543
    return-object v2

    .line 544
    :cond_10
    :try_start_5
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 545
    .line 546
    const-string v2, "\u4fdd\u5b58\u5408\u5e76\u8bed\u97f3\u7f13\u5b58\u5931\u8d25"

    .line 547
    .line 548
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 549
    .line 550
    .line 551
    throw v0

    .line 552
    :cond_11
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 553
    .line 554
    new-instance v4, Ljava/lang/StringBuilder;

    .line 555
    .line 556
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 557
    .line 558
    .line 559
    const-string v6, "PCM \u8f6c Silk \u5931\u8d25: "

    .line 560
    .line 561
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 562
    .line 563
    .line 564
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 565
    .line 566
    .line 567
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 568
    .line 569
    .line 570
    move-result-object v0

    .line 571
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 572
    .line 573
    .line 574
    throw v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 575
    :goto_8
    invoke-static {v1}, Ldg/l;->b0(Ljava/io/File;)V

    .line 576
    .line 577
    .line 578
    if-nez v3, :cond_12

    .line 579
    .line 580
    invoke-virtual {v5}, Ljava/io/File;->delete()Z

    .line 581
    .line 582
    .line 583
    :cond_12
    throw v0
.end method

.method public final y(Ljava/lang/Object;)J
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lf9/b;

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    invoke-direct {v1, p1, v2}, Lf9/b;-><init>(Ljava/lang/Object;I)V

    .line 9
    .line 10
    .line 11
    iget-object v2, p0, Lqb/k;->i:Ljava/util/concurrent/ConcurrentHashMap;

    .line 12
    .line 13
    invoke-virtual {v2, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    check-cast v3, Ljava/lang/reflect/Method;

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    if-eqz v3, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {v1}, Lf9/b;->invoke()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    move-object v3, v1

    .line 28
    check-cast v3, Ljava/lang/reflect/Method;

    .line 29
    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    invoke-virtual {v2, v0, v3}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    move-object v3, v4

    .line 37
    :goto_0
    if-eqz v3, :cond_3

    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    new-array v0, v0, [Ljava/lang/Object;

    .line 41
    .line 42
    invoke-static {v3, p1, v0}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    instance-of v1, v0, Ljava/lang/Number;

    .line 47
    .line 48
    if-eqz v1, :cond_2

    .line 49
    .line 50
    move-object v4, v0

    .line 51
    check-cast v4, Ljava/lang/Number;

    .line 52
    .line 53
    :cond_2
    if-eqz v4, :cond_3

    .line 54
    .line 55
    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    .line 56
    .line 57
    .line 58
    move-result-wide v0

    .line 59
    return-wide v0

    .line 60
    :cond_3
    const-string v0, "msgID"

    .line 61
    .line 62
    const-string v1, "id"

    .line 63
    .line 64
    const-string v2, "field_msgId"

    .line 65
    .line 66
    const-string v3, "msgId"

    .line 67
    .line 68
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-static {p1, v0}, Lqb/k;->l(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Number;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    if-eqz p1, :cond_4

    .line 77
    .line 78
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 79
    .line 80
    .line 81
    move-result-wide v0

    .line 82
    return-wide v0

    .line 83
    :cond_4
    const-wide/16 v0, 0x0

    .line 84
    .line 85
    return-wide v0
.end method

.method public final z()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lqb/k;->a:Lr8/g;

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
