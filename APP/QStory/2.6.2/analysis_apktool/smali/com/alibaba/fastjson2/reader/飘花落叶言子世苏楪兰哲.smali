.class public final synthetic Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏楪兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic 飘花落叶言子楪兰世哲苏:Ljava/util/function/BiConsumer;

.field public final synthetic 飘花落叶言子楪兰世苏哲:Ljava/util/Map;

.field public final synthetic 飘花落叶言子楪哲兰世苏:Lcom/alibaba/fastjson2/PropertyNamingStrategy;

.field public final synthetic 飘花落叶言子楪哲兰苏世:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

.field public final synthetic 飘花落叶言子楪哲苏兰世:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lcom/alibaba/fastjson2/PropertyNamingStrategy;Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;Ljava/util/Map;Ljava/util/function/BiConsumer;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪哲苏兰世:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪哲兰世苏:Lcom/alibaba/fastjson2/PropertyNamingStrategy;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪哲兰苏世:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪兰世苏哲:Ljava/util/Map;

    .line 11
    .line 12
    iput-object p5, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪兰世哲苏:Ljava/util/function/BiConsumer;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 8

    .line 1
    instance-of v0, p1, Ljava/util/Map;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪哲苏兰世:Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    move-object v2, p1

    .line 8
    check-cast v2, Ljava/util/Map;

    .line 9
    .line 10
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    if-eqz p1, :cond_9

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    sget-object v3, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪兰苏世哲:L飘花落叶言楪子哲兰世苏/飘花落叶言楪子世苏哲兰;

    .line 22
    .line 23
    invoke-static {v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    sget-object v5, Lcom/alibaba/fastjson2/JSONWriter$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 28
    .line 29
    const-wide/16 v6, 0x0

    .line 30
    .line 31
    invoke-virtual {v5, v6, v7}, Lcom/alibaba/fastjson2/JSONWriter$Feature;->isEnabled(J)Z

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    invoke-virtual {v3, v2, v4, v5}, L飘花落叶言楪子哲兰世苏/飘花落叶言楪子世苏哲兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/reflect/Type;Ljava/lang/Class;Z)L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-static {v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)J

    .line 43
    .line 44
    .line 45
    move-result-wide v3

    .line 46
    invoke-interface {v2, v3, v4}, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;->飘花落叶言子楪兰世哲苏(J)L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    if-nez v5, :cond_1

    .line 51
    .line 52
    invoke-static {v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)J

    .line 53
    .line 54
    .line 55
    move-result-wide v6

    .line 56
    cmp-long v1, v6, v3

    .line 57
    .line 58
    if-eqz v1, :cond_1

    .line 59
    .line 60
    invoke-interface {v2, v6, v7}, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;->飘花落叶言子楪兰世哲苏(J)L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    :cond_1
    if-nez v5, :cond_2

    .line 65
    .line 66
    const/4 v1, 0x0

    .line 67
    goto :goto_0

    .line 68
    :cond_2
    invoke-virtual {v5, p1}, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    :goto_0
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪哲兰世苏:Lcom/alibaba/fastjson2/PropertyNamingStrategy;

    .line 73
    .line 74
    if-eqz v2, :cond_3

    .line 75
    .line 76
    instance-of v3, v1, Ljava/lang/String;

    .line 77
    .line 78
    if-eqz v3, :cond_3

    .line 79
    .line 80
    check-cast v1, Ljava/lang/String;

    .line 81
    .line 82
    invoke-virtual {v2, v1}, Lcom/alibaba/fastjson2/PropertyNamingStrategy;->fieldName(Ljava/lang/String;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    :cond_3
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪哲兰苏世:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 87
    .line 88
    invoke-interface {v2}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世苏兰哲()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    invoke-virtual {v3, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    const/4 v4, 0x0

    .line 97
    if-eqz v3, :cond_4

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_4
    if-eqz v0, :cond_8

    .line 101
    .line 102
    check-cast p1, Ljava/util/Map;

    .line 103
    .line 104
    new-array v0, v4, [Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 105
    .line 106
    invoke-interface {v2, p1, v0}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪苏世哲兰(Ljava/util/Map;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    :goto_1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪兰世苏哲:Ljava/util/Map;

    .line 111
    .line 112
    invoke-interface {v0, v1, p1}, Ljava/util/Map;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    const/4 v1, 0x1

    .line 117
    if-eqz v0, :cond_5

    .line 118
    .line 119
    move v2, v1

    .line 120
    goto :goto_2

    .line 121
    :cond_5
    move v2, v4

    .line 122
    :goto_2
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪兰世哲苏:Ljava/util/function/BiConsumer;

    .line 123
    .line 124
    if-eqz p0, :cond_6

    .line 125
    .line 126
    move v4, v1

    .line 127
    :cond_6
    and-int v1, v2, v4

    .line 128
    .line 129
    if-eqz v1, :cond_7

    .line 130
    .line 131
    invoke-interface {p0, v0, p1}, Ljava/util/function/BiConsumer;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    :cond_7
    return-void

    .line 135
    :cond_8
    sget-object p0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->ReferenceDetection:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 136
    .line 137
    filled-new-array {p0}, [Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    invoke-static {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;[Lcom/alibaba/fastjson2/JSONWriter$Feature;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    const-string p1, "can not accept "

    .line 146
    .line 147
    invoke-static {p0, p1}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲世兰苏(Ljava/lang/Object;Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    return-void

    .line 151
    :cond_9
    const-string p0, "key not found "

    .line 152
    .line 153
    invoke-static {p0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲世兰苏(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    return-void
.end method
