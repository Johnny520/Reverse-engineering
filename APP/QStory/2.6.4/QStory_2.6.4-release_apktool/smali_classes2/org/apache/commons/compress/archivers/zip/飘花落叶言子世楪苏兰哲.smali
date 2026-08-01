.class public final Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪苏兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏兰哲楪;


# static fields
.field public static final 飘花落叶言子楪兰世哲苏:Lorg/apache/commons/compress/archivers/zip/ZipShort;


# instance fields
.field public 飘花落叶言子楪兰世苏哲:Lorg/apache/commons/compress/archivers/zip/ZipLong;

.field public 飘花落叶言子楪哲兰世苏:Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;

.field public 飘花落叶言子楪哲兰苏世:Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;

.field public 飘花落叶言子楪哲苏兰世:Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lorg/apache/commons/compress/archivers/zip/ZipShort;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lorg/apache/commons/compress/archivers/zip/ZipShort;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪兰世哲苏:Lorg/apache/commons/compress/archivers/zip/ZipShort;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final getCentralDirectoryData()[B
    .locals 5

    .line 1
    invoke-virtual {p0}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪苏兰哲;->getCentralDirectoryLength()Lorg/apache/commons/compress/archivers/zip/ZipShort;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lorg/apache/commons/compress/archivers/zip/ZipShort;->getValue()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    new-array v0, v0, [B

    .line 10
    .line 11
    iget-object v1, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲苏兰世:Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;

    .line 12
    .line 13
    const/16 v2, 0x8

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {v1}, Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;->getBytes()[B

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-static {v1, v3, v0, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 23
    .line 24
    .line 25
    move v1, v2

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move v1, v3

    .line 28
    :goto_0
    iget-object v4, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰世苏:Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;

    .line 29
    .line 30
    if-eqz v4, :cond_1

    .line 31
    .line 32
    invoke-virtual {v4}, Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;->getBytes()[B

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    invoke-static {v4, v3, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 37
    .line 38
    .line 39
    add-int/lit8 v1, v1, 0x8

    .line 40
    .line 41
    :cond_1
    iget-object v4, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰苏世:Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;

    .line 42
    .line 43
    if-eqz v4, :cond_2

    .line 44
    .line 45
    invoke-virtual {v4}, Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;->getBytes()[B

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    invoke-static {v4, v3, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 50
    .line 51
    .line 52
    add-int/lit8 v1, v1, 0x8

    .line 53
    .line 54
    :cond_2
    iget-object p0, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪兰世苏哲:Lorg/apache/commons/compress/archivers/zip/ZipLong;

    .line 55
    .line 56
    if-eqz p0, :cond_3

    .line 57
    .line 58
    invoke-virtual {p0}, Lorg/apache/commons/compress/archivers/zip/ZipLong;->getBytes()[B

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    const/4 v2, 0x4

    .line 63
    invoke-static {p0, v3, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 64
    .line 65
    .line 66
    :cond_3
    return-object v0
.end method

.method public final getCentralDirectoryLength()Lorg/apache/commons/compress/archivers/zip/ZipShort;
    .locals 5

    .line 1
    new-instance v0, Lorg/apache/commons/compress/archivers/zip/ZipShort;

    .line 2
    .line 3
    iget-object v1, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲苏兰世:Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;

    .line 4
    .line 5
    const/16 v2, 0x8

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    move v1, v2

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move v1, v3

    .line 13
    :goto_0
    iget-object v4, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰世苏:Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;

    .line 14
    .line 15
    if-eqz v4, :cond_1

    .line 16
    .line 17
    move v4, v2

    .line 18
    goto :goto_1

    .line 19
    :cond_1
    move v4, v3

    .line 20
    :goto_1
    add-int/2addr v1, v4

    .line 21
    iget-object v4, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰苏世:Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;

    .line 22
    .line 23
    if-eqz v4, :cond_2

    .line 24
    .line 25
    goto :goto_2

    .line 26
    :cond_2
    move v2, v3

    .line 27
    :goto_2
    add-int/2addr v1, v2

    .line 28
    iget-object p0, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪兰世苏哲:Lorg/apache/commons/compress/archivers/zip/ZipLong;

    .line 29
    .line 30
    if-eqz p0, :cond_3

    .line 31
    .line 32
    const/4 v3, 0x4

    .line 33
    :cond_3
    add-int/2addr v1, v3

    .line 34
    invoke-direct {v0, v1}, Lorg/apache/commons/compress/archivers/zip/ZipShort;-><init>(I)V

    .line 35
    .line 36
    .line 37
    return-object v0
.end method

.method public final getHeaderId()Lorg/apache/commons/compress/archivers/zip/ZipShort;
    .locals 0

    .line 1
    sget-object p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪兰世哲苏:Lorg/apache/commons/compress/archivers/zip/ZipShort;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getLocalFileDataData()[B
    .locals 4

    .line 1
    iget-object v0, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲苏兰世:Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v1, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰世苏:Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    sget-object p0, L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:[B

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_1
    :goto_0
    if-eqz v0, :cond_4

    .line 14
    .line 15
    iget-object v1, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰世苏:Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;

    .line 16
    .line 17
    if-eqz v1, :cond_4

    .line 18
    .line 19
    const/16 v1, 0x10

    .line 20
    .line 21
    new-array v1, v1, [B

    .line 22
    .line 23
    const/16 v2, 0x8

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    invoke-virtual {v0}, Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;->getBytes()[B

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-static {v0, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 33
    .line 34
    .line 35
    move v0, v2

    .line 36
    goto :goto_1

    .line 37
    :cond_2
    move v0, v3

    .line 38
    :goto_1
    iget-object p0, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰世苏:Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;

    .line 39
    .line 40
    if-eqz p0, :cond_3

    .line 41
    .line 42
    invoke-virtual {p0}, Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;->getBytes()[B

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-static {p0, v3, v1, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 47
    .line 48
    .line 49
    :cond_3
    return-object v1

    .line 50
    :cond_4
    const-string p0, "Zip64 extended information must contain both size values in the local file header."

    .line 51
    .line 52
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    const/4 p0, 0x0

    .line 56
    return-object p0
.end method

.method public final getLocalFileDataLength()Lorg/apache/commons/compress/archivers/zip/ZipShort;
    .locals 1

    .line 1
    new-instance v0, Lorg/apache/commons/compress/archivers/zip/ZipShort;

    .line 2
    .line 3
    iget-object p0, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲苏兰世:Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/16 p0, 0x10

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    :goto_0
    invoke-direct {v0, p0}, Lorg/apache/commons/compress/archivers/zip/ZipShort;-><init>(I)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public final parseFromCentralDirectoryData([BII)V
    .locals 2

    .line 1
    new-array v0, p3, [B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 5
    .line 6
    .line 7
    const/16 v0, 0x1c

    .line 8
    .line 9
    if-lt p3, v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, p1, p2, p3}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪苏兰哲;->parseFromLocalFileData([BII)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    const/16 v0, 0x18

    .line 16
    .line 17
    if-ne p3, v0, :cond_1

    .line 18
    .line 19
    new-instance p3, Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;

    .line 20
    .line 21
    invoke-direct {p3, p1, p2}, Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;-><init>([BI)V

    .line 22
    .line 23
    .line 24
    iput-object p3, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲苏兰世:Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;

    .line 25
    .line 26
    add-int/lit8 p3, p2, 0x8

    .line 27
    .line 28
    new-instance v0, Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;

    .line 29
    .line 30
    invoke-direct {v0, p1, p3}, Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;-><init>([BI)V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰世苏:Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;

    .line 34
    .line 35
    add-int/lit8 p2, p2, 0x10

    .line 36
    .line 37
    new-instance p3, Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;

    .line 38
    .line 39
    invoke-direct {p3, p1, p2}, Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;-><init>([BI)V

    .line 40
    .line 41
    .line 42
    iput-object p3, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰苏世:Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;

    .line 43
    .line 44
    return-void

    .line 45
    :cond_1
    rem-int/lit8 v0, p3, 0x8

    .line 46
    .line 47
    const/4 v1, 0x4

    .line 48
    if-ne v0, v1, :cond_2

    .line 49
    .line 50
    new-instance v0, Lorg/apache/commons/compress/archivers/zip/ZipLong;

    .line 51
    .line 52
    add-int/2addr p2, p3

    .line 53
    sub-int/2addr p2, v1

    .line 54
    invoke-direct {v0, p1, p2}, Lorg/apache/commons/compress/archivers/zip/ZipLong;-><init>([BI)V

    .line 55
    .line 56
    .line 57
    iput-object v0, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪兰世苏哲:Lorg/apache/commons/compress/archivers/zip/ZipLong;

    .line 58
    .line 59
    :cond_2
    return-void
.end method

.method public final parseFromLocalFileData([BII)V
    .locals 3

    .line 1
    if-nez p3, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    const/16 v0, 0x10

    .line 5
    .line 6
    if-lt p3, v0, :cond_3

    .line 7
    .line 8
    new-instance v0, Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;

    .line 9
    .line 10
    invoke-direct {v0, p1, p2}, Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;-><init>([BI)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲苏兰世:Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;

    .line 14
    .line 15
    add-int/lit8 v0, p2, 0x8

    .line 16
    .line 17
    new-instance v1, Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;

    .line 18
    .line 19
    invoke-direct {v1, p1, v0}, Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;-><init>([BI)V

    .line 20
    .line 21
    .line 22
    iput-object v1, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰世苏:Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;

    .line 23
    .line 24
    add-int/lit8 v0, p2, 0x10

    .line 25
    .line 26
    add-int/lit8 v1, p3, -0x10

    .line 27
    .line 28
    const/16 v2, 0x8

    .line 29
    .line 30
    if-lt v1, v2, :cond_1

    .line 31
    .line 32
    new-instance v1, Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;

    .line 33
    .line 34
    invoke-direct {v1, p1, v0}, Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;-><init>([BI)V

    .line 35
    .line 36
    .line 37
    iput-object v1, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰苏世:Lorg/apache/commons/compress/archivers/zip/ZipEightByteInteger;

    .line 38
    .line 39
    add-int/lit8 v0, p2, 0x18

    .line 40
    .line 41
    add-int/lit8 v1, p3, -0x18

    .line 42
    .line 43
    :cond_1
    const/4 p2, 0x4

    .line 44
    if-lt v1, p2, :cond_2

    .line 45
    .line 46
    new-instance p2, Lorg/apache/commons/compress/archivers/zip/ZipLong;

    .line 47
    .line 48
    invoke-direct {p2, p1, v0}, Lorg/apache/commons/compress/archivers/zip/ZipLong;-><init>([BI)V

    .line 49
    .line 50
    .line 51
    iput-object p2, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪兰世苏哲:Lorg/apache/commons/compress/archivers/zip/ZipLong;

    .line 52
    .line 53
    :cond_2
    :goto_0
    return-void

    .line 54
    :cond_3
    new-instance p0, Ljava/util/zip/ZipException;

    .line 55
    .line 56
    const-string p1, "Zip64 extended information must contain both size values in the local file header."

    .line 57
    .line 58
    invoke-direct {p0, p1}, Ljava/util/zip/ZipException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw p0
.end method
