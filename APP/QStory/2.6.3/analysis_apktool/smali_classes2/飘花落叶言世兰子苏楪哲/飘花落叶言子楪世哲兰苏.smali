.class public final synthetic L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世哲兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Ljava/lang/String;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p2, p0, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

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
    iget v0, p0, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object p0, p0, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v0, L飘花落叶言苏哲子世楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世哲苏兰;

    .line 10
    .line 11
    sget-object v2, L飘花落叶言苏哲子世楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰:Ljava/util/Set;

    .line 12
    .line 13
    sget-object v3, L飘花落叶言苏哲子世楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏哲子世楪兰/飘花落叶言子楪世哲苏兰;

    .line 14
    .line 15
    :try_start_0
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-static {p0}, L飘花落叶言苏哲子世楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    new-instance v4, L飘花落叶言世苏兰哲子楪/飘花落叶言子世楪兰哲苏;

    .line 23
    .line 24
    sget-object v5, L飘花落叶言世苏兰哲子楪/飘花落叶言子苏兰楪哲世;->飘花落叶言子楪世苏哲兰:L飘花落叶言世苏兰哲子楪/飘花落叶言子苏兰楪哲世;

    .line 25
    .line 26
    invoke-direct {v4, v5, v5, v1}, L飘花落叶言世苏兰哲子楪/飘花落叶言子世楪兰哲苏;-><init>(L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;I)V

    .line 27
    .line 28
    .line 29
    invoke-static {v4}, Lio/ktor/client/plugins/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲兰世苏(L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;)L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    invoke-virtual {v0, v3, v4}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    check-cast v3, Ljava/util/Map;

    .line 38
    .line 39
    if-nez v3, :cond_0

    .line 40
    .line 41
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 42
    .line 43
    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception v0

    .line 48
    goto/16 :goto_5

    .line 49
    .line 50
    :catch_0
    move-exception v0

    .line 51
    goto/16 :goto_3

    .line 52
    .line 53
    :cond_0
    :goto_0
    invoke-static {p0}, L飘花落叶言苏哲子世楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    const/16 v5, 0x4e5

    .line 62
    .line 63
    invoke-static {v5}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    :cond_1
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    if-eqz v5, :cond_2

    .line 74
    .line 75
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    const/16 v6, 0x4e6

    .line 80
    .line 81
    invoke-static {v6}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    check-cast v5, Llin/xposed/hook/javaplugin/bean/GroupMemberInfo;

    .line 88
    .line 89
    iget-object v6, v5, Llin/xposed/hook/javaplugin/bean/GroupMemberInfo;->NickName:Ljava/lang/String;

    .line 90
    .line 91
    iget-object v7, v5, Llin/xposed/hook/javaplugin/bean/GroupMemberInfo;->UserUin:Ljava/lang/String;

    .line 92
    .line 93
    const-string v8, "\u55b5\u55b5\u545c\u55b5\u55b5\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u55b5~\u55b5\u55b5\u545c\u545c\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c"

    .line 94
    .line 95
    invoke-static {v8}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    invoke-static {v6, v7}, L飘花落叶言苏哲子世楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/String;)Z

    .line 102
    .line 103
    .line 104
    move-result v6

    .line 105
    if-eqz v6, :cond_1

    .line 106
    .line 107
    iget-object v6, v5, Llin/xposed/hook/javaplugin/bean/GroupMemberInfo;->UserUin:Ljava/lang/String;

    .line 108
    .line 109
    iget-object v5, v5, Llin/xposed/hook/javaplugin/bean/GroupMemberInfo;->NickName:Ljava/lang/String;

    .line 110
    .line 111
    invoke-interface {v3, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_2
    invoke-static {p0}, L飘花落叶言苏哲子世楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    invoke-virtual {v0, v3, v4}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    invoke-static {p0}, L飘花落叶言苏哲子世楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    const-string v4, "\u55b5\u55b5\u545c\u55b5\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5"

    .line 127
    .line 128
    invoke-static {v4}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v4

    .line 132
    invoke-virtual {v3, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    new-instance v4, Ljava/util/Date;

    .line 137
    .line 138
    invoke-direct {v4}, Ljava/util/Date;-><init>()V

    .line 139
    .line 140
    .line 141
    new-instance v5, Ljava/text/SimpleDateFormat;

    .line 142
    .line 143
    const/16 v6, 0x490

    .line 144
    .line 145
    invoke-static {v6}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v6

    .line 149
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 150
    .line 151
    .line 152
    move-result-object v7

    .line 153
    invoke-direct {v5, v6, v7}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v5, v4}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v4

    .line 160
    const/16 v5, 0xb21

    .line 161
    .line 162
    invoke-static {v5}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v0, v4, v3}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 169
    .line 170
    .line 171
    :goto_2
    invoke-interface {v2, p0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    goto :goto_4

    .line 175
    :goto_3
    const/16 v3, 0xb11

    .line 176
    .line 177
    :try_start_1
    invoke-static {v3}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    sget-object v4, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 182
    .line 183
    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v4

    .line 187
    invoke-static {v3, v4, v0, v1}, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 188
    .line 189
    .line 190
    goto :goto_2

    .line 191
    :goto_4
    return-void

    .line 192
    :goto_5
    invoke-interface {v2, p0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    throw v0

    .line 196
    :pswitch_0
    new-instance v0, Ljava/util/ArrayList;

    .line 197
    .line 198
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 199
    .line 200
    .line 201
    invoke-static {p0}, L飘花落叶言苏哲子世楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    :cond_3
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 210
    .line 211
    .line 212
    move-result v2

    .line 213
    if-eqz v2, :cond_4

    .line 214
    .line 215
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    check-cast v2, Llin/xposed/hook/javaplugin/bean/GroupMemberInfo;

    .line 220
    .line 221
    iget-boolean v3, v2, Llin/xposed/hook/javaplugin/bean/GroupMemberInfo;->IsAdmin:Z

    .line 222
    .line 223
    if-eqz v3, :cond_3

    .line 224
    .line 225
    iget-object v2, v2, Llin/xposed/hook/javaplugin/bean/GroupMemberInfo;->UserUin:Ljava/lang/String;

    .line 226
    .line 227
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    goto :goto_6

    .line 231
    :cond_4
    invoke-static {p0, v0}, L飘花落叶言苏哲子世楪兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 232
    .line 233
    .line 234
    invoke-static {p0}, L飘花落叶言苏哲子世楪兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    return-void

    .line 238
    :pswitch_1
    invoke-static {p0}, L飘花落叶言苏哲子世楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 239
    .line 240
    .line 241
    return-void

    .line 242
    :pswitch_2
    :try_start_2
    invoke-static {}, L飘花落叶言楪苏子兰哲世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲()Lcom/alibaba/fastjson2/JSONObject;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    const-string v2, "\u55b5\u55b5\u545c\u55b5\u55b5\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5"

    .line 247
    .line 248
    invoke-static {v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v2

    .line 252
    invoke-static {}, Llin/xposed/hook/util/qq/QQEnvTool;->getCurrentUin()Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v3

    .line 256
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    const/16 v2, 0xb2e

    .line 260
    .line 261
    invoke-static {v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v2

    .line 265
    invoke-static {}, Llin/xposed/hook/util/qq/QQEnvTool;->getCurrentAccountNickName()Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v3

    .line 269
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    invoke-static {}, L飘花落叶言楪兰苏哲世子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世()Landroid/util/Pair;

    .line 273
    .line 274
    .line 275
    move-result-object v2

    .line 276
    if-eqz v2, :cond_5

    .line 277
    .line 278
    const-string v3, "\u55b5\u55b5\u545c\u545c\u545c\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c"

    .line 279
    .line 280
    invoke-static {v3}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v3

    .line 284
    iget-object v4, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 285
    .line 286
    invoke-virtual {v0, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    const/16 v3, 0xb2f

    .line 290
    .line 291
    invoke-static {v3}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v3

    .line 295
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 296
    .line 297
    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    goto :goto_7

    .line 301
    :catch_1
    move-exception p0

    .line 302
    goto :goto_8

    .line 303
    :cond_5
    :goto_7
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 304
    .line 305
    .line 306
    move-result v2

    .line 307
    if-lez v2, :cond_6

    .line 308
    .line 309
    const/16 v2, 0xb30

    .line 310
    .line 311
    invoke-static {v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object v2

    .line 315
    invoke-virtual {v0, v2, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    const-string p0, "\u55b5\u55b5\u545c\u545c\u545c\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c"

    .line 319
    .line 320
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object p0

    .line 324
    const/16 v2, 0xb31

    .line 325
    .line 326
    invoke-static {v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object v2

    .line 330
    invoke-virtual {v0, p0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    :cond_6
    invoke-static {}, L飘花落叶言苏哲子世兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏()L飘花落叶言苏哲子兰楪世/飘花落叶言子楪世兰苏哲;

    .line 334
    .line 335
    .line 336
    move-result-object p0

    .line 337
    invoke-interface {p0, v0}, L飘花落叶言苏哲子兰楪世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰(Lcom/alibaba/fastjson2/JSONObject;)Lretrofit2/飘花落叶言子楪世兰苏哲;

    .line 338
    .line 339
    .line 340
    move-result-object p0

    .line 341
    invoke-interface {p0}, Lretrofit2/飘花落叶言子楪世兰苏哲;->execute()Lretrofit2/飘花落叶言子世兰楪哲苏;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 342
    .line 343
    .line 344
    goto :goto_9

    .line 345
    :goto_8
    const/16 v0, 0xb32

    .line 346
    .line 347
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    invoke-virtual {p0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object v2

    .line 355
    invoke-static {v0, v2, p0, v1}, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 356
    .line 357
    .line 358
    :goto_9
    return-void

    .line 359
    :pswitch_3
    sget-object v0, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏:Landroid/content/Context;

    .line 360
    .line 361
    const/high16 v1, 0x42a00000    # 80.0f

    .line 362
    .line 363
    const/4 v2, 0x0

    .line 364
    :try_start_3
    invoke-static {}, Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰苏哲世()Landroid/app/Activity;

    .line 365
    .line 366
    .line 367
    move-result-object v3
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 368
    if-eqz v3, :cond_9

    .line 369
    .line 370
    :try_start_4
    sget-object v3, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏:Landroid/widget/Toast;

    .line 371
    .line 372
    if-eqz v3, :cond_7

    .line 373
    .line 374
    invoke-virtual {v3}, Landroid/widget/Toast;->cancel()V

    .line 375
    .line 376
    .line 377
    :cond_7
    invoke-static {}, Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰苏哲世()Landroid/app/Activity;

    .line 378
    .line 379
    .line 380
    move-result-object v3

    .line 381
    if-nez v3, :cond_8

    .line 382
    .line 383
    move-object v3, v0

    .line 384
    :cond_8
    new-instance v4, Landroid/widget/Toast;

    .line 385
    .line 386
    invoke-direct {v4, v3}, Landroid/widget/Toast;-><init>(Landroid/content/Context;)V

    .line 387
    .line 388
    .line 389
    sput-object v4, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏:Landroid/widget/Toast;

    .line 390
    .line 391
    invoke-static {v3, v1}, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲(Landroid/content/Context;F)I

    .line 392
    .line 393
    .line 394
    move-result v1

    .line 395
    const/16 v5, 0x30

    .line 396
    .line 397
    invoke-virtual {v4, v5, v2, v1}, Landroid/widget/Toast;->setGravity(III)V

    .line 398
    .line 399
    .line 400
    sget-object v1, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏:Landroid/widget/Toast;

    .line 401
    .line 402
    invoke-virtual {v1, v2}, Landroid/widget/Toast;->setDuration(I)V

    .line 403
    .line 404
    .line 405
    sget-object v1, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏:Landroid/widget/Toast;

    .line 406
    .line 407
    invoke-static {v3, p0}, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰(Landroid/content/Context;Ljava/lang/String;)Landroid/widget/LinearLayout;

    .line 408
    .line 409
    .line 410
    move-result-object v3

    .line 411
    invoke-virtual {v1, v3}, Landroid/widget/Toast;->setView(Landroid/view/View;)V

    .line 412
    .line 413
    .line 414
    sget-object v1, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏:Landroid/widget/Toast;

    .line 415
    .line 416
    invoke-virtual {v1}, Landroid/widget/Toast;->show()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    .line 417
    .line 418
    .line 419
    goto/16 :goto_b

    .line 420
    .line 421
    :catch_2
    :try_start_5
    invoke-static {v0, p0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 422
    .line 423
    .line 424
    move-result-object p0

    .line 425
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_7

    .line 426
    .line 427
    .line 428
    goto/16 :goto_b

    .line 429
    .line 430
    :catch_3
    :cond_9
    :try_start_6
    invoke-static {v0}, Landroid/provider/Settings;->canDrawOverlays(Landroid/content/Context;)Z

    .line 431
    .line 432
    .line 433
    move-result v3
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_4

    .line 434
    goto :goto_a

    .line 435
    :catch_4
    move v3, v2

    .line 436
    :goto_a
    if-eqz v3, :cond_d

    .line 437
    .line 438
    sget-object v3, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:Landroid/os/Handler;

    .line 439
    .line 440
    :try_start_7
    const-string v4, "\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u545c"

    .line 441
    .line 442
    invoke-static {v4}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 443
    .line 444
    .line 445
    move-result-object v4

    .line 446
    invoke-virtual {v0, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object v4

    .line 450
    check-cast v4, Landroid/view/WindowManager;
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_6

    .line 451
    .line 452
    if-nez v4, :cond_a

    .line 453
    .line 454
    :try_start_8
    invoke-static {v0, p0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 455
    .line 456
    .line 457
    move-result-object p0

    .line 458
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_7

    .line 459
    .line 460
    .line 461
    goto :goto_b

    .line 462
    :cond_a
    :try_start_9
    sget-object v5, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/ref/WeakReference;

    .line 463
    .line 464
    if-eqz v5, :cond_b

    .line 465
    .line 466
    invoke-virtual {v5}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object v5
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_6

    .line 470
    if-eqz v5, :cond_b

    .line 471
    .line 472
    :try_start_a
    sget-object v5, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/ref/WeakReference;

    .line 473
    .line 474
    invoke-virtual {v5}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 475
    .line 476
    .line 477
    move-result-object v5

    .line 478
    check-cast v5, Landroid/view/View;

    .line 479
    .line 480
    invoke-interface {v4, v5}, Landroid/view/ViewManager;->removeView(Landroid/view/View;)V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_5

    .line 481
    .line 482
    .line 483
    :catch_5
    :cond_b
    :try_start_b
    sget-object v5, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰:Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;

    .line 484
    .line 485
    if-eqz v5, :cond_c

    .line 486
    .line 487
    invoke-virtual {v3, v5}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 488
    .line 489
    .line 490
    :cond_c
    new-instance v5, Landroid/view/WindowManager$LayoutParams;

    .line 491
    .line 492
    invoke-direct {v5}, Landroid/view/WindowManager$LayoutParams;-><init>()V

    .line 493
    .line 494
    .line 495
    const/16 v6, 0x7f6

    .line 496
    .line 497
    iput v6, v5, Landroid/view/WindowManager$LayoutParams;->type:I

    .line 498
    .line 499
    const/16 v6, 0xa8

    .line 500
    .line 501
    iput v6, v5, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 502
    .line 503
    const/4 v6, -0x3

    .line 504
    iput v6, v5, Landroid/view/WindowManager$LayoutParams;->format:I

    .line 505
    .line 506
    const/4 v6, -0x2

    .line 507
    iput v6, v5, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 508
    .line 509
    iput v6, v5, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 510
    .line 511
    const/16 v6, 0x31

    .line 512
    .line 513
    iput v6, v5, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 514
    .line 515
    invoke-static {v0, v1}, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲(Landroid/content/Context;F)I

    .line 516
    .line 517
    .line 518
    move-result v1

    .line 519
    iput v1, v5, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 520
    .line 521
    const v1, 0x1030004

    .line 522
    .line 523
    .line 524
    iput v1, v5, Landroid/view/WindowManager$LayoutParams;->windowAnimations:I

    .line 525
    .line 526
    invoke-static {v0, p0}, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰(Landroid/content/Context;Ljava/lang/String;)Landroid/widget/LinearLayout;

    .line 527
    .line 528
    .line 529
    move-result-object v1

    .line 530
    invoke-interface {v4, v1, v5}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 531
    .line 532
    .line 533
    new-instance v5, Ljava/lang/ref/WeakReference;

    .line 534
    .line 535
    invoke-direct {v5, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 536
    .line 537
    .line 538
    sput-object v5, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/ref/WeakReference;

    .line 539
    .line 540
    new-instance v1, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;

    .line 541
    .line 542
    const/16 v5, 0x10

    .line 543
    .line 544
    invoke-direct {v1, v4, v5}, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;-><init>(Ljava/lang/Object;I)V

    .line 545
    .line 546
    .line 547
    sput-object v1, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰:Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;

    .line 548
    .line 549
    const-wide/16 v4, 0xbb8

    .line 550
    .line 551
    invoke-virtual {v3, v1, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_6

    .line 552
    .line 553
    .line 554
    goto :goto_b

    .line 555
    :catch_6
    :try_start_c
    invoke-static {v0, p0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 556
    .line 557
    .line 558
    move-result-object p0

    .line 559
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 560
    .line 561
    .line 562
    goto :goto_b

    .line 563
    :cond_d
    invoke-static {v0, p0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 564
    .line 565
    .line 566
    move-result-object p0

    .line 567
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_7

    .line 568
    .line 569
    .line 570
    :catch_7
    :goto_b
    return-void

    .line 571
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
