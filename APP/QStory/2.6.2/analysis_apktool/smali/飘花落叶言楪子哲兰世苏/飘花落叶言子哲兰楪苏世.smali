.class public final L飘花落叶言楪子哲兰世苏/飘花落叶言子哲兰楪苏世;
.super L飘花落叶言楪子哲兰世苏/飘花落叶言子兰哲苏世楪;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final 飘花落叶言子楪世兰苏哲:J

.field public static final 飘花落叶言子楪世哲兰苏:[B

.field public static final 飘花落叶言子楪世哲苏兰:L飘花落叶言楪子哲兰世苏/飘花落叶言子哲兰楪苏世;


# instance fields
.field public final 飘花落叶言子楪世苏兰哲:Ljava/util/function/Function;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子哲兰楪苏世;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, L飘花落叶言楪子哲兰世苏/飘花落叶言子哲兰楪苏世;-><init>(Ljava/util/function/Function;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子哲兰楪苏世;->飘花落叶言子楪世哲苏兰:L飘花落叶言楪子哲兰世苏/飘花落叶言子哲兰楪苏世;

    .line 8
    .line 9
    const-string v0, "[C"

    .line 10
    .line 11
    invoke-static {v0}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)[B

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    sput-object v1, L飘花落叶言楪子哲兰世苏/飘花落叶言子哲兰楪苏世;->飘花落叶言子楪世哲兰苏:[B

    .line 16
    .line 17
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    sput-wide v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子哲兰楪苏世;->飘花落叶言子楪世兰苏哲:J

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
    iput-object p1, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子哲兰楪苏世;->飘花落叶言子楪世苏兰哲:Ljava/util/function/Function;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪兰苏世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 0

    .line 1
    invoke-virtual {p1, p2, p4, p5, p6}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏楪世哲兰(Ljava/lang/Object;Ljava/lang/reflect/Type;J)Z

    .line 2
    .line 3
    .line 4
    move-result p3

    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    sget-object p3, L飘花落叶言楪子哲兰世苏/飘花落叶言子哲兰楪苏世;->飘花落叶言子楪世哲兰苏:[B

    .line 8
    .line 9
    sget-wide p4, L飘花落叶言楪子哲兰世苏/飘花落叶言子哲兰楪苏世;->飘花落叶言子楪世兰苏哲:J

    .line 10
    .line 11
    invoke-virtual {p1, p4, p5, p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世子苏哲兰(J[B)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object p0, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子哲兰楪苏世;->飘花落叶言子楪世苏兰哲:Ljava/util/function/Function;

    .line 15
    .line 16
    if-eqz p0, :cond_1

    .line 17
    .line 18
    if-eqz p2, :cond_1

    .line 19
    .line 20
    invoke-interface {p0, p2}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    check-cast p0, [C

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    move-object p0, p2

    .line 28
    check-cast p0, [C

    .line 29
    .line 30
    :goto_0
    array-length p2, p0

    .line 31
    invoke-virtual {p1, p2, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子苏兰世哲(I[C)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final 飘花落叶言子楪哲苏世兰(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子哲兰楪苏世;->飘花落叶言子楪世苏兰哲:Ljava/util/function/Function;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    invoke-interface {p0, p2}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, [C

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object p0, p2

    .line 15
    check-cast p0, [C

    .line 16
    .line 17
    :goto_0
    iget-boolean p2, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲兰苏世:Z

    .line 18
    .line 19
    if-eqz p2, :cond_1

    .line 20
    .line 21
    array-length p2, p0

    .line 22
    invoke-virtual {p1, p2, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子苏兰世哲(I[C)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    new-instance p2, Ljava/lang/String;

    .line 27
    .line 28
    invoke-direct {p2, p0}, Ljava/lang/String;-><init>([C)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子哲世苏兰(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method
