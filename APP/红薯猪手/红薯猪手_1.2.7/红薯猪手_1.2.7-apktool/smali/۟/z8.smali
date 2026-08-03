.class public final L۟/z8;
.super L۟/y8;
.source "SourceFile"


# instance fields
.field public final ۥ:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, L۟/y8;-><init>()V

    iput-object p1, p0, L۟/z8;->ۥ:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final ۥ۟(L۟/w8;)Z
    .locals 1

    iget v0, p1, L۟/w8;->ۥ۟ۡ:I

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    iget-object p1, p1, L۟/w8;->ۥ۟۠:Landroid/net/Uri;

    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object p1

    const-string v0, "android.resource"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final ۥ۟ۡ(L۟/w8;)L۟/y8$a;
    .locals 12

    .line 1
    iget-object v0, p0, L۟/z8;->ۥ:Landroid/content/Context;

    .line 2
    .line 3
    sget-object v1, L۟/ic;->ۥ:Ljava/lang/StringBuilder;

    .line 4
    .line 5
    iget v1, p1, L۟/w8;->ۥ۟ۡ:I

    .line 6
    .line 7
    const-string v2, "No package provided: "

    .line 8
    .line 9
    if-nez v1, :cond_2

    .line 10
    .line 11
    iget-object v1, p1, L۟/w8;->ۥ۟۠:Landroid/net/Uri;

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {v1}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    :try_start_0
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->getResourcesForApplication(Ljava/lang/String;)Landroid/content/res/Resources;

    .line 27
    .line 28
    .line 29
    move-result-object v0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    goto :goto_1

    .line 31
    :catch_0
    new-instance v0, Ljava/io/FileNotFoundException;

    .line 32
    .line 33
    const-string v1, "Unable to obtain resources for package: "

    .line 34
    .line 35
    invoke-static {v1}, L۟/c4;->ۥ۟ۤ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    iget-object p1, p1, L۟/w8;->ۥ۟۠:Landroid/net/Uri;

    .line 40
    .line 41
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-direct {v0, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw v0

    .line 52
    :cond_1
    new-instance v0, Ljava/io/FileNotFoundException;

    .line 53
    .line 54
    invoke-static {v2}, L۟/c4;->ۥ۟ۤ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    iget-object p1, p1, L۟/w8;->ۥ۟۠:Landroid/net/Uri;

    .line 59
    .line 60
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-direct {v0, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    throw v0

    .line 71
    :cond_2
    :goto_0
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    :goto_1
    iget v1, p1, L۟/w8;->ۥ۟ۡ:I

    .line 76
    .line 77
    const/4 v3, 0x1

    .line 78
    const/4 v4, 0x0

    .line 79
    if-nez v1, :cond_8

    .line 80
    .line 81
    iget-object v5, p1, L۟/w8;->ۥ۟۠:Landroid/net/Uri;

    .line 82
    .line 83
    if-nez v5, :cond_3

    .line 84
    .line 85
    goto/16 :goto_2

    .line 86
    .line 87
    :cond_3
    invoke-virtual {v5}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    if-eqz v1, :cond_7

    .line 92
    .line 93
    iget-object v2, p1, L۟/w8;->ۥ۟۠:Landroid/net/Uri;

    .line 94
    .line 95
    invoke-virtual {v2}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    if-eqz v2, :cond_6

    .line 100
    .line 101
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 102
    .line 103
    .line 104
    move-result v5

    .line 105
    if-nez v5, :cond_6

    .line 106
    .line 107
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 108
    .line 109
    .line 110
    move-result v5

    .line 111
    if-ne v5, v3, :cond_4

    .line 112
    .line 113
    :try_start_1
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    check-cast v1, Ljava/lang/String;

    .line 118
    .line 119
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 120
    .line 121
    .line 122
    move-result v1
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    .line 123
    goto :goto_2

    .line 124
    :catch_1
    new-instance v0, Ljava/io/FileNotFoundException;

    .line 125
    .line 126
    const-string v1, "Last path segment is not a resource ID: "

    .line 127
    .line 128
    invoke-static {v1}, L۟/c4;->ۥ۟ۤ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    iget-object p1, p1, L۟/w8;->ۥ۟۠:Landroid/net/Uri;

    .line 133
    .line 134
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    invoke-direct {v0, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    throw v0

    .line 145
    :cond_4
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 146
    .line 147
    .line 148
    move-result v5

    .line 149
    const/4 v6, 0x2

    .line 150
    if-ne v5, v6, :cond_5

    .line 151
    .line 152
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v5

    .line 156
    check-cast v5, Ljava/lang/String;

    .line 157
    .line 158
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    check-cast v2, Ljava/lang/String;

    .line 163
    .line 164
    invoke-virtual {v0, v2, v5, v1}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 165
    .line 166
    .line 167
    move-result v1

    .line 168
    goto :goto_2

    .line 169
    :cond_5
    new-instance v0, Ljava/io/FileNotFoundException;

    .line 170
    .line 171
    const-string v1, "More than two path segments: "

    .line 172
    .line 173
    invoke-static {v1}, L۟/c4;->ۥ۟ۤ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    iget-object p1, p1, L۟/w8;->ۥ۟۠:Landroid/net/Uri;

    .line 178
    .line 179
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    invoke-direct {v0, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    throw v0

    .line 190
    :cond_6
    new-instance v0, Ljava/io/FileNotFoundException;

    .line 191
    .line 192
    const-string v1, "No path segments: "

    .line 193
    .line 194
    invoke-static {v1}, L۟/c4;->ۥ۟ۤ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    iget-object p1, p1, L۟/w8;->ۥ۟۠:Landroid/net/Uri;

    .line 199
    .line 200
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    invoke-direct {v0, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    throw v0

    .line 211
    :cond_7
    new-instance v0, Ljava/io/FileNotFoundException;

    .line 212
    .line 213
    invoke-static {v2}, L۟/c4;->ۥ۟ۤ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 214
    .line 215
    .line 216
    move-result-object v1

    .line 217
    iget-object p1, p1, L۟/w8;->ۥ۟۠:Landroid/net/Uri;

    .line 218
    .line 219
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object p1

    .line 226
    invoke-direct {v0, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    throw v0

    .line 230
    :cond_8
    :goto_2
    new-instance v2, L۟/y8$a;

    .line 231
    .line 232
    invoke-static {p1}, L۟/y8;->ۥ۟۟(L۟/w8;)Landroid/graphics/BitmapFactory$Options;

    .line 233
    .line 234
    .line 235
    move-result-object v11

    .line 236
    if-eqz v11, :cond_9

    .line 237
    .line 238
    iget-boolean v5, v11, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 239
    .line 240
    if-eqz v5, :cond_9

    .line 241
    .line 242
    goto :goto_3

    .line 243
    :cond_9
    move v3, v4

    .line 244
    :goto_3
    if-eqz v3, :cond_a

    .line 245
    .line 246
    invoke-static {v0, v1, v11}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 247
    .line 248
    .line 249
    iget v5, p1, L۟/w8;->ۥۣ۟:I

    .line 250
    .line 251
    iget v6, p1, L۟/w8;->ۥ۟ۤ:I

    .line 252
    .line 253
    iget v7, v11, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 254
    .line 255
    iget v8, v11, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 256
    .line 257
    move-object v9, v11

    .line 258
    move-object v10, p1

    .line 259
    invoke-static/range {v5 .. v10}, L۟/y8;->ۥ(IIIILandroid/graphics/BitmapFactory$Options;L۟/w8;)V

    .line 260
    .line 261
    .line 262
    :cond_a
    invoke-static {v0, v1, v11}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 263
    .line 264
    .line 265
    move-result-object p1

    .line 266
    invoke-direct {v2, p1}, L۟/y8$a;-><init>(Landroid/graphics/Bitmap;)V

    .line 267
    .line 268
    .line 269
    return-object v2
.end method
