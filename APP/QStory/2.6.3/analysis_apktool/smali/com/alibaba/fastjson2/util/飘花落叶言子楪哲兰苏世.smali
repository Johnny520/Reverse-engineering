.class public final Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲兰苏世;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;


# instance fields
.field public 飘花落叶言子楪世兰苏哲:[B

.field public final 飘花落叶言子楪世哲兰苏:Ljava/util/function/Function;

.field public final 飘花落叶言子楪世哲苏兰:J

.field public final 飘花落叶言子楪世苏兰哲:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪苏兰哲世(Ljava/lang/Class;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 9
    .line 10
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    iput-wide v0, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰:J

    .line 15
    .line 16
    :try_start_0
    const-string v0, "asMap"

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-virtual {p1, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-static {p1}, L飘花落叶言楪子哲苏世兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/reflect/Method;)Ljava/util/function/Function;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲兰苏:Ljava/util/function/Function;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    .line 29
    return-void

    .line 30
    :catch_0
    move-exception p0

    .line 31
    const-string p1, "create Guava AsMapWriter error"

    .line 32
    .line 33
    invoke-static {p1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    const/4 p0, 0x0

    .line 37
    throw p0
.end method


# virtual methods
.method public final 飘花落叶言子楪兰苏世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 0

    .line 1
    invoke-virtual {p1, p2, p4, p5, p6}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世兰哲苏楪(Ljava/lang/Object;Ljava/lang/reflect/Type;J)Z

    .line 2
    .line 3
    .line 4
    move-result p3

    .line 5
    if-eqz p3, :cond_1

    .line 6
    .line 7
    iget-object p3, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰苏哲:[B

    .line 8
    .line 9
    if-nez p3, :cond_0

    .line 10
    .line 11
    iget-object p3, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 12
    .line 13
    invoke-static {p3}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)[B

    .line 14
    .line 15
    .line 16
    move-result-object p3

    .line 17
    iput-object p3, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰苏哲:[B

    .line 18
    .line 19
    :cond_0
    iget-object p3, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰苏哲:[B

    .line 20
    .line 21
    iget-wide p4, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰:J

    .line 22
    .line 23
    invoke-virtual {p1, p4, p5, p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世子苏哲兰(J[B)V

    .line 24
    .line 25
    .line 26
    :cond_1
    iget-object p0, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲兰苏:Ljava/util/function/Function;

    .line 27
    .line 28
    invoke-interface {p0, p2}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    check-cast p0, Ljava/util/Map;

    .line 33
    .line 34
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏兰世楪哲(Ljava/util/Map;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final 飘花落叶言子楪哲苏世兰(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲兰苏:Ljava/util/function/Function;

    .line 2
    .line 3
    invoke-interface {p0, p2}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/util/Map;

    .line 8
    .line 9
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏兰世楪哲(Ljava/util/Map;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
