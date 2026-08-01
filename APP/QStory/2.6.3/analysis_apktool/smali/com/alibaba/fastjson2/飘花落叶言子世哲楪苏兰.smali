.class public final Lcom/alibaba/fastjson2/飘花落叶言子世哲楪苏兰;
.super Lcom/alibaba/fastjson2/飘花落叶言子世哲苏兰楪;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final 飘花落叶言子楪世哲兰苏:Ljava/lang/Object;

.field public final 飘花落叶言子楪世哲苏兰:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

.field public final 飘花落叶言子楪世苏兰哲:Lcom/alibaba/fastjson2/飘花落叶言子苏世兰楪哲;


# direct methods
.method public constructor <init>(Lcom/alibaba/fastjson2/飘花落叶言子苏世兰楪哲;Lcom/alibaba/fastjson2/JSONPathFilter$Operator;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/alibaba/fastjson2/飘花落叶言子世哲苏兰楪;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世苏兰哲:Lcom/alibaba/fastjson2/飘花落叶言子苏世兰楪哲;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世哲苏兰:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/alibaba/fastjson2/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世哲兰苏:Ljava/lang/Object;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世哲苏兰(Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 p1, 0x0

    .line 2
    if-nez p2, :cond_0

    .line 3
    .line 4
    goto :goto_2

    .line 5
    :cond_0
    new-instance v0, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世苏兰哲:Lcom/alibaba/fastjson2/飘花落叶言子苏世兰楪哲;

    .line 9
    .line 10
    invoke-direct {v0, v1, v1, v2, v1}, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;-><init>(Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏哲世;Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;Lcom/alibaba/fastjson2/飘花落叶言子苏哲楪兰世;Lcom/alibaba/fastjson2/飘花落叶言子苏哲楪兰世;)V

    .line 11
    .line 12
    .line 13
    iput-object p2, v0, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰苏哲:Ljava/lang/Object;

    .line 14
    .line 15
    invoke-virtual {v2, v0}, Lcom/alibaba/fastjson2/飘花落叶言子苏世兰楪哲;->飘花落叶言子楪世苏兰哲(Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;)V

    .line 16
    .line 17
    .line 18
    iget-object p2, v0, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p2, Ljava/util/List;

    .line 21
    .line 22
    move v0, p1

    .line 23
    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    const/4 v2, 0x1

    .line 28
    if-ge v0, v1, :cond_8

    .line 29
    .line 30
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    iget-object v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世哲兰苏:Ljava/lang/Object;

    .line 35
    .line 36
    invoke-static {v1, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    iget-object v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世哲苏兰:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 41
    .line 42
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-eqz v3, :cond_6

    .line 47
    .line 48
    if-eq v3, v2, :cond_5

    .line 49
    .line 50
    const/4 v2, 0x2

    .line 51
    if-eq v3, v2, :cond_4

    .line 52
    .line 53
    const/4 v2, 0x3

    .line 54
    if-eq v3, v2, :cond_3

    .line 55
    .line 56
    const/4 v2, 0x4

    .line 57
    if-eq v3, v2, :cond_2

    .line 58
    .line 59
    const/4 v2, 0x5

    .line 60
    if-ne v3, v2, :cond_1

    .line 61
    .line 62
    if-gtz v1, :cond_7

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_1
    invoke-static {}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世()V

    .line 66
    .line 67
    .line 68
    return p1

    .line 69
    :cond_2
    if-gez v1, :cond_7

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_3
    if-ltz v1, :cond_7

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_4
    if-lez v1, :cond_7

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_5
    if-eqz v1, :cond_7

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_6
    if-nez v1, :cond_7

    .line 82
    .line 83
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_7
    :goto_2
    return p1

    .line 87
    :cond_8
    return v2
.end method

.method public final 飘花落叶言子楪世苏兰哲(Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;)V
    .locals 5

    .line 1
    iget-object v0, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲:Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰苏哲:Ljava/lang/Object;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 9
    .line 10
    :goto_0
    instance-of v1, v0, Ljava/util/List;

    .line 11
    .line 12
    if-eqz v1, :cond_3

    .line 13
    .line 14
    check-cast v0, Ljava/util/List;

    .line 15
    .line 16
    new-instance v1, Lcom/alibaba/fastjson2/JSONArray;

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    invoke-direct {v1, v2}, Lcom/alibaba/fastjson2/JSONArray;-><init>(I)V

    .line 23
    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    :goto_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-ge v2, v3, :cond_2

    .line 31
    .line 32
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-virtual {p0, p1, v3}, Lcom/alibaba/fastjson2/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世哲苏兰(Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-eqz v4, :cond_1

    .line 41
    .line 42
    invoke-virtual {v1, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_2
    iput-object v1, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 49
    .line 50
    const/4 p0, 0x1

    .line 51
    iput-boolean p0, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰:Z

    .line 52
    .line 53
    return-void

    .line 54
    :cond_3
    new-instance p0, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    const-string p1, "UnsupportedOperation "

    .line 57
    .line 58
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-static {v0, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世(Ljava/lang/Object;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method public final 飘花落叶言子楪世苏哲兰(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;)V
    .locals 0

    .line 1
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    .line 2
    .line 3
    const-string p1, "UnsupportedOperation "

    .line 4
    .line 5
    const-class p2, Lcom/alibaba/fastjson2/飘花落叶言子世哲楪苏兰;

    .line 6
    .line 7
    invoke-static {p2, p1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲世苏兰(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    throw p0
.end method
