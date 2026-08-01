.class public final synthetic Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Ljava/io/File;L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏哲兰;)V
    .locals 1

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    iput v0, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p2, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 11
    .line 12
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 13
    iput p2, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:I

    iput-object p1, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    iput-object p3, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:I

    .line 6
    .line 7
    const-wide v9, -0x36a51994051405a7L    # -2.399567778686512E45

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    const-wide v11, -0x36a519a9051405a7L    # -2.3995391949676905E45

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    const-wide/32 v13, 0x36ee80

    .line 18
    .line 19
    .line 20
    const-wide v15, -0x36a5199f051405a7L    # -2.3995528062623673E45

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    const-wide v17, -0x36a51980051405a7L    # -2.3995950012758655E45

    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    const/4 v3, -0x1

    .line 31
    const/4 v4, 0x2

    .line 32
    const-wide v19, -0x36a51976051405a7L    # -2.3996086125705424E45

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    const/4 v5, 0x1

    .line 38
    const/4 v6, 0x0

    .line 39
    const-wide v21, -0x36a5198a051405a7L    # -2.3995813899811887E45

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    const/4 v7, 0x0

    .line 45
    packed-switch v2, :pswitch_data_0

    .line 46
    .line 47
    .line 48
    iget-object v1, v0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v1, L飘花落叶言楪苏子世哲兰/飘花落叶言子楪世苏哲兰;

    .line 51
    .line 52
    iget-object v0, v0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v0, L飘花落叶言苏楪兰哲子世/飘花落叶言子楪世兰苏哲;

    .line 55
    .line 56
    new-instance v2, Landroidx/compose/runtime/internal/飘花落叶言子楪苏兰世哲;

    .line 57
    .line 58
    iget-object v1, v1, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->itemView:Landroid/view/View;

    .line 59
    .line 60
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, L飘花落叶言苏楪兰哲子世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰苏哲()L飘花落叶言苏楪兰哲子世/飘花落叶言子楪世兰苏哲$飘花落叶言子楪世苏哲兰;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    invoke-virtual {v3}, L飘花落叶言苏楪兰哲子世/飘花落叶言子楪世兰苏哲$飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-virtual {v0}, L飘花落叶言苏楪兰哲子世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-direct {v2, v1, v3, v0}, Landroidx/compose/runtime/internal/飘花落叶言子楪苏兰世哲;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 91
    .line 92
    int-to-double v0, v0

    .line 93
    const-wide v5, 0x3fe999999999999aL    # 0.8

    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    mul-double/2addr v0, v5

    .line 99
    double-to-int v0, v0

    .line 100
    iget-object v1, v2, Landroidx/compose/runtime/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世兰苏哲:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v1, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏哲兰世;

    .line 103
    .line 104
    iput v0, v1, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子世苏楪兰哲:I

    .line 105
    .line 106
    invoke-virtual {v1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏哲兰世;->飘花落叶言子世哲兰苏楪()V

    .line 107
    .line 108
    .line 109
    iput-boolean v7, v1, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏哲兰世;->飘花落叶言子苏楪兰世哲:Z

    .line 110
    .line 111
    new-instance v0, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪世兰哲苏;

    .line 112
    .line 113
    invoke-direct {v0, v2}, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪世兰哲苏;-><init>(Landroidx/compose/runtime/internal/飘花落叶言子楪苏兰世哲;)V

    .line 114
    .line 115
    .line 116
    iput-object v0, v1, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏哲兰世;->飘花落叶言子世哲兰苏楪:Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰世哲;

    .line 117
    .line 118
    invoke-virtual {v1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏哲兰世;->飘花落叶言子世哲兰苏楪()V

    .line 119
    .line 120
    .line 121
    new-instance v0, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪世兰苏哲;

    .line 122
    .line 123
    invoke-direct {v0, v2, v4}, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪世兰苏哲;-><init>(Ljava/lang/Object;I)V

    .line 124
    .line 125
    .line 126
    iput-object v0, v1, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏哲兰世;->飘花落叶言子苏世哲楪兰:Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏世兰哲;

    .line 127
    .line 128
    iget-boolean v2, v1, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪苏兰哲:Z

    .line 129
    .line 130
    if-eqz v2, :cond_0

    .line 131
    .line 132
    iget-object v2, v1, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏哲兰世;->飘花落叶言子苏世哲兰楪:L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏哲兰世;

    .line 133
    .line 134
    invoke-virtual {v0, v2}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲(Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;)V

    .line 135
    .line 136
    .line 137
    :cond_0
    invoke-virtual {v1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏哲兰世;->飘花落叶言子世兰楪苏哲()V

    .line 138
    .line 139
    .line 140
    return-void

    .line 141
    :pswitch_0
    iget-object v1, v0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v1, L飘花落叶言苏楪兰哲子世/飘花落叶言子楪世兰苏哲;

    .line 144
    .line 145
    iget-object v0, v0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v0, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世哲兰苏;

    .line 148
    .line 149
    const-string v2, "\u4e0b\u8f7d\u4e2d..."

    .line 150
    .line 151
    invoke-static {v2}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;->飘花落叶言子世兰楪哲苏(Ljava/lang/String;)L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;

    .line 152
    .line 153
    .line 154
    invoke-static {}, Ltop/suzhelan/plugin/sdk/online/net/PluginSdkConfig;->getDOWNLOAD_DIR()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    invoke-virtual {v1}, L飘花落叶言苏楪兰哲子世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰苏哲()L飘花落叶言苏楪兰哲子世/飘花落叶言子楪世兰苏哲$飘花落叶言子楪世苏哲兰;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    invoke-virtual {v3}, L飘花落叶言苏楪兰哲子世/飘花落叶言子楪世兰苏哲$飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    new-instance v4, Ljava/lang/StringBuilder;

    .line 167
    .line 168
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    const-string v2, "/"

    .line 175
    .line 176
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    const-string v2, ".zip"

    .line 183
    .line 184
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    iget-object v3, v0, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰:Ltop/suzhelan/plugin/sdk/online/presenter/飘花落叶言子楪世哲兰苏;

    .line 192
    .line 193
    new-instance v4, L飘花落叶言世苏兰哲子楪/飘花落叶言子世兰楪苏哲;

    .line 194
    .line 195
    const/16 v5, 0xb

    .line 196
    .line 197
    invoke-direct {v4, v0, v5, v2}, L飘花落叶言世苏兰哲子楪/飘花落叶言子世兰楪苏哲;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v3, v1, v2, v4}, Ltop/suzhelan/plugin/sdk/online/presenter/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(L飘花落叶言苏楪兰哲子世/飘花落叶言子楪世兰苏哲;Ljava/lang/String;L飘花落叶言世苏兰哲子楪/飘花落叶言子世兰楪苏哲;)V

    .line 201
    .line 202
    .line 203
    return-void

    .line 204
    :pswitch_1
    iget-object v1, v0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 205
    .line 206
    check-cast v1, L飘花落叶言苏哲世子兰楪/飘花落叶言子楪世苏哲兰;

    .line 207
    .line 208
    iget-object v0, v0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 209
    .line 210
    check-cast v0, Ltop/suzhelan/plugin/sdk/online/entity/Message;

    .line 211
    .line 212
    iget-object v1, v1, L飘花落叶言苏哲世子兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 213
    .line 214
    check-cast v1, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;

    .line 215
    .line 216
    invoke-virtual {v1, v0}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    return-void

    .line 220
    :pswitch_2
    iget-object v1, v0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 221
    .line 222
    check-cast v1, L飘花落叶言苏哲世楪子兰/飘花落叶言子楪苏世兰哲;

    .line 223
    .line 224
    iget-object v0, v0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 225
    .line 226
    check-cast v0, L飘花落叶言苏楪兰哲子世/飘花落叶言子楪世苏哲兰;

    .line 227
    .line 228
    iget-object v1, v1, L飘花落叶言苏哲世楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏哲兰世:Ljava/lang/Object;

    .line 229
    .line 230
    check-cast v1, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世苏楪兰哲;

    .line 231
    .line 232
    invoke-virtual {v1, v0}, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世苏楪兰哲;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    return-void

    .line 236
    :pswitch_3
    iget-object v1, v0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 237
    .line 238
    check-cast v1, Landroidx/compose/runtime/internal/飘花落叶言子楪苏兰世哲;

    .line 239
    .line 240
    iget-object v0, v0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 241
    .line 242
    check-cast v0, L飘花落叶言苏哲世楪子兰/飘花落叶言子楪苏世兰哲;

    .line 243
    .line 244
    const-string v2, "inputEdit"

    .line 245
    .line 246
    iget-object v3, v1, Landroidx/compose/runtime/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲世兰:Ljava/lang/Object;

    .line 247
    .line 248
    check-cast v3, Landroid/widget/EditText;

    .line 249
    .line 250
    if-eqz v3, :cond_8

    .line 251
    .line 252
    invoke-virtual {v3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 253
    .line 254
    .line 255
    move-result-object v3

    .line 256
    if-eqz v3, :cond_3

    .line 257
    .line 258
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    .line 259
    .line 260
    .line 261
    move-result v3

    .line 262
    if-nez v3, :cond_1

    .line 263
    .line 264
    goto :goto_0

    .line 265
    :cond_1
    const-string v3, "\u6b63\u5728\u53d1\u9001"

    .line 266
    .line 267
    invoke-static {v3}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;->飘花落叶言子世兰楪哲苏(Ljava/lang/String;)L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;

    .line 268
    .line 269
    .line 270
    iget-object v3, v1, Landroidx/compose/runtime/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲兰苏:Ljava/lang/Object;

    .line 271
    .line 272
    check-cast v3, Ltop/suzhelan/plugin/sdk/online/presenter/飘花落叶言子楪世苏兰哲;

    .line 273
    .line 274
    iget-object v4, v1, Landroidx/compose/runtime/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲世兰:Ljava/lang/Object;

    .line 275
    .line 276
    check-cast v4, Landroid/widget/EditText;

    .line 277
    .line 278
    if-eqz v4, :cond_2

    .line 279
    .line 280
    invoke-virtual {v4}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 281
    .line 282
    .line 283
    move-result-object v2

    .line 284
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v2

    .line 288
    iget-object v4, v1, Landroidx/compose/runtime/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 289
    .line 290
    check-cast v4, Ljava/lang/String;

    .line 291
    .line 292
    new-instance v5, Landroidx/compose/foundation/飘花落叶言子楪兰苏世哲;

    .line 293
    .line 294
    const/16 v6, 0xe

    .line 295
    .line 296
    invoke-direct {v5, v1, v6, v0}, Landroidx/compose/foundation/飘花落叶言子楪兰苏世哲;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 297
    .line 298
    .line 299
    invoke-virtual {v3, v2, v4, v5}, Ltop/suzhelan/plugin/sdk/online/presenter/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/foundation/飘花落叶言子楪兰苏世哲;)V

    .line 300
    .line 301
    .line 302
    goto :goto_2

    .line 303
    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    throw v6

    .line 307
    :cond_3
    :goto_0
    const-string v0, "\u4f60\u8fd8\u6ca1\u6709\u8f93\u5165\u5185\u5bb9\u54e6"

    .line 308
    .line 309
    invoke-static {}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;->飘花落叶言子世哲兰苏楪()L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;

    .line 310
    .line 311
    .line 312
    move-result-object v1

    .line 313
    if-eqz v1, :cond_6

    .line 314
    .line 315
    sget-object v2, Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;->WARNING:Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;

    .line 316
    .line 317
    iput-object v0, v1, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;->飘花落叶言子世兰苏哲楪:Ljava/lang/CharSequence;

    .line 318
    .line 319
    iget-object v0, v1, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;->飘花落叶言子苏楪哲兰世:Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;

    .line 320
    .line 321
    if-ne v0, v2, :cond_4

    .line 322
    .line 323
    goto :goto_1

    .line 324
    :cond_4
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 325
    .line 326
    .line 327
    move-result v0

    .line 328
    iput v0, v1, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;->飘花落叶言子苏楪世哲兰:I

    .line 329
    .line 330
    iput-object v2, v1, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;->飘花落叶言子苏楪哲兰世:Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;

    .line 331
    .line 332
    invoke-virtual {v1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;->飘花落叶言子世哲兰楪苏()L飘花落叶言楪哲世兰子苏/飘花落叶言子世哲兰苏楪;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    if-eqz v0, :cond_5

    .line 337
    .line 338
    invoke-virtual {v1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;->飘花落叶言子世哲兰楪苏()L飘花落叶言楪哲世兰子苏/飘花落叶言子世哲兰苏楪;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 343
    .line 344
    .line 345
    new-instance v3, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世苏哲兰;

    .line 346
    .line 347
    const/16 v4, 0x11

    .line 348
    .line 349
    invoke-direct {v3, v0, v4, v2}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 350
    .line 351
    .line 352
    invoke-static {v3}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子世苏楪兰哲(Ljava/lang/Runnable;)V

    .line 353
    .line 354
    .line 355
    :cond_5
    :goto_1
    invoke-virtual {v1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;->飘花落叶言子世兰楪苏哲()V

    .line 356
    .line 357
    .line 358
    invoke-virtual {v1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;->飘花落叶言子世哲兰楪苏()L飘花落叶言楪哲世兰子苏/飘花落叶言子世哲兰苏楪;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    if-nez v0, :cond_7

    .line 363
    .line 364
    invoke-virtual {v1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;->飘花落叶言子世兰苏哲楪()V

    .line 365
    .line 366
    .line 367
    goto :goto_2

    .line 368
    :cond_6
    new-instance v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;

    .line 369
    .line 370
    invoke-direct {v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;-><init>()V

    .line 371
    .line 372
    .line 373
    :cond_7
    :goto_2
    return-void

    .line 374
    :cond_8
    invoke-static {v2}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 375
    .line 376
    .line 377
    throw v6

    .line 378
    :pswitch_4
    iget-object v1, v0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 379
    .line 380
    check-cast v1, L飘花落叶言楪苏子世哲兰/飘花落叶言子楪世苏哲兰;

    .line 381
    .line 382
    iget-object v0, v0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 383
    .line 384
    check-cast v0, L飘花落叶言苏哲楪子兰世/飘花落叶言子楪苏兰哲世;

    .line 385
    .line 386
    invoke-virtual {v1}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->getAbsoluteAdapterPosition()I

    .line 387
    .line 388
    .line 389
    move-result v1

    .line 390
    if-eq v1, v3, :cond_11

    .line 391
    .line 392
    iget-object v2, v0, L飘花落叶言楪世兰子哲苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏:Ljava/util/List;

    .line 393
    .line 394
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    move-result-object v2

    .line 398
    instance-of v3, v2, L飘花落叶言苏哲楪子兰世/飘花落叶言子楪哲世兰苏;

    .line 399
    .line 400
    if-eqz v3, :cond_9

    .line 401
    .line 402
    check-cast v2, L飘花落叶言苏哲楪子兰世/飘花落叶言子楪哲世兰苏;

    .line 403
    .line 404
    goto :goto_3

    .line 405
    :cond_9
    move-object v2, v6

    .line 406
    :goto_3
    if-nez v2, :cond_a

    .line 407
    .line 408
    goto :goto_6

    .line 409
    :cond_a
    iget-object v3, v2, L飘花落叶言苏哲楪子兰世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰:Llin/xposed/hook/javaplugin/bean/GroupInfo;

    .line 410
    .line 411
    iget-boolean v2, v2, L飘花落叶言苏哲楪子兰世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲:Z

    .line 412
    .line 413
    if-eqz v2, :cond_b

    .line 414
    .line 415
    goto :goto_6

    .line 416
    :cond_b
    iget-object v8, v3, Llin/xposed/hook/javaplugin/bean/GroupInfo;->GroupUin:Ljava/lang/String;

    .line 417
    .line 418
    iget-object v9, v0, L飘花落叶言苏哲楪子兰世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏兰世哲:Ljava/util/LinkedHashMap;

    .line 419
    .line 420
    invoke-virtual {v9, v8}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object v10

    .line 424
    sget-object v11, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 425
    .line 426
    invoke-static {v10, v11}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 427
    .line 428
    .line 429
    move-result v10

    .line 430
    xor-int/2addr v10, v5

    .line 431
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 432
    .line 433
    .line 434
    move-result-object v10

    .line 435
    invoke-interface {v9, v8, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 436
    .line 437
    .line 438
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪苏世哲兰(I)V

    .line 439
    .line 440
    .line 441
    if-eqz v2, :cond_c

    .line 442
    .line 443
    move v4, v7

    .line 444
    goto :goto_4

    .line 445
    :cond_c
    iget-boolean v1, v3, Llin/xposed/hook/javaplugin/bean/GroupInfo;->IsOwnerOrAdmin:Z

    .line 446
    .line 447
    if-eqz v1, :cond_d

    .line 448
    .line 449
    move v4, v5

    .line 450
    :cond_d
    :goto_4
    iget-object v1, v0, L飘花落叶言楪世兰子哲苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏:Ljava/util/List;

    .line 451
    .line 452
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 453
    .line 454
    .line 455
    move-result-object v1

    .line 456
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 457
    .line 458
    .line 459
    move-result v2

    .line 460
    if-eqz v2, :cond_10

    .line 461
    .line 462
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    move-result-object v2

    .line 466
    add-int/lit8 v3, v7, 0x1

    .line 467
    .line 468
    if-ltz v7, :cond_f

    .line 469
    .line 470
    check-cast v2, L飘花落叶言苏哲楪子兰世/飘花落叶言子楪哲苏世兰;

    .line 471
    .line 472
    instance-of v5, v2, L飘花落叶言苏哲楪子兰世/飘花落叶言子楪哲世苏兰;

    .line 473
    .line 474
    if-eqz v5, :cond_e

    .line 475
    .line 476
    check-cast v2, L飘花落叶言苏哲楪子兰世/飘花落叶言子楪哲世苏兰;

    .line 477
    .line 478
    iget v2, v2, L飘花落叶言苏哲楪子兰世/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰:I

    .line 479
    .line 480
    if-ne v2, v4, :cond_e

    .line 481
    .line 482
    invoke-virtual {v0, v7}, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪苏世哲兰(I)V

    .line 483
    .line 484
    .line 485
    :cond_e
    move v7, v3

    .line 486
    goto :goto_5

    .line 487
    :cond_f
    invoke-static {}, L飘花落叶言楪兰苏哲世子/飘花落叶言子楪世苏哲兰;->飘花落叶言子世苏兰楪哲()V

    .line 488
    .line 489
    .line 490
    throw v6

    .line 491
    :cond_10
    iget-object v0, v0, L飘花落叶言苏哲楪子兰世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲苏世兰:Landroidx/compose/foundation/lazy/飘花落叶言子楪哲世苏兰;

    .line 492
    .line 493
    if-eqz v0, :cond_11

    .line 494
    .line 495
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/飘花落叶言子楪哲世苏兰;->invoke()Ljava/lang/Object;

    .line 496
    .line 497
    .line 498
    :cond_11
    :goto_6
    return-void

    .line 499
    :pswitch_5
    iget-object v1, v0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 500
    .line 501
    check-cast v1, L飘花落叶言楪苏子世哲兰/飘花落叶言子楪世苏哲兰;

    .line 502
    .line 503
    iget-object v0, v0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 504
    .line 505
    check-cast v0, L飘花落叶言苏哲世楪子兰/飘花落叶言子楪苏世兰哲;

    .line 506
    .line 507
    invoke-virtual {v1}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->getAbsoluteAdapterPosition()I

    .line 508
    .line 509
    .line 510
    move-result v1

    .line 511
    if-eq v1, v3, :cond_13

    .line 512
    .line 513
    iget-object v2, v0, L飘花落叶言楪世兰子哲苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏:Ljava/util/List;

    .line 514
    .line 515
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 516
    .line 517
    .line 518
    move-result-object v2

    .line 519
    check-cast v2, Llin/xposed/hook/javaplugin/bean/GroupInfo;

    .line 520
    .line 521
    if-eqz v2, :cond_13

    .line 522
    .line 523
    iget-object v2, v2, Llin/xposed/hook/javaplugin/bean/GroupInfo;->GroupUin:Ljava/lang/String;

    .line 524
    .line 525
    if-nez v2, :cond_12

    .line 526
    .line 527
    goto :goto_7

    .line 528
    :cond_12
    iget-object v3, v0, L飘花落叶言苏哲世楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏哲兰世:Ljava/lang/Object;

    .line 529
    .line 530
    check-cast v3, Ljava/util/LinkedHashMap;

    .line 531
    .line 532
    invoke-virtual {v3, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 533
    .line 534
    .line 535
    move-result-object v4

    .line 536
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 537
    .line 538
    invoke-static {v4, v6}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 539
    .line 540
    .line 541
    move-result v4

    .line 542
    xor-int/2addr v4, v5

    .line 543
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 544
    .line 545
    .line 546
    move-result-object v4

    .line 547
    invoke-interface {v3, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 548
    .line 549
    .line 550
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪苏世哲兰(I)V

    .line 551
    .line 552
    .line 553
    :cond_13
    :goto_7
    return-void

    .line 554
    :pswitch_6
    iget-object v1, v0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 555
    .line 556
    check-cast v1, L飘花落叶言楪苏子世哲兰/飘花落叶言子楪世苏哲兰;

    .line 557
    .line 558
    iget-object v0, v0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 559
    .line 560
    check-cast v0, L飘花落叶言苏哲楪子兰世/飘花落叶言子楪世哲苏兰;

    .line 561
    .line 562
    invoke-virtual {v1}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->getAbsoluteAdapterPosition()I

    .line 563
    .line 564
    .line 565
    move-result v1

    .line 566
    if-eq v1, v3, :cond_19

    .line 567
    .line 568
    iget-object v2, v0, L飘花落叶言楪世兰子哲苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏:Ljava/util/List;

    .line 569
    .line 570
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 571
    .line 572
    .line 573
    move-result-object v2

    .line 574
    instance-of v3, v2, L飘花落叶言苏哲楪子兰世/飘花落叶言子楪世哲兰苏;

    .line 575
    .line 576
    if-eqz v3, :cond_14

    .line 577
    .line 578
    check-cast v2, L飘花落叶言苏哲楪子兰世/飘花落叶言子楪世哲兰苏;

    .line 579
    .line 580
    goto :goto_8

    .line 581
    :cond_14
    move-object v2, v6

    .line 582
    :goto_8
    if-nez v2, :cond_15

    .line 583
    .line 584
    goto :goto_a

    .line 585
    :cond_15
    iget-object v2, v2, L飘花落叶言苏哲楪子兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Ltop/suzhelan/qstory/hook/plugin/entity/NewFriendInfo;

    .line 586
    .line 587
    iget-object v3, v2, Ltop/suzhelan/qstory/hook/plugin/entity/NewFriendInfo;->uin:Ljava/lang/String;

    .line 588
    .line 589
    iget-object v4, v0, L飘花落叶言苏哲楪子兰世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏兰世哲:Ljava/util/LinkedHashMap;

    .line 590
    .line 591
    invoke-virtual {v4, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 592
    .line 593
    .line 594
    move-result-object v8

    .line 595
    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 596
    .line 597
    invoke-static {v8, v9}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 598
    .line 599
    .line 600
    move-result v8

    .line 601
    xor-int/2addr v5, v8

    .line 602
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 603
    .line 604
    .line 605
    move-result-object v5

    .line 606
    invoke-interface {v4, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 607
    .line 608
    .line 609
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪苏世哲兰(I)V

    .line 610
    .line 611
    .line 612
    iget v1, v2, Ltop/suzhelan/qstory/hook/plugin/entity/NewFriendInfo;->categoryId:I

    .line 613
    .line 614
    iget-object v2, v0, L飘花落叶言楪世兰子哲苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏:Ljava/util/List;

    .line 615
    .line 616
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 617
    .line 618
    .line 619
    move-result-object v2

    .line 620
    :goto_9
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 621
    .line 622
    .line 623
    move-result v3

    .line 624
    if-eqz v3, :cond_18

    .line 625
    .line 626
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 627
    .line 628
    .line 629
    move-result-object v3

    .line 630
    add-int/lit8 v4, v7, 0x1

    .line 631
    .line 632
    if-ltz v7, :cond_17

    .line 633
    .line 634
    check-cast v3, L飘花落叶言苏哲楪子兰世/飘花落叶言子楪世兰哲苏;

    .line 635
    .line 636
    instance-of v5, v3, L飘花落叶言苏哲楪子兰世/飘花落叶言子楪世兰苏哲;

    .line 637
    .line 638
    if-eqz v5, :cond_16

    .line 639
    .line 640
    check-cast v3, L飘花落叶言苏哲楪子兰世/飘花落叶言子楪世兰苏哲;

    .line 641
    .line 642
    iget v3, v3, L飘花落叶言苏哲楪子兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:I

    .line 643
    .line 644
    if-ne v3, v1, :cond_16

    .line 645
    .line 646
    invoke-virtual {v0, v7}, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪苏世哲兰(I)V

    .line 647
    .line 648
    .line 649
    :cond_16
    move v7, v4

    .line 650
    goto :goto_9

    .line 651
    :cond_17
    invoke-static {}, L飘花落叶言楪兰苏哲世子/飘花落叶言子楪世苏哲兰;->飘花落叶言子世苏兰楪哲()V

    .line 652
    .line 653
    .line 654
    throw v6

    .line 655
    :cond_18
    iget-object v0, v0, L飘花落叶言苏哲楪子兰世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:Landroidx/compose/foundation/lazy/飘花落叶言子楪哲世苏兰;

    .line 656
    .line 657
    if-eqz v0, :cond_19

    .line 658
    .line 659
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/飘花落叶言子楪哲世苏兰;->invoke()Ljava/lang/Object;

    .line 660
    .line 661
    .line 662
    :cond_19
    :goto_a
    return-void

    .line 663
    :pswitch_7
    iget-object v1, v0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 664
    .line 665
    check-cast v1, L飘花落叶言苏哲世楪子兰/飘花落叶言子楪苏世兰哲;

    .line 666
    .line 667
    iget-object v0, v0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 668
    .line 669
    check-cast v0, Ljava/io/File;

    .line 670
    .line 671
    iget-object v1, v1, L飘花落叶言苏哲世楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏哲兰世:Ljava/lang/Object;

    .line 672
    .line 673
    check-cast v1, L飘花落叶言世苏兰哲子楪/飘花落叶言子世兰楪苏哲;

    .line 674
    .line 675
    invoke-virtual {v1, v0}, L飘花落叶言世苏兰哲子楪/飘花落叶言子世兰楪苏哲;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 676
    .line 677
    .line 678
    return-void

    .line 679
    :pswitch_8
    iget-object v1, v0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 680
    .line 681
    check-cast v1, L飘花落叶言苏哲世子兰楪/飘花落叶言子楪世苏哲兰;

    .line 682
    .line 683
    iget-object v0, v0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 684
    .line 685
    check-cast v0, Ltop/suzhelan/sticker/sdk/entity/OnlineStickerInfo;

    .line 686
    .line 687
    iget-object v1, v1, L飘花落叶言苏哲世子兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 688
    .line 689
    if-eqz v1, :cond_1a

    .line 690
    .line 691
    invoke-interface {v1, v0}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 692
    .line 693
    .line 694
    :cond_1a
    return-void

    .line 695
    :pswitch_9
    iget-object v1, v0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 696
    .line 697
    check-cast v1, Landroid/widget/TextView;

    .line 698
    .line 699
    iget-object v0, v0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 700
    .line 701
    check-cast v0, Ljava/lang/String;

    .line 702
    .line 703
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 704
    .line 705
    .line 706
    move-result-object v1

    .line 707
    const-wide v2, -0x36a502c5051405a7L    # -2.4075154136483173E45

    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 713
    .line 714
    .line 715
    move-result-object v2

    .line 716
    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 717
    .line 718
    .line 719
    move-result-object v1

    .line 720
    const-wide v2, -0x36a5d8d9051405a7L    # -2.3329200743013768E45

    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 726
    .line 727
    .line 728
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 729
    .line 730
    .line 731
    check-cast v1, Landroid/content/ClipboardManager;

    .line 732
    .line 733
    const-wide v2, -0x36a5d887051405a7L    # -2.333031686917727E45

    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 739
    .line 740
    .line 741
    move-result-object v2

    .line 742
    invoke-static {v2, v0}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    .line 743
    .line 744
    .line 745
    move-result-object v0

    .line 746
    invoke-virtual {v1, v0}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 747
    .line 748
    .line 749
    const-wide v0, -0x36a5d871051405a7L    # -2.333061631766016E45

    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 755
    .line 756
    .line 757
    move-result-object v0

    .line 758
    invoke-static {v0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 759
    .line 760
    .line 761
    return-void

    .line 762
    :pswitch_a
    iget-object v1, v0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 763
    .line 764
    check-cast v1, L飘花落叶言苏哲楪子兰世/飘花落叶言子楪苏哲兰世;

    .line 765
    .line 766
    iget-object v0, v0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 767
    .line 768
    check-cast v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲苏世兰;

    .line 769
    .line 770
    sget-object v2, Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏:Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世哲苏兰;

    .line 771
    .line 772
    invoke-virtual {v1}, L飘花落叶言苏哲楪子兰世/飘花落叶言子楪苏哲兰世;->飘花落叶言子世楪苏兰哲()Ljava/util/ArrayList;

    .line 773
    .line 774
    .line 775
    move-result-object v1

    .line 776
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 777
    .line 778
    .line 779
    invoke-static {v1}, Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏(Ljava/util/ArrayList;)V

    .line 780
    .line 781
    .line 782
    invoke-static {v2}, Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世哲苏兰;)V

    .line 783
    .line 784
    .line 785
    const-wide v1, -0x36a5d8d7051405a7L    # -2.3329227965603122E45

    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 791
    .line 792
    .line 793
    move-result-object v1

    .line 794
    invoke-static {v1}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 795
    .line 796
    .line 797
    if-eqz v0, :cond_1b

    .line 798
    .line 799
    invoke-virtual {v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲苏世兰;->飘花落叶言子世哲苏兰楪()V

    .line 800
    .line 801
    .line 802
    :cond_1b
    return-void

    .line 803
    :pswitch_b
    iget-object v1, v0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 804
    .line 805
    check-cast v1, Ljava/util/List;

    .line 806
    .line 807
    iget-object v0, v0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 808
    .line 809
    check-cast v0, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪兰世哲苏;

    .line 810
    .line 811
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 812
    .line 813
    .line 814
    move-result-object v1

    .line 815
    :goto_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 816
    .line 817
    .line 818
    move-result v2

    .line 819
    if-eqz v2, :cond_1d

    .line 820
    .line 821
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 822
    .line 823
    .line 824
    move-result-object v2

    .line 825
    check-cast v2, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪兰世哲苏;

    .line 826
    .line 827
    iget-object v3, v2, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲:Ltop/suzhelan/qstory/ui/views/CustomMaterialCheckBox;

    .line 828
    .line 829
    if-ne v2, v0, :cond_1c

    .line 830
    .line 831
    move v2, v5

    .line 832
    goto :goto_c

    .line 833
    :cond_1c
    move v2, v7

    .line 834
    :goto_c
    invoke-virtual {v3, v2}, Ltop/suzhelan/qstory/ui/views/CustomMaterialCheckBox;->setChecked(Z)V

    .line 835
    .line 836
    .line 837
    goto :goto_b

    .line 838
    :cond_1d
    return-void

    .line 839
    :pswitch_c
    iget-object v1, v0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 840
    .line 841
    check-cast v1, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪苏兰哲世;

    .line 842
    .line 843
    iget-object v0, v0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 844
    .line 845
    check-cast v0, Ljava/io/File;

    .line 846
    .line 847
    iget-object v1, v1, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世兰苏哲:L飘花落叶言苏世兰哲子楪/飘花落叶言子楪苏世兰哲;

    .line 848
    .line 849
    invoke-virtual {v1, v0}, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪苏世兰哲;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 850
    .line 851
    .line 852
    return-void

    .line 853
    :pswitch_d
    iget-object v1, v0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 854
    .line 855
    check-cast v1, Ltop/suzhelan/qstory/ui/views/DialogXRecycleView;

    .line 856
    .line 857
    iget-object v0, v0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 858
    .line 859
    check-cast v0, Landroid/widget/ImageView;

    .line 860
    .line 861
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 862
    .line 863
    .line 864
    move-result v2

    .line 865
    const/16 v3, 0x8

    .line 866
    .line 867
    if-ne v2, v3, :cond_1e

    .line 868
    .line 869
    invoke-virtual {v1, v7}, Landroid/view/View;->setVisibility(I)V

    .line 870
    .line 871
    .line 872
    const v1, 0x1080003

    .line 873
    .line 874
    .line 875
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 876
    .line 877
    .line 878
    goto :goto_d

    .line 879
    :cond_1e
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 880
    .line 881
    .line 882
    const v1, 0x1080002

    .line 883
    .line 884
    .line 885
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 886
    .line 887
    .line 888
    :goto_d
    return-void

    .line 889
    :pswitch_e
    iget-object v2, v0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 890
    .line 891
    check-cast v2, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 892
    .line 893
    iget-object v0, v0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 894
    .line 895
    check-cast v0, L飘花落叶言楪世兰子哲苏/飘花落叶言子楪苏世哲兰;

    .line 896
    .line 897
    invoke-virtual {v2}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->getBindingAdapterPosition()I

    .line 898
    .line 899
    .line 900
    move-result v2

    .line 901
    if-ne v2, v3, :cond_1f

    .line 902
    .line 903
    goto :goto_e

    .line 904
    :cond_1f
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 905
    .line 906
    .line 907
    iget-object v3, v0, L飘花落叶言楪世兰子哲苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰苏哲:L飘花落叶言楪世兰子哲苏/飘花落叶言子楪世哲兰苏;

    .line 908
    .line 909
    if-eqz v3, :cond_20

    .line 910
    .line 911
    invoke-interface {v3, v0, v1, v2}, L飘花落叶言楪世兰子哲苏/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰(L飘花落叶言楪世兰子哲苏/飘花落叶言子楪苏世哲兰;Landroid/view/View;I)V

    .line 912
    .line 913
    .line 914
    :cond_20
    :goto_e
    return-void

    .line 915
    :pswitch_f
    iget-object v1, v0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 916
    .line 917
    check-cast v1, Ljava/io/File;

    .line 918
    .line 919
    iget-object v0, v0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 920
    .line 921
    check-cast v0, L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏哲兰;

    .line 922
    .line 923
    invoke-static {v1}, Landroidx/compose/foundation/draganddrop/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世苏兰(Ljava/io/File;)V

    .line 924
    .line 925
    .line 926
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 927
    .line 928
    .line 929
    return-void

    .line 930
    :pswitch_10
    iget-object v1, v0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 931
    .line 932
    check-cast v1, Landroid/app/Dialog;

    .line 933
    .line 934
    iget-object v0, v0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 935
    .line 936
    check-cast v0, Landroid/content/Context;

    .line 937
    .line 938
    sget-object v2, L飘花落叶言世哲苏兰楪子/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲兰苏:Ljava/lang/String;

    .line 939
    .line 940
    const-wide v3, -0x36a53d89051405a7L    # -2.387038581936483E45

    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 946
    .line 947
    .line 948
    move-result-object v3

    .line 949
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 950
    .line 951
    .line 952
    move-result v2

    .line 953
    if-eqz v2, :cond_21

    .line 954
    .line 955
    const-wide v0, -0x36a53d7b051405a7L    # -2.3870576377490305E45

    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 961
    .line 962
    .line 963
    move-result-object v0

    .line 964
    invoke-static {v0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 965
    .line 966
    .line 967
    goto :goto_f

    .line 968
    :cond_21
    sget-object v2, L飘花落叶言世哲苏兰楪子/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲兰苏:Ljava/lang/String;

    .line 969
    .line 970
    invoke-static {v1, v0, v2}, L飘花落叶言世哲苏兰楪子/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰(Landroid/app/Dialog;Landroid/content/Context;Ljava/lang/String;)Landroid/widget/ScrollView;

    .line 971
    .line 972
    .line 973
    move-result-object v0

    .line 974
    invoke-virtual {v1, v0}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 975
    .line 976
    .line 977
    :goto_f
    return-void

    .line 978
    :pswitch_11
    iget-object v1, v0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 979
    .line 980
    check-cast v1, L飘花落叶言世哲楪苏子兰/飘花落叶言子苏楪世哲兰;

    .line 981
    .line 982
    iget-object v0, v0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 983
    .line 984
    check-cast v0, Landroid/widget/ImageView;

    .line 985
    .line 986
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 987
    .line 988
    .line 989
    move-result-object v0

    .line 990
    check-cast v0, Landroid/app/Activity;

    .line 991
    .line 992
    new-instance v2, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;

    .line 993
    .line 994
    const-wide v3, -0x36a519c5051405a7L    # -2.3995010833425953E45

    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1000
    .line 1001
    .line 1002
    move-result-object v3

    .line 1003
    invoke-direct {v2, v3}, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/String;)V

    .line 1004
    .line 1005
    .line 1006
    iput-object v2, v1, L飘花落叶言世哲楪苏子兰/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;

    .line 1007
    .line 1008
    new-instance v2, L飘花落叶言世哲子苏兰楪/飘花落叶言子楪世哲苏兰;

    .line 1009
    .line 1010
    const-wide v3, -0x36a519bf051405a7L    # -2.3995092501194014E45

    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1016
    .line 1017
    .line 1018
    move-result-object v3

    .line 1019
    const-wide v4, -0x36a519a4051405a7L    # -2.399546000615029E45

    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1025
    .line 1026
    .line 1027
    move-result-object v4

    .line 1028
    const-wide v5, -0x36a519a1051405a7L    # -2.399550084003432E45

    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1034
    .line 1035
    .line 1036
    move-result-object v5

    .line 1037
    const-wide v6, -0x36a519ad051405a7L    # -2.3995337504498197E45

    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    invoke-static {v6, v7}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1043
    .line 1044
    .line 1045
    move-result-object v6

    .line 1046
    invoke-static {v11, v12}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1047
    .line 1048
    .line 1049
    move-result-object v7

    .line 1050
    filled-new-array {v3, v4, v5, v6, v7}, [Ljava/lang/String;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v3

    .line 1054
    invoke-direct {v2, v0, v3}, L飘花落叶言世哲子苏兰楪/飘花落叶言子楪世哲苏兰;-><init>(Landroid/app/Activity;[Ljava/lang/String;)V

    .line 1055
    .line 1056
    .line 1057
    iget-object v0, v2, L飘花落叶言世哲子苏兰楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:Landroid/widget/TextView;

    .line 1058
    .line 1059
    iget-object v3, v1, L飘花落叶言世哲楪苏子兰/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;

    .line 1060
    .line 1061
    invoke-static {v9, v10}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v4

    .line 1065
    invoke-virtual {v3, v4}, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Object;

    .line 1066
    .line 1067
    .line 1068
    move-result-object v3

    .line 1069
    check-cast v3, Ljava/lang/Long;

    .line 1070
    .line 1071
    new-instance v4, Ljava/util/Date;

    .line 1072
    .line 1073
    invoke-direct {v4}, Ljava/util/Date;-><init>()V

    .line 1074
    .line 1075
    .line 1076
    if-eqz v3, :cond_23

    .line 1077
    .line 1078
    invoke-virtual {v4}, Ljava/util/Date;->getTime()J

    .line 1079
    .line 1080
    .line 1081
    move-result-wide v5

    .line 1082
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 1083
    .line 1084
    .line 1085
    move-result-wide v7

    .line 1086
    cmp-long v5, v5, v7

    .line 1087
    .line 1088
    if-lez v5, :cond_22

    .line 1089
    .line 1090
    goto :goto_10

    .line 1091
    :cond_22
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 1092
    .line 1093
    .line 1094
    move-result-wide v5

    .line 1095
    invoke-virtual {v4}, Ljava/util/Date;->getTime()J

    .line 1096
    .line 1097
    .line 1098
    move-result-wide v3

    .line 1099
    sub-long/2addr v5, v3

    .line 1100
    div-long v3, v5, v13

    .line 1101
    .line 1102
    mul-long/2addr v13, v3

    .line 1103
    sub-long/2addr v5, v13

    .line 1104
    const-wide/32 v7, 0xea60

    .line 1105
    .line 1106
    .line 1107
    div-long/2addr v5, v7

    .line 1108
    new-instance v7, Ljava/lang/StringBuilder;

    .line 1109
    .line 1110
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 1111
    .line 1112
    .line 1113
    invoke-static/range {v21 .. v22}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1114
    .line 1115
    .line 1116
    move-result-object v8

    .line 1117
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1118
    .line 1119
    .line 1120
    invoke-virtual {v7, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1121
    .line 1122
    .line 1123
    invoke-static/range {v19 .. v20}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1124
    .line 1125
    .line 1126
    move-result-object v3

    .line 1127
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1128
    .line 1129
    .line 1130
    invoke-virtual {v7, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1131
    .line 1132
    .line 1133
    const-wide v3, -0x36a51970051405a7L    # -2.3996167793473485E45

    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1139
    .line 1140
    .line 1141
    move-result-object v3

    .line 1142
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1143
    .line 1144
    .line 1145
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1146
    .line 1147
    .line 1148
    move-result-object v3

    .line 1149
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1150
    .line 1151
    .line 1152
    goto :goto_11

    .line 1153
    :cond_23
    :goto_10
    iget-object v3, v1, L飘花落叶言世哲楪苏子兰/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;

    .line 1154
    .line 1155
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1156
    .line 1157
    .line 1158
    new-instance v4, Lcom/alibaba/fastjson2/JSONObject;

    .line 1159
    .line 1160
    invoke-direct {v4}, Lcom/alibaba/fastjson2/JSONObject;-><init>()V

    .line 1161
    .line 1162
    .line 1163
    iput-object v4, v3, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Lcom/alibaba/fastjson2/JSONObject;

    .line 1164
    .line 1165
    iget-object v3, v1, L飘花落叶言世哲楪苏子兰/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;

    .line 1166
    .line 1167
    invoke-static/range {v15 .. v16}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1168
    .line 1169
    .line 1170
    move-result-object v4

    .line 1171
    invoke-static {v11, v12}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1172
    .line 1173
    .line 1174
    move-result-object v5

    .line 1175
    invoke-virtual {v3, v5, v4}, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1176
    .line 1177
    .line 1178
    invoke-static/range {v17 .. v18}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1179
    .line 1180
    .line 1181
    move-result-object v3

    .line 1182
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1183
    .line 1184
    .line 1185
    :goto_11
    iget-object v0, v1, L飘花落叶言世哲楪苏子兰/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;

    .line 1186
    .line 1187
    invoke-static/range {v15 .. v16}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1188
    .line 1189
    .line 1190
    move-result-object v3

    .line 1191
    invoke-virtual {v0, v3}, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Object;

    .line 1192
    .line 1193
    .line 1194
    move-result-object v0

    .line 1195
    check-cast v0, Ljava/lang/String;

    .line 1196
    .line 1197
    iput-object v0, v2, L飘花落叶言世哲子苏兰楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲:Ljava/lang/String;

    .line 1198
    .line 1199
    new-instance v0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世兰哲苏楪;

    .line 1200
    .line 1201
    const/4 v3, 0x5

    .line 1202
    invoke-direct {v0, v1, v3, v2}, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世兰哲苏楪;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 1203
    .line 1204
    .line 1205
    iput-object v0, v2, L飘花落叶言世哲子苏兰楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世哲苏:Landroidx/compose/foundation/lazy/layout/飘花落叶言子世兰哲苏楪;

    .line 1206
    .line 1207
    invoke-virtual {v2}, L飘花落叶言世哲子苏兰楪/飘花落叶言子楪世哲苏兰;->show()V

    .line 1208
    .line 1209
    .line 1210
    return-void

    .line 1211
    :pswitch_12
    iget-object v1, v0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1212
    .line 1213
    check-cast v1, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏兰世哲;

    .line 1214
    .line 1215
    iget-object v0, v0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 1216
    .line 1217
    check-cast v0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏世兰哲;

    .line 1218
    .line 1219
    iget v2, v0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:I

    .line 1220
    .line 1221
    if-ne v2, v4, :cond_24

    .line 1222
    .line 1223
    goto/16 :goto_14

    .line 1224
    .line 1225
    :cond_24
    invoke-static {}, L飘花落叶言世子哲苏兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪苏兰哲()Z

    .line 1226
    .line 1227
    .line 1228
    move-result v2

    .line 1229
    const-wide v3, -0x36a5212f051405a7L    # -2.3969176596129316E45

    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    if-eqz v2, :cond_25

    .line 1235
    .line 1236
    iget-object v0, v0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 1237
    .line 1238
    invoke-static {v0}, Llin/xposed/hook/util/qq/CreateElement;->createEmojiElement(Ljava/lang/String;)Ljava/lang/Object;

    .line 1239
    .line 1240
    .line 1241
    move-result-object v0

    .line 1242
    const-wide v8, -0x36a51930051405a7L    # -2.3997038916332802E45

    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    :try_start_0
    invoke-static {v8, v9}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1248
    .line 1249
    .line 1250
    move-result-object v2

    .line 1251
    const-wide v8, -0x36a5144f051405a7L    # -2.4014039423384172E45

    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    invoke-static {v8, v9}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1257
    .line 1258
    .line 1259
    move-result-object v5

    .line 1260
    invoke-static {v5}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 1261
    .line 1262
    .line 1263
    move-result-object v5

    .line 1264
    invoke-static {v5, v2, v0}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1265
    .line 1266
    .line 1267
    move-result-object v2

    .line 1268
    const-wide v8, -0x36a517ec051405a7L    # -2.4001448975808098E45

    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    invoke-static {v8, v9}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1274
    .line 1275
    .line 1276
    move-result-object v5

    .line 1277
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1278
    .line 1279
    .line 1280
    move-result-object v3

    .line 1281
    invoke-static {v2, v5, v3}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 1282
    .line 1283
    .line 1284
    const-wide v3, -0x36a517c7051405a7L    # -2.400195259371114E45

    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1290
    .line 1291
    .line 1292
    move-result-object v3

    .line 1293
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1294
    .line 1295
    .line 1296
    move-result-object v4

    .line 1297
    invoke-static {v2, v3, v4}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1298
    .line 1299
    .line 1300
    new-instance v2, Ljava/util/ArrayList;

    .line 1301
    .line 1302
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1303
    .line 1304
    .line 1305
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1306
    .line 1307
    .line 1308
    invoke-static {}, Llin/xposed/hook/util/qq/QQSessionUtils;->getCurrentContact()Ljava/lang/Object;

    .line 1309
    .line 1310
    .line 1311
    move-result-object v0

    .line 1312
    invoke-static {v0, v2}, Llin/xposed/hook/util/qq/QQNTSendMsgUtils;->sendMsg(Ljava/lang/Object;Ljava/util/ArrayList;)V

    .line 1313
    .line 1314
    .line 1315
    goto :goto_12

    .line 1316
    :catch_0
    move-exception v0

    .line 1317
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏哲世兰(Ljava/lang/Throwable;)V

    .line 1318
    .line 1319
    .line 1320
    goto :goto_14

    .line 1321
    :cond_25
    invoke-static {}, Llin/xposed/hook/util/qq/QQSessionUtils;->getCurrentSessionInfo()Ljava/lang/Object;

    .line 1322
    .line 1323
    .line 1324
    move-result-object v2

    .line 1325
    iget-object v0, v0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 1326
    .line 1327
    invoke-static {v2, v0}, Llin/xposed/hook/util/qq/LegacyQQSendTool$MsgBuilder;->builderPic(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 1328
    .line 1329
    .line 1330
    move-result-object v0

    .line 1331
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1332
    .line 1333
    .line 1334
    move-result-object v2

    .line 1335
    invoke-static {v0, v2}, Llin/xposed/hook/util/qq/LegacyQQSendTool;->setPicText(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1336
    .line 1337
    .line 1338
    invoke-static {}, Llin/xposed/hook/util/qq/QQSessionUtils;->getCurrentSessionInfo()Ljava/lang/Object;

    .line 1339
    .line 1340
    .line 1341
    move-result-object v2

    .line 1342
    invoke-static {v2, v0}, Llin/xposed/hook/util/qq/LegacyQQSendTool;->sendPic(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1343
    .line 1344
    .line 1345
    :goto_12
    iget-object v0, v1, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲世兰:L飘花落叶言世哲楪兰子苏/飘花落叶言子楪哲世苏兰;

    .line 1346
    .line 1347
    invoke-virtual {v0, v7}, Landroid/view/View;->setClickable(Z)V

    .line 1348
    .line 1349
    .line 1350
    iget-object v0, v1, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲世兰:L飘花落叶言世哲楪兰子苏/飘花落叶言子楪哲世苏兰;

    .line 1351
    .line 1352
    invoke-virtual {v0, v6}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 1353
    .line 1354
    .line 1355
    sget-object v0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 1356
    .line 1357
    const-class v2, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏哲世兰;

    .line 1358
    .line 1359
    monitor-enter v2

    .line 1360
    :try_start_1
    sget-object v0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言世哲楪兰子苏/飘花落叶言子楪哲世苏兰;

    .line 1361
    .line 1362
    if-eqz v0, :cond_26

    .line 1363
    .line 1364
    invoke-virtual {v0}, Lcom/lxj/xpopup/core/飘花落叶言子楪苏世兰哲;->dismiss()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1365
    .line 1366
    .line 1367
    goto :goto_13

    .line 1368
    :catchall_0
    move-exception v0

    .line 1369
    goto :goto_15

    .line 1370
    :cond_26
    :goto_13
    monitor-exit v2

    .line 1371
    :goto_14
    return-void

    .line 1372
    :goto_15
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 1373
    throw v0

    .line 1374
    :pswitch_13
    iget-object v2, v0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1375
    .line 1376
    check-cast v2, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪哲世苏兰;

    .line 1377
    .line 1378
    iget-object v0, v0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 1379
    .line 1380
    check-cast v0, Ljava/lang/String;

    .line 1381
    .line 1382
    sput v7, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰哲世苏:I

    .line 1383
    .line 1384
    invoke-virtual {v2, v0}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)V

    .line 1385
    .line 1386
    .line 1387
    iget-object v0, v2, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲苏兰世:Ljava/util/ArrayList;

    .line 1388
    .line 1389
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1390
    .line 1391
    .line 1392
    move-result-object v0

    .line 1393
    :goto_16
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1394
    .line 1395
    .line 1396
    move-result v3

    .line 1397
    if-eqz v3, :cond_27

    .line 1398
    .line 1399
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1400
    .line 1401
    .line 1402
    move-result-object v3

    .line 1403
    check-cast v3, Landroid/view/View;

    .line 1404
    .line 1405
    invoke-virtual {v2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1406
    .line 1407
    .line 1408
    move-result-object v4

    .line 1409
    const v5, 0x24060030

    .line 1410
    .line 1411
    .line 1412
    invoke-virtual {v4, v5, v6}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    .line 1413
    .line 1414
    .line 1415
    move-result v4

    .line 1416
    invoke-virtual {v3, v4}, Landroid/view/View;->setBackgroundColor(I)V

    .line 1417
    .line 1418
    .line 1419
    goto :goto_16

    .line 1420
    :cond_27
    invoke-virtual {v2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1421
    .line 1422
    .line 1423
    move-result-object v0

    .line 1424
    const v2, 0x2408012f

    .line 1425
    .line 1426
    .line 1427
    invoke-virtual {v0, v2, v6}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 1428
    .line 1429
    .line 1430
    move-result-object v0

    .line 1431
    invoke-virtual {v1, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1432
    .line 1433
    .line 1434
    return-void

    .line 1435
    :pswitch_14
    iget-object v1, v0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1436
    .line 1437
    check-cast v1, Landroid/content/Context;

    .line 1438
    .line 1439
    iget-object v0, v0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 1440
    .line 1441
    check-cast v0, Landroid/widget/RadioGroup;

    .line 1442
    .line 1443
    new-instance v2, Landroid/widget/EditText;

    .line 1444
    .line 1445
    invoke-direct {v2, v1}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 1446
    .line 1447
    .line 1448
    new-instance v3, Landroid/app/AlertDialog$Builder;

    .line 1449
    .line 1450
    invoke-static {v1}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲兰苏(Landroid/content/Context;)Z

    .line 1451
    .line 1452
    .line 1453
    move-result v6

    .line 1454
    if-eqz v6, :cond_28

    .line 1455
    .line 1456
    goto :goto_17

    .line 1457
    :cond_28
    const/4 v4, 0x3

    .line 1458
    :goto_17
    invoke-direct {v3, v1, v4}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;I)V

    .line 1459
    .line 1460
    .line 1461
    const-wide v6, -0x36a52134051405a7L    # -2.396910853965593E45

    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    invoke-static {v6, v7}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1467
    .line 1468
    .line 1469
    move-result-object v4

    .line 1470
    invoke-virtual {v3, v4}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 1471
    .line 1472
    .line 1473
    move-result-object v3

    .line 1474
    invoke-virtual {v3, v2}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 1475
    .line 1476
    .line 1477
    move-result-object v3

    .line 1478
    const-wide v6, -0x36a52132051405a7L    # -2.3969135762245285E45

    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    invoke-static {v6, v7}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1484
    .line 1485
    .line 1486
    move-result-object v4

    .line 1487
    new-instance v6, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪世兰哲苏;

    .line 1488
    .line 1489
    invoke-direct {v6, v2, v0, v1, v5}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪世兰哲苏;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1490
    .line 1491
    .line 1492
    invoke-virtual {v3, v4, v6}, Landroid/app/AlertDialog$Builder;->setNeutralButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 1493
    .line 1494
    .line 1495
    move-result-object v0

    .line 1496
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 1497
    .line 1498
    .line 1499
    return-void

    .line 1500
    :pswitch_15
    iget-object v1, v0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1501
    .line 1502
    check-cast v1, L飘花落叶言世哲子苏兰楪/飘花落叶言子楪世哲苏兰;

    .line 1503
    .line 1504
    iget-object v0, v0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 1505
    .line 1506
    check-cast v0, Ljava/lang/String;

    .line 1507
    .line 1508
    iget-object v1, v1, L飘花落叶言世哲子苏兰楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世哲苏:Landroidx/compose/foundation/lazy/layout/飘花落叶言子世兰哲苏楪;

    .line 1509
    .line 1510
    if-eqz v1, :cond_2a

    .line 1511
    .line 1512
    iget-object v2, v1, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1513
    .line 1514
    check-cast v2, L飘花落叶言世哲楪苏子兰/飘花落叶言子苏楪世哲兰;

    .line 1515
    .line 1516
    iget-object v1, v1, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 1517
    .line 1518
    check-cast v1, L飘花落叶言世哲子苏兰楪/飘花落叶言子楪世哲苏兰;

    .line 1519
    .line 1520
    iget-object v1, v1, L飘花落叶言世哲子苏兰楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:Landroid/widget/TextView;

    .line 1521
    .line 1522
    invoke-static {v11, v12}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1523
    .line 1524
    .line 1525
    move-result-object v3

    .line 1526
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1527
    .line 1528
    .line 1529
    move-result v3

    .line 1530
    if-eqz v3, :cond_29

    .line 1531
    .line 1532
    iget-object v3, v2, L飘花落叶言世哲楪苏子兰/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;

    .line 1533
    .line 1534
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1535
    .line 1536
    .line 1537
    new-instance v4, Lcom/alibaba/fastjson2/JSONObject;

    .line 1538
    .line 1539
    invoke-direct {v4}, Lcom/alibaba/fastjson2/JSONObject;-><init>()V

    .line 1540
    .line 1541
    .line 1542
    iput-object v4, v3, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Lcom/alibaba/fastjson2/JSONObject;

    .line 1543
    .line 1544
    invoke-static/range {v17 .. v18}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1545
    .line 1546
    .line 1547
    move-result-object v3

    .line 1548
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1549
    .line 1550
    .line 1551
    const-wide v3, -0x36a51952051405a7L    # -2.399657613231379E45

    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1557
    .line 1558
    .line 1559
    move-result-object v1

    .line 1560
    invoke-static {v1}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 1561
    .line 1562
    .line 1563
    goto/16 :goto_19

    .line 1564
    .line 1565
    :cond_29
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 1566
    .line 1567
    .line 1568
    move-result-object v3

    .line 1569
    const-wide v4, -0x36a51959051405a7L    # -2.3996480853251052E45

    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1575
    .line 1576
    .line 1577
    move-result-object v4

    .line 1578
    invoke-virtual {v0, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 1579
    .line 1580
    .line 1581
    move-result v4

    .line 1582
    invoke-virtual {v0, v7, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 1583
    .line 1584
    .line 1585
    move-result-object v4

    .line 1586
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1587
    .line 1588
    .line 1589
    move-result v4

    .line 1590
    const/16 v5, 0xa

    .line 1591
    .line 1592
    invoke-virtual {v3, v5, v4}, Ljava/util/Calendar;->add(II)V

    .line 1593
    .line 1594
    .line 1595
    iget-object v4, v2, L飘花落叶言世哲楪苏子兰/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;

    .line 1596
    .line 1597
    invoke-static {v9, v10}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1598
    .line 1599
    .line 1600
    move-result-object v5

    .line 1601
    invoke-virtual {v3}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 1602
    .line 1603
    .line 1604
    move-result-wide v6

    .line 1605
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1606
    .line 1607
    .line 1608
    move-result-object v6

    .line 1609
    invoke-virtual {v4, v6, v5}, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1610
    .line 1611
    .line 1612
    invoke-virtual {v3}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 1613
    .line 1614
    .line 1615
    move-result-wide v3

    .line 1616
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1617
    .line 1618
    .line 1619
    move-result-wide v5

    .line 1620
    sub-long/2addr v3, v5

    .line 1621
    div-long/2addr v3, v13

    .line 1622
    new-instance v5, Ljava/lang/StringBuilder;

    .line 1623
    .line 1624
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 1625
    .line 1626
    .line 1627
    invoke-static/range {v21 .. v22}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1628
    .line 1629
    .line 1630
    move-result-object v6

    .line 1631
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1632
    .line 1633
    .line 1634
    invoke-virtual {v5, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1635
    .line 1636
    .line 1637
    invoke-static/range {v19 .. v20}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1638
    .line 1639
    .line 1640
    move-result-object v3

    .line 1641
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1642
    .line 1643
    .line 1644
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1645
    .line 1646
    .line 1647
    move-result-object v3

    .line 1648
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1649
    .line 1650
    .line 1651
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1652
    .line 1653
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1654
    .line 1655
    .line 1656
    const-wide v3, -0x36a51944051405a7L    # -2.3996766690439265E45

    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1662
    .line 1663
    .line 1664
    move-result-object v3

    .line 1665
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1666
    .line 1667
    .line 1668
    new-instance v3, Ljava/util/Date;

    .line 1669
    .line 1670
    iget-object v4, v2, L飘花落叶言世哲楪苏子兰/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;

    .line 1671
    .line 1672
    invoke-static {v9, v10}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1673
    .line 1674
    .line 1675
    move-result-object v5

    .line 1676
    invoke-virtual {v4, v5}, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Object;

    .line 1677
    .line 1678
    .line 1679
    move-result-object v4

    .line 1680
    check-cast v4, Ljava/lang/Long;

    .line 1681
    .line 1682
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 1683
    .line 1684
    .line 1685
    move-result-wide v4

    .line 1686
    invoke-direct {v3, v4, v5}, Ljava/util/Date;-><init>(J)V

    .line 1687
    .line 1688
    .line 1689
    const-wide v4, -0x36a51940051405a7L    # -2.3996821135617973E45

    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1695
    .line 1696
    .line 1697
    move-result-object v4

    .line 1698
    :try_start_3
    new-instance v5, Ljava/text/SimpleDateFormat;

    .line 1699
    .line 1700
    invoke-direct {v5, v4}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 1701
    .line 1702
    .line 1703
    invoke-virtual {v5, v3}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 1704
    .line 1705
    .line 1706
    move-result-object v3
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 1707
    goto :goto_18

    .line 1708
    :catch_1
    const-wide v5, -0x36a519b6051405a7L    # -2.3995215002846106E45

    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1714
    .line 1715
    .line 1716
    move-result-object v3

    .line 1717
    invoke-virtual {v3, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1718
    .line 1719
    .line 1720
    move-result-object v3

    .line 1721
    :goto_18
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1722
    .line 1723
    .line 1724
    const-wide v3, -0x36a51934051405a7L    # -2.3996984471154095E45

    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1730
    .line 1731
    .line 1732
    move-result-object v3

    .line 1733
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1734
    .line 1735
    .line 1736
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1737
    .line 1738
    .line 1739
    move-result-object v1

    .line 1740
    invoke-static {v1}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 1741
    .line 1742
    .line 1743
    :goto_19
    iget-object v1, v2, L飘花落叶言世哲楪苏子兰/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;

    .line 1744
    .line 1745
    invoke-static/range {v15 .. v16}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1746
    .line 1747
    .line 1748
    move-result-object v3

    .line 1749
    invoke-virtual {v1, v0, v3}, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1750
    .line 1751
    .line 1752
    iget-object v0, v2, L飘花落叶言世哲楪苏子兰/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;

    .line 1753
    .line 1754
    invoke-virtual {v0}, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏()V

    .line 1755
    .line 1756
    .line 1757
    :cond_2a
    return-void

    .line 1758
    :pswitch_16
    iget-object v1, v0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1759
    .line 1760
    check-cast v1, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰哲苏世;

    .line 1761
    .line 1762
    iget-object v0, v0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 1763
    .line 1764
    check-cast v0, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪哲苏兰世;

    .line 1765
    .line 1766
    iget-object v1, v1, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世兰苏哲:Landroidx/activity/compose/飘花落叶言子楪世哲兰苏;

    .line 1767
    .line 1768
    invoke-virtual {v1, v0}, Landroidx/activity/compose/飘花落叶言子楪世哲兰苏;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1769
    .line 1770
    .line 1771
    return-void

    .line 1772
    :pswitch_17
    iget-object v2, v0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1773
    .line 1774
    check-cast v2, L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏哲兰;

    .line 1775
    .line 1776
    iget-object v0, v0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 1777
    .line 1778
    check-cast v0, Landroid/view/View$OnClickListener;

    .line 1779
    .line 1780
    invoke-static {v2, v0, v1}, Llin/xposed/hook/view/main/itemview/Update;->飘花落叶言子楪世苏哲兰(L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏哲兰;Landroid/view/View$OnClickListener;Landroid/view/View;)V

    .line 1781
    .line 1782
    .line 1783
    return-void

    .line 1784
    nop

    .line 1785
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
