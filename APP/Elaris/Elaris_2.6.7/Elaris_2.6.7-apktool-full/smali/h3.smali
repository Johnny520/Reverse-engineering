.class public abstract Lh3;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# static fields
.field public static final a:Lt0;

.field public static volatile b:Z

.field public static final c:Ljava/lang/ThreadLocal;

.field public static final d:Ljava/lang/Object;

.field public static final e:Ljava/util/HashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lt0;

    .line 2
    .line 3
    const/16 v1, 0x40

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lt0;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lh3;->a:Lt0;

    .line 9
    .line 10
    new-instance v0, Ljava/lang/ThreadLocal;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lh3;->c:Ljava/lang/ThreadLocal;

    .line 16
    .line 17
    new-instance v0, Ljava/lang/Object;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    sput-object v0, Lh3;->d:Ljava/lang/Object;

    .line 23
    .line 24
    new-instance v0, Ljava/util/HashMap;

    .line 25
    .line 26
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lh3;->e:Ljava/util/HashMap;

    .line 30
    .line 31
    return-void
.end method

.method public static A(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    goto :goto_3

    .line 5
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1, p1, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1, p0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    return-object p0

    .line 18
    :catchall_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    :goto_0
    const/4 v2, 0x1

    .line 23
    const-class v3, Ljava/lang/Object;

    .line 24
    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    if-eq v1, v3, :cond_2

    .line 28
    .line 29
    :try_start_1
    invoke-virtual {v1, p1, v0}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    array-length v4, v4

    .line 38
    if-eqz v4, :cond_1

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    invoke-virtual {v3, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v3, p0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 48
    return-object p0

    .line 49
    :catchall_1
    :goto_1
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    goto :goto_0

    .line 54
    :cond_2
    :try_start_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {p1, p2}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {p1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 66
    return-object p0

    .line 67
    :catchall_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    :goto_2
    if-eqz p1, :cond_3

    .line 72
    .line 73
    if-eq p1, v3, :cond_3

    .line 74
    .line 75
    :try_start_3
    invoke-virtual {p1, p2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 86
    return-object p0

    .line 87
    :catchall_3
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    goto :goto_2

    .line 92
    :cond_3
    :goto_3
    return-object v0
.end method

.method public static B(Ljava/lang/Object;Ljava/io/File;J)I
    .locals 11

    .line 1
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    const-string p1, "getMsgRecord"

    .line 10
    .line 11
    const-string v0, "msgRecord"

    .line 12
    .line 13
    invoke-static {p0, p1, v0}, Lh3;->A(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const-string v0, "getMsgElementId"

    .line 18
    .line 19
    const-string v3, "msgElementId"

    .line 20
    .line 21
    invoke-static {p0, v0, v3}, Lh3;->w(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)J

    .line 22
    .line 23
    .line 24
    move-result-wide v3

    .line 25
    const-string v0, "getElements"

    .line 26
    .line 27
    const-string v5, "elements"

    .line 28
    .line 29
    invoke-static {p1, v0, v5}, Lh3;->A(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    instance-of v0, p1, Ljava/lang/Iterable;

    .line 34
    .line 35
    const/4 v5, 0x0

    .line 36
    if-nez v0, :cond_0

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_0
    check-cast p1, Ljava/lang/Iterable;

    .line 40
    .line 41
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    const/4 v0, 0x0

    .line 46
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    if-eqz v6, :cond_6

    .line 51
    .line 52
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v6

    .line 56
    if-nez v6, :cond_2

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    const-string v7, "getElementId"

    .line 60
    .line 61
    const-string v8, "elementId"

    .line 62
    .line 63
    invoke-static {v6, v7, v8}, Lh3;->w(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)J

    .line 64
    .line 65
    .line 66
    move-result-wide v7

    .line 67
    const-string v9, "getFileElement"

    .line 68
    .line 69
    const-string v10, "fileElement"

    .line 70
    .line 71
    invoke-static {v6, v9, v10}, Lh3;->A(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    if-nez v6, :cond_3

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_3
    const-wide/16 v9, 0x0

    .line 79
    .line 80
    cmp-long v9, v3, v9

    .line 81
    .line 82
    if-eqz v9, :cond_5

    .line 83
    .line 84
    cmp-long v7, v7, v3

    .line 85
    .line 86
    if-nez v7, :cond_5

    .line 87
    .line 88
    invoke-static {v6, v1, v2, p2, p3}, Lh3;->j(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;J)Z

    .line 89
    .line 90
    .line 91
    move-result v7

    .line 92
    if-nez v7, :cond_4

    .line 93
    .line 94
    move v7, v5

    .line 95
    goto :goto_1

    .line 96
    :cond_4
    invoke-static {v6, v1}, Lh3;->x(Ljava/lang/Object;Ljava/lang/String;)Z

    .line 97
    .line 98
    .line 99
    move-result v7

    .line 100
    :goto_1
    if-eqz v7, :cond_5

    .line 101
    .line 102
    const/4 v5, 0x1

    .line 103
    goto :goto_2

    .line 104
    :cond_5
    if-nez v0, :cond_1

    .line 105
    .line 106
    invoke-static {v6, v1, v2, p2, p3}, Lh3;->j(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;J)Z

    .line 107
    .line 108
    .line 109
    move-result v7

    .line 110
    if-eqz v7, :cond_1

    .line 111
    .line 112
    move-object v0, v6

    .line 113
    goto :goto_0

    .line 114
    :cond_6
    invoke-static {v0, v1, v2, p2, p3}, Lh3;->j(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;J)Z

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    if-nez p1, :cond_7

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_7
    invoke-static {v0, v1}, Lh3;->x(Ljava/lang/Object;Ljava/lang/String;)Z

    .line 122
    .line 123
    .line 124
    move-result v5

    .line 125
    :goto_2
    if-lez v5, :cond_8

    .line 126
    .line 127
    return v5

    .line 128
    :cond_8
    new-instance p1, Ljava/util/IdentityHashMap;

    .line 129
    .line 130
    invoke-direct {p1}, Ljava/util/IdentityHashMap;-><init>()V

    .line 131
    .line 132
    .line 133
    invoke-static {p1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 134
    .line 135
    .line 136
    move-result-object v5

    .line 137
    const/4 v6, 0x0

    .line 138
    move-object v0, p0

    .line 139
    move-wide v3, p2

    .line 140
    invoke-static/range {v0 .. v6}, Lh3;->C(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;JLjava/util/Set;I)I

    .line 141
    .line 142
    .line 143
    move-result p0

    .line 144
    return p0
.end method

.method public static C(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;JLjava/util/Set;I)I
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v5, p5

    .line 4
    .line 5
    move/from16 v8, p6

    .line 6
    .line 7
    const/4 v9, 0x0

    .line 8
    if-eqz v0, :cond_11

    .line 9
    .line 10
    const/4 v1, 0x6

    .line 11
    if-gt v8, v1, :cond_11

    .line 12
    .line 13
    instance-of v1, v0, Ljava/lang/String;

    .line 14
    .line 15
    if-nez v1, :cond_11

    .line 16
    .line 17
    instance-of v1, v0, Ljava/lang/Number;

    .line 18
    .line 19
    if-nez v1, :cond_11

    .line 20
    .line 21
    instance-of v1, v0, Ljava/lang/Boolean;

    .line 22
    .line 23
    if-nez v1, :cond_11

    .line 24
    .line 25
    instance-of v1, v0, Ljava/lang/Character;

    .line 26
    .line 27
    if-nez v1, :cond_11

    .line 28
    .line 29
    instance-of v1, v0, Ljava/lang/Enum;

    .line 30
    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    goto/16 :goto_5

    .line 34
    .line 35
    :cond_0
    invoke-interface {v5, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    goto/16 :goto_5

    .line 42
    .line 43
    :cond_1
    invoke-interface {v5, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    invoke-static {v0}, Lh3;->v(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_3

    .line 51
    .line 52
    invoke-static/range {p0 .. p4}, Lh3;->j(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;J)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-nez v1, :cond_2

    .line 57
    .line 58
    return v9

    .line 59
    :cond_2
    invoke-static/range {p0 .. p1}, Lh3;->x(Ljava/lang/Object;Ljava/lang/String;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    return v0

    .line 64
    :cond_3
    instance-of v1, v0, Ljava/lang/Iterable;

    .line 65
    .line 66
    const/4 v10, 0x1

    .line 67
    if-eqz v1, :cond_6

    .line 68
    .line 69
    check-cast v0, Ljava/lang/Iterable;

    .line 70
    .line 71
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 72
    .line 73
    .line 74
    move-result-object v7

    .line 75
    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-eqz v0, :cond_5

    .line 80
    .line 81
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    add-int/lit8 v6, v8, 0x1

    .line 86
    .line 87
    move-object/from16 v1, p1

    .line 88
    .line 89
    move-object/from16 v2, p2

    .line 90
    .line 91
    move-wide/from16 v3, p3

    .line 92
    .line 93
    invoke-static/range {v0 .. v6}, Lh3;->C(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;JLjava/util/Set;I)I

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    add-int/2addr v9, v0

    .line 98
    if-lez v9, :cond_4

    .line 99
    .line 100
    return v9

    .line 101
    :cond_4
    move-object/from16 v5, p5

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_5
    return v9

    .line 105
    :cond_6
    instance-of v1, v0, Ljava/util/Map;

    .line 106
    .line 107
    if-eqz v1, :cond_9

    .line 108
    .line 109
    check-cast v0, Ljava/util/Map;

    .line 110
    .line 111
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 116
    .line 117
    .line 118
    move-result-object v7

    .line 119
    :cond_7
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    if-eqz v0, :cond_8

    .line 124
    .line 125
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    add-int/lit8 v6, v8, 0x1

    .line 130
    .line 131
    move-object/from16 v1, p1

    .line 132
    .line 133
    move-object/from16 v2, p2

    .line 134
    .line 135
    move-wide/from16 v3, p3

    .line 136
    .line 137
    move-object/from16 v5, p5

    .line 138
    .line 139
    invoke-static/range {v0 .. v6}, Lh3;->C(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;JLjava/util/Set;I)I

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    add-int/2addr v9, v0

    .line 144
    if-lez v9, :cond_7

    .line 145
    .line 146
    :cond_8
    return v9

    .line 147
    :cond_9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    invoke-virtual {v1}, Ljava/lang/Class;->isArray()Z

    .line 152
    .line 153
    .line 154
    move-result v2

    .line 155
    if-eqz v2, :cond_c

    .line 156
    .line 157
    invoke-static {v0}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 158
    .line 159
    .line 160
    move-result v11

    .line 161
    move v12, v9

    .line 162
    :goto_1
    if-ge v9, v11, :cond_b

    .line 163
    .line 164
    invoke-static {v0, v9}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    add-int/lit8 v7, v8, 0x1

    .line 169
    .line 170
    move-object/from16 v2, p1

    .line 171
    .line 172
    move-object/from16 v3, p2

    .line 173
    .line 174
    move-wide/from16 v4, p3

    .line 175
    .line 176
    move-object/from16 v6, p5

    .line 177
    .line 178
    invoke-static/range {v1 .. v7}, Lh3;->C(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;JLjava/util/Set;I)I

    .line 179
    .line 180
    .line 181
    move-result v1

    .line 182
    add-int/2addr v12, v1

    .line 183
    if-lez v12, :cond_a

    .line 184
    .line 185
    return v12

    .line 186
    :cond_a
    add-int/lit8 v9, v9, 0x1

    .line 187
    .line 188
    goto :goto_1

    .line 189
    :cond_b
    return v12

    .line 190
    :cond_c
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    const-string v3, "com.tencent."

    .line 195
    .line 196
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 197
    .line 198
    .line 199
    move-result v2

    .line 200
    if-eqz v2, :cond_11

    .line 201
    .line 202
    move-object v11, v1

    .line 203
    move v1, v9

    .line 204
    :goto_2
    if-eqz v11, :cond_10

    .line 205
    .line 206
    const-class v2, Ljava/lang/Object;

    .line 207
    .line 208
    if-eq v11, v2, :cond_10

    .line 209
    .line 210
    :try_start_0
    invoke-virtual {v11}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 211
    .line 212
    .line 213
    move-result-object v12
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 214
    array-length v13, v12

    .line 215
    move v14, v1

    .line 216
    move v15, v9

    .line 217
    :goto_3
    if-ge v15, v13, :cond_f

    .line 218
    .line 219
    aget-object v1, v12, v15

    .line 220
    .line 221
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 222
    .line 223
    .line 224
    move-result v2

    .line 225
    invoke-static {v2}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 226
    .line 227
    .line 228
    move-result v2

    .line 229
    if-nez v2, :cond_e

    .line 230
    .line 231
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 232
    .line 233
    .line 234
    move-result-object v2

    .line 235
    invoke-virtual {v2}, Ljava/lang/Class;->isPrimitive()Z

    .line 236
    .line 237
    .line 238
    move-result v2

    .line 239
    if-eqz v2, :cond_d

    .line 240
    .line 241
    goto :goto_4

    .line 242
    :cond_d
    :try_start_1
    invoke-virtual {v1, v10}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v1, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v1

    .line 249
    add-int/lit8 v7, v8, 0x1

    .line 250
    .line 251
    move-object/from16 v2, p1

    .line 252
    .line 253
    move-object/from16 v3, p2

    .line 254
    .line 255
    move-wide/from16 v4, p3

    .line 256
    .line 257
    move-object/from16 v6, p5

    .line 258
    .line 259
    invoke-static/range {v1 .. v7}, Lh3;->C(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;JLjava/util/Set;I)I

    .line 260
    .line 261
    .line 262
    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 263
    add-int/2addr v14, v1

    .line 264
    if-lez v14, :cond_e

    .line 265
    .line 266
    return v14

    .line 267
    :catchall_0
    :cond_e
    :goto_4
    add-int/lit8 v15, v15, 0x1

    .line 268
    .line 269
    goto :goto_3

    .line 270
    :cond_f
    move v1, v14

    .line 271
    :catchall_1
    invoke-virtual {v11}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 272
    .line 273
    .line 274
    move-result-object v11

    .line 275
    goto :goto_2

    .line 276
    :cond_10
    return v1

    .line 277
    :cond_11
    :goto_5
    return v9
.end method

.method public static D(J)V
    .locals 8

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v1, Lh3;->e:Ljava/util/HashMap;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_1

    .line 25
    .line 26
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    check-cast v3, Ljava/util/Map$Entry;

    .line 31
    .line 32
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    check-cast v4, Lf3;

    .line 37
    .line 38
    iget-wide v4, v4, Lf3;->c:J

    .line 39
    .line 40
    sub-long v4, p0, v4

    .line 41
    .line 42
    const-wide/32 v6, 0x927c0

    .line 43
    .line 44
    .line 45
    cmp-long v4, v4, v6

    .line 46
    .line 47
    if-lez v4, :cond_0

    .line 48
    .line 49
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    check-cast v3, Ljava/lang/String;

    .line 54
    .line 55
    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-eqz p1, :cond_2

    .line 68
    .line 69
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    check-cast p1, Ljava/lang/String;

    .line 74
    .line 75
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_2
    return-void
.end method

.method public static E(Ljava/io/File;Ljava/io/File;)Ljava/io/File;
    .locals 32

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-virtual {v1}, Ljava/io/File;->isFile()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const-string v2, ": "

    .line 8
    .line 9
    const-string v3, " reason="

    .line 10
    .line 11
    const-string v4, " size="

    .line 12
    .line 13
    const-string v5, "application/octet-stream"

    .line 14
    .line 15
    const/high16 v8, 0x20000

    .line 16
    .line 17
    const-string v9, " to="

    .line 18
    .line 19
    const-string v10, "download redirect collision target advanced from="

    .line 20
    .line 21
    const/16 v11, 0x14

    .line 22
    .line 23
    const/4 v13, 0x0

    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    :goto_0
    const/4 v14, 0x0

    .line 27
    const/16 v20, 0x1

    .line 28
    .line 29
    goto/16 :goto_c

    .line 30
    .line 31
    :cond_0
    move-object/from16 v16, p1

    .line 32
    .line 33
    move v0, v13

    .line 34
    move v15, v0

    .line 35
    :goto_1
    if-ge v0, v11, :cond_13

    .line 36
    .line 37
    :try_start_0
    invoke-virtual/range {v16 .. v16}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 38
    .line 39
    .line 40
    move-result-object v17

    .line 41
    if-nez v17, :cond_1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    invoke-virtual/range {v17 .. v17}, Ljava/io/File;->exists()Z

    .line 45
    .line 46
    .line 47
    move-result v18

    .line 48
    if-nez v18, :cond_2

    .line 49
    .line 50
    invoke-virtual/range {v17 .. v17}, Ljava/io/File;->mkdirs()Z

    .line 51
    .line 52
    .line 53
    move-result v17

    .line 54
    if-nez v17, :cond_2

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :catchall_0
    move-exception v0

    .line 58
    move-object/from16 v11, v16

    .line 59
    .line 60
    const/16 v20, 0x1

    .line 61
    .line 62
    goto/16 :goto_b

    .line 63
    .line 64
    :cond_2
    const-string v6, "filesystem"

    .line 65
    .line 66
    invoke-static {}, Lcom/mr/elaris/HookEntry;->hostContext()Landroid/content/Context;

    .line 67
    .line 68
    .line 69
    move-result-object v7

    .line 70
    if-eqz v7, :cond_4

    .line 71
    .line 72
    invoke-virtual/range {v16 .. v16}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 73
    .line 74
    .line 75
    move-result-object v19
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    const/16 v20, 0x1

    .line 77
    .line 78
    :try_start_1
    invoke-static/range {v19 .. v19}, Lh3;->y(Ljava/io/File;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v12

    .line 82
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    .line 83
    .line 84
    .line 85
    move-result v19

    .line 86
    if-nez v19, :cond_3

    .line 87
    .line 88
    move-object/from16 v11, v16

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_3
    invoke-virtual {v7}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 92
    .line 93
    .line 94
    move-result-object v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 95
    move-object/from16 v11, v16

    .line 96
    .line 97
    :try_start_2
    invoke-static {v7, v12, v11, v6}, Lh3;->f(Landroid/content/ContentResolver;Ljava/lang/String;Ljava/io/File;Ljava/lang/String;)I

    .line 98
    .line 99
    .line 100
    goto :goto_2

    .line 101
    :catchall_1
    move-exception v0

    .line 102
    move-object/from16 v11, v16

    .line 103
    .line 104
    goto/16 :goto_b

    .line 105
    .line 106
    :cond_4
    move-object/from16 v11, v16

    .line 107
    .line 108
    const/16 v20, 0x1

    .line 109
    .line 110
    :goto_2
    invoke-virtual {v11}, Ljava/io/File;->exists()Z

    .line 111
    .line 112
    .line 113
    move-result v6

    .line 114
    if-eqz v6, :cond_8

    .line 115
    .line 116
    if-eqz v15, :cond_5

    .line 117
    .line 118
    invoke-static {v11}, La3;->p(Ljava/io/File;)V

    .line 119
    .line 120
    .line 121
    goto :goto_3

    .line 122
    :catchall_2
    move-exception v0

    .line 123
    goto/16 :goto_b

    .line 124
    .line 125
    :cond_5
    :goto_3
    invoke-static {v11}, La3;->r(Ljava/io/File;)Ljava/io/File;

    .line 126
    .line 127
    .line 128
    move-result-object v16

    .line 129
    if-nez v16, :cond_7

    .line 130
    .line 131
    :cond_6
    :goto_4
    const/4 v14, 0x0

    .line 132
    goto/16 :goto_c

    .line 133
    .line 134
    :cond_7
    new-instance v6, Ljava/lang/StringBuilder;

    .line 135
    .line 136
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v11}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v7

    .line 146
    invoke-static {v7}, Lh3;->H(Ljava/lang/String;)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v7

    .line 150
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual/range {v16 .. v16}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v7

    .line 160
    invoke-static {v7}, Lh3;->H(Ljava/lang/String;)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v7

    .line 164
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v6

    .line 171
    invoke-static {v6}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    add-int/lit8 v0, v0, 0x1

    .line 175
    .line 176
    move/from16 v15, v20

    .line 177
    .line 178
    const/16 v11, 0x14

    .line 179
    .line 180
    goto/16 :goto_1

    .line 181
    .line 182
    :cond_8
    invoke-virtual {v1}, Ljava/io/File;->length()J

    .line 183
    .line 184
    .line 185
    move-result-wide v6

    .line 186
    invoke-virtual {v1, v11}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 187
    .line 188
    .line 189
    move-result v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 190
    if-nez v0, :cond_d

    .line 191
    .line 192
    :try_start_3
    new-instance v0, Ljava/io/FileInputStream;

    .line 193
    .line 194
    invoke-direct {v0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_5

    .line 195
    .line 196
    .line 197
    :try_start_4
    new-instance v12, Ljava/io/FileOutputStream;

    .line 198
    .line 199
    invoke-direct {v12, v11}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 200
    .line 201
    .line 202
    :try_start_5
    new-array v14, v8, [B

    .line 203
    .line 204
    const-wide/16 v21, 0x0

    .line 205
    .line 206
    :goto_5
    invoke-virtual {v0, v14}, Ljava/io/FileInputStream;->read([B)I

    .line 207
    .line 208
    .line 209
    move-result v8

    .line 210
    if-lez v8, :cond_9

    .line 211
    .line 212
    invoke-virtual {v12, v14, v13, v8}, Ljava/io/FileOutputStream;->write([BII)V

    .line 213
    .line 214
    .line 215
    move-object/from16 v25, v14

    .line 216
    .line 217
    int-to-long v13, v8

    .line 218
    add-long v21, v21, v13

    .line 219
    .line 220
    move-object/from16 v14, v25

    .line 221
    .line 222
    const/4 v13, 0x0

    .line 223
    goto :goto_5

    .line 224
    :cond_9
    invoke-virtual {v12}, Ljava/io/OutputStream;->flush()V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v1}, Ljava/io/File;->length()J

    .line 228
    .line 229
    .line 230
    move-result-wide v13
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_6

    .line 231
    cmp-long v8, v21, v13

    .line 232
    .line 233
    if-nez v8, :cond_a

    .line 234
    .line 235
    move/from16 v8, v20

    .line 236
    .line 237
    goto :goto_6

    .line 238
    :cond_a
    const/4 v8, 0x0

    .line 239
    :goto_6
    :try_start_6
    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 240
    .line 241
    .line 242
    :catchall_3
    :try_start_7
    invoke-virtual {v12}, Ljava/io/FileOutputStream;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_9

    .line 243
    .line 244
    .line 245
    goto :goto_9

    .line 246
    :catchall_4
    :goto_7
    const/4 v12, 0x0

    .line 247
    goto :goto_8

    .line 248
    :catchall_5
    const/4 v0, 0x0

    .line 249
    goto :goto_7

    .line 250
    :catchall_6
    :goto_8
    if-eqz v0, :cond_b

    .line 251
    .line 252
    :try_start_8
    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    .line 253
    .line 254
    .line 255
    :catchall_7
    :cond_b
    if-eqz v12, :cond_c

    .line 256
    .line 257
    :try_start_9
    invoke-virtual {v12}, Ljava/io/FileOutputStream;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_8

    .line 258
    .line 259
    .line 260
    :catchall_8
    :cond_c
    const/4 v8, 0x0

    .line 261
    :catchall_9
    :goto_9
    if-nez v8, :cond_d

    .line 262
    .line 263
    :try_start_a
    invoke-virtual {v11}, Ljava/io/File;->exists()Z

    .line 264
    .line 265
    .line 266
    move-result v0

    .line 267
    if-eqz v0, :cond_6

    .line 268
    .line 269
    invoke-virtual {v11}, Ljava/io/File;->length()J

    .line 270
    .line 271
    .line 272
    move-result-wide v12

    .line 273
    cmp-long v0, v12, v6

    .line 274
    .line 275
    if-eqz v0, :cond_6

    .line 276
    .line 277
    invoke-virtual {v11}, Ljava/io/File;->delete()Z

    .line 278
    .line 279
    .line 280
    goto/16 :goto_4

    .line 281
    .line 282
    :cond_d
    invoke-virtual {v11}, Ljava/io/File;->isFile()Z

    .line 283
    .line 284
    .line 285
    move-result v0

    .line 286
    if-eqz v0, :cond_11

    .line 287
    .line 288
    invoke-virtual {v11}, Ljava/io/File;->length()J

    .line 289
    .line 290
    .line 291
    move-result-wide v12

    .line 292
    cmp-long v0, v12, v6

    .line 293
    .line 294
    if-eqz v0, :cond_e

    .line 295
    .line 296
    goto :goto_a

    .line 297
    :cond_e
    invoke-static {v6, v7, v11}, Lh3;->e(JLjava/io/File;)V

    .line 298
    .line 299
    .line 300
    invoke-static {}, Lcom/mr/elaris/HookEntry;->hostContext()Landroid/content/Context;

    .line 301
    .line 302
    .line 303
    move-result-object v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 304
    if-eqz v0, :cond_f

    .line 305
    .line 306
    :try_start_b
    invoke-virtual {v11}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v6

    .line 310
    filled-new-array {v6}, [Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v6

    .line 314
    filled-new-array {v5}, [Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v7

    .line 318
    const/4 v8, 0x0

    .line 319
    invoke-static {v0, v6, v7, v8}, Landroid/media/MediaScannerConnection;->scanFile(Landroid/content/Context;[Ljava/lang/String;[Ljava/lang/String;Landroid/media/MediaScannerConnection$OnScanCompletedListener;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_a

    .line 320
    .line 321
    .line 322
    :catchall_a
    :cond_f
    if-eqz v15, :cond_10

    .line 323
    .line 324
    :try_start_c
    invoke-static {v11}, La3;->p(Ljava/io/File;)V

    .line 325
    .line 326
    .line 327
    :cond_10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 328
    .line 329
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 330
    .line 331
    .line 332
    const-string v6, "download redirect file published target="

    .line 333
    .line 334
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 335
    .line 336
    .line 337
    invoke-virtual {v11}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object v6

    .line 341
    invoke-static {v6}, Lh3;->H(Ljava/lang/String;)Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v6

    .line 345
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 346
    .line 347
    .line 348
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 349
    .line 350
    .line 351
    invoke-virtual {v11}, Ljava/io/File;->length()J

    .line 352
    .line 353
    .line 354
    move-result-wide v6

    .line 355
    invoke-virtual {v0, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 356
    .line 357
    .line 358
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V

    .line 363
    .line 364
    .line 365
    move-object v14, v11

    .line 366
    goto :goto_c

    .line 367
    :cond_11
    :goto_a
    invoke-virtual {v11}, Ljava/io/File;->exists()Z

    .line 368
    .line 369
    .line 370
    move-result v0

    .line 371
    if-eqz v0, :cond_6

    .line 372
    .line 373
    invoke-virtual {v11}, Ljava/io/File;->delete()Z
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    .line 374
    .line 375
    .line 376
    goto/16 :goto_4

    .line 377
    .line 378
    :goto_b
    if-eqz v15, :cond_12

    .line 379
    .line 380
    invoke-static {v11}, La3;->p(Ljava/io/File;)V

    .line 381
    .line 382
    .line 383
    :cond_12
    new-instance v6, Ljava/lang/StringBuilder;

    .line 384
    .line 385
    const-string v7, "download redirect file publish failed target="

    .line 386
    .line 387
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 388
    .line 389
    .line 390
    invoke-virtual {v11}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object v7

    .line 394
    invoke-static {v7}, Lh3;->H(Ljava/lang/String;)Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object v7

    .line 398
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 399
    .line 400
    .line 401
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 402
    .line 403
    .line 404
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 405
    .line 406
    .line 407
    move-result-object v7

    .line 408
    invoke-virtual {v7}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 409
    .line 410
    .line 411
    move-result-object v7

    .line 412
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 413
    .line 414
    .line 415
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 416
    .line 417
    .line 418
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 419
    .line 420
    .line 421
    move-result-object v0

    .line 422
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 423
    .line 424
    .line 425
    move-result-object v0

    .line 426
    invoke-static {v0}, Lh3;->H(Ljava/lang/String;)Ljava/lang/String;

    .line 427
    .line 428
    .line 429
    move-result-object v0

    .line 430
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 431
    .line 432
    .line 433
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 434
    .line 435
    .line 436
    move-result-object v0

    .line 437
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V

    .line 438
    .line 439
    .line 440
    goto/16 :goto_4

    .line 441
    .line 442
    :cond_13
    move-object/from16 v11, v16

    .line 443
    .line 444
    const/16 v20, 0x1

    .line 445
    .line 446
    if-eqz v15, :cond_6

    .line 447
    .line 448
    invoke-static {v11}, La3;->p(Ljava/io/File;)V

    .line 449
    .line 450
    .line 451
    goto/16 :goto_4

    .line 452
    .line 453
    :goto_c
    if-eqz v14, :cond_14

    .line 454
    .line 455
    return-object v14

    .line 456
    :cond_14
    const-string v6, "is_pending"

    .line 457
    .line 458
    invoke-static {}, Lcom/mr/elaris/HookEntry;->hostContext()Landroid/content/Context;

    .line 459
    .line 460
    .line 461
    move-result-object v0

    .line 462
    if-eqz v0, :cond_29

    .line 463
    .line 464
    invoke-virtual/range {p1 .. p1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 465
    .line 466
    .line 467
    move-result-object v7

    .line 468
    invoke-static {v7}, Lh3;->y(Ljava/io/File;)Ljava/lang/String;

    .line 469
    .line 470
    .line 471
    move-result-object v7

    .line 472
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 473
    .line 474
    .line 475
    move-result v8

    .line 476
    if-nez v8, :cond_15

    .line 477
    .line 478
    const/4 v14, 0x0

    .line 479
    goto/16 :goto_1f

    .line 480
    .line 481
    :cond_15
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 482
    .line 483
    .line 484
    move-result-object v8

    .line 485
    move-object/from16 v11, p1

    .line 486
    .line 487
    const/4 v12, 0x0

    .line 488
    const/4 v13, 0x0

    .line 489
    :goto_d
    const/16 v14, 0x14

    .line 490
    .line 491
    if-ge v12, v14, :cond_28

    .line 492
    .line 493
    :try_start_d
    const-string v0, "pre-insert"

    .line 494
    .line 495
    invoke-static {v8, v7, v11, v0}, Lh3;->f(Landroid/content/ContentResolver;Ljava/lang/String;Ljava/io/File;Ljava/lang/String;)I

    .line 496
    .line 497
    .line 498
    new-instance v0, Landroid/content/ContentValues;

    .line 499
    .line 500
    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 501
    .line 502
    .line 503
    const-string v15, "_display_name"

    .line 504
    .line 505
    invoke-virtual {v11}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 506
    .line 507
    .line 508
    move-result-object v14

    .line 509
    invoke-virtual {v0, v15, v14}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 510
    .line 511
    .line 512
    const-string v14, "mime_type"

    .line 513
    .line 514
    invoke-virtual {v0, v14, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 515
    .line 516
    .line 517
    const-string v14, "relative_path"

    .line 518
    .line 519
    invoke-virtual {v0, v14, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 520
    .line 521
    .line 522
    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 523
    .line 524
    .line 525
    move-result-object v14

    .line 526
    invoke-virtual {v0, v6, v14}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 527
    .line 528
    .line 529
    sget-object v14, Landroid/provider/MediaStore$Downloads;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    .line 530
    .line 531
    invoke-virtual {v8, v14, v0}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;

    .line 532
    .line 533
    .line 534
    move-result-object v14
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_1d

    .line 535
    if-eqz v14, :cond_20

    .line 536
    .line 537
    :try_start_e
    const-string v0, "w"

    .line 538
    .line 539
    invoke-virtual {v8, v14, v0}, Landroid/content/ContentResolver;->openOutputStream(Landroid/net/Uri;Ljava/lang/String;)Ljava/io/OutputStream;

    .line 540
    .line 541
    .line 542
    move-result-object v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_1c

    .line 543
    if-eqz v0, :cond_1f

    .line 544
    .line 545
    :try_start_f
    new-instance v15, Ljava/io/FileInputStream;

    .line 546
    .line 547
    invoke-direct {v15, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_f

    .line 548
    .line 549
    .line 550
    move-object/from16 v21, v5

    .line 551
    .line 552
    const/high16 v1, 0x20000

    .line 553
    .line 554
    :try_start_10
    new-array v5, v1, [B

    .line 555
    .line 556
    const-wide/16 v22, 0x0

    .line 557
    .line 558
    :goto_e
    invoke-virtual {v15, v5}, Ljava/io/FileInputStream;->read([B)I

    .line 559
    .line 560
    .line 561
    move-result v1
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_e

    .line 562
    if-lez v1, :cond_16

    .line 563
    .line 564
    move/from16 v31, v12

    .line 565
    .line 566
    const/4 v12, 0x0

    .line 567
    :try_start_11
    invoke-virtual {v0, v5, v12, v1}, Ljava/io/OutputStream;->write([BII)V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_b

    .line 568
    .line 569
    .line 570
    move-object v12, v0

    .line 571
    int-to-long v0, v1

    .line 572
    add-long v22, v22, v0

    .line 573
    .line 574
    move-object v0, v12

    .line 575
    move/from16 v12, v31

    .line 576
    .line 577
    goto :goto_e

    .line 578
    :catchall_b
    :goto_f
    move-object v12, v0

    .line 579
    goto :goto_11

    .line 580
    :cond_16
    move/from16 v31, v12

    .line 581
    .line 582
    move-object v12, v0

    .line 583
    :try_start_12
    invoke-virtual {v12}, Ljava/io/OutputStream;->flush()V

    .line 584
    .line 585
    .line 586
    invoke-virtual/range {p0 .. p0}, Ljava/io/File;->length()J

    .line 587
    .line 588
    .line 589
    move-result-wide v0
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_10

    .line 590
    cmp-long v0, v22, v0

    .line 591
    .line 592
    if-nez v0, :cond_17

    .line 593
    .line 594
    move/from16 v0, v20

    .line 595
    .line 596
    goto :goto_10

    .line 597
    :cond_17
    const/4 v0, 0x0

    .line 598
    :goto_10
    :try_start_13
    invoke-virtual {v15}, Ljava/io/FileInputStream;->close()V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_c

    .line 599
    .line 600
    .line 601
    :catchall_c
    :try_start_14
    invoke-virtual {v12}, Ljava/io/OutputStream;->close()V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_d

    .line 602
    .line 603
    .line 604
    :catchall_d
    move v12, v0

    .line 605
    goto :goto_12

    .line 606
    :catchall_e
    move/from16 v31, v12

    .line 607
    .line 608
    goto :goto_f

    .line 609
    :catchall_f
    move-object/from16 v21, v5

    .line 610
    .line 611
    move/from16 v31, v12

    .line 612
    .line 613
    move-object v12, v0

    .line 614
    const/4 v15, 0x0

    .line 615
    :catchall_10
    :goto_11
    if-eqz v15, :cond_18

    .line 616
    .line 617
    :try_start_15
    invoke-virtual {v15}, Ljava/io/FileInputStream;->close()V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_11

    .line 618
    .line 619
    .line 620
    :catchall_11
    :cond_18
    :try_start_16
    invoke-virtual {v12}, Ljava/io/OutputStream;->close()V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_12

    .line 621
    .line 622
    .line 623
    :catchall_12
    const/4 v12, 0x0

    .line 624
    :goto_12
    if-eqz v12, :cond_1e

    .line 625
    .line 626
    :try_start_17
    new-instance v0, Landroid/content/ContentValues;

    .line 627
    .line 628
    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_1b

    .line 629
    .line 630
    .line 631
    const/16 v24, 0x0

    .line 632
    .line 633
    :try_start_18
    invoke-static/range {v24 .. v24}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 634
    .line 635
    .line 636
    move-result-object v1

    .line 637
    invoke-virtual {v0, v6, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 638
    .line 639
    .line 640
    const/4 v1, 0x0

    .line 641
    invoke-virtual {v8, v14, v0, v1, v1}, Landroid/content/ContentResolver;->update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    .line 642
    .line 643
    .line 644
    move-result v0

    .line 645
    if-lez v0, :cond_1d

    .line 646
    .line 647
    const-string v0, "_size"
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_1a

    .line 648
    .line 649
    :try_start_19
    filled-new-array {v0}, [Ljava/lang/String;

    .line 650
    .line 651
    .line 652
    move-result-object v27
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_14

    .line 653
    const/16 v29, 0x0

    .line 654
    .line 655
    const/16 v30, 0x0

    .line 656
    .line 657
    const/16 v28, 0x0

    .line 658
    .line 659
    move-object/from16 v25, v8

    .line 660
    .line 661
    move-object/from16 v26, v14

    .line 662
    .line 663
    :try_start_1a
    invoke-virtual/range {v25 .. v30}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 664
    .line 665
    .line 666
    move-result-object v8
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_13

    .line 667
    move-object/from16 v1, v25

    .line 668
    .line 669
    if-eqz v8, :cond_19

    .line 670
    .line 671
    :try_start_1b
    invoke-interface {v8}, Landroid/database/Cursor;->moveToFirst()Z

    .line 672
    .line 673
    .line 674
    move-result v5

    .line 675
    if-eqz v5, :cond_19

    .line 676
    .line 677
    invoke-interface {v8, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 678
    .line 679
    .line 680
    move-result v0

    .line 681
    if-ltz v0, :cond_19

    .line 682
    .line 683
    invoke-interface {v8, v0}, Landroid/database/Cursor;->isNull(I)Z

    .line 684
    .line 685
    .line 686
    move-result v5

    .line 687
    if-nez v5, :cond_19

    .line 688
    .line 689
    invoke-interface {v8, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 690
    .line 691
    .line 692
    move-result-wide v14
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_15

    .line 693
    :try_start_1c
    invoke-interface {v8}, Landroid/database/Cursor;->close()V
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_17

    .line 694
    .line 695
    .line 696
    goto :goto_17

    .line 697
    :cond_19
    if-eqz v8, :cond_1a

    .line 698
    .line 699
    :goto_13
    :try_start_1d
    invoke-interface {v8}, Landroid/database/Cursor;->close()V
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_16

    .line 700
    .line 701
    .line 702
    goto :goto_16

    .line 703
    :catchall_13
    move-object/from16 v1, v25

    .line 704
    .line 705
    :goto_14
    const/4 v8, 0x0

    .line 706
    goto :goto_15

    .line 707
    :catchall_14
    move-object v1, v8

    .line 708
    move-object/from16 v26, v14

    .line 709
    .line 710
    goto :goto_14

    .line 711
    :catchall_15
    :goto_15
    if-eqz v8, :cond_1a

    .line 712
    .line 713
    goto :goto_13

    .line 714
    :catchall_16
    :cond_1a
    :goto_16
    const-wide/16 v14, -0x1

    .line 715
    .line 716
    :catchall_17
    :goto_17
    :try_start_1e
    invoke-virtual/range {p0 .. p0}, Ljava/io/File;->length()J

    .line 717
    .line 718
    .line 719
    move-result-wide v22

    .line 720
    cmp-long v0, v14, v22

    .line 721
    .line 722
    if-nez v0, :cond_1c

    .line 723
    .line 724
    invoke-static {v14, v15, v11}, Lh3;->e(JLjava/io/File;)V

    .line 725
    .line 726
    .line 727
    new-instance v0, Ljava/lang/StringBuilder;

    .line 728
    .line 729
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 730
    .line 731
    .line 732
    const-string v5, "download redirect MediaStore published uri="

    .line 733
    .line 734
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 735
    .line 736
    .line 737
    invoke-virtual/range {v26 .. v26}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 738
    .line 739
    .line 740
    move-result-object v5

    .line 741
    invoke-static {v5}, Lh3;->H(Ljava/lang/String;)Ljava/lang/String;

    .line 742
    .line 743
    .line 744
    move-result-object v5

    .line 745
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 746
    .line 747
    .line 748
    const-string v5, " target="

    .line 749
    .line 750
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 751
    .line 752
    .line 753
    invoke-virtual {v11}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 754
    .line 755
    .line 756
    move-result-object v5

    .line 757
    invoke-static {v5}, Lh3;->H(Ljava/lang/String;)Ljava/lang/String;

    .line 758
    .line 759
    .line 760
    move-result-object v5

    .line 761
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 762
    .line 763
    .line 764
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 765
    .line 766
    .line 767
    invoke-virtual {v0, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 768
    .line 769
    .line 770
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 771
    .line 772
    .line 773
    move-result-object v0

    .line 774
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V

    .line 775
    .line 776
    .line 777
    if-eqz v13, :cond_1b

    .line 778
    .line 779
    invoke-static {v11}, La3;->p(Ljava/io/File;)V

    .line 780
    .line 781
    .line 782
    goto :goto_19

    .line 783
    :catchall_18
    move-exception v0

    .line 784
    move v8, v13

    .line 785
    :goto_18
    move-object/from16 v5, v26

    .line 786
    .line 787
    goto/16 :goto_1b

    .line 788
    .line 789
    :cond_1b
    :goto_19
    move-object v14, v11

    .line 790
    goto/16 :goto_1f

    .line 791
    .line 792
    :cond_1c
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 793
    .line 794
    new-instance v5, Ljava/lang/StringBuilder;

    .line 795
    .line 796
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 797
    .line 798
    .line 799
    const-string v8, "stored size mismatch expected="

    .line 800
    .line 801
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_18

    .line 802
    .line 803
    .line 804
    move v8, v13

    .line 805
    :try_start_1f
    invoke-virtual/range {p0 .. p0}, Ljava/io/File;->length()J

    .line 806
    .line 807
    .line 808
    move-result-wide v12

    .line 809
    invoke-virtual {v5, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 810
    .line 811
    .line 812
    const-string v12, " actual="

    .line 813
    .line 814
    invoke-virtual {v5, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 815
    .line 816
    .line 817
    invoke-virtual {v5, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 818
    .line 819
    .line 820
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 821
    .line 822
    .line 823
    move-result-object v5

    .line 824
    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 825
    .line 826
    .line 827
    throw v0

    .line 828
    :catchall_19
    move-exception v0

    .line 829
    goto :goto_18

    .line 830
    :catchall_1a
    move-exception v0

    .line 831
    move-object v1, v8

    .line 832
    move v8, v13

    .line 833
    move-object/from16 v26, v14

    .line 834
    .line 835
    goto :goto_18

    .line 836
    :cond_1d
    move-object v1, v8

    .line 837
    move v8, v13

    .line 838
    move-object/from16 v26, v14

    .line 839
    .line 840
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 841
    .line 842
    const-string v5, "publish update failed"

    .line 843
    .line 844
    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 845
    .line 846
    .line 847
    throw v0

    .line 848
    :catchall_1b
    move-exception v0

    .line 849
    move-object v1, v8

    .line 850
    :goto_1a
    move v8, v13

    .line 851
    move-object/from16 v26, v14

    .line 852
    .line 853
    const/16 v24, 0x0

    .line 854
    .line 855
    goto :goto_18

    .line 856
    :cond_1e
    move-object v1, v8

    .line 857
    move v8, v13

    .line 858
    move-object/from16 v26, v14

    .line 859
    .line 860
    const/16 v24, 0x0

    .line 861
    .line 862
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 863
    .line 864
    const-string v5, "stream copy incomplete"

    .line 865
    .line 866
    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 867
    .line 868
    .line 869
    throw v0

    .line 870
    :cond_1f
    move-object/from16 v21, v5

    .line 871
    .line 872
    move-object v1, v8

    .line 873
    move/from16 v31, v12

    .line 874
    .line 875
    move v8, v13

    .line 876
    move-object/from16 v26, v14

    .line 877
    .line 878
    const/16 v24, 0x0

    .line 879
    .line 880
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 881
    .line 882
    const-string v5, "openOutputStream returned null"

    .line 883
    .line 884
    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 885
    .line 886
    .line 887
    throw v0

    .line 888
    :catchall_1c
    move-exception v0

    .line 889
    move-object/from16 v21, v5

    .line 890
    .line 891
    move-object v1, v8

    .line 892
    move/from16 v31, v12

    .line 893
    .line 894
    goto :goto_1a

    .line 895
    :cond_20
    move-object/from16 v21, v5

    .line 896
    .line 897
    move-object v1, v8

    .line 898
    move/from16 v31, v12

    .line 899
    .line 900
    move v8, v13

    .line 901
    move-object/from16 v26, v14

    .line 902
    .line 903
    const/16 v24, 0x0

    .line 904
    .line 905
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 906
    .line 907
    const-string v5, "insert returned null"

    .line 908
    .line 909
    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 910
    .line 911
    .line 912
    throw v0
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_19

    .line 913
    :catchall_1d
    move-exception v0

    .line 914
    move-object/from16 v21, v5

    .line 915
    .line 916
    move-object v1, v8

    .line 917
    move/from16 v31, v12

    .line 918
    .line 919
    move v8, v13

    .line 920
    const/16 v24, 0x0

    .line 921
    .line 922
    const/4 v5, 0x0

    .line 923
    :goto_1b
    if-eqz v5, :cond_21

    .line 924
    .line 925
    const/4 v12, 0x0

    .line 926
    :try_start_20
    invoke-virtual {v1, v5, v12, v12}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_20
    .catchall {:try_start_20 .. :try_end_20} :catchall_1e

    .line 927
    .line 928
    .line 929
    goto :goto_1c

    .line 930
    :cond_21
    const/4 v12, 0x0

    .line 931
    :catchall_1e
    :goto_1c
    new-instance v5, Ljava/lang/StringBuilder;

    .line 932
    .line 933
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 934
    .line 935
    .line 936
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 937
    .line 938
    .line 939
    move-result-object v13

    .line 940
    invoke-virtual {v13}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 941
    .line 942
    .line 943
    move-result-object v13

    .line 944
    invoke-virtual {v5, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 945
    .line 946
    .line 947
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 948
    .line 949
    .line 950
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 951
    .line 952
    .line 953
    move-result-object v0

    .line 954
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 955
    .line 956
    .line 957
    move-result-object v0

    .line 958
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 959
    .line 960
    .line 961
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 962
    .line 963
    .line 964
    move-result-object v0

    .line 965
    const-string v5, "SQLiteConstraint"

    .line 966
    .line 967
    invoke-virtual {v0, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 968
    .line 969
    .line 970
    move-result v5

    .line 971
    if-nez v5, :cond_24

    .line 972
    .line 973
    const-string v5, "UNIQUE constraint"

    .line 974
    .line 975
    invoke-virtual {v0, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 976
    .line 977
    .line 978
    move-result v5

    .line 979
    if-nez v5, :cond_24

    .line 980
    .line 981
    if-eqz v8, :cond_22

    .line 982
    .line 983
    invoke-static {v11}, La3;->p(Ljava/io/File;)V

    .line 984
    .line 985
    .line 986
    :cond_22
    new-instance v1, Ljava/lang/StringBuilder;

    .line 987
    .line 988
    const-string v2, "download redirect MediaStore failed target="

    .line 989
    .line 990
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 991
    .line 992
    .line 993
    invoke-virtual {v11}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 994
    .line 995
    .line 996
    move-result-object v2

    .line 997
    invoke-static {v2}, Lh3;->H(Ljava/lang/String;)Ljava/lang/String;

    .line 998
    .line 999
    .line 1000
    move-result-object v2

    .line 1001
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1002
    .line 1003
    .line 1004
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1005
    .line 1006
    .line 1007
    invoke-static {v0}, Lh3;->H(Ljava/lang/String;)Ljava/lang/String;

    .line 1008
    .line 1009
    .line 1010
    move-result-object v0

    .line 1011
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1012
    .line 1013
    .line 1014
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1015
    .line 1016
    .line 1017
    move-result-object v0

    .line 1018
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V

    .line 1019
    .line 1020
    .line 1021
    :cond_23
    :goto_1d
    move-object v14, v12

    .line 1022
    goto :goto_1f

    .line 1023
    :cond_24
    if-eqz v8, :cond_25

    .line 1024
    .line 1025
    invoke-static {v11}, La3;->p(Ljava/io/File;)V

    .line 1026
    .line 1027
    .line 1028
    :cond_25
    const-string v0, "constraint"

    .line 1029
    .line 1030
    invoke-static {v1, v7, v11, v0}, Lh3;->f(Landroid/content/ContentResolver;Ljava/lang/String;Ljava/io/File;Ljava/lang/String;)I

    .line 1031
    .line 1032
    .line 1033
    move-result v0

    .line 1034
    if-lez v0, :cond_26

    .line 1035
    .line 1036
    move v13, v8

    .line 1037
    goto :goto_1e

    .line 1038
    :cond_26
    invoke-static {v11}, La3;->r(Ljava/io/File;)Ljava/io/File;

    .line 1039
    .line 1040
    .line 1041
    move-result-object v0

    .line 1042
    if-nez v0, :cond_27

    .line 1043
    .line 1044
    goto :goto_1d

    .line 1045
    :cond_27
    new-instance v5, Ljava/lang/StringBuilder;

    .line 1046
    .line 1047
    invoke-direct {v5, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1048
    .line 1049
    .line 1050
    invoke-virtual {v11}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v8

    .line 1054
    invoke-static {v8}, Lh3;->H(Ljava/lang/String;)Ljava/lang/String;

    .line 1055
    .line 1056
    .line 1057
    move-result-object v8

    .line 1058
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1059
    .line 1060
    .line 1061
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1062
    .line 1063
    .line 1064
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 1065
    .line 1066
    .line 1067
    move-result-object v8

    .line 1068
    invoke-static {v8}, Lh3;->H(Ljava/lang/String;)Ljava/lang/String;

    .line 1069
    .line 1070
    .line 1071
    move-result-object v8

    .line 1072
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1073
    .line 1074
    .line 1075
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1076
    .line 1077
    .line 1078
    move-result-object v5

    .line 1079
    invoke-static {v5}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V

    .line 1080
    .line 1081
    .line 1082
    move-object v11, v0

    .line 1083
    move/from16 v13, v20

    .line 1084
    .line 1085
    :goto_1e
    add-int/lit8 v0, v31, 0x1

    .line 1086
    .line 1087
    move v12, v0

    .line 1088
    move-object v8, v1

    .line 1089
    move-object/from16 v5, v21

    .line 1090
    .line 1091
    move-object/from16 v1, p0

    .line 1092
    .line 1093
    goto/16 :goto_d

    .line 1094
    .line 1095
    :cond_28
    move v8, v13

    .line 1096
    const/4 v12, 0x0

    .line 1097
    if-eqz v8, :cond_23

    .line 1098
    .line 1099
    invoke-static {v11}, La3;->p(Ljava/io/File;)V

    .line 1100
    .line 1101
    .line 1102
    goto :goto_1d

    .line 1103
    :cond_29
    const/4 v12, 0x0

    .line 1104
    goto :goto_1d

    .line 1105
    :goto_1f
    return-object v14
.end method

.method public static F(Ljava/lang/String;Lf3;)V
    .locals 1

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lh3;->e:Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-static {p0}, Lh3;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {v0, p0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public static G(Ljava/io/File;JLjava/io/File;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lh3;->u(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const-wide/16 v0, 0x0

    .line 13
    .line 14
    cmp-long v0, p1, v0

    .line 15
    .line 16
    if-lez v0, :cond_1

    .line 17
    .line 18
    :goto_0
    move-wide v2, p1

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    invoke-virtual {p0}, Ljava/io/File;->length()J

    .line 21
    .line 22
    .line 23
    move-result-wide p1

    .line 24
    goto :goto_0

    .line 25
    :goto_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 26
    .line 27
    .line 28
    move-result-wide v4

    .line 29
    sget-object p1, Lh3;->d:Ljava/lang/Object;

    .line 30
    .line 31
    monitor-enter p1

    .line 32
    :try_start_0
    invoke-static {v4, v5}, Lh3;->D(J)V

    .line 33
    .line 34
    .line 35
    new-instance v0, Lf3;

    .line 36
    .line 37
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    invoke-static {p3}, Lh3;->d(Ljava/io/File;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    invoke-direct/range {v0 .. v6}, Lf3;-><init>(Ljava/lang/String;JJLjava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    invoke-static {p2, v0}, Lh3;->F(Ljava/lang/String;Lf3;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    invoke-static {p2}, Lh3;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p3

    .line 70
    invoke-virtual {p2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result p3

    .line 74
    if-nez p3, :cond_2

    .line 75
    .line 76
    invoke-static {p2, v0}, Lh3;->F(Ljava/lang/String;Lf3;)V

    .line 77
    .line 78
    .line 79
    goto :goto_2

    .line 80
    :catchall_0
    move-exception v0

    .line 81
    move-object p0, v0

    .line 82
    goto :goto_3

    .line 83
    :cond_2
    :goto_2
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p3

    .line 87
    invoke-static {p3}, Lh3;->L(Ljava/lang/String;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p3

    .line 91
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-virtual {p3, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result p0

    .line 99
    if-nez p0, :cond_3

    .line 100
    .line 101
    invoke-static {p3, v0}, Lh3;->F(Ljava/lang/String;Lf3;)V

    .line 102
    .line 103
    .line 104
    :cond_3
    invoke-static {p2}, Lh3;->L(Ljava/lang/String;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    invoke-virtual {p0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result p2

    .line 112
    if-nez p2, :cond_4

    .line 113
    .line 114
    invoke-static {p0, v0}, Lh3;->F(Ljava/lang/String;Lf3;)V

    .line 115
    .line 116
    .line 117
    :cond_4
    monitor-exit p1

    .line 118
    return-void

    .line 119
    :goto_3
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 120
    throw p0
.end method

.method public static H(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

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
    const/16 v0, 0xd

    .line 7
    .line 8
    const/16 v1, 0x20

    .line 9
    .line 10
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    const/16 v0, 0xa

    .line 15
    .line 16
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    const/16 v0, 0x9

    .line 21
    .line 22
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    const/16 v1, 0xdc

    .line 31
    .line 32
    if-le v0, v1, :cond_1

    .line 33
    .line 34
    const/4 v0, 0x0

    .line 35
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    const-string v0, "..."

    .line 40
    .line 41
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    :cond_1
    return-object p0
.end method

.method public static I(Ljava/lang/Object;Ljava/lang/String;I)Z
    .locals 9

    .line 1
    const-class v0, Ljava/lang/Integer;

    .line 2
    .line 3
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    goto/16 :goto_a

    .line 9
    .line 10
    :cond_0
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    const/4 v4, 0x1

    .line 15
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    invoke-virtual {v5, p1}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object v6

    .line 27
    if-eq v6, v1, :cond_2

    .line 28
    .line 29
    if-ne v6, v0, :cond_1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    move v6, v2

    .line 33
    goto :goto_1

    .line 34
    :cond_2
    :goto_0
    move v6, v4

    .line 35
    :goto_1
    if-nez v6, :cond_3

    .line 36
    .line 37
    goto/16 :goto_a

    .line 38
    .line 39
    :cond_3
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    if-ne v6, v1, :cond_4

    .line 44
    .line 45
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    goto :goto_2

    .line 50
    :cond_4
    move-object v6, v3

    .line 51
    :goto_2
    invoke-virtual {v5, p0, v6}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    .line 54
    return v4

    .line 55
    :catchall_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    :goto_3
    const-class v6, Ljava/lang/Object;

    .line 60
    .line 61
    if-eqz v5, :cond_9

    .line 62
    .line 63
    if-eq v5, v6, :cond_9

    .line 64
    .line 65
    :try_start_1
    invoke-virtual {v5, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    move-result-object v7

    .line 73
    if-eq v7, v1, :cond_6

    .line 74
    .line 75
    if-ne v7, v0, :cond_5

    .line 76
    .line 77
    goto :goto_4

    .line 78
    :cond_5
    move v7, v2

    .line 79
    goto :goto_5

    .line 80
    :cond_6
    :goto_4
    move v7, v4

    .line 81
    :goto_5
    if-nez v7, :cond_7

    .line 82
    .line 83
    goto :goto_7

    .line 84
    :cond_7
    invoke-virtual {v6, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    move-result-object v7

    .line 91
    if-ne v7, v1, :cond_8

    .line 92
    .line 93
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 94
    .line 95
    .line 96
    move-result-object v7

    .line 97
    goto :goto_6

    .line 98
    :cond_8
    move-object v7, v3

    .line 99
    :goto_6
    invoke-virtual {v6, p0, v7}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 100
    .line 101
    .line 102
    goto :goto_9

    .line 103
    :catchall_1
    :goto_7
    invoke-virtual {v5}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    goto :goto_3

    .line 108
    :cond_9
    new-instance v5, Ljava/lang/StringBuilder;

    .line 109
    .line 110
    const-string v7, "set"

    .line 111
    .line 112
    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    .line 116
    .line 117
    .line 118
    move-result v7

    .line 119
    invoke-static {v7}, Ljava/lang/Character;->toUpperCase(C)C

    .line 120
    .line 121
    .line 122
    move-result v7

    .line 123
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {p1, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    move-result-object v5

    .line 141
    :goto_8
    if-eqz v5, :cond_a

    .line 142
    .line 143
    if-eq v5, v6, :cond_a

    .line 144
    .line 145
    :try_start_2
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    move-result-object v7

    .line 149
    invoke-virtual {v5, p1, v7}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 150
    .line 151
    .line 152
    move-result-object v7

    .line 153
    invoke-virtual {v7, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 154
    .line 155
    .line 156
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 157
    .line 158
    .line 159
    move-result-object v8

    .line 160
    filled-new-array {v8}, [Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v8

    .line 164
    invoke-virtual {v7, p0, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 165
    .line 166
    .line 167
    goto :goto_9

    .line 168
    :catchall_2
    :try_start_3
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    move-result-object v7

    .line 172
    invoke-virtual {v5, p1, v7}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 173
    .line 174
    .line 175
    move-result-object v7

    .line 176
    invoke-virtual {v7, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 177
    .line 178
    .line 179
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v8

    .line 183
    invoke-virtual {v7, p0, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 184
    .line 185
    .line 186
    :goto_9
    return v4

    .line 187
    :catchall_3
    invoke-virtual {v5}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    move-result-object v5

    .line 191
    goto :goto_8

    .line 192
    :cond_a
    :goto_a
    return v2
.end method

.method public static J(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 7

    .line 1
    const-class v0, Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz p0, :cond_4

    .line 5
    .line 6
    if-nez p2, :cond_0

    .line 7
    .line 8
    goto/16 :goto_4

    .line 9
    .line 10
    :cond_0
    const/4 v2, 0x1

    .line 11
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    invoke-virtual {v3, p1}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    if-eq v4, v0, :cond_1

    .line 24
    .line 25
    goto :goto_4

    .line 26
    :cond_1
    invoke-virtual {v3, p0, p2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    .line 29
    return v2

    .line 30
    :catchall_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    :goto_0
    const-class v4, Ljava/lang/Object;

    .line 35
    .line 36
    if-eqz v3, :cond_3

    .line 37
    .line 38
    if-eq v3, v4, :cond_3

    .line 39
    .line 40
    :try_start_1
    invoke-virtual {v3, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    if-eq v5, v0, :cond_2

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    invoke-virtual {v4, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v4, p0, p2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 55
    .line 56
    .line 57
    goto :goto_3

    .line 58
    :catchall_1
    :goto_1
    invoke-virtual {v3}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    goto :goto_0

    .line 63
    :cond_3
    new-instance v3, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    const-string v5, "set"

    .line 66
    .line 67
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    invoke-static {v5}, Ljava/lang/Character;->toUpperCase(C)C

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    :goto_2
    if-eqz v3, :cond_4

    .line 97
    .line 98
    if-eq v3, v4, :cond_4

    .line 99
    .line 100
    :try_start_2
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    invoke-virtual {v3, p1, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 105
    .line 106
    .line 107
    move-result-object v5

    .line 108
    invoke-virtual {v5, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 109
    .line 110
    .line 111
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v6

    .line 115
    invoke-virtual {v5, p0, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 116
    .line 117
    .line 118
    :goto_3
    return v2

    .line 119
    :catchall_2
    invoke-virtual {v3}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    goto :goto_2

    .line 124
    :cond_4
    :goto_4
    return v1
.end method

.method public static K(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lh3;->A(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    instance-of p1, p0, Ljava/lang/String;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    check-cast p0, Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    const-string p0, ""

    .line 17
    .line 18
    return-object p0
.end method

.method public static L(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {p0}, Lh3;->u(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    const-string p0, ""

    .line 10
    .line 11
    :cond_0
    return-object p0

    .line 12
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    add-int/lit8 v0, v0, -0x2

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method

.method public static M(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, "com.tencent.mobileqq.filemanager.data.FileManagerEntity"

    .line 14
    .line 15
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    :goto_0
    if-eqz v1, :cond_5

    .line 27
    .line 28
    const-class v3, Ljava/lang/Object;

    .line 29
    .line 30
    if-eq v1, v3, :cond_5

    .line 31
    .line 32
    :try_start_0
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    array-length v4, v3

    .line 37
    const/4 v5, 0x0

    .line 38
    :goto_1
    if-ge v5, v4, :cond_4

    .line 39
    .line 40
    aget-object v6, v3, v5

    .line 41
    .line 42
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object v7

    .line 46
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v7

    .line 50
    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v7

    .line 54
    if-nez v7, :cond_2

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_2
    const/4 v7, 0x1

    .line 58
    invoke-virtual {v6, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v6, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    if-eqz v6, :cond_3

    .line 66
    .line 67
    return-object v6

    .line 68
    :cond_3
    :goto_2
    add-int/lit8 v5, v5, 0x1

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :catchall_0
    :cond_4
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    goto :goto_0

    .line 76
    :cond_5
    return-object v0
.end method

.method public static a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v0, :cond_a

    .line 7
    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    goto/16 :goto_7

    .line 11
    .line 12
    :cond_0
    const-string v3, "getFileModelId"

    .line 13
    .line 14
    const-string v4, "fileModelId"

    .line 15
    .line 16
    invoke-static {v1, v3, v4}, Lh3;->w(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)J

    .line 17
    .line 18
    .line 19
    move-result-wide v3

    .line 20
    const-string v5, "getMsgElementId"

    .line 21
    .line 22
    const-string v6, "msgElementId"

    .line 23
    .line 24
    invoke-static {v1, v5, v6}, Lh3;->w(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)J

    .line 25
    .line 26
    .line 27
    move-result-wide v5

    .line 28
    const-string v7, "getChatType"

    .line 29
    .line 30
    const-string v8, "chatType"

    .line 31
    .line 32
    invoke-static {v1, v7, v8}, Lh3;->t(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)I

    .line 33
    .line 34
    .line 35
    move-result v7

    .line 36
    const/16 v8, 0x8

    .line 37
    .line 38
    if-ne v7, v8, :cond_1

    .line 39
    .line 40
    move-wide v7, v5

    .line 41
    goto :goto_0

    .line 42
    :cond_1
    move-wide v7, v3

    .line 43
    :goto_0
    const/4 v9, 0x3

    .line 44
    new-array v10, v9, [J

    .line 45
    .line 46
    const/4 v11, 0x0

    .line 47
    aput-wide v7, v10, v11

    .line 48
    .line 49
    const/4 v7, 0x1

    .line 50
    aput-wide v3, v10, v7

    .line 51
    .line 52
    const/4 v3, 0x2

    .line 53
    aput-wide v5, v10, v3

    .line 54
    .line 55
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-virtual {v3}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    array-length v4, v3

    .line 64
    move v5, v11

    .line 65
    :goto_1
    if-ge v5, v4, :cond_a

    .line 66
    .line 67
    aget-object v6, v3, v5

    .line 68
    .line 69
    const-class v8, Ljava/util/Map;

    .line 70
    .line 71
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    move-result-object v12

    .line 75
    invoke-virtual {v8, v12}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 76
    .line 77
    .line 78
    move-result v8

    .line 79
    if-nez v8, :cond_2

    .line 80
    .line 81
    goto :goto_5

    .line 82
    :cond_2
    invoke-virtual {v6, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v6, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    instance-of v8, v6, Ljava/util/Map;

    .line 90
    .line 91
    if-nez v8, :cond_3

    .line 92
    .line 93
    goto :goto_5

    .line 94
    :cond_3
    check-cast v6, Ljava/util/Map;

    .line 95
    .line 96
    move v8, v11

    .line 97
    :goto_2
    if-ge v8, v9, :cond_8

    .line 98
    .line 99
    aget-wide v12, v10, v8

    .line 100
    .line 101
    const-wide/16 v14, 0x0

    .line 102
    .line 103
    cmp-long v14, v12, v14

    .line 104
    .line 105
    if-nez v14, :cond_4

    .line 106
    .line 107
    goto :goto_4

    .line 108
    :cond_4
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 109
    .line 110
    .line 111
    move-result-object v14

    .line 112
    invoke-interface {v6, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v14

    .line 116
    invoke-static {v14}, Lh3;->M(Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v14

    .line 120
    if-nez v14, :cond_5

    .line 121
    .line 122
    const-wide/32 v15, -0x80000000

    .line 123
    .line 124
    .line 125
    cmp-long v15, v12, v15

    .line 126
    .line 127
    if-ltz v15, :cond_5

    .line 128
    .line 129
    const-wide/32 v15, 0x7fffffff

    .line 130
    .line 131
    .line 132
    cmp-long v15, v12, v15

    .line 133
    .line 134
    if-gtz v15, :cond_5

    .line 135
    .line 136
    long-to-int v14, v12

    .line 137
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 138
    .line 139
    .line 140
    move-result-object v14

    .line 141
    invoke-interface {v6, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v14

    .line 145
    invoke-static {v14}, Lh3;->M(Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v14

    .line 149
    goto :goto_3

    .line 150
    :catchall_0
    move-exception v0

    .line 151
    goto :goto_6

    .line 152
    :cond_5
    :goto_3
    if-nez v14, :cond_6

    .line 153
    .line 154
    invoke-static {v12, v13}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v12

    .line 158
    invoke-interface {v6, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v12

    .line 162
    invoke-static {v12}, Lh3;->M(Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v14

    .line 166
    :cond_6
    if-eqz v14, :cond_7

    .line 167
    .line 168
    return-object v14

    .line 169
    :cond_7
    :goto_4
    add-int/lit8 v8, v8, 0x1

    .line 170
    .line 171
    goto :goto_2

    .line 172
    :cond_8
    invoke-static {v6, v1}, Lh3;->n(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 176
    if-eqz v6, :cond_9

    .line 177
    .line 178
    return-object v6

    .line 179
    :cond_9
    :goto_5
    add-int/lit8 v5, v5, 0x1

    .line 180
    .line 181
    goto :goto_1

    .line 182
    :goto_6
    new-instance v1, Ljava/lang/StringBuilder;

    .line 183
    .line 184
    const-string v3, "download redirect entity capture failed: "

    .line 185
    .line 186
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    :cond_a
    :goto_7
    return-object v2
.end method

.method public static b(Ljava/lang/Object;)V
    .locals 14

    .line 1
    invoke-static {p0}, Lh3;->v(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_8

    .line 8
    .line 9
    :cond_0
    const-string v0, "getFileName"

    .line 10
    .line 11
    const-string v1, "fileName"

    .line 12
    .line 13
    invoke-static {p0, v0, v1}, Lh3;->K(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, "getFilePath"

    .line 18
    .line 19
    const-string v2, "filePath"

    .line 20
    .line 21
    invoke-static {p0, v1, v2}, Lh3;->K(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const-string v2, "getFileSize"

    .line 26
    .line 27
    const-string v3, "fileSize"

    .line 28
    .line 29
    invoke-static {p0, v2, v3}, Lh3;->w(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)J

    .line 30
    .line 31
    .line 32
    move-result-wide v2

    .line 33
    const-wide/16 v4, 0x0

    .line 34
    .line 35
    const/4 v6, 0x0

    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 40
    .line 41
    invoke-virtual {v0, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v8

    .line 45
    const-string v9, ".apk"

    .line 46
    .line 47
    invoke-virtual {v8, v9}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 48
    .line 49
    .line 50
    move-result v9

    .line 51
    if-nez v9, :cond_3

    .line 52
    .line 53
    const-string v9, ".apk.1"

    .line 54
    .line 55
    invoke-virtual {v8, v9}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 56
    .line 57
    .line 58
    move-result v8

    .line 59
    if-eqz v8, :cond_2

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_2
    :goto_0
    move-object v10, v6

    .line 63
    goto/16 :goto_6

    .line 64
    .line 65
    :cond_3
    :goto_1
    const-string v8, ".1"

    .line 66
    .line 67
    if-nez v0, :cond_4

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_4
    invoke-virtual {v0, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v9

    .line 74
    const-string v10, ".apk"

    .line 75
    .line 76
    invoke-virtual {v9, v10}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 77
    .line 78
    .line 79
    move-result v10

    .line 80
    if-nez v10, :cond_5

    .line 81
    .line 82
    const-string v10, ".apk.1"

    .line 83
    .line 84
    invoke-virtual {v9, v10}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 85
    .line 86
    .line 87
    move-result v9

    .line 88
    if-eqz v9, :cond_2

    .line 89
    .line 90
    :cond_5
    cmp-long v9, v2, v4

    .line 91
    .line 92
    if-gtz v9, :cond_6

    .line 93
    .line 94
    :goto_2
    goto :goto_0

    .line 95
    :cond_6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 96
    .line 97
    .line 98
    move-result-wide v9

    .line 99
    sget-object v11, Lh3;->d:Ljava/lang/Object;

    .line 100
    .line 101
    monitor-enter v11

    .line 102
    :try_start_0
    invoke-static {v9, v10}, Lh3;->D(J)V

    .line 103
    .line 104
    .line 105
    sget-object v9, Lh3;->e:Ljava/util/HashMap;

    .line 106
    .line 107
    invoke-static {v0}, Lh3;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v10

    .line 111
    invoke-virtual {v9, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v10

    .line 115
    check-cast v10, Lf3;

    .line 116
    .line 117
    if-nez v10, :cond_7

    .line 118
    .line 119
    invoke-static {v0}, Lh3;->u(Ljava/lang/String;)Z

    .line 120
    .line 121
    .line 122
    move-result v12

    .line 123
    if-eqz v12, :cond_7

    .line 124
    .line 125
    invoke-static {v0}, Lh3;->L(Ljava/lang/String;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v10

    .line 129
    invoke-static {v10}, Lh3;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v10

    .line 133
    invoke-virtual {v9, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v10

    .line 137
    check-cast v10, Lf3;

    .line 138
    .line 139
    goto :goto_3

    .line 140
    :catchall_0
    move-exception v0

    .line 141
    move-object p0, v0

    .line 142
    goto/16 :goto_9

    .line 143
    .line 144
    :cond_7
    :goto_3
    if-nez v10, :cond_8

    .line 145
    .line 146
    if-eqz v0, :cond_8

    .line 147
    .line 148
    invoke-virtual {v0, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v7

    .line 152
    const-string v12, ".apk"

    .line 153
    .line 154
    invoke-virtual {v7, v12}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 155
    .line 156
    .line 157
    move-result v7

    .line 158
    if-eqz v7, :cond_8

    .line 159
    .line 160
    invoke-virtual {v0, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v7

    .line 164
    invoke-static {v7}, Lh3;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v7

    .line 168
    invoke-virtual {v9, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v7

    .line 172
    move-object v10, v7

    .line 173
    check-cast v10, Lf3;

    .line 174
    .line 175
    :cond_8
    if-nez v10, :cond_9

    .line 176
    .line 177
    monitor-exit v11

    .line 178
    goto :goto_0

    .line 179
    :cond_9
    iget-wide v7, v10, Lf3;->b:J

    .line 180
    .line 181
    cmp-long v9, v7, v4

    .line 182
    .line 183
    if-lez v9, :cond_d

    .line 184
    .line 185
    cmp-long v7, v2, v7

    .line 186
    .line 187
    if-eqz v7, :cond_a

    .line 188
    .line 189
    goto :goto_5

    .line 190
    :cond_a
    iget-object v7, v10, Lf3;->d:Ljava/lang/String;

    .line 191
    .line 192
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 193
    .line 194
    .line 195
    move-result v7

    .line 196
    if-eqz v7, :cond_c

    .line 197
    .line 198
    if-eqz v1, :cond_c

    .line 199
    .line 200
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v7

    .line 204
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 205
    .line 206
    .line 207
    move-result v7

    .line 208
    if-eqz v7, :cond_c

    .line 209
    .line 210
    iget-object v7, v10, Lf3;->d:Ljava/lang/String;

    .line 211
    .line 212
    new-instance v8, Ljava/io/File;

    .line 213
    .line 214
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v9

    .line 218
    invoke-direct {v8, v9}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    invoke-static {v8}, Lh3;->d(Ljava/io/File;)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v8

    .line 225
    invoke-virtual {v7, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 226
    .line 227
    .line 228
    move-result v7

    .line 229
    if-nez v7, :cond_b

    .line 230
    .line 231
    goto :goto_4

    .line 232
    :cond_b
    monitor-exit v11

    .line 233
    goto :goto_6

    .line 234
    :cond_c
    :goto_4
    monitor-exit v11

    .line 235
    goto/16 :goto_0

    .line 236
    .line 237
    :cond_d
    :goto_5
    monitor-exit v11
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 238
    goto/16 :goto_0

    .line 239
    .line 240
    :goto_6
    if-nez v10, :cond_12

    .line 241
    .line 242
    cmp-long v4, v2, v4

    .line 243
    .line 244
    if-gtz v4, :cond_e

    .line 245
    .line 246
    goto :goto_7

    .line 247
    :cond_e
    invoke-static {}, La3;->d()Ljava/io/File;

    .line 248
    .line 249
    .line 250
    move-result-object v4

    .line 251
    if-nez v4, :cond_f

    .line 252
    .line 253
    goto :goto_7

    .line 254
    :cond_f
    invoke-static {v4, v1, v2, v3}, Lh3;->i(Ljava/io/File;Ljava/lang/String;J)Ljava/io/File;

    .line 255
    .line 256
    .line 257
    move-result-object v5

    .line 258
    if-nez v5, :cond_10

    .line 259
    .line 260
    if-eqz v0, :cond_10

    .line 261
    .line 262
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v7

    .line 266
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 267
    .line 268
    .line 269
    move-result v7

    .line 270
    if-lez v7, :cond_10

    .line 271
    .line 272
    new-instance v5, Ljava/io/File;

    .line 273
    .line 274
    invoke-static {v0}, La3;->t(Ljava/lang/String;)Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v7

    .line 278
    invoke-direct {v5, v4, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v5

    .line 285
    invoke-static {v4, v5, v2, v3}, Lh3;->i(Ljava/io/File;Ljava/lang/String;J)Ljava/io/File;

    .line 286
    .line 287
    .line 288
    move-result-object v5

    .line 289
    :cond_10
    if-nez v5, :cond_11

    .line 290
    .line 291
    goto :goto_7

    .line 292
    :cond_11
    new-instance v7, Lf3;

    .line 293
    .line 294
    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v8

    .line 298
    invoke-virtual {v5}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    invoke-virtual {v5}, Ljava/io/File;->length()J

    .line 302
    .line 303
    .line 304
    move-result-wide v9

    .line 305
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 306
    .line 307
    .line 308
    move-result-wide v11

    .line 309
    const-string v13, ""

    .line 310
    .line 311
    invoke-direct/range {v7 .. v13}, Lf3;-><init>(Ljava/lang/String;JJLjava/lang/String;)V

    .line 312
    .line 313
    .line 314
    move-object v6, v7

    .line 315
    :goto_7
    move-object v10, v6

    .line 316
    :cond_12
    if-nez v10, :cond_13

    .line 317
    .line 318
    goto :goto_8

    .line 319
    :cond_13
    iget-object v2, v10, Lf3;->a:Ljava/lang/String;

    .line 320
    .line 321
    invoke-static {p0, v2}, Lh3;->x(Ljava/lang/Object;Ljava/lang/String;)Z

    .line 322
    .line 323
    .line 324
    move-result p0

    .line 325
    if-nez p0, :cond_14

    .line 326
    .line 327
    goto :goto_8

    .line 328
    :cond_14
    sget-object p0, Lh3;->a:Lt0;

    .line 329
    .line 330
    iget-object v2, v10, Lf3;->a:Ljava/lang/String;

    .line 331
    .line 332
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 333
    .line 334
    .line 335
    move-result-wide v3

    .line 336
    invoke-virtual {p0, v3, v4, v2}, Lt0;->a(JLjava/lang/String;)Z

    .line 337
    .line 338
    .line 339
    move-result p0

    .line 340
    if-eqz p0, :cond_15

    .line 341
    .line 342
    new-instance p0, Ljava/lang/StringBuilder;

    .line 343
    .line 344
    const-string v2, "download redirect card file element patched final="

    .line 345
    .line 346
    invoke-direct {p0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 347
    .line 348
    .line 349
    iget-object v2, v10, Lf3;->a:Ljava/lang/String;

    .line 350
    .line 351
    invoke-static {v2}, Lh3;->H(Ljava/lang/String;)Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object v2

    .line 355
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 356
    .line 357
    .line 358
    const-string v2, " name="

    .line 359
    .line 360
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 361
    .line 362
    .line 363
    invoke-static {v0}, Lh3;->H(Ljava/lang/String;)Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 368
    .line 369
    .line 370
    const-string v0, " old_path="

    .line 371
    .line 372
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 373
    .line 374
    .line 375
    invoke-static {v1}, Lh3;->H(Ljava/lang/String;)Ljava/lang/String;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 380
    .line 381
    .line 382
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object p0

    .line 386
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V

    .line 387
    .line 388
    .line 389
    :cond_15
    :goto_8
    return-void

    .line 390
    :goto_9
    :try_start_1
    monitor-exit v11
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 391
    throw p0
.end method

.method public static c(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 1
    invoke-static {p0}, Lh3;->u(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    const-string p0, ""

    .line 10
    .line 11
    :cond_0
    return-object p0

    .line 12
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    add-int/lit8 v0, v0, -0x6

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    add-int/lit8 v1, v1, -0x6

    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    invoke-virtual {p0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    const-string v3, ")"

    .line 34
    .line 35
    invoke-virtual {v1, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-nez v3, :cond_2

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    const-string v3, " ("

    .line 43
    .line 44
    invoke-virtual {v1, v3}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-ltz v3, :cond_5

    .line 49
    .line 50
    add-int/lit8 v4, v3, 0x2

    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    add-int/lit8 v5, v5, -0x1

    .line 57
    .line 58
    if-lt v4, v5, :cond_3

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    :try_start_0
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    add-int/lit8 v5, v5, -0x1

    .line 66
    .line 67
    invoke-virtual {v1, v4, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    if-lez v4, :cond_5

    .line 76
    .line 77
    const/16 v5, 0x270f

    .line 78
    .line 79
    if-le v4, v5, :cond_4

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_4
    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 90
    :catch_0
    :cond_5
    :goto_0
    return-object p0
.end method

.method public static d(Ljava/io/File;)Ljava/lang/String;
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
    :try_start_0
    invoke-virtual {p0}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    return-object p0

    .line 11
    :catchall_0
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public static e(JLjava/io/File;)V
    .locals 17

    .line 1
    invoke-virtual/range {p2 .. p2}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lh3;->u(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto/16 :goto_6

    .line 12
    .line 13
    :cond_0
    invoke-virtual/range {p2 .. p2}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_12

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_1

    .line 24
    .line 25
    goto/16 :goto_6

    .line 26
    .line 27
    :cond_1
    :try_start_0
    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 28
    .line 29
    .line 30
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    const/4 v0, 0x0

    .line 33
    :goto_0
    if-eqz v0, :cond_12

    .line 34
    .line 35
    array-length v1, v0

    .line 36
    if-nez v1, :cond_2

    .line 37
    .line 38
    goto/16 :goto_6

    .line 39
    .line 40
    :cond_2
    invoke-static/range {p2 .. p2}, Lh3;->d(Ljava/io/File;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual/range {p2 .. p2}, Ljava/io/File;->isFile()Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_3

    .line 49
    .line 50
    invoke-virtual/range {p2 .. p2}, Ljava/io/File;->length()J

    .line 51
    .line 52
    .line 53
    move-result-wide v2

    .line 54
    goto :goto_1

    .line 55
    :cond_3
    move-wide/from16 v2, p0

    .line 56
    .line 57
    :goto_1
    const/4 v4, 0x0

    .line 58
    move v5, v4

    .line 59
    :goto_2
    array-length v6, v0

    .line 60
    if-ge v5, v6, :cond_12

    .line 61
    .line 62
    aget-object v6, v0, v5

    .line 63
    .line 64
    if-eqz v6, :cond_4

    .line 65
    .line 66
    invoke-virtual {v6}, Ljava/io/File;->isFile()Z

    .line 67
    .line 68
    .line 69
    move-result v7

    .line 70
    if-nez v7, :cond_5

    .line 71
    .line 72
    :catchall_1
    :cond_4
    :goto_3
    move-object/from16 v8, p2

    .line 73
    .line 74
    goto/16 :goto_5

    .line 75
    .line 76
    :cond_5
    invoke-static {v6}, Lh3;->d(Ljava/io/File;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v7

    .line 80
    invoke-virtual {v1, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 81
    .line 82
    .line 83
    move-result v8

    .line 84
    if-eqz v8, :cond_6

    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_6
    invoke-virtual/range {p2 .. p2}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v8

    .line 91
    invoke-virtual {v6}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v9

    .line 95
    invoke-static {v8}, Lh3;->u(Ljava/lang/String;)Z

    .line 96
    .line 97
    .line 98
    move-result v10

    .line 99
    if-eqz v10, :cond_4

    .line 100
    .line 101
    if-nez v9, :cond_7

    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_7
    sget-object v10, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 105
    .line 106
    invoke-virtual {v9, v10}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v10

    .line 110
    const-string v11, ".1"

    .line 111
    .line 112
    invoke-virtual {v10, v11}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 113
    .line 114
    .line 115
    move-result v10

    .line 116
    if-nez v10, :cond_8

    .line 117
    .line 118
    goto :goto_3

    .line 119
    :cond_8
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 120
    .line 121
    .line 122
    move-result v10

    .line 123
    add-int/lit8 v10, v10, -0x2

    .line 124
    .line 125
    invoke-virtual {v8, v4, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v14

    .line 129
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 130
    .line 131
    .line 132
    move-result v8

    .line 133
    add-int/lit8 v8, v8, -0x2

    .line 134
    .line 135
    invoke-virtual {v9, v4, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v11

    .line 139
    const/4 v15, 0x0

    .line 140
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    .line 141
    .line 142
    .line 143
    move-result v16

    .line 144
    const/4 v12, 0x1

    .line 145
    const/4 v13, 0x0

    .line 146
    invoke-virtual/range {v11 .. v16}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    .line 147
    .line 148
    .line 149
    move-result v8

    .line 150
    if-nez v8, :cond_9

    .line 151
    .line 152
    goto :goto_3

    .line 153
    :cond_9
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    .line 154
    .line 155
    .line 156
    move-result v8

    .line 157
    invoke-virtual {v11, v8}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v8

    .line 161
    invoke-virtual {v8}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v8

    .line 165
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 166
    .line 167
    .line 168
    move-result v9

    .line 169
    const/4 v10, 0x3

    .line 170
    if-lt v9, v10, :cond_4

    .line 171
    .line 172
    invoke-virtual {v8, v4}, Ljava/lang/String;->charAt(I)C

    .line 173
    .line 174
    .line 175
    move-result v9

    .line 176
    const/16 v10, 0x28

    .line 177
    .line 178
    if-ne v9, v10, :cond_4

    .line 179
    .line 180
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 181
    .line 182
    .line 183
    move-result v9

    .line 184
    const/4 v10, 0x1

    .line 185
    sub-int/2addr v9, v10

    .line 186
    invoke-virtual {v8, v9}, Ljava/lang/String;->charAt(I)C

    .line 187
    .line 188
    .line 189
    move-result v9

    .line 190
    const/16 v11, 0x29

    .line 191
    .line 192
    if-eq v9, v11, :cond_a

    .line 193
    .line 194
    goto :goto_3

    .line 195
    :cond_a
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 196
    .line 197
    .line 198
    move-result v9

    .line 199
    sub-int/2addr v9, v10

    .line 200
    invoke-virtual {v8, v10, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v8

    .line 204
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 205
    .line 206
    .line 207
    move-result v9

    .line 208
    if-eqz v9, :cond_4

    .line 209
    .line 210
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 211
    .line 212
    .line 213
    move-result v9

    .line 214
    const/4 v10, 0x4

    .line 215
    if-le v9, v10, :cond_b

    .line 216
    .line 217
    goto/16 :goto_3

    .line 218
    .line 219
    :cond_b
    move v9, v4

    .line 220
    :goto_4
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 221
    .line 222
    .line 223
    move-result v10

    .line 224
    if-ge v9, v10, :cond_d

    .line 225
    .line 226
    invoke-virtual {v8, v9}, Ljava/lang/String;->charAt(I)C

    .line 227
    .line 228
    .line 229
    move-result v10

    .line 230
    invoke-static {v10}, Ljava/lang/Character;->isDigit(C)Z

    .line 231
    .line 232
    .line 233
    move-result v10

    .line 234
    if-nez v10, :cond_c

    .line 235
    .line 236
    goto/16 :goto_3

    .line 237
    .line 238
    :cond_c
    add-int/lit8 v9, v9, 0x1

    .line 239
    .line 240
    goto :goto_4

    .line 241
    :cond_d
    :try_start_1
    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 242
    .line 243
    .line 244
    move-result v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 245
    if-lez v8, :cond_4

    .line 246
    .line 247
    const/16 v9, 0x270f

    .line 248
    .line 249
    if-gt v8, v9, :cond_4

    .line 250
    .line 251
    invoke-virtual {v6}, Ljava/io/File;->length()J

    .line 252
    .line 253
    .line 254
    move-result-wide v8

    .line 255
    const-wide/16 v10, 0x0

    .line 256
    .line 257
    cmp-long v12, p0, v10

    .line 258
    .line 259
    if-lez v12, :cond_e

    .line 260
    .line 261
    cmp-long v12, v8, p0

    .line 262
    .line 263
    if-eqz v12, :cond_e

    .line 264
    .line 265
    goto/16 :goto_3

    .line 266
    .line 267
    :cond_e
    cmp-long v10, v2, v10

    .line 268
    .line 269
    if-lez v10, :cond_f

    .line 270
    .line 271
    cmp-long v8, v8, v2

    .line 272
    .line 273
    if-eqz v8, :cond_f

    .line 274
    .line 275
    goto/16 :goto_3

    .line 276
    .line 277
    :cond_f
    invoke-virtual/range {p2 .. p2}, Ljava/io/File;->isFile()Z

    .line 278
    .line 279
    .line 280
    move-result v8

    .line 281
    if-eqz v8, :cond_10

    .line 282
    .line 283
    invoke-virtual {v6}, Ljava/io/File;->delete()Z

    .line 284
    .line 285
    .line 286
    move-result v6

    .line 287
    if-eqz v6, :cond_4

    .line 288
    .line 289
    new-instance v6, Ljava/lang/StringBuilder;

    .line 290
    .line 291
    const-string v8, "download redirect apk.1 collision duplicate removed file="

    .line 292
    .line 293
    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 294
    .line 295
    .line 296
    invoke-static {v7}, Lh3;->H(Ljava/lang/String;)Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v7

    .line 300
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 301
    .line 302
    .line 303
    const-string v7, " target="

    .line 304
    .line 305
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 306
    .line 307
    .line 308
    invoke-static {v1}, Lh3;->H(Ljava/lang/String;)Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object v7

    .line 312
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 313
    .line 314
    .line 315
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v6

    .line 319
    invoke-static {v6}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V

    .line 320
    .line 321
    .line 322
    goto/16 :goto_3

    .line 323
    .line 324
    :cond_10
    move-object/from16 v8, p2

    .line 325
    .line 326
    invoke-virtual {v6, v8}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 327
    .line 328
    .line 329
    move-result v6

    .line 330
    if-eqz v6, :cond_11

    .line 331
    .line 332
    new-instance v6, Ljava/lang/StringBuilder;

    .line 333
    .line 334
    const-string v9, "download redirect apk.1 collision repaired from="

    .line 335
    .line 336
    invoke-direct {v6, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 337
    .line 338
    .line 339
    invoke-static {v7}, Lh3;->H(Ljava/lang/String;)Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object v7

    .line 343
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 344
    .line 345
    .line 346
    const-string v7, " to="

    .line 347
    .line 348
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 349
    .line 350
    .line 351
    invoke-static {v1}, Lh3;->H(Ljava/lang/String;)Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object v7

    .line 355
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 356
    .line 357
    .line 358
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v6

    .line 362
    invoke-static {v6}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V

    .line 363
    .line 364
    .line 365
    :cond_11
    :goto_5
    add-int/lit8 v5, v5, 0x1

    .line 366
    .line 367
    goto/16 :goto_2

    .line 368
    .line 369
    :cond_12
    :goto_6
    return-void
.end method

.method public static f(Landroid/content/ContentResolver;Ljava/lang/String;Ljava/io/File;Ljava/lang/String;)I
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_3

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
    const/4 v1, 0x1

    .line 12
    invoke-static {p0, p1, p2, p3, v1}, Lh3;->g(Landroid/content/ContentResolver;Ljava/lang/String;Ljava/io/File;Ljava/lang/String;Z)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-gez v1, :cond_1

    .line 17
    .line 18
    invoke-static {p0, p1, p2, p3, v0}, Lh3;->g(Landroid/content/ContentResolver;Ljava/lang/String;Ljava/io/File;Ljava/lang/String;Z)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    :cond_1
    if-lez v1, :cond_2

    .line 23
    .line 24
    new-instance p0, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    const-string p1, "download redirect stale MediaStore rows cleared target="

    .line 27
    .line 28
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-static {p1}, Lh3;->H(Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string p1, " count="

    .line 43
    .line 44
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string p1, " reason="

    .line 51
    .line 52
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-static {p3}, Lh3;->H(Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    :cond_2
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    return p0

    .line 74
    :cond_3
    :goto_0
    return v0
.end method

.method public static g(Landroid/content/ContentResolver;Ljava/lang/String;Ljava/io/File;Ljava/lang/String;Z)I
    .locals 17

    .line 1
    const/4 v1, -0x1

    .line 2
    const-string v0, "_data"

    .line 3
    .line 4
    const-string v2, "relative_path"

    .line 5
    .line 6
    const-string v3, "_size"

    .line 7
    .line 8
    const-string v4, "_id"

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v6, 0x0

    .line 12
    if-eqz p4, :cond_0

    .line 13
    .line 14
    :try_start_0
    filled-new-array {v4, v3, v2, v0}, [Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v7

    .line 18
    :goto_0
    move-object v10, v7

    .line 19
    goto :goto_1

    .line 20
    :catchall_0
    move-exception v0

    .line 21
    goto/16 :goto_8

    .line 22
    .line 23
    :cond_0
    filled-new-array {v4, v3, v2}, [Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v7

    .line 27
    goto :goto_0

    .line 28
    :goto_1
    sget-object v9, Landroid/provider/MediaStore$Downloads;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    .line 29
    .line 30
    const-string v11, "_display_name=?"

    .line 31
    .line 32
    invoke-virtual/range {p2 .. p2}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v7

    .line 36
    filled-new-array {v7}, [Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v12

    .line 40
    const/4 v13, 0x0

    .line 41
    move-object/from16 v8, p0

    .line 42
    .line 43
    invoke-virtual/range {v8 .. v13}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 44
    .line 45
    .line 46
    move-result-object v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    if-nez v7, :cond_1

    .line 48
    .line 49
    if-eqz v7, :cond_11

    .line 50
    .line 51
    :try_start_1
    invoke-interface {v7}, Landroid/database/Cursor;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 52
    .line 53
    .line 54
    :catchall_1
    return v6

    .line 55
    :cond_1
    :try_start_2
    invoke-interface {v7, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    invoke-interface {v7, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    invoke-interface {v7, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-eqz p4, :cond_2

    .line 68
    .line 69
    invoke-interface {v7, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    goto :goto_2

    .line 74
    :catchall_2
    move-exception v0

    .line 75
    move-object v5, v7

    .line 76
    goto/16 :goto_8

    .line 77
    .line 78
    :cond_2
    move v0, v1

    .line 79
    :goto_2
    move v8, v6

    .line 80
    :catchall_3
    :goto_3
    invoke-interface {v7}, Landroid/database/Cursor;->moveToNext()Z

    .line 81
    .line 82
    .line 83
    move-result v9

    .line 84
    if-eqz v9, :cond_e

    .line 85
    .line 86
    if-ltz v4, :cond_3

    .line 87
    .line 88
    invoke-interface {v7, v4}, Landroid/database/Cursor;->isNull(I)Z

    .line 89
    .line 90
    .line 91
    move-result v9

    .line 92
    if-eqz v9, :cond_4

    .line 93
    .line 94
    :cond_3
    :goto_4
    move-object/from16 v10, p0

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_4
    invoke-interface {v7, v4}, Landroid/database/Cursor;->getLong(I)J

    .line 98
    .line 99
    .line 100
    move-result-wide v9

    .line 101
    if-ltz v3, :cond_5

    .line 102
    .line 103
    invoke-interface {v7, v3}, Landroid/database/Cursor;->isNull(I)Z

    .line 104
    .line 105
    .line 106
    move-result v11

    .line 107
    if-nez v11, :cond_5

    .line 108
    .line 109
    invoke-interface {v7, v3}, Landroid/database/Cursor;->getLong(I)J

    .line 110
    .line 111
    .line 112
    move-result-wide v11
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 113
    goto :goto_5

    .line 114
    :cond_5
    const-wide/16 v11, -0x1

    .line 115
    .line 116
    :goto_5
    const-string v13, ""

    .line 117
    .line 118
    if-ltz v2, :cond_6

    .line 119
    .line 120
    :try_start_3
    invoke-interface {v7, v2}, Landroid/database/Cursor;->isNull(I)Z

    .line 121
    .line 122
    .line 123
    move-result v14

    .line 124
    if-nez v14, :cond_6

    .line 125
    .line 126
    invoke-interface {v7, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v14

    .line 130
    goto :goto_6

    .line 131
    :cond_6
    move-object v14, v13

    .line 132
    :goto_6
    if-ltz v0, :cond_7

    .line 133
    .line 134
    invoke-interface {v7, v0}, Landroid/database/Cursor;->isNull(I)Z

    .line 135
    .line 136
    .line 137
    move-result v15

    .line 138
    if-nez v15, :cond_7

    .line 139
    .line 140
    invoke-interface {v7, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v13

    .line 144
    :cond_7
    invoke-static/range {p1 .. p1}, Lh3;->z(Ljava/lang/String;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v15

    .line 148
    invoke-static {v14}, Lh3;->z(Ljava/lang/String;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v14

    .line 152
    invoke-virtual {v15}, Ljava/lang/String;->length()I

    .line 153
    .line 154
    .line 155
    move-result v16

    .line 156
    if-lez v16, :cond_8

    .line 157
    .line 158
    invoke-virtual {v15, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v14

    .line 162
    if-eqz v14, :cond_8

    .line 163
    .line 164
    const/4 v14, 0x1

    .line 165
    goto :goto_7

    .line 166
    :cond_8
    if-eqz v13, :cond_9

    .line 167
    .line 168
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 169
    .line 170
    .line 171
    move-result v14

    .line 172
    if-lez v14, :cond_9

    .line 173
    .line 174
    new-instance v14, Ljava/io/File;

    .line 175
    .line 176
    invoke-direct {v14, v13}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    invoke-static {v14}, Lh3;->d(Ljava/io/File;)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v14

    .line 183
    invoke-static/range {p2 .. p2}, Lh3;->d(Ljava/io/File;)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v15

    .line 187
    invoke-virtual {v14, v15}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 188
    .line 189
    .line 190
    move-result v14

    .line 191
    goto :goto_7

    .line 192
    :cond_9
    move v14, v6

    .line 193
    :goto_7
    if-nez v14, :cond_a

    .line 194
    .line 195
    goto :goto_4

    .line 196
    :cond_a
    invoke-virtual/range {p2 .. p2}, Ljava/io/File;->exists()Z

    .line 197
    .line 198
    .line 199
    move-result v14

    .line 200
    if-eqz v14, :cond_b

    .line 201
    .line 202
    goto :goto_4

    .line 203
    :cond_b
    if-eqz v13, :cond_c

    .line 204
    .line 205
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 206
    .line 207
    .line 208
    move-result v14
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 209
    if-lez v14, :cond_c

    .line 210
    .line 211
    :try_start_4
    new-instance v14, Ljava/io/File;

    .line 212
    .line 213
    invoke-direct {v14, v13}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v14}, Ljava/io/File;->exists()Z

    .line 217
    .line 218
    .line 219
    move-result v13
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 220
    if-eqz v13, :cond_c

    .line 221
    .line 222
    goto/16 :goto_4

    .line 223
    .line 224
    :catchall_4
    :cond_c
    const-wide/16 v13, 0x0

    .line 225
    .line 226
    cmp-long v11, v11, v13

    .line 227
    .line 228
    if-lez v11, :cond_d

    .line 229
    .line 230
    :try_start_5
    invoke-virtual/range {p2 .. p2}, Ljava/io/File;->exists()Z

    .line 231
    .line 232
    .line 233
    move-result v11

    .line 234
    if-nez v11, :cond_3

    .line 235
    .line 236
    :cond_d
    sget-object v11, Landroid/provider/MediaStore$Downloads;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    .line 237
    .line 238
    invoke-static {v11, v9, v10}, Landroid/content/ContentUris;->withAppendedId(Landroid/net/Uri;J)Landroid/net/Uri;

    .line 239
    .line 240
    .line 241
    move-result-object v9
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 242
    move-object/from16 v10, p0

    .line 243
    .line 244
    :try_start_6
    invoke-virtual {v10, v9, v5, v5}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I

    .line 245
    .line 246
    .line 247
    move-result v9

    .line 248
    invoke-static {v6, v9}, Ljava/lang/Math;->max(II)I

    .line 249
    .line 250
    .line 251
    move-result v9
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 252
    add-int/2addr v8, v9

    .line 253
    goto/16 :goto_3

    .line 254
    .line 255
    :cond_e
    :try_start_7
    invoke-interface {v7}, Landroid/database/Cursor;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 256
    .line 257
    .line 258
    :catchall_5
    return v8

    .line 259
    :goto_8
    if-eqz p4, :cond_10

    .line 260
    .line 261
    if-eqz v5, :cond_f

    .line 262
    .line 263
    :try_start_8
    invoke-interface {v5}, Landroid/database/Cursor;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    .line 264
    .line 265
    .line 266
    :catchall_6
    :cond_f
    return v1

    .line 267
    :cond_10
    :try_start_9
    new-instance v1, Ljava/lang/StringBuilder;

    .line 268
    .line 269
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 270
    .line 271
    .line 272
    const-string v2, "download redirect stale MediaStore cleanup failed target="

    .line 273
    .line 274
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 275
    .line 276
    .line 277
    invoke-virtual/range {p2 .. p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v2

    .line 281
    invoke-static {v2}, Lh3;->H(Ljava/lang/String;)Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v2

    .line 285
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 286
    .line 287
    .line 288
    const-string v2, " reason="

    .line 289
    .line 290
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 291
    .line 292
    .line 293
    invoke-static/range {p3 .. p3}, Lh3;->H(Ljava/lang/String;)Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v2

    .line 297
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 298
    .line 299
    .line 300
    const-string v2, " error="

    .line 301
    .line 302
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 303
    .line 304
    .line 305
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 306
    .line 307
    .line 308
    move-result-object v2

    .line 309
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v2

    .line 313
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 314
    .line 315
    .line 316
    const-string v2, ": "

    .line 317
    .line 318
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 319
    .line 320
    .line 321
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object v0

    .line 325
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    invoke-static {v0}, Lh3;->H(Ljava/lang/String;)Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 334
    .line 335
    .line 336
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_8

    .line 341
    .line 342
    .line 343
    if-eqz v5, :cond_11

    .line 344
    .line 345
    :try_start_a
    invoke-interface {v5}, Landroid/database/Cursor;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    .line 346
    .line 347
    .line 348
    :catchall_7
    :cond_11
    return v6

    .line 349
    :catchall_8
    move-exception v0

    .line 350
    if-eqz v5, :cond_12

    .line 351
    .line 352
    :try_start_b
    invoke-interface {v5}, Landroid/database/Cursor;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_9

    .line 353
    .line 354
    .line 355
    :catchall_9
    :cond_12
    throw v0
.end method

.method public static h(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const-string p0, ""

    .line 6
    .line 7
    :cond_0
    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public static i(Ljava/io/File;Ljava/lang/String;J)Ljava/io/File;
    .locals 2

    .line 1
    if-eqz p1, :cond_5

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    :try_start_0
    new-instance v0, Ljava/io/File;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/io/File;->isAbsolute()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_1

    .line 28
    .line 29
    new-instance v0, Ljava/io/File;

    .line 30
    .line 31
    invoke-static {p1}, La3;->t(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-direct {v0, p0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-eqz p1, :cond_5

    .line 43
    .line 44
    invoke-static {p1}, Lh3;->d(Ljava/io/File;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-static {p0}, Lh3;->d(Ljava/io/File;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-virtual {p1, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    if-nez p0, :cond_2

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    if-nez p0, :cond_3

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_3
    const-wide/16 p0, 0x0

    .line 67
    .line 68
    cmp-long p0, p2, p0

    .line 69
    .line 70
    if-lez p0, :cond_4

    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/io/File;->length()J

    .line 73
    .line 74
    .line 75
    move-result-wide p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    cmp-long p0, p0, p2

    .line 77
    .line 78
    if-eqz p0, :cond_4

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_4
    return-object v0

    .line 82
    :catchall_0
    :cond_5
    :goto_0
    const/4 p0, 0x0

    .line 83
    return-object p0
.end method

.method public static j(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;J)Z
    .locals 8

    .line 1
    invoke-static {p0}, Lh3;->v(Ljava/lang/Object;)Z

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
    const-string v0, "getFileName"

    .line 10
    .line 11
    const-string v2, "fileName"

    .line 12
    .line 13
    invoke-static {p0, v0, v2}, Lh3;->K(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v2, "getFilePath"

    .line 18
    .line 19
    const-string v3, "filePath"

    .line 20
    .line 21
    invoke-static {p0, v2, v3}, Lh3;->K(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    const-string v3, "getFileSize"

    .line 26
    .line 27
    const-string v4, "fileSize"

    .line 28
    .line 29
    invoke-static {p0, v3, v4}, Lh3;->w(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)J

    .line 30
    .line 31
    .line 32
    move-result-wide v3

    .line 33
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    const/4 v5, 0x1

    .line 38
    if-eqz p0, :cond_2

    .line 39
    .line 40
    invoke-static {p2, v0}, Lh3;->l(Ljava/lang/String;Ljava/lang/String;)Z

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    if-nez p0, :cond_2

    .line 45
    .line 46
    new-instance p0, Ljava/io/File;

    .line 47
    .line 48
    invoke-direct {p0, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-static {p2, p0}, Lh3;->l(Ljava/lang/String;Ljava/lang/String;)Z

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    if-eqz p0, :cond_1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    move p0, v1

    .line 63
    goto :goto_1

    .line 64
    :cond_2
    :goto_0
    move p0, v5

    .line 65
    :goto_1
    const-wide/16 v6, 0x0

    .line 66
    .line 67
    cmp-long p2, p3, v6

    .line 68
    .line 69
    if-lez p2, :cond_4

    .line 70
    .line 71
    cmp-long p2, v3, v6

    .line 72
    .line 73
    if-lez p2, :cond_4

    .line 74
    .line 75
    cmp-long p2, v3, p3

    .line 76
    .line 77
    if-nez p2, :cond_3

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_3
    move p2, v1

    .line 81
    goto :goto_3

    .line 82
    :cond_4
    :goto_2
    move p2, v5

    .line 83
    :goto_3
    sget-object p3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 84
    .line 85
    invoke-virtual {v2, p3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p3

    .line 89
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 90
    .line 91
    .line 92
    move-result p4

    .line 93
    if-eqz p4, :cond_6

    .line 94
    .line 95
    invoke-virtual {p1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    if-nez p1, :cond_6

    .line 100
    .line 101
    const-string p1, ".elaris-"

    .line 102
    .line 103
    invoke-virtual {v2, p1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    if-gez p1, :cond_6

    .line 108
    .line 109
    const-string p1, ".apk"

    .line 110
    .line 111
    invoke-virtual {p3, p1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    if-nez p1, :cond_6

    .line 116
    .line 117
    const-string p1, ".apk.1"

    .line 118
    .line 119
    invoke-virtual {p3, p1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    if-eqz p1, :cond_5

    .line 124
    .line 125
    goto :goto_4

    .line 126
    :cond_5
    move p1, v1

    .line 127
    goto :goto_5

    .line 128
    :cond_6
    :goto_4
    move p1, v5

    .line 129
    :goto_5
    if-eqz p0, :cond_7

    .line 130
    .line 131
    if-eqz p2, :cond_7

    .line 132
    .line 133
    if-eqz p1, :cond_7

    .line 134
    .line 135
    return v5

    .line 136
    :cond_7
    return v1
.end method

.method public static k(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_1
    new-instance v0, Ljava/io/File;

    .line 18
    .line 19
    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public static l(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    .line 1
    invoke-static {p0}, Lh3;->k(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p1}, Lh3;->k(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_5

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {p0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/4 v1, 0x1

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    return v1

    .line 30
    :cond_1
    invoke-static {p0}, Lh3;->L(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    return v1

    .line 41
    :cond_2
    invoke-static {p1}, Lh3;->L(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_3

    .line 50
    .line 51
    return v1

    .line 52
    :cond_3
    invoke-static {p0}, Lh3;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-virtual {p0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-eqz v0, :cond_4

    .line 61
    .line 62
    return v1

    .line 63
    :cond_4
    invoke-static {p0}, Lh3;->L(Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-virtual {p0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    return p0

    .line 72
    :cond_5
    :goto_0
    const/4 p0, 0x0

    .line 73
    return p0
.end method

.method public static m(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 8

    .line 1
    :goto_0
    if-eqz p0, :cond_2

    .line 2
    .line 3
    const-class v0, Ljava/lang/Object;

    .line 4
    .line 5
    if-eq p0, v0, :cond_2

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    array-length v1, v0

    .line 12
    const/4 v2, 0x0

    .line 13
    move v3, v2

    .line 14
    :goto_1
    if-ge v3, v1, :cond_1

    .line 15
    .line 16
    aget-object v4, v0, v3

    .line 17
    .line 18
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    move-result-object v6

    .line 26
    sget-object v7, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 27
    .line 28
    if-ne v6, v7, :cond_0

    .line 29
    .line 30
    array-length v6, v5

    .line 31
    const/4 v7, 0x3

    .line 32
    if-ne v6, v7, :cond_0

    .line 33
    .line 34
    aget-object v6, v5, v2

    .line 35
    .line 36
    invoke-virtual {v6, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    if-eqz v6, :cond_0

    .line 41
    .line 42
    const/4 v6, 0x1

    .line 43
    aget-object v6, v5, v6

    .line 44
    .line 45
    invoke-virtual {v6, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    if-eqz v6, :cond_0

    .line 50
    .line 51
    const/4 v6, 0x2

    .line 52
    aget-object v5, v5, v6

    .line 53
    .line 54
    sget-object v6, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 55
    .line 56
    if-ne v5, v6, :cond_0

    .line 57
    .line 58
    return-object v4

    .line 59
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    goto :goto_0

    .line 67
    :cond_2
    new-instance p0, Ljava/lang/NoSuchMethodException;

    .line 68
    .line 69
    const-string p1, "QQ file completion entity handler"

    .line 70
    .line 71
    invoke-direct {p0, p1}, Ljava/lang/NoSuchMethodException;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw p0
.end method

.method public static n(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    invoke-interface/range {p0 .. p0}, Ljava/util/Map;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_e

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto/16 :goto_6

    .line 12
    .line 13
    :cond_0
    const-string v1, "getFilePath"

    .line 14
    .line 15
    const-string v2, "filePath"

    .line 16
    .line 17
    invoke-static {v0, v1, v2}, Lh3;->K(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    const-string v4, "getCommonFileInfo"

    .line 22
    .line 23
    const-string v5, "commonFileInfo"

    .line 24
    .line 25
    invoke-static {v0, v4, v5}, Lh3;->A(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    if-nez v5, :cond_1

    .line 34
    .line 35
    if-eqz v4, :cond_1

    .line 36
    .line 37
    invoke-static {v4, v1, v2}, Lh3;->K(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    :cond_1
    invoke-static {v3}, Lh3;->k(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    const-string v6, "fileName"

    .line 50
    .line 51
    const-string v7, "getFileName"

    .line 52
    .line 53
    if-nez v5, :cond_2

    .line 54
    .line 55
    invoke-static {v0, v7, v6}, Lh3;->K(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    if-nez v5, :cond_3

    .line 64
    .line 65
    if-eqz v4, :cond_3

    .line 66
    .line 67
    invoke-static {v4, v7, v6}, Lh3;->K(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    :cond_3
    const-string v5, "getFileSize"

    .line 72
    .line 73
    const-string v8, "fileSize"

    .line 74
    .line 75
    invoke-static {v0, v5, v8}, Lh3;->w(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)J

    .line 76
    .line 77
    .line 78
    move-result-wide v9

    .line 79
    const-wide/16 v11, 0x0

    .line 80
    .line 81
    cmp-long v0, v9, v11

    .line 82
    .line 83
    if-gtz v0, :cond_4

    .line 84
    .line 85
    if-eqz v4, :cond_4

    .line 86
    .line 87
    invoke-static {v4, v5, v8}, Lh3;->w(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)J

    .line 88
    .line 89
    .line 90
    move-result-wide v9

    .line 91
    :cond_4
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-nez v0, :cond_5

    .line 96
    .line 97
    const-string v0, ""

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_5
    new-instance v0, Ljava/io/File;

    .line 101
    .line 102
    invoke-direct {v0, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    invoke-static {v0}, Lh3;->d(Ljava/io/File;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    :goto_0
    invoke-interface/range {p0 .. p0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 118
    .line 119
    .line 120
    move-result v4

    .line 121
    if-eqz v4, :cond_e

    .line 122
    .line 123
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    invoke-static {v4}, Lh3;->M(Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    if-nez v4, :cond_6

    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_6
    const-string v13, "strFilePath"

    .line 135
    .line 136
    invoke-static {v4, v1, v13}, Lh3;->K(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v13

    .line 140
    invoke-static {v4, v7, v6}, Lh3;->K(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v14

    .line 144
    invoke-static {v4, v5, v8}, Lh3;->w(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)J

    .line 145
    .line 146
    .line 147
    move-result-wide v15

    .line 148
    cmp-long v17, v9, v11

    .line 149
    .line 150
    const/16 v18, 0x1

    .line 151
    .line 152
    const/16 v19, 0x0

    .line 153
    .line 154
    if-lez v17, :cond_8

    .line 155
    .line 156
    cmp-long v20, v15, v11

    .line 157
    .line 158
    if-lez v20, :cond_8

    .line 159
    .line 160
    cmp-long v15, v15, v9

    .line 161
    .line 162
    if-nez v15, :cond_7

    .line 163
    .line 164
    goto :goto_2

    .line 165
    :cond_7
    move/from16 v15, v19

    .line 166
    .line 167
    goto :goto_3

    .line 168
    :cond_8
    :goto_2
    move/from16 v15, v18

    .line 169
    .line 170
    :goto_3
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 171
    .line 172
    .line 173
    move-result v16

    .line 174
    if-lez v16, :cond_9

    .line 175
    .line 176
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 177
    .line 178
    .line 179
    move-result v16

    .line 180
    if-lez v16, :cond_9

    .line 181
    .line 182
    new-instance v11, Ljava/io/File;

    .line 183
    .line 184
    invoke-direct {v11, v13}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    invoke-static {v11}, Lh3;->d(Ljava/io/File;)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v11

    .line 191
    invoke-virtual {v0, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 192
    .line 193
    .line 194
    move-result v11

    .line 195
    if-eqz v11, :cond_9

    .line 196
    .line 197
    move/from16 v11, v18

    .line 198
    .line 199
    goto :goto_4

    .line 200
    :cond_9
    move/from16 v11, v19

    .line 201
    .line 202
    :goto_4
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 203
    .line 204
    .line 205
    move-result v12

    .line 206
    if-lez v12, :cond_a

    .line 207
    .line 208
    invoke-static {v2, v14}, Lh3;->l(Ljava/lang/String;Ljava/lang/String;)Z

    .line 209
    .line 210
    .line 211
    move-result v12

    .line 212
    if-nez v12, :cond_b

    .line 213
    .line 214
    invoke-static {v13}, Lh3;->k(Ljava/lang/String;)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v12

    .line 218
    invoke-static {v2, v12}, Lh3;->l(Ljava/lang/String;Ljava/lang/String;)Z

    .line 219
    .line 220
    .line 221
    move-result v12

    .line 222
    if-eqz v12, :cond_a

    .line 223
    .line 224
    goto :goto_5

    .line 225
    :cond_a
    move/from16 v18, v19

    .line 226
    .line 227
    :cond_b
    :goto_5
    if-eqz v15, :cond_d

    .line 228
    .line 229
    if-nez v11, :cond_c

    .line 230
    .line 231
    if-lez v17, :cond_d

    .line 232
    .line 233
    if-eqz v18, :cond_d

    .line 234
    .line 235
    :cond_c
    return-object v4

    .line 236
    :cond_d
    const-wide/16 v11, 0x0

    .line 237
    .line 238
    goto :goto_1

    .line 239
    :cond_e
    :goto_6
    const/4 v0, 0x0

    .line 240
    return-object v0
.end method

.method public static o(Ljava/lang/ClassLoader;)I
    .locals 10

    .line 1
    const-string v0, "br2.a"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lv4;->j(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "com.tencent.qqnt.kernel.nativeinterface.FileElement"

    .line 8
    .line 9
    invoke-static {p0, v1}, Lv4;->j(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const/4 v1, 0x0

    .line 14
    if-eqz v0, :cond_5

    .line 15
    .line 16
    if-nez p0, :cond_0

    .line 17
    .line 18
    goto :goto_4

    .line 19
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    array-length v2, v0

    .line 24
    move v3, v1

    .line 25
    move v4, v3

    .line 26
    :goto_0
    if-ge v3, v2, :cond_4

    .line 27
    .line 28
    aget-object v5, v0, v3

    .line 29
    .line 30
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    const/4 v7, -0x1

    .line 35
    if-eqz v6, :cond_2

    .line 36
    .line 37
    move v8, v1

    .line 38
    :goto_1
    array-length v9, v6

    .line 39
    if-ge v8, v9, :cond_2

    .line 40
    .line 41
    aget-object v9, v6, v8

    .line 42
    .line 43
    if-ne v9, p0, :cond_1

    .line 44
    .line 45
    move v7, v8

    .line 46
    goto :goto_2

    .line 47
    :cond_1
    add-int/lit8 v8, v8, 0x1

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    :goto_2
    if-gez v7, :cond_3

    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_3
    const/4 v6, 0x1

    .line 54
    :try_start_0
    invoke-virtual {v5, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 55
    .line 56
    .line 57
    new-instance v6, Le3;

    .line 58
    .line 59
    invoke-direct {v6, v7}, Le3;-><init>(I)V

    .line 60
    .line 61
    .line 62
    invoke-static {v5, v6}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    .line 64
    .line 65
    add-int/lit8 v4, v4, 0x1

    .line 66
    .line 67
    goto :goto_3

    .line 68
    :catchall_0
    move-exception v5

    .line 69
    new-instance v6, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    const-string v7, "download redirect file card hook failed: "

    .line 72
    .line 73
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    invoke-static {v5}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    :goto_3
    add-int/lit8 v3, v3, 0x1

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_4
    return v4

    .line 90
    :cond_5
    :goto_4
    const-string p0, "download redirect file card class missing"

    .line 91
    .line 92
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    return v1
.end method

.method public static p(Ljava/lang/ClassLoader;)I
    .locals 11

    .line 1
    const-string v0, "com.tencent.mobileqq.aio.msglist.holder.component.file.AIOFileViewer"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lv4;->j(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "com.tencent.qqnt.kernel.nativeinterface.FileElement"

    .line 8
    .line 9
    invoke-static {p0, v1}, Lv4;->j(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const/4 v1, 0x0

    .line 14
    if-eqz v0, :cond_6

    .line 15
    .line 16
    if-nez p0, :cond_0

    .line 17
    .line 18
    goto/16 :goto_3

    .line 19
    .line 20
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    array-length v2, v0

    .line 25
    const/4 v3, 0x0

    .line 26
    move v4, v1

    .line 27
    move v5, v4

    .line 28
    :goto_0
    const/4 v6, 0x1

    .line 29
    if-ge v4, v2, :cond_3

    .line 30
    .line 31
    aget-object v7, v0, v4

    .line 32
    .line 33
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-result-object v8

    .line 37
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 38
    .line 39
    .line 40
    move-result v9

    .line 41
    invoke-static {v9}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 42
    .line 43
    .line 44
    move-result v9

    .line 45
    if-nez v9, :cond_2

    .line 46
    .line 47
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    move-result-object v9

    .line 51
    sget-object v10, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 52
    .line 53
    if-ne v9, v10, :cond_2

    .line 54
    .line 55
    array-length v9, v8

    .line 56
    const/4 v10, 0x2

    .line 57
    if-ne v9, v10, :cond_2

    .line 58
    .line 59
    aget-object v9, v8, v1

    .line 60
    .line 61
    if-ne v9, p0, :cond_2

    .line 62
    .line 63
    aget-object v6, v8, v6

    .line 64
    .line 65
    sget-object v8, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 66
    .line 67
    if-eq v6, v8, :cond_1

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_1
    add-int/lit8 v5, v5, 0x1

    .line 71
    .line 72
    move-object v3, v7

    .line 73
    :cond_2
    :goto_1
    add-int/lit8 v4, v4, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_3
    if-ne v5, v6, :cond_5

    .line 77
    .line 78
    if-nez v3, :cond_4

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_4
    :try_start_0
    invoke-virtual {v3, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 82
    .line 83
    .line 84
    new-instance p0, Ld3;

    .line 85
    .line 86
    const/16 v0, 0x46

    .line 87
    .line 88
    invoke-direct {p0, v0}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;-><init>(I)V

    .line 89
    .line 90
    .line 91
    invoke-static {v3, p0}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 92
    .line 93
    .line 94
    return v6

    .line 95
    :catchall_0
    move-exception p0

    .line 96
    new-instance v0, Ljava/lang/StringBuilder;

    .line 97
    .line 98
    const-string v2, "download redirect file viewer hook failed: "

    .line 99
    .line 100
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    return v1

    .line 114
    :cond_5
    :goto_2
    if-le v5, v6, :cond_6

    .line 115
    .line 116
    new-instance p0, Ljava/lang/StringBuilder;

    .line 117
    .line 118
    const-string v0, "download redirect file viewer hook ambiguous count="

    .line 119
    .line 120
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {p0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    :cond_6
    :goto_3
    return v1
.end method

.method public static q(Ljava/lang/Class;Ljava/lang/Class;)I
    .locals 8

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    array-length v0, p0

    .line 6
    const/4 v1, 0x0

    .line 7
    move v2, v1

    .line 8
    move v3, v2

    .line 9
    :goto_0
    if-ge v2, v0, :cond_2

    .line 10
    .line 11
    aget-object v4, p0, v2

    .line 12
    .line 13
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v5

    .line 17
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 18
    .line 19
    .line 20
    move-result v6

    .line 21
    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    .line 22
    .line 23
    .line 24
    move-result v6

    .line 25
    if-eqz v6, :cond_1

    .line 26
    .line 27
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    sget-object v7, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 32
    .line 33
    if-ne v6, v7, :cond_1

    .line 34
    .line 35
    array-length v6, v5

    .line 36
    const/4 v7, 0x1

    .line 37
    if-ne v6, v7, :cond_1

    .line 38
    .line 39
    aget-object v5, v5, v1

    .line 40
    .line 41
    if-eq v5, p1, :cond_0

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_0
    :try_start_0
    invoke-virtual {v4, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 45
    .line 46
    .line 47
    new-instance v5, Lb3;

    .line 48
    .line 49
    const/16 v6, 0x50

    .line 50
    .line 51
    invoke-direct {v5, v6}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;-><init>(I)V

    .line 52
    .line 53
    .line 54
    invoke-static {v4, v5}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    .line 56
    .line 57
    add-int/lit8 v3, v3, 0x1

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :catchall_0
    move-exception v4

    .line 61
    new-instance v5, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    const-string v6, "download redirect finalizer hook failed: "

    .line 64
    .line 65
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    invoke-static {v4}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    :cond_1
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_2
    return v3
.end method

.method public static r(Ljava/lang/ClassLoader;)I
    .locals 9

    .line 1
    const-string v0, "vk6.a"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lv4;->j(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "com.tencent.qqnt.kernel.nativeinterface.FileElement"

    .line 8
    .line 9
    invoke-static {p0, v1}, Lv4;->j(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const/4 v1, 0x0

    .line 14
    if-eqz v0, :cond_4

    .line 15
    .line 16
    if-nez p0, :cond_0

    .line 17
    .line 18
    goto :goto_2

    .line 19
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    array-length v2, v0

    .line 24
    move v3, v1

    .line 25
    move v4, v3

    .line 26
    :goto_0
    if-ge v3, v2, :cond_3

    .line 27
    .line 28
    aget-object v5, v0, v3

    .line 29
    .line 30
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    array-length v7, v6

    .line 35
    const/4 v8, 0x1

    .line 36
    if-ne v7, v8, :cond_2

    .line 37
    .line 38
    aget-object v6, v6, v1

    .line 39
    .line 40
    if-eq v6, p0, :cond_1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    :try_start_0
    invoke-virtual {v5, v8}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 44
    .line 45
    .line 46
    new-instance v6, Lc3;

    .line 47
    .line 48
    const/16 v7, 0x46

    .line 49
    .line 50
    invoke-direct {v6, v7}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;-><init>(I)V

    .line 51
    .line 52
    .line 53
    invoke-static {v5, v6}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    .line 55
    .line 56
    add-int/lit8 v4, v4, 0x1

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :catchall_0
    move-exception v5

    .line 60
    new-instance v6, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    const-string v7, "download redirect file state hook failed: "

    .line 63
    .line 64
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    invoke-static {v5}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    :cond_2
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_3
    return v4

    .line 81
    :cond_4
    :goto_2
    return v1
.end method

.method public static declared-synchronized s(Ljava/lang/ClassLoader;)V
    .locals 6

    .line 1
    const-string v0, "download redirect finalizer hook installed count="

    .line 2
    .line 3
    const-class v1, Lh3;

    .line 4
    .line 5
    monitor-enter v1

    .line 6
    :try_start_0
    sget-boolean v2, Lh3;->b:Z

    .line 7
    .line 8
    if-nez v2, :cond_6

    .line 9
    .line 10
    if-nez p0, :cond_0

    .line 11
    .line 12
    goto :goto_2

    .line 13
    :cond_0
    const-string v2, "com.tencent.mobileqq.filemanager.nt.aa"

    .line 14
    .line 15
    invoke-static {p0, v2}, Lv4;->j(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const-string v3, "com.tencent.qqnt.kernel.nativeinterface.FileTransNotifyInfo"

    .line 20
    .line 21
    invoke-static {p0, v3}, Lv4;->j(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    if-eqz v2, :cond_5

    .line 26
    .line 27
    if-nez v3, :cond_1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    invoke-static {v2, v3}, Lh3;->q(Ljava/lang/Class;Ljava/lang/Class;)I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    invoke-static {p0}, Lh3;->o(Ljava/lang/ClassLoader;)I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    invoke-static {p0}, Lh3;->r(Ljava/lang/ClassLoader;)I

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-nez v4, :cond_2

    .line 43
    .line 44
    invoke-static {p0}, Lh3;->p(Ljava/lang/ClassLoader;)I

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    goto :goto_0

    .line 49
    :catchall_0
    move-exception p0

    .line 50
    goto :goto_3

    .line 51
    :cond_2
    const/4 p0, 0x0

    .line 52
    :goto_0
    if-nez v4, :cond_3

    .line 53
    .line 54
    if-nez p0, :cond_3

    .line 55
    .line 56
    const-string v5, "download redirect file card state hook unavailable"

    .line 57
    .line 58
    invoke-static {v5}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    :cond_3
    add-int v5, v2, v3

    .line 62
    .line 63
    add-int/2addr v5, v4

    .line 64
    add-int/2addr v5, p0

    .line 65
    if-lez v5, :cond_4

    .line 66
    .line 67
    const/4 v5, 0x1

    .line 68
    sput-boolean v5, Lh3;->b:Z

    .line 69
    .line 70
    new-instance v5, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    const-string v0, " card_count="

    .line 79
    .line 80
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    const-string v0, " state_count="

    .line 87
    .line 88
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    const-string v0, " viewer_count="

    .line 95
    .line 96
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 107
    .line 108
    .line 109
    :cond_4
    monitor-exit v1

    .line 110
    return-void

    .line 111
    :cond_5
    :goto_1
    :try_start_1
    const-string p0, "download redirect finalizer class missing"

    .line 112
    .line 113
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 114
    .line 115
    .line 116
    monitor-exit v1

    .line 117
    return-void

    .line 118
    :cond_6
    :goto_2
    monitor-exit v1

    .line 119
    return-void

    .line 120
    :goto_3
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 121
    throw p0
.end method

.method public static t(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)I
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lh3;->A(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    instance-of p1, p0, Ljava/lang/Number;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    check-cast p0, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return p0
.end method

.method public static u(Ljava/lang/String;)Z
    .locals 1

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-string v0, ".apk.1"

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return p0
.end method

.method public static v(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const-string v1, "com.tencent.qqnt.kernel.nativeinterface.FileElement"

    .line 14
    .line 15
    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_2

    .line 20
    .line 21
    const-string v1, "com.tencent.qqnt.kernelpublic.nativeinterface.FileElement"

    .line 22
    .line 23
    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-eqz p0, :cond_1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    return v0

    .line 31
    :cond_2
    :goto_0
    const/4 p0, 0x1

    .line 32
    return p0
.end method

.method public static w(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)J
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lh3;->A(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    instance-of p1, p0, Ljava/lang/Number;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    check-cast p0, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 12
    .line 13
    .line 14
    move-result-wide p0

    .line 15
    return-wide p0

    .line 16
    :cond_0
    const-wide/16 p0, 0x0

    .line 17
    .line 18
    return-wide p0
.end method

.method public static x(Ljava/lang/Object;Ljava/lang/String;)Z
    .locals 2

    .line 1
    const-string v0, "filePath"

    .line 2
    .line 3
    invoke-static {p0, v0, p1}, Lh3;->J(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    const/4 v0, 0x0

    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    return v0

    .line 11
    :cond_0
    const-string p1, "transferStatus"

    .line 12
    .line 13
    const/4 v1, 0x4

    .line 14
    invoke-static {p0, p1, v1}, Lh3;->I(Ljava/lang/Object;Ljava/lang/String;I)Z

    .line 15
    .line 16
    .line 17
    const-string p1, "invalidState"

    .line 18
    .line 19
    invoke-static {p0, p1, v0}, Lh3;->I(Ljava/lang/Object;Ljava/lang/String;I)Z

    .line 20
    .line 21
    .line 22
    const-string p1, "progress"

    .line 23
    .line 24
    const/16 v0, 0x64

    .line 25
    .line 26
    invoke-static {p0, p1, v0}, Lh3;->I(Ljava/lang/Object;Ljava/lang/String;I)Z

    .line 27
    .line 28
    .line 29
    const/4 p0, 0x1

    .line 30
    return p0
.end method

.method public static y(Ljava/io/File;)Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-static {v1}, Lh3;->d(Ljava/io/File;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const/16 v2, 0x5c

    .line 15
    .line 16
    const/16 v3, 0x2f

    .line 17
    .line 18
    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-static {p0}, Lh3;->d(Ljava/io/File;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0, v2, v3}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    const-string v2, "/"

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    :goto_0
    invoke-virtual {p0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-nez v3, :cond_2

    .line 48
    .line 49
    return-object v0

    .line 50
    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    sget-object v1, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    .line 59
    .line 60
    invoke-virtual {p0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-nez v3, :cond_3

    .line 65
    .line 66
    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    new-instance v4, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-virtual {v3, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-nez v1, :cond_3

    .line 94
    .line 95
    return-object v0

    .line 96
    :cond_3
    invoke-virtual {p0, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-eqz v0, :cond_4

    .line 101
    .line 102
    return-object p0

    .line 103
    :cond_4
    invoke-virtual {p0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    return-object p0
.end method

.method public static z(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

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
    const/16 v0, 0x5c

    .line 7
    .line 8
    const/16 v1, 0x2f

    .line 9
    .line 10
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    :goto_0
    const-string v0, "/"

    .line 23
    .line 24
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    const/4 v2, 0x1

    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    invoke-virtual {p0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    :goto_1
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_2

    .line 41
    .line 42
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    sub-int/2addr v1, v2

    .line 47
    const/4 v3, 0x0

    .line 48
    invoke-virtual {p0, v3, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    goto :goto_1

    .line 53
    :cond_2
    return-object p0
.end method
