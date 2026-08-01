.class public Lcom/alibaba/fastjson2/reader/飘花落叶言子世楪兰哲苏;
.super Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏哲楪兰;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final 飘花落叶言子世哲兰楪苏:Ljava/lang/reflect/Type;

.field public final 飘花落叶言子世哲兰苏楪:Ljava/util/function/BiConsumer;

.field public final 飘花落叶言子世哲苏兰楪:Lcom/alibaba/fastjson2/PropertyNamingStrategy;

.field public final 飘花落叶言子世哲苏楪兰:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Lcom/alibaba/fastjson2/schema/JSONSchema;Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;Ljava/lang/String;Ljava/util/function/BiConsumer;)V
    .locals 14

    .line 1
    const/4 v13, 0x0

    .line 2
    move-object v0, p0

    .line 3
    move-object v7, p1

    .line 4
    move-object/from16 v11, p2

    .line 5
    .line 6
    move-object/from16 v5, p3

    .line 7
    .line 8
    move/from16 v1, p4

    .line 9
    .line 10
    move-wide/from16 v2, p5

    .line 11
    .line 12
    move-object/from16 v8, p7

    .line 13
    .line 14
    move-object/from16 v12, p8

    .line 15
    .line 16
    move-object/from16 v6, p9

    .line 17
    .line 18
    move-object/from16 v4, p10

    .line 19
    .line 20
    move-object/from16 v10, p11

    .line 21
    .line 22
    move-object/from16 v9, p12

    .line 23
    .line 24
    invoke-direct/range {v0 .. v13}, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏哲楪兰;-><init>(IJLcom/alibaba/fastjson2/schema/JSONSchema;Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;Ljava/lang/reflect/Type;Ljava/util/Locale;Ljava/util/function/BiConsumer;)V

    .line 25
    .line 26
    .line 27
    sget-object p1, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/Class;

    .line 28
    .line 29
    instance-of p1, v11, Ljava/lang/reflect/ParameterizedType;

    .line 30
    .line 31
    if-eqz p1, :cond_0

    .line 32
    .line 33
    move-object p1, v11

    .line 34
    check-cast p1, Ljava/lang/reflect/ParameterizedType;

    .line 35
    .line 36
    invoke-interface {p1}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    array-length v1, p1

    .line 41
    const/4 v2, 0x2

    .line 42
    if-ne v1, v2, :cond_0

    .line 43
    .line 44
    const/4 v1, 0x1

    .line 45
    aget-object p1, p1, v1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    const-class p1, Ljava/lang/Object;

    .line 49
    .line 50
    :goto_0
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世楪兰哲苏;->飘花落叶言子世哲兰楪苏:Ljava/lang/reflect/Type;

    .line 51
    .line 52
    move-object/from16 p1, p13

    .line 53
    .line 54
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世楪兰哲苏;->飘花落叶言子世哲苏楪兰:Ljava/lang/String;

    .line 55
    .line 56
    invoke-static/range {p7 .. p7}, Lcom/alibaba/fastjson2/PropertyNamingStrategy;->of(Ljava/lang/String;)Lcom/alibaba/fastjson2/PropertyNamingStrategy;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世楪兰哲苏;->飘花落叶言子世哲苏兰楪:Lcom/alibaba/fastjson2/PropertyNamingStrategy;

    .line 61
    .line 62
    move-object/from16 p1, p14

    .line 63
    .line 64
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世楪兰哲苏;->飘花落叶言子世哲兰苏楪:Ljava/util/function/BiConsumer;

    .line 65
    .line 66
    return-void
.end method


# virtual methods
.method public 飘花落叶言子楪世哲苏兰(JLjava/lang/Object;Ljava/lang/Object;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世楪兰哲苏;->飘花落叶言子世哲苏楪兰:Ljava/lang/String;

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
    iget-object p4, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世楪兰哲苏;->飘花落叶言子世哲兰楪苏:Ljava/lang/reflect/Type;

    .line 31
    .line 32
    invoke-static {p4, p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/reflect/Type;J)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    iget-object v6, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世楪兰哲苏;->飘花落叶言子世哲兰苏楪:Ljava/util/function/BiConsumer;

    .line 37
    .line 38
    iget-object v3, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世楪兰哲苏;->飘花落叶言子世哲苏楪兰:Ljava/lang/String;

    .line 39
    .line 40
    iget-object v4, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世楪兰哲苏;->飘花落叶言子世哲苏兰楪:Lcom/alibaba/fastjson2/PropertyNamingStrategy;

    .line 41
    .line 42
    invoke-static/range {v1 .. v6}, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏哲楪兰;->飘花落叶言子世楪苏兰哲(Ljava/util/Map;Ljava/util/Collection;Ljava/lang/String;Lcom/alibaba/fastjson2/PropertyNamingStrategy;Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;Ljava/util/function/BiConsumer;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, p3, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;Ljava/lang/Object;)V

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
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世楪兰哲苏;->飘花落叶言子世哲苏楪兰:Ljava/lang/String;

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
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世楪兰哲苏;->飘花落叶言子世哲兰楪苏:Ljava/lang/reflect/Type;

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
    iget-object v8, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世楪兰哲苏;->飘花落叶言子世哲兰苏楪:Ljava/util/function/BiConsumer;

    .line 35
    .line 36
    iget-object v5, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世楪兰哲苏;->飘花落叶言子世哲苏楪兰:Ljava/lang/String;

    .line 37
    .line 38
    iget-object v6, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世楪兰哲苏;->飘花落叶言子世哲苏兰楪:Lcom/alibaba/fastjson2/PropertyNamingStrategy;

    .line 39
    .line 40
    invoke-static/range {v3 .. v8}, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏哲楪兰;->飘花落叶言子世楪苏兰哲(Ljava/util/Map;Ljava/util/Collection;Ljava/lang/String;Lcom/alibaba/fastjson2/PropertyNamingStrategy;Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;Ljava/util/function/BiConsumer;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, p2, v3}, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;Ljava/lang/Object;)V

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
