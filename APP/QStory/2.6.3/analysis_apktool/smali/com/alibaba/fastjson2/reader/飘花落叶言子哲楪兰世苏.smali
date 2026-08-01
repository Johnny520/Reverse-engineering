.class public final Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪兰世苏;
.super Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏世兰哲;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final 飘花落叶言子楪世兰苏哲:Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪兰世苏;


# instance fields
.field public final 飘花落叶言子楪世哲兰苏:Ljava/util/function/Function;

.field public final 飘花落叶言子楪世哲苏兰:Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世苏哲;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪兰世苏;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪兰世苏;-><init>(Ljava/util/function/Function;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪兰世苏;->飘花落叶言子楪世兰苏哲:Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪兰世苏;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ljava/util/function/Function;)V
    .locals 2

    .line 1
    const-class v0, Ljava/math/BigDecimal;

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏世兰哲;-><init>(Ljava/lang/Class;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世苏哲;

    .line 7
    .line 8
    const/4 v1, 0x6

    .line 9
    invoke-direct {v0, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世苏哲;-><init>(I)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪兰世苏;->飘花落叶言子楪世哲苏兰:Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世苏哲;

    .line 13
    .line 14
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪兰世苏;->飘花落叶言子楪世哲兰苏:Ljava/util/function/Function;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰世楪苏哲()Ljava/math/BigDecimal;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪兰世苏;->飘花落叶言子楪世哲兰苏:Ljava/util/function/Function;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    invoke-interface {p0, p1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    return-object p1
.end method

.method public final 飘花落叶言子楪苏兰世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰世楪苏哲()Ljava/math/BigDecimal;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪兰世苏;->飘花落叶言子楪世哲兰苏:Ljava/util/function/Function;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    invoke-interface {p0, p1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    return-object p1
.end method

.method public final 飘花落叶言子楪苏哲兰世(Ljava/util/Map;J)Ljava/lang/Object;
    .locals 0

    .line 1
    const-string p2, "value"

    .line 2
    .line 3
    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    if-nez p2, :cond_0

    .line 8
    .line 9
    const-string p2, "$numberDecimal"

    .line 10
    .line 11
    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    :cond_0
    instance-of p1, p2, Ljava/math/BigDecimal;

    .line 16
    .line 17
    if-nez p1, :cond_1

    .line 18
    .line 19
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪兰世苏;->飘花落叶言子楪世哲苏兰:Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世苏哲;

    .line 20
    .line 21
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世苏哲;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    :cond_1
    check-cast p2, Ljava/math/BigDecimal;

    .line 26
    .line 27
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪兰世苏;->飘花落叶言子楪世哲兰苏:Ljava/util/function/Function;

    .line 28
    .line 29
    if-eqz p0, :cond_2

    .line 30
    .line 31
    invoke-interface {p0, p2}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :cond_2
    return-object p2
.end method
