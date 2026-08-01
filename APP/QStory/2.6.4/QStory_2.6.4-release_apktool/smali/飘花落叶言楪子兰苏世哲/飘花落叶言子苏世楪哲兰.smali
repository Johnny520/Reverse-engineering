.class public final L飘花落叶言楪子兰苏世哲/飘花落叶言子苏世楪哲兰;
.super L飘花落叶言楪子兰苏世哲/飘花落叶言子苏楪世哲兰;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子苏楪兰哲世:Ljava/util/function/Function;


# direct methods
.method public constructor <init>(IJLjava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;Ljava/lang/reflect/Type;Ljava/util/function/Function;)V
    .locals 2

    .line 1
    move-wide v0, p2

    .line 2
    move p2, p1

    .line 3
    move-object p1, p5

    .line 4
    move-object p5, p6

    .line 5
    move-object p6, p7

    .line 6
    move-object p7, p10

    .line 7
    move-object p10, p9

    .line 8
    move-object p9, p8

    .line 9
    move-object p8, p4

    .line 10
    move-wide p3, v0

    .line 11
    invoke-direct/range {p0 .. p10}, L飘花落叶言楪子兰苏世哲/飘花落叶言子苏楪世哲兰;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;)V

    .line 12
    .line 13
    .line 14
    iput-object p11, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子苏世楪哲兰;->飘花落叶言子苏楪兰哲世:Ljava/util/function/Function;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏兰哲()Ljava/util/function/Function;
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子苏世楪哲兰;->飘花落叶言子苏楪兰哲世:Ljava/util/function/Function;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子苏世楪哲兰;->飘花落叶言子苏楪兰哲世:Ljava/util/function/Function;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final 飘花落叶言子楪苏世兰哲(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;)Z
    .locals 7

    .line 1
    iget-object v0, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子苏世楪哲兰;->飘花落叶言子苏楪兰哲世:Ljava/util/function/Function;

    .line 2
    .line 3
    invoke-interface {v0, p2}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    move-object v2, p2

    .line 8
    check-cast v2, Ljava/util/UUID;

    .line 9
    .line 10
    const/4 p2, 0x1

    .line 11
    if-nez v2, :cond_1

    .line 12
    .line 13
    iget-wide v0, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:J

    .line 14
    .line 15
    iget-object v2, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 16
    .line 17
    iget-wide v2, v2, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 18
    .line 19
    or-long/2addr v0, v2

    .line 20
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNulls:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 21
    .line 22
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 23
    .line 24
    and-long/2addr v0, v2

    .line 25
    const-wide/16 v2, 0x0

    .line 26
    .line 27
    cmp-long v0, v0, v2

    .line 28
    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    invoke-virtual {p0, p1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲兰世(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世子兰哲苏()V

    .line 35
    .line 36
    .line 37
    return p2

    .line 38
    :cond_0
    const/4 p0, 0x0

    .line 39
    return p0

    .line 40
    :cond_1
    invoke-virtual {p0, p1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲兰世(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;)V

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子苏楪世哲兰;->飘花落叶言子苏楪哲兰世:L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰楪哲世;

    .line 44
    .line 45
    if-nez v0, :cond_2

    .line 46
    .line 47
    const-class v0, Ljava/util/UUID;

    .line 48
    .line 49
    invoke-virtual {p0, p1, v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Class;)L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰楪哲世;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iput-object v0, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子苏楪世哲兰;->飘花落叶言子苏楪哲兰世:L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰楪哲世;

    .line 54
    .line 55
    :cond_2
    iget-object v0, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子苏楪世哲兰;->飘花落叶言子苏楪哲兰世:L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰楪哲世;

    .line 56
    .line 57
    sget-object v1, L飘花落叶言楪子兰苏世哲/飘花落叶言子哲苏世楪兰;->飘花落叶言子楪兰哲世苏:L飘花落叶言楪子兰苏世哲/飘花落叶言子哲苏世楪兰;

    .line 58
    .line 59
    if-eq v0, v1, :cond_3

    .line 60
    .line 61
    iget-object v0, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子苏楪世哲兰;->飘花落叶言子苏楪哲兰世:L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰楪哲世;

    .line 62
    .line 63
    iget-object v3, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:Ljava/lang/String;

    .line 64
    .line 65
    iget-object v4, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子苏楪世哲兰;->飘花落叶言子苏楪哲世兰:Ljava/lang/Class;

    .line 66
    .line 67
    iget-wide v5, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:J

    .line 68
    .line 69
    move-object v1, p1

    .line 70
    invoke-interface/range {v0 .. v6}, L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰楪哲世;->飘花落叶言子楪哲苏世兰(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 71
    .line 72
    .line 73
    return p2

    .line 74
    :cond_3
    move-object v1, p1

    .line 75
    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪苏哲子世兰(Ljava/util/UUID;)V

    .line 76
    .line 77
    .line 78
    return p2
.end method
