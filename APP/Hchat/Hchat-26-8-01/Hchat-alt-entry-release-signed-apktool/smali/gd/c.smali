.class public abstract Lgd/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Lmh/b;

.field public static final b:Lh6/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-class v0, Lgd/c;

    .line 2
    .line 3
    invoke-static {v0}, Lmh/d;->b(Ljava/lang/Class;)Lmh/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lgd/c;->a:Lmh/b;

    .line 8
    .line 9
    invoke-static {}, Lac/p;->p()Lh6/g;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x6

    .line 14
    iput v1, v0, Lh6/g;->c:I

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    iput-boolean v1, v0, Lh6/g;->i:Z

    .line 18
    .line 19
    invoke-virtual {v0}, Lh6/g;->a()Lh6/f;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lgd/c;->b:Lh6/f;

    .line 24
    .line 25
    return-void
.end method

.method public static a(Lud/u;)V
    .locals 8

    .line 1
    new-instance v0, Lid/a;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lud/u;->n:Ljava/util/ArrayList;

    .line 7
    .line 8
    new-instance v2, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object v2, v0, Lid/a;->a:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_6

    .line 28
    .line 29
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Lud/e;

    .line 34
    .line 35
    iget-object v3, v2, Lud/e;->m:Lod/a;

    .line 36
    .line 37
    new-instance v4, Lb/e;

    .line 38
    .line 39
    const/16 v5, 0xe

    .line 40
    .line 41
    const/4 v6, 0x0

    .line 42
    invoke-direct {v4, v5, v6}, Lb/e;-><init>(IZ)V

    .line 43
    .line 44
    .line 45
    iget-object v5, v3, Lod/a;->g:Lqd/j;

    .line 46
    .line 47
    invoke-virtual {v5}, Lqd/j;->l()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v3}, Lod/a;->f()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2}, Lud/e;->a0()Lud/e;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    iget-object v5, v5, Lud/e;->m:Lod/a;

    .line 58
    .line 59
    invoke-virtual {v5}, Lod/a;->g()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v3}, Lod/a;->o()Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-eqz v3, :cond_0

    .line 67
    .line 68
    invoke-virtual {v2}, Lud/e;->a0()Lud/e;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    iget-object v3, v3, Lud/e;->m:Lod/a;

    .line 73
    .line 74
    iget-object v3, v3, Lod/a;->j:Ljava/lang/String;

    .line 75
    .line 76
    :cond_0
    iget-object v3, v2, Lud/e;->u:Ljava/util/List;

    .line 77
    .line 78
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    if-eqz v5, :cond_1

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_1
    new-instance v5, Ljava/util/ArrayList;

    .line 86
    .line 87
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 88
    .line 89
    .line 90
    move-result v6

    .line 91
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 92
    .line 93
    .line 94
    iput-object v5, v4, Lb/e;->h:Ljava/lang/Object;

    .line 95
    .line 96
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 101
    .line 102
    .line 103
    move-result v5

    .line 104
    if-eqz v5, :cond_2

    .line 105
    .line 106
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    check-cast v5, Lud/g;

    .line 111
    .line 112
    new-instance v6, La2/a;

    .line 113
    .line 114
    const/16 v7, 0x14

    .line 115
    .line 116
    invoke-direct {v6, v7}, La2/a;-><init>(I)V

    .line 117
    .line 118
    .line 119
    iget-object v5, v5, Lud/g;->l:Lod/c;

    .line 120
    .line 121
    iget-object v5, v5, Lod/c;->h:Ljava/lang/String;

    .line 122
    .line 123
    iget-object v5, v4, Lb/e;->h:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v5, Ljava/util/ArrayList;

    .line 126
    .line 127
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_2
    :goto_2
    iget-object v2, v2, Lud/e;->t:Ljava/util/List;

    .line 132
    .line 133
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 134
    .line 135
    .line 136
    move-result v3

    .line 137
    if-eqz v3, :cond_3

    .line 138
    .line 139
    goto :goto_5

    .line 140
    :cond_3
    new-instance v3, Ljava/util/ArrayList;

    .line 141
    .line 142
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 143
    .line 144
    .line 145
    move-result v5

    .line 146
    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 147
    .line 148
    .line 149
    iput-object v3, v4, Lb/e;->i:Ljava/lang/Object;

    .line 150
    .line 151
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 156
    .line 157
    .line 158
    move-result v3

    .line 159
    if-eqz v3, :cond_5

    .line 160
    .line 161
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    check-cast v3, Lud/r;

    .line 166
    .line 167
    new-instance v5, La2/a;

    .line 168
    .line 169
    const/16 v6, 0x15

    .line 170
    .line 171
    invoke-direct {v5, v6}, La2/a;-><init>(I)V

    .line 172
    .line 173
    .line 174
    iget-object v6, v3, Lud/r;->k:Lod/d;

    .line 175
    .line 176
    iget-object v6, v6, Lod/d;->k:Ljava/lang/String;

    .line 177
    .line 178
    iget-boolean v6, v3, Lud/r;->p:Z

    .line 179
    .line 180
    if-eqz v6, :cond_4

    .line 181
    .line 182
    const-wide/16 v6, 0x0

    .line 183
    .line 184
    goto :goto_4

    .line 185
    :cond_4
    iget-object v3, v3, Lud/r;->n:La5/a;

    .line 186
    .line 187
    iget-object v3, v3, La5/a;->i:Ljava/lang/Object;

    .line 188
    .line 189
    check-cast v3, Lac/k;

    .line 190
    .line 191
    iget v3, v3, Lac/k;->h:I

    .line 192
    .line 193
    int-to-long v6, v3

    .line 194
    :goto_4
    invoke-static {v6, v7}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    iget-object v3, v4, Lb/e;->i:Ljava/lang/Object;

    .line 198
    .line 199
    check-cast v3, Ljava/util/ArrayList;

    .line 200
    .line 201
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    goto :goto_3

    .line 205
    :cond_5
    :goto_5
    iget-object v2, v0, Lid/a;->a:Ljava/util/ArrayList;

    .line 206
    .line 207
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    goto/16 :goto_0

    .line 211
    .line 212
    :cond_6
    iget-object p0, p0, Lud/u;->a:Lbc/g;

    .line 213
    .line 214
    iget-object p0, p0, Lbc/g;->i:Ljava/io/File;

    .line 215
    .line 216
    invoke-virtual {p0}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;

    .line 217
    .line 218
    .line 219
    move-result-object p0

    .line 220
    new-instance v1, Ljava/io/File;

    .line 221
    .line 222
    const-string v2, "mapping.json"

    .line 223
    .line 224
    invoke-direct {v1, p0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    sget-object p0, Lbf/b;->a:Lmh/b;

    .line 228
    .line 229
    invoke-virtual {v1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 230
    .line 231
    .line 232
    move-result-object p0

    .line 233
    invoke-static {p0}, Lbf/b;->c(Ljava/io/File;)V

    .line 234
    .line 235
    .line 236
    :try_start_0
    new-instance p0, Ljava/io/FileWriter;

    .line 237
    .line 238
    invoke-direct {p0, v1}, Ljava/io/FileWriter;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 239
    .line 240
    .line 241
    :try_start_1
    sget-object v2, Lgd/c;->b:Lh6/f;

    .line 242
    .line 243
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    const-class v3, Lid/a;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 247
    .line 248
    :try_start_2
    invoke-virtual {v2, p0}, Lh6/f;->c(Ljava/io/Writer;)Lo6/a;

    .line 249
    .line 250
    .line 251
    move-result-object v4

    .line 252
    invoke-virtual {v2, v0, v3, v4}, Lh6/f;->d(Ljava/lang/Object;Ljava/lang/Class;Lo6/a;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 253
    .line 254
    .line 255
    :try_start_3
    sget-object v0, Lgd/c;->a:Lmh/b;

    .line 256
    .line 257
    const-string v2, "Save mappings to {}"

    .line 258
    .line 259
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v1

    .line 263
    invoke-interface {v0, v1, v2}, Lmh/b;->a(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 264
    .line 265
    .line 266
    :try_start_4
    invoke-virtual {p0}, Ljava/io/Writer;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    .line 267
    .line 268
    .line 269
    return-void

    .line 270
    :catchall_0
    move-exception v0

    .line 271
    goto :goto_6

    .line 272
    :catch_0
    move-exception v0

    .line 273
    :try_start_5
    new-instance v1, Laf/d;

    .line 274
    .line 275
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 276
    .line 277
    .line 278
    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 279
    :goto_6
    :try_start_6
    invoke-virtual {p0}, Ljava/io/Writer;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 280
    .line 281
    .line 282
    goto :goto_7

    .line 283
    :catchall_1
    move-exception p0

    .line 284
    :try_start_7
    invoke-virtual {v0, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 285
    .line 286
    .line 287
    :goto_7
    throw v0
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1

    .line 288
    :catch_1
    move-exception p0

    .line 289
    new-instance v0, Laf/g;

    .line 290
    .line 291
    const-string v1, "Failed to save mapping json"

    .line 292
    .line 293
    invoke-direct {v0, v1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 294
    .line 295
    .line 296
    throw v0
.end method
