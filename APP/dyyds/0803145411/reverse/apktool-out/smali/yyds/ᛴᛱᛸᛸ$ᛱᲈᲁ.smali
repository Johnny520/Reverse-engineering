.class final Lyyds/ᛴᛱᛸᛸ$ᛱᲈᲁ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lyyds/ᛴᛱᛸᛸ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u16f1\u1c88\u1c81"
.end annotation


# instance fields
.field private final ᛲᲈᲁ:Ljava/io/ByteArrayOutputStream;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lyyds/ᛴᛱᛸᛸ$ᛱᲈᲁ;->ᛲᲈᲁ:Ljava/io/ByteArrayOutputStream;

    .line 10
    .line 11
    return-void
.end method

.method private final ᛱᲈᲁ([B)V
    .locals 2

    .line 1
    array-length v0, p1

    .line 2
    const/high16 v1, 0x200000

    .line 3
    .line 4
    if-gt v0, v1, :cond_0

    .line 5
    .line 6
    array-length v0, p1

    .line 7
    invoke-direct {p0, v0}, Lyyds/ᛴᛱᛸᛸ$ᛱᲈᲁ;->ᲇᲇᲇᛱ(I)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lyyds/ᛴᛱᛸᛸ$ᛱᲈᲁ;->ᛲᲈᲁ:Ljava/io/ByteArrayOutputStream;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write([B)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0}, Lyyds/ᛴᛱᛸᛸ$ᛱᲈᲁ;->ᛲᲈᲁ()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    const-wide p0, -0x27001e68a836eL

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᲇᲈᛵᛷ(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method private final ᛲᛳᛶᲁ(J)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, -0x8

    .line 3
    const/16 v2, 0x38

    .line 4
    .line 5
    invoke-static {v2, v0, v1}, Lyyds/ᲀᛳᛳᛱ;->ᲇᲇᲇᛱ(III)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-gt v0, v2, :cond_0

    .line 10
    .line 11
    :goto_0
    ushr-long v3, p1, v2

    .line 12
    .line 13
    long-to-int v1, v3

    .line 14
    invoke-virtual {p0, v1}, Lyyds/ᛴᛱᛸᛸ$ᛱᲈᲁ;->ᲀᛲᛳᲀ(I)V

    .line 15
    .line 16
    .line 17
    if-eq v2, v0, :cond_0

    .line 18
    .line 19
    add-int/lit8 v2, v2, -0x8

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return-void
.end method

.method private final ᛲᛴᛳᛲ(D)V
    .locals 1

    .line 1
    const/4 v0, 0x5

    .line 2
    invoke-virtual {p0, v0}, Lyyds/ᛴᛱᛸᛸ$ᛱᲈᲁ;->ᲀᛲᛳᲀ(I)V

    .line 3
    .line 4
    .line 5
    invoke-static {p1, p2}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    .line 6
    .line 7
    .line 8
    move-result-wide p1

    .line 9
    invoke-direct {p0, p1, p2}, Lyyds/ᛴᛱᛸᛸ$ᛱᲈᲁ;->ᛲᛳᛶᲁ(J)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method private final ᛲᲈᲁ()V
    .locals 2

    .line 1
    iget-object p0, p0, Lyyds/ᛴᛱᛸᛸ$ᛱᲈᲁ;->ᛲᲈᲁ:Ljava/io/ByteArrayOutputStream;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/io/ByteArrayOutputStream;->size()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    const/high16 v0, 0x200000

    .line 8
    .line 9
    if-gt p0, v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const-wide v0, -0x27020e68a836eL

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᲇᲈᛵᛷ(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method private final ᛶᛷᛲᲁ(I)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-virtual {p0, v0}, Lyyds/ᛴᛱᛸᛸ$ᛱᲈᲁ;->ᲀᛲᛳᲀ(I)V

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, p1}, Lyyds/ᛴᛱᛸᛸ$ᛱᲈᲁ;->ᲇᲇᲇᛱ(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private final ᲇᲇᲇᛱ(I)V
    .locals 1

    .line 1
    ushr-int/lit8 v0, p1, 0x18

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lyyds/ᛴᛱᛸᛸ$ᛱᲈᲁ;->ᲀᛲᛳᲀ(I)V

    .line 4
    .line 5
    .line 6
    ushr-int/lit8 v0, p1, 0x10

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lyyds/ᛴᛱᛸᛸ$ᛱᲈᲁ;->ᲀᛲᛳᲀ(I)V

    .line 9
    .line 10
    .line 11
    ushr-int/lit8 v0, p1, 0x8

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lyyds/ᛴᛱᛸᛸ$ᛱᲈᲁ;->ᲀᛲᛳᲀ(I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lyyds/ᛴᛱᛸᛸ$ᛱᲈᲁ;->ᲀᛲᛳᲀ(I)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method private final ᲇᲈᛵᛷ(I)V
    .locals 1

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    const/16 v0, 0x2711

    .line 4
    .line 5
    if-ge p1, v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0, p1}, Lyyds/ᛴᛱᛸᛸ$ᛱᲈᲁ;->ᲇᲇᲇᛱ(I)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    const-wide p0, -0x26fe2e68a836eL

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᲇᲈᛵᛷ(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final ᛵᛸᛸᛷ()[B
    .locals 2

    .line 1
    iget-object p0, p0, Lyyds/ᛴᛱᛸᛸ$ᛱᲈᲁ;->ᛲᲈᲁ:Ljava/io/ByteArrayOutputStream;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-wide v0, -0x26fd1e68a836eL

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public final ᛷᲈᲈᲁ(Ljava/lang/Object;I)V
    .locals 4

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    if-gt p2, v0, :cond_f

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-virtual {p0, p1}, Lyyds/ᛴᛱᛸᛸ$ᛱᲈᲁ;->ᲀᛲᛳᲀ(I)V

    .line 9
    .line 10
    .line 11
    goto/16 :goto_2

    .line 12
    .line 13
    :cond_0
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v1, 0x1

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-virtual {p0, v1}, Lyyds/ᛴᛱᛸᛸ$ᛱᲈᲁ;->ᲀᛲᛳᲀ(I)V

    .line 23
    .line 24
    .line 25
    goto/16 :goto_2

    .line 26
    .line 27
    :cond_1
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    const/4 p1, 0x2

    .line 36
    invoke-virtual {p0, p1}, Lyyds/ᛴᛱᛸᛸ$ᛱᲈᲁ;->ᲀᛲᛳᲀ(I)V

    .line 37
    .line 38
    .line 39
    goto/16 :goto_2

    .line 40
    .line 41
    :cond_2
    instance-of v0, p1, Ljava/lang/Byte;

    .line 42
    .line 43
    if-eqz v0, :cond_3

    .line 44
    .line 45
    check-cast p1, Ljava/lang/Number;

    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/lang/Number;->byteValue()B

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    invoke-direct {p0, p1}, Lyyds/ᛴᛱᛸᛸ$ᛱᲈᲁ;->ᛶᛷᛲᲁ(I)V

    .line 52
    .line 53
    .line 54
    goto/16 :goto_2

    .line 55
    .line 56
    :cond_3
    instance-of v0, p1, Ljava/lang/Short;

    .line 57
    .line 58
    if-eqz v0, :cond_4

    .line 59
    .line 60
    check-cast p1, Ljava/lang/Number;

    .line 61
    .line 62
    invoke-virtual {p1}, Ljava/lang/Number;->shortValue()S

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    invoke-direct {p0, p1}, Lyyds/ᛴᛱᛸᛸ$ᛱᲈᲁ;->ᛶᛷᛲᲁ(I)V

    .line 67
    .line 68
    .line 69
    goto/16 :goto_2

    .line 70
    .line 71
    :cond_4
    instance-of v0, p1, Ljava/lang/Integer;

    .line 72
    .line 73
    if-eqz v0, :cond_5

    .line 74
    .line 75
    check-cast p1, Ljava/lang/Number;

    .line 76
    .line 77
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    invoke-direct {p0, p1}, Lyyds/ᛴᛱᛸᛸ$ᛱᲈᲁ;->ᛶᛷᛲᲁ(I)V

    .line 82
    .line 83
    .line 84
    goto/16 :goto_2

    .line 85
    .line 86
    :cond_5
    instance-of v0, p1, Ljava/lang/Long;

    .line 87
    .line 88
    if-eqz v0, :cond_6

    .line 89
    .line 90
    const/4 p2, 0x4

    .line 91
    invoke-virtual {p0, p2}, Lyyds/ᛴᛱᛸᛸ$ᛱᲈᲁ;->ᲀᛲᛳᲀ(I)V

    .line 92
    .line 93
    .line 94
    check-cast p1, Ljava/lang/Number;

    .line 95
    .line 96
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 97
    .line 98
    .line 99
    move-result-wide p1

    .line 100
    invoke-direct {p0, p1, p2}, Lyyds/ᛴᛱᛸᛸ$ᛱᲈᲁ;->ᛲᛳᛶᲁ(J)V

    .line 101
    .line 102
    .line 103
    goto/16 :goto_2

    .line 104
    .line 105
    :cond_6
    instance-of v0, p1, Ljava/lang/Float;

    .line 106
    .line 107
    if-eqz v0, :cond_7

    .line 108
    .line 109
    check-cast p1, Ljava/lang/Number;

    .line 110
    .line 111
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    float-to-double p1, p1

    .line 116
    invoke-direct {p0, p1, p2}, Lyyds/ᛴᛱᛸᛸ$ᛱᲈᲁ;->ᛲᛴᛳᛲ(D)V

    .line 117
    .line 118
    .line 119
    goto/16 :goto_2

    .line 120
    .line 121
    :cond_7
    instance-of v0, p1, Ljava/lang/Double;

    .line 122
    .line 123
    if-eqz v0, :cond_8

    .line 124
    .line 125
    check-cast p1, Ljava/lang/Number;

    .line 126
    .line 127
    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    .line 128
    .line 129
    .line 130
    move-result-wide p1

    .line 131
    invoke-direct {p0, p1, p2}, Lyyds/ᛴᛱᛸᛸ$ᛱᲈᲁ;->ᛲᛴᛳᛲ(D)V

    .line 132
    .line 133
    .line 134
    goto/16 :goto_2

    .line 135
    .line 136
    :cond_8
    instance-of v0, p1, Ljava/lang/String;

    .line 137
    .line 138
    if-eqz v0, :cond_9

    .line 139
    .line 140
    const/4 p2, 0x6

    .line 141
    invoke-virtual {p0, p2}, Lyyds/ᛴᛱᛸᛸ$ᛱᲈᲁ;->ᲀᛲᛳᲀ(I)V

    .line 142
    .line 143
    .line 144
    check-cast p1, Ljava/lang/String;

    .line 145
    .line 146
    sget-object p2, Lyyds/ᛲᛵᛴᛴ;->ᛲᲈᲁ:Ljava/nio/charset/Charset;

    .line 147
    .line 148
    invoke-virtual {p1, p2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    const-wide v0, -0x26fa0e68a836eL

    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    invoke-direct {p0, p1}, Lyyds/ᛴᛱᛸᛸ$ᛱᲈᲁ;->ᛱᲈᲁ([B)V

    .line 161
    .line 162
    .line 163
    goto/16 :goto_2

    .line 164
    .line 165
    :cond_9
    instance-of v0, p1, [B

    .line 166
    .line 167
    if-eqz v0, :cond_a

    .line 168
    .line 169
    const/4 p2, 0x7

    .line 170
    invoke-virtual {p0, p2}, Lyyds/ᛴᛱᛸᛸ$ᛱᲈᲁ;->ᲀᛲᛳᲀ(I)V

    .line 171
    .line 172
    .line 173
    check-cast p1, [B

    .line 174
    .line 175
    invoke-direct {p0, p1}, Lyyds/ᛴᛱᛸᛸ$ᛱᲈᲁ;->ᛱᲈᲁ([B)V

    .line 176
    .line 177
    .line 178
    goto/16 :goto_2

    .line 179
    .line 180
    :cond_a
    instance-of v0, p1, Ljava/util/List;

    .line 181
    .line 182
    if-eqz v0, :cond_b

    .line 183
    .line 184
    const/16 v0, 0x8

    .line 185
    .line 186
    invoke-virtual {p0, v0}, Lyyds/ᛴᛱᛸᛸ$ᛱᲈᲁ;->ᲀᛲᛳᲀ(I)V

    .line 187
    .line 188
    .line 189
    move-object v0, p1

    .line 190
    check-cast v0, Ljava/util/List;

    .line 191
    .line 192
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    invoke-direct {p0, v0}, Lyyds/ᛴᛱᛸᛸ$ᛱᲈᲁ;->ᲇᲈᛵᛷ(I)V

    .line 197
    .line 198
    .line 199
    check-cast p1, Ljava/lang/Iterable;

    .line 200
    .line 201
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 206
    .line 207
    .line 208
    move-result v0

    .line 209
    if-eqz v0, :cond_d

    .line 210
    .line 211
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    add-int/lit8 v2, p2, 0x1

    .line 216
    .line 217
    invoke-virtual {p0, v0, v2}, Lyyds/ᛴᛱᛸᛸ$ᛱᲈᲁ;->ᛷᲈᲈᲁ(Ljava/lang/Object;I)V

    .line 218
    .line 219
    .line 220
    goto :goto_0

    .line 221
    :cond_b
    instance-of v0, p1, Ljava/util/Map;

    .line 222
    .line 223
    if-eqz v0, :cond_c

    .line 224
    .line 225
    const/16 v0, 0x9

    .line 226
    .line 227
    invoke-virtual {p0, v0}, Lyyds/ᛴᛱᛸᛸ$ᛱᲈᲁ;->ᲀᛲᛳᲀ(I)V

    .line 228
    .line 229
    .line 230
    check-cast p1, Ljava/util/Map;

    .line 231
    .line 232
    invoke-interface {p1}, Ljava/util/Map;->size()I

    .line 233
    .line 234
    .line 235
    move-result v0

    .line 236
    invoke-direct {p0, v0}, Lyyds/ᛴᛱᛸᛸ$ᛱᲈᲁ;->ᲇᲈᛵᛷ(I)V

    .line 237
    .line 238
    .line 239
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 240
    .line 241
    .line 242
    move-result-object p1

    .line 243
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 244
    .line 245
    .line 246
    move-result-object p1

    .line 247
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 248
    .line 249
    .line 250
    move-result v0

    .line 251
    if-eqz v0, :cond_d

    .line 252
    .line 253
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    check-cast v0, Ljava/util/Map$Entry;

    .line 258
    .line 259
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v2

    .line 263
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    add-int/lit8 v3, p2, 0x1

    .line 268
    .line 269
    invoke-virtual {p0, v2, v3}, Lyyds/ᛴᛱᛸᛸ$ᛱᲈᲁ;->ᛷᲈᲈᲁ(Ljava/lang/Object;I)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {p0, v0, v3}, Lyyds/ᛴᛱᛸᛸ$ᛱᲈᲁ;->ᛷᲈᲈᲁ(Ljava/lang/Object;I)V

    .line 273
    .line 274
    .line 275
    goto :goto_1

    .line 276
    :cond_c
    instance-of v0, p1, Lkotlin/Pair;

    .line 277
    .line 278
    if-eqz v0, :cond_e

    .line 279
    .line 280
    const/16 v0, 0xa

    .line 281
    .line 282
    invoke-virtual {p0, v0}, Lyyds/ᛴᛱᛸᛸ$ᛱᲈᲁ;->ᲀᛲᛳᲀ(I)V

    .line 283
    .line 284
    .line 285
    check-cast p1, Lkotlin/Pair;

    .line 286
    .line 287
    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    add-int/2addr p2, v1

    .line 292
    invoke-virtual {p0, v0, p2}, Lyyds/ᛴᛱᛸᛸ$ᛱᲈᲁ;->ᛷᲈᲈᲁ(Ljava/lang/Object;I)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object p1

    .line 299
    invoke-virtual {p0, p1, p2}, Lyyds/ᛴᛱᛸᛸ$ᛱᲈᲁ;->ᛷᲈᲈᲁ(Ljava/lang/Object;I)V

    .line 300
    .line 301
    .line 302
    :cond_d
    :goto_2
    invoke-direct {p0}, Lyyds/ᛴᛱᛸᛸ$ᛱᲈᲁ;->ᛲᲈᲁ()V

    .line 303
    .line 304
    .line 305
    return-void

    .line 306
    :cond_e
    const-wide v0, -0x26faee68a836eL

    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object p0

    .line 315
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 316
    .line 317
    .line 318
    move-result-object p1

    .line 319
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object p1

    .line 323
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object p0

    .line 327
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 328
    .line 329
    .line 330
    return-void

    .line 331
    :cond_f
    const-wide p0, -0x26f7fe68a836eL

    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object p0

    .line 340
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 341
    .line 342
    .line 343
    return-void
.end method

.method public final ᲀᛲᛳᲀ(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lyyds/ᛴᛱᛸᛸ$ᛱᲈᲁ;->ᛲᲈᲁ:Ljava/io/ByteArrayOutputStream;

    .line 2
    .line 3
    and-int/lit16 p1, p1, 0xff

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lyyds/ᛴᛱᛸᛸ$ᛱᲈᲁ;->ᛲᲈᲁ()V

    .line 9
    .line 10
    .line 11
    return-void
.end method
