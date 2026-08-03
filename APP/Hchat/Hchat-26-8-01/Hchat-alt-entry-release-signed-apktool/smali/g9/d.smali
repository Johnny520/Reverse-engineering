.class public final Lg9/d;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final g:Log/k;

.field public static final h:[B


# instance fields
.field public final a:Lr8/g;

.field public final b:Lab/b;

.field public final c:Landroid/content/SharedPreferences;

.field public final d:Landroid/os/Handler;

.field public final e:Ljava/util/Set;

.field public final f:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Log/k;

    .line 2
    .line 3
    const-string v1, "[0-9a-fA-F]{32}"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Log/k;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lg9/d;->g:Log/k;

    .line 9
    .line 10
    const/16 v0, 0x8

    .line 11
    .line 12
    new-array v0, v0, [B

    .line 13
    .line 14
    fill-array-data v0, :array_0

    .line 15
    .line 16
    .line 17
    sput-object v0, Lg9/d;->h:[B

    .line 18
    .line 19
    return-void

    .line 20
    nop

    .line 21
    :array_0
    .array-data 1
        -0x77t
        0x50t
        0x4et
        0x47t
        0xdt
        0xat
        0x1at
        0xat
    .end array-data
.end method

.method public constructor <init>(Lr8/g;Lab/b;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lg9/d;->a:Lr8/g;

    .line 8
    .line 9
    iput-object p2, p0, Lg9/d;->b:Lab/b;

    .line 10
    .line 11
    iget-object p1, p1, Lr8/g;->a:Landroid/content/Context;

    .line 12
    .line 13
    const-string p2, "Hchat_emoji_save_config"

    .line 14
    .line 15
    invoke-static {p1, p2}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, Lg9/d;->c:Landroid/content/SharedPreferences;

    .line 20
    .line 21
    new-instance p1, Landroid/os/Handler;

    .line 22
    .line 23
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lg9/d;->d:Landroid/os/Handler;

    .line 31
    .line 32
    invoke-static {}, Lj8/b;->o()Ljava/util/Set;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iput-object p1, p0, Lg9/d;->e:Ljava/util/Set;

    .line 37
    .line 38
    invoke-static {}, Lp/a;->p()Ljava/util/Map;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iput-object p1, p0, Lg9/d;->f:Ljava/util/Map;

    .line 43
    .line 44
    return-void
.end method

.method public static c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Number;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    invoke-static {p0, p1, v0}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    instance-of v0, p1, Ljava/lang/Number;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    check-cast p1, Ljava/lang/Number;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-object p1, v1

    .line 17
    :goto_0
    if-eqz p1, :cond_1

    .line 18
    .line 19
    return-object p1

    .line 20
    :cond_1
    invoke-static {p0, p2}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    instance-of p2, p1, Ljava/lang/Number;

    .line 25
    .line 26
    if-eqz p2, :cond_2

    .line 27
    .line 28
    check-cast p1, Ljava/lang/Number;

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_2
    move-object p1, v1

    .line 32
    :goto_1
    if-eqz p1, :cond_3

    .line 33
    .line 34
    return-object p1

    .line 35
    :cond_3
    invoke-static {p0, p3}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    instance-of p1, p0, Ljava/lang/Number;

    .line 40
    .line 41
    if-eqz p1, :cond_4

    .line 42
    .line 43
    check-cast p0, Ljava/lang/Number;

    .line 44
    .line 45
    return-object p0

    .line 46
    :cond_4
    return-object v1
.end method

.method public static d(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    invoke-static {p0, p1, v0}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    return-object p1

    .line 17
    :cond_0
    invoke-static {p0, p2}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0

    .line 28
    :cond_1
    invoke-static {p0, p3}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    if-eqz p0, :cond_2

    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    goto :goto_0

    .line 39
    :cond_2
    const/4 p0, 0x0

    .line 40
    :goto_0
    if-eqz p0, :cond_3

    .line 41
    .line 42
    return-object p0

    .line 43
    :cond_3
    const-string p0, ""

    .line 44
    .line 45
    return-object p0
.end method

.method public static e(ILjava/lang/Object;Ljava/util/Set;)Ljava/lang/Object;
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_e

    .line 3
    .line 4
    const/4 v1, 0x5

    .line 5
    if-gt p0, v1, :cond_e

    .line 6
    .line 7
    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    goto/16 :goto_5

    .line 14
    .line 15
    :cond_0
    const-string v1, "field_msgId"

    .line 16
    .line 17
    const-string v2, "msgId"

    .line 18
    .line 19
    const-string v3, "getMsgId"

    .line 20
    .line 21
    invoke-static {p1, v3, v1, v2}, Lg9/d;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Number;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const/4 v2, 0x0

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const-string v1, "getMsgID"

    .line 30
    .line 31
    new-array v3, v2, [Ljava/lang/Object;

    .line 32
    .line 33
    invoke-static {p1, v1, v3}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    instance-of v3, v1, Ljava/lang/Number;

    .line 38
    .line 39
    if-eqz v3, :cond_2

    .line 40
    .line 41
    check-cast v1, Ljava/lang/Number;

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    move-object v1, v0

    .line 45
    :goto_0
    const-string v3, "com.tencent.mm.storage."

    .line 46
    .line 47
    invoke-static {v3, p1, v2}, Leh/a;->z(Ljava/lang/String;Ljava/lang/Object;Z)Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    const/4 v4, 0x1

    .line 52
    if-eqz v3, :cond_4

    .line 53
    .line 54
    if-eqz v1, :cond_4

    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 57
    .line 58
    .line 59
    move-result-wide v5

    .line 60
    const-wide/16 v7, 0x0

    .line 61
    .line 62
    cmp-long v1, v5, v7

    .line 63
    .line 64
    if-lez v1, :cond_3

    .line 65
    .line 66
    move v1, v4

    .line 67
    goto :goto_1

    .line 68
    :cond_3
    move v1, v2

    .line 69
    :goto_1
    if-ne v1, v4, :cond_4

    .line 70
    .line 71
    return-object p1

    .line 72
    :cond_4
    instance-of v1, p1, Landroid/view/View;

    .line 73
    .line 74
    if-eqz v1, :cond_5

    .line 75
    .line 76
    check-cast p1, Landroid/view/View;

    .line 77
    .line 78
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    add-int/2addr p0, v4

    .line 83
    invoke-static {p0, p1, p2}, Lg9/d;->e(ILjava/lang/Object;Ljava/util/Set;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    return-object p0

    .line 88
    :cond_5
    instance-of v1, p1, [Ljava/lang/Object;

    .line 89
    .line 90
    if-eqz v1, :cond_7

    .line 91
    .line 92
    check-cast p1, [Ljava/lang/Object;

    .line 93
    .line 94
    array-length v1, p1

    .line 95
    :goto_2
    if-ge v2, v1, :cond_e

    .line 96
    .line 97
    aget-object v3, p1, v2

    .line 98
    .line 99
    add-int/lit8 v5, p0, 0x1

    .line 100
    .line 101
    invoke-static {v5, v3, p2}, Lg9/d;->e(ILjava/lang/Object;Ljava/util/Set;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    if-eqz v3, :cond_6

    .line 106
    .line 107
    return-object v3

    .line 108
    :cond_6
    add-int/lit8 v2, v2, 0x1

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_7
    instance-of v1, p1, Ljava/util/Collection;

    .line 112
    .line 113
    if-eqz v1, :cond_9

    .line 114
    .line 115
    check-cast p1, Ljava/lang/Iterable;

    .line 116
    .line 117
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    :cond_8
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    if-eqz v1, :cond_e

    .line 126
    .line 127
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    add-int/lit8 v2, p0, 0x1

    .line 132
    .line 133
    invoke-static {v2, v1, p2}, Lg9/d;->e(ILjava/lang/Object;Ljava/util/Set;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    if-eqz v1, :cond_8

    .line 138
    .line 139
    return-object v1

    .line 140
    :cond_9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    const-string v3, "java."

    .line 149
    .line 150
    invoke-static {v1, v3, v2}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 151
    .line 152
    .line 153
    move-result v3

    .line 154
    if-nez v3, :cond_e

    .line 155
    .line 156
    const-string v3, "android."

    .line 157
    .line 158
    invoke-static {v1, v3, v2}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    if-eqz v1, :cond_a

    .line 163
    .line 164
    goto :goto_5

    .line 165
    :cond_a
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    :goto_3
    if-eqz v1, :cond_e

    .line 170
    .line 171
    const-class v2, Ljava/lang/Object;

    .line 172
    .line 173
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v2

    .line 177
    if-nez v2, :cond_e

    .line 178
    .line 179
    invoke-static {v1}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    :cond_b
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 188
    .line 189
    .line 190
    move-result v3

    .line 191
    if-eqz v3, :cond_d

    .line 192
    .line 193
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v3

    .line 197
    check-cast v3, Ljava/lang/reflect/Field;

    .line 198
    .line 199
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    move-result-object v5

    .line 203
    invoke-virtual {v5}, Ljava/lang/Class;->isPrimitive()Z

    .line 204
    .line 205
    .line 206
    move-result v5

    .line 207
    if-nez v5, :cond_b

    .line 208
    .line 209
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    move-result-object v5

    .line 213
    const-class v6, Ljava/lang/String;

    .line 214
    .line 215
    invoke-static {v5, v6}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    move-result v5

    .line 219
    if-eqz v5, :cond_c

    .line 220
    .line 221
    goto :goto_4

    .line 222
    :cond_c
    invoke-static {v3, p1}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v3

    .line 226
    if-eqz v3, :cond_b

    .line 227
    .line 228
    add-int/lit8 v5, p0, 0x1

    .line 229
    .line 230
    invoke-static {v5, v3, p2}, Lg9/d;->e(ILjava/lang/Object;Ljava/util/Set;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v3

    .line 234
    if-eqz v3, :cond_b

    .line 235
    .line 236
    return-object v3

    .line 237
    :cond_d
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    goto :goto_3

    .line 242
    :cond_e
    :goto_5
    return-object v0
.end method

.method public static f(Ljava/io/File;[B)Z
    .locals 6

    .line 1
    :try_start_0
    new-instance v0, Ljava/io/FileOutputStream;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    .line 7
    :try_start_1
    invoke-virtual {v0, p1}, Ljava/io/FileOutputStream;->write([B)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 8
    .line 9
    .line 10
    :try_start_2
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/io/File;->isFile()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/io/File;->length()J

    .line 20
    .line 21
    .line 22
    move-result-wide v2

    .line 23
    array-length p1, p1

    .line 24
    int-to-long v4, p1

    .line 25
    cmp-long p1, v2, v4

    .line 26
    .line 27
    if-nez p1, :cond_0

    .line 28
    .line 29
    const/4 v1, 0x1

    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception p1

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 34
    .line 35
    .line 36
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 37
    goto :goto_2

    .line 38
    :catchall_1
    move-exception p1

    .line 39
    :try_start_3
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 40
    :catchall_2
    move-exception v1

    .line 41
    :try_start_4
    invoke-static {v0, p1}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 42
    .line 43
    .line 44
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 45
    :goto_1
    new-instance v0, Lsf/f;

    .line 46
    .line 47
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 48
    .line 49
    .line 50
    move-object p1, v0

    .line 51
    :goto_2
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    if-nez v0, :cond_1

    .line 56
    .line 57
    goto :goto_3

    .line 58
    :cond_1
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    .line 59
    .line 60
    .line 61
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 62
    .line 63
    :goto_3
    check-cast p1, Ljava/lang/Boolean;

    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    return p0
.end method


# virtual methods
.method public final a([B)Ljava/io/File;
    .locals 9

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    iget-object v1, p0, Lg9/d;->a:Lr8/g;

    .line 4
    .line 5
    iget-object v2, v1, Lr8/g;->a:Landroid/content/Context;

    .line 6
    .line 7
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v2, v1, Lr8/g;->a:Landroid/content/Context;

    .line 15
    .line 16
    :goto_0
    const/4 v1, 0x0

    .line 17
    const/4 v3, 0x0

    .line 18
    :try_start_0
    invoke-virtual {v2}, Landroid/content/Context;->getExternalMediaDirs()[Ljava/io/File;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    if-eqz v4, :cond_2

    .line 23
    .line 24
    array-length v5, v4

    .line 25
    move v6, v1

    .line 26
    :goto_1
    if-ge v6, v5, :cond_2

    .line 27
    .line 28
    aget-object v7, v4, v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    if-eqz v7, :cond_1

    .line 31
    .line 32
    goto :goto_3

    .line 33
    :cond_1
    add-int/lit8 v6, v6, 0x1

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :catchall_0
    move-exception v4

    .line 37
    goto :goto_2

    .line 38
    :cond_2
    move-object v7, v3

    .line 39
    goto :goto_3

    .line 40
    :goto_2
    new-instance v7, Lsf/f;

    .line 41
    .line 42
    invoke-direct {v7, v4}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 43
    .line 44
    .line 45
    :goto_3
    instance-of v4, v7, Lsf/f;

    .line 46
    .line 47
    if-eqz v4, :cond_3

    .line 48
    .line 49
    move-object v7, v3

    .line 50
    :cond_3
    check-cast v7, Ljava/io/File;

    .line 51
    .line 52
    new-instance v4, Ljava/io/File;

    .line 53
    .line 54
    if-eqz v7, :cond_4

    .line 55
    .line 56
    goto :goto_4

    .line 57
    :cond_4
    new-instance v7, Ljava/io/File;

    .line 58
    .line 59
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    const-string v5, "/storage/emulated/0/Android/media/"

    .line 64
    .line 65
    invoke-static {v5, v2}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-direct {v7, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    :goto_4
    const-string v2, "Hchat"

    .line 73
    .line 74
    invoke-direct {v4, v7, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    const-string v2, "Emoji"

    .line 78
    .line 79
    invoke-direct {v0, v4, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    if-nez v2, :cond_5

    .line 87
    .line 88
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    if-nez v2, :cond_5

    .line 93
    .line 94
    return-object v3

    .line 95
    :cond_5
    new-instance v2, Ljava/text/SimpleDateFormat;

    .line 96
    .line 97
    const-string v3, "yyyyMMdd_HHmmss_SSS"

    .line 98
    .line 99
    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 100
    .line 101
    invoke-direct {v2, v3, v4}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 102
    .line 103
    .line 104
    new-instance v3, Ljava/util/Date;

    .line 105
    .line 106
    invoke-direct {v3}, Ljava/util/Date;-><init>()V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v2, v3}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    new-instance v3, Ljava/io/File;

    .line 114
    .line 115
    array-length v4, p1

    .line 116
    const/4 v5, 0x6

    .line 117
    if-lt v4, v5, :cond_6

    .line 118
    .line 119
    const-string v6, "GIF87a"

    .line 120
    .line 121
    const-string v7, "GIF89a"

    .line 122
    .line 123
    filled-new-array {v6, v7}, [Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v6

    .line 127
    invoke-static {v6}, Ltf/d0;->W([Ljava/lang/Object;)Ljava/util/Set;

    .line 128
    .line 129
    .line 130
    move-result-object v6

    .line 131
    new-instance v7, Ljava/lang/String;

    .line 132
    .line 133
    sget-object v8, Log/a;->b:Ljava/nio/charset/Charset;

    .line 134
    .line 135
    invoke-direct {v7, p1, v1, v5, v8}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 136
    .line 137
    .line 138
    invoke-interface {v6, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v5

    .line 142
    if-eqz v5, :cond_6

    .line 143
    .line 144
    const-string p1, ".gif"

    .line 145
    .line 146
    goto :goto_5

    .line 147
    :cond_6
    const/16 v5, 0x8

    .line 148
    .line 149
    if-lt v4, v5, :cond_7

    .line 150
    .line 151
    invoke-static {p1, v1, v5}, Ltf/l;->t0([BII)[B

    .line 152
    .line 153
    .line 154
    move-result-object v6

    .line 155
    sget-object v7, Lg9/d;->h:[B

    .line 156
    .line 157
    invoke-static {v6, v7}, Ljava/util/Arrays;->equals([B[B)Z

    .line 158
    .line 159
    .line 160
    move-result v6

    .line 161
    if-eqz v6, :cond_7

    .line 162
    .line 163
    const-string p1, ".png"

    .line 164
    .line 165
    goto :goto_5

    .line 166
    :cond_7
    const/4 v6, 0x3

    .line 167
    if-lt v4, v6, :cond_8

    .line 168
    .line 169
    aget-byte v6, p1, v1

    .line 170
    .line 171
    const/4 v7, -0x1

    .line 172
    if-ne v6, v7, :cond_8

    .line 173
    .line 174
    const/4 v6, 0x1

    .line 175
    aget-byte v6, p1, v6

    .line 176
    .line 177
    const/16 v8, -0x28

    .line 178
    .line 179
    if-ne v6, v8, :cond_8

    .line 180
    .line 181
    const/4 v6, 0x2

    .line 182
    aget-byte v6, p1, v6

    .line 183
    .line 184
    if-ne v6, v7, :cond_8

    .line 185
    .line 186
    const-string p1, ".jpg"

    .line 187
    .line 188
    goto :goto_5

    .line 189
    :cond_8
    const/16 v6, 0xc

    .line 190
    .line 191
    if-lt v4, v6, :cond_9

    .line 192
    .line 193
    new-instance v4, Ljava/lang/String;

    .line 194
    .line 195
    sget-object v6, Log/a;->b:Ljava/nio/charset/Charset;

    .line 196
    .line 197
    const/4 v7, 0x4

    .line 198
    invoke-direct {v4, p1, v1, v7, v6}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 199
    .line 200
    .line 201
    const-string v1, "RIFF"

    .line 202
    .line 203
    invoke-virtual {v4, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    move-result v1

    .line 207
    if-eqz v1, :cond_9

    .line 208
    .line 209
    new-instance v1, Ljava/lang/String;

    .line 210
    .line 211
    invoke-direct {v1, p1, v5, v7, v6}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 212
    .line 213
    .line 214
    const-string p1, "WEBP"

    .line 215
    .line 216
    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    move-result p1

    .line 220
    if-eqz p1, :cond_9

    .line 221
    .line 222
    const-string p1, ".webp"

    .line 223
    .line 224
    goto :goto_5

    .line 225
    :cond_9
    const-string p1, ".bin"

    .line 226
    .line 227
    :goto_5
    const-string v1, "Hchat_emoji_"

    .line 228
    .line 229
    invoke-static {v1, v2, p1}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    invoke-direct {v3, v0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    return-object v3
.end method

.method public final b(Ljava/lang/reflect/Method;Lde/robv/android/xposed/XC_MethodHook;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_4

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/Class;->isInterface()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    goto :goto_3

    .line 22
    :cond_0
    iget-object v0, p0, Lg9/d;->e:Ljava/util/Set;

    .line 23
    .line 24
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_1

    .line 29
    .line 30
    const/4 p1, 0x1

    .line 31
    return p1

    .line 32
    :cond_1
    :try_start_0
    sget-object v1, Lr8/i;->b:Lr8/i;

    .line 33
    .line 34
    invoke-static {p1}, Lh/Hchat/utils/KavaReflector;->accessible(Ljava/lang/reflect/Method;)Ljava/lang/reflect/Method;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    if-eqz v2, :cond_2

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    move-object v2, p1

    .line 42
    :goto_0
    invoke-virtual {v1, v2, p2}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 43
    .line 44
    .line 45
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :catchall_0
    move-exception p2

    .line 49
    new-instance v1, Lsf/f;

    .line 50
    .line 51
    invoke-direct {v1, p2}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    move-object p2, v1

    .line 55
    :goto_1
    invoke-static {p2}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    if-nez v1, :cond_3

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_3
    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    new-instance p2, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    const-string v0, "\u4fdd\u5b58\u8868\u60c5\u83dc\u5355 Hook \u5b89\u88c5\u5931\u8d25: "

    .line 72
    .line 73
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    iget-object p2, p0, Lg9/d;->b:Lab/b;

    .line 84
    .line 85
    invoke-virtual {p2, p1, v1}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 89
    .line 90
    :goto_2
    check-cast p2, Ljava/lang/Boolean;

    .line 91
    .line 92
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    return p1

    .line 97
    :cond_4
    :goto_3
    const/4 p1, 0x0

    .line 98
    return p1
.end method
