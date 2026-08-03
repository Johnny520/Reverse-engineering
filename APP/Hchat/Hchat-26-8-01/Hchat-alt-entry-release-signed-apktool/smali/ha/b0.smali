.class public final Lha/b0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lab/b;

.field public final b:Landroid/content/Context;

.field public final c:Landroid/content/SharedPreferences;

.field public final d:Landroid/os/Handler;

.field public final e:Ljava/util/concurrent/ExecutorService;

.field public final f:Ljava/util/LinkedHashSet;

.field public final g:Ljava/util/LinkedHashMap;

.field public volatile h:Ljava/lang/String;

.field public i:Z

.field public final j:Lb9/b;


# direct methods
.method public constructor <init>(Lr8/g;Lab/b;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lha/b0;->a:Lab/b;

    .line 8
    .line 9
    iget-object p1, p1, Lr8/g;->a:Landroid/content/Context;

    .line 10
    .line 11
    iput-object p1, p0, Lha/b0;->b:Landroid/content/Context;

    .line 12
    .line 13
    const-string p2, "Hchat_moments_post_notification_config"

    .line 14
    .line 15
    invoke-static {p1, p2}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, Lha/b0;->c:Landroid/content/SharedPreferences;

    .line 20
    .line 21
    new-instance p2, Landroid/os/Handler;

    .line 22
    .line 23
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-direct {p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 28
    .line 29
    .line 30
    iput-object p2, p0, Lha/b0;->d:Landroid/os/Handler;

    .line 31
    .line 32
    new-instance p2, Lc9/q;

    .line 33
    .line 34
    const/16 v0, 0xe

    .line 35
    .line 36
    invoke-direct {p2, v0}, Lc9/q;-><init>(I)V

    .line 37
    .line 38
    .line 39
    invoke-static {p2}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    iput-object p2, p0, Lha/b0;->e:Ljava/util/concurrent/ExecutorService;

    .line 44
    .line 45
    new-instance p2, Ljava/util/LinkedHashSet;

    .line 46
    .line 47
    invoke-direct {p2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 48
    .line 49
    .line 50
    iput-object p2, p0, Lha/b0;->f:Ljava/util/LinkedHashSet;

    .line 51
    .line 52
    new-instance p2, Ljava/util/LinkedHashMap;

    .line 53
    .line 54
    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 55
    .line 56
    .line 57
    iput-object p2, p0, Lha/b0;->g:Ljava/util/LinkedHashMap;

    .line 58
    .line 59
    const-string p2, "enable"

    .line 60
    .line 61
    const/4 v0, 0x0

    .line 62
    invoke-interface {p1, p2, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    iput-boolean p1, p0, Lha/b0;->i:Z

    .line 67
    .line 68
    new-instance p1, Lb9/b;

    .line 69
    .line 70
    const/4 p2, 0x7

    .line 71
    invoke-direct {p1, p0, p2}, Lb9/b;-><init>(Ljava/lang/Object;I)V

    .line 72
    .line 73
    .line 74
    iput-object p1, p0, Lha/b0;->j:Lb9/b;

    .line 75
    .line 76
    return-void
.end method

.method public static a(Lha/c0;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "%sender%"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {p1, v0, p2, v1}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    const-string p2, "%wxid%"

    .line 9
    .line 10
    iget-object v0, p0, Lha/c0;->c:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {p1, p2, v0, v1}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iget-object p2, p0, Lha/c0;->e:Lha/d0;

    .line 17
    .line 18
    iget-object p2, p2, Lha/d0;->g:Ljava/lang/String;

    .line 19
    .line 20
    const-string v0, "%type%"

    .line 21
    .line 22
    invoke-static {p1, v0, p2, v1}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    const-string p2, "%content%"

    .line 27
    .line 28
    iget-object v0, p0, Lha/c0;->f:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {p1, p2, v0, v1}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    const-string p2, "%snsid%"

    .line 35
    .line 36
    iget-object p0, p0, Lha/c0;->a:Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {p1, p2, p0, v1}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0
.end method


# virtual methods
.method public final b(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 10

    .line 1
    iget-object v0, p0, Lha/b0;->h:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    goto/16 :goto_6

    .line 7
    .line 8
    :cond_0
    sget-object v0, Ltf/t;->g:Ltf/t;

    .line 9
    .line 10
    :try_start_0
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->database()Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    if-eqz v2, :cond_1

    .line 15
    .line 16
    const-string v3, "PRAGMA database_list"

    .line 17
    .line 18
    invoke-virtual {v2, v3, v1}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->query(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception v2

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    move-object v2, v1

    .line 26
    :goto_0
    if-nez v2, :cond_2

    .line 27
    .line 28
    move-object v2, v0

    .line 29
    goto :goto_2

    .line 30
    :goto_1
    new-instance v3, Lsf/f;

    .line 31
    .line 32
    invoke-direct {v3, v2}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 33
    .line 34
    .line 35
    move-object v2, v3

    .line 36
    :cond_2
    :goto_2
    nop

    .line 37
    instance-of v3, v2, Lsf/f;

    .line 38
    .line 39
    if-eqz v3, :cond_3

    .line 40
    .line 41
    goto :goto_3

    .line 42
    :cond_3
    move-object v0, v2

    .line 43
    :goto_3
    check-cast v0, Ljava/util/List;

    .line 44
    .line 45
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-eqz v2, :cond_7

    .line 54
    .line 55
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    check-cast v2, Ljava/util/Map;

    .line 60
    .line 61
    new-instance v3, Ljava/io/File;

    .line 62
    .line 63
    const-string v4, "file"

    .line 64
    .line 65
    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    if-eqz v2, :cond_5

    .line 70
    .line 71
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    goto :goto_4

    .line 76
    :cond_5
    move-object v2, v1

    .line 77
    :goto_4
    if-nez v2, :cond_6

    .line 78
    .line 79
    const-string v2, ""

    .line 80
    .line 81
    :cond_6
    invoke-direct {v3, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v3}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    if-eqz v2, :cond_4

    .line 89
    .line 90
    new-instance v3, Ljava/io/File;

    .line 91
    .line 92
    const-string v4, "avatar"

    .line 93
    .line 94
    invoke-direct {v3, v2, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v3}, Ljava/io/File;->isDirectory()Z

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    if-eqz v2, :cond_4

    .line 102
    .line 103
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    goto :goto_5

    .line 108
    :cond_7
    move-object v0, v1

    .line 109
    :goto_5
    iput-object v0, p0, Lha/b0;->h:Ljava/lang/String;

    .line 110
    .line 111
    if-eqz v0, :cond_b

    .line 112
    .line 113
    :goto_6
    const/4 v2, 0x0

    .line 114
    const/4 v3, 0x2

    .line 115
    :try_start_1
    const-string v4, "MD5"

    .line 116
    .line 117
    invoke-static {v4}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    sget-object v5, Log/a;->a:Ljava/nio/charset/Charset;

    .line 122
    .line 123
    invoke-virtual {p1, v5}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v4, p1}, Ljava/security/MessageDigest;->digest([B)[B

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    array-length v4, p1

    .line 135
    mul-int/2addr v4, v3

    .line 136
    new-instance v5, Ljava/lang/StringBuilder;

    .line 137
    .line 138
    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 139
    .line 140
    .line 141
    array-length v4, p1

    .line 142
    move v6, v2

    .line 143
    :goto_7
    if-lt v6, v4, :cond_8

    .line 144
    .line 145
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    goto :goto_9

    .line 150
    :catchall_1
    move-exception p1

    .line 151
    goto :goto_8

    .line 152
    :cond_8
    aget-byte v7, p1, v6

    .line 153
    .line 154
    ushr-int/lit8 v8, v7, 0x4

    .line 155
    .line 156
    and-int/lit8 v8, v8, 0xf

    .line 157
    .line 158
    const/16 v9, 0x10

    .line 159
    .line 160
    invoke-static {v9}, La/a;->w(I)V

    .line 161
    .line 162
    .line 163
    invoke-static {v8, v9}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v8

    .line 167
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    and-int/lit8 v7, v7, 0xf

    .line 174
    .line 175
    invoke-static {v9}, La/a;->w(I)V

    .line 176
    .line 177
    .line 178
    invoke-static {v7, v9}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v7

    .line 182
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 186
    .line 187
    .line 188
    add-int/lit8 v6, v6, 0x1

    .line 189
    .line 190
    goto :goto_7

    .line 191
    :goto_8
    new-instance v4, Lsf/f;

    .line 192
    .line 193
    invoke-direct {v4, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 194
    .line 195
    .line 196
    move-object p1, v4

    .line 197
    :goto_9
    nop

    .line 198
    instance-of v4, p1, Lsf/f;

    .line 199
    .line 200
    if-eqz v4, :cond_9

    .line 201
    .line 202
    move-object p1, v1

    .line 203
    :cond_9
    check-cast p1, Ljava/lang/String;

    .line 204
    .line 205
    if-eqz p1, :cond_b

    .line 206
    .line 207
    new-instance v4, Ljava/lang/StringBuilder;

    .line 208
    .line 209
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 210
    .line 211
    .line 212
    const/4 v5, 0x1

    .line 213
    new-array v5, v5, [C

    .line 214
    .line 215
    const/16 v6, 0x2f

    .line 216
    .line 217
    aput-char v6, v5, v2

    .line 218
    .line 219
    invoke-static {v0, v5}, Log/m;->U0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 227
    .line 228
    .line 229
    invoke-virtual {p1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    const/4 v0, 0x4

    .line 240
    invoke-virtual {p1, v3, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    const-string v0, "/user_"

    .line 248
    .line 249
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    if-eqz p2, :cond_a

    .line 253
    .line 254
    const-string p2, "hd_"

    .line 255
    .line 256
    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 257
    .line 258
    .line 259
    :cond_a
    const-string p2, ".png"

    .line 260
    .line 261
    invoke-static {v4, p1, p2}, Leh/a;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object p1

    .line 265
    invoke-static {p1}, Leh/a;->y(Ljava/lang/String;)Z

    .line 266
    .line 267
    .line 268
    move-result p2

    .line 269
    if-eqz p2, :cond_b

    .line 270
    .line 271
    move-object v1, p1

    .line 272
    :cond_b
    return-object v1
.end method

.method public final c(Lha/c0;Ljava/lang/String;Ljava/lang/String;)V
    .locals 11

    .line 1
    iget-object v0, p0, Lha/b0;->b:Landroid/content/Context;

    .line 2
    .line 3
    const-string v1, "notification"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    instance-of v1, v0, Landroid/app/NotificationManager;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    check-cast v0, Landroid/app/NotificationManager;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-object v0, v2

    .line 18
    :goto_0
    if-eqz v0, :cond_17

    .line 19
    .line 20
    const-string v1, "hchat_moments_post_v2"

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->getNotificationChannel(Ljava/lang/String;)Landroid/app/NotificationChannel;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    const/4 v3, 0x1

    .line 27
    if-nez v1, :cond_1

    .line 28
    .line 29
    new-instance v1, Landroid/app/NotificationChannel;

    .line 30
    .line 31
    const-string v4, "hchat_moments_post_v2"

    .line 32
    .line 33
    const-string v5, "\u670b\u53cb\u5708\u53d1\u5e03\u901a\u77e5"

    .line 34
    .line 35
    const/4 v6, 0x4

    .line 36
    invoke-direct {v1, v4, v5, v6}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, v3}, Landroid/app/NotificationChannel;->enableVibration(Z)V

    .line 40
    .line 41
    .line 42
    new-array v4, v6, [J

    .line 43
    .line 44
    fill-array-data v4, :array_0

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, v4}, Landroid/app/NotificationChannel;->setVibrationPattern([J)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    .line 51
    .line 52
    .line 53
    :cond_1
    new-instance v1, Landroid/app/Notification$Builder;

    .line 54
    .line 55
    iget-object v4, p0, Lha/b0;->b:Landroid/content/Context;

    .line 56
    .line 57
    const-string v5, "hchat_moments_post_v2"

    .line 58
    .line 59
    invoke-direct {v1, v4, v5}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    const v4, 0x1080077

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, v4}, Landroid/app/Notification$Builder;->setSmallIcon(I)Landroid/app/Notification$Builder;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    invoke-virtual {v4, p2}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    invoke-virtual {v4, p3}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    new-instance v5, Landroid/app/Notification$BigTextStyle;

    .line 78
    .line 79
    invoke-direct {v5}, Landroid/app/Notification$BigTextStyle;-><init>()V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v5, p3}, Landroid/app/Notification$BigTextStyle;->bigText(Ljava/lang/CharSequence;)Landroid/app/Notification$BigTextStyle;

    .line 83
    .line 84
    .line 85
    move-result-object p3

    .line 86
    invoke-virtual {p3, p2}, Landroid/app/Notification$BigTextStyle;->setBigContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$BigTextStyle;

    .line 87
    .line 88
    .line 89
    move-result-object p2

    .line 90
    const-string p3, "\u670b\u53cb\u5708\u901a\u77e5"

    .line 91
    .line 92
    invoke-virtual {p2, p3}, Landroid/app/Notification$BigTextStyle;->setSummaryText(Ljava/lang/CharSequence;)Landroid/app/Notification$BigTextStyle;

    .line 93
    .line 94
    .line 95
    move-result-object p2

    .line 96
    invoke-virtual {v4, p2}, Landroid/app/Notification$Builder;->setStyle(Landroid/app/Notification$Style;)Landroid/app/Notification$Builder;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 101
    .line 102
    .line 103
    move-result-wide v4

    .line 104
    invoke-virtual {p2, v4, v5}, Landroid/app/Notification$Builder;->setWhen(J)Landroid/app/Notification$Builder;

    .line 105
    .line 106
    .line 107
    move-result-object p2

    .line 108
    invoke-virtual {p2, v3}, Landroid/app/Notification$Builder;->setShowWhen(Z)Landroid/app/Notification$Builder;

    .line 109
    .line 110
    .line 111
    move-result-object p2

    .line 112
    invoke-virtual {p2, v3}, Landroid/app/Notification$Builder;->setAutoCancel(Z)Landroid/app/Notification$Builder;

    .line 113
    .line 114
    .line 115
    move-result-object p2

    .line 116
    const/4 p3, 0x0

    .line 117
    invoke-virtual {p2, p3}, Landroid/app/Notification$Builder;->setOnlyAlertOnce(Z)Landroid/app/Notification$Builder;

    .line 118
    .line 119
    .line 120
    move-result-object p2

    .line 121
    const/4 v4, -0x1

    .line 122
    invoke-virtual {p2, v4}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;

    .line 123
    .line 124
    .line 125
    move-result-object p2

    .line 126
    const-string v4, "msg"

    .line 127
    .line 128
    invoke-virtual {p2, v4}, Landroid/app/Notification$Builder;->setCategory(Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 129
    .line 130
    .line 131
    move-result-object p2

    .line 132
    invoke-virtual {p2, v3}, Landroid/app/Notification$Builder;->setPriority(I)Landroid/app/Notification$Builder;

    .line 133
    .line 134
    .line 135
    move-result-object p2

    .line 136
    invoke-virtual {p2, p3}, Landroid/app/Notification$Builder;->setVisibility(I)Landroid/app/Notification$Builder;

    .line 137
    .line 138
    .line 139
    move-result-object p2

    .line 140
    iget-object v4, p1, Lha/c0;->a:Ljava/lang/String;

    .line 141
    .line 142
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 143
    .line 144
    .line 145
    move-result v4

    .line 146
    new-instance v5, Landroid/content/Intent;

    .line 147
    .line 148
    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 149
    .line 150
    .line 151
    new-instance v6, Landroid/content/ComponentName;

    .line 152
    .line 153
    iget-object v7, p0, Lha/b0;->b:Landroid/content/Context;

    .line 154
    .line 155
    invoke-virtual {v7}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v8

    .line 159
    const-string v9, "com.tencent.mm.ui.LauncherUI"

    .line 160
    .line 161
    invoke-direct {v6, v8, v9}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v5, v6}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 165
    .line 166
    .line 167
    const/high16 v6, 0x34000000

    .line 168
    .line 169
    invoke-virtual {v5, v6}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 170
    .line 171
    .line 172
    new-instance v6, Landroid/content/Intent;

    .line 173
    .line 174
    invoke-direct {v6}, Landroid/content/Intent;-><init>()V

    .line 175
    .line 176
    .line 177
    new-instance v8, Landroid/content/ComponentName;

    .line 178
    .line 179
    invoke-virtual {v7}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v9

    .line 183
    const-string v10, "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI"

    .line 184
    .line 185
    invoke-direct {v8, v9, v10}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v6, v8}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 189
    .line 190
    .line 191
    const/high16 v8, 0x24000000

    .line 192
    .line 193
    invoke-virtual {v6, v8}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 194
    .line 195
    .line 196
    const/high16 v8, 0xc000000

    .line 197
    .line 198
    filled-new-array {v5, v6}, [Landroid/content/Intent;

    .line 199
    .line 200
    .line 201
    move-result-object v5

    .line 202
    invoke-static {v7, v4, v5, v8}, Landroid/app/PendingIntent;->getActivities(Landroid/content/Context;I[Landroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 203
    .line 204
    .line 205
    move-result-object v4

    .line 206
    invoke-virtual {p2, v4}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    .line 207
    .line 208
    .line 209
    iget-object p2, p1, Lha/c0;->c:Ljava/lang/String;

    .line 210
    .line 211
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 212
    .line 213
    .line 214
    move-result v4

    .line 215
    if-eqz v4, :cond_2

    .line 216
    .line 217
    goto/16 :goto_d

    .line 218
    .line 219
    :cond_2
    iget-object v4, p0, Lha/b0;->b:Landroid/content/Context;

    .line 220
    .line 221
    const-string v5, "Hchat_custom_friend_avatar_config"

    .line 222
    .line 223
    invoke-static {v4, v5}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 224
    .line 225
    .line 226
    move-result-object v5

    .line 227
    const-string v6, "enable"

    .line 228
    .line 229
    invoke-interface {v5, v6, p3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 230
    .line 231
    .line 232
    move-result v5

    .line 233
    if-eqz v5, :cond_3

    .line 234
    .line 235
    const-string v5, "Hchat_custom_friend_avatar_config"

    .line 236
    .line 237
    invoke-static {v4, v5}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 238
    .line 239
    .line 240
    move-result-object v4

    .line 241
    const-string v5, "scope_moments_notifications"

    .line 242
    .line 243
    invoke-interface {v4, v5, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 244
    .line 245
    .line 246
    move-result v4

    .line 247
    if-eqz v4, :cond_3

    .line 248
    .line 249
    iget-object v4, p0, Lha/b0;->b:Landroid/content/Context;

    .line 250
    .line 251
    invoke-static {v4, p2}, Ld9/o;->e(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 252
    .line 253
    .line 254
    move-result-object v4

    .line 255
    if-eqz v4, :cond_3

    .line 256
    .line 257
    :goto_1
    move-object v2, v4

    .line 258
    goto/16 :goto_d

    .line 259
    .line 260
    :cond_3
    iget-object v4, p0, Lha/b0;->g:Ljava/util/LinkedHashMap;

    .line 261
    .line 262
    monitor-enter v4

    .line 263
    :try_start_0
    iget-object v5, p0, Lha/b0;->g:Ljava/util/LinkedHashMap;

    .line 264
    .line 265
    invoke-virtual {v5, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v5

    .line 269
    check-cast v5, Landroid/graphics/Bitmap;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 270
    .line 271
    monitor-exit v4

    .line 272
    if-eqz v5, :cond_4

    .line 273
    .line 274
    move-object v2, v5

    .line 275
    goto/16 :goto_d

    .line 276
    .line 277
    :cond_4
    invoke-static {}, Lwb/en;->c()Lg8/i;

    .line 278
    .line 279
    .line 280
    move-result-object v4

    .line 281
    new-instance v5, Ljava/util/LinkedHashSet;

    .line 282
    .line 283
    invoke-direct {v5}, Ljava/util/LinkedHashSet;-><init>()V

    .line 284
    .line 285
    .line 286
    invoke-virtual {p0, p2, p3}, Lha/b0;->b(Ljava/lang/String;Z)Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v6

    .line 290
    if-eqz v6, :cond_5

    .line 291
    .line 292
    invoke-virtual {v5, v6}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    :cond_5
    invoke-virtual {p0, p2, v3}, Lha/b0;->b(Ljava/lang/String;Z)Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v6

    .line 299
    if-eqz v6, :cond_6

    .line 300
    .line 301
    invoke-virtual {v5, v6}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 302
    .line 303
    .line 304
    :cond_6
    if-eqz v4, :cond_7

    .line 305
    .line 306
    invoke-virtual {v4, p2, v3}, Lg8/i;->m(Ljava/lang/String;Z)Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v3

    .line 310
    goto :goto_2

    .line 311
    :cond_7
    move-object v3, v2

    .line 312
    :goto_2
    if-nez v3, :cond_8

    .line 313
    .line 314
    const-string v3, ""

    .line 315
    .line 316
    :cond_8
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 317
    .line 318
    .line 319
    move-result v6

    .line 320
    if-nez v6, :cond_9

    .line 321
    .line 322
    goto :goto_3

    .line 323
    :cond_9
    move-object v3, v2

    .line 324
    :goto_3
    if-eqz v3, :cond_a

    .line 325
    .line 326
    invoke-virtual {v5, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    :cond_a
    if-eqz v4, :cond_b

    .line 330
    .line 331
    invoke-virtual {v4, p2, p3}, Lg8/i;->m(Ljava/lang/String;Z)Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object v3

    .line 335
    goto :goto_4

    .line 336
    :cond_b
    move-object v3, v2

    .line 337
    :goto_4
    if-nez v3, :cond_c

    .line 338
    .line 339
    const-string v3, ""

    .line 340
    .line 341
    :cond_c
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 342
    .line 343
    .line 344
    move-result v4

    .line 345
    if-nez v4, :cond_d

    .line 346
    .line 347
    goto :goto_5

    .line 348
    :cond_d
    move-object v3, v2

    .line 349
    :goto_5
    if-eqz v3, :cond_e

    .line 350
    .line 351
    invoke-virtual {v5, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 352
    .line 353
    .line 354
    :cond_e
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 355
    .line 356
    .line 357
    move-result-object v3

    .line 358
    :cond_f
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 359
    .line 360
    .line 361
    move-result v4

    .line 362
    if-eqz v4, :cond_13

    .line 363
    .line 364
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object v4

    .line 368
    check-cast v4, Ljava/lang/String;

    .line 369
    .line 370
    :try_start_1
    const-string v5, "http://"

    .line 371
    .line 372
    invoke-static {v4, v5, p3}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 373
    .line 374
    .line 375
    move-result v5

    .line 376
    if-nez v5, :cond_11

    .line 377
    .line 378
    const-string v5, "https://"

    .line 379
    .line 380
    invoke-static {v4, v5, p3}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 381
    .line 382
    .line 383
    move-result v5

    .line 384
    if-eqz v5, :cond_10

    .line 385
    .line 386
    goto :goto_6

    .line 387
    :cond_10
    invoke-static {v4}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 388
    .line 389
    .line 390
    move-result-object v4

    .line 391
    goto :goto_9

    .line 392
    :catchall_0
    move-exception v4

    .line 393
    goto :goto_7

    .line 394
    :cond_11
    :goto_6
    new-instance v5, Ljava/net/URL;

    .line 395
    .line 396
    invoke-direct {v5, v4}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 397
    .line 398
    .line 399
    invoke-virtual {v5}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 400
    .line 401
    .line 402
    move-result-object v4

    .line 403
    const/16 v5, 0xbb8

    .line 404
    .line 405
    invoke-virtual {v4, v5}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 406
    .line 407
    .line 408
    invoke-virtual {v4, v5}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 409
    .line 410
    .line 411
    invoke-virtual {v4}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 412
    .line 413
    .line 414
    move-result-object v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 415
    :try_start_2
    invoke-static {v4}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    .line 416
    .line 417
    .line 418
    move-result-object v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 419
    :try_start_3
    invoke-static {v4, v2}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 420
    .line 421
    .line 422
    goto :goto_8

    .line 423
    :catchall_1
    move-exception v5

    .line 424
    :try_start_4
    throw v5
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 425
    :catchall_2
    move-exception v6

    .line 426
    :try_start_5
    invoke-static {v4, v5}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 427
    .line 428
    .line 429
    throw v6
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 430
    :goto_7
    new-instance v5, Lsf/f;

    .line 431
    .line 432
    invoke-direct {v5, v4}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 433
    .line 434
    .line 435
    :goto_8
    move-object v4, v5

    .line 436
    :goto_9
    nop

    .line 437
    instance-of v5, v4, Lsf/f;

    .line 438
    .line 439
    if-eqz v5, :cond_12

    .line 440
    .line 441
    move-object v4, v2

    .line 442
    :cond_12
    check-cast v4, Landroid/graphics/Bitmap;

    .line 443
    .line 444
    if-eqz v4, :cond_f

    .line 445
    .line 446
    goto :goto_a

    .line 447
    :cond_13
    move-object v4, v2

    .line 448
    :goto_a
    if-eqz v4, :cond_15

    .line 449
    .line 450
    iget-object p3, p0, Lha/b0;->g:Ljava/util/LinkedHashMap;

    .line 451
    .line 452
    monitor-enter p3

    .line 453
    :try_start_6
    iget-object v2, p0, Lha/b0;->g:Ljava/util/LinkedHashMap;

    .line 454
    .line 455
    invoke-interface {v2, p2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 456
    .line 457
    .line 458
    :goto_b
    iget-object p2, p0, Lha/b0;->g:Ljava/util/LinkedHashMap;

    .line 459
    .line 460
    invoke-virtual {p2}, Ljava/util/AbstractMap;->size()I

    .line 461
    .line 462
    .line 463
    move-result p2

    .line 464
    const/16 v2, 0x80

    .line 465
    .line 466
    if-le p2, v2, :cond_14

    .line 467
    .line 468
    iget-object p2, p0, Lha/b0;->g:Ljava/util/LinkedHashMap;

    .line 469
    .line 470
    invoke-virtual {p2}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 471
    .line 472
    .line 473
    move-result-object v2

    .line 474
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 475
    .line 476
    .line 477
    check-cast v2, Ljava/lang/Iterable;

    .line 478
    .line 479
    invoke-static {v2}, Ltf/m;->s1(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 480
    .line 481
    .line 482
    move-result-object v2

    .line 483
    check-cast v2, Ljava/util/Map$Entry;

    .line 484
    .line 485
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 486
    .line 487
    .line 488
    move-result-object v2

    .line 489
    invoke-virtual {p2, v2}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 490
    .line 491
    .line 492
    goto :goto_b

    .line 493
    :catchall_3
    move-exception p1

    .line 494
    goto :goto_c

    .line 495
    :cond_14
    monitor-exit p3

    .line 496
    goto/16 :goto_1

    .line 497
    .line 498
    :goto_c
    monitor-exit p3

    .line 499
    throw p1

    .line 500
    :cond_15
    :goto_d
    if-eqz v2, :cond_16

    .line 501
    .line 502
    invoke-virtual {v1, v2}, Landroid/app/Notification$Builder;->setLargeIcon(Landroid/graphics/Bitmap;)Landroid/app/Notification$Builder;

    .line 503
    .line 504
    .line 505
    :cond_16
    iget-object p1, p1, Lha/c0;->a:Ljava/lang/String;

    .line 506
    .line 507
    const-string p2, "hchat_sns_"

    .line 508
    .line 509
    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 510
    .line 511
    .line 512
    move-result-object p1

    .line 513
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 514
    .line 515
    .line 516
    move-result p1

    .line 517
    invoke-virtual {v1}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    .line 518
    .line 519
    .line 520
    move-result-object p2

    .line 521
    invoke-virtual {v0, p1, p2}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 522
    .line 523
    .line 524
    return-void

    .line 525
    :catchall_4
    move-exception p1

    .line 526
    monitor-exit v4

    .line 527
    throw p1

    .line 528
    :cond_17
    return-void

    .line 529
    :array_0
    .array-data 8
        0x0
        0xfa
        0xb4
        0xfa
    .end array-data
.end method
