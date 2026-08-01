.class public final synthetic L飘花落叶言世苏兰哲楪子/飘花落叶言子楪哲世兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;


# instance fields
.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget p0, p0, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x0

    .line 5
    const/4 v2, 0x2

    .line 6
    packed-switch p0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    invoke-static {}, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncContent;->飘花落叶言子楪世苏哲兰()L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :pswitch_0
    sget-object p0, L飘花落叶言世哲兰楪苏子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/util/LinkedHashMap;

    .line 15
    .line 16
    const-class v0, Llin/xposed/hook/javaplugin/PluginMessageCallbackAPI;

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    const-wide v0, -0x36a5f67c051405a7L    # -2.3225931850300602E45

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    check-cast p0, Llin/xposed/hook/javaplugin/PluginMessageCallbackAPI;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_1
    new-instance p0, Lcom/google/gson/飘花落叶言子楪苏世哲兰;

    .line 37
    .line 38
    invoke-direct {p0}, Lcom/google/gson/飘花落叶言子楪苏世哲兰;-><init>()V

    .line 39
    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_2
    new-instance p0, Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 43
    .line 44
    invoke-direct {p0}, Llin/xposed/hook/javaplugin/bean/PluginInfo;-><init>()V

    .line 45
    .line 46
    .line 47
    const-wide v0, -0x36a5e064051405a7L    # -2.3302917332992795E45

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {p0, v0}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->setPluginID(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    const-wide v0, -0x36a5e056051405a7L    # -2.330310789111827E45

    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {p0, v0}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->setPluginName(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    const-wide v0, -0x36a507c2051405a7L    # -2.405777251318085E45

    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {p0, v0}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->setPluginLocalPath(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    new-instance v0, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;

    .line 84
    .line 85
    new-instance v1, Llin/xposed/hook/javaplugin/controller/PluginLoader;

    .line 86
    .line 87
    invoke-direct {v1, p0}, Llin/xposed/hook/javaplugin/controller/PluginLoader;-><init>(Llin/xposed/hook/javaplugin/bean/PluginInfo;)V

    .line 88
    .line 89
    .line 90
    invoke-direct {v0, v1}, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;-><init>(Llin/xposed/hook/javaplugin/controller/PluginLoader;)V

    .line 91
    .line 92
    .line 93
    return-object v0

    .line 94
    :pswitch_3
    invoke-static {}, L飘花落叶言苏世哲兰子楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰()Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    invoke-virtual {p0}, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->getCurrentGroupUin()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    return-object p0

    .line 103
    :pswitch_4
    new-instance p0, L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世兰苏哲;

    .line 104
    .line 105
    const/16 v0, 0x10

    .line 106
    .line 107
    invoke-direct {p0, v0}, L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世兰苏哲;-><init>(I)V

    .line 108
    .line 109
    .line 110
    invoke-static {p0}, L飘花落叶言苏世哲兰子楪/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏哲兰世(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    return-object p0

    .line 115
    :pswitch_5
    invoke-static {}, L飘花落叶言苏世哲兰子楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰()Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    invoke-virtual {p0}, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->getGroupRKey()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    return-object p0

    .line 124
    :pswitch_6
    invoke-static {}, L飘花落叶言苏世哲兰子楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰()Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    invoke-virtual {p0}, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->getRealSkey()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    return-object p0

    .line 133
    :pswitch_7
    invoke-static {}, L飘花落叶言苏世哲兰子楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰()Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    invoke-virtual {p0}, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->getCurrentFriendUin()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    return-object p0

    .line 142
    :pswitch_8
    invoke-static {}, L飘花落叶言苏世哲兰子楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰()Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    invoke-virtual {p0}, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->getSkey()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    return-object p0

    .line 151
    :pswitch_9
    invoke-static {}, L飘花落叶言苏世哲兰子楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰()Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    invoke-virtual {p0}, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->getFriendRKey()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    return-object p0

    .line 160
    :pswitch_a
    sget-object p0, L飘花落叶言楪兰苏子哲世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:L飘花落叶言楪兰苏子哲世/飘花落叶言子楪世苏哲兰;

    .line 161
    .line 162
    const-string p0, "java.version"

    .line 163
    .line 164
    invoke-static {p0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    :try_start_0
    new-array v0, v2, [C

    .line 172
    .line 173
    fill-array-data v0, :array_0

    .line 174
    .line 175
    .line 176
    invoke-static {p0, v0}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子哲楪苏世兰(Ljava/lang/CharSequence;[C)Ljava/util/List;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 181
    .line 182
    .line 183
    move-result v3

    .line 184
    if-ne v3, v2, :cond_0

    .line 185
    .line 186
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    check-cast p0, Ljava/lang/String;

    .line 191
    .line 192
    const/4 v1, 0x1

    .line 193
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    check-cast v0, Ljava/lang/String;

    .line 198
    .line 199
    new-instance v1, L飘花落叶言楪兰苏子哲世/飘花落叶言子楪世苏哲兰;

    .line 200
    .line 201
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 202
    .line 203
    .line 204
    move-result v0

    .line 205
    invoke-direct {v1, p0, v0}, L飘花落叶言楪兰苏子哲世/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/String;I)V

    .line 206
    .line 207
    .line 208
    goto :goto_0

    .line 209
    :cond_0
    new-instance v1, L飘花落叶言楪兰苏子哲世/飘花落叶言子楪世苏哲兰;

    .line 210
    .line 211
    const/4 v0, -0x1

    .line 212
    invoke-direct {v1, p0, v0}, L飘花落叶言楪兰苏子哲世/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/String;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 213
    .line 214
    .line 215
    goto :goto_0

    .line 216
    :catchall_0
    sget-object v1, L飘花落叶言楪兰苏子哲世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:L飘花落叶言楪兰苏子哲世/飘花落叶言子楪世苏哲兰;

    .line 217
    .line 218
    :goto_0
    return-object v1

    .line 219
    :pswitch_b
    new-instance p0, Ljava/util/LinkedHashMap;

    .line 220
    .line 221
    invoke-direct {p0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 222
    .line 223
    .line 224
    return-object p0

    .line 225
    :pswitch_c
    new-instance p0, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 226
    .line 227
    invoke-direct {p0, v1}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;-><init>(Z)V

    .line 228
    .line 229
    .line 230
    return-object p0

    .line 231
    :pswitch_d
    new-instance p0, Lkotlin/text/飘花落叶言子楪兰哲世苏;

    .line 232
    .line 233
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 234
    .line 235
    .line 236
    new-instance v0, L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世兰苏哲;

    .line 237
    .line 238
    const/16 v1, 0x9

    .line 239
    .line 240
    invoke-direct {v0, v1}, L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世兰苏哲;-><init>(I)V

    .line 241
    .line 242
    .line 243
    invoke-static {p0, v0}, Lkotlin/sequences/飘花落叶言子楪哲世苏兰;->飘花落叶言子苏世楪哲兰(Lkotlin/sequences/飘花落叶言子楪苏哲世兰;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Lkotlin/sequences/飘花落叶言子楪世兰哲苏;

    .line 244
    .line 245
    .line 246
    move-result-object p0

    .line 247
    invoke-static {p0}, Lkotlin/sequences/飘花落叶言子楪哲世苏兰;->飘花落叶言子苏世楪兰哲(Lkotlin/sequences/飘花落叶言子楪苏哲世兰;)Ljava/util/List;

    .line 248
    .line 249
    .line 250
    move-result-object p0

    .line 251
    return-object p0

    .line 252
    :pswitch_e
    new-instance p0, Ljava/util/ArrayList;

    .line 253
    .line 254
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 255
    .line 256
    .line 257
    return-object p0

    .line 258
    :pswitch_f
    new-instance p0, Ljava/util/ArrayList;

    .line 259
    .line 260
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 261
    .line 262
    .line 263
    return-object p0

    .line 264
    :pswitch_10
    sget-object p0, L飘花落叶言楪兰世哲子苏/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 265
    .line 266
    invoke-interface {p0}, Lkotlin/飘花落叶言子楪苏世哲兰;->getValue()Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object p0

    .line 270
    check-cast p0, Ljava/util/List;

    .line 271
    .line 272
    invoke-static {p0}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子世兰楪苏哲(Ljava/lang/Iterable;)Lkotlin/collections/飘花落叶言子楪哲苏世兰;

    .line 273
    .line 274
    .line 275
    move-result-object p0

    .line 276
    new-instance v0, L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世兰苏哲;

    .line 277
    .line 278
    const/16 v1, 0x8

    .line 279
    .line 280
    invoke-direct {v0, v1}, L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世兰苏哲;-><init>(I)V

    .line 281
    .line 282
    .line 283
    invoke-static {p0, v0}, Lkotlin/sequences/飘花落叶言子楪哲世苏兰;->飘花落叶言子苏楪兰哲世(Lkotlin/sequences/飘花落叶言子楪苏哲世兰;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Lkotlin/sequences/飘花落叶言子楪哲世兰苏;

    .line 284
    .line 285
    .line 286
    move-result-object p0

    .line 287
    invoke-static {p0}, L飘花落叶言楪兰世哲子苏/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏兰哲(Lkotlin/sequences/飘花落叶言子楪苏哲世兰;)Ljava/util/LinkedHashMap;

    .line 288
    .line 289
    .line 290
    move-result-object p0

    .line 291
    return-object p0

    .line 292
    :pswitch_11
    new-instance p0, Lio/ktor/util/飘花落叶言子楪世哲兰苏;

    .line 293
    .line 294
    invoke-direct {p0}, Lio/ktor/util/飘花落叶言子楪世哲兰苏;-><init>()V

    .line 295
    .line 296
    .line 297
    sget-object v0, L飘花落叶言楪兰世哲子苏/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 298
    .line 299
    invoke-interface {v0}, Lkotlin/飘花落叶言子楪苏世哲兰;->getValue()Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    check-cast v0, Ljava/util/List;

    .line 304
    .line 305
    invoke-static {v0}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子世兰楪苏哲(Ljava/lang/Iterable;)Lkotlin/collections/飘花落叶言子楪哲苏世兰;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    invoke-static {v0}, L飘花落叶言楪兰世哲子苏/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏兰哲(Lkotlin/sequences/飘花落叶言子楪苏哲世兰;)Ljava/util/LinkedHashMap;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    invoke-virtual {p0, v0}, Lio/ktor/util/飘花落叶言子楪世哲兰苏;->putAll(Ljava/util/Map;)V

    .line 314
    .line 315
    .line 316
    return-object p0

    .line 317
    :pswitch_12
    sget-object p0, Lkotlin/random/飘花落叶言子楪世兰苏哲;->Default:Lkotlin/random/Random$Default;

    .line 318
    .line 319
    const/high16 v0, 0x7fff0000

    .line 320
    .line 321
    invoke-virtual {p0, v0}, Lkotlin/random/Random$Default;->nextInt(I)I

    .line 322
    .line 323
    .line 324
    move-result p0

    .line 325
    const/high16 v0, 0x10000

    .line 326
    .line 327
    add-int/2addr p0, v0

    .line 328
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 329
    .line 330
    .line 331
    move-result-object p0

    .line 332
    return-object p0

    .line 333
    :pswitch_13
    sget-object p0, L飘花落叶言子兰楪世苏哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/飘花落叶言子楪兰世苏哲;

    .line 334
    .line 335
    return-object v0

    .line 336
    :pswitch_14
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 337
    .line 338
    const-string v0, "CompositionLocal LocalSavedStateRegistryOwner not present"

    .line 339
    .line 340
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 341
    .line 342
    .line 343
    throw p0

    .line 344
    :pswitch_15
    sget-object p0, L飘花落叶言子世哲苏兰楪/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/飘花落叶言子哲兰世苏楪;

    .line 345
    .line 346
    return-object v0

    .line 347
    :pswitch_16
    new-instance p0, L飘花落叶言子世哲苏兰楪/飘花落叶言子楪世兰苏哲;

    .line 348
    .line 349
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 350
    .line 351
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 352
    .line 353
    .line 354
    invoke-direct {p0, v0}, L飘花落叶言子世哲苏兰楪/飘花落叶言子楪世兰苏哲;-><init>(Ljava/util/Map;)V

    .line 355
    .line 356
    .line 357
    return-object p0

    .line 358
    :pswitch_17
    sget-object p0, L飘花落叶言子世哲楪兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/飘花落叶言子哲兰世苏楪;

    .line 359
    .line 360
    sget-object p0, L飘花落叶言子世哲楪兰苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:L飘花落叶言子世哲楪兰苏/飘花落叶言子楪世苏哲兰;

    .line 361
    .line 362
    return-object p0

    .line 363
    :pswitch_18
    :try_start_1
    const-string p0, "java.nio.file.Files"

    .line 364
    .line 365
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 366
    .line 367
    .line 368
    new-instance p0, L飘花落叶言世楪哲苏子兰/飘花落叶言子楪苏兰哲世;

    .line 369
    .line 370
    invoke-direct {p0, v2}, L飘花落叶言世楪哲苏子兰/飘花落叶言子楪苏兰哲世;-><init>(I)V
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_0

    .line 371
    .line 372
    .line 373
    goto :goto_1

    .line 374
    :catch_0
    new-instance p0, L飘花落叶言世楪哲苏子兰/飘花落叶言子楪苏世兰哲;

    .line 375
    .line 376
    invoke-direct {p0, v2}, L飘花落叶言世楪哲苏子兰/飘花落叶言子楪苏世兰哲;-><init>(I)V

    .line 377
    .line 378
    .line 379
    :goto_1
    return-object p0

    .line 380
    :pswitch_19
    sget-object p0, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:L飘花落叶言世苏兰哲楪子/飘花落叶言子楪世兰苏哲;

    .line 381
    .line 382
    return-object p0

    .line 383
    :pswitch_1a
    sget-object p0, L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏兰哲:L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪哲苏兰;

    .line 384
    .line 385
    return-object p0

    .line 386
    :pswitch_1b
    sget-object p0, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言世苏兰哲子楪/飘花落叶言子苏世兰楪哲;

    .line 387
    .line 388
    return-object p0

    .line 389
    :pswitch_1c
    sget-object p0, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏兰哲:L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰哲苏;

    .line 390
    .line 391
    return-object p0

    .line 392
    nop

    .line 393
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

    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    :array_0
    .array-data 2
        0x2ds
        0x5fs
    .end array-data
.end method
