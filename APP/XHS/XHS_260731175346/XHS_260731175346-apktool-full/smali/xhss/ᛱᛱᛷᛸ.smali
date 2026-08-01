.class public abstract Lxhss/ᛱᛱᛷᛸ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# static fields
.field public static final ᛱᛱᛲᲇ:Lxhss/ᛶᛵᲇᛸ;

.field public static final ᛷᛵᛵᲈ:Lxhss/ᛶᛲᛷᛵ;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lxhss/ᛶᛲᛷᛵ;

    .line 2
    .line 3
    const-string v1, "RESUME_TOKEN"

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    invoke-direct {v0, v1, v2}, Lxhss/ᛶᛲᛷᛵ;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ:Lxhss/ᛶᛲᛷᛵ;

    .line 10
    .line 11
    new-instance v0, Lxhss/ᛶᛵᲇᛸ;

    .line 12
    .line 13
    const/16 v1, 0xd

    .line 14
    .line 15
    invoke-direct {v0, v1}, Lxhss/ᛶᛵᲇᛸ;-><init>(I)V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lxhss/ᛱᛱᛷᛸ;->ᛱᛱᛲᲇ:Lxhss/ᛶᛵᲇᛸ;

    .line 19
    .line 20
    return-void
.end method

.method public static final ᛱᛱᛲᲇ([Lxhss/ᛲᛳᛲᛷ;Lxhss/ᛴᲇᲈᛲ;)Ljava/lang/Object;
    .locals 8

    .line 1
    array-length v0, p0

    .line 2
    if-nez v0, :cond_0

    .line 3
    .line 4
    sget-object p0, Lxhss/ᛵᛷᛶᛱ;->ᛱᛱᛲᲇ:Lxhss/ᛵᛷᛶᛱ;

    .line 5
    .line 6
    return-object p0

    .line 7
    :cond_0
    new-instance v0, Lxhss/ᛸᛱᛶᛲ;

    .line 8
    .line 9
    invoke-direct {v0, p0}, Lxhss/ᛸᛱᛶᛲ;-><init>([Lxhss/ᛲᛳᛲᛷ;)V

    .line 10
    .line 11
    .line 12
    new-instance v1, Lxhss/ᛲᛶᛳᲁ;

    .line 13
    .line 14
    invoke-static {p1}, Lxhss/ᛶᛵᛱ;->ᲇᛸᛳᲁ(Lxhss/ᛱᛴᛶᛴ;)Lxhss/ᛱᛴᛶᛴ;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-direct {v1, p1}, Lxhss/ᛲᛶᛳᲁ;-><init>(Lxhss/ᛱᛴᛶᛴ;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Lxhss/ᛲᛶᛳᲁ;->ᛳᲈᲈᛲ()Lxhss/ᛱᛲᲁᲇ;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    if-nez p1, :cond_1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    sget-object v2, Lxhss/ᲇᛸᛵᛵ;->ᛷᛵᛵᲈ:Lsun/misc/Unsafe;

    .line 29
    .line 30
    sget-wide v3, Lxhss/ᛲᛶᛳᲁ;->ᛸᛲᲀᛵ:J

    .line 31
    .line 32
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    instance-of v3, v3, Lxhss/ᛲᲇᛱᛶ;

    .line 37
    .line 38
    if-nez v3, :cond_2

    .line 39
    .line 40
    invoke-interface {p1}, Lxhss/ᛱᛲᲁᲇ;->ᛷᛵᛵᲈ()V

    .line 41
    .line 42
    .line 43
    sget-object p1, Lxhss/ᛵᛵᲇᛳ;->ᛱᛱᛲᲇ:Lxhss/ᛵᛵᲇᛳ;

    .line 44
    .line 45
    sget-wide v3, Lxhss/ᛲᛶᛳᲁ;->ᛸᛴᛶᛳ:J

    .line 46
    .line 47
    invoke-virtual {v2, v1, v3, v4, p1}, Lsun/misc/Unsafe;->putObjectVolatile(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    :cond_2
    :goto_0
    array-length p1, p0

    .line 51
    new-array v2, p1, [Lxhss/ᛳᛳᲈᲈ;

    .line 52
    .line 53
    const/4 v3, 0x0

    .line 54
    move v4, v3

    .line 55
    :goto_1
    if-ge v4, p1, :cond_3

    .line 56
    .line 57
    aget-object v5, p0, v4

    .line 58
    .line 59
    invoke-virtual {v5}, Lxhss/ᛸᛷᛳᲈ;->ᛴᲀᛸᛵ()Z

    .line 60
    .line 61
    .line 62
    new-instance v6, Lxhss/ᛳᛳᲈᲈ;

    .line 63
    .line 64
    invoke-direct {v6, v0, v1}, Lxhss/ᛳᛳᲈᲈ;-><init>(Lxhss/ᛸᛱᛶᛲ;Lxhss/ᛲᛶᛳᲁ;)V

    .line 65
    .line 66
    .line 67
    const/4 v7, 0x1

    .line 68
    invoke-static {v5, v7, v6}, Lxhss/ᛵᛵᛲᲈ;->ᛸᛶᲈᛶ(Lxhss/ᛸᛷᛳᲈ;ZLxhss/ᛴᛷᛴᲀ;)Lxhss/ᛱᛲᲁᲇ;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    iput-object v5, v6, Lxhss/ᛳᛳᲈᲈ;->ᲀᲇᛳᲁ:Lxhss/ᛱᛲᲁᲇ;

    .line 73
    .line 74
    aput-object v6, v2, v4

    .line 75
    .line 76
    add-int/lit8 v4, v4, 0x1

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_3
    new-instance p0, Lxhss/ᛷᲁᛸᲀ;

    .line 80
    .line 81
    invoke-direct {p0, v2}, Lxhss/ᛷᲁᛸᲀ;-><init>([Lxhss/ᛳᛳᲈᲈ;)V

    .line 82
    .line 83
    .line 84
    :goto_2
    if-ge v3, p1, :cond_4

    .line 85
    .line 86
    aget-object v0, v2, v3

    .line 87
    .line 88
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    sget-object v4, Lxhss/ᲇᛸᛵᛵ;->ᛷᛵᛵᲈ:Lsun/misc/Unsafe;

    .line 92
    .line 93
    sget-wide v5, Lxhss/ᛳᛳᲈᲈ;->ᛸᛲᲀᛵ:J

    .line 94
    .line 95
    invoke-virtual {v4, v0, v5, v6, p0}, Lsun/misc/Unsafe;->putObjectVolatile(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    add-int/lit8 v3, v3, 0x1

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_4
    sget-object p1, Lxhss/ᲇᛸᛵᛵ;->ᛷᛵᛵᲈ:Lsun/misc/Unsafe;

    .line 102
    .line 103
    sget-wide v2, Lxhss/ᛲᛶᛳᲁ;->ᛸᛲᲀᛵ:J

    .line 104
    .line 105
    invoke-virtual {p1, v1, v2, v3}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    instance-of p1, p1, Lxhss/ᛲᲇᛱᛶ;

    .line 110
    .line 111
    if-nez p1, :cond_5

    .line 112
    .line 113
    invoke-virtual {p0}, Lxhss/ᛷᲁᛸᲀ;->ᛱᛱᛲᲇ()V

    .line 114
    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_5
    invoke-static {v1, p0}, Lxhss/ᛱᛷᛵᛷ;->ᛸᛲᲀᛵ(Lxhss/ᛲᛶᛳᲁ;Lxhss/ᛶᛳᲁᲈ;)V

    .line 118
    .line 119
    .line 120
    :goto_3
    invoke-virtual {v1}, Lxhss/ᛲᛶᛳᲁ;->ᲇᛸᛳᲁ()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    return-object p0
.end method

.method public static ᛳᲁᲇᛸ(Lxhss/ᛳᛶᲈᲈ;[Lxhss/ᛳᛶᲈᲈ;I)Ljava/lang/String;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v0}, Lxhss/ᛳᛶᲈᲈ;->ᛷᛵᛵᲈ()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v4, 0x0

    .line 10
    :goto_0
    if-ge v4, v2, :cond_b

    .line 11
    .line 12
    add-int v5, v4, v2

    .line 13
    .line 14
    div-int/lit8 v5, v5, 0x2

    .line 15
    .line 16
    :goto_1
    const/16 v6, 0xa

    .line 17
    .line 18
    const/4 v7, -0x1

    .line 19
    if-le v5, v7, :cond_0

    .line 20
    .line 21
    invoke-virtual {v0, v5}, Lxhss/ᛳᛶᲈᲈ;->ᲇᛴᲇᛵ(I)B

    .line 22
    .line 23
    .line 24
    move-result v8

    .line 25
    if-eq v8, v6, :cond_0

    .line 26
    .line 27
    add-int/lit8 v5, v5, -0x1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    add-int/lit8 v8, v5, 0x1

    .line 31
    .line 32
    const/4 v9, 0x1

    .line 33
    move v10, v9

    .line 34
    :goto_2
    add-int v11, v8, v10

    .line 35
    .line 36
    invoke-virtual {v0, v11}, Lxhss/ᛳᛶᲈᲈ;->ᲇᛴᲇᛵ(I)B

    .line 37
    .line 38
    .line 39
    move-result v12

    .line 40
    if-eq v12, v6, :cond_1

    .line 41
    .line 42
    add-int/lit8 v10, v10, 0x1

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_1
    sub-int v6, v11, v8

    .line 46
    .line 47
    move/from16 v12, p2

    .line 48
    .line 49
    const/4 v10, 0x0

    .line 50
    const/4 v13, 0x0

    .line 51
    const/4 v14, 0x0

    .line 52
    :goto_3
    if-eqz v10, :cond_2

    .line 53
    .line 54
    const/16 v10, 0x2e

    .line 55
    .line 56
    const/4 v15, 0x0

    .line 57
    goto :goto_4

    .line 58
    :cond_2
    aget-object v15, v1, v12

    .line 59
    .line 60
    invoke-virtual {v15, v13}, Lxhss/ᛳᛶᲈᲈ;->ᲇᛴᲇᛵ(I)B

    .line 61
    .line 62
    .line 63
    move-result v15

    .line 64
    sget-object v16, Lxhss/ᛶᛸᛲ;->ᛷᛵᛵᲈ:[B

    .line 65
    .line 66
    and-int/lit16 v15, v15, 0xff

    .line 67
    .line 68
    move/from16 v18, v15

    .line 69
    .line 70
    move v15, v10

    .line 71
    move/from16 v10, v18

    .line 72
    .line 73
    :goto_4
    add-int v3, v8, v14

    .line 74
    .line 75
    invoke-virtual {v0, v3}, Lxhss/ᛳᛶᲈᲈ;->ᲇᛴᲇᛵ(I)B

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    sget-object v17, Lxhss/ᛶᛸᛲ;->ᛷᛵᛵᲈ:[B

    .line 80
    .line 81
    and-int/lit16 v3, v3, 0xff

    .line 82
    .line 83
    sub-int/2addr v10, v3

    .line 84
    if-nez v10, :cond_5

    .line 85
    .line 86
    add-int/lit8 v14, v14, 0x1

    .line 87
    .line 88
    add-int/lit8 v13, v13, 0x1

    .line 89
    .line 90
    if-eq v14, v6, :cond_5

    .line 91
    .line 92
    aget-object v3, v1, v12

    .line 93
    .line 94
    invoke-virtual {v3}, Lxhss/ᛳᛶᲈᲈ;->ᛷᛵᛵᲈ()I

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    if-ne v3, v13, :cond_4

    .line 99
    .line 100
    array-length v3, v1

    .line 101
    sub-int/2addr v3, v9

    .line 102
    if-ne v12, v3, :cond_3

    .line 103
    .line 104
    goto :goto_5

    .line 105
    :cond_3
    add-int/lit8 v12, v12, 0x1

    .line 106
    .line 107
    move v13, v7

    .line 108
    move v10, v9

    .line 109
    goto :goto_3

    .line 110
    :cond_4
    move v10, v15

    .line 111
    goto :goto_3

    .line 112
    :cond_5
    :goto_5
    if-gez v10, :cond_6

    .line 113
    .line 114
    :goto_6
    move v2, v5

    .line 115
    goto :goto_0

    .line 116
    :cond_6
    if-lez v10, :cond_7

    .line 117
    .line 118
    :goto_7
    add-int/lit8 v4, v11, 0x1

    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_7
    sub-int v3, v6, v14

    .line 122
    .line 123
    aget-object v7, v1, v12

    .line 124
    .line 125
    invoke-virtual {v7}, Lxhss/ᛳᛶᲈᲈ;->ᛷᛵᛵᲈ()I

    .line 126
    .line 127
    .line 128
    move-result v7

    .line 129
    sub-int/2addr v7, v13

    .line 130
    add-int/lit8 v12, v12, 0x1

    .line 131
    .line 132
    array-length v9, v1

    .line 133
    :goto_8
    if-ge v12, v9, :cond_8

    .line 134
    .line 135
    aget-object v10, v1, v12

    .line 136
    .line 137
    invoke-virtual {v10}, Lxhss/ᛳᛶᲈᲈ;->ᛷᛵᛵᲈ()I

    .line 138
    .line 139
    .line 140
    move-result v10

    .line 141
    add-int/2addr v7, v10

    .line 142
    add-int/lit8 v12, v12, 0x1

    .line 143
    .line 144
    goto :goto_8

    .line 145
    :cond_8
    if-ge v7, v3, :cond_9

    .line 146
    .line 147
    goto :goto_6

    .line 148
    :cond_9
    if-le v7, v3, :cond_a

    .line 149
    .line 150
    goto :goto_7

    .line 151
    :cond_a
    add-int/2addr v6, v8

    .line 152
    invoke-virtual {v0, v8, v6}, Lxhss/ᛳᛶᲈᲈ;->ᛸᛴᛶᛳ(II)Lxhss/ᛳᛶᲈᲈ;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    sget-object v1, Lxhss/ᛶᲈᲇᲇ;->ᛷᛵᛵᲈ:Ljava/nio/charset/Charset;

    .line 157
    .line 158
    invoke-virtual {v0, v1}, Lxhss/ᛳᛶᲈᲈ;->ᲀᲇᛳᲁ(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    return-object v0

    .line 163
    :cond_b
    const/4 v0, 0x0

    .line 164
    return-object v0
.end method

.method public static ᛷᛴᛷᛱ(Lorg/luckypray/dexkit/DexKitBridge;Lxhss/ᛳᲁᲇᛸ;)Lxhss/ᲇᛸᛳᛸ;
    .locals 16

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-virtual {v0, v1}, Lxhss/ᛳᲁᲇᛸ;->ᛱᛱᛲᲇ(I)I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    const/4 v2, 0x0

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object v3, v0, Lxhss/ᛳᲁᲇᛸ;->ᛱᛱᛲᲇ:Ljava/nio/ByteBuffer;

    .line 12
    .line 13
    iget v4, v0, Lxhss/ᛳᲁᲇᛸ;->ᛷᛵᛵᲈ:I

    .line 14
    .line 15
    add-int/2addr v1, v4

    .line 16
    invoke-virtual {v3, v1}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    move v5, v1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v5, v2

    .line 23
    :goto_0
    const/4 v1, 0x6

    .line 24
    invoke-virtual {v0, v1}, Lxhss/ᛳᲁᲇᛸ;->ᛱᛱᛲᲇ(I)I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    iget-object v3, v0, Lxhss/ᛳᲁᲇᛸ;->ᛱᛱᛲᲇ:Ljava/nio/ByteBuffer;

    .line 31
    .line 32
    iget v4, v0, Lxhss/ᛳᲁᲇᛸ;->ᛷᛵᛵᲈ:I

    .line 33
    .line 34
    add-int/2addr v1, v4

    .line 35
    invoke-virtual {v3, v1}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    move v6, v1

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    move v6, v2

    .line 42
    :goto_1
    const/16 v1, 0x8

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Lxhss/ᛳᲁᲇᛸ;->ᛱᛱᛲᲇ(I)I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_2

    .line 49
    .line 50
    iget v3, v0, Lxhss/ᛳᲁᲇᛸ;->ᛷᛵᛵᲈ:I

    .line 51
    .line 52
    add-int/2addr v1, v3

    .line 53
    invoke-virtual {v0, v1}, Lxhss/ᛳᲁᲇᛸ;->ᲇᛴᲇᛵ(I)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    :cond_2
    const/16 v1, 0xa

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Lxhss/ᛳᲁᲇᛸ;->ᛱᛱᛲᲇ(I)I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-eqz v1, :cond_3

    .line 63
    .line 64
    iget-object v3, v0, Lxhss/ᛳᲁᲇᛸ;->ᛱᛱᛲᲇ:Ljava/nio/ByteBuffer;

    .line 65
    .line 66
    iget v4, v0, Lxhss/ᛳᲁᲇᛸ;->ᛷᛵᛵᲈ:I

    .line 67
    .line 68
    add-int/2addr v1, v4

    .line 69
    invoke-virtual {v3, v1}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    move v7, v1

    .line 74
    goto :goto_2

    .line 75
    :cond_3
    move v7, v2

    .line 76
    :goto_2
    const/16 v1, 0xc

    .line 77
    .line 78
    invoke-virtual {v0, v1}, Lxhss/ᛳᲁᲇᛸ;->ᛱᛱᛲᲇ(I)I

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    const/4 v3, 0x0

    .line 83
    if-eqz v1, :cond_4

    .line 84
    .line 85
    iget v4, v0, Lxhss/ᛳᲁᲇᛸ;->ᛷᛵᛵᲈ:I

    .line 86
    .line 87
    add-int/2addr v1, v4

    .line 88
    invoke-virtual {v0, v1}, Lxhss/ᛳᲁᲇᛸ;->ᲇᛴᲇᛵ(I)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    goto :goto_3

    .line 93
    :cond_4
    move-object v1, v3

    .line 94
    :goto_3
    if-nez v1, :cond_5

    .line 95
    .line 96
    const-string v1, ""

    .line 97
    .line 98
    :cond_5
    move-object v8, v1

    .line 99
    const/16 v1, 0xe

    .line 100
    .line 101
    invoke-virtual {v0, v1}, Lxhss/ᛳᲁᲇᛸ;->ᛱᛱᛲᲇ(I)I

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    if-eqz v1, :cond_6

    .line 106
    .line 107
    iget-object v4, v0, Lxhss/ᛳᲁᲇᛸ;->ᛱᛱᛲᲇ:Ljava/nio/ByteBuffer;

    .line 108
    .line 109
    iget v9, v0, Lxhss/ᛳᲁᲇᛸ;->ᛷᛵᛵᲈ:I

    .line 110
    .line 111
    add-int/2addr v1, v9

    .line 112
    invoke-virtual {v4, v1}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    goto :goto_4

    .line 117
    :cond_6
    move v1, v2

    .line 118
    :goto_4
    const/4 v4, -0x1

    .line 119
    if-ne v1, v4, :cond_7

    .line 120
    .line 121
    :goto_5
    move-object v9, v3

    .line 122
    goto :goto_6

    .line 123
    :cond_7
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    goto :goto_5

    .line 128
    :goto_6
    new-instance v10, Ljava/util/ArrayList;

    .line 129
    .line 130
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 131
    .line 132
    .line 133
    const/16 v1, 0x10

    .line 134
    .line 135
    invoke-virtual {v0, v1}, Lxhss/ᛳᲁᲇᛸ;->ᛱᛱᛲᲇ(I)I

    .line 136
    .line 137
    .line 138
    move-result v3

    .line 139
    if-eqz v3, :cond_8

    .line 140
    .line 141
    invoke-virtual {v0, v3}, Lxhss/ᛳᲁᲇᛸ;->ᲇᛶᛴᲀ(I)I

    .line 142
    .line 143
    .line 144
    move-result v3

    .line 145
    goto :goto_7

    .line 146
    :cond_8
    move v3, v2

    .line 147
    :goto_7
    move v4, v2

    .line 148
    :goto_8
    if-ge v4, v3, :cond_a

    .line 149
    .line 150
    invoke-virtual {v0, v1}, Lxhss/ᛳᲁᲇᛸ;->ᛱᛱᛲᲇ(I)I

    .line 151
    .line 152
    .line 153
    move-result v11

    .line 154
    if-eqz v11, :cond_9

    .line 155
    .line 156
    iget-object v12, v0, Lxhss/ᛳᲁᲇᛸ;->ᛱᛱᛲᲇ:Ljava/nio/ByteBuffer;

    .line 157
    .line 158
    invoke-virtual {v0, v11}, Lxhss/ᛳᲁᲇᛸ;->ᛷᛴᛷᛱ(I)I

    .line 159
    .line 160
    .line 161
    move-result v11

    .line 162
    mul-int/lit8 v13, v4, 0x4

    .line 163
    .line 164
    add-int/2addr v13, v11

    .line 165
    invoke-virtual {v12, v13}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 166
    .line 167
    .line 168
    move-result v11

    .line 169
    goto :goto_9

    .line 170
    :cond_9
    move v11, v2

    .line 171
    :goto_9
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 172
    .line 173
    .line 174
    move-result-object v11

    .line 175
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    add-int/lit8 v4, v4, 0x1

    .line 179
    .line 180
    goto :goto_8

    .line 181
    :cond_a
    new-instance v11, Ljava/util/ArrayList;

    .line 182
    .line 183
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 184
    .line 185
    .line 186
    const/16 v1, 0x12

    .line 187
    .line 188
    invoke-virtual {v0, v1}, Lxhss/ᛳᲁᲇᛸ;->ᛱᛱᛲᲇ(I)I

    .line 189
    .line 190
    .line 191
    move-result v3

    .line 192
    if-eqz v3, :cond_b

    .line 193
    .line 194
    invoke-virtual {v0, v3}, Lxhss/ᛳᲁᲇᛸ;->ᲇᛶᛴᲀ(I)I

    .line 195
    .line 196
    .line 197
    move-result v3

    .line 198
    goto :goto_a

    .line 199
    :cond_b
    move v3, v2

    .line 200
    :goto_a
    move v4, v2

    .line 201
    :goto_b
    if-ge v4, v3, :cond_d

    .line 202
    .line 203
    invoke-virtual {v0, v1}, Lxhss/ᛳᲁᲇᛸ;->ᛱᛱᛲᲇ(I)I

    .line 204
    .line 205
    .line 206
    move-result v12

    .line 207
    if-eqz v12, :cond_c

    .line 208
    .line 209
    iget-object v13, v0, Lxhss/ᛳᲁᲇᛸ;->ᛱᛱᛲᲇ:Ljava/nio/ByteBuffer;

    .line 210
    .line 211
    invoke-virtual {v0, v12}, Lxhss/ᛳᲁᲇᛸ;->ᛷᛴᛷᛱ(I)I

    .line 212
    .line 213
    .line 214
    move-result v12

    .line 215
    mul-int/lit8 v14, v4, 0x4

    .line 216
    .line 217
    add-int/2addr v14, v12

    .line 218
    invoke-virtual {v13, v14}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 219
    .line 220
    .line 221
    move-result v12

    .line 222
    goto :goto_c

    .line 223
    :cond_c
    move v12, v2

    .line 224
    :goto_c
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 225
    .line 226
    .line 227
    move-result-object v12

    .line 228
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    add-int/lit8 v4, v4, 0x1

    .line 232
    .line 233
    goto :goto_b

    .line 234
    :cond_d
    new-instance v12, Ljava/util/ArrayList;

    .line 235
    .line 236
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 237
    .line 238
    .line 239
    const/16 v1, 0x14

    .line 240
    .line 241
    invoke-virtual {v0, v1}, Lxhss/ᛳᲁᲇᛸ;->ᛱᛱᛲᲇ(I)I

    .line 242
    .line 243
    .line 244
    move-result v3

    .line 245
    if-eqz v3, :cond_e

    .line 246
    .line 247
    invoke-virtual {v0, v3}, Lxhss/ᛳᲁᲇᛸ;->ᲇᛶᛴᲀ(I)I

    .line 248
    .line 249
    .line 250
    move-result v3

    .line 251
    goto :goto_d

    .line 252
    :cond_e
    move v3, v2

    .line 253
    :goto_d
    move v4, v2

    .line 254
    :goto_e
    if-ge v4, v3, :cond_10

    .line 255
    .line 256
    invoke-virtual {v0, v1}, Lxhss/ᛳᲁᲇᛸ;->ᛱᛱᛲᲇ(I)I

    .line 257
    .line 258
    .line 259
    move-result v13

    .line 260
    if-eqz v13, :cond_f

    .line 261
    .line 262
    iget-object v14, v0, Lxhss/ᛳᲁᲇᛸ;->ᛱᛱᛲᲇ:Ljava/nio/ByteBuffer;

    .line 263
    .line 264
    invoke-virtual {v0, v13}, Lxhss/ᛳᲁᲇᛸ;->ᛷᛴᛷᛱ(I)I

    .line 265
    .line 266
    .line 267
    move-result v13

    .line 268
    mul-int/lit8 v15, v4, 0x4

    .line 269
    .line 270
    add-int/2addr v15, v13

    .line 271
    invoke-virtual {v14, v15}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 272
    .line 273
    .line 274
    move-result v13

    .line 275
    goto :goto_f

    .line 276
    :cond_f
    move v13, v2

    .line 277
    :goto_f
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 278
    .line 279
    .line 280
    move-result-object v13

    .line 281
    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    add-int/lit8 v4, v4, 0x1

    .line 285
    .line 286
    goto :goto_e

    .line 287
    :cond_10
    new-instance v3, Lxhss/ᲇᛸᛳᛸ;

    .line 288
    .line 289
    move-object/from16 v4, p0

    .line 290
    .line 291
    invoke-direct/range {v3 .. v12}, Lxhss/ᲇᛸᛳᛸ;-><init>(Lorg/luckypray/dexkit/DexKitBridge;IIILjava/lang/String;Ljava/lang/Integer;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 292
    .line 293
    .line 294
    return-object v3
.end method

.method public static ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    if-nez p0, :cond_1

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0

    .line 9
    :cond_1
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public static final ᛷᲁᲁ(Lxhss/ᲀᛶᛷᲁ;)Lxhss/ᲀᛶᛷᲁ;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lxhss/ᲀᛶᛷᲁ;->ᛱᛱᛲᲇ()Lxhss/ᛳᛵᛴ;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lxhss/ᛵᛷᲀᛱ;

    .line 6
    .line 7
    iget-object p0, p0, Lxhss/ᲀᛶᛷᲁ;->ᛸᛴᛶᛳ:Lxhss/ᲇᛷᛱᛸ;

    .line 8
    .line 9
    invoke-virtual {p0}, Lxhss/ᲇᛷᛱᛸ;->ᲇᛴᲇᛵ()Lxhss/ᛱᛴᛲᛴ;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p0}, Lxhss/ᲇᛷᛱᛸ;->ᛳᲁᲇᛸ()J

    .line 14
    .line 15
    .line 16
    move-result-wide v3

    .line 17
    invoke-direct {v1, v2, v3, v4}, Lxhss/ᛵᛷᲀᛱ;-><init>(Lxhss/ᛱᛴᛲᛴ;J)V

    .line 18
    .line 19
    .line 20
    iput-object v1, v0, Lxhss/ᛳᛵᛴ;->ᲀᲇᛳᲁ:Lxhss/ᲇᛷᛱᛸ;

    .line 21
    .line 22
    invoke-virtual {v0}, Lxhss/ᛳᛵᛴ;->ᛷᛵᛵᲈ()Lxhss/ᲀᛶᛷᲁ;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public static ᛸᛶᲈᛶ(Landroid/content/Context;Ljava/util/concurrent/Executor;Lxhss/ᛸᲈᛷ;Z)V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v5, p2

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    new-instance v0, Ljava/io/File;

    .line 22
    .line 23
    iget-object v3, v3, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 24
    .line 25
    invoke-direct {v0, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v6

    .line 32
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const/4 v8, 0x7

    .line 37
    const/4 v9, 0x0

    .line 38
    :try_start_0
    invoke-virtual {v0, v2, v9}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 39
    .line 40
    .line 41
    move-result-object v10
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_12

    .line 42
    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 43
    .line 44
    .line 45
    move-result-object v11

    .line 46
    const/4 v12, 0x0

    .line 47
    if-nez p3, :cond_4

    .line 48
    .line 49
    new-instance v0, Ljava/io/File;

    .line 50
    .line 51
    const-string v3, "profileinstaller_profileWrittenFor_lastUpdateTime.dat"

    .line 52
    .line 53
    invoke-direct {v0, v11, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    if-nez v3, :cond_0

    .line 61
    .line 62
    :catch_0
    move v0, v9

    .line 63
    goto :goto_2

    .line 64
    :cond_0
    :try_start_1
    new-instance v3, Ljava/io/DataInputStream;

    .line 65
    .line 66
    new-instance v7, Ljava/io/FileInputStream;

    .line 67
    .line 68
    invoke-direct {v7, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 69
    .line 70
    .line 71
    invoke-direct {v3, v7}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 72
    .line 73
    .line 74
    :try_start_2
    invoke-virtual {v3}, Ljava/io/DataInputStream;->readLong()J

    .line 75
    .line 76
    .line 77
    move-result-wide v14
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 78
    :try_start_3
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    .line 79
    .line 80
    .line 81
    move-wide/from16 v16, v14

    .line 82
    .line 83
    iget-wide v13, v10, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    .line 84
    .line 85
    cmp-long v0, v16, v13

    .line 86
    .line 87
    if-nez v0, :cond_1

    .line 88
    .line 89
    const/4 v0, 0x1

    .line 90
    goto :goto_0

    .line 91
    :cond_1
    move v0, v9

    .line 92
    :goto_0
    if-eqz v0, :cond_2

    .line 93
    .line 94
    const/4 v3, 0x2

    .line 95
    invoke-interface {v5, v3, v12}, Lxhss/ᛸᲈᛷ;->ᛷᛴᛷᛱ(ILjava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    goto :goto_2

    .line 99
    :catchall_0
    move-exception v0

    .line 100
    move-object v7, v0

    .line 101
    :try_start_4
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 102
    .line 103
    .line 104
    goto :goto_1

    .line 105
    :catchall_1
    move-exception v0

    .line 106
    :try_start_5
    invoke-virtual {v7, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 107
    .line 108
    .line 109
    :goto_1
    throw v7
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0

    .line 110
    :cond_2
    :goto_2
    if-nez v0, :cond_3

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_3
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    invoke-static {v1, v9}, Lxhss/ᲁᲈᛸᛲ;->ᛳᲁᲇᛸ(Landroid/content/Context;Z)V

    .line 117
    .line 118
    .line 119
    goto/16 :goto_30

    .line 120
    .line 121
    :cond_4
    :goto_3
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    sget-object v13, Lxhss/ᛶᛵᛱ;->ᛱᛱᛲᲇ:[B

    .line 125
    .line 126
    new-instance v7, Ljava/io/File;

    .line 127
    .line 128
    new-instance v0, Ljava/io/File;

    .line 129
    .line 130
    const-string v3, "/data/misc/profiles/cur/0"

    .line 131
    .line 132
    invoke-direct {v0, v3, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    const-string v2, "primary.prof"

    .line 136
    .line 137
    invoke-direct {v7, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    new-instance v2, Lxhss/ᛴᲈᛴᛲ;

    .line 141
    .line 142
    const-string v0, "dexopt/baseline.prof"

    .line 143
    .line 144
    move-object v3, v4

    .line 145
    move-object/from16 v4, p1

    .line 146
    .line 147
    invoke-direct/range {v2 .. v7}, Lxhss/ᛴᲈᛴᛲ;-><init>(Landroid/content/res/AssetManager;Ljava/util/concurrent/Executor;Lxhss/ᛸᲈᛷ;Ljava/lang/String;Ljava/io/File;)V

    .line 148
    .line 149
    .line 150
    iget-object v4, v2, Lxhss/ᛴᲈᛴᛲ;->ᛳᲁᲇᛸ:[B

    .line 151
    .line 152
    if-nez v4, :cond_5

    .line 153
    .line 154
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 155
    .line 156
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    const/4 v3, 0x3

    .line 161
    invoke-virtual {v2, v3, v0}, Lxhss/ᛴᲈᛴᛲ;->ᛱᛱᛲᲇ(ILjava/io/Serializable;)V

    .line 162
    .line 163
    .line 164
    :goto_4
    const/4 v6, 0x1

    .line 165
    goto/16 :goto_2d

    .line 166
    .line 167
    :cond_5
    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    .line 168
    .line 169
    .line 170
    move-result v6

    .line 171
    const/4 v14, 0x4

    .line 172
    if-eqz v6, :cond_7

    .line 173
    .line 174
    invoke-virtual {v7}, Ljava/io/File;->canWrite()Z

    .line 175
    .line 176
    .line 177
    move-result v6

    .line 178
    if-nez v6, :cond_6

    .line 179
    .line 180
    invoke-virtual {v2, v14, v12}, Lxhss/ᛴᲈᛴᛲ;->ᛱᛱᛲᲇ(ILjava/io/Serializable;)V

    .line 181
    .line 182
    .line 183
    goto :goto_4

    .line 184
    :cond_6
    :goto_5
    const/4 v6, 0x1

    .line 185
    goto :goto_6

    .line 186
    :cond_7
    :try_start_6
    invoke-virtual {v7}, Ljava/io/File;->createNewFile()Z
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_11

    .line 187
    .line 188
    .line 189
    goto :goto_5

    .line 190
    :goto_6
    iput-boolean v6, v2, Lxhss/ᛴᲈᛴᛲ;->ᲇᛶᛴᲀ:Z

    .line 191
    .line 192
    const/4 v6, 0x6

    .line 193
    :try_start_7
    invoke-virtual {v2, v3, v0}, Lxhss/ᛴᲈᛴᛲ;->ᛷᛵᛵᲈ(Landroid/content/res/AssetManager;Ljava/lang/String;)Ljava/io/FileInputStream;

    .line 194
    .line 195
    .line 196
    move-result-object v0
    :try_end_7
    .catch Ljava/io/FileNotFoundException; {:try_start_7 .. :try_end_7} :catch_2
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_1

    .line 197
    move-object v7, v0

    .line 198
    goto :goto_8

    .line 199
    :catch_1
    move-exception v0

    .line 200
    invoke-interface {v5, v8, v0}, Lxhss/ᛸᲈᛷ;->ᛷᛴᛷᛱ(ILjava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    goto :goto_7

    .line 204
    :catch_2
    move-exception v0

    .line 205
    invoke-interface {v5, v6, v0}, Lxhss/ᛸᲈᛷ;->ᛷᛴᛷᛱ(ILjava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    :goto_7
    move-object v7, v12

    .line 209
    :goto_8
    const-string v15, "Invalid magic"

    .line 210
    .line 211
    const/16 v6, 0x8

    .line 212
    .line 213
    if-eqz v7, :cond_9

    .line 214
    .line 215
    :try_start_8
    invoke-static {v7, v14}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛶᲈᛶ(Ljava/io/InputStream;I)[B

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    invoke-static {v13, v0}, Ljava/util/Arrays;->equals([B[B)Z

    .line 220
    .line 221
    .line 222
    move-result v0

    .line 223
    if-eqz v0, :cond_8

    .line 224
    .line 225
    invoke-static {v7, v14}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛶᲈᛶ(Ljava/io/InputStream;I)[B

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    iget-object v9, v2, Lxhss/ᛴᲈᛴᛲ;->ᛷᛴᛷᛱ:Ljava/lang/String;

    .line 230
    .line 231
    invoke-static {v7, v0, v9}, Lxhss/ᛶᛵᛱ;->ᲁᛲᛴᛴ(Ljava/io/FileInputStream;[BLjava/lang/String;)[Lxhss/ᛶᲇᲈᛴ;

    .line 232
    .line 233
    .line 234
    move-result-object v9
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_5
    .catch Ljava/lang/IllegalStateException; {:try_start_8 .. :try_end_8} :catch_4
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 235
    :try_start_9
    invoke-virtual {v7}, Ljava/io/InputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_3

    .line 236
    .line 237
    .line 238
    goto :goto_d

    .line 239
    :catch_3
    move-exception v0

    .line 240
    invoke-interface {v5, v8, v0}, Lxhss/ᛸᲈᛷ;->ᛷᛴᛷᛱ(ILjava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    goto :goto_d

    .line 244
    :catchall_2
    move-exception v0

    .line 245
    move-object v1, v0

    .line 246
    goto :goto_e

    .line 247
    :catch_4
    move-exception v0

    .line 248
    goto :goto_9

    .line 249
    :catch_5
    move-exception v0

    .line 250
    goto :goto_b

    .line 251
    :cond_8
    :try_start_a
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 252
    .line 253
    invoke-direct {v0, v15}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    throw v0
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_5
    .catch Ljava/lang/IllegalStateException; {:try_start_a .. :try_end_a} :catch_4
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 257
    :goto_9
    :try_start_b
    invoke-interface {v5, v6, v0}, Lxhss/ᛸᲈᛷ;->ᛷᛴᛷᛱ(ILjava/lang/Object;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 258
    .line 259
    .line 260
    :goto_a
    :try_start_c
    invoke-virtual {v7}, Ljava/io/InputStream;->close()V
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_6

    .line 261
    .line 262
    .line 263
    goto :goto_c

    .line 264
    :catch_6
    move-exception v0

    .line 265
    invoke-interface {v5, v8, v0}, Lxhss/ᛸᲈᛷ;->ᛷᛴᛷᛱ(ILjava/lang/Object;)V

    .line 266
    .line 267
    .line 268
    goto :goto_c

    .line 269
    :goto_b
    :try_start_d
    invoke-interface {v5, v8, v0}, Lxhss/ᛸᲈᛷ;->ᛷᛴᛷᛱ(ILjava/lang/Object;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    .line 270
    .line 271
    .line 272
    goto :goto_a

    .line 273
    :goto_c
    move-object v9, v12

    .line 274
    :goto_d
    iput-object v9, v2, Lxhss/ᛴᲈᛴᛲ;->ᲀᲇᛳᲁ:[Lxhss/ᛶᲇᲈᛴ;

    .line 275
    .line 276
    goto :goto_10

    .line 277
    :goto_e
    :try_start_e
    invoke-virtual {v7}, Ljava/io/InputStream;->close()V
    :try_end_e
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_7

    .line 278
    .line 279
    .line 280
    goto :goto_f

    .line 281
    :catch_7
    move-exception v0

    .line 282
    invoke-interface {v5, v8, v0}, Lxhss/ᛸᲈᛷ;->ᛷᛴᛷᛱ(ILjava/lang/Object;)V

    .line 283
    .line 284
    .line 285
    :goto_f
    throw v1

    .line 286
    :cond_9
    :goto_10
    iget-object v0, v2, Lxhss/ᛴᲈᛴᛲ;->ᲀᲇᛳᲁ:[Lxhss/ᛶᲇᲈᛴ;

    .line 287
    .line 288
    if-eqz v0, :cond_e

    .line 289
    .line 290
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 291
    .line 292
    const/16 v9, 0x22

    .line 293
    .line 294
    if-le v7, v9, :cond_a

    .line 295
    .line 296
    goto :goto_18

    .line 297
    :cond_a
    packed-switch v7, :pswitch_data_0

    .line 298
    .line 299
    .line 300
    goto :goto_18

    .line 301
    :pswitch_0
    :try_start_f
    const-string v7, "dexopt/baseline.profm"

    .line 302
    .line 303
    invoke-virtual {v2, v3, v7}, Lxhss/ᛴᲈᛴᛲ;->ᛷᛵᛵᲈ(Landroid/content/res/AssetManager;Ljava/lang/String;)Ljava/io/FileInputStream;

    .line 304
    .line 305
    .line 306
    move-result-object v3
    :try_end_f
    .catch Ljava/io/FileNotFoundException; {:try_start_f .. :try_end_f} :catch_a
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_9
    .catch Ljava/lang/IllegalStateException; {:try_start_f .. :try_end_f} :catch_8

    .line 307
    if-eqz v3, :cond_c

    .line 308
    .line 309
    :try_start_10
    sget-object v7, Lxhss/ᛶᛵᛱ;->ᛳᲁᲇᛸ:[B

    .line 310
    .line 311
    invoke-static {v3, v14}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛶᲈᛶ(Ljava/io/InputStream;I)[B

    .line 312
    .line 313
    .line 314
    move-result-object v9

    .line 315
    invoke-static {v7, v9}, Ljava/util/Arrays;->equals([B[B)Z

    .line 316
    .line 317
    .line 318
    move-result v7

    .line 319
    if-eqz v7, :cond_b

    .line 320
    .line 321
    invoke-static {v3, v14}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛶᲈᛶ(Ljava/io/InputStream;I)[B

    .line 322
    .line 323
    .line 324
    move-result-object v7

    .line 325
    invoke-static {v3, v7, v4, v0}, Lxhss/ᛶᛵᛱ;->ᛸᛲᛷᛱ(Ljava/io/FileInputStream;[B[B[Lxhss/ᛶᲇᲈᛴ;)[Lxhss/ᛶᲇᲈᛴ;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    iput-object v0, v2, Lxhss/ᛴᲈᛴᛲ;->ᲀᲇᛳᲁ:[Lxhss/ᛶᲇᲈᛴ;
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_3

    .line 330
    .line 331
    :try_start_11
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_11
    .catch Ljava/io/FileNotFoundException; {:try_start_11 .. :try_end_11} :catch_a
    .catch Ljava/io/IOException; {:try_start_11 .. :try_end_11} :catch_9
    .catch Ljava/lang/IllegalStateException; {:try_start_11 .. :try_end_11} :catch_8

    .line 332
    .line 333
    .line 334
    move-object v0, v2

    .line 335
    goto :goto_17

    .line 336
    :catch_8
    move-exception v0

    .line 337
    goto :goto_13

    .line 338
    :catch_9
    move-exception v0

    .line 339
    goto :goto_14

    .line 340
    :catch_a
    move-exception v0

    .line 341
    goto :goto_15

    .line 342
    :catchall_3
    move-exception v0

    .line 343
    move-object v4, v0

    .line 344
    goto :goto_11

    .line 345
    :cond_b
    :try_start_12
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 346
    .line 347
    invoke-direct {v0, v15}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 348
    .line 349
    .line 350
    throw v0
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_3

    .line 351
    :goto_11
    :try_start_13
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_4

    .line 352
    .line 353
    .line 354
    goto :goto_12

    .line 355
    :catchall_4
    move-exception v0

    .line 356
    :try_start_14
    invoke-virtual {v4, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 357
    .line 358
    .line 359
    :goto_12
    throw v4

    .line 360
    :cond_c
    if-eqz v3, :cond_d

    .line 361
    .line 362
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_14
    .catch Ljava/io/FileNotFoundException; {:try_start_14 .. :try_end_14} :catch_a
    .catch Ljava/io/IOException; {:try_start_14 .. :try_end_14} :catch_9
    .catch Ljava/lang/IllegalStateException; {:try_start_14 .. :try_end_14} :catch_8

    .line 363
    .line 364
    .line 365
    goto :goto_16

    .line 366
    :goto_13
    iput-object v12, v2, Lxhss/ᛴᲈᛴᛲ;->ᲀᲇᛳᲁ:[Lxhss/ᛶᲇᲈᛴ;

    .line 367
    .line 368
    invoke-interface {v5, v6, v0}, Lxhss/ᛸᲈᛷ;->ᛷᛴᛷᛱ(ILjava/lang/Object;)V

    .line 369
    .line 370
    .line 371
    goto :goto_16

    .line 372
    :goto_14
    invoke-interface {v5, v8, v0}, Lxhss/ᛸᲈᛷ;->ᛷᛴᛷᛱ(ILjava/lang/Object;)V

    .line 373
    .line 374
    .line 375
    goto :goto_16

    .line 376
    :goto_15
    const/16 v3, 0x9

    .line 377
    .line 378
    invoke-interface {v5, v3, v0}, Lxhss/ᛸᲈᛷ;->ᛷᛴᛷᛱ(ILjava/lang/Object;)V

    .line 379
    .line 380
    .line 381
    :cond_d
    :goto_16
    move-object v0, v12

    .line 382
    :goto_17
    if-eqz v0, :cond_e

    .line 383
    .line 384
    move-object v2, v0

    .line 385
    :cond_e
    :goto_18
    iget-object v3, v2, Lxhss/ᛴᲈᛴᛲ;->ᛱᛱᛲᲇ:Lxhss/ᛸᲈᛷ;

    .line 386
    .line 387
    iget-object v0, v2, Lxhss/ᛴᲈᛴᛲ;->ᲀᲇᛳᲁ:[Lxhss/ᛶᲇᲈᛴ;

    .line 388
    .line 389
    iget-object v4, v2, Lxhss/ᛴᲈᛴᛲ;->ᛳᲁᲇᛸ:[B

    .line 390
    .line 391
    const-string v5, "This device doesn\'t support aot. Did you call deviceSupportsAotProfile()?"

    .line 392
    .line 393
    if-eqz v0, :cond_12

    .line 394
    .line 395
    if-nez v4, :cond_f

    .line 396
    .line 397
    goto :goto_1e

    .line 398
    :cond_f
    iget-boolean v7, v2, Lxhss/ᛴᲈᛴᛲ;->ᲇᛶᛴᲀ:Z

    .line 399
    .line 400
    if-eqz v7, :cond_11

    .line 401
    .line 402
    :try_start_15
    new-instance v7, Ljava/io/ByteArrayOutputStream;

    .line 403
    .line 404
    invoke-direct {v7}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_15
    .catch Ljava/io/IOException; {:try_start_15 .. :try_end_15} :catch_c
    .catch Ljava/lang/IllegalStateException; {:try_start_15 .. :try_end_15} :catch_b

    .line 405
    .line 406
    .line 407
    :try_start_16
    invoke-virtual {v7, v13}, Ljava/io/OutputStream;->write([B)V

    .line 408
    .line 409
    .line 410
    invoke-virtual {v7, v4}, Ljava/io/OutputStream;->write([B)V

    .line 411
    .line 412
    .line 413
    invoke-static {v7, v4, v0}, Lxhss/ᛶᛵᛱ;->ᛲᛴᲇᛲ(Ljava/io/ByteArrayOutputStream;[B[Lxhss/ᛶᲇᲈᛴ;)Z

    .line 414
    .line 415
    .line 416
    move-result v0

    .line 417
    if-nez v0, :cond_10

    .line 418
    .line 419
    const/4 v0, 0x5

    .line 420
    invoke-interface {v3, v0, v12}, Lxhss/ᛸᲈᛷ;->ᛷᛴᛷᛱ(ILjava/lang/Object;)V

    .line 421
    .line 422
    .line 423
    iput-object v12, v2, Lxhss/ᛴᲈᛴᛲ;->ᲀᲇᛳᲁ:[Lxhss/ᛶᲇᲈᛴ;
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_5

    .line 424
    .line 425
    :try_start_17
    invoke-virtual {v7}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_17
    .catch Ljava/io/IOException; {:try_start_17 .. :try_end_17} :catch_c
    .catch Ljava/lang/IllegalStateException; {:try_start_17 .. :try_end_17} :catch_b

    .line 426
    .line 427
    .line 428
    goto :goto_1e

    .line 429
    :catch_b
    move-exception v0

    .line 430
    goto :goto_1b

    .line 431
    :catch_c
    move-exception v0

    .line 432
    goto :goto_1c

    .line 433
    :catchall_5
    move-exception v0

    .line 434
    move-object v4, v0

    .line 435
    goto :goto_19

    .line 436
    :cond_10
    :try_start_18
    invoke-virtual {v7}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 437
    .line 438
    .line 439
    move-result-object v0

    .line 440
    iput-object v0, v2, Lxhss/ᛴᲈᛴᛲ;->ᛸᛴᛶᛳ:[B
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_5

    .line 441
    .line 442
    :try_start_19
    invoke-virtual {v7}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_19
    .catch Ljava/io/IOException; {:try_start_19 .. :try_end_19} :catch_c
    .catch Ljava/lang/IllegalStateException; {:try_start_19 .. :try_end_19} :catch_b

    .line 443
    .line 444
    .line 445
    goto :goto_1d

    .line 446
    :goto_19
    :try_start_1a
    invoke-virtual {v7}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_6

    .line 447
    .line 448
    .line 449
    goto :goto_1a

    .line 450
    :catchall_6
    move-exception v0

    .line 451
    :try_start_1b
    invoke-virtual {v4, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 452
    .line 453
    .line 454
    :goto_1a
    throw v4
    :try_end_1b
    .catch Ljava/io/IOException; {:try_start_1b .. :try_end_1b} :catch_c
    .catch Ljava/lang/IllegalStateException; {:try_start_1b .. :try_end_1b} :catch_b

    .line 455
    :goto_1b
    invoke-interface {v3, v6, v0}, Lxhss/ᛸᲈᛷ;->ᛷᛴᛷᛱ(ILjava/lang/Object;)V

    .line 456
    .line 457
    .line 458
    goto :goto_1d

    .line 459
    :goto_1c
    invoke-interface {v3, v8, v0}, Lxhss/ᛸᲈᛷ;->ᛷᛴᛷᛱ(ILjava/lang/Object;)V

    .line 460
    .line 461
    .line 462
    :goto_1d
    iput-object v12, v2, Lxhss/ᛴᲈᛴᛲ;->ᲀᲇᛳᲁ:[Lxhss/ᛶᲇᲈᛴ;

    .line 463
    .line 464
    goto :goto_1e

    .line 465
    :cond_11
    invoke-static {v5}, Lxhss/ᛵᲈᲁᲈ;->ᛶᲇᲈᛸ(Ljava/lang/String;)V

    .line 466
    .line 467
    .line 468
    return-void

    .line 469
    :cond_12
    :goto_1e
    iget-object v0, v2, Lxhss/ᛴᲈᛴᛲ;->ᛸᛴᛶᛳ:[B

    .line 470
    .line 471
    if-nez v0, :cond_13

    .line 472
    .line 473
    const/4 v0, 0x0

    .line 474
    const/4 v6, 0x1

    .line 475
    goto/16 :goto_2b

    .line 476
    .line 477
    :cond_13
    iget-boolean v3, v2, Lxhss/ᛴᲈᛴᛲ;->ᲇᛶᛴᲀ:Z

    .line 478
    .line 479
    if-eqz v3, :cond_15

    .line 480
    .line 481
    :try_start_1c
    new-instance v3, Ljava/io/ByteArrayInputStream;

    .line 482
    .line 483
    invoke-direct {v3, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V
    :try_end_1c
    .catch Ljava/io/FileNotFoundException; {:try_start_1c .. :try_end_1c} :catch_10
    .catch Ljava/io/IOException; {:try_start_1c .. :try_end_1c} :catch_f
    .catchall {:try_start_1c .. :try_end_1c} :catchall_7

    .line 484
    .line 485
    .line 486
    :try_start_1d
    new-instance v4, Ljava/io/FileOutputStream;

    .line 487
    .line 488
    iget-object v0, v2, Lxhss/ᛴᲈᛴᛲ;->ᲇᛴᲇᛵ:Ljava/io/File;

    .line 489
    .line 490
    invoke-direct {v4, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_c

    .line 491
    .line 492
    .line 493
    const/16 v0, 0x200

    .line 494
    .line 495
    :try_start_1e
    new-array v0, v0, [B

    .line 496
    .line 497
    :goto_1f
    invoke-virtual {v3, v0}, Ljava/io/InputStream;->read([B)I

    .line 498
    .line 499
    .line 500
    move-result v5

    .line 501
    if-lez v5, :cond_14

    .line 502
    .line 503
    const/4 v6, 0x0

    .line 504
    invoke-virtual {v4, v0, v6, v5}, Ljava/io/OutputStream;->write([BII)V
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_a

    .line 505
    .line 506
    .line 507
    goto :goto_1f

    .line 508
    :cond_14
    const/4 v6, 0x1

    .line 509
    :try_start_1f
    invoke-virtual {v2, v6, v12}, Lxhss/ᛴᲈᛴᛲ;->ᛱᛱᛲᲇ(ILjava/io/Serializable;)V
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_9

    .line 510
    .line 511
    .line 512
    :try_start_20
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
    :try_end_20
    .catchall {:try_start_20 .. :try_end_20} :catchall_8

    .line 513
    .line 514
    .line 515
    :try_start_21
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_21
    .catch Ljava/io/FileNotFoundException; {:try_start_21 .. :try_end_21} :catch_e
    .catch Ljava/io/IOException; {:try_start_21 .. :try_end_21} :catch_d
    .catchall {:try_start_21 .. :try_end_21} :catchall_7

    .line 516
    .line 517
    .line 518
    iput-object v12, v2, Lxhss/ᛴᲈᛴᛲ;->ᛸᛴᛶᛳ:[B

    .line 519
    .line 520
    iput-object v12, v2, Lxhss/ᛴᲈᛴᛲ;->ᲀᲇᛳᲁ:[Lxhss/ᛶᲇᲈᛴ;

    .line 521
    .line 522
    move v0, v6

    .line 523
    goto :goto_2b

    .line 524
    :catchall_7
    move-exception v0

    .line 525
    goto :goto_2c

    .line 526
    :catch_d
    move-exception v0

    .line 527
    goto :goto_27

    .line 528
    :catch_e
    move-exception v0

    .line 529
    :goto_20
    const/4 v3, 0x6

    .line 530
    goto :goto_29

    .line 531
    :catchall_8
    move-exception v0

    .line 532
    :goto_21
    move-object v4, v0

    .line 533
    goto :goto_25

    .line 534
    :catchall_9
    move-exception v0

    .line 535
    :goto_22
    move-object v5, v0

    .line 536
    goto :goto_23

    .line 537
    :catchall_a
    move-exception v0

    .line 538
    const/4 v6, 0x1

    .line 539
    goto :goto_22

    .line 540
    :goto_23
    :try_start_22
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
    :try_end_22
    .catchall {:try_start_22 .. :try_end_22} :catchall_b

    .line 541
    .line 542
    .line 543
    goto :goto_24

    .line 544
    :catchall_b
    move-exception v0

    .line 545
    :try_start_23
    invoke-virtual {v5, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 546
    .line 547
    .line 548
    :goto_24
    throw v5
    :try_end_23
    .catchall {:try_start_23 .. :try_end_23} :catchall_8

    .line 549
    :catchall_c
    move-exception v0

    .line 550
    const/4 v6, 0x1

    .line 551
    goto :goto_21

    .line 552
    :goto_25
    :try_start_24
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_24
    .catchall {:try_start_24 .. :try_end_24} :catchall_d

    .line 553
    .line 554
    .line 555
    goto :goto_26

    .line 556
    :catchall_d
    move-exception v0

    .line 557
    :try_start_25
    invoke-virtual {v4, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 558
    .line 559
    .line 560
    :goto_26
    throw v4
    :try_end_25
    .catch Ljava/io/FileNotFoundException; {:try_start_25 .. :try_end_25} :catch_e
    .catch Ljava/io/IOException; {:try_start_25 .. :try_end_25} :catch_d
    .catchall {:try_start_25 .. :try_end_25} :catchall_7

    .line 561
    :catch_f
    move-exception v0

    .line 562
    const/4 v6, 0x1

    .line 563
    goto :goto_27

    .line 564
    :catch_10
    move-exception v0

    .line 565
    const/4 v6, 0x1

    .line 566
    goto :goto_20

    .line 567
    :goto_27
    :try_start_26
    invoke-virtual {v2, v8, v0}, Lxhss/ᛴᲈᛴᛲ;->ᛱᛱᛲᲇ(ILjava/io/Serializable;)V
    :try_end_26
    .catchall {:try_start_26 .. :try_end_26} :catchall_7

    .line 568
    .line 569
    .line 570
    :goto_28
    iput-object v12, v2, Lxhss/ᛴᲈᛴᛲ;->ᛸᛴᛶᛳ:[B

    .line 571
    .line 572
    iput-object v12, v2, Lxhss/ᛴᲈᛴᛲ;->ᲀᲇᛳᲁ:[Lxhss/ᛶᲇᲈᛴ;

    .line 573
    .line 574
    goto :goto_2a

    .line 575
    :goto_29
    :try_start_27
    invoke-virtual {v2, v3, v0}, Lxhss/ᛴᲈᛴᛲ;->ᛱᛱᛲᲇ(ILjava/io/Serializable;)V
    :try_end_27
    .catchall {:try_start_27 .. :try_end_27} :catchall_7

    .line 576
    .line 577
    .line 578
    goto :goto_28

    .line 579
    :goto_2a
    const/4 v0, 0x0

    .line 580
    :goto_2b
    if-eqz v0, :cond_16

    .line 581
    .line 582
    invoke-static {v10, v11}, Lxhss/ᛱᛱᛷᛸ;->ᲀᲇᛳᲁ(Landroid/content/pm/PackageInfo;Ljava/io/File;)V

    .line 583
    .line 584
    .line 585
    goto :goto_2e

    .line 586
    :goto_2c
    iput-object v12, v2, Lxhss/ᛴᲈᛴᛲ;->ᛸᛴᛶᛳ:[B

    .line 587
    .line 588
    iput-object v12, v2, Lxhss/ᛴᲈᛴᛲ;->ᲀᲇᛳᲁ:[Lxhss/ᛶᲇᲈᛴ;

    .line 589
    .line 590
    throw v0

    .line 591
    :cond_15
    invoke-static {v5}, Lxhss/ᛵᲈᲁᲈ;->ᛶᲇᲈᛸ(Ljava/lang/String;)V

    .line 592
    .line 593
    .line 594
    return-void

    .line 595
    :catch_11
    const/4 v6, 0x1

    .line 596
    invoke-virtual {v2, v14, v12}, Lxhss/ᛴᲈᛴᛲ;->ᛱᛱᛲᲇ(ILjava/io/Serializable;)V

    .line 597
    .line 598
    .line 599
    :goto_2d
    const/4 v0, 0x0

    .line 600
    :cond_16
    :goto_2e
    if-eqz v0, :cond_17

    .line 601
    .line 602
    if-eqz p3, :cond_17

    .line 603
    .line 604
    move v9, v6

    .line 605
    goto :goto_2f

    .line 606
    :cond_17
    const/4 v9, 0x0

    .line 607
    :goto_2f
    invoke-static {v1, v9}, Lxhss/ᲁᲈᛸᛲ;->ᛳᲁᲇᛸ(Landroid/content/Context;Z)V

    .line 608
    .line 609
    .line 610
    :goto_30
    return-void

    .line 611
    :catch_12
    move-exception v0

    .line 612
    invoke-interface {v5, v8, v0}, Lxhss/ᛸᲈᛷ;->ᛷᛴᛷᛱ(ILjava/lang/Object;)V

    .line 613
    .line 614
    .line 615
    const/4 v6, 0x0

    .line 616
    invoke-static {v1, v6}, Lxhss/ᲁᲈᛸᛲ;->ᛳᲁᲇᛸ(Landroid/content/Context;Z)V

    .line 617
    .line 618
    .line 619
    return-void

    .line 620
    nop

    .line 621
    :pswitch_data_0
    .packed-switch 0x1f
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static ᛸᛷᲈᲈ(Lxhss/ᛴᛷᛸᛷ;)Lxhss/ᛵᛷᛸᛶ;
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lxhss/ᛴᛷᛸᛷ;->ᲁᲁᛴᲁ()I
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Lxhss/ᲈᲇᲁᲈ; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_1

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    :try_start_1
    sget-object v1, Lxhss/ᛲᲁᛸᛴ;->ᛷᛵᛵᲈ:Lxhss/ᛲᲁᛸᛴ;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {p0}, Lxhss/ᛲᲁᛸᛴ;->ᲇᛴᲇᛵ(Lxhss/ᛴᛷᛸᛷ;)Lxhss/ᛵᛷᛸᛶ;

    .line 11
    .line 12
    .line 13
    move-result-object p0
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lxhss/ᲈᲇᲁᲈ; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    .line 14
    return-object p0

    .line 15
    :catch_0
    move-exception p0

    .line 16
    goto :goto_0

    .line 17
    :catch_1
    move-exception p0

    .line 18
    new-instance v0, Lxhss/ᛱᲈᛲᛷ;

    .line 19
    .line 20
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    throw v0

    .line 24
    :catch_2
    move-exception p0

    .line 25
    new-instance v0, Lxhss/ᛱᲈᛲᛷ;

    .line 26
    .line 27
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    throw v0

    .line 31
    :catch_3
    move-exception p0

    .line 32
    new-instance v0, Lxhss/ᛱᲈᛲᛷ;

    .line 33
    .line 34
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    throw v0

    .line 38
    :catch_4
    move-exception p0

    .line 39
    const/4 v0, 0x1

    .line 40
    :goto_0
    if-eqz v0, :cond_0

    .line 41
    .line 42
    sget-object p0, Lxhss/ᲇᛳᛷᛳ;->ᛱᛱᛲᲇ:Lxhss/ᲇᛳᛷᛳ;

    .line 43
    .line 44
    return-object p0

    .line 45
    :cond_0
    new-instance v0, Lxhss/ᛱᲈᛲᛷ;

    .line 46
    .line 47
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 48
    .line 49
    .line 50
    throw v0
.end method

.method public static ᲀᲇᛳᲁ(Landroid/content/pm/PackageInfo;Ljava/io/File;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    const-string v1, "profileinstaller_profileWrittenFor_lastUpdateTime.dat"

    .line 4
    .line 5
    invoke-direct {v0, p1, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :try_start_0
    new-instance p1, Ljava/io/DataOutputStream;

    .line 9
    .line 10
    new-instance v1, Ljava/io/FileOutputStream;

    .line 11
    .line 12
    invoke-direct {v1, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p1, v1}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    .line 17
    .line 18
    :try_start_1
    iget-wide v0, p0, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    .line 19
    .line 20
    invoke-virtual {p1, v0, v1}, Ljava/io/DataOutputStream;->writeLong(J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    .line 22
    .line 23
    :try_start_2
    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :catchall_0
    move-exception p0

    .line 28
    :try_start_3
    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catchall_1
    move-exception p1

    .line 33
    :try_start_4
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    :goto_0
    throw p0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 37
    :catch_0
    return-void
.end method

.method public static ᲇᛴᲇᛵ(II)I
    .locals 0

    .line 1
    if-ge p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p0, -0x1

    .line 4
    return p0

    .line 5
    :cond_0
    if-ne p0, p1, :cond_1

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return p0

    .line 9
    :cond_1
    const/4 p0, 0x1

    .line 10
    return p0
.end method

.method public static ᲇᛶᛴᲀ(Ljava/lang/String;)Lxhss/ᛱᛴᛲᛴ;
    .locals 10

    .line 1
    sget-object v0, Lxhss/ᛱᛴᛲᛴ;->ᛱᛱᛲᲇ:Lxhss/ᛲᛳᛴᲁ;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, p0, v1}, Lxhss/ᛲᛳᛴᲁ;->ᛷᛵᛵᲈ(Ljava/lang/String;I)Lxhss/ᛷᛱᛳᲁ;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const/16 v2, 0x22

    .line 9
    .line 10
    if-eqz v0, :cond_9

    .line 11
    .line 12
    iget-object v3, v0, Lxhss/ᛷᛱᛳᲁ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v3, Lxhss/ᛲᛶᛸᛵ;

    .line 15
    .line 16
    if-nez v3, :cond_0

    .line 17
    .line 18
    new-instance v3, Lxhss/ᛲᛶᛸᛵ;

    .line 19
    .line 20
    invoke-direct {v3, v0}, Lxhss/ᛲᛶᛸᛵ;-><init>(Lxhss/ᛷᛱᛳᲁ;)V

    .line 21
    .line 22
    .line 23
    iput-object v3, v0, Lxhss/ᛷᛱᛳᲁ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 24
    .line 25
    :cond_0
    const/4 v4, 0x1

    .line 26
    invoke-virtual {v3, v4}, Lxhss/ᛲᛶᛸᛵ;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    check-cast v3, Ljava/lang/String;

    .line 31
    .line 32
    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 33
    .line 34
    invoke-virtual {v3, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    iget-object v3, v0, Lxhss/ᛷᛱᛳᲁ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v3, Lxhss/ᛲᛶᛸᛵ;

    .line 40
    .line 41
    if-nez v3, :cond_1

    .line 42
    .line 43
    new-instance v3, Lxhss/ᛲᛶᛸᛵ;

    .line 44
    .line 45
    invoke-direct {v3, v0}, Lxhss/ᛲᛶᛸᛵ;-><init>(Lxhss/ᛷᛱᛳᲁ;)V

    .line 46
    .line 47
    .line 48
    iput-object v3, v0, Lxhss/ᛷᛱᛳᲁ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 49
    .line 50
    :cond_1
    const/4 v6, 0x2

    .line 51
    invoke-virtual {v3, v6}, Lxhss/ᛲᛶᛸᛵ;->get(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    check-cast v3, Ljava/lang/String;

    .line 56
    .line 57
    invoke-virtual {v3, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    new-instance v3, Ljava/util/ArrayList;

    .line 61
    .line 62
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 63
    .line 64
    .line 65
    iget-object v0, v0, Lxhss/ᛷᛱᛳᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v0, Ljava/util/regex/Matcher;

    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->start()I

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->end()I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    invoke-static {v5, v0}, Lxhss/ᛵᛵᛲᲈ;->ᛲᛴᲀᲈ(II)Lxhss/ᛱᛲᲇᲀ;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    iget v0, v0, Lxhss/ᲁᛵᛶᲁ;->ᛳᲁᲇᛸ:I

    .line 82
    .line 83
    :goto_0
    add-int/2addr v0, v4

    .line 84
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    if-ge v0, v5, :cond_8

    .line 89
    .line 90
    sget-object v5, Lxhss/ᛱᛴᛲᛴ;->ᛳᲁᲇᛸ:Lxhss/ᛲᛳᛴᲁ;

    .line 91
    .line 92
    invoke-virtual {v5, p0, v0}, Lxhss/ᛲᛳᛴᲁ;->ᛷᛵᛵᲈ(Ljava/lang/String;I)Lxhss/ᛷᛱᛳᲁ;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    if-eqz v5, :cond_7

    .line 97
    .line 98
    iget-object v0, v5, Lxhss/ᛷᛱᛳᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v0, Ljava/util/regex/Matcher;

    .line 101
    .line 102
    iget-object v5, v5, Lxhss/ᛷᛱᛳᲁ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v5, Lxhss/ᲀᛸᛸᲁ;

    .line 105
    .line 106
    invoke-virtual {v5, v4}, Lxhss/ᲀᛸᛸᲁ;->ᛱᛱᛲᲇ(I)Lxhss/ᛷᛴᲇᲀ;

    .line 107
    .line 108
    .line 109
    move-result-object v7

    .line 110
    const/4 v8, 0x0

    .line 111
    if-eqz v7, :cond_2

    .line 112
    .line 113
    iget-object v7, v7, Lxhss/ᛷᛴᲇᲀ;->ᛷᛵᛵᲈ:Ljava/lang/String;

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_2
    move-object v7, v8

    .line 117
    :goto_1
    if-nez v7, :cond_3

    .line 118
    .line 119
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->start()I

    .line 120
    .line 121
    .line 122
    move-result v5

    .line 123
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->end()I

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    invoke-static {v5, v0}, Lxhss/ᛵᛵᛲᲈ;->ᛲᛴᲀᲈ(II)Lxhss/ᛱᛲᲇᲀ;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    iget v0, v0, Lxhss/ᲁᛵᛶᲁ;->ᛳᲁᲇᛸ:I

    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_3
    invoke-virtual {v5, v6}, Lxhss/ᲀᛸᛸᲁ;->ᛱᛱᛲᲇ(I)Lxhss/ᛷᛴᲇᲀ;

    .line 135
    .line 136
    .line 137
    move-result-object v9

    .line 138
    if-eqz v9, :cond_4

    .line 139
    .line 140
    iget-object v8, v9, Lxhss/ᛷᛴᲇᲀ;->ᛷᛵᛵᲈ:Ljava/lang/String;

    .line 141
    .line 142
    :cond_4
    if-nez v8, :cond_5

    .line 143
    .line 144
    const/4 v8, 0x3

    .line 145
    invoke-virtual {v5, v8}, Lxhss/ᲀᛸᛸᲁ;->ᛱᛱᛲᲇ(I)Lxhss/ᛷᛴᲇᲀ;

    .line 146
    .line 147
    .line 148
    move-result-object v5

    .line 149
    iget-object v8, v5, Lxhss/ᛷᛴᲇᲀ;->ᛷᛵᛵᲈ:Ljava/lang/String;

    .line 150
    .line 151
    goto :goto_2

    .line 152
    :cond_5
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 153
    .line 154
    .line 155
    move-result v5

    .line 156
    if-lez v5, :cond_6

    .line 157
    .line 158
    invoke-virtual {v8, v1}, Ljava/lang/String;->charAt(I)C

    .line 159
    .line 160
    .line 161
    move-result v5

    .line 162
    const/16 v9, 0x27

    .line 163
    .line 164
    invoke-static {v5, v9, v1}, Lxhss/ᲁᛵᛸᛳ;->ᛳᲁᲇᛸ(CCZ)Z

    .line 165
    .line 166
    .line 167
    move-result v5

    .line 168
    if-eqz v5, :cond_6

    .line 169
    .line 170
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 171
    .line 172
    .line 173
    move-result v5

    .line 174
    if-lez v5, :cond_6

    .line 175
    .line 176
    invoke-static {v8}, Lxhss/ᛲᛱᛲᲀ;->ᛴᲈᲀᲀ(Ljava/lang/CharSequence;)I

    .line 177
    .line 178
    .line 179
    move-result v5

    .line 180
    invoke-virtual {v8, v5}, Ljava/lang/String;->charAt(I)C

    .line 181
    .line 182
    .line 183
    move-result v5

    .line 184
    invoke-static {v5, v9, v1}, Lxhss/ᲁᛵᛸᛳ;->ᛳᲁᲇᛸ(CCZ)Z

    .line 185
    .line 186
    .line 187
    move-result v5

    .line 188
    if-eqz v5, :cond_6

    .line 189
    .line 190
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 191
    .line 192
    .line 193
    move-result v5

    .line 194
    if-le v5, v6, :cond_6

    .line 195
    .line 196
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 197
    .line 198
    .line 199
    move-result v5

    .line 200
    sub-int/2addr v5, v4

    .line 201
    invoke-virtual {v8, v4, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v8

    .line 205
    :cond_6
    :goto_2
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->start()I

    .line 212
    .line 213
    .line 214
    move-result v5

    .line 215
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->end()I

    .line 216
    .line 217
    .line 218
    move-result v0

    .line 219
    invoke-static {v5, v0}, Lxhss/ᛵᛵᛲᲈ;->ᛲᛴᲀᲈ(II)Lxhss/ᛱᛲᲇᲀ;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    iget v0, v0, Lxhss/ᲁᛵᛶᲁ;->ᛳᲁᲇᛸ:I

    .line 224
    .line 225
    goto/16 :goto_0

    .line 226
    .line 227
    :cond_7
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    new-instance v1, Ljava/lang/StringBuilder;

    .line 232
    .line 233
    const-string v3, "Parameter is not formatted correctly: \""

    .line 234
    .line 235
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    const-string v0, "\" for: \""

    .line 242
    .line 243
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 244
    .line 245
    .line 246
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object p0

    .line 256
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 257
    .line 258
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object p0

    .line 262
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    throw v0

    .line 266
    :cond_8
    new-instance v0, Lxhss/ᛱᛴᛲᛴ;

    .line 267
    .line 268
    new-array v1, v1, [Ljava/lang/String;

    .line 269
    .line 270
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v1

    .line 274
    check-cast v1, [Ljava/lang/String;

    .line 275
    .line 276
    invoke-direct {v0, p0}, Lxhss/ᛱᛴᛲᛴ;-><init>(Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    return-object v0

    .line 280
    :cond_9
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 281
    .line 282
    new-instance v1, Ljava/lang/StringBuilder;

    .line 283
    .line 284
    const-string v3, "No subtype found for: \""

    .line 285
    .line 286
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 290
    .line 291
    .line 292
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 293
    .line 294
    .line 295
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object p0

    .line 299
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    throw v0
.end method

.method public static ᲈᛳᲀ(Ljava/lang/RuntimeException;Ljava/lang/String;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v1, v0

    .line 6
    const/4 v2, -0x1

    .line 7
    const/4 v3, 0x0

    .line 8
    :goto_0
    if-ge v3, v1, :cond_1

    .line 9
    .line 10
    aget-object v4, v0, v3

    .line 11
    .line 12
    invoke-virtual {v4}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    if-eqz v4, :cond_0

    .line 21
    .line 22
    move v2, v3

    .line 23
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 27
    .line 28
    invoke-static {v0, v2, v1}, Ljava/util/Arrays;->copyOfRange([Ljava/lang/Object;II)[Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    check-cast p1, [Ljava/lang/StackTraceElement;

    .line 33
    .line 34
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->setStackTrace([Ljava/lang/StackTraceElement;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method


# virtual methods
.method public abstract ᛸᛲᲀᛵ(Lxhss/ᲇᛸᛶ;)V
.end method

.method public abstract ᛸᛴᛶᛳ(Ljava/lang/Throwable;)V
.end method
