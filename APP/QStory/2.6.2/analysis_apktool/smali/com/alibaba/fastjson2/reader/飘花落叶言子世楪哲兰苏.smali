.class public Lcom/alibaba/fastjson2/reader/飘花落叶言子世楪哲兰苏;
.super Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏哲兰楪;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final 飘花落叶言子世哲兰楪苏:Ljava/lang/reflect/Type;

.field public final 飘花落叶言子世哲兰苏楪:Ljava/util/function/BiConsumer;

.field public final 飘花落叶言子世哲苏兰楪:Lcom/alibaba/fastjson2/PropertyNamingStrategy;

.field public final 飘花落叶言子世哲苏楪兰:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Lcom/alibaba/fastjson2/schema/JSONSchema;Ljava/lang/reflect/Field;Ljava/lang/String;Ljava/util/function/BiConsumer;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p11}, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏哲兰楪;-><init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Lcom/alibaba/fastjson2/schema/JSONSchema;Ljava/lang/reflect/Field;)V

    .line 2
    .line 3
    .line 4
    sget-object p1, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/Class;

    .line 5
    .line 6
    instance-of p1, p2, Ljava/lang/reflect/ParameterizedType;

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    check-cast p2, Ljava/lang/reflect/ParameterizedType;

    .line 11
    .line 12
    invoke-interface {p2}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    array-length p2, p1

    .line 17
    const/4 p3, 0x2

    .line 18
    if-ne p2, p3, :cond_0

    .line 19
    .line 20
    const/4 p2, 0x1

    .line 21
    aget-object p1, p1, p2

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const-class p1, Ljava/lang/Object;

    .line 25
    .line 26
    :goto_0
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世楪哲兰苏;->飘花落叶言子世哲兰楪苏:Ljava/lang/reflect/Type;

    .line 27
    .line 28
    iput-object p12, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世楪哲兰苏;->飘花落叶言子世哲苏楪兰:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {p7}, Lcom/alibaba/fastjson2/PropertyNamingStrategy;->of(Ljava/lang/String;)Lcom/alibaba/fastjson2/PropertyNamingStrategy;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世楪哲兰苏;->飘花落叶言子世哲苏兰楪:Lcom/alibaba/fastjson2/PropertyNamingStrategy;

    .line 35
    .line 36
    iput-object p13, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世楪哲兰苏;->飘花落叶言子世哲兰苏楪:Ljava/util/function/BiConsumer;

    .line 37
    .line 38
    return-void
.end method


# virtual methods
.method public 飘花落叶言子楪世哲苏兰(JLjava/lang/Object;Ljava/lang/Object;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世楪哲兰苏;->飘花落叶言子世哲苏楪兰:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    instance-of v0, p4, Ljava/util/Collection;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰()Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪哲苏兰世(Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {v0, p1, p2}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子世楪哲兰苏(J)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    move-object v1, v0

    .line 22
    check-cast v1, Ljava/util/Map;

    .line 23
    .line 24
    move-object v2, p4

    .line 25
    check-cast v2, Ljava/util/Collection;

    .line 26
    .line 27
    iget-wide v3, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世哲苏:J

    .line 28
    .line 29
    or-long/2addr p1, v3

    .line 30
    iget-object p4, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世楪哲兰苏;->飘花落叶言子世哲兰楪苏:Ljava/lang/reflect/Type;

    .line 31
    .line 32
    invoke-static {p4, p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/reflect/Type;J)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    iget-object v6, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世楪哲兰苏;->飘花落叶言子世哲兰苏楪:Ljava/util/function/BiConsumer;

    .line 37
    .line 38
    iget-object v3, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世楪哲兰苏;->飘花落叶言子世哲苏楪兰:Ljava/lang/String;

    .line 39
    .line 40
    iget-object v4, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世楪哲兰苏;->飘花落叶言子世哲苏兰楪:Lcom/alibaba/fastjson2/PropertyNamingStrategy;

    .line 41
    .line 42
    invoke-static/range {v1 .. v6}, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏哲楪兰;->飘花落叶言子世楪苏兰哲(Ljava/util/Map;Ljava/util/Collection;Ljava/lang/String;Lcom/alibaba/fastjson2/PropertyNamingStrategy;Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;Ljava/util/function/BiConsumer;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, p3, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_0
    invoke-super {p0, p1, p2, p3, p4}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰(JLjava/lang/Object;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public 飘花落叶言子楪兰哲世苏(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/Object;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世楪哲兰苏;->飘花落叶言子世哲苏楪兰:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪兰哲()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪哲兰世苏(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-wide v1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世哲苏:J

    .line 16
    .line 17
    invoke-interface {v0, v1, v2}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子世楪哲兰苏(J)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    move-object v3, v0

    .line 22
    check-cast v3, Ljava/util/Map;

    .line 23
    .line 24
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世楪哲兰苏;->飘花落叶言子世哲兰楪苏:Ljava/lang/reflect/Type;

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰楪哲世苏(Ljava/lang/reflect/Type;)Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    invoke-static {v0, v1, v2}, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/reflect/Type;J)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 31
    .line 32
    .line 33
    move-result-object v7

    .line 34
    iget-object v8, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世楪哲兰苏;->飘花落叶言子世哲兰苏楪:Ljava/util/function/BiConsumer;

    .line 35
    .line 36
    iget-object v5, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世楪哲兰苏;->飘花落叶言子世哲苏楪兰:Ljava/lang/String;

    .line 37
    .line 38
    iget-object v6, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世楪哲兰苏;->飘花落叶言子世哲苏兰楪:Lcom/alibaba/fastjson2/PropertyNamingStrategy;

    .line 39
    .line 40
    invoke-static/range {v3 .. v8}, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏哲楪兰;->飘花落叶言子世楪苏兰哲(Ljava/util/Map;Ljava/util/Collection;Ljava/lang/String;Lcom/alibaba/fastjson2/PropertyNamingStrategy;Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;Ljava/util/function/BiConsumer;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, p2, v3}, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_0
    invoke-super {p0, p1, p2}, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪兰哲世苏(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    return-void
.end method
