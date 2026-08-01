.class public final L飘花落叶言楪子哲兰世苏/飘花落叶言子兰哲世楪苏;
.super L飘花落叶言楪子哲兰世苏/飘花落叶言子兰哲苏世楪;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final 飘花落叶言子楪世哲兰苏:L飘花落叶言楪子哲兰世苏/飘花落叶言子兰哲世楪苏;

.field public static final 飘花落叶言子楪世哲苏兰:J

.field public static final 飘花落叶言子楪世苏兰哲:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "[String"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)[B

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    sput-object v1, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰哲世楪苏;->飘花落叶言子楪世苏兰哲:[B

    .line 8
    .line 9
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    sput-wide v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰哲世楪苏;->飘花落叶言子楪世哲苏兰:J

    .line 14
    .line 15
    new-instance v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰哲世楪苏;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰哲世楪苏;->飘花落叶言子楪世哲兰苏:L飘花落叶言楪子哲兰世苏/飘花落叶言子兰哲世楪苏;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪兰苏世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 0

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏兰哲楪世()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    invoke-virtual {p1, p2, p4, p5, p6}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏楪世哲兰(Ljava/lang/Object;Ljava/lang/reflect/Type;J)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_1

    .line 12
    .line 13
    sget-object p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰哲世楪苏;->飘花落叶言子楪世苏兰哲:[B

    .line 14
    .line 15
    sget-wide p3, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰哲世楪苏;->飘花落叶言子楪世哲苏兰:J

    .line 16
    .line 17
    invoke-virtual {p1, p3, p4, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世子苏哲兰(J[B)V

    .line 18
    .line 19
    .line 20
    :cond_1
    check-cast p2, [Ljava/lang/String;

    .line 21
    .line 22
    array-length p0, p2

    .line 23
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏哲兰世楪(I)V

    .line 24
    .line 25
    .line 26
    const/4 p0, 0x0

    .line 27
    :goto_0
    array-length p3, p2

    .line 28
    if-ge p0, p3, :cond_4

    .line 29
    .line 30
    aget-object p3, p2, p0

    .line 31
    .line 32
    if-nez p3, :cond_3

    .line 33
    .line 34
    sget-object p3, Lcom/alibaba/fastjson2/JSONWriter$Feature;->NullAsDefaultValue:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 35
    .line 36
    iget-wide p3, p3, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 37
    .line 38
    sget-object p5, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNullStringAsEmpty:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 39
    .line 40
    iget-wide p5, p5, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 41
    .line 42
    or-long/2addr p3, p5

    .line 43
    invoke-virtual {p1, p3, p4}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲世苏兰(J)Z

    .line 44
    .line 45
    .line 46
    move-result p3

    .line 47
    if-eqz p3, :cond_2

    .line 48
    .line 49
    const-string p3, ""

    .line 50
    .line 51
    invoke-virtual {p1, p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子哲世苏兰(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_2
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰哲楪苏世()V

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_3
    invoke-virtual {p1, p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子哲世苏兰(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    :goto_1
    add-int/lit8 p0, p0, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_4
    return-void
.end method

.method public final 飘花落叶言子楪哲苏世兰(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 0

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏兰哲楪世()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    check-cast p2, [Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子兰世苏哲([Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
