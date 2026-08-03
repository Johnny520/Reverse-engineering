.class public final Lp8/d0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lh/Hchat/dexkit/DexFinder;

.field public final c:Ljava/lang/ClassLoader;

.field public final d:Lorg/luckypray/dexkit/DexKitBridge;

.field public final e:Lm8/a;

.field public final f:Lg8/a;

.field public final g:Lg8/i;

.field public final h:Lr8/g;

.field public final i:Ljava/lang/Object;

.field public final j:Ljava/lang/Object;

.field public final k:Ljava/lang/Object;

.field public final l:Ljava/lang/Object;

.field public volatile m:Lp8/y;

.field public final n:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lh/Hchat/dexkit/DexFinder;Ljava/lang/ClassLoader;Lorg/luckypray/dexkit/DexKitBridge;Lm8/a;Lg8/a;Lg8/i;Lr8/g;Li8/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lp8/d0;->a:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lp8/d0;->b:Lh/Hchat/dexkit/DexFinder;

    .line 7
    .line 8
    iput-object p3, p0, Lp8/d0;->c:Ljava/lang/ClassLoader;

    .line 9
    .line 10
    iput-object p4, p0, Lp8/d0;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 11
    .line 12
    iput-object p5, p0, Lp8/d0;->e:Lm8/a;

    .line 13
    .line 14
    iput-object p6, p0, Lp8/d0;->f:Lg8/a;

    .line 15
    .line 16
    iput-object p7, p0, Lp8/d0;->g:Lg8/i;

    .line 17
    .line 18
    iput-object p8, p0, Lp8/d0;->h:Lr8/g;

    .line 19
    .line 20
    new-instance p1, Lp8/a0;

    .line 21
    .line 22
    const/4 p2, 0x0

    .line 23
    invoke-direct {p1, p0, p2}, Lp8/a0;-><init>(Lp8/d0;I)V

    .line 24
    .line 25
    .line 26
    sget-object p2, Lsf/d;->g:Lsf/d;

    .line 27
    .line 28
    invoke-static {p2, p1}, Lbe/h;->G(Lsf/d;Lfg/a;)Lsf/c;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iput-object p1, p0, Lp8/d0;->i:Ljava/lang/Object;

    .line 33
    .line 34
    new-instance p1, Lp8/a0;

    .line 35
    .line 36
    const/4 p3, 0x1

    .line 37
    invoke-direct {p1, p0, p3}, Lp8/a0;-><init>(Lp8/d0;I)V

    .line 38
    .line 39
    .line 40
    invoke-static {p2, p1}, Lbe/h;->G(Lsf/d;Lfg/a;)Lsf/c;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    iput-object p1, p0, Lp8/d0;->j:Ljava/lang/Object;

    .line 45
    .line 46
    new-instance p1, Lp8/a0;

    .line 47
    .line 48
    const/4 p3, 0x2

    .line 49
    invoke-direct {p1, p0, p3}, Lp8/a0;-><init>(Lp8/d0;I)V

    .line 50
    .line 51
    .line 52
    invoke-static {p2, p1}, Lbe/h;->G(Lsf/d;Lfg/a;)Lsf/c;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    iput-object p1, p0, Lp8/d0;->k:Ljava/lang/Object;

    .line 57
    .line 58
    new-instance p1, Lp8/a0;

    .line 59
    .line 60
    const/4 p3, 0x3

    .line 61
    invoke-direct {p1, p0, p3}, Lp8/a0;-><init>(Lp8/d0;I)V

    .line 62
    .line 63
    .line 64
    invoke-static {p2, p1}, Lbe/h;->G(Lsf/d;Lfg/a;)Lsf/c;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    iput-object p1, p0, Lp8/d0;->l:Ljava/lang/Object;

    .line 69
    .line 70
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 71
    .line 72
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 73
    .line 74
    .line 75
    iput-object p1, p0, Lp8/d0;->n:Ljava/util/concurrent/ConcurrentHashMap;

    .line 76
    .line 77
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/Object;
    .locals 12

    .line 1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x2

    .line 9
    invoke-static {v0, p1}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Ljava/lang/Class;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    if-eqz p1, :cond_c

    .line 17
    .line 18
    const-class v1, Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_0
    const/4 v2, 0x0

    .line 28
    new-array v3, v2, [Ljava/lang/Class;

    .line 29
    .line 30
    invoke-static {p1, v3}, Lh/Hchat/utils/KavaReflector;->findConstructor(Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    new-array v4, v2, [Ljava/lang/Object;

    .line 35
    .line 36
    invoke-static {v3, v4}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    if-eqz v3, :cond_c

    .line 41
    .line 42
    invoke-static {p1}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    move-object v6, v0

    .line 51
    move v5, v2

    .line 52
    :cond_1
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    sget-object v8, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 57
    .line 58
    const/4 v9, 0x1

    .line 59
    if-eqz v7, :cond_4

    .line 60
    .line 61
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v7

    .line 65
    move-object v10, v7

    .line 66
    check-cast v10, Ljava/lang/reflect/Method;

    .line 67
    .line 68
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 69
    .line 70
    .line 71
    move-result v11

    .line 72
    invoke-static {v11}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 73
    .line 74
    .line 75
    move-result v11

    .line 76
    if-nez v11, :cond_2

    .line 77
    .line 78
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    move-result-object v11

    .line 82
    invoke-static {v11, v8}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v11

    .line 86
    if-eqz v11, :cond_2

    .line 87
    .line 88
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    move-result-object v10

    .line 92
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    move-result-object v11

    .line 96
    invoke-static {v10, v11}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v10

    .line 100
    if-eqz v10, :cond_2

    .line 101
    .line 102
    move v10, v9

    .line 103
    goto :goto_1

    .line 104
    :cond_2
    move v10, v2

    .line 105
    :goto_1
    if-eqz v10, :cond_1

    .line 106
    .line 107
    if-eqz v5, :cond_3

    .line 108
    .line 109
    :goto_2
    move-object v6, v0

    .line 110
    goto :goto_3

    .line 111
    :cond_3
    move-object v6, v7

    .line 112
    move v5, v9

    .line 113
    goto :goto_0

    .line 114
    :cond_4
    if-nez v5, :cond_5

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_5
    :goto_3
    check-cast v6, Ljava/lang/reflect/Method;

    .line 118
    .line 119
    if-eqz v6, :cond_c

    .line 120
    .line 121
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    invoke-static {v6, v3, p0}, Lh/Hchat/utils/KavaReflector;->invokeOrThrow(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    move-object v1, v0

    .line 133
    move p1, v2

    .line 134
    :cond_6
    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 135
    .line 136
    .line 137
    move-result v4

    .line 138
    if-eqz v4, :cond_9

    .line 139
    .line 140
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    move-object v5, v4

    .line 145
    check-cast v5, Ljava/lang/reflect/Method;

    .line 146
    .line 147
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 148
    .line 149
    .line 150
    move-result v6

    .line 151
    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 152
    .line 153
    .line 154
    move-result v6

    .line 155
    if-nez v6, :cond_7

    .line 156
    .line 157
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    move-result-object v6

    .line 161
    invoke-static {v6, v8}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v6

    .line 165
    if-eqz v6, :cond_7

    .line 166
    .line 167
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    move-result-object v5

    .line 171
    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 172
    .line 173
    filled-new-array {v6}, [Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    move-result-object v6

    .line 177
    invoke-static {v5, v6}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v5

    .line 181
    if-eqz v5, :cond_7

    .line 182
    .line 183
    move v5, v9

    .line 184
    goto :goto_5

    .line 185
    :cond_7
    move v5, v2

    .line 186
    :goto_5
    if-eqz v5, :cond_6

    .line 187
    .line 188
    if-eqz p1, :cond_8

    .line 189
    .line 190
    goto :goto_6

    .line 191
    :cond_8
    move-object v1, v4

    .line 192
    move p1, v9

    .line 193
    goto :goto_4

    .line 194
    :cond_9
    if-nez p1, :cond_a

    .line 195
    .line 196
    goto :goto_6

    .line 197
    :cond_a
    move-object v0, v1

    .line 198
    :goto_6
    check-cast v0, Ljava/lang/reflect/Method;

    .line 199
    .line 200
    if-eqz v0, :cond_b

    .line 201
    .line 202
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 203
    .line 204
    .line 205
    move-result-object p0

    .line 206
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object p0

    .line 210
    invoke-static {v0, v3, p0}, Lh/Hchat/utils/KavaReflector;->invokeOrThrow(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    :cond_b
    return-object v3

    .line 214
    :cond_c
    return-object v0
.end method

.method public static d(Lp8/v;I)Ljava/lang/String;
    .locals 4

    .line 1
    iget v0, p0, Lp8/v;->c:I

    .line 2
    .line 3
    iget-object v1, p0, Lp8/v;->d:Ljava/util/ArrayList;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eq v0, v2, :cond_5

    .line 7
    .line 8
    const/4 v2, 0x2

    .line 9
    if-eq v0, v2, :cond_4

    .line 10
    .line 11
    const/4 v3, 0x5

    .line 12
    if-eq v0, v3, :cond_3

    .line 13
    .line 14
    const/16 v3, 0xf

    .line 15
    .line 16
    if-eq v0, v3, :cond_3

    .line 17
    .line 18
    const/16 v3, 0x36

    .line 19
    .line 20
    if-eq v0, v3, :cond_2

    .line 21
    .line 22
    if-ne p1, v2, :cond_0

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_1

    .line 36
    .line 37
    iget-object p0, p0, Lp8/v;->b:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    if-nez p0, :cond_1

    .line 44
    .line 45
    const-string p0, "card"

    .line 46
    .line 47
    return-object p0

    .line 48
    :cond_1
    const-string p0, "unknown"

    .line 49
    .line 50
    return-object p0

    .line 51
    :cond_2
    const-string p0, "live_photo"

    .line 52
    .line 53
    return-object p0

    .line 54
    :cond_3
    const-string p0, "video"

    .line 55
    .line 56
    return-object p0

    .line 57
    :cond_4
    :goto_0
    const-string p0, "text"

    .line 58
    .line 59
    return-object p0

    .line 60
    :cond_5
    const-string p0, "image"

    .line 61
    .line 62
    return-object p0
.end method

.method public static f(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    :try_start_0
    const-string v1, "MD5"

    .line 4
    .line 5
    invoke-static {v1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    new-instance v2, Ljava/io/FileInputStream;

    .line 10
    .line 11
    new-instance v3, Ljava/io/File;

    .line 12
    .line 13
    invoke-direct {v3, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {v2, v3}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    .line 19
    const/16 p0, 0x2000

    .line 20
    .line 21
    :try_start_1
    new-array p0, p0, [B

    .line 22
    .line 23
    :goto_0
    invoke-virtual {v2, p0}, Ljava/io/FileInputStream;->read([B)I

    .line 24
    .line 25
    .line 26
    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 27
    const/4 v4, 0x0

    .line 28
    if-gtz v3, :cond_2

    .line 29
    .line 30
    :try_start_2
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/security/MessageDigest;->digest()[B

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    new-instance v1, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 46
    .line 47
    .line 48
    array-length v2, p0

    .line 49
    move v3, v4

    .line 50
    :goto_1
    if-ge v4, v2, :cond_1

    .line 51
    .line 52
    aget-byte v5, p0, v4

    .line 53
    .line 54
    const/4 v6, 0x1

    .line 55
    add-int/2addr v3, v6

    .line 56
    if-le v3, v6, :cond_0

    .line 57
    .line 58
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 59
    .line 60
    .line 61
    :cond_0
    invoke-static {v5}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    const-string v7, "%02x"

    .line 66
    .line 67
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    invoke-static {v5, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    invoke-static {v7, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 80
    .line 81
    .line 82
    add-int/lit8 v4, v4, 0x1

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_1
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 92
    goto :goto_3

    .line 93
    :catchall_0
    move-exception p0

    .line 94
    goto :goto_2

    .line 95
    :cond_2
    :try_start_3
    invoke-virtual {v1, p0, v4, v3}, Ljava/security/MessageDigest;->update([BII)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 96
    .line 97
    .line 98
    goto :goto_0

    .line 99
    :catchall_1
    move-exception p0

    .line 100
    :try_start_4
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 101
    :catchall_2
    move-exception v1

    .line 102
    :try_start_5
    invoke-static {v2, p0}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 103
    .line 104
    .line 105
    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 106
    :goto_2
    new-instance v1, Lsf/f;

    .line 107
    .line 108
    invoke-direct {v1, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 109
    .line 110
    .line 111
    move-object p0, v1

    .line 112
    :goto_3
    nop

    .line 113
    instance-of v1, p0, Lsf/f;

    .line 114
    .line 115
    if-eqz v1, :cond_3

    .line 116
    .line 117
    goto :goto_4

    .line 118
    :cond_3
    move-object v0, p0

    .line 119
    :goto_4
    check-cast v0, Ljava/lang/String;

    .line 120
    .line 121
    return-object v0
.end method

.method public static j(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/reflect/Method;)V
    .locals 0

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-static {p2, p0, p1}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static m(Lp8/s;)Lh/Hchat/hooks/api/model/WeChatSnsMedia;
    .locals 6

    .line 1
    iget-object v1, p0, Lp8/s;->a:Ljava/lang/String;

    .line 2
    .line 3
    iget v2, p0, Lp8/s;->b:I

    .line 4
    .line 5
    iget-object v3, p0, Lp8/s;->c:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v4, p0, Lp8/s;->d:Ljava/lang/String;

    .line 8
    .line 9
    iget-object p0, p0, Lp8/s;->f:Lp8/s;

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    invoke-static {p0}, Lp8/d0;->m(Lp8/s;)Lh/Hchat/hooks/api/model/WeChatSnsMedia;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    :goto_0
    move-object v5, p0

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    goto :goto_0

    .line 21
    :goto_1
    new-instance v0, Lh/Hchat/hooks/api/model/WeChatSnsMedia;

    .line 22
    .line 23
    invoke-direct/range {v0 .. v5}, Lh/Hchat/hooks/api/model/WeChatSnsMedia;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lh/Hchat/hooks/api/model/WeChatSnsMedia;)V

    .line 24
    .line 25
    .line 26
    return-object v0
.end method


# virtual methods
.method public final b(Ljava/lang/String;)Ljava/lang/String;
    .locals 13

    .line 1
    const-string v0, "\u670b\u53cb\u5708\u89c6\u9891\u7f29\u7565\u56fe\u751f\u6210\u5f02\u5e38: "

    .line 2
    .line 3
    new-instance v1, Ljava/io/File;

    .line 4
    .line 5
    iget-object v2, p0, Lp8/d0;->a:Landroid/content/Context;

    .line 6
    .line 7
    invoke-virtual {v2}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    const-string v3, "Hchat_sns_thumb"

    .line 12
    .line 13
    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const/4 v3, 0x0

    .line 21
    if-nez v2, :cond_0

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-nez v2, :cond_0

    .line 28
    .line 29
    goto/16 :goto_3

    .line 30
    .line 31
    :cond_0
    new-instance v2, Ljava/io/File;

    .line 32
    .line 33
    :try_start_0
    const-string v4, "MD5"

    .line 34
    .line 35
    invoke-static {v4}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    sget-object v5, Log/a;->a:Ljava/nio/charset/Charset;

    .line 40
    .line 41
    invoke-virtual {p1, v5}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v4, v5}, Ljava/security/MessageDigest;->digest([B)[B

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    const-string v5, ""

    .line 56
    .line 57
    new-instance v6, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 63
    .line 64
    .line 65
    array-length v7, v4

    .line 66
    const/4 v8, 0x0

    .line 67
    move v9, v8

    .line 68
    :goto_0
    if-ge v8, v7, :cond_2

    .line 69
    .line 70
    aget-byte v10, v4, v8

    .line 71
    .line 72
    const/4 v11, 0x1

    .line 73
    add-int/2addr v9, v11

    .line 74
    if-le v9, v11, :cond_1

    .line 75
    .line 76
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 77
    .line 78
    .line 79
    :cond_1
    invoke-static {v10}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 80
    .line 81
    .line 82
    move-result-object v10

    .line 83
    const-string v12, "%02x"

    .line 84
    .line 85
    filled-new-array {v10}, [Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v10

    .line 89
    invoke-static {v10, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v10

    .line 93
    invoke-static {v12, v10}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v10

    .line 97
    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 98
    .line 99
    .line 100
    add-int/lit8 v8, v8, 0x1

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_2
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 110
    goto :goto_1

    .line 111
    :catchall_0
    move-exception v4

    .line 112
    new-instance v5, Lsf/f;

    .line 113
    .line 114
    invoke-direct {v5, v4}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 115
    .line 116
    .line 117
    move-object v4, v5

    .line 118
    :goto_1
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 119
    .line 120
    .line 121
    move-result v5

    .line 122
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v5

    .line 126
    instance-of v6, v4, Lsf/f;

    .line 127
    .line 128
    if-eqz v6, :cond_3

    .line 129
    .line 130
    move-object v4, v5

    .line 131
    :cond_3
    check-cast v4, Ljava/lang/String;

    .line 132
    .line 133
    const-string v5, ".jpg"

    .line 134
    .line 135
    invoke-static {v4, v5}, Lbc/e;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v4

    .line 139
    invoke-direct {v2, v1, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v2}, Ljava/io/File;->isFile()Z

    .line 143
    .line 144
    .line 145
    move-result v1

    .line 146
    const-wide/16 v4, 0x0

    .line 147
    .line 148
    if-eqz v1, :cond_4

    .line 149
    .line 150
    invoke-virtual {v2}, Ljava/io/File;->length()J

    .line 151
    .line 152
    .line 153
    move-result-wide v6

    .line 154
    cmp-long v1, v6, v4

    .line 155
    .line 156
    if-lez v1, :cond_4

    .line 157
    .line 158
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    return-object p1

    .line 163
    :cond_4
    new-instance v1, Landroid/media/MediaMetadataRetriever;

    .line 164
    .line 165
    invoke-direct {v1}, Landroid/media/MediaMetadataRetriever;-><init>()V

    .line 166
    .line 167
    .line 168
    :try_start_1
    invoke-virtual {v1, p1}, Landroid/media/MediaMetadataRetriever;->setDataSource(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v1}, Landroid/media/MediaMetadataRetriever;->getFrameAtTime()Landroid/graphics/Bitmap;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    if-eqz p1, :cond_6

    .line 176
    .line 177
    new-instance v6, Ljava/io/FileOutputStream;

    .line 178
    .line 179
    invoke-direct {v6, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 180
    .line 181
    .line 182
    :try_start_2
    sget-object v7, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    .line 183
    .line 184
    const/16 v8, 0x55

    .line 185
    .line 186
    invoke-virtual {p1, v7, v8, v6}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 187
    .line 188
    .line 189
    :try_start_3
    invoke-virtual {v6}, Ljava/io/FileOutputStream;->close()V

    .line 190
    .line 191
    .line 192
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v2}, Ljava/io/File;->isFile()Z

    .line 196
    .line 197
    .line 198
    move-result p1

    .line 199
    if-eqz p1, :cond_5

    .line 200
    .line 201
    invoke-virtual {v2}, Ljava/io/File;->length()J

    .line 202
    .line 203
    .line 204
    move-result-wide v6

    .line 205
    cmp-long p1, v6, v4

    .line 206
    .line 207
    if-lez p1, :cond_5

    .line 208
    .line 209
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 213
    goto :goto_2

    .line 214
    :catchall_1
    move-exception p1

    .line 215
    goto :goto_4

    .line 216
    :cond_5
    :goto_2
    :try_start_4
    invoke-virtual {v1}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 217
    .line 218
    .line 219
    goto :goto_5

    .line 220
    :catchall_2
    move-exception p1

    .line 221
    :try_start_5
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 222
    :catchall_3
    move-exception v2

    .line 223
    :try_start_6
    invoke-static {v6, p1}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 224
    .line 225
    .line 226
    throw v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 227
    :cond_6
    :try_start_7
    invoke-virtual {v1}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 228
    .line 229
    .line 230
    :catchall_4
    :goto_3
    return-object v3

    .line 231
    :goto_4
    :try_start_8
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    new-instance v2, Ljava/lang/StringBuilder;

    .line 236
    .line 237
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object p1

    .line 247
    invoke-virtual {p0, p1}, Lp8/d0;->l(Ljava/lang/String;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    .line 248
    .line 249
    .line 250
    goto :goto_2

    .line 251
    :catchall_5
    :goto_5
    return-object v3

    .line 252
    :catchall_6
    move-exception p1

    .line 253
    :try_start_9
    invoke-virtual {v1}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_7

    .line 254
    .line 255
    .line 256
    :catchall_7
    throw p1
.end method

.method public final c(Ljava/lang/String;)Lp8/f;
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const-string p1, ""

    .line 4
    .line 5
    :cond_0
    invoke-static {p1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v1, 0x0

    .line 18
    const/4 v2, 0x0

    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    new-instance p1, Lp8/f;

    .line 22
    .line 23
    invoke-direct {p1, v1, v2}, Lp8/f;-><init>(Ljava/lang/Object;Z)V

    .line 24
    .line 25
    .line 26
    return-object p1

    .line 27
    :cond_1
    invoke-virtual {p0}, Lp8/d0;->g()Lp8/h;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    invoke-virtual {v0, p1}, Lp8/h;->g(Ljava/lang/String;)Lp8/f;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    return-object p1

    .line 38
    :cond_2
    new-instance p1, Lp8/f;

    .line 39
    .line 40
    invoke-direct {p1, v1, v2}, Lp8/f;-><init>(Ljava/lang/Object;Z)V

    .line 41
    .line 42
    .line 43
    return-object p1
.end method

.method public final e(Ljava/lang/Object;Ljava/lang/String;)Z
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v7

    .line 6
    const/4 v0, 0x2

    .line 7
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    const/4 v0, 0x0

    .line 12
    if-eqz p1, :cond_9

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const-string v3, "com.tencent.mm.plugin.sns.storage.SnsInfo"

    .line 23
    .line 24
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_0

    .line 29
    .line 30
    goto/16 :goto_4

    .line 31
    .line 32
    :cond_0
    invoke-static {p2}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    if-nez p2, :cond_1

    .line 45
    .line 46
    goto/16 :goto_4

    .line 47
    .line 48
    :cond_1
    :try_start_0
    const-string p2, "isExtFlag"

    .line 49
    .line 50
    new-array v0, v0, [Ljava/lang/Object;

    .line 51
    .line 52
    invoke-static {p1, p2, v0}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    instance-of v0, p2, Ljava/lang/Boolean;

    .line 57
    .line 58
    const/4 v8, 0x0

    .line 59
    if-eqz v0, :cond_2

    .line 60
    .line 61
    check-cast p2, Ljava/lang/Boolean;

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :catchall_0
    move-exception v0

    .line 65
    move-object p1, v0

    .line 66
    goto :goto_2

    .line 67
    :cond_2
    move-object p2, v8

    .line 68
    :goto_0
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 69
    .line 70
    invoke-static {p2, v6}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result p2

    .line 74
    if-nez p2, :cond_4

    .line 75
    .line 76
    invoke-virtual {p0}, Lp8/d0;->h()Lp8/x;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    if-eqz p2, :cond_3

    .line 81
    .line 82
    invoke-virtual {p2}, Lp8/x;->f()Ljava/lang/reflect/Method;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    if-eqz p2, :cond_3

    .line 87
    .line 88
    const-wide/16 v0, 0x0

    .line 89
    .line 90
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    const-string v5, ""

    .line 95
    .line 96
    move-object v1, p1

    .line 97
    filled-new-array/range {v1 .. v7}, [Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-static {p2, v8, p1}, Lh/Hchat/utils/KavaReflector;->invokeOrThrow(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 106
    .line 107
    const-string p2, "\u539f\u751f\u8bc4\u8bba\u65b9\u6cd5\u672a\u5c31\u7eea"

    .line 108
    .line 109
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    throw p1

    .line 113
    :cond_4
    move-object v1, p1

    .line 114
    invoke-virtual {p0}, Lp8/d0;->h()Lp8/x;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    if-eqz p1, :cond_6

    .line 119
    .line 120
    invoke-virtual {p1}, Lp8/x;->g()Ljava/lang/reflect/Method;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    if-eqz p1, :cond_6

    .line 125
    .line 126
    invoke-static {v3, p1}, Lp8/d0;->a(Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p2

    .line 130
    if-eqz p2, :cond_5

    .line 131
    .line 132
    filled-new-array {v1, v2, p2, v7}, [Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p2

    .line 136
    invoke-static {p1, v8, p2}, Lh/Hchat/utils/KavaReflector;->invokeOrThrow(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    :goto_1
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 143
    .line 144
    const-string p2, "\u8bc4\u8bba\u6b63\u6587\u53c2\u6570\u521b\u5efa\u5931\u8d25"

    .line 145
    .line 146
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    throw p1

    .line 150
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 151
    .line 152
    const-string p2, "\u964c\u751f\u4eba\u8bc4\u8bba\u65b9\u6cd5\u672a\u5c31\u7eea"

    .line 153
    .line 154
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    throw p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 158
    :goto_2
    new-instance p2, Lsf/f;

    .line 159
    .line 160
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 161
    .line 162
    .line 163
    move-object p1, p2

    .line 164
    :goto_3
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 165
    .line 166
    .line 167
    move-result-object p2

    .line 168
    if-eqz p2, :cond_7

    .line 169
    .line 170
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object p2

    .line 174
    new-instance v0, Ljava/lang/StringBuilder;

    .line 175
    .line 176
    const-string v1, "\u670b\u53cb\u5708\u8bc4\u8bba\u5f02\u5e38: "

    .line 177
    .line 178
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object p2

    .line 188
    invoke-virtual {p0, p2}, Lp8/d0;->l(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    :cond_7
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 192
    .line 193
    instance-of v0, p1, Lsf/f;

    .line 194
    .line 195
    if-eqz v0, :cond_8

    .line 196
    .line 197
    move-object p1, p2

    .line 198
    :cond_8
    check-cast p1, Ljava/lang/Boolean;

    .line 199
    .line 200
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 201
    .line 202
    .line 203
    move-result p1

    .line 204
    return p1

    .line 205
    :cond_9
    :goto_4
    return v0
.end method

.method public final g()Lp8/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lp8/d0;->k:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-interface {v0}, Lsf/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lp8/h;

    .line 8
    .line 9
    return-object v0
.end method

.method public final h()Lp8/x;
    .locals 1

    .line 1
    iget-object v0, p0, Lp8/d0;->i:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-interface {v0}, Lsf/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lp8/x;

    .line 8
    .line 9
    return-object v0
.end method

.method public final i()Z
    .locals 9

    .line 1
    iget-object v0, p0, Lp8/d0;->j:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-interface {v0}, Lsf/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lp8/e0;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_9

    .line 11
    .line 12
    const-string v2, "\u670b\u53cb\u5708\u5165\u5e93\u89c2\u5bdfHook\u5931\u8d25: "

    .line 13
    .line 14
    monitor-enter v0

    .line 15
    :try_start_0
    iget-object v3, v0, Lp8/e0;->h:Ljava/lang/reflect/Method;

    .line 16
    .line 17
    const/4 v4, 0x1

    .line 18
    const/4 v5, 0x0

    .line 19
    if-eqz v3, :cond_1

    .line 20
    .line 21
    invoke-static {v3}, Lp8/e0;->a(Ljava/lang/reflect/Method;)Z

    .line 22
    .line 23
    .line 24
    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    if-eqz v6, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move-object v3, v5

    .line 29
    :goto_0
    if-eqz v3, :cond_1

    .line 30
    .line 31
    monitor-exit v0

    .line 32
    move v2, v4

    .line 33
    goto/16 :goto_4

    .line 34
    .line 35
    :catchall_0
    move-exception v1

    .line 36
    goto/16 :goto_5

    .line 37
    .line 38
    :cond_1
    :try_start_1
    iget-object v3, v0, Lp8/e0;->a:Landroid/content/Context;

    .line 39
    .line 40
    iget-object v6, v0, Lp8/e0;->b:Ljava/lang/ClassLoader;

    .line 41
    .line 42
    invoke-static {v3, v6}, Le8/b;->g(Landroid/content/Context;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    iget-object v6, v0, Lp8/e0;->e:Landroid/content/SharedPreferences;

    .line 47
    .line 48
    iget-object v7, v0, Lp8/e0;->b:Ljava/lang/ClassLoader;

    .line 49
    .line 50
    const-string v8, "sns_info_replace_by_id_v2"

    .line 51
    .line 52
    invoke-static {v6, v3, v7, v8}, Le8/b;->c(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 53
    .line 54
    .line 55
    move-result-object v6

    .line 56
    if-eqz v6, :cond_3

    .line 57
    .line 58
    invoke-static {v6}, Lp8/e0;->a(Ljava/lang/reflect/Method;)Z

    .line 59
    .line 60
    .line 61
    move-result v7

    .line 62
    if-eqz v7, :cond_2

    .line 63
    .line 64
    move-object v5, v6

    .line 65
    :cond_2
    if-eqz v5, :cond_3

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_3
    invoke-virtual {v0}, Lp8/e0;->b()Ljava/lang/reflect/Method;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    if-eqz v5, :cond_7

    .line 73
    .line 74
    iget-object v6, v0, Lp8/e0;->e:Landroid/content/SharedPreferences;

    .line 75
    .line 76
    const-string v7, "sns_info_replace_by_id_v2"

    .line 77
    .line 78
    invoke-static {v6, v3, v7, v5}, Le8/b;->h(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 79
    .line 80
    .line 81
    :goto_1
    :try_start_2
    sget-object v3, Lr8/i;->b:Lr8/i;

    .line 82
    .line 83
    invoke-static {v5}, Lh/Hchat/utils/KavaReflector;->accessible(Ljava/lang/reflect/Method;)Ljava/lang/reflect/Method;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    if-eqz v6, :cond_4

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_4
    move-object v6, v5

    .line 91
    :goto_2
    new-instance v7, Lb9/e;

    .line 92
    .line 93
    const/16 v8, 0x15

    .line 94
    .line 95
    invoke-direct {v7, v0, v8}, Lb9/e;-><init>(Ljava/lang/Object;I)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v3, v6, v7}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 99
    .line 100
    .line 101
    iput-object v5, v0, Lp8/e0;->h:Ljava/lang/reflect/Method;

    .line 102
    .line 103
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 104
    .line 105
    goto :goto_3

    .line 106
    :catchall_1
    move-exception v3

    .line 107
    :try_start_3
    new-instance v6, Lsf/f;

    .line 108
    .line 109
    invoke-direct {v6, v3}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 110
    .line 111
    .line 112
    move-object v3, v6

    .line 113
    :goto_3
    invoke-static {v3}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 114
    .line 115
    .line 116
    move-result-object v6

    .line 117
    if-eqz v6, :cond_5

    .line 118
    .line 119
    iget-object v7, v0, Lp8/e0;->d:Lp8/p;

    .line 120
    .line 121
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    invoke-virtual {v6}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v6

    .line 129
    new-instance v8, Ljava/lang/StringBuilder;

    .line 130
    .line 131
    invoke-direct {v8, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    const-string v2, " "

    .line 138
    .line 139
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    invoke-virtual {v7, v2}, Lp8/p;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    :cond_5
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 153
    .line 154
    instance-of v5, v3, Lsf/f;

    .line 155
    .line 156
    if-eqz v5, :cond_6

    .line 157
    .line 158
    move-object v3, v2

    .line 159
    :cond_6
    check-cast v3, Ljava/lang/Boolean;

    .line 160
    .line 161
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 162
    .line 163
    .line 164
    move-result v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 165
    monitor-exit v0

    .line 166
    goto :goto_4

    .line 167
    :cond_7
    monitor-exit v0

    .line 168
    move v2, v1

    .line 169
    :goto_4
    if-ne v2, v4, :cond_8

    .line 170
    .line 171
    move v1, v4

    .line 172
    :cond_8
    return v1

    .line 173
    :goto_5
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 174
    throw v1

    .line 175
    :cond_9
    return v1
.end method

.method public final k(Ljava/lang/Object;)Z
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    const/4 v2, 0x0

    .line 7
    if-eqz p1, :cond_6

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    const-string v4, "com.tencent.mm.plugin.sns.storage.SnsInfo"

    .line 18
    .line 19
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-nez v3, :cond_0

    .line 24
    .line 25
    goto :goto_3

    .line 26
    :cond_0
    invoke-virtual {p0}, Lp8/d0;->h()Lp8/x;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    if-eqz v3, :cond_5

    .line 31
    .line 32
    invoke-virtual {v3}, Lp8/x;->g()Ljava/lang/reflect/Method;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    if-eqz v3, :cond_5

    .line 37
    .line 38
    const/4 v2, 0x0

    .line 39
    :try_start_0
    filled-new-array {p1, v1, v2, v1}, [Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-static {v3, v2, p1}, Lh/Hchat/utils/KavaReflector;->invokeOrThrow(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    instance-of v1, p1, Ljava/lang/Boolean;

    .line 48
    .line 49
    if-eqz v1, :cond_1

    .line 50
    .line 51
    move-object v2, p1

    .line 52
    check-cast v2, Ljava/lang/Boolean;

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :catchall_0
    move-exception p1

    .line 56
    goto :goto_1

    .line 57
    :cond_1
    :goto_0
    if-eqz v2, :cond_2

    .line 58
    .line 59
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    :cond_2
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 64
    .line 65
    .line 66
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    goto :goto_2

    .line 68
    :goto_1
    new-instance v0, Lsf/f;

    .line 69
    .line 70
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 71
    .line 72
    .line 73
    move-object p1, v0

    .line 74
    :goto_2
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    if-eqz v0, :cond_3

    .line 79
    .line 80
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    new-instance v1, Ljava/lang/StringBuilder;

    .line 85
    .line 86
    const-string v2, "\u670b\u53cb\u5708\u70b9\u8d5e\u5f02\u5e38: "

    .line 87
    .line 88
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-virtual {p0, v0}, Lp8/d0;->l(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    :cond_3
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 102
    .line 103
    instance-of v1, p1, Lsf/f;

    .line 104
    .line 105
    if-eqz v1, :cond_4

    .line 106
    .line 107
    move-object p1, v0

    .line 108
    :cond_4
    check-cast p1, Ljava/lang/Boolean;

    .line 109
    .line 110
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    return p1

    .line 115
    :cond_5
    const-string p1, "\u670b\u53cb\u5708\u70b9\u8d5e\u5931\u8d25: \u539f\u751f\u65b9\u6cd5\u672a\u5c31\u7eea"

    .line 116
    .line 117
    invoke-virtual {p0, p1}, Lp8/d0;->l(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    :cond_6
    :goto_3
    return v2
.end method

.method public final l(Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "[WeChatSnsApi] "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p1}, Li8/i;->f(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final n(Lha/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lp8/d0;->j:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-interface {v0}, Lsf/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lp8/e0;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, v0, Lp8/e0;->f:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->addIfAbsent(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final o(Lp8/g;)Lh/Hchat/hooks/api/model/WeChatSnsPost;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v1, Lp8/g;->a:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v1, v1, Lp8/g;->b:Landroid/content/ContentValues;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    new-array v4, v3, [Ljava/lang/Object;

    .line 11
    .line 12
    const-string v5, "isAd"

    .line 13
    .line 14
    invoke-static {v2, v5, v4}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 19
    .line 20
    invoke-static {v4, v5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    const/4 v5, 0x0

    .line 25
    if-eqz v4, :cond_0

    .line 26
    .line 27
    goto/16 :goto_10

    .line 28
    .line 29
    :cond_0
    iget-object v4, v0, Lp8/d0;->l:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-interface {v4}, Lsf/c;->getValue()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    check-cast v4, Lp8/o;

    .line 36
    .line 37
    if-eqz v4, :cond_15

    .line 38
    .line 39
    invoke-virtual {v4, v2}, Lp8/o;->u(Ljava/lang/Object;)Lp8/v;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    if-eqz v4, :cond_15

    .line 44
    .line 45
    const-string v6, "snsId"

    .line 46
    .line 47
    invoke-virtual {v1, v6}, Landroid/content/ContentValues;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    if-eqz v6, :cond_1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    const-string v6, "field_snsId"

    .line 55
    .line 56
    invoke-virtual {v1, v6}, Landroid/content/ContentValues;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    if-eqz v6, :cond_15

    .line 61
    .line 62
    :goto_0
    instance-of v7, v6, Ljava/lang/Number;

    .line 63
    .line 64
    if-eqz v7, :cond_2

    .line 65
    .line 66
    check-cast v6, Ljava/lang/Number;

    .line 67
    .line 68
    invoke-virtual {v6}, Ljava/lang/Number;->longValue()J

    .line 69
    .line 70
    .line 71
    move-result-wide v6

    .line 72
    goto :goto_1

    .line 73
    :cond_2
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    invoke-static {v6}, Log/t;->g0(Ljava/lang/String;)Ljava/lang/Long;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    if-eqz v6, :cond_15

    .line 82
    .line 83
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 84
    .line 85
    .line 86
    move-result-wide v6

    .line 87
    :goto_1
    const-wide/16 v8, 0x0

    .line 88
    .line 89
    cmp-long v10, v6, v8

    .line 90
    .line 91
    if-nez v10, :cond_3

    .line 92
    .line 93
    goto/16 :goto_10

    .line 94
    .line 95
    :cond_3
    const-string v10, "userName"

    .line 96
    .line 97
    invoke-virtual {v1, v10}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v10

    .line 101
    if-eqz v10, :cond_4

    .line 102
    .line 103
    :goto_2
    move-object v15, v10

    .line 104
    goto :goto_3

    .line 105
    :cond_4
    const-string v10, "field_userName"

    .line 106
    .line 107
    invoke-virtual {v1, v10}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v10

    .line 111
    if-eqz v10, :cond_15

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :goto_3
    const-string v10, "hchatLocalId"

    .line 115
    .line 116
    invoke-virtual {v1, v10}, Landroid/content/ContentValues;->getAsLong(Ljava/lang/String;)Ljava/lang/Long;

    .line 117
    .line 118
    .line 119
    move-result-object v10

    .line 120
    if-eqz v10, :cond_5

    .line 121
    .line 122
    :goto_4
    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    .line 123
    .line 124
    .line 125
    move-result-wide v10

    .line 126
    :goto_5
    move-wide v13, v10

    .line 127
    goto :goto_9

    .line 128
    :cond_5
    const-string v10, "getLocalid"

    .line 129
    .line 130
    new-array v11, v3, [Ljava/lang/Object;

    .line 131
    .line 132
    invoke-static {v2, v10, v11}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v10

    .line 136
    instance-of v11, v10, Ljava/lang/Number;

    .line 137
    .line 138
    if-eqz v11, :cond_6

    .line 139
    .line 140
    check-cast v10, Ljava/lang/Number;

    .line 141
    .line 142
    goto :goto_6

    .line 143
    :cond_6
    move-object v10, v5

    .line 144
    :goto_6
    if-eqz v10, :cond_7

    .line 145
    .line 146
    invoke-virtual {v10}, Ljava/lang/Number;->longValue()J

    .line 147
    .line 148
    .line 149
    move-result-wide v10

    .line 150
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 151
    .line 152
    .line 153
    move-result-object v10

    .line 154
    goto :goto_7

    .line 155
    :cond_7
    move-object v10, v5

    .line 156
    :goto_7
    if-eqz v10, :cond_8

    .line 157
    .line 158
    goto :goto_4

    .line 159
    :cond_8
    const-string v10, "localid"

    .line 160
    .line 161
    invoke-static {v2, v10}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    instance-of v10, v2, Ljava/lang/Number;

    .line 166
    .line 167
    if-eqz v10, :cond_9

    .line 168
    .line 169
    check-cast v2, Ljava/lang/Number;

    .line 170
    .line 171
    goto :goto_8

    .line 172
    :cond_9
    move-object v2, v5

    .line 173
    :goto_8
    if-eqz v2, :cond_a

    .line 174
    .line 175
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 176
    .line 177
    .line 178
    move-result-wide v10

    .line 179
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 180
    .line 181
    .line 182
    move-result-object v5

    .line 183
    :cond_a
    if-eqz v5, :cond_b

    .line 184
    .line 185
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 186
    .line 187
    .line 188
    move-result-wide v10

    .line 189
    goto :goto_5

    .line 190
    :cond_b
    move-wide v13, v8

    .line 191
    :goto_9
    const-string v2, "createTime"

    .line 192
    .line 193
    invoke-virtual {v1, v2}, Landroid/content/ContentValues;->getAsLong(Ljava/lang/String;)Ljava/lang/Long;

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    if-eqz v2, :cond_d

    .line 198
    .line 199
    :goto_a
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 200
    .line 201
    .line 202
    move-result-wide v8

    .line 203
    :cond_c
    move-wide/from16 v17, v8

    .line 204
    .line 205
    goto :goto_b

    .line 206
    :cond_d
    const-string v2, "field_createTime"

    .line 207
    .line 208
    invoke-virtual {v1, v2}, Landroid/content/ContentValues;->getAsLong(Ljava/lang/String;)Ljava/lang/Long;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    if-eqz v2, :cond_c

    .line 213
    .line 214
    goto :goto_a

    .line 215
    :goto_b
    const-string v2, "type"

    .line 216
    .line 217
    invoke-virtual {v1, v2}, Landroid/content/ContentValues;->getAsInteger(Ljava/lang/String;)Ljava/lang/Integer;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    if-eqz v2, :cond_e

    .line 222
    .line 223
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 224
    .line 225
    .line 226
    move-result v1

    .line 227
    goto :goto_c

    .line 228
    :cond_e
    const-string v2, "field_type"

    .line 229
    .line 230
    invoke-virtual {v1, v2}, Landroid/content/ContentValues;->getAsInteger(Ljava/lang/String;)Ljava/lang/Integer;

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    if-eqz v1, :cond_f

    .line 235
    .line 236
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 237
    .line 238
    .line 239
    move-result v1

    .line 240
    goto :goto_c

    .line 241
    :cond_f
    const/4 v1, -0x1

    .line 242
    :goto_c
    iget-object v2, v0, Lp8/d0;->f:Lg8/a;

    .line 243
    .line 244
    invoke-virtual {v2}, Lg8/a;->c()Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v2

    .line 248
    const-string v5, ""

    .line 249
    .line 250
    if-nez v2, :cond_10

    .line 251
    .line 252
    move-object v2, v5

    .line 253
    :cond_10
    invoke-static {v6, v7}, Ljava/lang/Long;->toUnsignedString(J)Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v12

    .line 257
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 258
    .line 259
    .line 260
    iget-object v6, v0, Lp8/d0;->g:Lg8/i;

    .line 261
    .line 262
    invoke-virtual {v6, v15}, Lg8/i;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v6

    .line 266
    if-nez v6, :cond_11

    .line 267
    .line 268
    goto :goto_d

    .line 269
    :cond_11
    move-object v5, v6

    .line 270
    :goto_d
    invoke-static {v5}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 271
    .line 272
    .line 273
    move-result v6

    .line 274
    if-eqz v6, :cond_12

    .line 275
    .line 276
    move-object/from16 v16, v15

    .line 277
    .line 278
    goto :goto_e

    .line 279
    :cond_12
    move-object/from16 v16, v5

    .line 280
    .line 281
    :goto_e
    iget v5, v4, Lp8/v;->c:I

    .line 282
    .line 283
    invoke-static {v4, v1}, Lp8/d0;->d(Lp8/v;I)Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v21

    .line 287
    iget-object v6, v4, Lp8/v;->b:Ljava/lang/String;

    .line 288
    .line 289
    iget-object v4, v4, Lp8/v;->d:Ljava/util/ArrayList;

    .line 290
    .line 291
    new-instance v7, Ljava/util/ArrayList;

    .line 292
    .line 293
    invoke-static {v4}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 294
    .line 295
    .line 296
    move-result v8

    .line 297
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 301
    .line 302
    .line 303
    move-result-object v4

    .line 304
    :goto_f
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 305
    .line 306
    .line 307
    move-result v8

    .line 308
    if-eqz v8, :cond_13

    .line 309
    .line 310
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v8

    .line 314
    check-cast v8, Lp8/s;

    .line 315
    .line 316
    invoke-static {v8}, Lp8/d0;->m(Lp8/s;)Lh/Hchat/hooks/api/model/WeChatSnsMedia;

    .line 317
    .line 318
    .line 319
    move-result-object v8

    .line 320
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 321
    .line 322
    .line 323
    goto :goto_f

    .line 324
    :cond_13
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 325
    .line 326
    .line 327
    move-result v4

    .line 328
    if-nez v4, :cond_14

    .line 329
    .line 330
    invoke-virtual {v2, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 331
    .line 332
    .line 333
    move-result v2

    .line 334
    if-eqz v2, :cond_14

    .line 335
    .line 336
    const/4 v3, 0x1

    .line 337
    :cond_14
    move/from16 v24, v3

    .line 338
    .line 339
    new-instance v11, Lh/Hchat/hooks/api/model/WeChatSnsPost;

    .line 340
    .line 341
    move/from16 v19, v1

    .line 342
    .line 343
    move/from16 v20, v5

    .line 344
    .line 345
    move-object/from16 v22, v6

    .line 346
    .line 347
    move-object/from16 v23, v7

    .line 348
    .line 349
    invoke-direct/range {v11 .. v24}, Lh/Hchat/hooks/api/model/WeChatSnsPost;-><init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;JIILjava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V

    .line 350
    .line 351
    .line 352
    return-object v11

    .line 353
    :cond_15
    :goto_10
    return-object v5
.end method

.method public final p(Ljava/lang/String;Ljava/util/concurrent/atomic/AtomicBoolean;)Lh/Hchat/hooks/api/model/WeChatSnsPrepareResult;
    .locals 4

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    const-string p1, ""

    .line 7
    .line 8
    :cond_0
    invoke-static {p1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    sget-object p1, Lh/Hchat/hooks/api/model/WeChatSnsPrepareResult;->Companion:Ll8/h;

    .line 23
    .line 24
    const-string p2, ""

    .line 25
    .line 26
    const-string v0, "\u670b\u53cb\u5708 ID \u4e3a\u7a7a"

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-static {p2, v0}, Ll8/h;->a(Ljava/lang/String;Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatSnsPrepareResult;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    :cond_1
    iget-object v0, p0, Lp8/d0;->n:Ljava/util/concurrent/ConcurrentHashMap;

    .line 37
    .line 38
    new-instance v1, Li2/y;

    .line 39
    .line 40
    const/16 v2, 0xa

    .line 41
    .line 42
    invoke-direct {v1, v2}, Li2/y;-><init>(I)V

    .line 43
    .line 44
    .line 45
    new-instance v2, Leb/v;

    .line 46
    .line 47
    const/4 v3, 0x2

    .line 48
    invoke-direct {v2, v3, v1}, Leb/v;-><init>(ILfg/p;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, p1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    check-cast v0, Lp8/c0;

    .line 56
    .line 57
    if-eqz v0, :cond_3

    .line 58
    .line 59
    :try_start_0
    iget-object v1, v0, Lp8/c0;->a:Ljava/lang/Object;

    .line 60
    .line 61
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 62
    :try_start_1
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-eqz v2, :cond_2

    .line 67
    .line 68
    sget-object p2, Lh/Hchat/hooks/api/model/WeChatSnsPrepareResult;->Companion:Ll8/h;

    .line 69
    .line 70
    const-string v2, "\u5df2\u53d6\u6d88\u51c6\u5907\u670b\u53cb\u5708\u5a92\u4f53"

    .line 71
    .line 72
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    invoke-static {p1, v2}, Ll8/h;->a(Ljava/lang/String;Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatSnsPrepareResult;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    goto :goto_0

    .line 80
    :catchall_0
    move-exception p2

    .line 81
    goto :goto_1

    .line 82
    :cond_2
    invoke-virtual {p0, p1, p2}, Lp8/d0;->q(Ljava/lang/String;Ljava/util/concurrent/atomic/AtomicBoolean;)Lh/Hchat/hooks/api/model/WeChatSnsPrepareResult;

    .line 83
    .line 84
    .line 85
    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 86
    :goto_0
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 87
    iget-object v1, p0, Lp8/d0;->n:Ljava/util/concurrent/ConcurrentHashMap;

    .line 88
    .line 89
    new-instance v2, Lb0/t;

    .line 90
    .line 91
    const/16 v3, 0x12

    .line 92
    .line 93
    invoke-direct {v2, v0, v3}, Lb0/t;-><init>(Ljava/lang/Object;I)V

    .line 94
    .line 95
    .line 96
    new-instance v0, Lp8/z;

    .line 97
    .line 98
    const/4 v3, 0x0

    .line 99
    invoke-direct {v0, v2, v3}, Lp8/z;-><init>(Lb0/t;I)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v1, p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    return-object p2

    .line 106
    :catchall_1
    move-exception p2

    .line 107
    goto :goto_2

    .line 108
    :goto_1
    :try_start_3
    monitor-exit v1

    .line 109
    throw p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 110
    :goto_2
    iget-object v1, p0, Lp8/d0;->n:Ljava/util/concurrent/ConcurrentHashMap;

    .line 111
    .line 112
    new-instance v2, Lb0/t;

    .line 113
    .line 114
    const/16 v3, 0x12

    .line 115
    .line 116
    invoke-direct {v2, v0, v3}, Lb0/t;-><init>(Ljava/lang/Object;I)V

    .line 117
    .line 118
    .line 119
    new-instance v0, Lp8/z;

    .line 120
    .line 121
    const/4 v3, 0x1

    .line 122
    invoke-direct {v0, v2, v3}, Lp8/z;-><init>(Lb0/t;I)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v1, p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    throw p2

    .line 129
    :cond_3
    sget-object p2, Lh/Hchat/hooks/api/model/WeChatSnsPrepareResult;->Companion:Ll8/h;

    .line 130
    .line 131
    const-string v0, "\u670b\u53cb\u5708\u5a92\u4f53\u51c6\u5907\u9501\u521b\u5efa\u5931\u8d25"

    .line 132
    .line 133
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    invoke-static {p1, v0}, Ll8/h;->a(Ljava/lang/String;Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatSnsPrepareResult;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    return-object p1
.end method

.method public final q(Ljava/lang/String;Ljava/util/concurrent/atomic/AtomicBoolean;)Lh/Hchat/hooks/api/model/WeChatSnsPrepareResult;
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v5, p1

    .line 4
    .line 5
    invoke-virtual {v1}, Lp8/d0;->g()Lp8/h;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_16

    .line 10
    .line 11
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v5}, Lp8/h;->g(Ljava/lang/String;)Lp8/f;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v0, v0, Lp8/f;->b:Ljava/lang/Object;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-static {v0, v2}, Lp8/h;->j(Ljava/lang/Object;Ljava/lang/Long;)Lp8/g;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    :cond_0
    if-eqz v2, :cond_16

    .line 28
    .line 29
    iget-object v0, v2, Lp8/g;->b:Landroid/content/ContentValues;

    .line 30
    .line 31
    iget-object v2, v2, Lp8/g;->a:Ljava/lang/Object;

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    new-array v3, v3, [Ljava/lang/Object;

    .line 35
    .line 36
    const-string v4, "isAd"

    .line 37
    .line 38
    invoke-static {v2, v4, v3}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 43
    .line 44
    invoke-static {v3, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-eqz v3, :cond_1

    .line 49
    .line 50
    sget-object v0, Lh/Hchat/hooks/api/model/WeChatSnsPrepareResult;->Companion:Ll8/h;

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    const-string v0, "\u4e0d\u652f\u6301\u51c6\u5907\u5e7f\u544a\u670b\u53cb\u5708"

    .line 56
    .line 57
    invoke-static {v5, v0}, Ll8/h;->a(Ljava/lang/String;Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatSnsPrepareResult;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    return-object v0

    .line 62
    :cond_1
    iget-object v3, v1, Lp8/d0;->l:Ljava/lang/Object;

    .line 63
    .line 64
    invoke-interface {v3}, Lsf/c;->getValue()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    check-cast v3, Lp8/o;

    .line 69
    .line 70
    if-eqz v3, :cond_15

    .line 71
    .line 72
    invoke-virtual {v3, v2}, Lp8/o;->u(Ljava/lang/Object;)Lp8/v;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    if-eqz v2, :cond_14

    .line 77
    .line 78
    iget-object v4, v2, Lp8/v;->d:Ljava/util/ArrayList;

    .line 79
    .line 80
    const-string v6, "type"

    .line 81
    .line 82
    invoke-virtual {v0, v6}, Landroid/content/ContentValues;->getAsInteger(Ljava/lang/String;)Ljava/lang/Integer;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    if-eqz v6, :cond_2

    .line 87
    .line 88
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    goto :goto_0

    .line 93
    :cond_2
    const-string v6, "field_type"

    .line 94
    .line 95
    invoke-virtual {v0, v6}, Landroid/content/ContentValues;->getAsInteger(Ljava/lang/String;)Ljava/lang/Integer;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    if-eqz v0, :cond_3

    .line 100
    .line 101
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    goto :goto_0

    .line 106
    :cond_3
    const/4 v0, -0x1

    .line 107
    :goto_0
    invoke-static {v2, v0}, Lp8/d0;->d(Lp8/v;I)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v7

    .line 111
    const-string v0, "card"

    .line 112
    .line 113
    invoke-virtual {v7, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    if-nez v0, :cond_13

    .line 118
    .line 119
    const-string v0, "unknown"

    .line 120
    .line 121
    invoke-virtual {v7, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    if-eqz v0, :cond_4

    .line 126
    .line 127
    goto/16 :goto_d

    .line 128
    .line 129
    :cond_4
    const-string v0, "live_photo"

    .line 130
    .line 131
    invoke-virtual {v7, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v6

    .line 135
    const-string v8, "\u5f53\u524d\u53ea\u652f\u6301\u51c6\u5907\u5355\u5f20\u5b9e\u51b5\u670b\u53cb\u5708"

    .line 136
    .line 137
    const/4 v9, 0x1

    .line 138
    if-eqz v6, :cond_5

    .line 139
    .line 140
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 141
    .line 142
    .line 143
    move-result v6

    .line 144
    if-ne v6, v9, :cond_6

    .line 145
    .line 146
    invoke-static {v4}, Ltf/m;->H1(Ljava/util/List;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v4

    .line 150
    check-cast v4, Lp8/s;

    .line 151
    .line 152
    iget-object v4, v4, Lp8/s;->f:Lp8/s;

    .line 153
    .line 154
    if-nez v4, :cond_5

    .line 155
    .line 156
    goto :goto_1

    .line 157
    :cond_5
    move-object/from16 v4, p2

    .line 158
    .line 159
    goto :goto_2

    .line 160
    :cond_6
    :goto_1
    sget-object v0, Lh/Hchat/hooks/api/model/WeChatSnsPrepareResult;->Companion:Ll8/h;

    .line 161
    .line 162
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    invoke-static {v5, v8}, Ll8/h;->a(Ljava/lang/String;Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatSnsPrepareResult;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    return-object v0

    .line 170
    :goto_2
    :try_start_0
    invoke-virtual {v3, v2, v4}, Lp8/o;->q(Lp8/v;Ljava/util/concurrent/atomic/AtomicBoolean;)Lp8/c;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    iget-object v4, v3, Lp8/c;->c:Ljava/lang/String;

    .line 175
    .line 176
    iget-object v6, v3, Lp8/c;->b:Ljava/util/List;

    .line 177
    .line 178
    new-instance v10, Ljava/util/ArrayList;

    .line 179
    .line 180
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 181
    .line 182
    .line 183
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 184
    .line 185
    .line 186
    move-result-object v11

    .line 187
    :cond_7
    :goto_3
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 188
    .line 189
    .line 190
    move-result v12

    .line 191
    if-eqz v12, :cond_8

    .line 192
    .line 193
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v12

    .line 197
    move-object v13, v12

    .line 198
    check-cast v13, Lp8/d;

    .line 199
    .line 200
    invoke-virtual {v13}, Lp8/d;->a()Z

    .line 201
    .line 202
    .line 203
    move-result v13

    .line 204
    if-eqz v13, :cond_7

    .line 205
    .line 206
    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    goto :goto_3

    .line 210
    :catchall_0
    move-exception v0

    .line 211
    goto/16 :goto_9

    .line 212
    .line 213
    :cond_8
    new-instance v11, Ljava/util/ArrayList;

    .line 214
    .line 215
    invoke-static {v10}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 216
    .line 217
    .line 218
    move-result v12

    .line 219
    invoke-direct {v11, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 223
    .line 224
    .line 225
    move-result-object v10

    .line 226
    :goto_4
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 227
    .line 228
    .line 229
    move-result v12

    .line 230
    if-eqz v12, :cond_9

    .line 231
    .line 232
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v12

    .line 236
    check-cast v12, Lp8/d;

    .line 237
    .line 238
    new-instance v13, Lh/Hchat/hooks/api/model/WeChatSnsLivePhoto;

    .line 239
    .line 240
    iget-object v14, v12, Lp8/d;->a:Ljava/lang/String;

    .line 241
    .line 242
    iget-object v15, v12, Lp8/d;->b:Ljava/lang/String;

    .line 243
    .line 244
    iget v12, v12, Lp8/d;->c:I

    .line 245
    .line 246
    const-wide/16 v17, 0x0

    .line 247
    .line 248
    move/from16 v16, v12

    .line 249
    .line 250
    invoke-direct/range {v13 .. v18}, Lh/Hchat/hooks/api/model/WeChatSnsLivePhoto;-><init>(Ljava/lang/String;Ljava/lang/String;IJ)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    goto :goto_4

    .line 257
    :cond_9
    const-string v10, "image"

    .line 258
    .line 259
    invoke-virtual {v7, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    move-result v10

    .line 263
    if-eqz v10, :cond_b

    .line 264
    .line 265
    invoke-virtual {v3}, Lp8/c;->b()Ljava/util/ArrayList;

    .line 266
    .line 267
    .line 268
    move-result-object v10

    .line 269
    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    .line 270
    .line 271
    .line 272
    move-result v10

    .line 273
    if-nez v10, :cond_a

    .line 274
    .line 275
    goto :goto_5

    .line 276
    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 277
    .line 278
    const-string v2, "\u672a\u627e\u5230\u53ef\u7528\u7684\u670b\u53cb\u5708\u56fe\u7247"

    .line 279
    .line 280
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    throw v0

    .line 284
    :cond_b
    :goto_5
    const-string v10, "video"

    .line 285
    .line 286
    invoke-virtual {v7, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    move-result v10

    .line 290
    if-eqz v10, :cond_d

    .line 291
    .line 292
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 293
    .line 294
    .line 295
    move-result v10

    .line 296
    if-nez v10, :cond_c

    .line 297
    .line 298
    goto :goto_6

    .line 299
    :cond_c
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 300
    .line 301
    const-string v2, "\u672a\u627e\u5230\u53ef\u7528\u7684\u670b\u53cb\u5708\u89c6\u9891"

    .line 302
    .line 303
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    throw v0

    .line 307
    :cond_d
    :goto_6
    invoke-virtual {v7, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 308
    .line 309
    .line 310
    move-result v0

    .line 311
    if-eqz v0, :cond_f

    .line 312
    .line 313
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 314
    .line 315
    .line 316
    move-result v0

    .line 317
    if-ne v0, v9, :cond_e

    .line 318
    .line 319
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 320
    .line 321
    .line 322
    move-result v0

    .line 323
    if-ne v0, v9, :cond_e

    .line 324
    .line 325
    goto :goto_7

    .line 326
    :cond_e
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 327
    .line 328
    invoke-direct {v0, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 329
    .line 330
    .line 331
    throw v0

    .line 332
    :cond_f
    :goto_7
    new-instance v0, Lh/Hchat/hooks/api/model/WeChatSnsPrepareResult;

    .line 333
    .line 334
    move-object v9, v4

    .line 335
    const-string v4, "\u51c6\u5907\u5b8c\u6210"

    .line 336
    .line 337
    iget-object v6, v2, Lp8/v;->b:Ljava/lang/String;

    .line 338
    .line 339
    invoke-virtual {v3}, Lp8/c;->b()Ljava/util/ArrayList;

    .line 340
    .line 341
    .line 342
    move-result-object v8

    .line 343
    iget-object v10, v3, Lp8/c;->d:Ljava/lang/String;

    .line 344
    .line 345
    const/4 v3, 0x1

    .line 346
    move-object v2, v0

    .line 347
    invoke-direct/range {v2 .. v11}, Lh/Hchat/hooks/api/model/WeChatSnsPrepareResult;-><init>(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 348
    .line 349
    .line 350
    :goto_8
    move-object v0, v2

    .line 351
    goto :goto_a

    .line 352
    :goto_9
    new-instance v2, Lsf/f;

    .line 353
    .line 354
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 355
    .line 356
    .line 357
    goto :goto_8

    .line 358
    :goto_a
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 359
    .line 360
    .line 361
    move-result-object v2

    .line 362
    if-eqz v2, :cond_10

    .line 363
    .line 364
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object v2

    .line 368
    new-instance v3, Ljava/lang/StringBuilder;

    .line 369
    .line 370
    const-string v4, "\u51c6\u5907\u670b\u53cb\u5708\u5a92\u4f53\u5931\u8d25: snsId="

    .line 371
    .line 372
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 373
    .line 374
    .line 375
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 376
    .line 377
    .line 378
    const-string v4, " "

    .line 379
    .line 380
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 381
    .line 382
    .line 383
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 384
    .line 385
    .line 386
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object v2

    .line 390
    invoke-virtual {v1, v2}, Lp8/d0;->l(Ljava/lang/String;)V

    .line 391
    .line 392
    .line 393
    :cond_10
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 394
    .line 395
    .line 396
    move-result-object v2

    .line 397
    if-nez v2, :cond_11

    .line 398
    .line 399
    goto :goto_c

    .line 400
    :cond_11
    sget-object v0, Lh/Hchat/hooks/api/model/WeChatSnsPrepareResult;->Companion:Ll8/h;

    .line 401
    .line 402
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 403
    .line 404
    .line 405
    move-result-object v2

    .line 406
    if-eqz v2, :cond_12

    .line 407
    .line 408
    goto :goto_b

    .line 409
    :cond_12
    const-string v2, "\u51c6\u5907\u670b\u53cb\u5708\u5a92\u4f53\u5931\u8d25"

    .line 410
    .line 411
    :goto_b
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 412
    .line 413
    .line 414
    invoke-static {v5, v2}, Ll8/h;->a(Ljava/lang/String;Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatSnsPrepareResult;

    .line 415
    .line 416
    .line 417
    move-result-object v0

    .line 418
    :goto_c
    check-cast v0, Lh/Hchat/hooks/api/model/WeChatSnsPrepareResult;

    .line 419
    .line 420
    return-object v0

    .line 421
    :cond_13
    :goto_d
    sget-object v0, Lh/Hchat/hooks/api/model/WeChatSnsPrepareResult;->Companion:Ll8/h;

    .line 422
    .line 423
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 424
    .line 425
    .line 426
    const-string v0, "\u6682\u4e0d\u652f\u6301\u8f6c\u53d1\u8be5\u670b\u53cb\u5708\u7c7b\u578b"

    .line 427
    .line 428
    invoke-static {v5, v0}, Ll8/h;->a(Ljava/lang/String;Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatSnsPrepareResult;

    .line 429
    .line 430
    .line 431
    move-result-object v0

    .line 432
    return-object v0

    .line 433
    :cond_14
    sget-object v0, Lh/Hchat/hooks/api/model/WeChatSnsPrepareResult;->Companion:Ll8/h;

    .line 434
    .line 435
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 436
    .line 437
    .line 438
    const-string v0, "\u670b\u53cb\u5708\u5185\u5bb9\u89e3\u6790\u5931\u8d25"

    .line 439
    .line 440
    invoke-static {v5, v0}, Ll8/h;->a(Ljava/lang/String;Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatSnsPrepareResult;

    .line 441
    .line 442
    .line 443
    move-result-object v0

    .line 444
    return-object v0

    .line 445
    :cond_15
    sget-object v0, Lh/Hchat/hooks/api/model/WeChatSnsPrepareResult;->Companion:Ll8/h;

    .line 446
    .line 447
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 448
    .line 449
    .line 450
    const-string v0, "\u670b\u53cb\u5708\u5a92\u4f53\u89e3\u6790\u5668\u672a\u5c31\u7eea"

    .line 451
    .line 452
    invoke-static {v5, v0}, Ll8/h;->a(Ljava/lang/String;Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatSnsPrepareResult;

    .line 453
    .line 454
    .line 455
    move-result-object v0

    .line 456
    return-object v0

    .line 457
    :cond_16
    sget-object v0, Lh/Hchat/hooks/api/model/WeChatSnsPrepareResult;->Companion:Ll8/h;

    .line 458
    .line 459
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 460
    .line 461
    .line 462
    const-string v0, "\u672a\u627e\u5230\u672c\u673a\u7f13\u5b58\u7684\u670b\u53cb\u5708"

    .line 463
    .line 464
    invoke-static {v5, v0}, Ll8/h;->a(Ljava/lang/String;Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatSnsPrepareResult;

    .line 465
    .line 466
    .line 467
    move-result-object v0

    .line 468
    return-object v0
.end method

.method public final r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Z
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p3

    .line 4
    .line 5
    move-object/from16 v3, p5

    .line 6
    .line 7
    const/4 v4, 0x0

    .line 8
    if-eqz p2, :cond_0

    .line 9
    .line 10
    invoke-static/range {p2 .. p2}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object v0, v4

    .line 20
    :goto_0
    const-string v5, ""

    .line 21
    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    move-object v0, v5

    .line 25
    :cond_1
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    if-nez v6, :cond_2

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_2
    move-object v0, v4

    .line 33
    :goto_1
    const/4 v6, 0x0

    .line 34
    if-eqz v0, :cond_3

    .line 35
    .line 36
    invoke-static {v0}, Leh/a;->y(Ljava/lang/String;)Z

    .line 37
    .line 38
    .line 39
    move-result v7

    .line 40
    if-nez v7, :cond_3

    .line 41
    .line 42
    const-string v2, "\u670b\u53cb\u5708\u89c6\u9891\u4e0d\u5b58\u5728: "

    .line 43
    .line 44
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v1, v0}, Lp8/d0;->l(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return v6

    .line 52
    :cond_3
    new-instance v7, Ljava/util/ArrayList;

    .line 53
    .line 54
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-interface/range {p4 .. p4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object v8

    .line 61
    :cond_4
    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v9

    .line 65
    const/4 v10, 0x1

    .line 66
    if-eqz v9, :cond_7

    .line 67
    .line 68
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v9

    .line 72
    move-object v11, v9

    .line 73
    check-cast v11, Ljava/lang/String;

    .line 74
    .line 75
    invoke-static {v11}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 76
    .line 77
    .line 78
    move-result v12

    .line 79
    if-nez v12, :cond_5

    .line 80
    .line 81
    invoke-static {v11}, Leh/a;->y(Ljava/lang/String;)Z

    .line 82
    .line 83
    .line 84
    move-result v12

    .line 85
    if-eqz v12, :cond_5

    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_5
    move v10, v6

    .line 89
    :goto_3
    if-nez v10, :cond_6

    .line 90
    .line 91
    invoke-static {v11}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 92
    .line 93
    .line 94
    move-result v12

    .line 95
    if-nez v12, :cond_6

    .line 96
    .line 97
    const-string v12, "\u670b\u53cb\u5708\u56fe\u7247\u4e0d\u5b58\u5728: "

    .line 98
    .line 99
    invoke-virtual {v12, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v11

    .line 103
    invoke-virtual {v1, v11}, Lp8/d0;->l(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    :cond_6
    if-eqz v10, :cond_4

    .line 107
    .line 108
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_7
    if-eqz v0, :cond_8

    .line 113
    .line 114
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 115
    .line 116
    .line 117
    move-result v8

    .line 118
    if-nez v8, :cond_8

    .line 119
    .line 120
    const-string v0, "\u670b\u53cb\u5708\u53d1\u5e03\u5931\u8d25: \u89c6\u9891\u548c\u56fe\u7247\u4e0d\u80fd\u540c\u65f6\u4e0a\u4f20"

    .line 121
    .line 122
    invoke-virtual {v1, v0}, Lp8/d0;->l(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    return v6

    .line 126
    :cond_8
    const-string v8, "null"

    .line 127
    .line 128
    iget-object v9, v1, Lp8/d0;->b:Lh/Hchat/dexkit/DexFinder;

    .line 129
    .line 130
    if-nez v0, :cond_1e

    .line 131
    .line 132
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 133
    .line 134
    .line 135
    move-result v11

    .line 136
    if-eqz v11, :cond_1e

    .line 137
    .line 138
    if-nez p1, :cond_9

    .line 139
    .line 140
    move-object v7, v5

    .line 141
    goto :goto_4

    .line 142
    :cond_9
    move-object/from16 v7, p1

    .line 143
    .line 144
    :goto_4
    const-string v10, "\u670b\u53cb\u5708\u7eaf\u6587\u5b57\u53d1\u5e03\u5931\u8d25: commit\u8fd4\u56de="

    .line 145
    .line 146
    iget-object v0, v9, Lh/Hchat/dexkit/DexFinder;->snsUploadManagerGetterMethod:Ljava/lang/reflect/Method;

    .line 147
    .line 148
    new-array v11, v6, [Ljava/lang/Object;

    .line 149
    .line 150
    invoke-static {v0, v4, v11}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v11

    .line 154
    if-eqz v11, :cond_1d

    .line 155
    .line 156
    iget-object v12, v9, Lh/Hchat/dexkit/DexFinder;->snsShareAppMsgMethod:Ljava/lang/reflect/Method;

    .line 157
    .line 158
    if-nez v12, :cond_a

    .line 159
    .line 160
    const-string v0, "\u670b\u53cb\u5708\u7eaf\u6587\u5b57\u53d1\u5e03\u5931\u8d25: shareAppMsg\u65b9\u6cd5\u4e3a\u7a7a"

    .line 161
    .line 162
    invoke-virtual {v1, v0}, Lp8/d0;->l(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    return v6

    .line 166
    :cond_a
    :try_start_0
    invoke-virtual {v12}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    invoke-static {v0}, Ltf/l;->z0([Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    check-cast v0, Ljava/lang/Class;

    .line 178
    .line 179
    if-eqz v0, :cond_10

    .line 180
    .line 181
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 182
    .line 183
    .line 184
    move-result-object v13

    .line 185
    const-string v14, "com.tencent.mm.opensdk.modelmsg.WXTextObject"

    .line 186
    .line 187
    invoke-static {v14, v13}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    move-result-object v13

    .line 191
    if-eqz v13, :cond_10

    .line 192
    .line 193
    new-array v14, v6, [Ljava/lang/Class;

    .line 194
    .line 195
    invoke-static {v13, v14}, Lh/Hchat/utils/KavaReflector;->findConstructor(Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 196
    .line 197
    .line 198
    move-result-object v14

    .line 199
    new-array v15, v6, [Ljava/lang/Object;

    .line 200
    .line 201
    invoke-static {v14, v15}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v14

    .line 205
    if-eqz v14, :cond_b

    .line 206
    .line 207
    goto :goto_5

    .line 208
    :cond_b
    new-array v14, v6, [Ljava/lang/Object;

    .line 209
    .line 210
    invoke-static {v13, v14}, Lh/Hchat/utils/KavaReflector;->newInstanceByArgs(Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v14

    .line 214
    :goto_5
    if-nez v14, :cond_c

    .line 215
    .line 216
    goto :goto_9

    .line 217
    :cond_c
    const-string v15, "text"

    .line 218
    .line 219
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    move-result-object v4

    .line 223
    invoke-static {v4, v15}, Lh/Hchat/utils/KavaReflector;->findFieldRecursive(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 224
    .line 225
    .line 226
    move-result-object v4

    .line 227
    if-eqz v4, :cond_d

    .line 228
    .line 229
    invoke-static {v4, v14, v7}, Lh/Hchat/utils/KavaReflector;->writeField(Ljava/lang/reflect/Field;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    :cond_d
    filled-new-array {v13}, [Ljava/lang/Class;

    .line 233
    .line 234
    .line 235
    move-result-object v4

    .line 236
    invoke-static {v0, v4}, Lh/Hchat/utils/KavaReflector;->findConstructor(Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 237
    .line 238
    .line 239
    move-result-object v4

    .line 240
    filled-new-array {v14}, [Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v13

    .line 244
    invoke-static {v4, v13}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v4

    .line 248
    if-eqz v4, :cond_e

    .line 249
    .line 250
    goto :goto_6

    .line 251
    :cond_e
    new-array v4, v6, [Ljava/lang/Class;

    .line 252
    .line 253
    invoke-static {v0, v4}, Lh/Hchat/utils/KavaReflector;->findConstructor(Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 254
    .line 255
    .line 256
    move-result-object v4

    .line 257
    new-array v13, v6, [Ljava/lang/Object;

    .line 258
    .line 259
    invoke-static {v4, v13}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v4

    .line 263
    if-eqz v4, :cond_f

    .line 264
    .line 265
    goto :goto_6

    .line 266
    :cond_f
    new-array v4, v6, [Ljava/lang/Object;

    .line 267
    .line 268
    invoke-static {v0, v4}, Lh/Hchat/utils/KavaReflector;->newInstanceByArgs(Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v4

    .line 272
    :goto_6
    if-nez v4, :cond_11

    .line 273
    .line 274
    :cond_10
    :goto_7
    const/4 v4, 0x0

    .line 275
    goto :goto_9

    .line 276
    :cond_11
    const-string v0, "mediaObject"

    .line 277
    .line 278
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 279
    .line 280
    .line 281
    move-result-object v13

    .line 282
    invoke-static {v13, v0}, Lh/Hchat/utils/KavaReflector;->findFieldRecursive(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    if-eqz v0, :cond_12

    .line 287
    .line 288
    invoke-static {v0, v4, v14}, Lh/Hchat/utils/KavaReflector;->writeField(Ljava/lang/reflect/Field;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 289
    .line 290
    .line 291
    :cond_12
    const-string v0, "description"

    .line 292
    .line 293
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 294
    .line 295
    .line 296
    move-result-object v13

    .line 297
    invoke-static {v13, v0}, Lh/Hchat/utils/KavaReflector;->findFieldRecursive(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    if-eqz v0, :cond_13

    .line 302
    .line 303
    invoke-static {v0, v4, v7}, Lh/Hchat/utils/KavaReflector;->writeField(Ljava/lang/reflect/Field;Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 304
    .line 305
    .line 306
    goto :goto_8

    .line 307
    :catchall_0
    move-exception v0

    .line 308
    new-instance v4, Lsf/f;

    .line 309
    .line 310
    invoke-direct {v4, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 311
    .line 312
    .line 313
    :cond_13
    :goto_8
    instance-of v0, v4, Lsf/f;

    .line 314
    .line 315
    if-eqz v0, :cond_14

    .line 316
    .line 317
    goto :goto_7

    .line 318
    :cond_14
    :goto_9
    if-eqz v4, :cond_1c

    .line 319
    .line 320
    if-nez v2, :cond_15

    .line 321
    .line 322
    move-object v2, v5

    .line 323
    :cond_15
    if-nez v3, :cond_16

    .line 324
    .line 325
    move-object v3, v5

    .line 326
    :cond_16
    :try_start_1
    filled-new-array {v4, v7, v2, v3}, [Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    invoke-static {v12, v11, v0}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    if-eqz v0, :cond_1b

    .line 335
    .line 336
    iget-object v2, v9, Lh/Hchat/dexkit/DexFinder;->snsCommitMethod:Ljava/lang/reflect/Method;

    .line 337
    .line 338
    new-array v3, v6, [Ljava/lang/Object;

    .line 339
    .line 340
    invoke-static {v2, v0, v3}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v0

    .line 344
    instance-of v2, v0, Ljava/lang/Number;

    .line 345
    .line 346
    if-eqz v2, :cond_17

    .line 347
    .line 348
    move-object v4, v0

    .line 349
    check-cast v4, Ljava/lang/Number;

    .line 350
    .line 351
    goto :goto_a

    .line 352
    :catchall_1
    move-exception v0

    .line 353
    goto :goto_c

    .line 354
    :cond_17
    const/4 v4, 0x0

    .line 355
    :goto_a
    if-eqz v4, :cond_18

    .line 356
    .line 357
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 358
    .line 359
    .line 360
    move-result v0

    .line 361
    goto :goto_b

    .line 362
    :cond_18
    move v0, v6

    .line 363
    :goto_b
    if-gtz v0, :cond_1a

    .line 364
    .line 365
    if-eqz v4, :cond_19

    .line 366
    .line 367
    move-object v8, v4

    .line 368
    :cond_19
    new-instance v0, Ljava/lang/StringBuilder;

    .line 369
    .line 370
    invoke-direct {v0, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 371
    .line 372
    .line 373
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 374
    .line 375
    .line 376
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 377
    .line 378
    .line 379
    move-result-object v0

    .line 380
    invoke-virtual {v1, v0}, Lp8/d0;->l(Ljava/lang/String;)V

    .line 381
    .line 382
    .line 383
    goto :goto_d

    .line 384
    :cond_1a
    invoke-virtual {v1}, Lp8/d0;->t()Z

    .line 385
    .line 386
    .line 387
    move-result v6

    .line 388
    goto :goto_d

    .line 389
    :cond_1b
    const-string v0, "\u670b\u53cb\u5708\u7eaf\u6587\u5b57\u53d1\u5e03\u5931\u8d25: native helper\u4e3a\u7a7a"

    .line 390
    .line 391
    invoke-virtual {v1, v0}, Lp8/d0;->l(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 392
    .line 393
    .line 394
    goto :goto_d

    .line 395
    :goto_c
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object v0

    .line 399
    new-instance v2, Ljava/lang/StringBuilder;

    .line 400
    .line 401
    const-string v3, "\u670b\u53cb\u5708\u7eaf\u6587\u5b57\u53d1\u5e03\u5f02\u5e38: "

    .line 402
    .line 403
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 404
    .line 405
    .line 406
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 407
    .line 408
    .line 409
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object v0

    .line 413
    invoke-virtual {v1, v0}, Lp8/d0;->l(Ljava/lang/String;)V

    .line 414
    .line 415
    .line 416
    goto :goto_d

    .line 417
    :cond_1c
    const-string v0, "\u670b\u53cb\u5708\u7eaf\u6587\u5b57\u53d1\u5e03\u5931\u8d25: WXTextObject\u521b\u5efa\u5931\u8d25"

    .line 418
    .line 419
    invoke-virtual {v1, v0}, Lp8/d0;->l(Ljava/lang/String;)V

    .line 420
    .line 421
    .line 422
    :goto_d
    return v6

    .line 423
    :cond_1d
    const-string v0, "\u670b\u53cb\u5708\u7eaf\u6587\u5b57\u53d1\u5e03\u5931\u8d25: manager\u4e3a\u7a7a"

    .line 424
    .line 425
    invoke-virtual {v1, v0}, Lp8/d0;->l(Ljava/lang/String;)V

    .line 426
    .line 427
    .line 428
    return v6

    .line 429
    :cond_1e
    iget-object v4, v9, Lh/Hchat/dexkit/DexFinder;->snsUploadPackHelperClass:Ljava/lang/Class;

    .line 430
    .line 431
    if-nez v4, :cond_1f

    .line 432
    .line 433
    const-string v0, "\u670b\u53cb\u5708\u53d1\u5e03\u5931\u8d25: helper\u672a\u5c31\u7eea"

    .line 434
    .line 435
    invoke-virtual {v1, v0}, Lp8/d0;->l(Ljava/lang/String;)V

    .line 436
    .line 437
    .line 438
    return v6

    .line 439
    :cond_1f
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 440
    .line 441
    .line 442
    move-result-object v11

    .line 443
    iget-object v12, v1, Lp8/d0;->a:Landroid/content/Context;

    .line 444
    .line 445
    filled-new-array {v11, v12}, [Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    move-result-object v11

    .line 449
    invoke-static {v4, v11}, Lh/Hchat/utils/KavaReflector;->newInstanceByArgs(Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 450
    .line 451
    .line 452
    move-result-object v4

    .line 453
    if-nez v4, :cond_20

    .line 454
    .line 455
    const-string v0, "\u670b\u53cb\u5708\u53d1\u5e03\u5931\u8d25: \u521b\u5efaUploadPackHelper\u5931\u8d25"

    .line 456
    .line 457
    invoke-virtual {v1, v0}, Lp8/d0;->l(Ljava/lang/String;)V

    .line 458
    .line 459
    .line 460
    return v6

    .line 461
    :cond_20
    :try_start_2
    iget-object v11, v9, Lh/Hchat/dexkit/DexFinder;->snsSetContentMethod:Ljava/lang/reflect/Method;

    .line 462
    .line 463
    if-nez p1, :cond_21

    .line 464
    .line 465
    move-object v12, v5

    .line 466
    goto :goto_e

    .line 467
    :cond_21
    move-object/from16 v12, p1

    .line 468
    .line 469
    :goto_e
    invoke-static {v4, v12, v11}, Lp8/d0;->j(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 470
    .line 471
    .line 472
    if-eqz v2, :cond_23

    .line 473
    .line 474
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 475
    .line 476
    .line 477
    move-result v11

    .line 478
    if-eqz v11, :cond_22

    .line 479
    .line 480
    goto :goto_f

    .line 481
    :cond_22
    move v11, v6

    .line 482
    goto :goto_10

    .line 483
    :catchall_2
    move-exception v0

    .line 484
    goto/16 :goto_19

    .line 485
    .line 486
    :cond_23
    :goto_f
    move v11, v10

    .line 487
    :goto_10
    if-nez v11, :cond_24

    .line 488
    .line 489
    iget-object v11, v9, Lh/Hchat/dexkit/DexFinder;->snsSetSdkIdMethod:Ljava/lang/reflect/Method;

    .line 490
    .line 491
    invoke-static {v4, v2, v11}, Lp8/d0;->j(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 492
    .line 493
    .line 494
    :cond_24
    if-eqz v3, :cond_26

    .line 495
    .line 496
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 497
    .line 498
    .line 499
    move-result v2

    .line 500
    if-eqz v2, :cond_25

    .line 501
    .line 502
    goto :goto_11

    .line 503
    :cond_25
    move v2, v6

    .line 504
    goto :goto_12

    .line 505
    :cond_26
    :goto_11
    move v2, v10

    .line 506
    :goto_12
    if-nez v2, :cond_27

    .line 507
    .line 508
    iget-object v2, v9, Lh/Hchat/dexkit/DexFinder;->snsSetSdkAppNameMethod:Ljava/lang/reflect/Method;

    .line 509
    .line 510
    invoke-static {v4, v3, v2}, Lp8/d0;->j(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 511
    .line 512
    .line 513
    :cond_27
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 514
    .line 515
    .line 516
    move-result-object v2

    .line 517
    :cond_28
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 518
    .line 519
    .line 520
    move-result v3

    .line 521
    if-eqz v3, :cond_2a

    .line 522
    .line 523
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 524
    .line 525
    .line 526
    move-result-object v3

    .line 527
    check-cast v3, Ljava/lang/String;

    .line 528
    .line 529
    iget-object v7, v9, Lh/Hchat/dexkit/DexFinder;->snsAddImageMethod:Ljava/lang/reflect/Method;

    .line 530
    .line 531
    filled-new-array {v3, v5}, [Ljava/lang/Object;

    .line 532
    .line 533
    .line 534
    move-result-object v11

    .line 535
    invoke-static {v7, v4, v11}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 536
    .line 537
    .line 538
    move-result-object v7

    .line 539
    instance-of v11, v7, Ljava/lang/Boolean;

    .line 540
    .line 541
    if-eqz v11, :cond_29

    .line 542
    .line 543
    check-cast v7, Ljava/lang/Boolean;

    .line 544
    .line 545
    goto :goto_13

    .line 546
    :cond_29
    const/4 v7, 0x0

    .line 547
    :goto_13
    sget-object v11, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 548
    .line 549
    invoke-static {v7, v11}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 550
    .line 551
    .line 552
    move-result v7

    .line 553
    if-nez v7, :cond_28

    .line 554
    .line 555
    new-instance v0, Ljava/lang/StringBuilder;

    .line 556
    .line 557
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 558
    .line 559
    .line 560
    const-string v2, "\u670b\u53cb\u5708\u56fe\u7247\u6dfb\u52a0\u5931\u8d25: "

    .line 561
    .line 562
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 563
    .line 564
    .line 565
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 566
    .line 567
    .line 568
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 569
    .line 570
    .line 571
    move-result-object v0

    .line 572
    invoke-virtual {v1, v0}, Lp8/d0;->l(Ljava/lang/String;)V

    .line 573
    .line 574
    .line 575
    return v6

    .line 576
    :cond_2a
    if-eqz v0, :cond_31

    .line 577
    .line 578
    iget-object v2, v9, Lh/Hchat/dexkit/DexFinder;->snsAddVideoMethod:Ljava/lang/reflect/Method;

    .line 579
    .line 580
    if-nez v2, :cond_2b

    .line 581
    .line 582
    const-string v0, "\u670b\u53cb\u5708\u89c6\u9891\u53d1\u5e03\u5931\u8d25: \u89c6\u9891\u65b9\u6cd5\u672a\u5c31\u7eea"

    .line 583
    .line 584
    invoke-virtual {v1, v0}, Lp8/d0;->l(Ljava/lang/String;)V

    .line 585
    .line 586
    .line 587
    return v6

    .line 588
    :cond_2b
    invoke-virtual {v1, v0}, Lp8/d0;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 589
    .line 590
    .line 591
    move-result-object v3

    .line 592
    if-eqz v3, :cond_2d

    .line 593
    .line 594
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 595
    .line 596
    .line 597
    move-result v7

    .line 598
    if-eqz v7, :cond_2c

    .line 599
    .line 600
    goto :goto_14

    .line 601
    :cond_2c
    move v10, v6

    .line 602
    :cond_2d
    :goto_14
    if-eqz v10, :cond_2e

    .line 603
    .line 604
    const-string v0, "\u670b\u53cb\u5708\u89c6\u9891\u53d1\u5e03\u5931\u8d25: \u7f29\u7565\u56fe\u751f\u6210\u5931\u8d25"

    .line 605
    .line 606
    invoke-virtual {v1, v0}, Lp8/d0;->l(Ljava/lang/String;)V

    .line 607
    .line 608
    .line 609
    return v6

    .line 610
    :cond_2e
    if-nez p1, :cond_2f

    .line 611
    .line 612
    goto :goto_15

    .line 613
    :cond_2f
    move-object/from16 v5, p1

    .line 614
    .line 615
    :goto_15
    invoke-static {v0}, Lp8/d0;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 616
    .line 617
    .line 618
    move-result-object v7

    .line 619
    filled-new-array {v0, v3, v5, v7}, [Ljava/lang/Object;

    .line 620
    .line 621
    .line 622
    move-result-object v3

    .line 623
    invoke-static {v2, v4, v3}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 624
    .line 625
    .line 626
    move-result-object v2

    .line 627
    instance-of v3, v2, Ljava/lang/Boolean;

    .line 628
    .line 629
    if-eqz v3, :cond_30

    .line 630
    .line 631
    check-cast v2, Ljava/lang/Boolean;

    .line 632
    .line 633
    goto :goto_16

    .line 634
    :cond_30
    const/4 v2, 0x0

    .line 635
    :goto_16
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 636
    .line 637
    invoke-static {v2, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 638
    .line 639
    .line 640
    move-result v2

    .line 641
    if-nez v2, :cond_31

    .line 642
    .line 643
    new-instance v2, Ljava/lang/StringBuilder;

    .line 644
    .line 645
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 646
    .line 647
    .line 648
    const-string v3, "\u670b\u53cb\u5708\u89c6\u9891\u6dfb\u52a0\u5931\u8d25: "

    .line 649
    .line 650
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 651
    .line 652
    .line 653
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 654
    .line 655
    .line 656
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 657
    .line 658
    .line 659
    move-result-object v0

    .line 660
    invoke-virtual {v1, v0}, Lp8/d0;->l(Ljava/lang/String;)V

    .line 661
    .line 662
    .line 663
    return v6

    .line 664
    :cond_31
    iget-object v0, v9, Lh/Hchat/dexkit/DexFinder;->snsCommitMethod:Ljava/lang/reflect/Method;

    .line 665
    .line 666
    new-array v2, v6, [Ljava/lang/Object;

    .line 667
    .line 668
    invoke-static {v0, v4, v2}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 669
    .line 670
    .line 671
    move-result-object v0

    .line 672
    instance-of v2, v0, Ljava/lang/Number;

    .line 673
    .line 674
    if-eqz v2, :cond_32

    .line 675
    .line 676
    move-object v4, v0

    .line 677
    check-cast v4, Ljava/lang/Number;

    .line 678
    .line 679
    goto :goto_17

    .line 680
    :cond_32
    const/4 v4, 0x0

    .line 681
    :goto_17
    if-eqz v4, :cond_33

    .line 682
    .line 683
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 684
    .line 685
    .line 686
    move-result v0

    .line 687
    goto :goto_18

    .line 688
    :cond_33
    move v0, v6

    .line 689
    :goto_18
    if-gtz v0, :cond_35

    .line 690
    .line 691
    if-eqz v4, :cond_34

    .line 692
    .line 693
    move-object v8, v4

    .line 694
    :cond_34
    new-instance v0, Ljava/lang/StringBuilder;

    .line 695
    .line 696
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 697
    .line 698
    .line 699
    const-string v2, "\u670b\u53cb\u5708\u53d1\u5e03\u5931\u8d25: commit\u8fd4\u56de="

    .line 700
    .line 701
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 702
    .line 703
    .line 704
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 705
    .line 706
    .line 707
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 708
    .line 709
    .line 710
    move-result-object v0

    .line 711
    invoke-virtual {v1, v0}, Lp8/d0;->l(Ljava/lang/String;)V

    .line 712
    .line 713
    .line 714
    return v6

    .line 715
    :cond_35
    invoke-virtual {v1}, Lp8/d0;->t()Z

    .line 716
    .line 717
    .line 718
    move-result v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 719
    return v0

    .line 720
    :goto_19
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 721
    .line 722
    .line 723
    move-result-object v0

    .line 724
    new-instance v2, Ljava/lang/StringBuilder;

    .line 725
    .line 726
    const-string v3, "\u670b\u53cb\u5708\u53d1\u5e03\u5f02\u5e38: "

    .line 727
    .line 728
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 729
    .line 730
    .line 731
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 732
    .line 733
    .line 734
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 735
    .line 736
    .line 737
    move-result-object v0

    .line 738
    invoke-virtual {v1, v0}, Lp8/d0;->l(Ljava/lang/String;)V

    .line 739
    .line 740
    .line 741
    return v6
.end method

.method public final s()Z
    .locals 4

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p0}, Lp8/d0;->h()Lp8/x;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v1, :cond_3

    .line 13
    .line 14
    invoke-virtual {v1}, Lp8/x;->h()Ljava/lang/reflect/Constructor;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    if-eqz v1, :cond_3

    .line 19
    .line 20
    :try_start_0
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    filled-new-array {v0, v0, v3}, [Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {v1, v0}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    iget-object v1, p0, Lp8/d0;->e:Lm8/a;

    .line 35
    .line 36
    iget-object v1, v1, Lm8/a;->a:Lm8/c;

    .line 37
    .line 38
    invoke-virtual {v1, v0}, Lm8/c;->j(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    const/4 v1, 0x1

    .line 43
    if-ne v0, v1, :cond_0

    .line 44
    .line 45
    move v2, v1

    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception v0

    .line 48
    goto :goto_1

    .line 49
    :cond_0
    :goto_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 50
    .line 51
    .line 52
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    goto :goto_2

    .line 54
    :goto_1
    new-instance v1, Lsf/f;

    .line 55
    .line 56
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 57
    .line 58
    .line 59
    move-object v0, v1

    .line 60
    :goto_2
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    if-eqz v1, :cond_1

    .line 65
    .line 66
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    new-instance v2, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    const-string v3, "\u670b\u53cb\u5708\u5237\u65b0\u5f02\u5e38: "

    .line 73
    .line 74
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-virtual {p0, v1}, Lp8/d0;->l(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    :cond_1
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 88
    .line 89
    instance-of v2, v0, Lsf/f;

    .line 90
    .line 91
    if-eqz v2, :cond_2

    .line 92
    .line 93
    move-object v0, v1

    .line 94
    :cond_2
    check-cast v0, Ljava/lang/Boolean;

    .line 95
    .line 96
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    return v0

    .line 101
    :cond_3
    const-string v0, "\u670b\u53cb\u5708\u5237\u65b0\u5931\u8d25: \u539f\u751f\u8bf7\u6c42\u672a\u5c31\u7eea"

    .line 102
    .line 103
    invoke-virtual {p0, v0}, Lp8/d0;->l(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    return v2
.end method

.method public final t()Z
    .locals 5

    .line 1
    iget-object v0, p0, Lp8/d0;->b:Lh/Hchat/dexkit/DexFinder;

    .line 2
    .line 3
    iget-object v1, v0, Lh/Hchat/dexkit/DexFinder;->snsUploadManagerGetterMethod:Ljava/lang/reflect/Method;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    new-array v3, v2, [Ljava/lang/Object;

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    invoke-static {v1, v4, v3}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    iget-object v0, v0, Lh/Hchat/dexkit/DexFinder;->snsUploadCheckMethod:Ljava/lang/reflect/Method;

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    const-string v0, "\u670b\u53cb\u5708\u4e0a\u4f20\u89e6\u53d1\u5931\u8d25: checkPost\u65b9\u6cd5\u4e3a\u7a7a"

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lp8/d0;->l(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return v2

    .line 25
    :cond_0
    new-array v2, v2, [Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {v0, v1, v2}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    const/4 v0, 0x1

    .line 31
    return v0

    .line 32
    :cond_1
    const-string v0, "\u670b\u53cb\u5708\u4e0a\u4f20\u89e6\u53d1\u5931\u8d25: manager\u4e3a\u7a7a"

    .line 33
    .line 34
    invoke-virtual {p0, v0}, Lp8/d0;->l(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return v2
.end method

.method public final u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 6

    .line 1
    sget-object v4, Ltf/t;->g:Ltf/t;

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    move-object v0, p0

    .line 5
    move-object v1, p1

    .line 6
    move-object v3, p2

    .line 7
    move-object v5, p3

    .line 8
    invoke-virtual/range {v0 .. v5}, Lp8/d0;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1
.end method

.method public final v(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 26

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    if-nez p4, :cond_0

    .line 4
    .line 5
    const-string v0, ""

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move-object/from16 v0, p4

    .line 9
    .line 10
    :goto_0
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-nez p5, :cond_1

    .line 19
    .line 20
    const-string v4, ""

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move-object/from16 v4, p5

    .line 24
    .line 25
    :goto_1
    invoke-static {v4}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    const/4 v6, 0x6

    .line 38
    const/4 v8, 0x1

    .line 39
    if-nez v5, :cond_2

    .line 40
    .line 41
    new-instance v5, Lp8/e;

    .line 42
    .line 43
    invoke-direct {v5, v0, v4}, Lp8/e;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    move/from16 v23, v6

    .line 47
    .line 48
    const/16 p5, 0x2

    .line 49
    .line 50
    :goto_2
    const-wide/16 v20, 0x0

    .line 51
    .line 52
    goto/16 :goto_1a

    .line 53
    .line 54
    :cond_2
    iget-object v4, v1, Lp8/d0;->a:Landroid/content/Context;

    .line 55
    .line 56
    new-instance v13, Ljava/io/File;

    .line 57
    .line 58
    invoke-direct {v13, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v13}, Ljava/io/File;->isFile()Z

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    if-nez v5, :cond_3

    .line 66
    .line 67
    new-instance v4, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    const-string v5, "\u670b\u53cb\u5708\u5b9e\u51b5\u53d1\u5e03\u5931\u8d25: \u5b9e\u51b5\u56fe\u7247\u4e0d\u5b58\u5728 "

    .line 70
    .line 71
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-virtual {v1, v0}, Lp8/d0;->l(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    move/from16 v23, v6

    .line 85
    .line 86
    const/16 p5, 0x2

    .line 87
    .line 88
    const/4 v5, 0x0

    .line 89
    goto :goto_2

    .line 90
    :cond_3
    sget-object v5, Lp8/b;->a:Lp8/b;

    .line 91
    .line 92
    invoke-virtual {v4}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    monitor-enter v5

    .line 100
    :try_start_0
    invoke-virtual {v13}, Ljava/io/File;->isFile()Z

    .line 101
    .line 102
    .line 103
    move-result v14

    .line 104
    if-eqz v14, :cond_4

    .line 105
    .line 106
    invoke-virtual {v13}, Ljava/io/File;->length()J

    .line 107
    .line 108
    .line 109
    move-result-wide v14

    .line 110
    const-wide/16 v16, 0x10

    .line 111
    .line 112
    cmp-long v14, v14, v16

    .line 113
    .line 114
    if-gez v14, :cond_5

    .line 115
    .line 116
    :cond_4
    move/from16 v23, v6

    .line 117
    .line 118
    const/16 p5, 0x2

    .line 119
    .line 120
    const-wide/16 v20, 0x0

    .line 121
    .line 122
    move-object v6, v5

    .line 123
    goto/16 :goto_18

    .line 124
    .line 125
    :cond_5
    new-instance v14, Ljava/io/RandomAccessFile;

    .line 126
    .line 127
    const-string v15, "r"

    .line 128
    .line 129
    invoke-direct {v14, v13, v15}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 130
    .line 131
    .line 132
    :try_start_1
    new-instance v15, Ljava/util/LinkedHashSet;

    .line 133
    .line 134
    invoke-direct {v15}, Ljava/util/LinkedHashSet;-><init>()V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v13}, Ljava/io/File;->length()J

    .line 138
    .line 139
    .line 140
    move-result-wide v18

    .line 141
    const-wide/32 v20, 0x400000

    .line 142
    .line 143
    .line 144
    cmp-long v22, v18, v20

    .line 145
    .line 146
    if-lez v22, :cond_6

    .line 147
    .line 148
    move-wide/from16 v9, v20

    .line 149
    .line 150
    :goto_3
    const-wide/16 v20, 0x0

    .line 151
    .line 152
    goto :goto_4

    .line 153
    :cond_6
    move-wide/from16 v9, v18

    .line 154
    .line 155
    goto :goto_3

    .line 156
    :goto_4
    long-to-int v9, v9

    .line 157
    new-array v9, v9, [B

    .line 158
    .line 159
    new-instance v10, Ljava/io/RandomAccessFile;

    .line 160
    .line 161
    const-string v11, "r"

    .line 162
    .line 163
    invoke-direct {v10, v13, v11}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_6

    .line 164
    .line 165
    .line 166
    :try_start_2
    invoke-virtual {v10, v9}, Ljava/io/RandomAccessFile;->readFully([B)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_7

    .line 167
    .line 168
    .line 169
    :try_start_3
    invoke-virtual {v10}, Ljava/io/RandomAccessFile;->close()V

    .line 170
    .line 171
    .line 172
    sget-object v10, Lp8/b;->b:Ljava/nio/charset/Charset;

    .line 173
    .line 174
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    new-instance v11, Ljava/lang/String;

    .line 178
    .line 179
    invoke-direct {v11, v9, v10}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 180
    .line 181
    .line 182
    sget-object v9, Lp8/b;->c:Ljava/util/List;

    .line 183
    .line 184
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 185
    .line 186
    .line 187
    move-result-object v9

    .line 188
    :cond_7
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 189
    .line 190
    .line 191
    move-result v10
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_6

    .line 192
    if-eqz v10, :cond_b

    .line 193
    .line 194
    :try_start_4
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v10

    .line 198
    check-cast v10, Log/k;

    .line 199
    .line 200
    invoke-static {v10, v11}, Log/k;->c(Log/k;Ljava/lang/CharSequence;)Lng/c;

    .line 201
    .line 202
    .line 203
    move-result-object v10

    .line 204
    const/16 p5, 0x2

    .line 205
    .line 206
    new-instance v7, Lf/i0;

    .line 207
    .line 208
    invoke-direct {v7, v10}, Lf/i0;-><init>(Lng/c;)V

    .line 209
    .line 210
    .line 211
    :cond_8
    :goto_5
    invoke-virtual {v7}, Lf/i0;->hasNext()Z

    .line 212
    .line 213
    .line 214
    move-result v10

    .line 215
    if-eqz v10, :cond_7

    .line 216
    .line 217
    invoke-virtual {v7}, Lf/i0;->next()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v10

    .line 221
    check-cast v10, Log/f;

    .line 222
    .line 223
    check-cast v10, Log/i;

    .line 224
    .line 225
    invoke-virtual {v10}, Log/i;->a()Ljava/util/List;

    .line 226
    .line 227
    .line 228
    move-result-object v10

    .line 229
    invoke-static {v8, v10}, Ltf/m;->w1(ILjava/util/List;)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v10

    .line 233
    check-cast v10, Ljava/lang/String;

    .line 234
    .line 235
    if-eqz v10, :cond_9

    .line 236
    .line 237
    invoke-static {v10}, Log/t;->g0(Ljava/lang/String;)Ljava/lang/Long;

    .line 238
    .line 239
    .line 240
    move-result-object v10

    .line 241
    goto :goto_6

    .line 242
    :catchall_0
    move-exception v0

    .line 243
    move-object v2, v0

    .line 244
    move-object v6, v5

    .line 245
    goto/16 :goto_17

    .line 246
    .line 247
    :cond_9
    const/4 v10, 0x0

    .line 248
    :goto_6
    if-eqz v10, :cond_8

    .line 249
    .line 250
    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    .line 251
    .line 252
    .line 253
    move-result-wide v18

    .line 254
    cmp-long v18, v18, v20

    .line 255
    .line 256
    if-lez v18, :cond_8

    .line 257
    .line 258
    invoke-virtual {v13}, Ljava/io/File;->length()J

    .line 259
    .line 260
    .line 261
    move-result-wide v18

    .line 262
    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    .line 263
    .line 264
    .line 265
    move-result-wide v22

    .line 266
    sub-long v18, v18, v22

    .line 267
    .line 268
    cmp-long v10, v18, v20

    .line 269
    .line 270
    if-gez v10, :cond_a

    .line 271
    .line 272
    move-wide/from16 v18, v20

    .line 273
    .line 274
    :cond_a
    invoke-static/range {v18 .. v19}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 275
    .line 276
    .line 277
    move-result-object v10

    .line 278
    invoke-interface {v15, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 279
    .line 280
    .line 281
    goto :goto_5

    .line 282
    :cond_b
    const/16 p5, 0x2

    .line 283
    .line 284
    :try_start_5
    new-instance v7, Ldg/n;

    .line 285
    .line 286
    invoke-direct {v7, v15, v6}, Ldg/n;-><init>(Ljava/lang/Object;I)V

    .line 287
    .line 288
    .line 289
    new-instance v9, Lm/b;

    .line 290
    .line 291
    const/16 v10, 0x8

    .line 292
    .line 293
    invoke-direct {v9, v14, v10, v13}, Lm/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 294
    .line 295
    .line 296
    invoke-static {v7, v9}, Lng/m;->X(Lng/j;Lfg/l;)Lng/i;

    .line 297
    .line 298
    .line 299
    move-result-object v7

    .line 300
    invoke-static {v7}, Lng/m;->U(Lng/j;)Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v7

    .line 304
    check-cast v7, Lp8/a;

    .line 305
    .line 306
    if-eqz v7, :cond_c

    .line 307
    .line 308
    move/from16 v23, v6

    .line 309
    .line 310
    move-object/from16 v17, v13

    .line 311
    .line 312
    goto/16 :goto_b

    .line 313
    .line 314
    :cond_c
    sget-object v7, Lp8/b;->a:Lp8/b;

    .line 315
    .line 316
    invoke-virtual {v13}, Ljava/io/File;->length()J

    .line 317
    .line 318
    .line 319
    move-result-wide v9
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_6

    .line 320
    cmp-long v7, v9, v16

    .line 321
    .line 322
    if-gez v7, :cond_e

    .line 323
    .line 324
    :cond_d
    move/from16 v23, v6

    .line 325
    .line 326
    move-object/from16 v17, v13

    .line 327
    .line 328
    :goto_7
    const/4 v7, 0x0

    .line 329
    goto/16 :goto_b

    .line 330
    .line 331
    :cond_e
    const/high16 v7, 0x100000

    .line 332
    .line 333
    :try_start_6
    new-array v11, v7, [B

    .line 334
    .line 335
    move-wide v15, v9

    .line 336
    move-wide/from16 v8, v20

    .line 337
    .line 338
    :goto_8
    cmp-long v10, v8, v15

    .line 339
    .line 340
    if-gez v10, :cond_d

    .line 341
    .line 342
    invoke-virtual {v14, v8, v9}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 343
    .line 344
    .line 345
    move-object/from16 v17, v13

    .line 346
    .line 347
    int-to-long v12, v7

    .line 348
    move/from16 v23, v6

    .line 349
    .line 350
    sub-long v6, v15, v8

    .line 351
    .line 352
    invoke-static {v12, v13, v6, v7}, Ljava/lang/Math;->min(JJ)J

    .line 353
    .line 354
    .line 355
    move-result-wide v6

    .line 356
    long-to-int v6, v6

    .line 357
    const/4 v7, 0x0

    .line 358
    invoke-virtual {v14, v11, v7, v6}, Ljava/io/RandomAccessFile;->readFully([BII)V

    .line 359
    .line 360
    .line 361
    add-int/lit8 v7, v6, -0x4

    .line 362
    .line 363
    const/4 v12, 0x4

    .line 364
    :goto_9
    if-lt v12, v7, :cond_10

    .line 365
    .line 366
    const/high16 v10, 0x100000

    .line 367
    .line 368
    if-ge v6, v10, :cond_f

    .line 369
    .line 370
    goto :goto_7

    .line 371
    :cond_f
    int-to-long v6, v6

    .line 372
    const-wide/16 v12, 0x8

    .line 373
    .line 374
    sub-long/2addr v6, v12

    .line 375
    add-long/2addr v8, v6

    .line 376
    move v7, v10

    .line 377
    move-object/from16 v13, v17

    .line 378
    .line 379
    move/from16 v6, v23

    .line 380
    .line 381
    goto :goto_8

    .line 382
    :cond_10
    const/high16 v10, 0x100000

    .line 383
    .line 384
    aget-byte v13, v11, v12

    .line 385
    .line 386
    const/16 v10, 0x66

    .line 387
    .line 388
    if-ne v13, v10, :cond_11

    .line 389
    .line 390
    add-int/lit8 v10, v12, 0x1

    .line 391
    .line 392
    aget-byte v10, v11, v10

    .line 393
    .line 394
    const/16 v13, 0x74

    .line 395
    .line 396
    if-ne v10, v13, :cond_11

    .line 397
    .line 398
    add-int/lit8 v10, v12, 0x2

    .line 399
    .line 400
    aget-byte v10, v11, v10

    .line 401
    .line 402
    const/16 v13, 0x79

    .line 403
    .line 404
    if-ne v10, v13, :cond_11

    .line 405
    .line 406
    add-int/lit8 v10, v12, 0x3

    .line 407
    .line 408
    aget-byte v10, v11, v10

    .line 409
    .line 410
    const/16 v13, 0x70

    .line 411
    .line 412
    if-eq v10, v13, :cond_12

    .line 413
    .line 414
    :cond_11
    move v10, v6

    .line 415
    move v13, v7

    .line 416
    move-wide/from16 v24, v8

    .line 417
    .line 418
    move-wide v8, v15

    .line 419
    goto :goto_a

    .line 420
    :cond_12
    move v10, v6

    .line 421
    move v13, v7

    .line 422
    int-to-long v6, v12

    .line 423
    add-long/2addr v6, v8

    .line 424
    const-wide/16 v24, 0x4

    .line 425
    .line 426
    sub-long v6, v6, v24

    .line 427
    .line 428
    move-wide/from16 v24, v8

    .line 429
    .line 430
    move-wide v8, v15

    .line 431
    invoke-static {v14, v8, v9, v6, v7}, Lp8/b;->d(Ljava/io/RandomAccessFile;JJ)Lp8/a;

    .line 432
    .line 433
    .line 434
    move-result-object v6
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 435
    if-eqz v6, :cond_13

    .line 436
    .line 437
    move-object v7, v6

    .line 438
    goto :goto_b

    .line 439
    :cond_13
    :goto_a
    add-int/lit8 v12, v12, 0x1

    .line 440
    .line 441
    move-wide v15, v8

    .line 442
    move v6, v10

    .line 443
    move v7, v13

    .line 444
    move-wide/from16 v8, v24

    .line 445
    .line 446
    goto :goto_9

    .line 447
    :goto_b
    :try_start_7
    invoke-virtual {v14}, Ljava/io/RandomAccessFile;->close()V

    .line 448
    .line 449
    .line 450
    if-eqz v7, :cond_1f

    .line 451
    .line 452
    new-instance v6, Ljava/io/File;

    .line 453
    .line 454
    const-string v8, "Hchat_sns_live_photo"

    .line 455
    .line 456
    invoke-direct {v6, v4, v8}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 457
    .line 458
    .line 459
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    .line 460
    .line 461
    .line 462
    move-result v4

    .line 463
    if-nez v4, :cond_14

    .line 464
    .line 465
    invoke-virtual {v6}, Ljava/io/File;->mkdirs()Z

    .line 466
    .line 467
    .line 468
    move-result v4
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 469
    if-nez v4, :cond_14

    .line 470
    .line 471
    monitor-exit v5

    .line 472
    :goto_c
    const/4 v5, 0x0

    .line 473
    goto/16 :goto_19

    .line 474
    .line 475
    :cond_14
    move-object/from16 v13, v17

    .line 476
    .line 477
    goto :goto_d

    .line 478
    :catchall_1
    move-exception v0

    .line 479
    move-object v6, v5

    .line 480
    goto/16 :goto_30

    .line 481
    .line 482
    :goto_d
    :try_start_8
    invoke-static {v13, v7}, Lp8/b;->a(Ljava/io/File;Lp8/a;)Ljava/lang/String;

    .line 483
    .line 484
    .line 485
    move-result-object v4

    .line 486
    invoke-static {v13}, Lp8/b;->c(Ljava/io/File;)Z

    .line 487
    .line 488
    .line 489
    move-result v8

    .line 490
    if-eqz v8, :cond_15

    .line 491
    .line 492
    const-string v8, "jpg"

    .line 493
    .line 494
    goto :goto_e

    .line 495
    :cond_15
    invoke-static {v13}, Lp8/b;->b(Ljava/io/File;)Ljava/lang/String;

    .line 496
    .line 497
    .line 498
    move-result-object v8

    .line 499
    :goto_e
    new-instance v14, Ljava/io/File;

    .line 500
    .line 501
    new-instance v9, Ljava/lang/StringBuilder;

    .line 502
    .line 503
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 504
    .line 505
    .line 506
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 507
    .line 508
    .line 509
    const-string v10, "_image."

    .line 510
    .line 511
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 512
    .line 513
    .line 514
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 515
    .line 516
    .line 517
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 518
    .line 519
    .line 520
    move-result-object v8

    .line 521
    invoke-direct {v14, v6, v8}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 522
    .line 523
    .line 524
    new-instance v8, Ljava/io/File;

    .line 525
    .line 526
    new-instance v9, Ljava/lang/StringBuilder;

    .line 527
    .line 528
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 529
    .line 530
    .line 531
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 532
    .line 533
    .line 534
    const-string v4, "_video.mp4"

    .line 535
    .line 536
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 537
    .line 538
    .line 539
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 540
    .line 541
    .line 542
    move-result-object v4

    .line 543
    invoke-direct {v8, v6, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 544
    .line 545
    .line 546
    invoke-static {v13}, Lp8/b;->c(Ljava/io/File;)Z

    .line 547
    .line 548
    .line 549
    move-result v4
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 550
    iget-wide v9, v7, Lp8/a;->a:J

    .line 551
    .line 552
    if-eqz v4, :cond_1a

    .line 553
    .line 554
    const/high16 v4, 0x400000

    .line 555
    .line 556
    int-to-long v11, v4

    .line 557
    sub-long v11, v9, v11

    .line 558
    .line 559
    const-wide/16 v15, 0x2

    .line 560
    .line 561
    cmp-long v4, v11, v15

    .line 562
    .line 563
    if-gez v4, :cond_16

    .line 564
    .line 565
    move-wide v11, v15

    .line 566
    :cond_16
    sub-long v17, v9, v11

    .line 567
    .line 568
    const-wide/32 v24, 0x7fffffff

    .line 569
    .line 570
    .line 571
    cmp-long v4, v17, v24

    .line 572
    .line 573
    move-object v6, v5

    .line 574
    if-lez v4, :cond_17

    .line 575
    .line 576
    move-wide/from16 v4, v24

    .line 577
    .line 578
    goto :goto_f

    .line 579
    :cond_17
    move-wide/from16 v4, v17

    .line 580
    .line 581
    :goto_f
    long-to-int v4, v4

    .line 582
    :try_start_9
    new-array v5, v4, [B

    .line 583
    .line 584
    move-wide/from16 v17, v15

    .line 585
    .line 586
    new-instance v15, Ljava/io/RandomAccessFile;

    .line 587
    .line 588
    move/from16 v16, v4

    .line 589
    .line 590
    const-string v4, "r"

    .line 591
    .line 592
    invoke-direct {v15, v13, v4}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 593
    .line 594
    .line 595
    :try_start_a
    invoke-virtual {v15, v11, v12}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 596
    .line 597
    .line 598
    invoke-virtual {v15, v5}, Ljava/io/RandomAccessFile;->readFully([B)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 599
    .line 600
    .line 601
    :try_start_b
    invoke-virtual {v15}, Ljava/io/RandomAccessFile;->close()V

    .line 602
    .line 603
    .line 604
    add-int/lit8 v4, v16, -0x2

    .line 605
    .line 606
    :goto_10
    const/4 v15, -0x1

    .line 607
    if-lt v15, v4, :cond_18

    .line 608
    .line 609
    goto :goto_11

    .line 610
    :cond_18
    move-object/from16 v16, v5

    .line 611
    .line 612
    aget-byte v5, v16, v4

    .line 613
    .line 614
    if-ne v5, v15, :cond_19

    .line 615
    .line 616
    add-int/lit8 v5, v4, 0x1

    .line 617
    .line 618
    aget-byte v5, v16, v5
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    .line 619
    .line 620
    const/16 v15, -0x27

    .line 621
    .line 622
    if-ne v5, v15, :cond_19

    .line 623
    .line 624
    int-to-long v4, v4

    .line 625
    add-long/2addr v11, v4

    .line 626
    add-long v9, v11, v17

    .line 627
    .line 628
    :goto_11
    move-wide/from16 v17, v9

    .line 629
    .line 630
    goto :goto_12

    .line 631
    :cond_19
    add-int/lit8 v4, v4, -0x1

    .line 632
    .line 633
    move-object/from16 v5, v16

    .line 634
    .line 635
    goto :goto_10

    .line 636
    :catchall_2
    move-exception v0

    .line 637
    move-object v2, v0

    .line 638
    :try_start_c
    throw v2
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    .line 639
    :catchall_3
    move-exception v0

    .line 640
    :try_start_d
    invoke-static {v15, v2}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 641
    .line 642
    .line 643
    throw v0

    .line 644
    :cond_1a
    move-object v6, v5

    .line 645
    goto :goto_11

    .line 646
    :goto_12
    cmp-long v4, v17, v20

    .line 647
    .line 648
    if-lez v4, :cond_1e

    .line 649
    .line 650
    iget-wide v4, v7, Lp8/a;->a:J

    .line 651
    .line 652
    cmp-long v4, v17, v4

    .line 653
    .line 654
    if-lez v4, :cond_1b

    .line 655
    .line 656
    goto :goto_14

    .line 657
    :cond_1b
    const-wide/16 v15, 0x0

    .line 658
    .line 659
    invoke-static/range {v13 .. v18}, Lp8/b;->e(Ljava/io/File;Ljava/io/File;JJ)Z

    .line 660
    .line 661
    .line 662
    move-result v4

    .line 663
    move-object v5, v14

    .line 664
    if-eqz v4, :cond_1d

    .line 665
    .line 666
    iget-wide v9, v7, Lp8/a;->a:J

    .line 667
    .line 668
    iget-wide v11, v7, Lp8/a;->b:J

    .line 669
    .line 670
    sub-long v17, v11, v9

    .line 671
    .line 672
    move-object v14, v8

    .line 673
    move-wide v15, v9

    .line 674
    invoke-static/range {v13 .. v18}, Lp8/b;->e(Ljava/io/File;Ljava/io/File;JJ)Z

    .line 675
    .line 676
    .line 677
    move-result v4

    .line 678
    if-nez v4, :cond_1c

    .line 679
    .line 680
    goto :goto_13

    .line 681
    :cond_1c
    new-instance v4, Lp8/e;

    .line 682
    .line 683
    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 684
    .line 685
    .line 686
    move-result-object v5

    .line 687
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 688
    .line 689
    .line 690
    invoke-virtual {v14}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 691
    .line 692
    .line 693
    move-result-object v7

    .line 694
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 695
    .line 696
    .line 697
    invoke-direct {v4, v5, v7}, Lp8/e;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    .line 698
    .line 699
    .line 700
    monitor-exit v6

    .line 701
    move-object v5, v4

    .line 702
    goto :goto_19

    .line 703
    :catchall_4
    move-exception v0

    .line 704
    goto/16 :goto_30

    .line 705
    .line 706
    :cond_1d
    move-object v14, v8

    .line 707
    :goto_13
    :try_start_e
    invoke-virtual {v5}, Ljava/io/File;->delete()Z

    .line 708
    .line 709
    .line 710
    invoke-virtual {v14}, Ljava/io/File;->delete()Z
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_4

    .line 711
    .line 712
    .line 713
    monitor-exit v6

    .line 714
    goto/16 :goto_c

    .line 715
    .line 716
    :cond_1e
    :goto_14
    monitor-exit v6

    .line 717
    goto/16 :goto_c

    .line 718
    .line 719
    :cond_1f
    move-object v6, v5

    .line 720
    monitor-exit v6

    .line 721
    goto/16 :goto_c

    .line 722
    .line 723
    :catchall_5
    move-exception v0

    .line 724
    goto :goto_16

    .line 725
    :goto_15
    move-object v2, v0

    .line 726
    goto :goto_17

    .line 727
    :catchall_6
    move-exception v0

    .line 728
    :goto_16
    move-object v6, v5

    .line 729
    goto :goto_15

    .line 730
    :catchall_7
    move-exception v0

    .line 731
    move-object v6, v5

    .line 732
    move-object v2, v0

    .line 733
    :try_start_f
    throw v2
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_8

    .line 734
    :catchall_8
    move-exception v0

    .line 735
    :try_start_10
    invoke-static {v10, v2}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 736
    .line 737
    .line 738
    throw v0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_9

    .line 739
    :catchall_9
    move-exception v0

    .line 740
    goto :goto_15

    .line 741
    :goto_17
    :try_start_11
    throw v2
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_a

    .line 742
    :catchall_a
    move-exception v0

    .line 743
    :try_start_12
    invoke-static {v14, v2}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 744
    .line 745
    .line 746
    throw v0
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_4

    .line 747
    :goto_18
    monitor-exit v6

    .line 748
    goto/16 :goto_c

    .line 749
    .line 750
    :goto_19
    if-eqz v5, :cond_20

    .line 751
    .line 752
    goto :goto_1a

    .line 753
    :cond_20
    new-instance v4, Ljava/lang/StringBuilder;

    .line 754
    .line 755
    const-string v5, "\u670b\u53cb\u5708\u5b9e\u51b5\u53d1\u5e03\u5931\u8d25: \u56fe\u7247\u5185\u672a\u627e\u5230\u6709\u6548\u5b9e\u51b5\u89c6\u9891 "

    .line 756
    .line 757
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 758
    .line 759
    .line 760
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 761
    .line 762
    .line 763
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 764
    .line 765
    .line 766
    move-result-object v0

    .line 767
    invoke-virtual {v1, v0}, Lp8/d0;->l(Ljava/lang/String;)V

    .line 768
    .line 769
    .line 770
    const/4 v5, 0x0

    .line 771
    :goto_1a
    if-eqz v5, :cond_43

    .line 772
    .line 773
    if-nez p3, :cond_21

    .line 774
    .line 775
    const-string v0, ""

    .line 776
    .line 777
    move-object v4, v0

    .line 778
    goto :goto_1b

    .line 779
    :cond_21
    move-object/from16 v4, p3

    .line 780
    .line 781
    :goto_1b
    iget-object v6, v5, Lp8/e;->a:Ljava/lang/String;

    .line 782
    .line 783
    iget-object v5, v5, Lp8/e;->b:Ljava/lang/String;

    .line 784
    .line 785
    cmp-long v0, p1, v20

    .line 786
    .line 787
    if-gez v0, :cond_22

    .line 788
    .line 789
    move-wide/from16 v7, v20

    .line 790
    .line 791
    goto :goto_1c

    .line 792
    :cond_22
    move-wide/from16 v7, p1

    .line 793
    .line 794
    :goto_1c
    const/16 v0, 0x36

    .line 795
    .line 796
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 797
    .line 798
    .line 799
    move-result-object v9

    .line 800
    const-string v10, "("

    .line 801
    .line 802
    iget-object v11, v1, Lp8/d0;->a:Landroid/content/Context;

    .line 803
    .line 804
    iget-object v12, v1, Lp8/d0;->b:Lh/Hchat/dexkit/DexFinder;

    .line 805
    .line 806
    new-instance v13, Ljava/io/File;

    .line 807
    .line 808
    invoke-direct {v13, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 809
    .line 810
    .line 811
    new-instance v14, Ljava/io/File;

    .line 812
    .line 813
    invoke-direct {v14, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 814
    .line 815
    .line 816
    invoke-virtual {v13}, Ljava/io/File;->isFile()Z

    .line 817
    .line 818
    .line 819
    move-result v0

    .line 820
    if-nez v0, :cond_23

    .line 821
    .line 822
    new-instance v0, Ljava/lang/StringBuilder;

    .line 823
    .line 824
    const-string v2, "\u670b\u53cb\u5708\u5b9e\u51b5\u53d1\u5e03\u5931\u8d25: \u5c01\u9762\u56fe\u7247\u4e0d\u5b58\u5728 "

    .line 825
    .line 826
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 827
    .line 828
    .line 829
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 830
    .line 831
    .line 832
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 833
    .line 834
    .line 835
    move-result-object v0

    .line 836
    invoke-virtual {v1, v0}, Lp8/d0;->l(Ljava/lang/String;)V

    .line 837
    .line 838
    .line 839
    const/16 v22, 0x0

    .line 840
    .line 841
    return v22

    .line 842
    :cond_23
    const/16 v22, 0x0

    .line 843
    .line 844
    invoke-virtual {v14}, Ljava/io/File;->isFile()Z

    .line 845
    .line 846
    .line 847
    move-result v0

    .line 848
    if-nez v0, :cond_24

    .line 849
    .line 850
    const-string v0, "\u670b\u53cb\u5708\u5b9e\u51b5\u53d1\u5e03\u5931\u8d25: \u5b9e\u51b5\u89c6\u9891\u4e0d\u5b58\u5728 "

    .line 851
    .line 852
    invoke-virtual {v0, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 853
    .line 854
    .line 855
    move-result-object v0

    .line 856
    invoke-virtual {v1, v0}, Lp8/d0;->l(Ljava/lang/String;)V

    .line 857
    .line 858
    .line 859
    return v22

    .line 860
    :cond_24
    new-instance v15, Landroid/media/MediaMetadataRetriever;

    .line 861
    .line 862
    invoke-direct {v15}, Landroid/media/MediaMetadataRetriever;-><init>()V

    .line 863
    .line 864
    .line 865
    :try_start_13
    invoke-virtual {v15, v5}, Landroid/media/MediaMetadataRetriever;->setDataSource(Ljava/lang/String;)V

    .line 866
    .line 867
    .line 868
    const/16 v0, 0x9

    .line 869
    .line 870
    invoke-virtual {v15, v0}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 871
    .line 872
    .line 873
    move-result-object v0

    .line 874
    if-eqz v0, :cond_25

    .line 875
    .line 876
    invoke-static {v0}, Log/t;->g0(Ljava/lang/String;)Ljava/lang/Long;

    .line 877
    .line 878
    .line 879
    move-result-object v0

    .line 880
    if-eqz v0, :cond_25

    .line 881
    .line 882
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 883
    .line 884
    .line 885
    move-result-wide v16
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_b

    .line 886
    move-object/from16 p1, v13

    .line 887
    .line 888
    move-object/from16 p2, v14

    .line 889
    .line 890
    move-wide/from16 v13, v16

    .line 891
    .line 892
    goto :goto_1d

    .line 893
    :catchall_b
    move-exception v0

    .line 894
    move-object/from16 p1, v13

    .line 895
    .line 896
    move-object/from16 p2, v14

    .line 897
    .line 898
    goto :goto_1e

    .line 899
    :cond_25
    move-object/from16 p1, v13

    .line 900
    .line 901
    move-object/from16 p2, v14

    .line 902
    .line 903
    move-wide/from16 v13, v20

    .line 904
    .line 905
    :goto_1d
    cmp-long v0, v13, v20

    .line 906
    .line 907
    if-gtz v0, :cond_26

    .line 908
    .line 909
    const/4 v0, 0x0

    .line 910
    goto :goto_1f

    .line 911
    :cond_26
    :try_start_14
    new-instance v0, Lp8/b0;

    .line 912
    .line 913
    invoke-direct {v0, v13, v14}, Lp8/b0;-><init>(J)V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_c

    .line 914
    .line 915
    .line 916
    goto :goto_1f

    .line 917
    :catchall_c
    move-exception v0

    .line 918
    :goto_1e
    new-instance v13, Lsf/f;

    .line 919
    .line 920
    invoke-direct {v13, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 921
    .line 922
    .line 923
    move-object v0, v13

    .line 924
    :goto_1f
    nop

    .line 925
    instance-of v13, v0, Lsf/f;

    .line 926
    .line 927
    if-eqz v13, :cond_27

    .line 928
    .line 929
    const/4 v0, 0x0

    .line 930
    :cond_27
    move-object v13, v0

    .line 931
    check-cast v13, Lp8/b0;

    .line 932
    .line 933
    :try_start_15
    invoke-virtual {v15}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_d

    .line 934
    .line 935
    .line 936
    :catchall_d
    if-eqz v13, :cond_42

    .line 937
    .line 938
    iget-object v0, v1, Lp8/d0;->m:Lp8/y;

    .line 939
    .line 940
    if-eqz v0, :cond_28

    .line 941
    .line 942
    move-object/from16 v16, v4

    .line 943
    .line 944
    move-object/from16 v18, v5

    .line 945
    .line 946
    move-wide/from16 v20, v7

    .line 947
    .line 948
    move-object/from16 p3, v9

    .line 949
    .line 950
    move-object/from16 v17, v11

    .line 951
    .line 952
    goto/16 :goto_27

    .line 953
    .line 954
    :cond_28
    iget-object v0, v1, Lp8/d0;->a:Landroid/content/Context;

    .line 955
    .line 956
    iget-object v14, v1, Lp8/d0;->b:Lh/Hchat/dexkit/DexFinder;

    .line 957
    .line 958
    iget-object v15, v1, Lp8/d0;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 959
    .line 960
    if-eqz v15, :cond_35

    .line 961
    .line 962
    :try_start_16
    invoke-virtual {v14}, Lh/Hchat/dexkit/DexFinder;->resolveSnsUploadApi()V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_e

    .line 963
    .line 964
    .line 965
    :catchall_e
    iget-object v3, v1, Lp8/d0;->c:Ljava/lang/ClassLoader;

    .line 966
    .line 967
    if-eqz v3, :cond_35

    .line 968
    .line 969
    iget-object v14, v14, Lh/Hchat/dexkit/DexFinder;->snsUploadPackHelperClass:Ljava/lang/Class;

    .line 970
    .line 971
    const-class v16, Lp8/d0;

    .line 972
    .line 973
    invoke-static/range {v16 .. v16}, Lgg/v;->a(Ljava/lang/Class;)Lgg/f;

    .line 974
    .line 975
    .line 976
    move-result-object v16

    .line 977
    invoke-interface/range {v16 .. v16}, Lgg/e;->a()Ljava/lang/Class;

    .line 978
    .line 979
    .line 980
    move-result-object v16

    .line 981
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 982
    .line 983
    .line 984
    const-string v2, "element_class_v1"

    .line 985
    .line 986
    move-object/from16 v16, v4

    .line 987
    .line 988
    const-string v4, "set_upload_list_v1"

    .line 989
    .line 990
    if-nez v14, :cond_29

    .line 991
    .line 992
    move-object/from16 v18, v5

    .line 993
    .line 994
    move-wide/from16 v20, v7

    .line 995
    .line 996
    move-object/from16 p3, v9

    .line 997
    .line 998
    move-object/from16 v17, v11

    .line 999
    .line 1000
    const/4 v0, 0x0

    .line 1001
    goto/16 :goto_25

    .line 1002
    .line 1003
    :cond_29
    move-object/from16 p3, v9

    .line 1004
    .line 1005
    const-string v9, "Hchat_sns_live_photo_upload_cache"

    .line 1006
    .line 1007
    invoke-static {v0, v9}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 1008
    .line 1009
    .line 1010
    move-result-object v9

    .line 1011
    move-object/from16 v17, v11

    .line 1012
    .line 1013
    invoke-static {v0, v3}, Le8/b;->g(Landroid/content/Context;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v11

    .line 1017
    invoke-static {v9, v11, v3, v4}, Le8/b;->c(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 1018
    .line 1019
    .line 1020
    move-result-object v0

    .line 1021
    move-wide/from16 v20, v7

    .line 1022
    .line 1023
    const-string v7, ""

    .line 1024
    .line 1025
    invoke-interface {v9, v2, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1026
    .line 1027
    .line 1028
    move-result-object v7

    .line 1029
    invoke-static {v7, v3}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 1030
    .line 1031
    .line 1032
    move-result-object v7

    .line 1033
    invoke-static {v14, v7, v0}, Lig/a;->g(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Method;)Lp8/y;

    .line 1034
    .line 1035
    .line 1036
    move-result-object v0

    .line 1037
    if-eqz v0, :cond_2a

    .line 1038
    .line 1039
    move-object/from16 v18, v5

    .line 1040
    .line 1041
    goto/16 :goto_25

    .line 1042
    .line 1043
    :cond_2a
    invoke-static {v9, v11, v4}, Le8/b;->a(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;)V

    .line 1044
    .line 1045
    .line 1046
    invoke-interface {v9}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 1047
    .line 1048
    .line 1049
    move-result-object v0

    .line 1050
    invoke-interface {v0, v2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v0

    .line 1054
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 1055
    .line 1056
    .line 1057
    :try_start_17
    new-instance v0, Lch/e;

    .line 1058
    .line 1059
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1060
    .line 1061
    .line 1062
    new-instance v7, Lfh/k;

    .line 1063
    .line 1064
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 1065
    .line 1066
    .line 1067
    const-string v8, "setUploadList"
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_11

    .line 1068
    .line 1069
    move-object/from16 v18, v5

    .line 1070
    .line 1071
    :try_start_18
    const-string v5, "livePhotoElement != null >> path:"

    .line 1072
    .line 1073
    filled-new-array {v8, v5}, [Ljava/lang/String;

    .line 1074
    .line 1075
    .line 1076
    move-result-object v5

    .line 1077
    invoke-static {v5}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 1078
    .line 1079
    .line 1080
    move-result-object v5

    .line 1081
    invoke-static {v7, v5}, Lfh/k;->u0(Lfh/k;Ljava/util/Collection;)V

    .line 1082
    .line 1083
    .line 1084
    iput-object v7, v0, Lch/e;->h:Lfh/k;

    .line 1085
    .line 1086
    invoke-virtual {v15, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 1087
    .line 1088
    .line 1089
    move-result-object v0

    .line 1090
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 1091
    .line 1092
    .line 1093
    move-result-object v5

    .line 1094
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1095
    .line 1096
    .line 1097
    :cond_2b
    :goto_20
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 1098
    .line 1099
    .line 1100
    move-result v0

    .line 1101
    if-eqz v0, :cond_31

    .line 1102
    .line 1103
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1104
    .line 1105
    .line 1106
    move-result-object v0

    .line 1107
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1108
    .line 1109
    .line 1110
    move-object v7, v0

    .line 1111
    check-cast v7, Lhh/o;
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_10

    .line 1112
    .line 1113
    :try_start_19
    invoke-virtual {v7}, Lhh/o;->p()Llh/d;

    .line 1114
    .line 1115
    .line 1116
    move-result-object v0

    .line 1117
    invoke-virtual {v0, v3}, Llh/d;->b(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 1118
    .line 1119
    .line 1120
    move-result-object v0
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_f

    .line 1121
    goto :goto_21

    .line 1122
    :catchall_f
    move-exception v0

    .line 1123
    :try_start_1a
    new-instance v8, Lsf/f;

    .line 1124
    .line 1125
    invoke-direct {v8, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 1126
    .line 1127
    .line 1128
    move-object v0, v8

    .line 1129
    :goto_21
    nop

    .line 1130
    instance-of v8, v0, Lsf/f;

    .line 1131
    .line 1132
    if-eqz v8, :cond_2c

    .line 1133
    .line 1134
    const/4 v0, 0x0

    .line 1135
    :cond_2c
    check-cast v0, Ljava/lang/reflect/Method;

    .line 1136
    .line 1137
    if-eqz v0, :cond_2b

    .line 1138
    .line 1139
    invoke-static {v14, v0}, Lig/a;->J(Ljava/lang/Class;Ljava/lang/reflect/Method;)Z

    .line 1140
    .line 1141
    .line 1142
    move-result v8

    .line 1143
    if-nez v8, :cond_2d

    .line 1144
    .line 1145
    goto :goto_20

    .line 1146
    :cond_2d
    iget-object v7, v7, Lhh/o;->s:Lsf/i;

    .line 1147
    .line 1148
    invoke-virtual {v7}, Lsf/i;->getValue()Ljava/lang/Object;

    .line 1149
    .line 1150
    .line 1151
    move-result-object v7

    .line 1152
    check-cast v7, Ljava/util/List;

    .line 1153
    .line 1154
    new-instance v8, Ljava/util/ArrayList;

    .line 1155
    .line 1156
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 1157
    .line 1158
    .line 1159
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1160
    .line 1161
    .line 1162
    move-result-object v7

    .line 1163
    :cond_2e
    :goto_22
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 1164
    .line 1165
    .line 1166
    move-result v15

    .line 1167
    if-eqz v15, :cond_2f

    .line 1168
    .line 1169
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1170
    .line 1171
    .line 1172
    move-result-object v15

    .line 1173
    check-cast v15, Lhh/q;

    .line 1174
    .line 1175
    iget-object v15, v15, Lhh/q;->a:Lhh/l;

    .line 1176
    .line 1177
    invoke-virtual {v15}, Lhh/l;->p()Llh/b;

    .line 1178
    .line 1179
    .line 1180
    move-result-object v15

    .line 1181
    iget-object v15, v15, Llh/b;->g:Ljava/lang/String;

    .line 1182
    .line 1183
    if-eqz v15, :cond_2e

    .line 1184
    .line 1185
    invoke-virtual {v8, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1186
    .line 1187
    .line 1188
    goto :goto_22

    .line 1189
    :catchall_10
    move-exception v0

    .line 1190
    goto :goto_23

    .line 1191
    :cond_2f
    invoke-static {v8}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 1192
    .line 1193
    .line 1194
    move-result-object v7

    .line 1195
    invoke-static {v7}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1196
    .line 1197
    .line 1198
    move-result-object v7

    .line 1199
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1200
    .line 1201
    .line 1202
    move-result-object v7

    .line 1203
    :cond_30
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 1204
    .line 1205
    .line 1206
    move-result v8

    .line 1207
    if-eqz v8, :cond_2b

    .line 1208
    .line 1209
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1210
    .line 1211
    .line 1212
    move-result-object v8

    .line 1213
    check-cast v8, Ljava/lang/String;

    .line 1214
    .line 1215
    invoke-static {v8, v3}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 1216
    .line 1217
    .line 1218
    move-result-object v8

    .line 1219
    if-eqz v8, :cond_30

    .line 1220
    .line 1221
    invoke-static {v14, v8, v0}, Lig/a;->g(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Method;)Lp8/y;

    .line 1222
    .line 1223
    .line 1224
    move-result-object v15

    .line 1225
    if-eqz v15, :cond_30

    .line 1226
    .line 1227
    invoke-static {v9, v11, v4, v0}, Le8/b;->h(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 1228
    .line 1229
    .line 1230
    invoke-interface {v9}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 1231
    .line 1232
    .line 1233
    move-result-object v0

    .line 1234
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1235
    .line 1236
    .line 1237
    move-result-object v3

    .line 1238
    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 1239
    .line 1240
    .line 1241
    move-result-object v0

    .line 1242
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_10

    .line 1243
    .line 1244
    .line 1245
    goto :goto_24

    .line 1246
    :cond_31
    const/4 v15, 0x0

    .line 1247
    goto :goto_24

    .line 1248
    :catchall_11
    move-exception v0

    .line 1249
    move-object/from16 v18, v5

    .line 1250
    .line 1251
    :goto_23
    new-instance v15, Lsf/f;

    .line 1252
    .line 1253
    invoke-direct {v15, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 1254
    .line 1255
    .line 1256
    :goto_24
    invoke-static {v15}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1257
    .line 1258
    .line 1259
    move-result-object v0

    .line 1260
    if-eqz v0, :cond_32

    .line 1261
    .line 1262
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1263
    .line 1264
    .line 1265
    move-result-object v0

    .line 1266
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1267
    .line 1268
    const-string v3, "\u670b\u53cb\u5708\u5b9e\u51b5\u4e0a\u4f20\u65b9\u6cd5\u5b9a\u4f4d\u5931\u8d25: "

    .line 1269
    .line 1270
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1271
    .line 1272
    .line 1273
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1274
    .line 1275
    .line 1276
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1277
    .line 1278
    .line 1279
    move-result-object v0

    .line 1280
    invoke-virtual {v1, v0}, Lp8/d0;->l(Ljava/lang/String;)V

    .line 1281
    .line 1282
    .line 1283
    :cond_32
    instance-of v0, v15, Lsf/f;

    .line 1284
    .line 1285
    if-eqz v0, :cond_33

    .line 1286
    .line 1287
    const/4 v15, 0x0

    .line 1288
    :cond_33
    check-cast v15, Lp8/y;

    .line 1289
    .line 1290
    move-object v0, v15

    .line 1291
    :goto_25
    if-eqz v0, :cond_34

    .line 1292
    .line 1293
    iput-object v0, v1, Lp8/d0;->m:Lp8/y;

    .line 1294
    .line 1295
    goto :goto_27

    .line 1296
    :cond_34
    :goto_26
    const/4 v0, 0x0

    .line 1297
    goto :goto_27

    .line 1298
    :cond_35
    move-object/from16 v16, v4

    .line 1299
    .line 1300
    move-object/from16 v18, v5

    .line 1301
    .line 1302
    move-wide/from16 v20, v7

    .line 1303
    .line 1304
    move-object/from16 p3, v9

    .line 1305
    .line 1306
    move-object/from16 v17, v11

    .line 1307
    .line 1308
    goto :goto_26

    .line 1309
    :goto_27
    if-eqz v0, :cond_41

    .line 1310
    .line 1311
    iget-object v2, v12, Lh/Hchat/dexkit/DexFinder;->snsUploadPackHelperClass:Ljava/lang/Class;

    .line 1312
    .line 1313
    if-eqz v2, :cond_3d

    .line 1314
    .line 1315
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1316
    .line 1317
    .line 1318
    move-result-object v3

    .line 1319
    invoke-virtual/range {p1 .. p1}, Ljava/io/File;->length()J

    .line 1320
    .line 1321
    .line 1322
    move-result-wide v4

    .line 1323
    invoke-virtual/range {p2 .. p2}, Ljava/io/File;->length()J

    .line 1324
    .line 1325
    .line 1326
    move-result-wide v7

    .line 1327
    iget-wide v13, v13, Lp8/b0;->a:J

    .line 1328
    .line 1329
    iget-object v9, v0, Lp8/y;->b:Ljava/lang/reflect/Constructor;

    .line 1330
    .line 1331
    invoke-virtual {v9}, Ljava/lang/reflect/Constructor;->getDeclaringClass()Ljava/lang/Class;

    .line 1332
    .line 1333
    .line 1334
    move-result-object v9

    .line 1335
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1336
    .line 1337
    .line 1338
    move-result-object v9

    .line 1339
    const-string v11, "\u670b\u53cb\u5708\u5b9e\u51b5\u53d1\u5e03\u5165\u961f: helper="

    .line 1340
    .line 1341
    const-string v15, " image="

    .line 1342
    .line 1343
    invoke-static {v11, v3, v15, v6, v10}, Lbc/e;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1344
    .line 1345
    .line 1346
    move-result-object v3

    .line 1347
    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1348
    .line 1349
    .line 1350
    const-string v4, ") video="

    .line 1351
    .line 1352
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1353
    .line 1354
    .line 1355
    move-object/from16 v4, v18

    .line 1356
    .line 1357
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1358
    .line 1359
    .line 1360
    const-string v5, ") durationMs="

    .line 1361
    .line 1362
    invoke-static {v3, v10, v7, v8, v5}, Lj8/b;->s(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 1363
    .line 1364
    .line 1365
    invoke-virtual {v3, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1366
    .line 1367
    .line 1368
    const-string v5, " coverTimeMs="

    .line 1369
    .line 1370
    const-string v7, " element="

    .line 1371
    .line 1372
    move-wide/from16 v10, v20

    .line 1373
    .line 1374
    invoke-static {v3, v5, v10, v11, v7}, Lj8/b;->s(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 1375
    .line 1376
    .line 1377
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1378
    .line 1379
    .line 1380
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1381
    .line 1382
    .line 1383
    move-result-object v3

    .line 1384
    invoke-virtual {v1, v3}, Lp8/d0;->l(Ljava/lang/String;)V

    .line 1385
    .line 1386
    .line 1387
    move-object/from16 v3, p3

    .line 1388
    .line 1389
    move-object/from16 v5, v17

    .line 1390
    .line 1391
    filled-new-array {v3, v5}, [Ljava/lang/Object;

    .line 1392
    .line 1393
    .line 1394
    move-result-object v5

    .line 1395
    invoke-static {v2, v5}, Lh/Hchat/utils/KavaReflector;->newInstanceByArgs(Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1396
    .line 1397
    .line 1398
    move-result-object v2

    .line 1399
    if-eqz v2, :cond_40

    .line 1400
    .line 1401
    :try_start_1b
    iget-object v5, v12, Lh/Hchat/dexkit/DexFinder;->snsSetContentMethod:Ljava/lang/reflect/Method;

    .line 1402
    .line 1403
    move-object/from16 v7, v16

    .line 1404
    .line 1405
    invoke-static {v2, v7, v5}, Lp8/d0;->j(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 1406
    .line 1407
    .line 1408
    if-eqz p6, :cond_37

    .line 1409
    .line 1410
    invoke-static/range {p6 .. p6}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1411
    .line 1412
    .line 1413
    move-result v5

    .line 1414
    if-eqz v5, :cond_36

    .line 1415
    .line 1416
    goto :goto_28

    .line 1417
    :cond_36
    iget-object v5, v12, Lh/Hchat/dexkit/DexFinder;->snsSetSdkIdMethod:Ljava/lang/reflect/Method;

    .line 1418
    .line 1419
    move-object/from16 v7, p6

    .line 1420
    .line 1421
    invoke-static {v2, v7, v5}, Lp8/d0;->j(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 1422
    .line 1423
    .line 1424
    goto :goto_28

    .line 1425
    :catchall_12
    move-exception v0

    .line 1426
    goto/16 :goto_2e

    .line 1427
    .line 1428
    :cond_37
    :goto_28
    if-eqz p7, :cond_39

    .line 1429
    .line 1430
    invoke-static/range {p7 .. p7}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1431
    .line 1432
    .line 1433
    move-result v5

    .line 1434
    if-eqz v5, :cond_38

    .line 1435
    .line 1436
    goto :goto_29

    .line 1437
    :cond_38
    iget-object v5, v12, Lh/Hchat/dexkit/DexFinder;->snsSetSdkAppNameMethod:Ljava/lang/reflect/Method;

    .line 1438
    .line 1439
    move-object/from16 v7, p7

    .line 1440
    .line 1441
    invoke-static {v2, v7, v5}, Lp8/d0;->j(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 1442
    .line 1443
    .line 1444
    :cond_39
    :goto_29
    iget-object v5, v0, Lp8/y;->b:Ljava/lang/reflect/Constructor;

    .line 1445
    .line 1446
    invoke-static/range {p5 .. p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1447
    .line 1448
    .line 1449
    move-result-object v7

    .line 1450
    filled-new-array {v6, v7}, [Ljava/lang/Object;

    .line 1451
    .line 1452
    .line 1453
    move-result-object v7

    .line 1454
    invoke-static {v5, v7}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1455
    .line 1456
    .line 1457
    move-result-object v5

    .line 1458
    if-eqz v5, :cond_3d

    .line 1459
    .line 1460
    iget-object v7, v0, Lp8/y;->b:Ljava/lang/reflect/Constructor;

    .line 1461
    .line 1462
    invoke-static/range {v23 .. v23}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1463
    .line 1464
    .line 1465
    move-result-object v8

    .line 1466
    filled-new-array {v4, v8}, [Ljava/lang/Object;

    .line 1467
    .line 1468
    .line 1469
    move-result-object v4

    .line 1470
    invoke-static {v7, v4}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1471
    .line 1472
    .line 1473
    move-result-object v4

    .line 1474
    if-eqz v4, :cond_3d

    .line 1475
    .line 1476
    iget-object v7, v0, Lp8/y;->c:Ljava/lang/reflect/Field;

    .line 1477
    .line 1478
    invoke-static {v7, v5, v4}, Lh/Hchat/utils/KavaReflector;->writeField(Ljava/lang/reflect/Field;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1479
    .line 1480
    .line 1481
    move-result v7

    .line 1482
    if-eqz v7, :cond_3f

    .line 1483
    .line 1484
    iget-object v7, v0, Lp8/y;->d:Ljava/lang/reflect/Field;

    .line 1485
    .line 1486
    invoke-static {v7, v4, v6}, Lh/Hchat/utils/KavaReflector;->writeField(Ljava/lang/reflect/Field;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1487
    .line 1488
    .line 1489
    move-result v6

    .line 1490
    if-eqz v6, :cond_3f

    .line 1491
    .line 1492
    iget-object v6, v0, Lp8/y;->e:Ljava/lang/reflect/Field;

    .line 1493
    .line 1494
    invoke-static {v6, v4, v3}, Lh/Hchat/utils/KavaReflector;->writeField(Ljava/lang/reflect/Field;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1495
    .line 1496
    .line 1497
    move-result v3

    .line 1498
    if-eqz v3, :cond_3f

    .line 1499
    .line 1500
    iget-object v3, v0, Lp8/y;->f:Ljava/lang/reflect/Field;

    .line 1501
    .line 1502
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1503
    .line 1504
    .line 1505
    move-result-object v6

    .line 1506
    invoke-static {v3, v4, v6}, Lh/Hchat/utils/KavaReflector;->writeField(Ljava/lang/reflect/Field;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1507
    .line 1508
    .line 1509
    move-result v3

    .line 1510
    if-eqz v3, :cond_3f

    .line 1511
    .line 1512
    new-instance v3, Ljava/util/ArrayList;

    .line 1513
    .line 1514
    const/4 v4, 0x1

    .line 1515
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 1516
    .line 1517
    .line 1518
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1519
    .line 1520
    .line 1521
    iget-object v4, v0, Lp8/y;->a:Ljava/lang/reflect/Method;

    .line 1522
    .line 1523
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 1524
    .line 1525
    .line 1526
    move-result-object v3

    .line 1527
    invoke-static {v4, v2, v3}, Lh/Hchat/utils/KavaReflector;->invokeOrThrow(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1528
    .line 1529
    .line 1530
    iget-object v0, v0, Lp8/y;->a:Ljava/lang/reflect/Method;

    .line 1531
    .line 1532
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1533
    .line 1534
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 1535
    .line 1536
    .line 1537
    const-string v4, "\u670b\u53cb\u5708\u5b9e\u51b5\u53d1\u5e03\u5a92\u4f53\u5165\u5e93\u5b8c\u6210: setUploadList="

    .line 1538
    .line 1539
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1540
    .line 1541
    .line 1542
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1543
    .line 1544
    .line 1545
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1546
    .line 1547
    .line 1548
    move-result-object v0

    .line 1549
    invoke-virtual {v1, v0}, Lp8/d0;->l(Ljava/lang/String;)V

    .line 1550
    .line 1551
    .line 1552
    iget-object v0, v12, Lh/Hchat/dexkit/DexFinder;->snsCommitMethod:Ljava/lang/reflect/Method;

    .line 1553
    .line 1554
    const/4 v7, 0x0

    .line 1555
    new-array v3, v7, [Ljava/lang/Object;

    .line 1556
    .line 1557
    invoke-static {v0, v2, v3}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1558
    .line 1559
    .line 1560
    move-result-object v0

    .line 1561
    instance-of v2, v0, Ljava/lang/Number;

    .line 1562
    .line 1563
    if-eqz v2, :cond_3a

    .line 1564
    .line 1565
    move-object v9, v0

    .line 1566
    check-cast v9, Ljava/lang/Number;

    .line 1567
    .line 1568
    goto :goto_2a

    .line 1569
    :cond_3a
    const/4 v9, 0x0

    .line 1570
    :goto_2a
    if-eqz v9, :cond_3b

    .line 1571
    .line 1572
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 1573
    .line 1574
    .line 1575
    move-result v7

    .line 1576
    goto :goto_2b

    .line 1577
    :cond_3b
    const/4 v7, 0x0

    .line 1578
    :goto_2b
    if-gtz v7, :cond_3e

    .line 1579
    .line 1580
    if-eqz v9, :cond_3c

    .line 1581
    .line 1582
    goto :goto_2c

    .line 1583
    :cond_3c
    const-string v9, "null"

    .line 1584
    .line 1585
    :goto_2c
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1586
    .line 1587
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 1588
    .line 1589
    .line 1590
    const-string v2, "\u670b\u53cb\u5708\u5b9e\u51b5\u53d1\u5e03\u5931\u8d25: commit\u8fd4\u56de="

    .line 1591
    .line 1592
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1593
    .line 1594
    .line 1595
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1596
    .line 1597
    .line 1598
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1599
    .line 1600
    .line 1601
    move-result-object v0

    .line 1602
    invoke-virtual {v1, v0}, Lp8/d0;->l(Ljava/lang/String;)V

    .line 1603
    .line 1604
    .line 1605
    :cond_3d
    :goto_2d
    const/4 v12, 0x0

    .line 1606
    goto :goto_2f

    .line 1607
    :cond_3e
    invoke-virtual {v1}, Lp8/d0;->t()Z

    .line 1608
    .line 1609
    .line 1610
    move-result v0

    .line 1611
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1612
    .line 1613
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 1614
    .line 1615
    .line 1616
    const-string v3, "\u670b\u53cb\u5708\u5b9e\u51b5\u53d1\u5e03\u63d0\u4ea4\u5b8c\u6210: localId="

    .line 1617
    .line 1618
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1619
    .line 1620
    .line 1621
    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1622
    .line 1623
    .line 1624
    const-string v3, " triggerUpload="

    .line 1625
    .line 1626
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1627
    .line 1628
    .line 1629
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 1630
    .line 1631
    .line 1632
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1633
    .line 1634
    .line 1635
    move-result-object v2

    .line 1636
    invoke-virtual {v1, v2}, Lp8/d0;->l(Ljava/lang/String;)V

    .line 1637
    .line 1638
    .line 1639
    move v12, v0

    .line 1640
    goto :goto_2f

    .line 1641
    :cond_3f
    const-string v0, "\u670b\u53cb\u5708\u5b9e\u51b5\u53d1\u5e03\u5931\u8d25: \u5b9e\u51b5\u5a92\u4f53\u5b57\u6bb5\u5199\u5165\u5931\u8d25"

    .line 1642
    .line 1643
    invoke-virtual {v1, v0}, Lp8/d0;->l(Ljava/lang/String;)V
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_12

    .line 1644
    .line 1645
    .line 1646
    goto :goto_2d

    .line 1647
    :goto_2e
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1648
    .line 1649
    .line 1650
    move-result-object v0

    .line 1651
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1652
    .line 1653
    const-string v3, "\u670b\u53cb\u5708\u5b9e\u51b5\u53d1\u5e03\u5f02\u5e38: "

    .line 1654
    .line 1655
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1656
    .line 1657
    .line 1658
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1659
    .line 1660
    .line 1661
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1662
    .line 1663
    .line 1664
    move-result-object v0

    .line 1665
    invoke-virtual {v1, v0}, Lp8/d0;->l(Ljava/lang/String;)V

    .line 1666
    .line 1667
    .line 1668
    goto :goto_2d

    .line 1669
    :cond_40
    const-string v0, "\u670b\u53cb\u5708\u5b9e\u51b5\u53d1\u5e03\u5931\u8d25: \u521b\u5efaUploadPackHelper\u5931\u8d25"

    .line 1670
    .line 1671
    invoke-virtual {v1, v0}, Lp8/d0;->l(Ljava/lang/String;)V

    .line 1672
    .line 1673
    .line 1674
    goto :goto_2d

    .line 1675
    :cond_41
    const-string v0, "\u670b\u53cb\u5708\u5b9e\u51b5\u53d1\u5e03\u5931\u8d25: \u5f53\u524d\u5fae\u4fe1\u6ca1\u6709\u5b9e\u51b5\u4e0a\u4f20\u5165\u53e3"

    .line 1676
    .line 1677
    invoke-virtual {v1, v0}, Lp8/d0;->l(Ljava/lang/String;)V

    .line 1678
    .line 1679
    .line 1680
    goto :goto_2d

    .line 1681
    :cond_42
    const-string v0, "\u670b\u53cb\u5708\u5b9e\u51b5\u53d1\u5e03\u5931\u8d25: \u5b9e\u51b5\u89c6\u9891\u65e0\u6548"

    .line 1682
    .line 1683
    invoke-virtual {v1, v0}, Lp8/d0;->l(Ljava/lang/String;)V

    .line 1684
    .line 1685
    .line 1686
    goto :goto_2d

    .line 1687
    :goto_2f
    return v12

    .line 1688
    :cond_43
    const/16 v22, 0x0

    .line 1689
    .line 1690
    return v22

    .line 1691
    :goto_30
    :try_start_1c
    monitor-exit v6
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_4

    .line 1692
    throw v0
.end method

.method public final w(Lorg/json/JSONObject;)Z
    .locals 12

    .line 1
    const-string v3, ""

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    const-string v7, ""

    .line 6
    .line 7
    const-wide/16 v1, 0x0

    .line 8
    .line 9
    const-string v6, ""

    .line 10
    .line 11
    move-object v4, v3

    .line 12
    move-object v5, v3

    .line 13
    move-object v0, p0

    .line 14
    invoke-virtual/range {v0 .. v7}, Lp8/d0;->v(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    return p1

    .line 19
    :cond_0
    const-string v0, "path"

    .line 20
    .line 21
    invoke-virtual {p1, v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const-string v1, "livePhotoPath"

    .line 26
    .line 27
    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const-string v1, "content"

    .line 32
    .line 33
    invoke-virtual {p1, v1, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    const-string v2, "picPath"

    .line 38
    .line 39
    invoke-virtual {p1, v2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    const-string v2, "imagePath"

    .line 44
    .line 45
    invoke-virtual {p1, v2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    const-string v0, "liveVideoPath"

    .line 50
    .line 51
    invoke-virtual {p1, v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    const-string v2, "videoPath"

    .line 56
    .line 57
    invoke-virtual {p1, v2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    const-string v0, "sdkId"

    .line 62
    .line 63
    invoke-virtual {p1, v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    const-string v0, "sdkAppName"

    .line 68
    .line 69
    invoke-virtual {p1, v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v7

    .line 73
    const-string v0, "coverTime"

    .line 74
    .line 75
    const-wide/16 v2, 0x0

    .line 76
    .line 77
    invoke-virtual {p1, v0, v2, v3}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 78
    .line 79
    .line 80
    move-result-wide v8

    .line 81
    const-string v0, "coverTimeMs"

    .line 82
    .line 83
    invoke-virtual {p1, v0, v8, v9}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 84
    .line 85
    .line 86
    move-result-wide v8

    .line 87
    cmp-long p1, v8, v2

    .line 88
    .line 89
    if-gez p1, :cond_1

    .line 90
    .line 91
    move-wide v10, v2

    .line 92
    move-object v3, v1

    .line 93
    move-wide v1, v10

    .line 94
    :goto_0
    move-object v0, p0

    .line 95
    goto :goto_1

    .line 96
    :cond_1
    move-object v3, v1

    .line 97
    move-wide v1, v8

    .line 98
    goto :goto_0

    .line 99
    :goto_1
    invoke-virtual/range {v0 .. v7}, Lp8/d0;->v(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    return p1
.end method

.method public final x(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 8

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    sget-object p2, Ltf/t;->g:Ltf/t;

    .line 4
    .line 5
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    :cond_1
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_3

    .line 19
    .line 20
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    if-eqz v1, :cond_2

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    invoke-static {v1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    goto :goto_1

    .line 41
    :cond_2
    const/4 v1, 0x0

    .line 42
    :goto_1
    if-eqz v1, :cond_1

    .line 43
    .line 44
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_3
    new-instance v6, Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 51
    .line 52
    .line 53
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    :cond_4
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eqz v0, :cond_5

    .line 62
    .line 63
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    move-object v1, v0

    .line 68
    check-cast v1, Ljava/lang/String;

    .line 69
    .line 70
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    xor-int/lit8 v1, v1, 0x1

    .line 75
    .line 76
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-eqz v1, :cond_4

    .line 85
    .line 86
    invoke-interface {v6, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_5
    const/4 v4, 0x0

    .line 91
    move-object v2, p0

    .line 92
    move-object v3, p1

    .line 93
    move-object v5, p3

    .line 94
    move-object v7, p4

    .line 95
    invoke-virtual/range {v2 .. v7}, Lp8/d0;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Z

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    return p1
.end method

.method public final y(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 6

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-static {p2}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p2, 0x0

    .line 13
    :goto_0
    if-nez p2, :cond_1

    .line 14
    .line 15
    const-string p2, ""

    .line 16
    .line 17
    :cond_1
    move-object v2, p2

    .line 18
    sget-object v4, Ltf/t;->g:Ltf/t;

    .line 19
    .line 20
    move-object v0, p0

    .line 21
    move-object v1, p1

    .line 22
    move-object v3, p3

    .line 23
    move-object v5, p4

    .line 24
    invoke-virtual/range {v0 .. v5}, Lp8/d0;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    return p1
.end method

.method public final z(Lorg/json/JSONObject;)Z
    .locals 5

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, v0, v0, v0, v0}, Lp8/d0;->y(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1

    .line 10
    :cond_0
    const-string v1, "path"

    .line 11
    .line 12
    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const-string v2, "videoPath"

    .line 17
    .line 18
    invoke-virtual {p1, v2, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const-string v2, "content"

    .line 23
    .line 24
    invoke-virtual {p1, v2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    const-string v3, "sdkId"

    .line 29
    .line 30
    invoke-virtual {p1, v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    const-string v4, "sdkAppName"

    .line 35
    .line 36
    invoke-virtual {p1, v4, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p0, v2, v1, v3, p1}, Lp8/d0;->y(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    return p1
.end method
