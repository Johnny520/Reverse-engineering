.class public abstract Ltg0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final β:Landroid/os/Handler;

.field public static final γ:Lfb0;


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
    sput-object v0, Ltg0;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    new-instance v0, Landroid/os/HandlerThread;

    .line 10
    .line 11
    const-string v1, "r5df1c9bc692b57df"

    .line 12
    .line 13
    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 17
    .line 18
    .line 19
    new-instance v1, Landroid/os/Handler;

    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-direct {v1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 26
    .line 27
    .line 28
    sput-object v1, Ltg0;->β:Landroid/os/Handler;

    .line 29
    .line 30
    new-instance v0, Lfb0;

    .line 31
    .line 32
    const/4 v1, 0x1

    .line 33
    invoke-direct {v0, v1}, Lfb0;-><init>(I)V

    .line 34
    .line 35
    .line 36
    sput-object v0, Ltg0;->γ:Lfb0;

    .line 37
    .line 38
    return-void
.end method

.method public static α()V
    .locals 3

    .line 1
    invoke-static {}, Lui1;->Α()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_3

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :try_start_0
    const-string v1, "android.app.ActivityThread"

    .line 10
    .line 11
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const-string v2, "currentApplication"

    .line 16
    .line 17
    invoke-virtual {v1, v2, v0}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const/4 v2, 0x1

    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    instance-of v2, v1, Landroid/app/Application;

    .line 30
    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    check-cast v1, Landroid/app/Application;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :catchall_0
    move-exception v1

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    move-object v1, v0

    .line 39
    goto :goto_1

    .line 40
    :goto_0
    new-instance v2, Leo1;

    .line 41
    .line 42
    invoke-direct {v2, v1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 43
    .line 44
    .line 45
    move-object v1, v2

    .line 46
    :goto_1
    instance-of v2, v1, Leo1;

    .line 47
    .line 48
    if-eqz v2, :cond_2

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_2
    move-object v0, v1

    .line 52
    :goto_2
    check-cast v0, Landroid/app/Application;

    .line 53
    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    invoke-static {v0}, Lui1;->π(Landroid/content/Context;)V

    .line 57
    .line 58
    .line 59
    :cond_3
    :goto_3
    return-void
.end method

.method public static β()V
    .locals 10

    .line 1
    invoke-static {}, Ltg0;->α()V

    .line 2
    .line 3
    .line 4
    const-string v0, "im_auto_read_include_interactive"

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    :try_start_0
    invoke-static {}, Ltg0;->α()V

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 11
    .line 12
    .line 13
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    move v0, v1

    .line 16
    :goto_0
    const-string v2, "im_auto_read_filter_mode"

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    :try_start_1
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-interface {v4, v2, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 24
    .line 25
    .line 26
    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 27
    goto :goto_1

    .line 28
    :catchall_1
    move v2, v3

    .line 29
    :goto_1
    sget-object v4, Lck0;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 30
    .line 31
    const-string v4, "im_auto_read_filter_rules"

    .line 32
    .line 33
    const-string v5, ""

    .line 34
    .line 35
    invoke-static {v4, v5}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    invoke-static {v4}, Lck0;->ζ(Ljava/lang/String;)Ljava/util/Set;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    sget-object v5, Lzj0;->α:Lzj0;

    .line 44
    .line 45
    const-string v6, "\u9759\u9ed8\u4e00\u952e\u5df2\u8bfb\u5931\u8d25\uff1a"

    .line 46
    .line 47
    const-string v7, "\u9759\u9ed8\u4e00\u952e\u5df2\u8bfb\u5931\u8d25: "

    .line 48
    .line 49
    sget-object v8, Lzj0;->ζ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 50
    .line 51
    invoke-virtual {v8, v3, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    const/4 v9, 0x0

    .line 56
    if-nez v1, :cond_0

    .line 57
    .line 58
    new-instance v0, Lyj0;

    .line 59
    .line 60
    const-string v1, "\u5df2\u8bfb\u4efb\u52a1\u6b63\u5728\u6267\u884c"

    .line 61
    .line 62
    invoke-direct {v0, v3, v1, v9}, Lyj0;-><init>(ZLjava/lang/String;Ljava/lang/Throwable;)V

    .line 63
    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_0
    sget-object v1, Lzj0;->δ:Ljava/lang/ClassLoader;

    .line 67
    .line 68
    if-nez v1, :cond_1

    .line 69
    .line 70
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-virtual {v1}, Ljava/lang/Thread;->getContextClassLoader()Ljava/lang/ClassLoader;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    :cond_1
    if-nez v1, :cond_2

    .line 79
    .line 80
    invoke-virtual {v8, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 81
    .line 82
    .line 83
    new-instance v0, Lyj0;

    .line 84
    .line 85
    const-string v1, "ClassLoader \u4e0d\u53ef\u7528"

    .line 86
    .line 87
    invoke-direct {v0, v3, v1, v9}, Lyj0;-><init>(ZLjava/lang/String;Ljava/lang/Throwable;)V

    .line 88
    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_2
    invoke-virtual {v5, v1}, Lzj0;->κ(Ljava/lang/ClassLoader;)V

    .line 92
    .line 93
    .line 94
    :try_start_2
    invoke-virtual {v5, v1, v0, v2, v4}, Lzj0;->ε(Ljava/lang/ClassLoader;ZILjava/util/Set;)Lyj0;

    .line 95
    .line 96
    .line 97
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 98
    invoke-virtual {v8, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 99
    .line 100
    .line 101
    goto :goto_2

    .line 102
    :catchall_2
    move-exception v0

    .line 103
    :try_start_3
    invoke-static {v0}, Lzj0;->Η(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    const-string v1, "DYHelperIMMarkAllReadHelper"

    .line 108
    .line 109
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    new-instance v4, Ljava/lang/StringBuilder;

    .line 114
    .line 115
    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    invoke-static {v1, v2, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 126
    .line 127
    .line 128
    new-instance v1, Lyj0;

    .line 129
    .line 130
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    new-instance v4, Ljava/lang/StringBuilder;

    .line 135
    .line 136
    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    invoke-direct {v1, v3, v2, v0}, Lyj0;-><init>(ZLjava/lang/String;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 147
    .line 148
    .line 149
    sget-object v0, Lzj0;->ζ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 150
    .line 151
    invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 152
    .line 153
    .line 154
    move-object v0, v1

    .line 155
    :goto_2
    iget-boolean v1, v0, Lyj0;->α:Z

    .line 156
    .line 157
    iget-object v0, v0, Lyj0;->β:Ljava/lang/String;

    .line 158
    .line 159
    new-instance v2, Ljava/lang/StringBuilder;

    .line 160
    .line 161
    const-string v3, "\u5b9a\u65f6\u5df2\u8bfb\u5b8c\u6210 success="

    .line 162
    .line 163
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    const-string v1, ", msg="

    .line 170
    .line 171
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    const/4 v1, 0x4

    .line 182
    const-string v2, "DYHelper"

    .line 183
    .line 184
    invoke-static {v2, v0, v9, v1, v9}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    return-void

    .line 188
    :catchall_3
    move-exception v0

    .line 189
    sget-object v1, Lzj0;->ζ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 190
    .line 191
    invoke-virtual {v1, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 192
    .line 193
    .line 194
    throw v0
.end method

.method public static γ()V
    .locals 5

    .line 1
    const-string v0, "im_auto_read_interval_minutes"

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    :try_start_0
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 10
    .line 11
    .line 12
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    :catchall_0
    const/4 v0, 0x1

    .line 14
    const/16 v2, 0x5a0

    .line 15
    .line 16
    invoke-static {v1, v0, v2}, Lj81;->μ(III)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const-string v1, "im_auto_read_enabled"

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    :try_start_1
    invoke-static {}, Ltg0;->α()V

    .line 24
    .line 25
    .line 26
    invoke-static {v1, v2}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 27
    .line 28
    .line 29
    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 30
    :catchall_1
    const-wide/32 v3, 0xea60

    .line 31
    .line 32
    .line 33
    if-eqz v2, :cond_0

    .line 34
    .line 35
    int-to-long v0, v0

    .line 36
    mul-long/2addr v3, v0

    .line 37
    :cond_0
    sget-object v0, Ltg0;->β:Landroid/os/Handler;

    .line 38
    .line 39
    sget-object v1, Ltg0;->γ:Lfb0;

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v1, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 45
    .line 46
    .line 47
    return-void
.end method
