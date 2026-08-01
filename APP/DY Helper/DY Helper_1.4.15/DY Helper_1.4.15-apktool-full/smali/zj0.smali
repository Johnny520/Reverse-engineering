.class public final Lzj0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Lzj0;

.field public static volatile β:Ljava/lang/ref/WeakReference;

.field public static final γ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static volatile δ:Ljava/lang/ClassLoader;

.field public static volatile ε:Ljava/lang/ref/WeakReference;

.field public static final ζ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final η:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final θ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final ι:Lh22;

.field public static final κ:[I

.field public static final λ:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lzj0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lzj0;->α:Lzj0;

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
    sput-object v0, Lzj0;->γ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 15
    .line 16
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 19
    .line 20
    .line 21
    sput-object v0, Lzj0;->ζ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 22
    .line 23
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 24
    .line 25
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 26
    .line 27
    .line 28
    sput-object v0, Lzj0;->η:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 29
    .line 30
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 31
    .line 32
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lzj0;->θ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 36
    .line 37
    new-instance v0, Lo7;

    .line 38
    .line 39
    const/16 v1, 0x1c

    .line 40
    .line 41
    invoke-direct {v0, v1}, Lo7;-><init>(I)V

    .line 42
    .line 43
    .line 44
    new-instance v1, Lh22;

    .line 45
    .line 46
    invoke-direct {v1, v0}, Lh22;-><init>(Lp70;)V

    .line 47
    .line 48
    .line 49
    sput-object v1, Lzj0;->ι:Lh22;

    .line 50
    .line 51
    const/16 v0, 0x11

    .line 52
    .line 53
    new-array v0, v0, [I

    .line 54
    .line 55
    fill-array-data v0, :array_0

    .line 56
    .line 57
    .line 58
    sput-object v0, Lzj0;->κ:[I

    .line 59
    .line 60
    const-string v0, "~79504AF3D2914B0617A99E1CFF7635F71B1D318AD2ED0F06920675D78278AC2B9B172F97EAB05791E23028D75CAFEBBC86"

    .line 61
    .line 62
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    const-string v1, "~795CFE82BF8D864C285649BA56CE33B4C18838459A84C50FE419E35FE204466F8D2561AAF8AA290694109CAA750A811D72F9"

    .line 67
    .line 68
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    sput-object v0, Lzj0;->λ:[Ljava/lang/String;

    .line 77
    .line 78
    return-void

    .line 79
    :array_0
    .array-data 4
        0x1
        0x2
        0x3
        0x4
        0x5
        0x6
        0x7
        0x8
        0x9
        0x2a
        0x32
        0x33
        0x34
        0x35
        0x63
        0x1f5
        0x26ad
    .end array-data
.end method

.method public static Α(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    const/4 v1, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    goto/16 :goto_3

    .line 5
    .line 6
    :cond_0
    invoke-static {p0}, Lzj0;->ξ(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_1
    const/4 v2, 0x1

    .line 14
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v3, "getValue"

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    new-array v4, v4, [Ljava/lang/Class;

    .line 22
    .line 23
    invoke-static {v0, v3, v4}, Lzj0;->θ(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    move-object v0, v1

    .line 30
    goto :goto_0

    .line 31
    :cond_2
    invoke-virtual {v0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    goto :goto_0

    .line 39
    :catchall_0
    move-exception v0

    .line 40
    new-instance v3, Leo1;

    .line 41
    .line 42
    invoke-direct {v3, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 43
    .line 44
    .line 45
    move-object v0, v3

    .line 46
    :goto_0
    instance-of v3, v0, Leo1;

    .line 47
    .line 48
    if-eqz v3, :cond_3

    .line 49
    .line 50
    move-object v0, v1

    .line 51
    :cond_3
    invoke-static {v0}, Lzj0;->ξ(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-eqz v3, :cond_4

    .line 56
    .line 57
    return-object v0

    .line 58
    :cond_4
    const-string v8, "LIZIZ"

    .line 59
    .line 60
    const-string v9, "LIZJ"

    .line 61
    .line 62
    const-string v4, "getConversationListModel"

    .line 63
    .line 64
    const-string v5, "conversationListModel"

    .line 65
    .line 66
    const-string v6, "getConvListModel"

    .line 67
    .line 68
    const-string v7, "LIZ"

    .line 69
    .line 70
    filled-new-array/range {v4 .. v9}, [Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-static {v0}, Lg7;->о([Ljava/lang/Object;)Ljava/util/Set;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    invoke-static {v3}, Lzj0;->γ(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    new-instance v4, Ljava/util/ArrayList;

    .line 87
    .line 88
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    :cond_5
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 96
    .line 97
    .line 98
    move-result v5

    .line 99
    if-eqz v5, :cond_6

    .line 100
    .line 101
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    move-object v6, v5

    .line 106
    check-cast v6, Ljava/lang/reflect/Method;

    .line 107
    .line 108
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    array-length v6, v6

    .line 116
    if-nez v6, :cond_5

    .line 117
    .line 118
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_6
    new-instance v3, Ljava/util/ArrayList;

    .line 123
    .line 124
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    :cond_7
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 132
    .line 133
    .line 134
    move-result v5

    .line 135
    if-eqz v5, :cond_9

    .line 136
    .line 137
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v5

    .line 141
    move-object v6, v5

    .line 142
    check-cast v6, Ljava/lang/reflect/Method;

    .line 143
    .line 144
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v7

    .line 148
    invoke-interface {v0, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v7

    .line 152
    if-nez v7, :cond_8

    .line 153
    .line 154
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    move-result-object v6

    .line 158
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    invoke-static {v6}, Lzj0;->υ(Ljava/lang/Class;)Z

    .line 162
    .line 163
    .line 164
    move-result v6

    .line 165
    if-eqz v6, :cond_7

    .line 166
    .line 167
    :cond_8
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    goto :goto_2

    .line 171
    :cond_9
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    :catchall_1
    :cond_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 176
    .line 177
    .line 178
    move-result v3

    .line 179
    if-eqz v3, :cond_b

    .line 180
    .line 181
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v3

    .line 185
    check-cast v3, Ljava/lang/reflect/Method;

    .line 186
    .line 187
    :try_start_1
    invoke-virtual {v3, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v3, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v3

    .line 194
    invoke-static {v3}, Lzj0;->ξ(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 198
    if-eqz v4, :cond_a

    .line 199
    .line 200
    return-object v3

    .line 201
    :cond_b
    :goto_3
    return-object v1
.end method

.method public static Β(Ljava/lang/ClassLoader;)Ljava/lang/Object;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    const-string v1, "~794CAD4569E61E2D43B867359EB6123EE8F803FCDE2CE5CBCC8F2E17EC0A94ED7DDF376B1F1CCFFF57998EAEE9C317A38A8FB63CCDD0"

    .line 3
    .line 4
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-static {v1, v2, p0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const-string v1, "LJFF"

    .line 14
    .line 15
    const-string v3, "LIZ"

    .line 16
    .line 17
    const-string v4, "LIZIZ"

    .line 18
    .line 19
    filled-new-array {v1, v3, v4}, [Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    move v3, v2

    .line 24
    :goto_0
    const/4 v4, 0x3

    .line 25
    if-ge v3, v4, :cond_2

    .line 26
    .line 27
    aget-object v4, v1, v3

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    new-array v5, v2, [Ljava/lang/Class;

    .line 33
    .line 34
    invoke-static {p0, v4, v5}, Lzj0;->θ(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    if-nez v5, :cond_0

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_0
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    if-eqz v6, :cond_1

    .line 50
    .line 51
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    array-length v6, v6

    .line 59
    if-nez v6, :cond_1

    .line 60
    .line 61
    const/4 v6, 0x1

    .line 62
    invoke-virtual {v5, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v5, v0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    invoke-static {v5}, Lzj0;->ρ(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    if-eqz v6, :cond_1

    .line 74
    .line 75
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    new-instance v2, Ljava/lang/StringBuilder;

    .line 91
    .line 92
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 93
    .line 94
    .line 95
    const-string v3, "DYHelperIMMarkAllReadHelper: \u83b7\u53d6 NoticeCountService \u6210\u529f: "

    .line 96
    .line 97
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const-string p0, "."

    .line 104
    .line 105
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    const-string p0, "() -> "

    .line 112
    .line 113
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    invoke-static {p0}, Lux;->ρ(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 124
    .line 125
    .line 126
    return-object v5

    .line 127
    :catchall_0
    move-exception p0

    .line 128
    goto :goto_2

    .line 129
    :cond_1
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 130
    .line 131
    goto :goto_0

    .line 132
    :cond_2
    move-object v1, v0

    .line 133
    goto :goto_3

    .line 134
    :goto_2
    new-instance v1, Leo1;

    .line 135
    .line 136
    invoke-direct {v1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 137
    .line 138
    .line 139
    :goto_3
    if-eqz v1, :cond_3

    .line 140
    .line 141
    goto :goto_4

    .line 142
    :cond_3
    move-object v0, v1

    .line 143
    :goto_4
    return-object v0
.end method

.method public static Γ(La80;Lyj0;)V
    .locals 3

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-interface {p0, p1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    sget-object v0, Lzj0;->ι:Lh22;

    .line 20
    .line 21
    invoke-virtual {v0}, Lh22;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Landroid/os/Handler;

    .line 26
    .line 27
    new-instance v1, Lii0;

    .line 28
    .line 29
    const/4 v2, 0x3

    .line 30
    invoke-direct {v1, p0, v2, p1}, Lii0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public static Δ(Ljava/lang/reflect/Method;)Ljava/lang/String;
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const/16 v1, 0x23

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const/16 v1, 0x28

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    new-instance v2, Lfj0;

    .line 42
    .line 43
    const/16 v3, 0x8

    .line 44
    .line 45
    invoke-direct {v2, v3}, Lfj0;-><init>(I)V

    .line 46
    .line 47
    .line 48
    const/16 v3, 0x1e

    .line 49
    .line 50
    const-string v4, ","

    .line 51
    .line 52
    const/4 v5, 0x0

    .line 53
    invoke-static {v1, v4, v5, v2, v3}, Lg7;->з([Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;La80;I)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    const-string v2, "):"

    .line 58
    .line 59
    invoke-static {v0, v1, v2, p0}, Llz1;->ρ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    return-object p0
.end method

.method public static Ε(Ljava/lang/ClassLoader;Z)V
    .locals 14

    .line 1
    sget-object v1, Ls62;->α:Ls62;

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object v4

    .line 8
    invoke-static {p0}, Lzj0;->λ(Ljava/lang/ClassLoader;)V

    .line 9
    .line 10
    .line 11
    sget-object v9, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 12
    .line 13
    const/4 v10, 0x0

    .line 14
    if-eqz p1, :cond_2

    .line 15
    .line 16
    invoke-static {p0}, Lzj0;->Β(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move-object v0, v10

    .line 24
    :goto_0
    if-nez v0, :cond_1

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    const-string v3, "cleanNoticeUnreadRedDot"

    .line 28
    .line 29
    :try_start_0
    invoke-static {v0, v3}, Lzj0;->μ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    .line 32
    :catchall_0
    const-string v3, "clearNoticeCountMessage"

    .line 33
    .line 34
    :try_start_1
    invoke-static {v0, v3}, Lzj0;->μ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 35
    .line 36
    .line 37
    :catchall_1
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    const-string v3, "updateUnreadOnShow"

    .line 41
    .line 42
    invoke-static {v0, v3}, Lzj0;->ν(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const-string v3, "saveUnreadCountForFirstFrame"

    .line 46
    .line 47
    invoke-static {v0, v3}, Lzj0;->ν(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    :cond_2
    :goto_1
    const/4 v0, -0x1

    .line 51
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    sget-object v0, Lzj0;->β:Ljava/lang/ref/WeakReference;

    .line 56
    .line 57
    if-eqz v0, :cond_3

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    goto :goto_2

    .line 64
    :cond_3
    move-object v0, v10

    .line 65
    :goto_2
    invoke-static {v0}, Lzj0;->ο(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    if-eqz v5, :cond_4

    .line 70
    .line 71
    goto :goto_3

    .line 72
    :cond_4
    if-eqz v0, :cond_5

    .line 73
    .line 74
    sput-object v10, Lzj0;->β:Ljava/lang/ref/WeakReference;

    .line 75
    .line 76
    :cond_5
    move-object v0, v10

    .line 77
    :goto_3
    const/4 v11, 0x1

    .line 78
    if-nez v0, :cond_6

    .line 79
    .line 80
    :goto_4
    move v3, v2

    .line 81
    goto/16 :goto_9

    .line 82
    .line 83
    :cond_6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    sget-object v6, Lox;->α:Ljava/lang/Object;

    .line 88
    .line 89
    sget-object v6, Lkx;->ц:Lkx;

    .line 90
    .line 91
    invoke-static {v6, p0}, Lox;->σ(Lkx;Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 92
    .line 93
    .line 94
    move-result-object v6

    .line 95
    if-eqz v6, :cond_9

    .line 96
    .line 97
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 98
    .line 99
    .line 100
    move-result-object v6

    .line 101
    :cond_7
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 102
    .line 103
    .line 104
    move-result v7

    .line 105
    if-eqz v7, :cond_8

    .line 106
    .line 107
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v7

    .line 111
    move-object v8, v7

    .line 112
    check-cast v8, Ljava/lang/reflect/Method;

    .line 113
    .line 114
    invoke-static {v8}, Lzj0;->π(Ljava/lang/reflect/Method;)Z

    .line 115
    .line 116
    .line 117
    move-result v12

    .line 118
    if-eqz v12, :cond_7

    .line 119
    .line 120
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    move-result-object v8

    .line 124
    invoke-virtual {v8, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 125
    .line 126
    .line 127
    move-result v8

    .line 128
    if-eqz v8, :cond_7

    .line 129
    .line 130
    goto :goto_5

    .line 131
    :cond_8
    move-object v7, v10

    .line 132
    :goto_5
    check-cast v7, Ljava/lang/reflect/Method;

    .line 133
    .line 134
    if-eqz v7, :cond_9

    .line 135
    .line 136
    invoke-virtual {v7, v11}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 137
    .line 138
    .line 139
    :goto_6
    move-object v12, v7

    .line 140
    goto :goto_7

    .line 141
    :cond_9
    invoke-static {}, Lzj0;->ω()[Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    move-result-object v6

    .line 145
    const/4 v7, 0x6

    .line 146
    invoke-static {v6, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v6

    .line 150
    check-cast v6, [Ljava/lang/Class;

    .line 151
    .line 152
    const-string v7, "LJIIL"

    .line 153
    .line 154
    invoke-static {v5, v7, v6}, Lzj0;->θ(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 155
    .line 156
    .line 157
    move-result-object v7

    .line 158
    if-eqz v7, :cond_a

    .line 159
    .line 160
    invoke-virtual {v7, v11}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 161
    .line 162
    .line 163
    goto :goto_6

    .line 164
    :cond_a
    invoke-static {v5}, Lzj0;->η(Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 165
    .line 166
    .line 167
    move-result-object v7

    .line 168
    if-eqz v7, :cond_b

    .line 169
    .line 170
    invoke-virtual {v7, v11}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 171
    .line 172
    .line 173
    goto :goto_6

    .line 174
    :cond_b
    move-object v12, v10

    .line 175
    :goto_7
    if-nez v12, :cond_c

    .line 176
    .line 177
    goto :goto_4

    .line 178
    :cond_c
    :try_start_2
    invoke-virtual {v12, v11}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 179
    .line 180
    .line 181
    const/16 v5, -0x3e9

    .line 182
    .line 183
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 184
    .line 185
    .line 186
    move-result-object v6

    .line 187
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 188
    .line 189
    .line 190
    move-result-wide v7

    .line 191
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 192
    .line 193
    .line 194
    move-result-object v7

    .line 195
    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 196
    .line 197
    move-object v5, v3

    .line 198
    filled-new-array/range {v3 .. v8}, [Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v3

    .line 202
    invoke-virtual {v12, v0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 206
    .line 207
    goto :goto_8

    .line 208
    :catchall_2
    move-exception v0

    .line 209
    new-instance v3, Leo1;

    .line 210
    .line 211
    invoke-direct {v3, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 212
    .line 213
    .line 214
    move-object v0, v3

    .line 215
    :goto_8
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 216
    .line 217
    .line 218
    move-result-object v3

    .line 219
    if-eqz v3, :cond_d

    .line 220
    .line 221
    invoke-static {v3}, Lzj0;->Η(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 222
    .line 223
    .line 224
    move-result-object v3

    .line 225
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v3

    .line 229
    const-string v5, "DYHelperIMMarkAllReadHelper: \u8c03\u7528\u6d88\u606f\u5e95\u680f\u5b98\u65b9\u540c\u6b65\u5165\u53e3\u5931\u8d25 reason=mark_all_read: "

    .line 230
    .line 231
    invoke-static {v5, v3}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    :cond_d
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 235
    .line 236
    instance-of v5, v0, Leo1;

    .line 237
    .line 238
    if-eqz v5, :cond_e

    .line 239
    .line 240
    move-object v0, v3

    .line 241
    :cond_e
    check-cast v0, Ljava/lang/Boolean;

    .line 242
    .line 243
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 244
    .line 245
    .line 246
    move-result v0

    .line 247
    move v3, v0

    .line 248
    :goto_9
    if-eqz p1, :cond_21

    .line 249
    .line 250
    :try_start_3
    const-string v0, "~7918AA8387C201967A78D8C508850873CE3917C7649E64AEFEF68349924683F73255C4"

    .line 251
    .line 252
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    invoke-static {v0, v2, p0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 261
    .line 262
    .line 263
    const-string v5, "get"

    .line 264
    .line 265
    new-array v6, v2, [Ljava/lang/Class;

    .line 266
    .line 267
    invoke-static {v0, v5, v6}, Lzj0;->θ(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    if-nez v0, :cond_f

    .line 272
    .line 273
    goto :goto_a

    .line 274
    :cond_f
    invoke-virtual {v0, v11}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v0, v10, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    if-nez v0, :cond_10

    .line 282
    .line 283
    goto :goto_a

    .line 284
    :cond_10
    const-string v5, "getMiscService"

    .line 285
    .line 286
    invoke-static {v0, v5}, Lzj0;->μ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    if-nez v0, :cond_11

    .line 291
    .line 292
    goto :goto_a

    .line 293
    :cond_11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 294
    .line 295
    .line 296
    move-result-object v5

    .line 297
    const-string v6, "setUnReadNotification"

    .line 298
    .line 299
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 300
    .line 301
    .line 302
    filled-new-array {v9}, [Ljava/lang/Class;

    .line 303
    .line 304
    .line 305
    move-result-object v7

    .line 306
    invoke-static {v5, v6, v7}, Lzj0;->θ(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 307
    .line 308
    .line 309
    move-result-object v5

    .line 310
    if-nez v5, :cond_12

    .line 311
    .line 312
    goto :goto_a

    .line 313
    :cond_12
    invoke-virtual {v5, v11}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 314
    .line 315
    .line 316
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v4

    .line 320
    invoke-virtual {v5, v0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 321
    .line 322
    .line 323
    :goto_a
    move-object v4, v1

    .line 324
    goto :goto_b

    .line 325
    :catchall_3
    move-exception v0

    .line 326
    new-instance v4, Leo1;

    .line 327
    .line 328
    invoke-direct {v4, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 329
    .line 330
    .line 331
    :goto_b
    invoke-static {v4}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 332
    .line 333
    .line 334
    move-result-object v0

    .line 335
    if-eqz v0, :cond_13

    .line 336
    .line 337
    invoke-static {v0}, Lzj0;->Η(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    const-string v4, "DYHelperIMMarkAllReadHelper: IMProxy.setUnReadNotification(0) \u5931\u8d25: "

    .line 346
    .line 347
    invoke-static {v4, v0}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 348
    .line 349
    .line 350
    :cond_13
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 351
    .line 352
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 353
    .line 354
    .line 355
    sget-object v4, Lox;->α:Ljava/lang/Object;

    .line 356
    .line 357
    sget-object v4, Lkx;->ч:Lkx;

    .line 358
    .line 359
    invoke-static {v4, p0}, Lox;->σ(Lkx;Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 360
    .line 361
    .line 362
    move-result-object v4

    .line 363
    if-eqz v4, :cond_14

    .line 364
    .line 365
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 366
    .line 367
    .line 368
    move-result-object v4

    .line 369
    :goto_c
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 370
    .line 371
    .line 372
    move-result v5

    .line 373
    if-eqz v5, :cond_14

    .line 374
    .line 375
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v5

    .line 379
    check-cast v5, Ljava/lang/reflect/Method;

    .line 380
    .line 381
    invoke-interface {v0, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 382
    .line 383
    .line 384
    goto :goto_c

    .line 385
    :cond_14
    :try_start_4
    const-string v4, "X.C1D2R"

    .line 386
    .line 387
    invoke-static {v4, v2, p0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 388
    .line 389
    .line 390
    move-result-object v4

    .line 391
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 392
    .line 393
    .line 394
    const-string v5, "LIZIZ"

    .line 395
    .line 396
    new-array v6, v2, [Ljava/lang/Class;

    .line 397
    .line 398
    invoke-static {v4, v5, v6}, Lzj0;->θ(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 399
    .line 400
    .line 401
    move-result-object v4

    .line 402
    if-eqz v4, :cond_15

    .line 403
    .line 404
    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 405
    .line 406
    .line 407
    :catchall_4
    :cond_15
    new-instance v4, Lf7;

    .line 408
    .line 409
    invoke-direct {v4, v11, v0}, Lf7;-><init>(ILjava/lang/Object;)V

    .line 410
    .line 411
    .line 412
    new-instance v0, Lfj0;

    .line 413
    .line 414
    const/16 v5, 0xf

    .line 415
    .line 416
    invoke-direct {v0, v5}, Lfj0;-><init>(I)V

    .line 417
    .line 418
    .line 419
    new-instance v5, Ly30;

    .line 420
    .line 421
    invoke-direct {v5, v4, v11, v0}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 422
    .line 423
    .line 424
    new-instance v0, Lfj0;

    .line 425
    .line 426
    const/16 v4, 0x10

    .line 427
    .line 428
    invoke-direct {v0, v4}, Lfj0;-><init>(I)V

    .line 429
    .line 430
    .line 431
    new-instance v4, Lbu;

    .line 432
    .line 433
    invoke-interface {v5}, Lss1;->iterator()Ljava/util/Iterator;

    .line 434
    .line 435
    .line 436
    move-result-object v5

    .line 437
    invoke-direct {v4, v5, v0}, Lbu;-><init>(Ljava/util/Iterator;La80;)V

    .line 438
    .line 439
    .line 440
    :cond_16
    :goto_d
    invoke-virtual {v4}, Lσ;->hasNext()Z

    .line 441
    .line 442
    .line 443
    move-result v0

    .line 444
    const-string v5, ": "

    .line 445
    .line 446
    const-string v6, "~796C0BCB62BCE6FE82C87A254D6EEBA7FF748413BC384A31402FE9BA9F30948A670001E2D4808D3133D3F257606C724B89E9F07FB88FFFB404014B46C523"

    .line 447
    .line 448
    if-eqz v0, :cond_1c

    .line 449
    .line 450
    invoke-virtual {v4}, Lσ;->next()Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    move-result-object v0

    .line 454
    move-object v7, v0

    .line 455
    check-cast v7, Ljava/lang/reflect/Method;

    .line 456
    .line 457
    :try_start_5
    invoke-virtual {v7, v11}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 458
    .line 459
    .line 460
    invoke-virtual {v7, v10, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object v8

    .line 464
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 465
    .line 466
    .line 467
    move-result-object v0

    .line 468
    if-nez v8, :cond_17

    .line 469
    .line 470
    move v0, v2

    .line 471
    goto :goto_10

    .line 472
    :cond_17
    if-eqz v0, :cond_18

    .line 473
    .line 474
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 475
    .line 476
    .line 477
    move-result-object v0

    .line 478
    goto :goto_e

    .line 479
    :cond_18
    move-object v0, v10

    .line 480
    :goto_e
    invoke-static {v6}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 481
    .line 482
    .line 483
    move-result-object v12

    .line 484
    invoke-static {v0, v12}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 485
    .line 486
    .line 487
    move-result v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_6

    .line 488
    if-eqz v0, :cond_19

    .line 489
    .line 490
    move v0, v11

    .line 491
    goto :goto_10

    .line 492
    :cond_19
    :try_start_6
    invoke-static {v6}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 493
    .line 494
    .line 495
    move-result-object v0

    .line 496
    invoke-static {v0, v2, p0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 497
    .line 498
    .line 499
    move-result-object v0

    .line 500
    invoke-virtual {v0, v8}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 501
    .line 502
    .line 503
    move-result v0

    .line 504
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 505
    .line 506
    .line 507
    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 508
    goto :goto_f

    .line 509
    :catchall_5
    move-exception v0

    .line 510
    :try_start_7
    new-instance v12, Leo1;

    .line 511
    .line 512
    invoke-direct {v12, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 513
    .line 514
    .line 515
    move-object v0, v12

    .line 516
    :goto_f
    sget-object v12, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 517
    .line 518
    instance-of v13, v0, Leo1;

    .line 519
    .line 520
    if-eqz v13, :cond_1a

    .line 521
    .line 522
    move-object v0, v12

    .line 523
    :cond_1a
    check-cast v0, Ljava/lang/Boolean;

    .line 524
    .line 525
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 526
    .line 527
    .line 528
    move-result v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 529
    :goto_10
    if-eqz v0, :cond_1b

    .line 530
    .line 531
    goto :goto_12

    .line 532
    :cond_1b
    move-object v6, v1

    .line 533
    goto :goto_11

    .line 534
    :catchall_6
    move-exception v0

    .line 535
    new-instance v6, Leo1;

    .line 536
    .line 537
    invoke-direct {v6, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 538
    .line 539
    .line 540
    :goto_11
    invoke-static {v6}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 541
    .line 542
    .line 543
    move-result-object v0

    .line 544
    if-eqz v0, :cond_16

    .line 545
    .line 546
    invoke-static {v7}, Lzj0;->Δ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 547
    .line 548
    .line 549
    move-result-object v6

    .line 550
    invoke-static {v0}, Lzj0;->Η(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 551
    .line 552
    .line 553
    move-result-object v0

    .line 554
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 555
    .line 556
    .line 557
    move-result-object v0

    .line 558
    new-instance v7, Ljava/lang/StringBuilder;

    .line 559
    .line 560
    const-string v8, "DYHelperIMMarkAllReadHelper: \u83b7\u53d6\u9996\u9875\u5e95\u680f\u80fd\u529b\u5931\u8d25 "

    .line 561
    .line 562
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 563
    .line 564
    .line 565
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 566
    .line 567
    .line 568
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 569
    .line 570
    .line 571
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 572
    .line 573
    .line 574
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 575
    .line 576
    .line 577
    move-result-object v0

    .line 578
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 579
    .line 580
    .line 581
    goto/16 :goto_d

    .line 582
    .line 583
    :cond_1c
    move-object v8, v10

    .line 584
    :goto_12
    if-nez v8, :cond_1d

    .line 585
    .line 586
    goto/16 :goto_15

    .line 587
    .line 588
    :cond_1d
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 589
    .line 590
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 591
    .line 592
    .line 593
    sget-object v1, Lox;->α:Ljava/lang/Object;

    .line 594
    .line 595
    sget-object v1, Lkx;->ш:Lkx;

    .line 596
    .line 597
    invoke-static {v1, p0}, Lox;->σ(Lkx;Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 598
    .line 599
    .line 600
    move-result-object v1

    .line 601
    if-eqz v1, :cond_1e

    .line 602
    .line 603
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 604
    .line 605
    .line 606
    move-result-object v1

    .line 607
    :goto_13
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 608
    .line 609
    .line 610
    move-result v4

    .line 611
    if-eqz v4, :cond_1e

    .line 612
    .line 613
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 614
    .line 615
    .line 616
    move-result-object v4

    .line 617
    check-cast v4, Ljava/lang/reflect/Method;

    .line 618
    .line 619
    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 620
    .line 621
    .line 622
    goto :goto_13

    .line 623
    :cond_1e
    :try_start_8
    invoke-static {v6}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 624
    .line 625
    .line 626
    move-result-object v1

    .line 627
    invoke-static {v1, v2, p0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 628
    .line 629
    .line 630
    move-result-object v1

    .line 631
    const-string v4, "X.C2252171Cxw"

    .line 632
    .line 633
    invoke-static {v4, v2, p0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 634
    .line 635
    .line 636
    move-result-object p0

    .line 637
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 638
    .line 639
    .line 640
    const-string v4, "LIZ"

    .line 641
    .line 642
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 643
    .line 644
    .line 645
    const-class v6, Ljava/lang/String;

    .line 646
    .line 647
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 648
    .line 649
    .line 650
    sget-object v7, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 651
    .line 652
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 653
    .line 654
    .line 655
    filled-new-array {v1, v6, v9, v7, v9}, [Ljava/lang/Class;

    .line 656
    .line 657
    .line 658
    move-result-object v1

    .line 659
    invoke-static {p0, v4, v1}, Lzj0;->θ(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 660
    .line 661
    .line 662
    move-result-object p0

    .line 663
    if-eqz p0, :cond_1f

    .line 664
    .line 665
    invoke-interface {v0, p0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    .line 666
    .line 667
    .line 668
    :catchall_7
    :cond_1f
    new-instance p0, Lf7;

    .line 669
    .line 670
    invoke-direct {p0, v11, v0}, Lf7;-><init>(ILjava/lang/Object;)V

    .line 671
    .line 672
    .line 673
    new-instance v0, Lfj0;

    .line 674
    .line 675
    const/4 v1, 0x7

    .line 676
    invoke-direct {v0, v1}, Lfj0;-><init>(I)V

    .line 677
    .line 678
    .line 679
    new-instance v1, Ly30;

    .line 680
    .line 681
    invoke-direct {v1, p0, v11, v0}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 682
    .line 683
    .line 684
    new-instance p0, Lfj0;

    .line 685
    .line 686
    const/16 v0, 0xc

    .line 687
    .line 688
    invoke-direct {p0, v0}, Lfj0;-><init>(I)V

    .line 689
    .line 690
    .line 691
    new-instance v4, Lbu;

    .line 692
    .line 693
    invoke-interface {v1}, Lss1;->iterator()Ljava/util/Iterator;

    .line 694
    .line 695
    .line 696
    move-result-object v0

    .line 697
    invoke-direct {v4, v0, p0}, Lbu;-><init>(Ljava/util/Iterator;La80;)V

    .line 698
    .line 699
    .line 700
    :cond_20
    :goto_14
    invoke-virtual {v4}, Lσ;->hasNext()Z

    .line 701
    .line 702
    .line 703
    move-result p0

    .line 704
    if-eqz p0, :cond_21

    .line 705
    .line 706
    invoke-virtual {v4}, Lσ;->next()Ljava/lang/Object;

    .line 707
    .line 708
    .line 709
    move-result-object p0

    .line 710
    check-cast p0, Ljava/lang/reflect/Method;

    .line 711
    .line 712
    :try_start_9
    invoke-virtual {p0, v11}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 713
    .line 714
    .line 715
    const-string v0, "homepage_notification"

    .line 716
    .line 717
    const/4 v1, 0x2

    .line 718
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 719
    .line 720
    .line 721
    move-result-object v1

    .line 722
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 723
    .line 724
    const/4 v7, 0x4

    .line 725
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 726
    .line 727
    .line 728
    move-result-object v7

    .line 729
    filled-new-array {v8, v0, v1, v6, v7}, [Ljava/lang/Object;

    .line 730
    .line 731
    .line 732
    move-result-object v0

    .line 733
    invoke-virtual {p0, v10, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_8

    .line 734
    .line 735
    .line 736
    move v2, v11

    .line 737
    goto :goto_15

    .line 738
    :catchall_8
    move-exception v0

    .line 739
    new-instance v1, Leo1;

    .line 740
    .line 741
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 742
    .line 743
    .line 744
    invoke-static {v1}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 745
    .line 746
    .line 747
    move-result-object v0

    .line 748
    if-eqz v0, :cond_20

    .line 749
    .line 750
    invoke-static {p0}, Lzj0;->Δ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 751
    .line 752
    .line 753
    move-result-object p0

    .line 754
    invoke-static {v0}, Lzj0;->Η(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 755
    .line 756
    .line 757
    move-result-object v0

    .line 758
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 759
    .line 760
    .line 761
    move-result-object v0

    .line 762
    new-instance v1, Ljava/lang/StringBuilder;

    .line 763
    .line 764
    const-string v6, "DYHelperIMMarkAllReadHelper: \u6e05\u7406\u9996\u9875\u6d88\u606f\u5e95\u680f\u7ea2\u70b9\u5931\u8d25 "

    .line 765
    .line 766
    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 767
    .line 768
    .line 769
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 770
    .line 771
    .line 772
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 773
    .line 774
    .line 775
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 776
    .line 777
    .line 778
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 779
    .line 780
    .line 781
    move-result-object p0

    .line 782
    invoke-static {p0}, Lux;->ρ(Ljava/lang/String;)V

    .line 783
    .line 784
    .line 785
    goto :goto_14

    .line 786
    :cond_21
    :goto_15
    if-nez v3, :cond_22

    .line 787
    .line 788
    if-eqz v2, :cond_23

    .line 789
    .line 790
    :cond_22
    new-instance p0, Ljava/lang/StringBuilder;

    .line 791
    .line 792
    const-string v0, "DYHelperIMMarkAllReadHelper: \u5df2\u540c\u6b65\u6d88\u606f\u5e95\u680f\u672a\u8bfb\u663e\u793a reason=mark_all_read helper="

    .line 793
    .line 794
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 795
    .line 796
    .line 797
    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 798
    .line 799
    .line 800
    const-string v0, " forceZero="

    .line 801
    .line 802
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 803
    .line 804
    .line 805
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 806
    .line 807
    .line 808
    const-string p1, " hide="

    .line 809
    .line 810
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 811
    .line 812
    .line 813
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 814
    .line 815
    .line 816
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 817
    .line 818
    .line 819
    move-result-object p0

    .line 820
    invoke-static {p0}, Lux;->ρ(Ljava/lang/String;)V

    .line 821
    .line 822
    .line 823
    :cond_23
    return-void
.end method

.method public static Ζ(Ljava/lang/Class;Ljava/util/ArrayList;)Ljava/lang/Object;
    .locals 11

    .line 1
    const-string v4, "getInstance"

    .line 2
    .line 3
    const-string v5, "getConversationListModel"

    .line 4
    .line 5
    const-string v0, "LIZ"

    .line 6
    .line 7
    const-string v1, "LIZIZ"

    .line 8
    .line 9
    const-string v2, "LIZJ"

    .line 10
    .line 11
    const-string v3, "inst"

    .line 12
    .line 13
    filled-new-array/range {v0 .. v5}, [Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Lg7;->о([Ljava/lang/Object;)Ljava/util/Set;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-static {p0}, Lzj0;->γ(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    new-instance v2, Ljava/util/HashSet;

    .line 26
    .line 27
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 28
    .line 29
    .line 30
    new-instance v3, Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    if-eqz v4, :cond_1

    .line 44
    .line 45
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    move-object v5, v4

    .line 50
    check-cast v5, Ljava/lang/reflect/Method;

    .line 51
    .line 52
    invoke-static {v5}, Lzj0;->Δ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    invoke-virtual {v2, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    if-eqz v5, :cond_0

    .line 61
    .line 62
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    .line 67
    .line 68
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    if-eqz v4, :cond_3

    .line 80
    .line 81
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    move-object v5, v4

    .line 86
    check-cast v5, Ljava/lang/reflect/Method;

    .line 87
    .line 88
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 89
    .line 90
    .line 91
    move-result v6

    .line 92
    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 93
    .line 94
    .line 95
    move-result v6

    .line 96
    if-eqz v6, :cond_2

    .line 97
    .line 98
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    move-result-object v6

    .line 102
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    array-length v6, v6

    .line 106
    if-nez v6, :cond_2

    .line 107
    .line 108
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    invoke-interface {v1, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v5

    .line 116
    if-eqz v5, :cond_2

    .line 117
    .line 118
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    :cond_4
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    const-string v4, " "

    .line 131
    .line 132
    const-string v5, "#"

    .line 133
    .line 134
    const-string v6, ""

    .line 135
    .line 136
    const/4 v7, 0x1

    .line 137
    const/4 v8, 0x0

    .line 138
    if-eqz v0, :cond_7

    .line 139
    .line 140
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    move-object v9, v0

    .line 145
    check-cast v9, Ljava/lang/reflect/Method;

    .line 146
    .line 147
    :try_start_0
    invoke-virtual {v9, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v9, v8, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    invoke-static {v0}, Lzj0;->Α(Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 158
    if-eqz v0, :cond_5

    .line 159
    .line 160
    return-object v0

    .line 161
    :catchall_0
    move-exception v0

    .line 162
    new-instance v8, Leo1;

    .line 163
    .line 164
    invoke-direct {v8, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 165
    .line 166
    .line 167
    :cond_5
    invoke-static {v8}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    if-eqz v0, :cond_4

    .line 172
    .line 173
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v7

    .line 177
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v8

    .line 181
    invoke-static {v0}, Lzj0;->Η(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    if-nez v0, :cond_6

    .line 190
    .line 191
    goto :goto_3

    .line 192
    :cond_6
    move-object v6, v0

    .line 193
    :goto_3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 194
    .line 195
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    goto :goto_2

    .line 221
    :cond_7
    new-instance v0, Ljava/util/ArrayList;

    .line 222
    .line 223
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    :cond_8
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 231
    .line 232
    .line 233
    move-result v3

    .line 234
    if-eqz v3, :cond_9

    .line 235
    .line 236
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v3

    .line 240
    move-object v9, v3

    .line 241
    check-cast v9, Ljava/lang/reflect/Method;

    .line 242
    .line 243
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 244
    .line 245
    .line 246
    move-result v10

    .line 247
    invoke-static {v10}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 248
    .line 249
    .line 250
    move-result v10

    .line 251
    if-eqz v10, :cond_8

    .line 252
    .line 253
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    move-result-object v10

    .line 257
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 258
    .line 259
    .line 260
    array-length v10, v10

    .line 261
    if-nez v10, :cond_8

    .line 262
    .line 263
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 264
    .line 265
    .line 266
    move-result-object v9

    .line 267
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 268
    .line 269
    .line 270
    invoke-static {v9}, Lzj0;->υ(Ljava/lang/Class;)Z

    .line 271
    .line 272
    .line 273
    move-result v9

    .line 274
    if-eqz v9, :cond_8

    .line 275
    .line 276
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 277
    .line 278
    .line 279
    goto :goto_4

    .line 280
    :cond_9
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 281
    .line 282
    .line 283
    move-result-object v2

    .line 284
    :cond_a
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 285
    .line 286
    .line 287
    move-result v0

    .line 288
    if-eqz v0, :cond_d

    .line 289
    .line 290
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    move-object v3, v0

    .line 295
    check-cast v3, Ljava/lang/reflect/Method;

    .line 296
    .line 297
    :try_start_1
    invoke-virtual {v3, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v3, v8, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    invoke-static {v0}, Lzj0;->Α(Ljava/lang/Object;)Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 308
    if-eqz v0, :cond_b

    .line 309
    .line 310
    return-object v0

    .line 311
    :cond_b
    move-object v9, v8

    .line 312
    goto :goto_6

    .line 313
    :catchall_1
    move-exception v0

    .line 314
    new-instance v9, Leo1;

    .line 315
    .line 316
    invoke-direct {v9, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 317
    .line 318
    .line 319
    :goto_6
    invoke-static {v9}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    if-eqz v0, :cond_a

    .line 324
    .line 325
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v9

    .line 329
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v3

    .line 333
    invoke-static {v0}, Lzj0;->Η(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    if-nez v0, :cond_c

    .line 342
    .line 343
    move-object v0, v6

    .line 344
    :cond_c
    new-instance v10, Ljava/lang/StringBuilder;

    .line 345
    .line 346
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 347
    .line 348
    .line 349
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 350
    .line 351
    .line 352
    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 353
    .line 354
    .line 355
    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 356
    .line 357
    .line 358
    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 359
    .line 360
    .line 361
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 362
    .line 363
    .line 364
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 369
    .line 370
    .line 371
    goto :goto_5

    .line 372
    :cond_d
    const-string p1, "Companion"

    .line 373
    .line 374
    move-object v2, p0

    .line 375
    :goto_7
    if-eqz v2, :cond_10

    .line 376
    .line 377
    :try_start_2
    invoke-virtual {v2, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 378
    .line 379
    .line 380
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 381
    goto :goto_8

    .line 382
    :catchall_2
    move-exception v0

    .line 383
    new-instance v3, Leo1;

    .line 384
    .line 385
    invoke-direct {v3, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 386
    .line 387
    .line 388
    move-object v0, v3

    .line 389
    :goto_8
    instance-of v3, v0, Leo1;

    .line 390
    .line 391
    if-eqz v3, :cond_e

    .line 392
    .line 393
    move-object v0, v8

    .line 394
    :cond_e
    check-cast v0, Ljava/lang/reflect/Field;

    .line 395
    .line 396
    if-eqz v0, :cond_f

    .line 397
    .line 398
    goto :goto_9

    .line 399
    :cond_f
    invoke-virtual {v2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 400
    .line 401
    .line 402
    move-result-object v2

    .line 403
    goto :goto_7

    .line 404
    :cond_10
    move-object v0, v8

    .line 405
    :goto_9
    if-nez v0, :cond_11

    .line 406
    .line 407
    move-object p1, v8

    .line 408
    goto :goto_a

    .line 409
    :cond_11
    invoke-virtual {v0, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 410
    .line 411
    .line 412
    invoke-virtual {v0, v8}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    move-result-object p1

    .line 416
    :goto_a
    if-eqz p1, :cond_15

    .line 417
    .line 418
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 419
    .line 420
    .line 421
    move-result-object v0

    .line 422
    invoke-static {v0}, Lzj0;->γ(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 423
    .line 424
    .line 425
    move-result-object v0

    .line 426
    new-instance v2, Ljava/util/ArrayList;

    .line 427
    .line 428
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 429
    .line 430
    .line 431
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    :cond_12
    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 436
    .line 437
    .line 438
    move-result v3

    .line 439
    if-eqz v3, :cond_13

    .line 440
    .line 441
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 442
    .line 443
    .line 444
    move-result-object v3

    .line 445
    move-object v4, v3

    .line 446
    check-cast v4, Ljava/lang/reflect/Method;

    .line 447
    .line 448
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 449
    .line 450
    .line 451
    move-result-object v5

    .line 452
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 453
    .line 454
    .line 455
    array-length v5, v5

    .line 456
    if-nez v5, :cond_12

    .line 457
    .line 458
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 459
    .line 460
    .line 461
    move-result-object v4

    .line 462
    invoke-interface {v1, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 463
    .line 464
    .line 465
    move-result v4

    .line 466
    if-eqz v4, :cond_12

    .line 467
    .line 468
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 469
    .line 470
    .line 471
    goto :goto_b

    .line 472
    :cond_13
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 473
    .line 474
    .line 475
    move-result-object v0

    .line 476
    :catchall_3
    :cond_14
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 477
    .line 478
    .line 479
    move-result v1

    .line 480
    if-eqz v1, :cond_15

    .line 481
    .line 482
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 483
    .line 484
    .line 485
    move-result-object v1

    .line 486
    check-cast v1, Ljava/lang/reflect/Method;

    .line 487
    .line 488
    :try_start_3
    invoke-virtual {v1, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 489
    .line 490
    .line 491
    invoke-virtual {v1, p1, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 492
    .line 493
    .line 494
    move-result-object v1

    .line 495
    invoke-static {v1}, Lzj0;->Α(Ljava/lang/Object;)Ljava/lang/Object;

    .line 496
    .line 497
    .line 498
    move-result-object v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 499
    if-eqz v1, :cond_14

    .line 500
    .line 501
    return-object v1

    .line 502
    :cond_15
    new-instance p1, Ljava/util/ArrayList;

    .line 503
    .line 504
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 505
    .line 506
    .line 507
    :goto_c
    if-eqz p0, :cond_16

    .line 508
    .line 509
    invoke-static {p0, p1}, Llz1;->ι(Ljava/lang/Class;Ljava/util/ArrayList;)Ljava/lang/Class;

    .line 510
    .line 511
    .line 512
    move-result-object p0

    .line 513
    goto :goto_c

    .line 514
    :cond_16
    new-instance p0, Ljava/util/ArrayList;

    .line 515
    .line 516
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 517
    .line 518
    .line 519
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 520
    .line 521
    .line 522
    move-result-object p1

    .line 523
    :cond_17
    :goto_d
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 524
    .line 525
    .line 526
    move-result v0

    .line 527
    if-eqz v0, :cond_19

    .line 528
    .line 529
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 530
    .line 531
    .line 532
    move-result-object v0

    .line 533
    move-object v1, v0

    .line 534
    check-cast v1, Ljava/lang/reflect/Field;

    .line 535
    .line 536
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 537
    .line 538
    .line 539
    move-result v2

    .line 540
    invoke-static {v2}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 541
    .line 542
    .line 543
    move-result v2

    .line 544
    if-eqz v2, :cond_17

    .line 545
    .line 546
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 547
    .line 548
    .line 549
    move-result-object v2

    .line 550
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 551
    .line 552
    .line 553
    invoke-static {v2}, Lzj0;->υ(Ljava/lang/Class;)Z

    .line 554
    .line 555
    .line 556
    move-result v2

    .line 557
    if-nez v2, :cond_18

    .line 558
    .line 559
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 560
    .line 561
    .line 562
    move-result-object v2

    .line 563
    const-string v3, "LIZ"

    .line 564
    .line 565
    invoke-static {v2, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 566
    .line 567
    .line 568
    move-result v2

    .line 569
    if-nez v2, :cond_18

    .line 570
    .line 571
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 572
    .line 573
    .line 574
    move-result-object v2

    .line 575
    const-string v3, "LIZIZ"

    .line 576
    .line 577
    invoke-static {v2, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 578
    .line 579
    .line 580
    move-result v2

    .line 581
    if-nez v2, :cond_18

    .line 582
    .line 583
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 584
    .line 585
    .line 586
    move-result-object v1

    .line 587
    const-string v2, "INSTANCE"

    .line 588
    .line 589
    invoke-static {v1, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 590
    .line 591
    .line 592
    move-result v1

    .line 593
    if-eqz v1, :cond_17

    .line 594
    .line 595
    :cond_18
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 596
    .line 597
    .line 598
    goto :goto_d

    .line 599
    :cond_19
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 600
    .line 601
    .line 602
    move-result-object p0

    .line 603
    :catchall_4
    :cond_1a
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 604
    .line 605
    .line 606
    move-result p1

    .line 607
    if-eqz p1, :cond_1b

    .line 608
    .line 609
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 610
    .line 611
    .line 612
    move-result-object p1

    .line 613
    check-cast p1, Ljava/lang/reflect/Field;

    .line 614
    .line 615
    :try_start_4
    invoke-virtual {p1, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 616
    .line 617
    .line 618
    invoke-virtual {p1, v8}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 619
    .line 620
    .line 621
    move-result-object p1

    .line 622
    invoke-static {p1}, Lzj0;->Α(Ljava/lang/Object;)Ljava/lang/Object;

    .line 623
    .line 624
    .line 625
    move-result-object p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 626
    if-eqz p1, :cond_1a

    .line 627
    .line 628
    return-object p1

    .line 629
    :cond_1b
    return-object v8
.end method

.method public static Η(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    .locals 2

    .line 1
    :goto_0
    instance-of v0, p0, Ljava/lang/reflect/InvocationTargetException;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p0

    .line 6
    check-cast v0, Ljava/lang/reflect/InvocationTargetException;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return-object p0
.end method

.method public static final α(Lzj0;Ljava/lang/reflect/Method;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 13
    .line 14
    invoke-static {p1, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    const/4 v0, 0x0

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    array-length p1, p0

    .line 22
    const/4 v1, 0x2

    .line 23
    if-ne p1, v1, :cond_0

    .line 24
    .line 25
    aget-object p1, p0, v0

    .line 26
    .line 27
    const-class v1, Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {p1, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_0

    .line 34
    .line 35
    const/4 p1, 0x1

    .line 36
    aget-object p0, p0, p1

    .line 37
    .line 38
    const-class v1, [I

    .line 39
    .line 40
    invoke-static {p0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    if-eqz p0, :cond_0

    .line 45
    .line 46
    return p1

    .line 47
    :cond_0
    return v0
.end method

.method public static final β(Lorg/luckypray/dexkit/result/MethodDataList;Ljava/lang/ClassLoader;)Ljava/util/ArrayList;
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

.method public static γ(Ljava/lang/Class;)Ljava/util/ArrayList;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    move-object v1, p0

    .line 7
    :goto_0
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-static {v0, v2}, Lxh;->э(Ljava/util/AbstractCollection;[Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-static {v0, p0}, Lxh;->э(Ljava/util/AbstractCollection;[Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    new-instance p0, Ljava/util/HashSet;

    .line 35
    .line 36
    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 37
    .line 38
    .line 39
    new-instance v1, Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-eqz v2, :cond_2

    .line 53
    .line 54
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    move-object v3, v2

    .line 59
    check-cast v3, Ljava/lang/reflect/Method;

    .line 60
    .line 61
    invoke-static {v3}, Lzj0;->Δ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-virtual {p0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-eqz v3, :cond_1

    .line 70
    .line 71
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_2
    return-object v1
.end method

.method public static δ(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-static {p0}, Lzj0;->ξ(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    sget-object v0, Lzj0;->ε:Ljava/lang/ref/WeakReference;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    goto :goto_0

    .line 17
    :cond_1
    const/4 v0, 0x0

    .line 18
    :goto_0
    if-ne v0, p0, :cond_2

    .line 19
    .line 20
    :goto_1
    return-void

    .line 21
    :cond_2
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 22
    .line 23
    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    sput-object v0, Lzj0;->ε:Ljava/lang/ref/WeakReference;

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    new-instance v0, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    const-string v1, "DYHelperIMMarkAllReadHelper: \u6355\u83b7 ConversationListModel \u5b9e\u4f8b: "

    .line 39
    .line 40
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string p1, " -> "

    .line 47
    .line 48
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-static {p0}, Lux;->ρ(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public static varargs ζ([Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 6

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_0
    const/4 v2, 0x0

    .line 4
    if-ge v1, v0, :cond_3

    .line 5
    .line 6
    aget-object v3, p0, v1

    .line 7
    .line 8
    :try_start_0
    array-length v4, p2

    .line 9
    invoke-static {p2, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    check-cast v4, [Ljava/lang/Class;

    .line 14
    .line 15
    invoke-virtual {v3, p1, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 16
    .line 17
    .line 18
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    goto :goto_1

    .line 20
    :catchall_0
    move-exception v4

    .line 21
    new-instance v5, Leo1;

    .line 22
    .line 23
    invoke-direct {v5, v4}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 24
    .line 25
    .line 26
    move-object v4, v5

    .line 27
    :goto_1
    instance-of v5, v4, Leo1;

    .line 28
    .line 29
    if-eqz v5, :cond_0

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_0
    move-object v2, v4

    .line 33
    :goto_2
    check-cast v2, Ljava/lang/reflect/Method;

    .line 34
    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    return-object v2

    .line 38
    :cond_1
    invoke-virtual {v3}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    array-length v3, p2

    .line 46
    invoke-static {p2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    check-cast v3, [Ljava/lang/Class;

    .line 51
    .line 52
    invoke-static {v2, p1, v3}, Lzj0;->ζ([Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    if-eqz v2, :cond_2

    .line 57
    .line 58
    return-object v2

    .line 59
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_3
    return-object v2
.end method

.method public static η(Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 2

    .line 1
    invoke-static {p0}, Lzj0;->γ(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

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
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    move-object v1, v0

    .line 20
    check-cast v1, Ljava/lang/reflect/Method;

    .line 21
    .line 22
    invoke-static {v1}, Lzj0;->π(Ljava/lang/reflect/Method;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const/4 v0, 0x0

    .line 30
    :goto_0
    check-cast v0, Ljava/lang/reflect/Method;

    .line 31
    .line 32
    return-object v0
.end method

.method public static varargs θ(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 3

    .line 1
    :try_start_0
    array-length v0, p2

    .line 2
    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    check-cast v0, [Ljava/lang/Class;

    .line 7
    .line 8
    invoke-virtual {p0, p1, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 9
    .line 10
    .line 11
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    new-instance v1, Leo1;

    .line 15
    .line 16
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    move-object v0, v1

    .line 20
    :goto_0
    instance-of v1, v0, Leo1;

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    move-object v0, v2

    .line 26
    :cond_0
    check-cast v0, Ljava/lang/reflect/Method;

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    return-object v0

    .line 31
    :cond_1
    :goto_1
    if-eqz p0, :cond_5

    .line 32
    .line 33
    :try_start_1
    array-length v0, p2

    .line 34
    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, [Ljava/lang/Class;

    .line 39
    .line 40
    invoke-virtual {p0, p1, v0}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 41
    .line 42
    .line 43
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 44
    goto :goto_2

    .line 45
    :catchall_1
    move-exception v0

    .line 46
    new-instance v1, Leo1;

    .line 47
    .line 48
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 49
    .line 50
    .line 51
    move-object v0, v1

    .line 52
    :goto_2
    instance-of v1, v0, Leo1;

    .line 53
    .line 54
    if-eqz v1, :cond_2

    .line 55
    .line 56
    move-object v0, v2

    .line 57
    :cond_2
    check-cast v0, Ljava/lang/reflect/Method;

    .line 58
    .line 59
    if-eqz v0, :cond_3

    .line 60
    .line 61
    return-object v0

    .line 62
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    array-length v1, p2

    .line 70
    invoke-static {p2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    check-cast v1, [Ljava/lang/Class;

    .line 75
    .line 76
    invoke-static {v0, p1, v1}, Lzj0;->ζ([Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    if-eqz v0, :cond_4

    .line 81
    .line 82
    return-object v0

    .line 83
    :cond_4
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    goto :goto_1

    .line 88
    :cond_5
    return-object v2
.end method

.method public static final ι(Ljava/util/LinkedHashMap;Ljava/lang/Object;)V
    .locals 5

    .line 1
    instance-of v0, p1, Ljava/util/Map;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_5

    .line 6
    .line 7
    :cond_0
    check-cast p1, Ljava/util/Map;

    .line 8
    .line 9
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_8

    .line 22
    .line 23
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Ljava/util/Map$Entry;

    .line 28
    .line 29
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    instance-of v2, v1, Ljava/lang/Number;

    .line 38
    .line 39
    const/4 v3, 0x0

    .line 40
    if-eqz v2, :cond_2

    .line 41
    .line 42
    move-object v2, v1

    .line 43
    check-cast v2, Ljava/lang/Number;

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    move-object v2, v3

    .line 47
    :goto_1
    const/16 v4, 0xa

    .line 48
    .line 49
    if-eqz v2, :cond_3

    .line 50
    .line 51
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    goto :goto_2

    .line 60
    :cond_3
    if-eqz v1, :cond_4

    .line 61
    .line 62
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    if-eqz v1, :cond_4

    .line 67
    .line 68
    invoke-static {v1, v4}, Lx02;->Ρ(Ljava/lang/String;I)Ljava/lang/Integer;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    goto :goto_2

    .line 73
    :cond_4
    move-object v1, v3

    .line 74
    :goto_2
    instance-of v2, v0, Ljava/lang/Number;

    .line 75
    .line 76
    if-eqz v2, :cond_5

    .line 77
    .line 78
    move-object v2, v0

    .line 79
    check-cast v2, Ljava/lang/Number;

    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_5
    move-object v2, v3

    .line 83
    :goto_3
    if-eqz v2, :cond_6

    .line 84
    .line 85
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    goto :goto_4

    .line 94
    :cond_6
    if-eqz v0, :cond_7

    .line 95
    .line 96
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    if-eqz v0, :cond_7

    .line 101
    .line 102
    invoke-static {v0, v4}, Lx02;->Ρ(Ljava/lang/String;I)Ljava/lang/Integer;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    :cond_7
    :goto_4
    if-eqz v1, :cond_1

    .line 107
    .line 108
    if-eqz v3, :cond_1

    .line 109
    .line 110
    invoke-interface {p0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_8
    :goto_5
    return-void
.end method

.method public static λ(Ljava/lang/ClassLoader;)V
    .locals 9

    .line 1
    sget-object v0, Lzj0;->γ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 6
    .line 7
    .line 8
    move-result v3

    .line 9
    if-nez v3, :cond_0

    .line 10
    .line 11
    goto/16 :goto_5

    .line 12
    .line 13
    :cond_0
    new-instance v3, Ljava/util/LinkedHashSet;

    .line 14
    .line 15
    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    .line 16
    .line 17
    .line 18
    :try_start_0
    const-string v4, "~796422A8818C0EADCA9A33DA50D2E82D10279E237AB2D2E13465F36685DE700F208610F00484FDC242593DAB7C63FD6BF226A9E1C77A5F232FB29534"

    .line 19
    .line 20
    invoke-static {v4}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    invoke-static {v4, v1, p0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception v4

    .line 30
    new-instance v5, Leo1;

    .line 31
    .line 32
    invoke-direct {v5, v4}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 33
    .line 34
    .line 35
    move-object v4, v5

    .line 36
    :goto_0
    instance-of v5, v4, Leo1;

    .line 37
    .line 38
    if-eqz v5, :cond_1

    .line 39
    .line 40
    const/4 v4, 0x0

    .line 41
    :cond_1
    check-cast v4, Ljava/lang/Class;

    .line 42
    .line 43
    if-eqz v4, :cond_2

    .line 44
    .line 45
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    :cond_2
    sget-object v4, Lox;->α:Ljava/lang/Object;

    .line 49
    .line 50
    sget-object v4, Lkx;->ц:Lkx;

    .line 51
    .line 52
    invoke-static {v4, p0}, Lox;->σ(Lkx;Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    if-eqz p0, :cond_3

    .line 57
    .line 58
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    if-eqz v4, :cond_3

    .line 67
    .line 68
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    check-cast v4, Ljava/lang/reflect/Method;

    .line 73
    .line 74
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_3
    invoke-virtual {v3}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 83
    .line 84
    .line 85
    move-result p0

    .line 86
    if-eqz p0, :cond_4

    .line 87
    .line 88
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :cond_4
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    move v3, v1

    .line 97
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 98
    .line 99
    .line 100
    move-result v4

    .line 101
    if-eqz v4, :cond_6

    .line 102
    .line 103
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    check-cast v4, Ljava/lang/Class;

    .line 108
    .line 109
    :try_start_1
    sget-object v5, Lxq0;->α:Lxq0;

    .line 110
    .line 111
    new-instance v6, Loj0;

    .line 112
    .line 113
    const/4 v7, 0x2

    .line 114
    invoke-direct {v6, v7}, Loj0;-><init>(I)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v5, v4, v6}, Lxq0;->β(Ljava/lang/Class;Lm01;)Ljava/util/Set;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 118
    .line 119
    .line 120
    :try_start_2
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    new-instance v5, Ljava/lang/StringBuilder;

    .line 125
    .line 126
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 127
    .line 128
    .line 129
    const-string v6, "DYHelperIMMarkAllReadHelper: \u5df2 Hook \u6d88\u606f\u5e95\u680f Helper \u6784\u9020\u51fd\u6570: "

    .line 130
    .line 131
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    invoke-static {v3}, Lux;->ρ(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    sget-object v3, Ls62;->α:Ls62;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 145
    .line 146
    move v5, v2

    .line 147
    goto :goto_4

    .line 148
    :catchall_1
    move-exception v3

    .line 149
    move v5, v2

    .line 150
    goto :goto_3

    .line 151
    :catchall_2
    move-exception v5

    .line 152
    move-object v8, v5

    .line 153
    move v5, v3

    .line 154
    move-object v3, v8

    .line 155
    :goto_3
    new-instance v6, Leo1;

    .line 156
    .line 157
    invoke-direct {v6, v3}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 158
    .line 159
    .line 160
    move-object v3, v6

    .line 161
    :goto_4
    invoke-static {v3}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    if-eqz v3, :cond_5

    .line 166
    .line 167
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v4

    .line 171
    invoke-static {v3}, Lzj0;->Η(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 172
    .line 173
    .line 174
    move-result-object v3

    .line 175
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v3

    .line 179
    new-instance v6, Ljava/lang/StringBuilder;

    .line 180
    .line 181
    const-string v7, "DYHelperIMMarkAllReadHelper: Hook \u6d88\u606f\u5e95\u680f Helper \u6784\u9020\u51fd\u6570\u5931\u8d25 "

    .line 182
    .line 183
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    const-string v4, ": "

    .line 190
    .line 191
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v3

    .line 201
    invoke-static {v3}, Lux;->ρ(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    :cond_5
    move v3, v5

    .line 205
    goto :goto_2

    .line 206
    :cond_6
    if-nez v3, :cond_7

    .line 207
    .line 208
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 209
    .line 210
    .line 211
    :cond_7
    :goto_5
    return-void
.end method

.method public static μ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    new-array v1, v1, [Ljava/lang/Class;

    .line 7
    .line 8
    invoke-static {v0, p1, v1}, Lzj0;->θ(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const/4 v0, 0x0

    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    const/4 v1, 0x1

    .line 17
    invoke-virtual {p1, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, p0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public static ν(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 3

    .line 1
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-static {v2, p1, v0}, Lzj0;->θ(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    if-nez p1, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v0, 0x1

    .line 24
    invoke-virtual {p1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 25
    .line 26
    .line 27
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {p1, p0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    .line 34
    :catchall_0
    :goto_0
    return-void
.end method

.method public static ξ(Ljava/lang/Object;)Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    sget-object v1, Lzj0;->δ:Ljava/lang/ClassLoader;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_2

    .line 9
    .line 10
    :try_start_0
    const-string v3, "~795CFE82BF8D864C285649BA56CE33B4C18838459A84C50FE419E35FE204466F8D2561AAF8AA290694109CAA750A811D72F9"

    .line 11
    .line 12
    invoke-static {v3}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    invoke-static {v3, v0, v1}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception v1

    .line 22
    new-instance v3, Leo1;

    .line 23
    .line 24
    invoke-direct {v3, v1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    move-object v1, v3

    .line 28
    :goto_0
    instance-of v3, v1, Leo1;

    .line 29
    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move-object v2, v1

    .line 34
    :goto_1
    check-cast v2, Ljava/lang/Class;

    .line 35
    .line 36
    :cond_2
    const/4 v1, 0x1

    .line 37
    if-eqz v2, :cond_3

    .line 38
    .line 39
    invoke-virtual {v2, p0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-ne v2, v1, :cond_3

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    const-string v3, "markAllConversationRead"

    .line 51
    .line 52
    new-array v4, v0, [Ljava/lang/Class;

    .line 53
    .line 54
    invoke-static {v2, v3, v4}, Lzj0;->θ(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    if-eqz v2, :cond_4

    .line 59
    .line 60
    :goto_2
    return v1

    .line 61
    :cond_4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    const-class v3, Ljava/lang/String;

    .line 66
    .line 67
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    const-string v4, "markConversationRead"

    .line 72
    .line 73
    invoke-static {v2, v4, v3}, Lzj0;->θ(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    if-eqz v2, :cond_6

    .line 78
    .line 79
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    const-string v3, "getAllConversationSync"

    .line 84
    .line 85
    new-array v4, v0, [Ljava/lang/Class;

    .line 86
    .line 87
    invoke-static {v2, v3, v4}, Lzj0;->θ(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    if-nez v2, :cond_5

    .line 92
    .line 93
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    const-string v2, "getAllConversationSyncNoSort"

    .line 98
    .line 99
    new-array v3, v0, [Ljava/lang/Class;

    .line 100
    .line 101
    invoke-static {p0, v2, v3}, Lzj0;->θ(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    if-eqz p0, :cond_6

    .line 106
    .line 107
    :cond_5
    move v0, v1

    .line 108
    :cond_6
    return v0
.end method

.method public static ο(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "~796422A8818C0EADCA9A33DA50D2E82D10279E237AB2D2E13465F36685DE700F208610F00484FDC242593DAB7C63FD6BF226A9E1C77A5F232FB29534"

    .line 13
    .line 14
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-static {p0}, Lzj0;->η(Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    if-eqz p0, :cond_2

    .line 34
    .line 35
    :goto_0
    const/4 p0, 0x1

    .line 36
    return p0

    .line 37
    :cond_2
    :goto_1
    const/4 p0, 0x0

    .line 38
    return p0
.end method

.method public static π(Ljava/lang/reflect/Method;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 6
    .line 7
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-static {}, Lzj0;->ω()[Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {p0, v0}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    if-eqz p0, :cond_0

    .line 26
    .line 27
    const/4 p0, 0x1

    .line 28
    return p0

    .line 29
    :cond_0
    const/4 p0, 0x0

    .line 30
    return p0
.end method

.method public static ρ(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x1

    .line 6
    :try_start_0
    const-string v2, "~796422A8818C0EADCA9A33DA50D2E82D10279E237AB2D2E13462F13C8FD278512E981CB013C5C5C9450412A36D5EFF6CF526A8C7D6454A342B959326"

    .line 7
    .line 8
    invoke-static {v2}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-static {v2, v0, v3}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v2, p0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    return v1

    .line 31
    :catchall_0
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    const-string v3, "clearUnreadCount"

    .line 36
    .line 37
    const-class v4, Ljava/lang/String;

    .line 38
    .line 39
    const-class v5, [I

    .line 40
    .line 41
    filled-new-array {v4, v5}, [Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    invoke-static {v2, v3, v6}, Lzj0;->θ(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    if-nez v2, :cond_2

    .line 50
    .line 51
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    const-string v3, "LJJLIIIIJ"

    .line 56
    .line 57
    filled-new-array {v4}, [Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    invoke-static {v2, v3, v4}, Lzj0;->θ(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    if-nez v2, :cond_2

    .line 66
    .line 67
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    const-string v3, "LIZIZ"

    .line 72
    .line 73
    new-array v4, v0, [Ljava/lang/Class;

    .line 74
    .line 75
    invoke-static {v2, v3, v4}, Lzj0;->θ(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    if-nez v2, :cond_2

    .line 80
    .line 81
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    const-string v2, "getNoticeCountByGroupArray"

    .line 86
    .line 87
    filled-new-array {v5}, [Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    invoke-static {p0, v2, v3}, Lzj0;->θ(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    if-eqz p0, :cond_3

    .line 96
    .line 97
    :cond_2
    move v0, v1

    .line 98
    :cond_3
    return v0
.end method

.method public static σ(Ljava/lang/reflect/Method;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 10
    .line 11
    invoke-static {p0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    const/4 v1, 0x0

    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    array-length p0, v0

    .line 19
    const/4 v2, 0x3

    .line 20
    if-ne p0, v2, :cond_0

    .line 21
    .line 22
    aget-object p0, v0, v1

    .line 23
    .line 24
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 25
    .line 26
    invoke-static {p0, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-eqz p0, :cond_0

    .line 31
    .line 32
    const/4 p0, 0x1

    .line 33
    aget-object v3, v0, p0

    .line 34
    .line 35
    invoke-static {v3, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_0

    .line 40
    .line 41
    const/4 v2, 0x2

    .line 42
    aget-object v0, v0, v2

    .line 43
    .line 44
    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 45
    .line 46
    invoke-static {v0, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_0

    .line 51
    .line 52
    return p0

    .line 53
    :cond_0
    return v1
.end method

.method public static τ(Ljava/lang/reflect/Method;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Ljava/util/Map;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {v1, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    const/4 v1, 0x0

    .line 16
    if-eqz p0, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    array-length p0, v0

    .line 22
    const/4 v2, 0x1

    .line 23
    if-nez p0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    array-length p0, v0

    .line 27
    if-ne p0, v2, :cond_1

    .line 28
    .line 29
    aget-object p0, v0, v1

    .line 30
    .line 31
    const-class v0, Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {p0, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-eqz p0, :cond_1

    .line 38
    .line 39
    :goto_0
    return v2

    .line 40
    :cond_1
    return v1
.end method

.method public static υ(Ljava/lang/Class;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "~795CFE82BF8D864C285649BA56CE33B4C18838459A84C50FE419E35FE204466F8D2561AAF8AA290694109CAA750A811D72F9"

    .line 6
    .line 7
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    const-string v0, "~79504AF3D2914B0617A99E1CFF7635F71B1D318AD2ED0F06920675D78278AC2B9B172F97EAB05791E23028D75CAFEBBC86"

    .line 18
    .line 19
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-eqz p0, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 p0, 0x0

    .line 31
    return p0

    .line 32
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 33
    return p0
.end method

.method public static χ(Ljava/lang/ClassLoader;)Ljava/lang/String;
    .locals 24

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    sget-object v2, Lkx;->ｌ:Lkx;

    .line 4
    .line 5
    const-class v3, Ljava/lang/String;

    .line 6
    .line 7
    const-string v4, "DYHelper_markAllInteractiveNoticeRead"

    .line 8
    .line 9
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 10
    .line 11
    sget-object v6, Ls62;->α:Ls62;

    .line 12
    .line 13
    const/4 v7, 0x0

    .line 14
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object v8

    .line 18
    sget-object v0, Lkx;->ｊ:Lkx;

    .line 19
    .line 20
    new-instance v9, Lt20;

    .line 21
    .line 22
    const/16 v10, 0x8

    .line 23
    .line 24
    invoke-direct {v9, v1, v10}, Lt20;-><init>(Ljava/lang/ClassLoader;I)V

    .line 25
    .line 26
    .line 27
    const-string v10, "\u9002\u914d\u4e92\u52a8\u6d88\u606f\u670d\u52a1\u5165\u53e3"

    .line 28
    .line 29
    invoke-static {v0, v1, v10, v9}, Lx;->ρ(Lkx;Ljava/lang/ClassLoader;Ljava/lang/String;La80;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object v9

    .line 37
    :cond_0
    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    const/4 v10, 0x1

    .line 42
    const/4 v11, 0x0

    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, Ljava/lang/reflect/Method;

    .line 50
    .line 51
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 52
    .line 53
    .line 54
    move-result v12

    .line 55
    invoke-static {v12}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 56
    .line 57
    .line 58
    move-result v12

    .line 59
    if-eqz v12, :cond_0

    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    move-result-object v12

    .line 65
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    array-length v12, v12

    .line 69
    if-nez v12, :cond_0

    .line 70
    .line 71
    invoke-virtual {v0, v10}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, v11, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v12

    .line 78
    invoke-static {v12}, Lzj0;->ρ(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v13

    .line 82
    if-eqz v13, :cond_1

    .line 83
    .line 84
    invoke-static {v0}, Lzj0;->Δ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    move-result-object v13

    .line 92
    invoke-virtual {v13}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v13

    .line 96
    new-instance v14, Ljava/lang/StringBuilder;

    .line 97
    .line 98
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    .line 99
    .line 100
    .line 101
    const-string v15, "DYHelperIMMarkAllReadHelper: \u83b7\u53d6 NoticeCountService \u6210\u529f: DexKit:"

    .line 102
    .line 103
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    const-string v0, " -> "

    .line 110
    .line 111
    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 122
    .line 123
    .line 124
    goto :goto_3

    .line 125
    :catchall_0
    move-exception v0

    .line 126
    goto :goto_1

    .line 127
    :cond_1
    move-object v10, v6

    .line 128
    goto :goto_2

    .line 129
    :goto_1
    new-instance v10, Leo1;

    .line 130
    .line 131
    invoke-direct {v10, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 132
    .line 133
    .line 134
    :goto_2
    invoke-static {v10}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    if-eqz v0, :cond_0

    .line 139
    .line 140
    invoke-static {v0}, Lzj0;->Η(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    const-string v10, "DYHelperIMMarkAllReadHelper: DexKit NoticeCountService provider \u8c03\u7528\u5931\u8d25: "

    .line 149
    .line 150
    invoke-static {v10, v0}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    goto :goto_0

    .line 154
    :cond_2
    invoke-static {v1}, Lzj0;->Β(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v12

    .line 158
    if-eqz v12, :cond_3

    .line 159
    .line 160
    goto :goto_3

    .line 161
    :cond_3
    move-object v12, v11

    .line 162
    :goto_3
    if-eqz v12, :cond_31

    .line 163
    .line 164
    new-instance v9, Ljava/util/LinkedHashMap;

    .line 165
    .line 166
    invoke-direct {v9}, Ljava/util/LinkedHashMap;-><init>()V

    .line 167
    .line 168
    .line 169
    :try_start_1
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    const-string v13, "getNoticeUnReadMap"

    .line 174
    .line 175
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    move-result-object v14

    .line 179
    invoke-static {v0, v13, v14}, Lzj0;->θ(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    if-nez v0, :cond_4

    .line 184
    .line 185
    goto :goto_4

    .line 186
    :cond_4
    invoke-virtual {v0, v10}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 187
    .line 188
    .line 189
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v13

    .line 193
    invoke-virtual {v0, v12, v13}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    invoke-static {v9, v0}, Lzj0;->ι(Ljava/util/LinkedHashMap;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 198
    .line 199
    .line 200
    :catchall_1
    :goto_4
    sget-object v0, Lzj0;->δ:Ljava/lang/ClassLoader;

    .line 201
    .line 202
    if-nez v0, :cond_5

    .line 203
    .line 204
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    :cond_5
    const-string v13, ": "

    .line 213
    .line 214
    if-eqz v0, :cond_8

    .line 215
    .line 216
    sget-object v14, Lkx;->ｍ:Lkx;

    .line 217
    .line 218
    new-instance v15, Lt20;

    .line 219
    .line 220
    const/16 v7, 0x9

    .line 221
    .line 222
    invoke-direct {v15, v0, v7}, Lt20;-><init>(Ljava/lang/ClassLoader;I)V

    .line 223
    .line 224
    .line 225
    const-string v7, "\u9002\u914d\u4e92\u52a8\u6d88\u606f\u672a\u8bfb\u5206\u7ec4\u5165\u53e3"

    .line 226
    .line 227
    invoke-static {v14, v0, v7, v15}, Lx;->ρ(Lkx;Ljava/lang/ClassLoader;Ljava/lang/String;La80;)Ljava/util/List;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    new-instance v7, Lf7;

    .line 232
    .line 233
    const/4 v14, 0x1

    .line 234
    invoke-direct {v7, v14, v0}, Lf7;-><init>(ILjava/lang/Object;)V

    .line 235
    .line 236
    .line 237
    new-instance v0, Lef;

    .line 238
    .line 239
    const/16 v14, 0xa

    .line 240
    .line 241
    invoke-direct {v0, v14, v12}, Lef;-><init>(ILjava/lang/Object;)V

    .line 242
    .line 243
    .line 244
    new-instance v14, Ly30;

    .line 245
    .line 246
    invoke-direct {v14, v7, v10, v0}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 247
    .line 248
    .line 249
    new-instance v0, Lfj0;

    .line 250
    .line 251
    const/16 v7, 0x9

    .line 252
    .line 253
    invoke-direct {v0, v7}, Lfj0;-><init>(I)V

    .line 254
    .line 255
    .line 256
    new-instance v7, Ly30;

    .line 257
    .line 258
    invoke-direct {v7, v14, v10, v0}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 259
    .line 260
    .line 261
    new-instance v0, Lfj0;

    .line 262
    .line 263
    const/16 v14, 0xa

    .line 264
    .line 265
    invoke-direct {v0, v14}, Lfj0;-><init>(I)V

    .line 266
    .line 267
    .line 268
    new-instance v14, Lbu;

    .line 269
    .line 270
    invoke-interface {v7}, Lss1;->iterator()Ljava/util/Iterator;

    .line 271
    .line 272
    .line 273
    move-result-object v7

    .line 274
    invoke-direct {v14, v7, v0}, Lbu;-><init>(Ljava/util/Iterator;La80;)V

    .line 275
    .line 276
    .line 277
    :goto_5
    invoke-virtual {v14}, Lσ;->hasNext()Z

    .line 278
    .line 279
    .line 280
    move-result v0

    .line 281
    if-eqz v0, :cond_8

    .line 282
    .line 283
    invoke-virtual {v14}, Lσ;->next()Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    move-object v7, v0

    .line 288
    check-cast v7, Ljava/lang/reflect/Method;

    .line 289
    .line 290
    :try_start_2
    invoke-virtual {v7, v10}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 298
    .line 299
    .line 300
    array-length v0, v0

    .line 301
    if-nez v0, :cond_6

    .line 302
    .line 303
    invoke-virtual {v7, v12, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    goto :goto_6

    .line 308
    :catchall_2
    move-exception v0

    .line 309
    goto :goto_7

    .line 310
    :cond_6
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    invoke-virtual {v7, v12, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    :goto_6
    invoke-static {v9, v0}, Lzj0;->ι(Ljava/util/LinkedHashMap;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 319
    .line 320
    .line 321
    move-object v15, v6

    .line 322
    goto :goto_8

    .line 323
    :goto_7
    new-instance v15, Leo1;

    .line 324
    .line 325
    invoke-direct {v15, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 326
    .line 327
    .line 328
    :goto_8
    invoke-static {v15}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    if-eqz v0, :cond_7

    .line 333
    .line 334
    invoke-static {v7}, Lzj0;->Δ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v7

    .line 338
    invoke-static {v0}, Lzj0;->Η(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    new-instance v15, Ljava/lang/StringBuilder;

    .line 347
    .line 348
    const-string v11, "DYHelperIMMarkAllReadHelper: NoticeCountService.unreadMap \u5931\u8d25 "

    .line 349
    .line 350
    invoke-direct {v15, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 351
    .line 352
    .line 353
    invoke-virtual {v15, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 354
    .line 355
    .line 356
    invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 357
    .line 358
    .line 359
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 360
    .line 361
    .line 362
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 367
    .line 368
    .line 369
    :cond_7
    const/4 v11, 0x0

    .line 370
    goto :goto_5

    .line 371
    :cond_8
    const-string v0, "getNoticeUnReadCountInUseArray"

    .line 372
    .line 373
    const-string v7, "getImUnreadGroupAndCount"

    .line 374
    .line 375
    filled-new-array {v0, v7}, [Ljava/lang/String;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    const/4 v7, 0x0

    .line 380
    :goto_9
    const/4 v11, 0x2

    .line 381
    if-ge v7, v11, :cond_9

    .line 382
    .line 383
    aget-object v11, v0, v7

    .line 384
    .line 385
    :try_start_3
    invoke-static {v12, v11}, Lzj0;->μ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    move-result-object v11

    .line 389
    invoke-static {v9, v11}, Lzj0;->ι(Ljava/util/LinkedHashMap;Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 390
    .line 391
    .line 392
    :catchall_3
    add-int/lit8 v7, v7, 0x1

    .line 393
    .line 394
    goto :goto_9

    .line 395
    :cond_9
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 396
    .line 397
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 398
    .line 399
    .line 400
    invoke-virtual {v9}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 401
    .line 402
    .line 403
    move-result-object v7

    .line 404
    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 405
    .line 406
    .line 407
    move-result-object v7

    .line 408
    :cond_a
    :goto_a
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 409
    .line 410
    .line 411
    move-result v14

    .line 412
    if-eqz v14, :cond_b

    .line 413
    .line 414
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    move-result-object v14

    .line 418
    check-cast v14, Ljava/util/Map$Entry;

    .line 419
    .line 420
    invoke-interface {v14}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object v15

    .line 424
    check-cast v15, Ljava/lang/Number;

    .line 425
    .line 426
    invoke-virtual {v15}, Ljava/lang/Number;->intValue()I

    .line 427
    .line 428
    .line 429
    move-result v15

    .line 430
    if-lez v15, :cond_a

    .line 431
    .line 432
    invoke-interface {v14}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    move-result-object v15

    .line 436
    invoke-interface {v14}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 437
    .line 438
    .line 439
    move-result-object v14

    .line 440
    invoke-virtual {v0, v15, v14}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 441
    .line 442
    .line 443
    goto :goto_a

    .line 444
    :cond_b
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 445
    .line 446
    .line 447
    move-result-object v0

    .line 448
    check-cast v0, Ljava/util/Collection;

    .line 449
    .line 450
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 451
    .line 452
    .line 453
    move-result v7

    .line 454
    if-eqz v7, :cond_c

    .line 455
    .line 456
    sget-object v0, Lzj0;->κ:[I

    .line 457
    .line 458
    invoke-static {v0}, Lg7;->м([I)Ljava/util/List;

    .line 459
    .line 460
    .line 461
    move-result-object v0

    .line 462
    :cond_c
    check-cast v0, Ljava/lang/Iterable;

    .line 463
    .line 464
    invoke-static {v0}, Lxh;->ｉ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 465
    .line 466
    .line 467
    move-result-object v0

    .line 468
    invoke-static {v0}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 469
    .line 470
    .line 471
    move-result-object v0

    .line 472
    invoke-static {v0}, Lxh;->Ю(Ljava/lang/Iterable;)Ljava/util/List;

    .line 473
    .line 474
    .line 475
    move-result-object v7

    .line 476
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    .line 477
    .line 478
    .line 479
    move-result v0

    .line 480
    if-eqz v0, :cond_d

    .line 481
    .line 482
    const-string v0, "\u4e92\u52a8\u6d88\u606f\u6682\u65e0\u672a\u8bfb"

    .line 483
    .line 484
    return-object v0

    .line 485
    :cond_d
    invoke-static {v8, v7}, Lxh;->Ф(Ljava/lang/Object;Ljava/util/List;)Ljava/util/ArrayList;

    .line 486
    .line 487
    .line 488
    move-result-object v0

    .line 489
    invoke-static {v0}, Lxh;->ｉ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 490
    .line 491
    .line 492
    move-result-object v0

    .line 493
    invoke-static {v0}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 494
    .line 495
    .line 496
    move-result-object v0

    .line 497
    invoke-static {v0}, Lxh;->Ю(Ljava/lang/Iterable;)Ljava/util/List;

    .line 498
    .line 499
    .line 500
    move-result-object v14

    .line 501
    sget-object v15, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 502
    .line 503
    const-string v17, "~79504AF3C39B11021DAC8210F33C72EF521D7099C0A60F0CD80D768DA874A7739F1535D8D0B64C96CD3C16C27FA1E8BC98"

    .line 504
    .line 505
    const-class v11, [I

    .line 506
    .line 507
    invoke-static {v14}, Lxh;->ｄ(Ljava/util/List;)[I

    .line 508
    .line 509
    .line 510
    move-result-object v10

    .line 511
    :try_start_4
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 512
    .line 513
    .line 514
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_6

    .line 515
    move-object/from16 v19, v6

    .line 516
    .line 517
    :try_start_5
    const-string v6, "clearUnreadCount"
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 518
    .line 519
    move-object/from16 v20, v7

    .line 520
    .line 521
    :try_start_6
    filled-new-array {v3, v11}, [Ljava/lang/Class;

    .line 522
    .line 523
    .line 524
    move-result-object v7

    .line 525
    invoke-static {v0, v6, v7}, Lzj0;->θ(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 526
    .line 527
    .line 528
    move-result-object v0

    .line 529
    if-nez v0, :cond_e

    .line 530
    .line 531
    goto :goto_b

    .line 532
    :cond_e
    const/4 v6, 0x1

    .line 533
    invoke-virtual {v0, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 534
    .line 535
    .line 536
    filled-new-array {v4, v10}, [Ljava/lang/Object;

    .line 537
    .line 538
    .line 539
    move-result-object v6

    .line 540
    invoke-virtual {v0, v12, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 541
    .line 542
    .line 543
    :goto_b
    move-object/from16 v6, v19

    .line 544
    .line 545
    goto :goto_e

    .line 546
    :catchall_4
    move-exception v0

    .line 547
    goto :goto_d

    .line 548
    :catchall_5
    move-exception v0

    .line 549
    :goto_c
    move-object/from16 v20, v7

    .line 550
    .line 551
    goto :goto_d

    .line 552
    :catchall_6
    move-exception v0

    .line 553
    move-object/from16 v19, v6

    .line 554
    .line 555
    goto :goto_c

    .line 556
    :goto_d
    new-instance v6, Leo1;

    .line 557
    .line 558
    invoke-direct {v6, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 559
    .line 560
    .line 561
    :goto_e
    invoke-static {v6}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 562
    .line 563
    .line 564
    move-result-object v0

    .line 565
    if-eqz v0, :cond_f

    .line 566
    .line 567
    invoke-static {v0}, Lzj0;->Η(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 568
    .line 569
    .line 570
    move-result-object v0

    .line 571
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 572
    .line 573
    .line 574
    move-result-object v0

    .line 575
    const-string v6, "DYHelperIMMarkAllReadHelper: NoticeCountService.clearUnreadCount \u5931\u8d25: "

    .line 576
    .line 577
    invoke-static {v6, v0}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 578
    .line 579
    .line 580
    :cond_f
    new-instance v0, Ljava/util/ArrayList;

    .line 581
    .line 582
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 583
    .line 584
    .line 585
    sget-object v6, Lkx;->ｋ:Lkx;

    .line 586
    .line 587
    new-instance v7, Lt20;

    .line 588
    .line 589
    move-object/from16 v21, v14

    .line 590
    .line 591
    const/4 v14, 0x7

    .line 592
    invoke-direct {v7, v1, v14}, Lt20;-><init>(Ljava/lang/ClassLoader;I)V

    .line 593
    .line 594
    .line 595
    const-string v14, "\u9002\u914d\u4e92\u52a8\u6d88\u606f\u6e05\u672a\u8bfb\u5165\u53e3"

    .line 596
    .line 597
    invoke-static {v6, v1, v14, v7}, Lx;->ρ(Lkx;Ljava/lang/ClassLoader;Ljava/lang/String;La80;)Ljava/util/List;

    .line 598
    .line 599
    .line 600
    move-result-object v6

    .line 601
    invoke-static {v0, v6}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 602
    .line 603
    .line 604
    :try_start_7
    invoke-static/range {v17 .. v17}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 605
    .line 606
    .line 607
    move-result-object v6

    .line 608
    const/4 v7, 0x0

    .line 609
    invoke-static {v6, v7, v1}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 610
    .line 611
    .line 612
    move-result-object v6

    .line 613
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 614
    .line 615
    .line 616
    const-string v7, "LIZ"

    .line 617
    .line 618
    filled-new-array {v3, v11}, [Ljava/lang/Class;

    .line 619
    .line 620
    .line 621
    move-result-object v14

    .line 622
    invoke-static {v6, v7, v14}, Lzj0;->θ(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 623
    .line 624
    .line 625
    move-result-object v6

    .line 626
    if-eqz v6, :cond_10

    .line 627
    .line 628
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    .line 629
    .line 630
    .line 631
    :catchall_7
    :cond_10
    new-instance v6, Ljava/util/HashSet;

    .line 632
    .line 633
    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    .line 634
    .line 635
    .line 636
    new-instance v7, Ljava/util/ArrayList;

    .line 637
    .line 638
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 639
    .line 640
    .line 641
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 642
    .line 643
    .line 644
    move-result-object v0

    .line 645
    :goto_f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 646
    .line 647
    .line 648
    move-result v14

    .line 649
    if-eqz v14, :cond_12

    .line 650
    .line 651
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 652
    .line 653
    .line 654
    move-result-object v14

    .line 655
    move-object/from16 v22, v14

    .line 656
    .line 657
    check-cast v22, Ljava/lang/reflect/Method;

    .line 658
    .line 659
    move-object/from16 v23, v0

    .line 660
    .line 661
    invoke-static/range {v22 .. v22}, Lzj0;->Δ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 662
    .line 663
    .line 664
    move-result-object v0

    .line 665
    invoke-virtual {v6, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 666
    .line 667
    .line 668
    move-result v0

    .line 669
    if-eqz v0, :cond_11

    .line 670
    .line 671
    invoke-virtual {v7, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 672
    .line 673
    .line 674
    :cond_11
    move-object/from16 v0, v23

    .line 675
    .line 676
    goto :goto_f

    .line 677
    :cond_12
    new-instance v0, Ljava/util/ArrayList;

    .line 678
    .line 679
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 680
    .line 681
    .line 682
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 683
    .line 684
    .line 685
    move-result-object v6

    .line 686
    :goto_10
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 687
    .line 688
    .line 689
    move-result v7

    .line 690
    if-eqz v7, :cond_15

    .line 691
    .line 692
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 693
    .line 694
    .line 695
    move-result-object v7

    .line 696
    move-object v14, v7

    .line 697
    check-cast v14, Ljava/lang/reflect/Method;

    .line 698
    .line 699
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 700
    .line 701
    .line 702
    move-result v22

    .line 703
    invoke-static/range {v22 .. v22}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 704
    .line 705
    .line 706
    move-result v22

    .line 707
    if-eqz v22, :cond_14

    .line 708
    .line 709
    move-object/from16 v22, v6

    .line 710
    .line 711
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 712
    .line 713
    .line 714
    move-result-object v6

    .line 715
    array-length v6, v6

    .line 716
    move-object/from16 v23, v14

    .line 717
    .line 718
    const/4 v14, 0x2

    .line 719
    if-ne v6, v14, :cond_13

    .line 720
    .line 721
    invoke-virtual/range {v23 .. v23}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 722
    .line 723
    .line 724
    move-result-object v6

    .line 725
    const/16 v16, 0x0

    .line 726
    .line 727
    aget-object v6, v6, v16

    .line 728
    .line 729
    invoke-static {v6, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 730
    .line 731
    .line 732
    move-result v6

    .line 733
    if-eqz v6, :cond_13

    .line 734
    .line 735
    invoke-virtual/range {v23 .. v23}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 736
    .line 737
    .line 738
    move-result-object v6

    .line 739
    const/16 v18, 0x1

    .line 740
    .line 741
    aget-object v6, v6, v18

    .line 742
    .line 743
    invoke-static {v6, v11}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 744
    .line 745
    .line 746
    move-result v6

    .line 747
    if-eqz v6, :cond_13

    .line 748
    .line 749
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 750
    .line 751
    .line 752
    :cond_13
    :goto_11
    move-object/from16 v6, v22

    .line 753
    .line 754
    goto :goto_10

    .line 755
    :cond_14
    move-object/from16 v22, v6

    .line 756
    .line 757
    const/4 v14, 0x2

    .line 758
    goto :goto_11

    .line 759
    :cond_15
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 760
    .line 761
    .line 762
    move-result-object v3

    .line 763
    :cond_16
    :goto_12
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 764
    .line 765
    .line 766
    move-result v0

    .line 767
    if-eqz v0, :cond_17

    .line 768
    .line 769
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 770
    .line 771
    .line 772
    move-result-object v0

    .line 773
    move-object v6, v0

    .line 774
    check-cast v6, Ljava/lang/reflect/Method;

    .line 775
    .line 776
    const/4 v7, 0x1

    .line 777
    :try_start_8
    invoke-virtual {v6, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 778
    .line 779
    .line 780
    filled-new-array {v4, v10}, [Ljava/lang/Object;

    .line 781
    .line 782
    .line 783
    move-result-object v0

    .line 784
    const/4 v7, 0x0

    .line 785
    invoke-virtual {v6, v7, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 786
    .line 787
    .line 788
    move-result-object v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    .line 789
    goto :goto_13

    .line 790
    :catchall_8
    move-exception v0

    .line 791
    new-instance v7, Leo1;

    .line 792
    .line 793
    invoke-direct {v7, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 794
    .line 795
    .line 796
    move-object v0, v7

    .line 797
    :goto_13
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 798
    .line 799
    .line 800
    move-result-object v0

    .line 801
    if-eqz v0, :cond_16

    .line 802
    .line 803
    invoke-static {v6}, Lzj0;->Δ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 804
    .line 805
    .line 806
    move-result-object v6

    .line 807
    invoke-static {v0}, Lzj0;->Η(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 808
    .line 809
    .line 810
    move-result-object v0

    .line 811
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 812
    .line 813
    .line 814
    move-result-object v0

    .line 815
    new-instance v7, Ljava/lang/StringBuilder;

    .line 816
    .line 817
    const-string v11, "DYHelperIMMarkAllReadHelper: NoticeManager.clearUnread \u8c03\u7528\u5931\u8d25 "

    .line 818
    .line 819
    invoke-direct {v7, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 820
    .line 821
    .line 822
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 823
    .line 824
    .line 825
    invoke-virtual {v7, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 826
    .line 827
    .line 828
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 829
    .line 830
    .line 831
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 832
    .line 833
    .line 834
    move-result-object v0

    .line 835
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 836
    .line 837
    .line 838
    goto :goto_12

    .line 839
    :cond_17
    :try_start_9
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 840
    .line 841
    .line 842
    move-result-object v0

    .line 843
    const-string v3, "setNoticeUnReadCount"

    .line 844
    .line 845
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 846
    .line 847
    .line 848
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 849
    .line 850
    .line 851
    filled-new-array {v5, v5, v15}, [Ljava/lang/Class;

    .line 852
    .line 853
    .line 854
    move-result-object v4

    .line 855
    invoke-static {v0, v3, v4}, Lzj0;->θ(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 856
    .line 857
    .line 858
    move-result-object v0

    .line 859
    if-nez v0, :cond_18

    .line 860
    .line 861
    goto :goto_15

    .line 862
    :cond_18
    const/4 v6, 0x1

    .line 863
    invoke-virtual {v0, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 864
    .line 865
    .line 866
    invoke-interface/range {v21 .. v21}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 867
    .line 868
    .line 869
    move-result-object v3

    .line 870
    :goto_14
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 871
    .line 872
    .line 873
    move-result v4

    .line 874
    if-eqz v4, :cond_19

    .line 875
    .line 876
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 877
    .line 878
    .line 879
    move-result-object v4

    .line 880
    check-cast v4, Ljava/lang/Number;

    .line 881
    .line 882
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 883
    .line 884
    .line 885
    move-result v4

    .line 886
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 887
    .line 888
    .line 889
    move-result-object v4

    .line 890
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 891
    .line 892
    filled-new-array {v4, v8, v6}, [Ljava/lang/Object;

    .line 893
    .line 894
    .line 895
    move-result-object v4

    .line 896
    invoke-virtual {v0, v12, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    .line 897
    .line 898
    .line 899
    goto :goto_14

    .line 900
    :catchall_9
    move-exception v0

    .line 901
    goto :goto_16

    .line 902
    :cond_19
    :goto_15
    move-object/from16 v3, v19

    .line 903
    .line 904
    goto :goto_17

    .line 905
    :goto_16
    new-instance v3, Leo1;

    .line 906
    .line 907
    invoke-direct {v3, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 908
    .line 909
    .line 910
    :goto_17
    invoke-static {v3}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 911
    .line 912
    .line 913
    move-result-object v0

    .line 914
    if-eqz v0, :cond_1a

    .line 915
    .line 916
    invoke-static {v0}, Lzj0;->Η(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 917
    .line 918
    .line 919
    move-result-object v0

    .line 920
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 921
    .line 922
    .line 923
    move-result-object v0

    .line 924
    const-string v3, "DYHelperIMMarkAllReadHelper: NoticeCountService.setNoticeUnReadCount \u5931\u8d25: "

    .line 925
    .line 926
    invoke-static {v3, v0}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 927
    .line 928
    .line 929
    :cond_1a
    new-instance v0, Lt20;

    .line 930
    .line 931
    const/4 v3, 0x5

    .line 932
    invoke-direct {v0, v1, v3}, Lt20;-><init>(Ljava/lang/ClassLoader;I)V

    .line 933
    .line 934
    .line 935
    const-string v3, "\u9002\u914d\u4e92\u52a8\u6d88\u606f\u6570\u5b57\u6e05\u96f6\u5165\u53e3"

    .line 936
    .line 937
    invoke-static {v2, v1, v3, v0}, Lx;->ρ(Lkx;Ljava/lang/ClassLoader;Ljava/lang/String;La80;)Ljava/util/List;

    .line 938
    .line 939
    .line 940
    move-result-object v0

    .line 941
    new-instance v4, Lf7;

    .line 942
    .line 943
    const/4 v6, 0x1

    .line 944
    invoke-direct {v4, v6, v0}, Lf7;-><init>(ILjava/lang/Object;)V

    .line 945
    .line 946
    .line 947
    new-instance v0, Lfj0;

    .line 948
    .line 949
    const/16 v6, 0xb

    .line 950
    .line 951
    invoke-direct {v0, v6}, Lfj0;-><init>(I)V

    .line 952
    .line 953
    .line 954
    new-instance v6, Ly30;

    .line 955
    .line 956
    const/4 v7, 0x1

    .line 957
    invoke-direct {v6, v4, v7, v0}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 958
    .line 959
    .line 960
    new-instance v0, Lef;

    .line 961
    .line 962
    const/16 v4, 0xb

    .line 963
    .line 964
    invoke-direct {v0, v4, v12}, Lef;-><init>(ILjava/lang/Object;)V

    .line 965
    .line 966
    .line 967
    new-instance v4, Ly30;

    .line 968
    .line 969
    invoke-direct {v4, v6, v7, v0}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 970
    .line 971
    .line 972
    new-instance v0, Lfj0;

    .line 973
    .line 974
    const/16 v6, 0xd

    .line 975
    .line 976
    invoke-direct {v0, v6}, Lfj0;-><init>(I)V

    .line 977
    .line 978
    .line 979
    new-instance v6, Ly30;

    .line 980
    .line 981
    invoke-direct {v6, v4, v7, v0}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 982
    .line 983
    .line 984
    new-instance v0, Lfj0;

    .line 985
    .line 986
    const/16 v4, 0xe

    .line 987
    .line 988
    invoke-direct {v0, v4}, Lfj0;-><init>(I)V

    .line 989
    .line 990
    .line 991
    new-instance v4, Lbu;

    .line 992
    .line 993
    invoke-interface {v6}, Lss1;->iterator()Ljava/util/Iterator;

    .line 994
    .line 995
    .line 996
    move-result-object v6

    .line 997
    invoke-direct {v4, v6, v0}, Lbu;-><init>(Ljava/util/Iterator;La80;)V

    .line 998
    .line 999
    .line 1000
    :cond_1b
    :goto_18
    invoke-virtual {v4}, Lσ;->hasNext()Z

    .line 1001
    .line 1002
    .line 1003
    move-result v0

    .line 1004
    if-eqz v0, :cond_1d

    .line 1005
    .line 1006
    invoke-virtual {v4}, Lσ;->next()Ljava/lang/Object;

    .line 1007
    .line 1008
    .line 1009
    move-result-object v0

    .line 1010
    move-object v6, v0

    .line 1011
    check-cast v6, Ljava/lang/reflect/Method;

    .line 1012
    .line 1013
    const/4 v7, 0x1

    .line 1014
    :try_start_a
    invoke-virtual {v6, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 1015
    .line 1016
    .line 1017
    invoke-interface/range {v21 .. v21}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1018
    .line 1019
    .line 1020
    move-result-object v0

    .line 1021
    :goto_19
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1022
    .line 1023
    .line 1024
    move-result v7

    .line 1025
    if-eqz v7, :cond_1c

    .line 1026
    .line 1027
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1028
    .line 1029
    .line 1030
    move-result-object v7

    .line 1031
    check-cast v7, Ljava/lang/Number;

    .line 1032
    .line 1033
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 1034
    .line 1035
    .line 1036
    move-result v7

    .line 1037
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1038
    .line 1039
    .line 1040
    move-result-object v7

    .line 1041
    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1042
    .line 1043
    filled-new-array {v7, v8, v10}, [Ljava/lang/Object;

    .line 1044
    .line 1045
    .line 1046
    move-result-object v7

    .line 1047
    invoke-virtual {v6, v12, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_a

    .line 1048
    .line 1049
    .line 1050
    goto :goto_19

    .line 1051
    :catchall_a
    move-exception v0

    .line 1052
    goto :goto_1a

    .line 1053
    :cond_1c
    move-object/from16 v7, v19

    .line 1054
    .line 1055
    goto :goto_1b

    .line 1056
    :goto_1a
    new-instance v7, Leo1;

    .line 1057
    .line 1058
    invoke-direct {v7, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1059
    .line 1060
    .line 1061
    :goto_1b
    invoke-static {v7}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v0

    .line 1065
    if-eqz v0, :cond_1b

    .line 1066
    .line 1067
    invoke-static {v6}, Lzj0;->Δ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 1068
    .line 1069
    .line 1070
    move-result-object v6

    .line 1071
    invoke-static {v0}, Lzj0;->Η(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 1072
    .line 1073
    .line 1074
    move-result-object v0

    .line 1075
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1076
    .line 1077
    .line 1078
    move-result-object v0

    .line 1079
    new-instance v7, Ljava/lang/StringBuilder;

    .line 1080
    .line 1081
    const-string v10, "DYHelperIMMarkAllReadHelper: NoticeCountService.setUnread fallback \u5931\u8d25 "

    .line 1082
    .line 1083
    invoke-direct {v7, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1084
    .line 1085
    .line 1086
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1087
    .line 1088
    .line 1089
    invoke-virtual {v7, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1090
    .line 1091
    .line 1092
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1093
    .line 1094
    .line 1095
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1096
    .line 1097
    .line 1098
    move-result-object v0

    .line 1099
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 1100
    .line 1101
    .line 1102
    goto :goto_18

    .line 1103
    :cond_1d
    new-instance v0, Ljava/util/ArrayList;

    .line 1104
    .line 1105
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1106
    .line 1107
    .line 1108
    new-instance v4, Lt20;

    .line 1109
    .line 1110
    const/4 v6, 0x5

    .line 1111
    invoke-direct {v4, v1, v6}, Lt20;-><init>(Ljava/lang/ClassLoader;I)V

    .line 1112
    .line 1113
    .line 1114
    invoke-static {v2, v1, v3, v4}, Lx;->ρ(Lkx;Ljava/lang/ClassLoader;Ljava/lang/String;La80;)Ljava/util/List;

    .line 1115
    .line 1116
    .line 1117
    move-result-object v2

    .line 1118
    invoke-static {v0, v2}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 1119
    .line 1120
    .line 1121
    :try_start_b
    invoke-static/range {v17 .. v17}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 1122
    .line 1123
    .line 1124
    move-result-object v2
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_b

    .line 1125
    const/4 v7, 0x0

    .line 1126
    :try_start_c
    invoke-static {v2, v7, v1}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 1127
    .line 1128
    .line 1129
    move-result-object v1

    .line 1130
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1131
    .line 1132
    .line 1133
    const-string v2, "LJIIJ"

    .line 1134
    .line 1135
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1136
    .line 1137
    .line 1138
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1139
    .line 1140
    .line 1141
    filled-new-array {v5, v5, v15}, [Ljava/lang/Class;

    .line 1142
    .line 1143
    .line 1144
    move-result-object v3

    .line 1145
    invoke-static {v1, v2, v3}, Lzj0;->θ(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 1146
    .line 1147
    .line 1148
    move-result-object v1

    .line 1149
    if-eqz v1, :cond_1e

    .line 1150
    .line 1151
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_c

    .line 1152
    .line 1153
    .line 1154
    goto :goto_1c

    .line 1155
    :catchall_b
    const/4 v7, 0x0

    .line 1156
    :catchall_c
    :cond_1e
    :goto_1c
    new-instance v1, Ljava/util/HashSet;

    .line 1157
    .line 1158
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 1159
    .line 1160
    .line 1161
    new-instance v2, Ljava/util/ArrayList;

    .line 1162
    .line 1163
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1164
    .line 1165
    .line 1166
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1167
    .line 1168
    .line 1169
    move-result-object v0

    .line 1170
    :cond_1f
    :goto_1d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1171
    .line 1172
    .line 1173
    move-result v3

    .line 1174
    if-eqz v3, :cond_20

    .line 1175
    .line 1176
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1177
    .line 1178
    .line 1179
    move-result-object v3

    .line 1180
    move-object v4, v3

    .line 1181
    check-cast v4, Ljava/lang/reflect/Method;

    .line 1182
    .line 1183
    invoke-static {v4}, Lzj0;->Δ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 1184
    .line 1185
    .line 1186
    move-result-object v4

    .line 1187
    invoke-virtual {v1, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1188
    .line 1189
    .line 1190
    move-result v4

    .line 1191
    if-eqz v4, :cond_1f

    .line 1192
    .line 1193
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1194
    .line 1195
    .line 1196
    goto :goto_1d

    .line 1197
    :cond_20
    new-instance v0, Ljava/util/ArrayList;

    .line 1198
    .line 1199
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1200
    .line 1201
    .line 1202
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1203
    .line 1204
    .line 1205
    move-result-object v1

    .line 1206
    :cond_21
    :goto_1e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1207
    .line 1208
    .line 1209
    move-result v2

    .line 1210
    if-eqz v2, :cond_22

    .line 1211
    .line 1212
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1213
    .line 1214
    .line 1215
    move-result-object v2

    .line 1216
    move-object v3, v2

    .line 1217
    check-cast v3, Ljava/lang/reflect/Method;

    .line 1218
    .line 1219
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 1220
    .line 1221
    .line 1222
    move-result v4

    .line 1223
    invoke-static {v4}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 1224
    .line 1225
    .line 1226
    move-result v4

    .line 1227
    if-eqz v4, :cond_21

    .line 1228
    .line 1229
    invoke-static {v3}, Lzj0;->σ(Ljava/lang/reflect/Method;)Z

    .line 1230
    .line 1231
    .line 1232
    move-result v3

    .line 1233
    if-eqz v3, :cond_21

    .line 1234
    .line 1235
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1236
    .line 1237
    .line 1238
    goto :goto_1e

    .line 1239
    :cond_22
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1240
    .line 1241
    .line 1242
    move-result-object v1

    .line 1243
    :cond_23
    :goto_1f
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1244
    .line 1245
    .line 1246
    move-result v0

    .line 1247
    if-eqz v0, :cond_25

    .line 1248
    .line 1249
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1250
    .line 1251
    .line 1252
    move-result-object v0

    .line 1253
    move-object v2, v0

    .line 1254
    check-cast v2, Ljava/lang/reflect/Method;

    .line 1255
    .line 1256
    const/4 v6, 0x1

    .line 1257
    :try_start_d
    invoke-virtual {v2, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 1258
    .line 1259
    .line 1260
    invoke-interface/range {v21 .. v21}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1261
    .line 1262
    .line 1263
    move-result-object v0

    .line 1264
    :goto_20
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1265
    .line 1266
    .line 1267
    move-result v3

    .line 1268
    if-eqz v3, :cond_24

    .line 1269
    .line 1270
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1271
    .line 1272
    .line 1273
    move-result-object v3

    .line 1274
    check-cast v3, Ljava/lang/Number;

    .line 1275
    .line 1276
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 1277
    .line 1278
    .line 1279
    move-result v3

    .line 1280
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1281
    .line 1282
    .line 1283
    move-result-object v3

    .line 1284
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1285
    .line 1286
    filled-new-array {v3, v8, v4}, [Ljava/lang/Object;

    .line 1287
    .line 1288
    .line 1289
    move-result-object v3

    .line 1290
    const/4 v4, 0x0

    .line 1291
    invoke-virtual {v2, v4, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_d

    .line 1292
    .line 1293
    .line 1294
    goto :goto_20

    .line 1295
    :catchall_d
    move-exception v0

    .line 1296
    goto :goto_21

    .line 1297
    :cond_24
    move-object/from16 v3, v19

    .line 1298
    .line 1299
    goto :goto_22

    .line 1300
    :goto_21
    new-instance v3, Leo1;

    .line 1301
    .line 1302
    invoke-direct {v3, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1303
    .line 1304
    .line 1305
    :goto_22
    invoke-static {v3}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1306
    .line 1307
    .line 1308
    move-result-object v0

    .line 1309
    if-eqz v0, :cond_23

    .line 1310
    .line 1311
    invoke-static {v2}, Lzj0;->Δ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 1312
    .line 1313
    .line 1314
    move-result-object v2

    .line 1315
    invoke-static {v0}, Lzj0;->Η(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 1316
    .line 1317
    .line 1318
    move-result-object v0

    .line 1319
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1320
    .line 1321
    .line 1322
    move-result-object v0

    .line 1323
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1324
    .line 1325
    const-string v4, "DYHelperIMMarkAllReadHelper: NoticeManager.setNoticeUnReadCount \u8c03\u7528\u5931\u8d25 "

    .line 1326
    .line 1327
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1328
    .line 1329
    .line 1330
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1331
    .line 1332
    .line 1333
    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1334
    .line 1335
    .line 1336
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1337
    .line 1338
    .line 1339
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1340
    .line 1341
    .line 1342
    move-result-object v0

    .line 1343
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 1344
    .line 1345
    .line 1346
    goto :goto_1f

    .line 1347
    :cond_25
    new-instance v1, Ljava/util/ArrayList;

    .line 1348
    .line 1349
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1350
    .line 1351
    .line 1352
    invoke-interface/range {v20 .. v20}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1353
    .line 1354
    .line 1355
    move-result-object v0

    .line 1356
    :cond_26
    :goto_23
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1357
    .line 1358
    .line 1359
    move-result v2

    .line 1360
    if-eqz v2, :cond_27

    .line 1361
    .line 1362
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1363
    .line 1364
    .line 1365
    move-result-object v2

    .line 1366
    move-object v3, v2

    .line 1367
    check-cast v3, Ljava/lang/Number;

    .line 1368
    .line 1369
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 1370
    .line 1371
    .line 1372
    move-result v3

    .line 1373
    if-eqz v3, :cond_26

    .line 1374
    .line 1375
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1376
    .line 1377
    .line 1378
    goto :goto_23

    .line 1379
    :cond_27
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1380
    .line 1381
    .line 1382
    move-result-object v2

    .line 1383
    :cond_28
    :goto_24
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1384
    .line 1385
    .line 1386
    move-result v0

    .line 1387
    if-eqz v0, :cond_2f

    .line 1388
    .line 1389
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1390
    .line 1391
    .line 1392
    move-result-object v0

    .line 1393
    check-cast v0, Ljava/lang/Number;

    .line 1394
    .line 1395
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 1396
    .line 1397
    .line 1398
    move-result v3

    .line 1399
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1400
    .line 1401
    .line 1402
    move-result-object v0

    .line 1403
    invoke-virtual {v9, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1404
    .line 1405
    .line 1406
    move-result-object v0

    .line 1407
    check-cast v0, Ljava/lang/Integer;

    .line 1408
    .line 1409
    if-eqz v0, :cond_29

    .line 1410
    .line 1411
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1412
    .line 1413
    .line 1414
    move-result v0

    .line 1415
    move v4, v0

    .line 1416
    goto :goto_25

    .line 1417
    :cond_29
    move v4, v7

    .line 1418
    :goto_25
    :try_start_e
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1419
    .line 1420
    .line 1421
    move-result-object v0

    .line 1422
    const-string v6, "markAsRead"

    .line 1423
    .line 1424
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1425
    .line 1426
    .line 1427
    filled-new-array {v5, v5}, [Ljava/lang/Class;

    .line 1428
    .line 1429
    .line 1430
    move-result-object v8

    .line 1431
    invoke-static {v0, v6, v8}, Lzj0;->θ(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 1432
    .line 1433
    .line 1434
    move-result-object v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_11

    .line 1435
    if-nez v0, :cond_2a

    .line 1436
    .line 1437
    :catchall_e
    :goto_26
    const/4 v6, 0x1

    .line 1438
    :catchall_f
    const/4 v8, 0x0

    .line 1439
    goto :goto_29

    .line 1440
    :cond_2a
    const/4 v6, 0x1

    .line 1441
    :try_start_f
    invoke-virtual {v0, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_12

    .line 1442
    .line 1443
    .line 1444
    :try_start_10
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1445
    .line 1446
    .line 1447
    move-result-object v6

    .line 1448
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1449
    .line 1450
    .line 1451
    move-result-object v8

    .line 1452
    filled-new-array {v6, v8}, [Ljava/lang/Object;

    .line 1453
    .line 1454
    .line 1455
    move-result-object v6

    .line 1456
    invoke-virtual {v0, v12, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1457
    .line 1458
    .line 1459
    move-result-object v0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_11

    .line 1460
    if-nez v0, :cond_2b

    .line 1461
    .line 1462
    goto :goto_26

    .line 1463
    :cond_2b
    :try_start_11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1464
    .line 1465
    .line 1466
    move-result-object v6

    .line 1467
    invoke-virtual {v6}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 1468
    .line 1469
    .line 1470
    move-result-object v6

    .line 1471
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1472
    .line 1473
    .line 1474
    array-length v8, v6

    .line 1475
    move v10, v7

    .line 1476
    :goto_27
    if-ge v10, v8, :cond_2d

    .line 1477
    .line 1478
    aget-object v11, v6, v10

    .line 1479
    .line 1480
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 1481
    .line 1482
    .line 1483
    move-result-object v13

    .line 1484
    const-string v14, "subscribe"

    .line 1485
    .line 1486
    invoke-static {v13, v14}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1487
    .line 1488
    .line 1489
    move-result v13

    .line 1490
    if-eqz v13, :cond_2c

    .line 1491
    .line 1492
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1493
    .line 1494
    .line 1495
    move-result-object v13

    .line 1496
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1497
    .line 1498
    .line 1499
    array-length v13, v13
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_e

    .line 1500
    if-nez v13, :cond_2c

    .line 1501
    .line 1502
    goto :goto_28

    .line 1503
    :cond_2c
    add-int/lit8 v10, v10, 0x1

    .line 1504
    .line 1505
    goto :goto_27

    .line 1506
    :cond_2d
    const/4 v11, 0x0

    .line 1507
    :goto_28
    if-nez v11, :cond_2e

    .line 1508
    .line 1509
    goto :goto_26

    .line 1510
    :cond_2e
    const/4 v6, 0x1

    .line 1511
    :try_start_12
    invoke-virtual {v11, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_f

    .line 1512
    .line 1513
    .line 1514
    const/4 v8, 0x0

    .line 1515
    :try_start_13
    invoke-virtual {v11, v0, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_10

    .line 1516
    .line 1517
    .line 1518
    :catchall_10
    :goto_29
    move-object/from16 v10, v19

    .line 1519
    .line 1520
    goto :goto_2c

    .line 1521
    :catchall_11
    move-exception v0

    .line 1522
    const/4 v6, 0x1

    .line 1523
    :goto_2a
    const/4 v8, 0x0

    .line 1524
    goto :goto_2b

    .line 1525
    :catchall_12
    move-exception v0

    .line 1526
    goto :goto_2a

    .line 1527
    :goto_2b
    new-instance v10, Leo1;

    .line 1528
    .line 1529
    invoke-direct {v10, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1530
    .line 1531
    .line 1532
    :goto_2c
    invoke-static {v10}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1533
    .line 1534
    .line 1535
    move-result-object v0

    .line 1536
    if-eqz v0, :cond_28

    .line 1537
    .line 1538
    invoke-static {v0}, Lzj0;->Η(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 1539
    .line 1540
    .line 1541
    move-result-object v0

    .line 1542
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1543
    .line 1544
    .line 1545
    move-result-object v0

    .line 1546
    const-string v10, ","

    .line 1547
    .line 1548
    const-string v11, ") \u5931\u8d25: "

    .line 1549
    .line 1550
    const-string v13, "DYHelperIMMarkAllReadHelper: NoticeCountService.markAsRead("

    .line 1551
    .line 1552
    invoke-static {v13, v3, v10, v4, v11}, Lnx;->ο(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 1553
    .line 1554
    .line 1555
    move-result-object v3

    .line 1556
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1557
    .line 1558
    .line 1559
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1560
    .line 1561
    .line 1562
    move-result-object v0

    .line 1563
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 1564
    .line 1565
    .line 1566
    goto/16 :goto_24

    .line 1567
    .line 1568
    :cond_2f
    const-string v0, "cleanNoticeUnreadRedDot"

    .line 1569
    .line 1570
    :try_start_14
    invoke-static {v12, v0}, Lzj0;->μ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_13

    .line 1571
    .line 1572
    .line 1573
    :catchall_13
    const-string v0, "clearNoticeCountMessage"

    .line 1574
    .line 1575
    :try_start_15
    invoke-static {v12, v0}, Lzj0;->μ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_14

    .line 1576
    .line 1577
    .line 1578
    :catchall_14
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1579
    .line 1580
    .line 1581
    const-string v0, "updateUnreadOnShow"

    .line 1582
    .line 1583
    invoke-static {v12, v0}, Lzj0;->ν(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1584
    .line 1585
    .line 1586
    const-string v0, "saveUnreadCountForFirstFrame"

    .line 1587
    .line 1588
    invoke-static {v12, v0}, Lzj0;->ν(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1589
    .line 1590
    .line 1591
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1592
    .line 1593
    const-string v2, "DYHelperIMMarkAllReadHelper: \u5df2\u5904\u7406\u4e92\u52a8\u6d88\u606f\u5df2\u8bfb groups="

    .line 1594
    .line 1595
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1596
    .line 1597
    .line 1598
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1599
    .line 1600
    .line 1601
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1602
    .line 1603
    .line 1604
    move-result-object v0

    .line 1605
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 1606
    .line 1607
    .line 1608
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1609
    .line 1610
    .line 1611
    move-result v0

    .line 1612
    if-nez v0, :cond_30

    .line 1613
    .line 1614
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 1615
    .line 1616
    .line 1617
    move-result v0

    .line 1618
    const-string v1, "\u5df2\u63d0\u4ea4\u4e92\u52a8\u6d88\u606f\u5df2\u8bfb("

    .line 1619
    .line 1620
    const-string v2, "\u7ec4)"

    .line 1621
    .line 1622
    invoke-static {v1, v0, v2}, Lnx;->ζ(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 1623
    .line 1624
    .line 1625
    move-result-object v0

    .line 1626
    goto :goto_2d

    .line 1627
    :cond_30
    const-string v0, "\u5df2\u6e05\u9664\u4e92\u52a8\u6d88\u606f\u7ea2\u70b9"

    .line 1628
    .line 1629
    :goto_2d
    return-object v0

    .line 1630
    :cond_31
    const-string v0, "\u65e0\u6cd5\u83b7\u53d6 NoticeCountService"

    .line 1631
    .line 1632
    invoke-static {v0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 1633
    .line 1634
    .line 1635
    const/4 v0, 0x0

    .line 1636
    return-object v0
.end method

.method public static ω()[Ljava/lang/Class;
    .locals 6

    .line 1
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v4, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 7
    .line 8
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 12
    .line 13
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-object v1, v0

    .line 17
    move-object v2, v0

    .line 18
    move-object v3, v0

    .line 19
    filled-new-array/range {v0 .. v5}, [Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    return-object v0
.end method


# virtual methods
.method public final ε(Ljava/lang/ClassLoader;ZILjava/util/Set;)Lyj0;
    .locals 9

    .line 1
    new-instance v1, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    xor-int/lit8 v2, p2, 0x1

    .line 7
    .line 8
    :try_start_0
    invoke-virtual {p0, p1, p3, p4}, Lzj0;->φ(Ljava/lang/ClassLoader;ILjava/util/Set;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    move-object p0, v0

    .line 15
    new-instance p4, Leo1;

    .line 16
    .line 17
    invoke-direct {p4, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 18
    .line 19
    .line 20
    move-object p0, p4

    .line 21
    :goto_0
    instance-of p4, p0, Leo1;

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    const/4 v4, 0x1

    .line 25
    if-nez p4, :cond_0

    .line 26
    .line 27
    move-object p4, p0

    .line 28
    check-cast p4, Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v1, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move p4, v4

    .line 34
    :goto_1
    move v5, p4

    .line 35
    goto :goto_2

    .line 36
    :cond_0
    move p4, v3

    .line 37
    goto :goto_1

    .line 38
    :goto_2
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    const/4 v8, 0x0

    .line 43
    if-eqz p0, :cond_2

    .line 44
    .line 45
    invoke-static {p0}, Lzj0;->Η(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    if-nez v0, :cond_1

    .line 54
    .line 55
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    :cond_1
    const-string v6, "\u79c1\u4fe1\u5df2\u8bfb\u5931\u8d25\uff1a"

    .line 64
    .line 65
    invoke-virtual {v6, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    const-string v6, "DYHelperIMMarkAllReadHelper: \u79c1\u4fe1\u4e00\u952e\u5df2\u8bfb\u5931\u8d25: "

    .line 77
    .line 78
    invoke-static {v6, v0}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_2
    move-object p0, v8

    .line 83
    :goto_3
    if-eqz p2, :cond_5

    .line 84
    .line 85
    :try_start_1
    invoke-static {p1}, Lzj0;->χ(Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 89
    goto :goto_4

    .line 90
    :catchall_1
    move-exception v0

    .line 91
    new-instance v6, Leo1;

    .line 92
    .line 93
    invoke-direct {v6, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 94
    .line 95
    .line 96
    move-object v0, v6

    .line 97
    :goto_4
    instance-of v6, v0, Leo1;

    .line 98
    .line 99
    if-nez v6, :cond_3

    .line 100
    .line 101
    move-object p4, v0

    .line 102
    check-cast p4, Ljava/lang/String;

    .line 103
    .line 104
    invoke-virtual {v1, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move p4, v4

    .line 108
    move v2, p4

    .line 109
    :cond_3
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    if-eqz v0, :cond_5

    .line 114
    .line 115
    invoke-static {v0}, Lzj0;->Η(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    if-nez v0, :cond_4

    .line 124
    .line 125
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    :cond_4
    const-string v6, "\u4e92\u52a8\u6d88\u606f\u5df2\u8bfb\u5931\u8d25\uff1a"

    .line 134
    .line 135
    invoke-virtual {v6, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    const-string v6, "DYHelperIMMarkAllReadHelper: \u4e92\u52a8\u6d88\u606f\u4e00\u952e\u5df2\u8bfb\u5931\u8d25: "

    .line 147
    .line 148
    invoke-static {v6, v0}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    :cond_5
    if-eqz p4, :cond_7

    .line 152
    .line 153
    if-nez p3, :cond_6

    .line 154
    .line 155
    if-eqz p2, :cond_6

    .line 156
    .line 157
    if-eqz v5, :cond_6

    .line 158
    .line 159
    if-eqz v2, :cond_6

    .line 160
    .line 161
    move v3, v4

    .line 162
    :cond_6
    sget-object p2, Lzj0;->ι:Lh22;

    .line 163
    .line 164
    invoke-virtual {p2}, Lh22;->getValue()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object p3

    .line 168
    check-cast p3, Landroid/os/Handler;

    .line 169
    .line 170
    new-instance v0, Ljg;

    .line 171
    .line 172
    const/4 v2, 0x2

    .line 173
    invoke-direct {v0, p1, v3, v2}, Ljg;-><init>(Ljava/lang/Object;ZI)V

    .line 174
    .line 175
    .line 176
    const-wide/16 v4, 0x0

    .line 177
    .line 178
    invoke-virtual {p3, v0, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 179
    .line 180
    .line 181
    invoke-virtual {p2}, Lh22;->getValue()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object p3

    .line 185
    check-cast p3, Landroid/os/Handler;

    .line 186
    .line 187
    new-instance v0, Ljg;

    .line 188
    .line 189
    invoke-direct {v0, p1, v3, v2}, Ljg;-><init>(Ljava/lang/Object;ZI)V

    .line 190
    .line 191
    .line 192
    const-wide/16 v4, 0x15e

    .line 193
    .line 194
    invoke-virtual {p3, v0, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 195
    .line 196
    .line 197
    invoke-virtual {p2}, Lh22;->getValue()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object p2

    .line 201
    check-cast p2, Landroid/os/Handler;

    .line 202
    .line 203
    new-instance p3, Ljg;

    .line 204
    .line 205
    const/4 v0, 0x2

    .line 206
    invoke-direct {p3, p1, v3, v0}, Ljg;-><init>(Ljava/lang/Object;ZI)V

    .line 207
    .line 208
    .line 209
    const-wide/16 v2, 0x4b0

    .line 210
    .line 211
    invoke-virtual {p2, p3, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 212
    .line 213
    .line 214
    :cond_7
    const/4 v6, 0x0

    .line 215
    const/16 v7, 0x3e

    .line 216
    .line 217
    const-string v2, "\uff1b"

    .line 218
    .line 219
    const/4 v3, 0x0

    .line 220
    const/4 v4, 0x0

    .line 221
    const/4 v5, 0x0

    .line 222
    invoke-static/range {v1 .. v7}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object p1

    .line 226
    invoke-static {p1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 227
    .line 228
    .line 229
    move-result p2

    .line 230
    if-eqz p2, :cond_9

    .line 231
    .line 232
    if-eqz p4, :cond_8

    .line 233
    .line 234
    const-string p1, "\u5df2\u63d0\u4ea4\u4e00\u952e\u5df2\u8bfb\u8bf7\u6c42"

    .line 235
    .line 236
    goto :goto_5

    .line 237
    :cond_8
    const-string p1, "\u6ca1\u6709\u53ef\u5904\u7406\u7684\u6d88\u606f"

    .line 238
    .line 239
    :cond_9
    :goto_5
    if-eqz p4, :cond_a

    .line 240
    .line 241
    goto :goto_6

    .line 242
    :cond_a
    move-object v8, p0

    .line 243
    :goto_6
    new-instance p0, Lyj0;

    .line 244
    .line 245
    invoke-direct {p0, p4, p1, v8}, Lyj0;-><init>(ZLjava/lang/String;Ljava/lang/Throwable;)V

    .line 246
    .line 247
    .line 248
    return-object p0
.end method

.method public final κ(Ljava/lang/ClassLoader;)V
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    sget-object v1, Lzj0;->θ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-virtual {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto/16 :goto_5

    .line 12
    .line 13
    :cond_0
    :try_start_0
    sget-object v0, Lzj0;->λ:[Ljava/lang/String;

    .line 14
    .line 15
    array-length v3, v0

    .line 16
    move v4, v2

    .line 17
    :goto_0
    const/4 v5, 0x0

    .line 18
    if-ge v4, v3, :cond_2

    .line 19
    .line 20
    aget-object v6, v0, v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 21
    .line 22
    :try_start_1
    invoke-static {v6, v2, p1}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    move-result-object v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    goto :goto_1

    .line 27
    :catchall_0
    move-exception v6

    .line 28
    :try_start_2
    new-instance v7, Leo1;

    .line 29
    .line 30
    invoke-direct {v7, v6}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    move-object v6, v7

    .line 34
    :goto_1
    instance-of v7, v6, Leo1;

    .line 35
    .line 36
    if-eqz v7, :cond_1

    .line 37
    .line 38
    move-object v6, v5

    .line 39
    :cond_1
    check-cast v6, Ljava/lang/Class;

    .line 40
    .line 41
    if-nez v6, :cond_3

    .line 42
    .line 43
    add-int/lit8 v4, v4, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catchall_1
    move-exception p0

    .line 47
    goto :goto_3

    .line 48
    :cond_2
    move-object v6, v5

    .line 49
    :cond_3
    if-eqz v6, :cond_5

    .line 50
    .line 51
    invoke-virtual {v6}, Ljava/lang/Class;->isInterface()Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    if-nez p1, :cond_4

    .line 56
    .line 57
    move-object v5, v6

    .line 58
    :cond_4
    if-eqz v5, :cond_5

    .line 59
    .line 60
    sget-object p1, Lxq0;->α:Lxq0;

    .line 61
    .line 62
    new-instance v0, Loj0;

    .line 63
    .line 64
    const/4 v3, 0x1

    .line 65
    invoke-direct {v0, v3, p0}, Loj0;-><init>(ILjava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1, v5, v0}, Lxq0;->β(Ljava/lang/Class;Lm01;)Ljava/util/Set;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    new-instance p1, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 78
    .line 79
    .line 80
    const-string v0, "DYHelperIMMarkAllReadHelper: \u5df2 Hook "

    .line 81
    .line 82
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    const-string p0, " \u6784\u9020\u51fd\u6570"

    .line 89
    .line 90
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    invoke-static {p0}, Lux;->ρ(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_5
    const-string p0, "DYHelperIMMarkAllReadHelper: ConversationListModel concrete class optional missing on host 39.0"

    .line 102
    .line 103
    invoke-static {p0}, Lux;->ρ(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    :goto_2
    sget-object p0, Ls62;->α:Ls62;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 107
    .line 108
    goto :goto_4

    .line 109
    :goto_3
    new-instance p1, Leo1;

    .line 110
    .line 111
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 112
    .line 113
    .line 114
    move-object p0, p1

    .line 115
    :goto_4
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    if-eqz p0, :cond_6

    .line 120
    .line 121
    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 122
    .line 123
    .line 124
    invoke-static {p0}, Lzj0;->Η(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    const-string p1, "DYHelperIMMarkAllReadHelper: Hook ConversationListModel \u6784\u9020\u51fd\u6570\u5931\u8d25: "

    .line 133
    .line 134
    invoke-static {p1, p0}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    :cond_6
    :goto_5
    return-void
.end method

.method public final φ(Ljava/lang/ClassLoader;ILjava/util/Set;)Ljava/lang/String;
    .locals 10

    .line 1
    sget-object v0, Lzj0;->ε:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object v0, v1

    .line 12
    :goto_0
    invoke-static {v0}, Lzj0;->ξ(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    if-eqz v0, :cond_2

    .line 20
    .line 21
    sput-object v1, Lzj0;->ε:Ljava/lang/ref/WeakReference;

    .line 22
    .line 23
    :cond_2
    move-object v0, v1

    .line 24
    :goto_1
    const/4 v2, 0x0

    .line 25
    if-eqz v0, :cond_3

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    const-string p1, "DYHelperIMMarkAllReadHelper: \u4f7f\u7528\u5df2\u6355\u83b7\u7684 ConversationListModel: "

    .line 36
    .line 37
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-static {p0}, Lux;->ρ(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    :goto_2
    move-object p0, v0

    .line 45
    goto/16 :goto_d

    .line 46
    .line 47
    :cond_3
    invoke-virtual {p0, p1}, Lzj0;->κ(Ljava/lang/ClassLoader;)V

    .line 48
    .line 49
    .line 50
    new-instance v3, Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 53
    .line 54
    .line 55
    sget-object p0, Lry1;->Α:Ljava/util/concurrent/atomic/AtomicReference;

    .line 56
    .line 57
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    if-nez p0, :cond_4

    .line 62
    .line 63
    :goto_3
    move-object v0, v1

    .line 64
    goto :goto_7

    .line 65
    :cond_4
    :try_start_0
    const-string v0, "getIIMSdkModelService"

    .line 66
    .line 67
    invoke-static {p0, v0}, Lzj0;->μ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    goto :goto_4

    .line 72
    :catchall_0
    move-exception v0

    .line 73
    move-object p0, v0

    .line 74
    new-instance v0, Leo1;

    .line 75
    .line 76
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 77
    .line 78
    .line 79
    move-object p0, v0

    .line 80
    :goto_4
    instance-of v0, p0, Leo1;

    .line 81
    .line 82
    if-eqz v0, :cond_5

    .line 83
    .line 84
    move-object p0, v1

    .line 85
    :cond_5
    if-nez p0, :cond_6

    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_6
    :try_start_1
    const-string v0, "getConversationListModel"

    .line 89
    .line 90
    invoke-static {p0, v0}, Lzj0;->μ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 94
    goto :goto_5

    .line 95
    :catchall_1
    move-exception v0

    .line 96
    move-object p0, v0

    .line 97
    new-instance v0, Leo1;

    .line 98
    .line 99
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 100
    .line 101
    .line 102
    move-object p0, v0

    .line 103
    :goto_5
    instance-of v0, p0, Leo1;

    .line 104
    .line 105
    if-eqz v0, :cond_7

    .line 106
    .line 107
    move-object p0, v1

    .line 108
    :cond_7
    if-eqz p0, :cond_8

    .line 109
    .line 110
    invoke-static {p0}, Lzj0;->ξ(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    if-eqz v0, :cond_8

    .line 115
    .line 116
    goto :goto_6

    .line 117
    :cond_8
    move-object p0, v1

    .line 118
    :goto_6
    move-object v0, p0

    .line 119
    :goto_7
    if-eqz v0, :cond_9

    .line 120
    .line 121
    const-string p0, "imsdk-context"

    .line 122
    .line 123
    invoke-static {v0, p0}, Lzj0;->δ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_9
    sget-object p0, Lzj0;->λ:[Ljava/lang/String;

    .line 128
    .line 129
    array-length v4, p0

    .line 130
    move v5, v2

    .line 131
    :goto_8
    if-ge v5, v4, :cond_d

    .line 132
    .line 133
    aget-object v6, p0, v5

    .line 134
    .line 135
    :try_start_2
    invoke-static {v6, v2, p1}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    invoke-static {v0, v3}, Lzj0;->Ζ(Ljava/lang/Class;Ljava/util/ArrayList;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    if-eqz v0, :cond_a

    .line 147
    .line 148
    new-instance v7, Ljava/lang/StringBuilder;

    .line 149
    .line 150
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 151
    .line 152
    .line 153
    const-string v8, "known:"

    .line 154
    .line 155
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v7

    .line 165
    invoke-static {v0, v7}, Lzj0;->δ(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 166
    .line 167
    .line 168
    goto :goto_2

    .line 169
    :catchall_2
    move-exception v0

    .line 170
    goto :goto_9

    .line 171
    :cond_a
    move-object v7, v1

    .line 172
    goto :goto_a

    .line 173
    :goto_9
    new-instance v7, Leo1;

    .line 174
    .line 175
    invoke-direct {v7, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 176
    .line 177
    .line 178
    :goto_a
    invoke-static {v7}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    if-eqz v0, :cond_c

    .line 183
    .line 184
    invoke-static {v0}, Lzj0;->Η(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    move-result-object v7

    .line 192
    invoke-virtual {v7}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v7

    .line 196
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    if-nez v0, :cond_b

    .line 201
    .line 202
    const-string v0, ""

    .line 203
    .line 204
    :cond_b
    new-instance v8, Ljava/lang/StringBuilder;

    .line 205
    .line 206
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    const-string v6, " "

    .line 213
    .line 214
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    const-string v6, ":"

    .line 221
    .line 222
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 233
    .line 234
    .line 235
    :cond_c
    add-int/lit8 v5, v5, 0x1

    .line 236
    .line 237
    goto :goto_8

    .line 238
    :cond_d
    sget-object p0, Lzj0;->ε:Ljava/lang/ref/WeakReference;

    .line 239
    .line 240
    if-eqz p0, :cond_e

    .line 241
    .line 242
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object p0

    .line 246
    goto :goto_b

    .line 247
    :cond_e
    move-object p0, v1

    .line 248
    :goto_b
    invoke-static {p0}, Lzj0;->ξ(Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    move-result p1

    .line 252
    if-eqz p1, :cond_f

    .line 253
    .line 254
    move-object v0, p0

    .line 255
    goto :goto_c

    .line 256
    :cond_f
    if-eqz p0, :cond_10

    .line 257
    .line 258
    sput-object v1, Lzj0;->ε:Ljava/lang/ref/WeakReference;

    .line 259
    .line 260
    :cond_10
    move-object v0, v1

    .line 261
    :goto_c
    if-eqz v0, :cond_29

    .line 262
    .line 263
    goto/16 :goto_2

    .line 264
    .line 265
    :goto_d
    const/4 p1, 0x1

    .line 266
    if-nez p2, :cond_12

    .line 267
    .line 268
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    const-string v3, "markAllConversationRead"

    .line 273
    .line 274
    new-array v4, v2, [Ljava/lang/Class;

    .line 275
    .line 276
    invoke-static {v0, v3, v4}, Lzj0;->θ(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    if-eqz v0, :cond_11

    .line 281
    .line 282
    invoke-virtual {v0, p1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 289
    .line 290
    .line 291
    move-result-object p0

    .line 292
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object p0

    .line 296
    const-string p1, "DYHelperIMMarkAllReadHelper: \u5df2\u8c03\u7528 "

    .line 297
    .line 298
    const-string p2, ".markAllConversationRead()"

    .line 299
    .line 300
    invoke-static {p1, p0, p2}, Lnx;->Ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    const-string p0, "\u5df2\u63d0\u4ea4\u5168\u90e8\u79c1\u4fe1\u4f1a\u8bdd\u5df2\u8bfb"

    .line 304
    .line 305
    return-object p0

    .line 306
    :cond_11
    const-string v0, "DYHelperIMMarkAllReadHelper: \u672a\u627e\u5230 markAllConversationRead\uff0c\u964d\u7ea7\u9010\u4f1a\u8bdd\u5df2\u8bfb"

    .line 307
    .line 308
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    :cond_12
    const-string v0, "S2"

    .line 312
    .line 313
    const-string v3, "y3"

    .line 314
    .line 315
    const-string v4, "getAllConversationSyncNoSort"

    .line 316
    .line 317
    const-string v5, "getAllConversationSync"

    .line 318
    .line 319
    filled-new-array {v4, v5, v0, v3}, [Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v3

    .line 323
    move v4, v2

    .line 324
    :goto_e
    const/4 v0, 0x4

    .line 325
    if-ge v4, v0, :cond_19

    .line 326
    .line 327
    aget-object v0, v3, v4

    .line 328
    .line 329
    :try_start_3
    invoke-static {p0, v0}, Lzj0;->μ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 333
    goto :goto_f

    .line 334
    :catchall_3
    move-exception v0

    .line 335
    new-instance v5, Leo1;

    .line 336
    .line 337
    invoke-direct {v5, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 338
    .line 339
    .line 340
    move-object v0, v5

    .line 341
    :goto_f
    instance-of v5, v0, Leo1;

    .line 342
    .line 343
    if-eqz v5, :cond_13

    .line 344
    .line 345
    move-object v0, v1

    .line 346
    :cond_13
    if-nez v0, :cond_15

    .line 347
    .line 348
    :cond_14
    move-object v0, v1

    .line 349
    goto :goto_10

    .line 350
    :cond_15
    instance-of v5, v0, Ljava/lang/Iterable;

    .line 351
    .line 352
    if-eqz v5, :cond_16

    .line 353
    .line 354
    check-cast v0, Ljava/lang/Iterable;

    .line 355
    .line 356
    goto :goto_10

    .line 357
    :cond_16
    instance-of v5, v0, [Ljava/lang/Object;

    .line 358
    .line 359
    if-eqz v5, :cond_14

    .line 360
    .line 361
    check-cast v0, [Ljava/lang/Object;

    .line 362
    .line 363
    array-length v5, v0

    .line 364
    if-nez v5, :cond_17

    .line 365
    .line 366
    sget-object v0, Ljz;->ε:Ljz;

    .line 367
    .line 368
    goto :goto_10

    .line 369
    :cond_17
    new-instance v5, Le7;

    .line 370
    .line 371
    invoke-direct {v5, v2, v0}, Le7;-><init>(ILjava/lang/Object;)V

    .line 372
    .line 373
    .line 374
    move-object v0, v5

    .line 375
    :goto_10
    if-eqz v0, :cond_18

    .line 376
    .line 377
    goto :goto_11

    .line 378
    :cond_18
    add-int/lit8 v4, v4, 0x1

    .line 379
    .line 380
    goto :goto_e

    .line 381
    :cond_19
    move-object v0, v1

    .line 382
    :goto_11
    if-nez v0, :cond_1a

    .line 383
    .line 384
    goto/16 :goto_1a

    .line 385
    .line 386
    :cond_1a
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 387
    .line 388
    .line 389
    move-result-object v3

    .line 390
    const-class v4, Ljava/lang/String;

    .line 391
    .line 392
    filled-new-array {v4}, [Ljava/lang/Class;

    .line 393
    .line 394
    .line 395
    move-result-object v4

    .line 396
    const-string v5, "markConversationRead"

    .line 397
    .line 398
    invoke-static {v3, v5, v4}, Lzj0;->θ(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 399
    .line 400
    .line 401
    move-result-object v3

    .line 402
    if-nez v3, :cond_1b

    .line 403
    .line 404
    goto/16 :goto_1a

    .line 405
    .line 406
    :cond_1b
    invoke-virtual {v3, p1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 407
    .line 408
    .line 409
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 410
    .line 411
    .line 412
    move-result-object v4

    .line 413
    move v5, v2

    .line 414
    :cond_1c
    :goto_12
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 415
    .line 416
    .line 417
    move-result v0

    .line 418
    if-eqz v0, :cond_27

    .line 419
    .line 420
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object v0

    .line 424
    sget-object v6, Lck0;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 425
    .line 426
    if-nez v0, :cond_1e

    .line 427
    .line 428
    :cond_1d
    move v6, v2

    .line 429
    goto :goto_14

    .line 430
    :cond_1e
    if-eqz p2, :cond_1f

    .line 431
    .line 432
    if-eq p2, p1, :cond_21

    .line 433
    .line 434
    const/4 v6, 0x2

    .line 435
    if-eq p2, v6, :cond_20

    .line 436
    .line 437
    :cond_1f
    :goto_13
    move v6, p1

    .line 438
    goto :goto_14

    .line 439
    :cond_20
    invoke-static {v0, p3}, Lck0;->ε(Ljava/lang/Object;Ljava/util/Set;)Z

    .line 440
    .line 441
    .line 442
    move-result v6

    .line 443
    if-nez v6, :cond_1d

    .line 444
    .line 445
    goto :goto_13

    .line 446
    :cond_21
    invoke-static {v0, p3}, Lck0;->ε(Ljava/lang/Object;Ljava/util/Set;)Z

    .line 447
    .line 448
    .line 449
    move-result v6

    .line 450
    :goto_14
    if-eqz v6, :cond_1c

    .line 451
    .line 452
    if-nez v0, :cond_23

    .line 453
    .line 454
    :cond_22
    move-object v0, v1

    .line 455
    goto :goto_15

    .line 456
    :cond_23
    :try_start_4
    const-string v6, "getConversationId"

    .line 457
    .line 458
    invoke-static {v0, v6}, Lzj0;->μ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    move-result-object v0

    .line 462
    instance-of v6, v0, Ljava/lang/String;

    .line 463
    .line 464
    if-eqz v6, :cond_22

    .line 465
    .line 466
    check-cast v0, Ljava/lang/String;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 467
    .line 468
    goto :goto_15

    .line 469
    :catchall_4
    move-exception v0

    .line 470
    new-instance v6, Leo1;

    .line 471
    .line 472
    invoke-direct {v6, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 473
    .line 474
    .line 475
    move-object v0, v6

    .line 476
    :goto_15
    instance-of v6, v0, Leo1;

    .line 477
    .line 478
    if-eqz v6, :cond_24

    .line 479
    .line 480
    move-object v0, v1

    .line 481
    :cond_24
    move-object v6, v0

    .line 482
    check-cast v6, Ljava/lang/String;

    .line 483
    .line 484
    if-eqz v6, :cond_26

    .line 485
    .line 486
    invoke-static {v6}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 487
    .line 488
    .line 489
    move-result v0

    .line 490
    if-eqz v0, :cond_25

    .line 491
    .line 492
    goto :goto_16

    .line 493
    :cond_25
    move v0, v2

    .line 494
    goto :goto_17

    .line 495
    :cond_26
    :goto_16
    move v0, p1

    .line 496
    :goto_17
    if-nez v0, :cond_1c

    .line 497
    .line 498
    :try_start_5
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 499
    .line 500
    .line 501
    move-result-object v0

    .line 502
    invoke-virtual {v3, p0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_6

    .line 503
    .line 504
    .line 505
    add-int/lit8 v7, v5, 0x1

    .line 506
    .line 507
    :try_start_6
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 508
    .line 509
    .line 510
    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 511
    move v5, v7

    .line 512
    goto :goto_19

    .line 513
    :catchall_5
    move-exception v0

    .line 514
    move v5, v7

    .line 515
    goto :goto_18

    .line 516
    :catchall_6
    move-exception v0

    .line 517
    :goto_18
    new-instance v7, Leo1;

    .line 518
    .line 519
    invoke-direct {v7, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 520
    .line 521
    .line 522
    move-object v0, v7

    .line 523
    :goto_19
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 524
    .line 525
    .line 526
    move-result-object v0

    .line 527
    if-eqz v0, :cond_1c

    .line 528
    .line 529
    invoke-static {v0}, Lzj0;->Η(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 530
    .line 531
    .line 532
    move-result-object v0

    .line 533
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 534
    .line 535
    .line 536
    move-result-object v0

    .line 537
    new-instance v7, Ljava/lang/StringBuilder;

    .line 538
    .line 539
    const-string v8, "DYHelperIMMarkAllReadHelper: markConversationRead("

    .line 540
    .line 541
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 542
    .line 543
    .line 544
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 545
    .line 546
    .line 547
    const-string v6, ") \u5931\u8d25: "

    .line 548
    .line 549
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 550
    .line 551
    .line 552
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 553
    .line 554
    .line 555
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 556
    .line 557
    .line 558
    move-result-object v0

    .line 559
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 560
    .line 561
    .line 562
    goto/16 :goto_12

    .line 563
    .line 564
    :cond_27
    move v2, v5

    .line 565
    :goto_1a
    if-lez v2, :cond_28

    .line 566
    .line 567
    const-string p0, "\u5df2\u63d0\u4ea4 "

    .line 568
    .line 569
    const-string p1, " \u4e2a\u79c1\u4fe1\u4f1a\u8bdd\u5df2\u8bfb"

    .line 570
    .line 571
    invoke-static {p0, v2, p1}, Lnx;->ζ(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 572
    .line 573
    .line 574
    move-result-object p0

    .line 575
    goto :goto_1b

    .line 576
    :cond_28
    const-string p0, "\u6ca1\u6709\u5339\u914d\u7684\u79c1\u4fe1\u4f1a\u8bdd"

    .line 577
    .line 578
    :goto_1b
    return-object p0

    .line 579
    :cond_29
    const/4 v8, 0x0

    .line 580
    const/16 v9, 0x3e

    .line 581
    .line 582
    const-string v4, "\uff1b"

    .line 583
    .line 584
    const/4 v5, 0x0

    .line 585
    const/4 v6, 0x0

    .line 586
    const/4 v7, 0x0

    .line 587
    invoke-static/range {v3 .. v9}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 588
    .line 589
    .line 590
    move-result-object p0

    .line 591
    const-string p1, "\u65e0\u6cd5\u83b7\u53d6 ConversationListModel \u5b9e\u4f8b\uff1b\u5df2\u79fb\u9664\u4e0d\u5b58\u5728\u7684 Provider \u626b\u63cf\uff0c\u5f53\u524d\u4f7f\u7528\u6784\u9020\u51fd\u6570 Hook \u6355\u83b7\u5b9e\u4f8b\u3002\u8bf7\u5148\u8fdb\u5165\u79c1\u4fe1\u9875\u6216\u7b49\u5f85 IM SDK \u521d\u59cb\u5316\u5b8c\u6210\uff1b"

    .line 592
    .line 593
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 594
    .line 595
    .line 596
    move-result-object p0

    .line 597
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 598
    .line 599
    .line 600
    return-object v1
.end method

.method public final ψ(Landroid/app/Activity;La80;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lzj0;->ζ:Ljava/util/concurrent/atomic/AtomicBoolean;

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
    move-result v1

    .line 12
    const/4 v3, 0x0

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    new-instance p0, Lyj0;

    .line 16
    .line 17
    const-string p1, "\u4e00\u952e\u5df2\u8bfb\u6b63\u5728\u6267\u884c\uff0c\u8bf7\u7a0d\u5019"

    .line 18
    .line 19
    invoke-direct {p0, v2, p1, v3}, Lyj0;-><init>(ZLjava/lang/String;Ljava/lang/Throwable;)V

    .line 20
    .line 21
    .line 22
    invoke-static {p2, p0}, Lzj0;->Γ(La80;Lyj0;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    sget-object v1, Lzj0;->δ:Ljava/lang/ClassLoader;

    .line 27
    .line 28
    if-nez v1, :cond_1

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    if-nez v1, :cond_1

    .line 39
    .line 40
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p1}, Ljava/lang/Thread;->getContextClassLoader()Ljava/lang/ClassLoader;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    :cond_1
    if-nez v1, :cond_2

    .line 49
    .line 50
    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 51
    .line 52
    .line 53
    new-instance p0, Lyj0;

    .line 54
    .line 55
    const-string p1, "\u83b7\u53d6\u6296\u97f3 ClassLoader \u5931\u8d25"

    .line 56
    .line 57
    invoke-direct {p0, v2, p1, v3}, Lyj0;-><init>(ZLjava/lang/String;Ljava/lang/Throwable;)V

    .line 58
    .line 59
    .line 60
    invoke-static {p2, p0}, Lzj0;->Γ(La80;Lyj0;)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :cond_2
    invoke-virtual {p0, v1}, Lzj0;->κ(Ljava/lang/ClassLoader;)V

    .line 65
    .line 66
    .line 67
    new-instance p0, Ljava/lang/Thread;

    .line 68
    .line 69
    new-instance p1, Lii0;

    .line 70
    .line 71
    const/4 v0, 0x2

    .line 72
    invoke-direct {p1, v1, v0, p2}, Lii0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    const-string p2, "rf687268eb18bbe5d"

    .line 76
    .line 77
    invoke-direct {p0, p1, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0}, Ljava/lang/Thread;->start()V

    .line 81
    .line 82
    .line 83
    return-void
.end method
