.class public final Lorg/luckypray/dexkit/query/FindField;
.super Lorg/luckypray/dexkit/query/base/BaseQuery;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/query/FindField$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lorg/luckypray/dexkit/query/FindField$Companion;


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

.field private findFirst:Z

.field private ignorePackagesCase:Z

.field private matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

.field private searchClasses:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Lorg/luckypray/dexkit/result/ClassData;",
            ">;"
        }
    .end annotation
.end field

.field private searchFields:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Lorg/luckypray/dexkit/result/FieldData;",
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

    new-instance v0, Lorg/luckypray/dexkit/query/FindField$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/query/FindField$Companion;-><init>(LQ0/d;)V

    sput-object v0, Lorg/luckypray/dexkit/query/FindField;->Companion:Lorg/luckypray/dexkit/query/FindField$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lorg/luckypray/dexkit/query/base/BaseQuery;-><init>()V

    return-void
.end method

.method public static final create()Lorg/luckypray/dexkit/query/FindField;
    .locals 1

    sget-object v0, Lorg/luckypray/dexkit/query/FindField;->Companion:Lorg/luckypray/dexkit/query/FindField$Companion;

    invoke-virtual {v0}, Lorg/luckypray/dexkit/query/FindField$Companion;->create()Lorg/luckypray/dexkit/query/FindField;

    move-result-object v0

    return-object v0
.end method

.method private final matcher(LP0/l;)Lorg/luckypray/dexkit/query/FindField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LP0/l;",
            ")",
            "Lorg/luckypray/dexkit/query/FindField;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    invoke-interface {p1, v0}, LP0/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/FindField;->matcher(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/FindField;

    return-object p0
.end method


# virtual methods
.method public final excludePackages(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/FindField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)",
            "Lorg/luckypray/dexkit/query/FindField;"
        }
    .end annotation

    const-string v0, "excludePackages"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iput-object p1, p0, Lorg/luckypray/dexkit/query/FindField;->excludePackages:Ljava/util/Collection;

    return-object p0
.end method

.method public final varargs excludePackages([Ljava/lang/String;)Lorg/luckypray/dexkit/query/FindField;
    .locals 1

    const-string v0, "excludePackages"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {p1}, LE0/j;->q0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lorg/luckypray/dexkit/query/FindField;->excludePackages:Ljava/util/Collection;

    return-object p0
.end method

.method public final getExcludePackages()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lorg/luckypray/dexkit/query/FindField;->excludePackages:Ljava/util/Collection;

    return-object v0
.end method

.method public final getFindFirst()Z
    .locals 1

    iget-boolean v0, p0, Lorg/luckypray/dexkit/query/FindField;->findFirst:Z

    return v0
.end method

.method public final getIgnorePackagesCase()Z
    .locals 1

    iget-boolean v0, p0, Lorg/luckypray/dexkit/query/FindField;->ignorePackagesCase:Z

    return v0
.end method

.method public final getMatcher()Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
    .locals 1

    iget-object v0, p0, Lorg/luckypray/dexkit/query/FindField;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    return-object v0
.end method

.method public final getSearchClasses()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lorg/luckypray/dexkit/result/ClassData;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lorg/luckypray/dexkit/query/FindField;->searchClasses:Ljava/util/Collection;

    return-object v0
.end method

.method public final getSearchFields()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lorg/luckypray/dexkit/result/FieldData;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lorg/luckypray/dexkit/query/FindField;->searchFields:Ljava/util/Collection;

    return-object v0
.end method

.method public final getSearchPackages()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lorg/luckypray/dexkit/query/FindField;->searchPackages:Ljava/util/Collection;

    return-object v0
.end method

.method public final ignorePackagesCase(Z)Lorg/luckypray/dexkit/query/FindField;
    .locals 0

    iput-boolean p1, p0, Lorg/luckypray/dexkit/query/FindField;->ignorePackagesCase:Z

    return-object p0
.end method

.method public innerBuild(Lcom/google/flatbuffers/b;)I
    .locals 11

    const-string v0, "fbb"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lorg/luckypray/dexkit/schema/-FindField;->Companion:Lorg/luckypray/dexkit/schema/-FindField$Companion;

    iget-object v0, p0, Lorg/luckypray/dexkit/query/FindField;->searchPackages:Ljava/util/Collection;

    const/16 v2, 0xa

    const/4 v3, 0x0

    if-eqz v0, :cond_1

    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v0, v2}, LE0/n;->k0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {p1, v5}, Lcom/google/flatbuffers/b;->j(Ljava/lang/CharSequence;)I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v4}, LE0/l;->x0(Ljava/util/ArrayList;)[I

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/flatbuffers/b;->k([I)I

    move-result v0

    goto :goto_1

    :cond_1
    move v0, v3

    :goto_1
    iget-object v4, p0, Lorg/luckypray/dexkit/query/FindField;->excludePackages:Ljava/util/Collection;

    if-eqz v4, :cond_3

    new-instance v5, Ljava/util/ArrayList;

    invoke-static {v4, v2}, LE0/n;->k0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-virtual {p1, v6}, Lcom/google/flatbuffers/b;->j(Ljava/lang/CharSequence;)I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    invoke-static {v5}, LE0/l;->x0(Ljava/util/ArrayList;)[I

    move-result-object v4

    invoke-virtual {p1, v4}, Lcom/google/flatbuffers/b;->k([I)I

    move-result v4

    goto :goto_3

    :cond_3
    move v4, v3

    :goto_3
    iget-boolean v5, p0, Lorg/luckypray/dexkit/query/FindField;->ignorePackagesCase:Z

    iget-object v6, p0, Lorg/luckypray/dexkit/query/FindField;->searchClasses:Ljava/util/Collection;

    if-eqz v6, :cond_5

    new-instance v7, Ljava/util/ArrayList;

    invoke-static {v6, v2}, LE0/n;->k0(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_4

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lorg/luckypray/dexkit/result/ClassData;

    invoke-virtual {v8}, Lorg/luckypray/dexkit/result/base/BaseData;->getEncodeId()J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_4
    invoke-static {v7}, LE0/l;->z0(Ljava/util/ArrayList;)[J

    move-result-object v6

    sget-object v7, Lorg/luckypray/dexkit/schema/-FindField;->Companion:Lorg/luckypray/dexkit/schema/-FindField$Companion;

    invoke-virtual {v7, p1, v6}, Lorg/luckypray/dexkit/schema/-FindField$Companion;->createInClassesVector(Lcom/google/flatbuffers/b;[J)I

    move-result v6

    goto :goto_5

    :cond_5
    move v6, v3

    :goto_5
    iget-object v7, p0, Lorg/luckypray/dexkit/query/FindField;->searchFields:Ljava/util/Collection;

    if-eqz v7, :cond_7

    new-instance v8, Ljava/util/ArrayList;

    invoke-static {v7, v2}, LE0/n;->k0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v8, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lorg/luckypray/dexkit/result/FieldData;

    invoke-virtual {v7}, Lorg/luckypray/dexkit/result/base/BaseData;->getEncodeId()J

    move-result-wide v9

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_6
    invoke-static {v8}, LE0/l;->z0(Ljava/util/ArrayList;)[J

    move-result-object v2

    sget-object v7, Lorg/luckypray/dexkit/schema/-FindField;->Companion:Lorg/luckypray/dexkit/schema/-FindField$Companion;

    invoke-virtual {v7, p1, v2}, Lorg/luckypray/dexkit/schema/-FindField$Companion;->createInFieldsVector(Lcom/google/flatbuffers/b;[J)I

    move-result v2

    move v7, v2

    goto :goto_7

    :cond_7
    move v7, v3

    :goto_7
    iget-boolean v8, p0, Lorg/luckypray/dexkit/query/FindField;->findFirst:Z

    iget-object v2, p0, Lorg/luckypray/dexkit/query/FindField;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    if-eqz v2, :cond_8

    invoke-static {v2, p1}, Lorg/luckypray/dexkit/query/base/BaseQuery;->access$innerBuild(Lorg/luckypray/dexkit/query/base/BaseQuery;Lcom/google/flatbuffers/b;)I

    move-result v2

    move v9, v2

    goto :goto_8

    :cond_8
    move v9, v3

    :goto_8
    move-object v2, p1

    move v3, v0

    invoke-virtual/range {v1 .. v9}, Lorg/luckypray/dexkit/schema/-FindField$Companion;->createFindField(Lcom/google/flatbuffers/b;IIZIIZI)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/google/flatbuffers/b;->n(I)V

    return v0
.end method

.method public final matcher(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/FindField;
    .locals 1

    const-string v0, "matcher"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lorg/luckypray/dexkit/query/FindField;->matcher:Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    return-object p0
.end method

.method public final searchInClass(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/FindField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lorg/luckypray/dexkit/result/ClassData;",
            ">;)",
            "Lorg/luckypray/dexkit/query/FindField;"
        }
    .end annotation

    const-string v0, "classes"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lorg/luckypray/dexkit/query/FindField;->searchClasses:Ljava/util/Collection;

    return-object p0
.end method

.method public final searchInField(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/FindField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lorg/luckypray/dexkit/result/FieldData;",
            ">;)",
            "Lorg/luckypray/dexkit/query/FindField;"
        }
    .end annotation

    const-string v0, "fields"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lorg/luckypray/dexkit/query/FindField;->searchFields:Ljava/util/Collection;

    return-object p0
.end method

.method public final searchPackages(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/FindField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)",
            "Lorg/luckypray/dexkit/query/FindField;"
        }
    .end annotation

    const-string v0, "searchPackages"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iput-object p1, p0, Lorg/luckypray/dexkit/query/FindField;->searchPackages:Ljava/util/Collection;

    return-object p0
.end method

.method public final varargs searchPackages([Ljava/lang/String;)Lorg/luckypray/dexkit/query/FindField;
    .locals 1

    const-string v0, "searchPackages"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {p1}, LE0/j;->q0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lorg/luckypray/dexkit/query/FindField;->searchPackages:Ljava/util/Collection;

    return-object p0
.end method

.method public final synthetic setExcludePackages(Ljava/util/Collection;)V
    .locals 0

    iput-object p1, p0, Lorg/luckypray/dexkit/query/FindField;->excludePackages:Ljava/util/Collection;

    return-void
.end method

.method public final synthetic setFindFirst(Z)V
    .locals 0

    iput-boolean p1, p0, Lorg/luckypray/dexkit/query/FindField;->findFirst:Z

    return-void
.end method

.method public final synthetic setIgnorePackagesCase(Z)V
    .locals 0

    iput-boolean p1, p0, Lorg/luckypray/dexkit/query/FindField;->ignorePackagesCase:Z

    return-void
.end method

.method public final synthetic setSearchClasses(Ljava/util/Collection;)V
    .locals 0

    iput-object p1, p0, Lorg/luckypray/dexkit/query/FindField;->searchClasses:Ljava/util/Collection;

    return-void
.end method

.method public final synthetic setSearchFields(Ljava/util/Collection;)V
    .locals 0

    iput-object p1, p0, Lorg/luckypray/dexkit/query/FindField;->searchFields:Ljava/util/Collection;

    return-void
.end method

.method public final synthetic setSearchPackages(Ljava/util/Collection;)V
    .locals 0

    iput-object p1, p0, Lorg/luckypray/dexkit/query/FindField;->searchPackages:Ljava/util/Collection;

    return-void
.end method
