.class public Lcom/alibaba/fastjson2/filter/SimplePropertyPreFilter;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lcom/alibaba/fastjson2/filter/PropertyPreFilter;


# instance fields
.field private final clazz:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field private final excludes:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final includes:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private maxLevel:I


# direct methods
.method public varargs constructor <init>(Ljava/lang/Class;[Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;[",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashSet;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/alibaba/fastjson2/filter/SimplePropertyPreFilter;->includes:Ljava/util/Set;

    .line 10
    .line 11
    new-instance v0, Ljava/util/HashSet;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/alibaba/fastjson2/filter/SimplePropertyPreFilter;->excludes:Ljava/util/Set;

    .line 17
    .line 18
    iput-object p1, p0, Lcom/alibaba/fastjson2/filter/SimplePropertyPreFilter;->clazz:Ljava/lang/Class;

    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    :goto_0
    array-length v0, p2

    .line 22
    if-ge p1, v0, :cond_1

    .line 23
    .line 24
    aget-object v0, p2, p1

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    iget-object v1, p0, Lcom/alibaba/fastjson2/filter/SimplePropertyPreFilter;->includes:Ljava/util/Set;

    .line 29
    .line 30
    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    :cond_0
    add-int/lit8 p1, p1, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    return-void
.end method

.method public varargs constructor <init>([Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 37
    invoke-direct {p0, v0, p1}, Lcom/alibaba/fastjson2/filter/SimplePropertyPreFilter;-><init>(Ljava/lang/Class;[Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public getClazz()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/filter/SimplePropertyPreFilter;->clazz:Ljava/lang/Class;

    .line 2
    .line 3
    return-object v0
.end method

.method public getExcludes()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/filter/SimplePropertyPreFilter;->excludes:Ljava/util/Set;

    .line 2
    .line 3
    return-object v0
.end method

.method public getIncludes()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/filter/SimplePropertyPreFilter;->includes:Ljava/util/Set;

    .line 2
    .line 3
    return-object v0
.end method

.method public getMaxLevel()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/filter/SimplePropertyPreFilter;->maxLevel:I

    .line 2
    .line 3
    return v0
.end method

.method public process(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/String;)Z
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-nez p2, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    iget-object v1, p0, Lcom/alibaba/fastjson2/filter/SimplePropertyPreFilter;->clazz:Ljava/lang/Class;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    invoke-virtual {v1, p2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    if-nez p2, :cond_1

    .line 14
    .line 15
    return v0

    .line 16
    :cond_1
    iget-object p2, p0, Lcom/alibaba/fastjson2/filter/SimplePropertyPreFilter;->excludes:Ljava/util/Set;

    .line 17
    .line 18
    invoke-interface {p2, p3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    const/4 v1, 0x0

    .line 23
    if-eqz p2, :cond_2

    .line 24
    .line 25
    return v1

    .line 26
    :cond_2
    iget p2, p0, Lcom/alibaba/fastjson2/filter/SimplePropertyPreFilter;->maxLevel:I

    .line 27
    .line 28
    if-lez p2, :cond_3

    .line 29
    .line 30
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->level()I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    iget p2, p0, Lcom/alibaba/fastjson2/filter/SimplePropertyPreFilter;->maxLevel:I

    .line 35
    .line 36
    if-le p1, p2, :cond_3

    .line 37
    .line 38
    return v1

    .line 39
    :cond_3
    iget-object p1, p0, Lcom/alibaba/fastjson2/filter/SimplePropertyPreFilter;->includes:Ljava/util/Set;

    .line 40
    .line 41
    invoke-interface {p1}, Ljava/util/Set;->size()I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-eqz p1, :cond_5

    .line 46
    .line 47
    iget-object p1, p0, Lcom/alibaba/fastjson2/filter/SimplePropertyPreFilter;->includes:Ljava/util/Set;

    .line 48
    .line 49
    invoke-interface {p1, p3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-eqz p1, :cond_4

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_4
    return v1

    .line 57
    :cond_5
    :goto_0
    return v0
.end method

.method public setMaxLevel(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/alibaba/fastjson2/filter/SimplePropertyPreFilter;->maxLevel:I

    .line 2
    .line 3
    return-void
.end method
