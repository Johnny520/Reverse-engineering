.class final Lcom/alibaba/fastjson2/reader/FactoryFunction;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/function/Function;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/function/Function<",
        "Ljava/util/Map<",
        "Ljava/lang/Long;",
        "Ljava/lang/Object;",
        ">;TT;>;"
    }
.end annotation


# instance fields
.field final biFunction:Ljava/util/function/BiFunction;

.field final factoryMethod:Ljava/lang/reflect/Method;

.field final function:Ljava/util/function/Function;

.field final hashCodes:[J

.field final paramNames:[Ljava/lang/String;


# direct methods
.method public varargs constructor <init>(Ljava/lang/reflect/Method;[Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/FactoryFunction;->factoryMethod:Ljava/lang/reflect/Method;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    array-length v0, p1

    .line 11
    new-array v0, v0, [Ljava/lang/String;

    .line 12
    .line 13
    iput-object v0, p0, Lcom/alibaba/fastjson2/reader/FactoryFunction;->paramNames:[Ljava/lang/String;

    .line 14
    .line 15
    array-length v0, p1

    .line 16
    new-array v0, v0, [J

    .line 17
    .line 18
    iput-object v0, p0, Lcom/alibaba/fastjson2/reader/FactoryFunction;->hashCodes:[J

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    :goto_0
    array-length v1, p1

    .line 22
    const/4 v2, 0x0

    .line 23
    if-ge v0, v1, :cond_2

    .line 24
    .line 25
    array-length v1, p2

    .line 26
    if-ge v0, v1, :cond_0

    .line 27
    .line 28
    aget-object v2, p2, v0

    .line 29
    .line 30
    :cond_0
    if-nez v2, :cond_1

    .line 31
    .line 32
    const-string v1, "arg"

    .line 33
    .line 34
    invoke-static {v0, v1}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    :cond_1
    aput-object v2, p2, v0

    .line 39
    .line 40
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/FactoryFunction;->hashCodes:[J

    .line 41
    .line 42
    invoke-static {v2}, Lcom/alibaba/fastjson2/util/Fnv;->hashCode64(Ljava/lang/String;)J

    .line 43
    .line 44
    .line 45
    move-result-wide v2

    .line 46
    aput-wide v2, v1, v0

    .line 47
    .line 48
    add-int/lit8 v0, v0, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    iput-object v2, p0, Lcom/alibaba/fastjson2/reader/FactoryFunction;->function:Ljava/util/function/Function;

    .line 52
    .line 53
    iput-object v2, p0, Lcom/alibaba/fastjson2/reader/FactoryFunction;->biFunction:Ljava/util/function/BiFunction;

    .line 54
    .line 55
    return-void
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 103
    check-cast p1, Ljava/util/Map;

    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/reader/FactoryFunction;->apply(Ljava/util/Map;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public apply(Ljava/util/Map;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Ljava/lang/Object;",
            ">;)TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/FactoryFunction;->function:Ljava/util/function/Function;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/FactoryFunction;->hashCodes:[J

    .line 7
    .line 8
    aget-wide v1, v0, v1

    .line 9
    .line 10
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/FactoryFunction;->function:Ljava/util/function/Function;

    .line 19
    .line 20
    invoke-interface {v0, p1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    return-object p1

    .line 25
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/FactoryFunction;->biFunction:Ljava/util/function/BiFunction;

    .line 26
    .line 27
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/FactoryFunction;->hashCodes:[J

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    aget-wide v0, v2, v1

    .line 32
    .line 33
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/FactoryFunction;->hashCodes:[J

    .line 42
    .line 43
    const/4 v2, 0x1

    .line 44
    aget-wide v2, v1, v2

    .line 45
    .line 46
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/FactoryFunction;->biFunction:Ljava/util/function/BiFunction;

    .line 55
    .line 56
    invoke-interface {v1, v0, p1}, Ljava/util/function/BiFunction;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    return-object p1

    .line 61
    :cond_1
    array-length v0, v2

    .line 62
    new-array v2, v0, [Ljava/lang/Object;

    .line 63
    .line 64
    :goto_0
    if-ge v1, v0, :cond_2

    .line 65
    .line 66
    iget-object v3, p0, Lcom/alibaba/fastjson2/reader/FactoryFunction;->hashCodes:[J

    .line 67
    .line 68
    aget-wide v4, v3, v1

    .line 69
    .line 70
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    aput-object v3, v2, v1

    .line 79
    .line 80
    add-int/lit8 v1, v1, 0x1

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_2
    :try_start_0
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/FactoryFunction;->factoryMethod:Ljava/lang/reflect/Method;

    .line 84
    .line 85
    const/4 v0, 0x0

    .line 86
    invoke-virtual {p1, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 90
    return-object p1

    .line 91
    :catch_0
    move-exception p1

    .line 92
    goto :goto_1

    .line 93
    :catch_1
    move-exception p1

    .line 94
    goto :goto_1

    .line 95
    :catch_2
    move-exception p1

    .line 96
    :goto_1
    const-string v0, "invoke factoryMethod error"

    .line 97
    .line 98
    invoke-static {v0, p1}, Lah/a;->x(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 99
    .line 100
    .line 101
    const/4 p1, 0x0

    .line 102
    return-object p1
.end method
