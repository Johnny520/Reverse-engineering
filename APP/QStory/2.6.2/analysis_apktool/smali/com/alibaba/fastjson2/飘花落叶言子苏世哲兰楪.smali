.class public final Lcom/alibaba/fastjson2/飘花落叶言子苏世哲兰楪;
.super Lcom/alibaba/fastjson2/飘花落叶言子苏哲楪兰世;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final 飘花落叶言子楪世苏兰哲:Lcom/alibaba/fastjson2/飘花落叶言子苏世哲兰楪;


# instance fields
.field public 飘花落叶言子楪世苏哲兰:Ljava/util/Random;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/飘花落叶言子苏世哲兰楪;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/alibaba/fastjson2/飘花落叶言子苏世哲兰楪;->飘花落叶言子楪世苏兰哲:Lcom/alibaba/fastjson2/飘花落叶言子苏世哲兰楪;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏兰哲(Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;)V
    .locals 3

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
    const/4 v2, 0x1

    .line 13
    if-eqz v1, :cond_3

    .line 14
    .line 15
    check-cast v0, Ljava/util/List;

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏世哲兰楪;->飘花落叶言子楪世苏哲兰:Ljava/util/Random;

    .line 25
    .line 26
    if-nez v1, :cond_2

    .line 27
    .line 28
    new-instance v1, Ljava/util/Random;

    .line 29
    .line 30
    invoke-direct {v1}, Ljava/util/Random;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏世哲兰楪;->飘花落叶言子楪世苏哲兰:Ljava/util/Random;

    .line 34
    .line 35
    :cond_2
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏世哲兰楪;->飘花落叶言子楪世苏哲兰:Ljava/util/Random;

    .line 36
    .line 37
    invoke-virtual {p0}, Ljava/util/Random;->nextInt()I

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    invoke-static {p0}, Ljava/lang/Math;->abs(I)I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    rem-int/2addr p0, v1

    .line 50
    invoke-interface {v0, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    iput-object p0, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 55
    .line 56
    iput-boolean v2, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰:Z

    .line 57
    .line 58
    return-void

    .line 59
    :cond_3
    instance-of v1, v0, [Ljava/lang/Object;

    .line 60
    .line 61
    if-eqz v1, :cond_6

    .line 62
    .line 63
    check-cast v0, [Ljava/lang/Object;

    .line 64
    .line 65
    array-length v1, v0

    .line 66
    if-nez v1, :cond_4

    .line 67
    .line 68
    :goto_1
    return-void

    .line 69
    :cond_4
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏世哲兰楪;->飘花落叶言子楪世苏哲兰:Ljava/util/Random;

    .line 70
    .line 71
    if-nez v1, :cond_5

    .line 72
    .line 73
    new-instance v1, Ljava/util/Random;

    .line 74
    .line 75
    invoke-direct {v1}, Ljava/util/Random;-><init>()V

    .line 76
    .line 77
    .line 78
    iput-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏世哲兰楪;->飘花落叶言子楪世苏哲兰:Ljava/util/Random;

    .line 79
    .line 80
    :cond_5
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏世哲兰楪;->飘花落叶言子楪世苏哲兰:Ljava/util/Random;

    .line 81
    .line 82
    invoke-virtual {p0}, Ljava/util/Random;->nextInt()I

    .line 83
    .line 84
    .line 85
    move-result p0

    .line 86
    array-length v1, v0

    .line 87
    rem-int/2addr p0, v1

    .line 88
    aget-object p0, v0, p0

    .line 89
    .line 90
    iput-object p0, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 91
    .line 92
    iput-boolean v2, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰:Z

    .line 93
    .line 94
    return-void

    .line 95
    :cond_6
    const-string p0, "TODO"

    .line 96
    .line 97
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    return-void
.end method

.method public final 飘花落叶言子楪世苏哲兰(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;)V
    .locals 5

    .line 1
    iget-object v0, p2, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲:Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-boolean v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰:Z

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    iget-object v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰:Lcom/alibaba/fastjson2/飘花落叶言子苏哲楪兰世;

    .line 10
    .line 11
    instance-of v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子苏楪兰世哲;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object v0, p2, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲兰苏:Lcom/alibaba/fastjson2/飘花落叶言子苏哲楪兰世;

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    :cond_0
    invoke-virtual {p0, p2}, Lcom/alibaba/fastjson2/飘花落叶言子苏世哲兰楪;->飘花落叶言子楪世苏兰哲(Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    iget-boolean v0, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲兰世苏:Z

    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    if-eqz v0, :cond_4

    .line 27
    .line 28
    new-instance v0, Lcom/alibaba/fastjson2/JSONArray;

    .line 29
    .line 30
    invoke-direct {v0}, Lcom/alibaba/fastjson2/JSONArray;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏世兰子哲()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    const/4 v3, 0x0

    .line 38
    :goto_0
    if-ge v3, v2, :cond_2

    .line 39
    .line 40
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰楪苏世哲()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    invoke-virtual {v0, v4}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    add-int/lit8 v3, v3, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    iget-object p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏世哲兰楪;->飘花落叶言子楪世苏哲兰:Ljava/util/Random;

    .line 51
    .line 52
    if-nez p1, :cond_3

    .line 53
    .line 54
    new-instance p1, Ljava/util/Random;

    .line 55
    .line 56
    invoke-direct {p1}, Ljava/util/Random;-><init>()V

    .line 57
    .line 58
    .line 59
    iput-object p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏世哲兰楪;->飘花落叶言子楪世苏哲兰:Ljava/util/Random;

    .line 60
    .line 61
    :cond_3
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏世哲兰楪;->飘花落叶言子楪世苏哲兰:Ljava/util/Random;

    .line 62
    .line 63
    invoke-virtual {p0}, Ljava/util/Random;->nextInt()I

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    invoke-static {p0}, Ljava/lang/Math;->abs(I)I

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    rem-int/2addr p0, p1

    .line 76
    invoke-virtual {v0, p0}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    iput-object p0, p2, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 81
    .line 82
    iput-boolean v1, p2, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰:Z

    .line 83
    .line 84
    return-void

    .line 85
    :cond_4
    new-instance v0, Lcom/alibaba/fastjson2/JSONArray;

    .line 86
    .line 87
    invoke-direct {v0}, Lcom/alibaba/fastjson2/JSONArray;-><init>()V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏兰哲世楪()V

    .line 91
    .line 92
    .line 93
    :goto_1
    iget-char v2, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 94
    .line 95
    const/16 v3, 0x1a

    .line 96
    .line 97
    if-eq v2, v3, :cond_c

    .line 98
    .line 99
    const/16 v3, 0x5d

    .line 100
    .line 101
    if-ne v2, v3, :cond_5

    .line 102
    .line 103
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏兰哲世楪()V

    .line 104
    .line 105
    .line 106
    goto :goto_3

    .line 107
    :cond_5
    const/16 v3, 0x22

    .line 108
    .line 109
    if-eq v2, v3, :cond_b

    .line 110
    .line 111
    const/16 v3, 0x27

    .line 112
    .line 113
    if-eq v2, v3, :cond_b

    .line 114
    .line 115
    const/16 v3, 0x2b

    .line 116
    .line 117
    if-eq v2, v3, :cond_a

    .line 118
    .line 119
    const/16 v3, 0x5b

    .line 120
    .line 121
    if-eq v2, v3, :cond_9

    .line 122
    .line 123
    const/16 v3, 0x66

    .line 124
    .line 125
    if-eq v2, v3, :cond_8

    .line 126
    .line 127
    const/16 v3, 0x6e

    .line 128
    .line 129
    if-eq v2, v3, :cond_7

    .line 130
    .line 131
    const/16 v3, 0x74

    .line 132
    .line 133
    if-eq v2, v3, :cond_8

    .line 134
    .line 135
    const/16 v3, 0x7b

    .line 136
    .line 137
    if-eq v2, v3, :cond_6

    .line 138
    .line 139
    const/16 v3, 0x2d

    .line 140
    .line 141
    if-eq v2, v3, :cond_a

    .line 142
    .line 143
    const/16 v3, 0x2e

    .line 144
    .line 145
    if-eq v2, v3, :cond_a

    .line 146
    .line 147
    packed-switch v2, :pswitch_data_0

    .line 148
    .line 149
    .line 150
    const-string p0, "TODO : "

    .line 151
    .line 152
    iget-char p1, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 153
    .line 154
    invoke-static {p1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲世苏兰(ILjava/lang/String;)V

    .line 155
    .line 156
    .line 157
    return-void

    .line 158
    :cond_6
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世哲苏兰子()Ljava/util/Map;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    goto :goto_2

    .line 163
    :cond_7
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世苏兰哲子()V

    .line 164
    .line 165
    .line 166
    const/4 v2, 0x0

    .line 167
    goto :goto_2

    .line 168
    :cond_8
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰世哲楪苏()Z

    .line 169
    .line 170
    .line 171
    move-result v2

    .line 172
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    goto :goto_2

    .line 177
    :cond_9
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰楪苏哲世()Ljava/util/List;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    goto :goto_2

    .line 182
    :cond_a
    :pswitch_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世哲苏子兰()V

    .line 183
    .line 184
    .line 185
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世哲苏兰楪()Ljava/lang/Number;

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    goto :goto_2

    .line 190
    :cond_b
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世兰哲子苏()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    :goto_2
    invoke-virtual {v0, v2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    goto :goto_1

    .line 198
    :cond_c
    :goto_3
    iget-object p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏世哲兰楪;->飘花落叶言子楪世苏哲兰:Ljava/util/Random;

    .line 199
    .line 200
    if-nez p1, :cond_d

    .line 201
    .line 202
    new-instance p1, Ljava/util/Random;

    .line 203
    .line 204
    invoke-direct {p1}, Ljava/util/Random;-><init>()V

    .line 205
    .line 206
    .line 207
    iput-object p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏世哲兰楪;->飘花落叶言子楪世苏哲兰:Ljava/util/Random;

    .line 208
    .line 209
    :cond_d
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏世哲兰楪;->飘花落叶言子楪世苏哲兰:Ljava/util/Random;

    .line 210
    .line 211
    invoke-virtual {p0}, Ljava/util/Random;->nextInt()I

    .line 212
    .line 213
    .line 214
    move-result p0

    .line 215
    invoke-static {p0}, Ljava/lang/Math;->abs(I)I

    .line 216
    .line 217
    .line 218
    move-result p0

    .line 219
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    .line 220
    .line 221
    .line 222
    move-result p1

    .line 223
    rem-int/2addr p0, p1

    .line 224
    invoke-virtual {v0, p0}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object p0

    .line 228
    iput-object p0, p2, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 229
    .line 230
    iput-boolean v1, p2, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰:Z

    .line 231
    .line 232
    return-void

    .line 233
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
