.class public Lorg/apache/commons/io/filefilter/NotFileFilter;
.super L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世苏哲兰;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = 0x5517b05cf2c98bb6L


# instance fields
.field private final filter:L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世兰苏哲;


# direct methods
.method public constructor <init>(L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世兰苏哲;)V
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
    iput-object p1, p0, Lorg/apache/commons/io/filefilter/NotFileFilter;->filter:L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世兰苏哲;

    .line 10
    .line 11
    return-void
.end method

.method private not(Ljava/nio/file/FileVisitResult;)Ljava/nio/file/FileVisitResult;
    .locals 0

    .line 1
    sget-object p0, Ljava/nio/file/FileVisitResult;->CONTINUE:Ljava/nio/file/FileVisitResult;

    .line 2
    .line 3
    if-ne p1, p0, :cond_0

    .line 4
    .line 5
    sget-object p0, Ljava/nio/file/FileVisitResult;->TERMINATE:Ljava/nio/file/FileVisitResult;

    .line 6
    .line 7
    :cond_0
    return-object p0
.end method


# virtual methods
.method public accept(Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/commons/io/filefilter/NotFileFilter;->filter:L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世兰苏哲;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世兰苏哲;->accept(Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-direct {p0, p1}, Lorg/apache/commons/io/filefilter/NotFileFilter;->not(Ljava/nio/file/FileVisitResult;)Ljava/nio/file/FileVisitResult;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public accept(Ljava/io/File;)Z
    .locals 0

    .line 13
    iget-object p0, p0, Lorg/apache/commons/io/filefilter/NotFileFilter;->filter:L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世兰苏哲;

    invoke-interface {p0, p1}, L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世兰苏哲;->accept(Ljava/io/File;)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public accept(Ljava/io/File;Ljava/lang/String;)Z
    .locals 0

    .line 12
    iget-object p0, p0, Lorg/apache/commons/io/filefilter/NotFileFilter;->filter:L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世兰苏哲;

    invoke-interface {p0, p1, p2}, L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世兰苏哲;->accept(Ljava/io/File;Ljava/lang/String;)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

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
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "NOT ("

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lorg/apache/commons/io/filefilter/NotFileFilter;->filter:L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世兰苏哲;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string p0, ")"

    .line 18
    .line 19
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method
