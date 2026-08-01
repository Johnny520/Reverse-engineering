.class public abstract L飘花落叶言苏子楪兰哲世/飘花落叶言子楪世哲兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final 飘花落叶言子楪世苏哲兰:[Ljava/io/File;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const-wide/16 v0, 0x400

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    invoke-virtual {v2, v2}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    invoke-virtual {v2, v3}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    invoke-virtual {v2, v3}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-virtual {v2, v3}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {v2, v3}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const-wide/high16 v3, 0x1000000000000000L

    .line 31
    .line 32
    invoke-static {v3, v4}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v2, v0}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 41
    .line 42
    .line 43
    const/4 v0, 0x0

    .line 44
    new-array v0, v0, [Ljava/io/File;

    .line 45
    .line 46
    sput-object v0, L飘花落叶言苏子楪兰哲世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:[Ljava/io/File;

    .line 47
    .line 48
    return-void
.end method

.method public static 飘花落叶言子楪世哲苏兰(Ljava/io/File;)J
    .locals 4

    .line 1
    :try_start_0
    invoke-static {p0}, L飘花落叶言苏子楪兰哲世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1

    .line 2
    .line 3
    .line 4
    :try_start_1
    invoke-virtual {p0}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    sget-object v0, L飘花落叶言苏子世楪兰哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:[Ljava/nio/file/OpenOption;

    .line 9
    .line 10
    sget v0, L飘花落叶言苏子世楪兰哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰苏世哲:I

    .line 11
    .line 12
    new-instance v0, L飘花落叶言苏子世楪兰哲/飘花落叶言子楪世哲苏兰;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    new-instance v1, L飘花落叶言苏子世楪兰哲/飘花落叶言子楪世苏兰哲;

    .line 18
    .line 19
    invoke-direct {v1}, L飘花落叶言苏子世楪兰哲/飘花落叶言子楪世苏兰哲;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object v1, v0, L飘花落叶言苏子世楪兰哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言苏子世楪兰哲/飘花落叶言子楪世苏兰哲;

    .line 23
    .line 24
    new-instance v1, Lorg/apache/commons/io/filefilter/SymbolicLinkFileFilter;

    .line 25
    .line 26
    sget-object v2, Ljava/nio/file/FileVisitResult;->TERMINATE:Ljava/nio/file/FileVisitResult;

    .line 27
    .line 28
    sget-object v3, Ljava/nio/file/FileVisitResult;->CONTINUE:Ljava/nio/file/FileVisitResult;

    .line 29
    .line 30
    invoke-direct {v1, v2, v3}, Lorg/apache/commons/io/filefilter/SymbolicLinkFileFilter;-><init>(Ljava/nio/file/FileVisitResult;Ljava/nio/file/FileVisitResult;)V

    .line 31
    .line 32
    .line 33
    iput-object v1, v0, L飘花落叶言苏子世楪兰哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世:Lorg/apache/commons/io/filefilter/SymbolicLinkFileFilter;

    .line 34
    .line 35
    sget-object v1, Lorg/apache/commons/io/filefilter/TrueFileFilter;->INSTANCE:L飘花落叶言苏子世哲兰楪/飘花落叶言子楪世兰苏哲;

    .line 36
    .line 37
    iput-object v1, v0, L飘花落叶言苏子世楪兰哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲:L飘花落叶言苏子世哲兰楪/飘花落叶言子楪世兰苏哲;

    .line 38
    .line 39
    invoke-static {}, Ljava/util/function/UnaryOperator;->identity()Ljava/util/function/UnaryOperator;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    iput-object v1, v0, L飘花落叶言苏子世楪兰哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世哲苏:Ljava/util/function/UnaryOperator;

    .line 44
    .line 45
    new-instance v1, L飘花落叶言苏子世楪兰哲/飘花落叶言子楪世苏兰哲;

    .line 46
    .line 47
    invoke-direct {v1}, L飘花落叶言苏子世楪兰哲/飘花落叶言子楪世苏兰哲;-><init>()V

    .line 48
    .line 49
    .line 50
    iput-object v1, v0, L飘花落叶言苏子世楪兰哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言苏子世楪兰哲/飘花落叶言子楪世苏兰哲;

    .line 51
    .line 52
    new-instance v1, L飘花落叶言苏子世楪兰哲/飘花落叶言子楪世哲兰苏;

    .line 53
    .line 54
    invoke-direct {v1, v0}, L飘花落叶言苏子世楪兰哲/飘花落叶言子楪世哲兰苏;-><init>(L飘花落叶言苏子世楪兰哲/飘花落叶言子楪世哲苏兰;)V

    .line 55
    .line 56
    .line 57
    invoke-static {p0, v1}, Ljava/nio/file/Files;->walkFileTree(Ljava/nio/file/Path;Ljava/nio/file/FileVisitor;)Ljava/nio/file/Path;

    .line 58
    .line 59
    .line 60
    iget-object p0, v1, L飘花落叶言苏子世楪兰哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:L飘花落叶言苏子世楪兰哲/飘花落叶言子楪世苏兰哲;

    .line 61
    .line 62
    iget-object p0, p0, L飘花落叶言苏子世楪兰哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏子世楪兰哲/飘花落叶言子楪世苏哲兰;

    .line 63
    .line 64
    iget-wide v0, p0, L飘花落叶言苏子世楪兰哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:J
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 65
    .line 66
    return-wide v0

    .line 67
    :catch_0
    move-exception p0

    .line 68
    new-instance v0, Ljava/io/UncheckedIOException;

    .line 69
    .line 70
    invoke-direct {v0, p0}, Ljava/io/UncheckedIOException;-><init>(Ljava/io/IOException;)V

    .line 71
    .line 72
    .line 73
    throw v0

    .line 74
    :catch_1
    move-exception p0

    .line 75
    new-instance v0, Ljava/io/UncheckedIOException;

    .line 76
    .line 77
    invoke-direct {v0, p0}, Ljava/io/UncheckedIOException;-><init>(Ljava/io/IOException;)V

    .line 78
    .line 79
    .line 80
    throw v0
.end method

.method public static 飘花落叶言子楪世苏兰哲(Ljava/io/File;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const-string v0, "Parameter \'directory\' is not a directory: \'"

    .line 14
    .line 15
    const-string v1, "\'"

    .line 16
    .line 17
    invoke-static {p0, v0, v1}, L飘花落叶言苏世哲楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    new-instance v0, Ljava/io/FileNotFoundException;

    .line 22
    .line 23
    new-instance v1, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    const-string v2, "Directory \'"

    .line 26
    .line 27
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string p0, "\' does not exist."

    .line 34
    .line 35
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-direct {v0, p0}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw v0

    .line 46
    :cond_1
    return-void
.end method

.method public static 飘花落叶言子楪世苏哲兰(Ljava/io/File;)J
    .locals 2

    .line 1
    :try_start_0
    const-string v0, "file"

    .line 2
    .line 3
    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const/4 v0, 0x0

    .line 11
    new-array v0, v0, [Ljava/nio/file/LinkOption;

    .line 12
    .line 13
    invoke-static {p0, v0}, Ljava/nio/file/Files;->getLastModifiedTime(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/nio/file/attribute/FileTime;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0}, Ljava/nio/file/attribute/FileTime;->toMillis()J

    .line 18
    .line 19
    .line 20
    move-result-wide v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    return-wide v0

    .line 22
    :catch_0
    move-exception p0

    .line 23
    new-instance v0, Ljava/io/UncheckedIOException;

    .line 24
    .line 25
    invoke-direct {v0, p0}, Ljava/io/UncheckedIOException;-><init>(Ljava/io/IOException;)V

    .line 26
    .line 27
    .line 28
    throw v0
.end method
