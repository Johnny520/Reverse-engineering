.class public final Ln;
.super Lcom/mr/elaris/xposedcompat/XC_MethodHook;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# virtual methods
.method public final beforeHookedMethod(Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;)V
    .locals 11

    .line 1
    const-string p0, "album_video_bubble"

    .line 2
    .line 3
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_3

    .line 10
    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    const/4 v0, 0x0

    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    iget-object v1, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    array-length v2, v1

    .line 20
    if-lez v2, :cond_1

    .line 21
    .line 22
    aget-object v1, v1, p0

    .line 23
    .line 24
    instance-of v2, v1, Landroid/view/View;

    .line 25
    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    check-cast v1, Landroid/view/View;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    move-object v1, v0

    .line 32
    :goto_0
    if-eqz v1, :cond_a

    .line 33
    .line 34
    invoke-virtual {v1}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    if-nez v2, :cond_2

    .line 39
    .line 40
    goto/16 :goto_3

    .line 41
    .line 42
    :cond_2
    invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    const-string v3, "\u6ce1\u6ce1\u6d88\u606f"

    .line 51
    .line 52
    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    if-nez v3, :cond_3

    .line 57
    .line 58
    const-string v3, "\u89c6\u9891\u6ce1\u6ce1"

    .line 59
    .line 60
    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-nez v3, :cond_3

    .line 65
    .line 66
    const-string v3, "\u6ce1\u6ce1"

    .line 67
    .line 68
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    if-eqz v2, :cond_a

    .line 73
    .line 74
    :cond_3
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    invoke-static {v2}, Li5;->b(Landroid/content/Context;)Landroid/app/Activity;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    if-nez v2, :cond_4

    .line 83
    .line 84
    invoke-static {}, Lcom/mr/elaris/HookEntry;->topActivity()Landroid/app/Activity;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    :cond_4
    if-nez v2, :cond_5

    .line 89
    .line 90
    const-string p0, "\u672a\u627e\u5230\u5f53\u524d\u804a\u5929\u9875\u9762"

    .line 91
    .line 92
    invoke-static {v0, p0}, Ls;->i(Landroid/app/Activity;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1, v0}, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    return-void

    .line 99
    :cond_5
    const-string v3, "bubble-click"

    .line 100
    .line 101
    invoke-static {v1, v3}, Ls;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    sget-object v1, Ls;->c:Ljava/lang/ref/WeakReference;

    .line 105
    .line 106
    if-nez v1, :cond_6

    .line 107
    .line 108
    move-object v1, v0

    .line 109
    goto :goto_1

    .line 110
    :cond_6
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    :goto_1
    if-nez v1, :cond_7

    .line 115
    .line 116
    const-string p0, "\u89c6\u9891\u6ce1\u6ce1\u5165\u53e3\u672a\u5c31\u7eea\uff0c\u8bf7\u91cd\u65b0\u8fdb\u5165\u804a\u5929"

    .line 117
    .line 118
    invoke-static {v2, p0}, Ls;->i(Landroid/app/Activity;Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p1, v0}, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    return-void

    .line 125
    :cond_7
    const-string v3, "android.intent.category.OPENABLE"

    .line 126
    .line 127
    const-string v4, "video/*"

    .line 128
    .line 129
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 130
    .line 131
    .line 132
    move-result-wide v5

    .line 133
    sget-boolean v7, Ls;->h:Z

    .line 134
    .line 135
    if-eqz v7, :cond_8

    .line 136
    .line 137
    sget-wide v7, Ls;->i:J

    .line 138
    .line 139
    sub-long v7, v5, v7

    .line 140
    .line 141
    const-wide/32 v9, 0x1d4c0

    .line 142
    .line 143
    .line 144
    cmp-long v7, v7, v9

    .line 145
    .line 146
    if-gez v7, :cond_8

    .line 147
    .line 148
    const-string p0, "\u89c6\u9891\u9009\u62e9\u5668\u5df2\u6253\u5f00"

    .line 149
    .line 150
    invoke-static {v2, p0}, Ls;->i(Landroid/app/Activity;Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    goto :goto_2

    .line 154
    :cond_8
    const/4 v7, 0x1

    .line 155
    sput-boolean v7, Ls;->h:Z

    .line 156
    .line 157
    sput-wide v5, Ls;->i:J

    .line 158
    .line 159
    new-instance v5, Ljava/lang/ref/WeakReference;

    .line 160
    .line 161
    invoke-direct {v5, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    sput-object v5, Ls;->d:Ljava/lang/ref/WeakReference;

    .line 165
    .line 166
    const/16 v1, 0x201c

    .line 167
    .line 168
    :try_start_0
    new-instance v5, Landroid/content/Intent;

    .line 169
    .line 170
    const-string v6, "android.intent.action.OPEN_DOCUMENT"

    .line 171
    .line 172
    invoke-direct {v5, v6}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v5, v3}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v5, v4}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 179
    .line 180
    .line 181
    const/16 v6, 0x41

    .line 182
    .line 183
    invoke-virtual {v5, v6}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v2, v5, v1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 187
    .line 188
    .line 189
    const-string v5, "album video bubble document video picker opened"

    .line 190
    .line 191
    invoke-static {v5}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 192
    .line 193
    .line 194
    goto :goto_2

    .line 195
    :catchall_0
    :try_start_1
    new-instance v5, Landroid/content/Intent;

    .line 196
    .line 197
    const-string v6, "android.intent.action.PICK"

    .line 198
    .line 199
    sget-object v8, Landroid/provider/MediaStore$Video$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    .line 200
    .line 201
    invoke-direct {v5, v6, v8}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v5, v4}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v5, v7}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v2, v5, v1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 211
    .line 212
    .line 213
    const-string v5, "album video bubble gallery picker opened"

    .line 214
    .line 215
    invoke-static {v5}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 216
    .line 217
    .line 218
    goto :goto_2

    .line 219
    :catchall_1
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 220
    .line 221
    const/16 v6, 0x21

    .line 222
    .line 223
    if-lt v5, v6, :cond_9

    .line 224
    .line 225
    :try_start_2
    new-instance v5, Landroid/content/Intent;

    .line 226
    .line 227
    const-string v6, "android.provider.action.PICK_IMAGES"

    .line 228
    .line 229
    invoke-direct {v5, v6}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v5, v4}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v5, v7}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 236
    .line 237
    .line 238
    invoke-virtual {v2, v5, v1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 239
    .line 240
    .line 241
    const-string v5, "album video bubble system video picker opened"

    .line 242
    .line 243
    invoke-static {v5}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 244
    .line 245
    .line 246
    goto :goto_2

    .line 247
    :catchall_2
    :cond_9
    :try_start_3
    new-instance v5, Landroid/content/Intent;

    .line 248
    .line 249
    const-string v6, "android.intent.action.GET_CONTENT"

    .line 250
    .line 251
    invoke-direct {v5, v6}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v5, v3}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v5, v4}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v5, v7}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v2, v5, v1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 264
    .line 265
    .line 266
    const-string v1, "album video bubble fallback picker opened"

    .line 267
    .line 268
    invoke-static {v1}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 269
    .line 270
    .line 271
    :goto_2
    invoke-virtual {p1, v0}, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    goto :goto_3

    .line 275
    :catchall_3
    move-exception p1

    .line 276
    sput-boolean p0, Ls;->h:Z

    .line 277
    .line 278
    new-instance p0, Ljava/lang/ref/WeakReference;

    .line 279
    .line 280
    invoke-direct {p0, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    sput-object p0, Ls;->d:Ljava/lang/ref/WeakReference;

    .line 284
    .line 285
    const-string p0, "album-video-bubble"

    .line 286
    .line 287
    const-string v0, "open-picker"

    .line 288
    .line 289
    invoke-static {p0, v0, p1}, Le7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 290
    .line 291
    .line 292
    const-string p0, "\u65e0\u6cd5\u6253\u5f00\u89c6\u9891\u9009\u62e9\u5668"

    .line 293
    .line 294
    invoke-static {v2, p0}, Ls;->i(Landroid/app/Activity;Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    :cond_a
    :goto_3
    return-void
.end method
