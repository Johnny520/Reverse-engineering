.class public final synthetic L飘花落叶言苏世兰楪哲子/飘花落叶言子楪世苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:L飘花落叶言苏世兰楪哲子/飘花落叶言子楪苏世哲兰;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(L飘花落叶言苏世兰楪哲子/飘花落叶言子楪苏世哲兰;I)V
    .locals 0

    .line 1
    iput p2, p0, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言苏世兰楪哲子/飘花落叶言子楪苏世哲兰;

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
    .locals 6

    .line 1
    iget v0, p0, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    const-string v1, "\u55b5\u545c\u55b5\u55b5\u55b5\u55b5\u545c\u545c"

    .line 4
    .line 5
    const-string v2, "\u55b5\u545c\u55b5\u545c\u545c\u545c\u545c\u55b5~\u55b5\u545c\u55b5\u55b5\u55b5\u545c\u55b5\u55b5"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x0

    .line 9
    iget-object p0, p0, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言苏世兰楪哲子/飘花落叶言子楪苏世哲兰;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言苏世兰楪子哲/飘花落叶言子楪苏世兰哲;

    .line 15
    .line 16
    iget-object v0, v0, L飘花落叶言楪世兰子哲苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏:Ljava/util/List;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    if-eqz v5, :cond_0

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    if-eqz v5, :cond_3

    .line 36
    .line 37
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    check-cast v5, L飘花落叶言苏世兰楪子哲/飘花落叶言子楪世兰哲苏;

    .line 42
    .line 43
    instance-of v5, v5, L飘花落叶言苏世兰楪子哲/飘花落叶言子楪世兰苏哲;

    .line 44
    .line 45
    if-eqz v5, :cond_1

    .line 46
    .line 47
    add-int/lit8 v3, v3, 0x1

    .line 48
    .line 49
    if-ltz v3, :cond_2

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    invoke-static {}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏世兰哲;->飘花落叶言子苏兰哲楪世()V

    .line 53
    .line 54
    .line 55
    throw v4

    .line 56
    :cond_3
    :goto_1
    sget-object v0, L飘花落叶言苏世兰子哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏世兰子哲楪/飘花落叶言子楪世兰苏哲;

    .line 57
    .line 58
    const/16 v5, 0xaa4

    .line 59
    .line 60
    invoke-static {v5}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    invoke-static {v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    invoke-static {v5, v2}, L飘花落叶言苏世兰子哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    const/4 v2, 0x4

    .line 80
    if-le v3, v2, :cond_6

    .line 81
    .line 82
    if-ltz v0, :cond_6

    .line 83
    .line 84
    iget-object v2, p0, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言苏世兰楪子哲/飘花落叶言子楪苏世兰哲;

    .line 85
    .line 86
    iget-object v2, v2, L飘花落叶言楪世兰子哲苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏:Ljava/util/List;

    .line 87
    .line 88
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    if-ge v0, v2, :cond_6

    .line 93
    .line 94
    const/16 v2, 0xaa5

    .line 95
    .line 96
    invoke-static {v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-static {v2, v1}, L飘花落叶言苏世兰子哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    iget-object p0, p0, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏:Ltop/suzhelan/qstory/ui/views/CustomRecycleView;

    .line 113
    .line 114
    if-eqz p0, :cond_4

    .line 115
    .line 116
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    goto :goto_2

    .line 121
    :cond_4
    move-object p0, v4

    .line 122
    :goto_2
    instance-of v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 123
    .line 124
    if-eqz v2, :cond_5

    .line 125
    .line 126
    move-object v4, p0

    .line 127
    check-cast v4, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 128
    .line 129
    :cond_5
    if-eqz v4, :cond_6

    .line 130
    .line 131
    invoke-virtual {v4, v0, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言楪子世哲苏兰(II)V

    .line 132
    .line 133
    .line 134
    :cond_6
    return-void

    .line 135
    :pswitch_0
    iget-object v0, p0, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏世兰楪子哲/飘花落叶言子楪苏哲世兰;

    .line 136
    .line 137
    iget-object v0, v0, L飘花落叶言楪世兰子哲苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏:Ljava/util/List;

    .line 138
    .line 139
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    sget-object v3, L飘花落叶言苏世兰子哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏世兰子哲楪/飘花落叶言子楪世兰苏哲;

    .line 144
    .line 145
    const/16 v5, 0xaa2

    .line 146
    .line 147
    invoke-static {v5}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v5

    .line 151
    invoke-static {v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    invoke-static {v5, v2}, L飘花落叶言苏世兰子哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 163
    .line 164
    .line 165
    move-result v2

    .line 166
    const/16 v3, 0x8

    .line 167
    .line 168
    if-le v0, v3, :cond_9

    .line 169
    .line 170
    if-ltz v2, :cond_9

    .line 171
    .line 172
    if-ge v2, v0, :cond_9

    .line 173
    .line 174
    const/16 v0, 0xaa3

    .line 175
    .line 176
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    invoke-static {v0, v1}, L飘花落叶言苏世兰子哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 189
    .line 190
    .line 191
    move-result v0

    .line 192
    iget-object p0, p0, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰:Ltop/suzhelan/qstory/ui/views/DialogXRecycleView;

    .line 193
    .line 194
    if-eqz p0, :cond_7

    .line 195
    .line 196
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    goto :goto_3

    .line 201
    :cond_7
    move-object p0, v4

    .line 202
    :goto_3
    instance-of v1, p0, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 203
    .line 204
    if-eqz v1, :cond_8

    .line 205
    .line 206
    move-object v4, p0

    .line 207
    check-cast v4, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 208
    .line 209
    :cond_8
    if-eqz v4, :cond_9

    .line 210
    .line 211
    invoke-virtual {v4, v2, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言楪子世哲苏兰(II)V

    .line 212
    .line 213
    .line 214
    :cond_9
    return-void

    .line 215
    :pswitch_1
    iget-object p0, p0, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰:Ltop/suzhelan/qstory/ui/views/DialogXRecycleView;

    .line 216
    .line 217
    if-eqz p0, :cond_a

    .line 218
    .line 219
    invoke-virtual {p0, v3}, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子苏哲世兰楪(I)V

    .line 220
    .line 221
    .line 222
    :cond_a
    return-void

    .line 223
    :pswitch_2
    iget-object p0, p0, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰:Ltop/suzhelan/qstory/ui/views/DialogXRecycleView;

    .line 224
    .line 225
    if-eqz p0, :cond_b

    .line 226
    .line 227
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;

    .line 228
    .line 229
    .line 230
    move-result-object p0

    .line 231
    goto :goto_4

    .line 232
    :cond_b
    move-object p0, v4

    .line 233
    :goto_4
    instance-of v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 234
    .line 235
    if-eqz v0, :cond_c

    .line 236
    .line 237
    move-object v4, p0

    .line 238
    check-cast v4, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 239
    .line 240
    :cond_c
    if-eqz v4, :cond_d

    .line 241
    .line 242
    invoke-virtual {v4, v3, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言楪子世哲苏兰(II)V

    .line 243
    .line 244
    .line 245
    :cond_d
    return-void

    .line 246
    nop

    .line 247
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
