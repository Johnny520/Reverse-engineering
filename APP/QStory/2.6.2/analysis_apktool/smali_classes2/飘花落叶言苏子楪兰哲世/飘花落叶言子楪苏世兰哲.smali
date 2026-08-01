.class public abstract L飘花落叶言苏子楪兰哲世/飘花落叶言子楪苏世兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final 飘花落叶言子楪世哲苏兰:[B

.field public static final 飘花落叶言子楪世苏兰哲:Ljava/lang/ThreadLocal;

.field public static final 飘花落叶言子楪世苏哲兰:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-char v0, Ljava/io/File;->separatorChar:C

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    new-array v0, v0, [B

    .line 5
    .line 6
    sput-object v0, L飘花落叶言苏子楪兰哲世/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:[B

    .line 7
    .line 8
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    sget-object v0, Lorg/apache/commons/io/StandardLineSeparator;->LF:Lorg/apache/commons/io/StandardLineSeparator;

    .line 12
    .line 13
    invoke-virtual {v0}, Lorg/apache/commons/io/StandardLineSeparator;->getString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    sget-object v0, Lorg/apache/commons/io/StandardLineSeparator;->CRLF:Lorg/apache/commons/io/StandardLineSeparator;

    .line 17
    .line 18
    invoke-virtual {v0}, Lorg/apache/commons/io/StandardLineSeparator;->getString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    new-instance v0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪世兰哲苏;

    .line 22
    .line 23
    const/16 v1, 0xf

    .line 24
    .line 25
    invoke-direct {v0, v1}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪世兰哲苏;-><init>(I)V

    .line 26
    .line 27
    .line 28
    invoke-static {v0}, Ljava/lang/ThreadLocal;->withInitial(Ljava/util/function/Supplier;)Ljava/lang/ThreadLocal;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    sput-object v0, L飘花落叶言苏子楪兰哲世/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/ThreadLocal;

    .line 33
    .line 34
    const/16 v0, 0x2000

    .line 35
    .line 36
    new-array v0, v0, [B

    .line 37
    .line 38
    sput-object v0, L飘花落叶言苏子楪兰哲世/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:[B

    .line 39
    .line 40
    new-instance v0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪世兰哲苏;

    .line 41
    .line 42
    const/16 v1, 0x10

    .line 43
    .line 44
    invoke-direct {v0, v1}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子楪世兰哲苏;-><init>(I)V

    .line 45
    .line 46
    .line 47
    invoke-static {v0}, Ljava/lang/ThreadLocal;->withInitial(Ljava/util/function/Supplier;)Ljava/lang/ThreadLocal;

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public static 飘花落叶言子楪世苏哲兰(Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏楪兰哲;Ljava/io/BufferedOutputStream;)V
    .locals 3

    .line 1
    const/16 v0, 0x2000

    .line 2
    .line 3
    new-array v0, v0, [B

    .line 4
    .line 5
    :goto_0
    invoke-virtual {p0, v0}, Ljava/io/InputStream;->read([B)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, -0x1

    .line 10
    if-eq v2, v1, :cond_0

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-virtual {p1, v0, v2, v1}, Ljava/io/OutputStream;->write([BII)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    return-void
.end method
