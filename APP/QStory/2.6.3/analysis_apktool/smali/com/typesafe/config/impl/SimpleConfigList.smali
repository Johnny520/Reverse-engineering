.class final Lcom/typesafe/config/impl/SimpleConfigList;
.super Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世苏兰哲;
.implements Lcom/typesafe/config/impl/飘花落叶言子楪苏兰世哲;
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = 0x2L


# instance fields
.field private final resolved:Z

.field private final value:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/typesafe/config/impl/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u5170\u82cf;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5170\u5b50\u82cf\u4e16\u54f2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u54f2\u82cf;",
            "Ljava/util/List<",
            "Lcom/typesafe/config/impl/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u5170\u82cf;",
            ">;)V"
        }
    .end annotation

    .line 29
    invoke-static {p2}, Lcom/typesafe/config/impl/ResolveStatus;->fromValues(Ljava/util/Collection;)Lcom/typesafe/config/impl/ResolveStatus;

    move-result-object v0

    .line 30
    invoke-direct {p0, p1, p2, v0}, Lcom/typesafe/config/impl/SimpleConfigList;-><init>(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;Ljava/util/List;Lcom/typesafe/config/impl/ResolveStatus;)V

    return-void
.end method

.method public constructor <init>(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;Ljava/util/List;Lcom/typesafe/config/impl/ResolveStatus;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5170\u5b50\u82cf\u4e16\u54f2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u54f2\u82cf;",
            "Ljava/util/List<",
            "Lcom/typesafe/config/impl/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u5170\u82cf;",
            ">;",
            "Lcom/typesafe/config/impl/ResolveStatus;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;-><init>(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lcom/typesafe/config/impl/SimpleConfigList;->value:Ljava/util/List;

    .line 5
    .line 6
    sget-object p1, Lcom/typesafe/config/impl/ResolveStatus;->RESOLVED:Lcom/typesafe/config/impl/ResolveStatus;

    .line 7
    .line 8
    if-ne p3, p1, :cond_0

    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    :goto_0
    iput-boolean p1, p0, Lcom/typesafe/config/impl/SimpleConfigList;->resolved:Z

    .line 14
    .line 15
    invoke-static {p2}, Lcom/typesafe/config/impl/ResolveStatus;->fromValues(Ljava/util/Collection;)Lcom/typesafe/config/impl/ResolveStatus;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-ne p3, p1, :cond_1

    .line 20
    .line 21
    return-void

    .line 22
    :cond_1
    const-string p1, "SimpleConfigList created with wrong resolve status: "

    .line 23
    .line 24
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪兰世哲苏(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const/4 p0, 0x0

    .line 28
    throw p0
.end method

.method public static synthetic access$000(Ljava/lang/String;)Ljava/lang/UnsupportedOperationException;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/typesafe/config/impl/SimpleConfigList;->weAreImmutable(Ljava/lang/String;)Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private modify(Lcom/typesafe/config/impl/飘花落叶言子楪世哲苏兰;Lcom/typesafe/config/impl/ResolveStatus;)Lcom/typesafe/config/impl/SimpleConfigList;
    .locals 0

    .line 1
    :try_start_0
    invoke-direct {p0, p1, p2}, Lcom/typesafe/config/impl/SimpleConfigList;->modifyMayThrow(Lcom/typesafe/config/impl/飘花落叶言子楪世苏兰哲;Lcom/typesafe/config/impl/ResolveStatus;)Lcom/typesafe/config/impl/SimpleConfigList;

    .line 2
    .line 3
    .line 4
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    return-object p0

    .line 6
    :catch_0
    move-exception p0

    .line 7
    new-instance p1, Lcom/typesafe/config/ConfigException$BugOrBroken;

    .line 8
    .line 9
    const-string p2, "unexpected checked exception"

    .line 10
    .line 11
    invoke-direct {p1, p2, p0}, Lcom/typesafe/config/ConfigException$BugOrBroken;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 12
    .line 13
    .line 14
    throw p1

    .line 15
    :catch_1
    move-exception p0

    .line 16
    throw p0
.end method

.method private modifyMayThrow(Lcom/typesafe/config/impl/飘花落叶言子楪世苏兰哲;Lcom/typesafe/config/impl/ResolveStatus;)Lcom/typesafe/config/impl/SimpleConfigList;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/typesafe/config/impl/SimpleConfigList;->value:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x0

    .line 9
    move-object v3, v1

    .line 10
    move v4, v2

    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v5

    .line 15
    if-eqz v5, :cond_2

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    check-cast v5, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 22
    .line 23
    invoke-interface {p1, v5, v1}, Lcom/typesafe/config/impl/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏兰哲世(Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;Ljava/lang/String;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 24
    .line 25
    .line 26
    move-result-object v6

    .line 27
    if-nez v3, :cond_0

    .line 28
    .line 29
    if-eq v6, v5, :cond_0

    .line 30
    .line 31
    new-instance v3, Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 34
    .line 35
    .line 36
    move v5, v2

    .line 37
    :goto_1
    if-ge v5, v4, :cond_0

    .line 38
    .line 39
    iget-object v7, p0, Lcom/typesafe/config/impl/SimpleConfigList;->value:Ljava/util/List;

    .line 40
    .line 41
    invoke-interface {v7, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v7

    .line 45
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    add-int/lit8 v5, v5, 0x1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_0
    if-eqz v3, :cond_1

    .line 52
    .line 53
    if-eqz v6, :cond_1

    .line 54
    .line 55
    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    if-eqz v3, :cond_4

    .line 62
    .line 63
    if-eqz p2, :cond_3

    .line 64
    .line 65
    new-instance p1, Lcom/typesafe/config/impl/SimpleConfigList;

    .line 66
    .line 67
    invoke-virtual {p0}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->origin()Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-direct {p1, p0, v3, p2}, Lcom/typesafe/config/impl/SimpleConfigList;-><init>(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;Ljava/util/List;Lcom/typesafe/config/impl/ResolveStatus;)V

    .line 72
    .line 73
    .line 74
    return-object p1

    .line 75
    :cond_3
    new-instance p1, Lcom/typesafe/config/impl/SimpleConfigList;

    .line 76
    .line 77
    invoke-virtual {p0}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->origin()Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-direct {p1, p0, v3}, Lcom/typesafe/config/impl/SimpleConfigList;-><init>(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;Ljava/util/List;)V

    .line 82
    .line 83
    .line 84
    return-object p1

    .line 85
    :cond_4
    return-object p0
.end method

.method private static weAreImmutable(Ljava/lang/String;)Ljava/lang/UnsupportedOperationException;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v1, "ConfigList is immutable, you can\'t call List.\'"

    .line 4
    .line 5
    const-string v2, "\'"

    .line 6
    .line 7
    invoke-static {v1, p0, v2}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏兰世(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-direct {v0, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method private static wrapListIterator(Ljava/util/ListIterator;)Ljava/util/ListIterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ListIterator<",
            "Lcom/typesafe/config/impl/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u5170\u82cf;",
            ">;)",
            "Ljava/util/ListIterator<",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5170\u5b50\u82cf\u4e16\u54f2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u5170\u54f2;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/typesafe/config/impl/飘花落叶言子世楪兰哲苏;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/typesafe/config/impl/飘花落叶言子世楪兰哲苏;-><init>(Ljava/util/ListIterator;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private writeReplace()Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance v0, Lcom/typesafe/config/impl/SerializedConfigValue;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/typesafe/config/impl/SerializedConfigValue;-><init>(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世兰哲;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public bridge synthetic add(ILjava/lang/Object;)V
    .locals 0

    .line 8
    check-cast p2, L飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世兰哲;

    invoke-virtual {p0, p1, p2}, Lcom/typesafe/config/impl/SimpleConfigList;->add(IL飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世兰哲;)V

    return-void
.end method

.method public add(IL飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世兰哲;)V
    .locals 0

    .line 10
    const-string p0, "add"

    invoke-static {p0}, Lcom/typesafe/config/impl/SimpleConfigList;->weAreImmutable(Ljava/lang/String;)Ljava/lang/UnsupportedOperationException;

    move-result-object p0

    throw p0
.end method

.method public bridge synthetic add(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, L飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世兰哲;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/typesafe/config/impl/SimpleConfigList;->add(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世兰哲;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public add(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世兰哲;)Z
    .locals 0

    .line 9
    const-string p0, "add"

    invoke-static {p0}, Lcom/typesafe/config/impl/SimpleConfigList;->weAreImmutable(Ljava/lang/String;)Ljava/lang/UnsupportedOperationException;

    move-result-object p0

    throw p0
.end method

.method public addAll(ILjava/util/Collection;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Collection<",
            "+",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5170\u5b50\u82cf\u4e16\u54f2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u5170\u54f2;",
            ">;)Z"
        }
    .end annotation

    .line 8
    const-string p0, "addAll"

    invoke-static {p0}, Lcom/typesafe/config/impl/SimpleConfigList;->weAreImmutable(Ljava/lang/String;)Ljava/lang/UnsupportedOperationException;

    move-result-object p0

    throw p0
.end method

.method public addAll(Ljava/util/Collection;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5170\u5b50\u82cf\u4e16\u54f2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u5170\u54f2;",
            ">;)Z"
        }
    .end annotation

    .line 1
    const-string p0, "addAll"

    .line 2
    .line 3
    invoke-static {p0}, Lcom/typesafe/config/impl/SimpleConfigList;->weAreImmutable(Ljava/lang/String;)Ljava/lang/UnsupportedOperationException;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    throw p0
.end method

.method public canEqual(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    instance-of p0, p1, Lcom/typesafe/config/impl/SimpleConfigList;

    .line 2
    .line 3
    return p0
.end method

.method public clear()V
    .locals 0

    .line 1
    const-string p0, "clear"

    .line 2
    .line 3
    invoke-static {p0}, Lcom/typesafe/config/impl/SimpleConfigList;->weAreImmutable(Ljava/lang/String;)Ljava/lang/UnsupportedOperationException;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    throw p0
.end method

.method public final concatenate(Lcom/typesafe/config/impl/SimpleConfigList;)Lcom/typesafe/config/impl/SimpleConfigList;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->origin()Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->origin()Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v0, v1}, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲苏兰(Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;)Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    new-instance v1, Ljava/util/ArrayList;

    .line 14
    .line 15
    iget-object v2, p0, Lcom/typesafe/config/impl/SimpleConfigList;->value:Ljava/util/List;

    .line 16
    .line 17
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    iget-object v3, p1, Lcom/typesafe/config/impl/SimpleConfigList;->value:Ljava/util/List;

    .line 22
    .line 23
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    add-int/2addr v3, v2

    .line 28
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 29
    .line 30
    .line 31
    iget-object p0, p0, Lcom/typesafe/config/impl/SimpleConfigList;->value:Ljava/util/List;

    .line 32
    .line 33
    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 34
    .line 35
    .line 36
    iget-object p0, p1, Lcom/typesafe/config/impl/SimpleConfigList;->value:Ljava/util/List;

    .line 37
    .line 38
    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 39
    .line 40
    .line 41
    new-instance p0, Lcom/typesafe/config/impl/SimpleConfigList;

    .line 42
    .line 43
    invoke-direct {p0, v0, v1}, Lcom/typesafe/config/impl/SimpleConfigList;-><init>(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;Ljava/util/List;)V

    .line 44
    .line 45
    .line 46
    return-object p0
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/typesafe/config/impl/SimpleConfigList;->value:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public containsAll(Ljava/util/Collection;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/typesafe/config/impl/SimpleConfigList;->value:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lcom/typesafe/config/impl/SimpleConfigList;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lcom/typesafe/config/impl/SimpleConfigList;->canEqual(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object p0, p0, Lcom/typesafe/config/impl/SimpleConfigList;->value:Ljava/util/List;

    .line 13
    .line 14
    check-cast p1, Lcom/typesafe/config/impl/SimpleConfigList;

    .line 15
    .line 16
    iget-object p1, p1, Lcom/typesafe/config/impl/SimpleConfigList;->value:Ljava/util/List;

    .line 17
    .line 18
    if-eq p0, p1, :cond_0

    .line 19
    .line 20
    invoke-interface {p0, p1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    if-eqz p0, :cond_1

    .line 25
    .line 26
    :cond_0
    const/4 p0, 0x1

    .line 27
    return p0

    .line 28
    :cond_1
    return v1
.end method

.method public get(I)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/typesafe/config/impl/SimpleConfigList;->value:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 8
    .line 9
    return-object p0
.end method

.method public bridge synthetic get(I)Ljava/lang/Object;
    .locals 0

    .line 10
    invoke-virtual {p0, p1}, Lcom/typesafe/config/impl/SimpleConfigList;->get(I)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    move-result-object p0

    return-object p0
.end method

.method public hasDescendant(Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/typesafe/config/impl/SimpleConfigList;->value:Ljava/util/List;

    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->hasDescendantInList(Ljava/util/List;Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/typesafe/config/impl/SimpleConfigList;->value:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/List;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public indexOf(Ljava/lang/Object;)I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/typesafe/config/impl/SimpleConfigList;->value:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public isEmpty()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/typesafe/config/impl/SimpleConfigList;->value:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5170\u5b50\u82cf\u4e16\u54f2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u5170\u54f2;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/typesafe/config/impl/SimpleConfigList;->value:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    new-instance v0, Lcom/typesafe/config/impl/飘花落叶言子世楪兰苏哲;

    .line 8
    .line 9
    invoke-direct {v0, p0}, Lcom/typesafe/config/impl/飘花落叶言子世楪兰苏哲;-><init>(Ljava/util/Iterator;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public lastIndexOf(Ljava/lang/Object;)I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/typesafe/config/impl/SimpleConfigList;->value:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Ljava/util/List;->lastIndexOf(Ljava/lang/Object;)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public listIterator()Ljava/util/ListIterator;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ListIterator<",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5170\u5b50\u82cf\u4e16\u54f2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u5170\u54f2;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/typesafe/config/impl/SimpleConfigList;->value:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/List;->listIterator()Ljava/util/ListIterator;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, Lcom/typesafe/config/impl/SimpleConfigList;->wrapListIterator(Ljava/util/ListIterator;)Ljava/util/ListIterator;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public listIterator(I)Ljava/util/ListIterator;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/ListIterator<",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5170\u5b50\u82cf\u4e16\u54f2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u5170\u54f2;",
            ">;"
        }
    .end annotation

    .line 12
    iget-object p0, p0, Lcom/typesafe/config/impl/SimpleConfigList;->value:Ljava/util/List;

    invoke-interface {p0, p1}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object p0

    invoke-static {p0}, Lcom/typesafe/config/impl/SimpleConfigList;->wrapListIterator(Ljava/util/ListIterator;)Ljava/util/ListIterator;

    move-result-object p0

    return-object p0
.end method

.method public newCopy(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;)Lcom/typesafe/config/impl/SimpleConfigList;
    .locals 1

    .line 1
    new-instance v0, Lcom/typesafe/config/impl/SimpleConfigList;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/typesafe/config/impl/SimpleConfigList;->value:Ljava/util/List;

    .line 4
    .line 5
    invoke-direct {v0, p1, p0}, Lcom/typesafe/config/impl/SimpleConfigList;-><init>(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;Ljava/util/List;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public bridge synthetic newCopy(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;
    .locals 0

    .line 9
    invoke-virtual {p0, p1}, Lcom/typesafe/config/impl/SimpleConfigList;->newCopy(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;)Lcom/typesafe/config/impl/SimpleConfigList;

    move-result-object p0

    return-object p0
.end method

.method public relativized(Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;)Lcom/typesafe/config/impl/SimpleConfigList;
    .locals 1

    .line 1
    new-instance v0, Lcom/typesafe/config/impl/飘花落叶言子世楪哲兰苏;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lcom/typesafe/config/impl/飘花落叶言子世楪哲兰苏;-><init>(Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/typesafe/config/impl/SimpleConfigList;->resolveStatus()Lcom/typesafe/config/impl/ResolveStatus;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-direct {p0, v0, p1}, Lcom/typesafe/config/impl/SimpleConfigList;->modify(Lcom/typesafe/config/impl/飘花落叶言子楪世哲苏兰;Lcom/typesafe/config/impl/ResolveStatus;)Lcom/typesafe/config/impl/SimpleConfigList;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public bridge synthetic relativized(Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;
    .locals 0

    .line 15
    invoke-virtual {p0, p1}, Lcom/typesafe/config/impl/SimpleConfigList;->relativized(Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;)Lcom/typesafe/config/impl/SimpleConfigList;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic remove(I)Ljava/lang/Object;
    .locals 0

    .line 8
    invoke-virtual {p0, p1}, Lcom/typesafe/config/impl/SimpleConfigList;->remove(I)L飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世兰哲;

    move-result-object p0

    return-object p0
.end method

.method public remove(I)L飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世兰哲;
    .locals 0

    .line 9
    const-string p0, "remove"

    invoke-static {p0}, Lcom/typesafe/config/impl/SimpleConfigList;->weAreImmutable(Ljava/lang/String;)Ljava/lang/UnsupportedOperationException;

    move-result-object p0

    throw p0
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    const-string p0, "remove"

    .line 2
    .line 3
    invoke-static {p0}, Lcom/typesafe/config/impl/SimpleConfigList;->weAreImmutable(Ljava/lang/String;)Ljava/lang/UnsupportedOperationException;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    throw p0
.end method

.method public removeAll(Ljava/util/Collection;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    const-string p0, "removeAll"

    .line 2
    .line 3
    invoke-static {p0}, Lcom/typesafe/config/impl/SimpleConfigList;->weAreImmutable(Ljava/lang/String;)Ljava/lang/UnsupportedOperationException;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    throw p0
.end method

.method public render(Ljava/lang/StringBuilder;IZL飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世哲兰;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/typesafe/config/impl/SimpleConfigList;->value:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const-string p0, "[]"

    .line 10
    .line 11
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    const-string v0, "["

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget-boolean v0, p4, L飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰:Z

    .line 21
    .line 22
    const/16 v1, 0xa

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    :cond_1
    iget-object p0, p0, Lcom/typesafe/config/impl/SimpleConfigList;->value:Ljava/util/List;

    .line 30
    .line 31
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    :cond_2
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_7

    .line 40
    .line 41
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    check-cast v2, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 46
    .line 47
    iget-boolean v3, p4, L飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:Z

    .line 48
    .line 49
    const-string v4, "\n"

    .line 50
    .line 51
    if-eqz v3, :cond_4

    .line 52
    .line 53
    invoke-virtual {v2}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->origin()Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-virtual {v3}, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏哲兰()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-virtual {v3, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    array-length v5, v3

    .line 66
    const/4 v6, 0x0

    .line 67
    :goto_1
    if-ge v6, v5, :cond_4

    .line 68
    .line 69
    aget-object v7, v3, v6

    .line 70
    .line 71
    add-int/lit8 v8, p2, 0x1

    .line 72
    .line 73
    invoke-static {p1, v8, p4}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->indent(Ljava/lang/StringBuilder;IL飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世哲兰;)V

    .line 74
    .line 75
    .line 76
    const/16 v8, 0x23

    .line 77
    .line 78
    invoke-virtual {p1, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    .line 82
    .line 83
    .line 84
    move-result v8

    .line 85
    if-nez v8, :cond_3

    .line 86
    .line 87
    const/16 v8, 0x20

    .line 88
    .line 89
    invoke-virtual {p1, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    :cond_3
    invoke-virtual {p1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    add-int/lit8 v6, v6, 0x1

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_4
    iget-boolean v3, p4, L飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:Z

    .line 102
    .line 103
    if-eqz v3, :cond_6

    .line 104
    .line 105
    invoke-virtual {v2}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->origin()Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    iget-object v3, v3, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏世哲兰:Ljava/util/List;

    .line 110
    .line 111
    if-eqz v3, :cond_5

    .line 112
    .line 113
    invoke-static {v3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    goto :goto_2

    .line 118
    :cond_5
    sget-object v3, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 119
    .line 120
    :goto_2
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 125
    .line 126
    .line 127
    move-result v5

    .line 128
    if-eqz v5, :cond_6

    .line 129
    .line 130
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v5

    .line 134
    check-cast v5, Ljava/lang/String;

    .line 135
    .line 136
    add-int/lit8 v6, p2, 0x1

    .line 137
    .line 138
    invoke-static {p1, v6, p4}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->indent(Ljava/lang/StringBuilder;IL飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世哲兰;)V

    .line 139
    .line 140
    .line 141
    const-string v6, "# "

    .line 142
    .line 143
    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    goto :goto_3

    .line 153
    :cond_6
    add-int/lit8 v3, p2, 0x1

    .line 154
    .line 155
    invoke-static {p1, v3, p4}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->indent(Ljava/lang/StringBuilder;IL飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世哲兰;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v2, p1, v3, p3, p4}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->render(Ljava/lang/StringBuilder;IZL飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世哲兰;)V

    .line 159
    .line 160
    .line 161
    const-string v2, ","

    .line 162
    .line 163
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    if-eqz v0, :cond_2

    .line 167
    .line 168
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    goto/16 :goto_0

    .line 172
    .line 173
    :cond_7
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->length()I

    .line 174
    .line 175
    .line 176
    move-result p0

    .line 177
    add-int/lit8 p0, p0, -0x1

    .line 178
    .line 179
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 180
    .line 181
    .line 182
    if-eqz v0, :cond_8

    .line 183
    .line 184
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->length()I

    .line 185
    .line 186
    .line 187
    move-result p0

    .line 188
    add-int/lit8 p0, p0, -0x1

    .line 189
    .line 190
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    invoke-static {p1, p2, p4}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->indent(Ljava/lang/StringBuilder;IL飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世哲兰;)V

    .line 197
    .line 198
    .line 199
    :cond_8
    const-string p0, "]"

    .line 200
    .line 201
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    return-void
.end method

.method public replaceChild(Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;)Lcom/typesafe/config/impl/SimpleConfigList;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/typesafe/config/impl/SimpleConfigList;->value:Ljava/util/List;

    .line 2
    .line 3
    invoke-static {v0, p1, p2}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->replaceChildInList(Ljava/util/List;Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return-object p0

    .line 11
    :cond_0
    new-instance p2, Lcom/typesafe/config/impl/SimpleConfigList;

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->origin()Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-direct {p2, p0, p1}, Lcom/typesafe/config/impl/SimpleConfigList;-><init>(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;Ljava/util/List;)V

    .line 18
    .line 19
    .line 20
    return-object p2
.end method

.method public bridge synthetic replaceChild(Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;
    .locals 0

    .line 21
    invoke-virtual {p0, p1, p2}, Lcom/typesafe/config/impl/SimpleConfigList;->replaceChild(Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;)Lcom/typesafe/config/impl/SimpleConfigList;

    move-result-object p0

    return-object p0
.end method

.method public resolveStatus()Lcom/typesafe/config/impl/ResolveStatus;
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/typesafe/config/impl/SimpleConfigList;->resolved:Z

    .line 2
    .line 3
    invoke-static {p0}, Lcom/typesafe/config/impl/ResolveStatus;->fromBoolean(Z)Lcom/typesafe/config/impl/ResolveStatus;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public resolveSubstitutions(Lcom/typesafe/config/impl/飘花落叶言子楪兰世哲苏;Lcom/typesafe/config/impl/飘花落叶言子楪兰哲世苏;)Lcom/typesafe/config/impl/飘花落叶言子楪兰苏哲世;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/typesafe/config/impl/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u4e16\u54f2\u82cf;",
            "Lcom/typesafe/config/impl/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u54f2\u4e16\u82cf;",
            ")",
            "Lcom/typesafe/config/impl/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/typesafe/config/impl/SimpleConfigList;->resolved:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance p2, Lcom/typesafe/config/impl/飘花落叶言子楪兰苏哲世;

    .line 6
    .line 7
    invoke-direct {p2, p1, p0}, Lcom/typesafe/config/impl/飘花落叶言子楪兰苏哲世;-><init>(Lcom/typesafe/config/impl/飘花落叶言子楪兰世哲苏;Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;)V

    .line 8
    .line 9
    .line 10
    return-object p2

    .line 11
    :cond_0
    iget-object v0, p1, Lcom/typesafe/config/impl/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰:Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    new-instance p2, Lcom/typesafe/config/impl/飘花落叶言子楪兰苏哲世;

    .line 16
    .line 17
    invoke-direct {p2, p1, p0}, Lcom/typesafe/config/impl/飘花落叶言子楪兰苏哲世;-><init>(Lcom/typesafe/config/impl/飘花落叶言子楪兰世哲苏;Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;)V

    .line 18
    .line 19
    .line 20
    return-object p2

    .line 21
    :cond_1
    :try_start_0
    new-instance v0, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;

    .line 22
    .line 23
    invoke-virtual {p2, p0}, Lcom/typesafe/config/impl/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏哲兰(Lcom/typesafe/config/impl/飘花落叶言子楪苏兰世哲;)Lcom/typesafe/config/impl/飘花落叶言子楪兰哲世苏;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    const/16 v1, 0x15

    .line 28
    .line 29
    invoke-direct {v0, p1, v1, p2}, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p1, Lcom/typesafe/config/impl/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲:Lcom/typesafe/config/飘花落叶言子楪世苏哲兰;

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    sget-object p1, Lcom/typesafe/config/impl/ResolveStatus;->RESOLVED:Lcom/typesafe/config/impl/ResolveStatus;

    .line 38
    .line 39
    invoke-direct {p0, v0, p1}, Lcom/typesafe/config/impl/SimpleConfigList;->modifyMayThrow(Lcom/typesafe/config/impl/飘花落叶言子楪世苏兰哲;Lcom/typesafe/config/impl/ResolveStatus;)Lcom/typesafe/config/impl/SimpleConfigList;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    iget-object p1, v0, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p1, Lcom/typesafe/config/impl/飘花落叶言子楪兰世哲苏;

    .line 46
    .line 47
    new-instance p2, Lcom/typesafe/config/impl/飘花落叶言子楪兰苏哲世;

    .line 48
    .line 49
    invoke-direct {p2, p1, p0}, Lcom/typesafe/config/impl/飘花落叶言子楪兰苏哲世;-><init>(Lcom/typesafe/config/impl/飘花落叶言子楪兰世哲苏;Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;)V
    :try_end_0
    .catch Lcom/typesafe/config/impl/AbstractConfigValue$NotPossibleToResolve; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    .line 51
    .line 52
    return-object p2

    .line 53
    :catch_0
    move-exception p0

    .line 54
    new-instance p1, Lcom/typesafe/config/ConfigException$BugOrBroken;

    .line 55
    .line 56
    const-string p2, "unexpected checked exception"

    .line 57
    .line 58
    invoke-direct {p1, p2, p0}, Lcom/typesafe/config/ConfigException$BugOrBroken;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 59
    .line 60
    .line 61
    throw p1

    .line 62
    :catch_1
    move-exception p0

    .line 63
    throw p0

    .line 64
    :catch_2
    move-exception p0

    .line 65
    throw p0
.end method

.method public retainAll(Ljava/util/Collection;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    const-string p0, "retainAll"

    .line 2
    .line 3
    invoke-static {p0}, Lcom/typesafe/config/impl/SimpleConfigList;->weAreImmutable(Ljava/lang/String;)Ljava/lang/UnsupportedOperationException;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    throw p0
.end method

.method public bridge synthetic set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p2, L飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世兰哲;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/typesafe/config/impl/SimpleConfigList;->set(IL飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世兰哲;)L飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世兰哲;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public set(IL飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世兰哲;)L飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世兰哲;
    .locals 0

    .line 8
    const-string p0, "set"

    invoke-static {p0}, Lcom/typesafe/config/impl/SimpleConfigList;->weAreImmutable(Ljava/lang/String;)Ljava/lang/UnsupportedOperationException;

    move-result-object p0

    throw p0
.end method

.method public size()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/typesafe/config/impl/SimpleConfigList;->value:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public subList(II)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Ljava/util/List<",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5170\u5b50\u82cf\u4e16\u54f2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u5170\u54f2;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcom/typesafe/config/impl/SimpleConfigList;->value:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {p0, p1, p2}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    return-object v0
.end method

.method public toArray()[Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/typesafe/config/impl/SimpleConfigList;->value:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/List;->toArray()[Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)[TT;"
        }
    .end annotation

    .line 8
    iget-object p0, p0, Lcom/typesafe/config/impl/SimpleConfigList;->value:Ljava/util/List;

    invoke-interface {p0, p1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic unwrapped()Ljava/lang/Object;
    .locals 0

    .line 33
    invoke-virtual {p0}, Lcom/typesafe/config/impl/SimpleConfigList;->unwrapped()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public unwrapped()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcom/typesafe/config/impl/SimpleConfigList;->value:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 23
    .line 24
    invoke-interface {v1}, L飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世兰哲;->unwrapped()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    return-object v0
.end method

.method public valueType()Lcom/typesafe/config/ConfigValueType;
    .locals 0

    .line 1
    sget-object p0, Lcom/typesafe/config/ConfigValueType;->LIST:Lcom/typesafe/config/ConfigValueType;

    .line 2
    .line 3
    return-object p0
.end method

.method public withOrigin(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;)Lcom/typesafe/config/impl/SimpleConfigList;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->withOrigin(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/typesafe/config/impl/SimpleConfigList;

    .line 6
    .line 7
    return-object p0
.end method

.method public bridge synthetic withOrigin(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;
    .locals 0

    .line 10
    invoke-virtual {p0, p1}, Lcom/typesafe/config/impl/SimpleConfigList;->withOrigin(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;)Lcom/typesafe/config/impl/SimpleConfigList;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic withOrigin(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;)L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世苏兰哲;
    .locals 0

    .line 8
    invoke-virtual {p0, p1}, Lcom/typesafe/config/impl/SimpleConfigList;->withOrigin(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;)Lcom/typesafe/config/impl/SimpleConfigList;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic withOrigin(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;)L飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世兰哲;
    .locals 0

    .line 9
    invoke-virtual {p0, p1}, Lcom/typesafe/config/impl/SimpleConfigList;->withOrigin(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;)Lcom/typesafe/config/impl/SimpleConfigList;

    move-result-object p0

    return-object p0
.end method
