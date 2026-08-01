.class public final Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field static final BYTES:I = 0x8

.field private static final HIGHEST_BIT:Ljava/math/BigInteger;

.field public static final ZERO:Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;

.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private final value:J


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    invoke-direct {v0, v1, v2}, Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;-><init>(J)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;->ZERO:Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;

    .line 9
    .line 10
    sget-object v0, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;

    .line 11
    .line 12
    const/16 v1, 0x3f

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sput-object v0, Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;->HIGHEST_BIT:Ljava/math/BigInteger;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>(J)V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-wide p1, p0, Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;->value:J

    return-void
.end method

.method public constructor <init>(Ljava/math/BigInteger;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/math/BigInteger;->longValue()J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    iput-wide v0, p0, Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;->value:J

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>([B)V
    .locals 1

    const/4 v0, 0x0

    .line 11
    invoke-direct {p0, p1, v0}, Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;-><init>([BI)V

    return-void
.end method

.method public constructor <init>([BI)V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    invoke-static {p1, p2}, Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;->getLongValue([BI)J

    move-result-wide p1

    iput-wide p1, p0, Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;->value:J

    return-void
.end method

.method public static getBytes(J)[B
    .locals 2

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0, p0, p1}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->array()[B

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method public static getBytes(Ljava/math/BigInteger;)[B
    .locals 2

    .line 22
    invoke-virtual {p0}, Ljava/math/BigInteger;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;->getBytes(J)[B

    move-result-object p0

    return-object p0
.end method

.method public static getLongValue([B)J
    .locals 2

    const/4 v0, 0x0

    .line 16
    invoke-static {p0, v0}, Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;->getLongValue([BI)J

    move-result-wide v0

    return-wide v0
.end method

.method public static getLongValue([BI)J
    .locals 1

    .line 1
    invoke-static {p0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->getLong(I)J

    .line 12
    .line 13
    .line 14
    move-result-wide p0

    .line 15
    return-wide p0
.end method

.method public static getValue([B)Ljava/math/BigInteger;
    .locals 1

    const/4 v0, 0x0

    .line 10
    invoke-static {p0, v0}, Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;->getValue([BI)Ljava/math/BigInteger;

    move-result-object p0

    return-object p0
.end method

.method public static getValue([BI)Ljava/math/BigInteger;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;->getLongValue([BI)J

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    invoke-static {p0, p1}, Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;->toUnsignedBigInteger(J)Ljava/math/BigInteger;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static toUnsignedBigInteger(J)Ljava/math/BigInteger;
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p0, v0

    .line 4
    .line 5
    if-ltz v0, :cond_0

    .line 6
    .line 7
    invoke-static {p0, p1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    const-wide v0, 0x7fffffffffffffffL

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    and-long/2addr p0, v0

    .line 18
    invoke-static {p0, p1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    sget-object p1, Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;->HIGHEST_BIT:Ljava/math/BigInteger;

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    instance-of v0, p1, Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    iget-wide v2, p0, Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;->value:J

    .line 8
    .line 9
    check-cast p1, Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;

    .line 10
    .line 11
    iget-wide p0, p1, Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;->value:J

    .line 12
    .line 13
    cmp-long p0, v2, p0

    .line 14
    .line 15
    if-nez p0, :cond_1

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_1
    return v1
.end method

.method public getBytes()[B
    .locals 2

    .line 23
    iget-wide v0, p0, Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;->value:J

    invoke-static {v0, v1}, Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;->getBytes(J)[B

    move-result-object p0

    return-object p0
.end method

.method public getLongValue()J
    .locals 2

    .line 17
    iget-wide v0, p0, Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;->value:J

    return-wide v0
.end method

.method public getValue()Ljava/math/BigInteger;
    .locals 2

    .line 11
    iget-wide v0, p0, Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;->value:J

    invoke-static {v0, v1}, Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;->toUnsignedBigInteger(J)Ljava/math/BigInteger;

    move-result-object p0

    return-object p0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget-wide v0, p0, Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;->value:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget-wide v0, p0, Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;->value:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->toUnsignedString(J)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
