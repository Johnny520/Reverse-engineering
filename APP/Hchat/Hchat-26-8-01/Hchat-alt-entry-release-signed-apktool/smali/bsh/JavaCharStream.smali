.class public Lbsh/JavaCharStream;
.super Lbsh/AbstractCharStream;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field protected static final NEXTCHAR_BUF_SIZE:I = 0x1000


# instance fields
.field private m_aIS:Ljava/io/Reader;

.field private m_aNextCharBuf:[C

.field private nextCharInd:I


# direct methods
.method public constructor <init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
    .locals 6

    const/4 v4, 0x1

    const/16 v5, 0x1000

    const/4 v3, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    .line 20
    invoke-direct/range {v0 .. v5}, Lbsh/JavaCharStream;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;III)V

    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;II)V
    .locals 6

    const/16 v5, 0x1000

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    .line 19
    invoke-direct/range {v0 .. v5}, Lbsh/JavaCharStream;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;III)V

    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;III)V
    .locals 1

    .line 18
    new-instance v0, Ljava/io/InputStreamReader;

    invoke-direct {v0, p1, p2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    invoke-direct {p0, v0, p3, p4, p5}, Lbsh/JavaCharStream;-><init>(Ljava/io/Reader;III)V

    return-void
.end method

.method public constructor <init>(Ljava/io/Reader;)V
    .locals 2

    const/4 v0, 0x1

    const/16 v1, 0x1000

    .line 17
    invoke-direct {p0, p1, v0, v0, v1}, Lbsh/JavaCharStream;-><init>(Ljava/io/Reader;III)V

    return-void
.end method

.method public constructor <init>(Ljava/io/Reader;II)V
    .locals 1

    const/16 v0, 0x1000

    .line 16
    invoke-direct {p0, p1, p2, p3, v0}, Lbsh/JavaCharStream;-><init>(Ljava/io/Reader;III)V

    return-void
.end method

.method public constructor <init>(Ljava/io/Reader;III)V
    .locals 0

    .line 1
    invoke-direct {p0, p2, p3, p4}, Lbsh/AbstractCharStream;-><init>(III)V

    .line 2
    .line 3
    .line 4
    const/4 p2, -0x1

    .line 5
    iput p2, p0, Lbsh/JavaCharStream;->nextCharInd:I

    .line 6
    .line 7
    const/16 p2, 0x1000

    .line 8
    .line 9
    new-array p2, p2, [C

    .line 10
    .line 11
    iput-object p2, p0, Lbsh/JavaCharStream;->m_aNextCharBuf:[C

    .line 12
    .line 13
    iput-object p1, p0, Lbsh/JavaCharStream;->m_aIS:Ljava/io/Reader;

    .line 14
    .line 15
    return-void
.end method

.method private readByte()C
    .locals 2

    .line 1
    iget v0, p0, Lbsh/JavaCharStream;->nextCharInd:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Lbsh/JavaCharStream;->nextCharInd:I

    .line 6
    .line 7
    iget v1, p0, Lbsh/AbstractCharStream;->maxNextCharInd:I

    .line 8
    .line 9
    if-lt v0, v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lbsh/JavaCharStream;->fillBuff()V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lbsh/JavaCharStream;->m_aNextCharBuf:[C

    .line 15
    .line 16
    iget v1, p0, Lbsh/JavaCharStream;->nextCharInd:I

    .line 17
    .line 18
    aget-char v0, v0, v1

    .line 19
    .line 20
    return v0
.end method


# virtual methods
.method public beginToken()C
    .locals 3

    .line 1
    iget v0, p0, Lbsh/AbstractCharStream;->inBuf:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-lez v0, :cond_1

    .line 5
    .line 6
    add-int/lit8 v0, v0, -0x1

    .line 7
    .line 8
    iput v0, p0, Lbsh/AbstractCharStream;->inBuf:I

    .line 9
    .line 10
    iget v0, p0, Lbsh/AbstractCharStream;->bufpos:I

    .line 11
    .line 12
    add-int/lit8 v0, v0, 0x1

    .line 13
    .line 14
    iput v0, p0, Lbsh/AbstractCharStream;->bufpos:I

    .line 15
    .line 16
    iget v2, p0, Lbsh/AbstractCharStream;->bufsize:I

    .line 17
    .line 18
    if-ne v0, v2, :cond_0

    .line 19
    .line 20
    iput v1, p0, Lbsh/AbstractCharStream;->bufpos:I

    .line 21
    .line 22
    :cond_0
    iget v0, p0, Lbsh/AbstractCharStream;->bufpos:I

    .line 23
    .line 24
    iput v0, p0, Lbsh/AbstractCharStream;->tokenBegin:I

    .line 25
    .line 26
    iget-object v1, p0, Lbsh/AbstractCharStream;->buffer:[C

    .line 27
    .line 28
    aget-char v0, v1, v0

    .line 29
    .line 30
    return v0

    .line 31
    :cond_1
    iput v1, p0, Lbsh/AbstractCharStream;->tokenBegin:I

    .line 32
    .line 33
    const/4 v0, -0x1

    .line 34
    iput v0, p0, Lbsh/AbstractCharStream;->bufpos:I

    .line 35
    .line 36
    invoke-virtual {p0}, Lbsh/JavaCharStream;->readChar()C

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    return v0
.end method

.method public done()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lbsh/JavaCharStream;->m_aNextCharBuf:[C

    .line 3
    .line 4
    invoke-super {p0}, Lbsh/AbstractCharStream;->done()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public fillBuff()V
    .locals 4

    .line 1
    iget v0, p0, Lbsh/AbstractCharStream;->maxNextCharInd:I

    .line 2
    .line 3
    const/16 v1, 0x1000

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    iput v2, p0, Lbsh/AbstractCharStream;->maxNextCharInd:I

    .line 9
    .line 10
    iput v2, p0, Lbsh/JavaCharStream;->nextCharInd:I

    .line 11
    .line 12
    :cond_0
    :try_start_0
    iget-object v0, p0, Lbsh/JavaCharStream;->m_aNextCharBuf:[C

    .line 13
    .line 14
    iget v1, p0, Lbsh/AbstractCharStream;->maxNextCharInd:I

    .line 15
    .line 16
    rsub-int v3, v1, 0x1000

    .line 17
    .line 18
    invoke-virtual {p0, v0, v1, v3}, Lbsh/JavaCharStream;->streamRead([CII)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v1, -0x1

    .line 23
    if-eq v0, v1, :cond_1

    .line 24
    .line 25
    iget v1, p0, Lbsh/AbstractCharStream;->maxNextCharInd:I

    .line 26
    .line 27
    add-int/2addr v1, v0

    .line 28
    iput v1, p0, Lbsh/AbstractCharStream;->maxNextCharInd:I

    .line 29
    .line 30
    return-void

    .line 31
    :catch_0
    move-exception v0

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    invoke-virtual {p0}, Lbsh/JavaCharStream;->streamClose()V

    .line 34
    .line 35
    .line 36
    new-instance v0, Ljava/io/IOException;

    .line 37
    .line 38
    invoke-direct {v0}, Ljava/io/IOException;-><init>()V

    .line 39
    .line 40
    .line 41
    throw v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 42
    :goto_0
    iget v1, p0, Lbsh/AbstractCharStream;->bufpos:I

    .line 43
    .line 44
    if-eqz v1, :cond_2

    .line 45
    .line 46
    add-int/lit8 v1, v1, -0x1

    .line 47
    .line 48
    iput v1, p0, Lbsh/AbstractCharStream;->bufpos:I

    .line 49
    .line 50
    invoke-virtual {p0, v2}, Lbsh/AbstractCharStream;->backup(I)V

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_2
    invoke-virtual {p0}, Lbsh/AbstractCharStream;->getLine()I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    invoke-virtual {p0}, Lbsh/AbstractCharStream;->getColumn()I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    invoke-virtual {p0, v1, v2}, Lbsh/AbstractCharStream;->internalSetBufLineColumn(II)V

    .line 63
    .line 64
    .line 65
    :goto_1
    throw v0
.end method

.method public reInit(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
    .locals 6

    const/4 v4, 0x1

    const/16 v5, 0x1000

    const/4 v3, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    .line 18
    invoke-virtual/range {v0 .. v5}, Lbsh/JavaCharStream;->reInit(Ljava/io/InputStream;Ljava/nio/charset/Charset;III)V

    return-void
.end method

.method public reInit(Ljava/io/InputStream;Ljava/nio/charset/Charset;II)V
    .locals 6

    const/16 v5, 0x1000

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    .line 19
    invoke-virtual/range {v0 .. v5}, Lbsh/JavaCharStream;->reInit(Ljava/io/InputStream;Ljava/nio/charset/Charset;III)V

    return-void
.end method

.method public reInit(Ljava/io/InputStream;Ljava/nio/charset/Charset;III)V
    .locals 1

    .line 20
    new-instance v0, Ljava/io/InputStreamReader;

    invoke-direct {v0, p1, p2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    invoke-virtual {p0, v0, p3, p4, p5}, Lbsh/JavaCharStream;->reInit(Ljava/io/Reader;III)V

    return-void
.end method

.method public reInit(Ljava/io/Reader;)V
    .locals 2

    const/4 v0, 0x1

    const/16 v1, 0x1000

    .line 17
    invoke-virtual {p0, p1, v0, v0, v1}, Lbsh/JavaCharStream;->reInit(Ljava/io/Reader;III)V

    return-void
.end method

.method public reInit(Ljava/io/Reader;II)V
    .locals 1

    const/16 v0, 0x1000

    .line 16
    invoke-virtual {p0, p1, p2, p3, v0}, Lbsh/JavaCharStream;->reInit(Ljava/io/Reader;III)V

    return-void
.end method

.method public reInit(Ljava/io/Reader;III)V
    .locals 1

    .line 1
    const/16 v0, 0x1000

    .line 2
    .line 3
    new-array v0, v0, [C

    .line 4
    .line 5
    iput-object v0, p0, Lbsh/JavaCharStream;->m_aNextCharBuf:[C

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    iput v0, p0, Lbsh/JavaCharStream;->nextCharInd:I

    .line 9
    .line 10
    iput-object p1, p0, Lbsh/JavaCharStream;->m_aIS:Ljava/io/Reader;

    .line 11
    .line 12
    invoke-virtual {p0, p2, p3, p4}, Lbsh/AbstractCharStream;->reInit(III)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public readChar()C
    .locals 10

    .line 1
    iget v0, p0, Lbsh/AbstractCharStream;->inBuf:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-lez v0, :cond_1

    .line 5
    .line 6
    sub-int/2addr v0, v1

    .line 7
    iput v0, p0, Lbsh/AbstractCharStream;->inBuf:I

    .line 8
    .line 9
    iget v0, p0, Lbsh/AbstractCharStream;->bufpos:I

    .line 10
    .line 11
    add-int/2addr v0, v1

    .line 12
    iput v0, p0, Lbsh/AbstractCharStream;->bufpos:I

    .line 13
    .line 14
    iget v1, p0, Lbsh/AbstractCharStream;->bufsize:I

    .line 15
    .line 16
    if-ne v0, v1, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput v0, p0, Lbsh/AbstractCharStream;->bufpos:I

    .line 20
    .line 21
    :cond_0
    iget-object v0, p0, Lbsh/AbstractCharStream;->buffer:[C

    .line 22
    .line 23
    iget v1, p0, Lbsh/AbstractCharStream;->bufpos:I

    .line 24
    .line 25
    aget-char v0, v0, v1

    .line 26
    .line 27
    return v0

    .line 28
    :cond_1
    iget v0, p0, Lbsh/AbstractCharStream;->bufpos:I

    .line 29
    .line 30
    add-int/2addr v0, v1

    .line 31
    iput v0, p0, Lbsh/AbstractCharStream;->bufpos:I

    .line 32
    .line 33
    iget v2, p0, Lbsh/AbstractCharStream;->available:I

    .line 34
    .line 35
    if-ne v0, v2, :cond_2

    .line 36
    .line 37
    invoke-virtual {p0}, Lbsh/AbstractCharStream;->internalAdjustBuffSize()V

    .line 38
    .line 39
    .line 40
    :cond_2
    invoke-direct {p0}, Lbsh/JavaCharStream;->readByte()C

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iget-object v2, p0, Lbsh/AbstractCharStream;->buffer:[C

    .line 45
    .line 46
    iget v3, p0, Lbsh/AbstractCharStream;->bufpos:I

    .line 47
    .line 48
    aput-char v0, v2, v3

    .line 49
    .line 50
    const/16 v2, 0x5c

    .line 51
    .line 52
    if-eq v0, v2, :cond_4

    .line 53
    .line 54
    invoke-virtual {p0}, Lbsh/AbstractCharStream;->isTrackLineColumn()Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-eqz v1, :cond_3

    .line 59
    .line 60
    invoke-virtual {p0, v0}, Lbsh/AbstractCharStream;->internalUpdateLineColumn(C)V

    .line 61
    .line 62
    .line 63
    :cond_3
    return v0

    .line 64
    :cond_4
    invoke-virtual {p0}, Lbsh/AbstractCharStream;->isTrackLineColumn()Z

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-eqz v3, :cond_5

    .line 69
    .line 70
    invoke-virtual {p0, v0}, Lbsh/AbstractCharStream;->internalUpdateLineColumn(C)V

    .line 71
    .line 72
    .line 73
    :cond_5
    move v0, v1

    .line 74
    :goto_0
    iget v3, p0, Lbsh/AbstractCharStream;->bufpos:I

    .line 75
    .line 76
    add-int/2addr v3, v1

    .line 77
    iput v3, p0, Lbsh/AbstractCharStream;->bufpos:I

    .line 78
    .line 79
    iget v4, p0, Lbsh/AbstractCharStream;->available:I

    .line 80
    .line 81
    if-ne v3, v4, :cond_6

    .line 82
    .line 83
    invoke-virtual {p0}, Lbsh/AbstractCharStream;->internalAdjustBuffSize()V

    .line 84
    .line 85
    .line 86
    :cond_6
    :try_start_0
    invoke-direct {p0}, Lbsh/JavaCharStream;->readByte()C

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    iget-object v4, p0, Lbsh/AbstractCharStream;->buffer:[C

    .line 91
    .line 92
    iget v5, p0, Lbsh/AbstractCharStream;->bufpos:I

    .line 93
    .line 94
    aput-char v3, v4, v5

    .line 95
    .line 96
    if-eq v3, v2, :cond_d

    .line 97
    .line 98
    invoke-virtual {p0}, Lbsh/AbstractCharStream;->isTrackLineColumn()Z

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    if-eqz v4, :cond_7

    .line 103
    .line 104
    invoke-virtual {p0, v3}, Lbsh/AbstractCharStream;->internalUpdateLineColumn(C)V

    .line 105
    .line 106
    .line 107
    :cond_7
    const/16 v4, 0x75

    .line 108
    .line 109
    if-ne v3, v4, :cond_c

    .line 110
    .line 111
    and-int/lit8 v3, v0, 0x1

    .line 112
    .line 113
    if-ne v3, v1, :cond_c

    .line 114
    .line 115
    iget v3, p0, Lbsh/AbstractCharStream;->bufpos:I

    .line 116
    .line 117
    sub-int/2addr v3, v1

    .line 118
    iput v3, p0, Lbsh/AbstractCharStream;->bufpos:I

    .line 119
    .line 120
    if-gez v3, :cond_8

    .line 121
    .line 122
    iget v3, p0, Lbsh/AbstractCharStream;->bufsize:I

    .line 123
    .line 124
    sub-int/2addr v3, v1

    .line 125
    iput v3, p0, Lbsh/AbstractCharStream;->bufpos:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 126
    .line 127
    :cond_8
    :goto_1
    :try_start_1
    invoke-direct {p0}, Lbsh/JavaCharStream;->readByte()C

    .line 128
    .line 129
    .line 130
    move-result v3

    .line 131
    if-ne v3, v4, :cond_9

    .line 132
    .line 133
    invoke-virtual {p0}, Lbsh/AbstractCharStream;->isTrackLineColumn()Z

    .line 134
    .line 135
    .line 136
    move-result v5

    .line 137
    if-eqz v5, :cond_8

    .line 138
    .line 139
    invoke-virtual {p0, v3}, Lbsh/AbstractCharStream;->internalUpdateLineColumn(C)V

    .line 140
    .line 141
    .line 142
    goto :goto_1

    .line 143
    :cond_9
    invoke-direct {p0}, Lbsh/JavaCharStream;->readByte()C

    .line 144
    .line 145
    .line 146
    move-result v4

    .line 147
    invoke-direct {p0}, Lbsh/JavaCharStream;->readByte()C

    .line 148
    .line 149
    .line 150
    move-result v5

    .line 151
    invoke-direct {p0}, Lbsh/JavaCharStream;->readByte()C

    .line 152
    .line 153
    .line 154
    move-result v6

    .line 155
    invoke-static {v3}, Lbsh/AbstractCharStream;->hexval(C)I

    .line 156
    .line 157
    .line 158
    move-result v7

    .line 159
    shl-int/lit8 v7, v7, 0xc

    .line 160
    .line 161
    invoke-static {v4}, Lbsh/AbstractCharStream;->hexval(C)I

    .line 162
    .line 163
    .line 164
    move-result v8

    .line 165
    shl-int/lit8 v8, v8, 0x8

    .line 166
    .line 167
    or-int/2addr v7, v8

    .line 168
    invoke-static {v5}, Lbsh/AbstractCharStream;->hexval(C)I

    .line 169
    .line 170
    .line 171
    move-result v8

    .line 172
    shl-int/lit8 v8, v8, 0x4

    .line 173
    .line 174
    or-int/2addr v7, v8

    .line 175
    invoke-static {v6}, Lbsh/AbstractCharStream;->hexval(C)I

    .line 176
    .line 177
    .line 178
    move-result v8

    .line 179
    or-int/2addr v7, v8

    .line 180
    int-to-char v7, v7

    .line 181
    iget-object v8, p0, Lbsh/AbstractCharStream;->buffer:[C

    .line 182
    .line 183
    iget v9, p0, Lbsh/AbstractCharStream;->bufpos:I

    .line 184
    .line 185
    aput-char v7, v8, v9

    .line 186
    .line 187
    invoke-virtual {p0}, Lbsh/AbstractCharStream;->isTrackLineColumn()Z

    .line 188
    .line 189
    .line 190
    move-result v8

    .line 191
    if-eqz v8, :cond_a

    .line 192
    .line 193
    invoke-virtual {p0, v3}, Lbsh/AbstractCharStream;->internalUpdateLineColumn(C)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {p0, v4}, Lbsh/AbstractCharStream;->internalUpdateLineColumn(C)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {p0, v5}, Lbsh/AbstractCharStream;->internalUpdateLineColumn(C)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {p0, v6}, Lbsh/AbstractCharStream;->internalUpdateLineColumn(C)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 203
    .line 204
    .line 205
    :cond_a
    if-ne v0, v1, :cond_b

    .line 206
    .line 207
    return v7

    .line 208
    :cond_b
    sub-int/2addr v0, v1

    .line 209
    invoke-virtual {p0, v0}, Lbsh/AbstractCharStream;->backup(I)V

    .line 210
    .line 211
    .line 212
    return v2

    .line 213
    :catch_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 214
    .line 215
    invoke-virtual {p0}, Lbsh/AbstractCharStream;->getLine()I

    .line 216
    .line 217
    .line 218
    move-result v1

    .line 219
    invoke-virtual {p0}, Lbsh/AbstractCharStream;->getColumn()I

    .line 220
    .line 221
    .line 222
    move-result v2

    .line 223
    new-instance v3, Ljava/lang/StringBuilder;

    .line 224
    .line 225
    const-string v4, "Invalid escape character at line "

    .line 226
    .line 227
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    const-string v1, " column "

    .line 234
    .line 235
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    const-string v1, "."

    .line 242
    .line 243
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 244
    .line 245
    .line 246
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v1

    .line 250
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    throw v0

    .line 254
    :cond_c
    :try_start_2
    invoke-virtual {p0, v0}, Lbsh/AbstractCharStream;->backup(I)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 255
    .line 256
    .line 257
    return v2

    .line 258
    :cond_d
    invoke-virtual {p0}, Lbsh/AbstractCharStream;->isTrackLineColumn()Z

    .line 259
    .line 260
    .line 261
    move-result v4

    .line 262
    if-eqz v4, :cond_e

    .line 263
    .line 264
    invoke-virtual {p0, v3}, Lbsh/AbstractCharStream;->internalUpdateLineColumn(C)V

    .line 265
    .line 266
    .line 267
    :cond_e
    add-int/lit8 v0, v0, 0x1

    .line 268
    .line 269
    goto/16 :goto_0

    .line 270
    .line 271
    :catch_1
    if-le v0, v1, :cond_f

    .line 272
    .line 273
    sub-int/2addr v0, v1

    .line 274
    invoke-virtual {p0, v0}, Lbsh/AbstractCharStream;->backup(I)V

    .line 275
    .line 276
    .line 277
    :cond_f
    return v2
.end method

.method public streamClose()V
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/JavaCharStream;->m_aIS:Ljava/io/Reader;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/io/Reader;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public streamRead([CII)I
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/JavaCharStream;->m_aIS:Ljava/io/Reader;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Ljava/io/Reader;->read([CII)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method
