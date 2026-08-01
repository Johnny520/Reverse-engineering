.class public final synthetic Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

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
    .locals 41

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲苏兰世:I

    .line 4
    .line 5
    const/16 v2, 0xd

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x1

    .line 10
    const/4 v6, 0x0

    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-object v0, v0, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, L飘花落叶言子苏世兰楪哲/飘花落叶言子楪苏兰世哲;

    .line 17
    .line 18
    iget-object v1, v0, L飘花落叶言子苏世兰楪哲/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Landroid/os/Handler;

    .line 21
    .line 22
    :try_start_0
    invoke-static {}, L飘花落叶言楪兰哲世苏子/飘花落叶言子楪世苏哲兰;->飘花落叶言子苏楪世兰哲()Ljava/util/ArrayList;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-static {}, Llin/xposed/hook/util/qq/QQEnvTool;->getCurrentUin()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    new-instance v4, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 33
    .line 34
    .line 35
    const/16 v6, 0xc9e

    .line 36
    .line 37
    invoke-static {v6}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v6

    .line 41
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    sget-object v6, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 52
    .line 53
    const-string v6, "\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5~\u55b5\u545c\u55b5\u55b5\u545c\u55b5\u55b5\u55b5~\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5"

    .line 54
    .line 55
    invoke-static {v6}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    invoke-static {v4, v6}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    new-instance v4, Ljava/util/ArrayList;

    .line 63
    .line 64
    const/16 v6, 0xa

    .line 65
    .line 66
    invoke-static {v2, v6}, Lkotlin/collections/飘花落叶言子楪哲兰苏世;->飘花落叶言子苏世兰哲楪(Ljava/lang/Iterable;I)I

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 78
    .line 79
    .line 80
    move-result v6

    .line 81
    if-eqz v6, :cond_0

    .line 82
    .line 83
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    check-cast v6, Llin/xposed/hook/javaplugin/bean/GroupInfo;

    .line 88
    .line 89
    iget-object v7, v6, Llin/xposed/hook/javaplugin/bean/GroupInfo;->GroupOwner:Ljava/lang/String;

    .line 90
    .line 91
    invoke-static {v7, v3}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v7

    .line 95
    new-instance v8, L飘花落叶言苏哲世楪子兰/飘花落叶言子楪哲世兰苏;

    .line 96
    .line 97
    invoke-direct {v8, v6, v7}, L飘花落叶言苏哲世楪子兰/飘花落叶言子楪哲世兰苏;-><init>(Llin/xposed/hook/javaplugin/bean/GroupInfo;Z)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    goto :goto_0

    .line 104
    :catch_0
    move-exception v0

    .line 105
    goto :goto_1

    .line 106
    :cond_0
    new-instance v2, Landroidx/appcompat/app/飘花落叶言子楪哲兰苏世;

    .line 107
    .line 108
    const/16 v3, 0x1d

    .line 109
    .line 110
    invoke-direct {v2, v4, v3, v0}, Landroidx/appcompat/app/飘花落叶言子楪哲兰苏世;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 114
    .line 115
    .line 116
    goto :goto_2

    .line 117
    :goto_1
    new-instance v2, L飘花落叶言苏哲世楪兰子/飘花落叶言子楪世苏哲兰;

    .line 118
    .line 119
    invoke-direct {v2, v0, v5}, L飘花落叶言苏哲世楪兰子/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/Exception;I)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 123
    .line 124
    .line 125
    :goto_2
    return-void

    .line 126
    :pswitch_0
    iget-object v0, v0, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v0, L飘花落叶言苏哲世楪兰子/飘花落叶言子楪世兰苏哲;

    .line 129
    .line 130
    iget-object v1, v0, L飘花落叶言苏哲世楪兰子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰:Landroid/os/Handler;

    .line 131
    .line 132
    :try_start_1
    new-instance v2, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 133
    .line 134
    invoke-direct {v2}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 135
    .line 136
    .line 137
    sget-object v3, L飘花落叶言苏世哲子兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏世哲子兰楪/飘花落叶言子楪世苏哲兰;

    .line 138
    .line 139
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    invoke-static {}, L飘花落叶言苏世哲子兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲()Ljava/util/ArrayList;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    iput-object v3, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 147
    .line 148
    new-instance v3, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 149
    .line 150
    invoke-direct {v3}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 151
    .line 152
    .line 153
    invoke-static {}, L飘花落叶言苏世哲子兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲()Ljava/util/LinkedHashMap;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    iput-object v4, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 158
    .line 159
    iget-object v4, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v4, Ljava/util/ArrayList;

    .line 162
    .line 163
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 164
    .line 165
    .line 166
    move-result v4

    .line 167
    if-eqz v4, :cond_1

    .line 168
    .line 169
    invoke-static {}, Llin/xposed/hook/util/qq/QQFriendTool;->getAllFriendWithCategories()Llin/xposed/hook/util/qq/QQFriendTool$FriendListResult;

    .line 170
    .line 171
    .line 172
    move-result-object v4

    .line 173
    iget-object v5, v4, Llin/xposed/hook/util/qq/QQFriendTool$FriendListResult;->friends:Ljava/util/ArrayList;

    .line 174
    .line 175
    const-string v7, "\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c\u55b5"

    .line 176
    .line 177
    invoke-static {v7}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    iput-object v5, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 184
    .line 185
    iget-object v4, v4, Llin/xposed/hook/util/qq/QQFriendTool$FriendListResult;->categories:Ljava/util/Map;

    .line 186
    .line 187
    const/16 v5, 0xc8e

    .line 188
    .line 189
    invoke-static {v5}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    iput-object v4, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 196
    .line 197
    goto :goto_3

    .line 198
    :catch_1
    move-exception v0

    .line 199
    goto :goto_4

    .line 200
    :cond_1
    :goto_3
    new-instance v4, Landroidx/fragment/app/飘花落叶言子楪苏世哲兰;

    .line 201
    .line 202
    const/16 v5, 0xc

    .line 203
    .line 204
    invoke-direct {v4, v2, v0, v3, v5}, Landroidx/fragment/app/飘花落叶言子楪苏世哲兰;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v1, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 208
    .line 209
    .line 210
    goto :goto_5

    .line 211
    :goto_4
    new-instance v2, L飘花落叶言苏哲世楪兰子/飘花落叶言子楪世苏哲兰;

    .line 212
    .line 213
    invoke-direct {v2, v0, v6}, L飘花落叶言苏哲世楪兰子/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/Exception;I)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 217
    .line 218
    .line 219
    :goto_5
    return-void

    .line 220
    :pswitch_1
    iget-object v0, v0, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 221
    .line 222
    check-cast v0, L飘花落叶言楪哲苏世子兰/飘花落叶言子楪哲苏世兰;

    .line 223
    .line 224
    invoke-virtual {v0}, L飘花落叶言楪哲苏世子兰/飘花落叶言子楪哲苏世兰;->飘花落叶言子世哲苏兰楪()V

    .line 225
    .line 226
    .line 227
    return-void

    .line 228
    :pswitch_2
    iget-object v0, v0, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 229
    .line 230
    check-cast v0, Landroidx/compose/runtime/internal/飘花落叶言子楪苏兰世哲;

    .line 231
    .line 232
    const-string v1, "inputEdit"

    .line 233
    .line 234
    iget-object v2, v0, Landroidx/compose/runtime/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲世兰:Ljava/lang/Object;

    .line 235
    .line 236
    check-cast v2, Landroid/widget/EditText;

    .line 237
    .line 238
    if-eqz v2, :cond_3

    .line 239
    .line 240
    invoke-virtual {v2}, Landroid/view/View;->requestFocus()Z

    .line 241
    .line 242
    .line 243
    iget-object v2, v0, Landroidx/compose/runtime/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/Object;

    .line 244
    .line 245
    check-cast v2, Landroid/content/Context;

    .line 246
    .line 247
    const-string v3, "input_method"

    .line 248
    .line 249
    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v2

    .line 253
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    check-cast v2, Landroid/view/inputmethod/InputMethodManager;

    .line 257
    .line 258
    iget-object v0, v0, Landroidx/compose/runtime/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲世兰:Ljava/lang/Object;

    .line 259
    .line 260
    check-cast v0, Landroid/widget/EditText;

    .line 261
    .line 262
    if-eqz v0, :cond_2

    .line 263
    .line 264
    invoke-virtual {v2, v0, v5}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 265
    .line 266
    .line 267
    return-void

    .line 268
    :cond_2
    invoke-static {v1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    throw v4

    .line 272
    :cond_3
    invoke-static {v1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    throw v4

    .line 276
    :pswitch_3
    iget-object v0, v0, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 277
    .line 278
    check-cast v0, L飘花落叶言楪苏子哲兰世/飘花落叶言子楪世哲苏兰;

    .line 279
    .line 280
    iput-boolean v6, v0, L飘花落叶言楪苏子哲兰世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲兰世:Z

    .line 281
    .line 282
    sget-object v1, L飘花落叶言楪苏子哲世兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言楪苏子哲世兰/飘花落叶言子楪世苏兰哲;

    .line 283
    .line 284
    invoke-virtual {v0, v1}, L飘花落叶言楪苏子哲兰世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世哲苏(L飘花落叶言世苏楪兰哲子/飘花落叶言子楪世兰哲苏;)V

    .line 285
    .line 286
    .line 287
    iget-object v0, v0, L飘花落叶言楪苏子哲兰世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世兰哲:L飘花落叶言楪世子兰哲苏/飘花落叶言子楪世兰苏哲;

    .line 288
    .line 289
    if-eqz v0, :cond_4

    .line 290
    .line 291
    iget-object v0, v0, L飘花落叶言楪世子兰哲苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 292
    .line 293
    check-cast v0, L飘花落叶言苏世子楪兰哲/飘花落叶言子楪世兰哲苏;

    .line 294
    .line 295
    invoke-static {v0}, L飘花落叶言苏世子楪兰哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰(L飘花落叶言苏世子楪兰哲/飘花落叶言子楪世兰哲苏;)V

    .line 296
    .line 297
    .line 298
    :cond_4
    return-void

    .line 299
    :pswitch_4
    iget-object v0, v0, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 300
    .line 301
    check-cast v0, Landroidx/compose/ui/platform/飘花落叶言子苏兰世楪哲;

    .line 302
    .line 303
    iput-boolean v6, v0, Landroidx/compose/ui/platform/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏兰哲:Z

    .line 304
    .line 305
    iget-object v1, v0, Landroidx/compose/ui/platform/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世兰苏哲:Ljava/lang/Object;

    .line 306
    .line 307
    check-cast v1, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 308
    .line 309
    iget-object v2, v1, Lcom/google/android/material/sidesheet/SideSheetBehavior;->飘花落叶言子楪苏哲世兰:L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;

    .line 310
    .line 311
    if-eqz v2, :cond_5

    .line 312
    .line 313
    invoke-virtual {v2, v5}, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏(Z)Z

    .line 314
    .line 315
    .line 316
    move-result v2

    .line 317
    if-eqz v2, :cond_5

    .line 318
    .line 319
    iget v1, v0, Landroidx/compose/ui/platform/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世哲苏兰:I

    .line 320
    .line 321
    invoke-virtual {v0, v1}, Landroidx/compose/ui/platform/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏哲兰(I)V

    .line 322
    .line 323
    .line 324
    goto :goto_6

    .line 325
    :cond_5
    iget v2, v1, Lcom/google/android/material/sidesheet/SideSheetBehavior;->飘花落叶言子楪苏世兰哲:I

    .line 326
    .line 327
    if-ne v2, v3, :cond_6

    .line 328
    .line 329
    iget v0, v0, Landroidx/compose/ui/platform/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世哲苏兰:I

    .line 330
    .line 331
    invoke-virtual {v1, v0}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->飘花落叶言子楪哲兰苏世(I)V

    .line 332
    .line 333
    .line 334
    :cond_6
    :goto_6
    return-void

    .line 335
    :pswitch_5
    iget-object v0, v0, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 336
    .line 337
    move-object v1, v0

    .line 338
    check-cast v1, L飘花落叶言子哲苏兰楪世/飘花落叶言子楪哲兰苏世;

    .line 339
    .line 340
    const-string v0, "fetchFonts result is not OK. ("

    .line 341
    .line 342
    iget-object v2, v1, L飘花落叶言子哲苏兰楪世/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 343
    .line 344
    monitor-enter v2

    .line 345
    :try_start_2
    iget-object v4, v1, L飘花落叶言子哲苏兰楪世/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪兰哲世苏:L飘花落叶言楪兰世子哲苏/飘花落叶言子楪哲世兰苏;

    .line 346
    .line 347
    if-nez v4, :cond_7

    .line 348
    .line 349
    monitor-exit v2

    .line 350
    goto/16 :goto_d

    .line 351
    .line 352
    :catchall_0
    move-exception v0

    .line 353
    goto/16 :goto_f

    .line 354
    .line 355
    :cond_7
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 356
    :try_start_3
    invoke-virtual {v1}, L飘花落叶言子哲苏兰楪世/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰()L飘花落叶言子哲世楪苏兰/飘花落叶言子楪苏世兰哲;

    .line 357
    .line 358
    .line 359
    move-result-object v2

    .line 360
    iget v4, v2, L飘花落叶言子哲世楪苏兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰哲苏:I

    .line 361
    .line 362
    if-ne v4, v3, :cond_8

    .line 363
    .line 364
    iget-object v3, v1, L飘花落叶言子哲苏兰楪世/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 365
    .line 366
    monitor-enter v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 367
    :try_start_4
    monitor-exit v3

    .line 368
    goto :goto_7

    .line 369
    :catchall_1
    move-exception v0

    .line 370
    monitor-exit v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 371
    :try_start_5
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 372
    :catchall_2
    move-exception v0

    .line 373
    goto/16 :goto_b

    .line 374
    .line 375
    :cond_8
    :goto_7
    if-nez v4, :cond_b

    .line 376
    .line 377
    :try_start_6
    const-string v0, "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface"

    .line 378
    .line 379
    sget-object v3, Landroidx/core/os/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲:Ljava/lang/reflect/Method;

    .line 380
    .line 381
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 382
    .line 383
    .line 384
    iget-object v0, v1, L飘花落叶言子哲苏兰楪世/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲兰苏世:L飘花落叶言世哲苏子楪兰/飘花落叶言子苏楪世哲兰;

    .line 385
    .line 386
    iget-object v3, v1, L飘花落叶言子哲苏兰楪世/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲苏兰世:Landroid/content/Context;

    .line 387
    .line 388
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 389
    .line 390
    .line 391
    filled-new-array {v2}, [L飘花落叶言子哲世楪苏兰/飘花落叶言子楪苏世兰哲;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    sget-object v4, L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏世哲兰;

    .line 396
    .line 397
    const-string v4, "TypefaceCompat.createFromFontInfo"

    .line 398
    .line 399
    invoke-static {v4}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 400
    .line 401
    .line 402
    :try_start_7
    sget-object v4, L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏世哲兰;

    .line 403
    .line 404
    invoke-virtual {v4, v3, v0, v6}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏(Landroid/content/Context;[L飘花落叶言子哲世楪苏兰/飘花落叶言子楪苏世兰哲;I)Landroid/graphics/Typeface;

    .line 405
    .line 406
    .line 407
    move-result-object v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 408
    :try_start_8
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 409
    .line 410
    .line 411
    iget-object v3, v1, L飘花落叶言子哲苏兰楪世/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲苏兰世:Landroid/content/Context;

    .line 412
    .line 413
    iget-object v2, v2, L飘花落叶言子哲世楪苏兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Landroid/net/Uri;

    .line 414
    .line 415
    invoke-static {v3, v2}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪苏哲兰(Landroid/content/Context;Landroid/net/Uri;)Ljava/nio/MappedByteBuffer;

    .line 416
    .line 417
    .line 418
    move-result-object v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 419
    if-eqz v2, :cond_a

    .line 420
    .line 421
    if-eqz v0, :cond_a

    .line 422
    .line 423
    :try_start_9
    const-string v3, "EmojiCompat.MetadataRepo.create"

    .line 424
    .line 425
    invoke-static {v3}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 426
    .line 427
    .line 428
    new-instance v3, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;

    .line 429
    .line 430
    invoke-static {v2}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子世苏哲兰楪(Ljava/nio/MappedByteBuffer;)Landroidx/emoji2/text/flatbuffer/飘花落叶言子楪世苏兰哲;

    .line 431
    .line 432
    .line 433
    move-result-object v2

    .line 434
    invoke-direct {v3, v0, v2}, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;-><init>(Landroid/graphics/Typeface;Landroidx/emoji2/text/flatbuffer/飘花落叶言子楪世苏兰哲;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 435
    .line 436
    .line 437
    :try_start_a
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    .line 438
    .line 439
    .line 440
    :try_start_b
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 441
    .line 442
    .line 443
    iget-object v2, v1, L飘花落叶言子哲苏兰楪世/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 444
    .line 445
    monitor-enter v2
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 446
    :try_start_c
    iget-object v0, v1, L飘花落叶言子哲苏兰楪世/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪兰哲世苏:L飘花落叶言楪兰世子哲苏/飘花落叶言子楪哲世兰苏;

    .line 447
    .line 448
    if-eqz v0, :cond_9

    .line 449
    .line 450
    invoke-virtual {v0, v3}, L飘花落叶言楪兰世子哲苏/飘花落叶言子楪哲世兰苏;->飘花落叶言子世哲苏楪兰(Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;)V

    .line 451
    .line 452
    .line 453
    goto :goto_8

    .line 454
    :catchall_3
    move-exception v0

    .line 455
    goto :goto_9

    .line 456
    :cond_9
    :goto_8
    monitor-exit v2
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    .line 457
    :try_start_d
    invoke-virtual {v1}, L飘花落叶言子哲苏兰楪世/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    .line 458
    .line 459
    .line 460
    goto :goto_d

    .line 461
    :goto_9
    :try_start_e
    monitor-exit v2
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_3

    .line 462
    :try_start_f
    throw v0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_2

    .line 463
    :catchall_4
    move-exception v0

    .line 464
    :try_start_10
    sget-object v2, Landroidx/core/os/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲:Ljava/lang/reflect/Method;

    .line 465
    .line 466
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 467
    .line 468
    .line 469
    throw v0

    .line 470
    :cond_a
    new-instance v0, Ljava/lang/RuntimeException;

    .line 471
    .line 472
    const-string v2, "Unable to open file."

    .line 473
    .line 474
    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 475
    .line 476
    .line 477
    throw v0

    .line 478
    :catchall_5
    move-exception v0

    .line 479
    goto :goto_a

    .line 480
    :catchall_6
    move-exception v0

    .line 481
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 482
    .line 483
    .line 484
    throw v0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_5

    .line 485
    :goto_a
    :try_start_11
    sget-object v2, Landroidx/core/os/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲:Ljava/lang/reflect/Method;

    .line 486
    .line 487
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 488
    .line 489
    .line 490
    throw v0

    .line 491
    :cond_b
    new-instance v2, Ljava/lang/RuntimeException;

    .line 492
    .line 493
    new-instance v3, Ljava/lang/StringBuilder;

    .line 494
    .line 495
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 496
    .line 497
    .line 498
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 499
    .line 500
    .line 501
    const-string v0, ")"

    .line 502
    .line 503
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 504
    .line 505
    .line 506
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 507
    .line 508
    .line 509
    move-result-object v0

    .line 510
    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 511
    .line 512
    .line 513
    throw v2
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_2

    .line 514
    :goto_b
    iget-object v3, v1, L飘花落叶言子哲苏兰楪世/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 515
    .line 516
    monitor-enter v3

    .line 517
    :try_start_12
    iget-object v2, v1, L飘花落叶言子哲苏兰楪世/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪兰哲世苏:L飘花落叶言楪兰世子哲苏/飘花落叶言子楪哲世兰苏;

    .line 518
    .line 519
    if-eqz v2, :cond_c

    .line 520
    .line 521
    invoke-virtual {v2, v0}, L飘花落叶言楪兰世子哲苏/飘花落叶言子楪哲世兰苏;->飘花落叶言子世苏兰楪哲(Ljava/lang/Throwable;)V

    .line 522
    .line 523
    .line 524
    goto :goto_c

    .line 525
    :catchall_7
    move-exception v0

    .line 526
    goto :goto_e

    .line 527
    :cond_c
    :goto_c
    monitor-exit v3
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_7

    .line 528
    invoke-virtual {v1}, L飘花落叶言子哲苏兰楪世/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲()V

    .line 529
    .line 530
    .line 531
    :goto_d
    return-void

    .line 532
    :goto_e
    :try_start_13
    monitor-exit v3
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_7

    .line 533
    throw v0

    .line 534
    :goto_f
    :try_start_14
    monitor-exit v2
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_0

    .line 535
    throw v0

    .line 536
    :pswitch_6
    iget-object v0, v0, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 537
    .line 538
    check-cast v0, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世苏兰哲;

    .line 539
    .line 540
    iget-object v0, v0, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪兰世苏哲;

    .line 541
    .line 542
    iget-object v0, v0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲苏兰世:Ljava/lang/Object;

    .line 543
    .line 544
    check-cast v0, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世苏兰哲;

    .line 545
    .line 546
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 547
    .line 548
    .line 549
    move-result-wide v1

    .line 550
    iget-object v3, v0, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Ljava/util/ArrayList;

    .line 551
    .line 552
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 553
    .line 554
    .line 555
    move-result-wide v7

    .line 556
    move v9, v6

    .line 557
    :goto_10
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 558
    .line 559
    .line 560
    move-result v10

    .line 561
    if-ge v9, v10, :cond_1b

    .line 562
    .line 563
    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 564
    .line 565
    .line 566
    move-result-object v10

    .line 567
    check-cast v10, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;

    .line 568
    .line 569
    if-nez v10, :cond_e

    .line 570
    .line 571
    :cond_d
    :goto_11
    move-wide/from16 v32, v7

    .line 572
    .line 573
    move v5, v9

    .line 574
    goto/16 :goto_1a

    .line 575
    .line 576
    :cond_e
    iget-object v11, v0, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Landroidx/collection/飘花落叶言子苏世哲兰楪;

    .line 577
    .line 578
    invoke-virtual {v11, v10}, Landroidx/collection/飘花落叶言子苏世哲兰楪;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 579
    .line 580
    .line 581
    move-result-object v12

    .line 582
    check-cast v12, Ljava/lang/Long;

    .line 583
    .line 584
    if-nez v12, :cond_f

    .line 585
    .line 586
    goto :goto_12

    .line 587
    :cond_f
    invoke-virtual {v12}, Ljava/lang/Long;->longValue()J

    .line 588
    .line 589
    .line 590
    move-result-wide v12

    .line 591
    cmp-long v12, v12, v7

    .line 592
    .line 593
    if-gez v12, :cond_d

    .line 594
    .line 595
    invoke-virtual {v11, v10}, Landroidx/collection/飘花落叶言子苏世哲兰楪;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 596
    .line 597
    .line 598
    :goto_12
    iget-wide v11, v10, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世哲兰:J

    .line 599
    .line 600
    const-wide/16 v13, 0x0

    .line 601
    .line 602
    cmp-long v15, v11, v13

    .line 603
    .line 604
    if-nez v15, :cond_10

    .line 605
    .line 606
    iput-wide v1, v10, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世哲兰:J

    .line 607
    .line 608
    iget v11, v10, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:F

    .line 609
    .line 610
    invoke-virtual {v10, v11}, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲(F)V

    .line 611
    .line 612
    .line 613
    goto :goto_11

    .line 614
    :cond_10
    sub-long v11, v1, v11

    .line 615
    .line 616
    iput-wide v1, v10, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世哲兰:J

    .line 617
    .line 618
    invoke-static {}, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰()L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世苏兰哲;

    .line 619
    .line 620
    .line 621
    move-result-object v15

    .line 622
    iget v15, v15, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰:F

    .line 623
    .line 624
    const/4 v13, 0x0

    .line 625
    cmpl-float v14, v15, v13

    .line 626
    .line 627
    if-nez v14, :cond_11

    .line 628
    .line 629
    const-wide/32 v11, 0x7fffffff

    .line 630
    .line 631
    .line 632
    :goto_13
    move-wide/from16 v22, v11

    .line 633
    .line 634
    goto :goto_14

    .line 635
    :cond_11
    long-to-float v11, v11

    .line 636
    div-float/2addr v11, v15

    .line 637
    float-to-long v11, v11

    .line 638
    goto :goto_13

    .line 639
    :goto_14
    move-object v11, v10

    .line 640
    check-cast v11, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世哲兰;

    .line 641
    .line 642
    iget-boolean v12, v11, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世苏哲:Z

    .line 643
    .line 644
    iget v14, v11, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:F

    .line 645
    .line 646
    const v15, 0x7f7fffff    # Float.MAX_VALUE

    .line 647
    .line 648
    .line 649
    if-eqz v12, :cond_13

    .line 650
    .line 651
    cmpl-float v12, v14, v15

    .line 652
    .line 653
    if-eqz v12, :cond_12

    .line 654
    .line 655
    iget-object v12, v11, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世兰哲;

    .line 656
    .line 657
    float-to-double v4, v14

    .line 658
    iput-wide v4, v12, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏哲世兰:D

    .line 659
    .line 660
    iput v15, v11, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:F

    .line 661
    .line 662
    :cond_12
    iget-object v4, v11, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世兰哲;

    .line 663
    .line 664
    iget-wide v4, v4, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏哲世兰:D

    .line 665
    .line 666
    double-to-float v4, v4

    .line 667
    iput v4, v11, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:F

    .line 668
    .line 669
    iput v13, v11, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:F

    .line 670
    .line 671
    iput-boolean v6, v11, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世苏哲:Z

    .line 672
    .line 673
    move-wide/from16 v32, v7

    .line 674
    .line 675
    move v5, v9

    .line 676
    :goto_15
    const/4 v4, 0x1

    .line 677
    goto/16 :goto_17

    .line 678
    .line 679
    :cond_13
    cmpl-float v4, v14, v15

    .line 680
    .line 681
    iget-object v5, v11, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世兰哲;

    .line 682
    .line 683
    iget v12, v11, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:F

    .line 684
    .line 685
    iget v14, v11, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:F

    .line 686
    .line 687
    if-eqz v4, :cond_14

    .line 688
    .line 689
    move-wide/from16 v32, v7

    .line 690
    .line 691
    float-to-double v6, v12

    .line 692
    move-object/from16 v25, v5

    .line 693
    .line 694
    float-to-double v4, v14

    .line 695
    const-wide/16 v17, 0x2

    .line 696
    .line 697
    div-long v30, v22, v17

    .line 698
    .line 699
    move-wide/from16 v28, v4

    .line 700
    .line 701
    move-wide/from16 v26, v6

    .line 702
    .line 703
    invoke-virtual/range {v25 .. v31}, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰(DDJ)Landroidx/compose/animation/飘花落叶言子世哲苏楪兰;

    .line 704
    .line 705
    .line 706
    move-result-object v4

    .line 707
    iget-object v5, v11, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世兰哲;

    .line 708
    .line 709
    iget v6, v11, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:F

    .line 710
    .line 711
    float-to-double v6, v6

    .line 712
    iput-wide v6, v5, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏哲世兰:D

    .line 713
    .line 714
    iput v15, v11, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:F

    .line 715
    .line 716
    iget v6, v4, Landroidx/compose/animation/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪哲苏兰世:F

    .line 717
    .line 718
    float-to-double v6, v6

    .line 719
    iget v4, v4, Landroidx/compose/animation/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪哲兰世苏:F

    .line 720
    .line 721
    float-to-double v13, v4

    .line 722
    move-object/from16 v34, v5

    .line 723
    .line 724
    move-wide/from16 v35, v6

    .line 725
    .line 726
    move-wide/from16 v37, v13

    .line 727
    .line 728
    move-wide/from16 v39, v30

    .line 729
    .line 730
    invoke-virtual/range {v34 .. v40}, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰(DDJ)Landroidx/compose/animation/飘花落叶言子世哲苏楪兰;

    .line 731
    .line 732
    .line 733
    move-result-object v4

    .line 734
    iget v5, v4, Landroidx/compose/animation/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪哲苏兰世:F

    .line 735
    .line 736
    iput v5, v11, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:F

    .line 737
    .line 738
    iget v4, v4, Landroidx/compose/animation/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪哲兰世苏:F

    .line 739
    .line 740
    iput v4, v11, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:F

    .line 741
    .line 742
    goto :goto_16

    .line 743
    :cond_14
    move-object/from16 v25, v5

    .line 744
    .line 745
    move-wide/from16 v32, v7

    .line 746
    .line 747
    float-to-double v4, v12

    .line 748
    float-to-double v6, v14

    .line 749
    move-wide/from16 v18, v4

    .line 750
    .line 751
    move-wide/from16 v20, v6

    .line 752
    .line 753
    move-object/from16 v17, v25

    .line 754
    .line 755
    invoke-virtual/range {v17 .. v23}, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰(DDJ)Landroidx/compose/animation/飘花落叶言子世哲苏楪兰;

    .line 756
    .line 757
    .line 758
    move-result-object v4

    .line 759
    iget v5, v4, Landroidx/compose/animation/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪哲苏兰世:F

    .line 760
    .line 761
    iput v5, v11, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:F

    .line 762
    .line 763
    iget v4, v4, Landroidx/compose/animation/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪哲兰世苏:F

    .line 764
    .line 765
    iput v4, v11, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:F

    .line 766
    .line 767
    :goto_16
    iget v4, v11, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:F

    .line 768
    .line 769
    iget v5, v11, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏:F

    .line 770
    .line 771
    invoke-static {v4, v5}, Ljava/lang/Math;->max(FF)F

    .line 772
    .line 773
    .line 774
    move-result v4

    .line 775
    iput v4, v11, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:F

    .line 776
    .line 777
    invoke-static {v4, v15}, Ljava/lang/Math;->min(FF)F

    .line 778
    .line 779
    .line 780
    move-result v4

    .line 781
    iput v4, v11, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:F

    .line 782
    .line 783
    iget v5, v11, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:F

    .line 784
    .line 785
    iget-object v6, v11, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世兰哲;

    .line 786
    .line 787
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 788
    .line 789
    .line 790
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    .line 791
    .line 792
    .line 793
    move-result v5

    .line 794
    float-to-double v12, v5

    .line 795
    move v5, v9

    .line 796
    iget-wide v8, v6, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰苏哲:D

    .line 797
    .line 798
    cmpg-double v8, v12, v8

    .line 799
    .line 800
    if-gez v8, :cond_15

    .line 801
    .line 802
    iget-wide v8, v6, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏哲世兰:D

    .line 803
    .line 804
    double-to-float v8, v8

    .line 805
    sub-float/2addr v4, v8

    .line 806
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 807
    .line 808
    .line 809
    move-result v4

    .line 810
    float-to-double v8, v4

    .line 811
    iget-wide v12, v6, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲兰苏:D

    .line 812
    .line 813
    cmpg-double v4, v8, v12

    .line 814
    .line 815
    if-gez v4, :cond_15

    .line 816
    .line 817
    iget-object v4, v11, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世兰哲;

    .line 818
    .line 819
    iget-wide v8, v4, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏哲世兰:D

    .line 820
    .line 821
    double-to-float v4, v8

    .line 822
    iput v4, v11, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:F

    .line 823
    .line 824
    const/4 v7, 0x0

    .line 825
    iput v7, v11, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:F

    .line 826
    .line 827
    goto/16 :goto_15

    .line 828
    .line 829
    :cond_15
    const/4 v4, 0x0

    .line 830
    :goto_17
    iget v6, v10, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:F

    .line 831
    .line 832
    invoke-static {v6, v15}, Ljava/lang/Math;->min(FF)F

    .line 833
    .line 834
    .line 835
    move-result v6

    .line 836
    iput v6, v10, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:F

    .line 837
    .line 838
    iget v7, v10, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏:F

    .line 839
    .line 840
    invoke-static {v6, v7}, Ljava/lang/Math;->max(FF)F

    .line 841
    .line 842
    .line 843
    move-result v6

    .line 844
    iput v6, v10, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:F

    .line 845
    .line 846
    invoke-virtual {v10, v6}, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲(F)V

    .line 847
    .line 848
    .line 849
    if-eqz v4, :cond_1a

    .line 850
    .line 851
    iget-object v6, v10, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰:Ljava/util/ArrayList;

    .line 852
    .line 853
    const/4 v4, 0x0

    .line 854
    iput-boolean v4, v10, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲:Z

    .line 855
    .line 856
    invoke-static {}, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰()L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世苏兰哲;

    .line 857
    .line 858
    .line 859
    move-result-object v7

    .line 860
    iget-object v8, v7, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Landroidx/collection/飘花落叶言子苏世哲兰楪;

    .line 861
    .line 862
    invoke-virtual {v8, v10}, Landroidx/collection/飘花落叶言子苏世哲兰楪;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 863
    .line 864
    .line 865
    iget-object v8, v7, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Ljava/util/ArrayList;

    .line 866
    .line 867
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 868
    .line 869
    .line 870
    move-result v9

    .line 871
    if-ltz v9, :cond_16

    .line 872
    .line 873
    const/4 v11, 0x0

    .line 874
    invoke-virtual {v8, v9, v11}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 875
    .line 876
    .line 877
    const/4 v8, 0x1

    .line 878
    iput-boolean v8, v7, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏:Z

    .line 879
    .line 880
    :cond_16
    const-wide/16 v7, 0x0

    .line 881
    .line 882
    iput-wide v7, v10, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世哲兰:J

    .line 883
    .line 884
    const/4 v7, 0x0

    .line 885
    :goto_18
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 886
    .line 887
    .line 888
    move-result v8

    .line 889
    if-ge v7, v8, :cond_18

    .line 890
    .line 891
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 892
    .line 893
    .line 894
    move-result-object v8

    .line 895
    if-nez v8, :cond_17

    .line 896
    .line 897
    add-int/lit8 v7, v7, 0x1

    .line 898
    .line 899
    goto :goto_18

    .line 900
    :cond_17
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 901
    .line 902
    .line 903
    move-result-object v0

    .line 904
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 905
    .line 906
    .line 907
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰()V

    .line 908
    .line 909
    .line 910
    goto :goto_1c

    .line 911
    :cond_18
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 912
    .line 913
    .line 914
    move-result v7

    .line 915
    const/16 v24, 0x1

    .line 916
    .line 917
    add-int/lit8 v7, v7, -0x1

    .line 918
    .line 919
    :goto_19
    if-ltz v7, :cond_1a

    .line 920
    .line 921
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 922
    .line 923
    .line 924
    move-result-object v8

    .line 925
    if-nez v8, :cond_19

    .line 926
    .line 927
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 928
    .line 929
    .line 930
    :cond_19
    add-int/lit8 v7, v7, -0x1

    .line 931
    .line 932
    goto :goto_19

    .line 933
    :cond_1a
    :goto_1a
    add-int/lit8 v9, v5, 0x1

    .line 934
    .line 935
    move-wide/from16 v7, v32

    .line 936
    .line 937
    const/4 v4, 0x0

    .line 938
    const/4 v5, 0x1

    .line 939
    const/4 v6, 0x0

    .line 940
    goto/16 :goto_10

    .line 941
    .line 942
    :cond_1b
    iget-boolean v1, v0, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏:Z

    .line 943
    .line 944
    if-eqz v1, :cond_1f

    .line 945
    .line 946
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 947
    .line 948
    .line 949
    move-result v1

    .line 950
    const/16 v24, 0x1

    .line 951
    .line 952
    add-int/lit8 v1, v1, -0x1

    .line 953
    .line 954
    :goto_1b
    if-ltz v1, :cond_1d

    .line 955
    .line 956
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 957
    .line 958
    .line 959
    move-result-object v2

    .line 960
    if-nez v2, :cond_1c

    .line 961
    .line 962
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 963
    .line 964
    .line 965
    :cond_1c
    add-int/lit8 v1, v1, -0x1

    .line 966
    .line 967
    goto :goto_1b

    .line 968
    :cond_1d
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 969
    .line 970
    .line 971
    move-result v1

    .line 972
    if-nez v1, :cond_1e

    .line 973
    .line 974
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 975
    .line 976
    const/16 v2, 0x21

    .line 977
    .line 978
    if-lt v1, v2, :cond_1e

    .line 979
    .line 980
    iget-object v1, v0, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世兰哲:Lkotlin/reflect/jvm/internal/impl/load/kotlin/飘花落叶言子楪苏哲兰世;

    .line 981
    .line 982
    iget-object v2, v1, Lkotlin/reflect/jvm/internal/impl/load/kotlin/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 983
    .line 984
    check-cast v2, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世苏哲兰;

    .line 985
    .line 986
    invoke-static {v2}, Landroidx/activity/飘花落叶言子楪世苏兰哲;->飘花落叶言子世楪苏哲兰(L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世苏哲兰;)Z

    .line 987
    .line 988
    .line 989
    const/4 v11, 0x0

    .line 990
    iput-object v11, v1, Lkotlin/reflect/jvm/internal/impl/load/kotlin/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 991
    .line 992
    :cond_1e
    const/4 v4, 0x0

    .line 993
    iput-boolean v4, v0, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏:Z

    .line 994
    .line 995
    :cond_1f
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 996
    .line 997
    .line 998
    move-result v1

    .line 999
    if-lez v1, :cond_20

    .line 1000
    .line 1001
    iget-object v1, v0, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲:Lkotlin/reflect/jvm/internal/impl/load/kotlin/飘花落叶言子楪苏哲兰世;

    .line 1002
    .line 1003
    iget-object v0, v0, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏:Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;

    .line 1004
    .line 1005
    iget-object v1, v1, Lkotlin/reflect/jvm/internal/impl/load/kotlin/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1006
    .line 1007
    check-cast v1, Landroid/view/Choreographer;

    .line 1008
    .line 1009
    new-instance v2, Landroidx/profileinstaller/飘花落叶言子楪苏世哲兰;

    .line 1010
    .line 1011
    invoke-direct {v2, v0}, Landroidx/profileinstaller/飘花落叶言子楪苏世哲兰;-><init>(Ljava/lang/Runnable;)V

    .line 1012
    .line 1013
    .line 1014
    invoke-virtual {v1, v2}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    .line 1015
    .line 1016
    .line 1017
    :cond_20
    :goto_1c
    return-void

    .line 1018
    :pswitch_7
    iget-object v0, v0, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1019
    .line 1020
    move-object v1, v0

    .line 1021
    check-cast v1, Landroid/app/Activity;

    .line 1022
    .line 1023
    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    .line 1024
    .line 1025
    .line 1026
    move-result v0

    .line 1027
    if-nez v0, :cond_28

    .line 1028
    .line 1029
    sget-object v3, L飘花落叶言子哲楪世苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰:Landroid/os/Handler;

    .line 1030
    .line 1031
    sget-object v0, L飘花落叶言子哲楪世苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏:Ljava/lang/reflect/Method;

    .line 1032
    .line 1033
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1034
    .line 1035
    const/16 v6, 0x1c

    .line 1036
    .line 1037
    if-lt v5, v6, :cond_21

    .line 1038
    .line 1039
    invoke-virtual {v1}, Landroid/app/Activity;->recreate()V

    .line 1040
    .line 1041
    .line 1042
    goto/16 :goto_21

    .line 1043
    .line 1044
    :cond_21
    const/16 v6, 0x1b

    .line 1045
    .line 1046
    if-ne v5, v6, :cond_22

    .line 1047
    .line 1048
    if-nez v0, :cond_22

    .line 1049
    .line 1050
    goto/16 :goto_20

    .line 1051
    .line 1052
    :cond_22
    sget-object v7, L飘花落叶言子哲楪世苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲:Ljava/lang/reflect/Method;

    .line 1053
    .line 1054
    if-nez v7, :cond_23

    .line 1055
    .line 1056
    sget-object v7, L飘花落叶言子哲楪世苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏:Ljava/lang/reflect/Method;

    .line 1057
    .line 1058
    if-nez v7, :cond_23

    .line 1059
    .line 1060
    goto/16 :goto_20

    .line 1061
    .line 1062
    :cond_23
    :try_start_15
    sget-object v7, L飘花落叶言子哲楪世苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:Ljava/lang/reflect/Field;

    .line 1063
    .line 1064
    invoke-virtual {v7, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1065
    .line 1066
    .line 1067
    move-result-object v8

    .line 1068
    if-nez v8, :cond_24

    .line 1069
    .line 1070
    goto/16 :goto_20

    .line 1071
    .line 1072
    :cond_24
    sget-object v7, L飘花落叶言子哲楪世苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/reflect/Field;

    .line 1073
    .line 1074
    invoke-virtual {v7, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1075
    .line 1076
    .line 1077
    move-result-object v7

    .line 1078
    if-nez v7, :cond_25

    .line 1079
    .line 1080
    goto :goto_20

    .line 1081
    :cond_25
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 1082
    .line 1083
    .line 1084
    move-result-object v9

    .line 1085
    new-instance v10, L飘花落叶言子哲楪世苏兰/飘花落叶言子楪世苏哲兰;

    .line 1086
    .line 1087
    invoke-direct {v10, v1}, L飘花落叶言子哲楪世苏兰/飘花落叶言子楪世苏哲兰;-><init>(Landroid/app/Activity;)V

    .line 1088
    .line 1089
    .line 1090
    invoke-virtual {v9, v10}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 1091
    .line 1092
    .line 1093
    new-instance v11, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世苏哲兰;

    .line 1094
    .line 1095
    const/4 v4, 0x0

    .line 1096
    invoke-direct {v11, v2, v10, v8, v4}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世苏哲兰;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V

    .line 1097
    .line 1098
    .line 1099
    invoke-virtual {v3, v11}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_a

    .line 1100
    .line 1101
    .line 1102
    if-ne v5, v6, :cond_26

    .line 1103
    .line 1104
    const/4 v5, 0x1

    .line 1105
    goto :goto_1d

    .line 1106
    :cond_26
    move v5, v4

    .line 1107
    :goto_1d
    const/16 v2, 0xe

    .line 1108
    .line 1109
    if-eqz v5, :cond_27

    .line 1110
    .line 1111
    :try_start_16
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1112
    .line 1113
    .line 1114
    move-result-object v11

    .line 1115
    sget-object v12, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_9

    .line 1116
    .line 1117
    const/4 v13, 0x0

    .line 1118
    const/4 v14, 0x0

    .line 1119
    move-object v5, v9

    .line 1120
    const/4 v9, 0x0

    .line 1121
    move-object v6, v10

    .line 1122
    const/4 v10, 0x0

    .line 1123
    move-object v15, v12

    .line 1124
    move-object/from16 v16, v12

    .line 1125
    .line 1126
    :try_start_17
    filled-new-array/range {v8 .. v16}, [Ljava/lang/Object;

    .line 1127
    .line 1128
    .line 1129
    move-result-object v8

    .line 1130
    invoke-virtual {v0, v7, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1131
    .line 1132
    .line 1133
    goto :goto_1e

    .line 1134
    :catchall_8
    move-exception v0

    .line 1135
    goto :goto_1f

    .line 1136
    :catchall_9
    move-exception v0

    .line 1137
    move-object v5, v9

    .line 1138
    move-object v6, v10

    .line 1139
    goto :goto_1f

    .line 1140
    :cond_27
    move-object v5, v9

    .line 1141
    move-object v6, v10

    .line 1142
    invoke-virtual {v1}, Landroid/app/Activity;->recreate()V
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_8

    .line 1143
    .line 1144
    .line 1145
    :goto_1e
    :try_start_18
    new-instance v0, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世苏哲兰;

    .line 1146
    .line 1147
    const/4 v4, 0x0

    .line 1148
    invoke-direct {v0, v2, v5, v6, v4}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世苏哲兰;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V

    .line 1149
    .line 1150
    .line 1151
    invoke-virtual {v3, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1152
    .line 1153
    .line 1154
    goto :goto_21

    .line 1155
    :goto_1f
    new-instance v7, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世苏哲兰;

    .line 1156
    .line 1157
    const/4 v4, 0x0

    .line 1158
    invoke-direct {v7, v2, v5, v6, v4}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世苏哲兰;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V

    .line 1159
    .line 1160
    .line 1161
    invoke-virtual {v3, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1162
    .line 1163
    .line 1164
    throw v0
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_a

    .line 1165
    :catchall_a
    :goto_20
    invoke-virtual {v1}, Landroid/app/Activity;->recreate()V

    .line 1166
    .line 1167
    .line 1168
    :cond_28
    :goto_21
    return-void

    .line 1169
    :pswitch_8
    iget-object v0, v0, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1170
    .line 1171
    check-cast v0, L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世兰苏哲;

    .line 1172
    .line 1173
    iget-object v0, v0, L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世哲兰苏;

    .line 1174
    .line 1175
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 1176
    .line 1177
    .line 1178
    move-result-object v1

    .line 1179
    instance-of v2, v1, Landroid/view/ViewGroup;

    .line 1180
    .line 1181
    if-eqz v2, :cond_29

    .line 1182
    .line 1183
    check-cast v1, Landroid/view/ViewGroup;

    .line 1184
    .line 1185
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 1186
    .line 1187
    .line 1188
    :cond_29
    return-void

    .line 1189
    :pswitch_9
    iget-object v0, v0, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1190
    .line 1191
    check-cast v0, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏兰哲世;

    .line 1192
    .line 1193
    iget-object v0, v0, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪兰世苏哲:Lcom/lxj/xpopup/widget/VerticalRecyclerView;

    .line 1194
    .line 1195
    sget v1, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪兰哲世苏:I

    .line 1196
    .line 1197
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子苏哲世兰楪(I)V

    .line 1198
    .line 1199
    .line 1200
    return-void

    .line 1201
    :pswitch_a
    move v4, v6

    .line 1202
    iget-object v0, v0, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1203
    .line 1204
    check-cast v0, L飘花落叶言世哲苏子楪兰/飘花落叶言子楪兰哲世苏;

    .line 1205
    .line 1206
    new-instance v1, Ljava/io/File;

    .line 1207
    .line 1208
    sget-object v2, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 1209
    .line 1210
    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 1211
    .line 1212
    .line 1213
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 1214
    .line 1215
    .line 1216
    move-result v2

    .line 1217
    if-nez v2, :cond_2a

    .line 1218
    .line 1219
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 1220
    .line 1221
    .line 1222
    :cond_2a
    invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 1223
    .line 1224
    .line 1225
    move-result-object v2

    .line 1226
    array-length v3, v2

    .line 1227
    move v6, v4

    .line 1228
    :goto_22
    if-ge v6, v3, :cond_2d

    .line 1229
    .line 1230
    aget-object v5, v2, v6

    .line 1231
    .line 1232
    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 1233
    .line 1234
    .line 1235
    move-result-object v7

    .line 1236
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 1237
    .line 1238
    .line 1239
    move-result-object v8

    .line 1240
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1241
    .line 1242
    .line 1243
    move-result v7

    .line 1244
    if-eqz v7, :cond_2b

    .line 1245
    .line 1246
    goto :goto_23

    .line 1247
    :cond_2b
    invoke-virtual {v5}, Ljava/io/File;->isDirectory()Z

    .line 1248
    .line 1249
    .line 1250
    move-result v5

    .line 1251
    if-eqz v5, :cond_2c

    .line 1252
    .line 1253
    add-int/lit8 v4, v4, 0x1

    .line 1254
    .line 1255
    :cond_2c
    :goto_23
    add-int/lit8 v6, v6, 0x1

    .line 1256
    .line 1257
    goto :goto_22

    .line 1258
    :cond_2d
    if-nez v4, :cond_2e

    .line 1259
    .line 1260
    const/16 v1, 0xb5

    .line 1261
    .line 1262
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 1263
    .line 1264
    .line 1265
    move-result-object v1

    .line 1266
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1267
    .line 1268
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 1269
    .line 1270
    .line 1271
    const-string v3, "\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5"

    .line 1272
    .line 1273
    invoke-static {v3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 1274
    .line 1275
    .line 1276
    move-result-object v3

    .line 1277
    invoke-static {v3}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世苏哲(Ljava/lang/String;)Ljava/lang/String;

    .line 1278
    .line 1279
    .line 1280
    move-result-object v3

    .line 1281
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1282
    .line 1283
    .line 1284
    const/16 v3, 0xb6

    .line 1285
    .line 1286
    invoke-static {v3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 1287
    .line 1288
    .line 1289
    move-result-object v3

    .line 1290
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1291
    .line 1292
    .line 1293
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1294
    .line 1295
    .line 1296
    move-result-object v2

    .line 1297
    new-instance v3, Ljava/io/File;

    .line 1298
    .line 1299
    invoke-direct {v3, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 1300
    .line 1301
    .line 1302
    invoke-static {v1, v2}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;)V

    .line 1303
    .line 1304
    .line 1305
    :try_start_19
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1306
    .line 1307
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1308
    .line 1309
    .line 1310
    sget-object v4, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 1311
    .line 1312
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1313
    .line 1314
    .line 1315
    const-string v4, "\u545c\u55b5\u55b5\u545c\u545c\u55b5\u545c\u55b5~\u545c\u545c\u55b5\u55b5\u545c\u545c\u545c\u55b5~\u545c\u545c\u545c\u55b5\u55b5\u55b5\u545c\u55b5~\u545c\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u545c\u545c\u55b5\u55b5\u545c\u55b5\u545c\u545c~\u545c\u545c\u55b5\u55b5\u545c\u55b5\u55b5\u55b5"

    .line 1316
    .line 1317
    invoke-static {v4}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 1318
    .line 1319
    .line 1320
    move-result-object v4

    .line 1321
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1322
    .line 1323
    .line 1324
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1325
    .line 1326
    .line 1327
    move-result-object v1

    .line 1328
    invoke-static {v2, v1}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子苏世哲兰楪(Ljava/lang/String;Ljava/lang/String;)V

    .line 1329
    .line 1330
    .line 1331
    invoke-virtual {v3}, Ljava/io/File;->delete()Z
    :try_end_19
    .catch Ljava/lang/Exception; {:try_start_19 .. :try_end_19} :catch_2

    .line 1332
    .line 1333
    .line 1334
    :catch_2
    :cond_2e
    invoke-virtual {v0}, L飘花落叶言世哲苏子楪兰/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏兰哲世()V

    .line 1335
    .line 1336
    .line 1337
    return-void

    .line 1338
    :pswitch_b
    iget-object v0, v0, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1339
    .line 1340
    move-object v1, v0

    .line 1341
    check-cast v1, L飘花落叶言世哲楪兰苏子/飘花落叶言子楪世哲苏兰;

    .line 1342
    .line 1343
    :goto_24
    :try_start_1a
    invoke-static {}, Landroid/os/Looper;->loop()V
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_b

    .line 1344
    .line 1345
    .line 1346
    goto :goto_24

    .line 1347
    :catchall_b
    move-exception v0

    .line 1348
    new-instance v3, Ljava/lang/Thread;

    .line 1349
    .line 1350
    new-instance v4, Landroidx/appcompat/app/飘花落叶言子楪哲兰苏世;

    .line 1351
    .line 1352
    invoke-direct {v4, v1, v2, v0}, Landroidx/appcompat/app/飘花落叶言子楪哲兰苏世;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 1353
    .line 1354
    .line 1355
    invoke-direct {v3, v4}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 1356
    .line 1357
    .line 1358
    invoke-virtual {v3}, Ljava/lang/Thread;->start()V

    .line 1359
    .line 1360
    .line 1361
    goto :goto_24

    .line 1362
    :pswitch_c
    iget-object v0, v0, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1363
    .line 1364
    check-cast v0, Landroid/view/WindowManager;

    .line 1365
    .line 1366
    :try_start_1b
    sget-object v1, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/ref/WeakReference;

    .line 1367
    .line 1368
    if-eqz v1, :cond_2f

    .line 1369
    .line 1370
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 1371
    .line 1372
    .line 1373
    move-result-object v1

    .line 1374
    if-eqz v1, :cond_2f

    .line 1375
    .line 1376
    sget-object v1, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/ref/WeakReference;

    .line 1377
    .line 1378
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 1379
    .line 1380
    .line 1381
    move-result-object v1

    .line 1382
    check-cast v1, Landroid/view/View;

    .line 1383
    .line 1384
    invoke-interface {v0, v1}, Landroid/view/ViewManager;->removeView(Landroid/view/View;)V

    .line 1385
    .line 1386
    .line 1387
    sget-object v0, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/ref/WeakReference;

    .line 1388
    .line 1389
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->clear()V
    :try_end_1b
    .catch Ljava/lang/Exception; {:try_start_1b .. :try_end_1b} :catch_3

    .line 1390
    .line 1391
    .line 1392
    :catch_3
    :cond_2f
    return-void

    .line 1393
    :pswitch_d
    iget-object v0, v0, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1394
    .line 1395
    check-cast v0, Landroidx/compose/foundation/lazy/飘花落叶言子楪苏兰哲世;

    .line 1396
    .line 1397
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/飘花落叶言子楪苏兰哲世;->invoke()Ljava/lang/Object;

    .line 1398
    .line 1399
    .line 1400
    return-void

    .line 1401
    :pswitch_e
    iget-object v0, v0, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1402
    .line 1403
    check-cast v0, Ltop/suzhelan/qstory/ui/activity/SettingActivity;

    .line 1404
    .line 1405
    invoke-static {v0}, Ltop/suzhelan/qstory/ui/activity/SettingActivity;->飘花落叶言子楪哲苏世兰(Ltop/suzhelan/qstory/ui/activity/SettingActivity;)V

    .line 1406
    .line 1407
    .line 1408
    return-void

    .line 1409
    :pswitch_f
    iget-object v0, v0, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1410
    .line 1411
    check-cast v0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰哲楪;

    .line 1412
    .line 1413
    new-instance v1, Ljava/io/File;

    .line 1414
    .line 1415
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1416
    .line 1417
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 1418
    .line 1419
    .line 1420
    invoke-static {}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世哲苏()Ljava/lang/String;

    .line 1421
    .line 1422
    .line 1423
    move-result-object v3

    .line 1424
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1425
    .line 1426
    .line 1427
    const-string v3, "\u55b5\u545c\u55b5\u545c\u545c\u545c\u55b5\u55b5~\u55b5\u545c\u55b5\u545c\u545c\u545c\u545c\u55b5~\u55b5\u545c\u55b5\u55b5\u545c\u55b5\u545c\u545c~\u55b5\u545c\u55b5\u55b5\u55b5\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5"

    .line 1428
    .line 1429
    invoke-static {v3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 1430
    .line 1431
    .line 1432
    move-result-object v3

    .line 1433
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1434
    .line 1435
    .line 1436
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1437
    .line 1438
    .line 1439
    move-result-object v2

    .line 1440
    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 1441
    .line 1442
    .line 1443
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 1444
    .line 1445
    .line 1446
    move-result v2

    .line 1447
    if-nez v2, :cond_30

    .line 1448
    .line 1449
    sget-object v2, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏:Landroid/content/Context;

    .line 1450
    .line 1451
    const v3, 0x24080191

    .line 1452
    .line 1453
    .line 1454
    invoke-virtual {v2, v3}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 1455
    .line 1456
    .line 1457
    move-result-object v2

    .line 1458
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 1459
    .line 1460
    .line 1461
    move-result-object v3

    .line 1462
    sget-object v4, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    .line 1463
    .line 1464
    invoke-static {v2, v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世兰哲(Landroid/graphics/drawable/Drawable;Ljava/lang/String;Landroid/graphics/Bitmap$CompressFormat;)V

    .line 1465
    .line 1466
    .line 1467
    const/16 v2, 0x91b

    .line 1468
    .line 1469
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 1470
    .line 1471
    .line 1472
    move-result-object v2

    .line 1473
    invoke-static {v2}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 1474
    .line 1475
    .line 1476
    :cond_30
    sget-object v2, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏:Landroid/content/Context;

    .line 1477
    .line 1478
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 1479
    .line 1480
    .line 1481
    move-result-object v1

    .line 1482
    invoke-static {v2, v1}, Lcom/bumptech/glide/飘花落叶言子楪苏世兰哲;->飘花落叶言子世苏哲楪兰(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/BitmapDrawable;

    .line 1483
    .line 1484
    .line 1485
    move-result-object v1

    .line 1486
    iput-object v1, v0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪兰苏世哲:Landroid/graphics/drawable/BitmapDrawable;

    .line 1487
    .line 1488
    return-void

    .line 1489
    :pswitch_10
    iget-object v0, v0, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1490
    .line 1491
    check-cast v0, Landroid/widget/LinearLayout;

    .line 1492
    .line 1493
    const/4 v8, 0x1

    .line 1494
    invoke-virtual {v0, v8}, Landroid/view/ViewGroup;->removeViewAt(I)V

    .line 1495
    .line 1496
    .line 1497
    return-void

    .line 1498
    :pswitch_11
    iget-object v0, v0, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1499
    .line 1500
    check-cast v0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪兰世苏哲;

    .line 1501
    .line 1502
    invoke-virtual {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪苏哲兰世()Z

    .line 1503
    .line 1504
    .line 1505
    move-result v1

    .line 1506
    if-nez v1, :cond_31

    .line 1507
    .line 1508
    const/16 v1, 0x427

    .line 1509
    .line 1510
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 1511
    .line 1512
    .line 1513
    move-result-object v1

    .line 1514
    iget-object v0, v0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/String;

    .line 1515
    .line 1516
    invoke-static {v1, v0}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;)V

    .line 1517
    .line 1518
    .line 1519
    :cond_31
    return-void

    .line 1520
    :pswitch_12
    iget-object v0, v0, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1521
    .line 1522
    check-cast v0, L飘花落叶言苏世子楪兰哲/飘花落叶言子楪苏兰世哲;

    .line 1523
    .line 1524
    sget v1, Ltop/suzhelan/plugin/sdk/online/manager/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 1525
    .line 1526
    invoke-virtual {v0, v1}, L飘花落叶言苏世子楪兰哲/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰(I)V

    .line 1527
    .line 1528
    .line 1529
    return-void

    .line 1530
    :pswitch_13
    iget-object v0, v0, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1531
    .line 1532
    check-cast v0, Llin/xposed/hook/javaplugin/dialog/PluginMenuDialog;

    .line 1533
    .line 1534
    invoke-static {v0}, Llin/xposed/hook/javaplugin/dialog/PluginMenuDialog;->飘花落叶言子楪世苏哲兰(Llin/xposed/hook/javaplugin/dialog/PluginMenuDialog;)V

    .line 1535
    .line 1536
    .line 1537
    return-void

    .line 1538
    :pswitch_14
    iget-object v0, v0, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1539
    .line 1540
    check-cast v0, Llin/xposed/hook/javaplugin/controller/AutoLoadPlugin;

    .line 1541
    .line 1542
    invoke-static {v0}, Llin/xposed/hook/javaplugin/controller/AutoLoadPlugin;->飘花落叶言子楪世兰哲苏(Llin/xposed/hook/javaplugin/controller/AutoLoadPlugin;)V

    .line 1543
    .line 1544
    .line 1545
    return-void

    .line 1546
    :pswitch_15
    iget-object v0, v0, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1547
    .line 1548
    check-cast v0, Lcom/google/android/material/textfield/TextInputLayout;

    .line 1549
    .line 1550
    iget-object v0, v0, Lcom/google/android/material/textfield/TextInputLayout;->飘花落叶言子楪兰世哲苏:Landroid/widget/EditText;

    .line 1551
    .line 1552
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    .line 1553
    .line 1554
    .line 1555
    return-void

    .line 1556
    :pswitch_16
    iget-object v0, v0, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1557
    .line 1558
    check-cast v0, Lcom/google/android/material/textfield/飘花落叶言子楪苏兰哲世;

    .line 1559
    .line 1560
    iget-object v1, v0, Lcom/google/android/material/textfield/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏世兰哲:Landroid/widget/AutoCompleteTextView;

    .line 1561
    .line 1562
    invoke-virtual {v1}, Landroid/widget/AutoCompleteTextView;->isPopupShowing()Z

    .line 1563
    .line 1564
    .line 1565
    move-result v1

    .line 1566
    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪兰世苏哲(Z)V

    .line 1567
    .line 1568
    .line 1569
    iput-boolean v1, v0, Lcom/google/android/material/textfield/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲世苏兰:Z

    .line 1570
    .line 1571
    return-void

    .line 1572
    :pswitch_17
    iget-object v0, v0, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1573
    .line 1574
    check-cast v0, Lcom/google/android/material/textfield/飘花落叶言子楪世兰苏哲;

    .line 1575
    .line 1576
    const/4 v8, 0x1

    .line 1577
    invoke-virtual {v0, v8}, Lcom/google/android/material/textfield/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世苏哲(Z)V

    .line 1578
    .line 1579
    .line 1580
    return-void

    .line 1581
    :pswitch_18
    iget-object v0, v0, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1582
    .line 1583
    check-cast v0, Lcom/google/android/material/carousel/CarouselLayoutManager;

    .line 1584
    .line 1585
    invoke-virtual {v0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子哲世苏兰楪()V

    .line 1586
    .line 1587
    .line 1588
    return-void

    .line 1589
    :pswitch_19
    iget-object v0, v0, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1590
    .line 1591
    check-cast v0, Lcom/google/android/material/button/MaterialButton;

    .line 1592
    .line 1593
    invoke-static {v0}, Lcom/google/android/material/button/MaterialButton;->飘花落叶言子楪世苏哲兰(Lcom/google/android/material/button/MaterialButton;)V

    .line 1594
    .line 1595
    .line 1596
    return-void

    .line 1597
    :pswitch_1a
    iget-object v0, v0, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1598
    .line 1599
    check-cast v0, Landroidx/core/util/飘花落叶言子楪世苏哲兰;

    .line 1600
    .line 1601
    new-instance v1, Landroidx/window/layout/飘花落叶言子楪苏兰世哲;

    .line 1602
    .line 1603
    sget-object v2, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 1604
    .line 1605
    invoke-direct {v1, v2}, Landroidx/window/layout/飘花落叶言子楪苏兰世哲;-><init>(Ljava/util/List;)V

    .line 1606
    .line 1607
    .line 1608
    invoke-interface {v0, v1}, Landroidx/core/util/飘花落叶言子楪世苏哲兰;->accept(Ljava/lang/Object;)V

    .line 1609
    .line 1610
    .line 1611
    return-void

    .line 1612
    :pswitch_1b
    iget-object v0, v0, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1613
    .line 1614
    check-cast v0, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;

    .line 1615
    .line 1616
    iget-object v1, v0, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子苏世楪哲兰:Landroidx/fragment/app/飘花落叶言子苏楪世兰哲;

    .line 1617
    .line 1618
    iget-object v2, v0, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰世苏哲:Landroid/os/Bundle;

    .line 1619
    .line 1620
    iget-object v1, v1, Landroidx/fragment/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪兰苏世哲:L飘花落叶言子兰世楪苏哲/飘花落叶言子楪世兰苏哲;

    .line 1621
    .line 1622
    invoke-virtual {v1, v2}, L飘花落叶言子兰世楪苏哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲(Landroid/os/Bundle;)V

    .line 1623
    .line 1624
    .line 1625
    const/4 v11, 0x0

    .line 1626
    iput-object v11, v0, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰世苏哲:Landroid/os/Bundle;

    .line 1627
    .line 1628
    return-void

    .line 1629
    :pswitch_1c
    iget-object v0, v0, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1630
    .line 1631
    check-cast v0, Landroidx/compose/material/ripple/飘花落叶言子楪苏哲世兰;

    .line 1632
    .line 1633
    invoke-static {v0}, Landroidx/compose/material/ripple/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰(Landroidx/compose/material/ripple/飘花落叶言子楪苏哲世兰;)V

    .line 1634
    .line 1635
    .line 1636
    return-void

    .line 1637
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
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
