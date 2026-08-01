.class public final L飘花落叶言楪子兰苏世哲/飘花落叶言子世楪苏兰哲;
.super L飘花落叶言楪子兰苏世哲/飘花落叶言子楪兰哲世苏;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# direct methods
.method public constructor <init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Field;)V
    .locals 13

    .line 1
    const/4 v6, 0x0

    .line 2
    const/4 v12, 0x0

    .line 3
    sget-object v8, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 4
    .line 5
    const/4 v11, 0x0

    .line 6
    move-object v9, v8

    .line 7
    move-object v0, p0

    .line 8
    move-object v1, p1

    .line 9
    move v2, p2

    .line 10
    move-wide/from16 v3, p3

    .line 11
    .line 12
    move-object/from16 v5, p5

    .line 13
    .line 14
    move-object/from16 v7, p6

    .line 15
    .line 16
    move-object/from16 v10, p7

    .line 17
    .line 18
    invoke-direct/range {v0 .. v12}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪兰哲世苏;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;I)V

    .line 19
    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪兰世苏哲(Ljava/lang/Object;)S

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-static {p0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final 飘花落叶言子楪兰世苏哲(Ljava/lang/Object;)S
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:Ljava/lang/String;

    .line 3
    .line 4
    const-string v2, "field.get error, "

    .line 5
    .line 6
    if-eqz p1, :cond_1

    .line 7
    .line 8
    :try_start_0
    iget-wide v3, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子世楪苏兰哲:J

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
    invoke-virtual {p0, p1, v3, v4}, Lsun/misc/Unsafe;->getShort(Ljava/lang/Object;J)S

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
    iget-object p0, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰哲苏世:Ljava/lang/reflect/Field;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, Ljava/lang/reflect/Field;->getShort(Ljava/lang/Object;)S

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
    invoke-static {v2, v1, p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    return v0

    .line 38
    :cond_1
    invoke-static {v1, v2}, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    return v0
.end method

.method public final 飘花落叶言子楪哲苏兰世(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪兰世苏哲(Ljava/lang/Object;)S

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子哲世兰苏(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final 飘花落叶言子楪苏世兰哲(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪兰世苏哲(Ljava/lang/Object;)S

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    invoke-virtual {p0, p1, p2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲兰世苏(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;S)V

    .line 6
    .line 7
    .line 8
    const/4 p0, 0x1

    .line 9
    return p0
.end method
