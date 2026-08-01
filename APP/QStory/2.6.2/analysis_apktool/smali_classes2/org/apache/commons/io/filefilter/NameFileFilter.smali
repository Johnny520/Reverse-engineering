.class public Lorg/apache/commons/io/filefilter/NameFileFilter;
.super L飘花落叶言苏子世哲兰楪/飘花落叶言子楪世苏哲兰;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = 0x274470341d2745cL


# instance fields
.field private final ioCase:Lorg/apache/commons/io/IOCase;

.field private final names:[Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 27
    sget-object v0, Lorg/apache/commons/io/IOCase;->SENSITIVE:Lorg/apache/commons/io/IOCase;

    invoke-direct {p0, p1, v0}, Lorg/apache/commons/io/filefilter/NameFileFilter;-><init>(Ljava/lang/String;Lorg/apache/commons/io/IOCase;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lorg/apache/commons/io/IOCase;)V
    .locals 1

    .line 29
    invoke-direct {p0}, L飘花落叶言苏子世哲兰楪/飘花落叶言子楪世苏哲兰;-><init>()V

    .line 30
    const-string v0, "name"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 31
    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lorg/apache/commons/io/filefilter/NameFileFilter;->names:[Ljava/lang/String;

    .line 32
    invoke-direct {p0, p2}, Lorg/apache/commons/io/filefilter/NameFileFilter;->toIOCase(Lorg/apache/commons/io/IOCase;)Lorg/apache/commons/io/IOCase;

    move-result-object p1

    iput-object p1, p0, Lorg/apache/commons/io/filefilter/NameFileFilter;->ioCase:Lorg/apache/commons/io/IOCase;

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

    const/4 v0, 0x0

    .line 26
    invoke-direct {p0, p1, v0}, Lorg/apache/commons/io/filefilter/NameFileFilter;-><init>(Ljava/util/List;Lorg/apache/commons/io/IOCase;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Lorg/apache/commons/io/IOCase;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lorg/apache/commons/io/IOCase;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, L飘花落叶言苏子世哲兰楪/飘花落叶言子楪世苏哲兰;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "names"

    .line 5
    .line 6
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    sget-object v0, L飘花落叶言苏子世哲兰楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏世兰:[Ljava/lang/String;

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
    iput-object p1, p0, Lorg/apache/commons/io/filefilter/NameFileFilter;->names:[Ljava/lang/String;

    .line 18
    .line 19
    invoke-direct {p0, p2}, Lorg/apache/commons/io/filefilter/NameFileFilter;->toIOCase(Lorg/apache/commons/io/IOCase;)Lorg/apache/commons/io/IOCase;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, p0, Lorg/apache/commons/io/filefilter/NameFileFilter;->ioCase:Lorg/apache/commons/io/IOCase;

    .line 24
    .line 25
    return-void
.end method

.method public varargs constructor <init>([Ljava/lang/String;)V
    .locals 1

    .line 28
    sget-object v0, Lorg/apache/commons/io/IOCase;->SENSITIVE:Lorg/apache/commons/io/IOCase;

    invoke-direct {p0, p1, v0}, Lorg/apache/commons/io/filefilter/NameFileFilter;-><init>([Ljava/lang/String;Lorg/apache/commons/io/IOCase;)V

    return-void
.end method

.method public constructor <init>([Ljava/lang/String;Lorg/apache/commons/io/IOCase;)V
    .locals 1

    .line 33
    invoke-direct {p0}, L飘花落叶言苏子世哲兰楪/飘花落叶言子楪世苏哲兰;-><init>()V

    .line 34
    const-string v0, "names"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 35
    invoke-virtual {p1}, [Ljava/lang/String;->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    iput-object p1, p0, Lorg/apache/commons/io/filefilter/NameFileFilter;->names:[Ljava/lang/String;

    .line 36
    invoke-direct {p0, p2}, Lorg/apache/commons/io/filefilter/NameFileFilter;->toIOCase(Lorg/apache/commons/io/IOCase;)Lorg/apache/commons/io/IOCase;

    move-result-object p1

    iput-object p1, p0, Lorg/apache/commons/io/filefilter/NameFileFilter;->ioCase:Lorg/apache/commons/io/IOCase;

    return-void
.end method

.method private acceptBaseName(Ljava/lang/String;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/apache/commons/io/filefilter/NameFileFilter;->names:[Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/stream/Stream;->of([Ljava/lang/Object;)Ljava/util/stream/Stream;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, L飘花落叶言苏子世哲兰楪/飘花落叶言子楪世兰哲苏;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {v1, p0, p1, v2}, L飘花落叶言苏子世哲兰楪/飘花落叶言子楪世兰哲苏;-><init>(L飘花落叶言苏子世哲兰楪/飘花落叶言子楪世苏哲兰;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->anyMatch(Ljava/util/function/Predicate;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
.end method

.method private synthetic lambda$acceptBaseName$0(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/apache/commons/io/filefilter/NameFileFilter;->ioCase:Lorg/apache/commons/io/IOCase;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lorg/apache/commons/io/IOCase;->checkEquals(Ljava/lang/String;Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method private toIOCase(Lorg/apache/commons/io/IOCase;)Lorg/apache/commons/io/IOCase;
    .locals 0

    .line 1
    sget-object p0, Lorg/apache/commons/io/IOCase;->SENSITIVE:Lorg/apache/commons/io/IOCase;

    .line 2
    .line 3
    invoke-static {p1, p0}, Lorg/apache/commons/io/IOCase;->value(Lorg/apache/commons/io/IOCase;Lorg/apache/commons/io/IOCase;)Lorg/apache/commons/io/IOCase;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static synthetic 飘花落叶言子楪世苏哲兰(Lorg/apache/commons/io/filefilter/NameFileFilter;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lorg/apache/commons/io/filefilter/NameFileFilter;->lambda$acceptBaseName$0(Ljava/lang/String;Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method


# virtual methods
.method public accept(Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;
    .locals 0

    .line 18
    invoke-static {p1}, L飘花落叶言苏子世楪兰哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰(Ljava/nio/file/Path;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/apache/commons/io/filefilter/NameFileFilter;->acceptBaseName(Ljava/lang/String;)Z

    move-result p1

    invoke-virtual {p0, p1}, L飘花落叶言苏子世哲兰楪/飘花落叶言子楪世苏哲兰;->toFileVisitResult(Z)Ljava/nio/file/FileVisitResult;

    move-result-object p0

    return-object p0
.end method

.method public accept(Ljava/io/File;)Z
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-direct {p0, p1}, Lorg/apache/commons/io/filefilter/NameFileFilter;->acceptBaseName(Ljava/lang/String;)Z

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
    return p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0
.end method

.method public accept(Ljava/io/File;Ljava/lang/String;)Z
    .locals 0

    .line 17
    invoke-direct {p0, p2}, Lorg/apache/commons/io/filefilter/NameFileFilter;->acceptBaseName(Ljava/lang/String;)Z

    move-result p0

    return p0
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
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, L飘花落叶言苏子世哲兰楪/飘花落叶言子楪世苏哲兰;->toString()Ljava/lang/String;

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
    iget-object v1, p0, Lorg/apache/commons/io/filefilter/NameFileFilter;->names:[Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {p0, v1, v0}, L飘花落叶言苏子世哲兰楪/飘花落叶言子楪世苏哲兰;->append([Ljava/lang/Object;Ljava/lang/StringBuilder;)V

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
