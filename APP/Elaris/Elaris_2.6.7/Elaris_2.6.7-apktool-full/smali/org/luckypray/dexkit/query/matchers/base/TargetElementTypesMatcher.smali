.class public final Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;
.super Lorg/luckypray/dexkit/query/base/BaseMatcher;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher$Companion;


# instance fields
.field private matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

.field private types:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "+",
            "Lorg/luckypray/dexkit/query/enums/TargetElementType;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher$Companion;-><init>(Lr2;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher$Companion;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 17
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/base/BaseMatcher;-><init>()V

    .line 18
    sget-object v0, Lorg/luckypray/dexkit/query/enums/MatchType;->Contains:Lorg/luckypray/dexkit/query/enums/MatchType;

    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

    return-void
.end method

.method public constructor <init>(Ljava/util/Collection;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Lorg/luckypray/dexkit/query/enums/TargetElementType;",
            ">;)V"
        }
    .end annotation

    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-direct {p0, p1, v0, v1, v0}, Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;-><init>(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/MatchType;ILr2;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/MatchType;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Lorg/luckypray/dexkit/query/enums/TargetElementType;",
            ">;",
            "Lorg/luckypray/dexkit/query/enums/MatchType;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/base/BaseMatcher;-><init>()V

    .line 8
    .line 9
    .line 10
    sget-object v0, Lorg/luckypray/dexkit/query/enums/MatchType;->Contains:Lorg/luckypray/dexkit/query/enums/MatchType;

    .line 11
    .line 12
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;->types:Ljava/util/Collection;

    .line 13
    .line 14
    iput-object p2, p0, Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

    .line 15
    .line 16
    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/MatchType;ILr2;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 19
    sget-object p2, Lorg/luckypray/dexkit/query/enums/MatchType;->Contains:Lorg/luckypray/dexkit/query/enums/MatchType;

    .line 20
    :cond_0
    invoke-direct {p0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;-><init>(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/MatchType;)V

    return-void
.end method

.method public static final create(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/MatchType;)Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Lorg/luckypray/dexkit/query/enums/TargetElementType;",
            ">;",
            "Lorg/luckypray/dexkit/query/enums/MatchType;",
            ")",
            "Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;"
        }
    .end annotation

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1}, Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher$Companion;->create(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/MatchType;)Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method


# virtual methods
.method public final getMatchType()Lorg/luckypray/dexkit/query/enums/MatchType;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getTypes()Ljava/util/Collection;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lorg/luckypray/dexkit/query/enums/TargetElementType;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;->types:Ljava/util/Collection;

    .line 2
    .line 3
    return-object p0
.end method

.method public innerBuild(Lc5;)I
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lorg/luckypray/dexkit/schema/-TargetElementTypesMatcher;->Companion:Lorg/luckypray/dexkit/schema/-TargetElementTypesMatcher$Companion;

    .line 5
    .line 6
    iget-object v1, p0, Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;->types:Ljava/util/Collection;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    if-eqz v1, :cond_2

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
    check-cast v4, Lorg/luckypray/dexkit/query/enums/TargetElementType;

    .line 35
    .line 36
    invoke-virtual {v4}, Lorg/luckypray/dexkit/query/enums/TargetElementType;->getValue()B

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    invoke-static {v4}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

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
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    new-array v1, v1, [B

    .line 53
    .line 54
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    if-eqz v4, :cond_1

    .line 63
    .line 64
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    check-cast v4, Ljava/lang/Number;

    .line 69
    .line 70
    invoke-virtual {v4}, Ljava/lang/Number;->byteValue()B

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    add-int/lit8 v5, v2, 0x1

    .line 75
    .line 76
    aput-byte v4, v1, v2

    .line 77
    .line 78
    move v2, v5

    .line 79
    goto :goto_1

    .line 80
    :cond_1
    sget-object v2, Lorg/luckypray/dexkit/schema/-TargetElementTypesMatcher;->Companion:Lorg/luckypray/dexkit/schema/-TargetElementTypesMatcher$Companion;

    .line 81
    .line 82
    invoke-virtual {v2, p1, v1}, Lorg/luckypray/dexkit/schema/-TargetElementTypesMatcher$Companion;->createTypesVector(Lc5;[B)I

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    :cond_2
    iget-object p0, p0, Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

    .line 87
    .line 88
    invoke-virtual {p0}, Lorg/luckypray/dexkit/query/enums/MatchType;->getValue()B

    .line 89
    .line 90
    .line 91
    move-result p0

    .line 92
    invoke-virtual {v0, p1, v2, p0}, Lorg/luckypray/dexkit/schema/-TargetElementTypesMatcher$Companion;->createTargetElementTypesMatcher(Lc5;IB)I

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    invoke-virtual {p1, p0}, Lc5;->n(I)V

    .line 97
    .line 98
    .line 99
    return p0
.end method

.method public final matchType(Lorg/luckypray/dexkit/query/enums/MatchType;)Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

    .line 5
    .line 6
    return-object p0
.end method

.method public final synthetic setMatchType(Lorg/luckypray/dexkit/query/enums/MatchType;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;->matchType:Lorg/luckypray/dexkit/query/enums/MatchType;

    .line 5
    .line 6
    return-void
.end method

.method public final synthetic setTypes(Ljava/util/Collection;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;->types:Ljava/util/Collection;

    .line 2
    .line 3
    return-void
.end method

.method public final types(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Lorg/luckypray/dexkit/query/enums/TargetElementType;",
            ">;)",
            "Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;->types:Ljava/util/Collection;

    return-object p0
.end method

.method public final varargs types([Lorg/luckypray/dexkit/query/enums/TargetElementType;)Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, La1;->k2([Ljava/lang/Object;)Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/TargetElementTypesMatcher;->types:Ljava/util/Collection;

    .line 9
    .line 10
    return-object p0
.end method
