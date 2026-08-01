.class public abstract Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏哲楪兰;
.super Ljava/io/FilterOutputStream;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final 飘花落叶言子楪哲兰世苏:[B

.field public static final 飘花落叶言子楪哲苏兰世:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 2
    .line 3
    const-wide/16 v0, 0x1

    .line 4
    .line 5
    invoke-static {v0, v1}, Lorg/apache/commons/compress/archivers/zip/ZipLong;->getBytes(J)[B

    .line 6
    .line 7
    .line 8
    sget-object v0, Lorg/apache/commons/compress/archivers/zip/ZipLong;->LFH_SIG:Lorg/apache/commons/compress/archivers/zip/ZipLong;

    .line 9
    .line 10
    invoke-virtual {v0}, Lorg/apache/commons/compress/archivers/zip/ZipLong;->getBytes()[B

    .line 11
    .line 12
    .line 13
    sget-object v0, Lorg/apache/commons/compress/archivers/zip/ZipLong;->DD_SIG:Lorg/apache/commons/compress/archivers/zip/ZipLong;

    .line 14
    .line 15
    invoke-virtual {v0}, Lorg/apache/commons/compress/archivers/zip/ZipLong;->getBytes()[B

    .line 16
    .line 17
    .line 18
    sget-object v0, Lorg/apache/commons/compress/archivers/zip/ZipLong;->CFH_SIG:Lorg/apache/commons/compress/archivers/zip/ZipLong;

    .line 19
    .line 20
    invoke-virtual {v0}, Lorg/apache/commons/compress/archivers/zip/ZipLong;->getBytes()[B

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    sput-object v0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪哲苏兰世:[B

    .line 25
    .line 26
    const-wide/32 v0, 0x6054b50

    .line 27
    .line 28
    .line 29
    invoke-static {v0, v1}, Lorg/apache/commons/compress/archivers/zip/ZipLong;->getBytes(J)[B

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sput-object v0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪哲兰世苏:[B

    .line 34
    .line 35
    const-wide/32 v0, 0x6064b50

    .line 36
    .line 37
    .line 38
    invoke-static {v0, v1}, Lorg/apache/commons/compress/archivers/zip/ZipLong;->getBytes(J)[B

    .line 39
    .line 40
    .line 41
    const-wide/32 v0, 0x7064b50

    .line 42
    .line 43
    .line 44
    invoke-static {v0, v1}, Lorg/apache/commons/compress/archivers/zip/ZipLong;->getBytes(J)[B

    .line 45
    .line 46
    .line 47
    return-void
.end method
