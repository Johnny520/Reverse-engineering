.class public Lorg/apache/commons/io/filefilter/DelegateFileFilter;
.super L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世苏哲兰;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = -0x790fa5a385e812f6L


# instance fields
.field private final transient fileFilter:Ljava/io/FileFilter;

.field private final transient fileNameFilter:Ljava/io/FilenameFilter;


# direct methods
.method public constructor <init>(Ljava/io/FileFilter;)V
    .locals 1

    .line 1
    invoke-direct {p0}, L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世苏哲兰;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "filter"

    .line 5
    .line 6
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lorg/apache/commons/io/filefilter/DelegateFileFilter;->fileFilter:Ljava/io/FileFilter;

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    iput-object p1, p0, Lorg/apache/commons/io/filefilter/DelegateFileFilter;->fileNameFilter:Ljava/io/FilenameFilter;

    .line 13
    .line 14
    return-void
.end method

.method public constructor <init>(Ljava/io/FilenameFilter;)V
    .locals 1

    .line 15
    invoke-direct {p0}, L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世苏哲兰;-><init>()V

    .line 16
    const-string v0, "filter"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 17
    iput-object p1, p0, Lorg/apache/commons/io/filefilter/DelegateFileFilter;->fileNameFilter:Ljava/io/FilenameFilter;

    const/4 p1, 0x0

    .line 18
    iput-object p1, p0, Lorg/apache/commons/io/filefilter/DelegateFileFilter;->fileFilter:Ljava/io/FileFilter;

    return-void
.end method


# virtual methods
.method public accept(Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/nio/file/Path;->toFile()Ljava/io/File;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {p0, p1}, L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世兰苏哲;->accept(Ljava/io/File;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    :goto_0
    invoke-static {p0}, L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世苏哲兰;->toDefaultFileVisitResult(Z)Ljava/nio/file/FileVisitResult;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public accept(Ljava/io/File;)Z
    .locals 1

    .line 21
    iget-object v0, p0, Lorg/apache/commons/io/filefilter/DelegateFileFilter;->fileFilter:Ljava/io/FileFilter;

    if-eqz v0, :cond_0

    .line 22
    invoke-interface {v0, p1}, Ljava/io/FileFilter;->accept(Ljava/io/File;)Z

    move-result p0

    return p0

    .line 23
    :cond_0
    invoke-super {p0, p1}, L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世苏哲兰;->accept(Ljava/io/File;)Z

    move-result p0

    return p0
.end method

.method public accept(Ljava/io/File;Ljava/lang/String;)Z
    .locals 1

    .line 24
    iget-object v0, p0, Lorg/apache/commons/io/filefilter/DelegateFileFilter;->fileNameFilter:Ljava/io/FilenameFilter;

    if-eqz v0, :cond_0

    .line 25
    invoke-interface {v0, p1, p2}, Ljava/io/FilenameFilter;->accept(Ljava/io/File;Ljava/lang/String;)Z

    move-result p0

    return p0

    .line 26
    :cond_0
    invoke-super {p0, p1, p2}, L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世苏哲兰;->accept(Ljava/io/File;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public and(L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世兰苏哲;)L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世兰苏哲;
    .locals 1

    .line 1
    new-instance v0, Lorg/apache/commons/io/filefilter/AndFileFilter;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lorg/apache/commons/io/filefilter/AndFileFilter;-><init>(L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世兰苏哲;L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世兰苏哲;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public bridge synthetic matches(Ljava/nio/file/Path;)Z
    .locals 0

    .line 1
    invoke-super {p0, p1}, L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世兰苏哲;->matches(Ljava/nio/file/Path;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public negate()L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世兰苏哲;
    .locals 1

    .line 1
    new-instance v0, Lorg/apache/commons/io/filefilter/NotFileFilter;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lorg/apache/commons/io/filefilter/NotFileFilter;-><init>(L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世兰苏哲;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public or(L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世兰苏哲;)L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世兰苏哲;
    .locals 1

    .line 1
    new-instance v0, Lorg/apache/commons/io/filefilter/OrFileFilter;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lorg/apache/commons/io/filefilter/OrFileFilter;-><init>(L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世兰苏哲;L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世兰苏哲;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/apache/commons/io/filefilter/DelegateFileFilter;->fileFilter:Ljava/io/FileFilter;

    .line 2
    .line 3
    iget-object v1, p0, Lorg/apache/commons/io/filefilter/DelegateFileFilter;->fileNameFilter:Ljava/io/FilenameFilter;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-static {v1, v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-static {v0, v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-instance v1, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-super {p0}, L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世苏哲兰;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string p0, "("

    .line 27
    .line 28
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string p0, ")"

    .line 35
    .line 36
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0
.end method
