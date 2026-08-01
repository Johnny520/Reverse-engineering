.class public Lorg/apache/commons/io/comparator/CompositeFileComparator;
.super Lorg/apache/commons/io/comparator/飘花落叶言子楪世苏哲兰;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final EMPTY_COMPARATOR_ARRAY:[Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/util/Comparator<",
            "*>;"
        }
    .end annotation
.end field

.field private static final serialVersionUID:J = -0x1eddd71c3dd3daa4L


# instance fields
.field private final delegates:[Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/util/Comparator<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/util/Comparator;

    .line 3
    .line 4
    sput-object v0, Lorg/apache/commons/io/comparator/CompositeFileComparator;->EMPTY_COMPARATOR_ARRAY:[Ljava/util/Comparator;

    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>(Ljava/lang/Iterable;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "Ljava/util/Comparator<",
            "Ljava/io/File;",
            ">;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    invoke-direct {p0}, Lorg/apache/commons/io/comparator/CompositeFileComparator;->emptyArray()[Ljava/util/Comparator;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-interface {p1}, Ljava/lang/Iterable;->spliterator()Ljava/util/Spliterator;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-static {p1, v0}, Ljava/util/stream/StreamSupport;->stream(Ljava/util/Spliterator;Z)Ljava/util/stream/Stream;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    new-instance v0, Lbsh/classpath/飘花落叶言子楪世兰哲苏;

    .line 21
    .line 22
    const/4 v1, 0x3

    .line 23
    invoke-direct {v0, v1}, Lbsh/classpath/飘花落叶言子楪世兰哲苏;-><init>(I)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p1, v0}, Ljava/util/stream/Stream;->toArray(Ljava/util/function/IntFunction;)[Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, [Ljava/util/Comparator;

    .line 31
    .line 32
    :goto_0
    iput-object p1, p0, Lorg/apache/commons/io/comparator/CompositeFileComparator;->delegates:[Ljava/util/Comparator;

    .line 33
    .line 34
    return-void
.end method

.method public varargs constructor <init>([Ljava/util/Comparator;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/util/Comparator<",
            "Ljava/io/File;",
            ">;)V"
        }
    .end annotation

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p1, :cond_0

    .line 36
    invoke-direct {p0}, Lorg/apache/commons/io/comparator/CompositeFileComparator;->emptyArray()[Ljava/util/Comparator;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, [Ljava/util/Comparator;->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/util/Comparator;

    :goto_0
    iput-object p1, p0, Lorg/apache/commons/io/comparator/CompositeFileComparator;->delegates:[Ljava/util/Comparator;

    return-void
.end method

.method private emptyArray()[Ljava/util/Comparator;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Ljava/util/Comparator<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object p0, Lorg/apache/commons/io/comparator/CompositeFileComparator;->EMPTY_COMPARATOR_ARRAY:[Ljava/util/Comparator;

    .line 2
    .line 3
    return-object p0
.end method

.method private static synthetic lambda$compare$1(Ljava/io/File;Ljava/io/File;Ljava/util/Comparator;)Ljava/lang/Integer;
    .locals 0

    .line 1
    invoke-interface {p2, p0, p1}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method private static synthetic lambda$compare$2(Ljava/lang/Integer;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method private static synthetic lambda$new$0(I)[Ljava/util/Comparator;
    .locals 0

    .line 1
    new-array p0, p0, [Ljava/util/Comparator;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic 飘花落叶言子楪世哲苏兰(Ljava/io/File;Ljava/io/File;Ljava/util/Comparator;)Ljava/lang/Integer;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lorg/apache/commons/io/comparator/CompositeFileComparator;->lambda$compare$1(Ljava/io/File;Ljava/io/File;Ljava/util/Comparator;)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic 飘花落叶言子楪世苏兰哲(I)[Ljava/util/Comparator;
    .locals 0

    .line 1
    invoke-static {p0}, Lorg/apache/commons/io/comparator/CompositeFileComparator;->lambda$new$0(I)[Ljava/util/Comparator;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic 飘花落叶言子楪世苏哲兰(Ljava/lang/Integer;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lorg/apache/commons/io/comparator/CompositeFileComparator;->lambda$compare$2(Ljava/lang/Integer;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method


# virtual methods
.method public compare(Ljava/io/File;Ljava/io/File;)I
    .locals 2

    .line 1
    iget-object p0, p0, Lorg/apache/commons/io/comparator/CompositeFileComparator;->delegates:[Ljava/util/Comparator;

    .line 2
    .line 3
    invoke-static {p0}, Ljava/util/stream/Stream;->of([Ljava/lang/Object;)Ljava/util/stream/Stream;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    new-instance v0, Lorg/apache/commons/io/comparator/飘花落叶言子楪世苏兰哲;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {v0, p1, p2, v1}, Lorg/apache/commons/io/comparator/飘花落叶言子楪世苏兰哲;-><init>(Ljava/io/Serializable;Ljava/io/Serializable;I)V

    .line 11
    .line 12
    .line 13
    invoke-interface {p0, v0}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    new-instance p1, Lbsh/classpath/飘花落叶言子楪世兰苏哲;

    .line 18
    .line 19
    const/4 p2, 0x2

    .line 20
    invoke-direct {p1, p2}, Lbsh/classpath/飘花落叶言子楪世兰苏哲;-><init>(I)V

    .line 21
    .line 22
    .line 23
    invoke-interface {p0, p1}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-interface {p0}, Ljava/util/stream/Stream;->findFirst()Ljava/util/Optional;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p0, p1}, Ljava/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    check-cast p0, Ljava/lang/Integer;

    .line 40
    .line 41
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    return p0
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 46
    check-cast p1, Ljava/io/File;

    check-cast p2, Ljava/io/File;

    invoke-virtual {p0, p1, p2}, Lorg/apache/commons/io/comparator/CompositeFileComparator;->compare(Ljava/io/File;Ljava/io/File;)I

    move-result p0

    return p0
.end method

.method public bridge synthetic sort(Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lorg/apache/commons/io/comparator/飘花落叶言子楪世苏哲兰;->sort(Ljava/util/List;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public bridge synthetic sort([Ljava/io/File;)[Ljava/io/File;
    .locals 0

    .line 6
    invoke-super {p0, p1}, Lorg/apache/commons/io/comparator/飘花落叶言子楪世苏哲兰;->sort([Ljava/io/File;)[Ljava/io/File;

    move-result-object p0

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-super {p0}, Lorg/apache/commons/io/comparator/飘花落叶言子楪世苏哲兰;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lorg/apache/commons/io/comparator/CompositeFileComparator;->delegates:[Ljava/util/Comparator;

    .line 11
    .line 12
    invoke-static {p0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method
