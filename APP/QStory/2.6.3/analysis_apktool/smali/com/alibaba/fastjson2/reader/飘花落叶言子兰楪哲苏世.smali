.class public final Lcom/alibaba/fastjson2/reader/飘花落叶言子兰楪哲苏世;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;


# instance fields
.field public final 飘花落叶言子楪世苏兰哲:Ljava/lang/Class;


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰楪哲苏世;->飘花落叶言子楪世苏兰哲:Ljava/lang/Class;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰哲楪世苏()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    const/16 p3, 0x2e

    .line 6
    .line 7
    invoke-virtual {p1, p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲楪兰苏世(C)Z

    .line 8
    .line 9
    .line 10
    move-result p4

    .line 11
    if-eqz p4, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰哲楪世苏()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p4

    .line 17
    invoke-static {p3, p2, p4}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏哲兰世(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    :cond_0
    iget-char p3, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 22
    .line 23
    const/16 p4, 0x2a

    .line 24
    .line 25
    const/16 p5, 0x2f

    .line 26
    .line 27
    if-ne p3, p5, :cond_1

    .line 28
    .line 29
    invoke-virtual {p1, p5, p4, p4, p5}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲世楪兰苏(CCCC)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    iget-char p3, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 36
    .line 37
    :cond_1
    const/16 v0, 0x28

    .line 38
    .line 39
    const/4 v1, 0x0

    .line 40
    const-string v2, "illegal jsonp input"

    .line 41
    .line 42
    if-ne p3, v0, :cond_5

    .line 43
    .line 44
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏兰哲世楪()V

    .line 45
    .line 46
    .line 47
    const-class p3, Lcom/alibaba/fastjson2/JSONObject;

    .line 48
    .line 49
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰楪哲苏世;->飘花落叶言子楪世苏兰哲:Ljava/lang/Class;

    .line 50
    .line 51
    if-ne p0, p3, :cond_2

    .line 52
    .line 53
    new-instance p0, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰世苏;

    .line 54
    .line 55
    invoke-direct {p0, p2}, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰世苏;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    check-cast p0, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰世苏;
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 64
    .line 65
    iput-object p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 66
    .line 67
    :goto_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世兰哲楪()Z

    .line 68
    .line 69
    .line 70
    move-result p2

    .line 71
    if-nez p2, :cond_4

    .line 72
    .line 73
    const/16 p2, 0x29

    .line 74
    .line 75
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲楪兰苏世(C)Z

    .line 76
    .line 77
    .line 78
    move-result p2

    .line 79
    if-eqz p2, :cond_3

    .line 80
    .line 81
    const/16 p2, 0x3b

    .line 82
    .line 83
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲楪兰苏世(C)Z

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1, p5, p4, p4, p5}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲世楪兰苏(CCCC)Z

    .line 87
    .line 88
    .line 89
    return-object p0

    .line 90
    :cond_3
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰楪苏世哲()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    iget-object p3, p0, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏兰哲:Ljava/util/ArrayList;

    .line 95
    .line 96
    invoke-virtual {p3, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_4
    invoke-virtual {p1, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    return-object v1

    .line 108
    :catch_0
    move-exception p0

    .line 109
    goto :goto_1

    .line 110
    :catch_1
    move-exception p0

    .line 111
    :goto_1
    const-string p1, "create jsonp instance error"

    .line 112
    .line 113
    invoke-static {p1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 114
    .line 115
    .line 116
    return-object v1

    .line 117
    :cond_5
    invoke-virtual {p1, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    return-object v1
.end method
