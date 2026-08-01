.class public final synthetic Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Ljava/io/File;L飘花落叶言世哲楪苏子兰/飘花落叶言子楪世苏哲兰;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    iput v0, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 12
    iput p2, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:I

    iput-object p1, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    iput-object p3, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 13

    .line 1
    iget v0, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    const/16 v1, 0x10d

    .line 4
    .line 5
    const/16 v2, 0x10b

    .line 6
    .line 7
    const-wide/32 v3, 0x36ee80

    .line 8
    .line 9
    .line 10
    const/16 v5, 0x10c

    .line 11
    .line 12
    const/4 v6, 0x2

    .line 13
    const/4 v7, -0x1

    .line 14
    const/4 v8, 0x0

    .line 15
    const/4 v9, 0x1

    .line 16
    const/4 v10, 0x0

    .line 17
    packed-switch v0, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p1, Ljava/util/List;

    .line 23
    .line 24
    iget-object p0, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p0, L飘花落叶言苏哲子兰楪世/飘花落叶言子楪哲苏兰世;

    .line 27
    .line 28
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, L飘花落叶言苏哲子兰楪世/飘花落叶言子楪哲苏兰世;

    .line 43
    .line 44
    iget-object v1, v0, L飘花落叶言苏哲子兰楪世/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲:Ltop/suzhelan/qstory/ui/views/CustomMaterialCheckBox;

    .line 45
    .line 46
    if-ne v0, p0, :cond_0

    .line 47
    .line 48
    move v0, v9

    .line 49
    goto :goto_1

    .line 50
    :cond_0
    move v0, v10

    .line 51
    :goto_1
    invoke-virtual {v1, v0}, Ltop/suzhelan/qstory/ui/views/CustomMaterialCheckBox;->setChecked(Z)V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    return-void

    .line 56
    :pswitch_0
    iget-object p1, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p1, L飘花落叶言苏哲子兰楪世/飘花落叶言子楪苏哲兰世;

    .line 59
    .line 60
    iget-object p0, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast p0, Ljava/io/File;

    .line 63
    .line 64
    iget-object p1, p1, L飘花落叶言苏哲子兰楪世/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世兰苏哲:L飘花落叶言苏哲子兰楪世/飘花落叶言子楪世兰哲苏;

    .line 65
    .line 66
    invoke-virtual {p1, p0}, L飘花落叶言苏哲子兰楪世/飘花落叶言子楪世兰哲苏;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :pswitch_1
    iget-object p1, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast p1, Ltop/suzhelan/qstory/ui/views/DialogXRecycleView;

    .line 73
    .line 74
    iget-object p0, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast p0, Landroid/widget/ImageView;

    .line 77
    .line 78
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    const/16 v1, 0x8

    .line 83
    .line 84
    if-ne v0, v1, :cond_2

    .line 85
    .line 86
    invoke-virtual {p1, v10}, Landroid/view/View;->setVisibility(I)V

    .line 87
    .line 88
    .line 89
    const p1, 0x1080003

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 93
    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_2
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 97
    .line 98
    .line 99
    const p1, 0x1080002

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 103
    .line 104
    .line 105
    :goto_2
    return-void

    .line 106
    :pswitch_2
    iget-object p1, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast p1, L飘花落叶言苏世子楪哲兰/飘花落叶言子楪世苏兰哲;

    .line 109
    .line 110
    iget-object p0, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast p0, Ltop/suzhelan/sticker/sdk/entity/OnlineStickerInfo;

    .line 113
    .line 114
    iget-object p1, p1, L飘花落叶言苏世子楪哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲兰世:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;

    .line 115
    .line 116
    if-eqz p1, :cond_3

    .line 117
    .line 118
    invoke-interface {p1, p0}, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    :cond_3
    return-void

    .line 122
    :pswitch_3
    iget-object p1, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast p1, L飘花落叶言苏世子楪哲兰/飘花落叶言子楪世苏哲兰;

    .line 125
    .line 126
    iget-object p0, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast p0, Ljava/io/File;

    .line 129
    .line 130
    iget-object p1, p1, L飘花落叶言苏世子楪哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast p1, L飘花落叶言世哲子苏楪兰/飘花落叶言子世哲兰苏楪;

    .line 133
    .line 134
    invoke-virtual {p1, p0}, L飘花落叶言世哲子苏楪兰/飘花落叶言子世哲兰苏楪;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    return-void

    .line 138
    :pswitch_4
    iget-object p1, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast p1, L飘花落叶言楪苏子兰世哲/飘花落叶言子楪世苏哲兰;

    .line 141
    .line 142
    iget-object p0, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast p0, L飘花落叶言苏哲世楪子兰/飘花落叶言子楪苏兰哲世;

    .line 145
    .line 146
    invoke-virtual {p1}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->getAbsoluteAdapterPosition()I

    .line 147
    .line 148
    .line 149
    move-result p1

    .line 150
    if-eq p1, v7, :cond_c

    .line 151
    .line 152
    iget-object v0, p0, L飘花落叶言楪世兰哲苏子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏:Ljava/util/List;

    .line 153
    .line 154
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    instance-of v1, v0, L飘花落叶言苏哲世楪子兰/飘花落叶言子楪哲世兰苏;

    .line 159
    .line 160
    if-eqz v1, :cond_4

    .line 161
    .line 162
    check-cast v0, L飘花落叶言苏哲世楪子兰/飘花落叶言子楪哲世兰苏;

    .line 163
    .line 164
    goto :goto_3

    .line 165
    :cond_4
    move-object v0, v8

    .line 166
    :goto_3
    if-nez v0, :cond_5

    .line 167
    .line 168
    goto :goto_6

    .line 169
    :cond_5
    iget-object v1, v0, L飘花落叶言苏哲世楪子兰/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰:Llin/xposed/hook/javaplugin/bean/GroupInfo;

    .line 170
    .line 171
    iget-boolean v0, v0, L飘花落叶言苏哲世楪子兰/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲:Z

    .line 172
    .line 173
    if-eqz v0, :cond_6

    .line 174
    .line 175
    goto :goto_6

    .line 176
    :cond_6
    iget-object v2, v1, Llin/xposed/hook/javaplugin/bean/GroupInfo;->GroupUin:Ljava/lang/String;

    .line 177
    .line 178
    iget-object v3, p0, L飘花落叶言苏哲世楪子兰/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏兰世哲:Ljava/util/LinkedHashMap;

    .line 179
    .line 180
    invoke-virtual {v3, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v4

    .line 184
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 185
    .line 186
    invoke-static {v4, v5}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result v4

    .line 190
    xor-int/2addr v4, v9

    .line 191
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 192
    .line 193
    .line 194
    move-result-object v4

    .line 195
    invoke-interface {v3, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪苏世哲兰(I)V

    .line 199
    .line 200
    .line 201
    if-eqz v0, :cond_7

    .line 202
    .line 203
    move v6, v10

    .line 204
    goto :goto_4

    .line 205
    :cond_7
    iget-boolean p1, v1, Llin/xposed/hook/javaplugin/bean/GroupInfo;->IsOwnerOrAdmin:Z

    .line 206
    .line 207
    if-eqz p1, :cond_8

    .line 208
    .line 209
    move v6, v9

    .line 210
    :cond_8
    :goto_4
    iget-object p1, p0, L飘花落叶言楪世兰哲苏子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏:Ljava/util/List;

    .line 211
    .line 212
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 217
    .line 218
    .line 219
    move-result v0

    .line 220
    if-eqz v0, :cond_b

    .line 221
    .line 222
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    add-int/lit8 v1, v10, 0x1

    .line 227
    .line 228
    if-ltz v10, :cond_a

    .line 229
    .line 230
    check-cast v0, L飘花落叶言苏哲世楪子兰/飘花落叶言子楪哲苏世兰;

    .line 231
    .line 232
    instance-of v2, v0, L飘花落叶言苏哲世楪子兰/飘花落叶言子楪哲世苏兰;

    .line 233
    .line 234
    if-eqz v2, :cond_9

    .line 235
    .line 236
    check-cast v0, L飘花落叶言苏哲世楪子兰/飘花落叶言子楪哲世苏兰;

    .line 237
    .line 238
    iget v0, v0, L飘花落叶言苏哲世楪子兰/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰:I

    .line 239
    .line 240
    if-ne v0, v6, :cond_9

    .line 241
    .line 242
    invoke-virtual {p0, v10}, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪苏世哲兰(I)V

    .line 243
    .line 244
    .line 245
    :cond_9
    move v10, v1

    .line 246
    goto :goto_5

    .line 247
    :cond_a
    invoke-static {}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子苏世楪哲兰()V

    .line 248
    .line 249
    .line 250
    throw v8

    .line 251
    :cond_b
    iget-object p0, p0, L飘花落叶言苏哲世楪子兰/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲苏世兰:Landroidx/compose/foundation/lazy/飘花落叶言子楪哲世苏兰;

    .line 252
    .line 253
    if-eqz p0, :cond_c

    .line 254
    .line 255
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/飘花落叶言子楪哲世苏兰;->invoke()Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    :cond_c
    :goto_6
    return-void

    .line 259
    :pswitch_5
    iget-object p1, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 260
    .line 261
    check-cast p1, L飘花落叶言楪苏子兰世哲/飘花落叶言子楪世苏哲兰;

    .line 262
    .line 263
    iget-object p0, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 264
    .line 265
    check-cast p0, L飘花落叶言苏世子楪哲兰/飘花落叶言子楪世苏哲兰;

    .line 266
    .line 267
    invoke-virtual {p1}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->getAbsoluteAdapterPosition()I

    .line 268
    .line 269
    .line 270
    move-result p1

    .line 271
    if-eq p1, v7, :cond_e

    .line 272
    .line 273
    iget-object v0, p0, L飘花落叶言楪世兰哲苏子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏:Ljava/util/List;

    .line 274
    .line 275
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    check-cast v0, Llin/xposed/hook/javaplugin/bean/GroupInfo;

    .line 280
    .line 281
    if-eqz v0, :cond_e

    .line 282
    .line 283
    iget-object v0, v0, Llin/xposed/hook/javaplugin/bean/GroupInfo;->GroupUin:Ljava/lang/String;

    .line 284
    .line 285
    if-nez v0, :cond_d

    .line 286
    .line 287
    goto :goto_7

    .line 288
    :cond_d
    iget-object v1, p0, L飘花落叶言苏世子楪哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世:Ljava/lang/Object;

    .line 289
    .line 290
    check-cast v1, Ljava/util/LinkedHashMap;

    .line 291
    .line 292
    invoke-virtual {v1, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v2

    .line 296
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 297
    .line 298
    invoke-static {v2, v3}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 299
    .line 300
    .line 301
    move-result v2

    .line 302
    xor-int/2addr v2, v9

    .line 303
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 304
    .line 305
    .line 306
    move-result-object v2

    .line 307
    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪苏世哲兰(I)V

    .line 311
    .line 312
    .line 313
    :cond_e
    :goto_7
    return-void

    .line 314
    :pswitch_6
    iget-object p1, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 315
    .line 316
    check-cast p1, L飘花落叶言楪苏子兰世哲/飘花落叶言子楪世苏哲兰;

    .line 317
    .line 318
    iget-object p0, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 319
    .line 320
    check-cast p0, L飘花落叶言苏哲世楪子兰/飘花落叶言子楪世哲苏兰;

    .line 321
    .line 322
    invoke-virtual {p1}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->getAbsoluteAdapterPosition()I

    .line 323
    .line 324
    .line 325
    move-result p1

    .line 326
    if-eq p1, v7, :cond_14

    .line 327
    .line 328
    iget-object v0, p0, L飘花落叶言楪世兰哲苏子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏:Ljava/util/List;

    .line 329
    .line 330
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    instance-of v1, v0, L飘花落叶言苏哲世楪子兰/飘花落叶言子楪世哲兰苏;

    .line 335
    .line 336
    if-eqz v1, :cond_f

    .line 337
    .line 338
    check-cast v0, L飘花落叶言苏哲世楪子兰/飘花落叶言子楪世哲兰苏;

    .line 339
    .line 340
    goto :goto_8

    .line 341
    :cond_f
    move-object v0, v8

    .line 342
    :goto_8
    if-nez v0, :cond_10

    .line 343
    .line 344
    goto :goto_a

    .line 345
    :cond_10
    iget-object v0, v0, L飘花落叶言苏哲世楪子兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Ltop/suzhelan/qstory/hook/plugin/entity/NewFriendInfo;

    .line 346
    .line 347
    iget-object v1, v0, Ltop/suzhelan/qstory/hook/plugin/entity/NewFriendInfo;->uin:Ljava/lang/String;

    .line 348
    .line 349
    iget-object v2, p0, L飘花落叶言苏哲世楪子兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏兰世哲:Ljava/util/LinkedHashMap;

    .line 350
    .line 351
    invoke-virtual {v2, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v3

    .line 355
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 356
    .line 357
    invoke-static {v3, v4}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 358
    .line 359
    .line 360
    move-result v3

    .line 361
    xor-int/2addr v3, v9

    .line 362
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 363
    .line 364
    .line 365
    move-result-object v3

    .line 366
    invoke-interface {v2, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪苏世哲兰(I)V

    .line 370
    .line 371
    .line 372
    iget p1, v0, Ltop/suzhelan/qstory/hook/plugin/entity/NewFriendInfo;->categoryId:I

    .line 373
    .line 374
    iget-object v0, p0, L飘花落叶言楪世兰哲苏子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏:Ljava/util/List;

    .line 375
    .line 376
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 377
    .line 378
    .line 379
    move-result-object v0

    .line 380
    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 381
    .line 382
    .line 383
    move-result v1

    .line 384
    if-eqz v1, :cond_13

    .line 385
    .line 386
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v1

    .line 390
    add-int/lit8 v2, v10, 0x1

    .line 391
    .line 392
    if-ltz v10, :cond_12

    .line 393
    .line 394
    check-cast v1, L飘花落叶言苏哲世楪子兰/飘花落叶言子楪世兰哲苏;

    .line 395
    .line 396
    instance-of v3, v1, L飘花落叶言苏哲世楪子兰/飘花落叶言子楪世兰苏哲;

    .line 397
    .line 398
    if-eqz v3, :cond_11

    .line 399
    .line 400
    check-cast v1, L飘花落叶言苏哲世楪子兰/飘花落叶言子楪世兰苏哲;

    .line 401
    .line 402
    iget v1, v1, L飘花落叶言苏哲世楪子兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:I

    .line 403
    .line 404
    if-ne v1, p1, :cond_11

    .line 405
    .line 406
    invoke-virtual {p0, v10}, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪苏世哲兰(I)V

    .line 407
    .line 408
    .line 409
    :cond_11
    move v10, v2

    .line 410
    goto :goto_9

    .line 411
    :cond_12
    invoke-static {}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子苏世楪哲兰()V

    .line 412
    .line 413
    .line 414
    throw v8

    .line 415
    :cond_13
    iget-object p0, p0, L飘花落叶言苏哲世楪子兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:Landroidx/compose/foundation/lazy/飘花落叶言子楪哲世苏兰;

    .line 416
    .line 417
    if-eqz p0, :cond_14

    .line 418
    .line 419
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/飘花落叶言子楪哲世苏兰;->invoke()Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    :cond_14
    :goto_a
    return-void

    .line 423
    :pswitch_7
    iget-object p1, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 424
    .line 425
    check-cast p1, L飘花落叶言楪苏子兰世哲/飘花落叶言子楪世苏哲兰;

    .line 426
    .line 427
    iget-object p0, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 428
    .line 429
    check-cast p0, L飘花落叶言苏世子哲楪兰/飘花落叶言子楪世兰苏哲;

    .line 430
    .line 431
    new-instance v0, Landroidx/compose/runtime/internal/飘花落叶言子楪苏兰世哲;

    .line 432
    .line 433
    iget-object p1, p1, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->itemView:Landroid/view/View;

    .line 434
    .line 435
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 436
    .line 437
    .line 438
    move-result-object p1

    .line 439
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 440
    .line 441
    .line 442
    invoke-virtual {p0}, L飘花落叶言苏世子哲楪兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰苏哲()L飘花落叶言苏世子哲楪兰/飘花落叶言子楪世兰苏哲$飘花落叶言子楪世苏哲兰;

    .line 443
    .line 444
    .line 445
    move-result-object v1

    .line 446
    invoke-virtual {v1}, L飘花落叶言苏世子哲楪兰/飘花落叶言子楪世兰苏哲$飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏()Ljava/lang/String;

    .line 447
    .line 448
    .line 449
    move-result-object v1

    .line 450
    invoke-virtual {p0}, L飘花落叶言苏世子哲楪兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏()Ljava/lang/String;

    .line 451
    .line 452
    .line 453
    move-result-object p0

    .line 454
    invoke-direct {v0, p1, v1, p0}, Landroidx/compose/runtime/internal/飘花落叶言子楪苏兰世哲;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 455
    .line 456
    .line 457
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 458
    .line 459
    .line 460
    move-result-object p0

    .line 461
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 462
    .line 463
    .line 464
    move-result-object p0

    .line 465
    iget p0, p0, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 466
    .line 467
    int-to-double p0, p0

    .line 468
    const-wide v1, 0x3fe999999999999aL    # 0.8

    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    mul-double/2addr p0, v1

    .line 474
    double-to-int p0, p0

    .line 475
    iget-object p1, v0, Landroidx/compose/runtime/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世兰苏哲:Ljava/lang/Object;

    .line 476
    .line 477
    check-cast p1, L飘花落叶言楪哲苏世子兰/飘花落叶言子楪苏哲兰世;

    .line 478
    .line 479
    iput p0, p1, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子世苏楪兰哲:I

    .line 480
    .line 481
    invoke-virtual {p1}, L飘花落叶言楪哲苏世子兰/飘花落叶言子楪苏哲兰世;->飘花落叶言子世哲兰苏楪()V

    .line 482
    .line 483
    .line 484
    iput-boolean v10, p1, L飘花落叶言楪哲苏世子兰/飘花落叶言子楪苏哲兰世;->飘花落叶言子苏楪兰世哲:Z

    .line 485
    .line 486
    new-instance p0, L飘花落叶言苏世子楪兰哲/飘花落叶言子楪世苏哲兰;

    .line 487
    .line 488
    invoke-direct {p0, v0}, L飘花落叶言苏世子楪兰哲/飘花落叶言子楪世苏哲兰;-><init>(Landroidx/compose/runtime/internal/飘花落叶言子楪苏兰世哲;)V

    .line 489
    .line 490
    .line 491
    iput-object p0, p1, L飘花落叶言楪哲苏世子兰/飘花落叶言子楪苏哲兰世;->飘花落叶言子世哲兰苏楪:Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰世哲;

    .line 492
    .line 493
    invoke-virtual {p1}, L飘花落叶言楪哲苏世子兰/飘花落叶言子楪苏哲兰世;->飘花落叶言子世哲兰苏楪()V

    .line 494
    .line 495
    .line 496
    new-instance p0, L飘花落叶言苏世子楪兰哲/飘花落叶言子楪世苏兰哲;

    .line 497
    .line 498
    invoke-direct {p0, v0, v10}, L飘花落叶言苏世子楪兰哲/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/Object;I)V

    .line 499
    .line 500
    .line 501
    invoke-virtual {p1, p0}, L飘花落叶言楪哲苏世子兰/飘花落叶言子楪苏哲兰世;->飘花落叶言子世兰楪苏哲(Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏世兰哲;)V

    .line 502
    .line 503
    .line 504
    invoke-virtual {p1}, L飘花落叶言楪哲苏世子兰/飘花落叶言子楪苏哲兰世;->飘花落叶言子世兰楪哲苏()V

    .line 505
    .line 506
    .line 507
    return-void

    .line 508
    :pswitch_8
    iget-object p1, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 509
    .line 510
    check-cast p1, L飘花落叶言苏世子哲楪兰/飘花落叶言子楪世兰苏哲;

    .line 511
    .line 512
    iget-object p0, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 513
    .line 514
    check-cast p0, L飘花落叶言苏世子楪哲兰/飘花落叶言子楪世兰哲苏;

    .line 515
    .line 516
    const-string v0, "\u4e0b\u8f7d\u4e2d..."

    .line 517
    .line 518
    invoke-static {v0}, L飘花落叶言楪哲苏世子兰/飘花落叶言子世兰楪苏哲;->飘花落叶言子世兰楪哲苏(Ljava/lang/String;)L飘花落叶言楪哲苏世子兰/飘花落叶言子世兰楪苏哲;

    .line 519
    .line 520
    .line 521
    invoke-static {}, Ltop/suzhelan/plugin/sdk/online/net/PluginSdkConfig;->getDOWNLOAD_DIR()Ljava/lang/String;

    .line 522
    .line 523
    .line 524
    move-result-object v0

    .line 525
    invoke-virtual {p1}, L飘花落叶言苏世子哲楪兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰苏哲()L飘花落叶言苏世子哲楪兰/飘花落叶言子楪世兰苏哲$飘花落叶言子楪世苏哲兰;

    .line 526
    .line 527
    .line 528
    move-result-object v1

    .line 529
    invoke-virtual {v1}, L飘花落叶言苏世子哲楪兰/飘花落叶言子楪世兰苏哲$飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏()Ljava/lang/String;

    .line 530
    .line 531
    .line 532
    move-result-object v1

    .line 533
    new-instance v2, Ljava/lang/StringBuilder;

    .line 534
    .line 535
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 536
    .line 537
    .line 538
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 539
    .line 540
    .line 541
    const-string v0, "/"

    .line 542
    .line 543
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 544
    .line 545
    .line 546
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 547
    .line 548
    .line 549
    const-string v0, ".zip"

    .line 550
    .line 551
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 552
    .line 553
    .line 554
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 555
    .line 556
    .line 557
    move-result-object v0

    .line 558
    iget-object v1, p0, L飘花落叶言苏世子楪哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰:Ltop/suzhelan/plugin/sdk/online/presenter/飘花落叶言子楪世哲兰苏;

    .line 559
    .line 560
    new-instance v2, L飘花落叶言世哲子苏楪兰/飘花落叶言子世哲兰苏楪;

    .line 561
    .line 562
    const/4 v3, 0x6

    .line 563
    invoke-direct {v2, p0, v3, v0}, L飘花落叶言世哲子苏楪兰/飘花落叶言子世哲兰苏楪;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 564
    .line 565
    .line 566
    invoke-virtual {v1, p1, v0, v2}, Ltop/suzhelan/plugin/sdk/online/presenter/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(L飘花落叶言苏世子哲楪兰/飘花落叶言子楪世兰苏哲;Ljava/lang/String;L飘花落叶言世哲子苏楪兰/飘花落叶言子世哲兰苏楪;)V

    .line 567
    .line 568
    .line 569
    return-void

    .line 570
    :pswitch_9
    iget-object p1, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 571
    .line 572
    check-cast p1, L飘花落叶言苏世子楪哲兰/飘花落叶言子楪世苏兰哲;

    .line 573
    .line 574
    iget-object p0, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 575
    .line 576
    check-cast p0, Ltop/suzhelan/plugin/sdk/online/entity/Message;

    .line 577
    .line 578
    iget-object p1, p1, L飘花落叶言苏世子楪哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲兰世:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;

    .line 579
    .line 580
    check-cast p1, L飘花落叶言苏世子楪兰哲/飘花落叶言子楪世哲苏兰;

    .line 581
    .line 582
    invoke-virtual {p1, p0}, L飘花落叶言苏世子楪兰哲/飘花落叶言子楪世哲苏兰;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 583
    .line 584
    .line 585
    return-void

    .line 586
    :pswitch_a
    iget-object p1, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 587
    .line 588
    check-cast p1, L飘花落叶言苏世子楪哲兰/飘花落叶言子楪世苏哲兰;

    .line 589
    .line 590
    iget-object p0, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 591
    .line 592
    check-cast p0, L飘花落叶言苏世子哲楪兰/飘花落叶言子楪世苏哲兰;

    .line 593
    .line 594
    iget-object p1, p1, L飘花落叶言苏世子楪哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世:Ljava/lang/Object;

    .line 595
    .line 596
    check-cast p1, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世楪哲兰苏;

    .line 597
    .line 598
    invoke-virtual {p1, p0}, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世楪哲兰苏;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 599
    .line 600
    .line 601
    return-void

    .line 602
    :pswitch_b
    iget-object p1, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 603
    .line 604
    check-cast p1, Landroidx/compose/runtime/internal/飘花落叶言子楪苏兰世哲;

    .line 605
    .line 606
    iget-object p0, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 607
    .line 608
    check-cast p0, L飘花落叶言苏世子楪哲兰/飘花落叶言子楪世苏哲兰;

    .line 609
    .line 610
    const-string v0, "inputEdit"

    .line 611
    .line 612
    iget-object v1, p1, Landroidx/compose/runtime/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲世兰:Ljava/lang/Object;

    .line 613
    .line 614
    check-cast v1, Landroid/widget/EditText;

    .line 615
    .line 616
    if-eqz v1, :cond_1c

    .line 617
    .line 618
    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 619
    .line 620
    .line 621
    move-result-object v1

    .line 622
    if-eqz v1, :cond_17

    .line 623
    .line 624
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 625
    .line 626
    .line 627
    move-result v1

    .line 628
    if-nez v1, :cond_15

    .line 629
    .line 630
    goto :goto_b

    .line 631
    :cond_15
    const-string v1, "\u6b63\u5728\u53d1\u9001"

    .line 632
    .line 633
    invoke-static {v1}, L飘花落叶言楪哲苏世子兰/飘花落叶言子世兰楪苏哲;->飘花落叶言子世兰楪哲苏(Ljava/lang/String;)L飘花落叶言楪哲苏世子兰/飘花落叶言子世兰楪苏哲;

    .line 634
    .line 635
    .line 636
    iget-object v1, p1, Landroidx/compose/runtime/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲兰苏:Ljava/lang/Object;

    .line 637
    .line 638
    check-cast v1, Ltop/suzhelan/plugin/sdk/online/presenter/飘花落叶言子楪世苏兰哲;

    .line 639
    .line 640
    iget-object v2, p1, Landroidx/compose/runtime/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲世兰:Ljava/lang/Object;

    .line 641
    .line 642
    check-cast v2, Landroid/widget/EditText;

    .line 643
    .line 644
    if-eqz v2, :cond_16

    .line 645
    .line 646
    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 647
    .line 648
    .line 649
    move-result-object v0

    .line 650
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 651
    .line 652
    .line 653
    move-result-object v0

    .line 654
    iget-object v2, p1, Landroidx/compose/runtime/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 655
    .line 656
    check-cast v2, Ljava/lang/String;

    .line 657
    .line 658
    new-instance v3, Landroidx/compose/foundation/飘花落叶言子楪兰苏世哲;

    .line 659
    .line 660
    const/16 v4, 0xd

    .line 661
    .line 662
    invoke-direct {v3, p1, v4, p0}, Landroidx/compose/foundation/飘花落叶言子楪兰苏世哲;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 663
    .line 664
    .line 665
    invoke-virtual {v1, v0, v2, v3}, Ltop/suzhelan/plugin/sdk/online/presenter/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/foundation/飘花落叶言子楪兰苏世哲;)V

    .line 666
    .line 667
    .line 668
    goto :goto_d

    .line 669
    :cond_16
    invoke-static {v0}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 670
    .line 671
    .line 672
    throw v8

    .line 673
    :cond_17
    :goto_b
    const-string p0, "\u4f60\u8fd8\u6ca1\u6709\u8f93\u5165\u5185\u5bb9\u54e6"

    .line 674
    .line 675
    invoke-static {}, L飘花落叶言楪哲苏世子兰/飘花落叶言子世兰楪苏哲;->飘花落叶言子世哲兰苏楪()L飘花落叶言楪哲苏世子兰/飘花落叶言子世兰楪苏哲;

    .line 676
    .line 677
    .line 678
    move-result-object p1

    .line 679
    if-eqz p1, :cond_1a

    .line 680
    .line 681
    sget-object v0, Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;->WARNING:Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;

    .line 682
    .line 683
    iput-object p0, p1, L飘花落叶言楪哲苏世子兰/飘花落叶言子世兰楪苏哲;->飘花落叶言子世兰苏哲楪:Ljava/lang/CharSequence;

    .line 684
    .line 685
    iget-object p0, p1, L飘花落叶言楪哲苏世子兰/飘花落叶言子世兰楪苏哲;->飘花落叶言子苏楪哲兰世:Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;

    .line 686
    .line 687
    if-ne p0, v0, :cond_18

    .line 688
    .line 689
    goto :goto_c

    .line 690
    :cond_18
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 691
    .line 692
    .line 693
    move-result p0

    .line 694
    iput p0, p1, L飘花落叶言楪哲苏世子兰/飘花落叶言子世兰楪苏哲;->飘花落叶言子苏楪世哲兰:I

    .line 695
    .line 696
    iput-object v0, p1, L飘花落叶言楪哲苏世子兰/飘花落叶言子世兰楪苏哲;->飘花落叶言子苏楪哲兰世:Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;

    .line 697
    .line 698
    invoke-virtual {p1}, L飘花落叶言楪哲苏世子兰/飘花落叶言子世兰楪苏哲;->飘花落叶言子世哲兰楪苏()L飘花落叶言楪哲苏世子兰/飘花落叶言子世哲兰苏楪;

    .line 699
    .line 700
    .line 701
    move-result-object p0

    .line 702
    if-eqz p0, :cond_19

    .line 703
    .line 704
    invoke-virtual {p1}, L飘花落叶言楪哲苏世子兰/飘花落叶言子世兰楪苏哲;->飘花落叶言子世哲兰楪苏()L飘花落叶言楪哲苏世子兰/飘花落叶言子世哲兰苏楪;

    .line 705
    .line 706
    .line 707
    move-result-object p0

    .line 708
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 709
    .line 710
    .line 711
    new-instance v1, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世苏哲兰;

    .line 712
    .line 713
    const/16 v2, 0x12

    .line 714
    .line 715
    invoke-direct {v1, p0, v2, v0}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 716
    .line 717
    .line 718
    invoke-static {v1}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子世苏楪兰哲(Ljava/lang/Runnable;)V

    .line 719
    .line 720
    .line 721
    :cond_19
    :goto_c
    invoke-virtual {p1}, L飘花落叶言楪哲苏世子兰/飘花落叶言子世兰楪苏哲;->飘花落叶言子世兰楪苏哲()V

    .line 722
    .line 723
    .line 724
    invoke-virtual {p1}, L飘花落叶言楪哲苏世子兰/飘花落叶言子世兰楪苏哲;->飘花落叶言子世哲兰楪苏()L飘花落叶言楪哲苏世子兰/飘花落叶言子世哲兰苏楪;

    .line 725
    .line 726
    .line 727
    move-result-object p0

    .line 728
    if-nez p0, :cond_1b

    .line 729
    .line 730
    invoke-virtual {p1}, L飘花落叶言楪哲苏世子兰/飘花落叶言子世兰楪苏哲;->飘花落叶言子世兰苏哲楪()V

    .line 731
    .line 732
    .line 733
    goto :goto_d

    .line 734
    :cond_1a
    new-instance p0, L飘花落叶言楪哲苏世子兰/飘花落叶言子世兰楪苏哲;

    .line 735
    .line 736
    invoke-direct {p0}, L飘花落叶言楪哲苏世子兰/飘花落叶言子世兰楪苏哲;-><init>()V

    .line 737
    .line 738
    .line 739
    :cond_1b
    :goto_d
    return-void

    .line 740
    :cond_1c
    invoke-static {v0}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 741
    .line 742
    .line 743
    throw v8

    .line 744
    :pswitch_c
    iget-object p1, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 745
    .line 746
    check-cast p1, Landroid/widget/TextView;

    .line 747
    .line 748
    iget-object p0, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 749
    .line 750
    check-cast p0, Ljava/lang/String;

    .line 751
    .line 752
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 753
    .line 754
    .line 755
    move-result-object p1

    .line 756
    const/16 v0, 0x2e

    .line 757
    .line 758
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 759
    .line 760
    .line 761
    move-result-object v0

    .line 762
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 763
    .line 764
    .line 765
    move-result-object p1

    .line 766
    const/16 v0, 0x96a

    .line 767
    .line 768
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 769
    .line 770
    .line 771
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 772
    .line 773
    .line 774
    check-cast p1, Landroid/content/ClipboardManager;

    .line 775
    .line 776
    const/16 v0, 0x96b

    .line 777
    .line 778
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 779
    .line 780
    .line 781
    move-result-object v0

    .line 782
    invoke-static {v0, p0}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    .line 783
    .line 784
    .line 785
    move-result-object p0

    .line 786
    invoke-virtual {p1, p0}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 787
    .line 788
    .line 789
    const/16 p0, 0x96c

    .line 790
    .line 791
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 792
    .line 793
    .line 794
    move-result-object p0

    .line 795
    invoke-static {p0}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 796
    .line 797
    .line 798
    return-void

    .line 799
    :pswitch_d
    iget-object p1, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 800
    .line 801
    check-cast p1, L飘花落叶言苏哲世楪子兰/飘花落叶言子楪苏哲兰世;

    .line 802
    .line 803
    iget-object p0, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 804
    .line 805
    check-cast p0, L飘花落叶言楪哲苏世子兰/飘花落叶言子楪哲苏世兰;

    .line 806
    .line 807
    sget-object v0, Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏:Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世哲兰苏;

    .line 808
    .line 809
    invoke-virtual {p1}, L飘花落叶言苏哲世楪子兰/飘花落叶言子楪苏哲兰世;->飘花落叶言子世楪苏兰哲()Ljava/util/ArrayList;

    .line 810
    .line 811
    .line 812
    move-result-object p1

    .line 813
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 814
    .line 815
    .line 816
    invoke-static {p1}, Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰哲苏(Ljava/util/ArrayList;)V

    .line 817
    .line 818
    .line 819
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏(Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世哲兰苏;)V

    .line 820
    .line 821
    .line 822
    const/16 p1, 0x969

    .line 823
    .line 824
    invoke-static {p1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 825
    .line 826
    .line 827
    move-result-object p1

    .line 828
    invoke-static {p1}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 829
    .line 830
    .line 831
    if-eqz p0, :cond_1d

    .line 832
    .line 833
    invoke-virtual {p0}, L飘花落叶言楪哲苏世子兰/飘花落叶言子楪哲苏世兰;->飘花落叶言子世哲苏兰楪()V

    .line 834
    .line 835
    .line 836
    :cond_1d
    return-void

    .line 837
    :pswitch_e
    iget-object v0, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 838
    .line 839
    check-cast v0, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 840
    .line 841
    iget-object p0, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 842
    .line 843
    check-cast p0, L飘花落叶言楪世兰哲苏子/飘花落叶言子楪苏世哲兰;

    .line 844
    .line 845
    invoke-virtual {v0}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->getBindingAdapterPosition()I

    .line 846
    .line 847
    .line 848
    move-result v0

    .line 849
    if-ne v0, v7, :cond_1e

    .line 850
    .line 851
    goto :goto_e

    .line 852
    :cond_1e
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 853
    .line 854
    .line 855
    iget-object v1, p0, L飘花落叶言楪世兰哲苏子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰苏哲:L飘花落叶言楪世兰哲苏子/飘花落叶言子楪世哲兰苏;

    .line 856
    .line 857
    if-eqz v1, :cond_1f

    .line 858
    .line 859
    invoke-interface {v1, p0, p1, v0}, L飘花落叶言楪世兰哲苏子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰(L飘花落叶言楪世兰哲苏子/飘花落叶言子楪苏世哲兰;Landroid/view/View;I)V

    .line 860
    .line 861
    .line 862
    :cond_1f
    :goto_e
    return-void

    .line 863
    :pswitch_f
    iget-object p1, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 864
    .line 865
    check-cast p1, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏哲兰世;

    .line 866
    .line 867
    iget-object p0, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 868
    .line 869
    check-cast p0, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世哲兰;

    .line 870
    .line 871
    iget v0, p0, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 872
    .line 873
    if-ne v0, v6, :cond_20

    .line 874
    .line 875
    goto :goto_11

    .line 876
    :cond_20
    invoke-static {}, Lkotlin/collections/飘花落叶言子世苏楪哲兰;->飘花落叶言子世楪苏哲兰()Z

    .line 877
    .line 878
    .line 879
    move-result v0

    .line 880
    if-eqz v0, :cond_21

    .line 881
    .line 882
    iget-object p0, p0, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 883
    .line 884
    invoke-static {p0}, Llin/xposed/hook/util/qq/CreateElement;->createEmojiElement(Ljava/lang/String;)Ljava/lang/Object;

    .line 885
    .line 886
    .line 887
    move-result-object p0

    .line 888
    const/16 v0, 0x112

    .line 889
    .line 890
    :try_start_0
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 891
    .line 892
    .line 893
    move-result-object v0

    .line 894
    const/16 v1, 0xa9

    .line 895
    .line 896
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 897
    .line 898
    .line 899
    move-result-object v1

    .line 900
    invoke-static {v1}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 901
    .line 902
    .line 903
    move-result-object v1

    .line 904
    invoke-static {v1, v0, p0}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 905
    .line 906
    .line 907
    move-result-object v0

    .line 908
    const-string v1, "\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5\u55b5"

    .line 909
    .line 910
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 911
    .line 912
    .line 913
    move-result-object v1

    .line 914
    const/16 v2, 0x15b

    .line 915
    .line 916
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 917
    .line 918
    .line 919
    move-result-object v2

    .line 920
    invoke-static {v0, v1, v2}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 921
    .line 922
    .line 923
    const/16 v1, 0x84

    .line 924
    .line 925
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 926
    .line 927
    .line 928
    move-result-object v1

    .line 929
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 930
    .line 931
    .line 932
    move-result-object v2

    .line 933
    invoke-static {v0, v1, v2}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 934
    .line 935
    .line 936
    new-instance v0, Ljava/util/ArrayList;

    .line 937
    .line 938
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 939
    .line 940
    .line 941
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 942
    .line 943
    .line 944
    invoke-static {}, Llin/xposed/hook/util/qq/QQSessionUtils;->getCurrentContact()Ljava/lang/Object;

    .line 945
    .line 946
    .line 947
    move-result-object p0

    .line 948
    invoke-static {p0, v0}, Llin/xposed/hook/util/qq/QQNTSendMsgUtils;->sendMsg(Ljava/lang/Object;Ljava/util/ArrayList;)V

    .line 949
    .line 950
    .line 951
    goto :goto_f

    .line 952
    :catch_0
    move-exception p0

    .line 953
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏哲世兰(Ljava/lang/Throwable;)V

    .line 954
    .line 955
    .line 956
    goto :goto_11

    .line 957
    :cond_21
    :goto_f
    iget-object p0, p1, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏哲世兰:L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏兰哲世;

    .line 958
    .line 959
    invoke-virtual {p0, v10}, Landroid/view/View;->setClickable(Z)V

    .line 960
    .line 961
    .line 962
    iget-object p0, p1, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏哲世兰:L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏兰哲世;

    .line 963
    .line 964
    invoke-virtual {p0, v8}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 965
    .line 966
    .line 967
    const-class v0, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;

    .line 968
    .line 969
    monitor-enter v0

    .line 970
    :try_start_1
    sget-object p0, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏兰哲世;

    .line 971
    .line 972
    if-eqz p0, :cond_22

    .line 973
    .line 974
    invoke-virtual {p0}, Lcom/lxj/xpopup/core/飘花落叶言子楪苏世兰哲;->dismiss()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 975
    .line 976
    .line 977
    goto :goto_10

    .line 978
    :catchall_0
    move-exception p0

    .line 979
    goto :goto_12

    .line 980
    :cond_22
    :goto_10
    monitor-exit v0

    .line 981
    :goto_11
    return-void

    .line 982
    :goto_12
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 983
    throw p0

    .line 984
    :pswitch_10
    iget-object v0, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 985
    .line 986
    check-cast v0, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏兰哲世;

    .line 987
    .line 988
    iget-object p0, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 989
    .line 990
    check-cast p0, Ljava/lang/String;

    .line 991
    .line 992
    sput v10, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪兰哲世苏:I

    .line 993
    .line 994
    invoke-virtual {v0, p0}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)V

    .line 995
    .line 996
    .line 997
    iget-object p0, v0, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲苏兰世:Ljava/util/ArrayList;

    .line 998
    .line 999
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1000
    .line 1001
    .line 1002
    move-result-object p0

    .line 1003
    :goto_13
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 1004
    .line 1005
    .line 1006
    move-result v1

    .line 1007
    if-eqz v1, :cond_23

    .line 1008
    .line 1009
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v1

    .line 1013
    check-cast v1, Landroid/view/View;

    .line 1014
    .line 1015
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1016
    .line 1017
    .line 1018
    move-result-object v2

    .line 1019
    const v3, 0x24060030

    .line 1020
    .line 1021
    .line 1022
    invoke-virtual {v2, v3, v8}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    .line 1023
    .line 1024
    .line 1025
    move-result v2

    .line 1026
    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundColor(I)V

    .line 1027
    .line 1028
    .line 1029
    goto :goto_13

    .line 1030
    :cond_23
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1031
    .line 1032
    .line 1033
    move-result-object p0

    .line 1034
    const v0, 0x2408012f

    .line 1035
    .line 1036
    .line 1037
    invoke-virtual {p0, v0, v8}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 1038
    .line 1039
    .line 1040
    move-result-object p0

    .line 1041
    invoke-virtual {p1, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1042
    .line 1043
    .line 1044
    return-void

    .line 1045
    :pswitch_11
    iget-object p1, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1046
    .line 1047
    check-cast p1, Landroid/content/Context;

    .line 1048
    .line 1049
    iget-object p0, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 1050
    .line 1051
    check-cast p0, Landroid/widget/RadioGroup;

    .line 1052
    .line 1053
    new-instance v0, Landroid/widget/EditText;

    .line 1054
    .line 1055
    invoke-direct {v0, p1}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 1056
    .line 1057
    .line 1058
    new-instance v1, Landroid/app/AlertDialog$Builder;

    .line 1059
    .line 1060
    invoke-static {p1}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰苏世哲(Landroid/content/Context;)Z

    .line 1061
    .line 1062
    .line 1063
    move-result v2

    .line 1064
    if-eqz v2, :cond_24

    .line 1065
    .line 1066
    goto :goto_14

    .line 1067
    :cond_24
    const/4 v6, 0x3

    .line 1068
    :goto_14
    invoke-direct {v1, p1, v6}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;I)V

    .line 1069
    .line 1070
    .line 1071
    const/16 v2, 0x157

    .line 1072
    .line 1073
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 1074
    .line 1075
    .line 1076
    move-result-object v2

    .line 1077
    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 1078
    .line 1079
    .line 1080
    move-result-object v1

    .line 1081
    invoke-virtual {v1, v0}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 1082
    .line 1083
    .line 1084
    move-result-object v1

    .line 1085
    const/16 v2, 0x158

    .line 1086
    .line 1087
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 1088
    .line 1089
    .line 1090
    move-result-object v2

    .line 1091
    new-instance v3, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪世兰哲苏;

    .line 1092
    .line 1093
    invoke-direct {v3, v0, p0, p1, v9}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪世兰哲苏;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1094
    .line 1095
    .line 1096
    invoke-virtual {v1, v2, v3}, Landroid/app/AlertDialog$Builder;->setNeutralButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 1097
    .line 1098
    .line 1099
    move-result-object p0

    .line 1100
    invoke-virtual {p0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 1101
    .line 1102
    .line 1103
    return-void

    .line 1104
    :pswitch_12
    iget-object p1, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1105
    .line 1106
    check-cast p1, L飘花落叶言世哲苏子楪兰/飘花落叶言子世兰苏楪哲;

    .line 1107
    .line 1108
    iget-object p0, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 1109
    .line 1110
    check-cast p0, Landroid/widget/ImageView;

    .line 1111
    .line 1112
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1113
    .line 1114
    .line 1115
    move-result-object p0

    .line 1116
    check-cast p0, Landroid/app/Activity;

    .line 1117
    .line 1118
    new-instance v0, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世苏兰哲;

    .line 1119
    .line 1120
    const/16 v6, 0x107

    .line 1121
    .line 1122
    invoke-static {v6}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 1123
    .line 1124
    .line 1125
    move-result-object v6

    .line 1126
    invoke-direct {v0, v6}, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/String;)V

    .line 1127
    .line 1128
    .line 1129
    iput-object v0, p1, L飘花落叶言世哲苏子楪兰/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世苏兰哲;

    .line 1130
    .line 1131
    new-instance v0, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世哲苏兰;

    .line 1132
    .line 1133
    const/16 v6, 0x109

    .line 1134
    .line 1135
    invoke-static {v6}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 1136
    .line 1137
    .line 1138
    move-result-object v6

    .line 1139
    const/16 v7, 0x10a

    .line 1140
    .line 1141
    invoke-static {v7}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 1142
    .line 1143
    .line 1144
    move-result-object v7

    .line 1145
    const-string v8, "\u55b5\u545c\u55b5\u55b5\u545c\u55b5\u545c\u545c~\u545c\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u55b5~\u545c\u545c\u55b5\u55b5\u545c\u55b5\u545c\u55b5~\u545c\u545c\u545c\u55b5\u55b5\u545c\u545c\u545c~\u545c\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c~\u545c\u545c\u545c\u545c\u545c\u55b5\u545c\u545c~\u545c\u545c\u55b5\u545c\u55b5\u545c\u545c\u545c"

    .line 1146
    .line 1147
    invoke-static {v8}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 1148
    .line 1149
    .line 1150
    move-result-object v8

    .line 1151
    const-string v9, "\u55b5\u545c\u55b5\u55b5\u55b5\u55b5\u55b5\u545c~\u545c\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u55b5~\u545c\u545c\u55b5\u55b5\u545c\u55b5\u545c\u55b5~\u545c\u545c\u545c\u55b5\u55b5\u545c\u545c\u545c~\u545c\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c~\u545c\u545c\u545c\u545c\u545c\u55b5\u545c\u545c~\u545c\u545c\u55b5\u545c\u55b5\u545c\u545c\u545c"

    .line 1152
    .line 1153
    invoke-static {v9}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 1154
    .line 1155
    .line 1156
    move-result-object v9

    .line 1157
    const-string v10, "\u545c\u55b5\u55b5\u545c\u55b5\u545c\u545c\u55b5~\u545c\u545c\u545c\u545c\u55b5\u55b5\u55b5\u55b5~\u545c\u545c\u55b5\u55b5\u545c\u55b5\u55b5\u545c~\u545c\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c~\u545c\u545c\u545c\u545c\u55b5\u55b5\u545c\u55b5~\u545c\u545c\u55b5\u55b5\u55b5\u55b5\u55b5\u545c"

    .line 1158
    .line 1159
    invoke-static {v10}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 1160
    .line 1161
    .line 1162
    move-result-object v11

    .line 1163
    filled-new-array {v6, v7, v8, v9, v11}, [Ljava/lang/String;

    .line 1164
    .line 1165
    .line 1166
    move-result-object v6

    .line 1167
    invoke-direct {v0, p0, v6}, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世哲苏兰;-><init>(Landroid/app/Activity;[Ljava/lang/String;)V

    .line 1168
    .line 1169
    .line 1170
    iget-object p0, v0, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:Landroid/widget/TextView;

    .line 1171
    .line 1172
    iget-object v6, p1, L飘花落叶言世哲苏子楪兰/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世苏兰哲;

    .line 1173
    .line 1174
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 1175
    .line 1176
    .line 1177
    move-result-object v2

    .line 1178
    invoke-virtual {v6, v2}, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Object;

    .line 1179
    .line 1180
    .line 1181
    move-result-object v2

    .line 1182
    check-cast v2, Ljava/lang/Long;

    .line 1183
    .line 1184
    new-instance v6, Ljava/util/Date;

    .line 1185
    .line 1186
    invoke-direct {v6}, Ljava/util/Date;-><init>()V

    .line 1187
    .line 1188
    .line 1189
    if-eqz v2, :cond_26

    .line 1190
    .line 1191
    invoke-virtual {v6}, Ljava/util/Date;->getTime()J

    .line 1192
    .line 1193
    .line 1194
    move-result-wide v7

    .line 1195
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 1196
    .line 1197
    .line 1198
    move-result-wide v11

    .line 1199
    cmp-long v7, v7, v11

    .line 1200
    .line 1201
    if-lez v7, :cond_25

    .line 1202
    .line 1203
    goto :goto_15

    .line 1204
    :cond_25
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 1205
    .line 1206
    .line 1207
    move-result-wide v1

    .line 1208
    invoke-virtual {v6}, Ljava/util/Date;->getTime()J

    .line 1209
    .line 1210
    .line 1211
    move-result-wide v6

    .line 1212
    sub-long/2addr v1, v6

    .line 1213
    div-long v6, v1, v3

    .line 1214
    .line 1215
    mul-long/2addr v3, v6

    .line 1216
    sub-long/2addr v1, v3

    .line 1217
    const-wide/32 v3, 0xea60

    .line 1218
    .line 1219
    .line 1220
    div-long/2addr v1, v3

    .line 1221
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1222
    .line 1223
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 1224
    .line 1225
    .line 1226
    const-string v4, "\u545c\u55b5\u55b5\u545c\u55b5\u545c\u545c\u55b5~\u545c\u545c\u545c\u545c\u545c\u545c\u55b5\u55b5~\u545c\u545c\u55b5\u545c\u55b5\u55b5\u545c\u545c~\u545c\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5~\u545c\u545c\u55b5\u545c\u545c\u55b5\u55b5\u55b5~\u545c\u545c\u545c\u545c\u55b5\u545c\u55b5\u545c~\u55b5\u545c\u55b5\u55b5\u55b5\u55b5\u55b5\u545c"

    .line 1227
    .line 1228
    invoke-static {v4}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 1229
    .line 1230
    .line 1231
    move-result-object v4

    .line 1232
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1233
    .line 1234
    .line 1235
    invoke-virtual {v3, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1236
    .line 1237
    .line 1238
    const-string v4, "\u545c\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u545c~\u545c\u545c\u545c\u55b5\u55b5\u55b5\u545c\u55b5~\u545c\u545c\u55b5\u55b5\u545c\u545c\u55b5\u55b5"

    .line 1239
    .line 1240
    invoke-static {v4}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 1241
    .line 1242
    .line 1243
    move-result-object v4

    .line 1244
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1245
    .line 1246
    .line 1247
    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1248
    .line 1249
    .line 1250
    const-string v1, "\u545c\u55b5\u55b5\u545c\u55b5\u545c\u545c\u55b5~\u545c\u545c\u545c\u545c\u545c\u545c\u55b5\u545c~\u545c\u545c\u545c\u545c\u545c\u545c\u55b5\u55b5"

    .line 1251
    .line 1252
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 1253
    .line 1254
    .line 1255
    move-result-object v1

    .line 1256
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1257
    .line 1258
    .line 1259
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1260
    .line 1261
    .line 1262
    move-result-object v1

    .line 1263
    invoke-virtual {p0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1264
    .line 1265
    .line 1266
    goto :goto_16

    .line 1267
    :cond_26
    :goto_15
    iget-object v2, p1, L飘花落叶言世哲苏子楪兰/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世苏兰哲;

    .line 1268
    .line 1269
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1270
    .line 1271
    .line 1272
    new-instance v3, Lcom/alibaba/fastjson2/JSONObject;

    .line 1273
    .line 1274
    invoke-direct {v3}, Lcom/alibaba/fastjson2/JSONObject;-><init>()V

    .line 1275
    .line 1276
    .line 1277
    iput-object v3, v2, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Lcom/alibaba/fastjson2/JSONObject;

    .line 1278
    .line 1279
    iget-object v2, p1, L飘花落叶言世哲苏子楪兰/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世苏兰哲;

    .line 1280
    .line 1281
    invoke-static {v5}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 1282
    .line 1283
    .line 1284
    move-result-object v3

    .line 1285
    invoke-static {v10}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 1286
    .line 1287
    .line 1288
    move-result-object v4

    .line 1289
    invoke-virtual {v2, v4, v3}, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1290
    .line 1291
    .line 1292
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 1293
    .line 1294
    .line 1295
    move-result-object v1

    .line 1296
    invoke-virtual {p0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1297
    .line 1298
    .line 1299
    :goto_16
    iget-object p0, p1, L飘花落叶言世哲苏子楪兰/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世苏兰哲;

    .line 1300
    .line 1301
    invoke-static {v5}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 1302
    .line 1303
    .line 1304
    move-result-object v1

    .line 1305
    invoke-virtual {p0, v1}, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Object;

    .line 1306
    .line 1307
    .line 1308
    move-result-object p0

    .line 1309
    check-cast p0, Ljava/lang/String;

    .line 1310
    .line 1311
    iput-object p0, v0, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲:Ljava/lang/String;

    .line 1312
    .line 1313
    new-instance p0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世兰哲苏楪;

    .line 1314
    .line 1315
    const/4 v1, 0x4

    .line 1316
    invoke-direct {p0, p1, v1, v0}, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世兰哲苏楪;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 1317
    .line 1318
    .line 1319
    iput-object p0, v0, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世哲苏:Landroidx/compose/foundation/lazy/layout/飘花落叶言子世兰哲苏楪;

    .line 1320
    .line 1321
    invoke-virtual {v0}, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世哲苏兰;->show()V

    .line 1322
    .line 1323
    .line 1324
    return-void

    .line 1325
    :pswitch_13
    iget-object p1, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1326
    .line 1327
    check-cast p1, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世哲苏兰;

    .line 1328
    .line 1329
    iget-object p0, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 1330
    .line 1331
    check-cast p0, Ljava/lang/String;

    .line 1332
    .line 1333
    iget-object p1, p1, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世哲苏:Landroidx/compose/foundation/lazy/layout/飘花落叶言子世兰哲苏楪;

    .line 1334
    .line 1335
    if-eqz p1, :cond_28

    .line 1336
    .line 1337
    iget-object v0, p1, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1338
    .line 1339
    check-cast v0, L飘花落叶言世哲苏子楪兰/飘花落叶言子世兰苏楪哲;

    .line 1340
    .line 1341
    iget-object p1, p1, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 1342
    .line 1343
    check-cast p1, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世哲苏兰;

    .line 1344
    .line 1345
    iget-object p1, p1, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:Landroid/widget/TextView;

    .line 1346
    .line 1347
    const-string v6, "\u545c\u55b5\u55b5\u545c\u55b5\u545c\u545c\u55b5~\u545c\u545c\u545c\u545c\u55b5\u55b5\u55b5\u55b5~\u545c\u545c\u55b5\u55b5\u545c\u55b5\u55b5\u545c~\u545c\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c~\u545c\u545c\u545c\u545c\u55b5\u55b5\u545c\u55b5~\u545c\u545c\u55b5\u55b5\u55b5\u55b5\u55b5\u545c"

    .line 1348
    .line 1349
    invoke-static {v6}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 1350
    .line 1351
    .line 1352
    move-result-object v6

    .line 1353
    invoke-virtual {p0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1354
    .line 1355
    .line 1356
    move-result v6

    .line 1357
    if-eqz v6, :cond_27

    .line 1358
    .line 1359
    iget-object v2, v0, L飘花落叶言世哲苏子楪兰/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世苏兰哲;

    .line 1360
    .line 1361
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1362
    .line 1363
    .line 1364
    new-instance v3, Lcom/alibaba/fastjson2/JSONObject;

    .line 1365
    .line 1366
    invoke-direct {v3}, Lcom/alibaba/fastjson2/JSONObject;-><init>()V

    .line 1367
    .line 1368
    .line 1369
    iput-object v3, v2, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Lcom/alibaba/fastjson2/JSONObject;

    .line 1370
    .line 1371
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 1372
    .line 1373
    .line 1374
    move-result-object v1

    .line 1375
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1376
    .line 1377
    .line 1378
    const/16 p1, 0x110

    .line 1379
    .line 1380
    invoke-static {p1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 1381
    .line 1382
    .line 1383
    move-result-object p1

    .line 1384
    invoke-static {p1}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 1385
    .line 1386
    .line 1387
    goto/16 :goto_18

    .line 1388
    .line 1389
    :cond_27
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 1390
    .line 1391
    .line 1392
    move-result-object v1

    .line 1393
    const-string v6, "\u545c\u55b5\u55b5\u545c\u55b5\u545c\u545c\u55b5~\u545c\u545c\u55b5\u55b5\u55b5\u545c\u55b5\u545c~\u545c\u545c\u545c\u545c\u55b5\u545c\u55b5\u545c~\u545c\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5~\u545c\u545c\u545c\u545c\u55b5\u55b5\u545c\u55b5~\u545c\u545c\u55b5\u545c\u545c\u55b5\u545c\u55b5"

    .line 1394
    .line 1395
    invoke-static {v6}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 1396
    .line 1397
    .line 1398
    move-result-object v6

    .line 1399
    invoke-virtual {p0, v6}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 1400
    .line 1401
    .line 1402
    move-result v6

    .line 1403
    invoke-virtual {p0, v10, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 1404
    .line 1405
    .line 1406
    move-result-object v6

    .line 1407
    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1408
    .line 1409
    .line 1410
    move-result v6

    .line 1411
    const/16 v7, 0xa

    .line 1412
    .line 1413
    invoke-virtual {v1, v7, v6}, Ljava/util/Calendar;->add(II)V

    .line 1414
    .line 1415
    .line 1416
    iget-object v6, v0, L飘花落叶言世哲苏子楪兰/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世苏兰哲;

    .line 1417
    .line 1418
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 1419
    .line 1420
    .line 1421
    move-result-object v7

    .line 1422
    invoke-virtual {v1}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 1423
    .line 1424
    .line 1425
    move-result-wide v8

    .line 1426
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1427
    .line 1428
    .line 1429
    move-result-object v8

    .line 1430
    invoke-virtual {v6, v8, v7}, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1431
    .line 1432
    .line 1433
    invoke-virtual {v1}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 1434
    .line 1435
    .line 1436
    move-result-wide v6

    .line 1437
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1438
    .line 1439
    .line 1440
    move-result-wide v8

    .line 1441
    sub-long/2addr v6, v8

    .line 1442
    div-long/2addr v6, v3

    .line 1443
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1444
    .line 1445
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1446
    .line 1447
    .line 1448
    const-string v3, "\u545c\u55b5\u55b5\u545c\u55b5\u545c\u545c\u55b5~\u545c\u545c\u545c\u545c\u545c\u545c\u55b5\u55b5~\u545c\u545c\u55b5\u545c\u55b5\u55b5\u545c\u545c~\u545c\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5~\u545c\u545c\u55b5\u545c\u545c\u55b5\u55b5\u55b5~\u545c\u545c\u545c\u545c\u55b5\u545c\u55b5\u545c~\u55b5\u545c\u55b5\u55b5\u55b5\u55b5\u55b5\u545c"

    .line 1449
    .line 1450
    invoke-static {v3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 1451
    .line 1452
    .line 1453
    move-result-object v3

    .line 1454
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1455
    .line 1456
    .line 1457
    invoke-virtual {v1, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1458
    .line 1459
    .line 1460
    const-string v3, "\u545c\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u545c~\u545c\u545c\u545c\u55b5\u55b5\u55b5\u545c\u55b5~\u545c\u545c\u55b5\u55b5\u545c\u545c\u55b5\u55b5"

    .line 1461
    .line 1462
    invoke-static {v3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 1463
    .line 1464
    .line 1465
    move-result-object v3

    .line 1466
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1467
    .line 1468
    .line 1469
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1470
    .line 1471
    .line 1472
    move-result-object v1

    .line 1473
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1474
    .line 1475
    .line 1476
    new-instance p1, Ljava/lang/StringBuilder;

    .line 1477
    .line 1478
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1479
    .line 1480
    .line 1481
    const-string v1, "\u545c\u55b5\u55b5\u545c\u55b5\u545c\u545c\u55b5~\u545c\u545c\u55b5\u55b5\u55b5\u545c\u55b5\u545c~\u545c\u545c\u545c\u545c\u545c\u545c\u55b5\u55b5~\u545c\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c~\u545c\u545c\u545c\u545c\u545c\u55b5\u55b5\u545c~\u545c\u545c\u55b5\u55b5\u55b5\u545c\u55b5\u55b5~\u55b5\u545c\u55b5\u55b5\u55b5\u55b5\u55b5\u545c"

    .line 1482
    .line 1483
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 1484
    .line 1485
    .line 1486
    move-result-object v1

    .line 1487
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1488
    .line 1489
    .line 1490
    new-instance v1, Ljava/util/Date;

    .line 1491
    .line 1492
    iget-object v3, v0, L飘花落叶言世哲苏子楪兰/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世苏兰哲;

    .line 1493
    .line 1494
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 1495
    .line 1496
    .line 1497
    move-result-object v2

    .line 1498
    invoke-virtual {v3, v2}, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Object;

    .line 1499
    .line 1500
    .line 1501
    move-result-object v2

    .line 1502
    check-cast v2, Ljava/lang/Long;

    .line 1503
    .line 1504
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 1505
    .line 1506
    .line 1507
    move-result-wide v2

    .line 1508
    invoke-direct {v1, v2, v3}, Ljava/util/Date;-><init>(J)V

    .line 1509
    .line 1510
    .line 1511
    const/16 v2, 0x111

    .line 1512
    .line 1513
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 1514
    .line 1515
    .line 1516
    move-result-object v2

    .line 1517
    :try_start_3
    new-instance v3, Ljava/text/SimpleDateFormat;

    .line 1518
    .line 1519
    invoke-direct {v3, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 1520
    .line 1521
    .line 1522
    invoke-virtual {v3, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 1523
    .line 1524
    .line 1525
    move-result-object v1
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 1526
    goto :goto_17

    .line 1527
    :catch_1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1528
    .line 1529
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1530
    .line 1531
    .line 1532
    const/16 v3, 0x108

    .line 1533
    .line 1534
    invoke-static {v1, v2, v3}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世兰苏(Ljava/lang/StringBuilder;Ljava/lang/String;I)Ljava/lang/String;

    .line 1535
    .line 1536
    .line 1537
    move-result-object v1

    .line 1538
    :goto_17
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1539
    .line 1540
    .line 1541
    const-string v1, "\u55b5\u545c\u55b5\u545c\u55b5\u55b5\u545c\u545c~\u545c\u55b5\u55b5\u545c\u55b5\u55b5\u545c\u55b5~\u545c\u545c\u55b5\u55b5\u55b5\u55b5\u55b5\u545c~\u545c\u545c\u545c\u545c\u545c\u55b5\u545c\u545c~\u545c\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c~\u545c\u545c\u545c\u545c\u55b5\u55b5\u55b5\u545c~\u545c\u545c\u545c\u545c\u545c\u545c\u545c\u55b5"

    .line 1542
    .line 1543
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 1544
    .line 1545
    .line 1546
    move-result-object v1

    .line 1547
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1548
    .line 1549
    .line 1550
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1551
    .line 1552
    .line 1553
    move-result-object p1

    .line 1554
    invoke-static {p1}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 1555
    .line 1556
    .line 1557
    :goto_18
    iget-object p1, v0, L飘花落叶言世哲苏子楪兰/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世苏兰哲;

    .line 1558
    .line 1559
    invoke-static {v5}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 1560
    .line 1561
    .line 1562
    move-result-object v1

    .line 1563
    invoke-virtual {p1, p0, v1}, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1564
    .line 1565
    .line 1566
    iget-object p0, v0, L飘花落叶言世哲苏子楪兰/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世苏兰哲;

    .line 1567
    .line 1568
    invoke-virtual {p0}, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏()V

    .line 1569
    .line 1570
    .line 1571
    :cond_28
    return-void

    .line 1572
    :pswitch_14
    iget-object p1, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 1573
    .line 1574
    check-cast p1, Ljava/io/File;

    .line 1575
    .line 1576
    iget-object p0, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1577
    .line 1578
    check-cast p0, L飘花落叶言世哲楪苏子兰/飘花落叶言子楪世苏哲兰;

    .line 1579
    .line 1580
    invoke-static {p1}, Lio/ktor/client/plugins/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲苏兰世(Ljava/io/File;)V

    .line 1581
    .line 1582
    .line 1583
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 1584
    .line 1585
    .line 1586
    return-void

    .line 1587
    :pswitch_15
    iget-object p1, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1588
    .line 1589
    check-cast p1, Landroid/app/Dialog;

    .line 1590
    .line 1591
    iget-object p0, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 1592
    .line 1593
    check-cast p0, Landroid/content/Context;

    .line 1594
    .line 1595
    sget-object v0, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲兰苏:Ljava/lang/String;

    .line 1596
    .line 1597
    const/16 v1, 0x224

    .line 1598
    .line 1599
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 1600
    .line 1601
    .line 1602
    move-result-object v1

    .line 1603
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1604
    .line 1605
    .line 1606
    move-result v0

    .line 1607
    if-eqz v0, :cond_29

    .line 1608
    .line 1609
    const/16 p0, 0x225

    .line 1610
    .line 1611
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 1612
    .line 1613
    .line 1614
    move-result-object p0

    .line 1615
    invoke-static {p0}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 1616
    .line 1617
    .line 1618
    goto :goto_19

    .line 1619
    :cond_29
    sget-object v0, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲兰苏:Ljava/lang/String;

    .line 1620
    .line 1621
    invoke-static {p1, p0, v0}, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰(Landroid/app/Dialog;Landroid/content/Context;Ljava/lang/String;)Landroid/widget/ScrollView;

    .line 1622
    .line 1623
    .line 1624
    move-result-object p0

    .line 1625
    invoke-virtual {p1, p0}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 1626
    .line 1627
    .line 1628
    :goto_19
    return-void

    .line 1629
    :pswitch_16
    iget-object p1, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1630
    .line 1631
    check-cast p1, L飘花落叶言世兰楪苏子哲/飘花落叶言子楪兰哲世苏;

    .line 1632
    .line 1633
    iget-object p0, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 1634
    .line 1635
    check-cast p0, L飘花落叶言世兰楪苏子哲/飘花落叶言子楪哲苏兰世;

    .line 1636
    .line 1637
    iget-object p1, p1, L飘花落叶言世兰楪苏子哲/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世兰苏哲:Landroidx/activity/compose/飘花落叶言子楪世哲兰苏;

    .line 1638
    .line 1639
    invoke-virtual {p1, p0}, Landroidx/activity/compose/飘花落叶言子楪世哲兰苏;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1640
    .line 1641
    .line 1642
    return-void

    .line 1643
    :pswitch_17
    iget-object v0, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1644
    .line 1645
    check-cast v0, L飘花落叶言世哲楪苏子兰/飘花落叶言子楪世苏哲兰;

    .line 1646
    .line 1647
    iget-object p0, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 1648
    .line 1649
    check-cast p0, Landroid/view/View$OnClickListener;

    .line 1650
    .line 1651
    invoke-static {v0, p0, p1}, Llin/xposed/hook/view/main/itemview/Update;->飘花落叶言子楪世苏哲兰(L飘花落叶言世哲楪苏子兰/飘花落叶言子楪世苏哲兰;Landroid/view/View$OnClickListener;Landroid/view/View;)V

    .line 1652
    .line 1653
    .line 1654
    return-void

    .line 1655
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
