.class public final synthetic L飘花落叶言苏哲楪兰世子/飘花落叶言子楪世哲苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, L飘花落叶言苏哲楪兰世子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, L飘花落叶言苏哲楪兰世子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

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
    .locals 8

    .line 1
    iget v0, p0, L飘花落叶言苏哲楪兰世子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object p0, p0, L飘花落叶言苏哲楪兰世子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲苏世兰;

    .line 10
    .line 11
    invoke-virtual {p0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲苏世兰;->飘花落叶言子世哲苏兰楪()V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_0
    check-cast p0, Landroidx/compose/runtime/internal/飘花落叶言子楪苏兰世哲;

    .line 16
    .line 17
    iget-object v0, p0, Landroidx/compose/runtime/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲世兰:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Landroid/widget/EditText;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    const-string v3, "inputEdit"

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Landroidx/compose/runtime/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, Landroid/content/Context;

    .line 32
    .line 33
    const-string v4, "input_method"

    .line 34
    .line 35
    invoke-virtual {v0, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 43
    .line 44
    iget-object p0, p0, Landroidx/compose/runtime/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲世兰:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p0, Landroid/widget/EditText;

    .line 47
    .line 48
    if-eqz p0, :cond_0

    .line 49
    .line 50
    invoke-virtual {v0, p0, v1}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_0
    invoke-static {v3}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw v2

    .line 58
    :cond_1
    invoke-static {v3}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw v2

    .line 62
    :pswitch_1
    check-cast p0, L飘花落叶言子苏世兰楪哲/飘花落叶言子楪苏兰哲世;

    .line 63
    .line 64
    iget-object v0, p0, L飘花落叶言子苏世兰楪哲/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v0, Landroid/os/Handler;

    .line 67
    .line 68
    :try_start_0
    invoke-static {}, L飘花落叶言世子哲苏兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子世哲苏兰楪()Ljava/util/ArrayList;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-static {}, Llin/xposed/hook/util/qq/QQEnvTool;->getCurrentUin()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    new-instance v4, Ljava/lang/StringBuilder;

    .line 77
    .line 78
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 79
    .line 80
    .line 81
    const/16 v5, 0xc2d

    .line 82
    .line 83
    invoke-static {v5}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    sget-object v5, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 98
    .line 99
    const-string v5, "\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5~\u55b5\u545c\u55b5\u55b5\u545c\u55b5\u55b5\u55b5~\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5"

    .line 100
    .line 101
    invoke-static {v5}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    invoke-static {v4, v5}, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    new-instance v4, Ljava/util/ArrayList;

    .line 109
    .line 110
    const/16 v5, 0xa

    .line 111
    .line 112
    invoke-static {v2, v5}, Lkotlin/collections/飘花落叶言子楪哲兰苏世;->飘花落叶言子哲楪苏世兰(Ljava/lang/Iterable;I)I

    .line 113
    .line 114
    .line 115
    move-result v5

    .line 116
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 124
    .line 125
    .line 126
    move-result v5

    .line 127
    if-eqz v5, :cond_2

    .line 128
    .line 129
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v5

    .line 133
    check-cast v5, Llin/xposed/hook/javaplugin/bean/GroupInfo;

    .line 134
    .line 135
    iget-object v6, v5, Llin/xposed/hook/javaplugin/bean/GroupInfo;->GroupOwner:Ljava/lang/String;

    .line 136
    .line 137
    invoke-static {v6, v3}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v6

    .line 141
    new-instance v7, L飘花落叶言苏哲楪子世兰/飘花落叶言子楪哲世兰苏;

    .line 142
    .line 143
    invoke-direct {v7, v5, v6}, L飘花落叶言苏哲楪子世兰/飘花落叶言子楪哲世兰苏;-><init>(Llin/xposed/hook/javaplugin/bean/GroupInfo;Z)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    goto :goto_0

    .line 150
    :catch_0
    move-exception p0

    .line 151
    goto :goto_1

    .line 152
    :cond_2
    new-instance v2, L飘花落叶言苏哲楪兰世子/飘花落叶言子楪世苏兰哲;

    .line 153
    .line 154
    const/4 v3, 0x5

    .line 155
    invoke-direct {v2, v4, v3, p0}, L飘花落叶言苏哲楪兰世子/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 159
    .line 160
    .line 161
    goto :goto_2

    .line 162
    :goto_1
    new-instance v2, L飘花落叶言苏哲楪子兰世/飘花落叶言子楪世苏哲兰;

    .line 163
    .line 164
    invoke-direct {v2, p0, v1}, L飘花落叶言苏哲楪子兰世/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/Exception;I)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 168
    .line 169
    .line 170
    :goto_2
    return-void

    .line 171
    :pswitch_2
    check-cast p0, L飘花落叶言苏哲楪子兰世/飘花落叶言子楪世兰苏哲;

    .line 172
    .line 173
    iget-object v0, p0, L飘花落叶言苏哲楪子兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰:Landroid/os/Handler;

    .line 174
    .line 175
    :try_start_1
    new-instance v1, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 176
    .line 177
    invoke-direct {v1}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 178
    .line 179
    .line 180
    sget-object v2, L飘花落叶言苏世楪子哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏世楪子哲兰/飘花落叶言子楪世苏哲兰;

    .line 181
    .line 182
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    invoke-static {}, L飘花落叶言苏世楪子哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲()Ljava/util/ArrayList;

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    iput-object v2, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 190
    .line 191
    new-instance v2, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 192
    .line 193
    invoke-direct {v2}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 194
    .line 195
    .line 196
    invoke-static {}, L飘花落叶言苏世楪子哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲()Ljava/util/LinkedHashMap;

    .line 197
    .line 198
    .line 199
    move-result-object v3

    .line 200
    iput-object v3, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 201
    .line 202
    iget-object v3, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 203
    .line 204
    check-cast v3, Ljava/util/ArrayList;

    .line 205
    .line 206
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 207
    .line 208
    .line 209
    move-result v3

    .line 210
    if-eqz v3, :cond_3

    .line 211
    .line 212
    invoke-static {}, Llin/xposed/hook/util/qq/QQFriendTool;->getAllFriendWithCategories()Llin/xposed/hook/util/qq/QQFriendTool$FriendListResult;

    .line 213
    .line 214
    .line 215
    move-result-object v3

    .line 216
    iget-object v4, v3, Llin/xposed/hook/util/qq/QQFriendTool$FriendListResult;->friends:Ljava/util/ArrayList;

    .line 217
    .line 218
    const-string v5, "\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c\u55b5"

    .line 219
    .line 220
    invoke-static {v5}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    iput-object v4, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 227
    .line 228
    iget-object v3, v3, Llin/xposed/hook/util/qq/QQFriendTool$FriendListResult;->categories:Ljava/util/Map;

    .line 229
    .line 230
    const/16 v4, 0xc1d

    .line 231
    .line 232
    invoke-static {v4}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    iput-object v3, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 239
    .line 240
    goto :goto_3

    .line 241
    :catch_1
    move-exception p0

    .line 242
    goto :goto_4

    .line 243
    :cond_3
    :goto_3
    new-instance v3, Landroidx/fragment/app/飘花落叶言子楪苏世哲兰;

    .line 244
    .line 245
    const/16 v4, 0xc

    .line 246
    .line 247
    invoke-direct {v3, v1, p0, v2, v4}, Landroidx/fragment/app/飘花落叶言子楪苏世哲兰;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v0, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 251
    .line 252
    .line 253
    goto :goto_5

    .line 254
    :goto_4
    new-instance v1, L飘花落叶言苏哲楪子兰世/飘花落叶言子楪世苏哲兰;

    .line 255
    .line 256
    const/4 v2, 0x0

    .line 257
    invoke-direct {v1, p0, v2}, L飘花落叶言苏哲楪子兰世/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/Exception;I)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 261
    .line 262
    .line 263
    :goto_5
    return-void

    .line 264
    :pswitch_3
    check-cast p0, L飘花落叶言世苏兰哲子楪/飘花落叶言子世兰楪苏哲;

    .line 265
    .line 266
    const-string v0, ""

    .line 267
    .line 268
    invoke-virtual {p0, v0}, L飘花落叶言世苏兰哲子楪/飘花落叶言子世兰楪苏哲;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    return-void

    .line 272
    nop

    .line 273
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
