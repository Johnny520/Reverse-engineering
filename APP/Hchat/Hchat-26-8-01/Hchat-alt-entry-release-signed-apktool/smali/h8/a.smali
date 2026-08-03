.class public final Lh8/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;

.field public final b:Lg8/i;

.field public final c:Lq8/r;

.field public final d:Lh/Hchat/dexkit/DexFinder;


# direct methods
.method public constructor <init>(Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;Lg8/i;Lq8/r;Lh/Hchat/dexkit/DexFinder;Li8/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lh8/a;->a:Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;

    .line 5
    .line 6
    iput-object p2, p0, Lh8/a;->b:Lg8/i;

    .line 7
    .line 8
    iput-object p3, p0, Lh8/a;->c:Lq8/r;

    .line 9
    .line 10
    iput-object p4, p0, Lh8/a;->d:Lh/Hchat/dexkit/DexFinder;

    .line 11
    .line 12
    return-void
.end method

.method public static d(Ljava/lang/String;Ljava/util/Map;)I
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-interface {p1, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    :goto_0
    instance-of p1, p0, Ljava/lang/Number;

    .line 10
    .line 11
    if-eqz p1, :cond_1

    .line 12
    .line 13
    check-cast p0, Ljava/lang/Number;

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    :cond_1
    if-eqz p0, :cond_2

    .line 21
    .line 22
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    goto :goto_1

    .line 27
    :cond_2
    const-string p0, ""

    .line 28
    .line 29
    :goto_1
    :try_start_0
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    return p0

    .line 34
    :catchall_0
    const/4 p0, 0x0

    .line 35
    return p0
.end method

.method public static g(Ljava/lang/String;Ljava/util/Map;)J
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-interface {p1, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    :goto_0
    instance-of p1, p0, Ljava/lang/Number;

    .line 10
    .line 11
    if-eqz p1, :cond_1

    .line 12
    .line 13
    check-cast p0, Ljava/lang/Number;

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 16
    .line 17
    .line 18
    move-result-wide p0

    .line 19
    return-wide p0

    .line 20
    :cond_1
    if-eqz p0, :cond_2

    .line 21
    .line 22
    :try_start_0
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    goto :goto_1

    .line 27
    :cond_2
    const-string p0, ""

    .line 28
    .line 29
    :goto_1
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 30
    .line 31
    .line 32
    move-result-wide p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    return-wide p0

    .line 34
    :catchall_0
    const-wide/16 p0, 0x0

    .line 35
    .line 36
    return-wide p0
.end method

.method public static j(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-interface {p1, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    :goto_0
    if-eqz p0, :cond_1

    .line 10
    .line 11
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_1
    const-string p0, ""

    .line 17
    .line 18
    return-object p0
.end method

.method public static k(Ljava/util/Map;)Ll8/b;
    .locals 3

    .line 1
    new-instance v0, Ll8/b;

    .line 2
    .line 3
    const-string v1, "username"

    .line 4
    .line 5
    invoke-static {v1, p0}, Lh8/a;->j(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "unReadCount"

    .line 10
    .line 11
    invoke-static {v2, p0}, Lh8/a;->d(Ljava/lang/String;Ljava/util/Map;)I

    .line 12
    .line 13
    .line 14
    const-string v2, "status"

    .line 15
    .line 16
    invoke-static {v2, p0}, Lh8/a;->d(Ljava/lang/String;Ljava/util/Map;)I

    .line 17
    .line 18
    .line 19
    const-string v2, "isSend"

    .line 20
    .line 21
    invoke-static {v2, p0}, Lh8/a;->d(Ljava/lang/String;Ljava/util/Map;)I

    .line 22
    .line 23
    .line 24
    const-string v2, "conversationTime"

    .line 25
    .line 26
    invoke-static {v2, p0}, Lh8/a;->g(Ljava/lang/String;Ljava/util/Map;)J

    .line 27
    .line 28
    .line 29
    const-string v2, "content"

    .line 30
    .line 31
    invoke-static {v2, p0}, Lh8/a;->j(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    const-string v2, "msgType"

    .line 35
    .line 36
    invoke-static {v2, p0}, Lh8/a;->j(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    const-string v2, "flag"

    .line 40
    .line 41
    invoke-static {v2, p0}, Lh8/a;->g(Ljava/lang/String;Ljava/util/Map;)J

    .line 42
    .line 43
    .line 44
    const-string v2, "digest"

    .line 45
    .line 46
    invoke-static {v2, p0}, Lh8/a;->j(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    const-string v2, "digestUser"

    .line 50
    .line 51
    invoke-static {v2, p0}, Lh8/a;->j(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    const-string v2, "atCount"

    .line 55
    .line 56
    invoke-static {v2, p0}, Lh8/a;->d(Ljava/lang/String;Ljava/util/Map;)I

    .line 57
    .line 58
    .line 59
    const-string v2, "unReadMuteCount"

    .line 60
    .line 61
    invoke-static {v2, p0}, Lh8/a;->d(Ljava/lang/String;Ljava/util/Map;)I

    .line 62
    .line 63
    .line 64
    const-string v2, "hasTodo"

    .line 65
    .line 66
    invoke-static {v2, p0}, Lh8/a;->d(Ljava/lang/String;Ljava/util/Map;)I

    .line 67
    .line 68
    .line 69
    invoke-direct {v0, v1}, Ll8/b;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Z
    .locals 5

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const-string p1, ""

    .line 9
    .line 10
    :goto_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x0

    .line 15
    if-nez v0, :cond_5

    .line 16
    .line 17
    iget-object v0, p0, Lh8/a;->d:Lh/Hchat/dexkit/DexFinder;

    .line 18
    .line 19
    iget-object v0, v0, Lh/Hchat/dexkit/DexFinder;->conversationDeleteMethod:Ljava/lang/reflect/Method;

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    const-string p1, "\u539f\u751f\u4f1a\u8bdd\u5220\u9664\u65b9\u6cd5\u5c1a\u672a\u5c31\u7eea"

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Lh8/a;->f(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    return v1

    .line 29
    :cond_1
    iget-object v2, p0, Lh8/a;->a:Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;

    .line 30
    .line 31
    invoke-virtual {v2, v0}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->storageObjectForMethod(Ljava/lang/reflect/Method;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    if-nez v3, :cond_2

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    const-string v0, "\u672a\u627e\u5230\u539f\u751f\u4f1a\u8bdd storage: "

    .line 46
    .line 47
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p0, p1}, Lh8/a;->f(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return v1

    .line 55
    :cond_2
    :try_start_0
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    invoke-static {v0, v3, v4}, Lh/Hchat/utils/KavaReflector;->invokeOrThrow(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 60
    .line 61
    .line 62
    const-string v0, "SELECT 1 FROM rconversation WHERE username=? LIMIT 1"

    .line 63
    .line 64
    filled-new-array {p1}, [Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-virtual {v2, v0, v3}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    const/4 v2, 0x0

    .line 73
    if-nez v0, :cond_3

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_3
    :try_start_1
    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 81
    .line 82
    .line 83
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 84
    :catchall_0
    :try_start_2
    invoke-interface {v0}, Landroid/database/Cursor;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 85
    .line 86
    .line 87
    :catchall_1
    :goto_1
    if-nez v2, :cond_4

    .line 88
    .line 89
    new-instance v0, Ljava/lang/StringBuilder;

    .line 90
    .line 91
    const-string v2, "\u65e0\u6cd5\u9a8c\u8bc1\u539f\u751f\u4f1a\u8bdd\u5220\u9664\u7ed3\u679c: talker="

    .line 92
    .line 93
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-virtual {p0, p1}, Lh8/a;->f(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    return v1

    .line 107
    :cond_4
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    xor-int/lit8 p1, p1, 0x1

    .line 112
    .line 113
    return p1

    .line 114
    :catchall_2
    move-exception v0

    .line 115
    new-instance v2, Ljava/lang/StringBuilder;

    .line 116
    .line 117
    const-string v3, "\u539f\u751f\u4f1a\u8bdd\u5220\u9664\u5931\u8d25: "

    .line 118
    .line 119
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    const-string v0, " talker="

    .line 130
    .line 131
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    invoke-virtual {p0, p1}, Lh8/a;->f(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    :cond_5
    return v1
.end method

.method public final b(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string p1, ""

    .line 8
    .line 9
    return-object p1

    .line 10
    :cond_0
    iget-object v0, p0, Lh8/a;->b:Lg8/i;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lg8/i;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    return-object v0

    .line 23
    :cond_1
    return-object p1
.end method

.method public final c()Ljava/util/ArrayList;
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    const/16 v1, 0x2710

    .line 3
    .line 4
    invoke-static {v1, v1}, Ljava/lang/Math;->min(II)I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    filled-new-array {v0}, [Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-string v1, "SELECT username, unReadCount, status, isSend, conversationTime, content, msgType, flag, digest, digestUser, atCount, unReadMuteCount, hasTodo FROM rconversation WHERE username!=\'\' ORDER BY conversationTime DESC LIMIT ?"

    .line 21
    .line 22
    invoke-virtual {p0, v1, v0}, Lh8/a;->i(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/ArrayList;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    return-object v0
.end method

.method public final e(Ljava/lang/String;)Z
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-nez v0, :cond_3

    .line 11
    .line 12
    iget-object v0, p0, Lh8/a;->d:Lh/Hchat/dexkit/DexFinder;

    .line 13
    .line 14
    iget-object v0, v0, Lh/Hchat/dexkit/DexFinder;->contactMuteStateMethod:Ljava/lang/reflect/Method;

    .line 15
    .line 16
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

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
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    iget-object v4, p0, Lh8/a;->b:Lg8/i;

    .line 29
    .line 30
    invoke-virtual {v4, v2}, Lg8/i;->R(Ljava/lang/String;)Lb/e;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    iget-object v2, v2, Lb/e;->i:Ljava/lang/Object;

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    :goto_0
    move-object v2, v3

    .line 40
    :goto_1
    if-eqz v0, :cond_3

    .line 41
    .line 42
    if-eqz v2, :cond_3

    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    aget-object v4, v4, v1

    .line 49
    .line 50
    invoke-virtual {v4, v2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    if-nez v4, :cond_2

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_2
    :try_start_0
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 58
    .line 59
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-static {v0, v3, v2}, Lh/Hchat/utils/KavaReflector;->invokeOrThrow(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-virtual {v4, v0}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    return p1

    .line 72
    :catchall_0
    move-exception v0

    .line 73
    new-instance v2, Ljava/lang/StringBuilder;

    .line 74
    .line 75
    const-string v3, "\u8bfb\u53d6\u5fae\u4fe1\u514d\u6253\u6270\u72b6\u6001\u5931\u8d25: "

    .line 76
    .line 77
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    const-string v0, " talker="

    .line 88
    .line 89
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-virtual {p0, p1}, Lh8/a;->f(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    :cond_3
    :goto_2
    return v1
.end method

.method public final f(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "[WeChatConversationApi] "

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p1}, Li8/i;->f(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final h(Ljava/lang/String;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lh8/a;->c:Lq8/r;

    .line 2
    .line 3
    iget-object v1, v0, Lq8/r;->a:Landroid/content/Context;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lq8/r;->a(Ljava/lang/String;)[Landroid/content/Intent;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    if-eqz p1, :cond_1

    .line 10
    .line 11
    array-length v2, p1

    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v2, 0x1

    .line 16
    :try_start_0
    invoke-virtual {v1, p1}, Landroid/content/Context;->startActivities([Landroid/content/Intent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    .line 19
    goto :goto_1

    .line 20
    :catchall_0
    :try_start_1
    array-length v3, p1

    .line 21
    sub-int/2addr v3, v2

    .line 22
    aget-object p1, p1, v3

    .line 23
    .line 24
    invoke-virtual {v1, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 25
    .line 26
    .line 27
    goto :goto_1

    .line 28
    :catchall_1
    move-exception p1

    .line 29
    new-instance v1, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    const-string v2, "\u6253\u5f00\u804a\u5929\u5931\u8d25: "

    .line 32
    .line 33
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {v0, p1}, Lq8/r;->b(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    :cond_1
    :goto_0
    const/4 v2, 0x0

    .line 51
    :goto_1
    return v2
.end method

.method public final i(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lh8/a;->a:Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;

    .line 7
    .line 8
    :try_start_0
    invoke-virtual {v1, p1, p2}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->query(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    if-eqz p2, :cond_1

    .line 21
    .line 22
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    check-cast p2, Ljava/util/Map;

    .line 27
    .line 28
    const-string v1, "username"

    .line 29
    .line 30
    invoke-static {v1, p2}, Lh8/a;->j(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const-string v2, "wxid_hchat_group_"

    .line 35
    .line 36
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

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
    invoke-static {p2}, Lh8/a;->k(Ljava/util/Map;)Ll8/b;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :catchall_0
    move-exception p1

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    return-object v0

    .line 54
    :goto_1
    new-instance p2, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    const-string v1, "\u4f1a\u8bdd\u67e5\u8be2\u5931\u8d25: "

    .line 57
    .line 58
    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-virtual {p0, p1}, Lh8/a;->f(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    return-object v0
.end method
