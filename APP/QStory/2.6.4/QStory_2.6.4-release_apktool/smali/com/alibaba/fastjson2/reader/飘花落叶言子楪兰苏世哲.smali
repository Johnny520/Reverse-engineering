.class public final Lcom/alibaba/fastjson2/reader/飘花落叶言子楪兰苏世哲;
.super Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏兰楪哲;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final synthetic 飘花落叶言子世哲苏兰楪:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/String;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p11, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪兰苏世哲;->飘花落叶言子世哲苏兰楪:I

    .line 2
    .line 3
    invoke-direct/range {p0 .. p10}, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏兰楪哲;-><init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/String;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪兰苏世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪兰苏世哲;->飘花落叶言子世哲苏兰楪:I

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    iget-wide v3, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世哲苏:J

    .line 6
    .line 7
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Class;

    .line 8
    .line 9
    const/4 v5, 0x0

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世苏兰子哲()Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    if-nez p0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Integer;->byteValue()B

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    :goto_0
    return-object v5

    .line 29
    :pswitch_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世哲子兰苏()Ljava/lang/Long;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    if-nez v0, :cond_2

    .line 34
    .line 35
    sget-object v6, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 36
    .line 37
    if-ne p0, v6, :cond_2

    .line 38
    .line 39
    invoke-virtual {p1, v3, v4}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世哲楪兰苏(J)J

    .line 40
    .line 41
    .line 42
    move-result-wide v3

    .line 43
    sget-object p0, Lcom/alibaba/fastjson2/JSONReader$Feature;->ErrorOnNullForPrimitives:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 44
    .line 45
    iget-wide v6, p0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 46
    .line 47
    and-long/2addr v3, v6

    .line 48
    cmp-long p0, v3, v1

    .line 49
    .line 50
    if-nez p0, :cond_1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    const-string p0, "long value not support input null"

    .line 54
    .line 55
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏楪兰世(Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_2
    :goto_1
    move-object v5, v0

    .line 64
    :goto_2
    return-object v5

    .line 65
    :pswitch_1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世苏兰子哲()Ljava/lang/Integer;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    if-nez v0, :cond_4

    .line 70
    .line 71
    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 72
    .line 73
    if-ne p0, v6, :cond_4

    .line 74
    .line 75
    invoke-virtual {p1, v3, v4}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世哲楪兰苏(J)J

    .line 76
    .line 77
    .line 78
    move-result-wide v3

    .line 79
    sget-object p0, Lcom/alibaba/fastjson2/JSONReader$Feature;->ErrorOnNullForPrimitives:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 80
    .line 81
    iget-wide v6, p0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 82
    .line 83
    and-long/2addr v3, v6

    .line 84
    cmp-long p0, v3, v1

    .line 85
    .line 86
    if-nez p0, :cond_3

    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_3
    const-string p0, "int value not support input null"

    .line 90
    .line 91
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏楪兰世(Ljava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    goto :goto_4

    .line 99
    :cond_4
    :goto_3
    move-object v5, v0

    .line 100
    :goto_4
    return-object v5

    .line 101
    :pswitch_2
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世苏兰子哲()Ljava/lang/Integer;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    if-nez v0, :cond_6

    .line 106
    .line 107
    sget-object v6, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 108
    .line 109
    if-ne p0, v6, :cond_6

    .line 110
    .line 111
    invoke-virtual {p1, v3, v4}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世哲楪兰苏(J)J

    .line 112
    .line 113
    .line 114
    move-result-wide v3

    .line 115
    sget-object p0, Lcom/alibaba/fastjson2/JSONReader$Feature;->ErrorOnNullForPrimitives:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 116
    .line 117
    iget-wide v6, p0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 118
    .line 119
    and-long/2addr v3, v6

    .line 120
    cmp-long p0, v3, v1

    .line 121
    .line 122
    if-nez p0, :cond_5

    .line 123
    .line 124
    goto :goto_5

    .line 125
    :cond_5
    const-string p0, "short value not support input null"

    .line 126
    .line 127
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏楪兰世(Ljava/lang/String;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    goto :goto_6

    .line 135
    :cond_6
    :goto_5
    if-nez v0, :cond_7

    .line 136
    .line 137
    goto :goto_6

    .line 138
    :cond_7
    invoke-virtual {v0}, Ljava/lang/Integer;->shortValue()S

    .line 139
    .line 140
    .line 141
    move-result p0

    .line 142
    invoke-static {p0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 143
    .line 144
    .line 145
    move-result-object v5

    .line 146
    :goto_6
    return-object v5

    .line 147
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
