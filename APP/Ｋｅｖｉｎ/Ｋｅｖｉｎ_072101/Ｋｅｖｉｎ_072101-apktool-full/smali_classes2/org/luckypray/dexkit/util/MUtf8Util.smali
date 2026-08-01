.class public final Lorg/luckypray/dexkit/util/MUtf8Util;
.super Ljava/lang/Object;
.source "MUtf8Util.java"


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static countBytes(Ljava/lang/String;Z)J
    .locals 7
    .param p0, "s"    # Ljava/lang/String;
    .param p1, "shortLength"    # Z
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/UTFDataFormatException;
        }
    .end annotation

    .line 88
    const-wide/16 v0, 0x0

    .line 89
    .local v0, "result":J
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    .line 90
    .local v2, "length":I
    const/4 v3, 0x0

    .local v3, "i":I
    :goto_0
    if-ge v3, v2, :cond_4

    .line 91
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    .line 92
    .local v4, "ch":C
    if-eqz v4, :cond_0

    const/16 v5, 0x7f

    if-gt v4, v5, :cond_0

    .line 93
    const-wide/16 v5, 0x1

    add-long/2addr v0, v5

    goto :goto_1

    .line 94
    :cond_0
    const/16 v5, 0x7ff

    if-gt v4, v5, :cond_1

    .line 95
    const-wide/16 v5, 0x2

    add-long/2addr v0, v5

    goto :goto_1

    .line 97
    :cond_1
    const-wide/16 v5, 0x3

    add-long/2addr v0, v5

    .line 99
    :goto_1
    if-eqz p1, :cond_3

    const-wide/32 v5, 0xffff

    cmp-long v5, v0, v5

    if-gtz v5, :cond_2

    goto :goto_2

    .line 100
    :cond_2
    new-instance v5, Ljava/io/UTFDataFormatException;

    const-string v6, "String more than 65535 UTF bytes long"

    invoke-direct {v5, v6}, Ljava/io/UTFDataFormatException;-><init>(Ljava/lang/String;)V

    throw v5

    .line 90
    .end local v4    # "ch":C
    :cond_3
    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 103
    .end local v3    # "i":I
    :cond_4
    return-wide v0
.end method

.method public static decode(Ljava/nio/ByteBuffer;)Ljava/lang/String;
    .locals 6
    .param p0, "in"    # Ljava/nio/ByteBuffer;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/UTFDataFormatException;
        }
    .end annotation

    .line 55
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 57
    .local v0, "sb":Ljava/lang/StringBuilder;
    :goto_0
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v1

    if-nez v1, :cond_0

    .line 58
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    return-object v1

    .line 60
    :cond_0
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    move-result v1

    and-int/lit16 v1, v1, 0xff

    int-to-char v1, v1

    .line 61
    .local v1, "a":C
    if-nez v1, :cond_1

    .line 62
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    return-object v2

    .line 64
    :cond_1
    const/16 v2, 0x80

    if-ge v1, v2, :cond_2

    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 66
    :cond_2
    and-int/lit16 v3, v1, 0xe0

    const/16 v4, 0xc0

    if-ne v3, v4, :cond_4

    .line 67
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    and-int/lit16 v3, v3, 0xff

    .line 68
    .local v3, "b":I
    and-int/lit16 v4, v3, 0xc0

    if-ne v4, v2, :cond_3

    .line 71
    and-int/lit8 v2, v1, 0x1f

    shl-int/lit8 v2, v2, 0x6

    and-int/lit8 v4, v3, 0x3f

    or-int/2addr v2, v4

    int-to-char v2, v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 72
    .end local v3    # "b":I
    goto :goto_1

    .line 69
    .restart local v3    # "b":I
    :cond_3
    new-instance v2, Ljava/io/UTFDataFormatException;

    const-string v4, "bad second byte"

    invoke-direct {v2, v4}, Ljava/io/UTFDataFormatException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 72
    .end local v3    # "b":I
    :cond_4
    and-int/lit16 v3, v1, 0xf0

    const/16 v4, 0xe0

    if-ne v3, v4, :cond_6

    .line 73
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    and-int/lit16 v3, v3, 0xff

    .line 74
    .restart local v3    # "b":I
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    move-result v4

    and-int/lit16 v4, v4, 0xff

    .line 75
    .local v4, "c":I
    and-int/lit16 v5, v3, 0xc0

    if-ne v5, v2, :cond_5

    and-int/lit16 v5, v4, 0xc0

    if-ne v5, v2, :cond_5

    .line 78
    and-int/lit8 v2, v1, 0xf

    shl-int/lit8 v2, v2, 0xc

    and-int/lit8 v5, v3, 0x3f

    shl-int/lit8 v5, v5, 0x6

    or-int/2addr v2, v5

    and-int/lit8 v5, v4, 0x3f

    or-int/2addr v2, v5

    int-to-char v2, v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 79
    .end local v3    # "b":I
    .end local v4    # "c":I
    nop

    .line 82
    .end local v1    # "a":C
    :goto_1
    goto :goto_0

    .line 76
    .restart local v1    # "a":C
    .restart local v3    # "b":I
    .restart local v4    # "c":I
    :cond_5
    new-instance v2, Ljava/io/UTFDataFormatException;

    const-string v5, "bad second or third byte"

    invoke-direct {v2, v5}, Ljava/io/UTFDataFormatException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 80
    .end local v3    # "b":I
    .end local v4    # "c":I
    :cond_6
    new-instance v2, Ljava/io/UTFDataFormatException;

    const-string v3, "bad byte"

    invoke-direct {v2, v3}, Ljava/io/UTFDataFormatException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public static encode([BILjava/lang/String;)V
    .locals 5
    .param p0, "dst"    # [B
    .param p1, "offset"    # I
    .param p2, "s"    # Ljava/lang/String;

    .line 110
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    .line 111
    .local v0, "length":I
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    if-ge v1, v0, :cond_2

    .line 112
    invoke-virtual {p2, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    .line 113
    .local v2, "ch":C
    if-eqz v2, :cond_0

    const/16 v3, 0x7f

    if-gt v2, v3, :cond_0

    .line 114
    add-int/lit8 v3, p1, 0x1

    .end local p1    # "offset":I
    .local v3, "offset":I
    int-to-byte v4, v2

    aput-byte v4, p0, p1

    move p1, v3

    goto :goto_1

    .line 115
    .end local v3    # "offset":I
    .restart local p1    # "offset":I
    :cond_0
    const/16 v3, 0x7ff

    if-gt v2, v3, :cond_1

    .line 116
    add-int/lit8 v3, p1, 0x1

    .end local p1    # "offset":I
    .restart local v3    # "offset":I
    shr-int/lit8 v4, v2, 0x6

    and-int/lit8 v4, v4, 0x1f

    or-int/lit16 v4, v4, 0xc0

    int-to-byte v4, v4

    aput-byte v4, p0, p1

    .line 117
    add-int/lit8 p1, v3, 0x1

    .end local v3    # "offset":I
    .restart local p1    # "offset":I
    and-int/lit8 v4, v2, 0x3f

    or-int/lit16 v4, v4, 0x80

    int-to-byte v4, v4

    aput-byte v4, p0, v3

    goto :goto_1

    .line 119
    :cond_1
    add-int/lit8 v3, p1, 0x1

    .end local p1    # "offset":I
    .restart local v3    # "offset":I
    shr-int/lit8 v4, v2, 0xc

    and-int/lit8 v4, v4, 0xf

    or-int/lit16 v4, v4, 0xe0

    int-to-byte v4, v4

    aput-byte v4, p0, p1

    .line 120
    add-int/lit8 p1, v3, 0x1

    .end local v3    # "offset":I
    .restart local p1    # "offset":I
    shr-int/lit8 v4, v2, 0x6

    and-int/lit8 v4, v4, 0x3f

    or-int/lit16 v4, v4, 0x80

    int-to-byte v4, v4

    aput-byte v4, p0, v3

    .line 121
    add-int/lit8 v3, p1, 0x1

    .end local p1    # "offset":I
    .restart local v3    # "offset":I
    and-int/lit8 v4, v2, 0x3f

    or-int/lit16 v4, v4, 0x80

    int-to-byte v4, v4

    aput-byte v4, p0, p1

    move p1, v3

    .line 111
    .end local v2    # "ch":C
    .end local v3    # "offset":I
    .restart local p1    # "offset":I
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 124
    .end local v1    # "i":I
    :cond_2
    return-void
.end method

.method public static encode(Ljava/lang/String;)[B
    .locals 3
    .param p0, "s"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/UTFDataFormatException;
        }
    .end annotation

    .line 129
    const/4 v0, 0x1

    invoke-static {p0, v0}, Lorg/luckypray/dexkit/util/MUtf8Util;->countBytes(Ljava/lang/String;Z)J

    move-result-wide v0

    long-to-int v0, v0

    .line 130
    .local v0, "utfCount":I
    new-array v1, v0, [B

    .line 131
    .local v1, "result":[B
    const/4 v2, 0x0

    invoke-static {v1, v2, p0}, Lorg/luckypray/dexkit/util/MUtf8Util;->encode([BILjava/lang/String;)V

    .line 132
    return-object v1
.end method
