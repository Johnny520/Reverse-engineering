.class public final L飘花落叶言楪子哲兰世苏/飘花落叶言子哲兰世苏楪;
.super L飘花落叶言楪子哲兰世苏/飘花落叶言子兰哲苏世楪;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final 飘花落叶言子楪世兰苏哲:J

.field public static final 飘花落叶言子楪世哲兰苏:[B

.field public static final 飘花落叶言子楪世哲苏兰:L飘花落叶言楪子哲兰世苏/飘花落叶言子哲兰世苏楪;

.field public static final 飘花落叶言子楪世苏兰哲:L飘花落叶言楪子哲兰世苏/飘花落叶言子哲兰世苏楪;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子哲兰世苏楪;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子哲兰世苏楪;->飘花落叶言子楪世苏兰哲:L飘花落叶言楪子哲兰世苏/飘花落叶言子哲兰世苏楪;

    .line 7
    .line 8
    new-instance v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子哲兰世苏楪;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子哲兰世苏楪;->飘花落叶言子楪世哲苏兰:L飘花落叶言楪子哲兰世苏/飘花落叶言子哲兰世苏楪;

    .line 14
    .line 15
    const-class v0, Ljava/util/Currency;

    .line 16
    .line 17
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪苏兰哲世(Ljava/lang/Class;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-static {v1}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)[B

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    sput-object v1, L飘花落叶言楪子哲兰世苏/飘花落叶言子哲兰世苏楪;->飘花落叶言子楪世哲兰苏:[B

    .line 26
    .line 27
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪苏兰哲世(Ljava/lang/Class;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)J

    .line 32
    .line 33
    .line 34
    move-result-wide v0

    .line 35
    sput-wide v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子哲兰世苏楪;->飘花落叶言子楪世兰苏哲:J

    .line 36
    .line 37
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪兰苏世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 0

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰哲楪苏世()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    check-cast p2, Ljava/util/Currency;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世哲苏兰楪(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-eqz p0, :cond_1

    .line 14
    .line 15
    sget-object p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子哲兰世苏楪;->飘花落叶言子楪世哲兰苏:[B

    .line 16
    .line 17
    sget-wide p3, L飘花落叶言楪子哲兰世苏/飘花落叶言子哲兰世苏楪;->飘花落叶言子楪世兰苏哲:J

    .line 18
    .line 19
    invoke-virtual {p1, p3, p4, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世子苏哲兰(J[B)V

    .line 20
    .line 21
    .line 22
    :cond_1
    invoke-virtual {p2}, Ljava/util/Currency;->getCurrencyCode()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子哲世苏兰(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final 飘花落叶言子楪哲苏世兰(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 1

    .line 1
    iget-boolean v0, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰世苏哲:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual/range {p0 .. p6}, L飘花落叶言楪子哲兰世苏/飘花落叶言子哲兰世苏楪;->飘花落叶言子楪兰苏世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    if-nez p2, :cond_1

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰哲楪苏世()V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_1
    check-cast p2, Ljava/util/Currency;

    .line 16
    .line 17
    invoke-virtual {p2}, Ljava/util/Currency;->getCurrencyCode()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子哲世苏兰(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method
