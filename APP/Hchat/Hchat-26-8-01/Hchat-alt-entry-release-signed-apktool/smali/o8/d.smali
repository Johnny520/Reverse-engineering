.class public final Lo8/d;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lh/Hchat/dexkit/DexFinder;

.field public final b:Ljava/lang/ClassLoader;

.field public final c:Li8/f;

.field public final d:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final e:Ljava/lang/ThreadLocal;

.field public volatile f:Z


# direct methods
.method public constructor <init>(Lh/Hchat/dexkit/DexFinder;Ljava/lang/ClassLoader;Li8/f;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lo8/d;->d:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 10
    .line 11
    new-instance v0, Lha/p;

    .line 12
    .line 13
    const/4 v1, 0x4

    .line 14
    invoke-direct {v0, v1}, Lha/p;-><init>(I)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Ljava/lang/ThreadLocal;->withInitial(Ljava/util/function/Supplier;)Ljava/lang/ThreadLocal;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, Lo8/d;->e:Ljava/lang/ThreadLocal;

    .line 22
    .line 23
    iput-object p1, p0, Lo8/d;->a:Lh/Hchat/dexkit/DexFinder;

    .line 24
    .line 25
    iput-object p2, p0, Lo8/d;->b:Ljava/lang/ClassLoader;

    .line 26
    .line 27
    iput-object p3, p0, Lo8/d;->c:Li8/f;

    .line 28
    .line 29
    return-void
.end method

.method public static a([Ljava/lang/Object;)Landroid/content/ContentValues;
    .locals 4

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_0
    if-ge v1, v0, :cond_1

    .line 4
    .line 5
    aget-object v2, p0, v1

    .line 6
    .line 7
    instance-of v3, v2, Landroid/content/ContentValues;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    check-cast v2, Landroid/content/ContentValues;

    .line 12
    .line 13
    return-object v2

    .line 14
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public static c(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "<msgsource"

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-gez v1, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    const-string v2, "</msgsource>"

    .line 22
    .line 23
    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-gez v0, :cond_2

    .line 28
    .line 29
    :goto_0
    const-string p0, ""

    .line 30
    .line 31
    return-object p0

    .line 32
    :cond_2
    add-int/lit8 v0, v0, 0xc

    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0
.end method

.method public static h([Ljava/lang/Object;)Ljava/lang/String;
    .locals 5

    .line 1
    array-length v0, p0

    .line 2
    if-nez v0, :cond_0

    .line 3
    .line 4
    goto :goto_3

    .line 5
    :cond_0
    const/4 v0, 0x0

    .line 6
    aget-object v1, p0, v0

    .line 7
    .line 8
    instance-of v2, v1, Ljava/lang/String;

    .line 9
    .line 10
    if-eqz v2, :cond_1

    .line 11
    .line 12
    check-cast v1, Ljava/lang/String;

    .line 13
    .line 14
    return-object v1

    .line 15
    :cond_1
    array-length v1, p0

    .line 16
    :goto_0
    if-ge v0, v1, :cond_5

    .line 17
    .line 18
    aget-object v2, p0, v0

    .line 19
    .line 20
    instance-of v3, v2, Ljava/lang/String;

    .line 21
    .line 22
    if-nez v3, :cond_2

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_2
    check-cast v2, Ljava/lang/String;

    .line 26
    .line 27
    const-string v3, "message"

    .line 28
    .line 29
    invoke-virtual {v3, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-nez v4, :cond_4

    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    invoke-virtual {v4, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-eqz v3, :cond_3

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_3
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_4
    :goto_2
    return-object v2

    .line 50
    :cond_5
    :goto_3
    const-string p0, ""

    .line 51
    .line 52
    return-object p0
.end method


# virtual methods
.method public final b(Ll8/a;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lo8/d;->d:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lo8/c;

    .line 18
    .line 19
    :try_start_0
    invoke-interface {v1, p1}, Lo8/c;->a(Ll8/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception v1

    .line 24
    new-instance v2, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    const-string v3, "\u6570\u636e\u5e93\u53d8\u66f4\u76d1\u542c\u56de\u8c03\u5931\u8d25: "

    .line 27
    .line 28
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    iget-object v2, p0, Lo8/d;->c:Li8/f;

    .line 43
    .line 44
    if-eqz v2, :cond_0

    .line 45
    .line 46
    const-string v2, "[WeChatDatabaseListenerApi] "

    .line 47
    .line 48
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-static {v1}, Li8/i;->f(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    return-void
.end method

.method public final d(Ljava/lang/Class;)I
    .locals 12

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    invoke-static {p1}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    move v1, v0

    .line 14
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_c

    .line 19
    .line 20
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Ljava/lang/reflect/Method;

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    if-nez v2, :cond_1

    .line 28
    .line 29
    goto/16 :goto_6

    .line 30
    .line 31
    :cond_1
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    sget-object v7, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 44
    .line 45
    const-class v8, Landroid/content/ContentValues;

    .line 46
    .line 47
    if-ne v5, v7, :cond_5

    .line 48
    .line 49
    if-nez v4, :cond_2

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_2
    array-length v7, v4

    .line 53
    move v9, v0

    .line 54
    :goto_1
    if-ge v9, v7, :cond_5

    .line 55
    .line 56
    aget-object v10, v4, v9

    .line 57
    .line 58
    invoke-virtual {v8, v10}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 59
    .line 60
    .line 61
    move-result v10

    .line 62
    if-eqz v10, :cond_4

    .line 63
    .line 64
    const-string v7, "insert"

    .line 65
    .line 66
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v9

    .line 70
    if-nez v9, :cond_3

    .line 71
    .line 72
    const-string v9, "insertWithOnConflict"

    .line 73
    .line 74
    invoke-virtual {v9, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v9

    .line 78
    if-nez v9, :cond_3

    .line 79
    .line 80
    const-string v9, "replace"

    .line 81
    .line 82
    invoke-virtual {v9, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v9

    .line 86
    if-nez v9, :cond_3

    .line 87
    .line 88
    const-string v9, "replaceOrThrow"

    .line 89
    .line 90
    invoke-virtual {v9, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v9

    .line 94
    if-eqz v9, :cond_5

    .line 95
    .line 96
    :cond_3
    move-object v3, v7

    .line 97
    goto :goto_6

    .line 98
    :cond_4
    add-int/lit8 v9, v9, 0x1

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_5
    :goto_2
    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 102
    .line 103
    if-ne v5, v7, :cond_9

    .line 104
    .line 105
    if-nez v4, :cond_6

    .line 106
    .line 107
    goto :goto_5

    .line 108
    :cond_6
    array-length v9, v4

    .line 109
    move v10, v0

    .line 110
    :goto_3
    if-ge v10, v9, :cond_9

    .line 111
    .line 112
    aget-object v11, v4, v10

    .line 113
    .line 114
    invoke-virtual {v8, v11}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 115
    .line 116
    .line 117
    move-result v11

    .line 118
    if-eqz v11, :cond_8

    .line 119
    .line 120
    const-string v8, "update"

    .line 121
    .line 122
    invoke-virtual {v8, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v9

    .line 126
    if-nez v9, :cond_7

    .line 127
    .line 128
    const-string v9, "updateWithOnConflict"

    .line 129
    .line 130
    invoke-virtual {v9, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v6

    .line 134
    if-eqz v6, :cond_9

    .line 135
    .line 136
    :cond_7
    :goto_4
    move-object v3, v8

    .line 137
    goto :goto_6

    .line 138
    :cond_8
    add-int/lit8 v10, v10, 0x1

    .line 139
    .line 140
    goto :goto_3

    .line 141
    :cond_9
    :goto_5
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v6

    .line 145
    const-string v8, "delete"

    .line 146
    .line 147
    invoke-virtual {v8, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v6

    .line 151
    if-eqz v6, :cond_a

    .line 152
    .line 153
    if-ne v5, v7, :cond_a

    .line 154
    .line 155
    array-length v5, v4

    .line 156
    const/4 v6, 0x3

    .line 157
    if-ne v5, v6, :cond_a

    .line 158
    .line 159
    aget-object v5, v4, v0

    .line 160
    .line 161
    const-class v6, Ljava/lang/String;

    .line 162
    .line 163
    if-ne v5, v6, :cond_a

    .line 164
    .line 165
    const/4 v5, 0x1

    .line 166
    aget-object v5, v4, v5

    .line 167
    .line 168
    if-ne v5, v6, :cond_a

    .line 169
    .line 170
    const/4 v5, 0x2

    .line 171
    aget-object v4, v4, v5

    .line 172
    .line 173
    const-class v5, [Ljava/lang/String;

    .line 174
    .line 175
    if-ne v4, v5, :cond_a

    .line 176
    .line 177
    goto :goto_4

    .line 178
    :cond_a
    :goto_6
    if-nez v3, :cond_b

    .line 179
    .line 180
    goto/16 :goto_0

    .line 181
    .line 182
    :cond_b
    sget-object v4, Lr8/i;->b:Lr8/i;

    .line 183
    .line 184
    new-instance v5, Laa/d;

    .line 185
    .line 186
    invoke-direct {v5, p0, v3, v2}, Laa/d;-><init>(Lo8/d;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v4, v2, v5}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 190
    .line 191
    .line 192
    add-int/lit8 v1, v1, 0x1

    .line 193
    .line 194
    goto/16 :goto_0

    .line 195
    .line 196
    :cond_c
    return v1
.end method

.method public final declared-synchronized e()V
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lo8/d;->f:Z

    .line 3
    .line 4
    if-nez v0, :cond_8

    .line 5
    .line 6
    invoke-virtual {p0}, Lo8/d;->f()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    goto/16 :goto_7

    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lo8/d;->a:Lh/Hchat/dexkit/DexFinder;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    iget-object v0, v0, Lh/Hchat/dexkit/DexFinder;->sqliteDbWrapperClass:Ljava/lang/Class;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    goto/16 :goto_8

    .line 23
    .line 24
    :cond_1
    const/4 v0, 0x0

    .line 25
    :goto_0
    const/4 v1, 0x0

    .line 26
    move v2, v1

    .line 27
    :goto_1
    if-eqz v0, :cond_2

    .line 28
    .line 29
    const-class v3, Ljava/lang/Object;

    .line 30
    .line 31
    if-eq v0, v3, :cond_2

    .line 32
    .line 33
    invoke-virtual {p0, v0}, Lo8/d;->d(Ljava/lang/Class;)I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    add-int/2addr v2, v3

    .line 38
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    goto :goto_1

    .line 43
    :cond_2
    const-string v0, "com.tencent.wcdb.database.SQLiteDatabase"

    .line 44
    .line 45
    iget-object v3, p0, Lo8/d;->b:Ljava/lang/ClassLoader;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    .line 47
    if-nez v3, :cond_3

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_3
    :try_start_1
    invoke-static {v0, v3}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {p0, v0}, Lo8/d;->d(Ljava/lang/Class;)I

    .line 55
    .line 56
    .line 57
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 58
    goto :goto_3

    .line 59
    :catchall_1
    :goto_2
    move v0, v1

    .line 60
    :goto_3
    add-int/2addr v2, v0

    .line 61
    :try_start_2
    const-string v0, "android.database.sqlite.SQLiteDatabase"

    .line 62
    .line 63
    iget-object v3, p0, Lo8/d;->b:Ljava/lang/ClassLoader;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 64
    .line 65
    if-nez v3, :cond_4

    .line 66
    .line 67
    goto :goto_4

    .line 68
    :cond_4
    :try_start_3
    invoke-static {v0, v3}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {p0, v0}, Lo8/d;->d(Ljava/lang/Class;)I

    .line 73
    .line 74
    .line 75
    move-result v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 76
    goto :goto_5

    .line 77
    :catchall_2
    :goto_4
    move v0, v1

    .line 78
    :goto_5
    add-int/2addr v2, v0

    .line 79
    if-lez v2, :cond_5

    .line 80
    .line 81
    const/4 v1, 0x1

    .line 82
    :cond_5
    :try_start_4
    iput-boolean v1, p0, Lo8/d;->f:Z

    .line 83
    .line 84
    new-instance v0, Ljava/lang/StringBuilder;

    .line 85
    .line 86
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 87
    .line 88
    .line 89
    const-string v1, "\u6570\u636e\u5e93\u53d8\u66f4\u76d1\u542cHook: wrapper="

    .line 90
    .line 91
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    iget-object v1, p0, Lo8/d;->a:Lh/Hchat/dexkit/DexFinder;

    .line 95
    .line 96
    if-eqz v1, :cond_6

    .line 97
    .line 98
    iget-object v1, v1, Lh/Hchat/dexkit/DexFinder;->sqliteDbWrapperClass:Ljava/lang/Class;

    .line 99
    .line 100
    if-eqz v1, :cond_6

    .line 101
    .line 102
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    goto :goto_6

    .line 107
    :cond_6
    const-string v1, "null"

    .line 108
    .line 109
    :goto_6
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    const-string v1, " methods="

    .line 113
    .line 114
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    iget-object v1, p0, Lo8/d;->c:Li8/f;

    .line 125
    .line 126
    if-eqz v1, :cond_7

    .line 127
    .line 128
    const-string v1, "[WeChatDatabaseListenerApi] "

    .line 129
    .line 130
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-static {v0}, Li8/i;->f(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 135
    .line 136
    .line 137
    :cond_7
    monitor-exit p0

    .line 138
    return-void

    .line 139
    :cond_8
    :goto_7
    monitor-exit p0

    .line 140
    return-void

    .line 141
    :goto_8
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 142
    throw v0
.end method

.method public final f()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lo8/d;->a:Lh/Hchat/dexkit/DexFinder;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Lh/Hchat/dexkit/DexFinder;->sqliteDbWrapperClass:Ljava/lang/Class;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, Lo8/d;->b:Ljava/lang/ClassLoader;

    .line 10
    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    :cond_1
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_2
    const/4 v0, 0x0

    .line 16
    return v0
.end method

.method public final g(Lo8/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lo8/d;->d:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->addIfAbsent(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method
