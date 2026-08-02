.class public final Lcom/bumptech/glide/a;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Landroid/content/ComponentCallbacks2;


# static fields
.field public static volatile o:Lcom/bumptech/glide/a;

.field public static volatile p:Z


# instance fields
.field public final h:Lzk;

.field public final i:Lyd1;

.field public final j:Lvp0;

.field public final k:Ltd1;

.field public final l:Ly82;

.field public final m:Leb;

.field public final n:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lbf0;Lyd1;Lzk;Ltd1;Ly82;Leb;Leb;Lhg;Ljava/util/List;Ljava/util/ArrayList;Lp7;Ln4;)V
    .locals 1

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
    iput-object v0, p0, Lcom/bumptech/glide/a;->n:Ljava/util/ArrayList;

    .line 10
    .line 11
    iput-object p4, p0, Lcom/bumptech/glide/a;->h:Lzk;

    .line 12
    .line 13
    iput-object p5, p0, Lcom/bumptech/glide/a;->k:Ltd1;

    .line 14
    .line 15
    iput-object p3, p0, Lcom/bumptech/glide/a;->i:Lyd1;

    .line 16
    .line 17
    iput-object p6, p0, Lcom/bumptech/glide/a;->l:Ly82;

    .line 18
    .line 19
    iput-object p7, p0, Lcom/bumptech/glide/a;->m:Leb;

    .line 20
    .line 21
    iget-object p3, p13, Ln4;->i:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p3, Ljava/util/Map;

    .line 24
    .line 25
    const-class p4, Lrp0;

    .line 26
    .line 27
    invoke-interface {p3, p4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p3

    .line 31
    if-nez p3, :cond_0

    .line 32
    .line 33
    new-instance p7, Ler2;

    .line 34
    .line 35
    invoke-direct {p7, p0, p11, p12}, Ler2;-><init>(Lcom/bumptech/glide/a;Ljava/util/ArrayList;Lp7;)V

    .line 36
    .line 37
    .line 38
    move-object p11, p10

    .line 39
    move-object p10, p9

    .line 40
    move-object p9, p8

    .line 41
    new-instance p8, Lz8;

    .line 42
    .line 43
    const/16 p3, 0x1d

    .line 44
    .line 45
    invoke-direct {p8, p3}, Lz8;-><init>(I)V

    .line 46
    .line 47
    .line 48
    new-instance p4, Lvp0;

    .line 49
    .line 50
    move-object p12, p2

    .line 51
    move-object p6, p5

    .line 52
    move-object p5, p1

    .line 53
    invoke-direct/range {p4 .. p13}, Lvp0;-><init>(Landroid/content/Context;Ltd1;Ler2;Lz8;Leb;Lhg;Ljava/util/List;Lbf0;Ln4;)V

    .line 54
    .line 55
    .line 56
    iput-object p4, p0, Lcom/bumptech/glide/a;->j:Lvp0;

    .line 57
    .line 58
    return-void

    .line 59
    :cond_0
    invoke-static {}, Lc80;->g()V

    .line 60
    .line 61
    .line 62
    const/4 p0, 0x0

    .line 63
    throw p0
.end method

.method public static a(Landroid/content/Context;)Lcom/bumptech/glide/a;
    .locals 4

    .line 1
    sget-object v0, Lcom/bumptech/glide/a;->o:Lcom/bumptech/glide/a;

    .line 2
    .line 3
    if-nez v0, :cond_3

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "Glide"

    .line 10
    .line 11
    :try_start_0
    const-string v2, "com.bumptech.glide.GeneratedAppGlideModuleImpl"

    .line 12
    .line 13
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const-class v3, Landroid/content/Context;

    .line 18
    .line 19
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v2, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, Lcom/bumptech/glide/GeneratedAppGlideModule;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catch_0
    move-exception p0

    .line 43
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 44
    .line 45
    const-string v1, "GeneratedAppGlideModuleImpl is implemented incorrectly. If you\'ve manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation."

    .line 46
    .line 47
    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 48
    .line 49
    .line 50
    throw v0

    .line 51
    :catch_1
    move-exception p0

    .line 52
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 53
    .line 54
    const-string v1, "GeneratedAppGlideModuleImpl is implemented incorrectly. If you\'ve manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation."

    .line 55
    .line 56
    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 57
    .line 58
    .line 59
    throw v0

    .line 60
    :catch_2
    move-exception p0

    .line 61
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 62
    .line 63
    const-string v1, "GeneratedAppGlideModuleImpl is implemented incorrectly. If you\'ve manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation."

    .line 64
    .line 65
    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 66
    .line 67
    .line 68
    throw v0

    .line 69
    :catch_3
    move-exception p0

    .line 70
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 71
    .line 72
    const-string v1, "GeneratedAppGlideModuleImpl is implemented incorrectly. If you\'ve manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation."

    .line 73
    .line 74
    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 75
    .line 76
    .line 77
    throw v0

    .line 78
    :catch_4
    const/4 v0, 0x5

    .line 79
    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-eqz v0, :cond_0

    .line 84
    .line 85
    const-string v0, "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored"

    .line 86
    .line 87
    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 88
    .line 89
    .line 90
    :cond_0
    const/4 v0, 0x0

    .line 91
    :goto_0
    const-class v1, Lcom/bumptech/glide/a;

    .line 92
    .line 93
    monitor-enter v1

    .line 94
    :try_start_1
    sget-object v2, Lcom/bumptech/glide/a;->o:Lcom/bumptech/glide/a;

    .line 95
    .line 96
    if-nez v2, :cond_2

    .line 97
    .line 98
    sget-boolean v2, Lcom/bumptech/glide/a;->p:Z

    .line 99
    .line 100
    if-nez v2, :cond_1

    .line 101
    .line 102
    const/4 v2, 0x1

    .line 103
    sput-boolean v2, Lcom/bumptech/glide/a;->p:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 104
    .line 105
    const/4 v2, 0x0

    .line 106
    :try_start_2
    invoke-static {p0, v0}, Lcom/bumptech/glide/a;->b(Landroid/content/Context;Lcom/bumptech/glide/GeneratedAppGlideModule;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 107
    .line 108
    .line 109
    :try_start_3
    sput-boolean v2, Lcom/bumptech/glide/a;->p:Z

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :catchall_0
    move-exception p0

    .line 113
    sput-boolean v2, Lcom/bumptech/glide/a;->p:Z

    .line 114
    .line 115
    throw p0

    .line 116
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 117
    .line 118
    const-string v0, "Glide has been called recursively, this is probably an internal library error!"

    .line 119
    .line 120
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    throw p0

    .line 124
    :cond_2
    :goto_1
    monitor-exit v1

    .line 125
    goto :goto_2

    .line 126
    :catchall_1
    move-exception p0

    .line 127
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 128
    throw p0

    .line 129
    :cond_3
    :goto_2
    sget-object p0, Lcom/bumptech/glide/a;->o:Lcom/bumptech/glide/a;

    .line 130
    .line 131
    return-object p0
.end method

.method public static b(Landroid/content/Context;Lcom/bumptech/glide/GeneratedAppGlideModule;)V
    .locals 28

    .line 1
    new-instance v9, Lhg;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v9, v1}, Luq2;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v2, Ll40;

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    invoke-direct {v2, v3}, Ll40;-><init>(I)V

    .line 11
    .line 12
    .line 13
    new-instance v8, Leb;

    .line 14
    .line 15
    const/16 v0, 0x1a

    .line 16
    .line 17
    invoke-direct {v8, v0}, Leb;-><init>(I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 25
    .line 26
    const-string v0, "Got app info metadata: "

    .line 27
    .line 28
    const-string v5, "ManifestParser"

    .line 29
    .line 30
    const/4 v6, 0x3

    .line 31
    invoke-static {v5, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 32
    .line 33
    .line 34
    move-result v7

    .line 35
    if-eqz v7, :cond_0

    .line 36
    .line 37
    const-string v7, "Loading Glide modules"

    .line 38
    .line 39
    invoke-static {v5, v7}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 40
    .line 41
    .line 42
    :cond_0
    new-instance v11, Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 45
    .line 46
    .line 47
    const/4 v7, 0x2

    .line 48
    :try_start_0
    invoke-virtual {v4}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 49
    .line 50
    .line 51
    move-result-object v10

    .line 52
    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v12

    .line 56
    const/16 v13, 0x80

    .line 57
    .line 58
    invoke-virtual {v10, v12, v13}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    .line 59
    .line 60
    .line 61
    move-result-object v10

    .line 62
    if-eqz v10, :cond_5

    .line 63
    .line 64
    iget-object v12, v10, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 65
    .line 66
    if-nez v12, :cond_1

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_1
    invoke-static {v5, v7}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 70
    .line 71
    .line 72
    move-result v12

    .line 73
    if-eqz v12, :cond_2

    .line 74
    .line 75
    new-instance v12, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    invoke-direct {v12, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    iget-object v0, v10, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 81
    .line 82
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-static {v5, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :catch_0
    move-exception v0

    .line 94
    goto :goto_3

    .line 95
    :cond_2
    :goto_0
    iget-object v0, v10, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 96
    .line 97
    invoke-virtual {v0}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 106
    .line 107
    .line 108
    move-result v12

    .line 109
    if-eqz v12, :cond_4

    .line 110
    .line 111
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v12

    .line 115
    check-cast v12, Ljava/lang/String;

    .line 116
    .line 117
    const-string v13, "GlideModule"

    .line 118
    .line 119
    iget-object v14, v10, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 120
    .line 121
    invoke-virtual {v14, v12}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v14

    .line 125
    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v13

    .line 129
    if-nez v13, :cond_3

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_3
    invoke-static {v12}, Lfg1;->H(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    const/4 v0, 0x0

    .line 136
    throw v0

    .line 137
    :cond_4
    invoke-static {v5, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    if-eqz v0, :cond_6

    .line 142
    .line 143
    const-string v0, "Finished loading Glide modules"

    .line 144
    .line 145
    invoke-static {v5, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 146
    .line 147
    .line 148
    goto :goto_4

    .line 149
    :cond_5
    :goto_2
    invoke-static {v5, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    if-eqz v0, :cond_6

    .line 154
    .line 155
    const-string v0, "Got null app info metadata"

    .line 156
    .line 157
    invoke-static {v5, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 158
    .line 159
    .line 160
    goto :goto_4

    .line 161
    :goto_3
    const/4 v10, 0x6

    .line 162
    invoke-static {v5, v10}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 163
    .line 164
    .line 165
    move-result v10

    .line 166
    if-eqz v10, :cond_6

    .line 167
    .line 168
    const-string v10, "Failed to parse glide modules"

    .line 169
    .line 170
    invoke-static {v5, v10, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 171
    .line 172
    .line 173
    :cond_6
    :goto_4
    if-eqz p1, :cond_8

    .line 174
    .line 175
    new-instance v0, Ljava/util/HashSet;

    .line 176
    .line 177
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    if-nez v0, :cond_8

    .line 185
    .line 186
    new-instance v0, Ljava/util/HashSet;

    .line 187
    .line 188
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 196
    .line 197
    .line 198
    move-result v5

    .line 199
    if-nez v5, :cond_7

    .line 200
    .line 201
    goto :goto_5

    .line 202
    :cond_7
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    invoke-static {}, Lc80;->g()V

    .line 210
    .line 211
    .line 212
    return-void

    .line 213
    :cond_8
    :goto_5
    const-string v0, "Glide"

    .line 214
    .line 215
    invoke-static {v0, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 216
    .line 217
    .line 218
    move-result v0

    .line 219
    if-eqz v0, :cond_a

    .line 220
    .line 221
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 226
    .line 227
    .line 228
    move-result v5

    .line 229
    if-nez v5, :cond_9

    .line 230
    .line 231
    goto :goto_6

    .line 232
    :cond_9
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    invoke-static {}, Lc80;->g()V

    .line 240
    .line 241
    .line 242
    return-void

    .line 243
    :cond_a
    :goto_6
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 248
    .line 249
    .line 250
    move-result v5

    .line 251
    if-nez v5, :cond_14

    .line 252
    .line 253
    new-instance v0, Lz4;

    .line 254
    .line 255
    invoke-direct {v0, v3}, Lz4;-><init>(I)V

    .line 256
    .line 257
    .line 258
    sget v5, Laq0;->i:I

    .line 259
    .line 260
    const/4 v6, 0x4

    .line 261
    if-nez v5, :cond_b

    .line 262
    .line 263
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 264
    .line 265
    .line 266
    move-result-object v5

    .line 267
    invoke-virtual {v5}, Ljava/lang/Runtime;->availableProcessors()I

    .line 268
    .line 269
    .line 270
    move-result v5

    .line 271
    invoke-static {v6, v5}, Ljava/lang/Math;->min(II)I

    .line 272
    .line 273
    .line 274
    move-result v5

    .line 275
    sput v5, Laq0;->i:I

    .line 276
    .line 277
    :cond_b
    sget v13, Laq0;->i:I

    .line 278
    .line 279
    const-string v5, "source"

    .line 280
    .line 281
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 282
    .line 283
    .line 284
    move-result v10

    .line 285
    if-nez v10, :cond_13

    .line 286
    .line 287
    new-instance v10, Lzp0;

    .line 288
    .line 289
    invoke-direct {v10, v0, v5, v1}, Lzp0;-><init>(Lz4;Ljava/lang/String;Z)V

    .line 290
    .line 291
    .line 292
    new-instance v12, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 293
    .line 294
    new-instance v18, Ljava/util/concurrent/PriorityBlockingQueue;

    .line 295
    .line 296
    invoke-direct/range {v18 .. v18}, Ljava/util/concurrent/PriorityBlockingQueue;-><init>()V

    .line 297
    .line 298
    .line 299
    const-wide/16 v15, 0x0

    .line 300
    .line 301
    sget-object v24, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 302
    .line 303
    move v14, v13

    .line 304
    move-object/from16 v19, v10

    .line 305
    .line 306
    move-object/from16 v17, v24

    .line 307
    .line 308
    invoke-direct/range {v12 .. v19}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 309
    .line 310
    .line 311
    new-instance v0, Laq0;

    .line 312
    .line 313
    invoke-direct {v0, v12}, Laq0;-><init>(Ljava/util/concurrent/ThreadPoolExecutor;)V

    .line 314
    .line 315
    .line 316
    new-instance v5, Lz4;

    .line 317
    .line 318
    invoke-direct {v5, v3}, Lz4;-><init>(I)V

    .line 319
    .line 320
    .line 321
    const-string v10, "disk-cache"

    .line 322
    .line 323
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 324
    .line 325
    .line 326
    move-result v12

    .line 327
    if-nez v12, :cond_12

    .line 328
    .line 329
    new-instance v12, Lzp0;

    .line 330
    .line 331
    const/4 v13, 0x1

    .line 332
    invoke-direct {v12, v5, v10, v13}, Lzp0;-><init>(Lz4;Ljava/lang/String;Z)V

    .line 333
    .line 334
    .line 335
    new-instance v19, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 336
    .line 337
    new-instance v25, Ljava/util/concurrent/PriorityBlockingQueue;

    .line 338
    .line 339
    invoke-direct/range {v25 .. v25}, Ljava/util/concurrent/PriorityBlockingQueue;-><init>()V

    .line 340
    .line 341
    .line 342
    const-wide/16 v22, 0x0

    .line 343
    .line 344
    move/from16 v21, v13

    .line 345
    .line 346
    move-object/from16 v26, v12

    .line 347
    .line 348
    move/from16 v20, v13

    .line 349
    .line 350
    invoke-direct/range {v19 .. v26}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 351
    .line 352
    .line 353
    move-object/from16 v5, v19

    .line 354
    .line 355
    new-instance v10, Laq0;

    .line 356
    .line 357
    invoke-direct {v10, v5}, Laq0;-><init>(Ljava/util/concurrent/ThreadPoolExecutor;)V

    .line 358
    .line 359
    .line 360
    sget v5, Laq0;->i:I

    .line 361
    .line 362
    if-nez v5, :cond_c

    .line 363
    .line 364
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 365
    .line 366
    .line 367
    move-result-object v5

    .line 368
    invoke-virtual {v5}, Ljava/lang/Runtime;->availableProcessors()I

    .line 369
    .line 370
    .line 371
    move-result v5

    .line 372
    invoke-static {v6, v5}, Ljava/lang/Math;->min(II)I

    .line 373
    .line 374
    .line 375
    move-result v5

    .line 376
    sput v5, Laq0;->i:I

    .line 377
    .line 378
    :cond_c
    sget v5, Laq0;->i:I

    .line 379
    .line 380
    if-lt v5, v6, :cond_d

    .line 381
    .line 382
    move/from16 v20, v7

    .line 383
    .line 384
    goto :goto_7

    .line 385
    :cond_d
    move/from16 v20, v3

    .line 386
    .line 387
    :goto_7
    new-instance v5, Lz4;

    .line 388
    .line 389
    invoke-direct {v5, v3}, Lz4;-><init>(I)V

    .line 390
    .line 391
    .line 392
    const-string v7, "animation"

    .line 393
    .line 394
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 395
    .line 396
    .line 397
    move-result v12

    .line 398
    if-nez v12, :cond_11

    .line 399
    .line 400
    new-instance v12, Lzp0;

    .line 401
    .line 402
    invoke-direct {v12, v5, v7, v3}, Lzp0;-><init>(Lz4;Ljava/lang/String;Z)V

    .line 403
    .line 404
    .line 405
    new-instance v19, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 406
    .line 407
    new-instance v25, Ljava/util/concurrent/PriorityBlockingQueue;

    .line 408
    .line 409
    invoke-direct/range {v25 .. v25}, Ljava/util/concurrent/PriorityBlockingQueue;-><init>()V

    .line 410
    .line 411
    .line 412
    const-wide/16 v22, 0x0

    .line 413
    .line 414
    move/from16 v21, v20

    .line 415
    .line 416
    move-object/from16 v26, v12

    .line 417
    .line 418
    invoke-direct/range {v19 .. v26}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 419
    .line 420
    .line 421
    move-object/from16 v5, v19

    .line 422
    .line 423
    new-instance v7, Laq0;

    .line 424
    .line 425
    invoke-direct {v7, v5}, Laq0;-><init>(Ljava/util/concurrent/ThreadPoolExecutor;)V

    .line 426
    .line 427
    .line 428
    new-instance v5, Ljg1;

    .line 429
    .line 430
    invoke-direct {v5, v4}, Ljg1;-><init>(Landroid/content/Context;)V

    .line 431
    .line 432
    .line 433
    new-instance v12, Lkg1;

    .line 434
    .line 435
    invoke-direct {v12, v5}, Lkg1;-><init>(Ljg1;)V

    .line 436
    .line 437
    .line 438
    move-object v5, v7

    .line 439
    new-instance v7, Leb;

    .line 440
    .line 441
    const/16 v13, 0xe

    .line 442
    .line 443
    invoke-direct {v7, v13}, Leb;-><init>(I)V

    .line 444
    .line 445
    .line 446
    iget v13, v12, Lkg1;->a:I

    .line 447
    .line 448
    if-lez v13, :cond_e

    .line 449
    .line 450
    new-instance v6, Lud1;

    .line 451
    .line 452
    int-to-long v13, v13

    .line 453
    invoke-direct {v6, v13, v14}, Lud1;-><init>(J)V

    .line 454
    .line 455
    .line 456
    :goto_8
    move-object v13, v5

    .line 457
    goto :goto_9

    .line 458
    :cond_e
    new-instance v13, Leb;

    .line 459
    .line 460
    invoke-direct {v13, v6}, Leb;-><init>(I)V

    .line 461
    .line 462
    .line 463
    move-object v6, v13

    .line 464
    goto :goto_8

    .line 465
    :goto_9
    new-instance v5, Ltd1;

    .line 466
    .line 467
    iget v14, v12, Lkg1;->c:I

    .line 468
    .line 469
    invoke-direct {v5, v14}, Ltd1;-><init>(I)V

    .line 470
    .line 471
    .line 472
    new-instance v14, Lyd1;

    .line 473
    .line 474
    iget v12, v12, Lkg1;->b:I

    .line 475
    .line 476
    move-object/from16 v27, v2

    .line 477
    .line 478
    int-to-long v1, v12

    .line 479
    invoke-direct {v14, v1, v2}, Lwd1;-><init>(J)V

    .line 480
    .line 481
    .line 482
    const/4 v1, 0x0

    .line 483
    new-instance v15, Ln4;

    .line 484
    .line 485
    invoke-direct {v15, v4}, Ln4;-><init>(Landroid/content/Context;)V

    .line 486
    .line 487
    .line 488
    new-instance v2, Lbf0;

    .line 489
    .line 490
    new-instance v12, Laq0;

    .line 491
    .line 492
    new-instance v19, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 493
    .line 494
    new-instance v25, Ljava/util/concurrent/SynchronousQueue;

    .line 495
    .line 496
    invoke-direct/range {v25 .. v25}, Ljava/util/concurrent/SynchronousQueue;-><init>()V

    .line 497
    .line 498
    .line 499
    new-instance v1, Lzp0;

    .line 500
    .line 501
    move-object/from16 v17, v0

    .line 502
    .line 503
    new-instance v0, Lz4;

    .line 504
    .line 505
    invoke-direct {v0, v3}, Lz4;-><init>(I)V

    .line 506
    .line 507
    .line 508
    const-string v3, "source-unlimited"

    .line 509
    .line 510
    move-object/from16 v16, v2

    .line 511
    .line 512
    const/4 v2, 0x0

    .line 513
    invoke-direct {v1, v0, v3, v2}, Lzp0;-><init>(Lz4;Ljava/lang/String;Z)V

    .line 514
    .line 515
    .line 516
    const/16 v20, 0x0

    .line 517
    .line 518
    const v21, 0x7fffffff

    .line 519
    .line 520
    .line 521
    const-wide/16 v22, 0x2710

    .line 522
    .line 523
    move-object/from16 v26, v1

    .line 524
    .line 525
    invoke-direct/range {v19 .. v26}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 526
    .line 527
    .line 528
    move-object/from16 v0, v19

    .line 529
    .line 530
    invoke-direct {v12, v0}, Laq0;-><init>(Ljava/util/concurrent/ThreadPoolExecutor;)V

    .line 531
    .line 532
    .line 533
    move-object/from16 v18, v12

    .line 534
    .line 535
    move-object/from16 v19, v13

    .line 536
    .line 537
    move-object/from16 v13, v16

    .line 538
    .line 539
    move-object/from16 v16, v10

    .line 540
    .line 541
    invoke-direct/range {v13 .. v19}, Lbf0;-><init>(Lyd1;Ln4;Laq0;Laq0;Laq0;Laq0;)V

    .line 542
    .line 543
    .line 544
    move-object/from16 v16, v13

    .line 545
    .line 546
    sget-object v10, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 547
    .line 548
    new-instance v13, Ln4;

    .line 549
    .line 550
    move-object/from16 v1, v27

    .line 551
    .line 552
    invoke-direct {v13, v1}, Ln4;-><init>(Ll40;)V

    .line 553
    .line 554
    .line 555
    move-object v1, v4

    .line 556
    move-object v4, v6

    .line 557
    new-instance v6, Ly82;

    .line 558
    .line 559
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 560
    .line 561
    .line 562
    new-instance v0, Ljava/util/HashMap;

    .line 563
    .line 564
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 565
    .line 566
    .line 567
    sget-boolean v0, Lds0;->f:Z

    .line 568
    .line 569
    if-eqz v0, :cond_10

    .line 570
    .line 571
    sget-boolean v0, Lds0;->e:Z

    .line 572
    .line 573
    if-nez v0, :cond_f

    .line 574
    .line 575
    goto :goto_a

    .line 576
    :cond_f
    new-instance v0, Ljava/util/WeakHashMap;

    .line 577
    .line 578
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 579
    .line 580
    .line 581
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 582
    .line 583
    .line 584
    :cond_10
    :goto_a
    new-instance v0, Lcom/bumptech/glide/a;

    .line 585
    .line 586
    move-object/from16 v12, p1

    .line 587
    .line 588
    move-object v3, v14

    .line 589
    move-object/from16 v2, v16

    .line 590
    .line 591
    invoke-direct/range {v0 .. v13}, Lcom/bumptech/glide/a;-><init>(Landroid/content/Context;Lbf0;Lyd1;Lzk;Ltd1;Ly82;Leb;Leb;Lhg;Ljava/util/List;Ljava/util/ArrayList;Lp7;Ln4;)V

    .line 592
    .line 593
    .line 594
    invoke-virtual {v1, v0}, Landroid/content/Context;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    .line 595
    .line 596
    .line 597
    sput-object v0, Lcom/bumptech/glide/a;->o:Lcom/bumptech/glide/a;

    .line 598
    .line 599
    return-void

    .line 600
    :cond_11
    const-string v0, "Name must be non-null and non-empty, but given: animation"

    .line 601
    .line 602
    invoke-static {v0}, Ls;->j(Ljava/lang/String;)V

    .line 603
    .line 604
    .line 605
    return-void

    .line 606
    :cond_12
    const-string v0, "Name must be non-null and non-empty, but given: disk-cache"

    .line 607
    .line 608
    invoke-static {v0}, Ls;->j(Ljava/lang/String;)V

    .line 609
    .line 610
    .line 611
    return-void

    .line 612
    :cond_13
    const-string v0, "Name must be non-null and non-empty, but given: source"

    .line 613
    .line 614
    invoke-static {v0}, Ls;->j(Ljava/lang/String;)V

    .line 615
    .line 616
    .line 617
    return-void

    .line 618
    :cond_14
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 619
    .line 620
    .line 621
    move-result-object v0

    .line 622
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 623
    .line 624
    .line 625
    invoke-static {}, Lc80;->g()V

    .line 626
    .line 627
    .line 628
    return-void
.end method

.method public static c(Landroid/content/Context;)Lx82;
    .locals 1

    .line 1
    const-string v0, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed)."

    .line 2
    .line 3
    invoke-static {v0, p0}, Lfg1;->q(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lcom/bumptech/glide/a;->a(Landroid/content/Context;)Lcom/bumptech/glide/a;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v0, v0, Lcom/bumptech/glide/a;->l:Ly82;

    .line 11
    .line 12
    invoke-virtual {v0, p0}, Ly82;->a(Landroid/content/Context;)Lx82;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method


# virtual methods
.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onLowMemory()V
    .locals 3

    .line 1
    invoke-static {}, Lb93;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/bumptech/glide/a;->i:Lyd1;

    .line 5
    .line 6
    const-wide/16 v1, 0x0

    .line 7
    .line 8
    invoke-virtual {v0, v1, v2}, Lwd1;->i(J)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/bumptech/glide/a;->h:Lzk;

    .line 12
    .line 13
    invoke-interface {v0}, Lzk;->n()V

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, Lcom/bumptech/glide/a;->k:Ltd1;

    .line 17
    .line 18
    monitor-enter p0

    .line 19
    const/4 v0, 0x0

    .line 20
    :try_start_0
    invoke-virtual {p0, v0}, Ltd1;->b(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    .line 23
    monitor-exit p0

    .line 24
    return-void

    .line 25
    :catchall_0
    move-exception v0

    .line 26
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    throw v0
.end method

.method public final onTrimMemory(I)V
    .locals 8

    .line 1
    invoke-static {}, Lb93;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/bumptech/glide/a;->n:Ljava/util/ArrayList;

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    iget-object v1, p0, Lcom/bumptech/glide/a;->n:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Lx82;

    .line 24
    .line 25
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception p0

    .line 30
    goto :goto_3

    .line 31
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    iget-object v1, p0, Lcom/bumptech/glide/a;->i:Lyd1;

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    const/16 v0, 0xf

    .line 38
    .line 39
    const/16 v2, 0x14

    .line 40
    .line 41
    const/16 v3, 0x28

    .line 42
    .line 43
    if-lt p1, v3, :cond_1

    .line 44
    .line 45
    const-wide/16 v4, 0x0

    .line 46
    .line 47
    invoke-virtual {v1, v4, v5}, Lwd1;->i(J)V

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    if-ge p1, v2, :cond_2

    .line 52
    .line 53
    if-ne p1, v0, :cond_3

    .line 54
    .line 55
    :cond_2
    monitor-enter v1

    .line 56
    :try_start_1
    iget-wide v4, v1, Lwd1;->h:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 57
    .line 58
    monitor-exit v1

    .line 59
    const-wide/16 v6, 0x2

    .line 60
    .line 61
    div-long/2addr v4, v6

    .line 62
    invoke-virtual {v1, v4, v5}, Lwd1;->i(J)V

    .line 63
    .line 64
    .line 65
    :cond_3
    :goto_1
    iget-object v1, p0, Lcom/bumptech/glide/a;->h:Lzk;

    .line 66
    .line 67
    invoke-interface {v1, p1}, Lzk;->k(I)V

    .line 68
    .line 69
    .line 70
    iget-object p0, p0, Lcom/bumptech/glide/a;->k:Ltd1;

    .line 71
    .line 72
    monitor-enter p0

    .line 73
    if-lt p1, v3, :cond_4

    .line 74
    .line 75
    :try_start_2
    monitor-enter p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 76
    const/4 p1, 0x0

    .line 77
    :try_start_3
    invoke-virtual {p0, p1}, Ltd1;->b(I)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 78
    .line 79
    .line 80
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 81
    goto :goto_2

    .line 82
    :catchall_1
    move-exception p1

    .line 83
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 84
    :try_start_6
    throw p1

    .line 85
    :cond_4
    if-ge p1, v2, :cond_5

    .line 86
    .line 87
    if-ne p1, v0, :cond_6

    .line 88
    .line 89
    :cond_5
    iget p1, p0, Ltd1;->e:I

    .line 90
    .line 91
    div-int/lit8 p1, p1, 0x2

    .line 92
    .line 93
    invoke-virtual {p0, p1}, Ltd1;->b(I)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 94
    .line 95
    .line 96
    :cond_6
    :goto_2
    monitor-exit p0

    .line 97
    return-void

    .line 98
    :catchall_2
    move-exception p1

    .line 99
    :try_start_7
    monitor-exit p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 100
    throw p1

    .line 101
    :catchall_3
    move-exception p0

    .line 102
    :try_start_8
    monitor-exit v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 103
    throw p0

    .line 104
    :goto_3
    :try_start_9
    monitor-exit v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 105
    throw p0
.end method
