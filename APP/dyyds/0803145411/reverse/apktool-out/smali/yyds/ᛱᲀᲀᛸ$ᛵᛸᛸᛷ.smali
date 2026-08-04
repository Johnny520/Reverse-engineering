.class final Lyyds/ᛱᲀᲀᛸ$ᛵᛸᛸᛷ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lyyds/ᛱᲀᲀᛸ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u16f5\u16f8\u16f8\u16f7"
.end annotation


# instance fields
.field private final ᛲᲈᲁ:[B

.field private ᛵᛸᛸᛷ:I


# direct methods
.method public constructor <init>([B)V
    .locals 2

    .line 1
    const-wide v0, -0x201f3e68a836eL

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
    iput-object p1, p0, Lyyds/ᛱᲀᲀᛸ$ᛵᛸᛸᛷ;->ᛲᲈᲁ:[B

    .line 13
    .line 14
    return-void
.end method

.method private final ᲀᛲᛳᲀ()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Lyyds/ᛱᲀᲀᛸ$ᛵᛸᛸᛷ;->ᛵᛸᛸᛷ()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    shl-int/lit8 v0, v0, 0x18

    .line 6
    .line 7
    invoke-virtual {p0}, Lyyds/ᛱᲀᲀᛸ$ᛵᛸᛸᛷ;->ᛵᛸᛸᛷ()I

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
    invoke-virtual {p0}, Lyyds/ᛱᲀᲀᛸ$ᛵᛸᛸᛷ;->ᛵᛸᛸᛷ()I

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
    invoke-virtual {p0}, Lyyds/ᛱᲀᲀᛸ$ᛵᛸᛸᛷ;->ᛵᛸᛸᛷ()I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    or-int/2addr p0, v0

    .line 26
    return p0
.end method


# virtual methods
.method public final ᛲᲈᲁ()V
    .locals 1

    .line 1
    iget v0, p0, Lyyds/ᛱᲀᲀᛸ$ᛵᛸᛸᛷ;->ᛵᛸᛸᛷ:I

    .line 2
    .line 3
    iget-object p0, p0, Lyyds/ᛱᲀᲀᛸ$ᛵᛸᛸᛷ;->ᛲᲈᲁ:[B

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
    sget-object p0, Lyyds/ᛱᲀᲀᛸ;->ᛲᲈᲁ:Lyyds/ᛱᲀᲀᛸ;

    .line 10
    .line 11
    invoke-static {p0}, Lyyds/ᛱᲀᲀᛸ;->ᛲᲈᲁ(Lyyds/ᛱᲀᲀᛸ;)Ljava/lang/SecurityException;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    throw p0
.end method

.method public final ᛵᛸᛸᛷ()I
    .locals 3

    .line 1
    iget v0, p0, Lyyds/ᛱᲀᲀᛸ$ᛵᛸᛸᛷ;->ᛵᛸᛸᛷ:I

    .line 2
    .line 3
    iget-object v1, p0, Lyyds/ᛱᲀᲀᛸ$ᛵᛸᛸᛷ;->ᛲᲈᲁ:[B

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
    iput v2, p0, Lyyds/ᛱᲀᲀᛸ$ᛵᛸᛸᛷ;->ᛵᛸᛸᛷ:I

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
    sget-object p0, Lyyds/ᛱᲀᲀᛸ;->ᛲᲈᲁ:Lyyds/ᛱᲀᲀᛸ;

    .line 18
    .line 19
    invoke-static {p0}, Lyyds/ᛱᲀᲀᛸ;->ᛲᲈᲁ(Lyyds/ᛱᲀᲀᛸ;)Ljava/lang/SecurityException;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    throw p0
.end method

.method public final ᲇᲈᛵᛷ()Ljava/lang/String;
    .locals 4

    .line 1
    invoke-direct {p0}, Lyyds/ᛱᲀᲀᛸ$ᛵᛸᛸᛷ;->ᲀᛲᛳᲀ()I

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
    iget-object v1, p0, Lyyds/ᛱᲀᲀᛸ$ᛵᛸᛸᛷ;->ᛲᲈᲁ:[B

    .line 12
    .line 13
    array-length v2, v1

    .line 14
    iget v3, p0, Lyyds/ᛱᲀᲀᛸ$ᛵᛸᛸᛷ;->ᛵᛸᛸᛷ:I

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
    iget v2, p0, Lyyds/ᛱᲀᲀᛸ$ᛵᛸᛸᛷ;->ᛵᛸᛸᛷ:I

    .line 26
    .line 27
    add-int/2addr v2, v0

    .line 28
    iput v2, p0, Lyyds/ᛱᲀᲀᛸ$ᛵᛸᛸᛷ;->ᛵᛸᛸᛷ:I

    .line 29
    .line 30
    :try_start_0
    sget-object p0, Lyyds/ᛲᛵᛴᛴ;->ᛲᲈᲁ:Ljava/nio/charset/Charset;

    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/nio/charset/Charset;->newDecoder()Ljava/nio/charset/CharsetDecoder;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    sget-object v0, Ljava/nio/charset/CodingErrorAction;->REPORT:Ljava/nio/charset/CodingErrorAction;

    .line 37
    .line 38
    invoke-virtual {p0, v0}, Ljava/nio/charset/CharsetDecoder;->onMalformedInput(Ljava/nio/charset/CodingErrorAction;)Ljava/nio/charset/CharsetDecoder;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {p0, v0}, Ljava/nio/charset/CharsetDecoder;->onUnmappableCharacter(Ljava/nio/charset/CodingErrorAction;)Ljava/nio/charset/CharsetDecoder;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-static {v1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {p0, v0}, Ljava/nio/charset/CharsetDecoder;->decode(Ljava/nio/ByteBuffer;)Ljava/nio/CharBuffer;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-virtual {p0}, Ljava/nio/CharBuffer;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 58
    return-object p0

    .line 59
    :catch_0
    sget-object p0, Lyyds/ᛱᲀᲀᛸ;->ᛲᲈᲁ:Lyyds/ᛱᲀᲀᛸ;

    .line 60
    .line 61
    invoke-static {p0}, Lyyds/ᛱᲀᲀᛸ;->ᛲᲈᲁ(Lyyds/ᛱᲀᲀᛸ;)Ljava/lang/SecurityException;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    throw p0

    .line 66
    :cond_0
    sget-object p0, Lyyds/ᛱᲀᲀᛸ;->ᛲᲈᲁ:Lyyds/ᛱᲀᲀᛸ;

    .line 67
    .line 68
    invoke-static {p0}, Lyyds/ᛱᲀᲀᛸ;->ᛲᲈᲁ(Lyyds/ᛱᲀᲀᛸ;)Ljava/lang/SecurityException;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    throw p0
.end method
