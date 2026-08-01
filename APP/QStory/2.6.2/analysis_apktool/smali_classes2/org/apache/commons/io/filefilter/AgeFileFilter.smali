.class public Lorg/apache/commons/io/filefilter/AgeFileFilter;
.super L飘花落叶言苏子世哲兰楪/飘花落叶言子楪世苏哲兰;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = -0x1d9903ce8204c92dL


# instance fields
.field private final acceptOlder:Z

.field private final cutoffInstant:Ljava/time/Instant;


# direct methods
.method public constructor <init>(J)V
    .locals 0

    .line 1
    invoke-static {p1, p2}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 p2, 0x1

    .line 6
    invoke-direct {p0, p1, p2}, Lorg/apache/commons/io/filefilter/AgeFileFilter;-><init>(Ljava/time/Instant;Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(JZ)V
    .locals 0

    .line 18
    invoke-static {p1, p2}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    move-result-object p1

    invoke-direct {p0, p1, p3}, Lorg/apache/commons/io/filefilter/AgeFileFilter;-><init>(Ljava/time/Instant;Z)V

    return-void
.end method

.method public constructor <init>(Ljava/io/File;)V
    .locals 1

    const/4 v0, 0x1

    .line 11
    invoke-direct {p0, p1, v0}, Lorg/apache/commons/io/filefilter/AgeFileFilter;-><init>(Ljava/io/File;Z)V

    return-void
.end method

.method public constructor <init>(Ljava/io/File;Z)V
    .locals 2

    .line 12
    invoke-static {p1}, L飘花落叶言苏子楪兰哲世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(Ljava/io/File;)J

    move-result-wide v0

    invoke-direct {p0, v0, v1, p2}, Lorg/apache/commons/io/filefilter/AgeFileFilter;-><init>(JZ)V

    return-void
.end method

.method public constructor <init>(Ljava/time/Instant;)V
    .locals 1

    const/4 v0, 0x1

    .line 13
    invoke-direct {p0, p1, v0}, Lorg/apache/commons/io/filefilter/AgeFileFilter;-><init>(Ljava/time/Instant;Z)V

    return-void
.end method

.method public constructor <init>(Ljava/time/Instant;Z)V
    .locals 0

    .line 14
    invoke-direct {p0}, L飘花落叶言苏子世哲兰楪/飘花落叶言子楪世苏哲兰;-><init>()V

    .line 15
    iput-boolean p2, p0, Lorg/apache/commons/io/filefilter/AgeFileFilter;->acceptOlder:Z

    .line 16
    iput-object p1, p0, Lorg/apache/commons/io/filefilter/AgeFileFilter;->cutoffInstant:Ljava/time/Instant;

    return-void
.end method

.method public constructor <init>(Ljava/util/Date;)V
    .locals 1

    const/4 v0, 0x1

    .line 17
    invoke-direct {p0, p1, v0}, Lorg/apache/commons/io/filefilter/AgeFileFilter;-><init>(Ljava/util/Date;Z)V

    return-void
.end method

.method public constructor <init>(Ljava/util/Date;Z)V
    .locals 0

    .line 10
    invoke-virtual {p1}, Ljava/util/Date;->toInstant()Ljava/time/Instant;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Lorg/apache/commons/io/filefilter/AgeFileFilter;-><init>(Ljava/time/Instant;Z)V

    return-void
.end method

.method private lambda$accept$0(Ljava/nio/file/Path;)Ljava/nio/file/FileVisitResult;
    .locals 6

    .line 1
    iget-boolean v0, p0, Lorg/apache/commons/io/filefilter/AgeFileFilter;->acceptOlder:Z

    .line 2
    .line 3
    iget-object v1, p0, Lorg/apache/commons/io/filefilter/AgeFileFilter;->cutoffInstant:Ljava/time/Instant;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    new-array v3, v2, [Ljava/nio/file/LinkOption;

    .line 7
    .line 8
    sget-object v4, L飘花落叶言苏子世楪兰哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:[Ljava/nio/file/OpenOption;

    .line 9
    .line 10
    invoke-static {v1}, Ljava/nio/file/attribute/FileTime;->from(Ljava/time/Instant;)Ljava/nio/file/attribute/FileTime;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    new-array v4, v2, [Ljava/nio/file/LinkOption;

    .line 15
    .line 16
    const-string v5, "path"

    .line 17
    .line 18
    invoke-static {p1, v5}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    invoke-static {p1, v4}, Ljava/nio/file/Files;->notExists(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    const/4 v5, 0x1

    .line 26
    if-eqz v4, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-static {p1, v3}, Ljava/nio/file/Files;->getLastModifiedTime(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/nio/file/attribute/FileTime;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p1, v1}, Ljava/nio/file/attribute/FileTime;->compareTo(Ljava/nio/file/attribute/FileTime;)I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-lez p1, :cond_1

    .line 38
    .line 39
    move p1, v5

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    :goto_0
    move p1, v2

    .line 42
    :goto_1
    if-eq v0, p1, :cond_2

    .line 43
    .line 44
    move v2, v5

    .line 45
    :cond_2
    invoke-virtual {p0, v2}, L飘花落叶言苏子世哲兰楪/飘花落叶言子楪世苏哲兰;->toFileVisitResult(Z)Ljava/nio/file/FileVisitResult;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0
.end method

.method public static synthetic 飘花落叶言子楪世苏哲兰(Lorg/apache/commons/io/filefilter/AgeFileFilter;Ljava/nio/file/Path;)Ljava/nio/file/FileVisitResult;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lorg/apache/commons/io/filefilter/AgeFileFilter;->lambda$accept$0(Ljava/nio/file/Path;)Ljava/nio/file/FileVisitResult;

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

    .line 64
    new-instance p2, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世兰哲苏楪;

    const/4 v0, 0x7

    invoke-direct {p2, p0, v0, p1}, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世兰哲苏楪;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {p0, p2}, L飘花落叶言苏子世哲兰楪/飘花落叶言子楪世苏哲兰;->get(L飘花落叶言苏子世兰楪哲/飘花落叶言子楪世兰苏哲;)Ljava/nio/file/FileVisitResult;

    move-result-object p0

    return-object p0
.end method

.method public accept(Ljava/io/File;)Z
    .locals 5

    .line 1
    iget-boolean v0, p0, Lorg/apache/commons/io/filefilter/AgeFileFilter;->acceptOlder:Z

    .line 2
    .line 3
    iget-object p0, p0, Lorg/apache/commons/io/filefilter/AgeFileFilter;->cutoffInstant:Ljava/time/Instant;

    .line 4
    .line 5
    sget-object v1, L飘花落叶言苏子楪兰哲世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:[Ljava/io/File;

    .line 6
    .line 7
    const-string v1, "instant"

    .line 8
    .line 9
    invoke-static {p0, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    :try_start_0
    invoke-virtual {p1}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const/4 v1, 0x0

    .line 17
    new-array v2, v1, [Ljava/nio/file/LinkOption;

    .line 18
    .line 19
    sget-object v3, L飘花落叶言苏子世楪兰哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:[Ljava/nio/file/OpenOption;

    .line 20
    .line 21
    invoke-static {p0}, Ljava/nio/file/attribute/FileTime;->from(Ljava/time/Instant;)Ljava/nio/file/attribute/FileTime;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    new-array v3, v1, [Ljava/nio/file/LinkOption;

    .line 26
    .line 27
    const-string v4, "path"

    .line 28
    .line 29
    invoke-static {p1, v4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    invoke-static {p1, v3}, Ljava/nio/file/Files;->notExists(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    const/4 v4, 0x1

    .line 37
    if-eqz v3, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    invoke-static {p1, v2}, Ljava/nio/file/Files;->getLastModifiedTime(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/nio/file/attribute/FileTime;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p1, p0}, Ljava/nio/file/attribute/FileTime;->compareTo(Ljava/nio/file/attribute/FileTime;)I

    .line 45
    .line 46
    .line 47
    move-result p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    if-lez p0, :cond_1

    .line 49
    .line 50
    move p0, v4

    .line 51
    goto :goto_1

    .line 52
    :cond_1
    :goto_0
    move p0, v1

    .line 53
    :goto_1
    if-eq v0, p0, :cond_2

    .line 54
    .line 55
    return v4

    .line 56
    :cond_2
    return v1

    .line 57
    :catch_0
    move-exception p0

    .line 58
    new-instance p1, Ljava/io/UncheckedIOException;

    .line 59
    .line 60
    invoke-direct {p1, p0}, Ljava/io/UncheckedIOException;-><init>(Ljava/io/IOException;)V

    .line 61
    .line 62
    .line 63
    throw p1
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

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget-boolean v0, p0, Lorg/apache/commons/io/filefilter/AgeFileFilter;->acceptOlder:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, "<="

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const-string v0, ">"

    .line 9
    .line 10
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-super {p0}, L飘花落叶言苏子世哲兰楪/飘花落叶言子楪世苏哲兰;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v2, "("

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget-object p0, p0, Lorg/apache/commons/io/filefilter/AgeFileFilter;->cutoffInstant:Ljava/time/Instant;

    .line 31
    .line 32
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string p0, ")"

    .line 36
    .line 37
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0
.end method
