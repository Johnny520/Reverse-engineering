.class public abstract Ls6;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# static fields
.field public static final a:I

.field public static final b:I

.field public static final c:I

.field public static final d:I

.field public static final e:I

.field public static final f:I

.field public static final g:[Ljava/lang/String;

.field public static final h:Ljava/util/Map;

.field public static volatile i:Z

.field public static volatile j:Z

.field public static final k:Lcom/mr/elaris/c;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const/16 v0, 0x3a

    .line 2
    .line 3
    const/16 v1, 0x89

    .line 4
    .line 5
    const/16 v2, 0xf6

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Landroid/graphics/Color;->rgb(III)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    sput v0, Ls6;->a:I

    .line 12
    .line 13
    const/16 v0, 0x22

    .line 14
    .line 15
    const/16 v1, 0x2c

    .line 16
    .line 17
    const/16 v3, 0x1c

    .line 18
    .line 19
    invoke-static {v3, v0, v1}, Landroid/graphics/Color;->rgb(III)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    sput v0, Ls6;->b:I

    .line 24
    .line 25
    const/16 v0, 0x63

    .line 26
    .line 27
    const/16 v1, 0x70

    .line 28
    .line 29
    const/16 v3, 0x5d

    .line 30
    .line 31
    invoke-static {v3, v0, v1}, Landroid/graphics/Color;->rgb(III)I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    sput v0, Ls6;->c:I

    .line 36
    .line 37
    const/16 v0, 0xff

    .line 38
    .line 39
    invoke-static {v0, v0, v0}, Landroid/graphics/Color;->rgb(III)I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    sput v0, Ls6;->d:I

    .line 44
    .line 45
    const/16 v0, 0xe2

    .line 46
    .line 47
    const/16 v1, 0xee

    .line 48
    .line 49
    const/16 v3, 0xda

    .line 50
    .line 51
    invoke-static {v3, v0, v1}, Landroid/graphics/Color;->rgb(III)I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    sput v0, Ls6;->e:I

    .line 56
    .line 57
    const/16 v0, 0xea

    .line 58
    .line 59
    const/16 v1, 0xef

    .line 60
    .line 61
    invoke-static {v0, v1, v2}, Landroid/graphics/Color;->rgb(III)I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    sput v0, Ls6;->f:I

    .line 66
    .line 67
    const-string v0, "\u8e22\u51fa"

    .line 68
    .line 69
    const-string v1, "\u64a4\u56de\u8be5\u6210\u5458\u6d88\u606f"

    .line 70
    .line 71
    const-string v2, "\u8bbe\u7f6e\u5934\u8854"

    .line 72
    .line 73
    const-string v3, "\u7981\u8a00"

    .line 74
    .line 75
    const-string v4, "\u89e3\u7981"

    .line 76
    .line 77
    filled-new-array {v2, v3, v4, v0, v1}, [Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    sput-object v0, Ls6;->g:[Ljava/lang/String;

    .line 82
    .line 83
    new-instance v0, Ljava/util/WeakHashMap;

    .line 84
    .line 85
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 86
    .line 87
    .line 88
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    sput-object v0, Ls6;->h:Ljava/util/Map;

    .line 93
    .line 94
    new-instance v0, Lcom/mr/elaris/c;

    .line 95
    .line 96
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 97
    .line 98
    .line 99
    sput-object v0, Ls6;->k:Lcom/mr/elaris/c;

    .line 100
    .line 101
    return-void
.end method

.method public static A(Ljava/lang/Class;Ljava/lang/String;I)Ljava/lang/reflect/Method;
    .locals 3

    .line 1
    invoke-static {p0}, Ls6;->e(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    :goto_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-ge v0, v1, :cond_2

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Ljava/lang/reflect/Method;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-nez v2, :cond_0

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_0
    if-ltz p2, :cond_1

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    array-length v2, v2

    .line 36
    if-eq v2, p2, :cond_1

    .line 37
    .line 38
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    return-object v1

    .line 42
    :cond_2
    const/4 p0, 0x0

    .line 43
    return-object p0
.end method

.method public static A0(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/String;
    .locals 13

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const-string v1, ""

    .line 10
    .line 11
    if-eqz v0, :cond_5

    .line 12
    .line 13
    const-string v0, "u_"

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    goto/16 :goto_3

    .line 22
    .line 23
    :cond_0
    const-string v2, "com.tencent.relation.common.api.IRelationNTUinAndUidApi"

    .line 24
    .line 25
    invoke-static {p0, v2}, Ls6;->g0(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    const-string v3, " uid="

    .line 30
    .line 31
    const-string v4, "group avatar uin converted uin="

    .line 32
    .line 33
    const-class v5, Ljava/lang/String;

    .line 34
    .line 35
    const-string v6, "getUidFromUin"

    .line 36
    .line 37
    const/4 v7, 0x1

    .line 38
    if-eqz v2, :cond_3

    .line 39
    .line 40
    const-string v8, "getFriendUidFromUin"

    .line 41
    .line 42
    filled-new-array {v6, v8}, [Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v8

    .line 46
    const/4 v9, 0x0

    .line 47
    :goto_0
    const/4 v10, 0x2

    .line 48
    if-ge v9, v10, :cond_3

    .line 49
    .line 50
    :try_start_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    move-result-object v10

    .line 54
    aget-object v11, v8, v9

    .line 55
    .line 56
    filled-new-array {v5}, [Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    move-result-object v12

    .line 60
    invoke-virtual {v10, v11, v12}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 61
    .line 62
    .line 63
    move-result-object v10

    .line 64
    invoke-virtual {v10, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 65
    .line 66
    .line 67
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v11

    .line 71
    invoke-virtual {v10, v2, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v10

    .line 75
    if-nez v10, :cond_1

    .line 76
    .line 77
    move-object v10, v1

    .line 78
    goto :goto_1

    .line 79
    :cond_1
    invoke-static {v10}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v10

    .line 83
    :goto_1
    invoke-virtual {v10}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v10

    .line 87
    invoke-virtual {v10, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 88
    .line 89
    .line 90
    move-result v11

    .line 91
    if-eqz v11, :cond_2

    .line 92
    .line 93
    new-instance v11, Ljava/lang/StringBuilder;

    .line 94
    .line 95
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v11, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v11

    .line 114
    invoke-static {v11}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 115
    .line 116
    .line 117
    return-object v10

    .line 118
    :catchall_0
    :cond_2
    add-int/lit8 v9, v9, 0x1

    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_3
    const-string v2, "com.tencent.qqnt.ntrelation.friendsinfo.api.IFriendsInfoService"

    .line 122
    .line 123
    invoke-static {p0, v2}, Ls6;->g0(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    if-eqz p0, :cond_5

    .line 128
    .line 129
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    filled-new-array {v5}, [Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    move-result-object v5

    .line 137
    invoke-virtual {v2, v6, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    invoke-virtual {v2, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 142
    .line 143
    .line 144
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v5

    .line 148
    invoke-virtual {v2, p0, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    if-nez p0, :cond_4

    .line 153
    .line 154
    move-object p0, v1

    .line 155
    goto :goto_2

    .line 156
    :cond_4
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    :goto_2
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    if-eqz v0, :cond_5

    .line 169
    .line 170
    new-instance v0, Ljava/lang/StringBuilder;

    .line 171
    .line 172
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    invoke-static {p1}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 192
    .line 193
    .line 194
    return-object p0

    .line 195
    :catchall_1
    :cond_5
    :goto_3
    return-object v1
.end method

.method public static B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_3

    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-static {v1}, Ls6;->e(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const/4 v2, 0x0

    .line 13
    :goto_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-ge v2, v3, :cond_3

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    check-cast v3, Ljava/lang/reflect/Method;

    .line 24
    .line 25
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    array-length v4, v4

    .line 30
    if-nez v4, :cond_2

    .line 31
    .line 32
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    invoke-static {v4}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-eqz v4, :cond_0

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_0
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    if-eqz v4, :cond_2

    .line 48
    .line 49
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    const-string v5, "IKernelGroupService"

    .line 54
    .line 55
    invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    if-nez v4, :cond_1

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_1
    const/4 v4, 0x1

    .line 63
    :try_start_0
    invoke-virtual {v3, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v3, p0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    if-eqz v3, :cond_2

    .line 71
    .line 72
    return-object v3

    .line 73
    :catchall_0
    :cond_2
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_3
    return-object v0
.end method

.method public static B0(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, ""

    .line 6
    .line 7
    if-eqz v0, :cond_4

    .line 8
    .line 9
    const-string v0, "u_"

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto/16 :goto_2

    .line 18
    .line 19
    :cond_0
    const-string v0, "com.tencent.relation.common.api.IRelationNTUinAndUidApi"

    .line 20
    .line 21
    invoke-static {p0, v0}, Ls6;->g0(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    if-nez p0, :cond_1

    .line 26
    .line 27
    goto :goto_2

    .line 28
    :cond_1
    const-string v0, "getUinByUid"

    .line 29
    .line 30
    const-string v2, "getUin"

    .line 31
    .line 32
    const-string v3, "getUinFromUid"

    .line 33
    .line 34
    filled-new-array {v3, v0, v2}, [Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const/4 v2, 0x0

    .line 39
    :goto_0
    const/4 v3, 0x3

    .line 40
    if-ge v2, v3, :cond_4

    .line 41
    .line 42
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    aget-object v4, v0, v2

    .line 47
    .line 48
    const-class v5, Ljava/lang/String;

    .line 49
    .line 50
    filled-new-array {v5}, [Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    invoke-virtual {v3, v4, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    const/4 v4, 0x1

    .line 59
    invoke-virtual {v3, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 60
    .line 61
    .line 62
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    invoke-virtual {v3, p0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    if-nez v3, :cond_2

    .line 71
    .line 72
    move-object v3, v1

    .line 73
    goto :goto_1

    .line 74
    :cond_2
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    :goto_1
    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    if-lez v4, :cond_3

    .line 87
    .line 88
    const-string v4, "0"

    .line 89
    .line 90
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    if-nez v4, :cond_3

    .line 95
    .line 96
    const-string v4, "null"

    .line 97
    .line 98
    invoke-virtual {v4, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    if-nez v4, :cond_3

    .line 103
    .line 104
    new-instance v4, Ljava/lang/StringBuilder;

    .line 105
    .line 106
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 107
    .line 108
    .line 109
    const-string v5, "group avatar uid converted uid="

    .line 110
    .line 111
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    const-string v5, " uin="

    .line 118
    .line 119
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    invoke-static {v4}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 130
    .line 131
    .line 132
    return-object v3

    .line 133
    :catchall_0
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 134
    .line 135
    goto :goto_0

    .line 136
    :cond_4
    :goto_2
    return-object v1
.end method

.method public static varargs C(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    if-eqz p0, :cond_5

    .line 4
    .line 5
    array-length v1, p1

    .line 6
    const/4 v2, 0x0

    .line 7
    :goto_0
    if-ge v2, v1, :cond_5

    .line 8
    .line 9
    aget-object v3, p1, v2

    .line 10
    .line 11
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    :goto_1
    if-eqz v4, :cond_1

    .line 16
    .line 17
    const-class v5, Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    if-eq v4, v5, :cond_1

    .line 20
    .line 21
    :try_start_1
    invoke-virtual {v4, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    const/4 v6, 0x1

    .line 26
    invoke-virtual {v5, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v5, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    if-nez v5, :cond_0

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_0
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v4
    :try_end_1
    .catch Ljava/lang/NoSuchFieldException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 44
    goto :goto_3

    .line 45
    :catch_0
    :try_start_2
    invoke-virtual {v4}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    move-result-object v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 49
    goto :goto_1

    .line 50
    :catchall_0
    :cond_1
    :goto_2
    move-object v4, v0

    .line 51
    :goto_3
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    if-lez v5, :cond_2

    .line 56
    .line 57
    return-object v4

    .line 58
    :cond_2
    :try_start_3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    const/4 v5, 0x0

    .line 63
    invoke-virtual {v4, v3, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-virtual {v3, p0, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    if-nez v3, :cond_3

    .line 72
    .line 73
    :catchall_1
    move-object v3, v0

    .line 74
    goto :goto_4

    .line 75
    :cond_3
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 83
    :goto_4
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    if-lez v4, :cond_4

    .line 88
    .line 89
    return-object v3

    .line 90
    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_5
    return-object v0
.end method

.method public static C0(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    .locals 2

    .line 1
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
    :cond_0
    return-object p0
.end method

.method public static D(Ljava/lang/Object;)Lb7;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_2

    .line 6
    .line 7
    :cond_0
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, "troopUin"

    .line 12
    .line 13
    const-string v3, "groupUin"

    .line 14
    .line 15
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-static {v1, v2}, Ls6;->E0(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    const-string v3, "type"

    .line 24
    .line 25
    const-string v4, "chatType"

    .line 26
    .line 27
    filled-new-array {v3, v4}, [Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    invoke-static {v1, v5}, Ls6;->E0(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    const/4 v6, -0x1

    .line 36
    :try_start_0
    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    move-result v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    goto :goto_0

    .line 45
    :catchall_0
    move v5, v6

    .line 46
    :goto_0
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 47
    .line 48
    .line 49
    move-result v7

    .line 50
    const/4 v8, 0x4

    .line 51
    const/4 v9, 0x2

    .line 52
    const/4 v10, 0x5

    .line 53
    if-lt v7, v10, :cond_3

    .line 54
    .line 55
    new-instance v0, Lb7;

    .line 56
    .line 57
    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    if-eq v5, v9, :cond_2

    .line 62
    .line 63
    if-ne v5, v8, :cond_1

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_1
    move v5, v9

    .line 67
    :cond_2
    :goto_1
    invoke-direct {v0, v1, v5}, Lb7;-><init>(Ljava/lang/String;I)V

    .line 68
    .line 69
    .line 70
    return-object v0

    .line 71
    :cond_3
    const-string v2, "peerId"

    .line 72
    .line 73
    const-string v7, "peerUid"

    .line 74
    .line 75
    const-string v11, "peerUin"

    .line 76
    .line 77
    filled-new-array {v2, v7, v11}, [Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-static {v1, v2}, Ls6;->E0(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    if-lt v2, v10, :cond_5

    .line 90
    .line 91
    if-eq v5, v9, :cond_4

    .line 92
    .line 93
    if-ne v5, v8, :cond_5

    .line 94
    .line 95
    :cond_4
    new-instance v0, Lb7;

    .line 96
    .line 97
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-direct {v0, v1, v5}, Lb7;-><init>(Ljava/lang/String;I)V

    .line 102
    .line 103
    .line 104
    return-object v0

    .line 105
    :cond_5
    const-string v16, "troopuin"

    .line 106
    .line 107
    const-string v17, "groupuin"

    .line 108
    .line 109
    const-string v12, "troopUin"

    .line 110
    .line 111
    const-string v13, "groupUin"

    .line 112
    .line 113
    const-string v14, "mTroopUin"

    .line 114
    .line 115
    const-string v15, "mGroupUin"

    .line 116
    .line 117
    filled-new-array/range {v12 .. v17}, [Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-static {v0, v1}, Ls6;->C(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    const-string v2, "guildId"

    .line 126
    .line 127
    const-string v5, "guildID"

    .line 128
    .line 129
    filled-new-array {v2, v5}, [Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    invoke-static {v0, v2}, Ls6;->C(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    const-string v2, "d"

    .line 137
    .line 138
    const-string v5, "a"

    .line 139
    .line 140
    filled-new-array {v4, v3, v2, v5}, [Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    invoke-static {v0, v2}, Ls6;->C(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    :try_start_1
    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 153
    .line 154
    .line 155
    move-result v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 156
    :catchall_1
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 157
    .line 158
    .line 159
    move-result v2

    .line 160
    if-lt v2, v10, :cond_8

    .line 161
    .line 162
    new-instance v0, Lb7;

    .line 163
    .line 164
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    if-eq v6, v9, :cond_6

    .line 169
    .line 170
    if-ne v6, v8, :cond_7

    .line 171
    .line 172
    :cond_6
    move v9, v6

    .line 173
    :cond_7
    invoke-direct {v0, v1, v9}, Lb7;-><init>(Ljava/lang/String;I)V

    .line 174
    .line 175
    .line 176
    return-object v0

    .line 177
    :cond_8
    if-eq v6, v9, :cond_9

    .line 178
    .line 179
    if-ne v6, v8, :cond_a

    .line 180
    .line 181
    :cond_9
    const-string v1, "uin"

    .line 182
    .line 183
    const-string v2, "e"

    .line 184
    .line 185
    const-string v3, "uid"

    .line 186
    .line 187
    filled-new-array {v7, v11, v3, v1, v2}, [Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    invoke-static {v0, v1}, Ls6;->C(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 196
    .line 197
    .line 198
    move-result v1

    .line 199
    if-lt v1, v10, :cond_a

    .line 200
    .line 201
    new-instance v1, Lb7;

    .line 202
    .line 203
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    invoke-direct {v1, v0, v6}, Lb7;-><init>(Ljava/lang/String;I)V

    .line 208
    .line 209
    .line 210
    return-object v1

    .line 211
    :cond_a
    :goto_2
    const/4 v0, 0x0

    .line 212
    return-object v0
.end method

.method public static D0(Z)V
    .locals 2

    .line 1
    sget-boolean v0, Ls6;->j:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    sget-boolean v0, Ls6;->i:Z

    .line 7
    .line 8
    if-eq v0, p0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    goto :goto_1

    .line 13
    :cond_1
    :goto_0
    move v0, v1

    .line 14
    :goto_1
    sput-boolean p0, Ls6;->i:Z

    .line 15
    .line 16
    sput-boolean v1, Ls6;->j:Z

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    new-instance v0, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v1, "group avatar menu switch loaded="

    .line 23
    .line 24
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :cond_2
    return-void
.end method

.method public static E(Lb7;)Ljava/lang/String;
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lb7;->c:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_1

    .line 13
    .line 14
    iget-object p0, p0, Lb7;->b:Ljava/lang/Object;

    .line 15
    .line 16
    move-object v0, p0

    .line 17
    check-cast v0, Ljava/lang/String;

    .line 18
    .line 19
    :cond_1
    invoke-static {v0}, Ls6;->P(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-eqz p0, :cond_2

    .line 24
    .line 25
    :goto_0
    const-string p0, ""

    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_2
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method

.method public static varargs E0(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    .line 1
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    array-length v1, p1

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_9

    .line 10
    .line 11
    aget-object v3, p1, v2

    .line 12
    .line 13
    if-eqz v3, :cond_8

    .line 14
    .line 15
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    if-nez v4, :cond_0

    .line 20
    .line 21
    goto/16 :goto_4

    .line 22
    .line 23
    :cond_0
    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 24
    .line 25
    invoke-virtual {v3, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-virtual {v0, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    :goto_1
    if-ltz v4, :cond_8

    .line 34
    .line 35
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    add-int/2addr v5, v4

    .line 40
    :goto_2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 41
    .line 42
    .line 43
    move-result v6

    .line 44
    if-ge v5, v6, :cond_2

    .line 45
    .line 46
    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    const/16 v7, 0x3a

    .line 51
    .line 52
    if-eq v6, v7, :cond_1

    .line 53
    .line 54
    const/16 v7, 0x3d

    .line 55
    .line 56
    if-eq v6, v7, :cond_1

    .line 57
    .line 58
    const/16 v7, 0x20

    .line 59
    .line 60
    if-eq v6, v7, :cond_1

    .line 61
    .line 62
    const/16 v7, 0x22

    .line 63
    .line 64
    if-eq v6, v7, :cond_1

    .line 65
    .line 66
    const/16 v7, 0x27

    .line 67
    .line 68
    if-eq v6, v7, :cond_1

    .line 69
    .line 70
    const/16 v7, 0x7b

    .line 71
    .line 72
    if-eq v6, v7, :cond_1

    .line 73
    .line 74
    const/16 v7, 0x5b

    .line 75
    .line 76
    if-ne v6, v7, :cond_2

    .line 77
    .line 78
    :cond_1
    add-int/lit8 v5, v5, 0x1

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_2
    new-instance v6, Ljava/lang/StringBuilder;

    .line 82
    .line 83
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 84
    .line 85
    .line 86
    :goto_3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 87
    .line 88
    .line 89
    move-result v7

    .line 90
    if-ge v5, v7, :cond_6

    .line 91
    .line 92
    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    .line 93
    .line 94
    .line 95
    move-result v7

    .line 96
    const/16 v8, 0x30

    .line 97
    .line 98
    if-lt v7, v8, :cond_3

    .line 99
    .line 100
    const/16 v8, 0x39

    .line 101
    .line 102
    if-le v7, v8, :cond_5

    .line 103
    .line 104
    :cond_3
    const/16 v8, 0x5f

    .line 105
    .line 106
    if-eq v7, v8, :cond_5

    .line 107
    .line 108
    const/16 v8, 0x2d

    .line 109
    .line 110
    if-eq v7, v8, :cond_5

    .line 111
    .line 112
    const/16 v8, 0x61

    .line 113
    .line 114
    if-lt v7, v8, :cond_4

    .line 115
    .line 116
    const/16 v8, 0x7a

    .line 117
    .line 118
    if-le v7, v8, :cond_5

    .line 119
    .line 120
    :cond_4
    const/16 v8, 0x41

    .line 121
    .line 122
    if-lt v7, v8, :cond_6

    .line 123
    .line 124
    const/16 v8, 0x5a

    .line 125
    .line 126
    if-gt v7, v8, :cond_6

    .line 127
    .line 128
    :cond_5
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    add-int/lit8 v5, v5, 0x1

    .line 132
    .line 133
    goto :goto_3

    .line 134
    :cond_6
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v5

    .line 138
    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v5

    .line 142
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 143
    .line 144
    .line 145
    move-result v6

    .line 146
    if-lez v6, :cond_7

    .line 147
    .line 148
    return-object v5

    .line 149
    :cond_7
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 150
    .line 151
    .line 152
    move-result v5

    .line 153
    add-int/2addr v5, v4

    .line 154
    invoke-virtual {v0, v3, v5}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    .line 155
    .line 156
    .line 157
    move-result v4

    .line 158
    goto :goto_1

    .line 159
    :cond_8
    :goto_4
    add-int/lit8 v2, v2, 0x1

    .line 160
    .line 161
    goto/16 :goto_0

    .line 162
    .line 163
    :cond_9
    const-string p0, ""

    .line 164
    .line 165
    return-object p0
.end method

.method public static F(Ljava/lang/Object;)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-static {p0}, Ls6;->D(Ljava/lang/Object;)Lb7;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {v0}, Ls6;->E(Lb7;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    if-nez p0, :cond_1

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_1
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    const-string v0, "troopUin"

    .line 20
    .line 21
    const-string v1, "groupUin"

    .line 22
    .line 23
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {p0, v0}, Ls6;->E0(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    const/4 v2, 0x5

    .line 36
    if-lt v1, v2, :cond_2

    .line 37
    .line 38
    invoke-static {v0}, Ls6;->P(Ljava/lang/String;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-nez v1, :cond_2

    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :cond_2
    const-string v0, "peerUid"

    .line 50
    .line 51
    const-string v1, "peerUin"

    .line 52
    .line 53
    const-string v3, "peerId"

    .line 54
    .line 55
    filled-new-array {v3, v0, v1}, [Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-static {p0, v0}, Ls6;->E0(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    const-string v1, "type"

    .line 64
    .line 65
    const-string v3, "chatType"

    .line 66
    .line 67
    filled-new-array {v1, v3}, [Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-static {p0, v1}, Ls6;->E0(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 80
    .line 81
    .line 82
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    goto :goto_0

    .line 84
    :catchall_0
    const/4 p0, -0x1

    .line 85
    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    if-lt v1, v2, :cond_4

    .line 90
    .line 91
    const/4 v1, 0x2

    .line 92
    if-eq p0, v1, :cond_3

    .line 93
    .line 94
    const/4 v1, 0x4

    .line 95
    if-ne p0, v1, :cond_4

    .line 96
    .line 97
    :cond_3
    invoke-static {v0}, Ls6;->P(Ljava/lang/String;)Z

    .line 98
    .line 99
    .line 100
    move-result p0

    .line 101
    if-nez p0, :cond_4

    .line 102
    .line 103
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    return-object p0

    .line 108
    :cond_4
    :goto_1
    const-string p0, ""

    .line 109
    .line 110
    return-object p0
.end method

.method public static F0(Ljava/lang/Class;)Ljava/lang/Class;
    .locals 1

    .line 1
    if-eqz p0, :cond_9

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 11
    .line 12
    if-ne p0, v0, :cond_1

    .line 13
    .line 14
    const-class p0, Ljava/lang/Integer;

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_1
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 18
    .line 19
    if-ne p0, v0, :cond_2

    .line 20
    .line 21
    const-class p0, Ljava/lang/Long;

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_2
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 25
    .line 26
    if-ne p0, v0, :cond_3

    .line 27
    .line 28
    const-class p0, Ljava/lang/Boolean;

    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_3
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 32
    .line 33
    if-ne p0, v0, :cond_4

    .line 34
    .line 35
    const-class p0, Ljava/lang/Short;

    .line 36
    .line 37
    return-object p0

    .line 38
    :cond_4
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 39
    .line 40
    if-ne p0, v0, :cond_5

    .line 41
    .line 42
    const-class p0, Ljava/lang/Byte;

    .line 43
    .line 44
    return-object p0

    .line 45
    :cond_5
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 46
    .line 47
    if-ne p0, v0, :cond_6

    .line 48
    .line 49
    const-class p0, Ljava/lang/Float;

    .line 50
    .line 51
    return-object p0

    .line 52
    :cond_6
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 53
    .line 54
    if-ne p0, v0, :cond_7

    .line 55
    .line 56
    const-class p0, Ljava/lang/Double;

    .line 57
    .line 58
    return-object p0

    .line 59
    :cond_7
    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 60
    .line 61
    if-ne p0, v0, :cond_8

    .line 62
    .line 63
    const-class p0, Ljava/lang/Character;

    .line 64
    .line 65
    return-object p0

    .line 66
    :cond_8
    const-class p0, Ljava/lang/Void;

    .line 67
    .line 68
    return-object p0

    .line 69
    :cond_9
    :goto_0
    if-nez p0, :cond_a

    .line 70
    .line 71
    const-class p0, Ljava/lang/Object;

    .line 72
    .line 73
    :cond_a
    return-object p0
.end method

.method public static G(Ljava/lang/Object;Ljava/lang/String;)Z
    .locals 1

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const/4 v0, -0x1

    .line 8
    invoke-static {p0, p1, v0}, Ls6;->A(Ljava/lang/Class;Ljava/lang/String;I)Ljava/lang/reflect/Method;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    const/4 p0, 0x1

    .line 15
    return p0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return p0
.end method

.method public static G0(Landroid/content/Context;Landroid/widget/LinearLayout;)Landroid/widget/FrameLayout;
    .locals 5

    .line 1
    new-instance v0, Landroid/widget/FrameLayout;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 8
    .line 9
    .line 10
    const/high16 v1, 0x3f800000    # 1.0f

    .line 11
    .line 12
    invoke-static {p0, v1}, Ls6;->u(Landroid/content/Context;F)I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    invoke-static {p0, v1}, Ls6;->u(Landroid/content/Context;F)I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    invoke-static {p0, v1}, Ls6;->u(Landroid/content/Context;F)I

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    invoke-static {p0, v1}, Ls6;->u(Landroid/content/Context;F)I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    invoke-virtual {v0, v2, v3, v4, p0}, Landroid/view/View;->setPadding(IIII)V

    .line 29
    .line 30
    .line 31
    new-instance p0, Landroid/widget/FrameLayout$LayoutParams;

    .line 32
    .line 33
    const/4 v1, -0x1

    .line 34
    const/4 v2, -0x2

    .line 35
    invoke-direct {p0, v1, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 36
    .line 37
    .line 38
    const/16 v1, 0x11

    .line 39
    .line 40
    iput v1, p0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 41
    .line 42
    invoke-virtual {v0, p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 43
    .line 44
    .line 45
    return-object v0
.end method

.method public static H(Landroid/app/Activity;)Ljava/lang/ClassLoader;
    .locals 1

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 4
    .line 5
    .line 6
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-object v0

    .line 10
    :catchall_0
    :cond_0
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 15
    .line 16
    .line 17
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 18
    if-eqz p0, :cond_1

    .line 19
    .line 20
    return-object p0

    .line 21
    :catchall_1
    :cond_1
    const-class p0, Ls6;

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method

.method public static H0(Ljava/io/ByteArrayOutputStream;J)V
    .locals 4

    .line 1
    :goto_0
    const-wide/16 v0, -0x80

    .line 2
    .line 3
    and-long/2addr v0, p1

    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v0, v0, v2

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const-wide/16 v0, 0x7f

    .line 11
    .line 12
    and-long/2addr v0, p1

    .line 13
    const-wide/16 v2, 0x80

    .line 14
    .line 15
    or-long/2addr v0, v2

    .line 16
    long-to-int v0, v0

    .line 17
    invoke-virtual {p0, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x7

    .line 21
    ushr-long/2addr p1, v0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    long-to-int p1, p1

    .line 24
    invoke-virtual {p0, p1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public static I(Ljava/lang/ClassLoader;)V
    .locals 6

    .line 1
    const-string v0, "group avatar listener hook installed method="

    .line 2
    .line 3
    sget-object v1, Ls6;->k:Lcom/mr/elaris/c;

    .line 4
    .line 5
    sget-object v2, Lv6;->a:[Ljava/lang/String;

    .line 6
    .line 7
    const-string v2, "group avatar listener hook failed reason="

    .line 8
    .line 9
    const-class v3, Lv6;

    .line 10
    .line 11
    monitor-enter v3

    .line 12
    :try_start_0
    sget-boolean v4, Lv6;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 13
    .line 14
    if-nez v4, :cond_2

    .line 15
    .line 16
    if-eqz p0, :cond_2

    .line 17
    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    goto/16 :goto_2

    .line 21
    .line 22
    :cond_0
    :try_start_1
    const-string v4, "group avatar listener hook install start"

    .line 23
    .line 24
    invoke-static {v4}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const-string v4, "com.tencent.mobileqq.aio.msglist.holder.component.avatar.AIOAvatarContentComponent"

    .line 28
    .line 29
    invoke-static {v4, p0}, Lcom/mr/elaris/xposedcompat/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    invoke-static {p0, v4}, Lv6;->a(Ljava/lang/ClassLoader;Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    if-nez p0, :cond_1

    .line 38
    .line 39
    const-string p0, "group avatar listener hook skipped reason=listener missing"

    .line 40
    .line 41
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    .line 43
    .line 44
    monitor-exit v3

    .line 45
    return-void

    .line 46
    :catchall_0
    move-exception p0

    .line 47
    goto :goto_0

    .line 48
    :cond_1
    const/4 v4, 0x1

    .line 49
    :try_start_2
    invoke-virtual {p0, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 50
    .line 51
    .line 52
    new-instance v5, Lt6;

    .line 53
    .line 54
    invoke-direct {v5, v1}, Lt6;-><init>(Lcom/mr/elaris/c;)V

    .line 55
    .line 56
    .line 57
    invoke-static {p0, v5}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;

    .line 58
    .line 59
    .line 60
    sput-boolean v4, Lv6;->c:Z

    .line 61
    .line 62
    new-instance v1, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    const-string v4, "#"

    .line 79
    .line 80
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    const-string p0, "(android.view.View)->boolean"

    .line 91
    .line 92
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 104
    .line 105
    .line 106
    goto :goto_1

    .line 107
    :goto_0
    :try_start_3
    const-string v0, "group-avatar"

    .line 108
    .line 109
    const-string v1, "install-listener"

    .line 110
    .line 111
    invoke-static {v0, v1, p0}, Le7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 112
    .line 113
    .line 114
    new-instance v0, Ljava/lang/StringBuilder;

    .line 115
    .line 116
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    const-string v1, ": "

    .line 131
    .line 132
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 147
    .line 148
    .line 149
    :goto_1
    monitor-exit v3

    .line 150
    return-void

    .line 151
    :catchall_1
    move-exception p0

    .line 152
    goto :goto_3

    .line 153
    :cond_2
    :goto_2
    monitor-exit v3

    .line 154
    return-void

    .line 155
    :goto_3
    :try_start_4
    monitor-exit v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 156
    throw p0
.end method

.method public static J(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Z
    .locals 50

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v9, p3

    .line 1
    invoke-static {v1}, Ls6;->H(Landroid/app/Activity;)Ljava/lang/ClassLoader;

    move-result-object v12

    .line 2
    const-string v13, "\u7981\u8a00"

    invoke-virtual {v13, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v3, " reason=kernel group service null"

    const-string v4, " reason=target uid unresolved target="

    const-string v5, " reason=bad groupCode "

    const-string v7, "u_"

    const-string v14, " reason=ITroopMemberOperationRepoApi null"

    const-string v15, " targetUid="

    const-string v6, "\u8e22\u51fa"

    const-class v10, Ljava/lang/Long;

    const/16 v20, 0x3

    const-class v11, Ljava/lang/String;

    move-object/from16 v21, v10

    const-string v10, "com.tencent.qqnt.troop.ITroopMemberOperationRepoApi"

    move-object/from16 v22, v13

    const-string v13, ": "

    move-object/from16 v23, v3

    const-string v3, "\u89e3\u7981"

    move-object/from16 v24, v4

    const-string v4, " target="

    move-object/from16 v25, v5

    const-string v5, " method="

    const-string v8, "group action invoked class="

    move-object/from16 v27, v4

    const-string v4, " reason="

    const-wide/16 v28, 0x0

    move-object/from16 v30, v4

    const-string v4, "group action failed type="

    move-object/from16 v31, v5

    const/16 v32, 0x0

    if-nez v0, :cond_19

    invoke-virtual {v3, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move-object/from16 v34, v3

    move-object/from16 v36, v6

    move-object/from16 v35, v10

    move-object/from16 v2, v23

    move-object/from16 v5, v24

    move-object/from16 v3, v25

    move-object/from16 v1, v31

    move-object v10, v8

    move-object/from16 v25, v11

    move-object/from16 v11, v22

    move-object/from16 v31, v27

    move-object/from16 v8, p2

    goto/16 :goto_18

    .line 3
    :cond_0
    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_18

    .line 4
    invoke-static {v12, v10}, Ls6;->g0(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_1

    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    move-object/from16 v34, v3

    move-object/from16 v36, v6

    move-object/from16 v35, v10

    move-object/from16 v7, v30

    move-object/from16 v14, v31

    move-object v10, v8

    move-object/from16 v31, v27

    move-object/from16 v8, p2

    goto/16 :goto_11

    .line 6
    :cond_1
    const-string v0, "b"

    const-string v14, "a"

    move-object/from16 v34, v3

    const-string v3, "group action delete param groupUin="

    :try_start_0
    const-string v35, "com.tencent.qqnt.bean.b"
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_6

    move-object/from16 v36, v6

    :try_start_1
    filled-new-array/range {v35 .. v35}, [Ljava/lang/String;

    move-result-object v6

    invoke-static {v12, v6}, Ls6;->y(Ljava/lang/ClassLoader;[Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    if-nez v6, :cond_2

    move-object/from16 v39, v5

    move-object/from16 v37, v8

    move-object/from16 v35, v10

    :goto_0
    const/4 v6, 0x0

    goto/16 :goto_8

    .line 7
    :cond_2
    invoke-virtual {v6}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v6

    .line 8
    invoke-static {v6, v14, v2}, Ls6;->p0(Ljava/lang/Object;Ljava/lang/String;Ljava/io/Serializable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_5

    move-object/from16 v35, v10

    .line 9
    :try_start_2
    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v6, v0, v10}, Ls6;->p0(Ljava/lang/Object;Ljava/lang/String;Ljava/io/Serializable;)V

    .line 10
    invoke-static/range {p2 .. p2}, Ls6;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 11
    invoke-virtual {v10, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v37

    if-eqz v37, :cond_3

    move-object/from16 v38, v10

    goto :goto_1

    :cond_3
    invoke-static {v12, v10}, Ls6;->A0(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v37

    move-object/from16 v38, v37

    .line 12
    :goto_1
    invoke-virtual {v10, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v37

    if-eqz v37, :cond_4

    invoke-static {v12, v10}, Ls6;->B0(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_4
    move-object/from16 v37, v8

    goto :goto_2

    :catchall_0
    move-exception v0

    move-object/from16 v39, v5

    move-object/from16 v37, v8

    goto/16 :goto_7

    .line 13
    :goto_2
    :try_start_3
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v8
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    move-object/from16 v39, v5

    const/4 v5, 0x5

    if-lt v8, v5, :cond_5

    :try_start_4
    invoke-virtual {v10, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_5

    .line 14
    filled-new-array {v11}, [Ljava/lang/Class;

    move-result-object v5

    filled-new-array {v10}, [Ljava/lang/Object;

    move-result-object v7
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    if-eqz v6, :cond_5

    .line 15
    :try_start_5
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v8

    invoke-virtual {v8, v0, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    const/4 v5, 0x1

    .line 16
    invoke-virtual {v0, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 17
    invoke-virtual {v0, v6, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto :goto_3

    :catchall_1
    move-exception v0

    goto :goto_7

    .line 18
    :catchall_2
    :cond_5
    :goto_3
    :try_start_6
    invoke-virtual/range {v38 .. v38}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_7

    .line 19
    filled-new-array {v11, v11}, [Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_6

    move-object v5, v10

    move-object/from16 v7, v38

    goto :goto_4

    :cond_6
    move-object/from16 v5, v38

    move-object v7, v5

    :goto_4
    filled-new-array {v7, v5}, [Ljava/lang/Object;

    move-result-object v5
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    if-eqz v6, :cond_8

    .line 20
    :try_start_7
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v8

    invoke-virtual {v8, v14, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    const/4 v8, 0x1

    .line 21
    invoke-virtual {v0, v8}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 22
    invoke-virtual {v0, v6, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    goto :goto_5

    :cond_7
    move-object/from16 v7, v38

    .line 23
    :catchall_3
    :cond_8
    :goto_5
    :try_start_8
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " targetUin="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    goto :goto_8

    :catchall_4
    move-exception v0

    move-object/from16 v39, v5

    goto :goto_7

    :catchall_5
    move-exception v0

    move-object/from16 v39, v5

    :goto_6
    move-object/from16 v37, v8

    move-object/from16 v35, v10

    goto :goto_7

    :catchall_6
    move-exception v0

    move-object/from16 v39, v5

    move-object/from16 v36, v6

    goto :goto_6

    .line 24
    :goto_7
    invoke-static {v0}, Ls6;->C0(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object v0

    .line 25
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v5, "group action failed type=\u8e22\u51fa reason=DeleteTroopMemberParam "

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 26
    invoke-static {v0, v3, v13}, La;->d(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    goto/16 :goto_0

    :goto_8
    if-nez v6, :cond_9

    .line 27
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " reason=DeleteTroopMemberParam null"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    move-object/from16 v8, p2

    move-object/from16 v7, v30

    move-object/from16 v14, v31

    move-object/from16 v10, v37

    move-object/from16 v31, v27

    goto/16 :goto_11

    .line 28
    :cond_9
    invoke-virtual/range {v39 .. v39}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Ls6;->e(Ljava/lang/Class;)Ljava/util/ArrayList;

    move-result-object v3

    move/from16 v5, v32

    .line 29
    :goto_9
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v5, v0, :cond_e

    .line 30
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/reflect/Method;

    .line 31
    const-string v0, "deleteTroopMember"

    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getModifiers()I

    move-result v0

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    move-result v0

    if-eqz v0, :cond_b

    :cond_a
    :goto_a
    move-object/from16 v8, p2

    move-object/from16 v18, v3

    move-object/from16 v7, v30

    move-object/from16 v14, v31

    move-object/from16 v10, v37

    move-object/from16 v31, v27

    goto/16 :goto_10

    .line 32
    :cond_b
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v0

    .line 33
    array-length v8, v0

    const/4 v10, 0x4

    if-ne v8, v10, :cond_a

    aget-object v8, v0, v32

    invoke-virtual {v8, v6}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_c

    goto :goto_a

    :cond_c
    const/4 v8, 0x1

    .line 34
    aget-object v10, v0, v8

    invoke-virtual {v10, v1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_d

    move-object v10, v1

    goto :goto_b

    :cond_d
    const/4 v10, 0x0

    .line 35
    :goto_b
    aget-object v0, v0, v20

    invoke-static {v12, v0, v9}, Ls6;->o(Ljava/lang/ClassLoader;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 36
    :try_start_9
    invoke-virtual {v7, v8}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 37
    const-string v8, "Elaris"

    filled-new-array {v6, v10, v8, v0}, [Ljava/lang/Object;

    move-result-object v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_d

    move-object/from16 v8, v39

    :try_start_a
    invoke-virtual {v7, v8, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_c

    move-object/from16 v10, v37

    :try_start_b
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_b

    move-object/from16 v14, v31

    :try_start_c
    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_a

    move-object/from16 v18, v3

    .line 39
    :try_start_d
    invoke-static {v7}, Ls6;->R(Ljava/lang/reflect/Method;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_9

    move-object/from16 v3, v27

    :try_start_e
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_8

    move-object/from16 v39, v8

    move-object/from16 v8, p2

    :try_start_f
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 40
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_7

    :goto_c
    const/16 v33, 0x1

    goto/16 :goto_4a

    :catchall_7
    move-exception v0

    goto :goto_f

    :catchall_8
    move-exception v0

    move-object/from16 v39, v8

    :goto_d
    move-object/from16 v8, p2

    goto :goto_f

    :catchall_9
    move-exception v0

    :goto_e
    move-object/from16 v39, v8

    move-object/from16 v3, v27

    goto :goto_d

    :catchall_a
    move-exception v0

    move-object/from16 v18, v3

    goto :goto_e

    :catchall_b
    move-exception v0

    move-object/from16 v18, v3

    move-object/from16 v39, v8

    move-object/from16 v3, v27

    move-object/from16 v14, v31

    goto :goto_d

    :catchall_c
    move-exception v0

    move-object/from16 v18, v3

    move-object/from16 v39, v8

    move-object/from16 v3, v27

    move-object/from16 v14, v31

    move-object/from16 v10, v37

    goto :goto_d

    :catchall_d
    move-exception v0

    move-object/from16 v8, p2

    move-object/from16 v18, v3

    move-object/from16 v3, v27

    move-object/from16 v14, v31

    move-object/from16 v10, v37

    .line 41
    :goto_f
    invoke-static {v0}, Ls6;->C0(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object v0

    move-object/from16 v27, v0

    .line 42
    invoke-static {v4, v9, v14}, La;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 43
    invoke-static {v7}, Ls6;->R(Ljava/lang/reflect/Method;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v7, v30

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    invoke-virtual/range {v27 .. v27}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v30

    move-object/from16 v31, v3

    invoke-virtual/range {v30 .. v30}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {v27 .. v27}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 45
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    :goto_10
    add-int/lit8 v5, v5, 0x1

    move-object/from16 v30, v7

    move-object/from16 v37, v10

    move-object/from16 v3, v18

    move-object/from16 v27, v31

    move-object/from16 v31, v14

    goto/16 :goto_9

    :cond_e
    move-object/from16 v8, p2

    move-object/from16 v7, v30

    move-object/from16 v14, v31

    move-object/from16 v10, v37

    move-object/from16 v31, v27

    .line 46
    const-string v0, " reason=deleteTroopMember method unresolved service="

    .line 47
    invoke-static {v4, v9, v0}, La;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 48
    invoke-virtual/range {v39 .. v39}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 49
    :goto_11
    invoke-static {v2}, Ls6;->Y(Ljava/lang/String;)J

    move-result-wide v5

    cmp-long v0, v5, v28

    if-gtz v0, :cond_f

    .line 50
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v3, v25

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    :goto_12
    move-object/from16 v25, v11

    goto/16 :goto_16

    .line 51
    :cond_f
    invoke-static {v12, v8}, Ls6;->z0(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v3

    .line 52
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_10

    .line 53
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v5, v24

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    goto :goto_12

    .line 54
    :cond_10
    invoke-static {v12, v9}, Ls6;->M(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_11

    .line 55
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v2, v23

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    goto :goto_12

    .line 56
    :cond_11
    const-string v0, "com.tencent.qqnt.kernel.nativeinterface.KickMemberReq"

    move-wide/from16 v23, v5

    const-string v5, "com.tencent.qqnt.kernelpublic.nativeinterface.KickMemberReq"

    filled-new-array {v0, v5}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v12, v0}, Ls6;->y(Ljava/lang/ClassLoader;[Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    if-nez v5, :cond_12

    .line 57
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " reason=KickMemberReq class null"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    goto :goto_12

    .line 58
    :cond_12
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Ls6;->e(Ljava/lang/Class;)Ljava/util/ArrayList;

    move-result-object v6

    move/from16 v1, v32

    .line 59
    :goto_13
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_17

    .line 60
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move/from16 v18, v1

    move-object v1, v0

    check-cast v1, Ljava/lang/reflect/Method;

    .line 61
    const-string v0, "kickMemberV2"

    move-object/from16 v20, v6

    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_13

    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getModifiers()I

    move-result v0

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    move-result v0

    if-eqz v0, :cond_14

    :cond_13
    move-object/from16 v27, v5

    move-object/from16 v25, v11

    goto/16 :goto_15

    .line 62
    :cond_14
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v0

    .line 63
    array-length v6, v0

    move-object/from16 v25, v11

    const/4 v11, 0x2

    if-ne v6, v11, :cond_15

    aget-object v6, v0, v32

    invoke-virtual {v6, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v6

    if-nez v6, :cond_16

    :cond_15
    move-object/from16 v27, v5

    goto/16 :goto_15

    .line 64
    :cond_16
    :try_start_10
    invoke-virtual {v5}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v6

    .line 65
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_f

    move-object/from16 v27, v5

    move/from16 v5, v32

    .line 66
    :try_start_11
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v30

    move-object/from16 v5, v30

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v11, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    const-string v5, "groupCode"

    move-object/from16 v30, v0

    invoke-static/range {v23 .. v24}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v6, v5, v0}, Ls6;->p0(Ljava/lang/Object;Ljava/lang/String;Ljava/io/Serializable;)V

    .line 68
    const-string v0, "kickListUids"

    invoke-static {v6, v0, v11}, Ls6;->p0(Ljava/lang/Object;Ljava/lang/String;Ljava/io/Serializable;)V

    .line 69
    const-string v0, "kickFlag"

    const/16 v32, 0x0

    invoke-static/range {v32 .. v32}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v6, v0, v5}, Ls6;->p0(Ljava/lang/Object;Ljava/lang/String;Ljava/io/Serializable;)V

    const/4 v5, 0x1

    .line 70
    aget-object v0, v30, v5

    .line 71
    invoke-static {v12, v0, v9}, Ls6;->o(Ljava/lang/ClassLoader;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 72
    invoke-virtual {v1, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 73
    filled-new-array {v6, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    invoke-static {v1}, Ls6;->R(Ljava/lang/reflect/Method;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v5, 0x0

    .line 76
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 77
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_e

    goto/16 :goto_c

    :catchall_e
    move-exception v0

    goto :goto_14

    :catchall_f
    move-exception v0

    move-object/from16 v27, v5

    .line 78
    :goto_14
    invoke-static {v0}, Ls6;->C0(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object v0

    .line 79
    invoke-static {v4, v9, v14}, La;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    .line 80
    invoke-static {v1}, Ls6;->R(Ljava/lang/reflect/Method;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 82
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    :goto_15
    add-int/lit8 v1, v18, 0x1

    move-object/from16 v6, v20

    move-object/from16 v11, v25

    move-object/from16 v5, v27

    const/16 v32, 0x0

    goto/16 :goto_13

    :cond_17
    move-object/from16 v25, v11

    .line 83
    const-string v0, " reason=kickMemberV2 method unresolved service="

    .line 84
    invoke-static {v4, v9, v0}, La;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 85
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    :goto_16
    move-object v13, v4

    move-object v5, v7

    move-object v4, v10

    move-object v1, v12

    move-object v8, v14

    move-object/from16 v3, v21

    move-object/from16 v47, v25

    move-object/from16 v38, v31

    move-object/from16 v48, v34

    move-object/from16 v46, v36

    :goto_17
    const/16 v32, 0x0

    goto/16 :goto_34

    :cond_18
    move-object/from16 v35, v10

    move-object v10, v8

    move-object/from16 v8, p2

    move-object/from16 v48, v3

    move-object v13, v4

    move-object/from16 v46, v6

    move-object v4, v10

    move-object/from16 v47, v11

    move-object v1, v12

    move-object/from16 v3, v21

    move-object/from16 v38, v27

    move-object/from16 v5, v30

    move-object/from16 v8, v31

    goto :goto_17

    :cond_19
    move-object/from16 v34, v3

    move-object/from16 v36, v6

    move-object/from16 v35, v10

    move-object/from16 v2, v23

    move-object/from16 v5, v24

    move-object/from16 v3, v25

    move-object/from16 v1, v31

    move-object v10, v8

    move-object/from16 v25, v11

    move-object/from16 v31, v27

    move-object/from16 v8, p2

    move-object/from16 v11, v22

    .line 86
    :goto_18
    invoke-virtual {v11, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    move-object v6, v1

    move-object/from16 v23, v2

    move-object/from16 v37, v10

    move-object/from16 v22, v11

    if-eqz v0, :cond_1a

    const-wide/16 v1, 0x1

    move-wide/from16 v10, p4

    invoke-static {v1, v2, v10, v11}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v38

    :goto_19
    move-object/from16 v1, v35

    goto :goto_1a

    :cond_1a
    move-wide/from16 v10, p4

    move-wide/from16 v38, v28

    goto :goto_19

    .line 87
    :goto_1a
    invoke-static {v12, v1}, Ls6;->g0(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    .line 88
    const-string v10, " seconds="

    const-string v11, "setMemberShutUp"

    if-nez v2, :cond_1b

    .line 89
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    move-object/from16 v2, p1

    move-object/from16 v35, v1

    :goto_1b
    move-object/from16 v45, v5

    move-object v8, v6

    move-object/from16 v18, v12

    move-object/from16 v40, v15

    move-object/from16 v33, v23

    move-object/from16 v47, v25

    move-object/from16 v7, v30

    move-object/from16 v15, v31

    move-object/from16 v48, v34

    move-object/from16 v46, v36

    const/16 v32, 0x0

    move-object/from16 v34, v3

    move-object/from16 v23, v11

    move-object v3, v13

    move-wide/from16 v11, v38

    move-object v13, v4

    move-object/from16 v4, v37

    goto/16 :goto_29

    .line 90
    :cond_1b
    invoke-static {v8}, Ls6;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 91
    invoke-virtual {v0, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_1c

    move-object v14, v0

    goto :goto_1c

    :cond_1c
    invoke-static {v12, v0}, Ls6;->A0(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    .line 92
    :goto_1c
    invoke-virtual {v0, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_1d

    invoke-static {v12, v0}, Ls6;->B0(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    :goto_1d
    move-object/from16 v35, v1

    goto :goto_1e

    :cond_1d
    move-object v7, v0

    goto :goto_1d

    .line 93
    :goto_1e
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 94
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    move-result v24

    if-lez v24, :cond_1e

    invoke-virtual {v1, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 95
    :cond_1e
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v24

    if-lez v24, :cond_1f

    invoke-virtual {v7, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_1f

    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 96
    :cond_1f
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v7

    if-lez v7, :cond_20

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_20

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 97
    :cond_20
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_21

    .line 98
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " reason=repo target unresolved target="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    move-object/from16 v2, p1

    goto/16 :goto_1b

    :cond_21
    move-object v14, v6

    .line 99
    const-string v6, "Elaris"

    .line 100
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Ls6;->e(Ljava/lang/Class;)Ljava/util/ArrayList;

    move-result-object v7

    move-object/from16 v24, v14

    const/4 v14, 0x0

    .line 101
    :goto_1f
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v14, v0, :cond_28

    .line 102
    invoke-virtual {v7, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move/from16 v27, v14

    move-object v14, v0

    check-cast v14, Ljava/lang/reflect/Method;

    .line 103
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_22

    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getModifiers()I

    move-result v0

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    move-result v0

    if-eqz v0, :cond_23

    :cond_22
    move-object/from16 v43, v1

    move-object v1, v2

    move-object/from16 v45, v5

    move-object/from16 v18, v12

    move-object/from16 v40, v15

    move-object/from16 v33, v23

    move-object/from16 v8, v24

    move-object/from16 v47, v25

    move-object/from16 v15, v31

    move-object/from16 v48, v34

    move-object/from16 v46, v36

    const/16 v31, 0x5

    const/16 v32, 0x0

    :goto_20
    move-object/from16 v2, p1

    :goto_21
    move-object/from16 v34, v3

    move-object/from16 v24, v7

    move-object/from16 v23, v11

    move-object v3, v13

    move-object/from16 v7, v30

    move-wide/from16 v11, v38

    move-object v13, v4

    move-object/from16 v4, v37

    goto/16 :goto_28

    :cond_23
    move-object/from16 v40, v15

    .line 104
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v15

    .line 105
    array-length v0, v15

    move-object/from16 v41, v2

    const/4 v2, 0x6

    if-ne v0, v2, :cond_27

    const/16 v32, 0x0

    aget-object v0, v15, v32

    invoke-static {v0}, Ls6;->F0(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v0

    move-object/from16 v2, v25

    if-ne v0, v2, :cond_26

    const/16 v33, 0x1

    aget-object v0, v15, v33

    invoke-static {v0}, Ls6;->F0(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v0

    if-ne v0, v2, :cond_26

    const/16 v19, 0x2

    aget-object v0, v15, v19

    invoke-static {v0}, Ls6;->F0(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v0

    move-object/from16 v25, v15

    move-object/from16 v15, v21

    if-eq v0, v15, :cond_24

    move-object/from16 v43, v1

    move-object/from16 v47, v2

    move-object/from16 v45, v5

    move-object/from16 v18, v12

    move-object/from16 v21, v15

    :goto_22
    move-object/from16 v33, v23

    move-object/from16 v8, v24

    move-object/from16 v15, v31

    move-object/from16 v48, v34

    move-object/from16 v46, v36

    move-object/from16 v1, v41

    const/16 v31, 0x5

    goto :goto_20

    :cond_24
    move-object/from16 v21, v15

    move/from16 v15, v32

    .line 106
    :goto_23
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v15, v0, :cond_26

    .line 107
    invoke-virtual {v1, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v42, v0

    check-cast v42, Ljava/lang/String;

    .line 108
    aget-object v0, v25, v20

    move-object/from16 v43, v1

    move-object/from16 v1, p0

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_25

    move-object/from16 v44, v1

    :goto_24
    const/16 v18, 0x5

    goto :goto_25

    :cond_25
    const/16 v44, 0x0

    goto :goto_24

    .line 109
    :goto_25
    aget-object v0, v25, v18

    invoke-static {v12, v0, v9}, Ls6;->o(Ljava/lang/ClassLoader;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x1

    .line 110
    :try_start_12
    invoke-virtual {v14, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_13

    move-object/from16 v33, v4

    .line 111
    :try_start_13
    invoke-static/range {v38 .. v39}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_12

    move-object/from16 v47, v2

    move-object/from16 v45, v5

    move-object/from16 v8, v24

    move-object/from16 v48, v34

    move-object/from16 v46, v36

    move-object/from16 v1, v41

    move-object/from16 v5, v44

    move-object/from16 v2, p1

    move-object/from16 v34, v3

    move-object/from16 v24, v7

    move-object/from16 v36, v13

    move-object/from16 v13, v33

    move-object/from16 v3, v42

    move-object v7, v0

    move-object/from16 v33, v23

    move-object/from16 v23, v11

    move/from16 v49, v18

    move-object/from16 v18, v12

    move-wide/from16 v11, v38

    move-object/from16 v38, v30

    move/from16 v30, v15

    move-object/from16 v15, v31

    move/from16 v31, v49

    :try_start_14
    filled-new-array/range {v2 .. v7}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v14, v1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_11

    move-object/from16 v4, v37

    :try_start_15
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    invoke-static {v14}, Ls6;->R(Ljava/lang/reflect/Method;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v5, " source=repo"

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 114
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_10

    goto/16 :goto_c

    :catchall_10
    move-exception v0

    goto/16 :goto_27

    :catchall_11
    move-exception v0

    move-object/from16 v4, v37

    goto :goto_27

    :catchall_12
    move-exception v0

    move-object/from16 v47, v2

    move-object/from16 v45, v5

    move-object/from16 v8, v24

    move-object/from16 v48, v34

    move-object/from16 v46, v36

    move-object/from16 v4, v37

    move-object/from16 v1, v41

    move-object/from16 v2, p1

    move-object/from16 v34, v3

    move-object/from16 v24, v7

    move-object/from16 v36, v13

    move-object/from16 v13, v33

    move-object/from16 v3, v42

    move-object/from16 v33, v23

    move-object/from16 v23, v11

    :goto_26
    move/from16 v49, v18

    move-object/from16 v18, v12

    move-wide/from16 v11, v38

    move-object/from16 v38, v30

    move/from16 v30, v15

    move-object/from16 v15, v31

    move/from16 v31, v49

    goto :goto_27

    :catchall_13
    move-exception v0

    move-object/from16 v47, v2

    move-object/from16 v45, v5

    move-object/from16 v33, v23

    move-object/from16 v8, v24

    move-object/from16 v48, v34

    move-object/from16 v46, v36

    move-object/from16 v1, v41

    move-object/from16 v2, p1

    move-object/from16 v34, v3

    move-object/from16 v24, v7

    move-object/from16 v23, v11

    move-object/from16 v36, v13

    move-object/from16 v3, v42

    move-object v13, v4

    move-object/from16 v4, v37

    goto :goto_26

    .line 115
    :goto_27
    invoke-static {v0}, Ls6;->C0(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object v0

    .line 116
    invoke-static {v13, v9, v8}, La;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    .line 117
    invoke-static {v14}, Ls6;->R(Ljava/lang/reflect/Method;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v7, v38

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v3, v36

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 119
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    add-int/lit8 v0, v30, 0x1

    move-object/from16 v41, v1

    move-object/from16 v37, v4

    move-object/from16 v30, v7

    move-wide/from16 v38, v11

    move-object v4, v13

    move-object/from16 v31, v15

    move-object/from16 v12, v18

    move-object/from16 v11, v23

    move-object/from16 v7, v24

    move-object/from16 v23, v33

    move-object/from16 v1, v43

    move-object/from16 v5, v45

    move-object/from16 v36, v46

    move-object/from16 v2, v47

    move v15, v0

    move-object v13, v3

    move-object/from16 v24, v8

    move-object/from16 v3, v34

    move-object/from16 v34, v48

    move-object/from16 v8, p2

    goto/16 :goto_23

    :cond_26
    move-object/from16 v43, v1

    move-object/from16 v47, v2

    move-object/from16 v45, v5

    move-object/from16 v18, v12

    goto/16 :goto_22

    :cond_27
    move-object/from16 v2, p1

    move-object/from16 v43, v1

    move-object/from16 v45, v5

    move-object/from16 v18, v12

    move-object/from16 v33, v23

    move-object/from16 v8, v24

    move-object/from16 v47, v25

    move-object/from16 v15, v31

    move-object/from16 v48, v34

    move-object/from16 v46, v36

    move-object/from16 v1, v41

    const/16 v31, 0x5

    const/16 v32, 0x0

    goto/16 :goto_21

    :goto_28
    add-int/lit8 v14, v27, 0x1

    move-object v2, v1

    move-object/from16 v37, v4

    move-object/from16 v30, v7

    move-wide/from16 v38, v11

    move-object v4, v13

    move-object/from16 v31, v15

    move-object/from16 v12, v18

    move-object/from16 v11, v23

    move-object/from16 v7, v24

    move-object/from16 v23, v33

    move-object/from16 v15, v40

    move-object/from16 v1, v43

    move-object/from16 v5, v45

    move-object/from16 v36, v46

    move-object/from16 v25, v47

    move-object v13, v3

    move-object/from16 v24, v8

    move-object/from16 v3, v34

    move-object/from16 v34, v48

    move-object/from16 v8, p2

    goto/16 :goto_1f

    :cond_28
    move-object v1, v2

    move-object/from16 v45, v5

    move-object/from16 v18, v12

    move-object/from16 v40, v15

    move-object/from16 v33, v23

    move-object/from16 v8, v24

    move-object/from16 v47, v25

    move-object/from16 v7, v30

    move-object/from16 v15, v31

    move-object/from16 v48, v34

    move-object/from16 v46, v36

    const/16 v32, 0x0

    move-object/from16 v2, p1

    move-object/from16 v34, v3

    move-object/from16 v23, v11

    move-object v3, v13

    move-wide/from16 v11, v38

    move-object v13, v4

    move-object/from16 v4, v37

    .line 120
    const-string v0, " reason=repo setMemberShutUp method unresolved service="

    .line 121
    invoke-static {v13, v9, v0}, La;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 122
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 123
    :goto_29
    invoke-static {v2}, Ls6;->Y(Ljava/lang/String;)J

    move-result-wide v5

    cmp-long v0, v5, v28

    if-gtz v0, :cond_29

    .line 124
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v3, v34

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    move-object v5, v7

    move-object/from16 v38, v15

    move-object/from16 v1, v18

    :goto_2a
    move-object/from16 v3, v21

    goto/16 :goto_34

    :cond_29
    move-object/from16 v1, v18

    .line 125
    invoke-static {v1, v9}, Ls6;->M(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v14

    if-nez v14, :cond_2a

    .line 126
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v3, v33

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    :goto_2b
    move-object v5, v7

    move-object/from16 v38, v15

    goto :goto_2a

    .line 127
    :cond_2a
    const-string v0, "com.tencent.qqnt.kernel.nativeinterface.GroupMemberShutUpInfo"

    const-string v2, "com.tencent.qqnt.kernelpublic.nativeinterface.GroupMemberShutUpInfo"

    filled-new-array {v0, v2}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Ls6;->y(Ljava/lang/ClassLoader;[Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    if-nez v2, :cond_2b

    .line 128
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " reason=GroupMemberShutUpInfo class null"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    goto :goto_2b

    :cond_2b
    move-object/from16 v18, v2

    move-wide/from16 v24, v5

    move-object/from16 v2, p2

    .line 129
    invoke-static {v1, v2}, Ls6;->z0(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v5

    .line 130
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2c

    .line 131
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v5, v45

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    goto :goto_2b

    :cond_2c
    cmp-long v0, v11, v28

    if-gtz v0, :cond_2d

    move-object/from16 v36, v3

    move-object/from16 v30, v7

    move/from16 v2, v32

    goto :goto_2c

    .line 132
    :cond_2d
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v30

    const-wide/16 v33, 0x3e8

    div-long v30, v30, v33

    move-object/from16 v36, v3

    add-long v2, v30, v11

    move-object/from16 v30, v7

    const-wide/32 v6, 0x7fffffff

    invoke-static {v6, v7, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    long-to-int v0, v2

    move v2, v0

    .line 133
    :goto_2c
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Ls6;->e(Ljava/lang/Class;)Ljava/util/ArrayList;

    move-result-object v3

    move/from16 v6, v32

    .line 134
    :goto_2d
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v6, v0, :cond_34

    .line 135
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/reflect/Method;

    .line 136
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v27, v3

    move-object/from16 v3, v23

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2e

    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getModifiers()I

    move-result v0

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    move-result v0

    if-eqz v0, :cond_30

    :cond_2e
    move-object/from16 v23, v3

    :cond_2f
    move-object/from16 v34, v5

    move-object/from16 v38, v15

    move-object/from16 v3, v21

    move-object/from16 v5, v30

    const/16 v19, 0x2

    move/from16 v30, v2

    move/from16 v21, v6

    move-object/from16 v2, v36

    move-object/from16 v6, v40

    goto/16 :goto_33

    :cond_30
    move-object/from16 v23, v3

    .line 137
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v3

    .line 138
    array-length v0, v3

    move-object/from16 v31, v3

    move/from16 v3, v20

    if-ne v0, v3, :cond_2f

    aget-object v0, v31, v32

    invoke-static {v0}, Ls6;->F0(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v0

    move-object/from16 v3, v21

    if-ne v0, v3, :cond_33

    move/from16 v21, v6

    const/4 v6, 0x1

    aget-object v0, v31, v6

    invoke-static {v0}, Ls6;->F0(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v0

    const-class v6, Ljava/util/ArrayList;

    invoke-virtual {v6, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-nez v0, :cond_32

    :cond_31
    move-object/from16 v34, v5

    :goto_2e
    move-object/from16 v38, v15

    move-object/from16 v5, v30

    move-object/from16 v6, v40

    const/16 v19, 0x2

    move/from16 v30, v2

    move-object/from16 v2, v36

    goto/16 :goto_33

    :cond_32
    move/from16 v6, v32

    .line 139
    :goto_2f
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v6, v0, :cond_31

    .line 140
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v34, v5

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    .line 141
    :try_start_16
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_18

    move/from16 v37, v6

    .line 142
    :try_start_17
    const-string v6, "uid"

    invoke-static {v0, v6, v5}, Ls6;->p0(Ljava/lang/Object;Ljava/lang/String;Ljava/io/Serializable;)V

    .line 143
    const-string v6, "timeStamp"
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_17

    move-object/from16 v38, v15

    :try_start_18
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v0, v6, v15}, Ls6;->p0(Ljava/lang/Object;Ljava/lang/String;Ljava/io/Serializable;)V

    .line 144
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 145
    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_16

    const/16 v19, 0x2

    .line 146
    :try_start_19
    aget-object v0, v31, v19

    invoke-static {v1, v0, v9}, Ls6;->o(Ljava/lang/ClassLoader;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const/4 v15, 0x1

    .line 147
    invoke-virtual {v7, v15}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 148
    invoke-static/range {v24 .. v25}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v15

    filled-new-array {v15, v6, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v7, v14, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    invoke-static {v7}, Ls6;->R(Ljava/lang/reflect/Method;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_15

    move-object/from16 v6, v40

    :try_start_1a
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v15, " expire="

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 151
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_14

    goto/16 :goto_c

    :catchall_14
    move-exception v0

    goto :goto_32

    :catchall_15
    move-exception v0

    move-object/from16 v6, v40

    goto :goto_32

    :catchall_16
    move-exception v0

    :goto_30
    move-object/from16 v6, v40

    const/16 v19, 0x2

    goto :goto_32

    :catchall_17
    move-exception v0

    :goto_31
    move-object/from16 v38, v15

    goto :goto_30

    :catchall_18
    move-exception v0

    move/from16 v37, v6

    goto :goto_31

    .line 152
    :goto_32
    invoke-static {v0}, Ls6;->C0(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object v0

    .line 153
    invoke-static {v13, v9, v8}, La;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    move-object/from16 v39, v0

    .line 154
    invoke-static {v7}, Ls6;->R(Ljava/lang/reflect/Method;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v5, v30

    invoke-virtual {v15, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    invoke-virtual/range {v39 .. v39}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v30, v2

    move-object/from16 v2, v36

    invoke-virtual {v15, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {v39 .. v39}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 156
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    add-int/lit8 v0, v37, 0x1

    move-object/from16 v40, v6

    move/from16 v2, v30

    move-object/from16 v15, v38

    move v6, v0

    move-object/from16 v30, v5

    move-object/from16 v5, v34

    goto/16 :goto_2f

    :cond_33
    move-object/from16 v34, v5

    move/from16 v21, v6

    goto/16 :goto_2e

    :goto_33
    add-int/lit8 v0, v21, 0x1

    move-object/from16 v36, v2

    move-object/from16 v21, v3

    move-object/from16 v40, v6

    move-object/from16 v3, v27

    move/from16 v2, v30

    move-object/from16 v15, v38

    const/16 v20, 0x3

    move v6, v0

    move-object/from16 v30, v5

    move-object/from16 v5, v34

    goto/16 :goto_2d

    :cond_34
    move-object/from16 v38, v15

    move-object/from16 v3, v21

    move-object/from16 v5, v30

    .line 157
    const-string v0, " reason=setMemberShutUp method unresolved service="

    .line 158
    invoke-static {v13, v9, v0}, La;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 159
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 160
    :goto_34
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v6, v35

    .line 161
    invoke-static {v1, v6}, Ls6;->g0(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v2, v0}, Ls6;->d(Ljava/util/ArrayList;Ljava/lang/Object;)V

    .line 162
    const-string v0, "com.tencent.qqnt.troop.ITroopOperationRepoApi"

    invoke-static {v1, v0}, Ls6;->g0(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v2, v0}, Ls6;->d(Ljava/util/ArrayList;Ljava/lang/Object;)V

    .line 163
    const-string v0, "com.tencent.qqnt.troop.api.ITroopOperationRepoApi"

    invoke-static {v1, v0}, Ls6;->g0(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v2, v0}, Ls6;->d(Ljava/util/ArrayList;Ljava/lang/Object;)V

    .line 164
    const-string v0, "com.tencent.qqnt.troop.TroopOperationRepo"

    const-string v6, "INSTANCE"

    .line 165
    :try_start_1b
    invoke-static {v0, v1}, Lcom/mr/elaris/xposedcompat/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v0

    .line 166
    invoke-virtual {v0, v6}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    const/4 v15, 0x1

    .line 167
    invoke-virtual {v0, v15}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    const/4 v6, 0x0

    .line 168
    invoke-virtual {v0, v6}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_19

    goto :goto_35

    :catchall_19
    const/4 v0, 0x0

    .line 169
    :goto_35
    invoke-static {v2, v0}, Ls6;->d(Ljava/util/ArrayList;Ljava/lang/Object;)V

    .line 170
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_35

    .line 171
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " reason=troop operation service null"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    return v32

    :cond_35
    move-object/from16 v11, v22

    .line 172
    invoke-virtual {v11, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    move-object/from16 v6, v48

    if-nez v0, :cond_37

    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_36

    goto :goto_36

    :cond_36
    move/from16 v7, v32

    goto :goto_37

    :cond_37
    :goto_36
    const/4 v7, 0x1

    .line 173
    :goto_37
    invoke-virtual {v11, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_38

    move-wide/from16 v14, p4

    move-object v10, v13

    const-wide/16 v12, 0x1

    invoke-static {v12, v13, v14, v15}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v12

    goto :goto_38

    :cond_38
    move-object v10, v13

    move-wide/from16 v12, v28

    .line 174
    :goto_38
    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    .line 175
    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 176
    invoke-static/range {p2 .. p2}, Ls6;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 177
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v16

    if-lez v16, :cond_39

    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 178
    :cond_39
    invoke-static {v1, v0}, Ls6;->B0(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 179
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_3a

    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3a

    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3a
    move/from16 v1, v32

    .line 180
    :goto_39
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_5a

    move/from16 v16, v7

    .line 181
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    if-nez v7, :cond_3b

    move/from16 v17, v1

    move-object/from16 v18, v2

    move-object/from16 v34, v6

    move-object/from16 v22, v10

    move-object/from16 v23, v11

    move-wide/from16 p4, v12

    move-object v10, v14

    move-object/from16 v30, v15

    move-object/from16 v15, v38

    move-object/from16 v36, v46

    const/16 v26, 0x0

    const/16 v33, 0x1

    goto/16 :goto_51

    .line 182
    :cond_3b
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    move/from16 v17, v1

    invoke-static {v0}, Ls6;->e(Ljava/lang/Class;)Ljava/util/ArrayList;

    move-result-object v1

    move-object/from16 v18, v2

    move/from16 v2, v32

    .line 183
    :goto_3a
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v2, v0, :cond_59

    .line 184
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 p2, v1

    move-object v1, v0

    check-cast v1, Ljava/lang/reflect/Method;

    if-eqz v1, :cond_3c

    .line 185
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getModifiers()I

    move-result v0

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v0

    if-nez v0, :cond_3c

    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getModifiers()I

    move-result v0

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    move-result v0

    if-eqz v0, :cond_3d

    :cond_3c
    move/from16 v20, v2

    goto :goto_3c

    .line 186
    :cond_3d
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v19, ""

    if-nez v0, :cond_3e

    move/from16 v20, v2

    move-object/from16 v0, v19

    goto :goto_3b

    :cond_3e
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v0

    move/from16 v20, v2

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v0, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    .line 187
    :goto_3b
    const-string v2, "msg"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_3f

    const-string v2, "mask"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_3f

    const-string v2, "notify"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_3f

    const-string v2, "clock"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_40

    :cond_3f
    :goto_3c
    move-object/from16 v34, v6

    move-object/from16 v22, v10

    move-object/from16 v23, v11

    move-wide/from16 p4, v12

    move-object v10, v14

    move-object/from16 v30, v15

    move-object/from16 v15, v38

    move-object/from16 v36, v46

    goto/16 :goto_50

    :cond_40
    move-object/from16 v2, v46

    .line 188
    invoke-virtual {v2, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_42

    move-object/from16 v36, v2

    .line 189
    const-string v2, "kick"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_45

    const-string v2, "kickout"

    .line 190
    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_45

    const-string v2, "delete"

    .line 191
    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_41

    const-string v2, "remove"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_58

    :cond_41
    const-string v2, "member"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_45

    const-string v2, "troop"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_45

    const-string v2, "group"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_58

    goto :goto_3d

    :cond_42
    move-object/from16 v36, v2

    .line 192
    invoke-virtual {v11, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_43

    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_58

    .line 193
    :cond_43
    const-string v2, "all"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_44

    goto/16 :goto_4f

    .line 194
    :cond_44
    const-string v2, "mute"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_45

    const-string v2, "shutup"

    .line 195
    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_45

    const-string v2, "shut"

    .line 196
    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_45

    const-string v2, "forbid"

    .line 197
    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_58

    :cond_45
    :goto_3d
    move/from16 v2, v32

    .line 198
    :goto_3e
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v2, v0, :cond_58

    .line 199
    invoke-virtual {v15, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move/from16 v21, v2

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    .line 200
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v0

    if-nez v0, :cond_46

    move-object/from16 v34, v6

    move-object/from16 v22, v10

    move-object/from16 v23, v11

    move-wide/from16 p4, v12

    move-object/from16 v24, v14

    move-object/from16 v30, v15

    const/4 v0, 0x0

    const/16 v26, 0x0

    goto/16 :goto_49

    :cond_46
    move-object/from16 v34, v6

    .line 201
    array-length v6, v0

    new-array v6, v6, [Ljava/lang/Object;

    move-object/from16 v22, v10

    move-object/from16 v23, v11

    move-wide/from16 p4, v12

    move/from16 v10, v32

    move v11, v10

    move v12, v11

    move/from16 v24, v12

    .line 202
    :goto_3f
    array-length v13, v0

    if-ge v10, v13, :cond_54

    .line 203
    aget-object v13, v0, v10

    move-object/from16 v25, v0

    .line 204
    invoke-static {v13}, Ls6;->F0(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v0

    move/from16 v27, v10

    move-object/from16 v10, v47

    if-ne v0, v10, :cond_49

    if-nez v11, :cond_47

    .line 205
    aput-object p1, v6, v27

    move-object/from16 v47, v10

    move-object/from16 v30, v15

    move/from16 v0, v24

    const/4 v11, 0x1

    :goto_40
    const/16 v26, 0x0

    :goto_41
    move-object/from16 v24, v14

    goto/16 :goto_48

    :cond_47
    if-nez v12, :cond_48

    .line 206
    aput-object v2, v6, v27

    move-object/from16 v47, v10

    :goto_42
    move-object/from16 v30, v15

    move/from16 v0, v24

    const/4 v12, 0x1

    goto :goto_40

    .line 207
    :cond_48
    aput-object v19, v6, v27

    move-object/from16 v47, v10

    :goto_43
    const/16 v26, 0x0

    goto :goto_44

    :cond_49
    move-object/from16 v47, v10

    .line 208
    const-class v10, Ljava/util/List;

    invoke-virtual {v10, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v10

    if-eqz v10, :cond_4a

    .line 209
    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    aput-object v0, v6, v27

    goto :goto_42

    .line 210
    :cond_4a
    const-class v10, Ljava/util/Set;

    invoke-virtual {v10, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v10

    if-eqz v10, :cond_4b

    .line 211
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 212
    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 213
    aput-object v0, v6, v27

    goto :goto_42

    .line 214
    :cond_4b
    const-class v10, Ljava/lang/Short;

    move-object/from16 v30, v13

    const-class v13, Ljava/lang/Integer;

    if-eq v0, v3, :cond_4c

    if-eq v0, v13, :cond_4c

    if-ne v0, v10, :cond_4d

    :cond_4c
    const/16 v26, 0x0

    goto :goto_45

    .line 215
    :cond_4d
    const-class v10, Ljava/lang/Boolean;

    if-ne v0, v10, :cond_4e

    .line 216
    invoke-static/range {v16 .. v16}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    aput-object v0, v6, v27

    goto :goto_43

    .line 217
    :cond_4e
    const-class v10, Landroid/content/Context;

    invoke-virtual {v10, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_4f

    .line 218
    aput-object p0, v6, v27

    goto :goto_43

    .line 219
    :cond_4f
    invoke-virtual/range {v30 .. v30}, Ljava/lang/Class;->isPrimitive()Z

    move-result v0

    if-eqz v0, :cond_50

    .line 220
    invoke-static/range {v30 .. v30}, Ls6;->a0(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    aput-object v0, v6, v27

    goto :goto_43

    :cond_50
    const/16 v26, 0x0

    .line 221
    aput-object v26, v6, v27

    :goto_44
    move-object/from16 v30, v15

    move/from16 v0, v24

    goto :goto_41

    :goto_45
    if-eqz v24, :cond_51

    move-object/from16 v24, v14

    move-object/from16 v30, v15

    move-wide/from16 v14, v28

    goto :goto_46

    :cond_51
    move-object/from16 v24, v14

    move-object/from16 v30, v15

    move-wide/from16 v14, p4

    :goto_46
    if-ne v0, v13, :cond_52

    long-to-int v0, v14

    .line 222
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v6, v27

    goto :goto_47

    :cond_52
    if-ne v0, v10, :cond_53

    long-to-int v0, v14

    int-to-short v0, v0

    .line 223
    invoke-static {v0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v0

    aput-object v0, v6, v27

    goto :goto_47

    .line 224
    :cond_53
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    aput-object v0, v6, v27

    :goto_47
    const/4 v0, 0x1

    :goto_48
    add-int/lit8 v10, v27, 0x1

    move-object/from16 v14, v24

    move-object/from16 v15, v30

    move/from16 v24, v0

    move-object/from16 v0, v25

    goto/16 :goto_3f

    :cond_54
    move-object/from16 v24, v14

    move-object/from16 v30, v15

    const/16 v26, 0x0

    .line 225
    new-instance v0, Lr6;

    invoke-direct {v0, v6, v11, v12}, Lr6;-><init>([Ljava/lang/Object;ZZ)V

    :goto_49
    if-eqz v0, :cond_55

    .line 226
    iget-boolean v6, v0, Lr6;->b:Z

    if-eqz v6, :cond_55

    iget-boolean v6, v0, Lr6;->c:Z

    if-nez v6, :cond_56

    :cond_55
    move-object/from16 v10, v24

    move-object/from16 v15, v38

    const/16 v33, 0x1

    goto/16 :goto_4e

    :cond_56
    const/4 v15, 0x1

    .line 227
    :try_start_1c
    invoke-virtual {v1, v15}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_1c

    .line 228
    :try_start_1d
    iget-object v0, v0, Lr6;->a:[Ljava/lang/Object;

    invoke-virtual {v1, v7, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 229
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 230
    invoke-static {v1}, Ls6;->R(Ljava/lang/reflect/Method;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_1b

    move-object/from16 v15, v38

    :try_start_1e
    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 231
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_1a

    goto/16 :goto_c

    :goto_4a
    return v33

    :catchall_1a
    move-exception v0

    :goto_4b
    const/16 v33, 0x1

    goto :goto_4c

    :catchall_1b
    move-exception v0

    move-object/from16 v15, v38

    goto :goto_4b

    :catchall_1c
    move-exception v0

    move/from16 v33, v15

    move-object/from16 v15, v38

    .line 232
    :goto_4c
    invoke-static {v0}, Ls6;->C0(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object v0

    .line 233
    invoke-virtual/range {v24 .. v24}, Ljava/lang/StringBuilder;->length()I

    move-result v6

    if-lez v6, :cond_57

    const-string v6, " | "

    move-object/from16 v10, v24

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_4d

    :cond_57
    move-object/from16 v10, v24

    .line 234
    :goto_4d
    invoke-static {v1}, Ls6;->R(Ljava/lang/reflect/Method;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x20

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 235
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x3a

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_4e
    add-int/lit8 v2, v21, 0x1

    move-wide/from16 v12, p4

    move-object v14, v10

    move-object/from16 v38, v15

    move-object/from16 v10, v22

    move-object/from16 v11, v23

    move-object/from16 v15, v30

    move-object/from16 v6, v34

    goto/16 :goto_3e

    :cond_58
    :goto_4f
    move-object/from16 v34, v6

    move-object/from16 v22, v10

    move-object/from16 v23, v11

    move-wide/from16 p4, v12

    move-object v10, v14

    move-object/from16 v30, v15

    move-object/from16 v15, v38

    :goto_50
    const/16 v26, 0x0

    const/16 v33, 0x1

    add-int/lit8 v2, v20, 0x1

    move-object/from16 v1, p2

    move-wide/from16 v12, p4

    move-object v14, v10

    move-object/from16 v38, v15

    move-object/from16 v10, v22

    move-object/from16 v11, v23

    move-object/from16 v15, v30

    move-object/from16 v6, v34

    move-object/from16 v46, v36

    goto/16 :goto_3a

    :cond_59
    move-object/from16 v34, v6

    move-object/from16 v22, v10

    move-object/from16 v23, v11

    move-wide/from16 p4, v12

    move-object v10, v14

    move-object/from16 v30, v15

    move-object/from16 v15, v38

    move-object/from16 v36, v46

    const/16 v26, 0x0

    const/16 v33, 0x1

    .line 236
    invoke-static {v7, v9}, Ls6;->N(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_51
    add-int/lit8 v1, v17, 0x1

    move-wide/from16 v12, p4

    move-object v14, v10

    move-object/from16 v38, v15

    move/from16 v7, v16

    move-object/from16 v2, v18

    move-object/from16 v10, v22

    move-object/from16 v11, v23

    move-object/from16 v15, v30

    move-object/from16 v6, v34

    move-object/from16 v46, v36

    goto/16 :goto_39

    :cond_5a
    move-object/from16 v22, v10

    move-object v10, v14

    .line 237
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-lez v0, :cond_5b

    move-object/from16 v13, v22

    .line 238
    invoke-static {v13, v9, v5}, La;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 239
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ls6;->m0(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    :cond_5b
    return v32
.end method

.method public static K(Lb7;)Z
    .locals 1

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    iget p0, p0, Lb7;->a:I

    .line 4
    .line 5
    const/4 v0, 0x2

    .line 6
    if-eq p0, v0, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x4

    .line 9
    if-ne p0, v0, :cond_1

    .line 10
    .line 11
    :cond_0
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_1
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method public static L(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    .line 1
    invoke-static {p0}, Ls6;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    return v1

    .line 13
    :cond_0
    invoke-static {p1}, Ls6;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    return v1

    .line 24
    :cond_1
    invoke-static {p0}, Ls6;->P(Ljava/lang/String;)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-eqz p1, :cond_2

    .line 29
    .line 30
    return v1

    .line 31
    :cond_2
    const p1, 0xfffd

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, p1}, Ljava/lang/String;->indexOf(I)I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    if-gez p0, :cond_3

    .line 39
    .line 40
    const/4 p0, 0x1

    .line 41
    return p0

    .line 42
    :cond_3
    return v1
.end method

.method public static M(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Object;
    .locals 8

    .line 1
    const-string v0, "kickMemberV2"

    .line 2
    .line 3
    const-string v1, "setMemberShutUp"

    .line 4
    .line 5
    const-string v2, "group action failed type="

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    :try_start_0
    invoke-static {p0}, Ls6;->f(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v4

    .line 12
    if-nez v4, :cond_0

    .line 13
    .line 14
    new-instance p0, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {p0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v0, " reason=app runtime null"

    .line 23
    .line 24
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-object v3

    .line 35
    :catchall_0
    move-exception p0

    .line 36
    goto/16 :goto_2

    .line 37
    .line 38
    :cond_0
    const-string v5, "com.tencent.qqnt.kernel.api.IKernelService"

    .line 39
    .line 40
    filled-new-array {v5}, [Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    invoke-static {p0, v5}, Ls6;->y(Ljava/lang/ClassLoader;[Ljava/lang/String;)Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    if-nez p0, :cond_1

    .line 49
    .line 50
    new-instance p0, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    invoke-direct {p0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const-string v0, " reason=IKernelService class null"

    .line 59
    .line 60
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    return-object v3

    .line 71
    :cond_1
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    const-string v6, "getRuntimeService"

    .line 76
    .line 77
    const/4 v7, 0x2

    .line 78
    invoke-static {v5, v6, v7}, Ls6;->A(Ljava/lang/Class;Ljava/lang/String;I)Ljava/lang/reflect/Method;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    if-nez v5, :cond_2

    .line 83
    .line 84
    new-instance p0, Ljava/lang/StringBuilder;

    .line 85
    .line 86
    invoke-direct {p0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string v0, " reason=getRuntimeService method null runtime="

    .line 93
    .line 94
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    return-object v3

    .line 116
    :cond_2
    const/4 v6, 0x1

    .line 117
    invoke-virtual {v5, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 118
    .line 119
    .line 120
    const-string v6, ""

    .line 121
    .line 122
    filled-new-array {p0, v6}, [Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    invoke-virtual {v5, v4, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    const-string v4, "getGroupService"

    .line 131
    .line 132
    filled-new-array {v4}, [Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    invoke-static {p0, v4}, Ls6;->m(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    invoke-static {p0, v1}, Ls6;->G(Ljava/lang/Object;Ljava/lang/String;)Z

    .line 141
    .line 142
    .line 143
    move-result v4

    .line 144
    if-nez v4, :cond_6

    .line 145
    .line 146
    invoke-static {p0, v0}, Ls6;->G(Ljava/lang/Object;Ljava/lang/String;)Z

    .line 147
    .line 148
    .line 149
    move-result v4

    .line 150
    if-eqz v4, :cond_3

    .line 151
    .line 152
    goto :goto_1

    .line 153
    :cond_3
    const-string v4, "getService"

    .line 154
    .line 155
    filled-new-array {v4}, [Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v4

    .line 159
    invoke-static {p0, v4}, Ls6;->m(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v4

    .line 163
    invoke-static {v4, v1}, Ls6;->G(Ljava/lang/Object;Ljava/lang/String;)Z

    .line 164
    .line 165
    .line 166
    move-result v5

    .line 167
    if-nez v5, :cond_5

    .line 168
    .line 169
    invoke-static {v4, v0}, Ls6;->G(Ljava/lang/Object;Ljava/lang/String;)Z

    .line 170
    .line 171
    .line 172
    move-result v5

    .line 173
    if-eqz v5, :cond_4

    .line 174
    .line 175
    goto :goto_0

    .line 176
    :cond_4
    invoke-static {p0}, Ls6;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v4

    .line 180
    invoke-static {v4, v1}, Ls6;->G(Ljava/lang/Object;Ljava/lang/String;)Z

    .line 181
    .line 182
    .line 183
    move-result v1

    .line 184
    if-nez v1, :cond_5

    .line 185
    .line 186
    invoke-static {v4, v0}, Ls6;->G(Ljava/lang/Object;Ljava/lang/String;)Z

    .line 187
    .line 188
    .line 189
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 190
    if-eqz p1, :cond_6

    .line 191
    .line 192
    :cond_5
    :goto_0
    return-object v4

    .line 193
    :cond_6
    :goto_1
    return-object p0

    .line 194
    :goto_2
    invoke-static {p0}, Ls6;->C0(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    const-string v0, " reason=kernel group service "

    .line 199
    .line 200
    invoke-static {v2, p1, v0}, La;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    const-string v0, ": "

    .line 205
    .line 206
    invoke-static {p0, p1, v0}, La;->d(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    return-object v3
.end method

.method public static N(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 6

    .line 1
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-static {v1}, Ls6;->e(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const/4 v2, 0x0

    .line 15
    :goto_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-ge v2, v3, :cond_4

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    check-cast v3, Ljava/lang/reflect/Method;

    .line 26
    .line 27
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    if-nez v4, :cond_0

    .line 32
    .line 33
    const-string v4, ""

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_0
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 41
    .line 42
    invoke-virtual {v4, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    :goto_1
    const-string v5, "mute"

    .line 47
    .line 48
    invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    if-nez v5, :cond_1

    .line 53
    .line 54
    const-string v5, "shut"

    .line 55
    .line 56
    invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    if-nez v5, :cond_1

    .line 61
    .line 62
    const-string v5, "forbid"

    .line 63
    .line 64
    invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    if-nez v5, :cond_1

    .line 69
    .line 70
    const-string v5, "kick"

    .line 71
    .line 72
    invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    if-nez v5, :cond_1

    .line 77
    .line 78
    const-string v5, "remove"

    .line 79
    .line 80
    invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 81
    .line 82
    .line 83
    move-result v5

    .line 84
    if-nez v5, :cond_1

    .line 85
    .line 86
    const-string v5, "delete"

    .line 87
    .line 88
    invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 89
    .line 90
    .line 91
    move-result v5

    .line 92
    if-nez v5, :cond_1

    .line 93
    .line 94
    const-string v5, "recall"

    .line 95
    .line 96
    invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 97
    .line 98
    .line 99
    move-result v4

    .line 100
    if-nez v4, :cond_1

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 104
    .line 105
    .line 106
    move-result v4

    .line 107
    if-lez v4, :cond_2

    .line 108
    .line 109
    const-string v4, "; "

    .line 110
    .line 111
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    :cond_2
    invoke-static {v3}, Ls6;->R(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 122
    .line 123
    .line 124
    move-result v3

    .line 125
    const/16 v4, 0x2bc

    .line 126
    .line 127
    if-le v3, v4, :cond_3

    .line 128
    .line 129
    goto :goto_3

    .line 130
    :cond_3
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 131
    .line 132
    goto :goto_0

    .line 133
    :cond_4
    :goto_3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 134
    .line 135
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 136
    .line 137
    .line 138
    const-string v2, "group api candidates action="

    .line 139
    .line 140
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    const-string p1, " class="

    .line 147
    .line 148
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    const-string p0, " methods="

    .line 163
    .line 164
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    invoke-static {p0}, Ls6;->m0(Ljava/lang/Object;)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object p0

    .line 182
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 183
    .line 184
    .line 185
    :catchall_0
    return-void
.end method

.method public static O(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 3

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto/16 :goto_0

    .line 4
    .line 5
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v1, "at"

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    const-string v2, "mention"

    .line 26
    .line 27
    if-nez v1, :cond_1

    .line 28
    .line 29
    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-nez v1, :cond_1

    .line 34
    .line 35
    const-string v1, "uin"

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-nez v1, :cond_1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-static {p1}, Ls6;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    invoke-static {p3}, Ls6;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p3

    .line 60
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-lez v1, :cond_2

    .line 65
    .line 66
    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    if-eqz p1, :cond_2

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_2
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    if-lez p1, :cond_3

    .line 78
    .line 79
    invoke-virtual {p0, p2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    if-eqz p1, :cond_3

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_3
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    if-lez p1, :cond_4

    .line 91
    .line 92
    invoke-virtual {p0, p3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    if-eqz p0, :cond_4

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_4
    const-string p0, "atinfo"

    .line 100
    .line 101
    invoke-virtual {v0, p0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 102
    .line 103
    .line 104
    move-result p0

    .line 105
    if-nez p0, :cond_6

    .line 106
    .line 107
    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 108
    .line 109
    .line 110
    move-result p0

    .line 111
    if-nez p0, :cond_6

    .line 112
    .line 113
    const-string p0, "atspan"

    .line 114
    .line 115
    invoke-virtual {v0, p0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 116
    .line 117
    .line 118
    move-result p0

    .line 119
    if-eqz p0, :cond_5

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_5
    :goto_0
    const/4 p0, 0x0

    .line 123
    return p0

    .line 124
    :cond_6
    :goto_1
    const/4 p0, 0x1

    .line 125
    return p0
.end method

.method public static P(Ljava/lang/String;)Z
    .locals 4

    .line 1
    invoke-static {p0}, Ls6;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    return v1

    .line 13
    :cond_0
    const-string v0, "u_"

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v2, 0x1

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    return v2

    .line 23
    :cond_1
    const-string v0, "@u_"

    .line 24
    .line 25
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    return v2

    .line 32
    :cond_2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    const/16 v3, 0x18

    .line 37
    .line 38
    if-le v0, v3, :cond_3

    .line 39
    .line 40
    const/16 v0, 0x5f

    .line 41
    .line 42
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-ltz v0, :cond_3

    .line 47
    .line 48
    const-string v0, "[A-Za-z0-9_\\-]+"

    .line 49
    .line 50
    invoke-virtual {p0, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    if-eqz p0, :cond_3

    .line 55
    .line 56
    return v2

    .line 57
    :cond_3
    return v1
.end method

.method public static Q(Ljava/lang/Object;)Ljava/lang/String;
    .locals 6

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, ""

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string v4, "uniseq"

    .line 7
    .line 8
    const-string v5, "msgseq"

    .line 9
    .line 10
    const-string v0, "msgId"

    .line 11
    .line 12
    const-string v1, "msgUid"

    .line 13
    .line 14
    const-string v2, "msgSeq"

    .line 15
    .line 16
    const-string v3, "shmsgseq"

    .line 17
    .line 18
    filled-new-array/range {v0 .. v5}, [Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {p0, v0}, Ls6;->C(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-lez v1, :cond_1

    .line 35
    .line 36
    return-object v0

    .line 37
    :cond_1
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    const-string v4, "uniseq"

    .line 42
    .line 43
    const-string v5, "msgseq"

    .line 44
    .line 45
    const-string v0, "msgId"

    .line 46
    .line 47
    const-string v1, "msgUid"

    .line 48
    .line 49
    const-string v2, "msgSeq"

    .line 50
    .line 51
    const-string v3, "shmsgseq"

    .line 52
    .line 53
    filled-new-array/range {v0 .. v5}, [Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-static {p0, v0}, Ls6;->E0(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    return-object p0
.end method

.method public static R(Ljava/lang/reflect/Method;)Ljava/lang/String;
    .locals 3

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, ""

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const/16 v1, 0x28

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    const/4 v1, 0x0

    .line 28
    :goto_0
    array-length v2, p0

    .line 29
    if-ge v1, v2, :cond_2

    .line 30
    .line 31
    if-lez v1, :cond_1

    .line 32
    .line 33
    const/16 v2, 0x2c

    .line 34
    .line 35
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    :cond_1
    aget-object v2, p0, v1

    .line 39
    .line 40
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    add-int/lit8 v1, v1, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    const/16 p0, 0x29

    .line 51
    .line 52
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0
.end method

.method public static S([Ljava/lang/Class;Landroid/app/Activity;Landroid/widget/EditText;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    if-eqz v0, :cond_17

    .line 4
    .line 5
    array-length v1, v0

    .line 6
    if-eqz v1, :cond_17

    .line 7
    .line 8
    array-length v1, v0

    .line 9
    const/4 v2, 0x6

    .line 10
    if-le v1, v2, :cond_0

    .line 11
    .line 12
    goto/16 :goto_a

    .line 13
    .line 14
    :cond_0
    array-length v1, v0

    .line 15
    new-array v1, v1, [Ljava/lang/Object;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    move v3, v2

    .line 19
    move v4, v3

    .line 20
    move v5, v4

    .line 21
    :goto_0
    array-length v6, v0

    .line 22
    if-ge v2, v6, :cond_16

    .line 23
    .line 24
    aget-object v6, v0, v2

    .line 25
    .line 26
    invoke-static {v6}, Ls6;->F0(Ljava/lang/Class;)Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object v7

    .line 30
    const-class v8, Ljava/lang/String;

    .line 31
    .line 32
    const/4 v9, 0x1

    .line 33
    if-eq v7, v8, :cond_f

    .line 34
    .line 35
    const-class v8, Ljava/lang/CharSequence;

    .line 36
    .line 37
    invoke-virtual {v8, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 38
    .line 39
    .line 40
    move-result v8

    .line 41
    if-eqz v8, :cond_1

    .line 42
    .line 43
    goto/16 :goto_4

    .line 44
    .line 45
    :cond_1
    const-class v8, Ljava/lang/Long;

    .line 46
    .line 47
    const-class v10, Ljava/lang/Short;

    .line 48
    .line 49
    const-class v11, Ljava/lang/Integer;

    .line 50
    .line 51
    if-eq v7, v8, :cond_a

    .line 52
    .line 53
    if-eq v7, v11, :cond_a

    .line 54
    .line 55
    if-ne v7, v10, :cond_2

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    const-class v8, Landroid/widget/EditText;

    .line 59
    .line 60
    invoke-virtual {v8, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 61
    .line 62
    .line 63
    move-result v8

    .line 64
    if-eqz v8, :cond_4

    .line 65
    .line 66
    if-nez p2, :cond_3

    .line 67
    .line 68
    goto/16 :goto_a

    .line 69
    .line 70
    :cond_3
    aput-object p2, v1, v2

    .line 71
    .line 72
    goto/16 :goto_9

    .line 73
    .line 74
    :cond_4
    const-class v8, Landroid/view/View;

    .line 75
    .line 76
    invoke-virtual {v8, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 77
    .line 78
    .line 79
    move-result v8

    .line 80
    if-eqz v8, :cond_6

    .line 81
    .line 82
    if-nez p2, :cond_5

    .line 83
    .line 84
    goto/16 :goto_a

    .line 85
    .line 86
    :cond_5
    aput-object p2, v1, v2

    .line 87
    .line 88
    goto/16 :goto_9

    .line 89
    .line 90
    :cond_6
    const-class v8, Landroid/content/Context;

    .line 91
    .line 92
    invoke-virtual {v8, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 93
    .line 94
    .line 95
    move-result v8

    .line 96
    if-eqz v8, :cond_8

    .line 97
    .line 98
    if-nez p1, :cond_7

    .line 99
    .line 100
    goto/16 :goto_a

    .line 101
    .line 102
    :cond_7
    aput-object p1, v1, v2

    .line 103
    .line 104
    goto/16 :goto_9

    .line 105
    .line 106
    :cond_8
    const-class v8, Ljava/lang/Boolean;

    .line 107
    .line 108
    if-ne v7, v8, :cond_9

    .line 109
    .line 110
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 111
    .line 112
    aput-object v6, v1, v2

    .line 113
    .line 114
    goto/16 :goto_9

    .line 115
    .line 116
    :cond_9
    invoke-virtual {v6}, Ljava/lang/Class;->isPrimitive()Z

    .line 117
    .line 118
    .line 119
    move-result v7

    .line 120
    if-eqz v7, :cond_17

    .line 121
    .line 122
    invoke-static {v6}, Ls6;->a0(Ljava/lang/Class;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v6

    .line 126
    aput-object v6, v1, v2

    .line 127
    .line 128
    goto/16 :goto_9

    .line 129
    .line 130
    :cond_a
    :goto_1
    invoke-virtual/range {p5 .. p5}, Ljava/lang/String;->length()I

    .line 131
    .line 132
    .line 133
    move-result v3

    .line 134
    if-lez v3, :cond_b

    .line 135
    .line 136
    move-object/from16 v3, p5

    .line 137
    .line 138
    goto :goto_2

    .line 139
    :cond_b
    move-object/from16 v3, p4

    .line 140
    .line 141
    :goto_2
    invoke-static {v3}, Ls6;->Y(Ljava/lang/String;)J

    .line 142
    .line 143
    .line 144
    move-result-wide v12

    .line 145
    const-wide/16 v14, 0x0

    .line 146
    .line 147
    cmp-long v3, v12, v14

    .line 148
    .line 149
    if-gtz v3, :cond_c

    .line 150
    .line 151
    goto/16 :goto_a

    .line 152
    .line 153
    :cond_c
    if-ne v7, v11, :cond_d

    .line 154
    .line 155
    long-to-int v3, v12

    .line 156
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    aput-object v3, v1, v2

    .line 161
    .line 162
    goto :goto_3

    .line 163
    :cond_d
    if-ne v7, v10, :cond_e

    .line 164
    .line 165
    long-to-int v3, v12

    .line 166
    int-to-short v3, v3

    .line 167
    invoke-static {v3}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 168
    .line 169
    .line 170
    move-result-object v3

    .line 171
    aput-object v3, v1, v2

    .line 172
    .line 173
    goto :goto_3

    .line 174
    :cond_e
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 175
    .line 176
    .line 177
    move-result-object v3

    .line 178
    aput-object v3, v1, v2

    .line 179
    .line 180
    :goto_3
    move v3, v9

    .line 181
    goto :goto_9

    .line 182
    :cond_f
    :goto_4
    if-nez v4, :cond_11

    .line 183
    .line 184
    if-eqz p4, :cond_10

    .line 185
    .line 186
    invoke-virtual/range {p4 .. p4}, Ljava/lang/String;->length()I

    .line 187
    .line 188
    .line 189
    move-result v3

    .line 190
    if-lez v3, :cond_10

    .line 191
    .line 192
    move-object/from16 v3, p4

    .line 193
    .line 194
    goto :goto_5

    .line 195
    :cond_10
    move-object/from16 v3, p5

    .line 196
    .line 197
    :goto_5
    aput-object v3, v1, v2

    .line 198
    .line 199
    move v3, v9

    .line 200
    move v4, v3

    .line 201
    goto :goto_9

    .line 202
    :cond_11
    if-nez v5, :cond_14

    .line 203
    .line 204
    if-eqz p6, :cond_13

    .line 205
    .line 206
    invoke-virtual/range {p6 .. p6}, Ljava/lang/String;->length()I

    .line 207
    .line 208
    .line 209
    move-result v5

    .line 210
    if-nez v5, :cond_12

    .line 211
    .line 212
    goto :goto_6

    .line 213
    :cond_12
    move-object/from16 v5, p6

    .line 214
    .line 215
    goto :goto_7

    .line 216
    :cond_13
    :goto_6
    move-object/from16 v5, p5

    .line 217
    .line 218
    :goto_7
    aput-object v5, v1, v2

    .line 219
    .line 220
    move v5, v9

    .line 221
    goto :goto_9

    .line 222
    :cond_14
    if-nez p3, :cond_15

    .line 223
    .line 224
    const-string v6, ""

    .line 225
    .line 226
    goto :goto_8

    .line 227
    :cond_15
    move-object/from16 v6, p3

    .line 228
    .line 229
    :goto_8
    aput-object v6, v1, v2

    .line 230
    .line 231
    :goto_9
    add-int/lit8 v2, v2, 0x1

    .line 232
    .line 233
    goto/16 :goto_0

    .line 234
    .line 235
    :cond_16
    if-eqz v3, :cond_17

    .line 236
    .line 237
    return-object v1

    .line 238
    :cond_17
    :goto_a
    const/4 v0, 0x0

    .line 239
    return-object v0
.end method

.method public static T(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/Set;)Ljava/lang/String;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p4

    .line 4
    .line 5
    move-object/from16 v7, p5

    .line 6
    .line 7
    if-eqz v0, :cond_11

    .line 8
    .line 9
    const/4 v2, 0x4

    .line 10
    if-gt v1, v2, :cond_11

    .line 11
    .line 12
    if-eqz v7, :cond_11

    .line 13
    .line 14
    invoke-interface {v7, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    goto/16 :goto_8

    .line 21
    .line 22
    :cond_0
    instance-of v2, v0, Ljava/lang/String;

    .line 23
    .line 24
    if-nez v2, :cond_11

    .line 25
    .line 26
    instance-of v2, v0, Ljava/lang/Number;

    .line 27
    .line 28
    if-nez v2, :cond_11

    .line 29
    .line 30
    instance-of v2, v0, Ljava/lang/Boolean;

    .line 31
    .line 32
    if-nez v2, :cond_11

    .line 33
    .line 34
    instance-of v2, v0, Landroid/content/Context;

    .line 35
    .line 36
    if-nez v2, :cond_11

    .line 37
    .line 38
    instance-of v2, v0, Landroid/view/View;

    .line 39
    .line 40
    if-eqz v2, :cond_1

    .line 41
    .line 42
    if-lez v1, :cond_1

    .line 43
    .line 44
    goto/16 :goto_8

    .line 45
    .line 46
    :cond_1
    invoke-interface {v7, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    invoke-static/range {p0 .. p3}, Ls6;->O(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-eqz v2, :cond_2

    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    return-object v0

    .line 64
    :cond_2
    instance-of v2, v0, Landroid/text/Spanned;

    .line 65
    .line 66
    const-class v8, Ljava/lang/Object;

    .line 67
    .line 68
    const/4 v9, 0x0

    .line 69
    if-eqz v2, :cond_6

    .line 70
    .line 71
    check-cast v0, Landroid/text/Spanned;

    .line 72
    .line 73
    invoke-static {v0}, Loc;->a(Landroid/text/Spanned;)[I

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    if-nez v1, :cond_3

    .line 78
    .line 79
    goto/16 :goto_8

    .line 80
    .line 81
    :cond_3
    :try_start_0
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    const/16 v2, 0xa0

    .line 86
    .line 87
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    invoke-interface {v0, v9, v1, v8}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    array-length v1, v0

    .line 96
    :goto_0
    if-ge v9, v1, :cond_5

    .line 97
    .line 98
    aget-object v2, v0, v9

    .line 99
    .line 100
    move-object/from16 v3, p1

    .line 101
    .line 102
    move-object/from16 v4, p2

    .line 103
    .line 104
    move-object/from16 v5, p3

    .line 105
    .line 106
    invoke-static {v2, v3, v4, v5}, Ls6;->O(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 107
    .line 108
    .line 109
    move-result v6

    .line 110
    if-eqz v6, :cond_4

    .line 111
    .line 112
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 120
    return-object v0

    .line 121
    :cond_4
    add-int/lit8 v9, v9, 0x1

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :catchall_0
    :cond_5
    const-string v0, "android.text.Spanned"

    .line 125
    .line 126
    return-object v0

    .line 127
    :cond_6
    move-object/from16 v3, p1

    .line 128
    .line 129
    move-object/from16 v4, p2

    .line 130
    .line 131
    move-object/from16 v5, p3

    .line 132
    .line 133
    instance-of v2, v0, Ljava/lang/Iterable;

    .line 134
    .line 135
    const/4 v10, 0x1

    .line 136
    if-eqz v2, :cond_9

    .line 137
    .line 138
    check-cast v0, Ljava/lang/Iterable;

    .line 139
    .line 140
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 145
    .line 146
    .line 147
    move-result v2

    .line 148
    if-eqz v2, :cond_11

    .line 149
    .line 150
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    add-int/lit8 v6, v1, 0x1

    .line 155
    .line 156
    invoke-static/range {v2 .. v7}, Ls6;->T(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/Set;)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 161
    .line 162
    .line 163
    move-result v3

    .line 164
    if-lez v3, :cond_7

    .line 165
    .line 166
    return-object v2

    .line 167
    :cond_7
    add-int/2addr v9, v10

    .line 168
    const/16 v2, 0x20

    .line 169
    .line 170
    if-lt v9, v2, :cond_8

    .line 171
    .line 172
    goto/16 :goto_8

    .line 173
    .line 174
    :cond_8
    move-object/from16 v3, p1

    .line 175
    .line 176
    move-object/from16 v4, p2

    .line 177
    .line 178
    move-object/from16 v5, p3

    .line 179
    .line 180
    move-object/from16 v7, p5

    .line 181
    .line 182
    goto :goto_1

    .line 183
    :cond_9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    invoke-virtual {v2}, Ljava/lang/Class;->isPrimitive()Z

    .line 188
    .line 189
    .line 190
    move-result v3

    .line 191
    if-nez v3, :cond_11

    .line 192
    .line 193
    invoke-virtual {v2}, Ljava/lang/Class;->isEnum()Z

    .line 194
    .line 195
    .line 196
    move-result v3

    .line 197
    if-nez v3, :cond_11

    .line 198
    .line 199
    invoke-virtual {v2}, Ljava/lang/Class;->isArray()Z

    .line 200
    .line 201
    .line 202
    move-result v3

    .line 203
    if-eqz v3, :cond_a

    .line 204
    .line 205
    goto/16 :goto_8

    .line 206
    .line 207
    :cond_a
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v3

    .line 211
    if-lez v1, :cond_b

    .line 212
    .line 213
    const-string v4, "com.tencent."

    .line 214
    .line 215
    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 216
    .line 217
    .line 218
    move-result v4

    .line 219
    if-nez v4, :cond_b

    .line 220
    .line 221
    const-string v4, "android.text."

    .line 222
    .line 223
    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 224
    .line 225
    .line 226
    move-result v3

    .line 227
    if-nez v3, :cond_b

    .line 228
    .line 229
    goto/16 :goto_8

    .line 230
    .line 231
    :cond_b
    move-object v11, v2

    .line 232
    :goto_2
    if-eqz v11, :cond_11

    .line 233
    .line 234
    if-eq v11, v8, :cond_11

    .line 235
    .line 236
    :try_start_1
    invoke-virtual {v11}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 237
    .line 238
    .line 239
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 240
    :goto_3
    move-object v12, v2

    .line 241
    goto :goto_4

    .line 242
    :catchall_1
    const/4 v2, 0x0

    .line 243
    goto :goto_3

    .line 244
    :goto_4
    if-nez v12, :cond_c

    .line 245
    .line 246
    goto :goto_7

    .line 247
    :cond_c
    array-length v13, v12

    .line 248
    move v14, v9

    .line 249
    move v15, v14

    .line 250
    :goto_5
    if-ge v14, v13, :cond_10

    .line 251
    .line 252
    aget-object v2, v12, v14

    .line 253
    .line 254
    :try_start_2
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 255
    .line 256
    .line 257
    move-result v3

    .line 258
    invoke-static {v3}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 259
    .line 260
    .line 261
    move-result v3

    .line 262
    if-eqz v3, :cond_d

    .line 263
    .line 264
    goto :goto_6

    .line 265
    :cond_d
    invoke-virtual {v2, v10}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 266
    .line 267
    .line 268
    move-object v3, v2

    .line 269
    invoke-virtual {v3, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v2

    .line 273
    add-int/lit8 v6, v1, 0x1

    .line 274
    .line 275
    move-object/from16 v4, p2

    .line 276
    .line 277
    move-object/from16 v5, p3

    .line 278
    .line 279
    move-object/from16 v7, p5

    .line 280
    .line 281
    move-object/from16 v16, v3

    .line 282
    .line 283
    move-object/from16 v3, p1

    .line 284
    .line 285
    invoke-static/range {v2 .. v7}, Ls6;->T(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/Set;)Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v2

    .line 289
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 290
    .line 291
    .line 292
    move-result v3

    .line 293
    if-lez v3, :cond_e

    .line 294
    .line 295
    new-instance v3, Ljava/lang/StringBuilder;

    .line 296
    .line 297
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object v4

    .line 304
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 305
    .line 306
    .line 307
    const-string v4, "."

    .line 308
    .line 309
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 310
    .line 311
    .line 312
    invoke-virtual/range {v16 .. v16}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v4

    .line 316
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 317
    .line 318
    .line 319
    const-string v4, "->"

    .line 320
    .line 321
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 322
    .line 323
    .line 324
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 325
    .line 326
    .line 327
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 331
    return-object v0

    .line 332
    :cond_e
    add-int/lit8 v15, v15, 0x1

    .line 333
    .line 334
    const/16 v2, 0x30

    .line 335
    .line 336
    if-lt v15, v2, :cond_f

    .line 337
    .line 338
    goto :goto_7

    .line 339
    :catchall_2
    :cond_f
    :goto_6
    add-int/lit8 v14, v14, 0x1

    .line 340
    .line 341
    goto :goto_5

    .line 342
    :cond_10
    :goto_7
    invoke-virtual {v11}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 343
    .line 344
    .line 345
    move-result-object v11

    .line 346
    goto :goto_2

    .line 347
    :cond_11
    :goto_8
    const-string v0, ""

    .line 348
    .line 349
    return-object v0
.end method

.method public static U(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object v3

    .line 10
    if-eqz v0, :cond_4

    .line 11
    .line 12
    if-eqz v1, :cond_4

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 15
    .line 16
    .line 17
    move-result v4

    .line 18
    if-nez v4, :cond_0

    .line 19
    .line 20
    goto/16 :goto_3

    .line 21
    .line 22
    :cond_0
    const-string v4, "com.tencent.qqnt.kernelpublic.nativeinterface.Contact"

    .line 23
    .line 24
    const-string v5, "com.tencent.qqnt.kernel.nativeinterface.Contact"

    .line 25
    .line 26
    filled-new-array {v4, v5}, [Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    const/4 v6, 0x0

    .line 31
    :goto_0
    if-ge v6, v2, :cond_4

    .line 32
    .line 33
    :try_start_0
    aget-object v7, v4, v6

    .line 34
    .line 35
    invoke-static {v7, v0}, Lcom/mr/elaris/xposedcompat/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object v7

    .line 39
    invoke-virtual {v7}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    .line 40
    .line 41
    .line 42
    move-result-object v8

    .line 43
    const/4 v9, 0x0

    .line 44
    :goto_1
    array-length v10, v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    const-string v11, ""

    .line 46
    .line 47
    if-ge v9, v10, :cond_3

    .line 48
    .line 49
    :try_start_1
    aget-object v10, v8, v9

    .line 50
    .line 51
    invoke-virtual {v10}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    move-result-object v12

    .line 55
    const/4 v13, 0x1

    .line 56
    invoke-virtual {v10, v13}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 57
    .line 58
    .line 59
    array-length v14, v12
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 60
    sget-object v15, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 61
    .line 62
    move/from16 v16, v2

    .line 63
    .line 64
    const/4 v2, 0x3

    .line 65
    const/16 v17, 0x0

    .line 66
    .line 67
    const-class v5, Ljava/lang/String;

    .line 68
    .line 69
    if-ne v14, v2, :cond_1

    .line 70
    .line 71
    :try_start_2
    aget-object v14, v12, v17

    .line 72
    .line 73
    if-ne v14, v15, :cond_1

    .line 74
    .line 75
    aget-object v14, v12, v13

    .line 76
    .line 77
    if-ne v14, v5, :cond_1

    .line 78
    .line 79
    aget-object v14, v12, v16

    .line 80
    .line 81
    if-ne v14, v5, :cond_1

    .line 82
    .line 83
    filled-new-array {v3, v1, v11}, [Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    invoke-virtual {v10, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    return-object v0

    .line 92
    :cond_1
    array-length v14, v12

    .line 93
    if-ne v14, v2, :cond_2

    .line 94
    .line 95
    aget-object v2, v12, v17

    .line 96
    .line 97
    if-ne v2, v5, :cond_2

    .line 98
    .line 99
    aget-object v2, v12, v13

    .line 100
    .line 101
    if-ne v2, v5, :cond_2

    .line 102
    .line 103
    aget-object v2, v12, v16

    .line 104
    .line 105
    if-ne v2, v15, :cond_2

    .line 106
    .line 107
    filled-new-array {v1, v11, v3}, [Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    invoke-virtual {v10, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    return-object v0

    .line 116
    :cond_2
    add-int/lit8 v9, v9, 0x1

    .line 117
    .line 118
    move/from16 v2, v16

    .line 119
    .line 120
    goto :goto_1

    .line 121
    :catchall_0
    move/from16 v16, v2

    .line 122
    .line 123
    const/16 v17, 0x0

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_3
    move/from16 v16, v2

    .line 127
    .line 128
    const/16 v17, 0x0

    .line 129
    .line 130
    invoke-virtual {v7}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    const-string v5, "chatType"

    .line 135
    .line 136
    invoke-static {v2, v5, v3}, Ls6;->p0(Ljava/lang/Object;Ljava/lang/String;Ljava/io/Serializable;)V

    .line 137
    .line 138
    .line 139
    const-string v5, "type"

    .line 140
    .line 141
    invoke-static {v2, v5, v3}, Ls6;->p0(Ljava/lang/Object;Ljava/lang/String;Ljava/io/Serializable;)V

    .line 142
    .line 143
    .line 144
    const-string v5, "peerUid"

    .line 145
    .line 146
    invoke-static {v2, v5, v1}, Ls6;->p0(Ljava/lang/Object;Ljava/lang/String;Ljava/io/Serializable;)V

    .line 147
    .line 148
    .line 149
    const-string v5, "peerUin"

    .line 150
    .line 151
    invoke-static {v2, v5, v1}, Ls6;->p0(Ljava/lang/Object;Ljava/lang/String;Ljava/io/Serializable;)V

    .line 152
    .line 153
    .line 154
    const-string v5, "uin"

    .line 155
    .line 156
    invoke-static {v2, v5, v1}, Ls6;->p0(Ljava/lang/Object;Ljava/lang/String;Ljava/io/Serializable;)V

    .line 157
    .line 158
    .line 159
    const-string v5, "uid"

    .line 160
    .line 161
    invoke-static {v2, v5, v1}, Ls6;->p0(Ljava/lang/Object;Ljava/lang/String;Ljava/io/Serializable;)V

    .line 162
    .line 163
    .line 164
    const-string v5, "guildId"

    .line 165
    .line 166
    invoke-static {v2, v5, v11}, Ls6;->p0(Ljava/lang/Object;Ljava/lang/String;Ljava/io/Serializable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 167
    .line 168
    .line 169
    return-object v2

    .line 170
    :catchall_1
    :goto_2
    add-int/lit8 v6, v6, 0x1

    .line 171
    .line 172
    move/from16 v2, v16

    .line 173
    .line 174
    goto/16 :goto_0

    .line 175
    .line 176
    :cond_4
    :goto_3
    const/4 v0, 0x0

    .line 177
    return-object v0
.end method

.method public static V()Ljava/util/Set;
    .locals 1

    .line 1
    new-instance v0, Ljava/util/IdentityHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/IdentityHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0
.end method

.method public static W(Ljava/lang/ClassLoader;Ljava/lang/String;[B)Ljava/lang/Object;
    .locals 4

    .line 1
    const-string v0, "mobileqq.service"

    .line 2
    .line 3
    const-string v1, "OidbSvc.0x8fc_2"

    .line 4
    .line 5
    const-class v2, Ljava/lang/String;

    .line 6
    .line 7
    :try_start_0
    const-string v3, "com.tencent.qphone.base.remote.ToServiceMsg"

    .line 8
    .line 9
    invoke-static {v3, p0}, Lcom/mr/elaris/xposedcompat/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    filled-new-array {v2, v2, v2}, [Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {p0, v2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    const/4 v3, 0x1

    .line 22
    invoke-virtual {v2, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 23
    .line 24
    .line 25
    filled-new-array {v0, p1, v1}, [Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {v2, p1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    const-string v0, "putWupBuffer"

    .line 34
    .line 35
    const-class v1, [B

    .line 36
    .line 37
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {p0, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v0, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 46
    .line 47
    .line 48
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    invoke-virtual {v0, p1, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    const-string p2, "attributes"

    .line 56
    .line 57
    invoke-static {p0, p2}, Ls6;->w(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    if-eqz p0, :cond_1

    .line 62
    .line 63
    invoke-virtual {p0, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    instance-of v0, p2, Ljava/util/HashMap;

    .line 71
    .line 72
    if-eqz v0, :cond_0

    .line 73
    .line 74
    check-cast p2, Ljava/util/HashMap;

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_0
    new-instance p2, Ljava/util/HashMap;

    .line 78
    .line 79
    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0, p1, p2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    :goto_0
    const-string p0, "req_pb_protocol_flag"

    .line 86
    .line 87
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 88
    .line 89
    invoke-virtual {p2, p0, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 90
    .line 91
    .line 92
    :cond_1
    return-object p1

    .line 93
    :catchall_0
    move-exception p0

    .line 94
    invoke-static {p0}, Ls6;->C0(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    new-instance p1, Ljava/lang/StringBuilder;

    .line 99
    .line 100
    const-string p2, "group action failed type=\u8bbe\u7f6e\u5934\u8854 reason=ToServiceMsg "

    .line 101
    .line 102
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    const-string p2, ": "

    .line 106
    .line 107
    invoke-static {p0, p1, p2}, La;->d(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    const/4 p0, 0x0

    .line 111
    return-object p0
.end method

.method public static X(Landroid/view/View;)Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    instance-of v2, p0, Landroid/view/View;

    .line 8
    .line 9
    if-eqz v2, :cond_1

    .line 10
    .line 11
    add-int/lit8 v2, v1, 0x1

    .line 12
    .line 13
    const/16 v3, 0x8

    .line 14
    .line 15
    if-ge v1, v3, :cond_1

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-lez v1, :cond_0

    .line 22
    .line 23
    const-string v1, " > "

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    :cond_0
    move-object v1, p0

    .line 29
    check-cast v1, Landroid/view/View;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    :try_start_0
    check-cast p0, Landroid/view/View;

    .line 43
    .line 44
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 45
    .line 46
    .line 47
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    move v1, v2

    .line 49
    goto :goto_0

    .line 50
    :catchall_0
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-static {p0}, Ls6;->m0(Ljava/lang/Object;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0
.end method

.method public static Y(Ljava/lang/String;)J
    .locals 2

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 15
    .line 16
    .line 17
    move-result-wide v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    return-wide v0

    .line 19
    :catchall_0
    :cond_1
    :goto_0
    const-wide/16 v0, 0x0

    .line 20
    .line 21
    return-wide v0
.end method

.method public static Z(Ljava/lang/String;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x5

    .line 10
    const/4 v2, 0x0

    .line 11
    if-lt v0, v1, :cond_5

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/16 v1, 0x20

    .line 18
    .line 19
    if-le v0, v1, :cond_0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    move v0, v2

    .line 23
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-ge v0, v1, :cond_4

    .line 28
    .line 29
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    const/16 v3, 0x30

    .line 34
    .line 35
    if-lt v1, v3, :cond_1

    .line 36
    .line 37
    const/16 v3, 0x39

    .line 38
    .line 39
    if-le v1, v3, :cond_3

    .line 40
    .line 41
    :cond_1
    const/16 v3, 0x5f

    .line 42
    .line 43
    if-eq v1, v3, :cond_3

    .line 44
    .line 45
    const/16 v3, 0x2d

    .line 46
    .line 47
    if-eq v1, v3, :cond_3

    .line 48
    .line 49
    const/16 v3, 0x61

    .line 50
    .line 51
    if-lt v1, v3, :cond_2

    .line 52
    .line 53
    const/16 v3, 0x7a

    .line 54
    .line 55
    if-le v1, v3, :cond_3

    .line 56
    .line 57
    :cond_2
    const/16 v3, 0x41

    .line 58
    .line 59
    if-lt v1, v3, :cond_5

    .line 60
    .line 61
    const/16 v3, 0x5a

    .line 62
    .line 63
    if-le v1, v3, :cond_3

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_3
    add-int/lit8 v0, v0, 0x1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_4
    const/4 p0, 0x1

    .line 70
    return p0

    .line 71
    :cond_5
    :goto_1
    return v2
.end method

.method public static a(Landroid/content/Context;Landroid/app/Activity;Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 16

    move-object/from16 v0, p6

    move-object/from16 v6, p7

    .line 1
    const-string v7, "\u7981\u8a00"

    const-string v8, "group action failed type="

    const-string v9, ", seconds="

    const-string v10, " seconds="

    const-string v11, "group action submitted type="

    const-string v1, "group action success type="

    :try_start_0
    const-string v2, "\u827e\u7279"

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    if-eqz v2, :cond_2

    if-nez p2, :cond_0

    .line 2
    :try_start_1
    invoke-virtual/range {p1 .. p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual/range {p1 .. p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-object/from16 v7, p2

    goto :goto_1

    :cond_0
    move-object/from16 v0, p2

    :goto_0
    move-object v7, v0

    .line 4
    :goto_1
    :try_start_2
    new-instance v0, Ls2;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    :try_start_3
    invoke-direct/range {v0 .. v5}, Ls2;-><init>(Landroid/app/Activity;Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    if-eqz v7, :cond_1

    const-wide/16 v1, 0x8c

    .line 5
    :try_start_4
    invoke-virtual {v7, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    goto/16 :goto_6

    .line 6
    :cond_1
    invoke-virtual {v0}, Ls2;->run()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto/16 :goto_6

    .line 7
    :catchall_1
    :try_start_5
    invoke-virtual {v0}, Ls2;->run()V

    goto/16 :goto_6

    :cond_2
    move-object/from16 v2, p1

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    .line 8
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const-wide/16 v12, 0x0

    cmp-long v5, p8, v12

    if-gtz v5, :cond_3

    .line 9
    invoke-static/range {p0 .. p5}, Ls6;->s0(Landroid/content/Context;Landroid/app/Activity;Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :catchall_2
    move-exception v0

    goto/16 :goto_5

    .line 10
    :cond_3
    const-string v5, "\u8bbe\u7f6e\u5934\u8854"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    move-object/from16 v5, p5

    .line 11
    invoke-static {v2, v3, v4, v5}, Ls6;->r0(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 12
    :cond_4
    const-string v5, "\u64a4\u56de\u8be5\u6210\u5458\u6d88\u606f"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    const-string v12, "avatar-action"

    const-string v13, " groupUin="

    if-eqz v5, :cond_8

    .line 13
    const-string v5, " msgId="

    if-eqz v3, :cond_7

    :try_start_6
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v7

    if-eqz v7, :cond_7

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v7

    if-nez v7, :cond_5

    goto :goto_2

    .line 14
    :cond_5
    invoke-static {v2, v3, v0}, Ls6;->k0(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 15
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 16
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", msgId="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v4, v12, v0}, Li5;->W0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    const-string v0, "\u5df2\u53d1\u8d77\u64a4\u56de"

    invoke-static {v0}, Ls6;->y0(Ljava/lang/String;)V

    return-void

    .line 18
    :cond_6
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " reason=recall api unresolved groupUin="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 19
    const-string v0, "\u672a\u627e\u5230 QQ \u64a4\u56de\u63a5\u53e3"

    invoke-static {v0}, Ls6;->y0(Ljava/lang/String;)V

    return-void

    .line 20
    :cond_7
    :goto_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " reason=missing groupUin/msgId groupUin="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 21
    const-string v0, "\u672a\u83b7\u53d6\u5230\u53ef\u64a4\u56de\u7684\u6d88\u606f"

    invoke-static {v0}, Ls6;->y0(Ljava/lang/String;)V

    return-void

    :cond_8
    if-eqz v4, :cond_d

    .line 22
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    if-nez v0, :cond_9

    goto/16 :goto_4

    :cond_9
    move-object v0, v2

    move-object v1, v3

    move-object v2, v4

    move-object v3, v6

    move-wide/from16 v4, p8

    .line 23
    :try_start_7
    invoke-static/range {v0 .. v5}, Ls6;->J(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Z

    move-result v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    move-object v3, v1

    move-wide v14, v4

    move-object v4, v2

    move-wide v1, v14

    const-string v5, " targetUin="

    if-eqz v0, :cond_c

    .line 24
    :try_start_8
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    const-string v11, ""

    if-eqz v5, :cond_a

    :try_start_9
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    goto :goto_3

    :cond_a
    move-object v5, v11

    :goto_3
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 26
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 27
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_b

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    :cond_b
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v4, v12, v0}, Li5;->W0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 28
    :cond_c
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " reason=qq group management api unresolved groupUin="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 29
    const-string v0, "avatar-action-unresolved"

    invoke-static {v3, v4, v0, v6}, Li5;->W0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    const-string v0, "\u672a\u627e\u5230 QQ \u7fa4\u7ba1\u63a5\u53e3"

    invoke-static {v0}, Ls6;->y0(Ljava/lang/String;)V

    return-void

    :catchall_3
    move-exception v0

    move-object v6, v3

    move-object v3, v1

    goto :goto_5

    .line 31
    :cond_d
    :goto_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " reason=missing targetUin"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 32
    const-string v0, "\u672a\u83b7\u53d6\u5230\u6210\u5458 UID"

    invoke-static {v0}, Ls6;->y0(Ljava/lang/String;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    return-void

    :catchall_4
    move-exception v0

    move-object/from16 v3, p3

    .line 33
    :goto_5
    const-string v1, " reason="

    .line 34
    invoke-static {v8, v6, v1}, La;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 35
    const-string v2, ": "

    .line 36
    invoke-static {v0, v1, v2}, La;->d(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 37
    const-string v1, "avatar-menu-action"

    invoke-static {v3, v1, v0}, Li5;->Z0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_6
    return-void
.end method

.method public static a0(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 2

    .line 1
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 2
    .line 3
    if-ne p0, v0, :cond_0

    .line 4
    .line 5
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 9
    .line 10
    if-ne p0, v0, :cond_1

    .line 11
    .line 12
    const-wide/16 v0, 0x0

    .line 13
    .line 14
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :cond_1
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 20
    .line 21
    if-ne p0, v0, :cond_2

    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :cond_2
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 30
    .line 31
    if-ne p0, v0, :cond_3

    .line 32
    .line 33
    const-wide/16 v0, 0x0

    .line 34
    .line 35
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :cond_3
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 41
    .line 42
    const/4 v1, 0x0

    .line 43
    if-ne p0, v0, :cond_4

    .line 44
    .line 45
    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0

    .line 50
    :cond_4
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 51
    .line 52
    if-ne p0, v0, :cond_5

    .line 53
    .line 54
    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0

    .line 59
    :cond_5
    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 60
    .line 61
    if-ne p0, v0, :cond_6

    .line 62
    .line 63
    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    return-object p0

    .line 68
    :cond_6
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    return-object p0
.end method

.method public static b(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    :catchall_0
    :cond_0
    new-instance v1, Ll6;

    .line 17
    .line 18
    move-object v2, p0

    .line 19
    move-object v7, p1

    .line 20
    move-object v5, p2

    .line 21
    move-object v4, p3

    .line 22
    move-object v3, p4

    .line 23
    move-object v6, p5

    .line 24
    invoke-direct/range {v1 .. v7}, Ll6;-><init>(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    const-wide/16 p0, 0x26c

    .line 30
    .line 31
    :try_start_1
    invoke-virtual {v0, v1, p0, p1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    invoke-virtual {v1}, Ll6;->run()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catchall_1
    invoke-virtual {v1}, Ll6;->run()V

    .line 40
    .line 41
    .line 42
    :goto_0
    return-void
.end method

.method public static b0(I[B)[B
    .locals 6

    .line 1
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    new-array p1, v1, [B

    .line 10
    .line 11
    :cond_0
    int-to-long v2, p0

    .line 12
    const/4 p0, 0x3

    .line 13
    shl-long/2addr v2, p0

    .line 14
    const-wide/16 v4, 0x2

    .line 15
    .line 16
    or-long/2addr v2, v4

    .line 17
    invoke-static {v0, v2, v3}, Ls6;->H0(Ljava/io/ByteArrayOutputStream;J)V

    .line 18
    .line 19
    .line 20
    array-length p0, p1

    .line 21
    int-to-long v2, p0

    .line 22
    invoke-static {v0, v2, v3}, Ls6;->H0(Ljava/io/ByteArrayOutputStream;J)V

    .line 23
    .line 24
    .line 25
    array-length p0, p1

    .line 26
    invoke-virtual {v0, p1, v1, p0}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0
.end method

.method public static c(Landroid/app/Activity;Ljava/lang/String;Landroid/view/View$OnClickListener;)Landroid/widget/LinearLayout;
    .locals 8

    .line 1
    new-instance v0, Landroid/widget/LinearLayout;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 8
    .line 9
    .line 10
    const/16 v2, 0x10

    .line 11
    .line 12
    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 13
    .line 14
    .line 15
    const/high16 v2, 0x41600000    # 14.0f

    .line 16
    .line 17
    invoke-static {p0, v2}, Ls6;->u(Landroid/content/Context;F)I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    const/high16 v4, 0x40000000    # 2.0f

    .line 22
    .line 23
    invoke-static {p0, v4}, Ls6;->u(Landroid/content/Context;F)I

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    invoke-static {p0, v2}, Ls6;->u(Landroid/content/Context;F)I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    invoke-static {p0, v4}, Ls6;->u(Landroid/content/Context;F)I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    invoke-virtual {v0, v3, v5, v2, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 36
    .line 37
    .line 38
    const/high16 v2, 0x42300000    # 44.0f

    .line 39
    .line 40
    invoke-static {p0, v2}, Ls6;->u(Landroid/content/Context;F)I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    invoke-virtual {v0, v2}, Landroid/view/View;->setMinimumHeight(I)V

    .line 45
    .line 46
    .line 47
    new-instance v2, Landroid/graphics/drawable/StateListDrawable;

    .line 48
    .line 49
    invoke-direct {v2}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    .line 50
    .line 51
    .line 52
    const v3, 0x10100a7

    .line 53
    .line 54
    .line 55
    filled-new-array {v3}, [I

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    const/16 v4, 0xf1

    .line 60
    .line 61
    const/16 v5, 0xf5

    .line 62
    .line 63
    const/16 v6, 0xef

    .line 64
    .line 65
    invoke-static {v6, v4, v5}, Landroid/graphics/Color;->rgb(III)I

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    const/high16 v5, 0x41880000    # 17.0f

    .line 70
    .line 71
    invoke-static {p0, v5}, Ls6;->u(Landroid/content/Context;F)I

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    new-instance v7, Landroid/graphics/drawable/GradientDrawable;

    .line 76
    .line 77
    invoke-direct {v7}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v7, v4}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 81
    .line 82
    .line 83
    int-to-float v4, v6

    .line 84
    invoke-virtual {v7, v4}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2, v3, v7}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 88
    .line 89
    .line 90
    const v3, 0x10100a1

    .line 91
    .line 92
    .line 93
    filled-new-array {v3}, [I

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    const/16 v4, 0xf4

    .line 98
    .line 99
    const/16 v6, 0xf7

    .line 100
    .line 101
    const/16 v7, 0xf2

    .line 102
    .line 103
    invoke-static {v7, v4, v6}, Landroid/graphics/Color;->rgb(III)I

    .line 104
    .line 105
    .line 106
    move-result v4

    .line 107
    invoke-static {p0, v5}, Ls6;->u(Landroid/content/Context;F)I

    .line 108
    .line 109
    .line 110
    move-result v5

    .line 111
    new-instance v6, Landroid/graphics/drawable/GradientDrawable;

    .line 112
    .line 113
    invoke-direct {v6}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v6, v4}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 117
    .line 118
    .line 119
    int-to-float v4, v5

    .line 120
    invoke-virtual {v6, v4}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v2, v3, v6}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 124
    .line 125
    .line 126
    new-array v3, v1, [I

    .line 127
    .line 128
    new-instance v4, Landroid/graphics/drawable/ColorDrawable;

    .line 129
    .line 130
    invoke-direct {v4, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v2, v3, v4}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 137
    .line 138
    .line 139
    const/high16 v2, 0x41700000    # 15.0f

    .line 140
    .line 141
    sget v3, Ls6;->b:I

    .line 142
    .line 143
    invoke-static {p0, p1, v2, v3, v1}, Ls6;->x0(Landroid/app/Activity;Ljava/lang/String;FIZ)Landroid/widget/TextView;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    const/4 v2, 0x1

    .line 148
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 149
    .line 150
    .line 151
    sget-object v2, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 152
    .line 153
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 154
    .line 155
    .line 156
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 157
    .line 158
    const/4 v3, -0x2

    .line 159
    const/high16 v4, 0x3f800000    # 1.0f

    .line 160
    .line 161
    invoke-direct {v2, v1, v3, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0, p1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 165
    .line 166
    .line 167
    const/16 p1, 0xd3

    .line 168
    .line 169
    const/16 v2, 0xde

    .line 170
    .line 171
    const/16 v3, 0xcc

    .line 172
    .line 173
    invoke-static {v3, p1, v2}, Landroid/graphics/Color;->rgb(III)I

    .line 174
    .line 175
    .line 176
    move-result p1

    .line 177
    const-string v2, "\u203a"

    .line 178
    .line 179
    const/high16 v3, 0x41a00000    # 20.0f

    .line 180
    .line 181
    invoke-static {p0, v2, v3, p1, v1}, Ls6;->x0(Landroid/app/Activity;Ljava/lang/String;FIZ)Landroid/widget/TextView;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    const/16 v1, 0x11

    .line 186
    .line 187
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setGravity(I)V

    .line 188
    .line 189
    .line 190
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 191
    .line 192
    invoke-static {p0, v3}, Ls6;->u(Landroid/content/Context;F)I

    .line 193
    .line 194
    .line 195
    move-result v2

    .line 196
    const/high16 v3, 0x41d00000    # 26.0f

    .line 197
    .line 198
    invoke-static {p0, v3}, Ls6;->u(Landroid/content/Context;F)I

    .line 199
    .line 200
    .line 201
    move-result p0

    .line 202
    invoke-direct {v1, v2, p0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v0, p1, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v0, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 209
    .line 210
    .line 211
    return-object v0
.end method

.method public static varargs c0([[B)[B
    .locals 5

    .line 1
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    move v2, v1

    .line 8
    :goto_0
    array-length v3, p0

    .line 9
    if-ge v2, v3, :cond_1

    .line 10
    .line 11
    aget-object v3, p0, v2

    .line 12
    .line 13
    if-eqz v3, :cond_0

    .line 14
    .line 15
    array-length v4, v3

    .line 16
    if-lez v4, :cond_0

    .line 17
    .line 18
    array-length v4, v3

    .line 19
    invoke-virtual {v0, v3, v1, v4}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 20
    .line 21
    .line 22
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method

.method public static d(Ljava/util/ArrayList;Ljava/lang/Object;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    :cond_0
    return-void
.end method

.method public static d0(I[B)Ljava/lang/String;
    .locals 11

    .line 1
    if-eqz p1, :cond_5

    .line 2
    .line 3
    if-gtz p0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    new-array v0, v0, [I

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    aput v1, v0, v1

    .line 11
    .line 12
    :cond_1
    aget v2, v0, v1

    .line 13
    .line 14
    array-length v3, p1

    .line 15
    if-ge v2, v3, :cond_5

    .line 16
    .line 17
    const-wide/16 v2, -0x1

    .line 18
    .line 19
    invoke-static {p1, v0, v2, v3}, Ls6;->h0([B[IJ)J

    .line 20
    .line 21
    .line 22
    move-result-wide v4

    .line 23
    const-wide/16 v6, 0x0

    .line 24
    .line 25
    cmp-long v8, v4, v6

    .line 26
    .line 27
    if-gez v8, :cond_2

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    const/4 v8, 0x3

    .line 31
    ushr-long v8, v4, v8

    .line 32
    .line 33
    long-to-int v8, v8

    .line 34
    const-wide/16 v9, 0x7

    .line 35
    .line 36
    and-long/2addr v4, v9

    .line 37
    long-to-int v4, v4

    .line 38
    if-ne v8, p0, :cond_4

    .line 39
    .line 40
    const/4 v5, 0x2

    .line 41
    if-ne v4, v5, :cond_4

    .line 42
    .line 43
    invoke-static {p1, v0, v2, v3}, Ls6;->h0([B[IJ)J

    .line 44
    .line 45
    .line 46
    move-result-wide v2

    .line 47
    cmp-long p0, v2, v6

    .line 48
    .line 49
    if-ltz p0, :cond_5

    .line 50
    .line 51
    array-length p0, p1

    .line 52
    aget v4, v0, v1

    .line 53
    .line 54
    sub-int/2addr p0, v4

    .line 55
    int-to-long v5, p0

    .line 56
    cmp-long p0, v2, v5

    .line 57
    .line 58
    if-lez p0, :cond_3

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    new-instance p0, Ljava/lang/String;

    .line 62
    .line 63
    long-to-int v2, v2

    .line 64
    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 65
    .line 66
    invoke-direct {p0, p1, v4, v2, v3}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 67
    .line 68
    .line 69
    aget p1, v0, v1

    .line 70
    .line 71
    add-int/2addr p1, v2

    .line 72
    aput p1, v0, v1

    .line 73
    .line 74
    return-object p0

    .line 75
    :cond_4
    invoke-static {p1, v0, v4}, Ls6;->t0([B[II)Z

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    if-nez v2, :cond_1

    .line 80
    .line 81
    :cond_5
    :goto_0
    const-string p0, ""

    .line 82
    .line 83
    return-object p0
.end method

.method public static e(Ljava/lang/Class;)Ljava/util/ArrayList;
    .locals 7

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/HashSet;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 9
    .line 10
    .line 11
    :goto_0
    if-eqz p0, :cond_4

    .line 12
    .line 13
    const-class v2, Ljava/lang/Object;

    .line 14
    .line 15
    if-eq p0, v2, :cond_4

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    const/4 v3, 0x0

    .line 22
    move v4, v3

    .line 23
    :goto_1
    array-length v5, v2

    .line 24
    if-ge v4, v5, :cond_1

    .line 25
    .line 26
    aget-object v5, v2, v4

    .line 27
    .line 28
    invoke-static {v5}, Ls6;->R(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v6

    .line 32
    invoke-virtual {v1, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    if-eqz v6, :cond_0

    .line 37
    .line 38
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    :goto_2
    array-length v4, v2

    .line 49
    if-ge v3, v4, :cond_3

    .line 50
    .line 51
    aget-object v4, v2, v3

    .line 52
    .line 53
    invoke-static {v4}, Ls6;->R(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    invoke-virtual {v1, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    if-eqz v5, :cond_2

    .line 62
    .line 63
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    goto :goto_0

    .line 74
    :cond_4
    return-object v0
.end method

.method public static e0(IJ)[B
    .locals 3

    .line 1
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 4
    .line 5
    .line 6
    int-to-long v1, p0

    .line 7
    const/4 p0, 0x3

    .line 8
    shl-long/2addr v1, p0

    .line 9
    invoke-static {v0, v1, v2}, Ls6;->H0(Ljava/io/ByteArrayOutputStream;J)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0, p1, p2}, Ls6;->H0(Ljava/io/ByteArrayOutputStream;J)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public static f(Ljava/lang/ClassLoader;)Ljava/lang/Object;
    .locals 3

    .line 1
    const-string v0, "getRuntime"

    .line 2
    .line 3
    :try_start_0
    const-string v1, "com.tencent.common.app.BaseApplicationImpl"

    .line 4
    .line 5
    invoke-static {v1, p0}, Lcom/mr/elaris/xposedcompat/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "getApplication"

    .line 10
    .line 11
    filled-new-array {v2}, [Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-static {v1, v2}, Ls6;->n(Ljava/lang/Class;[Ljava/lang/String;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    filled-new-array {v0}, [Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-static {v1, v2}, Ls6;->m(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    return-object v1

    .line 30
    :catchall_0
    :cond_0
    :try_start_1
    const-string v1, "mqq.app.MobileQQ"

    .line 31
    .line 32
    invoke-static {v1, p0}, Lcom/mr/elaris/xposedcompat/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    const-string v1, "getContext"

    .line 37
    .line 38
    const-string v2, "getMobileQQ"

    .line 39
    .line 40
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-static {p0, v1}, Ls6;->n(Ljava/lang/Class;[Ljava/lang/String;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    filled-new-array {v0}, [Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-static {v1, v0}, Ls6;->m(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    if-eqz v0, :cond_1

    .line 57
    .line 58
    return-object v0

    .line 59
    :cond_1
    const-string v0, "mAppRuntime"

    .line 60
    .line 61
    invoke-static {p0, v0}, Ls6;->w(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    if-eqz p0, :cond_2

    .line 66
    .line 67
    if-eqz v1, :cond_2

    .line 68
    .line 69
    const/4 v0, 0x1

    .line 70
    invoke-virtual {p0, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 77
    if-eqz p0, :cond_2

    .line 78
    .line 79
    return-object p0

    .line 80
    :catchall_1
    :cond_2
    const/4 p0, 0x0

    .line 81
    return-object p0
.end method

.method public static f0(I[B)J
    .locals 9

    .line 1
    const-wide/high16 v0, -0x8000000000000000L

    .line 2
    .line 3
    if-eqz p1, :cond_4

    .line 4
    .line 5
    if-gtz p0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v2, 0x0

    .line 9
    filled-new-array {v2}, [I

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    :cond_1
    aget v4, v3, v2

    .line 14
    .line 15
    array-length v5, p1

    .line 16
    if-ge v4, v5, :cond_4

    .line 17
    .line 18
    const-wide/16 v4, -0x1

    .line 19
    .line 20
    invoke-static {p1, v3, v4, v5}, Ls6;->h0([B[IJ)J

    .line 21
    .line 22
    .line 23
    move-result-wide v4

    .line 24
    const-wide/16 v6, 0x0

    .line 25
    .line 26
    cmp-long v6, v4, v6

    .line 27
    .line 28
    if-gez v6, :cond_2

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    const/4 v6, 0x3

    .line 32
    ushr-long v6, v4, v6

    .line 33
    .line 34
    long-to-int v6, v6

    .line 35
    const-wide/16 v7, 0x7

    .line 36
    .line 37
    and-long/2addr v4, v7

    .line 38
    long-to-int v4, v4

    .line 39
    if-ne v6, p0, :cond_3

    .line 40
    .line 41
    if-nez v4, :cond_3

    .line 42
    .line 43
    invoke-static {p1, v3, v0, v1}, Ls6;->h0([B[IJ)J

    .line 44
    .line 45
    .line 46
    move-result-wide p0

    .line 47
    return-wide p0

    .line 48
    :cond_3
    invoke-static {p1, v3, v4}, Ls6;->t0([B[II)Z

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    if-nez v4, :cond_1

    .line 53
    .line 54
    :cond_4
    :goto_0
    return-wide v0
.end method

.method public static g(Landroid/app/Dialog;)V
    .locals 4

    .line 1
    :try_start_0
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v1, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 15
    .line 16
    .line 17
    const v1, 0x3ecccccd    # 0.4f

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/view/Window;->setDimAmount(F)V

    .line 21
    .line 22
    .line 23
    const/4 v1, 0x2

    .line 24
    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    invoke-virtual {v1, v2, v2, v2, v2}, Landroid/view/View;->setPadding(IIII)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundColor(I)V

    .line 37
    .line 38
    .line 39
    :cond_1
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    const/high16 v1, 0x43820000    # 260.0f

    .line 44
    .line 45
    invoke-static {p0, v1}, Ls6;->u(Landroid/content/Context;F)I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    iget v2, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 58
    .line 59
    const/high16 v3, 0x42e00000    # 112.0f

    .line 60
    .line 61
    invoke-static {p0, v3}, Ls6;->u(Landroid/content/Context;F)I

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    sub-int/2addr v2, v3

    .line 66
    const/high16 v3, 0x43d20000    # 420.0f

    .line 67
    .line 68
    invoke-static {p0, v3}, Ls6;->u(Landroid/content/Context;F)I

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    invoke-static {v2, p0}, Ljava/lang/Math;->min(II)I

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    invoke-static {v1, p0}, Ljava/lang/Math;->max(II)I

    .line 77
    .line 78
    .line 79
    move-result p0

    .line 80
    const/4 v1, -0x2

    .line 81
    invoke-virtual {v0, p0, v1}, Landroid/view/Window;->setLayout(II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    .line 83
    .line 84
    :catchall_0
    :goto_0
    return-void
.end method

.method public static g0(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Object;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_1

    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    :try_start_0
    const-string v1, "com.tencent.mobileqq.qroute.QRoute"

    .line 12
    .line 13
    invoke-static {v1, p0}, Lcom/mr/elaris/xposedcompat/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-static {p1, p0}, Lcom/mr/elaris/xposedcompat/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const-string p1, "api"

    .line 22
    .line 23
    const-class v2, Ljava/lang/Class;

    .line 24
    .line 25
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v1, p1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    const/4 v1, 0x1

    .line 34
    invoke-virtual {p1, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 35
    .line 36
    .line 37
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-virtual {p1, v0, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    return-object p0

    .line 46
    :catchall_0
    :cond_1
    :goto_0
    return-object v0
.end method

.method public static h([Ljava/lang/Object;)Ljava/lang/String;
    .locals 3

    .line 1
    if-eqz p0, :cond_3

    .line 2
    .line 3
    array-length v0, p0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    goto :goto_1

    .line 7
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    :goto_0
    array-length v2, p0

    .line 14
    if-ge v1, v2, :cond_2

    .line 15
    .line 16
    if-lez v1, :cond_1

    .line 17
    .line 18
    const/16 v2, 0x2c

    .line 19
    .line 20
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    :cond_1
    aget-object v2, p0, v1

    .line 24
    .line 25
    invoke-static {v2}, Ls6;->m0(Ljava/lang/Object;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    add-int/lit8 v1, v1, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :cond_3
    :goto_1
    const-string p0, ""

    .line 41
    .line 42
    return-object p0
.end method

.method public static h0([B[IJ)J
    .locals 7

    .line 1
    if-eqz p0, :cond_2

    .line 2
    .line 3
    array-length v0, p1

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    goto :goto_1

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    const-wide/16 v1, 0x0

    .line 9
    .line 10
    move v3, v0

    .line 11
    :goto_0
    aget v4, p1, v0

    .line 12
    .line 13
    array-length v5, p0

    .line 14
    if-ge v4, v5, :cond_2

    .line 15
    .line 16
    const/16 v5, 0x40

    .line 17
    .line 18
    if-ge v3, v5, :cond_2

    .line 19
    .line 20
    add-int/lit8 v5, v4, 0x1

    .line 21
    .line 22
    aput v5, p1, v0

    .line 23
    .line 24
    aget-byte v4, p0, v4

    .line 25
    .line 26
    and-int/lit8 v5, v4, 0x7f

    .line 27
    .line 28
    int-to-long v5, v5

    .line 29
    shl-long/2addr v5, v3

    .line 30
    or-long/2addr v1, v5

    .line 31
    and-int/lit16 v4, v4, 0x80

    .line 32
    .line 33
    if-nez v4, :cond_1

    .line 34
    .line 35
    return-wide v1

    .line 36
    :cond_1
    add-int/lit8 v3, v3, 0x7

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    :goto_1
    return-wide p2
.end method

.method public static i(Landroid/app/Activity;Landroid/app/Dialog;Landroid/content/Context;Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/widget/LinearLayout;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    new-instance v10, Landroid/widget/LinearLayout;

    .line 4
    .line 5
    invoke-direct {v10, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    const/4 v11, 0x1

    .line 9
    invoke-virtual {v10, v11}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 10
    .line 11
    .line 12
    const-string v0, "elaris_dialog_surface"

    .line 13
    .line 14
    invoke-virtual {v10, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    const/4 v9, 0x0

    .line 18
    invoke-virtual {v10, v9}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v10, v9}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v10, v9, v9, v9, v9}, Landroid/view/View;->setPadding(IIII)V

    .line 25
    .line 26
    .line 27
    invoke-static {v1}, Ls6;->s(Landroid/app/Activity;)Landroid/graphics/drawable/GradientDrawable;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v10, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 32
    .line 33
    .line 34
    const/high16 v0, 0x41880000    # 17.0f

    .line 35
    .line 36
    sget v2, Ls6;->b:I

    .line 37
    .line 38
    const-string v3, "\u7fa4\u7ba1\u83dc\u5355"

    .line 39
    .line 40
    invoke-static {v1, v3, v0, v2, v11}, Ls6;->x0(Landroid/app/Activity;Ljava/lang/String;FIZ)Landroid/widget/TextView;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const/high16 v2, 0x41600000    # 14.0f

    .line 45
    .line 46
    invoke-static {v1, v2}, Ls6;->u(Landroid/content/Context;F)I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    const/high16 v4, 0x41400000    # 12.0f

    .line 51
    .line 52
    invoke-static {v1, v4}, Ls6;->u(Landroid/content/Context;F)I

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    invoke-static {v1, v2}, Ls6;->u(Landroid/content/Context;F)I

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    const/high16 v6, 0x3f800000    # 1.0f

    .line 61
    .line 62
    invoke-static {v1, v6}, Ls6;->u(Landroid/content/Context;F)I

    .line 63
    .line 64
    .line 65
    move-result v6

    .line 66
    invoke-virtual {v0, v3, v4, v5, v6}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v10, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 70
    .line 71
    .line 72
    move-object/from16 v6, p5

    .line 73
    .line 74
    move-object/from16 v7, p6

    .line 75
    .line 76
    invoke-static {v1, v7, v6}, Ls6;->v0(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    const/high16 v4, 0x40c00000    # 6.0f

    .line 85
    .line 86
    if-lez v3, :cond_0

    .line 87
    .line 88
    const/high16 v3, 0x41500000    # 13.0f

    .line 89
    .line 90
    sget v5, Ls6;->c:I

    .line 91
    .line 92
    invoke-static {v1, v0, v3, v5, v9}, Ls6;->x0(Landroid/app/Activity;Ljava/lang/String;FIZ)Landroid/widget/TextView;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-virtual {v0, v11}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 97
    .line 98
    .line 99
    sget-object v3, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 100
    .line 101
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 102
    .line 103
    .line 104
    invoke-static {v1, v2}, Ls6;->u(Landroid/content/Context;F)I

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    invoke-static {v1, v2}, Ls6;->u(Landroid/content/Context;F)I

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    invoke-static {v1, v4}, Ls6;->u(Landroid/content/Context;F)I

    .line 113
    .line 114
    .line 115
    move-result v5

    .line 116
    invoke-virtual {v0, v3, v9, v2, v5}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v10, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 120
    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_0
    new-instance v0, Landroid/widget/Space;

    .line 124
    .line 125
    invoke-direct {v0, v1}, Landroid/widget/Space;-><init>(Landroid/content/Context;)V

    .line 126
    .line 127
    .line 128
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 129
    .line 130
    invoke-static {v1, v4}, Ls6;->u(Landroid/content/Context;F)I

    .line 131
    .line 132
    .line 133
    move-result v3

    .line 134
    invoke-direct {v2, v11, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v10, v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 138
    .line 139
    .line 140
    :goto_0
    invoke-static {v1}, Ls6;->t(Landroid/app/Activity;)Landroid/view/View;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    invoke-virtual {v10, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 145
    .line 146
    .line 147
    new-instance v12, Landroid/widget/ScrollView;

    .line 148
    .line 149
    invoke-direct {v12, v1}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    .line 150
    .line 151
    .line 152
    const/4 v0, 0x2

    .line 153
    invoke-virtual {v12, v0}, Landroid/view/View;->setOverScrollMode(I)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v12, v9}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 157
    .line 158
    .line 159
    invoke-static {v1, v4}, Ls6;->u(Landroid/content/Context;F)I

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    invoke-virtual {v12, v9, v9, v9, v0}, Landroid/view/View;->setPadding(IIII)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v12, v9}, Landroid/view/View;->setBackgroundColor(I)V

    .line 167
    .line 168
    .line 169
    new-instance v13, Landroid/widget/LinearLayout;

    .line 170
    .line 171
    invoke-direct {v13, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v13, v11}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 175
    .line 176
    .line 177
    new-instance v0, Lo6;

    .line 178
    .line 179
    move-object/from16 v2, p1

    .line 180
    .line 181
    move-object/from16 v3, p2

    .line 182
    .line 183
    move-object/from16 v4, p3

    .line 184
    .line 185
    move-object/from16 v5, p4

    .line 186
    .line 187
    move-object/from16 v8, p7

    .line 188
    .line 189
    invoke-direct/range {v0 .. v8}, Lo6;-><init>(Landroid/app/Activity;Landroid/app/Dialog;Landroid/content/Context;Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    const-string v2, "\u827e\u7279"

    .line 193
    .line 194
    invoke-static {v1, v2, v0}, Ls6;->c(Landroid/app/Activity;Ljava/lang/String;Landroid/view/View$OnClickListener;)Landroid/widget/LinearLayout;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    invoke-virtual {v13, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 199
    .line 200
    .line 201
    invoke-static {v1}, Ls6;->t(Landroid/app/Activity;)Landroid/view/View;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    invoke-virtual {v13, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 206
    .line 207
    .line 208
    move v14, v9

    .line 209
    :goto_1
    sget-object v15, Ls6;->g:[Ljava/lang/String;

    .line 210
    .line 211
    array-length v0, v15

    .line 212
    if-ge v14, v0, :cond_2

    .line 213
    .line 214
    aget-object v9, v15, v14

    .line 215
    .line 216
    new-instance v0, Lp6;

    .line 217
    .line 218
    move-object/from16 v2, p2

    .line 219
    .line 220
    move-object/from16 v4, p3

    .line 221
    .line 222
    move-object/from16 v5, p4

    .line 223
    .line 224
    move-object/from16 v6, p5

    .line 225
    .line 226
    move-object/from16 v7, p6

    .line 227
    .line 228
    move-object/from16 v8, p7

    .line 229
    .line 230
    move-object v3, v1

    .line 231
    move-object/from16 v1, p1

    .line 232
    .line 233
    invoke-direct/range {v0 .. v9}, Lp6;-><init>(Landroid/app/Dialog;Landroid/content/Context;Landroid/app/Activity;Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    move-object v1, v3

    .line 237
    invoke-static {v1, v9, v0}, Ls6;->c(Landroid/app/Activity;Ljava/lang/String;Landroid/view/View$OnClickListener;)Landroid/widget/LinearLayout;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    invoke-virtual {v13, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 242
    .line 243
    .line 244
    array-length v0, v15

    .line 245
    sub-int/2addr v0, v11

    .line 246
    if-ge v14, v0, :cond_1

    .line 247
    .line 248
    invoke-static {v1}, Ls6;->t(Landroid/app/Activity;)Landroid/view/View;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    invoke-virtual {v13, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 253
    .line 254
    .line 255
    :cond_1
    add-int/lit8 v14, v14, 0x1

    .line 256
    .line 257
    goto :goto_1

    .line 258
    :cond_2
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 259
    .line 260
    const/4 v1, -0x1

    .line 261
    const/4 v2, -0x2

    .line 262
    invoke-direct {v0, v1, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v12, v13, v0}, Landroid/widget/ScrollView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 266
    .line 267
    .line 268
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 269
    .line 270
    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {v10, v12, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 274
    .line 275
    .line 276
    return-object v10
.end method

.method public static i0(Landroid/app/Activity;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-static {p1}, Ls6;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const-string v1, ""

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    return-object v1

    .line 14
    :cond_0
    const-string v0, "u_"

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_2

    .line 21
    .line 22
    invoke-static {p0}, Ls6;->H(Landroid/app/Activity;)Ljava/lang/ClassLoader;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-static {p0, p1}, Ls6;->B0(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-lez p1, :cond_1

    .line 35
    .line 36
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-nez p1, :cond_1

    .line 41
    .line 42
    return-object p0

    .line 43
    :cond_1
    return-object v1

    .line 44
    :cond_2
    return-object p1
.end method

.method public static j(JJLjava/lang/String;)[B
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0, p2, p3}, Ls6;->e0(IJ)[B

    .line 3
    .line 4
    .line 5
    move-result-object p2

    .line 6
    sget-object p3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 7
    .line 8
    invoke-virtual {p4, p3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 9
    .line 10
    .line 11
    move-result-object p3

    .line 12
    const/4 p4, 0x5

    .line 13
    invoke-static {p4, p3}, Ls6;->b0(I[B)[B

    .line 14
    .line 15
    .line 16
    move-result-object p3

    .line 17
    const/4 p4, 0x6

    .line 18
    const-wide v1, 0xffffffffL

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    invoke-static {p4, v1, v2}, Ls6;->e0(IJ)[B

    .line 24
    .line 25
    .line 26
    move-result-object p4

    .line 27
    filled-new-array {p2, p3, p4}, [[B

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    invoke-static {p2}, Ls6;->c0([[B)[B

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-static {v0, p0, p1}, Ls6;->e0(IJ)[B

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    const/4 p1, 0x3

    .line 40
    invoke-static {p1, p2}, Ls6;->b0(I[B)[B

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    filled-new-array {p0, p1}, [[B

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-static {p0}, Ls6;->c0([[B)[B

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    const-wide/16 p1, 0x8fc

    .line 53
    .line 54
    invoke-static {v0, p1, p2}, Ls6;->e0(IJ)[B

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    const/4 p2, 0x2

    .line 59
    const-wide/16 p3, 0x2

    .line 60
    .line 61
    invoke-static {p2, p3, p4}, Ls6;->e0(IJ)[B

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    const/4 p3, 0x4

    .line 66
    invoke-static {p3, p0}, Ls6;->b0(I[B)[B

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    filled-new-array {p1, p2, p0}, [[B

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-static {p0}, Ls6;->c0([[B)[B

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    return-object p0
.end method

.method public static j0([Ljava/lang/Class;Ljava/lang/Object;J)[Ljava/lang/Object;
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_6

    .line 3
    .line 4
    array-length v1, p0

    .line 5
    new-array v1, v1, [Ljava/lang/Object;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    move v3, v2

    .line 9
    move v4, v3

    .line 10
    :goto_0
    array-length v5, p0

    .line 11
    if-ge v2, v5, :cond_5

    .line 12
    .line 13
    aget-object v5, p0, v2

    .line 14
    .line 15
    invoke-static {v5}, Ls6;->F0(Ljava/lang/Class;)Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    const/4 v6, 0x1

    .line 20
    if-nez v3, :cond_0

    .line 21
    .line 22
    invoke-virtual {v5, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v7

    .line 26
    if-eqz v7, :cond_0

    .line 27
    .line 28
    aput-object p1, v1, v2

    .line 29
    .line 30
    move v3, v6

    .line 31
    goto :goto_2

    .line 32
    :cond_0
    if-nez v4, :cond_3

    .line 33
    .line 34
    const-class v7, Ljava/lang/Long;

    .line 35
    .line 36
    const-class v8, Ljava/lang/Integer;

    .line 37
    .line 38
    if-eq v5, v7, :cond_1

    .line 39
    .line 40
    if-ne v5, v8, :cond_3

    .line 41
    .line 42
    :cond_1
    if-ne v5, v8, :cond_2

    .line 43
    .line 44
    long-to-int v4, p2

    .line 45
    int-to-long v4, v4

    .line 46
    goto :goto_1

    .line 47
    :cond_2
    move-wide v4, p2

    .line 48
    :goto_1
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    aput-object v4, v1, v2

    .line 53
    .line 54
    move v4, v6

    .line 55
    goto :goto_2

    .line 56
    :cond_3
    aget-object v5, p0, v2

    .line 57
    .line 58
    invoke-virtual {v5}, Ljava/lang/Class;->isPrimitive()Z

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    if-eqz v5, :cond_4

    .line 63
    .line 64
    aget-object v5, p0, v2

    .line 65
    .line 66
    invoke-static {v5}, Ls6;->a0(Ljava/lang/Class;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    aput-object v5, v1, v2

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_4
    aput-object v0, v1, v2

    .line 74
    .line 75
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_5
    if-eqz v3, :cond_6

    .line 79
    .line 80
    if-eqz v4, :cond_6

    .line 81
    .line 82
    return-object v1

    .line 83
    :cond_6
    return-object v0
.end method

.method public static k(Landroid/app/Activity;Landroid/app/Dialog;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/widget/LinearLayout;
    .locals 13

    .line 1
    new-instance v6, Landroid/widget/LinearLayout;

    .line 2
    .line 3
    invoke-direct {v6, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    const/4 v7, 0x1

    .line 7
    invoke-virtual {v6, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 8
    .line 9
    .line 10
    const-string v0, "elaris_dialog_surface"

    .line 11
    .line 12
    invoke-virtual {v6, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-virtual {v6, v0}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v6, v0}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 20
    .line 21
    .line 22
    const/high16 v1, 0x41600000    # 14.0f

    .line 23
    .line 24
    invoke-static {p0, v1}, Ls6;->u(Landroid/content/Context;F)I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    const/high16 v4, 0x41800000    # 16.0f

    .line 29
    .line 30
    invoke-static {p0, v4}, Ls6;->u(Landroid/content/Context;F)I

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    invoke-static {p0, v1}, Ls6;->u(Landroid/content/Context;F)I

    .line 35
    .line 36
    .line 37
    move-result v8

    .line 38
    invoke-static {p0, v1}, Ls6;->u(Landroid/content/Context;F)I

    .line 39
    .line 40
    .line 41
    move-result v9

    .line 42
    invoke-virtual {v6, v2, v5, v8, v9}, Landroid/view/View;->setPadding(IIII)V

    .line 43
    .line 44
    .line 45
    invoke-static {p0}, Ls6;->s(Landroid/app/Activity;)Landroid/graphics/drawable/GradientDrawable;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-virtual {v6, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 50
    .line 51
    .line 52
    const-string v2, "\u8bbe\u7f6e\u5934\u8854"

    .line 53
    .line 54
    const/high16 v5, 0x41900000    # 18.0f

    .line 55
    .line 56
    sget v8, Ls6;->b:I

    .line 57
    .line 58
    invoke-static {p0, v2, v5, v8, v7}, Ls6;->x0(Landroid/app/Activity;Ljava/lang/String;FIZ)Landroid/widget/TextView;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    const/high16 v5, 0x40800000    # 4.0f

    .line 63
    .line 64
    invoke-static {p0, v5}, Ls6;->u(Landroid/content/Context;F)I

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    invoke-virtual {v2, v0, v0, v0, v5}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v6, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 72
    .line 73
    .line 74
    move-object/from16 v5, p3

    .line 75
    .line 76
    move-object/from16 v2, p4

    .line 77
    .line 78
    invoke-static {p0, v2, v5}, Ls6;->v0(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 83
    .line 84
    .line 85
    move-result v9

    .line 86
    const/high16 v10, 0x41200000    # 10.0f

    .line 87
    .line 88
    if-lez v9, :cond_0

    .line 89
    .line 90
    const/high16 v9, 0x41500000    # 13.0f

    .line 91
    .line 92
    sget v11, Ls6;->c:I

    .line 93
    .line 94
    invoke-static {p0, v2, v9, v11, v0}, Ls6;->x0(Landroid/app/Activity;Ljava/lang/String;FIZ)Landroid/widget/TextView;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-virtual {v2, v7}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 99
    .line 100
    .line 101
    sget-object v9, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 102
    .line 103
    invoke-virtual {v2, v9}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 104
    .line 105
    .line 106
    invoke-static {p0, v10}, Ls6;->u(Landroid/content/Context;F)I

    .line 107
    .line 108
    .line 109
    move-result v9

    .line 110
    invoke-virtual {v2, v0, v0, v0, v9}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v6, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 114
    .line 115
    .line 116
    :cond_0
    new-instance v2, Landroid/widget/EditText;

    .line 117
    .line 118
    invoke-direct {v2, p0}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v2, v7}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 122
    .line 123
    .line 124
    const/4 v9, 0x2

    .line 125
    invoke-virtual {v2, v9, v4}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v2, v8}, Landroid/widget/TextView;->setTextColor(I)V

    .line 129
    .line 130
    .line 131
    const/16 v4, 0x99

    .line 132
    .line 133
    const/16 v8, 0xa6

    .line 134
    .line 135
    const/16 v9, 0x91

    .line 136
    .line 137
    invoke-static {v9, v4, v8}, Landroid/graphics/Color;->rgb(III)I

    .line 138
    .line 139
    .line 140
    move-result v4

    .line 141
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setHintTextColor(I)V

    .line 142
    .line 143
    .line 144
    const-string v4, "\u8f93\u5165\u5934\u8854\uff0c\u7559\u7a7a\u8868\u793a\u6e05\u7a7a"

    .line 145
    .line 146
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 147
    .line 148
    .line 149
    const v4, 0x80001

    .line 150
    .line 151
    .line 152
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setInputType(I)V

    .line 153
    .line 154
    .line 155
    invoke-static {p0, v1}, Ls6;->u(Landroid/content/Context;F)I

    .line 156
    .line 157
    .line 158
    move-result v4

    .line 159
    invoke-static {p0, v1}, Ls6;->u(Landroid/content/Context;F)I

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    invoke-virtual {v2, v4, v0, v1, v0}, Landroid/view/View;->setPadding(IIII)V

    .line 164
    .line 165
    .line 166
    invoke-static {p0, v10}, Ls6;->u(Landroid/content/Context;F)I

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    const/16 v4, 0xe7

    .line 171
    .line 172
    const/16 v8, 0xed

    .line 173
    .line 174
    const/16 v9, 0xe3

    .line 175
    .line 176
    invoke-static {v9, v4, v8}, Landroid/graphics/Color;->rgb(III)I

    .line 177
    .line 178
    .line 179
    move-result v4

    .line 180
    new-instance v8, Landroid/graphics/drawable/GradientDrawable;

    .line 181
    .line 182
    invoke-direct {v8}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 183
    .line 184
    .line 185
    sget v9, Ls6;->d:I

    .line 186
    .line 187
    invoke-virtual {v8, v9}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 188
    .line 189
    .line 190
    int-to-float v1, v1

    .line 191
    invoke-virtual {v8, v1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 192
    .line 193
    .line 194
    const/high16 v1, 0x3f800000    # 1.0f

    .line 195
    .line 196
    invoke-static {p0, v1}, Ls6;->u(Landroid/content/Context;F)I

    .line 197
    .line 198
    .line 199
    move-result v1

    .line 200
    invoke-virtual {v8, v1, v4}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v2, v8}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 204
    .line 205
    .line 206
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 207
    .line 208
    const/high16 v4, 0x42100000    # 36.0f

    .line 209
    .line 210
    invoke-static {p0, v4}, Ls6;->u(Landroid/content/Context;F)I

    .line 211
    .line 212
    .line 213
    move-result v4

    .line 214
    const/4 v8, -0x1

    .line 215
    invoke-direct {v1, v8, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 216
    .line 217
    .line 218
    const/high16 v4, 0x40c00000    # 6.0f

    .line 219
    .line 220
    invoke-static {p0, v4}, Ls6;->u(Landroid/content/Context;F)I

    .line 221
    .line 222
    .line 223
    move-result v4

    .line 224
    iput v4, v1, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 225
    .line 226
    invoke-virtual {v6, v2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 227
    .line 228
    .line 229
    new-instance v8, Landroid/widget/LinearLayout;

    .line 230
    .line 231
    invoke-direct {v8, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 232
    .line 233
    .line 234
    const/16 v1, 0x15

    .line 235
    .line 236
    invoke-virtual {v8, v1}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 237
    .line 238
    .line 239
    const/high16 v1, 0x41400000    # 12.0f

    .line 240
    .line 241
    invoke-static {p0, v1}, Ls6;->u(Landroid/content/Context;F)I

    .line 242
    .line 243
    .line 244
    move-result v1

    .line 245
    invoke-virtual {v8, v0, v1, v0, v0}, Landroid/view/View;->setPadding(IIII)V

    .line 246
    .line 247
    .line 248
    const-string v1, "\u53d6\u6d88"

    .line 249
    .line 250
    invoke-static {p0, v1, v0}, Ls6;->r(Landroid/app/Activity;Ljava/lang/String;Z)Landroid/widget/TextView;

    .line 251
    .line 252
    .line 253
    move-result-object v1

    .line 254
    new-instance v4, Lj6;

    .line 255
    .line 256
    invoke-direct {v4, p1, v0}, Lj6;-><init>(Landroid/app/Dialog;I)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v1, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 260
    .line 261
    .line 262
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 263
    .line 264
    const/high16 v4, 0x42c00000    # 96.0f

    .line 265
    .line 266
    invoke-static {p0, v4}, Ls6;->u(Landroid/content/Context;F)I

    .line 267
    .line 268
    .line 269
    move-result v4

    .line 270
    const/high16 v11, 0x42200000    # 40.0f

    .line 271
    .line 272
    invoke-static {p0, v11}, Ls6;->u(Landroid/content/Context;F)I

    .line 273
    .line 274
    .line 275
    move-result v12

    .line 276
    invoke-direct {v0, v4, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v8, v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 280
    .line 281
    .line 282
    const-string v0, "\u786e\u5b9a"

    .line 283
    .line 284
    invoke-static {p0, v0, v7}, Ls6;->r(Landroid/app/Activity;Ljava/lang/String;Z)Landroid/widget/TextView;

    .line 285
    .line 286
    .line 287
    move-result-object v12

    .line 288
    new-instance v0, Lk6;

    .line 289
    .line 290
    move-object v3, p0

    .line 291
    move-object v4, p2

    .line 292
    move-object v1, v2

    .line 293
    move-object v2, p1

    .line 294
    invoke-direct/range {v0 .. v5}, Lk6;-><init>(Landroid/widget/EditText;Landroid/app/Dialog;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    invoke-virtual {v12, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 298
    .line 299
    .line 300
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 301
    .line 302
    const/high16 v2, 0x42e00000    # 112.0f

    .line 303
    .line 304
    invoke-static {p0, v2}, Ls6;->u(Landroid/content/Context;F)I

    .line 305
    .line 306
    .line 307
    move-result v2

    .line 308
    invoke-static {p0, v11}, Ls6;->u(Landroid/content/Context;F)I

    .line 309
    .line 310
    .line 311
    move-result v4

    .line 312
    invoke-direct {v0, v2, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 313
    .line 314
    .line 315
    invoke-static {p0, v10}, Ls6;->u(Landroid/content/Context;F)I

    .line 316
    .line 317
    .line 318
    move-result v2

    .line 319
    iput v2, v0, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 320
    .line 321
    invoke-virtual {v8, v12, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 322
    .line 323
    .line 324
    invoke-virtual {v6, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 325
    .line 326
    .line 327
    new-instance v0, Lf4;

    .line 328
    .line 329
    invoke-direct {v0, v1, v7}, Lf4;-><init>(Landroid/widget/EditText;I)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {v1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 333
    .line 334
    .line 335
    return-object v6
.end method

.method public static k0(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 9

    .line 1
    const-string v0, ": "

    .line 2
    .line 3
    const-string v1, "group action failed type=\u64a4\u56de\u8be5\u6210\u5458\u6d88\u606f reason=bad msgId "

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    :try_start_0
    invoke-static {p0}, Ls6;->H(Landroid/app/Activity;)Ljava/lang/ClassLoader;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const-string v3, "com.tencent.qqnt.msg.api.IMsgService"

    .line 11
    .line 12
    invoke-static {p0, v3}, Ls6;->g0(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    if-nez v3, :cond_0

    .line 17
    .line 18
    const-string p0, "group action failed type=\u64a4\u56de\u8be5\u6210\u5458\u6d88\u606f reason=IMsgService null"

    .line 19
    .line 20
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return v2

    .line 24
    :catchall_0
    move-exception p0

    .line 25
    goto/16 :goto_2

    .line 26
    .line 27
    :cond_0
    invoke-static {p0, p1}, Ls6;->U(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    if-nez p0, :cond_1

    .line 32
    .line 33
    const-string p0, "group action failed type=\u64a4\u56de\u8be5\u6210\u5458\u6d88\u606f reason=Contact null"

    .line 34
    .line 35
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return v2

    .line 39
    :cond_1
    invoke-static {p2}, Ls6;->Y(Ljava/lang/String;)J

    .line 40
    .line 41
    .line 42
    move-result-wide v4

    .line 43
    const-wide/16 v6, 0x0

    .line 44
    .line 45
    cmp-long p1, v4, v6

    .line 46
    .line 47
    if-gtz p1, :cond_2

    .line 48
    .line 49
    new-instance p0, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    return v2

    .line 65
    :cond_2
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-static {p1}, Ls6;->e(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    move p2, v2

    .line 74
    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-ge p2, v1, :cond_6

    .line 79
    .line 80
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    check-cast v1, Ljava/lang/reflect/Method;

    .line 85
    .line 86
    const-string v6, "recallMsg"

    .line 87
    .line 88
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v7

    .line 92
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v6

    .line 96
    if-eqz v6, :cond_5

    .line 97
    .line 98
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 99
    .line 100
    .line 101
    move-result v6

    .line 102
    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 103
    .line 104
    .line 105
    move-result v6

    .line 106
    if-eqz v6, :cond_3

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_3
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    move-result-object v6

    .line 113
    invoke-static {v6, p0, v4, v5}, Ls6;->j0([Ljava/lang/Class;Ljava/lang/Object;J)[Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 117
    if-nez v6, :cond_4

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_4
    const/4 v7, 0x1

    .line 121
    :try_start_1
    invoke-virtual {v1, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v1, v3, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    new-instance v6, Ljava/lang/StringBuilder;

    .line 128
    .line 129
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 130
    .line 131
    .line 132
    const-string v8, "group action invoked class="

    .line 133
    .line 134
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    move-result-object v8

    .line 141
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v8

    .line 145
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    const-string v8, " method="

    .line 149
    .line 150
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-static {v1}, Ls6;->R(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v8

    .line 157
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v6

    .line 164
    invoke-static {v6}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 165
    .line 166
    .line 167
    return v7

    .line 168
    :catchall_1
    move-exception v6

    .line 169
    :try_start_2
    invoke-static {v6}, Ls6;->C0(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 170
    .line 171
    .line 172
    move-result-object v6

    .line 173
    new-instance v7, Ljava/lang/StringBuilder;

    .line 174
    .line 175
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 176
    .line 177
    .line 178
    const-string v8, "group action failed type=\u64a4\u56de\u8be5\u6210\u5458\u6d88\u606f method="

    .line 179
    .line 180
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-static {v1}, Ls6;->R(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    const-string v1, " reason="

    .line 191
    .line 192
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v6}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 214
    .line 215
    .line 216
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    invoke-static {v1}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    :cond_5
    :goto_1
    add-int/lit8 p2, p2, 0x1

    .line 224
    .line 225
    goto/16 :goto_0

    .line 226
    .line 227
    :cond_6
    const-string p0, "recall"

    .line 228
    .line 229
    invoke-static {v3, p0}, Ls6;->N(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 230
    .line 231
    .line 232
    goto :goto_3

    .line 233
    :goto_2
    invoke-static {p0}, Ls6;->C0(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 234
    .line 235
    .line 236
    move-result-object p0

    .line 237
    new-instance p1, Ljava/lang/StringBuilder;

    .line 238
    .line 239
    const-string p2, "group action failed type=\u64a4\u56de\u8be5\u6210\u5458\u6d88\u606f reason="

    .line 240
    .line 241
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    invoke-static {p0, p1, v0}, La;->d(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    :goto_3
    return v2
.end method

.method public static l(Landroid/content/Context;Landroid/app/Activity;Landroid/app/Dialog;Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/widget/LinearLayout;
    .locals 15

    .line 1
    move-object/from16 v4, p1

    .line 2
    .line 3
    new-instance v9, Landroid/widget/LinearLayout;

    .line 4
    .line 5
    invoke-direct {v9, v4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    invoke-virtual {v9, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 10
    .line 11
    .line 12
    const-string v1, "elaris_dialog_surface"

    .line 13
    .line 14
    invoke-virtual {v9, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-virtual {v9, v1}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v9, v1}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 22
    .line 23
    .line 24
    const/high16 v2, 0x41600000    # 14.0f

    .line 25
    .line 26
    invoke-static {v4, v2}, Ls6;->u(Landroid/content/Context;F)I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    const/high16 v5, 0x41800000    # 16.0f

    .line 31
    .line 32
    invoke-static {v4, v5}, Ls6;->u(Landroid/content/Context;F)I

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    invoke-static {v4, v2}, Ls6;->u(Landroid/content/Context;F)I

    .line 37
    .line 38
    .line 39
    move-result v7

    .line 40
    invoke-static {v4, v2}, Ls6;->u(Landroid/content/Context;F)I

    .line 41
    .line 42
    .line 43
    move-result v8

    .line 44
    invoke-virtual {v9, v3, v6, v7, v8}, Landroid/view/View;->setPadding(IIII)V

    .line 45
    .line 46
    .line 47
    invoke-static {v4}, Ls6;->s(Landroid/app/Activity;)Landroid/graphics/drawable/GradientDrawable;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-virtual {v9, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 52
    .line 53
    .line 54
    const-string v3, "\u7981\u8a00\u65f6\u957f"

    .line 55
    .line 56
    const/high16 v6, 0x41900000    # 18.0f

    .line 57
    .line 58
    sget v7, Ls6;->b:I

    .line 59
    .line 60
    invoke-static {v4, v3, v6, v7, v0}, Ls6;->x0(Landroid/app/Activity;Ljava/lang/String;FIZ)Landroid/widget/TextView;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    const/high16 v6, 0x40800000    # 4.0f

    .line 65
    .line 66
    invoke-static {v4, v6}, Ls6;->u(Landroid/content/Context;F)I

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    invoke-virtual {v3, v1, v1, v1, v6}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v9, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 74
    .line 75
    .line 76
    move-object/from16 v3, p5

    .line 77
    .line 78
    move-object/from16 v8, p6

    .line 79
    .line 80
    invoke-static {v4, v8, v3}, Ls6;->v0(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 85
    .line 86
    .line 87
    move-result v10

    .line 88
    const/high16 v11, 0x41200000    # 10.0f

    .line 89
    .line 90
    if-lez v10, :cond_0

    .line 91
    .line 92
    const/high16 v10, 0x41500000    # 13.0f

    .line 93
    .line 94
    sget v12, Ls6;->c:I

    .line 95
    .line 96
    invoke-static {v4, v6, v10, v12, v1}, Ls6;->x0(Landroid/app/Activity;Ljava/lang/String;FIZ)Landroid/widget/TextView;

    .line 97
    .line 98
    .line 99
    move-result-object v6

    .line 100
    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 101
    .line 102
    .line 103
    sget-object v10, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 104
    .line 105
    invoke-virtual {v6, v10}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 106
    .line 107
    .line 108
    invoke-static {v4, v11}, Ls6;->u(Landroid/content/Context;F)I

    .line 109
    .line 110
    .line 111
    move-result v10

    .line 112
    invoke-virtual {v6, v1, v1, v1, v10}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v9, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 116
    .line 117
    .line 118
    :cond_0
    new-instance v6, Landroid/widget/EditText;

    .line 119
    .line 120
    invoke-direct {v6, v4}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 124
    .line 125
    .line 126
    const/4 v10, 0x2

    .line 127
    invoke-virtual {v6, v10, v5}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setTextColor(I)V

    .line 131
    .line 132
    .line 133
    const/16 v5, 0x99

    .line 134
    .line 135
    const/16 v7, 0xa6

    .line 136
    .line 137
    const/16 v12, 0x91

    .line 138
    .line 139
    invoke-static {v12, v5, v7}, Landroid/graphics/Color;->rgb(III)I

    .line 140
    .line 141
    .line 142
    move-result v5

    .line 143
    invoke-virtual {v6, v5}, Landroid/widget/TextView;->setHintTextColor(I)V

    .line 144
    .line 145
    .line 146
    const-string v5, "\u652f\u6301\u79d2\u6570/\u5206\u949f/\u5929\u6570"

    .line 147
    .line 148
    invoke-virtual {v6, v5}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 149
    .line 150
    .line 151
    const v5, 0x80001

    .line 152
    .line 153
    .line 154
    invoke-virtual {v6, v5}, Landroid/widget/TextView;->setInputType(I)V

    .line 155
    .line 156
    .line 157
    invoke-static {v4, v2}, Ls6;->u(Landroid/content/Context;F)I

    .line 158
    .line 159
    .line 160
    move-result v5

    .line 161
    invoke-static {v4, v2}, Ls6;->u(Landroid/content/Context;F)I

    .line 162
    .line 163
    .line 164
    move-result v2

    .line 165
    invoke-virtual {v6, v5, v1, v2, v1}, Landroid/view/View;->setPadding(IIII)V

    .line 166
    .line 167
    .line 168
    invoke-static {v4, v11}, Ls6;->u(Landroid/content/Context;F)I

    .line 169
    .line 170
    .line 171
    move-result v2

    .line 172
    const/16 v5, 0xe7

    .line 173
    .line 174
    const/16 v7, 0xed

    .line 175
    .line 176
    const/16 v12, 0xe3

    .line 177
    .line 178
    invoke-static {v12, v5, v7}, Landroid/graphics/Color;->rgb(III)I

    .line 179
    .line 180
    .line 181
    move-result v5

    .line 182
    new-instance v7, Landroid/graphics/drawable/GradientDrawable;

    .line 183
    .line 184
    invoke-direct {v7}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 185
    .line 186
    .line 187
    sget v12, Ls6;->d:I

    .line 188
    .line 189
    invoke-virtual {v7, v12}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 190
    .line 191
    .line 192
    int-to-float v2, v2

    .line 193
    invoke-virtual {v7, v2}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 194
    .line 195
    .line 196
    const/high16 v2, 0x3f800000    # 1.0f

    .line 197
    .line 198
    invoke-static {v4, v2}, Ls6;->u(Landroid/content/Context;F)I

    .line 199
    .line 200
    .line 201
    move-result v2

    .line 202
    invoke-virtual {v7, v2, v5}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v6, v7}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 206
    .line 207
    .line 208
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 209
    .line 210
    const/high16 v5, 0x42100000    # 36.0f

    .line 211
    .line 212
    invoke-static {v4, v5}, Ls6;->u(Landroid/content/Context;F)I

    .line 213
    .line 214
    .line 215
    move-result v5

    .line 216
    const/4 v7, -0x1

    .line 217
    invoke-direct {v2, v7, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 218
    .line 219
    .line 220
    const/high16 v5, 0x40c00000    # 6.0f

    .line 221
    .line 222
    invoke-static {v4, v5}, Ls6;->u(Landroid/content/Context;F)I

    .line 223
    .line 224
    .line 225
    move-result v5

    .line 226
    iput v5, v2, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 227
    .line 228
    invoke-virtual {v9, v6, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 229
    .line 230
    .line 231
    new-instance v12, Landroid/widget/LinearLayout;

    .line 232
    .line 233
    invoke-direct {v12, v4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 234
    .line 235
    .line 236
    const/16 v2, 0x15

    .line 237
    .line 238
    invoke-virtual {v12, v2}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 239
    .line 240
    .line 241
    const/high16 v2, 0x41400000    # 12.0f

    .line 242
    .line 243
    invoke-static {v4, v2}, Ls6;->u(Landroid/content/Context;F)I

    .line 244
    .line 245
    .line 246
    move-result v2

    .line 247
    invoke-virtual {v12, v1, v2, v1, v1}, Landroid/view/View;->setPadding(IIII)V

    .line 248
    .line 249
    .line 250
    const-string v2, "\u53d6\u6d88"

    .line 251
    .line 252
    invoke-static {v4, v2, v1}, Ls6;->r(Landroid/app/Activity;Ljava/lang/String;Z)Landroid/widget/TextView;

    .line 253
    .line 254
    .line 255
    move-result-object v1

    .line 256
    new-instance v2, Lj6;

    .line 257
    .line 258
    move-object/from16 v5, p2

    .line 259
    .line 260
    invoke-direct {v2, v5, v0}, Lj6;-><init>(Landroid/app/Dialog;I)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 264
    .line 265
    .line 266
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 267
    .line 268
    const/high16 v7, 0x42c00000    # 96.0f

    .line 269
    .line 270
    invoke-static {v4, v7}, Ls6;->u(Landroid/content/Context;F)I

    .line 271
    .line 272
    .line 273
    move-result v7

    .line 274
    const/high16 v13, 0x42200000    # 40.0f

    .line 275
    .line 276
    invoke-static {v4, v13}, Ls6;->u(Landroid/content/Context;F)I

    .line 277
    .line 278
    .line 279
    move-result v14

    .line 280
    invoke-direct {v2, v7, v14}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {v12, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 284
    .line 285
    .line 286
    const-string v1, "\u786e\u5b9a"

    .line 287
    .line 288
    invoke-static {v4, v1, v0}, Ls6;->r(Landroid/app/Activity;Ljava/lang/String;Z)Landroid/widget/TextView;

    .line 289
    .line 290
    .line 291
    move-result-object v14

    .line 292
    new-instance v0, Lo6;

    .line 293
    .line 294
    move-object v7, v3

    .line 295
    move-object v2, v5

    .line 296
    move-object v1, v6

    .line 297
    move-object v3, p0

    .line 298
    move-object/from16 v5, p3

    .line 299
    .line 300
    move-object/from16 v6, p4

    .line 301
    .line 302
    invoke-direct/range {v0 .. v8}, Lo6;-><init>(Landroid/widget/EditText;Landroid/app/Dialog;Landroid/content/Context;Landroid/app/Activity;Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v14, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 306
    .line 307
    .line 308
    new-instance p0, Landroid/widget/LinearLayout$LayoutParams;

    .line 309
    .line 310
    const/high16 v0, 0x42e00000    # 112.0f

    .line 311
    .line 312
    invoke-static {v4, v0}, Ls6;->u(Landroid/content/Context;F)I

    .line 313
    .line 314
    .line 315
    move-result v0

    .line 316
    invoke-static {v4, v13}, Ls6;->u(Landroid/content/Context;F)I

    .line 317
    .line 318
    .line 319
    move-result v2

    .line 320
    invoke-direct {p0, v0, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 321
    .line 322
    .line 323
    invoke-static {v4, v11}, Ls6;->u(Landroid/content/Context;F)I

    .line 324
    .line 325
    .line 326
    move-result v0

    .line 327
    iput v0, p0, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 328
    .line 329
    invoke-virtual {v12, v14, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {v9, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 333
    .line 334
    .line 335
    new-instance p0, Lf4;

    .line 336
    .line 337
    invoke-direct {p0, v1, v10}, Lf4;-><init>(Landroid/widget/EditText;I)V

    .line 338
    .line 339
    .line 340
    invoke-virtual {v1, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 341
    .line 342
    .line 343
    return-object v9
.end method

.method public static l0(Ljava/lang/Object;)Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "loginUin"

    .line 2
    .line 3
    const-string v1, "uin"

    .line 4
    .line 5
    const-string v2, "currentUin"

    .line 6
    .line 7
    const-string v3, "selfUin"

    .line 8
    .line 9
    const-string v4, "selfuin"

    .line 10
    .line 11
    filled-new-array {v2, v3, v4, v0, v1}, [Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {p0, v0}, Ls6;->C(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    const/4 v2, 0x5

    .line 24
    if-lt v1, v2, :cond_0

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :cond_0
    const-string v0, "getAccountUin"

    .line 32
    .line 33
    const-string v1, "getLongAccountUin"

    .line 34
    .line 35
    const-string v2, "getCurrentAccountUin"

    .line 36
    .line 37
    const-string v3, "getCurrentAccountUid"

    .line 38
    .line 39
    const-string v4, "getAccount"

    .line 40
    .line 41
    filled-new-array {v2, v3, v4, v0, v1}, [Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-static {p0, v0}, Ls6;->m(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    if-nez p0, :cond_1

    .line 50
    .line 51
    const-string p0, ""

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0
.end method

.method public static varargs m(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_1

    .line 3
    .line 4
    array-length v1, p1

    .line 5
    const/4 v2, 0x0

    .line 6
    :goto_0
    if-ge v2, v1, :cond_1

    .line 7
    .line 8
    aget-object v3, p1, v2

    .line 9
    .line 10
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v4

    .line 14
    :goto_1
    if-eqz v4, :cond_0

    .line 15
    .line 16
    const-class v5, Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    if-eq v4, v5, :cond_0

    .line 19
    .line 20
    :try_start_1
    invoke-virtual {v4, v3, v0}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    const/4 v6, 0x1

    .line 25
    invoke-virtual {v5, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v5, p0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    return-object p0

    .line 33
    :catch_0
    :try_start_2
    invoke-virtual {v4}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-result-object v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 37
    goto :goto_1

    .line 38
    :catchall_0
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    return-object v0
.end method

.method public static m0(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, ""

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :goto_0
    const/16 v0, 0xd

    .line 11
    .line 12
    const/16 v1, 0x20

    .line 13
    .line 14
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const/16 v0, 0xa

    .line 19
    .line 20
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    const/16 v0, 0x9

    .line 25
    .line 26
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    const/16 v1, 0xf0

    .line 35
    .line 36
    if-le v0, v1, :cond_1

    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    const-string v0, "..."

    .line 44
    .line 45
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    :cond_1
    return-object p0
.end method

.method public static varargs n(Ljava/lang/Class;[Ljava/lang/String;)Ljava/lang/Object;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_1

    .line 3
    .line 4
    array-length v1, p1

    .line 5
    const/4 v2, 0x0

    .line 6
    :goto_0
    if-ge v2, v1, :cond_1

    .line 7
    .line 8
    aget-object v3, p1, v2

    .line 9
    .line 10
    :try_start_0
    invoke-virtual {p0, v3, v0}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    const/4 v4, 0x1

    .line 15
    invoke-virtual {v3, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v3, v0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    if-eqz v3, :cond_0

    .line 23
    .line 24
    return-object v3

    .line 25
    :catchall_0
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    return-object v0
.end method

.method public static n0(Ljava/lang/Object;ILjava/util/Set;)Lb7;
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_a

    .line 3
    .line 4
    const/4 v1, 0x3

    .line 5
    if-gt p1, v1, :cond_a

    .line 6
    .line 7
    if-eqz p2, :cond_a

    .line 8
    .line 9
    invoke-interface {p2, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    goto/16 :goto_5

    .line 16
    .line 17
    :cond_0
    instance-of v1, p0, Ljava/lang/String;

    .line 18
    .line 19
    if-nez v1, :cond_9

    .line 20
    .line 21
    instance-of v1, p0, Ljava/lang/Number;

    .line 22
    .line 23
    if-nez v1, :cond_9

    .line 24
    .line 25
    instance-of v1, p0, Ljava/lang/Boolean;

    .line 26
    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    goto/16 :goto_4

    .line 30
    .line 31
    :cond_1
    invoke-static {p0}, Ls6;->D(Ljava/lang/Object;)Lb7;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    return-object v1

    .line 38
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    if-lez p1, :cond_3

    .line 47
    .line 48
    const-string v3, "com.tencent."

    .line 49
    .line 50
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-nez v2, :cond_3

    .line 55
    .line 56
    instance-of v2, p0, Landroid/app/Activity;

    .line 57
    .line 58
    if-nez v2, :cond_3

    .line 59
    .line 60
    instance-of v2, p0, Landroid/view/View;

    .line 61
    .line 62
    if-nez v2, :cond_3

    .line 63
    .line 64
    return-object v0

    .line 65
    :cond_3
    :goto_0
    if-eqz v1, :cond_8

    .line 66
    .line 67
    const-class v2, Ljava/lang/Object;

    .line 68
    .line 69
    if-eq v1, v2, :cond_8

    .line 70
    .line 71
    :try_start_0
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 72
    .line 73
    .line 74
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 75
    goto :goto_1

    .line 76
    :catchall_0
    move-object v2, v0

    .line 77
    :goto_1
    if-eqz v2, :cond_7

    .line 78
    .line 79
    array-length v3, v2

    .line 80
    const/4 v4, 0x0

    .line 81
    :goto_2
    if-ge v4, v3, :cond_7

    .line 82
    .line 83
    aget-object v5, v2, v4

    .line 84
    .line 85
    :try_start_1
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 86
    .line 87
    .line 88
    move-result v6

    .line 89
    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 90
    .line 91
    .line 92
    move-result v6

    .line 93
    if-eqz v6, :cond_4

    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_4
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v6

    .line 100
    sget-object v7, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 101
    .line 102
    invoke-virtual {v6, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    const-string v7, "aio"

    .line 107
    .line 108
    invoke-virtual {v6, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 109
    .line 110
    .line 111
    move-result v7

    .line 112
    if-nez v7, :cond_5

    .line 113
    .line 114
    const-string v7, "contact"

    .line 115
    .line 116
    invoke-virtual {v6, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 117
    .line 118
    .line 119
    move-result v7

    .line 120
    if-nez v7, :cond_5

    .line 121
    .line 122
    const-string v7, "session"

    .line 123
    .line 124
    invoke-virtual {v6, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 125
    .line 126
    .line 127
    move-result v7

    .line 128
    if-nez v7, :cond_5

    .line 129
    .line 130
    const-string v7, "troop"

    .line 131
    .line 132
    invoke-virtual {v6, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 133
    .line 134
    .line 135
    move-result v7

    .line 136
    if-nez v7, :cond_5

    .line 137
    .line 138
    const-string v7, "group"

    .line 139
    .line 140
    invoke-virtual {v6, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 141
    .line 142
    .line 143
    move-result v7

    .line 144
    if-nez v7, :cond_5

    .line 145
    .line 146
    const-string v7, "chat"

    .line 147
    .line 148
    invoke-virtual {v6, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 149
    .line 150
    .line 151
    move-result v6

    .line 152
    if-nez v6, :cond_5

    .line 153
    .line 154
    goto :goto_3

    .line 155
    :cond_5
    const/4 v6, 0x1

    .line 156
    invoke-virtual {v5, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v5, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v5

    .line 163
    add-int/2addr v6, p1

    .line 164
    invoke-static {v5, v6, p2}, Ls6;->n0(Ljava/lang/Object;ILjava/util/Set;)Lb7;

    .line 165
    .line 166
    .line 167
    move-result-object v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 168
    if-eqz v5, :cond_6

    .line 169
    .line 170
    return-object v5

    .line 171
    :catchall_1
    :cond_6
    :goto_3
    add-int/lit8 v4, v4, 0x1

    .line 172
    .line 173
    goto :goto_2

    .line 174
    :cond_7
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    goto :goto_0

    .line 179
    :cond_8
    return-object v0

    .line 180
    :cond_9
    :goto_4
    invoke-static {p0}, Ls6;->D(Ljava/lang/Object;)Lb7;

    .line 181
    .line 182
    .line 183
    move-result-object p0

    .line 184
    return-object p0

    .line 185
    :cond_a
    :goto_5
    return-object v0
.end method

.method public static o(Ljava/lang/ClassLoader;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Class;->isInterface()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    move-object p0, v0

    .line 18
    :goto_0
    filled-new-array {p1}, [Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    new-instance v0, Ln6;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-direct {v0, v1, p2}, Ln6;-><init>(ILjava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    invoke-static {p0, p1, v0}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0

    .line 33
    :cond_2
    :goto_1
    const/4 p0, 0x0

    .line 34
    return-object p0
.end method

.method public static o0(Landroid/app/Activity;Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 11

    .line 1
    const-string v7, "group action invoked class="

    .line 2
    .line 3
    const-string v8, "group action failed type=\u8bbe\u7f6e\u5934\u8854 reason=sendToService method null runtime="

    .line 4
    .line 5
    invoke-static {p2}, Ls6;->Y(Ljava/lang/String;)J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    invoke-static {p3}, Ls6;->Y(Ljava/lang/String;)J

    .line 10
    .line 11
    .line 12
    move-result-wide v2

    .line 13
    const-wide/16 v4, 0x0

    .line 14
    .line 15
    cmp-long v6, v0, v4

    .line 16
    .line 17
    const/4 v9, 0x0

    .line 18
    if-lez v6, :cond_9

    .line 19
    .line 20
    cmp-long v4, v2, v4

    .line 21
    .line 22
    if-gtz v4, :cond_0

    .line 23
    .line 24
    goto/16 :goto_3

    .line 25
    .line 26
    :cond_0
    invoke-static {p1}, Ls6;->f(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    if-nez v4, :cond_1

    .line 31
    .line 32
    const-string v0, "group action failed type=\u8bbe\u7f6e\u5934\u8854 reason=app runtime null"

    .line 33
    .line 34
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return v9

    .line 38
    :cond_1
    invoke-static {p0}, Ls6;->q(Landroid/app/Activity;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    if-nez v6, :cond_2

    .line 47
    .line 48
    invoke-static {v4}, Ls6;->l0(Ljava/lang/Object;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    :cond_2
    move-object v10, v5

    .line 53
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    if-nez v5, :cond_3

    .line 58
    .line 59
    const-string v0, "group action failed type=\u8bbe\u7f6e\u5934\u8854 reason=current uin null"

    .line 60
    .line 61
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    return v9

    .line 65
    :cond_3
    if-nez p4, :cond_4

    .line 66
    .line 67
    :try_start_0
    const-string v5, ""

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :catchall_0
    move-exception v0

    .line 71
    goto/16 :goto_2

    .line 72
    .line 73
    :cond_4
    move-object v5, p4

    .line 74
    :goto_0
    invoke-static {v0, v1, v2, v3, v5}, Ls6;->j(JJLjava/lang/String;)[B

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    move-object v0, p0

    .line 79
    move-object v1, p1

    .line 80
    move-object v3, p2

    .line 81
    move-object v5, p4

    .line 82
    move-object v2, v4

    .line 83
    move-object v4, p3

    .line 84
    invoke-static/range {v0 .. v6}, Ls6;->u0(Landroid/app/Activity;Ljava/lang/ClassLoader;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[B)Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    const/4 v1, 0x1

    .line 89
    if-eqz v0, :cond_5

    .line 90
    .line 91
    return v1

    .line 92
    :cond_5
    invoke-static {p1, v10, v6}, Ls6;->W(Ljava/lang/ClassLoader;Ljava/lang/String;[B)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    if-nez v0, :cond_6

    .line 97
    .line 98
    return v9

    .line 99
    :cond_6
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    const-string v5, "sendToService"

    .line 104
    .line 105
    invoke-static {v3, v5, v1}, Ls6;->A(Ljava/lang/Class;Ljava/lang/String;I)Ljava/lang/reflect/Method;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    if-nez v3, :cond_7

    .line 110
    .line 111
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-virtual {v8, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    return v9

    .line 127
    :cond_7
    invoke-virtual {v3, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 128
    .line 129
    .line 130
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-virtual {v3, v2, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    new-instance v0, Ljava/lang/StringBuilder;

    .line 138
    .line 139
    invoke-direct {v0, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    const-string v2, " method="

    .line 154
    .line 155
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-static {v3}, Ls6;->R(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    const-string v2, " cmd=OidbSvc.0x8fc_2 targetUin="

    .line 166
    .line 167
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    const-string v2, " titleLen="

    .line 174
    .line 175
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    if-nez p4, :cond_8

    .line 179
    .line 180
    move v2, v9

    .line 181
    goto :goto_1

    .line 182
    :cond_8
    invoke-virtual {p4}, Ljava/lang/String;->length()I

    .line 183
    .line 184
    .line 185
    move-result v2

    .line 186
    :goto_1
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    const-string v2, " payload=minimal-oidb"

    .line 190
    .line 191
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 199
    .line 200
    .line 201
    return v1

    .line 202
    :goto_2
    invoke-static {v0}, Ls6;->C0(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    new-instance v1, Ljava/lang/StringBuilder;

    .line 207
    .line 208
    const-string v2, "group action failed type=\u8bbe\u7f6e\u5934\u8854 reason=oidb "

    .line 209
    .line 210
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    const-string v2, ": "

    .line 214
    .line 215
    invoke-static {v0, v1, v2}, La;->d(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    return v9

    .line 219
    :cond_9
    :goto_3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 220
    .line 221
    const-string v1, "group action failed type=\u8bbe\u7f6e\u5934\u8854 reason=bad group/member groupUin="

    .line 222
    .line 223
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 227
    .line 228
    .line 229
    const-string v1, " targetUin="

    .line 230
    .line 231
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    return v9
.end method

.method public static p(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, ""

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static p0(Ljava/lang/Object;Ljava/lang/String;Ljava/io/Serializable;)V
    .locals 2

    .line 1
    if-eqz p0, :cond_4

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0, p1}, Ls6;->w(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x1

    .line 15
    :try_start_0
    invoke-virtual {p1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 23
    .line 24
    if-ne v0, v1, :cond_1

    .line 25
    .line 26
    instance-of v0, p2, Ljava/lang/Number;

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    check-cast p2, Ljava/lang/Number;

    .line 31
    .line 32
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    invoke-virtual {p1, p0, p2}, Ljava/lang/reflect/Field;->setInt(Ljava/lang/Object;I)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    sget-object v1, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 45
    .line 46
    if-ne v0, v1, :cond_2

    .line 47
    .line 48
    instance-of v0, p2, Ljava/lang/Number;

    .line 49
    .line 50
    if-eqz v0, :cond_2

    .line 51
    .line 52
    check-cast p2, Ljava/lang/Number;

    .line 53
    .line 54
    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    .line 55
    .line 56
    .line 57
    move-result-wide v0

    .line 58
    invoke-virtual {p1, p0, v0, v1}, Ljava/lang/reflect/Field;->setLong(Ljava/lang/Object;J)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_2
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 67
    .line 68
    if-ne v0, v1, :cond_3

    .line 69
    .line 70
    instance-of v0, p2, Ljava/lang/Boolean;

    .line 71
    .line 72
    if-eqz v0, :cond_3

    .line 73
    .line 74
    check-cast p2, Ljava/lang/Boolean;

    .line 75
    .line 76
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 77
    .line 78
    .line 79
    move-result p2

    .line 80
    invoke-virtual {p1, p0, p2}, Ljava/lang/reflect/Field;->setBoolean(Ljava/lang/Object;Z)V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :cond_3
    invoke-virtual {p1, p0, p2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 85
    .line 86
    .line 87
    :catchall_0
    :cond_4
    :goto_0
    return-void
.end method

.method public static q(Landroid/app/Activity;)Ljava/lang/String;
    .locals 13

    .line 1
    const-string v0, "currentUin"

    .line 2
    .line 3
    const-string v1, "selfUin"

    .line 4
    .line 5
    const-string v2, "selfuin"

    .line 6
    .line 7
    const-string v3, "loginUin"

    .line 8
    .line 9
    const-string v4, "uin"

    .line 10
    .line 11
    filled-new-array {v0, v1, v2, v3, v4}, [Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    invoke-static {p0, v5}, Ls6;->C(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 20
    .line 21
    .line 22
    move-result v6

    .line 23
    const/4 v7, 0x5

    .line 24
    if-lt v6, v7, :cond_0

    .line 25
    .line 26
    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    const-string v5, "com.tencent.common.app.BaseApplicationImpl"

    .line 36
    .line 37
    const-string v6, "mqq.app.MobileQQ"

    .line 38
    .line 39
    filled-new-array {v5, v6}, [Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    const/4 v6, 0x0

    .line 44
    move v8, v6

    .line 45
    :goto_0
    const/4 v9, 0x2

    .line 46
    if-ge v8, v9, :cond_3

    .line 47
    .line 48
    aget-object v9, v5, v8

    .line 49
    .line 50
    invoke-static {v9, v6, p0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    move-result-object v9

    .line 54
    const-string v10, "getApplication"

    .line 55
    .line 56
    const-string v11, "getMobileQQ"

    .line 57
    .line 58
    const-string v12, "getContext"

    .line 59
    .line 60
    filled-new-array {v10, v11, v12}, [Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v10

    .line 64
    invoke-static {v9, v10}, Ls6;->n(Ljava/lang/Class;[Ljava/lang/String;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v9

    .line 68
    filled-new-array {v0, v1, v2, v3, v4}, [Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v10

    .line 72
    invoke-static {v9, v10}, Ls6;->C(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v10

    .line 76
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 77
    .line 78
    .line 79
    move-result v11

    .line 80
    if-lt v11, v7, :cond_1

    .line 81
    .line 82
    invoke-virtual {v10}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    return-object p0

    .line 87
    :cond_1
    const-string v10, "getRuntime"

    .line 88
    .line 89
    const-string v11, "peekAppRuntime"

    .line 90
    .line 91
    const-string v12, "getAppRuntime"

    .line 92
    .line 93
    filled-new-array {v10, v11, v12}, [Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v10

    .line 97
    invoke-static {v9, v10}, Ls6;->m(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v9

    .line 101
    invoke-static {v9}, Ls6;->l0(Ljava/lang/Object;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v9

    .line 105
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 106
    .line 107
    .line 108
    move-result v10

    .line 109
    if-lt v10, v7, :cond_2

    .line 110
    .line 111
    invoke-virtual {v9}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 115
    return-object p0

    .line 116
    :cond_2
    add-int/lit8 v8, v8, 0x1

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :catchall_0
    :cond_3
    const-string p0, ""

    .line 120
    .line 121
    return-object p0
.end method

.method public static q0(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-static {p0}, Ls6;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/16 v1, 0x12

    .line 10
    .line 11
    if-gt v0, v1, :cond_0

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    const/16 v2, 0x8

    .line 21
    .line 22
    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v1, "..."

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    add-int/lit8 v1, v1, -0x5

    .line 39
    .line 40
    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0
.end method

.method public static r(Landroid/app/Activity;Ljava/lang/String;Z)Landroid/widget/TextView;
    .locals 4

    .line 1
    sget v0, Ls6;->a:I

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    const/4 v1, -0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    move v1, v0

    .line 8
    :goto_0
    const/4 v2, 0x0

    .line 9
    const/high16 v3, 0x41600000    # 14.0f

    .line 10
    .line 11
    invoke-static {p0, p1, v3, v1, v2}, Ls6;->x0(Landroid/app/Activity;Ljava/lang/String;FIZ)Landroid/widget/TextView;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const/16 v1, 0x11

    .line 16
    .line 17
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setGravity(I)V

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 22
    .line 23
    .line 24
    sget-object v1, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 25
    .line 26
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 27
    .line 28
    .line 29
    if-eqz p2, :cond_1

    .line 30
    .line 31
    move v1, v0

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    const/16 v1, 0xfa

    .line 34
    .line 35
    const/16 v2, 0xff

    .line 36
    .line 37
    const/16 v3, 0xf6

    .line 38
    .line 39
    invoke-static {v3, v1, v2}, Landroid/graphics/Color;->rgb(III)I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    :goto_1
    if-eqz p2, :cond_2

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_2
    const/16 p2, 0xd8

    .line 47
    .line 48
    const/16 v0, 0xf7

    .line 49
    .line 50
    const/16 v2, 0xc4

    .line 51
    .line 52
    invoke-static {v2, p2, v0}, Landroid/graphics/Color;->rgb(III)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    :goto_2
    const/high16 p2, 0x41200000    # 10.0f

    .line 57
    .line 58
    invoke-static {p0, p2}, Ls6;->u(Landroid/content/Context;F)I

    .line 59
    .line 60
    .line 61
    move-result p2

    .line 62
    new-instance v2, Landroid/graphics/drawable/GradientDrawable;

    .line 63
    .line 64
    invoke-direct {v2}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v2, v1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 68
    .line 69
    .line 70
    int-to-float p2, p2

    .line 71
    invoke-virtual {v2, p2}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 72
    .line 73
    .line 74
    const/high16 p2, 0x3f800000    # 1.0f

    .line 75
    .line 76
    invoke-static {p0, p2}, Ls6;->u(Landroid/content/Context;F)I

    .line 77
    .line 78
    .line 79
    move-result p0

    .line 80
    invoke-virtual {v2, p0, v0}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 84
    .line 85
    .line 86
    return-object p1
.end method

.method public static r0(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    :try_start_0
    new-instance v0, Landroid/app/Dialog;

    .line 2
    .line 3
    const v1, 0x1030010

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, p0, v1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->requestWindowFeature(I)Z

    .line 11
    .line 12
    .line 13
    invoke-static {p0, v0, p1, p2, p3}, Ls6;->k(Landroid/app/Activity;Landroid/app/Dialog;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/widget/LinearLayout;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-static {p0, p1}, Ls6;->G0(Landroid/content/Context;Landroid/widget/LinearLayout;)Landroid/widget/FrameLayout;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {v0, p0}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 22
    .line 23
    .line 24
    new-instance p0, Li6;

    .line 25
    .line 26
    const/4 p1, 0x0

    .line 27
    invoke-direct {p0, v0, p1}, Li6;-><init>(Landroid/app/Dialog;I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p0}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 34
    .line 35
    .line 36
    invoke-static {v0}, Ls6;->g(Landroid/app/Dialog;)V

    .line 37
    .line 38
    .line 39
    const-string p0, "group avatar title menu show"

    .line 40
    .line 41
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :catchall_0
    move-exception p0

    .line 46
    new-instance p1, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    const-string p2, "group avatar menu failed reason=member title "

    .line 49
    .line 50
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    const-string p2, ": "

    .line 54
    .line 55
    invoke-static {p0, p1, p2}, La;->d(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public static s(Landroid/app/Activity;)Landroid/graphics/drawable/GradientDrawable;
    .locals 2

    .line 1
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 4
    .line 5
    .line 6
    sget v1, Ls6;->d:I

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 9
    .line 10
    .line 11
    const/high16 v1, 0x41800000    # 16.0f

    .line 12
    .line 13
    invoke-static {p0, v1}, Ls6;->u(Landroid/content/Context;F)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    int-to-float v1, v1

    .line 18
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 19
    .line 20
    .line 21
    const/high16 v1, 0x3f800000    # 1.0f

    .line 22
    .line 23
    invoke-static {p0, v1}, Ls6;->u(Landroid/content/Context;F)I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    sget v1, Ls6;->e:I

    .line 28
    .line 29
    invoke-virtual {v0, p0, v1}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 30
    .line 31
    .line 32
    return-object v0
.end method

.method public static s0(Landroid/content/Context;Landroid/app/Activity;Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    .line 1
    :try_start_0
    new-instance v2, Landroid/app/Dialog;

    .line 2
    .line 3
    const v0, 0x1030010

    .line 4
    .line 5
    .line 6
    invoke-direct {v2, p1, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    invoke-virtual {v2, v0}, Landroid/app/Dialog;->requestWindowFeature(I)Z

    .line 11
    .line 12
    .line 13
    move-object v0, p0

    .line 14
    move-object v1, p1

    .line 15
    move-object v3, p2

    .line 16
    move-object v4, p3

    .line 17
    move-object v5, p4

    .line 18
    move-object v6, p5

    .line 19
    invoke-static/range {v0 .. v6}, Ls6;->l(Landroid/content/Context;Landroid/app/Activity;Landroid/app/Dialog;Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/widget/LinearLayout;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-static {v1, p0}, Ls6;->G0(Landroid/content/Context;Landroid/widget/LinearLayout;)Landroid/widget/FrameLayout;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {v2, p0}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 28
    .line 29
    .line 30
    new-instance p0, Li6;

    .line 31
    .line 32
    const/4 p1, 0x2

    .line 33
    invoke-direct {p0, v2, p1}, Li6;-><init>(Landroid/app/Dialog;I)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2, p0}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2}, Landroid/app/Dialog;->show()V

    .line 40
    .line 41
    .line 42
    invoke-static {v2}, Ls6;->g(Landroid/app/Dialog;)V

    .line 43
    .line 44
    .line 45
    const-string p0, "group avatar mute custom menu show"

    .line 46
    .line 47
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :catchall_0
    move-exception v0

    .line 52
    move-object p0, v0

    .line 53
    new-instance p1, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    const-string p2, "group avatar menu failed reason=mute duration "

    .line 56
    .line 57
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    const-string p2, ": "

    .line 61
    .line 62
    invoke-static {p0, p1, p2}, La;->d(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public static t(Landroid/app/Activity;)Landroid/view/View;
    .locals 4

    .line 1
    new-instance v0, Landroid/view/View;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    sget v1, Ls6;->f:I

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 12
    .line 13
    const/4 v2, -0x1

    .line 14
    const/4 v3, 0x1

    .line 15
    invoke-direct {v1, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 16
    .line 17
    .line 18
    const/high16 v2, 0x41600000    # 14.0f

    .line 19
    .line 20
    invoke-static {p0, v2}, Ls6;->u(Landroid/content/Context;F)I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    iput v3, v1, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 25
    .line 26
    invoke-static {p0, v2}, Ls6;->u(Landroid/content/Context;F)I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    iput p0, v1, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 33
    .line 34
    .line 35
    return-object v0
.end method

.method public static t0([B[II)Z
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_5

    .line 3
    .line 4
    array-length v1, p1

    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    const-wide/16 v1, 0x0

    .line 9
    .line 10
    const-wide/16 v3, -0x1

    .line 11
    .line 12
    const/4 v5, 0x1

    .line 13
    if-nez p2, :cond_1

    .line 14
    .line 15
    invoke-static {p0, p1, v3, v4}, Ls6;->h0([B[IJ)J

    .line 16
    .line 17
    .line 18
    move-result-wide p0

    .line 19
    cmp-long p0, p0, v1

    .line 20
    .line 21
    if-ltz p0, :cond_5

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    if-ne p2, v5, :cond_2

    .line 25
    .line 26
    aget p2, p1, v0

    .line 27
    .line 28
    add-int/lit8 p2, p2, 0x8

    .line 29
    .line 30
    aput p2, p1, v0

    .line 31
    .line 32
    array-length p0, p0

    .line 33
    if-gt p2, p0, :cond_5

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    const/4 v6, 0x2

    .line 37
    if-ne p2, v6, :cond_4

    .line 38
    .line 39
    invoke-static {p0, p1, v3, v4}, Ls6;->h0([B[IJ)J

    .line 40
    .line 41
    .line 42
    move-result-wide v3

    .line 43
    cmp-long p2, v3, v1

    .line 44
    .line 45
    if-ltz p2, :cond_5

    .line 46
    .line 47
    array-length p0, p0

    .line 48
    aget p2, p1, v0

    .line 49
    .line 50
    sub-int/2addr p0, p2

    .line 51
    int-to-long v1, p0

    .line 52
    cmp-long p0, v3, v1

    .line 53
    .line 54
    if-lez p0, :cond_3

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_3
    long-to-int p0, v3

    .line 58
    add-int/2addr p2, p0

    .line 59
    aput p2, p1, v0

    .line 60
    .line 61
    return v5

    .line 62
    :cond_4
    const/4 v1, 0x5

    .line 63
    if-ne p2, v1, :cond_5

    .line 64
    .line 65
    aget p2, p1, v0

    .line 66
    .line 67
    add-int/lit8 p2, p2, 0x4

    .line 68
    .line 69
    aput p2, p1, v0

    .line 70
    .line 71
    array-length p0, p0

    .line 72
    if-gt p2, p0, :cond_5

    .line 73
    .line 74
    :goto_0
    return v5

    .line 75
    :cond_5
    :goto_1
    return v0
.end method

.method public static u(Landroid/content/Context;F)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/4 v0, 0x1

    .line 10
    invoke-static {v0, p1, p0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    float-to-int p0, p0

    .line 15
    return p0
.end method

.method public static u0(Landroid/app/Activity;Ljava/lang/ClassLoader;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[B)Z
    .locals 7

    .line 1
    const-string v0, "putExtra"

    .line 2
    .line 3
    const-class v1, Ljava/lang/String;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    :try_start_0
    const-string v3, "mqq.app.NewIntent"

    .line 7
    .line 8
    invoke-static {v3, p1}, Lcom/mr/elaris/xposedcompat/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    const-string v4, "com.tencent.biz.ProtoServlet"

    .line 13
    .line 14
    invoke-static {v4, p1}, Lcom/mr/elaris/xposedcompat/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    const-string v5, "mqq.observer.BusinessObserver"

    .line 19
    .line 20
    invoke-static {v5, p1}, Lcom/mr/elaris/xposedcompat/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    const-class v5, Landroid/content/Context;

    .line 25
    .line 26
    const-class v6, Ljava/lang/Class;

    .line 27
    .line 28
    filled-new-array {v5, v6}, [Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    invoke-virtual {v3, v5}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    const/4 v6, 0x1

    .line 37
    invoke-virtual {v5, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    if-nez p0, :cond_0

    .line 45
    .line 46
    const-string p0, "group action failed type=\u8bbe\u7f6e\u5934\u8854 reason=ProtoServlet context null"

    .line 47
    .line 48
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return v2

    .line 52
    :catchall_0
    move-exception p0

    .line 53
    goto/16 :goto_4

    .line 54
    .line 55
    :cond_0
    filled-new-array {p0, v4}, [Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-virtual {v5, p0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    filled-new-array {v1, v1}, [Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    invoke-virtual {v3, v0, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    const-class v5, [B

    .line 72
    .line 73
    filled-new-array {v1, v5}, [Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-virtual {v3, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    const-string v1, "cmd"

    .line 82
    .line 83
    const-string v5, "OidbSvc.0x8fc_2"

    .line 84
    .line 85
    filled-new-array {v1, v5}, [Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-virtual {v4, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    const-string v1, "data"

    .line 93
    .line 94
    filled-new-array {v1, p6}, [Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p6

    .line 98
    invoke-virtual {v0, p0, p6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 102
    .line 103
    .line 104
    move-result-object p6

    .line 105
    filled-new-array {p1}, [Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    new-instance v1, Lm6;

    .line 110
    .line 111
    invoke-direct {v1, p3, p4}, Lm6;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    invoke-static {p6, v0, v1}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p3

    .line 118
    const-string p6, "setObserver"

    .line 119
    .line 120
    filled-new-array {p1}, [Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    invoke-virtual {v3, p6, p1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    filled-new-array {p3}, [Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p3

    .line 132
    invoke-virtual {p1, p0, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    invoke-static {p1}, Ls6;->e(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    move p3, v2

    .line 144
    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 145
    .line 146
    .line 147
    move-result p6

    .line 148
    if-ge p3, p6, :cond_3

    .line 149
    .line 150
    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object p6

    .line 154
    check-cast p6, Ljava/lang/reflect/Method;

    .line 155
    .line 156
    const-string v0, "startServlet"

    .line 157
    .line 158
    invoke-virtual {p6}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    if-eqz v0, :cond_2

    .line 167
    .line 168
    invoke-virtual {p6}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 169
    .line 170
    .line 171
    move-result v0

    .line 172
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    if-eqz v0, :cond_1

    .line 177
    .line 178
    goto :goto_1

    .line 179
    :cond_1
    invoke-virtual {p6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    array-length v1, v0

    .line 184
    if-ne v1, v6, :cond_2

    .line 185
    .line 186
    aget-object v0, v0, v2

    .line 187
    .line 188
    invoke-virtual {v0, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 189
    .line 190
    .line 191
    move-result v0

    .line 192
    if-eqz v0, :cond_2

    .line 193
    .line 194
    goto :goto_2

    .line 195
    :cond_2
    :goto_1
    add-int/lit8 p3, p3, 0x1

    .line 196
    .line 197
    goto :goto_0

    .line 198
    :cond_3
    const/4 p6, 0x0

    .line 199
    :goto_2
    if-nez p6, :cond_4

    .line 200
    .line 201
    new-instance p0, Ljava/lang/StringBuilder;

    .line 202
    .line 203
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 204
    .line 205
    .line 206
    const-string p1, "group action failed type=\u8bbe\u7f6e\u5934\u8854 reason=startServlet method null runtime="

    .line 207
    .line 208
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object p0

    .line 226
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    return v2

    .line 230
    :cond_4
    invoke-virtual {p6, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 231
    .line 232
    .line 233
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object p0

    .line 237
    invoke-virtual {p6, p2, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    new-instance p0, Ljava/lang/StringBuilder;

    .line 241
    .line 242
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 243
    .line 244
    .line 245
    const-string p1, "group action invoked class="

    .line 246
    .line 247
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 251
    .line 252
    .line 253
    move-result-object p1

    .line 254
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object p1

    .line 258
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 259
    .line 260
    .line 261
    const-string p1, " method="

    .line 262
    .line 263
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    invoke-static {p6}, Ls6;->R(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object p1

    .line 270
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    const-string p1, " cmd=OidbSvc.0x8fc_2 targetUin="

    .line 274
    .line 275
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 276
    .line 277
    .line 278
    invoke-virtual {p0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 279
    .line 280
    .line 281
    const-string p1, " titleLen="

    .line 282
    .line 283
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 284
    .line 285
    .line 286
    if-nez p5, :cond_5

    .line 287
    .line 288
    move p1, v2

    .line 289
    goto :goto_3

    .line 290
    :cond_5
    invoke-virtual {p5}, Ljava/lang/String;->length()I

    .line 291
    .line 292
    .line 293
    move-result p1

    .line 294
    :goto_3
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 295
    .line 296
    .line 297
    const-string p1, " payload=minimal-oidb channel=ProtoServlet"

    .line 298
    .line 299
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 300
    .line 301
    .line 302
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object p0

    .line 306
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 307
    .line 308
    .line 309
    return v6

    .line 310
    :goto_4
    invoke-static {p0}, Ls6;->C0(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 311
    .line 312
    .line 313
    move-result-object p0

    .line 314
    new-instance p1, Ljava/lang/StringBuilder;

    .line 315
    .line 316
    const-string p2, "group action proto servlet unavailable type=\u8bbe\u7f6e\u5934\u8854 reason="

    .line 317
    .line 318
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 319
    .line 320
    .line 321
    const-string p2, ": "

    .line 322
    .line 323
    invoke-static {p0, p1, p2}, La;->d(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    return v2
.end method

.method public static v(Landroid/app/Activity;)Landroid/widget/EditText;
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p0}, Landroid/app/Activity;->getCurrentFocus()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Landroid/widget/EditText;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Landroid/widget/EditText;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :catchall_0
    :cond_0
    const/4 v0, 0x0

    .line 13
    :try_start_1
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    if-nez p0, :cond_1

    .line 18
    .line 19
    move-object p0, v0

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    :goto_0
    const/4 v1, 0x0

    .line 26
    invoke-static {p0, v1}, Ls6;->z(Landroid/view/View;I)Landroid/widget/EditText;

    .line 27
    .line 28
    .line 29
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 30
    return-object p0

    .line 31
    :catchall_1
    return-object v0
.end method

.method public static v0(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Ls6;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-static {p2}, Ls6;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    invoke-static {p1}, Ls6;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-static {p2}, Ls6;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-static {p1, v1}, Ls6;->L(Ljava/lang/String;Ljava/lang/String;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    invoke-static {p1}, Ls6;->q0(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-static {p0, v1}, Ls6;->i0(Landroid/app/Activity;Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-lez p1, :cond_1

    .line 42
    .line 43
    invoke-static {p0}, Ls6;->q0(Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    goto :goto_0

    .line 48
    :cond_1
    const-string p0, ""

    .line 49
    .line 50
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    if-lez p1, :cond_3

    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-lez p1, :cond_2

    .line 61
    .line 62
    const-string p1, "  "

    .line 63
    .line 64
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    :cond_2
    const-string p1, "\u6210\u5458 "

    .line 68
    .line 69
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_3
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 77
    .line 78
    .line 79
    move-result p0

    .line 80
    if-lez p0, :cond_4

    .line 81
    .line 82
    const-string p0, "\u6210\u5458"

    .line 83
    .line 84
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    :cond_4
    :goto_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    return-object p0
.end method

.method public static w(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
    .locals 1

    .line 1
    :goto_0
    if-eqz p0, :cond_0

    .line 2
    .line 3
    const-class v0, Ljava/lang/Object;

    .line 4
    .line 5
    if-eq p0, v0, :cond_0

    .line 6
    .line 7
    :try_start_0
    invoke-virtual {p0, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 8
    .line 9
    .line 10
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    return-object p0

    .line 12
    :catchall_0
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public static w0(Ljava/lang/Object;ILjava/util/Set;)Ljava/lang/String;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    const-string v3, "sender"

    .line 8
    .line 9
    const-string v4, ""

    .line 10
    .line 11
    if-eqz v0, :cond_f

    .line 12
    .line 13
    const/4 v5, 0x3

    .line 14
    if-gt v1, v5, :cond_f

    .line 15
    .line 16
    if-eqz v2, :cond_f

    .line 17
    .line 18
    invoke-interface {v2, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v5

    .line 22
    if-nez v5, :cond_0

    .line 23
    .line 24
    goto/16 :goto_6

    .line 25
    .line 26
    :cond_0
    instance-of v5, v0, Ljava/lang/CharSequence;

    .line 27
    .line 28
    if-eqz v5, :cond_2

    .line 29
    .line 30
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const-string v13, "targetUin"

    .line 35
    .line 36
    const-string v14, "targetUid"

    .line 37
    .line 38
    const-string v5, "senderUin"

    .line 39
    .line 40
    const-string v6, "senderUid"

    .line 41
    .line 42
    const-string v7, "fromUin"

    .line 43
    .line 44
    const-string v8, "fromUid"

    .line 45
    .line 46
    const-string v9, "sendUin"

    .line 47
    .line 48
    const-string v10, "sendUid"

    .line 49
    .line 50
    const-string v11, "memberUin"

    .line 51
    .line 52
    const-string v12, "memberUid"

    .line 53
    .line 54
    filled-new-array/range {v5 .. v14}, [Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-static {v0, v1}, Ls6;->E0(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-static {v0}, Ls6;->Z(Ljava/lang/String;)Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-eqz v1, :cond_1

    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    return-object v0

    .line 73
    :cond_1
    return-object v4

    .line 74
    :cond_2
    instance-of v5, v0, Ljava/lang/Number;

    .line 75
    .line 76
    if-nez v5, :cond_f

    .line 77
    .line 78
    instance-of v5, v0, Ljava/lang/Boolean;

    .line 79
    .line 80
    if-eqz v5, :cond_3

    .line 81
    .line 82
    goto/16 :goto_6

    .line 83
    .line 84
    :cond_3
    const-string v15, "targetUin"

    .line 85
    .line 86
    const-string v16, "targetUid"

    .line 87
    .line 88
    const-string v6, "senderuin"

    .line 89
    .line 90
    const-string v7, "senderUid"

    .line 91
    .line 92
    const-string v8, "senderUin"

    .line 93
    .line 94
    const-string v9, "fromUin"

    .line 95
    .line 96
    const-string v10, "fromUid"

    .line 97
    .line 98
    const-string v11, "sendUin"

    .line 99
    .line 100
    const-string v12, "sendUid"

    .line 101
    .line 102
    const-string v13, "memberUin"

    .line 103
    .line 104
    const-string v14, "memberUid"

    .line 105
    .line 106
    filled-new-array/range {v6 .. v16}, [Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    invoke-static {v0, v5}, Ls6;->C(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    invoke-static {v5}, Ls6;->Z(Ljava/lang/String;)Z

    .line 115
    .line 116
    .line 117
    move-result v6

    .line 118
    if-eqz v6, :cond_4

    .line 119
    .line 120
    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    return-object v0

    .line 125
    :cond_4
    const-string v13, "getTargetUin"

    .line 126
    .line 127
    const-string v14, "getTargetUid"

    .line 128
    .line 129
    const-string v5, "getSenderUin"

    .line 130
    .line 131
    const-string v6, "getSenderUid"

    .line 132
    .line 133
    const-string v7, "getFromUin"

    .line 134
    .line 135
    const-string v8, "getFromUid"

    .line 136
    .line 137
    const-string v9, "getSendUin"

    .line 138
    .line 139
    const-string v10, "getSendUid"

    .line 140
    .line 141
    const-string v11, "getMemberUin"

    .line 142
    .line 143
    const-string v12, "getMemberUid"

    .line 144
    .line 145
    filled-new-array/range {v5 .. v14}, [Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v5

    .line 149
    invoke-static {v0, v5}, Ls6;->m(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v5

    .line 153
    if-nez v5, :cond_5

    .line 154
    .line 155
    move-object v6, v4

    .line 156
    goto :goto_0

    .line 157
    :cond_5
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v6

    .line 161
    :goto_0
    invoke-static {v6}, Ls6;->Z(Ljava/lang/String;)Z

    .line 162
    .line 163
    .line 164
    move-result v6

    .line 165
    if-eqz v6, :cond_6

    .line 166
    .line 167
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    return-object v0

    .line 176
    :cond_6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    move-result-object v5

    .line 180
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v6

    .line 184
    if-lez v1, :cond_7

    .line 185
    .line 186
    const-string v7, "com.tencent."

    .line 187
    .line 188
    invoke-virtual {v6, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 189
    .line 190
    .line 191
    move-result v6

    .line 192
    if-nez v6, :cond_7

    .line 193
    .line 194
    instance-of v6, v0, Landroid/view/View;

    .line 195
    .line 196
    if-nez v6, :cond_7

    .line 197
    .line 198
    return-object v4

    .line 199
    :cond_7
    :goto_1
    if-eqz v5, :cond_f

    .line 200
    .line 201
    const-class v6, Ljava/lang/Object;

    .line 202
    .line 203
    if-eq v5, v6, :cond_f

    .line 204
    .line 205
    :try_start_0
    invoke-virtual {v5}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 206
    .line 207
    .line 208
    move-result-object v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 209
    goto :goto_2

    .line 210
    :catchall_0
    const/4 v6, 0x0

    .line 211
    :goto_2
    if-eqz v6, :cond_e

    .line 212
    .line 213
    array-length v7, v6

    .line 214
    const/4 v8, 0x0

    .line 215
    :goto_3
    if-ge v8, v7, :cond_e

    .line 216
    .line 217
    aget-object v9, v6, v8

    .line 218
    .line 219
    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 220
    .line 221
    .line 222
    move-result v10

    .line 223
    invoke-static {v10}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 224
    .line 225
    .line 226
    move-result v10

    .line 227
    if-eqz v10, :cond_8

    .line 228
    .line 229
    goto/16 :goto_5

    .line 230
    .line 231
    :cond_8
    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v10

    .line 235
    sget-object v11, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 236
    .line 237
    invoke-virtual {v10, v11}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v10

    .line 241
    const/4 v11, 0x1

    .line 242
    :try_start_1
    invoke-virtual {v9, v11}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v9, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v9

    .line 249
    invoke-virtual {v10, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 250
    .line 251
    .line 252
    move-result v12
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 253
    const-string v13, "member"

    .line 254
    .line 255
    if-nez v12, :cond_9

    .line 256
    .line 257
    :try_start_2
    invoke-virtual {v10, v13}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 258
    .line 259
    .line 260
    move-result v12

    .line 261
    if-nez v12, :cond_9

    .line 262
    .line 263
    const-string v12, "from"

    .line 264
    .line 265
    invoke-virtual {v10, v12}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 266
    .line 267
    .line 268
    move-result v12

    .line 269
    if-nez v12, :cond_9

    .line 270
    .line 271
    const-string v12, "target"

    .line 272
    .line 273
    invoke-virtual {v10, v12}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 274
    .line 275
    .line 276
    move-result v12

    .line 277
    if-nez v12, :cond_9

    .line 278
    .line 279
    const-string v12, "uin"

    .line 280
    .line 281
    invoke-virtual {v12, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    move-result v12

    .line 285
    if-nez v12, :cond_9

    .line 286
    .line 287
    const-string v12, "uid"

    .line 288
    .line 289
    invoke-virtual {v12, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    move-result v12

    .line 293
    if-eqz v12, :cond_b

    .line 294
    .line 295
    :cond_9
    if-nez v9, :cond_a

    .line 296
    .line 297
    move-object v12, v4

    .line 298
    goto :goto_4

    .line 299
    :cond_a
    invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v12

    .line 303
    :goto_4
    invoke-static {v12}, Ls6;->Z(Ljava/lang/String;)Z

    .line 304
    .line 305
    .line 306
    move-result v14

    .line 307
    if-eqz v14, :cond_b

    .line 308
    .line 309
    invoke-virtual {v12}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    return-object v0

    .line 314
    :cond_b
    const-string v12, "msg"

    .line 315
    .line 316
    invoke-virtual {v10, v12}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 317
    .line 318
    .line 319
    move-result v12

    .line 320
    if-nez v12, :cond_c

    .line 321
    .line 322
    const-string v12, "item"

    .line 323
    .line 324
    invoke-virtual {v10, v12}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 325
    .line 326
    .line 327
    move-result v12

    .line 328
    if-nez v12, :cond_c

    .line 329
    .line 330
    const-string v12, "record"

    .line 331
    .line 332
    invoke-virtual {v10, v12}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 333
    .line 334
    .line 335
    move-result v12

    .line 336
    if-nez v12, :cond_c

    .line 337
    .line 338
    invoke-virtual {v10, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 339
    .line 340
    .line 341
    move-result v12

    .line 342
    if-nez v12, :cond_c

    .line 343
    .line 344
    invoke-virtual {v10, v13}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 345
    .line 346
    .line 347
    move-result v12

    .line 348
    if-nez v12, :cond_c

    .line 349
    .line 350
    const-string v12, "user"

    .line 351
    .line 352
    invoke-virtual {v10, v12}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 353
    .line 354
    .line 355
    move-result v10

    .line 356
    if-eqz v10, :cond_d

    .line 357
    .line 358
    :cond_c
    add-int/lit8 v10, v1, 0x1

    .line 359
    .line 360
    invoke-static {v9, v10, v2}, Ls6;->w0(Ljava/lang/Object;ILjava/util/Set;)Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object v9

    .line 364
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 365
    .line 366
    .line 367
    move-result v10
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 368
    const/4 v11, 0x5

    .line 369
    if-lt v10, v11, :cond_d

    .line 370
    .line 371
    return-object v9

    .line 372
    :catchall_1
    :cond_d
    :goto_5
    add-int/lit8 v8, v8, 0x1

    .line 373
    .line 374
    goto/16 :goto_3

    .line 375
    .line 376
    :cond_e
    invoke-virtual {v5}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 377
    .line 378
    .line 379
    move-result-object v5

    .line 380
    goto/16 :goto_1

    .line 381
    .line 382
    :cond_f
    :goto_6
    return-object v4
.end method

.method public static x(Landroid/view/View;ILjava/util/HashSet;)Ljava/lang/String;
    .locals 5

    .line 1
    if-eqz p0, :cond_4

    .line 2
    .line 3
    const/4 v0, 0x7

    .line 4
    if-gt p1, v0, :cond_4

    .line 5
    .line 6
    invoke-virtual {p2, p0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    goto :goto_2

    .line 13
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    const/4 v0, 0x0

    .line 19
    :goto_0
    invoke-static {v0}, Ls6;->F(Ljava/lang/Object;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    const/4 v2, 0x5

    .line 28
    if-lt v1, v2, :cond_1

    .line 29
    .line 30
    return-object v0

    .line 31
    :cond_1
    invoke-static {p0}, Ls6;->F(Ljava/lang/Object;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-lt v1, v2, :cond_2

    .line 40
    .line 41
    return-object v0

    .line 42
    :cond_2
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 43
    .line 44
    if-eqz v0, :cond_4

    .line 45
    .line 46
    check-cast p0, Landroid/view/ViewGroup;

    .line 47
    .line 48
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    const/16 v1, 0x50

    .line 53
    .line 54
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    const/4 v1, 0x0

    .line 59
    :goto_1
    if-ge v1, v0, :cond_4

    .line 60
    .line 61
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    add-int/lit8 v4, p1, 0x1

    .line 66
    .line 67
    invoke-static {v3, v4, p2}, Ls6;->x(Landroid/view/View;ILjava/util/HashSet;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    if-lt v4, v2, :cond_3

    .line 76
    .line 77
    return-object v3

    .line 78
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_4
    :goto_2
    const-string p0, ""

    .line 82
    .line 83
    return-object p0
.end method

.method public static x0(Landroid/app/Activity;Ljava/lang/String;FIZ)Landroid/widget/TextView;
    .locals 1

    .line 1
    new-instance v0, Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    const-string p1, ""

    .line 9
    .line 10
    :cond_0
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x2

    .line 14
    invoke-virtual {v0, p0, p2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x1

    .line 21
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 22
    .line 23
    .line 24
    if-eqz p4, :cond_1

    .line 25
    .line 26
    sget-object p1, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    .line 27
    .line 28
    invoke-virtual {v0, p1, p0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 29
    .line 30
    .line 31
    :cond_1
    return-object v0
.end method

.method public static varargs y(Ljava/lang/ClassLoader;[Ljava/lang/String;)Ljava/lang/Class;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    array-length v1, p1

    .line 3
    if-ge v0, v1, :cond_0

    .line 4
    .line 5
    :try_start_0
    aget-object v1, p1, v0

    .line 6
    .line 7
    invoke-static {v1, p0}, Lcom/mr/elaris/xposedcompat/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    return-object p0

    .line 12
    :catchall_0
    add-int/lit8 v0, v0, 0x1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return-object p0
.end method

.method public static y0(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "group action toast suppressed text="

    .line 2
    .line 3
    :try_start_0
    invoke-static {p0}, Ls6;->m0(Ljava/lang/Object;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    :catchall_0
    return-void
.end method

.method public static z(Landroid/view/View;I)Landroid/widget/EditText;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_5

    .line 3
    .line 4
    const/16 v1, 0x8

    .line 5
    .line 6
    if-le p1, v1, :cond_0

    .line 7
    .line 8
    goto :goto_2

    .line 9
    :cond_0
    instance-of v1, p0, Landroid/widget/EditText;

    .line 10
    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    move-object v1, p0

    .line 14
    check-cast v1, Landroid/widget/EditText;

    .line 15
    .line 16
    :try_start_0
    invoke-virtual {v1}, Landroid/view/View;->isShown()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    invoke-virtual {v1}, Landroid/view/View;->isEnabled()Z

    .line 23
    .line 24
    .line 25
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    return-object v1

    .line 29
    :catchall_0
    :cond_1
    instance-of v1, p0, Landroid/view/ViewGroup;

    .line 30
    .line 31
    if-eqz v1, :cond_5

    .line 32
    .line 33
    check-cast p0, Landroid/view/ViewGroup;

    .line 34
    .line 35
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    const/16 v2, 0x50

    .line 40
    .line 41
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    add-int/lit8 v1, v1, -0x1

    .line 46
    .line 47
    :goto_0
    if-ltz v1, :cond_5

    .line 48
    .line 49
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    add-int/lit8 v3, p1, 0x1

    .line 54
    .line 55
    invoke-static {v2, v3}, Ls6;->z(Landroid/view/View;I)Landroid/widget/EditText;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    if-nez v2, :cond_2

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_2
    invoke-virtual {v2}, Landroid/view/View;->hasFocus()Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-eqz v3, :cond_3

    .line 67
    .line 68
    return-object v2

    .line 69
    :cond_3
    if-nez v0, :cond_4

    .line 70
    .line 71
    move-object v0, v2

    .line 72
    :cond_4
    :goto_1
    add-int/lit8 v1, v1, -0x1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_5
    :goto_2
    return-object v0
.end method

.method public static z0(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Ls6;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const-string v1, "u_"

    .line 11
    .line 12
    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :cond_0
    invoke-static {p0, p1}, Ls6;->A0(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-lez v1, :cond_1

    .line 31
    .line 32
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    if-lez p0, :cond_2

    .line 40
    .line 41
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    if-nez p0, :cond_2

    .line 46
    .line 47
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    :cond_2
    return-object v0
.end method
