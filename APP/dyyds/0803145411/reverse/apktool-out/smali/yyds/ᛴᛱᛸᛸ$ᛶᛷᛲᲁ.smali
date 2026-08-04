.class final Lyyds/ᛴᛱᛸᛸ$ᛶᛷᛲᲁ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lyyds/ᛴᛱᛸᛸ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u16f6\u16f7\u16f2\u1c81"
.end annotation


# instance fields
.field private final ᛲᲈᲁ:[B

.field private ᛵᛸᛸᛷ:I


# direct methods
.method public constructor <init>([B)V
    .locals 2

    .line 1
    const-wide v0, -0x20eb8e68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lyyds/ᛴᛱᛸᛸ$ᛶᛷᛲᲁ;->ᛲᲈᲁ:[B

    .line 13
    .line 14
    return-void
.end method

.method private final ᛲᛴᛳᛲ()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Lyyds/ᛴᛱᛸᛸ$ᛶᛷᛲᲁ;->ᲀᛲᛳᲀ()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    shl-int/lit8 v0, v0, 0x18

    .line 6
    .line 7
    invoke-virtual {p0}, Lyyds/ᛴᛱᛸᛸ$ᛶᛷᛲᲁ;->ᲀᛲᛳᲀ()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    shl-int/lit8 v1, v1, 0x10

    .line 12
    .line 13
    or-int/2addr v0, v1

    .line 14
    invoke-virtual {p0}, Lyyds/ᛴᛱᛸᛸ$ᛶᛷᛲᲁ;->ᲀᛲᛳᲀ()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    shl-int/lit8 v1, v1, 0x8

    .line 19
    .line 20
    or-int/2addr v0, v1

    .line 21
    invoke-virtual {p0}, Lyyds/ᛴᛱᛸᛸ$ᛶᛷᛲᲁ;->ᲀᛲᛳᲀ()I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    or-int/2addr p0, v0

    .line 26
    return p0
.end method

.method private final ᛲᲈᲁ([B)Ljava/lang/String;
    .locals 1

    .line 1
    :try_start_0
    sget-object p0, Lyyds/ᛲᛵᛴᛴ;->ᛲᲈᲁ:Ljava/nio/charset/Charset;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/nio/charset/Charset;->newDecoder()Ljava/nio/charset/CharsetDecoder;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    sget-object v0, Ljava/nio/charset/CodingErrorAction;->REPORT:Ljava/nio/charset/CodingErrorAction;

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Ljava/nio/charset/CharsetDecoder;->onMalformedInput(Ljava/nio/charset/CodingErrorAction;)Ljava/nio/charset/CharsetDecoder;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0, v0}, Ljava/nio/charset/CharsetDecoder;->onUnmappableCharacter(Ljava/nio/charset/CodingErrorAction;)Ljava/nio/charset/CharsetDecoder;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p0, p1}, Ljava/nio/charset/CharsetDecoder;->decode(Ljava/nio/ByteBuffer;)Ljava/nio/CharBuffer;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0}, Ljava/nio/CharBuffer;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    return-object p0

    .line 30
    :catch_0
    sget-object p0, Lyyds/ᛴᛱᛸᛸ;->ᛲᲈᲁ:Lyyds/ᛴᛱᛸᛸ;

    .line 31
    .line 32
    invoke-static {p0}, Lyyds/ᛴᛱᛸᛸ;->ᛲᲈᲁ(Lyyds/ᛴᛱᛸᛸ;)Ljava/lang/SecurityException;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    throw p0
.end method

.method private final ᛶᛷᛲᲁ()J
    .locals 5

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    :goto_0
    const/16 v3, 0x8

    .line 5
    .line 6
    if-ge v2, v3, :cond_0

    .line 7
    .line 8
    shl-long/2addr v0, v3

    .line 9
    invoke-virtual {p0}, Lyyds/ᛴᛱᛸᛸ$ᛶᛷᛲᲁ;->ᲀᛲᛳᲀ()I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    int-to-long v3, v3

    .line 14
    or-long/2addr v0, v3

    .line 15
    add-int/lit8 v2, v2, 0x1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    return-wide v0
.end method

.method private final ᲇᲇᲇᛱ()[B
    .locals 4

    .line 1
    invoke-direct {p0}, Lyyds/ᛴᛱᛸᛸ$ᛶᛷᛲᲁ;->ᛲᛴᛳᛲ()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-ltz v0, :cond_0

    .line 6
    .line 7
    const/high16 v1, 0x200000

    .line 8
    .line 9
    if-gt v0, v1, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lyyds/ᛴᛱᛸᛸ$ᛶᛷᛲᲁ;->ᛲᲈᲁ:[B

    .line 12
    .line 13
    array-length v2, v1

    .line 14
    iget v3, p0, Lyyds/ᛴᛱᛸᛸ$ᛶᛷᛲᲁ;->ᛵᛸᛸᛷ:I

    .line 15
    .line 16
    sub-int/2addr v2, v3

    .line 17
    if-gt v0, v2, :cond_0

    .line 18
    .line 19
    add-int v2, v3, v0

    .line 20
    .line 21
    invoke-static {v1, v3, v2}, Lyyds/ᲀᲀᛷᛸ;->ᲈᲀᛲᲀ([BII)[B

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    iget v2, p0, Lyyds/ᛴᛱᛸᛸ$ᛶᛷᛲᲁ;->ᛵᛸᛸᛷ:I

    .line 26
    .line 27
    add-int/2addr v2, v0

    .line 28
    iput v2, p0, Lyyds/ᛴᛱᛸᛸ$ᛶᛷᛲᲁ;->ᛵᛸᛸᛷ:I

    .line 29
    .line 30
    return-object v1

    .line 31
    :cond_0
    sget-object p0, Lyyds/ᛴᛱᛸᛸ;->ᛲᲈᲁ:Lyyds/ᛴᛱᛸᛸ;

    .line 32
    .line 33
    invoke-static {p0}, Lyyds/ᛴᛱᛸᛸ;->ᛲᲈᲁ(Lyyds/ᛴᛱᛸᛸ;)Ljava/lang/SecurityException;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    throw p0
.end method

.method private final ᲇᲈᛵᛷ()I
    .locals 1

    .line 1
    invoke-direct {p0}, Lyyds/ᛴᛱᛸᛸ$ᛶᛷᛲᲁ;->ᛲᛴᛳᛲ()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-ltz p0, :cond_0

    .line 6
    .line 7
    const/16 v0, 0x2711

    .line 8
    .line 9
    if-ge p0, v0, :cond_0

    .line 10
    .line 11
    return p0

    .line 12
    :cond_0
    sget-object p0, Lyyds/ᛴᛱᛸᛸ;->ᛲᲈᲁ:Lyyds/ᛴᛱᛸᛸ;

    .line 13
    .line 14
    invoke-static {p0}, Lyyds/ᛴᛱᛸᛸ;->ᛲᲈᲁ(Lyyds/ᛴᛱᛸᛸ;)Ljava/lang/SecurityException;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    throw p0
.end method


# virtual methods
.method public final ᛱᲈᲁ(I)Ljava/lang/Object;
    .locals 5

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    if-gt p1, v0, :cond_2

    .line 4
    .line 5
    invoke-virtual {p0}, Lyyds/ᛴᛱᛸᛸ$ᛶᛷᛲᲁ;->ᲀᛲᛳᲀ()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    sget-object p0, Lyyds/ᛴᛱᛸᛸ;->ᛲᲈᲁ:Lyyds/ᛴᛱᛸᛸ;

    .line 14
    .line 15
    invoke-static {p0}, Lyyds/ᛴᛱᛸᛸ;->ᛲᲈᲁ(Lyyds/ᛴᛱᛸᛸ;)Ljava/lang/SecurityException;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    throw p0

    .line 20
    :pswitch_0
    new-instance v0, Lkotlin/Pair;

    .line 21
    .line 22
    add-int/lit8 p1, p1, 0x1

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Lyyds/ᛴᛱᛸᛸ$ᛶᛷᛲᲁ;->ᛱᲈᲁ(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {p0, p1}, Lyyds/ᛴᛱᛸᛸ$ᛶᛷᛲᲁ;->ᛱᲈᲁ(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-direct {v0, v1, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    return-object v0

    .line 36
    :pswitch_1
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 37
    .line 38
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-direct {p0}, Lyyds/ᛴᛱᛸᛸ$ᛶᛷᛲᲁ;->ᲇᲈᛵᛷ()I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    :goto_0
    if-ge v1, v2, :cond_0

    .line 46
    .line 47
    add-int/lit8 v3, p1, 0x1

    .line 48
    .line 49
    invoke-virtual {p0, v3}, Lyyds/ᛴᛱᛸᛸ$ᛶᛷᛲᲁ;->ᛱᲈᲁ(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    invoke-virtual {p0, v3}, Lyyds/ᛴᛱᛸᛸ$ᛶᛷᛲᲁ;->ᛱᲈᲁ(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    add-int/lit8 v1, v1, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    return-object v0

    .line 64
    :pswitch_2
    invoke-direct {p0}, Lyyds/ᛴᛱᛸᛸ$ᛶᛷᛲᲁ;->ᲇᲈᛵᛷ()I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    new-instance v2, Ljava/util/ArrayList;

    .line 69
    .line 70
    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 71
    .line 72
    .line 73
    :goto_1
    if-ge v1, v0, :cond_1

    .line 74
    .line 75
    add-int/lit8 v3, p1, 0x1

    .line 76
    .line 77
    invoke-virtual {p0, v3}, Lyyds/ᛴᛱᛸᛸ$ᛶᛷᛲᲁ;->ᛱᲈᲁ(I)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    add-int/lit8 v1, v1, 0x1

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_1
    return-object v2

    .line 88
    :pswitch_3
    invoke-direct {p0}, Lyyds/ᛴᛱᛸᛸ$ᛶᛷᛲᲁ;->ᲇᲇᲇᛱ()[B

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    return-object p0

    .line 93
    :pswitch_4
    invoke-direct {p0}, Lyyds/ᛴᛱᛸᛸ$ᛶᛷᛲᲁ;->ᲇᲇᲇᛱ()[B

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-direct {p0, p1}, Lyyds/ᛴᛱᛸᛸ$ᛶᛷᛲᲁ;->ᛲᲈᲁ([B)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    return-object p0

    .line 102
    :pswitch_5
    invoke-direct {p0}, Lyyds/ᛴᛱᛸᛸ$ᛶᛷᛲᲁ;->ᛶᛷᛲᲁ()J

    .line 103
    .line 104
    .line 105
    move-result-wide p0

    .line 106
    invoke-static {p0, p1}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 107
    .line 108
    .line 109
    move-result-wide p0

    .line 110
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    return-object p0

    .line 115
    :pswitch_6
    invoke-direct {p0}, Lyyds/ᛴᛱᛸᛸ$ᛶᛷᛲᲁ;->ᛶᛷᛲᲁ()J

    .line 116
    .line 117
    .line 118
    move-result-wide p0

    .line 119
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    return-object p0

    .line 124
    :pswitch_7
    invoke-direct {p0}, Lyyds/ᛴᛱᛸᛸ$ᛶᛷᛲᲁ;->ᛲᛴᛳᛲ()I

    .line 125
    .line 126
    .line 127
    move-result p0

    .line 128
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    return-object p0

    .line 133
    :pswitch_8
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 134
    .line 135
    return-object p0

    .line 136
    :pswitch_9
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 137
    .line 138
    return-object p0

    .line 139
    :pswitch_a
    const/4 p0, 0x0

    .line 140
    return-object p0

    .line 141
    :cond_2
    sget-object p0, Lyyds/ᛴᛱᛸᛸ;->ᛲᲈᲁ:Lyyds/ᛴᛱᛸᛸ;

    .line 142
    .line 143
    invoke-static {p0}, Lyyds/ᛴᛱᛸᛸ;->ᛲᲈᲁ(Lyyds/ᛴᛱᛸᛸ;)Ljava/lang/SecurityException;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    throw p0

    .line 148
    nop

    .line 149
    :pswitch_data_0
    .packed-switch 0x0
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

.method public final ᛵᛸᛸᛷ()V
    .locals 1

    .line 1
    iget v0, p0, Lyyds/ᛴᛱᛸᛸ$ᛶᛷᛲᲁ;->ᛵᛸᛸᛷ:I

    .line 2
    .line 3
    iget-object p0, p0, Lyyds/ᛴᛱᛸᛸ$ᛶᛷᛲᲁ;->ᛲᲈᲁ:[B

    .line 4
    .line 5
    array-length p0, p0

    .line 6
    if-ne v0, p0, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    sget-object p0, Lyyds/ᛴᛱᛸᛸ;->ᛲᲈᲁ:Lyyds/ᛴᛱᛸᛸ;

    .line 10
    .line 11
    invoke-static {p0}, Lyyds/ᛴᛱᛸᛸ;->ᛲᲈᲁ(Lyyds/ᛴᛱᛸᛸ;)Ljava/lang/SecurityException;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    throw p0
.end method

.method public final ᲀᛲᛳᲀ()I
    .locals 3

    .line 1
    iget v0, p0, Lyyds/ᛴᛱᛸᛸ$ᛶᛷᛲᲁ;->ᛵᛸᛸᛷ:I

    .line 2
    .line 3
    iget-object v1, p0, Lyyds/ᛴᛱᛸᛸ$ᛶᛷᛲᲁ;->ᛲᲈᲁ:[B

    .line 4
    .line 5
    array-length v2, v1

    .line 6
    if-ge v0, v2, :cond_0

    .line 7
    .line 8
    add-int/lit8 v2, v0, 0x1

    .line 9
    .line 10
    iput v2, p0, Lyyds/ᛴᛱᛸᛸ$ᛶᛷᛲᲁ;->ᛵᛸᛸᛷ:I

    .line 11
    .line 12
    aget-byte p0, v1, v0

    .line 13
    .line 14
    and-int/lit16 p0, p0, 0xff

    .line 15
    .line 16
    return p0

    .line 17
    :cond_0
    sget-object p0, Lyyds/ᛴᛱᛸᛸ;->ᛲᲈᲁ:Lyyds/ᛴᛱᛸᛸ;

    .line 18
    .line 19
    invoke-static {p0}, Lyyds/ᛴᛱᛸᛸ;->ᛲᲈᲁ(Lyyds/ᛴᛱᛸᛸ;)Ljava/lang/SecurityException;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    throw p0
.end method
