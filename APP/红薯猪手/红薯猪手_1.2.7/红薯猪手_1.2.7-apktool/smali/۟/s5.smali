.class public final L۟/s5;
.super L۟/r0;
.source "SourceFile"


# static fields
.field public static final ۥ۟:[Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "orientation"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, L۟/s5;->ۥ۟:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, L۟/r0;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public final ۥ۟(L۟/w8;)Z
    .locals 2

    iget-object p1, p1, L۟/w8;->ۥ۟۠:Landroid/net/Uri;

    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    const-string v1, "content"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object p1

    const-string v0, "media"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final ۥ۟ۡ(L۟/w8;)L۟/y8$a;
    .locals 19

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    sget-object v7, L۟/z7$e;->ۥ۟۟:L۟/z7$e;

    .line 4
    .line 5
    move-object/from16 v8, p0

    .line 6
    .line 7
    iget-object v1, v8, L۟/r0;->ۥ:Landroid/content/Context;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 10
    .line 11
    .line 12
    move-result-object v15

    .line 13
    iget-object v10, v0, L۟/w8;->ۥ۟۠:Landroid/net/Uri;

    .line 14
    .line 15
    const/4 v6, 0x0

    .line 16
    const/4 v1, 0x0

    .line 17
    :try_start_0
    sget-object v11, L۟/s5;->ۥ۟:[Ljava/lang/String;

    .line 18
    .line 19
    const/4 v12, 0x0

    .line 20
    const/4 v13, 0x0

    .line 21
    const/4 v14, 0x0

    .line 22
    move-object v9, v15

    .line 23
    invoke-virtual/range {v9 .. v14}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 24
    .line 25
    .line 26
    move-result-object v2
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    :try_start_1
    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-nez v3, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-interface {v2, v1}, Landroid/database/Cursor;->getInt(I)I

    .line 37
    .line 38
    .line 39
    move-result v3
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 40
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 41
    .line 42
    .line 43
    move v9, v3

    .line 44
    goto :goto_3

    .line 45
    :catchall_0
    move-exception v0

    .line 46
    move-object v6, v2

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    :goto_0
    if-eqz v2, :cond_3

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :catchall_1
    move-exception v0

    .line 52
    :goto_1
    if-eqz v6, :cond_2

    .line 53
    .line 54
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 55
    .line 56
    .line 57
    :cond_2
    throw v0

    .line 58
    :catch_0
    move-object v2, v6

    .line 59
    :catch_1
    if-eqz v2, :cond_3

    .line 60
    .line 61
    :goto_2
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 62
    .line 63
    .line 64
    :cond_3
    move v9, v1

    .line 65
    :goto_3
    iget-object v2, v0, L۟/w8;->ۥ۟۠:Landroid/net/Uri;

    .line 66
    .line 67
    invoke-virtual {v15, v2}, Landroid/content/ContentResolver;->getType(Landroid/net/Uri;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    const/4 v10, 0x1

    .line 72
    if-eqz v2, :cond_4

    .line 73
    .line 74
    const-string v3, "video/"

    .line 75
    .line 76
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    if-eqz v2, :cond_4

    .line 81
    .line 82
    move v11, v10

    .line 83
    goto :goto_4

    .line 84
    :cond_4
    move v11, v1

    .line 85
    :goto_4
    invoke-virtual/range {p1 .. p1}, L۟/w8;->ۥ()Z

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    if-eqz v1, :cond_a

    .line 90
    .line 91
    iget v1, v0, L۟/w8;->ۥۣ۟:I

    .line 92
    .line 93
    iget v2, v0, L۟/w8;->ۥ۟ۤ:I

    .line 94
    .line 95
    const/16 v3, 0x60

    .line 96
    .line 97
    const/4 v12, 0x3

    .line 98
    if-gt v1, v3, :cond_5

    .line 99
    .line 100
    if-gt v2, v3, :cond_5

    .line 101
    .line 102
    move v3, v10

    .line 103
    goto :goto_5

    .line 104
    :cond_5
    const/4 v3, 0x2

    .line 105
    const/16 v4, 0x200

    .line 106
    .line 107
    if-gt v1, v4, :cond_6

    .line 108
    .line 109
    const/16 v1, 0x180

    .line 110
    .line 111
    if-gt v2, v1, :cond_6

    .line 112
    .line 113
    :goto_5
    move v13, v3

    .line 114
    goto :goto_6

    .line 115
    :cond_6
    move v13, v12

    .line 116
    :goto_6
    if-nez v11, :cond_7

    .line 117
    .line 118
    if-ne v13, v12, :cond_7

    .line 119
    .line 120
    new-instance v1, L۟/y8$a;

    .line 121
    .line 122
    invoke-virtual/range {p0 .. p1}, L۟/r0;->ۥۣ۟(L۟/w8;)Ljava/io/InputStream;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-direct {v1, v6, v0, v7, v9}, L۟/y8$a;-><init>(Landroid/graphics/Bitmap;Ljava/io/InputStream;L۟/z7$e;I)V

    .line 127
    .line 128
    .line 129
    return-object v1

    .line 130
    :cond_7
    iget-object v1, v0, L۟/w8;->ۥ۟۠:Landroid/net/Uri;

    .line 131
    .line 132
    invoke-static {v1}, Landroid/content/ContentUris;->parseId(Landroid/net/Uri;)J

    .line 133
    .line 134
    .line 135
    move-result-wide v4

    .line 136
    invoke-static/range {p1 .. p1}, L۟/y8;->ۥ۟۟(L۟/w8;)Landroid/graphics/BitmapFactory$Options;

    .line 137
    .line 138
    .line 139
    move-result-object v14

    .line 140
    iput-boolean v10, v14, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 141
    .line 142
    iget v1, v0, L۟/w8;->ۥۣ۟:I

    .line 143
    .line 144
    iget v2, v0, L۟/w8;->ۥ۟ۤ:I

    .line 145
    .line 146
    invoke-static {v13}, L۟/c4;->ۥ۟ۢ(I)I

    .line 147
    .line 148
    .line 149
    move-result v3

    .line 150
    invoke-static {v13}, L۟/c4;->ۥ۟ۡ(I)I

    .line 151
    .line 152
    .line 153
    move-result v16

    .line 154
    move-wide/from16 v17, v4

    .line 155
    .line 156
    move/from16 v4, v16

    .line 157
    .line 158
    move-object v5, v14

    .line 159
    move-object v10, v6

    .line 160
    move-object/from16 v6, p1

    .line 161
    .line 162
    invoke-static/range {v1 .. v6}, L۟/y8;->ۥ(IIIILandroid/graphics/BitmapFactory$Options;L۟/w8;)V

    .line 163
    .line 164
    .line 165
    if-eqz v11, :cond_9

    .line 166
    .line 167
    if-ne v13, v12, :cond_8

    .line 168
    .line 169
    move-wide/from16 v2, v17

    .line 170
    .line 171
    const/4 v1, 0x1

    .line 172
    goto :goto_7

    .line 173
    :cond_8
    invoke-static {v13}, L۟/c4;->ۥ۟۠(I)I

    .line 174
    .line 175
    .line 176
    move-result v1

    .line 177
    move-wide/from16 v2, v17

    .line 178
    .line 179
    :goto_7
    invoke-static {v15, v2, v3, v1, v14}, Landroid/provider/MediaStore$Video$Thumbnails;->getThumbnail(Landroid/content/ContentResolver;JILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    goto :goto_8

    .line 184
    :cond_9
    move-wide/from16 v2, v17

    .line 185
    .line 186
    invoke-static {v13}, L۟/c4;->ۥ۟۠(I)I

    .line 187
    .line 188
    .line 189
    move-result v1

    .line 190
    invoke-static {v15, v2, v3, v1, v14}, Landroid/provider/MediaStore$Images$Thumbnails;->getThumbnail(Landroid/content/ContentResolver;JILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    :goto_8
    if-eqz v1, :cond_b

    .line 195
    .line 196
    new-instance v0, L۟/y8$a;

    .line 197
    .line 198
    invoke-direct {v0, v1, v10, v7, v9}, L۟/y8$a;-><init>(Landroid/graphics/Bitmap;Ljava/io/InputStream;L۟/z7$e;I)V

    .line 199
    .line 200
    .line 201
    return-object v0

    .line 202
    :cond_a
    move-object v10, v6

    .line 203
    :cond_b
    new-instance v1, L۟/y8$a;

    .line 204
    .line 205
    invoke-virtual/range {p0 .. p1}, L۟/r0;->ۥۣ۟(L۟/w8;)Ljava/io/InputStream;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    invoke-direct {v1, v10, v0, v7, v9}, L۟/y8$a;-><init>(Landroid/graphics/Bitmap;Ljava/io/InputStream;L۟/z7$e;I)V

    .line 210
    .line 211
    .line 212
    return-object v1
.end method
