.class public final Lz0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    .line 3
    .line 4
    invoke-direct {v1, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    const-string p0, "hookPoints"

    .line 8
    .line 9
    invoke-virtual {v1, p0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    if-nez p0, :cond_0

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    const-string v2, "hookPointsVersion"

    .line 17
    .line 18
    const-wide/16 v3, 0x0

    .line 19
    .line 20
    invoke-virtual {v1, v2, v3, v4}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 21
    .line 22
    .line 23
    move-result-wide v1

    .line 24
    new-instance v3, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v1, "|"

    .line 33
    .line 34
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    const-string v1, "text"

    .line 45
    .line 46
    invoke-static {p0, v1}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const-string v1, "SHA-256"

    .line 50
    .line 51
    invoke-static {v1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    sget-object v2, LU0/a;->a:Ljava/nio/charset/Charset;

    .line 56
    .line 57
    invoke-virtual {p0, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    const-string v2, "getBytes(...)"

    .line 62
    .line 63
    invoke-static {p0, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1, p0}, Ljava/security/MessageDigest;->digest([B)[B

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    const-string v1, "digest(...)"

    .line 71
    .line 72
    invoke-static {p0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    new-instance v1, Lr0/n1;

    .line 76
    .line 77
    const/16 v2, 0x17

    .line 78
    .line 79
    invoke-direct {v1, v2}, Lr0/n1;-><init>(I)V

    .line 80
    .line 81
    .line 82
    invoke-static {p0, v1}, LF0/h;->g0([BLM0/l;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 86
    goto :goto_0

    .line 87
    :catchall_0
    move-exception p0

    .line 88
    new-instance v1, LE0/d;

    .line 89
    .line 90
    invoke-direct {v1, p0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 91
    .line 92
    .line 93
    move-object p0, v1

    .line 94
    :goto_0
    nop

    .line 95
    instance-of v1, p0, LE0/d;

    .line 96
    .line 97
    if-eqz v1, :cond_1

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_1
    move-object v0, p0

    .line 101
    :goto_1
    check-cast v0, Ljava/lang/String;

    .line 102
    .line 103
    return-object v0
.end method

.method public static c(Ljava/lang/String;)Z
    .locals 5

    .line 1
    const/4 v0, 0x4

    .line 2
    const-string v1, "app"

    .line 3
    .line 4
    const-string v2, "getSharedPreferences(...)"

    .line 5
    .line 6
    invoke-static {v1, v0, v2}, LL/d;->f(Ljava/lang/String;ILjava/lang/String;)Landroid/content/SharedPreferences;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x0

    .line 11
    const/4 v2, 0x1

    .line 12
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    const-string v4, "startReloadIfChangedUnexpectedly"

    .line 17
    .line 18
    invoke-virtual {v3, v4, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-virtual {v3, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v3, v0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    .line 28
    :catchall_0
    const-string v3, "update_config_cache_digest"

    .line 29
    .line 30
    invoke-interface {v0, v3, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    invoke-static {v0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    invoke-static {p0}, Lz0/r;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    if-eqz p0, :cond_1

    .line 52
    .line 53
    return v2

    .line 54
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 55
    return p0
.end method

.method public static d(Lz0/b;)Z
    .locals 4

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iget-wide v2, p0, Lz0/b;->c:J

    .line 4
    .line 5
    cmp-long p0, v2, v0

    .line 6
    .line 7
    if-lez p0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    cmp-long p0, v0, v2

    .line 14
    .line 15
    if-lez p0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return p0
.end method

.method public static e(Ljava/lang/String;)V
    .locals 4

    .line 1
    const/4 v0, 0x4

    .line 2
    const-string v1, "app"

    .line 3
    .line 4
    const-string v2, "getSharedPreferences(...)"

    .line 5
    .line 6
    invoke-static {v1, v0, v2}, LL/d;->f(Ljava/lang/String;ILjava/lang/String;)Landroid/content/SharedPreferences;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const-string v2, "startReloadIfChangedUnexpectedly"

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

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
    invoke-virtual {v1, v0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    .line 28
    :catchall_0
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const-string v1, "update_config_last_refresh_time"

    .line 33
    .line 34
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 35
    .line 36
    .line 37
    move-result-wide v2

    .line 38
    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    const-string v1, "update_config_last_wxid"

    .line 43
    .line 44
    invoke-interface {v0, v1, p0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public static f(Ljava/lang/String;ZLjava/lang/Throwable;)Lz0/b;
    .locals 19

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lz0/b;

    .line 9
    .line 10
    const-string v2, "serviceEnabled"

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const-string v3, "serviceMessage"

    .line 18
    .line 19
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    const-string v4, "optString(...)"

    .line 24
    .line 25
    invoke-static {v3, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const-string v5, "validUntil"

    .line 29
    .line 30
    const-wide/16 v6, 0x0

    .line 31
    .line 32
    invoke-virtual {v0, v5, v6, v7}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 33
    .line 34
    .line 35
    move-result-wide v8

    .line 36
    const-string v5, "updateEnabled"

    .line 37
    .line 38
    const/4 v10, 0x0

    .line 39
    invoke-virtual {v0, v5, v10}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    const-string v11, "latestVersionCode"

    .line 44
    .line 45
    invoke-virtual {v0, v11, v10}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 46
    .line 47
    .line 48
    move-result v11

    .line 49
    const-string v12, "latestVersionName"

    .line 50
    .line 51
    invoke-virtual {v0, v12}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v12

    .line 55
    invoke-static {v12, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    const-string v13, "forceUpdate"

    .line 59
    .line 60
    invoke-virtual {v0, v13, v10}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 61
    .line 62
    .line 63
    move-result v10

    .line 64
    const-string v13, "updateMessage"

    .line 65
    .line 66
    invoke-virtual {v0, v13}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v13

    .line 70
    invoke-static {v13, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    const-string v14, "downloadUrl"

    .line 74
    .line 75
    invoke-virtual {v0, v14}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v14

    .line 79
    invoke-static {v14, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    const-string v4, "serverTime"

    .line 83
    .line 84
    invoke-virtual {v0, v4, v6, v7}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 85
    .line 86
    .line 87
    move-result-wide v6

    .line 88
    move-object/from16 v15, p2

    .line 89
    .line 90
    move-object/from16 v16, v14

    .line 91
    .line 92
    move/from16 v14, p1

    .line 93
    .line 94
    move-wide/from16 v17, v6

    .line 95
    .line 96
    move v6, v5

    .line 97
    move-wide v4, v8

    .line 98
    move v9, v10

    .line 99
    move v7, v11

    .line 100
    move-object v8, v12

    .line 101
    move-object v10, v13

    .line 102
    move-object/from16 v11, v16

    .line 103
    .line 104
    move-wide/from16 v12, v17

    .line 105
    .line 106
    invoke-direct/range {v1 .. v15}, Lz0/b;-><init>(ZLjava/lang/String;JZILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;JZLjava/lang/Throwable;)V

    .line 107
    .line 108
    .line 109
    return-object v1
.end method

.method public static g(Ljava/lang/Throwable;Z)Lz0/b;
    .locals 5

    .line 1
    sget-object v0, Lz0/d;->c:Lz0/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    sget-object p1, Lz0/d;->a:Lz0/c;

    .line 9
    .line 10
    invoke-static {v0}, Lz0/c;->d(Lz0/b;)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/16 p1, 0x3ff

    .line 18
    .line 19
    invoke-static {v0, p0, p1}, Lz0/b;->a(Lz0/b;Ljava/lang/Throwable;I)Lz0/b;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :cond_1
    const/4 v0, 0x4

    .line 25
    const-string v2, "app"

    .line 26
    .line 27
    const-string v3, "getSharedPreferences(...)"

    .line 28
    .line 29
    invoke-static {v2, v0, v3}, LL/d;->f(Ljava/lang/String;ILjava/lang/String;)Landroid/content/SharedPreferences;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const/4 v2, 0x1

    .line 34
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    const-string v4, "startReloadIfChangedUnexpectedly"

    .line 39
    .line 40
    invoke-virtual {v3, v4, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-virtual {v3, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v3, v0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    .line 50
    :catchall_0
    const-string v3, "update_config_cache"

    .line 51
    .line 52
    invoke-interface {v0, v3, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    if-nez v0, :cond_2

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    invoke-static {v0}, Lz0/c;->c(Ljava/lang/String;)Z

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-nez v3, :cond_3

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_3
    :try_start_1
    invoke-static {v0, v2, p0}, Lz0/c;->f(Ljava/lang/String;ZLjava/lang/Throwable;)Lz0/b;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    if-nez p1, :cond_4

    .line 71
    .line 72
    invoke-static {p0}, Lz0/c;->d(Lz0/b;)Z

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    if-eqz p1, :cond_4

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_4
    sput-object v0, Lz0/d;->d:Ljava/lang/String;

    .line 80
    .line 81
    const/16 p1, 0x7ff

    .line 82
    .line 83
    invoke-static {p0, v1, p1}, Lz0/b;->a(Lz0/b;Ljava/lang/Throwable;I)Lz0/b;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    sput-object p1, Lz0/d;->c:Lz0/b;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 88
    .line 89
    return-object p0

    .line 90
    :catchall_1
    :goto_0
    return-object v1
.end method

.method public static i(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 1
    const-string v0, "payloadDigest="

    .line 2
    .line 3
    new-instance v1, Lorg/json/JSONObject;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v2, "signature"

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    const-string v3, "optString(...)"

    .line 15
    .line 16
    invoke-static {v2, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-static {v2}, Lz0/r;->x(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-static {v2}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    const-string v4, "required=true"

    .line 28
    .line 29
    const/4 v5, 0x0

    .line 30
    if-eqz v3, :cond_0

    .line 31
    .line 32
    const-string v0, "remote config signature missing"

    .line 33
    .line 34
    filled-new-array {v0, v4}, [Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto/16 :goto_3

    .line 42
    .line 43
    :cond_0
    const-string v3, "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAqA8QfKmZm2gatuz87Gn+u4H7VwdM3KUiFo2DKnDFll++TGHnkUoQriPPaFd/i9F6Av/wqQ16q1f+SOlmWoz5yY44Z/kaWgg47kuRiD/zdv6IaZDjeMQ5VGdLlggoLt8l0r2Qn4nw25xxZ/9eTGqKzdBGYQAZKqa1G2+fkNXmJ7ubUlFrxpsISIuaXbObQAS3AYPKE9dD2JjZX3OG4r064rhcP7QnT9PKCp+e0LQdIR8gbvHRdGSRO9KuB03DyZq+eCRqDg62Ix2kE9aAWyvQDWbLSTnIZDgKqzTGpL/HuVKhsaPw9P5FfJ5O9zAPI2+C0WH7IWypLUa3sCBj6ctIcwIDAQAB"

    .line 44
    .line 45
    invoke-static {v3}, Lz0/r;->x(Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-static {v3}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 50
    .line 51
    .line 52
    move-result v6

    .line 53
    if-eqz v6, :cond_1

    .line 54
    .line 55
    const-string v0, "remote config public key missing"

    .line 56
    .line 57
    filled-new-array {v0, v4}, [Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    goto/16 :goto_3

    .line 65
    .line 66
    :cond_1
    :try_start_0
    invoke-static {v1}, Lz0/r;->i(Lorg/json/JSONObject;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    const-string v6, "signatureAlgorithm"

    .line 71
    .line 72
    const-string v7, "SHA256withRSA"

    .line 73
    .line 74
    invoke-virtual {v1, v6, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-static {v3, v5}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    const-string v6, "RSA"

    .line 83
    .line 84
    invoke-static {v6}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;)Ljava/security/KeyFactory;

    .line 85
    .line 86
    .line 87
    move-result-object v6

    .line 88
    new-instance v7, Ljava/security/spec/X509EncodedKeySpec;

    .line 89
    .line 90
    invoke-direct {v7, v3}, Ljava/security/spec/X509EncodedKeySpec;-><init>([B)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v6, v7}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    invoke-static {v1}, Ljava/security/Signature;->getInstance(Ljava/lang/String;)Ljava/security/Signature;

    .line 98
    .line 99
    .line 100
    move-result-object v6

    .line 101
    invoke-virtual {v6, v3}, Ljava/security/Signature;->initVerify(Ljava/security/PublicKey;)V

    .line 102
    .line 103
    .line 104
    sget-object v3, LU0/a;->a:Ljava/nio/charset/Charset;

    .line 105
    .line 106
    invoke-virtual {v4, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    const-string v7, "getBytes(...)"

    .line 111
    .line 112
    invoke-static {v3, v7}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v6, v3}, Ljava/security/Signature;->update([B)V

    .line 116
    .line 117
    .line 118
    invoke-static {v2, v5}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    invoke-virtual {v6, v2}, Ljava/security/Signature;->verify([B)Z

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    if-nez v2, :cond_2

    .line 127
    .line 128
    const-string v3, "remote config signature verify false"

    .line 129
    .line 130
    invoke-static {v4}, Lz0/r;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v4

    .line 134
    invoke-virtual {v0, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    filled-new-array {v3, v1, v0}, [Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    goto :goto_0

    .line 146
    :catchall_0
    move-exception v0

    .line 147
    goto :goto_1

    .line 148
    :cond_2
    :goto_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 149
    .line 150
    .line 151
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 152
    goto :goto_2

    .line 153
    :goto_1
    new-instance v1, LE0/d;

    .line 154
    .line 155
    invoke-direct {v1, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 156
    .line 157
    .line 158
    move-object v0, v1

    .line 159
    :goto_2
    invoke-static {v0}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    if-eqz v1, :cond_3

    .line 164
    .line 165
    const-string v2, "remote config signature verify error"

    .line 166
    .line 167
    filled-new-array {v2, v1}, [Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    invoke-static {v1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    :cond_3
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 175
    .line 176
    instance-of v2, v0, LE0/d;

    .line 177
    .line 178
    if-eqz v2, :cond_4

    .line 179
    .line 180
    move-object v0, v1

    .line 181
    :cond_4
    check-cast v0, Ljava/lang/Boolean;

    .line 182
    .line 183
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 184
    .line 185
    .line 186
    move-result v5

    .line 187
    :goto_3
    if-eqz v5, :cond_6

    .line 188
    .line 189
    new-instance v0, Lorg/json/JSONObject;

    .line 190
    .line 191
    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    const-string v1, "payload"

    .line 195
    .line 196
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    if-nez v0, :cond_5

    .line 201
    .line 202
    goto :goto_4

    .line 203
    :cond_5
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object p0

    .line 207
    const-string v0, "toString(...)"

    .line 208
    .line 209
    invoke-static {p0, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    :goto_4
    return-object p0

    .line 213
    :cond_6
    new-instance p0, Ljava/lang/SecurityException;

    .line 214
    .line 215
    const-string v0, "remote config signature invalid"

    .line 216
    .line 217
    invoke-direct {p0, v0}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    throw p0
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 11

    .line 1
    :try_start_0
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "com.tencent.mm"

    .line 10
    .line 11
    invoke-static {v0, v1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 16
    .line 17
    .line 18
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception v0

    .line 21
    new-instance v1, LE0/d;

    .line 22
    .line 23
    invoke-direct {v1, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 24
    .line 25
    .line 26
    move-object v0, v1

    .line 27
    :goto_0
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 28
    .line 29
    instance-of v2, v0, LE0/d;

    .line 30
    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    move-object v0, v1

    .line 34
    :cond_0
    check-cast v0, Ljava/lang/Boolean;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    const/4 v1, 0x1

    .line 41
    const/4 v2, 0x0

    .line 42
    const-string v3, "update_config_last_applied_hook_points_digest"

    .line 43
    .line 44
    const-string v4, "startReloadIfChangedUnexpectedly"

    .line 45
    .line 46
    const-string v5, "getSharedPreferences(...)"

    .line 47
    .line 48
    const/4 v6, 0x4

    .line 49
    const-string v7, "app"

    .line 50
    .line 51
    const/4 v8, 0x0

    .line 52
    if-nez v0, :cond_1

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_1
    invoke-static {p1}, Lz0/c;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    if-nez v0, :cond_2

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_2
    invoke-static {v7, v6, v5}, LL/d;->f(Ljava/lang/String;ILjava/lang/String;)Landroid/content/SharedPreferences;

    .line 63
    .line 64
    .line 65
    move-result-object v9

    .line 66
    :try_start_1
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    move-result-object v10

    .line 70
    invoke-virtual {v10, v4, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 71
    .line 72
    .line 73
    move-result-object v10

    .line 74
    invoke-virtual {v10, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v10, v9, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 78
    .line 79
    .line 80
    :catchall_1
    const-string v10, ""

    .line 81
    .line 82
    invoke-interface {v9, v3, v10}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v9

    .line 86
    if-nez v9, :cond_3

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_3
    move-object v10, v9

    .line 90
    :goto_1
    invoke-static {v0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 91
    .line 92
    .line 93
    move-result v9

    .line 94
    if-nez v9, :cond_4

    .line 95
    .line 96
    invoke-virtual {v0, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-nez v0, :cond_4

    .line 101
    .line 102
    move v8, v1

    .line 103
    :cond_4
    :goto_2
    invoke-static {v7, v6, v5}, LL/d;->f(Ljava/lang/String;ILjava/lang/String;)Landroid/content/SharedPreferences;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    move-result-object v9

    .line 111
    invoke-virtual {v9, v4, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 112
    .line 113
    .line 114
    move-result-object v9

    .line 115
    invoke-virtual {v9, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v9, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 119
    .line 120
    .line 121
    :catchall_2
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    const-string v9, "update_config_cache"

    .line 126
    .line 127
    invoke-interface {v0, v9, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-static {p1}, Lz0/r;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v9

    .line 135
    const-string v10, "update_config_cache_digest"

    .line 136
    .line 137
    invoke-interface {v0, v10, v9}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    if-eqz v0, :cond_6

    .line 146
    .line 147
    sput-object p1, Lz0/d;->d:Ljava/lang/String;

    .line 148
    .line 149
    invoke-static {p1, v1, v2}, Lz0/c;->f(Ljava/lang/String;ZLjava/lang/Throwable;)Lz0/b;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    sput-object v0, Lz0/d;->c:Lz0/b;

    .line 154
    .line 155
    sget-boolean v0, Lz0/i;->a:Z

    .line 156
    .line 157
    invoke-static {}, Lz0/g;->I()V

    .line 158
    .line 159
    .line 160
    if-eqz v8, :cond_6

    .line 161
    .line 162
    invoke-static {p1}, Lz0/c;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    if-nez p1, :cond_5

    .line 167
    .line 168
    goto :goto_3

    .line 169
    :cond_5
    invoke-static {v7, v6, v5}, LL/d;->f(Ljava/lang/String;ILjava/lang/String;)Landroid/content/SharedPreferences;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    :try_start_3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    move-result-object v8

    .line 177
    invoke-virtual {v8, v4, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 178
    .line 179
    .line 180
    move-result-object v8

    .line 181
    invoke-virtual {v8, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v8, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 185
    .line 186
    .line 187
    :catchall_3
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    invoke-interface {v0, v3, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 196
    .line 197
    .line 198
    :goto_3
    invoke-static {v7, v6, v5}, LL/d;->f(Ljava/lang/String;ILjava/lang/String;)Landroid/content/SharedPreferences;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    :try_start_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    invoke-virtual {v0, v4, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v0, p1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 214
    .line 215
    .line 216
    :catchall_4
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 217
    .line 218
    .line 219
    move-result-object p1

    .line 220
    const-string v0, "wechat_restart_required_for_hook_points"

    .line 221
    .line 222
    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 223
    .line 224
    .line 225
    move-result-object p1

    .line 226
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 227
    .line 228
    .line 229
    const-string p1, "remote hook points changed, apply on next wechat restart"

    .line 230
    .line 231
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    invoke-static {p1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 236
    .line 237
    .line 238
    :cond_6
    return-void
.end method

.method public h(ZLM0/l;)V
    .locals 18

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    invoke-static {}, Lz0/r;->l()Lz0/a;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-boolean v2, v1, Lz0/a;->d:Z

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    if-eqz v2, :cond_8

    .line 11
    .line 12
    iget-boolean v1, v1, Lz0/a;->e:Z

    .line 13
    .line 14
    if-eqz v1, :cond_8

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-static {v3, v1}, Lz0/c;->g(Ljava/lang/Throwable;Z)Lz0/b;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    sget-boolean v4, Lz0/i;->a:Z

    .line 22
    .line 23
    invoke-static {}, Lz0/g;->m()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    const-string v5, "update_config_last_wxid"

    .line 28
    .line 29
    const-wide/16 v6, 0x0

    .line 30
    .line 31
    const-string v8, "startReloadIfChangedUnexpectedly"

    .line 32
    .line 33
    const-string v9, "getSharedPreferences(...)"

    .line 34
    .line 35
    const/4 v10, 0x4

    .line 36
    const-string v11, "app"

    .line 37
    .line 38
    const/4 v12, 0x1

    .line 39
    if-nez p1, :cond_2

    .line 40
    .line 41
    if-eqz v2, :cond_2

    .line 42
    .line 43
    invoke-static {v11, v10, v9}, LL/d;->f(Ljava/lang/String;ILjava/lang/String;)Landroid/content/SharedPreferences;

    .line 44
    .line 45
    .line 46
    move-result-object v13

    .line 47
    :try_start_0
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    move-result-object v14

    .line 51
    invoke-virtual {v14, v8, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 52
    .line 53
    .line 54
    move-result-object v14

    .line 55
    invoke-virtual {v14, v12}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v14, v13, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    .line 60
    .line 61
    :catchall_0
    const-string v14, "update_config_last_refresh_time"

    .line 62
    .line 63
    invoke-interface {v13, v14, v6, v7}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 64
    .line 65
    .line 66
    move-result-wide v14

    .line 67
    const-string v1, ""

    .line 68
    .line 69
    invoke-interface {v13, v5, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v13

    .line 73
    if-nez v13, :cond_0

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_0
    move-object v1, v13

    .line 77
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 78
    .line 79
    .line 80
    move-result-wide v16

    .line 81
    sub-long v16, v16, v14

    .line 82
    .line 83
    const-wide/32 v13, 0x5265c00

    .line 84
    .line 85
    .line 86
    cmp-long v13, v16, v13

    .line 87
    .line 88
    if-gez v13, :cond_2

    .line 89
    .line 90
    invoke-static {v4}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 91
    .line 92
    .line 93
    move-result v13

    .line 94
    if-nez v13, :cond_1

    .line 95
    .line 96
    invoke-virtual {v4, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    if-nez v1, :cond_1

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_1
    invoke-interface {v0, v2}, LM0/l;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    return-void

    .line 107
    :cond_2
    :goto_1
    const/16 v1, 0xfff

    .line 108
    .line 109
    const-string v13, "update_config_last_attempt_time"

    .line 110
    .line 111
    if-nez p1, :cond_5

    .line 112
    .line 113
    invoke-static {v11, v10, v9}, LL/d;->f(Ljava/lang/String;ILjava/lang/String;)Landroid/content/SharedPreferences;

    .line 114
    .line 115
    .line 116
    move-result-object v14

    .line 117
    :try_start_1
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    move-result-object v15

    .line 121
    invoke-virtual {v15, v8, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 122
    .line 123
    .line 124
    move-result-object v15

    .line 125
    invoke-virtual {v15, v12}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v15, v14, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 129
    .line 130
    .line 131
    :catchall_1
    invoke-interface {v14, v13, v6, v7}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 132
    .line 133
    .line 134
    move-result-wide v6

    .line 135
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 136
    .line 137
    .line 138
    move-result-wide v14

    .line 139
    sub-long/2addr v14, v6

    .line 140
    const-wide/32 v6, 0x927c0

    .line 141
    .line 142
    .line 143
    cmp-long v6, v14, v6

    .line 144
    .line 145
    if-ltz v6, :cond_3

    .line 146
    .line 147
    goto :goto_2

    .line 148
    :cond_3
    if-nez v2, :cond_4

    .line 149
    .line 150
    new-instance v2, Lz0/b;

    .line 151
    .line 152
    invoke-direct {v2, v3, v1}, Lz0/b;-><init>(Ljava/lang/Throwable;I)V

    .line 153
    .line 154
    .line 155
    :cond_4
    invoke-interface {v0, v2}, LM0/l;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    return-void

    .line 159
    :cond_5
    :goto_2
    sget-object v6, Lz0/d;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 160
    .line 161
    const/4 v7, 0x0

    .line 162
    invoke-virtual {v6, v7, v12}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 163
    .line 164
    .line 165
    move-result v6

    .line 166
    if-nez v6, :cond_7

    .line 167
    .line 168
    if-nez v2, :cond_6

    .line 169
    .line 170
    new-instance v2, Lz0/b;

    .line 171
    .line 172
    invoke-direct {v2, v3, v1}, Lz0/b;-><init>(Ljava/lang/Throwable;I)V

    .line 173
    .line 174
    .line 175
    :cond_6
    invoke-interface {v0, v2}, LM0/l;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    return-void

    .line 179
    :cond_7
    invoke-static {v11, v10, v9}, LL/d;->f(Ljava/lang/String;ILjava/lang/String;)Landroid/content/SharedPreferences;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    :try_start_2
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    move-result-object v6

    .line 187
    invoke-virtual {v6, v8, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 188
    .line 189
    .line 190
    move-result-object v6

    .line 191
    invoke-virtual {v6, v12}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v6, v1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 195
    .line 196
    .line 197
    :catchall_2
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 202
    .line 203
    .line 204
    move-result-wide v6

    .line 205
    invoke-interface {v1, v13, v6, v7}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    invoke-interface {v1, v5, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 214
    .line 215
    .line 216
    new-instance v1, Lorg/json/JSONObject;

    .line 217
    .line 218
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 219
    .line 220
    .line 221
    const-string v3, "wxid"

    .line 222
    .line 223
    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    const-string v3, "appVersionCode"

    .line 228
    .line 229
    const/16 v5, 0x403

    .line 230
    .line 231
    invoke-virtual {v1, v3, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    const-string v3, "appVersionName"

    .line 236
    .line 237
    const-string v5, "3.0.2d"

    .line 238
    .line 239
    invoke-virtual {v1, v3, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 240
    .line 241
    .line 242
    move-result-object v1

    .line 243
    const-string v3, "put(...)"

    .line 244
    .line 245
    invoke-static {v1, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    invoke-static {v1}, Lz0/r;->a(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 249
    .line 250
    .line 251
    move-result-object v1

    .line 252
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v1

    .line 256
    const-string v3, "toString(...)"

    .line 257
    .line 258
    invoke-static {v1, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    sget-object v3, LD0/d;->a:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 262
    .line 263
    const/4 v3, 0x5

    .line 264
    new-array v3, v3, [C

    .line 265
    .line 266
    fill-array-data v3, :array_0

    .line 267
    .line 268
    .line 269
    invoke-static {v3}, Lz0/r;->d([C)Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v3

    .line 273
    new-instance v5, Lo0/a;

    .line 274
    .line 275
    invoke-direct {v5, v4, v2, v0}, Lo0/a;-><init>(Ljava/lang/String;Lz0/b;LM0/l;)V

    .line 276
    .line 277
    .line 278
    invoke-static {v3, v1, v5}, LD/h;->L(Ljava/lang/String;Ljava/lang/String;LM0/l;)V

    .line 279
    .line 280
    .line 281
    return-void

    .line 282
    :cond_8
    new-instance v1, Lz0/b;

    .line 283
    .line 284
    const/16 v2, 0xffc

    .line 285
    .line 286
    invoke-direct {v1, v3, v2}, Lz0/b;-><init>(Ljava/lang/Throwable;I)V

    .line 287
    .line 288
    .line 289
    invoke-interface {v0, v1}, LM0/l;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    return-void

    .line 293
    :array_0
    .array-data 2
        0x63s
        0x68s
        0x65s
        0x63s
        0x6bs
    .end array-data
.end method
