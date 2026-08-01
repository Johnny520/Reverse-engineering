.class public final L飘花落叶言楪子哲兰世苏/飘花落叶言子世苏楪兰哲;
.super L飘花落叶言楪子哲兰世苏/飘花落叶言子世楪苏兰哲;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# direct methods
.method public constructor <init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Field;)V
    .locals 10

    .line 1
    sget-object v7, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 2
    .line 3
    const/4 v9, 0x0

    .line 4
    move-object v0, p0

    .line 5
    move-object v1, p1

    .line 6
    move v2, p2

    .line 7
    move-wide v3, p3

    .line 8
    move-object v5, p5

    .line 9
    move-object/from16 v6, p6

    .line 10
    .line 11
    move-object/from16 v8, p7

    .line 12
    .line 13
    invoke-direct/range {v0 .. v9}, L飘花落叶言楪子哲兰世苏/飘花落叶言子世楪苏兰哲;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, L飘花落叶言楪子哲兰世苏/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪兰世苏哲(Ljava/lang/Object;)J

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final 飘花落叶言子楪兰世苏哲(Ljava/lang/Object;)J
    .locals 8

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iget-object v2, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Ljava/lang/String;

    .line 4
    .line 5
    const-string v3, "field.get error, "

    .line 6
    .line 7
    if-eqz p1, :cond_1

    .line 8
    .line 9
    :try_start_0
    iget-wide v4, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪苏兰哲:J

    .line 10
    .line 11
    const-wide/16 v6, -0x1

    .line 12
    .line 13
    cmp-long v6, v4, v6

    .line 14
    .line 15
    if-eqz v6, :cond_0

    .line 16
    .line 17
    sget-object p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 18
    .line 19
    invoke-virtual {p0, p1, v4, v5}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 20
    .line 21
    .line 22
    move-result-wide p0

    .line 23
    return-wide p0

    .line 24
    :catch_0
    move-exception p0

    .line 25
    goto :goto_0

    .line 26
    :catch_1
    move-exception p0

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iget-object p0, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰哲苏世:Ljava/lang/reflect/Field;

    .line 29
    .line 30
    invoke-virtual {p0, p1}, Ljava/lang/reflect/Field;->getLong(Ljava/lang/Object;)J

    .line 31
    .line 32
    .line 33
    move-result-wide p0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    return-wide p0

    .line 35
    :goto_0
    invoke-static {v3, v2, p0}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 36
    .line 37
    .line 38
    return-wide v0

    .line 39
    :cond_1
    invoke-static {v2, v3}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-wide v0
.end method

.method public final 飘花落叶言子楪哲苏兰世(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-virtual {p0, p2}, L飘花落叶言楪子哲兰世苏/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪兰世苏哲(Ljava/lang/Object;)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-virtual {p1, v0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰世楪苏哲(J)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final 飘花落叶言子楪苏哲世兰(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;)Z
    .locals 4

    .line 1
    invoke-virtual {p0, p2}, L飘花落叶言楪子哲兰世苏/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪兰世苏哲(Ljava/lang/Object;)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    cmp-long p2, v0, v2

    .line 8
    .line 9
    if-nez p2, :cond_0

    .line 10
    .line 11
    sget-object p2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->NotWriteDefaultValue:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏世兰(Lcom/alibaba/fastjson2/JSONWriter$Feature;)Z

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    if-eqz p2, :cond_0

    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return p0

    .line 21
    :cond_0
    invoke-virtual {p0, p1, v0, v1}, L飘花落叶言楪子哲兰世苏/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰苏世(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;J)V

    .line 22
    .line 23
    .line 24
    const/4 p0, 0x1

    .line 25
    return p0
.end method
