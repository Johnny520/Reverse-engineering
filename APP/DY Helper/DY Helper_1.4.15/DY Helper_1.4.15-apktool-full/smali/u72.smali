.class public abstract Lu72;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Ljava/util/List;

.field public static final β:Landroid/os/Handler;

.field public static final γ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final δ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final ε:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final ζ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final η:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static volatile θ:Landroid/content/Context;

.field public static volatile ι:Landroid/app/Activity;

.field public static volatile κ:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "https://raw.githubusercontent.com/yyhh73144-max/dyhelperUser/refs/heads/main/update.json"

    .line 2
    .line 3
    invoke-static {v0}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lu72;->α:Ljava/util/List;

    .line 8
    .line 9
    new-instance v0, Landroid/os/Handler;

    .line 10
    .line 11
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lu72;->β:Landroid/os/Handler;

    .line 19
    .line 20
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 24
    .line 25
    .line 26
    sput-object v0, Lu72;->γ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 27
    .line 28
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 29
    .line 30
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 31
    .line 32
    .line 33
    sput-object v0, Lu72;->δ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 34
    .line 35
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 36
    .line 37
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 38
    .line 39
    .line 40
    sput-object v0, Lu72;->ε:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 41
    .line 42
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 43
    .line 44
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 45
    .line 46
    .line 47
    sput-object v0, Lu72;->ζ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 48
    .line 49
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 50
    .line 51
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 52
    .line 53
    .line 54
    sput-object v0, Lu72;->η:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 55
    .line 56
    return-void
.end method

.method public static α(Z)V
    .locals 13

    .line 1
    sget-object v0, Lu72;->θ:Landroid/content/Context;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    invoke-static {v0}, Lu72;->ε(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    const/4 v1, 0x4

    .line 11
    const-string v2, "r5f3b6ae7236977e4"

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    if-nez p0, :cond_1

    .line 15
    .line 16
    const-string v4, "version_update_check_enabled"

    .line 17
    .line 18
    invoke-static {v4, v0}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    if-nez v4, :cond_1

    .line 23
    .line 24
    const-string p0, "version update check disabled"

    .line 25
    .line 26
    invoke-static {v2, p0, v3, v1, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 31
    .line 32
    .line 33
    move-result-wide v4

    .line 34
    const-string v6, "blacklist_update_checked_at"

    .line 35
    .line 36
    const-wide/16 v7, 0x0

    .line 37
    .line 38
    :try_start_0
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 39
    .line 40
    .line 41
    move-result-object v9

    .line 42
    invoke-interface {v9, v6, v7, v8}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 43
    .line 44
    .line 45
    move-result-wide v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-wide v9, v7

    .line 48
    :goto_0
    if-nez p0, :cond_3

    .line 49
    .line 50
    cmp-long v6, v9, v7

    .line 51
    .line 52
    if-lez v6, :cond_3

    .line 53
    .line 54
    sub-long v6, v4, v9

    .line 55
    .line 56
    const-wide/32 v11, 0x1499700

    .line 57
    .line 58
    .line 59
    cmp-long v6, v6, v11

    .line 60
    .line 61
    if-gez v6, :cond_3

    .line 62
    .line 63
    new-instance p0, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    const-string v0, "skip update check by interval now="

    .line 66
    .line 67
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v0, " last="

    .line 74
    .line 75
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-static {v2, p0, v3, v1, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    sget-object p0, Lu72;->ι:Landroid/app/Activity;

    .line 89
    .line 90
    if-nez p0, :cond_2

    .line 91
    .line 92
    :goto_1
    return-void

    .line 93
    :cond_2
    invoke-static {p0}, Lu72;->η(Landroid/app/Activity;)V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :cond_3
    sget-object v4, Lu72;->δ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 98
    .line 99
    const/4 v5, 0x1

    .line 100
    invoke-virtual {v4, v0, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-nez v0, :cond_4

    .line 105
    .line 106
    const-string p0, "skip update check because another check is running"

    .line 107
    .line 108
    invoke-static {v2, p0, v3, v1, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    return-void

    .line 112
    :cond_4
    new-instance v0, Ljava/lang/Thread;

    .line 113
    .line 114
    new-instance v1, Lis;

    .line 115
    .line 116
    const/4 v2, 0x1

    .line 117
    invoke-direct {v1, v2, p0}, Lis;-><init>(IZ)V

    .line 118
    .line 119
    .line 120
    const-string p0, "DY-VersionUpdateCheck"

    .line 121
    .line 122
    invoke-direct {v0, v1, p0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 126
    .line 127
    .line 128
    return-void
.end method

.method public static β(Landroid/content/Context;Lt72;Lic;)Landroid/net/Uri;
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget v0, p1, Lt72;->α:I

    .line 6
    .line 7
    const-string v1, "dyhelper_"

    .line 8
    .line 9
    const-string v2, ".apk"

    .line 10
    .line 11
    invoke-static {v1, v0, v2}, Lnx;->ζ(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "external_primary"

    .line 16
    .line 17
    invoke-static {v1}, Landroid/provider/MediaStore$Downloads;->getContentUri(Ljava/lang/String;)Landroid/net/Uri;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    new-instance v2, Landroid/content/ContentValues;

    .line 22
    .line 23
    invoke-direct {v2}, Landroid/content/ContentValues;-><init>()V

    .line 24
    .line 25
    .line 26
    const-string v3, "_display_name"

    .line 27
    .line 28
    invoke-virtual {v2, v3, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const-string v0, "mime_type"

    .line 32
    .line 33
    const-string v3, "application/vnd.android.package-archive"

    .line 34
    .line 35
    invoke-virtual {v2, v0, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const-string v0, "relative_path"

    .line 39
    .line 40
    const-string v3, "Download/DYHelper"

    .line 41
    .line 42
    invoke-virtual {v2, v0, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 v0, 0x1

    .line 46
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    const-string v3, "is_pending"

    .line 51
    .line 52
    invoke-virtual {v2, v3, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, v1, v2}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    const/4 v1, 0x0

    .line 60
    if-eqz v0, :cond_0

    .line 61
    .line 62
    :try_start_0
    sget-object v2, Ls72;->α:Ljava/util/List;

    .line 63
    .line 64
    iget-object p1, p1, Lt72;->γ:Ljava/lang/String;

    .line 65
    .line 66
    new-instance v2, Lz61;

    .line 67
    .line 68
    const/16 v4, 0xa

    .line 69
    .line 70
    invoke-direct {v2, p0, v4, v0}, Lz61;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    new-instance v4, Lzd;

    .line 74
    .line 75
    const/4 v5, 0x3

    .line 76
    invoke-direct {v4, v5, p2}, Lzd;-><init>(ILjava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    invoke-static {p1, v2, v4}, Ls72;->β(Ljava/lang/String;Lz61;Lzd;)V

    .line 80
    .line 81
    .line 82
    new-instance p1, Landroid/content/ContentValues;

    .line 83
    .line 84
    invoke-direct {p1}, Landroid/content/ContentValues;-><init>()V

    .line 85
    .line 86
    .line 87
    const/4 p2, 0x0

    .line 88
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    invoke-virtual {p1, v3, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0, v0, p1, v1, v1}, Landroid/content/ContentResolver;->update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 96
    .line 97
    .line 98
    return-object v0

    .line 99
    :catchall_0
    move-exception p1

    .line 100
    :try_start_1
    invoke-virtual {p0, v0, v1, v1}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 101
    .line 102
    .line 103
    :catchall_1
    throw p1

    .line 104
    :cond_0
    const-string p0, "\u65e0\u6cd5\u521b\u5efa\u4e0b\u8f7d\u6587\u4ef6"

    .line 105
    .line 106
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    return-object v1
.end method

.method public static γ()Lt72;
    .locals 10

    .line 1
    sget-object v0, Ls72;->α:Ljava/util/List;

    .line 2
    .line 3
    sget-object v0, Lu72;->α:Ljava/util/List;

    .line 4
    .line 5
    const/4 v1, 0x3

    .line 6
    invoke-static {v1, v0}, Ls72;->γ(ILjava/util/List;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "r5f3b6ae7236977e4"

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x4

    .line 14
    invoke-static {v1, v0, v2, v3, v2}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    if-eqz v4, :cond_0

    .line 22
    .line 23
    return-object v2

    .line 24
    :cond_0
    const-string v4, ""

    .line 25
    .line 26
    :try_start_0
    new-instance v5, Lorg/json/JSONObject;

    .line 27
    .line 28
    invoke-direct {v5, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const-string v0, "latest"

    .line 32
    .line 33
    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-nez v0, :cond_1

    .line 38
    .line 39
    :goto_0
    move-object v6, v2

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const-string v5, "version_code"

    .line 42
    .line 43
    const/4 v6, -0x1

    .line 44
    invoke-virtual {v0, v5, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    if-gtz v5, :cond_2

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    new-instance v6, Lt72;

    .line 52
    .line 53
    const-string v7, "version_name"

    .line 54
    .line 55
    invoke-virtual {v0, v7, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v7

    .line 59
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    invoke-static {v7}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v7

    .line 70
    const-string v8, "download_url"

    .line 71
    .line 72
    invoke-virtual {v0, v8, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v8

    .line 76
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    invoke-static {v8}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 80
    .line 81
    .line 82
    move-result-object v8

    .line 83
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v8

    .line 87
    const-string v9, "message"

    .line 88
    .line 89
    invoke-virtual {v0, v9, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    invoke-static {v0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-direct {v6, v5, v7, v8, v0}, Lt72;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 105
    .line 106
    .line 107
    goto :goto_1

    .line 108
    :catchall_0
    move-exception v0

    .line 109
    new-instance v6, Leo1;

    .line 110
    .line 111
    invoke-direct {v6, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 112
    .line 113
    .line 114
    :goto_1
    instance-of v0, v6, Leo1;

    .line 115
    .line 116
    if-eqz v0, :cond_3

    .line 117
    .line 118
    move-object v6, v2

    .line 119
    :cond_3
    check-cast v6, Lt72;

    .line 120
    .line 121
    if-nez v6, :cond_4

    .line 122
    .line 123
    const-string v0, "update json invalid"

    .line 124
    .line 125
    invoke-static {v1, v0, v2, v3, v2}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    return-object v2

    .line 129
    :cond_4
    iget v0, v6, Lt72;->α:I

    .line 130
    .line 131
    iget-object v4, v6, Lt72;->γ:Ljava/lang/String;

    .line 132
    .line 133
    new-instance v5, Ljava/lang/StringBuilder;

    .line 134
    .line 135
    const-string v7, "update json parsed version="

    .line 136
    .line 137
    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    const-string v0, " url="

    .line 144
    .line 145
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    invoke-static {v1, v0, v2, v3, v2}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    return-object v6
.end method

.method public static δ()Lt72;
    .locals 5

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
    sget-object v0, Lu72;->θ:Landroid/content/Context;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-static {v0}, Lui1;->π(Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    const-string v0, "blacklist_update_version_code"

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    :try_start_0
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 22
    .line 23
    .line 24
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    :catchall_0
    const-string v0, "blacklist_update_version_name"

    .line 26
    .line 27
    const-string v2, ""

    .line 28
    .line 29
    invoke-static {v0, v2}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const-string v3, "blacklist_update_url"

    .line 34
    .line 35
    invoke-static {v3, v2}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    const-string v4, "blacklist_update_message"

    .line 40
    .line 41
    invoke-static {v4, v2}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    if-gtz v1, :cond_1

    .line 46
    .line 47
    const/4 v0, 0x0

    .line 48
    return-object v0

    .line 49
    :cond_1
    new-instance v4, Lt72;

    .line 50
    .line 51
    invoke-direct {v4, v1, v0, v3, v2}, Lt72;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-object v4
.end method

.method public static ε(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object p0, v0

    .line 12
    :goto_0
    sput-object p0, Lu72;->θ:Landroid/content/Context;

    .line 13
    .line 14
    invoke-static {}, Lui1;->Α()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    :try_start_0
    invoke-static {p0}, Lui1;->π(Landroid/content/Context;)V

    .line 21
    .line 22
    .line 23
    sget-object p0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :catchall_0
    move-exception p0

    .line 27
    new-instance v0, Leo1;

    .line 28
    .line 29
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    move-object p0, v0

    .line 33
    :goto_1
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    if-eqz p0, :cond_1

    .line 38
    .line 39
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    const-string v0, "PrefsManager init failed: "

    .line 44
    .line 45
    invoke-static {v0, p0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    const/4 v0, 0x4

    .line 50
    const-string v1, "r5f3b6ae7236977e4"

    .line 51
    .line 52
    const/4 v2, 0x0

    .line 53
    invoke-static {v1, p0, v2, v0, v2}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    :cond_1
    return-void
.end method

.method public static ζ(Lt72;)V
    .locals 5

    .line 1
    sget-object v0, Lui1;->α:Ljava/lang/Object;

    .line 2
    .line 3
    iget v0, p0, Lt72;->α:I

    .line 4
    .line 5
    iget-object v1, p0, Lt72;->β:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v2, p0, Lt72;->γ:Ljava/lang/String;

    .line 8
    .line 9
    iget-object p0, p0, Lt72;->δ:Ljava/lang/String;

    .line 10
    .line 11
    const-string v3, "blacklist_update_version_code"

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    :try_start_0
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    invoke-interface {v4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    invoke-interface {v4, v3, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const-string v4, "blacklist_update_version_name"

    .line 35
    .line 36
    invoke-static {v1}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-interface {v0, v4, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    const-string v1, "blacklist_update_url"

    .line 49
    .line 50
    invoke-static {v2}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    const-string v1, "blacklist_update_message"

    .line 63
    .line 64
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-interface {v0, v1, p0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 77
    .line 78
    .line 79
    invoke-static {v3}, Lui1;->Β(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :catchall_0
    move-exception p0

    .line 84
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    const-string v0, "saveBlacklistUpdateInfo failed: "

    .line 89
    .line 90
    invoke-static {v0, p0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    const/4 v0, 0x4

    .line 95
    const-string v1, "r24d5e64064e1c279"

    .line 96
    .line 97
    const/4 v2, 0x0

    .line 98
    invoke-static {v1, p0, v2, v0, v2}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    :goto_0
    sget-object p0, Lui1;->α:Ljava/lang/Object;

    .line 102
    .line 103
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 104
    .line 105
    .line 106
    move-result-wide v0

    .line 107
    const-string p0, "blacklist_update_checked_at"

    .line 108
    .line 109
    invoke-static {v0, v1, p0}, Lui1;->Θ(JLjava/lang/String;)V

    .line 110
    .line 111
    .line 112
    return-void
.end method

.method public static η(Landroid/app/Activity;)V
    .locals 4

    .line 1
    invoke-static {}, Lu72;->δ()Lt72;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object v1, v0, Lt72;->γ:Ljava/lang/String;

    .line 9
    .line 10
    iget v2, v0, Lt72;->α:I

    .line 11
    .line 12
    const/16 v3, 0x3c

    .line 13
    .line 14
    if-gt v2, v3, :cond_1

    .line 15
    .line 16
    :goto_0
    return-void

    .line 17
    :cond_1
    const-string v2, "/releases/latest"

    .line 18
    .line 19
    const/4 v3, 0x1

    .line 20
    invoke-static {v1, v2, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_2

    .line 25
    .line 26
    const-string p0, "skip cached update prompt because download url is stale: "

    .line 27
    .line 28
    invoke-virtual {p0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    const/4 v0, 0x4

    .line 33
    const-string v1, "r5f3b6ae7236977e4"

    .line 34
    .line 35
    const/4 v2, 0x0

    .line 36
    invoke-static {v1, p0, v2, v0, v2}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    invoke-static {v3}, Lu72;->α(Z)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_2
    invoke-static {v0, p0}, Lu72;->θ(Lt72;Landroid/app/Activity;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public static θ(Lt72;Landroid/app/Activity;)V
    .locals 3

    .line 1
    iget v0, p0, Lt72;->α:I

    .line 2
    .line 3
    const/16 v1, 0x3c

    .line 4
    .line 5
    if-gt v0, v1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, p0, Lt72;->γ:Ljava/lang/String;

    .line 9
    .line 10
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    const-string v0, "version_update_skipped_version_code"

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    :try_start_0
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 25
    .line 26
    .line 27
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    :catchall_0
    iget v0, p0, Lt72;->α:I

    .line 29
    .line 30
    if-ne v1, v0, :cond_2

    .line 31
    .line 32
    const-string p0, "skip prompt for skipped version="

    .line 33
    .line 34
    invoke-static {p0, v0}, La12;->δ(Ljava/lang/String;I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    const/4 p1, 0x4

    .line 39
    const-string v0, "r5f3b6ae7236977e4"

    .line 40
    .line 41
    const/4 v1, 0x0

    .line 42
    invoke-static {v0, p0, v1, p1, v1}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_2
    sget v0, Lu72;->κ:I

    .line 47
    .line 48
    iget v1, p0, Lt72;->α:I

    .line 49
    .line 50
    if-ne v0, v1, :cond_3

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_3
    if-nez p1, :cond_4

    .line 54
    .line 55
    :goto_0
    return-void

    .line 56
    :cond_4
    sget-object v0, Lu72;->β:Landroid/os/Handler;

    .line 57
    .line 58
    new-instance v1, Lii0;

    .line 59
    .line 60
    const/16 v2, 0x1d

    .line 61
    .line 62
    invoke-direct {v1, p1, v2, p0}, Lii0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 66
    .line 67
    .line 68
    return-void
.end method
