.class public final synthetic Landroidx/compose/ui/platform/飘花落叶言子楪苏兰哲世;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/compose/ui/platform/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 7
    iput p2, p0, Landroidx/compose/ui/platform/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲苏兰世:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final 飘花落叶言子楪世苏哲兰()V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 14

    .line 1
    iget p0, p0, Landroidx/compose/ui/platform/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/16 v0, 0x18

    .line 5
    .line 6
    const/4 v2, 0x3

    .line 7
    const/16 v3, 0xf

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x1

    .line 11
    packed-switch p0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    const/16 p0, 0xc4f

    .line 15
    .line 16
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-static {p0}, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_0
    invoke-static {}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;->飘花落叶言子世哲苏兰楪()V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_1
    const/16 p0, 0xc4e

    .line 29
    .line 30
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-static {p0}, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :pswitch_2
    const/16 p0, 0x15

    .line 39
    .line 40
    :try_start_0
    invoke-static {}, Llin/xposed/hook/view/main/itemview/Update;->detectUpdates()V

    .line 41
    .line 42
    .line 43
    invoke-static {}, L飘花落叶言世楪哲苏子兰/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏哲世兰()L飘花落叶言苏世子兰楪哲/飘花落叶言子楪世苏兰哲;

    .line 44
    .line 45
    .line 46
    new-instance v0, Landroid/os/Handler;

    .line 47
    .line 48
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 53
    .line 54
    .line 55
    new-instance v1, Landroidx/compose/ui/platform/飘花落叶言子楪苏兰哲世;

    .line 56
    .line 57
    const/16 v2, 0x14

    .line 58
    .line 59
    invoke-direct {v1, v2}, Landroidx/compose/ui/platform/飘花落叶言子楪苏兰哲世;-><init>(I)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    .line 64
    .line 65
    new-instance v0, Landroid/os/Handler;

    .line 66
    .line 67
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 72
    .line 73
    .line 74
    new-instance v1, Landroidx/compose/ui/platform/飘花落叶言子楪苏兰哲世;

    .line 75
    .line 76
    invoke-direct {v1, p0}, Landroidx/compose/ui/platform/飘花落叶言子楪苏兰哲世;-><init>(I)V

    .line 77
    .line 78
    .line 79
    :goto_0
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 80
    .line 81
    .line 82
    goto :goto_1

    .line 83
    :catchall_0
    move-exception v0

    .line 84
    goto :goto_2

    .line 85
    :catch_0
    move-exception v0

    .line 86
    const/16 v1, 0xc50

    .line 87
    .line 88
    :try_start_1
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    sget-object v2, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 93
    .line 94
    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-static {v1, v2, v0, v5}, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 99
    .line 100
    .line 101
    new-instance v0, Landroid/os/Handler;

    .line 102
    .line 103
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 108
    .line 109
    .line 110
    new-instance v1, Landroidx/compose/ui/platform/飘花落叶言子楪苏兰哲世;

    .line 111
    .line 112
    const/16 v2, 0x16

    .line 113
    .line 114
    invoke-direct {v1, v2}, Landroidx/compose/ui/platform/飘花落叶言子楪苏兰哲世;-><init>(I)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 118
    .line 119
    .line 120
    new-instance v0, Landroid/os/Handler;

    .line 121
    .line 122
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 127
    .line 128
    .line 129
    new-instance v1, Landroidx/compose/ui/platform/飘花落叶言子楪苏兰哲世;

    .line 130
    .line 131
    invoke-direct {v1, p0}, Landroidx/compose/ui/platform/飘花落叶言子楪苏兰哲世;-><init>(I)V

    .line 132
    .line 133
    .line 134
    goto :goto_0

    .line 135
    :goto_1
    return-void

    .line 136
    :goto_2
    new-instance v1, Landroid/os/Handler;

    .line 137
    .line 138
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 143
    .line 144
    .line 145
    new-instance v2, Landroidx/compose/ui/platform/飘花落叶言子楪苏兰哲世;

    .line 146
    .line 147
    invoke-direct {v2, p0}, Landroidx/compose/ui/platform/飘花落叶言子楪苏兰哲世;-><init>(I)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 151
    .line 152
    .line 153
    throw v0

    .line 154
    :pswitch_3
    :try_start_2
    invoke-static {}, L飘花落叶言世楪哲苏子兰/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏世兰哲()V

    .line 155
    .line 156
    .line 157
    invoke-static {}, L飘花落叶言苏哲子世兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏()L飘花落叶言苏哲子兰楪世/飘花落叶言子楪世兰苏哲;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    invoke-interface {p0}, L飘花落叶言苏哲子兰楪世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏()Lretrofit2/飘花落叶言子楪世兰苏哲;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    invoke-interface {p0}, Lretrofit2/飘花落叶言子楪世兰苏哲;->execute()Lretrofit2/飘花落叶言子世兰楪哲苏;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    iget-object p0, p0, Lretrofit2/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 170
    .line 171
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    check-cast p0, Ltop/suzhelan/qstory/entity/QSResult;

    .line 175
    .line 176
    invoke-virtual {p0}, Ltop/suzhelan/qstory/entity/QSResult;->getData()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    check-cast p0, L飘花落叶言苏世子兰楪哲/飘花落叶言子楪世苏兰哲;

    .line 181
    .line 182
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    const-string v0, "\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u55b5"

    .line 186
    .line 187
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    new-instance v0, L飘花落叶言楪世子苏兰哲/飘花落叶言子楪世哲兰苏;

    .line 191
    .line 192
    invoke-direct {v0, v3}, L飘花落叶言楪世子苏兰哲/飘花落叶言子楪世哲兰苏;-><init>(I)V

    .line 193
    .line 194
    .line 195
    const/16 v1, 0x5d2

    .line 196
    .line 197
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    invoke-virtual {v0, p0, v1}, L飘花落叶言楪世子苏兰哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰世苏哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    invoke-static {}, Llin/xposed/hook/util/qq/QQEnvTool;->getCurrentUin()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object p0

    .line 208
    invoke-static {}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰哲苏世()L飘花落叶言苏世子兰楪哲/飘花落叶言子楪世苏兰哲;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    iget-object v0, v0, L飘花落叶言苏世子兰楪哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 213
    .line 214
    invoke-static {p0, v0}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result p0

    .line 218
    if-nez p0, :cond_0

    .line 219
    .line 220
    invoke-static {}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子世兰苏楪哲()V

    .line 221
    .line 222
    .line 223
    invoke-static {}, L飘花落叶言世楪哲苏子兰/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏世兰哲()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 224
    .line 225
    .line 226
    goto :goto_3

    .line 227
    :catch_1
    move-exception v0

    .line 228
    move-object p0, v0

    .line 229
    const-string v0, "\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u545c"

    .line 230
    .line 231
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    sget-object v1, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 236
    .line 237
    invoke-virtual {p0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    invoke-static {v0, v1, p0, v5}, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 242
    .line 243
    .line 244
    :cond_0
    :goto_3
    return-void

    .line 245
    :pswitch_4
    const/16 p0, 0xad1

    .line 246
    .line 247
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object p0

    .line 251
    sget-object v0, Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;->SUCCESS:Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;

    .line 252
    .line 253
    invoke-static {p0, v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世苏兰哲楪;->飘花落叶言子世兰哲楪苏(Ljava/lang/String;Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;)V

    .line 254
    .line 255
    .line 256
    return-void

    .line 257
    :pswitch_5
    const/16 p0, 0xad0

    .line 258
    .line 259
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object p0

    .line 263
    sget-object v0, Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;->WARNING:Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;

    .line 264
    .line 265
    invoke-static {p0, v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世苏兰哲楪;->飘花落叶言子世兰哲楪苏(Ljava/lang/String;Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;)V

    .line 266
    .line 267
    .line 268
    return-void

    .line 269
    :pswitch_6
    const/16 p0, 0xacf

    .line 270
    .line 271
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object p0

    .line 275
    sget-object v0, Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;->WARNING:Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;

    .line 276
    .line 277
    invoke-static {p0, v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世苏兰哲楪;->飘花落叶言子世兰哲楪苏(Ljava/lang/String;Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;)V

    .line 278
    .line 279
    .line 280
    return-void

    .line 281
    :pswitch_7
    sget-object p0, L飘花落叶言苏世兰子哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏世兰子哲楪/飘花落叶言子楪世兰苏哲;

    .line 282
    .line 283
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 284
    .line 285
    .line 286
    invoke-static {}, L飘花落叶言苏世兰子哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰苏哲()Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object p0

    .line 290
    new-instance v0, Ljava/io/File;

    .line 291
    .line 292
    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 296
    .line 297
    .line 298
    move-result p0

    .line 299
    if-eqz p0, :cond_d

    .line 300
    .line 301
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    .line 302
    .line 303
    .line 304
    move-result p0

    .line 305
    if-nez p0, :cond_1

    .line 306
    .line 307
    goto/16 :goto_9

    .line 308
    .line 309
    :cond_1
    new-instance p0, Ljava/util/ArrayList;

    .line 310
    .line 311
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 312
    .line 313
    .line 314
    new-instance v1, Ljava/util/ArrayList;

    .line 315
    .line 316
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 317
    .line 318
    .line 319
    sget-object v6, Lkotlin/io/FileWalkDirection;->TOP_DOWN:Lkotlin/io/FileWalkDirection;

    .line 320
    .line 321
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 322
    .line 323
    .line 324
    new-instance v7, Lkotlin/io/飘花落叶言子楪苏哲世兰;

    .line 325
    .line 326
    invoke-direct {v7, v0, v4, v6}, Lkotlin/io/飘花落叶言子楪苏哲世兰;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 327
    .line 328
    .line 329
    new-instance v0, L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世兰苏哲;

    .line 330
    .line 331
    invoke-direct {v0, v3}, L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世兰苏哲;-><init>(I)V

    .line 332
    .line 333
    .line 334
    new-instance v3, Lkotlin/sequences/飘花落叶言子楪世兰哲苏;

    .line 335
    .line 336
    invoke-direct {v3, v7, v5, v0}, Lkotlin/sequences/飘花落叶言子楪世兰哲苏;-><init>(Lkotlin/sequences/飘花落叶言子楪苏哲世兰;ZL飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)V

    .line 337
    .line 338
    .line 339
    new-instance v0, Lkotlin/sequences/飘花落叶言子楪世兰苏哲;

    .line 340
    .line 341
    invoke-direct {v0, v3}, Lkotlin/sequences/飘花落叶言子楪世兰苏哲;-><init>(Lkotlin/sequences/飘花落叶言子楪世兰哲苏;)V

    .line 342
    .line 343
    .line 344
    :goto_4
    invoke-virtual {v0}, Lkotlin/sequences/飘花落叶言子楪世兰苏哲;->hasNext()Z

    .line 345
    .line 346
    .line 347
    move-result v3

    .line 348
    if-eqz v3, :cond_2

    .line 349
    .line 350
    invoke-virtual {v0}, Lkotlin/sequences/飘花落叶言子楪世兰苏哲;->next()Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v3

    .line 354
    check-cast v3, Ljava/io/File;

    .line 355
    .line 356
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 357
    .line 358
    .line 359
    goto :goto_4

    .line 360
    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 361
    .line 362
    .line 363
    move-result v0

    .line 364
    if-nez v0, :cond_3

    .line 365
    .line 366
    new-instance p0, Landroid/os/Handler;

    .line 367
    .line 368
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 373
    .line 374
    .line 375
    new-instance v0, Landroidx/compose/ui/platform/飘花落叶言子楪苏兰哲世;

    .line 376
    .line 377
    const/16 v1, 0x10

    .line 378
    .line 379
    invoke-direct {v0, v1}, Landroidx/compose/ui/platform/飘花落叶言子楪苏兰哲世;-><init>(I)V

    .line 380
    .line 381
    .line 382
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 383
    .line 384
    .line 385
    goto/16 :goto_a

    .line 386
    .line 387
    :cond_3
    const-string v0, "\u55b5\u545c\u55b5\u545c\u545c\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c"

    .line 388
    .line 389
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 390
    .line 391
    .line 392
    move-result-object v6

    .line 393
    const-string v0, "\u55b5\u545c\u55b5\u545c\u545c\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5"

    .line 394
    .line 395
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object v7

    .line 399
    const-string v0, "\u55b5\u545c\u55b5\u545c\u545c\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c"

    .line 400
    .line 401
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 402
    .line 403
    .line 404
    move-result-object v8

    .line 405
    const-string v0, "\u55b5\u545c\u55b5\u545c\u545c\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5"

    .line 406
    .line 407
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 408
    .line 409
    .line 410
    move-result-object v9

    .line 411
    const-string v0, "\u55b5\u545c\u55b5\u545c\u545c\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5\u55b5"

    .line 412
    .line 413
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 414
    .line 415
    .line 416
    move-result-object v10

    .line 417
    const-string v0, "\u55b5\u545c\u55b5\u545c\u545c\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5"

    .line 418
    .line 419
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 420
    .line 421
    .line 422
    move-result-object v11

    .line 423
    const-string v0, "\u55b5\u545c\u55b5\u545c\u545c\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c"

    .line 424
    .line 425
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 426
    .line 427
    .line 428
    move-result-object v12

    .line 429
    const-string v0, "\u55b5\u545c\u55b5\u545c\u545c\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u545c"

    .line 430
    .line 431
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 432
    .line 433
    .line 434
    move-result-object v13

    .line 435
    filled-new-array/range {v6 .. v13}, [Ljava/lang/String;

    .line 436
    .line 437
    .line 438
    move-result-object v0

    .line 439
    invoke-static {v0}, Lkotlin/collections/飘花落叶言子楪哲苏兰世;->飘花落叶言子苏世兰哲楪([Ljava/lang/Object;)Ljava/util/Set;

    .line 440
    .line 441
    .line 442
    move-result-object v0

    .line 443
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 444
    .line 445
    .line 446
    move-result-object v1

    .line 447
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 448
    .line 449
    .line 450
    move-result v3

    .line 451
    if-eqz v3, :cond_7

    .line 452
    .line 453
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    move-result-object v3

    .line 457
    check-cast v3, Ljava/io/File;

    .line 458
    .line 459
    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 460
    .line 461
    .line 462
    move-result-object v6

    .line 463
    const/16 v7, 0x71c

    .line 464
    .line 465
    invoke-static {v7}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 466
    .line 467
    .line 468
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 469
    .line 470
    .line 471
    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 472
    .line 473
    invoke-virtual {v6, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 474
    .line 475
    .line 476
    move-result-object v6

    .line 477
    const/16 v7, 0x52a

    .line 478
    .line 479
    invoke-static {v7}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 480
    .line 481
    .line 482
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 483
    .line 484
    .line 485
    move-object v7, v0

    .line 486
    check-cast v7, Ljava/lang/Iterable;

    .line 487
    .line 488
    instance-of v8, v7, Ljava/util/Collection;

    .line 489
    .line 490
    if-eqz v8, :cond_4

    .line 491
    .line 492
    move-object v8, v7

    .line 493
    check-cast v8, Ljava/util/Collection;

    .line 494
    .line 495
    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    .line 496
    .line 497
    .line 498
    move-result v8

    .line 499
    if-eqz v8, :cond_4

    .line 500
    .line 501
    goto :goto_6

    .line 502
    :cond_4
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 503
    .line 504
    .line 505
    move-result-object v7

    .line 506
    :cond_5
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 507
    .line 508
    .line 509
    move-result v8

    .line 510
    if-eqz v8, :cond_6

    .line 511
    .line 512
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 513
    .line 514
    .line 515
    move-result-object v8

    .line 516
    check-cast v8, Ljava/lang/String;

    .line 517
    .line 518
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 519
    .line 520
    .line 521
    invoke-virtual {v6, v8}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 522
    .line 523
    .line 524
    move-result v8

    .line 525
    if-eqz v8, :cond_5

    .line 526
    .line 527
    goto :goto_5

    .line 528
    :cond_6
    :goto_6
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 529
    .line 530
    .line 531
    goto :goto_5

    .line 532
    :cond_7
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 533
    .line 534
    .line 535
    move-result v0

    .line 536
    if-nez v0, :cond_8

    .line 537
    .line 538
    new-instance p0, Landroid/os/Handler;

    .line 539
    .line 540
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 541
    .line 542
    .line 543
    move-result-object v0

    .line 544
    invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 545
    .line 546
    .line 547
    new-instance v0, Landroidx/compose/ui/platform/飘花落叶言子楪苏兰哲世;

    .line 548
    .line 549
    const/16 v1, 0x11

    .line 550
    .line 551
    invoke-direct {v0, v1}, Landroidx/compose/ui/platform/飘花落叶言子楪苏兰哲世;-><init>(I)V

    .line 552
    .line 553
    .line 554
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 555
    .line 556
    .line 557
    goto/16 :goto_a

    .line 558
    .line 559
    :cond_8
    new-instance v1, Lkotlin/jvm/internal/Ref$IntRef;

    .line 560
    .line 561
    invoke-direct {v1}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    .line 562
    .line 563
    .line 564
    new-instance v3, Lkotlin/jvm/internal/Ref$IntRef;

    .line 565
    .line 566
    invoke-direct {v3}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    .line 567
    .line 568
    .line 569
    new-instance v6, Landroid/os/Handler;

    .line 570
    .line 571
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 572
    .line 573
    .line 574
    move-result-object v7

    .line 575
    invoke-direct {v6, v7}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 576
    .line 577
    .line 578
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 579
    .line 580
    .line 581
    move-result-object p0

    .line 582
    move v7, v4

    .line 583
    :goto_7
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 584
    .line 585
    .line 586
    move-result v8

    .line 587
    if-eqz v8, :cond_c

    .line 588
    .line 589
    add-int/lit8 v8, v7, 0x1

    .line 590
    .line 591
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 592
    .line 593
    .line 594
    move-result-object v9

    .line 595
    check-cast v9, Ljava/io/File;

    .line 596
    .line 597
    int-to-float v10, v8

    .line 598
    int-to-float v11, v0

    .line 599
    div-float/2addr v10, v11

    .line 600
    new-instance v11, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪哲兰苏世;

    .line 601
    .line 602
    invoke-direct {v11, v7, v0, v9, v10}, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪哲兰苏世;-><init>(IILjava/io/File;F)V

    .line 603
    .line 604
    .line 605
    invoke-virtual {v6, v11}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 606
    .line 607
    .line 608
    :try_start_3
    invoke-virtual {v9}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 609
    .line 610
    .line 611
    move-result-object v7

    .line 612
    invoke-static {v7}, Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世苏哲(Ljava/lang/String;)Ljava/lang/String;

    .line 613
    .line 614
    .line 615
    move-result-object v7

    .line 616
    const-string v10, "\u55b5\u545c\u55b5\u545c\u545c\u545c\u55b5\u545c"

    .line 617
    .line 618
    invoke-static {v10}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 619
    .line 620
    .line 621
    move-result-object v10

    .line 622
    invoke-static {v7, v10, v4}, Lkotlin/text/飘花落叶言子楪兰苏哲世;->飘花落叶言子苏楪哲世兰(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 623
    .line 624
    .line 625
    move-result v10

    .line 626
    if-eqz v10, :cond_b

    .line 627
    .line 628
    new-instance v10, Ljava/lang/StringBuilder;

    .line 629
    .line 630
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 631
    .line 632
    .line 633
    invoke-virtual {v9}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 634
    .line 635
    .line 636
    move-result-object v11

    .line 637
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 638
    .line 639
    .line 640
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 641
    .line 642
    .line 643
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 644
    .line 645
    .line 646
    move-result-object v7

    .line 647
    new-instance v10, Ljava/io/File;

    .line 648
    .line 649
    invoke-virtual {v9}, Ljava/io/File;->getParent()Ljava/lang/String;

    .line 650
    .line 651
    .line 652
    move-result-object v11

    .line 653
    invoke-direct {v10, v11, v7}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 654
    .line 655
    .line 656
    invoke-virtual {v10}, Ljava/io/File;->exists()Z

    .line 657
    .line 658
    .line 659
    move-result v7

    .line 660
    if-eqz v7, :cond_9

    .line 661
    .line 662
    iget v7, v3, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 663
    .line 664
    add-int/2addr v7, v5

    .line 665
    iput v7, v3, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 666
    .line 667
    goto :goto_8

    .line 668
    :cond_9
    invoke-virtual {v9, v10}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 669
    .line 670
    .line 671
    move-result v7

    .line 672
    if-eqz v7, :cond_a

    .line 673
    .line 674
    iget v7, v1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 675
    .line 676
    add-int/2addr v7, v5

    .line 677
    iput v7, v1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 678
    .line 679
    goto :goto_8

    .line 680
    :cond_a
    iget v7, v3, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 681
    .line 682
    add-int/2addr v7, v5

    .line 683
    iput v7, v3, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 684
    .line 685
    goto :goto_8

    .line 686
    :cond_b
    iget v7, v3, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 687
    .line 688
    add-int/2addr v7, v5

    .line 689
    iput v7, v3, Lkotlin/jvm/internal/Ref$IntRef;->element:I
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 690
    .line 691
    goto :goto_8

    .line 692
    :catch_2
    iget v7, v3, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 693
    .line 694
    add-int/2addr v7, v5

    .line 695
    iput v7, v3, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 696
    .line 697
    :goto_8
    move v7, v8

    .line 698
    goto :goto_7

    .line 699
    :cond_c
    new-instance p0, Landroidx/activity/飘花落叶言子楪哲苏世兰;

    .line 700
    .line 701
    invoke-direct {p0, v0, v2, v3, v1}, Landroidx/activity/飘花落叶言子楪哲苏世兰;-><init>(IILjava/lang/Object;Ljava/lang/Object;)V

    .line 702
    .line 703
    .line 704
    invoke-virtual {v6, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 705
    .line 706
    .line 707
    goto :goto_a

    .line 708
    :cond_d
    :goto_9
    new-instance p0, Landroid/os/Handler;

    .line 709
    .line 710
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 711
    .line 712
    .line 713
    move-result-object v0

    .line 714
    invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 715
    .line 716
    .line 717
    new-instance v0, Landroidx/compose/ui/platform/飘花落叶言子楪苏兰哲世;

    .line 718
    .line 719
    invoke-direct {v0, v3}, Landroidx/compose/ui/platform/飘花落叶言子楪苏兰哲世;-><init>(I)V

    .line 720
    .line 721
    .line 722
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 723
    .line 724
    .line 725
    :goto_a
    return-void

    .line 726
    :pswitch_8
    sget p0, L飘花落叶言苏世兰子楪哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲:I

    .line 727
    .line 728
    :try_start_4
    new-instance p0, Ljava/text/SimpleDateFormat;

    .line 729
    .line 730
    const/16 v0, 0x490

    .line 731
    .line 732
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 733
    .line 734
    .line 735
    move-result-object v0

    .line 736
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 737
    .line 738
    .line 739
    move-result-object v1

    .line 740
    invoke-direct {p0, v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 741
    .line 742
    .line 743
    new-instance v0, Ljava/util/Date;

    .line 744
    .line 745
    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    .line 746
    .line 747
    .line 748
    invoke-virtual {p0, v0}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 749
    .line 750
    .line 751
    move-result-object p0

    .line 752
    :goto_b
    const/16 v0, 0x3b2

    .line 753
    .line 754
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 755
    .line 756
    .line 757
    move-result-object v0

    .line 758
    invoke-static {v0}, Llin/xposed/hook/util/qq/Hook_cookie;->getPskey(Ljava/lang/String;)Ljava/lang/String;

    .line 759
    .line 760
    .line 761
    move-result-object v0

    .line 762
    if-nez v0, :cond_e

    .line 763
    .line 764
    const-wide/16 v0, 0x3e8

    .line 765
    .line 766
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V

    .line 767
    .line 768
    .line 769
    goto :goto_b

    .line 770
    :catch_3
    move-exception v0

    .line 771
    move-object p0, v0

    .line 772
    goto :goto_e

    .line 773
    :cond_e
    new-instance v0, Ljava/lang/StringBuilder;

    .line 774
    .line 775
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 776
    .line 777
    .line 778
    const/16 v1, 0x4a3

    .line 779
    .line 780
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 781
    .line 782
    .line 783
    move-result-object v1

    .line 784
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 785
    .line 786
    .line 787
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 788
    .line 789
    .line 790
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 791
    .line 792
    .line 793
    move-result-object p0

    .line 794
    sget-object v0, L飘花落叶言世哲兰楪子苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/util/LinkedHashMap;

    .line 795
    .line 796
    const-class v1, L飘花落叶言苏世兰子楪哲/飘花落叶言子楪世兰哲苏;

    .line 797
    .line 798
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 799
    .line 800
    .line 801
    move-result-object v1

    .line 802
    check-cast v1, L飘花落叶言苏世兰子楪哲/飘花落叶言子楪世兰哲苏;

    .line 803
    .line 804
    if-nez v1, :cond_f

    .line 805
    .line 806
    move v1, v4

    .line 807
    goto :goto_c

    .line 808
    :cond_f
    iget-object v1, v1, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 809
    .line 810
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 811
    .line 812
    .line 813
    move-result v1

    .line 814
    :goto_c
    if-eqz v1, :cond_10

    .line 815
    .line 816
    invoke-static {}, L飘花落叶言苏世兰子楪哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲世苏兰()Ljava/lang/String;

    .line 817
    .line 818
    .line 819
    move-result-object p0

    .line 820
    :cond_10
    const-class v1, L飘花落叶言苏世兰子楪哲/飘花落叶言子楪苏世哲兰;

    .line 821
    .line 822
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 823
    .line 824
    .line 825
    move-result-object v1

    .line 826
    check-cast v1, L飘花落叶言苏世兰子楪哲/飘花落叶言子楪苏世哲兰;

    .line 827
    .line 828
    if-nez v1, :cond_11

    .line 829
    .line 830
    goto :goto_d

    .line 831
    :cond_11
    iget-object v1, v1, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 832
    .line 833
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 834
    .line 835
    .line 836
    move-result v4

    .line 837
    :goto_d
    invoke-static {p0, v4}, L飘花落叶言苏世兰子楪哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏兰哲世(Ljava/lang/String;Z)Ljava/lang/String;

    .line 838
    .line 839
    .line 840
    move-result-object p0

    .line 841
    sget v1, L飘花落叶言苏世兰子楪哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:I

    .line 842
    .line 843
    const-class v1, L飘花落叶言苏世兰子楪哲/飘花落叶言子楪世哲兰苏;

    .line 844
    .line 845
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 846
    .line 847
    .line 848
    move-result-object v0

    .line 849
    check-cast v0, L飘花落叶言苏世楪兰子哲/飘花落叶言子楪世苏兰哲;

    .line 850
    .line 851
    iget-object v0, v0, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 852
    .line 853
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 854
    .line 855
    .line 856
    move-result v0

    .line 857
    if-eqz v0, :cond_12

    .line 858
    .line 859
    invoke-static {p0}, L飘花落叶言苏世兰子楪哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏兰哲世(Ljava/lang/String;)V

    .line 860
    .line 861
    .line 862
    :cond_12
    const/16 p0, 0x4a4

    .line 863
    .line 864
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 865
    .line 866
    .line 867
    move-result-object p0

    .line 868
    invoke-static {p0}, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 869
    .line 870
    .line 871
    invoke-static {}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;->飘花落叶言子世哲苏兰楪()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    .line 872
    .line 873
    .line 874
    goto :goto_f

    .line 875
    :goto_e
    const/16 v0, 0x492

    .line 876
    .line 877
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 878
    .line 879
    .line 880
    move-result-object v0

    .line 881
    const/16 v1, 0x4a5

    .line 882
    .line 883
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 884
    .line 885
    .line 886
    move-result-object v1

    .line 887
    invoke-static {v0, v1, p0, v5}, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 888
    .line 889
    .line 890
    invoke-static {}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;->飘花落叶言子世哲苏兰楪()V

    .line 891
    .line 892
    .line 893
    new-instance v0, Ljava/lang/StringBuilder;

    .line 894
    .line 895
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 896
    .line 897
    .line 898
    const/16 v1, 0x4a6

    .line 899
    .line 900
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 901
    .line 902
    .line 903
    move-result-object v1

    .line 904
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 905
    .line 906
    .line 907
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 908
    .line 909
    .line 910
    move-result-object p0

    .line 911
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 912
    .line 913
    .line 914
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 915
    .line 916
    .line 917
    move-result-object p0

    .line 918
    invoke-static {p0}, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 919
    .line 920
    .line 921
    :goto_f
    return-void

    .line 922
    :pswitch_9
    invoke-static {v5}, L飘花落叶言世哲兰子楪苏/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(Z)V

    .line 923
    .line 924
    .line 925
    return-void

    .line 926
    :pswitch_a
    invoke-static {v4}, L飘花落叶言世哲兰子楪苏/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(Z)V

    .line 927
    .line 928
    .line 929
    return-void

    .line 930
    :pswitch_b
    invoke-static {}, L飘花落叶言世哲楪苏子兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲兰世()Landroid/graphics/drawable/Drawable;

    .line 931
    .line 932
    .line 933
    return-void

    .line 934
    :pswitch_c
    :try_start_5
    new-instance p0, L飘花落叶言世楪哲苏子兰/飘花落叶言子楪苏兰哲世;

    .line 935
    .line 936
    invoke-direct {p0}, L飘花落叶言世楪哲苏子兰/飘花落叶言子楪苏兰哲世;-><init>()V

    .line 937
    .line 938
    .line 939
    sget-object v1, L飘花落叶言苏世子楪哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/ExecutorService;

    .line 940
    .line 941
    new-instance v3, Landroidx/compose/ui/platform/飘花落叶言子楪苏兰哲世;

    .line 942
    .line 943
    const/16 v4, 0x12

    .line 944
    .line 945
    invoke-direct {v3, p0, v4}, Landroidx/compose/ui/platform/飘花落叶言子楪苏兰哲世;-><init>(Ljava/lang/Object;I)V

    .line 946
    .line 947
    .line 948
    invoke-interface {v1, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 949
    .line 950
    .line 951
    new-instance p0, Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪兰哲世苏;

    .line 952
    .line 953
    invoke-direct {p0, v2}, Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪兰哲世苏;-><init>(I)V

    .line 954
    .line 955
    .line 956
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏世兰哲()Ljava/lang/String;

    .line 957
    .line 958
    .line 959
    move-result-object v1

    .line 960
    const/16 v2, 0x4f7

    .line 961
    .line 962
    invoke-static {v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 963
    .line 964
    .line 965
    move-result-object v2

    .line 966
    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 967
    .line 968
    .line 969
    move-result v1

    .line 970
    if-nez v1, :cond_13

    .line 971
    .line 972
    const/16 v1, 0x4f8

    .line 973
    .line 974
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 975
    .line 976
    .line 977
    move-result-object v1

    .line 978
    invoke-static {v1}, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 979
    .line 980
    .line 981
    new-instance v1, Landroidx/window/area/飘花落叶言子楪世兰哲苏;

    .line 982
    .line 983
    invoke-direct {v1, v0}, Landroidx/window/area/飘花落叶言子楪世兰哲苏;-><init>(I)V

    .line 984
    .line 985
    .line 986
    new-instance v2, L飘花落叶言世子苏楪哲兰/飘花落叶言子楪世苏哲兰;

    .line 987
    .line 988
    invoke-direct {v2, v1}, L飘花落叶言世子苏楪哲兰/飘花落叶言子楪世苏哲兰;-><init>(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)V

    .line 989
    .line 990
    .line 991
    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    .line 992
    .line 993
    .line 994
    :cond_13
    new-instance v1, Landroidx/compose/foundation/飘花落叶言子世楪哲苏兰;

    .line 995
    .line 996
    invoke-direct {v1, p0, v0}, Landroidx/compose/foundation/飘花落叶言子世楪哲苏兰;-><init>(Ljava/lang/Object;I)V

    .line 997
    .line 998
    .line 999
    new-instance p0, L飘花落叶言世子苏楪哲兰/飘花落叶言子楪世苏哲兰;

    .line 1000
    .line 1001
    invoke-direct {p0, v1}, L飘花落叶言世子苏楪哲兰/飘花落叶言子楪世苏哲兰;-><init>(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)V

    .line 1002
    .line 1003
    .line 1004
    invoke-virtual {p0}, Ljava/lang/Thread;->start()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_4

    .line 1005
    .line 1006
    .line 1007
    goto :goto_10

    .line 1008
    :catch_4
    move-exception v0

    .line 1009
    move-object p0, v0

    .line 1010
    const-string v0, "\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u55b5~\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u55b5"

    .line 1011
    .line 1012
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 1013
    .line 1014
    .line 1015
    move-result-object v0

    .line 1016
    sget-object v1, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 1017
    .line 1018
    invoke-virtual {p0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 1019
    .line 1020
    .line 1021
    move-result-object v1

    .line 1022
    invoke-static {v0, v1, p0, v5}, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 1023
    .line 1024
    .line 1025
    :goto_10
    return-void

    .line 1026
    :pswitch_d
    sget-object p0, L飘花落叶言世哲兰楪子苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世哲苏兰;

    .line 1027
    .line 1028
    const-string v2, "DexKitCache"

    .line 1029
    .line 1030
    new-instance v3, L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世兰苏哲;

    .line 1031
    .line 1032
    invoke-direct {v3, v0}, L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世兰苏哲;-><init>(I)V

    .line 1033
    .line 1034
    .line 1035
    invoke-static {v3}, Lcom/bumptech/glide/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)L飘花落叶言世苏兰哲楪子/飘花落叶言子楪兰世苏哲;

    .line 1036
    .line 1037
    .line 1038
    sget-object v0, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 1039
    .line 1040
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 1041
    .line 1042
    .line 1043
    move-result v0

    .line 1044
    if-eqz v0, :cond_17

    .line 1045
    .line 1046
    new-instance v0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪苏兰哲世;

    .line 1047
    .line 1048
    sget-object v3, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 1049
    .line 1050
    invoke-direct {v0, v3, v2}, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪苏兰哲世;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1051
    .line 1052
    .line 1053
    invoke-virtual {v0}, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰()L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世苏兰;

    .line 1054
    .line 1055
    .line 1056
    move-result-object v0

    .line 1057
    invoke-virtual {v0}, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世苏兰;->clear()Landroid/content/SharedPreferences$Editor;

    .line 1058
    .line 1059
    .line 1060
    const-string v0, "\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u545c\u545c\u545c\u55b5\u545c\u545c~\u55b5\u55b5\u545c\u545c\u545c\u55b5\u545c\u55b5~\u55b5\u55b5\u545c\u545c\u55b5\u55b5\u55b5\u545c"

    .line 1061
    .line 1062
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 1063
    .line 1064
    .line 1065
    move-result-object v0

    .line 1066
    invoke-static {v0}, L飘花落叶言世哲兰楪子苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)V

    .line 1067
    .line 1068
    .line 1069
    const/16 v0, 0x302

    .line 1070
    .line 1071
    :try_start_6
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 1072
    .line 1073
    .line 1074
    move-result-object v0

    .line 1075
    invoke-static {}, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰()Ljava/lang/String;

    .line 1076
    .line 1077
    .line 1078
    move-result-object v2

    .line 1079
    invoke-virtual {p0, v2, v0}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1080
    .line 1081
    .line 1082
    new-instance v2, Lcom/alibaba/fastjson2/JSONObject;

    .line 1083
    .line 1084
    invoke-direct {v2}, Lcom/alibaba/fastjson2/JSONObject;-><init>()V

    .line 1085
    .line 1086
    .line 1087
    new-instance v3, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 1088
    .line 1089
    invoke-direct {v3}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 1090
    .line 1091
    .line 1092
    sget-object v0, L飘花落叶言世哲兰楪子苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/util/LinkedHashMap;

    .line 1093
    .line 1094
    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    .line 1095
    .line 1096
    .line 1097
    move-result v6

    .line 1098
    sub-int/2addr v6, v5

    .line 1099
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 1100
    .line 1101
    .line 1102
    move-result-object v0

    .line 1103
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 1104
    .line 1105
    .line 1106
    move-result-object v5

    .line 1107
    :cond_14
    :goto_11
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 1108
    .line 1109
    .line 1110
    move-result v0

    .line 1111
    if-eqz v0, :cond_16

    .line 1112
    .line 1113
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1114
    .line 1115
    .line 1116
    move-result-object v0

    .line 1117
    move-object v7, v0

    .line 1118
    check-cast v7, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世哲苏兰;

    .line 1119
    .line 1120
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 1121
    .line 1122
    .line 1123
    move-result v0

    .line 1124
    new-instance v8, Landroid/os/Message;

    .line 1125
    .line 1126
    invoke-direct {v8}, Landroid/os/Message;-><init>()V

    .line 1127
    .line 1128
    .line 1129
    filled-new-array {v0, v6}, [I

    .line 1130
    .line 1131
    .line 1132
    move-result-object v0

    .line 1133
    iput-object v0, v8, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1134
    .line 1135
    sget-object v0, L飘花落叶言世哲兰楪子苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Landroidx/appcompat/app/飘花落叶言子楪苏世哲兰;

    .line 1136
    .line 1137
    invoke-virtual {v0, v8}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1138
    .line 1139
    .line 1140
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1141
    .line 1142
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 1143
    .line 1144
    .line 1145
    const/16 v8, 0x303

    .line 1146
    .line 1147
    invoke-static {v8}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 1148
    .line 1149
    .line 1150
    move-result-object v8

    .line 1151
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1152
    .line 1153
    .line 1154
    invoke-virtual {v7}, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世哲苏兰;->getItemPath()Ljava/lang/String;

    .line 1155
    .line 1156
    .line 1157
    move-result-object v8

    .line 1158
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1159
    .line 1160
    .line 1161
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1162
    .line 1163
    .line 1164
    move-result-object v0

    .line 1165
    invoke-static {v0}, L飘花落叶言世哲兰楪子苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)V

    .line 1166
    .line 1167
    .line 1168
    instance-of v0, v7, L飘花落叶言世哲兰楪苏子/飘花落叶言子楪世苏哲兰;

    .line 1169
    .line 1170
    if-eqz v0, :cond_15

    .line 1171
    .line 1172
    move-object v0, v7

    .line 1173
    check-cast v0, L飘花落叶言世哲兰楪苏子/飘花落叶言子楪世苏哲兰;

    .line 1174
    .line 1175
    invoke-interface {v0}, L飘花落叶言世哲兰楪苏子/飘花落叶言子楪世苏哲兰;->run()V

    .line 1176
    .line 1177
    .line 1178
    :cond_15
    instance-of v0, v7, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世苏哲兰;

    .line 1179
    .line 1180
    if-eqz v0, :cond_14

    .line 1181
    .line 1182
    move-object v0, v7

    .line 1183
    check-cast v0, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世苏哲兰;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_6

    .line 1184
    .line 1185
    :try_start_7
    new-instance v8, Lcom/bumptech/glide/飘花落叶言子楪苏哲兰世;

    .line 1186
    .line 1187
    invoke-direct {v8, v1}, Lcom/bumptech/glide/飘花落叶言子楪苏哲兰世;-><init>(I)V

    .line 1188
    .line 1189
    .line 1190
    invoke-interface {v0, v8}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Lcom/bumptech/glide/飘花落叶言子楪苏哲兰世;)V

    .line 1191
    .line 1192
    .line 1193
    invoke-virtual {v7}, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世哲苏兰;->getItemPath()Ljava/lang/String;

    .line 1194
    .line 1195
    .line 1196
    move-result-object v0

    .line 1197
    invoke-virtual {v8}, Lcom/bumptech/glide/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏兰哲()Lcom/alibaba/fastjson2/JSONObject;

    .line 1198
    .line 1199
    .line 1200
    move-result-object v8

    .line 1201
    invoke-virtual {v2, v0, v8}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_5

    .line 1202
    .line 1203
    .line 1204
    goto :goto_11

    .line 1205
    :catch_5
    move-exception v0

    .line 1206
    :try_start_8
    invoke-virtual {v7}, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世哲苏兰;->getExceptionCollectionToolInstance()L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世苏兰哲;

    .line 1207
    .line 1208
    .line 1209
    move-result-object v7

    .line 1210
    invoke-virtual {v7, v0}, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Throwable;)V

    .line 1211
    .line 1212
    .line 1213
    goto :goto_11

    .line 1214
    :cond_16
    const/16 v0, 0x304

    .line 1215
    .line 1216
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 1217
    .line 1218
    .line 1219
    move-result-object v0

    .line 1220
    invoke-static {v0}, L飘花落叶言世哲兰楪子苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)V

    .line 1221
    .line 1222
    .line 1223
    const/16 v0, 0x301

    .line 1224
    .line 1225
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 1226
    .line 1227
    .line 1228
    move-result-object v0

    .line 1229
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONObject;->toString()Ljava/lang/String;

    .line 1230
    .line 1231
    .line 1232
    move-result-object v1

    .line 1233
    invoke-virtual {p0, v1, v0}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1234
    .line 1235
    .line 1236
    sget-object v0, L飘花落叶言世哲兰楪子苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1237
    .line 1238
    invoke-virtual {v0, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 1239
    .line 1240
    .line 1241
    const/16 v0, 0x2ff

    .line 1242
    .line 1243
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 1244
    .line 1245
    .line 1246
    move-result-object v0

    .line 1247
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1248
    .line 1249
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1250
    .line 1251
    .line 1252
    sget-object v2, L飘花落叶言世哲子楪兰苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 1253
    .line 1254
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1255
    .line 1256
    .line 1257
    const-string v2, "\u55b5\u545c\u55b5\u55b5\u545c\u55b5\u55b5\u545c"

    .line 1258
    .line 1259
    invoke-static {v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 1260
    .line 1261
    .line 1262
    move-result-object v2

    .line 1263
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1264
    .line 1265
    .line 1266
    sget-object v2, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏:Ljava/lang/String;

    .line 1267
    .line 1268
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1269
    .line 1270
    .line 1271
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1272
    .line 1273
    .line 1274
    move-result-object v1

    .line 1275
    invoke-virtual {p0, v1, v0}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1276
    .line 1277
    .line 1278
    const-string v0, "\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c"

    .line 1279
    .line 1280
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 1281
    .line 1282
    .line 1283
    move-result-object v0

    .line 1284
    invoke-static {}, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰()Ljava/lang/String;

    .line 1285
    .line 1286
    .line 1287
    move-result-object v1

    .line 1288
    invoke-virtual {p0, v1, v0}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1289
    .line 1290
    .line 1291
    const-wide/16 v0, 0x1f4

    .line 1292
    .line 1293
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V

    .line 1294
    .line 1295
    .line 1296
    const-string p0, "\u55b5\u55b5\u545c\u545c\u55b5\u545c\u545c\u55b5~\u55b5\u55b5\u545c\u545c\u545c\u55b5\u545c\u545c~\u55b5\u55b5\u545c\u545c\u545c\u545c\u545c\u55b5"

    .line 1297
    .line 1298
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 1299
    .line 1300
    .line 1301
    move-result-object p0

    .line 1302
    invoke-static {p0}, L飘花落叶言世哲兰楪子苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_6

    .line 1303
    .line 1304
    .line 1305
    goto :goto_12

    .line 1306
    :catch_6
    move-exception v0

    .line 1307
    move-object p0, v0

    .line 1308
    invoke-static {p0}, Lde/robv/android/xposed/XposedBridge;->log(Ljava/lang/Throwable;)V

    .line 1309
    .line 1310
    .line 1311
    invoke-static {p0}, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Exception;)V

    .line 1312
    .line 1313
    .line 1314
    :goto_12
    sget-object p0, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏:Landroid/content/Context;

    .line 1315
    .line 1316
    invoke-static {p0}, Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;->飘花落叶言子世楪哲苏兰(Landroid/content/Context;)V

    .line 1317
    .line 1318
    .line 1319
    goto :goto_13

    .line 1320
    :cond_17
    const-string p0, "storePath is empty(\u8bf7\u4f7f\u7528KvHelper.initialize(String path)\u521d\u59cb\u5316"

    .line 1321
    .line 1322
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 1323
    .line 1324
    .line 1325
    :goto_13
    return-void

    .line 1326
    :pswitch_e
    invoke-static {}, Llin/xposed/hook/view/main/MainSettingActivity;->飘花落叶言子楪兰世苏哲()V

    .line 1327
    .line 1328
    .line 1329
    return-void

    .line 1330
    :pswitch_f
    const/16 p0, 0x50c

    .line 1331
    .line 1332
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 1333
    .line 1334
    .line 1335
    move-result-object p0

    .line 1336
    invoke-static {p0}, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 1337
    .line 1338
    .line 1339
    return-void

    .line 1340
    :pswitch_10
    invoke-static {}, Ltop/suzhelan/qstory/ui/activity/SettingActivity;->飘花落叶言子楪哲世兰苏()V

    .line 1341
    .line 1342
    .line 1343
    return-void

    .line 1344
    :pswitch_11
    sget p0, Ltop/suzhelan/plugin/sdk/online/manager/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 1345
    .line 1346
    sget-object v1, Ltop/suzhelan/plugin/sdk/online/manager/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Ljava/util/LinkedHashSet;

    .line 1347
    .line 1348
    monitor-enter v1

    .line 1349
    :try_start_9
    invoke-static {v1}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子兰苏哲世楪(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1350
    .line 1351
    .line 1352
    move-result-object v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 1353
    monitor-exit v1

    .line 1354
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1355
    .line 1356
    .line 1357
    move-result-object v1

    .line 1358
    :goto_14
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1359
    .line 1360
    .line 1361
    move-result v0

    .line 1362
    if-eqz v0, :cond_18

    .line 1363
    .line 1364
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1365
    .line 1366
    .line 1367
    move-result-object v0

    .line 1368
    check-cast v0, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏世哲兰;

    .line 1369
    .line 1370
    :try_start_a
    invoke-virtual {v0, p0}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(I)V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_7

    .line 1371
    .line 1372
    .line 1373
    goto :goto_14

    .line 1374
    :catch_7
    move-exception v0

    .line 1375
    const-string v2, "MessageBadgeManager"

    .line 1376
    .line 1377
    const-string v3, "Error notifying listener"

    .line 1378
    .line 1379
    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1380
    .line 1381
    .line 1382
    goto :goto_14

    .line 1383
    :cond_18
    return-void

    .line 1384
    :catchall_1
    move-exception v0

    .line 1385
    move-object p0, v0

    .line 1386
    monitor-exit v1

    .line 1387
    throw p0

    .line 1388
    :pswitch_12
    invoke-static {}, Llin/xposed/hook/view/main/itemview/Update;->飘花落叶言子楪世兰苏哲()V

    .line 1389
    .line 1390
    .line 1391
    return-void

    .line 1392
    :pswitch_13
    invoke-static {}, Llin/xposed/hook/view/main/itemview/ClearLoginInformation;->飘花落叶言子楪世苏兰哲()V

    .line 1393
    .line 1394
    .line 1395
    :pswitch_14
    return-void

    .line 1396
    :pswitch_15
    sget-object p0, Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;->飘花落叶言子兰世哲楪苏:Landroidx/collection/飘花落叶言子世哲苏楪兰;

    .line 1397
    .line 1398
    monitor-enter p0

    .line 1399
    :try_start_b
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 1400
    .line 1401
    iget-object v3, p0, Landroidx/collection/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏哲兰:[Ljava/lang/Object;

    .line 1402
    .line 1403
    iget v5, p0, Landroidx/collection/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 1404
    .line 1405
    const/16 v6, 0x1e

    .line 1406
    .line 1407
    if-ge v0, v6, :cond_1a

    .line 1408
    .line 1409
    :goto_15
    if-ge v4, v5, :cond_1b

    .line 1410
    .line 1411
    :try_start_c
    aget-object v0, v3, v4

    .line 1412
    .line 1413
    check-cast v0, Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;

    .line 1414
    .line 1415
    invoke-virtual {v0}, Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;->getShowLayoutBounds()Z

    .line 1416
    .line 1417
    .line 1418
    move-result v2

    .line 1419
    sget-object v6, Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;->飘花落叶言子兰世楪哲苏:Ljava/lang/Class;

    .line 1420
    .line 1421
    invoke-static {}, Landroidx/compose/ui/platform/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪苏兰哲世()Z

    .line 1422
    .line 1423
    .line 1424
    move-result v6

    .line 1425
    invoke-virtual {v0, v6}, Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;->setShowLayoutBounds(Z)V

    .line 1426
    .line 1427
    .line 1428
    invoke-virtual {v0}, Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;->getShowLayoutBounds()Z

    .line 1429
    .line 1430
    .line 1431
    move-result v6

    .line 1432
    if-eq v2, v6, :cond_19

    .line 1433
    .line 1434
    new-instance v2, Landroidx/compose/ui/platform/飘花落叶言子楪苏兰世哲;

    .line 1435
    .line 1436
    invoke-direct {v2, v0, v1}, Landroidx/compose/ui/platform/飘花落叶言子楪苏兰世哲;-><init>(Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;I)V

    .line 1437
    .line 1438
    .line 1439
    invoke-virtual {v0, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 1440
    .line 1441
    .line 1442
    goto :goto_16

    .line 1443
    :catchall_2
    move-exception v0

    .line 1444
    goto :goto_18

    .line 1445
    :cond_19
    :goto_16
    add-int/lit8 v4, v4, 0x1

    .line 1446
    .line 1447
    goto :goto_15

    .line 1448
    :cond_1a
    :goto_17
    if-ge v4, v5, :cond_1b

    .line 1449
    .line 1450
    aget-object v0, v3, v4

    .line 1451
    .line 1452
    check-cast v0, Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;

    .line 1453
    .line 1454
    new-instance v1, Landroidx/compose/ui/platform/飘花落叶言子楪苏兰世哲;

    .line 1455
    .line 1456
    invoke-direct {v1, v0, v2}, Landroidx/compose/ui/platform/飘花落叶言子楪苏兰世哲;-><init>(Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;I)V

    .line 1457
    .line 1458
    .line 1459
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    .line 1460
    .line 1461
    .line 1462
    add-int/lit8 v4, v4, 0x1

    .line 1463
    .line 1464
    goto :goto_17

    .line 1465
    :cond_1b
    monitor-exit p0

    .line 1466
    return-void

    .line 1467
    :goto_18
    monitor-exit p0

    .line 1468
    throw v0

    .line 1469
    :pswitch_data_0
    .packed-switch 0x0
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
