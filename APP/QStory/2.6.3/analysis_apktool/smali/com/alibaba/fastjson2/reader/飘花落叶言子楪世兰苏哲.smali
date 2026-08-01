.class public final Lcom/alibaba/fastjson2/reader/飘花落叶言子楪世兰苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final 飘花落叶言子楪兰世哲苏:[J

.field public final 飘花落叶言子楪兰世苏哲:[Ljava/lang/String;

.field public final 飘花落叶言子楪哲兰世苏:Ljava/util/function/Function;

.field public final 飘花落叶言子楪哲兰苏世:Ljava/util/function/BiFunction;

.field public final 飘花落叶言子楪哲苏兰世:Ljava/lang/reflect/Method;


# direct methods
.method public varargs constructor <init>(Ljava/lang/reflect/Method;[Ljava/lang/String;)V
    .locals 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:Ljava/lang/reflect/Method;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/reflect/Executable;->getParameters()[Ljava/lang/reflect/Parameter;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    array-length v1, v0

    .line 11
    new-array v1, v1, [Ljava/lang/String;

    .line 12
    .line 13
    iput-object v1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世苏哲:[Ljava/lang/String;

    .line 14
    .line 15
    array-length v1, v0

    .line 16
    new-array v1, v1, [J

    .line 17
    .line 18
    iput-object v1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世哲苏:[J

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    :goto_0
    array-length v2, v0

    .line 22
    if-ge v1, v2, :cond_1

    .line 23
    .line 24
    array-length v2, p2

    .line 25
    if-ge v1, v2, :cond_0

    .line 26
    .line 27
    aget-object v2, p2, v1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    aget-object v2, v0, v1

    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/lang/reflect/Parameter;->getName()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    :goto_1
    aput-object v2, p2, v1

    .line 37
    .line 38
    iget-object v3, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世哲苏:[J

    .line 39
    .line 40
    invoke-static {v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)J

    .line 41
    .line 42
    .line 43
    move-result-wide v4

    .line 44
    aput-wide v4, v3, v1

    .line 45
    .line 46
    add-int/lit8 v1, v1, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    sget-boolean p2, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪世苏兰哲:Z

    .line 50
    .line 51
    const/4 v0, 0x0

    .line 52
    if-eqz p2, :cond_3

    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterCount()I

    .line 55
    .line 56
    .line 57
    move-result p2

    .line 58
    const/4 v1, 0x1

    .line 59
    if-ne p2, v1, :cond_2

    .line 60
    .line 61
    invoke-static {p1}, L飘花落叶言楪子哲苏世兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/reflect/Method;)Ljava/util/function/Function;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    move-object v6, v0

    .line 66
    move-object v0, p1

    .line 67
    move-object p1, v6

    .line 68
    goto :goto_2

    .line 69
    :cond_2
    const/4 v1, 0x2

    .line 70
    if-ne p2, v1, :cond_3

    .line 71
    .line 72
    invoke-static {p1}, L飘花落叶言楪子哲苏世兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/reflect/Method;)Ljava/util/function/BiFunction;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    goto :goto_2

    .line 77
    :cond_3
    move-object p1, v0

    .line 78
    :goto_2
    iput-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/util/function/Function;

    .line 79
    .line 80
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/util/function/BiFunction;

    .line 81
    .line 82
    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    check-cast p1, Ljava/util/Map;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世哲苏:[J

    .line 5
    .line 6
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/util/function/Function;

    .line 7
    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    aget-wide v0, v1, v0

    .line 11
    .line 12
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-interface {p1, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-interface {v2, p0}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0

    .line 25
    :cond_0
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/util/function/BiFunction;

    .line 26
    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    aget-wide v3, v1, v0

    .line 30
    .line 31
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-interface {p1, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    const/4 v0, 0x1

    .line 40
    aget-wide v0, v1, v0

    .line 41
    .line 42
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-interface {v2, p0, p1}, Ljava/util/function/BiFunction;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0

    .line 55
    :cond_1
    array-length v2, v1

    .line 56
    new-array v3, v2, [Ljava/lang/Object;

    .line 57
    .line 58
    :goto_0
    if-ge v0, v2, :cond_2

    .line 59
    .line 60
    aget-wide v4, v1, v0

    .line 61
    .line 62
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    invoke-interface {p1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    aput-object v4, v3, v0

    .line 71
    .line 72
    add-int/lit8 v0, v0, 0x1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_2
    const/4 p1, 0x0

    .line 76
    :try_start_0
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:Ljava/lang/reflect/Method;

    .line 77
    .line 78
    invoke-virtual {p0, p1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 82
    return-object p0

    .line 83
    :catch_0
    move-exception p0

    .line 84
    goto :goto_1

    .line 85
    :catch_1
    move-exception p0

    .line 86
    goto :goto_1

    .line 87
    :catch_2
    move-exception p0

    .line 88
    :goto_1
    const-string v0, "invoke factoryMethod error"

    .line 89
    .line 90
    invoke-static {v0, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 91
    .line 92
    .line 93
    return-object p1
.end method
