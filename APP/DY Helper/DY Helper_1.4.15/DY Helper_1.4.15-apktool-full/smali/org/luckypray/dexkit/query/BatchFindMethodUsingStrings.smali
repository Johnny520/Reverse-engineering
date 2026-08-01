.class public final Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
.super Lorg/luckypray/dexkit/query/base/BaseFinder;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings$Companion;


# instance fields
.field private excludePackages:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private ignorePackagesCase:Z

.field private searchClasses:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Lorg/luckypray/dexkit/result/ClassData;",
            ">;"
        }
    .end annotation
.end field

.field private searchGroups:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;",
            ">;"
        }
    .end annotation
.end field

.field private searchMethods:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Lorg/luckypray/dexkit/result/MethodData;",
            ">;"
        }
    .end annotation
.end field

.field private searchPackages:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings$Companion;-><init>(Lzq;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->Companion:Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings$Companion;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/base/BaseFinder;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic addSearchGroup$default(Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;Ljava/lang/String;Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    .locals 0

    .line 1
    and-int/lit8 p6, p5, 0x4

    .line 2
    .line 3
    if-eqz p6, :cond_0

    .line 4
    .line 5
    sget-object p3, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Contains:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p5, p5, 0x8

    .line 8
    .line 9
    if-eqz p5, :cond_1

    .line 10
    .line 11
    const/4 p4, 0x0

    .line 12
    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->addSearchGroup(Ljava/lang/String;Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public static final create()Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    .locals 1

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->Companion:Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings$Companion;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings$Companion;->create()Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public static synthetic groups$default(Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;Ljava/util/Map;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    .locals 0

    .line 1
    and-int/lit8 p5, p4, 0x2

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    sget-object p2, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Contains:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p4, p4, 0x4

    .line 8
    .line 9
    if-eqz p4, :cond_1

    .line 10
    .line 11
    const/4 p3, 0x0

    .line 12
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->groups(Ljava/util/Map;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method


# virtual methods
.method public final synthetic addSearchGroup(La80;)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;-><init>()V

    invoke-interface {p1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->addSearchGroup(Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;

    return-object p0
.end method

.method public final synthetic addSearchGroup(Ljava/lang/String;La80;)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;

    new-instance v1, Lorg/luckypray/dexkit/query/StringMatcherList;

    invoke-direct {v1}, Lorg/luckypray/dexkit/query/StringMatcherList;-><init>()V

    invoke-interface {p2, v1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {v0, p1, v1}, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;-><init>(Ljava/lang/String;Ljava/util/Collection;)V

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->addSearchGroup(Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;

    return-object p0
.end method

.method public final addSearchGroup(Ljava/lang/String;Ljava/util/Collection;)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)",
            "Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;"
        }
    .end annotation

    .line 60
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v5, 0xc

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-static/range {v0 .. v6}, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->addSearchGroup$default(Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;Ljava/lang/String;Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;

    move-result-object p0

    return-object p0
.end method

.method public final addSearchGroup(Ljava/lang/String;Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;",
            "Lorg/luckypray/dexkit/query/enums/StringMatchType;",
            ")",
            "Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;"
        }
    .end annotation

    .line 57
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-static/range {v0 .. v6}, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->addSearchGroup$default(Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;Ljava/lang/String;Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;

    move-result-object p0

    return-object p0
.end method

.method public final addSearchGroup(Ljava/lang/String;Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;",
            "Lorg/luckypray/dexkit/query/enums/StringMatchType;",
            "Z)",
            "Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;"
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
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    check-cast p2, Ljava/lang/Iterable;

    .line 11
    .line 12
    new-instance v0, Ljava/util/ArrayList;

    .line 13
    .line 14
    const/16 v1, 0xa

    .line 15
    .line 16
    invoke-static {p2, v1}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 21
    .line 22
    .line 23
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Ljava/lang/String;

    .line 38
    .line 39
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    .line 40
    .line 41
    invoke-direct {v2, v1, p3, p4}, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)V

    .line 42
    .line 43
    .line 44
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    new-instance p2, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;

    .line 49
    .line 50
    invoke-direct {p2, p1, v0}, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;-><init>(Ljava/lang/String;Ljava/util/Collection;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, p2}, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->addSearchGroup(Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;

    .line 54
    .line 55
    .line 56
    return-object p0
.end method

.method public final addSearchGroup(Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    iget-object v0, p0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->searchGroups:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->searchGroups:Ljava/util/List;

    .line 59
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final excludePackages(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)",
            "Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    iput-object p1, p0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->excludePackages:Ljava/util/Collection;

    return-object p0
.end method

.method public final varargs excludePackages([Ljava/lang/String;)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lg7;->н([Ljava/lang/Object;)Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->excludePackages:Ljava/util/Collection;

    .line 9
    .line 10
    return-object p0
.end method

.method public final getExcludePackages()Ljava/util/Collection;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->excludePackages:Ljava/util/Collection;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getIgnorePackagesCase()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->ignorePackagesCase:Z

    .line 2
    .line 3
    return p0
.end method

.method public final getSearchClasses()Ljava/util/Collection;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lorg/luckypray/dexkit/result/ClassData;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->searchClasses:Ljava/util/Collection;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getSearchGroups()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->searchGroups:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getSearchMethods()Ljava/util/Collection;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lorg/luckypray/dexkit/result/MethodData;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->searchMethods:Ljava/util/Collection;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getSearchPackages()Ljava/util/Collection;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->searchPackages:Ljava/util/Collection;

    .line 2
    .line 3
    return-object p0
.end method

.method public final synthetic groups(La80;)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    new-instance v0, Lorg/luckypray/dexkit/query/StringMatchersGroupList;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/StringMatchersGroupList;-><init>()V

    invoke-interface {p1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->groups(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;

    return-object p0
.end method

.method public final groups(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;",
            ">;)",
            "Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 107
    iput-object v0, p0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->searchGroups:Ljava/util/List;

    return-object p0
.end method

.method public final groups(Ljava/util/Map;)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;>;)",
            "Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;"
        }
    .end annotation

    .line 105
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->groups$default(Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;Ljava/util/Map;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;

    move-result-object p0

    return-object p0
.end method

.method public final groups(Ljava/util/Map;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;>;",
            "Lorg/luckypray/dexkit/query/enums/StringMatchType;",
            ")",
            "Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;"
        }
    .end annotation

    .line 103
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->groups$default(Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;Ljava/util/Map;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;

    move-result-object p0

    return-object p0
.end method

.method public final groups(Ljava/util/Map;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;>;",
            "Lorg/luckypray/dexkit/query/enums/StringMatchType;",
            "Z)",
            "Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;"
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
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-interface {p1}, Ljava/util/Map;->size()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Ljava/util/Map$Entry;

    .line 35
    .line 36
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    check-cast v2, Ljava/lang/String;

    .line 41
    .line 42
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    check-cast v1, Ljava/util/Collection;

    .line 47
    .line 48
    check-cast v1, Ljava/lang/Iterable;

    .line 49
    .line 50
    new-instance v3, Ljava/util/ArrayList;

    .line 51
    .line 52
    const/16 v4, 0xa

    .line 53
    .line 54
    invoke-static {v1, v4}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 59
    .line 60
    .line 61
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    if-eqz v4, :cond_0

    .line 70
    .line 71
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    check-cast v4, Ljava/lang/String;

    .line 76
    .line 77
    new-instance v5, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    .line 78
    .line 79
    invoke-direct {v5, v4, p2, p3}, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)V

    .line 80
    .line 81
    .line 82
    invoke-interface {v3, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_0
    new-instance v1, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;

    .line 87
    .line 88
    invoke-direct {v1, v2, v3}, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;-><init>(Ljava/lang/String;Ljava/util/Collection;)V

    .line 89
    .line 90
    .line 91
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_1
    new-instance p1, Ljava/util/ArrayList;

    .line 96
    .line 97
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 98
    .line 99
    .line 100
    iput-object p1, p0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->searchGroups:Ljava/util/List;

    .line 101
    .line 102
    return-object p0
.end method

.method public final ignorePackagesCase(Z)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->ignorePackagesCase:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public innerBuild(Lb40;)I
    .locals 11

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->searchGroups:Ljava/util/List;

    .line 5
    .line 6
    if-eqz v0, :cond_b

    .line 7
    .line 8
    new-instance v1, Ljava/util/ArrayList;

    .line 9
    .line 10
    const/16 v2, 0xa

    .line 11
    .line 12
    invoke-static {v0, v2}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 17
    .line 18
    .line 19
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-eqz v3, :cond_0

    .line 28
    .line 29
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    check-cast v3, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;

    .line 34
    .line 35
    invoke-virtual {v3}, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;->getGroupName()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    invoke-static {v1}, Lxh;->ｊ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-interface {v0}, Ljava/util/Set;->size()I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    iget-object v1, p0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->searchGroups:Ljava/util/List;

    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-lt v0, v1, :cond_a

    .line 61
    .line 62
    sget-object v3, Lorg/luckypray/dexkit/schema/-BatchFindMethodUsingStrings;->Companion:Lorg/luckypray/dexkit/schema/-BatchFindMethodUsingStrings$Companion;

    .line 63
    .line 64
    iget-object v0, p0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->searchPackages:Ljava/util/Collection;

    .line 65
    .line 66
    const/4 v1, 0x0

    .line 67
    if-eqz v0, :cond_2

    .line 68
    .line 69
    check-cast v0, Ljava/lang/Iterable;

    .line 70
    .line 71
    new-instance v4, Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-static {v0, v2}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 74
    .line 75
    .line 76
    move-result v5

    .line 77
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 78
    .line 79
    .line 80
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    if-eqz v5, :cond_1

    .line 89
    .line 90
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    check-cast v5, Ljava/lang/String;

    .line 95
    .line 96
    invoke-virtual {p1, v5}, Lb40;->κ(Ljava/lang/CharSequence;)I

    .line 97
    .line 98
    .line 99
    move-result v5

    .line 100
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_1
    invoke-static {v4}, Lxh;->ｄ(Ljava/util/List;)[I

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-virtual {p1, v0}, Lb40;->λ([I)I

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    move v5, v0

    .line 117
    goto :goto_2

    .line 118
    :cond_2
    move v5, v1

    .line 119
    :goto_2
    iget-object v0, p0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->excludePackages:Ljava/util/Collection;

    .line 120
    .line 121
    if-eqz v0, :cond_4

    .line 122
    .line 123
    check-cast v0, Ljava/lang/Iterable;

    .line 124
    .line 125
    new-instance v4, Ljava/util/ArrayList;

    .line 126
    .line 127
    invoke-static {v0, v2}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 128
    .line 129
    .line 130
    move-result v6

    .line 131
    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 132
    .line 133
    .line 134
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 139
    .line 140
    .line 141
    move-result v6

    .line 142
    if-eqz v6, :cond_3

    .line 143
    .line 144
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v6

    .line 148
    check-cast v6, Ljava/lang/String;

    .line 149
    .line 150
    invoke-virtual {p1, v6}, Lb40;->κ(Ljava/lang/CharSequence;)I

    .line 151
    .line 152
    .line 153
    move-result v6

    .line 154
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 155
    .line 156
    .line 157
    move-result-object v6

    .line 158
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    goto :goto_3

    .line 162
    :cond_3
    invoke-static {v4}, Lxh;->ｄ(Ljava/util/List;)[I

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    invoke-virtual {p1, v0}, Lb40;->λ([I)I

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    move v6, v0

    .line 171
    goto :goto_4

    .line 172
    :cond_4
    move v6, v1

    .line 173
    :goto_4
    iget-boolean v7, p0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->ignorePackagesCase:Z

    .line 174
    .line 175
    iget-object v0, p0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->searchClasses:Ljava/util/Collection;

    .line 176
    .line 177
    if-eqz v0, :cond_6

    .line 178
    .line 179
    check-cast v0, Ljava/lang/Iterable;

    .line 180
    .line 181
    new-instance v4, Ljava/util/ArrayList;

    .line 182
    .line 183
    invoke-static {v0, v2}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 184
    .line 185
    .line 186
    move-result v8

    .line 187
    invoke-direct {v4, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 188
    .line 189
    .line 190
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 195
    .line 196
    .line 197
    move-result v8

    .line 198
    if-eqz v8, :cond_5

    .line 199
    .line 200
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v8

    .line 204
    check-cast v8, Lorg/luckypray/dexkit/result/ClassData;

    .line 205
    .line 206
    invoke-virtual {v8}, Lorg/luckypray/dexkit/result/base/BaseData;->getEncodeId()J

    .line 207
    .line 208
    .line 209
    move-result-wide v8

    .line 210
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 211
    .line 212
    .line 213
    move-result-object v8

    .line 214
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    goto :goto_5

    .line 218
    :cond_5
    invoke-static {v4}, Lxh;->ｆ(Ljava/util/ArrayList;)[J

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    sget-object v4, Lorg/luckypray/dexkit/schema/-BatchFindMethodUsingStrings;->Companion:Lorg/luckypray/dexkit/schema/-BatchFindMethodUsingStrings$Companion;

    .line 223
    .line 224
    invoke-virtual {v4, p1, v0}, Lorg/luckypray/dexkit/schema/-BatchFindMethodUsingStrings$Companion;->createInClassesVector(Lb40;[J)I

    .line 225
    .line 226
    .line 227
    move-result v0

    .line 228
    move v8, v0

    .line 229
    goto :goto_6

    .line 230
    :cond_6
    move v8, v1

    .line 231
    :goto_6
    iget-object v0, p0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->searchMethods:Ljava/util/Collection;

    .line 232
    .line 233
    if-eqz v0, :cond_8

    .line 234
    .line 235
    check-cast v0, Ljava/lang/Iterable;

    .line 236
    .line 237
    new-instance v1, Ljava/util/ArrayList;

    .line 238
    .line 239
    invoke-static {v0, v2}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 240
    .line 241
    .line 242
    move-result v4

    .line 243
    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 244
    .line 245
    .line 246
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 251
    .line 252
    .line 253
    move-result v4

    .line 254
    if-eqz v4, :cond_7

    .line 255
    .line 256
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v4

    .line 260
    check-cast v4, Lorg/luckypray/dexkit/result/MethodData;

    .line 261
    .line 262
    invoke-virtual {v4}, Lorg/luckypray/dexkit/result/base/BaseData;->getEncodeId()J

    .line 263
    .line 264
    .line 265
    move-result-wide v9

    .line 266
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 267
    .line 268
    .line 269
    move-result-object v4

    .line 270
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    goto :goto_7

    .line 274
    :cond_7
    invoke-static {v1}, Lxh;->ｆ(Ljava/util/ArrayList;)[J

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    sget-object v1, Lorg/luckypray/dexkit/schema/-BatchFindMethodUsingStrings;->Companion:Lorg/luckypray/dexkit/schema/-BatchFindMethodUsingStrings$Companion;

    .line 279
    .line 280
    invoke-virtual {v1, p1, v0}, Lorg/luckypray/dexkit/schema/-BatchFindMethodUsingStrings$Companion;->createInMethodsVector(Lb40;[J)I

    .line 281
    .line 282
    .line 283
    move-result v1

    .line 284
    :cond_8
    move v9, v1

    .line 285
    iget-object p0, p0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->searchGroups:Ljava/util/List;

    .line 286
    .line 287
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 288
    .line 289
    .line 290
    new-instance v0, Ljava/util/ArrayList;

    .line 291
    .line 292
    invoke-static {p0, v2}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 293
    .line 294
    .line 295
    move-result v1

    .line 296
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 297
    .line 298
    .line 299
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 300
    .line 301
    .line 302
    move-result-object p0

    .line 303
    :goto_8
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 304
    .line 305
    .line 306
    move-result v1

    .line 307
    if-eqz v1, :cond_9

    .line 308
    .line 309
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v1

    .line 313
    check-cast v1, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;

    .line 314
    .line 315
    invoke-virtual {v1, p1}, Lorg/luckypray/dexkit/query/base/BaseMatcher;->build$dexkit_android_release(Lb40;)I

    .line 316
    .line 317
    .line 318
    move-result v1

    .line 319
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 320
    .line 321
    .line 322
    move-result-object v1

    .line 323
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 324
    .line 325
    .line 326
    goto :goto_8

    .line 327
    :cond_9
    invoke-static {v0}, Lxh;->ｄ(Ljava/util/List;)[I

    .line 328
    .line 329
    .line 330
    move-result-object p0

    .line 331
    invoke-virtual {p1, p0}, Lb40;->λ([I)I

    .line 332
    .line 333
    .line 334
    move-result v10

    .line 335
    move-object v4, p1

    .line 336
    invoke-virtual/range {v3 .. v10}, Lorg/luckypray/dexkit/schema/-BatchFindMethodUsingStrings$Companion;->createBatchFindMethodUsingStrings(Lb40;IIZIII)I

    .line 337
    .line 338
    .line 339
    move-result p0

    .line 340
    invoke-virtual {v4, p0}, Lb40;->ξ(I)V

    .line 341
    .line 342
    .line 343
    return p0

    .line 344
    :cond_a
    new-instance p0, Ljava/lang/IllegalAccessException;

    .line 345
    .line 346
    const-string p1, "groupName must be unique"

    .line 347
    .line 348
    invoke-direct {p0, p1}, Ljava/lang/IllegalAccessException;-><init>(Ljava/lang/String;)V

    .line 349
    .line 350
    .line 351
    throw p0

    .line 352
    :cond_b
    new-instance p0, Ljava/lang/IllegalAccessException;

    .line 353
    .line 354
    const-string p1, "searchGroups not be empty"

    .line 355
    .line 356
    invoke-direct {p0, p1}, Ljava/lang/IllegalAccessException;-><init>(Ljava/lang/String;)V

    .line 357
    .line 358
    .line 359
    throw p0
.end method

.method public final searchInClasses(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lorg/luckypray/dexkit/result/ClassData;",
            ">;)",
            "Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->searchClasses:Ljava/util/Collection;

    .line 5
    .line 6
    return-object p0
.end method

.method public final searchInMethods(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lorg/luckypray/dexkit/result/MethodData;",
            ">;)",
            "Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->searchMethods:Ljava/util/Collection;

    .line 5
    .line 6
    return-object p0
.end method

.method public final searchPackages(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)",
            "Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    iput-object p1, p0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->searchPackages:Ljava/util/Collection;

    return-object p0
.end method

.method public final varargs searchPackages([Ljava/lang/String;)Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lg7;->н([Ljava/lang/Object;)Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->searchPackages:Ljava/util/Collection;

    .line 9
    .line 10
    return-object p0
.end method

.method public final synthetic setExcludePackages(Ljava/util/Collection;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->excludePackages:Ljava/util/Collection;

    .line 2
    .line 3
    return-void
.end method

.method public final synthetic setIgnorePackagesCase(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->ignorePackagesCase:Z

    .line 2
    .line 3
    return-void
.end method

.method public final synthetic setSearchClasses(Ljava/util/Collection;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->searchClasses:Ljava/util/Collection;

    .line 2
    .line 3
    return-void
.end method

.method public final synthetic setSearchMethods(Ljava/util/Collection;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->searchMethods:Ljava/util/Collection;

    .line 2
    .line 3
    return-void
.end method

.method public final synthetic setSearchPackages(Ljava/util/Collection;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/luckypray/dexkit/query/BatchFindMethodUsingStrings;->searchPackages:Ljava/util/Collection;

    .line 2
    .line 3
    return-void
.end method
