.class public final Lcom/alibaba/fastjson2/reader/飘花落叶言楪子世哲苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;


# instance fields
.field public final 飘花落叶言子楪世哲兰苏:Ljava/lang/Object;

.field public final 飘花落叶言子楪世哲苏兰:Lcom/alibaba/fastjson2/schema/JSONSchema;

.field public final synthetic 飘花落叶言子楪世苏兰哲:I


# direct methods
.method public synthetic constructor <init>(Lcom/alibaba/fastjson2/schema/JSONSchema;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子世哲苏兰;->飘花落叶言子楪世苏兰哲:I

    .line 2
    .line 3
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子世哲苏兰;->飘花落叶言子楪世哲苏兰:Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 4
    .line 5
    iput-object p2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子世哲苏兰;->飘花落叶言子楪世哲兰苏:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 2

    .line 1
    iget p2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子世哲苏兰;->飘花落叶言子楪世苏兰哲:I

    .line 2
    .line 3
    const-string p3, "create object error"

    .line 4
    .line 5
    iget-object p4, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子世哲苏兰;->飘花落叶言子楪世哲兰苏:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子世哲苏兰;->飘花落叶言子楪世哲苏兰:Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 8
    .line 9
    const/4 p5, 0x0

    .line 10
    packed-switch p2, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏楪世兰()Z

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    if-eqz p2, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世兰哲子苏()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    if-eqz p0, :cond_1

    .line 25
    .line 26
    invoke-virtual {p0, p2}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪兰哲世苏(Ljava/lang/Object;)Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 27
    .line 28
    .line 29
    :cond_1
    :try_start_0
    check-cast p4, Ljava/util/function/Function;

    .line 30
    .line 31
    invoke-interface {p4, p2}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    goto :goto_0

    .line 36
    :catch_0
    move-exception p0

    .line 37
    invoke-virtual {p1, p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-static {p1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 42
    .line 43
    .line 44
    :goto_0
    return-object p5

    .line 45
    :pswitch_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏楪世兰()Z

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    if-eqz p2, :cond_2

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_2
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子世苏兰哲()I

    .line 53
    .line 54
    .line 55
    move-result p2

    .line 56
    if-eqz p0, :cond_3

    .line 57
    .line 58
    int-to-long v0, p2

    .line 59
    invoke-virtual {p0, v0, v1}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪哲兰苏世(J)Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 60
    .line 61
    .line 62
    :cond_3
    :try_start_1
    check-cast p4, Ljava/util/function/IntFunction;

    .line 63
    .line 64
    invoke-interface {p4, p2}, Ljava/util/function/IntFunction;->apply(I)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p5
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 68
    goto :goto_1

    .line 69
    :catch_1
    move-exception p0

    .line 70
    invoke-virtual {p1, p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-static {p1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 75
    .line 76
    .line 77
    :goto_1
    return-object p5

    .line 78
    nop

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final 飘花落叶言子楪苏兰世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子世哲苏兰;->飘花落叶言子楪世苏兰哲:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual/range {p0 .. p5}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子世哲苏兰;->飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    invoke-virtual/range {p0 .. p5}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子世哲苏兰;->飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

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
