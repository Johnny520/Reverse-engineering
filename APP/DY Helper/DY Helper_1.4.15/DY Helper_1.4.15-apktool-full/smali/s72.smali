.class public abstract Ls72;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "https://ghproxy.net/"

    .line 2
    .line 3
    const-string v1, "https://gh.jasonzeng.dev/"

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sput-object v0, Ls72;->α:Ljava/util/List;

    .line 14
    .line 15
    return-void
.end method

.method public static α(Ljava/lang/String;Ljava/io/OutputStream;Lzd;)Lr72;
    .locals 12

    .line 1
    sget-object v0, Lwx;->α:Lt41;

    .line 2
    .line 3
    new-instance v0, Ll91;

    .line 4
    .line 5
    const-string v1, "Cache-Control"

    .line 6
    .line 7
    const-string v2, "no-cache"

    .line 8
    .line 9
    invoke-direct {v0, v1, v2}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, Lex0;->Λ(Ll91;)Ljava/util/Map;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v1, "*/*"

    .line 17
    .line 18
    const/16 v2, 0xc

    .line 19
    .line 20
    invoke-static {p0, v0, v1, v2}, Lwx;->ζ(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;I)Lvx;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    iget-object v4, v1, Lvx;->β:Ljava/lang/String;

    .line 25
    .line 26
    iget-wide v5, v1, Lvx;->ζ:J

    .line 27
    .line 28
    :try_start_0
    iget-object v0, v1, Lvx;->δ:Ljava/io/BufferedInputStream;

    .line 29
    .line 30
    const v2, 0x8000

    .line 31
    .line 32
    .line 33
    new-array v2, v2, [B

    .line 34
    .line 35
    invoke-virtual {v0, v2}, Ljava/io/InputStream;->read([B)I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-ltz v3, :cond_2

    .line 40
    .line 41
    const/4 v7, 0x2

    .line 42
    if-lt v3, v7, :cond_1

    .line 43
    .line 44
    const/4 v7, 0x0

    .line 45
    aget-byte v8, v2, v7

    .line 46
    .line 47
    const/16 v9, 0x50

    .line 48
    .line 49
    if-ne v8, v9, :cond_1

    .line 50
    .line 51
    const/4 v8, 0x1

    .line 52
    aget-byte v8, v2, v8

    .line 53
    .line 54
    const/16 v9, 0x4b

    .line 55
    .line 56
    if-ne v8, v9, :cond_1

    .line 57
    .line 58
    invoke-virtual {p1, v2, v7, v3}, Ljava/io/OutputStream;->write([BII)V

    .line 59
    .line 60
    .line 61
    int-to-long v8, v3

    .line 62
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 67
    .line 68
    .line 69
    move-result-object v10

    .line 70
    invoke-virtual {p2, v3, v10, v4}, Lzd;->α(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    :goto_0
    invoke-virtual {v0, v2}, Ljava/io/InputStream;->read([B)I

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    if-ltz v3, :cond_0

    .line 78
    .line 79
    invoke-virtual {p1, v2, v7, v3}, Ljava/io/OutputStream;->write([BII)V

    .line 80
    .line 81
    .line 82
    int-to-long v10, v3

    .line 83
    add-long/2addr v8, v10

    .line 84
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 89
    .line 90
    .line 91
    move-result-object v10

    .line 92
    invoke-virtual {p2, v3, v10, v4}, Lzd;->α(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 93
    .line 94
    .line 95
    goto :goto_0

    .line 96
    :catchall_0
    move-exception v0

    .line 97
    move-object p0, v0

    .line 98
    goto :goto_1

    .line 99
    :cond_0
    invoke-virtual {v1}, Lvx;->α()V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V

    .line 103
    .line 104
    .line 105
    new-instance v2, Lr72;

    .line 106
    .line 107
    move-object v3, p0

    .line 108
    move-wide v7, v8

    .line 109
    invoke-direct/range {v2 .. v8}, Lr72;-><init>(Ljava/lang/String;Ljava/lang/String;JJ)V

    .line 110
    .line 111
    .line 112
    return-object v2

    .line 113
    :cond_1
    :try_start_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 114
    .line 115
    const-string p1, "\u4e0b\u8f7d\u5185\u5bb9\u4e0d\u662fAPK\u6587\u4ef6"

    .line 116
    .line 117
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    throw p0

    .line 121
    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 122
    .line 123
    const-string p1, "\u4e0b\u8f7d\u5185\u5bb9\u4e3a\u7a7a"

    .line 124
    .line 125
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 129
    :goto_1
    invoke-virtual {v1}, Lvx;->α()V

    .line 130
    .line 131
    .line 132
    throw p0
.end method

.method public static β(Ljava/lang/String;Lz61;Lzd;)V
    .locals 6

    .line 1
    const-string v0, "r5cb9c9b314235f5"

    .line 2
    .line 3
    const-string v1, "download success url="

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-nez v2, :cond_1

    .line 21
    .line 22
    const/4 v2, 0x4

    .line 23
    const/4 v3, 0x0

    .line 24
    :try_start_0
    invoke-virtual {p1}, Lz61;->invoke()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, Ljava/io/Closeable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    :try_start_1
    move-object v4, p1

    .line 31
    check-cast v4, Ljava/io/OutputStream;

    .line 32
    .line 33
    invoke-static {p0, v4, p2}, Ls72;->α(Ljava/lang/String;Ljava/io/OutputStream;Lzd;)Lr72;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    iget-wide v4, p2, Lr72;->γ:J

    .line 38
    .line 39
    new-instance p2, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v1, " total="

    .line 48
    .line 49
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    invoke-static {v0, p2, v3, v2, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 60
    .line 61
    .line 62
    :try_start_2
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :catchall_0
    move-exception p1

    .line 67
    goto :goto_0

    .line 68
    :catchall_1
    move-exception p2

    .line 69
    :try_start_3
    throw p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 70
    :catchall_2
    move-exception v1

    .line 71
    :try_start_4
    invoke-static {p1, p2}, Lxb;->λ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 72
    .line 73
    .line 74
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 75
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    const-string v1, "download failed url="

    .line 80
    .line 81
    const-string v4, " msg="

    .line 82
    .line 83
    invoke-static {v1, p0, v4, p2}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    invoke-static {v0, p0, v3, v2, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    if-eqz p0, :cond_0

    .line 95
    .line 96
    const-string p1, "\u4e0b\u8f7d\u5931\u8d25\uff1a"

    .line 97
    .line 98
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    goto :goto_1

    .line 103
    :cond_0
    const-string p0, "\u4e0b\u8f7d\u5931\u8d25"

    .line 104
    .line 105
    :goto_1
    new-instance p1, Luw1;

    .line 106
    .line 107
    invoke-direct {p1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    throw p1

    .line 111
    :cond_1
    new-instance p0, Luw1;

    .line 112
    .line 113
    const-string p1, "\u4e0b\u8f7d\u94fe\u63a5\u4e3a\u7a7a"

    .line 114
    .line 115
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    throw p0
.end method

.method public static γ(ILjava/util/List;)Ljava/lang/String;
    .locals 12

    .line 1
    const-string v0, "r5cb9c9b314235f5"

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const/4 v3, 0x1

    .line 20
    if-eqz v2, :cond_5

    .line 21
    .line 22
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-static {v2}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-static {v2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    if-eqz v4, :cond_0

    .line 44
    .line 45
    sget-object v2, Ljz;->ε:Ljz;

    .line 46
    .line 47
    goto :goto_4

    .line 48
    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 51
    .line 52
    .line 53
    sget-object v5, Ls72;->α:Ljava/util/List;

    .line 54
    .line 55
    if-eqz v5, :cond_1

    .line 56
    .line 57
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    if-eqz v6, :cond_1

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_1
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    :cond_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result v7

    .line 72
    if-eqz v7, :cond_3

    .line 73
    .line 74
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v7

    .line 78
    check-cast v7, Ljava/lang/String;

    .line 79
    .line 80
    invoke-static {v2, v7, v3}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 81
    .line 82
    .line 83
    move-result v7

    .line 84
    if-eqz v7, :cond_2

    .line 85
    .line 86
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_3
    :goto_1
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 98
    .line 99
    .line 100
    move-result v5

    .line 101
    if-eqz v5, :cond_4

    .line 102
    .line 103
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    check-cast v5, Ljava/lang/String;

    .line 108
    .line 109
    new-instance v6, Ljava/lang/StringBuilder;

    .line 110
    .line 111
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v5

    .line 124
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_4
    :goto_3
    invoke-static {v4}, Lxh;->ｉ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    invoke-static {v2}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    :goto_4
    invoke-static {v1, v2}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 137
    .line 138
    .line 139
    goto :goto_0

    .line 140
    :cond_5
    invoke-static {v1}, Lxh;->ｉ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    invoke-static {p1}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    const-string v1, ""

    .line 149
    .line 150
    if-gt v3, p0, :cond_9

    .line 151
    .line 152
    :goto_5
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    const/4 v4, 0x0

    .line 157
    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 158
    .line 159
    .line 160
    move-result v5

    .line 161
    if-eqz v5, :cond_7

    .line 162
    .line 163
    add-int/lit8 v5, v4, 0x1

    .line 164
    .line 165
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v6

    .line 169
    check-cast v6, Ljava/lang/String;

    .line 170
    .line 171
    const/4 v7, 0x4

    .line 172
    const/4 v8, 0x0

    .line 173
    :try_start_0
    sget-object v9, Lwx;->α:Lt41;

    .line 174
    .line 175
    const-string v9, "Cache-Control"

    .line 176
    .line 177
    const-string v10, "no-cache"

    .line 178
    .line 179
    new-instance v11, Ll91;

    .line 180
    .line 181
    invoke-direct {v11, v9, v10}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    invoke-static {v11}, Lex0;->Λ(Ll91;)Ljava/util/Map;

    .line 185
    .line 186
    .line 187
    move-result-object v9

    .line 188
    invoke-static {v6, v9}, Lwx;->β(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v9

    .line 192
    invoke-static {v9}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 193
    .line 194
    .line 195
    move-result-object v9

    .line 196
    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 200
    goto :goto_7

    .line 201
    :catchall_0
    move-exception v9

    .line 202
    invoke-virtual {v9}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v9

    .line 206
    const-string v10, "fetch json failed url="

    .line 207
    .line 208
    const-string v11, " msg="

    .line 209
    .line 210
    invoke-static {v10, v6, v11, v9}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v6

    .line 214
    invoke-static {v0, v6, v8, v7, v8}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    move-object v6, v1

    .line 218
    :goto_7
    invoke-static {v6}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 219
    .line 220
    .line 221
    move-result v9

    .line 222
    if-nez v9, :cond_6

    .line 223
    .line 224
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 225
    .line 226
    .line 227
    move-result p0

    .line 228
    const-string p1, " attempt="

    .line 229
    .line 230
    const-string v1, " length="

    .line 231
    .line 232
    const-string v2, "json fetched urlIndex="

    .line 233
    .line 234
    invoke-static {v2, v4, p1, v3, v1}, Lnx;->ο(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    move-result-object p1

    .line 238
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object p0

    .line 245
    invoke-static {v0, p0, v8, v7, v8}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 246
    .line 247
    .line 248
    return-object v6

    .line 249
    :cond_6
    move v4, v5

    .line 250
    goto :goto_6

    .line 251
    :cond_7
    if-ge v3, p0, :cond_8

    .line 252
    .line 253
    const-wide/16 v4, 0x1388

    .line 254
    .line 255
    :try_start_1
    invoke-static {v4, v5}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 256
    .line 257
    .line 258
    :catchall_1
    :cond_8
    if-eq v3, p0, :cond_9

    .line 259
    .line 260
    add-int/lit8 v3, v3, 0x1

    .line 261
    .line 262
    goto :goto_5

    .line 263
    :cond_9
    return-object v1
.end method
