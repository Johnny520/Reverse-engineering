.class public final L飘花落叶言楪子哲兰世苏/飘花落叶言子哲兰苏世楪;
.super L飘花落叶言楪子哲兰世苏/飘花落叶言子兰哲苏世楪;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final 飘花落叶言子楪世兰苏哲:L飘花落叶言楪子哲兰世苏/飘花落叶言子哲兰苏世楪;

.field public static final 飘花落叶言子楪世哲兰苏:L飘花落叶言楪子哲兰世苏/飘花落叶言子哲兰苏世楪;


# instance fields
.field public final 飘花落叶言子楪世哲苏兰:Ljava/text/DecimalFormat;

.field public final synthetic 飘花落叶言子楪世苏兰哲:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子哲兰苏世楪;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v1, v2}, L飘花落叶言楪子哲兰世苏/飘花落叶言子哲兰苏世楪;-><init>(Ljava/text/DecimalFormat;I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子哲兰苏世楪;->飘花落叶言子楪世哲兰苏:L飘花落叶言楪子哲兰世苏/飘花落叶言子哲兰苏世楪;

    .line 9
    .line 10
    new-instance v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子哲兰苏世楪;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-direct {v0, v1, v2}, L飘花落叶言楪子哲兰世苏/飘花落叶言子哲兰苏世楪;-><init>(Ljava/text/DecimalFormat;I)V

    .line 14
    .line 15
    .line 16
    sput-object v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子哲兰苏世楪;->飘花落叶言子楪世兰苏哲:L飘花落叶言楪子哲兰世苏/飘花落叶言子哲兰苏世楪;

    .line 17
    .line 18
    return-void
.end method

.method public synthetic constructor <init>(Ljava/text/DecimalFormat;I)V
    .locals 0

    .line 1
    iput p2, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子哲兰苏世楪;->飘花落叶言子楪世苏兰哲:I

    .line 2
    .line 3
    iput-object p1, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子哲兰苏世楪;->飘花落叶言子楪世哲苏兰:Ljava/text/DecimalFormat;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪兰苏世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 4

    .line 1
    iget p0, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子哲兰苏世楪;->飘花落叶言子楪世苏兰哲:I

    .line 2
    .line 3
    const-wide/16 p3, 0x0

    .line 4
    .line 5
    packed-switch p0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    if-nez p2, :cond_0

    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰哲楪苏世()V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    check-cast p2, Ljava/lang/Float;

    .line 15
    .line 16
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    sget-object p2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNonStringValueAsString:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 21
    .line 22
    iget-wide v0, p2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 23
    .line 24
    and-long/2addr p5, v0

    .line 25
    cmp-long p2, p5, p3

    .line 26
    .line 27
    if-eqz p2, :cond_1

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-static {p0}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子哲世苏兰(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲兰世楪苏(F)V

    .line 41
    .line 42
    .line 43
    :goto_0
    return-void

    .line 44
    :pswitch_0
    if-nez p2, :cond_2

    .line 45
    .line 46
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰哲世楪苏()V

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    check-cast p2, Ljava/lang/Double;

    .line 51
    .line 52
    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    .line 53
    .line 54
    .line 55
    move-result-wide v0

    .line 56
    sget-object p0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNonStringValueAsString:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 57
    .line 58
    iget-wide v2, p0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 59
    .line 60
    and-long/2addr p5, v2

    .line 61
    cmp-long p0, p5, p3

    .line 62
    .line 63
    if-eqz p0, :cond_3

    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    invoke-static {v0, v1}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子哲世苏兰(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_3
    invoke-virtual {p1, v0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲苏兰楪世(D)V

    .line 77
    .line 78
    .line 79
    :goto_1
    return-void

    .line 80
    nop

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final 飘花落叶言子楪哲苏世兰(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 4

    .line 1
    iget p3, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子哲兰苏世楪;->飘花落叶言子楪世苏兰哲:I

    .line 2
    .line 3
    iget-object p0, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子哲兰苏世楪;->飘花落叶言子楪世哲苏兰:Ljava/text/DecimalFormat;

    .line 4
    .line 5
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    packed-switch p3, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    if-nez p2, :cond_0

    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰哲楪苏世()V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    if-eqz p0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0, p2}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子世兰苏哲(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    check-cast p2, Ljava/lang/Float;

    .line 27
    .line 28
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    sget-object p2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNonStringValueAsString:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 33
    .line 34
    iget-wide p2, p2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 35
    .line 36
    and-long/2addr p2, p5

    .line 37
    cmp-long p2, p2, v0

    .line 38
    .line 39
    if-eqz p2, :cond_2

    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    invoke-static {p0}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子哲世苏兰(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲兰世楪苏(F)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, p5, p6}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪苏世哲兰(J)J

    .line 56
    .line 57
    .line 58
    move-result-wide p2

    .line 59
    sget-object p0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteClassName:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 60
    .line 61
    iget-wide p5, p0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 62
    .line 63
    and-long/2addr p5, p2

    .line 64
    cmp-long p0, p5, v0

    .line 65
    .line 66
    if-eqz p0, :cond_3

    .line 67
    .line 68
    sget-object p0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNonStringKeyAsString:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 69
    .line 70
    iget-wide p5, p0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 71
    .line 72
    and-long/2addr p5, p2

    .line 73
    cmp-long p0, p5, v0

    .line 74
    .line 75
    if-nez p0, :cond_3

    .line 76
    .line 77
    sget-object p0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->NotWriteNumberClassName:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 78
    .line 79
    iget-wide p5, p0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 80
    .line 81
    and-long/2addr p2, p5

    .line 82
    cmp-long p0, p2, v0

    .line 83
    .line 84
    if-nez p0, :cond_3

    .line 85
    .line 86
    const-class p0, Ljava/lang/Float;

    .line 87
    .line 88
    if-eq p4, p0, :cond_3

    .line 89
    .line 90
    sget-object p0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 91
    .line 92
    if-eq p4, p0, :cond_3

    .line 93
    .line 94
    const/16 p0, 0x46

    .line 95
    .line 96
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子世苏兰哲(C)V

    .line 97
    .line 98
    .line 99
    :cond_3
    :goto_0
    return-void

    .line 100
    :pswitch_0
    if-nez p2, :cond_4

    .line 101
    .line 102
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰哲楪苏世()V

    .line 103
    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_4
    if-nez p0, :cond_5

    .line 107
    .line 108
    iget-object p3, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 109
    .line 110
    :cond_5
    if-eqz p0, :cond_6

    .line 111
    .line 112
    invoke-virtual {p0, p2}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子世兰苏哲(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_6
    check-cast p2, Ljava/lang/Double;

    .line 121
    .line 122
    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    .line 123
    .line 124
    .line 125
    move-result-wide p2

    .line 126
    sget-object p0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNonStringValueAsString:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 127
    .line 128
    iget-wide v2, p0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 129
    .line 130
    and-long/2addr v2, p5

    .line 131
    cmp-long p0, v2, v0

    .line 132
    .line 133
    if-eqz p0, :cond_7

    .line 134
    .line 135
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    invoke-static {p2, p3}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子哲世苏兰(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_7
    invoke-virtual {p1, p2, p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲苏兰楪世(D)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {p1, p5, p6}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪苏世哲兰(J)J

    .line 150
    .line 151
    .line 152
    move-result-wide p2

    .line 153
    sget-object p0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteClassName:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 154
    .line 155
    iget-wide p5, p0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 156
    .line 157
    and-long/2addr p5, p2

    .line 158
    cmp-long p0, p5, v0

    .line 159
    .line 160
    if-eqz p0, :cond_8

    .line 161
    .line 162
    sget-object p0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNonStringKeyAsString:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 163
    .line 164
    iget-wide p5, p0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 165
    .line 166
    and-long/2addr p5, p2

    .line 167
    cmp-long p0, p5, v0

    .line 168
    .line 169
    if-nez p0, :cond_8

    .line 170
    .line 171
    sget-object p0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->NotWriteNumberClassName:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 172
    .line 173
    iget-wide p5, p0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 174
    .line 175
    and-long/2addr p2, p5

    .line 176
    cmp-long p0, p2, v0

    .line 177
    .line 178
    if-nez p0, :cond_8

    .line 179
    .line 180
    const-class p0, Ljava/lang/Double;

    .line 181
    .line 182
    if-eq p4, p0, :cond_8

    .line 183
    .line 184
    sget-object p0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 185
    .line 186
    if-eq p4, p0, :cond_8

    .line 187
    .line 188
    const/16 p0, 0x44

    .line 189
    .line 190
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子世苏兰哲(C)V

    .line 191
    .line 192
    .line 193
    :cond_8
    :goto_1
    return-void

    .line 194
    nop

    .line 195
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
