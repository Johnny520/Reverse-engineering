.class public abstract Ly4;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# static fields
.field public static final a:Ljava/lang/ThreadLocal;

.field public static volatile b:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ly4;->a:Ljava/lang/ThreadLocal;

    .line 7
    .line 8
    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    const-string v0, "filename apk metadata name="

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    const-string v1, "app.apk"

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-static {p2}, Lv4;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    :goto_0
    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 13
    .line 14
    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    const-string v3, ".apk.1"

    .line 19
    .line 20
    invoke-virtual {v2, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    const/4 v3, 0x0

    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    add-int/lit8 v2, v2, -0x2

    .line 32
    .line 33
    invoke-virtual {v1, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    :cond_1
    invoke-static {v1}, Ly4;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    const-string v2, "rename_apk_file"

    .line 42
    .line 43
    invoke-static {v2}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-nez v2, :cond_2

    .line 48
    .line 49
    goto/16 :goto_6

    .line 50
    .line 51
    :cond_2
    if-eqz p0, :cond_e

    .line 52
    .line 53
    :try_start_0
    invoke-virtual {p1}, Ljava/io/File;->isFile()Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-nez v2, :cond_3

    .line 58
    .line 59
    goto/16 :goto_6

    .line 60
    .line 61
    :cond_3
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-static {v2}, Lv4;->D(Ljava/lang/String;)Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-nez v2, :cond_4

    .line 70
    .line 71
    invoke-static {p2}, Lv4;->D(Ljava/lang/String;)Z

    .line 72
    .line 73
    .line 74
    move-result p2

    .line 75
    if-nez p2, :cond_4

    .line 76
    .line 77
    goto/16 :goto_6

    .line 78
    .line 79
    :catchall_0
    move-exception p0

    .line 80
    goto/16 :goto_5

    .line 81
    .line 82
    :cond_4
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    if-nez p0, :cond_5

    .line 87
    .line 88
    goto/16 :goto_6

    .line 89
    .line 90
    :cond_5
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    invoke-virtual {p0, p2, v3}, Landroid/content/pm/PackageManager;->getPackageArchiveInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    if-nez p2, :cond_6

    .line 99
    .line 100
    goto/16 :goto_6

    .line 101
    .line 102
    :cond_6
    iget-object v2, p2, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 103
    .line 104
    if-nez v2, :cond_7

    .line 105
    .line 106
    goto/16 :goto_6

    .line 107
    .line 108
    :cond_7
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    iput-object v3, v2, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 113
    .line 114
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    iput-object p1, v2, Landroid/content/pm/ApplicationInfo;->publicSourceDir:Ljava/lang/String;

    .line 119
    .line 120
    invoke-virtual {p0, v2}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;

    .line 121
    .line 122
    .line 123
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 124
    const-string p1, ""

    .line 125
    .line 126
    if-nez p0, :cond_8

    .line 127
    .line 128
    move-object p0, p1

    .line 129
    goto :goto_1

    .line 130
    :cond_8
    :try_start_1
    invoke-interface {p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    :goto_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 139
    .line 140
    .line 141
    move-result v2

    .line 142
    if-nez v2, :cond_a

    .line 143
    .line 144
    iget-object p0, p2, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 145
    .line 146
    if-nez p0, :cond_9

    .line 147
    .line 148
    move-object p0, p1

    .line 149
    goto :goto_2

    .line 150
    :cond_9
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    :cond_a
    :goto_2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 155
    .line 156
    .line 157
    move-result v2

    .line 158
    if-nez v2, :cond_b

    .line 159
    .line 160
    goto/16 :goto_6

    .line 161
    .line 162
    :cond_b
    iget-object v2, p2, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 163
    .line 164
    if-nez v2, :cond_c

    .line 165
    .line 166
    goto :goto_3

    .line 167
    :cond_c
    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    :goto_3
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 172
    .line 173
    .line 174
    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 175
    const-string v3, ".apk"

    .line 176
    .line 177
    if-lez v2, :cond_d

    .line 178
    .line 179
    :try_start_2
    new-instance v2, Ljava/lang/StringBuilder;

    .line 180
    .line 181
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    const-string p0, "-"

    .line 188
    .line 189
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    goto :goto_4

    .line 203
    :cond_d
    invoke-virtual {p0, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object p0

    .line 207
    :goto_4
    invoke-static {p0}, Ly4;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object p0

    .line 211
    new-instance v2, Ljava/lang/StringBuilder;

    .line 212
    .line 213
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    invoke-static {v1}, Ly4;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    const-string v0, " fixed="

    .line 224
    .line 225
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    invoke-static {p0}, Ly4;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    const-string v0, " package="

    .line 236
    .line 237
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    iget-object p2, p2, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 241
    .line 242
    invoke-static {p2}, Ly4;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object p2

    .line 246
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    const-string p2, " version="

    .line 250
    .line 251
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 252
    .line 253
    .line 254
    invoke-static {p1}, Ly4;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object p1

    .line 258
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 259
    .line 260
    .line 261
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object p1

    .line 265
    invoke-static {p1}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 266
    .line 267
    .line 268
    return-object p0

    .line 269
    :goto_5
    new-instance p1, Ljava/lang/StringBuilder;

    .line 270
    .line 271
    const-string p2, "filename apk metadata failed reason="

    .line 272
    .line 273
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    const-string p2, ": "

    .line 277
    .line 278
    invoke-static {p0, p1, p2}, La;->d(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    :cond_e
    :goto_6
    return-object v1
.end method

.method public static b(Ljava/lang/String;)Ljava/io/File;
    .locals 7

    .line 1
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    const-string v4, "content://"

    .line 8
    .line 9
    const/4 v5, 0x0

    .line 10
    const/16 v6, 0xa

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    const/4 v3, 0x0

    .line 14
    move-object v1, p0

    .line 15
    invoke-virtual/range {v1 .. v6}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    const-string p0, "file://"

    .line 23
    .line 24
    invoke-virtual {v1, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    if-eqz p0, :cond_1

    .line 29
    .line 30
    const/4 p0, 0x7

    .line 31
    invoke-virtual {v1, p0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    move-object p0, v1

    .line 37
    :goto_0
    const/16 v0, 0x2f

    .line 38
    .line 39
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-gez v0, :cond_2

    .line 44
    .line 45
    const/16 v0, 0x5c

    .line 46
    .line 47
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-gez v0, :cond_2

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_2
    new-instance v0, Ljava/io/File;

    .line 55
    .line 56
    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    .line 60
    .line 61
    .line 62
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    if-eqz p0, :cond_3

    .line 64
    .line 65
    return-object v0

    .line 66
    :catchall_0
    :cond_3
    :goto_1
    const/4 p0, 0x0

    .line 67
    return-object p0
.end method

.method public static c(Ljava/lang/String;)Z
    .locals 3

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_3

    .line 9
    .line 10
    const-string v0, "url"

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_3

    .line 17
    .line 18
    const-string v0, "uri"

    .line 19
    .line 20
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_3

    .line 25
    .line 26
    const-string v0, "md5"

    .line 27
    .line 28
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_3

    .line 33
    .line 34
    const-string v0, "sha"

    .line 35
    .line 36
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-nez v0, :cond_3

    .line 41
    .line 42
    const-string v0, "uin"

    .line 43
    .line 44
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-nez v0, :cond_3

    .line 49
    .line 50
    const-string v0, "uid"

    .line 51
    .line 52
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_0

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_0
    const-string v0, "filename"

    .line 60
    .line 61
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-nez v0, :cond_2

    .line 66
    .line 67
    const-string v0, "file_name"

    .line 68
    .line 69
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-nez v0, :cond_2

    .line 74
    .line 75
    const-string v0, "name"

    .line 76
    .line 77
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    if-nez v2, :cond_2

    .line 82
    .line 83
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-nez v0, :cond_2

    .line 88
    .line 89
    const-string v0, "display"

    .line 90
    .line 91
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-nez v0, :cond_2

    .line 96
    .line 97
    const-string v0, "title"

    .line 98
    .line 99
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 100
    .line 101
    .line 102
    move-result p0

    .line 103
    if-eqz p0, :cond_1

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_1
    return v1

    .line 107
    :cond_2
    :goto_0
    const/4 p0, 0x1

    .line 108
    return p0

    .line 109
    :cond_3
    :goto_1
    return v1
.end method

.method public static d(Ljava/lang/String;)Z
    .locals 2

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const-string v0, "local"

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    const-string v0, "file"

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_1

    .line 24
    .line 25
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    const-string v0, "uri"

    .line 32
    .line 33
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-eqz p0, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const/4 p0, 0x0

    .line 41
    return p0

    .line 42
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 43
    return p0
.end method

.method public static e(Ljava/lang/String;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_4

    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    goto/16 :goto_1

    .line 11
    .line 12
    :cond_0
    const/16 v1, 0x5c

    .line 13
    .line 14
    const/16 v2, 0x2f

    .line 15
    .line 16
    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 21
    .line 22
    invoke-virtual {p0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    const-string v1, "/mobileqq/photo/"

    .line 27
    .line 28
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    const/4 v2, 0x1

    .line 33
    if-nez v1, :cond_3

    .line 34
    .line 35
    const-string v1, "/nt_data/pic/"

    .line 36
    .line 37
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-nez v1, :cond_3

    .line 42
    .line 43
    const-string v1, "/richmedia/"

    .line 44
    .line 45
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-nez v1, :cond_3

    .line 50
    .line 51
    const-string v1, "/shortvideo/"

    .line 52
    .line 53
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-nez v1, :cond_3

    .line 58
    .line 59
    const-string v1, "/qq_images/"

    .line 60
    .line 61
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-nez v1, :cond_3

    .line 66
    .line 67
    const-string v1, "/image/"

    .line 68
    .line 69
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-nez v1, :cond_3

    .line 74
    .line 75
    const-string v1, "/thumb/"

    .line 76
    .line 77
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-nez v1, :cond_3

    .line 82
    .line 83
    const-string v1, "/video/"

    .line 84
    .line 85
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    if-nez v1, :cond_3

    .line 90
    .line 91
    const-string v1, "/ptt/"

    .line 92
    .line 93
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    if-nez v1, :cond_3

    .line 98
    .line 99
    const-string v1, "/voice/"

    .line 100
    .line 101
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    if-eqz v1, :cond_1

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_1
    invoke-static {p0}, Lv4;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    const-string v1, ".jpg"

    .line 113
    .line 114
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    if-nez v1, :cond_3

    .line 119
    .line 120
    const-string v1, ".jpeg"

    .line 121
    .line 122
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    if-nez v1, :cond_3

    .line 127
    .line 128
    const-string v1, ".png"

    .line 129
    .line 130
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    if-nez v1, :cond_3

    .line 135
    .line 136
    const-string v1, ".gif"

    .line 137
    .line 138
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    if-nez v1, :cond_3

    .line 143
    .line 144
    const-string v1, ".webp"

    .line 145
    .line 146
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 147
    .line 148
    .line 149
    move-result v1

    .line 150
    if-nez v1, :cond_3

    .line 151
    .line 152
    const-string v1, ".heic"

    .line 153
    .line 154
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    if-nez v1, :cond_3

    .line 159
    .line 160
    const-string v1, ".mp4"

    .line 161
    .line 162
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 163
    .line 164
    .line 165
    move-result v1

    .line 166
    if-nez v1, :cond_3

    .line 167
    .line 168
    const-string v1, ".mov"

    .line 169
    .line 170
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 171
    .line 172
    .line 173
    move-result v1

    .line 174
    if-nez v1, :cond_3

    .line 175
    .line 176
    const-string v1, ".m4a"

    .line 177
    .line 178
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 179
    .line 180
    .line 181
    move-result v1

    .line 182
    if-nez v1, :cond_3

    .line 183
    .line 184
    const-string v1, ".amr"

    .line 185
    .line 186
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 187
    .line 188
    .line 189
    move-result v1

    .line 190
    if-nez v1, :cond_3

    .line 191
    .line 192
    const-string v1, ".silk"

    .line 193
    .line 194
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 195
    .line 196
    .line 197
    move-result p0

    .line 198
    if-eqz p0, :cond_2

    .line 199
    .line 200
    goto :goto_0

    .line 201
    :cond_2
    return v0

    .line 202
    :cond_3
    :goto_0
    return v2

    .line 203
    :cond_4
    :goto_1
    return v0
.end method

.method public static f(Ljava/io/File;Ljava/lang/String;J)Ljava/io/File;
    .locals 5

    .line 1
    invoke-static {p1}, Lv4;->D(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance p2, Ljava/io/File;

    .line 8
    .line 9
    invoke-direct {p2, p0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-object p2

    .line 13
    :cond_0
    new-instance v0, Ljava/io/File;

    .line 14
    .line 15
    invoke-direct {v0, p0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_7

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/io/File;->length()J

    .line 25
    .line 26
    .line 27
    move-result-wide v1

    .line 28
    cmp-long v1, v1, p2

    .line 29
    .line 30
    if-nez v1, :cond_1

    .line 31
    .line 32
    goto :goto_4

    .line 33
    :cond_1
    const/16 v0, 0x2e

    .line 34
    .line 35
    invoke-virtual {p1, v0}, Ljava/lang/String;->lastIndexOf(I)I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-lez v0, :cond_2

    .line 40
    .line 41
    const/4 v1, 0x0

    .line 42
    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    goto :goto_0

    .line 47
    :cond_2
    move-object v1, p1

    .line 48
    :goto_0
    if-lez v0, :cond_3

    .line 49
    .line 50
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    goto :goto_1

    .line 55
    :cond_3
    const-string p1, ""

    .line 56
    .line 57
    :goto_1
    const/4 v0, 0x2

    .line 58
    :goto_2
    const/16 v2, 0x63

    .line 59
    .line 60
    const-string v3, "_"

    .line 61
    .line 62
    if-gt v0, v2, :cond_6

    .line 63
    .line 64
    new-instance v2, Ljava/io/File;

    .line 65
    .line 66
    new-instance v4, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    invoke-direct {v2, p0, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    if-eqz v3, :cond_5

    .line 95
    .line 96
    invoke-virtual {v2}, Ljava/io/File;->length()J

    .line 97
    .line 98
    .line 99
    move-result-wide v3

    .line 100
    cmp-long v3, v3, p2

    .line 101
    .line 102
    if-nez v3, :cond_4

    .line 103
    .line 104
    goto :goto_3

    .line 105
    :cond_4
    add-int/lit8 v0, v0, 0x1

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_5
    :goto_3
    return-object v2

    .line 109
    :cond_6
    new-instance p2, Ljava/io/File;

    .line 110
    .line 111
    new-instance p3, Ljava/lang/StringBuilder;

    .line 112
    .line 113
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 123
    .line 124
    .line 125
    move-result-wide v0

    .line 126
    invoke-virtual {p3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    invoke-direct {p2, p0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    return-object p2

    .line 140
    :cond_7
    :goto_4
    return-object v0
.end method

.method public static g(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, ""

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/16 v0, 0xd

    .line 7
    .line 8
    const/16 v1, 0x20

    .line 9
    .line 10
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    const/16 v0, 0xa

    .line 15
    .line 16
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    const/16 v0, 0x9

    .line 21
    .line 22
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    const/16 v1, 0xdc

    .line 31
    .line 32
    if-le v0, v1, :cond_1

    .line 33
    .line 34
    const/4 v0, 0x0

    .line 35
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    const-string v0, "..."

    .line 40
    .line 41
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    :cond_1
    return-object p0
.end method

.method public static h(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    move-object p0, v0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    invoke-static {p0}, Lv4;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    :goto_0
    const/16 v1, 0xd

    .line 12
    .line 13
    const/16 v2, 0x20

    .line 14
    .line 15
    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    const/16 v1, 0xa

    .line 20
    .line 21
    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    const/16 v1, 0x9

    .line 26
    .line 27
    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    const/4 v1, 0x0

    .line 36
    if-nez p0, :cond_1

    .line 37
    .line 38
    move-object p0, v0

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 41
    .line 42
    invoke-virtual {p0, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    const-string v3, ".apk.1"

    .line 47
    .line 48
    invoke-virtual {v2, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-eqz v2, :cond_2

    .line 53
    .line 54
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    add-int/lit8 v2, v2, -0x2

    .line 59
    .line 60
    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    :cond_2
    :goto_1
    const-string v2, "[\\\\/:*?\"<>|\\p{Cntrl}]+"

    .line 65
    .line 66
    const-string v3, "_"

    .line 67
    .line 68
    invoke-virtual {p0, v2, v3}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    :goto_2
    const-string v2, "."

    .line 77
    .line 78
    invoke-virtual {p0, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    const/4 v3, 0x1

    .line 83
    if-eqz v2, :cond_3

    .line 84
    .line 85
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    sub-int/2addr v2, v3

    .line 90
    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    goto :goto_2

    .line 99
    :cond_3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    if-nez v2, :cond_4

    .line 104
    .line 105
    const-string p0, "unnamed_file"

    .line 106
    .line 107
    :cond_4
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    const/16 v4, 0x78

    .line 112
    .line 113
    if-le v2, v4, :cond_8

    .line 114
    .line 115
    const/16 v2, 0x2e

    .line 116
    .line 117
    invoke-virtual {p0, v2}, Ljava/lang/String;->lastIndexOf(I)I

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    if-lez v2, :cond_5

    .line 122
    .line 123
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 124
    .line 125
    .line 126
    move-result v5

    .line 127
    sub-int/2addr v5, v2

    .line 128
    const/16 v6, 0x18

    .line 129
    .line 130
    if-gt v5, v6, :cond_5

    .line 131
    .line 132
    invoke-virtual {p0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    :cond_5
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 137
    .line 138
    .line 139
    move-result v5

    .line 140
    if-lez v5, :cond_6

    .line 141
    .line 142
    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    :cond_6
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 147
    .line 148
    .line 149
    move-result v2

    .line 150
    sub-int/2addr v4, v2

    .line 151
    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    .line 152
    .line 153
    .line 154
    move-result v2

    .line 155
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 156
    .line 157
    .line 158
    move-result v3

    .line 159
    if-le v3, v2, :cond_7

    .line 160
    .line 161
    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    :cond_7
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    :cond_8
    return-object p0
.end method

.method public static i(Ljava/lang/Object;ILjava/util/HashSet;)I
    .locals 32

    move-object/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v3, p2

    if-eqz v1, :cond_0

    const/4 v0, 0x3

    if-gt v2, v0, :cond_0

    .line 1
    invoke-virtual {v3, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    const/16 v19, 0x0

    goto/16 :goto_3c

    .line 2
    :cond_1
    instance-of v0, v1, Ljava/lang/String;

    if-nez v0, :cond_0

    instance-of v0, v1, Ljava/lang/Number;

    if-nez v0, :cond_0

    instance-of v0, v1, Ljava/lang/Boolean;

    if-nez v0, :cond_0

    instance-of v0, v1, Landroid/content/Context;

    if-nez v0, :cond_0

    instance-of v0, v1, Landroid/view/View;

    if-eqz v0, :cond_2

    goto :goto_0

    .line 3
    :cond_2
    invoke-virtual {v3, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 4
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    .line 5
    const-string v5, "com.tencent."

    invoke-virtual {v0, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_3

    const-string v5, "java.util."

    invoke-virtual {v0, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_3

    goto :goto_0

    .line 6
    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    const-string v6, ""

    move-object v9, v6

    move-object v10, v9

    const/4 v8, 0x0

    .line 7
    :goto_1
    const-class v11, Ljava/lang/Object;

    const/4 v12, 0x1

    if-eqz v5, :cond_e

    if-eq v5, v11, :cond_e

    .line 8
    :try_start_0
    invoke-virtual {v5}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v11
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    const/4 v11, 0x0

    :goto_2
    if-eqz v11, :cond_d

    .line 9
    array-length v13, v11

    const/4 v14, 0x0

    :goto_3
    if-ge v14, v13, :cond_d

    aget-object v15, v11, v14

    .line 10
    :try_start_1
    invoke-virtual {v15}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v16

    invoke-static/range {v16 .. v16}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v16

    if-eqz v16, :cond_4

    goto/16 :goto_5

    .line 11
    :cond_4
    invoke-virtual {v15, v12}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 12
    invoke-virtual {v15, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    .line 13
    invoke-virtual {v15}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v15

    if-nez v15, :cond_5

    move-object v12, v6

    goto :goto_4

    .line 14
    :cond_5
    sget-object v12, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v15, v12}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v12

    .line 15
    :goto_4
    instance-of v15, v7, Ljava/lang/String;

    if-eqz v15, :cond_a

    .line 16
    check-cast v7, Ljava/lang/String;

    .line 17
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v15

    if-nez v15, :cond_6

    goto :goto_5

    .line 18
    :cond_6
    invoke-static {v7}, Ly4;->b(Ljava/lang/String;)Ljava/io/File;

    move-result-object v15

    if-eqz v15, :cond_7

    if-nez v8, :cond_7

    move-object v8, v15

    .line 19
    :cond_7
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v18

    if-nez v18, :cond_8

    invoke-static {v12}, Ly4;->d(Ljava/lang/String;)Z

    move-result v18

    if-eqz v18, :cond_8

    move-object v9, v7

    .line 20
    :cond_8
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v18

    if-nez v18, :cond_9

    invoke-static {v12}, Ly4;->c(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_9

    invoke-static {v7}, Lv4;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 21
    :cond_9
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v12

    if-nez v12, :cond_c

    if-eqz v15, :cond_c

    move-object v9, v7

    goto :goto_5

    .line 22
    :cond_a
    instance-of v15, v7, Ljava/io/File;

    if-eqz v15, :cond_c

    .line 23
    check-cast v7, Ljava/io/File;

    .line 24
    invoke-virtual {v7}, Ljava/io/File;->isFile()Z

    move-result v15

    if-eqz v15, :cond_b

    if-nez v8, :cond_b

    move-object v8, v7

    .line 25
    :cond_b
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v15

    if-nez v15, :cond_c

    invoke-static {v12}, Ly4;->d(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_c

    invoke-virtual {v7}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v9
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    :cond_c
    :goto_5
    add-int/lit8 v14, v14, 0x1

    const/4 v12, 0x1

    goto/16 :goto_3

    .line 26
    :cond_d
    invoke-virtual {v5}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v5

    goto/16 :goto_1

    :cond_e
    if-nez v8, :cond_10

    .line 27
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v5

    if-gtz v5, :cond_10

    .line 28
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_f

    invoke-static {v10}, Ly4;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_10

    invoke-static {v10}, Lx0;->a(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_f

    goto :goto_6

    :cond_f
    const/4 v4, 0x0

    goto/16 :goto_34

    .line 29
    :cond_10
    :goto_6
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_11

    invoke-static {v10}, Lv4;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_7

    :cond_11
    if-eqz v8, :cond_12

    .line 30
    invoke-virtual {v8}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v5

    goto :goto_7

    .line 31
    :cond_12
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_13

    invoke-static {v9}, Lv4;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_7

    .line 32
    :cond_13
    const-string v5, "unnamed_file"

    .line 33
    :goto_7
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v7

    if-lez v7, :cond_14

    move-object v7, v9

    goto :goto_8

    :cond_14
    if-nez v8, :cond_15

    move-object v7, v6

    goto :goto_8

    .line 34
    :cond_15
    invoke-virtual {v8}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v7

    .line 35
    :goto_8
    sget-object v12, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v12}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v12

    .line 36
    const-string v13, "picelement"

    invoke-virtual {v12, v13}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v13

    const-string v14, " class="

    const-string v15, " originalPath="

    if-nez v13, :cond_17

    const-string v13, "videoelement"

    .line 37
    invoke-virtual {v12, v13}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v13

    if-nez v13, :cond_17

    const-string v13, "pttelement"

    .line 38
    invoke-virtual {v12, v13}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v13

    if-nez v13, :cond_17

    const-string v13, "audioelement"

    .line 39
    invoke-virtual {v12, v13}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v13

    if-nez v13, :cond_17

    const-string v13, "faceelement"

    .line 40
    invoke-virtual {v12, v13}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v13

    if-nez v13, :cond_17

    const-string v13, "marketelement"

    .line 41
    invoke-virtual {v12, v13}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v12

    if-eqz v12, :cond_16

    goto :goto_9

    .line 42
    :cond_16
    invoke-static {v9}, Ly4;->e(Ljava/lang/String;)Z

    move-result v12

    if-nez v12, :cond_17

    .line 43
    invoke-static {v10}, Ly4;->e(Ljava/lang/String;)Z

    move-result v12

    if-nez v12, :cond_17

    if-eqz v8, :cond_18

    .line 44
    invoke-virtual {v8}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Ly4;->e(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_18

    :cond_17
    :goto_9
    move-object/from16 v18, v5

    move-object/from16 v25, v7

    goto/16 :goto_3a

    :cond_18
    if-nez v8, :cond_1a

    .line 45
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v12

    if-lez v12, :cond_19

    goto :goto_a

    .line 46
    :cond_19
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v12

    if-lez v12, :cond_0

    .line 47
    invoke-static {v10}, Ly4;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v12, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_1a

    invoke-static {v10}, Lx0;->a(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_0

    .line 48
    :cond_1a
    :goto_a
    invoke-static {v9}, Lx0;->b(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_1c

    :cond_1b
    :goto_b
    const/4 v12, 0x1

    goto :goto_c

    .line 49
    :cond_1c
    invoke-static {v9}, Lx0;->c(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_1d

    goto :goto_b

    :cond_1d
    if-eqz v8, :cond_1e

    .line 50
    :try_start_2
    invoke-virtual {v8}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lx0;->b(Ljava/lang/String;)Z

    move-result v12

    if-nez v12, :cond_1b

    .line 51
    invoke-virtual {v8}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lx0;->c(Ljava/lang/String;)Z

    move-result v12
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-eqz v12, :cond_1e

    goto :goto_b

    :catchall_2
    :cond_1e
    const/4 v12, 0x0

    :goto_c
    if-eqz v12, :cond_20

    .line 52
    sget-object v13, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sget-object v18, Ly4;->a:Ljava/lang/ThreadLocal;

    const/16 v19, 0x0

    invoke-virtual/range {v18 .. v18}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v13, v4}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1f

    .line 53
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "filename metadata skipped hot download path originalName="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v5}, Ly4;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    invoke-static {v7}, Ly4;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 55
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    return v19

    .line 56
    :cond_1f
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v13, "filename metadata hot path display-only originalName="

    invoke-direct {v4, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v5}, Ly4;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v4, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    invoke-static {v7}, Ly4;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v4, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 58
    invoke-static {v4}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    goto :goto_d

    :cond_20
    const/16 v19, 0x0

    .line 59
    :goto_d
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v13, "filename outgoing detected originalName="

    invoke-direct {v4, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v5}, Ly4;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v4, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    invoke-static {v7}, Ly4;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v4, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 61
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 62
    invoke-static {v5}, Ly4;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 63
    const-string v4, "rename_apk_file"

    invoke-static {v4}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_21

    goto :goto_10

    .line 64
    :cond_21
    :try_start_3
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_22

    move-object v4, v9

    goto :goto_e

    :cond_22
    if-nez v8, :cond_23

    move-object v4, v6

    goto :goto_e

    .line 65
    :cond_23
    invoke-virtual {v8}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    :goto_e
    if-nez v8, :cond_24

    .line 66
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v13

    if-lez v13, :cond_24

    invoke-static {v4}, Ly4;->b(Ljava/lang/String;)Ljava/io/File;

    move-result-object v4

    goto :goto_f

    :cond_24
    move-object v4, v8

    :goto_f
    if-eqz v4, :cond_27

    .line 67
    invoke-virtual {v4}, Ljava/io/File;->isFile()Z

    move-result v13

    if-nez v13, :cond_25

    goto :goto_10

    .line 68
    :cond_25
    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Lv4;->D(Ljava/lang/String;)Z

    move-result v13

    if-nez v13, :cond_26

    .line 69
    invoke-static {v5}, Lv4;->D(Ljava/lang/String;)Z

    move-result v13

    if-nez v13, :cond_26

    .line 70
    invoke-static {v5}, Lx0;->a(Ljava/lang/String;)Z

    move-result v13

    if-nez v13, :cond_26

    goto :goto_10

    .line 71
    :cond_26
    invoke-static {}, Lcom/mr/elaris/HookEntry;->hostContext()Landroid/content/Context;

    move-result-object v13

    invoke-static {v13, v4, v5}, Ly4;->a(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    :catchall_3
    :cond_27
    :goto_10
    move-object v4, v0

    .line 72
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_28

    .line 73
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v13, "filename sanitize original="

    invoke-direct {v0, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v5}, Ly4;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v13, " fixed="

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v4}, Ly4;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    :cond_28
    if-nez v12, :cond_36

    if-eqz v8, :cond_36

    .line 74
    invoke-virtual {v8}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_36

    .line 75
    const-string v0, "filename safe copy skipped public download apk marker path="

    const-string v12, "filename safe copy skipped hot download path="

    :try_start_4
    invoke-virtual {v8}, Ljava/io/File;->isFile()Z

    move-result v13

    if-nez v13, :cond_29

    :goto_11
    move-object/from16 v18, v4

    :goto_12
    const/4 v0, 0x0

    goto/16 :goto_19

    .line 76
    :cond_29
    invoke-virtual {v8}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Lx0;->b(Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_2a

    .line 77
    invoke-virtual {v8}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ly4;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    goto :goto_11

    :catchall_4
    move-exception v0

    move-object/from16 v18, v4

    goto/16 :goto_18

    .line 78
    :cond_2a
    invoke-virtual {v8}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lx0;->c(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_2b

    .line 79
    invoke-virtual {v8}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Ly4;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v0, v12}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    goto :goto_11

    .line 80
    :cond_2b
    invoke-static {}, Lcom/mr/elaris/HookEntry;->hostContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_2c

    goto :goto_11

    .line 81
    :cond_2c
    new-instance v12, Ljava/io/File;

    invoke-virtual {v0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v0

    const-string v13, "elaris_send_file"

    invoke-direct {v12, v0, v13}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 82
    invoke-virtual {v12}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_2d

    invoke-virtual {v12}, Ljava/io/File;->mkdirs()Z

    .line 83
    :cond_2d
    invoke-virtual {v8}, Ljava/io/File;->length()J

    move-result-wide v13

    invoke-static {v12, v4, v13, v14}, Ly4;->f(Ljava/io/File;Ljava/lang/String;J)Ljava/io/File;

    move-result-object v0

    .line 84
    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    move-result v12

    if-eqz v12, :cond_2e

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v12

    invoke-virtual {v8}, Ljava/io/File;->length()J

    move-result-wide v20

    cmp-long v12, v12, v20

    if-nez v12, :cond_2e

    move-object/from16 v18, v4

    goto/16 :goto_19

    .line 85
    :cond_2e
    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    move-result v12

    if-eqz v12, :cond_2f

    invoke-static {v4}, Lv4;->D(Ljava/lang/String;)Z

    move-result v12
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    if-eqz v12, :cond_2f

    .line 86
    :try_start_5
    invoke-virtual {v0}, Ljava/io/File;->delete()Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 87
    :catchall_5
    :cond_2f
    :try_start_6
    new-instance v12, Ljava/io/FileInputStream;

    invoke-direct {v12, v8}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_a

    .line 88
    :try_start_7
    new-instance v13, Ljava/io/FileOutputStream;

    invoke-direct {v13, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_9

    const/high16 v14, 0x10000

    .line 89
    :try_start_8
    new-array v14, v14, [B

    .line 90
    :goto_13
    invoke-virtual {v12, v14}, Ljava/io/FileInputStream;->read([B)I

    move-result v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    if-lez v2, :cond_30

    move-object/from16 v18, v4

    move/from16 v4, v19

    :try_start_9
    invoke-virtual {v13, v14, v4, v2}, Ljava/io/FileOutputStream;->write([BII)V

    move-object/from16 v4, v18

    const/16 v19, 0x0

    goto :goto_13

    :cond_30
    move-object/from16 v18, v4

    .line 91
    invoke-virtual {v13}, Ljava/io/OutputStream;->flush()V

    .line 92
    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v20

    invoke-virtual {v8}, Ljava/io/File;->length()J

    move-result-wide v22
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_b

    cmp-long v2, v20, v22

    if-nez v2, :cond_31

    const/4 v2, 0x1

    goto :goto_14

    :cond_31
    const/4 v2, 0x0

    .line 93
    :goto_14
    :try_start_a
    invoke-virtual {v12}, Ljava/io/FileInputStream;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    .line 94
    :catchall_6
    :try_start_b
    invoke-virtual {v13}, Ljava/io/FileOutputStream;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    :catchall_7
    move v4, v2

    goto :goto_17

    :catchall_8
    move-object/from16 v18, v4

    goto :goto_16

    :catchall_9
    move-object/from16 v18, v4

    :goto_15
    const/4 v13, 0x0

    goto :goto_16

    :catchall_a
    move-object/from16 v18, v4

    const/4 v12, 0x0

    goto :goto_15

    :catchall_b
    :goto_16
    if-eqz v12, :cond_32

    .line 95
    :try_start_c
    invoke-virtual {v12}, Ljava/io/FileInputStream;->close()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_c

    :catchall_c
    :cond_32
    if-eqz v13, :cond_33

    .line 96
    :try_start_d
    invoke-virtual {v13}, Ljava/io/FileOutputStream;->close()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_d

    :catchall_d
    :cond_33
    const/4 v4, 0x0

    :goto_17
    if-nez v4, :cond_34

    goto/16 :goto_12

    .line 97
    :cond_34
    :try_start_e
    invoke-virtual {v8}, Ljava/io/File;->lastModified()J

    move-result-wide v12

    invoke-virtual {v0, v12, v13}, Ljava/io/File;->setLastModified(J)Z
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_e

    goto :goto_19

    :catchall_e
    move-exception v0

    .line 98
    :goto_18
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "filename metadata patched failed reason="

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v4, ": "

    .line 99
    invoke-static {v0, v2, v4}, La;->d(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    goto/16 :goto_12

    :goto_19
    if-eqz v0, :cond_35

    .line 100
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v4

    goto :goto_1a

    :cond_35
    move-object/from16 v4, v18

    goto :goto_1a

    :cond_36
    move-object/from16 v18, v4

    move-object/from16 v4, v18

    const/4 v0, 0x0

    :goto_1a
    if-nez v0, :cond_37

    move-object v2, v6

    goto :goto_1b

    .line 101
    :cond_37
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    :goto_1b
    if-nez v0, :cond_38

    const-wide/16 v12, -0x1

    goto :goto_1c

    .line 102
    :cond_38
    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v12

    .line 103
    :goto_1c
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v14

    move-object/from16 v18, v5

    move-object v5, v14

    const/4 v14, 0x0

    :goto_1d
    if-eqz v5, :cond_51

    if-eq v5, v11, :cond_51

    .line 104
    :try_start_f
    invoke-virtual {v5}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v20
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_f

    move-object/from16 v31, v20

    move-object/from16 v20, v5

    move-object/from16 v5, v31

    goto :goto_1e

    :catchall_f
    move-object/from16 v20, v5

    const/4 v5, 0x0

    :goto_1e
    move-object/from16 v21, v6

    if-eqz v5, :cond_50

    .line 105
    array-length v6, v5

    move/from16 v22, v14

    const/4 v14, 0x0

    :goto_1f
    if-ge v14, v6, :cond_4f

    move-object/from16 v23, v5

    aget-object v5, v23, v14

    .line 106
    :try_start_10
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v24

    invoke-static/range {v24 .. v24}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v24
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_15

    if-eqz v24, :cond_39

    goto/16 :goto_31

    :cond_39
    move/from16 v24, v6

    const/4 v6, 0x1

    .line 107
    :try_start_11
    invoke-virtual {v5, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 108
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v6
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_14

    if-nez v6, :cond_3a

    move-object/from16 v25, v7

    move-object/from16 v6, v21

    goto :goto_20

    :cond_3a
    move-object/from16 v25, v7

    .line 109
    :try_start_12
    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v6, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v6

    .line 110
    :goto_20
    invoke-virtual {v5, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_13

    move-object/from16 v26, v8

    .line 111
    :try_start_13
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v8
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_12

    move/from16 v27, v14

    :try_start_14
    const-class v14, Ljava/lang/String;

    if-ne v8, v14, :cond_4b

    instance-of v8, v7, Ljava/lang/String;

    if-eqz v8, :cond_4b

    .line 112
    check-cast v7, Ljava/lang/String;

    .line 113
    invoke-static {v6}, Ly4;->c(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_3f

    if-eqz v4, :cond_3f

    .line 114
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v8

    if-nez v8, :cond_3b

    goto :goto_23

    .line 115
    :cond_3b
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v8

    if-nez v8, :cond_3c

    goto :goto_22

    .line 116
    :cond_3c
    invoke-static {v7}, Lv4;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 117
    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_3e

    if-nez v26, :cond_3d

    move-object/from16 v14, v21

    goto :goto_21

    .line 118
    :cond_3d
    invoke-virtual/range {v26 .. v26}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v14

    .line 119
    :goto_21
    invoke-virtual {v8, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_3e

    .line 120
    invoke-static {v8}, Ly4;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v14, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_3e

    .line 121
    invoke-static {v8}, Lx0;->a(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_3f

    .line 122
    :cond_3e
    :goto_22
    invoke-virtual {v5, v1, v4}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    add-int/lit8 v22, v22, 0x1

    goto :goto_25

    :cond_3f
    :goto_23
    if-eqz v0, :cond_41

    .line 123
    invoke-static {v6}, Ly4;->d(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_41

    .line 124
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v6

    if-nez v6, :cond_40

    goto :goto_25

    .line 125
    :cond_40
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v6
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_10

    const/4 v8, 0x7

    const-string v14, "file://"

    if-lez v6, :cond_44

    .line 126
    :try_start_15
    invoke-virtual {v7, v14}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_42

    invoke-virtual {v7, v8}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v6
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_10

    :goto_24
    move-object/from16 v29, v4

    const/16 v4, 0x2f

    const/16 v8, 0x5c

    goto :goto_26

    :catchall_10
    :cond_41
    :goto_25
    move-object/from16 v29, v4

    goto :goto_27

    :cond_42
    move-object v6, v7

    goto :goto_24

    .line 127
    :goto_26
    :try_start_16
    invoke-virtual {v6, v8, v4}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v6

    .line 128
    invoke-virtual {v9, v14}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v28

    if-eqz v28, :cond_43

    const/4 v4, 0x7

    invoke-virtual {v9, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v28
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_11

    move-object/from16 v30, v9

    move-object/from16 v4, v28

    const/16 v9, 0x2f

    goto :goto_28

    :catchall_11
    :goto_27
    move-object/from16 v30, v9

    goto/16 :goto_32

    :cond_43
    move-object/from16 v30, v9

    move v9, v4

    move-object/from16 v4, v30

    .line 129
    :goto_28
    :try_start_17
    invoke-virtual {v4, v8, v9}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_45

    goto :goto_2b

    :cond_44
    move-object/from16 v29, v4

    move-object/from16 v30, v9

    .line 130
    :cond_45
    invoke-static {v7}, Ly4;->b(Ljava/lang/String;)Ljava/io/File;

    move-result-object v4

    if-eqz v4, :cond_4e

    if-eqz v26, :cond_4e

    .line 131
    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {v26 .. v26}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v6

    if-eqz v4, :cond_49

    if-nez v6, :cond_46

    goto :goto_29

    .line 132
    :cond_46
    invoke-virtual {v4, v14}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_47

    const/4 v8, 0x7

    invoke-virtual {v4, v8}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    :cond_47
    const/16 v8, 0x2f

    const/16 v9, 0x5c

    .line 133
    invoke-virtual {v4, v9, v8}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v4

    .line 134
    invoke-virtual {v6, v14}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v28

    if-eqz v28, :cond_48

    const/4 v8, 0x7

    invoke-virtual {v6, v8}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v6

    const/16 v8, 0x2f

    .line 135
    :cond_48
    invoke-virtual {v6, v9, v8}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    goto :goto_2a

    :cond_49
    :goto_29
    const/4 v4, 0x0

    :goto_2a
    if-eqz v4, :cond_4e

    .line 136
    :goto_2b
    invoke-virtual {v7, v14}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_4a

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 v8, 0x5c

    const/16 v9, 0x2f

    invoke-virtual {v2, v8, v9}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    goto :goto_2c

    :cond_4a
    move-object v4, v2

    .line 137
    :goto_2c
    invoke-virtual {v5, v1, v4}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_2d
    add-int/lit8 v22, v22, 0x1

    goto/16 :goto_32

    :cond_4b
    move-object/from16 v29, v4

    move-object/from16 v30, v9

    if-eqz v0, :cond_4c

    .line 138
    instance-of v4, v7, Ljava/io/File;

    if-eqz v4, :cond_4c

    invoke-static {v6}, Ly4;->d(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_4c

    .line 139
    invoke-virtual {v5, v1, v0}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_2d

    :cond_4c
    if-eqz v0, :cond_4e

    .line 140
    const-string v4, "size"

    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_4d

    invoke-virtual {v6, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_4d

    const-string v4, "filesize"

    invoke-virtual {v6, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_4d

    const-string v4, "filelen"

    invoke-virtual {v6, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_4d

    const-string v4, "length"

    invoke-virtual {v6, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_4e

    :cond_4d
    const-wide/16 v6, 0x0

    cmp-long v4, v12, v6

    if-ltz v4, :cond_4e

    .line 141
    invoke-static {v5, v1, v12, v13}, Ly4;->j(Ljava/lang/reflect/Field;Ljava/lang/Object;J)I

    move-result v4
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_16

    add-int v22, v22, v4

    goto :goto_32

    :catchall_12
    move-object/from16 v29, v4

    goto :goto_2f

    :catchall_13
    move-object/from16 v29, v4

    :goto_2e
    move-object/from16 v26, v8

    :goto_2f
    move-object/from16 v30, v9

    move/from16 v27, v14

    goto :goto_32

    :catchall_14
    move-object/from16 v29, v4

    :goto_30
    move-object/from16 v25, v7

    goto :goto_2e

    :catchall_15
    :goto_31
    move-object/from16 v29, v4

    move/from16 v24, v6

    goto :goto_30

    :catchall_16
    :cond_4e
    :goto_32
    add-int/lit8 v14, v27, 0x1

    move-object/from16 v5, v23

    move/from16 v6, v24

    move-object/from16 v7, v25

    move-object/from16 v8, v26

    move-object/from16 v4, v29

    move-object/from16 v9, v30

    goto/16 :goto_1f

    :cond_4f
    move/from16 v14, v22

    :cond_50
    move-object/from16 v29, v4

    move-object/from16 v25, v7

    move-object/from16 v26, v8

    move-object/from16 v30, v9

    .line 142
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v5

    move-object/from16 v6, v21

    move-object/from16 v7, v25

    move-object/from16 v8, v26

    move-object/from16 v4, v29

    move-object/from16 v9, v30

    goto/16 :goto_1d

    :cond_51
    move-object/from16 v29, v4

    move-object/from16 v21, v6

    move-object/from16 v25, v7

    if-lez v14, :cond_53

    .line 143
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "filename metadata patched originalName="

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static/range {v18 .. v18}, Ly4;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " fixedName="

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    invoke-static/range {v29 .. v29}, Ly4;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    invoke-static/range {v25 .. v25}, Ly4;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " safePath="

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez v0, :cond_52

    move-object/from16 v6, v21

    goto :goto_33

    .line 146
    :cond_52
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v6

    :goto_33
    invoke-static {v6}, Ly4;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 147
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    :cond_53
    move v4, v14

    .line 148
    :goto_34
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    :goto_35
    if-eqz v0, :cond_58

    if-eq v0, v11, :cond_58

    .line 149
    :try_start_18
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v2
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_17

    goto :goto_36

    :catchall_17
    const/4 v2, 0x0

    :goto_36
    if-eqz v2, :cond_57

    .line 150
    array-length v5, v2

    move v6, v4

    const/4 v4, 0x0

    :goto_37
    if-ge v4, v5, :cond_56

    aget-object v7, v2, v4

    .line 151
    :try_start_19
    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v8

    invoke-static {v8}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v8

    if-nez v8, :cond_55

    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Class;->isPrimitive()Z

    move-result v8
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_18

    if-eqz v8, :cond_54

    goto :goto_38

    :cond_54
    const/4 v8, 0x1

    .line 152
    :try_start_1a
    invoke-virtual {v7, v8}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_19

    .line 153
    :try_start_1b
    invoke-virtual {v7, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    if-eqz v7, :cond_55

    .line 154
    instance-of v8, v7, Ljava/lang/String;

    if-nez v8, :cond_55

    instance-of v8, v7, Ljava/lang/Number;

    if-nez v8, :cond_55

    instance-of v8, v7, Ljava/lang/Boolean;
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_18

    if-nez v8, :cond_55

    const/16 v17, 0x1

    add-int/lit8 v8, p1, 0x1

    .line 155
    :try_start_1c
    invoke-static {v7, v8, v3}, Ly4;->i(Ljava/lang/Object;ILjava/util/HashSet;)I

    move-result v7
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_1a

    add-int/2addr v6, v7

    goto :goto_39

    :catchall_18
    :cond_55
    :goto_38
    const/16 v17, 0x1

    goto :goto_39

    :catchall_19
    move/from16 v17, v8

    :catchall_1a
    :goto_39
    add-int/lit8 v4, v4, 0x1

    goto :goto_37

    :cond_56
    move v4, v6

    :cond_57
    const/16 v17, 0x1

    .line 156
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v0

    goto :goto_35

    :cond_58
    return v4

    .line 157
    :goto_3a
    const-string v1, "debug_log"

    invoke-static {v1}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_59

    goto :goto_3b

    .line 158
    :cond_59
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    .line 159
    sget-wide v3, Ly4;->b:J

    sub-long v3, v1, v3

    const-wide/16 v5, 0x1388

    cmp-long v3, v3, v5

    if-gez v3, :cond_5a

    :goto_3b
    goto/16 :goto_0

    .line 160
    :cond_5a
    sput-wide v1, Ly4;->b:J

    .line 161
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "filename metadata skipped media path originalName="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static/range {v18 .. v18}, Ly4;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    invoke-static/range {v25 .. v25}, Ly4;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 163
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    goto/16 :goto_0

    :goto_3c
    return v19
.end method

.method public static j(Ljava/lang/reflect/Field;Ljava/lang/Object;J)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 6
    .line 7
    if-eq v0, v1, :cond_5

    .line 8
    .line 9
    const-class v1, Ljava/lang/Long;

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    goto :goto_2

    .line 14
    :cond_0
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 15
    .line 16
    if-eq v0, v1, :cond_4

    .line 17
    .line 18
    const-class v1, Ljava/lang/Integer;

    .line 19
    .line 20
    if-ne v0, v1, :cond_1

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    sget-object v1, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 24
    .line 25
    if-eq v0, v1, :cond_3

    .line 26
    .line 27
    const-class v1, Ljava/lang/Short;

    .line 28
    .line 29
    if-ne v0, v1, :cond_2

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    const/4 p0, 0x0

    .line 33
    return p0

    .line 34
    :cond_3
    :goto_0
    const-wide/16 v0, 0x7fff

    .line 35
    .line 36
    invoke-static {v0, v1, p2, p3}, Ljava/lang/Math;->min(JJ)J

    .line 37
    .line 38
    .line 39
    move-result-wide p2

    .line 40
    long-to-int p2, p2

    .line 41
    int-to-short p2, p2

    .line 42
    invoke-static {p2}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    invoke-virtual {p0, p1, p2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto :goto_3

    .line 50
    :cond_4
    :goto_1
    const-wide/32 v0, 0x7fffffff

    .line 51
    .line 52
    .line 53
    invoke-static {v0, v1, p2, p3}, Ljava/lang/Math;->min(JJ)J

    .line 54
    .line 55
    .line 56
    move-result-wide p2

    .line 57
    long-to-int p2, p2

    .line 58
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    invoke-virtual {p0, p1, p2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_5
    :goto_2
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    invoke-virtual {p0, p1, p2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    :goto_3
    const/4 p0, 0x1

    .line 74
    return p0
.end method
