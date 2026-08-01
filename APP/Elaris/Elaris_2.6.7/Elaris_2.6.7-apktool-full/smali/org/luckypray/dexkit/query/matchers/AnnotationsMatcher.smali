.class public final Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;
.super Lorg/luckypray/dexkit/query/base/BaseMatcher;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher$Companion;


# instance fields
.field private annotationsMatcher:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;",
            ">;"
        }
    .end annotation
.end field

.field private matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

.field private rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher$Companion;-><init>(Lr2;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher$Companion;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/base/BaseMatcher;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lorg/luckypray/dexkit/query/enums/MatchType;->Contains:Lorg/luckypray/dexkit/query/enums/MatchType;

    .line 5
    .line 6
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

    .line 7
    .line 8
    return-void
.end method

.method public static synthetic count$default(Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;IIILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;
    .locals 0

    .line 1
    and-int/lit8 p4, p3, 0x1

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    :cond_0
    and-int/lit8 p3, p3, 0x2

    .line 7
    .line 8
    if-eqz p3, :cond_1

    .line 9
    .line 10
    const p2, 0x7fffffff

    .line 11
    .line 12
    .line 13
    :cond_1
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;->count(II)Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public static final create()Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;
    .locals 1

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher$Companion;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher$Companion;->create()Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method


# virtual methods
.method public final add(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;->annotationsMatcher:Ljava/util/List;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;->annotationsMatcher:Ljava/util/List;

    .line 14
    .line 15
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    return-object p0
.end method

.method public final synthetic add(Lu5;)Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;-><init>()V

    invoke-interface {p1, v0}, Lu5;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;->add(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;)Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    return-object p0
.end method

.method public final annotations(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;->annotationsMatcher:Ljava/util/List;

    .line 10
    .line 11
    return-object p0
.end method

.method public final count(I)Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;
    .locals 1

    .line 13
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    invoke-direct {v0, p1}, Lorg/luckypray/dexkit/query/matchers/base/IntRange;-><init>(I)V

    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;->rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    return-object p0
.end method

.method public final count(II)Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;
    .locals 1

    .line 14
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    invoke-direct {v0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/base/IntRange;-><init>(II)V

    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;->rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    return-object p0
.end method

.method public final count(Lb8;)Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Lorg/luckypray/dexkit/query/matchers/base/IntRange;-><init>(Lb8;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;->rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    .line 10
    .line 11
    return-object p0
.end method

.method public final count(Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;->rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    return-object p0
.end method

.method public final countMax(I)Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;
    .locals 2

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1, p1}, Lorg/luckypray/dexkit/query/matchers/base/IntRange;-><init>(II)V

    .line 5
    .line 6
    .line 7
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;->rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    .line 8
    .line 9
    return-object p0
.end method

.method public final countMin(I)Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;
    .locals 2

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    .line 2
    .line 3
    const v1, 0x7fffffff

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, p1, v1}, Lorg/luckypray/dexkit/query/matchers/base/IntRange;-><init>(II)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;->rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    .line 10
    .line 11
    return-object p0
.end method

.method public final getAnnotationsMatcher()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;->annotationsMatcher:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final synthetic getCount()I
    .locals 0

    .line 1
    new-instance p0, Lc9;

    .line 2
    .line 3
    invoke-direct {p0}, Lc9;-><init>()V

    .line 4
    .line 5
    .line 6
    throw p0
.end method

.method public final getMatchType()Lorg/luckypray/dexkit/query/enums/MatchType;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getRangeMatcher()Lorg/luckypray/dexkit/query/matchers/base/IntRange;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;->rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    .line 2
    .line 3
    return-object p0
.end method

.method public innerBuild(Lc5;)I
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lorg/luckypray/dexkit/schema/-AnnotationsMatcher;->Companion:Lorg/luckypray/dexkit/schema/-AnnotationsMatcher$Companion;

    .line 5
    .line 6
    iget-object v1, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;->annotationsMatcher:Ljava/util/List;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    new-instance v3, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-static {v1}, Lj2;->i2(Ljava/lang/Iterable;)I

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 18
    .line 19
    .line 20
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    if-eqz v4, :cond_0

    .line 29
    .line 30
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    check-cast v4, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    .line 35
    .line 36
    invoke-virtual {v4, p1}, Lorg/luckypray/dexkit/query/base/BaseMatcher;->build$dexkit_android_release(Lc5;)I

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    invoke-static {v3}, Lh2;->l2(Ljava/util/ArrayList;)[I

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {p1, v1}, Lc5;->k([I)I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    goto :goto_1

    .line 57
    :cond_1
    move v1, v2

    .line 58
    :goto_1
    iget-object v3, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

    .line 59
    .line 60
    invoke-virtual {v3}, Lorg/luckypray/dexkit/query/enums/MatchType;->getValue()B

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    iget-object p0, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;->rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    .line 65
    .line 66
    if-eqz p0, :cond_2

    .line 67
    .line 68
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/base/BaseMatcher;->build$dexkit_android_release(Lc5;)I

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    :cond_2
    invoke-virtual {v0, p1, v1, v3, v2}, Lorg/luckypray/dexkit/schema/-AnnotationsMatcher$Companion;->createAnnotationsMatcher(Lc5;IBI)I

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    invoke-virtual {p1, p0}, Lc5;->n(I)V

    .line 77
    .line 78
    .line 79
    return p0
.end method

.method public final matchType(Lorg/luckypray/dexkit/query/enums/MatchType;)Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

    .line 5
    .line 6
    return-object p0
.end method

.method public final synthetic setCount(I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;->count(I)Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final synthetic setMatchType(Lorg/luckypray/dexkit/query/enums/MatchType;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

    .line 5
    .line 6
    return-void
.end method
