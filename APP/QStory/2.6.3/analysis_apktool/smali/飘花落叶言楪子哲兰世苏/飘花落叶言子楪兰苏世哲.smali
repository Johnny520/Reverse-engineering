.class public final L飘花落叶言楪子哲兰世苏/飘花落叶言子楪兰苏世哲;
.super L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# direct methods
.method public constructor <init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Field;)V
    .locals 12

    .line 1
    sget-object v8, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 2
    .line 3
    const/4 v11, 0x0

    .line 4
    const/4 v6, 0x0

    .line 5
    move-object v9, v8

    .line 6
    move-object v0, p0

    .line 7
    move-object v1, p1

    .line 8
    move v2, p2

    .line 9
    move-wide v3, p3

    .line 10
    move-object/from16 v5, p5

    .line 11
    .line 12
    move-object/from16 v7, p6

    .line 13
    .line 14
    move-object/from16 v10, p7

    .line 15
    .line 16
    invoke-direct/range {v0 .. v11}, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲兰世苏(Ljava/lang/Object;)F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final 飘花落叶言子楪哲兰世苏(Ljava/lang/Object;)F
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Ljava/lang/String;

    .line 3
    .line 4
    const-string v2, "field.get error, "

    .line 5
    .line 6
    if-eqz p1, :cond_1

    .line 7
    .line 8
    :try_start_0
    iget-wide v3, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪苏兰哲:J

    .line 9
    .line 10
    const-wide/16 v5, -0x1

    .line 11
    .line 12
    cmp-long v5, v3, v5

    .line 13
    .line 14
    if-eqz v5, :cond_0

    .line 15
    .line 16
    sget-object p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 17
    .line 18
    invoke-virtual {p0, p1, v3, v4}, Lsun/misc/Unsafe;->getFloat(Ljava/lang/Object;J)F

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    return p0

    .line 23
    :catch_0
    move-exception p0

    .line 24
    goto :goto_0

    .line 25
    :catch_1
    move-exception p0

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    iget-object p0, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰哲苏世:Ljava/lang/reflect/Field;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, Ljava/lang/reflect/Field;->getFloat(Ljava/lang/Object;)F

    .line 30
    .line 31
    .line 32
    move-result p0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    return p0

    .line 34
    :goto_0
    invoke-static {v2, v1, p0}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    return v0

    .line 38
    :cond_1
    invoke-static {v1, v2}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    return v0
.end method

.method public final 飘花落叶言子楪哲苏兰世(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p2}, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲兰世苏(Ljava/lang/Object;)F

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    iget-object p0, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰哲世苏:Ljava/text/DecimalFormat;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1, p2, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲兰世苏楪(FLjava/text/DecimalFormat;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲兰世楪苏(F)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final 飘花落叶言子楪苏哲世兰(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;)Z
    .locals 4

    .line 1
    invoke-virtual {p0, p2}, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲兰世苏(Ljava/lang/Object;)F

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    invoke-virtual {p0, p1}, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世苏兰(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰哲世苏:Ljava/text/DecimalFormat;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p1, p2, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲兰世苏楪(FLjava/text/DecimalFormat;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    sget-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNonStringValueAsString:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 17
    .line 18
    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 19
    .line 20
    iget-wide v2, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世苏哲:J

    .line 21
    .line 22
    and-long/2addr v0, v2

    .line 23
    const-wide/16 v2, 0x0

    .line 24
    .line 25
    cmp-long p0, v0, v2

    .line 26
    .line 27
    if-eqz p0, :cond_1

    .line 28
    .line 29
    invoke-static {p2}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子哲世苏兰(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲兰世楪苏(F)V

    .line 38
    .line 39
    .line 40
    :goto_0
    const/4 p0, 0x1

    .line 41
    return p0
.end method
