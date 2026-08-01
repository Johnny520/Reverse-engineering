.class public Lorg/apache/commons/io/filefilter/WildcardFileFilter;
.super L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世苏哲兰;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = -0x67102e36ee57a9d9L


# instance fields
.field private final ioCase:Lorg/apache/commons/io/IOCase;

.field private final wildcards:[Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 32
    sget-object v0, Lorg/apache/commons/io/IOCase;->SENSITIVE:Lorg/apache/commons/io/IOCase;

    invoke-static {p1}, Lorg/apache/commons/io/filefilter/WildcardFileFilter;->requireWildcards(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lorg/apache/commons/io/filefilter/WildcardFileFilter;-><init>(Lorg/apache/commons/io/IOCase;[Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lorg/apache/commons/io/IOCase;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 34
    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p2, p1}, Lorg/apache/commons/io/filefilter/WildcardFileFilter;-><init>(Lorg/apache/commons/io/IOCase;[Ljava/lang/String;)V

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

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 30
    sget-object v0, Lorg/apache/commons/io/IOCase;->SENSITIVE:Lorg/apache/commons/io/IOCase;

    invoke-direct {p0, p1, v0}, Lorg/apache/commons/io/filefilter/WildcardFileFilter;-><init>(Ljava/util/List;Lorg/apache/commons/io/IOCase;)V

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

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 31
    invoke-static {p1}, Lorg/apache/commons/io/filefilter/WildcardFileFilter;->requireWildcards(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    sget-object v0, L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏世兰:[Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    invoke-direct {p0, p2, p1}, Lorg/apache/commons/io/filefilter/WildcardFileFilter;-><init>(Lorg/apache/commons/io/IOCase;[Ljava/lang/String;)V

    return-void
.end method

.method private varargs constructor <init>(Lorg/apache/commons/io/IOCase;[Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世苏哲兰;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p2}, Lorg/apache/commons/io/filefilter/WildcardFileFilter;->requireWildcards(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    check-cast p2, [Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {p2}, [Ljava/lang/String;->clone()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    check-cast p2, [Ljava/lang/String;

    .line 15
    .line 16
    iput-object p2, p0, Lorg/apache/commons/io/filefilter/WildcardFileFilter;->wildcards:[Ljava/lang/String;

    .line 17
    .line 18
    sget-object p2, Lorg/apache/commons/io/IOCase;->SENSITIVE:Lorg/apache/commons/io/IOCase;

    .line 19
    .line 20
    invoke-static {p1, p2}, Lorg/apache/commons/io/IOCase;->value(Lorg/apache/commons/io/IOCase;Lorg/apache/commons/io/IOCase;)Lorg/apache/commons/io/IOCase;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, Lorg/apache/commons/io/filefilter/WildcardFileFilter;->ioCase:Lorg/apache/commons/io/IOCase;

    .line 25
    .line 26
    return-void
.end method

.method private constructor <init>(L飘花落叶言苏子世哲楪兰/飘花落叶言子楪苏哲世兰;)V
    .locals 1

    .line 27
    iget-object p1, p1, L飘花落叶言苏子世哲楪兰/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪兰世苏哲:Lorg/apache/commons/io/IOCase;

    const/4 v0, 0x0

    .line 28
    invoke-direct {p0, p1, v0}, Lorg/apache/commons/io/filefilter/WildcardFileFilter;-><init>(Lorg/apache/commons/io/IOCase;[Ljava/lang/String;)V

    return-void
.end method

.method public synthetic constructor <init>(L飘花落叶言苏子世哲楪兰/飘花落叶言子楪苏哲世兰;L飘花落叶言苏子世哲楪兰/飘花落叶言子楪苏世兰哲;)V
    .locals 0

    .line 29
    invoke-direct {p0, p1}, Lorg/apache/commons/io/filefilter/WildcardFileFilter;-><init>(L飘花落叶言苏子世哲楪兰/飘花落叶言子楪苏哲世兰;)V

    return-void
.end method

.method public varargs constructor <init>([Ljava/lang/String;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 33
    sget-object v0, Lorg/apache/commons/io/IOCase;->SENSITIVE:Lorg/apache/commons/io/IOCase;

    invoke-direct {p0, v0, p1}, Lorg/apache/commons/io/filefilter/WildcardFileFilter;-><init>(Lorg/apache/commons/io/IOCase;[Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>([Ljava/lang/String;Lorg/apache/commons/io/IOCase;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 35
    invoke-direct {p0, p2, p1}, Lorg/apache/commons/io/filefilter/WildcardFileFilter;-><init>(Lorg/apache/commons/io/IOCase;[Ljava/lang/String;)V

    return-void
.end method

.method private accept(Ljava/lang/String;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/apache/commons/io/filefilter/WildcardFileFilter;->wildcards:[Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/stream/Stream;->of([Ljava/lang/Object;)Ljava/util/stream/Stream;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世兰哲苏;

    .line 8
    .line 9
    const/4 v2, 0x3

    .line 10
    invoke-direct {v1, p0, p1, v2}, L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世兰哲苏;-><init>(L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世苏哲兰;Ljava/lang/String;I)V

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

.method public static synthetic access$100(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0}, Lorg/apache/commons/io/filefilter/WildcardFileFilter;->requireWildcards(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static builder()L飘花落叶言苏子世哲楪兰/飘花落叶言子楪苏哲世兰;
    .locals 2

    .line 1
    new-instance v0, L飘花落叶言苏子世哲楪兰/飘花落叶言子楪苏哲世兰;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lorg/apache/commons/io/IOCase;->SENSITIVE:Lorg/apache/commons/io/IOCase;

    .line 7
    .line 8
    iput-object v1, v0, L飘花落叶言苏子世哲楪兰/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪兰世苏哲:Lorg/apache/commons/io/IOCase;

    .line 9
    .line 10
    return-object v0
.end method

.method private synthetic lambda$accept$0(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/apache/commons/io/filefilter/WildcardFileFilter;->ioCase:Lorg/apache/commons/io/IOCase;

    .line 2
    .line 3
    invoke-static {p1, p2, p0}, L飘花落叶言苏子楪兰世哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Lorg/apache/commons/io/IOCase;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method private static requireWildcards(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)TT;"
        }
    .end annotation

    .line 1
    const-string v0, "wildcards"

    .line 2
    .line 3
    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public static synthetic 飘花落叶言子楪世苏哲兰(Lorg/apache/commons/io/filefilter/WildcardFileFilter;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lorg/apache/commons/io/filefilter/WildcardFileFilter;->lambda$accept$0(Ljava/lang/String;Ljava/lang/String;)Z

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

    .line 19
    invoke-static {p1}, L飘花落叶言苏子世楪哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰(Ljava/nio/file/Path;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/apache/commons/io/filefilter/WildcardFileFilter;->accept(Ljava/lang/String;)Z

    move-result p1

    invoke-virtual {p0, p1}, L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世苏哲兰;->toFileVisitResult(Z)Ljava/nio/file/FileVisitResult;

    move-result-object p0

    return-object p0
.end method

.method public accept(Ljava/io/File;)Z
    .locals 0

    .line 20
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/apache/commons/io/filefilter/WildcardFileFilter;->accept(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public accept(Ljava/io/File;Ljava/lang/String;)Z
    .locals 0

    .line 18
    invoke-direct {p0, p2}, Lorg/apache/commons/io/filefilter/WildcardFileFilter;->accept(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public and(L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世兰苏哲;)L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世兰苏哲;
    .locals 1

    .line 1
    new-instance v0, Lorg/apache/commons/io/filefilter/AndFileFilter;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lorg/apache/commons/io/filefilter/AndFileFilter;-><init>(L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世兰苏哲;L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世兰苏哲;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public bridge synthetic matches(Ljava/nio/file/Path;)Z
    .locals 0

    .line 1
    invoke-super {p0, p1}, L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世兰苏哲;->matches(Ljava/nio/file/Path;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public negate()L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世兰苏哲;
    .locals 1

    .line 1
    new-instance v0, Lorg/apache/commons/io/filefilter/NotFileFilter;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lorg/apache/commons/io/filefilter/NotFileFilter;-><init>(L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世兰苏哲;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public or(L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世兰苏哲;)L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世兰苏哲;
    .locals 1

    .line 1
    new-instance v0, Lorg/apache/commons/io/filefilter/OrFileFilter;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lorg/apache/commons/io/filefilter/OrFileFilter;-><init>(L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世兰苏哲;L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世兰苏哲;)V

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
    invoke-super {p0}, L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世苏哲兰;->toString()Ljava/lang/String;

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
    iget-object v1, p0, Lorg/apache/commons/io/filefilter/WildcardFileFilter;->wildcards:[Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {p0, v1, v0}, L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世苏哲兰;->append([Ljava/lang/Object;Ljava/lang/StringBuilder;)V

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
