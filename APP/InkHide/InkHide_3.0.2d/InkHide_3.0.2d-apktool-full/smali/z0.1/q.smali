.class public abstract Lz0/q;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Landroid/os/Handler;

.field public static final b:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final c:Ljava/util/concurrent/ConcurrentHashMap;

.field public static volatile d:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroid/os/Handler;

    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lz0/q;->a:Landroid/os/Handler;

    .line 11
    .line 12
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lz0/q;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 18
    .line 19
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 22
    .line 23
    .line 24
    sput-object v0, Lz0/q;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 25
    .line 26
    return-void
.end method

.method public static a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "getMethods(...)"

    .line 10
    .line 11
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    array-length v1, v0

    .line 15
    const/4 v2, 0x0

    .line 16
    :goto_0
    if-ge v2, v1, :cond_1

    .line 17
    .line 18
    aget-object v3, v0, v2

    .line 19
    .line 20
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    invoke-static {v4, p2}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    if-eqz v4, :cond_0

    .line 29
    .line 30
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    array-length v4, v4

    .line 35
    const/4 v5, 0x1

    .line 36
    if-ne v4, v5, :cond_0

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    const/4 v3, 0x0

    .line 43
    :goto_1
    if-nez v3, :cond_2

    .line 44
    .line 45
    goto :goto_3

    .line 46
    :cond_2
    :try_start_0
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v3, p0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    goto :goto_2

    .line 55
    :catchall_0
    move-exception p0

    .line 56
    new-instance v0, LE0/d;

    .line 57
    .line 58
    invoke-direct {v0, p0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 59
    .line 60
    .line 61
    move-object p0, v0

    .line 62
    :goto_2
    invoke-static {p0}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    if-eqz p0, :cond_3

    .line 67
    .line 68
    const-string v0, "read trace set msg field fail"

    .line 69
    .line 70
    filled-new-array {v0, p2, p1, p0}, [Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-static {p0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    :cond_3
    :goto_3
    return-void
.end method

.method public static b(Ljava/util/ArrayList;)Ljava/util/List;
    .locals 6

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/32 v2, 0x240c8400

    .line 6
    .line 7
    .line 8
    sub-long/2addr v0, v2

    .line 9
    new-instance v2, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_1

    .line 23
    .line 24
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    move-object v4, v3

    .line 29
    check-cast v4, Lz0/p;

    .line 30
    .line 31
    iget-wide v4, v4, Lz0/p;->d:J

    .line 32
    .line 33
    cmp-long v4, v4, v0

    .line 34
    .line 35
    if-ltz v4, :cond_0

    .line 36
    .line 37
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    new-instance p0, LV/k;

    .line 42
    .line 43
    const/4 v0, 0x3

    .line 44
    invoke-direct {p0, v0}, LV/k;-><init>(I)V

    .line 45
    .line 46
    .line 47
    invoke-static {v2, p0}, LF0/k;->r0(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    const/16 v0, 0x64

    .line 52
    .line 53
    invoke-static {p0, v0}, LF0/k;->s0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0
.end method

.method public static c(Ljava/lang/String;JLjava/lang/String;)Landroid/content/ContentValues;
    .locals 3

    .line 1
    new-instance v0, Landroid/content/ContentValues;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, LP0/a;->a:LP0/a;

    .line 7
    .line 8
    invoke-virtual {v1}, LP0/a;->c()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    int-to-long v1, v1

    .line 13
    add-long/2addr v1, p1

    .line 14
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const-string v2, "msgSvrId"

    .line 19
    .line 20
    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 21
    .line 22
    .line 23
    const/16 v1, 0x2710

    .line 24
    .line 25
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    const-string v2, "type"

    .line 30
    .line 31
    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 32
    .line 33
    .line 34
    const/4 v1, 0x3

    .line 35
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    const-string v2, "status"

    .line 40
    .line 41
    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 42
    .line 43
    .line 44
    const/4 v1, 0x0

    .line 45
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    const-string v2, "isSend"

    .line 50
    .line 51
    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 52
    .line 53
    .line 54
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    const-string p2, "createTime"

    .line 59
    .line 60
    invoke-virtual {v0, p2, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 61
    .line 62
    .line 63
    const-string p1, "talker"

    .line 64
    .line 65
    invoke-virtual {v0, p1, p0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    const-string p0, "content"

    .line 69
    .line 70
    invoke-virtual {v0, p0, p3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    return-object v0
.end method

.method public static d(Landroid/content/Context;Lz0/n;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p1, Lz0/n;->b:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-string v2, "getClassLoader(...)"

    .line 8
    .line 9
    invoke-static {v1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    sget-object v3, Lc0/f;->b:Ld0/b;

    .line 13
    .line 14
    invoke-interface {v3, v1, v0}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v1, 0x0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    goto/16 :goto_4

    .line 22
    .line 23
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-static {p0, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    iget-object v2, p1, Lz0/n;->c:Ljava/lang/String;

    .line 31
    .line 32
    sget-object v3, Lc0/f;->b:Ld0/b;

    .line 33
    .line 34
    invoke-interface {v3, p0, v2}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    if-nez p0, :cond_1

    .line 39
    .line 40
    goto/16 :goto_4

    .line 41
    .line 42
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    const-string v2, "getMethods(...)"

    .line 47
    .line 48
    invoke-static {p0, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    array-length v3, p0

    .line 52
    const/4 v4, 0x0

    .line 53
    move v5, v4

    .line 54
    :goto_0
    if-ge v5, v3, :cond_3

    .line 55
    .line 56
    aget-object v6, p0, v5

    .line 57
    .line 58
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 59
    .line 60
    .line 61
    move-result v7

    .line 62
    invoke-static {v7}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 63
    .line 64
    .line 65
    move-result v7

    .line 66
    if-eqz v7, :cond_2

    .line 67
    .line 68
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v7

    .line 72
    const-string v8, "s"

    .line 73
    .line 74
    invoke-static {v7, v8}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v7

    .line 78
    if-eqz v7, :cond_2

    .line 79
    .line 80
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    move-result-object v7

    .line 84
    array-length v7, v7

    .line 85
    const/4 v8, 0x1

    .line 86
    if-ne v7, v8, :cond_2

    .line 87
    .line 88
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    move-result-object v7

    .line 92
    aget-object v7, v7, v4

    .line 93
    .line 94
    const-class v8, Ljava/lang/Class;

    .line 95
    .line 96
    invoke-static {v7, v8}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v7

    .line 100
    if-eqz v7, :cond_2

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_2
    add-int/lit8 v5, v5, 0x1

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_3
    move-object v6, v1

    .line 107
    :goto_1
    if-eqz v6, :cond_6

    .line 108
    .line 109
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    invoke-virtual {v6, v1, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    if-eqz p0, :cond_6

    .line 118
    .line 119
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-virtual {v0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-static {v0, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    array-length v2, v0

    .line 131
    :goto_2
    if-ge v4, v2, :cond_5

    .line 132
    .line 133
    aget-object v3, v0, v4

    .line 134
    .line 135
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v5

    .line 139
    iget-object v6, p1, Lz0/n;->d:Ljava/lang/String;

    .line 140
    .line 141
    invoke-static {v5, v6}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v5

    .line 145
    if-eqz v5, :cond_4

    .line 146
    .line 147
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    move-result-object v5

    .line 151
    const-string v6, "getParameterTypes(...)"

    .line 152
    .line 153
    invoke-static {v5, v6}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    array-length v5, v5

    .line 157
    if-nez v5, :cond_4

    .line 158
    .line 159
    goto :goto_3

    .line 160
    :cond_4
    add-int/lit8 v4, v4, 0x1

    .line 161
    .line 162
    goto :goto_2

    .line 163
    :cond_5
    move-object v3, v1

    .line 164
    :goto_3
    if-eqz v3, :cond_6

    .line 165
    .line 166
    invoke-virtual {v3, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    return-object p0

    .line 171
    :cond_6
    :goto_4
    return-object v1
.end method

.method public static e()Ljava/util/List;
    .locals 15

    .line 1
    const-string v0, "optString(...)"

    .line 2
    .line 3
    const-string v1, "read_trace_monitor"

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
    :try_start_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    const-string v4, "startReloadIfChangedUnexpectedly"

    .line 17
    .line 18
    const/4 v5, 0x0

    .line 19
    invoke-virtual {v3, v4, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

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
    invoke-virtual {v3, v1, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    .line 30
    :catchall_0
    const-string v3, "tracks"

    .line 31
    .line 32
    const-string v4, "[]"

    .line 33
    .line 34
    invoke-interface {v1, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    if-nez v1, :cond_0

    .line 39
    .line 40
    const-string v1, ""

    .line 41
    .line 42
    :cond_0
    :try_start_1
    new-instance v3, Lorg/json/JSONArray;

    .line 43
    .line 44
    invoke-direct {v3, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    new-instance v4, Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-direct {v4, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 54
    .line 55
    .line 56
    move v5, v2

    .line 57
    :goto_0
    if-ge v5, v1, :cond_2

    .line 58
    .line 59
    invoke-virtual {v3, v5}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 60
    .line 61
    .line 62
    move-result-object v6

    .line 63
    if-nez v6, :cond_1

    .line 64
    .line 65
    new-instance v6, Lorg/json/JSONObject;

    .line 66
    .line 67
    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    .line 68
    .line 69
    .line 70
    :cond_1
    new-instance v7, Lz0/p;

    .line 71
    .line 72
    const-string v8, "talker"

    .line 73
    .line 74
    invoke-virtual {v6, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v8

    .line 78
    invoke-static {v8, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    const-string v9, "trackId"

    .line 82
    .line 83
    invoke-virtual {v6, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v9

    .line 87
    invoke-static {v9, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    const-string v10, "summary"

    .line 91
    .line 92
    invoke-virtual {v6, v10}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v10

    .line 96
    invoke-static {v10, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    const-string v11, "sendTime"

    .line 100
    .line 101
    invoke-virtual {v6, v11}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    .line 102
    .line 103
    .line 104
    move-result-wide v11

    .line 105
    const-string v13, "lastSeen"

    .line 106
    .line 107
    invoke-virtual {v6, v13}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v13

    .line 111
    invoke-static {v13, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    const-string v14, "completed"

    .line 115
    .line 116
    invoke-virtual {v6, v14, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 117
    .line 118
    .line 119
    move-result v14

    .line 120
    invoke-direct/range {v7 .. v14}, Lz0/p;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Z)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    add-int/lit8 v5, v5, 0x1

    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    .line 130
    .line 131
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    :cond_3
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 139
    .line 140
    .line 141
    move-result v2

    .line 142
    if-eqz v2, :cond_4

    .line 143
    .line 144
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    move-object v3, v2

    .line 149
    check-cast v3, Lz0/p;

    .line 150
    .line 151
    iget-object v4, v3, Lz0/p;->a:Ljava/lang/String;

    .line 152
    .line 153
    invoke-static {v4}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 154
    .line 155
    .line 156
    move-result v4

    .line 157
    if-nez v4, :cond_3

    .line 158
    .line 159
    iget-object v3, v3, Lz0/p;->b:Ljava/lang/String;

    .line 160
    .line 161
    invoke-static {v3}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 162
    .line 163
    .line 164
    move-result v3

    .line 165
    if-nez v3, :cond_3

    .line 166
    .line 167
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 168
    .line 169
    .line 170
    goto :goto_1

    .line 171
    :catchall_1
    move-exception v0

    .line 172
    new-instance v1, LE0/d;

    .line 173
    .line 174
    invoke-direct {v1, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 175
    .line 176
    .line 177
    move-object v0, v1

    .line 178
    :cond_4
    sget-object v1, LF0/s;->a:LF0/s;

    .line 179
    .line 180
    instance-of v2, v0, LE0/d;

    .line 181
    .line 182
    if-eqz v2, :cond_5

    .line 183
    .line 184
    move-object v0, v1

    .line 185
    :cond_5
    check-cast v0, Ljava/util/List;

    .line 186
    .line 187
    return-object v0
.end method

.method public static f()Lz0/n;
    .locals 9

    .line 1
    new-instance v0, Lz0/n;

    .line 2
    .line 3
    const-string v2, "sc3.x3"

    .line 4
    .line 5
    const-string v3, "yj0.j1"

    .line 6
    .line 7
    const-string v1, "com.tencent.mm.storage.y8"

    .line 8
    .line 9
    const-string v4, "xh"

    .line 10
    .line 11
    const-string v5, "L9"

    .line 12
    .line 13
    invoke-direct/range {v0 .. v5}, Lz0/n;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v1, Lz0/n;

    .line 17
    .line 18
    const-string v3, "ge3.x3"

    .line 19
    .line 20
    const-string v4, "tk0.j1"

    .line 21
    .line 22
    const-string v2, "com.tencent.mm.storage.f9"

    .line 23
    .line 24
    const-string v5, "Ah"

    .line 25
    .line 26
    const-string v6, "z9"

    .line 27
    .line 28
    invoke-direct/range {v1 .. v6}, Lz0/n;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    new-instance v2, Lz0/n;

    .line 32
    .line 33
    const-string v4, "ef3.x3"

    .line 34
    .line 35
    const-string v5, "dl0.k1"

    .line 36
    .line 37
    const-string v3, "com.tencent.mm.storage.f9"

    .line 38
    .line 39
    const-string v6, "Wh"

    .line 40
    .line 41
    const-string v7, "z9"

    .line 42
    .line 43
    invoke-direct/range {v2 .. v7}, Lz0/n;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    new-instance v3, Lz0/n;

    .line 47
    .line 48
    const-string v5, "com.tencent.mm.plugin.messenger.foundation.h2"

    .line 49
    .line 50
    const-string v6, "gm0.j1"

    .line 51
    .line 52
    const-string v4, "com.tencent.mm.storage.f9"

    .line 53
    .line 54
    const-string v7, "cj"

    .line 55
    .line 56
    const-string v8, "M9"

    .line 57
    .line 58
    invoke-direct/range {v3 .. v8}, Lz0/n;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-static {v0, v1, v2, v3}, Lz0/r;->D(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    check-cast v0, Lz0/n;

    .line 66
    .line 67
    return-object v0
.end method

.method public static g(Ljava/lang/String;)V
    .locals 1

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    invoke-static {p0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-static {p0}, Lz0/q;->m(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_1
    :goto_0
    sget-object p0, Lz0/q;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    const-string v0, "<get-keys>(...)"

    .line 21
    .line 22
    invoke-static {p0, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-static {p0}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    check-cast v0, Ljava/lang/String;

    .line 44
    .line 45
    invoke-static {v0}, LN0/g;->b(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    invoke-static {v0}, Lz0/q;->m(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_2
    return-void
.end method

.method public static h(Landroid/content/Context;Ljava/lang/String;)V
    .locals 5

    .line 1
    const-string v0, "talker"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-boolean v0, Lz0/i;->a:Z

    .line 7
    .line 8
    invoke-static {}, Lz0/g;->G()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_7

    .line 13
    .line 14
    invoke-static {p1}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    goto :goto_3

    .line 21
    :cond_0
    invoke-static {}, Lz0/q;->e()Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    new-instance v1, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_2

    .line 39
    .line 40
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    move-object v3, v2

    .line 45
    check-cast v3, Lz0/p;

    .line 46
    .line 47
    iget-object v4, v3, Lz0/p;->a:Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {v4, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    if-eqz v4, :cond_1

    .line 54
    .line 55
    iget-boolean v3, v3, Lz0/p;->f:Z

    .line 56
    .line 57
    if-nez v3, :cond_1

    .line 58
    .line 59
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-eqz v0, :cond_3

    .line 68
    .line 69
    invoke-static {p1}, Lz0/q;->m(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_3
    sget-object v0, Lz0/q;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 74
    .line 75
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    if-nez v1, :cond_5

    .line 80
    .line 81
    new-instance v1, Lz0/o;

    .line 82
    .line 83
    invoke-direct {v1, p1}, Lz0/o;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, p1, v1}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    if-nez v0, :cond_4

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_4
    move-object v1, v0

    .line 94
    :cond_5
    :goto_1
    check-cast v1, Lz0/o;

    .line 95
    .line 96
    const/4 v0, 0x1

    .line 97
    iput-boolean v0, v1, Lz0/o;->b:Z

    .line 98
    .line 99
    iget v2, v1, Lz0/o;->c:I

    .line 100
    .line 101
    add-int/2addr v2, v0

    .line 102
    iput v2, v1, Lz0/o;->c:I

    .line 103
    .line 104
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    if-nez v0, :cond_6

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_6
    move-object p0, v0

    .line 112
    :goto_2
    iget v0, v1, Lz0/o;->c:I

    .line 113
    .line 114
    invoke-static {p0, p1, v0}, Lz0/q;->j(Landroid/content/Context;Ljava/lang/String;I)V

    .line 115
    .line 116
    .line 117
    return-void

    .line 118
    :cond_7
    :goto_3
    invoke-static {p1}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 119
    .line 120
    .line 121
    move-result p0

    .line 122
    if-nez p0, :cond_8

    .line 123
    .line 124
    invoke-static {p1}, Lz0/q;->m(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    :cond_8
    return-void
.end method

.method public static i(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 6

    .line 1
    new-instance v0, Lorg/json/JSONArray;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x0

    .line 16
    :goto_0
    if-ge v2, v1, :cond_3

    .line 17
    .line 18
    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    instance-of v4, v3, Ljava/lang/String;

    .line 23
    .line 24
    if-eqz v4, :cond_0

    .line 25
    .line 26
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    instance-of v4, v3, Lorg/json/JSONObject;

    .line 31
    .line 32
    if-eqz v4, :cond_2

    .line 33
    .line 34
    check-cast v3, Lorg/json/JSONObject;

    .line 35
    .line 36
    const-string v4, "timestamp"

    .line 37
    .line 38
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    invoke-static {v4}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    if-eqz v5, :cond_1

    .line 47
    .line 48
    const-string v4, "time"

    .line 49
    .line 50
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    :cond_1
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    :cond_2
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_3
    new-instance v0, Ljava/util/ArrayList;

    .line 61
    .line 62
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    :cond_4
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-eqz v1, :cond_5

    .line 74
    .line 75
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    move-object v2, v1

    .line 80
    check-cast v2, Ljava/lang/String;

    .line 81
    .line 82
    invoke-static {v2}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    if-nez v2, :cond_4

    .line 87
    .line 88
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_5
    return-object v0
.end method

.method public static j(Landroid/content/Context;Ljava/lang/String;I)V
    .locals 8

    .line 1
    sget-object v0, Lz0/q;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lz0/o;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto/16 :goto_2

    .line 12
    .line 13
    :cond_0
    iget-boolean v1, v0, Lz0/o;->b:Z

    .line 14
    .line 15
    if-eqz v1, :cond_9

    .line 16
    .line 17
    iget v1, v0, Lz0/o;->c:I

    .line 18
    .line 19
    if-eq v1, p2, :cond_1

    .line 20
    .line 21
    goto/16 :goto_2

    .line 22
    .line 23
    :cond_1
    invoke-static {}, Lz0/q;->e()Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    new-instance v2, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_3

    .line 41
    .line 42
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    move-object v4, v3

    .line 47
    check-cast v4, Lz0/p;

    .line 48
    .line 49
    iget-object v5, v4, Lz0/p;->a:Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {v5, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    if-eqz v5, :cond_2

    .line 56
    .line 57
    iget-boolean v4, v4, Lz0/p;->f:Z

    .line 58
    .line 59
    if-nez v4, :cond_2

    .line 60
    .line 61
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_3
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-eqz v1, :cond_4

    .line 70
    .line 71
    invoke-static {p1}, Lz0/q;->m(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :cond_4
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    if-eqz v2, :cond_7

    .line 84
    .line 85
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    check-cast v2, Lz0/p;

    .line 90
    .line 91
    sget-boolean v3, Lz0/i;->a:Z

    .line 92
    .line 93
    invoke-static {}, Lz0/g;->k()Lcom/lu/wxmask/bean/OptionData;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    invoke-virtual {v3}, Lcom/lu/wxmask/bean/OptionData;->getReadTraceServerUrl()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    invoke-static {v3}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    invoke-static {v3}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    if-eqz v4, :cond_5

    .line 114
    .line 115
    const-string v3, "https://read.spint.kdns.fr"

    .line 116
    .line 117
    :cond_5
    invoke-static {v3}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    const/4 v4, 0x1

    .line 126
    new-array v4, v4, [C

    .line 127
    .line 128
    const/16 v5, 0x2f

    .line 129
    .line 130
    const/4 v6, 0x0

    .line 131
    aput-char v5, v4, v6

    .line 132
    .line 133
    invoke-static {v3, v4}, LU0/i;->E0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    invoke-static {v3}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 138
    .line 139
    .line 140
    move-result v4

    .line 141
    if-eqz v4, :cond_6

    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_6
    iget-object v4, v2, Lz0/p;->b:Ljava/lang/String;

    .line 145
    .line 146
    sget-object v5, LU0/a;->a:Ljava/nio/charset/Charset;

    .line 147
    .line 148
    invoke-virtual {v5}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v6

    .line 152
    invoke-static {v4, v6}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    const-string v6, "encode(...)"

    .line 157
    .line 158
    invoke-static {v4, v6}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    iget-object v7, v2, Lz0/p;->e:Ljava/lang/String;

    .line 162
    .line 163
    invoke-virtual {v5}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v5

    .line 167
    invoke-static {v7, v5}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v5

    .line 171
    invoke-static {v5, v6}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    new-instance v6, Ljava/lang/StringBuilder;

    .line 175
    .line 176
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    const-string v3, "/times?id="

    .line 183
    .line 184
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    const-string v3, "&after="

    .line 191
    .line 192
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v3

    .line 202
    sget-object v4, LD0/d;->a:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 203
    .line 204
    new-instance v4, Lo0/b;

    .line 205
    .line 206
    const/16 v5, 0xa

    .line 207
    .line 208
    invoke-direct {v4, v2, p0, v5}, Lo0/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 209
    .line 210
    .line 211
    invoke-static {v3, v4}, LD/h;->o(Ljava/lang/String;LM0/l;)V

    .line 212
    .line 213
    .line 214
    goto/16 :goto_1

    .line 215
    .line 216
    :cond_7
    iget-object v1, v0, Lz0/o;->d:LL/a;

    .line 217
    .line 218
    if-eqz v1, :cond_8

    .line 219
    .line 220
    sget-object v2, Lz0/q;->a:Landroid/os/Handler;

    .line 221
    .line 222
    invoke-virtual {v2, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 223
    .line 224
    .line 225
    :cond_8
    new-instance v1, LL/a;

    .line 226
    .line 227
    invoke-direct {v1, p0, p1, p2}, LL/a;-><init>(Landroid/content/Context;Ljava/lang/String;I)V

    .line 228
    .line 229
    .line 230
    iput-object v1, v0, Lz0/o;->d:LL/a;

    .line 231
    .line 232
    sget-object p0, Lz0/q;->a:Landroid/os/Handler;

    .line 233
    .line 234
    const-wide/16 p1, 0x2710

    .line 235
    .line 236
    invoke-virtual {p0, v1, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 237
    .line 238
    .line 239
    :cond_9
    :goto_2
    return-void
.end method

.method public static k(Ljava/lang/reflect/Method;)Ljava/lang/Class;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 6
    .line 7
    invoke-static {v0, v1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const-class p0, Ljava/lang/Long;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    const-string v0, "getReturnType(...)"

    .line 21
    .line 22
    invoke-static {p0, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-object p0
.end method

.method public static l(Ljava/util/List;)V
    .locals 6

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
    check-cast v1, Lz0/p;

    .line 21
    .line 22
    new-instance v2, Lorg/json/JSONObject;

    .line 23
    .line 24
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 25
    .line 26
    .line 27
    iget-object v3, v1, Lz0/p;->a:Ljava/lang/String;

    .line 28
    .line 29
    const-string v4, "talker"

    .line 30
    .line 31
    invoke-virtual {v2, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    iget-object v3, v1, Lz0/p;->b:Ljava/lang/String;

    .line 36
    .line 37
    const-string v4, "trackId"

    .line 38
    .line 39
    invoke-virtual {v2, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    iget-object v3, v1, Lz0/p;->c:Ljava/lang/String;

    .line 44
    .line 45
    const-string v4, "summary"

    .line 46
    .line 47
    invoke-virtual {v2, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    const-string v3, "sendTime"

    .line 52
    .line 53
    iget-wide v4, v1, Lz0/p;->d:J

    .line 54
    .line 55
    invoke-virtual {v2, v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    const-string v3, "lastSeen"

    .line 60
    .line 61
    iget-object v4, v1, Lz0/p;->e:Ljava/lang/String;

    .line 62
    .line 63
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    const-string v3, "completed"

    .line 68
    .line 69
    iget-boolean v1, v1, Lz0/p;->f:Z

    .line 70
    .line 71
    invoke-virtual {v2, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_0
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    const/4 v1, 0x0

    .line 84
    const-string v2, "read_trace_monitor"

    .line 85
    .line 86
    invoke-virtual {p0, v2, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    const-string v1, "getSharedPreferences(...)"

    .line 91
    .line 92
    invoke-static {p0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    const-string v1, "tracks"

    .line 100
    .line 101
    invoke-virtual {v0}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-interface {p0, v1, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 110
    .line 111
    .line 112
    return-void
.end method

.method public static m(Ljava/lang/String;)V
    .locals 2

    .line 1
    sget-object v0, Lz0/q;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lz0/o;

    .line 8
    .line 9
    if-eqz p0, :cond_1

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Lz0/o;->b:Z

    .line 13
    .line 14
    iget-object v0, p0, Lz0/o;->d:LL/a;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    sget-object v1, Lz0/q;->a:Landroid/os/Handler;

    .line 19
    .line 20
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    iput-object v0, p0, Lz0/o;->d:LL/a;

    .line 25
    .line 26
    :cond_1
    return-void
.end method
