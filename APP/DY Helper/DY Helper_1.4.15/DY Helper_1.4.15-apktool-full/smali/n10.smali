.class public final Ln10;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final β:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final γ:Ljava/util/HashSet;

.field public static final δ:Landroid/os/Handler;

.field public static final ε:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final ζ:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ln10;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 10
    .line 11
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Ln10;->β:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 15
    .line 16
    new-instance v0, Ljava/util/HashSet;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 19
    .line 20
    .line 21
    sput-object v0, Ln10;->γ:Ljava/util/HashSet;

    .line 22
    .line 23
    new-instance v0, Landroid/os/Handler;

    .line 24
    .line 25
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 30
    .line 31
    .line 32
    sput-object v0, Ln10;->δ:Landroid/os/Handler;

    .line 33
    .line 34
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 35
    .line 36
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 37
    .line 38
    .line 39
    sput-object v0, Ln10;->ε:Ljava/util/concurrent/ConcurrentHashMap;

    .line 40
    .line 41
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 42
    .line 43
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 44
    .line 45
    .line 46
    sput-object v0, Ln10;->ζ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 47
    .line 48
    return-void
.end method

.method public static final α(Ljava/lang/reflect/Method;)I
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
    const-string v1, "X.C2695841Ugo"

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    const/16 v0, 0x3e8

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v0, v1

    .line 22
    :goto_0
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    const-string v3, "X."

    .line 31
    .line 32
    invoke-static {v2, v3, v1}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    add-int/lit8 v0, v0, 0x50

    .line 39
    .line 40
    :cond_1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    array-length v2, v2

    .line 45
    const/16 v4, 0x10

    .line 46
    .line 47
    if-lt v2, v4, :cond_2

    .line 48
    .line 49
    add-int/lit16 v0, v0, 0xc8

    .line 50
    .line 51
    :cond_2
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    array-length v2, p0

    .line 59
    move v4, v1

    .line 60
    :goto_1
    if-ge v4, v2, :cond_4

    .line 61
    .line 62
    aget-object v5, p0, v4

    .line 63
    .line 64
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    invoke-static {v5, v3, v1}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    if-eqz v5, :cond_3

    .line 73
    .line 74
    add-int/lit8 v0, v0, 0x3c

    .line 75
    .line 76
    return v0

    .line 77
    :cond_3
    add-int/lit8 v4, v4, 0x1

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_4
    return v0
.end method

.method public static β(Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 17

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface/range {p0 .. p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_1

    .line 15
    .line 16
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    move-object v3, v2

    .line 21
    check-cast v3, Ljava/lang/reflect/Method;

    .line 22
    .line 23
    invoke-static {v3}, Ln10;->δ(Ljava/lang/reflect/Method;)Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-eqz v3, :cond_0

    .line 28
    .line 29
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    const/4 v3, 0x1

    .line 42
    if-eqz v2, :cond_2

    .line 43
    .line 44
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    check-cast v2, Ljava/lang/reflect/Method;

    .line 49
    .line 50
    invoke-virtual {v2, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_2
    new-instance v1, Ljava/util/HashSet;

    .line 55
    .line 56
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 57
    .line 58
    .line 59
    new-instance v2, Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    :cond_3
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    if-eqz v4, :cond_5

    .line 73
    .line 74
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    move-object v5, v4

    .line 79
    check-cast v5, Ljava/lang/reflect/Method;

    .line 80
    .line 81
    invoke-static {v5}, Llz1;->τ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v7

    .line 89
    invoke-static {v7, v5}, Llz1;->ο(Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v8

    .line 93
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    move-result-object v9

    .line 97
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    new-instance v10, Ljava/util/ArrayList;

    .line 101
    .line 102
    array-length v11, v9

    .line 103
    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 104
    .line 105
    .line 106
    array-length v11, v9

    .line 107
    const/4 v12, 0x0

    .line 108
    :goto_3
    if-ge v12, v11, :cond_4

    .line 109
    .line 110
    aget-object v13, v9, v12

    .line 111
    .line 112
    invoke-static {v13, v10, v12, v3}, Llz1;->δ(Ljava/lang/Class;Ljava/util/ArrayList;II)I

    .line 113
    .line 114
    .line 115
    move-result v12

    .line 116
    goto :goto_3

    .line 117
    :cond_4
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 118
    .line 119
    .line 120
    move-result v5

    .line 121
    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 122
    .line 123
    .line 124
    const/4 v15, 0x0

    .line 125
    const/16 v16, 0x3e

    .line 126
    .line 127
    const-string v11, ","

    .line 128
    .line 129
    const/4 v12, 0x0

    .line 130
    const/4 v13, 0x0

    .line 131
    const/4 v14, 0x0

    .line 132
    invoke-static/range {v10 .. v16}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v5

    .line 136
    const-string v9, "#"

    .line 137
    .line 138
    const-string v10, "("

    .line 139
    .line 140
    invoke-static {v6, v9, v7, v10, v5}, Lnx;->ρ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    move-result-object v5

    .line 144
    const-string v6, "):"

    .line 145
    .line 146
    invoke-static {v5, v6, v8, v1}, Llz1;->Γ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/HashSet;)Z

    .line 147
    .line 148
    .line 149
    move-result v5

    .line 150
    if-eqz v5, :cond_3

    .line 151
    .line 152
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_5
    return-object v2
.end method

.method public static γ(Ljava/lang/ClassLoader;)V
    .locals 17

    .line 1
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lui1;->ψ()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string v0, "r9eb8b428fc66b159"

    .line 11
    .line 12
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    sget-object v0, Ln10;->β:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    const/4 v2, 0x1

    .line 20
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-nez v3, :cond_1

    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    move-object/from16 v3, p0

    .line 28
    .line 29
    invoke-static {v3, v1}, Ln10;->ζ(Ljava/lang/ClassLoader;Z)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-eqz v4, :cond_2

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 40
    .line 41
    .line 42
    const-string v0, "r713391239fc9ec38"

    .line 43
    .line 44
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_2
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    :cond_3
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_6

    .line 57
    .line 58
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    check-cast v0, Ljava/lang/reflect/Method;

    .line 63
    .line 64
    const-string v5, "rc05ab773455a98cf"

    .line 65
    .line 66
    invoke-static {v0}, Llz1;->τ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v7

    .line 74
    invoke-static {v7, v0}, Llz1;->ο(Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v8

    .line 78
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    move-result-object v9

    .line 82
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    new-instance v10, Ljava/util/ArrayList;

    .line 86
    .line 87
    array-length v11, v9

    .line 88
    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 89
    .line 90
    .line 91
    array-length v11, v9

    .line 92
    move v12, v1

    .line 93
    :goto_1
    if-ge v12, v11, :cond_4

    .line 94
    .line 95
    aget-object v13, v9, v12

    .line 96
    .line 97
    invoke-static {v13, v10, v12, v2}, Llz1;->δ(Ljava/lang/Class;Ljava/util/ArrayList;II)I

    .line 98
    .line 99
    .line 100
    move-result v12

    .line 101
    goto :goto_1

    .line 102
    :cond_4
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 103
    .line 104
    .line 105
    move-result v9

    .line 106
    invoke-static {v9}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 107
    .line 108
    .line 109
    const-string v11, ","

    .line 110
    .line 111
    const/4 v15, 0x0

    .line 112
    const/16 v16, 0x3e

    .line 113
    .line 114
    const/4 v12, 0x0

    .line 115
    const/4 v13, 0x0

    .line 116
    const/4 v14, 0x0

    .line 117
    invoke-static/range {v10 .. v16}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v9

    .line 121
    const-string v10, "#"

    .line 122
    .line 123
    const-string v11, "("

    .line 124
    .line 125
    invoke-static {v6, v10, v7, v11, v9}, Lnx;->ρ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    move-result-object v6

    .line 129
    const-string v7, "):"

    .line 130
    .line 131
    invoke-static {v6, v7, v8}, Llz1;->π(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v6

    .line 135
    sget-object v7, Ln10;->γ:Ljava/util/HashSet;

    .line 136
    .line 137
    monitor-enter v7

    .line 138
    :try_start_0
    invoke-virtual {v7, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 142
    if-nez v8, :cond_5

    .line 143
    .line 144
    monitor-exit v7

    .line 145
    goto :goto_0

    .line 146
    :cond_5
    monitor-exit v7

    .line 147
    :try_start_1
    invoke-virtual {v0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 148
    .line 149
    .line 150
    sget-object v7, Lxq0;->α:Lxq0;

    .line 151
    .line 152
    new-instance v8, Lf10;

    .line 153
    .line 154
    const/4 v9, 0x1

    .line 155
    invoke-direct {v8, v9}, Lf10;-><init>(I)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v7, v0, v8}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v5, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    sget-object v0, Ls62;->α:Ls62;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 169
    .line 170
    goto :goto_2

    .line 171
    :catchall_0
    move-exception v0

    .line 172
    new-instance v5, Leo1;

    .line 173
    .line 174
    invoke-direct {v5, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 175
    .line 176
    .line 177
    move-object v0, v5

    .line 178
    :goto_2
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    if-eqz v0, :cond_3

    .line 183
    .line 184
    sget-object v5, Ln10;->γ:Ljava/util/HashSet;

    .line 185
    .line 186
    monitor-enter v5

    .line 187
    :try_start_2
    invoke-virtual {v5, v6}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 188
    .line 189
    .line 190
    monitor-exit v5

    .line 191
    const-string v5, "raf1bb8974ad1e90"

    .line 192
    .line 193
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v7

    .line 197
    const-string v8, "hook failed "

    .line 198
    .line 199
    const-string v9, ": "

    .line 200
    .line 201
    invoke-static {v8, v6, v9, v7}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v6

    .line 205
    invoke-static {v5, v6, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 206
    .line 207
    .line 208
    goto/16 :goto_0

    .line 209
    .line 210
    :catchall_1
    move-exception v0

    .line 211
    monitor-exit v5

    .line 212
    throw v0

    .line 213
    :catchall_2
    move-exception v0

    .line 214
    monitor-exit v7

    .line 215
    throw v0

    .line 216
    :cond_6
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 217
    .line 218
    .line 219
    move-result v0

    .line 220
    new-instance v1, Ljava/lang/StringBuilder;

    .line 221
    .line 222
    const-string v2, "r441813f05f4095a4"

    .line 223
    .line 224
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    return-void
.end method

.method public static δ(Ljava/lang/reflect/Method;)Z
    .locals 5

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
    goto/16 :goto_0

    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

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
    const-string v2, "~7958639020ABF95155FECBEFEE807165BD4E6AA9062C97DCAC516C0DF08B46AFD681258733F65F56ED85D13872AD5795D57F46"

    .line 23
    .line 24
    invoke-static {v2}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    array-length v0, p0

    .line 40
    const/16 v2, 0x8

    .line 41
    .line 42
    if-ge v0, v2, :cond_2

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    aget-object v0, p0, v1

    .line 46
    .line 47
    const-class v2, Ljava/lang/String;

    .line 48
    .line 49
    invoke-static {v0, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_6

    .line 54
    .line 55
    const/4 v0, 0x1

    .line 56
    aget-object v3, p0, v0

    .line 57
    .line 58
    invoke-static {v3, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    if-nez v3, :cond_3

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_3
    const/4 v3, 0x2

    .line 66
    aget-object v3, p0, v3

    .line 67
    .line 68
    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 69
    .line 70
    invoke-static {v3, v4}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    if-eqz v3, :cond_6

    .line 75
    .line 76
    const/4 v3, 0x3

    .line 77
    aget-object v3, p0, v3

    .line 78
    .line 79
    invoke-static {v3, v4}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    if-eqz v3, :cond_6

    .line 84
    .line 85
    const/4 v3, 0x4

    .line 86
    aget-object v3, p0, v3

    .line 87
    .line 88
    invoke-static {v3, v4}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    if-nez v3, :cond_4

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_4
    const/4 v3, 0x5

    .line 96
    aget-object v3, p0, v3

    .line 97
    .line 98
    invoke-static {v3, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    if-eqz v3, :cond_6

    .line 103
    .line 104
    const/4 v3, 0x6

    .line 105
    aget-object v3, p0, v3

    .line 106
    .line 107
    invoke-static {v3, v4}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    if-eqz v3, :cond_6

    .line 112
    .line 113
    const/4 v3, 0x7

    .line 114
    aget-object p0, p0, v3

    .line 115
    .line 116
    invoke-static {p0, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result p0

    .line 120
    if-nez p0, :cond_5

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_5
    return v0

    .line 124
    :cond_6
    :goto_0
    return v1
.end method

.method public static ε(Ljava/lang/ClassLoader;)Ljava/util/List;
    .locals 5

    .line 1
    const-string v0, "X.C2695841Ugo"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    invoke-static {v0, v1, p0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    goto :goto_0

    .line 9
    :catchall_0
    move-exception v2

    .line 10
    new-instance v3, Leo1;

    .line 11
    .line 12
    invoke-direct {v3, v2}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 13
    .line 14
    .line 15
    move-object v2, v3

    .line 16
    :goto_0
    instance-of v3, v2, Leo1;

    .line 17
    .line 18
    const/4 v4, 0x0

    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    move-object v2, v4

    .line 22
    :cond_0
    check-cast v2, Ljava/lang/Class;

    .line 23
    .line 24
    if-nez v2, :cond_2

    .line 25
    .line 26
    :try_start_1
    invoke-virtual {p0, v0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 30
    goto :goto_1

    .line 31
    :catchall_1
    move-exception p0

    .line 32
    new-instance v0, Leo1;

    .line 33
    .line 34
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    move-object p0, v0

    .line 38
    :goto_1
    instance-of v0, p0, Leo1;

    .line 39
    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_1
    move-object v4, p0

    .line 44
    :goto_2
    move-object v2, v4

    .line 45
    check-cast v2, Ljava/lang/Class;

    .line 46
    .line 47
    :cond_2
    if-nez v2, :cond_3

    .line 48
    .line 49
    sget-object p0, Ljz;->ε:Ljz;

    .line 50
    .line 51
    return-object p0

    .line 52
    :cond_3
    invoke-virtual {v2}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    new-instance v0, Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 62
    .line 63
    .line 64
    array-length v2, p0

    .line 65
    :goto_3
    if-ge v1, v2, :cond_5

    .line 66
    .line 67
    aget-object v3, p0, v1

    .line 68
    .line 69
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    invoke-static {v3}, Ln10;->δ(Ljava/lang/reflect/Method;)Z

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    if-eqz v4, :cond_4

    .line 77
    .line 78
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    :cond_4
    add-int/lit8 v1, v1, 0x1

    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_5
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    if-eqz v1, :cond_6

    .line 93
    .line 94
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    check-cast v1, Ljava/lang/reflect/Method;

    .line 99
    .line 100
    const/4 v2, 0x1

    .line 101
    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 102
    .line 103
    .line 104
    goto :goto_4

    .line 105
    :cond_6
    return-object v0
.end method

.method public static ζ(Ljava/lang/ClassLoader;Z)Ljava/util/List;
    .locals 5

    .line 1
    sget-object v0, Lox;->α:Ljava/lang/Object;

    .line 2
    .line 3
    sget-object v0, Lkx;->Ｓ:Lkx;

    .line 4
    .line 5
    invoke-static {v0, p0}, Lox;->σ(Lkx;Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_3

    .line 10
    .line 11
    new-instance v2, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_1

    .line 25
    .line 26
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    move-object v4, v3

    .line 31
    check-cast v4, Ljava/lang/reflect/Method;

    .line 32
    .line 33
    invoke-static {v4}, Ln10;->δ(Ljava/lang/reflect/Method;)Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-eqz v4, :cond_0

    .line 38
    .line 39
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-nez v1, :cond_2

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    const/4 v2, 0x0

    .line 51
    :goto_1
    if-eqz v2, :cond_3

    .line 52
    .line 53
    invoke-static {v2}, Ln10;->β(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0

    .line 58
    :cond_3
    invoke-static {p0}, Ln10;->ε(Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-nez v2, :cond_5

    .line 67
    .line 68
    if-eqz p1, :cond_4

    .line 69
    .line 70
    sget-object p0, Lox;->α:Ljava/lang/Object;

    .line 71
    .line 72
    invoke-static {v0, v1}, Lox;->χ(Lkx;Ljava/util/List;)V

    .line 73
    .line 74
    .line 75
    :cond_4
    return-object v1

    .line 76
    :cond_5
    if-eqz p1, :cond_9

    .line 77
    .line 78
    sget-object p1, Lox;->α:Ljava/lang/Object;

    .line 79
    .line 80
    sget-object p1, Lox;->ι:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 81
    .line 82
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    if-nez p1, :cond_6

    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_6
    new-instance p1, Lbb;

    .line 90
    .line 91
    const/16 v1, 0x18

    .line 92
    .line 93
    invoke-direct {p1, p0, v1}, Lbb;-><init>(Ljava/lang/ClassLoader;I)V

    .line 94
    .line 95
    .line 96
    const-string v1, "\u5b9a\u4f4d Feed \u5173\u6ce8\u63d0\u4ea4\u5165\u53e3"

    .line 97
    .line 98
    invoke-static {v0, p0, v1, p1}, Lox;->λ(Lkx;Ljava/lang/ClassLoader;Ljava/lang/String;La80;)Ljava/util/List;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    new-instance p1, Ljava/util/ArrayList;

    .line 103
    .line 104
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 105
    .line 106
    .line 107
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    :cond_7
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    if-eqz v0, :cond_8

    .line 116
    .line 117
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    move-object v1, v0

    .line 122
    check-cast v1, Ljava/lang/reflect/Method;

    .line 123
    .line 124
    invoke-static {v1}, Ln10;->δ(Ljava/lang/reflect/Method;)Z

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    if-eqz v1, :cond_7

    .line 129
    .line 130
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_8
    return-object p1

    .line 135
    :cond_9
    :goto_3
    sget-object p0, Ljz;->ε:Ljz;

    .line 136
    .line 137
    return-object p0
.end method
