.class public final Led/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final d:Lmh/b;

.field public static final e:[Lqd/j;

.field public static final f:[Lqd/j;


# instance fields
.field public final a:Lud/u;

.field public b:I

.field public c:[Led/b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-class v0, Led/a;

    .line 2
    .line 3
    invoke-static {v0}, Lmh/d;->b(Ljava/lang/Class;)Lmh/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Led/a;->d:Lmh/b;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    new-array v1, v0, [Lqd/j;

    .line 11
    .line 12
    sput-object v1, Led/a;->e:[Lqd/j;

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    new-array v1, v1, [Lqd/j;

    .line 16
    .line 17
    sget-object v2, Lqd/j;->k:Lqd/e;

    .line 18
    .line 19
    aput-object v2, v1, v0

    .line 20
    .line 21
    sput-object v1, Led/a;->f:[Lqd/j;

    .line 22
    .line 23
    return-void
.end method

.method public constructor <init>(Lud/u;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Led/a;->a:Lud/u;

    .line 5
    .line 6
    return-void
.end method

.method public static e(Ljava/io/DataInputStream;)Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readByte()B

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    and-int/lit16 v0, v0, 0xff

    .line 6
    .line 7
    new-array v1, v0, [B

    .line 8
    .line 9
    invoke-virtual {p0, v1}, Ljava/io/DataInputStream;->read([B)I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    :goto_0
    if-eq v2, v0, :cond_1

    .line 14
    .line 15
    sub-int v3, v0, v2

    .line 16
    .line 17
    invoke-virtual {p0, v1, v2, v3}, Ljava/io/DataInputStream;->read([BII)I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    const/4 v4, -0x1

    .line 22
    if-eq v3, v4, :cond_0

    .line 23
    .line 24
    add-int/2addr v2, v3

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const-string p0, "String read error"

    .line 27
    .line 28
    invoke-static {p0}, Lj8/o;->y(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    return-object p0

    .line 33
    :cond_1
    new-instance p0, Ljava/lang/String;

    .line 34
    .line 35
    const-string v0, "US-ASCII"

    .line 36
    .line 37
    invoke-direct {p0, v1, v0}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return-object p0
.end method


# virtual methods
.method public final a(Ljava/io/InputStream;)V
    .locals 9

    .line 1
    const-string v0, "Wrong jadx class set version, got: "

    .line 2
    .line 3
    new-instance v1, Ljava/io/DataInputStream;

    .line 4
    .line 5
    new-instance v2, Ljava/io/BufferedInputStream;

    .line 6
    .line 7
    invoke-direct {v2, p1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    .line 8
    .line 9
    .line 10
    invoke-direct {v1, v2}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    .line 11
    .line 12
    .line 13
    const/16 p1, 0x8

    .line 14
    .line 15
    :try_start_0
    new-array v2, p1, [B

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ljava/io/DataInputStream;->read([B)I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-ne v3, p1, :cond_9

    .line 22
    .line 23
    const-string p1, "jadx-cst"

    .line 24
    .line 25
    new-instance v3, Ljava/lang/String;

    .line 26
    .line 27
    const-string v4, "US-ASCII"

    .line 28
    .line 29
    invoke-direct {v3, v2, v4}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-eqz p1, :cond_9

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/io/DataInputStream;->readByte()B

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    const/4 v2, 0x5

    .line 43
    if-ne p1, v2, :cond_8

    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/io/DataInputStream;->readInt()I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    iput p1, p0, Led/a;->b:I

    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/io/DataInputStream;->readInt()I

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    new-array v0, p1, [Led/b;

    .line 56
    .line 57
    iput-object v0, p0, Led/a;->c:[Led/b;

    .line 58
    .line 59
    const/4 v0, 0x0

    .line 60
    move v2, v0

    .line 61
    :goto_0
    if-ge v2, p1, :cond_1

    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/io/DataInputStream;->readInt()I

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    invoke-virtual {v1}, Ljava/io/DataInputStream;->readByte()B

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    and-int/lit16 v4, v4, 0xff

    .line 72
    .line 73
    const/4 v5, 0x4

    .line 74
    invoke-static {v5}, Lt3/c;->c(I)[I

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    if-ltz v4, :cond_0

    .line 79
    .line 80
    array-length v6, v5

    .line 81
    if-gt v4, v6, :cond_0

    .line 82
    .line 83
    aget v4, v5, v4

    .line 84
    .line 85
    invoke-static {v1}, Led/a;->e(Ljava/io/DataInputStream;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    iget-object v6, p0, Led/a;->c:[Led/b;

    .line 90
    .line 91
    new-instance v7, Led/b;

    .line 92
    .line 93
    invoke-static {v5}, Lqd/j;->x(Ljava/lang/String;)Lqd/j;

    .line 94
    .line 95
    .line 96
    move-result-object v5

    .line 97
    invoke-direct {v7, v3, v4, v5}, Led/b;-><init>(IILqd/j;)V

    .line 98
    .line 99
    .line 100
    aput-object v7, v6, v2

    .line 101
    .line 102
    add-int/lit8 v2, v2, 0x1

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :catchall_0
    move-exception p1

    .line 106
    goto/16 :goto_5

    .line 107
    .line 108
    :cond_0
    new-instance p1, Laf/b;

    .line 109
    .line 110
    new-instance v0, Ljava/lang/StringBuilder;

    .line 111
    .line 112
    const-string v2, "Wrong jadx source identifier: "

    .line 113
    .line 114
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    throw p1

    .line 128
    :cond_1
    move v2, v0

    .line 129
    :goto_1
    if-ge v2, p1, :cond_7

    .line 130
    .line 131
    iget-object v3, p0, Led/a;->c:[Led/b;

    .line 132
    .line 133
    aget-object v3, v3, v2

    .line 134
    .line 135
    iget-object v4, p0, Led/a;->a:Lud/u;

    .line 136
    .line 137
    iget-object v5, v3, Led/b;->a:Lqd/j;

    .line 138
    .line 139
    invoke-static {v4, v5}, Lod/a;->e(Lud/u;Lqd/j;)Lod/a;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    invoke-virtual {v1}, Ljava/io/DataInputStream;->readByte()B

    .line 144
    .line 145
    .line 146
    move-result v5

    .line 147
    const/4 v6, -0x2

    .line 148
    if-eq v5, v6, :cond_4

    .line 149
    .line 150
    const/4 v6, -0x1

    .line 151
    if-eq v5, v6, :cond_3

    .line 152
    .line 153
    if-eqz v5, :cond_2

    .line 154
    .line 155
    new-array v6, v5, [Lqd/j;

    .line 156
    .line 157
    move v7, v0

    .line 158
    :goto_2
    if-ge v7, v5, :cond_5

    .line 159
    .line 160
    invoke-virtual {p0, v1}, Led/a;->b(Ljava/io/DataInputStream;)Lqd/j;

    .line 161
    .line 162
    .line 163
    move-result-object v8

    .line 164
    aput-object v8, v6, v7

    .line 165
    .line 166
    add-int/lit8 v7, v7, 0x1

    .line 167
    .line 168
    goto :goto_2

    .line 169
    :cond_2
    sget-object v6, Led/a;->e:[Lqd/j;

    .line 170
    .line 171
    goto :goto_3

    .line 172
    :cond_3
    const/4 v6, 0x0

    .line 173
    goto :goto_3

    .line 174
    :cond_4
    sget-object v6, Led/a;->f:[Lqd/j;

    .line 175
    .line 176
    :cond_5
    :goto_3
    iput-object v6, v3, Led/b;->c:[Lqd/j;

    .line 177
    .line 178
    invoke-virtual {p0, v1}, Led/a;->c(Ljava/io/DataInputStream;)Ljava/util/List;

    .line 179
    .line 180
    .line 181
    move-result-object v5

    .line 182
    iput-object v5, v3, Led/b;->e:Ljava/util/List;

    .line 183
    .line 184
    invoke-virtual {p0, v1, v4}, Led/a;->d(Ljava/io/DataInputStream;Lod/a;)Ljava/util/ArrayList;

    .line 185
    .line 186
    .line 187
    move-result-object v4

    .line 188
    new-instance v5, Ljava/util/HashMap;

    .line 189
    .line 190
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 191
    .line 192
    .line 193
    move-result v6

    .line 194
    invoke-direct {v5, v6}, Ljava/util/HashMap;-><init>(I)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 198
    .line 199
    .line 200
    move-result-object v4

    .line 201
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 202
    .line 203
    .line 204
    move-result v6

    .line 205
    if-eqz v6, :cond_6

    .line 206
    .line 207
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v6

    .line 211
    check-cast v6, Led/d;

    .line 212
    .line 213
    iget-object v7, v6, Led/d;->g:Lod/d;

    .line 214
    .line 215
    iget-object v7, v7, Lod/d;->k:Ljava/lang/String;

    .line 216
    .line 217
    invoke-virtual {v5, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    goto :goto_4

    .line 221
    :cond_6
    iput-object v5, v3, Led/b;->d:Ljava/util/Map;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 222
    .line 223
    add-int/lit8 v2, v2, 0x1

    .line 224
    .line 225
    goto :goto_1

    .line 226
    :cond_7
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 227
    .line 228
    .line 229
    return-void

    .line 230
    :cond_8
    :try_start_1
    new-instance v2, Laf/b;

    .line 231
    .line 232
    new-instance v3, Ljava/lang/StringBuilder;

    .line 233
    .line 234
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    const-string p1, ", expect: 5"

    .line 241
    .line 242
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object p1

    .line 249
    invoke-direct {v2, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    throw v2

    .line 253
    :cond_9
    new-instance p1, Laf/b;

    .line 254
    .line 255
    const-string v0, "Wrong jadx class set header"

    .line 256
    .line 257
    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 261
    :goto_5
    :try_start_2
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 262
    .line 263
    .line 264
    goto :goto_6

    .line 265
    :catchall_1
    move-exception v0

    .line 266
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 267
    .line 268
    .line 269
    :goto_6
    throw p1
.end method

.method public final b(Ljava/io/DataInputStream;)Lqd/j;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readByte()B

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    return-object p1

    .line 10
    :cond_0
    const/4 v1, 0x7

    .line 11
    invoke-static {v1}, Lt3/c;->c(I)[I

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    aget v1, v1, v0

    .line 16
    .line 17
    invoke-static {v1}, Lt3/c;->b(I)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    packed-switch v1, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    const-string p1, "Unsupported Arg Type: "

    .line 25
    .line 26
    invoke-static {v0, p1}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-static {p1}, Lah/a;->k(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const/4 p1, 0x0

    .line 34
    return-object p1

    .line 35
    :pswitch_0
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readByte()B

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    int-to-char p1, p1

    .line 40
    invoke-static {p1}, Lqd/j;->y(C)Lqd/g;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    return-object p1

    .line 45
    :pswitch_1
    invoke-virtual {p0, p1}, Led/a;->b(Ljava/io/DataInputStream;)Lqd/j;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    new-instance v0, Lqd/a;

    .line 53
    .line 54
    invoke-direct {v0, p1}, Lqd/a;-><init>(Lqd/j;)V

    .line 55
    .line 56
    .line 57
    return-object v0

    .line 58
    :pswitch_2
    iget-object v0, p0, Led/a;->c:[Led/b;

    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readInt()I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    aget-object p1, v0, p1

    .line 65
    .line 66
    iget-object p1, p1, Led/b;->a:Lqd/j;

    .line 67
    .line 68
    return-object p1

    .line 69
    :pswitch_3
    invoke-virtual {p0, p1}, Led/a;->b(Ljava/io/DataInputStream;)Lqd/j;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-virtual {p0, p1}, Led/a;->b(Ljava/io/DataInputStream;)Lqd/j;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    new-instance v1, Lqd/f;

    .line 78
    .line 79
    check-cast v0, Lqd/e;

    .line 80
    .line 81
    check-cast p1, Lqd/e;

    .line 82
    .line 83
    invoke-direct {v1, v0, p1}, Lqd/f;-><init>(Lqd/e;Lqd/e;)V

    .line 84
    .line 85
    .line 86
    return-object v1

    .line 87
    :pswitch_4
    invoke-static {p1}, Led/a;->e(Ljava/io/DataInputStream;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-virtual {p0, p1}, Led/a;->c(Ljava/io/DataInputStream;)Ljava/util/List;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    new-instance v1, Lqd/c;

    .line 96
    .line 97
    invoke-direct {v1, v0, p1}, Lqd/c;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 98
    .line 99
    .line 100
    return-object v1

    .line 101
    :pswitch_5
    iget-object v0, p0, Led/a;->c:[Led/b;

    .line 102
    .line 103
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readInt()I

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    aget-object v0, v0, v1

    .line 108
    .line 109
    iget-object v0, v0, Led/b;->a:Lqd/j;

    .line 110
    .line 111
    invoke-virtual {p0, p1}, Led/a;->c(Ljava/io/DataInputStream;)Ljava/util/List;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    invoke-static {v0, p1}, Lqd/j;->e(Lqd/j;Ljava/util/List;)Lqd/b;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    return-object p1

    .line 120
    :pswitch_6
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readByte()B

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    const/4 v1, 0x2

    .line 125
    if-nez v0, :cond_1

    .line 126
    .line 127
    move v2, v1

    .line 128
    goto :goto_0

    .line 129
    :cond_1
    const/4 v2, 0x1

    .line 130
    if-ne v0, v2, :cond_2

    .line 131
    .line 132
    goto :goto_0

    .line 133
    :cond_2
    const/4 v2, 0x3

    .line 134
    :goto_0
    if-ne v2, v1, :cond_3

    .line 135
    .line 136
    sget-object p1, Lqd/j;->t:Lqd/i;

    .line 137
    .line 138
    return-object p1

    .line 139
    :cond_3
    invoke-virtual {p0, p1}, Led/a;->b(Ljava/io/DataInputStream;)Lqd/j;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    new-instance v0, Lqd/i;

    .line 144
    .line 145
    invoke-direct {v0, v2, p1}, Lqd/i;-><init>(ILqd/j;)V

    .line 146
    .line 147
    .line 148
    return-object v0

    .line 149
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final c(Ljava/io/DataInputStream;)Ljava/util/List;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readByte()B

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 8
    .line 9
    return-object p1

    .line 10
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 13
    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    :goto_0
    if-ge v2, v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Led/a;->b(Ljava/io/DataInputStream;)Lqd/j;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    add-int/lit8 v2, v2, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    return-object v1
.end method

.method public final d(Ljava/io/DataInputStream;Lod/a;)Ljava/util/ArrayList;
    .locals 16

    .line 1
    invoke-virtual/range {p1 .. p1}, Ljava/io/DataInputStream;->readShort()S

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-instance v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    :goto_0
    if-ge v2, v0, :cond_3

    .line 12
    .line 13
    invoke-static/range {p1 .. p1}, Led/a;->e(Ljava/io/DataInputStream;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-virtual/range {p0 .. p1}, Led/a;->c(Ljava/io/DataInputStream;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    invoke-virtual/range {p0 .. p1}, Led/a;->b(Ljava/io/DataInputStream;)Lqd/j;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    invoke-virtual/range {p0 .. p1}, Led/a;->c(Ljava/io/DataInputStream;)Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v6

    .line 29
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    .line 30
    .line 31
    .line 32
    move-result v7

    .line 33
    if-nez v7, :cond_1

    .line 34
    .line 35
    invoke-virtual {v6, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v7

    .line 39
    if-eqz v7, :cond_0

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_0
    move-object v10, v6

    .line 43
    goto :goto_2

    .line 44
    :cond_1
    :goto_1
    move-object v10, v4

    .line 45
    :goto_2
    invoke-virtual/range {p0 .. p1}, Led/a;->b(Ljava/io/DataInputStream;)Lqd/j;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    invoke-static {v6, v5}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v7

    .line 53
    if-eqz v7, :cond_2

    .line 54
    .line 55
    move-object v11, v5

    .line 56
    goto :goto_3

    .line 57
    :cond_2
    move-object v11, v6

    .line 58
    :goto_3
    invoke-virtual/range {p0 .. p1}, Led/a;->c(Ljava/io/DataInputStream;)Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object v12

    .line 62
    invoke-virtual/range {p1 .. p1}, Ljava/io/DataInputStream;->readInt()I

    .line 63
    .line 64
    .line 65
    move-result v14

    .line 66
    invoke-virtual/range {p0 .. p1}, Led/a;->c(Ljava/io/DataInputStream;)Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object v13

    .line 70
    move-object/from16 v6, p0

    .line 71
    .line 72
    iget-object v7, v6, Led/a;->a:Lud/u;

    .line 73
    .line 74
    move-object/from16 v15, p2

    .line 75
    .line 76
    invoke-static {v7, v15, v3, v4, v5}, Lod/d;->b(Lud/u;Lod/a;Ljava/lang/String;Ljava/util/List;Lqd/j;)Lod/d;

    .line 77
    .line 78
    .line 79
    move-result-object v9

    .line 80
    new-instance v8, Led/d;

    .line 81
    .line 82
    invoke-direct/range {v8 .. v14}, Led/d;-><init>(Lod/d;Ljava/util/List;Lqd/j;Ljava/util/List;Ljava/util/List;I)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    add-int/lit8 v2, v2, 0x1

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_3
    move-object/from16 v6, p0

    .line 92
    .line 93
    return-object v1
.end method
