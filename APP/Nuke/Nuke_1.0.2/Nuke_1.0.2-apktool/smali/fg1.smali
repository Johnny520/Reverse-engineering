.class public abstract Lfg1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lom2;


# static fields
.field public static final h:Ljava/lang/Object;

.field public static final i:Lhh1;

.field public static final j:Lyc2;

.field public static final k:Lyc2;

.field public static final l:Lyc2;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lfg1;->h:Ljava/lang/Object;

    .line 7
    .line 8
    new-instance v0, Lhh1;

    .line 9
    .line 10
    const-string v1, "NO_THREAD_ELEMENTS"

    .line 11
    .line 12
    const/16 v2, 0x13

    .line 13
    .line 14
    invoke-direct {v0, v2, v1}, Lhh1;-><init>(ILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lfg1;->i:Lhh1;

    .line 18
    .line 19
    new-instance v0, Lyc2;

    .line 20
    .line 21
    const/16 v1, 0x1a

    .line 22
    .line 23
    invoke-direct {v0, v1}, Lyc2;-><init>(I)V

    .line 24
    .line 25
    .line 26
    sput-object v0, Lfg1;->j:Lyc2;

    .line 27
    .line 28
    new-instance v0, Lyc2;

    .line 29
    .line 30
    const/16 v1, 0x1b

    .line 31
    .line 32
    invoke-direct {v0, v1}, Lyc2;-><init>(I)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lfg1;->k:Lyc2;

    .line 36
    .line 37
    new-instance v0, Lyc2;

    .line 38
    .line 39
    const/16 v1, 0x1c

    .line 40
    .line 41
    invoke-direct {v0, v1}, Lyc2;-><init>(I)V

    .line 42
    .line 43
    .line 44
    sput-object v0, Lfg1;->l:Lyc2;

    .line 45
    .line 46
    return-void
.end method

.method public static final A(Lnn0;)Luh1;
    .locals 1

    .line 1
    new-instance v0, Le61;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Le61;-><init>(Lnn0;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static final C(Luh1;F)Luh1;
    .locals 1

    .line 1
    new-instance v0, Lgw1;

    .line 2
    .line 3
    invoke-direct {v0, p1, p1, p1, p1}, Lgw1;-><init>(FFFF)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, v0}, Luh1;->c(Luh1;)Luh1;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static final D(Luh1;FF)Luh1;
    .locals 1

    .line 1
    new-instance v0, Lgw1;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2, p1, p2}, Lgw1;-><init>(FFFF)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, v0}, Luh1;->c(Luh1;)Luh1;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static E(Luh1;FFI)Luh1;
    .locals 2

    .line 1
    and-int/lit8 v0, p3, 0x1

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move p1, v1

    .line 7
    :cond_0
    and-int/lit8 p3, p3, 0x2

    .line 8
    .line 9
    if-eqz p3, :cond_1

    .line 10
    .line 11
    move p2, v1

    .line 12
    :cond_1
    invoke-static {p0, p1, p2}, Lfg1;->D(Luh1;FF)Luh1;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public static final F(Luh1;FFFF)Luh1;
    .locals 1

    .line 1
    new-instance v0, Lgw1;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2, p3, p4}, Lgw1;-><init>(FFFF)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, v0}, Luh1;->c(Luh1;)Luh1;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static G(Luh1;FFFFI)Luh1;
    .locals 2

    .line 1
    and-int/lit8 v0, p5, 0x1

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move p1, v1

    .line 7
    :cond_0
    and-int/lit8 v0, p5, 0x2

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    move p2, v1

    .line 12
    :cond_1
    and-int/lit8 v0, p5, 0x4

    .line 13
    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    move p3, v1

    .line 17
    :cond_2
    and-int/lit8 p5, p5, 0x8

    .line 18
    .line 19
    if-eqz p5, :cond_3

    .line 20
    .line 21
    move p4, v1

    .line 22
    :cond_3
    invoke-static {p0, p1, p2, p3, p4}, Lfg1;->F(Luh1;FFFF)Luh1;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public static H(Ljava/lang/String;)V
    .locals 3

    .line 1
    :try_start_0
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_4

    .line 5
    const/4 v0, 0x0

    .line 6
    :try_start_1
    invoke-virtual {p0, v0}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0
    :try_end_1
    .catch Ljava/lang/InstantiationException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_0

    .line 14
    new-instance v0, Ljava/lang/RuntimeException;

    .line 15
    .line 16
    new-instance v1, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    const-string v2, "Expected instanceof GlideModule, but found: "

    .line 19
    .line 20
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw v0

    .line 34
    :catch_0
    move-exception v1

    .line 35
    goto :goto_0

    .line 36
    :catch_1
    move-exception v1

    .line 37
    goto :goto_1

    .line 38
    :catch_2
    move-exception v1

    .line 39
    goto :goto_2

    .line 40
    :catch_3
    move-exception v1

    .line 41
    goto :goto_3

    .line 42
    :goto_0
    invoke-static {p0, v1}, Lfg1;->S(Ljava/lang/Class;Ljava/lang/ReflectiveOperationException;)V

    .line 43
    .line 44
    .line 45
    throw v0

    .line 46
    :goto_1
    invoke-static {p0, v1}, Lfg1;->S(Ljava/lang/Class;Ljava/lang/ReflectiveOperationException;)V

    .line 47
    .line 48
    .line 49
    throw v0

    .line 50
    :goto_2
    invoke-static {p0, v1}, Lfg1;->S(Ljava/lang/Class;Ljava/lang/ReflectiveOperationException;)V

    .line 51
    .line 52
    .line 53
    throw v0

    .line 54
    :goto_3
    invoke-static {p0, v1}, Lfg1;->S(Ljava/lang/Class;Ljava/lang/ReflectiveOperationException;)V

    .line 55
    .line 56
    .line 57
    throw v0

    .line 58
    :catch_4
    move-exception p0

    .line 59
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 60
    .line 61
    const-string v1, "Unable to find GlideModule implementation"

    .line 62
    .line 63
    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 64
    .line 65
    .line 66
    throw v0
.end method

.method public static final I(Ljava/lang/String;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "GET"

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-string v0, "HEAD"

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-nez p0, :cond_0

    .line 19
    .line 20
    const/4 p0, 0x1

    .line 21
    return p0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return p0
.end method

.method public static final K(Ljava/util/HashSet;Ljava/util/LinkedHashSet;Ljava/lang/String;Ljava/util/LinkedHashMap;Ljava/util/ArrayList;Ljava/util/Set;Ljava/lang/String;)V
    .locals 11

    .line 1
    move-object/from16 v1, p6

    .line 2
    .line 3
    new-instance v0, Loi2;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Loi2;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    new-instance v0, Loi2;

    .line 16
    .line 17
    invoke-direct {v0, v1}, Loi2;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    sget-object v2, Lsi2;->j:Lsi2;

    .line 25
    .line 26
    if-eqz v0, :cond_9

    .line 27
    .line 28
    new-instance v0, Loi2;

    .line 29
    .line 30
    invoke-direct {v0, v1}, Loi2;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p3, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    move-object v7, v0

    .line 38
    check-cast v7, Lii2;

    .line 39
    .line 40
    if-eqz v7, :cond_8

    .line 41
    .line 42
    sget-object v0, Lig0;->a:Ljava/util/Set;

    .line 43
    .line 44
    iget-object v0, v7, Lii2;->b:Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {v0}, Lig0;->a(Ljava/lang/String;)Ljava/util/List;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 51
    .line 52
    .line 53
    move-result-object v8

    .line 54
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_7

    .line 59
    .line 60
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    move-object v4, v0

    .line 65
    check-cast v4, Ljava/lang/String;

    .line 66
    .line 67
    const-string v0, "nuke:"

    .line 68
    .line 69
    const/4 v5, 0x0

    .line 70
    invoke-static {v4, v0, v5}, Lwv2;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    const-string v6, "\'."

    .line 75
    .line 76
    if-eqz v0, :cond_2

    .line 77
    .line 78
    move-object/from16 v0, p5

    .line 79
    .line 80
    invoke-interface {v0, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v5

    .line 84
    if-eqz v5, :cond_1

    .line 85
    .line 86
    const/4 v4, 0x0

    .line 87
    move-object v9, v1

    .line 88
    move-object v10, v2

    .line 89
    move-object v6, v4

    .line 90
    goto :goto_3

    .line 91
    :cond_1
    new-instance v0, Ldg2;

    .line 92
    .line 93
    const-string p0, "Unknown host module \'"

    .line 94
    .line 95
    invoke-static {p0, v4, v6}, Lvi0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    const/4 v5, 0x0

    .line 100
    const/16 v6, 0x10

    .line 101
    .line 102
    move-object v3, v1

    .line 103
    move-object v1, p2

    .line 104
    invoke-direct/range {v0 .. v6}, Ldg2;-><init>(Ljava/lang/String;Lsi2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;I)V

    .line 105
    .line 106
    .line 107
    throw v0

    .line 108
    :cond_2
    move-object/from16 v0, p5

    .line 109
    .line 110
    move-object v9, v1

    .line 111
    move-object v10, v2

    .line 112
    :try_start_0
    const-string v1, "./"

    .line 113
    .line 114
    invoke-static {v4, v1, v5}, Lwv2;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 115
    .line 116
    .line 117
    move-result v1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    .line 118
    if-nez v1, :cond_4

    .line 119
    .line 120
    :try_start_1
    const-string v1, "../"

    .line 121
    .line 122
    invoke-static {v4, v1, v5}, Lwv2;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    if-eqz v1, :cond_3

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_3
    sget-object v1, Loi2;->i:Lo72;

    .line 130
    .line 131
    invoke-static {v4}, Lxe1;->Y(Ljava/lang/String;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v1
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0

    .line 135
    goto :goto_2

    .line 136
    :catch_0
    move-exception v0

    .line 137
    move-object p0, v0

    .line 138
    move-object v5, p0

    .line 139
    move-object v2, v10

    .line 140
    goto :goto_4

    .line 141
    :cond_4
    :goto_1
    :try_start_2
    invoke-static {v9, v4}, Loi2;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v1
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_1

    .line 145
    :goto_2
    new-instance v2, Loi2;

    .line 146
    .line 147
    invoke-direct {v2, v1}, Loi2;-><init>(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    invoke-interface {p3, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    if-eqz v2, :cond_6

    .line 155
    .line 156
    move-object v6, v1

    .line 157
    :goto_3
    if-eqz v6, :cond_5

    .line 158
    .line 159
    move-object v1, p1

    .line 160
    move-object v2, p2

    .line 161
    move-object v3, p3

    .line 162
    move-object v4, p4

    .line 163
    move-object v5, v0

    .line 164
    move-object v0, p0

    .line 165
    invoke-static/range {v0 .. v6}, Lfg1;->K(Ljava/util/HashSet;Ljava/util/LinkedHashSet;Ljava/lang/String;Ljava/util/LinkedHashMap;Ljava/util/ArrayList;Ljava/util/Set;Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    :cond_5
    move-object v1, v9

    .line 169
    move-object v2, v10

    .line 170
    goto :goto_0

    .line 171
    :cond_6
    new-instance v0, Ldg2;

    .line 172
    .line 173
    const-string p0, "Imported module \'"

    .line 174
    .line 175
    const-string p1, "\' does not exist."

    .line 176
    .line 177
    invoke-static {p0, v4, p1}, Lvi0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v4

    .line 181
    const/4 v5, 0x0

    .line 182
    const/16 v6, 0x10

    .line 183
    .line 184
    move-object v1, p2

    .line 185
    move-object v3, v9

    .line 186
    move-object v2, v10

    .line 187
    invoke-direct/range {v0 .. v6}, Ldg2;-><init>(Ljava/lang/String;Lsi2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;I)V

    .line 188
    .line 189
    .line 190
    throw v0

    .line 191
    :catch_1
    move-exception v0

    .line 192
    move-object v2, v10

    .line 193
    move-object p0, v0

    .line 194
    move-object v5, p0

    .line 195
    :goto_4
    new-instance v0, Ldg2;

    .line 196
    .line 197
    const-string p0, "Invalid module specifier \'"

    .line 198
    .line 199
    invoke-static {p0, v4, v6}, Lvi0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v4

    .line 203
    move-object v1, p2

    .line 204
    move-object/from16 v3, p6

    .line 205
    .line 206
    invoke-direct/range {v0 .. v5}, Ldg2;-><init>(Ljava/lang/String;Lsi2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 207
    .line 208
    .line 209
    throw v0

    .line 210
    :cond_7
    move-object v3, v1

    .line 211
    new-instance p2, Loi2;

    .line 212
    .line 213
    invoke-direct {p2, v3}, Loi2;-><init>(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {p1, p2}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    new-instance p1, Loi2;

    .line 220
    .line 221
    invoke-direct {p1, v3}, Loi2;-><init>(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {p0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    invoke-virtual {p4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    return-void

    .line 231
    :cond_8
    move-object v3, v1

    .line 232
    new-instance v0, Ldg2;

    .line 233
    .line 234
    const/4 v5, 0x0

    .line 235
    const/16 v6, 0x10

    .line 236
    .line 237
    const-string v4, "Imported module does not exist."

    .line 238
    .line 239
    move-object v1, p2

    .line 240
    invoke-direct/range {v0 .. v6}, Ldg2;-><init>(Ljava/lang/String;Lsi2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;I)V

    .line 241
    .line 242
    .line 243
    throw v0

    .line 244
    :cond_9
    move-object v3, v1

    .line 245
    new-instance p0, Loi2;

    .line 246
    .line 247
    invoke-direct {p0, v3}, Loi2;-><init>(Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    invoke-static {p1, p0}, Lnp2;->d0(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 251
    .line 252
    .line 253
    move-result-object v4

    .line 254
    const/4 v8, 0x0

    .line 255
    const/16 v9, 0x3e

    .line 256
    .line 257
    const-string v5, " -> "

    .line 258
    .line 259
    const/4 v6, 0x0

    .line 260
    const/4 v7, 0x0

    .line 261
    invoke-static/range {v4 .. v9}, Ldu;->u0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lin0;I)Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object p0

    .line 265
    new-instance v0, Ldg2;

    .line 266
    .line 267
    const-string p1, "Circular module dependency is not supported: "

    .line 268
    .line 269
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v4

    .line 273
    const/4 v5, 0x0

    .line 274
    const/16 v6, 0x10

    .line 275
    .line 276
    move-object v1, p2

    .line 277
    invoke-direct/range {v0 .. v6}, Ldg2;-><init>(Ljava/lang/String;Lsi2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;I)V

    .line 278
    .line 279
    .line 280
    throw v0
.end method

.method public static final L(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    instance-of v0, p0, Lov;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Lov;

    .line 6
    .line 7
    iget-object p0, p0, Lov;->a:Ljava/lang/Throwable;

    .line 8
    .line 9
    invoke-static {p0}, Lfg1;->s(Ljava/lang/Throwable;)Lx92;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    :cond_0
    return-object p0
.end method

.method public static final M(La20;Ljava/lang/Object;)V
    .locals 3

    .line 1
    sget-object v0, Lfg1;->i:Lhh1;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    instance-of v0, p1, Ld23;

    .line 7
    .line 8
    if-eqz v0, :cond_3

    .line 9
    .line 10
    check-cast p1, Ld23;

    .line 11
    .line 12
    iget-object p0, p1, Ld23;->c:[La33;

    .line 13
    .line 14
    array-length v0, p0

    .line 15
    add-int/lit8 v0, v0, -0x1

    .line 16
    .line 17
    if-ltz v0, :cond_2

    .line 18
    .line 19
    :goto_0
    add-int/lit8 v1, v0, -0x1

    .line 20
    .line 21
    aget-object v2, p0, v0

    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iget-object v2, p1, Ld23;->b:[Ljava/lang/Object;

    .line 27
    .line 28
    aget-object v0, v2, v0

    .line 29
    .line 30
    check-cast v0, La83;

    .line 31
    .line 32
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 33
    .line 34
    .line 35
    if-gez v1, :cond_1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    move v0, v1

    .line 39
    goto :goto_0

    .line 40
    :cond_2
    :goto_1
    return-void

    .line 41
    :cond_3
    const/4 v0, 0x0

    .line 42
    sget-object v1, Lfg1;->k:Lyc2;

    .line 43
    .line 44
    invoke-interface {p0, v1, v0}, La20;->r(Lmn0;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    check-cast p0, La33;

    .line 52
    .line 53
    check-cast p1, La83;

    .line 54
    .line 55
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public static N(Luh1;Ld91;Lqv1;Ls8;ZLn50;Lbk1;)Luh1;
    .locals 8

    .line 1
    sget-object v0, Lqv1;->h:Lqv1;

    .line 2
    .line 3
    sget-object v1, Lrh1;->a:Lrh1;

    .line 4
    .line 5
    if-ne p2, v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Liu0;->c:Liu0;

    .line 8
    .line 9
    invoke-static {v1, v0}, Lci0;->z(Luh1;Leq2;)Luh1;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    sget-object v0, Liu0;->b:Liu0;

    .line 15
    .line 16
    invoke-static {v1, v0}, Lci0;->z(Luh1;Leq2;)Luh1;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    :goto_0
    invoke-interface {p0, v0}, Luh1;->c(Luh1;)Luh1;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    new-instance v0, Lol2;

    .line 25
    .line 26
    const/4 v7, 0x0

    .line 27
    move-object v5, p1

    .line 28
    move-object v4, p2

    .line 29
    move-object v1, p3

    .line 30
    move v6, p4

    .line 31
    move-object v2, p5

    .line 32
    move-object v3, p6

    .line 33
    invoke-direct/range {v0 .. v7}, Lol2;-><init>(Ls8;Ln50;Lbk1;Lqv1;Lbm2;ZZ)V

    .line 34
    .line 35
    .line 36
    invoke-interface {p0, v0}, Luh1;->c(Luh1;)Luh1;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0
.end method

.method public static O(Luh1;FLeq2;I)Luh1;
    .locals 10

    .line 1
    and-int/lit8 p3, p3, 0x4

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x0

    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    invoke-static {p1, v1}, Lza0;->a(FF)I

    .line 8
    .line 9
    .line 10
    move-result p3

    .line 11
    if-lez p3, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    :cond_0
    move v5, v0

    .line 15
    sget-wide v6, Ltq0;->a:J

    .line 16
    .line 17
    invoke-static {p1, v1}, Lza0;->a(FF)I

    .line 18
    .line 19
    .line 20
    move-result p3

    .line 21
    if-gtz p3, :cond_2

    .line 22
    .line 23
    if-eqz v5, :cond_1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    return-object p0

    .line 27
    :cond_2
    :goto_0
    new-instance v2, Lcq2;

    .line 28
    .line 29
    move-wide v8, v6

    .line 30
    move v3, p1

    .line 31
    move-object v4, p2

    .line 32
    invoke-direct/range {v2 .. v9}, Lcq2;-><init>(FLeq2;ZJJ)V

    .line 33
    .line 34
    .line 35
    invoke-interface {p0, v2}, Luh1;->c(Luh1;)Luh1;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0
.end method

.method public static final P(FJ)J
    .locals 5

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    shr-long v1, p1, v0

    .line 4
    .line 5
    long-to-int v1, v1

    .line 6
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    sub-float/2addr v1, p0

    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-static {v2, v1}, Ljava/lang/Math;->max(FF)F

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const-wide v3, 0xffffffffL

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    and-long/2addr p1, v3

    .line 22
    long-to-int p1, p1

    .line 23
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    sub-float/2addr p1, p0

    .line 28
    invoke-static {v2, p1}, Ljava/lang/Math;->max(FF)F

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    int-to-long p1, p1

    .line 37
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    int-to-long v1, p0

    .line 42
    shl-long p0, p1, v0

    .line 43
    .line 44
    and-long v0, v1, v3

    .line 45
    .line 46
    or-long/2addr p0, v0

    .line 47
    return-wide p0
.end method

.method public static Q(Ljava/lang/Throwable;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/io/StringWriter;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v1, Ljava/io/PrintWriter;

    .line 10
    .line 11
    invoke-direct {v1, v0}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v1}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/io/PrintWriter;->flush()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    return-object p0
.end method

.method public static final R(La20;)Ljava/lang/Object;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    sget-object v1, Lfg1;->j:Lyc2;

    .line 7
    .line 8
    invoke-interface {p0, v1, v0}, La20;->r(Lmn0;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public static S(Ljava/lang/Class;Ljava/lang/ReflectiveOperationException;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/RuntimeException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "Unable to instantiate GlideModule implementation for "

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-direct {v0, p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 18
    .line 19
    .line 20
    throw v0
.end method

.method public static final T(Ljava/lang/Object;)V
    .locals 1

    .line 1
    instance-of v0, p0, Lx92;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    check-cast p0, Lx92;

    .line 7
    .line 8
    iget-object p0, p0, Lx92;->h:Ljava/lang/Throwable;

    .line 9
    .line 10
    throw p0
.end method

.method public static U(J)Ljava/lang/String;
    .locals 4

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    shr-long v0, p0, v0

    .line 4
    .line 5
    long-to-int v0, v0

    .line 6
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const-wide v2, 0xffffffffL

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    and-long/2addr p0, v2

    .line 16
    long-to-int p0, p0

    .line 17
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    cmpg-float p1, v1, p1

    .line 22
    .line 23
    const/16 v1, 0x29

    .line 24
    .line 25
    if-nez p1, :cond_0

    .line 26
    .line 27
    new-instance p0, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    const-string p1, "CornerRadius.circular("

    .line 30
    .line 31
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    invoke-static {p1}, Lt11;->X(F)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0

    .line 53
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    const-string v2, "CornerRadius.elliptical("

    .line 56
    .line 57
    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    invoke-static {v0}, Lt11;->X(F)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const-string v0, ", "

    .line 72
    .line 73
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 77
    .line 78
    .line 79
    move-result p0

    .line 80
    invoke-static {p0}, Lt11;->X(F)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    return-object p0
.end method

.method public static final V(La20;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-static {p0}, Lfg1;->R(La20;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-ne p1, v0, :cond_1

    .line 13
    .line 14
    sget-object p0, Lfg1;->i:Lhh1;

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_1
    instance-of v0, p1, Ljava/lang/Integer;

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    new-instance v0, Ld23;

    .line 22
    .line 23
    check-cast p1, Ljava/lang/Number;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    invoke-direct {v0, p1, p0}, Ld23;-><init>(ILa20;)V

    .line 30
    .line 31
    .line 32
    sget-object p1, Lfg1;->l:Lyc2;

    .line 33
    .line 34
    invoke-interface {p0, p1, v0}, La20;->r(Lmn0;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :cond_2
    check-cast p1, La33;

    .line 40
    .line 41
    const/4 p0, 0x0

    .line 42
    invoke-static {p0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    sget-object p0, La83;->a:La83;

    .line 46
    .line 47
    return-object p0
.end method

.method public static a(IILhn;)Ljn;
    .locals 3

    .line 1
    and-int/lit8 v0, p1, 0x1

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move p0, v1

    .line 7
    :cond_0
    and-int/lit8 p1, p1, 0x2

    .line 8
    .line 9
    sget-object v0, Lhn;->h:Lhn;

    .line 10
    .line 11
    if-eqz p1, :cond_1

    .line 12
    .line 13
    move-object p2, v0

    .line 14
    :cond_1
    const/4 p1, -0x2

    .line 15
    const/4 v2, 0x1

    .line 16
    if-eq p0, p1, :cond_8

    .line 17
    .line 18
    const/4 p1, -0x1

    .line 19
    if-eq p0, p1, :cond_6

    .line 20
    .line 21
    if-eqz p0, :cond_4

    .line 22
    .line 23
    const p1, 0x7fffffff

    .line 24
    .line 25
    .line 26
    if-eq p0, p1, :cond_3

    .line 27
    .line 28
    if-ne p2, v0, :cond_2

    .line 29
    .line 30
    new-instance p1, Ljn;

    .line 31
    .line 32
    invoke-direct {p1, p0}, Ljn;-><init>(I)V

    .line 33
    .line 34
    .line 35
    return-object p1

    .line 36
    :cond_2
    new-instance p1, Lpy;

    .line 37
    .line 38
    invoke-direct {p1, p0, p2}, Lpy;-><init>(ILhn;)V

    .line 39
    .line 40
    .line 41
    return-object p1

    .line 42
    :cond_3
    new-instance p0, Ljn;

    .line 43
    .line 44
    invoke-direct {p0, p1}, Ljn;-><init>(I)V

    .line 45
    .line 46
    .line 47
    return-object p0

    .line 48
    :cond_4
    if-ne p2, v0, :cond_5

    .line 49
    .line 50
    new-instance p0, Ljn;

    .line 51
    .line 52
    invoke-direct {p0, v1}, Ljn;-><init>(I)V

    .line 53
    .line 54
    .line 55
    return-object p0

    .line 56
    :cond_5
    new-instance p0, Lpy;

    .line 57
    .line 58
    invoke-direct {p0, v2, p2}, Lpy;-><init>(ILhn;)V

    .line 59
    .line 60
    .line 61
    return-object p0

    .line 62
    :cond_6
    if-ne p2, v0, :cond_7

    .line 63
    .line 64
    new-instance p0, Lpy;

    .line 65
    .line 66
    sget-object p1, Lhn;->i:Lhn;

    .line 67
    .line 68
    invoke-direct {p0, v2, p1}, Lpy;-><init>(ILhn;)V

    .line 69
    .line 70
    .line 71
    return-object p0

    .line 72
    :cond_7
    const-string p0, "CONFLATED capacity cannot be used with non-default onBufferOverflow"

    .line 73
    .line 74
    invoke-static {p0}, Ls;->j(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    const/4 p0, 0x0

    .line 78
    return-object p0

    .line 79
    :cond_8
    if-ne p2, v0, :cond_9

    .line 80
    .line 81
    new-instance p0, Ljn;

    .line 82
    .line 83
    sget-object p1, Lfq;->b:Leq;

    .line 84
    .line 85
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    sget p1, Leq;->b:I

    .line 89
    .line 90
    invoke-direct {p0, p1}, Ljn;-><init>(I)V

    .line 91
    .line 92
    .line 93
    return-object p0

    .line 94
    :cond_9
    new-instance p0, Lpy;

    .line 95
    .line 96
    invoke-direct {p0, v2, p2}, Lpy;-><init>(ILhn;)V

    .line 97
    .line 98
    .line 99
    return-object p0
.end method

.method public static final d(Ljava/lang/String;Lxm0;Lpx;I)V
    .locals 11

    .line 1
    move-object v7, p2

    .line 2
    check-cast v7, Lgo0;

    .line 3
    .line 4
    const p2, -0x12289aa9

    .line 5
    .line 6
    .line 7
    invoke-virtual {v7, p2}, Lgo0;->X(I)Lgo0;

    .line 8
    .line 9
    .line 10
    and-int/lit8 p2, p3, 0x6

    .line 11
    .line 12
    const/4 v10, 0x4

    .line 13
    const/4 v0, 0x2

    .line 14
    if-nez p2, :cond_1

    .line 15
    .line 16
    invoke-virtual {v7, p0}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    if-eqz p2, :cond_0

    .line 21
    .line 22
    move p2, v10

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move p2, v0

    .line 25
    :goto_0
    or-int/2addr p2, p3

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    move p2, p3

    .line 28
    :goto_1
    and-int/lit8 v1, p3, 0x30

    .line 29
    .line 30
    if-nez v1, :cond_3

    .line 31
    .line 32
    invoke-virtual {v7, p1}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    const/16 v1, 0x20

    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_2
    const/16 v1, 0x10

    .line 42
    .line 43
    :goto_2
    or-int/2addr p2, v1

    .line 44
    :cond_3
    and-int/lit8 v1, p2, 0x13

    .line 45
    .line 46
    const/16 v2, 0x12

    .line 47
    .line 48
    if-eq v1, v2, :cond_4

    .line 49
    .line 50
    const/4 v1, 0x1

    .line 51
    goto :goto_3

    .line 52
    :cond_4
    const/4 v1, 0x0

    .line 53
    :goto_3
    and-int/lit8 v2, p2, 0x1

    .line 54
    .line 55
    invoke-virtual {v7, v2, v1}, Lgo0;->O(IZ)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-eqz v1, :cond_5

    .line 60
    .line 61
    const v1, 0x790b0103

    .line 62
    .line 63
    .line 64
    invoke-static {v1, v7}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    new-instance v1, Lk0;

    .line 69
    .line 70
    invoke-direct {v1, p1, v0}, Lk0;-><init>(Lxm0;I)V

    .line 71
    .line 72
    .line 73
    const v2, -0x30e6a04c

    .line 74
    .line 75
    .line 76
    invoke-static {v2, v1, v7}, Lxe1;->i0(ILun0;Lpx;)Lkw;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    new-instance v1, Lx1;

    .line 81
    .line 82
    invoke-direct {v1, p0, v0}, Lx1;-><init>(Ljava/lang/String;I)V

    .line 83
    .line 84
    .line 85
    const v0, 0x1b9011ab

    .line 86
    .line 87
    .line 88
    invoke-static {v0, v1, v7}, Lxe1;->i0(ILun0;Lpx;)Lkw;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    and-int/lit8 p2, p2, 0x70

    .line 93
    .line 94
    const v0, 0x1b0006

    .line 95
    .line 96
    .line 97
    or-int v8, p2, v0

    .line 98
    .line 99
    const/16 v9, 0x14

    .line 100
    .line 101
    const/4 v0, 0x1

    .line 102
    const/4 v2, 0x0

    .line 103
    const/4 v4, 0x0

    .line 104
    move-object v1, p1

    .line 105
    invoke-static/range {v0 .. v9}, Lqp0;->d(ZLxm0;Luh1;Ljava/lang/String;Ln80;Lnn0;Lkw;Lpx;II)V

    .line 106
    .line 107
    .line 108
    goto :goto_4

    .line 109
    :cond_5
    move-object v1, p1

    .line 110
    invoke-virtual {v7}, Lgo0;->R()V

    .line 111
    .line 112
    .line 113
    :goto_4
    invoke-virtual {v7}, Lgo0;->r()Lb62;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    if-eqz p1, :cond_6

    .line 118
    .line 119
    new-instance p2, Lup;

    .line 120
    .line 121
    invoke-direct {p2, p3, v10, p0, v1}, Lup;-><init>(IILjava/lang/Object;Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    iput-object p2, p1, Lb62;->d:Lmn0;

    .line 125
    .line 126
    :cond_6
    return-void
.end method

.method public static final e(Landroid/window/BackEvent;)Lem1;
    .locals 7

    .line 1
    invoke-static {p0}, Lzr0;->a(Landroid/window/BackEvent;)F

    .line 2
    .line 3
    .line 4
    move-result v3

    .line 5
    invoke-static {p0}, Lzr0;->p(Landroid/window/BackEvent;)F

    .line 6
    .line 7
    .line 8
    move-result v4

    .line 9
    invoke-static {p0}, Lzr0;->s(Landroid/window/BackEvent;)F

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-static {p0}, Lzr0;->d(Landroid/window/BackEvent;)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 18
    .line 19
    const/16 v5, 0x24

    .line 20
    .line 21
    if-lt v0, v5, :cond_0

    .line 22
    .line 23
    invoke-static {p0}, Lpn;->b(Landroid/window/BackEvent;)J

    .line 24
    .line 25
    .line 26
    move-result-wide v5

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const-wide/16 v5, 0x0

    .line 29
    .line 30
    :goto_0
    new-instance v0, Lem1;

    .line 31
    .line 32
    invoke-direct/range {v0 .. v6}, Lem1;-><init>(IFFFJ)V

    .line 33
    .line 34
    .line 35
    return-object v0
.end method

.method public static final f(Lxm0;Lin0;Lpx;I)V
    .locals 10

    .line 1
    move-object v7, p2

    .line 2
    check-cast v7, Lgo0;

    .line 3
    .line 4
    const p2, -0x61bf792d

    .line 5
    .line 6
    .line 7
    invoke-virtual {v7, p2}, Lgo0;->X(I)Lgo0;

    .line 8
    .line 9
    .line 10
    and-int/lit8 p2, p3, 0x6

    .line 11
    .line 12
    if-nez p2, :cond_1

    .line 13
    .line 14
    invoke-virtual {v7, p0}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    if-eqz p2, :cond_0

    .line 19
    .line 20
    const/4 p2, 0x4

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 p2, 0x2

    .line 23
    :goto_0
    or-int/2addr p2, p3

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    move p2, p3

    .line 26
    :goto_1
    and-int/lit8 v0, p3, 0x30

    .line 27
    .line 28
    if-nez v0, :cond_3

    .line 29
    .line 30
    invoke-virtual {v7, p1}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    const/16 v0, 0x20

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_2
    const/16 v0, 0x10

    .line 40
    .line 41
    :goto_2
    or-int/2addr p2, v0

    .line 42
    :cond_3
    and-int/lit8 v0, p2, 0x13

    .line 43
    .line 44
    const/16 v1, 0x12

    .line 45
    .line 46
    const/4 v2, 0x1

    .line 47
    if-eq v0, v1, :cond_4

    .line 48
    .line 49
    move v0, v2

    .line 50
    goto :goto_3

    .line 51
    :cond_4
    const/4 v0, 0x0

    .line 52
    :goto_3
    and-int/lit8 v1, p2, 0x1

    .line 53
    .line 54
    invoke-virtual {v7, v1, v0}, Lgo0;->O(IZ)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_6

    .line 59
    .line 60
    invoke-virtual {v7}, Lgo0;->L()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    sget-object v1, Lnx;->a:Leb;

    .line 65
    .line 66
    if-ne v0, v1, :cond_5

    .line 67
    .line 68
    const-string v0, ""

    .line 69
    .line 70
    invoke-static {v0}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {v7, v0}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    :cond_5
    check-cast v0, Lxk1;

    .line 78
    .line 79
    invoke-interface {v0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    check-cast v1, Ljava/lang/String;

    .line 84
    .line 85
    invoke-static {v1}, Lpv2;->I0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    const v3, 0x790b01e0

    .line 94
    .line 95
    .line 96
    invoke-static {v3, v7}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    new-instance v4, Ltr;

    .line 101
    .line 102
    const/4 v5, 0x6

    .line 103
    invoke-direct {v4, v5, p0, p1, v1}, Ltr;-><init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    const v1, 0x36ed5df0

    .line 107
    .line 108
    .line 109
    invoke-static {v1, v4, v7}, Lxe1;->i0(ILun0;Lpx;)Lkw;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    new-instance v1, Ly30;

    .line 114
    .line 115
    invoke-direct {v1, v0, v2}, Ly30;-><init>(Lxk1;I)V

    .line 116
    .line 117
    .line 118
    const v0, 0x407f6e27

    .line 119
    .line 120
    .line 121
    invoke-static {v0, v1, v7}, Lxe1;->i0(ILun0;Lpx;)Lkw;

    .line 122
    .line 123
    .line 124
    move-result-object v6

    .line 125
    shl-int/lit8 p2, p2, 0x3

    .line 126
    .line 127
    and-int/lit8 p2, p2, 0x70

    .line 128
    .line 129
    const v0, 0x1b0006

    .line 130
    .line 131
    .line 132
    or-int v8, p2, v0

    .line 133
    .line 134
    const/16 v9, 0x14

    .line 135
    .line 136
    const/4 v0, 0x1

    .line 137
    const/4 v2, 0x0

    .line 138
    const/4 v4, 0x0

    .line 139
    move-object v1, p0

    .line 140
    invoke-static/range {v0 .. v9}, Lqp0;->d(ZLxm0;Luh1;Ljava/lang/String;Ln80;Lnn0;Lkw;Lpx;II)V

    .line 141
    .line 142
    .line 143
    goto :goto_4

    .line 144
    :cond_6
    move-object v1, p0

    .line 145
    invoke-virtual {v7}, Lgo0;->R()V

    .line 146
    .line 147
    .line 148
    :goto_4
    invoke-virtual {v7}, Lgo0;->r()Lb62;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    if-eqz p0, :cond_7

    .line 153
    .line 154
    new-instance p2, Lup;

    .line 155
    .line 156
    const/4 v0, 0x7

    .line 157
    invoke-direct {p2, p3, v0, v1, p1}, Lup;-><init>(IILjava/lang/Object;Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    iput-object p2, p0, Lb62;->d:Lmn0;

    .line 161
    .line 162
    :cond_7
    return-void
.end method

.method public static g(I)Ljw1;
    .locals 2

    .line 1
    and-int/lit8 p0, p0, 0x2

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    move p0, v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/high16 p0, 0x40c00000    # 6.0f

    .line 9
    .line 10
    :goto_0
    new-instance v1, Ljw1;

    .line 11
    .line 12
    invoke-direct {v1, v0, p0, v0, p0}, Ljw1;-><init>(FFFF)V

    .line 13
    .line 14
    .line 15
    return-object v1
.end method

.method public static h()Ljw1;
    .locals 4

    .line 1
    new-instance v0, Ljw1;

    .line 2
    .line 3
    const/high16 v1, 0x41900000    # 18.0f

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/high16 v3, 0x41a00000    # 20.0f

    .line 7
    .line 8
    invoke-direct {v0, v1, v2, v1, v3}, Ljw1;-><init>(FFFF)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public static final i(II)J
    .locals 4

    .line 1
    if-ltz p0, :cond_0

    .line 2
    .line 3
    if-ltz p1, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    const-string v1, "start and end cannot be negative. [start: "

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, ", end: "

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const/16 v1, 0x5d

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-static {v0}, Llz0;->a(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    :goto_0
    int-to-long v0, p0

    .line 37
    const/16 p0, 0x20

    .line 38
    .line 39
    shl-long/2addr v0, p0

    .line 40
    int-to-long p0, p1

    .line 41
    const-wide v2, 0xffffffffL

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    and-long/2addr p0, v2

    .line 47
    or-long/2addr p0, v0

    .line 48
    sget v0, Lf13;->c:I

    .line 49
    .line 50
    return-wide p0
.end method

.method public static final j(Ll4;Lqn2;)V
    .locals 3

    .line 1
    invoke-static {p1}, Lrg3;->j(Lqn2;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-object p1, p1, Lqn2;->d:Lln2;

    .line 8
    .line 9
    sget-object v0, Lkn2;->i:Lyn2;

    .line 10
    .line 11
    iget-object p1, p1, Lln2;->h:Lrk1;

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const/4 v0, 0x0

    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    move-object p1, v0

    .line 21
    :cond_0
    check-cast p1, Lq3;

    .line 22
    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    new-instance v1, Lf4;

    .line 26
    .line 27
    const v2, 0x102003d

    .line 28
    .line 29
    .line 30
    iget-object p1, p1, Lq3;->a:Ljava/lang/String;

    .line 31
    .line 32
    invoke-direct {v1, v0, v2, p1, v0}, Lf4;-><init>(Ljava/lang/Object;ILjava/lang/CharSequence;Ljava/lang/Class;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, v1}, Ll4;->a(Lf4;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    return-void
.end method

.method public static m(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    if-eq p0, p1, :cond_3

    .line 8
    .line 9
    sget-object v0, Lh21;->a:Ljava/lang/Integer;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/16 v1, 0x13

    .line 18
    .line 19
    if-lt v0, v1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 25
    :goto_1
    if-eqz v0, :cond_2

    .line 26
    .line 27
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_2
    sget-object v0, Lc02;->a:Ljava/lang/reflect/Method;

    .line 32
    .line 33
    if-eqz v0, :cond_3

    .line 34
    .line 35
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {v0, p0, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    :cond_3
    return-void
.end method

.method public static final n(Luh1;Lom;)Luh1;
    .locals 1

    .line 1
    new-instance v0, Lmm;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lmm;-><init>(Lom;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, v0}, Luh1;->c(Luh1;)Luh1;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static o(Ljava/lang/String;Z)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-static {p0}, Ls;->j(Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public static p(Ljava/lang/Object;)V
    .locals 1

    .line 1
    const-string v0, "Argument must not be null"

    .line 2
    .line 3
    invoke-static {v0, p0}, Lfg1;->q(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static q(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-static {p0}, Lum2;->f(Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public static final r(JI)J
    .locals 5

    .line 1
    sget v0, Lf13;->c:I

    .line 2
    .line 3
    const/16 v0, 0x20

    .line 4
    .line 5
    shr-long v0, p0, v0

    .line 6
    .line 7
    long-to-int v0, v0

    .line 8
    const/4 v1, 0x0

    .line 9
    if-gez v0, :cond_0

    .line 10
    .line 11
    move v2, v1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v2, v0

    .line 14
    :goto_0
    if-le v2, p2, :cond_1

    .line 15
    .line 16
    move v2, p2

    .line 17
    :cond_1
    const-wide v3, 0xffffffffL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    and-long/2addr v3, p0

    .line 23
    long-to-int v3, v3

    .line 24
    if-gez v3, :cond_2

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_2
    move v1, v3

    .line 28
    :goto_1
    if-le v1, p2, :cond_3

    .line 29
    .line 30
    goto :goto_2

    .line 31
    :cond_3
    move p2, v1

    .line 32
    :goto_2
    if-ne v2, v0, :cond_5

    .line 33
    .line 34
    if-eq p2, v3, :cond_4

    .line 35
    .line 36
    goto :goto_3

    .line 37
    :cond_4
    return-wide p0

    .line 38
    :cond_5
    :goto_3
    invoke-static {v2, p2}, Lfg1;->i(II)J

    .line 39
    .line 40
    .line 41
    move-result-wide p0

    .line 42
    return-wide p0
.end method

.method public static final s(Ljava/lang/Throwable;)Lx92;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lx92;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public static final t(JJ)Z
    .locals 0

    .line 1
    cmp-long p0, p0, p2

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public static final u(Ljava/lang/CharSequence;I)I
    .locals 3

    .line 1
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    :goto_0
    if-ge p1, v0, :cond_1

    .line 6
    .line 7
    invoke-interface {p0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/16 v2, 0xa

    .line 12
    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    return p1

    .line 16
    :cond_0
    add-int/lit8 p1, p1, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0
.end method

.method public static final v(Ljava/lang/CharSequence;I)I
    .locals 2

    .line 1
    :goto_0
    if-lez p1, :cond_1

    .line 2
    .line 3
    add-int/lit8 v0, p1, -0x1

    .line 4
    .line 5
    invoke-interface {p0, v0}, Ljava/lang/CharSequence;->charAt(I)C

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/16 v1, 0xa

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    return p1

    .line 14
    :cond_0
    add-int/lit8 p1, p1, -0x1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    const/4 p0, 0x0

    .line 18
    return p0
.end method

.method public static final w(Lgl0;)Luh1;
    .locals 1

    .line 1
    new-instance v0, Lhl0;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lhl0;-><init>(Lgl0;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static x(Lorg/luckypray/dexkit/DexKitBridge;Lb;)Lwd;
    .locals 10

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x4

    .line 10
    invoke-virtual {p1, v1}, Lox2;->b(I)I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const/4 v3, 0x0

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1, v2}, Lox2;->f(I)I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v2, v3

    .line 23
    :goto_0
    move v4, v3

    .line 24
    :goto_1
    if-ge v4, v2, :cond_e

    .line 25
    .line 26
    new-instance v5, La;

    .line 27
    .line 28
    invoke-direct {v5}, Lox2;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, v1}, Lox2;->b(I)I

    .line 32
    .line 33
    .line 34
    move-result v6

    .line 35
    const/4 v7, 0x0

    .line 36
    if-eqz v6, :cond_1

    .line 37
    .line 38
    invoke-virtual {p1, v6}, Lox2;->e(I)I

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    mul-int/lit8 v8, v4, 0x4

    .line 43
    .line 44
    add-int/2addr v8, v6

    .line 45
    invoke-virtual {p1, v8}, Lox2;->a(I)I

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    iget-object v8, p1, Lox2;->b:Ljava/nio/ByteBuffer;

    .line 50
    .line 51
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v5, v6, v8}, Lox2;->c(ILjava/nio/ByteBuffer;)V

    .line 55
    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_1
    move-object v5, v7

    .line 59
    :goto_2
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    const/4 v6, 0x6

    .line 63
    invoke-virtual {v5, v6}, Lox2;->b(I)I

    .line 64
    .line 65
    .line 66
    move-result v6

    .line 67
    if-eqz v6, :cond_2

    .line 68
    .line 69
    iget-object v8, v5, Lox2;->b:Ljava/nio/ByteBuffer;

    .line 70
    .line 71
    iget v9, v5, Lox2;->a:I

    .line 72
    .line 73
    add-int/2addr v6, v9

    .line 74
    invoke-virtual {v8, v6}, Ljava/nio/ByteBuffer;->get(I)B

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    goto :goto_3

    .line 79
    :cond_2
    move v6, v3

    .line 80
    :goto_3
    invoke-static {v6}, Lxe1;->t(B)I

    .line 81
    .line 82
    .line 83
    move-result v6

    .line 84
    invoke-static {v6}, Lvi0;->u(I)I

    .line 85
    .line 86
    .line 87
    move-result v8

    .line 88
    packed-switch v8, :pswitch_data_0

    .line 89
    .line 90
    .line 91
    invoke-static {}, Lc80;->s()V

    .line 92
    .line 93
    .line 94
    return-object v7

    .line 95
    :pswitch_0
    new-instance v7, Lg;

    .line 96
    .line 97
    invoke-direct {v7}, Lox2;-><init>()V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v5, v7}, La;->k(Lox2;)Lox2;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    check-cast v5, Lg;

    .line 108
    .line 109
    invoke-virtual {v5, v1}, Lox2;->b(I)I

    .line 110
    .line 111
    .line 112
    move-result v7

    .line 113
    if-eqz v7, :cond_3

    .line 114
    .line 115
    iget-object v8, v5, Lox2;->b:Ljava/nio/ByteBuffer;

    .line 116
    .line 117
    iget v5, v5, Lox2;->a:I

    .line 118
    .line 119
    add-int/2addr v7, v5

    .line 120
    invoke-virtual {v8, v7}, Ljava/nio/ByteBuffer;->get(I)B

    .line 121
    .line 122
    .line 123
    move-result v5

    .line 124
    if-eqz v5, :cond_3

    .line 125
    .line 126
    const/4 v5, 0x1

    .line 127
    goto :goto_4

    .line 128
    :cond_3
    move v5, v3

    .line 129
    :goto_4
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 130
    .line 131
    .line 132
    move-result-object v5

    .line 133
    goto/16 :goto_10

    .line 134
    .line 135
    :pswitch_1
    new-instance v7, Ln;

    .line 136
    .line 137
    invoke-direct {v7}, Lox2;-><init>()V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v5, v7}, La;->k(Lox2;)Lox2;

    .line 141
    .line 142
    .line 143
    move-result-object v5

    .line 144
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    check-cast v5, Ln;

    .line 148
    .line 149
    goto/16 :goto_10

    .line 150
    .line 151
    :pswitch_2
    new-instance v7, Lc;

    .line 152
    .line 153
    invoke-direct {v7}, Lox2;-><init>()V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v5, v7}, La;->k(Lox2;)Lox2;

    .line 157
    .line 158
    .line 159
    move-result-object v5

    .line 160
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    check-cast v5, Lc;

    .line 164
    .line 165
    invoke-static {p0, v5}, Lgf1;->t(Lorg/luckypray/dexkit/DexKitBridge;Lc;)Lud;

    .line 166
    .line 167
    .line 168
    move-result-object v5

    .line 169
    goto/16 :goto_10

    .line 170
    .line 171
    :pswitch_3
    new-instance v7, Lb;

    .line 172
    .line 173
    invoke-direct {v7}, Lox2;-><init>()V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v5, v7}, La;->k(Lox2;)Lox2;

    .line 177
    .line 178
    .line 179
    move-result-object v5

    .line 180
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    check-cast v5, Lb;

    .line 184
    .line 185
    invoke-static {p0, v5}, Lfg1;->x(Lorg/luckypray/dexkit/DexKitBridge;Lb;)Lwd;

    .line 186
    .line 187
    .line 188
    move-result-object v5

    .line 189
    goto/16 :goto_10

    .line 190
    .line 191
    :pswitch_4
    new-instance v7, Lq;

    .line 192
    .line 193
    invoke-direct {v7}, Lox2;-><init>()V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v5, v7}, La;->k(Lox2;)Lox2;

    .line 197
    .line 198
    .line 199
    move-result-object v5

    .line 200
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    check-cast v5, Lq;

    .line 204
    .line 205
    invoke-static {p0, v5}, Lse;->B(Lorg/luckypray/dexkit/DexKitBridge;Lq;)Lji0;

    .line 206
    .line 207
    .line 208
    move-result-object v5

    .line 209
    goto/16 :goto_10

    .line 210
    .line 211
    :pswitch_5
    new-instance v7, Lr;

    .line 212
    .line 213
    invoke-direct {v7}, Lox2;-><init>()V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v5, v7}, La;->k(Lox2;)Lox2;

    .line 217
    .line 218
    .line 219
    move-result-object v5

    .line 220
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 221
    .line 222
    .line 223
    check-cast v5, Lr;

    .line 224
    .line 225
    invoke-static {p0, v5}, Lp40;->t(Lorg/luckypray/dexkit/DexKitBridge;Lr;)Lug1;

    .line 226
    .line 227
    .line 228
    move-result-object v5

    .line 229
    goto/16 :goto_10

    .line 230
    .line 231
    :pswitch_6
    new-instance v7, Lf;

    .line 232
    .line 233
    invoke-direct {v7}, Lox2;-><init>()V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v5, v7}, La;->k(Lox2;)Lox2;

    .line 237
    .line 238
    .line 239
    move-result-object v5

    .line 240
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 241
    .line 242
    .line 243
    check-cast v5, Lf;

    .line 244
    .line 245
    invoke-static {p0, v5}, Ltl;->z(Lorg/luckypray/dexkit/DexKitBridge;Lf;)Lus;

    .line 246
    .line 247
    .line 248
    move-result-object v5

    .line 249
    goto/16 :goto_10

    .line 250
    .line 251
    :pswitch_7
    new-instance v8, Lp;

    .line 252
    .line 253
    invoke-direct {v8}, Lox2;-><init>()V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v5, v8}, La;->k(Lox2;)Lox2;

    .line 257
    .line 258
    .line 259
    move-result-object v5

    .line 260
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 261
    .line 262
    .line 263
    check-cast v5, Lp;

    .line 264
    .line 265
    :try_start_0
    invoke-virtual {v5, v1}, Lox2;->b(I)I

    .line 266
    .line 267
    .line 268
    move-result v8

    .line 269
    if-eqz v8, :cond_4

    .line 270
    .line 271
    iget v9, v5, Lox2;->a:I

    .line 272
    .line 273
    add-int/2addr v8, v9

    .line 274
    invoke-virtual {v5, v8}, Lox2;->d(I)Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v8

    .line 278
    goto :goto_5

    .line 279
    :cond_4
    move-object v8, v7

    .line 280
    :goto_5
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 281
    .line 282
    .line 283
    move-object v5, v8

    .line 284
    goto/16 :goto_10

    .line 285
    .line 286
    :catch_0
    :try_start_1
    invoke-virtual {v5, v1}, Lox2;->b(I)I

    .line 287
    .line 288
    .line 289
    move-result v8

    .line 290
    if-nez v8, :cond_5

    .line 291
    .line 292
    goto :goto_6

    .line 293
    :cond_5
    iget-object v7, v5, Lox2;->b:Ljava/nio/ByteBuffer;

    .line 294
    .line 295
    invoke-virtual {v7}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    .line 296
    .line 297
    .line 298
    move-result-object v7

    .line 299
    sget-object v9, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 300
    .line 301
    invoke-virtual {v7, v9}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 302
    .line 303
    .line 304
    move-result-object v7

    .line 305
    invoke-virtual {v5, v8}, Lox2;->e(I)I

    .line 306
    .line 307
    .line 308
    move-result v9

    .line 309
    invoke-virtual {v7, v9}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 310
    .line 311
    .line 312
    invoke-virtual {v5, v8}, Lox2;->f(I)I

    .line 313
    .line 314
    .line 315
    move-result v5

    .line 316
    add-int/2addr v5, v9

    .line 317
    invoke-virtual {v7, v5}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 318
    .line 319
    .line 320
    :goto_6
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 321
    .line 322
    .line 323
    invoke-static {v7}, Lgf1;->q(Ljava/nio/ByteBuffer;)Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object v5

    .line 327
    invoke-static {v5}, Lp7;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 331
    goto :goto_7

    .line 332
    :catchall_0
    move-exception v5

    .line 333
    new-instance v7, Lx92;

    .line 334
    .line 335
    invoke-direct {v7, v5}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 336
    .line 337
    .line 338
    move-object v5, v7

    .line 339
    :goto_7
    invoke-static {v5}, Ly92;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 340
    .line 341
    .line 342
    move-result-object v7

    .line 343
    if-nez v7, :cond_6

    .line 344
    .line 345
    goto :goto_8

    .line 346
    :cond_6
    const-string v5, ""

    .line 347
    .line 348
    :goto_8
    check-cast v5, Ljava/lang/String;

    .line 349
    .line 350
    goto/16 :goto_10

    .line 351
    .line 352
    :pswitch_8
    new-instance v7, Lj;

    .line 353
    .line 354
    invoke-direct {v7}, Lox2;-><init>()V

    .line 355
    .line 356
    .line 357
    invoke-virtual {v5, v7}, La;->k(Lox2;)Lox2;

    .line 358
    .line 359
    .line 360
    move-result-object v5

    .line 361
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 362
    .line 363
    .line 364
    check-cast v5, Lj;

    .line 365
    .line 366
    invoke-virtual {v5, v1}, Lox2;->b(I)I

    .line 367
    .line 368
    .line 369
    move-result v7

    .line 370
    if-eqz v7, :cond_7

    .line 371
    .line 372
    iget-object v8, v5, Lox2;->b:Ljava/nio/ByteBuffer;

    .line 373
    .line 374
    iget v5, v5, Lox2;->a:I

    .line 375
    .line 376
    add-int/2addr v7, v5

    .line 377
    invoke-virtual {v8, v7}, Ljava/nio/ByteBuffer;->getDouble(I)D

    .line 378
    .line 379
    .line 380
    move-result-wide v7

    .line 381
    goto :goto_9

    .line 382
    :cond_7
    const-wide/16 v7, 0x0

    .line 383
    .line 384
    :goto_9
    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 385
    .line 386
    .line 387
    move-result-object v5

    .line 388
    goto/16 :goto_10

    .line 389
    .line 390
    :pswitch_9
    new-instance v7, Lk;

    .line 391
    .line 392
    invoke-direct {v7}, Lox2;-><init>()V

    .line 393
    .line 394
    .line 395
    invoke-virtual {v5, v7}, La;->k(Lox2;)Lox2;

    .line 396
    .line 397
    .line 398
    move-result-object v5

    .line 399
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 400
    .line 401
    .line 402
    check-cast v5, Lk;

    .line 403
    .line 404
    invoke-virtual {v5, v1}, Lox2;->b(I)I

    .line 405
    .line 406
    .line 407
    move-result v7

    .line 408
    if-eqz v7, :cond_8

    .line 409
    .line 410
    iget-object v8, v5, Lox2;->b:Ljava/nio/ByteBuffer;

    .line 411
    .line 412
    iget v5, v5, Lox2;->a:I

    .line 413
    .line 414
    add-int/2addr v7, v5

    .line 415
    invoke-virtual {v8, v7}, Ljava/nio/ByteBuffer;->getFloat(I)F

    .line 416
    .line 417
    .line 418
    move-result v5

    .line 419
    goto :goto_a

    .line 420
    :cond_8
    const/4 v5, 0x0

    .line 421
    :goto_a
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 422
    .line 423
    .line 424
    move-result-object v5

    .line 425
    goto/16 :goto_10

    .line 426
    .line 427
    :pswitch_a
    new-instance v7, Lm;

    .line 428
    .line 429
    invoke-direct {v7}, Lox2;-><init>()V

    .line 430
    .line 431
    .line 432
    invoke-virtual {v5, v7}, La;->k(Lox2;)Lox2;

    .line 433
    .line 434
    .line 435
    move-result-object v5

    .line 436
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 437
    .line 438
    .line 439
    check-cast v5, Lm;

    .line 440
    .line 441
    invoke-virtual {v5, v1}, Lox2;->b(I)I

    .line 442
    .line 443
    .line 444
    move-result v7

    .line 445
    if-eqz v7, :cond_9

    .line 446
    .line 447
    iget-object v8, v5, Lox2;->b:Ljava/nio/ByteBuffer;

    .line 448
    .line 449
    iget v5, v5, Lox2;->a:I

    .line 450
    .line 451
    add-int/2addr v7, v5

    .line 452
    invoke-virtual {v8, v7}, Ljava/nio/ByteBuffer;->getLong(I)J

    .line 453
    .line 454
    .line 455
    move-result-wide v7

    .line 456
    goto :goto_b

    .line 457
    :cond_9
    const-wide/16 v7, 0x0

    .line 458
    .line 459
    :goto_b
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 460
    .line 461
    .line 462
    move-result-object v5

    .line 463
    goto/16 :goto_10

    .line 464
    .line 465
    :pswitch_b
    new-instance v7, Ll;

    .line 466
    .line 467
    invoke-direct {v7}, Lox2;-><init>()V

    .line 468
    .line 469
    .line 470
    invoke-virtual {v5, v7}, La;->k(Lox2;)Lox2;

    .line 471
    .line 472
    .line 473
    move-result-object v5

    .line 474
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 475
    .line 476
    .line 477
    check-cast v5, Ll;

    .line 478
    .line 479
    invoke-virtual {v5, v1}, Lox2;->b(I)I

    .line 480
    .line 481
    .line 482
    move-result v7

    .line 483
    if-eqz v7, :cond_a

    .line 484
    .line 485
    iget-object v8, v5, Lox2;->b:Ljava/nio/ByteBuffer;

    .line 486
    .line 487
    iget v5, v5, Lox2;->a:I

    .line 488
    .line 489
    add-int/2addr v7, v5

    .line 490
    invoke-virtual {v8, v7}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 491
    .line 492
    .line 493
    move-result v5

    .line 494
    goto :goto_c

    .line 495
    :cond_a
    move v5, v3

    .line 496
    :goto_c
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 497
    .line 498
    .line 499
    move-result-object v5

    .line 500
    goto/16 :goto_10

    .line 501
    .line 502
    :pswitch_c
    new-instance v7, Li;

    .line 503
    .line 504
    invoke-direct {v7}, Lox2;-><init>()V

    .line 505
    .line 506
    .line 507
    invoke-virtual {v5, v7}, La;->k(Lox2;)Lox2;

    .line 508
    .line 509
    .line 510
    move-result-object v5

    .line 511
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 512
    .line 513
    .line 514
    check-cast v5, Li;

    .line 515
    .line 516
    invoke-virtual {v5, v1}, Lox2;->b(I)I

    .line 517
    .line 518
    .line 519
    move-result v7

    .line 520
    if-eqz v7, :cond_b

    .line 521
    .line 522
    iget-object v8, v5, Lox2;->b:Ljava/nio/ByteBuffer;

    .line 523
    .line 524
    iget v5, v5, Lox2;->a:I

    .line 525
    .line 526
    add-int/2addr v7, v5

    .line 527
    invoke-virtual {v8, v7}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 528
    .line 529
    .line 530
    move-result v5

    .line 531
    goto :goto_d

    .line 532
    :cond_b
    move v5, v3

    .line 533
    :goto_d
    invoke-static {v5}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 534
    .line 535
    .line 536
    move-result-object v5

    .line 537
    goto :goto_10

    .line 538
    :pswitch_d
    new-instance v7, Lo;

    .line 539
    .line 540
    invoke-direct {v7}, Lox2;-><init>()V

    .line 541
    .line 542
    .line 543
    invoke-virtual {v5, v7}, La;->k(Lox2;)Lox2;

    .line 544
    .line 545
    .line 546
    move-result-object v5

    .line 547
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 548
    .line 549
    .line 550
    check-cast v5, Lo;

    .line 551
    .line 552
    invoke-virtual {v5, v1}, Lox2;->b(I)I

    .line 553
    .line 554
    .line 555
    move-result v7

    .line 556
    if-eqz v7, :cond_c

    .line 557
    .line 558
    iget-object v8, v5, Lox2;->b:Ljava/nio/ByteBuffer;

    .line 559
    .line 560
    iget v5, v5, Lox2;->a:I

    .line 561
    .line 562
    add-int/2addr v7, v5

    .line 563
    invoke-virtual {v8, v7}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 564
    .line 565
    .line 566
    move-result v5

    .line 567
    goto :goto_e

    .line 568
    :cond_c
    move v5, v3

    .line 569
    :goto_e
    invoke-static {v5}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 570
    .line 571
    .line 572
    move-result-object v5

    .line 573
    goto :goto_10

    .line 574
    :pswitch_e
    new-instance v7, Lh;

    .line 575
    .line 576
    invoke-direct {v7}, Lox2;-><init>()V

    .line 577
    .line 578
    .line 579
    invoke-virtual {v5, v7}, La;->k(Lox2;)Lox2;

    .line 580
    .line 581
    .line 582
    move-result-object v5

    .line 583
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 584
    .line 585
    .line 586
    check-cast v5, Lh;

    .line 587
    .line 588
    invoke-virtual {v5, v1}, Lox2;->b(I)I

    .line 589
    .line 590
    .line 591
    move-result v7

    .line 592
    if-eqz v7, :cond_d

    .line 593
    .line 594
    iget-object v8, v5, Lox2;->b:Ljava/nio/ByteBuffer;

    .line 595
    .line 596
    iget v5, v5, Lox2;->a:I

    .line 597
    .line 598
    add-int/2addr v7, v5

    .line 599
    invoke-virtual {v8, v7}, Ljava/nio/ByteBuffer;->get(I)B

    .line 600
    .line 601
    .line 602
    move-result v5

    .line 603
    goto :goto_f

    .line 604
    :cond_d
    move v5, v3

    .line 605
    :goto_f
    invoke-static {v5}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 606
    .line 607
    .line 608
    move-result-object v5

    .line 609
    :goto_10
    new-instance v7, Lxd;

    .line 610
    .line 611
    invoke-direct {v7, v6, v5}, Lxd;-><init>(ILjava/lang/Object;)V

    .line 612
    .line 613
    .line 614
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 615
    .line 616
    .line 617
    add-int/lit8 v4, v4, 0x1

    .line 618
    .line 619
    goto/16 :goto_1

    .line 620
    .line 621
    :cond_e
    new-instance p1, Lwd;

    .line 622
    .line 623
    invoke-direct {p1, p0, v0}, Lwd;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Ljava/util/ArrayList;)V

    .line 624
    .line 625
    .line 626
    return-object p1

    .line 627
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static final y([F[F)Z
    .locals 49

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    array-length v2, v0

    .line 6
    const/4 v3, 0x0

    .line 7
    const/16 v4, 0x10

    .line 8
    .line 9
    if-lt v2, v4, :cond_0

    .line 10
    .line 11
    array-length v2, v1

    .line 12
    if-ge v2, v4, :cond_1

    .line 13
    .line 14
    :cond_0
    move/from16 v19, v3

    .line 15
    .line 16
    goto/16 :goto_2

    .line 17
    .line 18
    :cond_1
    aget v2, v0, v3

    .line 19
    .line 20
    const/4 v4, 0x1

    .line 21
    aget v5, v0, v4

    .line 22
    .line 23
    const/4 v6, 0x2

    .line 24
    aget v7, v0, v6

    .line 25
    .line 26
    const/4 v8, 0x3

    .line 27
    aget v9, v0, v8

    .line 28
    .line 29
    const/4 v10, 0x4

    .line 30
    aget v11, v0, v10

    .line 31
    .line 32
    const/4 v12, 0x5

    .line 33
    aget v13, v0, v12

    .line 34
    .line 35
    const/4 v14, 0x6

    .line 36
    aget v15, v0, v14

    .line 37
    .line 38
    const/16 v16, 0x7

    .line 39
    .line 40
    aget v17, v0, v16

    .line 41
    .line 42
    const/16 v18, 0x8

    .line 43
    .line 44
    move/from16 v19, v3

    .line 45
    .line 46
    aget v3, v0, v18

    .line 47
    .line 48
    const/16 v20, 0x9

    .line 49
    .line 50
    move/from16 v21, v4

    .line 51
    .line 52
    aget v4, v0, v20

    .line 53
    .line 54
    const/16 v22, 0xa

    .line 55
    .line 56
    aget v23, v0, v22

    .line 57
    .line 58
    const/16 v24, 0xb

    .line 59
    .line 60
    aget v25, v0, v24

    .line 61
    .line 62
    const/16 v26, 0xc

    .line 63
    .line 64
    move/from16 v27, v6

    .line 65
    .line 66
    aget v6, v0, v26

    .line 67
    .line 68
    const/16 v28, 0xd

    .line 69
    .line 70
    aget v29, v0, v28

    .line 71
    .line 72
    const/16 v30, 0xe

    .line 73
    .line 74
    aget v31, v0, v30

    .line 75
    .line 76
    const/16 v32, 0xf

    .line 77
    .line 78
    aget v0, v0, v32

    .line 79
    .line 80
    mul-float v33, v2, v13

    .line 81
    .line 82
    mul-float v34, v5, v11

    .line 83
    .line 84
    sub-float v33, v33, v34

    .line 85
    .line 86
    mul-float v34, v2, v15

    .line 87
    .line 88
    mul-float v35, v7, v11

    .line 89
    .line 90
    sub-float v34, v34, v35

    .line 91
    .line 92
    mul-float v35, v2, v17

    .line 93
    .line 94
    mul-float v36, v9, v11

    .line 95
    .line 96
    sub-float v35, v35, v36

    .line 97
    .line 98
    mul-float v36, v5, v15

    .line 99
    .line 100
    mul-float v37, v7, v13

    .line 101
    .line 102
    sub-float v36, v36, v37

    .line 103
    .line 104
    mul-float v37, v5, v17

    .line 105
    .line 106
    mul-float v38, v9, v13

    .line 107
    .line 108
    sub-float v37, v37, v38

    .line 109
    .line 110
    mul-float v38, v7, v17

    .line 111
    .line 112
    mul-float v39, v9, v15

    .line 113
    .line 114
    sub-float v38, v38, v39

    .line 115
    .line 116
    mul-float v39, v3, v29

    .line 117
    .line 118
    mul-float v40, v4, v6

    .line 119
    .line 120
    sub-float v39, v39, v40

    .line 121
    .line 122
    mul-float v40, v3, v31

    .line 123
    .line 124
    mul-float v41, v23, v6

    .line 125
    .line 126
    sub-float v40, v40, v41

    .line 127
    .line 128
    mul-float v41, v3, v0

    .line 129
    .line 130
    mul-float v42, v25, v6

    .line 131
    .line 132
    sub-float v41, v41, v42

    .line 133
    .line 134
    mul-float v42, v4, v31

    .line 135
    .line 136
    mul-float v43, v23, v29

    .line 137
    .line 138
    sub-float v42, v42, v43

    .line 139
    .line 140
    mul-float v43, v4, v0

    .line 141
    .line 142
    mul-float v44, v25, v29

    .line 143
    .line 144
    sub-float v43, v43, v44

    .line 145
    .line 146
    mul-float v44, v23, v0

    .line 147
    .line 148
    mul-float v45, v25, v31

    .line 149
    .line 150
    sub-float v44, v44, v45

    .line 151
    .line 152
    mul-float v45, v33, v44

    .line 153
    .line 154
    mul-float v46, v34, v43

    .line 155
    .line 156
    sub-float v45, v45, v46

    .line 157
    .line 158
    mul-float v46, v35, v42

    .line 159
    .line 160
    add-float v46, v46, v45

    .line 161
    .line 162
    mul-float v45, v36, v41

    .line 163
    .line 164
    add-float v45, v45, v46

    .line 165
    .line 166
    mul-float v46, v37, v40

    .line 167
    .line 168
    sub-float v45, v45, v46

    .line 169
    .line 170
    mul-float v46, v38, v39

    .line 171
    .line 172
    add-float v46, v46, v45

    .line 173
    .line 174
    const/16 v45, 0x0

    .line 175
    .line 176
    cmpg-float v45, v46, v45

    .line 177
    .line 178
    if-nez v45, :cond_2

    .line 179
    .line 180
    goto/16 :goto_0

    .line 181
    .line 182
    :cond_2
    const/high16 v47, 0x3f800000    # 1.0f

    .line 183
    .line 184
    div-float v47, v47, v46

    .line 185
    .line 186
    mul-float v46, v13, v44

    .line 187
    .line 188
    mul-float v48, v15, v43

    .line 189
    .line 190
    sub-float v46, v46, v48

    .line 191
    .line 192
    mul-float v48, v17, v42

    .line 193
    .line 194
    add-float v48, v48, v46

    .line 195
    .line 196
    mul-float v48, v48, v47

    .line 197
    .line 198
    aput v48, v1, v19

    .line 199
    .line 200
    move/from16 v46, v8

    .line 201
    .line 202
    neg-float v8, v5

    .line 203
    mul-float v8, v8, v44

    .line 204
    .line 205
    mul-float v48, v7, v43

    .line 206
    .line 207
    add-float v48, v48, v8

    .line 208
    .line 209
    mul-float v8, v9, v42

    .line 210
    .line 211
    sub-float v48, v48, v8

    .line 212
    .line 213
    mul-float v48, v48, v47

    .line 214
    .line 215
    aput v48, v1, v21

    .line 216
    .line 217
    mul-float v8, v29, v38

    .line 218
    .line 219
    mul-float v48, v31, v37

    .line 220
    .line 221
    sub-float v8, v8, v48

    .line 222
    .line 223
    mul-float v48, v0, v36

    .line 224
    .line 225
    add-float v48, v48, v8

    .line 226
    .line 227
    mul-float v48, v48, v47

    .line 228
    .line 229
    aput v48, v1, v27

    .line 230
    .line 231
    neg-float v8, v4

    .line 232
    mul-float v8, v8, v38

    .line 233
    .line 234
    mul-float v27, v23, v37

    .line 235
    .line 236
    add-float v27, v27, v8

    .line 237
    .line 238
    mul-float v8, v25, v36

    .line 239
    .line 240
    sub-float v27, v27, v8

    .line 241
    .line 242
    mul-float v27, v27, v47

    .line 243
    .line 244
    aput v27, v1, v46

    .line 245
    .line 246
    neg-float v8, v11

    .line 247
    mul-float v27, v8, v44

    .line 248
    .line 249
    mul-float v46, v15, v41

    .line 250
    .line 251
    add-float v46, v46, v27

    .line 252
    .line 253
    mul-float v27, v17, v40

    .line 254
    .line 255
    sub-float v46, v46, v27

    .line 256
    .line 257
    mul-float v46, v46, v47

    .line 258
    .line 259
    aput v46, v1, v10

    .line 260
    .line 261
    mul-float v44, v44, v2

    .line 262
    .line 263
    mul-float v10, v7, v41

    .line 264
    .line 265
    sub-float v44, v44, v10

    .line 266
    .line 267
    mul-float v10, v9, v40

    .line 268
    .line 269
    add-float v10, v10, v44

    .line 270
    .line 271
    mul-float v10, v10, v47

    .line 272
    .line 273
    aput v10, v1, v12

    .line 274
    .line 275
    neg-float v10, v6

    .line 276
    mul-float v12, v10, v38

    .line 277
    .line 278
    mul-float v27, v31, v35

    .line 279
    .line 280
    add-float v27, v27, v12

    .line 281
    .line 282
    mul-float v12, v0, v34

    .line 283
    .line 284
    sub-float v27, v27, v12

    .line 285
    .line 286
    mul-float v27, v27, v47

    .line 287
    .line 288
    aput v27, v1, v14

    .line 289
    .line 290
    mul-float v38, v38, v3

    .line 291
    .line 292
    mul-float v12, v23, v35

    .line 293
    .line 294
    sub-float v38, v38, v12

    .line 295
    .line 296
    mul-float v12, v25, v34

    .line 297
    .line 298
    add-float v12, v12, v38

    .line 299
    .line 300
    mul-float v12, v12, v47

    .line 301
    .line 302
    aput v12, v1, v16

    .line 303
    .line 304
    mul-float v11, v11, v43

    .line 305
    .line 306
    mul-float v12, v13, v41

    .line 307
    .line 308
    sub-float/2addr v11, v12

    .line 309
    mul-float v17, v17, v39

    .line 310
    .line 311
    add-float v17, v17, v11

    .line 312
    .line 313
    mul-float v17, v17, v47

    .line 314
    .line 315
    aput v17, v1, v18

    .line 316
    .line 317
    neg-float v11, v2

    .line 318
    mul-float v11, v11, v43

    .line 319
    .line 320
    mul-float v41, v41, v5

    .line 321
    .line 322
    add-float v41, v41, v11

    .line 323
    .line 324
    mul-float v9, v9, v39

    .line 325
    .line 326
    sub-float v41, v41, v9

    .line 327
    .line 328
    mul-float v41, v41, v47

    .line 329
    .line 330
    aput v41, v1, v20

    .line 331
    .line 332
    mul-float v6, v6, v37

    .line 333
    .line 334
    mul-float v9, v29, v35

    .line 335
    .line 336
    sub-float/2addr v6, v9

    .line 337
    mul-float v0, v0, v33

    .line 338
    .line 339
    add-float/2addr v0, v6

    .line 340
    mul-float v0, v0, v47

    .line 341
    .line 342
    aput v0, v1, v22

    .line 343
    .line 344
    neg-float v0, v3

    .line 345
    mul-float v0, v0, v37

    .line 346
    .line 347
    mul-float v35, v35, v4

    .line 348
    .line 349
    add-float v35, v35, v0

    .line 350
    .line 351
    mul-float v25, v25, v33

    .line 352
    .line 353
    sub-float v35, v35, v25

    .line 354
    .line 355
    mul-float v35, v35, v47

    .line 356
    .line 357
    aput v35, v1, v24

    .line 358
    .line 359
    mul-float v8, v8, v42

    .line 360
    .line 361
    mul-float v13, v13, v40

    .line 362
    .line 363
    add-float/2addr v13, v8

    .line 364
    mul-float v15, v15, v39

    .line 365
    .line 366
    sub-float/2addr v13, v15

    .line 367
    mul-float v13, v13, v47

    .line 368
    .line 369
    aput v13, v1, v26

    .line 370
    .line 371
    mul-float v2, v2, v42

    .line 372
    .line 373
    mul-float v5, v5, v40

    .line 374
    .line 375
    sub-float/2addr v2, v5

    .line 376
    mul-float v7, v7, v39

    .line 377
    .line 378
    add-float/2addr v7, v2

    .line 379
    mul-float v7, v7, v47

    .line 380
    .line 381
    aput v7, v1, v28

    .line 382
    .line 383
    mul-float v10, v10, v36

    .line 384
    .line 385
    mul-float v29, v29, v34

    .line 386
    .line 387
    add-float v29, v29, v10

    .line 388
    .line 389
    mul-float v31, v31, v33

    .line 390
    .line 391
    sub-float v29, v29, v31

    .line 392
    .line 393
    mul-float v29, v29, v47

    .line 394
    .line 395
    aput v29, v1, v30

    .line 396
    .line 397
    mul-float v3, v3, v36

    .line 398
    .line 399
    mul-float v4, v4, v34

    .line 400
    .line 401
    sub-float/2addr v3, v4

    .line 402
    mul-float v23, v23, v33

    .line 403
    .line 404
    add-float v23, v23, v3

    .line 405
    .line 406
    mul-float v23, v23, v47

    .line 407
    .line 408
    aput v23, v1, v32

    .line 409
    .line 410
    :goto_0
    if-nez v45, :cond_3

    .line 411
    .line 412
    move/from16 v3, v21

    .line 413
    .line 414
    goto :goto_1

    .line 415
    :cond_3
    move/from16 v3, v19

    .line 416
    .line 417
    :goto_1
    xor-int/lit8 v0, v3, 0x1

    .line 418
    .line 419
    return v0

    .line 420
    :goto_2
    return v19
.end method

.method public static final z(Lr61;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lr61;->o:Lr61;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    invoke-virtual {p0}, Lr61;->u()Lr61;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, v0, Lr61;->o:Lr61;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :goto_0
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-object p0, p0, Lr61;->N:Lv61;

    .line 18
    .line 19
    iget-boolean p0, p0, Lv61;->b:Z

    .line 20
    .line 21
    if-eqz p0, :cond_2

    .line 22
    .line 23
    :cond_1
    const/4 p0, 0x1

    .line 24
    return p0

    .line 25
    :cond_2
    const/4 p0, 0x0

    .line 26
    return p0
.end method


# virtual methods
.method public abstract B(I)I
.end method

.method public abstract J(I)I
.end method

.method public b(I)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lfg1;->J(I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public c(I)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lfg1;->B(I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public k(I)I
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lfg1;->B(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, -0x1

    .line 6
    if-ne p1, v0, :cond_0

    .line 7
    .line 8
    return v0

    .line 9
    :cond_0
    invoke-virtual {p0, p1}, Lfg1;->B(I)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-ne p0, v0, :cond_1

    .line 14
    .line 15
    return v0

    .line 16
    :cond_1
    return p1
.end method

.method public l(I)I
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lfg1;->J(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, -0x1

    .line 6
    if-ne p1, v0, :cond_0

    .line 7
    .line 8
    return v0

    .line 9
    :cond_0
    invoke-virtual {p0, p1}, Lfg1;->J(I)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-ne p0, v0, :cond_1

    .line 14
    .line 15
    return v0

    .line 16
    :cond_1
    return p1
.end method
