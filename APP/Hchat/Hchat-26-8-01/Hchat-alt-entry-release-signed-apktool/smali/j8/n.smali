.class public final Lj8/n;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final d:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static volatile e:Ljava/lang/Object;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lh/Hchat/dexkit/DexFinder;

.field public final c:Li8/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lj8/n;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lh/Hchat/dexkit/DexFinder;Li8/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lj8/n;->a:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lj8/n;->b:Lh/Hchat/dexkit/DexFinder;

    .line 7
    .line 8
    iput-object p3, p0, Lj8/n;->c:Li8/f;

    .line 9
    .line 10
    iget-object p1, p2, Lh/Hchat/dexkit/DexFinder;->marsCdnManagerClass:Ljava/lang/Class;

    .line 11
    .line 12
    invoke-static {p1, p3}, Lj8/n;->j(Ljava/lang/Class;Lj8/m;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public static b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v0, p1, v1}, Lh/Hchat/utils/KavaReflector;->findCompatibleMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    invoke-static {p1, p0, p2}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public static g(Ljava/lang/Class;)Ljava/lang/reflect/Field;
    .locals 3

    .line 1
    invoke-static {p0}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Ljava/lang/reflect/Field;

    .line 20
    .line 21
    invoke-static {v0}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Field;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 32
    .line 33
    if-eq v1, v2, :cond_1

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    const-class v2, Ljava/lang/Integer;

    .line 40
    .line 41
    if-ne v1, v2, :cond_0

    .line 42
    .line 43
    :cond_1
    invoke-static {v0}, Lh/Hchat/utils/KavaReflector;->accessible(Ljava/lang/reflect/Field;)Ljava/lang/reflect/Field;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    :cond_2
    const/4 p0, 0x0

    .line 49
    return-object p0
.end method

.method public static h(Ljava/lang/String;)Ljava/lang/String;
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
    new-instance p0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v0, "fk_dl_0_"

    .line 10
    .line 11
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    invoke-virtual {p0, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    const-string v1, "fk_dl_"

    .line 29
    .line 30
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    invoke-static {p0}, Ljava/lang/Math;->abs(I)I

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string p0, "_"

    .line 45
    .line 46
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 50
    .line 51
    .line 52
    move-result-wide v1

    .line 53
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0
.end method

.method public static j(Ljava/lang/Class;Lj8/m;)V
    .locals 4

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    sget-object v0, Lj8/n;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-virtual {v0, v2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_1
    :try_start_0
    new-instance v0, Lba/f;

    .line 16
    .line 17
    const/16 v1, 0xe

    .line 18
    .line 19
    invoke-direct {v0, v1}, Lba/f;-><init>(I)V

    .line 20
    .line 21
    .line 22
    invoke-static {p0, v0}, Lde/robv/android/xposed/XposedBridge;->hookAllConstructors(Ljava/lang/Class;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 41
    .line 42
    sget-object v3, Lr8/i;->b:Lr8/i;

    .line 43
    .line 44
    invoke-virtual {v3, v1}, Lr8/i;->a(Lde/robv/android/xposed/XC_MethodHook$Unhook;)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :catchall_0
    move-exception p0

    .line 49
    goto :goto_2

    .line 50
    :cond_2
    invoke-static {p0}, Lh/Hchat/utils/KavaReflector;->staticInstance(Ljava/lang/Class;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    if-eqz p0, :cond_3

    .line 55
    .line 56
    sput-object p0, Lj8/n;->e:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    .line 58
    :cond_3
    :goto_1
    return-void

    .line 59
    :goto_2
    sget-object v0, Lj8/n;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 60
    .line 61
    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 62
    .line 63
    .line 64
    new-instance v0, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    const-string v1, "Mars CDN\u5b9e\u4f8b\u6355\u83b7Hook\u5b89\u88c5\u5931\u8d25: "

    .line 67
    .line 68
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    const-string v0, "[WeChatImageApi] "

    .line 83
    .line 84
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-interface {p1, p0}, Lj8/m;->a(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    return-void
.end method

.method public static o(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/io/InputStream;
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_9

    .line 3
    .line 4
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    goto/16 :goto_4

    .line 11
    .line 12
    :cond_0
    const-string v1, "com.tencent.mm.vfs.w6"

    .line 13
    .line 14
    const-string v2, "com.tencent.mm.vfs.p6"

    .line 15
    .line 16
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const/4 v2, 0x0

    .line 21
    move v3, v2

    .line 22
    :goto_0
    const/4 v4, 0x2

    .line 23
    if-ge v3, v4, :cond_9

    .line 24
    .line 25
    aget-object v5, v1, v3

    .line 26
    .line 27
    invoke-static {v5, p0}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    if-nez v5, :cond_1

    .line 32
    .line 33
    goto/16 :goto_3

    .line 34
    .line 35
    :cond_1
    const-string v6, "E"

    .line 36
    .line 37
    const-string v7, "F"

    .line 38
    .line 39
    filled-new-array {v6, v7}, [Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    move v7, v2

    .line 44
    :goto_1
    const-class v8, Ljava/lang/String;

    .line 45
    .line 46
    if-ge v7, v4, :cond_3

    .line 47
    .line 48
    aget-object v9, v6, v7

    .line 49
    .line 50
    filled-new-array {v8}, [Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    move-result-object v8

    .line 54
    invoke-static {v5, v9, v8}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 55
    .line 56
    .line 57
    move-result-object v8

    .line 58
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v9

    .line 62
    invoke-static {v8, v0, v9}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v8

    .line 66
    instance-of v9, v8, Ljava/io/InputStream;

    .line 67
    .line 68
    if-eqz v9, :cond_2

    .line 69
    .line 70
    check-cast v8, Ljava/io/InputStream;

    .line 71
    .line 72
    return-object v8

    .line 73
    :cond_2
    add-int/lit8 v7, v7, 0x1

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_3
    invoke-static {v5}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    :cond_4
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    if-eqz v5, :cond_8

    .line 89
    .line 90
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    check-cast v5, Ljava/lang/reflect/Method;

    .line 95
    .line 96
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 97
    .line 98
    .line 99
    move-result v6

    .line 100
    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 101
    .line 102
    .line 103
    move-result v6

    .line 104
    if-nez v6, :cond_5

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_5
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    const-class v7, Ljava/io/InputStream;

    .line 112
    .line 113
    if-eq v6, v7, :cond_6

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_6
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    move-result-object v6

    .line 120
    array-length v7, v6

    .line 121
    const/4 v9, 0x1

    .line 122
    if-ne v7, v9, :cond_4

    .line 123
    .line 124
    aget-object v6, v6, v2

    .line 125
    .line 126
    if-eq v6, v8, :cond_7

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_7
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v6

    .line 133
    invoke-static {v5, v0, v6}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v5

    .line 137
    instance-of v6, v5, Ljava/io/InputStream;

    .line 138
    .line 139
    if-eqz v6, :cond_4

    .line 140
    .line 141
    check-cast v5, Ljava/io/InputStream;

    .line 142
    .line 143
    return-object v5

    .line 144
    :cond_8
    :goto_3
    add-int/lit8 v3, v3, 0x1

    .line 145
    .line 146
    goto :goto_0

    .line 147
    :cond_9
    :goto_4
    return-object v0
.end method

.method public static t(Ljava/lang/Object;Ljava/lang/String;)Z
    .locals 8

    .line 1
    const/4 v0, 0x5

    .line 2
    new-array v1, v0, [Ljava/lang/reflect/Field;

    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object v2

    .line 8
    invoke-static {v2}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    const/4 v3, 0x0

    .line 17
    move v4, v3

    .line 18
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v5

    .line 22
    if-eqz v5, :cond_3

    .line 23
    .line 24
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    check-cast v5, Ljava/lang/reflect/Field;

    .line 29
    .line 30
    invoke-static {v5}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Field;)Z

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    if-eqz v6, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v6

    .line 41
    const-class v7, Ljava/lang/String;

    .line 42
    .line 43
    if-eq v6, v7, :cond_1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    if-ge v4, v0, :cond_2

    .line 47
    .line 48
    invoke-static {v5}, Lh/Hchat/utils/KavaReflector;->accessible(Ljava/lang/reflect/Field;)Ljava/lang/reflect/Field;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    aput-object v5, v1, v4

    .line 53
    .line 54
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_3
    if-ge v4, v0, :cond_4

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_4
    aget-object v0, v1, v3

    .line 61
    .line 62
    invoke-static {v0, p0, p1}, Lh/Hchat/utils/KavaReflector;->writeField(Ljava/lang/reflect/Field;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-eqz p1, :cond_5

    .line 67
    .line 68
    const/4 p1, 0x1

    .line 69
    aget-object v0, v1, p1

    .line 70
    .line 71
    const-string v2, ""

    .line 72
    .line 73
    invoke-static {v0, p0, v2}, Lh/Hchat/utils/KavaReflector;->writeField(Ljava/lang/reflect/Field;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-eqz v0, :cond_5

    .line 78
    .line 79
    const/4 v0, 0x2

    .line 80
    aget-object v0, v1, v0

    .line 81
    .line 82
    invoke-static {v0, p0, v2}, Lh/Hchat/utils/KavaReflector;->writeField(Ljava/lang/reflect/Field;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-eqz v0, :cond_5

    .line 87
    .line 88
    const/4 v0, 0x3

    .line 89
    aget-object v0, v1, v0

    .line 90
    .line 91
    invoke-static {v0, p0, v2}, Lh/Hchat/utils/KavaReflector;->writeField(Ljava/lang/reflect/Field;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-eqz v0, :cond_5

    .line 96
    .line 97
    const/4 v0, 0x4

    .line 98
    aget-object v0, v1, v0

    .line 99
    .line 100
    invoke-static {v0, p0, v2}, Lh/Hchat/utils/KavaReflector;->writeField(Ljava/lang/reflect/Field;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result p0

    .line 104
    if-eqz p0, :cond_5

    .line 105
    .line 106
    return p1

    .line 107
    :cond_5
    :goto_1
    return v3
.end method

.method public static u(Ljava/lang/Object;Ljava/lang/String;)Z
    .locals 12

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {v1}, Lj8/n;->g(Ljava/lang/Class;)Ljava/lang/reflect/Field;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-static {v2, p0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    instance-of v3, v2, Ljava/lang/Integer;

    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    if-nez v3, :cond_0

    .line 19
    .line 20
    goto/16 :goto_3

    .line 21
    .line 22
    :cond_0
    const/4 v3, 0x0

    .line 23
    :goto_0
    const/4 v5, 0x1

    .line 24
    if-eqz v1, :cond_5

    .line 25
    .line 26
    const-class v6, Ljava/lang/Object;

    .line 27
    .line 28
    if-eq v1, v6, :cond_5

    .line 29
    .line 30
    invoke-static {v1}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object v7

    .line 34
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v7

    .line 38
    :cond_1
    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v8

    .line 42
    if-eqz v8, :cond_4

    .line 43
    .line 44
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v8

    .line 48
    check-cast v8, Ljava/lang/reflect/Method;

    .line 49
    .line 50
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    move-result-object v9

    .line 54
    array-length v10, v9

    .line 55
    const/4 v11, 0x2

    .line 56
    if-ne v10, v11, :cond_1

    .line 57
    .line 58
    aget-object v10, v9, v4

    .line 59
    .line 60
    sget-object v11, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 61
    .line 62
    if-eq v10, v11, :cond_2

    .line 63
    .line 64
    const-class v11, Ljava/lang/Integer;

    .line 65
    .line 66
    if-ne v10, v11, :cond_1

    .line 67
    .line 68
    :cond_2
    aget-object v9, v9, v5

    .line 69
    .line 70
    if-ne v9, v6, :cond_1

    .line 71
    .line 72
    const-string v9, "set"

    .line 73
    .line 74
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v10

    .line 78
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v9

    .line 82
    if-eqz v9, :cond_3

    .line 83
    .line 84
    invoke-static {v8}, Lh/Hchat/utils/KavaReflector;->accessible(Ljava/lang/reflect/Method;)Ljava/lang/reflect/Method;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    goto :goto_2

    .line 89
    :cond_3
    if-nez v3, :cond_1

    .line 90
    .line 91
    invoke-static {v8}, Lh/Hchat/utils/KavaReflector;->accessible(Ljava/lang/reflect/Method;)Ljava/lang/reflect/Method;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    goto :goto_1

    .line 96
    :cond_4
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    goto :goto_0

    .line 101
    :cond_5
    :goto_2
    if-nez v3, :cond_6

    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_6
    check-cast v2, Ljava/lang/Integer;

    .line 105
    .line 106
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    :try_start_0
    filled-new-array {v2, p1}, [Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-static {v3, p0, p1}, Lh/Hchat/utils/KavaReflector;->invokeOrThrow(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    add-int/lit8 p1, v1, 0x4

    .line 118
    .line 119
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    filled-new-array {p1, v0}, [Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    invoke-static {v3, p0, p1}, Lh/Hchat/utils/KavaReflector;->invokeOrThrow(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    add-int/lit8 p1, v1, 0x5

    .line 131
    .line 132
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    filled-new-array {p1, v0}, [Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    invoke-static {v3, p0, p1}, Lh/Hchat/utils/KavaReflector;->invokeOrThrow(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    add-int/lit8 v1, v1, 0x6

    .line 144
    .line 145
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    filled-new-array {p1, v0}, [Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    invoke-static {v3, p0, p1}, Lh/Hchat/utils/KavaReflector;->invokeOrThrow(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 154
    .line 155
    .line 156
    return v5

    .line 157
    :catchall_0
    :goto_3
    return v4
.end method


# virtual methods
.method public final a(Ljava/lang/reflect/Method;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)[Ljava/lang/Object;
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    array-length v0, p1

    .line 6
    new-array v0, v0, [Ljava/lang/Object;

    .line 7
    .line 8
    invoke-static {p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v2, 0x0

    .line 13
    const-string v3, ""

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    move-object p4, v3

    .line 18
    goto :goto_3

    .line 19
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string v4, "<msg><appinfo><appid>"

    .line 22
    .line 23
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p4}, Ljava/lang/String;->length()I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    if-nez v4, :cond_1

    .line 31
    .line 32
    move-object p4, v3

    .line 33
    goto :goto_2

    .line 34
    :cond_1
    new-instance v4, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    invoke-virtual {p4}, Ljava/lang/String;->length()I

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 41
    .line 42
    .line 43
    move v5, v2

    .line 44
    :goto_0
    invoke-virtual {p4}, Ljava/lang/String;->length()I

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    if-ge v5, v6, :cond_5

    .line 49
    .line 50
    invoke-virtual {p4, v5}, Ljava/lang/String;->charAt(I)C

    .line 51
    .line 52
    .line 53
    move-result v6

    .line 54
    const/16 v7, 0x26

    .line 55
    .line 56
    if-ne v6, v7, :cond_2

    .line 57
    .line 58
    const-string v6, "&amp;"

    .line 59
    .line 60
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_2
    const/16 v7, 0x3c

    .line 65
    .line 66
    if-ne v6, v7, :cond_3

    .line 67
    .line 68
    const-string v6, "&lt;"

    .line 69
    .line 70
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_3
    const/16 v7, 0x3e

    .line 75
    .line 76
    if-ne v6, v7, :cond_4

    .line 77
    .line 78
    const-string v6, "&gt;"

    .line 79
    .line 80
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_4
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    :goto_1
    add-int/lit8 v5, v5, 0x1

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_5
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p4

    .line 94
    :goto_2
    const-string v4, "</appid></appinfo></msg>"

    .line 95
    .line 96
    invoke-static {v1, p4, v4}, Leh/a;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p4

    .line 100
    :goto_3
    array-length v1, p1

    .line 101
    const/16 v4, 0x8

    .line 102
    .line 103
    const-class v5, Ljava/lang/String;

    .line 104
    .line 105
    if-ne v1, v4, :cond_6

    .line 106
    .line 107
    const/4 v1, 0x5

    .line 108
    aget-object v4, p1, v1

    .line 109
    .line 110
    if-ne v4, v5, :cond_6

    .line 111
    .line 112
    goto :goto_4

    .line 113
    :cond_6
    const/4 v1, -0x1

    .line 114
    :goto_4
    move v4, v2

    .line 115
    :goto_5
    array-length v6, p1

    .line 116
    if-ge v4, v6, :cond_11

    .line 117
    .line 118
    aget-object v6, p1, v4

    .line 119
    .line 120
    if-nez v4, :cond_7

    .line 121
    .line 122
    const-class v7, Landroid/content/Context;

    .line 123
    .line 124
    invoke-virtual {v7, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 125
    .line 126
    .line 127
    move-result v7

    .line 128
    if-eqz v7, :cond_7

    .line 129
    .line 130
    iget-object v6, p0, Lj8/n;->a:Landroid/content/Context;

    .line 131
    .line 132
    aput-object v6, v0, v4

    .line 133
    .line 134
    goto :goto_9

    .line 135
    :cond_7
    const/4 v7, 0x1

    .line 136
    if-ne v4, v7, :cond_8

    .line 137
    .line 138
    if-ne v6, v5, :cond_8

    .line 139
    .line 140
    aput-object p2, v0, v4

    .line 141
    .line 142
    goto :goto_9

    .line 143
    :cond_8
    const/4 v8, 0x2

    .line 144
    if-ne v4, v8, :cond_9

    .line 145
    .line 146
    if-ne v6, v5, :cond_9

    .line 147
    .line 148
    aput-object p3, v0, v4

    .line 149
    .line 150
    goto :goto_9

    .line 151
    :cond_9
    if-ne v4, v1, :cond_a

    .line 152
    .line 153
    aput-object p4, v0, v4

    .line 154
    .line 155
    goto :goto_9

    .line 156
    :cond_a
    sget-object v8, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 157
    .line 158
    if-eq v6, v8, :cond_f

    .line 159
    .line 160
    const-class v8, Ljava/lang/Integer;

    .line 161
    .line 162
    if-ne v6, v8, :cond_b

    .line 163
    .line 164
    goto :goto_7

    .line 165
    :cond_b
    sget-object v7, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 166
    .line 167
    if-eq v6, v7, :cond_e

    .line 168
    .line 169
    const-class v7, Ljava/lang/Boolean;

    .line 170
    .line 171
    if-ne v6, v7, :cond_c

    .line 172
    .line 173
    goto :goto_6

    .line 174
    :cond_c
    if-ne v6, v5, :cond_d

    .line 175
    .line 176
    aput-object v3, v0, v4

    .line 177
    .line 178
    goto :goto_9

    .line 179
    :cond_d
    const/4 v6, 0x0

    .line 180
    aput-object v6, v0, v4

    .line 181
    .line 182
    goto :goto_9

    .line 183
    :cond_e
    :goto_6
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 184
    .line 185
    aput-object v6, v0, v4

    .line 186
    .line 187
    goto :goto_9

    .line 188
    :cond_f
    :goto_7
    if-eqz p5, :cond_10

    .line 189
    .line 190
    const/4 v6, 0x3

    .line 191
    if-ne v4, v6, :cond_10

    .line 192
    .line 193
    goto :goto_8

    .line 194
    :cond_10
    move v7, v2

    .line 195
    :goto_8
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 196
    .line 197
    .line 198
    move-result-object v6

    .line 199
    aput-object v6, v0, v4

    .line 200
    .line 201
    :goto_9
    add-int/lit8 v4, v4, 0x1

    .line 202
    .line 203
    goto :goto_5

    .line 204
    :cond_11
    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Lj8/n;->b:Lh/Hchat/dexkit/DexFinder;

    .line 2
    .line 3
    iget-object v0, v0, Lh/Hchat/dexkit/DexFinder;->marsCdnManagerClass:Ljava/lang/Class;

    .line 4
    .line 5
    iget-object v1, p0, Lj8/n;->c:Li8/f;

    .line 6
    .line 7
    invoke-static {v0, v1}, Lj8/n;->j(Ljava/lang/Class;Lj8/m;)V

    .line 8
    .line 9
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v1, "marsReady="

    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Lj8/n;->b:Lh/Hchat/dexkit/DexFinder;

    .line 18
    .line 19
    invoke-virtual {v1}, Lh/Hchat/dexkit/DexFinder;->isMarsCdnReady()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v1, " managerClass="

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, Lj8/n;->b:Lh/Hchat/dexkit/DexFinder;

    .line 32
    .line 33
    iget-object v1, v1, Lh/Hchat/dexkit/DexFinder;->marsCdnManagerClass:Ljava/lang/Class;

    .line 34
    .line 35
    const/4 v2, 0x0

    .line 36
    const/4 v3, 0x1

    .line 37
    if-eqz v1, :cond_0

    .line 38
    .line 39
    move v1, v3

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    move v1, v2

    .line 42
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v1, " requestClass="

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    iget-object v1, p0, Lj8/n;->b:Lh/Hchat/dexkit/DexFinder;

    .line 51
    .line 52
    iget-object v1, v1, Lh/Hchat/dexkit/DexFinder;->marsCdnDownloadRequestClass:Ljava/lang/Class;

    .line 53
    .line 54
    if-eqz v1, :cond_1

    .line 55
    .line 56
    move v1, v3

    .line 57
    goto :goto_1

    .line 58
    :cond_1
    move v1, v2

    .line 59
    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string v1, " callbackClass="

    .line 63
    .line 64
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    iget-object v1, p0, Lj8/n;->b:Lh/Hchat/dexkit/DexFinder;

    .line 68
    .line 69
    iget-object v1, v1, Lh/Hchat/dexkit/DexFinder;->marsCdnDownloadCallbackClass:Ljava/lang/Class;

    .line 70
    .line 71
    if-eqz v1, :cond_2

    .line 72
    .line 73
    move v1, v3

    .line 74
    goto :goto_2

    .line 75
    :cond_2
    move v1, v2

    .line 76
    :goto_2
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    const-string v1, " startMethod="

    .line 80
    .line 81
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    iget-object v1, p0, Lj8/n;->b:Lh/Hchat/dexkit/DexFinder;

    .line 85
    .line 86
    iget-object v1, v1, Lh/Hchat/dexkit/DexFinder;->marsCdnStartDownloadMethod:Ljava/lang/reflect/Method;

    .line 87
    .line 88
    if-eqz v1, :cond_3

    .line 89
    .line 90
    move v1, v3

    .line 91
    goto :goto_3

    .line 92
    :cond_3
    move v1, v2

    .line 93
    :goto_3
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    const-string v1, " managerInstance="

    .line 97
    .line 98
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    sget-object v1, Lj8/n;->e:Ljava/lang/Object;

    .line 102
    .line 103
    if-eqz v1, :cond_4

    .line 104
    .line 105
    move v2, v3

    .line 106
    :cond_4
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    return-object v0
.end method

.method public final d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILb5/c;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    sget-object v2, Lj8/n;->e:Ljava/lang/Object;

    .line 7
    .line 8
    if-nez v2, :cond_0

    .line 9
    .line 10
    iget-object v3, p0, Lj8/n;->b:Lh/Hchat/dexkit/DexFinder;

    .line 11
    .line 12
    iget-object v3, v3, Lh/Hchat/dexkit/DexFinder;->marsCdnManagerClass:Ljava/lang/Class;

    .line 13
    .line 14
    invoke-static {v3}, Lh/Hchat/utils/KavaReflector;->staticInstance(Ljava/lang/Class;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    sput-object v3, Lj8/n;->e:Ljava/lang/Object;

    .line 21
    .line 22
    move-object v2, v3

    .line 23
    :cond_0
    const/4 v3, 0x0

    .line 24
    if-nez v2, :cond_1

    .line 25
    .line 26
    const-string p1, "Mars CDN\u672a\u63d0\u4ea4: \u5c1a\u672a\u6355\u83b7CdnManager\u5b9e\u4f8b"

    .line 27
    .line 28
    invoke-virtual {p0, p1}, Lj8/n;->k(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return v3

    .line 32
    :cond_1
    :try_start_0
    iget-object v4, p0, Lj8/n;->b:Lh/Hchat/dexkit/DexFinder;

    .line 33
    .line 34
    iget-object v4, v4, Lh/Hchat/dexkit/DexFinder;->marsCdnDownloadRequestClass:Ljava/lang/Class;

    .line 35
    .line 36
    new-array v5, v3, [Ljava/lang/Class;

    .line 37
    .line 38
    invoke-static {v4, v5}, Lh/Hchat/utils/KavaReflector;->findConstructor(Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    new-array v5, v3, [Ljava/lang/Object;

    .line 43
    .line 44
    invoke-static {v4, v5}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    if-nez v4, :cond_2

    .line 49
    .line 50
    const-string p1, "Mars CDN\u672a\u63d0\u4ea4: \u65e0\u6cd5\u521b\u5efaC2CDownloadRequest"

    .line 51
    .line 52
    invoke-virtual {p0, p1}, Lj8/n;->k(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return v3

    .line 56
    :catchall_0
    move-exception p1

    .line 57
    goto/16 :goto_2

    .line 58
    .line 59
    :cond_2
    invoke-static {p1}, Lj8/n;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    const-string v6, "setFileKey"

    .line 64
    .line 65
    invoke-static {v4, v6, v5}, Lj8/n;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    const-string v6, "setFileid"

    .line 69
    .line 70
    invoke-static {v4, v6, p1}, Lj8/n;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    const-string p1, "setAeskey"

    .line 74
    .line 75
    invoke-static {v4, p1, p2}, Lj8/n;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    const-string p1, "setFileType"

    .line 79
    .line 80
    if-lez p4, :cond_3

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_3
    const/4 p4, 0x2

    .line 84
    :goto_0
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    invoke-static {v4, p1, p2}, Lj8/n;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    const-string p1, "setSavePath2"

    .line 92
    .line 93
    invoke-static {v4, p1, p3}, Lj8/n;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    const-string p1, "setBizid"

    .line 97
    .line 98
    invoke-static {v4, p1, v1}, Lj8/n;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    const-string p1, "setApptype"

    .line 102
    .line 103
    invoke-static {v4, p1, v1}, Lj8/n;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    const-string p2, "build"

    .line 111
    .line 112
    new-array p3, v3, [Ljava/lang/Class;

    .line 113
    .line 114
    invoke-static {p1, p2, p3}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    if-eqz p1, :cond_4

    .line 119
    .line 120
    new-array p2, v3, [Ljava/lang/Object;

    .line 121
    .line 122
    invoke-static {p1, v4, p2}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    :cond_4
    iget-object p1, p0, Lj8/n;->b:Lh/Hchat/dexkit/DexFinder;

    .line 126
    .line 127
    iget-object p1, p1, Lh/Hchat/dexkit/DexFinder;->marsCdnDownloadCallbackClass:Ljava/lang/Class;

    .line 128
    .line 129
    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    iget-object p2, p0, Lj8/n;->b:Lh/Hchat/dexkit/DexFinder;

    .line 134
    .line 135
    iget-object p2, p2, Lh/Hchat/dexkit/DexFinder;->marsCdnDownloadCallbackClass:Ljava/lang/Class;

    .line 136
    .line 137
    filled-new-array {p2}, [Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    move-result-object p2

    .line 141
    new-instance p3, Lj8/k;

    .line 142
    .line 143
    invoke-direct {p3, v5, p5}, Lj8/k;-><init>(Ljava/lang/String;Lb5/c;)V

    .line 144
    .line 145
    .line 146
    invoke-static {p1, p2, p3}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    iget-object p2, p0, Lj8/n;->b:Lh/Hchat/dexkit/DexFinder;

    .line 151
    .line 152
    iget-object p2, p2, Lh/Hchat/dexkit/DexFinder;->marsCdnStartDownloadMethod:Ljava/lang/reflect/Method;

    .line 153
    .line 154
    filled-new-array {v4, p1}, [Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    invoke-static {p2, v2, p1}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    instance-of p2, p1, Ljava/lang/Boolean;

    .line 163
    .line 164
    if-eqz p2, :cond_5

    .line 165
    .line 166
    check-cast p1, Ljava/lang/Boolean;

    .line 167
    .line 168
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 169
    .line 170
    .line 171
    move-result p1

    .line 172
    return p1

    .line 173
    :cond_5
    instance-of p2, p1, Ljava/lang/Number;

    .line 174
    .line 175
    if-eqz p2, :cond_7

    .line 176
    .line 177
    check-cast p1, Ljava/lang/Number;

    .line 178
    .line 179
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 180
    .line 181
    .line 182
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 183
    if-ltz p1, :cond_6

    .line 184
    .line 185
    goto :goto_1

    .line 186
    :cond_6
    return v3

    .line 187
    :cond_7
    :goto_1
    return v0

    .line 188
    :goto_2
    new-instance p2, Ljava/lang/StringBuilder;

    .line 189
    .line 190
    const-string p3, "Mars CDN\u63d0\u4ea4\u5f02\u5e38: "

    .line 191
    .line 192
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    move-result-object p3

    .line 199
    invoke-virtual {p3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object p3

    .line 203
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    const-string p3, ": "

    .line 207
    .line 208
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object p4

    .line 215
    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object p2

    .line 222
    invoke-virtual {p0, p2}, Lj8/n;->k(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    new-instance p2, Ljava/lang/StringBuilder;

    .line 226
    .line 227
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 228
    .line 229
    .line 230
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 231
    .line 232
    .line 233
    move-result-object p4

    .line 234
    invoke-virtual {p4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object p4

    .line 238
    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 242
    .line 243
    .line 244
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object p1

    .line 248
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 249
    .line 250
    .line 251
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object p1

    .line 255
    invoke-virtual {p5, p1}, Lb5/c;->m(Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    return v3
.end method

.method public final e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILj8/l;)Z
    .locals 8

    .line 1
    new-instance v6, Lb5/c;

    .line 2
    .line 3
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 10
    .line 11
    .line 12
    iput-object v0, v6, Lb5/c;->c:Ljava/lang/Object;

    .line 13
    .line 14
    iput-object p5, v6, Lb5/c;->a:Ljava/lang/Object;

    .line 15
    .line 16
    iput-object p3, v6, Lb5/c;->b:Ljava/lang/Object;

    .line 17
    .line 18
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 19
    .line 20
    .line 21
    move-result p5

    .line 22
    const/4 v7, 0x0

    .line 23
    if-nez p5, :cond_0

    .line 24
    .line 25
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 26
    .line 27
    .line 28
    move-result p5

    .line 29
    if-nez p5, :cond_0

    .line 30
    .line 31
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 32
    .line 33
    .line 34
    move-result p5

    .line 35
    if-eqz p5, :cond_1

    .line 36
    .line 37
    :cond_0
    move-object v1, p0

    .line 38
    goto/16 :goto_3

    .line 39
    .line 40
    :cond_1
    iget-object p5, p0, Lj8/n;->b:Lh/Hchat/dexkit/DexFinder;

    .line 41
    .line 42
    iget-object v0, p5, Lh/Hchat/dexkit/DexFinder;->marsCdnManagerClass:Ljava/lang/Class;

    .line 43
    .line 44
    iget-object v1, p0, Lj8/n;->c:Li8/f;

    .line 45
    .line 46
    invoke-static {v0, v1}, Lj8/n;->j(Ljava/lang/Class;Lj8/m;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p5}, Lh/Hchat/dexkit/DexFinder;->isMarsCdnReady()Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_5

    .line 54
    .line 55
    :try_start_0
    iget-object v0, p5, Lh/Hchat/dexkit/DexFinder;->marsCdnManagerClass:Ljava/lang/Class;

    .line 56
    .line 57
    invoke-static {v0, v1}, Lj8/n;->j(Ljava/lang/Class;Lj8/m;)V

    .line 58
    .line 59
    .line 60
    new-instance v0, Ljava/io/File;

    .line 61
    .line 62
    invoke-direct {v0, p3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 66
    .line 67
    .line 68
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 69
    if-eqz v0, :cond_2

    .line 70
    .line 71
    :try_start_1
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-nez v1, :cond_2

    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :catchall_0
    move-exception v0

    .line 82
    move-object p1, v0

    .line 83
    move-object v1, p0

    .line 84
    goto :goto_2

    .line 85
    :cond_2
    :goto_0
    :try_start_2
    invoke-virtual {p5}, Lh/Hchat/dexkit/DexFinder;->isMarsCdnReady()Z

    .line 86
    .line 87
    .line 88
    move-result p5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 89
    if-nez p5, :cond_3

    .line 90
    .line 91
    :try_start_3
    const-string p1, "\u4e0b\u8f7d\u56fe\u7247\u5931\u8d25: Mars CDN API\u672a\u5c31\u7eea"

    .line 92
    .line 93
    invoke-virtual {p0, p1}, Lj8/n;->k(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    const-string p1, "Mars CDN API\u672a\u5c31\u7eea"

    .line 97
    .line 98
    invoke-virtual {v6, p1}, Lb5/c;->m(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 99
    .line 100
    .line 101
    return v7

    .line 102
    :cond_3
    move-object v1, p0

    .line 103
    move-object v2, p1

    .line 104
    move-object v3, p2

    .line 105
    move-object v4, p3

    .line 106
    move v5, p4

    .line 107
    :try_start_4
    invoke-virtual/range {v1 .. v6}, Lj8/n;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILb5/c;)Z

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    if-nez p1, :cond_4

    .line 112
    .line 113
    const-string p2, "CDN\u4efb\u52a1\u63d0\u4ea4\u5931\u8d25"

    .line 114
    .line 115
    invoke-virtual {v6, p2}, Lb5/c;->m(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 116
    .line 117
    .line 118
    return p1

    .line 119
    :catchall_1
    move-exception v0

    .line 120
    :goto_1
    move-object p1, v0

    .line 121
    goto :goto_2

    .line 122
    :cond_4
    return p1

    .line 123
    :catchall_2
    move-exception v0

    .line 124
    move-object v1, p0

    .line 125
    goto :goto_1

    .line 126
    :goto_2
    new-instance p2, Ljava/lang/StringBuilder;

    .line 127
    .line 128
    const-string p3, "\u4e0b\u8f7d\u56fe\u7247\u5f02\u5e38: "

    .line 129
    .line 130
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    move-result-object p3

    .line 137
    invoke-virtual {p3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p3

    .line 141
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    const-string p3, ": "

    .line 145
    .line 146
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p4

    .line 153
    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object p2

    .line 160
    invoke-virtual {p0, p2}, Lj8/n;->k(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    new-instance p2, Ljava/lang/StringBuilder;

    .line 164
    .line 165
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 166
    .line 167
    .line 168
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    move-result-object p4

    .line 172
    invoke-virtual {p4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object p4

    .line 176
    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    invoke-virtual {v6, p1}, Lb5/c;->m(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    return v7

    .line 197
    :cond_5
    move-object v1, p0

    .line 198
    const-string p1, "\u4e0b\u8f7d\u56fe\u7247\u5931\u8d25: CDN API\u672a\u5c31\u7eea"

    .line 199
    .line 200
    invoke-virtual {p0, p1}, Lj8/n;->k(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    const-string p1, "CDN API\u672a\u5c31\u7eea"

    .line 204
    .line 205
    invoke-virtual {v6, p1}, Lb5/c;->m(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    return v7

    .line 209
    :goto_3
    const-string p1, "\u4e0b\u8f7d\u56fe\u7247\u5931\u8d25: cdnUrl/aesKey/savePath\u4e3a\u7a7a"

    .line 210
    .line 211
    invoke-virtual {p0, p1}, Lj8/n;->k(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    const-string p1, "cdnUrl/aesKey/savePath\u4e3a\u7a7a"

    .line 215
    .line 216
    invoke-virtual {v6, p1}, Lb5/c;->m(Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    return v7
.end method

.method public final f()Ljava/lang/reflect/Constructor;
    .locals 7

    .line 1
    iget-object v0, p0, Lj8/n;->b:Lh/Hchat/dexkit/DexFinder;

    .line 2
    .line 3
    iget-object v1, v0, Lh/Hchat/dexkit/DexFinder;->sendImageAsyncParamsClass:Ljava/lang/Class;

    .line 4
    .line 5
    iget-object v0, v0, Lh/Hchat/dexkit/DexFinder;->sendImageCrossParamsClass:Ljava/lang/Class;

    .line 6
    .line 7
    invoke-static {v1}, Lh/Hchat/utils/KavaReflector;->declaredConstructors(Ljava/lang/Class;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_2

    .line 20
    .line 21
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Ljava/lang/reflect/Constructor;

    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    array-length v4, v3

    .line 32
    const/4 v5, 0x5

    .line 33
    if-ne v4, v5, :cond_0

    .line 34
    .line 35
    const/4 v4, 0x0

    .line 36
    aget-object v4, v3, v4

    .line 37
    .line 38
    const-class v5, Ljava/lang/String;

    .line 39
    .line 40
    if-ne v4, v5, :cond_0

    .line 41
    .line 42
    const/4 v4, 0x1

    .line 43
    aget-object v4, v3, v4

    .line 44
    .line 45
    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 46
    .line 47
    if-eq v4, v6, :cond_1

    .line 48
    .line 49
    const-class v6, Ljava/lang/Integer;

    .line 50
    .line 51
    if-ne v4, v6, :cond_0

    .line 52
    .line 53
    :cond_1
    const/4 v4, 0x2

    .line 54
    aget-object v4, v3, v4

    .line 55
    .line 56
    if-ne v4, v5, :cond_0

    .line 57
    .line 58
    const/4 v4, 0x3

    .line 59
    aget-object v4, v3, v4

    .line 60
    .line 61
    if-ne v4, v5, :cond_0

    .line 62
    .line 63
    const/4 v4, 0x4

    .line 64
    aget-object v3, v3, v4

    .line 65
    .line 66
    if-ne v3, v0, :cond_0

    .line 67
    .line 68
    invoke-static {v2}, Lh/Hchat/utils/KavaReflector;->accessible(Ljava/lang/reflect/Constructor;)Ljava/lang/reflect/Constructor;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    return-object v0

    .line 73
    :cond_2
    const/4 v0, 0x0

    .line 74
    return-object v0
.end method

.method public final i(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lj8/n;->b:Lh/Hchat/dexkit/DexFinder;

    .line 2
    .line 3
    iget-object v1, v0, Lh/Hchat/dexkit/DexFinder;->imageStorageGetterMethod:Ljava/lang/reflect/Method;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    invoke-static {v1}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Method;)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    array-length v2, v2

    .line 18
    if-nez v2, :cond_0

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    if-ne v2, p1, :cond_0

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    new-array v2, v2, [Ljava/lang/Object;

    .line 28
    .line 29
    const/4 v3, 0x0

    .line 30
    invoke-static {v1, v3, v2}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {p1, v1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_0

    .line 39
    .line 40
    return-object v1

    .line 41
    :cond_0
    invoke-static {v0, p1}, Lig/a;->A(Lh/Hchat/dexkit/DexFinder;Ljava/lang/Class;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    return-object p1
.end method

.method public final k(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "[WeChatImageApi] "

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

.method public final declared-synchronized l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 1
    const-string v0, "image_"

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    const-string p1, ""
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    monitor-exit p0

    .line 13
    return-object p1

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    goto/16 :goto_7

    .line 16
    .line 17
    :cond_0
    :try_start_1
    new-instance v1, Ljava/io/File;

    .line 18
    .line 19
    invoke-direct {v1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/io/File;->isFile()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    monitor-exit p0

    .line 33
    return-object p1

    .line 34
    :cond_1
    :try_start_2
    new-instance v1, Ljava/io/File;

    .line 35
    .line 36
    iget-object v2, p0, Lj8/n;->a:Landroid/content/Context;

    .line 37
    .line 38
    invoke-virtual {v2}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    const-string v3, "Hchat_message_image"

    .line 43
    .line 44
    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-nez v2, :cond_2

    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-nez v2, :cond_2

    .line 58
    .line 59
    const-string p1, ""
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 60
    .line 61
    monitor-exit p0

    .line 62
    return-object p1

    .line 63
    :cond_2
    :try_start_3
    new-instance v2, Ljava/io/File;

    .line 64
    .line 65
    new-instance v3, Ljava/lang/StringBuilder;

    .line 66
    .line 67
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    const-string v0, ".jpg"

    .line 82
    .line 83
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-direct {v2, v1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2}, Ljava/io/File;->isFile()Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    const-wide/16 v3, 0x0

    .line 98
    .line 99
    if-eqz v0, :cond_3

    .line 100
    .line 101
    invoke-virtual {v2}, Ljava/io/File;->length()J

    .line 102
    .line 103
    .line 104
    move-result-wide v0

    .line 105
    cmp-long v0, v0, v3

    .line 106
    .line 107
    if-lez v0, :cond_3

    .line 108
    .line 109
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 113
    monitor-exit p0

    .line 114
    return-object p1

    .line 115
    :cond_3
    :try_start_4
    invoke-static {p1, p2}, Lj8/n;->o(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/io/InputStream;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    if-nez p1, :cond_4

    .line 120
    .line 121
    const-string p1, ""
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 122
    .line 123
    monitor-exit p0

    .line 124
    return-object p1

    .line 125
    :cond_4
    :try_start_5
    new-instance p2, Ljava/io/FileOutputStream;

    .line 126
    .line 127
    const/4 v0, 0x0

    .line 128
    invoke-direct {p2, v2, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 129
    .line 130
    .line 131
    const/16 v1, 0x2000

    .line 132
    .line 133
    :try_start_6
    new-array v1, v1, [B

    .line 134
    .line 135
    :goto_0
    invoke-virtual {p1, v1}, Ljava/io/InputStream;->read([B)I

    .line 136
    .line 137
    .line 138
    move-result v5

    .line 139
    if-lez v5, :cond_5

    .line 140
    .line 141
    invoke-virtual {p2, v1, v0, v5}, Ljava/io/FileOutputStream;->write([BII)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 142
    .line 143
    .line 144
    goto :goto_0

    .line 145
    :catchall_1
    move-exception v0

    .line 146
    goto :goto_2

    .line 147
    :cond_5
    :try_start_7
    invoke-virtual {p2}, Ljava/io/FileOutputStream;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 148
    .line 149
    .line 150
    :try_start_8
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 151
    .line 152
    .line 153
    :try_start_9
    invoke-virtual {v2}, Ljava/io/File;->isFile()Z

    .line 154
    .line 155
    .line 156
    move-result p1

    .line 157
    if-eqz p1, :cond_6

    .line 158
    .line 159
    invoke-virtual {v2}, Ljava/io/File;->length()J

    .line 160
    .line 161
    .line 162
    move-result-wide p1

    .line 163
    cmp-long p1, p1, v3

    .line 164
    .line 165
    if-lez p1, :cond_6

    .line 166
    .line 167
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    goto :goto_1

    .line 172
    :cond_6
    const-string p1, ""
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 173
    .line 174
    :goto_1
    monitor-exit p0

    .line 175
    return-object p1

    .line 176
    :catchall_2
    move-exception p1

    .line 177
    goto :goto_6

    .line 178
    :catchall_3
    move-exception p2

    .line 179
    goto :goto_4

    .line 180
    :goto_2
    :try_start_a
    invoke-virtual {p2}, Ljava/io/FileOutputStream;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 181
    .line 182
    .line 183
    goto :goto_3

    .line 184
    :catchall_4
    move-exception p2

    .line 185
    :try_start_b
    invoke-virtual {v0, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 186
    .line 187
    .line 188
    :goto_3
    throw v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    .line 189
    :goto_4
    :try_start_c
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    .line 190
    .line 191
    .line 192
    goto :goto_5

    .line 193
    :catchall_5
    move-exception p1

    .line 194
    :try_start_d
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 195
    .line 196
    .line 197
    :goto_5
    throw p2
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    .line 198
    :goto_6
    :try_start_e
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 199
    .line 200
    .line 201
    move-result p2

    .line 202
    if-eqz p2, :cond_7

    .line 203
    .line 204
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 205
    .line 206
    .line 207
    :cond_7
    new-instance p2, Ljava/lang/StringBuilder;

    .line 208
    .line 209
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 210
    .line 211
    .line 212
    const-string v0, "\u8bfb\u53d6\u56fe\u7247VFS\u8def\u5f84\u5f02\u5e38: "

    .line 213
    .line 214
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object p1

    .line 221
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    invoke-virtual {p0, p1}, Lj8/n;->k(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    const-string p1, ""
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    .line 232
    .line 233
    monitor-exit p0

    .line 234
    return-object p1

    .line 235
    :goto_7
    :try_start_f
    monitor-exit p0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    .line 236
    throw p1
.end method

.method public final m(Ljava/lang/String;)Ljava/lang/Object;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, Lj8/n;->b:Lh/Hchat/dexkit/DexFinder;

    .line 3
    .line 4
    iget-object v1, v1, Lh/Hchat/dexkit/DexFinder;->sendImageAppInfoClass:Ljava/lang/Class;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    new-array v3, v2, [Ljava/lang/Class;

    .line 8
    .line 9
    invoke-static {v1, v3}, Lh/Hchat/utils/KavaReflector;->findConstructor(Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    new-array v2, v2, [Ljava/lang/Object;

    .line 14
    .line 15
    invoke-static {v1, v2}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    invoke-static {v1, p1}, Lj8/n;->u(Ljava/lang/Object;Ljava/lang/String;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    invoke-static {v1, p1}, Lj8/n;->t(Ljava/lang/Object;Ljava/lang/String;)Z

    .line 30
    .line 31
    .line 32
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    if-eqz p1, :cond_2

    .line 34
    .line 35
    :goto_0
    return-object v1

    .line 36
    :cond_2
    :goto_1
    return-object v0

    .line 37
    :catchall_0
    move-exception p1

    .line 38
    new-instance v1, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    const-string v2, "\u521b\u5efa\u56fe\u7247appinfo\u5f02\u5e38: "

    .line 41
    .line 42
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {p0, p1}, Lj8/n;->k(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return-object v0
.end method

.method public final n(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    :try_start_0
    new-array v2, v1, [Ljava/lang/Class;

    .line 7
    .line 8
    invoke-static {p1, v2}, Lh/Hchat/utils/KavaReflector;->findConstructor(Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    new-array v1, v1, [Ljava/lang/Object;

    .line 13
    .line 14
    invoke-static {v2, v1}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    return-object p1

    .line 19
    :catchall_0
    move-exception v1

    .line 20
    new-instance v2, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v3, "\u521b\u5efa\u56fe\u7247\u53d1\u9001\u5668\u5931\u8d25: "

    .line 23
    .line 24
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string p1, " "

    .line 35
    .line 36
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p0, p1}, Lj8/n;->k(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-object v0
.end method

.method public final p(Ljava/lang/Object;)Ljava/lang/String;
    .locals 5

    .line 1
    iget-object v0, p0, Lj8/n;->b:Lh/Hchat/dexkit/DexFinder;

    .line 2
    .line 3
    iget-object v0, v0, Lh/Hchat/dexkit/DexFinder;->imageBestPathMethod:Ljava/lang/reflect/Method;

    .line 4
    .line 5
    const-string v1, ""

    .line 6
    .line 7
    if-eqz p1, :cond_4

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    array-length v3, v2

    .line 17
    const/4 v4, 0x1

    .line 18
    if-ne v3, v4, :cond_4

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    aget-object v2, v2, v3

    .line 22
    .line 23
    invoke-virtual {v2, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-nez v2, :cond_1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {p0, v2}, Lj8/n;->i(Ljava/lang/Class;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    if-nez v2, :cond_2

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-static {v0, v2, p1}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    check-cast p1, Ljava/lang/String;

    .line 50
    .line 51
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-eqz v2, :cond_3

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_3
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {p0, v0, p1}, Lj8/n;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    return-object p1

    .line 71
    :catchall_0
    move-exception p1

    .line 72
    new-instance v0, Ljava/lang/StringBuilder;

    .line 73
    .line 74
    const-string v2, "\u89e3\u6790\u56fe\u7247\u539f\u56fe\u8def\u5f84\u5f02\u5e38: "

    .line 75
    .line 76
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-virtual {p0, p1}, Lj8/n;->k(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    :cond_4
    :goto_0
    return-object v1
.end method

.method public final q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lj8/n;->b:Lh/Hchat/dexkit/DexFinder;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    iget-object v2, v0, Lh/Hchat/dexkit/DexFinder;->sendImageCrossParamsClass:Ljava/lang/Class;

    .line 5
    .line 6
    invoke-virtual {p0, v2}, Lj8/n;->n(Ljava/lang/Class;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    if-nez v2, :cond_0

    .line 11
    .line 12
    const-string p1, "\u65b0\u7248\u56fe\u7247appid\u94fe\u8def\u5931\u8d25: crossParams\u521b\u5efa\u5931\u8d25"

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lj8/n;->k(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return v1

    .line 18
    :catchall_0
    move-exception p1

    .line 19
    goto/16 :goto_5

    .line 20
    .line 21
    :cond_0
    const-string v3, "a"

    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    invoke-static {v4, v3}, Lh/Hchat/utils/KavaReflector;->findField(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    if-eqz v3, :cond_1

    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 38
    .line 39
    if-eq v4, v5, :cond_2

    .line 40
    .line 41
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    const-class v5, Ljava/lang/Integer;

    .line 46
    .line 47
    if-eq v4, v5, :cond_2

    .line 48
    .line 49
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-static {v3}, Lj8/n;->g(Ljava/lang/Class;)Ljava/lang/reflect/Field;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    :cond_2
    const/4 v4, 0x6

    .line 58
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    invoke-static {v3, v2, v4}, Lh/Hchat/utils/KavaReflector;->writeField(Ljava/lang/reflect/Field;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-nez v3, :cond_3

    .line 67
    .line 68
    const-string p1, "\u65b0\u7248\u56fe\u7247appid\u94fe\u8def\u5931\u8d25: crossParams\u7c7b\u578b\u5b57\u6bb5\u5199\u5165\u5931\u8d25"

    .line 69
    .line 70
    invoke-virtual {p0, p1}, Lj8/n;->k(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    return v1

    .line 74
    :cond_3
    invoke-virtual {p0, p3}, Lj8/n;->m(Ljava/lang/String;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p3

    .line 78
    if-nez p3, :cond_4

    .line 79
    .line 80
    const-string p1, "\u65b0\u7248\u56fe\u7247appid\u94fe\u8def\u5931\u8d25: appinfo\u521b\u5efa\u5931\u8d25"

    .line 81
    .line 82
    invoke-virtual {p0, p1}, Lj8/n;->k(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    return v1

    .line 86
    :cond_4
    iget-object v3, v0, Lh/Hchat/dexkit/DexFinder;->sendImageAppInfoClass:Ljava/lang/Class;

    .line 87
    .line 88
    if-nez v3, :cond_6

    .line 89
    .line 90
    :cond_5
    move p3, v1

    .line 91
    goto :goto_0

    .line 92
    :cond_6
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    invoke-static {v4}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    :cond_7
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 105
    .line 106
    .line 107
    move-result v5

    .line 108
    if-eqz v5, :cond_5

    .line 109
    .line 110
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    check-cast v5, Ljava/lang/reflect/Field;

    .line 115
    .line 116
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    move-result-object v6

    .line 120
    if-ne v6, v3, :cond_7

    .line 121
    .line 122
    invoke-static {v5, v2, p3}, Lh/Hchat/utils/KavaReflector;->writeField(Ljava/lang/reflect/Field;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result p3

    .line 126
    :goto_0
    if-nez p3, :cond_8

    .line 127
    .line 128
    const-string p1, "\u65b0\u7248\u56fe\u7247appid\u94fe\u8def\u5931\u8d25: appinfo\u5b57\u6bb5\u5199\u5165\u5931\u8d25"

    .line 129
    .line 130
    invoke-virtual {p0, p1}, Lj8/n;->k(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    return v1

    .line 134
    :cond_8
    invoke-virtual {p0}, Lj8/n;->f()Ljava/lang/reflect/Constructor;

    .line 135
    .line 136
    .line 137
    move-result-object p3

    .line 138
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    const-string v4, ""
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 143
    .line 144
    :try_start_1
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->account()Lg8/a;

    .line 145
    .line 146
    .line 147
    move-result-object v5

    .line 148
    if-eqz v5, :cond_9

    .line 149
    .line 150
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->account()Lg8/a;

    .line 151
    .line 152
    .line 153
    move-result-object v5

    .line 154
    invoke-virtual {v5}, Lg8/a;->c()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 158
    if-eqz v5, :cond_9

    .line 159
    .line 160
    move-object v4, v5

    .line 161
    :catchall_1
    :cond_9
    :try_start_2
    filled-new-array {p2, v3, v4, p1, v2}, [Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    invoke-static {p3, p1}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    if-nez p1, :cond_a

    .line 170
    .line 171
    const-string p1, "\u65b0\u7248\u56fe\u7247appid\u94fe\u8def\u5931\u8d25: params\u521b\u5efa\u5931\u8d25"

    .line 172
    .line 173
    invoke-virtual {p0, p1}, Lj8/n;->k(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    goto/16 :goto_4

    .line 177
    .line 178
    :cond_a
    const-string p2, "msg_raw_img_send"

    .line 179
    .line 180
    const-string p3, "send_wx_media_message_helper"

    .line 181
    .line 182
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    :goto_1
    if-eqz v2, :cond_e

    .line 187
    .line 188
    const-class v3, Ljava/lang/Object;

    .line 189
    .line 190
    if-eq v2, v3, :cond_e

    .line 191
    .line 192
    invoke-static {v2}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 193
    .line 194
    .line 195
    move-result-object v3

    .line 196
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 197
    .line 198
    .line 199
    move-result-object v3

    .line 200
    :cond_b
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 201
    .line 202
    .line 203
    move-result v4

    .line 204
    if-eqz v4, :cond_d

    .line 205
    .line 206
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v4

    .line 210
    check-cast v4, Ljava/lang/reflect/Field;

    .line 211
    .line 212
    invoke-static {v4}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Field;)Z

    .line 213
    .line 214
    .line 215
    move-result v5

    .line 216
    if-nez v5, :cond_b

    .line 217
    .line 218
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    move-result-object v5

    .line 222
    const-class v6, Ljava/lang/String;

    .line 223
    .line 224
    if-eq v5, v6, :cond_c

    .line 225
    .line 226
    goto :goto_2

    .line 227
    :cond_c
    invoke-static {v4, p1}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v5

    .line 231
    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    move-result v5

    .line 235
    if-eqz v5, :cond_b

    .line 236
    .line 237
    invoke-static {v4, p1, p3}, Lh/Hchat/utils/KavaReflector;->writeField(Ljava/lang/reflect/Field;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    move-result p2

    .line 241
    goto :goto_3

    .line 242
    :cond_d
    invoke-virtual {v2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 243
    .line 244
    .line 245
    move-result-object v2

    .line 246
    goto :goto_1

    .line 247
    :cond_e
    move p2, v1

    .line 248
    :goto_3
    if-nez p2, :cond_f

    .line 249
    .line 250
    const-string p1, "\u65b0\u7248\u56fe\u7247appid\u94fe\u8def\u5931\u8d25: \u5916\u90e8\u6765\u6e90\u5b57\u6bb5\u5199\u5165\u5931\u8d25"

    .line 251
    .line 252
    invoke-virtual {p0, p1}, Lj8/n;->k(Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    goto :goto_4

    .line 256
    :cond_f
    iget-object p2, v0, Lh/Hchat/dexkit/DexFinder;->sendImageAsyncSubmitMethod:Ljava/lang/reflect/Method;

    .line 257
    .line 258
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 259
    .line 260
    .line 261
    move-result-object p3

    .line 262
    invoke-static {v0, p3}, Lig/a;->A(Lh/Hchat/dexkit/DexFinder;Ljava/lang/Class;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object p3

    .line 266
    invoke-static {p2}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Method;)Z

    .line 267
    .line 268
    .line 269
    move-result v0

    .line 270
    if-nez v0, :cond_10

    .line 271
    .line 272
    if-nez p3, :cond_10

    .line 273
    .line 274
    new-instance p1, Ljava/lang/StringBuilder;

    .line 275
    .line 276
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 277
    .line 278
    .line 279
    const-string p3, "\u65b0\u7248\u56fe\u7247appid\u94fe\u8def\u5931\u8d25: \u670d\u52a1\u4e0d\u53ef\u7528 "

    .line 280
    .line 281
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 282
    .line 283
    .line 284
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 285
    .line 286
    .line 287
    move-result-object p2

    .line 288
    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object p2

    .line 292
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 293
    .line 294
    .line 295
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object p1

    .line 299
    invoke-virtual {p0, p1}, Lj8/n;->k(Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    :goto_4
    return v1

    .line 303
    :cond_10
    invoke-static {p2}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Method;)Z

    .line 304
    .line 305
    .line 306
    move-result v0

    .line 307
    if-eqz v0, :cond_11

    .line 308
    .line 309
    const/4 p3, 0x0

    .line 310
    :cond_11
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object p1

    .line 314
    invoke-static {p2, p3, p1}, Lh/Hchat/utils/KavaReflector;->invokeOrThrow(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 315
    .line 316
    .line 317
    const/4 p1, 0x1

    .line 318
    return p1

    .line 319
    :goto_5
    new-instance p2, Ljava/lang/StringBuilder;

    .line 320
    .line 321
    const-string p3, "\u65b0\u7248\u56fe\u7247appid\u94fe\u8def\u5f02\u5e38: "

    .line 322
    .line 323
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object p1

    .line 330
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 331
    .line 332
    .line 333
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object p1

    .line 337
    invoke-virtual {p0, p1}, Lj8/n;->k(Ljava/lang/String;)V

    .line 338
    .line 339
    .line 340
    return v1
.end method

.method public final r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Z
    .locals 11

    .line 1
    const-string v0, "\u53d1\u9001\u56fe\u7247\u5931\u8d25: \u65e0\u6cd5\u521b\u5efa "

    .line 2
    .line 3
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    :cond_0
    move-object v5, p0

    .line 17
    goto/16 :goto_6

    .line 18
    .line 19
    :cond_1
    invoke-static {p2}, Leh/a;->y(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_2

    .line 24
    .line 25
    new-instance p1, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    const-string p3, "\u53d1\u9001\u56fe\u7247\u5931\u8d25: \u6587\u4ef6\u4e0d\u5b58\u5728 "

    .line 28
    .line 29
    invoke-direct {p1, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p0, p1}, Lj8/n;->k(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return v2

    .line 43
    :cond_2
    iget-object v1, p0, Lj8/n;->b:Lh/Hchat/dexkit/DexFinder;

    .line 44
    .line 45
    iget-object v3, v1, Lh/Hchat/dexkit/DexFinder;->sendImageMethod:Ljava/lang/reflect/Method;

    .line 46
    .line 47
    if-nez v3, :cond_4

    .line 48
    .line 49
    iget-object v3, v1, Lh/Hchat/dexkit/DexFinder;->sendImageAsyncParamsClass:Ljava/lang/Class;

    .line 50
    .line 51
    if-eqz v3, :cond_3

    .line 52
    .line 53
    iget-object v3, v1, Lh/Hchat/dexkit/DexFinder;->sendImageCrossParamsClass:Ljava/lang/Class;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    iget-object v3, v1, Lh/Hchat/dexkit/DexFinder;->sendImageAppInfoClass:Ljava/lang/Class;

    .line 58
    .line 59
    if-eqz v3, :cond_3

    .line 60
    .line 61
    iget-object v3, v1, Lh/Hchat/dexkit/DexFinder;->sendImageAsyncSubmitMethod:Ljava/lang/reflect/Method;

    .line 62
    .line 63
    if-eqz v3, :cond_3

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_3
    const-string p1, "\u53d1\u9001\u56fe\u7247\u5931\u8d25: API\u672a\u5c31\u7eea"

    .line 67
    .line 68
    invoke-virtual {p0, p1}, Lj8/n;->k(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    return v2

    .line 72
    :cond_4
    :goto_0
    :try_start_0
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 73
    .line 74
    .line 75
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 76
    const/4 v4, 0x1

    .line 77
    if-nez v3, :cond_7

    .line 78
    .line 79
    :try_start_1
    invoke-virtual {p0}, Lj8/n;->s()Z

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    if-eqz v3, :cond_7

    .line 84
    .line 85
    iget-object v3, v1, Lh/Hchat/dexkit/DexFinder;->sendImageAsyncParamsClass:Ljava/lang/Class;

    .line 86
    .line 87
    if-eqz v3, :cond_5

    .line 88
    .line 89
    iget-object v3, v1, Lh/Hchat/dexkit/DexFinder;->sendImageCrossParamsClass:Ljava/lang/Class;

    .line 90
    .line 91
    if-eqz v3, :cond_5

    .line 92
    .line 93
    iget-object v3, v1, Lh/Hchat/dexkit/DexFinder;->sendImageAppInfoClass:Ljava/lang/Class;

    .line 94
    .line 95
    if-eqz v3, :cond_5

    .line 96
    .line 97
    iget-object v3, v1, Lh/Hchat/dexkit/DexFinder;->sendImageAsyncSubmitMethod:Ljava/lang/reflect/Method;

    .line 98
    .line 99
    if-eqz v3, :cond_5

    .line 100
    .line 101
    move v3, v4

    .line 102
    goto :goto_1

    .line 103
    :cond_5
    move v3, v2

    .line 104
    :goto_1
    if-eqz v3, :cond_7

    .line 105
    .line 106
    invoke-virtual {p0, p1, p2, p3}, Lj8/n;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    if-eqz v3, :cond_6

    .line 111
    .line 112
    return v4

    .line 113
    :cond_6
    const-string v3, "\u65b0\u7248\u56fe\u7247appid\u94fe\u8def\u5931\u8d25\uff0c\u56de\u9000\u77ed\u7b7e\u540d"

    .line 114
    .line 115
    invoke-virtual {p0, v3}, Lj8/n;->k(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 116
    .line 117
    .line 118
    goto :goto_2

    .line 119
    :catchall_0
    move-exception v0

    .line 120
    move-object p1, v0

    .line 121
    move-object v5, p0

    .line 122
    goto :goto_5

    .line 123
    :cond_7
    :goto_2
    :try_start_2
    iget-object v6, v1, Lh/Hchat/dexkit/DexFinder;->sendImageMethod:Ljava/lang/reflect/Method;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 124
    .line 125
    if-nez v6, :cond_8

    .line 126
    .line 127
    :try_start_3
    const-string p1, "\u53d1\u9001\u56fe\u7247\u5931\u8d25: \u77ed\u7b7e\u540dAPI\u672a\u5c31\u7eea"

    .line 128
    .line 129
    invoke-virtual {p0, p1}, Lj8/n;->k(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 130
    .line 131
    .line 132
    return v2

    .line 133
    :cond_8
    :try_start_4
    invoke-static {v6}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Method;)Z

    .line 134
    .line 135
    .line 136
    move-result v3

    .line 137
    if-eqz v3, :cond_9

    .line 138
    .line 139
    const/4 v1, 0x0

    .line 140
    goto :goto_3

    .line 141
    :cond_9
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    move-result-object v3

    .line 145
    invoke-static {v1, v3}, Lig/a;->A(Lh/Hchat/dexkit/DexFinder;Ljava/lang/Class;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    if-eqz v1, :cond_a

    .line 150
    .line 151
    goto :goto_3

    .line 152
    :cond_a
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    invoke-virtual {p0, v1}, Lj8/n;->n(Ljava/lang/Class;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    :goto_3
    invoke-static {v6}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Method;)Z

    .line 161
    .line 162
    .line 163
    move-result v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 164
    if-nez v3, :cond_b

    .line 165
    .line 166
    if-nez v1, :cond_b

    .line 167
    .line 168
    :try_start_5
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    invoke-virtual {p0, p1}, Lj8/n;->k(Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 181
    .line 182
    .line 183
    return v2

    .line 184
    :cond_b
    move-object v5, p0

    .line 185
    move-object v7, p1

    .line 186
    move-object v8, p2

    .line 187
    move-object v9, p3

    .line 188
    move v10, p4

    .line 189
    :try_start_6
    invoke-virtual/range {v5 .. v10}, Lj8/n;->a(Ljava/lang/reflect/Method;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)[Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    invoke-static {v6, v1, p1}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 194
    .line 195
    .line 196
    return v4

    .line 197
    :catchall_1
    move-exception v0

    .line 198
    :goto_4
    move-object p1, v0

    .line 199
    goto :goto_5

    .line 200
    :catchall_2
    move-exception v0

    .line 201
    move-object v5, p0

    .line 202
    goto :goto_4

    .line 203
    :goto_5
    new-instance p2, Ljava/lang/StringBuilder;

    .line 204
    .line 205
    const-string p3, "\u53d1\u9001\u56fe\u7247\u5f02\u5e38: "

    .line 206
    .line 207
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object p1

    .line 221
    invoke-virtual {p0, p1}, Lj8/n;->k(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    return v2

    .line 225
    :goto_6
    const-string p1, "\u53d1\u9001\u56fe\u7247\u5931\u8d25: talker/imagePath\u4e3a\u7a7a"

    .line 226
    .line 227
    invoke-virtual {p0, p1}, Lj8/n;->k(Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    return v2
.end method

.method public final s()Z
    .locals 9

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    iget-object v1, p0, Lj8/n;->a:Landroid/content/Context;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    :try_start_0
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->version()Lo8/k;

    .line 7
    .line 8
    .line 9
    move-result-object v3

    .line 10
    if-eqz v3, :cond_0

    .line 11
    .line 12
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->version()Lo8/k;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    invoke-virtual {v3}, Lo8/k;->b()Ll8/i;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    iget-object v3, v3, Ll8/i;->d:Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 23
    .line 24
    .line 25
    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    if-nez v4, :cond_0

    .line 27
    .line 28
    :goto_0
    move-object v0, v3

    .line 29
    goto :goto_1

    .line 30
    :catchall_0
    :cond_0
    :try_start_1
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-virtual {v3, v4, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    if-eqz v3, :cond_1

    .line 43
    .line 44
    iget-object v3, v3, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 45
    .line 46
    if-eqz v3, :cond_1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :catchall_1
    :cond_1
    :goto_1
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    const/4 v4, 0x1

    .line 54
    if-eqz v3, :cond_2

    .line 55
    .line 56
    goto :goto_6

    .line 57
    :cond_2
    const-string v3, "\\."

    .line 58
    .line 59
    invoke-virtual {v0, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    const/16 v3, 0x8

    .line 64
    .line 65
    const/16 v5, 0x42

    .line 66
    .line 67
    filled-new-array {v3, v2, v5}, [I

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    move v5, v2

    .line 72
    :goto_2
    const/4 v6, 0x3

    .line 73
    if-ge v5, v6, :cond_d

    .line 74
    .line 75
    array-length v6, v0

    .line 76
    if-ge v5, v6, :cond_6

    .line 77
    .line 78
    aget-object v6, v0, v5

    .line 79
    .line 80
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 81
    .line 82
    .line 83
    move-result v7

    .line 84
    if-eqz v7, :cond_3

    .line 85
    .line 86
    goto :goto_4

    .line 87
    :cond_3
    move v7, v2

    .line 88
    :goto_3
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 89
    .line 90
    .line 91
    move-result v8

    .line 92
    if-ge v7, v8, :cond_4

    .line 93
    .line 94
    invoke-virtual {v6, v7}, Ljava/lang/String;->charAt(I)C

    .line 95
    .line 96
    .line 97
    move-result v8

    .line 98
    invoke-static {v8}, Ljava/lang/Character;->isDigit(C)Z

    .line 99
    .line 100
    .line 101
    move-result v8

    .line 102
    if-eqz v8, :cond_4

    .line 103
    .line 104
    add-int/lit8 v7, v7, 0x1

    .line 105
    .line 106
    goto :goto_3

    .line 107
    :cond_4
    if-nez v7, :cond_5

    .line 108
    .line 109
    goto :goto_4

    .line 110
    :cond_5
    :try_start_2
    invoke-virtual {v6, v2, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v6

    .line 114
    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 115
    .line 116
    .line 117
    move-result v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 118
    goto :goto_5

    .line 119
    :catchall_2
    :cond_6
    :goto_4
    move v6, v2

    .line 120
    :goto_5
    aget v7, v3, v5

    .line 121
    .line 122
    if-le v6, v7, :cond_7

    .line 123
    .line 124
    goto :goto_8

    .line 125
    :cond_7
    if-ge v6, v7, :cond_c

    .line 126
    .line 127
    :goto_6
    :try_start_3
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->version()Lo8/k;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    if-eqz v0, :cond_8

    .line 132
    .line 133
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->version()Lo8/k;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    invoke-virtual {v0}, Lo8/k;->b()Ll8/i;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    iget-wide v0, v0, Ll8/i;->a:J
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 142
    .line 143
    goto :goto_7

    .line 144
    :catchall_3
    :cond_8
    const-wide/16 v5, 0x0

    .line 145
    .line 146
    :try_start_4
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    if-nez v0, :cond_9

    .line 159
    .line 160
    :catchall_4
    move-wide v0, v5

    .line 161
    goto :goto_7

    .line 162
    :cond_9
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 163
    .line 164
    const/16 v3, 0x1c

    .line 165
    .line 166
    if-lt v1, v3, :cond_a

    .line 167
    .line 168
    invoke-static {v0}, Lb0/b0;->b(Landroid/content/pm/PackageInfo;)J

    .line 169
    .line 170
    .line 171
    move-result-wide v0

    .line 172
    goto :goto_7

    .line 173
    :cond_a
    iget v0, v0, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 174
    .line 175
    int-to-long v0, v0

    .line 176
    :goto_7
    const-wide/16 v5, 0xba4

    .line 177
    .line 178
    cmp-long v0, v0, v5

    .line 179
    .line 180
    if-ltz v0, :cond_b

    .line 181
    .line 182
    move v2, v4

    .line 183
    :cond_b
    return v2

    .line 184
    :cond_c
    add-int/lit8 v5, v5, 0x1

    .line 185
    .line 186
    goto :goto_2

    .line 187
    :cond_d
    :goto_8
    return v4
.end method
