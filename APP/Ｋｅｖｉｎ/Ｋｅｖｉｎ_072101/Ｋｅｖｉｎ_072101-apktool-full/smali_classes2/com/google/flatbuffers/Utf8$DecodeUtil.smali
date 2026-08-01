.class Lcom/google/flatbuffers/Utf8$DecodeUtil;
.super Ljava/lang/Object;
.source "Utf8.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/flatbuffers/Utf8;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "DecodeUtil"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 135
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static handleFourBytes(BBBB[CI)V
    .locals 3
    .param p0, "byte1"    # B
    .param p1, "byte2"    # B
    .param p2, "byte3"    # B
    .param p3, "byte4"    # B
    .param p4, "resultArr"    # [C
    .param p5, "resultPos"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .line 194
    invoke-static {p1}, Lcom/google/flatbuffers/Utf8$DecodeUtil;->isNotTrailingByte(B)Z

    move-result v0

    if-nez v0, :cond_0

    shl-int/lit8 v0, p0, 0x1c

    add-int/lit8 v1, p1, 0x70

    add-int/2addr v0, v1

    shr-int/lit8 v0, v0, 0x1e

    if-nez v0, :cond_0

    .line 203
    invoke-static {p2}, Lcom/google/flatbuffers/Utf8$DecodeUtil;->isNotTrailingByte(B)Z

    move-result v0

    if-nez v0, :cond_0

    .line 204
    invoke-static {p3}, Lcom/google/flatbuffers/Utf8$DecodeUtil;->isNotTrailingByte(B)Z

    move-result v0

    if-nez v0, :cond_0

    .line 207
    and-int/lit8 v0, p0, 0x7

    shl-int/lit8 v0, v0, 0x12

    .line 208
    invoke-static {p1}, Lcom/google/flatbuffers/Utf8$DecodeUtil;->trailingByteValue(B)I

    move-result v1

    shl-int/lit8 v1, v1, 0xc

    or-int/2addr v0, v1

    .line 209
    invoke-static {p2}, Lcom/google/flatbuffers/Utf8$DecodeUtil;->trailingByteValue(B)I

    move-result v1

    shl-int/lit8 v1, v1, 0x6

    or-int/2addr v0, v1

    .line 210
    invoke-static {p3}, Lcom/google/flatbuffers/Utf8$DecodeUtil;->trailingByteValue(B)I

    move-result v1

    or-int/2addr v0, v1

    .line 211
    .local v0, "codepoint":I
    invoke-static {v0}, Lcom/google/flatbuffers/Utf8$DecodeUtil;->highSurrogate(I)C

    move-result v1

    aput-char v1, p4, p5

    .line 212
    add-int/lit8 v1, p5, 0x1

    invoke-static {v0}, Lcom/google/flatbuffers/Utf8$DecodeUtil;->lowSurrogate(I)C

    move-result v2

    aput-char v2, p4, v1

    .line 213
    return-void

    .line 205
    .end local v0    # "codepoint":I
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid UTF-8"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method static handleOneByte(B[CI)V
    .locals 1
    .param p0, "byte1"    # B
    .param p1, "resultArr"    # [C
    .param p2, "resultPos"    # I

    .line 159
    int-to-char v0, p0

    aput-char v0, p1, p2

    .line 160
    return-void
.end method

.method static handleThreeBytes(BBB[CI)V
    .locals 2
    .param p0, "byte1"    # B
    .param p1, "byte2"    # B
    .param p2, "byte3"    # B
    .param p3, "resultArr"    # [C
    .param p4, "resultPos"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .line 179
    invoke-static {p1}, Lcom/google/flatbuffers/Utf8$DecodeUtil;->isNotTrailingByte(B)Z

    move-result v0

    if-nez v0, :cond_2

    const/16 v0, -0x20

    const/16 v1, -0x60

    if-ne p0, v0, :cond_0

    if-lt p1, v1, :cond_2

    :cond_0
    const/16 v0, -0x13

    if-ne p0, v0, :cond_1

    if-ge p1, v1, :cond_2

    .line 184
    :cond_1
    invoke-static {p2}, Lcom/google/flatbuffers/Utf8$DecodeUtil;->isNotTrailingByte(B)Z

    move-result v0

    if-nez v0, :cond_2

    .line 187
    and-int/lit8 v0, p0, 0xf

    shl-int/lit8 v0, v0, 0xc

    .line 188
    invoke-static {p1}, Lcom/google/flatbuffers/Utf8$DecodeUtil;->trailingByteValue(B)I

    move-result v1

    shl-int/lit8 v1, v1, 0x6

    or-int/2addr v0, v1

    invoke-static {p2}, Lcom/google/flatbuffers/Utf8$DecodeUtil;->trailingByteValue(B)I

    move-result v1

    or-int/2addr v0, v1

    int-to-char v0, v0

    aput-char v0, p3, p4

    .line 189
    return-void

    .line 185
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid UTF-8"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method static handleTwoBytes(BB[CI)V
    .locals 2
    .param p0, "byte1"    # B
    .param p1, "byte2"    # B
    .param p2, "resultArr"    # [C
    .param p3, "resultPos"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .line 167
    const/16 v0, -0x3e

    if-lt p0, v0, :cond_1

    .line 170
    invoke-static {p1}, Lcom/google/flatbuffers/Utf8$DecodeUtil;->isNotTrailingByte(B)Z

    move-result v0

    if-nez v0, :cond_0

    .line 173
    and-int/lit8 v0, p0, 0x1f

    shl-int/lit8 v0, v0, 0x6

    invoke-static {p1}, Lcom/google/flatbuffers/Utf8$DecodeUtil;->trailingByteValue(B)I

    move-result v1

    or-int/2addr v0, v1

    int-to-char v0, v0

    aput-char v0, p2, p3

    .line 174
    return-void

    .line 171
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid UTF-8: Illegal trailing byte in 2 bytes utf"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 168
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid UTF-8: Illegal leading byte in 2 bytes utf"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static highSurrogate(I)C
    .locals 2
    .param p0, "codePoint"    # I

    .line 230
    ushr-int/lit8 v0, p0, 0xa

    const v1, 0xd7c0

    add-int/2addr v0, v1

    int-to-char v0, v0

    return v0
.end method

.method private static isNotTrailingByte(B)Z
    .locals 1
    .param p0, "b"    # B

    .line 219
    const/16 v0, -0x41

    if-le p0, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method static isOneByte(B)Z
    .locals 1
    .param p0, "b"    # B

    .line 141
    if-ltz p0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method static isThreeBytes(B)Z
    .locals 1
    .param p0, "b"    # B

    .line 155
    const/16 v0, -0x10

    if-ge p0, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method static isTwoBytes(B)Z
    .locals 1
    .param p0, "b"    # B

    .line 148
    const/16 v0, -0x20

    if-ge p0, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private static lowSurrogate(I)C
    .locals 2
    .param p0, "codePoint"    # I

    .line 235
    and-int/lit16 v0, p0, 0x3ff

    const v1, 0xdc00

    add-int/2addr v0, v1

    int-to-char v0, v0

    return v0
.end method

.method private static trailingByteValue(B)I
    .locals 1
    .param p0, "b"    # B

    .line 226
    and-int/lit8 v0, p0, 0x3f

    return v0
.end method
