.class public final synthetic Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

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
    const/16 v1, 0x115

    .line 4
    .line 5
    const/16 v2, 0x113

    .line 6
    .line 7
    const-wide/32 v3, 0x36ee80

    .line 8
    .line 9
    .line 10
    const/16 v5, 0x114

    .line 11
    .line 12
    const/4 v6, -0x1

    .line 13
    const/4 v7, 0x2

    .line 14
    const/4 v8, 0x1

    .line 15
    const/4 v9, 0x0

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
    check-cast p1, L飘花落叶言楪苏子世哲兰/飘花落叶言子楪世苏哲兰;

    .line 23
    .line 24
    iget-object p0, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p0, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世兰苏哲;

    .line 27
    .line 28
    new-instance v0, Landroidx/compose/runtime/internal/飘花落叶言子楪苏兰世哲;

    .line 29
    .line 30
    iget-object p1, p1, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->itemView:Landroid/view/View;

    .line 31
    .line 32
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰苏哲()L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世兰苏哲$飘花落叶言子楪世苏哲兰;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v1}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世兰苏哲$飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {p0}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-direct {v0, p1, v1, p0}, Landroidx/compose/runtime/internal/飘花落叶言子楪苏兰世哲;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    iget p0, p0, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 63
    .line 64
    int-to-double p0, p0

    .line 65
    const-wide v1, 0x3fe999999999999aL    # 0.8

    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    mul-double/2addr p0, v1

    .line 71
    double-to-int p0, p0

    .line 72
    iget-object p1, v0, Landroidx/compose/runtime/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世兰苏哲:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast p1, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏哲兰世;

    .line 75
    .line 76
    iput p0, p1, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子世苏楪兰哲:I

    .line 77
    .line 78
    invoke-virtual {p1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏哲兰世;->飘花落叶言子世哲兰苏楪()V

    .line 79
    .line 80
    .line 81
    iput-boolean v10, p1, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏哲兰世;->飘花落叶言子苏楪兰世哲:Z

    .line 82
    .line 83
    new-instance p0, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪世兰哲苏;

    .line 84
    .line 85
    invoke-direct {p0, v0}, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪世兰哲苏;-><init>(Landroidx/compose/runtime/internal/飘花落叶言子楪苏兰世哲;)V

    .line 86
    .line 87
    .line 88
    iput-object p0, p1, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏哲兰世;->飘花落叶言子世哲兰苏楪:Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰世哲;

    .line 89
    .line 90
    invoke-virtual {p1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏哲兰世;->飘花落叶言子世哲兰苏楪()V

    .line 91
    .line 92
    .line 93
    new-instance p0, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪世兰苏哲;

    .line 94
    .line 95
    invoke-direct {p0, v0, v7}, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪世兰苏哲;-><init>(Ljava/lang/Object;I)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1, p0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏哲兰世;->飘花落叶言子世兰楪苏哲(Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏世兰哲;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏哲兰世;->飘花落叶言子世兰楪哲苏()V

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :pswitch_0
    iget-object p1, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast p1, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世兰苏哲;

    .line 108
    .line 109
    iget-object p0, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast p0, L飘花落叶言苏楪兰子哲世/飘花落叶言子楪世哲兰苏;

    .line 112
    .line 113
    const-string v0, "\u4e0b\u8f7d\u4e2d..."

    .line 114
    .line 115
    invoke-static {v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;->飘花落叶言子世兰楪哲苏(Ljava/lang/String;)L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;

    .line 116
    .line 117
    .line 118
    invoke-static {}, Ltop/suzhelan/plugin/sdk/online/net/PluginSdkConfig;->getDOWNLOAD_DIR()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-virtual {p1}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰苏哲()L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世兰苏哲$飘花落叶言子楪世苏哲兰;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    invoke-virtual {v1}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世兰苏哲$飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    new-instance v2, Ljava/lang/StringBuilder;

    .line 131
    .line 132
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    const-string v0, "/"

    .line 139
    .line 140
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    const-string v0, ".zip"

    .line 147
    .line 148
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    iget-object v1, p0, L飘花落叶言苏楪兰子哲世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰:Ltop/suzhelan/plugin/sdk/online/presenter/飘花落叶言子楪世哲兰苏;

    .line 156
    .line 157
    new-instance v2, L飘花落叶言世苏兰哲子楪/飘花落叶言子世兰楪苏哲;

    .line 158
    .line 159
    const/16 v3, 0xb

    .line 160
    .line 161
    invoke-direct {v2, p0, v3, v0}, L飘花落叶言世苏兰哲子楪/飘花落叶言子世兰楪苏哲;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v1, p1, v0, v2}, Ltop/suzhelan/plugin/sdk/online/presenter/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世兰苏哲;Ljava/lang/String;L飘花落叶言世苏兰哲子楪/飘花落叶言子世兰楪苏哲;)V

    .line 165
    .line 166
    .line 167
    return-void

    .line 168
    :pswitch_1
    iget-object p1, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast p1, L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世苏哲兰;

    .line 171
    .line 172
    iget-object p0, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast p0, Ltop/suzhelan/plugin/sdk/online/entity/Message;

    .line 175
    .line 176
    iget-object p1, p1, L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 177
    .line 178
    check-cast p1, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世苏兰哲;

    .line 179
    .line 180
    invoke-virtual {p1, p0}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世苏兰哲;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    return-void

    .line 184
    :pswitch_2
    iget-object p1, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast p1, L飘花落叶言苏哲世子兰楪/飘花落叶言子楪苏世兰哲;

    .line 187
    .line 188
    iget-object p0, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast p0, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏哲兰;

    .line 191
    .line 192
    iget-object p1, p1, L飘花落叶言苏哲世子兰楪/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏哲兰世:Ljava/lang/Object;

    .line 193
    .line 194
    check-cast p1, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世苏楪兰哲;

    .line 195
    .line 196
    invoke-virtual {p1, p0}, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世苏楪兰哲;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    return-void

    .line 200
    :pswitch_3
    iget-object p1, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 201
    .line 202
    check-cast p1, Landroidx/compose/runtime/internal/飘花落叶言子楪苏兰世哲;

    .line 203
    .line 204
    iget-object p0, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 205
    .line 206
    check-cast p0, L飘花落叶言苏哲世子兰楪/飘花落叶言子楪苏世兰哲;

    .line 207
    .line 208
    const-string v0, "inputEdit"

    .line 209
    .line 210
    iget-object v1, p1, Landroidx/compose/runtime/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲世兰:Ljava/lang/Object;

    .line 211
    .line 212
    check-cast v1, Landroid/widget/EditText;

    .line 213
    .line 214
    if-eqz v1, :cond_7

    .line 215
    .line 216
    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    if-eqz v1, :cond_2

    .line 221
    .line 222
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 223
    .line 224
    .line 225
    move-result v1

    .line 226
    if-nez v1, :cond_0

    .line 227
    .line 228
    goto :goto_0

    .line 229
    :cond_0
    const-string v1, "\u6b63\u5728\u53d1\u9001"

    .line 230
    .line 231
    invoke-static {v1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;->飘花落叶言子世兰楪哲苏(Ljava/lang/String;)L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;

    .line 232
    .line 233
    .line 234
    iget-object v1, p1, Landroidx/compose/runtime/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲兰苏:Ljava/lang/Object;

    .line 235
    .line 236
    check-cast v1, Ltop/suzhelan/plugin/sdk/online/presenter/飘花落叶言子楪世苏兰哲;

    .line 237
    .line 238
    iget-object v2, p1, Landroidx/compose/runtime/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲世兰:Ljava/lang/Object;

    .line 239
    .line 240
    check-cast v2, Landroid/widget/EditText;

    .line 241
    .line 242
    if-eqz v2, :cond_1

    .line 243
    .line 244
    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    iget-object v2, p1, Landroidx/compose/runtime/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 253
    .line 254
    check-cast v2, Ljava/lang/String;

    .line 255
    .line 256
    new-instance v3, Landroidx/compose/foundation/飘花落叶言子楪兰苏世哲;

    .line 257
    .line 258
    const/16 v4, 0xe

    .line 259
    .line 260
    invoke-direct {v3, p1, v4, p0}, Landroidx/compose/foundation/飘花落叶言子楪兰苏世哲;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v1, v0, v2, v3}, Ltop/suzhelan/plugin/sdk/online/presenter/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/foundation/飘花落叶言子楪兰苏世哲;)V

    .line 264
    .line 265
    .line 266
    goto :goto_2

    .line 267
    :cond_1
    invoke-static {v0}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    throw v9

    .line 271
    :cond_2
    :goto_0
    const-string p0, "\u4f60\u8fd8\u6ca1\u6709\u8f93\u5165\u5185\u5bb9\u54e6"

    .line 272
    .line 273
    invoke-static {}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;->飘花落叶言子世哲兰苏楪()L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;

    .line 274
    .line 275
    .line 276
    move-result-object p1

    .line 277
    if-eqz p1, :cond_5

    .line 278
    .line 279
    sget-object v0, Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;->WARNING:Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;

    .line 280
    .line 281
    iput-object p0, p1, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;->飘花落叶言子世兰苏哲楪:Ljava/lang/CharSequence;

    .line 282
    .line 283
    iget-object p0, p1, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;->飘花落叶言子苏楪哲兰世:Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;

    .line 284
    .line 285
    if-ne p0, v0, :cond_3

    .line 286
    .line 287
    goto :goto_1

    .line 288
    :cond_3
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 289
    .line 290
    .line 291
    move-result p0

    .line 292
    iput p0, p1, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;->飘花落叶言子苏楪世哲兰:I

    .line 293
    .line 294
    iput-object v0, p1, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;->飘花落叶言子苏楪哲兰世:Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;

    .line 295
    .line 296
    invoke-virtual {p1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;->飘花落叶言子世哲兰楪苏()L飘花落叶言楪哲世兰子苏/飘花落叶言子世哲兰苏楪;

    .line 297
    .line 298
    .line 299
    move-result-object p0

    .line 300
    if-eqz p0, :cond_4

    .line 301
    .line 302
    invoke-virtual {p1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;->飘花落叶言子世哲兰楪苏()L飘花落叶言楪哲世兰子苏/飘花落叶言子世哲兰苏楪;

    .line 303
    .line 304
    .line 305
    move-result-object p0

    .line 306
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 307
    .line 308
    .line 309
    new-instance v1, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世苏哲兰;

    .line 310
    .line 311
    const/16 v2, 0x11

    .line 312
    .line 313
    invoke-direct {v1, p0, v2, v0}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 314
    .line 315
    .line 316
    invoke-static {v1}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子世苏楪兰哲(Ljava/lang/Runnable;)V

    .line 317
    .line 318
    .line 319
    :cond_4
    :goto_1
    invoke-virtual {p1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;->飘花落叶言子世兰楪苏哲()V

    .line 320
    .line 321
    .line 322
    invoke-virtual {p1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;->飘花落叶言子世哲兰楪苏()L飘花落叶言楪哲世兰子苏/飘花落叶言子世哲兰苏楪;

    .line 323
    .line 324
    .line 325
    move-result-object p0

    .line 326
    if-nez p0, :cond_6

    .line 327
    .line 328
    invoke-virtual {p1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;->飘花落叶言子世兰苏哲楪()V

    .line 329
    .line 330
    .line 331
    goto :goto_2

    .line 332
    :cond_5
    new-instance p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;

    .line 333
    .line 334
    invoke-direct {p0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;-><init>()V

    .line 335
    .line 336
    .line 337
    :cond_6
    :goto_2
    return-void

    .line 338
    :cond_7
    invoke-static {v0}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 339
    .line 340
    .line 341
    throw v9

    .line 342
    :pswitch_4
    iget-object p1, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 343
    .line 344
    check-cast p1, L飘花落叶言楪苏子世哲兰/飘花落叶言子楪世苏哲兰;

    .line 345
    .line 346
    iget-object p0, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 347
    .line 348
    check-cast p0, L飘花落叶言苏哲楪子世兰/飘花落叶言子楪苏兰哲世;

    .line 349
    .line 350
    invoke-virtual {p1}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->getAbsoluteAdapterPosition()I

    .line 351
    .line 352
    .line 353
    move-result p1

    .line 354
    if-eq p1, v6, :cond_10

    .line 355
    .line 356
    iget-object v0, p0, L飘花落叶言楪世兰子哲苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏:Ljava/util/List;

    .line 357
    .line 358
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    instance-of v1, v0, L飘花落叶言苏哲楪子世兰/飘花落叶言子楪哲世兰苏;

    .line 363
    .line 364
    if-eqz v1, :cond_8

    .line 365
    .line 366
    check-cast v0, L飘花落叶言苏哲楪子世兰/飘花落叶言子楪哲世兰苏;

    .line 367
    .line 368
    goto :goto_3

    .line 369
    :cond_8
    move-object v0, v9

    .line 370
    :goto_3
    if-nez v0, :cond_9

    .line 371
    .line 372
    goto :goto_6

    .line 373
    :cond_9
    iget-object v1, v0, L飘花落叶言苏哲楪子世兰/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰:Llin/xposed/hook/javaplugin/bean/GroupInfo;

    .line 374
    .line 375
    iget-boolean v0, v0, L飘花落叶言苏哲楪子世兰/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲:Z

    .line 376
    .line 377
    if-eqz v0, :cond_a

    .line 378
    .line 379
    goto :goto_6

    .line 380
    :cond_a
    iget-object v2, v1, Llin/xposed/hook/javaplugin/bean/GroupInfo;->GroupUin:Ljava/lang/String;

    .line 381
    .line 382
    iget-object v3, p0, L飘花落叶言苏哲楪子世兰/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏兰世哲:Ljava/util/LinkedHashMap;

    .line 383
    .line 384
    invoke-virtual {v3, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    move-result-object v4

    .line 388
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 389
    .line 390
    invoke-static {v4, v5}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 391
    .line 392
    .line 393
    move-result v4

    .line 394
    xor-int/2addr v4, v8

    .line 395
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 396
    .line 397
    .line 398
    move-result-object v4

    .line 399
    invoke-interface {v3, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪苏世哲兰(I)V

    .line 403
    .line 404
    .line 405
    if-eqz v0, :cond_b

    .line 406
    .line 407
    move v7, v10

    .line 408
    goto :goto_4

    .line 409
    :cond_b
    iget-boolean p1, v1, Llin/xposed/hook/javaplugin/bean/GroupInfo;->IsOwnerOrAdmin:Z

    .line 410
    .line 411
    if-eqz p1, :cond_c

    .line 412
    .line 413
    move v7, v8

    .line 414
    :cond_c
    :goto_4
    iget-object p1, p0, L飘花落叶言楪世兰子哲苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏:Ljava/util/List;

    .line 415
    .line 416
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 417
    .line 418
    .line 419
    move-result-object p1

    .line 420
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 421
    .line 422
    .line 423
    move-result v0

    .line 424
    if-eqz v0, :cond_f

    .line 425
    .line 426
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 427
    .line 428
    .line 429
    move-result-object v0

    .line 430
    add-int/lit8 v1, v10, 0x1

    .line 431
    .line 432
    if-ltz v10, :cond_e

    .line 433
    .line 434
    check-cast v0, L飘花落叶言苏哲楪子世兰/飘花落叶言子楪哲苏世兰;

    .line 435
    .line 436
    instance-of v2, v0, L飘花落叶言苏哲楪子世兰/飘花落叶言子楪哲世苏兰;

    .line 437
    .line 438
    if-eqz v2, :cond_d

    .line 439
    .line 440
    check-cast v0, L飘花落叶言苏哲楪子世兰/飘花落叶言子楪哲世苏兰;

    .line 441
    .line 442
    iget v0, v0, L飘花落叶言苏哲楪子世兰/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰:I

    .line 443
    .line 444
    if-ne v0, v7, :cond_d

    .line 445
    .line 446
    invoke-virtual {p0, v10}, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪苏世哲兰(I)V

    .line 447
    .line 448
    .line 449
    :cond_d
    move v10, v1

    .line 450
    goto :goto_5

    .line 451
    :cond_e
    invoke-static {}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏世兰哲;->飘花落叶言子苏兰哲世楪()V

    .line 452
    .line 453
    .line 454
    throw v9

    .line 455
    :cond_f
    iget-object p0, p0, L飘花落叶言苏哲楪子世兰/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲苏世兰:Landroidx/compose/foundation/lazy/飘花落叶言子楪哲世苏兰;

    .line 456
    .line 457
    if-eqz p0, :cond_10

    .line 458
    .line 459
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/飘花落叶言子楪哲世苏兰;->invoke()Ljava/lang/Object;

    .line 460
    .line 461
    .line 462
    :cond_10
    :goto_6
    return-void

    .line 463
    :pswitch_5
    iget-object p1, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 464
    .line 465
    check-cast p1, L飘花落叶言楪苏子世哲兰/飘花落叶言子楪世苏哲兰;

    .line 466
    .line 467
    iget-object p0, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 468
    .line 469
    check-cast p0, L飘花落叶言苏哲世子兰楪/飘花落叶言子楪苏世兰哲;

    .line 470
    .line 471
    invoke-virtual {p1}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->getAbsoluteAdapterPosition()I

    .line 472
    .line 473
    .line 474
    move-result p1

    .line 475
    if-eq p1, v6, :cond_12

    .line 476
    .line 477
    iget-object v0, p0, L飘花落叶言楪世兰子哲苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏:Ljava/util/List;

    .line 478
    .line 479
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 480
    .line 481
    .line 482
    move-result-object v0

    .line 483
    check-cast v0, Llin/xposed/hook/javaplugin/bean/GroupInfo;

    .line 484
    .line 485
    if-eqz v0, :cond_12

    .line 486
    .line 487
    iget-object v0, v0, Llin/xposed/hook/javaplugin/bean/GroupInfo;->GroupUin:Ljava/lang/String;

    .line 488
    .line 489
    if-nez v0, :cond_11

    .line 490
    .line 491
    goto :goto_7

    .line 492
    :cond_11
    iget-object v1, p0, L飘花落叶言苏哲世子兰楪/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏哲兰世:Ljava/lang/Object;

    .line 493
    .line 494
    check-cast v1, Ljava/util/LinkedHashMap;

    .line 495
    .line 496
    invoke-virtual {v1, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 497
    .line 498
    .line 499
    move-result-object v2

    .line 500
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 501
    .line 502
    invoke-static {v2, v3}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 503
    .line 504
    .line 505
    move-result v2

    .line 506
    xor-int/2addr v2, v8

    .line 507
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 508
    .line 509
    .line 510
    move-result-object v2

    .line 511
    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 512
    .line 513
    .line 514
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪苏世哲兰(I)V

    .line 515
    .line 516
    .line 517
    :cond_12
    :goto_7
    return-void

    .line 518
    :pswitch_6
    iget-object p1, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 519
    .line 520
    check-cast p1, L飘花落叶言楪苏子世哲兰/飘花落叶言子楪世苏哲兰;

    .line 521
    .line 522
    iget-object p0, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 523
    .line 524
    check-cast p0, L飘花落叶言苏哲楪子世兰/飘花落叶言子楪世哲苏兰;

    .line 525
    .line 526
    invoke-virtual {p1}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->getAbsoluteAdapterPosition()I

    .line 527
    .line 528
    .line 529
    move-result p1

    .line 530
    if-eq p1, v6, :cond_18

    .line 531
    .line 532
    iget-object v0, p0, L飘花落叶言楪世兰子哲苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏:Ljava/util/List;

    .line 533
    .line 534
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 535
    .line 536
    .line 537
    move-result-object v0

    .line 538
    instance-of v1, v0, L飘花落叶言苏哲楪子世兰/飘花落叶言子楪世哲兰苏;

    .line 539
    .line 540
    if-eqz v1, :cond_13

    .line 541
    .line 542
    check-cast v0, L飘花落叶言苏哲楪子世兰/飘花落叶言子楪世哲兰苏;

    .line 543
    .line 544
    goto :goto_8

    .line 545
    :cond_13
    move-object v0, v9

    .line 546
    :goto_8
    if-nez v0, :cond_14

    .line 547
    .line 548
    goto :goto_a

    .line 549
    :cond_14
    iget-object v0, v0, L飘花落叶言苏哲楪子世兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Ltop/suzhelan/qstory/hook/plugin/entity/NewFriendInfo;

    .line 550
    .line 551
    iget-object v1, v0, Ltop/suzhelan/qstory/hook/plugin/entity/NewFriendInfo;->uin:Ljava/lang/String;

    .line 552
    .line 553
    iget-object v2, p0, L飘花落叶言苏哲楪子世兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏兰世哲:Ljava/util/LinkedHashMap;

    .line 554
    .line 555
    invoke-virtual {v2, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 556
    .line 557
    .line 558
    move-result-object v3

    .line 559
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 560
    .line 561
    invoke-static {v3, v4}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 562
    .line 563
    .line 564
    move-result v3

    .line 565
    xor-int/2addr v3, v8

    .line 566
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 567
    .line 568
    .line 569
    move-result-object v3

    .line 570
    invoke-interface {v2, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 571
    .line 572
    .line 573
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪苏世哲兰(I)V

    .line 574
    .line 575
    .line 576
    iget p1, v0, Ltop/suzhelan/qstory/hook/plugin/entity/NewFriendInfo;->categoryId:I

    .line 577
    .line 578
    iget-object v0, p0, L飘花落叶言楪世兰子哲苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏:Ljava/util/List;

    .line 579
    .line 580
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 581
    .line 582
    .line 583
    move-result-object v0

    .line 584
    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 585
    .line 586
    .line 587
    move-result v1

    .line 588
    if-eqz v1, :cond_17

    .line 589
    .line 590
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 591
    .line 592
    .line 593
    move-result-object v1

    .line 594
    add-int/lit8 v2, v10, 0x1

    .line 595
    .line 596
    if-ltz v10, :cond_16

    .line 597
    .line 598
    check-cast v1, L飘花落叶言苏哲楪子世兰/飘花落叶言子楪世兰哲苏;

    .line 599
    .line 600
    instance-of v3, v1, L飘花落叶言苏哲楪子世兰/飘花落叶言子楪世兰苏哲;

    .line 601
    .line 602
    if-eqz v3, :cond_15

    .line 603
    .line 604
    check-cast v1, L飘花落叶言苏哲楪子世兰/飘花落叶言子楪世兰苏哲;

    .line 605
    .line 606
    iget v1, v1, L飘花落叶言苏哲楪子世兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:I

    .line 607
    .line 608
    if-ne v1, p1, :cond_15

    .line 609
    .line 610
    invoke-virtual {p0, v10}, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪苏世哲兰(I)V

    .line 611
    .line 612
    .line 613
    :cond_15
    move v10, v2

    .line 614
    goto :goto_9

    .line 615
    :cond_16
    invoke-static {}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏世兰哲;->飘花落叶言子苏兰哲世楪()V

    .line 616
    .line 617
    .line 618
    throw v9

    .line 619
    :cond_17
    iget-object p0, p0, L飘花落叶言苏哲楪子世兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:Landroidx/compose/foundation/lazy/飘花落叶言子楪哲世苏兰;

    .line 620
    .line 621
    if-eqz p0, :cond_18

    .line 622
    .line 623
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/飘花落叶言子楪哲世苏兰;->invoke()Ljava/lang/Object;

    .line 624
    .line 625
    .line 626
    :cond_18
    :goto_a
    return-void

    .line 627
    :pswitch_7
    iget-object p1, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 628
    .line 629
    check-cast p1, L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世苏哲兰;

    .line 630
    .line 631
    iget-object p0, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 632
    .line 633
    check-cast p0, Ltop/suzhelan/sticker/sdk/entity/OnlineStickerInfo;

    .line 634
    .line 635
    iget-object p1, p1, L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 636
    .line 637
    if-eqz p1, :cond_19

    .line 638
    .line 639
    invoke-interface {p1, p0}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 640
    .line 641
    .line 642
    :cond_19
    return-void

    .line 643
    :pswitch_8
    iget-object p1, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 644
    .line 645
    check-cast p1, L飘花落叶言苏哲世子兰楪/飘花落叶言子楪苏世兰哲;

    .line 646
    .line 647
    iget-object p0, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 648
    .line 649
    check-cast p0, Ljava/io/File;

    .line 650
    .line 651
    iget-object p1, p1, L飘花落叶言苏哲世子兰楪/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏哲兰世:Ljava/lang/Object;

    .line 652
    .line 653
    check-cast p1, L飘花落叶言世苏兰哲子楪/飘花落叶言子世兰楪苏哲;

    .line 654
    .line 655
    invoke-virtual {p1, p0}, L飘花落叶言世苏兰哲子楪/飘花落叶言子世兰楪苏哲;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 656
    .line 657
    .line 658
    return-void

    .line 659
    :pswitch_9
    iget-object p1, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 660
    .line 661
    check-cast p1, Landroid/widget/TextView;

    .line 662
    .line 663
    iget-object p0, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 664
    .line 665
    check-cast p0, Ljava/lang/String;

    .line 666
    .line 667
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 668
    .line 669
    .line 670
    move-result-object p1

    .line 671
    const/16 v0, 0x2e

    .line 672
    .line 673
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 674
    .line 675
    .line 676
    move-result-object v0

    .line 677
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 678
    .line 679
    .line 680
    move-result-object p1

    .line 681
    const/16 v0, 0x8f4

    .line 682
    .line 683
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 684
    .line 685
    .line 686
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 687
    .line 688
    .line 689
    check-cast p1, Landroid/content/ClipboardManager;

    .line 690
    .line 691
    const/16 v0, 0x8f5

    .line 692
    .line 693
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 694
    .line 695
    .line 696
    move-result-object v0

    .line 697
    invoke-static {v0, p0}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    .line 698
    .line 699
    .line 700
    move-result-object p0

    .line 701
    invoke-virtual {p1, p0}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 702
    .line 703
    .line 704
    const/16 p0, 0x8f6

    .line 705
    .line 706
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 707
    .line 708
    .line 709
    move-result-object p0

    .line 710
    invoke-static {p0}, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 711
    .line 712
    .line 713
    return-void

    .line 714
    :pswitch_a
    iget-object p1, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 715
    .line 716
    check-cast p1, L飘花落叶言苏哲楪子世兰/飘花落叶言子楪苏哲兰世;

    .line 717
    .line 718
    iget-object p0, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 719
    .line 720
    check-cast p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲苏世兰;

    .line 721
    .line 722
    sget-object v0, Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏:Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世哲苏兰;

    .line 723
    .line 724
    invoke-virtual {p1}, L飘花落叶言苏哲楪子世兰/飘花落叶言子楪苏哲兰世;->飘花落叶言子世楪苏兰哲()Ljava/util/ArrayList;

    .line 725
    .line 726
    .line 727
    move-result-object p1

    .line 728
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 729
    .line 730
    .line 731
    invoke-static {p1}, Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏(Ljava/util/ArrayList;)V

    .line 732
    .line 733
    .line 734
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世哲苏兰;)V

    .line 735
    .line 736
    .line 737
    const/16 p1, 0x8f3

    .line 738
    .line 739
    invoke-static {p1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 740
    .line 741
    .line 742
    move-result-object p1

    .line 743
    invoke-static {p1}, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 744
    .line 745
    .line 746
    if-eqz p0, :cond_1a

    .line 747
    .line 748
    invoke-virtual {p0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲苏世兰;->飘花落叶言子世哲苏兰楪()V

    .line 749
    .line 750
    .line 751
    :cond_1a
    return-void

    .line 752
    :pswitch_b
    iget-object p1, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 753
    .line 754
    check-cast p1, Ljava/util/List;

    .line 755
    .line 756
    iget-object p0, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 757
    .line 758
    check-cast p0, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪兰世苏哲;

    .line 759
    .line 760
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 761
    .line 762
    .line 763
    move-result-object p1

    .line 764
    :goto_b
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 765
    .line 766
    .line 767
    move-result v0

    .line 768
    if-eqz v0, :cond_1c

    .line 769
    .line 770
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 771
    .line 772
    .line 773
    move-result-object v0

    .line 774
    check-cast v0, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪兰世苏哲;

    .line 775
    .line 776
    iget-object v1, v0, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏兰哲:Ltop/suzhelan/qstory/ui/views/CustomMaterialCheckBox;

    .line 777
    .line 778
    if-ne v0, p0, :cond_1b

    .line 779
    .line 780
    move v0, v8

    .line 781
    goto :goto_c

    .line 782
    :cond_1b
    move v0, v10

    .line 783
    :goto_c
    invoke-virtual {v1, v0}, Ltop/suzhelan/qstory/ui/views/CustomMaterialCheckBox;->setChecked(Z)V

    .line 784
    .line 785
    .line 786
    goto :goto_b

    .line 787
    :cond_1c
    return-void

    .line 788
    :pswitch_c
    iget-object p1, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 789
    .line 790
    check-cast p1, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪苏兰哲世;

    .line 791
    .line 792
    iget-object p0, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 793
    .line 794
    check-cast p0, Ljava/io/File;

    .line 795
    .line 796
    iget-object p1, p1, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世兰苏哲:L飘花落叶言苏世兰楪哲子/飘花落叶言子楪苏世兰哲;

    .line 797
    .line 798
    invoke-virtual {p1, p0}, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪苏世兰哲;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 799
    .line 800
    .line 801
    return-void

    .line 802
    :pswitch_d
    iget-object p1, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 803
    .line 804
    check-cast p1, Ltop/suzhelan/qstory/ui/views/DialogXRecycleView;

    .line 805
    .line 806
    iget-object p0, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 807
    .line 808
    check-cast p0, Landroid/widget/ImageView;

    .line 809
    .line 810
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 811
    .line 812
    .line 813
    move-result v0

    .line 814
    const/16 v1, 0x8

    .line 815
    .line 816
    if-ne v0, v1, :cond_1d

    .line 817
    .line 818
    invoke-virtual {p1, v10}, Landroid/view/View;->setVisibility(I)V

    .line 819
    .line 820
    .line 821
    const p1, 0x1080003

    .line 822
    .line 823
    .line 824
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 825
    .line 826
    .line 827
    goto :goto_d

    .line 828
    :cond_1d
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 829
    .line 830
    .line 831
    const p1, 0x1080002

    .line 832
    .line 833
    .line 834
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 835
    .line 836
    .line 837
    :goto_d
    return-void

    .line 838
    :pswitch_e
    iget-object v0, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 839
    .line 840
    check-cast v0, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 841
    .line 842
    iget-object p0, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 843
    .line 844
    check-cast p0, L飘花落叶言楪世兰子哲苏/飘花落叶言子楪苏世哲兰;

    .line 845
    .line 846
    invoke-virtual {v0}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->getBindingAdapterPosition()I

    .line 847
    .line 848
    .line 849
    move-result v0

    .line 850
    if-ne v0, v6, :cond_1e

    .line 851
    .line 852
    goto :goto_e

    .line 853
    :cond_1e
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 854
    .line 855
    .line 856
    iget-object v1, p0, L飘花落叶言楪世兰子哲苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰苏哲:L飘花落叶言楪世兰子哲苏/飘花落叶言子楪世哲兰苏;

    .line 857
    .line 858
    if-eqz v1, :cond_1f

    .line 859
    .line 860
    invoke-interface {v1, p0, p1, v0}, L飘花落叶言楪世兰子哲苏/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰(L飘花落叶言楪世兰子哲苏/飘花落叶言子楪苏世哲兰;Landroid/view/View;I)V

    .line 861
    .line 862
    .line 863
    :cond_1f
    :goto_e
    return-void

    .line 864
    :pswitch_f
    iget-object p1, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 865
    .line 866
    check-cast p1, L飘花落叶言世哲楪苏子兰/飘花落叶言子世兰楪哲苏;

    .line 867
    .line 868
    iget-object p0, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 869
    .line 870
    check-cast p0, Landroid/widget/ImageView;

    .line 871
    .line 872
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 873
    .line 874
    .line 875
    move-result-object p0

    .line 876
    check-cast p0, Landroid/app/Activity;

    .line 877
    .line 878
    new-instance v0, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;

    .line 879
    .line 880
    const/16 v6, 0x10f

    .line 881
    .line 882
    invoke-static {v6}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 883
    .line 884
    .line 885
    move-result-object v6

    .line 886
    invoke-direct {v0, v6}, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/String;)V

    .line 887
    .line 888
    .line 889
    iput-object v0, p1, L飘花落叶言世哲楪苏子兰/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;

    .line 890
    .line 891
    new-instance v0, L飘花落叶言世哲子苏兰楪/飘花落叶言子楪世哲苏兰;

    .line 892
    .line 893
    const/16 v6, 0x111

    .line 894
    .line 895
    invoke-static {v6}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 896
    .line 897
    .line 898
    move-result-object v6

    .line 899
    const/16 v7, 0x112

    .line 900
    .line 901
    invoke-static {v7}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 902
    .line 903
    .line 904
    move-result-object v7

    .line 905
    const-string v8, "\u55b5\u545c\u55b5\u55b5\u545c\u55b5\u545c\u545c~\u545c\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u55b5~\u545c\u545c\u55b5\u55b5\u545c\u55b5\u545c\u55b5~\u545c\u545c\u545c\u55b5\u55b5\u545c\u545c\u545c~\u545c\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c~\u545c\u545c\u545c\u545c\u545c\u55b5\u545c\u545c~\u545c\u545c\u55b5\u545c\u55b5\u545c\u545c\u545c"

    .line 906
    .line 907
    invoke-static {v8}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 908
    .line 909
    .line 910
    move-result-object v8

    .line 911
    const-string v9, "\u55b5\u545c\u55b5\u55b5\u55b5\u55b5\u55b5\u545c~\u545c\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u55b5~\u545c\u545c\u55b5\u55b5\u545c\u55b5\u545c\u55b5~\u545c\u545c\u545c\u55b5\u55b5\u545c\u545c\u545c~\u545c\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c~\u545c\u545c\u545c\u545c\u545c\u55b5\u545c\u545c~\u545c\u545c\u55b5\u545c\u55b5\u545c\u545c\u545c"

    .line 912
    .line 913
    invoke-static {v9}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 914
    .line 915
    .line 916
    move-result-object v9

    .line 917
    const-string v10, "\u545c\u55b5\u55b5\u545c\u55b5\u545c\u545c\u55b5~\u545c\u545c\u545c\u545c\u55b5\u55b5\u55b5\u55b5~\u545c\u545c\u55b5\u55b5\u545c\u55b5\u55b5\u545c~\u545c\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c~\u545c\u545c\u545c\u545c\u55b5\u55b5\u545c\u55b5~\u545c\u545c\u55b5\u55b5\u55b5\u55b5\u55b5\u545c"

    .line 918
    .line 919
    invoke-static {v10}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 920
    .line 921
    .line 922
    move-result-object v11

    .line 923
    filled-new-array {v6, v7, v8, v9, v11}, [Ljava/lang/String;

    .line 924
    .line 925
    .line 926
    move-result-object v6

    .line 927
    invoke-direct {v0, p0, v6}, L飘花落叶言世哲子苏兰楪/飘花落叶言子楪世哲苏兰;-><init>(Landroid/app/Activity;[Ljava/lang/String;)V

    .line 928
    .line 929
    .line 930
    iget-object p0, v0, L飘花落叶言世哲子苏兰楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:Landroid/widget/TextView;

    .line 931
    .line 932
    iget-object v6, p1, L飘花落叶言世哲楪苏子兰/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;

    .line 933
    .line 934
    invoke-static {v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 935
    .line 936
    .line 937
    move-result-object v2

    .line 938
    invoke-virtual {v6, v2}, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Object;

    .line 939
    .line 940
    .line 941
    move-result-object v2

    .line 942
    check-cast v2, Ljava/lang/Long;

    .line 943
    .line 944
    new-instance v6, Ljava/util/Date;

    .line 945
    .line 946
    invoke-direct {v6}, Ljava/util/Date;-><init>()V

    .line 947
    .line 948
    .line 949
    if-eqz v2, :cond_21

    .line 950
    .line 951
    invoke-virtual {v6}, Ljava/util/Date;->getTime()J

    .line 952
    .line 953
    .line 954
    move-result-wide v7

    .line 955
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 956
    .line 957
    .line 958
    move-result-wide v11

    .line 959
    cmp-long v7, v7, v11

    .line 960
    .line 961
    if-lez v7, :cond_20

    .line 962
    .line 963
    goto :goto_f

    .line 964
    :cond_20
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 965
    .line 966
    .line 967
    move-result-wide v1

    .line 968
    invoke-virtual {v6}, Ljava/util/Date;->getTime()J

    .line 969
    .line 970
    .line 971
    move-result-wide v6

    .line 972
    sub-long/2addr v1, v6

    .line 973
    div-long v6, v1, v3

    .line 974
    .line 975
    mul-long/2addr v3, v6

    .line 976
    sub-long/2addr v1, v3

    .line 977
    const-wide/32 v3, 0xea60

    .line 978
    .line 979
    .line 980
    div-long/2addr v1, v3

    .line 981
    new-instance v3, Ljava/lang/StringBuilder;

    .line 982
    .line 983
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 984
    .line 985
    .line 986
    const-string v4, "\u545c\u55b5\u55b5\u545c\u55b5\u545c\u545c\u55b5~\u545c\u545c\u545c\u545c\u545c\u545c\u55b5\u55b5~\u545c\u545c\u55b5\u545c\u55b5\u55b5\u545c\u545c~\u545c\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5~\u545c\u545c\u55b5\u545c\u545c\u55b5\u55b5\u55b5~\u545c\u545c\u545c\u545c\u55b5\u545c\u55b5\u545c~\u55b5\u545c\u55b5\u55b5\u55b5\u55b5\u55b5\u545c"

    .line 987
    .line 988
    invoke-static {v4}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 989
    .line 990
    .line 991
    move-result-object v4

    .line 992
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 993
    .line 994
    .line 995
    invoke-virtual {v3, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 996
    .line 997
    .line 998
    const-string v4, "\u545c\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u545c~\u545c\u545c\u545c\u55b5\u55b5\u55b5\u545c\u55b5~\u545c\u545c\u55b5\u55b5\u545c\u545c\u55b5\u55b5"

    .line 999
    .line 1000
    invoke-static {v4}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 1001
    .line 1002
    .line 1003
    move-result-object v4

    .line 1004
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1005
    .line 1006
    .line 1007
    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1008
    .line 1009
    .line 1010
    const-string v1, "\u545c\u55b5\u55b5\u545c\u55b5\u545c\u545c\u55b5~\u545c\u545c\u545c\u545c\u545c\u545c\u55b5\u545c~\u545c\u545c\u545c\u545c\u545c\u545c\u55b5\u55b5"

    .line 1011
    .line 1012
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 1013
    .line 1014
    .line 1015
    move-result-object v1

    .line 1016
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1017
    .line 1018
    .line 1019
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1020
    .line 1021
    .line 1022
    move-result-object v1

    .line 1023
    invoke-virtual {p0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1024
    .line 1025
    .line 1026
    goto :goto_10

    .line 1027
    :cond_21
    :goto_f
    iget-object v2, p1, L飘花落叶言世哲楪苏子兰/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;

    .line 1028
    .line 1029
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1030
    .line 1031
    .line 1032
    new-instance v3, Lcom/alibaba/fastjson2/JSONObject;

    .line 1033
    .line 1034
    invoke-direct {v3}, Lcom/alibaba/fastjson2/JSONObject;-><init>()V

    .line 1035
    .line 1036
    .line 1037
    iput-object v3, v2, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Lcom/alibaba/fastjson2/JSONObject;

    .line 1038
    .line 1039
    iget-object v2, p1, L飘花落叶言世哲楪苏子兰/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;

    .line 1040
    .line 1041
    invoke-static {v5}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 1042
    .line 1043
    .line 1044
    move-result-object v3

    .line 1045
    invoke-static {v10}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 1046
    .line 1047
    .line 1048
    move-result-object v4

    .line 1049
    invoke-virtual {v2, v4, v3}, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1050
    .line 1051
    .line 1052
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 1053
    .line 1054
    .line 1055
    move-result-object v1

    .line 1056
    invoke-virtual {p0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1057
    .line 1058
    .line 1059
    :goto_10
    iget-object p0, p1, L飘花落叶言世哲楪苏子兰/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;

    .line 1060
    .line 1061
    invoke-static {v5}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v1

    .line 1065
    invoke-virtual {p0, v1}, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Object;

    .line 1066
    .line 1067
    .line 1068
    move-result-object p0

    .line 1069
    check-cast p0, Ljava/lang/String;

    .line 1070
    .line 1071
    iput-object p0, v0, L飘花落叶言世哲子苏兰楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲:Ljava/lang/String;

    .line 1072
    .line 1073
    new-instance p0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世兰哲苏楪;

    .line 1074
    .line 1075
    const/4 v1, 0x4

    .line 1076
    invoke-direct {p0, p1, v1, v0}, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世兰哲苏楪;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 1077
    .line 1078
    .line 1079
    iput-object p0, v0, L飘花落叶言世哲子苏兰楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世哲苏:Landroidx/compose/foundation/lazy/layout/飘花落叶言子世兰哲苏楪;

    .line 1080
    .line 1081
    invoke-virtual {v0}, L飘花落叶言世哲子苏兰楪/飘花落叶言子楪世哲苏兰;->show()V

    .line 1082
    .line 1083
    .line 1084
    return-void

    .line 1085
    :pswitch_10
    iget-object p1, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1086
    .line 1087
    check-cast p1, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏哲兰世;

    .line 1088
    .line 1089
    iget-object p0, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 1090
    .line 1091
    check-cast p0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏世哲兰;

    .line 1092
    .line 1093
    iget v0, p0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 1094
    .line 1095
    if-ne v0, v7, :cond_22

    .line 1096
    .line 1097
    goto/16 :goto_13

    .line 1098
    .line 1099
    :cond_22
    invoke-static {}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子世苏哲楪兰()Z

    .line 1100
    .line 1101
    .line 1102
    move-result v0

    .line 1103
    const/16 v1, 0x16c

    .line 1104
    .line 1105
    if-eqz v0, :cond_23

    .line 1106
    .line 1107
    iget-object p0, p0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 1108
    .line 1109
    invoke-static {p0}, Llin/xposed/hook/util/qq/CreateElement;->createEmojiElement(Ljava/lang/String;)Ljava/lang/Object;

    .line 1110
    .line 1111
    .line 1112
    move-result-object p0

    .line 1113
    const/16 v0, 0x11a

    .line 1114
    .line 1115
    :try_start_0
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 1116
    .line 1117
    .line 1118
    move-result-object v0

    .line 1119
    const/16 v2, 0xb2

    .line 1120
    .line 1121
    invoke-static {v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 1122
    .line 1123
    .line 1124
    move-result-object v2

    .line 1125
    invoke-static {v2}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 1126
    .line 1127
    .line 1128
    move-result-object v2

    .line 1129
    invoke-static {v2, v0, p0}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1130
    .line 1131
    .line 1132
    move-result-object v0

    .line 1133
    const-string v2, "\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5\u55b5"

    .line 1134
    .line 1135
    invoke-static {v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 1136
    .line 1137
    .line 1138
    move-result-object v2

    .line 1139
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 1140
    .line 1141
    .line 1142
    move-result-object v1

    .line 1143
    invoke-static {v0, v2, v1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 1144
    .line 1145
    .line 1146
    const/16 v1, 0x8d

    .line 1147
    .line 1148
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 1149
    .line 1150
    .line 1151
    move-result-object v1

    .line 1152
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1153
    .line 1154
    .line 1155
    move-result-object v2

    .line 1156
    invoke-static {v0, v1, v2}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1157
    .line 1158
    .line 1159
    new-instance v0, Ljava/util/ArrayList;

    .line 1160
    .line 1161
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1162
    .line 1163
    .line 1164
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1165
    .line 1166
    .line 1167
    invoke-static {}, Llin/xposed/hook/util/qq/QQSessionUtils;->getCurrentContact()Ljava/lang/Object;

    .line 1168
    .line 1169
    .line 1170
    move-result-object p0

    .line 1171
    invoke-static {p0, v0}, Llin/xposed/hook/util/qq/QQNTSendMsgUtils;->sendMsg(Ljava/lang/Object;Ljava/util/ArrayList;)V

    .line 1172
    .line 1173
    .line 1174
    goto :goto_11

    .line 1175
    :catch_0
    move-exception p0

    .line 1176
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏哲世兰(Ljava/lang/Throwable;)V

    .line 1177
    .line 1178
    .line 1179
    goto :goto_13

    .line 1180
    :cond_23
    invoke-static {}, Llin/xposed/hook/util/qq/QQSessionUtils;->getCurrentSessionInfo()Ljava/lang/Object;

    .line 1181
    .line 1182
    .line 1183
    move-result-object v0

    .line 1184
    iget-object p0, p0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 1185
    .line 1186
    invoke-static {v0, p0}, Llin/xposed/hook/util/qq/LegacyQQSendTool$MsgBuilder;->builderPic(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 1187
    .line 1188
    .line 1189
    move-result-object p0

    .line 1190
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 1191
    .line 1192
    .line 1193
    move-result-object v0

    .line 1194
    invoke-static {p0, v0}, Llin/xposed/hook/util/qq/LegacyQQSendTool;->setPicText(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1195
    .line 1196
    .line 1197
    invoke-static {}, Llin/xposed/hook/util/qq/QQSessionUtils;->getCurrentSessionInfo()Ljava/lang/Object;

    .line 1198
    .line 1199
    .line 1200
    move-result-object v0

    .line 1201
    invoke-static {v0, p0}, Llin/xposed/hook/util/qq/LegacyQQSendTool;->sendPic(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1202
    .line 1203
    .line 1204
    :goto_11
    iget-object p0, p1, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏哲世兰:L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏兰哲世;

    .line 1205
    .line 1206
    invoke-virtual {p0, v10}, Landroid/view/View;->setClickable(Z)V

    .line 1207
    .line 1208
    .line 1209
    iget-object p0, p1, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏哲世兰:L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏兰哲世;

    .line 1210
    .line 1211
    invoke-virtual {p0, v9}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 1212
    .line 1213
    .line 1214
    const-class v0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏世兰哲;

    .line 1215
    .line 1216
    monitor-enter v0

    .line 1217
    :try_start_1
    sget-object p0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏兰哲世;

    .line 1218
    .line 1219
    if-eqz p0, :cond_24

    .line 1220
    .line 1221
    invoke-virtual {p0}, Lcom/lxj/xpopup/core/飘花落叶言子楪苏世兰哲;->dismiss()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1222
    .line 1223
    .line 1224
    goto :goto_12

    .line 1225
    :catchall_0
    move-exception p0

    .line 1226
    goto :goto_14

    .line 1227
    :cond_24
    :goto_12
    monitor-exit v0

    .line 1228
    :goto_13
    return-void

    .line 1229
    :goto_14
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 1230
    throw p0

    .line 1231
    :pswitch_11
    iget-object v0, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1232
    .line 1233
    check-cast v0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏兰哲世;

    .line 1234
    .line 1235
    iget-object p0, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 1236
    .line 1237
    check-cast p0, Ljava/lang/String;

    .line 1238
    .line 1239
    sput v10, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪兰哲世苏:I

    .line 1240
    .line 1241
    invoke-virtual {v0, p0}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)V

    .line 1242
    .line 1243
    .line 1244
    iget-object p0, v0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲苏兰世:Ljava/util/ArrayList;

    .line 1245
    .line 1246
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1247
    .line 1248
    .line 1249
    move-result-object p0

    .line 1250
    :goto_15
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 1251
    .line 1252
    .line 1253
    move-result v1

    .line 1254
    if-eqz v1, :cond_25

    .line 1255
    .line 1256
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1257
    .line 1258
    .line 1259
    move-result-object v1

    .line 1260
    check-cast v1, Landroid/view/View;

    .line 1261
    .line 1262
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1263
    .line 1264
    .line 1265
    move-result-object v2

    .line 1266
    const v3, 0x24060030

    .line 1267
    .line 1268
    .line 1269
    invoke-virtual {v2, v3, v9}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    .line 1270
    .line 1271
    .line 1272
    move-result v2

    .line 1273
    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundColor(I)V

    .line 1274
    .line 1275
    .line 1276
    goto :goto_15

    .line 1277
    :cond_25
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1278
    .line 1279
    .line 1280
    move-result-object p0

    .line 1281
    const v0, 0x2408012f

    .line 1282
    .line 1283
    .line 1284
    invoke-virtual {p0, v0, v9}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 1285
    .line 1286
    .line 1287
    move-result-object p0

    .line 1288
    invoke-virtual {p1, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1289
    .line 1290
    .line 1291
    return-void

    .line 1292
    :pswitch_12
    iget-object p1, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1293
    .line 1294
    check-cast p1, Landroid/content/Context;

    .line 1295
    .line 1296
    iget-object p0, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 1297
    .line 1298
    check-cast p0, Landroid/widget/RadioGroup;

    .line 1299
    .line 1300
    new-instance v0, Landroid/widget/EditText;

    .line 1301
    .line 1302
    invoke-direct {v0, p1}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 1303
    .line 1304
    .line 1305
    new-instance v1, Landroid/app/AlertDialog$Builder;

    .line 1306
    .line 1307
    invoke-static {p1}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏世兰哲;->飘花落叶言子世楪哲兰苏(Landroid/content/Context;)Z

    .line 1308
    .line 1309
    .line 1310
    move-result v2

    .line 1311
    if-eqz v2, :cond_26

    .line 1312
    .line 1313
    goto :goto_16

    .line 1314
    :cond_26
    const/4 v7, 0x3

    .line 1315
    :goto_16
    invoke-direct {v1, p1, v7}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;I)V

    .line 1316
    .line 1317
    .line 1318
    const/16 v2, 0x168

    .line 1319
    .line 1320
    invoke-static {v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 1321
    .line 1322
    .line 1323
    move-result-object v2

    .line 1324
    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 1325
    .line 1326
    .line 1327
    move-result-object v1

    .line 1328
    invoke-virtual {v1, v0}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 1329
    .line 1330
    .line 1331
    move-result-object v1

    .line 1332
    const/16 v2, 0x169

    .line 1333
    .line 1334
    invoke-static {v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 1335
    .line 1336
    .line 1337
    move-result-object v2

    .line 1338
    new-instance v3, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪世兰哲苏;

    .line 1339
    .line 1340
    invoke-direct {v3, v0, p0, p1, v8}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪世兰哲苏;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1341
    .line 1342
    .line 1343
    invoke-virtual {v1, v2, v3}, Landroid/app/AlertDialog$Builder;->setNeutralButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 1344
    .line 1345
    .line 1346
    move-result-object p0

    .line 1347
    invoke-virtual {p0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 1348
    .line 1349
    .line 1350
    return-void

    .line 1351
    :pswitch_13
    iget-object p1, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1352
    .line 1353
    check-cast p1, L飘花落叶言世哲子苏兰楪/飘花落叶言子楪世哲苏兰;

    .line 1354
    .line 1355
    iget-object p0, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 1356
    .line 1357
    check-cast p0, Ljava/lang/String;

    .line 1358
    .line 1359
    iget-object p1, p1, L飘花落叶言世哲子苏兰楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世哲苏:Landroidx/compose/foundation/lazy/layout/飘花落叶言子世兰哲苏楪;

    .line 1360
    .line 1361
    if-eqz p1, :cond_28

    .line 1362
    .line 1363
    iget-object v0, p1, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1364
    .line 1365
    check-cast v0, L飘花落叶言世哲楪苏子兰/飘花落叶言子世兰楪哲苏;

    .line 1366
    .line 1367
    iget-object p1, p1, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 1368
    .line 1369
    check-cast p1, L飘花落叶言世哲子苏兰楪/飘花落叶言子楪世哲苏兰;

    .line 1370
    .line 1371
    iget-object p1, p1, L飘花落叶言世哲子苏兰楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:Landroid/widget/TextView;

    .line 1372
    .line 1373
    const-string v6, "\u545c\u55b5\u55b5\u545c\u55b5\u545c\u545c\u55b5~\u545c\u545c\u545c\u545c\u55b5\u55b5\u55b5\u55b5~\u545c\u545c\u55b5\u55b5\u545c\u55b5\u55b5\u545c~\u545c\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c~\u545c\u545c\u545c\u545c\u55b5\u55b5\u545c\u55b5~\u545c\u545c\u55b5\u55b5\u55b5\u55b5\u55b5\u545c"

    .line 1374
    .line 1375
    invoke-static {v6}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 1376
    .line 1377
    .line 1378
    move-result-object v6

    .line 1379
    invoke-virtual {p0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1380
    .line 1381
    .line 1382
    move-result v6

    .line 1383
    if-eqz v6, :cond_27

    .line 1384
    .line 1385
    iget-object v2, v0, L飘花落叶言世哲楪苏子兰/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;

    .line 1386
    .line 1387
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1388
    .line 1389
    .line 1390
    new-instance v3, Lcom/alibaba/fastjson2/JSONObject;

    .line 1391
    .line 1392
    invoke-direct {v3}, Lcom/alibaba/fastjson2/JSONObject;-><init>()V

    .line 1393
    .line 1394
    .line 1395
    iput-object v3, v2, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Lcom/alibaba/fastjson2/JSONObject;

    .line 1396
    .line 1397
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 1398
    .line 1399
    .line 1400
    move-result-object v1

    .line 1401
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1402
    .line 1403
    .line 1404
    const/16 p1, 0x118

    .line 1405
    .line 1406
    invoke-static {p1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 1407
    .line 1408
    .line 1409
    move-result-object p1

    .line 1410
    invoke-static {p1}, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 1411
    .line 1412
    .line 1413
    goto/16 :goto_18

    .line 1414
    .line 1415
    :cond_27
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 1416
    .line 1417
    .line 1418
    move-result-object v1

    .line 1419
    const-string v6, "\u545c\u55b5\u55b5\u545c\u55b5\u545c\u545c\u55b5~\u545c\u545c\u55b5\u55b5\u55b5\u545c\u55b5\u545c~\u545c\u545c\u545c\u545c\u55b5\u545c\u55b5\u545c~\u545c\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5~\u545c\u545c\u545c\u545c\u55b5\u55b5\u545c\u55b5~\u545c\u545c\u55b5\u545c\u545c\u55b5\u545c\u55b5"

    .line 1420
    .line 1421
    invoke-static {v6}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 1422
    .line 1423
    .line 1424
    move-result-object v6

    .line 1425
    invoke-virtual {p0, v6}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 1426
    .line 1427
    .line 1428
    move-result v6

    .line 1429
    invoke-virtual {p0, v10, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 1430
    .line 1431
    .line 1432
    move-result-object v6

    .line 1433
    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1434
    .line 1435
    .line 1436
    move-result v6

    .line 1437
    const/16 v7, 0xa

    .line 1438
    .line 1439
    invoke-virtual {v1, v7, v6}, Ljava/util/Calendar;->add(II)V

    .line 1440
    .line 1441
    .line 1442
    iget-object v6, v0, L飘花落叶言世哲楪苏子兰/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;

    .line 1443
    .line 1444
    invoke-static {v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 1445
    .line 1446
    .line 1447
    move-result-object v7

    .line 1448
    invoke-virtual {v1}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 1449
    .line 1450
    .line 1451
    move-result-wide v8

    .line 1452
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1453
    .line 1454
    .line 1455
    move-result-object v8

    .line 1456
    invoke-virtual {v6, v8, v7}, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1457
    .line 1458
    .line 1459
    invoke-virtual {v1}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 1460
    .line 1461
    .line 1462
    move-result-wide v6

    .line 1463
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1464
    .line 1465
    .line 1466
    move-result-wide v8

    .line 1467
    sub-long/2addr v6, v8

    .line 1468
    div-long/2addr v6, v3

    .line 1469
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1470
    .line 1471
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1472
    .line 1473
    .line 1474
    const-string v3, "\u545c\u55b5\u55b5\u545c\u55b5\u545c\u545c\u55b5~\u545c\u545c\u545c\u545c\u545c\u545c\u55b5\u55b5~\u545c\u545c\u55b5\u545c\u55b5\u55b5\u545c\u545c~\u545c\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5~\u545c\u545c\u55b5\u545c\u545c\u55b5\u55b5\u55b5~\u545c\u545c\u545c\u545c\u55b5\u545c\u55b5\u545c~\u55b5\u545c\u55b5\u55b5\u55b5\u55b5\u55b5\u545c"

    .line 1475
    .line 1476
    invoke-static {v3}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 1477
    .line 1478
    .line 1479
    move-result-object v3

    .line 1480
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1481
    .line 1482
    .line 1483
    invoke-virtual {v1, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1484
    .line 1485
    .line 1486
    const-string v3, "\u545c\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u545c~\u545c\u545c\u545c\u55b5\u55b5\u55b5\u545c\u55b5~\u545c\u545c\u55b5\u55b5\u545c\u545c\u55b5\u55b5"

    .line 1487
    .line 1488
    invoke-static {v3}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 1489
    .line 1490
    .line 1491
    move-result-object v3

    .line 1492
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1493
    .line 1494
    .line 1495
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1496
    .line 1497
    .line 1498
    move-result-object v1

    .line 1499
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1500
    .line 1501
    .line 1502
    new-instance p1, Ljava/lang/StringBuilder;

    .line 1503
    .line 1504
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1505
    .line 1506
    .line 1507
    const-string v1, "\u545c\u55b5\u55b5\u545c\u55b5\u545c\u545c\u55b5~\u545c\u545c\u55b5\u55b5\u55b5\u545c\u55b5\u545c~\u545c\u545c\u545c\u545c\u545c\u545c\u55b5\u55b5~\u545c\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c~\u545c\u545c\u545c\u545c\u545c\u55b5\u55b5\u545c~\u545c\u545c\u55b5\u55b5\u55b5\u545c\u55b5\u55b5~\u55b5\u545c\u55b5\u55b5\u55b5\u55b5\u55b5\u545c"

    .line 1508
    .line 1509
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 1510
    .line 1511
    .line 1512
    move-result-object v1

    .line 1513
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1514
    .line 1515
    .line 1516
    new-instance v1, Ljava/util/Date;

    .line 1517
    .line 1518
    iget-object v3, v0, L飘花落叶言世哲楪苏子兰/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;

    .line 1519
    .line 1520
    invoke-static {v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 1521
    .line 1522
    .line 1523
    move-result-object v2

    .line 1524
    invoke-virtual {v3, v2}, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Object;

    .line 1525
    .line 1526
    .line 1527
    move-result-object v2

    .line 1528
    check-cast v2, Ljava/lang/Long;

    .line 1529
    .line 1530
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 1531
    .line 1532
    .line 1533
    move-result-wide v2

    .line 1534
    invoke-direct {v1, v2, v3}, Ljava/util/Date;-><init>(J)V

    .line 1535
    .line 1536
    .line 1537
    const/16 v2, 0x119

    .line 1538
    .line 1539
    invoke-static {v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 1540
    .line 1541
    .line 1542
    move-result-object v2

    .line 1543
    :try_start_3
    new-instance v3, Ljava/text/SimpleDateFormat;

    .line 1544
    .line 1545
    invoke-direct {v3, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 1546
    .line 1547
    .line 1548
    invoke-virtual {v3, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 1549
    .line 1550
    .line 1551
    move-result-object v1
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 1552
    goto :goto_17

    .line 1553
    :catch_1
    const/16 v1, 0x110

    .line 1554
    .line 1555
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 1556
    .line 1557
    .line 1558
    move-result-object v1

    .line 1559
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1560
    .line 1561
    .line 1562
    move-result-object v1

    .line 1563
    :goto_17
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1564
    .line 1565
    .line 1566
    const-string v1, "\u55b5\u545c\u55b5\u545c\u55b5\u55b5\u545c\u545c~\u545c\u55b5\u55b5\u545c\u55b5\u55b5\u545c\u55b5~\u545c\u545c\u55b5\u55b5\u55b5\u55b5\u55b5\u545c~\u545c\u545c\u545c\u545c\u545c\u55b5\u545c\u545c~\u545c\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c~\u545c\u545c\u545c\u545c\u55b5\u55b5\u55b5\u545c~\u545c\u545c\u545c\u545c\u545c\u545c\u545c\u55b5"

    .line 1567
    .line 1568
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 1569
    .line 1570
    .line 1571
    move-result-object v1

    .line 1572
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1573
    .line 1574
    .line 1575
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1576
    .line 1577
    .line 1578
    move-result-object p1

    .line 1579
    invoke-static {p1}, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 1580
    .line 1581
    .line 1582
    :goto_18
    iget-object p1, v0, L飘花落叶言世哲楪苏子兰/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;

    .line 1583
    .line 1584
    invoke-static {v5}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 1585
    .line 1586
    .line 1587
    move-result-object v1

    .line 1588
    invoke-virtual {p1, p0, v1}, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1589
    .line 1590
    .line 1591
    iget-object p0, v0, L飘花落叶言世哲楪苏子兰/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;

    .line 1592
    .line 1593
    invoke-virtual {p0}, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏()V

    .line 1594
    .line 1595
    .line 1596
    :cond_28
    return-void

    .line 1597
    :pswitch_14
    iget-object p1, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 1598
    .line 1599
    check-cast p1, Ljava/io/File;

    .line 1600
    .line 1601
    iget-object p0, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1602
    .line 1603
    check-cast p0, L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏哲兰;

    .line 1604
    .line 1605
    invoke-static {p1}, Lkotlin/reflect/jvm/internal/飘花落叶言楪子世哲兰苏;->飘花落叶言子楪苏兰世哲(Ljava/io/File;)V

    .line 1606
    .line 1607
    .line 1608
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 1609
    .line 1610
    .line 1611
    return-void

    .line 1612
    :pswitch_15
    iget-object p1, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1613
    .line 1614
    check-cast p1, Landroid/app/Dialog;

    .line 1615
    .line 1616
    iget-object p0, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 1617
    .line 1618
    check-cast p0, Landroid/content/Context;

    .line 1619
    .line 1620
    sget-object v0, L飘花落叶言世哲兰子楪苏/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲兰苏:Ljava/lang/String;

    .line 1621
    .line 1622
    const/16 v1, 0x235

    .line 1623
    .line 1624
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 1625
    .line 1626
    .line 1627
    move-result-object v1

    .line 1628
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1629
    .line 1630
    .line 1631
    move-result v0

    .line 1632
    if-eqz v0, :cond_29

    .line 1633
    .line 1634
    const/16 p0, 0x236

    .line 1635
    .line 1636
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 1637
    .line 1638
    .line 1639
    move-result-object p0

    .line 1640
    invoke-static {p0}, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 1641
    .line 1642
    .line 1643
    goto :goto_19

    .line 1644
    :cond_29
    sget-object v0, L飘花落叶言世哲兰子楪苏/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲兰苏:Ljava/lang/String;

    .line 1645
    .line 1646
    invoke-static {p1, p0, v0}, L飘花落叶言世哲兰子楪苏/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰(Landroid/app/Dialog;Landroid/content/Context;Ljava/lang/String;)Landroid/widget/ScrollView;

    .line 1647
    .line 1648
    .line 1649
    move-result-object p0

    .line 1650
    invoke-virtual {p1, p0}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 1651
    .line 1652
    .line 1653
    :goto_19
    return-void

    .line 1654
    :pswitch_16
    iget-object p1, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1655
    .line 1656
    check-cast p1, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪兰哲苏世;

    .line 1657
    .line 1658
    iget-object p0, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 1659
    .line 1660
    check-cast p0, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪哲兰世苏;

    .line 1661
    .line 1662
    iget-object p1, p1, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世兰苏哲:Landroidx/activity/compose/飘花落叶言子楪世哲兰苏;

    .line 1663
    .line 1664
    invoke-virtual {p1, p0}, Landroidx/activity/compose/飘花落叶言子楪世哲兰苏;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1665
    .line 1666
    .line 1667
    return-void

    .line 1668
    :pswitch_17
    iget-object v0, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1669
    .line 1670
    check-cast v0, L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏哲兰;

    .line 1671
    .line 1672
    iget-object p0, p0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 1673
    .line 1674
    check-cast p0, Landroid/view/View$OnClickListener;

    .line 1675
    .line 1676
    invoke-static {v0, p0, p1}, Llin/xposed/hook/view/main/itemview/Update;->飘花落叶言子楪世苏哲兰(L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏哲兰;Landroid/view/View$OnClickListener;Landroid/view/View;)V

    .line 1677
    .line 1678
    .line 1679
    return-void

    .line 1680
    nop

    .line 1681
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
