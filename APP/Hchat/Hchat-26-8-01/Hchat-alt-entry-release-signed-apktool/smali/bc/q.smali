.class public final Lbc/q;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lbc/k;

.field public final b:Ljava/util/ArrayList;

.field public final c:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lbc/q;

    .line 2
    .line 3
    invoke-static {v0}, Lmh/d;->b(Ljava/lang/Class;)Lmh/b;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>(Lbc/k;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
    iput-object v0, p0, Lbc/q;->b:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v1, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Lbc/q;->c:Ljava/util/ArrayList;

    .line 17
    .line 18
    iput-object p1, p0, Lbc/q;->a:Lbc/k;

    .line 19
    .line 20
    new-instance p1, Ldf/h;

    .line 21
    .line 22
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public static a(Lbc/o;Le9/a;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lbc/o;->a:Ljava/lang/String;

    .line 2
    .line 3
    :try_start_0
    iget-object p0, p0, Lbc/o;->c:Lnf/a;

    .line 4
    .line 5
    if-eqz p0, :cond_2

    .line 6
    .line 7
    invoke-interface {p0}, Lnf/a;->b()Ljava/io/InputStream;

    .line 8
    .line 9
    .line 10
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    :try_start_1
    invoke-interface {p0}, Lnf/a;->c()J

    .line 12
    .line 13
    .line 14
    move-result-wide v2

    .line 15
    invoke-virtual {p1, v1, v2, v3}, Le9/a;->c(Ljava/io/InputStream;J)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    :try_start_2
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 22
    .line 23
    .line 24
    return-object p0

    .line 25
    :catch_0
    move-exception p0

    .line 26
    goto :goto_2

    .line 27
    :cond_0
    return-object p0

    .line 28
    :catchall_0
    move-exception p0

    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    :try_start_3
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catchall_1
    move-exception p1

    .line 36
    :try_start_4
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    :goto_0
    throw p0

    .line 40
    :cond_2
    new-instance p0, Ljava/io/File;

    .line 41
    .line 42
    invoke-direct {p0, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    new-instance v1, Ljava/io/BufferedInputStream;

    .line 46
    .line 47
    new-instance v2, Ljava/io/FileInputStream;

    .line 48
    .line 49
    invoke-direct {v2, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 50
    .line 51
    .line 52
    invoke-direct {v1, v2}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 53
    .line 54
    .line 55
    :try_start_5
    invoke-virtual {p0}, Ljava/io/File;->length()J

    .line 56
    .line 57
    .line 58
    move-result-wide v2

    .line 59
    invoke-virtual {p1, v1, v2, v3}, Le9/a;->c(Ljava/io/InputStream;J)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 63
    :try_start_6
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    .line 64
    .line 65
    .line 66
    return-object p0

    .line 67
    :catchall_2
    move-exception p0

    .line 68
    :try_start_7
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :catchall_3
    move-exception p1

    .line 73
    :try_start_8
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 74
    .line 75
    .line 76
    :goto_1
    throw p0
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0

    .line 77
    :goto_2
    new-instance p1, Laf/e;

    .line 78
    .line 79
    const-string v1, "Error decode: "

    .line 80
    .line 81
    invoke-static {v1, v0}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-direct {p1, v0, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 86
    .line 87
    .line 88
    throw p1
.end method


# virtual methods
.method public final b(Lud/u;)Ljava/util/ArrayList;
    .locals 10

    .line 1
    iget-object v0, p0, Lbc/q;->b:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Ldf/h;

    .line 19
    .line 20
    :try_start_0
    iput-object p1, v1, Ldf/h;->a:Lud/u;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catch_0
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    const-string v0, "Failed to init res table provider: "

    .line 28
    .line 29
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-static {p1}, Lah/a;->k(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-object v2

    .line 37
    :cond_0
    iget-object p1, p0, Lbc/q;->c:Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-nez v0, :cond_a

    .line 48
    .line 49
    iget-object p1, p0, Lbc/q;->a:Lbc/k;

    .line 50
    .line 51
    iget-object v0, p1, Lbc/k;->g:Lbc/g;

    .line 52
    .line 53
    iget-object v0, v0, Lbc/g;->g:Ljava/util/ArrayList;

    .line 54
    .line 55
    new-instance v1, Ljava/util/ArrayList;

    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 62
    .line 63
    .line 64
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    if-eqz v3, :cond_9

    .line 73
    .line 74
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    check-cast v3, Ljava/io/File;

    .line 79
    .line 80
    if-eqz v3, :cond_1

    .line 81
    .line 82
    invoke-virtual {v3}, Ljava/io/File;->isDirectory()Z

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    if-eqz v4, :cond_2

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_2
    iget-object v4, p1, Lbc/k;->o:Ljava/util/ArrayList;

    .line 90
    .line 91
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 96
    .line 97
    .line 98
    move-result v5

    .line 99
    if-nez v5, :cond_8

    .line 100
    .line 101
    sget-object v4, Lbf/b;->a:Lmh/b;

    .line 102
    .line 103
    const/4 v4, 0x0

    .line 104
    :try_start_1
    new-instance v5, Ljava/io/FileInputStream;

    .line 105
    .line 106
    invoke-direct {v5, v3}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 107
    .line 108
    .line 109
    :try_start_2
    sget-object v6, Lbf/b;->e:[B

    .line 110
    .line 111
    array-length v7, v6

    .line 112
    new-array v8, v7, [B

    .line 113
    .line 114
    invoke-virtual {v5, v8}, Ljava/io/InputStream;->read([B)I

    .line 115
    .line 116
    .line 117
    move-result v9

    .line 118
    if-ne v9, v7, :cond_3

    .line 119
    .line 120
    invoke-static {v8, v6}, Ljava/util/Arrays;->equals([B[B)Z

    .line 121
    .line 122
    .line 123
    move-result v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 124
    if-eqz v6, :cond_3

    .line 125
    .line 126
    const/4 v6, 0x1

    .line 127
    goto :goto_2

    .line 128
    :catchall_0
    move-exception v6

    .line 129
    goto :goto_3

    .line 130
    :cond_3
    move v6, v4

    .line 131
    :goto_2
    :try_start_3
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 132
    .line 133
    .line 134
    move v4, v6

    .line 135
    goto :goto_6

    .line 136
    :catch_1
    move-exception v5

    .line 137
    goto :goto_5

    .line 138
    :goto_3
    :try_start_4
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 139
    .line 140
    .line 141
    goto :goto_4

    .line 142
    :catchall_1
    move-exception v5

    .line 143
    :try_start_5
    invoke-virtual {v6, v5}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 144
    .line 145
    .line 146
    :goto_4
    throw v6
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    .line 147
    :goto_5
    sget-object v6, Lbf/b;->a:Lmh/b;

    .line 148
    .line 149
    const-string v7, "Failed to read zip file: {}"

    .line 150
    .line 151
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v8

    .line 155
    invoke-interface {v6, v8, v7, v5}, Lmh/b;->n(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    :goto_6
    if-eqz v4, :cond_7

    .line 159
    .line 160
    :try_start_6
    iget-object v4, p1, Lbc/k;->j:Lm/a;

    .line 161
    .line 162
    invoke-virtual {v4, v3}, Lm/a;->r(Ljava/io/File;)Lnf/c;

    .line 163
    .line 164
    .line 165
    move-result-object v4

    .line 166
    iget-object v5, p1, Lbc/k;->q:Ljava/util/ArrayList;

    .line 167
    .line 168
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    iget-object v4, v4, Lnf/c;->h:Ljava/util/ArrayList;

    .line 172
    .line 173
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 174
    .line 175
    .line 176
    move-result-object v4

    .line 177
    :cond_4
    :goto_7
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 178
    .line 179
    .line 180
    move-result v5

    .line 181
    if-eqz v5, :cond_1

    .line 182
    .line 183
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v5

    .line 187
    check-cast v5, Lnf/a;

    .line 188
    .line 189
    invoke-interface {v5}, Lnf/a;->isDirectory()Z

    .line 190
    .line 191
    .line 192
    move-result v6

    .line 193
    if-eqz v6, :cond_5

    .line 194
    .line 195
    goto :goto_7

    .line 196
    :cond_5
    invoke-interface {v5}, Lnf/a;->getName()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v6

    .line 200
    invoke-static {v6}, Lbc/p;->a(Ljava/lang/String;)Lbc/p;

    .line 201
    .line 202
    .line 203
    move-result-object v7

    .line 204
    iget-object v8, p1, Lbc/k;->g:Lbc/g;

    .line 205
    .line 206
    iget-object v8, v8, Lbc/g;->K:Lad/c;

    .line 207
    .line 208
    iget-object v8, v8, Lad/c;->b:Lrf/b;

    .line 209
    .line 210
    invoke-interface {v8, v6}, Lrf/b;->c(Ljava/lang/String;)Z

    .line 211
    .line 212
    .line 213
    move-result v8

    .line 214
    if-nez v8, :cond_6

    .line 215
    .line 216
    move-object v8, v2

    .line 217
    goto :goto_8

    .line 218
    :cond_6
    new-instance v8, Lbc/o;

    .line 219
    .line 220
    invoke-direct {v8, v6, v7}, Lbc/o;-><init>(Ljava/lang/String;Lbc/p;)V

    .line 221
    .line 222
    .line 223
    :goto_8
    if-eqz v8, :cond_4

    .line 224
    .line 225
    iput-object v5, v8, Lbc/o;->c:Lnf/a;

    .line 226
    .line 227
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2

    .line 228
    .line 229
    .line 230
    goto :goto_7

    .line 231
    :catch_2
    move-exception p1

    .line 232
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    const-string v1, "Failed to open zip file: "

    .line 237
    .line 238
    invoke-static {v1, v0}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    invoke-static {v0, p1}, Lah/a;->p(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 243
    .line 244
    .line 245
    return-object v2

    .line 246
    :cond_7
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v4

    .line 250
    invoke-static {v4}, Lbc/p;->a(Ljava/lang/String;)Lbc/p;

    .line 251
    .line 252
    .line 253
    move-result-object v4

    .line 254
    new-instance v5, Lbc/o;

    .line 255
    .line 256
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v3

    .line 260
    invoke-direct {v5, v3, v4}, Lbc/o;-><init>(Ljava/lang/String;Lbc/p;)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    goto/16 :goto_1

    .line 267
    .line 268
    :cond_8
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object p1

    .line 272
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 273
    .line 274
    .line 275
    invoke-static {}, Lah/a;->d()V

    .line 276
    .line 277
    .line 278
    return-object v2

    .line 279
    :cond_9
    return-object v1

    .line 280
    :cond_a
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object p1

    .line 284
    if-eqz p1, :cond_b

    .line 285
    .line 286
    invoke-static {}, Lah/a;->d()V

    .line 287
    .line 288
    .line 289
    return-object v2

    .line 290
    :cond_b
    :try_start_7
    throw v2
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_3

    .line 291
    :catch_3
    const-string p1, "null"

    .line 292
    .line 293
    const-string v0, "Failed to init res container factory: "

    .line 294
    .line 295
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object p1

    .line 299
    invoke-static {p1}, Lah/a;->k(Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    return-object v2
.end method
