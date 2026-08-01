.class public final synthetic L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世哲兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

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
    iget v0, p0, L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object p0, p0, L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

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
    invoke-static {}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰()Ljava/util/ArrayList;

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
    const-wide v5, -0x36a432ae051405a7L    # -2.4800241415212985E45

    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    sget-object v5, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 101
    .line 102
    const-wide v5, -0x36a5487d051405a7L    # -2.3832219749090976E45

    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    invoke-static {v4, v5}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    new-instance v4, Ljava/util/ArrayList;

    .line 115
    .line 116
    const/16 v5, 0xa

    .line 117
    .line 118
    invoke-static {v2, v5}, Lkotlin/collections/飘花落叶言子楪哲兰苏世;->飘花落叶言子世哲楪兰苏(Ljava/lang/Iterable;I)I

    .line 119
    .line 120
    .line 121
    move-result v5

    .line 122
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 130
    .line 131
    .line 132
    move-result v5

    .line 133
    if-eqz v5, :cond_2

    .line 134
    .line 135
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v5

    .line 139
    check-cast v5, Llin/xposed/hook/javaplugin/bean/GroupInfo;

    .line 140
    .line 141
    iget-object v6, v5, Llin/xposed/hook/javaplugin/bean/GroupInfo;->GroupOwner:Ljava/lang/String;

    .line 142
    .line 143
    invoke-static {v6, v3}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v6

    .line 147
    new-instance v7, L飘花落叶言苏哲楪子兰世/飘花落叶言子楪哲世兰苏;

    .line 148
    .line 149
    invoke-direct {v7, v5, v6}, L飘花落叶言苏哲楪子兰世/飘花落叶言子楪哲世兰苏;-><init>(Llin/xposed/hook/javaplugin/bean/GroupInfo;Z)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    goto :goto_0

    .line 156
    :catch_0
    move-exception p0

    .line 157
    goto :goto_1

    .line 158
    :cond_2
    new-instance v2, L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世哲苏兰;

    .line 159
    .line 160
    const/4 v3, 0x5

    .line 161
    invoke-direct {v2, v4, v3, p0}, L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世哲苏兰;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 165
    .line 166
    .line 167
    goto :goto_2

    .line 168
    :goto_1
    new-instance v2, L飘花落叶言苏哲楪世子兰/飘花落叶言子楪世苏哲兰;

    .line 169
    .line 170
    invoke-direct {v2, p0, v1}, L飘花落叶言苏哲楪世子兰/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/Exception;I)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 174
    .line 175
    .line 176
    :goto_2
    return-void

    .line 177
    :pswitch_2
    check-cast p0, L飘花落叶言苏哲楪世子兰/飘花落叶言子楪世兰苏哲;

    .line 178
    .line 179
    iget-object v0, p0, L飘花落叶言苏哲楪世子兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰:Landroid/os/Handler;

    .line 180
    .line 181
    :try_start_1
    new-instance v1, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 182
    .line 183
    invoke-direct {v1}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 184
    .line 185
    .line 186
    sget-object v2, L飘花落叶言苏世楪子兰哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏世楪子兰哲/飘花落叶言子楪世苏哲兰;

    .line 187
    .line 188
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    invoke-static {}, L飘花落叶言苏世楪子兰哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲()Ljava/util/ArrayList;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    iput-object v2, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 196
    .line 197
    new-instance v2, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 198
    .line 199
    invoke-direct {v2}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 200
    .line 201
    .line 202
    invoke-static {}, L飘花落叶言苏世楪子兰哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲()Ljava/util/LinkedHashMap;

    .line 203
    .line 204
    .line 205
    move-result-object v3

    .line 206
    iput-object v3, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 207
    .line 208
    iget-object v3, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 209
    .line 210
    check-cast v3, Ljava/util/ArrayList;

    .line 211
    .line 212
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 213
    .line 214
    .line 215
    move-result v3

    .line 216
    if-eqz v3, :cond_3

    .line 217
    .line 218
    invoke-static {}, Llin/xposed/hook/util/qq/QQFriendTool;->getAllFriendWithCategories()Llin/xposed/hook/util/qq/QQFriendTool$FriendListResult;

    .line 219
    .line 220
    .line 221
    move-result-object v3

    .line 222
    iget-object v4, v3, Llin/xposed/hook/util/qq/QQFriendTool$FriendListResult;->friends:Ljava/util/ArrayList;

    .line 223
    .line 224
    const-wide v5, -0x36a416f5051405a7L    # -2.48968407735345E45

    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 233
    .line 234
    .line 235
    iput-object v4, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 236
    .line 237
    iget-object v3, v3, Llin/xposed/hook/util/qq/QQFriendTool$FriendListResult;->categories:Ljava/util/Map;

    .line 238
    .line 239
    const-wide v4, -0x36a4333f051405a7L    # -2.4798267777484844E45

    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 248
    .line 249
    .line 250
    iput-object v3, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 251
    .line 252
    goto :goto_3

    .line 253
    :catch_1
    move-exception p0

    .line 254
    goto :goto_4

    .line 255
    :cond_3
    :goto_3
    new-instance v3, Landroidx/fragment/app/飘花落叶言子楪苏世哲兰;

    .line 256
    .line 257
    const/16 v4, 0xc

    .line 258
    .line 259
    invoke-direct {v3, v1, p0, v2, v4}, Landroidx/fragment/app/飘花落叶言子楪苏世哲兰;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v0, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 263
    .line 264
    .line 265
    goto :goto_5

    .line 266
    :goto_4
    new-instance v1, L飘花落叶言苏哲楪世子兰/飘花落叶言子楪世苏哲兰;

    .line 267
    .line 268
    const/4 v2, 0x0

    .line 269
    invoke-direct {v1, p0, v2}, L飘花落叶言苏哲楪世子兰/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/Exception;I)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 273
    .line 274
    .line 275
    :goto_5
    return-void

    .line 276
    :pswitch_3
    check-cast p0, L飘花落叶言世苏兰哲子楪/飘花落叶言子世兰楪苏哲;

    .line 277
    .line 278
    const-wide v0, -0x36a507c2051405a7L    # -2.405777251318085E45

    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    invoke-virtual {p0, v0}, L飘花落叶言世苏兰哲子楪/飘花落叶言子世兰楪苏哲;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    return-void

    .line 291
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
