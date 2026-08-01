.class public final L飘花落叶言楪子哲兰世苏/飘花落叶言子哲苏楪世兰;
.super L飘花落叶言楪子哲兰世苏/飘花落叶言子兰哲苏世楪;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final 飘花落叶言子楪世哲苏兰:[B

.field public static final 飘花落叶言子楪世苏兰哲:L飘花落叶言楪子哲兰世苏/飘花落叶言子哲苏楪世兰;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子哲苏楪世兰;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子哲苏楪世兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言楪子哲兰世苏/飘花落叶言子哲苏楪世兰;

    .line 7
    .line 8
    const-string v0, "[BigDecimal"

    .line 9
    .line 10
    invoke-static {v0}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)[B

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子哲苏楪世兰;->飘花落叶言子楪世哲苏兰:[B

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪兰苏世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 1

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
    invoke-virtual {p1, p2, p4}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世兰楪哲苏(Ljava/lang/Object;Ljava/lang/reflect/Type;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_1

    .line 12
    .line 13
    sget-object p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子哲苏楪世兰;->飘花落叶言子楪世哲苏兰:[B

    .line 14
    .line 15
    const-wide p3, -0x1dad997bece99df5L    # -4.238441007007491E165

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, p3, p4, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世子苏哲兰(J[B)V

    .line 21
    .line 22
    .line 23
    :cond_1
    check-cast p2, [Ljava/math/BigDecimal;

    .line 24
    .line 25
    array-length p0, p2

    .line 26
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏哲兰世楪(I)V

    .line 27
    .line 28
    .line 29
    array-length p0, p2

    .line 30
    const/4 p3, 0x0

    .line 31
    :goto_0
    if-ge p3, p0, :cond_2

    .line 32
    .line 33
    aget-object p4, p2, p3

    .line 34
    .line 35
    const-wide/16 p5, 0x0

    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    invoke-virtual {p1, p4, p5, p6, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲苏世楪兰(Ljava/math/BigDecimal;JLjava/text/DecimalFormat;)V

    .line 39
    .line 40
    .line 41
    add-int/lit8 p3, p3, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    return-void
.end method

.method public final 飘花落叶言子楪哲苏世兰(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 0

    .line 1
    if-nez p2, :cond_1

    .line 2
    .line 3
    sget-object p0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->NullAsDefaultValue:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 4
    .line 5
    iget-wide p2, p0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 6
    .line 7
    sget-object p0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNullListAsEmpty:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 8
    .line 9
    iget-wide p4, p0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 10
    .line 11
    or-long/2addr p2, p4

    .line 12
    invoke-virtual {p1, p2, p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲世苏兰(J)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏哲兰楪世()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪世哲苏兰()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰哲楪苏世()V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    check-cast p2, [Ljava/math/BigDecimal;

    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏哲兰楪世()V

    .line 32
    .line 33
    .line 34
    const/4 p0, 0x0

    .line 35
    :goto_0
    array-length p3, p2

    .line 36
    if-ge p0, p3, :cond_3

    .line 37
    .line 38
    if-eqz p0, :cond_2

    .line 39
    .line 40
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲世苏楪兰()V

    .line 41
    .line 42
    .line 43
    :cond_2
    aget-object p3, p2, p0

    .line 44
    .line 45
    const-wide/16 p4, 0x0

    .line 46
    .line 47
    const/4 p6, 0x0

    .line 48
    invoke-virtual {p1, p3, p4, p5, p6}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲苏世楪兰(Ljava/math/BigDecimal;JLjava/text/DecimalFormat;)V

    .line 49
    .line 50
    .line 51
    add-int/lit8 p0, p0, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_3
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪世哲苏兰()V

    .line 55
    .line 56
    .line 57
    return-void
.end method
