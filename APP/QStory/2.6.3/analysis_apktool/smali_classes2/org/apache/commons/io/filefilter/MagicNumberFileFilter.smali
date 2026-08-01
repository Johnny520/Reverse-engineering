.class public Lorg/apache/commons/io/filefilter/MagicNumberFileFilter;
.super L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世苏哲兰;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = -0x799f06c25c62aacL


# instance fields
.field private final byteOffset:J

.field private final magicNumbers:[B


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    const-wide/16 v0, 0x0

    .line 43
    invoke-direct {p0, p1, v0, v1}, Lorg/apache/commons/io/filefilter/MagicNumberFileFilter;-><init>(Ljava/lang/String;J)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;J)V
    .locals 1

    .line 44
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    invoke-direct {p0, p1, p2, p3}, Lorg/apache/commons/io/filefilter/MagicNumberFileFilter;-><init>([BJ)V

    return-void
.end method

.method public constructor <init>([B)V
    .locals 2

    const-wide/16 v0, 0x0

    .line 42
    invoke-direct {p0, p1, v0, v1}, Lorg/apache/commons/io/filefilter/MagicNumberFileFilter;-><init>([BJ)V

    return-void
.end method

.method public constructor <init>([BJ)V
    .locals 4

    .line 1
    invoke-direct {p0}, L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世苏哲兰;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "magicNumbers"

    .line 5
    .line 6
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    array-length v0, p1

    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    const-wide/16 v2, 0x0

    .line 14
    .line 15
    cmp-long v0, p2, v2

    .line 16
    .line 17
    if-ltz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p1}, [B->clone()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    check-cast p1, [B

    .line 24
    .line 25
    iput-object p1, p0, Lorg/apache/commons/io/filefilter/MagicNumberFileFilter;->magicNumbers:[B

    .line 26
    .line 27
    iput-wide p2, p0, Lorg/apache/commons/io/filefilter/MagicNumberFileFilter;->byteOffset:J

    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    const-string p0, "The offset cannot be negative"

    .line 31
    .line 32
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw v1

    .line 36
    :cond_1
    const-string p0, "The magic number must contain at least one byte"

    .line 37
    .line 38
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw v1
.end method

.method private lambda$accept$0(Ljava/io/RandomAccessFile;)Ljava/lang/Boolean;
    .locals 6

    .line 1
    iget-object v0, p0, Lorg/apache/commons/io/filefilter/MagicNumberFileFilter;->magicNumbers:[B

    .line 2
    .line 3
    iget-wide v1, p0, Lorg/apache/commons/io/filefilter/MagicNumberFileFilter;->byteOffset:J

    .line 4
    .line 5
    array-length p0, v0

    .line 6
    invoke-virtual {p1, v1, v2}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 7
    .line 8
    .line 9
    sget-object v1, L飘花落叶言苏子楪兰世哲/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:[B

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-ltz p0, :cond_3

    .line 13
    .line 14
    if-nez p0, :cond_0

    .line 15
    .line 16
    sget-object p0, L飘花落叶言苏子楪兰世哲/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:[B

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_0
    new-array v2, p0, [B

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    :goto_0
    if-ge v3, p0, :cond_1

    .line 23
    .line 24
    sub-int v4, p0, v3

    .line 25
    .line 26
    invoke-virtual {p1, v2, v3, v4}, Ljava/io/RandomAccessFile;->read([BII)I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    const/4 v5, -0x1

    .line 31
    if-eq v4, v5, :cond_1

    .line 32
    .line 33
    add-int/2addr v3, v4

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    if-ne v3, p0, :cond_2

    .line 36
    .line 37
    move-object p0, v2

    .line 38
    :goto_1
    invoke-static {v0, p0}, Ljava/util/Arrays;->equals([B[B)Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :cond_2
    const-string p1, "Unexpected read size, current: "

    .line 48
    .line 49
    const-string v0, ", expected: "

    .line 50
    .line 51
    invoke-static {v3, p0, p1, v0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏哲兰世(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲世兰苏(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-object v1

    .line 59
    :cond_3
    const-string p1, "Size must be equal or greater than zero: "

    .line 60
    .line 61
    invoke-static {p0, p1}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    return-object v1
.end method

.method public static synthetic 飘花落叶言子楪世苏哲兰(Lorg/apache/commons/io/filefilter/MagicNumberFileFilter;Ljava/io/RandomAccessFile;)Ljava/lang/Boolean;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lorg/apache/commons/io/filefilter/MagicNumberFileFilter;->lambda$accept$0(Ljava/io/RandomAccessFile;)Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public accept(Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;
    .locals 3

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    const/4 p2, 0x0

    .line 4
    new-array v0, p2, [Ljava/nio/file/LinkOption;

    .line 5
    .line 6
    invoke-static {p1, v0}, Ljava/nio/file/Files;->isRegularFile(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_2

    .line 11
    .line 12
    invoke-static {p1}, Ljava/nio/file/Files;->isReadable(Ljava/nio/file/Path;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    :try_start_0
    new-array p2, p2, [Ljava/nio/file/OpenOption;

    .line 19
    .line 20
    invoke-static {p1, p2}, Ljava/nio/channels/FileChannel;->open(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Ljava/nio/channels/FileChannel;

    .line 21
    .line 22
    .line 23
    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    :try_start_1
    iget-object p2, p0, Lorg/apache/commons/io/filefilter/MagicNumberFileFilter;->magicNumbers:[B

    .line 25
    .line 26
    array-length p2, p2

    .line 27
    invoke-static {p2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    iget-wide v0, p0, Lorg/apache/commons/io/filefilter/MagicNumberFileFilter;->byteOffset:J

    .line 32
    .line 33
    invoke-virtual {p1, v0, v1}, Ljava/nio/channels/FileChannel;->position(J)Ljava/nio/channels/FileChannel;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, p2}, Ljava/nio/channels/FileChannel;->read(Ljava/nio/ByteBuffer;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-object v1, p0, Lorg/apache/commons/io/filefilter/MagicNumberFileFilter;->magicNumbers:[B

    .line 41
    .line 42
    array-length v2, v1

    .line 43
    if-eq v0, v2, :cond_0

    .line 44
    .line 45
    sget-object p0, Ljava/nio/file/FileVisitResult;->TERMINATE:Ljava/nio/file/FileVisitResult;

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :catchall_0
    move-exception p0

    .line 49
    goto :goto_1

    .line 50
    :cond_0
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->array()[B

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    invoke-static {v1, p2}, Ljava/util/Arrays;->equals([B[B)Z

    .line 55
    .line 56
    .line 57
    move-result p2

    .line 58
    invoke-virtual {p0, p2}, L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世苏哲兰;->toFileVisitResult(Z)Ljava/nio/file/FileVisitResult;

    .line 59
    .line 60
    .line 61
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 62
    :goto_0
    :try_start_2
    invoke-virtual {p1}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 63
    .line 64
    .line 65
    return-object p0

    .line 66
    :goto_1
    if-eqz p1, :cond_1

    .line 67
    .line 68
    :try_start_3
    invoke-virtual {p1}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 69
    .line 70
    .line 71
    goto :goto_2

    .line 72
    :catchall_1
    move-exception p1

    .line 73
    :try_start_4
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 74
    .line 75
    .line 76
    :cond_1
    :goto_2
    throw p0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 77
    :catch_0
    :cond_2
    sget-object p0, Ljava/nio/file/FileVisitResult;->TERMINATE:Ljava/nio/file/FileVisitResult;

    .line 78
    .line 79
    return-object p0
.end method

.method public accept(Ljava/io/File;)Z
    .locals 2

    .line 80
    invoke-virtual {p0, p1}, L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世苏哲兰;->isFile(Ljava/io/File;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/io/File;->canRead()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 81
    :try_start_0
    sget-object v0, Lorg/apache/commons/io/RandomAccessFileMode;->READ_ONLY:Lorg/apache/commons/io/RandomAccessFileMode;

    invoke-virtual {p1}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    move-result-object p1

    new-instance v1, L飘花落叶言苏世楪兰哲子/飘花落叶言子楪苏兰哲世;

    invoke-direct {v1, p0}, L飘花落叶言苏世楪兰哲子/飘花落叶言子楪苏兰哲世;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, p1, v1}, Lorg/apache/commons/io/RandomAccessFileMode;->apply(Ljava/nio/file/Path;L飘花落叶言苏子世哲兰楪/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public and(L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世兰苏哲;)L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世兰苏哲;
    .locals 1

    .line 1
    new-instance v0, Lorg/apache/commons/io/filefilter/AndFileFilter;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lorg/apache/commons/io/filefilter/AndFileFilter;-><init>(L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世兰苏哲;L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世兰苏哲;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public bridge synthetic matches(Ljava/nio/file/Path;)Z
    .locals 0

    .line 1
    invoke-super {p0, p1}, L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世兰苏哲;->matches(Ljava/nio/file/Path;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public negate()L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世兰苏哲;
    .locals 1

    .line 1
    new-instance v0, Lorg/apache/commons/io/filefilter/NotFileFilter;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lorg/apache/commons/io/filefilter/NotFileFilter;-><init>(L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世兰苏哲;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public or(L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世兰苏哲;)L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世兰苏哲;
    .locals 1

    .line 1
    new-instance v0, Lorg/apache/commons/io/filefilter/OrFileFilter;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lorg/apache/commons/io/filefilter/OrFileFilter;-><init>(L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世兰苏哲;L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世兰苏哲;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-super {p0}, L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世苏哲兰;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v1, "("

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    new-instance v1, Ljava/lang/String;

    .line 16
    .line 17
    iget-object v2, p0, Lorg/apache/commons/io/filefilter/MagicNumberFileFilter;->magicNumbers:[B

    .line 18
    .line 19
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-direct {v1, v2, v3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v1, ","

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    iget-wide v1, p0, Lorg/apache/commons/io/filefilter/MagicNumberFileFilter;->byteOffset:J

    .line 35
    .line 36
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string p0, ")"

    .line 40
    .line 41
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0
.end method
