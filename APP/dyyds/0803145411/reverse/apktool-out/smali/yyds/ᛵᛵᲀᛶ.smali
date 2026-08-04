.class public final Lyyds/ᛵᛵᲀᛶ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public ᛲᛴᛳᛲ:[B

.field public ᛶᛷᛲᲁ:I

.field public final ᲀᛲᛳᲀ:Ljava/io/FileInputStream;

.field public ᲇᲇᲇᛱ:I

.field public final ᲇᲈᛵᛷ:Ljava/nio/charset/Charset;


# direct methods
.method public constructor <init>(Ljava/io/FileInputStream;Ljava/nio/charset/Charset;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-eqz p2, :cond_1

    .line 6
    .line 7
    sget-object v1, Lyyds/ᲁᛲᛳᛸ;->ᛲᲈᲁ:Ljava/nio/charset/Charset;

    .line 8
    .line 9
    invoke-virtual {p2, v1}, Ljava/nio/charset/Charset;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    iput-object p1, p0, Lyyds/ᛵᛵᲀᛶ;->ᲀᛲᛳᲀ:Ljava/io/FileInputStream;

    .line 16
    .line 17
    iput-object p2, p0, Lyyds/ᛵᛵᲀᛶ;->ᲇᲈᛵᛷ:Ljava/nio/charset/Charset;

    .line 18
    .line 19
    const/16 p1, 0x2000

    .line 20
    .line 21
    new-array p1, p1, [B

    .line 22
    .line 23
    iput-object p1, p0, Lyyds/ᛵᛵᲀᛶ;->ᛲᛴᛳᛲ:[B

    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    const-string p0, "Unsupported encoding"

    .line 27
    .line 28
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw v0

    .line 32
    :cond_1
    throw v0
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 1
    iget-object v0, p0, Lyyds/ᛵᛵᲀᛶ;->ᲀᛲᛳᲀ:Ljava/io/FileInputStream;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lyyds/ᛵᛵᲀᛶ;->ᛲᛴᛳᛲ:[B

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    iput-object v1, p0, Lyyds/ᛵᛵᲀᛶ;->ᛲᛴᛳᛲ:[B

    .line 10
    .line 11
    iget-object p0, p0, Lyyds/ᛵᛵᲀᛶ;->ᲀᛲᛳᲀ:Ljava/io/FileInputStream;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception p0

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    :goto_0
    monitor-exit v0

    .line 20
    return-void

    .line 21
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    throw p0
.end method

.method public final ᛲᲈᲁ()Ljava/lang/String;
    .locals 8

    .line 1
    iget-object v0, p0, Lyyds/ᛵᛵᲀᛶ;->ᲀᛲᛳᲀ:Ljava/io/FileInputStream;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lyyds/ᛵᛵᲀᛶ;->ᛲᛴᛳᛲ:[B

    .line 5
    .line 6
    if-eqz v1, :cond_9

    .line 7
    .line 8
    iget v2, p0, Lyyds/ᛵᛵᲀᛶ;->ᲇᲇᲇᛱ:I

    .line 9
    .line 10
    iget v3, p0, Lyyds/ᛵᛵᲀᛶ;->ᛶᛷᛲᲁ:I

    .line 11
    .line 12
    const/4 v4, 0x0

    .line 13
    const/4 v5, -0x1

    .line 14
    if-lt v2, v3, :cond_1

    .line 15
    .line 16
    iget-object v2, p0, Lyyds/ᛵᛵᲀᛶ;->ᲀᛲᛳᲀ:Ljava/io/FileInputStream;

    .line 17
    .line 18
    array-length v3, v1

    .line 19
    invoke-virtual {v2, v1, v4, v3}, Ljava/io/InputStream;->read([BII)I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eq v1, v5, :cond_0

    .line 24
    .line 25
    iput v4, p0, Lyyds/ᛵᛵᲀᛶ;->ᲇᲇᲇᛱ:I

    .line 26
    .line 27
    iput v1, p0, Lyyds/ᛵᛵᲀᛶ;->ᛶᛷᛲᲁ:I

    .line 28
    .line 29
    move v2, v4

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    new-instance p0, Ljava/io/EOFException;

    .line 32
    .line 33
    invoke-direct {p0}, Ljava/io/EOFException;-><init>()V

    .line 34
    .line 35
    .line 36
    throw p0

    .line 37
    :cond_1
    :goto_0
    iget v1, p0, Lyyds/ᛵᛵᲀᛶ;->ᛶᛷᛲᲁ:I

    .line 38
    .line 39
    const/16 v3, 0xa

    .line 40
    .line 41
    if-eq v2, v1, :cond_4

    .line 42
    .line 43
    iget-object v1, p0, Lyyds/ᛵᛵᲀᛶ;->ᛲᛴᛳᛲ:[B

    .line 44
    .line 45
    aget-byte v6, v1, v2

    .line 46
    .line 47
    if-ne v6, v3, :cond_3

    .line 48
    .line 49
    iget v3, p0, Lyyds/ᛵᛵᲀᛶ;->ᲇᲇᲇᛱ:I

    .line 50
    .line 51
    if-eq v2, v3, :cond_2

    .line 52
    .line 53
    add-int/lit8 v4, v2, -0x1

    .line 54
    .line 55
    aget-byte v5, v1, v4

    .line 56
    .line 57
    const/16 v6, 0xd

    .line 58
    .line 59
    if-ne v5, v6, :cond_2

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :catchall_0
    move-exception p0

    .line 63
    goto :goto_3

    .line 64
    :cond_2
    move v4, v2

    .line 65
    :goto_1
    new-instance v5, Ljava/lang/String;

    .line 66
    .line 67
    sub-int/2addr v4, v3

    .line 68
    iget-object v6, p0, Lyyds/ᛵᛵᲀᛶ;->ᲇᲈᛵᛷ:Ljava/nio/charset/Charset;

    .line 69
    .line 70
    invoke-virtual {v6}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    invoke-direct {v5, v1, v3, v4, v6}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    .line 75
    .line 76
    .line 77
    add-int/lit8 v2, v2, 0x1

    .line 78
    .line 79
    iput v2, p0, Lyyds/ᛵᛵᲀᛶ;->ᲇᲇᲇᛱ:I

    .line 80
    .line 81
    monitor-exit v0

    .line 82
    return-object v5

    .line 83
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_4
    new-instance v1, Lyyds/ᛴᛶᛸᲇ;

    .line 87
    .line 88
    iget v2, p0, Lyyds/ᛵᛵᲀᛶ;->ᛶᛷᛲᲁ:I

    .line 89
    .line 90
    iget v6, p0, Lyyds/ᛵᛵᲀᛶ;->ᲇᲇᲇᛱ:I

    .line 91
    .line 92
    sub-int/2addr v2, v6

    .line 93
    add-int/lit8 v2, v2, 0x50

    .line 94
    .line 95
    invoke-direct {v1, p0, v2}, Lyyds/ᛴᛶᛸᲇ;-><init>(Lyyds/ᛵᛵᲀᛶ;I)V

    .line 96
    .line 97
    .line 98
    :cond_5
    iget-object v2, p0, Lyyds/ᛵᛵᲀᛶ;->ᛲᛴᛳᛲ:[B

    .line 99
    .line 100
    iget v6, p0, Lyyds/ᛵᛵᲀᛶ;->ᲇᲇᲇᛱ:I

    .line 101
    .line 102
    iget v7, p0, Lyyds/ᛵᛵᲀᛶ;->ᛶᛷᛲᲁ:I

    .line 103
    .line 104
    sub-int/2addr v7, v6

    .line 105
    invoke-virtual {v1, v2, v6, v7}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 106
    .line 107
    .line 108
    iput v5, p0, Lyyds/ᛵᛵᲀᛶ;->ᛶᛷᛲᲁ:I

    .line 109
    .line 110
    iget-object v2, p0, Lyyds/ᛵᛵᲀᛶ;->ᲀᛲᛳᲀ:Ljava/io/FileInputStream;

    .line 111
    .line 112
    iget-object v6, p0, Lyyds/ᛵᛵᲀᛶ;->ᛲᛴᛳᛲ:[B

    .line 113
    .line 114
    array-length v7, v6

    .line 115
    invoke-virtual {v2, v6, v4, v7}, Ljava/io/InputStream;->read([BII)I

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    if-eq v2, v5, :cond_8

    .line 120
    .line 121
    iput v4, p0, Lyyds/ᛵᛵᲀᛶ;->ᲇᲇᲇᛱ:I

    .line 122
    .line 123
    iput v2, p0, Lyyds/ᛵᛵᲀᛶ;->ᛶᛷᛲᲁ:I

    .line 124
    .line 125
    move v2, v4

    .line 126
    :goto_2
    iget v6, p0, Lyyds/ᛵᛵᲀᛶ;->ᛶᛷᛲᲁ:I

    .line 127
    .line 128
    if-eq v2, v6, :cond_5

    .line 129
    .line 130
    iget-object v6, p0, Lyyds/ᛵᛵᲀᛶ;->ᛲᛴᛳᛲ:[B

    .line 131
    .line 132
    aget-byte v7, v6, v2

    .line 133
    .line 134
    if-ne v7, v3, :cond_7

    .line 135
    .line 136
    iget v3, p0, Lyyds/ᛵᛵᲀᛶ;->ᲇᲇᲇᛱ:I

    .line 137
    .line 138
    if-eq v2, v3, :cond_6

    .line 139
    .line 140
    sub-int v4, v2, v3

    .line 141
    .line 142
    invoke-virtual {v1, v6, v3, v4}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 143
    .line 144
    .line 145
    :cond_6
    add-int/lit8 v2, v2, 0x1

    .line 146
    .line 147
    iput v2, p0, Lyyds/ᛵᛵᲀᛶ;->ᲇᲇᲇᛱ:I

    .line 148
    .line 149
    invoke-virtual {v1}, Lyyds/ᛴᛶᛸᲇ;->toString()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    monitor-exit v0

    .line 154
    return-object p0

    .line 155
    :cond_7
    add-int/lit8 v2, v2, 0x1

    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_8
    new-instance p0, Ljava/io/EOFException;

    .line 159
    .line 160
    invoke-direct {p0}, Ljava/io/EOFException;-><init>()V

    .line 161
    .line 162
    .line 163
    throw p0

    .line 164
    :cond_9
    new-instance p0, Ljava/io/IOException;

    .line 165
    .line 166
    const-string v1, "LineReader is closed"

    .line 167
    .line 168
    invoke-direct {p0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    throw p0

    .line 172
    :goto_3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 173
    throw p0
.end method
