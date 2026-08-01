.class public final L飘花落叶言楪子兰苏世哲/飘花落叶言子兰世楪哲苏;
.super L飘花落叶言楪子兰苏世哲/飘花落叶言楪子世苏哲兰;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final 飘花落叶言子楪世兰苏哲:J

.field public static final 飘花落叶言子楪世哲兰苏:[B

.field public static final 飘花落叶言子楪世哲苏兰:L飘花落叶言楪子兰苏世哲/飘花落叶言子兰世楪哲苏;


# instance fields
.field public final 飘花落叶言子楪世苏兰哲:Ljava/util/function/Function;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, L飘花落叶言楪子兰苏世哲/飘花落叶言子兰世楪哲苏;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子兰世楪哲苏;-><init>(Ljava/util/function/Function;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, L飘花落叶言楪子兰苏世哲/飘花落叶言子兰世楪哲苏;->飘花落叶言子楪世哲苏兰:L飘花落叶言楪子兰苏世哲/飘花落叶言子兰世楪哲苏;

    .line 8
    .line 9
    const-string v0, "[I"

    .line 10
    .line 11
    invoke-static {v0}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)[B

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    sput-object v1, L飘花落叶言楪子兰苏世哲/飘花落叶言子兰世楪哲苏;->飘花落叶言子楪世哲兰苏:[B

    .line 16
    .line 17
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    sput-wide v0, L飘花落叶言楪子兰苏世哲/飘花落叶言子兰世楪哲苏;->飘花落叶言子楪世兰苏哲:J

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
    iput-object p1, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子兰世楪哲苏;->飘花落叶言子楪世苏兰哲:Ljava/util/function/Function;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪兰苏世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
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
    invoke-virtual {p1, p2, p4}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏兰哲世楪(Ljava/lang/Object;Ljava/lang/reflect/Type;)Z

    .line 8
    .line 9
    .line 10
    move-result p3

    .line 11
    if-eqz p3, :cond_1

    .line 12
    .line 13
    sget-object p3, L飘花落叶言楪子兰苏世哲/飘花落叶言子兰世楪哲苏;->飘花落叶言子楪世哲兰苏:[B

    .line 14
    .line 15
    sget-wide p4, L飘花落叶言楪子兰苏世哲/飘花落叶言子兰世楪哲苏;->飘花落叶言子楪世兰苏哲:J

    .line 16
    .line 17
    invoke-virtual {p1, p4, p5, p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪苏世兰子哲(J[B)V

    .line 18
    .line 19
    .line 20
    :cond_1
    iget-object p0, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子兰世楪哲苏;->飘花落叶言子楪世苏兰哲:Ljava/util/function/Function;

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
    check-cast p0, [I

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    move-object p0, p2

    .line 32
    check-cast p0, [I

    .line 33
    .line 34
    :goto_0
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子哲苏兰世([I)V

    .line 35
    .line 36
    .line 37
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
    iget-object p0, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子兰世楪哲苏;->飘花落叶言子楪世苏兰哲:Ljava/util/function/Function;

    .line 8
    .line 9
    if-eqz p0, :cond_1

    .line 10
    .line 11
    invoke-interface {p0, p2}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, [I

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    move-object p0, p2

    .line 19
    check-cast p0, [I

    .line 20
    .line 21
    :goto_0
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子哲苏兰世([I)V

    .line 22
    .line 23
    .line 24
    return-void
.end method
