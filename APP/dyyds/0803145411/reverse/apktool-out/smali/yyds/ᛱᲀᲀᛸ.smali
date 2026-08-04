.class public final Lyyds/ᛱᲀᲀᛸ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lyyds/ᛱᲀᲀᛸ$ᛲᲈᲁ;,
        Lyyds/ᛱᲀᲀᛸ$ᛵᛸᛸᛷ;
    }
.end annotation


# static fields
.field private static final ᛱᛳᲇ:I = 0x1

.field private static final ᛱᲈᲁ:I = 0x200000

.field private static final ᛲᛲᲈᲈ:I = 0x2

.field private static final ᛲᛳᛶᲁ:I = 0x1000

.field private static final ᛲᛴᛳᛲ:I = 0x10

.field private static final ᛲᛶᛱᲈ:Ljava/util/concurrent/atomic/AtomicLong;

.field public static final ᛲᲈᲁ:Lyyds/ᛱᲀᲀᛸ;

.field private static final ᛳᛸᛴᛶ:[B

.field private static final ᛳᲁᲁᲇ:I = 0x1

.field private static final ᛵᛶᛲᲀ:I = 0x6

.field private static final ᛵᛸᛸᛷ:I = 0x44

.field private static final ᛵᲀᲈᛴ:[B

.field private static final ᛶᛳᛶᛵ:I = 0x0

.field private static final ᛶᛷᛲᲁ:I = 0x10

.field private static final ᛶᛸᲀᲁ:[B

.field private static final ᛶᲈᛴᲈ:Ljava/security/SecureRandom;

.field private static final ᛷᛲᲈᛱ:I = 0x2

.field private static final ᛷᛵᲇᲀ:I = 0x1

.field private static final ᛷᲈᲈᲁ:J = 0x1d4c0L

.field private static final ᲀᛲᛲᲇ:I = 0x8

.field private static final ᲀᛲᛳᲀ:I = 0x8

.field private static final ᲇᛱᛲ:I = 0x2

.field private static final ᲇᲇᲇᛱ:I = 0xc

.field private static final ᲇᲈᛵᛷ:I = 0xc


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lyyds/ᛱᲀᲀᛸ;

    .line 2
    .line 3
    invoke-direct {v0}, Lyyds/ᛱᲀᲀᛸ;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lyyds/ᛱᲀᲀᛸ;->ᛲᲈᲁ:Lyyds/ᛱᲀᲀᛸ;

    .line 7
    .line 8
    const-wide v1, -0x21862e68a836eL

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    sget-object v2, Lyyds/ᛲᛵᛴᛴ;->ᲇᲈᛵᛷ:Ljava/nio/charset/Charset;

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const-wide v2, -0x21867e68a836eL

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    sput-object v1, Lyyds/ᛱᲀᲀᛸ;->ᛳᛸᛴᛶ:[B

    .line 32
    .line 33
    new-instance v1, Ljava/security/SecureRandom;

    .line 34
    .line 35
    invoke-direct {v1}, Ljava/security/SecureRandom;-><init>()V

    .line 36
    .line 37
    .line 38
    sput-object v1, Lyyds/ᛱᲀᲀᛸ;->ᛶᲈᛴᲈ:Ljava/security/SecureRandom;

    .line 39
    .line 40
    const/16 v1, 0x8

    .line 41
    .line 42
    invoke-direct {v0, v1}, Lyyds/ᛱᲀᲀᛸ;->ᛷᲈᲈᲁ(I)[B

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    sput-object v1, Lyyds/ᛱᲀᲀᛸ;->ᛶᛸᲀᲁ:[B

    .line 47
    .line 48
    const/4 v1, 0x4

    .line 49
    invoke-direct {v0, v1}, Lyyds/ᛱᲀᲀᛸ;->ᛷᲈᲈᲁ(I)[B

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    sput-object v0, Lyyds/ᛱᲀᲀᛸ;->ᛵᲀᲈᛴ:[B

    .line 54
    .line 55
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    .line 56
    .line 57
    const-wide/16 v1, 0x1

    .line 58
    .line 59
    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    .line 60
    .line 61
    .line 62
    sput-object v0, Lyyds/ᛱᲀᲀᛸ;->ᛲᛶᛱᲈ:Ljava/util/concurrent/atomic/AtomicLong;

    .line 63
    .line 64
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final ᛱᲈᲁ(IJ)[B
    .locals 1

    .line 1
    const/16 p0, 0xc

    .line 2
    .line 3
    invoke-static {p0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    sget-object v0, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0, p2, p3}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->array()[B

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    const-wide p1, -0x21830e68a836eL

    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    invoke-static {p1, p2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    return-object p0
.end method

.method private final ᛲᛲᲈᲈ(Ljava/io/DataOutputStream;[B)V
    .locals 0

    .line 1
    const/4 p0, 0x6

    .line 2
    invoke-virtual {p1, p0}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 3
    .line 4
    .line 5
    array-length p0, p2

    .line 6
    invoke-virtual {p1, p0}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1, p2}, Ljava/io/OutputStream;->write([B)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method private final ᛲᛳᛶᲁ([BIJ)V
    .locals 0

    .line 1
    const/16 p0, 0x8

    .line 2
    .line 3
    invoke-static {p1, p2, p0}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    sget-object p1, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0, p3, p4}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public static final synthetic ᛲᲈᲁ(Lyyds/ᛱᲀᲀᛸ;)Ljava/lang/SecurityException;
    .locals 0

    .line 1
    invoke-direct {p0}, Lyyds/ᛱᲀᲀᛸ;->ᛷᛲᲈᛱ()Ljava/lang/SecurityException;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final ᛶᛷᛲᲁ([B[B)[B
    .locals 21

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/16 v2, 0x54

    .line 5
    .line 6
    if-lt v1, v2, :cond_2

    .line 7
    .line 8
    array-length v1, v0

    .line 9
    const v2, 0x200054

    .line 10
    .line 11
    .line 12
    if-gt v1, v2, :cond_2

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    const/16 v2, 0x44

    .line 16
    .line 17
    invoke-static {v0, v1, v2}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    sget-object v4, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 22
    .line 23
    invoke-virtual {v3, v4}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    const/4 v4, 0x4

    .line 28
    new-array v4, v4, [B

    .line 29
    .line 30
    invoke-virtual {v3, v4}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->get()B

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    and-int/lit16 v5, v5, 0xff

    .line 38
    .line 39
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->get()B

    .line 40
    .line 41
    .line 42
    move-result v6

    .line 43
    and-int/lit16 v6, v6, 0xff

    .line 44
    .line 45
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->getShort()S

    .line 46
    .line 47
    .line 48
    move-result v7

    .line 49
    const v8, 0xffff

    .line 50
    .line 51
    .line 52
    and-int/2addr v7, v8

    .line 53
    const/16 v8, 0x8

    .line 54
    .line 55
    new-array v8, v8, [B

    .line 56
    .line 57
    invoke-virtual {v3, v8}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->getInt()I

    .line 61
    .line 62
    .line 63
    move-result v9

    .line 64
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->getLong()J

    .line 65
    .line 66
    .line 67
    move-result-wide v10

    .line 68
    const/16 v12, 0x10

    .line 69
    .line 70
    new-array v15, v12, [B

    .line 71
    .line 72
    invoke-virtual {v3, v15}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->getLong()J

    .line 76
    .line 77
    .line 78
    move-result-wide v13

    .line 79
    const/16 v1, 0xc

    .line 80
    .line 81
    new-array v1, v1, [B

    .line 82
    .line 83
    invoke-virtual {v3, v1}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->getInt()I

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    sget-object v16, Lyyds/ᛱᛸᛷᛱ;->ᛲᲈᲁ:Lyyds/ᛱᛸᛷᛱ;

    .line 91
    .line 92
    invoke-virtual/range {v16 .. v16}, Lyyds/ᛱᛸᛷᛱ;->ᲀᛲᛳᲀ()[B

    .line 93
    .line 94
    .line 95
    move-result-object v12

    .line 96
    sget-object v16, Lyyds/ᛱᛶᛱᛴ;->ᛲᲈᲁ:Lyyds/ᛱᛶᛱᛴ;

    .line 97
    .line 98
    invoke-virtual/range {v16 .. v16}, Lyyds/ᛱᛶᛱᛴ;->ᲀᛲᛳᲀ()Lyyds/ᛱᛶᛱᛴ$ᛲᲈᲁ;

    .line 99
    .line 100
    .line 101
    move-result-object v16

    .line 102
    sget-object v2, Lyyds/ᛱᲀᲀᛸ;->ᛳᛸᛴᛶ:[B

    .line 103
    .line 104
    invoke-static {v4, v2}, Ljava/security/MessageDigest;->isEqual([B[B)Z

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    if-eqz v2, :cond_1

    .line 109
    .line 110
    const/4 v2, 0x2

    .line 111
    if-ne v5, v2, :cond_1

    .line 112
    .line 113
    if-ne v6, v2, :cond_1

    .line 114
    .line 115
    const/16 v2, 0x44

    .line 116
    .line 117
    if-ne v7, v2, :cond_1

    .line 118
    .line 119
    invoke-static {v8, v12}, Ljava/security/MessageDigest;->isEqual([B[B)Z

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    if-eqz v2, :cond_1

    .line 124
    .line 125
    if-lez v9, :cond_1

    .line 126
    .line 127
    const-wide/16 v4, 0x0

    .line 128
    .line 129
    cmp-long v2, v10, v4

    .line 130
    .line 131
    if-lez v2, :cond_1

    .line 132
    .line 133
    invoke-virtual/range {v16 .. v16}, Lyyds/ᛱᛶᛱᛴ$ᛲᲈᲁ;->ᛲᛴᛳᛲ()I

    .line 134
    .line 135
    .line 136
    move-result v2

    .line 137
    if-ne v9, v2, :cond_1

    .line 138
    .line 139
    invoke-virtual/range {v16 .. v16}, Lyyds/ᛱᛶᛱᛴ$ᛲᲈᲁ;->ᲇᲇᲇᛱ()J

    .line 140
    .line 141
    .line 142
    move-result-wide v6

    .line 143
    cmp-long v2, v10, v6

    .line 144
    .line 145
    if-nez v2, :cond_1

    .line 146
    .line 147
    move-object/from16 v2, p2

    .line 148
    .line 149
    invoke-static {v15, v2}, Ljava/security/MessageDigest;->isEqual([B[B)Z

    .line 150
    .line 151
    .line 152
    move-result v2

    .line 153
    if-eqz v2, :cond_1

    .line 154
    .line 155
    const/16 v2, 0x10

    .line 156
    .line 157
    if-lt v3, v2, :cond_1

    .line 158
    .line 159
    const v2, 0x200010

    .line 160
    .line 161
    .line 162
    if-gt v3, v2, :cond_1

    .line 163
    .line 164
    array-length v2, v0

    .line 165
    int-to-long v6, v2

    .line 166
    const-wide/16 v16, 0x44

    .line 167
    .line 168
    move-wide/from16 v19, v4

    .line 169
    .line 170
    int-to-long v4, v3

    .line 171
    add-long v4, v4, v16

    .line 172
    .line 173
    cmp-long v2, v6, v4

    .line 174
    .line 175
    if-nez v2, :cond_1

    .line 176
    .line 177
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 178
    .line 179
    .line 180
    move-result-wide v4

    .line 181
    cmp-long v2, v13, v19

    .line 182
    .line 183
    if-ltz v2, :cond_0

    .line 184
    .line 185
    const-wide/32 v6, 0x1d4c0

    .line 186
    .line 187
    .line 188
    sub-long v16, v4, v6

    .line 189
    .line 190
    cmp-long v2, v13, v16

    .line 191
    .line 192
    if-ltz v2, :cond_0

    .line 193
    .line 194
    add-long/2addr v4, v6

    .line 195
    cmp-long v2, v13, v4

    .line 196
    .line 197
    if-gtz v2, :cond_0

    .line 198
    .line 199
    move-object/from16 v13, p0

    .line 200
    .line 201
    :try_start_0
    invoke-direct {v13, v9, v10, v11}, Lyyds/ᛱᲀᲀᛸ;->ᛱᲈᲁ(IJ)[B

    .line 202
    .line 203
    .line 204
    move-result-object v18

    .line 205
    const/4 v14, 0x2

    .line 206
    const/16 v17, 0x2

    .line 207
    .line 208
    move-object/from16 v16, v1

    .line 209
    .line 210
    invoke-direct/range {v13 .. v18}, Lyyds/ᛱᲀᲀᛸ;->ᲀᛲᛳᲀ(I[B[BI[B)Ljavax/crypto/Cipher;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    const/4 v2, 0x0

    .line 215
    const/16 v4, 0x44

    .line 216
    .line 217
    invoke-virtual {v1, v0, v2, v4}, Ljavax/crypto/Cipher;->updateAAD([BII)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v1, v0, v4, v3}, Ljavax/crypto/Cipher;->doFinal([BII)[B

    .line 221
    .line 222
    .line 223
    move-result-object v0
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 224
    return-object v0

    .line 225
    :catch_0
    invoke-direct/range {p0 .. p0}, Lyyds/ᛱᲀᲀᛸ;->ᛷᛲᲈᛱ()Ljava/lang/SecurityException;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    throw v0

    .line 230
    :catch_1
    invoke-direct/range {p0 .. p0}, Lyyds/ᛱᲀᲀᛸ;->ᛷᛲᲈᛱ()Ljava/lang/SecurityException;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    throw v0

    .line 235
    :cond_0
    invoke-direct/range {p0 .. p0}, Lyyds/ᛱᲀᲀᛸ;->ᛷᛲᲈᛱ()Ljava/lang/SecurityException;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    throw v0

    .line 240
    :cond_1
    invoke-direct/range {p0 .. p0}, Lyyds/ᛱᲀᲀᛸ;->ᛷᛲᲈᛱ()Ljava/lang/SecurityException;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    throw v0

    .line 245
    :cond_2
    invoke-direct/range {p0 .. p0}, Lyyds/ᛱᲀᲀᛸ;->ᛷᛲᲈᛱ()Ljava/lang/SecurityException;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    throw v0
.end method

.method private final ᛷᛲᲈᛱ()Ljava/lang/SecurityException;
    .locals 2

    .line 1
    new-instance p0, Ljava/lang/SecurityException;

    .line 2
    .line 3
    const-wide v0, -0x2183be68a836eL

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-direct {p0, v0}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method private final ᛷᛵᲇᲀ([B[BJ[B)[B
    .locals 13

    .line 1
    move-object/from16 v0, p5

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/16 v2, 0x10

    .line 5
    .line 6
    invoke-static {v1, v2}, Ljava/lang/Math;->addExact(II)I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    sget-object v2, Lyyds/ᛱᛸᛷᛱ;->ᛲᲈᲁ:Lyyds/ᛱᛸᛷᛱ;

    .line 11
    .line 12
    invoke-virtual {v2}, Lyyds/ᛱᛸᛷᛱ;->ᲀᛲᛳᲀ()[B

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    sget-object v3, Lyyds/ᛱᛶᛱᛴ;->ᛲᲈᲁ:Lyyds/ᛱᛶᛱᛴ;

    .line 17
    .line 18
    invoke-virtual {v3}, Lyyds/ᛱᛶᛱᛴ;->ᲀᛲᛳᲀ()Lyyds/ᛱᛶᛱᛴ$ᛲᲈᲁ;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-virtual {v3}, Lyyds/ᛱᛶᛱᛴ$ᛲᲈᲁ;->ᛲᛴᛳᛲ()I

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    invoke-virtual {v3}, Lyyds/ᛱᛶᛱᛴ$ᛲᲈᲁ;->ᲇᲇᲇᛱ()J

    .line 27
    .line 28
    .line 29
    move-result-wide v5

    .line 30
    invoke-direct {p0, v4, v5, v6}, Lyyds/ᛱᲀᲀᛸ;->ᛱᲈᲁ(IJ)[B

    .line 31
    .line 32
    .line 33
    move-result-object v12

    .line 34
    const/16 v4, 0x44

    .line 35
    .line 36
    invoke-static {v4}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    sget-object v6, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 41
    .line 42
    invoke-virtual {v5, v6}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    sget-object v6, Lyyds/ᛱᲀᲀᛸ;->ᛳᛸᛴᛶ:[B

    .line 47
    .line 48
    invoke-virtual {v5, v6}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    const/4 v6, 0x2

    .line 53
    invoke-virtual {v5, v6}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    const/4 v6, 0x1

    .line 58
    invoke-virtual {v5, v6}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    invoke-virtual {v5, v4}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    invoke-virtual {v4, v2}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-virtual {v3}, Lyyds/ᛱᛶᛱᛴ$ᛲᲈᲁ;->ᛲᛴᛳᛲ()I

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    invoke-virtual {v2, v4}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    invoke-virtual {v3}, Lyyds/ᛱᛶᛱᛴ$ᛲᲈᲁ;->ᲇᲇᲇᛱ()J

    .line 79
    .line 80
    .line 81
    move-result-wide v3

    .line 82
    invoke-virtual {v2, v3, v4}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-virtual {v2, p1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    move-wide/from16 v3, p3

    .line 91
    .line 92
    invoke-virtual {v2, v3, v4}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    invoke-virtual {v2, p2}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    invoke-virtual {v2, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    const/4 v8, 0x1

    .line 109
    const/4 v11, 0x1

    .line 110
    move-object v7, p0

    .line 111
    move-object v9, p1

    .line 112
    move-object v10, p2

    .line 113
    :try_start_0
    invoke-direct/range {v7 .. v12}, Lyyds/ᛱᲀᲀᛸ;->ᲀᛲᛳᲀ(I[B[BI[B)Ljavax/crypto/Cipher;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    invoke-virtual {p0, v2}, Ljavax/crypto/Cipher;->updateAAD([B)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p0, v0}, Ljavax/crypto/Cipher;->doFinal([B)[B

    .line 121
    .line 122
    .line 123
    move-result-object p0
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 124
    array-length p1, p0

    .line 125
    if-ne p1, v1, :cond_0

    .line 126
    .line 127
    array-length p1, v2

    .line 128
    array-length p2, p0

    .line 129
    add-int v0, p1, p2

    .line 130
    .line 131
    invoke-static {v2, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    const/4 v1, 0x0

    .line 136
    invoke-static {p0, v1, v0, p1, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 137
    .line 138
    .line 139
    return-object v0

    .line 140
    :cond_0
    const-wide p0, -0x217e4e68a836eL

    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    const/4 p0, 0x0

    .line 153
    return-object p0

    .line 154
    :catch_0
    move-exception v0

    .line 155
    move-object p0, v0

    .line 156
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 157
    .line 158
    const-wide v0, -0x217bde68a836eL

    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object p2

    .line 167
    invoke-direct {p1, p2, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 168
    .line 169
    .line 170
    throw p1
.end method

.method private final ᛷᲈᲈᲁ(I)[B
    .locals 0

    .line 1
    new-array p0, p1, [B

    .line 2
    .line 3
    sget-object p1, Lyyds/ᛱᲀᲀᛸ;->ᛶᲈᛴᲈ:Ljava/security/SecureRandom;

    .line 4
    .line 5
    invoke-virtual {p1, p0}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 6
    .line 7
    .line 8
    return-object p0
.end method

.method private final ᲀᛲᛳᲀ(I[B[BI[B)Ljavax/crypto/Cipher;
    .locals 2

    .line 1
    sget-object p0, Lyyds/ᛱᛸᛷᛱ;->ᛲᲈᲁ:Lyyds/ᛱᛸᛷᛱ;

    .line 2
    .line 3
    invoke-virtual {p0, p4, p2, p5}, Lyyds/ᛱᛸᛷᛱ;->ᛲᲈᲁ(I[B[B)[B

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-wide p4, -0x217f2e68a836eL

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    const/4 p2, 0x0

    .line 13
    :try_start_0
    invoke-static {p4, p5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p4

    .line 17
    invoke-static {p4}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    .line 18
    .line 19
    .line 20
    move-result-object p4

    .line 21
    new-instance p5, Ljavax/crypto/spec/SecretKeySpec;

    .line 22
    .line 23
    const-wide v0, -0x21804e68a836eL

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-direct {p5, p0, v0}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    new-instance v0, Ljavax/crypto/spec/GCMParameterSpec;

    .line 36
    .line 37
    const/16 v1, 0x80

    .line 38
    .line 39
    invoke-direct {v0, v1, p3}, Ljavax/crypto/spec/GCMParameterSpec;-><init>(I[B)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p4, p1, p5, v0}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    invoke-static {p0, p2}, Lyyds/ᲀᲀᛷᛸ;->ᛵᲀᛵᛸ([BB)V

    .line 46
    .line 47
    .line 48
    return-object p4

    .line 49
    :catchall_0
    move-exception p1

    .line 50
    invoke-static {p0, p2}, Lyyds/ᲀᲀᛷᛸ;->ᛵᲀᛵᛸ([BB)V

    .line 51
    .line 52
    .line 53
    throw p1
.end method

.method private final ᲇᲇᲇᛱ()J
    .locals 4

    .line 1
    :cond_0
    sget-object p0, Lyyds/ᛱᲀᲀᛸ;->ᛲᛶᛱᲈ:Ljava/util/concurrent/atomic/AtomicLong;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    const-wide/16 v2, 0x0

    .line 8
    .line 9
    cmp-long v2, v0, v2

    .line 10
    .line 11
    if-lez v2, :cond_1

    .line 12
    .line 13
    const-wide v2, 0x7fffffffffffffffL

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    cmp-long v2, v0, v2

    .line 19
    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    const-wide/16 v2, 0x1

    .line 23
    .line 24
    add-long/2addr v2, v0

    .line 25
    invoke-virtual {p0, v0, v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicLong;->compareAndSet(JJ)Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-eqz p0, :cond_0

    .line 30
    .line 31
    return-wide v0

    .line 32
    :cond_1
    const-wide v0, -0x21808e68a836eL

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    const-wide/16 v0, 0x0

    .line 45
    .line 46
    return-wide v0
.end method


# virtual methods
.method public final ᛲᛴᛳᛲ(Ljava/lang/String;)Lyyds/ᛱᲀᲀᛸ$ᛲᲈᲁ;
    .locals 21

    .line 1
    const-wide v0, -0x2171ee68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    sget-object v0, Lyyds/ᛲᛵᛴᛴ;->ᛲᲈᲁ:Ljava/nio/charset/Charset;

    .line 10
    .line 11
    move-object/from16 v1, p1

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const-wide v2, -0x21726e68a836eL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    array-length v2, v1

    .line 26
    const/4 v3, 0x0

    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    array-length v2, v1

    .line 30
    const/16 v4, 0x1000

    .line 31
    .line 32
    if-gt v2, v4, :cond_1

    .line 33
    .line 34
    new-instance v2, Ljava/io/ByteArrayOutputStream;

    .line 35
    .line 36
    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 37
    .line 38
    .line 39
    new-instance v4, Ljava/io/DataOutputStream;

    .line 40
    .line 41
    invoke-direct {v4, v2}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 42
    .line 43
    .line 44
    const/4 v5, 0x1

    .line 45
    :try_start_0
    invoke-virtual {v4, v5}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v4, v5}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 49
    .line 50
    .line 51
    sget-object v6, Lyyds/ᛱᲀᲀᛸ;->ᛲᲈᲁ:Lyyds/ᛱᲀᲀᛸ;

    .line 52
    .line 53
    const-wide v7, -0x21757e68a836eL

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    invoke-static {v7, v8}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    invoke-virtual {v7, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    const-wide v7, -0x2175de68a836eL

    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    invoke-static {v7, v8}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    invoke-direct {v6, v4, v0}, Lyyds/ᛱᲀᲀᛸ;->ᛲᛲᲈᲈ(Ljava/io/DataOutputStream;[B)V

    .line 75
    .line 76
    .line 77
    const/16 v0, 0x8

    .line 78
    .line 79
    invoke-virtual {v4, v0}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v4, v5}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 83
    .line 84
    .line 85
    invoke-direct {v6, v4, v1}, Lyyds/ᛱᲀᲀᛸ;->ᛲᛲᲈᲈ(Ljava/io/DataOutputStream;[B)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 86
    .line 87
    .line 88
    invoke-interface {v4}, Ljava/io/Closeable;->close()V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 92
    .line 93
    .line 94
    move-result-object v12

    .line 95
    array-length v1, v12

    .line 96
    const/high16 v2, 0x200000

    .line 97
    .line 98
    if-gt v1, v2, :cond_0

    .line 99
    .line 100
    invoke-direct/range {p0 .. p0}, Lyyds/ᛱᲀᲀᛸ;->ᲇᲇᲇᛱ()J

    .line 101
    .line 102
    .line 103
    move-result-wide v1

    .line 104
    const/16 v3, 0x10

    .line 105
    .line 106
    new-array v14, v3, [B

    .line 107
    .line 108
    sget-object v13, Lyyds/ᛱᲀᲀᛸ;->ᛶᛸᲀᲁ:[B

    .line 109
    .line 110
    const/16 v17, 0x0

    .line 111
    .line 112
    const/16 v18, 0xe

    .line 113
    .line 114
    const/4 v15, 0x0

    .line 115
    const/16 v16, 0x0

    .line 116
    .line 117
    invoke-static/range {v13 .. v18}, Lyyds/ᲀᲀᛷᛸ;->ᛲᛶᛱᲈ([B[BIIII)V

    .line 118
    .line 119
    .line 120
    invoke-direct {v6, v14, v0, v1, v2}, Lyyds/ᛱᲀᲀᛸ;->ᛲᛳᛶᲁ([BIJ)V

    .line 121
    .line 122
    .line 123
    const/16 v0, 0xc

    .line 124
    .line 125
    new-array v9, v0, [B

    .line 126
    .line 127
    sget-object v15, Lyyds/ᛱᲀᲀᛸ;->ᛵᲀᲈᛴ:[B

    .line 128
    .line 129
    const/16 v19, 0x0

    .line 130
    .line 131
    const/16 v20, 0xe

    .line 132
    .line 133
    const/16 v18, 0x0

    .line 134
    .line 135
    move-object/from16 v16, v9

    .line 136
    .line 137
    invoke-static/range {v15 .. v20}, Lyyds/ᲀᲀᛷᛸ;->ᛲᛶᛱᲈ([B[BIIII)V

    .line 138
    .line 139
    .line 140
    const/4 v0, 0x4

    .line 141
    invoke-direct {v6, v9, v0, v1, v2}, Lyyds/ᛱᲀᲀᛸ;->ᛲᛳᛶᲁ([BIJ)V

    .line 142
    .line 143
    .line 144
    new-instance v0, Lyyds/ᛱᲀᲀᛸ$ᛲᲈᲁ;

    .line 145
    .line 146
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 147
    .line 148
    .line 149
    move-result-wide v10

    .line 150
    move-object/from16 v7, p0

    .line 151
    .line 152
    move-object v8, v14

    .line 153
    invoke-direct/range {v7 .. v12}, Lyyds/ᛱᲀᲀᛸ;->ᛷᛵᲇᲀ([B[BJ[B)[B

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    invoke-direct {v0, v14, v1}, Lyyds/ᛱᲀᲀᛸ$ᛲᲈᲁ;-><init>([B[B)V

    .line 158
    .line 159
    .line 160
    return-object v0

    .line 161
    :cond_0
    const-wide v0, -0x2176be68a836eL

    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    invoke-static {v0}, Lyyds/ᛱᛸᛶᛲ;->ᲇᲈᛵᛷ(Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    return-object v3

    .line 174
    :catchall_0
    move-exception v0

    .line 175
    move-object v1, v0

    .line 176
    :try_start_1
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 177
    :catchall_1
    move-exception v0

    .line 178
    invoke-static {v4, v1}, Lyyds/ᛶᛶᲁᲇ;->ᛵᛸᛸᛷ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 179
    .line 180
    .line 181
    throw v0

    .line 182
    :cond_1
    const-wide v0, -0x21734e68a836eL

    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    invoke-static {v0}, Lyyds/ᛱᛸᛶᛲ;->ᲇᲈᛵᛷ(Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    return-object v3
.end method

.method public final ᛵᛸᛸᛷ(Ljava/lang/String;Lyyds/ᛷᛴᲈᲀ;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lyyds/\u16f7\u16f4\u1c88\u1c80;",
            ")V"
        }
    .end annotation

    .line 1
    const-wide v0, -0x2170ee68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    const-wide v0, -0x21716e68a836eL

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p1}, Lyyds/ᛱᲀᲀᛸ;->ᛲᛴᛳᛲ(Ljava/lang/String;)Lyyds/ᛱᲀᲀᛸ$ᛲᲈᲁ;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p1}, Lyyds/ᛱᲀᲀᛸ$ᛲᲈᲁ;->ᛵᛸᛸᛷ()[B

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-interface {p2, v0}, Lyyds/ᛷᛴᲈᲀ;->ᛲᛳᛶᲁ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    check-cast p2, [B

    .line 30
    .line 31
    invoke-virtual {p0, p1, p2}, Lyyds/ᛱᲀᲀᛸ;->ᲇᲈᛵᛷ(Lyyds/ᛱᲀᲀᛸ$ᛲᲈᲁ;[B)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final ᲇᲈᛵᛷ(Lyyds/ᛱᲀᲀᛸ$ᛲᲈᲁ;[B)V
    .locals 3

    .line 1
    const-wide v0, -0x2178ee68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    const-wide v0, -0x21796e68a836eL

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Lyyds/ᛱᲀᲀᛸ$ᛲᲈᲁ;->ᛲᲈᲁ()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Lyyds/ᛱᲀᲀᛸ$ᛲᲈᲁ;->ᲀᛲᛳᲀ()[B

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-direct {p0, p2, p1}, Lyyds/ᛱᲀᲀᛸ;->ᛶᛷᛲᲁ([B[B)[B

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    new-instance p2, Lyyds/ᛱᲀᲀᛸ$ᛵᛸᛸᛷ;

    .line 29
    .line 30
    invoke-direct {p2, p1}, Lyyds/ᛱᲀᲀᛸ$ᛵᛸᛸᛷ;-><init>([B)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p2}, Lyyds/ᛱᲀᲀᛸ$ᛵᛸᛸᛷ;->ᛵᛸᛸᛷ()I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    const/4 v0, 0x1

    .line 38
    if-ne p1, v0, :cond_8

    .line 39
    .line 40
    invoke-virtual {p2}, Lyyds/ᛱᲀᲀᛸ$ᛵᛸᛸᛷ;->ᛵᛸᛸᛷ()I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    const/4 v1, 0x2

    .line 45
    if-ne p1, v1, :cond_8

    .line 46
    .line 47
    invoke-virtual {p2}, Lyyds/ᛱᲀᲀᛸ$ᛵᛸᛸᛷ;->ᛵᛸᛸᛷ()I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-eqz p1, :cond_1

    .line 52
    .line 53
    if-ne p1, v0, :cond_0

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    invoke-direct {p0}, Lyyds/ᛱᲀᲀᛸ;->ᛷᛲᲈᛱ()Ljava/lang/SecurityException;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    throw p0

    .line 61
    :cond_1
    const/4 v0, 0x0

    .line 62
    :goto_0
    invoke-virtual {p2}, Lyyds/ᛱᲀᲀᛸ$ᛵᛸᛸᛷ;->ᛵᛸᛸᛷ()I

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    const/4 v1, 0x0

    .line 67
    if-eqz p1, :cond_3

    .line 68
    .line 69
    const/4 v2, 0x6

    .line 70
    if-ne p1, v2, :cond_2

    .line 71
    .line 72
    invoke-virtual {p2}, Lyyds/ᛱᲀᲀᛸ$ᛵᛸᛸᛷ;->ᲇᲈᛵᛷ()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    goto :goto_1

    .line 77
    :cond_2
    invoke-direct {p0}, Lyyds/ᛱᲀᲀᛸ;->ᛷᛲᲈᛱ()Ljava/lang/SecurityException;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    throw p0

    .line 82
    :cond_3
    move-object p1, v1

    .line 83
    :goto_1
    invoke-virtual {p2}, Lyyds/ᛱᲀᲀᛸ$ᛵᛸᛸᛷ;->ᛲᲈᲁ()V

    .line 84
    .line 85
    .line 86
    if-nez v0, :cond_6

    .line 87
    .line 88
    new-instance p0, Lyyds/ᛸᛳᛵᛳ;

    .line 89
    .line 90
    if-nez p1, :cond_4

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_4
    move-object v1, p1

    .line 94
    :goto_2
    if-nez v1, :cond_5

    .line 95
    .line 96
    const-wide p1, -0x2179fe68a836eL

    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    invoke-static {p1, p2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    :cond_5
    const-wide p1, -0x1e6bde68a836eL

    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    invoke-static {p1, p2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    invoke-direct {p0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    throw p0

    .line 117
    :cond_6
    if-nez p1, :cond_7

    .line 118
    .line 119
    return-void

    .line 120
    :cond_7
    invoke-direct {p0}, Lyyds/ᛱᲀᲀᛸ;->ᛷᛲᲈᛱ()Ljava/lang/SecurityException;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    throw p0

    .line 125
    :cond_8
    invoke-direct {p0}, Lyyds/ᛱᲀᲀᛸ;->ᛷᛲᲈᛱ()Ljava/lang/SecurityException;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    throw p0
.end method
