.class public Llin/xposed/hook/javaplugin/PluginMessageCallbackAPI;
.super L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏哲兰;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏哲兰;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private synthetic lambda$loadHook$0(Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-static {p1}, Llin/xposed/hook/javaplugin/PluginCallback;->onCallbackOnRawMsg(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Llin/xposed/hook/javaplugin/PluginMessageCallbackAPI;->isGrayMessage(Ljava/lang/Object;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-virtual {p0, p1}, Llin/xposed/hook/javaplugin/PluginMessageCallbackAPI;->parseMessage(Ljava/lang/Object;)Llin/xposed/hook/javaplugin/bean/MessageData;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    if-nez p0, :cond_1

    .line 16
    .line 17
    :goto_0
    return-void

    .line 18
    :cond_1
    invoke-static {p0}, Llin/xposed/hook/javaplugin/PluginCallback;->onMessage(Llin/xposed/hook/javaplugin/bean/MessageData;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method private parseMessageContent(Llin/xposed/hook/javaplugin/bean/MessageData;Ljava/lang/Object;)V
    .locals 18

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    const/16 v2, 0x8f

    .line 6
    .line 7
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    const-class v3, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-static {v3, v2, v1}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Ljava/util/ArrayList;

    .line 18
    .line 19
    const/16 v3, 0x1d2

    .line 20
    .line 21
    invoke-static {v3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    sget-object v4, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 26
    .line 27
    invoke-static {v4, v3, v1}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Ljava/lang/Long;

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 34
    .line 35
    .line 36
    move-result-wide v5

    .line 37
    new-instance v1, Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 40
    .line 41
    .line 42
    new-instance v3, Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    const/4 v8, 0x0

    .line 52
    const/4 v9, 0x0

    .line 53
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v10

    .line 57
    if-eqz v10, :cond_a

    .line 58
    .line 59
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v10

    .line 63
    const/16 v12, 0x14a

    .line 64
    .line 65
    invoke-static {v12}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v12

    .line 69
    sget-object v13, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 70
    .line 71
    invoke-static {v13, v12, v10}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v12

    .line 75
    check-cast v12, Ljava/lang/Integer;

    .line 76
    .line 77
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 78
    .line 79
    .line 80
    move-result v14

    .line 81
    iput v14, v0, Llin/xposed/hook/javaplugin/bean/MessageData;->MessageType:I

    .line 82
    .line 83
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 84
    .line 85
    .line 86
    move-result v14

    .line 87
    const/4 v15, 0x2

    .line 88
    const/4 v7, 0x1

    .line 89
    const-class v11, Ljava/lang/String;

    .line 90
    .line 91
    if-ne v14, v7, :cond_2

    .line 92
    .line 93
    const/16 v8, 0xef

    .line 94
    .line 95
    invoke-static {v8}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v8

    .line 99
    invoke-static {v10, v8}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v8

    .line 103
    const/16 v10, 0x14b

    .line 104
    .line 105
    invoke-static {v10}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v10

    .line 109
    invoke-static {v8, v10}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v10

    .line 113
    check-cast v10, Ljava/lang/String;

    .line 114
    .line 115
    new-instance v12, Ljava/lang/StringBuilder;

    .line 116
    .line 117
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 118
    .line 119
    .line 120
    iget-object v14, v0, Llin/xposed/hook/javaplugin/bean/MessageData;->MessageContent:Ljava/lang/String;

    .line 121
    .line 122
    invoke-static {v12, v14, v10}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v10

    .line 126
    iput-object v10, v0, Llin/xposed/hook/javaplugin/bean/MessageData;->MessageContent:Ljava/lang/String;

    .line 127
    .line 128
    const-string v10, "\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u545c\u55b5\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c"

    .line 129
    .line 130
    invoke-static {v10}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v10

    .line 134
    invoke-static {v13, v10, v8}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v10

    .line 138
    check-cast v10, Ljava/lang/Integer;

    .line 139
    .line 140
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 141
    .line 142
    .line 143
    move-result v10

    .line 144
    if-ne v10, v15, :cond_1

    .line 145
    .line 146
    const-string v10, "\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u545c\u545c\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u545c\u545c\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c"

    .line 147
    .line 148
    invoke-static {v10}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v10

    .line 152
    invoke-static {v11, v10, v8}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v8

    .line 156
    check-cast v8, Ljava/lang/String;

    .line 157
    .line 158
    invoke-static {v8}, Llin/xposed/hook/util/qq/QQEnvTool;->getUinFromUid(Ljava/lang/String;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v8

    .line 162
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    :cond_1
    iput v7, v0, Llin/xposed/hook/javaplugin/bean/MessageData;->MessageType:I

    .line 166
    .line 167
    move v8, v7

    .line 168
    goto :goto_0

    .line 169
    :cond_2
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 170
    .line 171
    .line 172
    move-result v13

    .line 173
    const/16 v14, 0x23a

    .line 174
    .line 175
    if-ne v13, v15, :cond_5

    .line 176
    .line 177
    const/16 v9, 0x83

    .line 178
    .line 179
    invoke-static {v9}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v9

    .line 183
    invoke-static {v10, v9}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v9

    .line 187
    invoke-static {v14}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v10

    .line 191
    invoke-static {v11, v10, v9}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v10

    .line 195
    check-cast v10, Ljava/lang/String;

    .line 196
    .line 197
    new-instance v12, Ljava/lang/StringBuilder;

    .line 198
    .line 199
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 200
    .line 201
    .line 202
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    .line 203
    .line 204
    .line 205
    move-result-object v13

    .line 206
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    const/16 v13, 0x23b

    .line 210
    .line 211
    invoke-static {v13}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v13

    .line 215
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v12

    .line 225
    new-instance v13, Ljava/io/File;

    .line 226
    .line 227
    invoke-direct {v13, v12}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v13}, Ljava/io/File;->exists()Z

    .line 231
    .line 232
    .line 233
    move-result v13

    .line 234
    if-nez v13, :cond_3

    .line 235
    .line 236
    new-instance v12, Ljava/lang/StringBuilder;

    .line 237
    .line 238
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 239
    .line 240
    .line 241
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    .line 242
    .line 243
    .line 244
    move-result-object v13

    .line 245
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    const/16 v13, 0x23c

    .line 249
    .line 250
    invoke-static {v13}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v13

    .line 254
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v12

    .line 264
    :cond_3
    const/16 v13, 0xaa

    .line 265
    .line 266
    invoke-static {v13}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v13

    .line 270
    invoke-static {v11, v13, v9}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v11

    .line 274
    check-cast v11, Ljava/lang/String;

    .line 275
    .line 276
    invoke-virtual {v11}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v11

    .line 280
    iget-boolean v13, v0, Llin/xposed/hook/javaplugin/bean/MessageData;->IsGroup:Z

    .line 281
    .line 282
    if-eqz v13, :cond_4

    .line 283
    .line 284
    goto :goto_1

    .line 285
    :cond_4
    move v15, v7

    .line 286
    :goto_1
    invoke-static {v15, v9}, Llin/xposed/hook/util/qq/QQMessageUtils;->getPicElementUrl(ILjava/lang/Object;)Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v9

    .line 290
    iget-object v13, v0, Llin/xposed/hook/javaplugin/bean/MessageData;->PicUrlList:Ljava/util/ArrayList;

    .line 291
    .line 292
    invoke-virtual {v13, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    new-instance v13, Ljava/lang/StringBuilder;

    .line 296
    .line 297
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 298
    .line 299
    .line 300
    iget-object v14, v0, Llin/xposed/hook/javaplugin/bean/MessageData;->MessageContent:Ljava/lang/String;

    .line 301
    .line 302
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 303
    .line 304
    .line 305
    const/16 v14, 0x23d

    .line 306
    .line 307
    invoke-static {v14}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v14

    .line 311
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 312
    .line 313
    .line 314
    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 315
    .line 316
    .line 317
    const-string v9, "\u55b5\u55b5\u545c\u55b5\u545c\u545c\u545c\u55b5"

    .line 318
    .line 319
    invoke-static {v9}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v9

    .line 323
    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object v9

    .line 330
    iput-object v9, v0, Llin/xposed/hook/javaplugin/bean/MessageData;->MessageContent:Ljava/lang/String;

    .line 331
    .line 332
    iput-object v12, v0, Llin/xposed/hook/javaplugin/bean/MessageData;->LocalPath:Ljava/lang/String;

    .line 333
    .line 334
    iput-object v10, v0, Llin/xposed/hook/javaplugin/bean/MessageData;->FileName:Ljava/lang/String;

    .line 335
    .line 336
    invoke-virtual {v3, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 337
    .line 338
    .line 339
    iput v7, v0, Llin/xposed/hook/javaplugin/bean/MessageData;->MessageType:I

    .line 340
    .line 341
    move v9, v7

    .line 342
    goto/16 :goto_0

    .line 343
    .line 344
    :cond_5
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 345
    .line 346
    .line 347
    move-result v13

    .line 348
    const/16 v16, 0x23f

    .line 349
    .line 350
    move/from16 v17, v14

    .line 351
    .line 352
    const/4 v14, 0x3

    .line 353
    if-ne v13, v14, :cond_6

    .line 354
    .line 355
    const/16 v7, 0x23e

    .line 356
    .line 357
    invoke-static {v7}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object v7

    .line 361
    const/4 v12, 0x0

    .line 362
    new-array v13, v12, [Ljava/lang/Object;

    .line 363
    .line 364
    invoke-static {v10, v7, v13}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object v7

    .line 368
    invoke-static/range {v17 .. v17}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 369
    .line 370
    .line 371
    move-result-object v10

    .line 372
    invoke-static {v11, v10, v7}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v10

    .line 376
    check-cast v10, Ljava/lang/String;

    .line 377
    .line 378
    invoke-static/range {v16 .. v16}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    move-result-object v12

    .line 382
    invoke-static {v4, v12, v7}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    move-result-object v12

    .line 386
    check-cast v12, Ljava/lang/Long;

    .line 387
    .line 388
    invoke-virtual {v12}, Ljava/lang/Long;->longValue()J

    .line 389
    .line 390
    .line 391
    move-result-wide v12

    .line 392
    const/16 v14, 0x240

    .line 393
    .line 394
    invoke-static {v14}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object v14

    .line 398
    invoke-static {v11, v14, v7}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 399
    .line 400
    .line 401
    move-result-object v7

    .line 402
    check-cast v7, Ljava/lang/String;

    .line 403
    .line 404
    iput-object v7, v0, Llin/xposed/hook/javaplugin/bean/MessageData;->LocalPath:Ljava/lang/String;

    .line 405
    .line 406
    iput-object v10, v0, Llin/xposed/hook/javaplugin/bean/MessageData;->FileName:Ljava/lang/String;

    .line 407
    .line 408
    iput-wide v12, v0, Llin/xposed/hook/javaplugin/bean/MessageData;->FileSize:J

    .line 409
    .line 410
    const/4 v7, 0x7

    .line 411
    iput v7, v0, Llin/xposed/hook/javaplugin/bean/MessageData;->MessageType:I

    .line 412
    .line 413
    goto/16 :goto_0

    .line 414
    .line 415
    :cond_6
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 416
    .line 417
    .line 418
    move-result v13

    .line 419
    const/4 v14, 0x6

    .line 420
    if-ne v13, v14, :cond_7

    .line 421
    .line 422
    const/16 v11, 0x241

    .line 423
    .line 424
    invoke-static {v11}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    move-result-object v11

    .line 428
    const/4 v12, 0x0

    .line 429
    new-array v13, v12, [Ljava/lang/Object;

    .line 430
    .line 431
    invoke-static {v10, v11, v13}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 432
    .line 433
    .line 434
    move-result-object v10

    .line 435
    new-instance v11, Ljava/lang/StringBuilder;

    .line 436
    .line 437
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 438
    .line 439
    .line 440
    iget-object v12, v0, Llin/xposed/hook/javaplugin/bean/MessageData;->MessageContent:Ljava/lang/String;

    .line 441
    .line 442
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 443
    .line 444
    .line 445
    invoke-static {v10}, Llin/xposed/hook/util/qq/QQEmotionUtils;->smallFaceElementToStrCode(Ljava/lang/Object;)Ljava/lang/String;

    .line 446
    .line 447
    .line 448
    move-result-object v10

    .line 449
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 450
    .line 451
    .line 452
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 453
    .line 454
    .line 455
    move-result-object v10

    .line 456
    iput-object v10, v0, Llin/xposed/hook/javaplugin/bean/MessageData;->MessageContent:Ljava/lang/String;

    .line 457
    .line 458
    iput v7, v0, Llin/xposed/hook/javaplugin/bean/MessageData;->MessageType:I

    .line 459
    .line 460
    goto/16 :goto_0

    .line 461
    .line 462
    :cond_7
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 463
    .line 464
    .line 465
    move-result v7

    .line 466
    const/4 v13, 0x5

    .line 467
    if-ne v7, v13, :cond_8

    .line 468
    .line 469
    const/16 v7, 0x242

    .line 470
    .line 471
    invoke-static {v7}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 472
    .line 473
    .line 474
    move-result-object v7

    .line 475
    const/4 v12, 0x0

    .line 476
    new-array v14, v12, [Ljava/lang/Object;

    .line 477
    .line 478
    invoke-static {v10, v7, v14}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 479
    .line 480
    .line 481
    move-result-object v7

    .line 482
    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 483
    .line 484
    .line 485
    move-result-object v10

    .line 486
    invoke-static {v10, v7}, Llin/xposed/hook/javaplugin/util/PluginMessageTool;->getVideoUrl(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 487
    .line 488
    .line 489
    move-result-object v10

    .line 490
    invoke-static/range {v16 .. v16}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 491
    .line 492
    .line 493
    move-result-object v12

    .line 494
    invoke-static {v4, v12, v7}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 495
    .line 496
    .line 497
    move-result-object v12

    .line 498
    check-cast v12, Ljava/lang/Long;

    .line 499
    .line 500
    invoke-virtual {v12}, Ljava/lang/Long;->longValue()J

    .line 501
    .line 502
    .line 503
    move-result-wide v14

    .line 504
    invoke-static/range {v17 .. v17}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 505
    .line 506
    .line 507
    move-result-object v12

    .line 508
    invoke-static {v11, v12, v7}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 509
    .line 510
    .line 511
    move-result-object v7

    .line 512
    check-cast v7, Ljava/lang/String;

    .line 513
    .line 514
    iput-object v10, v0, Llin/xposed/hook/javaplugin/bean/MessageData;->MessageContent:Ljava/lang/String;

    .line 515
    .line 516
    iput-object v10, v0, Llin/xposed/hook/javaplugin/bean/MessageData;->FileUrl:Ljava/lang/String;

    .line 517
    .line 518
    iput-object v7, v0, Llin/xposed/hook/javaplugin/bean/MessageData;->FileName:Ljava/lang/String;

    .line 519
    .line 520
    iput-wide v14, v0, Llin/xposed/hook/javaplugin/bean/MessageData;->FileSize:J

    .line 521
    .line 522
    iput v13, v0, Llin/xposed/hook/javaplugin/bean/MessageData;->MessageType:I

    .line 523
    .line 524
    goto/16 :goto_0

    .line 525
    .line 526
    :cond_8
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 527
    .line 528
    .line 529
    move-result v7

    .line 530
    const/16 v13, 0xa

    .line 531
    .line 532
    if-ne v7, v13, :cond_9

    .line 533
    .line 534
    const/16 v7, 0x90

    .line 535
    .line 536
    invoke-static {v7}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 537
    .line 538
    .line 539
    move-result-object v7

    .line 540
    const/4 v12, 0x0

    .line 541
    new-array v13, v12, [Ljava/lang/Object;

    .line 542
    .line 543
    invoke-static {v10, v7, v13}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 544
    .line 545
    .line 546
    move-result-object v7

    .line 547
    const/16 v10, 0x91

    .line 548
    .line 549
    invoke-static {v10}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 550
    .line 551
    .line 552
    move-result-object v10

    .line 553
    invoke-static {v11, v10, v7}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 554
    .line 555
    .line 556
    move-result-object v7

    .line 557
    check-cast v7, Ljava/lang/String;

    .line 558
    .line 559
    iput-object v7, v0, Llin/xposed/hook/javaplugin/bean/MessageData;->MessageContent:Ljava/lang/String;

    .line 560
    .line 561
    iput v15, v0, Llin/xposed/hook/javaplugin/bean/MessageData;->MessageType:I

    .line 562
    .line 563
    goto/16 :goto_0

    .line 564
    .line 565
    :cond_9
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 566
    .line 567
    .line 568
    move-result v7

    .line 569
    const/4 v12, 0x4

    .line 570
    if-ne v7, v12, :cond_0

    .line 571
    .line 572
    const/16 v7, 0x243

    .line 573
    .line 574
    invoke-static {v7}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 575
    .line 576
    .line 577
    move-result-object v7

    .line 578
    const/4 v13, 0x0

    .line 579
    new-array v14, v13, [Ljava/lang/Object;

    .line 580
    .line 581
    invoke-static {v10, v7, v14}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 582
    .line 583
    .line 584
    move-result-object v7

    .line 585
    invoke-static/range {v17 .. v17}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 586
    .line 587
    .line 588
    move-result-object v10

    .line 589
    invoke-static {v11, v10, v7}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 590
    .line 591
    .line 592
    move-result-object v10

    .line 593
    check-cast v10, Ljava/lang/String;

    .line 594
    .line 595
    invoke-static/range {v16 .. v16}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 596
    .line 597
    .line 598
    move-result-object v11

    .line 599
    invoke-static {v4, v11, v7}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 600
    .line 601
    .line 602
    move-result-object v11

    .line 603
    check-cast v11, Ljava/lang/Long;

    .line 604
    .line 605
    invoke-virtual {v11}, Ljava/lang/Long;->longValue()J

    .line 606
    .line 607
    .line 608
    move-result-wide v13

    .line 609
    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 610
    .line 611
    .line 612
    move-result-object v11

    .line 613
    invoke-static {v11, v7}, Llin/xposed/hook/javaplugin/util/PluginMessageTool;->getAudioUrl(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 614
    .line 615
    .line 616
    move-result-object v7

    .line 617
    new-instance v11, Ljava/lang/StringBuilder;

    .line 618
    .line 619
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 620
    .line 621
    .line 622
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    .line 623
    .line 624
    .line 625
    move-result-object v15

    .line 626
    invoke-virtual {v11, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 627
    .line 628
    .line 629
    const/16 v15, 0x244

    .line 630
    .line 631
    invoke-static {v15}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 632
    .line 633
    .line 634
    move-result-object v15

    .line 635
    invoke-virtual {v11, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 636
    .line 637
    .line 638
    invoke-static {}, Llin/xposed/hook/util/qq/Hook_cookie;->getMyuin()Ljava/lang/String;

    .line 639
    .line 640
    .line 641
    move-result-object v15

    .line 642
    invoke-virtual {v11, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 643
    .line 644
    .line 645
    const-string v15, "\u55b5\u545c\u55b5\u545c\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u55b5~\u55b5\u545c\u55b5\u55b5\u545c\u55b5\u545c\u55b5"

    .line 646
    .line 647
    invoke-static {v15}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 648
    .line 649
    .line 650
    move-result-object v15

    .line 651
    invoke-virtual {v11, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 652
    .line 653
    .line 654
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 655
    .line 656
    .line 657
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 658
    .line 659
    .line 660
    move-result-object v11

    .line 661
    iput-object v11, v0, Llin/xposed/hook/javaplugin/bean/MessageData;->LocalPath:Ljava/lang/String;

    .line 662
    .line 663
    iput-object v7, v0, Llin/xposed/hook/javaplugin/bean/MessageData;->MessageContent:Ljava/lang/String;

    .line 664
    .line 665
    iput-object v10, v0, Llin/xposed/hook/javaplugin/bean/MessageData;->FileName:Ljava/lang/String;

    .line 666
    .line 667
    iput-object v7, v0, Llin/xposed/hook/javaplugin/bean/MessageData;->FileUrl:Ljava/lang/String;

    .line 668
    .line 669
    iput-wide v13, v0, Llin/xposed/hook/javaplugin/bean/MessageData;->FileSize:J

    .line 670
    .line 671
    iput v12, v0, Llin/xposed/hook/javaplugin/bean/MessageData;->MessageType:I

    .line 672
    .line 673
    goto/16 :goto_0

    .line 674
    .line 675
    :cond_a
    if-eqz v8, :cond_b

    .line 676
    .line 677
    if-eqz v9, :cond_b

    .line 678
    .line 679
    const/4 v14, 0x3

    .line 680
    iput v14, v0, Llin/xposed/hook/javaplugin/bean/MessageData;->MessageType:I

    .line 681
    .line 682
    :cond_b
    const/4 v12, 0x0

    .line 683
    new-array v2, v12, [Ljava/lang/String;

    .line 684
    .line 685
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 686
    .line 687
    .line 688
    move-result-object v2

    .line 689
    check-cast v2, [Ljava/lang/String;

    .line 690
    .line 691
    iput-object v2, v0, Llin/xposed/hook/javaplugin/bean/MessageData;->PicList:[Ljava/lang/String;

    .line 692
    .line 693
    iput-object v1, v0, Llin/xposed/hook/javaplugin/bean/MessageData;->mAtList:Ljava/util/ArrayList;

    .line 694
    .line 695
    new-array v2, v12, [Ljava/lang/String;

    .line 696
    .line 697
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 698
    .line 699
    .line 700
    move-result-object v1

    .line 701
    check-cast v1, [Ljava/lang/String;

    .line 702
    .line 703
    iput-object v1, v0, Llin/xposed/hook/javaplugin/bean/MessageData;->AtList:[Ljava/lang/String;

    .line 704
    .line 705
    return-void
.end method

.method private parseReplyMessage(Llin/xposed/hook/javaplugin/bean/MessageData;Ljava/lang/Object;)V
    .locals 2

    .line 1
    const-string v0, "\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c\u55b5"

    .line 2
    .line 3
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-class v1, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-static {v1, v0, p2}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    check-cast p2, Ljava/util/ArrayList;

    .line 14
    .line 15
    if-eqz p2, :cond_1

    .line 16
    .line 17
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v0, 0x0

    .line 25
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    const/16 v0, 0x1d2

    .line 30
    .line 31
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sget-object v1, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 36
    .line 37
    invoke-static {v1, v0, p2}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, Ljava/lang/Long;

    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 44
    .line 45
    .line 46
    move-result-wide v0

    .line 47
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iput-object v0, p1, Llin/xposed/hook/javaplugin/bean/MessageData;->ReplyTo:Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {p0, p2}, Llin/xposed/hook/javaplugin/PluginMessageCallbackAPI;->parseMessage(Ljava/lang/Object;)Llin/xposed/hook/javaplugin/bean/MessageData;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    iput-object p0, p1, Llin/xposed/hook/javaplugin/bean/MessageData;->RecordMsg:Llin/xposed/hook/javaplugin/bean/MessageData;

    .line 58
    .line 59
    const/4 p0, 0x6

    .line 60
    iput p0, p1, Llin/xposed/hook/javaplugin/bean/MessageData;->MessageType:I

    .line 61
    .line 62
    return-void

    .line 63
    :cond_1
    :goto_0
    const-string p0, ""

    .line 64
    .line 65
    iput-object p0, p1, Llin/xposed/hook/javaplugin/bean/MessageData;->ReplyTo:Ljava/lang/String;

    .line 66
    .line 67
    return-void
.end method

.method public static synthetic 飘花落叶言子楪世兰哲苏(Llin/xposed/hook/javaplugin/PluginMessageCallbackAPI;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Llin/xposed/hook/javaplugin/PluginMessageCallbackAPI;->lambda$loadHook$0(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public isGrayMessage(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    const/16 p0, 0x8f

    .line 2
    .line 3
    :try_start_0
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-class v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-static {v0, p0, p1}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    const/16 v0, 0x14a

    .line 30
    .line 31
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 36
    .line 37
    invoke-static {v1, v0, p1}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    check-cast p1, Ljava/lang/Integer;

    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 44
    .line 45
    .line 46
    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    const/16 v0, 0x8

    .line 48
    .line 49
    if-ne p1, v0, :cond_0

    .line 50
    .line 51
    const/4 p0, 0x1

    .line 52
    return p0

    .line 53
    :catch_0
    :cond_1
    const/4 p0, 0x0

    .line 54
    return p0
.end method

.method public loadHook(Ljava/lang/ClassLoader;)V
    .locals 0

    .line 1
    invoke-static {}, Lkotlin/collections/飘花落叶言子世苏楪哲兰;->飘花落叶言子世楪苏哲兰()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance p1, Llin/xposed/hook/javaplugin/飘花落叶言子楪世兰苏哲;

    .line 9
    .line 10
    invoke-direct {p1, p0}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世兰苏哲;-><init>(Llin/xposed/hook/javaplugin/PluginMessageCallbackAPI;)V

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪哲苏世兰;->addAPIMessageListener(Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪哲世兰苏;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public parseMessage(Ljava/lang/Object;)Llin/xposed/hook/javaplugin/bean/MessageData;
    .locals 12

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    const-class v1, Ljava/lang/String;

    .line 4
    .line 5
    :try_start_0
    new-instance v2, Llin/xposed/hook/javaplugin/bean/MessageData;

    .line 6
    .line 7
    invoke-direct {v2}, Llin/xposed/hook/javaplugin/bean/MessageData;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance v3, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v3, v2, Llin/xposed/hook/javaplugin/bean/MessageData;->PicUrlList:Ljava/util/ArrayList;

    .line 16
    .line 17
    const/16 v3, 0x1d2

    .line 18
    .line 19
    invoke-static {v3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    sget-object v4, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 24
    .line 25
    invoke-static {v4, v3, p1}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    check-cast v3, Ljava/lang/Long;

    .line 30
    .line 31
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 32
    .line 33
    .line 34
    move-result-wide v5

    .line 35
    const-string v3, "\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u545c~\u55b5\u55b5\u545c\u545c\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5"

    .line 36
    .line 37
    invoke-static {v3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-static {v4, v3, p1}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    check-cast v3, Ljava/lang/Long;

    .line 46
    .line 47
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 48
    .line 49
    .line 50
    move-result-wide v7

    .line 51
    const-string v3, "\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u55b5~\u55b5\u55b5\u545c\u545c\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c"

    .line 52
    .line 53
    invoke-static {v3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-static {v1, v3, p1}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    check-cast v3, Ljava/lang/String;

    .line 62
    .line 63
    const/16 v9, 0x74

    .line 64
    .line 65
    invoke-static {v9}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v9

    .line 69
    sget-object v10, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 70
    .line 71
    invoke-static {v10, v9, p1}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v9

    .line 75
    check-cast v9, Ljava/lang/Integer;

    .line 76
    .line 77
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 78
    .line 79
    .line 80
    move-result v9

    .line 81
    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v10

    .line 85
    iput-object v10, v2, Llin/xposed/hook/javaplugin/bean/MessageData;->UserUin:Ljava/lang/String;

    .line 86
    .line 87
    const-wide/16 v10, 0x3e8

    .line 88
    .line 89
    mul-long/2addr v7, v10

    .line 90
    iput-wide v7, v2, Llin/xposed/hook/javaplugin/bean/MessageData;->MessageTime:J

    .line 91
    .line 92
    iput-object p1, v2, Llin/xposed/hook/javaplugin/bean/MessageData;->msg:Ljava/lang/Object;

    .line 93
    .line 94
    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    invoke-static {}, Llin/xposed/hook/util/qq/QQEnvTool;->getCurrentUin()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v6

    .line 102
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    iput-boolean v5, v2, Llin/xposed/hook/javaplugin/bean/MessageData;->IsSend:Z

    .line 107
    .line 108
    iput-object v0, v2, Llin/xposed/hook/javaplugin/bean/MessageData;->MessageContent:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 109
    .line 110
    const-string v5, "\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u55b5~\u55b5\u55b5\u545c\u545c\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c"

    .line 111
    .line 112
    const/4 v6, 0x1

    .line 113
    if-eq v9, v6, :cond_2

    .line 114
    .line 115
    const/16 v7, 0x64

    .line 116
    .line 117
    if-ne v9, v7, :cond_0

    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_0
    :try_start_1
    invoke-static {v5}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-static {v4, v0, p1}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    check-cast v0, Ljava/lang/Long;

    .line 129
    .line 130
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 131
    .line 132
    .line 133
    move-result-wide v4

    .line 134
    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    iput-object v0, v2, Llin/xposed/hook/javaplugin/bean/MessageData;->PeerUin:Ljava/lang/String;

    .line 139
    .line 140
    iput-object v3, v2, Llin/xposed/hook/javaplugin/bean/MessageData;->GroupUin:Ljava/lang/String;

    .line 141
    .line 142
    iput-boolean v6, v2, Llin/xposed/hook/javaplugin/bean/MessageData;->IsGroup:Z

    .line 143
    .line 144
    const/16 v0, 0x237

    .line 145
    .line 146
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-static {v1, v0, p1}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    check-cast v0, Ljava/lang/String;

    .line 155
    .line 156
    iput-object v0, v2, Llin/xposed/hook/javaplugin/bean/MessageData;->GroupName:Ljava/lang/String;

    .line 157
    .line 158
    const/16 v0, 0x238

    .line 159
    .line 160
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    invoke-static {v1, v0, p1}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    check-cast v0, Ljava/lang/String;

    .line 169
    .line 170
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 171
    .line 172
    .line 173
    move-result v3

    .line 174
    if-eqz v3, :cond_1

    .line 175
    .line 176
    const/16 v0, 0x239

    .line 177
    .line 178
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    invoke-static {v1, v0, p1}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    check-cast v0, Ljava/lang/String;

    .line 187
    .line 188
    :cond_1
    iput-object v0, v2, Llin/xposed/hook/javaplugin/bean/MessageData;->SenderNickName:Ljava/lang/String;

    .line 189
    .line 190
    goto :goto_1

    .line 191
    :cond_2
    :goto_0
    iput-object v0, v2, Llin/xposed/hook/javaplugin/bean/MessageData;->GroupUin:Ljava/lang/String;

    .line 192
    .line 193
    invoke-static {v5}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    invoke-static {v4, v0, p1}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    check-cast v0, Ljava/lang/Long;

    .line 202
    .line 203
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 204
    .line 205
    .line 206
    move-result-wide v0

    .line 207
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    iput-object v0, v2, Llin/xposed/hook/javaplugin/bean/MessageData;->PeerUin:Ljava/lang/String;

    .line 212
    .line 213
    const/4 v0, 0x0

    .line 214
    iput-boolean v0, v2, Llin/xposed/hook/javaplugin/bean/MessageData;->IsGroup:Z

    .line 215
    .line 216
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    invoke-static {v0}, L飘花落叶言苏世哲子兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    iput-object v0, v2, Llin/xposed/hook/javaplugin/bean/MessageData;->SenderNickName:Ljava/lang/String;

    .line 225
    .line 226
    :goto_1
    invoke-direct {p0, v2, p1}, Llin/xposed/hook/javaplugin/PluginMessageCallbackAPI;->parseMessageContent(Llin/xposed/hook/javaplugin/bean/MessageData;Ljava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    invoke-direct {p0, v2, p1}, Llin/xposed/hook/javaplugin/PluginMessageCallbackAPI;->parseReplyMessage(Llin/xposed/hook/javaplugin/bean/MessageData;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 230
    .line 231
    .line 232
    return-object v2

    .line 233
    :catch_0
    move-exception p0

    .line 234
    invoke-static {p0}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Exception;)V

    .line 235
    .line 236
    .line 237
    const/4 p0, 0x0

    .line 238
    return-object p0
.end method
