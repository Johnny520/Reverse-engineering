.class public Lorg/apache/commons/io/filefilter/SymbolicLinkFileFilter;
.super L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世苏哲兰;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final INSTANCE:Lorg/apache/commons/io/filefilter/SymbolicLinkFileFilter;

.field private static final serialVersionUID:J = 0x1L


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lorg/apache/commons/io/filefilter/SymbolicLinkFileFilter;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/apache/commons/io/filefilter/SymbolicLinkFileFilter;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lorg/apache/commons/io/filefilter/SymbolicLinkFileFilter;->INSTANCE:Lorg/apache/commons/io/filefilter/SymbolicLinkFileFilter;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世苏哲兰;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public constructor <init>(Ljava/nio/file/FileVisitResult;Ljava/nio/file/FileVisitResult;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2}, L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世苏哲兰;-><init>(Ljava/nio/file/FileVisitResult;Ljava/nio/file/FileVisitResult;)V

    return-void
.end method


# virtual methods
.method public accept(Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;
    .locals 0

    .line 10
    invoke-virtual {p0, p1}, Lorg/apache/commons/io/filefilter/SymbolicLinkFileFilter;->isSymbolicLink(Ljava/nio/file/Path;)Z

    move-result p1

    invoke-virtual {p0, p1}, L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世苏哲兰;->toFileVisitResult(Z)Ljava/nio/file/FileVisitResult;

    move-result-object p0

    return-object p0
.end method

.method public accept(Ljava/io/File;)Z
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, Lorg/apache/commons/io/filefilter/SymbolicLinkFileFilter;->isSymbolicLink(Ljava/nio/file/Path;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
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

.method public isSymbolicLink(Ljava/nio/file/Path;)Z
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/nio/file/Files;->isSymbolicLink(Ljava/nio/file/Path;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
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
