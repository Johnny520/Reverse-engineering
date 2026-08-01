.class public final Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏哲兰世;
.super Lcom/alibaba/fastjson2/schema/JSONSchema;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final 飘花落叶言子楪哲兰世苏:[Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

.field public final 飘花落叶言子楪哲兰苏世:Ljava/lang/Boolean;

.field public final 飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/schema/JSONSchema;


# direct methods
.method public constructor <init>(Lcom/alibaba/fastjson2/schema/JSONSchema;[Lcom/alibaba/fastjson2/schema/JSONSchema$Type;Ljava/lang/Boolean;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/alibaba/fastjson2/schema/JSONSchema;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰世苏:[Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰苏世:Ljava/lang/Boolean;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪兰哲世苏(Ljava/lang/Object;)Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;
    .locals 6

    .line 1
    sget-object v0, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪苏哲兰世:Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {v1, p1}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪兰哲世苏(Ljava/lang/Object;)Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-boolean v1, v1, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:Z

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    goto/16 :goto_2

    .line 16
    .line 17
    :cond_0
    iget-object v1, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰世苏:[Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 18
    .line 19
    if-eqz v1, :cond_5

    .line 20
    .line 21
    array-length v2, v1

    .line 22
    const/4 v3, 0x0

    .line 23
    :goto_0
    if-ge v3, v2, :cond_5

    .line 24
    .line 25
    aget-object v4, v1, v3

    .line 26
    .line 27
    sget-object v5, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:[I

    .line 28
    .line 29
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    aget v4, v5, v4

    .line 34
    .line 35
    packed-switch v4, :pswitch_data_0

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :pswitch_0
    instance-of v4, p1, Ljava/lang/Boolean;

    .line 40
    .line 41
    if-eqz v4, :cond_4

    .line 42
    .line 43
    return-object v0

    .line 44
    :pswitch_1
    instance-of v4, p1, Ljava/util/Map;

    .line 45
    .line 46
    if-eqz v4, :cond_1

    .line 47
    .line 48
    return-object v0

    .line 49
    :cond_1
    if-eqz p1, :cond_4

    .line 50
    .line 51
    sget-object v4, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪世哲兰苏:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    invoke-virtual {v4, v5}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世哲苏兰(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    instance-of v4, v4, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪哲兰;

    .line 62
    .line 63
    if-eqz v4, :cond_4

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :pswitch_2
    instance-of v4, p1, [Ljava/lang/Object;

    .line 67
    .line 68
    if-nez v4, :cond_2

    .line 69
    .line 70
    instance-of v4, p1, Ljava/util/Collection;

    .line 71
    .line 72
    if-nez v4, :cond_2

    .line 73
    .line 74
    if-eqz p1, :cond_4

    .line 75
    .line 76
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    invoke-virtual {v4}, Ljava/lang/Class;->isArray()Z

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    if-eqz v4, :cond_4

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_2
    return-object v0

    .line 88
    :pswitch_3
    if-nez p1, :cond_4

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :pswitch_4
    instance-of v4, p1, Ljava/lang/Number;

    .line 92
    .line 93
    if-eqz v4, :cond_4

    .line 94
    .line 95
    return-object v0

    .line 96
    :pswitch_5
    instance-of v4, p1, Ljava/lang/Byte;

    .line 97
    .line 98
    if-nez v4, :cond_3

    .line 99
    .line 100
    instance-of v4, p1, Ljava/lang/Short;

    .line 101
    .line 102
    if-nez v4, :cond_3

    .line 103
    .line 104
    instance-of v4, p1, Ljava/lang/Integer;

    .line 105
    .line 106
    if-nez v4, :cond_3

    .line 107
    .line 108
    instance-of v4, p1, Ljava/lang/Long;

    .line 109
    .line 110
    if-nez v4, :cond_3

    .line 111
    .line 112
    instance-of v4, p1, Ljava/math/BigInteger;

    .line 113
    .line 114
    if-nez v4, :cond_3

    .line 115
    .line 116
    instance-of v4, p1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 117
    .line 118
    if-nez v4, :cond_3

    .line 119
    .line 120
    instance-of v4, p1, Ljava/util/concurrent/atomic/AtomicLong;

    .line 121
    .line 122
    if-eqz v4, :cond_4

    .line 123
    .line 124
    :cond_3
    return-object v0

    .line 125
    :pswitch_6
    instance-of v4, p1, Ljava/lang/String;

    .line 126
    .line 127
    if-eqz v4, :cond_4

    .line 128
    .line 129
    return-object v0

    .line 130
    :cond_4
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 131
    .line 132
    goto :goto_0

    .line 133
    :cond_5
    iget-object p0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰苏世:Ljava/lang/Boolean;

    .line 134
    .line 135
    if-eqz p0, :cond_6

    .line 136
    .line 137
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 138
    .line 139
    .line 140
    move-result p0

    .line 141
    if-eqz p0, :cond_6

    .line 142
    .line 143
    :goto_2
    :pswitch_7
    return-object v0

    .line 144
    :cond_6
    sget-object p0, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪世兰苏哲:Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 145
    .line 146
    return-object p0

    .line 147
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_7
    .end packed-switch
.end method

.method public final 飘花落叶言子楪苏哲兰世()Lcom/alibaba/fastjson2/schema/JSONSchema$Type;
    .locals 0

    .line 1
    sget-object p0, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;->AllOf:Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 2
    .line 3
    return-object p0
.end method
