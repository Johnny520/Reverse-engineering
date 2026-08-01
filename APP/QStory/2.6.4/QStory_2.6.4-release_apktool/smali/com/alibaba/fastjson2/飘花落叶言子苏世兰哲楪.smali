.class public final Lcom/alibaba/fastjson2/飘花落叶言子苏世兰哲楪;
.super Lcom/alibaba/fastjson2/飘花落叶言子苏哲世楪兰;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子楪世苏兰哲:I

.field public final 飘花落叶言子楪世苏哲兰:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏世兰哲楪;->飘花落叶言子楪世苏哲兰:I

    .line 5
    .line 6
    iput p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏世兰哲楪;->飘花落叶言子楪世苏兰哲:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏兰哲(Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;)V
    .locals 7

    .line 1
    iget-object v0, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏兰哲:Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世兰苏哲:Ljava/lang/Object;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 9
    .line 10
    :goto_0
    new-instance v1, Lcom/alibaba/fastjson2/JSONArray;

    .line 11
    .line 12
    invoke-direct {v1}, Lcom/alibaba/fastjson2/JSONArray;-><init>()V

    .line 13
    .line 14
    .line 15
    instance-of v2, v0, Ljava/util/List;

    .line 16
    .line 17
    iget v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏世兰哲楪;->飘花落叶言子楪世苏哲兰:I

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    iget p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏世兰哲楪;->飘花落叶言子楪世苏兰哲:I

    .line 21
    .line 22
    const/4 v5, 0x1

    .line 23
    if-eqz v2, :cond_4

    .line 24
    .line 25
    check-cast v0, Ljava/util/List;

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    :goto_1
    if-ge v4, v2, :cond_3

    .line 32
    .line 33
    if-ltz v3, :cond_1

    .line 34
    .line 35
    move v6, v4

    .line 36
    goto :goto_2

    .line 37
    :cond_1
    sub-int v6, v4, v2

    .line 38
    .line 39
    :goto_2
    if-lt v6, v3, :cond_2

    .line 40
    .line 41
    if-ge v6, p0, :cond_2

    .line 42
    .line 43
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_3
    iput-object v1, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 54
    .line 55
    iput-boolean v5, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪苏世哲兰:Z

    .line 56
    .line 57
    return-void

    .line 58
    :cond_4
    instance-of v2, v0, [Ljava/lang/Object;

    .line 59
    .line 60
    if-eqz v2, :cond_9

    .line 61
    .line 62
    check-cast v0, [Ljava/lang/Object;

    .line 63
    .line 64
    :goto_3
    array-length v2, v0

    .line 65
    if-ge v4, v2, :cond_8

    .line 66
    .line 67
    if-lt v4, v3, :cond_5

    .line 68
    .line 69
    if-le v4, p0, :cond_6

    .line 70
    .line 71
    :cond_5
    array-length v2, v0

    .line 72
    sub-int v2, v4, v2

    .line 73
    .line 74
    if-le v2, v3, :cond_7

    .line 75
    .line 76
    array-length v2, v0

    .line 77
    sub-int v2, v4, v2

    .line 78
    .line 79
    if-gt v2, p0, :cond_7

    .line 80
    .line 81
    :cond_6
    aget-object v2, v0, v4

    .line 82
    .line 83
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    :cond_7
    add-int/lit8 v4, v4, 0x1

    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_8
    iput-object v1, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 90
    .line 91
    iput-boolean v5, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪苏世哲兰:Z

    .line 92
    .line 93
    return-void

    .line 94
    :cond_9
    const-string p0, "TODO"

    .line 95
    .line 96
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    return-void
.end method

.method public final 飘花落叶言子楪世苏哲兰(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;)V
    .locals 6

    .line 1
    iget-object v0, p2, Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏兰哲:Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-boolean v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪苏世哲兰:Z

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    iget-object v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世哲苏兰:Lcom/alibaba/fastjson2/飘花落叶言子苏哲世楪兰;

    .line 10
    .line 11
    instance-of v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子苏楪兰哲世;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object v0, p2, Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世哲兰苏:Lcom/alibaba/fastjson2/飘花落叶言子苏哲世楪兰;

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    :cond_0
    invoke-virtual {p0, p2}, Lcom/alibaba/fastjson2/飘花落叶言子苏世兰哲楪;->飘花落叶言子楪世苏兰哲(Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    iget-boolean v0, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲兰世苏:Z

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏世兰哲楪;->飘花落叶言子楪世苏兰哲:I

    .line 27
    .line 28
    iget p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏世兰哲楪;->飘花落叶言子楪世苏哲兰:I

    .line 29
    .line 30
    const/4 v3, 0x1

    .line 31
    if-eqz v0, :cond_8

    .line 32
    .line 33
    new-instance v0, Lcom/alibaba/fastjson2/JSONArray;

    .line 34
    .line 35
    invoke-direct {v0}, Lcom/alibaba/fastjson2/JSONArray;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲兰世子苏()I

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    :goto_0
    if-ge v1, v4, :cond_4

    .line 43
    .line 44
    if-ltz p0, :cond_3

    .line 45
    .line 46
    if-lt v1, p0, :cond_2

    .line 47
    .line 48
    if-ge v1, v2, :cond_2

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲兰子苏世()V

    .line 52
    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_3
    :goto_1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子哲世苏兰()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    invoke-virtual {v0, v5}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_4
    if-gez p0, :cond_7

    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    add-int/lit8 v1, p1, -0x1

    .line 72
    .line 73
    :goto_3
    if-ltz v1, :cond_7

    .line 74
    .line 75
    sub-int v4, v1, p1

    .line 76
    .line 77
    if-lt v4, p0, :cond_5

    .line 78
    .line 79
    if-lt v4, v2, :cond_6

    .line 80
    .line 81
    :cond_5
    invoke-virtual {v0, v1}, Ljava/util/AbstractList;->remove(I)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    :cond_6
    add-int/lit8 v1, v1, -0x1

    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_7
    iput-object v0, p2, Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 88
    .line 89
    iput-boolean v3, p2, Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪苏世哲兰:Z

    .line 90
    .line 91
    return-void

    .line 92
    :cond_8
    new-instance v0, Lcom/alibaba/fastjson2/JSONArray;

    .line 93
    .line 94
    invoke-direct {v0}, Lcom/alibaba/fastjson2/JSONArray;-><init>()V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰世苏哲楪()V

    .line 98
    .line 99
    .line 100
    :goto_4
    iget-char v4, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 101
    .line 102
    const/16 v5, 0x1a

    .line 103
    .line 104
    if-eq v4, v5, :cond_13

    .line 105
    .line 106
    const/16 v5, 0x5d

    .line 107
    .line 108
    if-ne v4, v5, :cond_9

    .line 109
    .line 110
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰世苏哲楪()V

    .line 111
    .line 112
    .line 113
    goto/16 :goto_8

    .line 114
    .line 115
    :cond_9
    if-ltz p0, :cond_b

    .line 116
    .line 117
    if-lt v1, p0, :cond_a

    .line 118
    .line 119
    if-ge v1, v2, :cond_a

    .line 120
    .line 121
    goto :goto_5

    .line 122
    :cond_a
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲兰子苏世()V

    .line 123
    .line 124
    .line 125
    iget-char v4, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 126
    .line 127
    const/16 v5, 0x2c

    .line 128
    .line 129
    if-ne v4, v5, :cond_12

    .line 130
    .line 131
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰世苏哲楪()V

    .line 132
    .line 133
    .line 134
    goto :goto_7

    .line 135
    :cond_b
    :goto_5
    const/16 v5, 0x22

    .line 136
    .line 137
    if-eq v4, v5, :cond_11

    .line 138
    .line 139
    const/16 v5, 0x27

    .line 140
    .line 141
    if-eq v4, v5, :cond_11

    .line 142
    .line 143
    const/16 v5, 0x2b

    .line 144
    .line 145
    if-eq v4, v5, :cond_10

    .line 146
    .line 147
    const/16 v5, 0x5b

    .line 148
    .line 149
    if-eq v4, v5, :cond_f

    .line 150
    .line 151
    const/16 v5, 0x66

    .line 152
    .line 153
    if-eq v4, v5, :cond_e

    .line 154
    .line 155
    const/16 v5, 0x6e

    .line 156
    .line 157
    if-eq v4, v5, :cond_d

    .line 158
    .line 159
    const/16 v5, 0x74

    .line 160
    .line 161
    if-eq v4, v5, :cond_e

    .line 162
    .line 163
    const/16 v5, 0x7b

    .line 164
    .line 165
    if-eq v4, v5, :cond_c

    .line 166
    .line 167
    const/16 v5, 0x2d

    .line 168
    .line 169
    if-eq v4, v5, :cond_10

    .line 170
    .line 171
    const/16 v5, 0x2e

    .line 172
    .line 173
    if-eq v4, v5, :cond_10

    .line 174
    .line 175
    packed-switch v4, :pswitch_data_0

    .line 176
    .line 177
    .line 178
    const-string p0, "TODO : "

    .line 179
    .line 180
    iget-char p1, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 181
    .line 182
    invoke-static {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰(ILjava/lang/String;)V

    .line 183
    .line 184
    .line 185
    return-void

    .line 186
    :cond_c
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲子世兰苏()Ljava/util/Map;

    .line 187
    .line 188
    .line 189
    move-result-object v4

    .line 190
    goto :goto_6

    .line 191
    :cond_d
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏兰世哲子()V

    .line 192
    .line 193
    .line 194
    const/4 v4, 0x0

    .line 195
    goto :goto_6

    .line 196
    :cond_e
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子兰苏世哲()Z

    .line 197
    .line 198
    .line 199
    move-result v4

    .line 200
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 201
    .line 202
    .line 203
    move-result-object v4

    .line 204
    goto :goto_6

    .line 205
    :cond_f
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子哲世兰苏()Ljava/util/List;

    .line 206
    .line 207
    .line 208
    move-result-object v4

    .line 209
    goto :goto_6

    .line 210
    :cond_10
    :pswitch_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲子世苏兰()V

    .line 211
    .line 212
    .line 213
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏哲兰楪世()Ljava/lang/Number;

    .line 214
    .line 215
    .line 216
    move-result-object v4

    .line 217
    goto :goto_6

    .line 218
    :cond_11
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲世苏子兰()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v4

    .line 222
    :goto_6
    invoke-virtual {v0, v4}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    :cond_12
    :goto_7
    add-int/lit8 v1, v1, 0x1

    .line 226
    .line 227
    goto :goto_4

    .line 228
    :cond_13
    :goto_8
    if-gez p0, :cond_16

    .line 229
    .line 230
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    .line 231
    .line 232
    .line 233
    move-result p1

    .line 234
    add-int/lit8 v1, p1, -0x1

    .line 235
    .line 236
    :goto_9
    if-ltz v1, :cond_16

    .line 237
    .line 238
    sub-int v4, v1, p1

    .line 239
    .line 240
    if-lt v4, p0, :cond_14

    .line 241
    .line 242
    if-lt v4, v2, :cond_15

    .line 243
    .line 244
    :cond_14
    invoke-virtual {v0, v1}, Ljava/util/AbstractList;->remove(I)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    :cond_15
    add-int/lit8 v1, v1, -0x1

    .line 248
    .line 249
    goto :goto_9

    .line 250
    :cond_16
    iput-object v0, p2, Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 251
    .line 252
    iput-boolean v3, p2, Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪苏世哲兰:Z

    .line 253
    .line 254
    return-void

    .line 255
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
