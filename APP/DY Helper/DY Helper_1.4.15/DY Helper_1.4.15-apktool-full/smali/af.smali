.class public final Laf;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Laf;

.field public static final β:[Ljava/lang/String;

.field public static final γ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final δ:Ljava/util/Set;

.field public static final ε:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final ζ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final η:Ldf;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Laf;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Laf;->α:Laf;

    .line 7
    .line 8
    const-string v0, "X.0yo4"

    .line 9
    .line 10
    const-string v1, "X.C1872010yo4"

    .line 11
    .line 12
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sput-object v0, Laf;->β:[Ljava/lang/String;

    .line 17
    .line 18
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 22
    .line 23
    .line 24
    sput-object v0, Laf;->γ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 25
    .line 26
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 27
    .line 28
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    sput-object v0, Laf;->δ:Ljava/util/Set;

    .line 39
    .line 40
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 41
    .line 42
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 43
    .line 44
    .line 45
    sput-object v0, Laf;->ε:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 46
    .line 47
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 48
    .line 49
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 50
    .line 51
    .line 52
    sput-object v0, Laf;->ζ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 53
    .line 54
    new-instance v0, Ldf;

    .line 55
    .line 56
    invoke-direct {v0}, Ldf;-><init>()V

    .line 57
    .line 58
    .line 59
    sput-object v0, Laf;->η:Ldf;

    .line 60
    .line 61
    return-void
.end method

.method public static final α(Laf;Ljava/lang/reflect/Method;)I
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    sget-object v0, Laf;->β:[Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v0, p0}, Lg7;->Κ([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    const/16 p0, 0x3e8

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p0, 0x0

    .line 21
    :goto_0
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    add-int/lit16 p0, p0, 0x12c

    .line 32
    .line 33
    :cond_1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    array-length v0, v0

    .line 38
    const/4 v1, 0x7

    .line 39
    if-ne v0, v1, :cond_2

    .line 40
    .line 41
    add-int/lit16 p0, p0, 0x1f4

    .line 42
    .line 43
    :cond_2
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const/4 v1, 0x6

    .line 48
    aget-object v0, v0, v1

    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    invoke-static {v0}, Laf;->γ(Ljava/lang/Class;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_3

    .line 58
    .line 59
    add-int/lit16 p0, p0, 0x12c

    .line 60
    .line 61
    :cond_3
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    invoke-static {p1}, Laf;->δ(Ljava/lang/Class;)Z

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    if-eqz p1, :cond_4

    .line 73
    .line 74
    add-int/lit16 p0, p0, 0x12c

    .line 75
    .line 76
    :cond_4
    return p0
.end method

.method public static β(Ljava/util/List;)Ljava/util/ArrayList;
    .locals 17

    .line 1
    invoke-interface/range {p0 .. p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :catchall_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Ljava/lang/reflect/Method;

    .line 17
    .line 18
    :try_start_0
    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v0, Ljava/util/HashSet;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 25
    .line 26
    .line 27
    new-instance v1, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-interface/range {p0 .. p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    :cond_1
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-eqz v4, :cond_3

    .line 41
    .line 42
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    move-object v5, v4

    .line 47
    check-cast v5, Ljava/lang/reflect/Method;

    .line 48
    .line 49
    invoke-static {v5}, Llz1;->τ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v6

    .line 53
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v7

    .line 57
    invoke-static {v7, v5}, Llz1;->ο(Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v8

    .line 61
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    move-result-object v9

    .line 65
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    new-instance v10, Ljava/util/ArrayList;

    .line 69
    .line 70
    array-length v11, v9

    .line 71
    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 72
    .line 73
    .line 74
    array-length v11, v9

    .line 75
    const/4 v12, 0x0

    .line 76
    :goto_2
    if-ge v12, v11, :cond_2

    .line 77
    .line 78
    aget-object v13, v9, v12

    .line 79
    .line 80
    invoke-static {v13, v10, v12, v2}, Llz1;->δ(Ljava/lang/Class;Ljava/util/ArrayList;II)I

    .line 81
    .line 82
    .line 83
    move-result v12

    .line 84
    goto :goto_2

    .line 85
    :cond_2
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 90
    .line 91
    .line 92
    const/4 v15, 0x0

    .line 93
    const/16 v16, 0x3e

    .line 94
    .line 95
    const-string v11, ","

    .line 96
    .line 97
    const/4 v12, 0x0

    .line 98
    const/4 v13, 0x0

    .line 99
    const/4 v14, 0x0

    .line 100
    invoke-static/range {v10 .. v16}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    const-string v9, "#"

    .line 105
    .line 106
    const-string v10, "("

    .line 107
    .line 108
    invoke-static {v6, v9, v7, v10, v5}, Lnx;->ρ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    const-string v6, "):"

    .line 113
    .line 114
    invoke-static {v5, v6, v8, v0}, Llz1;->Γ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/HashSet;)Z

    .line 115
    .line 116
    .line 117
    move-result v5

    .line 118
    if-eqz v5, :cond_1

    .line 119
    .line 120
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_3
    return-object v1
.end method

.method public static γ(Ljava/lang/Class;)Z
    .locals 9

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->isInterface()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    array-length v0, p0

    .line 17
    move v2, v1

    .line 18
    :goto_0
    const/4 v3, 0x1

    .line 19
    if-ge v2, v0, :cond_2

    .line 20
    .line 21
    aget-object v4, p0, v2

    .line 22
    .line 23
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    sget-object v6, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 28
    .line 29
    invoke-static {v5, v6}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    if-eqz v5, :cond_1

    .line 34
    .line 35
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    sget-object v5, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 40
    .line 41
    filled-new-array {v5}, [Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    invoke-static {v4, v5}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    if-eqz v4, :cond_1

    .line 50
    .line 51
    move v0, v3

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    move v0, v1

    .line 57
    :goto_1
    array-length v2, p0

    .line 58
    move v4, v1

    .line 59
    :goto_2
    if-ge v4, v2, :cond_4

    .line 60
    .line 61
    aget-object v5, p0, v4

    .line 62
    .line 63
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    array-length v6, v6

    .line 71
    if-nez v6, :cond_3

    .line 72
    .line 73
    const-class v6, Landroid/app/Activity;

    .line 74
    .line 75
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    invoke-virtual {v6, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 80
    .line 81
    .line 82
    move-result v5

    .line 83
    if-eqz v5, :cond_3

    .line 84
    .line 85
    move v2, v3

    .line 86
    goto :goto_3

    .line 87
    :cond_3
    add-int/lit8 v4, v4, 0x1

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_4
    move v2, v1

    .line 91
    :goto_3
    array-length v4, p0

    .line 92
    move v5, v1

    .line 93
    :goto_4
    if-ge v5, v4, :cond_6

    .line 94
    .line 95
    aget-object v6, p0, v5

    .line 96
    .line 97
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    move-result-object v7

    .line 101
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    array-length v7, v7

    .line 105
    if-nez v7, :cond_5

    .line 106
    .line 107
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    const-class v7, Ljava/lang/String;

    .line 112
    .line 113
    invoke-static {v6, v7}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v6

    .line 117
    if-eqz v6, :cond_5

    .line 118
    .line 119
    move v4, v3

    .line 120
    goto :goto_5

    .line 121
    :cond_5
    add-int/lit8 v5, v5, 0x1

    .line 122
    .line 123
    goto :goto_4

    .line 124
    :cond_6
    move v4, v1

    .line 125
    :goto_5
    array-length v5, p0

    .line 126
    move v6, v1

    .line 127
    :goto_6
    if-ge v6, v5, :cond_8

    .line 128
    .line 129
    aget-object v7, p0, v6

    .line 130
    .line 131
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    move-result-object v8

    .line 135
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    array-length v8, v8

    .line 139
    if-nez v8, :cond_7

    .line 140
    .line 141
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    move-result-object v7

    .line 145
    sget-object v8, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 146
    .line 147
    invoke-static {v7, v8}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v7

    .line 151
    if-eqz v7, :cond_7

    .line 152
    .line 153
    move p0, v3

    .line 154
    goto :goto_7

    .line 155
    :cond_7
    add-int/lit8 v6, v6, 0x1

    .line 156
    .line 157
    goto :goto_6

    .line 158
    :cond_8
    move p0, v1

    .line 159
    :goto_7
    if-eqz v0, :cond_9

    .line 160
    .line 161
    if-eqz v2, :cond_9

    .line 162
    .line 163
    if-eqz v4, :cond_9

    .line 164
    .line 165
    if-eqz p0, :cond_9

    .line 166
    .line 167
    move v1, v3

    .line 168
    :cond_9
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 169
    .line 170
    .line 171
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 172
    goto :goto_8

    .line 173
    :catchall_0
    move-exception p0

    .line 174
    new-instance v0, Leo1;

    .line 175
    .line 176
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 177
    .line 178
    .line 179
    move-object p0, v0

    .line 180
    :goto_8
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 181
    .line 182
    instance-of v1, p0, Leo1;

    .line 183
    .line 184
    if-eqz v1, :cond_a

    .line 185
    .line 186
    move-object p0, v0

    .line 187
    :cond_a
    check-cast p0, Ljava/lang/Boolean;

    .line 188
    .line 189
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 190
    .line 191
    .line 192
    move-result p0

    .line 193
    return p0
.end method

.method public static δ(Ljava/lang/Class;)Z
    .locals 6

    .line 1
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_d

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    goto/16 :goto_6

    .line 17
    .line 18
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    new-instance v0, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    array-length v2, p0

    .line 31
    move v3, v1

    .line 32
    :goto_0
    if-ge v3, v2, :cond_2

    .line 33
    .line 34
    aget-object v4, p0, v3

    .line 35
    .line 36
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    if-nez v5, :cond_1

    .line 45
    .line 46
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    const/4 v2, 0x0

    .line 57
    if-eqz p0, :cond_3

    .line 58
    .line 59
    move v3, v1

    .line 60
    goto :goto_2

    .line 61
    :cond_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    move v3, v1

    .line 66
    :cond_4
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    if-eqz v4, :cond_6

    .line 71
    .line 72
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    check-cast v4, Ljava/lang/reflect/Field;

    .line 77
    .line 78
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 83
    .line 84
    invoke-static {v4, v5}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    if-eqz v4, :cond_4

    .line 89
    .line 90
    add-int/lit8 v3, v3, 0x1

    .line 91
    .line 92
    if-ltz v3, :cond_5

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_5
    invoke-static {}, Lyh;->ф()V

    .line 96
    .line 97
    .line 98
    throw v2

    .line 99
    :cond_6
    :goto_2
    const/4 p0, 0x2

    .line 100
    if-lt v3, p0, :cond_b

    .line 101
    .line 102
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 103
    .line 104
    .line 105
    move-result p0

    .line 106
    if-eqz p0, :cond_7

    .line 107
    .line 108
    move v0, v1

    .line 109
    goto :goto_4

    .line 110
    :cond_7
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    move v0, v1

    .line 115
    :cond_8
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 116
    .line 117
    .line 118
    move-result v3

    .line 119
    if-eqz v3, :cond_a

    .line 120
    .line 121
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    check-cast v3, Ljava/lang/reflect/Field;

    .line 126
    .line 127
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 132
    .line 133
    invoke-static {v3, v4}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v3

    .line 137
    if-eqz v3, :cond_8

    .line 138
    .line 139
    add-int/lit8 v0, v0, 0x1

    .line 140
    .line 141
    if-ltz v0, :cond_9

    .line 142
    .line 143
    goto :goto_3

    .line 144
    :cond_9
    invoke-static {}, Lyh;->ф()V

    .line 145
    .line 146
    .line 147
    throw v2

    .line 148
    :cond_a
    :goto_4
    const/4 p0, 0x1

    .line 149
    if-lt v0, p0, :cond_b

    .line 150
    .line 151
    move v1, p0

    .line 152
    :cond_b
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 153
    .line 154
    .line 155
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 156
    goto :goto_5

    .line 157
    :catchall_0
    move-exception p0

    .line 158
    new-instance v0, Leo1;

    .line 159
    .line 160
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 161
    .line 162
    .line 163
    move-object p0, v0

    .line 164
    :goto_5
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 165
    .line 166
    instance-of v1, p0, Leo1;

    .line 167
    .line 168
    if-eqz v1, :cond_c

    .line 169
    .line 170
    move-object p0, v0

    .line 171
    :cond_c
    check-cast p0, Ljava/lang/Boolean;

    .line 172
    .line 173
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 174
    .line 175
    .line 176
    move-result p0

    .line 177
    return p0

    .line 178
    :cond_d
    :goto_6
    return v1
.end method

.method public static ζ(Ljava/lang/reflect/Method;)Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto/16 :goto_0

    .line 16
    .line 17
    :cond_0
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    array-length v2, v0

    .line 22
    const/4 v3, 0x7

    .line 23
    if-eq v2, v3, :cond_1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    aget-object v2, v0, v1

    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    const-string v3, "~7930256E6FA81116F35A8C2AC6E1F26036E68A18C000538406145429DCFD52564510E72B66959BEEBB"

    .line 33
    .line 34
    invoke-static {v3}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-nez v2, :cond_2

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    const/4 v2, 0x1

    .line 46
    aget-object v3, v0, v2

    .line 47
    .line 48
    sget-object v4, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 49
    .line 50
    invoke-static {v3, v4}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-nez v3, :cond_3

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_3
    const/4 v3, 0x2

    .line 58
    aget-object v3, v0, v3

    .line 59
    .line 60
    sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 61
    .line 62
    invoke-static {v3, v4}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-nez v3, :cond_4

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_4
    const/4 v3, 0x3

    .line 70
    aget-object v3, v0, v3

    .line 71
    .line 72
    invoke-static {v3, v4}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    if-nez v3, :cond_5

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_5
    const/4 v3, 0x4

    .line 80
    aget-object v3, v0, v3

    .line 81
    .line 82
    invoke-static {v3, v4}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    if-nez v3, :cond_6

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_6
    const/4 v3, 0x5

    .line 90
    aget-object v3, v0, v3

    .line 91
    .line 92
    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 93
    .line 94
    invoke-static {v3, v4}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    if-nez v3, :cond_7

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_7
    const/4 v3, 0x6

    .line 102
    aget-object v0, v0, v3

    .line 103
    .line 104
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    invoke-static {v0}, Laf;->γ(Ljava/lang/Class;)Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    if-eqz v0, :cond_8

    .line 112
    .line 113
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    invoke-static {p0}, Laf;->δ(Ljava/lang/Class;)Z

    .line 121
    .line 122
    .line 123
    move-result p0

    .line 124
    if-eqz p0, :cond_8

    .line 125
    .line 126
    return v2

    .line 127
    :cond_8
    :goto_0
    return v1
.end method

.method public static η(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "rdb45e3f68fd84fd5"

    .line 2
    .line 3
    invoke-static {v0, p0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final ε(Ljava/lang/ClassLoader;)V
    .locals 14

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    invoke-virtual {p0, p1, v1}, Laf;->θ(Ljava/lang/ClassLoader;Z)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const-string p0, "no skip method resolved, allowDexKitScan=false"

    .line 16
    .line 17
    invoke-static {p0}, Laf;->η(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_5

    .line 30
    .line 31
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    move-object v2, v0

    .line 36
    check-cast v2, Ljava/lang/reflect/Method;

    .line 37
    .line 38
    invoke-static {v2}, Llz1;->τ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-static {v3, v2}, Llz1;->ο(Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    new-instance v6, Ljava/util/ArrayList;

    .line 58
    .line 59
    array-length v7, v5

    .line 60
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 61
    .line 62
    .line 63
    array-length v7, v5

    .line 64
    move v8, v1

    .line 65
    :goto_1
    const/4 v13, 0x1

    .line 66
    if-ge v8, v7, :cond_2

    .line 67
    .line 68
    aget-object v9, v5, v8

    .line 69
    .line 70
    invoke-static {v9, v6, v8, v13}, Llz1;->δ(Ljava/lang/Class;Ljava/util/ArrayList;II)I

    .line 71
    .line 72
    .line 73
    move-result v8

    .line 74
    goto :goto_1

    .line 75
    :cond_2
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 80
    .line 81
    .line 82
    const/4 v11, 0x0

    .line 83
    const/16 v12, 0x3e

    .line 84
    .line 85
    const-string v7, ","

    .line 86
    .line 87
    const/4 v8, 0x0

    .line 88
    const/4 v9, 0x0

    .line 89
    const/4 v10, 0x0

    .line 90
    invoke-static/range {v6 .. v12}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    const-string v6, "("

    .line 95
    .line 96
    const-string v7, "#"

    .line 97
    .line 98
    invoke-static {v0, v7, v3, v6, v5}, Lnx;->ρ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    const-string v3, "):"

    .line 103
    .line 104
    invoke-static {v0, v3, v4}, Llz1;->π(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    sget-object v4, Laf;->δ:Ljava/util/Set;

    .line 109
    .line 110
    invoke-interface {v4, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    if-nez v0, :cond_3

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_3
    :try_start_0
    invoke-virtual {v2, v13}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 118
    .line 119
    .line 120
    sget-object v0, Lxq0;->α:Lxq0;

    .line 121
    .line 122
    new-instance v5, Lxe;

    .line 123
    .line 124
    const/4 v6, 0x1

    .line 125
    invoke-direct {v5, v6, p0, v2}, Lxe;-><init>(ILjava/lang/Object;Ljava/lang/reflect/Method;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0, v2, v5}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 129
    .line 130
    .line 131
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 132
    goto :goto_2

    .line 133
    :catchall_0
    move-exception v0

    .line 134
    new-instance v5, Leo1;

    .line 135
    .line 136
    invoke-direct {v5, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 137
    .line 138
    .line 139
    move-object v0, v5

    .line 140
    :goto_2
    instance-of v5, v0, Leo1;

    .line 141
    .line 142
    if-nez v5, :cond_4

    .line 143
    .line 144
    move-object v5, v0

    .line 145
    check-cast v5, Ll01;

    .line 146
    .line 147
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    move-result-object v5

    .line 151
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v5

    .line 155
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v6

    .line 159
    new-instance v8, Ljava/lang/StringBuilder;

    .line 160
    .line 161
    const-string v9, "hooked "

    .line 162
    .line 163
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v5

    .line 179
    invoke-static {v5}, Laf;->η(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    :cond_4
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    if-eqz v0, :cond_1

    .line 187
    .line 188
    invoke-interface {v4, v3}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    move-result-object v3

    .line 195
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v3

    .line 199
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    const-string v4, "hook failed "

    .line 208
    .line 209
    const-string v5, ": "

    .line 210
    .line 211
    invoke-static {v4, v3, v7, v2, v5}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    invoke-static {v0}, Laf;->η(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    goto/16 :goto_0

    .line 226
    .line 227
    :cond_5
    return-void
.end method

.method public final θ(Ljava/lang/ClassLoader;Z)Ljava/util/List;
    .locals 11

    .line 1
    sget-object v0, Lox;->α:Ljava/lang/Object;

    .line 2
    .line 3
    sget-object v0, Lkx;->Ｅ:Lkx;

    .line 4
    .line 5
    invoke-static {v0, p1}, Lox;->σ(Lkx;Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    sget-object v2, Ljz;->ε:Ljz;

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    move-object v1, v2

    .line 14
    :cond_0
    new-instance v3, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-eqz v4, :cond_2

    .line 28
    .line 29
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    move-object v5, v4

    .line 34
    check-cast v5, Ljava/lang/reflect/Method;

    .line 35
    .line 36
    invoke-static {v5}, Laf;->ζ(Ljava/lang/reflect/Method;)Z

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    if-eqz v5, :cond_1

    .line 41
    .line 42
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-nez v1, :cond_3

    .line 51
    .line 52
    invoke-static {v3}, Laf;->β(Ljava/util/List;)Ljava/util/ArrayList;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :cond_3
    new-instance v1, Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 60
    .line 61
    .line 62
    const/4 v3, 0x0

    .line 63
    move v4, v3

    .line 64
    :goto_1
    const/4 v5, 0x2

    .line 65
    if-ge v4, v5, :cond_7

    .line 66
    .line 67
    sget-object v5, Laf;->β:[Ljava/lang/String;

    .line 68
    .line 69
    aget-object v5, v5, v4

    .line 70
    .line 71
    :try_start_0
    invoke-static {v5, v3, p1}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    invoke-virtual {v5}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    new-instance v6, Ljava/util/ArrayList;

    .line 83
    .line 84
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 85
    .line 86
    .line 87
    array-length v7, v5

    .line 88
    move v8, v3

    .line 89
    :goto_2
    if-ge v8, v7, :cond_5

    .line 90
    .line 91
    aget-object v9, v5, v8

    .line 92
    .line 93
    invoke-static {v9}, Laf;->ζ(Ljava/lang/reflect/Method;)Z

    .line 94
    .line 95
    .line 96
    move-result v10

    .line 97
    if-eqz v10, :cond_4

    .line 98
    .line 99
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 100
    .line 101
    .line 102
    goto :goto_3

    .line 103
    :catchall_0
    move-exception v5

    .line 104
    goto :goto_4

    .line 105
    :cond_4
    :goto_3
    add-int/lit8 v8, v8, 0x1

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :goto_4
    new-instance v6, Leo1;

    .line 109
    .line 110
    invoke-direct {v6, v5}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 111
    .line 112
    .line 113
    :cond_5
    instance-of v5, v6, Leo1;

    .line 114
    .line 115
    if-eqz v5, :cond_6

    .line 116
    .line 117
    move-object v6, v2

    .line 118
    :cond_6
    check-cast v6, Ljava/lang/Iterable;

    .line 119
    .line 120
    invoke-static {v1, v6}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 121
    .line 122
    .line 123
    add-int/lit8 v4, v4, 0x1

    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_7
    new-instance v3, Lze;

    .line 127
    .line 128
    const/4 v4, 0x1

    .line 129
    invoke-direct {v3, p0, v4}, Lze;-><init>(Laf;I)V

    .line 130
    .line 131
    .line 132
    invoke-static {v1, v3}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    invoke-static {v1}, Laf;->β(Ljava/util/List;)Ljava/util/ArrayList;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 141
    .line 142
    .line 143
    move-result v3

    .line 144
    if-nez v3, :cond_9

    .line 145
    .line 146
    if-eqz p2, :cond_8

    .line 147
    .line 148
    :try_start_1
    sget-object p0, Lox;->α:Ljava/lang/Object;

    .line 149
    .line 150
    invoke-static {v0, v1}, Lox;->χ(Lkx;Ljava/util/List;)V

    .line 151
    .line 152
    .line 153
    sget-object p0, Ls62;->α:Ls62;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 154
    .line 155
    goto :goto_5

    .line 156
    :catchall_1
    move-exception p0

    .line 157
    new-instance p1, Leo1;

    .line 158
    .line 159
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 160
    .line 161
    .line 162
    move-object p0, p1

    .line 163
    :goto_5
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    if-eqz p0, :cond_8

    .line 168
    .line 169
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    new-instance p1, Ljava/lang/StringBuilder;

    .line 174
    .line 175
    const-string p2, "save reflection fallback failed: "

    .line 176
    .line 177
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    invoke-static {p0}, Laf;->η(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    :cond_8
    return-object v1

    .line 191
    :cond_9
    if-eqz p2, :cond_f

    .line 192
    .line 193
    sget-object p2, Lox;->α:Ljava/lang/Object;

    .line 194
    .line 195
    sget-object p2, Lox;->ι:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 196
    .line 197
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 198
    .line 199
    .line 200
    move-result p2

    .line 201
    if-nez p2, :cond_a

    .line 202
    .line 203
    goto :goto_9

    .line 204
    :cond_a
    :try_start_2
    const-string p2, "\u5b9a\u4f4d 39.3 \u53ca\u4ee5\u4e0a\u89c6\u9891\u7ae0\u8282\u5e7f\u544a\u81ea\u52a8\u8df3\u8fc7\u903b\u8f91"

    .line 205
    .line 206
    new-instance v1, Lwa;

    .line 207
    .line 208
    invoke-direct {v1, p0, v5, p1}, Lwa;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    invoke-static {v0, p1, p2, v1}, Lox;->λ(Lkx;Ljava/lang/ClassLoader;Ljava/lang/String;La80;)Ljava/util/List;

    .line 212
    .line 213
    .line 214
    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 215
    goto :goto_6

    .line 216
    :catchall_2
    move-exception p0

    .line 217
    new-instance p1, Leo1;

    .line 218
    .line 219
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 220
    .line 221
    .line 222
    move-object p0, p1

    .line 223
    :goto_6
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 224
    .line 225
    .line 226
    move-result-object p1

    .line 227
    if-eqz p1, :cond_b

    .line 228
    .line 229
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    new-instance p2, Ljava/lang/StringBuilder;

    .line 234
    .line 235
    const-string v0, "DexKit resolve failed: "

    .line 236
    .line 237
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object p1

    .line 247
    invoke-static {p1}, Laf;->η(Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    :cond_b
    instance-of p1, p0, Leo1;

    .line 251
    .line 252
    if-eqz p1, :cond_c

    .line 253
    .line 254
    goto :goto_7

    .line 255
    :cond_c
    move-object v2, p0

    .line 256
    :goto_7
    check-cast v2, Ljava/util/List;

    .line 257
    .line 258
    new-instance p0, Ljava/util/ArrayList;

    .line 259
    .line 260
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 261
    .line 262
    .line 263
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 264
    .line 265
    .line 266
    move-result-object p1

    .line 267
    :cond_d
    :goto_8
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 268
    .line 269
    .line 270
    move-result p2

    .line 271
    if-eqz p2, :cond_e

    .line 272
    .line 273
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object p2

    .line 277
    move-object v0, p2

    .line 278
    check-cast v0, Ljava/lang/reflect/Method;

    .line 279
    .line 280
    invoke-static {v0}, Laf;->ζ(Ljava/lang/reflect/Method;)Z

    .line 281
    .line 282
    .line 283
    move-result v0

    .line 284
    if-eqz v0, :cond_d

    .line 285
    .line 286
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    goto :goto_8

    .line 290
    :cond_e
    invoke-static {p0}, Laf;->β(Ljava/util/List;)Ljava/util/ArrayList;

    .line 291
    .line 292
    .line 293
    move-result-object p0

    .line 294
    return-object p0

    .line 295
    :cond_f
    :goto_9
    return-object v2
.end method
