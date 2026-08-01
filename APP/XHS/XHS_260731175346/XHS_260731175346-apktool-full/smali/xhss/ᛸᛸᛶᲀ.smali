.class public abstract Lxhss/ᛸᛸᛶᲀ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# static fields
.field public static final ᛱᛱᛲᲇ:Lxhss/ᛲᛶᛴᲀ;

.field public static final ᛷᛵᛵᲈ:Lxhss/ᲇᲀᲈᛲ;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lxhss/ᲇᲀᲈᛲ;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, v1}, Lxhss/ᲇᲀᲈᛲ;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lxhss/ᛸᛸᛶᲀ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲀᲈᛲ;

    .line 8
    .line 9
    new-instance v0, Lxhss/ᛲᛶᛴᲀ;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-direct {v0, v1}, Lxhss/ᛲᛶᛴᲀ;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lxhss/ᛸᛸᛶᲀ;->ᛱᛱᛲᲇ:Lxhss/ᛲᛶᛴᲀ;

    .line 16
    .line 17
    return-void
.end method

.method public static ᛱᛱᛲᲇ(Landroid/content/pm/PackageManager;Lxhss/ᛷᛱᛲᲇ;Landroid/content/res/Resources;)Landroid/content/pm/ProviderInfo;
    .locals 9

    .line 1
    sget-object v0, Lxhss/ᛸᛸᛶᲀ;->ᛱᛱᛲᲇ:Lxhss/ᛲᛶᛴᲀ;

    .line 2
    .line 3
    sget-object v1, Lxhss/ᛸᛸᛶᲀ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲀᲈᛲ;

    .line 4
    .line 5
    const-string v2, "Found content provider "

    .line 6
    .line 7
    const-string v3, "No package found for authority: "

    .line 8
    .line 9
    const-string v4, "FontProvider.getProvider"

    .line 10
    .line 11
    invoke-static {v4}, Lxhss/ᛱᛷᛵᛷ;->ᛳᲁᲇᛸ(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :try_start_0
    iget-object v4, p1, Lxhss/ᛷᛱᛲᲇ;->ᲇᛴᲇᛵ:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    iget-object v5, p1, Lxhss/ᛷᛱᛲᲇ;->ᛷᛵᛵᲈ:Ljava/lang/String;

    .line 17
    .line 18
    iget-object p1, p1, Lxhss/ᛷᛱᛲᲇ;->ᛱᛱᛲᲇ:Ljava/lang/String;

    .line 19
    .line 20
    const/4 v6, 0x0

    .line 21
    if-eqz v4, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    :try_start_1
    invoke-static {p2, v6}, Lxhss/ᲀᲈᛵᛸ;->ᛴᲈᛱᛴ(Landroid/content/res/Resources;I)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    :goto_0
    new-instance p2, Lxhss/ᛴᛲᛷᛸ;

    .line 29
    .line 30
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v5, p2, Lxhss/ᛴᛲᛷᛸ;->ᛷᛵᛵᲈ:Ljava/lang/String;

    .line 34
    .line 35
    iput-object p1, p2, Lxhss/ᛴᛲᛷᛸ;->ᛱᛱᛲᲇ:Ljava/lang/String;

    .line 36
    .line 37
    iput-object v4, p2, Lxhss/ᛴᛲᛷᛸ;->ᛳᲁᲇᛸ:Ljava/util/List;

    .line 38
    .line 39
    invoke-virtual {v1, p2}, Lxhss/ᲇᲀᲈᛲ;->ᛷᛵᛵᲈ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v7

    .line 43
    check-cast v7, Landroid/content/pm/ProviderInfo;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 44
    .line 45
    if-eqz v7, :cond_1

    .line 46
    .line 47
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 48
    .line 49
    .line 50
    return-object v7

    .line 51
    :cond_1
    :try_start_2
    invoke-virtual {p0, v5, v6}, Landroid/content/pm/PackageManager;->resolveContentProvider(Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;

    .line 52
    .line 53
    .line 54
    move-result-object v7

    .line 55
    if-eqz v7, :cond_8

    .line 56
    .line 57
    iget-object v3, v7, Landroid/content/pm/ProviderInfo;->packageName:Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-eqz v3, :cond_7

    .line 64
    .line 65
    iget-object p1, v7, Landroid/content/pm/ProviderInfo;->packageName:Ljava/lang/String;

    .line 66
    .line 67
    const/16 v2, 0x40

    .line 68
    .line 69
    invoke-virtual {p0, p1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    iget-object p0, p0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 74
    .line 75
    new-instance p1, Ljava/util/ArrayList;

    .line 76
    .line 77
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 78
    .line 79
    .line 80
    array-length v2, p0

    .line 81
    move v3, v6

    .line 82
    :goto_1
    if-ge v3, v2, :cond_2

    .line 83
    .line 84
    aget-object v5, p0, v3

    .line 85
    .line 86
    invoke-virtual {v5}, Landroid/content/pm/Signature;->toByteArray()[B

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    add-int/lit8 v3, v3, 0x1

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_2
    invoke-static {p1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 97
    .line 98
    .line 99
    move p0, v6

    .line 100
    :goto_2
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    if-ge p0, v2, :cond_6

    .line 105
    .line 106
    new-instance v2, Ljava/util/ArrayList;

    .line 107
    .line 108
    invoke-interface {v4, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    check-cast v3, Ljava/util/Collection;

    .line 113
    .line 114
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 115
    .line 116
    .line 117
    invoke-static {v2, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 121
    .line 122
    .line 123
    move-result v3

    .line 124
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 125
    .line 126
    .line 127
    move-result v5

    .line 128
    if-eq v3, v5, :cond_3

    .line 129
    .line 130
    goto :goto_4

    .line 131
    :cond_3
    move v3, v6

    .line 132
    :goto_3
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 133
    .line 134
    .line 135
    move-result v5

    .line 136
    if-ge v3, v5, :cond_5

    .line 137
    .line 138
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v5

    .line 142
    check-cast v5, [B

    .line 143
    .line 144
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v8

    .line 148
    check-cast v8, [B

    .line 149
    .line 150
    invoke-static {v5, v8}, Ljava/util/Arrays;->equals([B[B)Z

    .line 151
    .line 152
    .line 153
    move-result v5

    .line 154
    if-nez v5, :cond_4

    .line 155
    .line 156
    :goto_4
    add-int/lit8 p0, p0, 0x1

    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_4
    add-int/lit8 v3, v3, 0x1

    .line 160
    .line 161
    goto :goto_3

    .line 162
    :cond_5
    invoke-virtual {v1, p2, v7}, Lxhss/ᲇᲀᲈᛲ;->ᛱᛱᛲᲇ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 163
    .line 164
    .line 165
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 166
    .line 167
    .line 168
    return-object v7

    .line 169
    :cond_6
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 170
    .line 171
    .line 172
    const/4 p0, 0x0

    .line 173
    return-object p0

    .line 174
    :cond_7
    :try_start_3
    new-instance p0, Landroid/content/pm/PackageManager$NameNotFoundException;

    .line 175
    .line 176
    new-instance p2, Ljava/lang/StringBuilder;

    .line 177
    .line 178
    invoke-direct {p2, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    const-string v0, ", but package was not "

    .line 185
    .line 186
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    invoke-direct {p0, p1}, Landroid/content/pm/PackageManager$NameNotFoundException;-><init>(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    throw p0

    .line 200
    :cond_8
    new-instance p0, Landroid/content/pm/PackageManager$NameNotFoundException;

    .line 201
    .line 202
    new-instance p1, Ljava/lang/StringBuilder;

    .line 203
    .line 204
    invoke-direct {p1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    invoke-direct {p0, p1}, Landroid/content/pm/PackageManager$NameNotFoundException;-><init>(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 218
    :catchall_0
    move-exception p0

    .line 219
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 220
    .line 221
    .line 222
    throw p0
.end method

.method public static ᛳᲁᲇᛸ(Landroid/content/Context;Lxhss/ᛷᛱᛲᲇ;Ljava/lang/String;)[Lxhss/ᛵᛶᲈᛳ;
    .locals 20

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    const-string v2, "content"

    .line 6
    .line 7
    const-string v3, "FontProvider.query"

    .line 8
    .line 9
    invoke-static {v3}, Lxhss/ᛱᛷᛵᛷ;->ᛳᲁᲇᛸ(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :try_start_0
    new-instance v3, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    new-instance v4, Landroid/net/Uri$Builder;

    .line 18
    .line 19
    invoke-direct {v4}, Landroid/net/Uri$Builder;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v4, v2}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    invoke-virtual {v4, v0}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    invoke-virtual {v4}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    new-instance v4, Landroid/net/Uri$Builder;

    .line 35
    .line 36
    invoke-direct {v4}, Landroid/net/Uri$Builder;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v4, v2}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-virtual {v2, v0}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const-string v2, "file"

    .line 48
    .line 49
    invoke-virtual {v0, v2}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {v0, v6}, Landroid/content/ContentResolver;->acquireUnstableContentProviderClient(Landroid/net/Uri;)Landroid/content/ContentProviderClient;

    .line 62
    .line 63
    .line 64
    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 65
    const/4 v4, 0x0

    .line 66
    :try_start_1
    const-string v7, "_id"

    .line 67
    .line 68
    const-string v8, "file_id"

    .line 69
    .line 70
    const-string v9, "font_ttc_index"

    .line 71
    .line 72
    const-string v10, "font_variation_settings"

    .line 73
    .line 74
    const-string v11, "font_weight"

    .line 75
    .line 76
    const-string v12, "font_italic"

    .line 77
    .line 78
    const-string v13, "result_code"

    .line 79
    .line 80
    filled-new-array/range {v7 .. v13}, [Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v7

    .line 84
    const-string v0, "ContentQueryWrapper.query"

    .line 85
    .line 86
    invoke-static {v0}, Lxhss/ᛱᛷᛵᛷ;->ᛳᲁᲇᛸ(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 87
    .line 88
    .line 89
    :try_start_2
    const-string v8, "query = ?"

    .line 90
    .line 91
    iget-object v0, v1, Lxhss/ᛷᛱᛲᲇ;->ᲇᛶᛴᲀ:Ljava/lang/String;

    .line 92
    .line 93
    iget-object v9, v1, Lxhss/ᛷᛱᛲᲇ;->ᛳᲁᲇᛸ:Ljava/lang/String;

    .line 94
    .line 95
    if-eqz v0, :cond_1

    .line 96
    .line 97
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 98
    .line 99
    .line 100
    move-result v10

    .line 101
    const/4 v11, 0x0

    .line 102
    :goto_0
    if-ge v11, v10, :cond_1

    .line 103
    .line 104
    invoke-virtual {v0, v11}, Ljava/lang/String;->codePointAt(I)I

    .line 105
    .line 106
    .line 107
    move-result v13

    .line 108
    invoke-static {v13}, Ljava/lang/Character;->isWhitespace(I)Z

    .line 109
    .line 110
    .line 111
    move-result v14

    .line 112
    if-nez v14, :cond_0

    .line 113
    .line 114
    const-string v0, "VF"

    .line 115
    .line 116
    filled-new-array {v9, v0}, [Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    :goto_1
    move-object v9, v0

    .line 121
    goto :goto_2

    .line 122
    :cond_0
    invoke-static {v13}, Ljava/lang/Character;->charCount(I)I

    .line 123
    .line 124
    .line 125
    move-result v13

    .line 126
    add-int/2addr v11, v13

    .line 127
    goto :goto_0

    .line 128
    :cond_1
    filled-new-array {v9}, [Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 132
    goto :goto_1

    .line 133
    :goto_2
    if-nez v5, :cond_2

    .line 134
    .line 135
    goto :goto_3

    .line 136
    :cond_2
    const/4 v11, 0x0

    .line 137
    const/4 v10, 0x0

    .line 138
    :try_start_3
    invoke-virtual/range {v5 .. v11}, Landroid/content/ContentProviderClient;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/database/Cursor;

    .line 139
    .line 140
    .line 141
    move-result-object v4
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 142
    goto :goto_3

    .line 143
    :catch_0
    move-exception v0

    .line 144
    :try_start_4
    const-string v7, "FontsProvider"

    .line 145
    .line 146
    const-string v8, "Unable to query the content provider"

    .line 147
    .line 148
    invoke-static {v7, v8, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 149
    .line 150
    .line 151
    :goto_3
    :try_start_5
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 152
    .line 153
    .line 154
    if-eqz v4, :cond_8

    .line 155
    .line 156
    invoke-interface {v4}, Landroid/database/Cursor;->getCount()I

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    if-lez v0, :cond_8

    .line 161
    .line 162
    const-string v0, "result_code"

    .line 163
    .line 164
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    new-instance v3, Ljava/util/ArrayList;

    .line 169
    .line 170
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 171
    .line 172
    .line 173
    const-string v7, "_id"

    .line 174
    .line 175
    invoke-interface {v4, v7}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 176
    .line 177
    .line 178
    move-result v7

    .line 179
    const-string v8, "file_id"

    .line 180
    .line 181
    invoke-interface {v4, v8}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 182
    .line 183
    .line 184
    move-result v8

    .line 185
    const-string v9, "font_ttc_index"

    .line 186
    .line 187
    invoke-interface {v4, v9}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 188
    .line 189
    .line 190
    move-result v9

    .line 191
    const-string v10, "font_weight"

    .line 192
    .line 193
    invoke-interface {v4, v10}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 194
    .line 195
    .line 196
    move-result v10

    .line 197
    const-string v11, "font_italic"

    .line 198
    .line 199
    invoke-interface {v4, v11}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 200
    .line 201
    .line 202
    move-result v11

    .line 203
    :goto_4
    invoke-interface {v4}, Landroid/database/Cursor;->moveToNext()Z

    .line 204
    .line 205
    .line 206
    move-result v13

    .line 207
    if-eqz v13, :cond_8

    .line 208
    .line 209
    const/4 v13, -0x1

    .line 210
    if-eq v0, v13, :cond_3

    .line 211
    .line 212
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 213
    .line 214
    .line 215
    move-result v14

    .line 216
    move/from16 v19, v14

    .line 217
    .line 218
    goto :goto_5

    .line 219
    :catchall_0
    move-exception v0

    .line 220
    goto/16 :goto_c

    .line 221
    .line 222
    :cond_3
    const/16 v19, 0x0

    .line 223
    .line 224
    :goto_5
    if-eq v9, v13, :cond_4

    .line 225
    .line 226
    invoke-interface {v4, v9}, Landroid/database/Cursor;->getInt(I)I

    .line 227
    .line 228
    .line 229
    move-result v14

    .line 230
    move v15, v14

    .line 231
    goto :goto_6

    .line 232
    :cond_4
    const/4 v15, 0x0

    .line 233
    :goto_6
    if-ne v8, v13, :cond_5

    .line 234
    .line 235
    invoke-interface {v4, v7}, Landroid/database/Cursor;->getLong(I)J

    .line 236
    .line 237
    .line 238
    move-result-wide v12

    .line 239
    invoke-static {v6, v12, v13}, Landroid/content/ContentUris;->withAppendedId(Landroid/net/Uri;J)Landroid/net/Uri;

    .line 240
    .line 241
    .line 242
    move-result-object v12

    .line 243
    :goto_7
    move-object v14, v12

    .line 244
    const/4 v12, -0x1

    .line 245
    goto :goto_8

    .line 246
    :cond_5
    invoke-interface {v4, v8}, Landroid/database/Cursor;->getLong(I)J

    .line 247
    .line 248
    .line 249
    move-result-wide v12

    .line 250
    invoke-static {v2, v12, v13}, Landroid/content/ContentUris;->withAppendedId(Landroid/net/Uri;J)Landroid/net/Uri;

    .line 251
    .line 252
    .line 253
    move-result-object v12

    .line 254
    goto :goto_7

    .line 255
    :goto_8
    if-eq v10, v12, :cond_6

    .line 256
    .line 257
    invoke-interface {v4, v10}, Landroid/database/Cursor;->getInt(I)I

    .line 258
    .line 259
    .line 260
    move-result v13

    .line 261
    :goto_9
    move/from16 v16, v13

    .line 262
    .line 263
    goto :goto_a

    .line 264
    :cond_6
    const/16 v13, 0x190

    .line 265
    .line 266
    goto :goto_9

    .line 267
    :goto_a
    if-eq v11, v12, :cond_7

    .line 268
    .line 269
    invoke-interface {v4, v11}, Landroid/database/Cursor;->getInt(I)I

    .line 270
    .line 271
    .line 272
    move-result v12

    .line 273
    const/4 v13, 0x1

    .line 274
    if-ne v12, v13, :cond_7

    .line 275
    .line 276
    move/from16 v17, v13

    .line 277
    .line 278
    goto :goto_b

    .line 279
    :cond_7
    const/16 v17, 0x0

    .line 280
    .line 281
    :goto_b
    iget-object v12, v1, Lxhss/ᛷᛱᛲᲇ;->ᲇᛶᛴᲀ:Ljava/lang/String;

    .line 282
    .line 283
    new-instance v13, Lxhss/ᛵᛶᲈᛳ;

    .line 284
    .line 285
    move-object/from16 v18, v12

    .line 286
    .line 287
    invoke-direct/range {v13 .. v19}, Lxhss/ᛵᛶᲈᛳ;-><init>(Landroid/net/Uri;IIZLjava/lang/String;I)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v3, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 291
    .line 292
    .line 293
    goto :goto_4

    .line 294
    :cond_8
    if-eqz v4, :cond_9

    .line 295
    .line 296
    :try_start_6
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 297
    .line 298
    .line 299
    :cond_9
    if-eqz v5, :cond_a

    .line 300
    .line 301
    invoke-virtual {v5}, Landroid/content/ContentProviderClient;->close()V

    .line 302
    .line 303
    .line 304
    :cond_a
    const/4 v1, 0x0

    .line 305
    new-array v0, v1, [Lxhss/ᛵᛶᲈᛳ;

    .line 306
    .line 307
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    check-cast v0, [Lxhss/ᛵᛶᲈᛳ;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 312
    .line 313
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 314
    .line 315
    .line 316
    return-object v0

    .line 317
    :catchall_1
    move-exception v0

    .line 318
    :try_start_7
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 319
    .line 320
    .line 321
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 322
    :goto_c
    if-eqz v4, :cond_b

    .line 323
    .line 324
    :try_start_8
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 325
    .line 326
    .line 327
    :cond_b
    if-eqz v5, :cond_c

    .line 328
    .line 329
    invoke-virtual {v5}, Landroid/content/ContentProviderClient;->close()V

    .line 330
    .line 331
    .line 332
    :cond_c
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 333
    :catchall_2
    move-exception v0

    .line 334
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 335
    .line 336
    .line 337
    throw v0
.end method

.method public static ᛷᛵᛵᲈ(Landroid/content/Context;Ljava/util/List;)Lxhss/ᛱᲇᛴᲇ;
    .locals 6

    .line 1
    const-string v0, "FontProvider.getFontFamilyResult"

    .line 2
    .line 3
    invoke-static {v0}, Lxhss/ᛱᛷᛵᛷ;->ᛳᲁᲇᛸ(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const/4 v3, 0x2

    .line 17
    if-ge v1, v2, :cond_2

    .line 18
    .line 19
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Lxhss/ᛷᛱᛲᲇ;

    .line 24
    .line 25
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 26
    .line 27
    const/16 v5, 0x1f

    .line 28
    .line 29
    if-lt v4, v5, :cond_0

    .line 30
    .line 31
    iget-object v4, v2, Lxhss/ᛷᛱᛲᲇ;->ᛷᛴᛷᛱ:Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {v4}, Lxhss/ᛱᲁᛶᲇ;->ᛷᛴᛷᛱ(Ljava/lang/String;)Landroid/graphics/Typeface;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    if-eqz v5, :cond_0

    .line 38
    .line 39
    invoke-static {v5}, Lxhss/ᛱᲁᛶᲇ;->ᲇᛶᛴᲀ(Landroid/graphics/Typeface;)Landroid/graphics/fonts/Font;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    if-eqz v5, :cond_0

    .line 44
    .line 45
    new-instance v3, Lxhss/ᛵᛶᲈᛳ;

    .line 46
    .line 47
    iget-object v2, v2, Lxhss/ᛷᛱᛲᲇ;->ᲇᛶᛴᲀ:Ljava/lang/String;

    .line 48
    .line 49
    invoke-direct {v3, v4, v2}, Lxhss/ᛵᛶᲈᛳ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    filled-new-array {v3}, [Lxhss/ᛵᛶᲈᛳ;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    invoke-static {v4, v2, v5}, Lxhss/ᛸᛸᛶᲀ;->ᛱᛱᛲᲇ(Landroid/content/pm/PackageManager;Lxhss/ᛷᛱᛲᲇ;Landroid/content/res/Resources;)Landroid/content/pm/ProviderInfo;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    if-nez v4, :cond_1

    .line 73
    .line 74
    new-instance p0, Lxhss/ᛱᲇᛴᲇ;

    .line 75
    .line 76
    invoke-direct {p0, v3}, Lxhss/ᛱᲇᛴᲇ;-><init>(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 77
    .line 78
    .line 79
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 80
    .line 81
    .line 82
    return-object p0

    .line 83
    :cond_1
    :try_start_1
    iget-object v3, v4, Landroid/content/pm/ProviderInfo;->authority:Ljava/lang/String;

    .line 84
    .line 85
    invoke-static {p0, v2, v3}, Lxhss/ᛸᛸᛶᲀ;->ᛳᲁᲇᛸ(Landroid/content/Context;Lxhss/ᛷᛱᛲᲇ;Ljava/lang/String;)[Lxhss/ᛵᛶᲈᛳ;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_2
    new-instance p0, Lxhss/ᛱᲇᛴᲇ;

    .line 96
    .line 97
    invoke-direct {p0, v3, v0}, Lxhss/ᛱᲇᛴᲇ;-><init>(ILjava/util/ArrayList;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 98
    .line 99
    .line 100
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 101
    .line 102
    .line 103
    return-object p0

    .line 104
    :catchall_0
    move-exception p0

    .line 105
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 106
    .line 107
    .line 108
    throw p0
.end method
