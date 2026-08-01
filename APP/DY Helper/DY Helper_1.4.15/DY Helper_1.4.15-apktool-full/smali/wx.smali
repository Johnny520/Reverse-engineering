.class public final Lwx;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Lt41;

.field public static final β:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Ls41;

    .line 2
    .line 3
    invoke-direct {v0}, Ls41;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    const-wide/16 v1, 0xf

    .line 12
    .line 13
    invoke-static {v1, v2}, Lud2;->β(J)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    iput v1, v0, Ls41;->τ:I

    .line 18
    .line 19
    const-wide/16 v1, 0x1e

    .line 20
    .line 21
    invoke-static {v1, v2}, Lud2;->β(J)I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    iput v1, v0, Ls41;->υ:I

    .line 26
    .line 27
    const/4 v1, 0x1

    .line 28
    iput-boolean v1, v0, Ls41;->ι:Z

    .line 29
    .line 30
    iput-boolean v1, v0, Ls41;->κ:Z

    .line 31
    .line 32
    iput-boolean v1, v0, Ls41;->ζ:Z

    .line 33
    .line 34
    new-instance v1, Lt41;

    .line 35
    .line 36
    invoke-direct {v1, v0}, Lt41;-><init>(Ls41;)V

    .line 37
    .line 38
    .line 39
    sput-object v1, Lwx;->α:Lt41;

    .line 40
    .line 41
    const-string v7, "range"

    .line 42
    .line 43
    const-string v8, "if-range"

    .line 44
    .line 45
    const-string v2, "host"

    .line 46
    .line 47
    const-string v3, "content-length"

    .line 48
    .line 49
    const-string v4, "content-type"

    .line 50
    .line 51
    const-string v5, "transfer-encoding"

    .line 52
    .line 53
    const-string v6, "connection"

    .line 54
    .line 55
    filled-new-array/range {v2 .. v8}, [Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-static {v0}, Lg7;->о([Ljava/lang/Object;)Ljava/util/Set;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    sput-object v0, Lwx;->β:Ljava/util/Set;

    .line 64
    .line 65
    return-void
.end method

.method public static α(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;I)[B
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/16 v0, 0xc

    .line 5
    .line 6
    invoke-static {p0, p1, p2, v0}, Lwx;->ζ(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;I)Lvx;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :try_start_0
    new-instance p1, Ljava/io/ByteArrayOutputStream;

    .line 11
    .line 12
    invoke-direct {p1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 13
    .line 14
    .line 15
    const/16 p2, 0x4000

    .line 16
    .line 17
    new-array v0, p2, [B

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    move v2, v1

    .line 21
    :goto_0
    if-ge v2, p3, :cond_0

    .line 22
    .line 23
    sub-int v3, p3, v2

    .line 24
    .line 25
    invoke-static {p2, v3}, Ljava/lang/Math;->min(II)I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    iget-object v4, p0, Lvx;->δ:Ljava/io/BufferedInputStream;

    .line 30
    .line 31
    invoke-virtual {v4, v0, v1, v3}, Ljava/io/BufferedInputStream;->read([BII)I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-lez v3, :cond_0

    .line 36
    .line 37
    invoke-virtual {p1, v0, v1, v3}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 38
    .line 39
    .line 40
    add-int/2addr v2, v3

    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception p1

    .line 43
    goto :goto_1

    .line 44
    :cond_0
    invoke-virtual {p1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Lvx;->α()V

    .line 52
    .line 53
    .line 54
    return-object p1

    .line 55
    :goto_1
    invoke-virtual {p0}, Lvx;->α()V

    .line 56
    .line 57
    .line 58
    throw p1
.end method

.method public static β(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/String;

    .line 5
    .line 6
    const-string v1, "application/json"

    .line 7
    .line 8
    const/high16 v2, 0x200000

    .line 9
    .line 10
    invoke-static {p0, p1, v1, v2}, Lwx;->α(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;I)[B

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    sget-object p1, Lmf;->α:Ljava/nio/charset/Charset;

    .line 15
    .line 16
    invoke-direct {v0, p0, p1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method public static γ(Ljava/util/LinkedHashMap;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Iterable;

    .line 6
    .line 7
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    move-object v2, v0

    .line 23
    check-cast v2, Ljava/util/Map$Entry;

    .line 24
    .line 25
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    check-cast v3, Ljava/lang/String;

    .line 30
    .line 31
    invoke-static {v3, p1}, Lx02;->Κ(Ljava/lang/String;Ljava/lang/String;)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_0

    .line 36
    .line 37
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    check-cast v2, Ljava/lang/CharSequence;

    .line 42
    .line 43
    invoke-static {v2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-nez v2, :cond_0

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    move-object v0, v1

    .line 51
    :goto_0
    check-cast v0, Ljava/util/Map$Entry;

    .line 52
    .line 53
    if-eqz v0, :cond_2

    .line 54
    .line 55
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    check-cast p0, Ljava/lang/String;

    .line 60
    .line 61
    return-object p0

    .line 62
    :cond_2
    return-object v1
.end method

.method public static final δ(Ljava/util/LinkedHashMap;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-static {p1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_4

    .line 6
    .line 7
    invoke-static {p2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    check-cast v0, Ljava/lang/Iterable;

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    move-object v2, v1

    .line 38
    check-cast v2, Ljava/lang/String;

    .line 39
    .line 40
    invoke-static {v2, p1}, Lx02;->Κ(Ljava/lang/String;Ljava/lang/String;)Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-eqz v2, :cond_1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    const/4 v1, 0x0

    .line 48
    :goto_0
    check-cast v1, Ljava/lang/String;

    .line 49
    .line 50
    if-eqz v1, :cond_3

    .line 51
    .line 52
    invoke-virtual {p0, v1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    :cond_3
    invoke-interface {p0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    :cond_4
    :goto_1
    return-void
.end method

.method public static ε(Ljava/lang/String;Ljava/util/Map;ZLjava/lang/String;)Lvx;
    .locals 14

    .line 1
    const-string v1, "DYHelper"

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    const/4 v0, 0x0

    .line 21
    const-string v2, "//"

    .line 22
    .line 23
    invoke-static {p0, v2, v0}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    const-string v0, "https:"

    .line 30
    .line 31
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    :cond_0
    const-string v0, "&amp;"

    .line 36
    .line 37
    const-string v2, "&"

    .line 38
    .line 39
    invoke-static {p0, v0, v2}, Lx02;->Ν(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    if-eqz p2, :cond_1

    .line 44
    .line 45
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 46
    .line 47
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 48
    .line 49
    filled-new-array {p0, v0}, [Ljava/lang/Boolean;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-static {p0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    goto :goto_0

    .line 58
    :cond_1
    invoke-static/range {p2 .. p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-static {p0}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    const/4 v3, 0x0

    .line 71
    const/4 v0, -0x1

    .line 72
    move-object v5, v3

    .line 73
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result v6

    .line 77
    const-string v7, " "

    .line 78
    .line 79
    const-string v8, "HTTP "

    .line 80
    .line 81
    const-string v9, ""

    .line 82
    .line 83
    if-eqz v6, :cond_16

    .line 84
    .line 85
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    check-cast v0, Ljava/lang/Boolean;

    .line 90
    .line 91
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 92
    .line 93
    .line 94
    move-result v5

    .line 95
    :try_start_0
    invoke-static {v4}, Lf31;->ν(Ljava/lang/String;)Ljava/util/Map;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    new-instance v6, Ljava/util/LinkedHashMap;

    .line 100
    .line 101
    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    .line 102
    .line 103
    .line 104
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    :cond_2
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 113
    .line 114
    .line 115
    move-result v10

    .line 116
    if-eqz v10, :cond_3

    .line 117
    .line 118
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v10

    .line 122
    check-cast v10, Ljava/util/Map$Entry;

    .line 123
    .line 124
    invoke-interface {v10}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v11

    .line 128
    check-cast v11, Ljava/lang/CharSequence;

    .line 129
    .line 130
    invoke-static {v11}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 131
    .line 132
    .line 133
    move-result v11

    .line 134
    if-nez v11, :cond_2

    .line 135
    .line 136
    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v11

    .line 140
    check-cast v11, Ljava/lang/CharSequence;

    .line 141
    .line 142
    invoke-static {v11}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 143
    .line 144
    .line 145
    move-result v11

    .line 146
    if-nez v11, :cond_2

    .line 147
    .line 148
    invoke-interface {v10}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v11

    .line 152
    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v10

    .line 156
    invoke-interface {v6, v11, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 157
    .line 158
    .line 159
    goto :goto_2

    .line 160
    :catchall_0
    move-exception v0

    .line 161
    const-string v6, "\u83b7\u53d6 OkHttp \u4e0b\u8f7d Header \u5931\u8d25"

    .line 162
    .line 163
    invoke-static {v1, v6, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 164
    .line 165
    .line 166
    sget-object v6, Lkz;->ε:Lkz;

    .line 167
    .line 168
    :cond_3
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 169
    .line 170
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 171
    .line 172
    .line 173
    invoke-interface {v6}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 174
    .line 175
    .line 176
    move-result-object v6

    .line 177
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 178
    .line 179
    .line 180
    move-result-object v6

    .line 181
    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 182
    .line 183
    .line 184
    move-result v10

    .line 185
    if-eqz v10, :cond_4

    .line 186
    .line 187
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v10

    .line 191
    check-cast v10, Ljava/util/Map$Entry;

    .line 192
    .line 193
    invoke-interface {v10}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v11

    .line 197
    check-cast v11, Ljava/lang/String;

    .line 198
    .line 199
    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v10

    .line 203
    check-cast v10, Ljava/lang/String;

    .line 204
    .line 205
    invoke-static {v0, v11, v10}, Lwx;->δ(Ljava/util/LinkedHashMap;Ljava/lang/String;Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    goto :goto_3

    .line 209
    :cond_4
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 210
    .line 211
    .line 212
    move-result-object v6

    .line 213
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 214
    .line 215
    .line 216
    move-result-object v6

    .line 217
    :goto_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 218
    .line 219
    .line 220
    move-result v10

    .line 221
    if-eqz v10, :cond_5

    .line 222
    .line 223
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v10

    .line 227
    check-cast v10, Ljava/util/Map$Entry;

    .line 228
    .line 229
    invoke-interface {v10}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v11

    .line 233
    check-cast v11, Ljava/lang/String;

    .line 234
    .line 235
    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v10

    .line 239
    check-cast v10, Ljava/lang/String;

    .line 240
    .line 241
    invoke-static {v0, v11, v10}, Lwx;->δ(Ljava/util/LinkedHashMap;Ljava/lang/String;Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    goto :goto_4

    .line 245
    :cond_5
    new-instance v6, Lb8;

    .line 246
    .line 247
    const/4 v10, 0x6

    .line 248
    invoke-direct {v6, v10}, Lb8;-><init>(I)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v6, v4}, Lb8;->π(Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    const-string v10, "GET"

    .line 255
    .line 256
    invoke-virtual {v6, v10, v3}, Lb8;->μ(Ljava/lang/String;Lkn1;)V

    .line 257
    .line 258
    .line 259
    const-string v10, "User-Agent"

    .line 260
    .line 261
    invoke-static {v0, v10}, Lwx;->γ(Ljava/util/LinkedHashMap;Ljava/lang/String;)Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v11

    .line 265
    if-nez v11, :cond_6

    .line 266
    .line 267
    const-string v11, "Mozilla/5.0 (Linux; Android 14) AppleWebKit/537.36 (KHTML, like Gecko) Mobile Safari/537.36"

    .line 268
    .line 269
    :cond_6
    invoke-virtual {v6, v10, v11}, Lb8;->ι(Ljava/lang/String;Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    const-string v10, "Accept"

    .line 273
    .line 274
    invoke-static {v0, v10}, Lwx;->γ(Ljava/util/LinkedHashMap;Ljava/lang/String;)Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v11

    .line 278
    if-nez v11, :cond_7

    .line 279
    .line 280
    move-object/from16 v11, p3

    .line 281
    .line 282
    :cond_7
    invoke-virtual {v6, v10, v11}, Lb8;->ι(Ljava/lang/String;Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    const-string v10, "Accept-Encoding"

    .line 286
    .line 287
    const-string v11, "identity"

    .line 288
    .line 289
    invoke-virtual {v6, v10, v11}, Lb8;->ι(Ljava/lang/String;Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    const-string v10, "Accept-Language"

    .line 293
    .line 294
    invoke-static {v0, v10}, Lwx;->γ(Ljava/util/LinkedHashMap;Ljava/lang/String;)Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v11

    .line 298
    if-nez v11, :cond_8

    .line 299
    .line 300
    const-string v11, "zh-CN,zh;q=0.9,en;q=0.8"

    .line 301
    .line 302
    :cond_8
    invoke-virtual {v6, v10, v11}, Lb8;->ι(Ljava/lang/String;Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    const-string v10, "Referer"

    .line 306
    .line 307
    invoke-static {v0, v10}, Lwx;->γ(Ljava/util/LinkedHashMap;Ljava/lang/String;)Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v11

    .line 311
    if-nez v11, :cond_9

    .line 312
    .line 313
    const-string v11, "https://www.douyin.com/"

    .line 314
    .line 315
    :cond_9
    invoke-virtual {v6, v10, v11}, Lb8;->ι(Ljava/lang/String;Ljava/lang/String;)V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    :catchall_1
    :cond_a
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 327
    .line 328
    .line 329
    move-result v10

    .line 330
    if-eqz v10, :cond_c

    .line 331
    .line 332
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v10

    .line 336
    check-cast v10, Ljava/util/Map$Entry;

    .line 337
    .line 338
    invoke-interface {v10}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v11

    .line 342
    check-cast v11, Ljava/lang/String;

    .line 343
    .line 344
    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object v10

    .line 348
    check-cast v10, Ljava/lang/String;

    .line 349
    .line 350
    sget-object v12, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 351
    .line 352
    invoke-static {v12, v11, v12}, Lnx;->ν(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object v12

    .line 356
    sget-object v13, Lwx;->β:Ljava/util/Set;

    .line 357
    .line 358
    invoke-interface {v13, v12}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 359
    .line 360
    .line 361
    move-result v13

    .line 362
    if-nez v13, :cond_a

    .line 363
    .line 364
    invoke-virtual {v12}, Ljava/lang/String;->hashCode()I

    .line 365
    .line 366
    .line 367
    move-result v13

    .line 368
    sparse-switch v13, :sswitch_data_0

    .line 369
    .line 370
    .line 371
    goto :goto_6

    .line 372
    :sswitch_0
    const-string v13, "referer"

    .line 373
    .line 374
    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 375
    .line 376
    .line 377
    move-result v12

    .line 378
    if-nez v12, :cond_a

    .line 379
    .line 380
    goto :goto_6

    .line 381
    :sswitch_1
    const-string v13, "accept-language"

    .line 382
    .line 383
    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 384
    .line 385
    .line 386
    move-result v12

    .line 387
    if-nez v12, :cond_a

    .line 388
    .line 389
    goto :goto_6

    .line 390
    :sswitch_2
    const-string v13, "user-agent"

    .line 391
    .line 392
    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 393
    .line 394
    .line 395
    move-result v12

    .line 396
    if-nez v12, :cond_a

    .line 397
    .line 398
    goto :goto_6

    .line 399
    :sswitch_3
    const-string v13, "accept-encoding"

    .line 400
    .line 401
    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 402
    .line 403
    .line 404
    move-result v12

    .line 405
    if-nez v12, :cond_a

    .line 406
    .line 407
    goto :goto_6

    .line 408
    :sswitch_4
    const-string v13, "accept"

    .line 409
    .line 410
    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 411
    .line 412
    .line 413
    move-result v12

    .line 414
    if-eqz v12, :cond_b

    .line 415
    .line 416
    goto :goto_5

    .line 417
    :cond_b
    :goto_6
    :try_start_1
    invoke-virtual {v6, v11, v10}, Lb8;->ι(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 418
    .line 419
    .line 420
    goto :goto_5

    .line 421
    :cond_c
    if-eqz v5, :cond_d

    .line 422
    .line 423
    const-string v0, "Range"

    .line 424
    .line 425
    const-string v10, "bytes=0-"

    .line 426
    .line 427
    invoke-virtual {v6, v0, v10}, Lb8;->ι(Ljava/lang/String;Ljava/lang/String;)V

    .line 428
    .line 429
    .line 430
    :cond_d
    new-instance v0, Li5;

    .line 431
    .line 432
    invoke-direct {v0, v6}, Li5;-><init>(Lb8;)V

    .line 433
    .line 434
    .line 435
    sget-object v6, Lwx;->α:Lt41;

    .line 436
    .line 437
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 438
    .line 439
    .line 440
    new-instance v10, Luk1;

    .line 441
    .line 442
    invoke-direct {v10, v6, v0}, Luk1;-><init>(Lt41;Li5;)V

    .line 443
    .line 444
    .line 445
    invoke-virtual {v10}, Luk1;->δ()Lzn1;

    .line 446
    .line 447
    .line 448
    move-result-object v6

    .line 449
    iget v11, v6, Lzn1;->θ:I

    .line 450
    .line 451
    iget-object v0, v6, Lzn1;->η:Ljava/lang/String;

    .line 452
    .line 453
    const/16 v10, 0x191

    .line 454
    .line 455
    if-eq v11, v10, :cond_e

    .line 456
    .line 457
    const/16 v10, 0x193

    .line 458
    .line 459
    if-eq v11, v10, :cond_e

    .line 460
    .line 461
    const/16 v10, 0x1a0

    .line 462
    .line 463
    if-eq v11, v10, :cond_e

    .line 464
    .line 465
    goto :goto_8

    .line 466
    :cond_e
    invoke-virtual {v6}, Lzn1;->close()V

    .line 467
    .line 468
    .line 469
    if-eqz v5, :cond_10

    .line 470
    .line 471
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 472
    .line 473
    .line 474
    move-result v5

    .line 475
    const/4 v10, 0x1

    .line 476
    if-le v5, v10, :cond_10

    .line 477
    .line 478
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 479
    .line 480
    .line 481
    move-result v5

    .line 482
    const/16 v6, 0x8c

    .line 483
    .line 484
    if-gt v5, v6, :cond_f

    .line 485
    .line 486
    move-object v5, v4

    .line 487
    goto :goto_7

    .line 488
    :cond_f
    invoke-static {v4, v6}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 489
    .line 490
    .line 491
    move-result-object v5

    .line 492
    const-string v6, "..."

    .line 493
    .line 494
    invoke-virtual {v5, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 495
    .line 496
    .line 497
    move-result-object v5

    .line 498
    :goto_7
    new-instance v6, Ljava/lang/StringBuilder;

    .line 499
    .line 500
    const-string v7, "[OKHTTP-RETRY] HTTP "

    .line 501
    .line 502
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 503
    .line 504
    .line 505
    invoke-virtual {v6, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 506
    .line 507
    .line 508
    const-string v7, " range=true url="

    .line 509
    .line 510
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 511
    .line 512
    .line 513
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 514
    .line 515
    .line 516
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 517
    .line 518
    .line 519
    move-result-object v5

    .line 520
    invoke-static {v1, v5}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 521
    .line 522
    .line 523
    move-object v5, v0

    .line 524
    move v0, v11

    .line 525
    goto/16 :goto_1

    .line 526
    .line 527
    :cond_10
    :goto_8
    iget-boolean p0, v6, Lzn1;->υ:Z

    .line 528
    .line 529
    if-nez p0, :cond_12

    .line 530
    .line 531
    const/16 p0, 0xce

    .line 532
    .line 533
    if-eq v11, p0, :cond_12

    .line 534
    .line 535
    invoke-virtual {v6}, Lzn1;->close()V

    .line 536
    .line 537
    .line 538
    new-instance p0, Ljava/lang/Exception;

    .line 539
    .line 540
    if-nez v0, :cond_11

    .line 541
    .line 542
    goto :goto_9

    .line 543
    :cond_11
    move-object v9, v0

    .line 544
    :goto_9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 545
    .line 546
    invoke-direct {v0, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 547
    .line 548
    .line 549
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 550
    .line 551
    .line 552
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 553
    .line 554
    .line 555
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 556
    .line 557
    .line 558
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 559
    .line 560
    .line 561
    move-result-object v0

    .line 562
    invoke-static {v0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 563
    .line 564
    .line 565
    move-result-object v0

    .line 566
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 567
    .line 568
    .line 569
    move-result-object v0

    .line 570
    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 571
    .line 572
    .line 573
    throw p0

    .line 574
    :cond_12
    iget-object p0, v6, Lzn1;->λ:Lbo1;

    .line 575
    .line 576
    if-eqz p0, :cond_15

    .line 577
    .line 578
    move-object v1, v3

    .line 579
    new-instance v3, Lvx;

    .line 580
    .line 581
    iget-object v0, v6, Lzn1;->ε:Li5;

    .line 582
    .line 583
    iget-object v0, v0, Li5;->β:Ljava/lang/Object;

    .line 584
    .line 585
    check-cast v0, Log0;

    .line 586
    .line 587
    iget-object v5, v0, Log0;->θ:Ljava/lang/String;

    .line 588
    .line 589
    new-instance v7, Ljava/io/BufferedInputStream;

    .line 590
    .line 591
    invoke-virtual {p0}, Lbo1;->κ()Lad;

    .line 592
    .line 593
    .line 594
    move-result-object v0

    .line 595
    invoke-interface {v0}, Lad;->π()Ljava/io/InputStream;

    .line 596
    .line 597
    .line 598
    move-result-object v0

    .line 599
    invoke-direct {v7, v0}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    .line 600
    .line 601
    .line 602
    invoke-virtual {p0}, Lbo1;->θ()Lez0;

    .line 603
    .line 604
    .line 605
    move-result-object v0

    .line 606
    if-eqz v0, :cond_14

    .line 607
    .line 608
    iget-object v0, v0, Lez0;->α:Ljava/lang/String;

    .line 609
    .line 610
    if-nez v0, :cond_13

    .line 611
    .line 612
    goto :goto_b

    .line 613
    :cond_13
    :goto_a
    move-object v8, v0

    .line 614
    goto :goto_c

    .line 615
    :cond_14
    :goto_b
    const-string v0, "Content-Type"

    .line 616
    .line 617
    iget-object v2, v6, Lzn1;->κ:Lvc0;

    .line 618
    .line 619
    invoke-virtual {v2, v0}, Lvc0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 620
    .line 621
    .line 622
    move-result-object v0

    .line 623
    if-nez v0, :cond_13

    .line 624
    .line 625
    move-object v0, v1

    .line 626
    goto :goto_a

    .line 627
    :goto_c
    invoke-virtual {p0}, Lbo1;->η()J

    .line 628
    .line 629
    .line 630
    move-result-wide v9

    .line 631
    invoke-direct/range {v3 .. v11}, Lvx;-><init>(Ljava/lang/String;Ljava/lang/String;Lzn1;Ljava/io/BufferedInputStream;Ljava/lang/String;JI)V

    .line 632
    .line 633
    .line 634
    return-object v3

    .line 635
    :cond_15
    invoke-virtual {v6}, Lzn1;->close()V

    .line 636
    .line 637
    .line 638
    new-instance p0, Ljava/lang/Exception;

    .line 639
    .line 640
    const-string v0, "\u54cd\u5e94\u4f53\u4e3a\u7a7a"

    .line 641
    .line 642
    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 643
    .line 644
    .line 645
    throw p0

    .line 646
    :cond_16
    new-instance p0, Ljava/lang/Exception;

    .line 647
    .line 648
    if-nez v5, :cond_17

    .line 649
    .line 650
    move-object v5, v9

    .line 651
    :cond_17
    new-instance v1, Ljava/lang/StringBuilder;

    .line 652
    .line 653
    invoke-direct {v1, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 654
    .line 655
    .line 656
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 657
    .line 658
    .line 659
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 660
    .line 661
    .line 662
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 663
    .line 664
    .line 665
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 666
    .line 667
    .line 668
    move-result-object v0

    .line 669
    invoke-static {v0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 670
    .line 671
    .line 672
    move-result-object v0

    .line 673
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 674
    .line 675
    .line 676
    move-result-object v0

    .line 677
    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 678
    .line 679
    .line 680
    throw p0

    .line 681
    :sswitch_data_0
    .sparse-switch
        -0x54d84af8 -> :sswitch_4
        -0x9f9db88 -> :sswitch_3
        0x1cfcfe83 -> :sswitch_2
        0x2fd98a7d -> :sswitch_1
        0x40acd92d -> :sswitch_0
    .end sparse-switch
.end method

.method public static synthetic ζ(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;I)Lvx;
    .locals 1

    .line 1
    and-int/lit8 v0, p3, 0x2

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object p1, Lkz;->ε:Lkz;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 v0, p3, 0x4

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    goto :goto_0

    .line 13
    :cond_1
    const/4 v0, 0x1

    .line 14
    :goto_0
    and-int/lit8 p3, p3, 0x10

    .line 15
    .line 16
    if-eqz p3, :cond_2

    .line 17
    .line 18
    const-string p2, "*/*"

    .line 19
    .line 20
    :cond_2
    invoke-static {p0, p1, v0, p2}, Lwx;->ε(Ljava/lang/String;Ljava/util/Map;ZLjava/lang/String;)Lvx;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method
