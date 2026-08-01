.class public final Lmd2;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Ljava/lang/Object;

.field public static final β:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static volatile γ:Ljx;

.field public static volatile δ:Lnd2;

.field public static volatile ε:Ljava/lang/ClassLoader;

.field public static final ζ:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final η:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final θ:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lmd2;->α:Ljava/lang/Object;

    .line 7
    .line 8
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lmd2;->β:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 15
    .line 16
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 19
    .line 20
    .line 21
    sput-object v0, Lmd2;->ζ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 22
    .line 23
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 26
    .line 27
    .line 28
    sput-object v0, Lmd2;->η:Ljava/util/concurrent/ConcurrentHashMap;

    .line 29
    .line 30
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 31
    .line 32
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lmd2;->θ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 36
    .line 37
    return-void
.end method

.method public static α(Landroid/content/Context;Lz81;)V
    .locals 14

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
    move-object v1, p0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object v1, v0

    .line 10
    :goto_0
    :try_start_0
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {p0, v0, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 20
    .line 21
    .line 22
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    goto :goto_1

    .line 24
    :catchall_0
    move-exception v0

    .line 25
    move-object p0, v0

    .line 26
    new-instance v0, Leo1;

    .line 27
    .line 28
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    move-object p0, v0

    .line 32
    :goto_1
    instance-of v0, p0, Leo1;

    .line 33
    .line 34
    const/4 v2, 0x0

    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    move-object p0, v2

    .line 38
    :cond_1
    check-cast p0, Landroid/content/pm/PackageInfo;

    .line 39
    .line 40
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const-string v3, ""

    .line 45
    .line 46
    if-eqz v0, :cond_3

    .line 47
    .line 48
    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 49
    .line 50
    if-nez v0, :cond_2

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_2
    move-object v4, v0

    .line 54
    goto :goto_4

    .line 55
    :cond_3
    :goto_2
    iget-object v0, p1, Lz81;->δ:Landroid/content/pm/ApplicationInfo;

    .line 56
    .line 57
    if-eqz v0, :cond_4

    .line 58
    .line 59
    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 60
    .line 61
    goto :goto_3

    .line 62
    :cond_4
    move-object v0, v2

    .line 63
    :goto_3
    if-nez v0, :cond_2

    .line 64
    .line 65
    move-object v4, v3

    .line 66
    :goto_4
    :try_start_1
    invoke-virtual {v1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 67
    .line 68
    .line 69
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 70
    goto :goto_5

    .line 71
    :catchall_1
    move-exception v0

    .line 72
    new-instance v5, Leo1;

    .line 73
    .line 74
    invoke-direct {v5, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 75
    .line 76
    .line 77
    move-object v0, v5

    .line 78
    :goto_5
    instance-of v5, v0, Leo1;

    .line 79
    .line 80
    if-eqz v5, :cond_5

    .line 81
    .line 82
    move-object v0, v2

    .line 83
    :cond_5
    check-cast v0, Ljava/lang/ClassLoader;

    .line 84
    .line 85
    if-nez v0, :cond_6

    .line 86
    .line 87
    iget-object v0, p1, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 88
    .line 89
    :cond_6
    move-object v9, v0

    .line 90
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 95
    .line 96
    .line 97
    move-result v5

    .line 98
    if-eqz v5, :cond_7

    .line 99
    .line 100
    iget-object v0, p1, Lz81;->α:Ljava/lang/String;

    .line 101
    .line 102
    :cond_7
    move-object p1, v0

    .line 103
    const-wide/16 v5, 0x0

    .line 104
    .line 105
    if-eqz p0, :cond_8

    .line 106
    .line 107
    invoke-virtual {p0}, Landroid/content/pm/PackageInfo;->getLongVersionCode()J

    .line 108
    .line 109
    .line 110
    move-result-wide v7

    .line 111
    goto :goto_6

    .line 112
    :cond_8
    move-wide v7, v5

    .line 113
    :goto_6
    if-eqz p0, :cond_9

    .line 114
    .line 115
    iget-object v2, p0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 116
    .line 117
    :cond_9
    if-nez v2, :cond_a

    .line 118
    .line 119
    goto :goto_7

    .line 120
    :cond_a
    move-object v3, v2

    .line 121
    :goto_7
    if-eqz p0, :cond_b

    .line 122
    .line 123
    iget-wide v5, p0, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    .line 124
    .line 125
    goto :goto_9

    .line 126
    :cond_b
    :try_start_2
    new-instance p0, Ljava/io/File;

    .line 127
    .line 128
    invoke-direct {p0, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0}, Ljava/io/File;->lastModified()J

    .line 132
    .line 133
    .line 134
    move-result-wide v10

    .line 135
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 136
    .line 137
    .line 138
    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 139
    goto :goto_8

    .line 140
    :catchall_2
    move-exception v0

    .line 141
    move-object p0, v0

    .line 142
    new-instance v0, Leo1;

    .line 143
    .line 144
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 145
    .line 146
    .line 147
    move-object p0, v0

    .line 148
    :goto_8
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    instance-of v2, p0, Leo1;

    .line 153
    .line 154
    if-eqz v2, :cond_c

    .line 155
    .line 156
    move-object p0, v0

    .line 157
    :cond_c
    check-cast p0, Ljava/lang/Number;

    .line 158
    .line 159
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 160
    .line 161
    .line 162
    move-result-wide v5

    .line 163
    :goto_9
    const-string v10, "1.4.15"

    .line 164
    .line 165
    move-wide v12, v5

    .line 166
    move-object v6, v3

    .line 167
    move-object v3, v4

    .line 168
    move-wide v4, v7

    .line 169
    move-wide v7, v12

    .line 170
    move-object v2, p1

    .line 171
    invoke-static/range {v1 .. v10}, Lmd2;->β(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JLjava/lang/ClassLoader;Ljava/lang/String;)Z

    .line 172
    .line 173
    .line 174
    return-void
.end method

.method public static β(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JLjava/lang/ClassLoader;Ljava/lang/String;)Z
    .locals 14

    .line 1
    move-object/from16 v0, p8

    .line 2
    .line 3
    sget-object v1, Lox;->α:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static/range {p2 .. p2}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const/4 v3, 0x0

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    const-string p0, "forwarding runtime init skipped, host apk path is blank"

    .line 24
    .line 25
    invoke-static {p0}, Lox;->ξ(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    return v3

    .line 29
    :cond_0
    sget-object v2, Lox;->α:Ljava/lang/Object;

    .line 30
    .line 31
    monitor-enter v2

    .line 32
    :try_start_0
    sget-object v4, Lox;->ζ:Ljava/lang/String;

    .line 33
    .line 34
    invoke-static {v4, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-eqz v4, :cond_1

    .line 39
    .line 40
    sget-object v4, Lox;->η:Ljava/lang/ClassLoader;

    .line 41
    .line 42
    if-eq v4, v0, :cond_2

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :catchall_0
    move-exception v0

    .line 46
    move-object p0, v0

    .line 47
    goto/16 :goto_4

    .line 48
    .line 49
    :cond_1
    :goto_0
    invoke-static {}, Lox;->β()V

    .line 50
    .line 51
    .line 52
    const-string v4, "forwarding runtime changed"

    .line 53
    .line 54
    invoke-static {v4}, Lox;->γ(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    :cond_2
    sput-object v1, Lox;->ζ:Ljava/lang/String;

    .line 58
    .line 59
    sput-object v0, Lox;->η:Ljava/lang/ClassLoader;

    .line 60
    .line 61
    sget-object v1, Lox;->ι:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 62
    .line 63
    const/4 v4, 0x1

    .line 64
    invoke-virtual {v1, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    .line 66
    .line 67
    monitor-exit v2

    .line 68
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    const-string v2, "forwarding runtime initialized, loader="

    .line 77
    .line 78
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-static {v1}, Lox;->ξ(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    new-instance v5, Lnd2;

    .line 86
    .line 87
    move-object v6, p1

    .line 88
    move-object/from16 v10, p2

    .line 89
    .line 90
    move-wide/from16 v7, p3

    .line 91
    .line 92
    move-object/from16 v9, p5

    .line 93
    .line 94
    move-wide/from16 v11, p6

    .line 95
    .line 96
    move-object/from16 v13, p9

    .line 97
    .line 98
    invoke-direct/range {v5 .. v13}, Lnd2;-><init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;JLjava/lang/String;)V

    .line 99
    .line 100
    .line 101
    sget-object v1, Lmd2;->α:Ljava/lang/Object;

    .line 102
    .line 103
    monitor-enter v1

    .line 104
    :try_start_1
    sget-object v2, Lmd2;->δ:Lnd2;

    .line 105
    .line 106
    invoke-static {v2, v5}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    sget-object v7, Lmd2;->ε:Ljava/lang/ClassLoader;

    .line 111
    .line 112
    if-eq v7, v0, :cond_3

    .line 113
    .line 114
    move v3, v4

    .line 115
    :cond_3
    if-eqz v2, :cond_4

    .line 116
    .line 117
    if-eqz v3, :cond_5

    .line 118
    .line 119
    :cond_4
    sget-object v3, Lmd2;->ζ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 120
    .line 121
    invoke-virtual {v3}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 122
    .line 123
    .line 124
    sget-object v3, Lmd2;->η:Ljava/util/concurrent/ConcurrentHashMap;

    .line 125
    .line 126
    invoke-virtual {v3}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 127
    .line 128
    .line 129
    sget-object v3, Lmd2;->θ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 130
    .line 131
    invoke-virtual {v3}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 132
    .line 133
    .line 134
    sget-object v3, Lld2;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 135
    .line 136
    invoke-virtual {v3}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 137
    .line 138
    .line 139
    sget-object v3, Lld2;->β:Ljava/util/Set;

    .line 140
    .line 141
    invoke-interface {v3}, Ljava/util/Set;->clear()V

    .line 142
    .line 143
    .line 144
    :cond_5
    if-nez v2, :cond_6

    .line 145
    .line 146
    const/4 v2, 0x0

    .line 147
    sput-object v2, Lmd2;->γ:Ljx;

    .line 148
    .line 149
    goto :goto_1

    .line 150
    :catchall_1
    move-exception v0

    .line 151
    move-object p0, v0

    .line 152
    goto :goto_3

    .line 153
    :cond_6
    :goto_1
    if-eqz p0, :cond_8

    .line 154
    .line 155
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    if-nez v2, :cond_7

    .line 160
    .line 161
    goto :goto_2

    .line 162
    :cond_7
    move-object p0, v2

    .line 163
    :cond_8
    :goto_2
    if-eqz p0, :cond_a

    .line 164
    .line 165
    sget-object v2, Lmd2;->γ:Ljx;

    .line 166
    .line 167
    if-nez v2, :cond_9

    .line 168
    .line 169
    new-instance v2, Ljx;

    .line 170
    .line 171
    invoke-direct {v2, p0, v4}, Ljx;-><init>(Landroid/content/Context;I)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v2, v5}, Ljx;->β(Lnd2;)V

    .line 175
    .line 176
    .line 177
    :cond_9
    sput-object v2, Lmd2;->γ:Ljx;

    .line 178
    .line 179
    :cond_a
    sput-object v5, Lmd2;->δ:Lnd2;

    .line 180
    .line 181
    sput-object v0, Lmd2;->ε:Ljava/lang/ClassLoader;

    .line 182
    .line 183
    sget-object p0, Lmd2;->β:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 184
    .line 185
    invoke-virtual {p0, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 186
    .line 187
    .line 188
    monitor-exit v1

    .line 189
    const-string p0, "XHSHelper-DexKit"

    .line 190
    .line 191
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    const-string v1, "initialized host="

    .line 200
    .line 201
    const-string v2, "/"

    .line 202
    .line 203
    move-wide/from16 v7, p3

    .line 204
    .line 205
    invoke-static {v1, p1, v7, v8, v2}, Lnx;->π(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    const-string v1, "/"

    .line 210
    .line 211
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    move-object/from16 v9, p5

    .line 215
    .line 216
    invoke-virtual {p1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    const-string v1, ", loader="

    .line 220
    .line 221
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    invoke-static {p0, p1}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    return v4

    .line 235
    :goto_3
    monitor-exit v1

    .line 236
    throw p0

    .line 237
    :goto_4
    monitor-exit v2

    .line 238
    throw p0
.end method
