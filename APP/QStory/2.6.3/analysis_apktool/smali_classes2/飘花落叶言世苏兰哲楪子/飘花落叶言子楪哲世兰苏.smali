.class public final synthetic L飘花落叶言世苏兰哲楪子/飘花落叶言子楪哲世兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

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
    new-instance p0, Lcom/google/gson/飘花落叶言子楪苏世哲兰;

    .line 15
    .line 16
    invoke-direct {p0}, Lcom/google/gson/飘花落叶言子楪苏世哲兰;-><init>()V

    .line 17
    .line 18
    .line 19
    return-object p0

    .line 20
    :pswitch_1
    new-instance p0, Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 21
    .line 22
    invoke-direct {p0}, Llin/xposed/hook/javaplugin/bean/PluginInfo;-><init>()V

    .line 23
    .line 24
    .line 25
    const/16 v0, 0x982

    .line 26
    .line 27
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {p0, v0}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->setPluginID(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const/16 v0, 0x983

    .line 35
    .line 36
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {p0, v0}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->setPluginName(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const-string v0, ""

    .line 44
    .line 45
    invoke-virtual {p0, v0}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->setPluginLocalPath(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    new-instance v0, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;

    .line 49
    .line 50
    new-instance v1, Llin/xposed/hook/javaplugin/controller/PluginLoader;

    .line 51
    .line 52
    invoke-direct {v1, p0}, Llin/xposed/hook/javaplugin/controller/PluginLoader;-><init>(Llin/xposed/hook/javaplugin/bean/PluginInfo;)V

    .line 53
    .line 54
    .line 55
    invoke-direct {v0, v1}, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;-><init>(Llin/xposed/hook/javaplugin/controller/PluginLoader;)V

    .line 56
    .line 57
    .line 58
    return-object v0

    .line 59
    :pswitch_2
    invoke-static {}, L飘花落叶言苏世哲楪兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰()Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-virtual {p0}, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->getCurrentGroupUin()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    return-object p0

    .line 68
    :pswitch_3
    new-instance p0, L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世兰苏哲;

    .line 69
    .line 70
    const/16 v0, 0x10

    .line 71
    .line 72
    invoke-direct {p0, v0}, L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世兰苏哲;-><init>(I)V

    .line 73
    .line 74
    .line 75
    invoke-static {p0}, L飘花落叶言苏世哲楪兰子/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏哲兰世(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    return-object p0

    .line 80
    :pswitch_4
    invoke-static {}, L飘花落叶言苏世哲楪兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰()Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-virtual {p0}, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->getGroupRKey()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    return-object p0

    .line 89
    :pswitch_5
    invoke-static {}, L飘花落叶言苏世哲楪兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰()Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    invoke-virtual {p0}, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->getRealSkey()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    return-object p0

    .line 98
    :pswitch_6
    invoke-static {}, L飘花落叶言苏世哲楪兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰()Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    invoke-virtual {p0}, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->getCurrentFriendUin()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    return-object p0

    .line 107
    :pswitch_7
    invoke-static {}, L飘花落叶言苏世哲楪兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰()Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    invoke-virtual {p0}, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->getSkey()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    return-object p0

    .line 116
    :pswitch_8
    invoke-static {}, L飘花落叶言苏世哲楪兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰()Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    invoke-virtual {p0}, Llin/xposed/hook/javaplugin/api/QQNTPluginMethod;->getFriendRKey()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    return-object p0

    .line 125
    :pswitch_9
    sget-object p0, L飘花落叶言世哲兰楪子苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/util/LinkedHashMap;

    .line 126
    .line 127
    const-class v0, Llin/xposed/hook/javaplugin/PluginMessageCallbackAPI;

    .line 128
    .line 129
    invoke-virtual {p0, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    const/16 v0, 0xa2f

    .line 134
    .line 135
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    check-cast p0, Llin/xposed/hook/javaplugin/PluginMessageCallbackAPI;

    .line 142
    .line 143
    return-object p0

    .line 144
    :pswitch_a
    sget-object p0, L飘花落叶言楪兰苏子哲世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:L飘花落叶言楪兰苏子哲世/飘花落叶言子楪世苏哲兰;

    .line 145
    .line 146
    const-string p0, "java.version"

    .line 147
    .line 148
    invoke-static {p0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    :try_start_0
    new-array v0, v2, [C

    .line 156
    .line 157
    fill-array-data v0, :array_0

    .line 158
    .line 159
    .line 160
    invoke-static {p0, v0}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子哲楪兰苏世(Ljava/lang/CharSequence;[C)Ljava/util/List;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 165
    .line 166
    .line 167
    move-result v3

    .line 168
    if-ne v3, v2, :cond_0

    .line 169
    .line 170
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    check-cast p0, Ljava/lang/String;

    .line 175
    .line 176
    const/4 v1, 0x1

    .line 177
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    check-cast v0, Ljava/lang/String;

    .line 182
    .line 183
    new-instance v1, L飘花落叶言楪兰苏子哲世/飘花落叶言子楪世苏哲兰;

    .line 184
    .line 185
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 186
    .line 187
    .line 188
    move-result v0

    .line 189
    invoke-direct {v1, p0, v0}, L飘花落叶言楪兰苏子哲世/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/String;I)V

    .line 190
    .line 191
    .line 192
    goto :goto_0

    .line 193
    :cond_0
    new-instance v1, L飘花落叶言楪兰苏子哲世/飘花落叶言子楪世苏哲兰;

    .line 194
    .line 195
    const/4 v0, -0x1

    .line 196
    invoke-direct {v1, p0, v0}, L飘花落叶言楪兰苏子哲世/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/String;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 197
    .line 198
    .line 199
    goto :goto_0

    .line 200
    :catchall_0
    sget-object v1, L飘花落叶言楪兰苏子哲世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:L飘花落叶言楪兰苏子哲世/飘花落叶言子楪世苏哲兰;

    .line 201
    .line 202
    :goto_0
    return-object v1

    .line 203
    :pswitch_b
    new-instance p0, Ljava/util/LinkedHashMap;

    .line 204
    .line 205
    invoke-direct {p0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 206
    .line 207
    .line 208
    return-object p0

    .line 209
    :pswitch_c
    new-instance p0, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 210
    .line 211
    invoke-direct {p0, v1}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;-><init>(Z)V

    .line 212
    .line 213
    .line 214
    return-object p0

    .line 215
    :pswitch_d
    new-instance p0, Lkotlin/text/飘花落叶言子楪兰哲世苏;

    .line 216
    .line 217
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 218
    .line 219
    .line 220
    new-instance v0, L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世兰苏哲;

    .line 221
    .line 222
    const/16 v1, 0x9

    .line 223
    .line 224
    invoke-direct {v0, v1}, L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世兰苏哲;-><init>(I)V

    .line 225
    .line 226
    .line 227
    invoke-static {p0, v0}, Lkotlin/sequences/飘花落叶言子楪哲世苏兰;->飘花落叶言子哲楪苏兰世(Lkotlin/sequences/飘花落叶言子楪苏哲世兰;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Lkotlin/sequences/飘花落叶言子楪世兰哲苏;

    .line 228
    .line 229
    .line 230
    move-result-object p0

    .line 231
    invoke-static {p0}, Lkotlin/sequences/飘花落叶言子楪哲世苏兰;->飘花落叶言子哲楪兰世苏(Lkotlin/sequences/飘花落叶言子楪苏哲世兰;)Ljava/util/List;

    .line 232
    .line 233
    .line 234
    move-result-object p0

    .line 235
    return-object p0

    .line 236
    :pswitch_e
    new-instance p0, Ljava/util/ArrayList;

    .line 237
    .line 238
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 239
    .line 240
    .line 241
    return-object p0

    .line 242
    :pswitch_f
    new-instance p0, Ljava/util/ArrayList;

    .line 243
    .line 244
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 245
    .line 246
    .line 247
    return-object p0

    .line 248
    :pswitch_10
    sget-object p0, L飘花落叶言楪兰世哲子苏/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 249
    .line 250
    invoke-interface {p0}, Lkotlin/飘花落叶言子楪苏世哲兰;->getValue()Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object p0

    .line 254
    check-cast p0, Ljava/util/List;

    .line 255
    .line 256
    invoke-static {p0}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子哲世楪兰苏(Ljava/lang/Iterable;)Lkotlin/collections/飘花落叶言子楪哲苏世兰;

    .line 257
    .line 258
    .line 259
    move-result-object p0

    .line 260
    new-instance v0, L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世兰苏哲;

    .line 261
    .line 262
    const/16 v1, 0x8

    .line 263
    .line 264
    invoke-direct {v0, v1}, L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世兰苏哲;-><init>(I)V

    .line 265
    .line 266
    .line 267
    invoke-static {p0, v0}, Lkotlin/sequences/飘花落叶言子楪哲世苏兰;->飘花落叶言子哲楪苏世兰(Lkotlin/sequences/飘花落叶言子楪苏哲世兰;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Lkotlin/sequences/飘花落叶言子楪哲世兰苏;

    .line 268
    .line 269
    .line 270
    move-result-object p0

    .line 271
    invoke-static {p0}, L飘花落叶言楪兰世哲子苏/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏兰哲(Lkotlin/sequences/飘花落叶言子楪苏哲世兰;)Ljava/util/LinkedHashMap;

    .line 272
    .line 273
    .line 274
    move-result-object p0

    .line 275
    return-object p0

    .line 276
    :pswitch_11
    new-instance p0, Lio/ktor/util/飘花落叶言子楪世哲兰苏;

    .line 277
    .line 278
    invoke-direct {p0}, Lio/ktor/util/飘花落叶言子楪世哲兰苏;-><init>()V

    .line 279
    .line 280
    .line 281
    sget-object v0, L飘花落叶言楪兰世哲子苏/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 282
    .line 283
    invoke-interface {v0}, Lkotlin/飘花落叶言子楪苏世哲兰;->getValue()Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    check-cast v0, Ljava/util/List;

    .line 288
    .line 289
    invoke-static {v0}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子哲世楪兰苏(Ljava/lang/Iterable;)Lkotlin/collections/飘花落叶言子楪哲苏世兰;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    invoke-static {v0}, L飘花落叶言楪兰世哲子苏/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏兰哲(Lkotlin/sequences/飘花落叶言子楪苏哲世兰;)Ljava/util/LinkedHashMap;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    invoke-virtual {p0, v0}, Lio/ktor/util/飘花落叶言子楪世哲兰苏;->putAll(Ljava/util/Map;)V

    .line 298
    .line 299
    .line 300
    return-object p0

    .line 301
    :pswitch_12
    sget-object p0, Lkotlin/random/飘花落叶言子楪世兰苏哲;->Default:Lkotlin/random/Random$Default;

    .line 302
    .line 303
    const/high16 v0, 0x7fff0000

    .line 304
    .line 305
    invoke-virtual {p0, v0}, Lkotlin/random/Random$Default;->nextInt(I)I

    .line 306
    .line 307
    .line 308
    move-result p0

    .line 309
    const/high16 v0, 0x10000

    .line 310
    .line 311
    add-int/2addr p0, v0

    .line 312
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 313
    .line 314
    .line 315
    move-result-object p0

    .line 316
    return-object p0

    .line 317
    :pswitch_13
    sget-object p0, L飘花落叶言子兰楪世苏哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/飘花落叶言子楪兰世苏哲;

    .line 318
    .line 319
    return-object v0

    .line 320
    :pswitch_14
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 321
    .line 322
    const-string v0, "CompositionLocal LocalSavedStateRegistryOwner not present"

    .line 323
    .line 324
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 325
    .line 326
    .line 327
    throw p0

    .line 328
    :pswitch_15
    sget-object p0, L飘花落叶言子世哲苏兰楪/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/飘花落叶言子哲兰世苏楪;

    .line 329
    .line 330
    return-object v0

    .line 331
    :pswitch_16
    new-instance p0, L飘花落叶言子世哲苏兰楪/飘花落叶言子楪世兰苏哲;

    .line 332
    .line 333
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 334
    .line 335
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 336
    .line 337
    .line 338
    invoke-direct {p0, v0}, L飘花落叶言子世哲苏兰楪/飘花落叶言子楪世兰苏哲;-><init>(Ljava/util/Map;)V

    .line 339
    .line 340
    .line 341
    return-object p0

    .line 342
    :pswitch_17
    sget-object p0, L飘花落叶言子世哲楪兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/飘花落叶言子哲兰世苏楪;

    .line 343
    .line 344
    sget-object p0, L飘花落叶言子世哲楪兰苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:L飘花落叶言子世哲楪兰苏/飘花落叶言子楪世苏哲兰;

    .line 345
    .line 346
    return-object p0

    .line 347
    :pswitch_18
    :try_start_1
    const-string p0, "java.nio.file.Files"

    .line 348
    .line 349
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 350
    .line 351
    .line 352
    new-instance p0, L飘花落叶言世楪哲苏子兰/飘花落叶言子楪苏兰哲世;

    .line 353
    .line 354
    invoke-direct {p0, v2}, L飘花落叶言世楪哲苏子兰/飘花落叶言子楪苏兰哲世;-><init>(I)V
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_0

    .line 355
    .line 356
    .line 357
    goto :goto_1

    .line 358
    :catch_0
    new-instance p0, L飘花落叶言世楪哲苏子兰/飘花落叶言子楪苏世兰哲;

    .line 359
    .line 360
    invoke-direct {p0, v2}, L飘花落叶言世楪哲苏子兰/飘花落叶言子楪苏世兰哲;-><init>(I)V

    .line 361
    .line 362
    .line 363
    :goto_1
    return-object p0

    .line 364
    :pswitch_19
    sget-object p0, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:L飘花落叶言世苏兰哲楪子/飘花落叶言子楪世兰苏哲;

    .line 365
    .line 366
    return-object p0

    .line 367
    :pswitch_1a
    sget-object p0, L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏兰哲:L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪哲苏兰;

    .line 368
    .line 369
    return-object p0

    .line 370
    :pswitch_1b
    sget-object p0, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言世苏兰哲子楪/飘花落叶言子苏世兰楪哲;

    .line 371
    .line 372
    return-object p0

    .line 373
    :pswitch_1c
    sget-object p0, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏兰哲:L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰哲苏;

    .line 374
    .line 375
    return-object p0

    .line 376
    nop

    .line 377
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

    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
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
    :array_0
    .array-data 2
        0x2ds
        0x5fs
    .end array-data
.end method
