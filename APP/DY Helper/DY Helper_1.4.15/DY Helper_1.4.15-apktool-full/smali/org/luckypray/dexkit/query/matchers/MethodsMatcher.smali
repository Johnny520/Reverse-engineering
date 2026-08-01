.class public final Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;
.super Lorg/luckypray/dexkit/query/base/BaseMatcher;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/query/matchers/MethodsMatcher$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher$Companion;


# instance fields
.field private matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

.field private methodsMatcher:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;",
            ">;"
        }
    .end annotation
.end field

.field private rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher$Companion;-><init>(Lzq;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher$Companion;

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
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

    .line 7
    .line 8
    return-void
.end method

.method public static synthetic count$default(Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;IIILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;
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
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;->count(II)Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public static final create()Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;
    .locals 1

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/MethodsMatcher$Companion;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher$Companion;->create()Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method


# virtual methods
.method public final synthetic add(La80;)Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;-><init>()V

    invoke-interface {p1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;->add(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    return-object p0
.end method

.method public final add(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;->methodsMatcher:Ljava/util/List;

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
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;->methodsMatcher:Ljava/util/List;

    .line 14
    .line 15
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    return-object p0
.end method

.method public final count(I)Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;
    .locals 1

    .line 13
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    invoke-direct {v0, p1}, Lorg/luckypray/dexkit/query/matchers/base/IntRange;-><init>(I)V

    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;->rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    return-object p0
.end method

.method public final count(II)Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;
    .locals 1

    .line 14
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    invoke-direct {v0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/base/IntRange;-><init>(II)V

    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;->rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    return-object p0
.end method

.method public final count(Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;->rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    return-object p0
.end method

.method public final count(Lxm0;)Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Lorg/luckypray/dexkit/query/matchers/base/IntRange;-><init>(Lxm0;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;->rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    .line 10
    .line 11
    return-object p0
.end method

.method public final countMax(I)Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;
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
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;->rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    .line 8
    .line 9
    return-object p0
.end method

.method public final countMin(I)Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;
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
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;->rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    .line 10
    .line 11
    return-object p0
.end method

.method public final synthetic getCount()I
    .locals 1
    .annotation runtime Lbs;
    .end annotation

    .line 1
    new-instance p0, Lfq;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, v0}, Lfq;-><init>(I)V

    .line 5
    .line 6
    .line 7
    throw p0
.end method

.method public final getMatchType()Lorg/luckypray/dexkit/query/enums/MatchType;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getMethodsMatcher()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;->methodsMatcher:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getRangeMatcher()Lorg/luckypray/dexkit/query/matchers/base/IntRange;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;->rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    .line 2
    .line 3
    return-object p0
.end method

.method public innerBuild(Lb40;)I
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lorg/luckypray/dexkit/schema/-MethodsMatcher;->Companion:Lorg/luckypray/dexkit/schema/-MethodsMatcher$Companion;

    .line 5
    .line 6
    iget-object v1, p0, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;->methodsMatcher:Ljava/util/List;

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
    const/16 v4, 0xa

    .line 14
    .line 15
    invoke-static {v1, v4}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 20
    .line 21
    .line 22
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    if-eqz v4, :cond_0

    .line 31
    .line 32
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    check-cast v4, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 37
    .line 38
    invoke-virtual {v4, p1}, Lorg/luckypray/dexkit/query/base/BaseMatcher;->build$dexkit_android_release(Lb40;)I

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    invoke-static {v3}, Lxh;->ｄ(Ljava/util/List;)[I

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {p1, v1}, Lb40;->λ([I)I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    goto :goto_1

    .line 59
    :cond_1
    move v1, v2

    .line 60
    :goto_1
    iget-object v3, p0, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

    .line 61
    .line 62
    invoke-virtual {v3}, Lorg/luckypray/dexkit/query/enums/MatchType;->getValue()B

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    iget-object p0, p0, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;->rangeMatcher:Lorg/luckypray/dexkit/query/matchers/base/IntRange;

    .line 67
    .line 68
    if-eqz p0, :cond_2

    .line 69
    .line 70
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/base/BaseMatcher;->build$dexkit_android_release(Lb40;)I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    :cond_2
    invoke-virtual {v0, p1, v1, v3, v2}, Lorg/luckypray/dexkit/schema/-MethodsMatcher$Companion;->createMethodsMatcher(Lb40;IBI)I

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    invoke-virtual {p1, p0}, Lb40;->ξ(I)V

    .line 79
    .line 80
    .line 81
    return p0
.end method

.method public final matchType(Lorg/luckypray/dexkit/query/enums/MatchType;)Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

    .line 5
    .line 6
    return-object p0
.end method

.method public final methods(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;"
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
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;->methodsMatcher:Ljava/util/List;

    .line 10
    .line 11
    return-object p0
.end method

.method public final synthetic setCount(I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;->count(I)Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

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
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

    .line 5
    .line 6
    return-void
.end method
