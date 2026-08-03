.class public final Lbc/g;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field public static final X:Lmh/b;

.field public static final Y:I

.field public static final Z:Ljava/lang/String;


# instance fields
.field public final A:Lkd/a;

.field public B:Z

.field public final C:Z

.field public final D:Ljava/util/EnumSet;

.field public final E:Lbc/b;

.field public final F:Ljava/lang/String;

.field public final G:Ljava/lang/String;

.field public final H:Lbc/a;

.field public final I:I

.field public final J:Lve/b;

.field public final K:Lad/c;

.field public final L:Ljava/util/ArrayList;

.field public final M:Ljava/util/HashMap;

.field public final N:Ljava/util/HashSet;

.field public O:Luc/b;

.field public P:Z

.field public final Q:I

.field public final R:I

.field public final S:I

.field public final T:I

.field public final U:I

.field public final V:I

.field public final W:I

.field public g:Ljava/util/ArrayList;

.field public h:Ljava/io/File;

.field public i:Ljava/io/File;

.field public j:Ljava/io/File;

.field public k:Lbc/c;

.field public l:Lbd/a;

.field public final m:Lae/d;

.field public n:I

.field public o:Z

.field public final p:Z

.field public final q:Z

.field public final r:Z

.field public s:Z

.field public final t:Z

.field public final u:Z

.field public v:Z

.field public w:Z

.field public final x:I

.field public final y:I

.field public final z:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-class v0, Lbc/g;

    .line 2
    .line 3
    invoke-static {v0}, Lmh/d;->b(Ljava/lang/Class;)Lmh/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lbc/g;->X:Lmh/b;

    .line 8
    .line 9
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    div-int/lit8 v0, v0, 0x2

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    sput v0, Lbc/g;->Y:I

    .line 25
    .line 26
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sput-object v0, Lbc/g;->Z:Ljava/lang/String;

    .line 31
    .line 32
    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lbc/g;->g:Ljava/util/ArrayList;

    .line 11
    .line 12
    new-instance v0, Lfc/c;

    .line 13
    .line 14
    invoke-direct {v0}, Lfc/c;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lbc/g;->k:Lbc/c;

    .line 18
    .line 19
    new-instance v0, Lcd/b;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lbc/g;->l:Lbd/a;

    .line 25
    .line 26
    new-instance v0, Lae/d;

    .line 27
    .line 28
    const/4 v2, 0x3

    .line 29
    invoke-direct {v0, v2}, Lae/d;-><init>(I)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lbc/g;->m:Lae/d;

    .line 33
    .line 34
    sget v0, Lbc/g;->Y:I

    .line 35
    .line 36
    iput v0, p0, Lbc/g;->n:I

    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    iput-boolean v0, p0, Lbc/g;->o:Z

    .line 40
    .line 41
    iput-boolean v1, p0, Lbc/g;->p:Z

    .line 42
    .line 43
    iput-boolean v1, p0, Lbc/g;->q:Z

    .line 44
    .line 45
    iput-boolean v1, p0, Lbc/g;->r:Z

    .line 46
    .line 47
    iput-boolean v1, p0, Lbc/g;->s:Z

    .line 48
    .line 49
    iput-boolean v1, p0, Lbc/g;->t:Z

    .line 50
    .line 51
    iput-boolean v1, p0, Lbc/g;->u:Z

    .line 52
    .line 53
    iput-boolean v1, p0, Lbc/g;->v:Z

    .line 54
    .line 55
    iput-boolean v0, p0, Lbc/g;->w:Z

    .line 56
    .line 57
    iput v1, p0, Lbc/g;->Q:I

    .line 58
    .line 59
    iput v2, p0, Lbc/g;->R:I

    .line 60
    .line 61
    const/16 v2, 0xa

    .line 62
    .line 63
    iput v2, p0, Lbc/g;->x:I

    .line 64
    .line 65
    iput v1, p0, Lbc/g;->S:I

    .line 66
    .line 67
    iput v1, p0, Lbc/g;->T:I

    .line 68
    .line 69
    const v3, 0x7fffffff

    .line 70
    .line 71
    .line 72
    iput v3, p0, Lbc/g;->y:I

    .line 73
    .line 74
    sget-object v3, Lld/b;->a:Ljava/util/List;

    .line 75
    .line 76
    iput-object v3, p0, Lbc/g;->z:Ljava/util/List;

    .line 77
    .line 78
    new-instance v3, Lkd/a;

    .line 79
    .line 80
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 81
    .line 82
    .line 83
    iput v0, v3, Lkd/a;->a:I

    .line 84
    .line 85
    iput v0, v3, Lkd/a;->b:I

    .line 86
    .line 87
    iput v0, v3, Lkd/a;->c:I

    .line 88
    .line 89
    iput v0, v3, Lkd/a;->d:I

    .line 90
    .line 91
    iput-object v3, p0, Lbc/g;->A:Lkd/a;

    .line 92
    .line 93
    new-instance v0, Ljava/util/ArrayList;

    .line 94
    .line 95
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 96
    .line 97
    .line 98
    new-instance v3, Lld/a;

    .line 99
    .line 100
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    new-instance v3, Lld/b;

    .line 107
    .line 108
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 109
    .line 110
    .line 111
    new-instance v4, Ljava/util/HashSet;

    .line 112
    .line 113
    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 114
    .line 115
    .line 116
    new-instance v4, Ljava/util/HashSet;

    .line 117
    .line 118
    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    new-instance v3, Lld/a;

    .line 125
    .line 126
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    new-instance v3, Lld/a;

    .line 133
    .line 134
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    new-instance v3, Lld/a;

    .line 141
    .line 142
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 143
    .line 144
    .line 145
    new-instance v4, Ljava/util/HashSet;

    .line 146
    .line 147
    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    new-instance v3, Ll3/w;

    .line 154
    .line 155
    const/4 v4, 0x1

    .line 156
    invoke-direct {v3, v4}, Ll3/w;-><init>(I)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    new-instance v3, La2/a;

    .line 163
    .line 164
    invoke-direct {v3, v0}, La2/a;-><init>(Ljava/util/ArrayList;)V

    .line 165
    .line 166
    .line 167
    iput-boolean v1, p0, Lbc/g;->B:Z

    .line 168
    .line 169
    iput-boolean v1, p0, Lbc/g;->C:Z

    .line 170
    .line 171
    const-class v0, Lbc/f;

    .line 172
    .line 173
    invoke-static {v0}, Ljava/util/EnumSet;->allOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    iput-object v0, p0, Lbc/g;->D:Ljava/util/EnumSet;

    .line 178
    .line 179
    iput v1, p0, Lbc/g;->U:I

    .line 180
    .line 181
    sget-object v0, Lbc/b;->g:Lbc/b;

    .line 182
    .line 183
    iput-object v0, p0, Lbc/g;->E:Lbc/b;

    .line 184
    .line 185
    sget-object v0, Lbc/g;->Z:Ljava/lang/String;

    .line 186
    .line 187
    iput-object v0, p0, Lbc/g;->F:Ljava/lang/String;

    .line 188
    .line 189
    const-string v0, "    "

    .line 190
    .line 191
    iput-object v0, p0, Lbc/g;->G:Ljava/lang/String;

    .line 192
    .line 193
    sget-object v0, Lbc/a;->k:Lbc/a;

    .line 194
    .line 195
    iput-object v0, p0, Lbc/g;->H:Lbc/a;

    .line 196
    .line 197
    iput v1, p0, Lbc/g;->V:I

    .line 198
    .line 199
    iput v2, p0, Lbc/g;->I:I

    .line 200
    .line 201
    const/4 v0, 0x2

    .line 202
    iput v0, p0, Lbc/g;->W:I

    .line 203
    .line 204
    sget-object v0, Lve/b;->a:Lve/b;

    .line 205
    .line 206
    iput-object v0, p0, Lbc/g;->J:Lve/b;

    .line 207
    .line 208
    new-instance v0, Lad/c;

    .line 209
    .line 210
    const-class v2, Lzc/a;

    .line 211
    .line 212
    invoke-static {v2}, Ljava/util/EnumSet;->allOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    .line 213
    .line 214
    .line 215
    move-result-object v2

    .line 216
    invoke-direct {v0, v2}, Lad/c;-><init>(Ljava/util/EnumSet;)V

    .line 217
    .line 218
    .line 219
    iput-object v0, p0, Lbc/g;->K:Lad/c;

    .line 220
    .line 221
    new-instance v0, Ljava/util/ArrayList;

    .line 222
    .line 223
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 224
    .line 225
    .line 226
    iput-object v0, p0, Lbc/g;->L:Ljava/util/ArrayList;

    .line 227
    .line 228
    new-instance v0, Ljava/util/HashMap;

    .line 229
    .line 230
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 231
    .line 232
    .line 233
    iput-object v0, p0, Lbc/g;->M:Ljava/util/HashMap;

    .line 234
    .line 235
    new-instance v0, Ljava/util/HashSet;

    .line 236
    .line 237
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 238
    .line 239
    .line 240
    iput-object v0, p0, Lbc/g;->N:Ljava/util/HashSet;

    .line 241
    .line 242
    new-instance v0, Luc/a;

    .line 243
    .line 244
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 245
    .line 246
    .line 247
    iput-object v0, p0, Lbc/g;->O:Luc/b;

    .line 248
    .line 249
    iput-boolean v1, p0, Lbc/g;->P:Z

    .line 250
    .line 251
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lbc/g;->D:Ljava/util/EnumSet;

    .line 2
    .line 3
    sget-object v1, Lbc/f;->h:Lbc/f;

    .line 4
    .line 5
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public final close()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iput-object v0, p0, Lbc/g;->g:Ljava/util/ArrayList;

    .line 3
    .line 4
    iget-object v1, p0, Lbc/g;->k:Lbc/c;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-interface {v1}, Ljava/io/Closeable;->close()V

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :catchall_0
    move-exception v1

    .line 13
    goto :goto_3

    .line 14
    :catch_0
    move-exception v1

    .line 15
    goto :goto_2

    .line 16
    :cond_0
    :goto_0
    iget-object v1, p0, Lbc/g;->l:Lbd/a;

    .line 17
    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-interface {v1}, Ljava/io/Closeable;->close()V

    .line 21
    .line 22
    .line 23
    :cond_1
    iget-object v1, p0, Lbc/g;->O:Luc/b;

    .line 24
    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    invoke-interface {v1}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    .line 30
    :cond_2
    :goto_1
    iput-object v0, p0, Lbc/g;->k:Lbc/c;

    .line 31
    .line 32
    iput-object v0, p0, Lbc/g;->l:Lbd/a;

    .line 33
    .line 34
    return-void

    .line 35
    :goto_2
    :try_start_1
    sget-object v2, Lbc/g;->X:Lmh/b;

    .line 36
    .line 37
    const-string v3, "Failed to close JadxArgs"

    .line 38
    .line 39
    invoke-interface {v2, v3, v1}, Lmh/b;->e(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :goto_3
    iput-object v0, p0, Lbc/g;->k:Lbc/c;

    .line 44
    .line 45
    iput-object v0, p0, Lbc/g;->l:Lbd/a;

    .line 46
    .line 47
    throw v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lbc/g;->g:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, v0, Lbc/g;->h:Ljava/io/File;

    .line 10
    .line 11
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    iget-object v3, v0, Lbc/g;->i:Ljava/io/File;

    .line 16
    .line 17
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    iget-object v4, v0, Lbc/g;->j:Ljava/io/File;

    .line 22
    .line 23
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    iget v5, v0, Lbc/g;->n:I

    .line 28
    .line 29
    iget-object v6, v0, Lbc/g;->E:Lbc/b;

    .line 30
    .line 31
    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    iget-boolean v7, v0, Lbc/g;->o:Z

    .line 36
    .line 37
    iget-boolean v8, v0, Lbc/g;->w:Z

    .line 38
    .line 39
    const/4 v9, 0x1

    .line 40
    iget v10, v0, Lbc/g;->Q:I

    .line 41
    .line 42
    if-eq v10, v9, :cond_3

    .line 43
    .line 44
    const/4 v9, 0x2

    .line 45
    if-eq v10, v9, :cond_2

    .line 46
    .line 47
    const/4 v9, 0x3

    .line 48
    if-eq v10, v9, :cond_1

    .line 49
    .line 50
    const/4 v9, 0x4

    .line 51
    if-eq v10, v9, :cond_0

    .line 52
    .line 53
    const-string v9, "null"

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    const-string v9, "IGNORE"

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    const-string v9, "READ_AND_AUTOSAVE_BEFORE_CLOSING"

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    const-string v9, "READ_AND_AUTOSAVE_EVERY_CHANGE"

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_3
    const-string v9, "READ"

    .line 66
    .line 67
    :goto_0
    const/4 v10, 0x1

    .line 68
    iget v11, v0, Lbc/g;->S:I

    .line 69
    .line 70
    if-eq v11, v10, :cond_7

    .line 71
    .line 72
    const/4 v10, 0x2

    .line 73
    if-eq v11, v10, :cond_6

    .line 74
    .line 75
    const/4 v10, 0x3

    .line 76
    if-eq v11, v10, :cond_5

    .line 77
    .line 78
    const/4 v10, 0x4

    .line 79
    if-eq v11, v10, :cond_4

    .line 80
    .line 81
    const-string v10, "null"

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_4
    const-string v10, "IGNORE"

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_5
    const-string v10, "OVERWRITE"

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_6
    const-string v10, "READ_OR_SAVE"

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_7
    const-string v10, "READ"

    .line 94
    .line 95
    :goto_1
    iget v11, v0, Lbc/g;->T:I

    .line 96
    .line 97
    invoke-static {v11}, Lbc/e;->w(I)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v11

    .line 101
    iget v12, v0, Lbc/g;->R:I

    .line 102
    .line 103
    invoke-static {v12}, Lbc/e;->x(I)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v12

    .line 107
    const/4 v13, 0x1

    .line 108
    iget v14, v0, Lbc/g;->W:I

    .line 109
    .line 110
    if-eq v14, v13, :cond_a

    .line 111
    .line 112
    const/4 v13, 0x2

    .line 113
    if-eq v14, v13, :cond_9

    .line 114
    .line 115
    const/4 v13, 0x3

    .line 116
    if-eq v14, v13, :cond_8

    .line 117
    .line 118
    const-string v13, "null"

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_8
    const-string v13, "APPLY_AND_HIDE"

    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_9
    const-string v13, "APPLY"

    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_a
    const-string v13, "DISABLE"

    .line 128
    .line 129
    :goto_2
    iget-object v14, v0, Lbc/g;->z:Ljava/util/List;

    .line 130
    .line 131
    invoke-static {v14}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v14

    .line 135
    iget-boolean v15, v0, Lbc/g;->B:Z

    .line 136
    .line 137
    move/from16 v16, v15

    .line 138
    .line 139
    iget-object v15, v0, Lbc/g;->D:Ljava/util/EnumSet;

    .line 140
    .line 141
    invoke-static {v15}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v15

    .line 145
    move-object/from16 v17, v15

    .line 146
    .line 147
    const/4 v15, 0x1

    .line 148
    move-object/from16 v18, v14

    .line 149
    .line 150
    iget v14, v0, Lbc/g;->U:I

    .line 151
    .line 152
    if-eq v14, v15, :cond_c

    .line 153
    .line 154
    const/4 v15, 0x2

    .line 155
    if-eq v14, v15, :cond_b

    .line 156
    .line 157
    const-string v14, "null"

    .line 158
    .line 159
    goto :goto_3

    .line 160
    :cond_b
    const-string v14, "JSON"

    .line 161
    .line 162
    goto :goto_3

    .line 163
    :cond_c
    const-string v14, "JAVA"

    .line 164
    .line 165
    :goto_3
    iget-object v15, v0, Lbc/g;->H:Lbc/a;

    .line 166
    .line 167
    invoke-static {v15}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v15

    .line 171
    move-object/from16 v19, v15

    .line 172
    .line 173
    iget-object v15, v0, Lbc/g;->k:Lbc/c;

    .line 174
    .line 175
    invoke-static {v15}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v15

    .line 179
    move-object/from16 v20, v15

    .line 180
    .line 181
    iget-object v15, v0, Lbc/g;->m:Lae/d;

    .line 182
    .line 183
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    new-instance v15, Lfc/b;

    .line 187
    .line 188
    invoke-direct {v15, v0}, Lfc/b;-><init>(Lbc/g;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    move-result-object v15

    .line 195
    invoke-virtual {v15}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v15

    .line 199
    move-object/from16 v21, v15

    .line 200
    .line 201
    iget-object v15, v0, Lbc/g;->M:Ljava/util/HashMap;

    .line 202
    .line 203
    invoke-static {v15}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v15

    .line 207
    move-object/from16 v22, v15

    .line 208
    .line 209
    const-string v15, ", outDir="

    .line 210
    .line 211
    move-object/from16 v23, v14

    .line 212
    .line 213
    const-string v14, ", outDirSrc="

    .line 214
    .line 215
    move-object/from16 v24, v13

    .line 216
    .line 217
    const-string v13, "JadxArgs{inputFiles="

    .line 218
    .line 219
    invoke-static {v13, v1, v15, v2, v14}, Lbc/e;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    const-string v2, ", outDirRes="

    .line 224
    .line 225
    const-string v13, ", threadsCount="

    .line 226
    .line 227
    invoke-static {v1, v3, v2, v4, v13}, Lj8/b;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    const-string v2, ", decompilationMode="

    .line 234
    .line 235
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    const-string v2, ", showInconsistentCode="

    .line 242
    .line 243
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 244
    .line 245
    .line 246
    const-string v2, ", useImports="

    .line 247
    .line 248
    const-string v3, ", skipResources="

    .line 249
    .line 250
    iget-boolean v4, v0, Lbc/g;->p:Z

    .line 251
    .line 252
    invoke-static {v1, v7, v2, v4, v3}, Lp/a;->x(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 256
    .line 257
    .line 258
    const-string v2, ", skipSources=false, includeDependencies=false, userRenamesMappingsPath=null, userRenamesMappingsMode="

    .line 259
    .line 260
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    const-string v2, ", deobfuscationOn=false, generatedRenamesMappingFile=null, generatedRenamesMappingFileMode="

    .line 267
    .line 268
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 269
    .line 270
    .line 271
    const-string v2, ", resourceNameSource="

    .line 272
    .line 273
    const-string v3, ", useSourceNameAsClassNameAlias="

    .line 274
    .line 275
    invoke-static {v1, v10, v2, v11, v3}, Lj8/b;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 279
    .line 280
    .line 281
    const-string v2, ", sourceNameRepeatLimit="

    .line 282
    .line 283
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 284
    .line 285
    .line 286
    iget v2, v0, Lbc/g;->x:I

    .line 287
    .line 288
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 289
    .line 290
    .line 291
    const-string v2, ", useKotlinMethodsForVarNames="

    .line 292
    .line 293
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 294
    .line 295
    .line 296
    move-object/from16 v13, v24

    .line 297
    .line 298
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 299
    .line 300
    .line 301
    const-string v2, ", insertDebugLines=false, extractFinally="

    .line 302
    .line 303
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 304
    .line 305
    .line 306
    iget-boolean v2, v0, Lbc/g;->r:Z

    .line 307
    .line 308
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 309
    .line 310
    .line 311
    const-string v2, ", deobfuscationMinLength=0, deobfuscationMaxLength="

    .line 312
    .line 313
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 314
    .line 315
    .line 316
    iget v2, v0, Lbc/g;->y:I

    .line 317
    .line 318
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 319
    .line 320
    .line 321
    const-string v2, ", deobfuscationWhitelist="

    .line 322
    .line 323
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 324
    .line 325
    .line 326
    move-object/from16 v2, v18

    .line 327
    .line 328
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 329
    .line 330
    .line 331
    const-string v2, ", escapeUnicode=false, replaceConsts="

    .line 332
    .line 333
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 334
    .line 335
    .line 336
    const-string v2, ", restoreSwitchOverString="

    .line 337
    .line 338
    const-string v3, ", respectBytecodeAccModifiers=false, exportGradleType=null, skipXmlPrettyPrint=false, fsCaseSensitive=false, renameFlags="

    .line 339
    .line 340
    iget-boolean v4, v0, Lbc/g;->C:Z

    .line 341
    .line 342
    move/from16 v5, v16

    .line 343
    .line 344
    invoke-static {v1, v5, v2, v4, v3}, Lp/a;->x(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    .line 345
    .line 346
    .line 347
    const-string v2, ", outputFormat="

    .line 348
    .line 349
    const-string v3, ", commentsLevel="

    .line 350
    .line 351
    move-object/from16 v4, v17

    .line 352
    .line 353
    move-object/from16 v14, v23

    .line 354
    .line 355
    invoke-static {v1, v4, v2, v14, v3}, Lj8/b;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 356
    .line 357
    .line 358
    const-string v2, ", codeCache="

    .line 359
    .line 360
    const-string v3, ", codeWriter="

    .line 361
    .line 362
    move-object/from16 v4, v19

    .line 363
    .line 364
    move-object/from16 v5, v20

    .line 365
    .line 366
    invoke-static {v1, v4, v2, v5, v3}, Lj8/b;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 367
    .line 368
    .line 369
    const-string v2, ", useDxInput=false, pluginOptions="

    .line 370
    .line 371
    const-string v3, ", cfgOutput=false, rawCFGOutput=false, useHeadersForDetectResourceExtensions=false, typeUpdatesLimitCount="

    .line 372
    .line 373
    move-object/from16 v4, v21

    .line 374
    .line 375
    move-object/from16 v5, v22

    .line 376
    .line 377
    invoke-static {v1, v4, v2, v5, v3}, Lj8/b;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 378
    .line 379
    .line 380
    const-string v2, "}"

    .line 381
    .line 382
    iget v3, v0, Lbc/g;->I:I

    .line 383
    .line 384
    invoke-static {v1, v3, v2}, Lj8/b;->j(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    .line 385
    .line 386
    .line 387
    move-result-object v1

    .line 388
    return-object v1
.end method
