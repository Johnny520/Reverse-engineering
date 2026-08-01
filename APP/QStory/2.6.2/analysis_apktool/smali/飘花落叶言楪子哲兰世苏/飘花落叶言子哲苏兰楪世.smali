.class public final L飘花落叶言楪子哲兰世苏/飘花落叶言子哲苏兰楪世;
.super L飘花落叶言楪子哲兰世苏/飘花落叶言子兰哲苏世楪;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final 飘花落叶言子楪世兰苏哲:L飘花落叶言楪子哲兰世苏/飘花落叶言子哲苏兰楪世;


# instance fields
.field public final 飘花落叶言子楪世哲兰苏:Ljava/lang/Object;

.field public final 飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪世苏兰哲:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子哲苏兰楪世;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v1, v2, v1}, L飘花落叶言楪子哲兰世苏/飘花落叶言子哲苏兰楪世;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子哲苏兰楪世;->飘花落叶言子楪世兰苏哲:L飘花落叶言楪子哲兰世苏/飘花落叶言子哲苏兰楪世;

    .line 9
    .line 10
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子哲苏兰楪世;->飘花落叶言子楪世苏兰哲:I

    .line 2
    .line 3
    iput-object p1, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子哲苏兰楪世;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子哲苏兰楪世;->飘花落叶言子楪世哲兰苏:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public 飘花落叶言子楪世苏哲兰()Ljava/util/function/Function;
    .locals 1

    .line 1
    iget v0, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子哲苏兰楪世;->飘花落叶言子楪世苏兰哲:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰哲苏世楪;->飘花落叶言子楪世苏哲兰()Ljava/util/function/Function;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    iget-object p0, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子哲苏兰楪世;->飘花落叶言子楪世哲兰苏:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Ljava/util/function/Function;

    .line 14
    .line 15
    return-object p0

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final 飘花落叶言子楪兰苏世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 1

    .line 1
    iget p3, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子哲苏兰楪世;->飘花落叶言子楪世苏兰哲:I

    .line 2
    .line 3
    iget-object v0, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子哲苏兰楪世;->飘花落叶言子楪世哲兰苏:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子哲苏兰楪世;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch p3, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    if-nez p2, :cond_0

    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏兰哲楪世()V

    .line 13
    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    invoke-virtual {p1, p2, p4, p5, p6}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏楪世哲兰(Ljava/lang/Object;Ljava/lang/reflect/Type;J)Z

    .line 17
    .line 18
    .line 19
    move-result p3

    .line 20
    if-eqz p3, :cond_1

    .line 21
    .line 22
    sget-object p3, L飘花落叶言楪子哲兰世苏/飘花落叶言子哲苏兰世楪;->飘花落叶言子楪世哲苏兰:[B

    .line 23
    .line 24
    sget-wide p4, L飘花落叶言楪子哲兰世苏/飘花落叶言子哲苏兰世楪;->飘花落叶言子楪世哲兰苏:J

    .line 25
    .line 26
    invoke-virtual {p1, p4, p5, p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世子苏哲兰(J[B)V

    .line 27
    .line 28
    .line 29
    :cond_1
    check-cast p0, L飘花落叶言楪子哲兰世苏/飘花落叶言楪子世苏兰哲;

    .line 30
    .line 31
    invoke-virtual {p0, p2}, L飘花落叶言楪子哲兰世苏/飘花落叶言楪子世苏兰哲;->applyAsInt(Ljava/lang/Object;)I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏哲兰世楪(I)V

    .line 36
    .line 37
    .line 38
    const/4 p3, 0x0

    .line 39
    :goto_0
    if-ge p3, p0, :cond_2

    .line 40
    .line 41
    move-object p4, v0

    .line 42
    check-cast p4, Ljava/util/function/BiFunction;

    .line 43
    .line 44
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object p5

    .line 48
    invoke-interface {p4, p2, p5}, Ljava/util/function/BiFunction;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p4

    .line 52
    check-cast p4, Ljava/lang/Boolean;

    .line 53
    .line 54
    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 55
    .line 56
    .line 57
    move-result p4

    .line 58
    invoke-virtual {p1, p4}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲楪苏兰世(Z)V

    .line 59
    .line 60
    .line 61
    add-int/lit8 p3, p3, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    :goto_1
    return-void

    .line 65
    :pswitch_0
    check-cast v0, Ljava/util/function/Function;

    .line 66
    .line 67
    if-eqz v0, :cond_3

    .line 68
    .line 69
    if-eqz p2, :cond_3

    .line 70
    .line 71
    invoke-interface {v0, p2}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    check-cast p2, Ljava/math/BigDecimal;

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_3
    check-cast p2, Ljava/math/BigDecimal;

    .line 79
    .line 80
    :goto_2
    check-cast p0, Ljava/text/DecimalFormat;

    .line 81
    .line 82
    invoke-virtual {p1, p2, p5, p6, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲苏世楪兰(Ljava/math/BigDecimal;JLjava/text/DecimalFormat;)V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    nop

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final 飘花落叶言子楪哲苏世兰(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 0

    .line 1
    iget p3, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子哲苏兰楪世;->飘花落叶言子楪世苏兰哲:I

    .line 2
    .line 3
    iget-object p4, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子哲苏兰楪世;->飘花落叶言子楪世哲兰苏:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子哲苏兰楪世;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch p3, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    if-nez p2, :cond_0

    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏兰哲楪世()V

    .line 13
    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    check-cast p0, L飘花落叶言楪子哲兰世苏/飘花落叶言楪子世苏兰哲;

    .line 17
    .line 18
    invoke-virtual {p0, p2}, L飘花落叶言楪子哲兰世苏/飘花落叶言楪子世苏兰哲;->applyAsInt(Ljava/lang/Object;)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏哲兰楪世()V

    .line 23
    .line 24
    .line 25
    const/4 p3, 0x0

    .line 26
    :goto_0
    if-ge p3, p0, :cond_2

    .line 27
    .line 28
    move-object p5, p4

    .line 29
    check-cast p5, Ljava/util/function/BiFunction;

    .line 30
    .line 31
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object p6

    .line 35
    invoke-interface {p5, p2, p6}, Ljava/util/function/BiFunction;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p5

    .line 39
    check-cast p5, Ljava/lang/Boolean;

    .line 40
    .line 41
    invoke-virtual {p5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 42
    .line 43
    .line 44
    move-result p5

    .line 45
    if-eqz p3, :cond_1

    .line 46
    .line 47
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲世苏楪兰()V

    .line 48
    .line 49
    .line 50
    :cond_1
    invoke-virtual {p1, p5}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲楪苏兰世(Z)V

    .line 51
    .line 52
    .line 53
    add-int/lit8 p3, p3, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪世哲苏兰()V

    .line 57
    .line 58
    .line 59
    :goto_1
    return-void

    .line 60
    :pswitch_0
    check-cast p4, Ljava/util/function/Function;

    .line 61
    .line 62
    if-eqz p4, :cond_3

    .line 63
    .line 64
    if-eqz p2, :cond_3

    .line 65
    .line 66
    invoke-interface {p4, p2}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    check-cast p2, Ljava/math/BigDecimal;

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_3
    check-cast p2, Ljava/math/BigDecimal;

    .line 74
    .line 75
    :goto_2
    check-cast p0, Ljava/text/DecimalFormat;

    .line 76
    .line 77
    invoke-virtual {p1, p2, p5, p6, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲苏世楪兰(Ljava/math/BigDecimal;JLjava/text/DecimalFormat;)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
