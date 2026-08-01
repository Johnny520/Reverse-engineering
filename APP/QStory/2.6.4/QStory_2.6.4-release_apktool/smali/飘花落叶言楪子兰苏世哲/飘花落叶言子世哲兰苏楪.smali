.class public abstract L飘花落叶言楪子兰苏世哲/飘花落叶言子世哲兰苏楪;
.super L飘花落叶言楪子兰苏世哲/飘花落叶言子世兰哲楪苏;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子苏楪世兰哲:Ljava/lang/Class;

.field public final 飘花落叶言子苏楪哲世兰:Lcom/alibaba/fastjson2/util/飘花落叶言子世哲苏楪兰;


# direct methods
.method public constructor <init>(Ljava/lang/String;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;Ljava/lang/Class;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p11}, L飘花落叶言楪子兰苏世哲/飘花落叶言子世兰哲楪苏;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;)V

    .line 2
    .line 3
    .line 4
    instance-of p1, p8, Ljava/lang/reflect/ParameterizedType;

    .line 5
    .line 6
    const/4 p2, 0x1

    .line 7
    const/4 p3, 0x0

    .line 8
    const/4 p4, 0x2

    .line 9
    const/4 p5, 0x0

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    check-cast p8, Ljava/lang/reflect/ParameterizedType;

    .line 13
    .line 14
    invoke-interface {p8}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    array-length p6, p1

    .line 19
    if-ne p6, p4, :cond_0

    .line 20
    .line 21
    aget-object p6, p1, p3

    .line 22
    .line 23
    aget-object p1, p1, p2

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move-object p1, p5

    .line 27
    :goto_0
    if-nez p1, :cond_1

    .line 28
    .line 29
    const-class p1, Ljava/lang/Object;

    .line 30
    .line 31
    :cond_1
    if-eqz p12, :cond_2

    .line 32
    .line 33
    new-instance p5, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲苏楪兰;

    .line 34
    .line 35
    new-array p4, p4, [Ljava/lang/reflect/Type;

    .line 36
    .line 37
    const-class p6, Ljava/lang/String;

    .line 38
    .line 39
    aput-object p6, p4, p3

    .line 40
    .line 41
    aput-object p12, p4, p2

    .line 42
    .line 43
    invoke-direct {p5, p9, p4}, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲苏楪兰;-><init>(Ljava/lang/Class;[Ljava/lang/reflect/Type;)V

    .line 44
    .line 45
    .line 46
    :cond_2
    iput-object p12, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子世哲兰苏楪;->飘花落叶言子苏楪世兰哲:Ljava/lang/Class;

    .line 47
    .line 48
    iput-object p5, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子世哲兰苏楪;->飘花落叶言子苏楪哲世兰:Lcom/alibaba/fastjson2/util/飘花落叶言子世哲苏楪兰;

    .line 49
    .line 50
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言楪子世苏兰哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/Class;)Z

    .line 55
    .line 56
    .line 57
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Class;)L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰楪哲世;
    .locals 7

    .line 1
    iget-object v1, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子世哲兰苏楪;->飘花落叶言子苏楪世兰哲:Ljava/lang/Class;

    .line 2
    .line 3
    if-eqz v1, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Class;

    .line 6
    .line 7
    invoke-virtual {v0, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    :cond_0
    move-object v3, p2

    .line 14
    goto :goto_0

    .line 15
    :cond_1
    const-wide/high16 v2, -0x8000000000000000L

    .line 16
    .line 17
    iget-wide v4, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:J

    .line 18
    .line 19
    or-long v5, v4, v2

    .line 20
    .line 21
    new-instance v0, L飘花落叶言楪子兰苏世哲/飘花落叶言子兰苏哲世楪;

    .line 22
    .line 23
    iget-object v2, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏世哲:Ljava/lang/String;

    .line 24
    .line 25
    iget-object v4, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子世哲兰苏楪;->飘花落叶言子苏楪哲世兰:Lcom/alibaba/fastjson2/util/飘花落叶言子世哲苏楪兰;

    .line 26
    .line 27
    move-object v3, p2

    .line 28
    invoke-direct/range {v0 .. v6}, L飘花落叶言楪子兰苏世哲/飘花落叶言子兰苏哲世楪;-><init>(Ljava/lang/reflect/Type;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/reflect/Type;J)V

    .line 29
    .line 30
    .line 31
    return-object v0

    .line 32
    :goto_0
    invoke-super {p0, p1, v3}, L飘花落叶言楪子兰苏世哲/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Class;)L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰楪哲世;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method
