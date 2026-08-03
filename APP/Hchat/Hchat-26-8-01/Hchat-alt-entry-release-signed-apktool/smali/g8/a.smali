.class public final Lg8/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/lang/ClassLoader;

.field public final c:Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;

.field public volatile d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/ClassLoader;Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;Li8/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lg8/a;->a:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lg8/a;->b:Ljava/lang/ClassLoader;

    .line 7
    .line 8
    iput-object p3, p0, Lg8/a;->c:Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    :try_start_0
    const-string v1, "com.tencent.mm.sdk.platformtools.MMApplicationContext"

    .line 4
    .line 5
    iget-object v2, p0, Lg8/a;->b:Ljava/lang/ClassLoader;

    .line 6
    .line 7
    invoke-static {v1, v2}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, "getSharedPreferences"

    .line 12
    .line 13
    const/4 v3, 0x4

    .line 14
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    filled-new-array {p1, v4}, [Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    invoke-static {v1, v2, v4}, Lh/Hchat/utils/KavaReflector;->invokeStaticMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    if-nez v1, :cond_0

    .line 27
    .line 28
    iget-object v1, p0, Lg8/a;->a:Landroid/content/Context;

    .line 29
    .line 30
    invoke-virtual {v1, p1, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    :cond_0
    if-nez v1, :cond_1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const-string p1, "getString"

    .line 38
    .line 39
    filled-new-array {p2, v0}, [Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-static {v1, p1, p2}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    instance-of p2, p1, Ljava/lang/String;

    .line 48
    .line 49
    if-eqz p2, :cond_2

    .line 50
    .line 51
    check-cast p1, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    return-object p1

    .line 54
    :catchall_0
    :cond_2
    :goto_0
    return-object v0
.end method

.method public final b(I)Ljava/lang/String;
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lg8/a;->c:Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;

    .line 2
    .line 3
    const-string v1, "SELECT value FROM userinfo WHERE id=?"

    .line 4
    .line 5
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    filled-new-array {v2}, [Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const-string v3, "value"

    .line 14
    .line 15
    invoke-virtual {v0, v1, v2, v3}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->queryFirstString(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    return-object p1

    .line 20
    :catchall_0
    move-exception v0

    .line 21
    const-string v1, "\u8bfb\u53d6\u8d26\u53f7\u5b57\u6bb5\u5931\u8d25: "

    .line 22
    .line 23
    const-string v2, " "

    .line 24
    .line 25
    invoke-static {p1, v1, v2}, Leh/a;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    const-string v0, "[WeChatAccountApi] "

    .line 41
    .line 42
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-static {p1}, Li8/i;->f(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const-string p1, ""

    .line 50
    .line 51
    return-object p1
.end method

.method public final c()Ljava/lang/String;
    .locals 5

    .line 1
    iget-object v0, p0, Lg8/a;->d:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lg8/a;->d:Ljava/lang/String;

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    const/4 v0, 0x2

    .line 13
    invoke-virtual {p0, v0}, Lg8/a;->b(I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const-string v2, ""

    .line 22
    .line 23
    if-eqz v1, :cond_4

    .line 24
    .line 25
    const-string v0, "notify_key_pref_no_account"

    .line 26
    .line 27
    const-string v1, "login_weixin_username"

    .line 28
    .line 29
    invoke-virtual {p0, v0, v1}, Lg8/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-nez v3, :cond_1

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    const-string v0, "login_username"

    .line 45
    .line 46
    const-string v3, "last_login_username"

    .line 47
    .line 48
    const-string v4, "login_user_name"

    .line 49
    .line 50
    filled-new-array {v1, v4, v0, v3}, [Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    const/4 v1, 0x0

    .line 55
    :goto_0
    const/4 v3, 0x4

    .line 56
    if-ge v1, v3, :cond_3

    .line 57
    .line 58
    aget-object v3, v0, v1

    .line 59
    .line 60
    const-string v4, "login_info"

    .line 61
    .line 62
    invoke-virtual {p0, v4, v3}, Lg8/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    if-nez v4, :cond_2

    .line 71
    .line 72
    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    goto :goto_1

    .line 77
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_3
    move-object v0, v2

    .line 81
    :cond_4
    :goto_1
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    if-eqz v1, :cond_6

    .line 86
    .line 87
    const/16 v0, 0x2a

    .line 88
    .line 89
    invoke-virtual {p0, v0}, Lg8/a;->b(I)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    if-nez v1, :cond_5

    .line 98
    .line 99
    iget-object v1, p0, Lg8/a;->c:Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;

    .line 100
    .line 101
    :try_start_0
    const-string v3, "SELECT username FROM rcontact WHERE alias=? AND username!=\'\' AND username NOT LIKE \'%@chatroom\' AND username NOT LIKE \'%@im.chatroom\' LIMIT 1"

    .line 102
    .line 103
    filled-new-array {v0}, [Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    const-string v4, "username"

    .line 108
    .line 109
    invoke-virtual {v1, v3, v0, v4}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->queryFirstString(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 113
    goto :goto_2

    .line 114
    :catchall_0
    move-exception v0

    .line 115
    new-instance v1, Ljava/lang/StringBuilder;

    .line 116
    .line 117
    const-string v3, "\u901a\u8fc7\u5fae\u4fe1\u53f7\u53cd\u67e5\u81ea\u8eabwxid\u5931\u8d25: "

    .line 118
    .line 119
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    const-string v1, "[WeChatAccountApi] "

    .line 134
    .line 135
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    invoke-static {v0}, Li8/i;->f(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    :cond_5
    :goto_2
    move-object v0, v2

    .line 143
    :cond_6
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 144
    .line 145
    .line 146
    move-result v1

    .line 147
    if-nez v1, :cond_7

    .line 148
    .line 149
    iput-object v0, p0, Lg8/a;->d:Ljava/lang/String;

    .line 150
    .line 151
    :cond_7
    return-object v0
.end method
