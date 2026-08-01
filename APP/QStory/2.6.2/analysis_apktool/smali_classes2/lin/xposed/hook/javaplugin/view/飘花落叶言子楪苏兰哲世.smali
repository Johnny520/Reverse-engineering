.class public final synthetic Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏兰哲世;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰哲世;


# instance fields
.field public final synthetic 飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪世苏哲兰:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    iput-object p1, p0, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onClick(Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;Landroid/view/View;)Z
    .locals 9

    .line 1
    iget v0, p0, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    const/16 v1, 0xe

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-wide v3, -0x36a432ea051405a7L    # -2.4799424737532375E45

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    iget-object v6, p0, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 13
    .line 14
    iget-object p0, p0, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 15
    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    check-cast p0, L飘花落叶言子苏世兰楪哲/飘花落叶言子楪苏兰哲世;

    .line 20
    .line 21
    check-cast v6, Ljava/util/List;

    .line 22
    .line 23
    check-cast p1, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;

    .line 24
    .line 25
    invoke-virtual {p1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世哲苏楪兰()V

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, L飘花落叶言子苏世兰楪哲/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p1, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;

    .line 31
    .line 32
    if-eqz p1, :cond_0

    .line 33
    .line 34
    invoke-virtual {p1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世哲苏楪兰()V

    .line 35
    .line 36
    .line 37
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 40
    .line 41
    .line 42
    const-wide v7, -0x36a43251051405a7L    # -2.480150726561793E45

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    invoke-static {v7, v8}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 55
    .line 56
    .line 57
    move-result p2

    .line 58
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-static {p1, v2}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;->飘花落叶言子世兰苏楪哲(Ljava/lang/String;F)L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    new-instance p2, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;

    .line 77
    .line 78
    invoke-direct {p2, v1}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;-><init>(I)V

    .line 79
    .line 80
    .line 81
    iput-object p2, p1, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;->飘花落叶言子世兰苏楪哲:L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;

    .line 82
    .line 83
    invoke-virtual {p1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;->飘花落叶言子世兰楪苏哲()V

    .line 84
    .line 85
    .line 86
    new-instance p1, Ljava/lang/Thread;

    .line 87
    .line 88
    new-instance p2, L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世哲苏兰;

    .line 89
    .line 90
    const/4 v0, 0x6

    .line 91
    invoke-direct {p2, v6, v0, p0}, L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世哲苏兰;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    invoke-direct {p1, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    .line 98
    .line 99
    .line 100
    return v5

    .line 101
    :pswitch_0
    check-cast p0, L飘花落叶言苏哲楪世子兰/飘花落叶言子楪世兰苏哲;

    .line 102
    .line 103
    check-cast v6, Ljava/util/List;

    .line 104
    .line 105
    check-cast p1, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;

    .line 106
    .line 107
    invoke-virtual {p1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世哲苏楪兰()V

    .line 108
    .line 109
    .line 110
    iget-object p1, p0, L飘花落叶言苏哲楪世子兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;

    .line 111
    .line 112
    if-eqz p1, :cond_1

    .line 113
    .line 114
    invoke-virtual {p1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世哲苏楪兰()V

    .line 115
    .line 116
    .line 117
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 118
    .line 119
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 120
    .line 121
    .line 122
    const-wide v7, -0x36a432e7051405a7L    # -2.4799465571416406E45

    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    invoke-static {v7, v8}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p2

    .line 131
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 135
    .line 136
    .line 137
    move-result p2

    .line 138
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p2

    .line 145
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    invoke-static {p1, v2}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;->飘花落叶言子世兰苏楪哲(Ljava/lang/String;F)L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    new-instance p2, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;

    .line 157
    .line 158
    invoke-direct {p2, v1}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;-><init>(I)V

    .line 159
    .line 160
    .line 161
    iput-object p2, p1, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;->飘花落叶言子世兰苏楪哲:L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;

    .line 162
    .line 163
    invoke-virtual {p1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;->飘花落叶言子世兰楪苏哲()V

    .line 164
    .line 165
    .line 166
    new-instance p1, Ljava/lang/Thread;

    .line 167
    .line 168
    new-instance p2, L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世哲苏兰;

    .line 169
    .line 170
    const/4 v0, 0x4

    .line 171
    invoke-direct {p2, v6, v0, p0}, L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世哲苏兰;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    invoke-direct {p1, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    .line 178
    .line 179
    .line 180
    return v5

    .line 181
    :pswitch_1
    check-cast p0, L飘花落叶言苏世兰楪子哲/飘花落叶言子楪苏世哲兰;

    .line 182
    .line 183
    check-cast v6, Landroidx/compose/foundation/text/selection/飘花落叶言子楪兰苏哲世;

    .line 184
    .line 185
    check-cast p1, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;

    .line 186
    .line 187
    new-instance p1, Ljava/io/File;

    .line 188
    .line 189
    iget-object p0, p0, L飘花落叶言苏世兰楪子哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 190
    .line 191
    invoke-direct {p1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 195
    .line 196
    .line 197
    move-result p0

    .line 198
    if-eqz p0, :cond_2

    .line 199
    .line 200
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 201
    .line 202
    .line 203
    move-result p0

    .line 204
    if-eqz p0, :cond_2

    .line 205
    .line 206
    const-wide p0, -0x36a5fc08051405a7L    # -2.3206603811859493E45

    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    invoke-static {p0, p1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    invoke-static {p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v6}, Landroidx/compose/foundation/text/selection/飘花落叶言子楪兰苏哲世;->invoke()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    :cond_2
    return v5

    .line 222
    :pswitch_2
    check-cast p0, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏哲兰;

    .line 223
    .line 224
    check-cast v6, Ltop/suzhelan/qstory/entity/Notice;

    .line 225
    .line 226
    check-cast p1, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;

    .line 227
    .line 228
    iget-object p0, p0, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世哲苏兰;

    .line 229
    .line 230
    const-wide p1, -0x36a57017051405a7L    # -2.3694228443657197E45

    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    invoke-static {p1, p2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    invoke-virtual {v6}, Ltop/suzhelan/qstory/entity/Notice;->getVersion()I

    .line 240
    .line 241
    .line 242
    move-result p2

    .line 243
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 244
    .line 245
    .line 246
    move-result-object p2

    .line 247
    invoke-virtual {p0, p2, p1}, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    return v5

    .line 251
    :pswitch_3
    check-cast p0, Llin/xposed/hook/javaplugin/view/PluginItemView;

    .line 252
    .line 253
    check-cast v6, Ljava/lang/String;

    .line 254
    .line 255
    check-cast p1, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;

    .line 256
    .line 257
    invoke-static {p0, v6, p1, p2}, Llin/xposed/hook/javaplugin/view/PluginItemView;->飘花落叶言子楪哲苏兰世(Llin/xposed/hook/javaplugin/view/PluginItemView;Ljava/lang/String;L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;Landroid/view/View;)Z

    .line 258
    .line 259
    .line 260
    move-result p0

    .line 261
    return p0

    .line 262
    nop

    .line 263
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
