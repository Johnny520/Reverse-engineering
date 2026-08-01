.class public abstract La5;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# static fields
.field public static final a:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final b:Ljava/util/Set;

.field public static final c:Ljava/util/List;

.field public static volatile d:Z

.field public static volatile e:J

.field public static volatile f:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La5;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 7
    .line 8
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, La5;->b:Ljava/util/Set;

    .line 18
    .line 19
    new-instance v0, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-static {v0}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sput-object v0, La5;->c:Ljava/util/List;

    .line 29
    .line 30
    return-void
.end method

.method public static a(Ljava/lang/Object;Ljava/lang/reflect/Field;)I
    .locals 11

    .line 1
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p0, p1}, La5;->c(Ljava/lang/Object;Ljava/lang/reflect/Field;)J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    const-wide/16 v3, 0x2000

    .line 10
    .line 11
    and-long/2addr v3, v1

    .line 12
    const-wide/16 v5, 0x0

    .line 13
    .line 14
    cmp-long v3, v3, v5

    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    if-eqz v3, :cond_7

    .line 18
    .line 19
    const-wide/16 v5, -0x2001

    .line 20
    .line 21
    and-long/2addr v5, v1

    .line 22
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 23
    .line 24
    if-ne v0, v3, :cond_0

    .line 25
    .line 26
    long-to-int v0, v5

    .line 27
    invoke-virtual {p1, p0, v0}, Ljava/lang/reflect/Field;->setInt(Ljava/lang/Object;I)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const-class v3, Ljava/lang/Integer;

    .line 32
    .line 33
    if-ne v0, v3, :cond_1

    .line 34
    .line 35
    long-to-int v0, v5

    .line 36
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {p1, p0, v0}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    sget-object v3, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 45
    .line 46
    if-ne v0, v3, :cond_2

    .line 47
    .line 48
    invoke-virtual {p1, p0, v5, v6}, Ljava/lang/reflect/Field;->setLong(Ljava/lang/Object;J)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    const-class v3, Ljava/lang/Long;

    .line 53
    .line 54
    if-ne v0, v3, :cond_3

    .line 55
    .line 56
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {p1, p0, v0}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_3
    sget-object v3, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 65
    .line 66
    if-ne v0, v3, :cond_4

    .line 67
    .line 68
    long-to-int v0, v5

    .line 69
    int-to-short v0, v0

    .line 70
    invoke-virtual {p1, p0, v0}, Ljava/lang/reflect/Field;->setShort(Ljava/lang/Object;S)V

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_4
    const-class v3, Ljava/lang/Short;

    .line 75
    .line 76
    if-ne v0, v3, :cond_7

    .line 77
    .line 78
    long-to-int v0, v5

    .line 79
    int-to-short v0, v0

    .line 80
    invoke-static {v0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-virtual {p1, p0, v0}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 88
    .line 89
    .line 90
    move-result-wide p0

    .line 91
    sget-wide v7, La5;->f:J

    .line 92
    .line 93
    sub-long v7, p0, v7

    .line 94
    .line 95
    const-wide/16 v9, 0x4b0

    .line 96
    .line 97
    cmp-long v0, v7, v9

    .line 98
    .line 99
    if-gez v0, :cond_5

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_5
    sput-wide p0, La5;->f:J

    .line 103
    .line 104
    new-instance p0, Ljava/lang/StringBuilder;

    .line 105
    .line 106
    const-string p1, "flash pic subtype cleared: source="

    .line 107
    .line 108
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    const/16 p1, 0xd

    .line 112
    .line 113
    const-string v0, "aio-constructor"

    .line 114
    .line 115
    const/16 v3, 0x20

    .line 116
    .line 117
    invoke-virtual {v0, p1, v3}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    const/16 v0, 0xa

    .line 122
    .line 123
    invoke-virtual {p1, v0, v3}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    const/16 v0, 0x9

    .line 128
    .line 129
    invoke-virtual {p1, v0, v3}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    const/16 v3, 0xdc

    .line 138
    .line 139
    if-le v0, v3, :cond_6

    .line 140
    .line 141
    invoke-virtual {p1, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    const-string v0, "..."

    .line 146
    .line 147
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    :cond_6
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    const-string p1, ", old="

    .line 155
    .line 156
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {p0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    const-string p1, ", new="

    .line 163
    .line 164
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {p0, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    :goto_1
    const/4 p0, 0x1

    .line 178
    return p0

    .line 179
    :cond_7
    return v4
.end method

.method public static declared-synchronized b()V
    .locals 6

    .line 1
    const-class v0, La5;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, La5;->c:Ljava/util/List;

    .line 5
    .line 6
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 7
    :try_start_1
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    check-cast v3, Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 22
    .line 23
    :try_start_2
    invoke-virtual {v3}, Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;->unhook()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception v3

    .line 28
    :try_start_3
    const-string v4, "flash-pic"

    .line 29
    .line 30
    const-string v5, "unhook-constructor"

    .line 31
    .line 32
    invoke-static {v4, v5, v3}, Le7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :catchall_1
    move-exception v2

    .line 37
    goto :goto_1

    .line 38
    :cond_0
    sget-object v2, La5;->c:Ljava/util/List;

    .line 39
    .line 40
    invoke-interface {v2}, Ljava/util/List;->clear()V

    .line 41
    .line 42
    .line 43
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 44
    :try_start_4
    sget-object v1, La5;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 47
    .line 48
    .line 49
    sget-object v1, La5;->b:Ljava/util/Set;

    .line 50
    .line 51
    invoke-interface {v1}, Ljava/util/Set;->clear()V

    .line 52
    .line 53
    .line 54
    const/4 v1, 0x0

    .line 55
    sput-boolean v1, La5;->d:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 56
    .line 57
    monitor-exit v0

    .line 58
    return-void

    .line 59
    :catchall_2
    move-exception v1

    .line 60
    goto :goto_2

    .line 61
    :goto_1
    :try_start_5
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 62
    :try_start_6
    throw v2

    .line 63
    :goto_2
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 64
    throw v1
.end method

.method public static c(Ljava/lang/Object;Ljava/lang/reflect/Field;)J
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1, p0}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    int-to-long p0, p0

    .line 14
    return-wide p0

    .line 15
    :cond_0
    sget-object v1, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 16
    .line 17
    if-ne v0, v1, :cond_1

    .line 18
    .line 19
    invoke-virtual {p1, p0}, Ljava/lang/reflect/Field;->getLong(Ljava/lang/Object;)J

    .line 20
    .line 21
    .line 22
    move-result-wide p0

    .line 23
    return-wide p0

    .line 24
    :cond_1
    sget-object v1, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 25
    .line 26
    if-ne v0, v1, :cond_2

    .line 27
    .line 28
    invoke-virtual {p1, p0}, Ljava/lang/reflect/Field;->getShort(Ljava/lang/Object;)S

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    int-to-long p0, p0

    .line 33
    return-wide p0

    .line 34
    :cond_2
    invoke-virtual {p1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    instance-of p1, p0, Ljava/lang/Number;

    .line 39
    .line 40
    if-eqz p1, :cond_3

    .line 41
    .line 42
    check-cast p0, Ljava/lang/Number;

    .line 43
    .line 44
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 45
    .line 46
    .line 47
    move-result-wide p0

    .line 48
    return-wide p0

    .line 49
    :cond_3
    const-wide/high16 p0, -0x8000000000000000L

    .line 50
    .line 51
    return-wide p0
.end method

.method public static d(Ljava/lang/Class;)Ljava/lang/reflect/Field;
    .locals 12

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    sget-object v1, La5;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 6
    .line 7
    invoke-virtual {v1, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    check-cast v2, Ljava/lang/reflect/Field;

    .line 12
    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    return-object v2

    .line 16
    :cond_1
    sget-object v2, La5;->b:Ljava/util/Set;

    .line 17
    .line 18
    invoke-interface {v2, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_2

    .line 23
    .line 24
    return-object v0

    .line 25
    :cond_2
    move-object v3, p0

    .line 26
    :goto_0
    if-eqz v3, :cond_9

    .line 27
    .line 28
    const-class v4, Ljava/lang/Object;

    .line 29
    .line 30
    if-eq v3, v4, :cond_9

    .line 31
    .line 32
    :try_start_0
    invoke-virtual {v3}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 33
    .line 34
    .line 35
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    goto :goto_1

    .line 37
    :catchall_0
    move-object v4, v0

    .line 38
    :goto_1
    if-eqz v4, :cond_8

    .line 39
    .line 40
    array-length v5, v4

    .line 41
    const/4 v6, 0x0

    .line 42
    move v7, v6

    .line 43
    :goto_2
    if-ge v7, v5, :cond_8

    .line 44
    .line 45
    aget-object v8, v4, v7

    .line 46
    .line 47
    :try_start_1
    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 48
    .line 49
    .line 50
    move-result v9

    .line 51
    invoke-static {v9}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 52
    .line 53
    .line 54
    move-result v9

    .line 55
    if-nez v9, :cond_7

    .line 56
    .line 57
    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v9

    .line 61
    const-string v10, ""

    .line 62
    .line 63
    if-nez v9, :cond_3

    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_3
    const-string v11, "_"

    .line 67
    .line 68
    invoke-virtual {v9, v11, v10}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v9

    .line 72
    const-string v11, "-"

    .line 73
    .line 74
    invoke-virtual {v9, v11, v10}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v9

    .line 78
    sget-object v10, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 79
    .line 80
    invoke-virtual {v9, v10}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v10

    .line 84
    :goto_3
    const-string v9, "submsgtype"

    .line 85
    .line 86
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v9

    .line 90
    if-eqz v9, :cond_7

    .line 91
    .line 92
    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    move-result-object v9

    .line 96
    sget-object v10, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 97
    .line 98
    const/4 v11, 0x1

    .line 99
    if-eq v9, v10, :cond_5

    .line 100
    .line 101
    const-class v10, Ljava/lang/Integer;

    .line 102
    .line 103
    if-eq v9, v10, :cond_5

    .line 104
    .line 105
    sget-object v10, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 106
    .line 107
    if-eq v9, v10, :cond_5

    .line 108
    .line 109
    const-class v10, Ljava/lang/Long;

    .line 110
    .line 111
    if-eq v9, v10, :cond_5

    .line 112
    .line 113
    sget-object v10, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 114
    .line 115
    if-eq v9, v10, :cond_5

    .line 116
    .line 117
    const-class v10, Ljava/lang/Short;

    .line 118
    .line 119
    if-ne v9, v10, :cond_4

    .line 120
    .line 121
    goto :goto_4

    .line 122
    :cond_4
    move v9, v6

    .line 123
    goto :goto_5

    .line 124
    :cond_5
    :goto_4
    move v9, v11

    .line 125
    :goto_5
    if-nez v9, :cond_6

    .line 126
    .line 127
    goto :goto_6

    .line 128
    :cond_6
    invoke-virtual {v8, v11}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v1, p0, v8}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 132
    .line 133
    .line 134
    return-object v8

    .line 135
    :catchall_1
    :cond_7
    :goto_6
    add-int/lit8 v7, v7, 0x1

    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_8
    invoke-virtual {v3}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    goto :goto_0

    .line 143
    :cond_9
    invoke-interface {v2, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    return-object v0
.end method

.method public static e(Ljava/lang/Object;ILjava/util/Set;)Z
    .locals 12

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_16

    .line 3
    .line 4
    const/4 v1, 0x4

    .line 5
    if-gt p1, v1, :cond_16

    .line 6
    .line 7
    invoke-interface {p2, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_16

    .line 12
    .line 13
    instance-of v1, p0, Ljava/lang/CharSequence;

    .line 14
    .line 15
    if-nez v1, :cond_16

    .line 16
    .line 17
    instance-of v1, p0, Ljava/lang/Number;

    .line 18
    .line 19
    if-nez v1, :cond_16

    .line 20
    .line 21
    instance-of v1, p0, Ljava/lang/Boolean;

    .line 22
    .line 23
    if-nez v1, :cond_16

    .line 24
    .line 25
    instance-of v1, p0, Landroid/content/Context;

    .line 26
    .line 27
    if-nez v1, :cond_16

    .line 28
    .line 29
    instance-of v1, p0, Landroid/view/View;

    .line 30
    .line 31
    if-nez v1, :cond_16

    .line 32
    .line 33
    instance-of v1, p0, Ljava/lang/Class;

    .line 34
    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    goto/16 :goto_d

    .line 38
    .line 39
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-static {v1}, La5;->d(Ljava/lang/Class;)Ljava/lang/reflect/Field;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    const/4 v2, 0x1

    .line 48
    if-nez v1, :cond_1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    :try_start_0
    invoke-static {p0, v1}, La5;->c(Ljava/lang/Object;Ljava/lang/reflect/Field;)J

    .line 52
    .line 53
    .line 54
    move-result-wide v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    const-wide/16 v5, 0x2000

    .line 56
    .line 57
    and-long/2addr v3, v5

    .line 58
    const-wide/16 v5, 0x0

    .line 59
    .line 60
    cmp-long v1, v3, v5

    .line 61
    .line 62
    if-eqz v1, :cond_2

    .line 63
    .line 64
    return v2

    .line 65
    :catchall_0
    :cond_2
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    :goto_1
    const-string v3, ""

    .line 70
    .line 71
    const-class v4, Ljava/lang/Object;

    .line 72
    .line 73
    const/4 v5, 0x0

    .line 74
    if-eqz v1, :cond_8

    .line 75
    .line 76
    if-eq v1, v4, :cond_8

    .line 77
    .line 78
    :try_start_1
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 79
    .line 80
    .line 81
    move-result-object v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 82
    :catchall_1
    if-eqz v5, :cond_7

    .line 83
    .line 84
    array-length v4, v5

    .line 85
    move v6, v0

    .line 86
    :goto_2
    if-ge v6, v4, :cond_7

    .line 87
    .line 88
    aget-object v7, v5, v6

    .line 89
    .line 90
    :try_start_2
    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 91
    .line 92
    .line 93
    move-result v8

    .line 94
    invoke-static {v8}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 95
    .line 96
    .line 97
    move-result v8

    .line 98
    if-eqz v8, :cond_3

    .line 99
    .line 100
    goto :goto_4

    .line 101
    :cond_3
    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v8

    .line 105
    if-nez v8, :cond_4

    .line 106
    .line 107
    move-object v8, v3

    .line 108
    goto :goto_3

    .line 109
    :cond_4
    sget-object v9, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 110
    .line 111
    invoke-virtual {v8, v9}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v8

    .line 115
    :goto_3
    invoke-static {v8}, La5;->h(Ljava/lang/String;)Z

    .line 116
    .line 117
    .line 118
    move-result v9

    .line 119
    if-nez v9, :cond_5

    .line 120
    .line 121
    goto :goto_4

    .line 122
    :cond_5
    invoke-virtual {v7, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 123
    .line 124
    .line 125
    invoke-static {p0, v8, v7}, La5;->g(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/reflect/Field;)Z

    .line 126
    .line 127
    .line 128
    move-result v7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 129
    if-eqz v7, :cond_6

    .line 130
    .line 131
    goto/16 :goto_b

    .line 132
    .line 133
    :catchall_2
    :cond_6
    :goto_4
    add-int/lit8 v6, v6, 0x1

    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_7
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    goto :goto_1

    .line 141
    :cond_8
    instance-of v1, p0, Ljava/util/Collection;

    .line 142
    .line 143
    const/16 v6, 0x28

    .line 144
    .line 145
    if-eqz v1, :cond_b

    .line 146
    .line 147
    check-cast p0, Ljava/util/Collection;

    .line 148
    .line 149
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    move v1, v0

    .line 154
    :cond_9
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 155
    .line 156
    .line 157
    move-result v3

    .line 158
    if-eqz v3, :cond_16

    .line 159
    .line 160
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v3

    .line 164
    add-int/2addr v1, v2

    .line 165
    if-le v1, v6, :cond_a

    .line 166
    .line 167
    goto/16 :goto_d

    .line 168
    .line 169
    :cond_a
    add-int/lit8 v4, p1, 0x1

    .line 170
    .line 171
    invoke-static {v3, v4, p2}, La5;->e(Ljava/lang/Object;ILjava/util/Set;)Z

    .line 172
    .line 173
    .line 174
    move-result v3

    .line 175
    if-eqz v3, :cond_9

    .line 176
    .line 177
    goto/16 :goto_b

    .line 178
    .line 179
    :cond_b
    instance-of v1, p0, Ljava/util/Map;

    .line 180
    .line 181
    if-eqz v1, :cond_e

    .line 182
    .line 183
    check-cast p0, Ljava/util/Map;

    .line 184
    .line 185
    invoke-interface {p0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 186
    .line 187
    .line 188
    move-result-object p0

    .line 189
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 190
    .line 191
    .line 192
    move-result-object p0

    .line 193
    move v1, v0

    .line 194
    :cond_c
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 195
    .line 196
    .line 197
    move-result v3

    .line 198
    if-eqz v3, :cond_16

    .line 199
    .line 200
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v3

    .line 204
    add-int/2addr v1, v2

    .line 205
    if-le v1, v6, :cond_d

    .line 206
    .line 207
    goto/16 :goto_d

    .line 208
    .line 209
    :cond_d
    add-int/lit8 v4, p1, 0x1

    .line 210
    .line 211
    invoke-static {v3, v4, p2}, La5;->e(Ljava/lang/Object;ILjava/util/Set;)Z

    .line 212
    .line 213
    .line 214
    move-result v3

    .line 215
    if-eqz v3, :cond_c

    .line 216
    .line 217
    goto/16 :goto_b

    .line 218
    .line 219
    :cond_e
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    invoke-virtual {v1}, Ljava/lang/Class;->isArray()Z

    .line 224
    .line 225
    .line 226
    move-result v7

    .line 227
    if-eqz v7, :cond_10

    .line 228
    .line 229
    invoke-virtual {v1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    move-result-object v7

    .line 233
    invoke-virtual {v7}, Ljava/lang/Class;->isPrimitive()Z

    .line 234
    .line 235
    .line 236
    move-result v7

    .line 237
    if-nez v7, :cond_10

    .line 238
    .line 239
    :try_start_3
    invoke-static {p0}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 240
    .line 241
    .line 242
    move-result v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 243
    goto :goto_5

    .line 244
    :catchall_3
    move v1, v0

    .line 245
    :goto_5
    move v3, v0

    .line 246
    :goto_6
    if-ge v3, v1, :cond_16

    .line 247
    .line 248
    if-ge v3, v6, :cond_16

    .line 249
    .line 250
    :try_start_4
    invoke-static {p0, v3}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v4

    .line 254
    add-int/lit8 v5, p1, 0x1

    .line 255
    .line 256
    invoke-static {v4, v5, p2}, La5;->e(Ljava/lang/Object;ILjava/util/Set;)Z

    .line 257
    .line 258
    .line 259
    move-result v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 260
    if-eqz v4, :cond_f

    .line 261
    .line 262
    goto/16 :goto_b

    .line 263
    .line 264
    :catchall_4
    :cond_f
    add-int/lit8 v3, v3, 0x1

    .line 265
    .line 266
    goto :goto_6

    .line 267
    :cond_10
    :goto_7
    if-eqz v1, :cond_16

    .line 268
    .line 269
    if-eq v1, v4, :cond_16

    .line 270
    .line 271
    :try_start_5
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 272
    .line 273
    .line 274
    move-result-object v6
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 275
    goto :goto_8

    .line 276
    :catchall_5
    move-object v6, v5

    .line 277
    :goto_8
    if-eqz v6, :cond_15

    .line 278
    .line 279
    array-length v7, v6

    .line 280
    move v8, v0

    .line 281
    :goto_9
    if-ge v8, v7, :cond_15

    .line 282
    .line 283
    aget-object v9, v6, v8

    .line 284
    .line 285
    :try_start_6
    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 286
    .line 287
    .line 288
    move-result v10

    .line 289
    invoke-static {v10}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 290
    .line 291
    .line 292
    move-result v10

    .line 293
    if-nez v10, :cond_14

    .line 294
    .line 295
    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 296
    .line 297
    .line 298
    move-result-object v10

    .line 299
    invoke-virtual {v10}, Ljava/lang/Class;->isPrimitive()Z

    .line 300
    .line 301
    .line 302
    move-result v10

    .line 303
    if-eqz v10, :cond_11

    .line 304
    .line 305
    goto :goto_c

    .line 306
    :cond_11
    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v10

    .line 310
    if-nez v10, :cond_12

    .line 311
    .line 312
    move-object v10, v3

    .line 313
    goto :goto_a

    .line 314
    :cond_12
    sget-object v11, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 315
    .line 316
    invoke-virtual {v10, v11}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v10

    .line 320
    :goto_a
    const-string v11, "pic"

    .line 321
    .line 322
    invoke-virtual {v10, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 323
    .line 324
    .line 325
    move-result v11

    .line 326
    if-nez v11, :cond_13

    .line 327
    .line 328
    const-string v11, "image"

    .line 329
    .line 330
    invoke-virtual {v10, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 331
    .line 332
    .line 333
    move-result v11

    .line 334
    if-nez v11, :cond_13

    .line 335
    .line 336
    const-string v11, "element"

    .line 337
    .line 338
    invoke-virtual {v10, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 339
    .line 340
    .line 341
    move-result v11

    .line 342
    if-nez v11, :cond_13

    .line 343
    .line 344
    const-string v11, "record"

    .line 345
    .line 346
    invoke-virtual {v10, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 347
    .line 348
    .line 349
    move-result v11

    .line 350
    if-nez v11, :cond_13

    .line 351
    .line 352
    const-string v11, "msg"

    .line 353
    .line 354
    invoke-virtual {v10, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 355
    .line 356
    .line 357
    move-result v10

    .line 358
    if-nez v10, :cond_13

    .line 359
    .line 360
    goto :goto_c

    .line 361
    :cond_13
    invoke-virtual {v9, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 362
    .line 363
    .line 364
    invoke-virtual {v9, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object v9

    .line 368
    add-int/lit8 v10, p1, 0x1

    .line 369
    .line 370
    invoke-static {v9, v10, p2}, La5;->e(Ljava/lang/Object;ILjava/util/Set;)Z

    .line 371
    .line 372
    .line 373
    move-result v9
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 374
    if-eqz v9, :cond_14

    .line 375
    .line 376
    :goto_b
    return v2

    .line 377
    :catchall_6
    :cond_14
    :goto_c
    add-int/lit8 v8, v8, 0x1

    .line 378
    .line 379
    goto :goto_9

    .line 380
    :cond_15
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 381
    .line 382
    .line 383
    move-result-object v1

    .line 384
    goto :goto_7

    .line 385
    :cond_16
    :goto_d
    return v0
.end method

.method public static declared-synchronized f(Ljava/lang/ClassLoader;)V
    .locals 5

    .line 1
    const-string v0, "flash pic constructor hook installed count="

    .line 2
    .line 3
    const-class v1, La5;

    .line 4
    .line 5
    monitor-enter v1

    .line 6
    :try_start_0
    sget-boolean v2, La5;->d:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 7
    .line 8
    if-nez v2, :cond_4

    .line 9
    .line 10
    if-nez p0, :cond_0

    .line 11
    .line 12
    goto :goto_2

    .line 13
    :cond_0
    const/4 v2, 0x0

    .line 14
    :try_start_1
    const-string v3, "com.tencent.mobileqq.aio.msg.AIOMsgItem"

    .line 15
    .line 16
    invoke-static {v3, p0}, Lcom/mr/elaris/xposedcompat/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    new-instance v3, Lz4;

    .line 21
    .line 22
    const/16 v4, 0x27

    .line 23
    .line 24
    invoke-direct {v3, v4}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;-><init>(I)V

    .line 25
    .line 26
    .line 27
    invoke-static {p0, v3}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookAllConstructors(Ljava/lang/Class;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Ljava/util/Set;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    if-eqz p0, :cond_2

    .line 32
    .line 33
    invoke-interface {p0}, Ljava/util/Set;->isEmpty()Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    sget-object v3, La5;->c:Ljava/util/List;

    .line 41
    .line 42
    invoke-interface {v3, p0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 43
    .line 44
    .line 45
    invoke-interface {p0}, Ljava/util/Set;->size()I

    .line 46
    .line 47
    .line 48
    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 49
    :catchall_0
    :cond_2
    :goto_0
    if-lez v2, :cond_3

    .line 50
    .line 51
    const/4 p0, 0x1

    .line 52
    :try_start_2
    sput-boolean p0, La5;->d:Z

    .line 53
    .line 54
    new-instance p0, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :catchall_1
    move-exception p0

    .line 71
    goto :goto_3

    .line 72
    :cond_3
    const-string p0, "flash pic hooks target not found"

    .line 73
    .line 74
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 75
    .line 76
    .line 77
    :goto_1
    monitor-exit v1

    .line 78
    return-void

    .line 79
    :cond_4
    :goto_2
    monitor-exit v1

    .line 80
    return-void

    .line 81
    :goto_3
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 82
    throw p0
.end method

.method public static g(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/reflect/Field;)Z
    .locals 2

    .line 1
    invoke-virtual {p2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p2, p0}, Ljava/lang/reflect/Field;->getBoolean(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0

    .line 14
    :cond_0
    invoke-virtual {p2, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    instance-of p2, p0, Ljava/lang/Boolean;

    .line 19
    .line 20
    if-eqz p2, :cond_1

    .line 21
    .line 22
    check-cast p0, Ljava/lang/Boolean;

    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    return p0

    .line 29
    :cond_1
    instance-of p2, p0, Ljava/lang/Number;

    .line 30
    .line 31
    if-eqz p2, :cond_2

    .line 32
    .line 33
    check-cast p0, Ljava/lang/Number;

    .line 34
    .line 35
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 36
    .line 37
    .line 38
    move-result-wide p0

    .line 39
    const-wide/16 v0, 0x0

    .line 40
    .line 41
    cmp-long p0, p0, v0

    .line 42
    .line 43
    if-eqz p0, :cond_8

    .line 44
    .line 45
    goto/16 :goto_0

    .line 46
    .line 47
    :cond_2
    instance-of p2, p0, Ljava/lang/String;

    .line 48
    .line 49
    if-eqz p2, :cond_8

    .line 50
    .line 51
    check-cast p0, Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 58
    .line 59
    .line 60
    move-result p2

    .line 61
    if-eqz p2, :cond_8

    .line 62
    .line 63
    if-nez p1, :cond_3

    .line 64
    .line 65
    const-string p1, ""

    .line 66
    .line 67
    :cond_3
    const-string p2, "md5"

    .line 68
    .line 69
    invoke-virtual {p1, p2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 70
    .line 71
    .line 72
    move-result p2

    .line 73
    if-nez p2, :cond_8

    .line 74
    .line 75
    const-string p2, "sha"

    .line 76
    .line 77
    invoke-virtual {p1, p2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 78
    .line 79
    .line 80
    move-result p2

    .line 81
    if-nez p2, :cond_8

    .line 82
    .line 83
    const-string p2, "hash"

    .line 84
    .line 85
    invoke-virtual {p1, p2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 86
    .line 87
    .line 88
    move-result p2

    .line 89
    if-nez p2, :cond_8

    .line 90
    .line 91
    const-string p2, "uuid"

    .line 92
    .line 93
    invoke-virtual {p1, p2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 94
    .line 95
    .line 96
    move-result p2

    .line 97
    if-nez p2, :cond_8

    .line 98
    .line 99
    const-string p2, "guid"

    .line 100
    .line 101
    invoke-virtual {p1, p2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 102
    .line 103
    .line 104
    move-result p2

    .line 105
    if-nez p2, :cond_8

    .line 106
    .line 107
    const-string p2, "id"

    .line 108
    .line 109
    invoke-virtual {p1, p2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    if-eqz p1, :cond_4

    .line 114
    .line 115
    goto/16 :goto_1

    .line 116
    .line 117
    :cond_4
    const/16 p1, 0x2f

    .line 118
    .line 119
    invoke-virtual {p0, p1}, Ljava/lang/String;->indexOf(I)I

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    if-gez p1, :cond_8

    .line 124
    .line 125
    const/16 p1, 0x5c

    .line 126
    .line 127
    invoke-virtual {p0, p1}, Ljava/lang/String;->indexOf(I)I

    .line 128
    .line 129
    .line 130
    move-result p1

    .line 131
    if-gez p1, :cond_8

    .line 132
    .line 133
    const-string p1, "content://"

    .line 134
    .line 135
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 136
    .line 137
    .line 138
    move-result p1

    .line 139
    if-eqz p1, :cond_5

    .line 140
    .line 141
    goto/16 :goto_1

    .line 142
    .line 143
    :cond_5
    invoke-static {p0}, Lv4;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    sget-object p2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 148
    .line 149
    invoke-virtual {p1, p2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    const-string v0, ".jpg"

    .line 154
    .line 155
    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    if-nez v0, :cond_8

    .line 160
    .line 161
    const-string v0, ".jpeg"

    .line 162
    .line 163
    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 164
    .line 165
    .line 166
    move-result v0

    .line 167
    if-nez v0, :cond_8

    .line 168
    .line 169
    const-string v0, ".png"

    .line 170
    .line 171
    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 172
    .line 173
    .line 174
    move-result v0

    .line 175
    if-nez v0, :cond_8

    .line 176
    .line 177
    const-string v0, ".webp"

    .line 178
    .line 179
    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 180
    .line 181
    .line 182
    move-result v0

    .line 183
    if-nez v0, :cond_8

    .line 184
    .line 185
    const-string v0, ".gif"

    .line 186
    .line 187
    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 188
    .line 189
    .line 190
    move-result v0

    .line 191
    if-nez v0, :cond_8

    .line 192
    .line 193
    const-string v0, ".heic"

    .line 194
    .line 195
    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 196
    .line 197
    .line 198
    move-result v0

    .line 199
    if-nez v0, :cond_8

    .line 200
    .line 201
    const-string v0, ".heif"

    .line 202
    .line 203
    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 204
    .line 205
    .line 206
    move-result p1

    .line 207
    if-eqz p1, :cond_6

    .line 208
    .line 209
    goto :goto_1

    .line 210
    :cond_6
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 211
    .line 212
    .line 213
    move-result p1

    .line 214
    const/16 v0, 0x28

    .line 215
    .line 216
    if-le p1, v0, :cond_7

    .line 217
    .line 218
    goto :goto_1

    .line 219
    :cond_7
    invoke-virtual {p0, p2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object p0

    .line 223
    const-string p1, "0"

    .line 224
    .line 225
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    move-result p1

    .line 229
    if-nez p1, :cond_8

    .line 230
    .line 231
    const-string p1, "false"

    .line 232
    .line 233
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move-result p1

    .line 237
    if-nez p1, :cond_8

    .line 238
    .line 239
    const-string p1, "normal"

    .line 240
    .line 241
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 242
    .line 243
    .line 244
    move-result p1

    .line 245
    if-nez p1, :cond_8

    .line 246
    .line 247
    const-string p1, "none"

    .line 248
    .line 249
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    move-result p1

    .line 253
    if-nez p1, :cond_8

    .line 254
    .line 255
    const-string p1, "no"

    .line 256
    .line 257
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    move-result p0

    .line 261
    if-nez p0, :cond_8

    .line 262
    .line 263
    :goto_0
    const/4 p0, 0x1

    .line 264
    return p0

    .line 265
    :cond_8
    :goto_1
    const/4 p0, 0x0

    .line 266
    return p0
.end method

.method public static h(Ljava/lang/String;)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_4

    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    goto/16 :goto_1

    .line 11
    .line 12
    :cond_0
    const-string v1, "path"

    .line 13
    .line 14
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-nez v1, :cond_4

    .line 19
    .line 20
    const-string v1, "name"

    .line 21
    .line 22
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-nez v1, :cond_4

    .line 27
    .line 28
    const-string v1, "url"

    .line 29
    .line 30
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez v1, :cond_4

    .line 35
    .line 36
    const-string v1, "md5"

    .line 37
    .line 38
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-nez v1, :cond_4

    .line 43
    .line 44
    const-string v1, "sha"

    .line 45
    .line 46
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-nez v1, :cond_4

    .line 51
    .line 52
    const-string v1, "hash"

    .line 53
    .line 54
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-eqz v1, :cond_1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_1
    const-string v1, "flash"

    .line 62
    .line 63
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-nez v1, :cond_3

    .line 68
    .line 69
    const-string v1, "burn"

    .line 70
    .line 71
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-nez v1, :cond_3

    .line 76
    .line 77
    const-string v1, "ephemeral"

    .line 78
    .line 79
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-nez v1, :cond_3

    .line 84
    .line 85
    const-string v1, "selfdestruct"

    .line 86
    .line 87
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-nez v1, :cond_3

    .line 92
    .line 93
    const-string v1, "self_destruct"

    .line 94
    .line 95
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-nez v1, :cond_3

    .line 100
    .line 101
    const-string v1, "disappear"

    .line 102
    .line 103
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    if-nez v1, :cond_3

    .line 108
    .line 109
    const-string v1, "destroy"

    .line 110
    .line 111
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    if-nez v1, :cond_3

    .line 116
    .line 117
    const-string v1, "secret"

    .line 118
    .line 119
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 120
    .line 121
    .line 122
    move-result p0

    .line 123
    if-eqz p0, :cond_2

    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_2
    return v0

    .line 127
    :cond_3
    :goto_0
    const/4 p0, 0x1

    .line 128
    return p0

    .line 129
    :cond_4
    :goto_1
    return v0
.end method
