.class public final Lox;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Ljava/lang/Object;

.field public static final β:Ljava/lang/Object;

.field public static final γ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static volatile δ:Ljx;

.field public static volatile ε:Lpx;

.field public static volatile ζ:Ljava/lang/String;

.field public static volatile η:Ljava/lang/ClassLoader;

.field public static volatile θ:Lorg/luckypray/dexkit/DexKitBridge;

.field public static final ι:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final κ:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final λ:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final μ:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final ν:Ljava/lang/Object;

.field public static final ξ:Ljava/util/concurrent/ExecutorService;

.field public static final ο:Ljava/lang/ThreadLocal;

.field public static final π:Ljava/util/HashMap;

.field public static final ρ:Ljava/util/Set;

.field public static final σ:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 40

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lox;->α:Ljava/lang/Object;

    .line 7
    .line 8
    new-instance v0, Ljava/lang/Object;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lox;->β:Ljava/lang/Object;

    .line 14
    .line 15
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 19
    .line 20
    .line 21
    sput-object v0, Lox;->γ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 22
    .line 23
    const-string v0, ""

    .line 24
    .line 25
    sput-object v0, Lox;->ζ:Ljava/lang/String;

    .line 26
    .line 27
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 28
    .line 29
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 30
    .line 31
    .line 32
    sput-object v0, Lox;->ι:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 33
    .line 34
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 35
    .line 36
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lox;->κ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 40
    .line 41
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 42
    .line 43
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 44
    .line 45
    .line 46
    sput-object v0, Lox;->λ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 47
    .line 48
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 49
    .line 50
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 51
    .line 52
    .line 53
    sput-object v0, Lox;->μ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 54
    .line 55
    new-instance v0, Ljava/lang/Object;

    .line 56
    .line 57
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 58
    .line 59
    .line 60
    sput-object v0, Lox;->ν:Ljava/lang/Object;

    .line 61
    .line 62
    new-instance v0, Laj;

    .line 63
    .line 64
    const/4 v1, 0x5

    .line 65
    invoke-direct {v0, v1}, Laj;-><init>(I)V

    .line 66
    .line 67
    .line 68
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    sput-object v0, Lox;->ξ:Ljava/util/concurrent/ExecutorService;

    .line 73
    .line 74
    new-instance v0, Ljava/lang/ThreadLocal;

    .line 75
    .line 76
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 77
    .line 78
    .line 79
    sput-object v0, Lox;->ο:Ljava/lang/ThreadLocal;

    .line 80
    .line 81
    new-instance v0, Ljava/util/HashMap;

    .line 82
    .line 83
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 84
    .line 85
    .line 86
    sput-object v0, Lox;->π:Ljava/util/HashMap;

    .line 87
    .line 88
    sget-object v1, Lkx;->Ц:Lkx;

    .line 89
    .line 90
    sget-object v2, Lkx;->ι:Lkx;

    .line 91
    .line 92
    sget-object v3, Lkx;->ц:Lkx;

    .line 93
    .line 94
    sget-object v4, Lkx;->ч:Lkx;

    .line 95
    .line 96
    sget-object v5, Lkx;->ш:Lkx;

    .line 97
    .line 98
    sget-object v6, Lkx;->ｉ:Lkx;

    .line 99
    .line 100
    sget-object v7, Lkx;->ｊ:Lkx;

    .line 101
    .line 102
    sget-object v8, Lkx;->ｋ:Lkx;

    .line 103
    .line 104
    sget-object v9, Lkx;->ｌ:Lkx;

    .line 105
    .line 106
    sget-object v10, Lkx;->ｍ:Lkx;

    .line 107
    .line 108
    sget-object v11, Lkx;->ｎ:Lkx;

    .line 109
    .line 110
    sget-object v12, Lkx;->ｐ:Lkx;

    .line 111
    .line 112
    sget-object v13, Lkx;->ｑ:Lkx;

    .line 113
    .line 114
    sget-object v14, Lkx;->ｒ:Lkx;

    .line 115
    .line 116
    sget-object v15, Lkx;->ｅ:Lkx;

    .line 117
    .line 118
    sget-object v16, Lkx;->ｙ:Lkx;

    .line 119
    .line 120
    sget-object v17, Lkx;->ｚ:Lkx;

    .line 121
    .line 122
    sget-object v18, Lkx;->Ａ:Lkx;

    .line 123
    .line 124
    sget-object v19, Lkx;->Ｂ:Lkx;

    .line 125
    .line 126
    sget-object v20, Lkx;->Ｃ:Lkx;

    .line 127
    .line 128
    sget-object v21, Lkx;->Ｄ:Lkx;

    .line 129
    .line 130
    sget-object v22, Lkx;->Ｅ:Lkx;

    .line 131
    .line 132
    sget-object v23, Lkx;->Ｆ:Lkx;

    .line 133
    .line 134
    sget-object v24, Lkx;->Ｇ:Lkx;

    .line 135
    .line 136
    sget-object v25, Lkx;->Ｈ:Lkx;

    .line 137
    .line 138
    sget-object v26, Lkx;->Ｉ:Lkx;

    .line 139
    .line 140
    sget-object v27, Lkx;->Ｊ:Lkx;

    .line 141
    .line 142
    sget-object v28, Lkx;->Ｋ:Lkx;

    .line 143
    .line 144
    sget-object v29, Lkx;->Ｌ:Lkx;

    .line 145
    .line 146
    sget-object v30, Lkx;->Ｓ:Lkx;

    .line 147
    .line 148
    sget-object v31, Lkx;->т:Lkx;

    .line 149
    .line 150
    sget-object v32, Lkx;->у:Lkx;

    .line 151
    .line 152
    sget-object v33, Lkx;->п:Lkx;

    .line 153
    .line 154
    sget-object v34, Lkx;->ｔ:Lkx;

    .line 155
    .line 156
    sget-object v35, Lkx;->р:Lkx;

    .line 157
    .line 158
    sget-object v36, Lkx;->и:Lkx;

    .line 159
    .line 160
    sget-object v37, Lkx;->к:Lkx;

    .line 161
    .line 162
    sget-object v38, Lkx;->Ｖ:Lkx;

    .line 163
    .line 164
    sget-object v39, Lkx;->Ｗ:Lkx;

    .line 165
    .line 166
    filled-new-array/range {v1 .. v39}, [Lkx;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    invoke-static {v0}, Lg7;->о([Ljava/lang/Object;)Ljava/util/Set;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    sput-object v0, Lox;->ρ:Ljava/util/Set;

    .line 175
    .line 176
    sget-object v1, Lkx;->ｆ:Lkx;

    .line 177
    .line 178
    sget-object v2, Lkx;->ｇ:Lkx;

    .line 179
    .line 180
    sget-object v3, Lkx;->ｈ:Lkx;

    .line 181
    .line 182
    sget-object v4, Lkx;->Ж:Lkx;

    .line 183
    .line 184
    sget-object v5, Lkx;->Ｕ:Lkx;

    .line 185
    .line 186
    sget-object v6, Lkx;->Ｘ:Lkx;

    .line 187
    .line 188
    sget-object v7, Lkx;->Ｙ:Lkx;

    .line 189
    .line 190
    sget-object v8, Lkx;->з:Lkx;

    .line 191
    .line 192
    filled-new-array/range {v1 .. v8}, [Lkx;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    invoke-static {v0}, Lg7;->о([Ljava/lang/Object;)Ljava/util/Set;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    sput-object v0, Lox;->σ:Ljava/util/Set;

    .line 201
    .line 202
    return-void
.end method

.method public static α(Lkx;Ljava/lang/ClassLoader;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Lkx;->ε:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {p1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    new-instance v0, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v1, "classes:"

    .line 16
    .line 17
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string p0, "@"

    .line 24
    .line 25
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0
.end method

.method public static β()V
    .locals 1

    .line 1
    sget-object v0, Lox;->κ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lox;->λ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lox;->μ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 14
    .line 15
    .line 16
    sget-object v0, Lbx;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 19
    .line 20
    .line 21
    sget-object v0, Lbx;->β:Ljava/util/Set;

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public static γ(Ljava/lang/String;)V
    .locals 6

    .line 1
    const-string v0, "bridge closed, reason="

    .line 2
    .line 3
    const-string v1, "close bridge failed: "

    .line 4
    .line 5
    sget-object v2, Lox;->β:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v2

    .line 8
    const/4 v3, 0x0

    .line 9
    :try_start_0
    sget-object v4, Lox;->θ:Lorg/luckypray/dexkit/DexKitBridge;

    .line 10
    .line 11
    if-eqz v4, :cond_0

    .line 12
    .line 13
    invoke-virtual {v4}, Lorg/luckypray/dexkit/DexKitBridge;->close()V

    .line 14
    .line 15
    .line 16
    sget-object v4, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :catchall_0
    move-exception v4

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move-object v4, v3

    .line 22
    goto :goto_1

    .line 23
    :goto_0
    :try_start_1
    new-instance v5, Leo1;

    .line 24
    .line 25
    invoke-direct {v5, v4}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    move-object v4, v5

    .line 29
    :goto_1
    invoke-static {v4}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    if-eqz v4, :cond_1

    .line 34
    .line 35
    new-instance v5, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-direct {v5, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-static {v1}, Lox;->ξ(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    goto :goto_2

    .line 51
    :catchall_1
    move-exception p0

    .line 52
    goto :goto_3

    .line 53
    :cond_1
    :goto_2
    sput-object v3, Lox;->θ:Lorg/luckypray/dexkit/DexKitBridge;

    .line 54
    .line 55
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-static {p0}, Lox;->ξ(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 60
    .line 61
    .line 62
    monitor-exit v2

    .line 63
    return-void

    .line 64
    :goto_3
    monitor-exit v2

    .line 65
    throw p0
.end method

.method public static δ()Z
    .locals 3

    .line 1
    sget-object v0, Lox;->γ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    return v2

    .line 11
    :cond_0
    :try_start_0
    const-string v1, "dexkit"

    .line 12
    .line 13
    invoke-static {v1}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 17
    .line 18
    .line 19
    const-string v0, "System.loadLibrary(\"dexkit\") ok"

    .line 20
    .line 21
    invoke-static {v0}, Lox;->ξ(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception v0

    .line 28
    new-instance v1, Leo1;

    .line 29
    .line 30
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    move-object v0, v1

    .line 34
    :goto_0
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    if-nez v1, :cond_1

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    const-string v2, "System.loadLibrary(\"dexkit\") failed: "

    .line 44
    .line 45
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-static {v0}, Lox;->ξ(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 59
    .line 60
    :goto_1
    check-cast v0, Ljava/lang/Boolean;

    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    return v0
.end method

.method public static ε(Ljava/lang/String;Ljava/lang/String;La80;)Ljava/lang/Object;
    .locals 5

    .line 1
    const-string v0, "DexKit queue task execute failed, taskId="

    .line 2
    .line 3
    const-string v1, "DexKit queue task skipped, bridge is null, taskId="

    .line 4
    .line 5
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 6
    .line 7
    sget-object v3, Lox;->ο:Ljava/lang/ThreadLocal;

    .line 8
    .line 9
    invoke-virtual {v3, v2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    sget-object v2, Los;->α:Landroid/os/Handler;

    .line 13
    .line 14
    invoke-static {p0, p1}, Los;->Β(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    const/4 v2, 0x0

    .line 19
    :try_start_0
    invoke-static {}, Lox;->η()Lorg/luckypray/dexkit/DexKitBridge;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    if-nez v4, :cond_0

    .line 24
    .line 25
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    invoke-static {p2}, Lox;->ξ(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    move-exception p2

    .line 34
    goto :goto_1

    .line 35
    :cond_0
    invoke-interface {p2, v4}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    const/4 v2, 0x1

    .line 40
    :goto_0
    invoke-static {p0, v2}, Los;->Α(Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3}, Ljava/lang/ThreadLocal;->remove()V

    .line 44
    .line 45
    .line 46
    return-object p1

    .line 47
    :goto_1
    :try_start_1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v0, ", err="

    .line 56
    .line 57
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    invoke-static {p2}, Lox;->ξ(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 68
    .line 69
    .line 70
    sget-object p2, Los;->α:Landroid/os/Handler;

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :catchall_1
    move-exception p1

    .line 74
    sget-object p2, Los;->α:Landroid/os/Handler;

    .line 75
    .line 76
    invoke-static {p0, v2}, Los;->Α(Ljava/lang/String;Z)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v3}, Ljava/lang/ThreadLocal;->remove()V

    .line 80
    .line 81
    .line 82
    throw p1
.end method

.method public static ζ(Lkx;Ljava/lang/ClassLoader;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lkx;->ε:Ljava/lang/String;

    .line 5
    .line 6
    invoke-static {p1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v1, "field:"

    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string p0, "@"

    .line 21
    .line 22
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method

.method public static η()Lorg/luckypray/dexkit/DexKitBridge;
    .locals 5

    .line 1
    const-string v0, "DexKitBridge.create failed: "

    .line 2
    .line 3
    sget-object v1, Lox;->β:Ljava/lang/Object;

    .line 4
    .line 5
    monitor-enter v1

    .line 6
    :try_start_0
    sget-object v2, Lox;->θ:Lorg/luckypray/dexkit/DexKitBridge;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    monitor-exit v1

    .line 11
    return-object v2

    .line 12
    :cond_0
    :try_start_1
    invoke-static {}, Lox;->δ()Z

    .line 13
    .line 14
    .line 15
    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 16
    const/4 v3, 0x0

    .line 17
    if-nez v2, :cond_1

    .line 18
    .line 19
    monitor-exit v1

    .line 20
    return-object v3

    .line 21
    :cond_1
    :try_start_2
    sget-object v2, Lox;->ζ:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {v2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-eqz v4, :cond_2

    .line 28
    .line 29
    const-string v0, "host apk path is blank"

    .line 30
    .line 31
    invoke-static {v0}, Lox;->ξ(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 32
    .line 33
    .line 34
    monitor-exit v1

    .line 35
    return-object v3

    .line 36
    :catchall_0
    move-exception v0

    .line 37
    goto :goto_1

    .line 38
    :cond_2
    :try_start_3
    sget-object v4, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    .line 39
    .line 40
    invoke-virtual {v4, v2}, Lorg/luckypray/dexkit/DexKitBridge$Companion;->create(Ljava/lang/String;)Lorg/luckypray/dexkit/DexKitBridge;

    .line 41
    .line 42
    .line 43
    move-result-object v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 44
    goto :goto_0

    .line 45
    :catchall_1
    move-exception v2

    .line 46
    :try_start_4
    new-instance v4, Leo1;

    .line 47
    .line 48
    invoke-direct {v4, v2}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 49
    .line 50
    .line 51
    move-object v2, v4

    .line 52
    :goto_0
    invoke-static {v2}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    if-nez v4, :cond_3

    .line 57
    .line 58
    check-cast v2, Lorg/luckypray/dexkit/DexKitBridge;

    .line 59
    .line 60
    sput-object v2, Lox;->θ:Lorg/luckypray/dexkit/DexKitBridge;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 61
    .line 62
    monitor-exit v1

    .line 63
    return-object v2

    .line 64
    :cond_3
    :try_start_5
    new-instance v2, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-static {v0}, Lox;->ξ(Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 77
    .line 78
    .line 79
    monitor-exit v1

    .line 80
    return-object v3

    .line 81
    :goto_1
    monitor-exit v1

    .line 82
    throw v0
.end method

.method public static θ(Ljava/lang/ClassLoader;Lwa;)Ljava/lang/String;
    .locals 4

    .line 1
    sget-object v0, Lkx;->Α:Lkx;

    .line 2
    .line 3
    sget-object v1, Lox;->δ:Ljx;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    const-string p0, "getOrFindClass failed, cache is null, key=comment_control_legacy_holder_class_v2"

    .line 9
    .line 10
    invoke-static {p0}, Lox;->ξ(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-object v2

    .line 14
    :cond_0
    sget-object v3, Lox;->δ:Ljx;

    .line 15
    .line 16
    if-eqz v3, :cond_2

    .line 17
    .line 18
    invoke-virtual {v3, v0}, Ljx;->γ(Lkx;)Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    if-nez v3, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    invoke-static {v3}, Lxh;->К(Ljava/util/List;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    check-cast v3, Lcx;

    .line 30
    .line 31
    if-eqz v3, :cond_2

    .line 32
    .line 33
    iget-object v2, v3, Lcx;->α:Ljava/lang/String;

    .line 34
    .line 35
    :cond_2
    :goto_0
    if-eqz v2, :cond_4

    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-nez v3, :cond_3

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_3
    const-string p0, "cache hit class name, key=comment_control_legacy_holder_class_v2, className="

    .line 45
    .line 46
    invoke-virtual {p0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-static {p0}, Lox;->ξ(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-object v2

    .line 54
    :cond_4
    :goto_1
    if-nez p0, :cond_5

    .line 55
    .line 56
    sget-object p0, Lox;->η:Ljava/lang/ClassLoader;

    .line 57
    .line 58
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    :cond_5
    invoke-static {v0, p0}, Lox;->α(Lkx;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    new-instance v0, Lwa;

    .line 66
    .line 67
    invoke-direct {v0, p1, v1}, Lwa;-><init>(Lwa;Ljx;)V

    .line 68
    .line 69
    .line 70
    const-string p1, "\u5b9a\u4f4d\u8bc4\u8bba\u65e7\u5f0f ViewHolder"

    .line 71
    .line 72
    invoke-static {p0, p1, v0}, Lox;->τ(Ljava/lang/String;Ljava/lang/String;La80;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    check-cast p0, Ljava/lang/String;

    .line 77
    .line 78
    return-object p0
.end method

.method public static ι(Lkx;Ljava/lang/ClassLoader;Ljava/lang/String;La80;)Ljava/util/List;
    .locals 10

    .line 1
    sget-object v0, Ljz;->ε:Ljz;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    iget-object p0, p0, Lkx;->ε:Ljava/lang/String;

    .line 12
    .line 13
    const-string p1, "getOrFindClasses failed, classLoader is null, key="

    .line 14
    .line 15
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-static {p0}, Lox;->ξ(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-object v0

    .line 23
    :cond_0
    sget-object v3, Lox;->δ:Ljx;

    .line 24
    .line 25
    iget-object v1, p0, Lkx;->ε:Ljava/lang/String;

    .line 26
    .line 27
    if-nez v3, :cond_1

    .line 28
    .line 29
    const-string p0, "getOrFindClasses failed, cache is null, key="

    .line 30
    .line 31
    invoke-virtual {p0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-static {p0}, Lox;->ξ(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-object v0

    .line 39
    :cond_1
    invoke-static {p1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    const-string v4, "@"

    .line 44
    .line 45
    invoke-static {v1, v4, v2}, Lnx;->ι(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    sget-object v1, Lox;->λ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 50
    .line 51
    invoke-virtual {v1, v5}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    check-cast v2, Ljava/util/List;

    .line 56
    .line 57
    const-string v4, ", re-query"

    .line 58
    .line 59
    if-eqz v2, :cond_3

    .line 60
    .line 61
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 62
    .line 63
    .line 64
    move-result v6

    .line 65
    if-eqz v6, :cond_2

    .line 66
    .line 67
    sget-object v6, Lox;->σ:Ljava/util/Set;

    .line 68
    .line 69
    invoke-interface {v6, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    if-eqz v6, :cond_2

    .line 74
    .line 75
    invoke-virtual {v1, v5}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    iget-object v1, p0, Lkx;->ε:Ljava/lang/String;

    .line 79
    .line 80
    new-instance v2, Ljava/lang/StringBuilder;

    .line 81
    .line 82
    const-string v6, "empty memory class cache ignored, key="

    .line 83
    .line 84
    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-static {v1}, Lox;->ξ(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_2
    return-object v2

    .line 102
    :cond_3
    :goto_0
    invoke-virtual {v3, p0}, Ljx;->γ(Lkx;)Ljava/util/List;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    if-eqz v1, :cond_d

    .line 107
    .line 108
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    if-eqz v2, :cond_4

    .line 113
    .line 114
    sget-object v2, Lox;->σ:Ljava/util/Set;

    .line 115
    .line 116
    invoke-interface {v2, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v2

    .line 120
    if-eqz v2, :cond_4

    .line 121
    .line 122
    iget-object v1, p0, Lkx;->ε:Ljava/lang/String;

    .line 123
    .line 124
    new-instance v2, Ljava/lang/StringBuilder;

    .line 125
    .line 126
    const-string v6, "empty class cache ignored, key="

    .line 127
    .line 128
    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    invoke-static {v1}, Lox;->ξ(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    goto/16 :goto_5

    .line 145
    .line 146
    :cond_4
    new-instance v2, Ljava/util/ArrayList;

    .line 147
    .line 148
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 149
    .line 150
    .line 151
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 152
    .line 153
    .line 154
    move-result-object v6

    .line 155
    :cond_5
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 156
    .line 157
    .line 158
    move-result v7

    .line 159
    if-eqz v7, :cond_6

    .line 160
    .line 161
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v7

    .line 165
    check-cast v7, Lcx;

    .line 166
    .line 167
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    sget-object v8, Lbx;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 171
    .line 172
    iget-object v7, v7, Lcx;->α:Ljava/lang/String;

    .line 173
    .line 174
    invoke-static {p1, v7}, Lbx;->α(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    move-result-object v7

    .line 178
    if-eqz v7, :cond_5

    .line 179
    .line 180
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    goto :goto_1

    .line 184
    :cond_6
    new-instance v6, Ljava/util/HashSet;

    .line 185
    .line 186
    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    .line 187
    .line 188
    .line 189
    new-instance v7, Ljava/util/ArrayList;

    .line 190
    .line 191
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    :cond_7
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 199
    .line 200
    .line 201
    move-result v8

    .line 202
    if-eqz v8, :cond_8

    .line 203
    .line 204
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v8

    .line 208
    move-object v9, v8

    .line 209
    check-cast v9, Ljava/lang/Class;

    .line 210
    .line 211
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v9

    .line 215
    invoke-virtual {v6, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    move-result v9

    .line 219
    if-eqz v9, :cond_7

    .line 220
    .line 221
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    goto :goto_2

    .line 225
    :cond_8
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 226
    .line 227
    .line 228
    move-result v2

    .line 229
    if-nez v2, :cond_a

    .line 230
    .line 231
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 232
    .line 233
    .line 234
    move-result v2

    .line 235
    if-nez v2, :cond_9

    .line 236
    .line 237
    goto :goto_3

    .line 238
    :cond_9
    iget-object v1, p0, Lkx;->ε:Ljava/lang/String;

    .line 239
    .line 240
    new-instance v2, Ljava/lang/StringBuilder;

    .line 241
    .line 242
    const-string v6, "cache classes all invalid, key="

    .line 243
    .line 244
    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    invoke-static {v1}, Lox;->ξ(Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    goto :goto_5

    .line 261
    :cond_a
    :goto_3
    sget-object p1, Lox;->λ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 262
    .line 263
    invoke-virtual {p1, v5, v7}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 267
    .line 268
    .line 269
    move-result p1

    .line 270
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 271
    .line 272
    .line 273
    move-result p2

    .line 274
    if-eq p1, p2, :cond_c

    .line 275
    .line 276
    new-instance p1, Ljava/util/ArrayList;

    .line 277
    .line 278
    const/16 p2, 0xa

    .line 279
    .line 280
    invoke-static {v7, p2}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 281
    .line 282
    .line 283
    move-result p2

    .line 284
    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 288
    .line 289
    .line 290
    move-result-object p2

    .line 291
    :goto_4
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 292
    .line 293
    .line 294
    move-result p3

    .line 295
    if-eqz p3, :cond_b

    .line 296
    .line 297
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object p3

    .line 301
    check-cast p3, Ljava/lang/Class;

    .line 302
    .line 303
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 304
    .line 305
    .line 306
    new-instance v0, Lcx;

    .line 307
    .line 308
    invoke-virtual {p3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object p3

    .line 312
    invoke-direct {v0, p3}, Lcx;-><init>(Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 316
    .line 317
    .line 318
    goto :goto_4

    .line 319
    :cond_b
    invoke-virtual {v3, p0, p1}, Ljx;->θ(Lkx;Ljava/util/List;)V

    .line 320
    .line 321
    .line 322
    :cond_c
    iget-object p0, p0, Lkx;->ε:Ljava/lang/String;

    .line 323
    .line 324
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 325
    .line 326
    .line 327
    move-result p1

    .line 328
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 329
    .line 330
    .line 331
    move-result p2

    .line 332
    const-string p3, ", cached="

    .line 333
    .line 334
    const-string v0, ", resolved="

    .line 335
    .line 336
    const-string v1, "cache hit classes, key="

    .line 337
    .line 338
    invoke-static {p1, v1, p0, p3, v0}, Lnx;->ξ(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 339
    .line 340
    .line 341
    move-result-object p0

    .line 342
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 343
    .line 344
    .line 345
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object p0

    .line 349
    invoke-static {p0}, Lox;->ξ(Ljava/lang/String;)V

    .line 350
    .line 351
    .line 352
    return-object v7

    .line 353
    :cond_d
    :goto_5
    invoke-static {p0, p1}, Lox;->α(Lkx;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 354
    .line 355
    .line 356
    move-result-object p1

    .line 357
    new-instance v1, Llx;

    .line 358
    .line 359
    const/4 v6, 0x0

    .line 360
    move-object v4, p0

    .line 361
    move-object v2, p3

    .line 362
    invoke-direct/range {v1 .. v6}, Llx;-><init>(La80;Ljx;Lkx;Ljava/lang/String;I)V

    .line 363
    .line 364
    .line 365
    invoke-static {p1, p2, v1}, Lox;->τ(Ljava/lang/String;Ljava/lang/String;La80;)Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object p0

    .line 369
    check-cast p0, Ljava/util/List;

    .line 370
    .line 371
    if-nez p0, :cond_e

    .line 372
    .line 373
    return-object v0

    .line 374
    :cond_e
    return-object p0
.end method

.method public static κ(Lkx;Ljava/lang/ClassLoader;Ljava/lang/String;La80;)Ljava/lang/reflect/Field;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    iget-object p0, p0, Lkx;->ε:Ljava/lang/String;

    .line 5
    .line 6
    const-string p1, "getOrFindField failed, classLoader is null, key="

    .line 7
    .line 8
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-static {p0}, Lox;->ξ(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    sget-object v3, Lox;->δ:Ljx;

    .line 17
    .line 18
    iget-object v1, p0, Lkx;->ε:Ljava/lang/String;

    .line 19
    .line 20
    if-nez v3, :cond_1

    .line 21
    .line 22
    const-string p0, "getOrFindField failed, cache is null, key="

    .line 23
    .line 24
    invoke-virtual {p0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-static {p0}, Lox;->ξ(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-object v0

    .line 32
    :cond_1
    invoke-static {p1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    const-string v2, "@"

    .line 37
    .line 38
    invoke-static {v1, v2, v0}, Lnx;->ι(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    sget-object v0, Lox;->μ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 43
    .line 44
    invoke-virtual {v0, v5}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    check-cast v1, Ljava/lang/reflect/Field;

    .line 49
    .line 50
    if-eqz v1, :cond_2

    .line 51
    .line 52
    return-object v1

    .line 53
    :cond_2
    invoke-virtual {v3, p0}, Ljx;->δ(Lkx;)Ldx;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    if-eqz v1, :cond_4

    .line 58
    .line 59
    invoke-virtual {v1, p1}, Ldx;->α(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Field;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    if-eqz v1, :cond_3

    .line 64
    .line 65
    invoke-virtual {v0, v5, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    iget-object p0, p0, Lkx;->ε:Ljava/lang/String;

    .line 69
    .line 70
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    const-string p3, ", field="

    .line 83
    .line 84
    const-string v0, "#"

    .line 85
    .line 86
    const-string v2, "cache hit field, key="

    .line 87
    .line 88
    invoke-static {v2, p0, p3, p1, v0}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    invoke-static {p0}, Lox;->ξ(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    return-object v1

    .line 103
    :cond_3
    iget-object v0, p0, Lkx;->ε:Ljava/lang/String;

    .line 104
    .line 105
    new-instance v1, Ljava/lang/StringBuilder;

    .line 106
    .line 107
    const-string v2, "cache field invalid, key="

    .line 108
    .line 109
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    const-string v0, ", re-query"

    .line 116
    .line 117
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-static {v0}, Lox;->ξ(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    :cond_4
    invoke-static {p0, p1}, Lox;->ζ(Lkx;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    new-instance v1, Llx;

    .line 132
    .line 133
    const/4 v6, 0x1

    .line 134
    move-object v4, p0

    .line 135
    move-object v2, p3

    .line 136
    invoke-direct/range {v1 .. v6}, Llx;-><init>(La80;Ljx;Lkx;Ljava/lang/String;I)V

    .line 137
    .line 138
    .line 139
    invoke-static {p1, p2, v1}, Lox;->τ(Ljava/lang/String;Ljava/lang/String;La80;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    check-cast p0, Ljava/lang/reflect/Field;

    .line 144
    .line 145
    return-object p0
.end method

.method public static λ(Lkx;Ljava/lang/ClassLoader;Ljava/lang/String;La80;)Ljava/util/List;
    .locals 27

    .line 1
    move-object/from16 v3, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    sget-object v6, Ljz;->ε:Ljz;

    .line 6
    .line 7
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iget-object v0, v3, Lkx;->ε:Ljava/lang/String;

    .line 16
    .line 17
    const-string v1, "getOrFindMethods failed, classLoader is null, key="

    .line 18
    .line 19
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0}, Lox;->ξ(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-object v6

    .line 27
    :cond_0
    sget-object v2, Lox;->δ:Ljx;

    .line 28
    .line 29
    iget-object v1, v3, Lkx;->ε:Ljava/lang/String;

    .line 30
    .line 31
    if-nez v2, :cond_1

    .line 32
    .line 33
    const-string v0, "getOrFindMethods failed, cache is null, key="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-static {v0}, Lox;->ξ(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-object v6

    .line 43
    :cond_1
    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    const-string v5, "@"

    .line 48
    .line 49
    invoke-static {v1, v5, v4}, Lnx;->ι(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    sget-object v1, Lox;->κ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 54
    .line 55
    invoke-virtual {v1, v4}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    check-cast v1, Ljava/util/List;

    .line 60
    .line 61
    if-eqz v1, :cond_2

    .line 62
    .line 63
    return-object v1

    .line 64
    :cond_2
    invoke-virtual {v2, v3}, Ljx;->ε(Lkx;)Ljava/util/List;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    if-eqz v1, :cond_3

    .line 69
    .line 70
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    const-string v7, ", re-query"

    .line 75
    .line 76
    if-eqz v5, :cond_4

    .line 77
    .line 78
    sget-object v5, Lox;->ρ:Ljava/util/Set;

    .line 79
    .line 80
    invoke-interface {v5, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v5

    .line 84
    if-eqz v5, :cond_4

    .line 85
    .line 86
    iget-object v1, v3, Lkx;->ε:Ljava/lang/String;

    .line 87
    .line 88
    new-instance v5, Ljava/lang/StringBuilder;

    .line 89
    .line 90
    const-string v8, "empty cache ignored, key="

    .line 91
    .line 92
    invoke-direct {v5, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-static {v1}, Lox;->ξ(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    :cond_3
    move-object/from16 v26, v6

    .line 109
    .line 110
    goto/16 :goto_6

    .line 111
    .line 112
    :cond_4
    new-instance v5, Ljava/util/ArrayList;

    .line 113
    .line 114
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 115
    .line 116
    .line 117
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 118
    .line 119
    .line 120
    move-result-object v8

    .line 121
    :cond_5
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 122
    .line 123
    .line 124
    move-result v9

    .line 125
    if-eqz v9, :cond_6

    .line 126
    .line 127
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v9

    .line 131
    check-cast v9, Lsx;

    .line 132
    .line 133
    invoke-virtual {v9, v0}, Lsx;->α(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 134
    .line 135
    .line 136
    move-result-object v9

    .line 137
    if-eqz v9, :cond_5

    .line 138
    .line 139
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    goto :goto_0

    .line 143
    :cond_6
    new-instance v8, Ljava/util/HashSet;

    .line 144
    .line 145
    invoke-direct {v8}, Ljava/util/HashSet;-><init>()V

    .line 146
    .line 147
    .line 148
    new-instance v9, Ljava/util/ArrayList;

    .line 149
    .line 150
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 154
    .line 155
    .line 156
    move-result-object v5

    .line 157
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 158
    .line 159
    .line 160
    move-result v10

    .line 161
    if-eqz v10, :cond_9

    .line 162
    .line 163
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v10

    .line 167
    move-object v13, v10

    .line 168
    check-cast v13, Ljava/lang/reflect/Method;

    .line 169
    .line 170
    invoke-static {v13}, Llz1;->τ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v14

    .line 174
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v15

    .line 178
    invoke-static {v15, v13}, Llz1;->ο(Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v12

    .line 182
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    move-result-object v11

    .line 186
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    new-instance v0, Ljava/util/ArrayList;

    .line 190
    .line 191
    move-object/from16 v24, v1

    .line 192
    .line 193
    array-length v1, v11

    .line 194
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 195
    .line 196
    .line 197
    array-length v1, v11

    .line 198
    move-object/from16 v25, v5

    .line 199
    .line 200
    const/4 v5, 0x0

    .line 201
    :goto_2
    if-ge v5, v1, :cond_7

    .line 202
    .line 203
    move/from16 v17, v1

    .line 204
    .line 205
    aget-object v1, v11, v5

    .line 206
    .line 207
    move-object/from16 v26, v6

    .line 208
    .line 209
    const/4 v6, 0x1

    .line 210
    invoke-static {v1, v0, v5, v6}, Llz1;->δ(Ljava/lang/Class;Ljava/util/ArrayList;II)I

    .line 211
    .line 212
    .line 213
    move-result v5

    .line 214
    move/from16 v1, v17

    .line 215
    .line 216
    move-object/from16 v6, v26

    .line 217
    .line 218
    goto :goto_2

    .line 219
    :cond_7
    move-object/from16 v26, v6

    .line 220
    .line 221
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 222
    .line 223
    .line 224
    move-result v1

    .line 225
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 226
    .line 227
    .line 228
    const/16 v22, 0x0

    .line 229
    .line 230
    const/16 v23, 0x3e

    .line 231
    .line 232
    const-string v18, ","

    .line 233
    .line 234
    const/16 v19, 0x0

    .line 235
    .line 236
    const/16 v20, 0x0

    .line 237
    .line 238
    const/16 v21, 0x0

    .line 239
    .line 240
    move-object/from16 v17, v0

    .line 241
    .line 242
    invoke-static/range {v17 .. v23}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    const-string v1, "#"

    .line 247
    .line 248
    const-string v5, "("

    .line 249
    .line 250
    invoke-static {v14, v1, v15, v5, v0}, Lnx;->ρ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    const-string v1, "):"

    .line 255
    .line 256
    invoke-static {v0, v1, v12, v8}, Llz1;->Γ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/HashSet;)Z

    .line 257
    .line 258
    .line 259
    move-result v0

    .line 260
    if-eqz v0, :cond_8

    .line 261
    .line 262
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    :cond_8
    move-object/from16 v0, p1

    .line 266
    .line 267
    move-object/from16 v1, v24

    .line 268
    .line 269
    move-object/from16 v5, v25

    .line 270
    .line 271
    move-object/from16 v6, v26

    .line 272
    .line 273
    goto :goto_1

    .line 274
    :cond_9
    move-object/from16 v24, v1

    .line 275
    .line 276
    move-object/from16 v26, v6

    .line 277
    .line 278
    invoke-interface/range {v24 .. v24}, Ljava/util/List;->isEmpty()Z

    .line 279
    .line 280
    .line 281
    move-result v0

    .line 282
    if-nez v0, :cond_b

    .line 283
    .line 284
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    .line 285
    .line 286
    .line 287
    move-result v0

    .line 288
    if-nez v0, :cond_a

    .line 289
    .line 290
    goto :goto_3

    .line 291
    :cond_a
    iget-object v0, v3, Lkx;->ε:Ljava/lang/String;

    .line 292
    .line 293
    new-instance v1, Ljava/lang/StringBuilder;

    .line 294
    .line 295
    const-string v5, "cache all invalid, key="

    .line 296
    .line 297
    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 301
    .line 302
    .line 303
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 304
    .line 305
    .line 306
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    invoke-static {v0}, Lox;->ξ(Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    goto/16 :goto_6

    .line 314
    .line 315
    :cond_b
    :goto_3
    sget-object v0, Lox;->κ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 316
    .line 317
    invoke-virtual {v0, v4, v9}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 321
    .line 322
    .line 323
    move-result v0

    .line 324
    invoke-interface/range {v24 .. v24}, Ljava/util/List;->size()I

    .line 325
    .line 326
    .line 327
    move-result v1

    .line 328
    if-eq v0, v1, :cond_e

    .line 329
    .line 330
    new-instance v0, Ljava/util/ArrayList;

    .line 331
    .line 332
    const/16 v1, 0xa

    .line 333
    .line 334
    invoke-static {v9, v1}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 335
    .line 336
    .line 337
    move-result v1

    .line 338
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 339
    .line 340
    .line 341
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 342
    .line 343
    .line 344
    move-result-object v1

    .line 345
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 346
    .line 347
    .line 348
    move-result v4

    .line 349
    if-eqz v4, :cond_d

    .line 350
    .line 351
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v4

    .line 355
    check-cast v4, Ljava/lang/reflect/Method;

    .line 356
    .line 357
    invoke-static {v4}, Llz1;->τ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object v11

    .line 361
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 362
    .line 363
    .line 364
    move-result-object v12

    .line 365
    invoke-static {v12, v4}, Llz1;->ο(Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object v13

    .line 369
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 370
    .line 371
    .line 372
    move-result-object v5

    .line 373
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 374
    .line 375
    .line 376
    new-instance v14, Ljava/util/ArrayList;

    .line 377
    .line 378
    array-length v6, v5

    .line 379
    invoke-direct {v14, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 380
    .line 381
    .line 382
    array-length v6, v5

    .line 383
    const/4 v7, 0x0

    .line 384
    :goto_5
    if-ge v7, v6, :cond_c

    .line 385
    .line 386
    aget-object v8, v5, v7

    .line 387
    .line 388
    const/4 v10, 0x1

    .line 389
    invoke-static {v8, v14, v7, v10}, Llz1;->δ(Ljava/lang/Class;Ljava/util/ArrayList;II)I

    .line 390
    .line 391
    .line 392
    move-result v7

    .line 393
    goto :goto_5

    .line 394
    :cond_c
    const/4 v10, 0x1

    .line 395
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 396
    .line 397
    .line 398
    move-result v4

    .line 399
    invoke-static {v4}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 400
    .line 401
    .line 402
    move-result v15

    .line 403
    move/from16 v16, v10

    .line 404
    .line 405
    new-instance v10, Lsx;

    .line 406
    .line 407
    invoke-direct/range {v10 .. v15}, Lsx;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Z)V

    .line 408
    .line 409
    .line 410
    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 411
    .line 412
    .line 413
    goto :goto_4

    .line 414
    :cond_d
    invoke-virtual {v2, v3, v0}, Ljx;->κ(Lkx;Ljava/util/ArrayList;)V

    .line 415
    .line 416
    .line 417
    :cond_e
    iget-object v0, v3, Lkx;->ε:Ljava/lang/String;

    .line 418
    .line 419
    invoke-interface/range {v24 .. v24}, Ljava/util/List;->size()I

    .line 420
    .line 421
    .line 422
    move-result v1

    .line 423
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 424
    .line 425
    .line 426
    move-result v2

    .line 427
    const-string v3, ", cached="

    .line 428
    .line 429
    const-string v4, ", resolved="

    .line 430
    .line 431
    const-string v5, "cache hit methods, key="

    .line 432
    .line 433
    invoke-static {v1, v5, v0, v3, v4}, Lnx;->ξ(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 434
    .line 435
    .line 436
    move-result-object v0

    .line 437
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 438
    .line 439
    .line 440
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 441
    .line 442
    .line 443
    move-result-object v0

    .line 444
    invoke-static {v0}, Lox;->ξ(Ljava/lang/String;)V

    .line 445
    .line 446
    .line 447
    return-object v9

    .line 448
    :goto_6
    invoke-static/range {p0 .. p1}, Lox;->ο(Lkx;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 449
    .line 450
    .line 451
    move-result-object v6

    .line 452
    new-instance v0, Llx;

    .line 453
    .line 454
    const/4 v5, 0x2

    .line 455
    move-object/from16 v1, p3

    .line 456
    .line 457
    invoke-direct/range {v0 .. v5}, Llx;-><init>(La80;Ljx;Lkx;Ljava/lang/String;I)V

    .line 458
    .line 459
    .line 460
    move-object v1, v0

    .line 461
    move-object/from16 v0, p2

    .line 462
    .line 463
    invoke-static {v6, v0, v1}, Lox;->τ(Ljava/lang/String;Ljava/lang/String;La80;)Ljava/lang/Object;

    .line 464
    .line 465
    .line 466
    move-result-object v0

    .line 467
    check-cast v0, Ljava/util/List;

    .line 468
    .line 469
    if-nez v0, :cond_f

    .line 470
    .line 471
    return-object v26

    .line 472
    :cond_f
    return-object v0
.end method

.method public static μ()V
    .locals 6

    .line 1
    const-string v0, "user_clear_from_settings"

    .line 2
    .line 3
    const-string v1, "invalidate: "

    .line 4
    .line 5
    sget-object v2, Lox;->α:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v2

    .line 8
    :try_start_0
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-static {v1}, Lox;->ξ(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    sget-object v1, Lox;->ν:Ljava/lang/Object;

    .line 16
    .line 17
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 18
    :try_start_1
    sget-object v3, Lox;->π:Ljava/util/HashMap;

    .line 19
    .line 20
    invoke-virtual {v3}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    check-cast v3, Ljava/lang/Iterable;

    .line 28
    .line 29
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    :catchall_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-eqz v4, :cond_0

    .line 38
    .line 39
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    check-cast v4, Ljava/util/concurrent/Future;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 44
    .line 45
    const/4 v5, 0x1

    .line 46
    :try_start_2
    invoke-interface {v4, v5}, Ljava/util/concurrent/Future;->cancel(Z)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :catchall_1
    move-exception v0

    .line 51
    goto :goto_3

    .line 52
    :cond_0
    :try_start_3
    sget-object v3, Lox;->π:Ljava/util/HashMap;

    .line 53
    .line 54
    invoke-virtual {v3}, Ljava/util/HashMap;->clear()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 55
    .line 56
    .line 57
    :try_start_4
    monitor-exit v1

    .line 58
    sget-object v1, Los;->α:Landroid/os/Handler;

    .line 59
    .line 60
    sget-object v1, Los;->Ξ:Ljava/lang/Object;

    .line 61
    .line 62
    monitor-enter v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 63
    :try_start_5
    invoke-static {}, Los;->ε()V

    .line 64
    .line 65
    .line 66
    invoke-static {}, Los;->γ()V

    .line 67
    .line 68
    .line 69
    sget-object v3, Los;->Ο:Ljava/util/LinkedHashMap;

    .line 70
    .line 71
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->clear()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 72
    .line 73
    .line 74
    :try_start_6
    monitor-exit v1

    .line 75
    sget-object v1, Los;->α:Landroid/os/Handler;

    .line 76
    .line 77
    new-instance v3, Ls0;

    .line 78
    .line 79
    const/16 v4, 0x12

    .line 80
    .line 81
    invoke-direct {v3, v4}, Ls0;-><init>(I)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 85
    .line 86
    .line 87
    :try_start_7
    sget-object v1, Lrx;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 88
    .line 89
    invoke-static {}, Lrx;->ζ()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 90
    .line 91
    .line 92
    :catchall_2
    :try_start_8
    invoke-static {}, Lox;->β()V

    .line 93
    .line 94
    .line 95
    sget-object v1, Lox;->δ:Ljx;

    .line 96
    .line 97
    if-eqz v1, :cond_1

    .line 98
    .line 99
    monitor-enter v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 100
    :try_start_9
    iget-object v3, v1, Ljx;->α:Landroid/content/SharedPreferences;

    .line 101
    .line 102
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 111
    .line 112
    .line 113
    :try_start_a
    monitor-exit v1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 114
    goto :goto_1

    .line 115
    :catchall_3
    move-exception v0

    .line 116
    :try_start_b
    monitor-exit v1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    .line 117
    :try_start_c
    throw v0

    .line 118
    :cond_1
    :goto_1
    sget-object v1, Lox;->ε:Lpx;

    .line 119
    .line 120
    if-eqz v1, :cond_2

    .line 121
    .line 122
    sget-object v3, Lox;->δ:Ljx;

    .line 123
    .line 124
    if-eqz v3, :cond_2

    .line 125
    .line 126
    invoke-virtual {v3, v1}, Ljx;->α(Lpx;)V

    .line 127
    .line 128
    .line 129
    goto :goto_2

    .line 130
    :catchall_4
    move-exception v0

    .line 131
    goto :goto_4

    .line 132
    :cond_2
    :goto_2
    invoke-static {v0}, Lox;->γ(Ljava/lang/String;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    .line 133
    .line 134
    .line 135
    monitor-exit v2

    .line 136
    return-void

    .line 137
    :catchall_5
    move-exception v0

    .line 138
    :try_start_d
    monitor-exit v1

    .line 139
    throw v0

    .line 140
    :goto_3
    monitor-exit v1

    .line 141
    throw v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    .line 142
    :goto_4
    monitor-exit v2

    .line 143
    throw v0
.end method

.method public static ν(Ljava/lang/String;)Z
    .locals 7

    .line 1
    const/16 v0, 0x3a

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    invoke-static {p0, v0, v1}, Lq02;->ф(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/16 v0, 0x40

    .line 10
    .line 11
    const-string v1, ""

    .line 12
    .line 13
    invoke-static {p0, v0, v1}, Lq02;->ш(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    const/4 v1, 0x0

    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    goto/16 :goto_8

    .line 33
    .line 34
    :cond_0
    invoke-static {}, Lkx;->values()[Lkx;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    array-length v2, v0

    .line 39
    move v3, v1

    .line 40
    :goto_0
    const/4 v4, 0x0

    .line 41
    if-ge v3, v2, :cond_2

    .line 42
    .line 43
    aget-object v5, v0, v3

    .line 44
    .line 45
    iget-object v6, v5, Lkx;->ε:Ljava/lang/String;

    .line 46
    .line 47
    invoke-virtual {v6, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    if-eqz v6, :cond_1

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    move-object v5, v4

    .line 58
    :goto_1
    if-nez v5, :cond_3

    .line 59
    .line 60
    goto/16 :goto_8

    .line 61
    .line 62
    :cond_3
    sget-object p0, Lox;->δ:Ljx;

    .line 63
    .line 64
    if-eqz p0, :cond_b

    .line 65
    .line 66
    monitor-enter p0

    .line 67
    :try_start_0
    iget-object v0, p0, Ljx;->α:Landroid/content/SharedPreferences;

    .line 68
    .line 69
    iget-object v2, v5, Lkx;->ε:Ljava/lang/String;

    .line 70
    .line 71
    new-instance v3, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    const-string v5, "data_"

    .line 74
    .line 75
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    invoke-interface {v0, v2, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 89
    const/4 v2, 0x1

    .line 90
    if-nez v0, :cond_4

    .line 91
    .line 92
    monitor-exit p0

    .line 93
    :goto_2
    move v0, v1

    .line 94
    goto :goto_7

    .line 95
    :cond_4
    :try_start_1
    invoke-static {v0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 104
    .line 105
    .line 106
    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 107
    if-eqz v3, :cond_5

    .line 108
    .line 109
    monitor-exit p0

    .line 110
    goto :goto_2

    .line 111
    :cond_5
    :try_start_2
    const-string v3, "["

    .line 112
    .line 113
    invoke-static {v0, v3, v1}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    if-eqz v3, :cond_8

    .line 118
    .line 119
    new-instance v3, Lorg/json/JSONArray;

    .line 120
    .line 121
    invoke-direct {v3, v0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    if-lez v0, :cond_7

    .line 129
    .line 130
    :cond_6
    :goto_3
    move v0, v2

    .line 131
    goto :goto_4

    .line 132
    :cond_7
    move v0, v1

    .line 133
    goto :goto_4

    .line 134
    :catchall_0
    move-exception v0

    .line 135
    goto :goto_5

    .line 136
    :cond_8
    const-string v3, "{"

    .line 137
    .line 138
    invoke-static {v0, v3, v1}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 139
    .line 140
    .line 141
    move-result v3

    .line 142
    if-eqz v3, :cond_6

    .line 143
    .line 144
    new-instance v3, Lorg/json/JSONObject;

    .line 145
    .line 146
    invoke-direct {v3, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v3}, Lorg/json/JSONObject;->length()I

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    if-lez v0, :cond_7

    .line 154
    .line 155
    goto :goto_3

    .line 156
    :goto_4
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 157
    .line 158
    .line 159
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 160
    goto :goto_6

    .line 161
    :goto_5
    :try_start_3
    new-instance v3, Leo1;

    .line 162
    .line 163
    invoke-direct {v3, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 164
    .line 165
    .line 166
    move-object v0, v3

    .line 167
    :goto_6
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 168
    .line 169
    instance-of v4, v0, Leo1;

    .line 170
    .line 171
    if-eqz v4, :cond_9

    .line 172
    .line 173
    move-object v0, v3

    .line 174
    :cond_9
    check-cast v0, Ljava/lang/Boolean;

    .line 175
    .line 176
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 177
    .line 178
    .line 179
    move-result v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 180
    monitor-exit p0

    .line 181
    :goto_7
    if-ne v0, v2, :cond_a

    .line 182
    .line 183
    move v1, v2

    .line 184
    :cond_a
    return v1

    .line 185
    :catchall_1
    move-exception v0

    .line 186
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 187
    throw v0

    .line 188
    :cond_b
    :goto_8
    return v1
.end method

.method public static ξ(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "rc6b76a71d3bdc272"

    .line 2
    .line 3
    invoke-static {v0, p0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static ο(Lkx;Ljava/lang/ClassLoader;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Lkx;->ε:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {p1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    new-instance v0, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v1, "methods:"

    .line 16
    .line 17
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string p0, "@"

    .line 24
    .line 25
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0
.end method

.method public static π(Lkx;Ljava/lang/ClassLoader;)Ljava/util/List;
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    goto/16 :goto_2

    .line 8
    .line 9
    :cond_0
    iget-object v1, p0, Lkx;->ε:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {p1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const-string v3, "@"

    .line 16
    .line 17
    invoke-static {v1, v3, v2}, Lnx;->ι(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    sget-object v2, Lox;->λ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 22
    .line 23
    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    check-cast v3, Ljava/util/List;

    .line 28
    .line 29
    if-eqz v3, :cond_2

    .line 30
    .line 31
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_1

    .line 36
    .line 37
    sget-object p1, Lox;->σ:Ljava/util/Set;

    .line 38
    .line 39
    invoke-interface {p1, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-eqz p1, :cond_1

    .line 44
    .line 45
    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    iget-object p0, p0, Lkx;->ε:Ljava/lang/String;

    .line 49
    .line 50
    const-string p1, "empty memory class cache invalid, key="

    .line 51
    .line 52
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-static {p0}, Lox;->ξ(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return-object v0

    .line 60
    :cond_1
    return-object v3

    .line 61
    :cond_2
    sget-object v2, Lox;->δ:Ljx;

    .line 62
    .line 63
    if-eqz v2, :cond_a

    .line 64
    .line 65
    invoke-virtual {v2, p0}, Ljx;->γ(Lkx;)Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    if-nez v2, :cond_3

    .line 70
    .line 71
    goto/16 :goto_2

    .line 72
    .line 73
    :cond_3
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    if-eqz v3, :cond_4

    .line 78
    .line 79
    sget-object v3, Lox;->σ:Ljava/util/Set;

    .line 80
    .line 81
    invoke-interface {v3, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    if-eqz v3, :cond_4

    .line 86
    .line 87
    iget-object p0, p0, Lkx;->ε:Ljava/lang/String;

    .line 88
    .line 89
    const-string p1, "empty cached classes invalid, key="

    .line 90
    .line 91
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-static {p0}, Lox;->ξ(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    return-object v0

    .line 99
    :cond_4
    new-instance v3, Ljava/util/ArrayList;

    .line 100
    .line 101
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 102
    .line 103
    .line 104
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    :cond_5
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 109
    .line 110
    .line 111
    move-result v5

    .line 112
    if-eqz v5, :cond_6

    .line 113
    .line 114
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    check-cast v5, Lcx;

    .line 119
    .line 120
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    sget-object v6, Lbx;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 124
    .line 125
    iget-object v5, v5, Lcx;->α:Ljava/lang/String;

    .line 126
    .line 127
    invoke-static {p1, v5}, Lbx;->α(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    move-result-object v5

    .line 131
    if-eqz v5, :cond_5

    .line 132
    .line 133
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    goto :goto_0

    .line 137
    :cond_6
    new-instance p1, Ljava/util/HashSet;

    .line 138
    .line 139
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 140
    .line 141
    .line 142
    new-instance v4, Ljava/util/ArrayList;

    .line 143
    .line 144
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    :cond_7
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 152
    .line 153
    .line 154
    move-result v5

    .line 155
    if-eqz v5, :cond_8

    .line 156
    .line 157
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v5

    .line 161
    move-object v6, v5

    .line 162
    check-cast v6, Ljava/lang/Class;

    .line 163
    .line 164
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v6

    .line 168
    invoke-virtual {p1, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result v6

    .line 172
    if-eqz v6, :cond_7

    .line 173
    .line 174
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    goto :goto_1

    .line 178
    :cond_8
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 179
    .line 180
    .line 181
    move-result p1

    .line 182
    if-nez p1, :cond_9

    .line 183
    .line 184
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 185
    .line 186
    .line 187
    move-result p1

    .line 188
    if-eqz p1, :cond_9

    .line 189
    .line 190
    iget-object p0, p0, Lkx;->ε:Ljava/lang/String;

    .line 191
    .line 192
    const-string p1, "cached classes invalid, key="

    .line 193
    .line 194
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    invoke-static {p0}, Lox;->ξ(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    return-object v0

    .line 202
    :cond_9
    sget-object p0, Lox;->λ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 203
    .line 204
    invoke-virtual {p0, v1, v4}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    return-object v4

    .line 208
    :cond_a
    :goto_2
    return-object v0
.end method

.method public static ρ(Lkx;Ljava/lang/ClassLoader;)Ljava/lang/reflect/Field;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    iget-object v0, p0, Lkx;->ε:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {p1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const-string v2, "@"

    .line 14
    .line 15
    invoke-static {v0, v2, v1}, Lnx;->ι(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sget-object v1, Lox;->μ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 20
    .line 21
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Ljava/lang/reflect/Field;

    .line 26
    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    return-object v2

    .line 30
    :cond_1
    sget-object v2, Lox;->δ:Ljx;

    .line 31
    .line 32
    if-eqz v2, :cond_3

    .line 33
    .line 34
    invoke-virtual {v2, p0}, Ljx;->δ(Lkx;)Ldx;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    if-eqz p0, :cond_3

    .line 39
    .line 40
    invoke-virtual {p0, p1}, Ldx;->α(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Field;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    if-nez p0, :cond_2

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    invoke-virtual {v1, v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    return-object p0

    .line 51
    :cond_3
    :goto_0
    const/4 p0, 0x0

    .line 52
    return-object p0
.end method

.method public static σ(Lkx;Ljava/lang/ClassLoader;)Ljava/util/List;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    :cond_0
    :goto_0
    move-object/from16 v20, v2

    .line 12
    .line 13
    goto/16 :goto_4

    .line 14
    .line 15
    :cond_1
    iget-object v3, v0, Lkx;->ε:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    const-string v5, "@"

    .line 22
    .line 23
    invoke-static {v3, v5, v4}, Lnx;->ι(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    sget-object v4, Lox;->κ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 28
    .line 29
    invoke-virtual {v4, v3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    check-cast v4, Ljava/util/List;

    .line 34
    .line 35
    if-eqz v4, :cond_2

    .line 36
    .line 37
    return-object v4

    .line 38
    :cond_2
    sget-object v4, Lox;->δ:Ljx;

    .line 39
    .line 40
    if-eqz v4, :cond_0

    .line 41
    .line 42
    invoke-virtual {v4, v0}, Ljx;->ε(Lkx;)Ljava/util/List;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    if-nez v4, :cond_3

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_3
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    if-eqz v5, :cond_4

    .line 54
    .line 55
    sget-object v5, Lox;->ρ:Ljava/util/Set;

    .line 56
    .line 57
    invoke-interface {v5, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    if-eqz v5, :cond_4

    .line 62
    .line 63
    iget-object v0, v0, Lkx;->ε:Ljava/lang/String;

    .line 64
    .line 65
    const-string v1, "empty cached methods invalid, key="

    .line 66
    .line 67
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-static {v0}, Lox;->ξ(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    return-object v2

    .line 75
    :cond_4
    new-instance v5, Ljava/util/ArrayList;

    .line 76
    .line 77
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 78
    .line 79
    .line 80
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    :cond_5
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 85
    .line 86
    .line 87
    move-result v7

    .line 88
    if-eqz v7, :cond_6

    .line 89
    .line 90
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    check-cast v7, Lsx;

    .line 95
    .line 96
    invoke-virtual {v7, v1}, Lsx;->α(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 97
    .line 98
    .line 99
    move-result-object v7

    .line 100
    if-eqz v7, :cond_5

    .line 101
    .line 102
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_6
    new-instance v1, Ljava/util/HashSet;

    .line 107
    .line 108
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 109
    .line 110
    .line 111
    new-instance v6, Ljava/util/ArrayList;

    .line 112
    .line 113
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 117
    .line 118
    .line 119
    move-result-object v5

    .line 120
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 121
    .line 122
    .line 123
    move-result v7

    .line 124
    if-eqz v7, :cond_9

    .line 125
    .line 126
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v7

    .line 130
    move-object v8, v7

    .line 131
    check-cast v8, Ljava/lang/reflect/Method;

    .line 132
    .line 133
    invoke-static {v8}, Llz1;->τ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v9

    .line 137
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v10

    .line 141
    invoke-static {v10, v8}, Llz1;->ο(Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v11

    .line 145
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    move-result-object v12

    .line 149
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    new-instance v13, Ljava/util/ArrayList;

    .line 153
    .line 154
    array-length v14, v12

    .line 155
    invoke-direct {v13, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 156
    .line 157
    .line 158
    array-length v14, v12

    .line 159
    const/4 v15, 0x0

    .line 160
    :goto_3
    if-ge v15, v14, :cond_7

    .line 161
    .line 162
    move-object/from16 v20, v2

    .line 163
    .line 164
    aget-object v2, v12, v15

    .line 165
    .line 166
    move-object/from16 v21, v4

    .line 167
    .line 168
    const/4 v4, 0x1

    .line 169
    invoke-static {v2, v13, v15, v4}, Llz1;->δ(Ljava/lang/Class;Ljava/util/ArrayList;II)I

    .line 170
    .line 171
    .line 172
    move-result v15

    .line 173
    move-object/from16 v2, v20

    .line 174
    .line 175
    move-object/from16 v4, v21

    .line 176
    .line 177
    goto :goto_3

    .line 178
    :cond_7
    move-object/from16 v20, v2

    .line 179
    .line 180
    move-object/from16 v21, v4

    .line 181
    .line 182
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 183
    .line 184
    .line 185
    move-result v2

    .line 186
    invoke-static {v2}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 187
    .line 188
    .line 189
    const/16 v18, 0x0

    .line 190
    .line 191
    const/16 v19, 0x3e

    .line 192
    .line 193
    const-string v14, ","

    .line 194
    .line 195
    const/4 v15, 0x0

    .line 196
    const/16 v16, 0x0

    .line 197
    .line 198
    const/16 v17, 0x0

    .line 199
    .line 200
    invoke-static/range {v13 .. v19}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    const-string v4, "#"

    .line 205
    .line 206
    const-string v8, "("

    .line 207
    .line 208
    invoke-static {v9, v4, v10, v8, v2}, Lnx;->ρ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    const-string v4, "):"

    .line 213
    .line 214
    invoke-static {v2, v4, v11, v1}, Llz1;->Γ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/HashSet;)Z

    .line 215
    .line 216
    .line 217
    move-result v2

    .line 218
    if-eqz v2, :cond_8

    .line 219
    .line 220
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 221
    .line 222
    .line 223
    :cond_8
    move-object/from16 v2, v20

    .line 224
    .line 225
    move-object/from16 v4, v21

    .line 226
    .line 227
    goto :goto_2

    .line 228
    :cond_9
    move-object/from16 v20, v2

    .line 229
    .line 230
    move-object/from16 v21, v4

    .line 231
    .line 232
    invoke-interface/range {v21 .. v21}, Ljava/util/Collection;->isEmpty()Z

    .line 233
    .line 234
    .line 235
    move-result v1

    .line 236
    if-nez v1, :cond_a

    .line 237
    .line 238
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 239
    .line 240
    .line 241
    move-result v1

    .line 242
    if-eqz v1, :cond_a

    .line 243
    .line 244
    iget-object v0, v0, Lkx;->ε:Ljava/lang/String;

    .line 245
    .line 246
    const-string v1, "cached methods invalid, key="

    .line 247
    .line 248
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    invoke-static {v0}, Lox;->ξ(Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    return-object v20

    .line 256
    :cond_a
    sget-object v0, Lox;->κ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 257
    .line 258
    invoke-virtual {v0, v3, v6}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    return-object v6

    .line 262
    :goto_4
    return-object v20
.end method

.method public static τ(Ljava/lang/String;Ljava/lang/String;La80;)Ljava/lang/Object;
    .locals 5

    .line 1
    const-string v0, "DexKit queue task interrupted, taskId="

    .line 2
    .line 3
    const-string v1, "DexKit queue task canceled, taskId="

    .line 4
    .line 5
    const-string v2, "DexKit queue task failed, taskId="

    .line 6
    .line 7
    sget-object v3, Lox;->ο:Ljava/lang/ThreadLocal;

    .line 8
    .line 9
    invoke-virtual {v3}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-static {v3, v4}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    invoke-static {p0, p1, p2}, Lox;->ε(Ljava/lang/String;Ljava/lang/String;La80;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :cond_0
    invoke-static {p0, p1, p2}, Lox;->ψ(Ljava/lang/String;Ljava/lang/String;La80;)Ljava/util/concurrent/Future;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-static {p2, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    const/4 v3, 0x0

    .line 43
    if-eqz p2, :cond_1

    .line 44
    .line 45
    const-string p1, "DexKit task submitted async on main thread, taskId="

    .line 46
    .line 47
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-static {p0}, Lox;->ξ(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-object v3

    .line 55
    :cond_1
    const/4 p2, 0x0

    .line 56
    :try_start_0
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p2
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 60
    invoke-interface {p1}, Ljava/util/concurrent/Future;->isDone()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-nez v0, :cond_3

    .line 65
    .line 66
    invoke-interface {p1}, Ljava/util/concurrent/Future;->isCancelled()Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-eqz v0, :cond_2

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_2
    return-object p2

    .line 74
    :cond_3
    :goto_0
    sget-object v0, Lox;->ν:Ljava/lang/Object;

    .line 75
    .line 76
    monitor-enter v0

    .line 77
    :try_start_1
    sget-object v1, Lox;->π:Ljava/util/HashMap;

    .line 78
    .line 79
    invoke-virtual {v1, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    if-ne v2, p1, :cond_4

    .line 84
    .line 85
    invoke-virtual {v1, p0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :catchall_0
    move-exception p0

    .line 90
    goto :goto_2

    .line 91
    :cond_4
    :goto_1
    monitor-exit v0

    .line 92
    return-object p2

    .line 93
    :goto_2
    monitor-exit v0

    .line 94
    throw p0

    .line 95
    :catchall_1
    move-exception v0

    .line 96
    :try_start_2
    new-instance v1, Ljava/lang/StringBuilder;

    .line 97
    .line 98
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    const-string v2, ", err="

    .line 105
    .line 106
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-static {v0}, Lox;->ξ(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    sget-object v0, Los;->α:Landroid/os/Handler;

    .line 120
    .line 121
    invoke-static {p0, p2}, Los;->Α(Ljava/lang/String;Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 122
    .line 123
    .line 124
    invoke-interface {p1}, Ljava/util/concurrent/Future;->isDone()Z

    .line 125
    .line 126
    .line 127
    move-result p2

    .line 128
    if-nez p2, :cond_5

    .line 129
    .line 130
    invoke-interface {p1}, Ljava/util/concurrent/Future;->isCancelled()Z

    .line 131
    .line 132
    .line 133
    move-result p2

    .line 134
    if-eqz p2, :cond_9

    .line 135
    .line 136
    :cond_5
    sget-object p2, Lox;->ν:Ljava/lang/Object;

    .line 137
    .line 138
    monitor-enter p2

    .line 139
    :try_start_3
    sget-object v0, Lox;->π:Ljava/util/HashMap;

    .line 140
    .line 141
    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    if-ne v1, p1, :cond_6

    .line 146
    .line 147
    invoke-virtual {v0, p0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 148
    .line 149
    .line 150
    goto :goto_3

    .line 151
    :catchall_2
    move-exception p0

    .line 152
    goto :goto_4

    .line 153
    :cond_6
    :goto_3
    monitor-exit p2

    .line 154
    goto :goto_5

    .line 155
    :goto_4
    monitor-exit p2

    .line 156
    throw p0

    .line 157
    :catchall_3
    move-exception p2

    .line 158
    goto :goto_7

    .line 159
    :catch_0
    :try_start_4
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    invoke-static {v0}, Lox;->ξ(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    sget-object v0, Los;->α:Landroid/os/Handler;

    .line 167
    .line 168
    invoke-static {p0, p2}, Los;->Α(Ljava/lang/String;Z)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 169
    .line 170
    .line 171
    invoke-interface {p1}, Ljava/util/concurrent/Future;->isDone()Z

    .line 172
    .line 173
    .line 174
    move-result p2

    .line 175
    if-nez p2, :cond_7

    .line 176
    .line 177
    invoke-interface {p1}, Ljava/util/concurrent/Future;->isCancelled()Z

    .line 178
    .line 179
    .line 180
    move-result p2

    .line 181
    if-eqz p2, :cond_9

    .line 182
    .line 183
    :cond_7
    sget-object p2, Lox;->ν:Ljava/lang/Object;

    .line 184
    .line 185
    monitor-enter p2

    .line 186
    :try_start_5
    sget-object v0, Lox;->π:Ljava/util/HashMap;

    .line 187
    .line 188
    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    if-ne v1, p1, :cond_6

    .line 193
    .line 194
    invoke-virtual {v0, p0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 195
    .line 196
    .line 197
    goto :goto_3

    .line 198
    :catchall_4
    move-exception p0

    .line 199
    monitor-exit p2

    .line 200
    throw p0

    .line 201
    :catch_1
    :try_start_6
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 202
    .line 203
    .line 204
    move-result-object p2

    .line 205
    invoke-virtual {p2}, Ljava/lang/Thread;->interrupt()V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object p2

    .line 212
    invoke-static {p2}, Lox;->ξ(Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 213
    .line 214
    .line 215
    invoke-interface {p1}, Ljava/util/concurrent/Future;->isDone()Z

    .line 216
    .line 217
    .line 218
    move-result p2

    .line 219
    if-nez p2, :cond_8

    .line 220
    .line 221
    invoke-interface {p1}, Ljava/util/concurrent/Future;->isCancelled()Z

    .line 222
    .line 223
    .line 224
    move-result p2

    .line 225
    if-eqz p2, :cond_9

    .line 226
    .line 227
    :cond_8
    sget-object p2, Lox;->ν:Ljava/lang/Object;

    .line 228
    .line 229
    monitor-enter p2

    .line 230
    :try_start_7
    sget-object v0, Lox;->π:Ljava/util/HashMap;

    .line 231
    .line 232
    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    if-ne v1, p1, :cond_6

    .line 237
    .line 238
    invoke-virtual {v0, p0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 239
    .line 240
    .line 241
    goto :goto_3

    .line 242
    :catchall_5
    move-exception p0

    .line 243
    goto :goto_6

    .line 244
    :cond_9
    :goto_5
    return-object v3

    .line 245
    :goto_6
    monitor-exit p2

    .line 246
    throw p0

    .line 247
    :goto_7
    invoke-interface {p1}, Ljava/util/concurrent/Future;->isDone()Z

    .line 248
    .line 249
    .line 250
    move-result v0

    .line 251
    if-nez v0, :cond_a

    .line 252
    .line 253
    invoke-interface {p1}, Ljava/util/concurrent/Future;->isCancelled()Z

    .line 254
    .line 255
    .line 256
    move-result v0

    .line 257
    if-eqz v0, :cond_c

    .line 258
    .line 259
    :cond_a
    sget-object v0, Lox;->ν:Ljava/lang/Object;

    .line 260
    .line 261
    monitor-enter v0

    .line 262
    :try_start_8
    sget-object v1, Lox;->π:Ljava/util/HashMap;

    .line 263
    .line 264
    invoke-virtual {v1, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v2

    .line 268
    if-ne v2, p1, :cond_b

    .line 269
    .line 270
    invoke-virtual {v1, p0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    .line 271
    .line 272
    .line 273
    goto :goto_8

    .line 274
    :catchall_6
    move-exception p0

    .line 275
    goto :goto_9

    .line 276
    :cond_b
    :goto_8
    monitor-exit v0

    .line 277
    :cond_c
    throw p2

    .line 278
    :goto_9
    monitor-exit v0

    .line 279
    throw p0
.end method

.method public static υ(Lkx;Ljava/util/List;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lkx;->ε:Ljava/lang/String;

    .line 5
    .line 6
    const-string v1, "@"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sget-object v1, Lox;->λ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    check-cast v2, Ljava/lang/Iterable;

    .line 22
    .line 23
    new-instance v3, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-eqz v4, :cond_1

    .line 37
    .line 38
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    move-object v5, v4

    .line 43
    check-cast v5, Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    const/4 v6, 0x0

    .line 49
    invoke-static {v5, v0, v6}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    if-eqz v5, :cond_0

    .line 54
    .line 55
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-eqz v2, :cond_2

    .line 68
    .line 69
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    check-cast v2, Ljava/lang/String;

    .line 74
    .line 75
    invoke-virtual {v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_2
    sget-object v0, Lox;->δ:Ljx;

    .line 80
    .line 81
    if-eqz v0, :cond_6

    .line 82
    .line 83
    new-instance v1, Ljava/util/HashSet;

    .line 84
    .line 85
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 86
    .line 87
    .line 88
    new-instance v2, Ljava/util/ArrayList;

    .line 89
    .line 90
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 91
    .line 92
    .line 93
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    :cond_3
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 98
    .line 99
    .line 100
    move-result v3

    .line 101
    if-eqz v3, :cond_4

    .line 102
    .line 103
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    move-object v4, v3

    .line 108
    check-cast v4, Ljava/lang/Class;

    .line 109
    .line 110
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    invoke-virtual {v1, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v4

    .line 118
    if-eqz v4, :cond_3

    .line 119
    .line 120
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_4
    new-instance p1, Ljava/util/ArrayList;

    .line 125
    .line 126
    const/16 v1, 0xa

    .line 127
    .line 128
    invoke-static {v2, v1}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    if-eqz v2, :cond_5

    .line 144
    .line 145
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    check-cast v2, Ljava/lang/Class;

    .line 150
    .line 151
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    new-instance v3, Lcx;

    .line 155
    .line 156
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    invoke-direct {v3, v2}, Lcx;-><init>(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    goto :goto_3

    .line 167
    :cond_5
    invoke-virtual {v0, p0, p1}, Ljx;->θ(Lkx;Ljava/util/List;)V

    .line 168
    .line 169
    .line 170
    :cond_6
    return-void
.end method

.method public static φ(Lkx;Ljava/lang/reflect/Field;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lkx;->ε:Ljava/lang/String;

    .line 5
    .line 6
    const-string v1, "@"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sget-object v1, Lox;->μ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    check-cast v2, Ljava/lang/Iterable;

    .line 22
    .line 23
    new-instance v3, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-eqz v4, :cond_1

    .line 37
    .line 38
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    move-object v5, v4

    .line 43
    check-cast v5, Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    const/4 v6, 0x0

    .line 49
    invoke-static {v5, v0, v6}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    if-eqz v5, :cond_0

    .line 54
    .line 55
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-eqz v2, :cond_2

    .line 68
    .line 69
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    check-cast v2, Ljava/lang/String;

    .line 74
    .line 75
    invoke-virtual {v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_2
    sget-object v0, Lox;->δ:Ljx;

    .line 80
    .line 81
    if-eqz v0, :cond_3

    .line 82
    .line 83
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    new-instance v3, Lorg/json/JSONObject;

    .line 107
    .line 108
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 109
    .line 110
    .line 111
    const-string v4, "className"

    .line 112
    .line 113
    invoke-virtual {v3, v4, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    const-string v3, "fieldName"

    .line 118
    .line 119
    invoke-virtual {v1, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    const-string v2, "fieldType"

    .line 124
    .line 125
    invoke-virtual {v1, v2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    iget-object p0, p0, Lkx;->ε:Ljava/lang/String;

    .line 130
    .line 131
    const-string v1, "data_"

    .line 132
    .line 133
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0, p0, p1}, Ljx;->λ(Ljava/lang/String;Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    :cond_3
    return-void
.end method

.method public static χ(Lkx;Ljava/util/List;)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-object v1, v0, Lkx;->ε:Ljava/lang/String;

    .line 10
    .line 11
    const-string v2, "@"

    .line 12
    .line 13
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    sget-object v2, Lox;->κ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    check-cast v3, Ljava/lang/Iterable;

    .line 27
    .line 28
    new-instance v4, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    const/4 v6, 0x0

    .line 42
    if-eqz v5, :cond_1

    .line 43
    .line 44
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    move-object v7, v5

    .line 49
    check-cast v7, Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-static {v7, v1, v6}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    if-eqz v6, :cond_0

    .line 59
    .line 60
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    if-eqz v3, :cond_2

    .line 73
    .line 74
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    check-cast v3, Ljava/lang/String;

    .line 79
    .line 80
    invoke-virtual {v2, v3}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_2
    sget-object v1, Lox;->δ:Ljx;

    .line 85
    .line 86
    if-eqz v1, :cond_8

    .line 87
    .line 88
    new-instance v2, Ljava/util/HashSet;

    .line 89
    .line 90
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 91
    .line 92
    .line 93
    new-instance v3, Ljava/util/ArrayList;

    .line 94
    .line 95
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 96
    .line 97
    .line 98
    invoke-interface/range {p1 .. p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    const/4 v7, 0x1

    .line 107
    if-eqz v5, :cond_5

    .line 108
    .line 109
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    move-object v8, v5

    .line 114
    check-cast v8, Ljava/lang/reflect/Method;

    .line 115
    .line 116
    invoke-static {v8}, Llz1;->τ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v9

    .line 120
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v10

    .line 124
    invoke-static {v10, v8}, Llz1;->ο(Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v11

    .line 128
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    move-result-object v12

    .line 132
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    new-instance v13, Ljava/util/ArrayList;

    .line 136
    .line 137
    array-length v14, v12

    .line 138
    invoke-direct {v13, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 139
    .line 140
    .line 141
    array-length v14, v12

    .line 142
    move v15, v6

    .line 143
    :goto_3
    if-ge v15, v14, :cond_3

    .line 144
    .line 145
    aget-object v6, v12, v15

    .line 146
    .line 147
    invoke-static {v6, v13, v15, v7}, Llz1;->δ(Ljava/lang/Class;Ljava/util/ArrayList;II)I

    .line 148
    .line 149
    .line 150
    move-result v15

    .line 151
    const/4 v6, 0x0

    .line 152
    goto :goto_3

    .line 153
    :cond_3
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 154
    .line 155
    .line 156
    move-result v6

    .line 157
    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 158
    .line 159
    .line 160
    const/16 v18, 0x0

    .line 161
    .line 162
    const/16 v19, 0x3e

    .line 163
    .line 164
    const-string v14, ","

    .line 165
    .line 166
    const/4 v15, 0x0

    .line 167
    const/16 v16, 0x0

    .line 168
    .line 169
    const/16 v17, 0x0

    .line 170
    .line 171
    invoke-static/range {v13 .. v19}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v6

    .line 175
    const-string v7, "#"

    .line 176
    .line 177
    const-string v8, "("

    .line 178
    .line 179
    invoke-static {v9, v7, v10, v8, v6}, Lnx;->ρ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    move-result-object v6

    .line 183
    const-string v7, "):"

    .line 184
    .line 185
    invoke-static {v6, v7, v11, v2}, Llz1;->Γ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/HashSet;)Z

    .line 186
    .line 187
    .line 188
    move-result v6

    .line 189
    if-eqz v6, :cond_4

    .line 190
    .line 191
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    :cond_4
    const/4 v6, 0x0

    .line 195
    goto :goto_2

    .line 196
    :cond_5
    new-instance v2, Ljava/util/ArrayList;

    .line 197
    .line 198
    const/16 v4, 0xa

    .line 199
    .line 200
    invoke-static {v3, v4}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 201
    .line 202
    .line 203
    move-result v4

    .line 204
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 208
    .line 209
    .line 210
    move-result-object v3

    .line 211
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 212
    .line 213
    .line 214
    move-result v4

    .line 215
    if-eqz v4, :cond_7

    .line 216
    .line 217
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v4

    .line 221
    check-cast v4, Ljava/lang/reflect/Method;

    .line 222
    .line 223
    invoke-static {v4}, Llz1;->τ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v9

    .line 227
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v10

    .line 231
    invoke-static {v10, v4}, Llz1;->ο(Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v11

    .line 235
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    move-result-object v5

    .line 239
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 240
    .line 241
    .line 242
    new-instance v12, Ljava/util/ArrayList;

    .line 243
    .line 244
    array-length v6, v5

    .line 245
    invoke-direct {v12, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 246
    .line 247
    .line 248
    array-length v6, v5

    .line 249
    const/4 v8, 0x0

    .line 250
    :goto_5
    if-ge v8, v6, :cond_6

    .line 251
    .line 252
    aget-object v13, v5, v8

    .line 253
    .line 254
    invoke-static {v13, v12, v8, v7}, Llz1;->δ(Ljava/lang/Class;Ljava/util/ArrayList;II)I

    .line 255
    .line 256
    .line 257
    move-result v8

    .line 258
    goto :goto_5

    .line 259
    :cond_6
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 260
    .line 261
    .line 262
    move-result v4

    .line 263
    invoke-static {v4}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 264
    .line 265
    .line 266
    move-result v13

    .line 267
    new-instance v8, Lsx;

    .line 268
    .line 269
    invoke-direct/range {v8 .. v13}, Lsx;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Z)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 273
    .line 274
    .line 275
    goto :goto_4

    .line 276
    :cond_7
    invoke-virtual {v1, v0, v2}, Ljx;->κ(Lkx;Ljava/util/ArrayList;)V

    .line 277
    .line 278
    .line 279
    :cond_8
    return-void
.end method

.method public static ψ(Ljava/lang/String;Ljava/lang/String;La80;)Ljava/util/concurrent/Future;
    .locals 4

    .line 1
    sget-object v0, Lox;->ν:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lox;->π:Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-virtual {v1, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    check-cast v2, Ljava/util/concurrent/Future;

    .line 11
    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    invoke-interface {v2}, Ljava/util/concurrent/Future;->isDone()Z

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    if-nez v3, :cond_0

    .line 19
    .line 20
    invoke-interface {v2}, Ljava/util/concurrent/Future;->isCancelled()Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-nez v3, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception p0

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    if-eqz v2, :cond_1

    .line 30
    .line 31
    invoke-virtual {v1, p0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    :cond_1
    sget-object v2, Los;->α:Landroid/os/Handler;

    .line 35
    .line 36
    invoke-static {p0, p1}, Los;->ν(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    new-instance v2, Ljava/util/concurrent/FutureTask;

    .line 40
    .line 41
    new-instance v3, Lmx;

    .line 42
    .line 43
    invoke-direct {v3, p0, p1, p2}, Lmx;-><init>(Ljava/lang/String;Ljava/lang/String;La80;)V

    .line 44
    .line 45
    .line 46
    invoke-direct {v2, v3}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1, p0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    sget-object p1, Lox;->ξ:Ljava/util/concurrent/ExecutorService;

    .line 53
    .line 54
    new-instance p2, Lw1;

    .line 55
    .line 56
    const/16 v1, 0xe

    .line 57
    .line 58
    invoke-direct {p2, v2, v1, p0}, Lw1;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    invoke-interface {p1, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    .line 63
    .line 64
    :goto_0
    monitor-exit v0

    .line 65
    return-object v2

    .line 66
    :goto_1
    monitor-exit v0

    .line 67
    throw p0
.end method
