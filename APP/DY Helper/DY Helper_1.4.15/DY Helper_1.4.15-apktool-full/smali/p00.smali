.class public final Lp00;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final β:Ljava/util/concurrent/ConcurrentHashMap;


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
    sput-object v0, Lp00;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lp00;->β:Ljava/util/concurrent/ConcurrentHashMap;

    .line 15
    .line 16
    return-void
.end method

.method public static final α(Ljava/lang/reflect/Method;)I
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const/16 v0, 0x12c

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move v0, v1

    .line 16
    :goto_0
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 21
    .line 22
    invoke-static {v2, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    add-int/lit16 v0, v0, 0x12c

    .line 29
    .line 30
    :cond_1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-static {v1, v2}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    check-cast v1, Ljava/lang/Class;

    .line 42
    .line 43
    if-eqz v1, :cond_2

    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    goto :goto_1

    .line 50
    :cond_2
    const/4 v1, 0x0

    .line 51
    :goto_1
    const-string v2, "~7930256E6FA81116F35A8C2AC6E1F26036E68A18C000538406145429DCFD52564510E72B66959BEEBB"

    .line 52
    .line 53
    invoke-static {v2}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-static {v1, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_3

    .line 62
    .line 63
    add-int/lit16 v0, v0, 0x190

    .line 64
    .line 65
    :cond_3
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    const/4 v2, 0x1

    .line 73
    invoke-static {v2, v1}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    const-class v2, Ljava/lang/String;

    .line 78
    .line 79
    invoke-static {v1, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-eqz v1, :cond_4

    .line 84
    .line 85
    add-int/lit16 v0, v0, 0xc8

    .line 86
    .line 87
    :cond_4
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    array-length p0, p0

    .line 96
    const/16 v1, 0xc

    .line 97
    .line 98
    if-gt p0, v1, :cond_5

    .line 99
    .line 100
    add-int/lit8 v0, v0, 0x64

    .line 101
    .line 102
    :cond_5
    return v0
.end method

.method public static β(Ljava/lang/ClassLoader;Z)V
    .locals 3

    .line 1
    sget-object v0, Lox;->α:Ljava/lang/Object;

    .line 2
    .line 3
    sget-object v0, Lkx;->Х:Lkx;

    .line 4
    .line 5
    invoke-static {v0, p0}, Lox;->π(Lkx;Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v1, 0x0

    .line 19
    :goto_0
    if-eqz v1, :cond_1

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    if-eqz p1, :cond_3

    .line 23
    .line 24
    sget-object p1, Lox;->ι:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-nez p1, :cond_2

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_2
    new-instance p1, Lbb;

    .line 34
    .line 35
    const/16 v1, 0x15

    .line 36
    .line 37
    invoke-direct {p1, p0, v1}, Lbb;-><init>(Ljava/lang/ClassLoader;I)V

    .line 38
    .line 39
    .line 40
    const-string v1, "\u5b9a\u4f4d\u957f\u6309\u9762\u677f\u5e7f\u544a\u5224\u65ad\u7c7b"

    .line 41
    .line 42
    invoke-static {v0, p0, v1, p1}, Lox;->ι(Lkx;Ljava/lang/ClassLoader;Ljava/lang/String;La80;)Ljava/util/List;

    .line 43
    .line 44
    .line 45
    :cond_3
    :goto_1
    return-void
.end method

.method public static γ(Ljava/lang/Class;)I
    .locals 10

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    array-length v1, v0

    .line 9
    const/4 v2, 0x0

    .line 10
    move v3, v2

    .line 11
    :goto_0
    if-ge v3, v1, :cond_1

    .line 12
    .line 13
    aget-object v4, v0, v3

    .line 14
    .line 15
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    array-length v5, v5

    .line 20
    const/4 v6, 0x2

    .line 21
    if-ne v5, v6, :cond_0

    .line 22
    .line 23
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    aget-object v5, v5, v2

    .line 28
    .line 29
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    const-string v6, "~7930256E6FA81116F35A8C2AC6E1F26036E68A18C000538406145429DCFD52564510E72B66959BEEBB"

    .line 34
    .line 35
    invoke-static {v6}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    if-eqz v5, :cond_0

    .line 44
    .line 45
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    const/4 v6, 0x1

    .line 50
    aget-object v5, v5, v6

    .line 51
    .line 52
    const-class v6, Ljava/lang/String;

    .line 53
    .line 54
    invoke-static {v5, v6}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    if-eqz v5, :cond_0

    .line 59
    .line 60
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    sget-object v6, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 65
    .line 66
    invoke-static {v5, v6}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    if-eqz v5, :cond_0

    .line 71
    .line 72
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    invoke-static {v4}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    if-eqz v4, :cond_0

    .line 81
    .line 82
    const/16 v0, 0x3e8

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_1
    move v0, v2

    .line 89
    :goto_1
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    array-length v3, v1

    .line 97
    move v4, v2

    .line 98
    :goto_2
    if-ge v4, v3, :cond_4

    .line 99
    .line 100
    aget-object v5, v1, v4

    .line 101
    .line 102
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    array-length v6, v5

    .line 110
    move v7, v2

    .line 111
    :goto_3
    if-ge v7, v6, :cond_3

    .line 112
    .line 113
    aget-object v8, v5, v7

    .line 114
    .line 115
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v8

    .line 119
    const-string v9, "~78B38367CFE852F14F689594842A0085750A11DB0443EB2AFF250DFFBABD94A01BAE8D13E20B0745AD541F739E610490C00DB97E203B7A27453B359A1B6E0ACFDBE2FBAE339F5D0679"

    .line 120
    .line 121
    invoke-static {v9}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v9

    .line 125
    invoke-virtual {v8, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v8

    .line 129
    if-eqz v8, :cond_2

    .line 130
    .line 131
    add-int/lit16 v0, v0, 0xc8

    .line 132
    .line 133
    goto :goto_4

    .line 134
    :cond_2
    add-int/lit8 v7, v7, 0x1

    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_3
    add-int/lit8 v4, v4, 0x1

    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_4
    :goto_4
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    const-string v3, "X."

    .line 145
    .line 146
    invoke-static {v1, v3, v2}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 147
    .line 148
    .line 149
    move-result v1

    .line 150
    if-eqz v1, :cond_5

    .line 151
    .line 152
    add-int/lit8 v0, v0, 0x64

    .line 153
    .line 154
    :cond_5
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    array-length p0, p0

    .line 159
    const/16 v1, 0xc

    .line 160
    .line 161
    if-gt p0, v1, :cond_6

    .line 162
    .line 163
    add-int/lit8 v0, v0, 0x64

    .line 164
    .line 165
    :cond_6
    return v0
.end method

.method public static δ(Lorg/luckypray/dexkit/result/MethodDataList;Ljava/lang/ClassLoader;)Ljava/util/ArrayList;
    .locals 11

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_8

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const/4 v2, 0x0

    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    goto :goto_4

    .line 24
    :cond_1
    :try_start_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-virtual {v3}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    array-length v4, v3

    .line 36
    const/4 v5, 0x0

    .line 37
    move v6, v5

    .line 38
    :goto_1
    const/4 v7, 0x1

    .line 39
    if-ge v6, v4, :cond_3

    .line 40
    .line 41
    aget-object v8, v3, v6

    .line 42
    .line 43
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v9

    .line 47
    const-string v10, "getMethodInstance"

    .line 48
    .line 49
    invoke-static {v9, v10}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v9

    .line 53
    if-eqz v9, :cond_2

    .line 54
    .line 55
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    move-result-object v9

    .line 59
    array-length v9, v9

    .line 60
    if-ne v9, v7, :cond_2

    .line 61
    .line 62
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    move-result-object v9

    .line 66
    aget-object v9, v9, v5

    .line 67
    .line 68
    const-class v10, Ljava/lang/ClassLoader;

    .line 69
    .line 70
    invoke-static {v9, v10}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v9

    .line 74
    if-eqz v9, :cond_2

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :catchall_0
    move-exception v1

    .line 78
    goto :goto_5

    .line 79
    :cond_2
    add-int/lit8 v6, v6, 0x1

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_3
    move-object v8, v2

    .line 83
    :goto_2
    if-nez v8, :cond_4

    .line 84
    .line 85
    goto :goto_4

    .line 86
    :cond_4
    invoke-virtual {v8, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 87
    .line 88
    .line 89
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    invoke-virtual {v8, v1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    instance-of v3, v1, Ljava/lang/reflect/Method;

    .line 98
    .line 99
    if-eqz v3, :cond_5

    .line 100
    .line 101
    check-cast v1, Ljava/lang/reflect/Method;

    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_5
    move-object v1, v2

    .line 105
    :goto_3
    if-eqz v1, :cond_6

    .line 106
    .line 107
    invoke-virtual {v1, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 108
    .line 109
    .line 110
    goto :goto_6

    .line 111
    :cond_6
    :goto_4
    move-object v1, v2

    .line 112
    goto :goto_6

    .line 113
    :goto_5
    new-instance v3, Leo1;

    .line 114
    .line 115
    invoke-direct {v3, v1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 116
    .line 117
    .line 118
    move-object v1, v3

    .line 119
    :goto_6
    instance-of v3, v1, Leo1;

    .line 120
    .line 121
    if-eqz v3, :cond_7

    .line 122
    .line 123
    goto :goto_7

    .line 124
    :cond_7
    move-object v2, v1

    .line 125
    :goto_7
    check-cast v2, Ljava/lang/reflect/Method;

    .line 126
    .line 127
    if-eqz v2, :cond_0

    .line 128
    .line 129
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    goto :goto_0

    .line 133
    :cond_8
    return-object v0
.end method
