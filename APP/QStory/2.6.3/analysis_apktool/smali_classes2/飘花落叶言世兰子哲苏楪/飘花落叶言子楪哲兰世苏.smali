.class public final L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public 飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

.field public 飘花落叶言子楪世兰苏哲:Ljava/io/Serializable;

.field public 飘花落叶言子楪世哲兰苏:Ljava/io/Serializable;

.field public 飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

.field public 飘花落叶言子楪世苏兰哲:I

.field public final synthetic 飘花落叶言子楪世苏哲兰:I

.field public 飘花落叶言子楪苏世兰哲:Ljava/lang/Object;

.field public 飘花落叶言子楪苏世哲兰:Ljava/lang/Object;

.field public 飘花落叶言子楪苏哲世兰:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    iput p1, p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    const-string p1, ""

    .line 10
    .line 11
    iput-object p1, p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲兰苏:Ljava/io/Serializable;

    .line 12
    .line 13
    iput-object p1, p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世兰苏哲:Ljava/io/Serializable;

    .line 14
    .line 15
    const/4 v0, -0x1

    .line 16
    iput v0, p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏兰哲:I

    .line 17
    .line 18
    filled-new-array {p1}, [Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-static {p1}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏世兰哲;->飘花落叶言子苏世哲兰楪([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iput-object p1, p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪苏世兰哲:Ljava/lang/Object;

    .line 27
    .line 28
    return-void

    .line 29
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(L飘花落叶言楪苏兰世子哲/飘花落叶言子楪哲苏兰世;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:I

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    invoke-virtual {p0}, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世兰哲苏()V

    .line 35
    sget-object v0, Landroid/util/StateSet;->WILD_CARD:[I

    invoke-virtual {p0, v0, p1}, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏兰哲([IL飘花落叶言楪苏兰世子哲/飘花落叶言子楪哲苏兰世;)V

    return-void
.end method

.method public static 飘花落叶言子楪苏世兰哲(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 6

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-gt v1, v2, :cond_3

    .line 12
    .line 13
    const/16 v2, 0x26

    .line 14
    .line 15
    const/4 v3, 0x4

    .line 16
    invoke-static {p0, v2, v1, v3}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子苏哲世楪兰(Ljava/lang/CharSequence;CII)I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const/4 v4, -0x1

    .line 21
    if-ne v2, v4, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    :cond_0
    const/16 v5, 0x3d

    .line 28
    .line 29
    invoke-static {p0, v5, v1, v3}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子苏哲世楪兰(Ljava/lang/CharSequence;CII)I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-eq v3, v4, :cond_2

    .line 34
    .line 35
    if-le v3, v2, :cond_1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    invoke-virtual {p0, v1, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    add-int/lit8 v3, v3, 0x1

    .line 46
    .line 47
    invoke-virtual {p0, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_2
    :goto_1
    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    const/4 v1, 0x0

    .line 63
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    :goto_2
    add-int/lit8 v1, v2, 0x1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_3
    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 8

    .line 1
    iget v0, p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Ljava/lang/String;

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v1, "://"

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const-string v1, "//"

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    :goto_0
    iget-object v1, p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲兰苏:Ljava/io/Serializable;

    .line 37
    .line 38
    check-cast v1, Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    const/16 v2, 0x3a

    .line 45
    .line 46
    if-lez v1, :cond_1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    iget-object v1, p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世兰苏哲:Ljava/io/Serializable;

    .line 50
    .line 51
    check-cast v1, Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-lez v1, :cond_3

    .line 58
    .line 59
    :goto_1
    iget-object v1, p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲兰苏:Ljava/io/Serializable;

    .line 60
    .line 61
    check-cast v1, Ljava/lang/String;

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    iget-object v1, p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世兰苏哲:Ljava/io/Serializable;

    .line 67
    .line 68
    check-cast v1, Ljava/lang/String;

    .line 69
    .line 70
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-lez v1, :cond_2

    .line 75
    .line 76
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    iget-object v1, p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世兰苏哲:Ljava/io/Serializable;

    .line 80
    .line 81
    check-cast v1, Ljava/lang/String;

    .line 82
    .line 83
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    :cond_2
    const/16 v1, 0x40

    .line 87
    .line 88
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    :cond_3
    iget-object v1, p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v1, Ljava/lang/String;

    .line 94
    .line 95
    if-eqz v1, :cond_5

    .line 96
    .line 97
    invoke-static {v1, v2}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子苏世楪哲兰(Ljava/lang/CharSequence;C)Z

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    if-eqz v1, :cond_4

    .line 102
    .line 103
    const/16 v1, 0x5b

    .line 104
    .line 105
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    iget-object v1, p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v1, Ljava/lang/String;

    .line 111
    .line 112
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    const/16 v1, 0x5d

    .line 116
    .line 117
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_4
    iget-object v1, p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v1, Ljava/lang/String;

    .line 124
    .line 125
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    :cond_5
    :goto_2
    iget v1, p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏兰哲:I

    .line 129
    .line 130
    const/4 v3, -0x1

    .line 131
    if-ne v1, v3, :cond_6

    .line 132
    .line 133
    iget-object v1, p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v1, Ljava/lang/String;

    .line 136
    .line 137
    if-eqz v1, :cond_a

    .line 138
    .line 139
    :cond_6
    invoke-virtual {p0}, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世兰苏哲()I

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    iget-object v4, p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v4, Ljava/lang/String;

    .line 146
    .line 147
    if-eqz v4, :cond_9

    .line 148
    .line 149
    const-string v5, "http"

    .line 150
    .line 151
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v5

    .line 155
    if-eqz v5, :cond_7

    .line 156
    .line 157
    const/16 v3, 0x50

    .line 158
    .line 159
    goto :goto_3

    .line 160
    :cond_7
    const-string v5, "https"

    .line 161
    .line 162
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v4

    .line 166
    if-eqz v4, :cond_8

    .line 167
    .line 168
    const/16 v3, 0x1bb

    .line 169
    .line 170
    :cond_8
    :goto_3
    if-eq v1, v3, :cond_a

    .line 171
    .line 172
    :cond_9
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    :cond_a
    iget-object v1, p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪苏世兰哲:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast v1, Ljava/util/ArrayList;

    .line 181
    .line 182
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 183
    .line 184
    .line 185
    move-result v2

    .line 186
    const/4 v3, 0x0

    .line 187
    move v4, v3

    .line 188
    :goto_4
    if-ge v4, v2, :cond_b

    .line 189
    .line 190
    const/16 v5, 0x2f

    .line 191
    .line 192
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v5

    .line 199
    check-cast v5, Ljava/lang/String;

    .line 200
    .line 201
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    add-int/lit8 v4, v4, 0x1

    .line 205
    .line 206
    goto :goto_4

    .line 207
    :cond_b
    iget-object v1, p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪苏哲世兰:Ljava/lang/Object;

    .line 208
    .line 209
    check-cast v1, Ljava/util/ArrayList;

    .line 210
    .line 211
    if-eqz v1, :cond_10

    .line 212
    .line 213
    const/16 v1, 0x3f

    .line 214
    .line 215
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    iget-object v1, p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪苏哲世兰:Ljava/lang/Object;

    .line 219
    .line 220
    check-cast v1, Ljava/util/ArrayList;

    .line 221
    .line 222
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 226
    .line 227
    .line 228
    move-result v2

    .line 229
    invoke-static {v3, v2}, Landroidx/window/area/飘花落叶言子楪苏世哲兰;->飘花落叶言子世苏哲兰楪(II)L飘花落叶言世子兰楪苏哲/飘花落叶言子楪苏世哲兰;

    .line 230
    .line 231
    .line 232
    move-result-object v2

    .line 233
    const/4 v3, 0x2

    .line 234
    invoke-static {v2, v3}, Landroidx/window/area/飘花落叶言子楪苏世哲兰;->飘花落叶言子世苏哲楪兰(L飘花落叶言世子兰楪苏哲/飘花落叶言子楪苏世哲兰;I)L飘花落叶言世子兰楪苏哲/飘花落叶言子楪世兰哲苏;

    .line 235
    .line 236
    .line 237
    move-result-object v2

    .line 238
    iget v3, v2, L飘花落叶言世子兰楪苏哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:I

    .line 239
    .line 240
    iget v4, v2, L飘花落叶言世子兰楪苏哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:I

    .line 241
    .line 242
    iget v2, v2, L飘花落叶言世子兰楪苏哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰苏世:I

    .line 243
    .line 244
    if-lez v2, :cond_c

    .line 245
    .line 246
    if-le v3, v4, :cond_d

    .line 247
    .line 248
    :cond_c
    if-gez v2, :cond_10

    .line 249
    .line 250
    if-gt v4, v3, :cond_10

    .line 251
    .line 252
    :cond_d
    :goto_5
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v5

    .line 256
    check-cast v5, Ljava/lang/String;

    .line 257
    .line 258
    add-int/lit8 v6, v3, 0x1

    .line 259
    .line 260
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v6

    .line 264
    check-cast v6, Ljava/lang/String;

    .line 265
    .line 266
    if-lez v3, :cond_e

    .line 267
    .line 268
    const/16 v7, 0x26

    .line 269
    .line 270
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    :cond_e
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 274
    .line 275
    .line 276
    if-eqz v6, :cond_f

    .line 277
    .line 278
    const/16 v5, 0x3d

    .line 279
    .line 280
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 281
    .line 282
    .line 283
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 284
    .line 285
    .line 286
    :cond_f
    if-eq v3, v4, :cond_10

    .line 287
    .line 288
    add-int/2addr v3, v2

    .line 289
    goto :goto_5

    .line 290
    :cond_10
    iget-object v1, p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪苏世哲兰:Ljava/lang/Object;

    .line 291
    .line 292
    check-cast v1, Ljava/lang/String;

    .line 293
    .line 294
    if-eqz v1, :cond_11

    .line 295
    .line 296
    const/16 v1, 0x23

    .line 297
    .line 298
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 299
    .line 300
    .line 301
    iget-object p0, p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪苏世哲兰:Ljava/lang/Object;

    .line 302
    .line 303
    check-cast p0, Ljava/lang/String;

    .line 304
    .line 305
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 306
    .line 307
    .line 308
    :cond_11
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object p0

    .line 312
    return-object p0

    .line 313
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public 飘花落叶言子楪世兰哲苏()V
    .locals 2

    .line 1
    new-instance v0, L飘花落叶言楪苏兰世子哲/飘花落叶言子楪哲苏兰世;

    .line 2
    .line 3
    invoke-direct {v0}, L飘花落叶言楪苏兰世子哲/飘花落叶言子楪哲苏兰世;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 7
    .line 8
    const/16 v0, 0xa

    .line 9
    .line 10
    new-array v1, v0, [[I

    .line 11
    .line 12
    iput-object v1, p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲兰苏:Ljava/io/Serializable;

    .line 13
    .line 14
    new-array v0, v0, [L飘花落叶言楪苏兰世子哲/飘花落叶言子楪哲苏兰世;

    .line 15
    .line 16
    iput-object v0, p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世兰苏哲:Ljava/io/Serializable;

    .line 17
    .line 18
    return-void
.end method

.method public 飘花落叶言子楪世兰苏哲()I
    .locals 2

    .line 1
    iget v0, p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏兰哲:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    return v0

    .line 7
    :cond_0
    iget-object p0, p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    const-string v0, "http"

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    const/16 v1, 0x50

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const-string v0, "https"

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-eqz p0, :cond_2

    .line 32
    .line 33
    const/16 v1, 0x1bb

    .line 34
    .line 35
    :cond_2
    :goto_0
    return v1
.end method

.method public 飘花落叶言子楪世哲兰苏()L飘花落叶言楪苏兰世子哲/飘花落叶言子世楪兰苏哲;
    .locals 1

    .line 1
    iget v0, p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏兰哲:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return-object p0

    .line 7
    :cond_0
    new-instance v0, L飘花落叶言楪苏兰世子哲/飘花落叶言子世楪兰苏哲;

    .line 8
    .line 9
    invoke-direct {v0, p0}, L飘花落叶言楪苏兰世子哲/飘花落叶言子世楪兰苏哲;-><init>(L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public 飘花落叶言子楪世哲苏兰()L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰苏世;
    .locals 13

    .line 1
    iget-object v0, p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v2, v0

    .line 4
    check-cast v2, Ljava/lang/String;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    if-eqz v2, :cond_6

    .line 8
    .line 9
    iget-object v1, p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲兰苏:Ljava/io/Serializable;

    .line 10
    .line 11
    check-cast v1, Ljava/lang/String;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x7

    .line 15
    invoke-static {v3, v3, v1, v4}, L飘花落叶言世兰哲楪苏子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏(IILjava/lang/String;I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iget-object v5, p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世兰苏哲:Ljava/io/Serializable;

    .line 20
    .line 21
    check-cast v5, Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {v3, v3, v5, v4}, L飘花落叶言世兰哲楪苏子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏(IILjava/lang/String;I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    iget-object v6, p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v6, Ljava/lang/String;

    .line 30
    .line 31
    if-eqz v6, :cond_5

    .line 32
    .line 33
    move v7, v4

    .line 34
    move-object v4, v5

    .line 35
    move-object v5, v6

    .line 36
    invoke-virtual {p0}, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世兰苏哲()I

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    iget-object v8, p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪苏世兰哲:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v8, Ljava/util/ArrayList;

    .line 43
    .line 44
    move v9, v7

    .line 45
    new-instance v7, Ljava/util/ArrayList;

    .line 46
    .line 47
    const/16 v10, 0xa

    .line 48
    .line 49
    invoke-static {v8, v10}, Lkotlin/collections/飘花落叶言子楪哲兰苏世;->飘花落叶言子哲楪苏世兰(Ljava/lang/Iterable;I)I

    .line 50
    .line 51
    .line 52
    move-result v11

    .line 53
    invoke-direct {v7, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object v8

    .line 60
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v11

    .line 64
    if-eqz v11, :cond_0

    .line 65
    .line 66
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v11

    .line 70
    check-cast v11, Ljava/lang/String;

    .line 71
    .line 72
    invoke-static {v3, v3, v11, v9}, L飘花落叶言世兰哲楪苏子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏(IILjava/lang/String;I)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v11

    .line 76
    invoke-virtual {v7, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_0
    iget-object v8, p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪苏哲世兰:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v8, Ljava/util/ArrayList;

    .line 83
    .line 84
    if-eqz v8, :cond_3

    .line 85
    .line 86
    new-instance v11, Ljava/util/ArrayList;

    .line 87
    .line 88
    invoke-static {v8, v10}, Lkotlin/collections/飘花落叶言子楪哲兰苏世;->飘花落叶言子哲楪苏世兰(Ljava/lang/Iterable;I)I

    .line 89
    .line 90
    .line 91
    move-result v10

    .line 92
    invoke-direct {v11, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 93
    .line 94
    .line 95
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 96
    .line 97
    .line 98
    move-result-object v8

    .line 99
    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result v10

    .line 103
    if-eqz v10, :cond_2

    .line 104
    .line 105
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v10

    .line 109
    check-cast v10, Ljava/lang/String;

    .line 110
    .line 111
    if-eqz v10, :cond_1

    .line 112
    .line 113
    const/4 v12, 0x3

    .line 114
    invoke-static {v3, v3, v10, v12}, L飘花落叶言世兰哲楪苏子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏(IILjava/lang/String;I)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v10

    .line 118
    goto :goto_2

    .line 119
    :cond_1
    move-object v10, v0

    .line 120
    :goto_2
    invoke-virtual {v11, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_2
    move-object v8, v11

    .line 125
    goto :goto_3

    .line 126
    :cond_3
    move-object v8, v0

    .line 127
    :goto_3
    iget-object v10, p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪苏世哲兰:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v10, Ljava/lang/String;

    .line 130
    .line 131
    if-eqz v10, :cond_4

    .line 132
    .line 133
    invoke-static {v3, v3, v10, v9}, L飘花落叶言世兰哲楪苏子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏(IILjava/lang/String;I)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    :cond_4
    move-object v9, v0

    .line 138
    invoke-virtual {p0}, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->toString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v10

    .line 142
    move-object v3, v1

    .line 143
    new-instance v1, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰苏世;

    .line 144
    .line 145
    invoke-direct/range {v1 .. v10}, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰苏世;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    return-object v1

    .line 149
    :cond_5
    const-string p0, "host == null"

    .line 150
    .line 151
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    return-object v0

    .line 155
    :cond_6
    const-string p0, "scheme == null"

    .line 156
    .line 157
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    return-object v0
.end method

.method public 飘花落叶言子楪世苏兰哲([IL飘花落叶言楪苏兰世子哲/飘花落叶言子楪哲苏兰世;)V
    .locals 5

    .line 1
    iget v0, p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏兰哲:I

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    array-length v1, p1

    .line 6
    if-nez v1, :cond_1

    .line 7
    .line 8
    :cond_0
    iput-object p2, p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 9
    .line 10
    :cond_1
    iget-object v1, p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲兰苏:Ljava/io/Serializable;

    .line 11
    .line 12
    check-cast v1, [[I

    .line 13
    .line 14
    array-length v2, v1

    .line 15
    if-lt v0, v2, :cond_2

    .line 16
    .line 17
    add-int/lit8 v2, v0, 0xa

    .line 18
    .line 19
    new-array v3, v2, [[I

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    invoke-static {v1, v4, v3, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 23
    .line 24
    .line 25
    iput-object v3, p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲兰苏:Ljava/io/Serializable;

    .line 26
    .line 27
    new-array v1, v2, [L飘花落叶言楪苏兰世子哲/飘花落叶言子楪哲苏兰世;

    .line 28
    .line 29
    iget-object v2, p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世兰苏哲:Ljava/io/Serializable;

    .line 30
    .line 31
    check-cast v2, [L飘花落叶言楪苏兰世子哲/飘花落叶言子楪哲苏兰世;

    .line 32
    .line 33
    invoke-static {v2, v4, v1, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 34
    .line 35
    .line 36
    iput-object v1, p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世兰苏哲:Ljava/io/Serializable;

    .line 37
    .line 38
    :cond_2
    iget-object v0, p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲兰苏:Ljava/io/Serializable;

    .line 39
    .line 40
    check-cast v0, [[I

    .line 41
    .line 42
    iget v1, p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏兰哲:I

    .line 43
    .line 44
    aput-object p1, v0, v1

    .line 45
    .line 46
    iget-object p1, p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世兰苏哲:Ljava/io/Serializable;

    .line 47
    .line 48
    check-cast p1, [L飘花落叶言楪苏兰世子哲/飘花落叶言子楪哲苏兰世;

    .line 49
    .line 50
    aput-object p2, p1, v1

    .line 51
    .line 52
    add-int/lit8 v1, v1, 0x1

    .line 53
    .line 54
    iput v1, p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏兰哲:I

    .line 55
    .line 56
    return-void
.end method

.method public 飘花落叶言子楪世苏哲兰(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪苏哲世兰:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪苏哲世兰:Ljava/lang/Object;

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪苏哲世兰:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    const-string v2, " !\"#$&\'(),/:;<=>?@[]\\^`{|}~"

    .line 26
    .line 27
    const/16 v3, 0x5b

    .line 28
    .line 29
    invoke-static {v1, v1, p1, v2, v3}, L飘花落叶言世兰哲楪苏子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(IILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    iget-object p0, p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪苏哲世兰:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p0, Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    if-eqz p2, :cond_1

    .line 44
    .line 45
    invoke-static {v1, v1, p2, v2, v3}, L飘花落叶言世兰哲楪苏子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(IILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    goto :goto_0

    .line 50
    :cond_1
    const/4 p1, 0x0

    .line 51
    :goto_0
    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public 飘花落叶言子楪苏世哲兰(L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰苏世;Ljava/lang/String;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget-object v3, v0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪苏世兰哲:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    sget-object v4, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:[B

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    const/4 v5, 0x0

    .line 21
    invoke-static {v5, v4, v2}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰(IILjava/lang/String;)I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    invoke-static {v4, v6, v2}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世兰哲(IILjava/lang/String;)I

    .line 30
    .line 31
    .line 32
    move-result v6

    .line 33
    sub-int v7, v6, v4

    .line 34
    .line 35
    const/16 v8, 0x30

    .line 36
    .line 37
    const/16 v9, 0x5b

    .line 38
    .line 39
    const/16 v10, 0x3a

    .line 40
    .line 41
    const/4 v11, -0x1

    .line 42
    const/4 v12, 0x2

    .line 43
    if-ge v7, v12, :cond_1

    .line 44
    .line 45
    :cond_0
    :goto_0
    move v7, v11

    .line 46
    goto :goto_3

    .line 47
    :cond_1
    invoke-virtual {v2, v4}, Ljava/lang/String;->charAt(I)C

    .line 48
    .line 49
    .line 50
    move-result v7

    .line 51
    const/16 v13, 0x61

    .line 52
    .line 53
    invoke-static {v7, v13}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰(II)I

    .line 54
    .line 55
    .line 56
    move-result v14

    .line 57
    const/16 v15, 0x41

    .line 58
    .line 59
    if-ltz v14, :cond_2

    .line 60
    .line 61
    const/16 v14, 0x7a

    .line 62
    .line 63
    invoke-static {v7, v14}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰(II)I

    .line 64
    .line 65
    .line 66
    move-result v14

    .line 67
    if-lez v14, :cond_3

    .line 68
    .line 69
    :cond_2
    invoke-static {v7, v15}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰(II)I

    .line 70
    .line 71
    .line 72
    move-result v14

    .line 73
    if-ltz v14, :cond_0

    .line 74
    .line 75
    const/16 v14, 0x5a

    .line 76
    .line 77
    invoke-static {v7, v14}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰(II)I

    .line 78
    .line 79
    .line 80
    move-result v7

    .line 81
    if-lez v7, :cond_3

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_3
    add-int/lit8 v7, v4, 0x1

    .line 85
    .line 86
    :goto_1
    if-ge v7, v6, :cond_0

    .line 87
    .line 88
    invoke-virtual {v2, v7}, Ljava/lang/String;->charAt(I)C

    .line 89
    .line 90
    .line 91
    move-result v14

    .line 92
    if-gt v13, v14, :cond_4

    .line 93
    .line 94
    const/16 v13, 0x7b

    .line 95
    .line 96
    if-ge v14, v13, :cond_4

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_4
    if-gt v15, v14, :cond_5

    .line 100
    .line 101
    if-ge v14, v9, :cond_5

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_5
    if-gt v8, v14, :cond_6

    .line 105
    .line 106
    if-ge v14, v10, :cond_6

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_6
    const/16 v13, 0x2b

    .line 110
    .line 111
    if-eq v14, v13, :cond_8

    .line 112
    .line 113
    const/16 v13, 0x2d

    .line 114
    .line 115
    if-eq v14, v13, :cond_8

    .line 116
    .line 117
    const/16 v13, 0x2e

    .line 118
    .line 119
    if-ne v14, v13, :cond_7

    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_7
    if-ne v14, v10, :cond_0

    .line 123
    .line 124
    goto :goto_3

    .line 125
    :cond_8
    :goto_2
    add-int/lit8 v7, v7, 0x1

    .line 126
    .line 127
    const/16 v13, 0x61

    .line 128
    .line 129
    goto :goto_1

    .line 130
    :goto_3
    const-string v13, "http"

    .line 131
    .line 132
    const-string v14, "https"

    .line 133
    .line 134
    const/4 v15, 0x1

    .line 135
    if-eq v7, v11, :cond_b

    .line 136
    .line 137
    const-string v8, "https:"

    .line 138
    .line 139
    invoke-static {v2, v4, v8, v15}, Lkotlin/text/飘花落叶言子楪兰苏哲世;->飘花落叶言子苏楪世兰哲(Ljava/lang/String;ILjava/lang/String;Z)Z

    .line 140
    .line 141
    .line 142
    move-result v8

    .line 143
    if-eqz v8, :cond_9

    .line 144
    .line 145
    iput-object v14, v0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 146
    .line 147
    add-int/lit8 v4, v4, 0x6

    .line 148
    .line 149
    goto :goto_4

    .line 150
    :cond_9
    const-string v8, "http:"

    .line 151
    .line 152
    invoke-static {v2, v4, v8, v15}, Lkotlin/text/飘花落叶言子楪兰苏哲世;->飘花落叶言子苏楪世兰哲(Ljava/lang/String;ILjava/lang/String;Z)Z

    .line 153
    .line 154
    .line 155
    move-result v8

    .line 156
    if-eqz v8, :cond_a

    .line 157
    .line 158
    iput-object v13, v0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 159
    .line 160
    add-int/lit8 v4, v4, 0x5

    .line 161
    .line 162
    goto :goto_4

    .line 163
    :cond_a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 164
    .line 165
    invoke-virtual {v2, v5, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    new-instance v2, Ljava/lang/StringBuilder;

    .line 170
    .line 171
    const-string v3, "Expected URL scheme \'http\' or \'https\' but was \'"

    .line 172
    .line 173
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    const/16 v1, 0x27

    .line 180
    .line 181
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    throw v0

    .line 192
    :cond_b
    if-eqz v1, :cond_30

    .line 193
    .line 194
    iget-object v7, v1, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 195
    .line 196
    iput-object v7, v0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 197
    .line 198
    :goto_4
    move v7, v4

    .line 199
    move v8, v5

    .line 200
    move/from16 v16, v15

    .line 201
    .line 202
    :goto_5
    const/16 v15, 0x5c

    .line 203
    .line 204
    const/16 v9, 0x2f

    .line 205
    .line 206
    if-ge v7, v6, :cond_d

    .line 207
    .line 208
    invoke-virtual {v2, v7}, Ljava/lang/String;->charAt(I)C

    .line 209
    .line 210
    .line 211
    move-result v10

    .line 212
    if-eq v10, v9, :cond_c

    .line 213
    .line 214
    if-eq v10, v15, :cond_c

    .line 215
    .line 216
    goto :goto_6

    .line 217
    :cond_c
    add-int/lit8 v8, v8, 0x1

    .line 218
    .line 219
    add-int/lit8 v7, v7, 0x1

    .line 220
    .line 221
    const/16 v9, 0x5b

    .line 222
    .line 223
    const/16 v10, 0x3a

    .line 224
    .line 225
    goto :goto_5

    .line 226
    :cond_d
    :goto_6
    const-string v10, " \"\'<>#"

    .line 227
    .line 228
    const-string v7, ""

    .line 229
    .line 230
    const/16 v15, 0x23

    .line 231
    .line 232
    if-ge v8, v12, :cond_11

    .line 233
    .line 234
    if-eqz v1, :cond_11

    .line 235
    .line 236
    iget-object v12, v1, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 237
    .line 238
    iget-object v9, v0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 239
    .line 240
    check-cast v9, Ljava/lang/String;

    .line 241
    .line 242
    invoke-static {v12, v9}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    move-result v9

    .line 246
    if-nez v9, :cond_e

    .line 247
    .line 248
    goto :goto_8

    .line 249
    :cond_e
    invoke-virtual {v1}, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰苏哲()Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v8

    .line 253
    iput-object v8, v0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲兰苏:Ljava/io/Serializable;

    .line 254
    .line 255
    invoke-virtual {v1}, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰()Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v8

    .line 259
    iput-object v8, v0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世兰苏哲:Ljava/io/Serializable;

    .line 260
    .line 261
    iget-object v8, v1, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲兰苏:Ljava/lang/String;

    .line 262
    .line 263
    iput-object v8, v0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 264
    .line 265
    iget v8, v1, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰苏哲:I

    .line 266
    .line 267
    iput v8, v0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏兰哲:I

    .line 268
    .line 269
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v1}, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰()Ljava/util/ArrayList;

    .line 273
    .line 274
    .line 275
    move-result-object v8

    .line 276
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 277
    .line 278
    .line 279
    if-eq v4, v6, :cond_f

    .line 280
    .line 281
    invoke-virtual {v2, v4}, Ljava/lang/String;->charAt(I)C

    .line 282
    .line 283
    .line 284
    move-result v8

    .line 285
    if-ne v8, v15, :cond_21

    .line 286
    .line 287
    :cond_f
    invoke-virtual {v1}, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲兰苏()Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v1

    .line 291
    if-eqz v1, :cond_10

    .line 292
    .line 293
    const/16 v8, 0x53

    .line 294
    .line 295
    invoke-static {v5, v5, v1, v10, v8}, L飘花落叶言世兰哲楪苏子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(IILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v1

    .line 299
    invoke-static {v1}, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 300
    .line 301
    .line 302
    move-result-object v1

    .line 303
    goto :goto_7

    .line 304
    :cond_10
    const/4 v1, 0x0

    .line 305
    :goto_7
    iput-object v1, v0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪苏哲世兰:Ljava/lang/Object;

    .line 306
    .line 307
    goto/16 :goto_12

    .line 308
    .line 309
    :cond_11
    :goto_8
    add-int/2addr v4, v8

    .line 310
    move v1, v5

    .line 311
    move v8, v1

    .line 312
    :goto_9
    const-string v9, "@/\\?#"

    .line 313
    .line 314
    invoke-static {v4, v6, v2, v9}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(IILjava/lang/String;Ljava/lang/String;)I

    .line 315
    .line 316
    .line 317
    move-result v9

    .line 318
    if-eq v9, v6, :cond_12

    .line 319
    .line 320
    invoke-virtual {v2, v9}, Ljava/lang/String;->charAt(I)C

    .line 321
    .line 322
    .line 323
    move-result v12

    .line 324
    goto :goto_a

    .line 325
    :cond_12
    move v12, v11

    .line 326
    :goto_a
    if-eq v12, v11, :cond_17

    .line 327
    .line 328
    if-eq v12, v15, :cond_17

    .line 329
    .line 330
    const/16 v5, 0x2f

    .line 331
    .line 332
    if-eq v12, v5, :cond_17

    .line 333
    .line 334
    const/16 v5, 0x5c

    .line 335
    .line 336
    if-eq v12, v5, :cond_17

    .line 337
    .line 338
    const/16 v5, 0x3f

    .line 339
    .line 340
    if-eq v12, v5, :cond_17

    .line 341
    .line 342
    const/16 v5, 0x40

    .line 343
    .line 344
    if-eq v12, v5, :cond_13

    .line 345
    .line 346
    const/4 v5, 0x0

    .line 347
    goto :goto_9

    .line 348
    :cond_13
    const-string v5, " \"\':;<=>@[]^`{}|/\\?#"

    .line 349
    .line 350
    const-string v12, "%40"

    .line 351
    .line 352
    if-nez v1, :cond_16

    .line 353
    .line 354
    const/16 v15, 0x3a

    .line 355
    .line 356
    invoke-static {v2, v15, v4, v9}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;CII)I

    .line 357
    .line 358
    .line 359
    move-result v11

    .line 360
    const/16 v15, 0x70

    .line 361
    .line 362
    invoke-static {v4, v11, v2, v5, v15}, L飘花落叶言世兰哲楪苏子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(IILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object v4

    .line 366
    if-eqz v8, :cond_14

    .line 367
    .line 368
    new-instance v8, Ljava/lang/StringBuilder;

    .line 369
    .line 370
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 371
    .line 372
    .line 373
    iget-object v15, v0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲兰苏:Ljava/io/Serializable;

    .line 374
    .line 375
    check-cast v15, Ljava/lang/String;

    .line 376
    .line 377
    invoke-virtual {v8, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 378
    .line 379
    .line 380
    invoke-virtual {v8, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 381
    .line 382
    .line 383
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 384
    .line 385
    .line 386
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object v4

    .line 390
    :cond_14
    iput-object v4, v0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲兰苏:Ljava/io/Serializable;

    .line 391
    .line 392
    if-eq v11, v9, :cond_15

    .line 393
    .line 394
    add-int/lit8 v11, v11, 0x1

    .line 395
    .line 396
    const/16 v15, 0x70

    .line 397
    .line 398
    invoke-static {v11, v9, v2, v5, v15}, L飘花落叶言世兰哲楪苏子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(IILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 399
    .line 400
    .line 401
    move-result-object v1

    .line 402
    iput-object v1, v0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世兰苏哲:Ljava/io/Serializable;

    .line 403
    .line 404
    move/from16 v1, v16

    .line 405
    .line 406
    goto :goto_b

    .line 407
    :cond_15
    const/16 v15, 0x70

    .line 408
    .line 409
    :goto_b
    move/from16 v8, v16

    .line 410
    .line 411
    goto :goto_c

    .line 412
    :cond_16
    const/16 v15, 0x70

    .line 413
    .line 414
    new-instance v11, Ljava/lang/StringBuilder;

    .line 415
    .line 416
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 417
    .line 418
    .line 419
    iget-object v15, v0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世兰苏哲:Ljava/io/Serializable;

    .line 420
    .line 421
    check-cast v15, Ljava/lang/String;

    .line 422
    .line 423
    invoke-virtual {v11, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 424
    .line 425
    .line 426
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 427
    .line 428
    .line 429
    const/16 v15, 0x70

    .line 430
    .line 431
    invoke-static {v4, v9, v2, v5, v15}, L飘花落叶言世兰哲楪苏子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(IILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 432
    .line 433
    .line 434
    move-result-object v4

    .line 435
    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 436
    .line 437
    .line 438
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 439
    .line 440
    .line 441
    move-result-object v4

    .line 442
    iput-object v4, v0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世兰苏哲:Ljava/io/Serializable;

    .line 443
    .line 444
    :goto_c
    add-int/lit8 v4, v9, 0x1

    .line 445
    .line 446
    const/4 v5, 0x0

    .line 447
    const/4 v11, -0x1

    .line 448
    const/16 v15, 0x23

    .line 449
    .line 450
    goto/16 :goto_9

    .line 451
    .line 452
    :cond_17
    move v1, v4

    .line 453
    :goto_d
    if-ge v1, v9, :cond_1a

    .line 454
    .line 455
    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    .line 456
    .line 457
    .line 458
    move-result v5

    .line 459
    const/16 v15, 0x3a

    .line 460
    .line 461
    if-eq v5, v15, :cond_1b

    .line 462
    .line 463
    const/16 v8, 0x5b

    .line 464
    .line 465
    if-eq v5, v8, :cond_18

    .line 466
    .line 467
    goto :goto_e

    .line 468
    :cond_18
    add-int/lit8 v1, v1, 0x1

    .line 469
    .line 470
    if-ge v1, v9, :cond_19

    .line 471
    .line 472
    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    .line 473
    .line 474
    .line 475
    move-result v5

    .line 476
    const/16 v11, 0x5d

    .line 477
    .line 478
    if-ne v5, v11, :cond_18

    .line 479
    .line 480
    :cond_19
    :goto_e
    add-int/lit8 v1, v1, 0x1

    .line 481
    .line 482
    goto :goto_d

    .line 483
    :cond_1a
    move v1, v9

    .line 484
    :cond_1b
    add-int/lit8 v5, v1, 0x1

    .line 485
    .line 486
    const/4 v8, 0x4

    .line 487
    const/16 v11, 0x22

    .line 488
    .line 489
    if-ge v5, v9, :cond_1e

    .line 490
    .line 491
    invoke-static {v4, v1, v2, v8}, L飘花落叶言世兰哲楪苏子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏(IILjava/lang/String;I)Ljava/lang/String;

    .line 492
    .line 493
    .line 494
    move-result-object v8

    .line 495
    invoke-static {v8}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 496
    .line 497
    .line 498
    move-result-object v8

    .line 499
    iput-object v8, v0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 500
    .line 501
    const/16 v8, 0x78

    .line 502
    .line 503
    :try_start_0
    invoke-static {v5, v9, v2, v7, v8}, L飘花落叶言世兰哲楪苏子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(IILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 504
    .line 505
    .line 506
    move-result-object v8

    .line 507
    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 508
    .line 509
    .line 510
    move-result v8
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 511
    move/from16 v12, v16

    .line 512
    .line 513
    if-gt v12, v8, :cond_1c

    .line 514
    .line 515
    const/high16 v12, 0x10000

    .line 516
    .line 517
    if-ge v8, v12, :cond_1c

    .line 518
    .line 519
    goto :goto_f

    .line 520
    :catch_0
    :cond_1c
    const/4 v8, -0x1

    .line 521
    :goto_f
    iput v8, v0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏兰哲:I

    .line 522
    .line 523
    const/4 v12, -0x1

    .line 524
    if-eq v8, v12, :cond_1d

    .line 525
    .line 526
    goto :goto_11

    .line 527
    :cond_1d
    invoke-virtual {v2, v5, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 528
    .line 529
    .line 530
    move-result-object v0

    .line 531
    new-instance v1, Ljava/lang/StringBuilder;

    .line 532
    .line 533
    const-string v2, "Invalid URL port: \""

    .line 534
    .line 535
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 536
    .line 537
    .line 538
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 539
    .line 540
    .line 541
    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 542
    .line 543
    .line 544
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 545
    .line 546
    .line 547
    move-result-object v0

    .line 548
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 549
    .line 550
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 551
    .line 552
    .line 553
    move-result-object v0

    .line 554
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 555
    .line 556
    .line 557
    throw v1

    .line 558
    :cond_1e
    const/4 v12, -0x1

    .line 559
    invoke-static {v4, v1, v2, v8}, L飘花落叶言世兰哲楪苏子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏(IILjava/lang/String;I)Ljava/lang/String;

    .line 560
    .line 561
    .line 562
    move-result-object v5

    .line 563
    invoke-static {v5}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 564
    .line 565
    .line 566
    move-result-object v5

    .line 567
    iput-object v5, v0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 568
    .line 569
    iget-object v5, v0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 570
    .line 571
    check-cast v5, Ljava/lang/String;

    .line 572
    .line 573
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 574
    .line 575
    .line 576
    invoke-virtual {v5, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 577
    .line 578
    .line 579
    move-result v8

    .line 580
    if-eqz v8, :cond_1f

    .line 581
    .line 582
    const/16 v5, 0x50

    .line 583
    .line 584
    goto :goto_10

    .line 585
    :cond_1f
    invoke-virtual {v5, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 586
    .line 587
    .line 588
    move-result v5

    .line 589
    if-eqz v5, :cond_20

    .line 590
    .line 591
    const/16 v5, 0x1bb

    .line 592
    .line 593
    goto :goto_10

    .line 594
    :cond_20
    move v5, v12

    .line 595
    :goto_10
    iput v5, v0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏兰哲:I

    .line 596
    .line 597
    :goto_11
    iget-object v5, v0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 598
    .line 599
    check-cast v5, Ljava/lang/String;

    .line 600
    .line 601
    if-eqz v5, :cond_2f

    .line 602
    .line 603
    move v4, v9

    .line 604
    :cond_21
    :goto_12
    const-string v1, "?#"

    .line 605
    .line 606
    invoke-static {v4, v6, v2, v1}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(IILjava/lang/String;Ljava/lang/String;)I

    .line 607
    .line 608
    .line 609
    move-result v1

    .line 610
    if-ne v4, v1, :cond_22

    .line 611
    .line 612
    goto/16 :goto_18

    .line 613
    .line 614
    :cond_22
    invoke-virtual {v2, v4}, Ljava/lang/String;->charAt(I)C

    .line 615
    .line 616
    .line 617
    move-result v5

    .line 618
    const/16 v8, 0x2f

    .line 619
    .line 620
    if-eq v5, v8, :cond_23

    .line 621
    .line 622
    const/16 v8, 0x5c

    .line 623
    .line 624
    if-eq v5, v8, :cond_23

    .line 625
    .line 626
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 627
    .line 628
    .line 629
    move-result v5

    .line 630
    const/16 v16, 0x1

    .line 631
    .line 632
    add-int/lit8 v5, v5, -0x1

    .line 633
    .line 634
    invoke-virtual {v3, v5, v7}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 635
    .line 636
    .line 637
    goto :goto_13

    .line 638
    :cond_23
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 639
    .line 640
    .line 641
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 642
    .line 643
    .line 644
    add-int/lit8 v4, v4, 0x1

    .line 645
    .line 646
    :goto_13
    if-ge v4, v1, :cond_2c

    .line 647
    .line 648
    const-string v5, "/\\"

    .line 649
    .line 650
    invoke-static {v4, v1, v2, v5}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(IILjava/lang/String;Ljava/lang/String;)I

    .line 651
    .line 652
    .line 653
    move-result v5

    .line 654
    if-ge v5, v1, :cond_24

    .line 655
    .line 656
    const/4 v12, 0x1

    .line 657
    goto :goto_14

    .line 658
    :cond_24
    const/4 v12, 0x0

    .line 659
    :goto_14
    const-string v8, " \"<>^`{}|/\\?#"

    .line 660
    .line 661
    const/16 v15, 0x70

    .line 662
    .line 663
    invoke-static {v4, v5, v2, v8, v15}, L飘花落叶言世兰哲楪苏子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(IILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 664
    .line 665
    .line 666
    move-result-object v4

    .line 667
    const-string v8, "."

    .line 668
    .line 669
    invoke-virtual {v4, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 670
    .line 671
    .line 672
    move-result v8

    .line 673
    if-nez v8, :cond_2a

    .line 674
    .line 675
    const-string v8, "%2e"

    .line 676
    .line 677
    invoke-virtual {v4, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 678
    .line 679
    .line 680
    move-result v8

    .line 681
    if-eqz v8, :cond_25

    .line 682
    .line 683
    goto :goto_17

    .line 684
    :cond_25
    const-string v8, ".."

    .line 685
    .line 686
    invoke-virtual {v4, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 687
    .line 688
    .line 689
    move-result v8

    .line 690
    if-nez v8, :cond_28

    .line 691
    .line 692
    const-string v8, "%2e."

    .line 693
    .line 694
    invoke-virtual {v4, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 695
    .line 696
    .line 697
    move-result v8

    .line 698
    if-nez v8, :cond_28

    .line 699
    .line 700
    const-string v8, ".%2e"

    .line 701
    .line 702
    invoke-virtual {v4, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 703
    .line 704
    .line 705
    move-result v8

    .line 706
    if-nez v8, :cond_28

    .line 707
    .line 708
    const-string v8, "%2e%2e"

    .line 709
    .line 710
    invoke-virtual {v4, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 711
    .line 712
    .line 713
    move-result v8

    .line 714
    if-eqz v8, :cond_26

    .line 715
    .line 716
    goto :goto_16

    .line 717
    :cond_26
    const/4 v8, 0x1

    .line 718
    invoke-static {v8, v3}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏世兰哲(ILjava/util/ArrayList;)Ljava/lang/Object;

    .line 719
    .line 720
    .line 721
    move-result-object v9

    .line 722
    check-cast v9, Ljava/lang/CharSequence;

    .line 723
    .line 724
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    .line 725
    .line 726
    .line 727
    move-result v9

    .line 728
    if-nez v9, :cond_27

    .line 729
    .line 730
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 731
    .line 732
    .line 733
    move-result v9

    .line 734
    sub-int/2addr v9, v8

    .line 735
    invoke-virtual {v3, v9, v4}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 736
    .line 737
    .line 738
    goto :goto_15

    .line 739
    :cond_27
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 740
    .line 741
    .line 742
    :goto_15
    if-eqz v12, :cond_2a

    .line 743
    .line 744
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 745
    .line 746
    .line 747
    goto :goto_17

    .line 748
    :cond_28
    :goto_16
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 749
    .line 750
    .line 751
    move-result v4

    .line 752
    const/16 v16, 0x1

    .line 753
    .line 754
    add-int/lit8 v4, v4, -0x1

    .line 755
    .line 756
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 757
    .line 758
    .line 759
    move-result-object v4

    .line 760
    check-cast v4, Ljava/lang/String;

    .line 761
    .line 762
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 763
    .line 764
    .line 765
    move-result v4

    .line 766
    if-nez v4, :cond_29

    .line 767
    .line 768
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 769
    .line 770
    .line 771
    move-result v4

    .line 772
    if-nez v4, :cond_29

    .line 773
    .line 774
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 775
    .line 776
    .line 777
    move-result v4

    .line 778
    add-int/lit8 v4, v4, -0x1

    .line 779
    .line 780
    invoke-virtual {v3, v4, v7}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 781
    .line 782
    .line 783
    goto :goto_17

    .line 784
    :cond_29
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 785
    .line 786
    .line 787
    :cond_2a
    :goto_17
    if-eqz v12, :cond_2b

    .line 788
    .line 789
    add-int/lit8 v4, v5, 0x1

    .line 790
    .line 791
    goto/16 :goto_13

    .line 792
    .line 793
    :cond_2b
    move v4, v5

    .line 794
    goto/16 :goto_13

    .line 795
    .line 796
    :cond_2c
    :goto_18
    if-ge v1, v6, :cond_2d

    .line 797
    .line 798
    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    .line 799
    .line 800
    .line 801
    move-result v3

    .line 802
    const/16 v5, 0x3f

    .line 803
    .line 804
    if-ne v3, v5, :cond_2d

    .line 805
    .line 806
    const/16 v3, 0x23

    .line 807
    .line 808
    invoke-static {v2, v3, v1, v6}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;CII)I

    .line 809
    .line 810
    .line 811
    move-result v4

    .line 812
    add-int/lit8 v1, v1, 0x1

    .line 813
    .line 814
    const/16 v3, 0x50

    .line 815
    .line 816
    invoke-static {v1, v4, v2, v10, v3}, L飘花落叶言世兰哲楪苏子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(IILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 817
    .line 818
    .line 819
    move-result-object v1

    .line 820
    invoke-static {v1}, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 821
    .line 822
    .line 823
    move-result-object v1

    .line 824
    iput-object v1, v0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪苏哲世兰:Ljava/lang/Object;

    .line 825
    .line 826
    move v1, v4

    .line 827
    :cond_2d
    if-ge v1, v6, :cond_2e

    .line 828
    .line 829
    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    .line 830
    .line 831
    .line 832
    move-result v3

    .line 833
    const/16 v4, 0x23

    .line 834
    .line 835
    if-ne v3, v4, :cond_2e

    .line 836
    .line 837
    const/16 v16, 0x1

    .line 838
    .line 839
    add-int/lit8 v1, v1, 0x1

    .line 840
    .line 841
    const/16 v3, 0x30

    .line 842
    .line 843
    invoke-static {v1, v6, v2, v7, v3}, L飘花落叶言世兰哲楪苏子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(IILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 844
    .line 845
    .line 846
    move-result-object v1

    .line 847
    iput-object v1, v0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪苏世哲兰:Ljava/lang/Object;

    .line 848
    .line 849
    :cond_2e
    return-void

    .line 850
    :cond_2f
    invoke-virtual {v2, v4, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 851
    .line 852
    .line 853
    move-result-object v0

    .line 854
    new-instance v1, Ljava/lang/StringBuilder;

    .line 855
    .line 856
    const-string v2, "Invalid URL host: \""

    .line 857
    .line 858
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 859
    .line 860
    .line 861
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 862
    .line 863
    .line 864
    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 865
    .line 866
    .line 867
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 868
    .line 869
    .line 870
    move-result-object v0

    .line 871
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 872
    .line 873
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 874
    .line 875
    .line 876
    move-result-object v0

    .line 877
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 878
    .line 879
    .line 880
    throw v1

    .line 881
    :cond_30
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 882
    .line 883
    .line 884
    move-result v0

    .line 885
    const/4 v1, 0x6

    .line 886
    if-le v0, v1, :cond_31

    .line 887
    .line 888
    invoke-static {v1, v2}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子哲苏世兰楪(ILjava/lang/String;)Ljava/lang/String;

    .line 889
    .line 890
    .line 891
    move-result-object v0

    .line 892
    const-string v1, "..."

    .line 893
    .line 894
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 895
    .line 896
    .line 897
    move-result-object v0

    .line 898
    goto :goto_19

    .line 899
    :cond_31
    move-object v0, v2

    .line 900
    :goto_19
    const-string v1, "Expected URL scheme \'http\' or \'https\' but no scheme was found for "

    .line 901
    .line 902
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 903
    .line 904
    .line 905
    move-result-object v0

    .line 906
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 907
    .line 908
    .line 909
    return-void
.end method
