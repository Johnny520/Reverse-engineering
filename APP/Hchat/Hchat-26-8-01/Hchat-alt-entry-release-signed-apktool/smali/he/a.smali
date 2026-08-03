.class public final Lhe/a;
.super Lbe/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final j:Lmh/b;


# instance fields
.field public g:Lod/a;

.field public h:Ljava/util/HashSet;

.field public i:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lhe/a;

    .line 2
    .line 3
    invoke-static {v0}, Lmh/d;->b(Ljava/lang/Class;)Lmh/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lhe/a;->j:Lmh/b;

    .line 8
    .line 9
    return-void
.end method

.method public static i(Lqd/r;Ljava/lang/String;)Z
    .locals 2

    .line 1
    const-string v0, "$this$"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x6

    .line 11
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const-string v0, "$"

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    :cond_1
    :goto_0
    invoke-static {p1}, Lkd/d;->c(Ljava/lang/String;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    iget-object p0, p0, Lqd/r;->m:Lqd/s;

    .line 35
    .line 36
    invoke-virtual {p0}, Lqd/s;->b()Lqd/k;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    iput-object p1, p0, Lqd/k;->a:Ljava/lang/String;

    .line 41
    .line 42
    return v1

    .line 43
    :cond_2
    const/4 p0, 0x0

    .line 44
    return p0
.end method

.method public static j(Lud/r;Lud/p;I)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p1, p2}, Lud/p;->S(I)Lqd/l;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    instance-of v0, p2, Lqd/m;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v0, p2

    .line 14
    check-cast v0, Lqd/m;

    .line 15
    .line 16
    iget-object v0, v0, Lqd/m;->l:Lud/p;

    .line 17
    .line 18
    iget-object v1, v0, Lud/p;->k:Lpd/k;

    .line 19
    .line 20
    sget-object v2, Lpd/k;->h:Lpd/k;

    .line 21
    .line 22
    if-ne v1, v2, :cond_1

    .line 23
    .line 24
    check-cast v0, Lpd/d;

    .line 25
    .line 26
    iget-object p0, v0, Lpd/d;->o:Ljava/lang/String;

    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_1
    sget-object v2, Lpd/k;->M:Lpd/k;

    .line 30
    .line 31
    if-ne v1, v2, :cond_2

    .line 32
    .line 33
    check-cast v0, Lpd/j;

    .line 34
    .line 35
    iget-object v0, v0, Lpd/j;->o:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, Lod/c;

    .line 38
    .line 39
    iget-object p0, p0, Lud/r;->l:Lud/e;

    .line 40
    .line 41
    iget-object p0, p0, Lud/e;->k:Lud/u;

    .line 42
    .line 43
    invoke-virtual {p0, v0}, Lud/u;->h(Lod/c;)Lud/g;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    if-eqz p0, :cond_2

    .line 48
    .line 49
    sget-object v0, Loc/c;->f:Loc/c;

    .line 50
    .line 51
    iget-object p0, p0, Lmd/e;->g:Lmd/f;

    .line 52
    .line 53
    invoke-virtual {p0, v0}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    check-cast p0, Lnc/a;

    .line 58
    .line 59
    iget-object p0, p0, Lnc/a;->h:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast p0, Ljava/lang/String;

    .line 62
    .line 63
    new-instance v0, Lpd/d;

    .line 64
    .line 65
    invoke-direct {v0, p0}, Lpd/d;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-static {v0}, Lqd/l;->Z(Lud/p;)Lqd/m;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {p1, p2, v0}, Lud/p;->b0(Lqd/l;Lqd/l;)Z

    .line 73
    .line 74
    .line 75
    return-object p0

    .line 76
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 77
    return-object p0
.end method


# virtual methods
.method public final f(Lud/u;)V
    .locals 10

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "kotlin.jvm.internal.Intrinsics"

    .line 5
    .line 6
    invoke-static {v0}, Lqd/j;->x(Ljava/lang/String;)Lqd/j;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-static {p1, v1}, Lod/a;->e(Lud/u;Lqd/j;)Lod/a;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {p1, v1}, Lud/u;->f(Lod/a;)Lud/e;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const-string v2, "(Ljava/lang/Object;Ljava/lang/String;)V"

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    goto/16 :goto_3

    .line 24
    .line 25
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    iget-object v4, p1, Lud/u;->n:Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    :cond_1
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    if-eqz v5, :cond_7

    .line 41
    .line 42
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    check-cast v5, Lud/e;

    .line 47
    .line 48
    iget-object v6, v5, Lud/e;->m:Lod/a;

    .line 49
    .line 50
    invoke-virtual {v6}, Lod/a;->k()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    const-string v8, "Intrinsics"

    .line 55
    .line 56
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v7

    .line 60
    if-eqz v7, :cond_2

    .line 61
    .line 62
    invoke-virtual {v6}, Lod/a;->f()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v7

    .line 70
    if-eqz v7, :cond_2

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_2
    iget-object v6, v6, Lod/a;->j:Ljava/lang/String;

    .line 74
    .line 75
    const-string v7, "kotlin.jvm.internal."

    .line 76
    .line 77
    invoke-virtual {v6, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 78
    .line 79
    .line 80
    move-result v6

    .line 81
    if-nez v6, :cond_3

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_3
    iget-object v6, v5, Lud/e;->t:Ljava/util/List;

    .line 85
    .line 86
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 87
    .line 88
    .line 89
    move-result v6

    .line 90
    const/4 v7, 0x5

    .line 91
    if-ge v6, v7, :cond_4

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_4
    iget-object v6, v5, Lud/e;->t:Ljava/util/List;

    .line 95
    .line 96
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 97
    .line 98
    .line 99
    move-result-object v6

    .line 100
    move v7, v3

    .line 101
    :cond_5
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 102
    .line 103
    .line 104
    move-result v8

    .line 105
    if-eqz v8, :cond_6

    .line 106
    .line 107
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v8

    .line 111
    check-cast v8, Lud/r;

    .line 112
    .line 113
    iget-object v9, v8, Lud/r;->m:Lb5/k;

    .line 114
    .line 115
    invoke-virtual {v9}, Lb5/k;->h()Z

    .line 116
    .line 117
    .line 118
    move-result v9

    .line 119
    if-eqz v9, :cond_5

    .line 120
    .line 121
    iget-object v8, v8, Lud/r;->k:Lod/d;

    .line 122
    .line 123
    iget-object v8, v8, Lod/d;->k:Ljava/lang/String;

    .line 124
    .line 125
    invoke-virtual {v8, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 126
    .line 127
    .line 128
    move-result v8

    .line 129
    if-eqz v8, :cond_5

    .line 130
    .line 131
    add-int/lit8 v7, v7, 0x1

    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_6
    const/4 v6, 0x2

    .line 135
    if-le v7, v6, :cond_1

    .line 136
    .line 137
    :goto_2
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    goto :goto_0

    .line 141
    :cond_7
    invoke-static {v1}, Lxe/s;->f(Ljava/util/List;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    move-object v1, v0

    .line 146
    check-cast v1, Lud/e;

    .line 147
    .line 148
    :goto_3
    sget-object v0, Lhe/a;->j:Lmh/b;

    .line 149
    .line 150
    if-eqz v1, :cond_c

    .line 151
    .line 152
    iget-object v4, v1, Lud/e;->m:Lod/a;

    .line 153
    .line 154
    iput-object v4, p0, Lhe/a;->g:Lod/a;

    .line 155
    .line 156
    new-instance v4, Ljava/util/HashSet;

    .line 157
    .line 158
    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 159
    .line 160
    .line 161
    iget-object v5, v1, Lud/e;->t:Ljava/util/List;

    .line 162
    .line 163
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 164
    .line 165
    .line 166
    move-result-object v5

    .line 167
    :cond_8
    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 168
    .line 169
    .line 170
    move-result v6

    .line 171
    if-eqz v6, :cond_b

    .line 172
    .line 173
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v6

    .line 177
    check-cast v6, Lud/r;

    .line 178
    .line 179
    iget-object v7, v6, Lud/r;->m:Lb5/k;

    .line 180
    .line 181
    iget-object v6, v6, Lud/r;->k:Lod/d;

    .line 182
    .line 183
    invoke-virtual {v7}, Lb5/k;->h()Z

    .line 184
    .line 185
    .line 186
    move-result v7

    .line 187
    if-nez v7, :cond_9

    .line 188
    .line 189
    goto :goto_4

    .line 190
    :cond_9
    iget-object v7, v6, Lod/d;->k:Ljava/lang/String;

    .line 191
    .line 192
    invoke-virtual {v7, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 193
    .line 194
    .line 195
    move-result v8

    .line 196
    if-nez v8, :cond_a

    .line 197
    .line 198
    const-string v8, "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V"

    .line 199
    .line 200
    invoke-virtual {v7, v8}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 201
    .line 202
    .line 203
    move-result v7

    .line 204
    if-eqz v7, :cond_8

    .line 205
    .line 206
    :cond_a
    invoke-virtual {v4, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    goto :goto_4

    .line 210
    :cond_b
    iput-object v4, p0, Lhe/a;->h:Ljava/util/HashSet;

    .line 211
    .line 212
    invoke-virtual {v4}, Ljava/util/HashSet;->size()I

    .line 213
    .line 214
    .line 215
    move-result v2

    .line 216
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 217
    .line 218
    .line 219
    move-result-object v2

    .line 220
    const-string v4, "Kotlin Intrinsics class: {}, methods: {}"

    .line 221
    .line 222
    invoke-interface {v0, v1, v4, v2}, Lmh/b;->y(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    goto :goto_5

    .line 226
    :cond_c
    const/4 v1, 0x0

    .line 227
    iput-object v1, p0, Lhe/a;->g:Lod/a;

    .line 228
    .line 229
    const-string v1, "Kotlin Intrinsics class not found"

    .line 230
    .line 231
    invoke-interface {v0, v1}, Lmh/b;->l(Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    :goto_5
    iget-object p1, p1, Lud/u;->a:Lbc/g;

    .line 235
    .line 236
    iget p1, p1, Lbc/g;->W:I

    .line 237
    .line 238
    const/4 v0, 0x3

    .line 239
    if-ne p1, v0, :cond_d

    .line 240
    .line 241
    const/4 v3, 0x1

    .line 242
    :cond_d
    iput-boolean v3, p0, Lhe/a;->i:Z

    .line 243
    .line 244
    return-void
.end method

.method public final h(Lud/e;)Z
    .locals 6

    .line 1
    iget-object v0, p0, Lhe/a;->g:Lod/a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return p1

    .line 7
    :cond_0
    iget-object p1, p1, Lud/e;->t:Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_5

    .line 18
    .line 19
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Lud/r;

    .line 24
    .line 25
    iget-boolean v1, v0, Lud/r;->p:Z

    .line 26
    .line 27
    if-nez v1, :cond_1

    .line 28
    .line 29
    sget-object v1, Lmd/b;->c:Lmd/b;

    .line 30
    .line 31
    iget-object v2, v0, Lmd/e;->g:Lmd/f;

    .line 32
    .line 33
    invoke-virtual {v2, v1}, Lmd/f;->b(Loc/a;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    iget-object v1, v0, Lud/r;->z:Ljava/util/List;

    .line 41
    .line 42
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-eqz v2, :cond_1

    .line 51
    .line 52
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    check-cast v2, Lud/a;

    .line 57
    .line 58
    iget-object v2, v2, Lud/a;->l:Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    :cond_4
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-eqz v3, :cond_3

    .line 69
    .line 70
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    check-cast v3, Lud/p;

    .line 75
    .line 76
    iget-object v4, v3, Lud/p;->k:Lpd/k;

    .line 77
    .line 78
    sget-object v5, Lpd/k;->O:Lpd/k;

    .line 79
    .line 80
    if-ne v4, v5, :cond_4

    .line 81
    .line 82
    :try_start_0
    invoke-virtual {p0, v0, v3}, Lhe/a;->k(Lud/r;Lud/p;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 83
    .line 84
    .line 85
    goto :goto_1

    .line 86
    :catch_0
    move-exception v3

    .line 87
    const-string v4, "Failed to extract var names"

    .line 88
    .line 89
    invoke-virtual {v0, v4, v3}, Lnd/b0;->M(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_5
    const/4 p1, 0x1

    .line 94
    return p1
.end method

.method public final k(Lud/r;Lud/p;)V
    .locals 5

    .line 1
    iget-object v0, p2, Lud/p;->m:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x2

    .line 8
    if-ge v0, v1, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    move-object v2, p2

    .line 12
    check-cast v2, Lpd/n;

    .line 13
    .line 14
    iget-object v2, v2, Lpd/n;->p:Lod/d;

    .line 15
    .line 16
    iget-object v3, p0, Lhe/a;->h:Ljava/util/HashSet;

    .line 17
    .line 18
    invoke-virtual {v3, v2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-nez v2, :cond_1

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    const/4 v2, 0x0

    .line 26
    invoke-virtual {p2, v2}, Lud/p;->S(I)Lqd/l;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    instance-of v4, v3, Lqd/r;

    .line 34
    .line 35
    if-nez v4, :cond_2

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_2
    check-cast v3, Lqd/r;

    .line 39
    .line 40
    if-ne v0, v1, :cond_3

    .line 41
    .line 42
    const/4 v0, 0x1

    .line 43
    invoke-static {p1, p2, v0}, Lhe/a;->j(Lud/r;Lud/p;I)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    if-eqz p1, :cond_4

    .line 48
    .line 49
    invoke-static {v3, p1}, Lhe/a;->i(Lqd/r;Ljava/lang/String;)Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    goto :goto_0

    .line 54
    :cond_3
    const/4 v4, 0x3

    .line 55
    if-ne v0, v4, :cond_4

    .line 56
    .line 57
    invoke-static {p1, p2, v1}, Lhe/a;->j(Lud/r;Lud/p;I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    if-eqz p1, :cond_4

    .line 62
    .line 63
    invoke-static {v3, p1}, Lhe/a;->i(Lqd/r;Ljava/lang/String;)Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    :cond_4
    :goto_0
    if-eqz v2, :cond_5

    .line 68
    .line 69
    iget-boolean p1, p0, Lhe/a;->i:Z

    .line 70
    .line 71
    if-eqz p1, :cond_5

    .line 72
    .line 73
    sget-object p1, Lmd/a;->s:Lmd/a;

    .line 74
    .line 75
    invoke-virtual {p2, p1}, Lmd/e;->w(Lmd/a;)V

    .line 76
    .line 77
    .line 78
    :cond_5
    :goto_1
    return-void
.end method
