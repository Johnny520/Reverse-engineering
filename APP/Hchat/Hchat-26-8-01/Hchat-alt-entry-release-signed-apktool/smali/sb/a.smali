.class public abstract Lsb/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lsb/a;->a:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method

.method public static a(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)V
    .locals 7

    .line 1
    const-string v0, ".so"

    .line 2
    .line 3
    invoke-virtual {p2, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const-string v2, "-"

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    add-int/lit8 v1, v1, -0x3

    .line 17
    .line 18
    invoke-virtual {p2, v3, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-virtual {p2, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    :goto_0
    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    if-nez p0, :cond_1

    .line 36
    .line 37
    goto :goto_3

    .line 38
    :cond_1
    array-length v2, p0

    .line 39
    :goto_1
    if-ge v3, v2, :cond_5

    .line 40
    .line 41
    aget-object v4, p0, v3

    .line 42
    .line 43
    if-eqz v4, :cond_4

    .line 44
    .line 45
    invoke-virtual {v4, p1}, Ljava/io/File;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    if-eqz v5, :cond_2

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_2
    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    invoke-virtual {v5, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v6

    .line 60
    if-nez v6, :cond_3

    .line 61
    .line 62
    invoke-virtual {v5, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 63
    .line 64
    .line 65
    move-result v6

    .line 66
    if-eqz v6, :cond_4

    .line 67
    .line 68
    invoke-virtual {v5, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    if-eqz v5, :cond_4

    .line 73
    .line 74
    :cond_3
    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    .line 75
    .line 76
    .line 77
    :cond_4
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_5
    :goto_3
    return-void
.end method

.method public static b(Ljava/util/zip/ZipFile;Ljava/util/zip/ZipEntry;Ljava/io/File;Ljava/lang/String;Ljava/io/File;)V
    .locals 7

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    const-string v1, ".tmp-"

    .line 4
    .line 5
    invoke-static {p3, v1}, Lbc/e;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v2, "-"

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v2}, Ljava/lang/Thread;->getId()J

    .line 26
    .line 27
    .line 28
    move-result-wide v2

    .line 29
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-direct {v0, p2, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :try_start_0
    new-instance p2, Ljava/util/zip/CRC32;

    .line 40
    .line 41
    invoke-direct {p2}, Ljava/util/zip/CRC32;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, p1}, Ljava/util/zip/ZipFile;->getInputStream(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;

    .line 45
    .line 46
    .line 47
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 48
    :try_start_1
    new-instance v1, Ljava/io/FileOutputStream;

    .line 49
    .line 50
    const/4 v2, 0x0

    .line 51
    invoke-direct {v1, v0, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 52
    .line 53
    .line 54
    const/16 v3, 0x2000

    .line 55
    .line 56
    :try_start_2
    new-array v3, v3, [B

    .line 57
    .line 58
    :goto_0
    invoke-virtual {p0, v3}, Ljava/io/InputStream;->read([B)I

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    if-lez v4, :cond_0

    .line 63
    .line 64
    invoke-virtual {v1, v3, v2, v4}, Ljava/io/FileOutputStream;->write([BII)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p2, v3, v2, v4}, Ljava/util/zip/CRC32;->update([BII)V

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :catchall_0
    move-exception p1

    .line 72
    goto :goto_3

    .line 73
    :cond_0
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->getFD()Ljava/io/FileDescriptor;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    invoke-virtual {v3}, Ljava/io/FileDescriptor;->sync()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 78
    .line 79
    .line 80
    :try_start_3
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 81
    .line 82
    .line 83
    :try_start_4
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1}, Ljava/util/zip/ZipEntry;->getCrc()J

    .line 87
    .line 88
    .line 89
    move-result-wide v3

    .line 90
    const-wide/16 v5, 0x0

    .line 91
    .line 92
    cmp-long p0, v3, v5

    .line 93
    .line 94
    if-ltz p0, :cond_2

    .line 95
    .line 96
    invoke-virtual {p2}, Ljava/util/zip/CRC32;->getValue()J

    .line 97
    .line 98
    .line 99
    move-result-wide v3

    .line 100
    invoke-virtual {p1}, Ljava/util/zip/ZipEntry;->getCrc()J

    .line 101
    .line 102
    .line 103
    move-result-wide p0

    .line 104
    cmp-long p0, v3, p0

    .line 105
    .line 106
    if-nez p0, :cond_1

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 110
    .line 111
    new-instance p1, Ljava/lang/StringBuilder;

    .line 112
    .line 113
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 114
    .line 115
    .line 116
    const-string p2, "Native \u7f13\u5b58 CRC \u6821\u9a8c\u5931\u8d25: "

    .line 117
    .line 118
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 132
    :catchall_1
    move-exception p0

    .line 133
    goto :goto_7

    .line 134
    :cond_2
    :goto_1
    const/4 p0, 0x1

    .line 135
    :try_start_5
    invoke-virtual {v0}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    invoke-virtual {p4}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 140
    .line 141
    .line 142
    move-result-object p2

    .line 143
    const/4 p3, 0x2

    .line 144
    new-array p3, p3, [Ljava/nio/file/CopyOption;

    .line 145
    .line 146
    sget-object v1, Ljava/nio/file/StandardCopyOption;->ATOMIC_MOVE:Ljava/nio/file/StandardCopyOption;

    .line 147
    .line 148
    aput-object v1, p3, v2

    .line 149
    .line 150
    sget-object v1, Ljava/nio/file/StandardCopyOption;->REPLACE_EXISTING:Ljava/nio/file/StandardCopyOption;

    .line 151
    .line 152
    aput-object v1, p3, p0

    .line 153
    .line 154
    invoke-static {p1, p2, p3}, Ljava/nio/file/Files;->move(Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/CopyOption;)Ljava/nio/file/Path;
    :try_end_5
    .catch Ljava/nio/file/AtomicMoveNotSupportedException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 155
    .line 156
    .line 157
    goto :goto_2

    .line 158
    :catch_0
    :try_start_6
    invoke-virtual {v0}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    invoke-virtual {p4}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 163
    .line 164
    .line 165
    move-result-object p2

    .line 166
    new-array p0, p0, [Ljava/nio/file/CopyOption;

    .line 167
    .line 168
    sget-object p3, Ljava/nio/file/StandardCopyOption;->REPLACE_EXISTING:Ljava/nio/file/StandardCopyOption;

    .line 169
    .line 170
    aput-object p3, p0, v2

    .line 171
    .line 172
    invoke-static {p1, p2, p0}, Ljava/nio/file/Files;->move(Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/CopyOption;)Ljava/nio/file/Path;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 173
    .line 174
    .line 175
    :goto_2
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 176
    .line 177
    .line 178
    return-void

    .line 179
    :catchall_2
    move-exception p1

    .line 180
    goto :goto_5

    .line 181
    :goto_3
    :try_start_7
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 182
    .line 183
    .line 184
    goto :goto_4

    .line 185
    :catchall_3
    move-exception p2

    .line 186
    :try_start_8
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 187
    .line 188
    .line 189
    :goto_4
    throw p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 190
    :goto_5
    if-eqz p0, :cond_3

    .line 191
    .line 192
    :try_start_9
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 193
    .line 194
    .line 195
    goto :goto_6

    .line 196
    :catchall_4
    move-exception p0

    .line 197
    :try_start_a
    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 198
    .line 199
    .line 200
    :cond_3
    :goto_6
    throw p1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 201
    :goto_7
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 202
    .line 203
    .line 204
    throw p0
.end method

.method public static c(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;
    .locals 11

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const-wide/16 v2, 0x0

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/io/File;->length()J

    .line 15
    .line 16
    .line 17
    move-result-wide v4

    .line 18
    cmp-long v1, v4, v2

    .line 19
    .line 20
    if-lez v1, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    :goto_0
    const-string v1, ".so"

    .line 25
    .line 26
    invoke-virtual {p1, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    const-string v5, "-"

    .line 31
    .line 32
    const/4 v6, 0x0

    .line 33
    if-eqz v4, :cond_1

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    add-int/lit8 v4, v4, -0x3

    .line 40
    .line 41
    invoke-virtual {p1, v6, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    :cond_1
    invoke-virtual {p1, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    if-nez p0, :cond_2

    .line 54
    .line 55
    return-object v0

    .line 56
    :cond_2
    array-length v4, p0

    .line 57
    :goto_1
    if-ge v6, v4, :cond_7

    .line 58
    .line 59
    aget-object v5, p0, v6

    .line 60
    .line 61
    if-eqz v5, :cond_6

    .line 62
    .line 63
    invoke-virtual {v5}, Ljava/io/File;->isFile()Z

    .line 64
    .line 65
    .line 66
    move-result v7

    .line 67
    if-eqz v7, :cond_6

    .line 68
    .line 69
    invoke-virtual {v5}, Ljava/io/File;->length()J

    .line 70
    .line 71
    .line 72
    move-result-wide v7

    .line 73
    cmp-long v7, v7, v2

    .line 74
    .line 75
    if-gtz v7, :cond_3

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_3
    invoke-virtual {v5}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v7

    .line 82
    invoke-virtual {v7, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 83
    .line 84
    .line 85
    move-result v8

    .line 86
    if-eqz v8, :cond_6

    .line 87
    .line 88
    invoke-virtual {v7, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 89
    .line 90
    .line 91
    move-result v7

    .line 92
    if-nez v7, :cond_4

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_4
    if-eqz v0, :cond_5

    .line 96
    .line 97
    invoke-virtual {v5}, Ljava/io/File;->lastModified()J

    .line 98
    .line 99
    .line 100
    move-result-wide v7

    .line 101
    invoke-virtual {v0}, Ljava/io/File;->lastModified()J

    .line 102
    .line 103
    .line 104
    move-result-wide v9

    .line 105
    cmp-long v7, v7, v9

    .line 106
    .line 107
    if-lez v7, :cond_6

    .line 108
    .line 109
    :cond_5
    move-object v0, v5

    .line 110
    :cond_6
    :goto_2
    add-int/lit8 v6, v6, 0x1

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_7
    return-object v0
.end method

.method public static d(Landroid/content/Context;Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;Z)Z
    .locals 18

    .line 1
    move-object/from16 v1, p2

    .line 2
    .line 3
    const-string v0, "h.Hchat"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    :try_start_0
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v3

    .line 10
    const-string v4, "module="

    .line 11
    .line 12
    invoke-virtual {v3, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    if-ltz v4, :cond_1

    .line 17
    .line 18
    add-int/lit8 v4, v4, 0x7

    .line 19
    .line 20
    const-string v5, ","

    .line 21
    .line 22
    invoke-virtual {v3, v5, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    if-gez v5, :cond_0

    .line 27
    .line 28
    const-string v5, "]"

    .line 29
    .line 30
    invoke-virtual {v3, v5, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    :cond_0
    if-le v5, v4, :cond_1

    .line 35
    .line 36
    invoke-virtual {v3, v4, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    new-instance v4, Ljava/io/File;

    .line 45
    .line 46
    invoke-direct {v4, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    .line 50
    .line 51
    .line 52
    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    if-eqz v4, :cond_1

    .line 54
    .line 55
    goto/16 :goto_2

    .line 56
    .line 57
    :catchall_0
    :cond_1
    :try_start_1
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    :goto_0
    if-eqz v3, :cond_4

    .line 62
    .line 63
    invoke-static {v3}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    :cond_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    if-eqz v5, :cond_3

    .line 76
    .line 77
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    check-cast v5, Ljava/lang/reflect/Field;

    .line 82
    .line 83
    move-object/from16 v6, p1

    .line 84
    .line 85
    invoke-static {v5, v6}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    instance-of v7, v5, Ljava/lang/String;

    .line 90
    .line 91
    if-eqz v7, :cond_2

    .line 92
    .line 93
    check-cast v5, Ljava/lang/String;

    .line 94
    .line 95
    const-string v7, ".apk"

    .line 96
    .line 97
    invoke-virtual {v5, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 98
    .line 99
    .line 100
    move-result v7

    .line 101
    if-eqz v7, :cond_2

    .line 102
    .line 103
    invoke-virtual {v5, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 104
    .line 105
    .line 106
    move-result v7

    .line 107
    if-eqz v7, :cond_2

    .line 108
    .line 109
    new-instance v7, Ljava/io/File;

    .line 110
    .line 111
    invoke-direct {v7, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    .line 115
    .line 116
    .line 117
    move-result v7

    .line 118
    if-eqz v7, :cond_2

    .line 119
    .line 120
    move-object v3, v5

    .line 121
    goto :goto_2

    .line 122
    :cond_3
    move-object/from16 v6, p1

    .line 123
    .line 124
    invoke-virtual {v3}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 128
    goto :goto_0

    .line 129
    :catchall_1
    :cond_4
    :try_start_2
    new-instance v3, Ljava/io/File;

    .line 130
    .line 131
    const-string v4, "/data/app"

    .line 132
    .line 133
    invoke-direct {v3, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v3}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    if-eqz v3, :cond_6

    .line 141
    .line 142
    array-length v4, v3

    .line 143
    move v5, v2

    .line 144
    :goto_1
    if-ge v5, v4, :cond_6

    .line 145
    .line 146
    aget-object v6, v3, v5

    .line 147
    .line 148
    if-eqz v6, :cond_5

    .line 149
    .line 150
    invoke-virtual {v6}, Ljava/io/File;->isDirectory()Z

    .line 151
    .line 152
    .line 153
    move-result v7

    .line 154
    if-eqz v7, :cond_5

    .line 155
    .line 156
    invoke-virtual {v6}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v7

    .line 160
    invoke-virtual {v7, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 161
    .line 162
    .line 163
    move-result v7

    .line 164
    if-eqz v7, :cond_5

    .line 165
    .line 166
    new-instance v7, Ljava/io/File;

    .line 167
    .line 168
    const-string v8, "base.apk"

    .line 169
    .line 170
    invoke-direct {v7, v6, v8}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    .line 174
    .line 175
    .line 176
    move-result v6

    .line 177
    if-eqz v6, :cond_5

    .line 178
    .line 179
    invoke-virtual {v7}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 183
    goto :goto_2

    .line 184
    :cond_5
    add-int/lit8 v5, v5, 0x1

    .line 185
    .line 186
    goto :goto_1

    .line 187
    :catchall_2
    :cond_6
    const/4 v3, 0x0

    .line 188
    :goto_2
    invoke-static {}, Landroid/os/Process;->is64Bit()Z

    .line 189
    .line 190
    .line 191
    move-result v0

    .line 192
    if-eqz v0, :cond_7

    .line 193
    .line 194
    const-string v0, "arm64-v8a"

    .line 195
    .line 196
    goto :goto_3

    .line 197
    :cond_7
    const-string v0, "armeabi-v7a"

    .line 198
    .line 199
    :goto_3
    const-string v4, "lib/"

    .line 200
    .line 201
    const-string v5, "/"

    .line 202
    .line 203
    invoke-static {v4, v0, v5, v1}, Lbc/e;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v4

    .line 207
    new-instance v5, Ljava/io/File;

    .line 208
    .line 209
    new-instance v6, Ljava/io/File;

    .line 210
    .line 211
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 212
    .line 213
    .line 214
    move-result-object v7

    .line 215
    const-string v8, "Hchat_native"

    .line 216
    .line 217
    invoke-direct {v6, v7, v8}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    invoke-direct {v5, v6, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    const/4 v6, 0x1

    .line 224
    if-eqz v3, :cond_11

    .line 225
    .line 226
    :try_start_3
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 227
    .line 228
    .line 229
    move-result v0

    .line 230
    if-nez v0, :cond_8

    .line 231
    .line 232
    goto/16 :goto_10

    .line 233
    .line 234
    :cond_8
    new-instance v7, Ljava/util/zip/ZipFile;

    .line 235
    .line 236
    invoke-direct {v7, v3}, Ljava/util/zip/ZipFile;-><init>(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 237
    .line 238
    .line 239
    :try_start_4
    invoke-virtual {v7, v4}, Ljava/util/zip/ZipFile;->getEntry(Ljava/lang/String;)Ljava/util/zip/ZipEntry;

    .line 240
    .line 241
    .line 242
    move-result-object v3

    .line 243
    if-nez v3, :cond_9

    .line 244
    .line 245
    invoke-static/range {p3 .. p3}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 246
    .line 247
    .line 248
    :goto_4
    :try_start_5
    invoke-virtual {v7}, Ljava/util/zip/ZipFile;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 249
    .line 250
    .line 251
    goto/16 :goto_12

    .line 252
    .line 253
    :catchall_3
    move-exception v0

    .line 254
    goto/16 :goto_11

    .line 255
    .line 256
    :catchall_4
    move-exception v0

    .line 257
    move-object v3, v0

    .line 258
    goto/16 :goto_e

    .line 259
    .line 260
    :cond_9
    :try_start_6
    invoke-virtual {v5}, Ljava/io/File;->mkdirs()Z

    .line 261
    .line 262
    .line 263
    invoke-virtual {v3}, Ljava/util/zip/ZipEntry;->getCrc()J

    .line 264
    .line 265
    .line 266
    move-result-wide v8

    .line 267
    invoke-static {v8, v9, v1}, Lsb/a;->e(JLjava/lang/String;)Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v4

    .line 271
    new-instance v8, Ljava/io/File;

    .line 272
    .line 273
    invoke-direct {v8, v5, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    sget-object v9, Lsb/a;->a:Ljava/lang/Object;

    .line 277
    .line 278
    monitor-enter v9
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 279
    :try_start_7
    new-instance v0, Ljava/io/File;

    .line 280
    .line 281
    new-instance v10, Ljava/lang/StringBuilder;

    .line 282
    .line 283
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 287
    .line 288
    .line 289
    const-string v11, ".lock"

    .line 290
    .line 291
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 292
    .line 293
    .line 294
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v10

    .line 298
    invoke-direct {v0, v5, v10}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 299
    .line 300
    .line 301
    new-instance v10, Ljava/io/RandomAccessFile;

    .line 302
    .line 303
    const-string v11, "rw"

    .line 304
    .line 305
    invoke-direct {v10, v0, v11}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    .line 306
    .line 307
    .line 308
    :try_start_8
    invoke-virtual {v10}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    invoke-virtual {v0}, Ljava/nio/channels/FileChannel;->lock()Ljava/nio/channels/FileLock;

    .line 313
    .line 314
    .line 315
    move-result-object v11
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    .line 316
    :try_start_9
    invoke-virtual {v3}, Ljava/util/zip/ZipEntry;->getSize()J

    .line 317
    .line 318
    .line 319
    move-result-wide v12

    .line 320
    invoke-virtual {v8}, Ljava/io/File;->isFile()Z

    .line 321
    .line 322
    .line 323
    move-result v0

    .line 324
    if-eqz v0, :cond_b

    .line 325
    .line 326
    invoke-virtual {v8}, Ljava/io/File;->length()J

    .line 327
    .line 328
    .line 329
    move-result-wide v14

    .line 330
    const-wide/16 v16, 0x0

    .line 331
    .line 332
    cmp-long v0, v14, v16

    .line 333
    .line 334
    if-lez v0, :cond_b

    .line 335
    .line 336
    cmp-long v0, v12, v16

    .line 337
    .line 338
    if-ltz v0, :cond_a

    .line 339
    .line 340
    invoke-virtual {v8}, Ljava/io/File;->length()J

    .line 341
    .line 342
    .line 343
    move-result-wide v14

    .line 344
    cmp-long v0, v14, v12

    .line 345
    .line 346
    if-nez v0, :cond_b

    .line 347
    .line 348
    :cond_a
    move v12, v6

    .line 349
    goto :goto_5

    .line 350
    :cond_b
    move v12, v2

    .line 351
    :goto_5
    if-nez v12, :cond_c

    .line 352
    .line 353
    invoke-static {v7, v3, v5, v4, v8}, Lsb/a;->b(Ljava/util/zip/ZipFile;Ljava/util/zip/ZipEntry;Ljava/io/File;Ljava/lang/String;Ljava/io/File;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .line 354
    .line 355
    .line 356
    goto :goto_6

    .line 357
    :catchall_5
    move-exception v0

    .line 358
    move-object v3, v0

    .line 359
    goto :goto_9

    .line 360
    :cond_c
    :goto_6
    :try_start_a
    invoke-virtual {v8}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object v0

    .line 364
    invoke-static {v0}, Ljava/lang/System;->load(Ljava/lang/String;)V
    :try_end_a
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_a .. :try_end_a} :catch_0
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    .line 365
    .line 366
    .line 367
    goto :goto_7

    .line 368
    :catch_0
    move-exception v0

    .line 369
    move-object v13, v0

    .line 370
    if-eqz v12, :cond_f

    .line 371
    .line 372
    :try_start_b
    invoke-virtual {v8}, Ljava/io/File;->delete()Z

    .line 373
    .line 374
    .line 375
    move-result v0

    .line 376
    if-eqz v0, :cond_e

    .line 377
    .line 378
    invoke-static {v7, v3, v5, v4, v8}, Lsb/a;->b(Ljava/util/zip/ZipFile;Ljava/util/zip/ZipEntry;Ljava/io/File;Ljava/lang/String;Ljava/io/File;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    .line 379
    .line 380
    .line 381
    :try_start_c
    invoke-virtual {v8}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 382
    .line 383
    .line 384
    move-result-object v0

    .line 385
    invoke-static {v0}, Ljava/lang/System;->load(Ljava/lang/String;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_8

    .line 386
    .line 387
    .line 388
    :goto_7
    :try_start_d
    invoke-static {v5, v8, v1}, Lsb/a;->a(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    .line 389
    .line 390
    .line 391
    if-eqz v11, :cond_d

    .line 392
    .line 393
    :try_start_e
    invoke-virtual {v11}, Ljava/nio/channels/FileLock;->close()V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    .line 394
    .line 395
    .line 396
    goto :goto_8

    .line 397
    :catchall_6
    move-exception v0

    .line 398
    move-object v3, v0

    .line 399
    goto :goto_b

    .line 400
    :cond_d
    :goto_8
    :try_start_f
    invoke-virtual {v10}, Ljava/io/RandomAccessFile;->close()V

    .line 401
    .line 402
    .line 403
    monitor-exit v9
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_7

    .line 404
    goto/16 :goto_4

    .line 405
    .line 406
    :catchall_7
    move-exception v0

    .line 407
    goto :goto_d

    .line 408
    :catchall_8
    move-exception v0

    .line 409
    :try_start_10
    invoke-virtual {v0, v13}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 410
    .line 411
    .line 412
    throw v0

    .line 413
    :cond_e
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 414
    .line 415
    new-instance v3, Ljava/lang/StringBuilder;

    .line 416
    .line 417
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 418
    .line 419
    .line 420
    const-string v4, "\u65e0\u6cd5\u5220\u9664\u635f\u574f\u7684 Native \u7f13\u5b58: "

    .line 421
    .line 422
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 423
    .line 424
    .line 425
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 426
    .line 427
    .line 428
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 429
    .line 430
    .line 431
    move-result-object v3

    .line 432
    invoke-direct {v0, v3, v13}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 433
    .line 434
    .line 435
    throw v0

    .line 436
    :cond_f
    throw v13
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_5

    .line 437
    :goto_9
    if-eqz v11, :cond_10

    .line 438
    .line 439
    :try_start_11
    invoke-virtual {v11}, Ljava/nio/channels/FileLock;->close()V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_9

    .line 440
    .line 441
    .line 442
    goto :goto_a

    .line 443
    :catchall_9
    move-exception v0

    .line 444
    :try_start_12
    invoke-virtual {v3, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 445
    .line 446
    .line 447
    :cond_10
    :goto_a
    throw v3
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_6

    .line 448
    :goto_b
    :try_start_13
    invoke-virtual {v10}, Ljava/io/RandomAccessFile;->close()V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_a

    .line 449
    .line 450
    .line 451
    goto :goto_c

    .line 452
    :catchall_a
    move-exception v0

    .line 453
    :try_start_14
    invoke-virtual {v3, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 454
    .line 455
    .line 456
    :goto_c
    throw v3

    .line 457
    :goto_d
    monitor-exit v9
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_7

    .line 458
    :try_start_15
    throw v0
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_4

    .line 459
    :goto_e
    :try_start_16
    invoke-virtual {v7}, Ljava/util/zip/ZipFile;->close()V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_b

    .line 460
    .line 461
    .line 462
    goto :goto_f

    .line 463
    :catchall_b
    move-exception v0

    .line 464
    :try_start_17
    invoke-virtual {v3, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 465
    .line 466
    .line 467
    :goto_f
    throw v3

    .line 468
    :cond_11
    :goto_10
    invoke-static {v5, v1}, Lsb/a;->c(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    .line 469
    .line 470
    .line 471
    move-result-object v0

    .line 472
    if-eqz v0, :cond_12

    .line 473
    .line 474
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 475
    .line 476
    .line 477
    move-result-object v0

    .line 478
    invoke-static {v0}, Ljava/lang/System;->load(Ljava/lang/String;)V

    .line 479
    .line 480
    .line 481
    goto :goto_12

    .line 482
    :cond_12
    invoke-static/range {p3 .. p3}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_3

    .line 483
    .line 484
    .line 485
    goto :goto_12

    .line 486
    :goto_11
    const-string v3, "[Hchat:NativeLoader] "

    .line 487
    .line 488
    const-string v4, " \u52a0\u8f7d\u5931\u8d25: "

    .line 489
    .line 490
    invoke-static {v3, v1, v4}, Lbc/e;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 491
    .line 492
    .line 493
    move-result-object v3

    .line 494
    invoke-static {v0, v3, v0}, Lbc/e;->s(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Ljava/lang/Throwable;)V

    .line 495
    .line 496
    .line 497
    :try_start_18
    invoke-static/range {p3 .. p3}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_c

    .line 498
    .line 499
    .line 500
    :goto_12
    return v6

    .line 501
    :catchall_c
    move-exception v0

    .line 502
    const-string v3, "[Hchat:NativeLoader] "

    .line 503
    .line 504
    const-string v4, " loadLibrary \u4e5f\u5931\u8d25: "

    .line 505
    .line 506
    move-object/from16 v5, p3

    .line 507
    .line 508
    invoke-static {v3, v5, v4}, Lbc/e;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 509
    .line 510
    .line 511
    move-result-object v3

    .line 512
    invoke-static {v0, v3, v0}, Lbc/e;->s(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Ljava/lang/Throwable;)V

    .line 513
    .line 514
    .line 515
    if-eqz p4, :cond_13

    .line 516
    .line 517
    return v2

    .line 518
    :cond_13
    const-string v2, "\u65e0\u6cd5\u52a0\u8f7d "

    .line 519
    .line 520
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 521
    .line 522
    .line 523
    move-result-object v1

    .line 524
    invoke-static {v1, v0}, Lah/a;->p(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 525
    .line 526
    .line 527
    const/4 v0, 0x0

    .line 528
    return v0
.end method

.method public static e(JLjava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    const/16 v0, 0x2e

    .line 2
    .line 3
    invoke-virtual {p2, v0}, Ljava/lang/String;->lastIndexOf(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    new-instance v1, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v2, "-"

    .line 10
    .line 11
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-static {p0, p1}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    if-gtz v0, :cond_0

    .line 26
    .line 27
    invoke-virtual {p2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0

    .line 32
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 35
    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    invoke-virtual {p2, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p2, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0
.end method
