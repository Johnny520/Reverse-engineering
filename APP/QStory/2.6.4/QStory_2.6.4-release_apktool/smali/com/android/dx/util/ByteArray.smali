.class public final Lcom/android/dx/util/ByteArray;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/dx/util/ByteArray$MyDataInputStream;,
        Lcom/android/dx/util/ByteArray$MyInputStream;,
        Lcom/android/dx/util/ByteArray$GetCursor;
    }
.end annotation


# instance fields
.field private final bytes:[B

.field private final size:I

.field private final start:I


# direct methods
.method public constructor <init>([B)V
    .locals 2

    const/4 v0, 0x0

    .line 46
    array-length v1, p1

    invoke-direct {p0, p1, v0, v1}, Lcom/android/dx/util/ByteArray;-><init>([BII)V

    return-void
.end method

.method public constructor <init>([BII)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-eqz p1, :cond_3

    .line 6
    .line 7
    if-ltz p2, :cond_2

    .line 8
    .line 9
    if-lt p3, p2, :cond_1

    .line 10
    .line 11
    array-length v1, p1

    .line 12
    if-gt p3, v1, :cond_0

    .line 13
    .line 14
    iput-object p1, p0, Lcom/android/dx/util/ByteArray;->bytes:[B

    .line 15
    .line 16
    iput p2, p0, Lcom/android/dx/util/ByteArray;->start:I

    .line 17
    .line 18
    sub-int/2addr p3, p2

    .line 19
    iput p3, p0, Lcom/android/dx/util/ByteArray;->size:I

    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    const-string p0, "end > bytes.length"

    .line 23
    .line 24
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw v0

    .line 28
    :cond_1
    const-string p0, "end < start"

    .line 29
    .line 30
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw v0

    .line 34
    :cond_2
    const-string p0, "start < 0"

    .line 35
    .line 36
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw v0

    .line 40
    :cond_3
    const-string p0, "bytes == null"

    .line 41
    .line 42
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw v0
.end method

.method public static synthetic access$000(Lcom/android/dx/util/ByteArray;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/util/ByteArray;->size:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$100(Lcom/android/dx/util/ByteArray;I)I
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/android/dx/util/ByteArray;->getUnsignedByte0(I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic access$200(Lcom/android/dx/util/ByteArray;)[B
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/util/ByteArray;->bytes:[B

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$300(Lcom/android/dx/util/ByteArray;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/util/ByteArray;->start:I

    .line 2
    .line 3
    return p0
.end method

.method private checkOffsets(II)V
    .locals 3

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    if-lt p2, p1, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lcom/android/dx/util/ByteArray;->size:I

    .line 6
    .line 7
    if-gt p2, v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const-string v0, ".."

    .line 11
    .line 12
    const-string v1, "; actual size "

    .line 13
    .line 14
    const-string v2, "bad range: "

    .line 15
    .line 16
    invoke-static {p1, p2, v2, v0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲世苏(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget p0, p0, Lcom/android/dx/util/ByteArray;->size:I

    .line 21
    .line 22
    invoke-static {p1, p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏兰哲世(Ljava/lang/StringBuilder;I)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method private getByte0(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/dx/util/ByteArray;->bytes:[B

    .line 2
    .line 3
    iget p0, p0, Lcom/android/dx/util/ByteArray;->start:I

    .line 4
    .line 5
    add-int/2addr p0, p1

    .line 6
    aget-byte p0, v0, p0

    .line 7
    .line 8
    return p0
.end method

.method private getUnsignedByte0(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/dx/util/ByteArray;->bytes:[B

    .line 2
    .line 3
    iget p0, p0, Lcom/android/dx/util/ByteArray;->start:I

    .line 4
    .line 5
    add-int/2addr p0, p1

    .line 6
    aget-byte p0, v0, p0

    .line 7
    .line 8
    and-int/lit16 p0, p0, 0xff

    .line 9
    .line 10
    return p0
.end method


# virtual methods
.method public getByte(I)I
    .locals 1

    .line 1
    add-int/lit8 v0, p1, 0x1

    .line 2
    .line 3
    invoke-direct {p0, p1, v0}, Lcom/android/dx/util/ByteArray;->checkOffsets(II)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/android/dx/util/ByteArray;->getByte0(I)I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method

.method public getBytes([BI)V
    .locals 2

    .line 1
    array-length v0, p1

    .line 2
    sub-int/2addr v0, p2

    .line 3
    iget v1, p0, Lcom/android/dx/util/ByteArray;->size:I

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/android/dx/util/ByteArray;->bytes:[B

    .line 8
    .line 9
    iget p0, p0, Lcom/android/dx/util/ByteArray;->start:I

    .line 10
    .line 11
    invoke-static {v0, p0, p1, p2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    const-string p0, "(out.length - offset) < size()"

    .line 16
    .line 17
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public getInt(I)I
    .locals 2

    .line 1
    add-int/lit8 v0, p1, 0x4

    .line 2
    .line 3
    invoke-direct {p0, p1, v0}, Lcom/android/dx/util/ByteArray;->checkOffsets(II)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/android/dx/util/ByteArray;->getByte0(I)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    shl-int/lit8 v0, v0, 0x18

    .line 11
    .line 12
    add-int/lit8 v1, p1, 0x1

    .line 13
    .line 14
    invoke-direct {p0, v1}, Lcom/android/dx/util/ByteArray;->getUnsignedByte0(I)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    shl-int/lit8 v1, v1, 0x10

    .line 19
    .line 20
    or-int/2addr v0, v1

    .line 21
    add-int/lit8 v1, p1, 0x2

    .line 22
    .line 23
    invoke-direct {p0, v1}, Lcom/android/dx/util/ByteArray;->getUnsignedByte0(I)I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    shl-int/lit8 v1, v1, 0x8

    .line 28
    .line 29
    or-int/2addr v0, v1

    .line 30
    add-int/lit8 p1, p1, 0x3

    .line 31
    .line 32
    invoke-direct {p0, p1}, Lcom/android/dx/util/ByteArray;->getUnsignedByte0(I)I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    or-int/2addr p0, v0

    .line 37
    return p0
.end method

.method public getLong(I)J
    .locals 3

    .line 1
    add-int/lit8 v0, p1, 0x8

    .line 2
    .line 3
    invoke-direct {p0, p1, v0}, Lcom/android/dx/util/ByteArray;->checkOffsets(II)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/android/dx/util/ByteArray;->getByte0(I)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    shl-int/lit8 v0, v0, 0x18

    .line 11
    .line 12
    add-int/lit8 v1, p1, 0x1

    .line 13
    .line 14
    invoke-direct {p0, v1}, Lcom/android/dx/util/ByteArray;->getUnsignedByte0(I)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    shl-int/lit8 v1, v1, 0x10

    .line 19
    .line 20
    or-int/2addr v0, v1

    .line 21
    add-int/lit8 v1, p1, 0x2

    .line 22
    .line 23
    invoke-direct {p0, v1}, Lcom/android/dx/util/ByteArray;->getUnsignedByte0(I)I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    shl-int/lit8 v1, v1, 0x8

    .line 28
    .line 29
    or-int/2addr v0, v1

    .line 30
    add-int/lit8 v1, p1, 0x3

    .line 31
    .line 32
    invoke-direct {p0, v1}, Lcom/android/dx/util/ByteArray;->getUnsignedByte0(I)I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    or-int/2addr v0, v1

    .line 37
    add-int/lit8 v1, p1, 0x4

    .line 38
    .line 39
    invoke-direct {p0, v1}, Lcom/android/dx/util/ByteArray;->getByte0(I)I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    shl-int/lit8 v1, v1, 0x18

    .line 44
    .line 45
    add-int/lit8 v2, p1, 0x5

    .line 46
    .line 47
    invoke-direct {p0, v2}, Lcom/android/dx/util/ByteArray;->getUnsignedByte0(I)I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    shl-int/lit8 v2, v2, 0x10

    .line 52
    .line 53
    or-int/2addr v1, v2

    .line 54
    add-int/lit8 v2, p1, 0x6

    .line 55
    .line 56
    invoke-direct {p0, v2}, Lcom/android/dx/util/ByteArray;->getUnsignedByte0(I)I

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    shl-int/lit8 v2, v2, 0x8

    .line 61
    .line 62
    or-int/2addr v1, v2

    .line 63
    add-int/lit8 p1, p1, 0x7

    .line 64
    .line 65
    invoke-direct {p0, p1}, Lcom/android/dx/util/ByteArray;->getUnsignedByte0(I)I

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    or-int/2addr p0, v1

    .line 70
    int-to-long p0, p0

    .line 71
    const-wide v1, 0xffffffffL

    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    and-long/2addr p0, v1

    .line 77
    int-to-long v0, v0

    .line 78
    const/16 v2, 0x20

    .line 79
    .line 80
    shl-long/2addr v0, v2

    .line 81
    or-long/2addr p0, v0

    .line 82
    return-wide p0
.end method

.method public getShort(I)I
    .locals 1

    .line 1
    add-int/lit8 v0, p1, 0x2

    .line 2
    .line 3
    invoke-direct {p0, p1, v0}, Lcom/android/dx/util/ByteArray;->checkOffsets(II)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/android/dx/util/ByteArray;->getByte0(I)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    shl-int/lit8 v0, v0, 0x8

    .line 11
    .line 12
    add-int/lit8 p1, p1, 0x1

    .line 13
    .line 14
    invoke-direct {p0, p1}, Lcom/android/dx/util/ByteArray;->getUnsignedByte0(I)I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    or-int/2addr p0, v0

    .line 19
    return p0
.end method

.method public getUnsignedByte(I)I
    .locals 1

    .line 1
    add-int/lit8 v0, p1, 0x1

    .line 2
    .line 3
    invoke-direct {p0, p1, v0}, Lcom/android/dx/util/ByteArray;->checkOffsets(II)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/android/dx/util/ByteArray;->getUnsignedByte0(I)I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method

.method public getUnsignedShort(I)I
    .locals 1

    .line 1
    add-int/lit8 v0, p1, 0x2

    .line 2
    .line 3
    invoke-direct {p0, p1, v0}, Lcom/android/dx/util/ByteArray;->checkOffsets(II)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/android/dx/util/ByteArray;->getUnsignedByte0(I)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    shl-int/lit8 v0, v0, 0x8

    .line 11
    .line 12
    add-int/lit8 p1, p1, 0x1

    .line 13
    .line 14
    invoke-direct {p0, p1}, Lcom/android/dx/util/ByteArray;->getUnsignedByte0(I)I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    or-int/2addr p0, v0

    .line 19
    return p0
.end method

.method public makeDataInputStream()Lcom/android/dx/util/ByteArray$MyDataInputStream;
    .locals 1

    .line 1
    new-instance v0, Lcom/android/dx/util/ByteArray$MyDataInputStream;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/util/ByteArray;->makeInputStream()Lcom/android/dx/util/ByteArray$MyInputStream;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-direct {v0, p0}, Lcom/android/dx/util/ByteArray$MyDataInputStream;-><init>(Lcom/android/dx/util/ByteArray$MyInputStream;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public makeInputStream()Lcom/android/dx/util/ByteArray$MyInputStream;
    .locals 1

    .line 1
    new-instance v0, Lcom/android/dx/util/ByteArray$MyInputStream;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/android/dx/util/ByteArray$MyInputStream;-><init>(Lcom/android/dx/util/ByteArray;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public size()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/util/ByteArray;->size:I

    .line 2
    .line 3
    return p0
.end method

.method public slice(II)Lcom/android/dx/util/ByteArray;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/android/dx/util/ByteArray;->checkOffsets(II)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/android/dx/util/ByteArray;->bytes:[B

    .line 5
    .line 6
    invoke-static {p0, p1, p2}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    new-instance p1, Lcom/android/dx/util/ByteArray;

    .line 11
    .line 12
    invoke-direct {p1, p0}, Lcom/android/dx/util/ByteArray;-><init>([B)V

    .line 13
    .line 14
    .line 15
    return-object p1
.end method

.method public underlyingOffset(I)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/util/ByteArray;->start:I

    .line 2
    .line 3
    add-int/2addr p0, p1

    .line 4
    return p0
.end method
