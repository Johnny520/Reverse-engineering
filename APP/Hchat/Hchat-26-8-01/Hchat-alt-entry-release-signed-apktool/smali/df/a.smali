.class public final Ldf/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:J

.field public final b:Ljava/nio/ByteBuffer;

.field public final c:Z

.field public final d:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(J[BZ)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Ldf/a;->d:Ljava/util/HashMap;

    .line 10
    .line 11
    iput-wide p1, p0, Ldf/a;->a:J

    .line 12
    .line 13
    invoke-static {p3}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, Ldf/a;->b:Ljava/nio/ByteBuffer;

    .line 18
    .line 19
    sget-object p2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 20
    .line 21
    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 22
    .line 23
    .line 24
    iput-boolean p4, p0, Ldf/a;->c:Z

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final a(I)Ljava/lang/String;
    .locals 9

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Ldf/a;->d:Ljava/util/HashMap;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/String;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    mul-int/lit8 v0, p1, 0x4

    .line 17
    .line 18
    iget-object v2, p0, Ldf/a;->b:Ljava/nio/ByteBuffer;

    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/nio/Buffer;->limit()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    add-int/lit8 v3, v3, -0x3

    .line 25
    .line 26
    const-string v4, "\u27e8STRING_DECODE_ERROR\u27e9"

    .line 27
    .line 28
    if-lt v0, v3, :cond_1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-gez v0, :cond_2

    .line 36
    .line 37
    :goto_0
    return-object v4

    .line 38
    :cond_2
    iget-wide v5, p0, Ldf/a;->a:J

    .line 39
    .line 40
    int-to-long v7, v0

    .line 41
    add-long/2addr v5, v7

    .line 42
    iget-boolean v0, p0, Ldf/a;->c:Z

    .line 43
    .line 44
    const/4 v3, 0x2

    .line 45
    if-eqz v0, :cond_7

    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    long-to-int v2, v5

    .line 52
    array-length v5, v0

    .line 53
    if-lt v2, v5, :cond_3

    .line 54
    .line 55
    goto :goto_5

    .line 56
    :cond_3
    aget-byte v4, v0, v2

    .line 57
    .line 58
    and-int/lit16 v4, v4, 0x80

    .line 59
    .line 60
    if-nez v4, :cond_4

    .line 61
    .line 62
    const/4 v4, 0x1

    .line 63
    goto :goto_1

    .line 64
    :cond_4
    move v4, v3

    .line 65
    :goto_1
    add-int/2addr v2, v4

    .line 66
    add-int/lit8 v4, v2, 0x1

    .line 67
    .line 68
    aget-byte v5, v0, v2

    .line 69
    .line 70
    if-nez v5, :cond_5

    .line 71
    .line 72
    const-string v4, ""

    .line 73
    .line 74
    goto :goto_5

    .line 75
    :cond_5
    and-int/lit16 v6, v5, 0x80

    .line 76
    .line 77
    if-eqz v6, :cond_6

    .line 78
    .line 79
    and-int/lit8 v5, v5, 0x7f

    .line 80
    .line 81
    shl-int/lit8 v5, v5, 0x8

    .line 82
    .line 83
    add-int/2addr v2, v3

    .line 84
    aget-byte v3, v0, v4

    .line 85
    .line 86
    and-int/lit16 v3, v3, 0xff

    .line 87
    .line 88
    or-int/2addr v5, v3

    .line 89
    move v4, v2

    .line 90
    :cond_6
    add-int/2addr v5, v4

    .line 91
    invoke-static {v0, v4, v5}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    new-instance v4, Ljava/lang/String;

    .line 96
    .line 97
    sget-object v2, Ldf/e;->k:Ljava/nio/charset/Charset;

    .line 98
    .line 99
    invoke-direct {v4, v0, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 100
    .line 101
    .line 102
    goto :goto_5

    .line 103
    :cond_7
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    long-to-int v2, v5

    .line 108
    add-int/lit8 v5, v2, 0x2

    .line 109
    .line 110
    array-length v6, v0

    .line 111
    if-lt v5, v6, :cond_8

    .line 112
    .line 113
    goto :goto_5

    .line 114
    :cond_8
    array-length v4, v0

    .line 115
    add-int/lit8 v5, v2, 0x1

    .line 116
    .line 117
    aget-byte v5, v0, v5

    .line 118
    .line 119
    and-int/lit16 v5, v5, 0x80

    .line 120
    .line 121
    if-nez v5, :cond_9

    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_9
    const/4 v3, 0x4

    .line 125
    :goto_2
    add-int/2addr v2, v3

    .line 126
    move v3, v2

    .line 127
    :goto_3
    add-int/lit8 v5, v3, 0x1

    .line 128
    .line 129
    if-lt v5, v4, :cond_a

    .line 130
    .line 131
    goto :goto_4

    .line 132
    :cond_a
    aget-byte v6, v0, v3

    .line 133
    .line 134
    if-nez v6, :cond_b

    .line 135
    .line 136
    aget-byte v5, v0, v5

    .line 137
    .line 138
    if-nez v5, :cond_b

    .line 139
    .line 140
    :goto_4
    invoke-static {v0, v2, v3}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    new-instance v4, Ljava/lang/String;

    .line 145
    .line 146
    sget-object v2, Ldf/e;->j:Ljava/nio/charset/Charset;

    .line 147
    .line 148
    invoke-direct {v4, v0, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 149
    .line 150
    .line 151
    :goto_5
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    invoke-virtual {v1, p1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    return-object v4

    .line 159
    :cond_b
    add-int/lit8 v3, v3, 0x2

    .line 160
    .line 161
    goto :goto_3
.end method
