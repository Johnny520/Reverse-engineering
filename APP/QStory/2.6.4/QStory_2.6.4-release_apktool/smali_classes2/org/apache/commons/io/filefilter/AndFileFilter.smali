.class public Lorg/apache/commons/io/filefilter/AndFileFilter;
.super L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世苏哲兰;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = 0x64244abf5410ad49L


# instance fields
.field private final fileFilters:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u82cf\u5b50\u54f2\u696a\u5170\u4e16/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u82cf\u54f2;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 20
    invoke-direct {p0, v0}, Lorg/apache/commons/io/filefilter/AndFileFilter;-><init>(I)V

    return-void
.end method

.method private constructor <init>(I)V
    .locals 1

    .line 19
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-direct {p0, v0}, Lorg/apache/commons/io/filefilter/AndFileFilter;-><init>(Ljava/util/ArrayList;)V

    return-void
.end method

.method private constructor <init>(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u82cf\u5b50\u54f2\u696a\u5170\u4e16/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u82cf\u54f2;",
            ">;)V"
        }
    .end annotation

    .line 17
    invoke-direct {p0}, L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世苏哲兰;-><init>()V

    .line 18
    const-string v0, "initialList"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    iput-object p1, p0, Lorg/apache/commons/io/filefilter/AndFileFilter;->fileFilters:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u82cf\u5b50\u54f2\u696a\u5170\u4e16/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u82cf\u54f2;",
            ">;)V"
        }
    .end annotation

    .line 24
    new-instance v0, Ljava/util/ArrayList;

    const-string v1, "fileFilters"

    invoke-static {p1, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p1, Ljava/util/Collection;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-direct {p0, v0}, Lorg/apache/commons/io/filefilter/AndFileFilter;-><init>(Ljava/util/ArrayList;)V

    return-void
.end method

.method public constructor <init>(L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世兰苏哲;L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世兰苏哲;)V
    .locals 1

    const/4 v0, 0x2

    .line 21
    invoke-direct {p0, v0}, Lorg/apache/commons/io/filefilter/AndFileFilter;-><init>(I)V

    .line 22
    invoke-virtual {p0, p1}, Lorg/apache/commons/io/filefilter/AndFileFilter;->addFileFilter(L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世兰苏哲;)V

    .line 23
    invoke-virtual {p0, p2}, Lorg/apache/commons/io/filefilter/AndFileFilter;->addFileFilter(L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世兰苏哲;)V

    return-void
.end method

.method public varargs constructor <init>([L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世兰苏哲;)V
    .locals 1

    .line 1
    const-string v0, "fileFilters"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-object v0, p1

    .line 7
    check-cast v0, [L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世兰苏哲;

    .line 8
    .line 9
    array-length v0, v0

    .line 10
    invoke-direct {p0, v0}, Lorg/apache/commons/io/filefilter/AndFileFilter;-><init>(I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lorg/apache/commons/io/filefilter/AndFileFilter;->addFileFilter([L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世兰苏哲;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method private isEmpty()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/apache/commons/io/filefilter/AndFileFilter;->fileFilters:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method private static synthetic lambda$accept$0(Ljava/io/File;L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世兰苏哲;)Z
    .locals 0

    .line 1
    invoke-interface {p1, p0}, L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世兰苏哲;->accept(Ljava/io/File;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private static synthetic lambda$accept$1(Ljava/io/File;Ljava/lang/String;L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世兰苏哲;)Z
    .locals 0

    .line 1
    invoke-interface {p2, p0, p1}, L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世兰苏哲;->accept(Ljava/io/File;Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private static synthetic lambda$accept$2(Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世兰苏哲;)Z
    .locals 0

    .line 1
    invoke-interface {p2, p0, p1}, L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世兰苏哲;->accept(Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object p1, Ljava/nio/file/FileVisitResult;->CONTINUE:Ljava/nio/file/FileVisitResult;

    .line 6
    .line 7
    if-ne p0, p1, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public static synthetic 飘花落叶言子楪世哲苏兰(Ljava/io/File;L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世兰苏哲;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lorg/apache/commons/io/filefilter/AndFileFilter;->lambda$accept$0(Ljava/io/File;L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世兰苏哲;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic 飘花落叶言子楪世苏兰哲(Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世兰苏哲;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lorg/apache/commons/io/filefilter/AndFileFilter;->lambda$accept$2(Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世兰苏哲;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic 飘花落叶言子楪世苏哲兰(Ljava/io/File;Ljava/lang/String;L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世兰苏哲;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lorg/apache/commons/io/filefilter/AndFileFilter;->lambda$accept$1(Ljava/io/File;Ljava/lang/String;L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世兰苏哲;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method


# virtual methods
.method public accept(Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;
    .locals 2

    .line 1
    invoke-direct {p0}, Lorg/apache/commons/io/filefilter/AndFileFilter;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object p0, Ljava/nio/file/FileVisitResult;->TERMINATE:Ljava/nio/file/FileVisitResult;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    iget-object p0, p0, Lorg/apache/commons/io/filefilter/AndFileFilter;->fileFilters:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {p0}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    new-instance v0, L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世苏兰哲;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-direct {v0, p1, p2, v1}, L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世苏兰哲;-><init>(Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;I)V

    .line 20
    .line 21
    .line 22
    invoke-interface {p0, v0}, Ljava/util/stream/Stream;->allMatch(Ljava/util/function/Predicate;)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    invoke-static {p0}, L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世苏哲兰;->toDefaultFileVisitResult(Z)Ljava/nio/file/FileVisitResult;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0
.end method

.method public accept(Ljava/io/File;)Z
    .locals 2

    .line 32
    invoke-direct {p0}, Lorg/apache/commons/io/filefilter/AndFileFilter;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object p0, p0, Lorg/apache/commons/io/filefilter/AndFileFilter;->fileFilters:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    move-result-object p0

    new-instance v0, L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世哲苏兰;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世哲苏兰;-><init>(Ljava/io/File;I)V

    invoke-interface {p0, v0}, Ljava/util/stream/Stream;->allMatch(Ljava/util/function/Predicate;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public accept(Ljava/io/File;Ljava/lang/String;)Z
    .locals 2

    .line 31
    invoke-direct {p0}, Lorg/apache/commons/io/filefilter/AndFileFilter;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object p0, p0, Lorg/apache/commons/io/filefilter/AndFileFilter;->fileFilters:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    move-result-object p0

    new-instance v0, L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世哲兰苏;

    const/4 v1, 0x0

    invoke-direct {v0, p2, p1, v1}, L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世哲兰苏;-><init>(Ljava/lang/String;Ljava/io/File;I)V

    invoke-interface {p0, v0}, Ljava/util/stream/Stream;->allMatch(Ljava/util/function/Predicate;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public addFileFilter(L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世兰苏哲;)V
    .locals 1

    .line 22
    iget-object p0, p0, Lorg/apache/commons/io/filefilter/AndFileFilter;->fileFilters:Ljava/util/List;

    const-string v0, "fileFilter"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p1, L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世兰苏哲;

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public varargs addFileFilter([L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世兰苏哲;)V
    .locals 2

    .line 1
    const-string v0, "fileFilters"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    check-cast p1, [L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世兰苏哲;

    .line 7
    .line 8
    invoke-static {p1}, Ljava/util/stream/Stream;->of([Ljava/lang/Object;)Ljava/util/stream/Stream;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    new-instance v0, Lbsh/飘花落叶言子苏世楪哲兰;

    .line 13
    .line 14
    const/4 v1, 0x5

    .line 15
    invoke-direct {v0, p0, v1}, Lbsh/飘花落叶言子苏世楪哲兰;-><init>(Ljava/lang/Object;I)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p1, v0}, Ljava/util/stream/Stream;->forEach(Ljava/util/function/Consumer;)V

    .line 19
    .line 20
    .line 21
    return-void
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

.method public getFileFilters()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u82cf\u5b50\u54f2\u696a\u5170\u4e16/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u82cf\u54f2;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lorg/apache/commons/io/filefilter/AndFileFilter;->fileFilters:Ljava/util/List;

    .line 2
    .line 3
    invoke-static {p0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
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

.method public removeFileFilter(L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世兰苏哲;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/apache/commons/io/filefilter/AndFileFilter;->fileFilters:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public setFileFilters(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u82cf\u5b50\u54f2\u696a\u5170\u4e16/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u82cf\u54f2;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lorg/apache/commons/io/filefilter/AndFileFilter;->fileFilters:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lorg/apache/commons/io/filefilter/AndFileFilter;->fileFilters:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {p0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世苏哲兰;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, "("

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lorg/apache/commons/io/filefilter/AndFileFilter;->fileFilters:Ljava/util/List;

    .line 19
    .line 20
    invoke-virtual {p0, v1, v0}, L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世苏哲兰;->append(Ljava/util/List;Ljava/lang/StringBuilder;)V

    .line 21
    .line 22
    .line 23
    const-string p0, ")"

    .line 24
    .line 25
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method
