.class public abstract LA0/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/Object;

.field public static b:Ljava/lang/String;

.field public static c:Lorg/luckypray/dexkit/DexKitBridge;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LA0/l;->a:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method

.method public static A(Ljava/util/List;)Lorg/json/JSONArray;
    .locals 5

    .line 1
    new-instance v0, Lorg/json/JSONArray;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, LA0/X;

    .line 21
    .line 22
    new-instance v2, Lorg/json/JSONObject;

    .line 23
    .line 24
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 25
    .line 26
    .line 27
    iget-object v3, v1, LA0/X;->a:Ljava/lang/String;

    .line 28
    .line 29
    const-string v4, "className"

    .line 30
    .line 31
    invoke-virtual {v2, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    const-string v3, "methodName"

    .line 36
    .line 37
    iget-object v4, v1, LA0/X;->b:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    const-string v3, "methodSign"

    .line 44
    .line 45
    iget-object v1, v1, LA0/X;->c:Ljava/lang/String;

    .line 46
    .line 47
    invoke-virtual {v2, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    return-object v0
.end method

.method public static B(Ljava/lang/String;LM0/l;)Ljava/lang/Object;
    .locals 2

    .line 1
    const-string v0, "apkPath"

    .line 2
    .line 3
    invoke-static {p0, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, LA0/l;->a:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    sget-object v1, LA0/l;->b:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v1, p0}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    sget-object v1, LA0/l;->c:Lorg/luckypray/dexkit/DexKitBridge;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception p0

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    :try_start_1
    sget-object v1, LA0/l;->c:Lorg/luckypray/dexkit/DexKitBridge;

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    invoke-virtual {v1}, Lorg/luckypray/dexkit/DexKitBridge;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 27
    .line 28
    .line 29
    :catchall_1
    :cond_1
    const/4 v1, 0x0

    .line 30
    :try_start_2
    sput-object v1, LA0/l;->c:Lorg/luckypray/dexkit/DexKitBridge;

    .line 31
    .line 32
    sput-object v1, LA0/l;->b:Ljava/lang/String;

    .line 33
    .line 34
    :goto_0
    if-nez v1, :cond_2

    .line 35
    .line 36
    new-instance v1, Lorg/luckypray/dexkit/DexKitBridge;

    .line 37
    .line 38
    invoke-direct {v1, p0}, Lorg/luckypray/dexkit/DexKitBridge;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    sput-object p0, LA0/l;->b:Ljava/lang/String;

    .line 42
    .line 43
    sput-object v1, LA0/l;->c:Lorg/luckypray/dexkit/DexKitBridge;

    .line 44
    .line 45
    :cond_2
    invoke-interface {p1, v1}, LM0/l;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 49
    monitor-exit v0

    .line 50
    return-object p0

    .line 51
    :goto_1
    monitor-exit v0

    .line 52
    throw p0
.end method

.method public static a(Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const-string v2, "hook_point_cache"

    .line 7
    .line 8
    invoke-virtual {v0, v2, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "getSharedPreferences(...)"

    .line 13
    .line 14
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {v0, p0}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public static b(Ljava/lang/String;)LA0/D;
    .locals 12

    .line 1
    const-string v0, "optString(...)"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "hook_point_cache"

    .line 5
    .line 6
    const-string v3, "getSharedPreferences(...)"

    .line 7
    .line 8
    invoke-static {v2, v1, v3}, LL/d;->f(Ljava/lang/String;ILjava/lang/String;)Landroid/content/SharedPreferences;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const/4 v2, 0x0

    .line 13
    :try_start_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    const-string v4, "startReloadIfChangedUnexpectedly"

    .line 18
    .line 19
    invoke-virtual {v3, v4, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    const/4 v4, 0x1

    .line 24
    invoke-virtual {v3, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v3, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    .line 30
    :catchall_0
    invoke-interface {v1, p0, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    if-nez v1, :cond_0

    .line 35
    .line 36
    return-object v2

    .line 37
    :cond_0
    :try_start_1
    new-instance v3, Lorg/json/JSONObject;

    .line 38
    .line 39
    invoke-direct {v3, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const/4 v1, 0x2

    .line 43
    invoke-static {v3, v1}, LA0/l;->r(Lorg/json/JSONObject;I)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-nez v1, :cond_1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    new-instance v4, LA0/D;

    .line 51
    .line 52
    const-string v1, "className"

    .line 53
    .line 54
    invoke-virtual {v3, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    invoke-static {v5, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    const-string v1, "methodName"

    .line 62
    .line 63
    invoke-virtual {v3, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    invoke-static {v6, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    const-string v1, "methodSign"

    .line 71
    .line 72
    invoke-virtual {v3, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v7

    .line 76
    invoke-static {v7, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    const-string v1, "versionCode"

    .line 80
    .line 81
    const/4 v8, -0x1

    .line 82
    invoke-virtual {v3, v1, v8}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 83
    .line 84
    .line 85
    move-result v8

    .line 86
    const-string v1, "versionName"

    .line 87
    .line 88
    invoke-virtual {v3, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v9

    .line 92
    invoke-static {v9, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    const-string v0, "updatedAt"

    .line 96
    .line 97
    const-wide/16 v10, 0x0

    .line 98
    .line 99
    invoke-virtual {v3, v0, v10, v11}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 100
    .line 101
    .line 102
    move-result-wide v10

    .line 103
    invoke-direct/range {v4 .. v11}, LA0/D;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;J)V

    .line 104
    .line 105
    .line 106
    invoke-static {v5}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-nez v0, :cond_2

    .line 111
    .line 112
    invoke-static {v6}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    if-nez v0, :cond_2

    .line 117
    .line 118
    invoke-static {v7}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 119
    .line 120
    .line 121
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 122
    if-nez v0, :cond_2

    .line 123
    .line 124
    goto :goto_2

    .line 125
    :catchall_1
    move-exception v0

    .line 126
    goto :goto_1

    .line 127
    :cond_2
    :goto_0
    move-object v4, v2

    .line 128
    goto :goto_2

    .line 129
    :goto_1
    new-instance v4, LE0/d;

    .line 130
    .line 131
    invoke-direct {v4, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 132
    .line 133
    .line 134
    :goto_2
    invoke-static {v4}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    if-eqz v0, :cond_3

    .line 139
    .line 140
    const-string v1, "hook point cache read fail"

    .line 141
    .line 142
    filled-new-array {v1, p0, v0}, [Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    invoke-static {p0}, LA0/l;->a(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    :cond_3
    instance-of p0, v4, LE0/d;

    .line 153
    .line 154
    if-eqz p0, :cond_4

    .line 155
    .line 156
    goto :goto_3

    .line 157
    :cond_4
    move-object v2, v4

    .line 158
    :goto_3
    check-cast v2, LA0/D;

    .line 159
    .line 160
    return-object v2
.end method

.method public static c(Landroid/content/Context;)LA0/b;
    .locals 3

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p0, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p0, "anti_revoke_revoke_method"

    .line 7
    .line 8
    invoke-static {p0}, LA0/l;->b(Ljava/lang/String;)LA0/D;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    const/4 v0, 0x0

    .line 13
    if-eqz p0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, LA0/D;->a()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-object p0, v0

    .line 23
    :goto_0
    if-eqz p0, :cond_1

    .line 24
    .line 25
    new-instance v0, LA0/b;

    .line 26
    .line 27
    iget-object v1, p0, LA0/D;->c:Ljava/lang/String;

    .line 28
    .line 29
    iget-object v2, p0, LA0/D;->a:Ljava/lang/String;

    .line 30
    .line 31
    iget-object p0, p0, LA0/D;->b:Ljava/lang/String;

    .line 32
    .line 33
    invoke-direct {v0, v2, p0, v1}, LA0/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    return-object v0
.end method

.method public static d(Landroid/content/Context;)LA0/c;
    .locals 3

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p0, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p0, "anti_revoke_message_storage_method_v1"

    .line 7
    .line 8
    invoke-static {p0}, LA0/l;->b(Ljava/lang/String;)LA0/D;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    const/4 v0, 0x0

    .line 13
    if-eqz p0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, LA0/D;->a()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-object p0, v0

    .line 23
    :goto_0
    if-eqz p0, :cond_1

    .line 24
    .line 25
    new-instance v0, LA0/c;

    .line 26
    .line 27
    iget-object v1, p0, LA0/D;->c:Ljava/lang/String;

    .line 28
    .line 29
    iget-object v2, p0, LA0/D;->a:Ljava/lang/String;

    .line 30
    .line 31
    iget-object p0, p0, LA0/D;->b:Ljava/lang/String;

    .line 32
    .line 33
    invoke-direct {v0, v2, p0, v1}, LA0/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    return-object v0
.end method

.method public static e(Landroid/content/Context;)LA0/i;
    .locals 19

    .line 1
    const-string v0, "optString(...)"

    .line 2
    .line 3
    const-string v1, "hook_point_cache"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "getSharedPreferences(...)"

    .line 7
    .line 8
    invoke-static {v1, v2, v3}, LL/d;->f(Ljava/lang/String;ILjava/lang/String;)Landroid/content/SharedPreferences;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const/4 v3, 0x0

    .line 13
    :try_start_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    const-string v5, "startReloadIfChangedUnexpectedly"

    .line 18
    .line 19
    invoke-virtual {v4, v5, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    const/4 v5, 0x1

    .line 24
    invoke-virtual {v4, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v4, v1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    .line 30
    :catchall_0
    const-string v4, "contact_mvvm_address"

    .line 31
    .line 32
    invoke-interface {v1, v4, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    if-nez v1, :cond_0

    .line 37
    .line 38
    move-object v6, v3

    .line 39
    goto/16 :goto_6

    .line 40
    .line 41
    :cond_0
    :try_start_1
    new-instance v5, Lorg/json/JSONObject;

    .line 42
    .line 43
    invoke-direct {v5, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const/4 v1, 0x3

    .line 47
    invoke-static {v5, v1}, LA0/l;->r(Lorg/json/JSONObject;I)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-nez v1, :cond_1

    .line 52
    .line 53
    move-object v6, v3

    .line 54
    move-object v2, v4

    .line 55
    goto/16 :goto_5

    .line 56
    .line 57
    :cond_1
    const-string v1, "mvvmFragmentClassName"

    .line 58
    .line 59
    invoke-virtual {v5, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v7

    .line 63
    invoke-static {v7, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    const-string v1, "addressLiveListClassName"

    .line 67
    .line 68
    invoke-virtual {v5, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v8

    .line 72
    invoke-static {v8, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    const-string v1, "liveListSubmitMethodName"

    .line 76
    .line 77
    invoke-virtual {v5, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v9

    .line 81
    invoke-static {v9, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    const-string v1, "liveListGetterName"

    .line 85
    .line 86
    invoke-virtual {v5, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v10

    .line 90
    invoke-static {v10, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    const-string v1, "adapterGetterName"

    .line 94
    .line 95
    invoke-virtual {v5, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v11

    .line 99
    invoke-static {v11, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    const-string v1, "mvvmAdapterClassNames"

    .line 103
    .line 104
    invoke-virtual {v5, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    if-eqz v1, :cond_4

    .line 109
    .line 110
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    .line 111
    .line 112
    .line 113
    move-result v6

    .line 114
    invoke-static {v2, v6}, LD/h;->U(II)LR0/c;

    .line 115
    .line 116
    .line 117
    move-result-object v6

    .line 118
    new-instance v12, Ljava/util/ArrayList;

    .line 119
    .line 120
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v6}, LR0/a;->iterator()Ljava/util/Iterator;

    .line 124
    .line 125
    .line 126
    move-result-object v6

    .line 127
    :cond_2
    :goto_0
    move-object v13, v6

    .line 128
    check-cast v13, LR0/b;

    .line 129
    .line 130
    iget-boolean v13, v13, LR0/b;->c:Z

    .line 131
    .line 132
    if-eqz v13, :cond_5

    .line 133
    .line 134
    move-object v13, v6

    .line 135
    check-cast v13, LR0/b;

    .line 136
    .line 137
    invoke-virtual {v13}, LR0/b;->a()I

    .line 138
    .line 139
    .line 140
    move-result v13

    .line 141
    invoke-virtual {v1, v13}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v13

    .line 145
    invoke-static {v13}, LN0/g;->b(Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    invoke-static {v13}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 149
    .line 150
    .line 151
    move-result v14

    .line 152
    if-nez v14, :cond_3

    .line 153
    .line 154
    goto :goto_1

    .line 155
    :cond_3
    move-object v13, v3

    .line 156
    :goto_1
    if-eqz v13, :cond_2

    .line 157
    .line 158
    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 159
    .line 160
    .line 161
    goto :goto_0

    .line 162
    :catchall_1
    move-exception v0

    .line 163
    move-object v2, v4

    .line 164
    goto/16 :goto_4

    .line 165
    .line 166
    :cond_4
    move-object v12, v3

    .line 167
    :cond_5
    sget-object v1, LF0/s;->a:LF0/s;

    .line 168
    .line 169
    if-nez v12, :cond_6

    .line 170
    .line 171
    move-object v12, v1

    .line 172
    :cond_6
    :try_start_2
    const-string v6, "mvvmItemClassNames"

    .line 173
    .line 174
    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 175
    .line 176
    .line 177
    move-result-object v6

    .line 178
    if-eqz v6, :cond_9

    .line 179
    .line 180
    invoke-virtual {v6}, Lorg/json/JSONArray;->length()I

    .line 181
    .line 182
    .line 183
    move-result v13

    .line 184
    invoke-static {v2, v13}, LD/h;->U(II)LR0/c;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    new-instance v13, Ljava/util/ArrayList;

    .line 189
    .line 190
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v2}, LR0/a;->iterator()Ljava/util/Iterator;

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    :cond_7
    :goto_2
    move-object v14, v2

    .line 198
    check-cast v14, LR0/b;

    .line 199
    .line 200
    iget-boolean v14, v14, LR0/b;->c:Z

    .line 201
    .line 202
    if-eqz v14, :cond_a

    .line 203
    .line 204
    move-object v14, v2

    .line 205
    check-cast v14, LR0/b;

    .line 206
    .line 207
    invoke-virtual {v14}, LR0/b;->a()I

    .line 208
    .line 209
    .line 210
    move-result v14

    .line 211
    invoke-virtual {v6, v14}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v14

    .line 215
    invoke-static {v14}, LN0/g;->b(Ljava/lang/Object;)V

    .line 216
    .line 217
    .line 218
    invoke-static {v14}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 219
    .line 220
    .line 221
    move-result v15

    .line 222
    if-nez v15, :cond_8

    .line 223
    .line 224
    goto :goto_3

    .line 225
    :cond_8
    move-object v14, v3

    .line 226
    :goto_3
    if-eqz v14, :cond_7

    .line 227
    .line 228
    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    goto :goto_2

    .line 232
    :cond_9
    move-object v13, v3

    .line 233
    :cond_a
    if-nez v13, :cond_b

    .line 234
    .line 235
    move-object v13, v1

    .line 236
    :cond_b
    const-string v1, "refreshSubmitMethodName"

    .line 237
    .line 238
    invoke-virtual {v5, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v14

    .line 242
    invoke-static {v14, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    const-string v1, "versionCode"

    .line 246
    .line 247
    const/4 v2, -0x1

    .line 248
    invoke-virtual {v5, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 249
    .line 250
    .line 251
    move-result v15

    .line 252
    const-string v1, "versionName"

    .line 253
    .line 254
    invoke-virtual {v5, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    invoke-static {v1, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    const-string v0, "updatedAt"
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 262
    .line 263
    move-object v2, v4

    .line 264
    const-wide/16 v3, 0x0

    .line 265
    .line 266
    :try_start_3
    invoke-virtual {v5, v0, v3, v4}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 267
    .line 268
    .line 269
    move-result-wide v17

    .line 270
    new-instance v6, LA0/A;

    .line 271
    .line 272
    move-object/from16 v16, v1

    .line 273
    .line 274
    invoke-direct/range {v6 .. v18}, LA0/A;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ILjava/lang/String;J)V

    .line 275
    .line 276
    .line 277
    invoke-static {v7}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 278
    .line 279
    .line 280
    move-result v0

    .line 281
    if-nez v0, :cond_c

    .line 282
    .line 283
    invoke-static {v8}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 284
    .line 285
    .line 286
    move-result v0

    .line 287
    if-nez v0, :cond_c

    .line 288
    .line 289
    invoke-static {v9}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 290
    .line 291
    .line 292
    move-result v0

    .line 293
    if-nez v0, :cond_c

    .line 294
    .line 295
    invoke-static {v10}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 296
    .line 297
    .line 298
    move-result v0

    .line 299
    if-nez v0, :cond_c

    .line 300
    .line 301
    invoke-static {v11}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 302
    .line 303
    .line 304
    move-result v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 305
    if-nez v0, :cond_c

    .line 306
    .line 307
    goto :goto_5

    .line 308
    :catchall_2
    move-exception v0

    .line 309
    goto :goto_4

    .line 310
    :cond_c
    const/4 v6, 0x0

    .line 311
    goto :goto_5

    .line 312
    :goto_4
    new-instance v6, LE0/d;

    .line 313
    .line 314
    invoke-direct {v6, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 315
    .line 316
    .line 317
    :goto_5
    invoke-static {v6}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    if-eqz v0, :cond_d

    .line 322
    .line 323
    const-string v1, "contact hook point cache read fail"

    .line 324
    .line 325
    filled-new-array {v1, v2, v0}, [Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 330
    .line 331
    .line 332
    invoke-static {v2}, LA0/l;->a(Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    :cond_d
    instance-of v0, v6, LE0/d;

    .line 336
    .line 337
    if-eqz v0, :cond_e

    .line 338
    .line 339
    const/4 v6, 0x0

    .line 340
    :cond_e
    check-cast v6, LA0/A;

    .line 341
    .line 342
    :goto_6
    if-eqz v6, :cond_10

    .line 343
    .line 344
    invoke-static {}, Lz0/r;->p()I

    .line 345
    .line 346
    .line 347
    move-result v0

    .line 348
    iget v1, v6, LA0/A;->i:I

    .line 349
    .line 350
    if-ne v1, v0, :cond_f

    .line 351
    .line 352
    invoke-static {}, Lz0/r;->q()Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    iget-object v1, v6, LA0/A;->j:Ljava/lang/String;

    .line 357
    .line 358
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 359
    .line 360
    .line 361
    move-result v0

    .line 362
    if-eqz v0, :cond_f

    .line 363
    .line 364
    goto :goto_7

    .line 365
    :cond_f
    const/4 v6, 0x0

    .line 366
    :goto_7
    if-eqz v6, :cond_10

    .line 367
    .line 368
    new-instance v7, LA0/i;

    .line 369
    .line 370
    iget-object v12, v6, LA0/A;->e:Ljava/lang/String;

    .line 371
    .line 372
    iget-object v13, v6, LA0/A;->f:Ljava/lang/Object;

    .line 373
    .line 374
    iget-object v8, v6, LA0/A;->a:Ljava/lang/String;

    .line 375
    .line 376
    iget-object v9, v6, LA0/A;->b:Ljava/lang/String;

    .line 377
    .line 378
    iget-object v10, v6, LA0/A;->c:Ljava/lang/String;

    .line 379
    .line 380
    iget-object v11, v6, LA0/A;->d:Ljava/lang/String;

    .line 381
    .line 382
    iget-object v14, v6, LA0/A;->g:Ljava/lang/Object;

    .line 383
    .line 384
    iget-object v15, v6, LA0/A;->h:Ljava/lang/String;

    .line 385
    .line 386
    invoke-direct/range {v7 .. v15}, LA0/i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V

    .line 387
    .line 388
    .line 389
    move-object v3, v7

    .line 390
    goto :goto_8

    .line 391
    :cond_10
    const/4 v3, 0x0

    .line 392
    :goto_8
    return-object v3
.end method

.method public static f(Landroid/content/Context;)LA0/j;
    .locals 20

    .line 1
    const-string v0, "optString(...)"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "hook_point_cache"

    .line 5
    .line 6
    const-string v3, "getSharedPreferences(...)"

    .line 7
    .line 8
    invoke-static {v2, v1, v3}, LL/d;->f(Ljava/lang/String;ILjava/lang/String;)Landroid/content/SharedPreferences;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const/4 v2, 0x0

    .line 13
    :try_start_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    const-string v4, "startReloadIfChangedUnexpectedly"

    .line 18
    .line 19
    invoke-virtual {v3, v4, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    const/4 v4, 0x1

    .line 24
    invoke-virtual {v3, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v3, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    .line 30
    :catchall_0
    const-string v3, "conversation_mvvm_list_v2"

    .line 31
    .line 32
    invoke-interface {v1, v3, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    if-nez v1, :cond_0

    .line 37
    .line 38
    move-object v5, v2

    .line 39
    goto/16 :goto_2

    .line 40
    .line 41
    :cond_0
    :try_start_1
    new-instance v4, Lorg/json/JSONObject;

    .line 42
    .line 43
    invoke-direct {v4, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const/4 v1, 0x5

    .line 47
    invoke-static {v4, v1}, LA0/l;->r(Lorg/json/JSONObject;I)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-nez v1, :cond_1

    .line 52
    .line 53
    move-object v5, v2

    .line 54
    goto/16 :goto_1

    .line 55
    .line 56
    :cond_1
    new-instance v5, LA0/B;

    .line 57
    .line 58
    const-string v1, "adapterClassNames"

    .line 59
    .line 60
    invoke-static {v4, v1}, LA0/l;->u(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    const-string v1, "dataSourceClassNames"

    .line 65
    .line 66
    invoke-static {v4, v1}, LA0/l;->u(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object v7

    .line 70
    const-string v1, "itemClassNames"

    .line 71
    .line 72
    invoke-static {v4, v1}, LA0/l;->u(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;

    .line 73
    .line 74
    .line 75
    move-result-object v8

    .line 76
    const-string v1, "holderClassNames"

    .line 77
    .line 78
    invoke-static {v4, v1}, LA0/l;->u(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;

    .line 79
    .line 80
    .line 81
    move-result-object v9

    .line 82
    const-string v1, "requestClassNames"

    .line 83
    .line 84
    invoke-static {v4, v1}, LA0/l;->u(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;

    .line 85
    .line 86
    .line 87
    move-result-object v10

    .line 88
    const-string v1, "storageClassNames"

    .line 89
    .line 90
    invoke-static {v4, v1}, LA0/l;->u(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;

    .line 91
    .line 92
    .line 93
    move-result-object v11

    .line 94
    const-string v1, "getDataSourceMethodName"

    .line 95
    .line 96
    invoke-virtual {v4, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v12

    .line 100
    invoke-static {v12, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    const-string v1, "getConversationListMethodName"

    .line 104
    .line 105
    invoke-virtual {v4, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v13

    .line 109
    invoke-static {v13, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    const-string v1, "requestRefreshMethodName"

    .line 113
    .line 114
    invoke-virtual {v4, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v14

    .line 118
    invoke-static {v14, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    const-string v1, "submitListMethodName"

    .line 122
    .line 123
    invoke-virtual {v4, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v15

    .line 127
    invoke-static {v15, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    const-string v1, "versionCode"

    .line 131
    .line 132
    const/4 v2, -0x1

    .line 133
    invoke-virtual {v4, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 134
    .line 135
    .line 136
    move-result v16

    .line 137
    const-string v1, "versionName"

    .line 138
    .line 139
    invoke-virtual {v4, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    invoke-static {v1, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    const-string v0, "updatedAt"

    .line 147
    .line 148
    move-object/from16 v17, v1

    .line 149
    .line 150
    const-wide/16 v1, 0x0

    .line 151
    .line 152
    invoke-virtual {v4, v0, v1, v2}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 153
    .line 154
    .line 155
    move-result-wide v18

    .line 156
    invoke-direct/range {v5 .. v19}, LA0/B;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;J)V

    .line 157
    .line 158
    .line 159
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    if-nez v0, :cond_2

    .line 164
    .line 165
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 166
    .line 167
    .line 168
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 169
    if-nez v0, :cond_2

    .line 170
    .line 171
    goto :goto_1

    .line 172
    :catchall_1
    move-exception v0

    .line 173
    goto :goto_0

    .line 174
    :cond_2
    const/4 v5, 0x0

    .line 175
    goto :goto_1

    .line 176
    :goto_0
    new-instance v5, LE0/d;

    .line 177
    .line 178
    invoke-direct {v5, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 179
    .line 180
    .line 181
    :goto_1
    invoke-static {v5}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    if-eqz v0, :cond_3

    .line 186
    .line 187
    const-string v1, "conversation hook point cache read fail"

    .line 188
    .line 189
    filled-new-array {v1, v3, v0}, [Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    invoke-static {v3}, LA0/l;->a(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    :cond_3
    instance-of v0, v5, LE0/d;

    .line 200
    .line 201
    if-eqz v0, :cond_4

    .line 202
    .line 203
    const/4 v5, 0x0

    .line 204
    :cond_4
    check-cast v5, LA0/B;

    .line 205
    .line 206
    :goto_2
    if-eqz v5, :cond_6

    .line 207
    .line 208
    invoke-static {}, Lz0/r;->p()I

    .line 209
    .line 210
    .line 211
    move-result v0

    .line 212
    iget v1, v5, LA0/B;->k:I

    .line 213
    .line 214
    if-ne v1, v0, :cond_5

    .line 215
    .line 216
    invoke-static {}, Lz0/r;->q()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    iget-object v1, v5, LA0/B;->l:Ljava/lang/String;

    .line 221
    .line 222
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    move-result v0

    .line 226
    if-eqz v0, :cond_5

    .line 227
    .line 228
    goto :goto_3

    .line 229
    :cond_5
    const/4 v5, 0x0

    .line 230
    :goto_3
    if-eqz v5, :cond_6

    .line 231
    .line 232
    new-instance v6, LA0/j;

    .line 233
    .line 234
    iget-object v15, v5, LA0/B;->i:Ljava/lang/String;

    .line 235
    .line 236
    iget-object v0, v5, LA0/B;->j:Ljava/lang/String;

    .line 237
    .line 238
    iget-object v7, v5, LA0/B;->a:Ljava/lang/Object;

    .line 239
    .line 240
    iget-object v8, v5, LA0/B;->b:Ljava/lang/Object;

    .line 241
    .line 242
    iget-object v9, v5, LA0/B;->c:Ljava/lang/Object;

    .line 243
    .line 244
    iget-object v10, v5, LA0/B;->d:Ljava/lang/Object;

    .line 245
    .line 246
    iget-object v11, v5, LA0/B;->f:Ljava/lang/Object;

    .line 247
    .line 248
    iget-object v12, v5, LA0/B;->e:Ljava/lang/Object;

    .line 249
    .line 250
    iget-object v13, v5, LA0/B;->g:Ljava/lang/String;

    .line 251
    .line 252
    iget-object v14, v5, LA0/B;->h:Ljava/lang/String;

    .line 253
    .line 254
    move-object/from16 v16, v0

    .line 255
    .line 256
    invoke-direct/range {v6 .. v16}, LA0/j;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    move-object v2, v6

    .line 260
    goto :goto_4

    .line 261
    :cond_6
    const/4 v2, 0x0

    .line 262
    :goto_4
    return-object v2
.end method

.method public static g(Landroid/content/Context;)LA0/z;
    .locals 12

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p0, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const/4 v0, 0x0

    .line 11
    const-string v1, "hook_point_cache"

    .line 12
    .line 13
    invoke-virtual {p0, v1, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    const-string v0, "getSharedPreferences(...)"

    .line 18
    .line 19
    invoke-static {p0, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    const/4 v0, 0x1

    .line 24
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    const-string v3, "startReloadIfChangedUnexpectedly"

    .line 29
    .line 30
    invoke-virtual {v2, v3, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {v2, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    .line 40
    :catchall_0
    const-string v2, "group_create_contact_v1"

    .line 41
    .line 42
    invoke-interface {p0, v2, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    if-nez p0, :cond_0

    .line 47
    .line 48
    move-object v4, v1

    .line 49
    goto :goto_1

    .line 50
    :cond_0
    :try_start_1
    new-instance v3, Lorg/json/JSONObject;

    .line 51
    .line 52
    invoke-direct {v3, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-static {v3, v0}, LA0/l;->r(Lorg/json/JSONObject;I)Z

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    if-nez p0, :cond_1

    .line 60
    .line 61
    move-object v4, v1

    .line 62
    goto :goto_0

    .line 63
    :cond_1
    new-instance v4, LA0/C;

    .line 64
    .line 65
    const-string p0, "activityClassNames"

    .line 66
    .line 67
    invoke-static {v3, p0}, LA0/l;->u(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    const-string p0, "adapterClassNames"

    .line 72
    .line 73
    invoke-static {v3, p0}, LA0/l;->u(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    const-string p0, "listEntryNames"

    .line 78
    .line 79
    invoke-static {v3, p0}, LA0/l;->u(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    const-string p0, "versionCode"

    .line 84
    .line 85
    const/4 v0, -0x1

    .line 86
    invoke-virtual {v3, p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 87
    .line 88
    .line 89
    move-result v8

    .line 90
    const-string p0, "versionName"

    .line 91
    .line 92
    invoke-virtual {v3, p0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v9

    .line 96
    const-string p0, "optString(...)"

    .line 97
    .line 98
    invoke-static {v9, p0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    const-string p0, "updatedAt"

    .line 102
    .line 103
    const-wide/16 v10, 0x0

    .line 104
    .line 105
    invoke-virtual {v3, p0, v10, v11}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 106
    .line 107
    .line 108
    move-result-wide v10

    .line 109
    invoke-direct/range {v4 .. v11}, LA0/C;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;ILjava/lang/String;J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 110
    .line 111
    .line 112
    goto :goto_0

    .line 113
    :catchall_1
    move-exception v0

    .line 114
    move-object p0, v0

    .line 115
    new-instance v4, LE0/d;

    .line 116
    .line 117
    invoke-direct {v4, p0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 118
    .line 119
    .line 120
    :goto_0
    invoke-static {v4}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    if-eqz p0, :cond_2

    .line 125
    .line 126
    const-string v0, "group create contact hook point cache read fail"

    .line 127
    .line 128
    filled-new-array {v0, p0}, [Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    invoke-static {p0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    invoke-static {v2}, LA0/l;->a(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    :cond_2
    instance-of p0, v4, LE0/d;

    .line 139
    .line 140
    if-eqz p0, :cond_3

    .line 141
    .line 142
    move-object v4, v1

    .line 143
    :cond_3
    check-cast v4, LA0/C;

    .line 144
    .line 145
    :goto_1
    if-eqz v4, :cond_6

    .line 146
    .line 147
    invoke-static {}, Lz0/r;->p()I

    .line 148
    .line 149
    .line 150
    move-result p0

    .line 151
    iget v0, v4, LA0/C;->d:I

    .line 152
    .line 153
    if-ne v0, p0, :cond_4

    .line 154
    .line 155
    invoke-static {}, Lz0/r;->q()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    iget-object v0, v4, LA0/C;->e:Ljava/lang/String;

    .line 160
    .line 161
    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result p0

    .line 165
    if-eqz p0, :cond_4

    .line 166
    .line 167
    goto :goto_2

    .line 168
    :cond_4
    move-object v4, v1

    .line 169
    :goto_2
    if-eqz v4, :cond_6

    .line 170
    .line 171
    iget-object p0, v4, LA0/C;->a:Ljava/lang/Object;

    .line 172
    .line 173
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 174
    .line 175
    .line 176
    move-result p0

    .line 177
    if-nez p0, :cond_5

    .line 178
    .line 179
    iget-object p0, v4, LA0/C;->b:Ljava/lang/Object;

    .line 180
    .line 181
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 182
    .line 183
    .line 184
    move-result p0

    .line 185
    if-nez p0, :cond_5

    .line 186
    .line 187
    iget-object p0, v4, LA0/C;->c:Ljava/lang/Object;

    .line 188
    .line 189
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 190
    .line 191
    .line 192
    move-result p0

    .line 193
    if-nez p0, :cond_5

    .line 194
    .line 195
    goto :goto_3

    .line 196
    :cond_5
    move-object v4, v1

    .line 197
    :goto_3
    if-eqz v4, :cond_6

    .line 198
    .line 199
    new-instance v1, LA0/z;

    .line 200
    .line 201
    iget-object p0, v4, LA0/C;->c:Ljava/lang/Object;

    .line 202
    .line 203
    iget-object v0, v4, LA0/C;->a:Ljava/lang/Object;

    .line 204
    .line 205
    iget-object v2, v4, LA0/C;->b:Ljava/lang/Object;

    .line 206
    .line 207
    invoke-direct {v1, v0, v2, p0}, LA0/z;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 208
    .line 209
    .line 210
    :cond_6
    return-object v1
.end method

.method public static h(Landroid/content/Context;)LA0/M;
    .locals 10

    .line 1
    const-string p0, "optString(...)"

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const-string v1, "hook_point_cache"

    .line 5
    .line 6
    const-string v2, "getSharedPreferences(...)"

    .line 7
    .line 8
    invoke-static {v1, v0, v2}, LL/d;->f(Ljava/lang/String;ILjava/lang/String;)Landroid/content/SharedPreferences;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x0

    .line 13
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const-string v3, "startReloadIfChangedUnexpectedly"

    .line 18
    .line 19
    invoke-virtual {v2, v3, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    const/4 v3, 0x1

    .line 24
    invoke-virtual {v2, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2, v0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    .line 30
    :catchall_0
    const-string v2, "conversation_legacy_list"

    .line 31
    .line 32
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    if-nez v0, :cond_0

    .line 37
    .line 38
    :goto_0
    move-object v3, v1

    .line 39
    goto :goto_1

    .line 40
    :cond_0
    :try_start_1
    new-instance v2, Lorg/json/JSONObject;

    .line 41
    .line 42
    invoke-direct {v2, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 v0, 0x2

    .line 46
    invoke-static {v2, v0}, LA0/l;->r(Lorg/json/JSONObject;I)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-nez v0, :cond_1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    new-instance v3, LA0/M;

    .line 54
    .line 55
    const-string v0, "adapterClassName"

    .line 56
    .line 57
    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    invoke-static {v4, p0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const-string v0, "itemClassName"

    .line 65
    .line 66
    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    invoke-static {v5, p0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    const-string v0, "getItemMethodName"

    .line 74
    .line 75
    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    invoke-static {v6, p0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    const-string v0, "usernameMethodName"

    .line 83
    .line 84
    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v7

    .line 88
    invoke-static {v7, p0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    const-string v0, "versionCode"

    .line 92
    .line 93
    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 94
    .line 95
    .line 96
    move-result v8

    .line 97
    const-string v0, "versionName"

    .line 98
    .line 99
    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v9

    .line 103
    invoke-static {v9, p0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    invoke-direct/range {v3 .. v9}, LA0/M;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 107
    .line 108
    .line 109
    goto :goto_1

    .line 110
    :catchall_1
    move-exception v0

    .line 111
    move-object p0, v0

    .line 112
    const-string v0, "HookPointCache"

    .line 113
    .line 114
    const-string v2, "read legacy conversation hook point fail"

    .line 115
    .line 116
    filled-new-array {v0, v2, p0}, [Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    invoke-static {p0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    goto :goto_0

    .line 124
    :goto_1
    if-eqz v3, :cond_2

    .line 125
    .line 126
    invoke-static {}, Lz0/r;->p()I

    .line 127
    .line 128
    .line 129
    move-result p0

    .line 130
    iget v0, v3, LA0/M;->e:I

    .line 131
    .line 132
    if-ne v0, p0, :cond_2

    .line 133
    .line 134
    invoke-static {}, Lz0/r;->q()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    iget-object v0, v3, LA0/M;->f:Ljava/lang/String;

    .line 139
    .line 140
    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result p0

    .line 144
    if-eqz p0, :cond_2

    .line 145
    .line 146
    move-object v1, v3

    .line 147
    :cond_2
    return-object v1
.end method

.method public static i(Landroid/content/Context;)LA0/N;
    .locals 21

    .line 1
    const-string v0, "hook_point_cache"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "getSharedPreferences(...)"

    .line 5
    .line 6
    invoke-static {v0, v1, v2}, LL/d;->f(Ljava/lang/String;ILjava/lang/String;)Landroid/content/SharedPreferences;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v2, 0x0

    .line 11
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    const-string v4, "startReloadIfChangedUnexpectedly"

    .line 16
    .line 17
    invoke-virtual {v3, v4, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    const/4 v4, 0x1

    .line 22
    invoke-virtual {v3, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v3, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    .line 28
    :catchall_0
    const-string v3, "quick_add_menu_v10"

    .line 29
    .line 30
    invoke-interface {v0, v3, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    if-nez v0, :cond_0

    .line 35
    .line 36
    move-object v5, v2

    .line 37
    goto/16 :goto_9

    .line 38
    .line 39
    :cond_0
    :try_start_1
    new-instance v4, Lorg/json/JSONObject;

    .line 40
    .line 41
    invoke-direct {v4, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    const/4 v0, 0x5

    .line 45
    invoke-static {v4, v0}, LA0/l;->r(Lorg/json/JSONObject;I)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-nez v0, :cond_1

    .line 50
    .line 51
    move-object v5, v2

    .line 52
    move-object/from16 v20, v3

    .line 53
    .line 54
    goto/16 :goto_8

    .line 55
    .line 56
    :cond_1
    const-string v0, "conversationLongClickClassNames"

    .line 57
    .line 58
    invoke-static {v4, v0}, LA0/l;->u(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    const-string v0, "conversationMenuCallbackClassNames"

    .line 63
    .line 64
    invoke-static {v4, v0}, LA0/l;->u(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;

    .line 65
    .line 66
    .line 67
    move-result-object v7

    .line 68
    const-string v0, "popupClassNames"

    .line 69
    .line 70
    invoke-static {v4, v0}, LA0/l;->u(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;

    .line 71
    .line 72
    .line 73
    move-result-object v8

    .line 74
    const-string v0, "popupCreateSpecs"

    .line 75
    .line 76
    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 77
    .line 78
    .line 79
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 80
    const-string v5, "methodName"

    .line 81
    .line 82
    const-string v9, "popupClassName"

    .line 83
    .line 84
    if-eqz v0, :cond_6

    .line 85
    .line 86
    :try_start_2
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 87
    .line 88
    .line 89
    move-result v10

    .line 90
    invoke-static {v1, v10}, LD/h;->U(II)LR0/c;

    .line 91
    .line 92
    .line 93
    move-result-object v10

    .line 94
    new-instance v11, Ljava/util/ArrayList;

    .line 95
    .line 96
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v10}, LR0/a;->iterator()Ljava/util/Iterator;

    .line 100
    .line 101
    .line 102
    move-result-object v10

    .line 103
    :cond_2
    :goto_0
    move-object v12, v10

    .line 104
    check-cast v12, LR0/b;

    .line 105
    .line 106
    iget-boolean v12, v12, LR0/b;->c:Z

    .line 107
    .line 108
    if-eqz v12, :cond_7

    .line 109
    .line 110
    move-object v12, v10

    .line 111
    check-cast v12, LR0/b;

    .line 112
    .line 113
    invoke-virtual {v12}, LR0/b;->a()I

    .line 114
    .line 115
    .line 116
    move-result v12

    .line 117
    invoke-virtual {v0, v12}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 118
    .line 119
    .line 120
    move-result-object v12

    .line 121
    if-nez v12, :cond_4

    .line 122
    .line 123
    :cond_3
    :goto_1
    move-object v15, v2

    .line 124
    goto :goto_2

    .line 125
    :cond_4
    invoke-virtual {v12, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v13

    .line 129
    const-string v14, "callbackClassName"

    .line 130
    .line 131
    invoke-virtual {v12, v14}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v14

    .line 135
    const-string v15, "g"

    .line 136
    .line 137
    invoke-virtual {v12, v5, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v12

    .line 141
    invoke-static {v13}, LN0/g;->b(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    invoke-static {v13}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 145
    .line 146
    .line 147
    move-result v15

    .line 148
    if-nez v15, :cond_3

    .line 149
    .line 150
    invoke-static {v14}, LN0/g;->b(Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    invoke-static {v14}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 154
    .line 155
    .line 156
    move-result v15

    .line 157
    if-eqz v15, :cond_5

    .line 158
    .line 159
    goto :goto_1

    .line 160
    :cond_5
    new-instance v15, LA0/O;

    .line 161
    .line 162
    invoke-static {v12}, LN0/g;->b(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    invoke-direct {v15, v13, v14, v12}, LA0/O;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    goto :goto_2

    .line 169
    :catchall_1
    move-exception v0

    .line 170
    move-object/from16 v20, v3

    .line 171
    .line 172
    goto/16 :goto_7

    .line 173
    .line 174
    :goto_2
    if-eqz v15, :cond_2

    .line 175
    .line 176
    invoke-virtual {v11, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 177
    .line 178
    .line 179
    goto :goto_0

    .line 180
    :cond_6
    move-object v11, v2

    .line 181
    :cond_7
    sget-object v0, LF0/s;->a:LF0/s;

    .line 182
    .line 183
    if-nez v11, :cond_8

    .line 184
    .line 185
    move-object v11, v0

    .line 186
    :cond_8
    :try_start_3
    const-string v10, "popupBuildSpecs"

    .line 187
    .line 188
    invoke-virtual {v4, v10}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 189
    .line 190
    .line 191
    move-result-object v10

    .line 192
    if-eqz v10, :cond_d

    .line 193
    .line 194
    invoke-virtual {v10}, Lorg/json/JSONArray;->length()I

    .line 195
    .line 196
    .line 197
    move-result v12

    .line 198
    invoke-static {v1, v12}, LD/h;->U(II)LR0/c;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    new-instance v12, Ljava/util/ArrayList;

    .line 203
    .line 204
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v1}, LR0/a;->iterator()Ljava/util/Iterator;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    :cond_9
    :goto_3
    move-object v13, v1

    .line 212
    check-cast v13, LR0/b;

    .line 213
    .line 214
    iget-boolean v13, v13, LR0/b;->c:Z

    .line 215
    .line 216
    if-eqz v13, :cond_e

    .line 217
    .line 218
    move-object v13, v1

    .line 219
    check-cast v13, LR0/b;

    .line 220
    .line 221
    invoke-virtual {v13}, LR0/b;->a()I

    .line 222
    .line 223
    .line 224
    move-result v13

    .line 225
    invoke-virtual {v10, v13}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 226
    .line 227
    .line 228
    move-result-object v13

    .line 229
    if-nez v13, :cond_b

    .line 230
    .line 231
    :cond_a
    :goto_4
    move-object v15, v2

    .line 232
    goto :goto_5

    .line 233
    :cond_b
    invoke-virtual {v13, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v14

    .line 237
    invoke-virtual {v13, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v13

    .line 241
    invoke-static {v14}, LN0/g;->b(Ljava/lang/Object;)V

    .line 242
    .line 243
    .line 244
    invoke-static {v14}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 245
    .line 246
    .line 247
    move-result v15

    .line 248
    if-nez v15, :cond_a

    .line 249
    .line 250
    invoke-static {v13}, LN0/g;->b(Ljava/lang/Object;)V

    .line 251
    .line 252
    .line 253
    invoke-static {v13}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 254
    .line 255
    .line 256
    move-result v15

    .line 257
    if-eqz v15, :cond_c

    .line 258
    .line 259
    goto :goto_4

    .line 260
    :cond_c
    new-instance v15, LA0/P;

    .line 261
    .line 262
    invoke-direct {v15, v14, v13}, LA0/P;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    :goto_5
    if-eqz v15, :cond_9

    .line 266
    .line 267
    invoke-virtual {v12, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    goto :goto_3

    .line 271
    :cond_d
    move-object v12, v2

    .line 272
    :cond_e
    if-nez v12, :cond_f

    .line 273
    .line 274
    move-object v10, v0

    .line 275
    goto :goto_6

    .line 276
    :cond_f
    move-object v10, v12

    .line 277
    :goto_6
    const-string v0, "popupClickHandlerClassNames"

    .line 278
    .line 279
    invoke-static {v4, v0}, LA0/l;->u(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    const-string v1, "popupAdapterClassNames"

    .line 284
    .line 285
    invoke-static {v4, v1}, LA0/l;->u(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;

    .line 286
    .line 287
    .line 288
    move-result-object v12

    .line 289
    const-string v1, "contactMenuCallbackClassNames"

    .line 290
    .line 291
    invoke-static {v4, v1}, LA0/l;->u(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;

    .line 292
    .line 293
    .line 294
    move-result-object v13

    .line 295
    const-string v1, "addressMenuCreateClassNames"

    .line 296
    .line 297
    invoke-static {v4, v1}, LA0/l;->u(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;

    .line 298
    .line 299
    .line 300
    move-result-object v14

    .line 301
    const-string v1, "addressMenuClickClassNames"

    .line 302
    .line 303
    invoke-static {v4, v1}, LA0/l;->u(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;

    .line 304
    .line 305
    .line 306
    move-result-object v15

    .line 307
    const-string v1, "versionCode"

    .line 308
    .line 309
    const/4 v5, -0x1

    .line 310
    invoke-virtual {v4, v1, v5}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 311
    .line 312
    .line 313
    move-result v16

    .line 314
    const-string v1, "versionName"

    .line 315
    .line 316
    invoke-virtual {v4, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v1

    .line 320
    const-string v5, "optString(...)"

    .line 321
    .line 322
    invoke-static {v1, v5}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 323
    .line 324
    .line 325
    const-string v5, "updatedAt"
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 326
    .line 327
    move-object/from16 v20, v3

    .line 328
    .line 329
    const-wide/16 v2, 0x0

    .line 330
    .line 331
    :try_start_4
    invoke-virtual {v4, v5, v2, v3}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 332
    .line 333
    .line 334
    move-result-wide v18

    .line 335
    new-instance v5, LA0/E;

    .line 336
    .line 337
    move-object/from16 v17, v1

    .line 338
    .line 339
    move-object v9, v11

    .line 340
    move-object v11, v0

    .line 341
    invoke-direct/range {v5 .. v19}, LA0/E;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILjava/lang/String;J)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 342
    .line 343
    .line 344
    goto :goto_8

    .line 345
    :catchall_2
    move-exception v0

    .line 346
    :goto_7
    new-instance v5, LE0/d;

    .line 347
    .line 348
    invoke-direct {v5, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 349
    .line 350
    .line 351
    :goto_8
    invoke-static {v5}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    if-eqz v0, :cond_10

    .line 356
    .line 357
    const-string v1, "quick add hook point cache read fail"

    .line 358
    .line 359
    filled-new-array {v1, v0}, [Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object v0

    .line 363
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 364
    .line 365
    .line 366
    invoke-static/range {v20 .. v20}, LA0/l;->a(Ljava/lang/String;)V

    .line 367
    .line 368
    .line 369
    :cond_10
    instance-of v0, v5, LE0/d;

    .line 370
    .line 371
    if-eqz v0, :cond_11

    .line 372
    .line 373
    const/4 v5, 0x0

    .line 374
    :cond_11
    check-cast v5, LA0/E;

    .line 375
    .line 376
    :goto_9
    if-eqz v5, :cond_15

    .line 377
    .line 378
    invoke-static {}, Lz0/r;->p()I

    .line 379
    .line 380
    .line 381
    move-result v0

    .line 382
    iget v1, v5, LA0/E;->k:I

    .line 383
    .line 384
    if-ne v1, v0, :cond_12

    .line 385
    .line 386
    invoke-static {}, Lz0/r;->q()Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    iget-object v1, v5, LA0/E;->l:Ljava/lang/String;

    .line 391
    .line 392
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 393
    .line 394
    .line 395
    move-result v0

    .line 396
    if-eqz v0, :cond_12

    .line 397
    .line 398
    goto :goto_a

    .line 399
    :cond_12
    const/4 v5, 0x0

    .line 400
    :goto_a
    if-eqz v5, :cond_15

    .line 401
    .line 402
    iget-object v0, v5, LA0/E;->d:Ljava/lang/Object;

    .line 403
    .line 404
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 405
    .line 406
    .line 407
    move-result v0

    .line 408
    if-eqz v0, :cond_14

    .line 409
    .line 410
    iget-object v0, v5, LA0/E;->i:Ljava/lang/Object;

    .line 411
    .line 412
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 413
    .line 414
    .line 415
    move-result v0

    .line 416
    if-eqz v0, :cond_14

    .line 417
    .line 418
    iget-object v0, v5, LA0/E;->j:Ljava/lang/Object;

    .line 419
    .line 420
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 421
    .line 422
    .line 423
    move-result v0

    .line 424
    if-nez v0, :cond_13

    .line 425
    .line 426
    goto :goto_b

    .line 427
    :cond_13
    const/4 v5, 0x0

    .line 428
    :cond_14
    :goto_b
    if-eqz v5, :cond_15

    .line 429
    .line 430
    new-instance v6, LA0/N;

    .line 431
    .line 432
    iget-object v13, v5, LA0/E;->g:Ljava/lang/Object;

    .line 433
    .line 434
    iget-object v14, v5, LA0/E;->h:Ljava/lang/Object;

    .line 435
    .line 436
    iget-object v7, v5, LA0/E;->a:Ljava/lang/Object;

    .line 437
    .line 438
    iget-object v8, v5, LA0/E;->b:Ljava/lang/Object;

    .line 439
    .line 440
    iget-object v9, v5, LA0/E;->c:Ljava/lang/Object;

    .line 441
    .line 442
    iget-object v10, v5, LA0/E;->d:Ljava/lang/Object;

    .line 443
    .line 444
    iget-object v11, v5, LA0/E;->e:Ljava/lang/Object;

    .line 445
    .line 446
    iget-object v12, v5, LA0/E;->f:Ljava/lang/Object;

    .line 447
    .line 448
    iget-object v15, v5, LA0/E;->i:Ljava/lang/Object;

    .line 449
    .line 450
    iget-object v0, v5, LA0/E;->j:Ljava/lang/Object;

    .line 451
    .line 452
    move-object/from16 v16, v0

    .line 453
    .line 454
    invoke-direct/range {v6 .. v16}, LA0/N;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 455
    .line 456
    .line 457
    move-object v2, v6

    .line 458
    goto :goto_c

    .line 459
    :cond_15
    const/4 v2, 0x0

    .line 460
    :goto_c
    return-object v2
.end method

.method public static j(Landroid/content/Context;)LA0/S;
    .locals 22

    .line 1
    const-string v0, "optString(...)"

    .line 2
    .line 3
    const-string v1, "hook_point_cache"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "getSharedPreferences(...)"

    .line 7
    .line 8
    invoke-static {v1, v2, v3}, LL/d;->f(Ljava/lang/String;ILjava/lang/String;)Landroid/content/SharedPreferences;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const/4 v3, 0x0

    .line 13
    :try_start_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    const-string v5, "startReloadIfChangedUnexpectedly"

    .line 18
    .line 19
    invoke-virtual {v4, v5, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    const/4 v5, 0x1

    .line 24
    invoke-virtual {v4, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v4, v1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    .line 30
    :catchall_0
    const-string v4, "read_trace_v1"

    .line 31
    .line 32
    invoke-interface {v1, v4, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    if-nez v1, :cond_0

    .line 37
    .line 38
    move-object v6, v3

    .line 39
    goto/16 :goto_5

    .line 40
    .line 41
    :cond_0
    :try_start_1
    new-instance v5, Lorg/json/JSONObject;

    .line 42
    .line 43
    invoke-direct {v5, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const/4 v1, 0x4

    .line 47
    invoke-static {v5, v1}, LA0/l;->r(Lorg/json/JSONObject;I)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-nez v1, :cond_1

    .line 52
    .line 53
    move-object v6, v3

    .line 54
    move-object/from16 v21, v4

    .line 55
    .line 56
    goto/16 :goto_4

    .line 57
    .line 58
    :cond_1
    const-string v1, "sendClickClassName"

    .line 59
    .line 60
    invoke-virtual {v5, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v7

    .line 64
    invoke-static {v7, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    const-string v1, "sendClickMethodName"

    .line 68
    .line 69
    invoke-virtual {v5, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v8

    .line 73
    invoke-static {v8, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    const-string v1, "sendClickMethodSign"

    .line 77
    .line 78
    invoke-virtual {v5, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v9

    .line 82
    invoke-static {v9, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    const-string v1, "sendClickMethods"

    .line 86
    .line 87
    invoke-virtual {v5, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    if-eqz v1, :cond_5

    .line 92
    .line 93
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    .line 94
    .line 95
    .line 96
    move-result v6

    .line 97
    new-instance v10, Ljava/util/ArrayList;

    .line 98
    .line 99
    invoke-direct {v10, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 100
    .line 101
    .line 102
    :goto_0
    if-ge v2, v6, :cond_3

    .line 103
    .line 104
    invoke-virtual {v1, v2}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 105
    .line 106
    .line 107
    move-result-object v11

    .line 108
    if-nez v11, :cond_2

    .line 109
    .line 110
    new-instance v11, Lorg/json/JSONObject;

    .line 111
    .line 112
    invoke-direct {v11}, Lorg/json/JSONObject;-><init>()V

    .line 113
    .line 114
    .line 115
    goto :goto_1

    .line 116
    :catchall_1
    move-exception v0

    .line 117
    move-object/from16 v21, v4

    .line 118
    .line 119
    goto/16 :goto_3

    .line 120
    .line 121
    :cond_2
    :goto_1
    new-instance v12, LA0/T;

    .line 122
    .line 123
    const-string v13, "className"

    .line 124
    .line 125
    invoke-virtual {v11, v13}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v13

    .line 129
    invoke-static {v13, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    const-string v14, "methodName"

    .line 133
    .line 134
    invoke-virtual {v11, v14}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v14

    .line 138
    invoke-static {v14, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    const-string v15, "methodSign"

    .line 142
    .line 143
    invoke-virtual {v11, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v11

    .line 147
    invoke-static {v11, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    invoke-direct {v12, v13, v14, v11}, LA0/T;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    add-int/lit8 v2, v2, 0x1

    .line 157
    .line 158
    goto :goto_0

    .line 159
    :cond_3
    new-instance v1, Ljava/util/ArrayList;

    .line 160
    .line 161
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    :cond_4
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 169
    .line 170
    .line 171
    move-result v6

    .line 172
    if-eqz v6, :cond_6

    .line 173
    .line 174
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v6

    .line 178
    move-object v10, v6

    .line 179
    check-cast v10, LA0/T;

    .line 180
    .line 181
    iget-object v11, v10, LA0/T;->a:Ljava/lang/String;

    .line 182
    .line 183
    invoke-static {v11}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 184
    .line 185
    .line 186
    move-result v11

    .line 187
    if-nez v11, :cond_4

    .line 188
    .line 189
    iget-object v11, v10, LA0/T;->b:Ljava/lang/String;

    .line 190
    .line 191
    invoke-static {v11}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 192
    .line 193
    .line 194
    move-result v11

    .line 195
    if-nez v11, :cond_4

    .line 196
    .line 197
    iget-object v10, v10, LA0/T;->c:Ljava/lang/String;

    .line 198
    .line 199
    invoke-static {v10}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 200
    .line 201
    .line 202
    move-result v10

    .line 203
    if-nez v10, :cond_4

    .line 204
    .line 205
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    goto :goto_2

    .line 209
    :cond_5
    move-object v1, v3

    .line 210
    :cond_6
    if-nez v1, :cond_7

    .line 211
    .line 212
    sget-object v1, LF0/s;->a:LF0/s;

    .line 213
    .line 214
    :cond_7
    move-object v10, v1

    .line 215
    const-string v1, "appMsgContentClassName"

    .line 216
    .line 217
    invoke-virtual {v5, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v11

    .line 221
    invoke-static {v11, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    const-string v1, "parseXmlMethodName"

    .line 225
    .line 226
    invoke-virtual {v5, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v12

    .line 230
    invoke-static {v12, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    const-string v1, "parseXmlMethodSign"

    .line 234
    .line 235
    invoke-virtual {v5, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v13

    .line 239
    invoke-static {v13, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    const-string v1, "appMsgLogicClassName"

    .line 243
    .line 244
    invoke-virtual {v5, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v14

    .line 248
    invoke-static {v14, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    const-string v1, "sendAppMsgMethodName"

    .line 252
    .line 253
    invoke-virtual {v5, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v15

    .line 257
    invoke-static {v15, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    const-string v1, "sendAppMsgMethodSign"

    .line 261
    .line 262
    invoke-virtual {v5, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v1

    .line 266
    invoke-static {v1, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    const-string v2, "versionCode"

    .line 270
    .line 271
    const/4 v6, -0x1

    .line 272
    invoke-virtual {v5, v2, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 273
    .line 274
    .line 275
    move-result v17

    .line 276
    const-string v2, "versionName"

    .line 277
    .line 278
    invoke-virtual {v5, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v2

    .line 282
    invoke-static {v2, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    const-string v0, "updatedAt"
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 286
    .line 287
    move-object/from16 v21, v4

    .line 288
    .line 289
    const-wide/16 v3, 0x0

    .line 290
    .line 291
    :try_start_2
    invoke-virtual {v5, v0, v3, v4}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 292
    .line 293
    .line 294
    move-result-wide v19

    .line 295
    new-instance v6, LA0/F;

    .line 296
    .line 297
    move-object/from16 v16, v1

    .line 298
    .line 299
    move-object/from16 v18, v2

    .line 300
    .line 301
    invoke-direct/range {v6 .. v20}, LA0/F;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;J)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 302
    .line 303
    .line 304
    goto :goto_4

    .line 305
    :catchall_2
    move-exception v0

    .line 306
    :goto_3
    new-instance v6, LE0/d;

    .line 307
    .line 308
    invoke-direct {v6, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 309
    .line 310
    .line 311
    :goto_4
    invoke-static {v6}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 312
    .line 313
    .line 314
    move-result-object v0

    .line 315
    if-eqz v0, :cond_8

    .line 316
    .line 317
    const-string v1, "read trace hook point cache read fail"

    .line 318
    .line 319
    filled-new-array {v1, v0}, [Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 324
    .line 325
    .line 326
    invoke-static/range {v21 .. v21}, LA0/l;->a(Ljava/lang/String;)V

    .line 327
    .line 328
    .line 329
    :cond_8
    instance-of v0, v6, LE0/d;

    .line 330
    .line 331
    if-eqz v0, :cond_9

    .line 332
    .line 333
    const/4 v6, 0x0

    .line 334
    :cond_9
    check-cast v6, LA0/F;

    .line 335
    .line 336
    :goto_5
    if-eqz v6, :cond_c

    .line 337
    .line 338
    invoke-static {}, Lz0/r;->p()I

    .line 339
    .line 340
    .line 341
    move-result v0

    .line 342
    iget v1, v6, LA0/F;->k:I

    .line 343
    .line 344
    if-ne v1, v0, :cond_a

    .line 345
    .line 346
    invoke-static {}, Lz0/r;->q()Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    iget-object v1, v6, LA0/F;->l:Ljava/lang/String;

    .line 351
    .line 352
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 353
    .line 354
    .line 355
    move-result v0

    .line 356
    if-eqz v0, :cond_a

    .line 357
    .line 358
    goto :goto_6

    .line 359
    :cond_a
    const/4 v6, 0x0

    .line 360
    :goto_6
    if-eqz v6, :cond_c

    .line 361
    .line 362
    iget-object v0, v6, LA0/F;->a:Ljava/lang/String;

    .line 363
    .line 364
    invoke-static {v0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 365
    .line 366
    .line 367
    move-result v0

    .line 368
    if-nez v0, :cond_b

    .line 369
    .line 370
    iget-object v0, v6, LA0/F;->b:Ljava/lang/String;

    .line 371
    .line 372
    invoke-static {v0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 373
    .line 374
    .line 375
    move-result v0

    .line 376
    if-nez v0, :cond_b

    .line 377
    .line 378
    iget-object v0, v6, LA0/F;->e:Ljava/lang/String;

    .line 379
    .line 380
    invoke-static {v0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 381
    .line 382
    .line 383
    move-result v0

    .line 384
    if-nez v0, :cond_b

    .line 385
    .line 386
    iget-object v0, v6, LA0/F;->f:Ljava/lang/String;

    .line 387
    .line 388
    invoke-static {v0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 389
    .line 390
    .line 391
    move-result v0

    .line 392
    if-nez v0, :cond_b

    .line 393
    .line 394
    iget-object v0, v6, LA0/F;->h:Ljava/lang/String;

    .line 395
    .line 396
    invoke-static {v0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 397
    .line 398
    .line 399
    move-result v0

    .line 400
    if-nez v0, :cond_b

    .line 401
    .line 402
    iget-object v0, v6, LA0/F;->i:Ljava/lang/String;

    .line 403
    .line 404
    invoke-static {v0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 405
    .line 406
    .line 407
    move-result v0

    .line 408
    if-nez v0, :cond_b

    .line 409
    .line 410
    goto :goto_7

    .line 411
    :cond_b
    const/4 v6, 0x0

    .line 412
    :goto_7
    if-eqz v6, :cond_c

    .line 413
    .line 414
    new-instance v7, LA0/S;

    .line 415
    .line 416
    iget-object v14, v6, LA0/F;->g:Ljava/lang/String;

    .line 417
    .line 418
    iget-object v15, v6, LA0/F;->h:Ljava/lang/String;

    .line 419
    .line 420
    iget-object v8, v6, LA0/F;->a:Ljava/lang/String;

    .line 421
    .line 422
    iget-object v9, v6, LA0/F;->b:Ljava/lang/String;

    .line 423
    .line 424
    iget-object v10, v6, LA0/F;->c:Ljava/lang/String;

    .line 425
    .line 426
    iget-object v11, v6, LA0/F;->d:Ljava/lang/Object;

    .line 427
    .line 428
    iget-object v12, v6, LA0/F;->e:Ljava/lang/String;

    .line 429
    .line 430
    iget-object v13, v6, LA0/F;->f:Ljava/lang/String;

    .line 431
    .line 432
    iget-object v0, v6, LA0/F;->i:Ljava/lang/String;

    .line 433
    .line 434
    iget-object v1, v6, LA0/F;->j:Ljava/lang/String;

    .line 435
    .line 436
    move-object/from16 v16, v0

    .line 437
    .line 438
    move-object/from16 v17, v1

    .line 439
    .line 440
    invoke-direct/range {v7 .. v17}, LA0/S;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 441
    .line 442
    .line 443
    move-object v3, v7

    .line 444
    goto :goto_8

    .line 445
    :cond_c
    const/4 v3, 0x0

    .line 446
    :goto_8
    return-object v3
.end method

.method public static k(Landroid/content/Context;)LA0/U;
    .locals 12

    .line 1
    const/4 p0, 0x0

    .line 2
    const-string v0, "hook_point_cache"

    .line 3
    .line 4
    const-string v1, "getSharedPreferences(...)"

    .line 5
    .line 6
    invoke-static {v0, p0, v1}, LL/d;->f(Ljava/lang/String;ILjava/lang/String;)Landroid/content/SharedPreferences;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const/4 v1, 0x0

    .line 11
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v2, "startReloadIfChangedUnexpectedly"

    .line 16
    .line 17
    invoke-virtual {v0, v2, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const/4 v2, 0x1

    .line 22
    invoke-virtual {v0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    .line 28
    :catchall_0
    const-string v2, "recent_forward_v1"

    .line 29
    .line 30
    invoke-interface {p0, v2, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    if-nez p0, :cond_0

    .line 35
    .line 36
    move-object v3, v1

    .line 37
    goto :goto_1

    .line 38
    :cond_0
    :try_start_1
    new-instance v0, Lorg/json/JSONObject;

    .line 39
    .line 40
    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const/4 p0, 0x2

    .line 44
    invoke-static {v0, p0}, LA0/l;->r(Lorg/json/JSONObject;I)Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    if-nez p0, :cond_1

    .line 49
    .line 50
    move-object v3, v1

    .line 51
    goto :goto_0

    .line 52
    :cond_1
    new-instance v3, LA0/G;

    .line 53
    .line 54
    const-string p0, "activityClassNames"

    .line 55
    .line 56
    invoke-static {v0, p0}, LA0/l;->u(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    const-string p0, "adapterClassNames"

    .line 61
    .line 62
    invoke-static {v0, p0}, LA0/l;->u(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    const-string p0, "dataFieldNames"

    .line 67
    .line 68
    invoke-static {v0, p0}, LA0/l;->u(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    const-string p0, "recyclerEntryNames"

    .line 73
    .line 74
    invoke-static {v0, p0}, LA0/l;->u(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;

    .line 75
    .line 76
    .line 77
    move-result-object v7

    .line 78
    const-string p0, "versionCode"

    .line 79
    .line 80
    const/4 v8, -0x1

    .line 81
    invoke-virtual {v0, p0, v8}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 82
    .line 83
    .line 84
    move-result v8

    .line 85
    const-string p0, "versionName"

    .line 86
    .line 87
    invoke-virtual {v0, p0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v9

    .line 91
    const-string p0, "optString(...)"

    .line 92
    .line 93
    invoke-static {v9, p0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    const-string p0, "updatedAt"

    .line 97
    .line 98
    const-wide/16 v10, 0x0

    .line 99
    .line 100
    invoke-virtual {v0, p0, v10, v11}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 101
    .line 102
    .line 103
    move-result-wide v10

    .line 104
    invoke-direct/range {v3 .. v11}, LA0/G;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILjava/lang/String;J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 105
    .line 106
    .line 107
    goto :goto_0

    .line 108
    :catchall_1
    move-exception v0

    .line 109
    move-object p0, v0

    .line 110
    new-instance v3, LE0/d;

    .line 111
    .line 112
    invoke-direct {v3, p0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 113
    .line 114
    .line 115
    :goto_0
    invoke-static {v3}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    if-eqz p0, :cond_2

    .line 120
    .line 121
    const-string v0, "recent forward hook point cache read fail"

    .line 122
    .line 123
    filled-new-array {v0, p0}, [Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    invoke-static {p0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    invoke-static {v2}, LA0/l;->a(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    :cond_2
    instance-of p0, v3, LE0/d;

    .line 134
    .line 135
    if-eqz p0, :cond_3

    .line 136
    .line 137
    move-object v3, v1

    .line 138
    :cond_3
    check-cast v3, LA0/G;

    .line 139
    .line 140
    :goto_1
    if-eqz v3, :cond_6

    .line 141
    .line 142
    invoke-static {}, Lz0/r;->p()I

    .line 143
    .line 144
    .line 145
    move-result p0

    .line 146
    iget v0, v3, LA0/G;->e:I

    .line 147
    .line 148
    if-ne v0, p0, :cond_4

    .line 149
    .line 150
    invoke-static {}, Lz0/r;->q()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    iget-object v0, v3, LA0/G;->f:Ljava/lang/String;

    .line 155
    .line 156
    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result p0

    .line 160
    if-eqz p0, :cond_4

    .line 161
    .line 162
    goto :goto_2

    .line 163
    :cond_4
    move-object v3, v1

    .line 164
    :goto_2
    if-eqz v3, :cond_6

    .line 165
    .line 166
    iget-object p0, v3, LA0/G;->a:Ljava/lang/Object;

    .line 167
    .line 168
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 169
    .line 170
    .line 171
    move-result p0

    .line 172
    if-nez p0, :cond_5

    .line 173
    .line 174
    iget-object p0, v3, LA0/G;->b:Ljava/lang/Object;

    .line 175
    .line 176
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 177
    .line 178
    .line 179
    move-result p0

    .line 180
    if-nez p0, :cond_5

    .line 181
    .line 182
    iget-object p0, v3, LA0/G;->c:Ljava/lang/Object;

    .line 183
    .line 184
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 185
    .line 186
    .line 187
    move-result p0

    .line 188
    if-nez p0, :cond_5

    .line 189
    .line 190
    goto :goto_3

    .line 191
    :cond_5
    move-object v3, v1

    .line 192
    :goto_3
    if-eqz v3, :cond_6

    .line 193
    .line 194
    new-instance v1, LA0/U;

    .line 195
    .line 196
    iget-object p0, v3, LA0/G;->a:Ljava/lang/Object;

    .line 197
    .line 198
    iget-object v0, v3, LA0/G;->b:Ljava/lang/Object;

    .line 199
    .line 200
    iget-object v2, v3, LA0/G;->c:Ljava/lang/Object;

    .line 201
    .line 202
    iget-object v3, v3, LA0/G;->d:Ljava/lang/Object;

    .line 203
    .line 204
    invoke-direct {v1, p0, v0, v2, v3}, LA0/U;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 205
    .line 206
    .line 207
    :cond_6
    return-object v1
.end method

.method public static l(Landroid/content/Context;)LA0/V;
    .locals 10

    .line 1
    const/4 p0, 0x0

    .line 2
    const-string v0, "hook_point_cache"

    .line 3
    .line 4
    const-string v1, "getSharedPreferences(...)"

    .line 5
    .line 6
    invoke-static {v0, p0, v1}, LL/d;->f(Ljava/lang/String;ILjava/lang/String;)Landroid/content/SharedPreferences;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const/4 v1, 0x0

    .line 11
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v2, "startReloadIfChangedUnexpectedly"

    .line 16
    .line 17
    invoke-virtual {v0, v2, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const/4 v2, 0x1

    .line 22
    invoke-virtual {v0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    .line 28
    :catchall_0
    const-string v2, "search_command_v1"

    .line 29
    .line 30
    invoke-interface {p0, v2, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    if-nez p0, :cond_0

    .line 35
    .line 36
    move-object v3, v1

    .line 37
    goto :goto_1

    .line 38
    :cond_0
    :try_start_1
    new-instance v0, Lorg/json/JSONObject;

    .line 39
    .line 40
    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const/4 p0, 0x2

    .line 44
    invoke-static {v0, p0}, LA0/l;->r(Lorg/json/JSONObject;I)Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    if-nez p0, :cond_1

    .line 49
    .line 50
    move-object v3, v1

    .line 51
    goto :goto_0

    .line 52
    :cond_1
    new-instance v3, LA0/H;

    .line 53
    .line 54
    const-string p0, "searchViewClassNames"

    .line 55
    .line 56
    invoke-static {v0, p0}, LA0/l;->u(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    const-string p0, "editTextFieldNames"

    .line 61
    .line 62
    invoke-static {v0, p0}, LA0/l;->u(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    const-string p0, "versionCode"

    .line 67
    .line 68
    const/4 v6, -0x1

    .line 69
    invoke-virtual {v0, p0, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    const-string p0, "versionName"

    .line 74
    .line 75
    invoke-virtual {v0, p0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v7

    .line 79
    const-string p0, "optString(...)"

    .line 80
    .line 81
    invoke-static {v7, p0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    const-string p0, "updatedAt"

    .line 85
    .line 86
    const-wide/16 v8, 0x0

    .line 87
    .line 88
    invoke-virtual {v0, p0, v8, v9}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 89
    .line 90
    .line 91
    move-result-wide v8

    .line 92
    invoke-direct/range {v3 .. v9}, LA0/H;-><init>(Ljava/util/List;Ljava/util/List;ILjava/lang/String;J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 93
    .line 94
    .line 95
    goto :goto_0

    .line 96
    :catchall_1
    move-exception v0

    .line 97
    move-object p0, v0

    .line 98
    new-instance v3, LE0/d;

    .line 99
    .line 100
    invoke-direct {v3, p0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 101
    .line 102
    .line 103
    :goto_0
    invoke-static {v3}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    if-eqz p0, :cond_2

    .line 108
    .line 109
    const-string v0, "search command hook point cache read fail"

    .line 110
    .line 111
    filled-new-array {v0, p0}, [Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    invoke-static {p0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    invoke-static {v2}, LA0/l;->a(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    :cond_2
    instance-of p0, v3, LE0/d;

    .line 122
    .line 123
    if-eqz p0, :cond_3

    .line 124
    .line 125
    move-object v3, v1

    .line 126
    :cond_3
    check-cast v3, LA0/H;

    .line 127
    .line 128
    :goto_1
    if-eqz v3, :cond_6

    .line 129
    .line 130
    invoke-static {}, Lz0/r;->p()I

    .line 131
    .line 132
    .line 133
    move-result p0

    .line 134
    iget v0, v3, LA0/H;->c:I

    .line 135
    .line 136
    if-ne v0, p0, :cond_4

    .line 137
    .line 138
    invoke-static {}, Lz0/r;->q()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    iget-object v0, v3, LA0/H;->d:Ljava/lang/String;

    .line 143
    .line 144
    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result p0

    .line 148
    if-eqz p0, :cond_4

    .line 149
    .line 150
    goto :goto_2

    .line 151
    :cond_4
    move-object v3, v1

    .line 152
    :goto_2
    if-eqz v3, :cond_6

    .line 153
    .line 154
    iget-object p0, v3, LA0/H;->a:Ljava/lang/Object;

    .line 155
    .line 156
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 157
    .line 158
    .line 159
    move-result p0

    .line 160
    if-nez p0, :cond_5

    .line 161
    .line 162
    iget-object p0, v3, LA0/H;->b:Ljava/lang/Object;

    .line 163
    .line 164
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 165
    .line 166
    .line 167
    move-result p0

    .line 168
    if-nez p0, :cond_5

    .line 169
    .line 170
    goto :goto_3

    .line 171
    :cond_5
    move-object v3, v1

    .line 172
    :goto_3
    if-eqz v3, :cond_6

    .line 173
    .line 174
    new-instance v1, LA0/V;

    .line 175
    .line 176
    iget-object p0, v3, LA0/H;->a:Ljava/lang/Object;

    .line 177
    .line 178
    iget-object v0, v3, LA0/H;->b:Ljava/lang/Object;

    .line 179
    .line 180
    invoke-direct {v1, p0, v0}, LA0/V;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 181
    .line 182
    .line 183
    :cond_6
    return-object v1
.end method

.method public static m(Landroid/content/Context;)LA0/W;
    .locals 26

    .line 1
    const/4 v0, 0x0

    .line 2
    const-string v1, "hook_point_cache"

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
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const-string v3, "startReloadIfChangedUnexpectedly"

    .line 16
    .line 17
    invoke-virtual {v2, v3, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    const/4 v3, 0x1

    .line 22
    invoke-virtual {v2, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2, v0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    .line 28
    :catchall_0
    const-string v2, "sns_moment_v2"

    .line 29
    .line 30
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    if-nez v0, :cond_0

    .line 35
    .line 36
    move-object v4, v1

    .line 37
    goto/16 :goto_1

    .line 38
    .line 39
    :cond_0
    :try_start_1
    new-instance v3, Lorg/json/JSONObject;

    .line 40
    .line 41
    invoke-direct {v3, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    const/4 v0, 0x2

    .line 45
    invoke-static {v3, v0}, LA0/l;->r(Lorg/json/JSONObject;I)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-nez v0, :cond_1

    .line 50
    .line 51
    move-object v4, v1

    .line 52
    goto/16 :goto_0

    .line 53
    .line 54
    :cond_1
    new-instance v4, LA0/I;

    .line 55
    .line 56
    const-string v0, "timelineClassNames"

    .line 57
    .line 58
    invoke-static {v3, v0}, LA0/l;->u(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    const-string v0, "snsObjectProviderClassNames"

    .line 63
    .line 64
    invoke-static {v3, v0}, LA0/l;->u(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    const-string v0, "detailActivityClassNames"

    .line 69
    .line 70
    invoke-static {v3, v0}, LA0/l;->u(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;

    .line 71
    .line 72
    .line 73
    move-result-object v7

    .line 74
    const-string v0, "selfAlbumAdapterClassNames"

    .line 75
    .line 76
    invoke-static {v3, v0}, LA0/l;->u(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object v8

    .line 80
    const-string v0, "snsInfoUserFieldNames"

    .line 81
    .line 82
    invoke-static {v3, v0}, LA0/l;->u(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;

    .line 83
    .line 84
    .line 85
    move-result-object v9

    .line 86
    const-string v0, "snsInfoSnsIdFieldNames"

    .line 87
    .line 88
    invoke-static {v3, v0}, LA0/l;->u(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;

    .line 89
    .line 90
    .line 91
    move-result-object v10

    .line 92
    const-string v0, "snsInfoLocalIdFieldNames"

    .line 93
    .line 94
    invoke-static {v3, v0}, LA0/l;->u(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;

    .line 95
    .line 96
    .line 97
    move-result-object v11

    .line 98
    const-string v0, "timeLineObjectUserFieldNames"

    .line 99
    .line 100
    invoke-static {v3, v0}, LA0/l;->u(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;

    .line 101
    .line 102
    .line 103
    move-result-object v12

    .line 104
    const-string v0, "snsObjectExtFlagFieldNames"

    .line 105
    .line 106
    invoke-static {v3, v0}, LA0/l;->u(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;

    .line 107
    .line 108
    .line 109
    move-result-object v13

    .line 110
    const-string v0, "snsObjectLikeListFieldNames"

    .line 111
    .line 112
    invoke-static {v3, v0}, LA0/l;->u(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;

    .line 113
    .line 114
    .line 115
    move-result-object v14

    .line 116
    const-string v0, "snsObjectLikeCountFieldNames"

    .line 117
    .line 118
    invoke-static {v3, v0}, LA0/l;->u(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;

    .line 119
    .line 120
    .line 121
    move-result-object v15

    .line 122
    const-string v0, "snsObjectLikeListCountFieldNames"

    .line 123
    .line 124
    invoke-static {v3, v0}, LA0/l;->u(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;

    .line 125
    .line 126
    .line 127
    move-result-object v16

    .line 128
    const-string v0, "snsObjectCommentListFieldNames"

    .line 129
    .line 130
    invoke-static {v3, v0}, LA0/l;->u(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;

    .line 131
    .line 132
    .line 133
    move-result-object v17

    .line 134
    const-string v0, "snsObjectCommentCountFieldNames"

    .line 135
    .line 136
    invoke-static {v3, v0}, LA0/l;->u(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;

    .line 137
    .line 138
    .line 139
    move-result-object v18

    .line 140
    const-string v0, "snsObjectCommentListCountFieldNames"

    .line 141
    .line 142
    invoke-static {v3, v0}, LA0/l;->u(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;

    .line 143
    .line 144
    .line 145
    move-result-object v19

    .line 146
    const-string v0, "contextMenuCreateMethods"

    .line 147
    .line 148
    invoke-static {v3, v0}, LA0/l;->t(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;

    .line 149
    .line 150
    .line 151
    move-result-object v20

    .line 152
    const-string v0, "contextMenuSelectMethods"

    .line 153
    .line 154
    invoke-static {v3, v0}, LA0/l;->t(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;

    .line 155
    .line 156
    .line 157
    move-result-object v21

    .line 158
    const-string v0, "versionCode"

    .line 159
    .line 160
    const/4 v1, -0x1

    .line 161
    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 162
    .line 163
    .line 164
    move-result v22

    .line 165
    const-string v0, "versionName"

    .line 166
    .line 167
    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    const-string v1, "optString(...)"

    .line 172
    .line 173
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    const-string v1, "updatedAt"

    .line 177
    .line 178
    move-object/from16 v23, v4

    .line 179
    .line 180
    move-object/from16 v24, v5

    .line 181
    .line 182
    const-wide/16 v4, 0x0

    .line 183
    .line 184
    invoke-virtual {v3, v1, v4, v5}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 185
    .line 186
    .line 187
    move-result-wide v3

    .line 188
    move-object/from16 v5, v24

    .line 189
    .line 190
    move-wide/from16 v24, v3

    .line 191
    .line 192
    move-object/from16 v4, v23

    .line 193
    .line 194
    move-object/from16 v23, v0

    .line 195
    .line 196
    invoke-direct/range {v4 .. v25}, LA0/I;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILjava/lang/String;J)V

    .line 197
    .line 198
    .line 199
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 200
    .line 201
    .line 202
    move-result v0

    .line 203
    if-eqz v0, :cond_3

    .line 204
    .line 205
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 206
    .line 207
    .line 208
    move-result v0

    .line 209
    if-eqz v0, :cond_3

    .line 210
    .line 211
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 212
    .line 213
    .line 214
    move-result v0

    .line 215
    if-eqz v0, :cond_3

    .line 216
    .line 217
    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    .line 218
    .line 219
    .line 220
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 221
    if-nez v0, :cond_2

    .line 222
    .line 223
    goto :goto_0

    .line 224
    :cond_2
    const/4 v4, 0x0

    .line 225
    goto :goto_0

    .line 226
    :catchall_1
    move-exception v0

    .line 227
    new-instance v4, LE0/d;

    .line 228
    .line 229
    invoke-direct {v4, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 230
    .line 231
    .line 232
    :cond_3
    :goto_0
    invoke-static {v4}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    if-eqz v0, :cond_4

    .line 237
    .line 238
    const-string v1, "sns hook point cache read fail"

    .line 239
    .line 240
    filled-new-array {v1, v0}, [Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    invoke-static {v2}, LA0/l;->a(Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    :cond_4
    instance-of v0, v4, LE0/d;

    .line 251
    .line 252
    if-eqz v0, :cond_5

    .line 253
    .line 254
    const/4 v4, 0x0

    .line 255
    :cond_5
    check-cast v4, LA0/I;

    .line 256
    .line 257
    :goto_1
    if-eqz v4, :cond_7

    .line 258
    .line 259
    invoke-static {}, Lz0/r;->p()I

    .line 260
    .line 261
    .line 262
    move-result v0

    .line 263
    iget v1, v4, LA0/I;->r:I

    .line 264
    .line 265
    if-ne v1, v0, :cond_6

    .line 266
    .line 267
    invoke-static {}, Lz0/r;->q()Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    iget-object v1, v4, LA0/I;->s:Ljava/lang/String;

    .line 272
    .line 273
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    move-result v0

    .line 277
    if-eqz v0, :cond_6

    .line 278
    .line 279
    goto :goto_2

    .line 280
    :cond_6
    const/4 v4, 0x0

    .line 281
    :goto_2
    if-eqz v4, :cond_7

    .line 282
    .line 283
    new-instance v5, LA0/W;

    .line 284
    .line 285
    iget-object v0, v4, LA0/I;->n:Ljava/lang/Object;

    .line 286
    .line 287
    iget-object v1, v4, LA0/I;->o:Ljava/lang/Object;

    .line 288
    .line 289
    iget-object v6, v4, LA0/I;->a:Ljava/lang/Object;

    .line 290
    .line 291
    iget-object v7, v4, LA0/I;->b:Ljava/lang/Object;

    .line 292
    .line 293
    iget-object v8, v4, LA0/I;->c:Ljava/lang/Object;

    .line 294
    .line 295
    iget-object v9, v4, LA0/I;->d:Ljava/lang/Object;

    .line 296
    .line 297
    iget-object v10, v4, LA0/I;->e:Ljava/lang/Object;

    .line 298
    .line 299
    iget-object v11, v4, LA0/I;->f:Ljava/lang/Object;

    .line 300
    .line 301
    iget-object v12, v4, LA0/I;->g:Ljava/lang/Object;

    .line 302
    .line 303
    iget-object v13, v4, LA0/I;->h:Ljava/lang/Object;

    .line 304
    .line 305
    iget-object v14, v4, LA0/I;->i:Ljava/lang/Object;

    .line 306
    .line 307
    iget-object v15, v4, LA0/I;->j:Ljava/lang/Object;

    .line 308
    .line 309
    iget-object v2, v4, LA0/I;->k:Ljava/lang/Object;

    .line 310
    .line 311
    iget-object v3, v4, LA0/I;->l:Ljava/lang/Object;

    .line 312
    .line 313
    move-object/from16 v19, v0

    .line 314
    .line 315
    iget-object v0, v4, LA0/I;->m:Ljava/lang/Object;

    .line 316
    .line 317
    move-object/from16 v18, v0

    .line 318
    .line 319
    iget-object v0, v4, LA0/I;->p:Ljava/lang/Object;

    .line 320
    .line 321
    iget-object v4, v4, LA0/I;->q:Ljava/lang/Object;

    .line 322
    .line 323
    move-object/from16 v21, v0

    .line 324
    .line 325
    move-object/from16 v20, v1

    .line 326
    .line 327
    move-object/from16 v16, v2

    .line 328
    .line 329
    move-object/from16 v17, v3

    .line 330
    .line 331
    move-object/from16 v22, v4

    .line 332
    .line 333
    invoke-direct/range {v5 .. v22}, LA0/W;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 334
    .line 335
    .line 336
    move-object v1, v5

    .line 337
    goto :goto_3

    .line 338
    :cond_7
    const/4 v1, 0x0

    .line 339
    :goto_3
    return-object v1
.end method

.method public static n(Landroid/content/Context;)LA0/Z;
    .locals 14

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p0, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const/4 v0, 0x0

    .line 11
    const-string v1, "hook_point_cache"

    .line 12
    .line 13
    invoke-virtual {p0, v1, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    const-string v0, "getSharedPreferences(...)"

    .line 18
    .line 19
    invoke-static {p0, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v2, "startReloadIfChangedUnexpectedly"

    .line 28
    .line 29
    invoke-virtual {v0, v2, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const/4 v2, 0x1

    .line 34
    invoke-virtual {v0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    .line 40
    :catchall_0
    const-string v2, "storage_chat_history_v4"

    .line 41
    .line 42
    invoke-interface {p0, v2, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    if-nez p0, :cond_0

    .line 47
    .line 48
    move-object v3, v1

    .line 49
    goto/16 :goto_1

    .line 50
    .line 51
    :cond_0
    :try_start_1
    new-instance v0, Lorg/json/JSONObject;

    .line 52
    .line 53
    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const/4 p0, 0x3

    .line 57
    invoke-static {v0, p0}, LA0/l;->r(Lorg/json/JSONObject;I)Z

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    if-nez p0, :cond_1

    .line 62
    .line 63
    move-object v3, v1

    .line 64
    goto :goto_0

    .line 65
    :cond_1
    new-instance v3, LA0/J;

    .line 66
    .line 67
    const-string p0, "adapterClassNames"

    .line 68
    .line 69
    invoke-static {v0, p0}, LA0/l;->u(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    const-string p0, "itemClassNames"

    .line 74
    .line 75
    invoke-static {v0, p0}, LA0/l;->u(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    const-string p0, "usernameFieldNames"

    .line 80
    .line 81
    invoke-static {v0, p0}, LA0/l;->u(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    const-string p0, "refreshMethodNames"

    .line 86
    .line 87
    invoke-static {v0, p0}, LA0/l;->u(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;

    .line 88
    .line 89
    .line 90
    move-result-object v7

    .line 91
    const-string p0, "fileSortEntryNames"

    .line 92
    .line 93
    invoke-static {v0, p0}, LA0/l;->u(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;

    .line 94
    .line 95
    .line 96
    move-result-object v8

    .line 97
    const-string p0, "fileSortActivityClassNames"

    .line 98
    .line 99
    invoke-static {v0, p0}, LA0/l;->u(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;

    .line 100
    .line 101
    .line 102
    move-result-object v9

    .line 103
    const-string p0, "versionCode"

    .line 104
    .line 105
    const/4 v10, -0x1

    .line 106
    invoke-virtual {v0, p0, v10}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 107
    .line 108
    .line 109
    move-result v10

    .line 110
    const-string p0, "versionName"

    .line 111
    .line 112
    invoke-virtual {v0, p0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v11

    .line 116
    const-string p0, "optString(...)"

    .line 117
    .line 118
    invoke-static {v11, p0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    const-string p0, "updatedAt"

    .line 122
    .line 123
    const-wide/16 v12, 0x0

    .line 124
    .line 125
    invoke-virtual {v0, p0, v12, v13}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 126
    .line 127
    .line 128
    move-result-wide v12

    .line 129
    invoke-direct/range {v3 .. v13}, LA0/J;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILjava/lang/String;J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 130
    .line 131
    .line 132
    goto :goto_0

    .line 133
    :catchall_1
    move-exception v0

    .line 134
    move-object p0, v0

    .line 135
    new-instance v3, LE0/d;

    .line 136
    .line 137
    invoke-direct {v3, p0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 138
    .line 139
    .line 140
    :goto_0
    invoke-static {v3}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    if-eqz p0, :cond_2

    .line 145
    .line 146
    const-string v0, "storage hook point cache read fail"

    .line 147
    .line 148
    filled-new-array {v0, p0}, [Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    invoke-static {p0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    invoke-static {v2}, LA0/l;->a(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    :cond_2
    instance-of p0, v3, LE0/d;

    .line 159
    .line 160
    if-eqz p0, :cond_3

    .line 161
    .line 162
    move-object v3, v1

    .line 163
    :cond_3
    check-cast v3, LA0/J;

    .line 164
    .line 165
    :goto_1
    if-eqz v3, :cond_6

    .line 166
    .line 167
    invoke-static {}, Lz0/r;->p()I

    .line 168
    .line 169
    .line 170
    move-result p0

    .line 171
    iget v0, v3, LA0/J;->g:I

    .line 172
    .line 173
    if-ne v0, p0, :cond_4

    .line 174
    .line 175
    invoke-static {}, Lz0/r;->q()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object p0

    .line 179
    iget-object v0, v3, LA0/J;->h:Ljava/lang/String;

    .line 180
    .line 181
    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result p0

    .line 185
    if-eqz p0, :cond_4

    .line 186
    .line 187
    goto :goto_2

    .line 188
    :cond_4
    move-object v3, v1

    .line 189
    :goto_2
    if-eqz v3, :cond_6

    .line 190
    .line 191
    iget-object p0, v3, LA0/J;->a:Ljava/lang/Object;

    .line 192
    .line 193
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 194
    .line 195
    .line 196
    move-result p0

    .line 197
    if-nez p0, :cond_5

    .line 198
    .line 199
    iget-object p0, v3, LA0/J;->b:Ljava/lang/Object;

    .line 200
    .line 201
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 202
    .line 203
    .line 204
    move-result p0

    .line 205
    if-nez p0, :cond_5

    .line 206
    .line 207
    goto :goto_3

    .line 208
    :cond_5
    move-object v3, v1

    .line 209
    :goto_3
    if-eqz v3, :cond_6

    .line 210
    .line 211
    new-instance v4, LA0/Z;

    .line 212
    .line 213
    iget-object v7, v3, LA0/J;->c:Ljava/lang/Object;

    .line 214
    .line 215
    iget-object v8, v3, LA0/J;->d:Ljava/lang/Object;

    .line 216
    .line 217
    iget-object v5, v3, LA0/J;->a:Ljava/lang/Object;

    .line 218
    .line 219
    iget-object v6, v3, LA0/J;->b:Ljava/lang/Object;

    .line 220
    .line 221
    iget-object v9, v3, LA0/J;->e:Ljava/lang/Object;

    .line 222
    .line 223
    iget-object v10, v3, LA0/J;->f:Ljava/lang/Object;

    .line 224
    .line 225
    invoke-direct/range {v4 .. v10}, LA0/Z;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 226
    .line 227
    .line 228
    move-object v1, v4

    .line 229
    :cond_6
    return-object v1
.end method

.method public static o(Landroid/content/Context;)LA0/a0;
    .locals 12

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p0, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const/4 v0, 0x0

    .line 11
    const-string v1, "hook_point_cache"

    .line 12
    .line 13
    invoke-virtual {p0, v1, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    const-string v0, "getSharedPreferences(...)"

    .line 18
    .line 19
    invoke-static {p0, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    const/4 v0, 0x1

    .line 24
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    const-string v3, "startReloadIfChangedUnexpectedly"

    .line 29
    .line 30
    invoke-virtual {v2, v3, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {v2, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    .line 40
    :catchall_0
    const-string v2, "tag_contact_v1"

    .line 41
    .line 42
    invoke-interface {p0, v2, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    if-nez p0, :cond_0

    .line 47
    .line 48
    move-object v4, v1

    .line 49
    goto :goto_1

    .line 50
    :cond_0
    :try_start_1
    new-instance v3, Lorg/json/JSONObject;

    .line 51
    .line 52
    invoke-direct {v3, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-static {v3, v0}, LA0/l;->r(Lorg/json/JSONObject;I)Z

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    if-nez p0, :cond_1

    .line 60
    .line 61
    move-object v4, v1

    .line 62
    goto :goto_0

    .line 63
    :cond_1
    new-instance v4, LA0/K;

    .line 64
    .line 65
    const-string p0, "activityClassNames"

    .line 66
    .line 67
    invoke-static {v3, p0}, LA0/l;->u(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    const-string p0, "adapterClassNames"

    .line 72
    .line 73
    invoke-static {v3, p0}, LA0/l;->u(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    const-string p0, "recyclerEntryNames"

    .line 78
    .line 79
    invoke-static {v3, p0}, LA0/l;->u(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    const-string p0, "versionCode"

    .line 84
    .line 85
    const/4 v0, -0x1

    .line 86
    invoke-virtual {v3, p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 87
    .line 88
    .line 89
    move-result v8

    .line 90
    const-string p0, "versionName"

    .line 91
    .line 92
    invoke-virtual {v3, p0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v9

    .line 96
    const-string p0, "optString(...)"

    .line 97
    .line 98
    invoke-static {v9, p0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    const-string p0, "updatedAt"

    .line 102
    .line 103
    const-wide/16 v10, 0x0

    .line 104
    .line 105
    invoke-virtual {v3, p0, v10, v11}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 106
    .line 107
    .line 108
    move-result-wide v10

    .line 109
    invoke-direct/range {v4 .. v11}, LA0/K;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;ILjava/lang/String;J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 110
    .line 111
    .line 112
    goto :goto_0

    .line 113
    :catchall_1
    move-exception v0

    .line 114
    move-object p0, v0

    .line 115
    new-instance v4, LE0/d;

    .line 116
    .line 117
    invoke-direct {v4, p0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 118
    .line 119
    .line 120
    :goto_0
    invoke-static {v4}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    if-eqz p0, :cond_2

    .line 125
    .line 126
    const-string v0, "tag contact hook point cache read fail"

    .line 127
    .line 128
    filled-new-array {v0, p0}, [Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    invoke-static {p0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    invoke-static {v2}, LA0/l;->a(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    :cond_2
    instance-of p0, v4, LE0/d;

    .line 139
    .line 140
    if-eqz p0, :cond_3

    .line 141
    .line 142
    move-object v4, v1

    .line 143
    :cond_3
    check-cast v4, LA0/K;

    .line 144
    .line 145
    :goto_1
    if-eqz v4, :cond_6

    .line 146
    .line 147
    invoke-static {}, Lz0/r;->p()I

    .line 148
    .line 149
    .line 150
    move-result p0

    .line 151
    iget v0, v4, LA0/K;->d:I

    .line 152
    .line 153
    if-ne v0, p0, :cond_4

    .line 154
    .line 155
    invoke-static {}, Lz0/r;->q()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    iget-object v0, v4, LA0/K;->e:Ljava/lang/String;

    .line 160
    .line 161
    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result p0

    .line 165
    if-eqz p0, :cond_4

    .line 166
    .line 167
    goto :goto_2

    .line 168
    :cond_4
    move-object v4, v1

    .line 169
    :goto_2
    if-eqz v4, :cond_6

    .line 170
    .line 171
    iget-object p0, v4, LA0/K;->a:Ljava/lang/Object;

    .line 172
    .line 173
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 174
    .line 175
    .line 176
    move-result p0

    .line 177
    if-nez p0, :cond_5

    .line 178
    .line 179
    iget-object p0, v4, LA0/K;->c:Ljava/lang/Object;

    .line 180
    .line 181
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 182
    .line 183
    .line 184
    move-result p0

    .line 185
    if-nez p0, :cond_5

    .line 186
    .line 187
    goto :goto_3

    .line 188
    :cond_5
    move-object v4, v1

    .line 189
    :goto_3
    if-eqz v4, :cond_6

    .line 190
    .line 191
    new-instance v1, LA0/a0;

    .line 192
    .line 193
    iget-object p0, v4, LA0/K;->c:Ljava/lang/Object;

    .line 194
    .line 195
    iget-object v0, v4, LA0/K;->a:Ljava/lang/Object;

    .line 196
    .line 197
    iget-object v2, v4, LA0/K;->b:Ljava/lang/Object;

    .line 198
    .line 199
    invoke-direct {v1, v0, v2, p0}, LA0/a0;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 200
    .line 201
    .line 202
    :cond_6
    return-object v1
.end method

.method public static p(Landroid/content/Context;)LA0/b0;
    .locals 18

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    invoke-static {v1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x0

    .line 13
    const-string v2, "hook_point_cache"

    .line 14
    .line 15
    invoke-virtual {v0, v2, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v1, "getSharedPreferences(...)"

    .line 20
    .line 21
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    const-string v3, "startReloadIfChangedUnexpectedly"

    .line 30
    .line 31
    invoke-virtual {v2, v3, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    const/4 v3, 0x1

    .line 36
    invoke-virtual {v2, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2, v0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    .line 41
    .line 42
    :catchall_0
    const-string v2, "text_status_v1"

    .line 43
    .line 44
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    if-nez v0, :cond_0

    .line 49
    .line 50
    move-object v4, v1

    .line 51
    goto/16 :goto_2

    .line 52
    .line 53
    :cond_0
    :try_start_1
    new-instance v3, Lorg/json/JSONObject;

    .line 54
    .line 55
    invoke-direct {v3, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    const/4 v0, 0x2

    .line 59
    invoke-static {v3, v0}, LA0/l;->r(Lorg/json/JSONObject;I)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-nez v0, :cond_1

    .line 64
    .line 65
    move-object v4, v1

    .line 66
    move-object/from16 v17, v2

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_1
    new-instance v4, LA0/L;

    .line 70
    .line 71
    const-string v0, "activityClassNames"

    .line 72
    .line 73
    invoke-static {v3, v0}, LA0/l;->u(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    const-string v0, "adapterClassNames"

    .line 78
    .line 79
    invoke-static {v3, v0}, LA0/l;->u(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    const-string v0, "dataFieldNames"

    .line 84
    .line 85
    invoke-static {v3, v0}, LA0/l;->u(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;

    .line 86
    .line 87
    .line 88
    move-result-object v7

    .line 89
    const-string v0, "groupItemClassNames"

    .line 90
    .line 91
    invoke-static {v3, v0}, LA0/l;->u(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;

    .line 92
    .line 93
    .line 94
    move-result-object v8

    .line 95
    const-string v0, "titleItemClassNames"

    .line 96
    .line 97
    invoke-static {v3, v0}, LA0/l;->u(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;

    .line 98
    .line 99
    .line 100
    move-result-object v9

    .line 101
    const-string v0, "mainRecyclerEntryNames"

    .line 102
    .line 103
    invoke-static {v3, v0}, LA0/l;->u(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;

    .line 104
    .line 105
    .line 106
    move-result-object v10

    .line 107
    const-string v0, "titleEntryNames"

    .line 108
    .line 109
    invoke-static {v3, v0}, LA0/l;->u(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;

    .line 110
    .line 111
    .line 112
    move-result-object v11

    .line 113
    const-string v0, "avatarContainerEntryNames"

    .line 114
    .line 115
    invoke-static {v3, v0}, LA0/l;->u(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;

    .line 116
    .line 117
    .line 118
    move-result-object v12

    .line 119
    const-string v0, "versionCode"

    .line 120
    .line 121
    const/4 v13, -0x1

    .line 122
    invoke-virtual {v3, v0, v13}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 123
    .line 124
    .line 125
    move-result v13

    .line 126
    const-string v0, "versionName"

    .line 127
    .line 128
    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v14

    .line 132
    const-string v0, "optString(...)"

    .line 133
    .line 134
    invoke-static {v14, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    const-string v0, "updatedAt"
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 138
    .line 139
    move-object/from16 v17, v2

    .line 140
    .line 141
    const-wide/16 v1, 0x0

    .line 142
    .line 143
    :try_start_2
    invoke-virtual {v3, v0, v1, v2}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 144
    .line 145
    .line 146
    move-result-wide v15

    .line 147
    invoke-direct/range {v4 .. v16}, LA0/L;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILjava/lang/String;J)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 148
    .line 149
    .line 150
    goto :goto_1

    .line 151
    :catchall_1
    move-exception v0

    .line 152
    goto :goto_0

    .line 153
    :catchall_2
    move-exception v0

    .line 154
    move-object/from16 v17, v2

    .line 155
    .line 156
    :goto_0
    new-instance v4, LE0/d;

    .line 157
    .line 158
    invoke-direct {v4, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 159
    .line 160
    .line 161
    :goto_1
    invoke-static {v4}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    if-eqz v0, :cond_2

    .line 166
    .line 167
    const-string v1, "text status hook point cache read fail"

    .line 168
    .line 169
    filled-new-array {v1, v0}, [Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    invoke-static/range {v17 .. v17}, LA0/l;->a(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    :cond_2
    instance-of v0, v4, LE0/d;

    .line 180
    .line 181
    if-eqz v0, :cond_3

    .line 182
    .line 183
    const/4 v4, 0x0

    .line 184
    :cond_3
    check-cast v4, LA0/L;

    .line 185
    .line 186
    :goto_2
    if-eqz v4, :cond_6

    .line 187
    .line 188
    invoke-static {}, Lz0/r;->p()I

    .line 189
    .line 190
    .line 191
    move-result v0

    .line 192
    iget v1, v4, LA0/L;->i:I

    .line 193
    .line 194
    if-ne v1, v0, :cond_4

    .line 195
    .line 196
    invoke-static {}, Lz0/r;->q()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    iget-object v1, v4, LA0/L;->j:Ljava/lang/String;

    .line 201
    .line 202
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result v0

    .line 206
    if-eqz v0, :cond_4

    .line 207
    .line 208
    goto :goto_3

    .line 209
    :cond_4
    const/4 v4, 0x0

    .line 210
    :goto_3
    if-eqz v4, :cond_6

    .line 211
    .line 212
    iget-object v0, v4, LA0/L;->a:Ljava/lang/Object;

    .line 213
    .line 214
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 215
    .line 216
    .line 217
    move-result v0

    .line 218
    if-nez v0, :cond_5

    .line 219
    .line 220
    iget-object v0, v4, LA0/L;->b:Ljava/lang/Object;

    .line 221
    .line 222
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 223
    .line 224
    .line 225
    move-result v0

    .line 226
    if-nez v0, :cond_5

    .line 227
    .line 228
    iget-object v0, v4, LA0/L;->d:Ljava/lang/Object;

    .line 229
    .line 230
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 231
    .line 232
    .line 233
    move-result v0

    .line 234
    if-nez v0, :cond_5

    .line 235
    .line 236
    goto :goto_4

    .line 237
    :cond_5
    const/4 v4, 0x0

    .line 238
    :goto_4
    if-eqz v4, :cond_6

    .line 239
    .line 240
    new-instance v5, LA0/b0;

    .line 241
    .line 242
    iget-object v10, v4, LA0/L;->e:Ljava/lang/Object;

    .line 243
    .line 244
    iget-object v11, v4, LA0/L;->f:Ljava/lang/Object;

    .line 245
    .line 246
    iget-object v6, v4, LA0/L;->a:Ljava/lang/Object;

    .line 247
    .line 248
    iget-object v7, v4, LA0/L;->b:Ljava/lang/Object;

    .line 249
    .line 250
    iget-object v8, v4, LA0/L;->c:Ljava/lang/Object;

    .line 251
    .line 252
    iget-object v9, v4, LA0/L;->d:Ljava/lang/Object;

    .line 253
    .line 254
    iget-object v12, v4, LA0/L;->g:Ljava/lang/Object;

    .line 255
    .line 256
    iget-object v13, v4, LA0/L;->h:Ljava/lang/Object;

    .line 257
    .line 258
    invoke-direct/range {v5 .. v13}, LA0/b0;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 259
    .line 260
    .line 261
    move-object v1, v5

    .line 262
    goto :goto_5

    .line 263
    :cond_6
    const/4 v1, 0x0

    .line 264
    :goto_5
    return-object v1
.end method

.method public static q(Landroid/content/Context;)LA0/d;
    .locals 3

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p0, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p0, "wechat_xml_parser_method_v1"

    .line 7
    .line 8
    invoke-static {p0}, LA0/l;->b(Ljava/lang/String;)LA0/D;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    const/4 v0, 0x0

    .line 13
    if-eqz p0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, LA0/D;->a()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-object p0, v0

    .line 23
    :goto_0
    if-eqz p0, :cond_1

    .line 24
    .line 25
    new-instance v0, LA0/d;

    .line 26
    .line 27
    iget-object v1, p0, LA0/D;->c:Ljava/lang/String;

    .line 28
    .line 29
    iget-object v2, p0, LA0/D;->a:Ljava/lang/String;

    .line 30
    .line 31
    iget-object p0, p0, LA0/D;->b:Ljava/lang/String;

    .line 32
    .line 33
    invoke-direct {v0, v2, p0, v1}, LA0/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    return-object v0
.end method

.method public static r(Lorg/json/JSONObject;I)Z
    .locals 3

    .line 1
    const-string v0, "cacheSchemaVersion"

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v2, 0x3

    .line 9
    if-ne v0, v2, :cond_0

    .line 10
    .line 11
    const-string v0, "ruleVersion"

    .line 12
    .line 13
    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-ne v0, p1, :cond_0

    .line 18
    .line 19
    const-string v0, "ruleHash"

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    new-instance v1, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    const-string v2, "wxmask-dexkit:3:"

    .line 28
    .line 29
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-static {v0, p1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-eqz p1, :cond_0

    .line 44
    .line 45
    const-string p1, "packageFingerprint"

    .line 46
    .line 47
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-static {}, Lz0/r;->m()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-static {p0, p1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    if-eqz p0, :cond_0

    .line 60
    .line 61
    const/4 p0, 0x1

    .line 62
    return p0

    .line 63
    :cond_0
    const/4 p0, 0x0

    .line 64
    return p0
.end method

.method public static s(Ljava/lang/String;Z)V
    .locals 3

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lz0/r;->p()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const-string v2, "versionCode"

    .line 11
    .line 12
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-static {}, Lz0/r;->q()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const-string v2, "versionName"

    .line 21
    .line 22
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {}, Lz0/r;->m()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    const-string v2, "packageFingerprint"

    .line 31
    .line 32
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const-string v1, "cacheSchemaVersion"

    .line 37
    .line 38
    const/4 v2, 0x3

    .line 39
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    const-string v1, "shown"

    .line 44
    .line 45
    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    const-string v0, "updatedAt"

    .line 50
    .line 51
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 52
    .line 53
    .line 54
    move-result-wide v1

    .line 55
    invoke-virtual {p1, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    const/4 v1, 0x0

    .line 64
    const-string v2, "hook_point_cache"

    .line 65
    .line 66
    invoke-virtual {v0, v2, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    const-string v1, "getSharedPreferences(...)"

    .line 71
    .line 72
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-interface {v0, p0, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 88
    .line 89
    .line 90
    return-void
.end method

.method public static t(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;
    .locals 6

    .line 1
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    sget-object p0, LF0/s;->a:LF0/s;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-static {p1, v0}, LD/h;->U(II)LR0/c;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    new-instance v0, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, LR0/a;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    :cond_1
    :goto_0
    move-object v1, p1

    .line 29
    check-cast v1, LR0/b;

    .line 30
    .line 31
    iget-boolean v1, v1, LR0/b;->c:Z

    .line 32
    .line 33
    if-eqz v1, :cond_5

    .line 34
    .line 35
    move-object v1, p1

    .line 36
    check-cast v1, LR0/b;

    .line 37
    .line 38
    invoke-virtual {v1}, LR0/b;->a()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    invoke-virtual {p0, v1}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    const/4 v2, 0x0

    .line 47
    if-nez v1, :cond_2

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    const-string v3, "className"

    .line 51
    .line 52
    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    const-string v4, "methodName"

    .line 57
    .line 58
    invoke-virtual {v1, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    const-string v5, "methodSign"

    .line 63
    .line 64
    invoke-virtual {v1, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-static {v3}, LN0/g;->b(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    invoke-static {v3}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    if-nez v5, :cond_4

    .line 76
    .line 77
    invoke-static {v4}, LN0/g;->b(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    invoke-static {v4}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 81
    .line 82
    .line 83
    move-result v5

    .line 84
    if-eqz v5, :cond_3

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_3
    new-instance v2, LA0/X;

    .line 88
    .line 89
    invoke-static {v1}, LN0/g;->b(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    invoke-direct {v2, v3, v4, v1}, LA0/X;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    :cond_4
    :goto_1
    if-eqz v2, :cond_1

    .line 96
    .line 97
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_5
    return-object v0
.end method

.method public static u(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    sget-object p0, LF0/s;->a:LF0/s;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-static {p1, v0}, LD/h;->U(II)LR0/c;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    new-instance v0, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, LR0/a;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    :cond_1
    :goto_0
    move-object v1, p1

    .line 29
    check-cast v1, LR0/b;

    .line 30
    .line 31
    iget-boolean v1, v1, LR0/b;->c:Z

    .line 32
    .line 33
    if-eqz v1, :cond_3

    .line 34
    .line 35
    move-object v1, p1

    .line 36
    check-cast v1, LR0/b;

    .line 37
    .line 38
    invoke-virtual {v1}, LR0/b;->a()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    invoke-virtual {p0, v1}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-static {v1}, LN0/g;->b(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    invoke-static {v1}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-nez v2, :cond_2

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_2
    const/4 v1, 0x0

    .line 57
    :goto_1
    if-eqz v1, :cond_1

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_3
    return-object v0
.end method

.method public static v(Lorg/json/JSONObject;I)Lorg/json/JSONObject;
    .locals 2

    .line 1
    const-string v0, "cacheSchemaVersion"

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    const-string v0, "ruleVersion"

    .line 9
    .line 10
    invoke-virtual {p0, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    new-instance v0, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v1, "wxmask-dexkit:3:"

    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const-string v0, "ruleHash"

    .line 29
    .line 30
    invoke-virtual {p0, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-static {}, Lz0/r;->p()I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    const-string v0, "versionCode"

    .line 39
    .line 40
    invoke-virtual {p0, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-static {}, Lz0/r;->q()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    const-string v0, "versionName"

    .line 49
    .line 50
    invoke-virtual {p0, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-static {}, Lz0/r;->m()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    const-string v0, "packageFingerprint"

    .line 59
    .line 60
    invoke-virtual {p0, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    const-string p1, "updatedAt"

    .line 65
    .line 66
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 67
    .line 68
    .line 69
    move-result-wide v0

    .line 70
    invoke-virtual {p0, p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    const-string p1, "put(...)"

    .line 75
    .line 76
    invoke-static {p0, p1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    return-object p0
.end method

.method public static w(Landroid/content/Context;LA0/i;)V
    .locals 4

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p0, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p0, Lorg/json/JSONArray;

    .line 7
    .line 8
    invoke-direct {p0}, Lorg/json/JSONArray;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p1, LA0/i;->f:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    new-instance v0, Lorg/json/JSONArray;

    .line 34
    .line 35
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 36
    .line 37
    .line 38
    iget-object v1, p1, LA0/i;->g:Ljava/util/List;

    .line 39
    .line 40
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_1

    .line 49
    .line 50
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    check-cast v2, Ljava/lang/String;

    .line 55
    .line 56
    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    new-instance v1, Lorg/json/JSONObject;

    .line 61
    .line 62
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 63
    .line 64
    .line 65
    iget-object v2, p1, LA0/i;->a:Ljava/lang/String;

    .line 66
    .line 67
    const-string v3, "mvvmFragmentClassName"

    .line 68
    .line 69
    invoke-virtual {v1, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    iget-object v2, p1, LA0/i;->b:Ljava/lang/String;

    .line 74
    .line 75
    const-string v3, "addressLiveListClassName"

    .line 76
    .line 77
    invoke-virtual {v1, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    iget-object v2, p1, LA0/i;->c:Ljava/lang/String;

    .line 82
    .line 83
    const-string v3, "liveListSubmitMethodName"

    .line 84
    .line 85
    invoke-virtual {v1, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    iget-object v2, p1, LA0/i;->d:Ljava/lang/String;

    .line 90
    .line 91
    const-string v3, "liveListGetterName"

    .line 92
    .line 93
    invoke-virtual {v1, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    iget-object v2, p1, LA0/i;->e:Ljava/lang/String;

    .line 98
    .line 99
    const-string v3, "adapterGetterName"

    .line 100
    .line 101
    invoke-virtual {v1, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    const-string v2, "mvvmAdapterClassNames"

    .line 106
    .line 107
    invoke-virtual {v1, v2, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    const-string v1, "mvvmItemClassNames"

    .line 112
    .line 113
    invoke-virtual {p0, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    iget-object p1, p1, LA0/i;->h:Ljava/lang/String;

    .line 118
    .line 119
    const-string v0, "refreshSubmitMethodName"

    .line 120
    .line 121
    invoke-virtual {p0, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    const-string p1, "put(...)"

    .line 126
    .line 127
    invoke-static {p0, p1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    const/4 p1, 0x3

    .line 131
    invoke-static {p0, p1}, LA0/l;->v(Lorg/json/JSONObject;I)Lorg/json/JSONObject;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    const/4 v0, 0x0

    .line 140
    const-string v1, "hook_point_cache"

    .line 141
    .line 142
    invoke-virtual {p1, v1, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    const-string v0, "getSharedPreferences(...)"

    .line 147
    .line 148
    invoke-static {p1, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    invoke-virtual {p0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    const-string v0, "contact_mvvm_address"

    .line 160
    .line 161
    invoke-interface {p1, v0, p0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 166
    .line 167
    .line 168
    return-void
.end method

.method public static x(Landroid/content/Context;LA0/j;)V
    .locals 2

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p0, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p0, Lorg/json/JSONObject;

    .line 7
    .line 8
    invoke-direct {p0}, Lorg/json/JSONObject;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p1, LA0/j;->a:Ljava/util/List;

    .line 12
    .line 13
    invoke-static {v0}, LA0/l;->z(Ljava/util/List;)Lorg/json/JSONArray;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, "adapterClassNames"

    .line 18
    .line 19
    invoke-virtual {p0, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    iget-object v0, p1, LA0/j;->b:Ljava/util/List;

    .line 24
    .line 25
    invoke-static {v0}, LA0/l;->z(Ljava/util/List;)Lorg/json/JSONArray;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const-string v1, "dataSourceClassNames"

    .line 30
    .line 31
    invoke-virtual {p0, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    iget-object v0, p1, LA0/j;->c:Ljava/util/List;

    .line 36
    .line 37
    invoke-static {v0}, LA0/l;->z(Ljava/util/List;)Lorg/json/JSONArray;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    const-string v1, "itemClassNames"

    .line 42
    .line 43
    invoke-virtual {p0, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    iget-object v0, p1, LA0/j;->d:Ljava/util/List;

    .line 48
    .line 49
    invoke-static {v0}, LA0/l;->z(Ljava/util/List;)Lorg/json/JSONArray;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    const-string v1, "holderClassNames"

    .line 54
    .line 55
    invoke-virtual {p0, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    iget-object v0, p1, LA0/j;->f:Ljava/util/List;

    .line 60
    .line 61
    invoke-static {v0}, LA0/l;->z(Ljava/util/List;)Lorg/json/JSONArray;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    const-string v1, "requestClassNames"

    .line 66
    .line 67
    invoke-virtual {p0, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    iget-object v0, p1, LA0/j;->e:Ljava/util/List;

    .line 72
    .line 73
    invoke-static {v0}, LA0/l;->z(Ljava/util/List;)Lorg/json/JSONArray;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    const-string v1, "storageClassNames"

    .line 78
    .line 79
    invoke-virtual {p0, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    iget-object v0, p1, LA0/j;->g:Ljava/lang/String;

    .line 84
    .line 85
    const-string v1, "getDataSourceMethodName"

    .line 86
    .line 87
    invoke-virtual {p0, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    iget-object v0, p1, LA0/j;->h:Ljava/lang/String;

    .line 92
    .line 93
    const-string v1, "getConversationListMethodName"

    .line 94
    .line 95
    invoke-virtual {p0, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    iget-object v0, p1, LA0/j;->i:Ljava/lang/String;

    .line 100
    .line 101
    const-string v1, "requestRefreshMethodName"

    .line 102
    .line 103
    invoke-virtual {p0, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    iget-object p1, p1, LA0/j;->j:Ljava/lang/String;

    .line 108
    .line 109
    const-string v0, "submitListMethodName"

    .line 110
    .line 111
    invoke-virtual {p0, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    const-string p1, "put(...)"

    .line 116
    .line 117
    invoke-static {p0, p1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    const/4 p1, 0x5

    .line 121
    invoke-static {p0, p1}, LA0/l;->v(Lorg/json/JSONObject;I)Lorg/json/JSONObject;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    const/4 v0, 0x0

    .line 130
    const-string v1, "hook_point_cache"

    .line 131
    .line 132
    invoke-virtual {p1, v1, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    const-string v0, "getSharedPreferences(...)"

    .line 137
    .line 138
    invoke-static {p1, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    invoke-virtual {p0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    const-string v0, "conversation_mvvm_list_v2"

    .line 150
    .line 151
    invoke-interface {p1, v0, p0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 156
    .line 157
    .line 158
    return-void
.end method

.method public static y(Landroid/content/Context;LA0/Z;)V
    .locals 2

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p0, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p0, Lorg/json/JSONObject;

    .line 7
    .line 8
    invoke-direct {p0}, Lorg/json/JSONObject;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p1, LA0/Z;->a:Ljava/util/List;

    .line 12
    .line 13
    invoke-static {v0}, LA0/l;->z(Ljava/util/List;)Lorg/json/JSONArray;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, "adapterClassNames"

    .line 18
    .line 19
    invoke-virtual {p0, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    iget-object v0, p1, LA0/Z;->b:Ljava/util/List;

    .line 24
    .line 25
    invoke-static {v0}, LA0/l;->z(Ljava/util/List;)Lorg/json/JSONArray;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const-string v1, "itemClassNames"

    .line 30
    .line 31
    invoke-virtual {p0, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    iget-object v0, p1, LA0/Z;->c:Ljava/util/List;

    .line 36
    .line 37
    invoke-static {v0}, LA0/l;->z(Ljava/util/List;)Lorg/json/JSONArray;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    const-string v1, "usernameFieldNames"

    .line 42
    .line 43
    invoke-virtual {p0, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    iget-object v0, p1, LA0/Z;->d:Ljava/util/List;

    .line 48
    .line 49
    invoke-static {v0}, LA0/l;->z(Ljava/util/List;)Lorg/json/JSONArray;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    const-string v1, "refreshMethodNames"

    .line 54
    .line 55
    invoke-virtual {p0, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    iget-object v0, p1, LA0/Z;->e:Ljava/util/List;

    .line 60
    .line 61
    invoke-static {v0}, LA0/l;->z(Ljava/util/List;)Lorg/json/JSONArray;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    const-string v1, "fileSortEntryNames"

    .line 66
    .line 67
    invoke-virtual {p0, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    iget-object p1, p1, LA0/Z;->f:Ljava/util/List;

    .line 72
    .line 73
    invoke-static {p1}, LA0/l;->z(Ljava/util/List;)Lorg/json/JSONArray;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    const-string v0, "fileSortActivityClassNames"

    .line 78
    .line 79
    invoke-virtual {p0, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    const-string p1, "put(...)"

    .line 84
    .line 85
    invoke-static {p0, p1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    const/4 p1, 0x3

    .line 89
    invoke-static {p0, p1}, LA0/l;->v(Lorg/json/JSONObject;I)Lorg/json/JSONObject;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    const/4 v0, 0x0

    .line 98
    const-string v1, "hook_point_cache"

    .line 99
    .line 100
    invoke-virtual {p1, v1, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    const-string v0, "getSharedPreferences(...)"

    .line 105
    .line 106
    invoke-static {p1, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    const-string v0, "storage_chat_history_v4"

    .line 114
    .line 115
    invoke-virtual {p0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    invoke-interface {p1, v0, p0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 124
    .line 125
    .line 126
    return-void
.end method

.method public static z(Ljava/util/List;)Lorg/json/JSONArray;
    .locals 2

    .line 1
    new-instance v0, Lorg/json/JSONArray;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return-object v0
.end method
