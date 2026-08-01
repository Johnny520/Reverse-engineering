.class public final Lck1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Lck1;

.field public static final β:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final γ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

.field public static final δ:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public static final ε:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lck1;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lck1;->α:Lck1;

    .line 7
    .line 8
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lck1;->β:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 15
    .line 16
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sput-object v0, Lck1;->γ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 21
    .line 22
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 25
    .line 26
    .line 27
    sput-object v0, Lck1;->δ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 28
    .line 29
    const-string v0, "~7887EB3C8DFF4D5E985E245E27C49A473730FF61BE5736C71358804495460988BC309E79107C904005381417879B5B03919102E2F4DDA294DD2ECA50F1F6BB81A3482872"

    .line 30
    .line 31
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const-string v1, "com.p771ss.android.ugc.aweme.tools.external.hometab.bottom.PublishButton"

    .line 36
    .line 37
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-static {v0}, Lg7;->о([Ljava/lang/Object;)Ljava/util/Set;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, Lck1;->ε:Ljava/util/Set;

    .line 46
    .line 47
    return-void
.end method

.method public static α(Ljava/util/LinkedHashSet;Lorg/luckypray/dexkit/result/ClassDataList;Ljava/lang/ClassLoader;)V
    .locals 10

    .line 1
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_8

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/4 v1, 0x0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    goto/16 :goto_6

    .line 19
    .line 20
    :cond_1
    instance-of v2, v0, Ljava/lang/Class;

    .line 21
    .line 22
    if-eqz v2, :cond_2

    .line 23
    .line 24
    move-object v1, v0

    .line 25
    check-cast v1, Ljava/lang/Class;

    .line 26
    .line 27
    goto/16 :goto_6

    .line 28
    .line 29
    :cond_2
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v2}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    array-length v3, v2

    .line 41
    const/4 v4, 0x0

    .line 42
    move v5, v4

    .line 43
    :goto_1
    const/4 v6, 0x1

    .line 44
    if-ge v5, v3, :cond_4

    .line 45
    .line 46
    aget-object v7, v2, v5

    .line 47
    .line 48
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v8

    .line 52
    const-string v9, "getInstance"

    .line 53
    .line 54
    invoke-static {v8, v9}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v8

    .line 58
    if-eqz v8, :cond_3

    .line 59
    .line 60
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    move-result-object v8

    .line 64
    array-length v8, v8

    .line 65
    if-ne v8, v6, :cond_3

    .line 66
    .line 67
    const-class v8, Ljava/lang/ClassLoader;

    .line 68
    .line 69
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    move-result-object v9

    .line 73
    aget-object v9, v9, v4

    .line 74
    .line 75
    invoke-virtual {v8, v9}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 76
    .line 77
    .line 78
    move-result v8

    .line 79
    if-eqz v8, :cond_3

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :catchall_0
    move-exception v0

    .line 83
    goto :goto_3

    .line 84
    :cond_3
    add-int/lit8 v5, v5, 0x1

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_4
    move-object v7, v1

    .line 88
    :goto_2
    if-nez v7, :cond_5

    .line 89
    .line 90
    goto :goto_6

    .line 91
    :cond_5
    invoke-virtual {v7, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 92
    .line 93
    .line 94
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-virtual {v7, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    instance-of v2, v0, Ljava/lang/Class;

    .line 103
    .line 104
    if-eqz v2, :cond_6

    .line 105
    .line 106
    check-cast v0, Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 107
    .line 108
    goto :goto_4

    .line 109
    :cond_6
    move-object v0, v1

    .line 110
    goto :goto_4

    .line 111
    :goto_3
    new-instance v2, Leo1;

    .line 112
    .line 113
    invoke-direct {v2, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 114
    .line 115
    .line 116
    move-object v0, v2

    .line 117
    :goto_4
    instance-of v2, v0, Leo1;

    .line 118
    .line 119
    if-eqz v2, :cond_7

    .line 120
    .line 121
    goto :goto_5

    .line 122
    :cond_7
    move-object v1, v0

    .line 123
    :goto_5
    check-cast v1, Ljava/lang/Class;

    .line 124
    .line 125
    :goto_6
    if-eqz v1, :cond_0

    .line 126
    .line 127
    invoke-interface {p0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    goto :goto_0

    .line 131
    :cond_8
    return-void
.end method

.method public static β(Ljava/util/LinkedHashSet;Lorg/luckypray/dexkit/result/MethodDataList;Ljava/lang/ClassLoader;)V
    .locals 13

    .line 1
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_a

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/4 v1, 0x0

    .line 16
    if-nez v0, :cond_2

    .line 17
    .line 18
    :cond_1
    move-object v0, v1

    .line 19
    goto/16 :goto_6

    .line 20
    .line 21
    :cond_2
    instance-of v2, v0, Ljava/lang/reflect/Method;

    .line 22
    .line 23
    if-eqz v2, :cond_3

    .line 24
    .line 25
    check-cast v0, Ljava/lang/reflect/Method;

    .line 26
    .line 27
    goto/16 :goto_6

    .line 28
    .line 29
    :cond_3
    const-string v2, "getMethodInstance"

    .line 30
    .line 31
    const-string v3, "getInstance"

    .line 32
    .line 33
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    const/4 v3, 0x0

    .line 38
    move v4, v3

    .line 39
    :goto_1
    const/4 v5, 0x2

    .line 40
    if-ge v4, v5, :cond_1

    .line 41
    .line 42
    aget-object v5, v2, v4

    .line 43
    .line 44
    const/4 v6, 0x1

    .line 45
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    move-result-object v7

    .line 49
    invoke-virtual {v7}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 50
    .line 51
    .line 52
    move-result-object v7

    .line 53
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    array-length v8, v7

    .line 57
    move v9, v3

    .line 58
    :goto_2
    if-ge v9, v8, :cond_5

    .line 59
    .line 60
    aget-object v10, v7, v9

    .line 61
    .line 62
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v11

    .line 66
    invoke-static {v11, v5}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v11

    .line 70
    if-eqz v11, :cond_4

    .line 71
    .line 72
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    move-result-object v11

    .line 76
    array-length v11, v11

    .line 77
    if-ne v11, v6, :cond_4

    .line 78
    .line 79
    const-class v11, Ljava/lang/ClassLoader;

    .line 80
    .line 81
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    move-result-object v12

    .line 85
    aget-object v12, v12, v3

    .line 86
    .line 87
    invoke-virtual {v11, v12}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 88
    .line 89
    .line 90
    move-result v11
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 91
    if-eqz v11, :cond_4

    .line 92
    .line 93
    goto :goto_4

    .line 94
    :catchall_0
    move-exception v5

    .line 95
    goto :goto_3

    .line 96
    :cond_4
    add-int/lit8 v9, v9, 0x1

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_5
    move-object v10, v1

    .line 100
    goto :goto_4

    .line 101
    :goto_3
    new-instance v10, Leo1;

    .line 102
    .line 103
    invoke-direct {v10, v5}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 104
    .line 105
    .line 106
    :goto_4
    instance-of v5, v10, Leo1;

    .line 107
    .line 108
    if-eqz v5, :cond_6

    .line 109
    .line 110
    move-object v10, v1

    .line 111
    :cond_6
    check-cast v10, Ljava/lang/reflect/Method;

    .line 112
    .line 113
    if-eqz v10, :cond_8

    .line 114
    .line 115
    :try_start_1
    invoke-virtual {v10, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 116
    .line 117
    .line 118
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v5

    .line 122
    invoke-virtual {v10, v0, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 126
    goto :goto_5

    .line 127
    :catchall_1
    move-exception v5

    .line 128
    new-instance v7, Leo1;

    .line 129
    .line 130
    invoke-direct {v7, v5}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 131
    .line 132
    .line 133
    move-object v5, v7

    .line 134
    :goto_5
    instance-of v7, v5, Leo1;

    .line 135
    .line 136
    if-eqz v7, :cond_7

    .line 137
    .line 138
    move-object v5, v1

    .line 139
    :cond_7
    instance-of v7, v5, Ljava/lang/reflect/Method;

    .line 140
    .line 141
    if-eqz v7, :cond_8

    .line 142
    .line 143
    move-object v0, v5

    .line 144
    check-cast v0, Ljava/lang/reflect/Method;

    .line 145
    .line 146
    invoke-virtual {v0, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 147
    .line 148
    .line 149
    goto :goto_6

    .line 150
    :cond_8
    add-int/lit8 v4, v4, 0x1

    .line 151
    .line 152
    goto :goto_1

    .line 153
    :goto_6
    if-eqz v0, :cond_9

    .line 154
    .line 155
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    :cond_9
    if-eqz v1, :cond_0

    .line 160
    .line 161
    invoke-interface {p0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    goto/16 :goto_0

    .line 165
    .line 166
    :cond_a
    return-void
.end method

.method public static δ(Ljava/lang/Class;)V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    array-length v3, v2

    .line 11
    move v4, v0

    .line 12
    :goto_0
    if-ge v4, v3, :cond_1

    .line 13
    .line 14
    aget-object v5, v2, v4

    .line 15
    .line 16
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 17
    .line 18
    .line 19
    move-result v6

    .line 20
    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 21
    .line 22
    .line 23
    move-result v6

    .line 24
    if-nez v6, :cond_0

    .line 25
    .line 26
    invoke-virtual {v5, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    .line 29
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    :cond_1
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    array-length v3, v2

    .line 40
    move v4, v0

    .line 41
    :goto_1
    if-ge v4, v3, :cond_2

    .line 42
    .line 43
    aget-object v5, v2, v4

    .line 44
    .line 45
    invoke-virtual {v5, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 46
    .line 47
    .line 48
    add-int/lit8 v4, v4, 0x1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :catchall_1
    :cond_2
    :try_start_2
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    array-length v2, p0

    .line 59
    :goto_2
    if-ge v0, v2, :cond_3

    .line 60
    .line 61
    aget-object v3, p0, v0

    .line 62
    .line 63
    invoke-virtual {v3, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 64
    .line 65
    .line 66
    add-int/lit8 v0, v0, 0x1

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :catchall_2
    :cond_3
    return-void
.end method

.method public static ε(Ljava/lang/Class;)Z
    .locals 1

    .line 1
    invoke-static {p0}, Lck1;->θ(Ljava/lang/Class;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/16 v0, 0xdac

    .line 6
    .line 7
    if-lt p0, v0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public static η(Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 11

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    move-object v2, v1

    .line 21
    check-cast v2, Ljava/lang/Class;

    .line 22
    .line 23
    invoke-static {v2}, Lck1;->ε(Ljava/lang/Class;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    new-instance p1, Ljava/util/HashSet;

    .line 34
    .line 35
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 36
    .line 37
    .line 38
    new-instance v1, Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_3

    .line 52
    .line 53
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    move-object v3, v2

    .line 58
    check-cast v3, Ljava/lang/Class;

    .line 59
    .line 60
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-virtual {p1, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-eqz v3, :cond_2

    .line 69
    .line 70
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_3
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    if-eqz p1, :cond_4

    .line 79
    .line 80
    goto :goto_3

    .line 81
    :cond_4
    :try_start_0
    sget-object p1, Lox;->α:Ljava/lang/Object;

    .line 82
    .line 83
    sget-object p1, Lkx;->ю:Lkx;

    .line 84
    .line 85
    invoke-static {p1, v1}, Lox;->υ(Lkx;Ljava/util/List;)V

    .line 86
    .line 87
    .line 88
    sget-object p1, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :catchall_0
    move-exception v0

    .line 92
    move-object p1, v0

    .line 93
    new-instance v0, Leo1;

    .line 94
    .line 95
    invoke-direct {v0, p1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 96
    .line 97
    .line 98
    move-object p1, v0

    .line 99
    :goto_2
    invoke-static {p1}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    const/4 v8, 0x4

    .line 104
    const-string v9, "recea7c01f66b9d4e"

    .line 105
    .line 106
    const/4 v10, 0x0

    .line 107
    if-eqz v0, :cond_5

    .line 108
    .line 109
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    const-string v2, "\u4fdd\u5b58 PublishButton \u7f13\u5b58\u5931\u8d25: "

    .line 114
    .line 115
    invoke-static {v2, v0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-static {v9, v0, v10, v8, v10}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    :cond_5
    instance-of v0, p1, Leo1;

    .line 123
    .line 124
    if-nez v0, :cond_6

    .line 125
    .line 126
    check-cast p1, Ls62;

    .line 127
    .line 128
    new-instance v6, Lli1;

    .line 129
    .line 130
    const/16 p1, 0xb

    .line 131
    .line 132
    invoke-direct {v6, p1}, Lli1;-><init>(I)V

    .line 133
    .line 134
    .line 135
    const/16 v7, 0x1f

    .line 136
    .line 137
    const/4 v2, 0x0

    .line 138
    const/4 v3, 0x0

    .line 139
    const/4 v4, 0x0

    .line 140
    const/4 v5, 0x0

    .line 141
    invoke-static/range {v1 .. v7}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    const-string v0, "\u4fdd\u5b58 PublishButton \u7f13\u5b58\u6210\u529f reason="

    .line 146
    .line 147
    const-string v1, " classes="

    .line 148
    .line 149
    invoke-static {v0, p0, v1, p1}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    invoke-static {v9, p0, v10, v8, v10}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    :cond_6
    :goto_3
    return-void
.end method

.method public static θ(Ljava/lang/Class;)I
    .locals 10

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    sget-object v2, Lck1;->ε:Ljava/util/Set;

    .line 10
    .line 11
    invoke-interface {v2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, 0x0

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    const/16 v2, 0x2710

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v2, v3

    .line 22
    :goto_0
    const-string v4, ".tools.external.hometab.bottom.PublishButton"

    .line 23
    .line 24
    invoke-static {v0, v4, v3}, Lx02;->Ι(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    if-eqz v4, :cond_1

    .line 29
    .line 30
    add-int/lit16 v2, v2, 0x1f40

    .line 31
    .line 32
    :cond_1
    const-string v4, "PublishButton"

    .line 33
    .line 34
    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_2

    .line 39
    .line 40
    add-int/lit16 v2, v2, 0x1770

    .line 41
    .line 42
    :cond_2
    const-string v1, "hometab.bottom"

    .line 43
    .line 44
    const/4 v4, 0x1

    .line 45
    invoke-static {v0, v1, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_3

    .line 50
    .line 51
    add-int/lit16 v2, v2, 0x7d0

    .line 52
    .line 53
    :cond_3
    const-class v0, Landroid/view/View;

    .line 54
    .line 55
    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-eqz v1, :cond_4

    .line 60
    .line 61
    add-int/lit16 v2, v2, 0xbb8

    .line 62
    .line 63
    :cond_4
    const-class v1, Landroid/view/ViewGroup;

    .line 64
    .line 65
    invoke-virtual {v1, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-eqz v1, :cond_5

    .line 70
    .line 71
    add-int/lit16 v2, v2, 0x320

    .line 72
    .line 73
    :cond_5
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    array-length v5, v1

    .line 81
    move v6, v3

    .line 82
    :goto_1
    if-ge v6, v5, :cond_a

    .line 83
    .line 84
    aget-object v7, v1, v6

    .line 85
    .line 86
    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    move-result-object v7

    .line 90
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    const-string v8, "~79380C0D9D92A341B10DD9D9D717B3F6D9BECA2C1FC1CA5E3D5453A5C175BACF5588D47D8EC6D23A9B847F"

    .line 95
    .line 96
    invoke-static {v8}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v8

    .line 100
    invoke-virtual {v7, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v8

    .line 104
    if-eqz v8, :cond_6

    .line 105
    .line 106
    add-int/lit16 v2, v2, 0x4b0

    .line 107
    .line 108
    :cond_6
    const-string v8, "~7954D7E14DB7341B6A011C494738772667DB63664E455DD5DA5CE999999CB4FFD39B60A13EE96CCFBB8D744843102723"

    .line 109
    .line 110
    invoke-static {v8}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v8

    .line 114
    invoke-virtual {v7, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v8

    .line 118
    if-eqz v8, :cond_7

    .line 119
    .line 120
    add-int/lit16 v2, v2, 0x4b0

    .line 121
    .line 122
    :cond_7
    const-string v8, "SmartImageView"

    .line 123
    .line 124
    invoke-static {v7, v8, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 125
    .line 126
    .line 127
    move-result v8

    .line 128
    if-eqz v8, :cond_8

    .line 129
    .line 130
    add-int/lit16 v2, v2, 0x258

    .line 131
    .line 132
    :cond_8
    const-string v8, "RemoteImageView"

    .line 133
    .line 134
    invoke-static {v7, v8, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 135
    .line 136
    .line 137
    move-result v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 138
    if-eqz v7, :cond_9

    .line 139
    .line 140
    add-int/lit16 v2, v2, 0x258

    .line 141
    .line 142
    :cond_9
    add-int/lit8 v6, v6, 0x1

    .line 143
    .line 144
    goto :goto_1

    .line 145
    :catchall_0
    :cond_a
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    array-length v5, v1

    .line 153
    move v6, v3

    .line 154
    :goto_2
    if-ge v6, v5, :cond_e

    .line 155
    .line 156
    aget-object v7, v1, v6

    .line 157
    .line 158
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    move-result-object v8

    .line 162
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v8

    .line 166
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    move-result-object v9

    .line 170
    invoke-virtual {v0, v9}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 171
    .line 172
    .line 173
    move-result v9

    .line 174
    if-eqz v9, :cond_b

    .line 175
    .line 176
    add-int/lit16 v2, v2, 0x12c

    .line 177
    .line 178
    :cond_b
    const-string v9, "~7974716F46EDCCC8AB71015994E08EBF7057E4892C51F22F56E23528BEF6A6D8F4365635F06E153F85F13F9DE7EF43D63D4510CB1F3C75A3"

    .line 179
    .line 180
    invoke-static {v9}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v9

    .line 184
    invoke-virtual {v8, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    move-result v8

    .line 188
    if-eqz v8, :cond_c

    .line 189
    .line 190
    add-int/lit16 v2, v2, 0x320

    .line 191
    .line 192
    :cond_c
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    move-result-object v8

    .line 196
    array-length v8, v8

    .line 197
    if-ne v8, v4, :cond_d

    .line 198
    .line 199
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    move-result-object v7

    .line 203
    aget-object v7, v7, v3

    .line 204
    .line 205
    sget-object v8, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 206
    .line 207
    invoke-static {v7, v8}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    move-result v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 211
    if-eqz v7, :cond_d

    .line 212
    .line 213
    add-int/lit16 v2, v2, 0xc8

    .line 214
    .line 215
    :cond_d
    add-int/lit8 v6, v6, 0x1

    .line 216
    .line 217
    goto :goto_2

    .line 218
    :catchall_1
    :cond_e
    :try_start_2
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    .line 219
    .line 220
    .line 221
    move-result-object p0

    .line 222
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    array-length v0, p0

    .line 226
    move v1, v3

    .line 227
    :goto_3
    if-ge v1, v0, :cond_11

    .line 228
    .line 229
    aget-object v4, p0, v1

    .line 230
    .line 231
    invoke-virtual {v4}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 232
    .line 233
    .line 234
    move-result-object v4

    .line 235
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    array-length v5, v4

    .line 239
    move v6, v3

    .line 240
    :goto_4
    if-ge v6, v5, :cond_10

    .line 241
    .line 242
    aget-object v7, v4, v6

    .line 243
    .line 244
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v7

    .line 248
    const-string v8, "android.content.Context"

    .line 249
    .line 250
    invoke-virtual {v7, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    move-result v7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 254
    if-eqz v7, :cond_f

    .line 255
    .line 256
    add-int/lit16 v2, v2, 0x1f4

    .line 257
    .line 258
    goto :goto_5

    .line 259
    :cond_f
    add-int/lit8 v6, v6, 0x1

    .line 260
    .line 261
    goto :goto_4

    .line 262
    :cond_10
    :goto_5
    add-int/lit8 v1, v1, 0x1

    .line 263
    .line 264
    goto :goto_3

    .line 265
    :catchall_2
    :cond_11
    return v2
.end method


# virtual methods
.method public final γ(Ljava/lang/ClassLoader;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-virtual {p0, p1, v0}, Lck1;->ζ(Ljava/lang/ClassLoader;Z)Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_2

    .line 18
    .line 19
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    check-cast p1, Ljava/lang/Class;

    .line 24
    .line 25
    sget-object v0, Lck1;->γ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    sget-object v0, Lck1;->δ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_0

    .line 45
    .line 46
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    check-cast v1, La80;

    .line 51
    .line 52
    :try_start_0
    invoke-interface {v1, p1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    sget-object v1, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :catchall_0
    move-exception v1

    .line 59
    new-instance v2, Leo1;

    .line 60
    .line 61
    invoke-direct {v2, v1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 62
    .line 63
    .line 64
    move-object v1, v2

    .line 65
    :goto_1
    invoke-static {v1}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    if-eqz v1, :cond_1

    .line 70
    .line 71
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    const-string v2, "notifyResolved failed: "

    .line 76
    .line 77
    invoke-static {v2, v1}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    const/4 v2, 0x4

    .line 82
    const-string v3, "recea7c01f66b9d4e"

    .line 83
    .line 84
    const/4 v4, 0x0

    .line 85
    invoke-static {v3, v1, v4, v2, v4}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_2
    return-void
.end method

.method public final ζ(Ljava/lang/ClassLoader;Z)Ljava/util/ArrayList;
    .locals 15

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    sget-object v0, Lox;->α:Ljava/lang/Object;

    .line 4
    .line 5
    sget-object v2, Lkx;->ю:Lkx;

    .line 6
    .line 7
    invoke-static {v2, v1}, Lox;->π(Lkx;Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sget-object v3, Lck1;->γ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 12
    .line 13
    if-eqz v0, :cond_6

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    if-eqz v4, :cond_0

    .line 20
    .line 21
    goto :goto_3

    .line 22
    :cond_0
    new-instance p0, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    move-object v2, v1

    .line 42
    check-cast v2, Ljava/lang/Class;

    .line 43
    .line 44
    invoke-static {v2}, Lck1;->ε(Ljava/lang/Class;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_1

    .line 49
    .line 50
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    new-instance v0, Ljava/util/HashSet;

    .line 55
    .line 56
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 57
    .line 58
    .line 59
    new-instance v1, Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    :cond_3
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    if-eqz v2, :cond_4

    .line 73
    .line 74
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    move-object v4, v2

    .line 79
    check-cast v4, Ljava/lang/Class;

    .line 80
    .line 81
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    invoke-virtual {v0, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    if-eqz v4, :cond_3

    .line 90
    .line 91
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_4
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-eqz v0, :cond_5

    .line 104
    .line 105
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    check-cast v0, Ljava/lang/Class;

    .line 110
    .line 111
    invoke-static {v0}, Lck1;->δ(Ljava/lang/Class;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-virtual {v3, v0}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_5
    return-object v1

    .line 123
    :cond_6
    :goto_3
    sget-object v0, Lck1;->ε:Ljava/util/Set;

    .line 124
    .line 125
    check-cast v0, Ljava/lang/Iterable;

    .line 126
    .line 127
    new-instance v4, Ljava/util/ArrayList;

    .line 128
    .line 129
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 130
    .line 131
    .line 132
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 133
    .line 134
    .line 135
    move-result-object v5

    .line 136
    :cond_7
    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    const/4 v6, 0x0

    .line 141
    if-eqz v0, :cond_9

    .line 142
    .line 143
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    check-cast v0, Ljava/lang/String;

    .line 148
    .line 149
    const/4 v7, 0x0

    .line 150
    :try_start_0
    invoke-static {v0, v7, v1}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 154
    goto :goto_5

    .line 155
    :catchall_0
    move-exception v0

    .line 156
    new-instance v7, Leo1;

    .line 157
    .line 158
    invoke-direct {v7, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 159
    .line 160
    .line 161
    move-object v0, v7

    .line 162
    :goto_5
    instance-of v7, v0, Leo1;

    .line 163
    .line 164
    if-eqz v7, :cond_8

    .line 165
    .line 166
    goto :goto_6

    .line 167
    :cond_8
    move-object v6, v0

    .line 168
    :goto_6
    check-cast v6, Ljava/lang/Class;

    .line 169
    .line 170
    if-eqz v6, :cond_7

    .line 171
    .line 172
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    goto :goto_4

    .line 176
    :cond_9
    new-instance v0, Ljava/util/ArrayList;

    .line 177
    .line 178
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 182
    .line 183
    .line 184
    move-result-object v4

    .line 185
    :cond_a
    :goto_7
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 186
    .line 187
    .line 188
    move-result v5

    .line 189
    if-eqz v5, :cond_b

    .line 190
    .line 191
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v5

    .line 195
    move-object v7, v5

    .line 196
    check-cast v7, Ljava/lang/Class;

    .line 197
    .line 198
    invoke-static {v7}, Lck1;->ε(Ljava/lang/Class;)Z

    .line 199
    .line 200
    .line 201
    move-result v7

    .line 202
    if-eqz v7, :cond_a

    .line 203
    .line 204
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    goto :goto_7

    .line 208
    :cond_b
    new-instance v4, Ljava/util/HashSet;

    .line 209
    .line 210
    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 211
    .line 212
    .line 213
    new-instance v5, Ljava/util/ArrayList;

    .line 214
    .line 215
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    :cond_c
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 223
    .line 224
    .line 225
    move-result v7

    .line 226
    if-eqz v7, :cond_d

    .line 227
    .line 228
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v7

    .line 232
    move-object v8, v7

    .line 233
    check-cast v8, Ljava/lang/Class;

    .line 234
    .line 235
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v8

    .line 239
    invoke-virtual {v4, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    move-result v8

    .line 243
    if-eqz v8, :cond_c

    .line 244
    .line 245
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    goto :goto_8

    .line 249
    :cond_d
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 254
    .line 255
    .line 256
    move-result v4

    .line 257
    if-eqz v4, :cond_e

    .line 258
    .line 259
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v4

    .line 263
    check-cast v4, Ljava/lang/Class;

    .line 264
    .line 265
    invoke-static {v4}, Lck1;->δ(Ljava/lang/Class;)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v4

    .line 272
    invoke-virtual {v3, v4}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 273
    .line 274
    .line 275
    goto :goto_9

    .line 276
    :cond_e
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 277
    .line 278
    .line 279
    move-result v0

    .line 280
    if-nez v0, :cond_f

    .line 281
    .line 282
    const-string v0, "reflection_fallback"

    .line 283
    .line 284
    invoke-static {v0, v5}, Lck1;->η(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 285
    .line 286
    .line 287
    :cond_f
    if-nez p2, :cond_10

    .line 288
    .line 289
    goto :goto_a

    .line 290
    :cond_10
    sget-object v0, Lox;->ι:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 291
    .line 292
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 293
    .line 294
    .line 295
    move-result v0

    .line 296
    if-nez v0, :cond_11

    .line 297
    .line 298
    :goto_a
    return-object v5

    .line 299
    :cond_11
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 304
    .line 305
    .line 306
    move-result-object v4

    .line 307
    invoke-static {v0, v4}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 308
    .line 309
    .line 310
    move-result v0

    .line 311
    const/4 v4, 0x4

    .line 312
    const-string v7, "recea7c01f66b9d4e"

    .line 313
    .line 314
    if-eqz v0, :cond_12

    .line 315
    .line 316
    const-string p0, "\u4e3b\u7ebf\u7a0b\u4e0d\u6267\u884c DexKit \u626b\u63cf\uff0c\u4f7f\u7528 reflection fallback"

    .line 317
    .line 318
    invoke-static {v7, p0, v6, v4, v6}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 319
    .line 320
    .line 321
    return-object v5

    .line 322
    :cond_12
    :try_start_1
    new-instance v0, Lm3;

    .line 323
    .line 324
    const/16 v8, 0x8

    .line 325
    .line 326
    invoke-direct {v0, v5, p0, v1, v8}, Lm3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 327
    .line 328
    .line 329
    const-string p0, "\u5b9a\u4f4d\u5e95\u680f\u53d1\u5e03\u6309\u94ae"

    .line 330
    .line 331
    invoke-static {v2, v1, p0, v0}, Lox;->ι(Lkx;Ljava/lang/ClassLoader;Ljava/lang/String;La80;)Ljava/util/List;

    .line 332
    .line 333
    .line 334
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 335
    goto :goto_b

    .line 336
    :catchall_1
    move-exception v0

    .line 337
    move-object p0, v0

    .line 338
    new-instance v0, Leo1;

    .line 339
    .line 340
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 341
    .line 342
    .line 343
    move-object p0, v0

    .line 344
    :goto_b
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    if-eqz v0, :cond_13

    .line 349
    .line 350
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    const-string v1, "DexKit resolve PublishButton failed: "

    .line 355
    .line 356
    invoke-static {v1, v0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    invoke-static {v7, v0, v6, v4, v6}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 361
    .line 362
    .line 363
    :cond_13
    instance-of v0, p0, Leo1;

    .line 364
    .line 365
    if-eqz v0, :cond_14

    .line 366
    .line 367
    move-object p0, v6

    .line 368
    :cond_14
    check-cast p0, Ljava/util/List;

    .line 369
    .line 370
    if-nez p0, :cond_15

    .line 371
    .line 372
    sget-object p0, Ljz;->ε:Ljz;

    .line 373
    .line 374
    :cond_15
    invoke-static {p0, v5}, Lxh;->Х(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 375
    .line 376
    .line 377
    move-result-object p0

    .line 378
    new-instance v0, Ljava/util/ArrayList;

    .line 379
    .line 380
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 381
    .line 382
    .line 383
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 384
    .line 385
    .line 386
    move-result-object p0

    .line 387
    :cond_16
    :goto_c
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 388
    .line 389
    .line 390
    move-result v1

    .line 391
    if-eqz v1, :cond_17

    .line 392
    .line 393
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object v1

    .line 397
    move-object v2, v1

    .line 398
    check-cast v2, Ljava/lang/Class;

    .line 399
    .line 400
    invoke-static {v2}, Lck1;->ε(Ljava/lang/Class;)Z

    .line 401
    .line 402
    .line 403
    move-result v2

    .line 404
    if-eqz v2, :cond_16

    .line 405
    .line 406
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 407
    .line 408
    .line 409
    goto :goto_c

    .line 410
    :cond_17
    new-instance p0, Lib1;

    .line 411
    .line 412
    const/16 v1, 0x18

    .line 413
    .line 414
    invoke-direct {p0, v1}, Lib1;-><init>(I)V

    .line 415
    .line 416
    .line 417
    invoke-static {v0, p0}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 418
    .line 419
    .line 420
    move-result-object p0

    .line 421
    new-instance v0, Ljava/util/HashSet;

    .line 422
    .line 423
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 424
    .line 425
    .line 426
    new-instance v8, Ljava/util/ArrayList;

    .line 427
    .line 428
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 429
    .line 430
    .line 431
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 432
    .line 433
    .line 434
    move-result-object p0

    .line 435
    :cond_18
    :goto_d
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 436
    .line 437
    .line 438
    move-result v1

    .line 439
    if-eqz v1, :cond_19

    .line 440
    .line 441
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 442
    .line 443
    .line 444
    move-result-object v1

    .line 445
    move-object v2, v1

    .line 446
    check-cast v2, Ljava/lang/Class;

    .line 447
    .line 448
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 449
    .line 450
    .line 451
    move-result-object v2

    .line 452
    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 453
    .line 454
    .line 455
    move-result v2

    .line 456
    if-eqz v2, :cond_18

    .line 457
    .line 458
    invoke-virtual {v8, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 459
    .line 460
    .line 461
    goto :goto_d

    .line 462
    :cond_19
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 463
    .line 464
    .line 465
    move-result-object p0

    .line 466
    :goto_e
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 467
    .line 468
    .line 469
    move-result v0

    .line 470
    if-eqz v0, :cond_1a

    .line 471
    .line 472
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 473
    .line 474
    .line 475
    move-result-object v0

    .line 476
    check-cast v0, Ljava/lang/Class;

    .line 477
    .line 478
    invoke-static {v0}, Lck1;->δ(Ljava/lang/Class;)V

    .line 479
    .line 480
    .line 481
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 482
    .line 483
    .line 484
    move-result-object v0

    .line 485
    invoke-virtual {v3, v0}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 486
    .line 487
    .line 488
    goto :goto_e

    .line 489
    :cond_1a
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 490
    .line 491
    .line 492
    move-result p0

    .line 493
    if-eqz p0, :cond_1b

    .line 494
    .line 495
    const-string p0, "PublishButton \u672a\u5b9a\u4f4d"

    .line 496
    .line 497
    invoke-static {v7, p0, v6, v4, v6}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 498
    .line 499
    .line 500
    goto :goto_f

    .line 501
    :cond_1b
    const-string p0, "final_result"

    .line 502
    .line 503
    invoke-static {p0, v8}, Lck1;->η(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 504
    .line 505
    .line 506
    new-instance v13, Lli1;

    .line 507
    .line 508
    const/16 p0, 0xa

    .line 509
    .line 510
    invoke-direct {v13, p0}, Lli1;-><init>(I)V

    .line 511
    .line 512
    .line 513
    const/16 v14, 0x1f

    .line 514
    .line 515
    const/4 v9, 0x0

    .line 516
    const/4 v10, 0x0

    .line 517
    const/4 v11, 0x0

    .line 518
    const/4 v12, 0x0

    .line 519
    invoke-static/range {v8 .. v14}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 520
    .line 521
    .line 522
    move-result-object p0

    .line 523
    const-string v0, "PublishButton \u5b9a\u4f4d\u6210\u529f: "

    .line 524
    .line 525
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 526
    .line 527
    .line 528
    move-result-object p0

    .line 529
    invoke-static {v7, p0, v6, v4, v6}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 530
    .line 531
    .line 532
    :goto_f
    return-object v8
.end method
