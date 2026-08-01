.class public Lcom/alibaba/fastjson2/JSONArray;
.super Ljava/util/ArrayList;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/ArrayList<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field static arrayWriter:L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰楪哲世; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5b50\u5170\u82cf\u4e16\u54f2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u5170\u696a\u54f2\u4e16;"
        }
    .end annotation
.end field

.field private static final serialVersionUID:J = 0x1L


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 13
    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Ljava/util/Collection;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "*>;)V"
        }
    .end annotation

    .line 14
    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-void
.end method

.method public varargs constructor <init>([Ljava/lang/Object;)V
    .locals 1

    .line 1
    array-length v0, p1

    .line 2
    invoke-direct {p0, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 3
    .line 4
    .line 5
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-super {p0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public static copyOf(Ljava/util/Collection;)Lcom/alibaba/fastjson2/JSONArray;
    .locals 1

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/JSONArray;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/alibaba/fastjson2/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static from(Ljava/lang/Object;)Lcom/alibaba/fastjson2/JSONArray;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;[Lcom/alibaba/fastjson2/JSONWriter$Feature;)Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    check-cast p0, Lcom/alibaba/fastjson2/JSONArray;

    .line 7
    .line 8
    return-object p0
.end method

.method public static varargs from(Ljava/lang/Object;[Lcom/alibaba/fastjson2/JSONWriter$Feature;)Lcom/alibaba/fastjson2/JSONArray;
    .locals 0

    .line 9
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;[Lcom/alibaba/fastjson2/JSONWriter$Feature;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/alibaba/fastjson2/JSONArray;

    return-object p0
.end method

.method public static of(Ljava/lang/Object;)Lcom/alibaba/fastjson2/JSONArray;
    .locals 2

    .line 17
    new-instance v0, Lcom/alibaba/fastjson2/JSONArray;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/alibaba/fastjson2/JSONArray;-><init>(I)V

    .line 18
    invoke-virtual {v0, p0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public static of(Ljava/lang/Object;Ljava/lang/Object;)Lcom/alibaba/fastjson2/JSONArray;
    .locals 2

    .line 19
    new-instance v0, Lcom/alibaba/fastjson2/JSONArray;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lcom/alibaba/fastjson2/JSONArray;-><init>(I)V

    .line 20
    invoke-virtual {v0, p0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 21
    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public static of(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/alibaba/fastjson2/JSONArray;
    .locals 2

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/JSONArray;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, v1}, Lcom/alibaba/fastjson2/JSONArray;-><init>(I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public static varargs of([Ljava/lang/Object;)Lcom/alibaba/fastjson2/JSONArray;
    .locals 1

    .line 22
    new-instance v0, Lcom/alibaba/fastjson2/JSONArray;

    invoke-direct {v0, p0}, Lcom/alibaba/fastjson2/JSONArray;-><init>([Ljava/lang/Object;)V

    return-object v0
.end method

.method public static varargs parse(Ljava/lang/String;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Lcom/alibaba/fastjson2/JSONArray;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Lcom/alibaba/fastjson2/JSONArray;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static varargs parseArray(Ljava/lang/String;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Lcom/alibaba/fastjson2/JSONArray;
    .locals 0

    .line 79
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Lcom/alibaba/fastjson2/JSONArray;

    move-result-object p0

    return-object p0
.end method

.method public static parseArray(Ljava/lang/String;Ljava/lang/Class;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    .line 1
    if-eqz p0, :cond_4

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_4

    .line 10
    :cond_0
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰()Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子苏世兰哲(Ljava/lang/String;Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;)Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子哲苏世兰(Ljava/lang/reflect/Type;)Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲兰苏世:Ljava/util/ArrayList;

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲世苏兰楪(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception p1

    .line 31
    goto :goto_2

    .line 32
    :cond_1
    :goto_0
    iget-char v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 33
    .line 34
    const/16 v2, 0x1a

    .line 35
    .line 36
    if-eq v1, v2, :cond_3

    .line 37
    .line 38
    iget-wide v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 39
    .line 40
    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 41
    .line 42
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 43
    .line 44
    and-long/2addr v0, v2

    .line 45
    const-wide/16 v2, 0x0

    .line 46
    .line 47
    cmp-long v0, v0, v2

    .line 48
    .line 49
    if-eqz v0, :cond_2

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_2
    new-instance p1, Lcom/alibaba/fastjson2/JSONException;

    .line 53
    .line 54
    const-string v0, "input not end"

    .line 55
    .line 56
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏楪兰世(Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-direct {p1, v0}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    :cond_3
    :goto_1
    invoke-interface {p0}, Ljava/io/Closeable;->close()V

    .line 65
    .line 66
    .line 67
    return-object p1

    .line 68
    :goto_2
    :try_start_1
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 69
    .line 70
    .line 71
    goto :goto_3

    .line 72
    :catchall_1
    move-exception p0

    .line 73
    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 74
    .line 75
    .line 76
    :goto_3
    throw p1

    .line 77
    :cond_4
    :goto_4
    const/4 p0, 0x0

    .line 78
    return-object p0
.end method

.method public static varargs parseArray(Ljava/lang/String;Ljava/lang/Class;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TT;>;[",
            "Lcom/alibaba/fastjson2/JSONReader$Feature;",
            ")",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    if-eqz p0, :cond_4

    .line 80
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_4

    .line 81
    :cond_0
    invoke-static {p2}, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲([Lcom/alibaba/fastjson2/JSONReader$Feature;)Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    move-result-object p2

    .line 82
    invoke-static {p0, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子苏世兰哲(Ljava/lang/String;Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;)Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;

    move-result-object p0

    .line 83
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子哲苏世兰(Ljava/lang/reflect/Type;)Ljava/util/List;

    move-result-object p1

    .line 84
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲兰苏世:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    .line 85
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲世苏兰楪(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    .line 86
    :cond_1
    :goto_0
    iget-char v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    const/16 v1, 0x1a

    if-eq v0, v1, :cond_3

    iget-wide v0, p2, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    sget-object p2, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreCheckClose:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v2, p2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long p2, v0, v2

    if-eqz p2, :cond_2

    goto :goto_1

    .line 87
    :cond_2
    new-instance p1, Lcom/alibaba/fastjson2/JSONException;

    const-string p2, "input not end"

    invoke-virtual {p0, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏楪兰世(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 88
    :cond_3
    :goto_1
    invoke-interface {p0}, Ljava/io/Closeable;->close()V

    return-object p1

    .line 89
    :goto_2
    :try_start_1
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception p0

    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p1

    :cond_4
    :goto_4
    const/4 p0, 0x0

    return-object p0
.end method

.method public static varargs toJSONString(Ljava/lang/Object;[Lcom/alibaba/fastjson2/JSONWriter$Feature;)Ljava/lang/String;
    .locals 0

    .line 6
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;[Lcom/alibaba/fastjson2/JSONWriter$Feature;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public addArray()Lcom/alibaba/fastjson2/JSONArray;
    .locals 1

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/JSONArray;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/alibaba/fastjson2/JSONArray;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public addObject()Lcom/alibaba/fastjson2/JSONObject;
    .locals 1

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/alibaba/fastjson2/JSONObject;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public clone()Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/JSONArray;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/alibaba/fastjson2/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public fluentAdd(Ljava/lang/Object;)Lcom/alibaba/fastjson2/JSONArray;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    return-object p0
.end method

.method public fluentAddAll(Ljava/util/Collection;)Lcom/alibaba/fastjson2/JSONArray;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "*>;)",
            "Lcom/alibaba/fastjson2/JSONArray;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 2
    .line 3
    .line 4
    return-object p0
.end method

.method public fluentClear()Lcom/alibaba/fastjson2/JSONArray;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->clear()V

    .line 2
    .line 3
    .line 4
    return-object p0
.end method

.method public fluentRemove(I)Lcom/alibaba/fastjson2/JSONArray;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ljava/util/AbstractList;->remove(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    return-object p0
.end method

.method public fluentRemove(Ljava/lang/Object;)Lcom/alibaba/fastjson2/JSONArray;
    .locals 0

    .line 5
    invoke-virtual {p0, p1}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public fluentRemoveAll(Ljava/util/Collection;)Lcom/alibaba/fastjson2/JSONArray;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "*>;)",
            "Lcom/alibaba/fastjson2/JSONArray;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Ljava/util/AbstractCollection;->removeAll(Ljava/util/Collection;)Z

    .line 2
    .line 3
    .line 4
    return-object p0
.end method

.method public fluentSet(ILjava/lang/Object;)Lcom/alibaba/fastjson2/JSONArray;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/alibaba/fastjson2/JSONArray;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    return-object p0
.end method

.method public getBigDecimal(I)Ljava/math/BigDecimal;
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 p1, 0x0

    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    return-object p1

    .line 9
    :cond_0
    instance-of v0, p0, Ljava/lang/Number;

    .line 10
    .line 11
    if-eqz v0, :cond_5

    .line 12
    .line 13
    instance-of p1, p0, Ljava/math/BigDecimal;

    .line 14
    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    check-cast p0, Ljava/math/BigDecimal;

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_1
    instance-of p1, p0, Ljava/math/BigInteger;

    .line 21
    .line 22
    if-eqz p1, :cond_2

    .line 23
    .line 24
    new-instance p1, Ljava/math/BigDecimal;

    .line 25
    .line 26
    check-cast p0, Ljava/math/BigInteger;

    .line 27
    .line 28
    invoke-direct {p1, p0}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;)V

    .line 29
    .line 30
    .line 31
    return-object p1

    .line 32
    :cond_2
    instance-of p1, p0, Ljava/lang/Float;

    .line 33
    .line 34
    if-eqz p1, :cond_3

    .line 35
    .line 36
    check-cast p0, Ljava/lang/Float;

    .line 37
    .line 38
    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    sget-object p1, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/Class;

    .line 43
    .line 44
    const/16 p1, 0xf

    .line 45
    .line 46
    new-array p1, p1, [B

    .line 47
    .line 48
    const/4 v0, 0x0

    .line 49
    invoke-static {p1, v0, p0}, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪苏哲世兰([BIF)I

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    invoke-static {v0, p1, p0}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪兰苏哲世(I[BI)Ljava/math/BigDecimal;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0

    .line 58
    :cond_3
    instance-of p1, p0, Ljava/lang/Double;

    .line 59
    .line 60
    if-eqz p1, :cond_4

    .line 61
    .line 62
    check-cast p0, Ljava/lang/Double;

    .line 63
    .line 64
    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    .line 65
    .line 66
    .line 67
    move-result-wide p0

    .line 68
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世楪苏哲兰(D)Ljava/math/BigDecimal;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    return-object p0

    .line 73
    :cond_4
    check-cast p0, Ljava/lang/Number;

    .line 74
    .line 75
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 76
    .line 77
    .line 78
    move-result-wide p0

    .line 79
    invoke-static {p0, p1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    return-object p0

    .line 84
    :cond_5
    instance-of v0, p0, Ljava/lang/String;

    .line 85
    .line 86
    if-eqz v0, :cond_6

    .line 87
    .line 88
    check-cast p0, Ljava/lang/String;

    .line 89
    .line 90
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-static {p0}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世楪哲苏兰(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    return-object p0

    .line 99
    :cond_6
    instance-of v0, p0, Ljava/lang/Boolean;

    .line 100
    .line 101
    if-eqz v0, :cond_8

    .line 102
    .line 103
    check-cast p0, Ljava/lang/Boolean;

    .line 104
    .line 105
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 106
    .line 107
    .line 108
    move-result p0

    .line 109
    if-eqz p0, :cond_7

    .line 110
    .line 111
    sget-object p0, Ljava/math/BigDecimal;->ONE:Ljava/math/BigDecimal;

    .line 112
    .line 113
    return-object p0

    .line 114
    :cond_7
    sget-object p0, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 115
    .line 116
    return-object p0

    .line 117
    :cond_8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 118
    .line 119
    const-string v1, "Can not cast \'"

    .line 120
    .line 121
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    const-string v1, "\' to BigDecimal"

    .line 125
    .line 126
    invoke-static {p0, v1, v0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    return-object p1
.end method

.method public getBigInteger(I)Ljava/math/BigInteger;
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 p1, 0x0

    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    return-object p1

    .line 9
    :cond_0
    instance-of v0, p0, Ljava/lang/Number;

    .line 10
    .line 11
    if-eqz v0, :cond_3

    .line 12
    .line 13
    instance-of p1, p0, Ljava/math/BigInteger;

    .line 14
    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    check-cast p0, Ljava/math/BigInteger;

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_1
    instance-of p1, p0, Ljava/math/BigDecimal;

    .line 21
    .line 22
    if-eqz p1, :cond_2

    .line 23
    .line 24
    check-cast p0, Ljava/math/BigDecimal;

    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/math/BigDecimal;->toBigInteger()Ljava/math/BigInteger;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :cond_2
    check-cast p0, Ljava/lang/Number;

    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 34
    .line 35
    .line 36
    move-result-wide p0

    .line 37
    invoke-static {p0, p1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0

    .line 42
    :cond_3
    instance-of v0, p0, Ljava/lang/String;

    .line 43
    .line 44
    if-eqz v0, :cond_6

    .line 45
    .line 46
    check-cast p0, Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-nez v0, :cond_5

    .line 57
    .line 58
    const-string v0, "null"

    .line 59
    .line 60
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_4

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_4
    new-instance p1, Ljava/math/BigInteger;

    .line 68
    .line 69
    invoke-direct {p1, p0}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    :cond_5
    :goto_0
    return-object p1

    .line 73
    :cond_6
    instance-of v0, p0, Ljava/lang/Boolean;

    .line 74
    .line 75
    if-eqz v0, :cond_8

    .line 76
    .line 77
    check-cast p0, Ljava/lang/Boolean;

    .line 78
    .line 79
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 80
    .line 81
    .line 82
    move-result p0

    .line 83
    if-eqz p0, :cond_7

    .line 84
    .line 85
    sget-object p0, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;

    .line 86
    .line 87
    return-object p0

    .line 88
    :cond_7
    sget-object p0, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    .line 89
    .line 90
    return-object p0

    .line 91
    :cond_8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 92
    .line 93
    const-string v1, "Can not cast \'"

    .line 94
    .line 95
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    const-string v1, "\' to BigInteger"

    .line 99
    .line 100
    invoke-static {p0, v1, v0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    return-object p1
.end method

.method public getBoolean(I)Ljava/lang/Boolean;
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 p1, 0x0

    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    return-object p1

    .line 9
    :cond_0
    instance-of v0, p0, Ljava/lang/Boolean;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    check-cast p0, Ljava/lang/Boolean;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_1
    instance-of v0, p0, Ljava/lang/Number;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    const/4 v2, 0x1

    .line 20
    if-eqz v0, :cond_3

    .line 21
    .line 22
    check-cast p0, Ljava/lang/Number;

    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    if-ne p0, v2, :cond_2

    .line 29
    .line 30
    move v1, v2

    .line 31
    :cond_2
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :cond_3
    instance-of v0, p0, Ljava/lang/String;

    .line 37
    .line 38
    if-eqz v0, :cond_8

    .line 39
    .line 40
    check-cast p0, Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-nez v0, :cond_7

    .line 47
    .line 48
    const-string v0, "null"

    .line 49
    .line 50
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_4

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_4
    const-string p1, "true"

    .line 58
    .line 59
    invoke-virtual {p1, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    if-nez p1, :cond_5

    .line 64
    .line 65
    const-string p1, "1"

    .line 66
    .line 67
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    if-eqz p0, :cond_6

    .line 72
    .line 73
    :cond_5
    move v1, v2

    .line 74
    :cond_6
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    return-object p0

    .line 79
    :cond_7
    :goto_0
    return-object p1

    .line 80
    :cond_8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 81
    .line 82
    const-string v1, "Can not cast \'"

    .line 83
    .line 84
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    const-string v1, "\' to boolean"

    .line 88
    .line 89
    invoke-static {p0, v1, v0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    return-object p1
.end method

.method public getBooleanValue(I)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONArray;->getBoolean(I)Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0
.end method

.method public getByte(I)Ljava/lang/Byte;
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 p1, 0x0

    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    return-object p1

    .line 9
    :cond_0
    instance-of v0, p0, Ljava/lang/Number;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    check-cast p0, Ljava/lang/Number;

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Number;->byteValue()B

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :cond_1
    instance-of v0, p0, Ljava/lang/String;

    .line 25
    .line 26
    if-eqz v0, :cond_4

    .line 27
    .line 28
    check-cast p0, Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-nez v0, :cond_3

    .line 39
    .line 40
    const-string v0, "null"

    .line 41
    .line 42
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    invoke-static {p0}, Ljava/lang/Byte;->parseByte(Ljava/lang/String;)B

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0

    .line 58
    :cond_3
    :goto_0
    return-object p1

    .line 59
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    const-string v1, "Can not cast \'"

    .line 62
    .line 63
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    const-string v1, "\' to byte"

    .line 67
    .line 68
    invoke-static {p0, v1, v0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    return-object p1
.end method

.method public getByteValue(I)B
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONArray;->getByte(I)Ljava/lang/Byte;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return p0

    .line 9
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Byte;->byteValue()B

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public getDate(I)Ljava/util/Date;
    .locals 4

    .line 1
    invoke-virtual {p0, p1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 p1, 0x0

    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    return-object p1

    .line 9
    :cond_0
    instance-of v0, p0, Ljava/util/Date;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    check-cast p0, Ljava/util/Date;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_1
    instance-of v0, p0, Ljava/lang/String;

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    check-cast p0, Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {p0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲世兰苏(Ljava/lang/String;)Ljava/util/Date;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :cond_2
    instance-of v0, p0, Ljava/lang/Number;

    .line 28
    .line 29
    if-eqz v0, :cond_4

    .line 30
    .line 31
    check-cast p0, Ljava/lang/Number;

    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    const-wide/16 v2, 0x0

    .line 38
    .line 39
    cmp-long p0, v0, v2

    .line 40
    .line 41
    if-nez p0, :cond_3

    .line 42
    .line 43
    return-object p1

    .line 44
    :cond_3
    new-instance p0, Ljava/util/Date;

    .line 45
    .line 46
    invoke-direct {p0, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 47
    .line 48
    .line 49
    return-object p0

    .line 50
    :cond_4
    invoke-static {p0}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世苏哲楪兰(Ljava/lang/Object;)Ljava/util/Date;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0
.end method

.method public getDate(ILjava/util/Date;)Ljava/util/Date;
    .locals 0

    .line 55
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONArray;->getDate(I)Ljava/util/Date;

    move-result-object p0

    if-nez p0, :cond_0

    return-object p2

    :cond_0
    return-object p0
.end method

.method public getDouble(I)Ljava/lang/Double;
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 p1, 0x0

    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    return-object p1

    .line 9
    :cond_0
    instance-of v0, p0, Ljava/lang/Double;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    check-cast p0, Ljava/lang/Double;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_1
    instance-of v0, p0, Ljava/lang/Number;

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    check-cast p0, Ljava/lang/Number;

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Number;->doubleValue()D

    .line 23
    .line 24
    .line 25
    move-result-wide p0

    .line 26
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :cond_2
    instance-of v0, p0, Ljava/lang/String;

    .line 32
    .line 33
    if-eqz v0, :cond_5

    .line 34
    .line 35
    check-cast p0, Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-nez v0, :cond_4

    .line 46
    .line 47
    const-string v0, "null"

    .line 48
    .line 49
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_3

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_3
    invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 57
    .line 58
    .line 59
    move-result-wide p0

    .line 60
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0

    .line 65
    :cond_4
    :goto_0
    return-object p1

    .line 66
    :cond_5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    const-string v1, "Can not cast \'"

    .line 69
    .line 70
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    const-string v1, "\' to double"

    .line 74
    .line 75
    invoke-static {p0, v1, v0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    return-object p1
.end method

.method public getDoubleValue(I)D
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONArray;->getDouble(I)Ljava/lang/Double;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    const-wide/16 p0, 0x0

    .line 8
    .line 9
    return-wide p0

    .line 10
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    .line 11
    .line 12
    .line 13
    move-result-wide p0

    .line 14
    return-wide p0
.end method

.method public getFloat(I)Ljava/lang/Float;
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 p1, 0x0

    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    return-object p1

    .line 9
    :cond_0
    instance-of v0, p0, Ljava/lang/Float;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    check-cast p0, Ljava/lang/Float;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_1
    instance-of v0, p0, Ljava/lang/Number;

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    check-cast p0, Ljava/lang/Number;

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :cond_2
    instance-of v0, p0, Ljava/lang/String;

    .line 32
    .line 33
    if-eqz v0, :cond_5

    .line 34
    .line 35
    check-cast p0, Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-nez v0, :cond_4

    .line 46
    .line 47
    const-string v0, "null"

    .line 48
    .line 49
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_3

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_3
    invoke-static {p0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0

    .line 65
    :cond_4
    :goto_0
    return-object p1

    .line 66
    :cond_5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    const-string v1, "Can not cast \'"

    .line 69
    .line 70
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    const-string v1, "\' to float"

    .line 74
    .line 75
    invoke-static {p0, v1, v0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    return-object p1
.end method

.method public getFloatValue(I)F
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONArray;->getFloat(I)Ljava/lang/Float;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return p0

    .line 9
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public getInstant(I)Ljava/time/Instant;
    .locals 4

    .line 1
    invoke-virtual {p0, p1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 p1, 0x0

    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    return-object p1

    .line 9
    :cond_0
    instance-of v0, p0, Ljava/time/Instant;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    check-cast p0, Ljava/time/Instant;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_1
    instance-of v0, p0, Ljava/lang/Number;

    .line 17
    .line 18
    if-eqz v0, :cond_3

    .line 19
    .line 20
    check-cast p0, Ljava/lang/Number;

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 23
    .line 24
    .line 25
    move-result-wide v0

    .line 26
    const-wide/16 v2, 0x0

    .line 27
    .line 28
    cmp-long p0, v0, v2

    .line 29
    .line 30
    if-nez p0, :cond_2

    .line 31
    .line 32
    return-object p1

    .line 33
    :cond_2
    invoke-static {v0, v1}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    :cond_3
    invoke-static {p0}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世哲楪兰苏(Ljava/lang/Object;)Ljava/time/Instant;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
.end method

.method public getIntValue(I)I
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 p1, 0x0

    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    return p1

    .line 9
    :cond_0
    instance-of v0, p0, Ljava/lang/Number;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    check-cast p0, Ljava/lang/Number;

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    :cond_1
    instance-of v0, p0, Ljava/lang/String;

    .line 21
    .line 22
    if-eqz v0, :cond_5

    .line 23
    .line 24
    check-cast p0, Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_4

    .line 35
    .line 36
    const-string v0, "null"

    .line 37
    .line 38
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    const/16 p1, 0x2e

    .line 46
    .line 47
    invoke-virtual {p0, p1}, Ljava/lang/String;->indexOf(I)I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    const/4 v0, -0x1

    .line 52
    if-eq p1, v0, :cond_3

    .line 53
    .line 54
    invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 55
    .line 56
    .line 57
    move-result-wide p0

    .line 58
    double-to-int p0, p0

    .line 59
    return p0

    .line 60
    :cond_3
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    return p0

    .line 65
    :cond_4
    :goto_0
    return p1

    .line 66
    :cond_5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    const-string v1, "Can not cast \'"

    .line 69
    .line 70
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    const-string v1, "\' to int value"

    .line 74
    .line 75
    invoke-static {p0, v1, v0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    return p1
.end method

.method public getInteger(I)Ljava/lang/Integer;
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 p1, 0x0

    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    return-object p1

    .line 9
    :cond_0
    instance-of v0, p0, Ljava/lang/Integer;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    check-cast p0, Ljava/lang/Integer;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_1
    instance-of v0, p0, Ljava/lang/Number;

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    check-cast p0, Ljava/lang/Number;

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :cond_2
    instance-of v0, p0, Ljava/lang/String;

    .line 32
    .line 33
    if-eqz v0, :cond_6

    .line 34
    .line 35
    check-cast p0, Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-nez v0, :cond_5

    .line 46
    .line 47
    const-string v0, "null"

    .line 48
    .line 49
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_3

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_3
    const/16 p1, 0x2e

    .line 57
    .line 58
    invoke-virtual {p0, p1}, Ljava/lang/String;->indexOf(I)I

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    const/4 v0, -0x1

    .line 63
    if-eq p1, v0, :cond_4

    .line 64
    .line 65
    invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 66
    .line 67
    .line 68
    move-result-wide p0

    .line 69
    double-to-int p0, p0

    .line 70
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    return-object p0

    .line 75
    :cond_4
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 76
    .line 77
    .line 78
    move-result p0

    .line 79
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    return-object p0

    .line 84
    :cond_5
    :goto_0
    return-object p1

    .line 85
    :cond_6
    instance-of v0, p0, Ljava/lang/Boolean;

    .line 86
    .line 87
    if-eqz v0, :cond_8

    .line 88
    .line 89
    check-cast p0, Ljava/lang/Boolean;

    .line 90
    .line 91
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 92
    .line 93
    .line 94
    move-result p0

    .line 95
    if-eqz p0, :cond_7

    .line 96
    .line 97
    const/4 p0, 0x1

    .line 98
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    return-object p0

    .line 103
    :cond_7
    const/4 p0, 0x0

    .line 104
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    return-object p0

    .line 109
    :cond_8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 110
    .line 111
    const-string v1, "Can not cast \'"

    .line 112
    .line 113
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    const-string v1, "\' to Integer"

    .line 117
    .line 118
    invoke-static {p0, v1, v0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    return-object p1
.end method

.method public getJSONArray(I)Lcom/alibaba/fastjson2/JSONArray;
    .locals 6

    .line 1
    invoke-virtual {p0, p1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    instance-of v2, v0, Lcom/alibaba/fastjson2/JSONArray;

    .line 10
    .line 11
    if-eqz v2, :cond_1

    .line 12
    .line 13
    check-cast v0, Lcom/alibaba/fastjson2/JSONArray;

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_1
    instance-of v2, v0, Ljava/lang/String;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    if-eqz v2, :cond_5

    .line 20
    .line 21
    check-cast v0, Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-nez p0, :cond_4

    .line 28
    .line 29
    const-string p0, "null"

    .line 30
    .line 31
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    if-eqz p0, :cond_2

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    const/16 p1, 0x5b

    .line 43
    .line 44
    if-eq p0, p1, :cond_3

    .line 45
    .line 46
    invoke-static {v0}, Lcom/alibaba/fastjson2/JSONArray;->of(Ljava/lang/Object;)Lcom/alibaba/fastjson2/JSONArray;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0

    .line 51
    :cond_3
    invoke-static {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子苏世哲兰(Ljava/lang/String;)Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    sget-object v0, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子世楪苏兰哲:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 56
    .line 57
    const/4 v3, 0x0

    .line 58
    const-wide/16 v4, 0x0

    .line 59
    .line 60
    const/4 v2, 0x0

    .line 61
    invoke-interface/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, Lcom/alibaba/fastjson2/JSONArray;

    .line 66
    .line 67
    return-object p0

    .line 68
    :cond_4
    :goto_0
    return-object v1

    .line 69
    :cond_5
    instance-of v2, v0, Ljava/util/Collection;

    .line 70
    .line 71
    if-eqz v2, :cond_6

    .line 72
    .line 73
    new-instance v1, Lcom/alibaba/fastjson2/JSONArray;

    .line 74
    .line 75
    check-cast v0, Ljava/util/Collection;

    .line 76
    .line 77
    invoke-direct {v1, v0}, Lcom/alibaba/fastjson2/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0, p1, v1}, Lcom/alibaba/fastjson2/JSONArray;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    return-object v1

    .line 84
    :cond_6
    instance-of v2, v0, [Ljava/lang/Object;

    .line 85
    .line 86
    if-eqz v2, :cond_7

    .line 87
    .line 88
    check-cast v0, [Ljava/lang/Object;

    .line 89
    .line 90
    invoke-static {v0}, Lcom/alibaba/fastjson2/JSONArray;->of([Ljava/lang/Object;)Lcom/alibaba/fastjson2/JSONArray;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-virtual {p0, p1, v0}, Lcom/alibaba/fastjson2/JSONArray;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    return-object v0

    .line 98
    :cond_7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    invoke-virtual {v2}, Ljava/lang/Class;->isArray()Z

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    if-eqz v2, :cond_9

    .line 107
    .line 108
    invoke-static {v0}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    new-instance v2, Lcom/alibaba/fastjson2/JSONArray;

    .line 113
    .line 114
    invoke-direct {v2, v1}, Lcom/alibaba/fastjson2/JSONArray;-><init>(I)V

    .line 115
    .line 116
    .line 117
    :goto_1
    if-ge v3, v1, :cond_8

    .line 118
    .line 119
    invoke-static {v0, v3}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    invoke-virtual {v2, v4}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    add-int/lit8 v3, v3, 0x1

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_8
    invoke-virtual {p0, p1, v2}, Lcom/alibaba/fastjson2/JSONArray;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    return-object v2

    .line 133
    :cond_9
    return-object v1
.end method

.method public getJSONObject(I)Lcom/alibaba/fastjson2/JSONObject;
    .locals 8

    .line 1
    invoke-virtual {p0, p1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    instance-of v2, v0, Lcom/alibaba/fastjson2/JSONObject;

    .line 10
    .line 11
    if-eqz v2, :cond_1

    .line 12
    .line 13
    check-cast v0, Lcom/alibaba/fastjson2/JSONObject;

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_1
    instance-of v2, v0, Ljava/lang/String;

    .line 17
    .line 18
    if-eqz v2, :cond_4

    .line 19
    .line 20
    check-cast v0, Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    if-nez p0, :cond_3

    .line 27
    .line 28
    const-string p0, "null"

    .line 29
    .line 30
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-eqz p0, :cond_2

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    invoke-static {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子苏世哲兰(Ljava/lang/String;)Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    sget-object v2, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子世楪哲苏兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 42
    .line 43
    const/4 v5, 0x0

    .line 44
    const-wide/16 v6, 0x0

    .line 45
    .line 46
    const/4 v4, 0x0

    .line 47
    invoke-interface/range {v2 .. v7}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, Lcom/alibaba/fastjson2/JSONObject;

    .line 52
    .line 53
    return-object p0

    .line 54
    :cond_3
    :goto_0
    return-object v1

    .line 55
    :cond_4
    instance-of v2, v0, Ljava/util/Map;

    .line 56
    .line 57
    if-eqz v2, :cond_5

    .line 58
    .line 59
    new-instance v1, Lcom/alibaba/fastjson2/JSONObject;

    .line 60
    .line 61
    check-cast v0, Ljava/util/Map;

    .line 62
    .line 63
    invoke-direct {v1, v0}, Lcom/alibaba/fastjson2/JSONObject;-><init>(Ljava/util/Map;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, p1, v1}, Lcom/alibaba/fastjson2/JSONArray;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    return-object v1

    .line 70
    :cond_5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    sget-object v3, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪兰苏世哲:L飘花落叶言楪子兰苏世哲/飘花落叶言楪子世苏兰哲;

    .line 75
    .line 76
    const/4 v4, 0x0

    .line 77
    invoke-virtual {v3, v2, v2, v4}, L飘花落叶言楪子兰苏世哲/飘花落叶言楪子世苏兰哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/reflect/Type;Ljava/lang/Class;Z)L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰楪哲世;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    instance-of v3, v2, L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰世楪哲;

    .line 82
    .line 83
    if-eqz v3, :cond_6

    .line 84
    .line 85
    check-cast v2, L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰世楪哲;

    .line 86
    .line 87
    const-wide/16 v3, 0x0

    .line 88
    .line 89
    invoke-virtual {v2, v0, v3, v4}, L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;J)Lcom/alibaba/fastjson2/JSONObject;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    goto :goto_1

    .line 94
    :cond_6
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;[Lcom/alibaba/fastjson2/JSONWriter$Feature;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    check-cast v0, Lcom/alibaba/fastjson2/JSONObject;

    .line 99
    .line 100
    :goto_1
    invoke-virtual {p0, p1, v0}, Lcom/alibaba/fastjson2/JSONArray;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    return-object v0
.end method

.method public getLocalDate(I)Ljava/time/LocalDate;
    .locals 1

    const/4 v0, 0x0

    .line 24
    invoke-virtual {p0, p1, v0}, Lcom/alibaba/fastjson2/JSONArray;->getLocalDate(ILjava/time/LocalDate;)Ljava/time/LocalDate;

    move-result-object p0

    return-object p0
.end method

.method public getLocalDate(ILjava/time/LocalDate;)Ljava/time/LocalDate;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    return-object p2

    .line 8
    :cond_0
    instance-of p1, p0, Ljava/time/LocalDate;

    .line 9
    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    check-cast p0, Ljava/time/LocalDate;

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_1
    const-class p1, Ljava/time/LocalDate;

    .line 16
    .line 17
    invoke-static {p1, p0}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    check-cast p0, Ljava/time/LocalDate;

    .line 22
    .line 23
    return-object p0
.end method

.method public getLocalDateTime(I)Ljava/time/LocalDateTime;
    .locals 1

    const/4 v0, 0x0

    .line 24
    invoke-virtual {p0, p1, v0}, Lcom/alibaba/fastjson2/JSONArray;->getLocalDateTime(ILjava/time/LocalDateTime;)Ljava/time/LocalDateTime;

    move-result-object p0

    return-object p0
.end method

.method public getLocalDateTime(ILjava/time/LocalDateTime;)Ljava/time/LocalDateTime;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    return-object p2

    .line 8
    :cond_0
    instance-of p1, p0, Ljava/time/LocalDateTime;

    .line 9
    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    check-cast p0, Ljava/time/LocalDateTime;

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_1
    const-class p1, Ljava/time/LocalDateTime;

    .line 16
    .line 17
    invoke-static {p1, p0}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    check-cast p0, Ljava/time/LocalDateTime;

    .line 22
    .line 23
    return-object p0
.end method

.method public getLocalTime(I)Ljava/time/LocalTime;
    .locals 1

    const/4 v0, 0x0

    .line 24
    invoke-virtual {p0, p1, v0}, Lcom/alibaba/fastjson2/JSONArray;->getLocalTime(ILjava/time/LocalTime;)Ljava/time/LocalTime;

    move-result-object p0

    return-object p0
.end method

.method public getLocalTime(ILjava/time/LocalTime;)Ljava/time/LocalTime;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    return-object p2

    .line 8
    :cond_0
    instance-of p1, p0, Ljava/time/LocalTime;

    .line 9
    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    check-cast p0, Ljava/time/LocalTime;

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_1
    const-class p1, Ljava/time/LocalTime;

    .line 16
    .line 17
    invoke-static {p1, p0}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    check-cast p0, Ljava/time/LocalTime;

    .line 22
    .line 23
    return-object p0
.end method

.method public getLong(I)Ljava/lang/Long;
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 p1, 0x0

    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    return-object p1

    .line 9
    :cond_0
    instance-of v0, p0, Ljava/lang/Long;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    check-cast p0, Ljava/lang/Long;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_1
    instance-of v0, p0, Ljava/lang/Number;

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    check-cast p0, Ljava/lang/Number;

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 23
    .line 24
    .line 25
    move-result-wide p0

    .line 26
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :cond_2
    instance-of v0, p0, Ljava/lang/String;

    .line 32
    .line 33
    if-eqz v0, :cond_6

    .line 34
    .line 35
    check-cast p0, Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-nez v0, :cond_5

    .line 46
    .line 47
    const-string v0, "null"

    .line 48
    .line 49
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_3

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_3
    const/16 p1, 0x2e

    .line 57
    .line 58
    invoke-virtual {p0, p1}, Ljava/lang/String;->indexOf(I)I

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    const/4 v0, -0x1

    .line 63
    if-eq p1, v0, :cond_4

    .line 64
    .line 65
    invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 66
    .line 67
    .line 68
    move-result-wide p0

    .line 69
    double-to-long p0, p0

    .line 70
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    return-object p0

    .line 75
    :cond_4
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 76
    .line 77
    .line 78
    move-result-wide p0

    .line 79
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    return-object p0

    .line 84
    :cond_5
    :goto_0
    return-object p1

    .line 85
    :cond_6
    instance-of v0, p0, Ljava/lang/Boolean;

    .line 86
    .line 87
    if-eqz v0, :cond_8

    .line 88
    .line 89
    check-cast p0, Ljava/lang/Boolean;

    .line 90
    .line 91
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 92
    .line 93
    .line 94
    move-result p0

    .line 95
    if-eqz p0, :cond_7

    .line 96
    .line 97
    const-wide/16 p0, 0x1

    .line 98
    .line 99
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    return-object p0

    .line 104
    :cond_7
    const-wide/16 p0, 0x0

    .line 105
    .line 106
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    return-object p0

    .line 111
    :cond_8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 112
    .line 113
    const-string v1, "Can not cast \'"

    .line 114
    .line 115
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    const-string v1, "\' to Long"

    .line 119
    .line 120
    invoke-static {p0, v1, v0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    return-object p1
.end method

.method public getLongValue(I)J
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    return-wide v0

    .line 10
    :cond_0
    instance-of p1, p0, Ljava/lang/Number;

    .line 11
    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    check-cast p0, Ljava/lang/Number;

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 17
    .line 18
    .line 19
    move-result-wide p0

    .line 20
    return-wide p0

    .line 21
    :cond_1
    instance-of p1, p0, Ljava/lang/String;

    .line 22
    .line 23
    if-eqz p1, :cond_5

    .line 24
    .line 25
    check-cast p0, Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-nez p1, :cond_4

    .line 36
    .line 37
    const-string p1, "null"

    .line 38
    .line 39
    invoke-virtual {p1, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-eqz p1, :cond_2

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    const/16 p1, 0x2e

    .line 47
    .line 48
    invoke-virtual {p0, p1}, Ljava/lang/String;->indexOf(I)I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    const/4 v0, -0x1

    .line 53
    if-eq p1, v0, :cond_3

    .line 54
    .line 55
    invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 56
    .line 57
    .line 58
    move-result-wide p0

    .line 59
    double-to-long p0, p0

    .line 60
    return-wide p0

    .line 61
    :cond_3
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 62
    .line 63
    .line 64
    move-result-wide p0

    .line 65
    return-wide p0

    .line 66
    :cond_4
    :goto_0
    return-wide v0

    .line 67
    :cond_5
    new-instance p1, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    const-string v2, "Can not cast \'"

    .line 70
    .line 71
    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    const-string v2, "\' to long value"

    .line 75
    .line 76
    invoke-static {p0, v2, p1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    return-wide v0
.end method

.method public varargs getObject(ILjava/lang/Class;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(I",
            "Ljava/lang/Class<",
            "TT;>;[",
            "Lcom/alibaba/fastjson2/JSONReader$Feature;",
            ")TT;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 p1, 0x0

    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    goto/16 :goto_1

    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰()Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1, v0, p2}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪苏兰世哲(Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/util/function/Function;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    invoke-interface {v0, p0}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :cond_1
    array-length v0, p3

    .line 30
    const/4 v2, 0x0

    .line 31
    const-wide/16 v3, 0x0

    .line 32
    .line 33
    move-wide v4, v3

    .line 34
    move v3, v2

    .line 35
    :goto_0
    if-ge v2, v0, :cond_3

    .line 36
    .line 37
    aget-object v6, p3, v2

    .line 38
    .line 39
    iget-wide v7, v6, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 40
    .line 41
    or-long/2addr v4, v7

    .line 42
    sget-object v7, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 43
    .line 44
    if-ne v6, v7, :cond_2

    .line 45
    .line 46
    const/4 v3, 0x1

    .line 47
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_3
    instance-of v0, p0, Ljava/util/Map;

    .line 51
    .line 52
    if-eqz v0, :cond_4

    .line 53
    .line 54
    invoke-virtual {v1, p2, v3}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    check-cast p0, Ljava/util/Map;

    .line 59
    .line 60
    invoke-interface {p1, p0, v4, v5}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪苏哲兰世(Ljava/util/Map;J)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0

    .line 65
    :cond_4
    instance-of v0, p0, Ljava/util/Collection;

    .line 66
    .line 67
    if-eqz v0, :cond_5

    .line 68
    .line 69
    invoke-virtual {v1, p2, v3}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    check-cast p0, Ljava/util/Collection;

    .line 74
    .line 75
    invoke-interface {p1, p0, v4, v5}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世哲苏兰(Ljava/util/Collection;J)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    return-object p0

    .line 80
    :cond_5
    invoke-static {p2}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪苏兰世哲(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    invoke-virtual {p2, p0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-eqz v0, :cond_6

    .line 89
    .line 90
    return-object p0

    .line 91
    :cond_6
    instance-of v0, p0, Ljava/lang/String;

    .line 92
    .line 93
    if-eqz v0, :cond_9

    .line 94
    .line 95
    move-object v0, p0

    .line 96
    check-cast v0, Ljava/lang/String;

    .line 97
    .line 98
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    if-nez v2, :cond_8

    .line 103
    .line 104
    const-string v2, "null"

    .line 105
    .line 106
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    if-eqz v2, :cond_7

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_7
    invoke-virtual {p2}, Ljava/lang/Class;->isEnum()Z

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    if-eqz v2, :cond_9

    .line 118
    .line 119
    invoke-virtual {v1, p2, v3}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    instance-of v4, v2, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲苏世兰楪;

    .line 124
    .line 125
    if-eqz v4, :cond_a

    .line 126
    .line 127
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)J

    .line 128
    .line 129
    .line 130
    move-result-wide p0

    .line 131
    check-cast v2, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲苏世兰楪;

    .line 132
    .line 133
    invoke-virtual {v2, p0, p1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪苏哲世兰(J)Ljava/lang/Enum;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    return-object p0

    .line 138
    :cond_8
    :goto_1
    return-object p1

    .line 139
    :cond_9
    move-object v2, p1

    .line 140
    :cond_a
    invoke-static {p0}, Lcom/alibaba/fastjson2/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/Object;)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    invoke-static {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子苏世哲兰(Ljava/lang/String;)Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;

    .line 145
    .line 146
    .line 147
    move-result-object v5

    .line 148
    iget-object v0, v5, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 149
    .line 150
    invoke-virtual {v0, p3}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏兰哲([Lcom/alibaba/fastjson2/JSONReader$Feature;)V

    .line 151
    .line 152
    .line 153
    if-nez v2, :cond_b

    .line 154
    .line 155
    invoke-virtual {v1, p2, v3}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    :cond_b
    move-object v4, v2

    .line 160
    const/4 v7, 0x0

    .line 161
    const-wide/16 v8, 0x0

    .line 162
    .line 163
    const/4 v6, 0x0

    .line 164
    invoke-interface/range {v4 .. v9}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object p2

    .line 168
    invoke-virtual {v5}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲兰世苏楪()Z

    .line 169
    .line 170
    .line 171
    move-result p3

    .line 172
    if-eqz p3, :cond_c

    .line 173
    .line 174
    return-object p2

    .line 175
    :cond_c
    const-string p2, "not support input "

    .line 176
    .line 177
    invoke-virtual {p2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object p0

    .line 181
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    return-object p1
.end method

.method public varargs getObject(ILjava/lang/reflect/Type;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(I",
            "Ljava/lang/reflect/Type;",
            "[",
            "Lcom/alibaba/fastjson2/JSONReader$Feature;",
            ")TT;"
        }
    .end annotation

    .line 185
    invoke-virtual {p0, p1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 186
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    .line 187
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰()Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;

    move-result-object v0

    .line 188
    invoke-virtual {v0, p1, p2}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪苏兰世哲(Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/util/function/Function;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 189
    invoke-interface {p1, p0}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 190
    :cond_1
    array-length p1, p3

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    move-wide v3, v2

    move v2, v1

    :goto_0
    if-ge v1, p1, :cond_3

    aget-object v5, p3, v1

    .line 191
    iget-wide v6, v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    or-long/2addr v3, v6

    .line 192
    sget-object v6, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    if-ne v5, v6, :cond_2

    const/4 v2, 0x1

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 193
    :cond_3
    instance-of p1, p0, Ljava/util/Map;

    if-eqz p1, :cond_4

    .line 194
    invoke-virtual {v0, p2, v2}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    move-result-object p1

    .line 195
    check-cast p0, Ljava/util/Map;

    invoke-interface {p1, p0, v3, v4}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪苏哲兰世(Ljava/util/Map;J)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 196
    :cond_4
    instance-of p1, p0, Ljava/util/Collection;

    if-eqz p1, :cond_5

    .line 197
    invoke-virtual {v0, p2, v2}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    move-result-object p1

    .line 198
    check-cast p0, Ljava/util/Collection;

    invoke-interface {p1, p0, v3, v4}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世哲苏兰(Ljava/util/Collection;J)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 199
    :cond_5
    invoke-static {p2}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪苏兰世哲(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object p1

    .line 200
    invoke-virtual {p1, p0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_6

    return-object p0

    .line 201
    :cond_6
    invoke-static {p0}, Lcom/alibaba/fastjson2/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    .line 202
    invoke-static {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子苏世哲兰(Ljava/lang/String;)Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;

    move-result-object v4

    .line 203
    iget-object p0, v4, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    invoke-virtual {p0, p3}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏兰哲([Lcom/alibaba/fastjson2/JSONReader$Feature;)V

    .line 204
    invoke-virtual {v0, p1, v2}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    move-result-object v3

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const/4 v5, 0x0

    .line 205
    invoke-interface/range {v3 .. v8}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public getObject(ILjava/util/function/Function;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(I",
            "Ljava/util/function/Function<",
            "Lcom/alibaba/fastjson2/JSONObject;",
            "TT;>;)TT;"
        }
    .end annotation

    .line 206
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONArray;->getJSONObject(I)Lcom/alibaba/fastjson2/JSONObject;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 207
    :cond_0
    invoke-interface {p2, p0}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public getOffsetDateTime(I)Ljava/time/OffsetDateTime;
    .locals 1

    const/4 v0, 0x0

    .line 24
    invoke-virtual {p0, p1, v0}, Lcom/alibaba/fastjson2/JSONArray;->getOffsetDateTime(ILjava/time/OffsetDateTime;)Ljava/time/OffsetDateTime;

    move-result-object p0

    return-object p0
.end method

.method public getOffsetDateTime(ILjava/time/OffsetDateTime;)Ljava/time/OffsetDateTime;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    return-object p2

    .line 8
    :cond_0
    instance-of p1, p0, Ljava/time/OffsetDateTime;

    .line 9
    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    check-cast p0, Ljava/time/OffsetDateTime;

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_1
    const-class p1, Ljava/time/OffsetDateTime;

    .line 16
    .line 17
    invoke-static {p1, p0}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    check-cast p0, Ljava/time/OffsetDateTime;

    .line 22
    .line 23
    return-object p0
.end method

.method public getOffsetTime(I)Ljava/time/OffsetTime;
    .locals 1

    const/4 v0, 0x0

    .line 24
    invoke-virtual {p0, p1, v0}, Lcom/alibaba/fastjson2/JSONArray;->getOffsetTime(ILjava/time/OffsetTime;)Ljava/time/OffsetTime;

    move-result-object p0

    return-object p0
.end method

.method public getOffsetTime(ILjava/time/OffsetTime;)Ljava/time/OffsetTime;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    return-object p2

    .line 8
    :cond_0
    instance-of p1, p0, Ljava/time/OffsetTime;

    .line 9
    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    check-cast p0, Ljava/time/OffsetTime;

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_1
    const-class p1, Ljava/time/OffsetTime;

    .line 16
    .line 17
    invoke-static {p1, p0}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    check-cast p0, Ljava/time/OffsetTime;

    .line 22
    .line 23
    return-object p0
.end method

.method public getShort(I)Ljava/lang/Short;
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 p1, 0x0

    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    return-object p1

    .line 9
    :cond_0
    instance-of v0, p0, Ljava/lang/Short;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    check-cast p0, Ljava/lang/Short;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_1
    instance-of v0, p0, Ljava/lang/Number;

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    check-cast p0, Ljava/lang/Number;

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Number;->shortValue()S

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    invoke-static {p0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :cond_2
    instance-of v0, p0, Ljava/lang/String;

    .line 32
    .line 33
    if-eqz v0, :cond_5

    .line 34
    .line 35
    check-cast p0, Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-nez v0, :cond_4

    .line 46
    .line 47
    const-string v0, "null"

    .line 48
    .line 49
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_3

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_3
    invoke-static {p0}, Ljava/lang/Short;->parseShort(Ljava/lang/String;)S

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    invoke-static {p0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0

    .line 65
    :cond_4
    :goto_0
    return-object p1

    .line 66
    :cond_5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    const-string v1, "Can not cast \'"

    .line 69
    .line 70
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    const-string v1, "\' to short"

    .line 74
    .line 75
    invoke-static {p0, v1, v0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    return-object p1
.end method

.method public getShortValue(I)S
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONArray;->getShort(I)Ljava/lang/Short;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return p0

    .line 9
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Short;->shortValue()S

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public getString(I)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return-object p0

    .line 9
    :cond_0
    instance-of p1, p0, Ljava/lang/String;

    .line 10
    .line 11
    if-eqz p1, :cond_1

    .line 12
    .line 13
    check-cast p0, Ljava/lang/String;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_1
    instance-of p1, p0, Ljava/util/Date;

    .line 17
    .line 18
    if-eqz p1, :cond_2

    .line 19
    .line 20
    check-cast p0, Ljava/util/Date;

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/util/Date;->getTime()J

    .line 23
    .line 24
    .line 25
    move-result-wide p0

    .line 26
    sget-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/time/ZoneId;

    .line 27
    .line 28
    invoke-static {p0, p1, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子苏哲世兰楪(JLjava/time/ZoneId;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0

    .line 33
    :cond_2
    instance-of p1, p0, Ljava/lang/Boolean;

    .line 34
    .line 35
    if-nez p1, :cond_4

    .line 36
    .line 37
    instance-of p1, p0, Ljava/lang/Character;

    .line 38
    .line 39
    if-nez p1, :cond_4

    .line 40
    .line 41
    instance-of p1, p0, Ljava/lang/Number;

    .line 42
    .line 43
    if-nez p1, :cond_4

    .line 44
    .line 45
    instance-of p1, p0, Ljava/util/UUID;

    .line 46
    .line 47
    if-nez p1, :cond_4

    .line 48
    .line 49
    instance-of p1, p0, Ljava/lang/Enum;

    .line 50
    .line 51
    if-nez p1, :cond_4

    .line 52
    .line 53
    instance-of p1, p0, Ljava/time/temporal/TemporalAccessor;

    .line 54
    .line 55
    if-eqz p1, :cond_3

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_3
    invoke-static {p0}, Lcom/alibaba/fastjson2/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/Object;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0

    .line 63
    :cond_4
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    return-object p0
.end method

.method public getZonedDateTime(I)Ljava/time/ZonedDateTime;
    .locals 1

    const/4 v0, 0x0

    .line 24
    invoke-virtual {p0, p1, v0}, Lcom/alibaba/fastjson2/JSONArray;->getZonedDateTime(ILjava/time/ZonedDateTime;)Ljava/time/ZonedDateTime;

    move-result-object p0

    return-object p0
.end method

.method public getZonedDateTime(ILjava/time/ZonedDateTime;)Ljava/time/ZonedDateTime;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    return-object p2

    .line 8
    :cond_0
    instance-of p1, p0, Ljava/time/ZonedDateTime;

    .line 9
    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    check-cast p0, Ljava/time/ZonedDateTime;

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_1
    const-class p1, Ljava/time/ZonedDateTime;

    .line 16
    .line 17
    invoke-static {p1, p0}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    check-cast p0, Ljava/time/ZonedDateTime;

    .line 22
    .line 23
    return-object p0
.end method

.method public isValid(Lcom/alibaba/fastjson2/schema/JSONSchema;)Z
    .locals 0

    .line 1
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪兰哲世苏(Ljava/lang/Object;)Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-boolean p0, p0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:Z

    .line 6
    .line 7
    return p0
.end method

.method public set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-super {p0}, Ljava/util/ArrayList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-gez p1, :cond_1

    .line 7
    .line 8
    add-int/2addr p1, v0

    .line 9
    if-gez p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    invoke-super {p0, p1, p2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-object v1

    .line 16
    :cond_0
    invoke-super {p0, p1, p2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :cond_1
    if-ge p1, v0, :cond_2

    .line 22
    .line 23
    invoke-super {p0, p1, p2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0

    .line 28
    :cond_2
    add-int/lit16 v2, v0, 0x1000

    .line 29
    .line 30
    if-ge p1, v2, :cond_4

    .line 31
    .line 32
    :goto_0
    add-int/lit8 v2, p1, -0x1

    .line 33
    .line 34
    if-eq p1, v0, :cond_3

    .line 35
    .line 36
    invoke-super {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move p1, v2

    .line 40
    goto :goto_0

    .line 41
    :cond_3
    invoke-super {p0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    :cond_4
    return-object v1
.end method

.method public to(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 1
    const-class v0, Ljava/lang/String;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONArray;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    const-class v0, Lcom/alibaba/fastjson2/飘花落叶言子楪世苏哲兰;

    .line 11
    .line 12
    if-ne p1, v0, :cond_1

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_1
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰()Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-virtual {v0, p1, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    const-wide/16 v0, 0x0

    .line 25
    .line 26
    invoke-interface {p1, p0, v0, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世哲苏兰(Ljava/util/Collection;J)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0
.end method

.method public to(Ljava/lang/reflect/Type;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/reflect/Type;",
            ")TT;"
        }
    .end annotation

    const-wide/16 v0, 0x0

    .line 36
    invoke-virtual {p0, p1, v0, v1}, Lcom/alibaba/fastjson2/JSONArray;->to(Ljava/lang/reflect/Type;J)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public to(Ljava/lang/reflect/Type;J)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/reflect/Type;",
            "J)TT;"
        }
    .end annotation

    .line 31
    const-class v0, Ljava/lang/String;

    if-ne p1, v0, :cond_0

    .line 32
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONArray;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 33
    :cond_0
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰()Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;

    move-result-object v0

    const/4 v1, 0x0

    .line 34
    invoke-virtual {v0, p1, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    move-result-object p1

    .line 35
    invoke-interface {p1, p0, p2, p3}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世哲苏兰(Ljava/util/Collection;J)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public varargs toArray(Ljava/lang/Class;[Lcom/alibaba/fastjson2/JSONReader$Feature;)[Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;[",
            "Lcom/alibaba/fastjson2/JSONReader$Feature;",
            ")[TT;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 2
    .line 3
    array-length v0, p2

    .line 4
    const/4 v1, 0x0

    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    move v4, v1

    .line 8
    move v5, v4

    .line 9
    :goto_0
    if-ge v4, v0, :cond_1

    .line 10
    .line 11
    aget-object v6, p2, v4

    .line 12
    .line 13
    iget-wide v7, v6, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 14
    .line 15
    or-long/2addr v2, v7

    .line 16
    sget-object v7, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 17
    .line 18
    if-ne v6, v7, :cond_0

    .line 19
    .line 20
    const/4 v5, 0x1

    .line 21
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰()Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    invoke-virtual {p2, p1, v5}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    invoke-static {p1, v4}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    check-cast v4, [Ljava/lang/Object;

    .line 41
    .line 42
    :goto_1
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    if-ge v1, v5, :cond_7

    .line 47
    .line 48
    invoke-virtual {p0, v1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    instance-of v6, v5, Lcom/alibaba/fastjson2/JSONObject;

    .line 53
    .line 54
    if-eqz v6, :cond_2

    .line 55
    .line 56
    check-cast v5, Ljava/util/Map;

    .line 57
    .line 58
    invoke-interface {v0, v5, v2, v3}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪苏哲兰世(Ljava/util/Map;J)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    goto :goto_2

    .line 63
    :cond_2
    instance-of v6, v5, Ljava/util/Map;

    .line 64
    .line 65
    if-eqz v6, :cond_3

    .line 66
    .line 67
    check-cast v5, Ljava/util/Map;

    .line 68
    .line 69
    invoke-interface {v0, v5, v2, v3}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪苏哲兰世(Ljava/util/Map;J)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    goto :goto_2

    .line 74
    :cond_3
    if-eqz v5, :cond_6

    .line 75
    .line 76
    invoke-virtual {p1, v5}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v6

    .line 80
    if-eqz v6, :cond_4

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_4
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    invoke-virtual {p2, v6, p1}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪苏兰世哲(Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/util/function/Function;

    .line 88
    .line 89
    .line 90
    move-result-object v7

    .line 91
    if-eqz v7, :cond_5

    .line 92
    .line 93
    invoke-interface {v7, v5}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v5

    .line 97
    aput-object v5, v4, v1

    .line 98
    .line 99
    goto :goto_3

    .line 100
    :cond_5
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    .line 101
    .line 102
    new-instance p2, Ljava/lang/StringBuilder;

    .line 103
    .line 104
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    const-string v0, " cannot be converted to "

    .line 111
    .line 112
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    throw p0

    .line 126
    :cond_6
    :goto_2
    aput-object v5, v4, v1

    .line 127
    .line 128
    :goto_3
    add-int/lit8 v1, v1, 0x1

    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_7
    return-object v4
.end method

.method public varargs toJSONBBytes([Lcom/alibaba/fastjson2/JSONWriter$Feature;)[B
    .locals 3

    .line 1
    sget v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世苏哲楪兰:I

    .line 2
    .line 3
    new-instance v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;

    .line 4
    .line 5
    new-instance v1, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 6
    .line 7
    sget-object v2, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪兰苏世哲:L飘花落叶言楪子兰苏世哲/飘花落叶言楪子世苏兰哲;

    .line 8
    .line 9
    invoke-direct {v1, v2, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;-><init>(L飘花落叶言楪子兰苏世哲/飘花落叶言楪子世苏兰哲;[Lcom/alibaba/fastjson2/JSONWriter$Feature;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;-><init>(Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;)V

    .line 13
    .line 14
    .line 15
    :try_start_0
    invoke-virtual {v0, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰楪世哲苏(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子兰楪哲苏世(Ljava/util/List;)V

    .line 19
    .line 20
    .line 21
    iget-object p0, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->飘花落叶言子世苏兰楪哲:[B

    .line 22
    .line 23
    iget p1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 24
    .line 25
    invoke-static {p0, p1}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 26
    .line 27
    .line 28
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->close()V

    .line 30
    .line 31
    .line 32
    return-object p0

    .line 33
    :catchall_0
    move-exception p0

    .line 34
    :try_start_1
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏兰楪;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catchall_1
    move-exception p1

    .line 39
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    :goto_0
    throw p0
.end method

.method public varargs toJSONString([Lcom/alibaba/fastjson2/JSONWriter$Feature;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONArray;->toString([Lcom/alibaba/fastjson2/JSONWriter$Feature;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public varargs toJavaList(Ljava/lang/Class;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;[",
            "Lcom/alibaba/fastjson2/JSONReader$Feature;",
            ")",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/alibaba/fastjson2/JSONArray;->toList(Ljava/lang/Class;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public toJavaObject(Ljava/lang/reflect/Type;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/reflect/Type;",
            ")TT;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONArray;->to(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public varargs toList(Ljava/lang/Class;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;[",
            "Lcom/alibaba/fastjson2/JSONReader$Feature;",
            ")",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 2
    .line 3
    array-length v0, p2

    .line 4
    const/4 v1, 0x0

    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    move v4, v1

    .line 8
    move v5, v4

    .line 9
    :goto_0
    if-ge v4, v0, :cond_1

    .line 10
    .line 11
    aget-object v6, p2, v4

    .line 12
    .line 13
    iget-wide v7, v6, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 14
    .line 15
    or-long/2addr v2, v7

    .line 16
    sget-object v7, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 17
    .line 18
    if-ne v6, v7, :cond_0

    .line 19
    .line 20
    const/4 v5, 0x1

    .line 21
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰()Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    invoke-virtual {p2, p1, v5}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    new-instance v4, Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 39
    .line 40
    .line 41
    :goto_1
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    if-ge v1, v5, :cond_7

    .line 46
    .line 47
    invoke-virtual {p0, v1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    instance-of v6, v5, Lcom/alibaba/fastjson2/JSONObject;

    .line 52
    .line 53
    if-eqz v6, :cond_2

    .line 54
    .line 55
    check-cast v5, Ljava/util/Map;

    .line 56
    .line 57
    invoke-interface {v0, v5, v2, v3}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪苏哲兰世(Ljava/util/Map;J)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    goto :goto_2

    .line 62
    :cond_2
    instance-of v6, v5, Ljava/util/Map;

    .line 63
    .line 64
    if-eqz v6, :cond_3

    .line 65
    .line 66
    check-cast v5, Ljava/util/Map;

    .line 67
    .line 68
    invoke-interface {v0, v5, v2, v3}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪苏哲兰世(Ljava/util/Map;J)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    goto :goto_2

    .line 73
    :cond_3
    if-eqz v5, :cond_6

    .line 74
    .line 75
    invoke-virtual {p1, v5}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v6

    .line 79
    if-eqz v6, :cond_4

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_4
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    invoke-virtual {p2, v6, p1}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪苏兰世哲(Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/util/function/Function;

    .line 87
    .line 88
    .line 89
    move-result-object v7

    .line 90
    if-eqz v7, :cond_5

    .line 91
    .line 92
    invoke-interface {v7, v5}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    goto :goto_3

    .line 100
    :cond_5
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    .line 101
    .line 102
    new-instance p2, Ljava/lang/StringBuilder;

    .line 103
    .line 104
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    const-string v0, " cannot be converted to "

    .line 111
    .line 112
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    throw p0

    .line 126
    :cond_6
    :goto_2
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    :goto_3
    add-int/lit8 v1, v1, 0x1

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_7
    return-object v4
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 68
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲世苏兰楪()Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;

    move-result-object v0

    .line 69
    :try_start_0
    invoke-virtual {v0, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰楪世哲苏(Ljava/lang/Object;)V

    .line 70
    invoke-virtual {v0, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰楪哲苏世(Ljava/util/List;)V

    .line 71
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 72
    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    return-object p0

    :catchall_0
    move-exception p0

    .line 73
    :try_start_1
    invoke-interface {v0}, Ljava/io/Closeable;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p0
.end method

.method public varargs toString([Lcom/alibaba/fastjson2/JSONWriter$Feature;)Ljava/lang/String;
    .locals 8

    .line 1
    const-class v0, Lcom/alibaba/fastjson2/JSONArray;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲苏兰世楪([Lcom/alibaba/fastjson2/JSONWriter$Feature;)Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    :try_start_0
    iget-object p1, v2, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 8
    .line 9
    iget-wide v3, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 10
    .line 11
    sget-wide v5, Lcom/alibaba/fastjson2/JSONObject;->NONE_DIRECT_FEATURES:J

    .line 12
    .line 13
    and-long/2addr v3, v5

    .line 14
    const-wide/16 v5, 0x0

    .line 15
    .line 16
    cmp-long p1, v3, v5

    .line 17
    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    invoke-virtual {v2, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰楪哲苏世(Ljava/util/List;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception v0

    .line 25
    move-object p0, v0

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    invoke-virtual {v2, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰楪世哲苏(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    sget-object p1, Lcom/alibaba/fastjson2/JSONArray;->arrayWriter:L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰楪哲世;

    .line 31
    .line 32
    if-nez p1, :cond_1

    .line 33
    .line 34
    invoke-virtual {v2, v0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/Class;Ljava/lang/reflect/Type;)L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰楪哲世;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    sput-object p1, Lcom/alibaba/fastjson2/JSONArray;->arrayWriter:L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰楪哲世;

    .line 39
    .line 40
    :cond_1
    sget-object v1, Lcom/alibaba/fastjson2/JSONArray;->arrayWriter:L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰楪哲世;

    .line 41
    .line 42
    const/4 v5, 0x0

    .line 43
    const-wide/16 v6, 0x0

    .line 44
    .line 45
    const/4 v4, 0x0

    .line 46
    move-object v3, p0

    .line 47
    invoke-interface/range {v1 .. v7}, L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰楪哲世;->飘花落叶言子楪哲苏世兰(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 48
    .line 49
    .line 50
    :goto_0
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    invoke-interface {v2}, Ljava/io/Closeable;->close()V

    .line 55
    .line 56
    .line 57
    return-object p0

    .line 58
    :goto_1
    :try_start_1
    invoke-interface {v2}, Ljava/io/Closeable;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 59
    .line 60
    .line 61
    goto :goto_2

    .line 62
    :catchall_1
    move-exception v0

    .line 63
    move-object p1, v0

    .line 64
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 65
    .line 66
    .line 67
    :goto_2
    throw p0
.end method
