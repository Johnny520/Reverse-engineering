.class public final Lyz0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Lyz0;

.field public static final β:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final γ:Landroid/os/Handler;

.field public static final δ:Ljava/util/Map;

.field public static final ε:Ljava/lang/Object;

.field public static final ζ:Ljava/util/HashSet;

.field public static final η:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lyz0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lyz0;->α:Lyz0;

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
    sput-object v0, Lyz0;->β:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 15
    .line 16
    new-instance v0, Landroid/os/Handler;

    .line 17
    .line 18
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-direct {v0, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 23
    .line 24
    .line 25
    sput-object v0, Lyz0;->γ:Landroid/os/Handler;

    .line 26
    .line 27
    new-instance v0, Ljava/util/WeakHashMap;

    .line 28
    .line 29
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    sput-object v0, Lyz0;->δ:Ljava/util/Map;

    .line 37
    .line 38
    new-instance v0, Ljava/lang/Object;

    .line 39
    .line 40
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 41
    .line 42
    .line 43
    sput-object v0, Lyz0;->ε:Ljava/lang/Object;

    .line 44
    .line 45
    new-instance v0, Ljava/util/HashSet;

    .line 46
    .line 47
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 48
    .line 49
    .line 50
    sput-object v0, Lyz0;->ζ:Ljava/util/HashSet;

    .line 51
    .line 52
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 53
    .line 54
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 55
    .line 56
    .line 57
    sput-object v0, Lyz0;->η:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 58
    .line 59
    return-void
.end method

.method public static final α(Ljava/lang/Class;Ljava/lang/reflect/Method;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_6

    .line 10
    .line 11
    move-object v0, p0

    .line 12
    :goto_0
    if-eqz v0, :cond_5

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_5

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    new-instance v2, Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 34
    .line 35
    .line 36
    array-length v3, v1

    .line 37
    const/4 v4, 0x0

    .line 38
    :goto_1
    if-ge v4, v3, :cond_1

    .line 39
    .line 40
    aget-object v5, v1, v4

    .line 41
    .line 42
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    if-nez v6, :cond_0

    .line 51
    .line 52
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 57
    .line 58
    .line 59
    move-result v6

    .line 60
    if-nez v6, :cond_0

    .line 61
    .line 62
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->isSynthetic()Z

    .line 63
    .line 64
    .line 65
    move-result v6

    .line 66
    if-nez v6, :cond_0

    .line 67
    .line 68
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->isBridge()Z

    .line 69
    .line 70
    .line 71
    move-result v6

    .line 72
    if-nez v6, :cond_0

    .line 73
    .line 74
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v7

    .line 82
    invoke-static {v6, v7}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v6

    .line 86
    if-eqz v6, :cond_0

    .line 87
    .line 88
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    move-result-object v7

    .line 96
    invoke-static {v6, v7}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v6

    .line 100
    if-eqz v6, :cond_0

    .line 101
    .line 102
    const-class v6, Ljava/util/List;

    .line 103
    .line 104
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    move-result-object v7

    .line 108
    invoke-virtual {v6, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 109
    .line 110
    .line 111
    move-result v6

    .line 112
    if-eqz v6, :cond_0

    .line 113
    .line 114
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    const/4 v3, 0x1

    .line 125
    if-gt v1, v3, :cond_4

    .line 126
    .line 127
    invoke-static {v2}, Lxh;->Э(Ljava/util/List;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    check-cast v1, Ljava/lang/reflect/Method;

    .line 132
    .line 133
    if-eqz v1, :cond_3

    .line 134
    .line 135
    invoke-virtual {v1, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 136
    .line 137
    .line 138
    sget-object p0, Lyz0;->ε:Ljava/lang/Object;

    .line 139
    .line 140
    monitor-enter p0

    .line 141
    :try_start_0
    sget-object p1, Lyz0;->ζ:Ljava/util/HashSet;

    .line 142
    .line 143
    invoke-virtual {p1, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 147
    if-eqz v0, :cond_2

    .line 148
    .line 149
    monitor-exit p0

    .line 150
    return-void

    .line 151
    :cond_2
    :try_start_1
    sget-object v0, Lxq0;->α:Lxq0;

    .line 152
    .line 153
    new-instance v2, Loj0;

    .line 154
    .line 155
    const/16 v3, 0x11

    .line 156
    .line 157
    invoke-direct {v2, v3}, Loj0;-><init>(I)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v0, v1, v2}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 161
    .line 162
    .line 163
    invoke-virtual {p1, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 164
    .line 165
    .line 166
    monitor-exit p0

    .line 167
    return-void

    .line 168
    :catchall_0
    move-exception p1

    .line 169
    monitor-exit p0

    .line 170
    throw p1

    .line 171
    :cond_3
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    goto/16 :goto_0

    .line 176
    .line 177
    :cond_4
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object p0

    .line 181
    const-string p1, "\u4f1a\u8bdd\u5217\u8868\u6784\u5efa\u5b9e\u73b0\u4e0d\u552f\u4e00: "

    .line 182
    .line 183
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    invoke-static {p0}, Lql1;->δ(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    return-void

    .line 191
    :cond_5
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    const-string p1, "\u672a\u627e\u5230\u4f1a\u8bdd\u5217\u8868\u6784\u5efa\u5b9e\u73b0: "

    .line 196
    .line 197
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object p0

    .line 201
    invoke-static {p0}, Lql1;->δ(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    return-void

    .line 205
    :cond_6
    const-string p0, "\u8fd0\u884c\u65f6\u4f1a\u8bdd Adapter \u4e0d\u5c5e\u4e8e\u6784\u5efa\u5951\u7ea6\u58f0\u660e\u7c7b"

    .line 206
    .line 207
    invoke-static {p0}, Lql1;->δ(Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    return-void
.end method
