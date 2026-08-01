.class public final synthetic L飘花落叶言苏世兰哲子楪/飘花落叶言子楪世苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:L飘花落叶言苏世兰哲子楪/飘花落叶言子楪苏世哲兰;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(L飘花落叶言苏世兰哲子楪/飘花落叶言子楪苏世哲兰;I)V
    .locals 0

    .line 1
    iput p2, p0, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言苏世兰哲子楪/飘花落叶言子楪苏世哲兰;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 1
    iget v0, p0, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    const-wide v1, -0x36a50776051405a7L    # -2.405880697157629E45

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    const-wide v3, -0x36a5fc97051405a7L    # -2.3204657396720705E45

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    const/4 v5, 0x0

    .line 14
    const/4 v6, 0x0

    .line 15
    iget-object p0, p0, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言苏世兰哲子楪/飘花落叶言子楪苏世哲兰;

    .line 16
    .line 17
    packed-switch v0, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言苏世兰楪哲子/飘花落叶言子楪苏世兰哲;

    .line 21
    .line 22
    iget-object v0, v0, L飘花落叶言楪世兰子哲苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏:Ljava/util/List;

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 27
    .line 28
    .line 29
    move-result v7

    .line 30
    if-eqz v7, :cond_0

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v7

    .line 41
    if-eqz v7, :cond_3

    .line 42
    .line 43
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v7

    .line 47
    check-cast v7, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪世兰哲苏;

    .line 48
    .line 49
    instance-of v7, v7, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪世兰苏哲;

    .line 50
    .line 51
    if-eqz v7, :cond_1

    .line 52
    .line 53
    add-int/lit8 v5, v5, 0x1

    .line 54
    .line 55
    if-ltz v5, :cond_2

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    invoke-static {}, L飘花落叶言楪兰苏哲世子/飘花落叶言子楪世苏哲兰;->飘花落叶言子世苏哲兰楪()V

    .line 59
    .line 60
    .line 61
    throw v6

    .line 62
    :cond_3
    :goto_1
    sget-object v0, L飘花落叶言苏世兰楪子哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏世兰楪子哲/飘花落叶言子楪世兰苏哲;

    .line 63
    .line 64
    const-wide v7, -0x36a5fcb5051405a7L    # -2.32042490578804E45

    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    invoke-static {v7, v8}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v7

    .line 73
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    invoke-static {v7, v3}, L飘花落叶言苏世兰楪子哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    const/4 v3, 0x4

    .line 89
    if-le v5, v3, :cond_6

    .line 90
    .line 91
    if-ltz v0, :cond_6

    .line 92
    .line 93
    iget-object v3, p0, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言苏世兰楪哲子/飘花落叶言子楪苏世兰哲;

    .line 94
    .line 95
    iget-object v3, v3, L飘花落叶言楪世兰子哲苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏:Ljava/util/List;

    .line 96
    .line 97
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 98
    .line 99
    .line 100
    move-result v3

    .line 101
    if-ge v0, v3, :cond_6

    .line 102
    .line 103
    const-wide v3, -0x36a5fca7051405a7L    # -2.3204439616005875E45

    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-static {v3, v1}, L飘花落叶言苏世兰楪子哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    iget-object p0, p0, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏:Ltop/suzhelan/qstory/ui/views/CustomRecycleView;

    .line 125
    .line 126
    if-eqz p0, :cond_4

    .line 127
    .line 128
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    goto :goto_2

    .line 133
    :cond_4
    move-object p0, v6

    .line 134
    :goto_2
    instance-of v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 135
    .line 136
    if-eqz v2, :cond_5

    .line 137
    .line 138
    move-object v6, p0

    .line 139
    check-cast v6, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 140
    .line 141
    :cond_5
    if-eqz v6, :cond_6

    .line 142
    .line 143
    invoke-virtual {v6, v0, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言楪子世哲苏兰(II)V

    .line 144
    .line 145
    .line 146
    :cond_6
    return-void

    .line 147
    :pswitch_0
    iget-object v0, p0, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏世兰楪哲子/飘花落叶言子楪苏哲世兰;

    .line 148
    .line 149
    iget-object v0, v0, L飘花落叶言楪世兰子哲苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏:Ljava/util/List;

    .line 150
    .line 151
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    sget-object v5, L飘花落叶言苏世兰楪子哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏世兰楪子哲/飘花落叶言子楪世兰苏哲;

    .line 156
    .line 157
    const-wide v7, -0x36a5fce3051405a7L    # -2.3203622938325265E45

    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    invoke-static {v7, v8}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v7

    .line 166
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v3

    .line 170
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    invoke-static {v7, v3}, L飘花落叶言苏世兰楪子哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v3

    .line 177
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 178
    .line 179
    .line 180
    move-result v3

    .line 181
    const/16 v4, 0x8

    .line 182
    .line 183
    if-le v0, v4, :cond_9

    .line 184
    .line 185
    if-ltz v3, :cond_9

    .line 186
    .line 187
    if-ge v3, v0, :cond_9

    .line 188
    .line 189
    const-wide v4, -0x36a5fcd9051405a7L    # -2.3203759051272034E45

    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    invoke-static {v0, v1}, L飘花落叶言苏世兰楪子哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 207
    .line 208
    .line 209
    move-result v0

    .line 210
    iget-object p0, p0, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰:Ltop/suzhelan/qstory/ui/views/DialogXRecycleView;

    .line 211
    .line 212
    if-eqz p0, :cond_7

    .line 213
    .line 214
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;

    .line 215
    .line 216
    .line 217
    move-result-object p0

    .line 218
    goto :goto_3

    .line 219
    :cond_7
    move-object p0, v6

    .line 220
    :goto_3
    instance-of v1, p0, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 221
    .line 222
    if-eqz v1, :cond_8

    .line 223
    .line 224
    move-object v6, p0

    .line 225
    check-cast v6, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 226
    .line 227
    :cond_8
    if-eqz v6, :cond_9

    .line 228
    .line 229
    invoke-virtual {v6, v3, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言楪子世哲苏兰(II)V

    .line 230
    .line 231
    .line 232
    :cond_9
    return-void

    .line 233
    :pswitch_1
    iget-object p0, p0, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰:Ltop/suzhelan/qstory/ui/views/DialogXRecycleView;

    .line 234
    .line 235
    if-eqz p0, :cond_a

    .line 236
    .line 237
    invoke-virtual {p0, v5}, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子苏哲世兰楪(I)V

    .line 238
    .line 239
    .line 240
    :cond_a
    return-void

    .line 241
    :pswitch_2
    iget-object p0, p0, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰:Ltop/suzhelan/qstory/ui/views/DialogXRecycleView;

    .line 242
    .line 243
    if-eqz p0, :cond_b

    .line 244
    .line 245
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;

    .line 246
    .line 247
    .line 248
    move-result-object p0

    .line 249
    goto :goto_4

    .line 250
    :cond_b
    move-object p0, v6

    .line 251
    :goto_4
    instance-of v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 252
    .line 253
    if-eqz v0, :cond_c

    .line 254
    .line 255
    move-object v6, p0

    .line 256
    check-cast v6, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 257
    .line 258
    :cond_c
    if-eqz v6, :cond_d

    .line 259
    .line 260
    invoke-virtual {v6, v5, v5}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言楪子世哲苏兰(II)V

    .line 261
    .line 262
    .line 263
    :cond_d
    return-void

    .line 264
    nop

    .line 265
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
