.class public abstract Lbsh/AbstractCharStream;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lbsh/CharStream;


# static fields
.field public static final DEFAULT_BUF_SIZE:I = 0x1000


# instance fields
.field protected available:I

.field protected buffer:[C

.field protected bufpos:I

.field protected bufsize:I

.field protected inBuf:I

.field private m_aBufColumn:[I

.field private m_aBufLine:[I

.field private m_bPrevCharIsCR:Z

.field private m_bPrevCharIsLF:Z

.field private m_bTrackLineColumn:Z

.field private m_nColumnNo:I

.field private m_nLineNo:I

.field private m_nTabSize:I

.field protected maxNextCharInd:I

.field protected tokenBegin:I


# direct methods
.method public constructor <init>(III)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput v0, p0, Lbsh/AbstractCharStream;->m_nTabSize:I

    .line 6
    .line 7
    iput-boolean v0, p0, Lbsh/AbstractCharStream;->m_bTrackLineColumn:Z

    .line 8
    .line 9
    invoke-virtual {p0, p1, p2, p3}, Lbsh/AbstractCharStream;->reInit(III)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public static final hexval(C)I
    .locals 3

    .line 1
    packed-switch p0, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    packed-switch p0, :pswitch_data_1

    .line 5
    .line 6
    .line 7
    packed-switch p0, :pswitch_data_2

    .line 8
    .line 9
    .line 10
    new-instance v0, Ljava/io/IOException;

    .line 11
    .line 12
    new-instance v1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v2, "Invalid hex char \'"

    .line 15
    .line 16
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v2, "\' (="

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string p0, ") provided!"

    .line 31
    .line 32
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw v0

    .line 43
    :pswitch_0
    const/16 p0, 0xf

    .line 44
    .line 45
    return p0

    .line 46
    :pswitch_1
    const/16 p0, 0xe

    .line 47
    .line 48
    return p0

    .line 49
    :pswitch_2
    const/16 p0, 0xd

    .line 50
    .line 51
    return p0

    .line 52
    :pswitch_3
    const/16 p0, 0xc

    .line 53
    .line 54
    return p0

    .line 55
    :pswitch_4
    const/16 p0, 0xb

    .line 56
    .line 57
    return p0

    .line 58
    :pswitch_5
    const/16 p0, 0xa

    .line 59
    .line 60
    return p0

    .line 61
    :pswitch_6
    const/16 p0, 0x9

    .line 62
    .line 63
    return p0

    .line 64
    :pswitch_7
    const/16 p0, 0x8

    .line 65
    .line 66
    return p0

    .line 67
    :pswitch_8
    const/4 p0, 0x7

    .line 68
    return p0

    .line 69
    :pswitch_9
    const/4 p0, 0x6

    .line 70
    return p0

    .line 71
    :pswitch_a
    const/4 p0, 0x5

    .line 72
    return p0

    .line 73
    :pswitch_b
    const/4 p0, 0x4

    .line 74
    return p0

    .line 75
    :pswitch_c
    const/4 p0, 0x3

    .line 76
    return p0

    .line 77
    :pswitch_d
    const/4 p0, 0x2

    .line 78
    return p0

    .line 79
    :pswitch_e
    const/4 p0, 0x1

    .line 80
    return p0

    .line 81
    :pswitch_f
    const/4 p0, 0x0

    .line 82
    return p0

    .line 83
    :pswitch_data_0
    .packed-switch 0x30
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
    .end packed-switch

    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    :pswitch_data_1
    .packed-switch 0x41
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x61
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final adjustBeginLineColumn(II)V
    .locals 9

    .line 1
    iget v0, p0, Lbsh/AbstractCharStream;->tokenBegin:I

    .line 2
    .line 3
    iget v1, p0, Lbsh/AbstractCharStream;->bufpos:I

    .line 4
    .line 5
    if-lt v1, v0, :cond_0

    .line 6
    .line 7
    sub-int/2addr v1, v0

    .line 8
    iget v2, p0, Lbsh/AbstractCharStream;->inBuf:I

    .line 9
    .line 10
    add-int/2addr v1, v2

    .line 11
    add-int/lit8 v1, v1, 0x1

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget v2, p0, Lbsh/AbstractCharStream;->bufsize:I

    .line 15
    .line 16
    sub-int/2addr v2, v0

    .line 17
    add-int/2addr v2, v1

    .line 18
    add-int/lit8 v2, v2, 0x1

    .line 19
    .line 20
    iget v1, p0, Lbsh/AbstractCharStream;->inBuf:I

    .line 21
    .line 22
    add-int/2addr v1, v2

    .line 23
    :goto_0
    const/4 v2, 0x0

    .line 24
    move v3, v2

    .line 25
    move v4, v3

    .line 26
    :goto_1
    if-ge v2, v1, :cond_2

    .line 27
    .line 28
    iget-object v3, p0, Lbsh/AbstractCharStream;->m_aBufLine:[I

    .line 29
    .line 30
    iget v5, p0, Lbsh/AbstractCharStream;->bufsize:I

    .line 31
    .line 32
    rem-int v6, v0, v5

    .line 33
    .line 34
    aget v7, v3, v6

    .line 35
    .line 36
    add-int/lit8 v0, v0, 0x1

    .line 37
    .line 38
    rem-int v5, v0, v5

    .line 39
    .line 40
    aget v8, v3, v5

    .line 41
    .line 42
    if-ne v7, v8, :cond_1

    .line 43
    .line 44
    aput p1, v3, v6

    .line 45
    .line 46
    iget-object v3, p0, Lbsh/AbstractCharStream;->m_aBufColumn:[I

    .line 47
    .line 48
    aget v5, v3, v5

    .line 49
    .line 50
    add-int/2addr v5, v4

    .line 51
    aget v7, v3, v6

    .line 52
    .line 53
    sub-int/2addr v5, v7

    .line 54
    add-int/2addr v4, p2

    .line 55
    aput v4, v3, v6

    .line 56
    .line 57
    add-int/lit8 v2, v2, 0x1

    .line 58
    .line 59
    move v4, v5

    .line 60
    move v3, v6

    .line 61
    goto :goto_1

    .line 62
    :cond_1
    move v3, v6

    .line 63
    :cond_2
    if-ge v2, v1, :cond_4

    .line 64
    .line 65
    iget-object v5, p0, Lbsh/AbstractCharStream;->m_aBufLine:[I

    .line 66
    .line 67
    add-int/lit8 v6, p1, 0x1

    .line 68
    .line 69
    aput p1, v5, v3

    .line 70
    .line 71
    iget-object p1, p0, Lbsh/AbstractCharStream;->m_aBufColumn:[I

    .line 72
    .line 73
    add-int/2addr p2, v4

    .line 74
    aput p2, p1, v3

    .line 75
    .line 76
    :goto_2
    add-int/lit8 p1, v2, 0x1

    .line 77
    .line 78
    if-ge v2, v1, :cond_4

    .line 79
    .line 80
    iget-object p2, p0, Lbsh/AbstractCharStream;->m_aBufLine:[I

    .line 81
    .line 82
    iget v2, p0, Lbsh/AbstractCharStream;->bufsize:I

    .line 83
    .line 84
    rem-int v3, v0, v2

    .line 85
    .line 86
    aget v4, p2, v3

    .line 87
    .line 88
    add-int/lit8 v0, v0, 0x1

    .line 89
    .line 90
    rem-int v2, v0, v2

    .line 91
    .line 92
    aget v2, p2, v2

    .line 93
    .line 94
    if-eq v4, v2, :cond_3

    .line 95
    .line 96
    add-int/lit8 v2, v6, 0x1

    .line 97
    .line 98
    aput v6, p2, v3

    .line 99
    .line 100
    move v6, v2

    .line 101
    :goto_3
    move v2, p1

    .line 102
    goto :goto_2

    .line 103
    :cond_3
    aput v6, p2, v3

    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_4
    iget-object p1, p0, Lbsh/AbstractCharStream;->m_aBufLine:[I

    .line 107
    .line 108
    aget p1, p1, v3

    .line 109
    .line 110
    iput p1, p0, Lbsh/AbstractCharStream;->m_nLineNo:I

    .line 111
    .line 112
    iget-object p1, p0, Lbsh/AbstractCharStream;->m_aBufColumn:[I

    .line 113
    .line 114
    aget p1, p1, v3

    .line 115
    .line 116
    iput p1, p0, Lbsh/AbstractCharStream;->m_nColumnNo:I

    .line 117
    .line 118
    return-void
.end method

.method public backup(I)V
    .locals 2

    .line 1
    iget v0, p0, Lbsh/AbstractCharStream;->bufsize:I

    .line 2
    .line 3
    if-gt p1, v0, :cond_1

    .line 4
    .line 5
    iget v1, p0, Lbsh/AbstractCharStream;->inBuf:I

    .line 6
    .line 7
    add-int/2addr v1, p1

    .line 8
    iput v1, p0, Lbsh/AbstractCharStream;->inBuf:I

    .line 9
    .line 10
    iget v1, p0, Lbsh/AbstractCharStream;->bufpos:I

    .line 11
    .line 12
    sub-int/2addr v1, p1

    .line 13
    iput v1, p0, Lbsh/AbstractCharStream;->bufpos:I

    .line 14
    .line 15
    if-gez v1, :cond_0

    .line 16
    .line 17
    add-int/2addr v1, v0

    .line 18
    iput v1, p0, Lbsh/AbstractCharStream;->bufpos:I

    .line 19
    .line 20
    :cond_0
    return-void

    .line 21
    :cond_1
    const-string v0, "Cannot back "

    .line 22
    .line 23
    const-string v1, " chars which is larger than the internal buffer size ("

    .line 24
    .line 25
    invoke-static {p1, v0, v1}, Leh/a;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iget v0, p0, Lbsh/AbstractCharStream;->bufsize:I

    .line 30
    .line 31
    const-string v1, ")"

    .line 32
    .line 33
    invoke-static {p1, v0, v1}, Lj8/b;->j(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public beginToken()C
    .locals 2

    .line 1
    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lbsh/AbstractCharStream;->tokenBegin:I

    .line 3
    .line 4
    invoke-virtual {p0}, Lbsh/AbstractCharStream;->readChar()C

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    iget v1, p0, Lbsh/AbstractCharStream;->bufpos:I

    .line 9
    .line 10
    iput v1, p0, Lbsh/AbstractCharStream;->tokenBegin:I

    .line 11
    .line 12
    return v0
.end method

.method public done()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lbsh/AbstractCharStream;->buffer:[C

    .line 3
    .line 4
    iput-object v0, p0, Lbsh/AbstractCharStream;->m_aBufLine:[I

    .line 5
    .line 6
    iput-object v0, p0, Lbsh/AbstractCharStream;->m_aBufColumn:[I

    .line 7
    .line 8
    return-void
.end method

.method public expandBuff(Z)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lbsh/AbstractCharStream;->getBufSizeAfterExpansion()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-array v1, v0, [C

    .line 6
    .line 7
    new-array v2, v0, [I

    .line 8
    .line 9
    new-array v3, v0, [I

    .line 10
    .line 11
    iget v4, p0, Lbsh/AbstractCharStream;->bufsize:I

    .line 12
    .line 13
    iget v5, p0, Lbsh/AbstractCharStream;->tokenBegin:I

    .line 14
    .line 15
    sub-int/2addr v4, v5

    .line 16
    iget-object v6, p0, Lbsh/AbstractCharStream;->buffer:[C

    .line 17
    .line 18
    const/4 v7, 0x0

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    invoke-static {v6, v5, v1, v7, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Lbsh/AbstractCharStream;->buffer:[C

    .line 25
    .line 26
    iget v5, p0, Lbsh/AbstractCharStream;->bufpos:I

    .line 27
    .line 28
    invoke-static {p1, v7, v1, v4, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 29
    .line 30
    .line 31
    iput-object v1, p0, Lbsh/AbstractCharStream;->buffer:[C

    .line 32
    .line 33
    iget-object p1, p0, Lbsh/AbstractCharStream;->m_aBufLine:[I

    .line 34
    .line 35
    iget v1, p0, Lbsh/AbstractCharStream;->tokenBegin:I

    .line 36
    .line 37
    invoke-static {p1, v1, v2, v7, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lbsh/AbstractCharStream;->m_aBufLine:[I

    .line 41
    .line 42
    iget v1, p0, Lbsh/AbstractCharStream;->bufpos:I

    .line 43
    .line 44
    invoke-static {p1, v7, v2, v4, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 45
    .line 46
    .line 47
    iput-object v2, p0, Lbsh/AbstractCharStream;->m_aBufLine:[I

    .line 48
    .line 49
    iget-object p1, p0, Lbsh/AbstractCharStream;->m_aBufColumn:[I

    .line 50
    .line 51
    iget v1, p0, Lbsh/AbstractCharStream;->tokenBegin:I

    .line 52
    .line 53
    invoke-static {p1, v1, v3, v7, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 54
    .line 55
    .line 56
    iget-object p1, p0, Lbsh/AbstractCharStream;->m_aBufColumn:[I

    .line 57
    .line 58
    iget v1, p0, Lbsh/AbstractCharStream;->bufpos:I

    .line 59
    .line 60
    invoke-static {p1, v7, v3, v4, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 61
    .line 62
    .line 63
    iput-object v3, p0, Lbsh/AbstractCharStream;->m_aBufColumn:[I

    .line 64
    .line 65
    iget p1, p0, Lbsh/AbstractCharStream;->bufpos:I

    .line 66
    .line 67
    add-int/2addr p1, v4

    .line 68
    iput p1, p0, Lbsh/AbstractCharStream;->bufpos:I

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_0
    invoke-static {v6, v5, v1, v7, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 72
    .line 73
    .line 74
    iput-object v1, p0, Lbsh/AbstractCharStream;->buffer:[C

    .line 75
    .line 76
    iget-object p1, p0, Lbsh/AbstractCharStream;->m_aBufLine:[I

    .line 77
    .line 78
    iget v1, p0, Lbsh/AbstractCharStream;->tokenBegin:I

    .line 79
    .line 80
    invoke-static {p1, v1, v2, v7, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 81
    .line 82
    .line 83
    iput-object v2, p0, Lbsh/AbstractCharStream;->m_aBufLine:[I

    .line 84
    .line 85
    iget-object p1, p0, Lbsh/AbstractCharStream;->m_aBufColumn:[I

    .line 86
    .line 87
    iget v1, p0, Lbsh/AbstractCharStream;->tokenBegin:I

    .line 88
    .line 89
    invoke-static {p1, v1, v3, v7, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 90
    .line 91
    .line 92
    iput-object v3, p0, Lbsh/AbstractCharStream;->m_aBufColumn:[I

    .line 93
    .line 94
    iget p1, p0, Lbsh/AbstractCharStream;->bufpos:I

    .line 95
    .line 96
    iget v1, p0, Lbsh/AbstractCharStream;->tokenBegin:I

    .line 97
    .line 98
    sub-int/2addr p1, v1

    .line 99
    iput p1, p0, Lbsh/AbstractCharStream;->bufpos:I

    .line 100
    .line 101
    :goto_0
    iput v0, p0, Lbsh/AbstractCharStream;->bufsize:I

    .line 102
    .line 103
    iput v0, p0, Lbsh/AbstractCharStream;->available:I

    .line 104
    .line 105
    iput v7, p0, Lbsh/AbstractCharStream;->tokenBegin:I

    .line 106
    .line 107
    return-void
.end method

.method public fillBuff()V
    .locals 4

    .line 1
    iget v0, p0, Lbsh/AbstractCharStream;->maxNextCharInd:I

    .line 2
    .line 3
    iget v1, p0, Lbsh/AbstractCharStream;->available:I

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lbsh/AbstractCharStream;->internalAdjustBuffSize()V

    .line 8
    .line 9
    .line 10
    :cond_0
    const/4 v0, -0x1

    .line 11
    :try_start_0
    iget-object v1, p0, Lbsh/AbstractCharStream;->buffer:[C

    .line 12
    .line 13
    iget v2, p0, Lbsh/AbstractCharStream;->maxNextCharInd:I

    .line 14
    .line 15
    iget v3, p0, Lbsh/AbstractCharStream;->available:I

    .line 16
    .line 17
    sub-int/2addr v3, v2

    .line 18
    invoke-virtual {p0, v1, v2, v3}, Lbsh/AbstractCharStream;->streamRead([CII)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eq v1, v0, :cond_1

    .line 23
    .line 24
    iget v2, p0, Lbsh/AbstractCharStream;->maxNextCharInd:I

    .line 25
    .line 26
    add-int/2addr v2, v1

    .line 27
    iput v2, p0, Lbsh/AbstractCharStream;->maxNextCharInd:I

    .line 28
    .line 29
    return-void

    .line 30
    :catch_0
    move-exception v1

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-virtual {p0}, Lbsh/AbstractCharStream;->streamClose()V

    .line 33
    .line 34
    .line 35
    new-instance v1, Ljava/io/IOException;

    .line 36
    .line 37
    const-string v2, "PGCC end of stream"

    .line 38
    .line 39
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    :goto_0
    iget v2, p0, Lbsh/AbstractCharStream;->bufpos:I

    .line 44
    .line 45
    add-int/lit8 v2, v2, -0x1

    .line 46
    .line 47
    iput v2, p0, Lbsh/AbstractCharStream;->bufpos:I

    .line 48
    .line 49
    const/4 v2, 0x0

    .line 50
    invoke-virtual {p0, v2}, Lbsh/AbstractCharStream;->backup(I)V

    .line 51
    .line 52
    .line 53
    iget v2, p0, Lbsh/AbstractCharStream;->tokenBegin:I

    .line 54
    .line 55
    if-ne v2, v0, :cond_2

    .line 56
    .line 57
    iget v0, p0, Lbsh/AbstractCharStream;->bufpos:I

    .line 58
    .line 59
    iput v0, p0, Lbsh/AbstractCharStream;->tokenBegin:I

    .line 60
    .line 61
    :cond_2
    throw v1
.end method

.method public getBeginColumn()I
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/AbstractCharStream;->m_aBufColumn:[I

    .line 2
    .line 3
    iget v1, p0, Lbsh/AbstractCharStream;->tokenBegin:I

    .line 4
    .line 5
    aget v0, v0, v1

    .line 6
    .line 7
    return v0
.end method

.method public getBeginLine()I
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/AbstractCharStream;->m_aBufLine:[I

    .line 2
    .line 3
    iget v1, p0, Lbsh/AbstractCharStream;->tokenBegin:I

    .line 4
    .line 5
    aget v0, v0, v1

    .line 6
    .line 7
    return v0
.end method

.method public getBufSizeAfterExpansion()I
    .locals 1

    .line 1
    iget v0, p0, Lbsh/AbstractCharStream;->bufsize:I

    .line 2
    .line 3
    mul-int/lit8 v0, v0, 0x2

    .line 4
    .line 5
    return v0
.end method

.method public final getColumn()I
    .locals 1

    .line 1
    iget v0, p0, Lbsh/AbstractCharStream;->m_nColumnNo:I

    .line 2
    .line 3
    return v0
.end method

.method public getEndColumn()I
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/AbstractCharStream;->m_aBufColumn:[I

    .line 2
    .line 3
    iget v1, p0, Lbsh/AbstractCharStream;->bufpos:I

    .line 4
    .line 5
    aget v0, v0, v1

    .line 6
    .line 7
    return v0
.end method

.method public getEndLine()I
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/AbstractCharStream;->m_aBufLine:[I

    .line 2
    .line 3
    iget v1, p0, Lbsh/AbstractCharStream;->bufpos:I

    .line 4
    .line 5
    aget v0, v0, v1

    .line 6
    .line 7
    return v0
.end method

.method public getImage()Ljava/lang/String;
    .locals 5

    .line 1
    iget v0, p0, Lbsh/AbstractCharStream;->bufpos:I

    .line 2
    .line 3
    iget v1, p0, Lbsh/AbstractCharStream;->tokenBegin:I

    .line 4
    .line 5
    iget-object v2, p0, Lbsh/AbstractCharStream;->buffer:[C

    .line 6
    .line 7
    if-lt v0, v1, :cond_0

    .line 8
    .line 9
    new-instance v3, Ljava/lang/String;

    .line 10
    .line 11
    sub-int/2addr v0, v1

    .line 12
    add-int/lit8 v0, v0, 0x1

    .line 13
    .line 14
    invoke-direct {v3, v2, v1, v0}, Ljava/lang/String;-><init>([CII)V

    .line 15
    .line 16
    .line 17
    return-object v3

    .line 18
    :cond_0
    new-instance v0, Ljava/lang/String;

    .line 19
    .line 20
    iget v3, p0, Lbsh/AbstractCharStream;->bufsize:I

    .line 21
    .line 22
    sub-int/2addr v3, v1

    .line 23
    invoke-direct {v0, v2, v1, v3}, Ljava/lang/String;-><init>([CII)V

    .line 24
    .line 25
    .line 26
    new-instance v1, Ljava/lang/String;

    .line 27
    .line 28
    iget-object v2, p0, Lbsh/AbstractCharStream;->buffer:[C

    .line 29
    .line 30
    iget v3, p0, Lbsh/AbstractCharStream;->bufpos:I

    .line 31
    .line 32
    add-int/lit8 v3, v3, 0x1

    .line 33
    .line 34
    const/4 v4, 0x0

    .line 35
    invoke-direct {v1, v2, v4, v3}, Ljava/lang/String;-><init>([CII)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    return-object v0
.end method

.method public final getLine()I
    .locals 1

    .line 1
    iget v0, p0, Lbsh/AbstractCharStream;->m_nLineNo:I

    .line 2
    .line 3
    return v0
.end method

.method public getSuffix(I)[C
    .locals 5

    .line 1
    new-array v0, p1, [C

    .line 2
    .line 3
    iget v1, p0, Lbsh/AbstractCharStream;->bufpos:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x1

    .line 6
    .line 7
    iget-object v3, p0, Lbsh/AbstractCharStream;->buffer:[C

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-lt v2, p1, :cond_0

    .line 11
    .line 12
    sub-int/2addr v1, p1

    .line 13
    add-int/lit8 v1, v1, 0x1

    .line 14
    .line 15
    invoke-static {v3, v1, v0, v4, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 16
    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_0
    sub-int/2addr p1, v1

    .line 20
    add-int/lit8 p1, p1, -0x1

    .line 21
    .line 22
    iget v1, p0, Lbsh/AbstractCharStream;->bufsize:I

    .line 23
    .line 24
    sub-int/2addr v1, p1

    .line 25
    invoke-static {v3, v1, v0, v4, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lbsh/AbstractCharStream;->buffer:[C

    .line 29
    .line 30
    iget v2, p0, Lbsh/AbstractCharStream;->bufpos:I

    .line 31
    .line 32
    add-int/lit8 v2, v2, 0x1

    .line 33
    .line 34
    invoke-static {v1, v4, v0, p1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 35
    .line 36
    .line 37
    return-object v0
.end method

.method public final getTabSize()I
    .locals 1

    .line 1
    iget v0, p0, Lbsh/AbstractCharStream;->m_nTabSize:I

    .line 2
    .line 3
    return v0
.end method

.method public final internalAdjustBuffSize()V
    .locals 4

    .line 1
    iget v0, p0, Lbsh/AbstractCharStream;->bufsize:I

    .line 2
    .line 3
    div-int/lit8 v1, v0, 0x2

    .line 4
    .line 5
    iget v2, p0, Lbsh/AbstractCharStream;->available:I

    .line 6
    .line 7
    iget v3, p0, Lbsh/AbstractCharStream;->tokenBegin:I

    .line 8
    .line 9
    if-ne v2, v0, :cond_2

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    if-gez v3, :cond_0

    .line 13
    .line 14
    iput v0, p0, Lbsh/AbstractCharStream;->bufpos:I

    .line 15
    .line 16
    iput v0, p0, Lbsh/AbstractCharStream;->maxNextCharInd:I

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    if-le v3, v1, :cond_1

    .line 20
    .line 21
    iput v0, p0, Lbsh/AbstractCharStream;->bufpos:I

    .line 22
    .line 23
    iput v0, p0, Lbsh/AbstractCharStream;->maxNextCharInd:I

    .line 24
    .line 25
    iput v3, p0, Lbsh/AbstractCharStream;->available:I

    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    invoke-virtual {p0, v0}, Lbsh/AbstractCharStream;->expandBuff(Z)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_2
    if-le v2, v3, :cond_3

    .line 33
    .line 34
    iput v0, p0, Lbsh/AbstractCharStream;->available:I

    .line 35
    .line 36
    return-void

    .line 37
    :cond_3
    sub-int v0, v3, v2

    .line 38
    .line 39
    if-ge v0, v1, :cond_4

    .line 40
    .line 41
    const/4 v0, 0x1

    .line 42
    invoke-virtual {p0, v0}, Lbsh/AbstractCharStream;->expandBuff(Z)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_4
    iput v3, p0, Lbsh/AbstractCharStream;->available:I

    .line 47
    .line 48
    return-void
.end method

.method public final internalSetBufLineColumn(II)V
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/AbstractCharStream;->m_aBufLine:[I

    .line 2
    .line 3
    iget v1, p0, Lbsh/AbstractCharStream;->bufpos:I

    .line 4
    .line 5
    aput p1, v0, v1

    .line 6
    .line 7
    iget-object p1, p0, Lbsh/AbstractCharStream;->m_aBufColumn:[I

    .line 8
    .line 9
    aput p2, p1, v1

    .line 10
    .line 11
    return-void
.end method

.method public final internalUpdateLineColumn(C)V
    .locals 4

    .line 1
    iget v0, p0, Lbsh/AbstractCharStream;->m_nColumnNo:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    add-int/2addr v0, v1

    .line 5
    iput v0, p0, Lbsh/AbstractCharStream;->m_nColumnNo:I

    .line 6
    .line 7
    iget-boolean v0, p0, Lbsh/AbstractCharStream;->m_bPrevCharIsLF:Z

    .line 8
    .line 9
    const/16 v2, 0xa

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iput-boolean v3, p0, Lbsh/AbstractCharStream;->m_bPrevCharIsLF:Z

    .line 15
    .line 16
    iput v1, p0, Lbsh/AbstractCharStream;->m_nColumnNo:I

    .line 17
    .line 18
    iget v0, p0, Lbsh/AbstractCharStream;->m_nLineNo:I

    .line 19
    .line 20
    add-int/2addr v0, v1

    .line 21
    iput v0, p0, Lbsh/AbstractCharStream;->m_nLineNo:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-boolean v0, p0, Lbsh/AbstractCharStream;->m_bPrevCharIsCR:Z

    .line 25
    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    iput-boolean v3, p0, Lbsh/AbstractCharStream;->m_bPrevCharIsCR:Z

    .line 29
    .line 30
    if-ne p1, v2, :cond_1

    .line 31
    .line 32
    iput-boolean v1, p0, Lbsh/AbstractCharStream;->m_bPrevCharIsLF:Z

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    iput v1, p0, Lbsh/AbstractCharStream;->m_nColumnNo:I

    .line 36
    .line 37
    iget v0, p0, Lbsh/AbstractCharStream;->m_nLineNo:I

    .line 38
    .line 39
    add-int/2addr v0, v1

    .line 40
    iput v0, p0, Lbsh/AbstractCharStream;->m_nLineNo:I

    .line 41
    .line 42
    :cond_2
    :goto_0
    const/16 v0, 0x9

    .line 43
    .line 44
    if-eq p1, v0, :cond_5

    .line 45
    .line 46
    if-eq p1, v2, :cond_4

    .line 47
    .line 48
    const/16 v0, 0xd

    .line 49
    .line 50
    if-eq p1, v0, :cond_3

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_3
    iput-boolean v1, p0, Lbsh/AbstractCharStream;->m_bPrevCharIsCR:Z

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_4
    iput-boolean v1, p0, Lbsh/AbstractCharStream;->m_bPrevCharIsLF:Z

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_5
    iget p1, p0, Lbsh/AbstractCharStream;->m_nColumnNo:I

    .line 60
    .line 61
    sub-int/2addr p1, v1

    .line 62
    iput p1, p0, Lbsh/AbstractCharStream;->m_nColumnNo:I

    .line 63
    .line 64
    iget v0, p0, Lbsh/AbstractCharStream;->m_nTabSize:I

    .line 65
    .line 66
    rem-int v1, p1, v0

    .line 67
    .line 68
    sub-int/2addr v0, v1

    .line 69
    add-int/2addr v0, p1

    .line 70
    iput v0, p0, Lbsh/AbstractCharStream;->m_nColumnNo:I

    .line 71
    .line 72
    :goto_1
    iget p1, p0, Lbsh/AbstractCharStream;->m_nLineNo:I

    .line 73
    .line 74
    iget v0, p0, Lbsh/AbstractCharStream;->m_nColumnNo:I

    .line 75
    .line 76
    invoke-virtual {p0, p1, v0}, Lbsh/AbstractCharStream;->internalSetBufLineColumn(II)V

    .line 77
    .line 78
    .line 79
    return-void
.end method

.method public final isTrackLineColumn()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lbsh/AbstractCharStream;->m_bTrackLineColumn:Z

    .line 2
    .line 3
    return v0
.end method

.method public final reInit(III)V
    .locals 0

    .line 1
    iput p1, p0, Lbsh/AbstractCharStream;->m_nLineNo:I

    .line 2
    .line 3
    add-int/lit8 p2, p2, -0x1

    .line 4
    .line 5
    iput p2, p0, Lbsh/AbstractCharStream;->m_nColumnNo:I

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    iput-boolean p1, p0, Lbsh/AbstractCharStream;->m_bPrevCharIsCR:Z

    .line 9
    .line 10
    iput-boolean p1, p0, Lbsh/AbstractCharStream;->m_bPrevCharIsLF:Z

    .line 11
    .line 12
    iget-object p2, p0, Lbsh/AbstractCharStream;->buffer:[C

    .line 13
    .line 14
    if-eqz p2, :cond_0

    .line 15
    .line 16
    array-length p2, p2

    .line 17
    if-eq p3, p2, :cond_1

    .line 18
    .line 19
    :cond_0
    iput p3, p0, Lbsh/AbstractCharStream;->bufsize:I

    .line 20
    .line 21
    iput p3, p0, Lbsh/AbstractCharStream;->available:I

    .line 22
    .line 23
    new-array p2, p3, [C

    .line 24
    .line 25
    iput-object p2, p0, Lbsh/AbstractCharStream;->buffer:[C

    .line 26
    .line 27
    new-array p2, p3, [I

    .line 28
    .line 29
    iput-object p2, p0, Lbsh/AbstractCharStream;->m_aBufLine:[I

    .line 30
    .line 31
    new-array p2, p3, [I

    .line 32
    .line 33
    iput-object p2, p0, Lbsh/AbstractCharStream;->m_aBufColumn:[I

    .line 34
    .line 35
    :cond_1
    iput p1, p0, Lbsh/AbstractCharStream;->maxNextCharInd:I

    .line 36
    .line 37
    iput p1, p0, Lbsh/AbstractCharStream;->inBuf:I

    .line 38
    .line 39
    iput p1, p0, Lbsh/AbstractCharStream;->tokenBegin:I

    .line 40
    .line 41
    const/4 p1, -0x1

    .line 42
    iput p1, p0, Lbsh/AbstractCharStream;->bufpos:I

    .line 43
    .line 44
    return-void
.end method

.method public readChar()C
    .locals 2

    .line 1
    iget v0, p0, Lbsh/AbstractCharStream;->inBuf:I

    .line 2
    .line 3
    if-lez v0, :cond_1

    .line 4
    .line 5
    add-int/lit8 v0, v0, -0x1

    .line 6
    .line 7
    iput v0, p0, Lbsh/AbstractCharStream;->inBuf:I

    .line 8
    .line 9
    iget v0, p0, Lbsh/AbstractCharStream;->bufpos:I

    .line 10
    .line 11
    add-int/lit8 v0, v0, 0x1

    .line 12
    .line 13
    iput v0, p0, Lbsh/AbstractCharStream;->bufpos:I

    .line 14
    .line 15
    iget v1, p0, Lbsh/AbstractCharStream;->bufsize:I

    .line 16
    .line 17
    if-ne v0, v1, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    iput v0, p0, Lbsh/AbstractCharStream;->bufpos:I

    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, Lbsh/AbstractCharStream;->buffer:[C

    .line 23
    .line 24
    iget v1, p0, Lbsh/AbstractCharStream;->bufpos:I

    .line 25
    .line 26
    aget-char v0, v0, v1

    .line 27
    .line 28
    return v0

    .line 29
    :cond_1
    iget v0, p0, Lbsh/AbstractCharStream;->bufpos:I

    .line 30
    .line 31
    add-int/lit8 v0, v0, 0x1

    .line 32
    .line 33
    iput v0, p0, Lbsh/AbstractCharStream;->bufpos:I

    .line 34
    .line 35
    iget v1, p0, Lbsh/AbstractCharStream;->maxNextCharInd:I

    .line 36
    .line 37
    if-lt v0, v1, :cond_2

    .line 38
    .line 39
    invoke-virtual {p0}, Lbsh/AbstractCharStream;->fillBuff()V

    .line 40
    .line 41
    .line 42
    :cond_2
    iget-object v0, p0, Lbsh/AbstractCharStream;->buffer:[C

    .line 43
    .line 44
    iget v1, p0, Lbsh/AbstractCharStream;->bufpos:I

    .line 45
    .line 46
    aget-char v0, v0, v1

    .line 47
    .line 48
    iget-boolean v1, p0, Lbsh/AbstractCharStream;->m_bTrackLineColumn:Z

    .line 49
    .line 50
    if-eqz v1, :cond_3

    .line 51
    .line 52
    invoke-virtual {p0, v0}, Lbsh/AbstractCharStream;->internalUpdateLineColumn(C)V

    .line 53
    .line 54
    .line 55
    :cond_3
    return v0
.end method

.method public final setTabSize(I)V
    .locals 0

    .line 1
    iput p1, p0, Lbsh/AbstractCharStream;->m_nTabSize:I

    .line 2
    .line 3
    return-void
.end method

.method public final setTrackLineColumn(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lbsh/AbstractCharStream;->m_bTrackLineColumn:Z

    .line 2
    .line 3
    return-void
.end method

.method public abstract streamClose()V
.end method

.method public abstract streamRead([CII)I
.end method
