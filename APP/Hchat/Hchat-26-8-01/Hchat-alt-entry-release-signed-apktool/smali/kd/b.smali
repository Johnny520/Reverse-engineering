.class public final Lkd/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final f:Lmh/b;

.field public static final g:Ljava/nio/charset/Charset;


# instance fields
.field public final a:Ljava/nio/file/Path;

.field public final b:Ljava/util/HashMap;

.field public final c:Ljava/util/HashMap;

.field public final d:Ljava/util/HashMap;

.field public final e:Ljava/util/HashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lkd/b;

    .line 2
    .line 3
    invoke-static {v0}, Lmh/d;->b(Ljava/lang/Class;)Lmh/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lkd/b;->f:Lmh/b;

    .line 8
    .line 9
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 10
    .line 11
    sput-object v0, Lkd/b;->g:Ljava/nio/charset/Charset;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Ljava/nio/file/Path;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lkd/b;->b:Ljava/util/HashMap;

    .line 10
    .line 11
    new-instance v0, Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lkd/b;->c:Ljava/util/HashMap;

    .line 17
    .line 18
    new-instance v0, Ljava/util/HashMap;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lkd/b;->d:Ljava/util/HashMap;

    .line 24
    .line 25
    new-instance v0, Ljava/util/HashMap;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lkd/b;->e:Ljava/util/HashMap;

    .line 31
    .line 32
    iput-object p1, p0, Lkd/b;->a:Ljava/nio/file/Path;

    .line 33
    .line 34
    return-void
.end method

.method public static a(Lud/u;)Lkd/b;
    .locals 5

    .line 1
    iget-object v0, p0, Lud/u;->a:Lbc/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, v0, Lbc/g;->g:Ljava/util/ArrayList;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/io/File;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-interface {v0}, Ljava/nio/file/Path;->toAbsolutePath()Ljava/nio/file/Path;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sget-object v2, Lbf/b;->a:Lmh/b;

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/nio/file/Path;->getFileName()Ljava/nio/file/Path;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-interface {v2}, Ljava/nio/file/Path;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    const/16 v3, 0x2e

    .line 34
    .line 35
    invoke-virtual {v2, v3}, Ljava/lang/String;->lastIndexOf(I)I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    const/4 v4, -0x1

    .line 40
    if-ne v3, v4, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    invoke-virtual {v2, v1, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    :goto_0
    invoke-interface {v0}, Ljava/nio/file/Path;->getParent()Ljava/nio/file/Path;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    const-string v1, ".jobf"

    .line 52
    .line 53
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-interface {v0, v1}, Ljava/nio/file/Path;->resolve(Ljava/lang/String;)Ljava/nio/file/Path;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iget-object p0, p0, Lud/u;->a:Lbc/g;

    .line 62
    .line 63
    iget p0, p0, Lbc/g;->S:I

    .line 64
    .line 65
    const/4 v1, 0x4

    .line 66
    if-eq p0, v1, :cond_1

    .line 67
    .line 68
    sget-object p0, Lkd/b;->f:Lmh/b;

    .line 69
    .line 70
    const-string v1, "Deobfuscation map file set to: {}"

    .line 71
    .line 72
    invoke-interface {p0, v0, v1}, Lmh/b;->x(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    :cond_1
    new-instance p0, Lkd/b;

    .line 76
    .line 77
    invoke-direct {p0, v0}, Lkd/b;-><init>(Ljava/nio/file/Path;)V

    .line 78
    .line 79
    .line 80
    return-object p0
.end method


# virtual methods
.method public final b(Lud/u;)V
    .locals 8

    .line 1
    iget-object v0, p1, Lud/u;->p:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_4

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lud/s;

    .line 18
    .line 19
    iget-object v2, v1, Lud/s;->n:Ljava/util/ArrayList;

    .line 20
    .line 21
    iget-object v3, v1, Lud/s;->l:Lod/e;

    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    iget-object v2, v1, Lud/s;->p:Lod/e;

    .line 30
    .line 31
    const/4 v4, 0x0

    .line 32
    if-ne v3, v2, :cond_1

    .line 33
    .line 34
    move v2, v4

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    iget-object v5, v3, Lod/e;->a:Lod/e;

    .line 37
    .line 38
    iget-object v2, v2, Lod/e;->a:Lod/e;

    .line 39
    .line 40
    invoke-static {v5, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    xor-int/lit8 v2, v2, 0x1

    .line 45
    .line 46
    :goto_1
    iget-object v5, p0, Lkd/b;->b:Ljava/util/HashMap;

    .line 47
    .line 48
    if-eqz v2, :cond_2

    .line 49
    .line 50
    iget-object v2, v3, Lod/e;->b:Ljava/lang/String;

    .line 51
    .line 52
    iget-object v1, v1, Lud/s;->p:Lod/e;

    .line 53
    .line 54
    iget-object v1, v1, Lod/e;->b:Ljava/lang/String;

    .line 55
    .line 56
    invoke-virtual {v5, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    iget-object v2, v1, Lud/s;->p:Lod/e;

    .line 61
    .line 62
    if-ne v3, v2, :cond_3

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_3
    iget-object v4, v3, Lod/e;->c:Ljava/lang/String;

    .line 66
    .line 67
    iget-object v2, v2, Lod/e;->c:Ljava/lang/String;

    .line 68
    .line 69
    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    xor-int/lit8 v4, v2, 0x1

    .line 74
    .line 75
    :goto_2
    if-eqz v4, :cond_0

    .line 76
    .line 77
    iget-object v2, v3, Lod/e;->b:Ljava/lang/String;

    .line 78
    .line 79
    iget-object v1, v1, Lud/s;->p:Lod/e;

    .line 80
    .line 81
    iget-object v1, v1, Lod/e;->c:Ljava/lang/String;

    .line 82
    .line 83
    invoke-virtual {v5, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_4
    iget-object p1, p1, Lud/u;->n:Ljava/util/ArrayList;

    .line 88
    .line 89
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    :cond_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-eqz v0, :cond_a

    .line 98
    .line 99
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    check-cast v0, Lud/e;

    .line 104
    .line 105
    iget-object v1, v0, Lud/e;->m:Lod/a;

    .line 106
    .line 107
    invoke-virtual {v1}, Lod/a;->n()Z

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    if-eqz v2, :cond_6

    .line 112
    .line 113
    invoke-virtual {v1}, Lod/a;->q()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    invoke-virtual {v1}, Lod/a;->k()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    iget-object v3, p0, Lkd/b;->c:Ljava/util/HashMap;

    .line 122
    .line 123
    invoke-virtual {v3, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    :cond_6
    iget-object v1, v0, Lud/e;->u:Ljava/util/List;

    .line 127
    .line 128
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    :cond_7
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 133
    .line 134
    .line 135
    move-result v2

    .line 136
    if-eqz v2, :cond_8

    .line 137
    .line 138
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    check-cast v2, Lud/g;

    .line 143
    .line 144
    iget-object v3, v2, Lud/g;->l:Lod/c;

    .line 145
    .line 146
    invoke-virtual {v3}, Lod/c;->b()Z

    .line 147
    .line 148
    .line 149
    move-result v4

    .line 150
    if-eqz v4, :cond_7

    .line 151
    .line 152
    iget-object v4, v3, Lod/c;->g:Lod/a;

    .line 153
    .line 154
    invoke-virtual {v4}, Lod/a;->q()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v4

    .line 158
    iget-object v5, v3, Lod/c;->h:Ljava/lang/String;

    .line 159
    .line 160
    iget-object v3, v3, Lod/c;->i:Lqd/j;

    .line 161
    .line 162
    invoke-static {v3}, Lfd/j;->b(Lqd/j;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    const-string v6, "."

    .line 167
    .line 168
    const-string v7, ":"

    .line 169
    .line 170
    invoke-static {v4, v6, v5, v7, v3}, Lbc/e;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    iget-object v2, v2, Lud/g;->l:Lod/c;

    .line 175
    .line 176
    iget-object v2, v2, Lod/c;->j:Ljava/lang/String;

    .line 177
    .line 178
    iget-object v4, p0, Lkd/b;->d:Ljava/util/HashMap;

    .line 179
    .line 180
    invoke-virtual {v4, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    goto :goto_3

    .line 184
    :cond_8
    iget-object v0, v0, Lud/e;->t:Ljava/util/List;

    .line 185
    .line 186
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    :cond_9
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 191
    .line 192
    .line 193
    move-result v1

    .line 194
    if-eqz v1, :cond_5

    .line 195
    .line 196
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    check-cast v1, Lud/r;

    .line 201
    .line 202
    iget-object v1, v1, Lud/r;->k:Lod/d;

    .line 203
    .line 204
    iget-object v2, v1, Lod/d;->g:Ljava/lang/String;

    .line 205
    .line 206
    iget-object v3, v1, Lod/d;->n:Ljava/lang/String;

    .line 207
    .line 208
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result v2

    .line 212
    if-nez v2, :cond_9

    .line 213
    .line 214
    iget-object v2, v1, Lod/d;->l:Ljava/lang/String;

    .line 215
    .line 216
    iget-object v1, v1, Lod/d;->n:Ljava/lang/String;

    .line 217
    .line 218
    iget-object v3, p0, Lkd/b;->e:Ljava/util/HashMap;

    .line 219
    .line 220
    invoke-virtual {v3, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    goto :goto_4

    .line 224
    :cond_a
    return-void
.end method

.method public final c()V
    .locals 5

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lkd/b;->b:Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Ljava/util/Map$Entry;

    .line 27
    .line 28
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    filled-new-array {v3, v2}, [Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    const-string v3, "p %s = %s"

    .line 41
    .line 42
    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    iget-object v1, p0, Lkd/b;->c:Ljava/util/HashMap;

    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-eqz v2, :cond_1

    .line 65
    .line 66
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    check-cast v2, Ljava/util/Map$Entry;

    .line 71
    .line 72
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    filled-new-array {v3, v2}, [Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    const-string v3, "c %s = %s"

    .line 85
    .line 86
    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_1
    iget-object v1, p0, Lkd/b;->d:Ljava/util/HashMap;

    .line 95
    .line 96
    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    if-eqz v2, :cond_2

    .line 109
    .line 110
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    check-cast v2, Ljava/util/Map$Entry;

    .line 115
    .line 116
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    filled-new-array {v3, v2}, [Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    const-string v3, "f %s = %s"

    .line 129
    .line 130
    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_2
    iget-object v1, p0, Lkd/b;->e:Ljava/util/HashMap;

    .line 139
    .line 140
    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 149
    .line 150
    .line 151
    move-result v2

    .line 152
    if-eqz v2, :cond_3

    .line 153
    .line 154
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    check-cast v2, Ljava/util/Map$Entry;

    .line 159
    .line 160
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v3

    .line 164
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    filled-new-array {v3, v2}, [Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    const-string v3, "m %s = %s"

    .line 173
    .line 174
    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    goto :goto_3

    .line 182
    :cond_3
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 186
    .line 187
    .line 188
    move-result v1

    .line 189
    sget-object v2, Lkd/b;->f:Lmh/b;

    .line 190
    .line 191
    if-eqz v1, :cond_5

    .line 192
    .line 193
    invoke-interface {v2}, Lmh/b;->d()Z

    .line 194
    .line 195
    .line 196
    move-result v0

    .line 197
    if-eqz v0, :cond_4

    .line 198
    .line 199
    const-string v0, "Deobfuscation map is empty, not saving it"

    .line 200
    .line 201
    invoke-interface {v2, v0}, Lmh/b;->l(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    :cond_4
    return-void

    .line 205
    :cond_5
    const/4 v1, 0x3

    .line 206
    new-array v1, v1, [Ljava/nio/file/OpenOption;

    .line 207
    .line 208
    sget-object v3, Ljava/nio/file/StandardOpenOption;->WRITE:Ljava/nio/file/StandardOpenOption;

    .line 209
    .line 210
    const/4 v4, 0x0

    .line 211
    aput-object v3, v1, v4

    .line 212
    .line 213
    sget-object v3, Ljava/nio/file/StandardOpenOption;->CREATE:Ljava/nio/file/StandardOpenOption;

    .line 214
    .line 215
    const/4 v4, 0x1

    .line 216
    aput-object v3, v1, v4

    .line 217
    .line 218
    sget-object v3, Ljava/nio/file/StandardOpenOption;->TRUNCATE_EXISTING:Ljava/nio/file/StandardOpenOption;

    .line 219
    .line 220
    const/4 v4, 0x2

    .line 221
    aput-object v3, v1, v4

    .line 222
    .line 223
    iget-object v3, p0, Lkd/b;->a:Ljava/nio/file/Path;

    .line 224
    .line 225
    sget-object v4, Lkd/b;->g:Ljava/nio/charset/Charset;

    .line 226
    .line 227
    invoke-static {v3, v0, v4, v1}, Ljava/nio/file/Files;->write(Ljava/nio/file/Path;Ljava/lang/Iterable;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)Ljava/nio/file/Path;

    .line 228
    .line 229
    .line 230
    const-string v0, "Deobfuscation map file saved as: {}"

    .line 231
    .line 232
    invoke-interface {v2, v3, v0}, Lmh/b;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    return-void
.end method
