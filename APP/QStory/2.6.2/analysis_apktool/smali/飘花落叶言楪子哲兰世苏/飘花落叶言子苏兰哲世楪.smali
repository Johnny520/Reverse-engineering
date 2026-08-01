.class public final L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰哲世楪;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static 飘花落叶言子楪世哲苏兰:L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪哲世;


# instance fields
.field public final 飘花落叶言子楪世苏兰哲:L飘花落叶言楪世子苏兰哲/飘花落叶言子楪世哲兰苏;

.field public final 飘花落叶言子楪世苏哲兰:L飘花落叶言楪子哲兰世苏/飘花落叶言楪子世苏哲兰;


# direct methods
.method public constructor <init>(L飘花落叶言楪子哲兰世苏/飘花落叶言楪子世苏哲兰;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪子哲兰世苏/飘花落叶言楪子世苏哲兰;

    .line 5
    .line 6
    new-instance p1, L飘花落叶言楪世子苏兰哲/飘花落叶言子楪世哲兰苏;

    .line 7
    .line 8
    const/16 v0, 0xb

    .line 9
    .line 10
    invoke-direct {p1, p0, v0}, L飘花落叶言楪世子苏兰哲/飘花落叶言子楪世哲兰苏;-><init>(Ljava/lang/Object;I)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏兰哲:L飘花落叶言楪世子苏兰哲/飘花落叶言子楪世哲兰苏;

    .line 14
    .line 15
    return-void
.end method

.method public static 飘花落叶言子楪世苏哲兰(Ljava/lang/Class;Ljava/lang/String;)L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x4

    .line 6
    const/4 v2, 0x1

    .line 7
    const/4 v3, -0x1

    .line 8
    sparse-switch v0, :sswitch_data_0

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :sswitch_0
    const-string v0, "org.joda.time.LocalDateTime"

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v3, 0x6

    .line 22
    goto :goto_0

    .line 23
    :sswitch_1
    const-string v0, "java.sql.Timestamp"

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-nez p1, :cond_1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const/4 v3, 0x5

    .line 33
    goto :goto_0

    .line 34
    :sswitch_2
    const-string v0, "org.joda.time.DateTime"

    .line 35
    .line 36
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-nez p1, :cond_2

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    move v3, v1

    .line 44
    goto :goto_0

    .line 45
    :sswitch_3
    const-string v0, "org.joda.time.chrono.ISOChronology"

    .line 46
    .line 47
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-nez p1, :cond_3

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_3
    const/4 v3, 0x3

    .line 55
    goto :goto_0

    .line 56
    :sswitch_4
    const-string v0, "java.sql.Time"

    .line 57
    .line 58
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    if-nez p1, :cond_4

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_4
    const/4 v3, 0x2

    .line 66
    goto :goto_0

    .line 67
    :sswitch_5
    const-string v0, "org.joda.time.chrono.GregorianChronology"

    .line 68
    .line 69
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    if-nez p1, :cond_5

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_5
    move v3, v2

    .line 77
    goto :goto_0

    .line 78
    :sswitch_6
    const-string v0, "org.joda.time.LocalDate"

    .line 79
    .line 80
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-nez p1, :cond_6

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_6
    const/4 v3, 0x0

    .line 88
    :goto_0
    const/4 p1, 0x0

    .line 89
    packed-switch v3, :pswitch_data_0

    .line 90
    .line 91
    .line 92
    sget-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲世苏:Ljava/lang/Class;

    .line 93
    .line 94
    const-class v1, Ljava/sql/Clob;

    .line 95
    .line 96
    if-nez v0, :cond_7

    .line 97
    .line 98
    sget-boolean v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲苏世:Z

    .line 99
    .line 100
    if-nez v0, :cond_7

    .line 101
    .line 102
    :try_start_0
    sput-object v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲世苏:Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :catchall_0
    sput-boolean v2, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲苏世:Z

    .line 106
    .line 107
    :cond_7
    :goto_1
    sget-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲世苏:Ljava/lang/Class;

    .line 108
    .line 109
    if-eqz v0, :cond_a

    .line 110
    .line 111
    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 112
    .line 113
    .line 114
    move-result p0

    .line 115
    if-eqz p0, :cond_a

    .line 116
    .line 117
    new-instance p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰哲世苏;

    .line 118
    .line 119
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 120
    .line 121
    .line 122
    sget-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲世苏:Ljava/lang/Class;

    .line 123
    .line 124
    if-nez v0, :cond_8

    .line 125
    .line 126
    sget-boolean v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲苏世:Z

    .line 127
    .line 128
    if-nez v0, :cond_8

    .line 129
    .line 130
    :try_start_1
    sput-object v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲世苏:Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 131
    .line 132
    goto :goto_2

    .line 133
    :catchall_1
    sput-boolean v2, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲苏世:Z

    .line 134
    .line 135
    :cond_8
    :goto_2
    sget-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲世苏:Ljava/lang/Class;

    .line 136
    .line 137
    if-eqz v0, :cond_9

    .line 138
    .line 139
    return-object p0

    .line 140
    :cond_9
    const-string p0, "class java.sql.Clob not found"

    .line 141
    .line 142
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    :cond_a
    return-object p1

    .line 146
    :pswitch_0
    sget v0, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪苏哲世兰:I

    .line 147
    .line 148
    new-instance v0, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏哲兰楪;

    .line 149
    .line 150
    invoke-direct {v0, p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏哲兰楪;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    return-object v0

    .line 154
    :pswitch_1
    new-instance p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世楪哲兰苏;

    .line 155
    .line 156
    invoke-direct {p0, p1, p1}, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 157
    .line 158
    .line 159
    return-object p0

    .line 160
    :pswitch_2
    new-instance p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰哲苏楪世;

    .line 161
    .line 162
    new-instance v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世苏哲;

    .line 163
    .line 164
    invoke-direct {v0, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世苏哲;-><init>(I)V

    .line 165
    .line 166
    .line 167
    invoke-direct {p0, p1, p1, v0}, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰哲苏楪世;-><init>(Ljava/lang/String;Ljava/util/Locale;Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世苏哲;)V

    .line 168
    .line 169
    .line 170
    return-object p0

    .line 171
    :pswitch_3
    sget p1, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪苏哲世兰:I

    .line 172
    .line 173
    new-instance p1, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏楪哲兰;

    .line 174
    .line 175
    invoke-direct {p1, p0}, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏楪哲兰;-><init>(Ljava/lang/Class;)V

    .line 176
    .line 177
    .line 178
    return-object p1

    .line 179
    :pswitch_4
    sget-object p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰世苏:Lcom/alibaba/fastjson2/util/飘花落叶言子世楪苏兰哲;

    .line 180
    .line 181
    return-object p0

    .line 182
    :pswitch_5
    sget p1, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪苏哲世兰:I

    .line 183
    .line 184
    new-instance p1, Lcom/alibaba/fastjson2/util/飘花落叶言子世楪兰哲苏;

    .line 185
    .line 186
    invoke-direct {p1, p0}, Lcom/alibaba/fastjson2/util/飘花落叶言子世楪兰哲苏;-><init>(Ljava/lang/Class;)V

    .line 187
    .line 188
    .line 189
    return-object p1

    .line 190
    :pswitch_6
    sget v0, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪苏哲世兰:I

    .line 191
    .line 192
    new-instance v0, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏兰楪哲;

    .line 193
    .line 194
    invoke-direct {v0, p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏兰楪哲;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    return-object v0

    .line 198
    nop

    .line 199
    :sswitch_data_0
    .sparse-switch
        -0x7295bf66 -> :sswitch_6
        -0x62d88e6e -> :sswitch_5
        0x40dd4159 -> :sswitch_4
        0x47497b71 -> :sswitch_3
        0x4872249a -> :sswitch_2
        0x4aad720a -> :sswitch_1
        0x56ec2a87 -> :sswitch_0
    .end sparse-switch

    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
