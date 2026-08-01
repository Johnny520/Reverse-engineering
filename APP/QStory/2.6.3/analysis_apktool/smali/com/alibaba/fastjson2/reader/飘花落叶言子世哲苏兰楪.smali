.class public final Lcom/alibaba/fastjson2/reader/飘花落叶言子世哲苏兰楪;
.super Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏世兰哲;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final 飘花落叶言子楪世哲兰苏:J

.field public static final 飘花落叶言子楪世哲苏兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子世哲苏兰楪;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世哲苏兰楪;

    .line 2
    .line 3
    const-class v1, [Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏世兰哲;-><init>(Ljava/lang/Class;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲苏兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子世哲苏兰楪;

    .line 9
    .line 10
    const-string v0, "[O"

    .line 11
    .line 12
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    sput-wide v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲兰苏:J

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏楪世兰()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    goto/16 :goto_2

    .line 9
    .line 10
    :cond_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲楪世兰苏()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/16 v2, 0x7b

    .line 15
    .line 16
    if-eqz v0, :cond_c

    .line 17
    .line 18
    const/16 p0, 0x10

    .line 19
    .line 20
    new-array p0, p0, [Ljava/lang/Object;

    .line 21
    .line 22
    const/4 p2, 0x0

    .line 23
    :goto_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲楪世苏兰()Z

    .line 24
    .line 25
    .line 26
    move-result p3

    .line 27
    if-nez p3, :cond_b

    .line 28
    .line 29
    add-int/lit8 p3, p2, 0x1

    .line 30
    .line 31
    array-length p4, p0

    .line 32
    sub-int p4, p3, p4

    .line 33
    .line 34
    if-lez p4, :cond_2

    .line 35
    .line 36
    array-length p4, p0

    .line 37
    shr-int/lit8 p5, p4, 0x1

    .line 38
    .line 39
    add-int/2addr p4, p5

    .line 40
    sub-int p5, p4, p3

    .line 41
    .line 42
    if-gez p5, :cond_1

    .line 43
    .line 44
    move p4, p3

    .line 45
    :cond_1
    invoke-static {p0, p4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    :cond_2
    iget-char p4, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 50
    .line 51
    const/16 p5, 0x22

    .line 52
    .line 53
    if-eq p4, p5, :cond_a

    .line 54
    .line 55
    const/16 p5, 0x2b

    .line 56
    .line 57
    if-eq p4, p5, :cond_9

    .line 58
    .line 59
    const/16 p5, 0x53

    .line 60
    .line 61
    if-eq p4, p5, :cond_7

    .line 62
    .line 63
    const/16 p5, 0x5b

    .line 64
    .line 65
    if-eq p4, p5, :cond_6

    .line 66
    .line 67
    const/16 p5, 0x66

    .line 68
    .line 69
    if-eq p4, p5, :cond_5

    .line 70
    .line 71
    const/16 p5, 0x6e

    .line 72
    .line 73
    if-eq p4, p5, :cond_4

    .line 74
    .line 75
    const/16 p5, 0x74

    .line 76
    .line 77
    if-eq p4, p5, :cond_5

    .line 78
    .line 79
    if-eq p4, v2, :cond_3

    .line 80
    .line 81
    const/16 p5, 0x2d

    .line 82
    .line 83
    if-eq p4, p5, :cond_9

    .line 84
    .line 85
    const/16 p5, 0x2e

    .line 86
    .line 87
    if-eq p4, p5, :cond_9

    .line 88
    .line 89
    packed-switch p4, :pswitch_data_0

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    return-object v1

    .line 100
    :cond_3
    const-class p4, Ljava/lang/Object;

    .line 101
    .line 102
    invoke-virtual {p1, p4}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲兰苏楪世(Ljava/lang/Class;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p4

    .line 106
    goto :goto_1

    .line 107
    :cond_4
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世苏兰哲子()V

    .line 108
    .line 109
    .line 110
    move-object p4, v1

    .line 111
    goto :goto_1

    .line 112
    :cond_5
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰世哲楪苏()Z

    .line 113
    .line 114
    .line 115
    move-result p4

    .line 116
    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 117
    .line 118
    .line 119
    move-result-object p4

    .line 120
    goto :goto_1

    .line 121
    :cond_6
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰楪苏哲世()Ljava/util/List;

    .line 122
    .line 123
    .line 124
    move-result-object p4

    .line 125
    goto :goto_1

    .line 126
    :cond_7
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏世兰楪()Z

    .line 127
    .line 128
    .line 129
    move-result p4

    .line 130
    if-eqz p4, :cond_8

    .line 131
    .line 132
    const-class p4, Ljava/util/HashSet;

    .line 133
    .line 134
    invoke-virtual {p1, p4}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲兰苏楪世(Ljava/lang/Class;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p4

    .line 138
    goto :goto_1

    .line 139
    :cond_8
    invoke-virtual {p1, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    const-string p1, "Expected Set format but parsing failed: "

    .line 144
    .line 145
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    return-object v1

    .line 153
    :cond_9
    :pswitch_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世哲子兰苏()Ljava/lang/Number;

    .line 154
    .line 155
    .line 156
    move-result-object p4

    .line 157
    goto :goto_1

    .line 158
    :cond_a
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世兰哲子苏()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object p4

    .line 162
    :goto_1
    aput-object p4, p0, p2

    .line 163
    .line 164
    move p2, p3

    .line 165
    goto/16 :goto_0

    .line 166
    .line 167
    :cond_b
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲楪苏世兰()Z

    .line 168
    .line 169
    .line 170
    invoke-static {p0, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    return-object p0

    .line 175
    :cond_c
    iget-char v0, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 176
    .line 177
    if-ne v0, v2, :cond_d

    .line 178
    .line 179
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏兰哲世楪()V

    .line 180
    .line 181
    .line 182
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰苏哲楪世()J

    .line 183
    .line 184
    .line 185
    move-result-wide v2

    .line 186
    sget-wide v4, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世苏哲兰:J

    .line 187
    .line 188
    cmp-long v0, v2, v4

    .line 189
    .line 190
    if-nez v0, :cond_d

    .line 191
    .line 192
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世兰哲子苏()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    :cond_d
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏哲兰世楪()Z

    .line 196
    .line 197
    .line 198
    move-result v0

    .line 199
    if-eqz v0, :cond_10

    .line 200
    .line 201
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世兰哲子苏()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    if-eqz v0, :cond_f

    .line 206
    .line 207
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 208
    .line 209
    .line 210
    move-result v2

    .line 211
    if-eqz v2, :cond_e

    .line 212
    .line 213
    goto :goto_2

    .line 214
    :cond_e
    const-string v2, "@value"

    .line 215
    .line 216
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    move-result v0

    .line 220
    if-eqz v0, :cond_10

    .line 221
    .line 222
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏兰哲世楪()V

    .line 223
    .line 224
    .line 225
    invoke-virtual/range {p0 .. p5}, Lcom/alibaba/fastjson2/reader/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object p0

    .line 229
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏楪兰世()Z

    .line 230
    .line 231
    .line 232
    return-object p0

    .line 233
    :cond_f
    :goto_2
    return-object v1

    .line 234
    :cond_10
    const-string p0, "TODO"

    .line 235
    .line 236
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object p0

    .line 240
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    return-object v1

    .line 244
    nop

    .line 245
    :pswitch_data_0
    .packed-switch 0x30
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final 飘花落叶言子楪世哲苏兰(Ljava/util/Collection;J)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    new-array p0, p0, [Ljava/lang/Object;

    .line 6
    .line 7
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const/4 p2, 0x0

    .line 12
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result p3

    .line 16
    if-eqz p3, :cond_0

    .line 17
    .line 18
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p3

    .line 22
    add-int/lit8 v0, p2, 0x1

    .line 23
    .line 24
    aput-object p3, p0, p2

    .line 25
    .line 26
    move p2, v0

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    return-object p0
.end method

.method public final 飘花落叶言子楪苏兰世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 8

    .line 1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏楪哲兰世()B

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, -0x6e

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    const-class v7, [Ljava/lang/Object;

    .line 10
    .line 11
    sget-wide v3, Lcom/alibaba/fastjson2/reader/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲兰苏:J

    .line 12
    .line 13
    move-object v2, p1

    .line 14
    move-wide v5, p4

    .line 15
    invoke-virtual/range {v2 .. v7}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪苏哲兰世(JJLjava/lang/Class;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-eq p1, p0, :cond_1

    .line 20
    .line 21
    move-object p0, p1

    .line 22
    move-object p1, v2

    .line 23
    move-wide p4, v5

    .line 24
    invoke-interface/range {p0 .. p5}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪苏兰世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :cond_0
    move-object v2, p1

    .line 30
    move-wide v5, p4

    .line 31
    :cond_1
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏世兰子哲()I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    const/4 p1, -0x1

    .line 36
    const/4 p2, 0x0

    .line 37
    if-ne p0, p1, :cond_2

    .line 38
    .line 39
    return-object p2

    .line 40
    :cond_2
    new-array p1, p0, [Ljava/lang/Object;

    .line 41
    .line 42
    const/4 p3, 0x0

    .line 43
    :goto_0
    if-ge p3, p0, :cond_a

    .line 44
    .line 45
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏楪哲兰世()B

    .line 46
    .line 47
    .line 48
    move-result p4

    .line 49
    const/16 p5, 0x49

    .line 50
    .line 51
    if-lt p4, p5, :cond_3

    .line 52
    .line 53
    const/16 p5, 0x7d

    .line 54
    .line 55
    if-gt p4, p5, :cond_3

    .line 56
    .line 57
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世兰哲子苏()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p4

    .line 61
    goto :goto_1

    .line 62
    :cond_3
    if-ne p4, v1, :cond_5

    .line 63
    .line 64
    const-class v7, Ljava/lang/Object;

    .line 65
    .line 66
    const-wide/16 v3, 0x0

    .line 67
    .line 68
    invoke-virtual/range {v2 .. v7}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪苏哲兰世(JJLjava/lang/Class;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 69
    .line 70
    .line 71
    move-result-object p4

    .line 72
    if-eqz p4, :cond_4

    .line 73
    .line 74
    const/4 v4, 0x0

    .line 75
    move-wide v6, v5

    .line 76
    const/4 v5, 0x0

    .line 77
    move-object v3, v2

    .line 78
    move-object v2, p4

    .line 79
    invoke-interface/range {v2 .. v7}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪苏兰世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p4

    .line 83
    move-object v2, v3

    .line 84
    move-wide v5, v6

    .line 85
    goto :goto_1

    .line 86
    :cond_4
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰楪苏世哲()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p4

    .line 90
    goto :goto_1

    .line 91
    :cond_5
    const/16 p5, -0x51

    .line 92
    .line 93
    if-ne p4, p5, :cond_6

    .line 94
    .line 95
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏兰哲世楪()V

    .line 96
    .line 97
    .line 98
    move-object p4, p2

    .line 99
    goto :goto_1

    .line 100
    :cond_6
    const/16 p5, -0x4f

    .line 101
    .line 102
    if-ne p4, p5, :cond_7

    .line 103
    .line 104
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏兰哲世楪()V

    .line 105
    .line 106
    .line 107
    sget-object p4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_7
    const/16 p5, -0x50

    .line 111
    .line 112
    if-ne p4, p5, :cond_8

    .line 113
    .line 114
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏兰哲世楪()V

    .line 115
    .line 116
    .line 117
    sget-object p4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_8
    const/16 p5, -0x42

    .line 121
    .line 122
    if-ne p4, p5, :cond_9

    .line 123
    .line 124
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子世兰苏哲()J

    .line 125
    .line 126
    .line 127
    move-result-wide p4

    .line 128
    invoke-static {p4, p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 129
    .line 130
    .line 131
    move-result-object p4

    .line 132
    goto :goto_1

    .line 133
    :cond_9
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰楪苏世哲()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p4

    .line 137
    :goto_1
    aput-object p4, p1, p3

    .line 138
    .line 139
    add-int/lit8 p3, p3, 0x1

    .line 140
    .line 141
    goto :goto_0

    .line 142
    :cond_a
    return-object p1
.end method
