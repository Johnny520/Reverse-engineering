.class public final Lorg/luckypray/dexkit/util/MUtf8Util;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static countBytes(Ljava/lang/String;Z)J
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-wide/16 v1, 0x0

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    :goto_0
    if-ge v3, v0, :cond_4

    .line 9
    .line 10
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 11
    .line 12
    .line 13
    move-result v4

    .line 14
    if-eqz v4, :cond_0

    .line 15
    .line 16
    const/16 v5, 0x7f

    .line 17
    .line 18
    if-gt v4, v5, :cond_0

    .line 19
    .line 20
    const-wide/16 v4, 0x1

    .line 21
    .line 22
    :goto_1
    add-long/2addr v1, v4

    .line 23
    goto :goto_2

    .line 24
    :cond_0
    const/16 v5, 0x7ff

    .line 25
    .line 26
    if-gt v4, v5, :cond_1

    .line 27
    .line 28
    const-wide/16 v4, 0x2

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    const-wide/16 v4, 0x3

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :goto_2
    if-eqz p1, :cond_3

    .line 35
    .line 36
    const-wide/32 v4, 0xffff

    .line 37
    .line 38
    .line 39
    cmp-long v4, v1, v4

    .line 40
    .line 41
    if-gtz v4, :cond_2

    .line 42
    .line 43
    goto :goto_3

    .line 44
    :cond_2
    new-instance p0, Ljava/io/UTFDataFormatException;

    .line 45
    .line 46
    const-string p1, "String more than 65535 UTF bytes long"

    .line 47
    .line 48
    invoke-direct {p0, p1}, Ljava/io/UTFDataFormatException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p0

    .line 52
    :cond_3
    :goto_3
    add-int/lit8 v3, v3, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_4
    return-wide v1
.end method

.method public static decode(Ljava/nio/ByteBuffer;)Ljava/lang/String;
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    :goto_0
    invoke-virtual {p0}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :cond_0
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    and-int/lit16 v1, v1, 0xff

    .line 22
    .line 23
    int-to-char v1, v1

    .line 24
    if-nez v1, :cond_1

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :cond_1
    const/16 v2, 0x80

    .line 32
    .line 33
    if-ge v1, v2, :cond_2

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    and-int/lit16 v3, v1, 0xe0

    .line 40
    .line 41
    const/16 v4, 0xc0

    .line 42
    .line 43
    if-ne v3, v4, :cond_4

    .line 44
    .line 45
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    and-int/lit16 v4, v3, 0xc0

    .line 50
    .line 51
    if-ne v4, v2, :cond_3

    .line 52
    .line 53
    and-int/lit8 v1, v1, 0x1f

    .line 54
    .line 55
    shl-int/lit8 v1, v1, 0x6

    .line 56
    .line 57
    and-int/lit8 v2, v3, 0x3f

    .line 58
    .line 59
    or-int/2addr v1, v2

    .line 60
    int-to-char v1, v1

    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_3
    new-instance p0, Ljava/io/UTFDataFormatException;

    .line 66
    .line 67
    const-string v0, "bad second byte"

    .line 68
    .line 69
    invoke-direct {p0, v0}, Ljava/io/UTFDataFormatException;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw p0

    .line 73
    :cond_4
    and-int/lit16 v3, v1, 0xf0

    .line 74
    .line 75
    const/16 v4, 0xe0

    .line 76
    .line 77
    if-ne v3, v4, :cond_6

    .line 78
    .line 79
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    and-int/lit16 v5, v3, 0xc0

    .line 88
    .line 89
    if-ne v5, v2, :cond_5

    .line 90
    .line 91
    and-int/lit16 v5, v4, 0xc0

    .line 92
    .line 93
    if-ne v5, v2, :cond_5

    .line 94
    .line 95
    and-int/lit8 v1, v1, 0xf

    .line 96
    .line 97
    shl-int/lit8 v1, v1, 0xc

    .line 98
    .line 99
    and-int/lit8 v2, v3, 0x3f

    .line 100
    .line 101
    shl-int/lit8 v2, v2, 0x6

    .line 102
    .line 103
    or-int/2addr v1, v2

    .line 104
    and-int/lit8 v2, v4, 0x3f

    .line 105
    .line 106
    or-int/2addr v1, v2

    .line 107
    int-to-char v1, v1

    .line 108
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_5
    new-instance p0, Ljava/io/UTFDataFormatException;

    .line 113
    .line 114
    const-string v0, "bad second or third byte"

    .line 115
    .line 116
    invoke-direct {p0, v0}, Ljava/io/UTFDataFormatException;-><init>(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    throw p0

    .line 120
    :cond_6
    new-instance p0, Ljava/io/UTFDataFormatException;

    .line 121
    .line 122
    const-string v0, "bad byte"

    .line 123
    .line 124
    invoke-direct {p0, v0}, Ljava/io/UTFDataFormatException;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    throw p0
.end method

.method public static encode([BILjava/lang/String;)V
    .locals 6

    .line 1
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-ge v1, v0, :cond_2

    .line 7
    .line 8
    invoke-virtual {p2, v1}, Ljava/lang/String;->charAt(I)C

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    const/16 v3, 0x7f

    .line 15
    .line 16
    if-gt v2, v3, :cond_0

    .line 17
    .line 18
    add-int/lit8 v3, p1, 0x1

    .line 19
    .line 20
    int-to-byte v2, v2

    .line 21
    aput-byte v2, p0, p1

    .line 22
    .line 23
    move p1, v3

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    const/16 v3, 0x7ff

    .line 26
    .line 27
    if-gt v2, v3, :cond_1

    .line 28
    .line 29
    add-int/lit8 v3, p1, 0x1

    .line 30
    .line 31
    shr-int/lit8 v4, v2, 0x6

    .line 32
    .line 33
    and-int/lit8 v4, v4, 0x1f

    .line 34
    .line 35
    or-int/lit16 v4, v4, 0xc0

    .line 36
    .line 37
    int-to-byte v4, v4

    .line 38
    aput-byte v4, p0, p1

    .line 39
    .line 40
    add-int/lit8 p1, p1, 0x2

    .line 41
    .line 42
    and-int/lit8 v2, v2, 0x3f

    .line 43
    .line 44
    or-int/lit16 v2, v2, 0x80

    .line 45
    .line 46
    int-to-byte v2, v2

    .line 47
    aput-byte v2, p0, v3

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    add-int/lit8 v3, p1, 0x1

    .line 51
    .line 52
    shr-int/lit8 v4, v2, 0xc

    .line 53
    .line 54
    and-int/lit8 v4, v4, 0xf

    .line 55
    .line 56
    or-int/lit16 v4, v4, 0xe0

    .line 57
    .line 58
    int-to-byte v4, v4

    .line 59
    aput-byte v4, p0, p1

    .line 60
    .line 61
    add-int/lit8 v4, p1, 0x2

    .line 62
    .line 63
    shr-int/lit8 v5, v2, 0x6

    .line 64
    .line 65
    and-int/lit8 v5, v5, 0x3f

    .line 66
    .line 67
    or-int/lit16 v5, v5, 0x80

    .line 68
    .line 69
    int-to-byte v5, v5

    .line 70
    aput-byte v5, p0, v3

    .line 71
    .line 72
    add-int/lit8 p1, p1, 0x3

    .line 73
    .line 74
    and-int/lit8 v2, v2, 0x3f

    .line 75
    .line 76
    or-int/lit16 v2, v2, 0x80

    .line 77
    .line 78
    int-to-byte v2, v2

    .line 79
    aput-byte v2, p0, v4

    .line 80
    .line 81
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_2
    return-void
.end method

.method public static encode(Ljava/lang/String;)[B
    .locals 2

    const/4 v0, 0x1

    .line 85
    invoke-static {p0, v0}, Lorg/luckypray/dexkit/util/MUtf8Util;->countBytes(Ljava/lang/String;Z)J

    move-result-wide v0

    long-to-int v0, v0

    .line 86
    new-array v0, v0, [B

    const/4 v1, 0x0

    .line 87
    invoke-static {v0, v1, p0}, Lorg/luckypray/dexkit/util/MUtf8Util;->encode([BILjava/lang/String;)V

    return-object v0
.end method
