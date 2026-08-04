.class public final Lyyds/ᛴᲇᛶᲀ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᛲᲈᲁ:Lyyds/ᛴᲇᛶᲀ;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-wide v0, -0x62bd6e68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    new-instance v0, Lyyds/ᛴᲇᛶᲀ;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lyyds/ᛴᲇᛶᲀ;->ᛲᲈᲁ:Lyyds/ᛴᲇᛶᲀ;

    .line 15
    .line 16
    return-void
.end method

.method public static ᛲᛴᛳᛲ(Ljava/io/File;Ljava/util/ArrayList;I)[B
    .locals 12

    .line 1
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_7

    .line 6
    .line 7
    if-gtz p2, :cond_0

    .line 8
    .line 9
    goto/16 :goto_3

    .line 10
    .line 11
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-wide/16 v1, 0x0

    .line 16
    .line 17
    move-wide v3, v1

    .line 18
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v5

    .line 22
    if-eqz v5, :cond_4

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    check-cast v5, Lyyds/ᛸᛵᛳᛳ;

    .line 29
    .line 30
    iget-wide v6, v5, Lyyds/ᛸᛵᛳᛳ;->ᛲᲈᲁ:J

    .line 31
    .line 32
    iget-wide v8, v5, Lyyds/ᛸᛵᛳᛳ;->ᛵᛸᛸᛷ:J

    .line 33
    .line 34
    cmp-long v5, v6, v1

    .line 35
    .line 36
    if-ltz v5, :cond_7

    .line 37
    .line 38
    cmp-long v5, v8, v1

    .line 39
    .line 40
    if-gtz v5, :cond_1

    .line 41
    .line 42
    goto :goto_3

    .line 43
    :cond_1
    invoke-virtual {p0}, Ljava/io/File;->length()J

    .line 44
    .line 45
    .line 46
    move-result-wide v10

    .line 47
    sub-long/2addr v10, v8

    .line 48
    cmp-long v5, v6, v10

    .line 49
    .line 50
    if-lez v5, :cond_2

    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_2
    int-to-long v5, p2

    .line 54
    sub-long/2addr v5, v8

    .line 55
    cmp-long v5, v3, v5

    .line 56
    .line 57
    if-lez v5, :cond_3

    .line 58
    .line 59
    goto :goto_3

    .line 60
    :cond_3
    add-long/2addr v3, v8

    .line 61
    goto :goto_0

    .line 62
    :cond_4
    cmp-long v0, v3, v1

    .line 63
    .line 64
    if-lez v0, :cond_7

    .line 65
    .line 66
    int-to-long v0, p2

    .line 67
    cmp-long p2, v3, v0

    .line 68
    .line 69
    if-lez p2, :cond_5

    .line 70
    .line 71
    goto :goto_3

    .line 72
    :cond_5
    long-to-int p2, v3

    .line 73
    new-array p2, p2, [B

    .line 74
    .line 75
    new-instance v0, Ljava/io/RandomAccessFile;

    .line 76
    .line 77
    const-wide v1, -0x62b3fe68a836eL

    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-direct {v0, p0, v1}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    :try_start_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    const/4 p1, 0x0

    .line 94
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    if-eqz v1, :cond_6

    .line 99
    .line 100
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    check-cast v1, Lyyds/ᛸᛵᛳᛳ;

    .line 105
    .line 106
    iget-wide v2, v1, Lyyds/ᛸᛵᛳᛳ;->ᛵᛸᛸᛷ:J

    .line 107
    .line 108
    long-to-int v2, v2

    .line 109
    iget-wide v3, v1, Lyyds/ᛸᛵᛳᛳ;->ᛲᲈᲁ:J

    .line 110
    .line 111
    invoke-virtual {v0, v3, v4}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0, p2, p1, v2}, Ljava/io/RandomAccessFile;->readFully([BII)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 115
    .line 116
    .line 117
    add-int/2addr p1, v2

    .line 118
    goto :goto_1

    .line 119
    :catchall_0
    move-exception p0

    .line 120
    goto :goto_2

    .line 121
    :cond_6
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->close()V

    .line 122
    .line 123
    .line 124
    return-object p2

    .line 125
    :goto_2
    :try_start_1
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 126
    :catchall_1
    move-exception p1

    .line 127
    invoke-static {v0, p0}, Lyyds/ᛶᛶᲁᲇ;->ᛵᛸᛸᛷ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 128
    .line 129
    .line 130
    throw p1

    .line 131
    :cond_7
    :goto_3
    const/4 p0, 0x0

    .line 132
    return-object p0
.end method

.method public static ᛲᲈᲁ(I[B)[B
    .locals 18

    .line 1
    move/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-wide v2, -0x62b41e68a836eL

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    array-length v2, v1

    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    goto/16 :goto_4

    .line 17
    .line 18
    :cond_0
    const/4 v2, 0x1

    .line 19
    if-gt v2, v0, :cond_a

    .line 20
    .line 21
    const/4 v3, 0x5

    .line 22
    if-ge v0, v3, :cond_a

    .line 23
    .line 24
    const-wide/16 v3, 0x0

    .line 25
    .line 26
    const/4 v5, 0x0

    .line 27
    move-wide v8, v3

    .line 28
    move v6, v5

    .line 29
    move v7, v6

    .line 30
    :goto_0
    array-length v10, v1

    .line 31
    if-ge v6, v10, :cond_6

    .line 32
    .line 33
    add-int/2addr v7, v2

    .line 34
    const v10, 0x186a0

    .line 35
    .line 36
    .line 37
    if-le v7, v10, :cond_1

    .line 38
    .line 39
    goto/16 :goto_4

    .line 40
    .line 41
    :cond_1
    array-length v10, v1

    .line 42
    sub-int/2addr v10, v0

    .line 43
    if-le v6, v10, :cond_2

    .line 44
    .line 45
    goto/16 :goto_4

    .line 46
    .line 47
    :cond_2
    move-wide v11, v3

    .line 48
    move v10, v5

    .line 49
    :goto_1
    if-ge v10, v0, :cond_3

    .line 50
    .line 51
    const/16 v13, 0x8

    .line 52
    .line 53
    shl-long/2addr v11, v13

    .line 54
    add-int/lit8 v13, v6, 0x1

    .line 55
    .line 56
    aget-byte v6, v1, v6

    .line 57
    .line 58
    int-to-long v14, v6

    .line 59
    const-wide/16 v16, 0xff

    .line 60
    .line 61
    and-long v14, v14, v16

    .line 62
    .line 63
    or-long/2addr v11, v14

    .line 64
    add-int/lit8 v10, v10, 0x1

    .line 65
    .line 66
    move v6, v13

    .line 67
    goto :goto_1

    .line 68
    :cond_3
    cmp-long v10, v11, v3

    .line 69
    .line 70
    if-lez v10, :cond_a

    .line 71
    .line 72
    array-length v10, v1

    .line 73
    sub-int/2addr v10, v6

    .line 74
    int-to-long v13, v10

    .line 75
    cmp-long v10, v11, v13

    .line 76
    .line 77
    if-lez v10, :cond_4

    .line 78
    .line 79
    goto :goto_4

    .line 80
    :cond_4
    const-wide/32 v13, 0xfffffc

    .line 81
    .line 82
    .line 83
    sub-long/2addr v13, v11

    .line 84
    cmp-long v10, v8, v13

    .line 85
    .line 86
    if-lez v10, :cond_5

    .line 87
    .line 88
    goto :goto_4

    .line 89
    :cond_5
    const-wide/16 v13, 0x4

    .line 90
    .line 91
    add-long/2addr v13, v11

    .line 92
    add-long/2addr v8, v13

    .line 93
    long-to-int v10, v11

    .line 94
    add-int/2addr v6, v10

    .line 95
    goto :goto_0

    .line 96
    :cond_6
    array-length v3, v1

    .line 97
    if-ne v6, v3, :cond_a

    .line 98
    .line 99
    const-wide/32 v3, 0x7fffffff

    .line 100
    .line 101
    .line 102
    cmp-long v3, v8, v3

    .line 103
    .line 104
    if-lez v3, :cond_7

    .line 105
    .line 106
    goto :goto_4

    .line 107
    :cond_7
    long-to-int v3, v8

    .line 108
    new-array v3, v3, [B

    .line 109
    .line 110
    move v4, v5

    .line 111
    move v6, v4

    .line 112
    :goto_2
    array-length v7, v1

    .line 113
    if-ge v4, v7, :cond_9

    .line 114
    .line 115
    move v7, v5

    .line 116
    move v8, v7

    .line 117
    :goto_3
    if-ge v7, v0, :cond_8

    .line 118
    .line 119
    shl-int/lit8 v8, v8, 0x8

    .line 120
    .line 121
    add-int/lit8 v9, v4, 0x1

    .line 122
    .line 123
    aget-byte v4, v1, v4

    .line 124
    .line 125
    and-int/lit16 v4, v4, 0xff

    .line 126
    .line 127
    or-int/2addr v8, v4

    .line 128
    add-int/lit8 v7, v7, 0x1

    .line 129
    .line 130
    move v4, v9

    .line 131
    goto :goto_3

    .line 132
    :cond_8
    add-int/lit8 v7, v6, 0x1

    .line 133
    .line 134
    aput-byte v5, v3, v6

    .line 135
    .line 136
    add-int/lit8 v9, v6, 0x2

    .line 137
    .line 138
    aput-byte v5, v3, v7

    .line 139
    .line 140
    add-int/lit8 v7, v6, 0x3

    .line 141
    .line 142
    aput-byte v5, v3, v9

    .line 143
    .line 144
    add-int/lit8 v6, v6, 0x4

    .line 145
    .line 146
    aput-byte v2, v3, v7

    .line 147
    .line 148
    add-int v7, v4, v8

    .line 149
    .line 150
    invoke-static {v1, v3, v6, v4, v7}, Lyyds/ᲀᲀᛷᛸ;->ᛶᛸᲀᲁ([B[BIII)V

    .line 151
    .line 152
    .line 153
    add-int/2addr v6, v8

    .line 154
    move v4, v7

    .line 155
    goto :goto_2

    .line 156
    :cond_9
    return-object v3

    .line 157
    :cond_a
    :goto_4
    const/4 v0, 0x0

    .line 158
    return-object v0
.end method

.method public static ᛵᛸᛸᛷ(Ljava/io/File;Lyyds/ᛲᛷᲁᛷ;II)Lyyds/ᛲᲇᛵᛵ;
    .locals 12

    .line 1
    const-wide v0, -0x62b06e68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    const-wide v0, -0x62b0fe68a836eL

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/io/File;->isFile()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/4 v1, 0x0

    .line 22
    if-eqz v0, :cond_5

    .line 23
    .line 24
    if-lez p2, :cond_5

    .line 25
    .line 26
    if-gtz p3, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iget v0, p1, Lyyds/ᛲᛷᲁᛷ;->ᲀᛲᛳᲀ:I

    .line 30
    .line 31
    if-ne v0, p2, :cond_5

    .line 32
    .line 33
    iget v0, p1, Lyyds/ᛲᛷᲁᛷ;->ᲇᲈᛵᛷ:I

    .line 34
    .line 35
    if-eq v0, p3, :cond_1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    int-to-long v2, p2

    .line 39
    int-to-long v4, p3

    .line 40
    mul-long/2addr v2, v4

    .line 41
    const-wide/32 v4, 0xf42400

    .line 42
    .line 43
    .line 44
    cmp-long v0, v2, v4

    .line 45
    .line 46
    if-lez v0, :cond_2

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    const-wide/16 v4, 0x4

    .line 50
    .line 51
    mul-long/2addr v2, v4

    .line 52
    const-wide/32 v4, 0x10000

    .line 53
    .line 54
    .line 55
    add-long v6, v2, v4

    .line 56
    .line 57
    const-wide/32 v8, 0x40000

    .line 58
    .line 59
    .line 60
    const-wide/32 v10, 0x1000000

    .line 61
    .line 62
    .line 63
    invoke-static/range {v6 .. v11}, Lyyds/ᛳᛵᲀ;->ᲇᲈᛵᛷ(JJJ)J

    .line 64
    .line 65
    .line 66
    move-result-wide v2

    .line 67
    long-to-int v0, v2

    .line 68
    :try_start_0
    iget-object v2, p1, Lyyds/ᛲᛷᲁᛷ;->ᛵᛸᛸᛷ:Ljava/util/ArrayList;

    .line 69
    .line 70
    invoke-static {p0, v2, v0}, Lyyds/ᛴᲇᛶᲀ;->ᛲᛴᛳᛲ(Ljava/io/File;Ljava/util/ArrayList;I)[B

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    if-nez p0, :cond_3

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_3
    iget v0, p1, Lyyds/ᛲᛷᲁᛷ;->ᛲᛴᛳᛲ:I

    .line 78
    .line 79
    invoke-static {v0, p0}, Lyyds/ᛴᲇᛶᲀ;->ᛲᲈᲁ(I[B)[B

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    if-nez p0, :cond_4

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_4
    iget-object v0, p1, Lyyds/ᛲᛷᲁᛷ;->ᲇᲇᲇᛱ:[B

    .line 87
    .line 88
    iget-object p1, p1, Lyyds/ᛲᛷᲁᛷ;->ᛶᛷᛲᲁ:Ljava/lang/Boolean;

    .line 89
    .line 90
    invoke-static {p0, v0, p2, p3, p1}, Lyyds/ᛴᲇᛶᲀ;->ᲀᛲᛳᲀ([B[BIILjava/lang/Boolean;)Lyyds/ᛲᲇᛵᛵ;

    .line 91
    .line 92
    .line 93
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 94
    return-object p0

    .line 95
    :catchall_0
    move-exception v0

    .line 96
    move-object p0, v0

    .line 97
    const-wide p1, -0x62b18e68a836eL

    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    invoke-static {p1, p2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    const-wide p2, -0x62b2ce68a836eL

    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    invoke-static {p2, p3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p2

    .line 115
    invoke-static {p1, p2, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 116
    .line 117
    .line 118
    :cond_5
    :goto_0
    return-object v1
.end method

.method public static ᲀᛲᛳᲀ([B[BIILjava/lang/Boolean;)Lyyds/ᛲᲇᛵᛵ;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    move-object/from16 v3, p4

    .line 8
    .line 9
    array-length v4, v0

    .line 10
    const/4 v5, 0x0

    .line 11
    if-nez v4, :cond_0

    .line 12
    .line 13
    goto/16 :goto_9

    .line 14
    .line 15
    :cond_0
    move-object/from16 v4, p1

    .line 16
    .line 17
    array-length v6, v4

    .line 18
    if-nez v6, :cond_1

    .line 19
    .line 20
    goto/16 :goto_9

    .line 21
    .line 22
    :cond_1
    const-wide v6, -0x62b48e68a836eL

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    invoke-static {v6, v7}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    invoke-static {v6, v1, v2}, Landroid/media/MediaFormat;->createVideoFormat(Ljava/lang/String;II)Landroid/media/MediaFormat;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    const-wide v7, -0x62b53e68a836eL

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    invoke-static {v7, v8}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v7

    .line 44
    const v8, 0x7f420888

    .line 45
    .line 46
    .line 47
    invoke-virtual {v6, v7, v8}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 48
    .line 49
    .line 50
    const-wide v7, -0x62b60e68a836eL

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    invoke-static {v7, v8}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v7

    .line 59
    array-length v8, v0

    .line 60
    invoke-virtual {v6, v7, v8}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 61
    .line 62
    .line 63
    const-wide v7, -0x62b6fe68a836eL

    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    invoke-static {v7, v8}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v7

    .line 72
    const/4 v8, 0x1

    .line 73
    invoke-virtual {v6, v7, v8}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 74
    .line 75
    .line 76
    const-wide v9, -0x62b7ae68a836eL

    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    invoke-static {v9, v10}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v7

    .line 85
    invoke-static {v4}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    invoke-virtual {v6, v7, v4}, Landroid/media/MediaFormat;->setByteBuffer(Ljava/lang/String;Ljava/nio/ByteBuffer;)V

    .line 90
    .line 91
    .line 92
    if-eqz v3, :cond_3

    .line 93
    .line 94
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 95
    .line 96
    .line 97
    move-result v7

    .line 98
    const-wide v9, -0x62b80e68a836eL

    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    invoke-static {v9, v10}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v9

    .line 107
    if-eqz v7, :cond_2

    .line 108
    .line 109
    move v7, v8

    .line 110
    goto :goto_0

    .line 111
    :cond_2
    const/4 v7, 0x2

    .line 112
    :goto_0
    invoke-virtual {v6, v9, v7}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 113
    .line 114
    .line 115
    :cond_3
    const-wide v9, -0x62b8ce68a836eL

    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    invoke-static {v9, v10}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    const-wide v9, -0x62b97e68a836eL

    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    const/4 v7, 0x0

    .line 129
    :try_start_0
    invoke-static {v9, v10}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v9

    .line 133
    invoke-static {v9}, Landroid/media/MediaCodec;->createDecoderByType(Ljava/lang/String;)Landroid/media/MediaCodec;

    .line 134
    .line 135
    .line 136
    move-result-object v10
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_8

    .line 137
    :try_start_1
    invoke-virtual {v10, v6, v5, v5, v7}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v10}, Landroid/media/MediaCodec;->start()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_7

    .line 141
    .line 142
    .line 143
    :try_start_2
    new-instance v6, Landroid/media/MediaCodec$BufferInfo;

    .line 144
    .line 145
    invoke-direct {v6}, Landroid/media/MediaCodec$BufferInfo;-><init>()V

    .line 146
    .line 147
    .line 148
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 149
    .line 150
    .line 151
    move-result-wide v11

    .line 152
    const-wide/16 v13, 0x2710

    .line 153
    .line 154
    add-long v17, v11, v13

    .line 155
    .line 156
    move v9, v7

    .line 157
    move/from16 v19, v9

    .line 158
    .line 159
    move/from16 v20, v19

    .line 160
    .line 161
    move/from16 v21, v20

    .line 162
    .line 163
    :goto_1
    const/16 v11, 0x1f4

    .line 164
    .line 165
    if-gt v9, v11, :cond_13

    .line 166
    .line 167
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 168
    .line 169
    .line 170
    move-result-wide v11

    .line 171
    cmp-long v11, v11, v17

    .line 172
    .line 173
    if-gtz v11, :cond_13

    .line 174
    .line 175
    if-nez v19, :cond_7

    .line 176
    .line 177
    invoke-virtual {v10, v13, v14}, Landroid/media/MediaCodec;->dequeueInputBuffer(J)I

    .line 178
    .line 179
    .line 180
    move-result v11

    .line 181
    if-ltz v11, :cond_7

    .line 182
    .line 183
    if-nez v20, :cond_6

    .line 184
    .line 185
    invoke-virtual {v10, v11}, Landroid/media/MediaCodec;->getInputBuffer(I)Ljava/nio/ByteBuffer;

    .line 186
    .line 187
    .line 188
    move-result-object v12
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 189
    if-nez v12, :cond_4

    .line 190
    .line 191
    :goto_2
    :try_start_3
    invoke-virtual {v10}, Landroid/media/MediaCodec;->stop()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 192
    .line 193
    .line 194
    :catchall_0
    :try_start_4
    invoke-virtual {v10}, Landroid/media/MediaCodec;->release()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_6

    .line 195
    .line 196
    .line 197
    goto/16 :goto_9

    .line 198
    .line 199
    :cond_4
    :try_start_5
    invoke-virtual {v12}, Ljava/nio/Buffer;->capacity()I

    .line 200
    .line 201
    .line 202
    move-result v15

    .line 203
    const/16 p1, 0x2

    .line 204
    .line 205
    array-length v4, v0

    .line 206
    if-ge v15, v4, :cond_5

    .line 207
    .line 208
    goto :goto_2

    .line 209
    :cond_5
    invoke-virtual {v12}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 210
    .line 211
    .line 212
    invoke-virtual {v12, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 213
    .line 214
    .line 215
    move-wide v14, v13

    .line 216
    array-length v13, v0

    .line 217
    move-wide/from16 v22, v14

    .line 218
    .line 219
    const-wide/16 v14, 0x0

    .line 220
    .line 221
    const/16 v16, 0x1

    .line 222
    .line 223
    const/4 v12, 0x0

    .line 224
    move/from16 v24, v9

    .line 225
    .line 226
    move-wide/from16 v8, v22

    .line 227
    .line 228
    invoke-virtual/range {v10 .. v16}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V

    .line 229
    .line 230
    .line 231
    const/4 v11, 0x1

    .line 232
    const/16 v20, 0x1

    .line 233
    .line 234
    goto :goto_3

    .line 235
    :catchall_1
    move-exception v0

    .line 236
    move-object v5, v10

    .line 237
    const/4 v8, 0x1

    .line 238
    goto/16 :goto_a

    .line 239
    .line 240
    :cond_6
    move/from16 v24, v9

    .line 241
    .line 242
    move-wide v8, v13

    .line 243
    const/16 p1, 0x2

    .line 244
    .line 245
    const-wide/16 v14, 0x0

    .line 246
    .line 247
    const/16 v16, 0x4

    .line 248
    .line 249
    const/4 v12, 0x0

    .line 250
    const/4 v13, 0x0

    .line 251
    invoke-virtual/range {v10 .. v16}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V

    .line 252
    .line 253
    .line 254
    const/4 v11, 0x1

    .line 255
    const/16 v19, 0x1

    .line 256
    .line 257
    goto :goto_3

    .line 258
    :cond_7
    move/from16 v24, v9

    .line 259
    .line 260
    move-wide v8, v13

    .line 261
    const/16 p1, 0x2

    .line 262
    .line 263
    move v11, v7

    .line 264
    :goto_3
    invoke-virtual {v10, v6, v8, v9}, Landroid/media/MediaCodec;->dequeueOutputBuffer(Landroid/media/MediaCodec$BufferInfo;J)I

    .line 265
    .line 266
    .line 267
    move-result v12

    .line 268
    const/4 v13, -0x2

    .line 269
    if-ne v12, v13, :cond_8

    .line 270
    .line 271
    :goto_4
    const/4 v11, 0x1

    .line 272
    goto/16 :goto_8

    .line 273
    .line 274
    :cond_8
    if-ltz v12, :cond_11

    .line 275
    .line 276
    add-int/lit8 v11, v21, 0x1

    .line 277
    .line 278
    const/16 v13, 0x8

    .line 279
    .line 280
    if-le v11, v13, :cond_9

    .line 281
    .line 282
    invoke-virtual {v10, v12, v7}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 283
    .line 284
    .line 285
    goto :goto_2

    .line 286
    :cond_9
    :try_start_6
    iget v13, v6, Landroid/media/MediaCodec$BufferInfo;->size:I

    .line 287
    .line 288
    if-lez v13, :cond_c

    .line 289
    .line 290
    iget v13, v6, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 291
    .line 292
    and-int/lit8 v13, v13, 0x2

    .line 293
    .line 294
    if-nez v13, :cond_c

    .line 295
    .line 296
    invoke-virtual {v10, v12}, Landroid/media/MediaCodec;->getOutputImage(I)Landroid/media/Image;

    .line 297
    .line 298
    .line 299
    move-result-object v13
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 300
    if-eqz v13, :cond_b

    .line 301
    .line 302
    :try_start_7
    sget-object v14, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 303
    .line 304
    invoke-static {v3, v14}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 305
    .line 306
    .line 307
    move-result v14

    .line 308
    if-eqz v14, :cond_a

    .line 309
    .line 310
    move v14, v7

    .line 311
    goto :goto_5

    .line 312
    :cond_a
    const/16 v14, 0x10

    .line 313
    .line 314
    :goto_5
    invoke-static {v13, v1, v2, v14}, Lyyds/ᛴᲇᛶᲀ;->ᲇᲈᛵᛷ(Landroid/media/Image;III)Lyyds/ᛲᲇᛵᛵ;

    .line 315
    .line 316
    .line 317
    move-result-object v14
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 318
    goto :goto_6

    .line 319
    :catchall_2
    move-exception v0

    .line 320
    move-object v5, v13

    .line 321
    goto :goto_7

    .line 322
    :cond_b
    move-object v14, v5

    .line 323
    goto :goto_6

    .line 324
    :catchall_3
    move-exception v0

    .line 325
    goto :goto_7

    .line 326
    :cond_c
    move-object v13, v5

    .line 327
    move-object v14, v13

    .line 328
    :goto_6
    if-eqz v13, :cond_d

    .line 329
    .line 330
    :try_start_8
    invoke-virtual {v13}, Landroid/media/Image;->close()V

    .line 331
    .line 332
    .line 333
    :cond_d
    invoke-virtual {v10, v12, v7}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 334
    .line 335
    .line 336
    if-eqz v14, :cond_e

    .line 337
    .line 338
    :try_start_9
    invoke-virtual {v10}, Landroid/media/MediaCodec;->stop()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 339
    .line 340
    .line 341
    :catchall_4
    :try_start_a
    invoke-virtual {v10}, Landroid/media/MediaCodec;->release()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    .line 342
    .line 343
    .line 344
    :catchall_5
    return-object v14

    .line 345
    :cond_e
    :try_start_b
    iget v12, v6, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 346
    .line 347
    and-int/lit8 v12, v12, 0x4

    .line 348
    .line 349
    if-eqz v12, :cond_f

    .line 350
    .line 351
    goto/16 :goto_2

    .line 352
    .line 353
    :cond_f
    move/from16 v21, v11

    .line 354
    .line 355
    goto :goto_4

    .line 356
    :goto_7
    if-eqz v5, :cond_10

    .line 357
    .line 358
    invoke-virtual {v5}, Landroid/media/Image;->close()V

    .line 359
    .line 360
    .line 361
    :cond_10
    invoke-virtual {v10, v12, v7}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V

    .line 362
    .line 363
    .line 364
    throw v0

    .line 365
    :cond_11
    :goto_8
    if-eqz v11, :cond_12

    .line 366
    .line 367
    move-wide v13, v8

    .line 368
    const/4 v8, 0x1

    .line 369
    move v9, v7

    .line 370
    goto/16 :goto_1

    .line 371
    .line 372
    :cond_12
    add-int/lit8 v11, v24, 0x1

    .line 373
    .line 374
    move-wide v13, v8

    .line 375
    move v9, v11

    .line 376
    const/4 v8, 0x1

    .line 377
    goto/16 :goto_1

    .line 378
    .line 379
    :cond_13
    const-wide v0, -0x62ba2e68a836eL

    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 385
    .line 386
    .line 387
    move-result-object v0

    .line 388
    const-wide v1, -0x62bb6e68a836eL

    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object v1

    .line 397
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 398
    .line 399
    .line 400
    goto/16 :goto_2

    .line 401
    .line 402
    :catchall_6
    :goto_9
    return-object v5

    .line 403
    :catchall_7
    move-exception v0

    .line 404
    move v8, v7

    .line 405
    move-object v5, v10

    .line 406
    goto :goto_a

    .line 407
    :catchall_8
    move-exception v0

    .line 408
    move v8, v7

    .line 409
    :goto_a
    if-eqz v5, :cond_15

    .line 410
    .line 411
    if-eqz v8, :cond_14

    .line 412
    .line 413
    :try_start_c
    invoke-virtual {v5}, Landroid/media/MediaCodec;->stop()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_9

    .line 414
    .line 415
    .line 416
    :catchall_9
    :cond_14
    :try_start_d
    invoke-virtual {v5}, Landroid/media/MediaCodec;->release()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_a

    .line 417
    .line 418
    .line 419
    :catchall_a
    :cond_15
    throw v0
.end method

.method public static ᲇᲈᛵᛷ(Landroid/media/Image;III)Lyyds/ᛲᲇᛵᛵ;
    .locals 20

    .line 1
    move/from16 v0, p1

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    invoke-virtual/range {p0 .. p0}, Landroid/media/Image;->getFormat()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/16 v3, 0x23

    .line 10
    .line 11
    if-ne v2, v3, :cond_6

    .line 12
    .line 13
    invoke-virtual/range {p0 .. p0}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const-wide v3, -0x62bc7e68a836eL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    array-length v2, v2

    .line 26
    if-nez v2, :cond_0

    .line 27
    .line 28
    goto/16 :goto_2

    .line 29
    .line 30
    :cond_0
    invoke-virtual/range {p0 .. p0}, Landroid/media/Image;->getCropRect()Landroid/graphics/Rect;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    iget v3, v2, Landroid/graphics/Rect;->left:I

    .line 35
    .line 36
    if-ltz v3, :cond_6

    .line 37
    .line 38
    iget v3, v2, Landroid/graphics/Rect;->top:I

    .line 39
    .line 40
    if-ltz v3, :cond_6

    .line 41
    .line 42
    iget v3, v2, Landroid/graphics/Rect;->right:I

    .line 43
    .line 44
    invoke-virtual/range {p0 .. p0}, Landroid/media/Image;->getWidth()I

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    if-gt v3, v4, :cond_6

    .line 49
    .line 50
    iget v3, v2, Landroid/graphics/Rect;->bottom:I

    .line 51
    .line 52
    invoke-virtual/range {p0 .. p0}, Landroid/media/Image;->getHeight()I

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-le v3, v4, :cond_1

    .line 57
    .line 58
    goto/16 :goto_2

    .line 59
    .line 60
    :cond_1
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-ne v3, v0, :cond_6

    .line 65
    .line 66
    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    if-eq v3, v1, :cond_2

    .line 71
    .line 72
    goto/16 :goto_2

    .line 73
    .line 74
    :cond_2
    invoke-virtual/range {p0 .. p0}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    const/4 v4, 0x0

    .line 79
    aget-object v3, v3, v4

    .line 80
    .line 81
    invoke-virtual {v3}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    invoke-virtual {v5}, Ljava/nio/Buffer;->position()I

    .line 86
    .line 87
    .line 88
    move-result v6

    .line 89
    invoke-virtual {v5}, Ljava/nio/Buffer;->limit()I

    .line 90
    .line 91
    .line 92
    move-result v7

    .line 93
    invoke-virtual {v3}, Landroid/media/Image$Plane;->getRowStride()I

    .line 94
    .line 95
    .line 96
    move-result v8

    .line 97
    invoke-virtual {v3}, Landroid/media/Image$Plane;->getPixelStride()I

    .line 98
    .line 99
    .line 100
    move-result v3

    .line 101
    if-lez v8, :cond_6

    .line 102
    .line 103
    if-gtz v3, :cond_3

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_3
    mul-int v9, v0, v1

    .line 107
    .line 108
    new-array v9, v9, [B

    .line 109
    .line 110
    move v10, v4

    .line 111
    move v11, v10

    .line 112
    :goto_0
    if-ge v10, v1, :cond_5

    .line 113
    .line 114
    iget v12, v2, Landroid/graphics/Rect;->top:I

    .line 115
    .line 116
    add-int/2addr v12, v10

    .line 117
    move v13, v4

    .line 118
    :goto_1
    if-ge v13, v0, :cond_4

    .line 119
    .line 120
    iget v14, v2, Landroid/graphics/Rect;->left:I

    .line 121
    .line 122
    add-int/2addr v14, v13

    .line 123
    move-object v15, v5

    .line 124
    int-to-long v4, v12

    .line 125
    move-wide/from16 v16, v4

    .line 126
    .line 127
    int-to-long v4, v8

    .line 128
    mul-long v4, v4, v16

    .line 129
    .line 130
    move-wide/from16 v16, v4

    .line 131
    .line 132
    int-to-long v4, v14

    .line 133
    move-wide/from16 v18, v4

    .line 134
    .line 135
    int-to-long v4, v3

    .line 136
    mul-long v4, v4, v18

    .line 137
    .line 138
    add-long v4, v4, v16

    .line 139
    .line 140
    move-object v14, v2

    .line 141
    move/from16 v16, v3

    .line 142
    .line 143
    int-to-long v2, v6

    .line 144
    add-long/2addr v4, v2

    .line 145
    move-wide/from16 v17, v2

    .line 146
    .line 147
    int-to-long v2, v7

    .line 148
    cmp-long v2, v4, v2

    .line 149
    .line 150
    if-gez v2, :cond_6

    .line 151
    .line 152
    cmp-long v2, v17, v4

    .line 153
    .line 154
    if-gtz v2, :cond_6

    .line 155
    .line 156
    add-int/lit8 v2, v11, 0x1

    .line 157
    .line 158
    long-to-int v3, v4

    .line 159
    invoke-virtual {v15, v3}, Ljava/nio/ByteBuffer;->get(I)B

    .line 160
    .line 161
    .line 162
    move-result v3

    .line 163
    aput-byte v3, v9, v11

    .line 164
    .line 165
    add-int/lit8 v13, v13, 0x1

    .line 166
    .line 167
    move v11, v2

    .line 168
    move-object v2, v14

    .line 169
    move-object v5, v15

    .line 170
    move/from16 v3, v16

    .line 171
    .line 172
    const/4 v4, 0x0

    .line 173
    goto :goto_1

    .line 174
    :cond_4
    move-object v14, v2

    .line 175
    move/from16 v16, v3

    .line 176
    .line 177
    move-object v15, v5

    .line 178
    add-int/lit8 v10, v10, 0x1

    .line 179
    .line 180
    const/4 v4, 0x0

    .line 181
    goto :goto_0

    .line 182
    :cond_5
    new-instance v2, Lyyds/ᛲᲇᛵᛵ;

    .line 183
    .line 184
    move/from16 v3, p3

    .line 185
    .line 186
    invoke-direct {v2, v0, v1, v3, v9}, Lyyds/ᛲᲇᛵᛵ;-><init>(III[B)V

    .line 187
    .line 188
    .line 189
    return-object v2

    .line 190
    :cond_6
    :goto_2
    const/4 v0, 0x0

    .line 191
    return-object v0
.end method
