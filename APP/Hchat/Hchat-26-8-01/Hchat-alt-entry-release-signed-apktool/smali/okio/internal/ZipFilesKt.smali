.class public final Lokio/internal/ZipFilesKt;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field private static final BIT_FLAG_ENCRYPTED:I = 0x1

.field private static final BIT_FLAG_UNSUPPORTED_MASK:I = 0x1

.field private static final CENTRAL_FILE_HEADER_SIGNATURE:I = 0x2014b50

.field public static final COMPRESSION_METHOD_DEFLATED:I = 0x8

.field public static final COMPRESSION_METHOD_STORED:I = 0x0

.field private static final END_OF_CENTRAL_DIRECTORY_SIGNATURE:I = 0x6054b50

.field private static final HEADER_ID_EXTENDED_TIMESTAMP:I = 0x5455

.field private static final HEADER_ID_ZIP64_EXTENDED_INFO:I = 0x1

.field private static final LOCAL_FILE_HEADER_SIGNATURE:I = 0x4034b50

.field private static final MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE:J = 0xffffffffL

.field private static final ZIP64_EOCD_RECORD_SIGNATURE:I = 0x6064b50

.field private static final ZIP64_LOCATOR_SIGNATURE:I = 0x7064b50


# direct methods
.method private static final buildIndex(Ljava/util/List;)Ljava/util/Map;
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lokio/internal/ZipEntry;",
            ">;)",
            "Ljava/util/Map<",
            "Lokio/Path;",
            "Lokio/internal/ZipEntry;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lokio/Path;->Companion:Lokio/Path$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "/"

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x1

    .line 8
    invoke-static {v0, v2, v3, v4, v1}, Lokio/Path$Companion;->get$default(Lokio/Path$Companion;Ljava/lang/String;ZILjava/lang/Object;)Lokio/Path;

    .line 9
    .line 10
    .line 11
    move-result-object v6

    .line 12
    new-instance v5, Lokio/internal/ZipEntry;

    .line 13
    .line 14
    const/16 v19, 0x1fc

    .line 15
    .line 16
    const/16 v20, 0x0

    .line 17
    .line 18
    const/4 v7, 0x1

    .line 19
    const/4 v8, 0x0

    .line 20
    const-wide/16 v9, 0x0

    .line 21
    .line 22
    const-wide/16 v11, 0x0

    .line 23
    .line 24
    const-wide/16 v13, 0x0

    .line 25
    .line 26
    const/4 v15, 0x0

    .line 27
    const/16 v16, 0x0

    .line 28
    .line 29
    const-wide/16 v17, 0x0

    .line 30
    .line 31
    invoke-direct/range {v5 .. v20}, Lokio/internal/ZipEntry;-><init>(Lokio/Path;ZLjava/lang/String;JJJILjava/lang/Long;JILgg/g;)V

    .line 32
    .line 33
    .line 34
    new-instance v0, Lsf/e;

    .line 35
    .line 36
    invoke-direct {v0, v6, v5}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    filled-new-array {v0}, [Lsf/e;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 44
    .line 45
    invoke-static {v4}, Ltf/y;->a0(I)I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    invoke-direct {v1, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 50
    .line 51
    .line 52
    invoke-static {v1, v0}, Ltf/y;->d0(Ljava/util/HashMap;[Lsf/e;)V

    .line 53
    .line 54
    .line 55
    new-instance v0, Lokio/internal/ZipFilesKt$buildIndex$$inlined$sortedBy$1;

    .line 56
    .line 57
    invoke-direct {v0}, Lokio/internal/ZipFilesKt$buildIndex$$inlined$sortedBy$1;-><init>()V

    .line 58
    .line 59
    .line 60
    move-object/from16 v2, p0

    .line 61
    .line 62
    invoke-static {v2, v0}, Ltf/m;->K1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-eqz v2, :cond_3

    .line 75
    .line 76
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    check-cast v2, Lokio/internal/ZipEntry;

    .line 81
    .line 82
    invoke-virtual {v2}, Lokio/internal/ZipEntry;->getCanonicalPath()Lokio/Path;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    check-cast v3, Lokio/internal/ZipEntry;

    .line 91
    .line 92
    if-nez v3, :cond_0

    .line 93
    .line 94
    :goto_1
    invoke-virtual {v2}, Lokio/internal/ZipEntry;->getCanonicalPath()Lokio/Path;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    invoke-virtual {v3}, Lokio/Path;->parent()Lokio/Path;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    if-nez v5, :cond_1

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_1
    invoke-virtual {v1, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    check-cast v3, Lokio/internal/ZipEntry;

    .line 110
    .line 111
    if-eqz v3, :cond_2

    .line 112
    .line 113
    invoke-virtual {v3}, Lokio/internal/ZipEntry;->getChildren()Ljava/util/List;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    invoke-virtual {v2}, Lokio/internal/ZipEntry;->getCanonicalPath()Lokio/Path;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    invoke-interface {v3, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_2
    new-instance v4, Lokio/internal/ZipEntry;

    .line 126
    .line 127
    const/16 v18, 0x1fc

    .line 128
    .line 129
    const/16 v19, 0x0

    .line 130
    .line 131
    const/4 v6, 0x1

    .line 132
    const/4 v7, 0x0

    .line 133
    const-wide/16 v8, 0x0

    .line 134
    .line 135
    const-wide/16 v10, 0x0

    .line 136
    .line 137
    const-wide/16 v12, 0x0

    .line 138
    .line 139
    const/4 v14, 0x0

    .line 140
    const/4 v15, 0x0

    .line 141
    const-wide/16 v16, 0x0

    .line 142
    .line 143
    invoke-direct/range {v4 .. v19}, Lokio/internal/ZipEntry;-><init>(Lokio/Path;ZLjava/lang/String;JJJILjava/lang/Long;JILgg/g;)V

    .line 144
    .line 145
    .line 146
    invoke-interface {v1, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v4}, Lokio/internal/ZipEntry;->getChildren()Ljava/util/List;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    invoke-virtual {v2}, Lokio/internal/ZipEntry;->getCanonicalPath()Lokio/Path;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    invoke-interface {v3, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-object v2, v4

    .line 161
    goto :goto_1

    .line 162
    :cond_3
    return-object v1
.end method

.method private static final dosDateTimeToEpochMillis(II)Ljava/lang/Long;
    .locals 7

    .line 1
    const/4 v0, -0x1

    .line 2
    if-ne p1, v0, :cond_0

    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v0, Ljava/util/GregorianCalendar;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/GregorianCalendar;-><init>()V

    .line 9
    .line 10
    .line 11
    const/16 v1, 0xe

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->set(II)V

    .line 15
    .line 16
    .line 17
    shr-int/lit8 v1, p0, 0x9

    .line 18
    .line 19
    and-int/lit8 v1, v1, 0x7f

    .line 20
    .line 21
    add-int/lit16 v1, v1, 0x7bc

    .line 22
    .line 23
    shr-int/lit8 v2, p0, 0x5

    .line 24
    .line 25
    and-int/lit8 v2, v2, 0xf

    .line 26
    .line 27
    and-int/lit8 v3, p0, 0x1f

    .line 28
    .line 29
    shr-int/lit8 p0, p1, 0xb

    .line 30
    .line 31
    and-int/lit8 v4, p0, 0x1f

    .line 32
    .line 33
    shr-int/lit8 p0, p1, 0x5

    .line 34
    .line 35
    and-int/lit8 v5, p0, 0x3f

    .line 36
    .line 37
    and-int/lit8 p0, p1, 0x1f

    .line 38
    .line 39
    shl-int/lit8 v6, p0, 0x1

    .line 40
    .line 41
    add-int/lit8 v2, v2, -0x1

    .line 42
    .line 43
    invoke-virtual/range {v0 .. v6}, Ljava/util/Calendar;->set(IIIIII)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-virtual {p0}, Ljava/util/Date;->getTime()J

    .line 51
    .line 52
    .line 53
    move-result-wide p0

    .line 54
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0
.end method

.method private static final getHex(I)Ljava/lang/String;
    .locals 1

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    invoke-static {v0}, La/a;->w(I)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const-string v0, "0x"

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public static final openZip(Lokio/Path;Lokio/FileSystem;Lfg/l;)Lokio/ZipFileSystem;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lokio/Path;",
            "Lokio/FileSystem;",
            "Lfg/l;",
            ")",
            "Lokio/ZipFileSystem;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string v2, "not a zip: size="

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1, v0}, Lokio/FileSystem;->openReadOnly(Lokio/Path;)Lokio/FileHandle;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    :try_start_0
    invoke-virtual {v3}, Lokio/FileHandle;->size()J

    .line 21
    .line 22
    .line 23
    move-result-wide v4

    .line 24
    const/16 v6, 0x16

    .line 25
    .line 26
    int-to-long v6, v6

    .line 27
    sub-long/2addr v4, v6

    .line 28
    const-wide/16 v6, 0x0

    .line 29
    .line 30
    cmp-long v8, v4, v6

    .line 31
    .line 32
    if-ltz v8, :cond_9

    .line 33
    .line 34
    const-wide/32 v8, 0x10000

    .line 35
    .line 36
    .line 37
    sub-long v8, v4, v8

    .line 38
    .line 39
    invoke-static {v8, v9, v6, v7}, Ljava/lang/Math;->max(JJ)J

    .line 40
    .line 41
    .line 42
    move-result-wide v8

    .line 43
    :goto_0
    invoke-virtual {v3, v4, v5}, Lokio/FileHandle;->source(J)Lokio/Source;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-static {v2}, Lokio/Okio;->buffer(Lokio/Source;)Lokio/BufferedSource;

    .line 48
    .line 49
    .line 50
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 51
    :try_start_1
    invoke-interface {v2}, Lokio/BufferedSource;->readIntLe()I

    .line 52
    .line 53
    .line 54
    move-result v10

    .line 55
    const v11, 0x6054b50

    .line 56
    .line 57
    .line 58
    if-ne v10, v11, :cond_7

    .line 59
    .line 60
    invoke-static {v2}, Lokio/internal/ZipFilesKt;->readEocdRecord(Lokio/BufferedSource;)Lokio/internal/EocdRecord;

    .line 61
    .line 62
    .line 63
    move-result-object v8

    .line 64
    invoke-virtual {v8}, Lokio/internal/EocdRecord;->getCommentByteCount()I

    .line 65
    .line 66
    .line 67
    move-result v9

    .line 68
    int-to-long v9, v9

    .line 69
    invoke-interface {v2, v9, v10}, Lokio/BufferedSource;->readUtf8(J)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v9
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_7

    .line 73
    :try_start_2
    invoke-interface {v2}, Lokio/Source;->close()V

    .line 74
    .line 75
    .line 76
    const/16 v2, 0x14

    .line 77
    .line 78
    int-to-long v10, v2

    .line 79
    sub-long/2addr v4, v10

    .line 80
    cmp-long v2, v4, v6

    .line 81
    .line 82
    const/4 v10, 0x0

    .line 83
    if-lez v2, :cond_3

    .line 84
    .line 85
    invoke-virtual {v3, v4, v5}, Lokio/FileHandle;->source(J)Lokio/Source;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    invoke-static {v2}, Lokio/Okio;->buffer(Lokio/Source;)Lokio/BufferedSource;

    .line 90
    .line 91
    .line 92
    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 93
    :try_start_3
    invoke-interface {v2}, Lokio/BufferedSource;->readIntLe()I

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    const v5, 0x7064b50

    .line 98
    .line 99
    .line 100
    if-ne v4, v5, :cond_2

    .line 101
    .line 102
    invoke-interface {v2}, Lokio/BufferedSource;->readIntLe()I

    .line 103
    .line 104
    .line 105
    move-result v4

    .line 106
    invoke-interface {v2}, Lokio/BufferedSource;->readLongLe()J

    .line 107
    .line 108
    .line 109
    move-result-wide v11

    .line 110
    invoke-interface {v2}, Lokio/BufferedSource;->readIntLe()I

    .line 111
    .line 112
    .line 113
    move-result v5

    .line 114
    const/4 v13, 0x1

    .line 115
    if-ne v5, v13, :cond_1

    .line 116
    .line 117
    if-nez v4, :cond_1

    .line 118
    .line 119
    invoke-virtual {v3, v11, v12}, Lokio/FileHandle;->source(J)Lokio/Source;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    invoke-static {v4}, Lokio/Okio;->buffer(Lokio/Source;)Lokio/BufferedSource;

    .line 124
    .line 125
    .line 126
    move-result-object v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 127
    :try_start_4
    invoke-interface {v4}, Lokio/BufferedSource;->readIntLe()I

    .line 128
    .line 129
    .line 130
    move-result v5

    .line 131
    const v11, 0x6064b50

    .line 132
    .line 133
    .line 134
    if-ne v5, v11, :cond_0

    .line 135
    .line 136
    invoke-static {v4, v8}, Lokio/internal/ZipFilesKt;->readZip64EocdRecord(Lokio/BufferedSource;Lokio/internal/EocdRecord;)Lokio/internal/EocdRecord;

    .line 137
    .line 138
    .line 139
    move-result-object v8
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 140
    :try_start_5
    invoke-static {v4, v10}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 141
    .line 142
    .line 143
    goto :goto_2

    .line 144
    :catchall_0
    move-exception v0

    .line 145
    move-object v1, v0

    .line 146
    goto :goto_3

    .line 147
    :catchall_1
    move-exception v0

    .line 148
    move-object v1, v0

    .line 149
    goto :goto_1

    .line 150
    :cond_0
    :try_start_6
    new-instance v0, Ljava/io/IOException;

    .line 151
    .line 152
    new-instance v1, Ljava/lang/StringBuilder;

    .line 153
    .line 154
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 155
    .line 156
    .line 157
    const-string v6, "bad zip: expected "

    .line 158
    .line 159
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-static {v11}, Lokio/internal/ZipFilesKt;->getHex(I)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v6

    .line 166
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    const-string v6, " but was "

    .line 170
    .line 171
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-static {v5}, Lokio/internal/ZipFilesKt;->getHex(I)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v5

    .line 178
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 189
    :goto_1
    :try_start_7
    throw v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 190
    :catchall_2
    move-exception v0

    .line 191
    :try_start_8
    invoke-static {v4, v1}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 192
    .line 193
    .line 194
    throw v0

    .line 195
    :cond_1
    new-instance v0, Ljava/io/IOException;

    .line 196
    .line 197
    const-string v1, "unsupported zip: spanned"

    .line 198
    .line 199
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 203
    :cond_2
    :goto_2
    :try_start_9
    invoke-static {v2, v10}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 204
    .line 205
    .line 206
    goto :goto_4

    .line 207
    :catchall_3
    move-exception v0

    .line 208
    move-object v1, v0

    .line 209
    goto/16 :goto_9

    .line 210
    .line 211
    :goto_3
    :try_start_a
    throw v1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 212
    :catchall_4
    move-exception v0

    .line 213
    :try_start_b
    invoke-static {v2, v1}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 214
    .line 215
    .line 216
    throw v0

    .line 217
    :cond_3
    :goto_4
    new-instance v2, Ljava/util/ArrayList;

    .line 218
    .line 219
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v8}, Lokio/internal/EocdRecord;->getCentralDirectoryOffset()J

    .line 223
    .line 224
    .line 225
    move-result-wide v4

    .line 226
    invoke-virtual {v3, v4, v5}, Lokio/FileHandle;->source(J)Lokio/Source;

    .line 227
    .line 228
    .line 229
    move-result-object v4

    .line 230
    invoke-static {v4}, Lokio/Okio;->buffer(Lokio/Source;)Lokio/BufferedSource;

    .line 231
    .line 232
    .line 233
    move-result-object v4
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    .line 234
    :try_start_c
    invoke-virtual {v8}, Lokio/internal/EocdRecord;->getEntryCount()J

    .line 235
    .line 236
    .line 237
    move-result-wide v11

    .line 238
    :goto_5
    cmp-long v5, v6, v11

    .line 239
    .line 240
    if-gez v5, :cond_6

    .line 241
    .line 242
    invoke-static {v4}, Lokio/internal/ZipFilesKt;->readEntry(Lokio/BufferedSource;)Lokio/internal/ZipEntry;

    .line 243
    .line 244
    .line 245
    move-result-object v5

    .line 246
    invoke-virtual {v5}, Lokio/internal/ZipEntry;->getOffset()J

    .line 247
    .line 248
    .line 249
    move-result-wide v13

    .line 250
    invoke-virtual {v8}, Lokio/internal/EocdRecord;->getCentralDirectoryOffset()J

    .line 251
    .line 252
    .line 253
    move-result-wide v15

    .line 254
    cmp-long v13, v13, v15

    .line 255
    .line 256
    if-gez v13, :cond_5

    .line 257
    .line 258
    move-object/from16 v13, p2

    .line 259
    .line 260
    invoke-interface {v13, v5}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v14

    .line 264
    check-cast v14, Ljava/lang/Boolean;

    .line 265
    .line 266
    invoke-virtual {v14}, Ljava/lang/Boolean;->booleanValue()Z

    .line 267
    .line 268
    .line 269
    move-result v14

    .line 270
    if-eqz v14, :cond_4

    .line 271
    .line 272
    invoke-interface {v2, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 273
    .line 274
    .line 275
    goto :goto_6

    .line 276
    :catchall_5
    move-exception v0

    .line 277
    move-object v1, v0

    .line 278
    goto :goto_7

    .line 279
    :cond_4
    :goto_6
    const-wide/16 v14, 0x1

    .line 280
    .line 281
    add-long/2addr v6, v14

    .line 282
    goto :goto_5

    .line 283
    :cond_5
    new-instance v0, Ljava/io/IOException;

    .line 284
    .line 285
    const-string v1, "bad zip: local file header offset >= central directory offset"

    .line 286
    .line 287
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    throw v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    .line 291
    :cond_6
    :try_start_d
    invoke-static {v4, v10}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 292
    .line 293
    .line 294
    invoke-static {v2}, Lokio/internal/ZipFilesKt;->buildIndex(Ljava/util/List;)Ljava/util/Map;

    .line 295
    .line 296
    .line 297
    move-result-object v2

    .line 298
    new-instance v4, Lokio/ZipFileSystem;

    .line 299
    .line 300
    invoke-direct {v4, v0, v1, v2, v9}, Lokio/ZipFileSystem;-><init>(Lokio/Path;Lokio/FileSystem;Ljava/util/Map;Ljava/lang/String;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_3

    .line 301
    .line 302
    .line 303
    invoke-static {v3, v10}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 304
    .line 305
    .line 306
    return-object v4

    .line 307
    :goto_7
    :try_start_e
    throw v1
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    .line 308
    :catchall_6
    move-exception v0

    .line 309
    :try_start_f
    invoke-static {v4, v1}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 310
    .line 311
    .line 312
    throw v0

    .line 313
    :catchall_7
    move-exception v0

    .line 314
    goto :goto_8

    .line 315
    :cond_7
    move-object/from16 v13, p2

    .line 316
    .line 317
    invoke-interface {v2}, Lokio/Source;->close()V

    .line 318
    .line 319
    .line 320
    const-wide/16 v10, -0x1

    .line 321
    .line 322
    add-long/2addr v4, v10

    .line 323
    cmp-long v2, v4, v8

    .line 324
    .line 325
    if-ltz v2, :cond_8

    .line 326
    .line 327
    goto/16 :goto_0

    .line 328
    .line 329
    :cond_8
    new-instance v0, Ljava/io/IOException;

    .line 330
    .line 331
    const-string v1, "not a zip: end of central directory signature not found"

    .line 332
    .line 333
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 334
    .line 335
    .line 336
    throw v0

    .line 337
    :goto_8
    invoke-interface {v2}, Lokio/Source;->close()V

    .line 338
    .line 339
    .line 340
    throw v0

    .line 341
    :cond_9
    new-instance v0, Ljava/io/IOException;

    .line 342
    .line 343
    new-instance v1, Ljava/lang/StringBuilder;

    .line 344
    .line 345
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 346
    .line 347
    .line 348
    invoke-virtual {v3}, Lokio/FileHandle;->size()J

    .line 349
    .line 350
    .line 351
    move-result-wide v4

    .line 352
    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 353
    .line 354
    .line 355
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v1

    .line 359
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 360
    .line 361
    .line 362
    throw v0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_3

    .line 363
    :goto_9
    :try_start_10
    throw v1
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_8

    .line 364
    :catchall_8
    move-exception v0

    .line 365
    invoke-static {v3, v1}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 366
    .line 367
    .line 368
    throw v0
.end method

.method public static synthetic openZip$default(Lokio/Path;Lokio/FileSystem;Lfg/l;ILjava/lang/Object;)Lokio/ZipFileSystem;
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x4

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    sget-object p2, Lokio/internal/ZipFilesKt$openZip$1;->INSTANCE:Lokio/internal/ZipFilesKt$openZip$1;

    .line 6
    .line 7
    :cond_0
    invoke-static {p0, p1, p2}, Lokio/internal/ZipFilesKt;->openZip(Lokio/Path;Lokio/FileSystem;Lfg/l;)Lokio/ZipFileSystem;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public static final readEntry(Lokio/BufferedSource;)Lokio/internal/ZipEntry;
    .locals 23

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {v5}, Lokio/BufferedSource;->readIntLe()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const v1, 0x2014b50

    .line 11
    .line 12
    .line 13
    if-ne v0, v1, :cond_7

    .line 14
    .line 15
    const-wide/16 v0, 0x4

    .line 16
    .line 17
    invoke-interface {v5, v0, v1}, Lokio/BufferedSource;->skip(J)V

    .line 18
    .line 19
    .line 20
    invoke-interface {v5}, Lokio/BufferedSource;->readShortLe()S

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    const v1, 0xffff

    .line 25
    .line 26
    .line 27
    and-int v2, v0, v1

    .line 28
    .line 29
    const/4 v8, 0x1

    .line 30
    and-int/2addr v0, v8

    .line 31
    if-nez v0, :cond_6

    .line 32
    .line 33
    invoke-interface {v5}, Lokio/BufferedSource;->readShortLe()S

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    and-int v19, v0, v1

    .line 38
    .line 39
    invoke-interface {v5}, Lokio/BufferedSource;->readShortLe()S

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    and-int/2addr v0, v1

    .line 44
    invoke-interface {v5}, Lokio/BufferedSource;->readShortLe()S

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    and-int/2addr v2, v1

    .line 49
    invoke-static {v2, v0}, Lokio/internal/ZipFilesKt;->dosDateTimeToEpochMillis(II)Ljava/lang/Long;

    .line 50
    .line 51
    .line 52
    move-result-object v20

    .line 53
    invoke-interface {v5}, Lokio/BufferedSource;->readIntLe()I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    int-to-long v2, v0

    .line 58
    const-wide v6, 0xffffffffL

    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    and-long v13, v2, v6

    .line 64
    .line 65
    move-wide v2, v6

    .line 66
    new-instance v6, Lgg/t;

    .line 67
    .line 68
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 69
    .line 70
    .line 71
    invoke-interface {v5}, Lokio/BufferedSource;->readIntLe()I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    int-to-long v9, v0

    .line 76
    and-long/2addr v9, v2

    .line 77
    iput-wide v9, v6, Lgg/t;->g:J

    .line 78
    .line 79
    new-instance v4, Lgg/t;

    .line 80
    .line 81
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 82
    .line 83
    .line 84
    invoke-interface {v5}, Lokio/BufferedSource;->readIntLe()I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    int-to-long v9, v0

    .line 89
    and-long/2addr v9, v2

    .line 90
    iput-wide v9, v4, Lgg/t;->g:J

    .line 91
    .line 92
    invoke-interface {v5}, Lokio/BufferedSource;->readShortLe()S

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    and-int/2addr v0, v1

    .line 97
    invoke-interface {v5}, Lokio/BufferedSource;->readShortLe()S

    .line 98
    .line 99
    .line 100
    move-result v7

    .line 101
    and-int v9, v7, v1

    .line 102
    .line 103
    invoke-interface {v5}, Lokio/BufferedSource;->readShortLe()S

    .line 104
    .line 105
    .line 106
    move-result v7

    .line 107
    and-int v10, v7, v1

    .line 108
    .line 109
    const-wide/16 v11, 0x8

    .line 110
    .line 111
    invoke-interface {v5, v11, v12}, Lokio/BufferedSource;->skip(J)V

    .line 112
    .line 113
    .line 114
    new-instance v7, Lgg/t;

    .line 115
    .line 116
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 117
    .line 118
    .line 119
    invoke-interface {v5}, Lokio/BufferedSource;->readIntLe()I

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    int-to-long v11, v1

    .line 124
    and-long/2addr v11, v2

    .line 125
    iput-wide v11, v7, Lgg/t;->g:J

    .line 126
    .line 127
    int-to-long v0, v0

    .line 128
    invoke-interface {v5, v0, v1}, Lokio/BufferedSource;->readUtf8(J)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v11

    .line 132
    const/4 v12, 0x0

    .line 133
    invoke-static {v11, v12}, Log/m;->i0(Ljava/lang/CharSequence;C)Z

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    if-nez v0, :cond_5

    .line 138
    .line 139
    iget-wide v0, v4, Lgg/t;->g:J

    .line 140
    .line 141
    cmp-long v0, v0, v2

    .line 142
    .line 143
    const-wide/16 v15, 0x0

    .line 144
    .line 145
    const/16 v1, 0x8

    .line 146
    .line 147
    move-wide/from16 v17, v2

    .line 148
    .line 149
    if-nez v0, :cond_0

    .line 150
    .line 151
    int-to-long v2, v1

    .line 152
    :goto_0
    move-wide/from16 v21, v13

    .line 153
    .line 154
    goto :goto_1

    .line 155
    :cond_0
    move-wide v2, v15

    .line 156
    goto :goto_0

    .line 157
    :goto_1
    iget-wide v12, v6, Lgg/t;->g:J

    .line 158
    .line 159
    cmp-long v0, v12, v17

    .line 160
    .line 161
    if-nez v0, :cond_1

    .line 162
    .line 163
    int-to-long v12, v1

    .line 164
    add-long/2addr v2, v12

    .line 165
    :cond_1
    iget-wide v12, v7, Lgg/t;->g:J

    .line 166
    .line 167
    cmp-long v0, v12, v17

    .line 168
    .line 169
    if-nez v0, :cond_2

    .line 170
    .line 171
    int-to-long v0, v1

    .line 172
    add-long/2addr v2, v0

    .line 173
    :cond_2
    new-instance v1, Lgg/q;

    .line 174
    .line 175
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 176
    .line 177
    .line 178
    new-instance v0, Lokio/internal/ZipFilesKt$readEntry$1;

    .line 179
    .line 180
    invoke-direct/range {v0 .. v7}, Lokio/internal/ZipFilesKt$readEntry$1;-><init>(Lgg/q;JLgg/t;Lokio/BufferedSource;Lgg/t;Lgg/t;)V

    .line 181
    .line 182
    .line 183
    invoke-static {v5, v9, v0}, Lokio/internal/ZipFilesKt;->readExtra(Lokio/BufferedSource;ILfg/p;)V

    .line 184
    .line 185
    .line 186
    cmp-long v0, v2, v15

    .line 187
    .line 188
    if-lez v0, :cond_4

    .line 189
    .line 190
    iget-boolean v0, v1, Lgg/q;->g:Z

    .line 191
    .line 192
    if-eqz v0, :cond_3

    .line 193
    .line 194
    goto :goto_3

    .line 195
    :cond_3
    const-string v0, "bad zip: zip64 extra required but absent"

    .line 196
    .line 197
    invoke-static {v0}, Lj8/o;->y(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    :goto_2
    const/4 v0, 0x0

    .line 201
    return-object v0

    .line 202
    :cond_4
    :goto_3
    int-to-long v0, v10

    .line 203
    invoke-interface {v5, v0, v1}, Lokio/BufferedSource;->readUtf8(J)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v12

    .line 207
    sget-object v0, Lokio/Path;->Companion:Lokio/Path$Companion;

    .line 208
    .line 209
    const-string v1, "/"

    .line 210
    .line 211
    const/4 v2, 0x0

    .line 212
    const/4 v14, 0x0

    .line 213
    invoke-static {v0, v1, v14, v8, v2}, Lokio/Path$Companion;->get$default(Lokio/Path$Companion;Ljava/lang/String;ZILjava/lang/Object;)Lokio/Path;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    invoke-virtual {v0, v11}, Lokio/Path;->resolve(Ljava/lang/String;)Lokio/Path;

    .line 218
    .line 219
    .line 220
    move-result-object v10

    .line 221
    invoke-static {v11, v1, v14}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 222
    .line 223
    .line 224
    move-result v11

    .line 225
    new-instance v9, Lokio/internal/ZipEntry;

    .line 226
    .line 227
    iget-wide v0, v6, Lgg/t;->g:J

    .line 228
    .line 229
    iget-wide v2, v4, Lgg/t;->g:J

    .line 230
    .line 231
    iget-wide v4, v7, Lgg/t;->g:J

    .line 232
    .line 233
    move-wide v15, v0

    .line 234
    move-wide/from16 v17, v2

    .line 235
    .line 236
    move-wide/from16 v13, v21

    .line 237
    .line 238
    move-wide/from16 v21, v4

    .line 239
    .line 240
    invoke-direct/range {v9 .. v22}, Lokio/internal/ZipEntry;-><init>(Lokio/Path;ZLjava/lang/String;JJJILjava/lang/Long;J)V

    .line 241
    .line 242
    .line 243
    return-object v9

    .line 244
    :cond_5
    const-string v0, "bad zip: filename contains 0x00"

    .line 245
    .line 246
    invoke-static {v0}, Lj8/o;->y(Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    goto :goto_2

    .line 250
    :cond_6
    const-string v0, "unsupported zip: general purpose bit flag="

    .line 251
    .line 252
    invoke-static {v2}, Lokio/internal/ZipFilesKt;->getHex(I)Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v1

    .line 256
    invoke-static {v1, v0}, Lokio/a;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    goto :goto_2

    .line 260
    :cond_7
    invoke-static {v1}, Lokio/internal/ZipFilesKt;->getHex(I)Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v1

    .line 264
    const-string v2, " but was "

    .line 265
    .line 266
    invoke-static {v0}, Lokio/internal/ZipFilesKt;->getHex(I)Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    const-string v3, "bad zip: expected "

    .line 271
    .line 272
    invoke-static {v3, v1, v2, v0}, Lokio/a;->j(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 273
    .line 274
    .line 275
    goto :goto_2
.end method

.method private static final readEocdRecord(Lokio/BufferedSource;)Lokio/internal/EocdRecord;
    .locals 10

    .line 1
    invoke-interface {p0}, Lokio/BufferedSource;->readShortLe()S

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const v1, 0xffff

    .line 6
    .line 7
    .line 8
    and-int/2addr v0, v1

    .line 9
    invoke-interface {p0}, Lokio/BufferedSource;->readShortLe()S

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    and-int/2addr v2, v1

    .line 14
    invoke-interface {p0}, Lokio/BufferedSource;->readShortLe()S

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    and-int/2addr v3, v1

    .line 19
    int-to-long v5, v3

    .line 20
    invoke-interface {p0}, Lokio/BufferedSource;->readShortLe()S

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    and-int/2addr v3, v1

    .line 25
    int-to-long v3, v3

    .line 26
    cmp-long v3, v5, v3

    .line 27
    .line 28
    if-nez v3, :cond_0

    .line 29
    .line 30
    if-nez v0, :cond_0

    .line 31
    .line 32
    if-nez v2, :cond_0

    .line 33
    .line 34
    const-wide/16 v2, 0x4

    .line 35
    .line 36
    invoke-interface {p0, v2, v3}, Lokio/BufferedSource;->skip(J)V

    .line 37
    .line 38
    .line 39
    invoke-interface {p0}, Lokio/BufferedSource;->readIntLe()I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    int-to-long v2, v0

    .line 44
    const-wide v7, 0xffffffffL

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    and-long/2addr v7, v2

    .line 50
    invoke-interface {p0}, Lokio/BufferedSource;->readShortLe()S

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    and-int v9, p0, v1

    .line 55
    .line 56
    new-instance v4, Lokio/internal/EocdRecord;

    .line 57
    .line 58
    invoke-direct/range {v4 .. v9}, Lokio/internal/EocdRecord;-><init>(JJI)V

    .line 59
    .line 60
    .line 61
    return-object v4

    .line 62
    :cond_0
    const-string p0, "unsupported zip: spanned"

    .line 63
    .line 64
    invoke-static {p0}, Lj8/o;->y(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    const/4 p0, 0x0

    .line 68
    return-object p0
.end method

.method private static final readExtra(Lokio/BufferedSource;ILfg/p;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lokio/BufferedSource;",
            "I",
            "Lfg/p;",
            ")V"
        }
    .end annotation

    .line 1
    int-to-long v0, p1

    .line 2
    :goto_0
    const-wide/16 v2, 0x0

    .line 3
    .line 4
    cmp-long p1, v0, v2

    .line 5
    .line 6
    if-eqz p1, :cond_4

    .line 7
    .line 8
    const-wide/16 v4, 0x4

    .line 9
    .line 10
    cmp-long p1, v0, v4

    .line 11
    .line 12
    if-ltz p1, :cond_3

    .line 13
    .line 14
    invoke-interface {p0}, Lokio/BufferedSource;->readShortLe()S

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    const v4, 0xffff

    .line 19
    .line 20
    .line 21
    and-int/2addr p1, v4

    .line 22
    invoke-interface {p0}, Lokio/BufferedSource;->readShortLe()S

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    int-to-long v4, v4

    .line 27
    const-wide/32 v6, 0xffff

    .line 28
    .line 29
    .line 30
    and-long/2addr v4, v6

    .line 31
    const/4 v6, 0x4

    .line 32
    int-to-long v6, v6

    .line 33
    sub-long/2addr v0, v6

    .line 34
    cmp-long v6, v0, v4

    .line 35
    .line 36
    if-ltz v6, :cond_2

    .line 37
    .line 38
    invoke-interface {p0, v4, v5}, Lokio/BufferedSource;->require(J)V

    .line 39
    .line 40
    .line 41
    invoke-interface {p0}, Lokio/BufferedSource;->getBuffer()Lokio/Buffer;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    invoke-virtual {v6}, Lokio/Buffer;->size()J

    .line 46
    .line 47
    .line 48
    move-result-wide v6

    .line 49
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 50
    .line 51
    .line 52
    move-result-object v8

    .line 53
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 54
    .line 55
    .line 56
    move-result-object v9

    .line 57
    invoke-interface {p2, v8, v9}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    invoke-interface {p0}, Lokio/BufferedSource;->getBuffer()Lokio/Buffer;

    .line 61
    .line 62
    .line 63
    move-result-object v8

    .line 64
    invoke-virtual {v8}, Lokio/Buffer;->size()J

    .line 65
    .line 66
    .line 67
    move-result-wide v8

    .line 68
    add-long/2addr v8, v4

    .line 69
    sub-long/2addr v8, v6

    .line 70
    cmp-long v2, v8, v2

    .line 71
    .line 72
    if-ltz v2, :cond_1

    .line 73
    .line 74
    if-lez v2, :cond_0

    .line 75
    .line 76
    invoke-interface {p0}, Lokio/BufferedSource;->getBuffer()Lokio/Buffer;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-virtual {p1, v8, v9}, Lokio/Buffer;->skip(J)V

    .line 81
    .line 82
    .line 83
    :cond_0
    sub-long/2addr v0, v4

    .line 84
    goto :goto_0

    .line 85
    :cond_1
    const-string p0, "unsupported zip: too many bytes processed for "

    .line 86
    .line 87
    invoke-static {p1, p0}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-static {p0}, Lj8/o;->y(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :cond_2
    const-string p0, "bad zip: truncated value in extra field"

    .line 96
    .line 97
    invoke-static {p0}, Lj8/o;->y(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :cond_3
    const-string p0, "bad zip: truncated header in extra field"

    .line 102
    .line 103
    invoke-static {p0}, Lj8/o;->y(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    :cond_4
    return-void
.end method

.method public static final readLocalHeader(Lokio/BufferedSource;Lokio/FileMetadata;)Lokio/FileMetadata;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-static {p0, p1}, Lokio/internal/ZipFilesKt;->readOrSkipLocalHeader(Lokio/BufferedSource;Lokio/FileMetadata;)Lokio/FileMetadata;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    return-object p0
.end method

.method private static final readOrSkipLocalHeader(Lokio/BufferedSource;Lokio/FileMetadata;)Lokio/FileMetadata;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Lgg/u;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-virtual/range {p1 .. p1}, Lokio/FileMetadata;->getLastModifiedAtMillis()Ljava/lang/Long;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-object v3, v2

    .line 17
    :goto_0
    iput-object v3, v1, Lgg/u;->g:Ljava/lang/Object;

    .line 18
    .line 19
    new-instance v3, Lgg/u;

    .line 20
    .line 21
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    new-instance v4, Lgg/u;

    .line 25
    .line 26
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-interface {v0}, Lokio/BufferedSource;->readIntLe()I

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    const v6, 0x4034b50

    .line 34
    .line 35
    .line 36
    if-ne v5, v6, :cond_3

    .line 37
    .line 38
    const-wide/16 v5, 0x2

    .line 39
    .line 40
    invoke-interface {v0, v5, v6}, Lokio/BufferedSource;->skip(J)V

    .line 41
    .line 42
    .line 43
    invoke-interface {v0}, Lokio/BufferedSource;->readShortLe()S

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    const v6, 0xffff

    .line 48
    .line 49
    .line 50
    and-int v7, v5, v6

    .line 51
    .line 52
    and-int/lit8 v5, v5, 0x1

    .line 53
    .line 54
    if-nez v5, :cond_2

    .line 55
    .line 56
    const-wide/16 v7, 0x12

    .line 57
    .line 58
    invoke-interface {v0, v7, v8}, Lokio/BufferedSource;->skip(J)V

    .line 59
    .line 60
    .line 61
    invoke-interface {v0}, Lokio/BufferedSource;->readShortLe()S

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    int-to-long v7, v5

    .line 66
    const-wide/32 v9, 0xffff

    .line 67
    .line 68
    .line 69
    and-long/2addr v7, v9

    .line 70
    invoke-interface {v0}, Lokio/BufferedSource;->readShortLe()S

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    and-int/2addr v5, v6

    .line 75
    invoke-interface {v0, v7, v8}, Lokio/BufferedSource;->skip(J)V

    .line 76
    .line 77
    .line 78
    if-nez p1, :cond_1

    .line 79
    .line 80
    int-to-long v3, v5

    .line 81
    invoke-interface {v0, v3, v4}, Lokio/BufferedSource;->skip(J)V

    .line 82
    .line 83
    .line 84
    return-object v2

    .line 85
    :cond_1
    new-instance v2, Lokio/internal/ZipFilesKt$readOrSkipLocalHeader$1;

    .line 86
    .line 87
    invoke-direct {v2, v0, v1, v3, v4}, Lokio/internal/ZipFilesKt$readOrSkipLocalHeader$1;-><init>(Lokio/BufferedSource;Lgg/u;Lgg/u;Lgg/u;)V

    .line 88
    .line 89
    .line 90
    invoke-static {v0, v5, v2}, Lokio/internal/ZipFilesKt;->readExtra(Lokio/BufferedSource;ILfg/p;)V

    .line 91
    .line 92
    .line 93
    new-instance v6, Lokio/FileMetadata;

    .line 94
    .line 95
    invoke-virtual/range {p1 .. p1}, Lokio/FileMetadata;->isRegularFile()Z

    .line 96
    .line 97
    .line 98
    move-result v7

    .line 99
    invoke-virtual/range {p1 .. p1}, Lokio/FileMetadata;->isDirectory()Z

    .line 100
    .line 101
    .line 102
    move-result v8

    .line 103
    invoke-virtual/range {p1 .. p1}, Lokio/FileMetadata;->getSize()Ljava/lang/Long;

    .line 104
    .line 105
    .line 106
    move-result-object v10

    .line 107
    iget-object v0, v4, Lgg/u;->g:Ljava/lang/Object;

    .line 108
    .line 109
    move-object v11, v0

    .line 110
    check-cast v11, Ljava/lang/Long;

    .line 111
    .line 112
    iget-object v0, v1, Lgg/u;->g:Ljava/lang/Object;

    .line 113
    .line 114
    move-object v12, v0

    .line 115
    check-cast v12, Ljava/lang/Long;

    .line 116
    .line 117
    iget-object v0, v3, Lgg/u;->g:Ljava/lang/Object;

    .line 118
    .line 119
    move-object v13, v0

    .line 120
    check-cast v13, Ljava/lang/Long;

    .line 121
    .line 122
    const/16 v15, 0x80

    .line 123
    .line 124
    const/16 v16, 0x0

    .line 125
    .line 126
    const/4 v9, 0x0

    .line 127
    const/4 v14, 0x0

    .line 128
    invoke-direct/range {v6 .. v16}, Lokio/FileMetadata;-><init>(ZZLokio/Path;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/Map;ILgg/g;)V

    .line 129
    .line 130
    .line 131
    return-object v6

    .line 132
    :cond_2
    const-string v0, "unsupported zip: general purpose bit flag="

    .line 133
    .line 134
    invoke-static {v7}, Lokio/internal/ZipFilesKt;->getHex(I)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    invoke-static {v1, v0}, Lokio/a;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    :goto_1
    const/4 v0, 0x0

    .line 142
    return-object v0

    .line 143
    :cond_3
    invoke-static {v6}, Lokio/internal/ZipFilesKt;->getHex(I)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    const-string v1, " but was "

    .line 148
    .line 149
    invoke-static {v5}, Lokio/internal/ZipFilesKt;->getHex(I)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    const-string v3, "bad zip: expected "

    .line 154
    .line 155
    invoke-static {v3, v0, v1, v2}, Lokio/a;->j(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    goto :goto_1
.end method

.method private static final readZip64EocdRecord(Lokio/BufferedSource;Lokio/internal/EocdRecord;)Lokio/internal/EocdRecord;
    .locals 8

    .line 1
    const-wide/16 v0, 0xc

    .line 2
    .line 3
    invoke-interface {p0, v0, v1}, Lokio/BufferedSource;->skip(J)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Lokio/BufferedSource;->readIntLe()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-interface {p0}, Lokio/BufferedSource;->readIntLe()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-interface {p0}, Lokio/BufferedSource;->readLongLe()J

    .line 15
    .line 16
    .line 17
    move-result-wide v3

    .line 18
    invoke-interface {p0}, Lokio/BufferedSource;->readLongLe()J

    .line 19
    .line 20
    .line 21
    move-result-wide v5

    .line 22
    cmp-long v2, v3, v5

    .line 23
    .line 24
    if-nez v2, :cond_0

    .line 25
    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    if-nez v1, :cond_0

    .line 29
    .line 30
    const-wide/16 v0, 0x8

    .line 31
    .line 32
    invoke-interface {p0, v0, v1}, Lokio/BufferedSource;->skip(J)V

    .line 33
    .line 34
    .line 35
    invoke-interface {p0}, Lokio/BufferedSource;->readLongLe()J

    .line 36
    .line 37
    .line 38
    move-result-wide v5

    .line 39
    new-instance v2, Lokio/internal/EocdRecord;

    .line 40
    .line 41
    invoke-virtual {p1}, Lokio/internal/EocdRecord;->getCommentByteCount()I

    .line 42
    .line 43
    .line 44
    move-result v7

    .line 45
    invoke-direct/range {v2 .. v7}, Lokio/internal/EocdRecord;-><init>(JJI)V

    .line 46
    .line 47
    .line 48
    return-object v2

    .line 49
    :cond_0
    const-string p0, "unsupported zip: spanned"

    .line 50
    .line 51
    invoke-static {p0}, Lj8/o;->y(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const/4 p0, 0x0

    .line 55
    return-object p0
.end method

.method public static final skipLocalHeader(Lokio/BufferedSource;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-static {p0, v0}, Lokio/internal/ZipFilesKt;->readOrSkipLocalHeader(Lokio/BufferedSource;Lokio/FileMetadata;)Lokio/FileMetadata;

    .line 6
    .line 7
    .line 8
    return-void
.end method
