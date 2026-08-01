.class public final Lcom/google/flatbuffers/Utf8Safe;
.super Lcom/google/flatbuffers/Utf8;
.source "Utf8Safe.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/flatbuffers/Utf8Safe$UnpairedSurrogateException;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 33
    invoke-direct {p0}, Lcom/google/flatbuffers/Utf8;-><init>()V

    return-void
.end method

.method private static computeEncodedLength(Ljava/lang/CharSequence;)I
    .locals 9
    .param p0, "sequence"    # Ljava/lang/CharSequence;

    .line 45
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    .line 46
    .local v0, "utf16Length":I
    move v1, v0

    .line 47
    .local v1, "utf8Length":I
    const/4 v2, 0x0

    .line 50
    .local v2, "i":I
    :goto_0
    if-ge v2, v0, :cond_0

    invoke-interface {p0, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    const/16 v4, 0x80

    if-ge v3, v4, :cond_0

    .line 51
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 55
    :cond_0
    :goto_1
    if-ge v2, v0, :cond_2

    .line 56
    invoke-interface {p0, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    .line 57
    .local v3, "c":C
    const/16 v4, 0x800

    if-ge v3, v4, :cond_1

    .line 58
    rsub-int/lit8 v4, v3, 0x7f

    ushr-int/lit8 v4, v4, 0x1f

    add-int/2addr v1, v4

    .line 55
    .end local v3    # "c":C
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 60
    .restart local v3    # "c":C
    :cond_1
    invoke-static {p0, v2}, Lcom/google/flatbuffers/Utf8Safe;->encodedLengthGeneral(Ljava/lang/CharSequence;I)I

    move-result v4

    add-int/2addr v1, v4

    .line 61
    nop

    .line 65
    .end local v3    # "c":C
    :cond_2
    if-lt v1, v0, :cond_3

    .line 70
    return v1

    .line 67
    :cond_3
    new-instance v3, Ljava/lang/IllegalArgumentException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "UTF-8 length does not fit in int: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    int-to-long v5, v1

    const-wide v7, 0x100000000L

    add-long/2addr v5, v7

    invoke-virtual {v4, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v3
.end method

.method public static decodeUtf8Array([BII)Ljava/lang/String;
    .locals 11
    .param p0, "bytes"    # [B
    .param p1, "index"    # I
    .param p2, "size"    # I

    .line 98
    or-int v0, p1, p2

    array-length v1, p0

    sub-int/2addr v1, p1

    sub-int/2addr v1, p2

    or-int/2addr v0, v1

    if-ltz v0, :cond_b

    .line 103
    move v0, p1

    .line 104
    .local v0, "offset":I
    add-int v1, v0, p2

    .line 108
    .local v1, "limit":I
    new-array v8, p2, [C

    .line 109
    .local v8, "resultArr":[C
    const/4 v2, 0x0

    .line 113
    .local v2, "resultPos":I
    :goto_0
    if-ge v0, v1, :cond_1

    .line 114
    aget-byte v3, p0, v0

    .line 115
    .local v3, "b":B
    invoke-static {v3}, Lcom/google/flatbuffers/Utf8$DecodeUtil;->isOneByte(B)Z

    move-result v4

    if-nez v4, :cond_0

    .line 116
    goto :goto_1

    .line 118
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 119
    add-int/lit8 v4, v2, 0x1

    .end local v2    # "resultPos":I
    .local v4, "resultPos":I
    invoke-static {v3, v8, v2}, Lcom/google/flatbuffers/Utf8$DecodeUtil;->handleOneByte(B[CI)V

    .line 120
    .end local v3    # "b":B
    move v2, v4

    goto :goto_0

    .line 122
    .end local v4    # "resultPos":I
    .restart local v2    # "resultPos":I
    :cond_1
    :goto_1
    move v7, v2

    .end local v2    # "resultPos":I
    .local v7, "resultPos":I
    :goto_2
    if-ge v0, v1, :cond_a

    .line 123
    add-int/lit8 v2, v0, 0x1

    .end local v0    # "offset":I
    .local v2, "offset":I
    aget-byte v0, p0, v0

    .line 124
    .local v0, "byte1":B
    invoke-static {v0}, Lcom/google/flatbuffers/Utf8$DecodeUtil;->isOneByte(B)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 125
    add-int/lit8 v3, v7, 0x1

    .end local v7    # "resultPos":I
    .local v3, "resultPos":I
    invoke-static {v0, v8, v7}, Lcom/google/flatbuffers/Utf8$DecodeUtil;->handleOneByte(B[CI)V

    .line 128
    :goto_3
    if-ge v2, v1, :cond_3

    .line 129
    aget-byte v4, p0, v2

    .line 130
    .local v4, "b":B
    invoke-static {v4}, Lcom/google/flatbuffers/Utf8$DecodeUtil;->isOneByte(B)Z

    move-result v5

    if-nez v5, :cond_2

    .line 131
    goto :goto_4

    .line 133
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 134
    add-int/lit8 v5, v3, 0x1

    .end local v3    # "resultPos":I
    .local v5, "resultPos":I
    invoke-static {v4, v8, v3}, Lcom/google/flatbuffers/Utf8$DecodeUtil;->handleOneByte(B[CI)V

    .line 135
    .end local v4    # "b":B
    move v3, v5

    goto :goto_3

    .line 165
    .end local v0    # "byte1":B
    .end local v5    # "resultPos":I
    .restart local v3    # "resultPos":I
    :cond_3
    :goto_4
    move v0, v2

    move v7, v3

    goto :goto_5

    .line 136
    .end local v3    # "resultPos":I
    .restart local v0    # "byte1":B
    .restart local v7    # "resultPos":I
    :cond_4
    invoke-static {v0}, Lcom/google/flatbuffers/Utf8$DecodeUtil;->isTwoBytes(B)Z

    move-result v3

    const-string v4, "Invalid UTF-8"

    if-eqz v3, :cond_6

    .line 137
    if-ge v2, v1, :cond_5

    .line 140
    add-int/lit8 v3, v2, 0x1

    .end local v2    # "offset":I
    .local v3, "offset":I
    aget-byte v2, p0, v2

    add-int/lit8 v4, v7, 0x1

    .end local v7    # "resultPos":I
    .local v4, "resultPos":I
    invoke-static {v0, v2, v8, v7}, Lcom/google/flatbuffers/Utf8$DecodeUtil;->handleTwoBytes(BB[CI)V

    move v0, v3

    move v7, v4

    goto :goto_5

    .line 138
    .end local v3    # "offset":I
    .end local v4    # "resultPos":I
    .restart local v2    # "offset":I
    .restart local v7    # "resultPos":I
    :cond_5
    new-instance v3, Ljava/lang/IllegalArgumentException;

    invoke-direct {v3, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v3

    .line 141
    :cond_6
    invoke-static {v0}, Lcom/google/flatbuffers/Utf8$DecodeUtil;->isThreeBytes(B)Z

    move-result v3

    if-eqz v3, :cond_8

    .line 142
    add-int/lit8 v3, v1, -0x1

    if-ge v2, v3, :cond_7

    .line 145
    add-int/lit8 v3, v2, 0x1

    .end local v2    # "offset":I
    .restart local v3    # "offset":I
    aget-byte v2, p0, v2

    add-int/lit8 v4, v3, 0x1

    .end local v3    # "offset":I
    .local v4, "offset":I
    aget-byte v3, p0, v3

    add-int/lit8 v5, v7, 0x1

    .end local v7    # "resultPos":I
    .restart local v5    # "resultPos":I
    invoke-static {v0, v2, v3, v8, v7}, Lcom/google/flatbuffers/Utf8$DecodeUtil;->handleThreeBytes(BBB[CI)V

    move v0, v4

    move v7, v5

    goto :goto_5

    .line 143
    .end local v4    # "offset":I
    .end local v5    # "resultPos":I
    .restart local v2    # "offset":I
    .restart local v7    # "resultPos":I
    :cond_7
    new-instance v3, Ljava/lang/IllegalArgumentException;

    invoke-direct {v3, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v3

    .line 152
    :cond_8
    add-int/lit8 v3, v1, -0x2

    if-ge v2, v3, :cond_9

    .line 155
    add-int/lit8 v3, v2, 0x1

    .end local v2    # "offset":I
    .restart local v3    # "offset":I
    aget-byte v4, p0, v2

    add-int/lit8 v2, v3, 0x1

    .end local v3    # "offset":I
    .restart local v2    # "offset":I
    aget-byte v5, p0, v3

    add-int/lit8 v9, v2, 0x1

    .end local v2    # "offset":I
    .local v9, "offset":I
    aget-byte v6, p0, v2

    add-int/lit8 v10, v7, 0x1

    .end local v7    # "resultPos":I
    .local v10, "resultPos":I
    move v2, v0

    move v3, v4

    move v4, v5

    move v5, v6

    move-object v6, v8

    invoke-static/range {v2 .. v7}, Lcom/google/flatbuffers/Utf8$DecodeUtil;->handleFourBytes(BBBB[CI)V

    .line 163
    add-int/lit8 v10, v10, 0x1

    move v0, v9

    move v7, v10

    .line 165
    .end local v9    # "offset":I
    .end local v10    # "resultPos":I
    .local v0, "offset":I
    .restart local v7    # "resultPos":I
    :goto_5
    goto/16 :goto_2

    .line 153
    .local v0, "byte1":B
    .restart local v2    # "offset":I
    :cond_9
    new-instance v3, Ljava/lang/IllegalArgumentException;

    invoke-direct {v3, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v3

    .line 167
    .end local v2    # "offset":I
    .local v0, "offset":I
    :cond_a
    new-instance v2, Ljava/lang/String;

    const/4 v3, 0x0

    invoke-direct {v2, v8, v3, v7}, Ljava/lang/String;-><init>([CII)V

    return-object v2

    .line 99
    .end local v0    # "offset":I
    .end local v1    # "limit":I
    .end local v7    # "resultPos":I
    .end local v8    # "resultArr":[C
    :cond_b
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    array-length v1, p0

    .line 100
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v1, v2, v3}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "buffer length=%d, index=%d, size=%d"

    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static decodeUtf8Buffer(Ljava/nio/ByteBuffer;II)Ljava/lang/String;
    .locals 10
    .param p0, "buffer"    # Ljava/nio/ByteBuffer;
    .param p1, "offset"    # I
    .param p2, "length"    # I

    .line 173
    or-int v0, p1, p2

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->limit()I

    move-result v1

    sub-int/2addr v1, p1

    sub-int/2addr v1, p2

    or-int/2addr v0, v1

    if-ltz v0, :cond_b

    .line 179
    add-int v0, p1, p2

    .line 183
    .local v0, "limit":I
    new-array v7, p2, [C

    .line 184
    .local v7, "resultArr":[C
    const/4 v1, 0x0

    .line 188
    .local v1, "resultPos":I
    :goto_0
    if-ge p1, v0, :cond_1

    .line 189
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v2

    .line 190
    .local v2, "b":B
    invoke-static {v2}, Lcom/google/flatbuffers/Utf8$DecodeUtil;->isOneByte(B)Z

    move-result v3

    if-nez v3, :cond_0

    .line 191
    goto :goto_1

    .line 193
    :cond_0
    add-int/lit8 p1, p1, 0x1

    .line 194
    add-int/lit8 v3, v1, 0x1

    .end local v1    # "resultPos":I
    .local v3, "resultPos":I
    invoke-static {v2, v7, v1}, Lcom/google/flatbuffers/Utf8$DecodeUtil;->handleOneByte(B[CI)V

    .line 195
    .end local v2    # "b":B
    move v1, v3

    goto :goto_0

    .line 197
    .end local v3    # "resultPos":I
    .restart local v1    # "resultPos":I
    :cond_1
    :goto_1
    move v6, v1

    .end local v1    # "resultPos":I
    .local v6, "resultPos":I
    :goto_2
    if-ge p1, v0, :cond_a

    .line 198
    add-int/lit8 v1, p1, 0x1

    .end local p1    # "offset":I
    .local v1, "offset":I
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->get(I)B

    move-result p1

    .line 199
    .local p1, "byte1":B
    invoke-static {p1}, Lcom/google/flatbuffers/Utf8$DecodeUtil;->isOneByte(B)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 200
    add-int/lit8 v2, v6, 0x1

    .end local v6    # "resultPos":I
    .local v2, "resultPos":I
    invoke-static {p1, v7, v6}, Lcom/google/flatbuffers/Utf8$DecodeUtil;->handleOneByte(B[CI)V

    .line 203
    :goto_3
    if-ge v1, v0, :cond_3

    .line 204
    invoke-virtual {p0, v1}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v3

    .line 205
    .local v3, "b":B
    invoke-static {v3}, Lcom/google/flatbuffers/Utf8$DecodeUtil;->isOneByte(B)Z

    move-result v4

    if-nez v4, :cond_2

    .line 206
    goto :goto_4

    .line 208
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 209
    add-int/lit8 v4, v2, 0x1

    .end local v2    # "resultPos":I
    .local v4, "resultPos":I
    invoke-static {v3, v7, v2}, Lcom/google/flatbuffers/Utf8$DecodeUtil;->handleOneByte(B[CI)V

    .line 210
    .end local v3    # "b":B
    move v2, v4

    goto :goto_3

    .line 241
    .end local v4    # "resultPos":I
    .end local p1    # "byte1":B
    .restart local v2    # "resultPos":I
    :cond_3
    :goto_4
    move p1, v1

    move v6, v2

    goto/16 :goto_5

    .line 211
    .end local v2    # "resultPos":I
    .restart local v6    # "resultPos":I
    .restart local p1    # "byte1":B
    :cond_4
    invoke-static {p1}, Lcom/google/flatbuffers/Utf8$DecodeUtil;->isTwoBytes(B)Z

    move-result v2

    const-string v3, "Invalid UTF-8"

    if-eqz v2, :cond_6

    .line 212
    if-ge v1, v0, :cond_5

    .line 215
    add-int/lit8 v2, v1, 0x1

    .line 216
    .end local v1    # "offset":I
    .local v2, "offset":I
    invoke-virtual {p0, v1}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v1

    add-int/lit8 v3, v6, 0x1

    .line 215
    .end local v6    # "resultPos":I
    .local v3, "resultPos":I
    invoke-static {p1, v1, v7, v6}, Lcom/google/flatbuffers/Utf8$DecodeUtil;->handleTwoBytes(BB[CI)V

    move p1, v2

    move v6, v3

    goto :goto_5

    .line 213
    .end local v2    # "offset":I
    .end local v3    # "resultPos":I
    .restart local v1    # "offset":I
    .restart local v6    # "resultPos":I
    :cond_5
    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 217
    :cond_6
    invoke-static {p1}, Lcom/google/flatbuffers/Utf8$DecodeUtil;->isThreeBytes(B)Z

    move-result v2

    if-eqz v2, :cond_8

    .line 218
    add-int/lit8 v2, v0, -0x1

    if-ge v1, v2, :cond_7

    .line 221
    add-int/lit8 v2, v1, 0x1

    .line 223
    .end local v1    # "offset":I
    .restart local v2    # "offset":I
    invoke-virtual {p0, v1}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v1

    add-int/lit8 v3, v2, 0x1

    .line 224
    .end local v2    # "offset":I
    .local v3, "offset":I
    invoke-virtual {p0, v2}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v2

    add-int/lit8 v4, v6, 0x1

    .line 221
    .end local v6    # "resultPos":I
    .restart local v4    # "resultPos":I
    invoke-static {p1, v1, v2, v7, v6}, Lcom/google/flatbuffers/Utf8$DecodeUtil;->handleThreeBytes(BBB[CI)V

    move p1, v3

    move v6, v4

    goto :goto_5

    .line 219
    .end local v3    # "offset":I
    .end local v4    # "resultPos":I
    .restart local v1    # "offset":I
    .restart local v6    # "resultPos":I
    :cond_7
    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 228
    :cond_8
    add-int/lit8 v2, v0, -0x2

    if-ge v1, v2, :cond_9

    .line 231
    add-int/lit8 v2, v1, 0x1

    .line 233
    .end local v1    # "offset":I
    .restart local v2    # "offset":I
    invoke-virtual {p0, v1}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v3

    add-int/lit8 v1, v2, 0x1

    .line 234
    .end local v2    # "offset":I
    .restart local v1    # "offset":I
    invoke-virtual {p0, v2}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v4

    add-int/lit8 v8, v1, 0x1

    .line 235
    .end local v1    # "offset":I
    .local v8, "offset":I
    invoke-virtual {p0, v1}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v5

    add-int/lit8 v9, v6, 0x1

    .line 231
    .end local v6    # "resultPos":I
    .local v9, "resultPos":I
    move v1, p1

    move v2, v3

    move v3, v4

    move v4, v5

    move-object v5, v7

    invoke-static/range {v1 .. v6}, Lcom/google/flatbuffers/Utf8$DecodeUtil;->handleFourBytes(BBBB[CI)V

    .line 239
    add-int/lit8 v9, v9, 0x1

    move p1, v8

    move v6, v9

    .line 241
    .end local v8    # "offset":I
    .end local v9    # "resultPos":I
    .restart local v6    # "resultPos":I
    .local p1, "offset":I
    :goto_5
    goto/16 :goto_2

    .line 229
    .restart local v1    # "offset":I
    .local p1, "byte1":B
    :cond_9
    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 243
    .end local v1    # "offset":I
    .local p1, "offset":I
    :cond_a
    new-instance v1, Ljava/lang/String;

    const/4 v2, 0x0

    invoke-direct {v1, v7, v2, v6}, Ljava/lang/String;-><init>([CII)V

    return-object v1

    .line 174
    .end local v0    # "limit":I
    .end local v6    # "resultPos":I
    .end local v7    # "resultArr":[C
    :cond_b
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 175
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->limit()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 176
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v1, v2, v3}, [Ljava/lang/Object;

    move-result-object v1

    .line 175
    const-string v2, "buffer limit=%d, index=%d, limit=%d"

    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static encodeUtf8Array(Ljava/lang/CharSequence;[BII)I
    .locals 10
    .param p0, "in"    # Ljava/lang/CharSequence;
    .param p1, "out"    # [B
    .param p2, "offset"    # I
    .param p3, "length"    # I

    .line 340
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    .line 341
    .local v0, "utf16Length":I
    move v1, p2

    .line 342
    .local v1, "j":I
    const/4 v2, 0x0

    .line 343
    .local v2, "i":I
    add-int v3, p2, p3

    .line 346
    .local v3, "limit":I
    :goto_0
    const/16 v4, 0x80

    if-ge v2, v0, :cond_0

    add-int v5, v2, v1

    if-ge v5, v3, :cond_0

    invoke-interface {p0, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    move v6, v5

    .local v6, "c":C
    if-ge v5, v4, :cond_0

    .line 347
    add-int v4, v1, v2

    int-to-byte v5, v6

    aput-byte v5, p1, v4

    .line 346
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 349
    .end local v6    # "c":C
    :cond_0
    if-ne v2, v0, :cond_1

    .line 350
    add-int v4, v1, v0

    return v4

    .line 352
    :cond_1
    add-int/2addr v1, v2

    .line 353
    :goto_1
    if-ge v2, v0, :cond_a

    .line 354
    invoke-interface {p0, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    .line 355
    .local v5, "c":C
    if-ge v5, v4, :cond_2

    if-ge v1, v3, :cond_2

    .line 356
    add-int/lit8 v6, v1, 0x1

    .end local v1    # "j":I
    .local v6, "j":I
    int-to-byte v7, v5

    aput-byte v7, p1, v1

    move v1, v6

    goto/16 :goto_2

    .line 357
    .end local v6    # "j":I
    .restart local v1    # "j":I
    :cond_2
    const/16 v6, 0x800

    if-ge v5, v6, :cond_3

    add-int/lit8 v6, v3, -0x2

    if-gt v1, v6, :cond_3

    .line 358
    add-int/lit8 v6, v1, 0x1

    .end local v1    # "j":I
    .restart local v6    # "j":I
    ushr-int/lit8 v7, v5, 0x6

    or-int/lit16 v7, v7, 0x3c0

    int-to-byte v7, v7

    aput-byte v7, p1, v1

    .line 359
    add-int/lit8 v1, v6, 0x1

    .end local v6    # "j":I
    .restart local v1    # "j":I
    and-int/lit8 v7, v5, 0x3f

    or-int/2addr v7, v4

    int-to-byte v7, v7

    aput-byte v7, p1, v6

    goto :goto_2

    .line 360
    :cond_3
    const v6, 0xdfff

    const v7, 0xd800

    if-lt v5, v7, :cond_4

    if-ge v6, v5, :cond_5

    :cond_4
    add-int/lit8 v8, v3, -0x3

    if-gt v1, v8, :cond_5

    .line 362
    add-int/lit8 v6, v1, 0x1

    .end local v1    # "j":I
    .restart local v6    # "j":I
    ushr-int/lit8 v7, v5, 0xc

    or-int/lit16 v7, v7, 0x1e0

    int-to-byte v7, v7

    aput-byte v7, p1, v1

    .line 363
    add-int/lit8 v1, v6, 0x1

    .end local v6    # "j":I
    .restart local v1    # "j":I
    ushr-int/lit8 v7, v5, 0x6

    and-int/lit8 v7, v7, 0x3f

    or-int/2addr v7, v4

    int-to-byte v7, v7

    aput-byte v7, p1, v6

    .line 364
    add-int/lit8 v6, v1, 0x1

    .end local v1    # "j":I
    .restart local v6    # "j":I
    and-int/lit8 v7, v5, 0x3f

    or-int/2addr v7, v4

    int-to-byte v7, v7

    aput-byte v7, p1, v1

    move v1, v6

    goto :goto_2

    .line 365
    .end local v6    # "j":I
    .restart local v1    # "j":I
    :cond_5
    add-int/lit8 v8, v3, -0x4

    if-gt v1, v8, :cond_7

    .line 369
    add-int/lit8 v6, v2, 0x1

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v7

    if-eq v6, v7, :cond_6

    add-int/lit8 v2, v2, 0x1

    .line 370
    invoke-interface {p0, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v6

    move v7, v6

    .local v7, "low":C
    invoke-static {v5, v6}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    move-result v6

    if-eqz v6, :cond_6

    .line 373
    invoke-static {v5, v7}, Ljava/lang/Character;->toCodePoint(CC)I

    move-result v6

    .line 374
    .local v6, "codePoint":I
    add-int/lit8 v8, v1, 0x1

    .end local v1    # "j":I
    .local v8, "j":I
    ushr-int/lit8 v9, v6, 0x12

    or-int/lit16 v9, v9, 0xf0

    int-to-byte v9, v9

    aput-byte v9, p1, v1

    .line 375
    add-int/lit8 v1, v8, 0x1

    .end local v8    # "j":I
    .restart local v1    # "j":I
    ushr-int/lit8 v9, v6, 0xc

    and-int/lit8 v9, v9, 0x3f

    or-int/2addr v9, v4

    int-to-byte v9, v9

    aput-byte v9, p1, v8

    .line 376
    add-int/lit8 v8, v1, 0x1

    .end local v1    # "j":I
    .restart local v8    # "j":I
    ushr-int/lit8 v9, v6, 0x6

    and-int/lit8 v9, v9, 0x3f

    or-int/2addr v9, v4

    int-to-byte v9, v9

    aput-byte v9, p1, v1

    .line 377
    add-int/lit8 v1, v8, 0x1

    .end local v8    # "j":I
    .restart local v1    # "j":I
    and-int/lit8 v9, v6, 0x3f

    or-int/2addr v9, v4

    int-to-byte v9, v9

    aput-byte v9, p1, v8

    .line 378
    .end local v6    # "codePoint":I
    .end local v7    # "low":C
    nop

    .line 353
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_1

    .line 371
    :cond_6
    new-instance v4, Lcom/google/flatbuffers/Utf8Safe$UnpairedSurrogateException;

    add-int/lit8 v6, v2, -0x1

    invoke-direct {v4, v6, v0}, Lcom/google/flatbuffers/Utf8Safe$UnpairedSurrogateException;-><init>(II)V

    throw v4

    .line 381
    :cond_7
    if-gt v7, v5, :cond_9

    if-gt v5, v6, :cond_9

    add-int/lit8 v4, v2, 0x1

    .line 382
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v6

    if-eq v4, v6, :cond_8

    add-int/lit8 v4, v2, 0x1

    .line 383
    invoke-interface {p0, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    invoke-static {v5, v4}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    move-result v4

    if-nez v4, :cond_9

    .line 384
    :cond_8
    new-instance v4, Lcom/google/flatbuffers/Utf8Safe$UnpairedSurrogateException;

    invoke-direct {v4, v2, v0}, Lcom/google/flatbuffers/Utf8Safe$UnpairedSurrogateException;-><init>(II)V

    throw v4

    .line 386
    :cond_9
    new-instance v4, Ljava/lang/ArrayIndexOutOfBoundsException;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Failed writing "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, " at index "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v4, v6}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v4

    .line 389
    .end local v5    # "c":C
    :cond_a
    return v1
.end method

.method private static encodeUtf8Buffer(Ljava/lang/CharSequence;Ljava/nio/ByteBuffer;)V
    .locals 9
    .param p0, "in"    # Ljava/lang/CharSequence;
    .param p1, "out"    # Ljava/nio/ByteBuffer;

    .line 268
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    .line 269
    .local v0, "inLength":I
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->position()I

    move-result v1

    .line 270
    .local v1, "outIx":I
    const/4 v2, 0x0

    .line 278
    .local v2, "inIx":I
    :goto_0
    const/16 v3, 0x80

    if-ge v2, v0, :cond_0

    :try_start_0
    invoke-interface {p0, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    move v5, v4

    .local v5, "c":C
    if-ge v4, v3, :cond_0

    .line 279
    add-int v3, v1, v2

    int-to-byte v4, v5

    invoke-virtual {p1, v3, v4}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 278
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 327
    .end local v5    # "c":C
    :catch_0
    move-exception v3

    goto/16 :goto_4

    .line 281
    :cond_0
    if-ne v2, v0, :cond_1

    .line 283
    add-int v3, v1, v2

    invoke-virtual {p1, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 284
    return-void

    .line 287
    :cond_1
    add-int/2addr v1, v2

    .line 288
    :goto_1
    if-ge v2, v0, :cond_7

    .line 289
    invoke-interface {p0, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    .line 290
    .local v4, "c":C
    if-ge v4, v3, :cond_2

    .line 292
    int-to-byte v5, v4

    invoke-virtual {p1, v1, v5}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_3

    .line 293
    :cond_2
    const/16 v5, 0x800

    if-ge v4, v5, :cond_3

    .line 297
    add-int/lit8 v5, v1, 0x1

    .end local v1    # "outIx":I
    .local v5, "outIx":I
    ushr-int/lit8 v6, v4, 0x6

    or-int/lit16 v6, v6, 0xc0

    int-to-byte v6, v6

    :try_start_1
    invoke-virtual {p1, v1, v6}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 298
    and-int/lit8 v1, v4, 0x3f

    or-int/2addr v1, v3

    int-to-byte v1, v1

    invoke-virtual {p1, v5, v1}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;
    :try_end_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_1

    move v1, v5

    goto/16 :goto_3

    .line 327
    .end local v4    # "c":C
    :catch_1
    move-exception v3

    move v1, v5

    goto/16 :goto_4

    .line 299
    .end local v5    # "outIx":I
    .restart local v1    # "outIx":I
    .restart local v4    # "c":C
    :cond_3
    const v5, 0xd800

    if-lt v4, v5, :cond_6

    const v5, 0xdfff

    if-ge v5, v4, :cond_4

    goto :goto_2

    .line 313
    :cond_4
    add-int/lit8 v5, v2, 0x1

    if-eq v5, v0, :cond_5

    add-int/lit8 v2, v2, 0x1

    :try_start_2
    invoke-interface {p0, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    move v6, v5

    .local v6, "low":C
    invoke-static {v4, v5}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    move-result v5

    if-eqz v5, :cond_5

    .line 317
    invoke-static {v4, v6}, Ljava/lang/Character;->toCodePoint(CC)I

    move-result v5
    :try_end_2
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_2 .. :try_end_2} :catch_0

    .line 318
    .local v5, "codePoint":I
    add-int/lit8 v7, v1, 0x1

    .end local v1    # "outIx":I
    .local v7, "outIx":I
    ushr-int/lit8 v8, v5, 0x12

    or-int/lit16 v8, v8, 0xf0

    int-to-byte v8, v8

    :try_start_3
    invoke-virtual {p1, v1, v8}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;
    :try_end_3
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_3 .. :try_end_3} :catch_2

    .line 319
    add-int/lit8 v1, v7, 0x1

    .end local v7    # "outIx":I
    .restart local v1    # "outIx":I
    ushr-int/lit8 v8, v5, 0xc

    and-int/lit8 v8, v8, 0x3f

    or-int/2addr v8, v3

    int-to-byte v8, v8

    :try_start_4
    invoke-virtual {p1, v7, v8}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;
    :try_end_4
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_4 .. :try_end_4} :catch_0

    .line 320
    add-int/lit8 v7, v1, 0x1

    .end local v1    # "outIx":I
    .restart local v7    # "outIx":I
    ushr-int/lit8 v8, v5, 0x6

    and-int/lit8 v8, v8, 0x3f

    or-int/2addr v8, v3

    int-to-byte v8, v8

    :try_start_5
    invoke-virtual {p1, v1, v8}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 321
    and-int/lit8 v1, v5, 0x3f

    or-int/2addr v1, v3

    int-to-byte v1, v1

    invoke-virtual {p1, v7, v1}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;
    :try_end_5
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_5 .. :try_end_5} :catch_2

    move v1, v7

    goto :goto_3

    .line 327
    .end local v4    # "c":C
    .end local v5    # "codePoint":I
    .end local v6    # "low":C
    :catch_2
    move-exception v3

    move v1, v7

    goto :goto_4

    .line 314
    .end local v7    # "outIx":I
    .restart local v1    # "outIx":I
    .restart local v4    # "c":C
    :cond_5
    :try_start_6
    new-instance v3, Lcom/google/flatbuffers/Utf8Safe$UnpairedSurrogateException;

    invoke-direct {v3, v2, v0}, Lcom/google/flatbuffers/Utf8Safe$UnpairedSurrogateException;-><init>(II)V

    .end local v0    # "inLength":I
    .end local v1    # "outIx":I
    .end local v2    # "inIx":I
    .end local p0    # "in":Ljava/lang/CharSequence;
    .end local p1    # "out":Ljava/nio/ByteBuffer;
    throw v3
    :try_end_6
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_6 .. :try_end_6} :catch_0

    .line 304
    .restart local v0    # "inLength":I
    .restart local v1    # "outIx":I
    .restart local v2    # "inIx":I
    .restart local p0    # "in":Ljava/lang/CharSequence;
    .restart local p1    # "out":Ljava/nio/ByteBuffer;
    :cond_6
    :goto_2
    add-int/lit8 v5, v1, 0x1

    .end local v1    # "outIx":I
    .local v5, "outIx":I
    ushr-int/lit8 v6, v4, 0xc

    or-int/lit16 v6, v6, 0xe0

    int-to-byte v6, v6

    :try_start_7
    invoke-virtual {p1, v1, v6}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;
    :try_end_7
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_7 .. :try_end_7} :catch_1

    .line 305
    add-int/lit8 v1, v5, 0x1

    .end local v5    # "outIx":I
    .restart local v1    # "outIx":I
    ushr-int/lit8 v6, v4, 0x6

    and-int/lit8 v6, v6, 0x3f

    or-int/2addr v6, v3

    int-to-byte v6, v6

    :try_start_8
    invoke-virtual {p1, v5, v6}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 306
    and-int/lit8 v5, v4, 0x3f

    or-int/2addr v5, v3

    int-to-byte v5, v5

    invoke-virtual {p1, v1, v5}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 288
    :goto_3
    add-int/lit8 v2, v2, 0x1

    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_1

    .line 326
    .end local v4    # "c":C
    :cond_7
    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;
    :try_end_8
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_8 .. :try_end_8} :catch_0

    .line 335
    nop

    .line 336
    return-void

    .line 332
    .local v3, "e":Ljava/lang/IndexOutOfBoundsException;
    :goto_4
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->position()I

    move-result v4

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->position()I

    move-result v5

    sub-int v5, v1, v5

    add-int/lit8 v5, v5, 0x1

    invoke-static {v2, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    add-int/2addr v4, v5

    .line 333
    .local v4, "badWriteIndex":I
    new-instance v5, Ljava/lang/ArrayIndexOutOfBoundsException;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Failed writing "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    .line 334
    invoke-interface {p0, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, " at index "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v5
.end method

.method private static encodedLengthGeneral(Ljava/lang/CharSequence;I)I
    .locals 6
    .param p0, "sequence"    # Ljava/lang/CharSequence;
    .param p1, "start"    # I

    .line 74
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    .line 75
    .local v0, "utf16Length":I
    const/4 v1, 0x0

    .line 76
    .local v1, "utf8Length":I
    move v2, p1

    .local v2, "i":I
    :goto_0
    if-ge v2, v0, :cond_3

    .line 77
    invoke-interface {p0, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    .line 78
    .local v3, "c":C
    const/16 v4, 0x800

    if-ge v3, v4, :cond_0

    .line 79
    rsub-int/lit8 v4, v3, 0x7f

    ushr-int/lit8 v4, v4, 0x1f

    add-int/2addr v1, v4

    goto :goto_1

    .line 81
    :cond_0
    add-int/lit8 v1, v1, 0x2

    .line 83
    const v4, 0xd800

    if-gt v4, v3, :cond_2

    const v4, 0xdfff

    if-gt v3, v4, :cond_2

    .line 85
    invoke-static {p0, v2}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v4

    .line 86
    .local v4, "cp":I
    const/high16 v5, 0x10000

    if-lt v4, v5, :cond_1

    .line 89
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 87
    :cond_1
    new-instance v5, Lcom/google/flatbuffers/Utf8Safe$UnpairedSurrogateException;

    invoke-direct {v5, v2, v0}, Lcom/google/flatbuffers/Utf8Safe$UnpairedSurrogateException;-><init>(II)V

    throw v5

    .line 76
    .end local v3    # "c":C
    .end local v4    # "cp":I
    :cond_2
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 93
    .end local v2    # "i":I
    :cond_3
    return v1
.end method


# virtual methods
.method public decodeUtf8(Ljava/nio/ByteBuffer;II)Ljava/lang/String;
    .locals 2
    .param p1, "buffer"    # Ljava/nio/ByteBuffer;
    .param p2, "offset"    # I
    .param p3, "length"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .line 259
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->hasArray()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 260
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result v1

    add-int/2addr v1, p2

    invoke-static {v0, v1, p3}, Lcom/google/flatbuffers/Utf8Safe;->decodeUtf8Array([BII)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 262
    :cond_0
    invoke-static {p1, p2, p3}, Lcom/google/flatbuffers/Utf8Safe;->decodeUtf8Buffer(Ljava/nio/ByteBuffer;II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public encodeUtf8(Ljava/lang/CharSequence;Ljava/nio/ByteBuffer;)V
    .locals 4
    .param p1, "in"    # Ljava/lang/CharSequence;
    .param p2, "out"    # Ljava/nio/ByteBuffer;

    .line 403
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->hasArray()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 404
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result v0

    .line 405
    .local v0, "start":I
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->position()I

    move-result v2

    add-int/2addr v2, v0

    .line 406
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v3

    .line 405
    invoke-static {p1, v1, v2, v3}, Lcom/google/flatbuffers/Utf8Safe;->encodeUtf8Array(Ljava/lang/CharSequence;[BII)I

    move-result v1

    .line 407
    .local v1, "end":I
    sub-int v2, v1, v0

    invoke-virtual {p2, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 408
    .end local v0    # "start":I
    .end local v1    # "end":I
    goto :goto_0

    .line 409
    :cond_0
    invoke-static {p1, p2}, Lcom/google/flatbuffers/Utf8Safe;->encodeUtf8Buffer(Ljava/lang/CharSequence;Ljava/nio/ByteBuffer;)V

    .line 411
    :goto_0
    return-void
.end method

.method public encodedLength(Ljava/lang/CharSequence;)I
    .locals 1
    .param p1, "in"    # Ljava/lang/CharSequence;

    .line 248
    invoke-static {p1}, Lcom/google/flatbuffers/Utf8Safe;->computeEncodedLength(Ljava/lang/CharSequence;)I

    move-result v0

    return v0
.end method
