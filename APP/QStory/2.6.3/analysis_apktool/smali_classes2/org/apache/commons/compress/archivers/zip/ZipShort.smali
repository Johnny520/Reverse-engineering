.class public final Lorg/apache/commons/compress/archivers/zip/ZipShort;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/lang/Cloneable;
.implements Ljava/io/Serializable;


# static fields
.field private static final SIZE:I = 0x2

.field public static final ZERO:Lorg/apache/commons/compress/archivers/zip/ZipShort;

.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private final value:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lorg/apache/commons/compress/archivers/zip/ZipShort;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lorg/apache/commons/compress/archivers/zip/ZipShort;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lorg/apache/commons/compress/archivers/zip/ZipShort;->ZERO:Lorg/apache/commons/compress/archivers/zip/ZipShort;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput p1, p0, Lorg/apache/commons/compress/archivers/zip/ZipShort;->value:I

    return-void
.end method

.method public constructor <init>([B)V
    .locals 1

    const/4 v0, 0x0

    .line 11
    invoke-direct {p0, p1, v0}, Lorg/apache/commons/compress/archivers/zip/ZipShort;-><init>([BI)V

    return-void
.end method

.method public constructor <init>([BI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1, p2}, Lorg/apache/commons/compress/archivers/zip/ZipShort;->getValue([BI)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    iput p1, p0, Lorg/apache/commons/compress/archivers/zip/ZipShort;->value:I

    .line 9
    .line 10
    return-void
.end method

.method public static getBytes(I)[B
    .locals 2

    const/4 v0, 0x2

    .line 12
    new-array v0, v0, [B

    const/4 v1, 0x0

    .line 13
    invoke-static {p0, v0, v1}, Lorg/apache/commons/compress/archivers/zip/ZipShort;->putShort(I[BI)V

    return-object v0
.end method

.method public static getValue([B)I
    .locals 1

    const/4 v0, 0x0

    .line 8
    invoke-static {p0, v0}, Lorg/apache/commons/compress/archivers/zip/ZipShort;->getValue([BI)I

    move-result p0

    return p0
.end method

.method public static getValue([BI)I
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {p1, p0, v0}, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I[BI)J

    .line 3
    .line 4
    .line 5
    move-result-wide p0

    .line 6
    long-to-int p0, p0

    .line 7
    return p0
.end method

.method public static lengthOf([B)Lorg/apache/commons/compress/archivers/zip/ZipShort;
    .locals 1

    .line 1
    new-instance v0, Lorg/apache/commons/compress/archivers/zip/ZipShort;

    .line 2
    .line 3
    invoke-static {p0}, Lorg/apache/commons/lang3/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    invoke-direct {v0, p0}, Lorg/apache/commons/compress/archivers/zip/ZipShort;-><init>(I)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public static putShort(I[BI)V
    .locals 2

    .line 1
    int-to-long v0, p0

    .line 2
    const/4 p0, 0x2

    .line 3
    invoke-static {v0, v1, p1, p2, p0}, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏(J[BII)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public clone()Ljava/lang/Object;
    .locals 1

    .line 1
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    return-object p0

    .line 6
    :catch_0
    move-exception p0

    .line 7
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 8
    .line 9
    invoke-direct {v0, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/Throwable;)V

    .line 10
    .line 11
    .line 12
    throw v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lorg/apache/commons/compress/archivers/zip/ZipShort;

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
    iget p0, p0, Lorg/apache/commons/compress/archivers/zip/ZipShort;->value:I

    .line 8
    .line 9
    check-cast p1, Lorg/apache/commons/compress/archivers/zip/ZipShort;

    .line 10
    .line 11
    invoke-virtual {p1}, Lorg/apache/commons/compress/archivers/zip/ZipShort;->getValue()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-ne p0, p1, :cond_1

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
    .locals 4

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v1, v0, [B

    .line 3
    .line 4
    iget p0, p0, Lorg/apache/commons/compress/archivers/zip/ZipShort;->value:I

    .line 5
    .line 6
    int-to-long v2, p0

    .line 7
    const/4 p0, 0x0

    .line 8
    invoke-static {v2, v3, v1, p0, v0}, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏(J[BII)V

    .line 9
    .line 10
    .line 11
    return-object v1
.end method

.method public getValue()I
    .locals 0

    .line 9
    iget p0, p0, Lorg/apache/commons/compress/archivers/zip/ZipShort;->value:I

    return p0
.end method

.method public hashCode()I
    .locals 0

    .line 1
    iget p0, p0, Lorg/apache/commons/compress/archivers/zip/ZipShort;->value:I

    .line 2
    .line 3
    return p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "ZipShort value: "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget p0, p0, Lorg/apache/commons/compress/archivers/zip/ZipShort;->value:I

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
