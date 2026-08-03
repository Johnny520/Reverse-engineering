.class public final Lbc/l;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lbc/k;

.field public final b:Lud/e;

.field public final c:Lbc/l;

.field public d:Ljava/util/List;

.field public e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lbc/l;

    .line 2
    .line 3
    invoke-static {v0}, Lmh/d;->b(Ljava/lang/Class;)Lmh/b;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>(Lud/e;Lbc/k;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 5
    .line 6
    iput-object v0, p0, Lbc/l;->d:Ljava/util/List;

    .line 7
    .line 8
    iput-object p2, p0, Lbc/l;->a:Lbc/k;

    .line 9
    .line 10
    iput-object p1, p0, Lbc/l;->b:Lud/e;

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    iput-object p1, p0, Lbc/l;->c:Lbc/l;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>(Lud/e;Lbc/l;)V
    .locals 1

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Lbc/l;->d:Ljava/util/List;

    const/4 v0, 0x0

    .line 18
    iput-object v0, p0, Lbc/l;->a:Lbc/k;

    .line 19
    iput-object p1, p0, Lbc/l;->b:Lud/e;

    .line 20
    iput-object p2, p0, Lbc/l;->c:Lbc/l;

    return-void
.end method


# virtual methods
.method public final a()Lbc/k;
    .locals 1

    .line 1
    iget-object v0, p0, Lbc/l;->c:Lbc/l;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lbc/l;->a()Lbc/k;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    iget-object v0, p0, Lbc/l;->a:Lbc/k;

    .line 11
    .line 12
    return-object v0
.end method

.method public final declared-synchronized b()Lbc/d;
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lbc/l;->e:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    monitor-exit p0

    .line 8
    return-object v1

    .line 9
    :cond_0
    :try_start_1
    iget-object v0, p0, Lbc/l;->b:Lud/e;

    .line 10
    .line 11
    iget v0, v0, Lud/e;->y:I

    .line 12
    .line 13
    const/4 v2, 0x4

    .line 14
    if-eq v0, v2, :cond_2

    .line 15
    .line 16
    const/4 v2, 0x5

    .line 17
    if-ne v0, v2, :cond_1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/4 v0, 0x0

    .line 21
    goto :goto_1

    .line 22
    :cond_2
    :goto_0
    const/4 v0, 0x1

    .line 23
    :goto_1
    if-eqz v0, :cond_3

    .line 24
    .line 25
    goto :goto_2

    .line 26
    :cond_3
    iget-object v0, p0, Lbc/l;->b:Lud/e;

    .line 27
    .line 28
    invoke-virtual {v0}, Lud/e;->V()Lbc/d;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    :goto_2
    invoke-virtual {p0}, Lbc/l;->c()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 33
    .line 34
    .line 35
    monitor-exit p0

    .line 36
    return-object v1

    .line 37
    :catchall_0
    move-exception v0

    .line 38
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 39
    throw v0
.end method

.method public final c()V
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lbc/l;->e:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Lbc/l;->a()Lbc/k;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v1, p0, Lbc/l;->b:Lud/e;

    .line 9
    .line 10
    iget-object v1, v1, Lud/e;->v:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_2

    .line 17
    .line 18
    new-instance v2, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Lbc/l;->b:Lud/e;

    .line 24
    .line 25
    iget-object v1, v1, Lud/e;->v:Ljava/util/List;

    .line 26
    .line 27
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_1

    .line 36
    .line 37
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    check-cast v3, Lud/e;

    .line 42
    .line 43
    sget-object v4, Lmd/a;->s:Lmd/a;

    .line 44
    .line 45
    iget-object v5, v3, Lmd/e;->g:Lmd/f;

    .line 46
    .line 47
    invoke-virtual {v5, v4}, Lmd/f;->a(Lmd/a;)Z

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    if-nez v4, :cond_0

    .line 52
    .line 53
    invoke-virtual {v0, v3}, Lbc/k;->b(Lud/e;)Lbc/l;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-virtual {v3}, Lbc/l;->c()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 65
    .line 66
    .line 67
    :cond_2
    iget-object v1, p0, Lbc/l;->b:Lud/e;

    .line 68
    .line 69
    iget-object v1, v1, Lud/e;->w:Ljava/util/List;

    .line 70
    .line 71
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-eqz v1, :cond_4

    .line 76
    .line 77
    new-instance v2, Ljava/util/ArrayList;

    .line 78
    .line 79
    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 80
    .line 81
    .line 82
    iget-object v1, p0, Lbc/l;->b:Lud/e;

    .line 83
    .line 84
    iget-object v1, v1, Lud/e;->w:Ljava/util/List;

    .line 85
    .line 86
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    if-eqz v3, :cond_3

    .line 95
    .line 96
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    check-cast v3, Lud/e;

    .line 101
    .line 102
    invoke-virtual {v0, v3}, Lbc/k;->b(Lud/e;)Lbc/l;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    invoke-virtual {v3}, Lbc/l;->c()V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_3
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 114
    .line 115
    .line 116
    :cond_4
    iget-object v1, p0, Lbc/l;->b:Lud/e;

    .line 117
    .line 118
    iget-object v1, v1, Lud/e;->u:Ljava/util/List;

    .line 119
    .line 120
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    if-eqz v1, :cond_8

    .line 125
    .line 126
    new-instance v2, Ljava/util/ArrayList;

    .line 127
    .line 128
    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 129
    .line 130
    .line 131
    iget-object v1, p0, Lbc/l;->b:Lud/e;

    .line 132
    .line 133
    iget-object v1, v1, Lud/e;->u:Ljava/util/List;

    .line 134
    .line 135
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    :cond_5
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 140
    .line 141
    .line 142
    move-result v3

    .line 143
    if-eqz v3, :cond_7

    .line 144
    .line 145
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    check-cast v3, Lud/g;

    .line 150
    .line 151
    sget-object v4, Lmd/a;->s:Lmd/a;

    .line 152
    .line 153
    iget-object v5, v3, Lmd/e;->g:Lmd/f;

    .line 154
    .line 155
    invoke-virtual {v5, v4}, Lmd/f;->a(Lmd/a;)Z

    .line 156
    .line 157
    .line 158
    move-result v4

    .line 159
    if-nez v4, :cond_5

    .line 160
    .line 161
    monitor-enter v0

    .line 162
    :try_start_0
    iget-object v4, v3, Lud/g;->p:Lbc/m;

    .line 163
    .line 164
    if-nez v4, :cond_6

    .line 165
    .line 166
    iget-object v4, v3, Lud/g;->k:Lud/e;

    .line 167
    .line 168
    invoke-virtual {v0, v4}, Lbc/k;->b(Lud/e;)Lbc/l;

    .line 169
    .line 170
    .line 171
    new-instance v4, Lbc/m;

    .line 172
    .line 173
    invoke-direct {v4, v3}, Lbc/m;-><init>(Lud/g;)V

    .line 174
    .line 175
    .line 176
    iput-object v4, v3, Lud/g;->p:Lbc/m;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 177
    .line 178
    goto :goto_3

    .line 179
    :catchall_0
    move-exception v1

    .line 180
    goto :goto_4

    .line 181
    :cond_6
    :goto_3
    monitor-exit v0

    .line 182
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    goto :goto_2

    .line 186
    :goto_4
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 187
    throw v1

    .line 188
    :cond_7
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 189
    .line 190
    .line 191
    :cond_8
    iget-object v1, p0, Lbc/l;->b:Lud/e;

    .line 192
    .line 193
    iget-object v1, v1, Lud/e;->t:Ljava/util/List;

    .line 194
    .line 195
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 196
    .line 197
    .line 198
    move-result v1

    .line 199
    if-eqz v1, :cond_b

    .line 200
    .line 201
    new-instance v2, Ljava/util/ArrayList;

    .line 202
    .line 203
    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 204
    .line 205
    .line 206
    iget-object v1, p0, Lbc/l;->b:Lud/e;

    .line 207
    .line 208
    iget-object v1, v1, Lud/e;->t:Ljava/util/List;

    .line 209
    .line 210
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    :cond_9
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 215
    .line 216
    .line 217
    move-result v3

    .line 218
    if-eqz v3, :cond_a

    .line 219
    .line 220
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v3

    .line 224
    check-cast v3, Lud/r;

    .line 225
    .line 226
    sget-object v4, Lmd/a;->s:Lmd/a;

    .line 227
    .line 228
    iget-object v5, v3, Lmd/e;->g:Lmd/f;

    .line 229
    .line 230
    invoke-virtual {v5, v4}, Lmd/f;->a(Lmd/a;)Z

    .line 231
    .line 232
    .line 233
    move-result v4

    .line 234
    if-nez v4, :cond_9

    .line 235
    .line 236
    invoke-virtual {v0, v3}, Lbc/k;->c(Lud/r;)Lbc/n;

    .line 237
    .line 238
    .line 239
    move-result-object v3

    .line 240
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    goto :goto_5

    .line 244
    :cond_a
    new-instance v0, Lae/d;

    .line 245
    .line 246
    const/4 v1, 0x7

    .line 247
    invoke-direct {v0, v1}, Lae/d;-><init>(I)V

    .line 248
    .line 249
    .line 250
    invoke-static {v0}, Ljava/util/Comparator;->comparing(Ljava/util/function/Function;)Ljava/util/Comparator;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->sort(Ljava/util/Comparator;)V

    .line 255
    .line 256
    .line 257
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    iput-object v0, p0, Lbc/l;->d:Ljava/util/List;

    .line 262
    .line 263
    :cond_b
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-eq p0, p1, :cond_1

    .line 2
    .line 3
    instance-of v0, p1, Lbc/l;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p1, Lbc/l;

    .line 8
    .line 9
    iget-object p1, p1, Lbc/l;->b:Lud/e;

    .line 10
    .line 11
    iget-object v0, p0, Lbc/l;->b:Lud/e;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lud/e;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p1, 0x0

    .line 21
    return p1

    .line 22
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 23
    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lbc/l;->b:Lud/e;

    .line 2
    .line 3
    invoke-virtual {v0}, Lud/e;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lbc/l;->b:Lud/e;

    .line 2
    .line 3
    iget-object v0, v0, Lud/e;->m:Lod/a;

    .line 4
    .line 5
    invoke-virtual {v0}, Lod/a;->f()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
