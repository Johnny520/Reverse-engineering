.class public final Lfj;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Lfj;

.field public static final β:Ljava/util/List;

.field public static final γ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final δ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final ε:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final ζ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final η:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

.field public static final θ:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final ι:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final κ:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final λ:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final μ:Ljava/util/Map;

.field public static final ν:Ljava/util/Map;

.field public static final ξ:Ljava/util/concurrent/ExecutorService;

.field public static final ο:Ljava/util/concurrent/ScheduledExecutorService;

.field public static final π:Ljava/util/concurrent/atomic/AtomicReference;

.field public static final ρ:Ljava/util/Map;

.field public static final σ:Landroid/os/Handler;

.field public static final τ:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lfj;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lfj;->α:Lfj;

    .line 7
    .line 8
    const-string v0, "~789325E9C4B2AA228E18888457F2F91C62869634665744D0738FDF4787DB92902179878E3D916281A0245BB60E9B0E7A955DD33C3240902346B0198C6262BCB748"

    .line 9
    .line 10
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, "~7883762E03D36847EFF3BA0793C09F8E02F6EC9E30B4641E11121155A9F54A52E989D755D836AE78788F5492836D81C96B224D2AEE1EBFB5C051DC93F5F2B4AAB6C7F29910"

    .line 15
    .line 16
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sput-object v0, Lfj;->β:Ljava/util/List;

    .line 29
    .line 30
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 34
    .line 35
    .line 36
    sput-object v0, Lfj;->γ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 37
    .line 38
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 39
    .line 40
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 41
    .line 42
    .line 43
    sput-object v0, Lfj;->δ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 44
    .line 45
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 46
    .line 47
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 48
    .line 49
    .line 50
    sput-object v0, Lfj;->ε:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 51
    .line 52
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 53
    .line 54
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 55
    .line 56
    .line 57
    sput-object v0, Lfj;->ζ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 58
    .line 59
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    sput-object v0, Lfj;->η:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 64
    .line 65
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 66
    .line 67
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 68
    .line 69
    .line 70
    sput-object v0, Lfj;->θ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 71
    .line 72
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 73
    .line 74
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 75
    .line 76
    .line 77
    sput-object v0, Lfj;->ι:Ljava/util/concurrent/ConcurrentHashMap;

    .line 78
    .line 79
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 80
    .line 81
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 82
    .line 83
    .line 84
    sput-object v0, Lfj;->κ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 85
    .line 86
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 87
    .line 88
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 89
    .line 90
    .line 91
    sput-object v0, Lfj;->λ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 92
    .line 93
    new-instance v0, Ljava/util/WeakHashMap;

    .line 94
    .line 95
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 96
    .line 97
    .line 98
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    sput-object v0, Lfj;->μ:Ljava/util/Map;

    .line 106
    .line 107
    new-instance v0, Ljava/util/WeakHashMap;

    .line 108
    .line 109
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 110
    .line 111
    .line 112
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    sput-object v0, Lfj;->ν:Ljava/util/Map;

    .line 120
    .line 121
    new-instance v0, Laj;

    .line 122
    .line 123
    invoke-direct {v0, v1}, Laj;-><init>(I)V

    .line 124
    .line 125
    .line 126
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    sput-object v0, Lfj;->ξ:Ljava/util/concurrent/ExecutorService;

    .line 131
    .line 132
    new-instance v0, Laj;

    .line 133
    .line 134
    const/4 v1, 0x1

    .line 135
    invoke-direct {v0, v1}, Laj;-><init>(I)V

    .line 136
    .line 137
    .line 138
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    sput-object v0, Lfj;->ο:Ljava/util/concurrent/ScheduledExecutorService;

    .line 146
    .line 147
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 148
    .line 149
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 150
    .line 151
    .line 152
    sput-object v0, Lfj;->π:Ljava/util/concurrent/atomic/AtomicReference;

    .line 153
    .line 154
    new-instance v0, Ljava/util/WeakHashMap;

    .line 155
    .line 156
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 157
    .line 158
    .line 159
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    sput-object v0, Lfj;->ρ:Ljava/util/Map;

    .line 167
    .line 168
    new-instance v0, Landroid/os/Handler;

    .line 169
    .line 170
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 175
    .line 176
    .line 177
    sput-object v0, Lfj;->σ:Landroid/os/Handler;

    .line 178
    .line 179
    const-string v0, "volccdn.com"

    .line 180
    .line 181
    const-string v1, "pstatp.com"

    .line 182
    .line 183
    const-string v2, "douyinvod.com"

    .line 184
    .line 185
    const-string v3, "amemv.com"

    .line 186
    .line 187
    const-string v4, "bytecdn.cn"

    .line 188
    .line 189
    filled-new-array {v2, v3, v4, v0, v1}, [Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    invoke-static {v0}, Lg7;->о([Ljava/lang/Object;)Ljava/util/Set;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    sput-object v0, Lfj;->τ:Ljava/util/Set;

    .line 198
    .line 199
    return-void
.end method

.method public static Α(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 14

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :goto_0
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_7

    .line 7
    .line 8
    const-class v2, Ljava/lang/Object;

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-nez v2, :cond_7

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    array-length v3, v2

    .line 24
    const/4 v4, 0x0

    .line 25
    move v5, v4

    .line 26
    :goto_1
    if-ge v5, v3, :cond_6

    .line 27
    .line 28
    aget-object v6, v2, v5

    .line 29
    .line 30
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 31
    .line 32
    .line 33
    move-result v7

    .line 34
    invoke-static {v7}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 35
    .line 36
    .line 37
    move-result v7

    .line 38
    if-nez v7, :cond_5

    .line 39
    .line 40
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getDeclaredAnnotations()[Ljava/lang/annotation/Annotation;

    .line 41
    .line 42
    .line 43
    move-result-object v7

    .line 44
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    array-length v8, v7

    .line 48
    move v9, v4

    .line 49
    :goto_2
    if-ge v9, v8, :cond_3

    .line 50
    .line 51
    aget-object v10, v7, v9

    .line 52
    .line 53
    invoke-static {v10}, Lln0;->Ζ(Ljava/lang/annotation/Annotation;)Lwf;

    .line 54
    .line 55
    .line 56
    move-result-object v11

    .line 57
    invoke-static {v11}, Lln0;->Λ(Lwf;)Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    move-result-object v11

    .line 61
    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v12

    .line 65
    const-string v13, "com.google.gson.annotations.SerializedName"

    .line 66
    .line 67
    invoke-virtual {v12, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v12

    .line 71
    if-eqz v12, :cond_2

    .line 72
    .line 73
    :try_start_0
    const-string v7, "value"

    .line 74
    .line 75
    invoke-virtual {v11, v7, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 76
    .line 77
    .line 78
    move-result-object v7

    .line 79
    invoke-virtual {v7, v10, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    instance-of v8, v7, Ljava/lang/String;

    .line 84
    .line 85
    if-eqz v8, :cond_0

    .line 86
    .line 87
    check-cast v7, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 88
    .line 89
    goto :goto_4

    .line 90
    :catchall_0
    move-exception v7

    .line 91
    goto :goto_3

    .line 92
    :cond_0
    move-object v7, v1

    .line 93
    goto :goto_4

    .line 94
    :goto_3
    new-instance v8, Leo1;

    .line 95
    .line 96
    invoke-direct {v8, v7}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 97
    .line 98
    .line 99
    move-object v7, v8

    .line 100
    :goto_4
    instance-of v8, v7, Leo1;

    .line 101
    .line 102
    if-eqz v8, :cond_1

    .line 103
    .line 104
    move-object v7, v1

    .line 105
    :cond_1
    check-cast v7, Ljava/lang/String;

    .line 106
    .line 107
    goto :goto_5

    .line 108
    :cond_2
    add-int/lit8 v9, v9, 0x1

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_3
    move-object v7, v1

    .line 112
    :goto_5
    invoke-static {v7, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v7

    .line 116
    if-eqz v7, :cond_5

    .line 117
    .line 118
    const/4 p1, 0x1

    .line 119
    :try_start_1
    invoke-virtual {v6, p1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v6, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 126
    goto :goto_6

    .line 127
    :catchall_1
    move-exception p0

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
    :goto_6
    instance-of p1, p0, Leo1;

    .line 135
    .line 136
    if-eqz p1, :cond_4

    .line 137
    .line 138
    goto :goto_7

    .line 139
    :cond_4
    move-object v1, p0

    .line 140
    :goto_7
    return-object v1

    .line 141
    :cond_5
    add-int/lit8 v5, v5, 0x1

    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_6
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    goto/16 :goto_0

    .line 149
    .line 150
    :cond_7
    return-object v1
.end method

.method public static Β(Lcj;)Ljava/lang/String;
    .locals 9

    .line 1
    const-string v0, "application/json,text/plain,*/*"

    .line 2
    .line 3
    iget-object v1, p0, Lcj;->α:Ljava/lang/String;

    .line 4
    .line 5
    sget-object v2, Lfj;->θ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 6
    .line 7
    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    check-cast v2, Lbj;

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    invoke-virtual {v2}, Lbj;->α()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-nez v3, :cond_0

    .line 20
    .line 21
    iget-boolean v3, v2, Lbj;->β:Z

    .line 22
    .line 23
    if-eqz v3, :cond_0

    .line 24
    .line 25
    iget-object p0, v2, Lbj;->α:Ljava/lang/String;

    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_0
    iget-object p0, p0, Lcj;->β:Ljava/lang/String;

    .line 29
    .line 30
    const/16 v2, 0xc

    .line 31
    .line 32
    const/4 v3, 0x1

    .line 33
    if-eqz p0, :cond_3

    .line 34
    .line 35
    invoke-static {p0}, Lfj;->ψ(Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    const-string v4, "http"

    .line 40
    .line 41
    invoke-static {p0, v4, v3}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    if-eqz v4, :cond_1

    .line 46
    .line 47
    invoke-static {p0}, Lfj;->σ(Ljava/lang/String;)Z

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    if-eqz v4, :cond_1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    invoke-static {p0}, Lfj;->ω(Ljava/lang/String;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-static {v2, p0}, Lfj;->μ(ILjava/lang/Object;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    :goto_0
    if-eqz p0, :cond_3

    .line 63
    .line 64
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    if-eqz v4, :cond_2

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_2
    invoke-static {v1, p0, v3}, Lfj;->γ(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 72
    .line 73
    .line 74
    return-object p0

    .line 75
    :cond_3
    :goto_1
    sget-object p0, Lfj;->ι:Ljava/util/concurrent/ConcurrentHashMap;

    .line 76
    .line 77
    invoke-virtual {p0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    check-cast p0, Lbj;

    .line 82
    .line 83
    const/4 v4, 0x0

    .line 84
    if-eqz p0, :cond_a

    .line 85
    .line 86
    invoke-virtual {p0}, Lbj;->α()Z

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    if-nez v5, :cond_a

    .line 91
    .line 92
    iget-object p0, p0, Lbj;->α:Ljava/lang/String;

    .line 93
    .line 94
    const-string v5, "\u4ece\u64ad\u653e\u63a5\u53e3\u63d0\u53d6\u8bc4\u8bba\u8bed\u97f3\u76f4\u94fe vid="

    .line 95
    .line 96
    :try_start_0
    sget-object v6, Lwx;->α:Lt41;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 97
    .line 98
    :try_start_1
    const-string v6, "User-Agent"

    .line 99
    .line 100
    const-string v7, "Mozilla/5.0 (Linux; Android 13; Pixel 7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Mobile Safari/537.36"

    .line 101
    .line 102
    new-instance v8, Ll91;

    .line 103
    .line 104
    invoke-direct {v8, v6, v7}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    const-string v6, "Accept"

    .line 108
    .line 109
    new-instance v7, Ll91;

    .line 110
    .line 111
    invoke-direct {v7, v6, v0}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    filled-new-array {v8, v7}, [Ll91;

    .line 115
    .line 116
    .line 117
    move-result-object v6

    .line 118
    invoke-static {v6}, Lex0;->Μ([Ll91;)Ljava/util/Map;

    .line 119
    .line 120
    .line 121
    move-result-object v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 122
    :try_start_2
    invoke-static {p0, v6, v0, v2}, Lwx;->ζ(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;I)Lvx;

    .line 123
    .line 124
    .line 125
    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 126
    :try_start_3
    iget-object v0, p0, Lvx;->δ:Ljava/io/BufferedInputStream;

    .line 127
    .line 128
    sget-object v6, Lmf;->α:Ljava/nio/charset/Charset;

    .line 129
    .line 130
    new-instance v7, Ljava/io/InputStreamReader;

    .line 131
    .line 132
    invoke-direct {v7, v0, v6}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    .line 133
    .line 134
    .line 135
    new-instance v0, Ljava/io/BufferedReader;

    .line 136
    .line 137
    const/16 v6, 0x2000

    .line 138
    .line 139
    invoke-direct {v0, v7, v6}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 140
    .line 141
    .line 142
    :try_start_4
    invoke-static {v0}, Li81;->φ(Ljava/io/Reader;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v6
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 146
    :try_start_5
    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    .line 147
    .line 148
    .line 149
    invoke-static {v6}, Lfj;->ω(Ljava/lang/String;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    invoke-static {v2, v0}, Lfj;->μ(ILjava/lang/Object;)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    if-eqz v0, :cond_5

    .line 158
    .line 159
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 160
    .line 161
    .line 162
    move-result v2

    .line 163
    if-eqz v2, :cond_4

    .line 164
    .line 165
    goto :goto_5

    .line 166
    :cond_4
    new-instance v2, Ljava/lang/StringBuilder;

    .line 167
    .line 168
    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    const-string v5, "CommentAudioDownload"

    .line 179
    .line 180
    const/4 v6, 0x4

    .line 181
    invoke-static {v5, v2, v4, v6, v4}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 182
    .line 183
    .line 184
    goto :goto_5

    .line 185
    :catchall_0
    move-exception v0

    .line 186
    goto :goto_4

    .line 187
    :catchall_1
    move-exception v2

    .line 188
    :try_start_6
    throw v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 189
    :catchall_2
    move-exception v5

    .line 190
    :try_start_7
    invoke-static {v0, v2}, Lxb;->λ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 191
    .line 192
    .line 193
    throw v5
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 194
    :catchall_3
    move-exception v0

    .line 195
    :goto_2
    move-object p0, v4

    .line 196
    goto :goto_4

    .line 197
    :goto_3
    move-object v0, p0

    .line 198
    goto :goto_2

    .line 199
    :catchall_4
    move-exception p0

    .line 200
    goto :goto_3

    .line 201
    :goto_4
    new-instance v2, Leo1;

    .line 202
    .line 203
    invoke-direct {v2, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 204
    .line 205
    .line 206
    move-object v0, v2

    .line 207
    :cond_5
    :goto_5
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    if-eqz v2, :cond_6

    .line 212
    .line 213
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    sget v2, Lcom/example/dyhelper/MainHook;->β:I

    .line 217
    .line 218
    :cond_6
    instance-of v2, v0, Leo1;

    .line 219
    .line 220
    if-eqz v2, :cond_7

    .line 221
    .line 222
    move-object v0, v4

    .line 223
    :cond_7
    check-cast v0, Ljava/lang/String;

    .line 224
    .line 225
    if-eqz p0, :cond_8

    .line 226
    .line 227
    invoke-virtual {p0}, Lvx;->α()V

    .line 228
    .line 229
    .line 230
    :cond_8
    if-eqz v0, :cond_a

    .line 231
    .line 232
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 233
    .line 234
    .line 235
    move-result p0

    .line 236
    if-eqz p0, :cond_9

    .line 237
    .line 238
    goto :goto_6

    .line 239
    :cond_9
    invoke-static {v1, v0, v3}, Lfj;->γ(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 240
    .line 241
    .line 242
    return-object v0

    .line 243
    :cond_a
    :goto_6
    return-object v4
.end method

.method public static Γ(Ljava/lang/ClassLoader;Z)Ljava/util/List;
    .locals 11

    .line 1
    sget-object v0, Lox;->α:Ljava/lang/Object;

    .line 2
    .line 3
    sget-object v0, Lkx;->ｔ:Lkx;

    .line 4
    .line 5
    invoke-static {v0, p0}, Lox;->σ(Lkx;Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x1

    .line 10
    const/4 v3, 0x0

    .line 11
    if-eqz v1, :cond_4

    .line 12
    .line 13
    new-instance v4, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    if-eqz v5, :cond_1

    .line 27
    .line 28
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    move-object v6, v5

    .line 33
    check-cast v6, Ljava/lang/reflect/Method;

    .line 34
    .line 35
    invoke-static {v6}, Lfj;->τ(Ljava/lang/reflect/Method;)Z

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    if-eqz v6, :cond_0

    .line 40
    .line 41
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-nez v1, :cond_2

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_2
    move-object v4, v3

    .line 53
    :goto_1
    if-eqz v4, :cond_4

    .line 54
    .line 55
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    if-eqz p1, :cond_3

    .line 64
    .line 65
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    check-cast p1, Ljava/lang/reflect/Method;

    .line 70
    .line 71
    invoke-virtual {p1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 72
    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_3
    return-object v4

    .line 76
    :cond_4
    new-instance v1, Ljava/util/ArrayList;

    .line 77
    .line 78
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 79
    .line 80
    .line 81
    sget-object v4, Lfj;->β:Ljava/util/List;

    .line 82
    .line 83
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 88
    .line 89
    .line 90
    move-result v5

    .line 91
    sget-object v6, Ljz;->ε:Ljz;

    .line 92
    .line 93
    if-eqz v5, :cond_a

    .line 94
    .line 95
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    check-cast v5, Ljava/lang/String;

    .line 100
    .line 101
    const/4 v7, 0x0

    .line 102
    :try_start_0
    invoke-static {v5, v7, p0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 106
    goto :goto_4

    .line 107
    :catchall_0
    move-exception v5

    .line 108
    new-instance v8, Leo1;

    .line 109
    .line 110
    invoke-direct {v8, v5}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 111
    .line 112
    .line 113
    move-object v5, v8

    .line 114
    :goto_4
    instance-of v8, v5, Leo1;

    .line 115
    .line 116
    if-eqz v8, :cond_5

    .line 117
    .line 118
    move-object v5, v3

    .line 119
    :cond_5
    check-cast v5, Ljava/lang/Class;

    .line 120
    .line 121
    if-nez v5, :cond_6

    .line 122
    .line 123
    goto :goto_7

    .line 124
    :cond_6
    invoke-virtual {v5}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 125
    .line 126
    .line 127
    move-result-object v5

    .line 128
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    new-instance v6, Ljava/util/ArrayList;

    .line 132
    .line 133
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 134
    .line 135
    .line 136
    array-length v8, v5

    .line 137
    :goto_5
    if-ge v7, v8, :cond_8

    .line 138
    .line 139
    aget-object v9, v5, v7

    .line 140
    .line 141
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    invoke-static {v9}, Lfj;->τ(Ljava/lang/reflect/Method;)Z

    .line 145
    .line 146
    .line 147
    move-result v10

    .line 148
    if-eqz v10, :cond_7

    .line 149
    .line 150
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    :cond_7
    add-int/lit8 v7, v7, 0x1

    .line 154
    .line 155
    goto :goto_5

    .line 156
    :cond_8
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 157
    .line 158
    .line 159
    move-result-object v5

    .line 160
    :goto_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 161
    .line 162
    .line 163
    move-result v7

    .line 164
    if-eqz v7, :cond_9

    .line 165
    .line 166
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v7

    .line 170
    check-cast v7, Ljava/lang/reflect/Method;

    .line 171
    .line 172
    invoke-virtual {v7, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 173
    .line 174
    .line 175
    goto :goto_6

    .line 176
    :cond_9
    :goto_7
    invoke-static {v1, v6}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 177
    .line 178
    .line 179
    goto :goto_3

    .line 180
    :cond_a
    new-instance v2, Ljava/util/HashSet;

    .line 181
    .line 182
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 183
    .line 184
    .line 185
    new-instance v3, Ljava/util/ArrayList;

    .line 186
    .line 187
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    :cond_b
    :goto_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 195
    .line 196
    .line 197
    move-result v4

    .line 198
    if-eqz v4, :cond_c

    .line 199
    .line 200
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v4

    .line 204
    move-object v5, v4

    .line 205
    check-cast v5, Ljava/lang/reflect/Method;

    .line 206
    .line 207
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    invoke-static {v5}, Lfj;->χ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v5

    .line 214
    invoke-virtual {v2, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result v5

    .line 218
    if-eqz v5, :cond_b

    .line 219
    .line 220
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 221
    .line 222
    .line 223
    goto :goto_8

    .line 224
    :cond_c
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 225
    .line 226
    .line 227
    move-result v1

    .line 228
    if-nez v1, :cond_d

    .line 229
    .line 230
    :try_start_1
    sget-object p0, Lox;->α:Ljava/lang/Object;

    .line 231
    .line 232
    invoke-static {v0, v3}, Lox;->χ(Lkx;Ljava/util/List;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 233
    .line 234
    .line 235
    :catchall_1
    return-object v3

    .line 236
    :cond_d
    if-eqz p1, :cond_f

    .line 237
    .line 238
    sget-object p1, Lox;->α:Ljava/lang/Object;

    .line 239
    .line 240
    sget-object p1, Lox;->ι:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 241
    .line 242
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 243
    .line 244
    .line 245
    move-result p1

    .line 246
    if-nez p1, :cond_e

    .line 247
    .line 248
    goto :goto_9

    .line 249
    :cond_e
    new-instance p1, Lbb;

    .line 250
    .line 251
    const/16 v1, 0xb

    .line 252
    .line 253
    invoke-direct {p1, p0, v1}, Lbb;-><init>(Ljava/lang/ClassLoader;I)V

    .line 254
    .line 255
    .line 256
    const-string v1, "\u5b9a\u4f4d\u8bc4\u8bba\u8bed\u97f3\u64ad\u653e\u63a7\u4ef6\u7ed1\u5b9a\u5165\u53e3"

    .line 257
    .line 258
    invoke-static {v0, p0, v1, p1}, Lox;->λ(Lkx;Ljava/lang/ClassLoader;Ljava/lang/String;La80;)Ljava/util/List;

    .line 259
    .line 260
    .line 261
    move-result-object p0

    .line 262
    return-object p0

    .line 263
    :cond_f
    :goto_9
    return-object v6
.end method

.method public static Δ(Landroid/media/AudioTrack;Ljava/lang/Integer;)Lej;
    .locals 10

    .line 1
    const v0, 0xac44

    .line 2
    .line 3
    .line 4
    const/4 v1, 0x2

    .line 5
    if-nez p0, :cond_1

    .line 6
    .line 7
    new-instance p0, Lej;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move p1, v1

    .line 17
    :goto_0
    invoke-direct {p0, v0, v1, p1}, Lej;-><init>(III)V

    .line 18
    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_1
    sget-object v2, Lfj;->ρ:Ljava/util/Map;

    .line 22
    .line 23
    monitor-enter v2

    .line 24
    :try_start_0
    invoke-interface {v2, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    check-cast v3, Lej;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 29
    .line 30
    monitor-exit v2

    .line 31
    if-eqz v3, :cond_2

    .line 32
    .line 33
    if-nez p1, :cond_2

    .line 34
    .line 35
    return-object v3

    .line 36
    :cond_2
    :try_start_1
    invoke-virtual {p0}, Landroid/media/AudioTrack;->getSampleRate()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 44
    goto :goto_1

    .line 45
    :catchall_0
    move-exception v2

    .line 46
    new-instance v4, Leo1;

    .line 47
    .line 48
    invoke-direct {v4, v2}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 49
    .line 50
    .line 51
    move-object v2, v4

    .line 52
    :goto_1
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    instance-of v5, v2, Leo1;

    .line 57
    .line 58
    if-eqz v5, :cond_3

    .line 59
    .line 60
    move-object v2, v4

    .line 61
    :cond_3
    move-object v4, v2

    .line 62
    check-cast v4, Ljava/lang/Number;

    .line 63
    .line 64
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    const/4 v5, 0x0

    .line 69
    if-lez v4, :cond_4

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_4
    move-object v2, v5

    .line 73
    :goto_2
    check-cast v2, Ljava/lang/Integer;

    .line 74
    .line 75
    if-eqz v2, :cond_5

    .line 76
    .line 77
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    :cond_5
    :try_start_2
    invoke-virtual {p0}, Landroid/media/AudioTrack;->getChannelCount()I

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 86
    .line 87
    .line 88
    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 89
    goto :goto_3

    .line 90
    :catchall_1
    move-exception v2

    .line 91
    new-instance v4, Leo1;

    .line 92
    .line 93
    invoke-direct {v4, v2}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 94
    .line 95
    .line 96
    move-object v2, v4

    .line 97
    :goto_3
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    instance-of v6, v2, Leo1;

    .line 102
    .line 103
    if-eqz v6, :cond_6

    .line 104
    .line 105
    move-object v2, v4

    .line 106
    :cond_6
    move-object v4, v2

    .line 107
    check-cast v4, Ljava/lang/Number;

    .line 108
    .line 109
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    if-lez v4, :cond_7

    .line 114
    .line 115
    goto :goto_4

    .line 116
    :cond_7
    move-object v2, v5

    .line 117
    :goto_4
    check-cast v2, Ljava/lang/Integer;

    .line 118
    .line 119
    if-eqz v2, :cond_8

    .line 120
    .line 121
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 122
    .line 123
    .line 124
    move-result v2

    .line 125
    goto :goto_5

    .line 126
    :cond_8
    move v2, v1

    .line 127
    :goto_5
    if-eqz p1, :cond_9

    .line 128
    .line 129
    :goto_6
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    goto/16 :goto_c

    .line 134
    .line 135
    :cond_9
    :try_start_3
    const-class p1, Landroid/media/AudioTrack;

    .line 136
    .line 137
    invoke-virtual {p1}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    array-length v4, p1

    .line 145
    const/4 v6, 0x0

    .line 146
    :goto_7
    if-ge v6, v4, :cond_b

    .line 147
    .line 148
    aget-object v7, p1, v6

    .line 149
    .line 150
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v8

    .line 154
    const-string v9, "getAudioFormat"

    .line 155
    .line 156
    invoke-static {v8, v9}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v8

    .line 160
    if-eqz v8, :cond_a

    .line 161
    .line 162
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    move-result-object v8

    .line 166
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    array-length v8, v8

    .line 170
    if-nez v8, :cond_a

    .line 171
    .line 172
    goto :goto_8

    .line 173
    :catchall_2
    move-exception p1

    .line 174
    goto :goto_9

    .line 175
    :cond_a
    add-int/lit8 v6, v6, 0x1

    .line 176
    .line 177
    goto :goto_7

    .line 178
    :cond_b
    move-object v7, v5

    .line 179
    :goto_8
    if-nez v7, :cond_d

    .line 180
    .line 181
    :cond_c
    move-object p1, v5

    .line 182
    goto :goto_b

    .line 183
    :cond_d
    invoke-virtual {v7, p0, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    instance-of v4, p1, Ljava/lang/Integer;

    .line 188
    .line 189
    if-eqz v4, :cond_e

    .line 190
    .line 191
    check-cast p1, Ljava/lang/Integer;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 192
    .line 193
    goto :goto_a

    .line 194
    :cond_e
    move-object p1, v5

    .line 195
    goto :goto_a

    .line 196
    :goto_9
    new-instance v4, Leo1;

    .line 197
    .line 198
    invoke-direct {v4, p1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 199
    .line 200
    .line 201
    move-object p1, v4

    .line 202
    :goto_a
    instance-of v4, p1, Leo1;

    .line 203
    .line 204
    if-eqz v4, :cond_f

    .line 205
    .line 206
    move-object p1, v5

    .line 207
    :cond_f
    check-cast p1, Ljava/lang/Integer;

    .line 208
    .line 209
    if-eqz p1, :cond_c

    .line 210
    .line 211
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 212
    .line 213
    .line 214
    move-result v4

    .line 215
    if-eqz v4, :cond_c

    .line 216
    .line 217
    :goto_b
    if-eqz p1, :cond_10

    .line 218
    .line 219
    goto :goto_6

    .line 220
    :cond_10
    if-eqz v3, :cond_11

    .line 221
    .line 222
    iget p1, v3, Lej;->γ:I

    .line 223
    .line 224
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 225
    .line 226
    .line 227
    move-result-object v5

    .line 228
    :cond_11
    if-eqz v5, :cond_12

    .line 229
    .line 230
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 231
    .line 232
    .line 233
    move-result v1

    .line 234
    :cond_12
    :goto_c
    new-instance p1, Lej;

    .line 235
    .line 236
    invoke-direct {p1, v0, v2, v1}, Lej;-><init>(III)V

    .line 237
    .line 238
    .line 239
    sget-object v0, Lfj;->ρ:Ljava/util/Map;

    .line 240
    .line 241
    monitor-enter v0

    .line 242
    :try_start_4
    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 243
    .line 244
    .line 245
    monitor-exit v0

    .line 246
    return-object p1

    .line 247
    :catchall_3
    move-exception p0

    .line 248
    monitor-exit v0

    .line 249
    throw p0

    .line 250
    :catchall_4
    move-exception p0

    .line 251
    monitor-exit v2

    .line 252
    throw p0
.end method

.method public static Ε(Landroid/content/Context;Lcj;Ljava/lang/String;Ljava/lang/String;La80;)Ljava/lang/String;
    .locals 2

    .line 1
    const/16 v0, 0x2e

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    invoke-static {p2, v0, v1}, Lq02;->ц(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {p2, p2}, Lq02;->э(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    sget-object v1, Lgv;->ε:Lgv;

    .line 14
    .line 15
    invoke-static {p0, p1, v1, p2}, Lpd2;->Ξ(Landroid/content/Context;Ljava/lang/Object;Lgv;Ljava/lang/String;)Lfv;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const-string p2, "\u8bc4\u8bba\u533a\u8bed\u97f3"

    .line 20
    .line 21
    invoke-static {p1, p2}, Lpd2;->γ(Lfv;Ljava/lang/String;)Lfv;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    iget-object v1, p1, Lfv;->β:Ljava/lang/String;

    .line 30
    .line 31
    if-eqz p2, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const-string p2, "."

    .line 35
    .line 36
    invoke-static {v1, p2, v0}, Llz1;->ν(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    :goto_0
    const/4 p2, 0x0

    .line 41
    :try_start_0
    sget-object v0, Lqy0;->α:Lqy0;

    .line 42
    .line 43
    iget-object p1, p1, Lfv;->α:Ljava/lang/String;

    .line 44
    .line 45
    sget-object v0, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 48
    .line 49
    .line 50
    :try_start_1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    invoke-static {p0, p1, v1, p3, v0}, Lqy0;->χ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 54
    .line 55
    .line 56
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 57
    :try_start_2
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 58
    .line 59
    .line 60
    move-result-object p3

    .line 61
    invoke-virtual {p3, p1}, Landroid/content/ContentResolver;->openOutputStream(Landroid/net/Uri;)Ljava/io/OutputStream;

    .line 62
    .line 63
    .line 64
    move-result-object p3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 65
    if-eqz p3, :cond_1

    .line 66
    .line 67
    :try_start_3
    invoke-interface {p4, p3}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p3}, Ljava/io/OutputStream;->flush()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 71
    .line 72
    .line 73
    :try_start_4
    invoke-interface {p3}, Ljava/io/Closeable;->close()V

    .line 74
    .line 75
    .line 76
    invoke-static {p0, p1}, Lqy0;->д(Landroid/content/Context;Landroid/net/Uri;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 77
    .line 78
    .line 79
    return-object v1

    .line 80
    :catchall_0
    move-exception p3

    .line 81
    goto :goto_2

    .line 82
    :catchall_1
    move-exception p4

    .line 83
    :try_start_5
    throw p4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 84
    :catchall_2
    move-exception v0

    .line 85
    :try_start_6
    invoke-static {p3, p4}, Lxb;->λ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 86
    .line 87
    .line 88
    throw v0

    .line 89
    :cond_1
    new-instance p3, Ljava/lang/IllegalStateException;

    .line 90
    .line 91
    const-string p4, "\u8f93\u51fa\u6d41\u4e3a\u7a7a"

    .line 92
    .line 93
    invoke-direct {p3, p4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    throw p3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 97
    :catchall_3
    move-exception p1

    .line 98
    move-object p3, p1

    .line 99
    :goto_1
    move-object p1, p2

    .line 100
    goto :goto_2

    .line 101
    :catchall_4
    move-exception p3

    .line 102
    goto :goto_1

    .line 103
    :goto_2
    sget-object p4, Lqy0;->α:Lqy0;

    .line 104
    .line 105
    invoke-static {p0, p1}, Lqy0;->ω(Landroid/content/Context;Landroid/net/Uri;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    new-instance p4, Ljava/lang/StringBuilder;

    .line 113
    .line 114
    const-string v0, "\u5199\u5165\u8bc4\u8bba\u8bed\u97f3\u5931\u8d25 file="

    .line 115
    .line 116
    invoke-direct {p4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    const-string v0, " err="

    .line 123
    .line 124
    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    invoke-static {p1}, Lfj;->φ(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    if-eqz p1, :cond_2

    .line 142
    .line 143
    const/16 p3, 0x28

    .line 144
    .line 145
    invoke-static {p1, p3}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    goto :goto_3

    .line 150
    :cond_2
    move-object p1, p2

    .line 151
    :goto_3
    new-instance p3, Ljava/lang/StringBuilder;

    .line 152
    .line 153
    const-string p4, "\u8bc4\u8bba\u8bed\u97f3\u5199\u5165\u5931\u8d25: "

    .line 154
    .line 155
    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    invoke-static {p0, p1}, Lfj;->Η(Landroid/content/Context;Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    return-object p2
.end method

.method public static Ζ(Ljava/lang/reflect/Method;)I
    .locals 6

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
    sget-object v1, Lfj;->β:Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    const/16 v0, 0x7d0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v0, v1

    .line 22
    :goto_0
    const-class v2, Landroid/view/View;

    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-virtual {v2, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    add-int/lit16 v0, v0, 0x3e8

    .line 35
    .line 36
    :cond_1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    invoke-static {v2}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-nez v2, :cond_2

    .line 45
    .line 46
    add-int/lit16 v0, v0, 0x12c

    .line 47
    .line 48
    :cond_2
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    sget-object v3, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 53
    .line 54
    invoke-static {v2, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-eqz v2, :cond_3

    .line 59
    .line 60
    add-int/lit16 v0, v0, 0x1f4

    .line 61
    .line 62
    :cond_3
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    array-length v3, v2

    .line 70
    :goto_1
    if-ge v1, v3, :cond_5

    .line 71
    .line 72
    aget-object v4, v2, v1

    .line 73
    .line 74
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    const-string v5, "~7970EC7DC8C1E9D1DCDC9F0020E48B764591F776A2B2A0F654AFAE24985FA802AAD9131B3F256364FE597603FE0C9F429AC0783D12F128B686"

    .line 79
    .line 80
    invoke-static {v5}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    if-eqz v4, :cond_4

    .line 89
    .line 90
    add-int/lit16 v0, v0, 0x5dc

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_4
    add-int/lit8 v1, v1, 0x1

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_5
    :goto_2
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    array-length p0, p0

    .line 101
    const/4 v1, 0x1

    .line 102
    if-gt v1, p0, :cond_6

    .line 103
    .line 104
    const/4 v1, 0x7

    .line 105
    if-ge p0, v1, :cond_6

    .line 106
    .line 107
    add-int/lit16 v0, v0, 0xc8

    .line 108
    .line 109
    :cond_6
    return v0
.end method

.method public static Η(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Lyi;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1, p0, p1}, Lyi;-><init>(ILandroid/content/Context;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    sget-object p0, Lfj;->σ:Landroid/os/Handler;

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public static Θ(Landroid/content/Context;Lcj;)V
    .locals 4

    .line 1
    iget-object v0, p1, Lcj;->α:Ljava/lang/String;

    .line 2
    .line 3
    sget-object v1, Lfj;->λ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    const/4 v3, 0x0

    .line 10
    if-nez v2, :cond_1

    .line 11
    .line 12
    new-instance v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 13
    .line 14
    invoke-direct {v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move-object v2, v0

    .line 25
    :cond_1
    :goto_0
    check-cast v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    invoke-virtual {v2, v3, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_2

    .line 33
    .line 34
    const-string p1, "\u8bc4\u8bba\u8bed\u97f3\u6b63\u5728\u4fdd\u5b58\uff0c\u8bf7\u7a0d\u5019"

    .line 35
    .line 36
    invoke-static {p0, p1}, Lfj;->Η(Landroid/content/Context;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_2
    const-string v0, "\u6b63\u5728\u4fdd\u5b58\u8bc4\u8bba\u8bed\u97f3..."

    .line 41
    .line 42
    invoke-static {p0, v0}, Lfj;->Η(Landroid/content/Context;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    new-instance v0, Le9;

    .line 46
    .line 47
    const/4 v1, 0x5

    .line 48
    invoke-direct {v0, p1, p0, v2, v1}, Le9;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 49
    .line 50
    .line 51
    sget-object p0, Lfj;->ξ:Ljava/util/concurrent/ExecutorService;

    .line 52
    .line 53
    invoke-interface {p0, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public static Ι(Landroid/view/View;)Z
    .locals 5

    .line 1
    instance-of v0, p0, Landroid/widget/TextView;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move-object v0, p0

    .line 7
    check-cast v0, Landroid/widget/TextView;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const-string v3, "dyhelper_comment_audio_download_button"

    .line 14
    .line 15
    invoke-static {v2, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    invoke-static {v0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    xor-int/2addr v0, v1

    .line 48
    if-ne v0, v1, :cond_0

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_0
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 52
    .line 53
    if-eqz v0, :cond_1

    .line 54
    .line 55
    check-cast p0, Landroid/view/ViewGroup;

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    const/4 p0, 0x0

    .line 59
    :goto_0
    const/4 v0, 0x0

    .line 60
    if-nez p0, :cond_2

    .line 61
    .line 62
    goto :goto_4

    .line 63
    :cond_2
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    move v3, v0

    .line 68
    :goto_1
    if-ge v3, v2, :cond_5

    .line 69
    .line 70
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    if-nez v4, :cond_3

    .line 75
    .line 76
    goto :goto_3

    .line 77
    :cond_3
    invoke-static {v4}, Lfj;->Ι(Landroid/view/View;)Z

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    if-eqz v4, :cond_4

    .line 82
    .line 83
    :goto_2
    return v1

    .line 84
    :cond_4
    :goto_3
    add-int/lit8 v3, v3, 0x1

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_5
    :goto_4
    return v0
.end method

.method public static α(Landroid/content/Context;Lcj;Ljava/util/concurrent/atomic/AtomicBoolean;)Z
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    move-object v0, p0

    .line 8
    :cond_0
    new-instance v1, Ljava/io/File;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    const-string v3, "dyhelper_comment_audio"

    .line 15
    .line 16
    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    new-instance v2, Ljava/io/File;

    .line 20
    .line 21
    iget-object v3, p1, Lcj;->α:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 24
    .line 25
    .line 26
    move-result-wide v4

    .line 27
    new-instance v6, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v3, "_"

    .line 36
    .line 37
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v6, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v3, ".pcm"

    .line 44
    .line 45
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-direct {v2, v1, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    const/4 v4, 0x0

    .line 60
    if-nez v3, :cond_1

    .line 61
    .line 62
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-nez v1, :cond_1

    .line 67
    .line 68
    const-string p1, "\u8bc4\u8bba\u8bed\u97f3\u7f13\u5b58\u76ee\u5f55\u521b\u5efa\u5931\u8d25"

    .line 69
    .line 70
    invoke-static {p0, p1}, Lfj;->Η(Landroid/content/Context;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    return v4

    .line 74
    :cond_1
    new-instance v1, Ldj;

    .line 75
    .line 76
    invoke-direct {v1, v0, p1, v2, p2}, Ldj;-><init>(Landroid/content/Context;Lcj;Ljava/io/File;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    .line 77
    .line 78
    .line 79
    :cond_2
    sget-object p1, Lfj;->π:Ljava/util/concurrent/atomic/AtomicReference;

    .line 80
    .line 81
    const/4 p2, 0x0

    .line 82
    invoke-virtual {p1, p2, v1}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result p2

    .line 86
    if-eqz p2, :cond_3

    .line 87
    .line 88
    const-string p1, "\u672a\u62ff\u5230\u76f4\u94fe\uff0c\u8bf7\u70b9\u51fb\u64ad\u653e\u8be5\u8bed\u97f3\uff0c\u64ad\u653e\u7ed3\u675f\u540e\u4f1a\u81ea\u52a8\u4fdd\u5b58 WAV"

    .line 89
    .line 90
    invoke-static {p0, p1}, Lfj;->Η(Landroid/content/Context;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    new-instance p0, Lν;

    .line 94
    .line 95
    const/4 p1, 0x6

    .line 96
    invoke-direct {p0, p1, v1}, Lν;-><init>(ILjava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    const-wide/16 p1, 0x1f4

    .line 100
    .line 101
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 102
    .line 103
    sget-object v1, Lfj;->ο:Ljava/util/concurrent/ScheduledExecutorService;

    .line 104
    .line 105
    invoke-interface {v1, p0, p1, p2, v0}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 106
    .line 107
    .line 108
    const/4 p0, 0x1

    .line 109
    return p0

    .line 110
    :cond_3
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    if-eqz p1, :cond_2

    .line 115
    .line 116
    const-string p1, "\u5df2\u6709\u8bc4\u8bba\u8bed\u97f3\u6355\u83b7\u4efb\u52a1\uff0c\u8bf7\u7b49\u5f85\u5b8c\u6210"

    .line 117
    .line 118
    invoke-static {p0, p1}, Lfj;->Η(Landroid/content/Context;Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    return v4
.end method

.method public static β(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    const/16 v0, 0x18

    .line 2
    .line 3
    if-eqz p0, :cond_1

    .line 4
    .line 5
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    if-eqz p0, :cond_1

    .line 14
    .line 15
    invoke-static {p0, v0}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 p0, 0x0

    .line 27
    :goto_0
    if-eqz p0, :cond_1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    invoke-static {p1, v0}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    :goto_1
    const-string p1, "[\\\\/:*?\"<>|\\r\\n\\t]"

    .line 35
    .line 36
    invoke-static {p1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    const-string p1, "_"

    .line 48
    .line 49
    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 57
    .line 58
    .line 59
    move-result-wide v0

    .line 60
    new-instance v2, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    const-string p0, "."

    .line 75
    .line 76
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    return-object p0
.end method

.method public static γ(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 3

    .line 1
    invoke-static {p1}, Lfj;->ψ(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-nez p2, :cond_0

    .line 6
    .line 7
    new-instance v0, Lbj;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {v0, p1, v1}, Lbj;-><init>(Ljava/lang/String;Z)V

    .line 11
    .line 12
    .line 13
    sget-object v1, Lfj;->ι:Ljava/util/concurrent/ConcurrentHashMap;

    .line 14
    .line 15
    invoke-virtual {v1, p0, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    :cond_0
    sget-object v0, Lfj;->θ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 19
    .line 20
    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Lbj;

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    iget-boolean v2, v1, Lbj;->β:Z

    .line 29
    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    invoke-virtual {v1}, Lbj;->α()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-nez v1, :cond_1

    .line 37
    .line 38
    if-nez p2, :cond_1

    .line 39
    .line 40
    return-void

    .line 41
    :cond_1
    new-instance v1, Lbj;

    .line 42
    .line 43
    invoke-direct {v1, p1, p2}, Lbj;-><init>(Ljava/lang/String;Z)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, p0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public static δ()I
    .locals 4

    .line 1
    const-string v0, "comment_audio_download_trigger_mode"

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    :try_start_0
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 5
    .line 6
    .line 7
    move-result-object v2

    .line 8
    invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 9
    .line 10
    .line 11
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    move v0, v1

    .line 14
    :goto_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    if-ltz v0, :cond_0

    .line 19
    .line 20
    const/4 v3, 0x3

    .line 21
    if-ge v0, v3, :cond_0

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    const/4 v2, 0x0

    .line 25
    :goto_1
    if-eqz v2, :cond_1

    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    return v0

    .line 32
    :cond_1
    return v1
.end method

.method public static ε(Landroid/view/ViewGroup;)Z
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    :goto_0
    if-ge v2, v0, :cond_3

    .line 8
    .line 9
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    if-nez v3, :cond_0

    .line 14
    .line 15
    goto :goto_2

    .line 16
    :cond_0
    invoke-virtual {v3}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    const-string v5, "dyhelper_comment_audio_download_button"

    .line 21
    .line 22
    invoke-static {v4, v5}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    if-eqz v4, :cond_1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    instance-of v4, v3, Landroid/view/ViewGroup;

    .line 30
    .line 31
    if-eqz v4, :cond_2

    .line 32
    .line 33
    check-cast v3, Landroid/view/ViewGroup;

    .line 34
    .line 35
    invoke-static {v3}, Lfj;->ε(Landroid/view/ViewGroup;)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_2

    .line 40
    .line 41
    :goto_1
    const/4 p0, 0x1

    .line 42
    return p0

    .line 43
    :cond_2
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_3
    return v1
.end method

.method public static ζ(Landroid/content/Context;Lcj;)V
    .locals 6

    .line 1
    iget-object v0, p1, Lcj;->β:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p1, Lcj;->α:Ljava/lang/String;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    if-eqz v3, :cond_0

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    invoke-static {v0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    const-string v4, "file://"

    .line 24
    .line 25
    const/4 v5, 0x1

    .line 26
    invoke-static {v3, v4, v5}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    if-eqz v4, :cond_2

    .line 31
    .line 32
    :try_start_0
    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-virtual {v3}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    goto :goto_0

    .line 41
    :catchall_0
    move-exception v3

    .line 42
    new-instance v4, Leo1;

    .line 43
    .line 44
    invoke-direct {v4, v3}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 45
    .line 46
    .line 47
    move-object v3, v4

    .line 48
    :goto_0
    instance-of v4, v3, Leo1;

    .line 49
    .line 50
    if-eqz v4, :cond_1

    .line 51
    .line 52
    move-object v3, v2

    .line 53
    :cond_1
    check-cast v3, Ljava/lang/String;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    new-instance v4, Ljava/io/File;

    .line 58
    .line 59
    invoke-direct {v4, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_2
    const-string v4, "/"

    .line 64
    .line 65
    const/4 v5, 0x0

    .line 66
    invoke-static {v3, v4, v5}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    if-eqz v4, :cond_3

    .line 71
    .line 72
    new-instance v4, Ljava/io/File;

    .line 73
    .line 74
    invoke-direct {v4, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_3
    :goto_1
    move-object v4, v2

    .line 79
    :goto_2
    if-eqz v4, :cond_8

    .line 80
    .line 81
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    if-eqz v3, :cond_8

    .line 86
    .line 87
    invoke-virtual {v4}, Ljava/io/File;->isFile()Z

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    if-nez v3, :cond_4

    .line 92
    .line 93
    goto :goto_3

    .line 94
    :cond_4
    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    const/16 v3, 0x2e

    .line 102
    .line 103
    const-string v5, ""

    .line 104
    .line 105
    invoke-static {v0, v3, v5}, Lq02;->ц(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 110
    .line 111
    invoke-static {v3, v0, v3}, Lnx;->ν(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 116
    .line 117
    .line 118
    move-result v3

    .line 119
    if-nez v3, :cond_5

    .line 120
    .line 121
    move-object v2, v0

    .line 122
    :cond_5
    if-nez v2, :cond_6

    .line 123
    .line 124
    const-string v2, "m4a"

    .line 125
    .line 126
    :cond_6
    invoke-static {v5, v2}, Lfj;->π(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    iget-object v3, p1, Lcj;->ε:Ljava/lang/String;

    .line 131
    .line 132
    invoke-static {v3, v1, v2}, Lfj;->β(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    new-instance v2, Lθ;

    .line 137
    .line 138
    const/4 v3, 0x6

    .line 139
    invoke-direct {v2, v3, v4}, Lθ;-><init>(ILjava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    invoke-static {p0, p1, v1, v0, v2}, Lfj;->Ε(Landroid/content/Context;Lcj;Ljava/lang/String;Ljava/lang/String;La80;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    if-eqz p1, :cond_7

    .line 147
    .line 148
    const-string v0, "\u8bc4\u8bba\u8bed\u97f3\u5df2\u4fdd\u5b58: "

    .line 149
    .line 150
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    invoke-static {p0, p1}, Lfj;->Η(Landroid/content/Context;Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    :cond_7
    return-void

    .line 158
    :cond_8
    :goto_3
    const-string p1, "\u672c\u5730\u8bed\u97f3\u6587\u4ef6\u4e0d\u5b58\u5728\uff0c\u65e0\u6cd5\u4fdd\u5b58"

    .line 159
    .line 160
    invoke-static {p0, p1}, Lfj;->Η(Landroid/content/Context;Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    new-instance p0, Ljava/lang/StringBuilder;

    .line 164
    .line 165
    const-string p1, "\u672c\u5730\u8bed\u97f3\u6587\u4ef6\u4e0d\u5b58\u5728 vid="

    .line 166
    .line 167
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    const-string p1, " content="

    .line 174
    .line 175
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    invoke-static {p0}, Lfj;->φ(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    return-void
.end method

.method public static final η(Ljava/util/ArrayList;Lp70;)V
    .locals 0

    .line 1
    :try_start_0
    invoke-interface {p1}, Lp70;->invoke()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Ljava/lang/Iterable;

    .line 6
    .line 7
    invoke-static {p0, p1}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 8
    .line 9
    .line 10
    sget-object p0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    move-exception p0

    .line 14
    new-instance p1, Leo1;

    .line 15
    .line 16
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    move-object p0, p1

    .line 20
    :goto_0
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    if-eqz p0, :cond_0

    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    sget p0, Lcom/example/dyhelper/MainHook;->β:I

    .line 30
    .line 31
    :cond_0
    return-void
.end method

.method public static θ(Landroid/content/Context;Ljava/lang/String;Lcj;)V
    .locals 9

    .line 1
    const-string v0, "*/*"

    .line 2
    .line 3
    iget-object v1, p2, Lcj;->α:Ljava/lang/String;

    .line 4
    .line 5
    const-string v2, "\u8bc4\u8bba\u8bed\u97f3\u4e0b\u8f7d\u5931\u8d25: "

    .line 6
    .line 7
    const-string v3, "\u8bc4\u8bba\u8bed\u97f3\u76f4\u94fe\u4e0b\u8f7d\u5931\u8d25 vid="

    .line 8
    .line 9
    const-string v4, "\u8bc4\u8bba\u8bed\u97f3\u5df2\u4fdd\u5b58: "

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    :try_start_0
    sget-object v6, Lwx;->α:Lt41;

    .line 13
    .line 14
    const-string v6, "User-Agent"

    .line 15
    .line 16
    const-string v7, "Mozilla/5.0 (Linux; Android 13; Pixel 7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Mobile Safari/537.36"

    .line 17
    .line 18
    new-instance v8, Ll91;

    .line 19
    .line 20
    invoke-direct {v8, v6, v7}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    const-string v6, "Accept"

    .line 24
    .line 25
    new-instance v7, Ll91;

    .line 26
    .line 27
    invoke-direct {v7, v6, v0}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    filled-new-array {v8, v7}, [Ll91;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    invoke-static {v6}, Lex0;->Μ([Ll91;)Ljava/util/Map;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    const/16 v7, 0xc

    .line 39
    .line 40
    invoke-static {p1, v6, v0, v7}, Lwx;->ζ(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;I)Lvx;

    .line 41
    .line 42
    .line 43
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 44
    :try_start_1
    iget-object v6, v0, Lvx;->ε:Ljava/lang/String;

    .line 45
    .line 46
    if-nez v6, :cond_0

    .line 47
    .line 48
    const-string v6, ""

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :catchall_0
    move-exception p1

    .line 52
    goto :goto_1

    .line 53
    :cond_0
    :goto_0
    invoke-static {p1, v6}, Lfj;->ο(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-static {v6, p1}, Lfj;->π(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    iget-object v7, p2, Lcj;->ε:Ljava/lang/String;

    .line 62
    .line 63
    invoke-static {v7, v1, p1}, Lfj;->β(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    new-instance v7, Lθ;

    .line 68
    .line 69
    const/4 v8, 0x5

    .line 70
    invoke-direct {v7, v8, v0}, Lθ;-><init>(ILjava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    invoke-static {p0, p2, p1, v6, v7}, Lfj;->Ε(Landroid/content/Context;Lcj;Ljava/lang/String;Ljava/lang/String;La80;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    if-eqz p1, :cond_1

    .line 78
    .line 79
    invoke-virtual {v4, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-static {p0, p1}, Lfj;->Η(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 84
    .line 85
    .line 86
    :cond_1
    invoke-virtual {v0}, Lvx;->α()V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :catchall_1
    move-exception p1

    .line 91
    move-object v0, v5

    .line 92
    :goto_1
    :try_start_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p2

    .line 96
    new-instance v4, Ljava/lang/StringBuilder;

    .line 97
    .line 98
    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    const-string v1, " err="

    .line 105
    .line 106
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p2

    .line 116
    invoke-static {p2}, Lfj;->φ(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    if-eqz p1, :cond_2

    .line 124
    .line 125
    const/16 p2, 0x28

    .line 126
    .line 127
    invoke-static {p1, p2}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v5

    .line 131
    goto :goto_2

    .line 132
    :catchall_2
    move-exception p0

    .line 133
    goto :goto_3

    .line 134
    :cond_2
    :goto_2
    new-instance p1, Ljava/lang/StringBuilder;

    .line 135
    .line 136
    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    invoke-static {p0, p1}, Lfj;->Η(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 147
    .line 148
    .line 149
    if-eqz v0, :cond_3

    .line 150
    .line 151
    invoke-virtual {v0}, Lvx;->α()V

    .line 152
    .line 153
    .line 154
    :cond_3
    return-void

    .line 155
    :goto_3
    if-eqz v0, :cond_4

    .line 156
    .line 157
    invoke-virtual {v0}, Lvx;->α()V

    .line 158
    .line 159
    .line 160
    :cond_4
    throw p0
.end method

.method public static ι(Landroid/content/Context;I)I
    .locals 1

    .line 1
    int-to-float p1, p1

    .line 2
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-static {v0, p1, p0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    float-to-int p0, p0

    .line 16
    return p0
.end method

.method public static κ(Ldj;[BLej;)V
    .locals 2

    .line 1
    array-length v0, p1

    .line 2
    if-nez v0, :cond_0

    .line 3
    .line 4
    return-void

    .line 5
    :cond_0
    new-instance v0, Le9;

    .line 6
    .line 7
    const/4 v1, 0x6

    .line 8
    invoke-direct {v0, p0, p1, p2, v1}, Le9;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 9
    .line 10
    .line 11
    sget-object p0, Lfj;->ο:Ljava/util/concurrent/ScheduledExecutorService;

    .line 12
    .line 13
    invoke-interface {p0, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public static λ(Landroid/view/View;Lcj;)V
    .locals 8

    .line 1
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p0, Landroid/view/ViewGroup;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object p0, v1

    .line 10
    :goto_0
    if-nez p0, :cond_1

    .line 11
    .line 12
    goto/16 :goto_5

    .line 13
    .line 14
    :cond_1
    invoke-static {p0}, Lfj;->ε(Landroid/view/ViewGroup;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    goto/16 :goto_5

    .line 21
    .line 22
    :cond_2
    invoke-static {p0}, Lfj;->ξ(Landroid/view/ViewGroup;)Landroid/widget/LinearLayout;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-eqz v0, :cond_3

    .line 27
    .line 28
    :goto_1
    move-object p0, v0

    .line 29
    goto :goto_2

    .line 30
    :cond_3
    invoke-static {p0}, Lfj;->ν(Landroid/view/ViewGroup;)Landroid/widget/LinearLayout;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    if-eqz v0, :cond_4

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_4
    instance-of v0, p0, Landroid/widget/FrameLayout;

    .line 38
    .line 39
    if-nez v0, :cond_5

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_5
    move-object p0, v1

    .line 43
    :goto_2
    if-nez p0, :cond_6

    .line 44
    .line 45
    sget p0, Lcom/example/dyhelper/MainHook;->β:I

    .line 46
    .line 47
    return-void

    .line 48
    :cond_6
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    if-nez v0, :cond_7

    .line 53
    .line 54
    goto/16 :goto_5

    .line 55
    .line 56
    :cond_7
    new-instance v2, Landroid/widget/TextView;

    .line 57
    .line 58
    invoke-direct {v2, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 59
    .line 60
    .line 61
    const-string v3, "dyhelper_comment_audio_download_button"

    .line 62
    .line 63
    invoke-virtual {v2, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    const-string v3, "\u4e0b\u8f7d\u8bed\u97f3"

    .line 67
    .line 68
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 69
    .line 70
    .line 71
    const/high16 v3, 0x41400000    # 12.0f

    .line 72
    .line 73
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextSize(F)V

    .line 74
    .line 75
    .line 76
    const/4 v3, -0x1

    .line 77
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 78
    .line 79
    .line 80
    const/16 v3, 0x11

    .line 81
    .line 82
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setGravity(I)V

    .line 83
    .line 84
    .line 85
    const/4 v3, 0x1

    .line 86
    invoke-virtual {v2, v1, v3}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2, v3}, Landroid/view/View;->setClickable(Z)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2, v3}, Landroid/view/View;->setFocusable(Z)V

    .line 93
    .line 94
    .line 95
    const/16 v1, 0xc

    .line 96
    .line 97
    invoke-static {v0, v1}, Lfj;->ι(Landroid/content/Context;I)I

    .line 98
    .line 99
    .line 100
    move-result v4

    .line 101
    const/4 v5, 0x6

    .line 102
    invoke-static {v0, v5}, Lfj;->ι(Landroid/content/Context;I)I

    .line 103
    .line 104
    .line 105
    move-result v6

    .line 106
    invoke-static {v0, v1}, Lfj;->ι(Landroid/content/Context;I)I

    .line 107
    .line 108
    .line 109
    move-result v7

    .line 110
    invoke-static {v0, v5}, Lfj;->ι(Landroid/content/Context;I)I

    .line 111
    .line 112
    .line 113
    move-result v5

    .line 114
    invoke-virtual {v2, v4, v6, v7, v5}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 115
    .line 116
    .line 117
    new-instance v4, Landroid/graphics/drawable/GradientDrawable;

    .line 118
    .line 119
    invoke-direct {v4}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 120
    .line 121
    .line 122
    const/16 v5, 0xc7

    .line 123
    .line 124
    const/16 v6, 0x59

    .line 125
    .line 126
    const/16 v7, 0x34

    .line 127
    .line 128
    invoke-static {v7, v5, v6}, Landroid/graphics/Color;->rgb(III)I

    .line 129
    .line 130
    .line 131
    move-result v5

    .line 132
    invoke-virtual {v4, v5}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 133
    .line 134
    .line 135
    invoke-static {v0, v1}, Lfj;->ι(Landroid/content/Context;I)I

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    int-to-float v1, v1

    .line 140
    invoke-virtual {v4, v1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v2, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 144
    .line 145
    .line 146
    new-instance v1, Ll9;

    .line 147
    .line 148
    invoke-direct {v1, v0, v3, p1}, Ll9;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v2, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 152
    .line 153
    .line 154
    instance-of p1, p0, Landroid/widget/LinearLayout;

    .line 155
    .line 156
    const/4 v1, 0x4

    .line 157
    const/4 v3, -0x2

    .line 158
    if-eqz p1, :cond_8

    .line 159
    .line 160
    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    .line 161
    .line 162
    invoke-direct {p1, v3, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 163
    .line 164
    .line 165
    invoke-static {v0, v1}, Lfj;->ι(Landroid/content/Context;I)I

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    iput v0, p1, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 170
    .line 171
    goto :goto_3

    .line 172
    :cond_8
    instance-of p1, p0, Landroid/widget/FrameLayout;

    .line 173
    .line 174
    if-eqz p1, :cond_9

    .line 175
    .line 176
    new-instance p1, Landroid/widget/FrameLayout$LayoutParams;

    .line 177
    .line 178
    invoke-direct {p1, v3, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 179
    .line 180
    .line 181
    const v1, 0x800053

    .line 182
    .line 183
    .line 184
    iput v1, p1, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 185
    .line 186
    const/4 v1, 0x2

    .line 187
    invoke-static {v0, v1}, Lfj;->ι(Landroid/content/Context;I)I

    .line 188
    .line 189
    .line 190
    move-result v3

    .line 191
    iput v3, p1, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 192
    .line 193
    invoke-static {v0, v1}, Lfj;->ι(Landroid/content/Context;I)I

    .line 194
    .line 195
    .line 196
    move-result v0

    .line 197
    iput v0, p1, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    .line 198
    .line 199
    goto :goto_3

    .line 200
    :cond_9
    new-instance p1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 201
    .line 202
    invoke-direct {p1, v3, v3}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    .line 203
    .line 204
    .line 205
    invoke-static {v0, v1}, Lfj;->ι(Landroid/content/Context;I)I

    .line 206
    .line 207
    .line 208
    move-result v0

    .line 209
    iput v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 210
    .line 211
    :goto_3
    :try_start_0
    invoke-virtual {p0, v2, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 212
    .line 213
    .line 214
    sget-object p0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 215
    .line 216
    goto :goto_4

    .line 217
    :catchall_0
    move-exception p0

    .line 218
    new-instance p1, Leo1;

    .line 219
    .line 220
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 221
    .line 222
    .line 223
    move-object p0, p1

    .line 224
    :goto_4
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 225
    .line 226
    .line 227
    move-result-object p0

    .line 228
    if-eqz p0, :cond_a

    .line 229
    .line 230
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    sget p0, Lcom/example/dyhelper/MainHook;->β:I

    .line 234
    .line 235
    :cond_a
    :goto_5
    return-void
.end method

.method public static μ(ILjava/lang/Object;)Ljava/lang/String;
    .locals 5

    .line 1
    if-eqz p1, :cond_7

    .line 2
    .line 3
    sget-object v0, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_7

    .line 10
    .line 11
    if-gtz p0, :cond_0

    .line 12
    .line 13
    goto :goto_3

    .line 14
    :cond_0
    instance-of v0, p1, Ljava/lang/String;

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    check-cast p1, Ljava/lang/String;

    .line 20
    .line 21
    invoke-static {p1}, Lfj;->ψ(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    const-string p1, "http"

    .line 26
    .line 27
    invoke-static {p0, p1, v1}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_7

    .line 32
    .line 33
    invoke-static {p0}, Lfj;->σ(Ljava/lang/String;)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eqz p1, :cond_7

    .line 38
    .line 39
    return-object p0

    .line 40
    :cond_1
    instance-of v0, p1, Lorg/json/JSONObject;

    .line 41
    .line 42
    if-eqz v0, :cond_4

    .line 43
    .line 44
    check-cast p1, Lorg/json/JSONObject;

    .line 45
    .line 46
    invoke-virtual {p1}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-eqz v2, :cond_7

    .line 55
    .line 56
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    check-cast v2, Ljava/lang/String;

    .line 61
    .line 62
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    add-int/lit8 v3, p0, -0x1

    .line 67
    .line 68
    invoke-static {v3, v2}, Lfj;->μ(ILjava/lang/Object;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    if-eqz v2, :cond_2

    .line 73
    .line 74
    invoke-static {v2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    if-eqz v3, :cond_3

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_3
    return-object v2

    .line 82
    :cond_4
    instance-of v0, p1, Lorg/json/JSONArray;

    .line 83
    .line 84
    if-eqz v0, :cond_7

    .line 85
    .line 86
    check-cast p1, Lorg/json/JSONArray;

    .line 87
    .line 88
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    const/4 v2, 0x0

    .line 93
    :goto_1
    if-ge v2, v0, :cond_7

    .line 94
    .line 95
    invoke-virtual {p1, v2}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    add-int/lit8 v4, p0, -0x1

    .line 100
    .line 101
    invoke-static {v4, v3}, Lfj;->μ(ILjava/lang/Object;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    if-eqz v3, :cond_6

    .line 106
    .line 107
    invoke-static {v3}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 108
    .line 109
    .line 110
    move-result v4

    .line 111
    if-eqz v4, :cond_5

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_5
    return-object v3

    .line 115
    :cond_6
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_7
    :goto_3
    const/4 p0, 0x0

    .line 119
    return-object p0
.end method

.method public static ν(Landroid/view/ViewGroup;)Landroid/widget/LinearLayout;
    .locals 5

    .line 1
    instance-of v0, p0, Landroid/widget/LinearLayout;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p0

    .line 6
    check-cast v0, Landroid/widget/LinearLayout;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getOrientation()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v2, 0x1

    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/4 v1, 0x0

    .line 21
    :goto_0
    const/4 v2, 0x0

    .line 22
    if-ge v1, v0, :cond_4

    .line 23
    .line 24
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    instance-of v4, v3, Landroid/view/ViewGroup;

    .line 29
    .line 30
    if-eqz v4, :cond_1

    .line 31
    .line 32
    move-object v2, v3

    .line 33
    check-cast v2, Landroid/view/ViewGroup;

    .line 34
    .line 35
    :cond_1
    if-nez v2, :cond_2

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_2
    invoke-static {v2}, Lfj;->ν(Landroid/view/ViewGroup;)Landroid/widget/LinearLayout;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    if-eqz v2, :cond_3

    .line 43
    .line 44
    return-object v2

    .line 45
    :cond_3
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_4
    return-object v2
.end method

.method public static ξ(Landroid/view/ViewGroup;)Landroid/widget/LinearLayout;
    .locals 5

    .line 1
    instance-of v0, p0, Landroid/widget/LinearLayout;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p0

    .line 6
    check-cast v0, Landroid/widget/LinearLayout;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getOrientation()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v2, 0x1

    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    invoke-static {p0}, Lfj;->Ι(Landroid/view/View;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    return-object v0

    .line 22
    :cond_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/4 v1, 0x0

    .line 27
    :goto_0
    const/4 v2, 0x0

    .line 28
    if-ge v1, v0, :cond_4

    .line 29
    .line 30
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    instance-of v4, v3, Landroid/view/ViewGroup;

    .line 35
    .line 36
    if-eqz v4, :cond_1

    .line 37
    .line 38
    move-object v2, v3

    .line 39
    check-cast v2, Landroid/view/ViewGroup;

    .line 40
    .line 41
    :cond_1
    if-nez v2, :cond_2

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    invoke-static {v2}, Lfj;->ξ(Landroid/view/ViewGroup;)Landroid/widget/LinearLayout;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    if-eqz v2, :cond_3

    .line 49
    .line 50
    return-object v2

    .line 51
    :cond_3
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_4
    return-object v2
.end method

.method public static ο(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 2
    .line 3
    invoke-static {v0, p1, v0}, Lnx;->ν(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    const-string v0, "audio/mp4"

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-static {p1, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const-string v2, "m4a"

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const-string v0, "audio/mpeg"

    .line 27
    .line 28
    invoke-static {p1, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    const-string v0, "audio/aac"

    .line 36
    .line 37
    invoke-static {p1, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_2
    const-string v0, "audio/ogg"

    .line 45
    .line 46
    invoke-static {p1, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_3

    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_3
    const-string v0, "audio/wav"

    .line 54
    .line 55
    invoke-static {p1, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-eqz p1, :cond_4

    .line 60
    .line 61
    goto :goto_4

    .line 62
    :cond_4
    const-string p1, ".m4a"

    .line 63
    .line 64
    invoke-static {p0, p1, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-eqz p1, :cond_5

    .line 69
    .line 70
    :goto_0
    return-object v2

    .line 71
    :cond_5
    const-string p1, ".mp3"

    .line 72
    .line 73
    invoke-static {p0, p1, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    if-eqz p1, :cond_6

    .line 78
    .line 79
    :goto_1
    const-string p0, "mp3"

    .line 80
    .line 81
    return-object p0

    .line 82
    :cond_6
    const-string p1, ".aac"

    .line 83
    .line 84
    invoke-static {p0, p1, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    if-eqz p1, :cond_7

    .line 89
    .line 90
    :goto_2
    const-string p0, "aac"

    .line 91
    .line 92
    return-object p0

    .line 93
    :cond_7
    const-string p1, ".ogg"

    .line 94
    .line 95
    invoke-static {p0, p1, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    if-eqz p1, :cond_8

    .line 100
    .line 101
    :goto_3
    const-string p0, "ogg"

    .line 102
    .line 103
    return-object p0

    .line 104
    :cond_8
    const-string p1, ".wav"

    .line 105
    .line 106
    invoke-static {p0, p1, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 107
    .line 108
    .line 109
    move-result p1

    .line 110
    if-eqz p1, :cond_9

    .line 111
    .line 112
    :goto_4
    const-string p0, "wav"

    .line 113
    .line 114
    return-object p0

    .line 115
    :cond_9
    const-string p1, "mime_type=audio_mp4"

    .line 116
    .line 117
    invoke-static {p0, p1, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 118
    .line 119
    .line 120
    return-object v2
.end method

.method public static π(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, ";"

    .line 2
    .line 3
    invoke-static {p0, v0, p0}, Lq02;->щ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const-string v0, "audio/"

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-static {p0, v0, v1}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_0
    sget-object p0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 26
    .line 27
    invoke-static {p0, p1, p0}, Lnx;->ν(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    sparse-switch p1, :sswitch_data_0

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :sswitch_0
    const-string p1, "wav"

    .line 40
    .line 41
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    if-nez p0, :cond_1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    const-string p0, "audio/wav"

    .line 49
    .line 50
    return-object p0

    .line 51
    :sswitch_1
    const-string p1, "ogg"

    .line 52
    .line 53
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    if-nez p0, :cond_2

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    const-string p0, "audio/ogg"

    .line 61
    .line 62
    return-object p0

    .line 63
    :sswitch_2
    const-string p1, "mp3"

    .line 64
    .line 65
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    if-nez p0, :cond_3

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_3
    const-string p0, "audio/mpeg"

    .line 73
    .line 74
    return-object p0

    .line 75
    :sswitch_3
    const-string p1, "aac"

    .line 76
    .line 77
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    if-nez p0, :cond_4

    .line 82
    .line 83
    :goto_0
    const-string p0, "audio/mp4"

    .line 84
    .line 85
    return-object p0

    .line 86
    :cond_4
    const-string p0, "audio/aac"

    .line 87
    .line 88
    return-object p0

    .line 89
    :sswitch_data_0
    .sparse-switch
        0x17843 -> :sswitch_3
        0x1a6f0 -> :sswitch_2
        0x1ad8f -> :sswitch_1
        0x1caec -> :sswitch_0
    .end sparse-switch
.end method

.method public static σ(Ljava/lang/String;)Z
    .locals 3

    .line 1
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 2
    .line 3
    invoke-static {v0, p0, v0}, Lnx;->ν(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-string v0, "http"

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-static {p0, v0, v1}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const-string v0, "fplay"

    .line 18
    .line 19
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const-string v0, "snssdk.com/video/"

    .line 27
    .line 28
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    sget-object v0, Lfj;->τ:Ljava/util/Set;

    .line 36
    .line 37
    check-cast v0, Ljava/lang/Iterable;

    .line 38
    .line 39
    instance-of v2, v0, Ljava/util/Collection;

    .line 40
    .line 41
    if-eqz v2, :cond_3

    .line 42
    .line 43
    move-object v2, v0

    .line 44
    check-cast v2, Ljava/util/Collection;

    .line 45
    .line 46
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-eqz v2, :cond_3

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_3
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-eqz v2, :cond_5

    .line 62
    .line 63
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    check-cast v2, Ljava/lang/String;

    .line 68
    .line 69
    invoke-static {p0, v2, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    if-eqz v2, :cond_4

    .line 74
    .line 75
    const/4 p0, 0x1

    .line 76
    return p0

    .line 77
    :cond_5
    :goto_0
    return v1
.end method

.method public static τ(Ljava/lang/reflect/Method;)Z
    .locals 6

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
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto :goto_2

    .line 13
    :cond_0
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sget-object v2, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 18
    .line 19
    invoke-static {v0, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    goto :goto_2

    .line 26
    :cond_1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    array-length v2, v0

    .line 34
    move v3, v1

    .line 35
    :goto_0
    if-ge v3, v2, :cond_5

    .line 36
    .line 37
    aget-object v4, v0, v3

    .line 38
    .line 39
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    const-string v5, "~7970EC7DC8C1E9D1DCDC9F0020E48B764591F776A2B2A0F654AFAE24985FA802AAD9131B3F256364FE597603FE0C9F429AC0783D12F128B686"

    .line 44
    .line 45
    invoke-static {v5}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    if-eqz v4, :cond_4

    .line 54
    .line 55
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    sget-object v1, Lfj;->β:Ljava/util/List;

    .line 64
    .line 65
    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-eqz v0, :cond_2

    .line 70
    .line 71
    const/4 p0, 0x1

    .line 72
    return p0

    .line 73
    :cond_2
    :try_start_0
    const-class v0, Landroid/view/View;

    .line 74
    .line 75
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 80
    .line 81
    .line 82
    move-result p0

    .line 83
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 84
    .line 85
    .line 86
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 87
    goto :goto_1

    .line 88
    :catchall_0
    move-exception p0

    .line 89
    new-instance v0, Leo1;

    .line 90
    .line 91
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 92
    .line 93
    .line 94
    move-object p0, v0

    .line 95
    :goto_1
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 96
    .line 97
    instance-of v1, p0, Leo1;

    .line 98
    .line 99
    if-eqz v1, :cond_3

    .line 100
    .line 101
    move-object p0, v0

    .line 102
    :cond_3
    check-cast p0, Ljava/lang/Boolean;

    .line 103
    .line 104
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 105
    .line 106
    .line 107
    move-result p0

    .line 108
    return p0

    .line 109
    :cond_4
    add-int/lit8 v3, v3, 0x1

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_5
    :goto_2
    return v1
.end method

.method public static υ(Ljava/lang/String;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_2

    .line 3
    .line 4
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    const-string v1, "/"

    .line 20
    .line 21
    invoke-static {p0, v1, v0}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    const/4 v2, 0x1

    .line 26
    if-nez v1, :cond_1

    .line 27
    .line 28
    const-string v1, "file://"

    .line 29
    .line 30
    invoke-static {p0, v1, v2}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-eqz p0, :cond_2

    .line 35
    .line 36
    :cond_1
    return v2

    .line 37
    :cond_2
    :goto_0
    return v0
.end method

.method public static φ(Ljava/lang/String;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x4

    .line 3
    const-string v2, "CommentAudioDownload"

    .line 4
    .line 5
    invoke-static {v2, p0, v0, v1, v0}, Lux;->λ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static χ(Ljava/lang/reflect/Method;)Ljava/lang/String;
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

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
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v1, "#"

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v1, "("

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    new-instance v2, Lgh;

    .line 42
    .line 43
    const/4 v3, 0x7

    .line 44
    invoke-direct {v2, v3}, Lgh;-><init>(I)V

    .line 45
    .line 46
    .line 47
    const/16 v3, 0x1e

    .line 48
    .line 49
    const-string v4, ","

    .line 50
    .line 51
    const/4 v5, 0x0

    .line 52
    invoke-static {v1, v4, v5, v2, v3}, Lg7;->з([Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;La80;I)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    const-string v2, "):"

    .line 57
    .line 58
    invoke-static {v0, v1, v2, p0}, Llz1;->ρ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0
.end method

.method public static ψ(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

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
    const-string v0, "//"

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-static {p0, v0, v1}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    const-string v0, "https:"

    .line 19
    .line 20
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    :cond_0
    const-string v0, "&amp;"

    .line 25
    .line 26
    const-string v1, "&"

    .line 27
    .line 28
    invoke-static {p0, v0, v1}, Lx02;->Ν(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    const-string v0, "\\u0026"

    .line 33
    .line 34
    invoke-static {p0, v0, v1}, Lx02;->Ν(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0
.end method

.method public static ω(Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

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
    :try_start_0
    const-string v0, "{"

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-static {p0, v0, v1}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    new-instance v0, Lorg/json/JSONObject;

    .line 19
    .line 20
    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    goto :goto_1

    .line 24
    :catchall_0
    move-exception v0

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const-string v0, "["

    .line 27
    .line 28
    invoke-static {p0, v0, v1}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    new-instance v0, Lorg/json/JSONArray;

    .line 35
    .line 36
    invoke-direct {v0, p0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    move-object v0, p0

    .line 41
    goto :goto_1

    .line 42
    :goto_0
    new-instance v1, Leo1;

    .line 43
    .line 44
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 45
    .line 46
    .line 47
    move-object v0, v1

    .line 48
    :goto_1
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    if-nez v1, :cond_2

    .line 53
    .line 54
    move-object p0, v0

    .line 55
    :cond_2
    return-object p0
.end method


# virtual methods
.method public final ρ(Ljava/lang/ClassLoader;)V
    .locals 11

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lfj;->δ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    new-instance v0, Laj;

    .line 16
    .line 17
    const/4 v3, 0x2

    .line 18
    invoke-direct {v0, v3}, Laj;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    new-instance v5, Ls0;

    .line 26
    .line 27
    const/16 v0, 0x8

    .line 28
    .line 29
    invoke-direct {v5, v0}, Ls0;-><init>(I)V

    .line 30
    .line 31
    .line 32
    const-wide/16 v8, 0x2

    .line 33
    .line 34
    sget-object v10, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    .line 35
    .line 36
    const-wide/16 v6, 0x2

    .line 37
    .line 38
    invoke-interface/range {v4 .. v10}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 39
    .line 40
    .line 41
    :goto_0
    const-class v3, Landroid/media/AudioTrack;

    .line 42
    .line 43
    sget-object v0, Lfj;->ε:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 44
    .line 45
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-nez v0, :cond_1

    .line 50
    .line 51
    goto :goto_3

    .line 52
    :cond_1
    :try_start_0
    sget-object v0, Lxq0;->α:Lxq0;

    .line 53
    .line 54
    new-instance v4, Lh;

    .line 55
    .line 56
    const/16 v5, 0x12

    .line 57
    .line 58
    invoke-direct {v4, v5, p0}, Lh;-><init>(ILjava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, v3, v4}, Lxq0;->β(Ljava/lang/Class;Lm01;)Ljava/util/Set;

    .line 62
    .line 63
    .line 64
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    goto :goto_1

    .line 66
    :catchall_0
    move-exception v0

    .line 67
    new-instance v4, Leo1;

    .line 68
    .line 69
    invoke-direct {v4, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 70
    .line 71
    .line 72
    move-object v0, v4

    .line 73
    :goto_1
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    if-eqz v0, :cond_2

    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    new-instance v4, Ljava/lang/StringBuilder;

    .line 84
    .line 85
    const-string v5, "Hook AudioTrack \u6784\u9020\u5931\u8d25: "

    .line 86
    .line 87
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-static {v0}, Lfj;->φ(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    :cond_2
    :try_start_1
    sget-object v0, Lxq0;->α:Lxq0;

    .line 101
    .line 102
    const-string v4, "write"

    .line 103
    .line 104
    new-instance v5, Lh;

    .line 105
    .line 106
    const/16 v6, 0x13

    .line 107
    .line 108
    invoke-direct {v5, v6, p0}, Lh;-><init>(ILjava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0, v3, v4, v5}, Lxq0;->γ(Ljava/lang/Class;Ljava/lang/String;Lm01;)Ljava/util/Set;

    .line 112
    .line 113
    .line 114
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 115
    goto :goto_2

    .line 116
    :catchall_1
    move-exception v0

    .line 117
    new-instance v3, Leo1;

    .line 118
    .line 119
    invoke-direct {v3, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 120
    .line 121
    .line 122
    move-object v0, v3

    .line 123
    :goto_2
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    if-eqz v0, :cond_3

    .line 128
    .line 129
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    new-instance v3, Ljava/lang/StringBuilder;

    .line 134
    .line 135
    const-string v4, "Hook AudioTrack.write \u5931\u8d25: "

    .line 136
    .line 137
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    invoke-static {v0}, Lfj;->φ(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    :cond_3
    :goto_3
    sget-object v0, Lfj;->ζ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 151
    .line 152
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 153
    .line 154
    .line 155
    move-result v0

    .line 156
    if-nez v0, :cond_4

    .line 157
    .line 158
    goto :goto_5

    .line 159
    :cond_4
    :try_start_2
    sget-object v0, Lxq0;->α:Lxq0;

    .line 160
    .line 161
    const-class v3, Landroid/view/View;

    .line 162
    .line 163
    const-string v4, "performClick"

    .line 164
    .line 165
    new-instance v5, Lh;

    .line 166
    .line 167
    const/16 v6, 0x14

    .line 168
    .line 169
    invoke-direct {v5, v6, p0}, Lh;-><init>(ILjava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v0, v3, v4, v5}, Lxq0;->γ(Ljava/lang/Class;Ljava/lang/String;Lm01;)Ljava/util/Set;

    .line 173
    .line 174
    .line 175
    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 176
    goto :goto_4

    .line 177
    :catchall_2
    move-exception v0

    .line 178
    move-object p0, v0

    .line 179
    new-instance v0, Leo1;

    .line 180
    .line 181
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 182
    .line 183
    .line 184
    move-object p0, v0

    .line 185
    :goto_4
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 186
    .line 187
    .line 188
    move-result-object p0

    .line 189
    if-eqz p0, :cond_5

    .line 190
    .line 191
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    new-instance v0, Ljava/lang/StringBuilder;

    .line 196
    .line 197
    const-string v3, "Hook View.performClick \u5931\u8d25: "

    .line 198
    .line 199
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    invoke-static {p0}, Lfj;->φ(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    :cond_5
    :goto_5
    invoke-static {p1, v1}, Lfj;->Γ(Ljava/lang/ClassLoader;Z)Ljava/util/List;

    .line 213
    .line 214
    .line 215
    move-result-object p0

    .line 216
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 217
    .line 218
    .line 219
    move-result-object p0

    .line 220
    move p1, v1

    .line 221
    :cond_6
    :goto_6
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 222
    .line 223
    .line 224
    move-result v0

    .line 225
    if-eqz v0, :cond_9

    .line 226
    .line 227
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    check-cast v0, Ljava/lang/reflect/Method;

    .line 232
    .line 233
    invoke-static {v0}, Lfj;->χ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v3

    .line 237
    sget-object v4, Lfj;->η:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 238
    .line 239
    invoke-virtual {v4, v3}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    move-result v5

    .line 243
    if-nez v5, :cond_7

    .line 244
    .line 245
    move v0, v1

    .line 246
    goto :goto_9

    .line 247
    :cond_7
    :try_start_3
    invoke-virtual {v0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 248
    .line 249
    .line 250
    sget-object v5, Lxq0;->α:Lxq0;

    .line 251
    .line 252
    new-instance v6, Lh;

    .line 253
    .line 254
    const/16 v7, 0x11

    .line 255
    .line 256
    invoke-direct {v6, v7}, Lh;-><init>(I)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v5, v0, v6}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 260
    .line 261
    .line 262
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 263
    .line 264
    goto :goto_7

    .line 265
    :catchall_3
    move-exception v0

    .line 266
    new-instance v5, Leo1;

    .line 267
    .line 268
    invoke-direct {v5, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 269
    .line 270
    .line 271
    move-object v0, v5

    .line 272
    :goto_7
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 273
    .line 274
    .line 275
    move-result-object v5

    .line 276
    if-nez v5, :cond_8

    .line 277
    .line 278
    goto :goto_8

    .line 279
    :cond_8
    invoke-virtual {v4, v3}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->remove(Ljava/lang/Object;)Z

    .line 280
    .line 281
    .line 282
    invoke-virtual {v5}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    new-instance v4, Ljava/lang/StringBuilder;

    .line 287
    .line 288
    const-string v5, "Hook \u8bc4\u8bba\u97f3\u9891\u7ed1\u5b9a\u5165\u53e3\u5931\u8d25: "

    .line 289
    .line 290
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 294
    .line 295
    .line 296
    const-string v3, " err="

    .line 297
    .line 298
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 299
    .line 300
    .line 301
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 302
    .line 303
    .line 304
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    invoke-static {v0}, Lfj;->φ(Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 312
    .line 313
    :goto_8
    check-cast v0, Ljava/lang/Boolean;

    .line 314
    .line 315
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 316
    .line 317
    .line 318
    move-result v0

    .line 319
    :goto_9
    if-eqz v0, :cond_6

    .line 320
    .line 321
    add-int/lit8 p1, p1, 0x1

    .line 322
    .line 323
    goto :goto_6

    .line 324
    :cond_9
    if-lez p1, :cond_a

    .line 325
    .line 326
    const-string p0, "\u8bc4\u8bba\u97f3\u9891\u7ed1\u5b9a\u5165\u53e3 Hook \u5b8c\u6210 count="

    .line 327
    .line 328
    invoke-static {p0, p1}, La12;->δ(Ljava/lang/String;I)Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object p0

    .line 332
    const/4 p1, 0x0

    .line 333
    const/4 v0, 0x4

    .line 334
    const-string v1, "CommentAudioDownload"

    .line 335
    .line 336
    invoke-static {v1, p0, p1, v0, p1}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 337
    .line 338
    .line 339
    :cond_a
    return-void
.end method
