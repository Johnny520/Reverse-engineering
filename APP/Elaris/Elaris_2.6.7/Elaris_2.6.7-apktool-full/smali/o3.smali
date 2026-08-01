.class public final Lo3;
.super Lcom/mr/elaris/xposedcompat/XC_MethodHook;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;-><init>()V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    const-string p1, ""

    .line 7
    .line 8
    :cond_0
    iput-object p1, p0, Lo3;->a:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final beforeHookedMethod(Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;)V
    .locals 18

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    invoke-static {}, Lr3;->d()Lq3;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-boolean v2, v1, Lq3;->b:Z

    .line 8
    .line 9
    iget-boolean v1, v1, Lq3;->a:Z

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    goto/16 :goto_b

    .line 16
    .line 17
    :cond_0
    iget-object v3, v0, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    const/4 v5, 0x0

    .line 21
    if-nez v3, :cond_1

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    array-length v6, v3

    .line 25
    move v7, v5

    .line 26
    :goto_0
    if-ge v7, v6, :cond_3

    .line 27
    .line 28
    aget-object v8, v3, v7

    .line 29
    .line 30
    instance-of v9, v8, Landroid/app/Notification;

    .line 31
    .line 32
    if-eqz v9, :cond_2

    .line 33
    .line 34
    check-cast v8, Landroid/app/Notification;

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_2
    add-int/lit8 v7, v7, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_3
    :goto_1
    move-object v8, v4

    .line 41
    :goto_2
    if-nez v8, :cond_4

    .line 42
    .line 43
    goto/16 :goto_b

    .line 44
    .line 45
    :cond_4
    new-instance v3, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 48
    .line 49
    .line 50
    new-instance v6, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    const/16 v7, 0x200

    .line 53
    .line 54
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 55
    .line 56
    .line 57
    iget-object v9, v8, Landroid/app/Notification;->tickerText:Ljava/lang/CharSequence;

    .line 58
    .line 59
    invoke-static {v6, v9}, Lr3;->e(Ljava/lang/StringBuilder;Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    :try_start_0
    iget-object v8, v8, Landroid/app/Notification;->extras:Landroid/os/Bundle;

    .line 63
    .line 64
    if-eqz v8, :cond_6

    .line 65
    .line 66
    const-string v9, "android.title"

    .line 67
    .line 68
    const-string v10, "android.text"

    .line 69
    .line 70
    const-string v11, "android.bigText"

    .line 71
    .line 72
    const-string v12, "android.subText"

    .line 73
    .line 74
    const-string v13, "android.infoText"

    .line 75
    .line 76
    const-string v14, "android.summaryText"

    .line 77
    .line 78
    const-string v15, "android.title.big"

    .line 79
    .line 80
    const-string v16, "android.conversationTitle"

    .line 81
    .line 82
    const-string v17, "android.textLines"

    .line 83
    .line 84
    filled-new-array/range {v9 .. v17}, [Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v9

    .line 88
    move v10, v5

    .line 89
    :goto_3
    const/16 v11, 0x9

    .line 90
    .line 91
    if-ge v10, v11, :cond_5

    .line 92
    .line 93
    aget-object v11, v9, v10

    .line 94
    .line 95
    invoke-virtual {v8, v11}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v11

    .line 99
    invoke-static {v6, v11}, Lr3;->e(Ljava/lang/StringBuilder;Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    add-int/lit8 v10, v10, 0x1

    .line 103
    .line 104
    goto :goto_3

    .line 105
    :cond_5
    invoke-virtual {v8}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 106
    .line 107
    .line 108
    move-result-object v9

    .line 109
    invoke-interface {v9}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 110
    .line 111
    .line 112
    move-result-object v9

    .line 113
    :goto_4
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 114
    .line 115
    .line 116
    move-result v10

    .line 117
    if-eqz v10, :cond_6

    .line 118
    .line 119
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v10

    .line 123
    check-cast v10, Ljava/lang/String;

    .line 124
    .line 125
    invoke-virtual {v8, v10}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v10

    .line 129
    invoke-static {v6, v10}, Lr3;->e(Ljava/lang/StringBuilder;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 130
    .line 131
    .line 132
    goto :goto_4

    .line 133
    :catchall_0
    :cond_6
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v6

    .line 137
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    const/16 v6, 0xa

    .line 141
    .line 142
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    iget-object v6, v0, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 146
    .line 147
    const-string v8, ""

    .line 148
    .line 149
    if-eqz v6, :cond_a

    .line 150
    .line 151
    array-length v9, v6

    .line 152
    if-nez v9, :cond_7

    .line 153
    .line 154
    goto :goto_7

    .line 155
    :cond_7
    new-instance v9, Ljava/lang/StringBuilder;

    .line 156
    .line 157
    invoke-direct {v9, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 158
    .line 159
    .line 160
    new-instance v7, Ljava/util/IdentityHashMap;

    .line 161
    .line 162
    invoke-direct {v7}, Ljava/util/IdentityHashMap;-><init>()V

    .line 163
    .line 164
    .line 165
    invoke-static {v7}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 166
    .line 167
    .line 168
    move-result-object v7

    .line 169
    array-length v10, v6

    .line 170
    move v11, v5

    .line 171
    :goto_5
    if-ge v11, v10, :cond_9

    .line 172
    .line 173
    aget-object v12, v6, v11

    .line 174
    .line 175
    invoke-static {v9, v12, v7, v5}, Lr3;->g(Ljava/lang/StringBuilder;Ljava/lang/Object;Ljava/util/Set;I)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->length()I

    .line 179
    .line 180
    .line 181
    move-result v12

    .line 182
    const/16 v13, 0x1000

    .line 183
    .line 184
    if-le v12, v13, :cond_8

    .line 185
    .line 186
    goto :goto_6

    .line 187
    :cond_8
    add-int/lit8 v11, v11, 0x1

    .line 188
    .line 189
    goto :goto_5

    .line 190
    :cond_9
    :goto_6
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v5

    .line 194
    goto :goto_8

    .line 195
    :cond_a
    :goto_7
    move-object v5, v8

    .line 196
    :goto_8
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v3

    .line 203
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 204
    .line 205
    .line 206
    move-result v5

    .line 207
    if-eqz v5, :cond_c

    .line 208
    .line 209
    if-eqz v1, :cond_b

    .line 210
    .line 211
    const-string v1, "@\u5168\u4f53\u6210\u5458"

    .line 212
    .line 213
    invoke-virtual {v3, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 214
    .line 215
    .line 216
    move-result v5

    .line 217
    if-eqz v5, :cond_b

    .line 218
    .line 219
    :goto_9
    move-object v4, v1

    .line 220
    goto :goto_a

    .line 221
    :cond_b
    if-eqz v2, :cond_c

    .line 222
    .line 223
    const-string v1, "\u7fa4\u5f85\u529e"

    .line 224
    .line 225
    invoke-virtual {v3, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 226
    .line 227
    .line 228
    move-result v2

    .line 229
    if-eqz v2, :cond_c

    .line 230
    .line 231
    goto :goto_9

    .line 232
    :cond_c
    :goto_a
    if-nez v4, :cond_d

    .line 233
    .line 234
    :goto_b
    return-void

    .line 235
    :cond_d
    iget-object v1, v0, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->method:Ljava/lang/reflect/Member;

    .line 236
    .line 237
    invoke-static {v1}, Lr3;->a(Ljava/lang/reflect/Member;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    invoke-virtual {v0, v1}, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 242
    .line 243
    .line 244
    new-instance v1, Ljava/lang/StringBuilder;

    .line 245
    .line 246
    const-string v2, "[Elaris:NoticeGate] blocked qq notice process="

    .line 247
    .line 248
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    move-object/from16 v2, p0

    .line 252
    .line 253
    iget-object v2, v2, Lo3;->a:Ljava/lang/String;

    .line 254
    .line 255
    invoke-static {v2}, Lr3;->q(Ljava/lang/String;)Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v2

    .line 259
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 260
    .line 261
    .line 262
    const-string v2, " method="

    .line 263
    .line 264
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    iget-object v0, v0, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->method:Ljava/lang/reflect/Member;

    .line 268
    .line 269
    if-nez v0, :cond_e

    .line 270
    .line 271
    goto :goto_c

    .line 272
    :cond_e
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v8

    .line 276
    :goto_c
    invoke-static {v8}, Lr3;->q(Ljava/lang/String;)Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 281
    .line 282
    .line 283
    const-string v0, " type="

    .line 284
    .line 285
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 286
    .line 287
    .line 288
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 289
    .line 290
    .line 291
    const-string v0, " text="

    .line 292
    .line 293
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 294
    .line 295
    .line 296
    invoke-static {v3}, Lr3;->q(Ljava/lang/String;)Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 301
    .line 302
    .line 303
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    return-void
.end method
