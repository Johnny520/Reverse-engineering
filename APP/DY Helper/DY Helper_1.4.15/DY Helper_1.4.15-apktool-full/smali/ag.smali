.class public final Lag;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Lag;

.field public static final β:Ljava/util/List;

.field public static final γ:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lag;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lag;->α:Lag;

    .line 7
    .line 8
    const-string v0, "~78F34A746881AA3660EE86BE622F7993067D6CB566F11858AD9BF4EAEB5473E5B761566D88B7E9F0D235FFB471D623EECFB06F520B92CDFE6FB8E0A201745D8D76B2FEFFCBD4200CA4E520CE580E45E9520A0B4D880891FA5E"

    .line 9
    .line 10
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, "~78E319B3AFE068530105B43DA61D1F01660D161F30123896CF063AF8C57AAB277F9106B66D102507008CF09DFE7ABA532ECFD554C6DCCF69B17B27B09EE45FAB8BDDE47ECB13758433A8BE8FC1FFB80571C33ED77D757929A9AB549FCF"

    .line 15
    .line 16
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sput-object v0, Lag;->β:Ljava/util/List;

    .line 29
    .line 30
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 34
    .line 35
    .line 36
    sput-object v0, Lag;->γ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 37
    .line 38
    return-void
.end method

.method public static α(Lorg/luckypray/dexkit/result/ClassData;Ljava/lang/ClassLoader;)Ljava/lang/Class;
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    goto :goto_2

    .line 5
    :cond_0
    :try_start_0
    const-class v1, Lorg/luckypray/dexkit/result/ClassData;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    array-length v2, v1

    .line 15
    const/4 v3, 0x0

    .line 16
    move v4, v3

    .line 17
    :goto_0
    const/4 v5, 0x1

    .line 18
    if-ge v4, v2, :cond_2

    .line 19
    .line 20
    aget-object v6, v1, v4

    .line 21
    .line 22
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v7

    .line 26
    const-string v8, "getInstance"

    .line 27
    .line 28
    invoke-static {v7, v8}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v7

    .line 32
    if-eqz v7, :cond_1

    .line 33
    .line 34
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object v7

    .line 38
    array-length v7, v7

    .line 39
    if-ne v7, v5, :cond_1

    .line 40
    .line 41
    const-class v7, Ljava/lang/ClassLoader;

    .line 42
    .line 43
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    move-result-object v8

    .line 47
    aget-object v8, v8, v3

    .line 48
    .line 49
    invoke-virtual {v7, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 50
    .line 51
    .line 52
    move-result v7

    .line 53
    if-eqz v7, :cond_1

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :catchall_0
    move-exception p0

    .line 57
    goto :goto_3

    .line 58
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    move-object v6, v0

    .line 62
    :goto_1
    if-nez v6, :cond_3

    .line 63
    .line 64
    :goto_2
    return-object v0

    .line 65
    :cond_3
    invoke-virtual {v6, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 66
    .line 67
    .line 68
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-virtual {v6, p0, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    instance-of p1, p0, Ljava/lang/Class;

    .line 77
    .line 78
    if-eqz p1, :cond_4

    .line 79
    .line 80
    check-cast p0, Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 81
    .line 82
    goto :goto_4

    .line 83
    :cond_4
    move-object p0, v0

    .line 84
    goto :goto_4

    .line 85
    :goto_3
    new-instance p1, Leo1;

    .line 86
    .line 87
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 88
    .line 89
    .line 90
    move-object p0, p1

    .line 91
    :goto_4
    instance-of p1, p0, Leo1;

    .line 92
    .line 93
    if-eqz p1, :cond_5

    .line 94
    .line 95
    goto :goto_5

    .line 96
    :cond_5
    move-object v0, p0

    .line 97
    :goto_5
    check-cast v0, Ljava/lang/Class;

    .line 98
    .line 99
    return-object v0
.end method

.method public static β(Ljava/lang/Class;)Z
    .locals 5

    .line 1
    invoke-static {p0}, Lag;->ε(Ljava/lang/Class;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_0
    const-string v2, "BOTTOM_BAR_CONTAINER"

    .line 10
    .line 11
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-nez v2, :cond_1

    .line 16
    .line 17
    const-string v2, "BUTTON_CONTAINER"

    .line 18
    .line 19
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_4

    .line 24
    .line 25
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    array-length v0, p0

    .line 33
    move v2, v1

    .line 34
    move v3, v2

    .line 35
    :goto_0
    if-ge v2, v0, :cond_3

    .line 36
    .line 37
    aget-object v4, p0, v2

    .line 38
    .line 39
    invoke-static {v4}, Lag;->γ(Ljava/lang/reflect/Method;)Z

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    if-eqz v4, :cond_2

    .line 44
    .line 45
    add-int/lit8 v3, v3, 0x1

    .line 46
    .line 47
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_3
    const/4 p0, 0x1

    .line 51
    if-ne v3, p0, :cond_4

    .line 52
    .line 53
    return p0

    .line 54
    :cond_4
    :goto_1
    return v1
.end method

.method public static γ(Ljava/lang/reflect/Method;)Z
    .locals 3

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
    if-nez v0, :cond_2

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const-class v0, Landroid/view/View;

    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    array-length v0, p0

    .line 40
    const/4 v1, 0x3

    .line 41
    if-ne v0, v1, :cond_2

    .line 42
    .line 43
    const-class v0, Landroid/content/Context;

    .line 44
    .line 45
    const/4 v1, 0x1

    .line 46
    aget-object v2, p0, v1

    .line 47
    .line 48
    invoke-virtual {v0, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_2

    .line 53
    .line 54
    const/4 v0, 0x2

    .line 55
    aget-object p0, p0, v0

    .line 56
    .line 57
    const-class v0, Landroid/view/ViewGroup;

    .line 58
    .line 59
    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    if-eqz p0, :cond_2

    .line 64
    .line 65
    return v1

    .line 66
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 67
    return p0
.end method

.method public static ε(Ljava/lang/Class;)Ljava/lang/String;
    .locals 8

    .line 1
    const-string v0, "~796C0BCB62BCE6FE82C87A254D6EEBA7FF748413BC384A314028F5A6C96A968724110CE5DD878D6654DCD64D754A5F498DF2F177829ACF900101545BD428"

    .line 2
    .line 3
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Ljava/util/ArrayDeque;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/util/ArrayDeque;-><init>()V

    .line 10
    .line 11
    .line 12
    new-instance v2, Ljava/util/HashSet;

    .line 13
    .line 14
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, p0}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    :cond_0
    :goto_0
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    const/4 v4, 0x0

    .line 25
    if-nez v3, :cond_b

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, Ljava/lang/Class;

    .line 32
    .line 33
    invoke-virtual {v2, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    if-eqz v5, :cond_0

    .line 38
    .line 39
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    invoke-virtual {v5, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    const/4 v6, 0x0

    .line 48
    if-eqz v5, :cond_9

    .line 49
    .line 50
    const/4 v0, 0x1

    .line 51
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    array-length v2, v1

    .line 59
    :goto_1
    if-ge v6, v2, :cond_2

    .line 60
    .line 61
    aget-object v3, v1, v6

    .line 62
    .line 63
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    if-eqz v5, :cond_1

    .line 72
    .line 73
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    array-length v5, v5

    .line 81
    if-nez v5, :cond_1

    .line 82
    .line 83
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    invoke-static {v5, p0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v5

    .line 91
    if-eqz v5, :cond_1

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :catchall_0
    move-exception v1

    .line 95
    goto :goto_3

    .line 96
    :cond_1
    add-int/lit8 v6, v6, 0x1

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_2
    move-object v3, v4

    .line 100
    :goto_2
    if-eqz v3, :cond_3

    .line 101
    .line 102
    invoke-virtual {v3, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v3, v4, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    goto :goto_4

    .line 110
    :cond_3
    invoke-virtual {p0, v4}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    invoke-virtual {v1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v1, v4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 121
    goto :goto_4

    .line 122
    :goto_3
    new-instance v2, Leo1;

    .line 123
    .line 124
    invoke-direct {v2, v1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 125
    .line 126
    .line 127
    move-object v1, v2

    .line 128
    :goto_4
    instance-of v2, v1, Leo1;

    .line 129
    .line 130
    if-eqz v2, :cond_4

    .line 131
    .line 132
    move-object v1, v4

    .line 133
    :cond_4
    if-nez v1, :cond_5

    .line 134
    .line 135
    goto :goto_6

    .line 136
    :cond_5
    invoke-virtual {p0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    invoke-static {p0}, Lg7;->Θ([Ljava/lang/Object;)Lss1;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    new-instance v2, Lwe;

    .line 148
    .line 149
    const/16 v3, 0x14

    .line 150
    .line 151
    invoke-direct {v2, v3}, Lwe;-><init>(I)V

    .line 152
    .line 153
    .line 154
    new-instance v3, Ly30;

    .line 155
    .line 156
    invoke-direct {v3, p0, v0, v2}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 157
    .line 158
    .line 159
    new-instance p0, Ltf;

    .line 160
    .line 161
    const/4 v0, 0x1

    .line 162
    invoke-direct {p0, v0}, Ltf;-><init>(I)V

    .line 163
    .line 164
    .line 165
    new-instance v0, Lcu;

    .line 166
    .line 167
    const/4 v2, 0x3

    .line 168
    invoke-direct {v0, v3, v2, p0}, Lcu;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    new-instance p0, Lef;

    .line 172
    .line 173
    const/4 v2, 0x1

    .line 174
    invoke-direct {p0, v2, v1}, Lef;-><init>(ILjava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    invoke-static {v0, p0}, Lus1;->Α(Lss1;La80;)Ly30;

    .line 178
    .line 179
    .line 180
    move-result-object p0

    .line 181
    new-instance v0, Lx30;

    .line 182
    .line 183
    invoke-direct {v0, p0}, Lx30;-><init>(Ly30;)V

    .line 184
    .line 185
    .line 186
    :cond_6
    invoke-virtual {v0}, Lx30;->hasNext()Z

    .line 187
    .line 188
    .line 189
    move-result p0

    .line 190
    if-eqz p0, :cond_8

    .line 191
    .line 192
    invoke-virtual {v0}, Lx30;->next()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    move-object v1, p0

    .line 197
    check-cast v1, Ljava/lang/String;

    .line 198
    .line 199
    const-string v2, "BOTTOM_BAR_CONTAINER"

    .line 200
    .line 201
    invoke-static {v1, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    move-result v2

    .line 205
    if-nez v2, :cond_7

    .line 206
    .line 207
    const-string v2, "BUTTON_CONTAINER"

    .line 208
    .line 209
    invoke-static {v1, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    move-result v1

    .line 213
    if-eqz v1, :cond_6

    .line 214
    .line 215
    :cond_7
    move-object v4, p0

    .line 216
    :cond_8
    check-cast v4, Ljava/lang/String;

    .line 217
    .line 218
    return-object v4

    .line 219
    :cond_9
    invoke-virtual {v3}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    move-result-object v4

    .line 223
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    array-length v5, v4

    .line 227
    :goto_5
    if-ge v6, v5, :cond_a

    .line 228
    .line 229
    aget-object v7, v4, v6

    .line 230
    .line 231
    invoke-virtual {v1, v7}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 232
    .line 233
    .line 234
    add-int/lit8 v6, v6, 0x1

    .line 235
    .line 236
    goto :goto_5

    .line 237
    :cond_a
    invoke-virtual {v3}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 238
    .line 239
    .line 240
    move-result-object v3

    .line 241
    if-eqz v3, :cond_0

    .line 242
    .line 243
    invoke-virtual {v1, v3}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 244
    .line 245
    .line 246
    goto/16 :goto_0

    .line 247
    .line 248
    :cond_b
    :goto_6
    return-object v4
.end method


# virtual methods
.method public final δ(Ljava/lang/ClassLoader;Z)Ljava/util/ArrayList;
    .locals 13

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lox;->α:Ljava/lang/Object;

    .line 5
    .line 6
    sget-object v0, Lkx;->Ｔ:Lkx;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lox;->π(Lkx;Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    sget-object v2, Ljz;->ε:Ljz;

    .line 13
    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    move-object v1, v2

    .line 17
    :cond_0
    new-instance v3, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    if-eqz v4, :cond_2

    .line 31
    .line 32
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    move-object v5, v4

    .line 37
    check-cast v5, Ljava/lang/Class;

    .line 38
    .line 39
    invoke-static {v5}, Lag;->β(Ljava/lang/Class;)Z

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    if-eqz v5, :cond_1

    .line 44
    .line 45
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    new-instance v1, Ljava/util/HashSet;

    .line 50
    .line 51
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 52
    .line 53
    .line 54
    new-instance v4, Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    :cond_3
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    if-eqz v5, :cond_4

    .line 68
    .line 69
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    move-object v6, v5

    .line 74
    check-cast v6, Ljava/lang/Class;

    .line 75
    .line 76
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v6

    .line 80
    invoke-virtual {v1, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v6

    .line 84
    if-eqz v6, :cond_3

    .line 85
    .line 86
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_4
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    if-nez v1, :cond_5

    .line 95
    .line 96
    return-object v4

    .line 97
    :cond_5
    new-instance v1, Ljava/util/ArrayList;

    .line 98
    .line 99
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 100
    .line 101
    .line 102
    sget-object v3, Lag;->β:Ljava/util/List;

    .line 103
    .line 104
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    :cond_6
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 109
    .line 110
    .line 111
    move-result v5

    .line 112
    if-eqz v5, :cond_7

    .line 113
    .line 114
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    check-cast v5, Ljava/lang/String;

    .line 119
    .line 120
    invoke-static {p1, v5}, Lbx;->α(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    move-result-object v5

    .line 124
    if-eqz v5, :cond_6

    .line 125
    .line 126
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_7
    new-instance v4, Ljava/util/ArrayList;

    .line 131
    .line 132
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    :cond_8
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 140
    .line 141
    .line 142
    move-result v5

    .line 143
    if-eqz v5, :cond_9

    .line 144
    .line 145
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v5

    .line 149
    move-object v6, v5

    .line 150
    check-cast v6, Ljava/lang/Class;

    .line 151
    .line 152
    invoke-static {v6}, Lag;->β(Ljava/lang/Class;)Z

    .line 153
    .line 154
    .line 155
    move-result v6

    .line 156
    if-eqz v6, :cond_8

    .line 157
    .line 158
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    goto :goto_3

    .line 162
    :cond_9
    new-instance v1, Ljava/util/HashSet;

    .line 163
    .line 164
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 165
    .line 166
    .line 167
    new-instance v5, Ljava/util/ArrayList;

    .line 168
    .line 169
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 173
    .line 174
    .line 175
    move-result-object v4

    .line 176
    :cond_a
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 177
    .line 178
    .line 179
    move-result v6

    .line 180
    if-eqz v6, :cond_b

    .line 181
    .line 182
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v6

    .line 186
    move-object v7, v6

    .line 187
    check-cast v7, Ljava/lang/Class;

    .line 188
    .line 189
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v7

    .line 193
    invoke-virtual {v1, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result v7

    .line 197
    if-eqz v7, :cond_a

    .line 198
    .line 199
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    goto :goto_4

    .line 203
    :cond_b
    const/4 v1, 0x4

    .line 204
    const-string v4, "rb3b4f1f2616781f"

    .line 205
    .line 206
    const/4 v12, 0x0

    .line 207
    if-eqz p2, :cond_18

    .line 208
    .line 209
    sget-object p2, Lox;->α:Ljava/lang/Object;

    .line 210
    .line 211
    sget-object p2, Lox;->ι:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 212
    .line 213
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 214
    .line 215
    .line 216
    move-result p2

    .line 217
    if-nez p2, :cond_c

    .line 218
    .line 219
    goto/16 :goto_c

    .line 220
    .line 221
    :cond_c
    :try_start_0
    const-string p2, "\u5b9a\u4f4d\u6e05\u723d\u6a21\u5f0f\u5e95\u680f\u6742\u9879\u6ce8\u518c\u5668"

    .line 222
    .line 223
    new-instance v3, Lbb;

    .line 224
    .line 225
    const/16 v6, 0x8

    .line 226
    .line 227
    invoke-direct {v3, p1, p0, v6}, Lbb;-><init>(Ljava/lang/ClassLoader;Ljava/lang/Object;I)V

    .line 228
    .line 229
    .line 230
    invoke-static {v0, p1, p2, v3}, Lox;->ι(Lkx;Ljava/lang/ClassLoader;Ljava/lang/String;La80;)Ljava/util/List;

    .line 231
    .line 232
    .line 233
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 234
    goto :goto_5

    .line 235
    :catchall_0
    move-exception v0

    .line 236
    move-object p0, v0

    .line 237
    new-instance p1, Leo1;

    .line 238
    .line 239
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 240
    .line 241
    .line 242
    move-object p0, p1

    .line 243
    :goto_5
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 244
    .line 245
    .line 246
    move-result-object p1

    .line 247
    if-eqz p1, :cond_d

    .line 248
    .line 249
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object p1

    .line 253
    const-string p2, "DexKit \u5b9a\u4f4d\u5e95\u680f\u6ce8\u518c\u5668\u5931\u8d25: "

    .line 254
    .line 255
    invoke-static {p2, p1}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object p1

    .line 259
    invoke-static {v4, p1, v12, v1, v12}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 260
    .line 261
    .line 262
    :cond_d
    instance-of p1, p0, Leo1;

    .line 263
    .line 264
    if-eqz p1, :cond_e

    .line 265
    .line 266
    goto :goto_6

    .line 267
    :cond_e
    move-object v12, p0

    .line 268
    :goto_6
    check-cast v12, Ljava/util/List;

    .line 269
    .line 270
    if-nez v12, :cond_f

    .line 271
    .line 272
    goto :goto_7

    .line 273
    :cond_f
    move-object v2, v12

    .line 274
    :goto_7
    new-instance p0, Ljava/util/ArrayList;

    .line 275
    .line 276
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 277
    .line 278
    .line 279
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 280
    .line 281
    .line 282
    move-result-object p1

    .line 283
    :cond_10
    :goto_8
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 284
    .line 285
    .line 286
    move-result p2

    .line 287
    if-eqz p2, :cond_11

    .line 288
    .line 289
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object p2

    .line 293
    move-object v0, p2

    .line 294
    check-cast v0, Ljava/lang/Class;

    .line 295
    .line 296
    invoke-static {v0}, Lag;->β(Ljava/lang/Class;)Z

    .line 297
    .line 298
    .line 299
    move-result v0

    .line 300
    if-eqz v0, :cond_10

    .line 301
    .line 302
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 303
    .line 304
    .line 305
    goto :goto_8

    .line 306
    :cond_11
    new-instance p1, Ljava/util/HashSet;

    .line 307
    .line 308
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 309
    .line 310
    .line 311
    new-instance p2, Ljava/util/ArrayList;

    .line 312
    .line 313
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 314
    .line 315
    .line 316
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 317
    .line 318
    .line 319
    move-result-object p0

    .line 320
    :cond_12
    :goto_9
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 321
    .line 322
    .line 323
    move-result v0

    .line 324
    if-eqz v0, :cond_13

    .line 325
    .line 326
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    move-object v1, v0

    .line 331
    check-cast v1, Ljava/lang/Class;

    .line 332
    .line 333
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object v1

    .line 337
    invoke-virtual {p1, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 338
    .line 339
    .line 340
    move-result v1

    .line 341
    if-eqz v1, :cond_12

    .line 342
    .line 343
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 344
    .line 345
    .line 346
    goto :goto_9

    .line 347
    :cond_13
    invoke-static {v5, p2}, Lxh;->Х(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 348
    .line 349
    .line 350
    move-result-object p0

    .line 351
    new-instance p1, Ljava/util/ArrayList;

    .line 352
    .line 353
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 354
    .line 355
    .line 356
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 357
    .line 358
    .line 359
    move-result-object p0

    .line 360
    :cond_14
    :goto_a
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 361
    .line 362
    .line 363
    move-result p2

    .line 364
    if-eqz p2, :cond_15

    .line 365
    .line 366
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object p2

    .line 370
    move-object v0, p2

    .line 371
    check-cast v0, Ljava/lang/Class;

    .line 372
    .line 373
    invoke-static {v0}, Lag;->β(Ljava/lang/Class;)Z

    .line 374
    .line 375
    .line 376
    move-result v0

    .line 377
    if-eqz v0, :cond_14

    .line 378
    .line 379
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 380
    .line 381
    .line 382
    goto :goto_a

    .line 383
    :cond_15
    new-instance p0, Ljava/util/HashSet;

    .line 384
    .line 385
    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 386
    .line 387
    .line 388
    new-instance p2, Ljava/util/ArrayList;

    .line 389
    .line 390
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 391
    .line 392
    .line 393
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 394
    .line 395
    .line 396
    move-result-object p1

    .line 397
    :cond_16
    :goto_b
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 398
    .line 399
    .line 400
    move-result v0

    .line 401
    if-eqz v0, :cond_17

    .line 402
    .line 403
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    move-result-object v0

    .line 407
    move-object v1, v0

    .line 408
    check-cast v1, Ljava/lang/Class;

    .line 409
    .line 410
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 411
    .line 412
    .line 413
    move-result-object v1

    .line 414
    invoke-virtual {p0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 415
    .line 416
    .line 417
    move-result v1

    .line 418
    if-eqz v1, :cond_16

    .line 419
    .line 420
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 421
    .line 422
    .line 423
    goto :goto_b

    .line 424
    :cond_17
    return-object p2

    .line 425
    :cond_18
    :goto_c
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 426
    .line 427
    .line 428
    move-result p0

    .line 429
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 430
    .line 431
    .line 432
    move-result p1

    .line 433
    if-ne p0, p1, :cond_1b

    .line 434
    .line 435
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 436
    .line 437
    .line 438
    move-result p0

    .line 439
    if-eqz p0, :cond_19

    .line 440
    .line 441
    goto :goto_e

    .line 442
    :cond_19
    :try_start_1
    sget-object p0, Lox;->α:Ljava/lang/Object;

    .line 443
    .line 444
    invoke-static {v0, v5}, Lox;->υ(Lkx;Ljava/util/List;)V

    .line 445
    .line 446
    .line 447
    sget-object p0, Ls62;->α:Ls62;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 448
    .line 449
    goto :goto_d

    .line 450
    :catchall_1
    move-exception v0

    .line 451
    move-object p0, v0

    .line 452
    new-instance p1, Leo1;

    .line 453
    .line 454
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 455
    .line 456
    .line 457
    move-object p0, p1

    .line 458
    :goto_d
    instance-of p1, p0, Leo1;

    .line 459
    .line 460
    if-nez p1, :cond_1a

    .line 461
    .line 462
    move-object p1, p0

    .line 463
    check-cast p1, Ls62;

    .line 464
    .line 465
    new-instance v10, Lwe;

    .line 466
    .line 467
    const/16 p1, 0xf

    .line 468
    .line 469
    invoke-direct {v10, p1}, Lwe;-><init>(I)V

    .line 470
    .line 471
    .line 472
    const/16 v11, 0x1f

    .line 473
    .line 474
    const/4 v6, 0x0

    .line 475
    const/4 v7, 0x0

    .line 476
    const/4 v8, 0x0

    .line 477
    const/4 v9, 0x0

    .line 478
    invoke-static/range {v5 .. v11}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 479
    .line 480
    .line 481
    move-result-object p1

    .line 482
    const-string p2, "\u4fdd\u5b58\u5e95\u680f\u6ce8\u518c\u5668\u7f13\u5b58\u6210\u529f reason=reflection_fallback classes="

    .line 483
    .line 484
    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 485
    .line 486
    .line 487
    move-result-object p1

    .line 488
    invoke-static {v4, p1, v12, v1, v12}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 489
    .line 490
    .line 491
    :cond_1a
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 492
    .line 493
    .line 494
    move-result-object p0

    .line 495
    if-eqz p0, :cond_1b

    .line 496
    .line 497
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 498
    .line 499
    .line 500
    move-result-object p0

    .line 501
    const-string p1, "\u4fdd\u5b58\u5e95\u680f\u6ce8\u518c\u5668\u7f13\u5b58\u5931\u8d25: "

    .line 502
    .line 503
    invoke-static {p1, p0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 504
    .line 505
    .line 506
    move-result-object p0

    .line 507
    invoke-static {v4, p0, v12, v1, v12}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 508
    .line 509
    .line 510
    :cond_1b
    :goto_e
    return-object v5
.end method
