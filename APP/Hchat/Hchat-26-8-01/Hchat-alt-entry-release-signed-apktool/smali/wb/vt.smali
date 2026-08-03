.class public abstract Lwb/vt;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Ljava/util/concurrent/ConcurrentHashMap;

.field public static volatile b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lwb/vt;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 7
    .line 8
    return-void
.end method

.method public static a(Landroid/content/Context;)Lwb/yt;
    .locals 10

    .line 1
    sget-object v0, Lwb/vt;->b:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sput-object v1, Lwb/vt;->b:Ljava/lang/String;

    .line 5
    .line 6
    if-eqz v0, :cond_5

    .line 7
    .line 8
    sget-object v2, Lwb/vt;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 9
    .line 10
    invoke-virtual {v2, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    check-cast v2, Lwb/yt;

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    return-object v2

    .line 19
    :cond_0
    sget-object v2, Lfb/g1;->a:Lfb/g1;

    .line 20
    .line 21
    new-instance v3, Ljava/io/File;

    .line 22
    .line 23
    invoke-static {p0}, Lfb/g1;->p(Landroid/content/Context;)Ljava/io/File;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-static {v0}, Lfb/g1;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const-string v4, ".json"

    .line 32
    .line 33
    invoke-virtual {v0, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-direct {v3, p0, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    :try_start_0
    invoke-virtual {v3}, Ljava/io/File;->isFile()Z

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    if-eqz p0, :cond_1

    .line 45
    .line 46
    sget-object p0, Log/a;->a:Ljava/nio/charset/Charset;

    .line 47
    .line 48
    invoke-static {v3, p0}, Ldg/l;->h0(Ljava/io/File;Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-virtual {v2, p0}, Lfb/g1;->c(Ljava/lang/String;)Lfb/d1;

    .line 53
    .line 54
    .line 55
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    goto :goto_1

    .line 57
    :catchall_0
    move-exception p0

    .line 58
    goto :goto_0

    .line 59
    :cond_1
    move-object p0, v1

    .line 60
    goto :goto_1

    .line 61
    :goto_0
    new-instance v0, Lsf/f;

    .line 62
    .line 63
    invoke-direct {v0, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 64
    .line 65
    .line 66
    move-object p0, v0

    .line 67
    :goto_1
    nop

    .line 68
    instance-of v0, p0, Lsf/f;

    .line 69
    .line 70
    if-eqz v0, :cond_2

    .line 71
    .line 72
    move-object p0, v1

    .line 73
    :cond_2
    check-cast p0, Lfb/d1;

    .line 74
    .line 75
    if-eqz p0, :cond_3

    .line 76
    .line 77
    sget-object v0, Lfb/g1;->a:Lfb/g1;

    .line 78
    .line 79
    iget-object v0, p0, Lfb/d1;->e:Ljava/util/List;

    .line 80
    .line 81
    invoke-static {v0}, Lfb/g1;->h(Ljava/util/List;)Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-eqz v0, :cond_3

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_3
    move-object p0, v1

    .line 89
    :goto_2
    if-eqz p0, :cond_4

    .line 90
    .line 91
    invoke-static {p0}, Lwb/vt;->d(Lfb/d1;)Lwb/yt;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    :cond_4
    return-object v1

    .line 96
    :cond_5
    sget-object v0, Lfb/g1;->a:Lfb/g1;

    .line 97
    .line 98
    invoke-static {p0}, Lfb/g1;->i(Landroid/content/Context;)Ljava/util/List;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    :cond_6
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-eqz v0, :cond_f

    .line 111
    .line 112
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    move-object v2, v0

    .line 117
    check-cast v2, Lfb/d1;

    .line 118
    .line 119
    iget-object v3, v2, Lfb/d1;->o:Lfb/c1;

    .line 120
    .line 121
    const/4 v4, 0x0

    .line 122
    if-eqz v3, :cond_e

    .line 123
    .line 124
    iget-boolean v5, v3, Lfb/c1;->f:Z

    .line 125
    .line 126
    if-eqz v5, :cond_7

    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_7
    move-object v3, v1

    .line 130
    :goto_3
    if-eqz v3, :cond_e

    .line 131
    .line 132
    iget-object v2, v2, Lfb/d1;->e:Ljava/util/List;

    .line 133
    .line 134
    if-eqz v2, :cond_8

    .line 135
    .line 136
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 137
    .line 138
    .line 139
    move-result v5

    .line 140
    if-eqz v5, :cond_8

    .line 141
    .line 142
    goto :goto_6

    .line 143
    :cond_8
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    :cond_9
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 148
    .line 149
    .line 150
    move-result v5

    .line 151
    if-eqz v5, :cond_e

    .line 152
    .line 153
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v5

    .line 157
    check-cast v5, Lfb/c;

    .line 158
    .line 159
    iget-object v6, v5, Lfb/c;->d:Ljava/lang/String;

    .line 160
    .line 161
    iget-object v7, v3, Lfb/c1;->a:Ljava/lang/String;

    .line 162
    .line 163
    invoke-static {v6, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v6

    .line 167
    const/4 v7, 0x1

    .line 168
    if-eqz v6, :cond_d

    .line 169
    .line 170
    iget-object v6, v5, Lfb/c;->n:Ljava/lang/String;

    .line 171
    .line 172
    const-string v8, "interrupted"

    .line 173
    .line 174
    invoke-static {v6, v8}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-result v6

    .line 178
    if-nez v6, :cond_c

    .line 179
    .line 180
    iget-object v6, v5, Lfb/c;->n:Ljava/lang/String;

    .line 181
    .line 182
    const-string v9, "error"

    .line 183
    .line 184
    invoke-static {v6, v9}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    move-result v6

    .line 188
    if-nez v6, :cond_c

    .line 189
    .line 190
    iget-object v5, v5, Lfb/c;->j:Ljava/util/List;

    .line 191
    .line 192
    if-eqz v5, :cond_a

    .line 193
    .line 194
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 195
    .line 196
    .line 197
    move-result v6

    .line 198
    if-eqz v6, :cond_a

    .line 199
    .line 200
    goto :goto_4

    .line 201
    :cond_a
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 202
    .line 203
    .line 204
    move-result-object v5

    .line 205
    :cond_b
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 206
    .line 207
    .line 208
    move-result v6

    .line 209
    if-eqz v6, :cond_d

    .line 210
    .line 211
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v6

    .line 215
    check-cast v6, Lfb/q1;

    .line 216
    .line 217
    iget-object v6, v6, Lfb/q1;->g:Ljava/lang/String;

    .line 218
    .line 219
    invoke-virtual {v6, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    move-result v6

    .line 223
    if-eqz v6, :cond_b

    .line 224
    .line 225
    :cond_c
    move v5, v7

    .line 226
    goto :goto_5

    .line 227
    :cond_d
    :goto_4
    move v5, v4

    .line 228
    :goto_5
    if-eqz v5, :cond_9

    .line 229
    .line 230
    move v4, v7

    .line 231
    :cond_e
    :goto_6
    if-eqz v4, :cond_6

    .line 232
    .line 233
    goto :goto_7

    .line 234
    :cond_f
    move-object v0, v1

    .line 235
    :goto_7
    check-cast v0, Lfb/d1;

    .line 236
    .line 237
    if-eqz v0, :cond_10

    .line 238
    .line 239
    invoke-static {v0}, Lwb/vt;->d(Lfb/d1;)Lwb/yt;

    .line 240
    .line 241
    .line 242
    move-result-object p0

    .line 243
    return-object p0

    .line 244
    :cond_10
    return-object v1
.end method

.method public static b()Lwb/yt;
    .locals 13

    .line 1
    sget-object v0, Lfb/g1;->a:Lfb/g1;

    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    .line 5
    .line 6
    move-result-wide v4

    .line 7
    new-instance v1, Lfb/d1;

    .line 8
    .line 9
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    const-string v2, ""

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    const-string v6, "-"

    .line 24
    .line 25
    invoke-static {v0, v6, v2, v3}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    const/4 v11, 0x0

    .line 30
    const v12, 0xffc0

    .line 31
    .line 32
    .line 33
    const-string v3, "\u65b0\u5bf9\u8bdd"

    .line 34
    .line 35
    sget-object v8, Ltf/t;->g:Ltf/t;

    .line 36
    .line 37
    const/4 v9, 0x0

    .line 38
    const/4 v10, 0x0

    .line 39
    move-wide v6, v4

    .line 40
    invoke-direct/range {v1 .. v12}, Lfb/d1;-><init>(Ljava/lang/String;Ljava/lang/String;JJLjava/util/List;Lfb/y;Ljava/lang/String;Ljava/lang/String;I)V

    .line 41
    .line 42
    .line 43
    invoke-static {v1}, Lwb/vt;->d(Lfb/d1;)Lwb/yt;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    return-object v0
.end method

.method public static c()Ljava/util/ArrayList;
    .locals 5

    .line 1
    sget-object v0, Lwb/vt;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    check-cast v0, Ljava/lang/Iterable;

    .line 11
    .line 12
    new-instance v1, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-static {v0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, Lwb/yt;

    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-static {v2}, Lwb/yt;->N(Lwb/yt;)Lfb/d1;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    :cond_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-eqz v2, :cond_2

    .line 62
    .line 63
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    move-object v3, v2

    .line 68
    check-cast v3, Lfb/d1;

    .line 69
    .line 70
    sget-object v4, Lfb/g1;->a:Lfb/g1;

    .line 71
    .line 72
    iget-object v3, v3, Lfb/d1;->e:Ljava/util/List;

    .line 73
    .line 74
    invoke-static {v3}, Lfb/g1;->h(Ljava/util/List;)Z

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    if-eqz v3, :cond_1

    .line 79
    .line 80
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_2
    return-object v0
.end method

.method public static d(Lfb/d1;)Lwb/yt;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lfb/d1;->a:Ljava/lang/String;

    .line 5
    .line 6
    new-instance v1, Lnb/a;

    .line 7
    .line 8
    const/16 v2, 0x1b

    .line 9
    .line 10
    invoke-direct {v1, p0, v2}, Lnb/a;-><init>(Ljava/lang/Object;I)V

    .line 11
    .line 12
    .line 13
    new-instance p0, Lbc/j;

    .line 14
    .line 15
    const/16 v2, 0xd

    .line 16
    .line 17
    invoke-direct {p0, v1, v2}, Lbc/j;-><init>(Ljava/lang/Object;I)V

    .line 18
    .line 19
    .line 20
    sget-object v1, Lwb/vt;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 21
    .line 22
    invoke-virtual {v1, v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    check-cast p0, Lwb/yt;

    .line 30
    .line 31
    return-object p0
.end method

.method public static e()Ljava/util/LinkedHashSet;
    .locals 4

    .line 1
    sget-object v0, Lwb/vt;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    check-cast v0, Ljava/lang/Iterable;

    .line 11
    .line 12
    new-instance v1, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    move-object v3, v2

    .line 32
    check-cast v3, Lwb/yt;

    .line 33
    .line 34
    invoke-virtual {v3}, Lwb/yt;->L()Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eqz v3, :cond_0

    .line 39
    .line 40
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-eqz v2, :cond_2

    .line 58
    .line 59
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    check-cast v2, Lwb/yt;

    .line 64
    .line 65
    iget-object v2, v2, Lwb/yt;->a:Ljava/lang/String;

    .line 66
    .line 67
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_2
    return-object v0
.end method
