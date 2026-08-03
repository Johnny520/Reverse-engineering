.class final Lcom/alibaba/fastjson2/JSONReaderUTF16;
.super Lcom/alibaba/fastjson2/JSONReader;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field static final CHAR_MASK:J


# instance fields
.field private cacheIndex:I

.field protected final chars:[C

.field protected final end:I

.field private input:Ljava/io/Closeable;

.field protected final length:I

.field private nameBegin:I

.field private nameEnd:I

.field private nameLength:I

.field private referenceBegin:I

.field protected final start:I

.field protected final str:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-boolean v0, Lcom/alibaba/fastjson2/util/JDKUtils;->BIG_ENDIAN:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-wide v0, 0xff00ff00ff00ffL

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const-wide v0, -0xff00ff00ff0100L    # -5.82767264895205E303

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    :goto_0
    sput-wide v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->CHAR_MASK:J

    .line 17
    .line 18
    return-void
.end method

.method public constructor <init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/io/InputStream;)V
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Lcom/alibaba/fastjson2/JSONReader;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Z)V

    .line 3
    .line 4
    .line 5
    const/4 v1, -0x1

    .line 6
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->cacheIndex:I

    .line 7
    .line 8
    iput-object p2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->input:Ljava/io/Closeable;

    .line 9
    .line 10
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-static {v2}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    sget-object v3, Lcom/alibaba/fastjson2/JSONFactory;->CACHE_ITEMS:[Lcom/alibaba/fastjson2/JSONFactory$CacheItem;

    .line 19
    .line 20
    array-length v4, v3

    .line 21
    const/4 v5, 0x1

    .line 22
    sub-int/2addr v4, v5

    .line 23
    and-int/2addr v2, v4

    .line 24
    aget-object v2, v3, v2

    .line 25
    .line 26
    sget-object v3, Lcom/alibaba/fastjson2/JSONFactory;->BYTES_UPDATER:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 27
    .line 28
    const/4 v4, 0x0

    .line 29
    invoke-virtual {v3, v2, v4}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->getAndSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    check-cast v3, [B

    .line 34
    .line 35
    if-nez v3, :cond_0

    .line 36
    .line 37
    iget v3, p1, Lcom/alibaba/fastjson2/JSONReader$Context;->bufferSize:I

    .line 38
    .line 39
    new-array v3, v3, [B

    .line 40
    .line 41
    :cond_0
    move v6, v0

    .line 42
    :cond_1
    :goto_0
    :try_start_0
    array-length v7, v3

    .line 43
    sub-int/2addr v7, v6

    .line 44
    invoke-virtual {p2, v3, v6, v7}, Ljava/io/InputStream;->read([BII)I

    .line 45
    .line 46
    .line 47
    move-result v7

    .line 48
    if-ne v7, v1, :cond_a

    .line 49
    .line 50
    rem-int/lit8 p1, v6, 0x2

    .line 51
    .line 52
    if-eq p1, v5, :cond_9

    .line 53
    .line 54
    div-int/lit8 p1, v6, 0x2

    .line 55
    .line 56
    new-array p2, p1, [C

    .line 57
    .line 58
    move v1, v0

    .line 59
    move v7, v1

    .line 60
    :goto_1
    if-ge v1, v6, :cond_2

    .line 61
    .line 62
    aget-byte v8, v3, v1

    .line 63
    .line 64
    add-int/lit8 v9, v1, 0x1

    .line 65
    .line 66
    aget-byte v9, v3, v9

    .line 67
    .line 68
    and-int/lit16 v9, v9, 0xff

    .line 69
    .line 70
    and-int/lit16 v8, v8, 0xff

    .line 71
    .line 72
    shl-int/lit8 v8, v8, 0x8

    .line 73
    .line 74
    or-int/2addr v8, v9

    .line 75
    int-to-char v8, v8

    .line 76
    aput-char v8, p2, v7
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 77
    .line 78
    add-int/lit8 v1, v1, 0x2

    .line 79
    .line 80
    add-int/lit8 v7, v7, 0x1

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :catchall_0
    move-exception p1

    .line 84
    goto/16 :goto_4

    .line 85
    .line 86
    :catch_0
    move-exception p1

    .line 87
    goto/16 :goto_3

    .line 88
    .line 89
    :cond_2
    sget-object v1, Lcom/alibaba/fastjson2/JSONFactory;->BYTES_UPDATER:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 90
    .line 91
    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    iput-object v4, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->str:Ljava/lang/String;

    .line 95
    .line 96
    iput-object p2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 97
    .line 98
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 99
    .line 100
    iput p1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->length:I

    .line 101
    .line 102
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->start:I

    .line 103
    .line 104
    iput p1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 105
    .line 106
    const/16 v1, 0x1a

    .line 107
    .line 108
    if-nez p1, :cond_3

    .line 109
    .line 110
    iput-char v1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 111
    .line 112
    return-void

    .line 113
    :cond_3
    aget-char v2, p2, v0

    .line 114
    .line 115
    :goto_2
    const/16 v3, 0x20

    .line 116
    .line 117
    if-gt v2, v3, :cond_5

    .line 118
    .line 119
    const-wide/16 v3, 0x1

    .line 120
    .line 121
    shl-long/2addr v3, v2

    .line 122
    const-wide v6, 0x100003701L

    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    and-long/2addr v3, v6

    .line 128
    const-wide/16 v6, 0x0

    .line 129
    .line 130
    cmp-long v3, v3, v6

    .line 131
    .line 132
    if-eqz v3, :cond_5

    .line 133
    .line 134
    add-int/2addr v0, v5

    .line 135
    if-lt v0, p1, :cond_4

    .line 136
    .line 137
    iput-char v1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 138
    .line 139
    return-void

    .line 140
    :cond_4
    aget-char v2, p2, v0

    .line 141
    .line 142
    goto :goto_2

    .line 143
    :cond_5
    iput-char v2, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 144
    .line 145
    iget p1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 146
    .line 147
    add-int/2addr p1, v5

    .line 148
    iput p1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 149
    .line 150
    const p1, 0xfffe

    .line 151
    .line 152
    .line 153
    if-eq v2, p1, :cond_6

    .line 154
    .line 155
    const p1, 0xfeff

    .line 156
    .line 157
    .line 158
    if-ne v2, p1, :cond_7

    .line 159
    .line 160
    :cond_6
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->next()V

    .line 161
    .line 162
    .line 163
    :cond_7
    iget-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 164
    .line 165
    const/16 p2, 0x2f

    .line 166
    .line 167
    if-ne p1, p2, :cond_8

    .line 168
    .line 169
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->skipComment()V

    .line 170
    .line 171
    .line 172
    :cond_8
    return-void

    .line 173
    :cond_9
    :try_start_1
    new-instance p1, Lcom/alibaba/fastjson2/JSONException;

    .line 174
    .line 175
    new-instance p2, Ljava/lang/StringBuilder;

    .line 176
    .line 177
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 178
    .line 179
    .line 180
    const-string v0, "illegal input utf16 bytes, length "

    .line 181
    .line 182
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {p2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object p2

    .line 192
    invoke-direct {p1, p2}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    throw p1

    .line 196
    :cond_a
    add-int/2addr v6, v7

    .line 197
    array-length v7, v3

    .line 198
    if-ne v6, v7, :cond_1

    .line 199
    .line 200
    array-length v7, v3

    .line 201
    iget v8, p1, Lcom/alibaba/fastjson2/JSONReader$Context;->bufferSize:I

    .line 202
    .line 203
    add-int/2addr v7, v8

    .line 204
    invoke-static {v3, v7}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 205
    .line 206
    .line 207
    move-result-object v3
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 208
    goto/16 :goto_0

    .line 209
    .line 210
    :goto_3
    :try_start_2
    new-instance p2, Lcom/alibaba/fastjson2/JSONException;

    .line 211
    .line 212
    const-string v0, "read error"

    .line 213
    .line 214
    invoke-direct {p2, v0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 215
    .line 216
    .line 217
    throw p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 218
    :goto_4
    sget-object p2, Lcom/alibaba/fastjson2/JSONFactory;->BYTES_UPDATER:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 219
    .line 220
    invoke-virtual {p2, v2, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    throw p1
.end method

.method public constructor <init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/io/Reader;)V
    .locals 6

    const/4 v0, 0x0

    .line 224
    invoke-direct {p0, p1, v0}, Lcom/alibaba/fastjson2/JSONReader;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Z)V

    const/4 p1, -0x1

    .line 225
    iput p1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->cacheIndex:I

    .line 226
    iput-object p2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->input:Ljava/io/Closeable;

    .line 227
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    sget-object v2, Lcom/alibaba/fastjson2/JSONFactory;->CACHE_ITEMS:[Lcom/alibaba/fastjson2/JSONFactory$CacheItem;

    array-length v3, v2

    add-int/lit8 v3, v3, -0x1

    and-int/2addr v1, v3

    iput v1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->cacheIndex:I

    .line 228
    aget-object v1, v2, v1

    .line 229
    sget-object v2, Lcom/alibaba/fastjson2/JSONFactory;->CHARS_UPDATER:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const/4 v3, 0x0

    invoke-virtual {v2, v1, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->getAndSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [C

    if-nez v1, :cond_0

    const/16 v1, 0x2000

    .line 230
    new-array v1, v1, [C

    :cond_0
    move v2, v0

    .line 231
    :cond_1
    :goto_0
    :try_start_0
    array-length v4, v1

    sub-int/2addr v4, v2

    invoke-virtual {p2, v1, v2, v4}, Ljava/io/Reader;->read([CII)I

    move-result v4
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    if-ne v4, p1, :cond_8

    .line 232
    iput-object v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->str:Ljava/lang/String;

    .line 233
    iput-object v1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 234
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 235
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->length:I

    .line 236
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->start:I

    .line 237
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    const/16 p1, 0x1a

    if-gtz v2, :cond_2

    .line 238
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    return-void

    .line 239
    :cond_2
    aget-char p2, v1, v0

    iput-char p2, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 240
    :goto_1
    iget-char p2, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 v0, 0x20

    if-gt p2, v0, :cond_4

    const-wide/16 v2, 0x1

    shl-long/2addr v2, p2

    const-wide v4, 0x100003701L

    and-long/2addr v2, v4

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-eqz v0, :cond_4

    .line 241
    iget p2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    add-int/lit8 p2, p2, 0x1

    iput p2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 242
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->length:I

    if-lt p2, v0, :cond_3

    .line 243
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    return-void

    .line 244
    :cond_3
    aget-char p2, v1, p2

    iput-char p2, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    goto :goto_1

    .line 245
    :cond_4
    iget p1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    const p1, 0xfffe

    if-eq p2, p1, :cond_5

    const p1, 0xfeff

    if-ne p2, p1, :cond_6

    .line 246
    :cond_5
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->next()V

    .line 247
    :cond_6
    :goto_2
    iget-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 p2, 0x2f

    if-ne p1, p2, :cond_7

    .line 248
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->skipComment()V

    goto :goto_2

    :cond_7
    return-void

    :cond_8
    add-int/2addr v2, v4

    .line 249
    :try_start_1
    array-length v4, v1

    if-ne v2, v4, :cond_1

    .line 250
    array-length v4, v1

    shr-int/lit8 v5, v4, 0x1

    add-int/2addr v4, v5

    .line 251
    invoke-static {v1, v4}, Ljava/util/Arrays;->copyOf([CI)[C

    move-result-object v1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 252
    const-string p2, "read error"

    invoke-static {p2, p1}, Lah/a;->x(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public constructor <init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;II)V
    .locals 5

    const/4 v0, 0x0

    .line 253
    invoke-direct {p0, p1, v0}, Lcom/alibaba/fastjson2/JSONReader;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Z)V

    const/4 p1, -0x1

    .line 254
    iput p1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->cacheIndex:I

    .line 255
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p1

    sget-object v1, Lcom/alibaba/fastjson2/JSONFactory;->CACHE_ITEMS:[Lcom/alibaba/fastjson2/JSONFactory$CacheItem;

    array-length v2, v1

    add-int/lit8 v2, v2, -0x1

    and-int/2addr p1, v2

    iput p1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->cacheIndex:I

    .line 256
    aget-object p1, v1, p1

    .line 257
    sget-object v1, Lcom/alibaba/fastjson2/JSONFactory;->CHARS_UPDATER:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const/4 v2, 0x0

    invoke-virtual {v1, p1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->getAndSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [C

    if-eqz v3, :cond_0

    .line 258
    array-length v4, v3

    if-ge v4, p4, :cond_2

    :cond_0
    if-eqz v3, :cond_1

    .line 259
    invoke-virtual {v1, p1, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    const/16 p1, 0x2000

    .line 260
    invoke-static {p4, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    new-array v3, p1, [C

    :cond_2
    add-int p1, p3, p4

    .line 261
    invoke-virtual {p2, p3, p1, v3, v0}, Ljava/lang/String;->getChars(II[CI)V

    if-nez p3, :cond_3

    goto :goto_0

    :cond_3
    move-object p2, v2

    .line 262
    :goto_0
    iput-object p2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->str:Ljava/lang/String;

    .line 263
    iput-object v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 264
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 265
    iput p4, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->length:I

    .line 266
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->start:I

    .line 267
    iput p4, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    const/16 p1, 0x1a

    if-gtz p4, :cond_4

    .line 268
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    return-void

    .line 269
    :cond_4
    aget-char p2, v3, v0

    iput-char p2, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 270
    :goto_1
    iget-char p2, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 p3, 0x20

    if-gt p2, p3, :cond_6

    const-wide/16 p3, 0x1

    shl-long/2addr p3, p2

    const-wide v0, 0x100003701L

    and-long/2addr p3, v0

    const-wide/16 v0, 0x0

    cmp-long p3, p3, v0

    if-eqz p3, :cond_6

    .line 271
    iget p2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    add-int/lit8 p2, p2, 0x1

    iput p2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 272
    iget p3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->length:I

    if-lt p2, p3, :cond_5

    .line 273
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    return-void

    .line 274
    :cond_5
    aget-char p2, v3, p2

    iput-char p2, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    goto :goto_1

    .line 275
    :cond_6
    iget p1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    const p1, 0xfffe

    if-eq p2, p1, :cond_7

    const p1, 0xfeff

    if-ne p2, p1, :cond_8

    .line 276
    :cond_7
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->next()V

    .line 277
    :cond_8
    iget-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 p2, 0x2f

    if-ne p1, p2, :cond_9

    .line 278
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->skipComment()V

    :cond_9
    return-void
.end method

.method public constructor <init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;[CII)V
    .locals 4

    const/4 v0, 0x0

    .line 279
    invoke-direct {p0, p1, v0}, Lcom/alibaba/fastjson2/JSONReader;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Z)V

    const/4 p1, -0x1

    .line 280
    iput p1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->cacheIndex:I

    .line 281
    iput-object p2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->str:Ljava/lang/String;

    .line 282
    iput-object p3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 283
    iput p4, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 284
    iput p5, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->length:I

    .line 285
    iput p4, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->start:I

    add-int p1, p4, p5

    .line 286
    iput p1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    const/16 p2, 0x1a

    if-lt p4, p1, :cond_0

    .line 287
    iput-char p2, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    return-void

    .line 288
    :cond_0
    aget-char p1, p3, p4

    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 289
    :goto_0
    iget-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 p4, 0x20

    if-gt p1, p4, :cond_2

    const-wide/16 v0, 0x1

    shl-long/2addr v0, p1

    const-wide v2, 0x100003701L

    and-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long p4, v0, v2

    if-eqz p4, :cond_2

    .line 290
    iget p1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    if-lt p1, p5, :cond_1

    .line 291
    iput-char p2, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    return-void

    .line 292
    :cond_1
    aget-char p1, p3, p1

    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    goto :goto_0

    .line 293
    :cond_2
    iget p2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    add-int/lit8 p2, p2, 0x1

    iput p2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    const p2, 0xfffe

    if-eq p1, p2, :cond_3

    const p2, 0xfeff

    if-ne p1, p2, :cond_4

    .line 294
    :cond_3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->next()V

    .line 295
    :cond_4
    iget-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 p2, 0x2f

    if-ne p1, p2, :cond_5

    .line 296
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->skipComment()V

    :cond_5
    return-void
.end method

.method public constructor <init>(Lcom/alibaba/fastjson2/JSONReader$Context;[BII)V
    .locals 8

    const/4 v0, 0x0

    .line 297
    invoke-direct {p0, p1, v0}, Lcom/alibaba/fastjson2/JSONReader;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Z)V

    const/4 p1, -0x1

    .line 298
    iput p1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->cacheIndex:I

    const/4 p1, 0x0

    .line 299
    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->str:Ljava/lang/String;

    .line 300
    div-int/lit8 p1, p4, 0x2

    new-array p1, p1, [C

    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    add-int p1, p3, p4

    move v1, p3

    :goto_0
    if-ge v1, p1, :cond_0

    .line 301
    aget-byte v2, p2, v1

    add-int/lit8 v3, v1, 0x1

    .line 302
    aget-byte v3, p2, v3

    .line 303
    iget-object v4, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    and-int/lit16 v3, v3, 0xff

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x8

    or-int/2addr v2, v3

    int-to-char v2, v2

    aput-char v2, v4, v0

    add-int/lit8 v1, v1, 0x2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 304
    :cond_0
    iput p3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->start:I

    .line 305
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->length:I

    iput v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 306
    iget p1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    const/16 p2, 0x1a

    if-lt p1, v0, :cond_1

    .line 307
    iput-char p2, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    return-void

    .line 308
    :cond_1
    iget-object p3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    aget-char p1, p3, p1

    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 309
    :goto_1
    iget-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const-wide/16 v0, 0x0

    const-wide v2, 0x100003701L

    const-wide/16 v4, 0x1

    const/16 p3, 0x20

    if-gt p1, p3, :cond_3

    shl-long v6, v4, p1

    and-long/2addr v6, v2

    cmp-long p1, v6, v0

    if-eqz p1, :cond_3

    .line 310
    iget p1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    if-lt p1, p4, :cond_2

    .line 311
    iput-char p2, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    return-void

    .line 312
    :cond_2
    iget-object p3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    aget-char p1, p3, p1

    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    goto :goto_1

    .line 313
    :cond_3
    :goto_2
    iget-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    if-gt p1, p3, :cond_5

    shl-long v6, v4, p1

    and-long/2addr v6, v2

    cmp-long v6, v6, v0

    if-eqz v6, :cond_5

    .line 314
    iget p1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    if-lt p1, p4, :cond_4

    .line 315
    iput-char p2, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    return-void

    .line 316
    :cond_4
    iget-object v6, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    aget-char p1, v6, p1

    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    goto :goto_2

    .line 317
    :cond_5
    iget p2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    add-int/lit8 p2, p2, 0x1

    iput p2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    const p2, 0xfffe

    if-eq p1, p2, :cond_6

    const p2, 0xfeff

    if-ne p1, p2, :cond_7

    .line 318
    :cond_6
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->next()V

    .line 319
    :cond_7
    iget-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 p2, 0x2f

    if-ne p1, p2, :cond_8

    .line 320
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->skipComment()V

    :cond_8
    return-void
.end method

.method public static getInt([CI)I
    .locals 6

    .line 1
    sget-object v0, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 2
    .line 3
    sget-wide v1, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_CHAR_BASE_OFFSET:J

    .line 4
    .line 5
    shl-int/lit8 p1, p1, 0x1

    .line 6
    .line 7
    int-to-long v3, p1

    .line 8
    add-long/2addr v1, v3

    .line 9
    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 10
    .line 11
    .line 12
    move-result-wide p0

    .line 13
    sget-wide v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->CHAR_MASK:J

    .line 14
    .line 15
    and-long/2addr v0, p0

    .line 16
    const-wide/16 v2, 0x0

    .line 17
    .line 18
    cmp-long v0, v0, v2

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    return p0

    .line 24
    :cond_0
    sget-boolean v0, Lcom/alibaba/fastjson2/util/JDKUtils;->BIG_ENDIAN:Z

    .line 25
    .line 26
    const/16 v1, 0x8

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    shr-long/2addr p0, v1

    .line 31
    :cond_1
    const-wide/16 v2, 0xff

    .line 32
    .line 33
    and-long/2addr v2, p0

    .line 34
    const-wide/32 v4, 0xff0000

    .line 35
    .line 36
    .line 37
    and-long/2addr v4, p0

    .line 38
    shr-long v0, v4, v1

    .line 39
    .line 40
    or-long/2addr v0, v2

    .line 41
    const-wide v2, 0xff00000000L

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    and-long/2addr v2, p0

    .line 47
    const/16 v4, 0x10

    .line 48
    .line 49
    shr-long/2addr v2, v4

    .line 50
    or-long/2addr v0, v2

    .line 51
    const-wide/high16 v2, 0xff000000000000L

    .line 52
    .line 53
    and-long/2addr p0, v2

    .line 54
    const/16 v2, 0x18

    .line 55
    .line 56
    shr-long/2addr p0, v2

    .line 57
    or-long/2addr p0, v0

    .line 58
    long-to-int p0, p0

    .line 59
    return p0
.end method

.method public static getLong([CI)J
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-wide v1, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_CHAR_BASE_OFFSET:J

    .line 4
    .line 5
    shl-int/lit8 v3, p1, 0x1

    .line 6
    .line 7
    int-to-long v3, v3

    .line 8
    add-long/2addr v1, v3

    .line 9
    sget-object v3, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 10
    .line 11
    invoke-virtual {v3, v0, v1, v2}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 12
    .line 13
    .line 14
    move-result-wide v4

    .line 15
    const-wide/16 v6, 0x8

    .line 16
    .line 17
    add-long/2addr v1, v6

    .line 18
    invoke-virtual {v3, v0, v1, v2}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    or-long v2, v4, v0

    .line 23
    .line 24
    sget-wide v6, Lcom/alibaba/fastjson2/JSONReaderUTF16;->CHAR_MASK:J

    .line 25
    .line 26
    and-long/2addr v2, v6

    .line 27
    const-wide/16 v6, 0x0

    .line 28
    .line 29
    cmp-long v2, v2, v6

    .line 30
    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    return-wide v6

    .line 34
    :cond_0
    sget-boolean v2, Lcom/alibaba/fastjson2/util/JDKUtils;->BIG_ENDIAN:Z

    .line 35
    .line 36
    const/16 v3, 0x8

    .line 37
    .line 38
    if-eqz v2, :cond_1

    .line 39
    .line 40
    shr-long/2addr v4, v3

    .line 41
    shr-long/2addr v0, v3

    .line 42
    :cond_1
    const-wide/16 v6, 0xff

    .line 43
    .line 44
    and-long v8, v4, v6

    .line 45
    .line 46
    const-wide/32 v10, 0xff0000

    .line 47
    .line 48
    .line 49
    and-long v12, v4, v10

    .line 50
    .line 51
    shr-long/2addr v12, v3

    .line 52
    or-long/2addr v8, v12

    .line 53
    const-wide v12, 0xff00000000L

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    and-long v14, v4, v12

    .line 59
    .line 60
    const/16 v2, 0x10

    .line 61
    .line 62
    shr-long/2addr v14, v2

    .line 63
    or-long/2addr v8, v14

    .line 64
    const-wide/high16 v14, 0xff000000000000L

    .line 65
    .line 66
    and-long/2addr v4, v14

    .line 67
    const/16 v16, 0x18

    .line 68
    .line 69
    shr-long v4, v4, v16

    .line 70
    .line 71
    or-long/2addr v4, v8

    .line 72
    and-long/2addr v6, v0

    .line 73
    const/16 v8, 0x20

    .line 74
    .line 75
    shl-long/2addr v6, v8

    .line 76
    or-long/2addr v4, v6

    .line 77
    and-long v6, v0, v10

    .line 78
    .line 79
    shl-long v6, v6, v16

    .line 80
    .line 81
    or-long/2addr v4, v6

    .line 82
    and-long v6, v0, v12

    .line 83
    .line 84
    shl-long/2addr v6, v2

    .line 85
    or-long/2addr v4, v6

    .line 86
    and-long/2addr v0, v14

    .line 87
    shl-long/2addr v0, v3

    .line 88
    or-long/2addr v0, v4

    .line 89
    return-wide v0
.end method

.method private isReference0([CIIC)Z
    .locals 14

    .line 1
    move/from16 v0, p3

    .line 2
    .line 3
    add-int/lit8 v1, p2, 0x6

    .line 4
    .line 5
    aget-char v2, p1, v1

    .line 6
    .line 7
    :goto_0
    const-wide/16 v3, 0x0

    .line 8
    .line 9
    const-wide v5, 0x100003701L

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    const-wide/16 v7, 0x1

    .line 15
    .line 16
    const/16 v9, 0x20

    .line 17
    .line 18
    const/4 v10, 0x0

    .line 19
    if-gt v2, v9, :cond_1

    .line 20
    .line 21
    shl-long v11, v7, v2

    .line 22
    .line 23
    and-long/2addr v11, v5

    .line 24
    cmp-long v11, v11, v3

    .line 25
    .line 26
    if-eqz v11, :cond_1

    .line 27
    .line 28
    add-int/lit8 v1, v1, 0x1

    .line 29
    .line 30
    if-lt v1, v0, :cond_0

    .line 31
    .line 32
    return v10

    .line 33
    :cond_0
    aget-char v2, p1, v1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/16 v11, 0x3a

    .line 37
    .line 38
    if-ne v2, v11, :cond_6

    .line 39
    .line 40
    const/4 v2, 0x1

    .line 41
    add-int/2addr v1, v2

    .line 42
    if-lt v1, v0, :cond_2

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_2
    aget-char v11, p1, v1

    .line 46
    .line 47
    :goto_1
    if-gt v11, v9, :cond_4

    .line 48
    .line 49
    shl-long v12, v7, v11

    .line 50
    .line 51
    and-long/2addr v12, v5

    .line 52
    cmp-long v12, v12, v3

    .line 53
    .line 54
    if-eqz v12, :cond_4

    .line 55
    .line 56
    add-int/lit8 v1, v1, 0x1

    .line 57
    .line 58
    if-lt v1, v0, :cond_3

    .line 59
    .line 60
    return v10

    .line 61
    :cond_3
    aget-char v11, p1, v1

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_4
    move/from16 v3, p4

    .line 65
    .line 66
    if-ne v11, v3, :cond_6

    .line 67
    .line 68
    add-int/lit8 v3, v1, 0x1

    .line 69
    .line 70
    if-ge v3, v0, :cond_5

    .line 71
    .line 72
    aget-char p1, p1, v3

    .line 73
    .line 74
    const/16 v0, 0x24

    .line 75
    .line 76
    if-eq p1, v0, :cond_5

    .line 77
    .line 78
    const/16 v0, 0x2e

    .line 79
    .line 80
    if-eq p1, v0, :cond_5

    .line 81
    .line 82
    const/16 v0, 0x40

    .line 83
    .line 84
    if-eq p1, v0, :cond_5

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_5
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->referenceBegin:I

    .line 88
    .line 89
    return v2

    .line 90
    :cond_6
    :goto_2
    return v10
.end method

.method private skipString()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-char v1, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 4
    .line 5
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 6
    .line 7
    iget-object v3, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 8
    .line 9
    add-int/lit8 v4, v2, 0x1

    .line 10
    .line 11
    aget-char v2, v3, v2

    .line 12
    .line 13
    :goto_0
    const/16 v5, 0x5c

    .line 14
    .line 15
    if-ne v2, v5, :cond_4

    .line 16
    .line 17
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 18
    .line 19
    if-ge v4, v2, :cond_3

    .line 20
    .line 21
    add-int/lit8 v2, v4, 0x1

    .line 22
    .line 23
    aget-char v6, v3, v4

    .line 24
    .line 25
    if-eq v6, v5, :cond_2

    .line 26
    .line 27
    const/16 v5, 0x22

    .line 28
    .line 29
    if-ne v6, v5, :cond_0

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_0
    const/16 v5, 0x75

    .line 33
    .line 34
    if-ne v6, v5, :cond_1

    .line 35
    .line 36
    add-int/lit8 v2, v4, 0x5

    .line 37
    .line 38
    add-int/lit8 v4, v4, 0x6

    .line 39
    .line 40
    aget-char v2, v3, v2

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    invoke-virtual {v0, v6}, Lcom/alibaba/fastjson2/JSONReader;->char1(I)C

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    :goto_1
    move/from16 v16, v4

    .line 48
    .line 49
    move v4, v2

    .line 50
    move/from16 v2, v16

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    :goto_2
    add-int/lit8 v4, v4, 0x2

    .line 54
    .line 55
    aget-char v2, v3, v2

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_3
    const-string v1, "illegal string, end"

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-static {v1}, Lah/a;->w(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :cond_4
    iget v5, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 69
    .line 70
    const/16 v6, 0x1a

    .line 71
    .line 72
    if-ne v2, v1, :cond_6

    .line 73
    .line 74
    if-ge v4, v5, :cond_5

    .line 75
    .line 76
    add-int/lit8 v1, v4, 0x1

    .line 77
    .line 78
    aget-char v2, v3, v4

    .line 79
    .line 80
    :goto_3
    move v4, v1

    .line 81
    goto :goto_4

    .line 82
    :cond_5
    move v2, v6

    .line 83
    goto :goto_4

    .line 84
    :cond_6
    if-ge v4, v5, :cond_5

    .line 85
    .line 86
    add-int/lit8 v2, v4, 0x1

    .line 87
    .line 88
    aget-char v4, v3, v4

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :goto_4
    const-wide/16 v7, 0x0

    .line 92
    .line 93
    const-wide v9, 0x100003701L

    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    const-wide/16 v11, 0x1

    .line 99
    .line 100
    const/16 v1, 0x20

    .line 101
    .line 102
    if-gt v2, v1, :cond_7

    .line 103
    .line 104
    shl-long v13, v11, v2

    .line 105
    .line 106
    and-long/2addr v13, v9

    .line 107
    cmp-long v5, v13, v7

    .line 108
    .line 109
    if-eqz v5, :cond_7

    .line 110
    .line 111
    add-int/lit8 v1, v4, 0x1

    .line 112
    .line 113
    aget-char v2, v3, v4

    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_7
    const/16 v5, 0x2c

    .line 117
    .line 118
    const/4 v13, 0x1

    .line 119
    if-ne v2, v5, :cond_8

    .line 120
    .line 121
    move v5, v13

    .line 122
    goto :goto_5

    .line 123
    :cond_8
    const/4 v5, 0x0

    .line 124
    :goto_5
    iput-boolean v5, v0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 125
    .line 126
    if-eqz v5, :cond_c

    .line 127
    .line 128
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 129
    .line 130
    if-lt v4, v2, :cond_9

    .line 131
    .line 132
    iput-char v6, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 133
    .line 134
    iput v4, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 135
    .line 136
    return-void

    .line 137
    :cond_9
    aget-char v2, v3, v4

    .line 138
    .line 139
    :goto_6
    if-gt v2, v1, :cond_b

    .line 140
    .line 141
    shl-long v14, v11, v2

    .line 142
    .line 143
    and-long/2addr v14, v9

    .line 144
    cmp-long v5, v14, v7

    .line 145
    .line 146
    if-eqz v5, :cond_b

    .line 147
    .line 148
    add-int/lit8 v4, v4, 0x1

    .line 149
    .line 150
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 151
    .line 152
    if-lt v4, v2, :cond_a

    .line 153
    .line 154
    iput-char v6, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 155
    .line 156
    iput v4, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 157
    .line 158
    return-void

    .line 159
    :cond_a
    aget-char v2, v3, v4

    .line 160
    .line 161
    goto :goto_6

    .line 162
    :cond_b
    add-int/2addr v4, v13

    .line 163
    :cond_c
    iput-char v2, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 164
    .line 165
    iput v4, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 166
    .line 167
    return-void
.end method


# virtual methods
.method public close()V
    .locals 4

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->cacheIndex:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 7
    .line 8
    array-length v2, v1

    .line 9
    const/high16 v3, 0x100000

    .line 10
    .line 11
    if-ge v2, v3, :cond_0

    .line 12
    .line 13
    sget-object v2, Lcom/alibaba/fastjson2/JSONFactory;->CACHE_ITEMS:[Lcom/alibaba/fastjson2/JSONFactory$CacheItem;

    .line 14
    .line 15
    aget-object v0, v2, v0

    .line 16
    .line 17
    sget-object v2, Lcom/alibaba/fastjson2/JSONFactory;->CHARS_UPDATER:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 18
    .line 19
    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->input:Ljava/io/Closeable;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    :try_start_0
    invoke-interface {v0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    .line 28
    .line 29
    :catch_0
    :cond_1
    return-void
.end method

.method public getFieldName()Ljava/lang/String;
    .locals 9

    .line 1
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/JSONReader;->nameEscape:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->str:Ljava/lang/String;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->nameBegin:I

    .line 10
    .line 11
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->nameEnd:I

    .line 12
    .line 13
    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0

    .line 18
    :cond_0
    new-instance v0, Ljava/lang/String;

    .line 19
    .line 20
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 21
    .line 22
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->nameBegin:I

    .line 23
    .line 24
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->nameEnd:I

    .line 25
    .line 26
    sub-int/2addr v3, v2

    .line 27
    invoke-direct {v0, v1, v2, v3}, Ljava/lang/String;-><init>([CII)V

    .line 28
    .line 29
    .line 30
    return-object v0

    .line 31
    :cond_1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->nameLength:I

    .line 32
    .line 33
    new-array v0, v0, [C

    .line 34
    .line 35
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 36
    .line 37
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->nameBegin:I

    .line 38
    .line 39
    const/4 v3, 0x0

    .line 40
    :goto_0
    iget v4, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->nameEnd:I

    .line 41
    .line 42
    if-ge v2, v4, :cond_7

    .line 43
    .line 44
    aget-char v4, v1, v2

    .line 45
    .line 46
    const/16 v5, 0x22

    .line 47
    .line 48
    const/16 v6, 0x5c

    .line 49
    .line 50
    if-ne v4, v6, :cond_5

    .line 51
    .line 52
    add-int/lit8 v4, v2, 0x1

    .line 53
    .line 54
    aget-char v7, v1, v4

    .line 55
    .line 56
    if-eq v7, v5, :cond_4

    .line 57
    .line 58
    const/16 v5, 0x3a

    .line 59
    .line 60
    if-eq v7, v5, :cond_4

    .line 61
    .line 62
    const/16 v5, 0x40

    .line 63
    .line 64
    if-eq v7, v5, :cond_4

    .line 65
    .line 66
    if-eq v7, v6, :cond_4

    .line 67
    .line 68
    const/16 v5, 0x75

    .line 69
    .line 70
    if-eq v7, v5, :cond_3

    .line 71
    .line 72
    const/16 v5, 0x78

    .line 73
    .line 74
    if-eq v7, v5, :cond_2

    .line 75
    .line 76
    packed-switch v7, :pswitch_data_0

    .line 77
    .line 78
    .line 79
    packed-switch v7, :pswitch_data_1

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0, v7}, Lcom/alibaba/fastjson2/JSONReader;->char1(I)C

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    move v8, v4

    .line 87
    move v4, v2

    .line 88
    move v2, v8

    .line 89
    goto :goto_1

    .line 90
    :cond_2
    add-int/lit8 v4, v2, 0x2

    .line 91
    .line 92
    aget-char v4, v1, v4

    .line 93
    .line 94
    add-int/lit8 v2, v2, 0x3

    .line 95
    .line 96
    aget-char v5, v1, v2

    .line 97
    .line 98
    invoke-static {v4, v5}, Lcom/alibaba/fastjson2/JSONReader;->char2(II)C

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    goto :goto_1

    .line 103
    :cond_3
    add-int/lit8 v4, v2, 0x2

    .line 104
    .line 105
    aget-char v4, v1, v4

    .line 106
    .line 107
    add-int/lit8 v5, v2, 0x3

    .line 108
    .line 109
    aget-char v5, v1, v5

    .line 110
    .line 111
    add-int/lit8 v6, v2, 0x4

    .line 112
    .line 113
    aget-char v6, v1, v6

    .line 114
    .line 115
    add-int/lit8 v2, v2, 0x5

    .line 116
    .line 117
    aget-char v7, v1, v2

    .line 118
    .line 119
    invoke-static {v4, v5, v6, v7}, Lcom/alibaba/fastjson2/JSONReader;->char4(IIII)C

    .line 120
    .line 121
    .line 122
    move-result v4

    .line 123
    goto :goto_1

    .line 124
    :cond_4
    :pswitch_0
    move v2, v4

    .line 125
    move v4, v7

    .line 126
    goto :goto_1

    .line 127
    :cond_5
    if-ne v4, v5, :cond_6

    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_6
    :goto_1
    aput-char v4, v0, v3

    .line 131
    .line 132
    add-int/lit8 v2, v2, 0x1

    .line 133
    .line 134
    add-int/lit8 v3, v3, 0x1

    .line 135
    .line 136
    goto :goto_0

    .line 137
    :cond_7
    :goto_2
    new-instance v1, Ljava/lang/String;

    .line 138
    .line 139
    invoke-direct {v1, v0}, Ljava/lang/String;-><init>([C)V

    .line 140
    .line 141
    .line 142
    return-object v1

    .line 143
    :pswitch_data_0
    .packed-switch 0x2a
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    :pswitch_data_1
    .packed-switch 0x3c
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public getNameHashCodeLCase()J
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->nameBegin:I

    .line 4
    .line 5
    iget-object v2, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 6
    .line 7
    const/16 v3, 0x27

    .line 8
    .line 9
    const/16 v4, 0x22

    .line 10
    .line 11
    if-lez v1, :cond_0

    .line 12
    .line 13
    add-int/lit8 v5, v1, -0x1

    .line 14
    .line 15
    aget-char v5, v2, v5

    .line 16
    .line 17
    if-ne v5, v3, :cond_0

    .line 18
    .line 19
    move v5, v3

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v5, v4

    .line 22
    :goto_0
    const/4 v8, 0x0

    .line 23
    const-wide/16 v9, 0x0

    .line 24
    .line 25
    :goto_1
    iget v11, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 26
    .line 27
    const/16 v14, 0x2d

    .line 28
    .line 29
    const/16 v15, 0x5f

    .line 30
    .line 31
    const-wide/16 v16, 0x0

    .line 32
    .line 33
    const/16 v6, 0x78

    .line 34
    .line 35
    const/16 v7, 0x75

    .line 36
    .line 37
    const/16 v12, 0x5c

    .line 38
    .line 39
    const/16 v13, 0x20

    .line 40
    .line 41
    if-ge v1, v11, :cond_a

    .line 42
    .line 43
    aget-char v11, v2, v1

    .line 44
    .line 45
    if-ne v11, v12, :cond_3

    .line 46
    .line 47
    add-int/lit8 v11, v1, 0x1

    .line 48
    .line 49
    aget-char v12, v2, v11

    .line 50
    .line 51
    if-eq v12, v7, :cond_2

    .line 52
    .line 53
    if-eq v12, v6, :cond_1

    .line 54
    .line 55
    invoke-virtual {v0, v12}, Lcom/alibaba/fastjson2/JSONReader;->char1(I)C

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    move/from16 v19, v11

    .line 60
    .line 61
    move v11, v1

    .line 62
    move/from16 v1, v19

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_1
    add-int/lit8 v11, v1, 0x2

    .line 66
    .line 67
    aget-char v11, v2, v11

    .line 68
    .line 69
    add-int/lit8 v1, v1, 0x3

    .line 70
    .line 71
    aget-char v12, v2, v1

    .line 72
    .line 73
    invoke-static {v11, v12}, Lcom/alibaba/fastjson2/JSONReader;->char2(II)C

    .line 74
    .line 75
    .line 76
    move-result v11

    .line 77
    goto :goto_2

    .line 78
    :cond_2
    add-int/lit8 v11, v1, 0x2

    .line 79
    .line 80
    aget-char v11, v2, v11

    .line 81
    .line 82
    add-int/lit8 v12, v1, 0x3

    .line 83
    .line 84
    aget-char v12, v2, v12

    .line 85
    .line 86
    add-int/lit8 v18, v1, 0x4

    .line 87
    .line 88
    aget-char v6, v2, v18

    .line 89
    .line 90
    add-int/lit8 v1, v1, 0x5

    .line 91
    .line 92
    aget-char v7, v2, v1

    .line 93
    .line 94
    invoke-static {v11, v12, v6, v7}, Lcom/alibaba/fastjson2/JSONReader;->char4(IIII)C

    .line 95
    .line 96
    .line 97
    move-result v11

    .line 98
    goto :goto_2

    .line 99
    :cond_3
    if-ne v11, v5, :cond_4

    .line 100
    .line 101
    goto/16 :goto_9

    .line 102
    .line 103
    :cond_4
    :goto_2
    const/16 v6, 0xff

    .line 104
    .line 105
    if-gt v11, v6, :cond_9

    .line 106
    .line 107
    const/16 v6, 0x8

    .line 108
    .line 109
    if-ge v8, v6, :cond_9

    .line 110
    .line 111
    if-nez v8, :cond_5

    .line 112
    .line 113
    if-nez v11, :cond_5

    .line 114
    .line 115
    goto/16 :goto_8

    .line 116
    .line 117
    :cond_5
    if-eq v11, v15, :cond_7

    .line 118
    .line 119
    if-eq v11, v14, :cond_7

    .line 120
    .line 121
    if-ne v11, v13, :cond_6

    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_6
    const/16 v7, 0x41

    .line 125
    .line 126
    goto :goto_4

    .line 127
    :cond_7
    :goto_3
    add-int/lit8 v7, v1, 0x1

    .line 128
    .line 129
    aget-char v7, v2, v7

    .line 130
    .line 131
    if-eq v7, v4, :cond_6

    .line 132
    .line 133
    if-eq v7, v3, :cond_6

    .line 134
    .line 135
    if-eq v7, v11, :cond_6

    .line 136
    .line 137
    goto :goto_7

    .line 138
    :goto_4
    if-lt v11, v7, :cond_8

    .line 139
    .line 140
    const/16 v7, 0x5a

    .line 141
    .line 142
    if-gt v11, v7, :cond_8

    .line 143
    .line 144
    add-int/lit8 v11, v11, 0x20

    .line 145
    .line 146
    int-to-char v11, v11

    .line 147
    :cond_8
    packed-switch v8, :pswitch_data_0

    .line 148
    .line 149
    .line 150
    goto :goto_6

    .line 151
    :pswitch_0
    int-to-byte v6, v11

    .line 152
    int-to-long v6, v6

    .line 153
    const/16 v11, 0x38

    .line 154
    .line 155
    shl-long/2addr v6, v11

    .line 156
    const-wide v11, 0xffffffffffffffL

    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    :goto_5
    and-long/2addr v9, v11

    .line 162
    add-long/2addr v9, v6

    .line 163
    goto :goto_6

    .line 164
    :pswitch_1
    int-to-byte v6, v11

    .line 165
    int-to-long v6, v6

    .line 166
    const/16 v11, 0x30

    .line 167
    .line 168
    shl-long/2addr v6, v11

    .line 169
    const-wide v11, 0xffffffffffffL

    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    goto :goto_5

    .line 175
    :pswitch_2
    int-to-byte v6, v11

    .line 176
    int-to-long v6, v6

    .line 177
    const/16 v11, 0x28

    .line 178
    .line 179
    shl-long/2addr v6, v11

    .line 180
    const-wide v11, 0xffffffffffL

    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    goto :goto_5

    .line 186
    :pswitch_3
    int-to-byte v6, v11

    .line 187
    int-to-long v6, v6

    .line 188
    shl-long/2addr v6, v13

    .line 189
    const-wide v11, 0xffffffffL

    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    goto :goto_5

    .line 195
    :pswitch_4
    int-to-byte v6, v11

    .line 196
    shl-int/lit8 v6, v6, 0x18

    .line 197
    .line 198
    int-to-long v6, v6

    .line 199
    const-wide/32 v11, 0xffffff

    .line 200
    .line 201
    .line 202
    goto :goto_5

    .line 203
    :pswitch_5
    int-to-byte v6, v11

    .line 204
    shl-int/lit8 v6, v6, 0x10

    .line 205
    .line 206
    int-to-long v6, v6

    .line 207
    const-wide/32 v11, 0xffff

    .line 208
    .line 209
    .line 210
    goto :goto_5

    .line 211
    :pswitch_6
    int-to-byte v7, v11

    .line 212
    shl-int/lit8 v6, v7, 0x8

    .line 213
    .line 214
    int-to-long v6, v6

    .line 215
    const-wide/16 v11, 0xff

    .line 216
    .line 217
    goto :goto_5

    .line 218
    :pswitch_7
    int-to-byte v6, v11

    .line 219
    int-to-long v9, v6

    .line 220
    :goto_6
    add-int/lit8 v8, v8, 0x1

    .line 221
    .line 222
    :goto_7
    add-int/lit8 v1, v1, 0x1

    .line 223
    .line 224
    goto/16 :goto_1

    .line 225
    .line 226
    :cond_9
    :goto_8
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->nameBegin:I

    .line 227
    .line 228
    move-wide/from16 v9, v16

    .line 229
    .line 230
    :cond_a
    :goto_9
    cmp-long v6, v9, v16

    .line 231
    .line 232
    if-eqz v6, :cond_b

    .line 233
    .line 234
    return-wide v9

    .line 235
    :cond_b
    const-wide v6, -0x340d631b7bdddcdbL    # -7.302176725335867E57

    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    :goto_a
    iget v8, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 241
    .line 242
    if-ge v1, v8, :cond_13

    .line 243
    .line 244
    aget-char v8, v2, v1

    .line 245
    .line 246
    const/16 v9, 0x5c

    .line 247
    .line 248
    if-ne v8, v9, :cond_e

    .line 249
    .line 250
    add-int/lit8 v8, v1, 0x1

    .line 251
    .line 252
    aget-char v10, v2, v8

    .line 253
    .line 254
    const/16 v11, 0x75

    .line 255
    .line 256
    if-eq v10, v11, :cond_d

    .line 257
    .line 258
    const/16 v12, 0x78

    .line 259
    .line 260
    if-eq v10, v12, :cond_c

    .line 261
    .line 262
    invoke-virtual {v0, v10}, Lcom/alibaba/fastjson2/JSONReader;->char1(I)C

    .line 263
    .line 264
    .line 265
    move-result v1

    .line 266
    move/from16 v19, v8

    .line 267
    .line 268
    move v8, v1

    .line 269
    move/from16 v1, v19

    .line 270
    .line 271
    goto :goto_b

    .line 272
    :cond_c
    add-int/lit8 v8, v1, 0x2

    .line 273
    .line 274
    aget-char v8, v2, v8

    .line 275
    .line 276
    add-int/lit8 v1, v1, 0x3

    .line 277
    .line 278
    aget-char v10, v2, v1

    .line 279
    .line 280
    invoke-static {v8, v10}, Lcom/alibaba/fastjson2/JSONReader;->char2(II)C

    .line 281
    .line 282
    .line 283
    move-result v8

    .line 284
    goto :goto_b

    .line 285
    :cond_d
    const/16 v12, 0x78

    .line 286
    .line 287
    add-int/lit8 v8, v1, 0x2

    .line 288
    .line 289
    aget-char v8, v2, v8

    .line 290
    .line 291
    add-int/lit8 v10, v1, 0x3

    .line 292
    .line 293
    aget-char v10, v2, v10

    .line 294
    .line 295
    add-int/lit8 v16, v1, 0x4

    .line 296
    .line 297
    aget-char v9, v2, v16

    .line 298
    .line 299
    add-int/lit8 v1, v1, 0x5

    .line 300
    .line 301
    aget-char v11, v2, v1

    .line 302
    .line 303
    invoke-static {v8, v10, v9, v11}, Lcom/alibaba/fastjson2/JSONReader;->char4(IIII)C

    .line 304
    .line 305
    .line 306
    move-result v8

    .line 307
    goto :goto_b

    .line 308
    :cond_e
    const/16 v12, 0x78

    .line 309
    .line 310
    if-ne v8, v5, :cond_f

    .line 311
    .line 312
    goto :goto_e

    .line 313
    :cond_f
    :goto_b
    add-int/lit8 v1, v1, 0x1

    .line 314
    .line 315
    if-eq v8, v15, :cond_11

    .line 316
    .line 317
    if-eq v8, v14, :cond_11

    .line 318
    .line 319
    if-ne v8, v13, :cond_10

    .line 320
    .line 321
    goto :goto_c

    .line 322
    :cond_10
    const/16 v9, 0x41

    .line 323
    .line 324
    goto :goto_d

    .line 325
    :cond_11
    :goto_c
    aget-char v9, v2, v1

    .line 326
    .line 327
    if-eq v9, v4, :cond_10

    .line 328
    .line 329
    if-eq v9, v3, :cond_10

    .line 330
    .line 331
    if-eq v9, v8, :cond_10

    .line 332
    .line 333
    goto :goto_a

    .line 334
    :goto_d
    const/16 v10, 0x5a

    .line 335
    .line 336
    if-lt v8, v9, :cond_12

    .line 337
    .line 338
    if-gt v8, v10, :cond_12

    .line 339
    .line 340
    add-int/lit8 v8, v8, 0x20

    .line 341
    .line 342
    int-to-char v8, v8

    .line 343
    :cond_12
    int-to-long v3, v8

    .line 344
    xor-long/2addr v3, v6

    .line 345
    const-wide v6, 0x100000001b3L

    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    mul-long/2addr v6, v3

    .line 351
    const/16 v3, 0x27

    .line 352
    .line 353
    const/16 v4, 0x22

    .line 354
    .line 355
    goto :goto_a

    .line 356
    :cond_13
    :goto_e
    return-wide v6

    .line 357
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final getRawInt()I
    .locals 4

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x3

    .line 4
    .line 5
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 6
    .line 7
    array-length v3, v2

    .line 8
    if-ge v1, v3, :cond_0

    .line 9
    .line 10
    add-int/lit8 v0, v0, -0x1

    .line 11
    .line 12
    invoke-static {v2, v0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getInt([CI)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return v0
.end method

.method public final getRawLong()J
    .locals 4

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x7

    .line 4
    .line 5
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 6
    .line 7
    array-length v3, v2

    .line 8
    if-ge v1, v3, :cond_0

    .line 9
    .line 10
    add-int/lit8 v0, v0, -0x1

    .line 11
    .line 12
    invoke-static {v2, v0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    return-wide v0

    .line 17
    :cond_0
    const-wide/16 v0, 0x0

    .line 18
    .line 19
    return-wide v0
.end method

.method public getString()Ljava/lang/String;
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader;->stringValue:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->nameEnd:I

    .line 7
    .line 8
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->nameBegin:I

    .line 9
    .line 10
    sub-int/2addr v0, v1

    .line 11
    iget-boolean v2, p0, Lcom/alibaba/fastjson2/JSONReader;->nameEscape:Z

    .line 12
    .line 13
    if-nez v2, :cond_1

    .line 14
    .line 15
    new-instance v2, Ljava/lang/String;

    .line 16
    .line 17
    iget-object v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 18
    .line 19
    invoke-direct {v2, v3, v1, v0}, Ljava/lang/String;-><init>([CII)V

    .line 20
    .line 21
    .line 22
    return-object v2

    .line 23
    :cond_1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->nameLength:I

    .line 24
    .line 25
    new-array v0, v0, [C

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    :goto_0
    iget-object v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 29
    .line 30
    aget-char v4, v3, v1

    .line 31
    .line 32
    const/16 v5, 0x22

    .line 33
    .line 34
    const/16 v6, 0x5c

    .line 35
    .line 36
    if-ne v4, v6, :cond_5

    .line 37
    .line 38
    add-int/lit8 v4, v1, 0x1

    .line 39
    .line 40
    aget-char v7, v3, v4

    .line 41
    .line 42
    if-eq v7, v5, :cond_4

    .line 43
    .line 44
    if-eq v7, v6, :cond_4

    .line 45
    .line 46
    const/16 v5, 0x75

    .line 47
    .line 48
    if-eq v7, v5, :cond_3

    .line 49
    .line 50
    const/16 v5, 0x78

    .line 51
    .line 52
    if-eq v7, v5, :cond_2

    .line 53
    .line 54
    invoke-virtual {p0, v7}, Lcom/alibaba/fastjson2/JSONReader;->char1(I)C

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    move v8, v4

    .line 59
    move v4, v1

    .line 60
    move v1, v8

    .line 61
    goto :goto_1

    .line 62
    :cond_2
    add-int/lit8 v4, v1, 0x2

    .line 63
    .line 64
    aget-char v4, v3, v4

    .line 65
    .line 66
    add-int/lit8 v1, v1, 0x3

    .line 67
    .line 68
    aget-char v3, v3, v1

    .line 69
    .line 70
    invoke-static {v4, v3}, Lcom/alibaba/fastjson2/JSONReader;->char2(II)C

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    goto :goto_1

    .line 75
    :cond_3
    add-int/lit8 v4, v1, 0x2

    .line 76
    .line 77
    aget-char v4, v3, v4

    .line 78
    .line 79
    add-int/lit8 v5, v1, 0x3

    .line 80
    .line 81
    aget-char v5, v3, v5

    .line 82
    .line 83
    add-int/lit8 v6, v1, 0x4

    .line 84
    .line 85
    aget-char v6, v3, v6

    .line 86
    .line 87
    add-int/lit8 v1, v1, 0x5

    .line 88
    .line 89
    aget-char v3, v3, v1

    .line 90
    .line 91
    invoke-static {v4, v5, v6, v3}, Lcom/alibaba/fastjson2/JSONReader;->char4(IIII)C

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    goto :goto_1

    .line 96
    :cond_4
    move v1, v4

    .line 97
    move v4, v7

    .line 98
    goto :goto_1

    .line 99
    :cond_5
    if-ne v4, v5, :cond_6

    .line 100
    .line 101
    new-instance v1, Ljava/lang/String;

    .line 102
    .line 103
    invoke-direct {v1, v0}, Ljava/lang/String;-><init>([C)V

    .line 104
    .line 105
    .line 106
    iput-object v1, p0, Lcom/alibaba/fastjson2/JSONReader;->stringValue:Ljava/lang/String;

    .line 107
    .line 108
    return-object v1

    .line 109
    :cond_6
    :goto_1
    aput-char v4, v0, v2

    .line 110
    .line 111
    add-int/lit8 v1, v1, 0x1

    .line 112
    .line 113
    add-int/lit8 v2, v2, 0x1

    .line 114
    .line 115
    goto :goto_0
.end method

.method public getStringLength()I
    .locals 6

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    if-eq v0, v1, :cond_1

    .line 6
    .line 7
    const/16 v1, 0x27

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string v0, "date only support string input"

    .line 13
    .line 14
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    return v0

    .line 19
    :cond_1
    :goto_0
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 20
    .line 21
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 22
    .line 23
    add-int/lit8 v3, v1, 0x8

    .line 24
    .line 25
    iget v4, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 26
    .line 27
    if-ge v3, v4, :cond_2

    .line 28
    .line 29
    array-length v4, v2

    .line 30
    if-ge v3, v4, :cond_2

    .line 31
    .line 32
    aget-char v4, v2, v1

    .line 33
    .line 34
    if-eq v4, v0, :cond_2

    .line 35
    .line 36
    add-int/lit8 v4, v1, 0x1

    .line 37
    .line 38
    aget-char v4, v2, v4

    .line 39
    .line 40
    if-eq v4, v0, :cond_2

    .line 41
    .line 42
    add-int/lit8 v4, v1, 0x2

    .line 43
    .line 44
    aget-char v4, v2, v4

    .line 45
    .line 46
    if-eq v4, v0, :cond_2

    .line 47
    .line 48
    add-int/lit8 v4, v1, 0x3

    .line 49
    .line 50
    aget-char v4, v2, v4

    .line 51
    .line 52
    if-eq v4, v0, :cond_2

    .line 53
    .line 54
    add-int/lit8 v4, v1, 0x4

    .line 55
    .line 56
    aget-char v4, v2, v4

    .line 57
    .line 58
    if-eq v4, v0, :cond_2

    .line 59
    .line 60
    add-int/lit8 v4, v1, 0x5

    .line 61
    .line 62
    aget-char v4, v2, v4

    .line 63
    .line 64
    if-eq v4, v0, :cond_2

    .line 65
    .line 66
    add-int/lit8 v4, v1, 0x6

    .line 67
    .line 68
    aget-char v4, v2, v4

    .line 69
    .line 70
    if-eq v4, v0, :cond_2

    .line 71
    .line 72
    add-int/lit8 v4, v1, 0x7

    .line 73
    .line 74
    aget-char v4, v2, v4

    .line 75
    .line 76
    if-eq v4, v0, :cond_2

    .line 77
    .line 78
    const/16 v1, 0x8

    .line 79
    .line 80
    move v5, v3

    .line 81
    move v3, v1

    .line 82
    move v1, v5

    .line 83
    goto :goto_1

    .line 84
    :cond_2
    const/4 v3, 0x0

    .line 85
    :goto_1
    iget v4, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 86
    .line 87
    if-ge v1, v4, :cond_4

    .line 88
    .line 89
    aget-char v4, v2, v1

    .line 90
    .line 91
    if-ne v4, v0, :cond_3

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 95
    .line 96
    add-int/lit8 v3, v3, 0x1

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_4
    :goto_2
    return v3
.end method

.method public info(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    move v3, v0

    .line 4
    move v2, v1

    .line 5
    move v4, v2

    .line 6
    :goto_0
    iget v5, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 7
    .line 8
    if-ge v2, v5, :cond_0

    .line 9
    .line 10
    move v5, v0

    .line 11
    goto :goto_1

    .line 12
    :cond_0
    move v5, v1

    .line 13
    :goto_1
    iget v6, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 14
    .line 15
    if-ge v2, v6, :cond_1

    .line 16
    .line 17
    move v6, v0

    .line 18
    goto :goto_2

    .line 19
    :cond_1
    move v6, v1

    .line 20
    :goto_2
    and-int/2addr v5, v6

    .line 21
    const/16 v6, 0xa

    .line 22
    .line 23
    if-eqz v5, :cond_3

    .line 24
    .line 25
    iget-object v5, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 26
    .line 27
    aget-char v5, v5, v2

    .line 28
    .line 29
    if-ne v5, v6, :cond_2

    .line 30
    .line 31
    add-int/lit8 v3, v3, 0x1

    .line 32
    .line 33
    move v4, v0

    .line 34
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 35
    .line 36
    add-int/2addr v4, v0

    .line 37
    goto :goto_0

    .line 38
    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 41
    .line 42
    .line 43
    if-eqz p1, :cond_4

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-nez v2, :cond_4

    .line 50
    .line 51
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string p1, ", "

    .line 55
    .line 56
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    :cond_4
    const-string p1, "offset "

    .line 60
    .line 61
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    iget p1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 65
    .line 66
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-string p1, ", character "

    .line 70
    .line 71
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    iget-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 75
    .line 76
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    const-string p1, ", line "

    .line 80
    .line 81
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    const-string p1, ", column "

    .line 88
    .line 89
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    const-string p1, ", fastjson-version 2.0.60"

    .line 96
    .line 97
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    if-le v3, v0, :cond_5

    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_5
    const/16 v6, 0x20

    .line 104
    .line 105
    :goto_3
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    iget-object p1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 109
    .line 110
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->start:I

    .line 111
    .line 112
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->length:I

    .line 113
    .line 114
    const v3, 0xffff

    .line 115
    .line 116
    .line 117
    if-ge v2, v3, :cond_6

    .line 118
    .line 119
    goto :goto_4

    .line 120
    :cond_6
    move v2, v3

    .line 121
    :goto_4
    invoke-virtual {v1, p1, v0, v2}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    return-object p1
.end method

.method public isArray()Z
    .locals 2

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 2
    .line 3
    const/16 v1, 0x5b

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public isNull()Z
    .locals 2

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 2
    .line 3
    const/16 v1, 0x6e

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 8
    .line 9
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 10
    .line 11
    if-ge v0, v1, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 14
    .line 15
    aget-char v0, v1, v0

    .line 16
    .line 17
    const/16 v1, 0x75

    .line 18
    .line 19
    if-ne v0, v1, :cond_0

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    return v0

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    return v0
.end method

.method public final isReference()Z
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 2
    .line 3
    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 4
    .line 5
    const-wide v2, 0x200000000L

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    and-long/2addr v0, v2

    .line 11
    const-wide/16 v2, 0x0

    .line 12
    .line 13
    cmp-long v0, v0, v2

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    return v1

    .line 19
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 20
    .line 21
    iget-char v4, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 22
    .line 23
    const/16 v5, 0x7b

    .line 24
    .line 25
    if-eq v4, v5, :cond_1

    .line 26
    .line 27
    return v1

    .line 28
    :cond_1
    iget v4, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 29
    .line 30
    iget v5, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 31
    .line 32
    if-ne v4, v5, :cond_2

    .line 33
    .line 34
    return v1

    .line 35
    :cond_2
    aget-char v6, v0, v4

    .line 36
    .line 37
    :goto_0
    const/16 v7, 0x20

    .line 38
    .line 39
    if-gt v6, v7, :cond_4

    .line 40
    .line 41
    const-wide/16 v7, 0x1

    .line 42
    .line 43
    shl-long/2addr v7, v6

    .line 44
    const-wide v9, 0x100003701L

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    and-long/2addr v7, v9

    .line 50
    cmp-long v7, v7, v2

    .line 51
    .line 52
    if-eqz v7, :cond_4

    .line 53
    .line 54
    add-int/lit8 v4, v4, 0x1

    .line 55
    .line 56
    if-lt v4, v5, :cond_3

    .line 57
    .line 58
    return v1

    .line 59
    :cond_3
    aget-char v6, v0, v4

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_4
    add-int/lit8 v2, v4, 0x6

    .line 63
    .line 64
    if-ge v2, v5, :cond_6

    .line 65
    .line 66
    add-int/lit8 v2, v4, 0x1

    .line 67
    .line 68
    aget-char v2, v0, v2

    .line 69
    .line 70
    const/16 v3, 0x24

    .line 71
    .line 72
    if-ne v2, v3, :cond_6

    .line 73
    .line 74
    add-int/lit8 v2, v4, 0x2

    .line 75
    .line 76
    aget-char v2, v0, v2

    .line 77
    .line 78
    const/16 v3, 0x72

    .line 79
    .line 80
    if-ne v2, v3, :cond_6

    .line 81
    .line 82
    add-int/lit8 v2, v4, 0x3

    .line 83
    .line 84
    aget-char v2, v0, v2

    .line 85
    .line 86
    const/16 v3, 0x65

    .line 87
    .line 88
    if-ne v2, v3, :cond_6

    .line 89
    .line 90
    add-int/lit8 v2, v4, 0x4

    .line 91
    .line 92
    aget-char v2, v0, v2

    .line 93
    .line 94
    const/16 v3, 0x66

    .line 95
    .line 96
    if-ne v2, v3, :cond_6

    .line 97
    .line 98
    add-int/lit8 v2, v4, 0x5

    .line 99
    .line 100
    aget-char v2, v0, v2

    .line 101
    .line 102
    if-eq v2, v6, :cond_5

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_5
    invoke-direct {p0, v0, v4, v5, v6}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->isReference0([CIIC)Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    return v0

    .line 110
    :cond_6
    :goto_1
    return v1
.end method

.method public next()V
    .locals 9

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 4
    .line 5
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 6
    .line 7
    const/16 v3, 0x1a

    .line 8
    .line 9
    if-lt v0, v2, :cond_0

    .line 10
    .line 11
    move v2, v0

    .line 12
    :goto_0
    move v0, v3

    .line 13
    goto :goto_1

    .line 14
    :cond_0
    add-int/lit8 v2, v0, 0x1

    .line 15
    .line 16
    aget-char v0, v1, v0

    .line 17
    .line 18
    :goto_1
    const/16 v4, 0x20

    .line 19
    .line 20
    if-gt v0, v4, :cond_2

    .line 21
    .line 22
    const-wide/16 v4, 0x1

    .line 23
    .line 24
    shl-long/2addr v4, v0

    .line 25
    const-wide v6, 0x100003701L

    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    and-long/2addr v4, v6

    .line 31
    const-wide/16 v6, 0x0

    .line 32
    .line 33
    cmp-long v4, v4, v6

    .line 34
    .line 35
    if-eqz v4, :cond_2

    .line 36
    .line 37
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 38
    .line 39
    if-ne v2, v0, :cond_1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    add-int/lit8 v0, v2, 0x1

    .line 43
    .line 44
    aget-char v2, v1, v2

    .line 45
    .line 46
    move v8, v2

    .line 47
    move v2, v0

    .line 48
    move v0, v8

    .line 49
    goto :goto_1

    .line 50
    :cond_2
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 51
    .line 52
    iput-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 53
    .line 54
    const/16 v1, 0x2f

    .line 55
    .line 56
    if-ne v0, v1, :cond_3

    .line 57
    .line 58
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->skipComment()V

    .line 59
    .line 60
    .line 61
    :cond_3
    return-void
.end method

.method public nextIfArrayEnd()Z
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-char v1, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 4
    .line 5
    const/16 v2, 0x5d

    .line 6
    .line 7
    if-eq v1, v2, :cond_0

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    return v1

    .line 11
    :cond_0
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 12
    .line 13
    iget-object v2, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 14
    .line 15
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 16
    .line 17
    const/16 v4, 0x1a

    .line 18
    .line 19
    if-ne v1, v3, :cond_1

    .line 20
    .line 21
    move v3, v1

    .line 22
    :goto_0
    move v1, v4

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    add-int/lit8 v3, v1, 0x1

    .line 25
    .line 26
    aget-char v1, v2, v1

    .line 27
    .line 28
    :goto_1
    const-wide/16 v5, 0x0

    .line 29
    .line 30
    const-wide v7, 0x100003701L

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    const-wide/16 v9, 0x1

    .line 36
    .line 37
    const/16 v11, 0x20

    .line 38
    .line 39
    if-gt v1, v11, :cond_3

    .line 40
    .line 41
    shl-long v12, v9, v1

    .line 42
    .line 43
    and-long/2addr v12, v7

    .line 44
    cmp-long v12, v12, v5

    .line 45
    .line 46
    if-eqz v12, :cond_3

    .line 47
    .line 48
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 49
    .line 50
    if-ne v3, v1, :cond_2

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    add-int/lit8 v1, v3, 0x1

    .line 54
    .line 55
    aget-char v3, v2, v3

    .line 56
    .line 57
    move/from16 v16, v3

    .line 58
    .line 59
    move v3, v1

    .line 60
    move/from16 v1, v16

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_3
    const/16 v12, 0x2c

    .line 64
    .line 65
    const/4 v13, 0x1

    .line 66
    if-ne v1, v12, :cond_6

    .line 67
    .line 68
    iput-boolean v13, v0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 69
    .line 70
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 71
    .line 72
    if-ne v3, v1, :cond_4

    .line 73
    .line 74
    move v1, v3

    .line 75
    move v3, v4

    .line 76
    goto :goto_2

    .line 77
    :cond_4
    add-int/lit8 v1, v3, 0x1

    .line 78
    .line 79
    aget-char v3, v2, v3

    .line 80
    .line 81
    :goto_2
    move/from16 v16, v3

    .line 82
    .line 83
    move v3, v1

    .line 84
    move/from16 v1, v16

    .line 85
    .line 86
    :goto_3
    if-gt v1, v11, :cond_6

    .line 87
    .line 88
    shl-long v14, v9, v1

    .line 89
    .line 90
    and-long/2addr v14, v7

    .line 91
    cmp-long v12, v14, v5

    .line 92
    .line 93
    if-eqz v12, :cond_6

    .line 94
    .line 95
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 96
    .line 97
    if-ne v3, v1, :cond_5

    .line 98
    .line 99
    move v1, v4

    .line 100
    goto :goto_3

    .line 101
    :cond_5
    add-int/lit8 v1, v3, 0x1

    .line 102
    .line 103
    aget-char v3, v2, v3

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_6
    iput-char v1, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 107
    .line 108
    iput v3, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 109
    .line 110
    const/16 v2, 0x2f

    .line 111
    .line 112
    if-ne v1, v2, :cond_7

    .line 113
    .line 114
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->skipComment()V

    .line 115
    .line 116
    .line 117
    :cond_7
    return v13
.end method

.method public nextIfArrayStart()Z
    .locals 9

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 2
    .line 3
    const/16 v1, 0x5b

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    return v0

    .line 9
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 10
    .line 11
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 12
    .line 13
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 14
    .line 15
    const/16 v3, 0x1a

    .line 16
    .line 17
    if-ne v1, v2, :cond_1

    .line 18
    .line 19
    move v2, v1

    .line 20
    :goto_0
    move v1, v3

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    add-int/lit8 v2, v1, 0x1

    .line 23
    .line 24
    aget-char v1, v0, v1

    .line 25
    .line 26
    :goto_1
    const/16 v4, 0x20

    .line 27
    .line 28
    if-gt v1, v4, :cond_3

    .line 29
    .line 30
    const-wide/16 v4, 0x1

    .line 31
    .line 32
    shl-long/2addr v4, v1

    .line 33
    const-wide v6, 0x100003701L

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    and-long/2addr v4, v6

    .line 39
    const-wide/16 v6, 0x0

    .line 40
    .line 41
    cmp-long v4, v4, v6

    .line 42
    .line 43
    if-eqz v4, :cond_3

    .line 44
    .line 45
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 46
    .line 47
    if-ne v2, v1, :cond_2

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    add-int/lit8 v1, v2, 0x1

    .line 51
    .line 52
    aget-char v2, v0, v2

    .line 53
    .line 54
    move v8, v2

    .line 55
    move v2, v1

    .line 56
    move v1, v8

    .line 57
    goto :goto_1

    .line 58
    :cond_3
    iput-char v1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 59
    .line 60
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 61
    .line 62
    const/16 v0, 0x2f

    .line 63
    .line 64
    if-ne v1, v0, :cond_4

    .line 65
    .line 66
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->skipComment()V

    .line 67
    .line 68
    .line 69
    :cond_4
    const/4 v0, 0x1

    .line 70
    return v0
.end method

.method public nextIfComma()Z
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    iget-char v2, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 6
    .line 7
    :goto_0
    const-wide/16 v3, 0x0

    .line 8
    .line 9
    const-wide v5, 0x100003701L

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    const-wide/16 v7, 0x1

    .line 15
    .line 16
    const/16 v9, 0x20

    .line 17
    .line 18
    const/16 v10, 0x1a

    .line 19
    .line 20
    if-gt v2, v9, :cond_1

    .line 21
    .line 22
    shl-long v11, v7, v2

    .line 23
    .line 24
    and-long/2addr v11, v5

    .line 25
    cmp-long v11, v11, v3

    .line 26
    .line 27
    if-eqz v11, :cond_1

    .line 28
    .line 29
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 30
    .line 31
    if-ne v1, v2, :cond_0

    .line 32
    .line 33
    move v2, v10

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    add-int/lit8 v2, v1, 0x1

    .line 36
    .line 37
    aget-char v1, v0, v1

    .line 38
    .line 39
    move v13, v2

    .line 40
    move v2, v1

    .line 41
    move v1, v13

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    const/16 v11, 0x2c

    .line 44
    .line 45
    if-eq v2, v11, :cond_2

    .line 46
    .line 47
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 48
    .line 49
    iput-char v2, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 50
    .line 51
    const/4 v0, 0x0

    .line 52
    return v0

    .line 53
    :cond_2
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 54
    .line 55
    if-ne v1, v2, :cond_3

    .line 56
    .line 57
    move v2, v1

    .line 58
    :goto_1
    move v1, v10

    .line 59
    goto :goto_2

    .line 60
    :cond_3
    add-int/lit8 v2, v1, 0x1

    .line 61
    .line 62
    aget-char v1, v0, v1

    .line 63
    .line 64
    :goto_2
    if-gt v1, v9, :cond_5

    .line 65
    .line 66
    shl-long v11, v7, v1

    .line 67
    .line 68
    and-long/2addr v11, v5

    .line 69
    cmp-long v11, v11, v3

    .line 70
    .line 71
    if-eqz v11, :cond_5

    .line 72
    .line 73
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 74
    .line 75
    if-ne v2, v1, :cond_4

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_4
    add-int/lit8 v1, v2, 0x1

    .line 79
    .line 80
    aget-char v2, v0, v2

    .line 81
    .line 82
    move v13, v2

    .line 83
    move v2, v1

    .line 84
    move v1, v13

    .line 85
    goto :goto_2

    .line 86
    :cond_5
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 87
    .line 88
    iput-char v1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 89
    .line 90
    const/16 v0, 0x2f

    .line 91
    .line 92
    if-ne v1, v0, :cond_6

    .line 93
    .line 94
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->skipComment()V

    .line 95
    .line 96
    .line 97
    :cond_6
    const/4 v0, 0x1

    .line 98
    return v0
.end method

.method public nextIfInfinity()Z
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    iget-char v2, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 6
    .line 7
    const/16 v3, 0x49

    .line 8
    .line 9
    if-ne v2, v3, :cond_3

    .line 10
    .line 11
    add-int/lit8 v2, v1, 0x6

    .line 12
    .line 13
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 14
    .line 15
    if-ge v2, v3, :cond_3

    .line 16
    .line 17
    aget-char v4, v0, v1

    .line 18
    .line 19
    const/16 v5, 0x6e

    .line 20
    .line 21
    if-ne v4, v5, :cond_3

    .line 22
    .line 23
    add-int/lit8 v4, v1, 0x1

    .line 24
    .line 25
    aget-char v4, v0, v4

    .line 26
    .line 27
    const/16 v6, 0x66

    .line 28
    .line 29
    if-ne v4, v6, :cond_3

    .line 30
    .line 31
    add-int/lit8 v4, v1, 0x2

    .line 32
    .line 33
    aget-char v4, v0, v4

    .line 34
    .line 35
    const/16 v6, 0x69

    .line 36
    .line 37
    if-ne v4, v6, :cond_3

    .line 38
    .line 39
    add-int/lit8 v4, v1, 0x3

    .line 40
    .line 41
    aget-char v4, v0, v4

    .line 42
    .line 43
    if-ne v4, v5, :cond_3

    .line 44
    .line 45
    add-int/lit8 v4, v1, 0x4

    .line 46
    .line 47
    aget-char v4, v0, v4

    .line 48
    .line 49
    if-ne v4, v6, :cond_3

    .line 50
    .line 51
    add-int/lit8 v4, v1, 0x5

    .line 52
    .line 53
    aget-char v4, v0, v4

    .line 54
    .line 55
    const/16 v5, 0x74

    .line 56
    .line 57
    if-ne v4, v5, :cond_3

    .line 58
    .line 59
    aget-char v2, v0, v2

    .line 60
    .line 61
    const/16 v4, 0x79

    .line 62
    .line 63
    if-ne v2, v4, :cond_3

    .line 64
    .line 65
    add-int/lit8 v2, v1, 0x7

    .line 66
    .line 67
    const/16 v4, 0x1a

    .line 68
    .line 69
    if-ne v2, v3, :cond_0

    .line 70
    .line 71
    move v1, v2

    .line 72
    :goto_0
    move v2, v4

    .line 73
    goto :goto_1

    .line 74
    :cond_0
    add-int/lit8 v1, v1, 0x8

    .line 75
    .line 76
    aget-char v2, v0, v2

    .line 77
    .line 78
    :goto_1
    const/16 v3, 0x20

    .line 79
    .line 80
    if-gt v2, v3, :cond_2

    .line 81
    .line 82
    const-wide/16 v5, 0x1

    .line 83
    .line 84
    shl-long/2addr v5, v2

    .line 85
    const-wide v7, 0x100003701L

    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    and-long/2addr v5, v7

    .line 91
    const-wide/16 v7, 0x0

    .line 92
    .line 93
    cmp-long v3, v5, v7

    .line 94
    .line 95
    if-eqz v3, :cond_2

    .line 96
    .line 97
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 98
    .line 99
    if-ne v1, v2, :cond_1

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_1
    add-int/lit8 v2, v1, 0x1

    .line 103
    .line 104
    aget-char v1, v0, v1

    .line 105
    .line 106
    move v9, v2

    .line 107
    move v2, v1

    .line 108
    move v1, v9

    .line 109
    goto :goto_1

    .line 110
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 111
    .line 112
    iput-char v2, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 113
    .line 114
    const/4 v0, 0x1

    .line 115
    return v0

    .line 116
    :cond_3
    const/4 v0, 0x0

    .line 117
    return v0
.end method

.method public nextIfMatch(C)Z
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    iget-char v2, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 6
    .line 7
    :goto_0
    const-wide/16 v3, 0x0

    .line 8
    .line 9
    const-wide v5, 0x100003701L

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    const-wide/16 v7, 0x1

    .line 15
    .line 16
    const/16 v9, 0x20

    .line 17
    .line 18
    const/16 v10, 0x1a

    .line 19
    .line 20
    if-gt v2, v9, :cond_1

    .line 21
    .line 22
    shl-long v11, v7, v2

    .line 23
    .line 24
    and-long/2addr v11, v5

    .line 25
    cmp-long v11, v11, v3

    .line 26
    .line 27
    if-eqz v11, :cond_1

    .line 28
    .line 29
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 30
    .line 31
    if-ne v1, v2, :cond_0

    .line 32
    .line 33
    move v2, v10

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    add-int/lit8 v2, v1, 0x1

    .line 36
    .line 37
    aget-char v1, v0, v1

    .line 38
    .line 39
    move v13, v2

    .line 40
    move v2, v1

    .line 41
    move v1, v13

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    if-eq v2, p1, :cond_2

    .line 44
    .line 45
    const/4 p1, 0x0

    .line 46
    return p1

    .line 47
    :cond_2
    iget p1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 48
    .line 49
    if-ne v1, p1, :cond_3

    .line 50
    .line 51
    move p1, v1

    .line 52
    :goto_1
    move v1, v10

    .line 53
    goto :goto_2

    .line 54
    :cond_3
    add-int/lit8 p1, v1, 0x1

    .line 55
    .line 56
    aget-char v1, v0, v1

    .line 57
    .line 58
    :goto_2
    if-gt v1, v9, :cond_5

    .line 59
    .line 60
    shl-long v11, v7, v1

    .line 61
    .line 62
    and-long/2addr v11, v5

    .line 63
    cmp-long v2, v11, v3

    .line 64
    .line 65
    if-eqz v2, :cond_5

    .line 66
    .line 67
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 68
    .line 69
    if-ne p1, v1, :cond_4

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_4
    add-int/lit8 v1, p1, 0x1

    .line 73
    .line 74
    aget-char p1, v0, p1

    .line 75
    .line 76
    move v13, v1

    .line 77
    move v1, p1

    .line 78
    move p1, v13

    .line 79
    goto :goto_2

    .line 80
    :cond_5
    iput p1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 81
    .line 82
    iput-char v1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 83
    .line 84
    const/16 p1, 0x2f

    .line 85
    .line 86
    if-ne v1, p1, :cond_6

    .line 87
    .line 88
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->skipComment()V

    .line 89
    .line 90
    .line 91
    :cond_6
    const/4 p1, 0x1

    .line 92
    return p1
.end method

.method public nextIfMatchIdent(CCC)Z
    .locals 7

    .line 146
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/4 v1, 0x0

    if-eq v0, p1, :cond_0

    return v1

    .line 147
    :cond_0
    iget-object p1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 148
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    add-int/lit8 v2, v0, 0x2

    .line 149
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    if-gt v2, v3, :cond_6

    aget-char v4, p1, v0

    if-ne v4, p2, :cond_6

    add-int/lit8 p2, v0, 0x1

    aget-char p2, p1, p2

    if-eq p2, p3, :cond_1

    goto :goto_2

    :cond_1
    const/16 p2, 0x1a

    if-ne v2, v3, :cond_2

    :goto_0
    move p3, p2

    goto :goto_1

    :cond_2
    add-int/lit8 v0, v0, 0x3

    .line 150
    aget-char p3, p1, v2

    move v2, v0

    :goto_1
    const/16 v0, 0x20

    if-gt p3, v0, :cond_4

    const-wide/16 v3, 0x1

    shl-long/2addr v3, p3

    const-wide v5, 0x100003701L

    and-long/2addr v3, v5

    const-wide/16 v5, 0x0

    cmp-long v0, v3, v5

    if-eqz v0, :cond_4

    .line 151
    iget p3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    if-ne v2, p3, :cond_3

    goto :goto_0

    :cond_3
    add-int/lit8 p3, v2, 0x1

    aget-char v0, p1, v2

    move v2, p3

    move p3, v0

    goto :goto_1

    .line 152
    :cond_4
    iget p1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    add-int/lit8 p1, p1, 0x3

    if-ne v2, p1, :cond_5

    if-eq p3, p2, :cond_5

    const/16 p1, 0x28

    if-eq p3, p1, :cond_5

    const/16 p1, 0x5b

    if-eq p3, p1, :cond_5

    const/16 p1, 0x5d

    if-eq p3, p1, :cond_5

    const/16 p1, 0x29

    if-eq p3, p1, :cond_5

    const/16 p1, 0x3a

    if-eq p3, p1, :cond_5

    const/16 p1, 0x2c

    if-eq p3, p1, :cond_5

    return v1

    .line 153
    :cond_5
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 154
    iput-char p3, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/4 p1, 0x1

    return p1

    :cond_6
    :goto_2
    return v1
.end method

.method public nextIfMatchIdent(CCCC)Z
    .locals 7

    .line 128
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/4 v1, 0x0

    if-eq v0, p1, :cond_0

    return v1

    .line 129
    :cond_0
    iget-object p1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 130
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    add-int/lit8 v2, v0, 0x3

    .line 131
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    if-gt v2, v3, :cond_6

    aget-char v4, p1, v0

    if-ne v4, p2, :cond_6

    add-int/lit8 p2, v0, 0x1

    aget-char p2, p1, p2

    if-ne p2, p3, :cond_6

    add-int/lit8 p2, v0, 0x2

    aget-char p2, p1, p2

    if-eq p2, p4, :cond_1

    goto :goto_2

    :cond_1
    const/16 p2, 0x1a

    if-ne v2, v3, :cond_2

    :goto_0
    move p3, p2

    goto :goto_1

    :cond_2
    add-int/lit8 v0, v0, 0x4

    .line 132
    aget-char p3, p1, v2

    move v2, v0

    :goto_1
    const/16 p4, 0x20

    if-gt p3, p4, :cond_4

    const-wide/16 v3, 0x1

    shl-long/2addr v3, p3

    const-wide v5, 0x100003701L

    and-long/2addr v3, v5

    const-wide/16 v5, 0x0

    cmp-long p4, v3, v5

    if-eqz p4, :cond_4

    .line 133
    iget p3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    if-ne v2, p3, :cond_3

    goto :goto_0

    :cond_3
    add-int/lit8 p3, v2, 0x1

    aget-char p4, p1, v2

    move v2, p3

    move p3, p4

    goto :goto_1

    .line 134
    :cond_4
    iget p1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    add-int/lit8 p1, p1, 0x4

    if-ne v2, p1, :cond_5

    if-eq p3, p2, :cond_5

    const/16 p1, 0x28

    if-eq p3, p1, :cond_5

    const/16 p1, 0x5b

    if-eq p3, p1, :cond_5

    const/16 p1, 0x5d

    if-eq p3, p1, :cond_5

    const/16 p1, 0x29

    if-eq p3, p1, :cond_5

    const/16 p1, 0x3a

    if-eq p3, p1, :cond_5

    const/16 p1, 0x2c

    if-eq p3, p1, :cond_5

    return v1

    .line 135
    :cond_5
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 136
    iput-char p3, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/4 p1, 0x1

    return p1

    :cond_6
    :goto_2
    return v1
.end method

.method public nextIfMatchIdent(CCCCC)Z
    .locals 5

    .line 137
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/4 v1, 0x0

    if-eq v0, p1, :cond_0

    return v1

    .line 138
    :cond_0
    iget-object p1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 139
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    add-int/lit8 v2, v0, 0x4

    .line 140
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    if-gt v2, v3, :cond_6

    aget-char v4, p1, v0

    if-ne v4, p2, :cond_6

    add-int/lit8 p2, v0, 0x1

    aget-char p2, p1, p2

    if-ne p2, p3, :cond_6

    add-int/lit8 p2, v0, 0x2

    aget-char p2, p1, p2

    if-ne p2, p4, :cond_6

    add-int/lit8 p2, v0, 0x3

    aget-char p2, p1, p2

    if-eq p2, p5, :cond_1

    goto :goto_2

    :cond_1
    const/16 p2, 0x1a

    if-ne v2, v3, :cond_2

    :goto_0
    move p3, p2

    goto :goto_1

    :cond_2
    add-int/lit8 v0, v0, 0x5

    .line 141
    aget-char p3, p1, v2

    move v2, v0

    :goto_1
    const/16 p4, 0x20

    if-gt p3, p4, :cond_4

    const-wide/16 p4, 0x1

    shl-long/2addr p4, p3

    const-wide v3, 0x100003701L

    and-long/2addr p4, v3

    const-wide/16 v3, 0x0

    cmp-long p4, p4, v3

    if-eqz p4, :cond_4

    .line 142
    iget p3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    if-ne v2, p3, :cond_3

    goto :goto_0

    :cond_3
    add-int/lit8 p3, v2, 0x1

    aget-char p4, p1, v2

    move v2, p3

    move p3, p4

    goto :goto_1

    .line 143
    :cond_4
    iget p1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    add-int/lit8 p1, p1, 0x5

    if-ne v2, p1, :cond_5

    if-eq p3, p2, :cond_5

    const/16 p1, 0x28

    if-eq p3, p1, :cond_5

    const/16 p1, 0x5b

    if-eq p3, p1, :cond_5

    const/16 p1, 0x5d

    if-eq p3, p1, :cond_5

    const/16 p1, 0x29

    if-eq p3, p1, :cond_5

    const/16 p1, 0x3a

    if-eq p3, p1, :cond_5

    const/16 p1, 0x2c

    if-eq p3, p1, :cond_5

    return v1

    .line 144
    :cond_5
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 145
    iput-char p3, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/4 p1, 0x1

    return p1

    :cond_6
    :goto_2
    return v1
.end method

.method public nextIfMatchIdent(CCCCCC)Z
    .locals 5

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eq v0, p1, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    iget-object p1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 8
    .line 9
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 10
    .line 11
    add-int/lit8 v2, v0, 0x5

    .line 12
    .line 13
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 14
    .line 15
    if-gt v2, v3, :cond_6

    .line 16
    .line 17
    aget-char v4, p1, v0

    .line 18
    .line 19
    if-ne v4, p2, :cond_6

    .line 20
    .line 21
    add-int/lit8 p2, v0, 0x1

    .line 22
    .line 23
    aget-char p2, p1, p2

    .line 24
    .line 25
    if-ne p2, p3, :cond_6

    .line 26
    .line 27
    add-int/lit8 p2, v0, 0x2

    .line 28
    .line 29
    aget-char p2, p1, p2

    .line 30
    .line 31
    if-ne p2, p4, :cond_6

    .line 32
    .line 33
    add-int/lit8 p2, v0, 0x3

    .line 34
    .line 35
    aget-char p2, p1, p2

    .line 36
    .line 37
    if-ne p2, p5, :cond_6

    .line 38
    .line 39
    add-int/lit8 p2, v0, 0x4

    .line 40
    .line 41
    aget-char p2, p1, p2

    .line 42
    .line 43
    if-eq p2, p6, :cond_1

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_1
    const/16 p2, 0x1a

    .line 47
    .line 48
    if-ne v2, v3, :cond_2

    .line 49
    .line 50
    :goto_0
    move p3, p2

    .line 51
    goto :goto_1

    .line 52
    :cond_2
    add-int/lit8 v0, v0, 0x6

    .line 53
    .line 54
    aget-char p3, p1, v2

    .line 55
    .line 56
    move v2, v0

    .line 57
    :goto_1
    const/16 p4, 0x20

    .line 58
    .line 59
    if-gt p3, p4, :cond_4

    .line 60
    .line 61
    const-wide/16 p4, 0x1

    .line 62
    .line 63
    shl-long/2addr p4, p3

    .line 64
    const-wide v3, 0x100003701L

    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    and-long/2addr p4, v3

    .line 70
    const-wide/16 v3, 0x0

    .line 71
    .line 72
    cmp-long p4, p4, v3

    .line 73
    .line 74
    if-eqz p4, :cond_4

    .line 75
    .line 76
    iget p3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 77
    .line 78
    if-ne v2, p3, :cond_3

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_3
    add-int/lit8 p3, v2, 0x1

    .line 82
    .line 83
    aget-char p4, p1, v2

    .line 84
    .line 85
    move v2, p3

    .line 86
    move p3, p4

    .line 87
    goto :goto_1

    .line 88
    :cond_4
    iget p1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 89
    .line 90
    add-int/lit8 p1, p1, 0x6

    .line 91
    .line 92
    if-ne v2, p1, :cond_5

    .line 93
    .line 94
    if-eq p3, p2, :cond_5

    .line 95
    .line 96
    const/16 p1, 0x28

    .line 97
    .line 98
    if-eq p3, p1, :cond_5

    .line 99
    .line 100
    const/16 p1, 0x5b

    .line 101
    .line 102
    if-eq p3, p1, :cond_5

    .line 103
    .line 104
    const/16 p1, 0x5d

    .line 105
    .line 106
    if-eq p3, p1, :cond_5

    .line 107
    .line 108
    const/16 p1, 0x29

    .line 109
    .line 110
    if-eq p3, p1, :cond_5

    .line 111
    .line 112
    const/16 p1, 0x3a

    .line 113
    .line 114
    if-eq p3, p1, :cond_5

    .line 115
    .line 116
    const/16 p1, 0x2c

    .line 117
    .line 118
    if-eq p3, p1, :cond_5

    .line 119
    .line 120
    return v1

    .line 121
    :cond_5
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 122
    .line 123
    iput-char p3, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 124
    .line 125
    const/4 p1, 0x1

    .line 126
    return p1

    .line 127
    :cond_6
    :goto_2
    return v1
.end method

.method public final nextIfName4Match10(J)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0xc

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    add-int/lit8 v3, v1, 0x3

    .line 14
    .line 15
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 16
    .line 17
    .line 18
    move-result-wide v5

    .line 19
    cmp-long p1, v5, p1

    .line 20
    .line 21
    if-nez p1, :cond_3

    .line 22
    .line 23
    add-int/lit8 p1, v1, 0xb

    .line 24
    .line 25
    aget-char p1, v0, p1

    .line 26
    .line 27
    const/16 p2, 0x3a

    .line 28
    .line 29
    if-eq p1, p2, :cond_1

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    add-int/lit8 v1, v1, 0xd

    .line 33
    .line 34
    aget-char p1, v0, v2

    .line 35
    .line 36
    :goto_0
    const/16 p2, 0x20

    .line 37
    .line 38
    if-gt p1, p2, :cond_2

    .line 39
    .line 40
    const-wide/16 v2, 0x1

    .line 41
    .line 42
    shl-long/2addr v2, p1

    .line 43
    const-wide v4, 0x100003701L

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    and-long/2addr v2, v4

    .line 49
    const-wide/16 v4, 0x0

    .line 50
    .line 51
    cmp-long p2, v2, v4

    .line 52
    .line 53
    if-eqz p2, :cond_2

    .line 54
    .line 55
    add-int/lit8 p1, v1, 0x1

    .line 56
    .line 57
    aget-char p2, v0, v1

    .line 58
    .line 59
    move v1, p1

    .line 60
    move p1, p2

    .line 61
    goto :goto_0

    .line 62
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 63
    .line 64
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 65
    .line 66
    const/4 p1, 0x1

    .line 67
    return p1

    .line 68
    :cond_3
    :goto_1
    return v4
.end method

.method public final nextIfName4Match11(J)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0xd

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    add-int/lit8 v3, v1, 0x3

    .line 14
    .line 15
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 16
    .line 17
    .line 18
    move-result-wide v5

    .line 19
    cmp-long p1, v5, p1

    .line 20
    .line 21
    if-nez p1, :cond_3

    .line 22
    .line 23
    add-int/lit8 p1, v1, 0xb

    .line 24
    .line 25
    aget-char p1, v0, p1

    .line 26
    .line 27
    const/16 p2, 0x22

    .line 28
    .line 29
    if-ne p1, p2, :cond_3

    .line 30
    .line 31
    add-int/lit8 p1, v1, 0xc

    .line 32
    .line 33
    aget-char p1, v0, p1

    .line 34
    .line 35
    const/16 p2, 0x3a

    .line 36
    .line 37
    if-eq p1, p2, :cond_1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    add-int/lit8 v1, v1, 0xe

    .line 41
    .line 42
    aget-char p1, v0, v2

    .line 43
    .line 44
    :goto_0
    const/16 p2, 0x20

    .line 45
    .line 46
    if-gt p1, p2, :cond_2

    .line 47
    .line 48
    const-wide/16 v2, 0x1

    .line 49
    .line 50
    shl-long/2addr v2, p1

    .line 51
    const-wide v4, 0x100003701L

    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    and-long/2addr v2, v4

    .line 57
    const-wide/16 v4, 0x0

    .line 58
    .line 59
    cmp-long p2, v2, v4

    .line 60
    .line 61
    if-eqz p2, :cond_2

    .line 62
    .line 63
    add-int/lit8 p1, v1, 0x1

    .line 64
    .line 65
    aget-char p2, v0, v1

    .line 66
    .line 67
    move v1, p1

    .line 68
    move p1, p2

    .line 69
    goto :goto_0

    .line 70
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 71
    .line 72
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 73
    .line 74
    const/4 p1, 0x1

    .line 75
    return p1

    .line 76
    :cond_3
    :goto_1
    return v4
.end method

.method public final nextIfName4Match12(JB)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0xe

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    add-int/lit8 v3, v1, 0x3

    .line 14
    .line 15
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 16
    .line 17
    .line 18
    move-result-wide v5

    .line 19
    cmp-long p1, v5, p1

    .line 20
    .line 21
    if-nez p1, :cond_3

    .line 22
    .line 23
    add-int/lit8 p1, v1, 0xb

    .line 24
    .line 25
    aget-char p1, v0, p1

    .line 26
    .line 27
    if-ne p1, p3, :cond_3

    .line 28
    .line 29
    add-int/lit8 p1, v1, 0xc

    .line 30
    .line 31
    aget-char p1, v0, p1

    .line 32
    .line 33
    const/16 p2, 0x22

    .line 34
    .line 35
    if-ne p1, p2, :cond_3

    .line 36
    .line 37
    add-int/lit8 p1, v1, 0xd

    .line 38
    .line 39
    aget-char p1, v0, p1

    .line 40
    .line 41
    const/16 p2, 0x3a

    .line 42
    .line 43
    if-eq p1, p2, :cond_1

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    add-int/lit8 v1, v1, 0xf

    .line 47
    .line 48
    aget-char p1, v0, v2

    .line 49
    .line 50
    :goto_0
    const/16 p2, 0x20

    .line 51
    .line 52
    if-gt p1, p2, :cond_2

    .line 53
    .line 54
    const-wide/16 p2, 0x1

    .line 55
    .line 56
    shl-long/2addr p2, p1

    .line 57
    const-wide v2, 0x100003701L

    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    and-long/2addr p2, v2

    .line 63
    const-wide/16 v2, 0x0

    .line 64
    .line 65
    cmp-long p2, p2, v2

    .line 66
    .line 67
    if-eqz p2, :cond_2

    .line 68
    .line 69
    add-int/lit8 p1, v1, 0x1

    .line 70
    .line 71
    aget-char p2, v0, v1

    .line 72
    .line 73
    move v1, p1

    .line 74
    move p1, p2

    .line 75
    goto :goto_0

    .line 76
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 77
    .line 78
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 79
    .line 80
    const/4 p1, 0x1

    .line 81
    return p1

    .line 82
    :cond_3
    :goto_1
    return v4
.end method

.method public final nextIfName4Match13(JI)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0xf

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    add-int/lit8 v3, v1, 0x3

    .line 14
    .line 15
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 16
    .line 17
    .line 18
    move-result-wide v5

    .line 19
    cmp-long p1, v5, p1

    .line 20
    .line 21
    if-nez p1, :cond_3

    .line 22
    .line 23
    add-int/lit8 p1, v1, 0xb

    .line 24
    .line 25
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getInt([CI)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eq p1, p3, :cond_1

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    add-int/lit8 v1, v1, 0x10

    .line 33
    .line 34
    aget-char p1, v0, v2

    .line 35
    .line 36
    :goto_0
    const/16 p2, 0x20

    .line 37
    .line 38
    if-gt p1, p2, :cond_2

    .line 39
    .line 40
    const-wide/16 p2, 0x1

    .line 41
    .line 42
    shl-long/2addr p2, p1

    .line 43
    const-wide v2, 0x100003701L

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    and-long/2addr p2, v2

    .line 49
    const-wide/16 v2, 0x0

    .line 50
    .line 51
    cmp-long p2, p2, v2

    .line 52
    .line 53
    if-eqz p2, :cond_2

    .line 54
    .line 55
    add-int/lit8 p1, v1, 0x1

    .line 56
    .line 57
    aget-char p2, v0, v1

    .line 58
    .line 59
    move v1, p1

    .line 60
    move p1, p2

    .line 61
    goto :goto_0

    .line 62
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 63
    .line 64
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 65
    .line 66
    const/4 p1, 0x1

    .line 67
    return p1

    .line 68
    :cond_3
    :goto_1
    return v4
.end method

.method public final nextIfName4Match14(JI)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x10

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    add-int/lit8 v3, v1, 0x3

    .line 14
    .line 15
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 16
    .line 17
    .line 18
    move-result-wide v5

    .line 19
    cmp-long p1, v5, p1

    .line 20
    .line 21
    if-nez p1, :cond_3

    .line 22
    .line 23
    add-int/lit8 p1, v1, 0xb

    .line 24
    .line 25
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getInt([CI)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-ne p1, p3, :cond_3

    .line 30
    .line 31
    add-int/lit8 p1, v1, 0xf

    .line 32
    .line 33
    aget-char p1, v0, p1

    .line 34
    .line 35
    const/16 p2, 0x3a

    .line 36
    .line 37
    if-eq p1, p2, :cond_1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    add-int/lit8 v1, v1, 0x11

    .line 41
    .line 42
    aget-char p1, v0, v2

    .line 43
    .line 44
    :goto_0
    const/16 p2, 0x20

    .line 45
    .line 46
    if-gt p1, p2, :cond_2

    .line 47
    .line 48
    const-wide/16 p2, 0x1

    .line 49
    .line 50
    shl-long/2addr p2, p1

    .line 51
    const-wide v2, 0x100003701L

    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    and-long/2addr p2, v2

    .line 57
    const-wide/16 v2, 0x0

    .line 58
    .line 59
    cmp-long p2, p2, v2

    .line 60
    .line 61
    if-eqz p2, :cond_2

    .line 62
    .line 63
    add-int/lit8 p1, v1, 0x1

    .line 64
    .line 65
    aget-char p2, v0, v1

    .line 66
    .line 67
    move v1, p1

    .line 68
    move p1, p2

    .line 69
    goto :goto_0

    .line 70
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 71
    .line 72
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 73
    .line 74
    const/4 p1, 0x1

    .line 75
    return p1

    .line 76
    :cond_3
    :goto_1
    return v4
.end method

.method public final nextIfName4Match15(JI)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x11

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    add-int/lit8 v3, v1, 0x3

    .line 14
    .line 15
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 16
    .line 17
    .line 18
    move-result-wide v5

    .line 19
    cmp-long p1, v5, p1

    .line 20
    .line 21
    if-nez p1, :cond_3

    .line 22
    .line 23
    add-int/lit8 p1, v1, 0xb

    .line 24
    .line 25
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getInt([CI)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-ne p1, p3, :cond_3

    .line 30
    .line 31
    add-int/lit8 p1, v1, 0xf

    .line 32
    .line 33
    aget-char p1, v0, p1

    .line 34
    .line 35
    const/16 p2, 0x22

    .line 36
    .line 37
    if-ne p1, p2, :cond_3

    .line 38
    .line 39
    add-int/lit8 p1, v1, 0x10

    .line 40
    .line 41
    aget-char p1, v0, p1

    .line 42
    .line 43
    const/16 p2, 0x3a

    .line 44
    .line 45
    if-eq p1, p2, :cond_1

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    add-int/lit8 v1, v1, 0x12

    .line 49
    .line 50
    aget-char p1, v0, v2

    .line 51
    .line 52
    :goto_0
    const/16 p2, 0x20

    .line 53
    .line 54
    if-gt p1, p2, :cond_2

    .line 55
    .line 56
    const-wide/16 p2, 0x1

    .line 57
    .line 58
    shl-long/2addr p2, p1

    .line 59
    const-wide v2, 0x100003701L

    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    and-long/2addr p2, v2

    .line 65
    const-wide/16 v2, 0x0

    .line 66
    .line 67
    cmp-long p2, p2, v2

    .line 68
    .line 69
    if-eqz p2, :cond_2

    .line 70
    .line 71
    add-int/lit8 p1, v1, 0x1

    .line 72
    .line 73
    aget-char p2, v0, v1

    .line 74
    .line 75
    move v1, p1

    .line 76
    move p1, p2

    .line 77
    goto :goto_0

    .line 78
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 79
    .line 80
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 81
    .line 82
    const/4 p1, 0x1

    .line 83
    return p1

    .line 84
    :cond_3
    :goto_1
    return v4
.end method

.method public final nextIfName4Match16(JIB)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x12

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    add-int/lit8 v3, v1, 0x3

    .line 14
    .line 15
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 16
    .line 17
    .line 18
    move-result-wide v5

    .line 19
    cmp-long p1, v5, p1

    .line 20
    .line 21
    if-nez p1, :cond_3

    .line 22
    .line 23
    add-int/lit8 p1, v1, 0xb

    .line 24
    .line 25
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getInt([CI)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-ne p1, p3, :cond_3

    .line 30
    .line 31
    add-int/lit8 p1, v1, 0xf

    .line 32
    .line 33
    aget-char p1, v0, p1

    .line 34
    .line 35
    if-ne p1, p4, :cond_3

    .line 36
    .line 37
    add-int/lit8 p1, v1, 0x10

    .line 38
    .line 39
    aget-char p1, v0, p1

    .line 40
    .line 41
    const/16 p2, 0x22

    .line 42
    .line 43
    if-ne p1, p2, :cond_3

    .line 44
    .line 45
    add-int/lit8 p1, v1, 0x11

    .line 46
    .line 47
    aget-char p1, v0, p1

    .line 48
    .line 49
    const/16 p2, 0x3a

    .line 50
    .line 51
    if-eq p1, p2, :cond_1

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    add-int/lit8 v1, v1, 0x13

    .line 55
    .line 56
    aget-char p1, v0, v2

    .line 57
    .line 58
    :goto_0
    const/16 p2, 0x20

    .line 59
    .line 60
    if-gt p1, p2, :cond_2

    .line 61
    .line 62
    const-wide/16 p2, 0x1

    .line 63
    .line 64
    shl-long/2addr p2, p1

    .line 65
    const-wide v2, 0x100003701L

    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    and-long/2addr p2, v2

    .line 71
    const-wide/16 v2, 0x0

    .line 72
    .line 73
    cmp-long p2, p2, v2

    .line 74
    .line 75
    if-eqz p2, :cond_2

    .line 76
    .line 77
    add-int/lit8 p1, v1, 0x1

    .line 78
    .line 79
    aget-char p2, v0, v1

    .line 80
    .line 81
    move v1, p1

    .line 82
    move p1, p2

    .line 83
    goto :goto_0

    .line 84
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 85
    .line 86
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 87
    .line 88
    const/4 p1, 0x1

    .line 89
    return p1

    .line 90
    :cond_3
    :goto_1
    return v4
.end method

.method public final nextIfName4Match17(JJ)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x13

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    add-int/lit8 v3, v1, 0x3

    .line 14
    .line 15
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 16
    .line 17
    .line 18
    move-result-wide v5

    .line 19
    cmp-long p1, v5, p1

    .line 20
    .line 21
    if-nez p1, :cond_3

    .line 22
    .line 23
    add-int/lit8 p1, v1, 0xb

    .line 24
    .line 25
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 26
    .line 27
    .line 28
    move-result-wide p1

    .line 29
    cmp-long p1, p1, p3

    .line 30
    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    add-int/lit8 v1, v1, 0x14

    .line 35
    .line 36
    aget-char p1, v0, v2

    .line 37
    .line 38
    :goto_0
    const/16 p2, 0x20

    .line 39
    .line 40
    if-gt p1, p2, :cond_2

    .line 41
    .line 42
    const-wide/16 p2, 0x1

    .line 43
    .line 44
    shl-long/2addr p2, p1

    .line 45
    const-wide v2, 0x100003701L

    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    and-long/2addr p2, v2

    .line 51
    const-wide/16 v2, 0x0

    .line 52
    .line 53
    cmp-long p2, p2, v2

    .line 54
    .line 55
    if-eqz p2, :cond_2

    .line 56
    .line 57
    add-int/lit8 p1, v1, 0x1

    .line 58
    .line 59
    aget-char p2, v0, v1

    .line 60
    .line 61
    move v1, p1

    .line 62
    move p1, p2

    .line 63
    goto :goto_0

    .line 64
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 65
    .line 66
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 67
    .line 68
    const/4 p1, 0x1

    .line 69
    return p1

    .line 70
    :cond_3
    :goto_1
    return v4
.end method

.method public final nextIfName4Match18(JJ)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x14

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    add-int/lit8 v3, v1, 0x3

    .line 14
    .line 15
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 16
    .line 17
    .line 18
    move-result-wide v5

    .line 19
    cmp-long p1, v5, p1

    .line 20
    .line 21
    if-nez p1, :cond_3

    .line 22
    .line 23
    add-int/lit8 p1, v1, 0xb

    .line 24
    .line 25
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 26
    .line 27
    .line 28
    move-result-wide p1

    .line 29
    cmp-long p1, p1, p3

    .line 30
    .line 31
    if-nez p1, :cond_3

    .line 32
    .line 33
    add-int/lit8 p1, v1, 0x13

    .line 34
    .line 35
    aget-char p1, v0, p1

    .line 36
    .line 37
    const/16 p2, 0x3a

    .line 38
    .line 39
    if-eq p1, p2, :cond_1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    add-int/lit8 v1, v1, 0x15

    .line 43
    .line 44
    aget-char p1, v0, v2

    .line 45
    .line 46
    :goto_0
    const/16 p2, 0x20

    .line 47
    .line 48
    if-gt p1, p2, :cond_2

    .line 49
    .line 50
    const-wide/16 p2, 0x1

    .line 51
    .line 52
    shl-long/2addr p2, p1

    .line 53
    const-wide v2, 0x100003701L

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    and-long/2addr p2, v2

    .line 59
    const-wide/16 v2, 0x0

    .line 60
    .line 61
    cmp-long p2, p2, v2

    .line 62
    .line 63
    if-eqz p2, :cond_2

    .line 64
    .line 65
    add-int/lit8 p1, v1, 0x1

    .line 66
    .line 67
    aget-char p2, v0, v1

    .line 68
    .line 69
    move v1, p1

    .line 70
    move p1, p2

    .line 71
    goto :goto_0

    .line 72
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 73
    .line 74
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 75
    .line 76
    const/4 p1, 0x1

    .line 77
    return p1

    .line 78
    :cond_3
    :goto_1
    return v4
.end method

.method public final nextIfName4Match19(JJ)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x15

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    add-int/lit8 v3, v1, 0x3

    .line 14
    .line 15
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 16
    .line 17
    .line 18
    move-result-wide v5

    .line 19
    cmp-long p1, v5, p1

    .line 20
    .line 21
    if-nez p1, :cond_3

    .line 22
    .line 23
    add-int/lit8 p1, v1, 0xb

    .line 24
    .line 25
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 26
    .line 27
    .line 28
    move-result-wide p1

    .line 29
    cmp-long p1, p1, p3

    .line 30
    .line 31
    if-nez p1, :cond_3

    .line 32
    .line 33
    add-int/lit8 p1, v1, 0x13

    .line 34
    .line 35
    aget-char p1, v0, p1

    .line 36
    .line 37
    const/16 p2, 0x22

    .line 38
    .line 39
    if-ne p1, p2, :cond_3

    .line 40
    .line 41
    add-int/lit8 p1, v1, 0x14

    .line 42
    .line 43
    aget-char p1, v0, p1

    .line 44
    .line 45
    const/16 p2, 0x3a

    .line 46
    .line 47
    if-eq p1, p2, :cond_1

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    add-int/lit8 v1, v1, 0x16

    .line 51
    .line 52
    aget-char p1, v0, v2

    .line 53
    .line 54
    :goto_0
    const/16 p2, 0x20

    .line 55
    .line 56
    if-gt p1, p2, :cond_2

    .line 57
    .line 58
    const-wide/16 p2, 0x1

    .line 59
    .line 60
    shl-long/2addr p2, p1

    .line 61
    const-wide v2, 0x100003701L

    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    and-long/2addr p2, v2

    .line 67
    const-wide/16 v2, 0x0

    .line 68
    .line 69
    cmp-long p2, p2, v2

    .line 70
    .line 71
    if-eqz p2, :cond_2

    .line 72
    .line 73
    add-int/lit8 p1, v1, 0x1

    .line 74
    .line 75
    aget-char p2, v0, v1

    .line 76
    .line 77
    move v1, p1

    .line 78
    move p1, p2

    .line 79
    goto :goto_0

    .line 80
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 81
    .line 82
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 83
    .line 84
    const/4 p1, 0x1

    .line 85
    return p1

    .line 86
    :cond_3
    :goto_1
    return v4
.end method

.method public final nextIfName4Match2()Z
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x4

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 8
    .line 9
    if-ge v2, v3, :cond_2

    .line 10
    .line 11
    add-int/lit8 v3, v1, 0x3

    .line 12
    .line 13
    aget-char v3, v0, v3

    .line 14
    .line 15
    const/16 v4, 0x3a

    .line 16
    .line 17
    if-eq v3, v4, :cond_0

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    add-int/lit8 v1, v1, 0x5

    .line 21
    .line 22
    aget-char v2, v0, v2

    .line 23
    .line 24
    :goto_0
    const/16 v3, 0x20

    .line 25
    .line 26
    if-gt v2, v3, :cond_1

    .line 27
    .line 28
    const-wide/16 v3, 0x1

    .line 29
    .line 30
    shl-long/2addr v3, v2

    .line 31
    const-wide v5, 0x100003701L

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    and-long/2addr v3, v5

    .line 37
    const-wide/16 v5, 0x0

    .line 38
    .line 39
    cmp-long v3, v3, v5

    .line 40
    .line 41
    if-eqz v3, :cond_1

    .line 42
    .line 43
    add-int/lit8 v2, v1, 0x1

    .line 44
    .line 45
    aget-char v1, v0, v1

    .line 46
    .line 47
    move v7, v2

    .line 48
    move v2, v1

    .line 49
    move v1, v7

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 52
    .line 53
    iput-char v2, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 54
    .line 55
    const/4 v0, 0x1

    .line 56
    return v0

    .line 57
    :cond_2
    :goto_1
    const/4 v0, 0x0

    .line 58
    return v0
.end method

.method public final nextIfName4Match20(JJB)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x16

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    add-int/lit8 v3, v1, 0x3

    .line 14
    .line 15
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 16
    .line 17
    .line 18
    move-result-wide v5

    .line 19
    cmp-long p1, v5, p1

    .line 20
    .line 21
    if-nez p1, :cond_3

    .line 22
    .line 23
    add-int/lit8 p1, v1, 0xb

    .line 24
    .line 25
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 26
    .line 27
    .line 28
    move-result-wide p1

    .line 29
    cmp-long p1, p1, p3

    .line 30
    .line 31
    if-nez p1, :cond_3

    .line 32
    .line 33
    add-int/lit8 p1, v1, 0x13

    .line 34
    .line 35
    aget-char p1, v0, p1

    .line 36
    .line 37
    if-ne p1, p5, :cond_3

    .line 38
    .line 39
    add-int/lit8 p1, v1, 0x14

    .line 40
    .line 41
    aget-char p1, v0, p1

    .line 42
    .line 43
    const/16 p2, 0x22

    .line 44
    .line 45
    if-ne p1, p2, :cond_3

    .line 46
    .line 47
    add-int/lit8 p1, v1, 0x15

    .line 48
    .line 49
    aget-char p1, v0, p1

    .line 50
    .line 51
    const/16 p2, 0x3a

    .line 52
    .line 53
    if-eq p1, p2, :cond_1

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    add-int/lit8 v1, v1, 0x17

    .line 57
    .line 58
    aget-char p1, v0, v2

    .line 59
    .line 60
    :goto_0
    const/16 p2, 0x20

    .line 61
    .line 62
    if-gt p1, p2, :cond_2

    .line 63
    .line 64
    const-wide/16 p2, 0x1

    .line 65
    .line 66
    shl-long/2addr p2, p1

    .line 67
    const-wide p4, 0x100003701L

    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    and-long/2addr p2, p4

    .line 73
    const-wide/16 p4, 0x0

    .line 74
    .line 75
    cmp-long p2, p2, p4

    .line 76
    .line 77
    if-eqz p2, :cond_2

    .line 78
    .line 79
    add-int/lit8 p1, v1, 0x1

    .line 80
    .line 81
    aget-char p2, v0, v1

    .line 82
    .line 83
    move v1, p1

    .line 84
    move p1, p2

    .line 85
    goto :goto_0

    .line 86
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 87
    .line 88
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 89
    .line 90
    const/4 p1, 0x1

    .line 91
    return p1

    .line 92
    :cond_3
    :goto_1
    return v4
.end method

.method public final nextIfName4Match21(JJI)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x17

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    add-int/lit8 v3, v1, 0x3

    .line 14
    .line 15
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 16
    .line 17
    .line 18
    move-result-wide v5

    .line 19
    cmp-long p1, v5, p1

    .line 20
    .line 21
    if-nez p1, :cond_3

    .line 22
    .line 23
    add-int/lit8 p1, v1, 0xb

    .line 24
    .line 25
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 26
    .line 27
    .line 28
    move-result-wide p1

    .line 29
    cmp-long p1, p1, p3

    .line 30
    .line 31
    if-nez p1, :cond_3

    .line 32
    .line 33
    add-int/lit8 p1, v1, 0x13

    .line 34
    .line 35
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getInt([CI)I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-eq p1, p5, :cond_1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    add-int/lit8 v1, v1, 0x18

    .line 43
    .line 44
    aget-char p1, v0, v2

    .line 45
    .line 46
    :goto_0
    const/16 p2, 0x20

    .line 47
    .line 48
    if-gt p1, p2, :cond_2

    .line 49
    .line 50
    const-wide/16 p2, 0x1

    .line 51
    .line 52
    shl-long/2addr p2, p1

    .line 53
    const-wide p4, 0x100003701L

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    and-long/2addr p2, p4

    .line 59
    const-wide/16 p4, 0x0

    .line 60
    .line 61
    cmp-long p2, p2, p4

    .line 62
    .line 63
    if-eqz p2, :cond_2

    .line 64
    .line 65
    add-int/lit8 p1, v1, 0x1

    .line 66
    .line 67
    aget-char p2, v0, v1

    .line 68
    .line 69
    move v1, p1

    .line 70
    move p1, p2

    .line 71
    goto :goto_0

    .line 72
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 73
    .line 74
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 75
    .line 76
    const/4 p1, 0x1

    .line 77
    return p1

    .line 78
    :cond_3
    :goto_1
    return v4
.end method

.method public final nextIfName4Match22(JJI)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x18

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    add-int/lit8 v3, v1, 0x3

    .line 14
    .line 15
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 16
    .line 17
    .line 18
    move-result-wide v5

    .line 19
    cmp-long p1, v5, p1

    .line 20
    .line 21
    if-nez p1, :cond_3

    .line 22
    .line 23
    add-int/lit8 p1, v1, 0xb

    .line 24
    .line 25
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 26
    .line 27
    .line 28
    move-result-wide p1

    .line 29
    cmp-long p1, p1, p3

    .line 30
    .line 31
    if-nez p1, :cond_3

    .line 32
    .line 33
    add-int/lit8 p1, v1, 0x13

    .line 34
    .line 35
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getInt([CI)I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-ne p1, p5, :cond_3

    .line 40
    .line 41
    add-int/lit8 p1, v1, 0x17

    .line 42
    .line 43
    aget-char p1, v0, p1

    .line 44
    .line 45
    const/16 p2, 0x3a

    .line 46
    .line 47
    if-eq p1, p2, :cond_1

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    add-int/lit8 v1, v1, 0x19

    .line 51
    .line 52
    aget-char p1, v0, v2

    .line 53
    .line 54
    :goto_0
    const/16 p2, 0x20

    .line 55
    .line 56
    if-gt p1, p2, :cond_2

    .line 57
    .line 58
    const-wide/16 p2, 0x1

    .line 59
    .line 60
    shl-long/2addr p2, p1

    .line 61
    const-wide p4, 0x100003701L

    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    and-long/2addr p2, p4

    .line 67
    const-wide/16 p4, 0x0

    .line 68
    .line 69
    cmp-long p2, p2, p4

    .line 70
    .line 71
    if-eqz p2, :cond_2

    .line 72
    .line 73
    add-int/lit8 p1, v1, 0x1

    .line 74
    .line 75
    aget-char p2, v0, v1

    .line 76
    .line 77
    move v1, p1

    .line 78
    move p1, p2

    .line 79
    goto :goto_0

    .line 80
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 81
    .line 82
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 83
    .line 84
    const/4 p1, 0x1

    .line 85
    return p1

    .line 86
    :cond_3
    :goto_1
    return v4
.end method

.method public final nextIfName4Match23(JJI)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x19

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    add-int/lit8 v3, v1, 0x3

    .line 14
    .line 15
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 16
    .line 17
    .line 18
    move-result-wide v5

    .line 19
    cmp-long p1, v5, p1

    .line 20
    .line 21
    if-nez p1, :cond_3

    .line 22
    .line 23
    add-int/lit8 p1, v1, 0xb

    .line 24
    .line 25
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 26
    .line 27
    .line 28
    move-result-wide p1

    .line 29
    cmp-long p1, p1, p3

    .line 30
    .line 31
    if-nez p1, :cond_3

    .line 32
    .line 33
    add-int/lit8 p1, v1, 0x13

    .line 34
    .line 35
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getInt([CI)I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-ne p1, p5, :cond_3

    .line 40
    .line 41
    add-int/lit8 p1, v1, 0x17

    .line 42
    .line 43
    aget-char p1, v0, p1

    .line 44
    .line 45
    const/16 p2, 0x22

    .line 46
    .line 47
    if-ne p1, p2, :cond_3

    .line 48
    .line 49
    add-int/lit8 p1, v1, 0x18

    .line 50
    .line 51
    aget-char p1, v0, p1

    .line 52
    .line 53
    const/16 p2, 0x3a

    .line 54
    .line 55
    if-eq p1, p2, :cond_1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    add-int/lit8 v1, v1, 0x1a

    .line 59
    .line 60
    aget-char p1, v0, v2

    .line 61
    .line 62
    :goto_0
    const/16 p2, 0x20

    .line 63
    .line 64
    if-gt p1, p2, :cond_2

    .line 65
    .line 66
    const-wide/16 p2, 0x1

    .line 67
    .line 68
    shl-long/2addr p2, p1

    .line 69
    const-wide p4, 0x100003701L

    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    and-long/2addr p2, p4

    .line 75
    const-wide/16 p4, 0x0

    .line 76
    .line 77
    cmp-long p2, p2, p4

    .line 78
    .line 79
    if-eqz p2, :cond_2

    .line 80
    .line 81
    add-int/lit8 p1, v1, 0x1

    .line 82
    .line 83
    aget-char p2, v0, v1

    .line 84
    .line 85
    move v1, p1

    .line 86
    move p1, p2

    .line 87
    goto :goto_0

    .line 88
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 89
    .line 90
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 91
    .line 92
    const/4 p1, 0x1

    .line 93
    return p1

    .line 94
    :cond_3
    :goto_1
    return v4
.end method

.method public final nextIfName4Match24(JJIB)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x1a

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    add-int/lit8 v3, v1, 0x3

    .line 14
    .line 15
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 16
    .line 17
    .line 18
    move-result-wide v5

    .line 19
    cmp-long p1, v5, p1

    .line 20
    .line 21
    if-nez p1, :cond_3

    .line 22
    .line 23
    add-int/lit8 p1, v1, 0xb

    .line 24
    .line 25
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 26
    .line 27
    .line 28
    move-result-wide p1

    .line 29
    cmp-long p1, p1, p3

    .line 30
    .line 31
    if-nez p1, :cond_3

    .line 32
    .line 33
    add-int/lit8 p1, v1, 0x13

    .line 34
    .line 35
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getInt([CI)I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-ne p1, p5, :cond_3

    .line 40
    .line 41
    add-int/lit8 p1, v1, 0x17

    .line 42
    .line 43
    aget-char p1, v0, p1

    .line 44
    .line 45
    if-ne p1, p6, :cond_3

    .line 46
    .line 47
    add-int/lit8 p1, v1, 0x18

    .line 48
    .line 49
    aget-char p1, v0, p1

    .line 50
    .line 51
    const/16 p2, 0x22

    .line 52
    .line 53
    if-ne p1, p2, :cond_3

    .line 54
    .line 55
    add-int/lit8 p1, v1, 0x19

    .line 56
    .line 57
    aget-char p1, v0, p1

    .line 58
    .line 59
    const/16 p2, 0x3a

    .line 60
    .line 61
    if-eq p1, p2, :cond_1

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_1
    add-int/lit8 v1, v1, 0x1b

    .line 65
    .line 66
    aget-char p1, v0, v2

    .line 67
    .line 68
    :goto_0
    const/16 p2, 0x20

    .line 69
    .line 70
    if-gt p1, p2, :cond_2

    .line 71
    .line 72
    const-wide/16 p2, 0x1

    .line 73
    .line 74
    shl-long/2addr p2, p1

    .line 75
    const-wide p4, 0x100003701L

    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    and-long/2addr p2, p4

    .line 81
    const-wide/16 p4, 0x0

    .line 82
    .line 83
    cmp-long p2, p2, p4

    .line 84
    .line 85
    if-eqz p2, :cond_2

    .line 86
    .line 87
    add-int/lit8 p1, v1, 0x1

    .line 88
    .line 89
    aget-char p2, v0, v1

    .line 90
    .line 91
    move v1, p1

    .line 92
    move p1, p2

    .line 93
    goto :goto_0

    .line 94
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 95
    .line 96
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 97
    .line 98
    const/4 p1, 0x1

    .line 99
    return p1

    .line 100
    :cond_3
    :goto_1
    return v4
.end method

.method public final nextIfName4Match25(JJJ)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x1b

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    add-int/lit8 v3, v1, 0x3

    .line 14
    .line 15
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 16
    .line 17
    .line 18
    move-result-wide v5

    .line 19
    cmp-long p1, v5, p1

    .line 20
    .line 21
    if-nez p1, :cond_3

    .line 22
    .line 23
    add-int/lit8 p1, v1, 0xb

    .line 24
    .line 25
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 26
    .line 27
    .line 28
    move-result-wide p1

    .line 29
    cmp-long p1, p1, p3

    .line 30
    .line 31
    if-nez p1, :cond_3

    .line 32
    .line 33
    add-int/lit8 p1, v1, 0x13

    .line 34
    .line 35
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 36
    .line 37
    .line 38
    move-result-wide p1

    .line 39
    cmp-long p1, p1, p5

    .line 40
    .line 41
    if-eqz p1, :cond_1

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    add-int/lit8 v1, v1, 0x1c

    .line 45
    .line 46
    aget-char p1, v0, v2

    .line 47
    .line 48
    :goto_0
    const/16 p2, 0x20

    .line 49
    .line 50
    if-gt p1, p2, :cond_2

    .line 51
    .line 52
    const-wide/16 p2, 0x1

    .line 53
    .line 54
    shl-long/2addr p2, p1

    .line 55
    const-wide p4, 0x100003701L

    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    and-long/2addr p2, p4

    .line 61
    const-wide/16 p4, 0x0

    .line 62
    .line 63
    cmp-long p2, p2, p4

    .line 64
    .line 65
    if-eqz p2, :cond_2

    .line 66
    .line 67
    add-int/lit8 p1, v1, 0x1

    .line 68
    .line 69
    aget-char p2, v0, v1

    .line 70
    .line 71
    move v1, p1

    .line 72
    move p1, p2

    .line 73
    goto :goto_0

    .line 74
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 75
    .line 76
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 77
    .line 78
    const/4 p1, 0x1

    .line 79
    return p1

    .line 80
    :cond_3
    :goto_1
    return v4
.end method

.method public final nextIfName4Match26(JJJ)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x1c

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    add-int/lit8 v3, v1, 0x3

    .line 14
    .line 15
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 16
    .line 17
    .line 18
    move-result-wide v5

    .line 19
    cmp-long p1, v5, p1

    .line 20
    .line 21
    if-nez p1, :cond_3

    .line 22
    .line 23
    add-int/lit8 p1, v1, 0xb

    .line 24
    .line 25
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 26
    .line 27
    .line 28
    move-result-wide p1

    .line 29
    cmp-long p1, p1, p3

    .line 30
    .line 31
    if-nez p1, :cond_3

    .line 32
    .line 33
    add-int/lit8 p1, v1, 0x13

    .line 34
    .line 35
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 36
    .line 37
    .line 38
    move-result-wide p1

    .line 39
    cmp-long p1, p1, p5

    .line 40
    .line 41
    if-nez p1, :cond_3

    .line 42
    .line 43
    add-int/lit8 p1, v1, 0x1b

    .line 44
    .line 45
    aget-char p1, v0, p1

    .line 46
    .line 47
    const/16 p2, 0x3a

    .line 48
    .line 49
    if-eq p1, p2, :cond_1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    iget-object p1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 53
    .line 54
    add-int/lit8 v1, v1, 0x1d

    .line 55
    .line 56
    aget-char p1, p1, v2

    .line 57
    .line 58
    :goto_0
    const/16 p2, 0x20

    .line 59
    .line 60
    if-gt p1, p2, :cond_2

    .line 61
    .line 62
    const-wide/16 p2, 0x1

    .line 63
    .line 64
    shl-long/2addr p2, p1

    .line 65
    const-wide p4, 0x100003701L

    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    and-long/2addr p2, p4

    .line 71
    const-wide/16 p4, 0x0

    .line 72
    .line 73
    cmp-long p2, p2, p4

    .line 74
    .line 75
    if-eqz p2, :cond_2

    .line 76
    .line 77
    iget-object p1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 78
    .line 79
    add-int/lit8 p2, v1, 0x1

    .line 80
    .line 81
    aget-char p1, p1, v1

    .line 82
    .line 83
    move v1, p2

    .line 84
    goto :goto_0

    .line 85
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 86
    .line 87
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 88
    .line 89
    const/4 p1, 0x1

    .line 90
    return p1

    .line 91
    :cond_3
    :goto_1
    return v4
.end method

.method public final nextIfName4Match27(JJJ)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x1d

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    add-int/lit8 v3, v1, 0x3

    .line 14
    .line 15
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 16
    .line 17
    .line 18
    move-result-wide v5

    .line 19
    cmp-long p1, v5, p1

    .line 20
    .line 21
    if-nez p1, :cond_3

    .line 22
    .line 23
    add-int/lit8 p1, v1, 0xb

    .line 24
    .line 25
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 26
    .line 27
    .line 28
    move-result-wide p1

    .line 29
    cmp-long p1, p1, p3

    .line 30
    .line 31
    if-nez p1, :cond_3

    .line 32
    .line 33
    add-int/lit8 p1, v1, 0x13

    .line 34
    .line 35
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 36
    .line 37
    .line 38
    move-result-wide p1

    .line 39
    cmp-long p1, p1, p5

    .line 40
    .line 41
    if-nez p1, :cond_3

    .line 42
    .line 43
    add-int/lit8 p1, v1, 0x1b

    .line 44
    .line 45
    aget-char p1, v0, p1

    .line 46
    .line 47
    const/16 p2, 0x22

    .line 48
    .line 49
    if-ne p1, p2, :cond_3

    .line 50
    .line 51
    add-int/lit8 p1, v1, 0x1c

    .line 52
    .line 53
    aget-char p1, v0, p1

    .line 54
    .line 55
    const/16 p2, 0x3a

    .line 56
    .line 57
    if-eq p1, p2, :cond_1

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    iget-object p1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 61
    .line 62
    add-int/lit8 v1, v1, 0x1e

    .line 63
    .line 64
    aget-char p1, p1, v2

    .line 65
    .line 66
    :goto_0
    const/16 p2, 0x20

    .line 67
    .line 68
    if-gt p1, p2, :cond_2

    .line 69
    .line 70
    const-wide/16 p2, 0x1

    .line 71
    .line 72
    shl-long/2addr p2, p1

    .line 73
    const-wide p4, 0x100003701L

    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    and-long/2addr p2, p4

    .line 79
    const-wide/16 p4, 0x0

    .line 80
    .line 81
    cmp-long p2, p2, p4

    .line 82
    .line 83
    if-eqz p2, :cond_2

    .line 84
    .line 85
    iget-object p1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 86
    .line 87
    add-int/lit8 p2, v1, 0x1

    .line 88
    .line 89
    aget-char p1, p1, v1

    .line 90
    .line 91
    move v1, p2

    .line 92
    goto :goto_0

    .line 93
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 94
    .line 95
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 96
    .line 97
    const/4 p1, 0x1

    .line 98
    return p1

    .line 99
    :cond_3
    :goto_1
    return v4
.end method

.method public final nextIfName4Match28(JJJB)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x1e

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    add-int/lit8 v3, v1, 0x3

    .line 14
    .line 15
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 16
    .line 17
    .line 18
    move-result-wide v5

    .line 19
    cmp-long p1, v5, p1

    .line 20
    .line 21
    if-nez p1, :cond_3

    .line 22
    .line 23
    add-int/lit8 p1, v1, 0xb

    .line 24
    .line 25
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 26
    .line 27
    .line 28
    move-result-wide p1

    .line 29
    cmp-long p1, p1, p3

    .line 30
    .line 31
    if-nez p1, :cond_3

    .line 32
    .line 33
    add-int/lit8 p1, v1, 0x13

    .line 34
    .line 35
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 36
    .line 37
    .line 38
    move-result-wide p1

    .line 39
    cmp-long p1, p1, p5

    .line 40
    .line 41
    if-nez p1, :cond_3

    .line 42
    .line 43
    add-int/lit8 p1, v1, 0x1b

    .line 44
    .line 45
    aget-char p1, v0, p1

    .line 46
    .line 47
    if-ne p1, p7, :cond_3

    .line 48
    .line 49
    add-int/lit8 p1, v1, 0x1c

    .line 50
    .line 51
    aget-char p1, v0, p1

    .line 52
    .line 53
    const/16 p2, 0x22

    .line 54
    .line 55
    if-ne p1, p2, :cond_3

    .line 56
    .line 57
    add-int/lit8 p1, v1, 0x1d

    .line 58
    .line 59
    aget-char p1, v0, p1

    .line 60
    .line 61
    const/16 p2, 0x3a

    .line 62
    .line 63
    if-eq p1, p2, :cond_1

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_1
    add-int/lit8 v1, v1, 0x1f

    .line 67
    .line 68
    aget-char p1, v0, v2

    .line 69
    .line 70
    :goto_0
    const/16 p2, 0x20

    .line 71
    .line 72
    if-gt p1, p2, :cond_2

    .line 73
    .line 74
    const-wide/16 p2, 0x1

    .line 75
    .line 76
    shl-long/2addr p2, p1

    .line 77
    const-wide p4, 0x100003701L

    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    and-long/2addr p2, p4

    .line 83
    const-wide/16 p4, 0x0

    .line 84
    .line 85
    cmp-long p2, p2, p4

    .line 86
    .line 87
    if-eqz p2, :cond_2

    .line 88
    .line 89
    add-int/lit8 p1, v1, 0x1

    .line 90
    .line 91
    aget-char p2, v0, v1

    .line 92
    .line 93
    move v1, p1

    .line 94
    move p1, p2

    .line 95
    goto :goto_0

    .line 96
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 97
    .line 98
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 99
    .line 100
    const/4 p1, 0x1

    .line 101
    return p1

    .line 102
    :cond_3
    :goto_1
    return v4
.end method

.method public final nextIfName4Match29(JJJI)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x1f

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    add-int/lit8 v3, v1, 0x3

    .line 14
    .line 15
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 16
    .line 17
    .line 18
    move-result-wide v5

    .line 19
    cmp-long p1, v5, p1

    .line 20
    .line 21
    if-nez p1, :cond_3

    .line 22
    .line 23
    add-int/lit8 p1, v1, 0xb

    .line 24
    .line 25
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 26
    .line 27
    .line 28
    move-result-wide p1

    .line 29
    cmp-long p1, p1, p3

    .line 30
    .line 31
    if-nez p1, :cond_3

    .line 32
    .line 33
    add-int/lit8 p1, v1, 0x13

    .line 34
    .line 35
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 36
    .line 37
    .line 38
    move-result-wide p1

    .line 39
    cmp-long p1, p1, p5

    .line 40
    .line 41
    if-nez p1, :cond_3

    .line 42
    .line 43
    add-int/lit8 p1, v1, 0x1b

    .line 44
    .line 45
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getInt([CI)I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-eq p1, p7, :cond_1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    const/16 p1, 0x20

    .line 53
    .line 54
    add-int/2addr v1, p1

    .line 55
    aget-char p2, v0, v2

    .line 56
    .line 57
    :goto_0
    if-gt p2, p1, :cond_2

    .line 58
    .line 59
    const-wide/16 p3, 0x1

    .line 60
    .line 61
    shl-long/2addr p3, p2

    .line 62
    const-wide p5, 0x100003701L

    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    and-long/2addr p3, p5

    .line 68
    const-wide/16 p5, 0x0

    .line 69
    .line 70
    cmp-long p3, p3, p5

    .line 71
    .line 72
    if-eqz p3, :cond_2

    .line 73
    .line 74
    add-int/lit8 p2, v1, 0x1

    .line 75
    .line 76
    aget-char p3, v0, v1

    .line 77
    .line 78
    move v1, p2

    .line 79
    move p2, p3

    .line 80
    goto :goto_0

    .line 81
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 82
    .line 83
    iput-char p2, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 84
    .line 85
    const/4 p1, 0x1

    .line 86
    return p1

    .line 87
    :cond_3
    :goto_1
    return v4
.end method

.method public final nextIfName4Match3()Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x5

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 8
    .line 9
    if-ge v2, v3, :cond_2

    .line 10
    .line 11
    add-int/lit8 v3, v1, 0x3

    .line 12
    .line 13
    aget-char v3, v0, v3

    .line 14
    .line 15
    const/16 v4, 0x22

    .line 16
    .line 17
    if-ne v3, v4, :cond_2

    .line 18
    .line 19
    add-int/lit8 v1, v1, 0x4

    .line 20
    .line 21
    aget-char v1, v0, v1

    .line 22
    .line 23
    const/16 v3, 0x3a

    .line 24
    .line 25
    if-eq v1, v3, :cond_0

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    aget-char v1, v0, v2

    .line 29
    .line 30
    :goto_0
    const/16 v3, 0x20

    .line 31
    .line 32
    if-gt v1, v3, :cond_1

    .line 33
    .line 34
    const-wide/16 v3, 0x1

    .line 35
    .line 36
    shl-long/2addr v3, v1

    .line 37
    const-wide v5, 0x100003701L

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    and-long/2addr v3, v5

    .line 43
    const-wide/16 v5, 0x0

    .line 44
    .line 45
    cmp-long v3, v3, v5

    .line 46
    .line 47
    if-eqz v3, :cond_1

    .line 48
    .line 49
    add-int/lit8 v2, v2, 0x1

    .line 50
    .line 51
    aget-char v1, v0, v2

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    const/4 v0, 0x1

    .line 55
    add-int/2addr v2, v0

    .line 56
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 57
    .line 58
    iput-char v1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 59
    .line 60
    return v0

    .line 61
    :cond_2
    :goto_1
    const/4 v0, 0x0

    .line 62
    return v0
.end method

.method public final nextIfName4Match30(JJJI)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x20

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    add-int/lit8 v3, v1, 0x3

    .line 14
    .line 15
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 16
    .line 17
    .line 18
    move-result-wide v5

    .line 19
    cmp-long p1, v5, p1

    .line 20
    .line 21
    if-nez p1, :cond_3

    .line 22
    .line 23
    add-int/lit8 p1, v1, 0xb

    .line 24
    .line 25
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 26
    .line 27
    .line 28
    move-result-wide p1

    .line 29
    cmp-long p1, p1, p3

    .line 30
    .line 31
    if-nez p1, :cond_3

    .line 32
    .line 33
    add-int/lit8 p1, v1, 0x13

    .line 34
    .line 35
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 36
    .line 37
    .line 38
    move-result-wide p1

    .line 39
    cmp-long p1, p1, p5

    .line 40
    .line 41
    if-nez p1, :cond_3

    .line 42
    .line 43
    add-int/lit8 p1, v1, 0x1b

    .line 44
    .line 45
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getInt([CI)I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-ne p1, p7, :cond_3

    .line 50
    .line 51
    add-int/lit8 p1, v1, 0x1f

    .line 52
    .line 53
    aget-char p1, v0, p1

    .line 54
    .line 55
    const/16 p2, 0x3a

    .line 56
    .line 57
    if-eq p1, p2, :cond_1

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    add-int/lit8 v1, v1, 0x21

    .line 61
    .line 62
    aget-char p1, v0, v2

    .line 63
    .line 64
    :goto_0
    const/16 p2, 0x20

    .line 65
    .line 66
    if-gt p1, p2, :cond_2

    .line 67
    .line 68
    const-wide/16 p2, 0x1

    .line 69
    .line 70
    shl-long/2addr p2, p1

    .line 71
    const-wide p4, 0x100003701L

    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    and-long/2addr p2, p4

    .line 77
    const-wide/16 p4, 0x0

    .line 78
    .line 79
    cmp-long p2, p2, p4

    .line 80
    .line 81
    if-eqz p2, :cond_2

    .line 82
    .line 83
    add-int/lit8 p1, v1, 0x1

    .line 84
    .line 85
    aget-char p2, v0, v1

    .line 86
    .line 87
    move v1, p1

    .line 88
    move p1, p2

    .line 89
    goto :goto_0

    .line 90
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 91
    .line 92
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 93
    .line 94
    const/4 p1, 0x1

    .line 95
    return p1

    .line 96
    :cond_3
    :goto_1
    return v4
.end method

.method public final nextIfName4Match31(JJJI)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x21

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    add-int/lit8 v3, v1, 0x3

    .line 14
    .line 15
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 16
    .line 17
    .line 18
    move-result-wide v5

    .line 19
    cmp-long p1, v5, p1

    .line 20
    .line 21
    if-nez p1, :cond_3

    .line 22
    .line 23
    add-int/lit8 p1, v1, 0xb

    .line 24
    .line 25
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 26
    .line 27
    .line 28
    move-result-wide p1

    .line 29
    cmp-long p1, p1, p3

    .line 30
    .line 31
    if-nez p1, :cond_3

    .line 32
    .line 33
    add-int/lit8 p1, v1, 0x13

    .line 34
    .line 35
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 36
    .line 37
    .line 38
    move-result-wide p1

    .line 39
    cmp-long p1, p1, p5

    .line 40
    .line 41
    if-nez p1, :cond_3

    .line 42
    .line 43
    add-int/lit8 p1, v1, 0x1b

    .line 44
    .line 45
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getInt([CI)I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-ne p1, p7, :cond_3

    .line 50
    .line 51
    add-int/lit8 p1, v1, 0x1f

    .line 52
    .line 53
    aget-char p1, v0, p1

    .line 54
    .line 55
    const/16 p2, 0x22

    .line 56
    .line 57
    if-ne p1, p2, :cond_3

    .line 58
    .line 59
    add-int/lit8 p1, v1, 0x20

    .line 60
    .line 61
    aget-char p1, v0, p1

    .line 62
    .line 63
    const/16 p3, 0x3a

    .line 64
    .line 65
    if-eq p1, p3, :cond_1

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_1
    add-int/2addr v1, p2

    .line 69
    aget-char p1, v0, v2

    .line 70
    .line 71
    :goto_0
    const/16 p2, 0x20

    .line 72
    .line 73
    if-gt p1, p2, :cond_2

    .line 74
    .line 75
    const-wide/16 p2, 0x1

    .line 76
    .line 77
    shl-long/2addr p2, p1

    .line 78
    const-wide p4, 0x100003701L

    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    and-long/2addr p2, p4

    .line 84
    const-wide/16 p4, 0x0

    .line 85
    .line 86
    cmp-long p2, p2, p4

    .line 87
    .line 88
    if-eqz p2, :cond_2

    .line 89
    .line 90
    add-int/lit8 p1, v1, 0x1

    .line 91
    .line 92
    aget-char p2, v0, v1

    .line 93
    .line 94
    move v1, p1

    .line 95
    move p1, p2

    .line 96
    goto :goto_0

    .line 97
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 98
    .line 99
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 100
    .line 101
    const/4 p1, 0x1

    .line 102
    return p1

    .line 103
    :cond_3
    :goto_1
    return v4
.end method

.method public final nextIfName4Match32(JJJIB)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x22

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    add-int/lit8 v3, v1, 0x3

    .line 14
    .line 15
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 16
    .line 17
    .line 18
    move-result-wide v5

    .line 19
    cmp-long p1, v5, p1

    .line 20
    .line 21
    if-nez p1, :cond_3

    .line 22
    .line 23
    add-int/lit8 p1, v1, 0xb

    .line 24
    .line 25
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 26
    .line 27
    .line 28
    move-result-wide p1

    .line 29
    cmp-long p1, p1, p3

    .line 30
    .line 31
    if-nez p1, :cond_3

    .line 32
    .line 33
    add-int/lit8 p1, v1, 0x13

    .line 34
    .line 35
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 36
    .line 37
    .line 38
    move-result-wide p1

    .line 39
    cmp-long p1, p1, p5

    .line 40
    .line 41
    if-nez p1, :cond_3

    .line 42
    .line 43
    add-int/lit8 p1, v1, 0x1b

    .line 44
    .line 45
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getInt([CI)I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-ne p1, p7, :cond_3

    .line 50
    .line 51
    add-int/lit8 p1, v1, 0x1f

    .line 52
    .line 53
    aget-char p1, v0, p1

    .line 54
    .line 55
    if-ne p1, p8, :cond_3

    .line 56
    .line 57
    add-int/lit8 p1, v1, 0x20

    .line 58
    .line 59
    aget-char p1, v0, p1

    .line 60
    .line 61
    const/16 p2, 0x22

    .line 62
    .line 63
    if-ne p1, p2, :cond_3

    .line 64
    .line 65
    add-int/lit8 p1, v1, 0x21

    .line 66
    .line 67
    aget-char p1, v0, p1

    .line 68
    .line 69
    const/16 p2, 0x3a

    .line 70
    .line 71
    if-eq p1, p2, :cond_1

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_1
    add-int/lit8 v1, v1, 0x23

    .line 75
    .line 76
    aget-char p1, v0, v2

    .line 77
    .line 78
    :goto_0
    const/16 p2, 0x20

    .line 79
    .line 80
    if-gt p1, p2, :cond_2

    .line 81
    .line 82
    const-wide/16 p2, 0x1

    .line 83
    .line 84
    shl-long/2addr p2, p1

    .line 85
    const-wide p4, 0x100003701L

    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    and-long/2addr p2, p4

    .line 91
    const-wide/16 p4, 0x0

    .line 92
    .line 93
    cmp-long p2, p2, p4

    .line 94
    .line 95
    if-eqz p2, :cond_2

    .line 96
    .line 97
    add-int/lit8 p1, v1, 0x1

    .line 98
    .line 99
    aget-char p2, v0, v1

    .line 100
    .line 101
    move v1, p1

    .line 102
    move p1, p2

    .line 103
    goto :goto_0

    .line 104
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 105
    .line 106
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 107
    .line 108
    const/4 p1, 0x1

    .line 109
    return p1

    .line 110
    :cond_3
    :goto_1
    return v4
.end method

.method public final nextIfName4Match33(JJJJ)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x23

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    add-int/lit8 v3, v1, 0x3

    .line 14
    .line 15
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 16
    .line 17
    .line 18
    move-result-wide v5

    .line 19
    cmp-long p1, v5, p1

    .line 20
    .line 21
    if-nez p1, :cond_3

    .line 22
    .line 23
    add-int/lit8 p1, v1, 0xb

    .line 24
    .line 25
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 26
    .line 27
    .line 28
    move-result-wide p1

    .line 29
    cmp-long p1, p1, p3

    .line 30
    .line 31
    if-nez p1, :cond_3

    .line 32
    .line 33
    add-int/lit8 p1, v1, 0x13

    .line 34
    .line 35
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 36
    .line 37
    .line 38
    move-result-wide p1

    .line 39
    cmp-long p1, p1, p5

    .line 40
    .line 41
    if-nez p1, :cond_3

    .line 42
    .line 43
    add-int/lit8 p1, v1, 0x1b

    .line 44
    .line 45
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 46
    .line 47
    .line 48
    move-result-wide p1

    .line 49
    cmp-long p1, p1, p7

    .line 50
    .line 51
    if-eqz p1, :cond_1

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    add-int/lit8 v1, v1, 0x24

    .line 55
    .line 56
    aget-char p1, v0, v2

    .line 57
    .line 58
    :goto_0
    const/16 p2, 0x20

    .line 59
    .line 60
    if-gt p1, p2, :cond_2

    .line 61
    .line 62
    const-wide/16 p2, 0x1

    .line 63
    .line 64
    shl-long/2addr p2, p1

    .line 65
    const-wide p4, 0x100003701L

    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    and-long/2addr p2, p4

    .line 71
    const-wide/16 p4, 0x0

    .line 72
    .line 73
    cmp-long p2, p2, p4

    .line 74
    .line 75
    if-eqz p2, :cond_2

    .line 76
    .line 77
    add-int/lit8 p1, v1, 0x1

    .line 78
    .line 79
    aget-char p2, v0, v1

    .line 80
    .line 81
    move v1, p1

    .line 82
    move p1, p2

    .line 83
    goto :goto_0

    .line 84
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 85
    .line 86
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 87
    .line 88
    const/4 p1, 0x1

    .line 89
    return p1

    .line 90
    :cond_3
    :goto_1
    return v4
.end method

.method public final nextIfName4Match34(JJJJ)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x24

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    add-int/lit8 v3, v1, 0x3

    .line 14
    .line 15
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 16
    .line 17
    .line 18
    move-result-wide v5

    .line 19
    cmp-long p1, v5, p1

    .line 20
    .line 21
    if-nez p1, :cond_3

    .line 22
    .line 23
    add-int/lit8 p1, v1, 0xb

    .line 24
    .line 25
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 26
    .line 27
    .line 28
    move-result-wide p1

    .line 29
    cmp-long p1, p1, p3

    .line 30
    .line 31
    if-nez p1, :cond_3

    .line 32
    .line 33
    add-int/lit8 p1, v1, 0x13

    .line 34
    .line 35
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 36
    .line 37
    .line 38
    move-result-wide p1

    .line 39
    cmp-long p1, p1, p5

    .line 40
    .line 41
    if-nez p1, :cond_3

    .line 42
    .line 43
    add-int/lit8 p1, v1, 0x1b

    .line 44
    .line 45
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 46
    .line 47
    .line 48
    move-result-wide p1

    .line 49
    cmp-long p1, p1, p7

    .line 50
    .line 51
    if-nez p1, :cond_3

    .line 52
    .line 53
    add-int/lit8 p1, v1, 0x23

    .line 54
    .line 55
    aget-char p1, v0, p1

    .line 56
    .line 57
    const/16 p2, 0x3a

    .line 58
    .line 59
    if-eq p1, p2, :cond_1

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_1
    add-int/lit8 v1, v1, 0x25

    .line 63
    .line 64
    aget-char p1, v0, v2

    .line 65
    .line 66
    :goto_0
    const/16 p2, 0x20

    .line 67
    .line 68
    if-gt p1, p2, :cond_2

    .line 69
    .line 70
    const-wide/16 p2, 0x1

    .line 71
    .line 72
    shl-long/2addr p2, p1

    .line 73
    const-wide p4, 0x100003701L

    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    and-long/2addr p2, p4

    .line 79
    const-wide/16 p4, 0x0

    .line 80
    .line 81
    cmp-long p2, p2, p4

    .line 82
    .line 83
    if-eqz p2, :cond_2

    .line 84
    .line 85
    add-int/lit8 p1, v1, 0x1

    .line 86
    .line 87
    aget-char p2, v0, v1

    .line 88
    .line 89
    move v1, p1

    .line 90
    move p1, p2

    .line 91
    goto :goto_0

    .line 92
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 93
    .line 94
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 95
    .line 96
    const/4 p1, 0x1

    .line 97
    return p1

    .line 98
    :cond_3
    :goto_1
    return v4
.end method

.method public final nextIfName4Match35(JJJJ)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x25

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    add-int/lit8 v3, v1, 0x3

    .line 14
    .line 15
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 16
    .line 17
    .line 18
    move-result-wide v5

    .line 19
    cmp-long p1, v5, p1

    .line 20
    .line 21
    if-nez p1, :cond_3

    .line 22
    .line 23
    add-int/lit8 p1, v1, 0xb

    .line 24
    .line 25
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 26
    .line 27
    .line 28
    move-result-wide p1

    .line 29
    cmp-long p1, p1, p3

    .line 30
    .line 31
    if-nez p1, :cond_3

    .line 32
    .line 33
    add-int/lit8 p1, v1, 0x13

    .line 34
    .line 35
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 36
    .line 37
    .line 38
    move-result-wide p1

    .line 39
    cmp-long p1, p1, p5

    .line 40
    .line 41
    if-nez p1, :cond_3

    .line 42
    .line 43
    add-int/lit8 p1, v1, 0x1b

    .line 44
    .line 45
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 46
    .line 47
    .line 48
    move-result-wide p1

    .line 49
    cmp-long p1, p1, p7

    .line 50
    .line 51
    if-nez p1, :cond_3

    .line 52
    .line 53
    add-int/lit8 p1, v1, 0x23

    .line 54
    .line 55
    aget-char p1, v0, p1

    .line 56
    .line 57
    const/16 p2, 0x22

    .line 58
    .line 59
    if-ne p1, p2, :cond_3

    .line 60
    .line 61
    add-int/lit8 p1, v1, 0x24

    .line 62
    .line 63
    aget-char p1, v0, p1

    .line 64
    .line 65
    const/16 p2, 0x3a

    .line 66
    .line 67
    if-eq p1, p2, :cond_1

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_1
    add-int/lit8 v1, v1, 0x26

    .line 71
    .line 72
    aget-char p1, v0, v2

    .line 73
    .line 74
    :goto_0
    const/16 p2, 0x20

    .line 75
    .line 76
    if-gt p1, p2, :cond_2

    .line 77
    .line 78
    const-wide/16 p2, 0x1

    .line 79
    .line 80
    shl-long/2addr p2, p1

    .line 81
    const-wide p4, 0x100003701L

    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    and-long/2addr p2, p4

    .line 87
    const-wide/16 p4, 0x0

    .line 88
    .line 89
    cmp-long p2, p2, p4

    .line 90
    .line 91
    if-eqz p2, :cond_2

    .line 92
    .line 93
    add-int/lit8 p1, v1, 0x1

    .line 94
    .line 95
    aget-char p2, v0, v1

    .line 96
    .line 97
    move v1, p1

    .line 98
    move p1, p2

    .line 99
    goto :goto_0

    .line 100
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 101
    .line 102
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 103
    .line 104
    const/4 p1, 0x1

    .line 105
    return p1

    .line 106
    :cond_3
    :goto_1
    return v4
.end method

.method public final nextIfName4Match36(JJJJB)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x26

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    add-int/lit8 v3, v1, 0x3

    .line 14
    .line 15
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 16
    .line 17
    .line 18
    move-result-wide v5

    .line 19
    cmp-long p1, v5, p1

    .line 20
    .line 21
    if-nez p1, :cond_3

    .line 22
    .line 23
    add-int/lit8 p1, v1, 0xb

    .line 24
    .line 25
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 26
    .line 27
    .line 28
    move-result-wide p1

    .line 29
    cmp-long p1, p1, p3

    .line 30
    .line 31
    if-nez p1, :cond_3

    .line 32
    .line 33
    add-int/lit8 p1, v1, 0x13

    .line 34
    .line 35
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 36
    .line 37
    .line 38
    move-result-wide p1

    .line 39
    cmp-long p1, p1, p5

    .line 40
    .line 41
    if-nez p1, :cond_3

    .line 42
    .line 43
    add-int/lit8 p1, v1, 0x1b

    .line 44
    .line 45
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 46
    .line 47
    .line 48
    move-result-wide p1

    .line 49
    cmp-long p1, p1, p7

    .line 50
    .line 51
    if-nez p1, :cond_3

    .line 52
    .line 53
    add-int/lit8 p1, v1, 0x23

    .line 54
    .line 55
    aget-char p1, v0, p1

    .line 56
    .line 57
    move/from16 p2, p9

    .line 58
    .line 59
    if-ne p1, p2, :cond_3

    .line 60
    .line 61
    add-int/lit8 p1, v1, 0x24

    .line 62
    .line 63
    aget-char p1, v0, p1

    .line 64
    .line 65
    const/16 p2, 0x22

    .line 66
    .line 67
    if-ne p1, p2, :cond_3

    .line 68
    .line 69
    add-int/lit8 p1, v1, 0x25

    .line 70
    .line 71
    aget-char p1, v0, p1

    .line 72
    .line 73
    const/16 p2, 0x3a

    .line 74
    .line 75
    if-eq p1, p2, :cond_1

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_1
    add-int/lit8 v1, v1, 0x27

    .line 79
    .line 80
    aget-char p1, v0, v2

    .line 81
    .line 82
    :goto_0
    const/16 p2, 0x20

    .line 83
    .line 84
    if-gt p1, p2, :cond_2

    .line 85
    .line 86
    const-wide/16 p2, 0x1

    .line 87
    .line 88
    shl-long/2addr p2, p1

    .line 89
    const-wide p4, 0x100003701L

    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    and-long/2addr p2, p4

    .line 95
    const-wide/16 p4, 0x0

    .line 96
    .line 97
    cmp-long p2, p2, p4

    .line 98
    .line 99
    if-eqz p2, :cond_2

    .line 100
    .line 101
    add-int/lit8 p1, v1, 0x1

    .line 102
    .line 103
    aget-char p2, v0, v1

    .line 104
    .line 105
    move v1, p1

    .line 106
    move p1, p2

    .line 107
    goto :goto_0

    .line 108
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 109
    .line 110
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 111
    .line 112
    const/4 p1, 0x1

    .line 113
    return p1

    .line 114
    :cond_3
    :goto_1
    return v4
.end method

.method public final nextIfName4Match37(JJJJI)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x27

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    add-int/lit8 v3, v1, 0x3

    .line 14
    .line 15
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 16
    .line 17
    .line 18
    move-result-wide v5

    .line 19
    cmp-long p1, v5, p1

    .line 20
    .line 21
    if-nez p1, :cond_3

    .line 22
    .line 23
    add-int/lit8 p1, v1, 0xb

    .line 24
    .line 25
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 26
    .line 27
    .line 28
    move-result-wide p1

    .line 29
    cmp-long p1, p1, p3

    .line 30
    .line 31
    if-nez p1, :cond_3

    .line 32
    .line 33
    add-int/lit8 p1, v1, 0x13

    .line 34
    .line 35
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 36
    .line 37
    .line 38
    move-result-wide p1

    .line 39
    cmp-long p1, p1, p5

    .line 40
    .line 41
    if-nez p1, :cond_3

    .line 42
    .line 43
    add-int/lit8 p1, v1, 0x1b

    .line 44
    .line 45
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 46
    .line 47
    .line 48
    move-result-wide p1

    .line 49
    cmp-long p1, p1, p7

    .line 50
    .line 51
    if-nez p1, :cond_3

    .line 52
    .line 53
    add-int/lit8 p1, v1, 0x23

    .line 54
    .line 55
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getInt([CI)I

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    move/from16 p2, p9

    .line 60
    .line 61
    if-eq p1, p2, :cond_1

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_1
    add-int/lit8 v1, v1, 0x28

    .line 65
    .line 66
    aget-char p1, v0, v2

    .line 67
    .line 68
    :goto_0
    const/16 p2, 0x20

    .line 69
    .line 70
    if-gt p1, p2, :cond_2

    .line 71
    .line 72
    const-wide/16 p2, 0x1

    .line 73
    .line 74
    shl-long/2addr p2, p1

    .line 75
    const-wide p4, 0x100003701L

    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    and-long/2addr p2, p4

    .line 81
    const-wide/16 p4, 0x0

    .line 82
    .line 83
    cmp-long p2, p2, p4

    .line 84
    .line 85
    if-eqz p2, :cond_2

    .line 86
    .line 87
    add-int/lit8 p1, v1, 0x1

    .line 88
    .line 89
    aget-char p2, v0, v1

    .line 90
    .line 91
    move v1, p1

    .line 92
    move p1, p2

    .line 93
    goto :goto_0

    .line 94
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 95
    .line 96
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 97
    .line 98
    const/4 p1, 0x1

    .line 99
    return p1

    .line 100
    :cond_3
    :goto_1
    return v4
.end method

.method public final nextIfName4Match38(JJJJI)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x28

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    add-int/lit8 v3, v1, 0x3

    .line 14
    .line 15
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 16
    .line 17
    .line 18
    move-result-wide v5

    .line 19
    cmp-long p1, v5, p1

    .line 20
    .line 21
    if-nez p1, :cond_3

    .line 22
    .line 23
    add-int/lit8 p1, v1, 0xb

    .line 24
    .line 25
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 26
    .line 27
    .line 28
    move-result-wide p1

    .line 29
    cmp-long p1, p1, p3

    .line 30
    .line 31
    if-nez p1, :cond_3

    .line 32
    .line 33
    add-int/lit8 p1, v1, 0x13

    .line 34
    .line 35
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 36
    .line 37
    .line 38
    move-result-wide p1

    .line 39
    cmp-long p1, p1, p5

    .line 40
    .line 41
    if-nez p1, :cond_3

    .line 42
    .line 43
    add-int/lit8 p1, v1, 0x1b

    .line 44
    .line 45
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 46
    .line 47
    .line 48
    move-result-wide p1

    .line 49
    cmp-long p1, p1, p7

    .line 50
    .line 51
    if-nez p1, :cond_3

    .line 52
    .line 53
    add-int/lit8 p1, v1, 0x23

    .line 54
    .line 55
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getInt([CI)I

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    move/from16 p2, p9

    .line 60
    .line 61
    if-ne p1, p2, :cond_3

    .line 62
    .line 63
    add-int/lit8 p1, v1, 0x27

    .line 64
    .line 65
    aget-char p1, v0, p1

    .line 66
    .line 67
    const/16 p2, 0x3a

    .line 68
    .line 69
    if-eq p1, p2, :cond_1

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_1
    add-int/lit8 v1, v1, 0x29

    .line 73
    .line 74
    aget-char p1, v0, v2

    .line 75
    .line 76
    :goto_0
    const/16 p2, 0x20

    .line 77
    .line 78
    if-gt p1, p2, :cond_2

    .line 79
    .line 80
    const-wide/16 p2, 0x1

    .line 81
    .line 82
    shl-long/2addr p2, p1

    .line 83
    const-wide p4, 0x100003701L

    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    and-long/2addr p2, p4

    .line 89
    const-wide/16 p4, 0x0

    .line 90
    .line 91
    cmp-long p2, p2, p4

    .line 92
    .line 93
    if-eqz p2, :cond_2

    .line 94
    .line 95
    add-int/lit8 p1, v1, 0x1

    .line 96
    .line 97
    aget-char p2, v0, v1

    .line 98
    .line 99
    move v1, p1

    .line 100
    move p1, p2

    .line 101
    goto :goto_0

    .line 102
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 103
    .line 104
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 105
    .line 106
    const/4 p1, 0x1

    .line 107
    return p1

    .line 108
    :cond_3
    :goto_1
    return v4
.end method

.method public final nextIfName4Match39(JJJJI)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x29

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    add-int/lit8 v3, v1, 0x3

    .line 14
    .line 15
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 16
    .line 17
    .line 18
    move-result-wide v5

    .line 19
    cmp-long p1, v5, p1

    .line 20
    .line 21
    if-nez p1, :cond_3

    .line 22
    .line 23
    add-int/lit8 p1, v1, 0xb

    .line 24
    .line 25
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 26
    .line 27
    .line 28
    move-result-wide p1

    .line 29
    cmp-long p1, p1, p3

    .line 30
    .line 31
    if-nez p1, :cond_3

    .line 32
    .line 33
    add-int/lit8 p1, v1, 0x13

    .line 34
    .line 35
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 36
    .line 37
    .line 38
    move-result-wide p1

    .line 39
    cmp-long p1, p1, p5

    .line 40
    .line 41
    if-nez p1, :cond_3

    .line 42
    .line 43
    add-int/lit8 p1, v1, 0x1b

    .line 44
    .line 45
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 46
    .line 47
    .line 48
    move-result-wide p1

    .line 49
    cmp-long p1, p1, p7

    .line 50
    .line 51
    if-nez p1, :cond_3

    .line 52
    .line 53
    add-int/lit8 p1, v1, 0x23

    .line 54
    .line 55
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getInt([CI)I

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    move/from16 p2, p9

    .line 60
    .line 61
    if-ne p1, p2, :cond_3

    .line 62
    .line 63
    add-int/lit8 p1, v1, 0x27

    .line 64
    .line 65
    aget-char p1, v0, p1

    .line 66
    .line 67
    const/16 p2, 0x22

    .line 68
    .line 69
    if-ne p1, p2, :cond_3

    .line 70
    .line 71
    add-int/lit8 p1, v1, 0x28

    .line 72
    .line 73
    aget-char p1, v0, p1

    .line 74
    .line 75
    const/16 p2, 0x3a

    .line 76
    .line 77
    if-eq p1, p2, :cond_1

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_1
    add-int/lit8 v1, v1, 0x2a

    .line 81
    .line 82
    aget-char p1, v0, v2

    .line 83
    .line 84
    :goto_0
    const/16 p2, 0x20

    .line 85
    .line 86
    if-gt p1, p2, :cond_2

    .line 87
    .line 88
    const-wide/16 p2, 0x1

    .line 89
    .line 90
    shl-long/2addr p2, p1

    .line 91
    const-wide p4, 0x100003701L

    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    and-long/2addr p2, p4

    .line 97
    const-wide/16 p4, 0x0

    .line 98
    .line 99
    cmp-long p2, p2, p4

    .line 100
    .line 101
    if-eqz p2, :cond_2

    .line 102
    .line 103
    add-int/lit8 p1, v1, 0x1

    .line 104
    .line 105
    aget-char p2, v0, v1

    .line 106
    .line 107
    move v1, p1

    .line 108
    move p1, p2

    .line 109
    goto :goto_0

    .line 110
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 111
    .line 112
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 113
    .line 114
    const/4 p1, 0x1

    .line 115
    return p1

    .line 116
    :cond_3
    :goto_1
    return v4
.end method

.method public final nextIfName4Match4(B)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x6

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 8
    .line 9
    if-ge v2, v3, :cond_2

    .line 10
    .line 11
    add-int/lit8 v3, v1, 0x3

    .line 12
    .line 13
    aget-char v3, v0, v3

    .line 14
    .line 15
    if-ne v3, p1, :cond_2

    .line 16
    .line 17
    add-int/lit8 p1, v1, 0x4

    .line 18
    .line 19
    aget-char p1, v0, p1

    .line 20
    .line 21
    const/16 v3, 0x22

    .line 22
    .line 23
    if-ne p1, v3, :cond_2

    .line 24
    .line 25
    add-int/lit8 v1, v1, 0x5

    .line 26
    .line 27
    aget-char p1, v0, v1

    .line 28
    .line 29
    const/16 v1, 0x3a

    .line 30
    .line 31
    if-eq p1, v1, :cond_0

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_0
    aget-char p1, v0, v2

    .line 35
    .line 36
    :goto_0
    const/16 v1, 0x20

    .line 37
    .line 38
    if-gt p1, v1, :cond_1

    .line 39
    .line 40
    const-wide/16 v3, 0x1

    .line 41
    .line 42
    shl-long/2addr v3, p1

    .line 43
    const-wide v5, 0x100003701L

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    and-long/2addr v3, v5

    .line 49
    const-wide/16 v5, 0x0

    .line 50
    .line 51
    cmp-long v1, v3, v5

    .line 52
    .line 53
    if-eqz v1, :cond_1

    .line 54
    .line 55
    add-int/lit8 v2, v2, 0x1

    .line 56
    .line 57
    aget-char p1, v0, v2

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    const/4 v0, 0x1

    .line 61
    add-int/2addr v2, v0

    .line 62
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 63
    .line 64
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 65
    .line 66
    return v0

    .line 67
    :cond_2
    :goto_1
    const/4 p1, 0x0

    .line 68
    return p1
.end method

.method public final nextIfName4Match40(JJJJIB)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x2a

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    add-int/lit8 v3, v1, 0x3

    .line 14
    .line 15
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 16
    .line 17
    .line 18
    move-result-wide v5

    .line 19
    cmp-long p1, v5, p1

    .line 20
    .line 21
    if-nez p1, :cond_3

    .line 22
    .line 23
    add-int/lit8 p1, v1, 0xb

    .line 24
    .line 25
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 26
    .line 27
    .line 28
    move-result-wide p1

    .line 29
    cmp-long p1, p1, p3

    .line 30
    .line 31
    if-nez p1, :cond_3

    .line 32
    .line 33
    add-int/lit8 p1, v1, 0x13

    .line 34
    .line 35
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 36
    .line 37
    .line 38
    move-result-wide p1

    .line 39
    cmp-long p1, p1, p5

    .line 40
    .line 41
    if-nez p1, :cond_3

    .line 42
    .line 43
    add-int/lit8 p1, v1, 0x1b

    .line 44
    .line 45
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 46
    .line 47
    .line 48
    move-result-wide p1

    .line 49
    cmp-long p1, p1, p7

    .line 50
    .line 51
    if-nez p1, :cond_3

    .line 52
    .line 53
    add-int/lit8 p1, v1, 0x23

    .line 54
    .line 55
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getInt([CI)I

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    move/from16 p2, p9

    .line 60
    .line 61
    if-ne p1, p2, :cond_3

    .line 62
    .line 63
    add-int/lit8 p1, v1, 0x27

    .line 64
    .line 65
    aget-char p1, v0, p1

    .line 66
    .line 67
    move/from16 p2, p10

    .line 68
    .line 69
    if-ne p1, p2, :cond_3

    .line 70
    .line 71
    add-int/lit8 p1, v1, 0x28

    .line 72
    .line 73
    aget-char p1, v0, p1

    .line 74
    .line 75
    const/16 p2, 0x22

    .line 76
    .line 77
    if-ne p1, p2, :cond_3

    .line 78
    .line 79
    add-int/lit8 p1, v1, 0x29

    .line 80
    .line 81
    aget-char p1, v0, p1

    .line 82
    .line 83
    const/16 p2, 0x3a

    .line 84
    .line 85
    if-eq p1, p2, :cond_1

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_1
    add-int/lit8 v1, v1, 0x2b

    .line 89
    .line 90
    aget-char p1, v0, v2

    .line 91
    .line 92
    :goto_0
    const/16 p2, 0x20

    .line 93
    .line 94
    if-gt p1, p2, :cond_2

    .line 95
    .line 96
    const-wide/16 p2, 0x1

    .line 97
    .line 98
    shl-long/2addr p2, p1

    .line 99
    const-wide p4, 0x100003701L

    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    and-long/2addr p2, p4

    .line 105
    const-wide/16 p4, 0x0

    .line 106
    .line 107
    cmp-long p2, p2, p4

    .line 108
    .line 109
    if-eqz p2, :cond_2

    .line 110
    .line 111
    add-int/lit8 p1, v1, 0x1

    .line 112
    .line 113
    aget-char p2, v0, v1

    .line 114
    .line 115
    move v1, p1

    .line 116
    move p1, p2

    .line 117
    goto :goto_0

    .line 118
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 119
    .line 120
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 121
    .line 122
    const/4 p1, 0x1

    .line 123
    return p1

    .line 124
    :cond_3
    :goto_1
    return v4
.end method

.method public final nextIfName4Match41(JJJJJ)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x2b

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    add-int/lit8 v3, v1, 0x3

    .line 14
    .line 15
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 16
    .line 17
    .line 18
    move-result-wide v5

    .line 19
    cmp-long p1, v5, p1

    .line 20
    .line 21
    if-nez p1, :cond_3

    .line 22
    .line 23
    add-int/lit8 p1, v1, 0xb

    .line 24
    .line 25
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 26
    .line 27
    .line 28
    move-result-wide p1

    .line 29
    cmp-long p1, p1, p3

    .line 30
    .line 31
    if-nez p1, :cond_3

    .line 32
    .line 33
    add-int/lit8 p1, v1, 0x13

    .line 34
    .line 35
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 36
    .line 37
    .line 38
    move-result-wide p1

    .line 39
    cmp-long p1, p1, p5

    .line 40
    .line 41
    if-nez p1, :cond_3

    .line 42
    .line 43
    add-int/lit8 p1, v1, 0x1b

    .line 44
    .line 45
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 46
    .line 47
    .line 48
    move-result-wide p1

    .line 49
    cmp-long p1, p1, p7

    .line 50
    .line 51
    if-nez p1, :cond_3

    .line 52
    .line 53
    add-int/lit8 p1, v1, 0x23

    .line 54
    .line 55
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 56
    .line 57
    .line 58
    move-result-wide p1

    .line 59
    cmp-long p1, p1, p9

    .line 60
    .line 61
    if-eqz p1, :cond_1

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_1
    add-int/lit8 v1, v1, 0x2c

    .line 65
    .line 66
    aget-char p1, v0, v2

    .line 67
    .line 68
    :goto_0
    const/16 p2, 0x20

    .line 69
    .line 70
    if-gt p1, p2, :cond_2

    .line 71
    .line 72
    const-wide/16 p2, 0x1

    .line 73
    .line 74
    shl-long/2addr p2, p1

    .line 75
    const-wide p4, 0x100003701L

    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    and-long/2addr p2, p4

    .line 81
    const-wide/16 p4, 0x0

    .line 82
    .line 83
    cmp-long p2, p2, p4

    .line 84
    .line 85
    if-eqz p2, :cond_2

    .line 86
    .line 87
    add-int/lit8 p1, v1, 0x1

    .line 88
    .line 89
    aget-char p2, v0, v1

    .line 90
    .line 91
    move v1, p1

    .line 92
    move p1, p2

    .line 93
    goto :goto_0

    .line 94
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 95
    .line 96
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 97
    .line 98
    const/4 p1, 0x1

    .line 99
    return p1

    .line 100
    :cond_3
    :goto_1
    return v4
.end method

.method public final nextIfName4Match42(JJJJJ)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x2c

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    add-int/lit8 v3, v1, 0x3

    .line 14
    .line 15
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 16
    .line 17
    .line 18
    move-result-wide v5

    .line 19
    cmp-long p1, v5, p1

    .line 20
    .line 21
    if-nez p1, :cond_3

    .line 22
    .line 23
    add-int/lit8 p1, v1, 0xb

    .line 24
    .line 25
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 26
    .line 27
    .line 28
    move-result-wide p1

    .line 29
    cmp-long p1, p1, p3

    .line 30
    .line 31
    if-nez p1, :cond_3

    .line 32
    .line 33
    add-int/lit8 p1, v1, 0x13

    .line 34
    .line 35
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 36
    .line 37
    .line 38
    move-result-wide p1

    .line 39
    cmp-long p1, p1, p5

    .line 40
    .line 41
    if-nez p1, :cond_3

    .line 42
    .line 43
    add-int/lit8 p1, v1, 0x1b

    .line 44
    .line 45
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 46
    .line 47
    .line 48
    move-result-wide p1

    .line 49
    cmp-long p1, p1, p7

    .line 50
    .line 51
    if-nez p1, :cond_3

    .line 52
    .line 53
    add-int/lit8 p1, v1, 0x23

    .line 54
    .line 55
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 56
    .line 57
    .line 58
    move-result-wide p1

    .line 59
    cmp-long p1, p1, p9

    .line 60
    .line 61
    if-nez p1, :cond_3

    .line 62
    .line 63
    add-int/lit8 p1, v1, 0x2b

    .line 64
    .line 65
    aget-char p1, v0, p1

    .line 66
    .line 67
    const/16 p2, 0x3a

    .line 68
    .line 69
    if-eq p1, p2, :cond_1

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_1
    add-int/lit8 v1, v1, 0x2d

    .line 73
    .line 74
    aget-char p1, v0, v2

    .line 75
    .line 76
    :goto_0
    const/16 p2, 0x20

    .line 77
    .line 78
    if-gt p1, p2, :cond_2

    .line 79
    .line 80
    const-wide/16 p2, 0x1

    .line 81
    .line 82
    shl-long/2addr p2, p1

    .line 83
    const-wide p4, 0x100003701L

    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    and-long/2addr p2, p4

    .line 89
    const-wide/16 p4, 0x0

    .line 90
    .line 91
    cmp-long p2, p2, p4

    .line 92
    .line 93
    if-eqz p2, :cond_2

    .line 94
    .line 95
    add-int/lit8 p1, v1, 0x1

    .line 96
    .line 97
    aget-char p2, v0, v1

    .line 98
    .line 99
    move v1, p1

    .line 100
    move p1, p2

    .line 101
    goto :goto_0

    .line 102
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 103
    .line 104
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 105
    .line 106
    const/4 p1, 0x1

    .line 107
    return p1

    .line 108
    :cond_3
    :goto_1
    return v4
.end method

.method public final nextIfName4Match43(JJJJJ)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x2d

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    add-int/lit8 v3, v1, 0x3

    .line 14
    .line 15
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 16
    .line 17
    .line 18
    move-result-wide v5

    .line 19
    cmp-long p1, v5, p1

    .line 20
    .line 21
    if-nez p1, :cond_3

    .line 22
    .line 23
    add-int/lit8 p1, v1, 0xb

    .line 24
    .line 25
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 26
    .line 27
    .line 28
    move-result-wide p1

    .line 29
    cmp-long p1, p1, p3

    .line 30
    .line 31
    if-nez p1, :cond_3

    .line 32
    .line 33
    add-int/lit8 p1, v1, 0x13

    .line 34
    .line 35
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 36
    .line 37
    .line 38
    move-result-wide p1

    .line 39
    cmp-long p1, p1, p5

    .line 40
    .line 41
    if-nez p1, :cond_3

    .line 42
    .line 43
    add-int/lit8 p1, v1, 0x1b

    .line 44
    .line 45
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 46
    .line 47
    .line 48
    move-result-wide p1

    .line 49
    cmp-long p1, p1, p7

    .line 50
    .line 51
    if-nez p1, :cond_3

    .line 52
    .line 53
    add-int/lit8 p1, v1, 0x23

    .line 54
    .line 55
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 56
    .line 57
    .line 58
    move-result-wide p1

    .line 59
    cmp-long p1, p1, p9

    .line 60
    .line 61
    if-nez p1, :cond_3

    .line 62
    .line 63
    add-int/lit8 p1, v1, 0x2b

    .line 64
    .line 65
    aget-char p1, v0, p1

    .line 66
    .line 67
    const/16 p2, 0x22

    .line 68
    .line 69
    if-ne p1, p2, :cond_3

    .line 70
    .line 71
    add-int/lit8 p1, v1, 0x2c

    .line 72
    .line 73
    aget-char p1, v0, p1

    .line 74
    .line 75
    const/16 p2, 0x3a

    .line 76
    .line 77
    if-eq p1, p2, :cond_1

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_1
    add-int/lit8 v1, v1, 0x2e

    .line 81
    .line 82
    aget-char p1, v0, v2

    .line 83
    .line 84
    :goto_0
    const/16 p2, 0x20

    .line 85
    .line 86
    if-gt p1, p2, :cond_2

    .line 87
    .line 88
    const-wide/16 p2, 0x1

    .line 89
    .line 90
    shl-long/2addr p2, p1

    .line 91
    const-wide p4, 0x100003701L

    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    and-long/2addr p2, p4

    .line 97
    const-wide/16 p4, 0x0

    .line 98
    .line 99
    cmp-long p2, p2, p4

    .line 100
    .line 101
    if-eqz p2, :cond_2

    .line 102
    .line 103
    add-int/lit8 p1, v1, 0x1

    .line 104
    .line 105
    aget-char p2, v0, v1

    .line 106
    .line 107
    move v1, p1

    .line 108
    move p1, p2

    .line 109
    goto :goto_0

    .line 110
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 111
    .line 112
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 113
    .line 114
    const/4 p1, 0x1

    .line 115
    return p1

    .line 116
    :cond_3
    :goto_1
    return v4
.end method

.method public final nextIfName4Match5(I)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x7

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 8
    .line 9
    if-ge v2, v3, :cond_2

    .line 10
    .line 11
    add-int/lit8 v3, v1, 0x3

    .line 12
    .line 13
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getInt([CI)I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-eq v3, p1, :cond_0

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    add-int/lit8 v1, v1, 0x8

    .line 21
    .line 22
    aget-char p1, v0, v2

    .line 23
    .line 24
    :goto_0
    const/16 v2, 0x20

    .line 25
    .line 26
    if-gt p1, v2, :cond_1

    .line 27
    .line 28
    const-wide/16 v2, 0x1

    .line 29
    .line 30
    shl-long/2addr v2, p1

    .line 31
    const-wide v4, 0x100003701L

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    and-long/2addr v2, v4

    .line 37
    const-wide/16 v4, 0x0

    .line 38
    .line 39
    cmp-long v2, v2, v4

    .line 40
    .line 41
    if-eqz v2, :cond_1

    .line 42
    .line 43
    add-int/lit8 p1, v1, 0x1

    .line 44
    .line 45
    aget-char v1, v0, v1

    .line 46
    .line 47
    move v6, v1

    .line 48
    move v1, p1

    .line 49
    move p1, v6

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 52
    .line 53
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 54
    .line 55
    const/4 p1, 0x1

    .line 56
    return p1

    .line 57
    :cond_2
    :goto_1
    const/4 p1, 0x0

    .line 58
    return p1
.end method

.method public final nextIfName4Match6(I)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x8

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 8
    .line 9
    if-ge v2, v3, :cond_2

    .line 10
    .line 11
    add-int/lit8 v3, v1, 0x3

    .line 12
    .line 13
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getInt([CI)I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-ne v3, p1, :cond_2

    .line 18
    .line 19
    add-int/lit8 p1, v1, 0x7

    .line 20
    .line 21
    aget-char p1, v0, p1

    .line 22
    .line 23
    const/16 v3, 0x3a

    .line 24
    .line 25
    if-eq p1, v3, :cond_0

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    add-int/lit8 v1, v1, 0x9

    .line 29
    .line 30
    aget-char p1, v0, v2

    .line 31
    .line 32
    :goto_0
    const/16 v2, 0x20

    .line 33
    .line 34
    if-gt p1, v2, :cond_1

    .line 35
    .line 36
    const-wide/16 v2, 0x1

    .line 37
    .line 38
    shl-long/2addr v2, p1

    .line 39
    const-wide v4, 0x100003701L

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    and-long/2addr v2, v4

    .line 45
    const-wide/16 v4, 0x0

    .line 46
    .line 47
    cmp-long v2, v2, v4

    .line 48
    .line 49
    if-eqz v2, :cond_1

    .line 50
    .line 51
    add-int/lit8 p1, v1, 0x1

    .line 52
    .line 53
    aget-char v1, v0, v1

    .line 54
    .line 55
    move v6, v1

    .line 56
    move v1, p1

    .line 57
    move p1, v6

    .line 58
    goto :goto_0

    .line 59
    :cond_1
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 60
    .line 61
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 62
    .line 63
    const/4 p1, 0x1

    .line 64
    return p1

    .line 65
    :cond_2
    :goto_1
    const/4 p1, 0x0

    .line 66
    return p1
.end method

.method public final nextIfName4Match7(I)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x9

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    add-int/lit8 v3, v1, 0x3

    .line 14
    .line 15
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getInt([CI)I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-ne v3, p1, :cond_3

    .line 20
    .line 21
    add-int/lit8 p1, v1, 0x7

    .line 22
    .line 23
    aget-char p1, v0, p1

    .line 24
    .line 25
    const/16 v3, 0x22

    .line 26
    .line 27
    if-ne p1, v3, :cond_3

    .line 28
    .line 29
    add-int/lit8 p1, v1, 0x8

    .line 30
    .line 31
    aget-char p1, v0, p1

    .line 32
    .line 33
    const/16 v3, 0x3a

    .line 34
    .line 35
    if-eq p1, v3, :cond_1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    add-int/lit8 v1, v1, 0xa

    .line 39
    .line 40
    aget-char p1, v0, v2

    .line 41
    .line 42
    :goto_0
    const/16 v2, 0x20

    .line 43
    .line 44
    if-gt p1, v2, :cond_2

    .line 45
    .line 46
    const-wide/16 v2, 0x1

    .line 47
    .line 48
    shl-long/2addr v2, p1

    .line 49
    const-wide v4, 0x100003701L

    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    and-long/2addr v2, v4

    .line 55
    const-wide/16 v4, 0x0

    .line 56
    .line 57
    cmp-long v2, v2, v4

    .line 58
    .line 59
    if-eqz v2, :cond_2

    .line 60
    .line 61
    add-int/lit8 p1, v1, 0x1

    .line 62
    .line 63
    aget-char v1, v0, v1

    .line 64
    .line 65
    move v6, v1

    .line 66
    move v1, p1

    .line 67
    move p1, v6

    .line 68
    goto :goto_0

    .line 69
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 70
    .line 71
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 72
    .line 73
    const/4 p1, 0x1

    .line 74
    return p1

    .line 75
    :cond_3
    :goto_1
    return v4
.end method

.method public final nextIfName4Match8(IB)Z
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0xa

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    add-int/lit8 v3, v1, 0x3

    .line 14
    .line 15
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getInt([CI)I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-ne v3, p1, :cond_3

    .line 20
    .line 21
    add-int/lit8 p1, v1, 0x7

    .line 22
    .line 23
    aget-char p1, v0, p1

    .line 24
    .line 25
    if-ne p1, p2, :cond_3

    .line 26
    .line 27
    add-int/lit8 p1, v1, 0x8

    .line 28
    .line 29
    aget-char p1, v0, p1

    .line 30
    .line 31
    const/16 p2, 0x22

    .line 32
    .line 33
    if-ne p1, p2, :cond_3

    .line 34
    .line 35
    add-int/lit8 p1, v1, 0x9

    .line 36
    .line 37
    aget-char p1, v0, p1

    .line 38
    .line 39
    const/16 p2, 0x3a

    .line 40
    .line 41
    if-eq p1, p2, :cond_1

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    add-int/lit8 v1, v1, 0xb

    .line 45
    .line 46
    aget-char p1, v0, v2

    .line 47
    .line 48
    :goto_0
    const/16 p2, 0x20

    .line 49
    .line 50
    if-gt p1, p2, :cond_2

    .line 51
    .line 52
    const-wide/16 v2, 0x1

    .line 53
    .line 54
    shl-long/2addr v2, p1

    .line 55
    const-wide v4, 0x100003701L

    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    and-long/2addr v2, v4

    .line 61
    const-wide/16 v4, 0x0

    .line 62
    .line 63
    cmp-long p2, v2, v4

    .line 64
    .line 65
    if-eqz p2, :cond_2

    .line 66
    .line 67
    add-int/lit8 p1, v1, 0x1

    .line 68
    .line 69
    aget-char p2, v0, v1

    .line 70
    .line 71
    move v1, p1

    .line 72
    move p1, p2

    .line 73
    goto :goto_0

    .line 74
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 75
    .line 76
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 77
    .line 78
    const/4 p1, 0x1

    .line 79
    return p1

    .line 80
    :cond_3
    :goto_1
    return v4
.end method

.method public final nextIfName4Match9(J)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0xb

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    add-int/lit8 v3, v1, 0x3

    .line 14
    .line 15
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 16
    .line 17
    .line 18
    move-result-wide v5

    .line 19
    cmp-long p1, v5, p1

    .line 20
    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    return v4

    .line 24
    :cond_1
    add-int/lit8 v1, v1, 0xc

    .line 25
    .line 26
    aget-char p1, v0, v2

    .line 27
    .line 28
    :goto_0
    const/16 p2, 0x20

    .line 29
    .line 30
    if-gt p1, p2, :cond_2

    .line 31
    .line 32
    const-wide/16 v2, 0x1

    .line 33
    .line 34
    shl-long/2addr v2, p1

    .line 35
    const-wide v4, 0x100003701L

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    and-long/2addr v2, v4

    .line 41
    const-wide/16 v4, 0x0

    .line 42
    .line 43
    cmp-long p2, v2, v4

    .line 44
    .line 45
    if-eqz p2, :cond_2

    .line 46
    .line 47
    add-int/lit8 p1, v1, 0x1

    .line 48
    .line 49
    aget-char p2, v0, v1

    .line 50
    .line 51
    move v1, p1

    .line 52
    move p1, p2

    .line 53
    goto :goto_0

    .line 54
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 55
    .line 56
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 57
    .line 58
    const/4 p1, 0x1

    .line 59
    return p1
.end method

.method public final nextIfName8Match0()Z
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x7

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 8
    .line 9
    if-ne v2, v3, :cond_0

    .line 10
    .line 11
    const/16 v0, 0x1a

    .line 12
    .line 13
    iput-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    return v0

    .line 17
    :cond_0
    add-int/lit8 v1, v1, 0x8

    .line 18
    .line 19
    aget-char v2, v0, v2

    .line 20
    .line 21
    :goto_0
    const/16 v3, 0x20

    .line 22
    .line 23
    if-gt v2, v3, :cond_1

    .line 24
    .line 25
    const-wide/16 v3, 0x1

    .line 26
    .line 27
    shl-long/2addr v3, v2

    .line 28
    const-wide v5, 0x100003701L

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    and-long/2addr v3, v5

    .line 34
    const-wide/16 v5, 0x0

    .line 35
    .line 36
    cmp-long v3, v3, v5

    .line 37
    .line 38
    if-eqz v3, :cond_1

    .line 39
    .line 40
    add-int/lit8 v2, v1, 0x1

    .line 41
    .line 42
    aget-char v1, v0, v1

    .line 43
    .line 44
    move v7, v2

    .line 45
    move v2, v1

    .line 46
    move v1, v7

    .line 47
    goto :goto_0

    .line 48
    :cond_1
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 49
    .line 50
    iput-char v2, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 51
    .line 52
    const/4 v0, 0x1

    .line 53
    return v0
.end method

.method public final nextIfName8Match1()Z
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x8

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 8
    .line 9
    if-ge v2, v3, :cond_2

    .line 10
    .line 11
    add-int/lit8 v3, v1, 0x7

    .line 12
    .line 13
    aget-char v3, v0, v3

    .line 14
    .line 15
    const/16 v4, 0x3a

    .line 16
    .line 17
    if-eq v3, v4, :cond_0

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    add-int/lit8 v1, v1, 0x9

    .line 21
    .line 22
    aget-char v2, v0, v2

    .line 23
    .line 24
    :goto_0
    const/16 v3, 0x20

    .line 25
    .line 26
    if-gt v2, v3, :cond_1

    .line 27
    .line 28
    const-wide/16 v3, 0x1

    .line 29
    .line 30
    shl-long/2addr v3, v2

    .line 31
    const-wide v5, 0x100003701L

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    and-long/2addr v3, v5

    .line 37
    const-wide/16 v5, 0x0

    .line 38
    .line 39
    cmp-long v3, v3, v5

    .line 40
    .line 41
    if-eqz v3, :cond_1

    .line 42
    .line 43
    add-int/lit8 v2, v1, 0x1

    .line 44
    .line 45
    aget-char v1, v0, v1

    .line 46
    .line 47
    move v7, v2

    .line 48
    move v2, v1

    .line 49
    move v1, v7

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 52
    .line 53
    iput-char v2, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 54
    .line 55
    const/4 v0, 0x1

    .line 56
    return v0

    .line 57
    :cond_2
    :goto_1
    const/4 v0, 0x0

    .line 58
    return v0
.end method

.method public final nextIfName8Match2()Z
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x9

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 8
    .line 9
    if-ge v2, v3, :cond_2

    .line 10
    .line 11
    add-int/lit8 v3, v1, 0x7

    .line 12
    .line 13
    aget-char v3, v0, v3

    .line 14
    .line 15
    const/16 v4, 0x22

    .line 16
    .line 17
    if-ne v3, v4, :cond_2

    .line 18
    .line 19
    add-int/lit8 v3, v1, 0x8

    .line 20
    .line 21
    aget-char v3, v0, v3

    .line 22
    .line 23
    const/16 v4, 0x3a

    .line 24
    .line 25
    if-eq v3, v4, :cond_0

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    add-int/lit8 v1, v1, 0xa

    .line 29
    .line 30
    aget-char v2, v0, v2

    .line 31
    .line 32
    :goto_0
    const/16 v3, 0x20

    .line 33
    .line 34
    if-gt v2, v3, :cond_1

    .line 35
    .line 36
    const-wide/16 v3, 0x1

    .line 37
    .line 38
    shl-long/2addr v3, v2

    .line 39
    const-wide v5, 0x100003701L

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    and-long/2addr v3, v5

    .line 45
    const-wide/16 v5, 0x0

    .line 46
    .line 47
    cmp-long v3, v3, v5

    .line 48
    .line 49
    if-eqz v3, :cond_1

    .line 50
    .line 51
    add-int/lit8 v2, v1, 0x1

    .line 52
    .line 53
    aget-char v1, v0, v1

    .line 54
    .line 55
    move v7, v2

    .line 56
    move v2, v1

    .line 57
    move v1, v7

    .line 58
    goto :goto_0

    .line 59
    :cond_1
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 60
    .line 61
    iput-char v2, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 62
    .line 63
    const/4 v0, 0x1

    .line 64
    return v0

    .line 65
    :cond_2
    :goto_1
    const/4 v0, 0x0

    .line 66
    return v0
.end method

.method public nextIfNull()Z
    .locals 3

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 2
    .line 3
    const/16 v1, 0x6e

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 8
    .line 9
    add-int/lit8 v1, v0, 0x2

    .line 10
    .line 11
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 12
    .line 13
    if-ge v1, v2, :cond_0

    .line 14
    .line 15
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 16
    .line 17
    aget-char v0, v1, v0

    .line 18
    .line 19
    const/16 v1, 0x75

    .line 20
    .line 21
    if-ne v0, v1, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->readNull()V

    .line 24
    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    return v0

    .line 28
    :cond_0
    const/4 v0, 0x0

    .line 29
    return v0
.end method

.method public nextIfNullOrEmptyString()Z
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-char v1, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 4
    .line 5
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 6
    .line 7
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 8
    .line 9
    iget-object v4, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 10
    .line 11
    const/16 v5, 0x75

    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    const/16 v7, 0x6c

    .line 15
    .line 16
    const/4 v8, 0x1

    .line 17
    const/16 v9, 0x6e

    .line 18
    .line 19
    if-ne v1, v9, :cond_0

    .line 20
    .line 21
    add-int/lit8 v10, v3, 0x2

    .line 22
    .line 23
    if-ge v10, v2, :cond_0

    .line 24
    .line 25
    aget-char v11, v4, v3

    .line 26
    .line 27
    if-ne v11, v5, :cond_0

    .line 28
    .line 29
    add-int/lit8 v11, v3, 0x1

    .line 30
    .line 31
    aget-char v11, v4, v11

    .line 32
    .line 33
    if-ne v11, v7, :cond_0

    .line 34
    .line 35
    aget-char v10, v4, v10

    .line 36
    .line 37
    if-ne v10, v7, :cond_0

    .line 38
    .line 39
    add-int/lit8 v3, v3, 0x3

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_0
    const/16 v10, 0x22

    .line 43
    .line 44
    if-eq v1, v10, :cond_2

    .line 45
    .line 46
    const/16 v10, 0x27

    .line 47
    .line 48
    if-ne v1, v10, :cond_1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    return v6

    .line 52
    :cond_2
    :goto_0
    if-ge v3, v2, :cond_3

    .line 53
    .line 54
    aget-char v10, v4, v3

    .line 55
    .line 56
    if-ne v10, v1, :cond_3

    .line 57
    .line 58
    add-int/2addr v3, v8

    .line 59
    goto :goto_1

    .line 60
    :cond_3
    add-int/lit8 v10, v3, 0x4

    .line 61
    .line 62
    if-ge v10, v2, :cond_c

    .line 63
    .line 64
    aget-char v11, v4, v3

    .line 65
    .line 66
    if-ne v11, v9, :cond_c

    .line 67
    .line 68
    add-int/lit8 v9, v3, 0x1

    .line 69
    .line 70
    aget-char v9, v4, v9

    .line 71
    .line 72
    if-ne v9, v5, :cond_c

    .line 73
    .line 74
    add-int/lit8 v5, v3, 0x2

    .line 75
    .line 76
    aget-char v5, v4, v5

    .line 77
    .line 78
    if-ne v5, v7, :cond_c

    .line 79
    .line 80
    add-int/lit8 v5, v3, 0x3

    .line 81
    .line 82
    aget-char v5, v4, v5

    .line 83
    .line 84
    if-ne v5, v7, :cond_c

    .line 85
    .line 86
    aget-char v5, v4, v10

    .line 87
    .line 88
    if-ne v5, v1, :cond_c

    .line 89
    .line 90
    add-int/lit8 v3, v3, 0x5

    .line 91
    .line 92
    :goto_1
    const/16 v1, 0x1a

    .line 93
    .line 94
    if-ne v3, v2, :cond_4

    .line 95
    .line 96
    move v5, v3

    .line 97
    :goto_2
    move v3, v1

    .line 98
    goto :goto_3

    .line 99
    :cond_4
    add-int/lit8 v5, v3, 0x1

    .line 100
    .line 101
    aget-char v3, v4, v3

    .line 102
    .line 103
    :goto_3
    const-wide/16 v9, 0x0

    .line 104
    .line 105
    const-wide v11, 0x100003701L

    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    const-wide/16 v13, 0x1

    .line 111
    .line 112
    const/16 v7, 0x20

    .line 113
    .line 114
    if-gt v3, v7, :cond_6

    .line 115
    .line 116
    shl-long v15, v13, v3

    .line 117
    .line 118
    and-long/2addr v15, v11

    .line 119
    cmp-long v15, v15, v9

    .line 120
    .line 121
    if-eqz v15, :cond_6

    .line 122
    .line 123
    if-ne v5, v2, :cond_5

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_5
    add-int/lit8 v3, v5, 0x1

    .line 127
    .line 128
    aget-char v5, v4, v5

    .line 129
    .line 130
    move/from16 v17, v5

    .line 131
    .line 132
    move v5, v3

    .line 133
    move/from16 v3, v17

    .line 134
    .line 135
    goto :goto_3

    .line 136
    :cond_6
    const/16 v15, 0x2c

    .line 137
    .line 138
    if-ne v3, v15, :cond_7

    .line 139
    .line 140
    move v6, v8

    .line 141
    :cond_7
    iput-boolean v6, v0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 142
    .line 143
    if-eqz v6, :cond_9

    .line 144
    .line 145
    if-ne v5, v2, :cond_8

    .line 146
    .line 147
    :goto_4
    move v3, v1

    .line 148
    goto :goto_6

    .line 149
    :cond_8
    add-int/lit8 v3, v5, 0x1

    .line 150
    .line 151
    aget-char v5, v4, v5

    .line 152
    .line 153
    :goto_5
    move/from16 v17, v5

    .line 154
    .line 155
    move v5, v3

    .line 156
    move/from16 v3, v17

    .line 157
    .line 158
    :cond_9
    :goto_6
    if-gt v3, v7, :cond_b

    .line 159
    .line 160
    shl-long v15, v13, v3

    .line 161
    .line 162
    and-long/2addr v15, v11

    .line 163
    cmp-long v6, v15, v9

    .line 164
    .line 165
    if-eqz v6, :cond_b

    .line 166
    .line 167
    if-ne v5, v2, :cond_a

    .line 168
    .line 169
    goto :goto_4

    .line 170
    :cond_a
    add-int/lit8 v3, v5, 0x1

    .line 171
    .line 172
    aget-char v5, v4, v5

    .line 173
    .line 174
    goto :goto_5

    .line 175
    :cond_b
    iput v5, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 176
    .line 177
    iput-char v3, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 178
    .line 179
    return v8

    .line 180
    :cond_c
    return v6
.end method

.method public nextIfObjectEnd()Z
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-char v1, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 4
    .line 5
    const/16 v2, 0x7d

    .line 6
    .line 7
    if-eq v1, v2, :cond_0

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    return v1

    .line 11
    :cond_0
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 12
    .line 13
    iget-object v2, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 14
    .line 15
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 16
    .line 17
    const/16 v4, 0x1a

    .line 18
    .line 19
    if-ne v1, v3, :cond_1

    .line 20
    .line 21
    move v3, v1

    .line 22
    :goto_0
    move v1, v4

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    add-int/lit8 v3, v1, 0x1

    .line 25
    .line 26
    aget-char v1, v2, v1

    .line 27
    .line 28
    :goto_1
    const-wide/16 v5, 0x0

    .line 29
    .line 30
    const-wide v7, 0x100003701L

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    const-wide/16 v9, 0x1

    .line 36
    .line 37
    const/16 v11, 0x20

    .line 38
    .line 39
    if-gt v1, v11, :cond_3

    .line 40
    .line 41
    shl-long v12, v9, v1

    .line 42
    .line 43
    and-long/2addr v12, v7

    .line 44
    cmp-long v12, v12, v5

    .line 45
    .line 46
    if-eqz v12, :cond_3

    .line 47
    .line 48
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 49
    .line 50
    if-ne v3, v1, :cond_2

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    add-int/lit8 v1, v3, 0x1

    .line 54
    .line 55
    aget-char v3, v2, v3

    .line 56
    .line 57
    move/from16 v16, v3

    .line 58
    .line 59
    move v3, v1

    .line 60
    move/from16 v1, v16

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_3
    const/16 v12, 0x2c

    .line 64
    .line 65
    const/4 v13, 0x1

    .line 66
    if-ne v1, v12, :cond_6

    .line 67
    .line 68
    iput-boolean v13, v0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 69
    .line 70
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 71
    .line 72
    if-ne v3, v1, :cond_4

    .line 73
    .line 74
    move v1, v3

    .line 75
    move v3, v4

    .line 76
    goto :goto_2

    .line 77
    :cond_4
    add-int/lit8 v1, v3, 0x1

    .line 78
    .line 79
    aget-char v3, v2, v3

    .line 80
    .line 81
    :goto_2
    move/from16 v16, v3

    .line 82
    .line 83
    move v3, v1

    .line 84
    move/from16 v1, v16

    .line 85
    .line 86
    :goto_3
    if-gt v1, v11, :cond_6

    .line 87
    .line 88
    shl-long v14, v9, v1

    .line 89
    .line 90
    and-long/2addr v14, v7

    .line 91
    cmp-long v12, v14, v5

    .line 92
    .line 93
    if-eqz v12, :cond_6

    .line 94
    .line 95
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 96
    .line 97
    if-ne v3, v1, :cond_5

    .line 98
    .line 99
    move v1, v4

    .line 100
    goto :goto_3

    .line 101
    :cond_5
    add-int/lit8 v1, v3, 0x1

    .line 102
    .line 103
    aget-char v3, v2, v3

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_6
    iput-char v1, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 107
    .line 108
    iput v3, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 109
    .line 110
    const/16 v2, 0x2f

    .line 111
    .line 112
    if-ne v1, v2, :cond_7

    .line 113
    .line 114
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->skipComment()V

    .line 115
    .line 116
    .line 117
    :cond_7
    return v13
.end method

.method public nextIfObjectStart()Z
    .locals 9

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 2
    .line 3
    const/16 v1, 0x7b

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    return v0

    .line 9
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 10
    .line 11
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 12
    .line 13
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 14
    .line 15
    const/16 v3, 0x1a

    .line 16
    .line 17
    if-ne v1, v2, :cond_1

    .line 18
    .line 19
    move v2, v1

    .line 20
    :goto_0
    move v1, v3

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    add-int/lit8 v2, v1, 0x1

    .line 23
    .line 24
    aget-char v1, v0, v1

    .line 25
    .line 26
    :goto_1
    const/16 v4, 0x20

    .line 27
    .line 28
    if-gt v1, v4, :cond_3

    .line 29
    .line 30
    const-wide/16 v4, 0x1

    .line 31
    .line 32
    shl-long/2addr v4, v1

    .line 33
    const-wide v6, 0x100003701L

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    and-long/2addr v4, v6

    .line 39
    const-wide/16 v6, 0x0

    .line 40
    .line 41
    cmp-long v4, v4, v6

    .line 42
    .line 43
    if-eqz v4, :cond_3

    .line 44
    .line 45
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 46
    .line 47
    if-ne v2, v1, :cond_2

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    add-int/lit8 v1, v2, 0x1

    .line 51
    .line 52
    aget-char v2, v0, v2

    .line 53
    .line 54
    move v8, v2

    .line 55
    move v2, v1

    .line 56
    move v1, v8

    .line 57
    goto :goto_1

    .line 58
    :cond_3
    iput-char v1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 59
    .line 60
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 61
    .line 62
    const/16 v0, 0x2f

    .line 63
    .line 64
    if-ne v1, v0, :cond_4

    .line 65
    .line 66
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->skipComment()V

    .line 67
    .line 68
    .line 69
    :cond_4
    const/4 v0, 0x1

    .line 70
    return v0
.end method

.method public nextIfSet()Z
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    iget-char v2, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 6
    .line 7
    const/16 v3, 0x53

    .line 8
    .line 9
    if-ne v2, v3, :cond_3

    .line 10
    .line 11
    add-int/lit8 v2, v1, 0x1

    .line 12
    .line 13
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 14
    .line 15
    if-ge v2, v3, :cond_3

    .line 16
    .line 17
    aget-char v4, v0, v1

    .line 18
    .line 19
    const/16 v5, 0x65

    .line 20
    .line 21
    if-ne v4, v5, :cond_3

    .line 22
    .line 23
    aget-char v2, v0, v2

    .line 24
    .line 25
    const/16 v4, 0x74

    .line 26
    .line 27
    if-ne v2, v4, :cond_3

    .line 28
    .line 29
    add-int/lit8 v2, v1, 0x2

    .line 30
    .line 31
    const/16 v4, 0x1a

    .line 32
    .line 33
    if-ne v2, v3, :cond_0

    .line 34
    .line 35
    move v1, v2

    .line 36
    :goto_0
    move v2, v4

    .line 37
    goto :goto_1

    .line 38
    :cond_0
    add-int/lit8 v1, v1, 0x3

    .line 39
    .line 40
    aget-char v2, v0, v2

    .line 41
    .line 42
    :goto_1
    const/16 v3, 0x20

    .line 43
    .line 44
    if-gt v2, v3, :cond_2

    .line 45
    .line 46
    const-wide/16 v5, 0x1

    .line 47
    .line 48
    shl-long/2addr v5, v2

    .line 49
    const-wide v7, 0x100003701L

    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    and-long/2addr v5, v7

    .line 55
    const-wide/16 v7, 0x0

    .line 56
    .line 57
    cmp-long v3, v5, v7

    .line 58
    .line 59
    if-eqz v3, :cond_2

    .line 60
    .line 61
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 62
    .line 63
    if-ne v1, v2, :cond_1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    add-int/lit8 v2, v1, 0x1

    .line 67
    .line 68
    aget-char v1, v0, v1

    .line 69
    .line 70
    move v9, v2

    .line 71
    move v2, v1

    .line 72
    move v1, v9

    .line 73
    goto :goto_1

    .line 74
    :cond_2
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 75
    .line 76
    iput-char v2, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 77
    .line 78
    const/4 v0, 0x1

    .line 79
    return v0

    .line 80
    :cond_3
    const/4 v0, 0x0

    .line 81
    return v0
.end method

.method public final nextIfValue4Match10(J)Z
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0xb

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    add-int/lit8 v3, v1, 0x3

    .line 14
    .line 15
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 16
    .line 17
    .line 18
    move-result-wide v5

    .line 19
    cmp-long p1, v5, p1

    .line 20
    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    return v4

    .line 24
    :cond_1
    aget-char p1, v0, v2

    .line 25
    .line 26
    const/16 p2, 0x2c

    .line 27
    .line 28
    if-eq p1, p2, :cond_2

    .line 29
    .line 30
    const/16 v3, 0x7d

    .line 31
    .line 32
    if-eq p1, v3, :cond_2

    .line 33
    .line 34
    const/16 v3, 0x5d

    .line 35
    .line 36
    if-eq p1, v3, :cond_2

    .line 37
    .line 38
    return v4

    .line 39
    :cond_2
    const/4 v3, 0x1

    .line 40
    if-ne p1, p2, :cond_4

    .line 41
    .line 42
    iput-boolean v3, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 43
    .line 44
    add-int/lit8 v2, v1, 0xc

    .line 45
    .line 46
    iget p1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 47
    .line 48
    if-ne v2, p1, :cond_3

    .line 49
    .line 50
    const/16 p1, 0x1a

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_3
    aget-char p1, v0, v2

    .line 54
    .line 55
    :cond_4
    :goto_0
    const/16 p2, 0x20

    .line 56
    .line 57
    if-gt p1, p2, :cond_5

    .line 58
    .line 59
    const-wide/16 v4, 0x1

    .line 60
    .line 61
    shl-long/2addr v4, p1

    .line 62
    const-wide v6, 0x100003701L

    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    and-long/2addr v4, v6

    .line 68
    const-wide/16 v6, 0x0

    .line 69
    .line 70
    cmp-long p2, v4, v6

    .line 71
    .line 72
    if-eqz p2, :cond_5

    .line 73
    .line 74
    add-int/lit8 v2, v2, 0x1

    .line 75
    .line 76
    aget-char p1, v0, v2

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_5
    add-int/2addr v2, v3

    .line 80
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 81
    .line 82
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 83
    .line 84
    return v3
.end method

.method public final nextIfValue4Match11(J)Z
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0xc

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    add-int/lit8 v3, v1, 0x3

    .line 14
    .line 15
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getLong([CI)J

    .line 16
    .line 17
    .line 18
    move-result-wide v5

    .line 19
    cmp-long p1, v5, p1

    .line 20
    .line 21
    if-nez p1, :cond_6

    .line 22
    .line 23
    add-int/lit8 p1, v1, 0xb

    .line 24
    .line 25
    aget-char p1, v0, p1

    .line 26
    .line 27
    const/16 p2, 0x22

    .line 28
    .line 29
    if-eq p1, p2, :cond_1

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    aget-char p1, v0, v2

    .line 33
    .line 34
    const/16 p2, 0x2c

    .line 35
    .line 36
    if-eq p1, p2, :cond_2

    .line 37
    .line 38
    const/16 v3, 0x7d

    .line 39
    .line 40
    if-eq p1, v3, :cond_2

    .line 41
    .line 42
    const/16 v3, 0x5d

    .line 43
    .line 44
    if-eq p1, v3, :cond_2

    .line 45
    .line 46
    return v4

    .line 47
    :cond_2
    const/4 v3, 0x1

    .line 48
    if-ne p1, p2, :cond_4

    .line 49
    .line 50
    iput-boolean v3, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 51
    .line 52
    add-int/lit8 v2, v1, 0xd

    .line 53
    .line 54
    iget p1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 55
    .line 56
    if-ne v2, p1, :cond_3

    .line 57
    .line 58
    const/16 p1, 0x1a

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    aget-char p1, v0, v2

    .line 62
    .line 63
    :cond_4
    :goto_0
    const/16 p2, 0x20

    .line 64
    .line 65
    if-gt p1, p2, :cond_5

    .line 66
    .line 67
    const-wide/16 v4, 0x1

    .line 68
    .line 69
    shl-long/2addr v4, p1

    .line 70
    const-wide v6, 0x100003701L

    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    and-long/2addr v4, v6

    .line 76
    const-wide/16 v6, 0x0

    .line 77
    .line 78
    cmp-long p2, v4, v6

    .line 79
    .line 80
    if-eqz p2, :cond_5

    .line 81
    .line 82
    add-int/lit8 v2, v2, 0x1

    .line 83
    .line 84
    aget-char p1, v0, v2

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_5
    add-int/2addr v2, v3

    .line 88
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 89
    .line 90
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 91
    .line 92
    return v3

    .line 93
    :cond_6
    :goto_1
    return v4
.end method

.method public final nextIfValue4Match2()Z
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x3

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    aget-char v5, v0, v2

    .line 14
    .line 15
    const/16 v6, 0x2c

    .line 16
    .line 17
    if-eq v5, v6, :cond_1

    .line 18
    .line 19
    const/16 v7, 0x7d

    .line 20
    .line 21
    if-eq v5, v7, :cond_1

    .line 22
    .line 23
    const/16 v7, 0x5d

    .line 24
    .line 25
    if-eq v5, v7, :cond_1

    .line 26
    .line 27
    return v4

    .line 28
    :cond_1
    const/4 v4, 0x1

    .line 29
    if-ne v5, v6, :cond_3

    .line 30
    .line 31
    iput-boolean v4, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 32
    .line 33
    add-int/lit8 v2, v1, 0x4

    .line 34
    .line 35
    if-ne v2, v3, :cond_2

    .line 36
    .line 37
    const/16 v1, 0x1a

    .line 38
    .line 39
    :goto_0
    move v5, v1

    .line 40
    goto :goto_1

    .line 41
    :cond_2
    aget-char v1, v0, v2

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_3
    :goto_1
    const/16 v1, 0x20

    .line 45
    .line 46
    if-gt v5, v1, :cond_4

    .line 47
    .line 48
    const-wide/16 v6, 0x1

    .line 49
    .line 50
    shl-long/2addr v6, v5

    .line 51
    const-wide v8, 0x100003701L

    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    and-long/2addr v6, v8

    .line 57
    const-wide/16 v8, 0x0

    .line 58
    .line 59
    cmp-long v1, v6, v8

    .line 60
    .line 61
    if-eqz v1, :cond_4

    .line 62
    .line 63
    add-int/lit8 v2, v2, 0x1

    .line 64
    .line 65
    aget-char v5, v0, v2

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_4
    add-int/2addr v2, v4

    .line 69
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 70
    .line 71
    iput-char v5, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 72
    .line 73
    return v4
.end method

.method public final nextIfValue4Match3()Z
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x4

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    add-int/lit8 v5, v1, 0x3

    .line 14
    .line 15
    aget-char v5, v0, v5

    .line 16
    .line 17
    const/16 v6, 0x22

    .line 18
    .line 19
    if-eq v5, v6, :cond_1

    .line 20
    .line 21
    return v4

    .line 22
    :cond_1
    aget-char v5, v0, v2

    .line 23
    .line 24
    const/16 v6, 0x2c

    .line 25
    .line 26
    if-eq v5, v6, :cond_2

    .line 27
    .line 28
    const/16 v7, 0x7d

    .line 29
    .line 30
    if-eq v5, v7, :cond_2

    .line 31
    .line 32
    const/16 v7, 0x5d

    .line 33
    .line 34
    if-eq v5, v7, :cond_2

    .line 35
    .line 36
    return v4

    .line 37
    :cond_2
    const/4 v4, 0x1

    .line 38
    if-ne v5, v6, :cond_4

    .line 39
    .line 40
    iput-boolean v4, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 41
    .line 42
    add-int/lit8 v2, v1, 0x5

    .line 43
    .line 44
    if-ne v2, v3, :cond_3

    .line 45
    .line 46
    const/16 v1, 0x1a

    .line 47
    .line 48
    :goto_0
    move v5, v1

    .line 49
    goto :goto_1

    .line 50
    :cond_3
    aget-char v1, v0, v2

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_4
    :goto_1
    const/16 v1, 0x20

    .line 54
    .line 55
    if-gt v5, v1, :cond_5

    .line 56
    .line 57
    const-wide/16 v6, 0x1

    .line 58
    .line 59
    shl-long/2addr v6, v5

    .line 60
    const-wide v8, 0x100003701L

    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    and-long/2addr v6, v8

    .line 66
    const-wide/16 v8, 0x0

    .line 67
    .line 68
    cmp-long v1, v6, v8

    .line 69
    .line 70
    if-eqz v1, :cond_5

    .line 71
    .line 72
    add-int/lit8 v2, v2, 0x1

    .line 73
    .line 74
    aget-char v5, v0, v2

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_5
    add-int/2addr v2, v4

    .line 78
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 79
    .line 80
    iput-char v5, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 81
    .line 82
    return v4
.end method

.method public final nextIfValue4Match4(B)Z
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x5

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    add-int/lit8 v5, v1, 0x3

    .line 14
    .line 15
    aget-char v5, v0, v5

    .line 16
    .line 17
    if-ne v5, p1, :cond_6

    .line 18
    .line 19
    add-int/lit8 p1, v1, 0x4

    .line 20
    .line 21
    aget-char p1, v0, p1

    .line 22
    .line 23
    const/16 v5, 0x22

    .line 24
    .line 25
    if-eq p1, v5, :cond_1

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    aget-char p1, v0, v2

    .line 29
    .line 30
    const/16 v5, 0x2c

    .line 31
    .line 32
    if-eq p1, v5, :cond_2

    .line 33
    .line 34
    const/16 v6, 0x7d

    .line 35
    .line 36
    if-eq p1, v6, :cond_2

    .line 37
    .line 38
    const/16 v6, 0x5d

    .line 39
    .line 40
    if-eq p1, v6, :cond_2

    .line 41
    .line 42
    return v4

    .line 43
    :cond_2
    const/4 v4, 0x1

    .line 44
    if-ne p1, v5, :cond_4

    .line 45
    .line 46
    iput-boolean v4, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 47
    .line 48
    add-int/lit8 v2, v1, 0x6

    .line 49
    .line 50
    if-ne v2, v3, :cond_3

    .line 51
    .line 52
    const/16 p1, 0x1a

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_3
    aget-char p1, v0, v2

    .line 56
    .line 57
    :cond_4
    :goto_0
    const/16 v1, 0x20

    .line 58
    .line 59
    if-gt p1, v1, :cond_5

    .line 60
    .line 61
    const-wide/16 v5, 0x1

    .line 62
    .line 63
    shl-long/2addr v5, p1

    .line 64
    const-wide v7, 0x100003701L

    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    and-long/2addr v5, v7

    .line 70
    const-wide/16 v7, 0x0

    .line 71
    .line 72
    cmp-long v1, v5, v7

    .line 73
    .line 74
    if-eqz v1, :cond_5

    .line 75
    .line 76
    add-int/lit8 v2, v2, 0x1

    .line 77
    .line 78
    aget-char p1, v0, v2

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_5
    add-int/2addr v2, v4

    .line 82
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 83
    .line 84
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 85
    .line 86
    :cond_6
    :goto_1
    return v4
.end method

.method public final nextIfValue4Match5(BB)Z
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x6

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    add-int/lit8 v5, v1, 0x3

    .line 14
    .line 15
    aget-char v5, v0, v5

    .line 16
    .line 17
    if-ne v5, p1, :cond_6

    .line 18
    .line 19
    add-int/lit8 p1, v1, 0x4

    .line 20
    .line 21
    aget-char p1, v0, p1

    .line 22
    .line 23
    if-ne p1, p2, :cond_6

    .line 24
    .line 25
    add-int/lit8 p1, v1, 0x5

    .line 26
    .line 27
    aget-char p1, v0, p1

    .line 28
    .line 29
    const/16 p2, 0x22

    .line 30
    .line 31
    if-eq p1, p2, :cond_1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    aget-char p1, v0, v2

    .line 35
    .line 36
    const/16 p2, 0x2c

    .line 37
    .line 38
    if-eq p1, p2, :cond_2

    .line 39
    .line 40
    const/16 v5, 0x7d

    .line 41
    .line 42
    if-eq p1, v5, :cond_2

    .line 43
    .line 44
    const/16 v5, 0x5d

    .line 45
    .line 46
    if-eq p1, v5, :cond_2

    .line 47
    .line 48
    return v4

    .line 49
    :cond_2
    const/4 v4, 0x1

    .line 50
    if-ne p1, p2, :cond_4

    .line 51
    .line 52
    iput-boolean v4, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 53
    .line 54
    add-int/lit8 v2, v1, 0x7

    .line 55
    .line 56
    if-ne v2, v3, :cond_3

    .line 57
    .line 58
    const/16 p1, 0x1a

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    aget-char p1, v0, v2

    .line 62
    .line 63
    :cond_4
    :goto_0
    const/16 p2, 0x20

    .line 64
    .line 65
    if-gt p1, p2, :cond_5

    .line 66
    .line 67
    const-wide/16 v5, 0x1

    .line 68
    .line 69
    shl-long/2addr v5, p1

    .line 70
    const-wide v7, 0x100003701L

    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    and-long/2addr v5, v7

    .line 76
    const-wide/16 v7, 0x0

    .line 77
    .line 78
    cmp-long p2, v5, v7

    .line 79
    .line 80
    if-eqz p2, :cond_5

    .line 81
    .line 82
    add-int/lit8 v2, v2, 0x1

    .line 83
    .line 84
    aget-char p1, v0, v2

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_5
    add-int/2addr v2, v4

    .line 88
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 89
    .line 90
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 91
    .line 92
    :cond_6
    :goto_1
    return v4
.end method

.method public final nextIfValue4Match6(I)Z
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x7

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    add-int/lit8 v3, v1, 0x3

    .line 14
    .line 15
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getInt([CI)I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-eq v3, p1, :cond_1

    .line 20
    .line 21
    return v4

    .line 22
    :cond_1
    aget-char p1, v0, v2

    .line 23
    .line 24
    const/16 v3, 0x2c

    .line 25
    .line 26
    if-eq p1, v3, :cond_2

    .line 27
    .line 28
    const/16 v5, 0x7d

    .line 29
    .line 30
    if-eq p1, v5, :cond_2

    .line 31
    .line 32
    const/16 v5, 0x5d

    .line 33
    .line 34
    if-eq p1, v5, :cond_2

    .line 35
    .line 36
    return v4

    .line 37
    :cond_2
    const/4 v4, 0x1

    .line 38
    if-ne p1, v3, :cond_4

    .line 39
    .line 40
    iput-boolean v4, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 41
    .line 42
    add-int/lit8 v2, v1, 0x8

    .line 43
    .line 44
    iget p1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 45
    .line 46
    if-ne v2, p1, :cond_3

    .line 47
    .line 48
    const/16 p1, 0x1a

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_3
    aget-char p1, v0, v2

    .line 52
    .line 53
    :cond_4
    :goto_0
    const/16 v1, 0x20

    .line 54
    .line 55
    if-gt p1, v1, :cond_5

    .line 56
    .line 57
    const-wide/16 v5, 0x1

    .line 58
    .line 59
    shl-long/2addr v5, p1

    .line 60
    const-wide v7, 0x100003701L

    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    and-long/2addr v5, v7

    .line 66
    const-wide/16 v7, 0x0

    .line 67
    .line 68
    cmp-long v1, v5, v7

    .line 69
    .line 70
    if-eqz v1, :cond_5

    .line 71
    .line 72
    add-int/lit8 v2, v2, 0x1

    .line 73
    .line 74
    aget-char p1, v0, v2

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_5
    add-int/2addr v2, v4

    .line 78
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 79
    .line 80
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 81
    .line 82
    return v4
.end method

.method public final nextIfValue4Match7(I)Z
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x8

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    add-int/lit8 v3, v1, 0x3

    .line 14
    .line 15
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getInt([CI)I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-ne v3, p1, :cond_6

    .line 20
    .line 21
    add-int/lit8 p1, v1, 0x7

    .line 22
    .line 23
    aget-char p1, v0, p1

    .line 24
    .line 25
    const/16 v3, 0x22

    .line 26
    .line 27
    if-eq p1, v3, :cond_1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    aget-char p1, v0, v2

    .line 31
    .line 32
    const/16 v3, 0x2c

    .line 33
    .line 34
    if-eq p1, v3, :cond_2

    .line 35
    .line 36
    const/16 v5, 0x7d

    .line 37
    .line 38
    if-eq p1, v5, :cond_2

    .line 39
    .line 40
    const/16 v5, 0x5d

    .line 41
    .line 42
    if-eq p1, v5, :cond_2

    .line 43
    .line 44
    return v4

    .line 45
    :cond_2
    const/4 v4, 0x1

    .line 46
    if-ne p1, v3, :cond_4

    .line 47
    .line 48
    iput-boolean v4, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 49
    .line 50
    add-int/lit8 v2, v1, 0x9

    .line 51
    .line 52
    iget p1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 53
    .line 54
    if-ne v2, p1, :cond_3

    .line 55
    .line 56
    const/16 p1, 0x1a

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_3
    aget-char p1, v0, v2

    .line 60
    .line 61
    :cond_4
    :goto_0
    const/16 v1, 0x20

    .line 62
    .line 63
    if-gt p1, v1, :cond_5

    .line 64
    .line 65
    const-wide/16 v5, 0x1

    .line 66
    .line 67
    shl-long/2addr v5, p1

    .line 68
    const-wide v7, 0x100003701L

    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    and-long/2addr v5, v7

    .line 74
    const-wide/16 v7, 0x0

    .line 75
    .line 76
    cmp-long v1, v5, v7

    .line 77
    .line 78
    if-eqz v1, :cond_5

    .line 79
    .line 80
    add-int/lit8 v2, v2, 0x1

    .line 81
    .line 82
    aget-char p1, v0, v2

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_5
    add-int/2addr v2, v4

    .line 86
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 87
    .line 88
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 89
    .line 90
    :cond_6
    :goto_1
    return v4
.end method

.method public final nextIfValue4Match8(IB)Z
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x9

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    add-int/lit8 v3, v1, 0x3

    .line 14
    .line 15
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getInt([CI)I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-ne v3, p1, :cond_6

    .line 20
    .line 21
    add-int/lit8 p1, v1, 0x7

    .line 22
    .line 23
    aget-char p1, v0, p1

    .line 24
    .line 25
    if-ne p1, p2, :cond_6

    .line 26
    .line 27
    add-int/lit8 p1, v1, 0x8

    .line 28
    .line 29
    aget-char p1, v0, p1

    .line 30
    .line 31
    const/16 p2, 0x22

    .line 32
    .line 33
    if-eq p1, p2, :cond_1

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    aget-char p1, v0, v2

    .line 37
    .line 38
    const/16 p2, 0x2c

    .line 39
    .line 40
    if-eq p1, p2, :cond_2

    .line 41
    .line 42
    const/16 v3, 0x7d

    .line 43
    .line 44
    if-eq p1, v3, :cond_2

    .line 45
    .line 46
    const/16 v3, 0x5d

    .line 47
    .line 48
    if-eq p1, v3, :cond_2

    .line 49
    .line 50
    return v4

    .line 51
    :cond_2
    const/4 v3, 0x1

    .line 52
    if-ne p1, p2, :cond_4

    .line 53
    .line 54
    iput-boolean v3, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 55
    .line 56
    add-int/lit8 v2, v1, 0xa

    .line 57
    .line 58
    iget p1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 59
    .line 60
    if-ne v2, p1, :cond_3

    .line 61
    .line 62
    const/16 p1, 0x1a

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_3
    aget-char p1, v0, v2

    .line 66
    .line 67
    :cond_4
    :goto_0
    const/16 p2, 0x20

    .line 68
    .line 69
    if-gt p1, p2, :cond_5

    .line 70
    .line 71
    const-wide/16 v4, 0x1

    .line 72
    .line 73
    shl-long/2addr v4, p1

    .line 74
    const-wide v6, 0x100003701L

    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    and-long/2addr v4, v6

    .line 80
    const-wide/16 v6, 0x0

    .line 81
    .line 82
    cmp-long p2, v4, v6

    .line 83
    .line 84
    if-eqz p2, :cond_5

    .line 85
    .line 86
    add-int/lit8 v2, v2, 0x1

    .line 87
    .line 88
    aget-char p1, v0, v2

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_5
    add-int/2addr v2, v3

    .line 92
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 93
    .line 94
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 95
    .line 96
    return v3

    .line 97
    :cond_6
    :goto_1
    return v4
.end method

.method public final nextIfValue4Match9(IBB)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0xa

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    add-int/lit8 v3, v1, 0x3

    .line 14
    .line 15
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getInt([CI)I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-ne v3, p1, :cond_6

    .line 20
    .line 21
    add-int/lit8 p1, v1, 0x7

    .line 22
    .line 23
    aget-char p1, v0, p1

    .line 24
    .line 25
    if-ne p1, p2, :cond_6

    .line 26
    .line 27
    add-int/lit8 p1, v1, 0x8

    .line 28
    .line 29
    aget-char p1, v0, p1

    .line 30
    .line 31
    if-ne p1, p3, :cond_6

    .line 32
    .line 33
    add-int/lit8 p1, v1, 0x9

    .line 34
    .line 35
    aget-char p1, v0, p1

    .line 36
    .line 37
    const/16 p2, 0x22

    .line 38
    .line 39
    if-eq p1, p2, :cond_1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    aget-char p1, v0, v2

    .line 43
    .line 44
    const/16 p2, 0x2c

    .line 45
    .line 46
    if-eq p1, p2, :cond_2

    .line 47
    .line 48
    const/16 p3, 0x7d

    .line 49
    .line 50
    if-eq p1, p3, :cond_2

    .line 51
    .line 52
    const/16 p3, 0x5d

    .line 53
    .line 54
    if-eq p1, p3, :cond_2

    .line 55
    .line 56
    return v4

    .line 57
    :cond_2
    const/4 p3, 0x1

    .line 58
    if-ne p1, p2, :cond_4

    .line 59
    .line 60
    iput-boolean p3, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 61
    .line 62
    add-int/lit8 v2, v1, 0xb

    .line 63
    .line 64
    iget p1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 65
    .line 66
    if-ne v2, p1, :cond_3

    .line 67
    .line 68
    const/16 p1, 0x1a

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_3
    aget-char p1, v0, v2

    .line 72
    .line 73
    :cond_4
    :goto_0
    const/16 p2, 0x20

    .line 74
    .line 75
    if-gt p1, p2, :cond_5

    .line 76
    .line 77
    const-wide/16 v3, 0x1

    .line 78
    .line 79
    shl-long/2addr v3, p1

    .line 80
    const-wide v5, 0x100003701L

    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    and-long/2addr v3, v5

    .line 86
    const-wide/16 v5, 0x0

    .line 87
    .line 88
    cmp-long p2, v3, v5

    .line 89
    .line 90
    if-eqz p2, :cond_5

    .line 91
    .line 92
    add-int/lit8 v2, v2, 0x1

    .line 93
    .line 94
    aget-char p1, v0, v2

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_5
    add-int/2addr v2, p3

    .line 98
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 99
    .line 100
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 101
    .line 102
    return p3

    .line 103
    :cond_6
    :goto_1
    return v4
.end method

.method public final nextWithoutComment()V
    .locals 9

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 4
    .line 5
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 6
    .line 7
    const/16 v3, 0x1a

    .line 8
    .line 9
    if-lt v0, v2, :cond_0

    .line 10
    .line 11
    move v2, v0

    .line 12
    :goto_0
    move v0, v3

    .line 13
    goto :goto_1

    .line 14
    :cond_0
    add-int/lit8 v2, v0, 0x1

    .line 15
    .line 16
    aget-char v0, v1, v0

    .line 17
    .line 18
    :goto_1
    const/16 v4, 0x20

    .line 19
    .line 20
    if-gt v0, v4, :cond_2

    .line 21
    .line 22
    const-wide/16 v4, 0x1

    .line 23
    .line 24
    shl-long/2addr v4, v0

    .line 25
    const-wide v6, 0x100003701L

    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    and-long/2addr v4, v6

    .line 31
    const-wide/16 v6, 0x0

    .line 32
    .line 33
    cmp-long v4, v4, v6

    .line 34
    .line 35
    if-eqz v4, :cond_2

    .line 36
    .line 37
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 38
    .line 39
    if-ne v2, v0, :cond_1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    add-int/lit8 v0, v2, 0x1

    .line 43
    .line 44
    aget-char v2, v1, v2

    .line 45
    .line 46
    move v8, v2

    .line 47
    move v2, v0

    .line 48
    move v0, v8

    .line 49
    goto :goto_1

    .line 50
    :cond_2
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 51
    .line 52
    iput-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 53
    .line 54
    return-void
.end method

.method public readBigDecimal()Ljava/math/BigDecimal;
    .locals 28

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 4
    .line 5
    iget-char v2, v1, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 6
    .line 7
    iget v3, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 8
    .line 9
    const/16 v4, 0x22

    .line 10
    .line 11
    const/4 v5, 0x2

    .line 12
    const/4 v7, 0x0

    .line 13
    const/4 v8, 0x0

    .line 14
    if-eq v2, v4, :cond_1

    .line 15
    .line 16
    const/16 v4, 0x27

    .line 17
    .line 18
    if-ne v2, v4, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v4, v3

    .line 22
    move v3, v7

    .line 23
    goto :goto_2

    .line 24
    :cond_1
    :goto_0
    add-int/lit8 v4, v3, 0x1

    .line 25
    .line 26
    aget-char v9, v0, v3

    .line 27
    .line 28
    if-ne v9, v2, :cond_3

    .line 29
    .line 30
    iget v2, v1, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 31
    .line 32
    if-ne v4, v2, :cond_2

    .line 33
    .line 34
    const/16 v6, 0x1a

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_2
    add-int/2addr v3, v5

    .line 38
    aget-char v6, v0, v4

    .line 39
    .line 40
    move v4, v3

    .line 41
    :goto_1
    iput-char v6, v1, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 42
    .line 43
    iput v4, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 44
    .line 45
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->nextIfComma()Z

    .line 46
    .line 47
    .line 48
    return-object v8

    .line 49
    :cond_3
    move v3, v2

    .line 50
    move v2, v9

    .line 51
    :goto_2
    const/16 v9, 0x2b

    .line 52
    .line 53
    const/16 v10, 0x2d

    .line 54
    .line 55
    const/4 v11, 0x1

    .line 56
    if-ne v2, v10, :cond_4

    .line 57
    .line 58
    iput-boolean v11, v1, Lcom/alibaba/fastjson2/JSONReader;->negative:Z

    .line 59
    .line 60
    add-int/lit8 v2, v4, 0x1

    .line 61
    .line 62
    aget-char v12, v0, v4

    .line 63
    .line 64
    :goto_3
    move/from16 v27, v12

    .line 65
    .line 66
    move v12, v2

    .line 67
    move/from16 v2, v27

    .line 68
    .line 69
    goto :goto_4

    .line 70
    :cond_4
    iput-boolean v7, v1, Lcom/alibaba/fastjson2/JSONReader;->negative:Z

    .line 71
    .line 72
    if-ne v2, v9, :cond_5

    .line 73
    .line 74
    add-int/lit8 v2, v4, 0x1

    .line 75
    .line 76
    aget-char v12, v0, v4

    .line 77
    .line 78
    goto :goto_3

    .line 79
    :cond_5
    move v12, v4

    .line 80
    :goto_4
    iput-byte v11, v1, Lcom/alibaba/fastjson2/JSONReader;->valueType:B

    .line 81
    .line 82
    const-wide/16 v13, 0x0

    .line 83
    .line 84
    move v15, v7

    .line 85
    move/from16 v18, v15

    .line 86
    .line 87
    move-wide/from16 v16, v13

    .line 88
    .line 89
    :goto_5
    const/16 v19, 0x1f

    .line 90
    .line 91
    const/16 v6, 0x39

    .line 92
    .line 93
    const-wide/16 v20, 0xa

    .line 94
    .line 95
    move-object/from16 v22, v8

    .line 96
    .line 97
    const/16 v8, 0x30

    .line 98
    .line 99
    if-lt v2, v8, :cond_a

    .line 100
    .line 101
    if-gt v2, v6, :cond_a

    .line 102
    .line 103
    if-nez v15, :cond_7

    .line 104
    .line 105
    mul-long v23, v16, v20

    .line 106
    .line 107
    or-long v25, v16, v20

    .line 108
    .line 109
    ushr-long v25, v25, v19

    .line 110
    .line 111
    cmp-long v18, v25, v13

    .line 112
    .line 113
    if-eqz v18, :cond_8

    .line 114
    .line 115
    div-long v25, v23, v20

    .line 116
    .line 117
    cmp-long v18, v25, v16

    .line 118
    .line 119
    if-nez v18, :cond_6

    .line 120
    .line 121
    goto :goto_6

    .line 122
    :cond_6
    move v15, v11

    .line 123
    :cond_7
    move-wide/from16 v25, v13

    .line 124
    .line 125
    goto :goto_7

    .line 126
    :cond_8
    :goto_6
    add-int/lit8 v2, v2, -0x30

    .line 127
    .line 128
    move-wide/from16 v25, v13

    .line 129
    .line 130
    int-to-long v13, v2

    .line 131
    add-long v16, v23, v13

    .line 132
    .line 133
    :goto_7
    iget v2, v1, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 134
    .line 135
    if-ne v12, v2, :cond_9

    .line 136
    .line 137
    add-int/lit8 v12, v12, 0x1

    .line 138
    .line 139
    move/from16 v18, v11

    .line 140
    .line 141
    const/16 v2, 0x1a

    .line 142
    .line 143
    goto :goto_8

    .line 144
    :cond_9
    add-int/lit8 v2, v12, 0x1

    .line 145
    .line 146
    aget-char v6, v0, v12

    .line 147
    .line 148
    move v12, v2

    .line 149
    move v2, v6

    .line 150
    move/from16 v18, v11

    .line 151
    .line 152
    move-object/from16 v8, v22

    .line 153
    .line 154
    move-wide/from16 v13, v25

    .line 155
    .line 156
    goto :goto_5

    .line 157
    :cond_a
    move-wide/from16 v25, v13

    .line 158
    .line 159
    :goto_8
    cmp-long v13, v16, v25

    .line 160
    .line 161
    if-gez v13, :cond_b

    .line 162
    .line 163
    move v15, v11

    .line 164
    :cond_b
    iput-short v7, v1, Lcom/alibaba/fastjson2/JSONReader;->scale:S

    .line 165
    .line 166
    const/16 v13, 0x2e

    .line 167
    .line 168
    if-ne v2, v13, :cond_10

    .line 169
    .line 170
    iput-byte v5, v1, Lcom/alibaba/fastjson2/JSONReader;->valueType:B

    .line 171
    .line 172
    add-int/lit8 v2, v12, 0x1

    .line 173
    .line 174
    aget-char v12, v0, v12

    .line 175
    .line 176
    move/from16 v27, v12

    .line 177
    .line 178
    move v12, v2

    .line 179
    move/from16 v2, v27

    .line 180
    .line 181
    :goto_9
    if-lt v2, v8, :cond_10

    .line 182
    .line 183
    if-gt v2, v6, :cond_10

    .line 184
    .line 185
    iget-short v13, v1, Lcom/alibaba/fastjson2/JSONReader;->scale:S

    .line 186
    .line 187
    add-int/2addr v13, v11

    .line 188
    int-to-short v13, v13

    .line 189
    iput-short v13, v1, Lcom/alibaba/fastjson2/JSONReader;->scale:S

    .line 190
    .line 191
    if-nez v15, :cond_e

    .line 192
    .line 193
    mul-long v13, v16, v20

    .line 194
    .line 195
    or-long v23, v16, v20

    .line 196
    .line 197
    ushr-long v23, v23, v19

    .line 198
    .line 199
    cmp-long v18, v23, v25

    .line 200
    .line 201
    if-eqz v18, :cond_d

    .line 202
    .line 203
    div-long v23, v13, v20

    .line 204
    .line 205
    cmp-long v18, v23, v16

    .line 206
    .line 207
    if-nez v18, :cond_c

    .line 208
    .line 209
    goto :goto_a

    .line 210
    :cond_c
    move v15, v11

    .line 211
    goto :goto_b

    .line 212
    :cond_d
    :goto_a
    add-int/lit8 v2, v2, -0x30

    .line 213
    .line 214
    int-to-long v5, v2

    .line 215
    add-long/2addr v13, v5

    .line 216
    move-wide/from16 v16, v13

    .line 217
    .line 218
    :cond_e
    :goto_b
    iget v2, v1, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 219
    .line 220
    if-ne v12, v2, :cond_f

    .line 221
    .line 222
    add-int/lit8 v12, v12, 0x1

    .line 223
    .line 224
    move/from16 v18, v11

    .line 225
    .line 226
    move-wide/from16 v5, v16

    .line 227
    .line 228
    const/16 v2, 0x1a

    .line 229
    .line 230
    goto :goto_c

    .line 231
    :cond_f
    add-int/lit8 v2, v12, 0x1

    .line 232
    .line 233
    aget-char v5, v0, v12

    .line 234
    .line 235
    move v12, v2

    .line 236
    move v2, v5

    .line 237
    move/from16 v18, v11

    .line 238
    .line 239
    const/4 v5, 0x2

    .line 240
    const/16 v6, 0x39

    .line 241
    .line 242
    goto :goto_9

    .line 243
    :cond_10
    move-wide/from16 v5, v16

    .line 244
    .line 245
    :goto_c
    const/16 v13, 0x65

    .line 246
    .line 247
    if-eq v2, v13, :cond_12

    .line 248
    .line 249
    const/16 v14, 0x45

    .line 250
    .line 251
    if-ne v2, v14, :cond_11

    .line 252
    .line 253
    goto :goto_d

    .line 254
    :cond_11
    move v9, v7

    .line 255
    goto :goto_12

    .line 256
    :cond_12
    :goto_d
    add-int/lit8 v2, v12, 0x1

    .line 257
    .line 258
    aget-char v14, v0, v12

    .line 259
    .line 260
    if-ne v14, v10, :cond_13

    .line 261
    .line 262
    move v10, v11

    .line 263
    goto :goto_e

    .line 264
    :cond_13
    move v10, v7

    .line 265
    :goto_e
    if-nez v10, :cond_15

    .line 266
    .line 267
    if-ne v14, v9, :cond_14

    .line 268
    .line 269
    goto :goto_f

    .line 270
    :cond_14
    move v9, v7

    .line 271
    goto :goto_10

    .line 272
    :cond_15
    :goto_f
    add-int/lit8 v12, v12, 0x2

    .line 273
    .line 274
    aget-char v14, v0, v2

    .line 275
    .line 276
    move v9, v7

    .line 277
    move v2, v12

    .line 278
    :goto_10
    if-lt v14, v8, :cond_18

    .line 279
    .line 280
    const/16 v12, 0x39

    .line 281
    .line 282
    if-gt v14, v12, :cond_18

    .line 283
    .line 284
    add-int/lit8 v14, v14, -0x30

    .line 285
    .line 286
    mul-int/lit8 v9, v9, 0xa

    .line 287
    .line 288
    add-int/2addr v9, v14

    .line 289
    const/16 v14, 0x7ff

    .line 290
    .line 291
    if-gt v9, v14, :cond_17

    .line 292
    .line 293
    iget v14, v1, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 294
    .line 295
    if-ne v2, v14, :cond_16

    .line 296
    .line 297
    add-int/lit8 v2, v2, 0x1

    .line 298
    .line 299
    move v12, v2

    .line 300
    move/from16 v18, v11

    .line 301
    .line 302
    const/16 v2, 0x1a

    .line 303
    .line 304
    goto :goto_11

    .line 305
    :cond_16
    add-int/lit8 v14, v2, 0x1

    .line 306
    .line 307
    aget-char v2, v0, v2

    .line 308
    .line 309
    move/from16 v18, v14

    .line 310
    .line 311
    move v14, v2

    .line 312
    move/from16 v2, v18

    .line 313
    .line 314
    move/from16 v18, v11

    .line 315
    .line 316
    goto :goto_10

    .line 317
    :cond_17
    const-string v0, "too large exp value : "

    .line 318
    .line 319
    invoke-static {v9, v0}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    const/4 v0, 0x0

    .line 327
    return-object v0

    .line 328
    :cond_18
    move v12, v2

    .line 329
    move v2, v14

    .line 330
    :goto_11
    if-eqz v10, :cond_19

    .line 331
    .line 332
    neg-int v9, v9

    .line 333
    :cond_19
    int-to-short v8, v9

    .line 334
    iput-short v8, v1, Lcom/alibaba/fastjson2/JSONReader;->exponent:S

    .line 335
    .line 336
    const/4 v8, 0x2

    .line 337
    iput-byte v8, v1, Lcom/alibaba/fastjson2/JSONReader;->valueType:B

    .line 338
    .line 339
    :goto_12
    if-ne v12, v4, :cond_26

    .line 340
    .line 341
    const/16 v8, 0x6e

    .line 342
    .line 343
    const/16 v10, 0x75

    .line 344
    .line 345
    const/16 v14, 0x6c

    .line 346
    .line 347
    if-ne v2, v8, :cond_1e

    .line 348
    .line 349
    add-int/lit8 v8, v12, 0x1

    .line 350
    .line 351
    aget-char v7, v0, v12

    .line 352
    .line 353
    if-ne v7, v10, :cond_1c

    .line 354
    .line 355
    add-int/lit8 v7, v12, 0x2

    .line 356
    .line 357
    aget-char v8, v0, v8

    .line 358
    .line 359
    if-ne v8, v14, :cond_1d

    .line 360
    .line 361
    add-int/lit8 v8, v12, 0x3

    .line 362
    .line 363
    aget-char v7, v0, v7

    .line 364
    .line 365
    if-ne v7, v14, :cond_1c

    .line 366
    .line 367
    iget-object v2, v1, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 368
    .line 369
    iget-wide v13, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 370
    .line 371
    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->ErrorOnNullForPrimitives:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 372
    .line 373
    move/from16 v19, v12

    .line 374
    .line 375
    iget-wide v11, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 376
    .line 377
    and-long v10, v13, v11

    .line 378
    .line 379
    cmp-long v2, v10, v25

    .line 380
    .line 381
    if-nez v2, :cond_1b

    .line 382
    .line 383
    const/4 v2, 0x1

    .line 384
    iput-boolean v2, v1, Lcom/alibaba/fastjson2/JSONReader;->wasNull:Z

    .line 385
    .line 386
    iget v2, v1, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 387
    .line 388
    if-ne v8, v2, :cond_1a

    .line 389
    .line 390
    const/16 v2, 0x1a

    .line 391
    .line 392
    goto :goto_13

    .line 393
    :cond_1a
    aget-char v2, v0, v8

    .line 394
    .line 395
    :goto_13
    add-int/lit8 v12, v19, 0x4

    .line 396
    .line 397
    :goto_14
    const/4 v7, 0x0

    .line 398
    const/4 v8, 0x1

    .line 399
    const/16 v18, 0x1

    .line 400
    .line 401
    goto/16 :goto_1a

    .line 402
    .line 403
    :cond_1b
    const-string v0, "long value not support input null"

    .line 404
    .line 405
    invoke-virtual {v1, v0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object v0

    .line 409
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 410
    .line 411
    .line 412
    const/4 v0, 0x0

    .line 413
    return-object v0

    .line 414
    :cond_1c
    move v12, v8

    .line 415
    goto :goto_15

    .line 416
    :cond_1d
    move v12, v7

    .line 417
    goto :goto_15

    .line 418
    :cond_1e
    move/from16 v19, v12

    .line 419
    .line 420
    :goto_15
    const/16 v7, 0x74

    .line 421
    .line 422
    if-ne v2, v7, :cond_20

    .line 423
    .line 424
    add-int/lit8 v7, v12, 0x3

    .line 425
    .line 426
    iget v8, v1, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 427
    .line 428
    if-gt v7, v8, :cond_20

    .line 429
    .line 430
    aget-char v11, v0, v12

    .line 431
    .line 432
    const/16 v14, 0x72

    .line 433
    .line 434
    if-ne v11, v14, :cond_20

    .line 435
    .line 436
    add-int/lit8 v11, v12, 0x1

    .line 437
    .line 438
    aget-char v11, v0, v11

    .line 439
    .line 440
    if-ne v11, v10, :cond_20

    .line 441
    .line 442
    add-int/lit8 v10, v12, 0x2

    .line 443
    .line 444
    aget-char v10, v0, v10

    .line 445
    .line 446
    if-ne v10, v13, :cond_20

    .line 447
    .line 448
    sget-object v2, Ljava/math/BigDecimal;->ONE:Ljava/math/BigDecimal;

    .line 449
    .line 450
    if-ne v7, v8, :cond_1f

    .line 451
    .line 452
    const/16 v7, 0x1a

    .line 453
    .line 454
    goto :goto_16

    .line 455
    :cond_1f
    aget-char v7, v0, v7

    .line 456
    .line 457
    :goto_16
    add-int/lit8 v12, v12, 0x4

    .line 458
    .line 459
    :goto_17
    move-object/from16 v22, v2

    .line 460
    .line 461
    move v2, v7

    .line 462
    goto :goto_14

    .line 463
    :cond_20
    const/16 v7, 0x66

    .line 464
    .line 465
    if-ne v2, v7, :cond_22

    .line 466
    .line 467
    add-int/lit8 v7, v12, 0x4

    .line 468
    .line 469
    iget v8, v1, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 470
    .line 471
    if-gt v7, v8, :cond_22

    .line 472
    .line 473
    aget-char v10, v0, v12

    .line 474
    .line 475
    const/16 v11, 0x61

    .line 476
    .line 477
    if-ne v10, v11, :cond_22

    .line 478
    .line 479
    add-int/lit8 v10, v12, 0x1

    .line 480
    .line 481
    aget-char v10, v0, v10

    .line 482
    .line 483
    const/16 v11, 0x6c

    .line 484
    .line 485
    if-ne v10, v11, :cond_22

    .line 486
    .line 487
    add-int/lit8 v10, v12, 0x2

    .line 488
    .line 489
    aget-char v10, v0, v10

    .line 490
    .line 491
    const/16 v11, 0x73

    .line 492
    .line 493
    if-ne v10, v11, :cond_22

    .line 494
    .line 495
    add-int/lit8 v10, v12, 0x3

    .line 496
    .line 497
    aget-char v10, v0, v10

    .line 498
    .line 499
    if-ne v10, v13, :cond_22

    .line 500
    .line 501
    sget-object v2, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 502
    .line 503
    if-ne v7, v8, :cond_21

    .line 504
    .line 505
    const/16 v7, 0x1a

    .line 506
    .line 507
    goto :goto_18

    .line 508
    :cond_21
    aget-char v7, v0, v7

    .line 509
    .line 510
    :goto_18
    add-int/lit8 v12, v12, 0x5

    .line 511
    .line 512
    goto :goto_17

    .line 513
    :cond_22
    const/16 v7, 0x7b

    .line 514
    .line 515
    if-ne v2, v7, :cond_23

    .line 516
    .line 517
    if-nez v3, :cond_23

    .line 518
    .line 519
    new-instance v0, Lcom/alibaba/fastjson2/JSONObject;

    .line 520
    .line 521
    invoke-direct {v0}, Lcom/alibaba/fastjson2/JSONObject;-><init>()V

    .line 522
    .line 523
    .line 524
    move-wide/from16 v2, v25

    .line 525
    .line 526
    invoke-virtual {v1, v0, v2, v3}, Lcom/alibaba/fastjson2/JSONReader;->readObject(Ljava/lang/Object;J)V

    .line 527
    .line 528
    .line 529
    const/4 v7, 0x0

    .line 530
    iput-boolean v7, v1, Lcom/alibaba/fastjson2/JSONReader;->wasNull:Z

    .line 531
    .line 532
    invoke-virtual {v1, v0}, Lcom/alibaba/fastjson2/JSONReader;->decimal(Lcom/alibaba/fastjson2/JSONObject;)Ljava/math/BigDecimal;

    .line 533
    .line 534
    .line 535
    move-result-object v0

    .line 536
    return-object v0

    .line 537
    :cond_23
    const/4 v7, 0x0

    .line 538
    const/16 v8, 0x5b

    .line 539
    .line 540
    if-ne v2, v8, :cond_25

    .line 541
    .line 542
    if-nez v3, :cond_25

    .line 543
    .line 544
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->readArray()Ljava/util/List;

    .line 545
    .line 546
    .line 547
    move-result-object v0

    .line 548
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 549
    .line 550
    .line 551
    move-result v0

    .line 552
    if-eqz v0, :cond_24

    .line 553
    .line 554
    const/4 v2, 0x1

    .line 555
    iput-boolean v2, v1, Lcom/alibaba/fastjson2/JSONReader;->wasNull:Z

    .line 556
    .line 557
    return-object v22

    .line 558
    :cond_24
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->info()Ljava/lang/String;

    .line 559
    .line 560
    .line 561
    move-result-object v0

    .line 562
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 563
    .line 564
    .line 565
    const/4 v0, 0x0

    .line 566
    return-object v0

    .line 567
    :cond_25
    :goto_19
    move v8, v7

    .line 568
    goto :goto_1a

    .line 569
    :cond_26
    move/from16 v19, v12

    .line 570
    .line 571
    goto :goto_19

    .line 572
    :goto_1a
    sub-int v10, v12, v4

    .line 573
    .line 574
    if-eqz v3, :cond_29

    .line 575
    .line 576
    if-eq v2, v3, :cond_27

    .line 577
    .line 578
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->readString()Ljava/lang/String;

    .line 579
    .line 580
    .line 581
    move-result-object v0

    .line 582
    :try_start_0
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/TypeUtils;->toBigDecimal(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 583
    .line 584
    .line 585
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 586
    return-object v0

    .line 587
    :catch_0
    move-exception v0

    .line 588
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 589
    .line 590
    .line 591
    move-result-object v2

    .line 592
    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 593
    .line 594
    .line 595
    move-result-object v2

    .line 596
    invoke-static {v2, v0}, Lah/a;->x(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 597
    .line 598
    .line 599
    const/4 v0, 0x0

    .line 600
    return-object v0

    .line 601
    :cond_27
    iget v2, v1, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 602
    .line 603
    if-lt v12, v2, :cond_28

    .line 604
    .line 605
    const/16 v2, 0x1a

    .line 606
    .line 607
    goto :goto_1b

    .line 608
    :cond_28
    add-int/lit8 v2, v12, 0x1

    .line 609
    .line 610
    aget-char v3, v0, v12

    .line 611
    .line 612
    move v12, v2

    .line 613
    move v2, v3

    .line 614
    :cond_29
    :goto_1b
    if-nez v8, :cond_2f

    .line 615
    .line 616
    if-nez v9, :cond_2b

    .line 617
    .line 618
    if-nez v15, :cond_2b

    .line 619
    .line 620
    const-wide/16 v25, 0x0

    .line 621
    .line 622
    cmp-long v3, v5, v25

    .line 623
    .line 624
    if-eqz v3, :cond_2b

    .line 625
    .line 626
    iget-boolean v3, v1, Lcom/alibaba/fastjson2/JSONReader;->negative:Z

    .line 627
    .line 628
    if-eqz v3, :cond_2a

    .line 629
    .line 630
    neg-long v5, v5

    .line 631
    :cond_2a
    iget-short v3, v1, Lcom/alibaba/fastjson2/JSONReader;->scale:S

    .line 632
    .line 633
    invoke-static {v5, v6, v3}, Ljava/math/BigDecimal;->valueOf(JI)Ljava/math/BigDecimal;

    .line 634
    .line 635
    .line 636
    move-result-object v22

    .line 637
    const/4 v8, 0x1

    .line 638
    :cond_2b
    const/16 v17, 0x1

    .line 639
    .line 640
    if-nez v8, :cond_2c

    .line 641
    .line 642
    add-int/lit8 v4, v4, -0x1

    .line 643
    .line 644
    invoke-static {v0, v4, v10}, Lcom/alibaba/fastjson2/util/TypeUtils;->parseBigDecimal([CII)Ljava/math/BigDecimal;

    .line 645
    .line 646
    .line 647
    move-result-object v3

    .line 648
    move-object/from16 v22, v3

    .line 649
    .line 650
    :cond_2c
    const/16 v3, 0x4c

    .line 651
    .line 652
    if-eq v2, v3, :cond_2d

    .line 653
    .line 654
    const/16 v3, 0x46

    .line 655
    .line 656
    if-eq v2, v3, :cond_2d

    .line 657
    .line 658
    const/16 v3, 0x44

    .line 659
    .line 660
    if-eq v2, v3, :cond_2d

    .line 661
    .line 662
    const/16 v3, 0x42

    .line 663
    .line 664
    if-eq v2, v3, :cond_2d

    .line 665
    .line 666
    const/16 v3, 0x53

    .line 667
    .line 668
    if-ne v2, v3, :cond_30

    .line 669
    .line 670
    :cond_2d
    iget v2, v1, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 671
    .line 672
    if-lt v12, v2, :cond_2e

    .line 673
    .line 674
    :goto_1c
    const/16 v2, 0x1a

    .line 675
    .line 676
    goto :goto_1e

    .line 677
    :cond_2e
    add-int/lit8 v2, v12, 0x1

    .line 678
    .line 679
    aget-char v3, v0, v12

    .line 680
    .line 681
    :goto_1d
    move v12, v2

    .line 682
    move v2, v3

    .line 683
    goto :goto_1e

    .line 684
    :cond_2f
    const/16 v17, 0x1

    .line 685
    .line 686
    :cond_30
    :goto_1e
    const-wide v3, 0x100003701L

    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    const-wide/16 v5, 0x1

    .line 692
    .line 693
    const/16 v8, 0x20

    .line 694
    .line 695
    if-gt v2, v8, :cond_32

    .line 696
    .line 697
    shl-long v9, v5, v2

    .line 698
    .line 699
    and-long/2addr v9, v3

    .line 700
    const-wide/16 v25, 0x0

    .line 701
    .line 702
    cmp-long v9, v9, v25

    .line 703
    .line 704
    if-eqz v9, :cond_32

    .line 705
    .line 706
    iget v2, v1, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 707
    .line 708
    if-ne v12, v2, :cond_31

    .line 709
    .line 710
    goto :goto_1c

    .line 711
    :cond_31
    add-int/lit8 v2, v12, 0x1

    .line 712
    .line 713
    aget-char v3, v0, v12

    .line 714
    .line 715
    goto :goto_1d

    .line 716
    :cond_32
    const/16 v9, 0x2c

    .line 717
    .line 718
    if-ne v2, v9, :cond_33

    .line 719
    .line 720
    move/from16 v7, v17

    .line 721
    .line 722
    :cond_33
    iput-boolean v7, v1, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 723
    .line 724
    if-eqz v7, :cond_36

    .line 725
    .line 726
    iget v2, v1, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 727
    .line 728
    if-ne v12, v2, :cond_34

    .line 729
    .line 730
    const/16 v7, 0x1a

    .line 731
    .line 732
    goto :goto_1f

    .line 733
    :cond_34
    add-int/lit8 v2, v12, 0x1

    .line 734
    .line 735
    aget-char v7, v0, v12

    .line 736
    .line 737
    goto :goto_21

    .line 738
    :goto_1f
    move v2, v7

    .line 739
    :goto_20
    if-gt v2, v8, :cond_36

    .line 740
    .line 741
    shl-long v9, v5, v2

    .line 742
    .line 743
    and-long/2addr v9, v3

    .line 744
    const-wide/16 v25, 0x0

    .line 745
    .line 746
    cmp-long v7, v9, v25

    .line 747
    .line 748
    if-eqz v7, :cond_36

    .line 749
    .line 750
    iget v2, v1, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 751
    .line 752
    if-ne v12, v2, :cond_35

    .line 753
    .line 754
    const/16 v2, 0x1a

    .line 755
    .line 756
    goto :goto_20

    .line 757
    :cond_35
    add-int/lit8 v2, v12, 0x1

    .line 758
    .line 759
    aget-char v7, v0, v12

    .line 760
    .line 761
    :goto_21
    move v12, v2

    .line 762
    goto :goto_1f

    .line 763
    :cond_36
    if-eqz v18, :cond_37

    .line 764
    .line 765
    iput-char v2, v1, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 766
    .line 767
    iput v12, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 768
    .line 769
    return-object v22

    .line 770
    :cond_37
    const-string v0, "illegal input error"

    .line 771
    .line 772
    invoke-virtual {v1, v0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 773
    .line 774
    .line 775
    move-result-object v0

    .line 776
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 777
    .line 778
    .line 779
    const/4 v0, 0x0

    .line 780
    return-object v0
.end method

.method public readBoolValue()Z
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-boolean v1, v0, Lcom/alibaba/fastjson2/JSONReader;->wasNull:Z

    .line 5
    .line 6
    iget-object v2, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 7
    .line 8
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 9
    .line 10
    iget-char v4, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 11
    .line 12
    const/16 v5, 0x74

    .line 13
    .line 14
    const/16 v6, 0x65

    .line 15
    .line 16
    const/16 v7, 0x75

    .line 17
    .line 18
    const-wide/16 v8, 0x0

    .line 19
    .line 20
    const/4 v10, 0x1

    .line 21
    if-ne v4, v5, :cond_1

    .line 22
    .line 23
    add-int/lit8 v5, v3, 0x2

    .line 24
    .line 25
    array-length v11, v2

    .line 26
    if-ge v5, v11, :cond_1

    .line 27
    .line 28
    aget-char v11, v2, v3

    .line 29
    .line 30
    const/16 v12, 0x72

    .line 31
    .line 32
    if-ne v11, v12, :cond_1

    .line 33
    .line 34
    add-int/lit8 v11, v3, 0x1

    .line 35
    .line 36
    aget-char v11, v2, v11

    .line 37
    .line 38
    if-ne v11, v7, :cond_1

    .line 39
    .line 40
    aget-char v5, v2, v5

    .line 41
    .line 42
    if-ne v5, v6, :cond_1

    .line 43
    .line 44
    add-int/lit8 v3, v3, 0x3

    .line 45
    .line 46
    :cond_0
    :goto_0
    move v4, v10

    .line 47
    goto/16 :goto_3

    .line 48
    .line 49
    :cond_1
    const/16 v5, 0x66

    .line 50
    .line 51
    const/16 v11, 0x6c

    .line 52
    .line 53
    if-ne v4, v5, :cond_3

    .line 54
    .line 55
    add-int/lit8 v5, v3, 0x3

    .line 56
    .line 57
    array-length v12, v2

    .line 58
    if-ge v5, v12, :cond_3

    .line 59
    .line 60
    aget-char v12, v2, v3

    .line 61
    .line 62
    const/16 v13, 0x61

    .line 63
    .line 64
    if-ne v12, v13, :cond_3

    .line 65
    .line 66
    add-int/lit8 v12, v3, 0x1

    .line 67
    .line 68
    aget-char v12, v2, v12

    .line 69
    .line 70
    if-ne v12, v11, :cond_3

    .line 71
    .line 72
    add-int/lit8 v12, v3, 0x2

    .line 73
    .line 74
    aget-char v12, v2, v12

    .line 75
    .line 76
    const/16 v13, 0x73

    .line 77
    .line 78
    if-ne v12, v13, :cond_3

    .line 79
    .line 80
    aget-char v5, v2, v5

    .line 81
    .line 82
    if-ne v5, v6, :cond_3

    .line 83
    .line 84
    add-int/lit8 v3, v3, 0x4

    .line 85
    .line 86
    :cond_2
    :goto_1
    move v4, v1

    .line 87
    goto/16 :goto_3

    .line 88
    .line 89
    :cond_3
    const/16 v5, 0x2d

    .line 90
    .line 91
    if-eq v4, v5, :cond_16

    .line 92
    .line 93
    const/16 v5, 0x30

    .line 94
    .line 95
    if-lt v4, v5, :cond_4

    .line 96
    .line 97
    const/16 v6, 0x39

    .line 98
    .line 99
    if-gt v4, v6, :cond_4

    .line 100
    .line 101
    goto/16 :goto_a

    .line 102
    .line 103
    :cond_4
    const/16 v6, 0x6e

    .line 104
    .line 105
    if-ne v4, v6, :cond_6

    .line 106
    .line 107
    add-int/lit8 v6, v3, 0x2

    .line 108
    .line 109
    array-length v12, v2

    .line 110
    if-ge v6, v12, :cond_6

    .line 111
    .line 112
    aget-char v12, v2, v3

    .line 113
    .line 114
    if-ne v12, v7, :cond_6

    .line 115
    .line 116
    add-int/lit8 v7, v3, 0x1

    .line 117
    .line 118
    aget-char v7, v2, v7

    .line 119
    .line 120
    if-ne v7, v11, :cond_6

    .line 121
    .line 122
    aget-char v6, v2, v6

    .line 123
    .line 124
    if-ne v6, v11, :cond_6

    .line 125
    .line 126
    iget-object v4, v0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 127
    .line 128
    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 129
    .line 130
    sget-object v6, Lcom/alibaba/fastjson2/JSONReader$Feature;->ErrorOnNullForPrimitives:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 131
    .line 132
    iget-wide v6, v6, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 133
    .line 134
    and-long/2addr v4, v6

    .line 135
    cmp-long v4, v4, v8

    .line 136
    .line 137
    if-nez v4, :cond_5

    .line 138
    .line 139
    iput-boolean v10, v0, Lcom/alibaba/fastjson2/JSONReader;->wasNull:Z

    .line 140
    .line 141
    add-int/lit8 v3, v3, 0x3

    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_5
    const-string v1, "boolean value not support input null"

    .line 145
    .line 146
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    invoke-static {v1}, Lah/a;->w(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    :goto_2
    const/4 v1, 0x0

    .line 154
    return v1

    .line 155
    :cond_6
    const/16 v6, 0x22

    .line 156
    .line 157
    if-ne v4, v6, :cond_15

    .line 158
    .line 159
    add-int/lit8 v4, v3, 0x1

    .line 160
    .line 161
    array-length v7, v2

    .line 162
    const-string v11, "can not convert to boolean : "

    .line 163
    .line 164
    if-ge v4, v7, :cond_10

    .line 165
    .line 166
    aget-char v4, v2, v4

    .line 167
    .line 168
    if-ne v4, v6, :cond_10

    .line 169
    .line 170
    aget-char v4, v2, v3

    .line 171
    .line 172
    add-int/lit8 v3, v3, 0x2

    .line 173
    .line 174
    if-eq v4, v5, :cond_2

    .line 175
    .line 176
    const/16 v5, 0x4e

    .line 177
    .line 178
    if-ne v4, v5, :cond_7

    .line 179
    .line 180
    goto :goto_1

    .line 181
    :cond_7
    const/16 v5, 0x31

    .line 182
    .line 183
    if-eq v4, v5, :cond_0

    .line 184
    .line 185
    const/16 v5, 0x59

    .line 186
    .line 187
    if-ne v4, v5, :cond_8

    .line 188
    .line 189
    goto/16 :goto_0

    .line 190
    .line 191
    :cond_8
    invoke-static {v4, v11}, Lah/a;->g(ILjava/lang/String;)V

    .line 192
    .line 193
    .line 194
    goto :goto_2

    .line 195
    :goto_3
    iget v5, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 196
    .line 197
    const/16 v6, 0x1a

    .line 198
    .line 199
    if-ne v3, v5, :cond_9

    .line 200
    .line 201
    move v5, v3

    .line 202
    :goto_4
    move v3, v6

    .line 203
    goto :goto_5

    .line 204
    :cond_9
    add-int/lit8 v5, v3, 0x1

    .line 205
    .line 206
    aget-char v3, v2, v3

    .line 207
    .line 208
    :goto_5
    const-wide v11, 0x100003701L

    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    const-wide/16 v13, 0x1

    .line 214
    .line 215
    const/16 v7, 0x20

    .line 216
    .line 217
    if-gt v3, v7, :cond_b

    .line 218
    .line 219
    shl-long v15, v13, v3

    .line 220
    .line 221
    and-long/2addr v15, v11

    .line 222
    cmp-long v15, v15, v8

    .line 223
    .line 224
    if-eqz v15, :cond_b

    .line 225
    .line 226
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 227
    .line 228
    if-ne v5, v3, :cond_a

    .line 229
    .line 230
    goto :goto_4

    .line 231
    :cond_a
    add-int/lit8 v3, v5, 0x1

    .line 232
    .line 233
    aget-char v5, v2, v5

    .line 234
    .line 235
    move/from16 v17, v5

    .line 236
    .line 237
    move v5, v3

    .line 238
    move/from16 v3, v17

    .line 239
    .line 240
    goto :goto_5

    .line 241
    :cond_b
    const/16 v15, 0x2c

    .line 242
    .line 243
    if-ne v3, v15, :cond_c

    .line 244
    .line 245
    move v1, v10

    .line 246
    :cond_c
    iput-boolean v1, v0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 247
    .line 248
    if-eqz v1, :cond_f

    .line 249
    .line 250
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 251
    .line 252
    if-ne v5, v1, :cond_d

    .line 253
    .line 254
    :goto_6
    move v3, v6

    .line 255
    goto :goto_8

    .line 256
    :cond_d
    add-int/lit8 v1, v5, 0x1

    .line 257
    .line 258
    aget-char v3, v2, v5

    .line 259
    .line 260
    :goto_7
    move v5, v1

    .line 261
    :goto_8
    if-gt v3, v7, :cond_f

    .line 262
    .line 263
    shl-long v15, v13, v3

    .line 264
    .line 265
    and-long/2addr v15, v11

    .line 266
    cmp-long v1, v15, v8

    .line 267
    .line 268
    if-eqz v1, :cond_f

    .line 269
    .line 270
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 271
    .line 272
    if-ne v5, v1, :cond_e

    .line 273
    .line 274
    goto :goto_6

    .line 275
    :cond_e
    add-int/lit8 v1, v5, 0x1

    .line 276
    .line 277
    aget-char v3, v2, v5

    .line 278
    .line 279
    goto :goto_7

    .line 280
    :cond_f
    iput v5, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 281
    .line 282
    iput-char v3, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 283
    .line 284
    return v4

    .line 285
    :cond_10
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->readString()Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v2

    .line 289
    const-string v3, "true"

    .line 290
    .line 291
    invoke-virtual {v3, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 292
    .line 293
    .line 294
    move-result v3

    .line 295
    if-eqz v3, :cond_11

    .line 296
    .line 297
    return v10

    .line 298
    :cond_11
    const-string v3, "false"

    .line 299
    .line 300
    invoke-virtual {v3, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 301
    .line 302
    .line 303
    move-result v3

    .line 304
    if-eqz v3, :cond_12

    .line 305
    .line 306
    return v1

    .line 307
    :cond_12
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    .line 308
    .line 309
    .line 310
    move-result v3

    .line 311
    if-nez v3, :cond_14

    .line 312
    .line 313
    const-string v3, "null"

    .line 314
    .line 315
    invoke-virtual {v3, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 316
    .line 317
    .line 318
    move-result v3

    .line 319
    if-eqz v3, :cond_13

    .line 320
    .line 321
    goto :goto_9

    .line 322
    :cond_13
    invoke-virtual {v11, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v1

    .line 326
    invoke-static {v1}, Lah/a;->w(Ljava/lang/String;)V

    .line 327
    .line 328
    .line 329
    goto/16 :goto_2

    .line 330
    .line 331
    :cond_14
    :goto_9
    iput-boolean v10, v0, Lcom/alibaba/fastjson2/JSONReader;->wasNull:Z

    .line 332
    .line 333
    return v1

    .line 334
    :cond_15
    const-string v1, "syntax error : "

    .line 335
    .line 336
    invoke-static {v4, v1}, Lah/a;->g(ILjava/lang/String;)V

    .line 337
    .line 338
    .line 339
    goto/16 :goto_2

    .line 340
    .line 341
    :cond_16
    :goto_a
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReader;->readNumber()Ljava/lang/Number;

    .line 342
    .line 343
    .line 344
    iget-byte v2, v0, Lcom/alibaba/fastjson2/JSONReader;->valueType:B

    .line 345
    .line 346
    if-ne v2, v10, :cond_1a

    .line 347
    .line 348
    iget-object v2, v0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 349
    .line 350
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 351
    .line 352
    sget-object v4, Lcom/alibaba/fastjson2/JSONReader$Feature;->NonZeroNumberCastToBooleanAsTrue:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 353
    .line 354
    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 355
    .line 356
    and-long/2addr v2, v4

    .line 357
    cmp-long v2, v2, v8

    .line 358
    .line 359
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReader;->mag0:I

    .line 360
    .line 361
    if-eqz v2, :cond_19

    .line 362
    .line 363
    if-nez v3, :cond_18

    .line 364
    .line 365
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->mag1:I

    .line 366
    .line 367
    if-nez v2, :cond_18

    .line 368
    .line 369
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->mag2:I

    .line 370
    .line 371
    if-nez v2, :cond_18

    .line 372
    .line 373
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->mag3:I

    .line 374
    .line 375
    if-eqz v2, :cond_17

    .line 376
    .line 377
    goto :goto_b

    .line 378
    :cond_17
    return v1

    .line 379
    :cond_18
    :goto_b
    return v10

    .line 380
    :cond_19
    if-nez v3, :cond_1a

    .line 381
    .line 382
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->mag1:I

    .line 383
    .line 384
    if-nez v2, :cond_1a

    .line 385
    .line 386
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->mag2:I

    .line 387
    .line 388
    if-nez v2, :cond_1a

    .line 389
    .line 390
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->mag3:I

    .line 391
    .line 392
    if-ne v2, v10, :cond_1a

    .line 393
    .line 394
    return v10

    .line 395
    :cond_1a
    return v1
.end method

.method public readDoubleValue()D
    .locals 35

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 4
    .line 5
    iget-char v2, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 6
    .line 7
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 8
    .line 9
    iget v4, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 10
    .line 11
    const/16 v5, 0x22

    .line 12
    .line 13
    if-eq v2, v5, :cond_1

    .line 14
    .line 15
    const/16 v5, 0x27

    .line 16
    .line 17
    if-ne v2, v5, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v5, v3

    .line 21
    move v3, v2

    .line 22
    const/4 v2, 0x0

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    :goto_0
    if-ne v3, v4, :cond_2

    .line 25
    .line 26
    move v5, v3

    .line 27
    const/16 v3, 0x1a

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_2
    add-int/lit8 v5, v3, 0x1

    .line 31
    .line 32
    aget-char v3, v1, v3

    .line 33
    .line 34
    :goto_1
    const/16 v8, 0x2c

    .line 35
    .line 36
    if-eqz v2, :cond_4

    .line 37
    .line 38
    if-ne v3, v2, :cond_4

    .line 39
    .line 40
    if-ne v5, v4, :cond_3

    .line 41
    .line 42
    const/16 v3, 0x1a

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_3
    add-int/lit8 v2, v5, 0x1

    .line 46
    .line 47
    aget-char v3, v1, v5

    .line 48
    .line 49
    move v5, v2

    .line 50
    :goto_2
    move-object v7, v1

    .line 51
    const-wide/16 v11, 0x0

    .line 52
    .line 53
    const/4 v13, 0x1

    .line 54
    const-wide/16 v14, 0x0

    .line 55
    .line 56
    const-wide/16 v16, 0x1

    .line 57
    .line 58
    const-wide/16 v18, 0x0

    .line 59
    .line 60
    goto/16 :goto_1b

    .line 61
    .line 62
    :cond_4
    const/16 v6, 0x2b

    .line 63
    .line 64
    const/16 v7, 0x2d

    .line 65
    .line 66
    const-wide/16 v16, 0x1

    .line 67
    .line 68
    const/16 v9, 0x39

    .line 69
    .line 70
    const/16 v10, 0x30

    .line 71
    .line 72
    if-lt v3, v10, :cond_5

    .line 73
    .line 74
    if-gt v3, v9, :cond_5

    .line 75
    .line 76
    const-wide/16 v18, 0x0

    .line 77
    .line 78
    rsub-int/lit8 v11, v3, 0x30

    .line 79
    .line 80
    int-to-long v11, v11

    .line 81
    goto :goto_3

    .line 82
    :cond_5
    const-wide/16 v18, 0x0

    .line 83
    .line 84
    if-eq v3, v7, :cond_6

    .line 85
    .line 86
    if-ne v3, v6, :cond_7

    .line 87
    .line 88
    :cond_6
    move-wide/from16 v11, v18

    .line 89
    .line 90
    :goto_3
    cmp-long v20, v11, v18

    .line 91
    .line 92
    const-wide/16 v21, 0x64

    .line 93
    .line 94
    const-wide v23, -0x147ae147ae147aeL

    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    const/4 v13, -0x1

    .line 100
    if-gtz v20, :cond_8

    .line 101
    .line 102
    const-wide/16 v25, 0x0

    .line 103
    .line 104
    add-int/lit8 v14, v5, 0x1

    .line 105
    .line 106
    if-ge v14, v4, :cond_9

    .line 107
    .line 108
    invoke-static {v1, v5}, Lcom/alibaba/fastjson2/util/IOUtils;->digit2([CI)I

    .line 109
    .line 110
    .line 111
    move-result v14

    .line 112
    if-eq v14, v13, :cond_9

    .line 113
    .line 114
    cmp-long v13, v23, v11

    .line 115
    .line 116
    if-gtz v13, :cond_7

    .line 117
    .line 118
    mul-long v11, v11, v21

    .line 119
    .line 120
    int-to-long v13, v14

    .line 121
    sub-long/2addr v11, v13

    .line 122
    add-int/lit8 v5, v5, 0x2

    .line 123
    .line 124
    goto :goto_3

    .line 125
    :cond_7
    move-wide/from16 v11, v16

    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_8
    const-wide/16 v25, 0x0

    .line 129
    .line 130
    :cond_9
    const-wide/16 v27, 0xa

    .line 131
    .line 132
    const-wide v29, -0xcccccccccccccccL

    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    if-gtz v20, :cond_b

    .line 138
    .line 139
    if-ge v5, v4, :cond_b

    .line 140
    .line 141
    const-wide/16 v31, 0x30

    .line 142
    .line 143
    aget-char v14, v1, v5

    .line 144
    .line 145
    if-lt v14, v10, :cond_c

    .line 146
    .line 147
    if-gt v14, v9, :cond_c

    .line 148
    .line 149
    cmp-long v15, v29, v11

    .line 150
    .line 151
    if-gtz v15, :cond_a

    .line 152
    .line 153
    mul-long v11, v11, v27

    .line 154
    .line 155
    add-long v11, v11, v31

    .line 156
    .line 157
    int-to-long v6, v14

    .line 158
    sub-long/2addr v11, v6

    .line 159
    add-int/lit8 v5, v5, 0x1

    .line 160
    .line 161
    goto :goto_4

    .line 162
    :cond_a
    move-wide/from16 v11, v16

    .line 163
    .line 164
    goto :goto_4

    .line 165
    :cond_b
    const-wide/16 v31, 0x30

    .line 166
    .line 167
    move v14, v3

    .line 168
    :cond_c
    :goto_4
    cmp-long v6, v11, v18

    .line 169
    .line 170
    if-gtz v6, :cond_11

    .line 171
    .line 172
    if-ge v5, v4, :cond_11

    .line 173
    .line 174
    aget-char v6, v1, v5

    .line 175
    .line 176
    const/16 v7, 0x2e

    .line 177
    .line 178
    if-ne v6, v7, :cond_11

    .line 179
    .line 180
    add-int/lit8 v5, v5, 0x1

    .line 181
    .line 182
    const/4 v6, 0x0

    .line 183
    :goto_5
    cmp-long v7, v11, v18

    .line 184
    .line 185
    if-gtz v7, :cond_e

    .line 186
    .line 187
    add-int/lit8 v15, v5, 0x1

    .line 188
    .line 189
    if-ge v15, v4, :cond_e

    .line 190
    .line 191
    invoke-static {v1, v5}, Lcom/alibaba/fastjson2/util/IOUtils;->digit2([CI)I

    .line 192
    .line 193
    .line 194
    move-result v15

    .line 195
    if-eq v15, v13, :cond_e

    .line 196
    .line 197
    cmp-long v7, v23, v11

    .line 198
    .line 199
    if-gtz v7, :cond_d

    .line 200
    .line 201
    mul-long v11, v11, v21

    .line 202
    .line 203
    move/from16 v33, v14

    .line 204
    .line 205
    int-to-long v13, v15

    .line 206
    sub-long/2addr v11, v13

    .line 207
    add-int/lit8 v5, v5, 0x2

    .line 208
    .line 209
    add-int/lit8 v6, v6, 0x2

    .line 210
    .line 211
    move/from16 v14, v33

    .line 212
    .line 213
    const/4 v13, -0x1

    .line 214
    goto :goto_5

    .line 215
    :cond_d
    move-wide/from16 v11, v16

    .line 216
    .line 217
    goto :goto_5

    .line 218
    :cond_e
    move/from16 v33, v14

    .line 219
    .line 220
    if-gtz v7, :cond_10

    .line 221
    .line 222
    if-ge v5, v4, :cond_10

    .line 223
    .line 224
    aget-char v14, v1, v5

    .line 225
    .line 226
    if-lt v14, v10, :cond_12

    .line 227
    .line 228
    if-gt v14, v9, :cond_12

    .line 229
    .line 230
    cmp-long v7, v29, v11

    .line 231
    .line 232
    if-gtz v7, :cond_f

    .line 233
    .line 234
    mul-long v11, v11, v27

    .line 235
    .line 236
    add-long v11, v11, v31

    .line 237
    .line 238
    int-to-long v9, v14

    .line 239
    sub-long/2addr v11, v9

    .line 240
    add-int/lit8 v5, v5, 0x1

    .line 241
    .line 242
    add-int/lit8 v6, v6, 0x1

    .line 243
    .line 244
    goto :goto_6

    .line 245
    :cond_f
    move-wide/from16 v11, v16

    .line 246
    .line 247
    goto :goto_6

    .line 248
    :cond_10
    move/from16 v14, v33

    .line 249
    .line 250
    goto :goto_6

    .line 251
    :cond_11
    move/from16 v33, v14

    .line 252
    .line 253
    move/from16 v14, v33

    .line 254
    .line 255
    const/4 v6, 0x0

    .line 256
    :cond_12
    :goto_6
    cmp-long v9, v11, v18

    .line 257
    .line 258
    if-gtz v9, :cond_14

    .line 259
    .line 260
    if-ne v5, v4, :cond_13

    .line 261
    .line 262
    const/16 v14, 0x1a

    .line 263
    .line 264
    goto :goto_7

    .line 265
    :cond_13
    add-int/lit8 v10, v5, 0x1

    .line 266
    .line 267
    aget-char v5, v1, v5

    .line 268
    .line 269
    move v14, v5

    .line 270
    move v5, v10

    .line 271
    :cond_14
    :goto_7
    if-gtz v9, :cond_24

    .line 272
    .line 273
    const/16 v9, 0x65

    .line 274
    .line 275
    if-eq v14, v9, :cond_18

    .line 276
    .line 277
    const/16 v9, 0x45

    .line 278
    .line 279
    if-ne v14, v9, :cond_15

    .line 280
    .line 281
    goto :goto_8

    .line 282
    :cond_15
    const/16 v7, 0x4c

    .line 283
    .line 284
    if-eq v14, v7, :cond_16

    .line 285
    .line 286
    const/16 v7, 0x46

    .line 287
    .line 288
    if-eq v14, v7, :cond_16

    .line 289
    .line 290
    const/16 v7, 0x44

    .line 291
    .line 292
    if-eq v14, v7, :cond_16

    .line 293
    .line 294
    const/16 v7, 0x42

    .line 295
    .line 296
    if-eq v14, v7, :cond_16

    .line 297
    .line 298
    const/16 v7, 0x53

    .line 299
    .line 300
    if-ne v14, v7, :cond_24

    .line 301
    .line 302
    :cond_16
    if-ne v5, v4, :cond_17

    .line 303
    .line 304
    const/16 v14, 0x1a

    .line 305
    .line 306
    goto/16 :goto_12

    .line 307
    .line 308
    :cond_17
    add-int/lit8 v7, v5, 0x1

    .line 309
    .line 310
    aget-char v5, v1, v5

    .line 311
    .line 312
    move v14, v5

    .line 313
    move v5, v7

    .line 314
    goto/16 :goto_12

    .line 315
    .line 316
    :cond_18
    :goto_8
    if-ne v5, v4, :cond_19

    .line 317
    .line 318
    move v9, v5

    .line 319
    const/16 v5, 0x1a

    .line 320
    .line 321
    :goto_9
    const/16 v10, 0x2d

    .line 322
    .line 323
    goto :goto_a

    .line 324
    :cond_19
    add-int/lit8 v9, v5, 0x1

    .line 325
    .line 326
    aget-char v5, v1, v5

    .line 327
    .line 328
    goto :goto_9

    .line 329
    :goto_a
    if-ne v5, v10, :cond_1a

    .line 330
    .line 331
    const/4 v10, 0x1

    .line 332
    goto :goto_b

    .line 333
    :cond_1a
    const/4 v10, 0x0

    .line 334
    :goto_b
    if-nez v10, :cond_1d

    .line 335
    .line 336
    const/16 v15, 0x2b

    .line 337
    .line 338
    if-ne v5, v15, :cond_1b

    .line 339
    .line 340
    goto :goto_d

    .line 341
    :cond_1b
    if-eq v5, v8, :cond_1c

    .line 342
    .line 343
    :goto_c
    const/16 v13, 0x30

    .line 344
    .line 345
    goto :goto_e

    .line 346
    :cond_1c
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReader;->numberError()Lcom/alibaba/fastjson2/JSONException;

    .line 347
    .line 348
    .line 349
    move-result-object v1

    .line 350
    throw v1

    .line 351
    :cond_1d
    :goto_d
    if-ne v9, v4, :cond_1e

    .line 352
    .line 353
    const/16 v5, 0x1a

    .line 354
    .line 355
    goto :goto_c

    .line 356
    :cond_1e
    add-int/lit8 v5, v9, 0x1

    .line 357
    .line 358
    aget-char v9, v1, v9

    .line 359
    .line 360
    move/from16 v34, v9

    .line 361
    .line 362
    move v9, v5

    .line 363
    move/from16 v5, v34

    .line 364
    .line 365
    goto :goto_c

    .line 366
    :goto_e
    if-lt v5, v13, :cond_23

    .line 367
    .line 368
    const/16 v7, 0x39

    .line 369
    .line 370
    if-gt v5, v7, :cond_23

    .line 371
    .line 372
    add-int/lit8 v5, v5, -0x30

    .line 373
    .line 374
    :goto_f
    if-ge v9, v4, :cond_20

    .line 375
    .line 376
    aget-char v14, v1, v9

    .line 377
    .line 378
    if-lt v14, v13, :cond_20

    .line 379
    .line 380
    if-gt v14, v7, :cond_20

    .line 381
    .line 382
    add-int/lit8 v14, v14, -0x30

    .line 383
    .line 384
    mul-int/lit8 v5, v5, 0xa

    .line 385
    .line 386
    add-int/2addr v5, v14

    .line 387
    const/16 v14, 0x7ff

    .line 388
    .line 389
    if-gt v5, v14, :cond_1f

    .line 390
    .line 391
    add-int/lit8 v9, v9, 0x1

    .line 392
    .line 393
    goto :goto_f

    .line 394
    :cond_1f
    const-string v1, "too large exp value : "

    .line 395
    .line 396
    invoke-static {v5, v1}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 397
    .line 398
    .line 399
    move-result-object v1

    .line 400
    invoke-static {v1}, Lah/a;->w(Ljava/lang/String;)V

    .line 401
    .line 402
    .line 403
    const-wide/16 v1, 0x0

    .line 404
    .line 405
    return-wide v1

    .line 406
    :cond_20
    if-eqz v10, :cond_21

    .line 407
    .line 408
    neg-int v5, v5

    .line 409
    :cond_21
    sub-int/2addr v6, v5

    .line 410
    if-ne v9, v4, :cond_22

    .line 411
    .line 412
    const/16 v7, 0x1a

    .line 413
    .line 414
    goto :goto_10

    .line 415
    :cond_22
    add-int/lit8 v5, v9, 0x1

    .line 416
    .line 417
    aget-char v7, v1, v9

    .line 418
    .line 419
    move v9, v5

    .line 420
    :goto_10
    move v14, v7

    .line 421
    :goto_11
    move v5, v9

    .line 422
    goto :goto_12

    .line 423
    :cond_23
    move v14, v5

    .line 424
    move-wide/from16 v11, v16

    .line 425
    .line 426
    goto :goto_11

    .line 427
    :cond_24
    :goto_12
    cmp-long v7, v11, v18

    .line 428
    .line 429
    if-gtz v7, :cond_27

    .line 430
    .line 431
    if-eqz v2, :cond_27

    .line 432
    .line 433
    if-ne v14, v2, :cond_26

    .line 434
    .line 435
    if-ne v5, v4, :cond_25

    .line 436
    .line 437
    move v2, v5

    .line 438
    const/16 v5, 0x1a

    .line 439
    .line 440
    goto :goto_13

    .line 441
    :cond_25
    add-int/lit8 v2, v5, 0x1

    .line 442
    .line 443
    aget-char v5, v1, v5

    .line 444
    .line 445
    :goto_13
    move v14, v5

    .line 446
    move v5, v2

    .line 447
    goto :goto_14

    .line 448
    :cond_26
    move-wide/from16 v11, v16

    .line 449
    .line 450
    :cond_27
    :goto_14
    cmp-long v2, v11, v18

    .line 451
    .line 452
    if-gtz v2, :cond_30

    .line 453
    .line 454
    if-nez v6, :cond_28

    .line 455
    .line 456
    long-to-double v9, v11

    .line 457
    move-object v7, v1

    .line 458
    move v13, v2

    .line 459
    :goto_15
    const/4 v1, 0x1

    .line 460
    goto :goto_16

    .line 461
    :cond_28
    long-to-double v9, v11

    .line 462
    move-object v7, v1

    .line 463
    move v13, v2

    .line 464
    double-to-long v1, v9

    .line 465
    cmp-long v1, v1, v11

    .line 466
    .line 467
    if-nez v1, :cond_2a

    .line 468
    .line 469
    if-lez v6, :cond_29

    .line 470
    .line 471
    sget-object v1, Lcom/alibaba/fastjson2/JSONFactory;->DOUBLE_10_POW:[D

    .line 472
    .line 473
    array-length v2, v1

    .line 474
    if-ge v6, v2, :cond_29

    .line 475
    .line 476
    aget-wide v21, v1, v6

    .line 477
    .line 478
    div-double v9, v9, v21

    .line 479
    .line 480
    goto :goto_15

    .line 481
    :cond_29
    if-gez v6, :cond_2a

    .line 482
    .line 483
    sget-object v1, Lcom/alibaba/fastjson2/JSONFactory;->DOUBLE_10_POW:[D

    .line 484
    .line 485
    array-length v2, v1

    .line 486
    neg-int v2, v2

    .line 487
    if-le v6, v2, :cond_2a

    .line 488
    .line 489
    neg-int v2, v6

    .line 490
    aget-wide v21, v1, v2

    .line 491
    .line 492
    mul-double v9, v9, v21

    .line 493
    .line 494
    goto :goto_15

    .line 495
    :cond_2a
    move-wide/from16 v9, v25

    .line 496
    .line 497
    const/4 v1, 0x0

    .line 498
    :goto_16
    if-nez v1, :cond_2d

    .line 499
    .line 500
    const/16 v1, -0x80

    .line 501
    .line 502
    if-le v6, v1, :cond_2c

    .line 503
    .line 504
    const/16 v1, 0x80

    .line 505
    .line 506
    if-ge v6, v1, :cond_2c

    .line 507
    .line 508
    const/16 v1, 0x2d

    .line 509
    .line 510
    if-ne v3, v1, :cond_2b

    .line 511
    .line 512
    const/4 v13, -0x1

    .line 513
    goto :goto_17

    .line 514
    :cond_2b
    const/4 v13, 0x1

    .line 515
    :goto_17
    invoke-static {v11, v12}, Ljava/lang/Math;->abs(J)J

    .line 516
    .line 517
    .line 518
    move-result-wide v1

    .line 519
    invoke-static {v13, v1, v2, v6}, Lcom/alibaba/fastjson2/util/TypeUtils;->doubleValue(IJI)D

    .line 520
    .line 521
    .line 522
    move-result-wide v1

    .line 523
    :goto_18
    move v3, v14

    .line 524
    const/4 v13, 0x0

    .line 525
    move-wide v14, v1

    .line 526
    goto :goto_1b

    .line 527
    :cond_2c
    move v3, v14

    .line 528
    move-wide/from16 v11, v16

    .line 529
    .line 530
    :goto_19
    const/4 v13, 0x0

    .line 531
    move-wide v14, v9

    .line 532
    goto :goto_1b

    .line 533
    :cond_2d
    const/16 v1, 0x2d

    .line 534
    .line 535
    if-eq v3, v1, :cond_2e

    .line 536
    .line 537
    cmpl-double v1, v9, v25

    .line 538
    .line 539
    if-eqz v1, :cond_2f

    .line 540
    .line 541
    :goto_1a
    neg-double v1, v9

    .line 542
    goto :goto_18

    .line 543
    :cond_2e
    if-nez v13, :cond_2f

    .line 544
    .line 545
    goto :goto_1a

    .line 546
    :cond_2f
    move v3, v14

    .line 547
    goto :goto_19

    .line 548
    :cond_30
    move-object v7, v1

    .line 549
    move v3, v14

    .line 550
    move-wide/from16 v14, v25

    .line 551
    .line 552
    const/4 v13, 0x0

    .line 553
    :goto_1b
    cmp-long v1, v11, v18

    .line 554
    .line 555
    if-lez v1, :cond_31

    .line 556
    .line 557
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->readNumber0()V

    .line 558
    .line 559
    .line 560
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReader;->getDoubleValue()D

    .line 561
    .line 562
    .line 563
    move-result-wide v1

    .line 564
    return-wide v1

    .line 565
    :cond_31
    :goto_1c
    const-wide v1, 0x100003701L

    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    const/16 v6, 0x20

    .line 571
    .line 572
    if-gt v3, v6, :cond_33

    .line 573
    .line 574
    shl-long v9, v16, v3

    .line 575
    .line 576
    and-long/2addr v9, v1

    .line 577
    cmp-long v9, v9, v18

    .line 578
    .line 579
    if-eqz v9, :cond_33

    .line 580
    .line 581
    if-ne v5, v4, :cond_32

    .line 582
    .line 583
    const/16 v3, 0x1a

    .line 584
    .line 585
    goto :goto_1c

    .line 586
    :cond_32
    add-int/lit8 v1, v5, 0x1

    .line 587
    .line 588
    aget-char v2, v7, v5

    .line 589
    .line 590
    move v5, v1

    .line 591
    move v3, v2

    .line 592
    goto :goto_1c

    .line 593
    :cond_33
    if-ne v3, v8, :cond_34

    .line 594
    .line 595
    const/4 v8, 0x1

    .line 596
    goto :goto_1d

    .line 597
    :cond_34
    const/4 v8, 0x0

    .line 598
    :goto_1d
    iput-boolean v8, v0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 599
    .line 600
    if-eqz v8, :cond_37

    .line 601
    .line 602
    if-ne v5, v4, :cond_35

    .line 603
    .line 604
    move v3, v5

    .line 605
    const/16 v5, 0x1a

    .line 606
    .line 607
    goto :goto_1e

    .line 608
    :cond_35
    add-int/lit8 v3, v5, 0x1

    .line 609
    .line 610
    aget-char v5, v7, v5

    .line 611
    .line 612
    :goto_1e
    move/from16 v34, v5

    .line 613
    .line 614
    move v5, v3

    .line 615
    move/from16 v3, v34

    .line 616
    .line 617
    :goto_1f
    if-gt v3, v6, :cond_37

    .line 618
    .line 619
    shl-long v8, v16, v3

    .line 620
    .line 621
    and-long/2addr v8, v1

    .line 622
    cmp-long v8, v8, v18

    .line 623
    .line 624
    if-eqz v8, :cond_37

    .line 625
    .line 626
    if-ne v5, v4, :cond_36

    .line 627
    .line 628
    const/16 v3, 0x1a

    .line 629
    .line 630
    goto :goto_1f

    .line 631
    :cond_36
    add-int/lit8 v3, v5, 0x1

    .line 632
    .line 633
    aget-char v5, v7, v5

    .line 634
    .line 635
    goto :goto_1e

    .line 636
    :cond_37
    iput-boolean v13, v0, Lcom/alibaba/fastjson2/JSONReader;->wasNull:Z

    .line 637
    .line 638
    int-to-char v1, v3

    .line 639
    iput-char v1, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 640
    .line 641
    iput v5, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 642
    .line 643
    return-wide v14
.end method

.method public readFieldName()Ljava/lang/String;
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-char v1, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 4
    .line 5
    const/16 v2, 0x27

    .line 6
    .line 7
    const-wide/16 v3, 0x0

    .line 8
    .line 9
    if-ne v1, v2, :cond_1

    .line 10
    .line 11
    iget-object v2, v0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 12
    .line 13
    iget-wide v5, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 14
    .line 15
    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->DisableSingleQuote:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 16
    .line 17
    iget-wide v7, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 18
    .line 19
    and-long/2addr v5, v7

    .line 20
    cmp-long v2, v5, v3

    .line 21
    .line 22
    if-nez v2, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReader;->notSupportName()Lcom/alibaba/fastjson2/JSONException;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    throw v1

    .line 30
    :cond_1
    :goto_0
    const/16 v2, 0x22

    .line 31
    .line 32
    if-eq v1, v2, :cond_3

    .line 33
    .line 34
    const/16 v2, 0x27

    .line 35
    .line 36
    if-eq v1, v2, :cond_3

    .line 37
    .line 38
    iget-object v2, v0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 39
    .line 40
    iget-wide v5, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 41
    .line 42
    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->AllowUnQuotedFieldNames:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 43
    .line 44
    iget-wide v7, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 45
    .line 46
    and-long/2addr v5, v7

    .line 47
    cmp-long v2, v5, v3

    .line 48
    .line 49
    if-eqz v2, :cond_2

    .line 50
    .line 51
    invoke-static {v1}, Lcom/alibaba/fastjson2/JSONReader;->isFirstIdentifier(I)Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-eqz v1, :cond_2

    .line 56
    .line 57
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReader;->readFieldNameUnquote()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    return-object v1

    .line 62
    :cond_2
    const/4 v1, 0x0

    .line 63
    return-object v1

    .line 64
    :cond_3
    iget-object v2, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 65
    .line 66
    const/4 v5, 0x0

    .line 67
    iput-boolean v5, v0, Lcom/alibaba/fastjson2/JSONReader;->nameEscape:Z

    .line 68
    .line 69
    iget v5, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 70
    .line 71
    iput v5, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->nameBegin:I

    .line 72
    .line 73
    iget v6, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 74
    .line 75
    const/4 v7, 0x0

    .line 76
    move v8, v5

    .line 77
    :goto_1
    const/16 v9, 0x20

    .line 78
    .line 79
    const/4 v10, 0x1

    .line 80
    if-ge v8, v6, :cond_d

    .line 81
    .line 82
    aget-char v11, v2, v8

    .line 83
    .line 84
    const/16 v12, 0x5c

    .line 85
    .line 86
    if-ne v11, v12, :cond_6

    .line 87
    .line 88
    iput-boolean v10, v0, Lcom/alibaba/fastjson2/JSONReader;->nameEscape:Z

    .line 89
    .line 90
    add-int/lit8 v9, v8, 0x1

    .line 91
    .line 92
    aget-char v11, v2, v9

    .line 93
    .line 94
    const/16 v12, 0x75

    .line 95
    .line 96
    if-eq v11, v12, :cond_5

    .line 97
    .line 98
    const/16 v12, 0x78

    .line 99
    .line 100
    if-eq v11, v12, :cond_4

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_4
    add-int/lit8 v9, v8, 0x3

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_5
    add-int/lit8 v9, v8, 0x5

    .line 107
    .line 108
    :goto_2
    add-int/2addr v9, v10

    .line 109
    move v8, v9

    .line 110
    goto :goto_5

    .line 111
    :cond_6
    if-ne v11, v1, :cond_c

    .line 112
    .line 113
    iput v7, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->nameLength:I

    .line 114
    .line 115
    iput v8, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->nameEnd:I

    .line 116
    .line 117
    add-int/lit8 v8, v8, 0x1

    .line 118
    .line 119
    if-ge v8, v6, :cond_7

    .line 120
    .line 121
    aget-char v1, v2, v8

    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_7
    const/16 v1, 0x1a

    .line 125
    .line 126
    :goto_3
    if-gt v1, v9, :cond_8

    .line 127
    .line 128
    const-wide/16 v11, 0x1

    .line 129
    .line 130
    shl-long/2addr v11, v1

    .line 131
    const-wide v13, 0x100003701L

    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    and-long/2addr v11, v13

    .line 137
    cmp-long v7, v11, v3

    .line 138
    .line 139
    if-eqz v7, :cond_8

    .line 140
    .line 141
    add-int/lit8 v8, v8, 0x1

    .line 142
    .line 143
    aget-char v1, v2, v8

    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_8
    const/16 v7, 0x3a

    .line 147
    .line 148
    if-ne v1, v7, :cond_b

    .line 149
    .line 150
    add-int/2addr v8, v10

    .line 151
    if-ne v8, v6, :cond_9

    .line 152
    .line 153
    const/16 v1, 0x1a

    .line 154
    .line 155
    goto :goto_4

    .line 156
    :cond_9
    aget-char v1, v2, v8

    .line 157
    .line 158
    :goto_4
    if-gt v1, v9, :cond_a

    .line 159
    .line 160
    const-wide/16 v6, 0x1

    .line 161
    .line 162
    shl-long/2addr v6, v1

    .line 163
    const-wide v11, 0x100003701L

    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    and-long/2addr v6, v11

    .line 169
    cmp-long v6, v6, v3

    .line 170
    .line 171
    if-eqz v6, :cond_a

    .line 172
    .line 173
    add-int/lit8 v8, v8, 0x1

    .line 174
    .line 175
    aget-char v1, v2, v8

    .line 176
    .line 177
    goto :goto_4

    .line 178
    :cond_a
    add-int/lit8 v3, v8, 0x1

    .line 179
    .line 180
    iput v3, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 181
    .line 182
    int-to-char v1, v1

    .line 183
    iput-char v1, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 184
    .line 185
    goto :goto_6

    .line 186
    :cond_b
    const-string v1, "syntax error : "

    .line 187
    .line 188
    invoke-static {v8, v1}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    invoke-static {v1}, Lah/a;->w(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    const/4 v1, 0x0

    .line 196
    return-object v1

    .line 197
    :cond_c
    add-int/lit8 v8, v8, 0x1

    .line 198
    .line 199
    :goto_5
    add-int/lit8 v7, v7, 0x1

    .line 200
    .line 201
    goto :goto_1

    .line 202
    :cond_d
    :goto_6
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->nameEnd:I

    .line 203
    .line 204
    if-lt v1, v5, :cond_18

    .line 205
    .line 206
    iget-boolean v3, v0, Lcom/alibaba/fastjson2/JSONReader;->nameEscape:Z

    .line 207
    .line 208
    if-nez v3, :cond_17

    .line 209
    .line 210
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->nameLength:I

    .line 211
    .line 212
    packed-switch v3, :pswitch_data_0

    .line 213
    .line 214
    .line 215
    move/from16 v28, v1

    .line 216
    .line 217
    move-object/from16 v27, v2

    .line 218
    .line 219
    move/from16 v29, v5

    .line 220
    .line 221
    move/from16 v21, v9

    .line 222
    .line 223
    move/from16 v22, v10

    .line 224
    .line 225
    const-wide/16 v18, -0x1

    .line 226
    .line 227
    goto/16 :goto_b

    .line 228
    .line 229
    :pswitch_0
    aget-char v3, v2, v5

    .line 230
    .line 231
    add-int/lit8 v15, v5, 0x1

    .line 232
    .line 233
    aget-char v15, v2, v15

    .line 234
    .line 235
    add-int/lit8 v16, v5, 0x2

    .line 236
    .line 237
    const/16 v17, 0x38

    .line 238
    .line 239
    aget-char v4, v2, v16

    .line 240
    .line 241
    add-int/lit8 v16, v5, 0x3

    .line 242
    .line 243
    const-wide/16 v18, -0x1

    .line 244
    .line 245
    aget-char v6, v2, v16

    .line 246
    .line 247
    add-int/lit8 v7, v5, 0x4

    .line 248
    .line 249
    aget-char v7, v2, v7

    .line 250
    .line 251
    add-int/lit8 v16, v5, 0x5

    .line 252
    .line 253
    const/16 v20, 0x30

    .line 254
    .line 255
    aget-char v8, v2, v16

    .line 256
    .line 257
    add-int/lit8 v16, v5, 0x6

    .line 258
    .line 259
    move/from16 v21, v9

    .line 260
    .line 261
    aget-char v9, v2, v16

    .line 262
    .line 263
    add-int/lit8 v16, v5, 0x7

    .line 264
    .line 265
    move/from16 v22, v10

    .line 266
    .line 267
    aget-char v10, v2, v16

    .line 268
    .line 269
    add-int/lit8 v16, v5, 0x8

    .line 270
    .line 271
    const/16 v23, 0x28

    .line 272
    .line 273
    aget-char v11, v2, v16

    .line 274
    .line 275
    add-int/lit8 v16, v5, 0x9

    .line 276
    .line 277
    const/16 v24, 0x18

    .line 278
    .line 279
    aget-char v12, v2, v16

    .line 280
    .line 281
    add-int/lit8 v16, v5, 0xa

    .line 282
    .line 283
    const/16 v25, 0x10

    .line 284
    .line 285
    aget-char v13, v2, v16

    .line 286
    .line 287
    add-int/lit8 v16, v5, 0xb

    .line 288
    .line 289
    const/16 v26, 0x8

    .line 290
    .line 291
    aget-char v14, v2, v16

    .line 292
    .line 293
    add-int/lit8 v16, v5, 0xc

    .line 294
    .line 295
    move-object/from16 v27, v2

    .line 296
    .line 297
    aget-char v2, v27, v16

    .line 298
    .line 299
    add-int/lit8 v16, v5, 0xd

    .line 300
    .line 301
    move/from16 v28, v1

    .line 302
    .line 303
    aget-char v1, v27, v16

    .line 304
    .line 305
    add-int/lit8 v16, v5, 0xe

    .line 306
    .line 307
    move/from16 v29, v5

    .line 308
    .line 309
    aget-char v5, v27, v16

    .line 310
    .line 311
    add-int/lit8 v16, v29, 0xf

    .line 312
    .line 313
    aget-char v0, v27, v16

    .line 314
    .line 315
    move/from16 v16, v0

    .line 316
    .line 317
    and-int/lit16 v0, v3, 0xff

    .line 318
    .line 319
    if-ne v0, v3, :cond_e

    .line 320
    .line 321
    and-int/lit16 v0, v15, 0xff

    .line 322
    .line 323
    if-ne v0, v15, :cond_e

    .line 324
    .line 325
    and-int/lit16 v0, v4, 0xff

    .line 326
    .line 327
    if-ne v0, v4, :cond_e

    .line 328
    .line 329
    and-int/lit16 v0, v6, 0xff

    .line 330
    .line 331
    if-ne v0, v6, :cond_e

    .line 332
    .line 333
    and-int/lit16 v0, v7, 0xff

    .line 334
    .line 335
    if-ne v0, v7, :cond_e

    .line 336
    .line 337
    and-int/lit16 v0, v8, 0xff

    .line 338
    .line 339
    if-ne v0, v8, :cond_e

    .line 340
    .line 341
    and-int/lit16 v0, v9, 0xff

    .line 342
    .line 343
    if-ne v0, v9, :cond_e

    .line 344
    .line 345
    and-int/lit16 v0, v10, 0xff

    .line 346
    .line 347
    if-ne v0, v10, :cond_e

    .line 348
    .line 349
    and-int/lit16 v0, v11, 0xff

    .line 350
    .line 351
    if-ne v0, v11, :cond_e

    .line 352
    .line 353
    and-int/lit16 v0, v12, 0xff

    .line 354
    .line 355
    if-ne v0, v12, :cond_e

    .line 356
    .line 357
    and-int/lit16 v0, v13, 0xff

    .line 358
    .line 359
    if-ne v0, v13, :cond_e

    .line 360
    .line 361
    and-int/lit16 v0, v14, 0xff

    .line 362
    .line 363
    if-ne v0, v14, :cond_e

    .line 364
    .line 365
    and-int/lit16 v0, v2, 0xff

    .line 366
    .line 367
    if-ne v0, v2, :cond_e

    .line 368
    .line 369
    and-int/lit16 v0, v1, 0xff

    .line 370
    .line 371
    if-ne v0, v1, :cond_e

    .line 372
    .line 373
    and-int/lit16 v0, v5, 0xff

    .line 374
    .line 375
    if-ne v0, v5, :cond_e

    .line 376
    .line 377
    move/from16 v0, v16

    .line 378
    .line 379
    move/from16 v16, v11

    .line 380
    .line 381
    and-int/lit16 v11, v0, 0xff

    .line 382
    .line 383
    if-ne v11, v0, :cond_e

    .line 384
    .line 385
    int-to-long v10, v10

    .line 386
    shl-long v10, v10, v17

    .line 387
    .line 388
    move-wide/from16 v30, v10

    .line 389
    .line 390
    int-to-long v9, v9

    .line 391
    shl-long v9, v9, v20

    .line 392
    .line 393
    add-long v10, v30, v9

    .line 394
    .line 395
    int-to-long v8, v8

    .line 396
    shl-long v8, v8, v23

    .line 397
    .line 398
    add-long/2addr v10, v8

    .line 399
    int-to-long v7, v7

    .line 400
    shl-long v7, v7, v21

    .line 401
    .line 402
    add-long/2addr v10, v7

    .line 403
    int-to-long v6, v6

    .line 404
    shl-long v6, v6, v24

    .line 405
    .line 406
    add-long/2addr v10, v6

    .line 407
    int-to-long v6, v4

    .line 408
    shl-long v6, v6, v25

    .line 409
    .line 410
    add-long/2addr v10, v6

    .line 411
    int-to-long v6, v15

    .line 412
    shl-long v6, v6, v26

    .line 413
    .line 414
    add-long/2addr v10, v6

    .line 415
    int-to-long v3, v3

    .line 416
    add-long/2addr v10, v3

    .line 417
    int-to-long v3, v0

    .line 418
    shl-long v3, v3, v17

    .line 419
    .line 420
    int-to-long v5, v5

    .line 421
    shl-long v5, v5, v20

    .line 422
    .line 423
    add-long/2addr v3, v5

    .line 424
    int-to-long v0, v1

    .line 425
    shl-long v0, v0, v23

    .line 426
    .line 427
    add-long/2addr v3, v0

    .line 428
    int-to-long v0, v2

    .line 429
    shl-long v0, v0, v21

    .line 430
    .line 431
    add-long/2addr v3, v0

    .line 432
    int-to-long v0, v14

    .line 433
    shl-long v0, v0, v24

    .line 434
    .line 435
    add-long/2addr v3, v0

    .line 436
    int-to-long v0, v13

    .line 437
    shl-long v0, v0, v25

    .line 438
    .line 439
    add-long/2addr v3, v0

    .line 440
    int-to-long v0, v12

    .line 441
    shl-long v0, v0, v26

    .line 442
    .line 443
    add-long/2addr v3, v0

    .line 444
    move/from16 v0, v16

    .line 445
    .line 446
    int-to-long v0, v0

    .line 447
    add-long/2addr v3, v0

    .line 448
    :goto_7
    move-wide v4, v3

    .line 449
    move-wide v2, v10

    .line 450
    goto/16 :goto_c

    .line 451
    .line 452
    :pswitch_1
    move/from16 v28, v1

    .line 453
    .line 454
    move-object/from16 v27, v2

    .line 455
    .line 456
    move/from16 v29, v5

    .line 457
    .line 458
    move/from16 v21, v9

    .line 459
    .line 460
    move/from16 v22, v10

    .line 461
    .line 462
    const/16 v17, 0x38

    .line 463
    .line 464
    const-wide/16 v18, -0x1

    .line 465
    .line 466
    const/16 v20, 0x30

    .line 467
    .line 468
    const/16 v23, 0x28

    .line 469
    .line 470
    const/16 v24, 0x18

    .line 471
    .line 472
    const/16 v25, 0x10

    .line 473
    .line 474
    const/16 v26, 0x8

    .line 475
    .line 476
    aget-char v0, v27, v29

    .line 477
    .line 478
    add-int/lit8 v5, v29, 0x1

    .line 479
    .line 480
    aget-char v1, v27, v5

    .line 481
    .line 482
    add-int/lit8 v5, v29, 0x2

    .line 483
    .line 484
    aget-char v2, v27, v5

    .line 485
    .line 486
    add-int/lit8 v5, v29, 0x3

    .line 487
    .line 488
    aget-char v3, v27, v5

    .line 489
    .line 490
    add-int/lit8 v5, v29, 0x4

    .line 491
    .line 492
    aget-char v4, v27, v5

    .line 493
    .line 494
    add-int/lit8 v5, v29, 0x5

    .line 495
    .line 496
    aget-char v5, v27, v5

    .line 497
    .line 498
    add-int/lit8 v6, v29, 0x6

    .line 499
    .line 500
    aget-char v6, v27, v6

    .line 501
    .line 502
    add-int/lit8 v7, v29, 0x7

    .line 503
    .line 504
    aget-char v7, v27, v7

    .line 505
    .line 506
    add-int/lit8 v8, v29, 0x8

    .line 507
    .line 508
    aget-char v8, v27, v8

    .line 509
    .line 510
    add-int/lit8 v9, v29, 0x9

    .line 511
    .line 512
    aget-char v9, v27, v9

    .line 513
    .line 514
    add-int/lit8 v10, v29, 0xa

    .line 515
    .line 516
    aget-char v10, v27, v10

    .line 517
    .line 518
    add-int/lit8 v11, v29, 0xb

    .line 519
    .line 520
    aget-char v11, v27, v11

    .line 521
    .line 522
    add-int/lit8 v12, v29, 0xc

    .line 523
    .line 524
    aget-char v12, v27, v12

    .line 525
    .line 526
    add-int/lit8 v13, v29, 0xd

    .line 527
    .line 528
    aget-char v13, v27, v13

    .line 529
    .line 530
    add-int/lit8 v14, v29, 0xe

    .line 531
    .line 532
    aget-char v14, v27, v14

    .line 533
    .line 534
    and-int/lit16 v15, v0, 0xff

    .line 535
    .line 536
    if-ne v15, v0, :cond_e

    .line 537
    .line 538
    and-int/lit16 v15, v1, 0xff

    .line 539
    .line 540
    if-ne v15, v1, :cond_e

    .line 541
    .line 542
    and-int/lit16 v15, v2, 0xff

    .line 543
    .line 544
    if-ne v15, v2, :cond_e

    .line 545
    .line 546
    and-int/lit16 v15, v3, 0xff

    .line 547
    .line 548
    if-ne v15, v3, :cond_e

    .line 549
    .line 550
    and-int/lit16 v15, v4, 0xff

    .line 551
    .line 552
    if-ne v15, v4, :cond_e

    .line 553
    .line 554
    and-int/lit16 v15, v5, 0xff

    .line 555
    .line 556
    if-ne v15, v5, :cond_e

    .line 557
    .line 558
    and-int/lit16 v15, v6, 0xff

    .line 559
    .line 560
    if-ne v15, v6, :cond_e

    .line 561
    .line 562
    and-int/lit16 v15, v7, 0xff

    .line 563
    .line 564
    if-ne v15, v7, :cond_e

    .line 565
    .line 566
    and-int/lit16 v15, v8, 0xff

    .line 567
    .line 568
    if-ne v15, v8, :cond_e

    .line 569
    .line 570
    and-int/lit16 v15, v9, 0xff

    .line 571
    .line 572
    if-ne v15, v9, :cond_e

    .line 573
    .line 574
    and-int/lit16 v15, v10, 0xff

    .line 575
    .line 576
    if-ne v15, v10, :cond_e

    .line 577
    .line 578
    and-int/lit16 v15, v11, 0xff

    .line 579
    .line 580
    if-ne v15, v11, :cond_e

    .line 581
    .line 582
    and-int/lit16 v15, v12, 0xff

    .line 583
    .line 584
    if-ne v15, v12, :cond_e

    .line 585
    .line 586
    and-int/lit16 v15, v13, 0xff

    .line 587
    .line 588
    if-ne v15, v13, :cond_e

    .line 589
    .line 590
    and-int/lit16 v15, v14, 0xff

    .line 591
    .line 592
    if-ne v15, v14, :cond_e

    .line 593
    .line 594
    move v15, v7

    .line 595
    int-to-long v6, v6

    .line 596
    shl-long v6, v6, v20

    .line 597
    .line 598
    move-wide/from16 v30, v6

    .line 599
    .line 600
    int-to-long v5, v5

    .line 601
    shl-long v5, v5, v23

    .line 602
    .line 603
    add-long v6, v30, v5

    .line 604
    .line 605
    int-to-long v4, v4

    .line 606
    shl-long v4, v4, v21

    .line 607
    .line 608
    add-long/2addr v6, v4

    .line 609
    int-to-long v3, v3

    .line 610
    shl-long v3, v3, v24

    .line 611
    .line 612
    add-long/2addr v6, v3

    .line 613
    int-to-long v2, v2

    .line 614
    shl-long v2, v2, v25

    .line 615
    .line 616
    add-long/2addr v6, v2

    .line 617
    int-to-long v1, v1

    .line 618
    shl-long v1, v1, v26

    .line 619
    .line 620
    add-long/2addr v6, v1

    .line 621
    int-to-long v0, v0

    .line 622
    add-long/2addr v0, v6

    .line 623
    int-to-long v2, v14

    .line 624
    shl-long v2, v2, v17

    .line 625
    .line 626
    int-to-long v4, v13

    .line 627
    shl-long v4, v4, v20

    .line 628
    .line 629
    add-long/2addr v2, v4

    .line 630
    int-to-long v4, v12

    .line 631
    shl-long v4, v4, v23

    .line 632
    .line 633
    add-long/2addr v2, v4

    .line 634
    int-to-long v4, v11

    .line 635
    shl-long v4, v4, v21

    .line 636
    .line 637
    add-long/2addr v2, v4

    .line 638
    int-to-long v4, v10

    .line 639
    shl-long v4, v4, v24

    .line 640
    .line 641
    add-long/2addr v2, v4

    .line 642
    int-to-long v4, v9

    .line 643
    shl-long v4, v4, v25

    .line 644
    .line 645
    add-long/2addr v2, v4

    .line 646
    int-to-long v4, v8

    .line 647
    shl-long v4, v4, v26

    .line 648
    .line 649
    add-long/2addr v2, v4

    .line 650
    int-to-long v4, v15

    .line 651
    :goto_8
    add-long v3, v2, v4

    .line 652
    .line 653
    :goto_9
    move-wide v4, v3

    .line 654
    move-wide v2, v0

    .line 655
    goto/16 :goto_c

    .line 656
    .line 657
    :pswitch_2
    move/from16 v28, v1

    .line 658
    .line 659
    move-object/from16 v27, v2

    .line 660
    .line 661
    move/from16 v29, v5

    .line 662
    .line 663
    move/from16 v21, v9

    .line 664
    .line 665
    move/from16 v22, v10

    .line 666
    .line 667
    const/16 v17, 0x38

    .line 668
    .line 669
    const-wide/16 v18, -0x1

    .line 670
    .line 671
    const/16 v20, 0x30

    .line 672
    .line 673
    const/16 v23, 0x28

    .line 674
    .line 675
    const/16 v24, 0x18

    .line 676
    .line 677
    const/16 v25, 0x10

    .line 678
    .line 679
    const/16 v26, 0x8

    .line 680
    .line 681
    aget-char v0, v27, v29

    .line 682
    .line 683
    add-int/lit8 v5, v29, 0x1

    .line 684
    .line 685
    aget-char v1, v27, v5

    .line 686
    .line 687
    add-int/lit8 v5, v29, 0x2

    .line 688
    .line 689
    aget-char v2, v27, v5

    .line 690
    .line 691
    add-int/lit8 v5, v29, 0x3

    .line 692
    .line 693
    aget-char v3, v27, v5

    .line 694
    .line 695
    add-int/lit8 v5, v29, 0x4

    .line 696
    .line 697
    aget-char v4, v27, v5

    .line 698
    .line 699
    add-int/lit8 v5, v29, 0x5

    .line 700
    .line 701
    aget-char v5, v27, v5

    .line 702
    .line 703
    add-int/lit8 v6, v29, 0x6

    .line 704
    .line 705
    aget-char v6, v27, v6

    .line 706
    .line 707
    add-int/lit8 v7, v29, 0x7

    .line 708
    .line 709
    aget-char v7, v27, v7

    .line 710
    .line 711
    add-int/lit8 v8, v29, 0x8

    .line 712
    .line 713
    aget-char v8, v27, v8

    .line 714
    .line 715
    add-int/lit8 v9, v29, 0x9

    .line 716
    .line 717
    aget-char v9, v27, v9

    .line 718
    .line 719
    add-int/lit8 v10, v29, 0xa

    .line 720
    .line 721
    aget-char v10, v27, v10

    .line 722
    .line 723
    add-int/lit8 v11, v29, 0xb

    .line 724
    .line 725
    aget-char v11, v27, v11

    .line 726
    .line 727
    add-int/lit8 v12, v29, 0xc

    .line 728
    .line 729
    aget-char v12, v27, v12

    .line 730
    .line 731
    add-int/lit8 v13, v29, 0xd

    .line 732
    .line 733
    aget-char v13, v27, v13

    .line 734
    .line 735
    and-int/lit16 v14, v0, 0xff

    .line 736
    .line 737
    if-ne v14, v0, :cond_e

    .line 738
    .line 739
    and-int/lit16 v14, v1, 0xff

    .line 740
    .line 741
    if-ne v14, v1, :cond_e

    .line 742
    .line 743
    and-int/lit16 v14, v2, 0xff

    .line 744
    .line 745
    if-ne v14, v2, :cond_e

    .line 746
    .line 747
    and-int/lit16 v14, v3, 0xff

    .line 748
    .line 749
    if-ne v14, v3, :cond_e

    .line 750
    .line 751
    and-int/lit16 v14, v4, 0xff

    .line 752
    .line 753
    if-ne v14, v4, :cond_e

    .line 754
    .line 755
    and-int/lit16 v14, v5, 0xff

    .line 756
    .line 757
    if-ne v14, v5, :cond_e

    .line 758
    .line 759
    and-int/lit16 v14, v6, 0xff

    .line 760
    .line 761
    if-ne v14, v6, :cond_e

    .line 762
    .line 763
    and-int/lit16 v14, v7, 0xff

    .line 764
    .line 765
    if-ne v14, v7, :cond_e

    .line 766
    .line 767
    and-int/lit16 v14, v8, 0xff

    .line 768
    .line 769
    if-ne v14, v8, :cond_e

    .line 770
    .line 771
    and-int/lit16 v14, v9, 0xff

    .line 772
    .line 773
    if-ne v14, v9, :cond_e

    .line 774
    .line 775
    and-int/lit16 v14, v10, 0xff

    .line 776
    .line 777
    if-ne v14, v10, :cond_e

    .line 778
    .line 779
    and-int/lit16 v14, v11, 0xff

    .line 780
    .line 781
    if-ne v14, v11, :cond_e

    .line 782
    .line 783
    and-int/lit16 v14, v12, 0xff

    .line 784
    .line 785
    if-ne v14, v12, :cond_e

    .line 786
    .line 787
    and-int/lit16 v14, v13, 0xff

    .line 788
    .line 789
    if-ne v14, v13, :cond_e

    .line 790
    .line 791
    int-to-long v14, v5

    .line 792
    shl-long v14, v14, v23

    .line 793
    .line 794
    int-to-long v4, v4

    .line 795
    shl-long v4, v4, v21

    .line 796
    .line 797
    add-long/2addr v14, v4

    .line 798
    int-to-long v3, v3

    .line 799
    shl-long v3, v3, v24

    .line 800
    .line 801
    add-long/2addr v14, v3

    .line 802
    int-to-long v2, v2

    .line 803
    shl-long v2, v2, v25

    .line 804
    .line 805
    add-long/2addr v14, v2

    .line 806
    int-to-long v1, v1

    .line 807
    shl-long v1, v1, v26

    .line 808
    .line 809
    add-long/2addr v14, v1

    .line 810
    int-to-long v0, v0

    .line 811
    add-long/2addr v0, v14

    .line 812
    int-to-long v2, v13

    .line 813
    shl-long v2, v2, v17

    .line 814
    .line 815
    int-to-long v4, v12

    .line 816
    shl-long v4, v4, v20

    .line 817
    .line 818
    add-long/2addr v2, v4

    .line 819
    int-to-long v4, v11

    .line 820
    shl-long v4, v4, v23

    .line 821
    .line 822
    add-long/2addr v2, v4

    .line 823
    int-to-long v4, v10

    .line 824
    shl-long v4, v4, v21

    .line 825
    .line 826
    add-long/2addr v2, v4

    .line 827
    int-to-long v4, v9

    .line 828
    shl-long v4, v4, v24

    .line 829
    .line 830
    add-long/2addr v2, v4

    .line 831
    int-to-long v4, v8

    .line 832
    shl-long v4, v4, v25

    .line 833
    .line 834
    add-long/2addr v2, v4

    .line 835
    int-to-long v4, v7

    .line 836
    shl-long v4, v4, v26

    .line 837
    .line 838
    add-long/2addr v2, v4

    .line 839
    int-to-long v4, v6

    .line 840
    goto/16 :goto_8

    .line 841
    .line 842
    :pswitch_3
    move/from16 v28, v1

    .line 843
    .line 844
    move-object/from16 v27, v2

    .line 845
    .line 846
    move/from16 v29, v5

    .line 847
    .line 848
    move/from16 v21, v9

    .line 849
    .line 850
    move/from16 v22, v10

    .line 851
    .line 852
    const/16 v17, 0x38

    .line 853
    .line 854
    const-wide/16 v18, -0x1

    .line 855
    .line 856
    const/16 v20, 0x30

    .line 857
    .line 858
    const/16 v23, 0x28

    .line 859
    .line 860
    const/16 v24, 0x18

    .line 861
    .line 862
    const/16 v25, 0x10

    .line 863
    .line 864
    const/16 v26, 0x8

    .line 865
    .line 866
    aget-char v0, v27, v29

    .line 867
    .line 868
    add-int/lit8 v5, v29, 0x1

    .line 869
    .line 870
    aget-char v1, v27, v5

    .line 871
    .line 872
    add-int/lit8 v5, v29, 0x2

    .line 873
    .line 874
    aget-char v2, v27, v5

    .line 875
    .line 876
    add-int/lit8 v5, v29, 0x3

    .line 877
    .line 878
    aget-char v3, v27, v5

    .line 879
    .line 880
    add-int/lit8 v5, v29, 0x4

    .line 881
    .line 882
    aget-char v4, v27, v5

    .line 883
    .line 884
    add-int/lit8 v5, v29, 0x5

    .line 885
    .line 886
    aget-char v5, v27, v5

    .line 887
    .line 888
    add-int/lit8 v6, v29, 0x6

    .line 889
    .line 890
    aget-char v6, v27, v6

    .line 891
    .line 892
    add-int/lit8 v7, v29, 0x7

    .line 893
    .line 894
    aget-char v7, v27, v7

    .line 895
    .line 896
    add-int/lit8 v8, v29, 0x8

    .line 897
    .line 898
    aget-char v8, v27, v8

    .line 899
    .line 900
    add-int/lit8 v9, v29, 0x9

    .line 901
    .line 902
    aget-char v9, v27, v9

    .line 903
    .line 904
    add-int/lit8 v10, v29, 0xa

    .line 905
    .line 906
    aget-char v10, v27, v10

    .line 907
    .line 908
    add-int/lit8 v11, v29, 0xb

    .line 909
    .line 910
    aget-char v11, v27, v11

    .line 911
    .line 912
    add-int/lit8 v12, v29, 0xc

    .line 913
    .line 914
    aget-char v12, v27, v12

    .line 915
    .line 916
    and-int/lit16 v13, v0, 0xff

    .line 917
    .line 918
    if-ne v13, v0, :cond_e

    .line 919
    .line 920
    and-int/lit16 v13, v1, 0xff

    .line 921
    .line 922
    if-ne v13, v1, :cond_e

    .line 923
    .line 924
    and-int/lit16 v13, v2, 0xff

    .line 925
    .line 926
    if-ne v13, v2, :cond_e

    .line 927
    .line 928
    and-int/lit16 v13, v3, 0xff

    .line 929
    .line 930
    if-ne v13, v3, :cond_e

    .line 931
    .line 932
    and-int/lit16 v13, v4, 0xff

    .line 933
    .line 934
    if-ne v13, v4, :cond_e

    .line 935
    .line 936
    and-int/lit16 v13, v5, 0xff

    .line 937
    .line 938
    if-ne v13, v5, :cond_e

    .line 939
    .line 940
    and-int/lit16 v13, v6, 0xff

    .line 941
    .line 942
    if-ne v13, v6, :cond_e

    .line 943
    .line 944
    and-int/lit16 v13, v7, 0xff

    .line 945
    .line 946
    if-ne v13, v7, :cond_e

    .line 947
    .line 948
    and-int/lit16 v13, v8, 0xff

    .line 949
    .line 950
    if-ne v13, v8, :cond_e

    .line 951
    .line 952
    and-int/lit16 v13, v9, 0xff

    .line 953
    .line 954
    if-ne v13, v9, :cond_e

    .line 955
    .line 956
    and-int/lit16 v13, v10, 0xff

    .line 957
    .line 958
    if-ne v13, v10, :cond_e

    .line 959
    .line 960
    and-int/lit16 v13, v11, 0xff

    .line 961
    .line 962
    if-ne v13, v11, :cond_e

    .line 963
    .line 964
    and-int/lit16 v13, v12, 0xff

    .line 965
    .line 966
    if-ne v13, v12, :cond_e

    .line 967
    .line 968
    int-to-long v13, v4

    .line 969
    shl-long v13, v13, v21

    .line 970
    .line 971
    int-to-long v3, v3

    .line 972
    shl-long v3, v3, v24

    .line 973
    .line 974
    add-long/2addr v13, v3

    .line 975
    int-to-long v2, v2

    .line 976
    shl-long v2, v2, v25

    .line 977
    .line 978
    add-long/2addr v13, v2

    .line 979
    int-to-long v1, v1

    .line 980
    shl-long v1, v1, v26

    .line 981
    .line 982
    add-long/2addr v13, v1

    .line 983
    int-to-long v0, v0

    .line 984
    add-long/2addr v0, v13

    .line 985
    int-to-long v2, v12

    .line 986
    shl-long v2, v2, v17

    .line 987
    .line 988
    int-to-long v11, v11

    .line 989
    shl-long v11, v11, v20

    .line 990
    .line 991
    add-long/2addr v2, v11

    .line 992
    int-to-long v10, v10

    .line 993
    shl-long v10, v10, v23

    .line 994
    .line 995
    add-long/2addr v2, v10

    .line 996
    int-to-long v9, v9

    .line 997
    shl-long v9, v9, v21

    .line 998
    .line 999
    add-long/2addr v2, v9

    .line 1000
    int-to-long v8, v8

    .line 1001
    shl-long v8, v8, v24

    .line 1002
    .line 1003
    add-long/2addr v2, v8

    .line 1004
    int-to-long v7, v7

    .line 1005
    shl-long v7, v7, v25

    .line 1006
    .line 1007
    add-long/2addr v2, v7

    .line 1008
    int-to-long v6, v6

    .line 1009
    shl-long v6, v6, v26

    .line 1010
    .line 1011
    add-long/2addr v2, v6

    .line 1012
    int-to-long v4, v5

    .line 1013
    goto/16 :goto_8

    .line 1014
    .line 1015
    :pswitch_4
    move/from16 v28, v1

    .line 1016
    .line 1017
    move-object/from16 v27, v2

    .line 1018
    .line 1019
    move/from16 v29, v5

    .line 1020
    .line 1021
    move/from16 v21, v9

    .line 1022
    .line 1023
    move/from16 v22, v10

    .line 1024
    .line 1025
    const/16 v17, 0x38

    .line 1026
    .line 1027
    const-wide/16 v18, -0x1

    .line 1028
    .line 1029
    const/16 v20, 0x30

    .line 1030
    .line 1031
    const/16 v23, 0x28

    .line 1032
    .line 1033
    const/16 v24, 0x18

    .line 1034
    .line 1035
    const/16 v25, 0x10

    .line 1036
    .line 1037
    const/16 v26, 0x8

    .line 1038
    .line 1039
    aget-char v0, v27, v29

    .line 1040
    .line 1041
    add-int/lit8 v5, v29, 0x1

    .line 1042
    .line 1043
    aget-char v1, v27, v5

    .line 1044
    .line 1045
    add-int/lit8 v5, v29, 0x2

    .line 1046
    .line 1047
    aget-char v2, v27, v5

    .line 1048
    .line 1049
    add-int/lit8 v5, v29, 0x3

    .line 1050
    .line 1051
    aget-char v3, v27, v5

    .line 1052
    .line 1053
    add-int/lit8 v5, v29, 0x4

    .line 1054
    .line 1055
    aget-char v4, v27, v5

    .line 1056
    .line 1057
    add-int/lit8 v5, v29, 0x5

    .line 1058
    .line 1059
    aget-char v5, v27, v5

    .line 1060
    .line 1061
    add-int/lit8 v6, v29, 0x6

    .line 1062
    .line 1063
    aget-char v6, v27, v6

    .line 1064
    .line 1065
    add-int/lit8 v7, v29, 0x7

    .line 1066
    .line 1067
    aget-char v7, v27, v7

    .line 1068
    .line 1069
    add-int/lit8 v8, v29, 0x8

    .line 1070
    .line 1071
    aget-char v8, v27, v8

    .line 1072
    .line 1073
    add-int/lit8 v9, v29, 0x9

    .line 1074
    .line 1075
    aget-char v9, v27, v9

    .line 1076
    .line 1077
    add-int/lit8 v10, v29, 0xa

    .line 1078
    .line 1079
    aget-char v10, v27, v10

    .line 1080
    .line 1081
    add-int/lit8 v11, v29, 0xb

    .line 1082
    .line 1083
    aget-char v11, v27, v11

    .line 1084
    .line 1085
    and-int/lit16 v12, v0, 0xff

    .line 1086
    .line 1087
    if-ne v12, v0, :cond_e

    .line 1088
    .line 1089
    and-int/lit16 v12, v1, 0xff

    .line 1090
    .line 1091
    if-ne v12, v1, :cond_e

    .line 1092
    .line 1093
    and-int/lit16 v12, v2, 0xff

    .line 1094
    .line 1095
    if-ne v12, v2, :cond_e

    .line 1096
    .line 1097
    and-int/lit16 v12, v3, 0xff

    .line 1098
    .line 1099
    if-ne v12, v3, :cond_e

    .line 1100
    .line 1101
    and-int/lit16 v12, v4, 0xff

    .line 1102
    .line 1103
    if-ne v12, v4, :cond_e

    .line 1104
    .line 1105
    and-int/lit16 v12, v5, 0xff

    .line 1106
    .line 1107
    if-ne v12, v5, :cond_e

    .line 1108
    .line 1109
    and-int/lit16 v12, v6, 0xff

    .line 1110
    .line 1111
    if-ne v12, v6, :cond_e

    .line 1112
    .line 1113
    and-int/lit16 v12, v7, 0xff

    .line 1114
    .line 1115
    if-ne v12, v7, :cond_e

    .line 1116
    .line 1117
    and-int/lit16 v12, v8, 0xff

    .line 1118
    .line 1119
    if-ne v12, v8, :cond_e

    .line 1120
    .line 1121
    and-int/lit16 v12, v9, 0xff

    .line 1122
    .line 1123
    if-ne v12, v9, :cond_e

    .line 1124
    .line 1125
    and-int/lit16 v12, v10, 0xff

    .line 1126
    .line 1127
    if-ne v12, v10, :cond_e

    .line 1128
    .line 1129
    and-int/lit16 v12, v11, 0xff

    .line 1130
    .line 1131
    if-ne v12, v11, :cond_e

    .line 1132
    .line 1133
    shl-int/lit8 v3, v3, 0x18

    .line 1134
    .line 1135
    shl-int/lit8 v2, v2, 0x10

    .line 1136
    .line 1137
    add-int/2addr v3, v2

    .line 1138
    shl-int/lit8 v1, v1, 0x8

    .line 1139
    .line 1140
    add-int/2addr v3, v1

    .line 1141
    add-int/2addr v3, v0

    .line 1142
    int-to-long v0, v3

    .line 1143
    int-to-long v2, v11

    .line 1144
    shl-long v2, v2, v17

    .line 1145
    .line 1146
    int-to-long v10, v10

    .line 1147
    shl-long v10, v10, v20

    .line 1148
    .line 1149
    add-long/2addr v2, v10

    .line 1150
    int-to-long v9, v9

    .line 1151
    shl-long v9, v9, v23

    .line 1152
    .line 1153
    add-long/2addr v2, v9

    .line 1154
    int-to-long v8, v8

    .line 1155
    shl-long v8, v8, v21

    .line 1156
    .line 1157
    add-long/2addr v2, v8

    .line 1158
    int-to-long v7, v7

    .line 1159
    shl-long v7, v7, v24

    .line 1160
    .line 1161
    add-long/2addr v2, v7

    .line 1162
    int-to-long v6, v6

    .line 1163
    shl-long v6, v6, v25

    .line 1164
    .line 1165
    add-long/2addr v2, v6

    .line 1166
    int-to-long v5, v5

    .line 1167
    shl-long v5, v5, v26

    .line 1168
    .line 1169
    add-long/2addr v2, v5

    .line 1170
    int-to-long v4, v4

    .line 1171
    goto/16 :goto_8

    .line 1172
    .line 1173
    :pswitch_5
    move/from16 v28, v1

    .line 1174
    .line 1175
    move-object/from16 v27, v2

    .line 1176
    .line 1177
    move/from16 v29, v5

    .line 1178
    .line 1179
    move/from16 v21, v9

    .line 1180
    .line 1181
    move/from16 v22, v10

    .line 1182
    .line 1183
    const/16 v17, 0x38

    .line 1184
    .line 1185
    const-wide/16 v18, -0x1

    .line 1186
    .line 1187
    const/16 v20, 0x30

    .line 1188
    .line 1189
    const/16 v23, 0x28

    .line 1190
    .line 1191
    const/16 v24, 0x18

    .line 1192
    .line 1193
    const/16 v25, 0x10

    .line 1194
    .line 1195
    const/16 v26, 0x8

    .line 1196
    .line 1197
    aget-char v0, v27, v29

    .line 1198
    .line 1199
    add-int/lit8 v5, v29, 0x1

    .line 1200
    .line 1201
    aget-char v1, v27, v5

    .line 1202
    .line 1203
    add-int/lit8 v5, v29, 0x2

    .line 1204
    .line 1205
    aget-char v2, v27, v5

    .line 1206
    .line 1207
    add-int/lit8 v5, v29, 0x3

    .line 1208
    .line 1209
    aget-char v3, v27, v5

    .line 1210
    .line 1211
    add-int/lit8 v5, v29, 0x4

    .line 1212
    .line 1213
    aget-char v4, v27, v5

    .line 1214
    .line 1215
    add-int/lit8 v5, v29, 0x5

    .line 1216
    .line 1217
    aget-char v5, v27, v5

    .line 1218
    .line 1219
    add-int/lit8 v6, v29, 0x6

    .line 1220
    .line 1221
    aget-char v6, v27, v6

    .line 1222
    .line 1223
    add-int/lit8 v7, v29, 0x7

    .line 1224
    .line 1225
    aget-char v7, v27, v7

    .line 1226
    .line 1227
    add-int/lit8 v8, v29, 0x8

    .line 1228
    .line 1229
    aget-char v8, v27, v8

    .line 1230
    .line 1231
    add-int/lit8 v9, v29, 0x9

    .line 1232
    .line 1233
    aget-char v9, v27, v9

    .line 1234
    .line 1235
    add-int/lit8 v10, v29, 0xa

    .line 1236
    .line 1237
    aget-char v10, v27, v10

    .line 1238
    .line 1239
    and-int/lit16 v11, v0, 0xff

    .line 1240
    .line 1241
    if-ne v11, v0, :cond_e

    .line 1242
    .line 1243
    and-int/lit16 v11, v1, 0xff

    .line 1244
    .line 1245
    if-ne v11, v1, :cond_e

    .line 1246
    .line 1247
    and-int/lit16 v11, v2, 0xff

    .line 1248
    .line 1249
    if-ne v11, v2, :cond_e

    .line 1250
    .line 1251
    and-int/lit16 v11, v3, 0xff

    .line 1252
    .line 1253
    if-ne v11, v3, :cond_e

    .line 1254
    .line 1255
    and-int/lit16 v11, v4, 0xff

    .line 1256
    .line 1257
    if-ne v11, v4, :cond_e

    .line 1258
    .line 1259
    and-int/lit16 v11, v5, 0xff

    .line 1260
    .line 1261
    if-ne v11, v5, :cond_e

    .line 1262
    .line 1263
    and-int/lit16 v11, v6, 0xff

    .line 1264
    .line 1265
    if-ne v11, v6, :cond_e

    .line 1266
    .line 1267
    and-int/lit16 v11, v7, 0xff

    .line 1268
    .line 1269
    if-ne v11, v7, :cond_e

    .line 1270
    .line 1271
    and-int/lit16 v11, v8, 0xff

    .line 1272
    .line 1273
    if-ne v11, v8, :cond_e

    .line 1274
    .line 1275
    and-int/lit16 v11, v9, 0xff

    .line 1276
    .line 1277
    if-ne v11, v9, :cond_e

    .line 1278
    .line 1279
    and-int/lit16 v11, v10, 0xff

    .line 1280
    .line 1281
    if-ne v11, v10, :cond_e

    .line 1282
    .line 1283
    shl-int/lit8 v2, v2, 0x10

    .line 1284
    .line 1285
    shl-int/lit8 v1, v1, 0x8

    .line 1286
    .line 1287
    add-int/2addr v2, v1

    .line 1288
    add-int/2addr v2, v0

    .line 1289
    int-to-long v0, v2

    .line 1290
    int-to-long v10, v10

    .line 1291
    shl-long v10, v10, v17

    .line 1292
    .line 1293
    int-to-long v12, v9

    .line 1294
    shl-long v12, v12, v20

    .line 1295
    .line 1296
    add-long/2addr v10, v12

    .line 1297
    int-to-long v8, v8

    .line 1298
    shl-long v8, v8, v23

    .line 1299
    .line 1300
    add-long/2addr v10, v8

    .line 1301
    int-to-long v7, v7

    .line 1302
    shl-long v7, v7, v21

    .line 1303
    .line 1304
    add-long/2addr v10, v7

    .line 1305
    int-to-long v6, v6

    .line 1306
    shl-long v6, v6, v24

    .line 1307
    .line 1308
    add-long/2addr v10, v6

    .line 1309
    int-to-long v5, v5

    .line 1310
    shl-long v5, v5, v25

    .line 1311
    .line 1312
    add-long/2addr v10, v5

    .line 1313
    int-to-long v4, v4

    .line 1314
    shl-long v4, v4, v26

    .line 1315
    .line 1316
    add-long/2addr v10, v4

    .line 1317
    int-to-long v2, v3

    .line 1318
    add-long v3, v10, v2

    .line 1319
    .line 1320
    goto/16 :goto_9

    .line 1321
    .line 1322
    :pswitch_6
    move/from16 v28, v1

    .line 1323
    .line 1324
    move-object/from16 v27, v2

    .line 1325
    .line 1326
    move/from16 v29, v5

    .line 1327
    .line 1328
    move/from16 v21, v9

    .line 1329
    .line 1330
    move/from16 v22, v10

    .line 1331
    .line 1332
    const/16 v17, 0x38

    .line 1333
    .line 1334
    const-wide/16 v18, -0x1

    .line 1335
    .line 1336
    const/16 v20, 0x30

    .line 1337
    .line 1338
    const/16 v23, 0x28

    .line 1339
    .line 1340
    const/16 v24, 0x18

    .line 1341
    .line 1342
    const/16 v25, 0x10

    .line 1343
    .line 1344
    const/16 v26, 0x8

    .line 1345
    .line 1346
    aget-char v0, v27, v29

    .line 1347
    .line 1348
    add-int/lit8 v5, v29, 0x1

    .line 1349
    .line 1350
    aget-char v1, v27, v5

    .line 1351
    .line 1352
    add-int/lit8 v5, v29, 0x2

    .line 1353
    .line 1354
    aget-char v2, v27, v5

    .line 1355
    .line 1356
    add-int/lit8 v5, v29, 0x3

    .line 1357
    .line 1358
    aget-char v3, v27, v5

    .line 1359
    .line 1360
    add-int/lit8 v5, v29, 0x4

    .line 1361
    .line 1362
    aget-char v4, v27, v5

    .line 1363
    .line 1364
    add-int/lit8 v5, v29, 0x5

    .line 1365
    .line 1366
    aget-char v5, v27, v5

    .line 1367
    .line 1368
    add-int/lit8 v6, v29, 0x6

    .line 1369
    .line 1370
    aget-char v6, v27, v6

    .line 1371
    .line 1372
    add-int/lit8 v7, v29, 0x7

    .line 1373
    .line 1374
    aget-char v7, v27, v7

    .line 1375
    .line 1376
    add-int/lit8 v8, v29, 0x8

    .line 1377
    .line 1378
    aget-char v8, v27, v8

    .line 1379
    .line 1380
    add-int/lit8 v9, v29, 0x9

    .line 1381
    .line 1382
    aget-char v9, v27, v9

    .line 1383
    .line 1384
    and-int/lit16 v10, v0, 0xff

    .line 1385
    .line 1386
    if-ne v10, v0, :cond_e

    .line 1387
    .line 1388
    and-int/lit16 v10, v1, 0xff

    .line 1389
    .line 1390
    if-ne v10, v1, :cond_e

    .line 1391
    .line 1392
    and-int/lit16 v10, v2, 0xff

    .line 1393
    .line 1394
    if-ne v10, v2, :cond_e

    .line 1395
    .line 1396
    and-int/lit16 v10, v3, 0xff

    .line 1397
    .line 1398
    if-ne v10, v3, :cond_e

    .line 1399
    .line 1400
    and-int/lit16 v10, v4, 0xff

    .line 1401
    .line 1402
    if-ne v10, v4, :cond_e

    .line 1403
    .line 1404
    and-int/lit16 v10, v5, 0xff

    .line 1405
    .line 1406
    if-ne v10, v5, :cond_e

    .line 1407
    .line 1408
    and-int/lit16 v10, v6, 0xff

    .line 1409
    .line 1410
    if-ne v10, v6, :cond_e

    .line 1411
    .line 1412
    and-int/lit16 v10, v7, 0xff

    .line 1413
    .line 1414
    if-ne v10, v7, :cond_e

    .line 1415
    .line 1416
    and-int/lit16 v10, v8, 0xff

    .line 1417
    .line 1418
    if-ne v10, v8, :cond_e

    .line 1419
    .line 1420
    and-int/lit16 v10, v9, 0xff

    .line 1421
    .line 1422
    if-ne v10, v9, :cond_e

    .line 1423
    .line 1424
    shl-int/lit8 v1, v1, 0x8

    .line 1425
    .line 1426
    add-int/2addr v1, v0

    .line 1427
    int-to-long v10, v1

    .line 1428
    int-to-long v0, v9

    .line 1429
    shl-long v0, v0, v17

    .line 1430
    .line 1431
    int-to-long v8, v8

    .line 1432
    shl-long v8, v8, v20

    .line 1433
    .line 1434
    add-long/2addr v0, v8

    .line 1435
    int-to-long v7, v7

    .line 1436
    shl-long v7, v7, v23

    .line 1437
    .line 1438
    add-long/2addr v0, v7

    .line 1439
    int-to-long v6, v6

    .line 1440
    shl-long v6, v6, v21

    .line 1441
    .line 1442
    add-long/2addr v0, v6

    .line 1443
    int-to-long v5, v5

    .line 1444
    shl-long v5, v5, v24

    .line 1445
    .line 1446
    add-long/2addr v0, v5

    .line 1447
    int-to-long v4, v4

    .line 1448
    shl-long v4, v4, v25

    .line 1449
    .line 1450
    add-long/2addr v0, v4

    .line 1451
    int-to-long v3, v3

    .line 1452
    shl-long v3, v3, v26

    .line 1453
    .line 1454
    add-long/2addr v0, v3

    .line 1455
    int-to-long v2, v2

    .line 1456
    add-long v3, v0, v2

    .line 1457
    .line 1458
    goto/16 :goto_7

    .line 1459
    .line 1460
    :pswitch_7
    move/from16 v28, v1

    .line 1461
    .line 1462
    move-object/from16 v27, v2

    .line 1463
    .line 1464
    move/from16 v29, v5

    .line 1465
    .line 1466
    move/from16 v21, v9

    .line 1467
    .line 1468
    move/from16 v22, v10

    .line 1469
    .line 1470
    const/16 v17, 0x38

    .line 1471
    .line 1472
    const-wide/16 v18, -0x1

    .line 1473
    .line 1474
    const/16 v20, 0x30

    .line 1475
    .line 1476
    const/16 v23, 0x28

    .line 1477
    .line 1478
    const/16 v24, 0x18

    .line 1479
    .line 1480
    const/16 v25, 0x10

    .line 1481
    .line 1482
    const/16 v26, 0x8

    .line 1483
    .line 1484
    aget-char v0, v27, v29

    .line 1485
    .line 1486
    add-int/lit8 v5, v29, 0x1

    .line 1487
    .line 1488
    aget-char v1, v27, v5

    .line 1489
    .line 1490
    add-int/lit8 v5, v29, 0x2

    .line 1491
    .line 1492
    aget-char v2, v27, v5

    .line 1493
    .line 1494
    add-int/lit8 v5, v29, 0x3

    .line 1495
    .line 1496
    aget-char v3, v27, v5

    .line 1497
    .line 1498
    add-int/lit8 v5, v29, 0x4

    .line 1499
    .line 1500
    aget-char v4, v27, v5

    .line 1501
    .line 1502
    add-int/lit8 v5, v29, 0x5

    .line 1503
    .line 1504
    aget-char v5, v27, v5

    .line 1505
    .line 1506
    add-int/lit8 v6, v29, 0x6

    .line 1507
    .line 1508
    aget-char v6, v27, v6

    .line 1509
    .line 1510
    add-int/lit8 v7, v29, 0x7

    .line 1511
    .line 1512
    aget-char v7, v27, v7

    .line 1513
    .line 1514
    add-int/lit8 v8, v29, 0x8

    .line 1515
    .line 1516
    aget-char v8, v27, v8

    .line 1517
    .line 1518
    and-int/lit16 v9, v0, 0xff

    .line 1519
    .line 1520
    if-ne v9, v0, :cond_e

    .line 1521
    .line 1522
    and-int/lit16 v9, v1, 0xff

    .line 1523
    .line 1524
    if-ne v9, v1, :cond_e

    .line 1525
    .line 1526
    and-int/lit16 v9, v2, 0xff

    .line 1527
    .line 1528
    if-ne v9, v2, :cond_e

    .line 1529
    .line 1530
    and-int/lit16 v9, v3, 0xff

    .line 1531
    .line 1532
    if-ne v9, v3, :cond_e

    .line 1533
    .line 1534
    and-int/lit16 v9, v4, 0xff

    .line 1535
    .line 1536
    if-ne v9, v4, :cond_e

    .line 1537
    .line 1538
    and-int/lit16 v9, v5, 0xff

    .line 1539
    .line 1540
    if-ne v9, v5, :cond_e

    .line 1541
    .line 1542
    and-int/lit16 v9, v6, 0xff

    .line 1543
    .line 1544
    if-ne v9, v6, :cond_e

    .line 1545
    .line 1546
    and-int/lit16 v9, v7, 0xff

    .line 1547
    .line 1548
    if-ne v9, v7, :cond_e

    .line 1549
    .line 1550
    and-int/lit16 v9, v8, 0xff

    .line 1551
    .line 1552
    if-ne v9, v8, :cond_e

    .line 1553
    .line 1554
    int-to-long v10, v0

    .line 1555
    int-to-long v8, v8

    .line 1556
    shl-long v8, v8, v17

    .line 1557
    .line 1558
    int-to-long v12, v7

    .line 1559
    shl-long v12, v12, v20

    .line 1560
    .line 1561
    add-long/2addr v8, v12

    .line 1562
    int-to-long v6, v6

    .line 1563
    shl-long v6, v6, v23

    .line 1564
    .line 1565
    add-long/2addr v8, v6

    .line 1566
    int-to-long v5, v5

    .line 1567
    shl-long v5, v5, v21

    .line 1568
    .line 1569
    add-long/2addr v8, v5

    .line 1570
    int-to-long v4, v4

    .line 1571
    shl-long v4, v4, v24

    .line 1572
    .line 1573
    add-long/2addr v8, v4

    .line 1574
    int-to-long v3, v3

    .line 1575
    shl-long v3, v3, v25

    .line 1576
    .line 1577
    add-long/2addr v8, v3

    .line 1578
    int-to-long v2, v2

    .line 1579
    shl-long v2, v2, v26

    .line 1580
    .line 1581
    add-long/2addr v8, v2

    .line 1582
    int-to-long v0, v1

    .line 1583
    add-long v3, v8, v0

    .line 1584
    .line 1585
    goto/16 :goto_7

    .line 1586
    .line 1587
    :pswitch_8
    move/from16 v28, v1

    .line 1588
    .line 1589
    move-object/from16 v27, v2

    .line 1590
    .line 1591
    move/from16 v29, v5

    .line 1592
    .line 1593
    move/from16 v21, v9

    .line 1594
    .line 1595
    move/from16 v22, v10

    .line 1596
    .line 1597
    const/16 v17, 0x38

    .line 1598
    .line 1599
    const-wide/16 v18, -0x1

    .line 1600
    .line 1601
    const/16 v20, 0x30

    .line 1602
    .line 1603
    const/16 v23, 0x28

    .line 1604
    .line 1605
    const/16 v24, 0x18

    .line 1606
    .line 1607
    const/16 v25, 0x10

    .line 1608
    .line 1609
    const/16 v26, 0x8

    .line 1610
    .line 1611
    aget-char v0, v27, v29

    .line 1612
    .line 1613
    add-int/lit8 v5, v29, 0x1

    .line 1614
    .line 1615
    aget-char v1, v27, v5

    .line 1616
    .line 1617
    add-int/lit8 v5, v29, 0x2

    .line 1618
    .line 1619
    aget-char v2, v27, v5

    .line 1620
    .line 1621
    add-int/lit8 v5, v29, 0x3

    .line 1622
    .line 1623
    aget-char v3, v27, v5

    .line 1624
    .line 1625
    add-int/lit8 v5, v29, 0x4

    .line 1626
    .line 1627
    aget-char v4, v27, v5

    .line 1628
    .line 1629
    add-int/lit8 v5, v29, 0x5

    .line 1630
    .line 1631
    aget-char v5, v27, v5

    .line 1632
    .line 1633
    add-int/lit8 v6, v29, 0x6

    .line 1634
    .line 1635
    aget-char v6, v27, v6

    .line 1636
    .line 1637
    add-int/lit8 v7, v29, 0x7

    .line 1638
    .line 1639
    aget-char v7, v27, v7

    .line 1640
    .line 1641
    and-int/lit16 v8, v0, 0xff

    .line 1642
    .line 1643
    if-ne v8, v0, :cond_e

    .line 1644
    .line 1645
    and-int/lit16 v8, v1, 0xff

    .line 1646
    .line 1647
    if-ne v8, v1, :cond_e

    .line 1648
    .line 1649
    and-int/lit16 v8, v2, 0xff

    .line 1650
    .line 1651
    if-ne v8, v2, :cond_e

    .line 1652
    .line 1653
    and-int/lit16 v8, v3, 0xff

    .line 1654
    .line 1655
    if-ne v8, v3, :cond_e

    .line 1656
    .line 1657
    and-int/lit16 v8, v4, 0xff

    .line 1658
    .line 1659
    if-ne v8, v4, :cond_e

    .line 1660
    .line 1661
    and-int/lit16 v8, v5, 0xff

    .line 1662
    .line 1663
    if-ne v8, v5, :cond_e

    .line 1664
    .line 1665
    and-int/lit16 v8, v6, 0xff

    .line 1666
    .line 1667
    if-ne v8, v6, :cond_e

    .line 1668
    .line 1669
    and-int/lit16 v8, v7, 0xff

    .line 1670
    .line 1671
    if-ne v8, v7, :cond_e

    .line 1672
    .line 1673
    int-to-long v7, v7

    .line 1674
    shl-long v7, v7, v17

    .line 1675
    .line 1676
    int-to-long v9, v6

    .line 1677
    shl-long v9, v9, v20

    .line 1678
    .line 1679
    add-long/2addr v7, v9

    .line 1680
    int-to-long v5, v5

    .line 1681
    shl-long v5, v5, v23

    .line 1682
    .line 1683
    add-long/2addr v7, v5

    .line 1684
    int-to-long v4, v4

    .line 1685
    shl-long v4, v4, v21

    .line 1686
    .line 1687
    add-long/2addr v7, v4

    .line 1688
    int-to-long v3, v3

    .line 1689
    shl-long v3, v3, v24

    .line 1690
    .line 1691
    add-long/2addr v7, v3

    .line 1692
    int-to-long v2, v2

    .line 1693
    shl-long v2, v2, v25

    .line 1694
    .line 1695
    add-long/2addr v7, v2

    .line 1696
    int-to-long v1, v1

    .line 1697
    shl-long v1, v1, v26

    .line 1698
    .line 1699
    add-long/2addr v7, v1

    .line 1700
    int-to-long v0, v0

    .line 1701
    add-long v10, v7, v0

    .line 1702
    .line 1703
    :goto_a
    move-wide v2, v10

    .line 1704
    move-wide/from16 v4, v18

    .line 1705
    .line 1706
    goto/16 :goto_c

    .line 1707
    .line 1708
    :pswitch_9
    move/from16 v28, v1

    .line 1709
    .line 1710
    move-object/from16 v27, v2

    .line 1711
    .line 1712
    move/from16 v29, v5

    .line 1713
    .line 1714
    move/from16 v21, v9

    .line 1715
    .line 1716
    move/from16 v22, v10

    .line 1717
    .line 1718
    const-wide/16 v18, -0x1

    .line 1719
    .line 1720
    const/16 v20, 0x30

    .line 1721
    .line 1722
    const/16 v23, 0x28

    .line 1723
    .line 1724
    const/16 v24, 0x18

    .line 1725
    .line 1726
    const/16 v25, 0x10

    .line 1727
    .line 1728
    const/16 v26, 0x8

    .line 1729
    .line 1730
    aget-char v0, v27, v29

    .line 1731
    .line 1732
    add-int/lit8 v5, v29, 0x1

    .line 1733
    .line 1734
    aget-char v1, v27, v5

    .line 1735
    .line 1736
    add-int/lit8 v5, v29, 0x2

    .line 1737
    .line 1738
    aget-char v2, v27, v5

    .line 1739
    .line 1740
    add-int/lit8 v5, v29, 0x3

    .line 1741
    .line 1742
    aget-char v3, v27, v5

    .line 1743
    .line 1744
    add-int/lit8 v5, v29, 0x4

    .line 1745
    .line 1746
    aget-char v4, v27, v5

    .line 1747
    .line 1748
    add-int/lit8 v5, v29, 0x5

    .line 1749
    .line 1750
    aget-char v5, v27, v5

    .line 1751
    .line 1752
    add-int/lit8 v6, v29, 0x6

    .line 1753
    .line 1754
    aget-char v6, v27, v6

    .line 1755
    .line 1756
    and-int/lit16 v7, v0, 0xff

    .line 1757
    .line 1758
    if-ne v7, v0, :cond_e

    .line 1759
    .line 1760
    and-int/lit16 v7, v1, 0xff

    .line 1761
    .line 1762
    if-ne v7, v1, :cond_e

    .line 1763
    .line 1764
    and-int/lit16 v7, v2, 0xff

    .line 1765
    .line 1766
    if-ne v7, v2, :cond_e

    .line 1767
    .line 1768
    and-int/lit16 v7, v3, 0xff

    .line 1769
    .line 1770
    if-ne v7, v3, :cond_e

    .line 1771
    .line 1772
    and-int/lit16 v7, v4, 0xff

    .line 1773
    .line 1774
    if-ne v7, v4, :cond_e

    .line 1775
    .line 1776
    and-int/lit16 v7, v5, 0xff

    .line 1777
    .line 1778
    if-ne v7, v5, :cond_e

    .line 1779
    .line 1780
    and-int/lit16 v7, v6, 0xff

    .line 1781
    .line 1782
    if-ne v7, v6, :cond_e

    .line 1783
    .line 1784
    int-to-long v6, v6

    .line 1785
    shl-long v6, v6, v20

    .line 1786
    .line 1787
    int-to-long v8, v5

    .line 1788
    shl-long v8, v8, v23

    .line 1789
    .line 1790
    add-long/2addr v6, v8

    .line 1791
    int-to-long v4, v4

    .line 1792
    shl-long v4, v4, v21

    .line 1793
    .line 1794
    add-long/2addr v6, v4

    .line 1795
    int-to-long v3, v3

    .line 1796
    shl-long v3, v3, v24

    .line 1797
    .line 1798
    add-long/2addr v6, v3

    .line 1799
    int-to-long v2, v2

    .line 1800
    shl-long v2, v2, v25

    .line 1801
    .line 1802
    add-long/2addr v6, v2

    .line 1803
    int-to-long v1, v1

    .line 1804
    shl-long v1, v1, v26

    .line 1805
    .line 1806
    add-long/2addr v6, v1

    .line 1807
    int-to-long v0, v0

    .line 1808
    add-long v10, v6, v0

    .line 1809
    .line 1810
    goto :goto_a

    .line 1811
    :pswitch_a
    move/from16 v28, v1

    .line 1812
    .line 1813
    move-object/from16 v27, v2

    .line 1814
    .line 1815
    move/from16 v29, v5

    .line 1816
    .line 1817
    move/from16 v21, v9

    .line 1818
    .line 1819
    move/from16 v22, v10

    .line 1820
    .line 1821
    const-wide/16 v18, -0x1

    .line 1822
    .line 1823
    const/16 v23, 0x28

    .line 1824
    .line 1825
    const/16 v24, 0x18

    .line 1826
    .line 1827
    const/16 v25, 0x10

    .line 1828
    .line 1829
    const/16 v26, 0x8

    .line 1830
    .line 1831
    aget-char v0, v27, v29

    .line 1832
    .line 1833
    add-int/lit8 v5, v29, 0x1

    .line 1834
    .line 1835
    aget-char v1, v27, v5

    .line 1836
    .line 1837
    add-int/lit8 v5, v29, 0x2

    .line 1838
    .line 1839
    aget-char v2, v27, v5

    .line 1840
    .line 1841
    add-int/lit8 v5, v29, 0x3

    .line 1842
    .line 1843
    aget-char v3, v27, v5

    .line 1844
    .line 1845
    add-int/lit8 v5, v29, 0x4

    .line 1846
    .line 1847
    aget-char v4, v27, v5

    .line 1848
    .line 1849
    add-int/lit8 v5, v29, 0x5

    .line 1850
    .line 1851
    aget-char v5, v27, v5

    .line 1852
    .line 1853
    and-int/lit16 v6, v0, 0xff

    .line 1854
    .line 1855
    if-ne v6, v0, :cond_e

    .line 1856
    .line 1857
    and-int/lit16 v6, v1, 0xff

    .line 1858
    .line 1859
    if-ne v6, v1, :cond_e

    .line 1860
    .line 1861
    and-int/lit16 v6, v2, 0xff

    .line 1862
    .line 1863
    if-ne v6, v2, :cond_e

    .line 1864
    .line 1865
    and-int/lit16 v6, v3, 0xff

    .line 1866
    .line 1867
    if-ne v6, v3, :cond_e

    .line 1868
    .line 1869
    and-int/lit16 v6, v4, 0xff

    .line 1870
    .line 1871
    if-ne v6, v4, :cond_e

    .line 1872
    .line 1873
    and-int/lit16 v6, v5, 0xff

    .line 1874
    .line 1875
    if-ne v6, v5, :cond_e

    .line 1876
    .line 1877
    int-to-long v5, v5

    .line 1878
    shl-long v5, v5, v23

    .line 1879
    .line 1880
    int-to-long v7, v4

    .line 1881
    shl-long v7, v7, v21

    .line 1882
    .line 1883
    add-long/2addr v5, v7

    .line 1884
    int-to-long v3, v3

    .line 1885
    shl-long v3, v3, v24

    .line 1886
    .line 1887
    add-long/2addr v5, v3

    .line 1888
    int-to-long v2, v2

    .line 1889
    shl-long v2, v2, v25

    .line 1890
    .line 1891
    add-long/2addr v5, v2

    .line 1892
    int-to-long v1, v1

    .line 1893
    shl-long v1, v1, v26

    .line 1894
    .line 1895
    add-long/2addr v5, v1

    .line 1896
    int-to-long v0, v0

    .line 1897
    add-long v10, v5, v0

    .line 1898
    .line 1899
    goto/16 :goto_a

    .line 1900
    .line 1901
    :pswitch_b
    move/from16 v28, v1

    .line 1902
    .line 1903
    move-object/from16 v27, v2

    .line 1904
    .line 1905
    move/from16 v29, v5

    .line 1906
    .line 1907
    move/from16 v21, v9

    .line 1908
    .line 1909
    move/from16 v22, v10

    .line 1910
    .line 1911
    const-wide/16 v18, -0x1

    .line 1912
    .line 1913
    const/16 v24, 0x18

    .line 1914
    .line 1915
    const/16 v25, 0x10

    .line 1916
    .line 1917
    const/16 v26, 0x8

    .line 1918
    .line 1919
    aget-char v0, v27, v29

    .line 1920
    .line 1921
    add-int/lit8 v5, v29, 0x1

    .line 1922
    .line 1923
    aget-char v1, v27, v5

    .line 1924
    .line 1925
    add-int/lit8 v5, v29, 0x2

    .line 1926
    .line 1927
    aget-char v2, v27, v5

    .line 1928
    .line 1929
    add-int/lit8 v5, v29, 0x3

    .line 1930
    .line 1931
    aget-char v3, v27, v5

    .line 1932
    .line 1933
    add-int/lit8 v5, v29, 0x4

    .line 1934
    .line 1935
    aget-char v4, v27, v5

    .line 1936
    .line 1937
    and-int/lit16 v5, v0, 0xff

    .line 1938
    .line 1939
    if-ne v5, v0, :cond_e

    .line 1940
    .line 1941
    and-int/lit16 v5, v1, 0xff

    .line 1942
    .line 1943
    if-ne v5, v1, :cond_e

    .line 1944
    .line 1945
    and-int/lit16 v5, v2, 0xff

    .line 1946
    .line 1947
    if-ne v5, v2, :cond_e

    .line 1948
    .line 1949
    and-int/lit16 v5, v3, 0xff

    .line 1950
    .line 1951
    if-ne v5, v3, :cond_e

    .line 1952
    .line 1953
    and-int/lit16 v5, v4, 0xff

    .line 1954
    .line 1955
    if-ne v5, v4, :cond_e

    .line 1956
    .line 1957
    int-to-long v4, v4

    .line 1958
    shl-long v4, v4, v21

    .line 1959
    .line 1960
    int-to-long v6, v3

    .line 1961
    shl-long v6, v6, v24

    .line 1962
    .line 1963
    add-long/2addr v4, v6

    .line 1964
    int-to-long v2, v2

    .line 1965
    shl-long v2, v2, v25

    .line 1966
    .line 1967
    add-long/2addr v4, v2

    .line 1968
    int-to-long v1, v1

    .line 1969
    shl-long v1, v1, v26

    .line 1970
    .line 1971
    add-long/2addr v4, v1

    .line 1972
    int-to-long v0, v0

    .line 1973
    add-long v10, v4, v0

    .line 1974
    .line 1975
    goto/16 :goto_a

    .line 1976
    .line 1977
    :pswitch_c
    move/from16 v28, v1

    .line 1978
    .line 1979
    move-object/from16 v27, v2

    .line 1980
    .line 1981
    move/from16 v29, v5

    .line 1982
    .line 1983
    move/from16 v21, v9

    .line 1984
    .line 1985
    move/from16 v22, v10

    .line 1986
    .line 1987
    const-wide/16 v18, -0x1

    .line 1988
    .line 1989
    const/16 v24, 0x18

    .line 1990
    .line 1991
    const/16 v25, 0x10

    .line 1992
    .line 1993
    const/16 v26, 0x8

    .line 1994
    .line 1995
    aget-char v0, v27, v29

    .line 1996
    .line 1997
    add-int/lit8 v5, v29, 0x1

    .line 1998
    .line 1999
    aget-char v1, v27, v5

    .line 2000
    .line 2001
    add-int/lit8 v5, v29, 0x2

    .line 2002
    .line 2003
    aget-char v2, v27, v5

    .line 2004
    .line 2005
    add-int/lit8 v5, v29, 0x3

    .line 2006
    .line 2007
    aget-char v3, v27, v5

    .line 2008
    .line 2009
    and-int/lit16 v4, v0, 0xff

    .line 2010
    .line 2011
    if-ne v4, v0, :cond_e

    .line 2012
    .line 2013
    and-int/lit16 v4, v1, 0xff

    .line 2014
    .line 2015
    if-ne v4, v1, :cond_e

    .line 2016
    .line 2017
    and-int/lit16 v4, v2, 0xff

    .line 2018
    .line 2019
    if-ne v4, v2, :cond_e

    .line 2020
    .line 2021
    and-int/lit16 v4, v3, 0xff

    .line 2022
    .line 2023
    if-ne v4, v3, :cond_e

    .line 2024
    .line 2025
    shl-int/lit8 v3, v3, 0x18

    .line 2026
    .line 2027
    shl-int/lit8 v2, v2, 0x10

    .line 2028
    .line 2029
    add-int/2addr v3, v2

    .line 2030
    shl-int/lit8 v1, v1, 0x8

    .line 2031
    .line 2032
    add-int/2addr v3, v1

    .line 2033
    add-int/2addr v3, v0

    .line 2034
    int-to-long v10, v3

    .line 2035
    goto/16 :goto_a

    .line 2036
    .line 2037
    :pswitch_d
    move/from16 v28, v1

    .line 2038
    .line 2039
    move-object/from16 v27, v2

    .line 2040
    .line 2041
    move/from16 v29, v5

    .line 2042
    .line 2043
    move/from16 v21, v9

    .line 2044
    .line 2045
    move/from16 v22, v10

    .line 2046
    .line 2047
    const-wide/16 v18, -0x1

    .line 2048
    .line 2049
    const/16 v25, 0x10

    .line 2050
    .line 2051
    const/16 v26, 0x8

    .line 2052
    .line 2053
    aget-char v0, v27, v29

    .line 2054
    .line 2055
    add-int/lit8 v5, v29, 0x1

    .line 2056
    .line 2057
    aget-char v1, v27, v5

    .line 2058
    .line 2059
    add-int/lit8 v5, v29, 0x2

    .line 2060
    .line 2061
    aget-char v2, v27, v5

    .line 2062
    .line 2063
    and-int/lit16 v3, v0, 0xff

    .line 2064
    .line 2065
    if-ne v3, v0, :cond_e

    .line 2066
    .line 2067
    and-int/lit16 v3, v1, 0xff

    .line 2068
    .line 2069
    if-ne v3, v1, :cond_e

    .line 2070
    .line 2071
    and-int/lit16 v3, v2, 0xff

    .line 2072
    .line 2073
    if-ne v3, v2, :cond_e

    .line 2074
    .line 2075
    shl-int/lit8 v2, v2, 0x10

    .line 2076
    .line 2077
    shl-int/lit8 v1, v1, 0x8

    .line 2078
    .line 2079
    add-int/2addr v2, v1

    .line 2080
    add-int/2addr v2, v0

    .line 2081
    int-to-long v10, v2

    .line 2082
    goto/16 :goto_a

    .line 2083
    .line 2084
    :pswitch_e
    move/from16 v28, v1

    .line 2085
    .line 2086
    move-object/from16 v27, v2

    .line 2087
    .line 2088
    move/from16 v29, v5

    .line 2089
    .line 2090
    move/from16 v21, v9

    .line 2091
    .line 2092
    move/from16 v22, v10

    .line 2093
    .line 2094
    const-wide/16 v18, -0x1

    .line 2095
    .line 2096
    const/16 v26, 0x8

    .line 2097
    .line 2098
    aget-char v0, v27, v29

    .line 2099
    .line 2100
    add-int/lit8 v5, v29, 0x1

    .line 2101
    .line 2102
    aget-char v1, v27, v5

    .line 2103
    .line 2104
    and-int/lit16 v2, v0, 0xff

    .line 2105
    .line 2106
    if-ne v2, v0, :cond_e

    .line 2107
    .line 2108
    and-int/lit16 v2, v1, 0xff

    .line 2109
    .line 2110
    if-ne v2, v1, :cond_e

    .line 2111
    .line 2112
    shl-int/lit8 v1, v1, 0x8

    .line 2113
    .line 2114
    add-int/2addr v1, v0

    .line 2115
    int-to-long v10, v1

    .line 2116
    goto/16 :goto_a

    .line 2117
    .line 2118
    :pswitch_f
    move/from16 v28, v1

    .line 2119
    .line 2120
    move-object/from16 v27, v2

    .line 2121
    .line 2122
    move/from16 v29, v5

    .line 2123
    .line 2124
    move/from16 v21, v9

    .line 2125
    .line 2126
    move/from16 v22, v10

    .line 2127
    .line 2128
    const-wide/16 v18, -0x1

    .line 2129
    .line 2130
    aget-char v0, v27, v29

    .line 2131
    .line 2132
    and-int/lit16 v1, v0, 0xff

    .line 2133
    .line 2134
    if-ne v1, v0, :cond_e

    .line 2135
    .line 2136
    int-to-long v10, v0

    .line 2137
    goto/16 :goto_a

    .line 2138
    .line 2139
    :cond_e
    :goto_b
    move-wide/from16 v2, v18

    .line 2140
    .line 2141
    move-wide v4, v2

    .line 2142
    :goto_c
    cmp-long v0, v2, v18

    .line 2143
    .line 2144
    if-eqz v0, :cond_14

    .line 2145
    .line 2146
    cmp-long v0, v4, v18

    .line 2147
    .line 2148
    if-eqz v0, :cond_11

    .line 2149
    .line 2150
    xor-long v0, v2, v4

    .line 2151
    .line 2152
    ushr-long v6, v0, v21

    .line 2153
    .line 2154
    xor-long/2addr v0, v6

    .line 2155
    long-to-int v0, v0

    .line 2156
    sget-object v6, Lcom/alibaba/fastjson2/JSONFactory;->NAME_CACHE2:[Lcom/alibaba/fastjson2/JSONFactory$NameCacheEntry2;

    .line 2157
    .line 2158
    array-length v1, v6

    .line 2159
    add-int/lit8 v1, v1, -0x1

    .line 2160
    .line 2161
    and-int v7, v0, v1

    .line 2162
    .line 2163
    aget-object v0, v6, v7

    .line 2164
    .line 2165
    if-nez v0, :cond_10

    .line 2166
    .line 2167
    move-object/from16 v9, p0

    .line 2168
    .line 2169
    iget-object v0, v9, Lcom/alibaba/fastjson2/JSONReaderUTF16;->str:Ljava/lang/String;

    .line 2170
    .line 2171
    if-eqz v0, :cond_f

    .line 2172
    .line 2173
    move/from16 v8, v28

    .line 2174
    .line 2175
    move/from16 v1, v29

    .line 2176
    .line 2177
    invoke-virtual {v0, v1, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 2178
    .line 2179
    .line 2180
    move-result-object v0

    .line 2181
    :goto_d
    move-object v1, v0

    .line 2182
    goto :goto_e

    .line 2183
    :cond_f
    move/from16 v8, v28

    .line 2184
    .line 2185
    move/from16 v1, v29

    .line 2186
    .line 2187
    new-instance v0, Ljava/lang/String;

    .line 2188
    .line 2189
    sub-int/2addr v8, v1

    .line 2190
    move-object/from16 v10, v27

    .line 2191
    .line 2192
    invoke-direct {v0, v10, v1, v8}, Ljava/lang/String;-><init>([CII)V

    .line 2193
    .line 2194
    .line 2195
    goto :goto_d

    .line 2196
    :goto_e
    new-instance v0, Lcom/alibaba/fastjson2/JSONFactory$NameCacheEntry2;

    .line 2197
    .line 2198
    invoke-direct/range {v0 .. v5}, Lcom/alibaba/fastjson2/JSONFactory$NameCacheEntry2;-><init>(Ljava/lang/String;JJ)V

    .line 2199
    .line 2200
    .line 2201
    aput-object v0, v6, v7

    .line 2202
    .line 2203
    return-object v1

    .line 2204
    :cond_10
    move-object/from16 v9, p0

    .line 2205
    .line 2206
    move-object/from16 v10, v27

    .line 2207
    .line 2208
    move/from16 v8, v28

    .line 2209
    .line 2210
    move/from16 v1, v29

    .line 2211
    .line 2212
    iget-wide v6, v0, Lcom/alibaba/fastjson2/JSONFactory$NameCacheEntry2;->value0:J

    .line 2213
    .line 2214
    cmp-long v2, v6, v2

    .line 2215
    .line 2216
    if-nez v2, :cond_15

    .line 2217
    .line 2218
    iget-wide v2, v0, Lcom/alibaba/fastjson2/JSONFactory$NameCacheEntry2;->value1:J

    .line 2219
    .line 2220
    cmp-long v2, v2, v4

    .line 2221
    .line 2222
    if-nez v2, :cond_15

    .line 2223
    .line 2224
    iget-object v0, v0, Lcom/alibaba/fastjson2/JSONFactory$NameCacheEntry2;->name:Ljava/lang/String;

    .line 2225
    .line 2226
    return-object v0

    .line 2227
    :cond_11
    move-object/from16 v9, p0

    .line 2228
    .line 2229
    move-object/from16 v10, v27

    .line 2230
    .line 2231
    move/from16 v8, v28

    .line 2232
    .line 2233
    move/from16 v1, v29

    .line 2234
    .line 2235
    ushr-long v4, v2, v21

    .line 2236
    .line 2237
    xor-long/2addr v4, v2

    .line 2238
    long-to-int v0, v4

    .line 2239
    sget-object v4, Lcom/alibaba/fastjson2/JSONFactory;->NAME_CACHE:[Lcom/alibaba/fastjson2/util/NameCacheEntry;

    .line 2240
    .line 2241
    array-length v5, v4

    .line 2242
    add-int/lit8 v5, v5, -0x1

    .line 2243
    .line 2244
    and-int/2addr v0, v5

    .line 2245
    aget-object v5, v4, v0

    .line 2246
    .line 2247
    if-nez v5, :cond_13

    .line 2248
    .line 2249
    iget-object v5, v9, Lcom/alibaba/fastjson2/JSONReaderUTF16;->str:Ljava/lang/String;

    .line 2250
    .line 2251
    if-eqz v5, :cond_12

    .line 2252
    .line 2253
    invoke-virtual {v5, v1, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 2254
    .line 2255
    .line 2256
    move-result-object v1

    .line 2257
    goto :goto_f

    .line 2258
    :cond_12
    new-instance v5, Ljava/lang/String;

    .line 2259
    .line 2260
    sub-int v6, v8, v1

    .line 2261
    .line 2262
    invoke-direct {v5, v10, v1, v6}, Ljava/lang/String;-><init>([CII)V

    .line 2263
    .line 2264
    .line 2265
    move-object v1, v5

    .line 2266
    :goto_f
    new-instance v5, Lcom/alibaba/fastjson2/util/NameCacheEntry;

    .line 2267
    .line 2268
    invoke-direct {v5, v1, v2, v3}, Lcom/alibaba/fastjson2/util/NameCacheEntry;-><init>(Ljava/lang/String;J)V

    .line 2269
    .line 2270
    .line 2271
    aput-object v5, v4, v0

    .line 2272
    .line 2273
    return-object v1

    .line 2274
    :cond_13
    iget-wide v6, v5, Lcom/alibaba/fastjson2/util/NameCacheEntry;->value:J

    .line 2275
    .line 2276
    cmp-long v0, v6, v2

    .line 2277
    .line 2278
    if-nez v0, :cond_15

    .line 2279
    .line 2280
    iget-object v0, v5, Lcom/alibaba/fastjson2/util/NameCacheEntry;->name:Ljava/lang/String;

    .line 2281
    .line 2282
    return-object v0

    .line 2283
    :cond_14
    move-object/from16 v9, p0

    .line 2284
    .line 2285
    move-object/from16 v10, v27

    .line 2286
    .line 2287
    move/from16 v8, v28

    .line 2288
    .line 2289
    move/from16 v1, v29

    .line 2290
    .line 2291
    :cond_15
    iget-object v0, v9, Lcom/alibaba/fastjson2/JSONReaderUTF16;->str:Ljava/lang/String;

    .line 2292
    .line 2293
    if-eqz v0, :cond_16

    .line 2294
    .line 2295
    invoke-virtual {v0, v1, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 2296
    .line 2297
    .line 2298
    move-result-object v0

    .line 2299
    return-object v0

    .line 2300
    :cond_16
    new-instance v0, Ljava/lang/String;

    .line 2301
    .line 2302
    sub-int v2, v8, v1

    .line 2303
    .line 2304
    invoke-direct {v0, v10, v1, v2}, Ljava/lang/String;-><init>([CII)V

    .line 2305
    .line 2306
    .line 2307
    return-object v0

    .line 2308
    :cond_17
    move-object v9, v0

    .line 2309
    invoke-virtual {v9}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getFieldName()Ljava/lang/String;

    .line 2310
    .line 2311
    .line 2312
    move-result-object v0

    .line 2313
    return-object v0

    .line 2314
    :cond_18
    move-object v9, v0

    .line 2315
    const-string v0, "syntax error : "

    .line 2316
    .line 2317
    invoke-static {v8, v0}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 2318
    .line 2319
    .line 2320
    move-result-object v0

    .line 2321
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 2322
    .line 2323
    .line 2324
    const/4 v0, 0x0

    .line 2325
    return-object v0

    .line 2326
    nop

    .line 2327
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public readFieldNameHashCode()J
    .locals 35

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 4
    .line 5
    iget-char v2, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 6
    .line 7
    const/16 v3, 0x2f

    .line 8
    .line 9
    if-ne v2, v3, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->skipComment()V

    .line 12
    .line 13
    .line 14
    iget-char v2, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 15
    .line 16
    :cond_0
    const/16 v3, 0x27

    .line 17
    .line 18
    const-wide/16 v4, 0x0

    .line 19
    .line 20
    if-ne v2, v3, :cond_2

    .line 21
    .line 22
    iget-object v6, v0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 23
    .line 24
    iget-wide v6, v6, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 25
    .line 26
    sget-object v8, Lcom/alibaba/fastjson2/JSONReader$Feature;->DisableSingleQuote:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 27
    .line 28
    iget-wide v8, v8, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 29
    .line 30
    and-long/2addr v6, v8

    .line 31
    cmp-long v6, v6, v4

    .line 32
    .line 33
    if-nez v6, :cond_1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReader;->notSupportName()Lcom/alibaba/fastjson2/JSONException;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    throw v1

    .line 41
    :cond_2
    :goto_0
    const/16 v6, 0x22

    .line 42
    .line 43
    if-eq v2, v6, :cond_7

    .line 44
    .line 45
    if-eq v2, v3, :cond_7

    .line 46
    .line 47
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 48
    .line 49
    iget-wide v6, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 50
    .line 51
    sget-object v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->AllowUnQuotedFieldNames:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 52
    .line 53
    iget-wide v8, v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 54
    .line 55
    and-long/2addr v6, v8

    .line 56
    cmp-long v1, v6, v4

    .line 57
    .line 58
    if-eqz v1, :cond_3

    .line 59
    .line 60
    invoke-static {v2}, Lcom/alibaba/fastjson2/JSONReader;->isFirstIdentifier(I)Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-eqz v1, :cond_3

    .line 65
    .line 66
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->readFieldNameHashCodeUnquote()J

    .line 67
    .line 68
    .line 69
    move-result-wide v1

    .line 70
    return-wide v1

    .line 71
    :cond_3
    const/16 v1, 0x7d

    .line 72
    .line 73
    if-eq v2, v1, :cond_6

    .line 74
    .line 75
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->isNull()Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-eqz v1, :cond_4

    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_4
    const/16 v1, 0x5b

    .line 83
    .line 84
    if-ne v2, v1, :cond_5

    .line 85
    .line 86
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->nameBegin:I

    .line 87
    .line 88
    if-lez v1, :cond_5

    .line 89
    .line 90
    new-instance v1, Ljava/lang/StringBuilder;

    .line 91
    .line 92
    const-string v3, "illegal fieldName input "

    .line 93
    .line 94
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    const-string v2, ", previous fieldName "

    .line 101
    .line 102
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->getFieldName()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    goto :goto_1

    .line 117
    :cond_5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 118
    .line 119
    const-string v3, "illegal fieldName input"

    .line 120
    .line 121
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    :goto_1
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    invoke-static {v1}, Lah/a;->w(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    :goto_2
    const-wide/16 v1, 0x0

    .line 139
    .line 140
    return-wide v1

    .line 141
    :cond_6
    :goto_3
    const-wide/16 v1, -0x1

    .line 142
    .line 143
    return-wide v1

    .line 144
    :cond_7
    const/4 v3, 0x0

    .line 145
    iput-object v3, v0, Lcom/alibaba/fastjson2/JSONReader;->stringValue:Ljava/lang/String;

    .line 146
    .line 147
    const/4 v3, 0x0

    .line 148
    iput-boolean v3, v0, Lcom/alibaba/fastjson2/JSONReader;->nameEscape:Z

    .line 149
    .line 150
    iget v6, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 151
    .line 152
    iput v6, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->nameBegin:I

    .line 153
    .line 154
    iget v7, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 155
    .line 156
    add-int/lit8 v8, v6, 0x9

    .line 157
    .line 158
    move-wide/from16 v16, v4

    .line 159
    .line 160
    if-ge v8, v7, :cond_12

    .line 161
    .line 162
    const/16 v18, 0x38

    .line 163
    .line 164
    aget-char v9, v1, v6

    .line 165
    .line 166
    const/16 v19, 0x30

    .line 167
    .line 168
    add-int/lit8 v10, v6, 0x1

    .line 169
    .line 170
    const/16 v20, 0x28

    .line 171
    .line 172
    aget-char v11, v1, v10

    .line 173
    .line 174
    const/16 v21, 0x18

    .line 175
    .line 176
    add-int/lit8 v12, v6, 0x2

    .line 177
    .line 178
    const/16 v22, 0x10

    .line 179
    .line 180
    aget-char v14, v1, v12

    .line 181
    .line 182
    const/16 v23, 0x20

    .line 183
    .line 184
    add-int/lit8 v13, v6, 0x3

    .line 185
    .line 186
    const/16 v24, 0x8

    .line 187
    .line 188
    aget-char v15, v1, v13

    .line 189
    .line 190
    add-int/lit8 v3, v6, 0x4

    .line 191
    .line 192
    aget-char v4, v1, v3

    .line 193
    .line 194
    add-int/lit8 v5, v6, 0x5

    .line 195
    .line 196
    move-object/from16 v26, v1

    .line 197
    .line 198
    aget-char v1, v26, v5

    .line 199
    .line 200
    move/from16 v27, v6

    .line 201
    .line 202
    add-int/lit8 v6, v27, 0x6

    .line 203
    .line 204
    move/from16 v28, v8

    .line 205
    .line 206
    aget-char v8, v26, v6

    .line 207
    .line 208
    move/from16 v29, v7

    .line 209
    .line 210
    add-int/lit8 v7, v27, 0x7

    .line 211
    .line 212
    move/from16 v30, v7

    .line 213
    .line 214
    aget-char v7, v26, v30

    .line 215
    .line 216
    move/from16 v31, v7

    .line 217
    .line 218
    add-int/lit8 v7, v27, 0x8

    .line 219
    .line 220
    move/from16 v32, v7

    .line 221
    .line 222
    aget-char v7, v26, v32

    .line 223
    .line 224
    if-ne v9, v2, :cond_9

    .line 225
    .line 226
    :cond_8
    :goto_4
    move-wide/from16 v3, v16

    .line 227
    .line 228
    move/from16 v6, v27

    .line 229
    .line 230
    goto/16 :goto_5

    .line 231
    .line 232
    :cond_9
    if-ne v11, v2, :cond_a

    .line 233
    .line 234
    if-eqz v9, :cond_a

    .line 235
    .line 236
    move/from16 v33, v7

    .line 237
    .line 238
    const/16 v7, 0x5c

    .line 239
    .line 240
    if-eq v9, v7, :cond_b

    .line 241
    .line 242
    const/16 v7, 0xff

    .line 243
    .line 244
    if-gt v9, v7, :cond_b

    .line 245
    .line 246
    int-to-byte v1, v9

    .line 247
    int-to-long v3, v1

    .line 248
    const/4 v1, 0x1

    .line 249
    iput v1, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->nameLength:I

    .line 250
    .line 251
    iput v10, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->nameEnd:I

    .line 252
    .line 253
    move v6, v12

    .line 254
    goto/16 :goto_5

    .line 255
    .line 256
    :cond_a
    move/from16 v33, v7

    .line 257
    .line 258
    :cond_b
    if-ne v14, v2, :cond_c

    .line 259
    .line 260
    if-eqz v9, :cond_c

    .line 261
    .line 262
    const/16 v7, 0x5c

    .line 263
    .line 264
    if-eq v9, v7, :cond_c

    .line 265
    .line 266
    if-eq v11, v7, :cond_c

    .line 267
    .line 268
    const/16 v7, 0xff

    .line 269
    .line 270
    if-gt v9, v7, :cond_c

    .line 271
    .line 272
    if-gt v11, v7, :cond_c

    .line 273
    .line 274
    int-to-byte v1, v11

    .line 275
    shl-int/lit8 v1, v1, 0x8

    .line 276
    .line 277
    add-int/2addr v1, v9

    .line 278
    int-to-long v3, v1

    .line 279
    const/4 v1, 0x2

    .line 280
    iput v1, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->nameLength:I

    .line 281
    .line 282
    iput v12, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->nameEnd:I

    .line 283
    .line 284
    move v6, v13

    .line 285
    goto/16 :goto_5

    .line 286
    .line 287
    :cond_c
    if-ne v15, v2, :cond_d

    .line 288
    .line 289
    if-eqz v9, :cond_d

    .line 290
    .line 291
    const/16 v7, 0x5c

    .line 292
    .line 293
    if-eq v9, v7, :cond_d

    .line 294
    .line 295
    if-eq v11, v7, :cond_d

    .line 296
    .line 297
    if-eq v14, v7, :cond_d

    .line 298
    .line 299
    const/16 v7, 0xff

    .line 300
    .line 301
    if-gt v9, v7, :cond_d

    .line 302
    .line 303
    if-gt v11, v7, :cond_d

    .line 304
    .line 305
    if-gt v14, v7, :cond_d

    .line 306
    .line 307
    int-to-byte v1, v14

    .line 308
    shl-int/lit8 v1, v1, 0x10

    .line 309
    .line 310
    shl-int/lit8 v4, v11, 0x8

    .line 311
    .line 312
    add-int/2addr v1, v4

    .line 313
    add-int/2addr v1, v9

    .line 314
    int-to-long v4, v1

    .line 315
    const/4 v1, 0x3

    .line 316
    iput v1, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->nameLength:I

    .line 317
    .line 318
    iput v13, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->nameEnd:I

    .line 319
    .line 320
    move v6, v3

    .line 321
    move-wide v3, v4

    .line 322
    goto/16 :goto_5

    .line 323
    .line 324
    :cond_d
    if-ne v4, v2, :cond_e

    .line 325
    .line 326
    if-eqz v9, :cond_e

    .line 327
    .line 328
    const/16 v7, 0x5c

    .line 329
    .line 330
    if-eq v9, v7, :cond_e

    .line 331
    .line 332
    if-eq v11, v7, :cond_e

    .line 333
    .line 334
    if-eq v14, v7, :cond_e

    .line 335
    .line 336
    if-eq v15, v7, :cond_e

    .line 337
    .line 338
    const/16 v7, 0xff

    .line 339
    .line 340
    if-gt v9, v7, :cond_e

    .line 341
    .line 342
    if-gt v11, v7, :cond_e

    .line 343
    .line 344
    if-gt v14, v7, :cond_e

    .line 345
    .line 346
    if-gt v15, v7, :cond_e

    .line 347
    .line 348
    int-to-byte v1, v15

    .line 349
    shl-int/lit8 v1, v1, 0x18

    .line 350
    .line 351
    shl-int/lit8 v4, v14, 0x10

    .line 352
    .line 353
    add-int/2addr v1, v4

    .line 354
    shl-int/lit8 v4, v11, 0x8

    .line 355
    .line 356
    add-int/2addr v1, v4

    .line 357
    add-int/2addr v1, v9

    .line 358
    int-to-long v6, v1

    .line 359
    const/4 v1, 0x4

    .line 360
    iput v1, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->nameLength:I

    .line 361
    .line 362
    iput v3, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->nameEnd:I

    .line 363
    .line 364
    move-wide v3, v6

    .line 365
    move v6, v5

    .line 366
    goto/16 :goto_5

    .line 367
    .line 368
    :cond_e
    if-ne v1, v2, :cond_f

    .line 369
    .line 370
    if-eqz v9, :cond_f

    .line 371
    .line 372
    const/16 v7, 0x5c

    .line 373
    .line 374
    if-eq v9, v7, :cond_f

    .line 375
    .line 376
    if-eq v11, v7, :cond_f

    .line 377
    .line 378
    if-eq v14, v7, :cond_f

    .line 379
    .line 380
    if-eq v15, v7, :cond_f

    .line 381
    .line 382
    if-eq v4, v7, :cond_f

    .line 383
    .line 384
    const/16 v7, 0xff

    .line 385
    .line 386
    if-gt v9, v7, :cond_f

    .line 387
    .line 388
    if-gt v11, v7, :cond_f

    .line 389
    .line 390
    if-gt v14, v7, :cond_f

    .line 391
    .line 392
    if-gt v15, v7, :cond_f

    .line 393
    .line 394
    if-gt v4, v7, :cond_f

    .line 395
    .line 396
    int-to-byte v1, v4

    .line 397
    int-to-long v3, v1

    .line 398
    shl-long v3, v3, v23

    .line 399
    .line 400
    int-to-long v7, v15

    .line 401
    shl-long v7, v7, v21

    .line 402
    .line 403
    add-long/2addr v3, v7

    .line 404
    int-to-long v7, v14

    .line 405
    shl-long v7, v7, v22

    .line 406
    .line 407
    add-long/2addr v3, v7

    .line 408
    int-to-long v7, v11

    .line 409
    shl-long v7, v7, v24

    .line 410
    .line 411
    add-long/2addr v3, v7

    .line 412
    int-to-long v7, v9

    .line 413
    add-long/2addr v3, v7

    .line 414
    const/4 v1, 0x5

    .line 415
    iput v1, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->nameLength:I

    .line 416
    .line 417
    iput v5, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->nameEnd:I

    .line 418
    .line 419
    goto/16 :goto_5

    .line 420
    .line 421
    :cond_f
    if-ne v8, v2, :cond_10

    .line 422
    .line 423
    if-eqz v9, :cond_10

    .line 424
    .line 425
    const/16 v7, 0x5c

    .line 426
    .line 427
    if-eq v9, v7, :cond_10

    .line 428
    .line 429
    if-eq v11, v7, :cond_10

    .line 430
    .line 431
    if-eq v14, v7, :cond_10

    .line 432
    .line 433
    if-eq v15, v7, :cond_10

    .line 434
    .line 435
    if-eq v4, v7, :cond_10

    .line 436
    .line 437
    if-eq v1, v7, :cond_10

    .line 438
    .line 439
    const/16 v7, 0xff

    .line 440
    .line 441
    if-gt v9, v7, :cond_10

    .line 442
    .line 443
    if-gt v11, v7, :cond_10

    .line 444
    .line 445
    if-gt v14, v7, :cond_10

    .line 446
    .line 447
    if-gt v15, v7, :cond_10

    .line 448
    .line 449
    if-gt v4, v7, :cond_10

    .line 450
    .line 451
    if-gt v1, v7, :cond_10

    .line 452
    .line 453
    int-to-byte v1, v1

    .line 454
    int-to-long v7, v1

    .line 455
    shl-long v7, v7, v20

    .line 456
    .line 457
    int-to-long v3, v4

    .line 458
    shl-long v3, v3, v23

    .line 459
    .line 460
    add-long/2addr v7, v3

    .line 461
    int-to-long v3, v15

    .line 462
    shl-long v3, v3, v21

    .line 463
    .line 464
    add-long/2addr v7, v3

    .line 465
    int-to-long v3, v14

    .line 466
    shl-long v3, v3, v22

    .line 467
    .line 468
    add-long/2addr v7, v3

    .line 469
    int-to-long v3, v11

    .line 470
    shl-long v3, v3, v24

    .line 471
    .line 472
    add-long/2addr v7, v3

    .line 473
    int-to-long v3, v9

    .line 474
    add-long/2addr v3, v7

    .line 475
    const/4 v1, 0x6

    .line 476
    iput v1, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->nameLength:I

    .line 477
    .line 478
    iput v6, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->nameEnd:I

    .line 479
    .line 480
    move/from16 v6, v30

    .line 481
    .line 482
    goto/16 :goto_5

    .line 483
    .line 484
    :cond_10
    move/from16 v3, v31

    .line 485
    .line 486
    if-ne v3, v2, :cond_11

    .line 487
    .line 488
    if-eqz v9, :cond_11

    .line 489
    .line 490
    const/16 v7, 0x5c

    .line 491
    .line 492
    if-eq v9, v7, :cond_11

    .line 493
    .line 494
    if-eq v11, v7, :cond_11

    .line 495
    .line 496
    if-eq v14, v7, :cond_11

    .line 497
    .line 498
    if-eq v15, v7, :cond_11

    .line 499
    .line 500
    if-eq v4, v7, :cond_11

    .line 501
    .line 502
    if-eq v1, v7, :cond_11

    .line 503
    .line 504
    if-eq v8, v7, :cond_11

    .line 505
    .line 506
    const/16 v7, 0xff

    .line 507
    .line 508
    if-gt v9, v7, :cond_11

    .line 509
    .line 510
    if-gt v11, v7, :cond_11

    .line 511
    .line 512
    if-gt v14, v7, :cond_11

    .line 513
    .line 514
    if-gt v15, v7, :cond_11

    .line 515
    .line 516
    if-gt v4, v7, :cond_11

    .line 517
    .line 518
    if-gt v1, v7, :cond_11

    .line 519
    .line 520
    if-gt v8, v7, :cond_11

    .line 521
    .line 522
    int-to-byte v3, v8

    .line 523
    int-to-long v5, v3

    .line 524
    shl-long v5, v5, v19

    .line 525
    .line 526
    int-to-long v7, v1

    .line 527
    shl-long v7, v7, v20

    .line 528
    .line 529
    add-long/2addr v5, v7

    .line 530
    int-to-long v3, v4

    .line 531
    shl-long v3, v3, v23

    .line 532
    .line 533
    add-long/2addr v5, v3

    .line 534
    int-to-long v3, v15

    .line 535
    shl-long v3, v3, v21

    .line 536
    .line 537
    add-long/2addr v5, v3

    .line 538
    int-to-long v3, v14

    .line 539
    shl-long v3, v3, v22

    .line 540
    .line 541
    add-long/2addr v5, v3

    .line 542
    int-to-long v3, v11

    .line 543
    shl-long v3, v3, v24

    .line 544
    .line 545
    add-long/2addr v5, v3

    .line 546
    int-to-long v3, v9

    .line 547
    add-long/2addr v3, v5

    .line 548
    const/4 v1, 0x7

    .line 549
    iput v1, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->nameLength:I

    .line 550
    .line 551
    move/from16 v6, v30

    .line 552
    .line 553
    iput v6, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->nameEnd:I

    .line 554
    .line 555
    move/from16 v6, v32

    .line 556
    .line 557
    goto/16 :goto_5

    .line 558
    .line 559
    :cond_11
    move/from16 v5, v33

    .line 560
    .line 561
    if-ne v5, v2, :cond_8

    .line 562
    .line 563
    if-eqz v9, :cond_8

    .line 564
    .line 565
    const/16 v7, 0x5c

    .line 566
    .line 567
    if-eq v9, v7, :cond_8

    .line 568
    .line 569
    if-eq v11, v7, :cond_8

    .line 570
    .line 571
    if-eq v14, v7, :cond_8

    .line 572
    .line 573
    if-eq v15, v7, :cond_8

    .line 574
    .line 575
    if-eq v4, v7, :cond_8

    .line 576
    .line 577
    if-eq v1, v7, :cond_8

    .line 578
    .line 579
    if-eq v8, v7, :cond_8

    .line 580
    .line 581
    if-eq v3, v7, :cond_8

    .line 582
    .line 583
    const/16 v7, 0xff

    .line 584
    .line 585
    if-gt v9, v7, :cond_8

    .line 586
    .line 587
    if-gt v11, v7, :cond_8

    .line 588
    .line 589
    if-gt v14, v7, :cond_8

    .line 590
    .line 591
    if-gt v15, v7, :cond_8

    .line 592
    .line 593
    if-gt v4, v7, :cond_8

    .line 594
    .line 595
    if-gt v1, v7, :cond_8

    .line 596
    .line 597
    if-gt v8, v7, :cond_8

    .line 598
    .line 599
    if-gt v3, v7, :cond_8

    .line 600
    .line 601
    int-to-byte v3, v3

    .line 602
    int-to-long v5, v3

    .line 603
    shl-long v5, v5, v18

    .line 604
    .line 605
    int-to-long v7, v8

    .line 606
    shl-long v7, v7, v19

    .line 607
    .line 608
    add-long/2addr v5, v7

    .line 609
    int-to-long v7, v1

    .line 610
    shl-long v7, v7, v20

    .line 611
    .line 612
    add-long/2addr v5, v7

    .line 613
    int-to-long v3, v4

    .line 614
    shl-long v3, v3, v23

    .line 615
    .line 616
    add-long/2addr v5, v3

    .line 617
    int-to-long v3, v15

    .line 618
    shl-long v3, v3, v21

    .line 619
    .line 620
    add-long/2addr v5, v3

    .line 621
    int-to-long v3, v14

    .line 622
    shl-long v3, v3, v22

    .line 623
    .line 624
    add-long/2addr v5, v3

    .line 625
    int-to-long v3, v11

    .line 626
    shl-long v3, v3, v24

    .line 627
    .line 628
    add-long/2addr v5, v3

    .line 629
    int-to-long v3, v9

    .line 630
    add-long/2addr v3, v5

    .line 631
    move/from16 v1, v24

    .line 632
    .line 633
    iput v1, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->nameLength:I

    .line 634
    .line 635
    move/from16 v6, v32

    .line 636
    .line 637
    iput v6, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->nameEnd:I

    .line 638
    .line 639
    move/from16 v6, v28

    .line 640
    .line 641
    goto :goto_5

    .line 642
    :cond_12
    move-object/from16 v26, v1

    .line 643
    .line 644
    move/from16 v27, v6

    .line 645
    .line 646
    move/from16 v29, v7

    .line 647
    .line 648
    const/16 v18, 0x38

    .line 649
    .line 650
    const/16 v19, 0x30

    .line 651
    .line 652
    const/16 v20, 0x28

    .line 653
    .line 654
    const/16 v21, 0x18

    .line 655
    .line 656
    const/16 v22, 0x10

    .line 657
    .line 658
    const/16 v23, 0x20

    .line 659
    .line 660
    goto/16 :goto_4

    .line 661
    .line 662
    :goto_5
    cmp-long v1, v3, v16

    .line 663
    .line 664
    const/16 v5, 0x78

    .line 665
    .line 666
    const/16 v7, 0x75

    .line 667
    .line 668
    if-nez v1, :cond_1a

    .line 669
    .line 670
    move/from16 v1, v29

    .line 671
    .line 672
    const/4 v8, 0x0

    .line 673
    :goto_6
    if-ge v6, v1, :cond_1b

    .line 674
    .line 675
    aget-char v9, v26, v6

    .line 676
    .line 677
    if-ne v9, v2, :cond_14

    .line 678
    .line 679
    if-nez v8, :cond_13

    .line 680
    .line 681
    iget v6, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->nameBegin:I

    .line 682
    .line 683
    goto/16 :goto_e

    .line 684
    .line 685
    :cond_13
    iput v8, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->nameLength:I

    .line 686
    .line 687
    iput v6, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->nameEnd:I

    .line 688
    .line 689
    add-int/lit8 v6, v6, 0x1

    .line 690
    .line 691
    goto/16 :goto_e

    .line 692
    .line 693
    :cond_14
    const/16 v10, 0x5c

    .line 694
    .line 695
    if-ne v9, v10, :cond_15

    .line 696
    .line 697
    const/4 v10, 0x1

    .line 698
    iput-boolean v10, v0, Lcom/alibaba/fastjson2/JSONReader;->nameEscape:Z

    .line 699
    .line 700
    add-int/lit8 v9, v6, 0x1

    .line 701
    .line 702
    aget-char v10, v26, v9

    .line 703
    .line 704
    if-eq v10, v7, :cond_17

    .line 705
    .line 706
    if-eq v10, v5, :cond_16

    .line 707
    .line 708
    invoke-virtual {v0, v10}, Lcom/alibaba/fastjson2/JSONReader;->char1(I)C

    .line 709
    .line 710
    .line 711
    move-result v6

    .line 712
    move v10, v9

    .line 713
    move v9, v6

    .line 714
    move v6, v10

    .line 715
    :cond_15
    :goto_7
    const/16 v10, 0xff

    .line 716
    .line 717
    goto :goto_8

    .line 718
    :cond_16
    add-int/lit8 v9, v6, 0x2

    .line 719
    .line 720
    aget-char v9, v26, v9

    .line 721
    .line 722
    add-int/lit8 v6, v6, 0x3

    .line 723
    .line 724
    aget-char v10, v26, v6

    .line 725
    .line 726
    invoke-static {v9, v10}, Lcom/alibaba/fastjson2/JSONReader;->char2(II)C

    .line 727
    .line 728
    .line 729
    move-result v9

    .line 730
    goto :goto_7

    .line 731
    :cond_17
    add-int/lit8 v9, v6, 0x2

    .line 732
    .line 733
    aget-char v9, v26, v9

    .line 734
    .line 735
    add-int/lit8 v10, v6, 0x3

    .line 736
    .line 737
    aget-char v10, v26, v10

    .line 738
    .line 739
    add-int/lit8 v11, v6, 0x4

    .line 740
    .line 741
    aget-char v11, v26, v11

    .line 742
    .line 743
    add-int/lit8 v6, v6, 0x5

    .line 744
    .line 745
    aget-char v12, v26, v6

    .line 746
    .line 747
    invoke-static {v9, v10, v11, v12}, Lcom/alibaba/fastjson2/JSONReader;->char4(IIII)C

    .line 748
    .line 749
    .line 750
    move-result v9

    .line 751
    goto :goto_7

    .line 752
    :goto_8
    if-gt v9, v10, :cond_19

    .line 753
    .line 754
    const/16 v11, 0x8

    .line 755
    .line 756
    if-ge v8, v11, :cond_19

    .line 757
    .line 758
    if-nez v8, :cond_18

    .line 759
    .line 760
    if-nez v9, :cond_18

    .line 761
    .line 762
    goto :goto_d

    .line 763
    :cond_18
    packed-switch v8, :pswitch_data_0

    .line 764
    .line 765
    .line 766
    :goto_9
    const/16 v24, 0x8

    .line 767
    .line 768
    :goto_a
    const/16 v25, 0x1

    .line 769
    .line 770
    goto :goto_c

    .line 771
    :pswitch_0
    int-to-byte v9, v9

    .line 772
    int-to-long v11, v9

    .line 773
    shl-long v11, v11, v18

    .line 774
    .line 775
    const-wide v13, 0xffffffffffffffL

    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    :goto_b
    and-long/2addr v3, v13

    .line 781
    add-long/2addr v11, v3

    .line 782
    move-wide v3, v11

    .line 783
    goto :goto_9

    .line 784
    :pswitch_1
    int-to-byte v9, v9

    .line 785
    int-to-long v11, v9

    .line 786
    shl-long v11, v11, v19

    .line 787
    .line 788
    const-wide v13, 0xffffffffffffL

    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    goto :goto_b

    .line 794
    :pswitch_2
    int-to-byte v9, v9

    .line 795
    int-to-long v11, v9

    .line 796
    shl-long v11, v11, v20

    .line 797
    .line 798
    const-wide v13, 0xffffffffffL

    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    goto :goto_b

    .line 804
    :pswitch_3
    int-to-byte v9, v9

    .line 805
    int-to-long v11, v9

    .line 806
    shl-long v11, v11, v23

    .line 807
    .line 808
    const-wide v13, 0xffffffffL

    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    goto :goto_b

    .line 814
    :pswitch_4
    int-to-byte v9, v9

    .line 815
    shl-int/lit8 v9, v9, 0x18

    .line 816
    .line 817
    int-to-long v11, v9

    .line 818
    const-wide/32 v13, 0xffffff

    .line 819
    .line 820
    .line 821
    goto :goto_b

    .line 822
    :pswitch_5
    int-to-byte v9, v9

    .line 823
    shl-int/lit8 v9, v9, 0x10

    .line 824
    .line 825
    int-to-long v11, v9

    .line 826
    const-wide/32 v13, 0xffff

    .line 827
    .line 828
    .line 829
    goto :goto_b

    .line 830
    :pswitch_6
    int-to-byte v9, v9

    .line 831
    const/16 v24, 0x8

    .line 832
    .line 833
    shl-int/lit8 v9, v9, 0x8

    .line 834
    .line 835
    int-to-long v11, v9

    .line 836
    const-wide/16 v13, 0xff

    .line 837
    .line 838
    and-long/2addr v3, v13

    .line 839
    add-long/2addr v11, v3

    .line 840
    move-wide v3, v11

    .line 841
    goto :goto_a

    .line 842
    :pswitch_7
    const/16 v24, 0x8

    .line 843
    .line 844
    int-to-byte v3, v9

    .line 845
    int-to-long v3, v3

    .line 846
    goto :goto_a

    .line 847
    :goto_c
    add-int/lit8 v6, v6, 0x1

    .line 848
    .line 849
    add-int/lit8 v8, v8, 0x1

    .line 850
    .line 851
    goto/16 :goto_6

    .line 852
    .line 853
    :cond_19
    :goto_d
    iget v6, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->nameBegin:I

    .line 854
    .line 855
    move-wide/from16 v3, v16

    .line 856
    .line 857
    goto :goto_e

    .line 858
    :cond_1a
    move/from16 v1, v29

    .line 859
    .line 860
    :cond_1b
    :goto_e
    cmp-long v8, v3, v16

    .line 861
    .line 862
    if-eqz v8, :cond_1c

    .line 863
    .line 864
    goto :goto_13

    .line 865
    :cond_1c
    const-wide v3, -0x340d631b7bdddcdbL    # -7.302176725335867E57

    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    move v8, v6

    .line 871
    const/4 v6, 0x0

    .line 872
    :goto_f
    aget-char v9, v26, v8

    .line 873
    .line 874
    const/16 v10, 0x5c

    .line 875
    .line 876
    if-ne v9, v10, :cond_1f

    .line 877
    .line 878
    const/4 v11, 0x1

    .line 879
    iput-boolean v11, v0, Lcom/alibaba/fastjson2/JSONReader;->nameEscape:Z

    .line 880
    .line 881
    add-int/lit8 v9, v8, 0x1

    .line 882
    .line 883
    aget-char v11, v26, v9

    .line 884
    .line 885
    if-eq v11, v7, :cond_1e

    .line 886
    .line 887
    if-eq v11, v5, :cond_1d

    .line 888
    .line 889
    invoke-virtual {v0, v11}, Lcom/alibaba/fastjson2/JSONReader;->char1(I)C

    .line 890
    .line 891
    .line 892
    move-result v8

    .line 893
    :goto_10
    const/16 v25, 0x1

    .line 894
    .line 895
    goto :goto_12

    .line 896
    :cond_1d
    add-int/lit8 v9, v8, 0x2

    .line 897
    .line 898
    aget-char v9, v26, v9

    .line 899
    .line 900
    add-int/lit8 v8, v8, 0x3

    .line 901
    .line 902
    aget-char v11, v26, v8

    .line 903
    .line 904
    invoke-static {v9, v11}, Lcom/alibaba/fastjson2/JSONReader;->char2(II)C

    .line 905
    .line 906
    .line 907
    move-result v9

    .line 908
    :goto_11
    move/from16 v25, v9

    .line 909
    .line 910
    move v9, v8

    .line 911
    move/from16 v8, v25

    .line 912
    .line 913
    goto :goto_10

    .line 914
    :cond_1e
    add-int/lit8 v9, v8, 0x2

    .line 915
    .line 916
    aget-char v9, v26, v9

    .line 917
    .line 918
    add-int/lit8 v11, v8, 0x3

    .line 919
    .line 920
    aget-char v11, v26, v11

    .line 921
    .line 922
    add-int/lit8 v12, v8, 0x4

    .line 923
    .line 924
    aget-char v12, v26, v12

    .line 925
    .line 926
    add-int/lit8 v8, v8, 0x5

    .line 927
    .line 928
    aget-char v13, v26, v8

    .line 929
    .line 930
    invoke-static {v9, v11, v12, v13}, Lcom/alibaba/fastjson2/JSONReader;->char4(IIII)C

    .line 931
    .line 932
    .line 933
    move-result v9

    .line 934
    goto :goto_11

    .line 935
    :goto_12
    add-int/lit8 v9, v9, 0x1

    .line 936
    .line 937
    int-to-long v11, v8

    .line 938
    xor-long/2addr v3, v11

    .line 939
    const-wide v11, 0x100000001b3L

    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    mul-long/2addr v3, v11

    .line 945
    move v8, v9

    .line 946
    move/from16 v11, v23

    .line 947
    .line 948
    goto/16 :goto_19

    .line 949
    .line 950
    :cond_1f
    const/16 v25, 0x1

    .line 951
    .line 952
    if-ne v9, v2, :cond_27

    .line 953
    .line 954
    iput v6, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->nameLength:I

    .line 955
    .line 956
    iput v8, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->nameEnd:I

    .line 957
    .line 958
    add-int/lit8 v6, v8, 0x1

    .line 959
    .line 960
    :goto_13
    const/16 v2, 0x1a

    .line 961
    .line 962
    if-ne v6, v1, :cond_20

    .line 963
    .line 964
    move v5, v6

    .line 965
    move v6, v2

    .line 966
    goto :goto_14

    .line 967
    :cond_20
    add-int/lit8 v5, v6, 0x1

    .line 968
    .line 969
    aget-char v6, v26, v6

    .line 970
    .line 971
    :goto_14
    move/from16 v7, v23

    .line 972
    .line 973
    :goto_15
    if-gt v6, v7, :cond_22

    .line 974
    .line 975
    const-wide/16 v7, 0x1

    .line 976
    .line 977
    shl-long/2addr v7, v6

    .line 978
    const-wide v9, 0x100003701L

    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    and-long/2addr v7, v9

    .line 984
    cmp-long v7, v7, v16

    .line 985
    .line 986
    if-eqz v7, :cond_22

    .line 987
    .line 988
    if-ne v5, v1, :cond_21

    .line 989
    .line 990
    move v6, v2

    .line 991
    goto :goto_16

    .line 992
    :cond_21
    add-int/lit8 v6, v5, 0x1

    .line 993
    .line 994
    aget-char v5, v26, v5

    .line 995
    .line 996
    move/from16 v34, v6

    .line 997
    .line 998
    move v6, v5

    .line 999
    move/from16 v5, v34

    .line 1000
    .line 1001
    :goto_16
    const/16 v7, 0x20

    .line 1002
    .line 1003
    goto :goto_15

    .line 1004
    :cond_22
    const/16 v7, 0x3a

    .line 1005
    .line 1006
    if-ne v6, v7, :cond_26

    .line 1007
    .line 1008
    if-ne v5, v1, :cond_23

    .line 1009
    .line 1010
    move v6, v5

    .line 1011
    move v5, v2

    .line 1012
    goto :goto_17

    .line 1013
    :cond_23
    add-int/lit8 v6, v5, 0x1

    .line 1014
    .line 1015
    aget-char v5, v26, v5

    .line 1016
    .line 1017
    :goto_17
    const/16 v11, 0x20

    .line 1018
    .line 1019
    :goto_18
    if-gt v5, v11, :cond_25

    .line 1020
    .line 1021
    const-wide/16 v7, 0x1

    .line 1022
    .line 1023
    shl-long/2addr v7, v5

    .line 1024
    const-wide v9, 0x100003701L

    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    and-long/2addr v7, v9

    .line 1030
    cmp-long v7, v7, v16

    .line 1031
    .line 1032
    if-eqz v7, :cond_25

    .line 1033
    .line 1034
    if-ne v6, v1, :cond_24

    .line 1035
    .line 1036
    move v5, v2

    .line 1037
    goto :goto_18

    .line 1038
    :cond_24
    add-int/lit8 v5, v6, 0x1

    .line 1039
    .line 1040
    aget-char v6, v26, v6

    .line 1041
    .line 1042
    move/from16 v34, v6

    .line 1043
    .line 1044
    move v6, v5

    .line 1045
    move/from16 v5, v34

    .line 1046
    .line 1047
    goto :goto_18

    .line 1048
    :cond_25
    iput v6, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 1049
    .line 1050
    iput-char v5, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 1051
    .line 1052
    return-wide v3

    .line 1053
    :cond_26
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1054
    .line 1055
    const-string v2, "expect \':\', but "

    .line 1056
    .line 1057
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1058
    .line 1059
    .line 1060
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1061
    .line 1062
    .line 1063
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1064
    .line 1065
    .line 1066
    move-result-object v1

    .line 1067
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 1068
    .line 1069
    .line 1070
    move-result-object v1

    .line 1071
    invoke-static {v1}, Lah/a;->w(Ljava/lang/String;)V

    .line 1072
    .line 1073
    .line 1074
    goto/16 :goto_2

    .line 1075
    .line 1076
    :cond_27
    move/from16 v11, v23

    .line 1077
    .line 1078
    add-int/lit8 v8, v8, 0x1

    .line 1079
    .line 1080
    int-to-long v12, v9

    .line 1081
    xor-long/2addr v3, v12

    .line 1082
    const-wide v12, 0x100000001b3L

    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    mul-long/2addr v3, v12

    .line 1088
    :goto_19
    add-int/lit8 v6, v6, 0x1

    .line 1089
    .line 1090
    move/from16 v23, v11

    .line 1091
    .line 1092
    goto/16 :goto_f

    .line 1093
    .line 1094
    nop

    .line 1095
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public readFieldNameHashCodeUnquote()J
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-boolean v1, v0, Lcom/alibaba/fastjson2/JSONReader;->nameEscape:Z

    .line 5
    .line 6
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 7
    .line 8
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 9
    .line 10
    iget-object v4, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 11
    .line 12
    iget-char v5, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 13
    .line 14
    add-int/lit8 v6, v2, -0x1

    .line 15
    .line 16
    iput v6, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->nameBegin:I

    .line 17
    .line 18
    move v9, v1

    .line 19
    move v8, v5

    .line 20
    const-wide/16 v10, 0x0

    .line 21
    .line 22
    :goto_0
    const-wide/16 v16, 0x0

    .line 23
    .line 24
    const/16 v12, 0x5d

    .line 25
    .line 26
    const/16 v13, 0x5b

    .line 27
    .line 28
    const/16 v14, 0xd

    .line 29
    .line 30
    const/16 v15, 0xc

    .line 31
    .line 32
    const-wide v19, 0x100003701L

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    const-wide/16 v21, 0x1

    .line 38
    .line 39
    const/16 v1, 0x3a

    .line 40
    .line 41
    const/16 v6, 0x1a

    .line 42
    .line 43
    const/4 v7, 0x1

    .line 44
    if-gt v2, v3, :cond_a

    .line 45
    .line 46
    if-eq v8, v15, :cond_7

    .line 47
    .line 48
    if-eq v8, v14, :cond_7

    .line 49
    .line 50
    if-eq v8, v6, :cond_7

    .line 51
    .line 52
    if-eq v8, v1, :cond_7

    .line 53
    .line 54
    if-eq v8, v13, :cond_7

    .line 55
    .line 56
    if-eq v8, v12, :cond_7

    .line 57
    .line 58
    const/16 v12, 0x7b

    .line 59
    .line 60
    if-eq v8, v12, :cond_7

    .line 61
    .line 62
    const/16 v12, 0x7d

    .line 63
    .line 64
    if-eq v8, v12, :cond_7

    .line 65
    .line 66
    const/16 v12, 0x20

    .line 67
    .line 68
    if-eq v8, v12, :cond_7

    .line 69
    .line 70
    const/16 v12, 0x21

    .line 71
    .line 72
    if-eq v8, v12, :cond_7

    .line 73
    .line 74
    packed-switch v8, :pswitch_data_0

    .line 75
    .line 76
    .line 77
    packed-switch v8, :pswitch_data_1

    .line 78
    .line 79
    .line 80
    packed-switch v8, :pswitch_data_2

    .line 81
    .line 82
    .line 83
    const/16 v12, 0x5c

    .line 84
    .line 85
    if-ne v8, v12, :cond_3

    .line 86
    .line 87
    iput-boolean v7, v0, Lcom/alibaba/fastjson2/JSONReader;->nameEscape:Z

    .line 88
    .line 89
    add-int/lit8 v8, v2, 0x1

    .line 90
    .line 91
    aget-char v13, v4, v2

    .line 92
    .line 93
    const/16 v14, 0x22

    .line 94
    .line 95
    if-eq v13, v14, :cond_2

    .line 96
    .line 97
    if-eq v13, v1, :cond_2

    .line 98
    .line 99
    const/16 v14, 0x40

    .line 100
    .line 101
    if-eq v13, v14, :cond_2

    .line 102
    .line 103
    if-eq v13, v12, :cond_2

    .line 104
    .line 105
    const/16 v12, 0x75

    .line 106
    .line 107
    if-eq v13, v12, :cond_1

    .line 108
    .line 109
    const/16 v12, 0x78

    .line 110
    .line 111
    if-eq v13, v12, :cond_0

    .line 112
    .line 113
    const/16 v2, 0x2a

    .line 114
    .line 115
    if-eq v13, v2, :cond_2

    .line 116
    .line 117
    const/16 v2, 0x2b

    .line 118
    .line 119
    if-eq v13, v2, :cond_2

    .line 120
    .line 121
    packed-switch v13, :pswitch_data_3

    .line 122
    .line 123
    .line 124
    packed-switch v13, :pswitch_data_4

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0, v13}, Lcom/alibaba/fastjson2/JSONReader;->char1(I)C

    .line 128
    .line 129
    .line 130
    move-result v2

    .line 131
    move/from16 v24, v8

    .line 132
    .line 133
    move v8, v2

    .line 134
    move/from16 v2, v24

    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_0
    aget-char v8, v4, v8

    .line 138
    .line 139
    add-int/lit8 v12, v2, 0x2

    .line 140
    .line 141
    aget-char v12, v4, v12

    .line 142
    .line 143
    invoke-static {v8, v12}, Lcom/alibaba/fastjson2/JSONReader;->char2(II)C

    .line 144
    .line 145
    .line 146
    move-result v8

    .line 147
    add-int/lit8 v2, v2, 0x3

    .line 148
    .line 149
    goto :goto_1

    .line 150
    :cond_1
    aget-char v8, v4, v8

    .line 151
    .line 152
    add-int/lit8 v12, v2, 0x2

    .line 153
    .line 154
    aget-char v12, v4, v12

    .line 155
    .line 156
    add-int/lit8 v13, v2, 0x3

    .line 157
    .line 158
    aget-char v13, v4, v13

    .line 159
    .line 160
    add-int/lit8 v14, v2, 0x4

    .line 161
    .line 162
    aget-char v14, v4, v14

    .line 163
    .line 164
    invoke-static {v8, v12, v13, v14}, Lcom/alibaba/fastjson2/JSONReader;->char4(IIII)C

    .line 165
    .line 166
    .line 167
    move-result v8

    .line 168
    add-int/lit8 v2, v2, 0x5

    .line 169
    .line 170
    goto :goto_1

    .line 171
    :cond_2
    :pswitch_0
    move v2, v8

    .line 172
    move v8, v13

    .line 173
    :cond_3
    :goto_1
    const/16 v12, 0xff

    .line 174
    .line 175
    if-gt v8, v12, :cond_6

    .line 176
    .line 177
    const/16 v12, 0x8

    .line 178
    .line 179
    if-ge v9, v12, :cond_6

    .line 180
    .line 181
    if-nez v9, :cond_4

    .line 182
    .line 183
    if-nez v8, :cond_4

    .line 184
    .line 185
    goto :goto_5

    .line 186
    :cond_4
    int-to-byte v1, v8

    .line 187
    packed-switch v9, :pswitch_data_5

    .line 188
    .line 189
    .line 190
    goto :goto_3

    .line 191
    :pswitch_1
    int-to-long v7, v1

    .line 192
    const/16 v1, 0x38

    .line 193
    .line 194
    shl-long/2addr v7, v1

    .line 195
    const-wide v12, 0xffffffffffffffL

    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    :goto_2
    and-long/2addr v10, v12

    .line 201
    add-long/2addr v10, v7

    .line 202
    goto :goto_3

    .line 203
    :pswitch_2
    int-to-long v7, v1

    .line 204
    const/16 v1, 0x30

    .line 205
    .line 206
    shl-long/2addr v7, v1

    .line 207
    const-wide v12, 0xffffffffffffL

    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    goto :goto_2

    .line 213
    :pswitch_3
    int-to-long v7, v1

    .line 214
    const/16 v1, 0x28

    .line 215
    .line 216
    shl-long/2addr v7, v1

    .line 217
    const-wide v12, 0xffffffffffL

    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    goto :goto_2

    .line 223
    :pswitch_4
    int-to-long v7, v1

    .line 224
    const/16 v23, 0x20

    .line 225
    .line 226
    shl-long v7, v7, v23

    .line 227
    .line 228
    const-wide v12, 0xffffffffL

    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    goto :goto_2

    .line 234
    :pswitch_5
    shl-int/lit8 v1, v1, 0x18

    .line 235
    .line 236
    int-to-long v7, v1

    .line 237
    const-wide/32 v12, 0xffffff

    .line 238
    .line 239
    .line 240
    goto :goto_2

    .line 241
    :pswitch_6
    shl-int/lit8 v1, v1, 0x10

    .line 242
    .line 243
    int-to-long v7, v1

    .line 244
    const-wide/32 v12, 0xffff

    .line 245
    .line 246
    .line 247
    goto :goto_2

    .line 248
    :pswitch_7
    shl-int/lit8 v1, v1, 0x8

    .line 249
    .line 250
    int-to-long v7, v1

    .line 251
    const-wide/16 v12, 0xff

    .line 252
    .line 253
    goto :goto_2

    .line 254
    :pswitch_8
    int-to-long v10, v1

    .line 255
    :goto_3
    if-ne v2, v3, :cond_5

    .line 256
    .line 257
    move v8, v6

    .line 258
    goto :goto_4

    .line 259
    :cond_5
    add-int/lit8 v1, v2, 0x1

    .line 260
    .line 261
    aget-char v2, v4, v2

    .line 262
    .line 263
    move v8, v2

    .line 264
    move v2, v1

    .line 265
    :goto_4
    add-int/lit8 v9, v9, 0x1

    .line 266
    .line 267
    const/4 v1, 0x0

    .line 268
    goto/16 :goto_0

    .line 269
    .line 270
    :cond_6
    :goto_5
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->nameBegin:I

    .line 271
    .line 272
    add-int/2addr v2, v7

    .line 273
    move-wide/from16 v10, v16

    .line 274
    .line 275
    goto :goto_7

    .line 276
    :cond_7
    :pswitch_9
    iput v9, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->nameLength:I

    .line 277
    .line 278
    if-ne v8, v6, :cond_8

    .line 279
    .line 280
    move v5, v2

    .line 281
    goto :goto_6

    .line 282
    :cond_8
    add-int/lit8 v5, v2, -0x1

    .line 283
    .line 284
    :goto_6
    iput v5, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->nameEnd:I

    .line 285
    .line 286
    const/16 v12, 0x20

    .line 287
    .line 288
    if-gt v8, v12, :cond_a

    .line 289
    .line 290
    shl-long v12, v21, v8

    .line 291
    .line 292
    and-long v12, v12, v19

    .line 293
    .line 294
    cmp-long v5, v12, v16

    .line 295
    .line 296
    if-eqz v5, :cond_a

    .line 297
    .line 298
    if-ne v2, v3, :cond_9

    .line 299
    .line 300
    move v5, v6

    .line 301
    goto :goto_7

    .line 302
    :cond_9
    add-int/lit8 v5, v2, 0x1

    .line 303
    .line 304
    aget-char v2, v4, v2

    .line 305
    .line 306
    move/from16 v24, v5

    .line 307
    .line 308
    move v5, v2

    .line 309
    move/from16 v2, v24

    .line 310
    .line 311
    goto :goto_7

    .line 312
    :cond_a
    move v5, v8

    .line 313
    :goto_7
    cmp-long v8, v10, v16

    .line 314
    .line 315
    if-eqz v8, :cond_b

    .line 316
    .line 317
    goto/16 :goto_f

    .line 318
    .line 319
    :cond_b
    const-wide v8, -0x340d631b7bdddcdbL    # -7.302176725335867E57

    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    move-wide v10, v8

    .line 325
    move v8, v5

    .line 326
    move v5, v2

    .line 327
    const/4 v2, 0x0

    .line 328
    :goto_8
    const/16 v12, 0x5c

    .line 329
    .line 330
    if-ne v8, v12, :cond_11

    .line 331
    .line 332
    iput-boolean v7, v0, Lcom/alibaba/fastjson2/JSONReader;->nameEscape:Z

    .line 333
    .line 334
    add-int/lit8 v8, v5, 0x1

    .line 335
    .line 336
    aget-char v9, v4, v5

    .line 337
    .line 338
    const/16 v14, 0x22

    .line 339
    .line 340
    if-eq v9, v14, :cond_e

    .line 341
    .line 342
    if-eq v9, v1, :cond_e

    .line 343
    .line 344
    const/16 v13, 0x40

    .line 345
    .line 346
    if-eq v9, v13, :cond_f

    .line 347
    .line 348
    if-eq v9, v12, :cond_f

    .line 349
    .line 350
    const/16 v7, 0x75

    .line 351
    .line 352
    if-eq v9, v7, :cond_d

    .line 353
    .line 354
    const/16 v7, 0x78

    .line 355
    .line 356
    if-eq v9, v7, :cond_c

    .line 357
    .line 358
    const/16 v5, 0x2a

    .line 359
    .line 360
    if-eq v9, v5, :cond_f

    .line 361
    .line 362
    const/16 v5, 0x2b

    .line 363
    .line 364
    if-eq v9, v5, :cond_f

    .line 365
    .line 366
    packed-switch v9, :pswitch_data_6

    .line 367
    .line 368
    .line 369
    packed-switch v9, :pswitch_data_7

    .line 370
    .line 371
    .line 372
    invoke-virtual {v0, v9}, Lcom/alibaba/fastjson2/JSONReader;->char1(I)C

    .line 373
    .line 374
    .line 375
    move-result v9

    .line 376
    goto :goto_9

    .line 377
    :cond_c
    aget-char v8, v4, v8

    .line 378
    .line 379
    add-int/lit8 v9, v5, 0x2

    .line 380
    .line 381
    aget-char v9, v4, v9

    .line 382
    .line 383
    invoke-static {v8, v9}, Lcom/alibaba/fastjson2/JSONReader;->char2(II)C

    .line 384
    .line 385
    .line 386
    move-result v9

    .line 387
    add-int/lit8 v8, v5, 0x3

    .line 388
    .line 389
    goto :goto_9

    .line 390
    :cond_d
    const/16 v7, 0x78

    .line 391
    .line 392
    aget-char v8, v4, v8

    .line 393
    .line 394
    add-int/lit8 v9, v5, 0x2

    .line 395
    .line 396
    aget-char v9, v4, v9

    .line 397
    .line 398
    add-int/lit8 v18, v5, 0x3

    .line 399
    .line 400
    aget-char v7, v4, v18

    .line 401
    .line 402
    add-int/lit8 v18, v5, 0x4

    .line 403
    .line 404
    aget-char v12, v4, v18

    .line 405
    .line 406
    invoke-static {v8, v9, v7, v12}, Lcom/alibaba/fastjson2/JSONReader;->char4(IIII)C

    .line 407
    .line 408
    .line 409
    move-result v9

    .line 410
    add-int/lit8 v8, v5, 0x5

    .line 411
    .line 412
    goto :goto_9

    .line 413
    :cond_e
    const/16 v13, 0x40

    .line 414
    .line 415
    :cond_f
    :goto_9
    :pswitch_a
    int-to-long v13, v9

    .line 416
    xor-long v9, v10, v13

    .line 417
    .line 418
    const-wide v11, 0x100000001b3L

    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    mul-long/2addr v9, v11

    .line 424
    if-ne v8, v3, :cond_10

    .line 425
    .line 426
    move v5, v8

    .line 427
    move v8, v6

    .line 428
    goto :goto_a

    .line 429
    :cond_10
    add-int/lit8 v5, v8, 0x1

    .line 430
    .line 431
    aget-char v8, v4, v8

    .line 432
    .line 433
    :goto_a
    move-wide v10, v9

    .line 434
    const/16 v9, 0xd

    .line 435
    .line 436
    const/16 v12, 0x5b

    .line 437
    .line 438
    const/16 v13, 0x5d

    .line 439
    .line 440
    const/16 v14, 0x7b

    .line 441
    .line 442
    goto :goto_c

    .line 443
    :cond_11
    if-eq v8, v15, :cond_13

    .line 444
    .line 445
    const/16 v9, 0xd

    .line 446
    .line 447
    if-eq v8, v9, :cond_13

    .line 448
    .line 449
    if-eq v8, v6, :cond_13

    .line 450
    .line 451
    if-eq v8, v1, :cond_13

    .line 452
    .line 453
    const/16 v12, 0x5b

    .line 454
    .line 455
    if-eq v8, v12, :cond_13

    .line 456
    .line 457
    const/16 v13, 0x5d

    .line 458
    .line 459
    if-eq v8, v13, :cond_13

    .line 460
    .line 461
    const/16 v14, 0x7b

    .line 462
    .line 463
    if-eq v8, v14, :cond_13

    .line 464
    .line 465
    const/16 v7, 0x7d

    .line 466
    .line 467
    if-eq v8, v7, :cond_13

    .line 468
    .line 469
    const/16 v7, 0x20

    .line 470
    .line 471
    if-eq v8, v7, :cond_13

    .line 472
    .line 473
    const/16 v7, 0x21

    .line 474
    .line 475
    if-eq v8, v7, :cond_13

    .line 476
    .line 477
    packed-switch v8, :pswitch_data_8

    .line 478
    .line 479
    .line 480
    packed-switch v8, :pswitch_data_9

    .line 481
    .line 482
    .line 483
    packed-switch v8, :pswitch_data_a

    .line 484
    .line 485
    .line 486
    int-to-long v7, v8

    .line 487
    xor-long/2addr v7, v10

    .line 488
    const-wide v10, 0x100000001b3L

    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    mul-long/2addr v7, v10

    .line 494
    if-ne v5, v3, :cond_12

    .line 495
    .line 496
    move v10, v5

    .line 497
    move v5, v6

    .line 498
    goto :goto_b

    .line 499
    :cond_12
    add-int/lit8 v10, v5, 0x1

    .line 500
    .line 501
    aget-char v5, v4, v5

    .line 502
    .line 503
    :goto_b
    move-wide/from16 v24, v7

    .line 504
    .line 505
    move v8, v5

    .line 506
    move v5, v10

    .line 507
    move-wide/from16 v10, v24

    .line 508
    .line 509
    :goto_c
    add-int/lit8 v2, v2, 0x1

    .line 510
    .line 511
    const/4 v7, 0x1

    .line 512
    goto/16 :goto_8

    .line 513
    .line 514
    :cond_13
    :pswitch_b
    iput v2, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->nameLength:I

    .line 515
    .line 516
    if-ne v8, v6, :cond_14

    .line 517
    .line 518
    move v2, v5

    .line 519
    goto :goto_d

    .line 520
    :cond_14
    add-int/lit8 v2, v5, -0x1

    .line 521
    .line 522
    :goto_d
    iput v2, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->nameEnd:I

    .line 523
    .line 524
    move v2, v5

    .line 525
    move v5, v8

    .line 526
    :goto_e
    const/16 v12, 0x20

    .line 527
    .line 528
    if-gt v5, v12, :cond_16

    .line 529
    .line 530
    shl-long v7, v21, v5

    .line 531
    .line 532
    and-long v7, v7, v19

    .line 533
    .line 534
    cmp-long v7, v7, v16

    .line 535
    .line 536
    if-eqz v7, :cond_16

    .line 537
    .line 538
    if-ne v2, v3, :cond_15

    .line 539
    .line 540
    move v5, v6

    .line 541
    goto :goto_e

    .line 542
    :cond_15
    add-int/lit8 v5, v2, 0x1

    .line 543
    .line 544
    aget-char v2, v4, v2

    .line 545
    .line 546
    move/from16 v24, v5

    .line 547
    .line 548
    move v5, v2

    .line 549
    move/from16 v2, v24

    .line 550
    .line 551
    goto :goto_e

    .line 552
    :cond_16
    :goto_f
    if-ne v5, v1, :cond_19

    .line 553
    .line 554
    if-ne v2, v3, :cond_17

    .line 555
    .line 556
    move v1, v2

    .line 557
    move v2, v6

    .line 558
    goto :goto_10

    .line 559
    :cond_17
    add-int/lit8 v1, v2, 0x1

    .line 560
    .line 561
    aget-char v2, v4, v2

    .line 562
    .line 563
    :goto_10
    move v5, v2

    .line 564
    const/16 v12, 0x20

    .line 565
    .line 566
    :goto_11
    move v2, v1

    .line 567
    :goto_12
    if-gt v5, v12, :cond_19

    .line 568
    .line 569
    shl-long v7, v21, v5

    .line 570
    .line 571
    and-long v7, v7, v19

    .line 572
    .line 573
    cmp-long v1, v7, v16

    .line 574
    .line 575
    if-eqz v1, :cond_19

    .line 576
    .line 577
    if-ne v2, v3, :cond_18

    .line 578
    .line 579
    move v5, v6

    .line 580
    goto :goto_12

    .line 581
    :cond_18
    add-int/lit8 v1, v2, 0x1

    .line 582
    .line 583
    aget-char v2, v4, v2

    .line 584
    .line 585
    move v5, v2

    .line 586
    goto :goto_11

    .line 587
    :cond_19
    iput v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 588
    .line 589
    iput-char v5, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 590
    .line 591
    return-wide v10

    .line 592
    nop

    .line 593
    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_9
        :pswitch_9
        :pswitch_9
    .end packed-switch

    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    :pswitch_data_1
    .packed-switch 0x28
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
    .end packed-switch

    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    :pswitch_data_2
    .packed-switch 0x3c
        :pswitch_9
        :pswitch_9
        :pswitch_9
    .end packed-switch

    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    :pswitch_data_3
    .packed-switch 0x2d
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    :pswitch_data_4
    .packed-switch 0x3c
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    :pswitch_data_5
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch

    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    :pswitch_data_6
    .packed-switch 0x2d
        :pswitch_a
        :pswitch_a
        :pswitch_a
    .end packed-switch

    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    :pswitch_data_7
    .packed-switch 0x3c
        :pswitch_a
        :pswitch_a
        :pswitch_a
    .end packed-switch

    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    :pswitch_data_8
    .packed-switch 0x8
        :pswitch_b
        :pswitch_b
        :pswitch_b
    .end packed-switch

    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    :pswitch_data_9
    .packed-switch 0x28
        :pswitch_b
        :pswitch_b
        :pswitch_b
        :pswitch_b
        :pswitch_b
        :pswitch_b
        :pswitch_b
        :pswitch_b
    .end packed-switch

    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    :pswitch_data_a
    .packed-switch 0x3c
        :pswitch_b
        :pswitch_b
        :pswitch_b
    .end packed-switch
.end method

.method public readFloatValue()F
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 4
    .line 5
    iget-char v2, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 6
    .line 7
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 8
    .line 9
    iget v4, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 10
    .line 11
    const/16 v5, 0x22

    .line 12
    .line 13
    if-eq v2, v5, :cond_1

    .line 14
    .line 15
    const/16 v5, 0x27

    .line 16
    .line 17
    if-ne v2, v5, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v5, v3

    .line 21
    move v3, v2

    .line 22
    const/4 v2, 0x0

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    :goto_0
    if-ne v3, v4, :cond_2

    .line 25
    .line 26
    move v5, v3

    .line 27
    const/16 v3, 0x1a

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_2
    add-int/lit8 v5, v3, 0x1

    .line 31
    .line 32
    aget-char v3, v1, v3

    .line 33
    .line 34
    :goto_1
    const/16 v8, 0x2c

    .line 35
    .line 36
    if-eqz v2, :cond_4

    .line 37
    .line 38
    if-ne v3, v2, :cond_4

    .line 39
    .line 40
    if-ne v5, v4, :cond_3

    .line 41
    .line 42
    const/16 v3, 0x1a

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_3
    add-int/lit8 v2, v5, 0x1

    .line 46
    .line 47
    aget-char v3, v1, v5

    .line 48
    .line 49
    move v5, v2

    .line 50
    :goto_2
    const-wide/16 v11, 0x0

    .line 51
    .line 52
    const/4 v13, 0x1

    .line 53
    const/4 v14, 0x0

    .line 54
    const-wide/16 v16, 0x1

    .line 55
    .line 56
    const-wide/16 v18, 0x0

    .line 57
    .line 58
    goto/16 :goto_19

    .line 59
    .line 60
    :cond_4
    const/16 v15, 0x2b

    .line 61
    .line 62
    const/16 v6, 0x2d

    .line 63
    .line 64
    const/16 v7, 0x39

    .line 65
    .line 66
    const-wide/16 v16, 0x1

    .line 67
    .line 68
    const/16 v9, 0x30

    .line 69
    .line 70
    if-lt v3, v9, :cond_5

    .line 71
    .line 72
    if-gt v3, v7, :cond_5

    .line 73
    .line 74
    rsub-int/lit8 v10, v3, 0x30

    .line 75
    .line 76
    const-wide/16 v18, 0x0

    .line 77
    .line 78
    int-to-long v11, v10

    .line 79
    goto :goto_3

    .line 80
    :cond_5
    const-wide/16 v18, 0x0

    .line 81
    .line 82
    if-eq v3, v6, :cond_6

    .line 83
    .line 84
    if-ne v3, v15, :cond_7

    .line 85
    .line 86
    :cond_6
    move-wide/from16 v11, v18

    .line 87
    .line 88
    :goto_3
    cmp-long v10, v11, v18

    .line 89
    .line 90
    const-wide/16 v20, 0x64

    .line 91
    .line 92
    const-wide v22, -0x147ae147ae147aeL

    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    const/4 v13, -0x1

    .line 98
    if-gtz v10, :cond_8

    .line 99
    .line 100
    const/16 v24, 0x0

    .line 101
    .line 102
    add-int/lit8 v14, v5, 0x1

    .line 103
    .line 104
    if-ge v14, v4, :cond_9

    .line 105
    .line 106
    invoke-static {v1, v5}, Lcom/alibaba/fastjson2/util/IOUtils;->digit2([CI)I

    .line 107
    .line 108
    .line 109
    move-result v14

    .line 110
    if-eq v14, v13, :cond_9

    .line 111
    .line 112
    cmp-long v10, v22, v11

    .line 113
    .line 114
    if-gtz v10, :cond_7

    .line 115
    .line 116
    mul-long v11, v11, v20

    .line 117
    .line 118
    int-to-long v13, v14

    .line 119
    sub-long/2addr v11, v13

    .line 120
    add-int/lit8 v5, v5, 0x2

    .line 121
    .line 122
    goto :goto_3

    .line 123
    :cond_7
    move-wide/from16 v11, v16

    .line 124
    .line 125
    goto :goto_3

    .line 126
    :cond_8
    const/16 v24, 0x0

    .line 127
    .line 128
    :cond_9
    const-wide/16 v25, 0x30

    .line 129
    .line 130
    const-wide/16 v27, 0xa

    .line 131
    .line 132
    const-wide v29, -0xcccccccccccccccL

    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    if-gtz v10, :cond_b

    .line 138
    .line 139
    if-ge v5, v4, :cond_b

    .line 140
    .line 141
    aget-char v10, v1, v5

    .line 142
    .line 143
    if-lt v10, v9, :cond_c

    .line 144
    .line 145
    if-gt v10, v7, :cond_c

    .line 146
    .line 147
    cmp-long v14, v29, v11

    .line 148
    .line 149
    if-gtz v14, :cond_a

    .line 150
    .line 151
    mul-long v11, v11, v27

    .line 152
    .line 153
    add-long v11, v11, v25

    .line 154
    .line 155
    int-to-long v6, v10

    .line 156
    sub-long/2addr v11, v6

    .line 157
    add-int/lit8 v5, v5, 0x1

    .line 158
    .line 159
    goto :goto_4

    .line 160
    :cond_a
    move-wide/from16 v11, v16

    .line 161
    .line 162
    goto :goto_4

    .line 163
    :cond_b
    move v10, v3

    .line 164
    :cond_c
    :goto_4
    cmp-long v6, v11, v18

    .line 165
    .line 166
    if-gtz v6, :cond_10

    .line 167
    .line 168
    if-ge v5, v4, :cond_10

    .line 169
    .line 170
    aget-char v6, v1, v5

    .line 171
    .line 172
    const/16 v7, 0x2e

    .line 173
    .line 174
    if-ne v6, v7, :cond_10

    .line 175
    .line 176
    add-int/lit8 v5, v5, 0x1

    .line 177
    .line 178
    const/4 v6, 0x0

    .line 179
    :goto_5
    cmp-long v7, v11, v18

    .line 180
    .line 181
    if-gtz v7, :cond_e

    .line 182
    .line 183
    add-int/lit8 v14, v5, 0x1

    .line 184
    .line 185
    if-ge v14, v4, :cond_e

    .line 186
    .line 187
    invoke-static {v1, v5}, Lcom/alibaba/fastjson2/util/IOUtils;->digit2([CI)I

    .line 188
    .line 189
    .line 190
    move-result v14

    .line 191
    if-eq v14, v13, :cond_e

    .line 192
    .line 193
    cmp-long v7, v22, v11

    .line 194
    .line 195
    if-gtz v7, :cond_d

    .line 196
    .line 197
    mul-long v11, v11, v20

    .line 198
    .line 199
    int-to-long v13, v14

    .line 200
    sub-long/2addr v11, v13

    .line 201
    add-int/lit8 v5, v5, 0x2

    .line 202
    .line 203
    add-int/lit8 v6, v6, 0x2

    .line 204
    .line 205
    const/4 v13, -0x1

    .line 206
    goto :goto_5

    .line 207
    :cond_d
    move-wide/from16 v11, v16

    .line 208
    .line 209
    goto :goto_5

    .line 210
    :cond_e
    if-gtz v7, :cond_11

    .line 211
    .line 212
    if-ge v5, v4, :cond_11

    .line 213
    .line 214
    aget-char v10, v1, v5

    .line 215
    .line 216
    if-lt v10, v9, :cond_11

    .line 217
    .line 218
    const/16 v7, 0x39

    .line 219
    .line 220
    if-gt v10, v7, :cond_11

    .line 221
    .line 222
    cmp-long v7, v29, v11

    .line 223
    .line 224
    if-gtz v7, :cond_f

    .line 225
    .line 226
    mul-long v11, v11, v27

    .line 227
    .line 228
    add-long v11, v11, v25

    .line 229
    .line 230
    int-to-long v13, v10

    .line 231
    sub-long/2addr v11, v13

    .line 232
    add-int/lit8 v5, v5, 0x1

    .line 233
    .line 234
    add-int/lit8 v6, v6, 0x1

    .line 235
    .line 236
    goto :goto_6

    .line 237
    :cond_f
    move-wide/from16 v11, v16

    .line 238
    .line 239
    goto :goto_6

    .line 240
    :cond_10
    const/4 v6, 0x0

    .line 241
    :cond_11
    :goto_6
    cmp-long v7, v11, v18

    .line 242
    .line 243
    if-gtz v7, :cond_13

    .line 244
    .line 245
    if-ne v5, v4, :cond_12

    .line 246
    .line 247
    const/16 v10, 0x1a

    .line 248
    .line 249
    goto :goto_7

    .line 250
    :cond_12
    add-int/lit8 v10, v5, 0x1

    .line 251
    .line 252
    aget-char v5, v1, v5

    .line 253
    .line 254
    move/from16 v31, v10

    .line 255
    .line 256
    move v10, v5

    .line 257
    move/from16 v5, v31

    .line 258
    .line 259
    :cond_13
    :goto_7
    if-gtz v7, :cond_23

    .line 260
    .line 261
    const/16 v7, 0x65

    .line 262
    .line 263
    if-eq v10, v7, :cond_17

    .line 264
    .line 265
    const/16 v7, 0x45

    .line 266
    .line 267
    if-ne v10, v7, :cond_14

    .line 268
    .line 269
    goto :goto_8

    .line 270
    :cond_14
    const/16 v7, 0x4c

    .line 271
    .line 272
    if-eq v10, v7, :cond_15

    .line 273
    .line 274
    const/16 v7, 0x46

    .line 275
    .line 276
    if-eq v10, v7, :cond_15

    .line 277
    .line 278
    const/16 v7, 0x44

    .line 279
    .line 280
    if-eq v10, v7, :cond_15

    .line 281
    .line 282
    const/16 v7, 0x42

    .line 283
    .line 284
    if-eq v10, v7, :cond_15

    .line 285
    .line 286
    const/16 v7, 0x53

    .line 287
    .line 288
    if-ne v10, v7, :cond_23

    .line 289
    .line 290
    :cond_15
    if-ne v5, v4, :cond_16

    .line 291
    .line 292
    const/16 v10, 0x1a

    .line 293
    .line 294
    goto/16 :goto_10

    .line 295
    .line 296
    :cond_16
    add-int/lit8 v7, v5, 0x1

    .line 297
    .line 298
    aget-char v5, v1, v5

    .line 299
    .line 300
    move v10, v5

    .line 301
    move v5, v7

    .line 302
    goto/16 :goto_10

    .line 303
    .line 304
    :cond_17
    :goto_8
    if-ne v5, v4, :cond_18

    .line 305
    .line 306
    move v7, v5

    .line 307
    const/16 v5, 0x1a

    .line 308
    .line 309
    :goto_9
    const/16 v14, 0x2d

    .line 310
    .line 311
    goto :goto_a

    .line 312
    :cond_18
    add-int/lit8 v7, v5, 0x1

    .line 313
    .line 314
    aget-char v5, v1, v5

    .line 315
    .line 316
    goto :goto_9

    .line 317
    :goto_a
    if-ne v5, v14, :cond_19

    .line 318
    .line 319
    const/4 v10, 0x1

    .line 320
    goto :goto_b

    .line 321
    :cond_19
    const/4 v10, 0x0

    .line 322
    :goto_b
    if-nez v10, :cond_1c

    .line 323
    .line 324
    if-ne v5, v15, :cond_1a

    .line 325
    .line 326
    goto :goto_c

    .line 327
    :cond_1a
    if-eq v5, v8, :cond_1b

    .line 328
    .line 329
    goto :goto_d

    .line 330
    :cond_1b
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReader;->numberError()Lcom/alibaba/fastjson2/JSONException;

    .line 331
    .line 332
    .line 333
    move-result-object v1

    .line 334
    throw v1

    .line 335
    :cond_1c
    :goto_c
    if-ne v7, v4, :cond_1d

    .line 336
    .line 337
    const/16 v5, 0x1a

    .line 338
    .line 339
    goto :goto_d

    .line 340
    :cond_1d
    add-int/lit8 v5, v7, 0x1

    .line 341
    .line 342
    aget-char v7, v1, v7

    .line 343
    .line 344
    move/from16 v31, v7

    .line 345
    .line 346
    move v7, v5

    .line 347
    move/from16 v5, v31

    .line 348
    .line 349
    :goto_d
    if-lt v5, v9, :cond_22

    .line 350
    .line 351
    const/16 v13, 0x39

    .line 352
    .line 353
    if-gt v5, v13, :cond_22

    .line 354
    .line 355
    add-int/lit8 v5, v5, -0x30

    .line 356
    .line 357
    :goto_e
    if-ge v7, v4, :cond_1f

    .line 358
    .line 359
    aget-char v15, v1, v7

    .line 360
    .line 361
    if-lt v15, v9, :cond_1f

    .line 362
    .line 363
    if-gt v15, v13, :cond_1f

    .line 364
    .line 365
    add-int/lit8 v15, v15, -0x30

    .line 366
    .line 367
    mul-int/lit8 v5, v5, 0xa

    .line 368
    .line 369
    add-int/2addr v5, v15

    .line 370
    const/16 v15, 0x7ff

    .line 371
    .line 372
    if-gt v5, v15, :cond_1e

    .line 373
    .line 374
    add-int/lit8 v7, v7, 0x1

    .line 375
    .line 376
    goto :goto_e

    .line 377
    :cond_1e
    const-string v1, "too large exp value : "

    .line 378
    .line 379
    invoke-static {v5, v1}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object v1

    .line 383
    invoke-static {v1}, Lah/a;->w(Ljava/lang/String;)V

    .line 384
    .line 385
    .line 386
    const/4 v1, 0x0

    .line 387
    return v1

    .line 388
    :cond_1f
    if-eqz v10, :cond_20

    .line 389
    .line 390
    neg-int v5, v5

    .line 391
    :cond_20
    sub-int/2addr v6, v5

    .line 392
    if-ne v7, v4, :cond_21

    .line 393
    .line 394
    move v5, v7

    .line 395
    const/16 v7, 0x1a

    .line 396
    .line 397
    goto :goto_f

    .line 398
    :cond_21
    add-int/lit8 v5, v7, 0x1

    .line 399
    .line 400
    aget-char v7, v1, v7

    .line 401
    .line 402
    :goto_f
    move v10, v7

    .line 403
    goto :goto_10

    .line 404
    :cond_22
    move v10, v5

    .line 405
    move v5, v7

    .line 406
    move-wide/from16 v11, v16

    .line 407
    .line 408
    :cond_23
    :goto_10
    cmp-long v7, v11, v18

    .line 409
    .line 410
    if-gtz v7, :cond_26

    .line 411
    .line 412
    if-eqz v2, :cond_26

    .line 413
    .line 414
    if-ne v10, v2, :cond_25

    .line 415
    .line 416
    if-ne v5, v4, :cond_24

    .line 417
    .line 418
    move v2, v5

    .line 419
    const/16 v5, 0x1a

    .line 420
    .line 421
    goto :goto_11

    .line 422
    :cond_24
    add-int/lit8 v2, v5, 0x1

    .line 423
    .line 424
    aget-char v5, v1, v5

    .line 425
    .line 426
    :goto_11
    move v10, v5

    .line 427
    move v5, v2

    .line 428
    goto :goto_12

    .line 429
    :cond_25
    move-wide/from16 v11, v16

    .line 430
    .line 431
    :cond_26
    :goto_12
    cmp-long v2, v11, v18

    .line 432
    .line 433
    if-gtz v2, :cond_2f

    .line 434
    .line 435
    if-nez v6, :cond_27

    .line 436
    .line 437
    long-to-float v7, v11

    .line 438
    :goto_13
    const/4 v9, 0x1

    .line 439
    goto :goto_14

    .line 440
    :cond_27
    long-to-float v7, v11

    .line 441
    float-to-long v14, v7

    .line 442
    cmp-long v9, v14, v11

    .line 443
    .line 444
    if-nez v9, :cond_29

    .line 445
    .line 446
    if-lez v6, :cond_28

    .line 447
    .line 448
    sget-object v9, Lcom/alibaba/fastjson2/JSONFactory;->FLOAT_10_POW:[F

    .line 449
    .line 450
    array-length v13, v9

    .line 451
    if-ge v6, v13, :cond_28

    .line 452
    .line 453
    aget v9, v9, v6

    .line 454
    .line 455
    div-float/2addr v7, v9

    .line 456
    goto :goto_13

    .line 457
    :cond_28
    if-gez v6, :cond_29

    .line 458
    .line 459
    sget-object v9, Lcom/alibaba/fastjson2/JSONFactory;->FLOAT_10_POW:[F

    .line 460
    .line 461
    array-length v13, v9

    .line 462
    neg-int v13, v13

    .line 463
    if-le v6, v13, :cond_29

    .line 464
    .line 465
    neg-int v13, v6

    .line 466
    aget v9, v9, v13

    .line 467
    .line 468
    mul-float/2addr v7, v9

    .line 469
    goto :goto_13

    .line 470
    :cond_29
    move/from16 v7, v24

    .line 471
    .line 472
    const/4 v9, 0x0

    .line 473
    :goto_14
    if-nez v9, :cond_2c

    .line 474
    .line 475
    const/16 v2, -0x80

    .line 476
    .line 477
    if-le v6, v2, :cond_2b

    .line 478
    .line 479
    const/16 v2, 0x80

    .line 480
    .line 481
    if-ge v6, v2, :cond_2b

    .line 482
    .line 483
    const/16 v14, 0x2d

    .line 484
    .line 485
    if-ne v3, v14, :cond_2a

    .line 486
    .line 487
    const/4 v13, -0x1

    .line 488
    goto :goto_15

    .line 489
    :cond_2a
    const/4 v13, 0x1

    .line 490
    :goto_15
    invoke-static {v11, v12}, Ljava/lang/Math;->abs(J)J

    .line 491
    .line 492
    .line 493
    move-result-wide v2

    .line 494
    invoke-static {v13, v2, v3, v6}, Lcom/alibaba/fastjson2/util/TypeUtils;->floatValue(IJI)F

    .line 495
    .line 496
    .line 497
    move-result v14

    .line 498
    :goto_16
    move v3, v10

    .line 499
    :goto_17
    const/4 v13, 0x0

    .line 500
    goto :goto_19

    .line 501
    :cond_2b
    move v14, v7

    .line 502
    move v3, v10

    .line 503
    move-wide/from16 v11, v16

    .line 504
    .line 505
    goto :goto_17

    .line 506
    :cond_2c
    const/16 v14, 0x2d

    .line 507
    .line 508
    if-eq v3, v14, :cond_2d

    .line 509
    .line 510
    cmpl-float v2, v7, v24

    .line 511
    .line 512
    if-eqz v2, :cond_2e

    .line 513
    .line 514
    :goto_18
    neg-float v14, v7

    .line 515
    goto :goto_16

    .line 516
    :cond_2d
    if-nez v2, :cond_2e

    .line 517
    .line 518
    goto :goto_18

    .line 519
    :cond_2e
    move v14, v7

    .line 520
    goto :goto_16

    .line 521
    :cond_2f
    move v3, v10

    .line 522
    move/from16 v14, v24

    .line 523
    .line 524
    goto :goto_17

    .line 525
    :goto_19
    cmp-long v2, v11, v18

    .line 526
    .line 527
    if-lez v2, :cond_30

    .line 528
    .line 529
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->readNumber0()V

    .line 530
    .line 531
    .line 532
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReader;->getFloatValue()F

    .line 533
    .line 534
    .line 535
    move-result v1

    .line 536
    return v1

    .line 537
    :cond_30
    :goto_1a
    const-wide v6, 0x100003701L

    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    const/16 v2, 0x20

    .line 543
    .line 544
    if-gt v3, v2, :cond_32

    .line 545
    .line 546
    shl-long v9, v16, v3

    .line 547
    .line 548
    and-long/2addr v9, v6

    .line 549
    cmp-long v9, v9, v18

    .line 550
    .line 551
    if-eqz v9, :cond_32

    .line 552
    .line 553
    if-ne v5, v4, :cond_31

    .line 554
    .line 555
    const/16 v3, 0x1a

    .line 556
    .line 557
    goto :goto_1a

    .line 558
    :cond_31
    add-int/lit8 v2, v5, 0x1

    .line 559
    .line 560
    aget-char v3, v1, v5

    .line 561
    .line 562
    move v5, v2

    .line 563
    goto :goto_1a

    .line 564
    :cond_32
    if-ne v3, v8, :cond_33

    .line 565
    .line 566
    const/4 v8, 0x1

    .line 567
    goto :goto_1b

    .line 568
    :cond_33
    const/4 v8, 0x0

    .line 569
    :goto_1b
    iput-boolean v8, v0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 570
    .line 571
    if-eqz v8, :cond_36

    .line 572
    .line 573
    if-ne v5, v4, :cond_34

    .line 574
    .line 575
    move v3, v5

    .line 576
    const/16 v5, 0x1a

    .line 577
    .line 578
    goto :goto_1c

    .line 579
    :cond_34
    add-int/lit8 v3, v5, 0x1

    .line 580
    .line 581
    aget-char v5, v1, v5

    .line 582
    .line 583
    :goto_1c
    move/from16 v31, v5

    .line 584
    .line 585
    move v5, v3

    .line 586
    move/from16 v3, v31

    .line 587
    .line 588
    :goto_1d
    if-gt v3, v2, :cond_36

    .line 589
    .line 590
    shl-long v8, v16, v3

    .line 591
    .line 592
    and-long/2addr v8, v6

    .line 593
    cmp-long v8, v8, v18

    .line 594
    .line 595
    if-eqz v8, :cond_36

    .line 596
    .line 597
    if-ne v5, v4, :cond_35

    .line 598
    .line 599
    const/16 v3, 0x1a

    .line 600
    .line 601
    goto :goto_1d

    .line 602
    :cond_35
    add-int/lit8 v3, v5, 0x1

    .line 603
    .line 604
    aget-char v5, v1, v5

    .line 605
    .line 606
    goto :goto_1c

    .line 607
    :cond_36
    iput-boolean v13, v0, Lcom/alibaba/fastjson2/JSONReader;->wasNull:Z

    .line 608
    .line 609
    int-to-char v1, v3

    .line 610
    iput-char v1, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 611
    .line 612
    iput v5, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 613
    .line 614
    return v14
.end method

.method public readHex()[B
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-char v1, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 4
    .line 5
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 6
    .line 7
    iget-object v3, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 8
    .line 9
    const/16 v4, 0x78

    .line 10
    .line 11
    const/16 v5, 0x1a

    .line 12
    .line 13
    if-ne v1, v4, :cond_1

    .line 14
    .line 15
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 16
    .line 17
    if-ne v2, v1, :cond_0

    .line 18
    .line 19
    move v1, v5

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    add-int/lit8 v1, v2, 0x1

    .line 22
    .line 23
    aget-char v2, v3, v2

    .line 24
    .line 25
    move/from16 v17, v2

    .line 26
    .line 27
    move v2, v1

    .line 28
    move/from16 v1, v17

    .line 29
    .line 30
    :cond_1
    :goto_0
    const/16 v4, 0x27

    .line 31
    .line 32
    if-eq v1, v4, :cond_3

    .line 33
    .line 34
    const/16 v4, 0x22

    .line 35
    .line 36
    if-ne v1, v4, :cond_2

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_2
    invoke-static {v2, v1}, Lcom/alibaba/fastjson2/JSONReader;->syntaxError(II)Lcom/alibaba/fastjson2/JSONException;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    throw v1

    .line 44
    :cond_3
    :goto_1
    iget v4, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 45
    .line 46
    if-ne v2, v4, :cond_4

    .line 47
    .line 48
    move v4, v2

    .line 49
    :goto_2
    move v6, v5

    .line 50
    goto :goto_3

    .line 51
    :cond_4
    add-int/lit8 v4, v2, 0x1

    .line 52
    .line 53
    aget-char v6, v3, v2

    .line 54
    .line 55
    :goto_3
    const/16 v7, 0x39

    .line 56
    .line 57
    const/16 v8, 0x30

    .line 58
    .line 59
    if-lt v6, v8, :cond_5

    .line 60
    .line 61
    if-le v6, v7, :cond_6

    .line 62
    .line 63
    :cond_5
    const/16 v9, 0x41

    .line 64
    .line 65
    if-lt v6, v9, :cond_8

    .line 66
    .line 67
    const/16 v9, 0x46

    .line 68
    .line 69
    if-gt v6, v9, :cond_8

    .line 70
    .line 71
    :cond_6
    iget v6, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 72
    .line 73
    if-ne v4, v6, :cond_7

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_7
    add-int/lit8 v6, v4, 0x1

    .line 77
    .line 78
    aget-char v4, v3, v4

    .line 79
    .line 80
    move/from16 v17, v6

    .line 81
    .line 82
    move v6, v4

    .line 83
    move/from16 v4, v17

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_8
    if-ne v6, v1, :cond_17

    .line 87
    .line 88
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 89
    .line 90
    if-ne v4, v1, :cond_9

    .line 91
    .line 92
    move v1, v4

    .line 93
    move v4, v5

    .line 94
    goto :goto_4

    .line 95
    :cond_9
    add-int/lit8 v1, v4, 0x1

    .line 96
    .line 97
    aget-char v4, v3, v4

    .line 98
    .line 99
    :goto_4
    sub-int v6, v1, v2

    .line 100
    .line 101
    add-int/lit8 v9, v6, -0x2

    .line 102
    .line 103
    const/4 v10, 0x1

    .line 104
    if-ne v4, v5, :cond_a

    .line 105
    .line 106
    add-int/lit8 v9, v6, -0x1

    .line 107
    .line 108
    :cond_a
    rem-int/lit8 v6, v9, 0x2

    .line 109
    .line 110
    if-nez v6, :cond_16

    .line 111
    .line 112
    div-int/lit8 v9, v9, 0x2

    .line 113
    .line 114
    new-array v6, v9, [B

    .line 115
    .line 116
    const/4 v11, 0x0

    .line 117
    :goto_5
    if-ge v11, v9, :cond_d

    .line 118
    .line 119
    mul-int/lit8 v12, v11, 0x2

    .line 120
    .line 121
    add-int/2addr v12, v2

    .line 122
    aget-char v13, v3, v12

    .line 123
    .line 124
    add-int/2addr v12, v10

    .line 125
    aget-char v12, v3, v12

    .line 126
    .line 127
    const/16 v14, 0x37

    .line 128
    .line 129
    if-gt v13, v7, :cond_b

    .line 130
    .line 131
    move v15, v8

    .line 132
    goto :goto_6

    .line 133
    :cond_b
    move v15, v14

    .line 134
    :goto_6
    sub-int/2addr v13, v15

    .line 135
    if-gt v12, v7, :cond_c

    .line 136
    .line 137
    move v14, v8

    .line 138
    :cond_c
    sub-int/2addr v12, v14

    .line 139
    shl-int/lit8 v13, v13, 0x4

    .line 140
    .line 141
    or-int/2addr v12, v13

    .line 142
    int-to-byte v12, v12

    .line 143
    aput-byte v12, v6, v11

    .line 144
    .line 145
    add-int/lit8 v11, v11, 0x1

    .line 146
    .line 147
    goto :goto_5

    .line 148
    :cond_d
    :goto_7
    const-wide/16 v7, 0x0

    .line 149
    .line 150
    const-wide v11, 0x100003701L

    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    const-wide/16 v13, 0x1

    .line 156
    .line 157
    const/16 v2, 0x20

    .line 158
    .line 159
    if-gt v4, v2, :cond_f

    .line 160
    .line 161
    shl-long v15, v13, v4

    .line 162
    .line 163
    and-long/2addr v15, v11

    .line 164
    cmp-long v9, v15, v7

    .line 165
    .line 166
    if-eqz v9, :cond_f

    .line 167
    .line 168
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 169
    .line 170
    if-ne v1, v2, :cond_e

    .line 171
    .line 172
    move v4, v5

    .line 173
    goto :goto_7

    .line 174
    :cond_e
    add-int/lit8 v2, v1, 0x1

    .line 175
    .line 176
    aget-char v1, v3, v1

    .line 177
    .line 178
    move v4, v1

    .line 179
    move v1, v2

    .line 180
    goto :goto_7

    .line 181
    :cond_f
    const/16 v9, 0x2c

    .line 182
    .line 183
    if-ne v4, v9, :cond_15

    .line 184
    .line 185
    iget v9, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 186
    .line 187
    if-lt v1, v9, :cond_10

    .line 188
    .line 189
    goto :goto_a

    .line 190
    :cond_10
    iput-boolean v10, v0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 191
    .line 192
    if-ne v1, v9, :cond_11

    .line 193
    .line 194
    move v4, v1

    .line 195
    :goto_8
    move v1, v5

    .line 196
    goto :goto_9

    .line 197
    :cond_11
    add-int/lit8 v4, v1, 0x1

    .line 198
    .line 199
    aget-char v1, v3, v1

    .line 200
    .line 201
    :goto_9
    if-gt v1, v2, :cond_13

    .line 202
    .line 203
    shl-long v9, v13, v1

    .line 204
    .line 205
    and-long/2addr v9, v11

    .line 206
    cmp-long v9, v9, v7

    .line 207
    .line 208
    if-eqz v9, :cond_13

    .line 209
    .line 210
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 211
    .line 212
    if-ne v4, v1, :cond_12

    .line 213
    .line 214
    goto :goto_8

    .line 215
    :cond_12
    add-int/lit8 v1, v4, 0x1

    .line 216
    .line 217
    aget-char v4, v3, v4

    .line 218
    .line 219
    move/from16 v17, v4

    .line 220
    .line 221
    move v4, v1

    .line 222
    move/from16 v1, v17

    .line 223
    .line 224
    goto :goto_9

    .line 225
    :cond_13
    iput v4, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 226
    .line 227
    iput-char v1, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 228
    .line 229
    const/16 v2, 0x2f

    .line 230
    .line 231
    if-ne v1, v2, :cond_14

    .line 232
    .line 233
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->skipComment()V

    .line 234
    .line 235
    .line 236
    :cond_14
    return-object v6

    .line 237
    :cond_15
    :goto_a
    iput v1, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 238
    .line 239
    iput-char v4, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 240
    .line 241
    return-object v6

    .line 242
    :cond_16
    invoke-static {v1, v4}, Lcom/alibaba/fastjson2/JSONReader;->syntaxError(II)Lcom/alibaba/fastjson2/JSONException;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    throw v1

    .line 247
    :cond_17
    invoke-static {v4, v6}, Lcom/alibaba/fastjson2/JSONReader;->syntaxError(II)Lcom/alibaba/fastjson2/JSONException;

    .line 248
    .line 249
    .line 250
    move-result-object v1

    .line 251
    throw v1
.end method

.method public readIfNull()Z
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 4
    .line 5
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 6
    .line 7
    iget-char v3, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 8
    .line 9
    const/16 v4, 0x6e

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    if-ne v3, v4, :cond_7

    .line 13
    .line 14
    aget-char v3, v1, v2

    .line 15
    .line 16
    const/16 v4, 0x75

    .line 17
    .line 18
    if-ne v3, v4, :cond_7

    .line 19
    .line 20
    add-int/lit8 v3, v2, 0x1

    .line 21
    .line 22
    aget-char v3, v1, v3

    .line 23
    .line 24
    const/16 v4, 0x6c

    .line 25
    .line 26
    if-ne v3, v4, :cond_7

    .line 27
    .line 28
    add-int/lit8 v3, v2, 0x2

    .line 29
    .line 30
    aget-char v3, v1, v3

    .line 31
    .line 32
    if-ne v3, v4, :cond_7

    .line 33
    .line 34
    add-int/lit8 v3, v2, 0x3

    .line 35
    .line 36
    iget v4, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 37
    .line 38
    const/16 v6, 0x1a

    .line 39
    .line 40
    if-ne v3, v4, :cond_0

    .line 41
    .line 42
    move v3, v6

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    aget-char v3, v1, v3

    .line 45
    .line 46
    :goto_0
    add-int/lit8 v2, v2, 0x4

    .line 47
    .line 48
    :goto_1
    const-wide/16 v7, 0x0

    .line 49
    .line 50
    const-wide v9, 0x100003701L

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    const-wide/16 v11, 0x1

    .line 56
    .line 57
    const/16 v4, 0x20

    .line 58
    .line 59
    if-gt v3, v4, :cond_2

    .line 60
    .line 61
    shl-long v13, v11, v3

    .line 62
    .line 63
    and-long/2addr v13, v9

    .line 64
    cmp-long v13, v13, v7

    .line 65
    .line 66
    if-eqz v13, :cond_2

    .line 67
    .line 68
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 69
    .line 70
    if-ne v2, v3, :cond_1

    .line 71
    .line 72
    move v3, v6

    .line 73
    goto :goto_1

    .line 74
    :cond_1
    add-int/lit8 v3, v2, 0x1

    .line 75
    .line 76
    aget-char v2, v1, v2

    .line 77
    .line 78
    move/from16 v17, v3

    .line 79
    .line 80
    move v3, v2

    .line 81
    move/from16 v2, v17

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_2
    const/16 v13, 0x2c

    .line 85
    .line 86
    const/4 v14, 0x1

    .line 87
    if-ne v3, v13, :cond_3

    .line 88
    .line 89
    move v5, v14

    .line 90
    :cond_3
    iput-boolean v5, v0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 91
    .line 92
    if-eqz v5, :cond_6

    .line 93
    .line 94
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 95
    .line 96
    if-ne v2, v3, :cond_4

    .line 97
    .line 98
    move v3, v2

    .line 99
    move v2, v6

    .line 100
    goto :goto_2

    .line 101
    :cond_4
    add-int/lit8 v3, v2, 0x1

    .line 102
    .line 103
    aget-char v2, v1, v2

    .line 104
    .line 105
    :goto_2
    move/from16 v17, v3

    .line 106
    .line 107
    move v3, v2

    .line 108
    move/from16 v2, v17

    .line 109
    .line 110
    :goto_3
    if-gt v3, v4, :cond_6

    .line 111
    .line 112
    shl-long v15, v11, v3

    .line 113
    .line 114
    and-long/2addr v15, v9

    .line 115
    cmp-long v5, v15, v7

    .line 116
    .line 117
    if-eqz v5, :cond_6

    .line 118
    .line 119
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 120
    .line 121
    if-ne v2, v3, :cond_5

    .line 122
    .line 123
    move v3, v6

    .line 124
    goto :goto_3

    .line 125
    :cond_5
    add-int/lit8 v3, v2, 0x1

    .line 126
    .line 127
    aget-char v2, v1, v2

    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_6
    iput-char v3, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 131
    .line 132
    iput v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 133
    .line 134
    return v14

    .line 135
    :cond_7
    return v5
.end method

.method public readInt32Value()I
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-char v1, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 4
    .line 5
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 6
    .line 7
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 8
    .line 9
    iget-object v4, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 10
    .line 11
    const/16 v5, 0x22

    .line 12
    .line 13
    if-eq v1, v5, :cond_1

    .line 14
    .line 15
    const/16 v5, 0x27

    .line 16
    .line 17
    if-ne v1, v5, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v5, v2

    .line 21
    const/4 v2, 0x0

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    :goto_0
    add-int/lit8 v5, v2, 0x1

    .line 24
    .line 25
    aget-char v2, v4, v2

    .line 26
    .line 27
    move/from16 v20, v2

    .line 28
    .line 29
    move v2, v1

    .line 30
    move/from16 v1, v20

    .line 31
    .line 32
    :goto_1
    const/16 v7, 0x39

    .line 33
    .line 34
    const/16 v8, 0x2d

    .line 35
    .line 36
    const/16 v9, 0x30

    .line 37
    .line 38
    const/4 v10, 0x1

    .line 39
    if-lt v1, v9, :cond_2

    .line 40
    .line 41
    if-gt v1, v7, :cond_2

    .line 42
    .line 43
    rsub-int/lit8 v11, v1, 0x30

    .line 44
    .line 45
    goto :goto_3

    .line 46
    :cond_2
    if-eq v1, v8, :cond_4

    .line 47
    .line 48
    const/16 v11, 0x2b

    .line 49
    .line 50
    if-ne v1, v11, :cond_3

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_3
    move v11, v10

    .line 54
    goto :goto_3

    .line 55
    :cond_4
    :goto_2
    const/4 v11, 0x0

    .line 56
    :goto_3
    add-int/lit8 v12, v5, 0x1

    .line 57
    .line 58
    if-ge v12, v3, :cond_7

    .line 59
    .line 60
    invoke-static {v4, v5}, Lcom/alibaba/fastjson2/util/IOUtils;->digit2([CI)I

    .line 61
    .line 62
    .line 63
    move-result v13

    .line 64
    const/4 v14, -0x1

    .line 65
    if-eq v13, v14, :cond_7

    .line 66
    .line 67
    const v14, -0x147ae14

    .line 68
    .line 69
    .line 70
    if-gt v14, v11, :cond_5

    .line 71
    .line 72
    move v14, v10

    .line 73
    goto :goto_4

    .line 74
    :cond_5
    const/4 v14, 0x0

    .line 75
    :goto_4
    if-gtz v11, :cond_6

    .line 76
    .line 77
    move v15, v10

    .line 78
    goto :goto_5

    .line 79
    :cond_6
    const/4 v15, 0x0

    .line 80
    :goto_5
    and-int/2addr v14, v15

    .line 81
    if-eqz v14, :cond_7

    .line 82
    .line 83
    mul-int/lit8 v11, v11, 0x64

    .line 84
    .line 85
    sub-int/2addr v11, v13

    .line 86
    add-int/lit8 v5, v5, 0x2

    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_7
    if-ge v5, v3, :cond_a

    .line 90
    .line 91
    aget-char v13, v4, v5

    .line 92
    .line 93
    if-lt v13, v9, :cond_a

    .line 94
    .line 95
    if-gt v13, v7, :cond_a

    .line 96
    .line 97
    const v7, -0xccccccc

    .line 98
    .line 99
    .line 100
    if-gt v7, v11, :cond_8

    .line 101
    .line 102
    move v7, v10

    .line 103
    goto :goto_6

    .line 104
    :cond_8
    const/4 v7, 0x0

    .line 105
    :goto_6
    if-gtz v11, :cond_9

    .line 106
    .line 107
    move v14, v10

    .line 108
    goto :goto_7

    .line 109
    :cond_9
    const/4 v14, 0x0

    .line 110
    :goto_7
    and-int/2addr v7, v14

    .line 111
    if-eqz v7, :cond_a

    .line 112
    .line 113
    mul-int/lit8 v11, v11, 0xa

    .line 114
    .line 115
    add-int/2addr v11, v9

    .line 116
    sub-int/2addr v11, v13

    .line 117
    move v5, v12

    .line 118
    :cond_a
    const/16 v7, 0x1a

    .line 119
    .line 120
    if-ne v5, v3, :cond_b

    .line 121
    .line 122
    move v9, v5

    .line 123
    move v5, v7

    .line 124
    goto :goto_8

    .line 125
    :cond_b
    add-int/lit8 v9, v5, 0x1

    .line 126
    .line 127
    aget-char v5, v4, v5

    .line 128
    .line 129
    :goto_8
    if-gtz v11, :cond_1a

    .line 130
    .line 131
    const/high16 v12, -0x80000000

    .line 132
    .line 133
    if-lt v12, v11, :cond_c

    .line 134
    .line 135
    if-ne v1, v8, :cond_1a

    .line 136
    .line 137
    :cond_c
    sget-object v12, Lcom/alibaba/fastjson2/JSONReader;->INT_VALUE_END:[Z

    .line 138
    .line 139
    and-int/lit16 v13, v5, 0xff

    .line 140
    .line 141
    aget-boolean v12, v12, v13

    .line 142
    .line 143
    if-eqz v12, :cond_1a

    .line 144
    .line 145
    if-eqz v2, :cond_d

    .line 146
    .line 147
    if-ne v5, v2, :cond_1a

    .line 148
    .line 149
    :cond_d
    if-eqz v2, :cond_f

    .line 150
    .line 151
    if-ne v9, v3, :cond_e

    .line 152
    .line 153
    move v5, v7

    .line 154
    goto :goto_9

    .line 155
    :cond_e
    add-int/lit8 v2, v9, 0x1

    .line 156
    .line 157
    aget-char v5, v4, v9

    .line 158
    .line 159
    move v9, v2

    .line 160
    :cond_f
    :goto_9
    const/16 v2, 0x4c

    .line 161
    .line 162
    if-eq v5, v2, :cond_10

    .line 163
    .line 164
    const/16 v2, 0x46

    .line 165
    .line 166
    if-eq v5, v2, :cond_10

    .line 167
    .line 168
    const/16 v2, 0x44

    .line 169
    .line 170
    if-eq v5, v2, :cond_10

    .line 171
    .line 172
    const/16 v2, 0x42

    .line 173
    .line 174
    if-eq v5, v2, :cond_10

    .line 175
    .line 176
    const/16 v2, 0x53

    .line 177
    .line 178
    if-ne v5, v2, :cond_12

    .line 179
    .line 180
    :cond_10
    if-ne v9, v3, :cond_11

    .line 181
    .line 182
    :goto_a
    move v5, v7

    .line 183
    goto :goto_c

    .line 184
    :cond_11
    add-int/lit8 v2, v9, 0x1

    .line 185
    .line 186
    aget-char v5, v4, v9

    .line 187
    .line 188
    :goto_b
    move v9, v2

    .line 189
    :cond_12
    :goto_c
    const-wide/16 v12, 0x0

    .line 190
    .line 191
    const-wide v14, 0x100003701L

    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    const-wide/16 v16, 0x1

    .line 197
    .line 198
    const/16 v2, 0x20

    .line 199
    .line 200
    if-gt v5, v2, :cond_14

    .line 201
    .line 202
    shl-long v18, v16, v5

    .line 203
    .line 204
    and-long v18, v18, v14

    .line 205
    .line 206
    cmp-long v18, v18, v12

    .line 207
    .line 208
    if-eqz v18, :cond_14

    .line 209
    .line 210
    if-ne v9, v3, :cond_13

    .line 211
    .line 212
    goto :goto_a

    .line 213
    :cond_13
    add-int/lit8 v2, v9, 0x1

    .line 214
    .line 215
    aget-char v5, v4, v9

    .line 216
    .line 217
    goto :goto_b

    .line 218
    :cond_14
    const/16 v6, 0x2c

    .line 219
    .line 220
    if-ne v5, v6, :cond_15

    .line 221
    .line 222
    move v6, v10

    .line 223
    goto :goto_d

    .line 224
    :cond_15
    const/4 v6, 0x0

    .line 225
    :goto_d
    iput-boolean v6, v0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 226
    .line 227
    if-eqz v6, :cond_18

    .line 228
    .line 229
    if-ne v9, v3, :cond_16

    .line 230
    .line 231
    move v6, v7

    .line 232
    goto :goto_e

    .line 233
    :cond_16
    add-int/lit8 v5, v9, 0x1

    .line 234
    .line 235
    aget-char v6, v4, v9

    .line 236
    .line 237
    goto :goto_10

    .line 238
    :goto_e
    move v5, v6

    .line 239
    :goto_f
    if-gt v5, v2, :cond_18

    .line 240
    .line 241
    shl-long v18, v16, v5

    .line 242
    .line 243
    and-long v18, v18, v14

    .line 244
    .line 245
    cmp-long v6, v18, v12

    .line 246
    .line 247
    if-eqz v6, :cond_18

    .line 248
    .line 249
    if-ne v9, v3, :cond_17

    .line 250
    .line 251
    move v5, v7

    .line 252
    goto :goto_f

    .line 253
    :cond_17
    add-int/lit8 v5, v9, 0x1

    .line 254
    .line 255
    aget-char v6, v4, v9

    .line 256
    .line 257
    :goto_10
    move v9, v5

    .line 258
    goto :goto_e

    .line 259
    :cond_18
    int-to-char v2, v5

    .line 260
    iput-char v2, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 261
    .line 262
    iput v9, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 263
    .line 264
    if-ne v1, v8, :cond_19

    .line 265
    .line 266
    return v11

    .line 267
    :cond_19
    neg-int v1, v11

    .line 268
    return v1

    .line 269
    :cond_1a
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReader;->readInt32ValueOverflow()I

    .line 270
    .line 271
    .line 272
    move-result v1

    .line 273
    return v1
.end method

.method public readInt64Value()J
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-char v1, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 4
    .line 5
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 6
    .line 7
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 8
    .line 9
    iget-object v4, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 10
    .line 11
    const/16 v5, 0x22

    .line 12
    .line 13
    if-eq v1, v5, :cond_1

    .line 14
    .line 15
    const/16 v5, 0x27

    .line 16
    .line 17
    if-ne v1, v5, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v5, v2

    .line 21
    const/4 v2, 0x0

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    :goto_0
    add-int/lit8 v5, v2, 0x1

    .line 24
    .line 25
    aget-char v2, v4, v2

    .line 26
    .line 27
    move/from16 v22, v2

    .line 28
    .line 29
    move v2, v1

    .line 30
    move/from16 v1, v22

    .line 31
    .line 32
    :goto_1
    const/16 v7, 0x39

    .line 33
    .line 34
    const/16 v10, 0x2d

    .line 35
    .line 36
    const/16 v11, 0x30

    .line 37
    .line 38
    const-wide/16 v12, 0x0

    .line 39
    .line 40
    if-lt v1, v11, :cond_2

    .line 41
    .line 42
    if-gt v1, v7, :cond_2

    .line 43
    .line 44
    rsub-int/lit8 v14, v1, 0x30

    .line 45
    .line 46
    int-to-long v14, v14

    .line 47
    goto :goto_3

    .line 48
    :cond_2
    if-eq v1, v10, :cond_4

    .line 49
    .line 50
    const/16 v14, 0x2b

    .line 51
    .line 52
    if-ne v1, v14, :cond_3

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_3
    const-wide/16 v14, 0x1

    .line 56
    .line 57
    goto :goto_3

    .line 58
    :cond_4
    :goto_2
    move-wide v14, v12

    .line 59
    :goto_3
    add-int/lit8 v6, v5, 0x1

    .line 60
    .line 61
    const/16 v17, 0x1

    .line 62
    .line 63
    const-wide/16 v18, 0x1

    .line 64
    .line 65
    if-ge v6, v3, :cond_7

    .line 66
    .line 67
    invoke-static {v4, v5}, Lcom/alibaba/fastjson2/util/IOUtils;->digit2([CI)I

    .line 68
    .line 69
    .line 70
    move-result v8

    .line 71
    const/4 v9, -0x1

    .line 72
    if-eq v8, v9, :cond_7

    .line 73
    .line 74
    const-wide v20, -0x147ae147ae147aeL

    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    cmp-long v9, v20, v14

    .line 80
    .line 81
    if-gtz v9, :cond_5

    .line 82
    .line 83
    move/from16 v9, v17

    .line 84
    .line 85
    goto :goto_4

    .line 86
    :cond_5
    const/4 v9, 0x0

    .line 87
    :goto_4
    cmp-long v20, v14, v12

    .line 88
    .line 89
    if-gtz v20, :cond_6

    .line 90
    .line 91
    move/from16 v20, v17

    .line 92
    .line 93
    goto :goto_5

    .line 94
    :cond_6
    const/16 v20, 0x0

    .line 95
    .line 96
    :goto_5
    and-int v9, v9, v20

    .line 97
    .line 98
    if-eqz v9, :cond_7

    .line 99
    .line 100
    const-wide/16 v20, 0x64

    .line 101
    .line 102
    mul-long v14, v14, v20

    .line 103
    .line 104
    int-to-long v8, v8

    .line 105
    sub-long/2addr v14, v8

    .line 106
    add-int/lit8 v5, v5, 0x2

    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_7
    if-ge v5, v3, :cond_a

    .line 110
    .line 111
    aget-char v8, v4, v5

    .line 112
    .line 113
    if-lt v8, v11, :cond_a

    .line 114
    .line 115
    if-gt v8, v7, :cond_a

    .line 116
    .line 117
    const-wide v20, -0xcccccccccccccccL

    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    cmp-long v7, v20, v14

    .line 123
    .line 124
    if-gtz v7, :cond_8

    .line 125
    .line 126
    move/from16 v7, v17

    .line 127
    .line 128
    goto :goto_6

    .line 129
    :cond_8
    const/4 v7, 0x0

    .line 130
    :goto_6
    cmp-long v9, v14, v12

    .line 131
    .line 132
    if-gtz v9, :cond_9

    .line 133
    .line 134
    move/from16 v9, v17

    .line 135
    .line 136
    goto :goto_7

    .line 137
    :cond_9
    const/4 v9, 0x0

    .line 138
    :goto_7
    and-int/2addr v7, v9

    .line 139
    if-eqz v7, :cond_a

    .line 140
    .line 141
    const-wide/16 v20, 0xa

    .line 142
    .line 143
    mul-long v14, v14, v20

    .line 144
    .line 145
    const-wide/16 v20, 0x30

    .line 146
    .line 147
    add-long v14, v14, v20

    .line 148
    .line 149
    int-to-long v7, v8

    .line 150
    sub-long/2addr v14, v7

    .line 151
    move v5, v6

    .line 152
    :cond_a
    const/16 v6, 0x1a

    .line 153
    .line 154
    if-ne v5, v3, :cond_b

    .line 155
    .line 156
    move v7, v5

    .line 157
    move v5, v6

    .line 158
    goto :goto_8

    .line 159
    :cond_b
    add-int/lit8 v7, v5, 0x1

    .line 160
    .line 161
    aget-char v5, v4, v5

    .line 162
    .line 163
    :goto_8
    cmp-long v8, v14, v12

    .line 164
    .line 165
    if-gtz v8, :cond_1a

    .line 166
    .line 167
    const-wide/high16 v8, -0x8000000000000000L

    .line 168
    .line 169
    cmp-long v8, v8, v14

    .line 170
    .line 171
    if-ltz v8, :cond_c

    .line 172
    .line 173
    if-ne v1, v10, :cond_1a

    .line 174
    .line 175
    :cond_c
    sget-object v8, Lcom/alibaba/fastjson2/JSONReader;->INT_VALUE_END:[Z

    .line 176
    .line 177
    and-int/lit16 v9, v5, 0xff

    .line 178
    .line 179
    aget-boolean v8, v8, v9

    .line 180
    .line 181
    if-eqz v8, :cond_1a

    .line 182
    .line 183
    if-eqz v2, :cond_d

    .line 184
    .line 185
    if-ne v5, v2, :cond_1a

    .line 186
    .line 187
    :cond_d
    if-eqz v2, :cond_f

    .line 188
    .line 189
    if-ne v7, v3, :cond_e

    .line 190
    .line 191
    move v5, v6

    .line 192
    goto :goto_9

    .line 193
    :cond_e
    add-int/lit8 v2, v7, 0x1

    .line 194
    .line 195
    aget-char v5, v4, v7

    .line 196
    .line 197
    move v7, v2

    .line 198
    :cond_f
    :goto_9
    const/16 v2, 0x4c

    .line 199
    .line 200
    if-eq v5, v2, :cond_10

    .line 201
    .line 202
    const/16 v2, 0x46

    .line 203
    .line 204
    if-eq v5, v2, :cond_10

    .line 205
    .line 206
    const/16 v2, 0x44

    .line 207
    .line 208
    if-eq v5, v2, :cond_10

    .line 209
    .line 210
    const/16 v2, 0x42

    .line 211
    .line 212
    if-eq v5, v2, :cond_10

    .line 213
    .line 214
    const/16 v2, 0x53

    .line 215
    .line 216
    if-ne v5, v2, :cond_12

    .line 217
    .line 218
    :cond_10
    if-ne v7, v3, :cond_11

    .line 219
    .line 220
    :goto_a
    move v5, v6

    .line 221
    goto :goto_c

    .line 222
    :cond_11
    add-int/lit8 v2, v7, 0x1

    .line 223
    .line 224
    aget-char v5, v4, v7

    .line 225
    .line 226
    :goto_b
    move v7, v2

    .line 227
    :cond_12
    :goto_c
    const-wide v8, 0x100003701L

    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    const/16 v2, 0x20

    .line 233
    .line 234
    if-gt v5, v2, :cond_14

    .line 235
    .line 236
    shl-long v20, v18, v5

    .line 237
    .line 238
    and-long v20, v20, v8

    .line 239
    .line 240
    cmp-long v11, v20, v12

    .line 241
    .line 242
    if-eqz v11, :cond_14

    .line 243
    .line 244
    if-ne v7, v3, :cond_13

    .line 245
    .line 246
    goto :goto_a

    .line 247
    :cond_13
    add-int/lit8 v2, v7, 0x1

    .line 248
    .line 249
    aget-char v5, v4, v7

    .line 250
    .line 251
    goto :goto_b

    .line 252
    :cond_14
    const/16 v11, 0x2c

    .line 253
    .line 254
    if-ne v5, v11, :cond_15

    .line 255
    .line 256
    move/from16 v11, v17

    .line 257
    .line 258
    goto :goto_d

    .line 259
    :cond_15
    const/4 v11, 0x0

    .line 260
    :goto_d
    iput-boolean v11, v0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 261
    .line 262
    if-eqz v11, :cond_18

    .line 263
    .line 264
    if-ne v7, v3, :cond_16

    .line 265
    .line 266
    move v5, v7

    .line 267
    move v7, v6

    .line 268
    goto :goto_e

    .line 269
    :cond_16
    add-int/lit8 v5, v7, 0x1

    .line 270
    .line 271
    aget-char v7, v4, v7

    .line 272
    .line 273
    :goto_e
    move/from16 v22, v7

    .line 274
    .line 275
    move v7, v5

    .line 276
    move/from16 v5, v22

    .line 277
    .line 278
    :goto_f
    if-gt v5, v2, :cond_18

    .line 279
    .line 280
    shl-long v16, v18, v5

    .line 281
    .line 282
    and-long v16, v16, v8

    .line 283
    .line 284
    cmp-long v11, v16, v12

    .line 285
    .line 286
    if-eqz v11, :cond_18

    .line 287
    .line 288
    if-ne v7, v3, :cond_17

    .line 289
    .line 290
    move v5, v6

    .line 291
    goto :goto_f

    .line 292
    :cond_17
    add-int/lit8 v5, v7, 0x1

    .line 293
    .line 294
    aget-char v7, v4, v7

    .line 295
    .line 296
    goto :goto_e

    .line 297
    :cond_18
    int-to-char v2, v5

    .line 298
    iput-char v2, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 299
    .line 300
    iput v7, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 301
    .line 302
    if-ne v1, v10, :cond_19

    .line 303
    .line 304
    return-wide v14

    .line 305
    :cond_19
    neg-long v1, v14

    .line 306
    return-wide v1

    .line 307
    :cond_1a
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReader;->readInt64ValueOverflow()J

    .line 308
    .line 309
    .line 310
    move-result-wide v1

    .line 311
    return-wide v1
.end method

.method public readLocalDate()Ljava/time/LocalDate;
    .locals 15

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 2
    .line 3
    iget-char v1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 4
    .line 5
    const/16 v2, 0x22

    .line 6
    .line 7
    if-eq v1, v2, :cond_0

    .line 8
    .line 9
    const/16 v2, 0x27

    .line 10
    .line 11
    if-ne v1, v2, :cond_d

    .line 12
    .line 13
    :cond_0
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 14
    .line 15
    iget-object v3, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->dateFormat:Ljava/lang/String;

    .line 16
    .line 17
    if-eqz v3, :cond_1

    .line 18
    .line 19
    iget-boolean v3, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->formatyyyyMMddhhmmss19:Z

    .line 20
    .line 21
    if-nez v3, :cond_1

    .line 22
    .line 23
    iget-boolean v3, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->formatyyyyMMddhhmmssT19:Z

    .line 24
    .line 25
    if-nez v3, :cond_1

    .line 26
    .line 27
    iget-boolean v3, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->formatyyyyMMdd8:Z

    .line 28
    .line 29
    if-nez v3, :cond_1

    .line 30
    .line 31
    iget-boolean v2, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->formatISO8601:Z

    .line 32
    .line 33
    if-eqz v2, :cond_d

    .line 34
    .line 35
    :cond_1
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 36
    .line 37
    add-int/lit8 v3, v2, 0xa

    .line 38
    .line 39
    array-length v4, v0

    .line 40
    const/4 v5, 0x0

    .line 41
    const/16 v6, 0x2c

    .line 42
    .line 43
    const/16 v7, 0x2d

    .line 44
    .line 45
    const/4 v8, 0x1

    .line 46
    const/16 v9, 0xa

    .line 47
    .line 48
    if-ge v3, v4, :cond_8

    .line 49
    .line 50
    iget v4, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 51
    .line 52
    if-ge v3, v4, :cond_8

    .line 53
    .line 54
    add-int/lit8 v3, v2, 0x4

    .line 55
    .line 56
    aget-char v3, v0, v3

    .line 57
    .line 58
    if-ne v3, v7, :cond_8

    .line 59
    .line 60
    add-int/lit8 v3, v2, 0x7

    .line 61
    .line 62
    aget-char v3, v0, v3

    .line 63
    .line 64
    if-ne v3, v7, :cond_8

    .line 65
    .line 66
    add-int/lit8 v3, v2, 0xa

    .line 67
    .line 68
    aget-char v3, v0, v3

    .line 69
    .line 70
    if-ne v3, v1, :cond_8

    .line 71
    .line 72
    aget-char v1, v0, v2

    .line 73
    .line 74
    add-int/lit8 v3, v2, 0x1

    .line 75
    .line 76
    aget-char v3, v0, v3

    .line 77
    .line 78
    add-int/lit8 v4, v2, 0x2

    .line 79
    .line 80
    aget-char v4, v0, v4

    .line 81
    .line 82
    add-int/lit8 v7, v2, 0x3

    .line 83
    .line 84
    aget-char v7, v0, v7

    .line 85
    .line 86
    add-int/lit8 v10, v2, 0x5

    .line 87
    .line 88
    aget-char v10, v0, v10

    .line 89
    .line 90
    add-int/lit8 v11, v2, 0x6

    .line 91
    .line 92
    aget-char v11, v0, v11

    .line 93
    .line 94
    add-int/lit8 v12, v2, 0x8

    .line 95
    .line 96
    aget-char v12, v0, v12

    .line 97
    .line 98
    add-int/lit8 v2, v2, 0x9

    .line 99
    .line 100
    aget-char v0, v0, v2

    .line 101
    .line 102
    const/16 v2, 0x30

    .line 103
    .line 104
    if-lt v1, v2, :cond_7

    .line 105
    .line 106
    const/16 v13, 0x39

    .line 107
    .line 108
    if-gt v1, v13, :cond_7

    .line 109
    .line 110
    if-lt v3, v2, :cond_7

    .line 111
    .line 112
    if-gt v3, v13, :cond_7

    .line 113
    .line 114
    if-lt v4, v2, :cond_7

    .line 115
    .line 116
    if-gt v4, v13, :cond_7

    .line 117
    .line 118
    if-lt v7, v2, :cond_7

    .line 119
    .line 120
    if-gt v7, v13, :cond_7

    .line 121
    .line 122
    sub-int/2addr v1, v2

    .line 123
    mul-int/lit16 v1, v1, 0x3e8

    .line 124
    .line 125
    const/16 v14, 0x64

    .line 126
    .line 127
    invoke-static {v3, v2, v14, v1}, Lp/a;->z(IIII)I

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    invoke-static {v4, v2, v9, v1}, Lp/a;->z(IIII)I

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    sub-int/2addr v7, v2

    .line 136
    add-int/2addr v7, v1

    .line 137
    if-lt v10, v2, :cond_6

    .line 138
    .line 139
    if-gt v10, v13, :cond_6

    .line 140
    .line 141
    if-lt v11, v2, :cond_6

    .line 142
    .line 143
    if-gt v11, v13, :cond_6

    .line 144
    .line 145
    sub-int/2addr v10, v2

    .line 146
    mul-int/2addr v10, v9

    .line 147
    sub-int/2addr v11, v2

    .line 148
    add-int/2addr v11, v10

    .line 149
    if-lt v12, v2, :cond_5

    .line 150
    .line 151
    if-gt v12, v13, :cond_5

    .line 152
    .line 153
    if-lt v0, v2, :cond_5

    .line 154
    .line 155
    if-gt v0, v13, :cond_5

    .line 156
    .line 157
    sub-int/2addr v12, v2

    .line 158
    mul-int/2addr v12, v9

    .line 159
    sub-int/2addr v0, v2

    .line 160
    add-int/2addr v0, v12

    .line 161
    if-nez v7, :cond_2

    .line 162
    .line 163
    if-nez v11, :cond_2

    .line 164
    .line 165
    if-nez v0, :cond_2

    .line 166
    .line 167
    const/4 v0, 0x0

    .line 168
    goto :goto_0

    .line 169
    :cond_2
    :try_start_0
    invoke-static {v7, v11, v0}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    .line 170
    .line 171
    .line 172
    move-result-object v0
    :try_end_0
    .catch Ljava/time/DateTimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 173
    :goto_0
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 174
    .line 175
    add-int/lit8 v1, v1, 0xb

    .line 176
    .line 177
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 178
    .line 179
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->next()V

    .line 180
    .line 181
    .line 182
    iget-char v1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 183
    .line 184
    if-ne v1, v6, :cond_3

    .line 185
    .line 186
    move v5, v8

    .line 187
    :cond_3
    iput-boolean v5, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 188
    .line 189
    if-eqz v5, :cond_4

    .line 190
    .line 191
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->next()V

    .line 192
    .line 193
    .line 194
    :cond_4
    return-object v0

    .line 195
    :catch_0
    move-exception v0

    .line 196
    const-string v1, "read date error"

    .line 197
    .line 198
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    invoke-static {v1, v0}, Lah/a;->x(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 203
    .line 204
    .line 205
    const/4 v0, 0x0

    .line 206
    return-object v0

    .line 207
    :cond_5
    invoke-super {p0}, Lcom/alibaba/fastjson2/JSONReader;->readLocalDate()Ljava/time/LocalDate;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    return-object v0

    .line 212
    :cond_6
    invoke-super {p0}, Lcom/alibaba/fastjson2/JSONReader;->readLocalDate()Ljava/time/LocalDate;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    return-object v0

    .line 217
    :cond_7
    invoke-super {p0}, Lcom/alibaba/fastjson2/JSONReader;->readLocalDate()Ljava/time/LocalDate;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    return-object v0

    .line 222
    :cond_8
    add-int/lit8 v3, v2, 0x11

    .line 223
    .line 224
    iget v4, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 225
    .line 226
    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    .line 227
    .line 228
    .line 229
    move-result v3

    .line 230
    const/4 v4, -0x1

    .line 231
    move v10, v4

    .line 232
    :goto_1
    if-ge v2, v3, :cond_a

    .line 233
    .line 234
    aget-char v11, v0, v2

    .line 235
    .line 236
    if-ne v11, v1, :cond_9

    .line 237
    .line 238
    move v10, v2

    .line 239
    :cond_9
    add-int/lit8 v2, v2, 0x1

    .line 240
    .line 241
    goto :goto_1

    .line 242
    :cond_a
    if-eq v10, v4, :cond_d

    .line 243
    .line 244
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 245
    .line 246
    sub-int v2, v10, v1

    .line 247
    .line 248
    if-le v2, v9, :cond_d

    .line 249
    .line 250
    add-int/lit8 v2, v10, -0x6

    .line 251
    .line 252
    aget-char v2, v0, v2

    .line 253
    .line 254
    if-ne v2, v7, :cond_d

    .line 255
    .line 256
    add-int/lit8 v2, v10, -0x3

    .line 257
    .line 258
    aget-char v2, v0, v2

    .line 259
    .line 260
    if-ne v2, v7, :cond_d

    .line 261
    .line 262
    sub-int v2, v10, v1

    .line 263
    .line 264
    add-int/lit8 v2, v2, -0x6

    .line 265
    .line 266
    invoke-static {v0, v1, v2}, Lcom/alibaba/fastjson2/util/TypeUtils;->parseInt([CII)I

    .line 267
    .line 268
    .line 269
    move-result v1

    .line 270
    add-int/lit8 v2, v10, -0x5

    .line 271
    .line 272
    const/4 v3, 0x2

    .line 273
    invoke-static {v0, v2, v3}, Lcom/alibaba/fastjson2/util/TypeUtils;->parseInt([CII)I

    .line 274
    .line 275
    .line 276
    move-result v2

    .line 277
    add-int/lit8 v4, v10, -0x2

    .line 278
    .line 279
    invoke-static {v0, v4, v3}, Lcom/alibaba/fastjson2/util/TypeUtils;->parseInt([CII)I

    .line 280
    .line 281
    .line 282
    move-result v0

    .line 283
    invoke-static {v1, v2, v0}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    add-int/2addr v10, v8

    .line 288
    iput v10, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 289
    .line 290
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->next()V

    .line 291
    .line 292
    .line 293
    iget-char v1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 294
    .line 295
    if-ne v1, v6, :cond_b

    .line 296
    .line 297
    move v5, v8

    .line 298
    :cond_b
    iput-boolean v5, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 299
    .line 300
    if-eqz v5, :cond_c

    .line 301
    .line 302
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->next()V

    .line 303
    .line 304
    .line 305
    :cond_c
    return-object v0

    .line 306
    :cond_d
    invoke-super {p0}, Lcom/alibaba/fastjson2/JSONReader;->readLocalDate()Ljava/time/LocalDate;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    return-object v0
.end method

.method public readLocalDate10()Ljava/time/LocalDate;
    .locals 3

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    if-eq v0, v1, :cond_1

    .line 6
    .line 7
    const/16 v1, 0x27

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    const-string v0, "localDate only support string input"

    .line 13
    .line 14
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    :goto_0
    const/4 v0, 0x0

    .line 18
    return-object v0

    .line 19
    :cond_1
    :goto_1
    :try_start_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 20
    .line 21
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 22
    .line 23
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDate10([CI)Ljava/time/LocalDate;

    .line 24
    .line 25
    .line 26
    move-result-object v0
    :try_end_0
    .catch Ljava/time/DateTimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    return-object v0

    .line 31
    :cond_2
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 32
    .line 33
    add-int/lit8 v1, v1, 0xb

    .line 34
    .line 35
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->next()V

    .line 38
    .line 39
    .line 40
    iget-char v1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 41
    .line 42
    const/16 v2, 0x2c

    .line 43
    .line 44
    if-ne v1, v2, :cond_3

    .line 45
    .line 46
    const/4 v1, 0x1

    .line 47
    goto :goto_2

    .line 48
    :cond_3
    const/4 v1, 0x0

    .line 49
    :goto_2
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 50
    .line 51
    if-eqz v1, :cond_4

    .line 52
    .line 53
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->next()V

    .line 54
    .line 55
    .line 56
    :cond_4
    return-object v0

    .line 57
    :catch_0
    move-exception v0

    .line 58
    const-string v1, "read date error"

    .line 59
    .line 60
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-static {v1, v0}, Lah/a;->x(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 65
    .line 66
    .line 67
    goto :goto_0
.end method

.method public readLocalDate11()Ljava/time/LocalDate;
    .locals 3

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    if-eq v0, v1, :cond_1

    .line 6
    .line 7
    const/16 v1, 0x27

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string v0, "localDate only support string input"

    .line 13
    .line 14
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    return-object v0

    .line 19
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 20
    .line 21
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 22
    .line 23
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDate11([CI)Ljava/time/LocalDate;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    return-object v0

    .line 31
    :cond_2
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 32
    .line 33
    add-int/lit8 v1, v1, 0xc

    .line 34
    .line 35
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->next()V

    .line 38
    .line 39
    .line 40
    iget-char v1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 41
    .line 42
    const/16 v2, 0x2c

    .line 43
    .line 44
    if-ne v1, v2, :cond_3

    .line 45
    .line 46
    const/4 v1, 0x1

    .line 47
    goto :goto_1

    .line 48
    :cond_3
    const/4 v1, 0x0

    .line 49
    :goto_1
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 50
    .line 51
    if-eqz v1, :cond_4

    .line 52
    .line 53
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->next()V

    .line 54
    .line 55
    .line 56
    :cond_4
    return-object v0
.end method

.method public readLocalDate8()Ljava/time/LocalDate;
    .locals 3

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    if-eq v0, v1, :cond_1

    .line 6
    .line 7
    const/16 v1, 0x27

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    const-string v0, "localDate only support string input"

    .line 13
    .line 14
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    :goto_0
    const/4 v0, 0x0

    .line 18
    return-object v0

    .line 19
    :cond_1
    :goto_1
    :try_start_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 20
    .line 21
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 22
    .line 23
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDate8([CI)Ljava/time/LocalDate;

    .line 24
    .line 25
    .line 26
    move-result-object v0
    :try_end_0
    .catch Ljava/time/DateTimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 28
    .line 29
    add-int/lit8 v1, v1, 0x9

    .line 30
    .line 31
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->next()V

    .line 34
    .line 35
    .line 36
    iget-char v1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 37
    .line 38
    const/16 v2, 0x2c

    .line 39
    .line 40
    if-ne v1, v2, :cond_2

    .line 41
    .line 42
    const/4 v1, 0x1

    .line 43
    goto :goto_2

    .line 44
    :cond_2
    const/4 v1, 0x0

    .line 45
    :goto_2
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 46
    .line 47
    if-eqz v1, :cond_3

    .line 48
    .line 49
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->next()V

    .line 50
    .line 51
    .line 52
    :cond_3
    return-object v0

    .line 53
    :catch_0
    move-exception v0

    .line 54
    const-string v1, "read date error"

    .line 55
    .line 56
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-static {v1, v0}, Lah/a;->x(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 61
    .line 62
    .line 63
    goto :goto_0
.end method

.method public readLocalDate9()Ljava/time/LocalDate;
    .locals 3

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    if-eq v0, v1, :cond_1

    .line 6
    .line 7
    const/16 v1, 0x27

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    const-string v0, "localDate only support string input"

    .line 13
    .line 14
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    :goto_0
    const/4 v0, 0x0

    .line 18
    return-object v0

    .line 19
    :cond_1
    :goto_1
    :try_start_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 20
    .line 21
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 22
    .line 23
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDate9([CI)Ljava/time/LocalDate;

    .line 24
    .line 25
    .line 26
    move-result-object v0
    :try_end_0
    .catch Ljava/time/DateTimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 28
    .line 29
    add-int/lit8 v1, v1, 0xa

    .line 30
    .line 31
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->next()V

    .line 34
    .line 35
    .line 36
    iget-char v1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 37
    .line 38
    const/16 v2, 0x2c

    .line 39
    .line 40
    if-ne v1, v2, :cond_2

    .line 41
    .line 42
    const/4 v1, 0x1

    .line 43
    goto :goto_2

    .line 44
    :cond_2
    const/4 v1, 0x0

    .line 45
    :goto_2
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 46
    .line 47
    if-eqz v1, :cond_3

    .line 48
    .line 49
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->next()V

    .line 50
    .line 51
    .line 52
    :cond_3
    return-object v0

    .line 53
    :catch_0
    move-exception v0

    .line 54
    const-string v1, "read date error"

    .line 55
    .line 56
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-static {v1, v0}, Lah/a;->x(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 61
    .line 62
    .line 63
    goto :goto_0
.end method

.method public readLocalDateTime12()Ljava/time/LocalDateTime;
    .locals 3

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    if-eq v0, v1, :cond_1

    .line 6
    .line 7
    const/16 v1, 0x27

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string v0, "date only support string input"

    .line 13
    .line 14
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    return-object v0

    .line 19
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 20
    .line 21
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 22
    .line 23
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDateTime12([CI)Ljava/time/LocalDateTime;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    return-object v0

    .line 31
    :cond_2
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 32
    .line 33
    add-int/lit8 v1, v1, 0xd

    .line 34
    .line 35
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->next()V

    .line 38
    .line 39
    .line 40
    iget-char v1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 41
    .line 42
    const/16 v2, 0x2c

    .line 43
    .line 44
    if-ne v1, v2, :cond_3

    .line 45
    .line 46
    const/4 v1, 0x1

    .line 47
    goto :goto_1

    .line 48
    :cond_3
    const/4 v1, 0x0

    .line 49
    :goto_1
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 50
    .line 51
    if-eqz v1, :cond_4

    .line 52
    .line 53
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->next()V

    .line 54
    .line 55
    .line 56
    :cond_4
    return-object v0
.end method

.method public readLocalDateTime14()Ljava/time/LocalDateTime;
    .locals 3

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    if-eq v0, v1, :cond_1

    .line 6
    .line 7
    const/16 v1, 0x27

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string v0, "date only support string input"

    .line 13
    .line 14
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    return-object v0

    .line 19
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 20
    .line 21
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 22
    .line 23
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDateTime14([CI)Ljava/time/LocalDateTime;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    return-object v0

    .line 31
    :cond_2
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 32
    .line 33
    add-int/lit8 v1, v1, 0xf

    .line 34
    .line 35
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->next()V

    .line 38
    .line 39
    .line 40
    iget-char v1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 41
    .line 42
    const/16 v2, 0x2c

    .line 43
    .line 44
    if-ne v1, v2, :cond_3

    .line 45
    .line 46
    const/4 v1, 0x1

    .line 47
    goto :goto_1

    .line 48
    :cond_3
    const/4 v1, 0x0

    .line 49
    :goto_1
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 50
    .line 51
    if-eqz v1, :cond_4

    .line 52
    .line 53
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->next()V

    .line 54
    .line 55
    .line 56
    :cond_4
    return-object v0
.end method

.method public readLocalDateTime16()Ljava/time/LocalDateTime;
    .locals 3

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    if-eq v0, v1, :cond_1

    .line 6
    .line 7
    const/16 v1, 0x27

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string v0, "date only support string input"

    .line 13
    .line 14
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    return-object v0

    .line 19
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 20
    .line 21
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 22
    .line 23
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDateTime16([CI)Ljava/time/LocalDateTime;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    return-object v0

    .line 31
    :cond_2
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 32
    .line 33
    add-int/lit8 v1, v1, 0x11

    .line 34
    .line 35
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->next()V

    .line 38
    .line 39
    .line 40
    iget-char v1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 41
    .line 42
    const/16 v2, 0x2c

    .line 43
    .line 44
    if-ne v1, v2, :cond_3

    .line 45
    .line 46
    const/4 v1, 0x1

    .line 47
    goto :goto_1

    .line 48
    :cond_3
    const/4 v1, 0x0

    .line 49
    :goto_1
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 50
    .line 51
    if-eqz v1, :cond_4

    .line 52
    .line 53
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->next()V

    .line 54
    .line 55
    .line 56
    :cond_4
    return-object v0
.end method

.method public readLocalDateTime17()Ljava/time/LocalDateTime;
    .locals 3

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    if-eq v0, v1, :cond_1

    .line 6
    .line 7
    const/16 v1, 0x27

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string v0, "date only support string input"

    .line 13
    .line 14
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    return-object v0

    .line 19
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 20
    .line 21
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 22
    .line 23
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDateTime17([CI)Ljava/time/LocalDateTime;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    return-object v0

    .line 31
    :cond_2
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 32
    .line 33
    add-int/lit8 v1, v1, 0x12

    .line 34
    .line 35
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->next()V

    .line 38
    .line 39
    .line 40
    iget-char v1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 41
    .line 42
    const/16 v2, 0x2c

    .line 43
    .line 44
    if-ne v1, v2, :cond_3

    .line 45
    .line 46
    const/4 v1, 0x1

    .line 47
    goto :goto_1

    .line 48
    :cond_3
    const/4 v1, 0x0

    .line 49
    :goto_1
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 50
    .line 51
    if-eqz v1, :cond_4

    .line 52
    .line 53
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->next()V

    .line 54
    .line 55
    .line 56
    :cond_4
    return-object v0
.end method

.method public readLocalDateTime18()Ljava/time/LocalDateTime;
    .locals 3

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    if-eq v0, v1, :cond_1

    .line 6
    .line 7
    const/16 v1, 0x27

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string v0, "date only support string input"

    .line 13
    .line 14
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    return-object v0

    .line 19
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 20
    .line 21
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 22
    .line 23
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDateTime18([CI)Ljava/time/LocalDateTime;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 28
    .line 29
    add-int/lit8 v1, v1, 0x13

    .line 30
    .line 31
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->next()V

    .line 34
    .line 35
    .line 36
    iget-char v1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 37
    .line 38
    const/16 v2, 0x2c

    .line 39
    .line 40
    if-ne v1, v2, :cond_2

    .line 41
    .line 42
    const/4 v1, 0x1

    .line 43
    goto :goto_1

    .line 44
    :cond_2
    const/4 v1, 0x0

    .line 45
    :goto_1
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 46
    .line 47
    if-eqz v1, :cond_3

    .line 48
    .line 49
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->next()V

    .line 50
    .line 51
    .line 52
    :cond_3
    return-object v0
.end method

.method public readLocalDateTime19()Ljava/time/LocalDateTime;
    .locals 3

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    if-eq v0, v1, :cond_1

    .line 6
    .line 7
    const/16 v1, 0x27

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string v0, "date only support string input"

    .line 13
    .line 14
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    return-object v0

    .line 19
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 20
    .line 21
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 22
    .line 23
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDateTime19([CI)Ljava/time/LocalDateTime;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    return-object v0

    .line 31
    :cond_2
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 32
    .line 33
    add-int/lit8 v1, v1, 0x14

    .line 34
    .line 35
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->next()V

    .line 38
    .line 39
    .line 40
    iget-char v1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 41
    .line 42
    const/16 v2, 0x2c

    .line 43
    .line 44
    if-ne v1, v2, :cond_3

    .line 45
    .line 46
    const/4 v1, 0x1

    .line 47
    goto :goto_1

    .line 48
    :cond_3
    const/4 v1, 0x0

    .line 49
    :goto_1
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 50
    .line 51
    if-eqz v1, :cond_4

    .line 52
    .line 53
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->next()V

    .line 54
    .line 55
    .line 56
    :cond_4
    return-object v0
.end method

.method public readLocalDateTime20()Ljava/time/LocalDateTime;
    .locals 3

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    if-eq v0, v1, :cond_1

    .line 6
    .line 7
    const/16 v1, 0x27

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string v0, "date only support string input"

    .line 13
    .line 14
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    return-object v0

    .line 19
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 20
    .line 21
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 22
    .line 23
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDateTime20([CI)Ljava/time/LocalDateTime;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    return-object v0

    .line 31
    :cond_2
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 32
    .line 33
    add-int/lit8 v1, v1, 0x15

    .line 34
    .line 35
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->next()V

    .line 38
    .line 39
    .line 40
    iget-char v1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 41
    .line 42
    const/16 v2, 0x2c

    .line 43
    .line 44
    if-ne v1, v2, :cond_3

    .line 45
    .line 46
    const/4 v1, 0x1

    .line 47
    goto :goto_1

    .line 48
    :cond_3
    const/4 v1, 0x0

    .line 49
    :goto_1
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 50
    .line 51
    if-eqz v1, :cond_4

    .line 52
    .line 53
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->next()V

    .line 54
    .line 55
    .line 56
    :cond_4
    return-object v0
.end method

.method public readLocalDateTimeX(I)Ljava/time/LocalDateTime;
    .locals 3

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    if-eq v0, v1, :cond_1

    .line 6
    .line 7
    const/16 v1, 0x27

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string p1, "date only support string input"

    .line 13
    .line 14
    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    return-object p1

    .line 19
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 20
    .line 21
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 22
    .line 23
    invoke-static {v0, v1, p1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDateTimeX([CII)Ljava/time/LocalDateTime;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    const/4 p1, 0x0

    .line 30
    return-object p1

    .line 31
    :cond_2
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 32
    .line 33
    const/4 v2, 0x1

    .line 34
    add-int/2addr p1, v2

    .line 35
    add-int/2addr p1, v1

    .line 36
    iput p1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->next()V

    .line 39
    .line 40
    .line 41
    iget-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 42
    .line 43
    const/16 v1, 0x2c

    .line 44
    .line 45
    if-ne p1, v1, :cond_3

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_3
    const/4 v2, 0x0

    .line 49
    :goto_1
    iput-boolean v2, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 50
    .line 51
    if-eqz v2, :cond_4

    .line 52
    .line 53
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->next()V

    .line 54
    .line 55
    .line 56
    :cond_4
    return-object v0
.end method

.method public readLocalTime10()Ljava/time/LocalTime;
    .locals 3

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    if-eq v0, v1, :cond_1

    .line 6
    .line 7
    const/16 v1, 0x27

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string v0, "localTime only support string input"

    .line 13
    .line 14
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    return-object v0

    .line 19
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 20
    .line 21
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 22
    .line 23
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalTime10([CI)Ljava/time/LocalTime;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    return-object v0

    .line 31
    :cond_2
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 32
    .line 33
    add-int/lit8 v1, v1, 0xb

    .line 34
    .line 35
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->next()V

    .line 38
    .line 39
    .line 40
    iget-char v1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 41
    .line 42
    const/16 v2, 0x2c

    .line 43
    .line 44
    if-ne v1, v2, :cond_3

    .line 45
    .line 46
    const/4 v1, 0x1

    .line 47
    goto :goto_1

    .line 48
    :cond_3
    const/4 v1, 0x0

    .line 49
    :goto_1
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 50
    .line 51
    if-eqz v1, :cond_4

    .line 52
    .line 53
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->next()V

    .line 54
    .line 55
    .line 56
    :cond_4
    return-object v0
.end method

.method public readLocalTime11()Ljava/time/LocalTime;
    .locals 3

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    if-eq v0, v1, :cond_1

    .line 6
    .line 7
    const/16 v1, 0x27

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string v0, "localTime only support string input"

    .line 13
    .line 14
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    return-object v0

    .line 19
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 20
    .line 21
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 22
    .line 23
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalTime11([CI)Ljava/time/LocalTime;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    return-object v0

    .line 31
    :cond_2
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 32
    .line 33
    add-int/lit8 v1, v1, 0xc

    .line 34
    .line 35
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->next()V

    .line 38
    .line 39
    .line 40
    iget-char v1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 41
    .line 42
    const/16 v2, 0x2c

    .line 43
    .line 44
    if-ne v1, v2, :cond_3

    .line 45
    .line 46
    const/4 v1, 0x1

    .line 47
    goto :goto_1

    .line 48
    :cond_3
    const/4 v1, 0x0

    .line 49
    :goto_1
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 50
    .line 51
    if-eqz v1, :cond_4

    .line 52
    .line 53
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->next()V

    .line 54
    .line 55
    .line 56
    :cond_4
    return-object v0
.end method

.method public readLocalTime12()Ljava/time/LocalTime;
    .locals 3

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    if-eq v0, v1, :cond_1

    .line 6
    .line 7
    const/16 v1, 0x27

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string v0, "localTime only support string input"

    .line 13
    .line 14
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    return-object v0

    .line 19
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 20
    .line 21
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 22
    .line 23
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalTime12([CI)Ljava/time/LocalTime;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    return-object v0

    .line 31
    :cond_2
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 32
    .line 33
    add-int/lit8 v1, v1, 0xd

    .line 34
    .line 35
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->next()V

    .line 38
    .line 39
    .line 40
    iget-char v1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 41
    .line 42
    const/16 v2, 0x2c

    .line 43
    .line 44
    if-ne v1, v2, :cond_3

    .line 45
    .line 46
    const/4 v1, 0x1

    .line 47
    goto :goto_1

    .line 48
    :cond_3
    const/4 v1, 0x0

    .line 49
    :goto_1
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 50
    .line 51
    if-eqz v1, :cond_4

    .line 52
    .line 53
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->next()V

    .line 54
    .line 55
    .line 56
    :cond_4
    return-object v0
.end method

.method public final readLocalTime15()Ljava/time/LocalTime;
    .locals 3

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    if-eq v0, v1, :cond_1

    .line 6
    .line 7
    const/16 v1, 0x27

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string v0, "localTime only support string input"

    .line 13
    .line 14
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    return-object v0

    .line 19
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 20
    .line 21
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 22
    .line 23
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalTime15([CI)Ljava/time/LocalTime;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    return-object v0

    .line 31
    :cond_2
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 32
    .line 33
    add-int/lit8 v1, v1, 0x10

    .line 34
    .line 35
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->next()V

    .line 38
    .line 39
    .line 40
    iget-char v1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 41
    .line 42
    const/16 v2, 0x2c

    .line 43
    .line 44
    if-ne v1, v2, :cond_3

    .line 45
    .line 46
    const/4 v1, 0x1

    .line 47
    goto :goto_1

    .line 48
    :cond_3
    const/4 v1, 0x0

    .line 49
    :goto_1
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 50
    .line 51
    if-eqz v1, :cond_4

    .line 52
    .line 53
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->next()V

    .line 54
    .line 55
    .line 56
    :cond_4
    return-object v0
.end method

.method public readLocalTime18()Ljava/time/LocalTime;
    .locals 3

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    if-eq v0, v1, :cond_1

    .line 6
    .line 7
    const/16 v1, 0x27

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string v0, "localTime only support string input"

    .line 13
    .line 14
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    return-object v0

    .line 19
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 20
    .line 21
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 22
    .line 23
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalTime18([CI)Ljava/time/LocalTime;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    return-object v0

    .line 31
    :cond_2
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 32
    .line 33
    add-int/lit8 v1, v1, 0x13

    .line 34
    .line 35
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->next()V

    .line 38
    .line 39
    .line 40
    iget-char v1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 41
    .line 42
    const/16 v2, 0x2c

    .line 43
    .line 44
    if-ne v1, v2, :cond_3

    .line 45
    .line 46
    const/4 v1, 0x1

    .line 47
    goto :goto_1

    .line 48
    :cond_3
    const/4 v1, 0x0

    .line 49
    :goto_1
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 50
    .line 51
    if-eqz v1, :cond_4

    .line 52
    .line 53
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->next()V

    .line 54
    .line 55
    .line 56
    :cond_4
    return-object v0
.end method

.method public readLocalTime5()Ljava/time/LocalTime;
    .locals 3

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    if-eq v0, v1, :cond_1

    .line 6
    .line 7
    const/16 v1, 0x27

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string v0, "localTime only support string input"

    .line 13
    .line 14
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    return-object v0

    .line 19
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 20
    .line 21
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 22
    .line 23
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalTime5([CI)Ljava/time/LocalTime;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    return-object v0

    .line 31
    :cond_2
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 32
    .line 33
    add-int/lit8 v1, v1, 0x6

    .line 34
    .line 35
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->next()V

    .line 38
    .line 39
    .line 40
    iget-char v1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 41
    .line 42
    const/16 v2, 0x2c

    .line 43
    .line 44
    if-ne v1, v2, :cond_3

    .line 45
    .line 46
    const/4 v1, 0x1

    .line 47
    goto :goto_1

    .line 48
    :cond_3
    const/4 v1, 0x0

    .line 49
    :goto_1
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 50
    .line 51
    if-eqz v1, :cond_4

    .line 52
    .line 53
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->next()V

    .line 54
    .line 55
    .line 56
    :cond_4
    return-object v0
.end method

.method public readLocalTime8()Ljava/time/LocalTime;
    .locals 3

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    if-eq v0, v1, :cond_1

    .line 6
    .line 7
    const/16 v1, 0x27

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string v0, "localTime only support string input"

    .line 13
    .line 14
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    return-object v0

    .line 19
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 20
    .line 21
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 22
    .line 23
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalTime8([CI)Ljava/time/LocalTime;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    return-object v0

    .line 31
    :cond_2
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 32
    .line 33
    add-int/lit8 v1, v1, 0x9

    .line 34
    .line 35
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->next()V

    .line 38
    .line 39
    .line 40
    iget-char v1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 41
    .line 42
    const/16 v2, 0x2c

    .line 43
    .line 44
    if-ne v1, v2, :cond_3

    .line 45
    .line 46
    const/4 v1, 0x1

    .line 47
    goto :goto_1

    .line 48
    :cond_3
    const/4 v1, 0x0

    .line 49
    :goto_1
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 50
    .line 51
    if-eqz v1, :cond_4

    .line 52
    .line 53
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->next()V

    .line 54
    .line 55
    .line 56
    :cond_4
    return-object v0
.end method

.method public readLocalTime9()Ljava/time/LocalTime;
    .locals 3

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    if-eq v0, v1, :cond_1

    .line 6
    .line 7
    const/16 v1, 0x27

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string v0, "localTime only support string input"

    .line 13
    .line 14
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    return-object v0

    .line 19
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 20
    .line 21
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 22
    .line 23
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalTime8([CI)Ljava/time/LocalTime;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    return-object v0

    .line 31
    :cond_2
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 32
    .line 33
    add-int/lit8 v1, v1, 0xa

    .line 34
    .line 35
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->next()V

    .line 38
    .line 39
    .line 40
    iget-char v1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 41
    .line 42
    const/16 v2, 0x2c

    .line 43
    .line 44
    if-ne v1, v2, :cond_3

    .line 45
    .line 46
    const/4 v1, 0x1

    .line 47
    goto :goto_1

    .line 48
    :cond_3
    const/4 v1, 0x0

    .line 49
    :goto_1
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 50
    .line 51
    if-eqz v1, :cond_4

    .line 52
    .line 53
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->next()V

    .line 54
    .line 55
    .line 56
    :cond_4
    return-object v0
.end method

.method public readMillis19()J
    .locals 7

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    if-eq v0, v1, :cond_1

    .line 6
    .line 7
    const/16 v1, 0x27

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    const-string v0, "date only support string input"

    .line 13
    .line 14
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    :goto_0
    const-wide/16 v0, 0x0

    .line 18
    .line 19
    return-wide v0

    .line 20
    :cond_1
    :goto_1
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 21
    .line 22
    add-int/lit8 v2, v1, 0x12

    .line 23
    .line 24
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 25
    .line 26
    const/4 v4, 0x1

    .line 27
    if-lt v2, v3, :cond_2

    .line 28
    .line 29
    iput-boolean v4, p0, Lcom/alibaba/fastjson2/JSONReader;->wasNull:Z

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 33
    .line 34
    iget-object v3, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 35
    .line 36
    iget-object v3, v3, Lcom/alibaba/fastjson2/JSONReader$Context;->zoneId:Ljava/time/ZoneId;

    .line 37
    .line 38
    invoke-static {v2, v1, v3}, Lcom/alibaba/fastjson2/util/DateUtils;->parseMillis19([CILjava/time/ZoneId;)J

    .line 39
    .line 40
    .line 41
    move-result-wide v1

    .line 42
    iget-object v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 43
    .line 44
    iget v5, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 45
    .line 46
    add-int/lit8 v6, v5, 0x13

    .line 47
    .line 48
    aget-char v3, v3, v6

    .line 49
    .line 50
    if-ne v3, v0, :cond_5

    .line 51
    .line 52
    add-int/lit8 v5, v5, 0x14

    .line 53
    .line 54
    iput v5, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 55
    .line 56
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->next()V

    .line 57
    .line 58
    .line 59
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 60
    .line 61
    const/16 v3, 0x2c

    .line 62
    .line 63
    if-ne v0, v3, :cond_3

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_3
    const/4 v4, 0x0

    .line 67
    :goto_2
    iput-boolean v4, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 68
    .line 69
    if-eqz v4, :cond_4

    .line 70
    .line 71
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->next()V

    .line 72
    .line 73
    .line 74
    :cond_4
    return-wide v1

    .line 75
    :cond_5
    const-string v0, "illegal date input"

    .line 76
    .line 77
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    goto :goto_0
.end method

.method public final readNaN()D
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    aget-char v2, v0, v1

    .line 6
    .line 7
    const/16 v3, 0x61

    .line 8
    .line 9
    if-ne v2, v3, :cond_7

    .line 10
    .line 11
    add-int/lit8 v2, v1, 0x1

    .line 12
    .line 13
    aget-char v2, v0, v2

    .line 14
    .line 15
    const/16 v3, 0x4e

    .line 16
    .line 17
    if-ne v2, v3, :cond_7

    .line 18
    .line 19
    add-int/lit8 v2, v1, 0x2

    .line 20
    .line 21
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 22
    .line 23
    const/16 v4, 0x1a

    .line 24
    .line 25
    if-ne v2, v3, :cond_0

    .line 26
    .line 27
    move v1, v2

    .line 28
    :goto_0
    move v2, v4

    .line 29
    goto :goto_1

    .line 30
    :cond_0
    add-int/lit8 v1, v1, 0x3

    .line 31
    .line 32
    aget-char v2, v0, v2

    .line 33
    .line 34
    :goto_1
    const-wide/16 v5, 0x0

    .line 35
    .line 36
    const-wide v7, 0x100003701L

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    const-wide/16 v9, 0x1

    .line 42
    .line 43
    const/16 v3, 0x20

    .line 44
    .line 45
    if-gt v2, v3, :cond_2

    .line 46
    .line 47
    shl-long v11, v9, v2

    .line 48
    .line 49
    and-long/2addr v11, v7

    .line 50
    cmp-long v11, v11, v5

    .line 51
    .line 52
    if-eqz v11, :cond_2

    .line 53
    .line 54
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 55
    .line 56
    if-lt v1, v2, :cond_1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    add-int/lit8 v2, v1, 0x1

    .line 60
    .line 61
    aget-char v1, v0, v1

    .line 62
    .line 63
    move v13, v2

    .line 64
    move v2, v1

    .line 65
    move v1, v13

    .line 66
    goto :goto_1

    .line 67
    :cond_2
    const/16 v11, 0x2c

    .line 68
    .line 69
    if-ne v2, v11, :cond_3

    .line 70
    .line 71
    const/4 v11, 0x1

    .line 72
    goto :goto_2

    .line 73
    :cond_3
    const/4 v11, 0x0

    .line 74
    :goto_2
    iput-boolean v11, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 75
    .line 76
    if-eqz v11, :cond_6

    .line 77
    .line 78
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 79
    .line 80
    if-lt v1, v2, :cond_4

    .line 81
    .line 82
    move v2, v1

    .line 83
    move v1, v4

    .line 84
    goto :goto_3

    .line 85
    :cond_4
    add-int/lit8 v2, v1, 0x1

    .line 86
    .line 87
    aget-char v1, v0, v1

    .line 88
    .line 89
    :goto_3
    move v13, v2

    .line 90
    move v2, v1

    .line 91
    move v1, v13

    .line 92
    :goto_4
    if-gt v2, v3, :cond_6

    .line 93
    .line 94
    shl-long v11, v9, v2

    .line 95
    .line 96
    and-long/2addr v11, v7

    .line 97
    cmp-long v11, v11, v5

    .line 98
    .line 99
    if-eqz v11, :cond_6

    .line 100
    .line 101
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 102
    .line 103
    if-lt v1, v2, :cond_5

    .line 104
    .line 105
    move v2, v4

    .line 106
    goto :goto_4

    .line 107
    :cond_5
    add-int/lit8 v2, v1, 0x1

    .line 108
    .line 109
    aget-char v1, v0, v1

    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_6
    int-to-char v0, v2

    .line 113
    iput-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 114
    .line 115
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 116
    .line 117
    const-wide/high16 v0, 0x7ff8000000000000L    # Double.NaN

    .line 118
    .line 119
    return-wide v0

    .line 120
    :cond_7
    const-string v0, "json syntax error, not NaN "

    .line 121
    .line 122
    invoke-static {v1, v0}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    const-wide/16 v0, 0x0

    .line 130
    .line 131
    return-wide v0
.end method

.method public readNull()V
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    aget-char v2, v0, v1

    .line 6
    .line 7
    const/16 v3, 0x75

    .line 8
    .line 9
    if-ne v2, v3, :cond_7

    .line 10
    .line 11
    add-int/lit8 v2, v1, 0x1

    .line 12
    .line 13
    aget-char v2, v0, v2

    .line 14
    .line 15
    const/16 v3, 0x6c

    .line 16
    .line 17
    if-ne v2, v3, :cond_7

    .line 18
    .line 19
    add-int/lit8 v2, v1, 0x2

    .line 20
    .line 21
    aget-char v2, v0, v2

    .line 22
    .line 23
    if-ne v2, v3, :cond_7

    .line 24
    .line 25
    add-int/lit8 v2, v1, 0x3

    .line 26
    .line 27
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 28
    .line 29
    const/16 v4, 0x1a

    .line 30
    .line 31
    if-ne v2, v3, :cond_0

    .line 32
    .line 33
    move v2, v4

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    aget-char v2, v0, v2

    .line 36
    .line 37
    :goto_0
    add-int/lit8 v1, v1, 0x4

    .line 38
    .line 39
    :goto_1
    const-wide/16 v5, 0x0

    .line 40
    .line 41
    const-wide v7, 0x100003701L

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    const-wide/16 v9, 0x1

    .line 47
    .line 48
    const/16 v3, 0x20

    .line 49
    .line 50
    if-gt v2, v3, :cond_2

    .line 51
    .line 52
    shl-long v11, v9, v2

    .line 53
    .line 54
    and-long/2addr v11, v7

    .line 55
    cmp-long v11, v11, v5

    .line 56
    .line 57
    if-eqz v11, :cond_2

    .line 58
    .line 59
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 60
    .line 61
    if-ne v1, v2, :cond_1

    .line 62
    .line 63
    move v2, v4

    .line 64
    goto :goto_1

    .line 65
    :cond_1
    add-int/lit8 v2, v1, 0x1

    .line 66
    .line 67
    aget-char v1, v0, v1

    .line 68
    .line 69
    move v13, v2

    .line 70
    move v2, v1

    .line 71
    move v1, v13

    .line 72
    goto :goto_1

    .line 73
    :cond_2
    const/16 v11, 0x2c

    .line 74
    .line 75
    if-ne v2, v11, :cond_3

    .line 76
    .line 77
    const/4 v11, 0x1

    .line 78
    goto :goto_2

    .line 79
    :cond_3
    const/4 v11, 0x0

    .line 80
    :goto_2
    iput-boolean v11, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 81
    .line 82
    if-eqz v11, :cond_6

    .line 83
    .line 84
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 85
    .line 86
    if-ne v1, v2, :cond_4

    .line 87
    .line 88
    move v2, v1

    .line 89
    move v1, v4

    .line 90
    goto :goto_3

    .line 91
    :cond_4
    add-int/lit8 v2, v1, 0x1

    .line 92
    .line 93
    aget-char v1, v0, v1

    .line 94
    .line 95
    :goto_3
    move v13, v2

    .line 96
    move v2, v1

    .line 97
    move v1, v13

    .line 98
    :goto_4
    if-gt v2, v3, :cond_6

    .line 99
    .line 100
    shl-long v11, v9, v2

    .line 101
    .line 102
    and-long/2addr v11, v7

    .line 103
    cmp-long v11, v11, v5

    .line 104
    .line 105
    if-eqz v11, :cond_6

    .line 106
    .line 107
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 108
    .line 109
    if-ne v1, v2, :cond_5

    .line 110
    .line 111
    move v2, v4

    .line 112
    goto :goto_4

    .line 113
    :cond_5
    add-int/lit8 v2, v1, 0x1

    .line 114
    .line 115
    aget-char v1, v0, v1

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_6
    iput-char v2, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 119
    .line 120
    iput v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 121
    .line 122
    return-void

    .line 123
    :cond_7
    const-string v0, "json syntax error, not match null, offset "

    .line 124
    .line 125
    invoke-static {v1, v0}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    return-void
.end method

.method public readNullOrNewDate()Ljava/util/Date;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 4
    .line 5
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 6
    .line 7
    add-int/lit8 v3, v2, 0x2

    .line 8
    .line 9
    iget v4, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 10
    .line 11
    const-wide/16 v5, 0x0

    .line 12
    .line 13
    const-wide v7, 0x100003701L

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    const-wide/16 v9, 0x1

    .line 19
    .line 20
    const/16 v11, 0x20

    .line 21
    .line 22
    const/16 v12, 0x1a

    .line 23
    .line 24
    if-ge v3, v4, :cond_1

    .line 25
    .line 26
    aget-char v13, v1, v2

    .line 27
    .line 28
    const/16 v14, 0x75

    .line 29
    .line 30
    if-ne v13, v14, :cond_1

    .line 31
    .line 32
    add-int/lit8 v13, v2, 0x1

    .line 33
    .line 34
    aget-char v13, v1, v13

    .line 35
    .line 36
    const/16 v14, 0x6c

    .line 37
    .line 38
    if-ne v13, v14, :cond_1

    .line 39
    .line 40
    aget-char v13, v1, v3

    .line 41
    .line 42
    if-ne v13, v14, :cond_1

    .line 43
    .line 44
    add-int/lit8 v3, v2, 0x3

    .line 45
    .line 46
    if-ne v3, v4, :cond_0

    .line 47
    .line 48
    move v3, v12

    .line 49
    goto :goto_0

    .line 50
    :cond_0
    aget-char v3, v1, v3

    .line 51
    .line 52
    :goto_0
    add-int/lit8 v2, v2, 0x4

    .line 53
    .line 54
    const/4 v4, 0x0

    .line 55
    move-wide/from16 v16, v5

    .line 56
    .line 57
    goto/16 :goto_7

    .line 58
    .line 59
    :cond_1
    add-int/lit8 v13, v2, 0x1

    .line 60
    .line 61
    if-ge v13, v4, :cond_14

    .line 62
    .line 63
    aget-char v14, v1, v2

    .line 64
    .line 65
    const/16 v15, 0x65

    .line 66
    .line 67
    if-ne v14, v15, :cond_14

    .line 68
    .line 69
    aget-char v13, v1, v13

    .line 70
    .line 71
    const/16 v14, 0x77

    .line 72
    .line 73
    if-ne v13, v14, :cond_14

    .line 74
    .line 75
    add-int/lit8 v2, v2, 0x3

    .line 76
    .line 77
    if-ne v2, v4, :cond_2

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_2
    aget-char v3, v1, v3

    .line 81
    .line 82
    :goto_1
    if-gt v3, v11, :cond_4

    .line 83
    .line 84
    shl-long v13, v9, v3

    .line 85
    .line 86
    and-long/2addr v13, v7

    .line 87
    cmp-long v4, v13, v5

    .line 88
    .line 89
    if-eqz v4, :cond_4

    .line 90
    .line 91
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 92
    .line 93
    if-lt v2, v3, :cond_3

    .line 94
    .line 95
    :goto_2
    move v3, v12

    .line 96
    goto :goto_1

    .line 97
    :cond_3
    add-int/lit8 v3, v2, 0x1

    .line 98
    .line 99
    aget-char v2, v1, v2

    .line 100
    .line 101
    move/from16 v18, v3

    .line 102
    .line 103
    move v3, v2

    .line 104
    move/from16 v2, v18

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_4
    add-int/lit8 v4, v2, 0x4

    .line 108
    .line 109
    iget v13, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 110
    .line 111
    const-string v14, "json syntax error, not match new Date"

    .line 112
    .line 113
    if-ge v4, v13, :cond_13

    .line 114
    .line 115
    move-wide/from16 v16, v5

    .line 116
    .line 117
    const/16 v5, 0x44

    .line 118
    .line 119
    if-ne v3, v5, :cond_13

    .line 120
    .line 121
    aget-char v3, v1, v2

    .line 122
    .line 123
    const/16 v5, 0x61

    .line 124
    .line 125
    if-ne v3, v5, :cond_13

    .line 126
    .line 127
    add-int/lit8 v3, v2, 0x1

    .line 128
    .line 129
    aget-char v3, v1, v3

    .line 130
    .line 131
    const/16 v5, 0x74

    .line 132
    .line 133
    if-ne v3, v5, :cond_13

    .line 134
    .line 135
    add-int/lit8 v3, v2, 0x2

    .line 136
    .line 137
    aget-char v3, v1, v3

    .line 138
    .line 139
    if-ne v3, v15, :cond_13

    .line 140
    .line 141
    add-int/lit8 v2, v2, 0x3

    .line 142
    .line 143
    if-ne v2, v13, :cond_5

    .line 144
    .line 145
    :goto_3
    move v2, v12

    .line 146
    goto :goto_4

    .line 147
    :cond_5
    aget-char v2, v1, v2

    .line 148
    .line 149
    :goto_4
    if-gt v2, v11, :cond_7

    .line 150
    .line 151
    shl-long v5, v9, v2

    .line 152
    .line 153
    and-long/2addr v5, v7

    .line 154
    cmp-long v3, v5, v16

    .line 155
    .line 156
    if-eqz v3, :cond_7

    .line 157
    .line 158
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 159
    .line 160
    if-ne v4, v2, :cond_6

    .line 161
    .line 162
    goto :goto_3

    .line 163
    :cond_6
    add-int/lit8 v2, v4, 0x1

    .line 164
    .line 165
    aget-char v3, v1, v4

    .line 166
    .line 167
    move v4, v2

    .line 168
    move v2, v3

    .line 169
    goto :goto_4

    .line 170
    :cond_7
    const/16 v3, 0x28

    .line 171
    .line 172
    if-ne v2, v3, :cond_12

    .line 173
    .line 174
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 175
    .line 176
    if-ge v4, v2, :cond_12

    .line 177
    .line 178
    add-int/lit8 v2, v4, 0x1

    .line 179
    .line 180
    aget-char v3, v1, v4

    .line 181
    .line 182
    :goto_5
    if-gt v3, v11, :cond_9

    .line 183
    .line 184
    shl-long v4, v9, v3

    .line 185
    .line 186
    and-long/2addr v4, v7

    .line 187
    cmp-long v4, v4, v16

    .line 188
    .line 189
    if-eqz v4, :cond_9

    .line 190
    .line 191
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 192
    .line 193
    if-ne v2, v3, :cond_8

    .line 194
    .line 195
    move v3, v12

    .line 196
    goto :goto_5

    .line 197
    :cond_8
    add-int/lit8 v3, v2, 0x1

    .line 198
    .line 199
    aget-char v2, v1, v2

    .line 200
    .line 201
    move/from16 v18, v3

    .line 202
    .line 203
    move v3, v2

    .line 204
    move/from16 v2, v18

    .line 205
    .line 206
    goto :goto_5

    .line 207
    :cond_9
    iput-char v3, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 208
    .line 209
    iput v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 210
    .line 211
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->readInt64Value()J

    .line 212
    .line 213
    .line 214
    move-result-wide v2

    .line 215
    iget-char v4, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 216
    .line 217
    iget v5, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 218
    .line 219
    const/16 v6, 0x29

    .line 220
    .line 221
    if-ne v4, v6, :cond_11

    .line 222
    .line 223
    iget v4, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 224
    .line 225
    if-ne v5, v4, :cond_a

    .line 226
    .line 227
    move v4, v5

    .line 228
    move v5, v12

    .line 229
    goto :goto_6

    .line 230
    :cond_a
    add-int/lit8 v4, v5, 0x1

    .line 231
    .line 232
    aget-char v5, v1, v5

    .line 233
    .line 234
    :goto_6
    new-instance v6, Ljava/util/Date;

    .line 235
    .line 236
    invoke-direct {v6, v2, v3}, Ljava/util/Date;-><init>(J)V

    .line 237
    .line 238
    .line 239
    move v2, v4

    .line 240
    move v3, v5

    .line 241
    move-object v4, v6

    .line 242
    :goto_7
    if-gt v3, v11, :cond_c

    .line 243
    .line 244
    shl-long v5, v9, v3

    .line 245
    .line 246
    and-long/2addr v5, v7

    .line 247
    cmp-long v5, v5, v16

    .line 248
    .line 249
    if-eqz v5, :cond_c

    .line 250
    .line 251
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 252
    .line 253
    if-ne v2, v3, :cond_b

    .line 254
    .line 255
    move v3, v12

    .line 256
    goto :goto_7

    .line 257
    :cond_b
    add-int/lit8 v3, v2, 0x1

    .line 258
    .line 259
    aget-char v2, v1, v2

    .line 260
    .line 261
    move/from16 v18, v3

    .line 262
    .line 263
    move v3, v2

    .line 264
    move/from16 v2, v18

    .line 265
    .line 266
    goto :goto_7

    .line 267
    :cond_c
    const/16 v5, 0x2c

    .line 268
    .line 269
    if-ne v3, v5, :cond_d

    .line 270
    .line 271
    const/4 v5, 0x1

    .line 272
    goto :goto_8

    .line 273
    :cond_d
    const/4 v5, 0x0

    .line 274
    :goto_8
    iput-boolean v5, v0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 275
    .line 276
    if-eqz v5, :cond_10

    .line 277
    .line 278
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 279
    .line 280
    if-ne v2, v3, :cond_e

    .line 281
    .line 282
    move v3, v2

    .line 283
    move v2, v12

    .line 284
    goto :goto_9

    .line 285
    :cond_e
    add-int/lit8 v3, v2, 0x1

    .line 286
    .line 287
    aget-char v2, v1, v2

    .line 288
    .line 289
    :goto_9
    move/from16 v18, v3

    .line 290
    .line 291
    move v3, v2

    .line 292
    move/from16 v2, v18

    .line 293
    .line 294
    :goto_a
    if-gt v3, v11, :cond_10

    .line 295
    .line 296
    shl-long v5, v9, v3

    .line 297
    .line 298
    and-long/2addr v5, v7

    .line 299
    cmp-long v5, v5, v16

    .line 300
    .line 301
    if-eqz v5, :cond_10

    .line 302
    .line 303
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 304
    .line 305
    if-ne v2, v3, :cond_f

    .line 306
    .line 307
    move v3, v12

    .line 308
    goto :goto_a

    .line 309
    :cond_f
    add-int/lit8 v3, v2, 0x1

    .line 310
    .line 311
    aget-char v2, v1, v2

    .line 312
    .line 313
    goto :goto_9

    .line 314
    :cond_10
    iput-char v3, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 315
    .line 316
    iput v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 317
    .line 318
    return-object v4

    .line 319
    :cond_11
    invoke-static {v5, v14}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v1

    .line 323
    invoke-static {v1}, Lah/a;->w(Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    :goto_b
    const/4 v1, 0x0

    .line 327
    return-object v1

    .line 328
    :cond_12
    invoke-static {v4, v14}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object v1

    .line 332
    invoke-static {v1}, Lah/a;->w(Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    goto :goto_b

    .line 336
    :cond_13
    invoke-static {v2, v14}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v1

    .line 340
    invoke-static {v1}, Lah/a;->w(Ljava/lang/String;)V

    .line 341
    .line 342
    .line 343
    goto :goto_b

    .line 344
    :cond_14
    const-string v1, "json syntax error, not match null or new Date"

    .line 345
    .line 346
    invoke-static {v2, v1}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v1

    .line 350
    invoke-static {v1}, Lah/a;->w(Ljava/lang/String;)V

    .line 351
    .line 352
    .line 353
    goto :goto_b
.end method

.method public readNumber0()V
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-boolean v1, v0, Lcom/alibaba/fastjson2/JSONReader;->wasNull:Z

    .line 5
    .line 6
    iput v1, v0, Lcom/alibaba/fastjson2/JSONReader;->mag0:I

    .line 7
    .line 8
    iput v1, v0, Lcom/alibaba/fastjson2/JSONReader;->mag1:I

    .line 9
    .line 10
    iput v1, v0, Lcom/alibaba/fastjson2/JSONReader;->mag2:I

    .line 11
    .line 12
    iput v1, v0, Lcom/alibaba/fastjson2/JSONReader;->mag3:I

    .line 13
    .line 14
    iput-boolean v1, v0, Lcom/alibaba/fastjson2/JSONReader;->negative:Z

    .line 15
    .line 16
    iput-short v1, v0, Lcom/alibaba/fastjson2/JSONReader;->exponent:S

    .line 17
    .line 18
    iput-short v1, v0, Lcom/alibaba/fastjson2/JSONReader;->scale:S

    .line 19
    .line 20
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 21
    .line 22
    iget-object v3, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 23
    .line 24
    iget-char v4, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 25
    .line 26
    iget v5, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 27
    .line 28
    const/16 v6, 0x22

    .line 29
    .line 30
    const/4 v7, 0x5

    .line 31
    const-wide v10, 0x100003701L

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    const-wide/16 v12, 0x1

    .line 37
    .line 38
    const/16 v14, 0x20

    .line 39
    .line 40
    const/4 v15, 0x2

    .line 41
    const/16 v16, 0x1a

    .line 42
    .line 43
    const-wide/16 v17, 0x0

    .line 44
    .line 45
    const/4 v8, 0x1

    .line 46
    if-eq v4, v6, :cond_1

    .line 47
    .line 48
    const/16 v6, 0x27

    .line 49
    .line 50
    if-ne v4, v6, :cond_0

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_0
    move v6, v1

    .line 54
    move v9, v2

    .line 55
    :goto_0
    move-wide/from16 v19, v10

    .line 56
    .line 57
    goto :goto_4

    .line 58
    :cond_1
    :goto_1
    add-int/lit8 v6, v2, 0x1

    .line 59
    .line 60
    aget-char v9, v3, v2

    .line 61
    .line 62
    if-ne v9, v4, :cond_5

    .line 63
    .line 64
    if-ne v6, v5, :cond_2

    .line 65
    .line 66
    :goto_2
    move/from16 v1, v16

    .line 67
    .line 68
    goto :goto_3

    .line 69
    :cond_2
    add-int/2addr v2, v15

    .line 70
    aget-char v1, v3, v6

    .line 71
    .line 72
    move v6, v2

    .line 73
    :goto_3
    if-gt v1, v14, :cond_4

    .line 74
    .line 75
    shl-long v19, v12, v1

    .line 76
    .line 77
    and-long v19, v19, v10

    .line 78
    .line 79
    cmp-long v2, v19, v17

    .line 80
    .line 81
    if-eqz v2, :cond_4

    .line 82
    .line 83
    if-ne v6, v5, :cond_3

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_3
    add-int/lit8 v1, v6, 0x1

    .line 87
    .line 88
    aget-char v2, v3, v6

    .line 89
    .line 90
    move v6, v1

    .line 91
    move v1, v2

    .line 92
    goto :goto_3

    .line 93
    :cond_4
    iput-char v1, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 94
    .line 95
    iput v6, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 96
    .line 97
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->nextIfComma()Z

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    iput-boolean v1, v0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 102
    .line 103
    iput-boolean v8, v0, Lcom/alibaba/fastjson2/JSONReader;->wasNull:Z

    .line 104
    .line 105
    iput-byte v7, v0, Lcom/alibaba/fastjson2/JSONReader;->valueType:B

    .line 106
    .line 107
    return-void

    .line 108
    :cond_5
    move/from16 v19, v6

    .line 109
    .line 110
    move v6, v4

    .line 111
    move v4, v9

    .line 112
    move/from16 v9, v19

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :goto_4
    const/16 v10, 0x2b

    .line 116
    .line 117
    const/16 v11, 0x2d

    .line 118
    .line 119
    move-wide/from16 v21, v12

    .line 120
    .line 121
    const-string v12, "illegal input"

    .line 122
    .line 123
    if-ne v4, v11, :cond_7

    .line 124
    .line 125
    if-eq v9, v5, :cond_6

    .line 126
    .line 127
    iput-boolean v8, v0, Lcom/alibaba/fastjson2/JSONReader;->negative:Z

    .line 128
    .line 129
    add-int/lit8 v4, v9, 0x1

    .line 130
    .line 131
    aget-char v13, v3, v9

    .line 132
    .line 133
    goto :goto_6

    .line 134
    :cond_6
    invoke-virtual {v0, v12}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    invoke-static {v1}, Lah/a;->w(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    return-void

    .line 142
    :cond_7
    if-ne v4, v10, :cond_9

    .line 143
    .line 144
    if-eq v9, v5, :cond_8

    .line 145
    .line 146
    add-int/lit8 v4, v9, 0x1

    .line 147
    .line 148
    aget-char v13, v3, v9

    .line 149
    .line 150
    move/from16 v27, v13

    .line 151
    .line 152
    move v13, v4

    .line 153
    move/from16 v4, v27

    .line 154
    .line 155
    goto :goto_5

    .line 156
    :cond_8
    invoke-virtual {v0, v12}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    invoke-static {v1}, Lah/a;->w(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    return-void

    .line 164
    :cond_9
    move v13, v9

    .line 165
    :goto_5
    move/from16 v27, v13

    .line 166
    .line 167
    move v13, v4

    .line 168
    move/from16 v4, v27

    .line 169
    .line 170
    :goto_6
    iput-byte v8, v0, Lcom/alibaba/fastjson2/JSONReader;->valueType:B

    .line 171
    .line 172
    move/from16 v23, v1

    .line 173
    .line 174
    move/from16 v24, v23

    .line 175
    .line 176
    :goto_7
    const/16 v14, 0x39

    .line 177
    .line 178
    const/16 v25, 0xa

    .line 179
    .line 180
    const/16 v1, 0x30

    .line 181
    .line 182
    const v7, -0xccccccc

    .line 183
    .line 184
    .line 185
    if-lt v13, v1, :cond_e

    .line 186
    .line 187
    if-gt v13, v14, :cond_e

    .line 188
    .line 189
    if-nez v23, :cond_b

    .line 190
    .line 191
    add-int/lit8 v13, v13, -0x30

    .line 192
    .line 193
    move/from16 v26, v8

    .line 194
    .line 195
    iget v8, v0, Lcom/alibaba/fastjson2/JSONReader;->mag3:I

    .line 196
    .line 197
    mul-int/lit8 v8, v8, 0xa

    .line 198
    .line 199
    iput v8, v0, Lcom/alibaba/fastjson2/JSONReader;->mag3:I

    .line 200
    .line 201
    if-ge v8, v7, :cond_a

    .line 202
    .line 203
    :goto_8
    move/from16 v23, v26

    .line 204
    .line 205
    goto :goto_9

    .line 206
    :cond_a
    sub-int/2addr v8, v13

    .line 207
    iput v8, v0, Lcom/alibaba/fastjson2/JSONReader;->mag3:I

    .line 208
    .line 209
    if-ge v8, v7, :cond_c

    .line 210
    .line 211
    goto :goto_8

    .line 212
    :cond_b
    move/from16 v26, v8

    .line 213
    .line 214
    :cond_c
    :goto_9
    if-ne v4, v5, :cond_d

    .line 215
    .line 216
    add-int/lit8 v4, v4, 0x1

    .line 217
    .line 218
    move/from16 v13, v16

    .line 219
    .line 220
    move/from16 v24, v26

    .line 221
    .line 222
    goto :goto_a

    .line 223
    :cond_d
    add-int/lit8 v1, v4, 0x1

    .line 224
    .line 225
    aget-char v13, v3, v4

    .line 226
    .line 227
    move v4, v1

    .line 228
    move/from16 v8, v26

    .line 229
    .line 230
    move/from16 v24, v8

    .line 231
    .line 232
    const/4 v1, 0x0

    .line 233
    const/4 v7, 0x5

    .line 234
    goto :goto_7

    .line 235
    :cond_e
    move/from16 v26, v8

    .line 236
    .line 237
    :goto_a
    const/16 v8, 0x2e

    .line 238
    .line 239
    if-ne v13, v8, :cond_13

    .line 240
    .line 241
    iput-byte v15, v0, Lcom/alibaba/fastjson2/JSONReader;->valueType:B

    .line 242
    .line 243
    if-eq v4, v5, :cond_12

    .line 244
    .line 245
    add-int/lit8 v8, v4, 0x1

    .line 246
    .line 247
    aget-char v4, v3, v4

    .line 248
    .line 249
    move v13, v4

    .line 250
    :goto_b
    move v4, v8

    .line 251
    if-lt v13, v1, :cond_13

    .line 252
    .line 253
    if-gt v13, v14, :cond_13

    .line 254
    .line 255
    if-nez v23, :cond_10

    .line 256
    .line 257
    add-int/lit8 v13, v13, -0x30

    .line 258
    .line 259
    iget v8, v0, Lcom/alibaba/fastjson2/JSONReader;->mag3:I

    .line 260
    .line 261
    mul-int/lit8 v8, v8, 0xa

    .line 262
    .line 263
    iput v8, v0, Lcom/alibaba/fastjson2/JSONReader;->mag3:I

    .line 264
    .line 265
    if-ge v8, v7, :cond_f

    .line 266
    .line 267
    :goto_c
    move/from16 v23, v26

    .line 268
    .line 269
    goto :goto_d

    .line 270
    :cond_f
    sub-int/2addr v8, v13

    .line 271
    iput v8, v0, Lcom/alibaba/fastjson2/JSONReader;->mag3:I

    .line 272
    .line 273
    if-ge v8, v7, :cond_10

    .line 274
    .line 275
    goto :goto_c

    .line 276
    :cond_10
    :goto_d
    iget-short v8, v0, Lcom/alibaba/fastjson2/JSONReader;->scale:S

    .line 277
    .line 278
    add-int/lit8 v8, v8, 0x1

    .line 279
    .line 280
    int-to-short v8, v8

    .line 281
    iput-short v8, v0, Lcom/alibaba/fastjson2/JSONReader;->scale:S

    .line 282
    .line 283
    if-ne v4, v5, :cond_11

    .line 284
    .line 285
    add-int/lit8 v4, v4, 0x1

    .line 286
    .line 287
    move/from16 v13, v16

    .line 288
    .line 289
    move/from16 v24, v26

    .line 290
    .line 291
    goto :goto_e

    .line 292
    :cond_11
    add-int/lit8 v8, v4, 0x1

    .line 293
    .line 294
    aget-char v13, v3, v4

    .line 295
    .line 296
    move/from16 v24, v26

    .line 297
    .line 298
    goto :goto_b

    .line 299
    :cond_12
    invoke-virtual {v0, v12}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v1

    .line 303
    invoke-static {v1}, Lah/a;->w(Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    return-void

    .line 307
    :cond_13
    :goto_e
    if-eqz v23, :cond_18

    .line 308
    .line 309
    iget-boolean v7, v0, Lcom/alibaba/fastjson2/JSONReader;->negative:Z

    .line 310
    .line 311
    if-eqz v7, :cond_14

    .line 312
    .line 313
    move v8, v9

    .line 314
    goto :goto_f

    .line 315
    :cond_14
    add-int/lit8 v8, v9, -0x1

    .line 316
    .line 317
    :goto_f
    iget-short v12, v0, Lcom/alibaba/fastjson2/JSONReader;->scale:S

    .line 318
    .line 319
    if-lez v12, :cond_15

    .line 320
    .line 321
    add-int/lit8 v12, v4, -0x2

    .line 322
    .line 323
    :goto_10
    sub-int/2addr v12, v8

    .line 324
    goto :goto_11

    .line 325
    :cond_15
    add-int/lit8 v12, v4, -0x1

    .line 326
    .line 327
    goto :goto_10

    .line 328
    :goto_11
    const/16 v15, 0x26

    .line 329
    .line 330
    if-le v12, v15, :cond_17

    .line 331
    .line 332
    const/16 v12, 0x8

    .line 333
    .line 334
    iput-byte v12, v0, Lcom/alibaba/fastjson2/JSONReader;->valueType:B

    .line 335
    .line 336
    if-eqz v7, :cond_16

    .line 337
    .line 338
    add-int/lit8 v8, v8, -0x1

    .line 339
    .line 340
    :cond_16
    new-instance v7, Ljava/lang/String;

    .line 341
    .line 342
    add-int/lit8 v12, v4, -0x1

    .line 343
    .line 344
    sub-int/2addr v12, v8

    .line 345
    invoke-direct {v7, v3, v8, v12}, Ljava/lang/String;-><init>([CII)V

    .line 346
    .line 347
    .line 348
    iput-object v7, v0, Lcom/alibaba/fastjson2/JSONReader;->stringValue:Ljava/lang/String;

    .line 349
    .line 350
    goto :goto_12

    .line 351
    :cond_17
    add-int/lit8 v7, v4, -0x1

    .line 352
    .line 353
    invoke-virtual {v0, v3, v8, v7}, Lcom/alibaba/fastjson2/JSONReader;->bigInt([CII)V

    .line 354
    .line 355
    .line 356
    goto :goto_12

    .line 357
    :cond_18
    iget v7, v0, Lcom/alibaba/fastjson2/JSONReader;->mag3:I

    .line 358
    .line 359
    neg-int v7, v7

    .line 360
    iput v7, v0, Lcom/alibaba/fastjson2/JSONReader;->mag3:I

    .line 361
    .line 362
    :goto_12
    const/16 v7, 0x65

    .line 363
    .line 364
    if-eq v13, v7, :cond_19

    .line 365
    .line 366
    const/16 v8, 0x45

    .line 367
    .line 368
    if-ne v13, v8, :cond_20

    .line 369
    .line 370
    :cond_19
    add-int/lit8 v8, v4, 0x1

    .line 371
    .line 372
    aget-char v12, v3, v4

    .line 373
    .line 374
    if-ne v12, v11, :cond_1a

    .line 375
    .line 376
    add-int/lit8 v4, v4, 0x2

    .line 377
    .line 378
    aget-char v12, v3, v8

    .line 379
    .line 380
    move/from16 v8, v26

    .line 381
    .line 382
    :goto_13
    const/4 v10, 0x0

    .line 383
    goto :goto_15

    .line 384
    :cond_1a
    if-ne v12, v10, :cond_1b

    .line 385
    .line 386
    add-int/lit8 v4, v4, 0x2

    .line 387
    .line 388
    aget-char v12, v3, v8

    .line 389
    .line 390
    :goto_14
    const/4 v8, 0x0

    .line 391
    goto :goto_13

    .line 392
    :cond_1b
    move v4, v8

    .line 393
    goto :goto_14

    .line 394
    :goto_15
    if-lt v12, v1, :cond_1e

    .line 395
    .line 396
    if-gt v12, v14, :cond_1e

    .line 397
    .line 398
    add-int/lit8 v12, v12, -0x30

    .line 399
    .line 400
    mul-int/lit8 v10, v10, 0xa

    .line 401
    .line 402
    add-int/2addr v10, v12

    .line 403
    const/16 v11, 0x7ff

    .line 404
    .line 405
    if-gt v10, v11, :cond_1d

    .line 406
    .line 407
    if-ne v4, v5, :cond_1c

    .line 408
    .line 409
    move/from16 v13, v16

    .line 410
    .line 411
    move/from16 v24, v26

    .line 412
    .line 413
    goto :goto_16

    .line 414
    :cond_1c
    add-int/lit8 v11, v4, 0x1

    .line 415
    .line 416
    aget-char v12, v3, v4

    .line 417
    .line 418
    move v4, v11

    .line 419
    move/from16 v24, v26

    .line 420
    .line 421
    goto :goto_15

    .line 422
    :cond_1d
    const-string v1, "too large exp value : "

    .line 423
    .line 424
    invoke-static {v10, v1}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    move-result-object v1

    .line 428
    invoke-static {v1}, Lah/a;->w(Ljava/lang/String;)V

    .line 429
    .line 430
    .line 431
    return-void

    .line 432
    :cond_1e
    move v13, v12

    .line 433
    :goto_16
    if-eqz v8, :cond_1f

    .line 434
    .line 435
    neg-int v10, v10

    .line 436
    :cond_1f
    int-to-short v1, v10

    .line 437
    iput-short v1, v0, Lcom/alibaba/fastjson2/JSONReader;->exponent:S

    .line 438
    .line 439
    const/4 v1, 0x2

    .line 440
    iput-byte v1, v0, Lcom/alibaba/fastjson2/JSONReader;->valueType:B

    .line 441
    .line 442
    :cond_20
    if-ne v4, v9, :cond_2b

    .line 443
    .line 444
    const/16 v1, 0x6e

    .line 445
    .line 446
    const/16 v8, 0x75

    .line 447
    .line 448
    const/16 v10, 0x6c

    .line 449
    .line 450
    if-ne v13, v1, :cond_23

    .line 451
    .line 452
    aget-char v1, v3, v4

    .line 453
    .line 454
    if-ne v1, v8, :cond_22

    .line 455
    .line 456
    add-int/lit8 v1, v4, 0x1

    .line 457
    .line 458
    aget-char v1, v3, v1

    .line 459
    .line 460
    if-ne v1, v10, :cond_22

    .line 461
    .line 462
    add-int/lit8 v1, v4, 0x2

    .line 463
    .line 464
    aget-char v1, v3, v1

    .line 465
    .line 466
    if-ne v1, v10, :cond_22

    .line 467
    .line 468
    add-int/lit8 v1, v4, 0x3

    .line 469
    .line 470
    move/from16 v7, v26

    .line 471
    .line 472
    iput-boolean v7, v0, Lcom/alibaba/fastjson2/JSONReader;->wasNull:Z

    .line 473
    .line 474
    const/4 v7, 0x5

    .line 475
    iput-byte v7, v0, Lcom/alibaba/fastjson2/JSONReader;->valueType:B

    .line 476
    .line 477
    if-ne v1, v5, :cond_21

    .line 478
    .line 479
    move v4, v1

    .line 480
    move/from16 v13, v16

    .line 481
    .line 482
    goto :goto_17

    .line 483
    :cond_21
    add-int/lit8 v4, v4, 0x4

    .line 484
    .line 485
    aget-char v1, v3, v1

    .line 486
    .line 487
    move v13, v1

    .line 488
    :goto_17
    const/4 v7, 0x0

    .line 489
    const/4 v8, 0x1

    .line 490
    const/16 v24, 0x1

    .line 491
    .line 492
    goto/16 :goto_1d

    .line 493
    .line 494
    :cond_22
    const/4 v7, 0x0

    .line 495
    const/4 v8, 0x1

    .line 496
    goto/16 :goto_1d

    .line 497
    .line 498
    :cond_23
    const/16 v1, 0x74

    .line 499
    .line 500
    const/4 v11, 0x4

    .line 501
    if-ne v13, v1, :cond_25

    .line 502
    .line 503
    aget-char v1, v3, v4

    .line 504
    .line 505
    const/16 v12, 0x72

    .line 506
    .line 507
    if-ne v1, v12, :cond_25

    .line 508
    .line 509
    add-int/lit8 v1, v4, 0x1

    .line 510
    .line 511
    aget-char v1, v3, v1

    .line 512
    .line 513
    if-ne v1, v8, :cond_25

    .line 514
    .line 515
    add-int/lit8 v1, v4, 0x2

    .line 516
    .line 517
    aget-char v1, v3, v1

    .line 518
    .line 519
    if-ne v1, v7, :cond_25

    .line 520
    .line 521
    add-int/lit8 v1, v4, 0x3

    .line 522
    .line 523
    const/4 v8, 0x1

    .line 524
    iput-boolean v8, v0, Lcom/alibaba/fastjson2/JSONReader;->boolValue:Z

    .line 525
    .line 526
    iput-byte v11, v0, Lcom/alibaba/fastjson2/JSONReader;->valueType:B

    .line 527
    .line 528
    if-ne v1, v5, :cond_24

    .line 529
    .line 530
    move v4, v1

    .line 531
    move/from16 v13, v16

    .line 532
    .line 533
    goto :goto_18

    .line 534
    :cond_24
    add-int/lit8 v4, v4, 0x4

    .line 535
    .line 536
    aget-char v1, v3, v1

    .line 537
    .line 538
    move v13, v1

    .line 539
    :goto_18
    move/from16 v24, v8

    .line 540
    .line 541
    :goto_19
    const/4 v7, 0x0

    .line 542
    goto/16 :goto_1d

    .line 543
    .line 544
    :cond_25
    const/4 v8, 0x1

    .line 545
    const/16 v1, 0x66

    .line 546
    .line 547
    const/16 v12, 0x61

    .line 548
    .line 549
    if-ne v13, v1, :cond_27

    .line 550
    .line 551
    aget-char v1, v3, v4

    .line 552
    .line 553
    if-ne v1, v12, :cond_27

    .line 554
    .line 555
    add-int/lit8 v1, v4, 0x1

    .line 556
    .line 557
    aget-char v1, v3, v1

    .line 558
    .line 559
    if-ne v1, v10, :cond_27

    .line 560
    .line 561
    add-int/lit8 v1, v4, 0x2

    .line 562
    .line 563
    aget-char v1, v3, v1

    .line 564
    .line 565
    const/16 v10, 0x73

    .line 566
    .line 567
    if-ne v1, v10, :cond_27

    .line 568
    .line 569
    add-int/lit8 v1, v4, 0x3

    .line 570
    .line 571
    aget-char v1, v3, v1

    .line 572
    .line 573
    if-ne v1, v7, :cond_27

    .line 574
    .line 575
    add-int/lit8 v1, v4, 0x4

    .line 576
    .line 577
    const/4 v7, 0x0

    .line 578
    iput-boolean v7, v0, Lcom/alibaba/fastjson2/JSONReader;->boolValue:Z

    .line 579
    .line 580
    iput-byte v11, v0, Lcom/alibaba/fastjson2/JSONReader;->valueType:B

    .line 581
    .line 582
    if-ne v1, v5, :cond_26

    .line 583
    .line 584
    :goto_1a
    move v4, v1

    .line 585
    move/from16 v13, v16

    .line 586
    .line 587
    goto :goto_1c

    .line 588
    :cond_26
    add-int/lit8 v4, v4, 0x5

    .line 589
    .line 590
    aget-char v1, v3, v1

    .line 591
    .line 592
    :goto_1b
    move v13, v1

    .line 593
    :goto_1c
    move/from16 v24, v8

    .line 594
    .line 595
    goto :goto_1d

    .line 596
    :cond_27
    const/4 v7, 0x0

    .line 597
    const/16 v1, 0x4e

    .line 598
    .line 599
    if-ne v13, v1, :cond_29

    .line 600
    .line 601
    aget-char v10, v3, v4

    .line 602
    .line 603
    if-ne v10, v12, :cond_29

    .line 604
    .line 605
    add-int/lit8 v10, v4, 0x1

    .line 606
    .line 607
    aget-char v10, v3, v10

    .line 608
    .line 609
    if-ne v10, v1, :cond_29

    .line 610
    .line 611
    add-int/lit8 v1, v4, 0x2

    .line 612
    .line 613
    const/16 v10, 0xe

    .line 614
    .line 615
    iput-byte v10, v0, Lcom/alibaba/fastjson2/JSONReader;->valueType:B

    .line 616
    .line 617
    if-ne v1, v5, :cond_28

    .line 618
    .line 619
    goto :goto_1a

    .line 620
    :cond_28
    add-int/lit8 v4, v4, 0x3

    .line 621
    .line 622
    aget-char v1, v3, v1

    .line 623
    .line 624
    goto :goto_1b

    .line 625
    :cond_29
    const/16 v1, 0x7b

    .line 626
    .line 627
    if-ne v13, v1, :cond_2a

    .line 628
    .line 629
    if-nez v6, :cond_2a

    .line 630
    .line 631
    iput v4, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 632
    .line 633
    iput-char v13, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 634
    .line 635
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReader;->readObject()Ljava/util/Map;

    .line 636
    .line 637
    .line 638
    move-result-object v1

    .line 639
    iput-object v1, v0, Lcom/alibaba/fastjson2/JSONReader;->complex:Ljava/lang/Object;

    .line 640
    .line 641
    const/4 v1, 0x6

    .line 642
    iput-byte v1, v0, Lcom/alibaba/fastjson2/JSONReader;->valueType:B

    .line 643
    .line 644
    return-void

    .line 645
    :cond_2a
    const/16 v1, 0x5b

    .line 646
    .line 647
    if-ne v13, v1, :cond_2c

    .line 648
    .line 649
    if-nez v6, :cond_2c

    .line 650
    .line 651
    iput v4, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 652
    .line 653
    iput-char v13, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 654
    .line 655
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReader;->readArray()Ljava/util/List;

    .line 656
    .line 657
    .line 658
    move-result-object v1

    .line 659
    iput-object v1, v0, Lcom/alibaba/fastjson2/JSONReader;->complex:Ljava/lang/Object;

    .line 660
    .line 661
    const/4 v1, 0x7

    .line 662
    iput-byte v1, v0, Lcom/alibaba/fastjson2/JSONReader;->valueType:B

    .line 663
    .line 664
    return-void

    .line 665
    :cond_2b
    move/from16 v8, v26

    .line 666
    .line 667
    goto :goto_19

    .line 668
    :cond_2c
    :goto_1d
    if-eqz v6, :cond_2f

    .line 669
    .line 670
    if-eq v13, v6, :cond_2d

    .line 671
    .line 672
    iput v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 673
    .line 674
    iput-char v6, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 675
    .line 676
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->readString0()V

    .line 677
    .line 678
    .line 679
    const/4 v1, 0x3

    .line 680
    iput-byte v1, v0, Lcom/alibaba/fastjson2/JSONReader;->valueType:B

    .line 681
    .line 682
    return-void

    .line 683
    :cond_2d
    if-ne v4, v5, :cond_2e

    .line 684
    .line 685
    move/from16 v13, v16

    .line 686
    .line 687
    goto :goto_1e

    .line 688
    :cond_2e
    add-int/lit8 v1, v4, 0x1

    .line 689
    .line 690
    aget-char v2, v3, v4

    .line 691
    .line 692
    move v4, v1

    .line 693
    move v13, v2

    .line 694
    :cond_2f
    :goto_1e
    const/16 v1, 0x4c

    .line 695
    .line 696
    if-eq v13, v1, :cond_31

    .line 697
    .line 698
    const/16 v1, 0x46

    .line 699
    .line 700
    if-eq v13, v1, :cond_31

    .line 701
    .line 702
    const/16 v1, 0x44

    .line 703
    .line 704
    if-eq v13, v1, :cond_31

    .line 705
    .line 706
    const/16 v1, 0x42

    .line 707
    .line 708
    if-eq v13, v1, :cond_31

    .line 709
    .line 710
    const/16 v1, 0x53

    .line 711
    .line 712
    if-ne v13, v1, :cond_30

    .line 713
    .line 714
    goto :goto_20

    .line 715
    :cond_30
    :goto_1f
    const/16 v1, 0x20

    .line 716
    .line 717
    goto :goto_24

    .line 718
    :cond_31
    :goto_20
    const/16 v1, 0x42

    .line 719
    .line 720
    if-eq v13, v1, :cond_36

    .line 721
    .line 722
    const/16 v1, 0x44

    .line 723
    .line 724
    if-eq v13, v1, :cond_35

    .line 725
    .line 726
    const/16 v1, 0x46

    .line 727
    .line 728
    if-eq v13, v1, :cond_34

    .line 729
    .line 730
    const/16 v1, 0x4c

    .line 731
    .line 732
    if-eq v13, v1, :cond_33

    .line 733
    .line 734
    const/16 v1, 0x53

    .line 735
    .line 736
    if-eq v13, v1, :cond_32

    .line 737
    .line 738
    goto :goto_21

    .line 739
    :cond_32
    if-nez v23, :cond_37

    .line 740
    .line 741
    iget-byte v1, v0, Lcom/alibaba/fastjson2/JSONReader;->valueType:B

    .line 742
    .line 743
    const/4 v2, 0x2

    .line 744
    if-eq v1, v2, :cond_37

    .line 745
    .line 746
    move/from16 v1, v25

    .line 747
    .line 748
    iput-byte v1, v0, Lcom/alibaba/fastjson2/JSONReader;->valueType:B

    .line 749
    .line 750
    goto :goto_21

    .line 751
    :cond_33
    const/4 v2, 0x2

    .line 752
    sub-int v1, v4, v9

    .line 753
    .line 754
    const/16 v6, 0x13

    .line 755
    .line 756
    if-ge v1, v6, :cond_37

    .line 757
    .line 758
    iget-byte v1, v0, Lcom/alibaba/fastjson2/JSONReader;->valueType:B

    .line 759
    .line 760
    if-eq v1, v2, :cond_37

    .line 761
    .line 762
    const/16 v1, 0xb

    .line 763
    .line 764
    iput-byte v1, v0, Lcom/alibaba/fastjson2/JSONReader;->valueType:B

    .line 765
    .line 766
    goto :goto_21

    .line 767
    :cond_34
    const/16 v1, 0xc

    .line 768
    .line 769
    iput-byte v1, v0, Lcom/alibaba/fastjson2/JSONReader;->valueType:B

    .line 770
    .line 771
    goto :goto_21

    .line 772
    :cond_35
    const/16 v1, 0xd

    .line 773
    .line 774
    iput-byte v1, v0, Lcom/alibaba/fastjson2/JSONReader;->valueType:B

    .line 775
    .line 776
    goto :goto_21

    .line 777
    :cond_36
    if-nez v23, :cond_37

    .line 778
    .line 779
    iget-byte v1, v0, Lcom/alibaba/fastjson2/JSONReader;->valueType:B

    .line 780
    .line 781
    const/4 v2, 0x2

    .line 782
    if-eq v1, v2, :cond_37

    .line 783
    .line 784
    const/16 v1, 0x9

    .line 785
    .line 786
    iput-byte v1, v0, Lcom/alibaba/fastjson2/JSONReader;->valueType:B

    .line 787
    .line 788
    :cond_37
    :goto_21
    if-ne v4, v5, :cond_38

    .line 789
    .line 790
    :goto_22
    move/from16 v13, v16

    .line 791
    .line 792
    goto :goto_1f

    .line 793
    :cond_38
    add-int/lit8 v1, v4, 0x1

    .line 794
    .line 795
    aget-char v2, v3, v4

    .line 796
    .line 797
    :goto_23
    move v4, v1

    .line 798
    move v13, v2

    .line 799
    goto :goto_1f

    .line 800
    :goto_24
    if-gt v13, v1, :cond_3a

    .line 801
    .line 802
    shl-long v1, v21, v13

    .line 803
    .line 804
    and-long v1, v1, v19

    .line 805
    .line 806
    cmp-long v1, v1, v17

    .line 807
    .line 808
    if-eqz v1, :cond_3a

    .line 809
    .line 810
    if-ne v4, v5, :cond_39

    .line 811
    .line 812
    goto :goto_22

    .line 813
    :cond_39
    add-int/lit8 v1, v4, 0x1

    .line 814
    .line 815
    aget-char v2, v3, v4

    .line 816
    .line 817
    goto :goto_23

    .line 818
    :cond_3a
    const/16 v1, 0x2c

    .line 819
    .line 820
    if-ne v13, v1, :cond_3b

    .line 821
    .line 822
    move v1, v8

    .line 823
    goto :goto_25

    .line 824
    :cond_3b
    move v1, v7

    .line 825
    :goto_25
    iput-boolean v1, v0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 826
    .line 827
    if-eqz v1, :cond_3e

    .line 828
    .line 829
    if-ne v4, v5, :cond_3c

    .line 830
    .line 831
    move/from16 v2, v16

    .line 832
    .line 833
    goto :goto_26

    .line 834
    :cond_3c
    add-int/lit8 v1, v4, 0x1

    .line 835
    .line 836
    aget-char v2, v3, v4

    .line 837
    .line 838
    move v4, v1

    .line 839
    :goto_26
    move v13, v2

    .line 840
    const/16 v1, 0x20

    .line 841
    .line 842
    :goto_27
    if-gt v13, v1, :cond_3e

    .line 843
    .line 844
    shl-long v6, v21, v13

    .line 845
    .line 846
    and-long v6, v6, v19

    .line 847
    .line 848
    cmp-long v2, v6, v17

    .line 849
    .line 850
    if-eqz v2, :cond_3e

    .line 851
    .line 852
    if-ne v4, v5, :cond_3d

    .line 853
    .line 854
    move/from16 v13, v16

    .line 855
    .line 856
    goto :goto_27

    .line 857
    :cond_3d
    add-int/lit8 v2, v4, 0x1

    .line 858
    .line 859
    aget-char v4, v3, v4

    .line 860
    .line 861
    move v13, v4

    .line 862
    move v4, v2

    .line 863
    goto :goto_27

    .line 864
    :cond_3e
    if-eqz v24, :cond_3f

    .line 865
    .line 866
    iput v4, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 867
    .line 868
    iput-char v13, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 869
    .line 870
    return-void

    .line 871
    :cond_3f
    const-string v1, "illegal input error"

    .line 872
    .line 873
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 874
    .line 875
    .line 876
    move-result-object v1

    .line 877
    invoke-static {v1}, Lah/a;->w(Ljava/lang/String;)V

    .line 878
    .line 879
    .line 880
    return-void
.end method

.method public final readOffsetDateTime()Ljava/time/OffsetDateTime;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 4
    .line 5
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 6
    .line 7
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 8
    .line 9
    iget-char v4, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    const/16 v6, 0x22

    .line 13
    .line 14
    if-eq v4, v6, :cond_1

    .line 15
    .line 16
    const/16 v7, 0x27

    .line 17
    .line 18
    if-ne v4, v7, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move-object/from16 v18, v5

    .line 22
    .line 23
    goto/16 :goto_a

    .line 24
    .line 25
    :cond_1
    :goto_0
    iget-object v7, v0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 26
    .line 27
    iget-boolean v7, v7, Lcom/alibaba/fastjson2/JSONReader$Context;->formatComplex:Z

    .line 28
    .line 29
    if-nez v7, :cond_0

    .line 30
    .line 31
    add-int/lit8 v7, v2, 0x13

    .line 32
    .line 33
    array-length v8, v1

    .line 34
    if-ge v7, v8, :cond_0

    .line 35
    .line 36
    if-ge v7, v3, :cond_0

    .line 37
    .line 38
    add-int/lit8 v8, v2, 0x4

    .line 39
    .line 40
    aget-char v8, v1, v8

    .line 41
    .line 42
    const/16 v9, 0x2d

    .line 43
    .line 44
    if-ne v8, v9, :cond_0

    .line 45
    .line 46
    add-int/lit8 v8, v2, 0x7

    .line 47
    .line 48
    aget-char v8, v1, v8

    .line 49
    .line 50
    if-ne v8, v9, :cond_0

    .line 51
    .line 52
    add-int/lit8 v8, v2, 0xa

    .line 53
    .line 54
    aget-char v8, v1, v8

    .line 55
    .line 56
    const/16 v9, 0x20

    .line 57
    .line 58
    if-eq v8, v9, :cond_2

    .line 59
    .line 60
    const/16 v10, 0x54

    .line 61
    .line 62
    if-ne v8, v10, :cond_0

    .line 63
    .line 64
    :cond_2
    add-int/lit8 v8, v2, 0xd

    .line 65
    .line 66
    aget-char v8, v1, v8

    .line 67
    .line 68
    const/16 v10, 0x3a

    .line 69
    .line 70
    if-ne v8, v10, :cond_0

    .line 71
    .line 72
    add-int/lit8 v8, v2, 0x10

    .line 73
    .line 74
    aget-char v8, v1, v8

    .line 75
    .line 76
    if-ne v8, v10, :cond_0

    .line 77
    .line 78
    invoke-static {v1, v2}, Lcom/alibaba/fastjson2/util/IOUtils;->digit4([CI)I

    .line 79
    .line 80
    .line 81
    move-result v11

    .line 82
    add-int/lit8 v8, v2, 0x5

    .line 83
    .line 84
    invoke-static {v1, v8}, Lcom/alibaba/fastjson2/util/IOUtils;->digit2([CI)I

    .line 85
    .line 86
    .line 87
    move-result v12

    .line 88
    add-int/lit8 v8, v2, 0x8

    .line 89
    .line 90
    invoke-static {v1, v8}, Lcom/alibaba/fastjson2/util/IOUtils;->digit2([CI)I

    .line 91
    .line 92
    .line 93
    move-result v13

    .line 94
    add-int/lit8 v8, v2, 0xb

    .line 95
    .line 96
    invoke-static {v1, v8}, Lcom/alibaba/fastjson2/util/IOUtils;->digit2([CI)I

    .line 97
    .line 98
    .line 99
    move-result v14

    .line 100
    add-int/lit8 v8, v2, 0xe

    .line 101
    .line 102
    invoke-static {v1, v8}, Lcom/alibaba/fastjson2/util/IOUtils;->digit2([CI)I

    .line 103
    .line 104
    .line 105
    move-result v15

    .line 106
    add-int/lit8 v8, v2, 0x11

    .line 107
    .line 108
    invoke-static {v1, v8}, Lcom/alibaba/fastjson2/util/IOUtils;->digit2([CI)I

    .line 109
    .line 110
    .line 111
    move-result v16

    .line 112
    or-int v8, v11, v12

    .line 113
    .line 114
    or-int/2addr v8, v13

    .line 115
    or-int/2addr v8, v15

    .line 116
    or-int v8, v8, v16

    .line 117
    .line 118
    if-gez v8, :cond_4

    .line 119
    .line 120
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReader;->readZonedDateTime()Ljava/time/ZonedDateTime;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    if-nez v1, :cond_3

    .line 125
    .line 126
    return-object v5

    .line 127
    :cond_3
    invoke-virtual {v1}, Ljava/time/ZonedDateTime;->toOffsetDateTime()Ljava/time/OffsetDateTime;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    return-object v1

    .line 132
    :cond_4
    add-int/lit8 v8, v2, 0x14

    .line 133
    .line 134
    aget-char v7, v1, v7

    .line 135
    .line 136
    const/16 v10, 0x2e

    .line 137
    .line 138
    const/16 v17, 0x0

    .line 139
    .line 140
    if-ne v7, v10, :cond_5

    .line 141
    .line 142
    add-int/lit8 v2, v2, 0x15

    .line 143
    .line 144
    aget-char v7, v1, v8

    .line 145
    .line 146
    move v8, v2

    .line 147
    :cond_5
    move-object/from16 v18, v5

    .line 148
    .line 149
    move/from16 v2, v17

    .line 150
    .line 151
    move v10, v2

    .line 152
    :goto_1
    const/16 v5, 0x30

    .line 153
    .line 154
    if-lt v7, v5, :cond_6

    .line 155
    .line 156
    const/16 v5, 0x39

    .line 157
    .line 158
    if-gt v7, v5, :cond_6

    .line 159
    .line 160
    mul-int/lit8 v2, v2, 0xa

    .line 161
    .line 162
    add-int/lit8 v5, v7, -0x30

    .line 163
    .line 164
    add-int/2addr v2, v5

    .line 165
    add-int/lit8 v10, v10, 0x1

    .line 166
    .line 167
    if-ge v8, v3, :cond_6

    .line 168
    .line 169
    add-int/lit8 v5, v8, 0x1

    .line 170
    .line 171
    aget-char v7, v1, v8

    .line 172
    .line 173
    move v8, v5

    .line 174
    goto :goto_1

    .line 175
    :cond_6
    if-eqz v10, :cond_7

    .line 176
    .line 177
    invoke-static {v2, v10}, Lcom/alibaba/fastjson2/util/DateUtils;->nanos(II)I

    .line 178
    .line 179
    .line 180
    move-result v2

    .line 181
    :cond_7
    sget-object v5, Ljava/time/ZoneOffset;->UTC:Ljava/time/ZoneOffset;

    .line 182
    .line 183
    const/16 v10, 0x5a

    .line 184
    .line 185
    const/16 v19, 0x1

    .line 186
    .line 187
    if-ne v7, v10, :cond_8

    .line 188
    .line 189
    add-int/lit8 v6, v8, 0x1

    .line 190
    .line 191
    aget-char v7, v1, v8

    .line 192
    .line 193
    move v8, v6

    .line 194
    goto :goto_2

    .line 195
    :cond_8
    if-eq v7, v4, :cond_9

    .line 196
    .line 197
    invoke-static {v1, v6, v8, v3}, Lcom/alibaba/fastjson2/util/IOUtils;->indexOfChar([CIII)I

    .line 198
    .line 199
    .line 200
    move-result v6

    .line 201
    const/4 v10, -0x1

    .line 202
    if-eq v6, v10, :cond_9

    .line 203
    .line 204
    add-int/lit8 v5, v8, -0x1

    .line 205
    .line 206
    sub-int v7, v6, v8

    .line 207
    .line 208
    add-int/lit8 v7, v7, 0x1

    .line 209
    .line 210
    invoke-static {v1, v5, v7}, Lcom/alibaba/fastjson2/util/DateUtils;->zoneOffset([CII)Ljava/time/ZoneOffset;

    .line 211
    .line 212
    .line 213
    move-result-object v5

    .line 214
    add-int/lit8 v8, v6, 0x1

    .line 215
    .line 216
    move v7, v4

    .line 217
    :cond_9
    :goto_2
    if-ne v7, v4, :cond_11

    .line 218
    .line 219
    const/16 v4, 0x1a

    .line 220
    .line 221
    if-lt v8, v3, :cond_a

    .line 222
    .line 223
    :goto_3
    move v7, v4

    .line 224
    goto :goto_5

    .line 225
    :cond_a
    add-int/lit8 v6, v8, 0x1

    .line 226
    .line 227
    aget-char v7, v1, v8

    .line 228
    .line 229
    :goto_4
    move v8, v6

    .line 230
    :goto_5
    const-wide/16 v20, 0x0

    .line 231
    .line 232
    const-wide v22, 0x100003701L

    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    const-wide/16 v24, 0x1

    .line 238
    .line 239
    if-gt v7, v9, :cond_c

    .line 240
    .line 241
    shl-long v26, v24, v7

    .line 242
    .line 243
    and-long v26, v26, v22

    .line 244
    .line 245
    cmp-long v6, v26, v20

    .line 246
    .line 247
    if-eqz v6, :cond_c

    .line 248
    .line 249
    if-ne v8, v3, :cond_b

    .line 250
    .line 251
    goto :goto_3

    .line 252
    :cond_b
    add-int/lit8 v6, v8, 0x1

    .line 253
    .line 254
    aget-char v7, v1, v8

    .line 255
    .line 256
    goto :goto_4

    .line 257
    :cond_c
    const/16 v6, 0x2c

    .line 258
    .line 259
    if-ne v7, v6, :cond_d

    .line 260
    .line 261
    move/from16 v6, v19

    .line 262
    .line 263
    goto :goto_6

    .line 264
    :cond_d
    move/from16 v6, v17

    .line 265
    .line 266
    :goto_6
    iput-boolean v6, v0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 267
    .line 268
    if-eqz v6, :cond_10

    .line 269
    .line 270
    if-ne v8, v3, :cond_e

    .line 271
    .line 272
    :goto_7
    move v7, v4

    .line 273
    goto :goto_9

    .line 274
    :cond_e
    add-int/lit8 v6, v8, 0x1

    .line 275
    .line 276
    aget-char v7, v1, v8

    .line 277
    .line 278
    :goto_8
    move v8, v6

    .line 279
    :goto_9
    if-gt v7, v9, :cond_10

    .line 280
    .line 281
    shl-long v17, v24, v7

    .line 282
    .line 283
    and-long v17, v17, v22

    .line 284
    .line 285
    cmp-long v6, v17, v20

    .line 286
    .line 287
    if-eqz v6, :cond_10

    .line 288
    .line 289
    if-ne v8, v3, :cond_f

    .line 290
    .line 291
    goto :goto_7

    .line 292
    :cond_f
    add-int/lit8 v6, v8, 0x1

    .line 293
    .line 294
    aget-char v7, v1, v8

    .line 295
    .line 296
    goto :goto_8

    .line 297
    :cond_10
    iput v8, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 298
    .line 299
    iput-char v7, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 300
    .line 301
    move/from16 v17, v2

    .line 302
    .line 303
    move-object/from16 v18, v5

    .line 304
    .line 305
    invoke-static/range {v11 .. v18}, Ljava/time/OffsetDateTime;->of(IIIIIIILjava/time/ZoneOffset;)Ljava/time/OffsetDateTime;

    .line 306
    .line 307
    .line 308
    move-result-object v1

    .line 309
    return-object v1

    .line 310
    :cond_11
    :goto_a
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReader;->readZonedDateTime()Ljava/time/ZonedDateTime;

    .line 311
    .line 312
    .line 313
    move-result-object v1

    .line 314
    if-nez v1, :cond_12

    .line 315
    .line 316
    return-object v18

    .line 317
    :cond_12
    invoke-virtual {v1}, Ljava/time/ZonedDateTime;->toOffsetDateTime()Ljava/time/OffsetDateTime;

    .line 318
    .line 319
    .line 320
    move-result-object v1

    .line 321
    return-object v1
.end method

.method public final readOffsetTime()Ljava/time/OffsetTime;
    .locals 15

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 6
    .line 7
    iget-char v3, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 8
    .line 9
    const/16 v4, 0x22

    .line 10
    .line 11
    const-string v5, "illegal offsetTime"

    .line 12
    .line 13
    if-eq v3, v4, :cond_0

    .line 14
    .line 15
    const/16 v4, 0x27

    .line 16
    .line 17
    if-ne v3, v4, :cond_c

    .line 18
    .line 19
    :cond_0
    iget-object v2, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->dateFormat:Ljava/lang/String;

    .line 20
    .line 21
    if-nez v2, :cond_c

    .line 22
    .line 23
    add-int/lit8 v2, v1, 0x8

    .line 24
    .line 25
    array-length v4, v0

    .line 26
    if-ge v2, v4, :cond_c

    .line 27
    .line 28
    iget v4, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 29
    .line 30
    if-ge v2, v4, :cond_c

    .line 31
    .line 32
    add-int/lit8 v4, v1, 0x2

    .line 33
    .line 34
    aget-char v4, v0, v4

    .line 35
    .line 36
    const/16 v6, 0x3a

    .line 37
    .line 38
    if-ne v4, v6, :cond_c

    .line 39
    .line 40
    add-int/lit8 v4, v1, 0x5

    .line 41
    .line 42
    aget-char v4, v0, v4

    .line 43
    .line 44
    if-ne v4, v6, :cond_c

    .line 45
    .line 46
    aget-char v4, v0, v1

    .line 47
    .line 48
    add-int/lit8 v6, v1, 0x1

    .line 49
    .line 50
    aget-char v6, v0, v6

    .line 51
    .line 52
    add-int/lit8 v7, v1, 0x3

    .line 53
    .line 54
    aget-char v7, v0, v7

    .line 55
    .line 56
    add-int/lit8 v8, v1, 0x4

    .line 57
    .line 58
    aget-char v8, v0, v8

    .line 59
    .line 60
    add-int/lit8 v9, v1, 0x6

    .line 61
    .line 62
    aget-char v9, v0, v9

    .line 63
    .line 64
    add-int/lit8 v10, v1, 0x7

    .line 65
    .line 66
    aget-char v10, v0, v10

    .line 67
    .line 68
    const/16 v11, 0x30

    .line 69
    .line 70
    if-lt v4, v11, :cond_b

    .line 71
    .line 72
    const/16 v12, 0x39

    .line 73
    .line 74
    if-gt v4, v12, :cond_b

    .line 75
    .line 76
    if-lt v6, v11, :cond_b

    .line 77
    .line 78
    if-gt v6, v12, :cond_b

    .line 79
    .line 80
    sub-int/2addr v4, v11

    .line 81
    mul-int/lit8 v4, v4, 0xa

    .line 82
    .line 83
    sub-int/2addr v6, v11

    .line 84
    add-int/2addr v6, v4

    .line 85
    if-lt v7, v11, :cond_a

    .line 86
    .line 87
    if-gt v7, v12, :cond_a

    .line 88
    .line 89
    if-lt v8, v11, :cond_a

    .line 90
    .line 91
    if-gt v8, v12, :cond_a

    .line 92
    .line 93
    sub-int/2addr v7, v11

    .line 94
    mul-int/lit8 v7, v7, 0xa

    .line 95
    .line 96
    sub-int/2addr v8, v11

    .line 97
    add-int/2addr v8, v7

    .line 98
    if-lt v9, v11, :cond_9

    .line 99
    .line 100
    if-gt v9, v12, :cond_9

    .line 101
    .line 102
    if-lt v10, v11, :cond_9

    .line 103
    .line 104
    if-gt v10, v12, :cond_9

    .line 105
    .line 106
    sub-int/2addr v9, v11

    .line 107
    mul-int/lit8 v9, v9, 0xa

    .line 108
    .line 109
    sub-int/2addr v10, v11

    .line 110
    add-int/2addr v10, v9

    .line 111
    add-int/lit8 v4, v1, 0x19

    .line 112
    .line 113
    const/4 v5, -0x1

    .line 114
    move v7, v2

    .line 115
    move v9, v5

    .line 116
    :goto_0
    const/4 v11, 0x0

    .line 117
    const/4 v12, 0x1

    .line 118
    if-ge v7, v4, :cond_4

    .line 119
    .line 120
    iget v13, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 121
    .line 122
    if-ge v7, v13, :cond_4

    .line 123
    .line 124
    array-length v13, v0

    .line 125
    if-ge v7, v13, :cond_4

    .line 126
    .line 127
    aget-char v13, v0, v7

    .line 128
    .line 129
    if-ne v9, v5, :cond_2

    .line 130
    .line 131
    const/16 v14, 0x5a

    .line 132
    .line 133
    if-eq v13, v14, :cond_1

    .line 134
    .line 135
    const/16 v14, 0x2b

    .line 136
    .line 137
    if-eq v13, v14, :cond_1

    .line 138
    .line 139
    const/16 v14, 0x2d

    .line 140
    .line 141
    if-ne v13, v14, :cond_2

    .line 142
    .line 143
    :cond_1
    sub-int v9, v7, v2

    .line 144
    .line 145
    sub-int/2addr v9, v12

    .line 146
    :cond_2
    if-ne v13, v3, :cond_3

    .line 147
    .line 148
    sub-int/2addr v7, v1

    .line 149
    goto :goto_1

    .line 150
    :cond_3
    add-int/lit8 v7, v7, 0x1

    .line 151
    .line 152
    goto :goto_0

    .line 153
    :cond_4
    move v7, v11

    .line 154
    :goto_1
    if-gtz v9, :cond_5

    .line 155
    .line 156
    move v2, v11

    .line 157
    goto :goto_2

    .line 158
    :cond_5
    add-int/lit8 v2, v1, 0x9

    .line 159
    .line 160
    invoke-static {v0, v9, v2}, Lcom/alibaba/fastjson2/util/DateUtils;->readNanos([CII)I

    .line 161
    .line 162
    .line 163
    move-result v2

    .line 164
    :goto_2
    add-int/lit8 v3, v7, -0x9

    .line 165
    .line 166
    sub-int/2addr v3, v9

    .line 167
    if-gt v3, v12, :cond_6

    .line 168
    .line 169
    sget-object v0, Ljava/time/ZoneOffset;->UTC:Ljava/time/ZoneOffset;

    .line 170
    .line 171
    goto :goto_3

    .line 172
    :cond_6
    new-instance v4, Ljava/lang/String;

    .line 173
    .line 174
    add-int/lit8 v1, v1, 0x9

    .line 175
    .line 176
    add-int/2addr v1, v9

    .line 177
    invoke-direct {v4, v0, v1, v3}, Ljava/lang/String;-><init>([CII)V

    .line 178
    .line 179
    .line 180
    invoke-static {v4}, Ljava/time/ZoneOffset;->of(Ljava/lang/String;)Ljava/time/ZoneOffset;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    :goto_3
    invoke-static {v6, v8, v10, v2}, Ljava/time/LocalTime;->of(IIII)Ljava/time/LocalTime;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    invoke-static {v1, v0}, Ljava/time/OffsetTime;->of(Ljava/time/LocalTime;Ljava/time/ZoneOffset;)Ljava/time/OffsetTime;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 193
    .line 194
    add-int/lit8 v7, v7, 0x2

    .line 195
    .line 196
    add-int/2addr v7, v1

    .line 197
    iput v7, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 198
    .line 199
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->next()V

    .line 200
    .line 201
    .line 202
    iget-char v1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 203
    .line 204
    const/16 v2, 0x2c

    .line 205
    .line 206
    if-ne v1, v2, :cond_7

    .line 207
    .line 208
    move v11, v12

    .line 209
    :cond_7
    iput-boolean v11, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 210
    .line 211
    if-eqz v11, :cond_8

    .line 212
    .line 213
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->next()V

    .line 214
    .line 215
    .line 216
    :cond_8
    return-object v0

    .line 217
    :cond_9
    invoke-virtual {p0, v5}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    :goto_4
    const/4 v0, 0x0

    .line 225
    return-object v0

    .line 226
    :cond_a
    invoke-virtual {p0, v5}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    goto :goto_4

    .line 234
    :cond_b
    invoke-virtual {p0, v5}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    goto :goto_4

    .line 242
    :cond_c
    invoke-virtual {p0, v5}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    goto :goto_4
.end method

.method public readPattern()Ljava/lang/String;
    .locals 15

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 2
    .line 3
    const/16 v1, 0x2f

    .line 4
    .line 5
    if-ne v0, v1, :cond_9

    .line 6
    .line 7
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 8
    .line 9
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 10
    .line 11
    move v3, v2

    .line 12
    :goto_0
    iget v4, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 13
    .line 14
    if-ge v3, v4, :cond_1

    .line 15
    .line 16
    aget-char v4, v0, v3

    .line 17
    .line 18
    if-ne v4, v1, :cond_0

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    :goto_1
    new-instance v1, Ljava/lang/String;

    .line 25
    .line 26
    sub-int v4, v3, v2

    .line 27
    .line 28
    invoke-direct {v1, v0, v2, v4}, Ljava/lang/String;-><init>([CII)V

    .line 29
    .line 30
    .line 31
    add-int/lit8 v2, v3, 0x1

    .line 32
    .line 33
    iget v4, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 34
    .line 35
    const/16 v5, 0x1a

    .line 36
    .line 37
    if-ne v2, v4, :cond_2

    .line 38
    .line 39
    move v3, v2

    .line 40
    :goto_2
    move v2, v5

    .line 41
    goto :goto_3

    .line 42
    :cond_2
    add-int/lit8 v3, v3, 0x2

    .line 43
    .line 44
    aget-char v2, v0, v2

    .line 45
    .line 46
    :goto_3
    const-wide/16 v6, 0x0

    .line 47
    .line 48
    const-wide v8, 0x100003701L

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    const-wide/16 v10, 0x1

    .line 54
    .line 55
    const/16 v4, 0x20

    .line 56
    .line 57
    if-gt v2, v4, :cond_4

    .line 58
    .line 59
    shl-long v12, v10, v2

    .line 60
    .line 61
    and-long/2addr v12, v8

    .line 62
    cmp-long v12, v12, v6

    .line 63
    .line 64
    if-eqz v12, :cond_4

    .line 65
    .line 66
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 67
    .line 68
    if-ne v3, v2, :cond_3

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_3
    add-int/lit8 v2, v3, 0x1

    .line 72
    .line 73
    aget-char v3, v0, v3

    .line 74
    .line 75
    move v14, v3

    .line 76
    move v3, v2

    .line 77
    move v2, v14

    .line 78
    goto :goto_3

    .line 79
    :cond_4
    const/16 v12, 0x2c

    .line 80
    .line 81
    if-ne v2, v12, :cond_5

    .line 82
    .line 83
    const/4 v12, 0x1

    .line 84
    goto :goto_4

    .line 85
    :cond_5
    const/4 v12, 0x0

    .line 86
    :goto_4
    iput-boolean v12, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 87
    .line 88
    if-eqz v12, :cond_8

    .line 89
    .line 90
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 91
    .line 92
    if-ne v3, v2, :cond_6

    .line 93
    .line 94
    move v2, v3

    .line 95
    move v3, v5

    .line 96
    goto :goto_5

    .line 97
    :cond_6
    add-int/lit8 v2, v3, 0x1

    .line 98
    .line 99
    aget-char v3, v0, v3

    .line 100
    .line 101
    :goto_5
    move v14, v3

    .line 102
    move v3, v2

    .line 103
    move v2, v14

    .line 104
    :goto_6
    if-gt v2, v4, :cond_8

    .line 105
    .line 106
    shl-long v12, v10, v2

    .line 107
    .line 108
    and-long/2addr v12, v8

    .line 109
    cmp-long v12, v12, v6

    .line 110
    .line 111
    if-eqz v12, :cond_8

    .line 112
    .line 113
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 114
    .line 115
    if-ne v3, v2, :cond_7

    .line 116
    .line 117
    move v2, v5

    .line 118
    goto :goto_6

    .line 119
    :cond_7
    add-int/lit8 v2, v3, 0x1

    .line 120
    .line 121
    aget-char v3, v0, v3

    .line 122
    .line 123
    goto :goto_5

    .line 124
    :cond_8
    iput v3, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 125
    .line 126
    iput-char v2, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 127
    .line 128
    return-object v1

    .line 129
    :cond_9
    const-string v0, "illegal pattern"

    .line 130
    .line 131
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    const/4 v0, 0x0

    .line 135
    return-object v0
.end method

.method public readReference()Ljava/lang/String;
    .locals 15

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->referenceBegin:I

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    return-object v0

    .line 9
    :cond_0
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 10
    .line 11
    add-int/lit8 v2, v0, 0x1

    .line 12
    .line 13
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 14
    .line 15
    aget-char v0, v1, v0

    .line 16
    .line 17
    iput-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->readString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-char v2, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 24
    .line 25
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 26
    .line 27
    :goto_0
    const-wide/16 v4, 0x0

    .line 28
    .line 29
    const-wide v6, 0x100003701L

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    const-wide/16 v8, 0x1

    .line 35
    .line 36
    const/16 v10, 0x20

    .line 37
    .line 38
    const/16 v11, 0x1a

    .line 39
    .line 40
    if-gt v2, v10, :cond_2

    .line 41
    .line 42
    shl-long v12, v8, v2

    .line 43
    .line 44
    and-long/2addr v12, v6

    .line 45
    cmp-long v12, v12, v4

    .line 46
    .line 47
    if-eqz v12, :cond_2

    .line 48
    .line 49
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 50
    .line 51
    if-ne v3, v2, :cond_1

    .line 52
    .line 53
    move v2, v11

    .line 54
    goto :goto_0

    .line 55
    :cond_1
    add-int/lit8 v2, v3, 0x1

    .line 56
    .line 57
    aget-char v3, v1, v3

    .line 58
    .line 59
    move v14, v3

    .line 60
    move v3, v2

    .line 61
    move v2, v14

    .line 62
    goto :goto_0

    .line 63
    :cond_2
    const/16 v12, 0x7d

    .line 64
    .line 65
    if-ne v2, v12, :cond_a

    .line 66
    .line 67
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 68
    .line 69
    if-ne v3, v2, :cond_3

    .line 70
    .line 71
    move v2, v3

    .line 72
    :goto_1
    move v3, v11

    .line 73
    goto :goto_2

    .line 74
    :cond_3
    add-int/lit8 v2, v3, 0x1

    .line 75
    .line 76
    aget-char v3, v1, v3

    .line 77
    .line 78
    :goto_2
    if-gt v3, v10, :cond_5

    .line 79
    .line 80
    shl-long v12, v8, v3

    .line 81
    .line 82
    and-long/2addr v12, v6

    .line 83
    cmp-long v12, v12, v4

    .line 84
    .line 85
    if-eqz v12, :cond_5

    .line 86
    .line 87
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 88
    .line 89
    if-ne v2, v3, :cond_4

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_4
    add-int/lit8 v3, v2, 0x1

    .line 93
    .line 94
    aget-char v2, v1, v2

    .line 95
    .line 96
    move v14, v3

    .line 97
    move v3, v2

    .line 98
    move v2, v14

    .line 99
    goto :goto_2

    .line 100
    :cond_5
    const/16 v12, 0x2c

    .line 101
    .line 102
    if-ne v3, v12, :cond_6

    .line 103
    .line 104
    const/4 v12, 0x1

    .line 105
    goto :goto_3

    .line 106
    :cond_6
    const/4 v12, 0x0

    .line 107
    :goto_3
    iput-boolean v12, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 108
    .line 109
    if-eqz v12, :cond_9

    .line 110
    .line 111
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 112
    .line 113
    if-ne v2, v3, :cond_7

    .line 114
    .line 115
    move v3, v2

    .line 116
    move v2, v11

    .line 117
    goto :goto_4

    .line 118
    :cond_7
    add-int/lit8 v3, v2, 0x1

    .line 119
    .line 120
    aget-char v2, v1, v2

    .line 121
    .line 122
    :goto_4
    move v14, v3

    .line 123
    move v3, v2

    .line 124
    move v2, v14

    .line 125
    :goto_5
    if-gt v3, v10, :cond_9

    .line 126
    .line 127
    shl-long v12, v8, v3

    .line 128
    .line 129
    and-long/2addr v12, v6

    .line 130
    cmp-long v12, v12, v4

    .line 131
    .line 132
    if-eqz v12, :cond_9

    .line 133
    .line 134
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 135
    .line 136
    if-ne v2, v3, :cond_8

    .line 137
    .line 138
    move v3, v11

    .line 139
    goto :goto_5

    .line 140
    :cond_8
    add-int/lit8 v3, v2, 0x1

    .line 141
    .line 142
    aget-char v2, v1, v2

    .line 143
    .line 144
    goto :goto_4

    .line 145
    :cond_9
    iput-char v3, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 146
    .line 147
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 148
    .line 149
    return-object v0

    .line 150
    :cond_a
    const-string v1, "illegal reference : "

    .line 151
    .line 152
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    const/4 v0, 0x0

    .line 160
    return-object v0
.end method

.method public readString()Ljava/lang/String;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 4
    .line 5
    iget-char v2, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 6
    .line 7
    const/16 v3, 0x22

    .line 8
    .line 9
    if-eq v2, v3, :cond_1

    .line 10
    .line 11
    const/16 v4, 0x27

    .line 12
    .line 13
    if-ne v2, v4, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReader;->readStringNotMatch()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    return-object v1

    .line 21
    :cond_1
    :goto_0
    iget v4, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 22
    .line 23
    const/4 v5, 0x0

    .line 24
    move v6, v4

    .line 25
    move v7, v5

    .line 26
    move v8, v7

    .line 27
    :goto_1
    iget v9, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 28
    .line 29
    if-ge v6, v9, :cond_1c

    .line 30
    .line 31
    aget-char v9, v1, v6

    .line 32
    .line 33
    const/16 v10, 0x78

    .line 34
    .line 35
    const/16 v11, 0x75

    .line 36
    .line 37
    const/16 v12, 0x5c

    .line 38
    .line 39
    const/4 v13, 0x1

    .line 40
    if-ne v9, v12, :cond_4

    .line 41
    .line 42
    add-int/lit8 v8, v6, 0x1

    .line 43
    .line 44
    aget-char v9, v1, v8

    .line 45
    .line 46
    if-eq v9, v11, :cond_3

    .line 47
    .line 48
    if-eq v9, v10, :cond_2

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_2
    add-int/lit8 v8, v6, 0x3

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_3
    add-int/lit8 v8, v6, 0x5

    .line 55
    .line 56
    :goto_2
    add-int/2addr v8, v13

    .line 57
    move v6, v8

    .line 58
    move v8, v13

    .line 59
    goto/16 :goto_b

    .line 60
    .line 61
    :cond_4
    if-ne v9, v2, :cond_1b

    .line 62
    .line 63
    if-eqz v8, :cond_f

    .line 64
    .line 65
    new-array v7, v7, [C

    .line 66
    .line 67
    move v6, v5

    .line 68
    :goto_3
    aget-char v8, v1, v4

    .line 69
    .line 70
    if-ne v8, v12, :cond_d

    .line 71
    .line 72
    add-int/lit8 v8, v4, 0x1

    .line 73
    .line 74
    aget-char v9, v1, v8

    .line 75
    .line 76
    if-eq v9, v3, :cond_c

    .line 77
    .line 78
    if-eq v9, v12, :cond_c

    .line 79
    .line 80
    const/16 v14, 0x62

    .line 81
    .line 82
    if-eq v9, v14, :cond_b

    .line 83
    .line 84
    const/16 v14, 0x66

    .line 85
    .line 86
    if-eq v9, v14, :cond_a

    .line 87
    .line 88
    const/16 v14, 0x6e

    .line 89
    .line 90
    if-eq v9, v14, :cond_9

    .line 91
    .line 92
    const/16 v14, 0x72

    .line 93
    .line 94
    if-eq v9, v14, :cond_8

    .line 95
    .line 96
    if-eq v9, v10, :cond_7

    .line 97
    .line 98
    const/16 v14, 0x74

    .line 99
    .line 100
    if-eq v9, v14, :cond_6

    .line 101
    .line 102
    if-eq v9, v11, :cond_5

    .line 103
    .line 104
    invoke-virtual {v0, v9}, Lcom/alibaba/fastjson2/JSONReader;->char1(I)C

    .line 105
    .line 106
    .line 107
    move-result v4

    .line 108
    :goto_4
    move/from16 v18, v8

    .line 109
    .line 110
    move v8, v4

    .line 111
    move/from16 v4, v18

    .line 112
    .line 113
    goto :goto_5

    .line 114
    :cond_5
    add-int/lit8 v8, v4, 0x2

    .line 115
    .line 116
    aget-char v8, v1, v8

    .line 117
    .line 118
    add-int/lit8 v9, v4, 0x3

    .line 119
    .line 120
    aget-char v9, v1, v9

    .line 121
    .line 122
    add-int/lit8 v14, v4, 0x4

    .line 123
    .line 124
    aget-char v14, v1, v14

    .line 125
    .line 126
    add-int/lit8 v4, v4, 0x5

    .line 127
    .line 128
    aget-char v15, v1, v4

    .line 129
    .line 130
    invoke-static {v8, v9, v14, v15}, Lcom/alibaba/fastjson2/JSONReader;->char4(IIII)C

    .line 131
    .line 132
    .line 133
    move-result v8

    .line 134
    goto :goto_5

    .line 135
    :cond_6
    const/16 v4, 0x9

    .line 136
    .line 137
    goto :goto_4

    .line 138
    :cond_7
    add-int/lit8 v8, v4, 0x2

    .line 139
    .line 140
    aget-char v8, v1, v8

    .line 141
    .line 142
    add-int/lit8 v4, v4, 0x3

    .line 143
    .line 144
    aget-char v9, v1, v4

    .line 145
    .line 146
    invoke-static {v8, v9}, Lcom/alibaba/fastjson2/JSONReader;->char2(II)C

    .line 147
    .line 148
    .line 149
    move-result v8

    .line 150
    goto :goto_5

    .line 151
    :cond_8
    const/16 v4, 0xd

    .line 152
    .line 153
    goto :goto_4

    .line 154
    :cond_9
    const/16 v4, 0xa

    .line 155
    .line 156
    goto :goto_4

    .line 157
    :cond_a
    const/16 v4, 0xc

    .line 158
    .line 159
    goto :goto_4

    .line 160
    :cond_b
    const/16 v4, 0x8

    .line 161
    .line 162
    goto :goto_4

    .line 163
    :cond_c
    move v4, v8

    .line 164
    move v8, v9

    .line 165
    goto :goto_5

    .line 166
    :cond_d
    if-ne v8, v2, :cond_e

    .line 167
    .line 168
    new-instance v2, Ljava/lang/String;

    .line 169
    .line 170
    invoke-direct {v2, v7}, Ljava/lang/String;-><init>([C)V

    .line 171
    .line 172
    .line 173
    move v6, v4

    .line 174
    goto :goto_6

    .line 175
    :cond_e
    :goto_5
    aput-char v8, v7, v6

    .line 176
    .line 177
    add-int/2addr v4, v13

    .line 178
    add-int/2addr v6, v13

    .line 179
    goto :goto_3

    .line 180
    :cond_f
    iget-object v2, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->str:Ljava/lang/String;

    .line 181
    .line 182
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 183
    .line 184
    if-eqz v2, :cond_10

    .line 185
    .line 186
    invoke-virtual {v2, v3, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v2

    .line 190
    goto :goto_6

    .line 191
    :cond_10
    new-instance v2, Ljava/lang/String;

    .line 192
    .line 193
    sub-int v4, v6, v3

    .line 194
    .line 195
    invoke-direct {v2, v1, v3, v4}, Ljava/lang/String;-><init>([CII)V

    .line 196
    .line 197
    .line 198
    :goto_6
    iget-object v3, v0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 199
    .line 200
    iget-wide v3, v3, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 201
    .line 202
    sget-object v7, Lcom/alibaba/fastjson2/JSONReader$Feature;->TrimString:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 203
    .line 204
    iget-wide v7, v7, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 205
    .line 206
    and-long/2addr v3, v7

    .line 207
    const-wide/16 v7, 0x0

    .line 208
    .line 209
    cmp-long v3, v3, v7

    .line 210
    .line 211
    if-eqz v3, :cond_11

    .line 212
    .line 213
    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    :cond_11
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    .line 218
    .line 219
    .line 220
    move-result v3

    .line 221
    if-eqz v3, :cond_12

    .line 222
    .line 223
    iget-object v3, v0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 224
    .line 225
    iget-wide v3, v3, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 226
    .line 227
    sget-object v9, Lcom/alibaba/fastjson2/JSONReader$Feature;->EmptyStringAsNull:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 228
    .line 229
    iget-wide v9, v9, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 230
    .line 231
    and-long/2addr v3, v9

    .line 232
    cmp-long v3, v3, v7

    .line 233
    .line 234
    if-eqz v3, :cond_12

    .line 235
    .line 236
    const/4 v2, 0x0

    .line 237
    :cond_12
    add-int/lit8 v3, v6, 0x1

    .line 238
    .line 239
    iget v4, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 240
    .line 241
    const/16 v9, 0x1a

    .line 242
    .line 243
    if-eq v3, v4, :cond_1a

    .line 244
    .line 245
    add-int/lit8 v6, v6, 0x2

    .line 246
    .line 247
    aget-char v3, v1, v3

    .line 248
    .line 249
    :goto_7
    const-wide v10, 0x100003701L

    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    const-wide/16 v14, 0x1

    .line 255
    .line 256
    const/16 v4, 0x20

    .line 257
    .line 258
    if-gt v3, v4, :cond_14

    .line 259
    .line 260
    shl-long v16, v14, v3

    .line 261
    .line 262
    and-long v16, v16, v10

    .line 263
    .line 264
    cmp-long v12, v16, v7

    .line 265
    .line 266
    if-eqz v12, :cond_14

    .line 267
    .line 268
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 269
    .line 270
    if-ne v6, v3, :cond_13

    .line 271
    .line 272
    move v3, v6

    .line 273
    goto :goto_a

    .line 274
    :cond_13
    add-int/lit8 v3, v6, 0x1

    .line 275
    .line 276
    aget-char v4, v1, v6

    .line 277
    .line 278
    move v6, v3

    .line 279
    move v3, v4

    .line 280
    goto :goto_7

    .line 281
    :cond_14
    const/16 v12, 0x2c

    .line 282
    .line 283
    if-ne v3, v12, :cond_15

    .line 284
    .line 285
    move v5, v13

    .line 286
    :cond_15
    iput-boolean v5, v0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 287
    .line 288
    if-eqz v5, :cond_19

    .line 289
    .line 290
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 291
    .line 292
    if-ne v6, v3, :cond_16

    .line 293
    .line 294
    goto :goto_9

    .line 295
    :cond_16
    add-int/lit8 v3, v6, 0x1

    .line 296
    .line 297
    aget-char v5, v1, v6

    .line 298
    .line 299
    :goto_8
    move v6, v3

    .line 300
    if-gt v5, v4, :cond_18

    .line 301
    .line 302
    shl-long v12, v14, v5

    .line 303
    .line 304
    and-long/2addr v12, v10

    .line 305
    cmp-long v3, v12, v7

    .line 306
    .line 307
    if-eqz v3, :cond_18

    .line 308
    .line 309
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 310
    .line 311
    if-ne v6, v3, :cond_17

    .line 312
    .line 313
    goto :goto_9

    .line 314
    :cond_17
    add-int/lit8 v3, v6, 0x1

    .line 315
    .line 316
    aget-char v5, v1, v6

    .line 317
    .line 318
    goto :goto_8

    .line 319
    :cond_18
    move v9, v5

    .line 320
    goto :goto_9

    .line 321
    :cond_19
    move v9, v3

    .line 322
    :goto_9
    iput-char v9, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 323
    .line 324
    iput v6, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 325
    .line 326
    return-object v2

    .line 327
    :cond_1a
    :goto_a
    iput-char v9, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 328
    .line 329
    iput-boolean v5, v0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 330
    .line 331
    iput v3, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 332
    .line 333
    return-object v2

    .line 334
    :cond_1b
    add-int/lit8 v6, v6, 0x1

    .line 335
    .line 336
    :goto_b
    add-int/lit8 v7, v7, 0x1

    .line 337
    .line 338
    goto/16 :goto_1

    .line 339
    .line 340
    :cond_1c
    const-string v1, "invalid escape character EOI"

    .line 341
    .line 342
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-result-object v1

    .line 346
    invoke-static {v1}, Lah/a;->w(Ljava/lang/String;)V

    .line 347
    .line 348
    .line 349
    const/4 v1, 0x0

    .line 350
    return-object v1
.end method

.method public readString0()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-char v1, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 4
    .line 5
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    iput-boolean v3, v0, Lcom/alibaba/fastjson2/JSONReader;->valueEscape:Z

    .line 9
    .line 10
    move v4, v2

    .line 11
    move v5, v3

    .line 12
    :goto_0
    iget-object v6, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 13
    .line 14
    aget-char v7, v6, v4

    .line 15
    .line 16
    const/16 v8, 0x78

    .line 17
    .line 18
    const/16 v9, 0x75

    .line 19
    .line 20
    const/16 v10, 0x5c

    .line 21
    .line 22
    const/4 v11, 0x1

    .line 23
    if-ne v7, v10, :cond_2

    .line 24
    .line 25
    iput-boolean v11, v0, Lcom/alibaba/fastjson2/JSONReader;->valueEscape:Z

    .line 26
    .line 27
    add-int/lit8 v7, v4, 0x1

    .line 28
    .line 29
    aget-char v6, v6, v7

    .line 30
    .line 31
    if-eq v6, v9, :cond_1

    .line 32
    .line 33
    if-eq v6, v8, :cond_0

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_0
    add-int/lit8 v7, v4, 0x3

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    add-int/lit8 v7, v4, 0x5

    .line 40
    .line 41
    :goto_1
    add-int/2addr v7, v11

    .line 42
    move v4, v7

    .line 43
    goto/16 :goto_7

    .line 44
    .line 45
    :cond_2
    if-ne v7, v1, :cond_f

    .line 46
    .line 47
    iget-boolean v1, v0, Lcom/alibaba/fastjson2/JSONReader;->valueEscape:Z

    .line 48
    .line 49
    if-eqz v1, :cond_8

    .line 50
    .line 51
    new-array v1, v5, [C

    .line 52
    .line 53
    move v4, v3

    .line 54
    :goto_2
    iget-object v5, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 55
    .line 56
    aget-char v6, v5, v2

    .line 57
    .line 58
    const/16 v7, 0x22

    .line 59
    .line 60
    if-ne v6, v10, :cond_6

    .line 61
    .line 62
    add-int/lit8 v6, v2, 0x1

    .line 63
    .line 64
    aget-char v12, v5, v6

    .line 65
    .line 66
    if-eq v12, v7, :cond_5

    .line 67
    .line 68
    if-eq v12, v10, :cond_5

    .line 69
    .line 70
    if-eq v12, v9, :cond_4

    .line 71
    .line 72
    if-eq v12, v8, :cond_3

    .line 73
    .line 74
    invoke-virtual {v0, v12}, Lcom/alibaba/fastjson2/JSONReader;->char1(I)C

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    move/from16 v16, v6

    .line 79
    .line 80
    move v6, v2

    .line 81
    move/from16 v2, v16

    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_3
    add-int/lit8 v6, v2, 0x2

    .line 85
    .line 86
    aget-char v6, v5, v6

    .line 87
    .line 88
    add-int/lit8 v2, v2, 0x3

    .line 89
    .line 90
    aget-char v5, v5, v2

    .line 91
    .line 92
    invoke-static {v6, v5}, Lcom/alibaba/fastjson2/JSONReader;->char2(II)C

    .line 93
    .line 94
    .line 95
    move-result v6

    .line 96
    goto :goto_3

    .line 97
    :cond_4
    add-int/lit8 v6, v2, 0x2

    .line 98
    .line 99
    aget-char v6, v5, v6

    .line 100
    .line 101
    add-int/lit8 v7, v2, 0x3

    .line 102
    .line 103
    aget-char v7, v5, v7

    .line 104
    .line 105
    add-int/lit8 v12, v2, 0x4

    .line 106
    .line 107
    aget-char v12, v5, v12

    .line 108
    .line 109
    add-int/lit8 v2, v2, 0x5

    .line 110
    .line 111
    aget-char v5, v5, v2

    .line 112
    .line 113
    invoke-static {v6, v7, v12, v5}, Lcom/alibaba/fastjson2/JSONReader;->char4(IIII)C

    .line 114
    .line 115
    .line 116
    move-result v6

    .line 117
    goto :goto_3

    .line 118
    :cond_5
    move v2, v6

    .line 119
    move v6, v12

    .line 120
    goto :goto_3

    .line 121
    :cond_6
    if-ne v6, v7, :cond_7

    .line 122
    .line 123
    new-instance v4, Ljava/lang/String;

    .line 124
    .line 125
    invoke-direct {v4, v1}, Ljava/lang/String;-><init>([C)V

    .line 126
    .line 127
    .line 128
    move-object v1, v4

    .line 129
    move v4, v2

    .line 130
    goto :goto_4

    .line 131
    :cond_7
    :goto_3
    aput-char v6, v1, v4

    .line 132
    .line 133
    add-int/2addr v2, v11

    .line 134
    add-int/2addr v4, v11

    .line 135
    goto :goto_2

    .line 136
    :cond_8
    new-instance v1, Ljava/lang/String;

    .line 137
    .line 138
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 139
    .line 140
    sub-int v5, v4, v2

    .line 141
    .line 142
    invoke-direct {v1, v6, v2, v5}, Ljava/lang/String;-><init>([CII)V

    .line 143
    .line 144
    .line 145
    :goto_4
    add-int/2addr v4, v11

    .line 146
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 147
    .line 148
    const/16 v5, 0x1a

    .line 149
    .line 150
    if-ne v4, v2, :cond_9

    .line 151
    .line 152
    move v2, v5

    .line 153
    goto :goto_5

    .line 154
    :cond_9
    iget-object v2, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 155
    .line 156
    aget-char v2, v2, v4

    .line 157
    .line 158
    :goto_5
    const-wide/16 v6, 0x0

    .line 159
    .line 160
    const-wide v8, 0x100003701L

    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    const-wide/16 v12, 0x1

    .line 166
    .line 167
    const/16 v10, 0x20

    .line 168
    .line 169
    if-gt v2, v10, :cond_a

    .line 170
    .line 171
    shl-long v14, v12, v2

    .line 172
    .line 173
    and-long/2addr v14, v8

    .line 174
    cmp-long v14, v14, v6

    .line 175
    .line 176
    if-eqz v14, :cond_a

    .line 177
    .line 178
    iget-object v2, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 179
    .line 180
    add-int/lit8 v4, v4, 0x1

    .line 181
    .line 182
    aget-char v2, v2, v4

    .line 183
    .line 184
    goto :goto_5

    .line 185
    :cond_a
    const/16 v14, 0x2c

    .line 186
    .line 187
    if-ne v2, v14, :cond_b

    .line 188
    .line 189
    move v3, v11

    .line 190
    :cond_b
    iput-boolean v3, v0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 191
    .line 192
    if-eqz v3, :cond_d

    .line 193
    .line 194
    add-int/lit8 v2, v4, 0x1

    .line 195
    .line 196
    iget-object v3, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 197
    .line 198
    add-int/lit8 v4, v4, 0x2

    .line 199
    .line 200
    iput v4, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 201
    .line 202
    aget-char v2, v3, v2

    .line 203
    .line 204
    iput-char v2, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 205
    .line 206
    :goto_6
    iget-char v2, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 207
    .line 208
    if-gt v2, v10, :cond_e

    .line 209
    .line 210
    shl-long v2, v12, v2

    .line 211
    .line 212
    and-long/2addr v2, v8

    .line 213
    cmp-long v2, v2, v6

    .line 214
    .line 215
    if-eqz v2, :cond_e

    .line 216
    .line 217
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 218
    .line 219
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 220
    .line 221
    if-lt v2, v3, :cond_c

    .line 222
    .line 223
    iput-char v5, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 224
    .line 225
    goto :goto_6

    .line 226
    :cond_c
    iget-object v3, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 227
    .line 228
    add-int/lit8 v4, v2, 0x1

    .line 229
    .line 230
    iput v4, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 231
    .line 232
    aget-char v2, v3, v2

    .line 233
    .line 234
    iput-char v2, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 235
    .line 236
    goto :goto_6

    .line 237
    :cond_d
    add-int/2addr v4, v11

    .line 238
    iput v4, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 239
    .line 240
    int-to-char v2, v2

    .line 241
    iput-char v2, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 242
    .line 243
    :cond_e
    iput-object v1, v0, Lcom/alibaba/fastjson2/JSONReader;->stringValue:Ljava/lang/String;

    .line 244
    .line 245
    return-void

    .line 246
    :cond_f
    add-int/lit8 v4, v4, 0x1

    .line 247
    .line 248
    :goto_7
    add-int/lit8 v5, v5, 0x1

    .line 249
    .line 250
    goto/16 :goto_0
.end method

.method public readUUID()Ljava/util/UUID;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-char v1, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 4
    .line 5
    const/16 v2, 0x6e

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->readNull()V

    .line 11
    .line 12
    .line 13
    return-object v3

    .line 14
    :cond_0
    const/16 v2, 0x22

    .line 15
    .line 16
    if-eq v1, v2, :cond_2

    .line 17
    .line 18
    const/16 v2, 0x27

    .line 19
    .line 20
    if-ne v1, v2, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const-string v1, "syntax error, can not read uuid"

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-static {v1}, Lah/a;->w(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    return-object v1

    .line 34
    :cond_2
    :goto_0
    iget-object v2, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 35
    .line 36
    iget v4, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 37
    .line 38
    add-int/lit8 v5, v4, 0x24

    .line 39
    .line 40
    array-length v6, v2

    .line 41
    const/16 v7, 0x20

    .line 42
    .line 43
    const/4 v8, 0x0

    .line 44
    const-wide/16 v9, 0x0

    .line 45
    .line 46
    const/4 v11, 0x4

    .line 47
    if-ge v5, v6, :cond_8

    .line 48
    .line 49
    aget-char v5, v2, v5

    .line 50
    .line 51
    if-ne v5, v1, :cond_8

    .line 52
    .line 53
    add-int/lit8 v5, v4, 0x8

    .line 54
    .line 55
    aget-char v5, v2, v5

    .line 56
    .line 57
    const/16 v6, 0x2d

    .line 58
    .line 59
    if-ne v5, v6, :cond_8

    .line 60
    .line 61
    add-int/lit8 v5, v4, 0xd

    .line 62
    .line 63
    aget-char v5, v2, v5

    .line 64
    .line 65
    if-ne v5, v6, :cond_8

    .line 66
    .line 67
    add-int/lit8 v5, v4, 0x12

    .line 68
    .line 69
    aget-char v5, v2, v5

    .line 70
    .line 71
    if-ne v5, v6, :cond_8

    .line 72
    .line 73
    add-int/lit8 v5, v4, 0x17

    .line 74
    .line 75
    aget-char v5, v2, v5

    .line 76
    .line 77
    if-ne v5, v6, :cond_8

    .line 78
    .line 79
    move v1, v8

    .line 80
    move-wide v5, v9

    .line 81
    :goto_1
    const/16 v3, 0x8

    .line 82
    .line 83
    if-ge v1, v3, :cond_3

    .line 84
    .line 85
    shl-long/2addr v5, v11

    .line 86
    sget-object v3, Lcom/alibaba/fastjson2/JSONFactory;->UUID_VALUES:[B

    .line 87
    .line 88
    add-int v12, v4, v1

    .line 89
    .line 90
    aget-char v12, v2, v12

    .line 91
    .line 92
    add-int/lit8 v12, v12, -0x30

    .line 93
    .line 94
    aget-byte v3, v3, v12

    .line 95
    .line 96
    int-to-long v12, v3

    .line 97
    add-long/2addr v5, v12

    .line 98
    add-int/lit8 v1, v1, 0x1

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_3
    const/16 v1, 0x9

    .line 102
    .line 103
    :goto_2
    const/16 v3, 0xd

    .line 104
    .line 105
    if-ge v1, v3, :cond_4

    .line 106
    .line 107
    shl-long/2addr v5, v11

    .line 108
    sget-object v3, Lcom/alibaba/fastjson2/JSONFactory;->UUID_VALUES:[B

    .line 109
    .line 110
    add-int v12, v4, v1

    .line 111
    .line 112
    aget-char v12, v2, v12

    .line 113
    .line 114
    add-int/lit8 v12, v12, -0x30

    .line 115
    .line 116
    aget-byte v3, v3, v12

    .line 117
    .line 118
    int-to-long v12, v3

    .line 119
    add-long/2addr v5, v12

    .line 120
    add-int/lit8 v1, v1, 0x1

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_4
    const/16 v1, 0xe

    .line 124
    .line 125
    :goto_3
    const/16 v3, 0x12

    .line 126
    .line 127
    if-ge v1, v3, :cond_5

    .line 128
    .line 129
    shl-long/2addr v5, v11

    .line 130
    sget-object v3, Lcom/alibaba/fastjson2/JSONFactory;->UUID_VALUES:[B

    .line 131
    .line 132
    add-int v12, v4, v1

    .line 133
    .line 134
    aget-char v12, v2, v12

    .line 135
    .line 136
    add-int/lit8 v12, v12, -0x30

    .line 137
    .line 138
    aget-byte v3, v3, v12

    .line 139
    .line 140
    int-to-long v12, v3

    .line 141
    add-long/2addr v5, v12

    .line 142
    add-int/lit8 v1, v1, 0x1

    .line 143
    .line 144
    goto :goto_3

    .line 145
    :cond_5
    const/16 v1, 0x13

    .line 146
    .line 147
    move-wide v12, v9

    .line 148
    :goto_4
    const/16 v3, 0x17

    .line 149
    .line 150
    if-ge v1, v3, :cond_6

    .line 151
    .line 152
    shl-long/2addr v12, v11

    .line 153
    sget-object v3, Lcom/alibaba/fastjson2/JSONFactory;->UUID_VALUES:[B

    .line 154
    .line 155
    add-int v14, v4, v1

    .line 156
    .line 157
    aget-char v14, v2, v14

    .line 158
    .line 159
    add-int/lit8 v14, v14, -0x30

    .line 160
    .line 161
    aget-byte v3, v3, v14

    .line 162
    .line 163
    int-to-long v14, v3

    .line 164
    add-long/2addr v12, v14

    .line 165
    add-int/lit8 v1, v1, 0x1

    .line 166
    .line 167
    goto :goto_4

    .line 168
    :cond_6
    const/16 v1, 0x18

    .line 169
    .line 170
    :goto_5
    const/16 v3, 0x24

    .line 171
    .line 172
    if-ge v1, v3, :cond_7

    .line 173
    .line 174
    shl-long/2addr v12, v11

    .line 175
    sget-object v3, Lcom/alibaba/fastjson2/JSONFactory;->UUID_VALUES:[B

    .line 176
    .line 177
    add-int v14, v4, v1

    .line 178
    .line 179
    aget-char v14, v2, v14

    .line 180
    .line 181
    add-int/lit8 v14, v14, -0x30

    .line 182
    .line 183
    aget-byte v3, v3, v14

    .line 184
    .line 185
    int-to-long v14, v3

    .line 186
    add-long/2addr v12, v14

    .line 187
    add-int/lit8 v1, v1, 0x1

    .line 188
    .line 189
    goto :goto_5

    .line 190
    :cond_7
    add-int/lit8 v4, v4, 0x25

    .line 191
    .line 192
    goto :goto_8

    .line 193
    :cond_8
    add-int/lit8 v5, v4, 0x20

    .line 194
    .line 195
    array-length v6, v2

    .line 196
    if-ge v5, v6, :cond_10

    .line 197
    .line 198
    aget-char v5, v2, v5

    .line 199
    .line 200
    if-ne v5, v1, :cond_10

    .line 201
    .line 202
    move v1, v8

    .line 203
    move-wide v5, v9

    .line 204
    :goto_6
    const/16 v3, 0x10

    .line 205
    .line 206
    if-ge v1, v3, :cond_9

    .line 207
    .line 208
    shl-long/2addr v5, v11

    .line 209
    sget-object v3, Lcom/alibaba/fastjson2/JSONFactory;->UUID_VALUES:[B

    .line 210
    .line 211
    add-int v12, v4, v1

    .line 212
    .line 213
    aget-char v12, v2, v12

    .line 214
    .line 215
    add-int/lit8 v12, v12, -0x30

    .line 216
    .line 217
    aget-byte v3, v3, v12

    .line 218
    .line 219
    int-to-long v12, v3

    .line 220
    add-long/2addr v5, v12

    .line 221
    add-int/lit8 v1, v1, 0x1

    .line 222
    .line 223
    goto :goto_6

    .line 224
    :cond_9
    move-wide v12, v9

    .line 225
    :goto_7
    if-ge v3, v7, :cond_a

    .line 226
    .line 227
    shl-long/2addr v12, v11

    .line 228
    sget-object v1, Lcom/alibaba/fastjson2/JSONFactory;->UUID_VALUES:[B

    .line 229
    .line 230
    add-int v14, v4, v3

    .line 231
    .line 232
    aget-char v14, v2, v14

    .line 233
    .line 234
    add-int/lit8 v14, v14, -0x30

    .line 235
    .line 236
    aget-byte v1, v1, v14

    .line 237
    .line 238
    int-to-long v14, v1

    .line 239
    add-long/2addr v12, v14

    .line 240
    add-int/lit8 v3, v3, 0x1

    .line 241
    .line 242
    goto :goto_7

    .line 243
    :cond_a
    add-int/lit8 v4, v4, 0x21

    .line 244
    .line 245
    :goto_8
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 246
    .line 247
    const/16 v3, 0x1a

    .line 248
    .line 249
    if-ne v4, v1, :cond_b

    .line 250
    .line 251
    move v1, v4

    .line 252
    :goto_9
    move v4, v3

    .line 253
    goto :goto_a

    .line 254
    :cond_b
    add-int/lit8 v1, v4, 0x1

    .line 255
    .line 256
    aget-char v4, v2, v4

    .line 257
    .line 258
    :goto_a
    if-gt v4, v7, :cond_d

    .line 259
    .line 260
    const-wide/16 v14, 0x1

    .line 261
    .line 262
    shl-long/2addr v14, v4

    .line 263
    const-wide v16, 0x100003701L

    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    and-long v14, v14, v16

    .line 269
    .line 270
    cmp-long v11, v14, v9

    .line 271
    .line 272
    if-eqz v11, :cond_d

    .line 273
    .line 274
    iget v4, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 275
    .line 276
    if-ne v1, v4, :cond_c

    .line 277
    .line 278
    goto :goto_9

    .line 279
    :cond_c
    add-int/lit8 v4, v1, 0x1

    .line 280
    .line 281
    aget-char v1, v2, v1

    .line 282
    .line 283
    move/from16 v18, v4

    .line 284
    .line 285
    move v4, v1

    .line 286
    move/from16 v1, v18

    .line 287
    .line 288
    goto :goto_a

    .line 289
    :cond_d
    iput v1, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 290
    .line 291
    const/16 v1, 0x2c

    .line 292
    .line 293
    if-ne v4, v1, :cond_e

    .line 294
    .line 295
    const/4 v8, 0x1

    .line 296
    :cond_e
    iput-boolean v8, v0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 297
    .line 298
    if-eqz v8, :cond_f

    .line 299
    .line 300
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->next()V

    .line 301
    .line 302
    .line 303
    goto :goto_b

    .line 304
    :cond_f
    iput-char v4, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 305
    .line 306
    :goto_b
    new-instance v1, Ljava/util/UUID;

    .line 307
    .line 308
    invoke-direct {v1, v5, v6, v12, v13}, Ljava/util/UUID;-><init>(JJ)V

    .line 309
    .line 310
    .line 311
    return-object v1

    .line 312
    :cond_10
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->readString()Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v1

    .line 316
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 317
    .line 318
    .line 319
    move-result v2

    .line 320
    if-eqz v2, :cond_11

    .line 321
    .line 322
    return-object v3

    .line 323
    :cond_11
    invoke-static {v1}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    .line 324
    .line 325
    .line 326
    move-result-object v1

    .line 327
    return-object v1
.end method

.method public readValueHashCode()J
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-char v1, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 4
    .line 5
    const/16 v2, 0x22

    .line 6
    .line 7
    if-eq v1, v2, :cond_0

    .line 8
    .line 9
    const/16 v3, 0x27

    .line 10
    .line 11
    if-eq v1, v3, :cond_0

    .line 12
    .line 13
    const-wide/16 v1, -0x1

    .line 14
    .line 15
    return-wide v1

    .line 16
    :cond_0
    iget-object v3, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 17
    .line 18
    const/4 v4, 0x0

    .line 19
    iput-boolean v4, v0, Lcom/alibaba/fastjson2/JSONReader;->nameEscape:Z

    .line 20
    .line 21
    iget v5, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 22
    .line 23
    iput v5, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->nameBegin:I

    .line 24
    .line 25
    iget v6, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 26
    .line 27
    move v9, v4

    .line 28
    const-wide/16 v10, 0x0

    .line 29
    .line 30
    :goto_0
    const/16 v12, 0x78

    .line 31
    .line 32
    const/16 v13, 0x75

    .line 33
    .line 34
    const/16 v14, 0x5c

    .line 35
    .line 36
    const/4 v4, 0x1

    .line 37
    const-wide/16 v16, 0x0

    .line 38
    .line 39
    if-ge v5, v6, :cond_1

    .line 40
    .line 41
    aget-char v7, v3, v5

    .line 42
    .line 43
    if-ne v7, v1, :cond_3

    .line 44
    .line 45
    if-nez v9, :cond_2

    .line 46
    .line 47
    iget v5, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->nameBegin:I

    .line 48
    .line 49
    move-wide/from16 v10, v16

    .line 50
    .line 51
    :cond_1
    :goto_1
    const/16 v19, 0x20

    .line 52
    .line 53
    goto/16 :goto_7

    .line 54
    .line 55
    :cond_2
    iput v9, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->nameLength:I

    .line 56
    .line 57
    iput v5, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->nameEnd:I

    .line 58
    .line 59
    add-int/lit8 v5, v5, 0x1

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_3
    if-ne v7, v14, :cond_4

    .line 63
    .line 64
    iput-boolean v4, v0, Lcom/alibaba/fastjson2/JSONReader;->nameEscape:Z

    .line 65
    .line 66
    add-int/lit8 v7, v5, 0x1

    .line 67
    .line 68
    aget-char v8, v3, v7

    .line 69
    .line 70
    if-eq v8, v13, :cond_6

    .line 71
    .line 72
    if-eq v8, v12, :cond_5

    .line 73
    .line 74
    invoke-virtual {v0, v8}, Lcom/alibaba/fastjson2/JSONReader;->char1(I)C

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    move/from16 v19, v7

    .line 79
    .line 80
    move v7, v5

    .line 81
    move/from16 v5, v19

    .line 82
    .line 83
    :cond_4
    :goto_2
    const/16 v19, 0x20

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_5
    add-int/lit8 v7, v5, 0x2

    .line 87
    .line 88
    aget-char v7, v3, v7

    .line 89
    .line 90
    add-int/lit8 v5, v5, 0x3

    .line 91
    .line 92
    aget-char v8, v3, v5

    .line 93
    .line 94
    invoke-static {v7, v8}, Lcom/alibaba/fastjson2/JSONReader;->char2(II)C

    .line 95
    .line 96
    .line 97
    move-result v7

    .line 98
    goto :goto_2

    .line 99
    :cond_6
    add-int/lit8 v7, v5, 0x2

    .line 100
    .line 101
    aget-char v7, v3, v7

    .line 102
    .line 103
    add-int/lit8 v8, v5, 0x3

    .line 104
    .line 105
    aget-char v8, v3, v8

    .line 106
    .line 107
    add-int/lit8 v18, v5, 0x4

    .line 108
    .line 109
    const/16 v19, 0x20

    .line 110
    .line 111
    aget-char v15, v3, v18

    .line 112
    .line 113
    add-int/lit8 v5, v5, 0x5

    .line 114
    .line 115
    aget-char v2, v3, v5

    .line 116
    .line 117
    invoke-static {v7, v8, v15, v2}, Lcom/alibaba/fastjson2/JSONReader;->char4(IIII)C

    .line 118
    .line 119
    .line 120
    move-result v7

    .line 121
    :goto_3
    const/16 v2, 0xff

    .line 122
    .line 123
    if-gt v7, v2, :cond_8

    .line 124
    .line 125
    const/16 v2, 0x8

    .line 126
    .line 127
    if-ge v9, v2, :cond_8

    .line 128
    .line 129
    if-nez v9, :cond_7

    .line 130
    .line 131
    if-nez v7, :cond_7

    .line 132
    .line 133
    goto :goto_6

    .line 134
    :cond_7
    packed-switch v9, :pswitch_data_0

    .line 135
    .line 136
    .line 137
    goto :goto_5

    .line 138
    :pswitch_0
    int-to-byte v2, v7

    .line 139
    int-to-long v7, v2

    .line 140
    const/16 v2, 0x38

    .line 141
    .line 142
    shl-long/2addr v7, v2

    .line 143
    const-wide v12, 0xffffffffffffffL

    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    :goto_4
    and-long/2addr v10, v12

    .line 149
    add-long/2addr v10, v7

    .line 150
    goto :goto_5

    .line 151
    :pswitch_1
    int-to-byte v2, v7

    .line 152
    int-to-long v7, v2

    .line 153
    const/16 v2, 0x30

    .line 154
    .line 155
    shl-long/2addr v7, v2

    .line 156
    const-wide v12, 0xffffffffffffL

    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    goto :goto_4

    .line 162
    :pswitch_2
    int-to-byte v2, v7

    .line 163
    int-to-long v7, v2

    .line 164
    const/16 v2, 0x28

    .line 165
    .line 166
    shl-long/2addr v7, v2

    .line 167
    const-wide v12, 0xffffffffffL

    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    goto :goto_4

    .line 173
    :pswitch_3
    int-to-byte v2, v7

    .line 174
    int-to-long v7, v2

    .line 175
    shl-long v7, v7, v19

    .line 176
    .line 177
    const-wide v12, 0xffffffffL

    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    goto :goto_4

    .line 183
    :pswitch_4
    int-to-byte v2, v7

    .line 184
    shl-int/lit8 v2, v2, 0x18

    .line 185
    .line 186
    int-to-long v7, v2

    .line 187
    const-wide/32 v12, 0xffffff

    .line 188
    .line 189
    .line 190
    goto :goto_4

    .line 191
    :pswitch_5
    int-to-byte v2, v7

    .line 192
    shl-int/lit8 v2, v2, 0x10

    .line 193
    .line 194
    int-to-long v7, v2

    .line 195
    const-wide/32 v12, 0xffff

    .line 196
    .line 197
    .line 198
    goto :goto_4

    .line 199
    :pswitch_6
    int-to-byte v7, v7

    .line 200
    shl-int/lit8 v2, v7, 0x8

    .line 201
    .line 202
    int-to-long v7, v2

    .line 203
    const-wide/16 v12, 0xff

    .line 204
    .line 205
    goto :goto_4

    .line 206
    :pswitch_7
    int-to-byte v2, v7

    .line 207
    int-to-long v10, v2

    .line 208
    :goto_5
    add-int/2addr v5, v4

    .line 209
    add-int/lit8 v9, v9, 0x1

    .line 210
    .line 211
    const/16 v2, 0x22

    .line 212
    .line 213
    const/4 v4, 0x0

    .line 214
    goto/16 :goto_0

    .line 215
    .line 216
    :cond_8
    :goto_6
    iget v5, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->nameBegin:I

    .line 217
    .line 218
    move-wide/from16 v10, v16

    .line 219
    .line 220
    :goto_7
    cmp-long v1, v10, v16

    .line 221
    .line 222
    if-eqz v1, :cond_9

    .line 223
    .line 224
    move/from16 v20, v4

    .line 225
    .line 226
    goto/16 :goto_b

    .line 227
    .line 228
    :cond_9
    const-wide v1, -0x340d631b7bdddcdbL    # -7.302176725335867E57

    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    move-wide v10, v1

    .line 234
    const/4 v1, 0x0

    .line 235
    :goto_8
    aget-char v2, v3, v5

    .line 236
    .line 237
    const-wide v7, 0x100000001b3L

    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    if-ne v2, v14, :cond_c

    .line 243
    .line 244
    iput-boolean v4, v0, Lcom/alibaba/fastjson2/JSONReader;->nameEscape:Z

    .line 245
    .line 246
    add-int/lit8 v2, v5, 0x1

    .line 247
    .line 248
    aget-char v9, v3, v2

    .line 249
    .line 250
    if-eq v9, v13, :cond_b

    .line 251
    .line 252
    if-eq v9, v12, :cond_a

    .line 253
    .line 254
    invoke-virtual {v0, v9}, Lcom/alibaba/fastjson2/JSONReader;->char1(I)C

    .line 255
    .line 256
    .line 257
    move-result v5

    .line 258
    :goto_9
    move/from16 v20, v4

    .line 259
    .line 260
    goto :goto_a

    .line 261
    :cond_a
    add-int/lit8 v2, v5, 0x2

    .line 262
    .line 263
    aget-char v2, v3, v2

    .line 264
    .line 265
    add-int/lit8 v5, v5, 0x3

    .line 266
    .line 267
    aget-char v9, v3, v5

    .line 268
    .line 269
    invoke-static {v2, v9}, Lcom/alibaba/fastjson2/JSONReader;->char2(II)C

    .line 270
    .line 271
    .line 272
    move-result v2

    .line 273
    move/from16 v20, v5

    .line 274
    .line 275
    move v5, v2

    .line 276
    move/from16 v2, v20

    .line 277
    .line 278
    goto :goto_9

    .line 279
    :cond_b
    add-int/lit8 v2, v5, 0x2

    .line 280
    .line 281
    aget-char v2, v3, v2

    .line 282
    .line 283
    add-int/lit8 v9, v5, 0x3

    .line 284
    .line 285
    aget-char v9, v3, v9

    .line 286
    .line 287
    add-int/lit8 v15, v5, 0x4

    .line 288
    .line 289
    aget-char v15, v3, v15

    .line 290
    .line 291
    add-int/lit8 v5, v5, 0x5

    .line 292
    .line 293
    move/from16 v20, v4

    .line 294
    .line 295
    aget-char v4, v3, v5

    .line 296
    .line 297
    invoke-static {v2, v9, v15, v4}, Lcom/alibaba/fastjson2/JSONReader;->char4(IIII)C

    .line 298
    .line 299
    .line 300
    move-result v2

    .line 301
    move/from16 v21, v5

    .line 302
    .line 303
    move v5, v2

    .line 304
    move/from16 v2, v21

    .line 305
    .line 306
    :goto_a
    add-int/lit8 v2, v2, 0x1

    .line 307
    .line 308
    int-to-long v4, v5

    .line 309
    xor-long/2addr v4, v10

    .line 310
    mul-long/2addr v4, v7

    .line 311
    move-wide v10, v4

    .line 312
    move/from16 v9, v19

    .line 313
    .line 314
    move v5, v2

    .line 315
    goto/16 :goto_10

    .line 316
    .line 317
    :cond_c
    move/from16 v20, v4

    .line 318
    .line 319
    const/16 v4, 0x22

    .line 320
    .line 321
    if-ne v2, v4, :cond_13

    .line 322
    .line 323
    iput v1, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->nameLength:I

    .line 324
    .line 325
    iput v5, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->nameEnd:I

    .line 326
    .line 327
    const/4 v1, 0x0

    .line 328
    iput-object v1, v0, Lcom/alibaba/fastjson2/JSONReader;->stringValue:Ljava/lang/String;

    .line 329
    .line 330
    add-int/lit8 v5, v5, 0x1

    .line 331
    .line 332
    :goto_b
    const/16 v1, 0x1a

    .line 333
    .line 334
    if-ne v5, v6, :cond_d

    .line 335
    .line 336
    move v2, v1

    .line 337
    goto :goto_c

    .line 338
    :cond_d
    aget-char v2, v3, v5

    .line 339
    .line 340
    :goto_c
    const-wide v7, 0x100003701L

    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    const-wide/16 v12, 0x1

    .line 346
    .line 347
    move/from16 v4, v19

    .line 348
    .line 349
    if-gt v2, v4, :cond_e

    .line 350
    .line 351
    shl-long v14, v12, v2

    .line 352
    .line 353
    and-long/2addr v14, v7

    .line 354
    cmp-long v4, v14, v16

    .line 355
    .line 356
    if-eqz v4, :cond_e

    .line 357
    .line 358
    add-int/lit8 v5, v5, 0x1

    .line 359
    .line 360
    aget-char v2, v3, v5

    .line 361
    .line 362
    const/16 v19, 0x20

    .line 363
    .line 364
    goto :goto_c

    .line 365
    :cond_e
    const/16 v4, 0x2c

    .line 366
    .line 367
    if-ne v2, v4, :cond_f

    .line 368
    .line 369
    move/from16 v4, v20

    .line 370
    .line 371
    goto :goto_d

    .line 372
    :cond_f
    const/4 v4, 0x0

    .line 373
    :goto_d
    iput-boolean v4, v0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 374
    .line 375
    if-eqz v4, :cond_12

    .line 376
    .line 377
    add-int/lit8 v5, v5, 0x1

    .line 378
    .line 379
    if-ne v5, v6, :cond_10

    .line 380
    .line 381
    :goto_e
    const/16 v9, 0x20

    .line 382
    .line 383
    goto :goto_f

    .line 384
    :cond_10
    aget-char v1, v3, v5

    .line 385
    .line 386
    goto :goto_e

    .line 387
    :goto_f
    if-gt v1, v9, :cond_11

    .line 388
    .line 389
    shl-long v14, v12, v1

    .line 390
    .line 391
    and-long/2addr v14, v7

    .line 392
    cmp-long v2, v14, v16

    .line 393
    .line 394
    if-eqz v2, :cond_11

    .line 395
    .line 396
    add-int/lit8 v5, v5, 0x1

    .line 397
    .line 398
    aget-char v1, v3, v5

    .line 399
    .line 400
    goto :goto_f

    .line 401
    :cond_11
    move v2, v1

    .line 402
    :cond_12
    add-int/lit8 v5, v5, 0x1

    .line 403
    .line 404
    iput v5, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 405
    .line 406
    iput-char v2, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 407
    .line 408
    return-wide v10

    .line 409
    :cond_13
    move/from16 v9, v19

    .line 410
    .line 411
    add-int/lit8 v5, v5, 0x1

    .line 412
    .line 413
    move v15, v5

    .line 414
    int-to-long v4, v2

    .line 415
    xor-long/2addr v4, v10

    .line 416
    mul-long/2addr v4, v7

    .line 417
    move-wide v10, v4

    .line 418
    move v5, v15

    .line 419
    :goto_10
    add-int/lit8 v1, v1, 0x1

    .line 420
    .line 421
    move/from16 v19, v9

    .line 422
    .line 423
    move/from16 v4, v20

    .line 424
    .line 425
    goto/16 :goto_8

    .line 426
    .line 427
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public readZonedDateTimeX(I)Ljava/time/ZonedDateTime;
    .locals 5

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    if-eq v0, v1, :cond_1

    .line 6
    .line 7
    const/16 v1, 0x27

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string p1, "date only support string input"

    .line 13
    .line 14
    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    return-object p1

    .line 19
    :cond_1
    :goto_0
    const/16 v0, 0x13

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    if-ge p1, v0, :cond_2

    .line 23
    .line 24
    return-object v1

    .line 25
    :cond_2
    const/16 v0, 0x1e

    .line 26
    .line 27
    const/16 v2, 0x5a

    .line 28
    .line 29
    if-ne p1, v0, :cond_3

    .line 30
    .line 31
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 32
    .line 33
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 34
    .line 35
    add-int/lit8 v4, v3, 0x1d

    .line 36
    .line 37
    aget-char v4, v0, v4

    .line 38
    .line 39
    if-ne v4, v2, :cond_3

    .line 40
    .line 41
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDateTime29([CI)Ljava/time/LocalDateTime;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sget-object v2, Ljava/time/ZoneOffset;->UTC:Ljava/time/ZoneOffset;

    .line 46
    .line 47
    invoke-static {v0, v2}, Ljava/time/ZonedDateTime;->of(Ljava/time/LocalDateTime;Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    goto :goto_1

    .line 52
    :cond_3
    const/16 v0, 0x1d

    .line 53
    .line 54
    if-ne p1, v0, :cond_4

    .line 55
    .line 56
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 57
    .line 58
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 59
    .line 60
    add-int/lit8 v4, v3, 0x1c

    .line 61
    .line 62
    aget-char v4, v0, v4

    .line 63
    .line 64
    if-ne v4, v2, :cond_4

    .line 65
    .line 66
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDateTime28([CI)Ljava/time/LocalDateTime;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    sget-object v2, Ljava/time/ZoneOffset;->UTC:Ljava/time/ZoneOffset;

    .line 71
    .line 72
    invoke-static {v0, v2}, Ljava/time/ZonedDateTime;->of(Ljava/time/LocalDateTime;Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    goto :goto_1

    .line 77
    :cond_4
    const/16 v0, 0x1c

    .line 78
    .line 79
    if-ne p1, v0, :cond_5

    .line 80
    .line 81
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 82
    .line 83
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 84
    .line 85
    add-int/lit8 v4, v3, 0x1b

    .line 86
    .line 87
    aget-char v4, v0, v4

    .line 88
    .line 89
    if-ne v4, v2, :cond_5

    .line 90
    .line 91
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDateTime27([CI)Ljava/time/LocalDateTime;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    sget-object v2, Ljava/time/ZoneOffset;->UTC:Ljava/time/ZoneOffset;

    .line 96
    .line 97
    invoke-static {v0, v2}, Ljava/time/ZonedDateTime;->of(Ljava/time/LocalDateTime;Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    goto :goto_1

    .line 102
    :cond_5
    const/16 v0, 0x1b

    .line 103
    .line 104
    if-ne p1, v0, :cond_6

    .line 105
    .line 106
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 107
    .line 108
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 109
    .line 110
    add-int/lit8 v4, v3, 0x1a

    .line 111
    .line 112
    aget-char v4, v0, v4

    .line 113
    .line 114
    if-ne v4, v2, :cond_6

    .line 115
    .line 116
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDateTime26([CI)Ljava/time/LocalDateTime;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    sget-object v2, Ljava/time/ZoneOffset;->UTC:Ljava/time/ZoneOffset;

    .line 121
    .line 122
    invoke-static {v0, v2}, Ljava/time/ZonedDateTime;->of(Ljava/time/LocalDateTime;Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    goto :goto_1

    .line 127
    :cond_6
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 128
    .line 129
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 130
    .line 131
    iget-object v3, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 132
    .line 133
    iget-object v3, v3, Lcom/alibaba/fastjson2/JSONReader$Context;->zoneId:Ljava/time/ZoneId;

    .line 134
    .line 135
    invoke-static {v0, v2, p1, v3}, Lcom/alibaba/fastjson2/util/DateUtils;->parseZonedDateTime([CIILjava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    :goto_1
    if-nez v0, :cond_7

    .line 140
    .line 141
    return-object v1

    .line 142
    :cond_7
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 143
    .line 144
    const/4 v2, 0x1

    .line 145
    add-int/2addr p1, v2

    .line 146
    add-int/2addr p1, v1

    .line 147
    iput p1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 148
    .line 149
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->next()V

    .line 150
    .line 151
    .line 152
    iget-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 153
    .line 154
    const/16 v1, 0x2c

    .line 155
    .line 156
    if-ne p1, v1, :cond_8

    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_8
    const/4 v2, 0x0

    .line 160
    :goto_2
    iput-boolean v2, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 161
    .line 162
    if-eqz v2, :cond_9

    .line 163
    .line 164
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->next()V

    .line 165
    .line 166
    .line 167
    :cond_9
    return-object v0
.end method

.method public skipComment()V
    .locals 13

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 6
    .line 7
    if-ge v1, v2, :cond_a

    .line 8
    .line 9
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 10
    .line 11
    aget-char v3, v2, v0

    .line 12
    .line 13
    const/16 v4, 0x2a

    .line 14
    .line 15
    const/4 v5, 0x0

    .line 16
    const/16 v6, 0x2f

    .line 17
    .line 18
    const/4 v7, 0x1

    .line 19
    if-ne v3, v4, :cond_0

    .line 20
    .line 21
    move v3, v7

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    if-ne v3, v6, :cond_9

    .line 24
    .line 25
    move v3, v5

    .line 26
    :goto_0
    add-int/lit8 v0, v0, 0x2

    .line 27
    .line 28
    aget-char v1, v2, v1

    .line 29
    .line 30
    :goto_1
    if-eqz v3, :cond_2

    .line 31
    .line 32
    if-ne v1, v4, :cond_1

    .line 33
    .line 34
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 35
    .line 36
    if-gt v0, v1, :cond_1

    .line 37
    .line 38
    aget-char v1, v2, v0

    .line 39
    .line 40
    if-ne v1, v6, :cond_1

    .line 41
    .line 42
    add-int/lit8 v0, v0, 0x1

    .line 43
    .line 44
    :goto_2
    move v1, v7

    .line 45
    goto :goto_3

    .line 46
    :cond_1
    move v1, v5

    .line 47
    goto :goto_3

    .line 48
    :cond_2
    const/16 v8, 0xa

    .line 49
    .line 50
    if-ne v1, v8, :cond_1

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :goto_3
    iget v8, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 54
    .line 55
    const/16 v9, 0x1a

    .line 56
    .line 57
    if-eqz v1, :cond_6

    .line 58
    .line 59
    if-lt v0, v8, :cond_3

    .line 60
    .line 61
    goto :goto_6

    .line 62
    :cond_3
    aget-char v1, v2, v0

    .line 63
    .line 64
    :goto_4
    const/16 v3, 0x20

    .line 65
    .line 66
    if-gt v1, v3, :cond_5

    .line 67
    .line 68
    const-wide/16 v3, 0x1

    .line 69
    .line 70
    shl-long/2addr v3, v1

    .line 71
    const-wide v10, 0x100003701L

    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    and-long/2addr v3, v10

    .line 77
    const-wide/16 v10, 0x0

    .line 78
    .line 79
    cmp-long v3, v3, v10

    .line 80
    .line 81
    if-eqz v3, :cond_5

    .line 82
    .line 83
    add-int/lit8 v0, v0, 0x1

    .line 84
    .line 85
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 86
    .line 87
    if-lt v0, v1, :cond_4

    .line 88
    .line 89
    goto :goto_5

    .line 90
    :cond_4
    aget-char v1, v2, v0

    .line 91
    .line 92
    goto :goto_4

    .line 93
    :cond_5
    move v9, v1

    .line 94
    :goto_5
    add-int/2addr v0, v7

    .line 95
    goto :goto_6

    .line 96
    :cond_6
    if-lt v0, v8, :cond_8

    .line 97
    .line 98
    :goto_6
    iput-char v9, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 99
    .line 100
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 101
    .line 102
    if-ne v9, v6, :cond_7

    .line 103
    .line 104
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->skipComment()V

    .line 105
    .line 106
    .line 107
    :cond_7
    return-void

    .line 108
    :cond_8
    add-int/lit8 v1, v0, 0x1

    .line 109
    .line 110
    aget-char v0, v2, v0

    .line 111
    .line 112
    move v12, v1

    .line 113
    move v1, v0

    .line 114
    move v0, v12

    .line 115
    goto :goto_1

    .line 116
    :cond_9
    const-string v0, "parse comment error"

    .line 117
    .line 118
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    :cond_a
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->info()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    return-void
.end method

.method public skipName()Z
    .locals 15

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    const/16 v3, 0x27

    .line 6
    .line 7
    if-ne v0, v3, :cond_1

    .line 8
    .line 9
    iget-object v4, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 10
    .line 11
    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 12
    .line 13
    sget-object v6, Lcom/alibaba/fastjson2/JSONReader$Feature;->DisableSingleQuote:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 14
    .line 15
    iget-wide v6, v6, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 16
    .line 17
    and-long/2addr v4, v6

    .line 18
    cmp-long v4, v4, v1

    .line 19
    .line 20
    if-nez v4, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->notSupportName()Lcom/alibaba/fastjson2/JSONException;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    throw v0

    .line 28
    :cond_1
    :goto_0
    const/16 v4, 0x22

    .line 29
    .line 30
    const/4 v5, 0x1

    .line 31
    if-eq v0, v4, :cond_3

    .line 32
    .line 33
    if-eq v0, v3, :cond_3

    .line 34
    .line 35
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 36
    .line 37
    iget-wide v3, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 38
    .line 39
    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->AllowUnQuotedFieldNames:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 40
    .line 41
    iget-wide v6, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 42
    .line 43
    and-long/2addr v3, v6

    .line 44
    cmp-long v0, v3, v1

    .line 45
    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->readFieldNameHashCodeUnquote()J

    .line 49
    .line 50
    .line 51
    return v5

    .line 52
    :cond_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->notSupportName()Lcom/alibaba/fastjson2/JSONException;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    throw v0

    .line 57
    :cond_3
    iget v3, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 58
    .line 59
    iget-object v4, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 60
    .line 61
    :goto_1
    add-int/lit8 v6, v3, 0x1

    .line 62
    .line 63
    aget-char v7, v4, v3

    .line 64
    .line 65
    const/16 v8, 0x5c

    .line 66
    .line 67
    if-ne v7, v8, :cond_6

    .line 68
    .line 69
    aget-char v3, v4, v6

    .line 70
    .line 71
    const/16 v7, 0x75

    .line 72
    .line 73
    if-ne v3, v7, :cond_4

    .line 74
    .line 75
    const/4 v3, 0x5

    .line 76
    goto :goto_2

    .line 77
    :cond_4
    const/16 v7, 0x78

    .line 78
    .line 79
    if-ne v3, v7, :cond_5

    .line 80
    .line 81
    const/4 v3, 0x3

    .line 82
    goto :goto_2

    .line 83
    :cond_5
    move v3, v5

    .line 84
    :goto_2
    add-int/2addr v3, v6

    .line 85
    goto :goto_1

    .line 86
    :cond_6
    if-ne v7, v0, :cond_e

    .line 87
    .line 88
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 89
    .line 90
    const/16 v7, 0x1a

    .line 91
    .line 92
    if-ne v6, v0, :cond_7

    .line 93
    .line 94
    :goto_3
    move v0, v7

    .line 95
    goto :goto_4

    .line 96
    :cond_7
    add-int/lit8 v3, v3, 0x2

    .line 97
    .line 98
    aget-char v0, v4, v6

    .line 99
    .line 100
    move v6, v3

    .line 101
    :goto_4
    const-wide v8, 0x100003701L

    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    const-wide/16 v10, 0x1

    .line 107
    .line 108
    const/16 v3, 0x20

    .line 109
    .line 110
    if-gt v0, v3, :cond_9

    .line 111
    .line 112
    shl-long v12, v10, v0

    .line 113
    .line 114
    and-long/2addr v12, v8

    .line 115
    cmp-long v12, v12, v1

    .line 116
    .line 117
    if-eqz v12, :cond_9

    .line 118
    .line 119
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 120
    .line 121
    if-ne v6, v0, :cond_8

    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_8
    add-int/lit8 v0, v6, 0x1

    .line 125
    .line 126
    aget-char v3, v4, v6

    .line 127
    .line 128
    move v6, v0

    .line 129
    move v0, v3

    .line 130
    goto :goto_4

    .line 131
    :cond_9
    const/16 v12, 0x3a

    .line 132
    .line 133
    if-ne v0, v12, :cond_d

    .line 134
    .line 135
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 136
    .line 137
    if-ne v6, v0, :cond_a

    .line 138
    .line 139
    move v0, v6

    .line 140
    :goto_5
    move v6, v7

    .line 141
    goto :goto_6

    .line 142
    :cond_a
    add-int/lit8 v0, v6, 0x1

    .line 143
    .line 144
    aget-char v6, v4, v6

    .line 145
    .line 146
    :goto_6
    if-gt v6, v3, :cond_c

    .line 147
    .line 148
    shl-long v12, v10, v6

    .line 149
    .line 150
    and-long/2addr v12, v8

    .line 151
    cmp-long v12, v12, v1

    .line 152
    .line 153
    if-eqz v12, :cond_c

    .line 154
    .line 155
    iget v6, p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 156
    .line 157
    if-ne v0, v6, :cond_b

    .line 158
    .line 159
    goto :goto_5

    .line 160
    :cond_b
    add-int/lit8 v6, v0, 0x1

    .line 161
    .line 162
    aget-char v0, v4, v0

    .line 163
    .line 164
    move v14, v6

    .line 165
    move v6, v0

    .line 166
    move v0, v14

    .line 167
    goto :goto_6

    .line 168
    :cond_c
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 169
    .line 170
    iput-char v6, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 171
    .line 172
    return v5

    .line 173
    :cond_d
    invoke-static {v0}, Lcom/alibaba/fastjson2/JSONReader;->syntaxError(I)Lcom/alibaba/fastjson2/JSONException;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    throw v0

    .line 178
    :cond_e
    move v3, v6

    .line 179
    goto :goto_1
.end method

.method public skipValue()V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->chars:[C

    .line 4
    .line 5
    iget-char v2, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 6
    .line 7
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 8
    .line 9
    const/16 v4, 0x7d

    .line 10
    .line 11
    const/16 v5, 0x5d

    .line 12
    .line 13
    const/16 v6, 0x65

    .line 14
    .line 15
    const/16 v9, 0x53

    .line 16
    .line 17
    const/16 v10, 0x2e

    .line 18
    .line 19
    const/16 v11, 0x2d

    .line 20
    .line 21
    const/4 v12, 0x0

    .line 22
    const/16 v15, 0x2b

    .line 23
    .line 24
    const-wide/16 v16, 0x0

    .line 25
    .line 26
    if-eq v2, v15, :cond_17

    .line 27
    .line 28
    const/16 v7, 0x66

    .line 29
    .line 30
    const/16 v8, 0x6c

    .line 31
    .line 32
    if-eq v2, v7, :cond_13

    .line 33
    .line 34
    const/16 v7, 0x6e

    .line 35
    .line 36
    const/16 v13, 0x75

    .line 37
    .line 38
    if-eq v2, v7, :cond_f

    .line 39
    .line 40
    const/16 v7, 0x74

    .line 41
    .line 42
    if-eq v2, v7, :cond_b

    .line 43
    .line 44
    if-eq v2, v11, :cond_17

    .line 45
    .line 46
    if-eq v2, v10, :cond_17

    .line 47
    .line 48
    packed-switch v2, :pswitch_data_0

    .line 49
    .line 50
    .line 51
    const/16 v6, 0x22

    .line 52
    .line 53
    const/16 v7, 0x27

    .line 54
    .line 55
    if-eq v2, v6, :cond_8

    .line 56
    .line 57
    if-ne v2, v7, :cond_0

    .line 58
    .line 59
    goto :goto_3

    .line 60
    :cond_0
    const/16 v6, 0x5b

    .line 61
    .line 62
    if-ne v2, v6, :cond_4

    .line 63
    .line 64
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->next()V

    .line 65
    .line 66
    .line 67
    move v2, v12

    .line 68
    :goto_0
    iget-char v3, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 69
    .line 70
    if-ne v3, v5, :cond_1

    .line 71
    .line 72
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->next()V

    .line 73
    .line 74
    .line 75
    goto :goto_5

    .line 76
    :cond_1
    if-eqz v2, :cond_3

    .line 77
    .line 78
    iget-boolean v3, v0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 79
    .line 80
    if-eqz v3, :cond_2

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_2
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReader;->valueError()Lcom/alibaba/fastjson2/JSONException;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    throw v1

    .line 88
    :cond_3
    :goto_1
    iput-boolean v12, v0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 89
    .line 90
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->skipValue()V

    .line 91
    .line 92
    .line 93
    add-int/lit8 v2, v2, 0x1

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_4
    const/16 v6, 0x7b

    .line 97
    .line 98
    if-ne v2, v6, :cond_6

    .line 99
    .line 100
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->next()V

    .line 101
    .line 102
    .line 103
    :goto_2
    iget-char v2, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 104
    .line 105
    if-ne v2, v4, :cond_5

    .line 106
    .line 107
    iput-boolean v12, v0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 108
    .line 109
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->next()V

    .line 110
    .line 111
    .line 112
    goto :goto_5

    .line 113
    :cond_5
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->skipName()Z

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->skipValue()V

    .line 117
    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_6
    if-ne v2, v9, :cond_7

    .line 121
    .line 122
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->nextIfSet()Z

    .line 123
    .line 124
    .line 125
    move-result v6

    .line 126
    if-eqz v6, :cond_7

    .line 127
    .line 128
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->skipValue()V

    .line 129
    .line 130
    .line 131
    goto :goto_5

    .line 132
    :cond_7
    invoke-virtual {v0, v3, v2}, Lcom/alibaba/fastjson2/JSONReader;->error(II)Lcom/alibaba/fastjson2/JSONException;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    throw v1

    .line 137
    :cond_8
    :goto_3
    if-ne v2, v7, :cond_a

    .line 138
    .line 139
    iget-object v2, v0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 140
    .line 141
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 142
    .line 143
    sget-object v6, Lcom/alibaba/fastjson2/JSONReader$Feature;->DisableSingleQuote:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 144
    .line 145
    iget-wide v6, v6, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 146
    .line 147
    and-long/2addr v2, v6

    .line 148
    cmp-long v2, v2, v16

    .line 149
    .line 150
    if-nez v2, :cond_9

    .line 151
    .line 152
    goto :goto_4

    .line 153
    :cond_9
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReader;->notSupportName()Lcom/alibaba/fastjson2/JSONException;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    throw v1

    .line 158
    :cond_a
    :goto_4
    invoke-direct {v0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;->skipString()V

    .line 159
    .line 160
    .line 161
    :goto_5
    iget-char v2, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 162
    .line 163
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 164
    .line 165
    goto/16 :goto_16

    .line 166
    .line 167
    :cond_b
    add-int/lit8 v7, v3, 0x3

    .line 168
    .line 169
    iget v8, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 170
    .line 171
    if-gt v7, v8, :cond_e

    .line 172
    .line 173
    aget-char v9, v1, v3

    .line 174
    .line 175
    const/16 v10, 0x72

    .line 176
    .line 177
    if-ne v9, v10, :cond_d

    .line 178
    .line 179
    add-int/lit8 v9, v3, 0x1

    .line 180
    .line 181
    aget-char v9, v1, v9

    .line 182
    .line 183
    if-ne v9, v13, :cond_d

    .line 184
    .line 185
    add-int/lit8 v9, v3, 0x2

    .line 186
    .line 187
    aget-char v9, v1, v9

    .line 188
    .line 189
    if-ne v9, v6, :cond_d

    .line 190
    .line 191
    if-ne v7, v8, :cond_c

    .line 192
    .line 193
    :goto_6
    move v3, v7

    .line 194
    :goto_7
    const/16 v2, 0x1a

    .line 195
    .line 196
    goto/16 :goto_16

    .line 197
    .line 198
    :cond_c
    add-int/lit8 v3, v3, 0x4

    .line 199
    .line 200
    aget-char v2, v1, v7

    .line 201
    .line 202
    goto/16 :goto_16

    .line 203
    .line 204
    :cond_d
    invoke-virtual {v0, v3, v2}, Lcom/alibaba/fastjson2/JSONReader;->error(II)Lcom/alibaba/fastjson2/JSONException;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    throw v1

    .line 209
    :cond_e
    invoke-virtual {v0, v3, v2}, Lcom/alibaba/fastjson2/JSONReader;->error(II)Lcom/alibaba/fastjson2/JSONException;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    throw v1

    .line 214
    :cond_f
    add-int/lit8 v6, v3, 0x3

    .line 215
    .line 216
    iget v7, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 217
    .line 218
    if-gt v6, v7, :cond_12

    .line 219
    .line 220
    aget-char v9, v1, v3

    .line 221
    .line 222
    if-ne v9, v13, :cond_11

    .line 223
    .line 224
    add-int/lit8 v9, v3, 0x1

    .line 225
    .line 226
    aget-char v9, v1, v9

    .line 227
    .line 228
    if-ne v9, v8, :cond_11

    .line 229
    .line 230
    add-int/lit8 v9, v3, 0x2

    .line 231
    .line 232
    aget-char v9, v1, v9

    .line 233
    .line 234
    if-ne v9, v8, :cond_11

    .line 235
    .line 236
    if-ne v6, v7, :cond_10

    .line 237
    .line 238
    move v3, v6

    .line 239
    goto :goto_7

    .line 240
    :cond_10
    add-int/lit8 v3, v3, 0x4

    .line 241
    .line 242
    aget-char v2, v1, v6

    .line 243
    .line 244
    goto/16 :goto_16

    .line 245
    .line 246
    :cond_11
    invoke-virtual {v0, v3, v2}, Lcom/alibaba/fastjson2/JSONReader;->error(II)Lcom/alibaba/fastjson2/JSONException;

    .line 247
    .line 248
    .line 249
    move-result-object v1

    .line 250
    throw v1

    .line 251
    :cond_12
    invoke-virtual {v0, v3, v2}, Lcom/alibaba/fastjson2/JSONReader;->error(II)Lcom/alibaba/fastjson2/JSONException;

    .line 252
    .line 253
    .line 254
    move-result-object v1

    .line 255
    throw v1

    .line 256
    :cond_13
    add-int/lit8 v7, v3, 0x4

    .line 257
    .line 258
    iget v9, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 259
    .line 260
    if-gt v7, v9, :cond_16

    .line 261
    .line 262
    aget-char v10, v1, v3

    .line 263
    .line 264
    const/16 v11, 0x61

    .line 265
    .line 266
    if-ne v10, v11, :cond_15

    .line 267
    .line 268
    add-int/lit8 v10, v3, 0x1

    .line 269
    .line 270
    aget-char v10, v1, v10

    .line 271
    .line 272
    if-ne v10, v8, :cond_15

    .line 273
    .line 274
    add-int/lit8 v8, v3, 0x2

    .line 275
    .line 276
    aget-char v8, v1, v8

    .line 277
    .line 278
    const/16 v10, 0x73

    .line 279
    .line 280
    if-ne v8, v10, :cond_15

    .line 281
    .line 282
    add-int/lit8 v8, v3, 0x3

    .line 283
    .line 284
    aget-char v8, v1, v8

    .line 285
    .line 286
    if-ne v8, v6, :cond_15

    .line 287
    .line 288
    if-ne v7, v9, :cond_14

    .line 289
    .line 290
    goto :goto_6

    .line 291
    :cond_14
    add-int/lit8 v3, v3, 0x5

    .line 292
    .line 293
    aget-char v2, v1, v7

    .line 294
    .line 295
    goto/16 :goto_16

    .line 296
    .line 297
    :cond_15
    invoke-virtual {v0, v3, v2}, Lcom/alibaba/fastjson2/JSONReader;->error(II)Lcom/alibaba/fastjson2/JSONException;

    .line 298
    .line 299
    .line 300
    move-result-object v1

    .line 301
    throw v1

    .line 302
    :cond_16
    invoke-virtual {v0, v3, v2}, Lcom/alibaba/fastjson2/JSONReader;->error(II)Lcom/alibaba/fastjson2/JSONException;

    .line 303
    .line 304
    .line 305
    move-result-object v1

    .line 306
    throw v1

    .line 307
    :cond_17
    :pswitch_0
    if-eq v2, v11, :cond_18

    .line 308
    .line 309
    if-ne v2, v15, :cond_19

    .line 310
    .line 311
    :cond_18
    iget v7, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 312
    .line 313
    if-ge v3, v7, :cond_3b

    .line 314
    .line 315
    add-int/lit8 v2, v3, 0x1

    .line 316
    .line 317
    aget-char v3, v1, v3

    .line 318
    .line 319
    move/from16 v19, v3

    .line 320
    .line 321
    move v3, v2

    .line 322
    move/from16 v2, v19

    .line 323
    .line 324
    :cond_19
    if-ne v2, v10, :cond_1a

    .line 325
    .line 326
    const/4 v7, 0x1

    .line 327
    goto :goto_8

    .line 328
    :cond_1a
    move v7, v12

    .line 329
    :goto_8
    const/16 v8, 0x39

    .line 330
    .line 331
    const/16 v13, 0x30

    .line 332
    .line 333
    if-nez v7, :cond_1e

    .line 334
    .line 335
    if-lt v2, v13, :cond_1e

    .line 336
    .line 337
    if-gt v2, v8, :cond_1e

    .line 338
    .line 339
    :cond_1b
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 340
    .line 341
    if-ne v3, v2, :cond_1c

    .line 342
    .line 343
    const/16 v2, 0x1a

    .line 344
    .line 345
    goto :goto_9

    .line 346
    :cond_1c
    add-int/lit8 v2, v3, 0x1

    .line 347
    .line 348
    aget-char v3, v1, v3

    .line 349
    .line 350
    move/from16 v19, v3

    .line 351
    .line 352
    move v3, v2

    .line 353
    move/from16 v2, v19

    .line 354
    .line 355
    :goto_9
    if-lt v2, v13, :cond_1d

    .line 356
    .line 357
    if-le v2, v8, :cond_1b

    .line 358
    .line 359
    :cond_1d
    const/4 v7, 0x1

    .line 360
    goto :goto_a

    .line 361
    :cond_1e
    move v7, v12

    .line 362
    :goto_a
    const/16 v12, 0x44

    .line 363
    .line 364
    const/16 v5, 0x46

    .line 365
    .line 366
    const/16 v4, 0x4c

    .line 367
    .line 368
    if-eqz v7, :cond_20

    .line 369
    .line 370
    if-eq v2, v4, :cond_1f

    .line 371
    .line 372
    if-eq v2, v5, :cond_1f

    .line 373
    .line 374
    if-eq v2, v12, :cond_1f

    .line 375
    .line 376
    const/16 v14, 0x42

    .line 377
    .line 378
    if-eq v2, v14, :cond_1f

    .line 379
    .line 380
    if-ne v2, v9, :cond_20

    .line 381
    .line 382
    :cond_1f
    add-int/lit8 v2, v3, 0x1

    .line 383
    .line 384
    aget-char v3, v1, v3

    .line 385
    .line 386
    move/from16 v19, v3

    .line 387
    .line 388
    move v3, v2

    .line 389
    move/from16 v2, v19

    .line 390
    .line 391
    :cond_20
    if-ne v2, v10, :cond_25

    .line 392
    .line 393
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 394
    .line 395
    if-ne v3, v2, :cond_21

    .line 396
    .line 397
    const/16 v2, 0x1a

    .line 398
    .line 399
    goto :goto_b

    .line 400
    :cond_21
    add-int/lit8 v2, v3, 0x1

    .line 401
    .line 402
    aget-char v3, v1, v3

    .line 403
    .line 404
    move/from16 v19, v3

    .line 405
    .line 406
    move v3, v2

    .line 407
    move/from16 v2, v19

    .line 408
    .line 409
    :goto_b
    if-lt v2, v13, :cond_24

    .line 410
    .line 411
    if-gt v2, v8, :cond_24

    .line 412
    .line 413
    :cond_22
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 414
    .line 415
    if-ne v3, v2, :cond_23

    .line 416
    .line 417
    const/16 v2, 0x1a

    .line 418
    .line 419
    goto :goto_c

    .line 420
    :cond_23
    add-int/lit8 v2, v3, 0x1

    .line 421
    .line 422
    aget-char v3, v1, v3

    .line 423
    .line 424
    move/from16 v19, v3

    .line 425
    .line 426
    move v3, v2

    .line 427
    move/from16 v2, v19

    .line 428
    .line 429
    :goto_c
    if-lt v2, v13, :cond_24

    .line 430
    .line 431
    if-le v2, v8, :cond_22

    .line 432
    .line 433
    :cond_24
    const/4 v10, 0x1

    .line 434
    goto :goto_d

    .line 435
    :cond_25
    const/4 v10, 0x0

    .line 436
    :goto_d
    if-nez v7, :cond_27

    .line 437
    .line 438
    if-eqz v10, :cond_26

    .line 439
    .line 440
    goto :goto_e

    .line 441
    :cond_26
    invoke-static {v3, v2}, Lcom/alibaba/fastjson2/JSONReader;->numberError(II)Lcom/alibaba/fastjson2/JSONException;

    .line 442
    .line 443
    .line 444
    move-result-object v1

    .line 445
    throw v1

    .line 446
    :cond_27
    :goto_e
    if-eq v2, v6, :cond_28

    .line 447
    .line 448
    const/16 v6, 0x45

    .line 449
    .line 450
    if-ne v2, v6, :cond_2e

    .line 451
    .line 452
    :cond_28
    add-int/lit8 v2, v3, 0x1

    .line 453
    .line 454
    aget-char v6, v1, v3

    .line 455
    .line 456
    if-eq v6, v15, :cond_2a

    .line 457
    .line 458
    if-ne v6, v11, :cond_29

    .line 459
    .line 460
    goto :goto_f

    .line 461
    :cond_29
    const/16 v18, 0x0

    .line 462
    .line 463
    goto :goto_10

    .line 464
    :cond_2a
    :goto_f
    iget v7, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 465
    .line 466
    if-ge v2, v7, :cond_3a

    .line 467
    .line 468
    add-int/lit8 v3, v3, 0x2

    .line 469
    .line 470
    aget-char v6, v1, v2

    .line 471
    .line 472
    move v2, v3

    .line 473
    const/16 v18, 0x1

    .line 474
    .line 475
    :goto_10
    if-lt v6, v13, :cond_2d

    .line 476
    .line 477
    if-gt v6, v8, :cond_2d

    .line 478
    .line 479
    :goto_11
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 480
    .line 481
    if-ne v2, v3, :cond_2b

    .line 482
    .line 483
    move v3, v2

    .line 484
    const/16 v2, 0x1a

    .line 485
    .line 486
    goto :goto_12

    .line 487
    :cond_2b
    add-int/lit8 v3, v2, 0x1

    .line 488
    .line 489
    aget-char v2, v1, v2

    .line 490
    .line 491
    :goto_12
    if-lt v2, v13, :cond_2e

    .line 492
    .line 493
    if-le v2, v8, :cond_2c

    .line 494
    .line 495
    goto :goto_13

    .line 496
    :cond_2c
    move v2, v3

    .line 497
    goto :goto_11

    .line 498
    :cond_2d
    if-nez v18, :cond_39

    .line 499
    .line 500
    move v3, v2

    .line 501
    move v2, v6

    .line 502
    :cond_2e
    :goto_13
    if-eq v2, v4, :cond_2f

    .line 503
    .line 504
    if-eq v2, v5, :cond_2f

    .line 505
    .line 506
    if-eq v2, v12, :cond_2f

    .line 507
    .line 508
    const/16 v4, 0x42

    .line 509
    .line 510
    if-eq v2, v4, :cond_2f

    .line 511
    .line 512
    if-ne v2, v9, :cond_31

    .line 513
    .line 514
    :cond_2f
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 515
    .line 516
    if-ne v3, v2, :cond_30

    .line 517
    .line 518
    :goto_14
    goto/16 :goto_7

    .line 519
    .line 520
    :cond_30
    add-int/lit8 v2, v3, 0x1

    .line 521
    .line 522
    aget-char v3, v1, v3

    .line 523
    .line 524
    :goto_15
    move/from16 v19, v3

    .line 525
    .line 526
    move v3, v2

    .line 527
    move/from16 v2, v19

    .line 528
    .line 529
    :cond_31
    :goto_16
    const/16 v4, 0x20

    .line 530
    .line 531
    if-gt v2, v4, :cond_33

    .line 532
    .line 533
    const-wide/16 v4, 0x1

    .line 534
    .line 535
    shl-long/2addr v4, v2

    .line 536
    const-wide v6, 0x100003701L

    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    and-long/2addr v4, v6

    .line 542
    cmp-long v4, v4, v16

    .line 543
    .line 544
    if-eqz v4, :cond_33

    .line 545
    .line 546
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 547
    .line 548
    if-ne v3, v2, :cond_32

    .line 549
    .line 550
    goto :goto_14

    .line 551
    :cond_32
    add-int/lit8 v2, v3, 0x1

    .line 552
    .line 553
    aget-char v3, v1, v3

    .line 554
    .line 555
    goto :goto_15

    .line 556
    :cond_33
    const/16 v4, 0x2c

    .line 557
    .line 558
    if-ne v2, v4, :cond_36

    .line 559
    .line 560
    const/4 v4, 0x1

    .line 561
    iput-boolean v4, v0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 562
    .line 563
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 564
    .line 565
    if-ne v3, v2, :cond_34

    .line 566
    .line 567
    move v2, v3

    .line 568
    const/16 v3, 0x1a

    .line 569
    .line 570
    goto :goto_17

    .line 571
    :cond_34
    add-int/lit8 v2, v3, 0x1

    .line 572
    .line 573
    aget-char v3, v1, v3

    .line 574
    .line 575
    :goto_17
    move/from16 v19, v3

    .line 576
    .line 577
    move v3, v2

    .line 578
    move/from16 v2, v19

    .line 579
    .line 580
    :goto_18
    const/16 v4, 0x20

    .line 581
    .line 582
    if-gt v2, v4, :cond_36

    .line 583
    .line 584
    const-wide/16 v4, 0x1

    .line 585
    .line 586
    shl-long/2addr v4, v2

    .line 587
    const-wide v6, 0x100003701L

    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    and-long/2addr v4, v6

    .line 593
    cmp-long v4, v4, v16

    .line 594
    .line 595
    if-eqz v4, :cond_36

    .line 596
    .line 597
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;->end:I

    .line 598
    .line 599
    if-ne v3, v2, :cond_35

    .line 600
    .line 601
    const/16 v2, 0x1a

    .line 602
    .line 603
    goto :goto_18

    .line 604
    :cond_35
    add-int/lit8 v2, v3, 0x1

    .line 605
    .line 606
    aget-char v3, v1, v3

    .line 607
    .line 608
    goto :goto_17

    .line 609
    :cond_36
    iget-boolean v1, v0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 610
    .line 611
    if-nez v1, :cond_38

    .line 612
    .line 613
    const/16 v1, 0x1a

    .line 614
    .line 615
    if-eq v2, v1, :cond_38

    .line 616
    .line 617
    const/16 v4, 0x7d

    .line 618
    .line 619
    if-eq v2, v4, :cond_38

    .line 620
    .line 621
    const/16 v4, 0x5d

    .line 622
    .line 623
    if-eq v2, v4, :cond_38

    .line 624
    .line 625
    if-ne v2, v1, :cond_37

    .line 626
    .line 627
    goto :goto_19

    .line 628
    :cond_37
    invoke-virtual {v0, v3, v2}, Lcom/alibaba/fastjson2/JSONReader;->error(II)Lcom/alibaba/fastjson2/JSONException;

    .line 629
    .line 630
    .line 631
    move-result-object v1

    .line 632
    throw v1

    .line 633
    :cond_38
    :goto_19
    int-to-char v1, v2

    .line 634
    iput-char v1, v0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 635
    .line 636
    iput v3, v0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 637
    .line 638
    return-void

    .line 639
    :cond_39
    invoke-static {v2, v6}, Lcom/alibaba/fastjson2/JSONReader;->numberError(II)Lcom/alibaba/fastjson2/JSONException;

    .line 640
    .line 641
    .line 642
    move-result-object v1

    .line 643
    throw v1

    .line 644
    :cond_3a
    invoke-static {v2, v6}, Lcom/alibaba/fastjson2/JSONReader;->numberError(II)Lcom/alibaba/fastjson2/JSONException;

    .line 645
    .line 646
    .line 647
    move-result-object v1

    .line 648
    throw v1

    .line 649
    :cond_3b
    invoke-static {v3, v2}, Lcom/alibaba/fastjson2/JSONReader;->numberError(II)Lcom/alibaba/fastjson2/JSONException;

    .line 650
    .line 651
    .line 652
    move-result-object v1

    .line 653
    throw v1

    .line 654
    nop

    .line 655
    :pswitch_data_0
    .packed-switch 0x30
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
