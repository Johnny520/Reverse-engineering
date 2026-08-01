.class public final Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;
.super Lorg/luckypray/dexkit/query/base/BaseFinder;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings$Companion;


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
    new-instance v0, Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings$Companion;-><init>(Lr2;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;->Companion:Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings$Companion;

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

.method public static synthetic addSearchGroup$default(Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;Ljava/lang/String;Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;
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
    invoke-virtual {p0, p1, p2, p3, p4}, Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;->addSearchGroup(Ljava/lang/String;Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public static final create()Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;
    .locals 1

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;->Companion:Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings$Companion;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings$Companion;->create()Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public static synthetic groups$default(Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;Ljava/util/Map;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;
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
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;->groups(Ljava/util/Map;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method


# virtual methods
.method public final addSearchGroup(Ljava/lang/String;Ljava/util/Collection;)Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)",
            "Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;"
        }
    .end annotation

    .line 58
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v5, 0xc

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-static/range {v0 .. v6}, Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;->addSearchGroup$default(Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;Ljava/lang/String;Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;

    move-result-object p0

    return-object p0
.end method

.method public final addSearchGroup(Ljava/lang/String;Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;
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
            "Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;"
        }
    .end annotation

    .line 53
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

    invoke-static/range {v0 .. v6}, Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;->addSearchGroup$default(Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;Ljava/lang/String;Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;

    move-result-object p0

    return-object p0
.end method

.method public final addSearchGroup(Ljava/lang/String;Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;
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
            "Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;"
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
    new-instance v0, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-static {p2}, Lj2;->i2(Ljava/lang/Iterable;)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 17
    .line 18
    .line 19
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, Ljava/lang/String;

    .line 34
    .line 35
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    .line 36
    .line 37
    invoke-direct {v2, v1, p3, p4}, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    new-instance p2, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;

    .line 45
    .line 46
    invoke-direct {p2, p1, v0}, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;-><init>(Ljava/lang/String;Ljava/util/Collection;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, p2}, Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;->addSearchGroup(Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;)Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;

    .line 50
    .line 51
    .line 52
    return-object p0
.end method

.method public final synthetic addSearchGroup(Ljava/lang/String;Lu5;)Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;

    new-instance v1, Lorg/luckypray/dexkit/query/StringMatcherList;

    invoke-direct {v1}, Lorg/luckypray/dexkit/query/StringMatcherList;-><init>()V

    invoke-interface {p2, v1}, Lu5;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {v0, p1, v1}, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;-><init>(Ljava/lang/String;Ljava/util/Collection;)V

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;->addSearchGroup(Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;)Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;

    return-object p0
.end method

.method public final addSearchGroup(Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;)Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    iget-object v0, p0, Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;->searchGroups:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;->searchGroups:Ljava/util/List;

    .line 55
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final synthetic addSearchGroup(Lu5;)Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;-><init>()V

    invoke-interface {p1, v0}, Lu5;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;->addSearchGroup(Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;)Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;

    return-object p0
.end method

.method public final excludePackages(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)",
            "Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    iput-object p1, p0, Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;->excludePackages:Ljava/util/Collection;

    return-object p0
.end method

.method public final varargs excludePackages([Ljava/lang/String;)Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;
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
    iput-object p1, p0, Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;->excludePackages:Ljava/util/Collection;

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
    iget-object p0, p0, Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;->excludePackages:Ljava/util/Collection;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getIgnorePackagesCase()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;->ignorePackagesCase:Z

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
    iget-object p0, p0, Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;->searchClasses:Ljava/util/Collection;

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
    iget-object p0, p0, Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;->searchGroups:Ljava/util/List;

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
    iget-object p0, p0, Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;->searchPackages:Ljava/util/Collection;

    .line 2
    .line 3
    return-object p0
.end method

.method public final groups(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;",
            ">;)",
            "Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 103
    iput-object v0, p0, Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;->searchGroups:Ljava/util/List;

    return-object p0
.end method

.method public final groups(Ljava/util/Map;)Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;
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
            "Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;"
        }
    .end annotation

    .line 101
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;->groups$default(Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;Ljava/util/Map;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;

    move-result-object p0

    return-object p0
.end method

.method public final groups(Ljava/util/Map;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;
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
            "Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;"
        }
    .end annotation

    .line 99
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;->groups$default(Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;Ljava/util/Map;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;

    move-result-object p0

    return-object p0
.end method

.method public final groups(Ljava/util/Map;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;
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
            "Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;"
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
    new-instance v3, Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-static {v1}, Lj2;->i2(Ljava/lang/Iterable;)I

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 55
    .line 56
    .line 57
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    if-eqz v4, :cond_0

    .line 66
    .line 67
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    check-cast v4, Ljava/lang/String;

    .line 72
    .line 73
    new-instance v5, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    .line 74
    .line 75
    invoke-direct {v5, v4, p2, p3}, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_0
    new-instance v1, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;

    .line 83
    .line 84
    invoke-direct {v1, v2, v3}, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;-><init>(Ljava/lang/String;Ljava/util/Collection;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_1
    new-instance p1, Ljava/util/ArrayList;

    .line 92
    .line 93
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 94
    .line 95
    .line 96
    iput-object p1, p0, Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;->searchGroups:Ljava/util/List;

    .line 97
    .line 98
    return-object p0
.end method

.method public final synthetic groups(Lu5;)Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    new-instance v0, Lorg/luckypray/dexkit/query/StringMatchersGroupList;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/StringMatchersGroupList;-><init>()V

    invoke-interface {p1, v0}, Lu5;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;->groups(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;

    return-object p0
.end method

.method public final ignorePackagesCase(Z)Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;->ignorePackagesCase:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public innerBuild(Lc5;)I
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;->searchGroups:Ljava/util/List;

    .line 5
    .line 6
    if-eqz v0, :cond_9

    .line 7
    .line 8
    new-instance v1, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-static {v0}, Lj2;->i2(Ljava/lang/Iterable;)I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;

    .line 32
    .line 33
    invoke-virtual {v2}, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;->getGroupName()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    invoke-static {v1}, Lh2;->n2(Ljava/util/ArrayList;)Ljava/util/Set;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-interface {v0}, Ljava/util/Set;->size()I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    iget-object v1, p0, Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;->searchGroups:Ljava/util/List;

    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-lt v0, v1, :cond_8

    .line 59
    .line 60
    sget-object v2, Lorg/luckypray/dexkit/schema/-BatchFindClassUsingStrings;->Companion:Lorg/luckypray/dexkit/schema/-BatchFindClassUsingStrings$Companion;

    .line 61
    .line 62
    iget-object v0, p0, Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;->searchPackages:Ljava/util/Collection;

    .line 63
    .line 64
    const/4 v1, 0x0

    .line 65
    if-eqz v0, :cond_2

    .line 66
    .line 67
    new-instance v3, Ljava/util/ArrayList;

    .line 68
    .line 69
    invoke-static {v0}, Lj2;->i2(Ljava/lang/Iterable;)I

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 74
    .line 75
    .line 76
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    if-eqz v4, :cond_1

    .line 85
    .line 86
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    check-cast v4, Ljava/lang/String;

    .line 91
    .line 92
    invoke-virtual {p1, v4}, Lc5;->j(Ljava/lang/CharSequence;)I

    .line 93
    .line 94
    .line 95
    move-result v4

    .line 96
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_1
    invoke-static {v3}, Lh2;->l2(Ljava/util/ArrayList;)[I

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-virtual {p1, v0}, Lc5;->k([I)I

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    move v4, v0

    .line 113
    goto :goto_2

    .line 114
    :cond_2
    move v4, v1

    .line 115
    :goto_2
    iget-object v0, p0, Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;->excludePackages:Ljava/util/Collection;

    .line 116
    .line 117
    if-eqz v0, :cond_4

    .line 118
    .line 119
    new-instance v3, Ljava/util/ArrayList;

    .line 120
    .line 121
    invoke-static {v0}, Lj2;->i2(Ljava/lang/Iterable;)I

    .line 122
    .line 123
    .line 124
    move-result v5

    .line 125
    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 126
    .line 127
    .line 128
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 133
    .line 134
    .line 135
    move-result v5

    .line 136
    if-eqz v5, :cond_3

    .line 137
    .line 138
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v5

    .line 142
    check-cast v5, Ljava/lang/String;

    .line 143
    .line 144
    invoke-virtual {p1, v5}, Lc5;->j(Ljava/lang/CharSequence;)I

    .line 145
    .line 146
    .line 147
    move-result v5

    .line 148
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 149
    .line 150
    .line 151
    move-result-object v5

    .line 152
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    goto :goto_3

    .line 156
    :cond_3
    invoke-static {v3}, Lh2;->l2(Ljava/util/ArrayList;)[I

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    invoke-virtual {p1, v0}, Lc5;->k([I)I

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    move v5, v0

    .line 165
    goto :goto_4

    .line 166
    :cond_4
    move v5, v1

    .line 167
    :goto_4
    iget-boolean v6, p0, Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;->ignorePackagesCase:Z

    .line 168
    .line 169
    iget-object v0, p0, Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;->searchClasses:Ljava/util/Collection;

    .line 170
    .line 171
    if-eqz v0, :cond_6

    .line 172
    .line 173
    new-instance v1, Ljava/util/ArrayList;

    .line 174
    .line 175
    invoke-static {v0}, Lj2;->i2(Ljava/lang/Iterable;)I

    .line 176
    .line 177
    .line 178
    move-result v3

    .line 179
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 180
    .line 181
    .line 182
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 187
    .line 188
    .line 189
    move-result v3

    .line 190
    if-eqz v3, :cond_5

    .line 191
    .line 192
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v3

    .line 196
    check-cast v3, Lorg/luckypray/dexkit/result/ClassData;

    .line 197
    .line 198
    invoke-virtual {v3}, Lorg/luckypray/dexkit/result/base/BaseData;->getEncodeId()J

    .line 199
    .line 200
    .line 201
    move-result-wide v7

    .line 202
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 203
    .line 204
    .line 205
    move-result-object v3

    .line 206
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    goto :goto_5

    .line 210
    :cond_5
    invoke-static {v1}, Lh2;->m2(Ljava/util/ArrayList;)[J

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    sget-object v1, Lorg/luckypray/dexkit/schema/-BatchFindClassUsingStrings;->Companion:Lorg/luckypray/dexkit/schema/-BatchFindClassUsingStrings$Companion;

    .line 215
    .line 216
    invoke-virtual {v1, p1, v0}, Lorg/luckypray/dexkit/schema/-BatchFindClassUsingStrings$Companion;->createInClassesVector(Lc5;[J)I

    .line 217
    .line 218
    .line 219
    move-result v1

    .line 220
    :cond_6
    move v7, v1

    .line 221
    iget-object p0, p0, Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;->searchGroups:Ljava/util/List;

    .line 222
    .line 223
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    new-instance v0, Ljava/util/ArrayList;

    .line 227
    .line 228
    invoke-static {p0}, Lj2;->i2(Ljava/lang/Iterable;)I

    .line 229
    .line 230
    .line 231
    move-result v1

    .line 232
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 233
    .line 234
    .line 235
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 236
    .line 237
    .line 238
    move-result-object p0

    .line 239
    :goto_6
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 240
    .line 241
    .line 242
    move-result v1

    .line 243
    if-eqz v1, :cond_7

    .line 244
    .line 245
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v1

    .line 249
    check-cast v1, Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;

    .line 250
    .line 251
    invoke-virtual {v1, p1}, Lorg/luckypray/dexkit/query/base/BaseMatcher;->build$dexkit_android_release(Lc5;)I

    .line 252
    .line 253
    .line 254
    move-result v1

    .line 255
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 256
    .line 257
    .line 258
    move-result-object v1

    .line 259
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    goto :goto_6

    .line 263
    :cond_7
    invoke-static {v0}, Lh2;->l2(Ljava/util/ArrayList;)[I

    .line 264
    .line 265
    .line 266
    move-result-object p0

    .line 267
    invoke-virtual {p1, p0}, Lc5;->k([I)I

    .line 268
    .line 269
    .line 270
    move-result v8

    .line 271
    move-object v3, p1

    .line 272
    invoke-virtual/range {v2 .. v8}, Lorg/luckypray/dexkit/schema/-BatchFindClassUsingStrings$Companion;->createBatchFindClassUsingStrings(Lc5;IIZII)I

    .line 273
    .line 274
    .line 275
    move-result p0

    .line 276
    invoke-virtual {v3, p0}, Lc5;->n(I)V

    .line 277
    .line 278
    .line 279
    return p0

    .line 280
    :cond_8
    new-instance p0, Ljava/lang/IllegalAccessException;

    .line 281
    .line 282
    const-string p1, "groupName must be unique"

    .line 283
    .line 284
    invoke-direct {p0, p1}, Ljava/lang/IllegalAccessException;-><init>(Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    throw p0

    .line 288
    :cond_9
    new-instance p0, Ljava/lang/IllegalAccessException;

    .line 289
    .line 290
    const-string p1, "searchGroups not be empty"

    .line 291
    .line 292
    invoke-direct {p0, p1}, Ljava/lang/IllegalAccessException;-><init>(Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    throw p0
.end method

.method public final searchIn(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lorg/luckypray/dexkit/result/ClassData;",
            ">;)",
            "Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;->searchClasses:Ljava/util/Collection;

    .line 5
    .line 6
    return-object p0
.end method

.method public final searchPackages(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)",
            "Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    iput-object p1, p0, Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;->searchPackages:Ljava/util/Collection;

    return-object p0
.end method

.method public final varargs searchPackages([Ljava/lang/String;)Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;
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
    iput-object p1, p0, Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;->searchPackages:Ljava/util/Collection;

    .line 9
    .line 10
    return-object p0
.end method

.method public final synthetic setExcludePackages(Ljava/util/Collection;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;->excludePackages:Ljava/util/Collection;

    .line 2
    .line 3
    return-void
.end method

.method public final synthetic setIgnorePackagesCase(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;->ignorePackagesCase:Z

    .line 2
    .line 3
    return-void
.end method

.method public final synthetic setSearchClasses(Ljava/util/Collection;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;->searchClasses:Ljava/util/Collection;

    .line 2
    .line 3
    return-void
.end method

.method public final synthetic setSearchPackages(Ljava/util/Collection;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/luckypray/dexkit/query/BatchFindClassUsingStrings;->searchPackages:Ljava/util/Collection;

    .line 2
    .line 3
    return-void
.end method
