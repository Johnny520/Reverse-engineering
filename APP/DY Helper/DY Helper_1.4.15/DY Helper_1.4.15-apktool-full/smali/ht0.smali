.class public final Lht0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Lht0;

.field public static final β:[J

.field public static final γ:Ljava/util/List;

.field public static final δ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final ε:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final ζ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final η:Landroid/os/Handler;

.field public static final θ:Li0;

.field public static final ι:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public static final κ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

.field public static final λ:Ljava/util/Map;

.field public static final μ:Ljava/util/Map;

.field public static final ν:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lht0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lht0;->α:Lht0;

    .line 7
    .line 8
    const/4 v0, 0x3

    .line 9
    new-array v0, v0, [J

    .line 10
    .line 11
    fill-array-data v0, :array_0

    .line 12
    .line 13
    .line 14
    sput-object v0, Lht0;->β:[J

    .line 15
    .line 16
    const-string v0, "~78CB965E478A78D38827E0D26879E5129ED28BC0948C0FBC37E5E6CBBBFC5499018E373F669F553302434DA32AFD5AD16823F7BBCC70D7C9EE69DBC2C6F46E93BE9CBA5E46FAA3665FF593EA4AB4D9AB22B40577200BA9"

    .line 17
    .line 18
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "~7883762E03D36847EFF3BA0793C09F8E02F6EC9E30B4641E11191155A1E04541A2C6D7589F3BA263618D5C9E9631DAED24084C05EC0FA5AEEE60D19DF7E8BEB7B8F8F59915"

    .line 23
    .line 24
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const-string v2, "~7887EB3C8DFF4D5E985E245E27C49A473730FF61BE5736C7134480469C45468AA16A8F6A1C3389074335160687955403BE9F1FF8D9DFF8B0C721F258E0C89091A072226B"

    .line 29
    .line 30
    invoke-static {v2}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    filled-new-array {v0, v1, v2}, [Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    sput-object v0, Lht0;->γ:Ljava/util/List;

    .line 43
    .line 44
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 45
    .line 46
    const/4 v1, 0x0

    .line 47
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 48
    .line 49
    .line 50
    sput-object v0, Lht0;->δ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 51
    .line 52
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 53
    .line 54
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 55
    .line 56
    .line 57
    sput-object v0, Lht0;->ε:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 58
    .line 59
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 60
    .line 61
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 62
    .line 63
    .line 64
    sput-object v0, Lht0;->ζ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 65
    .line 66
    new-instance v0, Landroid/os/Handler;

    .line 67
    .line 68
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 73
    .line 74
    .line 75
    sput-object v0, Lht0;->η:Landroid/os/Handler;

    .line 76
    .line 77
    new-instance v0, Li0;

    .line 78
    .line 79
    const/4 v1, 0x5

    .line 80
    invoke-direct {v0, v1}, Li0;-><init>(I)V

    .line 81
    .line 82
    .line 83
    sput-object v0, Lht0;->θ:Li0;

    .line 84
    .line 85
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 86
    .line 87
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 88
    .line 89
    .line 90
    sput-object v0, Lht0;->ι:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 91
    .line 92
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    sput-object v0, Lht0;->κ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 97
    .line 98
    new-instance v0, Ljava/util/WeakHashMap;

    .line 99
    .line 100
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 101
    .line 102
    .line 103
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    sput-object v0, Lht0;->λ:Ljava/util/Map;

    .line 108
    .line 109
    new-instance v0, Ljava/util/WeakHashMap;

    .line 110
    .line 111
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 112
    .line 113
    .line 114
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    sput-object v0, Lht0;->μ:Ljava/util/Map;

    .line 119
    .line 120
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    sput-object v0, Lht0;->ν:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 125
    .line 126
    return-void

    .line 127
    :array_0
    .array-data 8
        0x0
        0x12c
        0x4b0
    .end array-data
.end method

.method public static α(Landroid/view/View;I)Ljava/util/List;
    .locals 7

    .line 1
    const/16 v0, 0x14

    .line 2
    .line 3
    if-gt p1, v0, :cond_a

    .line 4
    .line 5
    instance-of v0, p0, Landroidx/compose/ui/platform/ComposeView;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_4

    .line 10
    .line 11
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const/4 v1, 0x1

    .line 20
    const/4 v2, 0x0

    .line 21
    sget-object v3, Lht0;->ι:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 22
    .line 23
    if-eqz v3, :cond_2

    .line 24
    .line 25
    invoke-virtual {v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-eqz v4, :cond_2

    .line 30
    .line 31
    :cond_1
    move v3, v2

    .line 32
    goto :goto_0

    .line 33
    :cond_2
    invoke-virtual {v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    :cond_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-eqz v4, :cond_1

    .line 42
    .line 43
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    check-cast v4, Ljava/lang/Class;

    .line 48
    .line 49
    invoke-virtual {v4, p0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    if-eqz v4, :cond_3

    .line 54
    .line 55
    move v3, v1

    .line 56
    :goto_0
    sget-object v4, Lht0;->γ:Ljava/util/List;

    .line 57
    .line 58
    invoke-interface {v4, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    invoke-virtual {v5}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    const-string v6, "MainBottomTabContainer"

    .line 71
    .line 72
    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    if-eqz v5, :cond_4

    .line 77
    .line 78
    const-string v5, ".homepage."

    .line 79
    .line 80
    invoke-static {v0, v5, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 81
    .line 82
    .line 83
    move-result v5

    .line 84
    if-eqz v5, :cond_4

    .line 85
    .line 86
    const-string v5, ".bottom."

    .line 87
    .line 88
    invoke-static {v0, v5, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-eqz v0, :cond_4

    .line 93
    .line 94
    move v0, v1

    .line 95
    goto :goto_1

    .line 96
    :cond_4
    move v0, v2

    .line 97
    :goto_1
    if-nez v3, :cond_5

    .line 98
    .line 99
    if-nez v4, :cond_5

    .line 100
    .line 101
    if-eqz v0, :cond_6

    .line 102
    .line 103
    :cond_5
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 104
    .line 105
    if-eqz v0, :cond_6

    .line 106
    .line 107
    invoke-static {p0}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    return-object p0

    .line 112
    :cond_6
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 113
    .line 114
    if-eqz v0, :cond_7

    .line 115
    .line 116
    check-cast p0, Landroid/view/ViewGroup;

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_7
    const/4 p0, 0x0

    .line 120
    :goto_2
    if-nez p0, :cond_8

    .line 121
    .line 122
    goto :goto_4

    .line 123
    :cond_8
    new-instance v0, Ljava/util/ArrayList;

    .line 124
    .line 125
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    :goto_3
    if-ge v2, v3, :cond_9

    .line 133
    .line 134
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 135
    .line 136
    .line 137
    move-result-object v4

    .line 138
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    add-int/lit8 v5, p1, 0x1

    .line 142
    .line 143
    invoke-static {v4, v5}, Lht0;->α(Landroid/view/View;I)Ljava/util/List;

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    invoke-static {v0, v4}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 148
    .line 149
    .line 150
    add-int/lit8 v2, v2, 0x1

    .line 151
    .line 152
    goto :goto_3

    .line 153
    :cond_9
    return-object v0

    .line 154
    :cond_a
    :goto_4
    sget-object p0, Ljz;->ε:Ljz;

    .line 155
    .line 156
    return-object p0
.end method

.method public static δ()Z
    .locals 2

    .line 1
    invoke-static {}, Lui1;->Α()Z

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
    const-string v0, "liquid_glass_bottom_bar_enabled"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    return v0
.end method

.method public static ε(Landroid/app/Activity;)V
    .locals 9

    .line 1
    const-string v0, "\u5df2\u6536\u5230\u5bbf\u4e3b Activity \u6062\u590d\u4fe1\u53f7: "

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const-string v2, "~79F5E25B4ED201D89B6CE77FECC600ECA88AB6F7485F4A97"

    .line 15
    .line 16
    invoke-static {v2}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-static {v1, v2, v3}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    goto/16 :goto_3

    .line 28
    .line 29
    :cond_0
    invoke-static {}, Lht0;->δ()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-nez v1, :cond_1

    .line 34
    .line 35
    goto/16 :goto_3

    .line 36
    .line 37
    :cond_1
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 38
    .line 39
    .line 40
    move-result-wide v1

    .line 41
    sget-object v4, Lht0;->μ:Ljava/util/Map;

    .line 42
    .line 43
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    monitor-enter v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 47
    :try_start_1
    invoke-interface {v4, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    check-cast v5, Ljava/lang/Long;

    .line 52
    .line 53
    if-eqz v5, :cond_2

    .line 54
    .line 55
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 56
    .line 57
    .line 58
    move-result-wide v5

    .line 59
    sub-long v5, v1, v5

    .line 60
    .line 61
    const-wide/16 v7, 0x64

    .line 62
    .line 63
    cmp-long v5, v5, v7

    .line 64
    .line 65
    if-gez v5, :cond_2

    .line 66
    .line 67
    move v1, v3

    .line 68
    goto :goto_0

    .line 69
    :catchall_0
    move-exception p0

    .line 70
    goto :goto_1

    .line 71
    :cond_2
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-interface {v4, p0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 76
    .line 77
    .line 78
    const/4 v1, 0x1

    .line 79
    :goto_0
    :try_start_2
    monitor-exit v4

    .line 80
    if-nez v1, :cond_3

    .line 81
    .line 82
    goto :goto_3

    .line 83
    :cond_3
    invoke-static {}, Lht0;->η()V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    invoke-static {v1}, Lht0;->ι(Ljava/lang/ClassLoader;)V

    .line 94
    .line 95
    .line 96
    sget-object v1, Lht0;->ν:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 97
    .line 98
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    invoke-virtual {v1, v2}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    if-eqz v1, :cond_4

    .line 111
    .line 112
    const-string v1, "r887cfbb8e325e13c"

    .line 113
    .line 114
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    const/4 v2, 0x4

    .line 127
    const/4 v4, 0x0

    .line 128
    invoke-static {v1, v0, v4, v2, v4}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    :cond_4
    invoke-static {p0, v3}, Lht0;->λ(Landroid/app/Activity;I)V

    .line 132
    .line 133
    .line 134
    sget-object p0, Ls62;->α:Ls62;

    .line 135
    .line 136
    goto :goto_2

    .line 137
    :goto_1
    monitor-exit v4

    .line 138
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 139
    :catchall_1
    move-exception p0

    .line 140
    new-instance v0, Leo1;

    .line 141
    .line 142
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 143
    .line 144
    .line 145
    move-object p0, v0

    .line 146
    :goto_2
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    if-eqz p0, :cond_5

    .line 151
    .line 152
    const-string v0, "r887cfbb8e325e13c"

    .line 153
    .line 154
    const-string v1, "\u5904\u7406\u5bbf\u4e3b Activity \u6062\u590d\u4fe1\u53f7\u5931\u8d25\uff0c\u4fdd\u7559\u5bbf\u4e3b\u539f\u5e95\u680f"

    .line 155
    .line 156
    invoke-static {v0, v1, p0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 157
    .line 158
    .line 159
    :cond_5
    :goto_3
    return-void
.end method

.method public static ζ()V
    .locals 3

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    sget-object v0, Lht0;->η:Landroid/os/Handler;

    .line 16
    .line 17
    new-instance v1, Lfb0;

    .line 18
    .line 19
    const/4 v2, 0x5

    .line 20
    invoke-direct {v1, v2}, Lfb0;-><init>(I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    invoke-static {}, Lht0;->η()V

    .line 28
    .line 29
    .line 30
    invoke-static {}, Lht0;->δ()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    sget-object v1, Lht0;->λ:Ljava/util/Map;

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    monitor-enter v1

    .line 40
    :try_start_0
    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    check-cast v2, Ljava/lang/Iterable;

    .line 45
    .line 46
    invoke-static {v2}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 47
    .line 48
    .line 49
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    monitor-exit v1

    .line 51
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-eqz v2, :cond_1

    .line 60
    .line 61
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    check-cast v2, Lgt0;

    .line 66
    .line 67
    invoke-virtual {v2, v0}, Lgt0;->ε(Z)V

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_1
    invoke-static {}, Li;->α()Landroid/app/Activity;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    if-eqz v0, :cond_2

    .line 76
    .line 77
    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    invoke-static {v1}, Lht0;->ι(Ljava/lang/ClassLoader;)V

    .line 85
    .line 86
    .line 87
    invoke-static {v0}, Lht0;->κ(Landroid/app/Activity;)I

    .line 88
    .line 89
    .line 90
    :cond_2
    return-void

    .line 91
    :catchall_0
    move-exception v0

    .line 92
    monitor-exit v1

    .line 93
    throw v0
.end method

.method public static η()V
    .locals 3

    .line 1
    invoke-static {}, Lui1;->Α()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    const/4 v1, 0x1

    .line 10
    sget-object v2, Lht0;->ε:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 11
    .line 12
    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    :goto_0
    return-void

    .line 19
    :cond_1
    new-instance v0, Lgp0;

    .line 20
    .line 21
    const/4 v1, 0x2

    .line 22
    invoke-direct {v0, v1}, Lgp0;-><init>(I)V

    .line 23
    .line 24
    .line 25
    sget-object v1, Lui1;->κ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 26
    .line 27
    invoke-virtual {v1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public static θ(Landroid/view/ViewGroup;)V
    .locals 12

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    new-instance v0, Lgj;

    .line 16
    .line 17
    const/4 v1, 0x5

    .line 18
    invoke-direct {v0, p0, v1}, Lgj;-><init>(Landroid/view/ViewGroup;I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    invoke-static {}, Lht0;->η()V

    .line 26
    .line 27
    .line 28
    sget-object v1, Lht0;->λ:Ljava/util/Map;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    monitor-enter v1

    .line 34
    :try_start_0
    invoke-interface {v1, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, Lgt0;

    .line 39
    .line 40
    if-nez v0, :cond_1

    .line 41
    .line 42
    new-instance v0, Lgt0;

    .line 43
    .line 44
    sget-object v2, Lht0;->θ:Li0;

    .line 45
    .line 46
    new-instance v3, Lw0;

    .line 47
    .line 48
    sget-object v5, Lht0;->α:Lht0;

    .line 49
    .line 50
    const-class v6, Lht0;

    .line 51
    .line 52
    const-string v7, "isFeatureActive"

    .line 53
    .line 54
    const-string v8, "isFeatureActive()Z"

    .line 55
    .line 56
    const/4 v9, 0x0

    .line 57
    const/4 v10, 0x3

    .line 58
    const/4 v4, 0x0

    .line 59
    invoke-direct/range {v3 .. v10}, Lw0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 60
    .line 61
    .line 62
    new-instance v4, Lw0;

    .line 63
    .line 64
    const-class v7, Lht0;

    .line 65
    .line 66
    const-string v8, "getLiquidGlassScale"

    .line 67
    .line 68
    const-string v9, "getLiquidGlassScale()F"

    .line 69
    .line 70
    const/4 v10, 0x0

    .line 71
    const/4 v11, 0x4

    .line 72
    move-object v6, v5

    .line 73
    const/4 v5, 0x0

    .line 74
    invoke-direct/range {v4 .. v11}, Lw0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 75
    .line 76
    .line 77
    invoke-direct {v0, p0, v2, v3, v4}, Lgt0;-><init>(Landroid/view/ViewGroup;Li0;Lw0;Lw0;)V

    .line 78
    .line 79
    .line 80
    invoke-interface {v1, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 81
    .line 82
    .line 83
    const/4 v2, 0x1

    .line 84
    goto :goto_0

    .line 85
    :catchall_0
    move-exception v0

    .line 86
    move-object p0, v0

    .line 87
    goto :goto_1

    .line 88
    :cond_1
    const/4 v2, 0x0

    .line 89
    :goto_0
    monitor-exit v1

    .line 90
    if-eqz v2, :cond_2

    .line 91
    .line 92
    const-string v1, "r887cfbb8e325e13c"

    .line 93
    .line 94
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    const-string v2, "\u5df2\u53d1\u73b0\u5e76\u63a5\u7ba1\u5bbf\u4e3b\u5e95\u680f\u5bb9\u5668: "

    .line 103
    .line 104
    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    const/4 v2, 0x4

    .line 109
    const/4 v3, 0x0

    .line 110
    invoke-static {v1, p0, v3, v2, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    :cond_2
    invoke-static {}, Lht0;->δ()Z

    .line 114
    .line 115
    .line 116
    move-result p0

    .line 117
    invoke-virtual {v0, p0}, Lgt0;->ε(Z)V

    .line 118
    .line 119
    .line 120
    return-void

    .line 121
    :goto_1
    monitor-exit v1

    .line 122
    throw p0
.end method

.method public static ι(Ljava/lang/ClassLoader;)V
    .locals 3

    .line 1
    sget-object v0, Lht0;->γ:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Ljava/lang/String;

    .line 18
    .line 19
    sget-object v2, Lht0;->α:Lht0;

    .line 20
    .line 21
    invoke-virtual {v2, p0, v1}, Lht0;->β(Ljava/lang/ClassLoader;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-void
.end method

.method public static κ(Landroid/app/Activity;)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_3

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    if-eqz p0, :cond_3

    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    if-nez p0, :cond_1

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    invoke-static {p0, v1}, Lht0;->α(Landroid/view/View;I)Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_2

    .line 41
    .line 42
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    check-cast v1, Landroid/view/ViewGroup;

    .line 47
    .line 48
    invoke-static {v1}, Lht0;->θ(Landroid/view/ViewGroup;)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    return p0

    .line 57
    :cond_3
    :goto_1
    return v1
.end method

.method public static λ(Landroid/app/Activity;I)V
    .locals 5

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x3

    .line 4
    if-ge p1, v0, :cond_0

    .line 5
    .line 6
    sget-object v0, Lht0;->β:[J

    .line 7
    .line 8
    aget-wide v0, v0, p1

    .line 9
    .line 10
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    :goto_0
    if-eqz v0, :cond_2

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    if-eqz v2, :cond_2

    .line 27
    .line 28
    invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    if-nez v2, :cond_1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    new-instance v3, Len0;

    .line 36
    .line 37
    const/4 v4, 0x1

    .line 38
    invoke-direct {v3, p1, v4, p0}, Len0;-><init>(IILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2, v3, v0, v1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 42
    .line 43
    .line 44
    :cond_2
    :goto_1
    return-void
.end method


# virtual methods
.method public final β(Ljava/lang/ClassLoader;Ljava/lang/String;)V
    .locals 9

    .line 1
    const-string v0, "\u5df2\u5b89\u88c5\u5e95\u680f\u5bb9\u5668\u6784\u9020 Hook: "

    .line 2
    .line 3
    :try_start_0
    invoke-static {p1, p2}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    goto :goto_0

    .line 8
    :catchall_0
    move-exception p1

    .line 9
    new-instance v1, Leo1;

    .line 10
    .line 11
    invoke-direct {v1, p1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 12
    .line 13
    .line 14
    move-object p1, v1

    .line 15
    :goto_0
    invoke-static {p1}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const-string v2, "r887cfbb8e325e13c"

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    const-string v3, "\u52a0\u8f7d\u5e95\u680f\u5bb9\u5668\u5019\u9009\u5931\u8d25: "

    .line 24
    .line 25
    invoke-static {v3, p2, v2, v1}, Lnx;->ω(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    instance-of v1, p1, Leo1;

    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    move-object p1, v3

    .line 34
    :cond_1
    check-cast p1, Ljava/lang/Class;

    .line 35
    .line 36
    if-nez p1, :cond_2

    .line 37
    .line 38
    goto/16 :goto_4

    .line 39
    .line 40
    :cond_2
    const-class v1, Landroid/view/ViewGroup;

    .line 41
    .line 42
    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    const/4 v4, 0x4

    .line 47
    if-nez v1, :cond_3

    .line 48
    .line 49
    const-string p0, "\u5e95\u680f\u5019\u9009\u4e0d\u662f ViewGroup\uff0c\u5df2\u8df3\u8fc7: "

    .line 50
    .line 51
    invoke-static {p0, p2}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-static {v2, p0, v3, v4, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_3
    sget-object v1, Lht0;->κ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 60
    .line 61
    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    if-nez v5, :cond_4

    .line 66
    .line 67
    goto :goto_4

    .line 68
    :cond_4
    sget-object v5, Lht0;->ι:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 69
    .line 70
    invoke-virtual {v5, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    :try_start_1
    sget-object v6, Lxq0;->α:Lxq0;

    .line 74
    .line 75
    new-instance v7, Loj0;

    .line 76
    .line 77
    const/16 v8, 0xf

    .line 78
    .line 79
    invoke-direct {v7, v8, p0}, Loj0;-><init>(ILjava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v6, p1, v7}, Lxq0;->β(Ljava/lang/Class;Lm01;)Ljava/util/Set;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    if-eqz p0, :cond_5

    .line 90
    .line 91
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    goto :goto_1

    .line 100
    :catchall_1
    move-exception p0

    .line 101
    goto :goto_2

    .line 102
    :cond_5
    const-string p0, "bootstrap"

    .line 103
    .line 104
    :goto_1
    new-instance v6, Ljava/lang/StringBuilder;

    .line 105
    .line 106
    invoke-direct {v6, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    const-string v0, ", loader="

    .line 113
    .line 114
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v6, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    invoke-static {v2, p0, v3, v4, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    sget-object p0, Ls62;->α:Ls62;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 128
    .line 129
    goto :goto_3

    .line 130
    :goto_2
    new-instance v0, Leo1;

    .line 131
    .line 132
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 133
    .line 134
    .line 135
    move-object p0, v0

    .line 136
    :goto_3
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    if-eqz p0, :cond_6

    .line 141
    .line 142
    invoke-virtual {v5, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->remove(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    new-instance p1, Ljava/lang/StringBuilder;

    .line 149
    .line 150
    const-string v0, "\u5b89\u88c5\u5e95\u680f\u5bb9\u5668\u6784\u9020 Hook \u5931\u8d25: "

    .line 151
    .line 152
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    invoke-static {v2, p1, p0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 163
    .line 164
    .line 165
    :cond_6
    :goto_4
    return-void
.end method

.method public final γ(Lz81;)V
    .locals 14

    .line 1
    sget-object v0, Lht0;->δ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget-object v0, p1, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v3, "\u521d\u59cb\u5316\u6db2\u6001\u73bb\u7483\u5e95\u680f\u5165\u53e3: loader="

    .line 23
    .line 24
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const-string v3, "r887cfbb8e325e13c"

    .line 29
    .line 30
    const/4 v4, 0x0

    .line 31
    const/4 v5, 0x4

    .line 32
    invoke-static {v3, v0, v4, v5, v4}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    invoke-static {}, Lht0;->η()V

    .line 36
    .line 37
    .line 38
    sget-object v0, Lht0;->ζ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 39
    .line 40
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-nez v0, :cond_1

    .line 45
    .line 46
    move-object v8, p0

    .line 47
    goto :goto_0

    .line 48
    :cond_1
    sget-object v0, Lsb;->α:Lsb;

    .line 49
    .line 50
    new-instance v6, Lng;

    .line 51
    .line 52
    const/4 v12, 0x0

    .line 53
    const/16 v13, 0x1c

    .line 54
    .line 55
    const/4 v7, 0x1

    .line 56
    const-class v9, Lht0;

    .line 57
    .line 58
    const-string v10, "onHostActivityResumed"

    .line 59
    .line 60
    const-string v11, "onHostActivityResumed(Landroid/app/Activity;)V"

    .line 61
    .line 62
    move-object v8, p0

    .line 63
    invoke-direct/range {v6 .. v13}, Lng;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 64
    .line 65
    .line 66
    sget-object p0, Lsb;->Β:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 67
    .line 68
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0, v6}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    :goto_0
    sget-object p0, Lht0;->γ:Ljava/util/List;

    .line 75
    .line 76
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-eqz v0, :cond_2

    .line 85
    .line 86
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    check-cast v0, Ljava/lang/String;

    .line 91
    .line 92
    sget-object v1, Lht0;->α:Lht0;

    .line 93
    .line 94
    iget-object v2, p1, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 95
    .line 96
    invoke-virtual {v1, v2, v0}, Lht0;->β(Ljava/lang/ClassLoader;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_2
    :try_start_0
    const-class p0, Landroid/app/Activity;

    .line 101
    .line 102
    const-string p1, "onResume"

    .line 103
    .line 104
    new-instance v0, Loj0;

    .line 105
    .line 106
    const/16 v1, 0xe

    .line 107
    .line 108
    invoke-direct {v0, v1, v8}, Loj0;-><init>(ILjava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-static {p0, p1, v0}, Lqe0;->ε(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ll01;

    .line 116
    .line 117
    .line 118
    const-string p0, "\u5df2\u5b89\u88c5 Activity.onResume \u5ef6\u8fdf\u53d1\u73b0 Hook"

    .line 119
    .line 120
    invoke-static {v3, p0, v4, v5, v4}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    sget-object p0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :catchall_0
    move-exception v0

    .line 127
    move-object p0, v0

    .line 128
    new-instance p1, Leo1;

    .line 129
    .line 130
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 131
    .line 132
    .line 133
    move-object p0, p1

    .line 134
    :goto_2
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    if-eqz p0, :cond_3

    .line 139
    .line 140
    const-string p1, "\u5b89\u88c5 Activity.onResume \u5ef6\u8fdf\u53d1\u73b0 Hook \u5931\u8d25"

    .line 141
    .line 142
    invoke-static {v3, p1, p0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 143
    .line 144
    .line 145
    :cond_3
    invoke-static {}, Lht0;->ζ()V

    .line 146
    .line 147
    .line 148
    return-void
.end method
