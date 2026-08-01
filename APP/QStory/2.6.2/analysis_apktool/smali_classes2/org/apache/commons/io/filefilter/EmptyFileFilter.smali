.class public Lorg/apache/commons/io/filefilter/EmptyFileFilter;
.super L飘花落叶言苏子世哲兰楪/飘花落叶言子楪世苏哲兰;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final EMPTY:L飘花落叶言苏子世哲兰楪/飘花落叶言子楪世兰苏哲;

.field public static final NOT_EMPTY:L飘花落叶言苏子世哲兰楪/飘花落叶言子楪世兰苏哲;

.field private static final serialVersionUID:J = 0x3265672603b5b8d3L


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lorg/apache/commons/io/filefilter/EmptyFileFilter;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/apache/commons/io/filefilter/EmptyFileFilter;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lorg/apache/commons/io/filefilter/EmptyFileFilter;->EMPTY:L飘花落叶言苏子世哲兰楪/飘花落叶言子楪世兰苏哲;

    .line 7
    .line 8
    invoke-interface {v0}, L飘花落叶言苏子世哲兰楪/飘花落叶言子楪世兰苏哲;->negate()L飘花落叶言苏子世哲兰楪/飘花落叶言子楪世兰苏哲;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sput-object v0, Lorg/apache/commons/io/filefilter/EmptyFileFilter;->NOT_EMPTY:L飘花落叶言苏子世哲兰楪/飘花落叶言子楪世兰苏哲;

    .line 13
    .line 14
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, L飘花落叶言苏子世哲兰楪/飘花落叶言子楪世苏哲兰;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private synthetic lambda$accept$0(Ljava/nio/file/Path;)Ljava/nio/file/FileVisitResult;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v1, v0, [Ljava/nio/file/LinkOption;

    .line 3
    .line 4
    invoke-static {p1, v1}, Ljava/nio/file/Files;->isDirectory(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    const/4 v2, 0x1

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    invoke-static {p1}, Ljava/nio/file/Files;->list(Ljava/nio/file/Path;)Ljava/util/stream/Stream;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    :try_start_0
    invoke-interface {p1}, Ljava/util/stream/Stream;->findFirst()Ljava/util/Optional;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Ljava/util/Optional;->isPresent()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    xor-int/2addr v0, v2

    .line 24
    invoke-virtual {p0, v0}, L飘花落叶言苏子世哲兰楪/飘花落叶言子楪世苏哲兰;->toFileVisitResult(Z)Ljava/nio/file/FileVisitResult;

    .line 25
    .line 26
    .line 27
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    invoke-interface {p1}, Ljava/util/stream/BaseStream;->close()V

    .line 29
    .line 30
    .line 31
    return-object p0

    .line 32
    :catchall_0
    move-exception p0

    .line 33
    if-eqz p1, :cond_0

    .line 34
    .line 35
    :try_start_1
    invoke-interface {p1}, Ljava/util/stream/BaseStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catchall_1
    move-exception p1

    .line 40
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 41
    .line 42
    .line 43
    :cond_0
    :goto_0
    throw p0

    .line 44
    :cond_1
    invoke-static {p1}, Ljava/nio/file/Files;->size(Ljava/nio/file/Path;)J

    .line 45
    .line 46
    .line 47
    move-result-wide v3

    .line 48
    const-wide/16 v5, 0x0

    .line 49
    .line 50
    cmp-long p1, v3, v5

    .line 51
    .line 52
    if-nez p1, :cond_2

    .line 53
    .line 54
    move v0, v2

    .line 55
    :cond_2
    invoke-virtual {p0, v0}, L飘花落叶言苏子世哲兰楪/飘花落叶言子楪世苏哲兰;->toFileVisitResult(Z)Ljava/nio/file/FileVisitResult;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0
.end method

.method public static synthetic 飘花落叶言子楪世苏哲兰(Lorg/apache/commons/io/filefilter/EmptyFileFilter;Ljava/nio/file/Path;)Ljava/nio/file/FileVisitResult;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lorg/apache/commons/io/filefilter/EmptyFileFilter;->lambda$accept$0(Ljava/nio/file/Path;)Ljava/nio/file/FileVisitResult;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public accept(Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    .line 39
    invoke-virtual {p0, p1}, L飘花落叶言苏子世哲兰楪/飘花落叶言子楪世苏哲兰;->toFileVisitResult(Z)Ljava/nio/file/FileVisitResult;

    move-result-object p0

    return-object p0

    .line 40
    :cond_0
    new-instance p2, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世兰哲苏楪;

    const/16 v0, 0x8

    invoke-direct {p2, p0, v0, p1}, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世兰哲苏楪;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {p0, p2}, L飘花落叶言苏子世哲兰楪/飘花落叶言子楪世苏哲兰;->get(L飘花落叶言苏子世兰楪哲/飘花落叶言子楪世兰苏哲;)Ljava/nio/file/FileVisitResult;

    move-result-object p0

    return-object p0
.end method

.method public accept(Ljava/io/File;)Z
    .locals 6

    .line 1
    const/4 p0, 0x1

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return p0

    .line 5
    :cond_0
    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_3

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    sget-object v0, L飘花落叶言苏子楪兰哲世/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:[B

    .line 17
    .line 18
    if-nez p1, :cond_1

    .line 19
    .line 20
    move p1, v1

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    array-length p1, p1

    .line 23
    :goto_0
    if-nez p1, :cond_2

    .line 24
    .line 25
    return p0

    .line 26
    :cond_2
    return v1

    .line 27
    :cond_3
    invoke-virtual {p1}, Ljava/io/File;->length()J

    .line 28
    .line 29
    .line 30
    move-result-wide v2

    .line 31
    const-wide/16 v4, 0x0

    .line 32
    .line 33
    cmp-long p1, v2, v4

    .line 34
    .line 35
    if-nez p1, :cond_4

    .line 36
    .line 37
    return p0

    .line 38
    :cond_4
    return v1
.end method

.method public and(L飘花落叶言苏子世哲兰楪/飘花落叶言子楪世兰苏哲;)L飘花落叶言苏子世哲兰楪/飘花落叶言子楪世兰苏哲;
    .locals 1

    .line 1
    new-instance v0, Lorg/apache/commons/io/filefilter/AndFileFilter;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lorg/apache/commons/io/filefilter/AndFileFilter;-><init>(L飘花落叶言苏子世哲兰楪/飘花落叶言子楪世兰苏哲;L飘花落叶言苏子世哲兰楪/飘花落叶言子楪世兰苏哲;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public bridge synthetic matches(Ljava/nio/file/Path;)Z
    .locals 0

    .line 1
    invoke-super {p0, p1}, L飘花落叶言苏子世哲兰楪/飘花落叶言子楪世兰苏哲;->matches(Ljava/nio/file/Path;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public negate()L飘花落叶言苏子世哲兰楪/飘花落叶言子楪世兰苏哲;
    .locals 1

    .line 1
    new-instance v0, Lorg/apache/commons/io/filefilter/NotFileFilter;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lorg/apache/commons/io/filefilter/NotFileFilter;-><init>(L飘花落叶言苏子世哲兰楪/飘花落叶言子楪世兰苏哲;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public or(L飘花落叶言苏子世哲兰楪/飘花落叶言子楪世兰苏哲;)L飘花落叶言苏子世哲兰楪/飘花落叶言子楪世兰苏哲;
    .locals 1

    .line 1
    new-instance v0, Lorg/apache/commons/io/filefilter/OrFileFilter;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lorg/apache/commons/io/filefilter/OrFileFilter;-><init>(L飘花落叶言苏子世哲兰楪/飘花落叶言子楪世兰苏哲;L飘花落叶言苏子世哲兰楪/飘花落叶言子楪世兰苏哲;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
