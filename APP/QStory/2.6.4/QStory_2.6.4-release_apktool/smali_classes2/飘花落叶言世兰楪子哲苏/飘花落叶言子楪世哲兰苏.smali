.class public final synthetic L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世哲兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Ljava/lang/String;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p2, p0, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

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
    iget v0, p0, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object p0, p0, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    :try_start_0
    invoke-static {}, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世苏兰()Lcom/alibaba/fastjson2/JSONObject;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v2, "\u55b5\u55b5\u545c\u55b5\u55b5\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5"

    .line 14
    .line 15
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-static {}, Llin/xposed/hook/util/qq/QQEnvTool;->getCurrentUin()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    const/16 v2, 0xba0

    .line 27
    .line 28
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-static {}, Llin/xposed/hook/util/qq/QQEnvTool;->getCurrentAccountNickName()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    invoke-static {}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰世哲苏()Landroid/util/Pair;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    if-eqz v2, :cond_0

    .line 44
    .line 45
    const-string v3, "\u55b5\u55b5\u545c\u545c\u545c\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c"

    .line 46
    .line 47
    invoke-static {v3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    iget-object v4, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 52
    .line 53
    invoke-virtual {v0, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    const/16 v3, 0xba1

    .line 57
    .line 58
    invoke-static {v3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 63
    .line 64
    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :catch_0
    move-exception p0

    .line 69
    goto :goto_1

    .line 70
    :cond_0
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-lez v2, :cond_1

    .line 75
    .line 76
    const/16 v2, 0xba2

    .line 77
    .line 78
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-virtual {v0, v2, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    const-string p0, "\u55b5\u55b5\u545c\u545c\u545c\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c"

    .line 86
    .line 87
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    const/16 v2, 0xba4

    .line 92
    .line 93
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    invoke-virtual {v0, p0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    :cond_1
    invoke-static {}, L飘花落叶言苏哲楪兰世子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏()L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世哲兰苏;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    invoke-interface {p0, v0}, L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(Lcom/alibaba/fastjson2/JSONObject;)Lretrofit2/飘花落叶言子楪世兰苏哲;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    invoke-interface {p0}, Lretrofit2/飘花落叶言子楪世兰苏哲;->execute()Lretrofit2/飘花落叶言子世兰楪哲苏;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 109
    .line 110
    .line 111
    goto :goto_2

    .line 112
    :goto_1
    const/16 v0, 0xba3

    .line 113
    .line 114
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-virtual {p0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    invoke-static {v0, v2, p0, v1}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 123
    .line 124
    .line 125
    :goto_2
    return-void

    .line 126
    :pswitch_0
    sget-object v0, L飘花落叶言苏哲楪世兰子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;

    .line 127
    .line 128
    sget-object v2, L飘花落叶言苏哲楪世兰子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰:Ljava/util/Set;

    .line 129
    .line 130
    sget-object v3, L飘花落叶言苏哲楪世兰子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏哲楪世兰子/飘花落叶言子楪世哲苏兰;

    .line 131
    .line 132
    :try_start_1
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    invoke-static {p0}, L飘花落叶言苏哲楪世兰子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    new-instance v4, L飘花落叶言世哲子苏楪兰/飘花落叶言子世楪兰哲苏;

    .line 140
    .line 141
    sget-object v5, L飘花落叶言世哲子苏楪兰/飘花落叶言子苏兰楪世哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言世哲子苏楪兰/飘花落叶言子苏兰楪世哲;

    .line 142
    .line 143
    invoke-direct {v4, v5, v5, v1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子世楪兰哲苏;-><init>(L飘花落叶言世苏兰哲子楪/飘花落叶言子楪世苏哲兰;L飘花落叶言世苏兰哲子楪/飘花落叶言子楪世苏哲兰;I)V

    .line 144
    .line 145
    .line 146
    invoke-static {v4}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子世楪兰苏哲(L飘花落叶言世苏兰哲子楪/飘花落叶言子楪世苏哲兰;)L飘花落叶言世苏兰哲子楪/飘花落叶言子楪世苏哲兰;

    .line 147
    .line 148
    .line 149
    move-result-object v4

    .line 150
    invoke-virtual {v0, v3, v4}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;L飘花落叶言世苏兰哲子楪/飘花落叶言子楪世苏哲兰;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v3

    .line 154
    check-cast v3, Ljava/util/Map;

    .line 155
    .line 156
    if-nez v3, :cond_2

    .line 157
    .line 158
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 159
    .line 160
    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    .line 161
    .line 162
    .line 163
    goto :goto_3

    .line 164
    :catchall_0
    move-exception v0

    .line 165
    goto/16 :goto_8

    .line 166
    .line 167
    :catch_1
    move-exception v0

    .line 168
    goto/16 :goto_6

    .line 169
    .line 170
    :cond_2
    :goto_3
    invoke-static {p0}, L飘花落叶言苏哲楪世兰子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 171
    .line 172
    .line 173
    move-result-object v4

    .line 174
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 175
    .line 176
    .line 177
    move-result-object v4

    .line 178
    const/16 v5, 0x4c9

    .line 179
    .line 180
    invoke-static {v5}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    :cond_3
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 187
    .line 188
    .line 189
    move-result v5

    .line 190
    if-eqz v5, :cond_4

    .line 191
    .line 192
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v5

    .line 196
    const/16 v6, 0x4ca

    .line 197
    .line 198
    invoke-static {v6}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    check-cast v5, Llin/xposed/hook/javaplugin/bean/GroupMemberInfo;

    .line 205
    .line 206
    iget-object v6, v5, Llin/xposed/hook/javaplugin/bean/GroupMemberInfo;->NickName:Ljava/lang/String;

    .line 207
    .line 208
    iget-object v7, v5, Llin/xposed/hook/javaplugin/bean/GroupMemberInfo;->UserUin:Ljava/lang/String;

    .line 209
    .line 210
    const-string v8, "\u55b5\u55b5\u545c\u55b5\u55b5\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u55b5~\u55b5\u55b5\u545c\u545c\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c"

    .line 211
    .line 212
    invoke-static {v8}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    invoke-static {v6, v7}, L飘花落叶言苏哲楪世兰子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/String;)Z

    .line 219
    .line 220
    .line 221
    move-result v6

    .line 222
    if-eqz v6, :cond_3

    .line 223
    .line 224
    iget-object v6, v5, Llin/xposed/hook/javaplugin/bean/GroupMemberInfo;->UserUin:Ljava/lang/String;

    .line 225
    .line 226
    iget-object v5, v5, Llin/xposed/hook/javaplugin/bean/GroupMemberInfo;->NickName:Ljava/lang/String;

    .line 227
    .line 228
    invoke-interface {v3, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    goto :goto_4

    .line 232
    :cond_4
    invoke-static {p0}, L飘花落叶言苏哲楪世兰子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v4

    .line 236
    invoke-virtual {v0, v3, v4}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    new-instance v3, Ljava/lang/StringBuilder;

    .line 240
    .line 241
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 242
    .line 243
    .line 244
    invoke-static {p0}, L飘花落叶言苏哲楪世兰子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v4

    .line 248
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 249
    .line 250
    .line 251
    const-string v4, "\u55b5\u55b5\u545c\u55b5\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5"

    .line 252
    .line 253
    invoke-static {v4}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v4

    .line 257
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v3

    .line 264
    new-instance v4, Ljava/util/Date;

    .line 265
    .line 266
    invoke-direct {v4}, Ljava/util/Date;-><init>()V

    .line 267
    .line 268
    .line 269
    new-instance v5, Ljava/text/SimpleDateFormat;

    .line 270
    .line 271
    const/16 v6, 0x474

    .line 272
    .line 273
    invoke-static {v6}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v6

    .line 277
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 278
    .line 279
    .line 280
    move-result-object v7

    .line 281
    invoke-direct {v5, v6, v7}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {v5, v4}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v4

    .line 288
    const/16 v5, 0xb93

    .line 289
    .line 290
    invoke-static {v5}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 294
    .line 295
    .line 296
    invoke-virtual {v0, v4, v3}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 297
    .line 298
    .line 299
    :goto_5
    invoke-interface {v2, p0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 300
    .line 301
    .line 302
    goto :goto_7

    .line 303
    :goto_6
    const/16 v3, 0xb83

    .line 304
    .line 305
    :try_start_2
    invoke-static {v3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v3

    .line 309
    sget-object v4, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 310
    .line 311
    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object v4

    .line 315
    invoke-static {v3, v4, v0, v1}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 316
    .line 317
    .line 318
    goto :goto_5

    .line 319
    :goto_7
    return-void

    .line 320
    :goto_8
    invoke-interface {v2, p0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 321
    .line 322
    .line 323
    throw v0

    .line 324
    :pswitch_1
    new-instance v0, Ljava/util/ArrayList;

    .line 325
    .line 326
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 327
    .line 328
    .line 329
    invoke-static {p0}, L飘花落叶言苏哲楪世兰子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 330
    .line 331
    .line 332
    move-result-object v1

    .line 333
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 334
    .line 335
    .line 336
    move-result-object v1

    .line 337
    :cond_5
    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 338
    .line 339
    .line 340
    move-result v2

    .line 341
    if-eqz v2, :cond_6

    .line 342
    .line 343
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v2

    .line 347
    check-cast v2, Llin/xposed/hook/javaplugin/bean/GroupMemberInfo;

    .line 348
    .line 349
    iget-boolean v3, v2, Llin/xposed/hook/javaplugin/bean/GroupMemberInfo;->IsAdmin:Z

    .line 350
    .line 351
    if-eqz v3, :cond_5

    .line 352
    .line 353
    iget-object v2, v2, Llin/xposed/hook/javaplugin/bean/GroupMemberInfo;->UserUin:Ljava/lang/String;

    .line 354
    .line 355
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 356
    .line 357
    .line 358
    goto :goto_9

    .line 359
    :cond_6
    invoke-static {p0, v0}, L飘花落叶言苏哲楪世兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 360
    .line 361
    .line 362
    invoke-static {p0}, L飘花落叶言苏哲楪世兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)V

    .line 363
    .line 364
    .line 365
    return-void

    .line 366
    :pswitch_2
    invoke-static {p0}, L飘花落叶言苏哲楪世兰子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 367
    .line 368
    .line 369
    return-void

    .line 370
    :pswitch_3
    sget-object v0, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏:Landroid/content/Context;

    .line 371
    .line 372
    const/high16 v1, 0x42a00000    # 80.0f

    .line 373
    .line 374
    const/4 v2, 0x0

    .line 375
    :try_start_3
    invoke-static {}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰苏哲世()Landroid/app/Activity;

    .line 376
    .line 377
    .line 378
    move-result-object v3
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 379
    if-eqz v3, :cond_9

    .line 380
    .line 381
    :try_start_4
    sget-object v3, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏:Landroid/widget/Toast;

    .line 382
    .line 383
    if-eqz v3, :cond_7

    .line 384
    .line 385
    invoke-virtual {v3}, Landroid/widget/Toast;->cancel()V

    .line 386
    .line 387
    .line 388
    :cond_7
    invoke-static {}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰苏哲世()Landroid/app/Activity;

    .line 389
    .line 390
    .line 391
    move-result-object v3

    .line 392
    if-nez v3, :cond_8

    .line 393
    .line 394
    move-object v3, v0

    .line 395
    :cond_8
    new-instance v4, Landroid/widget/Toast;

    .line 396
    .line 397
    invoke-direct {v4, v3}, Landroid/widget/Toast;-><init>(Landroid/content/Context;)V

    .line 398
    .line 399
    .line 400
    sput-object v4, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏:Landroid/widget/Toast;

    .line 401
    .line 402
    invoke-static {v3, v1}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲(Landroid/content/Context;F)I

    .line 403
    .line 404
    .line 405
    move-result v1

    .line 406
    const/16 v5, 0x30

    .line 407
    .line 408
    invoke-virtual {v4, v5, v2, v1}, Landroid/widget/Toast;->setGravity(III)V

    .line 409
    .line 410
    .line 411
    sget-object v1, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏:Landroid/widget/Toast;

    .line 412
    .line 413
    invoke-virtual {v1, v2}, Landroid/widget/Toast;->setDuration(I)V

    .line 414
    .line 415
    .line 416
    sget-object v1, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏:Landroid/widget/Toast;

    .line 417
    .line 418
    invoke-static {v3, p0}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰(Landroid/content/Context;Ljava/lang/String;)Landroid/widget/LinearLayout;

    .line 419
    .line 420
    .line 421
    move-result-object v3

    .line 422
    invoke-virtual {v1, v3}, Landroid/widget/Toast;->setView(Landroid/view/View;)V

    .line 423
    .line 424
    .line 425
    sget-object v1, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏:Landroid/widget/Toast;

    .line 426
    .line 427
    invoke-virtual {v1}, Landroid/widget/Toast;->show()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    .line 428
    .line 429
    .line 430
    goto/16 :goto_b

    .line 431
    .line 432
    :catch_2
    :try_start_5
    invoke-static {v0, p0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 433
    .line 434
    .line 435
    move-result-object p0

    .line 436
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_7

    .line 437
    .line 438
    .line 439
    goto/16 :goto_b

    .line 440
    .line 441
    :catch_3
    :cond_9
    :try_start_6
    invoke-static {v0}, Landroid/provider/Settings;->canDrawOverlays(Landroid/content/Context;)Z

    .line 442
    .line 443
    .line 444
    move-result v3
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_4

    .line 445
    goto :goto_a

    .line 446
    :catch_4
    move v3, v2

    .line 447
    :goto_a
    if-eqz v3, :cond_d

    .line 448
    .line 449
    sget-object v3, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:Landroid/os/Handler;

    .line 450
    .line 451
    :try_start_7
    const-string v4, "\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u545c"

    .line 452
    .line 453
    invoke-static {v4}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 454
    .line 455
    .line 456
    move-result-object v4

    .line 457
    invoke-virtual {v0, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 458
    .line 459
    .line 460
    move-result-object v4

    .line 461
    check-cast v4, Landroid/view/WindowManager;
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_6

    .line 462
    .line 463
    if-nez v4, :cond_a

    .line 464
    .line 465
    :try_start_8
    invoke-static {v0, p0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 466
    .line 467
    .line 468
    move-result-object p0

    .line 469
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_7

    .line 470
    .line 471
    .line 472
    goto :goto_b

    .line 473
    :cond_a
    :try_start_9
    sget-object v5, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/ref/WeakReference;

    .line 474
    .line 475
    if-eqz v5, :cond_b

    .line 476
    .line 477
    invoke-virtual {v5}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 478
    .line 479
    .line 480
    move-result-object v5
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_6

    .line 481
    if-eqz v5, :cond_b

    .line 482
    .line 483
    :try_start_a
    sget-object v5, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/ref/WeakReference;

    .line 484
    .line 485
    invoke-virtual {v5}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 486
    .line 487
    .line 488
    move-result-object v5

    .line 489
    check-cast v5, Landroid/view/View;

    .line 490
    .line 491
    invoke-interface {v4, v5}, Landroid/view/ViewManager;->removeView(Landroid/view/View;)V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_5

    .line 492
    .line 493
    .line 494
    :catch_5
    :cond_b
    :try_start_b
    sget-object v5, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰:Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;

    .line 495
    .line 496
    if-eqz v5, :cond_c

    .line 497
    .line 498
    invoke-virtual {v3, v5}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 499
    .line 500
    .line 501
    :cond_c
    new-instance v5, Landroid/view/WindowManager$LayoutParams;

    .line 502
    .line 503
    invoke-direct {v5}, Landroid/view/WindowManager$LayoutParams;-><init>()V

    .line 504
    .line 505
    .line 506
    const/16 v6, 0x7f6

    .line 507
    .line 508
    iput v6, v5, Landroid/view/WindowManager$LayoutParams;->type:I

    .line 509
    .line 510
    const/16 v6, 0xa8

    .line 511
    .line 512
    iput v6, v5, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 513
    .line 514
    const/4 v6, -0x3

    .line 515
    iput v6, v5, Landroid/view/WindowManager$LayoutParams;->format:I

    .line 516
    .line 517
    const/4 v6, -0x2

    .line 518
    iput v6, v5, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 519
    .line 520
    iput v6, v5, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 521
    .line 522
    const/16 v6, 0x31

    .line 523
    .line 524
    iput v6, v5, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 525
    .line 526
    invoke-static {v0, v1}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲(Landroid/content/Context;F)I

    .line 527
    .line 528
    .line 529
    move-result v1

    .line 530
    iput v1, v5, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 531
    .line 532
    const v1, 0x1030004

    .line 533
    .line 534
    .line 535
    iput v1, v5, Landroid/view/WindowManager$LayoutParams;->windowAnimations:I

    .line 536
    .line 537
    invoke-static {v0, p0}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰(Landroid/content/Context;Ljava/lang/String;)Landroid/widget/LinearLayout;

    .line 538
    .line 539
    .line 540
    move-result-object v1

    .line 541
    invoke-interface {v4, v1, v5}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 542
    .line 543
    .line 544
    new-instance v5, Ljava/lang/ref/WeakReference;

    .line 545
    .line 546
    invoke-direct {v5, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 547
    .line 548
    .line 549
    sput-object v5, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/ref/WeakReference;

    .line 550
    .line 551
    new-instance v1, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;

    .line 552
    .line 553
    const/16 v5, 0x10

    .line 554
    .line 555
    invoke-direct {v1, v4, v5}, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;-><init>(Ljava/lang/Object;I)V

    .line 556
    .line 557
    .line 558
    sput-object v1, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰:Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;

    .line 559
    .line 560
    const-wide/16 v4, 0xbb8

    .line 561
    .line 562
    invoke-virtual {v3, v1, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_6

    .line 563
    .line 564
    .line 565
    goto :goto_b

    .line 566
    :catch_6
    :try_start_c
    invoke-static {v0, p0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 567
    .line 568
    .line 569
    move-result-object p0

    .line 570
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 571
    .line 572
    .line 573
    goto :goto_b

    .line 574
    :cond_d
    invoke-static {v0, p0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 575
    .line 576
    .line 577
    move-result-object p0

    .line 578
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_7

    .line 579
    .line 580
    .line 581
    :catch_7
    :goto_b
    return-void

    .line 582
    nop

    .line 583
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
