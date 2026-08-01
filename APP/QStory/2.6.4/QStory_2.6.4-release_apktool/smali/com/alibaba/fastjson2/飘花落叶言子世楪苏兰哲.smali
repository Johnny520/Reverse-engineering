.class public final Lcom/alibaba/fastjson2/飘花落叶言子世楪苏兰哲;
.super Lcom/alibaba/fastjson2/飘花落叶言子世苏楪哲兰;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final synthetic 飘花落叶言子楪苏世兰哲:I

.field public final 飘花落叶言子楪苏哲世兰:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;I)V
    .locals 2

    .line 1
    iput p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪苏世兰哲:I

    .line 2
    .line 3
    const/4 p2, 0x0

    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    invoke-direct {p0, p2, v0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子世苏楪哲兰;-><init>(Ljava/lang/String;J)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪苏哲世兰:Ljava/lang/String;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;J)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪苏世兰哲:I

    .line 12
    invoke-direct {p0, p1, p3, p4}, Lcom/alibaba/fastjson2/飘花落叶言子世苏楪哲兰;-><init>(Ljava/lang/String;J)V

    .line 13
    iput-object p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪苏哲世兰:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世哲兰苏(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪苏世兰哲:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪苏哲世兰:Ljava/lang/String;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p1, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    move v1, v2

    .line 23
    :cond_0
    return v1

    .line 24
    :pswitch_0
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    .line 25
    .line 26
    const-string p1, "TODO"

    .line 27
    .line 28
    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw p0

    .line 32
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    if-eqz p1, :cond_1

    .line 37
    .line 38
    invoke-virtual {p1, p0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    if-eqz p0, :cond_1

    .line 43
    .line 44
    move v1, v2

    .line 45
    :cond_1
    return v1

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public 飘花落叶言子楪世哲苏兰(Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;Ljava/lang/Object;)Z
    .locals 3

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪苏世兰哲:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世哲苏兰(Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0

    .line 11
    :pswitch_0
    if-nez p2, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    iget-object p1, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏哲兰:Lcom/alibaba/fastjson2/飘花落叶言子楪兰哲世苏;

    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世哲苏兰()Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    instance-of v0, p2, Ljava/util/Map;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    check-cast p2, Ljava/util/Map;

    .line 25
    .line 26
    iget-object p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 27
    .line 28
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪苏哲世兰:Ljava/lang/String;

    .line 33
    .line 34
    invoke-interface {p2, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;)L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰楪哲世;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    instance-of v0, p1, L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰世楪哲;

    .line 48
    .line 49
    if-eqz v0, :cond_4

    .line 50
    .line 51
    iget-wide v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世哲苏兰:J

    .line 52
    .line 53
    invoke-interface {p1, v0, v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰楪哲世;->飘花落叶言子楪兰世哲苏(J)L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    if-nez p0, :cond_2

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_2
    invoke-virtual {p0, p2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-interface {p1, v0, v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰楪哲世;->飘花落叶言子楪兰世哲苏(J)L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    if-nez p1, :cond_3

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_3
    invoke-virtual {p1, p2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    move-object v2, p1

    .line 76
    move-object p1, p0

    .line 77
    move-object p0, v2

    .line 78
    :goto_0
    invoke-static {p1, p0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    goto :goto_2

    .line 83
    :cond_4
    :goto_1
    const/4 p0, 0x0

    .line 84
    :goto_2
    return p0

    .line 85
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
