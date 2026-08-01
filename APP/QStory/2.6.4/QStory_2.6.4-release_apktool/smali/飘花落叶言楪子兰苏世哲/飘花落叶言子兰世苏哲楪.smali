.class public final L飘花落叶言楪子兰苏世哲/飘花落叶言子兰世苏哲楪;
.super L飘花落叶言楪子兰苏世哲/飘花落叶言楪子世苏哲兰;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final 飘花落叶言子楪世兰苏哲:J

.field public static final 飘花落叶言子楪世哲兰苏:[B

.field public static final 飘花落叶言子楪世哲苏兰:L飘花落叶言楪子兰苏世哲/飘花落叶言子兰世苏哲楪;


# instance fields
.field public final 飘花落叶言子楪世苏兰哲:Ljava/util/function/Function;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, L飘花落叶言楪子兰苏世哲/飘花落叶言子兰世苏哲楪;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子兰世苏哲楪;-><init>(Ljava/util/function/Function;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, L飘花落叶言楪子兰苏世哲/飘花落叶言子兰世苏哲楪;->飘花落叶言子楪世哲苏兰:L飘花落叶言楪子兰苏世哲/飘花落叶言子兰世苏哲楪;

    .line 8
    .line 9
    const-string v0, "[J"

    .line 10
    .line 11
    invoke-static {v0}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)[B

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    sput-object v1, L飘花落叶言楪子兰苏世哲/飘花落叶言子兰世苏哲楪;->飘花落叶言子楪世哲兰苏:[B

    .line 16
    .line 17
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    sput-wide v0, L飘花落叶言楪子兰苏世哲/飘花落叶言子兰世苏哲楪;->飘花落叶言子楪世兰苏哲:J

    .line 22
    .line 23
    return-void
.end method

.method public constructor <init>(Ljava/util/function/Function;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子兰世苏哲楪;->飘花落叶言子楪世苏兰哲:Ljava/util/function/Function;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪兰苏世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 2

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世子兰哲苏()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    invoke-virtual {p1, p2, p4}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏兰哲世楪(Ljava/lang/Object;Ljava/lang/reflect/Type;)Z

    .line 8
    .line 9
    .line 10
    move-result p3

    .line 11
    if-eqz p3, :cond_1

    .line 12
    .line 13
    sget-object p3, L飘花落叶言楪子兰苏世哲/飘花落叶言子兰世苏哲楪;->飘花落叶言子楪世哲兰苏:[B

    .line 14
    .line 15
    sget-wide v0, L飘花落叶言楪子兰苏世哲/飘花落叶言子兰世苏哲楪;->飘花落叶言子楪世兰苏哲:J

    .line 16
    .line 17
    invoke-virtual {p1, v0, v1, p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪苏世兰子哲(J[B)V

    .line 18
    .line 19
    .line 20
    :cond_1
    iget-object p0, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子兰世苏哲楪;->飘花落叶言子楪世苏兰哲:Ljava/util/function/Function;

    .line 21
    .line 22
    if-eqz p0, :cond_2

    .line 23
    .line 24
    invoke-interface {p0, p2}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    check-cast p0, [J

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    move-object p0, p2

    .line 32
    check-cast p0, [J

    .line 33
    .line 34
    :goto_0
    sget-object p2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNonStringValueAsString:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 35
    .line 36
    iget-wide p2, p2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 37
    .line 38
    and-long/2addr p2, p5

    .line 39
    const-wide/16 p4, 0x0

    .line 40
    .line 41
    cmp-long p2, p2, p4

    .line 42
    .line 43
    if-eqz p2, :cond_3

    .line 44
    .line 45
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪苏子哲兰世([J)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_3
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子兰世苏哲([J)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public final 飘花落叶言子楪哲苏世兰(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 0

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世子兰哲苏()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    iget-object p3, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 8
    .line 9
    iget-object p3, p3, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪子兰苏世哲/飘花落叶言楪子世苏兰哲;

    .line 10
    .line 11
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子兰世苏哲楪;->飘花落叶言子楪世苏兰哲:Ljava/util/function/Function;

    .line 15
    .line 16
    if-eqz p0, :cond_1

    .line 17
    .line 18
    invoke-interface {p0, p2}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, [J

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    move-object p0, p2

    .line 26
    check-cast p0, [J

    .line 27
    .line 28
    :goto_0
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子兰世苏哲([J)V

    .line 29
    .line 30
    .line 31
    return-void
.end method
