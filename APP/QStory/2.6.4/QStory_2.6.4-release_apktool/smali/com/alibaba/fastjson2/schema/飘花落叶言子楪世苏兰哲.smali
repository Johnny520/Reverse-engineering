.class public final Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世苏兰哲;
.super Lcom/alibaba/fastjson2/schema/JSONSchema;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子楪哲苏兰世:[Lcom/alibaba/fastjson2/schema/JSONSchema;


# direct methods
.method public constructor <init>(Lcom/alibaba/fastjson2/JSONObject;Lcom/alibaba/fastjson2/schema/JSONSchema;)V
    .locals 5

    .line 1
    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/schema/JSONSchema;-><init>(Lcom/alibaba/fastjson2/JSONObject;)V

    .line 2
    .line 3
    .line 4
    const-string v0, "allOf"

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONObject;->getJSONArray(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONArray;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const/4 v0, 0x0

    .line 11
    if-eqz p1, :cond_5

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_5

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    new-array v1, v1, [Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 24
    .line 25
    iput-object v1, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:[Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    move-object v2, v0

    .line 29
    :goto_0
    iget-object v3, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:[Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 30
    .line 31
    array-length v3, v3

    .line 32
    if-ge v1, v3, :cond_4

    .line 33
    .line 34
    invoke-virtual {p1, v1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    instance-of v4, v3, Ljava/lang/Boolean;

    .line 39
    .line 40
    if-eqz v4, :cond_1

    .line 41
    .line 42
    check-cast v3, Ljava/lang/Boolean;

    .line 43
    .line 44
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_0

    .line 49
    .line 50
    sget-object v2, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世哲苏兰;

    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_0
    sget-object v2, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏哲兰世;

    .line 54
    .line 55
    goto :goto_3

    .line 56
    :cond_1
    check-cast v3, Lcom/alibaba/fastjson2/JSONObject;

    .line 57
    .line 58
    const-string v4, "$ref"

    .line 59
    .line 60
    invoke-virtual {v3, v4}, Lcom/alibaba/fastjson2/JSONObject;->containsKey(Ljava/lang/String;)Z

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    if-nez v4, :cond_2

    .line 65
    .line 66
    const-string v4, "type"

    .line 67
    .line 68
    invoke-virtual {v3, v4}, Lcom/alibaba/fastjson2/JSONObject;->containsKey(Ljava/lang/String;)Z

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    if-nez v4, :cond_2

    .line 73
    .line 74
    if-eqz v2, :cond_2

    .line 75
    .line 76
    sget-object v4, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:[I

    .line 77
    .line 78
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    aget v2, v4, v2

    .line 83
    .line 84
    packed-switch v2, :pswitch_data_0

    .line 85
    .line 86
    .line 87
    goto :goto_1

    .line 88
    :pswitch_0
    new-instance v2, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;

    .line 89
    .line 90
    invoke-direct {v2, v3, v0}, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;-><init>(Lcom/alibaba/fastjson2/JSONObject;Lcom/alibaba/fastjson2/schema/JSONSchema;)V

    .line 91
    .line 92
    .line 93
    goto :goto_2

    .line 94
    :pswitch_1
    new-instance v2, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世兰苏哲;

    .line 95
    .line 96
    invoke-direct {v2, v3, v0}, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世兰苏哲;-><init>(Lcom/alibaba/fastjson2/JSONObject;Lcom/alibaba/fastjson2/schema/JSONSchema;)V

    .line 97
    .line 98
    .line 99
    goto :goto_2

    .line 100
    :pswitch_2
    new-instance v2, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世兰哲苏;

    .line 101
    .line 102
    invoke-direct {v2, v3}, Lcom/alibaba/fastjson2/schema/JSONSchema;-><init>(Lcom/alibaba/fastjson2/JSONObject;)V

    .line 103
    .line 104
    .line 105
    goto :goto_2

    .line 106
    :pswitch_3
    new-instance v2, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏兰哲世;

    .line 107
    .line 108
    invoke-direct {v2, v3}, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏兰哲世;-><init>(Lcom/alibaba/fastjson2/JSONObject;)V

    .line 109
    .line 110
    .line 111
    goto :goto_2

    .line 112
    :pswitch_4
    new-instance v2, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏世兰哲;

    .line 113
    .line 114
    invoke-direct {v2, v3}, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏世兰哲;-><init>(Lcom/alibaba/fastjson2/JSONObject;)V

    .line 115
    .line 116
    .line 117
    goto :goto_2

    .line 118
    :pswitch_5
    new-instance v2, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲苏世兰;

    .line 119
    .line 120
    invoke-direct {v2, v3}, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲苏世兰;-><init>(Lcom/alibaba/fastjson2/JSONObject;)V

    .line 121
    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_2
    :goto_1
    move-object v2, v0

    .line 125
    :goto_2
    if-nez v2, :cond_3

    .line 126
    .line 127
    invoke-static {v3, p2}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪苏兰哲世(Lcom/alibaba/fastjson2/JSONObject;Lcom/alibaba/fastjson2/schema/JSONSchema;)Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    :cond_3
    :goto_3
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪苏哲兰世()Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    iget-object v4, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:[Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 136
    .line 137
    aput-object v2, v4, v1

    .line 138
    .line 139
    add-int/lit8 v1, v1, 0x1

    .line 140
    .line 141
    move-object v2, v3

    .line 142
    goto :goto_0

    .line 143
    :cond_4
    return-void

    .line 144
    :cond_5
    const-string p0, "allOf not found"

    .line 145
    .line 146
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    throw v0

    .line 150
    nop

    .line 151
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>([Lcom/alibaba/fastjson2/schema/JSONSchema;)V
    .locals 0

    .line 151
    invoke-direct {p0}, Lcom/alibaba/fastjson2/schema/JSONSchema;-><init>()V

    .line 152
    iput-object p1, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:[Lcom/alibaba/fastjson2/schema/JSONSchema;

    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪兰哲世苏(Ljava/lang/Object;)Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;
    .locals 4

    .line 1
    iget-object p0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:[Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 2
    .line 3
    array-length v0, p0

    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    if-ge v1, v0, :cond_1

    .line 6
    .line 7
    aget-object v2, p0, v1

    .line 8
    .line 9
    invoke-virtual {v2, p1}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪兰哲世苏(Ljava/lang/Object;)Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    iget-boolean v3, v2, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:Z

    .line 14
    .line 15
    if-nez v3, :cond_0

    .line 16
    .line 17
    return-object v2

    .line 18
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    sget-object p0, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪世兰苏哲:Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 22
    .line 23
    return-object p0
.end method

.method public final 飘花落叶言子楪苏哲兰世()Lcom/alibaba/fastjson2/schema/JSONSchema$Type;
    .locals 0

    .line 1
    sget-object p0, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;->AllOf:Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 2
    .line 3
    return-object p0
.end method
