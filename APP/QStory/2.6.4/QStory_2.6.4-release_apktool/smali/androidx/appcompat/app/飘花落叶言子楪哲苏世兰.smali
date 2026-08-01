.class public final synthetic Landroidx/appcompat/app/飘花落叶言子楪哲苏世兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Landroid/content/Context;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/appcompat/app/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, Landroidx/appcompat/app/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰世苏:Landroid/content/Context;

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
    .locals 10

    .line 1
    iget v0, p0, Landroidx/appcompat/app/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    iget-object p0, p0, Landroidx/appcompat/app/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰世苏:Landroid/content/Context;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    :try_start_0
    invoke-static {}, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世苏兰()Lcom/alibaba/fastjson2/JSONObject;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v3, "\u55b5\u55b5\u545c\u55b5\u55b5\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5"

    .line 15
    .line 16
    invoke-static {v3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-static {}, Llin/xposed/hook/util/qq/QQEnvTool;->getCurrentUin()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    invoke-virtual {v0, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    const/16 v3, 0xba0

    .line 28
    .line 29
    invoke-static {v3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-static {}, Llin/xposed/hook/util/qq/QQEnvTool;->getCurrentAccountNickName()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    invoke-virtual {v0, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    invoke-static {}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰世哲苏()Landroid/util/Pair;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    if-eqz v3, :cond_0

    .line 45
    .line 46
    const-string v4, "\u55b5\u55b5\u545c\u545c\u545c\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c"

    .line 47
    .line 48
    invoke-static {v4}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    iget-object v5, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 53
    .line 54
    invoke-virtual {v0, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    const/16 v4, 0xba1

    .line 58
    .line 59
    invoke-static {v4}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    iget-object v3, v3, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 64
    .line 65
    invoke-virtual {v0, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :catch_0
    move-exception v0

    .line 70
    move-object p0, v0

    .line 71
    goto :goto_1

    .line 72
    :cond_0
    :goto_0
    new-instance v3, Ljava/util/concurrent/CountDownLatch;

    .line 73
    .line 74
    invoke-direct {v3, v2}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 75
    .line 76
    .line 77
    new-instance v4, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 78
    .line 79
    invoke-direct {v4}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 80
    .line 81
    .line 82
    const-string v5, ""

    .line 83
    .line 84
    iput-object v5, v4, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 85
    .line 86
    sget-object v5, L飘花落叶言苏哲兰子世楪/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Landroid/os/Handler;

    .line 87
    .line 88
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    new-instance v5, L飘花落叶言世哲子苏楪兰/飘花落叶言子世哲兰苏楪;

    .line 92
    .line 93
    const/16 v6, 0xd

    .line 94
    .line 95
    invoke-direct {v5, v4, v6, v3}, L飘花落叶言世哲子苏楪兰/飘花落叶言子世哲兰苏楪;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    const-string v6, "\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u545c"

    .line 99
    .line 100
    invoke-static {v6}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    const/16 v6, 0x567

    .line 104
    .line 105
    invoke-static {v6}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    sget-object v6, L飘花落叶言苏世子兰哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/ExecutorService;

    .line 109
    .line 110
    new-instance v7, L飘花落叶言苏哲世楪兰子/飘花落叶言子楪世兰哲苏;

    .line 111
    .line 112
    invoke-direct {v7, p0, v1, v5}, L飘花落叶言苏哲世楪兰子/飘花落叶言子楪世兰哲苏;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    invoke-interface {v6, v7}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v3}, Ljava/util/concurrent/CountDownLatch;->await()V

    .line 119
    .line 120
    .line 121
    iget-object p0, v4, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast p0, Ljava/lang/CharSequence;

    .line 124
    .line 125
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 126
    .line 127
    .line 128
    move-result p0

    .line 129
    if-lez p0, :cond_1

    .line 130
    .line 131
    const/16 p0, 0xba2

    .line 132
    .line 133
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    iget-object v1, v4, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 138
    .line 139
    invoke-virtual {v0, p0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    const-string p0, "\u55b5\u55b5\u545c\u545c\u545c\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c"

    .line 143
    .line 144
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    const-string v1, "\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u545c"

    .line 149
    .line 150
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    invoke-virtual {v0, p0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    :cond_1
    invoke-static {}, L飘花落叶言苏哲楪兰世子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏()L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世哲兰苏;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    invoke-interface {p0, v0}, L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(Lcom/alibaba/fastjson2/JSONObject;)Lretrofit2/飘花落叶言子楪世兰苏哲;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    invoke-interface {p0}, Lretrofit2/飘花落叶言子楪世兰苏哲;->execute()Lretrofit2/飘花落叶言子世兰楪哲苏;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 166
    .line 167
    .line 168
    goto :goto_2

    .line 169
    :goto_1
    const/16 v0, 0xba3

    .line 170
    .line 171
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    invoke-virtual {p0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    invoke-static {v0, v1, p0, v2}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 180
    .line 181
    .line 182
    :goto_2
    return-void

    .line 183
    :pswitch_0
    new-instance v0, Landroidx/profileinstaller/飘花落叶言子楪世哲兰苏;

    .line 184
    .line 185
    const/4 v1, 0x0

    .line 186
    invoke-direct {v0, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲兰苏;-><init>(I)V

    .line 187
    .line 188
    .line 189
    sget-object v2, Landroidx/profileinstaller/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Lio/ktor/client/plugins/api/飘花落叶言子楪世苏兰哲;

    .line 190
    .line 191
    invoke-static {p0, v0, v2, v1}, Landroidx/profileinstaller/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世哲苏(Landroid/content/Context;Ljava/util/concurrent/Executor;Landroidx/profileinstaller/飘花落叶言子楪世兰苏哲;Z)V

    .line 192
    .line 193
    .line 194
    return-void

    .line 195
    :pswitch_1
    new-instance v3, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 196
    .line 197
    new-instance v9, Ljava/util/concurrent/LinkedBlockingQueue;

    .line 198
    .line 199
    invoke-direct {v9}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    .line 200
    .line 201
    .line 202
    const/4 v4, 0x0

    .line 203
    const/4 v5, 0x1

    .line 204
    const-wide/16 v6, 0x0

    .line 205
    .line 206
    sget-object v8, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 207
    .line 208
    invoke-direct/range {v3 .. v9}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    .line 209
    .line 210
    .line 211
    new-instance v0, Landroidx/appcompat/app/飘花落叶言子楪哲苏世兰;

    .line 212
    .line 213
    invoke-direct {v0, p0, v1}, Landroidx/appcompat/app/飘花落叶言子楪哲苏世兰;-><init>(Landroid/content/Context;I)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v3, v0}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 217
    .line 218
    .line 219
    return-void

    .line 220
    :pswitch_2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 221
    .line 222
    const/16 v1, 0x21

    .line 223
    .line 224
    if-lt v0, v1, :cond_7

    .line 225
    .line 226
    new-instance v3, Landroid/content/ComponentName;

    .line 227
    .line 228
    const-string v4, "androidx.appcompat.app.AppLocalesMetadataHolderService"

    .line 229
    .line 230
    invoke-direct {v3, p0, v4}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 234
    .line 235
    .line 236
    move-result-object v4

    .line 237
    invoke-virtual {v4, v3}, Landroid/content/pm/PackageManager;->getComponentEnabledSetting(Landroid/content/ComponentName;)I

    .line 238
    .line 239
    .line 240
    move-result v4

    .line 241
    if-eq v4, v2, :cond_7

    .line 242
    .line 243
    const-string v4, "locale"

    .line 244
    .line 245
    if-lt v0, v1, :cond_4

    .line 246
    .line 247
    sget-object v0, Landroidx/appcompat/app/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪兰苏哲世:Landroidx/collection/飘花落叶言子楪苏世兰哲;

    .line 248
    .line 249
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    new-instance v1, Landroidx/collection/飘花落叶言子楪世苏兰哲;

    .line 253
    .line 254
    invoke-direct {v1, v0}, Landroidx/collection/飘花落叶言子楪世苏兰哲;-><init>(Landroidx/collection/飘花落叶言子楪苏世兰哲;)V

    .line 255
    .line 256
    .line 257
    :cond_2
    invoke-virtual {v1}, Landroidx/collection/飘花落叶言子楪世苏兰哲;->hasNext()Z

    .line 258
    .line 259
    .line 260
    move-result v0

    .line 261
    if-eqz v0, :cond_3

    .line 262
    .line 263
    invoke-virtual {v1}, Landroidx/collection/飘花落叶言子楪世苏兰哲;->next()Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    check-cast v0, Ljava/lang/ref/WeakReference;

    .line 268
    .line 269
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    check-cast v0, Landroidx/appcompat/app/飘花落叶言子楪兰苏世哲;

    .line 274
    .line 275
    if-eqz v0, :cond_2

    .line 276
    .line 277
    check-cast v0, Landroidx/appcompat/app/飘花落叶言子世哲楪兰苏;

    .line 278
    .line 279
    iget-object v0, v0, Landroidx/appcompat/app/飘花落叶言子世哲楪兰苏;->飘花落叶言子世楪苏兰哲:Landroid/content/Context;

    .line 280
    .line 281
    if-eqz v0, :cond_2

    .line 282
    .line 283
    invoke-virtual {v0, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    goto :goto_3

    .line 288
    :cond_3
    const/4 v0, 0x0

    .line 289
    :goto_3
    if-eqz v0, :cond_5

    .line 290
    .line 291
    invoke-static {v0}, Landroidx/appcompat/app/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Landroid/os/LocaleList;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    new-instance v1, Landroidx/core/os/飘花落叶言子楪苏哲世兰;

    .line 296
    .line 297
    new-instance v5, Landroidx/core/os/飘花落叶言子楪苏哲兰世;

    .line 298
    .line 299
    invoke-direct {v5, v0}, Landroidx/core/os/飘花落叶言子楪苏哲兰世;-><init>(Landroid/os/LocaleList;)V

    .line 300
    .line 301
    .line 302
    invoke-direct {v1, v5}, Landroidx/core/os/飘花落叶言子楪苏哲世兰;-><init>(Landroidx/core/os/飘花落叶言子楪苏哲兰世;)V

    .line 303
    .line 304
    .line 305
    goto :goto_4

    .line 306
    :cond_4
    sget-object v1, Landroidx/appcompat/app/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲兰苏世:Landroidx/core/os/飘花落叶言子楪苏哲世兰;

    .line 307
    .line 308
    if-eqz v1, :cond_5

    .line 309
    .line 310
    goto :goto_4

    .line 311
    :cond_5
    sget-object v1, Landroidx/core/os/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲:Landroidx/core/os/飘花落叶言子楪苏哲世兰;

    .line 312
    .line 313
    :goto_4
    iget-object v0, v1, Landroidx/core/os/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:Landroidx/core/os/飘花落叶言子楪苏哲兰世;

    .line 314
    .line 315
    iget-object v0, v0, Landroidx/core/os/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Landroid/os/LocaleList;

    .line 316
    .line 317
    invoke-virtual {v0}, Landroid/os/LocaleList;->isEmpty()Z

    .line 318
    .line 319
    .line 320
    move-result v0

    .line 321
    if-eqz v0, :cond_6

    .line 322
    .line 323
    invoke-static {p0}, L飘花落叶言子哲楪世苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰(Landroid/content/Context;)Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    invoke-virtual {p0, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object v1

    .line 331
    if-eqz v1, :cond_6

    .line 332
    .line 333
    invoke-static {v0}, Landroidx/appcompat/app/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Landroid/os/LocaleList;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    invoke-static {v1, v0}, Landroidx/appcompat/app/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;Landroid/os/LocaleList;)V

    .line 338
    .line 339
    .line 340
    :cond_6
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 341
    .line 342
    .line 343
    move-result-object p0

    .line 344
    invoke-virtual {p0, v3, v2, v2}, Landroid/content/pm/PackageManager;->setComponentEnabledSetting(Landroid/content/ComponentName;II)V

    .line 345
    .line 346
    .line 347
    :cond_7
    sput-boolean v2, Landroidx/appcompat/app/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪兰苏世哲:Z

    .line 348
    .line 349
    return-void

    .line 350
    nop

    .line 351
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
