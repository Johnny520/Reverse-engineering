.class public final Lp8/j;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Lp8/j;

.field public static final b:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final c:Ljava/util/Set;

.field public static final d:Ljava/util/Map;

.field public static final e:Ljava/util/concurrent/ConcurrentHashMap;

.field public static volatile f:Lp8/o;

.field public static volatile g:Lgg/j;

.field public static volatile h:Ljava/lang/ref/WeakReference;

.field public static volatile i:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lp8/j;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lp8/j;->a:Lp8/j;

    .line 7
    .line 8
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lp8/j;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 14
    .line 15
    invoke-static {}, Lj8/b;->o()Ljava/util/Set;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, Lp8/j;->c:Ljava/util/Set;

    .line 20
    .line 21
    invoke-static {}, Lp/a;->p()Ljava/util/Map;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Lp8/j;->d:Ljava/util/Map;

    .line 26
    .line 27
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 28
    .line 29
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 30
    .line 31
    .line 32
    sput-object v0, Lp8/j;->e:Ljava/util/concurrent/ConcurrentHashMap;

    .line 33
    .line 34
    return-void
.end method

.method public static a()Landroid/app/Activity;
    .locals 3

    .line 1
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->currentActivity()Lq8/o;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Lq8/o;->a()Landroid/app/Activity;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v0, v1

    .line 14
    :goto_0
    if-eqz v0, :cond_1

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_1
    move-object v0, v1

    .line 18
    :goto_1
    if-eqz v0, :cond_4

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-nez v2, :cond_3

    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_2

    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_2
    const/4 v2, 0x0

    .line 34
    goto :goto_3

    .line 35
    :cond_3
    :goto_2
    const/4 v2, 0x1

    .line 36
    :goto_3
    if-nez v2, :cond_4

    .line 37
    .line 38
    return-object v0

    .line 39
    :cond_4
    return-object v1
.end method

.method public static b(ILjava/lang/Object;)Landroid/view/MenuItem;
    .locals 1

    .line 1
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-string v0, "findItem"

    .line 10
    .line 11
    invoke-static {p1, v0, p0}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    instance-of p1, p0, Landroid/view/MenuItem;

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    check-cast p0, Landroid/view/MenuItem;

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return-object p0
.end method

.method public static c(Ljava/lang/reflect/Method;Lde/robv/android/xposed/XC_MethodHook;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_5

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/Class;->isInterface()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    goto :goto_3

    .line 22
    :cond_0
    sget-object v0, Lp8/j;->c:Ljava/util/Set;

    .line 23
    .line 24
    invoke-interface {v0, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    const/4 p0, 0x1

    .line 31
    return p0

    .line 32
    :cond_1
    :try_start_0
    sget-object v0, Lr8/i;->b:Lr8/i;

    .line 33
    .line 34
    invoke-static {p0}, Lh/Hchat/utils/KavaReflector;->accessible(Ljava/lang/reflect/Method;)Ljava/lang/reflect/Method;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    if-eqz v1, :cond_2

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    move-object v1, p0

    .line 42
    :goto_0
    invoke-virtual {v0, v1, p1}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 43
    .line 44
    .line 45
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :catchall_0
    move-exception p1

    .line 49
    new-instance v0, Lsf/f;

    .line 50
    .line 51
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    move-object p1, v0

    .line 55
    :goto_1
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    if-nez v0, :cond_3

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_3
    sget-object p1, Lp8/j;->c:Ljava/util/Set;

    .line 63
    .line 64
    invoke-interface {p1, p0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    sget-object p1, Lp8/j;->g:Lgg/j;

    .line 68
    .line 69
    if-eqz p1, :cond_4

    .line 70
    .line 71
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    new-instance v1, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    const-string v2, "\u670b\u53cb\u5708\u5171\u4eab\u83dc\u5355Hook\u5b89\u88c5\u5931\u8d25: "

    .line 78
    .line 79
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-interface {p1, p0, v0}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    :cond_4
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 93
    .line 94
    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    .line 95
    .line 96
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 97
    .line 98
    .line 99
    move-result p0

    .line 100
    return p0

    .line 101
    :cond_5
    :goto_3
    const/4 p0, 0x0

    .line 102
    return p0
.end method

.method public static e(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, ""

    .line 4
    .line 5
    :cond_0
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const/4 v0, 0x2

    .line 14
    new-array v0, v0, [C

    .line 15
    .line 16
    fill-array-data v0, :array_0

    .line 17
    .line 18
    .line 19
    invoke-static {p0, v0}, Log/m;->S0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-lez v0, :cond_1

    .line 28
    .line 29
    const/4 v0, 0x1

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const/4 v0, 0x0

    .line 32
    :goto_0
    const/4 v1, 0x0

    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_2
    move-object p0, v1

    .line 37
    :goto_1
    if-eqz p0, :cond_5

    .line 38
    .line 39
    invoke-static {p0}, Log/t;->g0(Ljava/lang/String;)Ljava/lang/Long;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    if-eqz v0, :cond_3

    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 46
    .line 47
    .line 48
    move-result-wide v0

    .line 49
    invoke-static {v0, v1}, Ljava/lang/Long;->toUnsignedString(J)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0

    .line 54
    :cond_3
    :try_start_0
    invoke-static {p0}, Ljava/lang/Long;->parseUnsignedLong(Ljava/lang/String;)J

    .line 55
    .line 56
    .line 57
    move-result-wide v2

    .line 58
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 59
    .line 60
    .line 61
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    goto :goto_2

    .line 63
    :catchall_0
    move-exception p0

    .line 64
    new-instance v0, Lsf/f;

    .line 65
    .line 66
    invoke-direct {v0, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 67
    .line 68
    .line 69
    move-object p0, v0

    .line 70
    :goto_2
    nop

    .line 71
    instance-of v0, p0, Lsf/f;

    .line 72
    .line 73
    if-eqz v0, :cond_4

    .line 74
    .line 75
    move-object p0, v1

    .line 76
    :cond_4
    check-cast p0, Ljava/lang/Long;

    .line 77
    .line 78
    if-eqz p0, :cond_5

    .line 79
    .line 80
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 81
    .line 82
    .line 83
    move-result-wide v0

    .line 84
    invoke-static {v0, v1}, Ljava/lang/Long;->toUnsignedString(J)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    :cond_5
    return-object v1

    .line 89
    :array_0
    .array-data 2
        0x27s
        0x22s
    .end array-data
.end method

.method public static f(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)Lp8/l;
    .locals 10

    .line 1
    sget-object v0, Lp8/j;->f:Lp8/o;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_16

    .line 5
    .line 6
    iget-object v2, p0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v3, p0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 9
    .line 10
    new-instance v4, Ljava/util/IdentityHashMap;

    .line 11
    .line 12
    invoke-direct {v4}, Ljava/util/IdentityHashMap;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-static {v4}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    const/4 v5, 0x0

    .line 20
    if-eqz v3, :cond_2

    .line 21
    .line 22
    array-length v6, v3

    .line 23
    move v7, v5

    .line 24
    :goto_0
    if-ge v7, v6, :cond_2

    .line 25
    .line 26
    aget-object v8, v3, v7

    .line 27
    .line 28
    instance-of v9, v8, Landroid/view/View;

    .line 29
    .line 30
    if-eqz v9, :cond_0

    .line 31
    .line 32
    check-cast v8, Landroid/view/View;

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    move-object v8, v1

    .line 36
    :goto_1
    if-eqz v8, :cond_1

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_1
    add-int/lit8 v7, v7, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    move-object v8, v1

    .line 43
    :goto_2
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-static {v5, v8, v4}, Lp8/o;->g(ILjava/lang/Object;Ljava/util/Set;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    if-eqz v6, :cond_3

    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_3
    invoke-static {v5, v2, v4}, Lp8/o;->g(ILjava/lang/Object;Ljava/util/Set;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    if-eqz v6, :cond_4

    .line 58
    .line 59
    goto :goto_3

    .line 60
    :cond_4
    invoke-static {v5, v3, v4}, Lp8/o;->g(ILjava/lang/Object;Ljava/util/Set;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    if-eqz v6, :cond_5

    .line 65
    .line 66
    :goto_3
    invoke-virtual {v0, v6}, Lp8/o;->v(Ljava/lang/Object;)Lp8/v;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    goto :goto_4

    .line 71
    :cond_5
    move-object v0, v1

    .line 72
    :goto_4
    if-eqz v0, :cond_16

    .line 73
    .line 74
    iget-object v2, p0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 75
    .line 76
    iget-object v3, p0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 77
    .line 78
    new-instance v4, Ljava/util/IdentityHashMap;

    .line 79
    .line 80
    invoke-direct {v4}, Ljava/util/IdentityHashMap;-><init>()V

    .line 81
    .line 82
    .line 83
    invoke-static {v4}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    if-eqz v3, :cond_8

    .line 88
    .line 89
    array-length v6, v3

    .line 90
    move v7, v5

    .line 91
    :goto_5
    if-ge v7, v6, :cond_8

    .line 92
    .line 93
    aget-object v8, v3, v7

    .line 94
    .line 95
    instance-of v9, v8, Landroid/view/View;

    .line 96
    .line 97
    if-eqz v9, :cond_6

    .line 98
    .line 99
    check-cast v8, Landroid/view/View;

    .line 100
    .line 101
    goto :goto_6

    .line 102
    :cond_6
    move-object v8, v1

    .line 103
    :goto_6
    if-eqz v8, :cond_7

    .line 104
    .line 105
    goto :goto_7

    .line 106
    :cond_7
    add-int/lit8 v7, v7, 0x1

    .line 107
    .line 108
    goto :goto_5

    .line 109
    :cond_8
    move-object v8, v1

    .line 110
    :goto_7
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    invoke-static {v5, v8, v4}, Lp8/o;->f(ILjava/lang/Object;Ljava/util/Set;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v6

    .line 117
    if-eqz v6, :cond_9

    .line 118
    .line 119
    goto :goto_8

    .line 120
    :cond_9
    invoke-static {v5, v2, v4}, Lp8/o;->f(ILjava/lang/Object;Ljava/util/Set;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v6

    .line 124
    if-eqz v6, :cond_a

    .line 125
    .line 126
    goto :goto_8

    .line 127
    :cond_a
    invoke-static {v5, v3, v4}, Lp8/o;->f(ILjava/lang/Object;Ljava/util/Set;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v6

    .line 131
    :goto_8
    if-eqz v6, :cond_d

    .line 132
    .line 133
    const-string v2, "field_snsId"

    .line 134
    .line 135
    invoke-static {v6, v2}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    if-eqz v2, :cond_b

    .line 140
    .line 141
    goto :goto_9

    .line 142
    :cond_b
    const-string v2, "snsId"

    .line 143
    .line 144
    invoke-static {v6, v2}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    :goto_9
    if-eqz v2, :cond_c

    .line 149
    .line 150
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    goto :goto_a

    .line 155
    :cond_c
    move-object v2, v1

    .line 156
    :goto_a
    invoke-static {v2}, Lp8/j;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    goto :goto_b

    .line 161
    :cond_d
    move-object v2, v1

    .line 162
    :goto_b
    iget-object v3, v0, Lp8/v;->a:Ljava/lang/String;

    .line 163
    .line 164
    invoke-static {v3}, Lp8/j;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    if-eqz v6, :cond_e

    .line 169
    .line 170
    if-eqz v3, :cond_e

    .line 171
    .line 172
    invoke-static {v2, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v4

    .line 176
    if-nez v4, :cond_e

    .line 177
    .line 178
    move-object v6, v1

    .line 179
    :cond_e
    if-eqz v3, :cond_f

    .line 180
    .line 181
    move-object v2, v3

    .line 182
    :cond_f
    if-nez v6, :cond_11

    .line 183
    .line 184
    if-eqz v2, :cond_11

    .line 185
    .line 186
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->snsApi()Lp8/d0;

    .line 187
    .line 188
    .line 189
    move-result-object v3

    .line 190
    if-eqz v3, :cond_10

    .line 191
    .line 192
    invoke-virtual {v3, v2}, Lp8/d0;->c(Ljava/lang/String;)Lp8/f;

    .line 193
    .line 194
    .line 195
    move-result-object v3

    .line 196
    iget-object v3, v3, Lp8/f;->b:Ljava/lang/Object;

    .line 197
    .line 198
    move-object v6, v3

    .line 199
    goto :goto_c

    .line 200
    :cond_10
    move-object v6, v1

    .line 201
    :cond_11
    :goto_c
    iget-object p0, p0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 202
    .line 203
    if-eqz p0, :cond_15

    .line 204
    .line 205
    array-length v3, p0

    .line 206
    :goto_d
    if-ge v5, v3, :cond_14

    .line 207
    .line 208
    aget-object v4, p0, v5

    .line 209
    .line 210
    instance-of v7, v4, Landroid/view/View;

    .line 211
    .line 212
    if-eqz v7, :cond_12

    .line 213
    .line 214
    check-cast v4, Landroid/view/View;

    .line 215
    .line 216
    goto :goto_e

    .line 217
    :cond_12
    move-object v4, v1

    .line 218
    :goto_e
    if-eqz v4, :cond_13

    .line 219
    .line 220
    goto :goto_f

    .line 221
    :cond_13
    add-int/lit8 v5, v5, 0x1

    .line 222
    .line 223
    goto :goto_d

    .line 224
    :cond_14
    move-object v4, v1

    .line 225
    :goto_f
    if-eqz v4, :cond_15

    .line 226
    .line 227
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 228
    .line 229
    invoke-direct {v1, v4}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 230
    .line 231
    .line 232
    :cond_15
    new-instance p0, Lp8/l;

    .line 233
    .line 234
    invoke-direct {p0, v2, v0, v6, v1}, Lp8/l;-><init>(Ljava/lang/String;Lp8/v;Ljava/lang/Object;Ljava/lang/ref/WeakReference;)V

    .line 235
    .line 236
    .line 237
    return-object p0

    .line 238
    :cond_16
    return-object v1
.end method


# virtual methods
.method public final declared-synchronized d(Lr8/g;Lp8/o;Lfg/p;)Z
    .locals 6

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    sput-object p2, Lp8/j;->f:Lp8/o;

    .line 9
    .line 10
    move-object p2, p3

    .line 11
    check-cast p2, Lgg/j;

    .line 12
    .line 13
    sput-object p2, Lp8/j;->g:Lgg/j;

    .line 14
    .line 15
    sget-object p2, Lp8/k;->a:Lp8/k;

    .line 16
    .line 17
    invoke-virtual {p2, p1, p3}, Lp8/k;->f(Lr8/g;Lfg/p;)Ljava/util/ArrayList;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/4 v1, 0x0

    .line 26
    const/4 v2, 0x0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    move v0, v2

    .line 30
    goto :goto_1

    .line 31
    :cond_0
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    move v0, v2

    .line 36
    :cond_1
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_3

    .line 41
    .line 42
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    check-cast v3, Ljava/lang/reflect/Method;

    .line 47
    .line 48
    new-instance v4, Lba/f;

    .line 49
    .line 50
    const/16 v5, 0x15

    .line 51
    .line 52
    invoke-direct {v4, v5}, Lba/f;-><init>(I)V

    .line 53
    .line 54
    .line 55
    invoke-static {v3, v4}, Lp8/j;->c(Ljava/lang/reflect/Method;Lde/robv/android/xposed/XC_MethodHook;)Z

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-eqz v3, :cond_1

    .line 60
    .line 61
    add-int/lit8 v0, v0, 0x1

    .line 62
    .line 63
    if-ltz v0, :cond_2

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    invoke-static {}, La/a;->P0()V

    .line 67
    .line 68
    .line 69
    throw v1

    .line 70
    :catchall_0
    move-exception p1

    .line 71
    goto :goto_4

    .line 72
    :cond_3
    :goto_1
    sget-object p2, Lp8/k;->a:Lp8/k;

    .line 73
    .line 74
    invoke-virtual {p2, p1, p3}, Lp8/k;->e(Lr8/g;Lfg/p;)Ljava/util/ArrayList;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 79
    .line 80
    .line 81
    move-result p2

    .line 82
    if-eqz p2, :cond_4

    .line 83
    .line 84
    move p2, v2

    .line 85
    goto :goto_3

    .line 86
    :cond_4
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    move p2, v2

    .line 91
    :cond_5
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    if-eqz v3, :cond_7

    .line 96
    .line 97
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    check-cast v3, Ljava/lang/reflect/Method;

    .line 102
    .line 103
    new-instance v4, Lba/f;

    .line 104
    .line 105
    const/16 v5, 0x14

    .line 106
    .line 107
    invoke-direct {v4, v5}, Lba/f;-><init>(I)V

    .line 108
    .line 109
    .line 110
    invoke-static {v3, v4}, Lp8/j;->c(Ljava/lang/reflect/Method;Lde/robv/android/xposed/XC_MethodHook;)Z

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    if-eqz v3, :cond_5

    .line 115
    .line 116
    add-int/lit8 p2, p2, 0x1

    .line 117
    .line 118
    if-ltz p2, :cond_6

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_6
    invoke-static {}, La/a;->P0()V

    .line 122
    .line 123
    .line 124
    throw v1

    .line 125
    :cond_7
    :goto_3
    if-gtz v0, :cond_8

    .line 126
    .line 127
    const-string p1, "\u670b\u53cb\u5708\u5171\u4eab\u83dc\u5355\u521b\u5efaHook\u672a\u5b89\u88c5"

    .line 128
    .line 129
    invoke-interface {p3, p1, v1}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    :cond_8
    if-gtz p2, :cond_9

    .line 133
    .line 134
    const-string p1, "\u670b\u53cb\u5708\u5171\u4eab\u83dc\u5355\u70b9\u51fbHook\u672a\u5b89\u88c5"

    .line 135
    .line 136
    invoke-interface {p3, p1, v1}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 137
    .line 138
    .line 139
    :cond_9
    if-lez v0, :cond_a

    .line 140
    .line 141
    if-lez p2, :cond_a

    .line 142
    .line 143
    const/4 v2, 0x1

    .line 144
    :cond_a
    monitor-exit p0

    .line 145
    return v2

    .line 146
    :goto_4
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 147
    throw p1
.end method
