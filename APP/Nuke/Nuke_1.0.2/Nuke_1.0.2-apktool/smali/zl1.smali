.class public abstract Lzl1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final a:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "NUKE-NATIVE-RELEASE-V1\u0000"

    .line 2
    .line 3
    sget-object v1, Ljava/nio/charset/StandardCharsets;->US_ASCII:Ljava/nio/charset/Charset;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lzl1;->a:[B

    .line 10
    .line 11
    return-void
.end method

.method public static a(Ljava/util/zip/ZipFile;Ljava/util/zip/ZipEntry;Ljava/io/File;Lh80;)V
    .locals 12

    .line 1
    iget-wide v0, p3, Lh80;->g:J

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    invoke-virtual {v2}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v2}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {p2}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-virtual {v3}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    new-instance v4, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p2}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v5, "."

    .line 36
    .line 37
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    const/4 v5, 0x0

    .line 45
    new-array v6, v5, [Ljava/nio/file/attribute/FileAttribute;

    .line 46
    .line 47
    const-string v7, ".tmp"

    .line 48
    .line 49
    invoke-static {v3, v4, v7, v6}, Ljava/nio/file/Files;->createTempFile(Ljava/nio/file/Path;Ljava/lang/String;Ljava/lang/String;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    const-string v4, "SHA-256"

    .line 54
    .line 55
    invoke-static {v4}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    invoke-virtual {p0, p1}, Ljava/util/zip/ZipFile;->getInputStream(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    :try_start_0
    new-instance p1, Ljava/io/FileOutputStream;

    .line 64
    .line 65
    invoke-interface {v3}, Ljava/nio/file/Path;->toFile()Ljava/io/File;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    invoke-direct {p1, v6}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 70
    .line 71
    .line 72
    const/16 v6, 0x4000

    .line 73
    .line 74
    :try_start_1
    new-array v6, v6, [B

    .line 75
    .line 76
    const-wide/16 v7, 0x0

    .line 77
    .line 78
    :goto_0
    invoke-virtual {p0, v6}, Ljava/io/InputStream;->read([B)I

    .line 79
    .line 80
    .line 81
    move-result v9

    .line 82
    const/4 v10, -0x1

    .line 83
    if-eq v9, v10, :cond_1

    .line 84
    .line 85
    int-to-long v10, v9

    .line 86
    add-long/2addr v7, v10

    .line 87
    cmp-long v10, v7, v0

    .line 88
    .line 89
    if-gtz v10, :cond_0

    .line 90
    .line 91
    const-wide/32 v10, 0x4000000

    .line 92
    .line 93
    .line 94
    cmp-long v10, v7, v10

    .line 95
    .line 96
    if-gtz v10, :cond_0

    .line 97
    .line 98
    invoke-virtual {p1, v6, v5, v9}, Ljava/io/FileOutputStream;->write([BII)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v4, v6, v5, v9}, Ljava/security/MessageDigest;->update([BII)V

    .line 102
    .line 103
    .line 104
    goto :goto_0

    .line 105
    :catchall_0
    move-exception p2

    .line 106
    goto :goto_1

    .line 107
    :cond_0
    new-instance p2, Ljava/lang/SecurityException;

    .line 108
    .line 109
    const-string p3, "Native release Engine exceeds declared size"

    .line 110
    .line 111
    invoke-direct {p2, p3}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    throw p2

    .line 115
    :cond_1
    invoke-virtual {p1}, Ljava/io/FileOutputStream;->getFD()Ljava/io/FileDescriptor;

    .line 116
    .line 117
    .line 118
    move-result-object v5

    .line 119
    invoke-virtual {v5}, Ljava/io/FileDescriptor;->sync()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 120
    .line 121
    .line 122
    :try_start_2
    invoke-virtual {p1}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 123
    .line 124
    .line 125
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v4}, Ljava/security/MessageDigest;->digest()[B

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    invoke-static {p0}, Lzl1;->b([B)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    cmp-long p1, v7, v0

    .line 137
    .line 138
    if-nez p1, :cond_2

    .line 139
    .line 140
    iget-object p1, p3, Lh80;->i:Ljava/io/Serializable;

    .line 141
    .line 142
    check-cast p1, Ljava/lang/String;

    .line 143
    .line 144
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result p0

    .line 148
    if-eqz p0, :cond_2

    .line 149
    .line 150
    invoke-interface {v3}, Ljava/nio/file/Path;->toFile()Ljava/io/File;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    invoke-static {p0}, Lcm1;->k(Ljava/io/File;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {p2}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    invoke-static {v2, v3, p0}, Lup0;->g(Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;)V

    .line 162
    .line 163
    .line 164
    const/4 p0, 0x1

    .line 165
    invoke-virtual {p2, p0, p0}, Ljava/io/File;->setReadable(ZZ)Z

    .line 166
    .line 167
    .line 168
    invoke-virtual {p2, p0, p0}, Ljava/io/File;->setExecutable(ZZ)Z

    .line 169
    .line 170
    .line 171
    return-void

    .line 172
    :cond_2
    invoke-static {v3}, Ljava/nio/file/Files;->deleteIfExists(Ljava/nio/file/Path;)Z

    .line 173
    .line 174
    .line 175
    const-string p0, "Native release Engine digest mismatch"

    .line 176
    .line 177
    invoke-static {p0}, Lc80;->x(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    return-void

    .line 181
    :catchall_1
    move-exception p1

    .line 182
    goto :goto_3

    .line 183
    :goto_1
    :try_start_3
    invoke-virtual {p1}, Ljava/io/FileOutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 184
    .line 185
    .line 186
    goto :goto_2

    .line 187
    :catchall_2
    move-exception p1

    .line 188
    :try_start_4
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 189
    .line 190
    .line 191
    :goto_2
    throw p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 192
    :goto_3
    if-eqz p0, :cond_3

    .line 193
    .line 194
    :try_start_5
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 195
    .line 196
    .line 197
    goto :goto_4

    .line 198
    :catchall_3
    move-exception p0

    .line 199
    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 200
    .line 201
    .line 202
    :cond_3
    :goto_4
    throw p1
.end method

.method public static b([B)Ljava/lang/String;
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    array-length v1, p0

    .line 4
    mul-int/lit8 v1, v1, 0x2

    .line 5
    .line 6
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 7
    .line 8
    .line 9
    array-length v1, p0

    .line 10
    const/4 v2, 0x0

    .line 11
    :goto_0
    if-ge v2, v1, :cond_0

    .line 12
    .line 13
    aget-byte v3, p0, v2

    .line 14
    .line 15
    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 16
    .line 17
    and-int/lit16 v3, v3, 0xff

    .line 18
    .line 19
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    const-string v5, "%02x"

    .line 28
    .line 29
    invoke-static {v4, v5, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    add-int/lit8 v2, v2, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0
.end method

.method public static c(Ljava/io/InputStream;)[B
    .locals 7

    .line 1
    :try_start_0
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 4
    .line 5
    .line 6
    const/16 v1, 0x2000

    .line 7
    .line 8
    :try_start_1
    new-array v1, v1, [B

    .line 9
    .line 10
    const-wide/16 v2, 0x0

    .line 11
    .line 12
    :goto_0
    invoke-virtual {p0, v1}, Ljava/io/InputStream;->read([B)I

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    const/4 v5, -0x1

    .line 17
    if-eq v4, v5, :cond_1

    .line 18
    .line 19
    int-to-long v5, v4

    .line 20
    add-long/2addr v2, v5

    .line 21
    const-wide/32 v5, 0x20000

    .line 22
    .line 23
    .line 24
    cmp-long v5, v2, v5

    .line 25
    .line 26
    if-gtz v5, :cond_0

    .line 27
    .line 28
    const/4 v5, 0x0

    .line 29
    invoke-virtual {v0, v1, v5, v4}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    move-exception v1

    .line 34
    goto :goto_1

    .line 35
    :cond_0
    new-instance v1, Ljava/lang/SecurityException;

    .line 36
    .line 37
    const-string v2, "Native manifest is too large"

    .line 38
    .line 39
    invoke-direct {v1, v2}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw v1

    .line 43
    :cond_1
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 44
    .line 45
    .line 46
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 47
    :try_start_2
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    .line 51
    .line 52
    .line 53
    return-object v1

    .line 54
    :catchall_1
    move-exception v0

    .line 55
    goto :goto_3

    .line 56
    :goto_1
    :try_start_3
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 57
    .line 58
    .line 59
    goto :goto_2

    .line 60
    :catchall_2
    move-exception v0

    .line 61
    :try_start_4
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 62
    .line 63
    .line 64
    :goto_2
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 65
    :goto_3
    if-eqz p0, :cond_2

    .line 66
    .line 67
    :try_start_5
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 68
    .line 69
    .line 70
    goto :goto_4

    .line 71
    :catchall_3
    move-exception p0

    .line 72
    invoke-virtual {v0, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 73
    .line 74
    .line 75
    :cond_2
    :goto_4
    throw v0
.end method

.method public static d(Ljava/io/File;)Ljava/lang/String;
    .locals 4

    .line 1
    const-string v0, "SHA-256"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Ljava/io/FileInputStream;

    .line 8
    .line 9
    invoke-direct {v1, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 10
    .line 11
    .line 12
    const/16 p0, 0x4000

    .line 13
    .line 14
    :try_start_0
    new-array p0, p0, [B

    .line 15
    .line 16
    :goto_0
    invoke-virtual {v1, p0}, Ljava/io/InputStream;->read([B)I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const/4 v3, -0x1

    .line 21
    if-eq v2, v3, :cond_0

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    invoke-virtual {v0, p0, v3, v2}, Ljava/security/MessageDigest;->update([BII)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception p0

    .line 29
    goto :goto_1

    .line 30
    :cond_0
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-static {p0}, Lzl1;->b([B)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0

    .line 42
    :goto_1
    :try_start_1
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 43
    .line 44
    .line 45
    goto :goto_2

    .line 46
    :catchall_1
    move-exception v0

    .line 47
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 48
    .line 49
    .line 50
    :goto_2
    throw p0
.end method

.method public static e(Ljava/util/zip/ZipFile;)Ljava/util/ArrayList;
    .locals 11

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/HashSet;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/util/zip/ZipFile;->entries()Ljava/util/Enumeration;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    :goto_0
    invoke-interface {p0}, Ljava/util/Enumeration;->hasMoreElements()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const/4 v3, 0x0

    .line 20
    if-eqz v2, :cond_4

    .line 21
    .line 22
    invoke-interface {p0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Ljava/util/zip/ZipEntry;

    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    invoke-virtual {v2}, Ljava/util/zip/ZipEntry;->isDirectory()Z

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    if-nez v5, :cond_3

    .line 37
    .line 38
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    if-nez v5, :cond_3

    .line 43
    .line 44
    const-string v5, "/"

    .line 45
    .line 46
    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    if-nez v6, :cond_3

    .line 51
    .line 52
    const-string v6, "\\"

    .line 53
    .line 54
    invoke-virtual {v4, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 55
    .line 56
    .line 57
    move-result v7

    .line 58
    if-nez v7, :cond_3

    .line 59
    .line 60
    const/4 v7, -0x1

    .line 61
    invoke-virtual {v4, v5, v7}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    array-length v7, v5

    .line 66
    const/4 v8, 0x0

    .line 67
    :goto_1
    if-ge v8, v7, :cond_0

    .line 68
    .line 69
    aget-object v9, v5, v8

    .line 70
    .line 71
    invoke-virtual {v9}, Ljava/lang/String;->isEmpty()Z

    .line 72
    .line 73
    .line 74
    move-result v10

    .line 75
    if-nez v10, :cond_3

    .line 76
    .line 77
    const-string v10, "."

    .line 78
    .line 79
    invoke-virtual {v10, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v10

    .line 83
    if-nez v10, :cond_3

    .line 84
    .line 85
    const-string v10, ".."

    .line 86
    .line 87
    invoke-virtual {v10, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v9

    .line 91
    if-nez v9, :cond_3

    .line 92
    .line 93
    add-int/lit8 v8, v8, 0x1

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_0
    invoke-virtual {v4, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 97
    .line 98
    .line 99
    move-result v5

    .line 100
    if-nez v5, :cond_3

    .line 101
    .line 102
    invoke-virtual {v1, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    if-eqz v5, :cond_3

    .line 107
    .line 108
    const-string v5, "release.nkm"

    .line 109
    .line 110
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v5

    .line 114
    if-nez v5, :cond_2

    .line 115
    .line 116
    const-string v5, "lib/arm64-v8a/libnuke_engine_[0-9]+_[0-9a-f]{12}\\.so"

    .line 117
    .line 118
    invoke-virtual {v4, v5}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    .line 119
    .line 120
    .line 121
    move-result v4

    .line 122
    if-eqz v4, :cond_1

    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_1
    const-string p0, "Native release contains an unexpected entry"

    .line 126
    .line 127
    invoke-static {p0}, Lc80;->x(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    return-object v3

    .line 131
    :cond_2
    :goto_2
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_3
    const-string p0, "Native release ZIP entry is invalid"

    .line 136
    .line 137
    invoke-static {p0}, Lc80;->x(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    return-object v3

    .line 141
    :cond_4
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 142
    .line 143
    .line 144
    move-result p0

    .line 145
    const/4 v1, 0x2

    .line 146
    if-ne p0, v1, :cond_5

    .line 147
    .line 148
    return-object v0

    .line 149
    :cond_5
    const-string p0, "Native release must contain exactly two entries"

    .line 150
    .line 151
    invoke-static {p0}, Lc80;->x(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    return-object v3
.end method

.method public static f(Ljava/io/File;Ljava/io/File;)Lb5;
    .locals 8

    .line 1
    const-string v0, "release-"

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p0}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-static {v1, v2}, Lup0;->y(Ljava/nio/file/Path;Ljava/nio/file/Path;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_4

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/io/File;->length()J

    .line 18
    .line 19
    .line 20
    move-result-wide v1

    .line 21
    const-wide/16 v3, 0x0

    .line 22
    .line 23
    cmp-long v1, v1, v3

    .line 24
    .line 25
    if-lez v1, :cond_4

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/io/File;->length()J

    .line 28
    .line 29
    .line 30
    move-result-wide v1

    .line 31
    const-wide/32 v3, 0x4000000

    .line 32
    .line 33
    .line 34
    cmp-long v1, v1, v3

    .line 35
    .line 36
    if-gtz v1, :cond_4

    .line 37
    .line 38
    :try_start_0
    new-instance v1, Ljava/util/zip/ZipFile;

    .line 39
    .line 40
    invoke-direct {v1, p0}, Ljava/util/zip/ZipFile;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 41
    .line 42
    .line 43
    :try_start_1
    invoke-static {v1}, Lzl1;->e(Ljava/util/zip/ZipFile;)Ljava/util/ArrayList;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-interface {v2}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    new-instance v4, Lwl1;

    .line 52
    .line 53
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 54
    .line 55
    .line 56
    invoke-interface {v3, v4}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-interface {v3}, Ljava/util/stream/Stream;->findFirst()Ljava/util/Optional;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    new-instance v4, Lxl1;

    .line 65
    .line 66
    const/4 v5, 0x0

    .line 67
    invoke-direct {v4, v5}, Lxl1;-><init>(I)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v3, v4}, Ljava/util/Optional;->orElseThrow(Ljava/util/function/Supplier;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    check-cast v3, Ljava/util/zip/ZipEntry;

    .line 75
    .line 76
    invoke-virtual {v1, v3}, Ljava/util/zip/ZipFile;->getInputStream(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    invoke-static {v3}, Lzl1;->c(Ljava/io/InputStream;)[B

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    invoke-static {v3}, Lzl1;->g([B)Lh80;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    iget-wide v4, v3, Lh80;->g:J

    .line 89
    .line 90
    invoke-interface {v2}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    new-instance v6, Lyl1;

    .line 95
    .line 96
    invoke-direct {v6, v3}, Lyl1;-><init>(Lh80;)V

    .line 97
    .line 98
    .line 99
    invoke-interface {v2, v6}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-interface {v2}, Ljava/util/stream/Stream;->findFirst()Ljava/util/Optional;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    new-instance v6, Lxl1;

    .line 108
    .line 109
    const/4 v7, 0x1

    .line 110
    invoke-direct {v6, v7}, Lxl1;-><init>(I)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v2, v6}, Ljava/util/Optional;->orElseThrow(Ljava/util/function/Supplier;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    check-cast v2, Ljava/util/zip/ZipEntry;

    .line 118
    .line 119
    invoke-virtual {v2}, Ljava/util/zip/ZipEntry;->getSize()J

    .line 120
    .line 121
    .line 122
    move-result-wide v6

    .line 123
    cmp-long v6, v6, v4

    .line 124
    .line 125
    if-nez v6, :cond_3

    .line 126
    .line 127
    new-instance v6, Ljava/io/File;

    .line 128
    .line 129
    new-instance v7, Ljava/lang/StringBuilder;

    .line 130
    .line 131
    invoke-direct {v7, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    iget-object v0, v3, Lh80;->a:Ljava/lang/String;

    .line 135
    .line 136
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    invoke-direct {v6, p1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p1}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    invoke-virtual {v6}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    invoke-static {p1, v0}, Lup0;->r(Ljava/nio/file/Path;Ljava/nio/file/Path;)V

    .line 155
    .line 156
    .line 157
    new-instance p1, Ljava/io/File;

    .line 158
    .line 159
    new-instance v0, Ljava/io/File;

    .line 160
    .line 161
    iget-object v7, v3, Lh80;->h:Ljava/io/Serializable;

    .line 162
    .line 163
    check-cast v7, Ljava/lang/String;

    .line 164
    .line 165
    invoke-direct {v0, v7}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    invoke-direct {p1, v6, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {p1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    invoke-virtual {v0}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    invoke-virtual {p1}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 188
    .line 189
    .line 190
    move-result-object v6

    .line 191
    invoke-static {v0, v6}, Lup0;->y(Ljava/nio/file/Path;Ljava/nio/file/Path;)Z

    .line 192
    .line 193
    .line 194
    move-result v0

    .line 195
    if-eqz v0, :cond_2

    .line 196
    .line 197
    invoke-virtual {p1}, Ljava/io/File;->length()J

    .line 198
    .line 199
    .line 200
    move-result-wide v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 201
    cmp-long v0, v6, v4

    .line 202
    .line 203
    if-eqz v0, :cond_0

    .line 204
    .line 205
    goto :goto_0

    .line 206
    :cond_0
    :try_start_2
    iget-object v0, v3, Lh80;->i:Ljava/io/Serializable;

    .line 207
    .line 208
    check-cast v0, Ljava/lang/String;

    .line 209
    .line 210
    invoke-static {p1}, Lzl1;->d(Ljava/io/File;)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v4

    .line 214
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result v0

    .line 218
    if-nez v0, :cond_1

    .line 219
    .line 220
    goto :goto_0

    .line 221
    :cond_1
    invoke-static {p1}, Lcm1;->k(Ljava/io/File;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 222
    .line 223
    .line 224
    goto :goto_1

    .line 225
    :catch_0
    :cond_2
    :goto_0
    :try_start_3
    invoke-static {v1, v2, p1, v3}, Lzl1;->a(Ljava/util/zip/ZipFile;Ljava/util/zip/ZipEntry;Ljava/io/File;Lh80;)V

    .line 226
    .line 227
    .line 228
    :goto_1
    new-instance v0, Lb5;

    .line 229
    .line 230
    invoke-static {p0}, Lzl1;->d(Ljava/io/File;)Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object p0

    .line 234
    const/16 v2, 0x16

    .line 235
    .line 236
    invoke-direct {v0, v3, p1, p0, v2}, Lb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 237
    .line 238
    .line 239
    :try_start_4
    invoke-virtual {v1}, Ljava/util/zip/ZipFile;->close()V
    :try_end_4
    .catch Ljava/lang/SecurityException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    .line 240
    .line 241
    .line 242
    return-object v0

    .line 243
    :catchall_0
    move-exception p0

    .line 244
    goto :goto_2

    .line 245
    :cond_3
    :try_start_5
    new-instance p0, Ljava/lang/SecurityException;

    .line 246
    .line 247
    const-string p1, "Native release Engine size mismatch"

    .line 248
    .line 249
    invoke-direct {p0, p1}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    throw p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 253
    :goto_2
    :try_start_6
    invoke-virtual {v1}, Ljava/util/zip/ZipFile;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 254
    .line 255
    .line 256
    goto :goto_3

    .line 257
    :catchall_1
    move-exception p1

    .line 258
    :try_start_7
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 259
    .line 260
    .line 261
    :goto_3
    throw p0
    :try_end_7
    .catch Ljava/lang/SecurityException; {:try_start_7 .. :try_end_7} :catch_2
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1

    .line 262
    :catch_1
    move-exception p0

    .line 263
    new-instance p1, Ljava/lang/SecurityException;

    .line 264
    .line 265
    const-string v0, "Native release verification failed"

    .line 266
    .line 267
    invoke-direct {p1, v0, p0}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 268
    .line 269
    .line 270
    throw p1

    .line 271
    :catch_2
    move-exception p0

    .line 272
    throw p0

    .line 273
    :cond_4
    const-string p0, "Native release package size is invalid"

    .line 274
    .line 275
    invoke-static {p0}, Lc80;->x(Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    const/4 p0, 0x0

    .line 279
    return-object p0
.end method

.method public static g([B)Lh80;
    .locals 19

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/String;

    .line 4
    .line 5
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 6
    .line 7
    move-object/from16 v3, p0

    .line 8
    .line 9
    invoke-direct {v1, v3, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string v1, "v"

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/4 v3, 0x0

    .line 22
    const/4 v4, 0x1

    .line 23
    if-ne v1, v4, :cond_6

    .line 24
    .line 25
    invoke-static {}, Ljava/util/Base64;->getDecoder()Ljava/util/Base64$Decoder;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    const-string v5, "payload"

    .line 30
    .line 31
    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    invoke-virtual {v1, v5}, Ljava/util/Base64$Decoder;->decode(Ljava/lang/String;)[B

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-static {}, Ljava/util/Base64;->getDecoder()Ljava/util/Base64$Decoder;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    const-string v6, "certificate"

    .line 44
    .line 45
    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    invoke-virtual {v5, v6}, Ljava/util/Base64$Decoder;->decode(Ljava/lang/String;)[B

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    invoke-static {}, Ljava/util/Base64;->getDecoder()Ljava/util/Base64$Decoder;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    const-string v7, "signature"

    .line 58
    .line 59
    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v6, v0}, Ljava/util/Base64$Decoder;->decode(Ljava/lang/String;)[B

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    array-length v6, v1

    .line 68
    if-eqz v6, :cond_5

    .line 69
    .line 70
    array-length v6, v1

    .line 71
    int-to-long v6, v6

    .line 72
    const-wide/32 v8, 0x20000

    .line 73
    .line 74
    .line 75
    cmp-long v6, v6, v8

    .line 76
    .line 77
    if-gtz v6, :cond_5

    .line 78
    .line 79
    const-string v6, "X.509"

    .line 80
    .line 81
    invoke-static {v6}, Ljava/security/cert/CertificateFactory;->getInstance(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    new-instance v7, Ljava/io/ByteArrayInputStream;

    .line 86
    .line 87
    invoke-direct {v7, v5}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v6, v7}, Ljava/security/cert/CertificateFactory;->generateCertificate(Ljava/io/InputStream;)Ljava/security/cert/Certificate;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    check-cast v5, Ljava/security/cert/X509Certificate;

    .line 95
    .line 96
    invoke-virtual {v5}, Ljava/security/cert/X509Certificate;->checkValidity()V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v5}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    .line 100
    .line 101
    .line 102
    move-result-object v6

    .line 103
    invoke-virtual {v5, v6}, Ljava/security/cert/Certificate;->verify(Ljava/security/PublicKey;)V

    .line 104
    .line 105
    .line 106
    sget-object v6, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 107
    .line 108
    const-string v7, "341e386452ad60d52c0ff2c53e06e2c385ac6f03ccfe954043193a0acde8dbe4"

    .line 109
    .line 110
    invoke-virtual {v7, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v7

    .line 114
    invoke-virtual {v5}, Ljava/security/cert/Certificate;->getEncoded()[B

    .line 115
    .line 116
    .line 117
    move-result-object v8

    .line 118
    const-string v9, "SHA-256"

    .line 119
    .line 120
    invoke-static {v9}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 121
    .line 122
    .line 123
    move-result-object v9

    .line 124
    invoke-virtual {v9, v8}, Ljava/security/MessageDigest;->digest([B)[B

    .line 125
    .line 126
    .line 127
    move-result-object v8

    .line 128
    invoke-static {v8}, Lzl1;->b([B)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v8

    .line 132
    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    .line 133
    .line 134
    .line 135
    move-result v9

    .line 136
    if-nez v9, :cond_1

    .line 137
    .line 138
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v7

    .line 142
    if-eqz v7, :cond_0

    .line 143
    .line 144
    goto :goto_0

    .line 145
    :cond_0
    const-string v0, "Native release certificate fingerprint mismatch"

    .line 146
    .line 147
    invoke-static {v0}, Lc80;->x(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    return-object v3

    .line 151
    :cond_1
    :goto_0
    invoke-virtual {v5}, Ljava/security/cert/X509Certificate;->getSubjectX500Principal()Ljavax/security/auth/x500/X500Principal;

    .line 152
    .line 153
    .line 154
    move-result-object v7

    .line 155
    const-string v8, "RFC2253"

    .line 156
    .line 157
    invoke-virtual {v7, v8}, Ljavax/security/auth/x500/X500Principal;->getName(Ljava/lang/String;)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v7

    .line 161
    const-string v8, "CN=Admilk"

    .line 162
    .line 163
    invoke-virtual {v7, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 164
    .line 165
    .line 166
    move-result v8

    .line 167
    if-eqz v8, :cond_4

    .line 168
    .line 169
    const-string v8, "OU=design by Admilk"

    .line 170
    .line 171
    invoke-virtual {v7, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 172
    .line 173
    .line 174
    move-result v7

    .line 175
    if-eqz v7, :cond_4

    .line 176
    .line 177
    const-string v7, "SHA256withRSA"

    .line 178
    .line 179
    invoke-static {v7}, Ljava/security/Signature;->getInstance(Ljava/lang/String;)Ljava/security/Signature;

    .line 180
    .line 181
    .line 182
    move-result-object v7

    .line 183
    invoke-virtual {v5}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    .line 184
    .line 185
    .line 186
    move-result-object v5

    .line 187
    invoke-virtual {v7, v5}, Ljava/security/Signature;->initVerify(Ljava/security/PublicKey;)V

    .line 188
    .line 189
    .line 190
    sget-object v5, Lzl1;->a:[B

    .line 191
    .line 192
    invoke-virtual {v7, v5}, Ljava/security/Signature;->update([B)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v7, v1}, Ljava/security/Signature;->update([B)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v7, v0}, Ljava/security/Signature;->verify([B)Z

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    if-eqz v0, :cond_3

    .line 203
    .line 204
    new-instance v0, Lorg/json/JSONObject;

    .line 205
    .line 206
    new-instance v5, Ljava/lang/String;

    .line 207
    .line 208
    invoke-direct {v5, v1, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 209
    .line 210
    .line 211
    invoke-direct {v0, v5}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    const-string v1, "engine"

    .line 215
    .line 216
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    new-instance v7, Lh80;

    .line 221
    .line 222
    const-string v2, "releaseId"

    .line 223
    .line 224
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v8

    .line 228
    const-string v2, "generation"

    .line 229
    .line 230
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    .line 231
    .line 232
    .line 233
    move-result-wide v9

    .line 234
    const-string v2, "engineAbi"

    .line 235
    .line 236
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 237
    .line 238
    .line 239
    move-result v11

    .line 240
    const-string v2, "minBridgeAbi"

    .line 241
    .line 242
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 243
    .line 244
    .line 245
    move-result v12

    .line 246
    const-string v2, "minAppVersionCode"

    .line 247
    .line 248
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 249
    .line 250
    .line 251
    move-result v13

    .line 252
    const-string v2, "kid"

    .line 253
    .line 254
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v2

    .line 258
    invoke-virtual {v2, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v14

    .line 262
    const-string v2, "path"

    .line 263
    .line 264
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v15

    .line 268
    const-string v2, "sha256"

    .line 269
    .line 270
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v2

    .line 274
    invoke-virtual {v2, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v16

    .line 278
    const-string v2, "size"

    .line 279
    .line 280
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    .line 281
    .line 282
    .line 283
    move-result-wide v17

    .line 284
    const-string v1, "buildId"

    .line 285
    .line 286
    const-string v2, ""

    .line 287
    .line 288
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    invoke-direct/range {v7 .. v18}, Lh80;-><init>(Ljava/lang/String;JIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 292
    .line 293
    .line 294
    :try_start_0
    invoke-static {v8}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    invoke-virtual {v8, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object v1

    .line 306
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 307
    .line 308
    .line 309
    move-result v0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 310
    goto :goto_1

    .line 311
    :catch_0
    const/4 v0, 0x0

    .line 312
    :goto_1
    if-eqz v0, :cond_2

    .line 313
    .line 314
    const-wide/16 v0, 0x0

    .line 315
    .line 316
    cmp-long v2, v9, v0

    .line 317
    .line 318
    if-lez v2, :cond_2

    .line 319
    .line 320
    iget v2, v7, Lh80;->c:I

    .line 321
    .line 322
    if-ne v2, v4, :cond_2

    .line 323
    .line 324
    iget v2, v7, Lh80;->d:I

    .line 325
    .line 326
    if-gt v2, v4, :cond_2

    .line 327
    .line 328
    iget v2, v7, Lh80;->e:I

    .line 329
    .line 330
    if-lt v2, v4, :cond_2

    .line 331
    .line 332
    iget-object v2, v7, Lh80;->f:Ljava/lang/String;

    .line 333
    .line 334
    const-string v4, "[0-9a-f]{8}"

    .line 335
    .line 336
    invoke-virtual {v2, v4}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    .line 337
    .line 338
    .line 339
    move-result v2

    .line 340
    if-eqz v2, :cond_2

    .line 341
    .line 342
    iget-object v2, v7, Lh80;->i:Ljava/io/Serializable;

    .line 343
    .line 344
    check-cast v2, Ljava/lang/String;

    .line 345
    .line 346
    const-string v4, "[0-9a-f]{64}"

    .line 347
    .line 348
    invoke-virtual {v2, v4}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    .line 349
    .line 350
    .line 351
    move-result v2

    .line 352
    if-eqz v2, :cond_2

    .line 353
    .line 354
    iget-wide v4, v7, Lh80;->g:J

    .line 355
    .line 356
    cmp-long v0, v4, v0

    .line 357
    .line 358
    if-lez v0, :cond_2

    .line 359
    .line 360
    const-wide/32 v0, 0x4000000

    .line 361
    .line 362
    .line 363
    cmp-long v0, v4, v0

    .line 364
    .line 365
    if-gtz v0, :cond_2

    .line 366
    .line 367
    iget-object v0, v7, Lh80;->h:Ljava/io/Serializable;

    .line 368
    .line 369
    check-cast v0, Ljava/lang/String;

    .line 370
    .line 371
    new-instance v1, Ljava/lang/StringBuilder;

    .line 372
    .line 373
    const-string v2, "lib/arm64-v8a/libnuke_engine_"

    .line 374
    .line 375
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 376
    .line 377
    .line 378
    invoke-virtual {v1, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 379
    .line 380
    .line 381
    const-string v2, "_[0-9a-f]{12}\\.so"

    .line 382
    .line 383
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 384
    .line 385
    .line 386
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object v1

    .line 390
    invoke-virtual {v0, v1}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    .line 391
    .line 392
    .line 393
    move-result v0

    .line 394
    if-eqz v0, :cond_2

    .line 395
    .line 396
    return-object v7

    .line 397
    :cond_2
    const-string v0, "Native release manifest fields are invalid"

    .line 398
    .line 399
    invoke-static {v0}, Lc80;->x(Ljava/lang/String;)V

    .line 400
    .line 401
    .line 402
    return-object v3

    .line 403
    :cond_3
    const-string v0, "Native release manifest signature mismatch"

    .line 404
    .line 405
    invoke-static {v0}, Lc80;->x(Ljava/lang/String;)V

    .line 406
    .line 407
    .line 408
    return-object v3

    .line 409
    :cond_4
    const-string v0, "Native release certificate subject mismatch"

    .line 410
    .line 411
    invoke-static {v0}, Lc80;->x(Ljava/lang/String;)V

    .line 412
    .line 413
    .line 414
    return-object v3

    .line 415
    :cond_5
    const-string v0, "Native release payload size is invalid"

    .line 416
    .line 417
    invoke-static {v0}, Lc80;->x(Ljava/lang/String;)V

    .line 418
    .line 419
    .line 420
    return-object v3

    .line 421
    :cond_6
    const-string v0, "Native release envelope version is unsupported"

    .line 422
    .line 423
    invoke-static {v0}, Lc80;->x(Ljava/lang/String;)V

    .line 424
    .line 425
    .line 426
    return-object v3
.end method
