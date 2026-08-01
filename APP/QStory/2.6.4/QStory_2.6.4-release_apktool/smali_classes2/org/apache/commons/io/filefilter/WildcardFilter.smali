.class public Lorg/apache/commons/io/filefilter/WildcardFilter;
.super L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世苏哲兰;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x45e95041fb210b2dL


# instance fields
.field private final wildcards:[Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 20
    invoke-direct {p0}, L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世苏哲兰;-><init>()V

    .line 21
    const-string v0, "wildcard"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 22
    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lorg/apache/commons/io/filefilter/WildcardFilter;->wildcards:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世苏哲兰;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "wildcards"

    .line 5
    .line 6
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    sget-object v0, L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏世兰:[Ljava/lang/String;

    .line 10
    .line 11
    invoke-interface {p1, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, [Ljava/lang/String;

    .line 16
    .line 17
    iput-object p1, p0, Lorg/apache/commons/io/filefilter/WildcardFilter;->wildcards:[Ljava/lang/String;

    .line 18
    .line 19
    return-void
.end method

.method public varargs constructor <init>([Ljava/lang/String;)V
    .locals 1

    .line 23
    invoke-direct {p0}, L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世苏哲兰;-><init>()V

    .line 24
    const-string v0, "wildcards"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 25
    invoke-virtual {p1}, [Ljava/lang/String;->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    iput-object p1, p0, Lorg/apache/commons/io/filefilter/WildcardFilter;->wildcards:[Ljava/lang/String;

    return-void
.end method

.method private static lambda$accept$0(Ljava/io/File;Ljava/lang/String;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, L飘花落叶言苏子世哲兰楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:[Ljava/lang/String;

    .line 6
    .line 7
    sget-object v0, Lorg/apache/commons/io/IOCase;->SENSITIVE:Lorg/apache/commons/io/IOCase;

    .line 8
    .line 9
    invoke-static {p0, p1, v0}, L飘花落叶言苏子世哲兰楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Lorg/apache/commons/io/IOCase;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method private static lambda$accept$1(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    .line 1
    sget-object v0, L飘花落叶言苏子世哲兰楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:[Ljava/lang/String;

    .line 2
    .line 3
    sget-object v0, Lorg/apache/commons/io/IOCase;->SENSITIVE:Lorg/apache/commons/io/IOCase;

    .line 4
    .line 5
    invoke-static {p0, p1, v0}, L飘花落叶言苏子世哲兰楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Lorg/apache/commons/io/IOCase;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method private static lambda$accept$2(Ljava/nio/file/Path;Ljava/lang/String;)Z
    .locals 1

    .line 1
    invoke-static {p0}, L飘花落叶言苏子世兰哲楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰(Ljava/nio/file/Path;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, L飘花落叶言苏子世哲兰楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:[Ljava/lang/String;

    .line 6
    .line 7
    sget-object v0, Lorg/apache/commons/io/IOCase;->SENSITIVE:Lorg/apache/commons/io/IOCase;

    .line 8
    .line 9
    invoke-static {p0, p1, v0}, L飘花落叶言苏子世哲兰楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Lorg/apache/commons/io/IOCase;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public static synthetic 飘花落叶言子楪世哲苏兰(Ljava/io/File;Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lorg/apache/commons/io/filefilter/WildcardFilter;->lambda$accept$0(Ljava/io/File;Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic 飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lorg/apache/commons/io/filefilter/WildcardFilter;->lambda$accept$1(Ljava/lang/String;Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic 飘花落叶言子楪世苏哲兰(Ljava/nio/file/Path;Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lorg/apache/commons/io/filefilter/WildcardFilter;->lambda$accept$2(Ljava/nio/file/Path;Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method


# virtual methods
.method public accept(Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;
    .locals 1

    .line 1
    const/4 p2, 0x0

    .line 2
    new-array p2, p2, [Ljava/nio/file/LinkOption;

    .line 3
    .line 4
    invoke-static {p1, p2}, Ljava/nio/file/Files;->isDirectory(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z

    .line 5
    .line 6
    .line 7
    move-result p2

    .line 8
    if-eqz p2, :cond_0

    .line 9
    .line 10
    sget-object p0, Ljava/nio/file/FileVisitResult;->TERMINATE:Ljava/nio/file/FileVisitResult;

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    iget-object p0, p0, Lorg/apache/commons/io/filefilter/WildcardFilter;->wildcards:[Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {p0}, Ljava/util/stream/Stream;->of([Ljava/lang/Object;)Ljava/util/stream/Stream;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    new-instance p2, Lbsh/飘花落叶言子楪兰世哲苏;

    .line 20
    .line 21
    const/4 v0, 0x4

    .line 22
    invoke-direct {p2, p1, v0}, Lbsh/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/Object;I)V

    .line 23
    .line 24
    .line 25
    invoke-interface {p0, p2}, Ljava/util/stream/Stream;->anyMatch(Ljava/util/function/Predicate;)Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    invoke-static {p0}, L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世苏哲兰;->toDefaultFileVisitResult(Z)Ljava/nio/file/FileVisitResult;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0
.end method

.method public accept(Ljava/io/File;)Z
    .locals 2

    .line 36
    invoke-virtual {p0, p1}, L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世苏哲兰;->isDirectory(Ljava/io/File;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return p0

    .line 37
    :cond_0
    iget-object p0, p0, Lorg/apache/commons/io/filefilter/WildcardFilter;->wildcards:[Ljava/lang/String;

    invoke-static {p0}, Ljava/util/stream/Stream;->of([Ljava/lang/Object;)Ljava/util/stream/Stream;

    move-result-object p0

    new-instance v0, L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世哲苏兰;

    const/4 v1, 0x2

    invoke-direct {v0, p1, v1}, L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世哲苏兰;-><init>(Ljava/io/File;I)V

    invoke-interface {p0, v0}, Ljava/util/stream/Stream;->anyMatch(Ljava/util/function/Predicate;)Z

    move-result p0

    return p0
.end method

.method public accept(Ljava/io/File;Ljava/lang/String;)Z
    .locals 1

    if-eqz p1, :cond_0

    .line 34
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p0, 0x0

    return p0

    .line 35
    :cond_0
    iget-object p0, p0, Lorg/apache/commons/io/filefilter/WildcardFilter;->wildcards:[Ljava/lang/String;

    invoke-static {p0}, Ljava/util/stream/Stream;->of([Ljava/lang/Object;)Ljava/util/stream/Stream;

    move-result-object p0

    new-instance p1, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏哲兰楪;

    const/4 v0, 0x5

    invoke-direct {p1, p2, v0}, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏哲兰楪;-><init>(Ljava/lang/String;I)V

    invoke-interface {p0, p1}, Ljava/util/stream/Stream;->anyMatch(Ljava/util/function/Predicate;)Z

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
