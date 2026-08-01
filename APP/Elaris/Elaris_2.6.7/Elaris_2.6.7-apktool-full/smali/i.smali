.class public final Li;
.super Lcom/mr/elaris/xposedcompat/XC_MethodHook;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# virtual methods
.method public final afterHookedMethod(Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;)V
    .locals 10

    .line 1
    const-string p0, "aio_input_bar_hidden_ids"

    .line 2
    .line 3
    const-string v0, ""

    .line 4
    .line 5
    invoke-static {p0, v0}, Lcom/mr/elaris/HookEntry;->runtimeString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-string v0, "hide_aio_input_camera_entries"

    .line 10
    .line 11
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const-string v1, "aio_input_bar_migrated"

    .line 16
    .line 17
    invoke-static {v1}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const-string v2, "aio_input_bar_enabled"

    .line 22
    .line 23
    invoke-static {v2}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    invoke-static {p0, v2, v1, v0}, Li5;->F0(Ljava/lang/String;ZZZ)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-nez v2, :cond_0

    .line 32
    .line 33
    goto/16 :goto_7

    .line 34
    .line 35
    :cond_0
    if-nez p1, :cond_1

    .line 36
    .line 37
    const/4 p1, 0x0

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    iget-object p1, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 40
    .line 41
    :goto_0
    instance-of v2, p1, Landroid/view/ViewGroup;

    .line 42
    .line 43
    if-eqz v2, :cond_14

    .line 44
    .line 45
    check-cast p1, Landroid/view/ViewGroup;

    .line 46
    .line 47
    const/4 v2, 0x0

    .line 48
    if-nez v1, :cond_2

    .line 49
    .line 50
    if-eqz v0, :cond_2

    .line 51
    .line 52
    const/4 v0, 0x1

    .line 53
    goto :goto_1

    .line 54
    :cond_2
    move v0, v2

    .line 55
    :goto_1
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    add-int/lit8 v3, v1, -0x1

    .line 60
    .line 61
    move v4, v2

    .line 62
    :goto_2
    if-ltz v3, :cond_12

    .line 63
    .line 64
    invoke-virtual {p1, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    const/4 v6, -0x1

    .line 69
    if-nez v5, :cond_3

    .line 70
    .line 71
    goto/16 :goto_6

    .line 72
    .line 73
    :cond_3
    :try_start_0
    invoke-virtual {v5}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v7

    .line 77
    instance-of v8, v7, Ljava/lang/Integer;

    .line 78
    .line 79
    if-eqz v8, :cond_4

    .line 80
    .line 81
    check-cast v7, Ljava/lang/Integer;

    .line 82
    .line 83
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 84
    .line 85
    .line 86
    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 87
    goto/16 :goto_6

    .line 88
    .line 89
    :catchall_0
    move-exception v7

    .line 90
    const-string v8, "aio-input-cleanup"

    .line 91
    .line 92
    const-string v9, "read-entry-tag"

    .line 93
    .line 94
    invoke-static {v8, v9, v7}, Le7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 95
    .line 96
    .line 97
    :cond_4
    invoke-static {v5, v2}, Lj;->a(Landroid/view/View;I)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 102
    .line 103
    .line 104
    move-result v7

    .line 105
    if-nez v7, :cond_5

    .line 106
    .line 107
    goto/16 :goto_6

    .line 108
    .line 109
    :cond_5
    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 110
    .line 111
    invoke-virtual {v5, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v7

    .line 115
    const-string v8, "\u672c\u5730\u8bed\u97f3"

    .line 116
    .line 117
    invoke-virtual {v5, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 118
    .line 119
    .line 120
    move-result v8

    .line 121
    if-eqz v8, :cond_6

    .line 122
    .line 123
    goto/16 :goto_6

    .line 124
    .line 125
    :cond_6
    const-string v8, "\u8bed\u97f3"

    .line 126
    .line 127
    invoke-virtual {v5, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 128
    .line 129
    .line 130
    move-result v8

    .line 131
    if-nez v8, :cond_f

    .line 132
    .line 133
    const-string v8, "\u5f55\u97f3"

    .line 134
    .line 135
    invoke-virtual {v5, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 136
    .line 137
    .line 138
    move-result v8

    .line 139
    if-eqz v8, :cond_7

    .line 140
    .line 141
    goto/16 :goto_5

    .line 142
    .line 143
    :cond_7
    const-string v8, "\u8868\u60c5"

    .line 144
    .line 145
    invoke-virtual {v5, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 146
    .line 147
    .line 148
    move-result v8

    .line 149
    if-nez v8, :cond_e

    .line 150
    .line 151
    const-string v8, "emoji"

    .line 152
    .line 153
    invoke-virtual {v7, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 154
    .line 155
    .line 156
    move-result v8

    .line 157
    if-nez v8, :cond_e

    .line 158
    .line 159
    const-string v8, "emoticon"

    .line 160
    .line 161
    invoke-virtual {v7, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 162
    .line 163
    .line 164
    move-result v8

    .line 165
    if-nez v8, :cond_e

    .line 166
    .line 167
    const-string v8, "emotion"

    .line 168
    .line 169
    invoke-virtual {v7, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 170
    .line 171
    .line 172
    move-result v7

    .line 173
    if-eqz v7, :cond_8

    .line 174
    .line 175
    goto :goto_4

    .line 176
    :cond_8
    const-string v7, "\u76f8\u518c"

    .line 177
    .line 178
    invoke-virtual {v5, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 179
    .line 180
    .line 181
    move-result v7

    .line 182
    if-nez v7, :cond_d

    .line 183
    .line 184
    const-string v7, "\u7167\u7247"

    .line 185
    .line 186
    invoke-virtual {v5, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 187
    .line 188
    .line 189
    move-result v7

    .line 190
    if-nez v7, :cond_d

    .line 191
    .line 192
    const-string v7, "\u56fe\u7247"

    .line 193
    .line 194
    invoke-virtual {v5, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 195
    .line 196
    .line 197
    move-result v7

    .line 198
    if-eqz v7, :cond_9

    .line 199
    .line 200
    goto :goto_3

    .line 201
    :cond_9
    const-string v7, "\u76f8\u673a"

    .line 202
    .line 203
    invoke-virtual {v5, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 204
    .line 205
    .line 206
    move-result v7

    .line 207
    if-eqz v7, :cond_a

    .line 208
    .line 209
    const/16 v6, 0x3ed

    .line 210
    .line 211
    goto :goto_6

    .line 212
    :cond_a
    const-string v7, "\u6ce1\u6ce1"

    .line 213
    .line 214
    invoke-virtual {v5, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 215
    .line 216
    .line 217
    move-result v7

    .line 218
    if-eqz v7, :cond_b

    .line 219
    .line 220
    const/16 v6, 0x3f8

    .line 221
    .line 222
    goto :goto_6

    .line 223
    :cond_b
    const-string v7, "\u52a0\u53f7"

    .line 224
    .line 225
    invoke-virtual {v5, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 226
    .line 227
    .line 228
    move-result v7

    .line 229
    if-nez v7, :cond_c

    .line 230
    .line 231
    const-string v7, "\u66f4\u591a"

    .line 232
    .line 233
    invoke-virtual {v5, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 234
    .line 235
    .line 236
    move-result v5

    .line 237
    if-eqz v5, :cond_10

    .line 238
    .line 239
    :cond_c
    const/16 v6, 0x3ee

    .line 240
    .line 241
    goto :goto_6

    .line 242
    :cond_d
    :goto_3
    const/16 v6, 0x3eb

    .line 243
    .line 244
    goto :goto_6

    .line 245
    :cond_e
    :goto_4
    const/16 v6, 0x3e9

    .line 246
    .line 247
    goto :goto_6

    .line 248
    :cond_f
    :goto_5
    const/16 v6, 0x3e8

    .line 249
    .line 250
    :cond_10
    :goto_6
    invoke-static {p0, v0}, Li5;->e0(Ljava/lang/String;Z)Ljava/util/LinkedHashSet;

    .line 251
    .line 252
    .line 253
    move-result-object v5

    .line 254
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 255
    .line 256
    .line 257
    move-result-object v6

    .line 258
    invoke-virtual {v5, v6}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    move-result v5

    .line 262
    if-eqz v5, :cond_11

    .line 263
    .line 264
    invoke-virtual {p1, v3}, Landroid/view/ViewGroup;->removeViewAt(I)V

    .line 265
    .line 266
    .line 267
    add-int/lit8 v4, v4, 0x1

    .line 268
    .line 269
    :cond_11
    add-int/lit8 v3, v3, -0x1

    .line 270
    .line 271
    goto/16 :goto_2

    .line 272
    .line 273
    :cond_12
    if-lez v4, :cond_14

    .line 274
    .line 275
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 276
    .line 277
    .line 278
    move-result-object p0

    .line 279
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object p0

    .line 283
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 284
    .line 285
    .line 286
    move-result-wide v2

    .line 287
    sget-wide v5, Lj;->d:J

    .line 288
    .line 289
    sub-long v5, v2, v5

    .line 290
    .line 291
    const-wide/32 v7, 0xea60

    .line 292
    .line 293
    .line 294
    cmp-long p1, v5, v7

    .line 295
    .line 296
    if-gez p1, :cond_13

    .line 297
    .line 298
    goto :goto_7

    .line 299
    :cond_13
    sput-wide v2, Lj;->d:J

    .line 300
    .line 301
    new-instance p1, Ljava/lang/StringBuilder;

    .line 302
    .line 303
    const-string v0, "aio input bar cleanup hidden count="

    .line 304
    .line 305
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 309
    .line 310
    .line 311
    const-string v0, " icons="

    .line 312
    .line 313
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 314
    .line 315
    .line 316
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 317
    .line 318
    .line 319
    const-string v0, " source=shortcut_bar owner="

    .line 320
    .line 321
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 322
    .line 323
    .line 324
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 325
    .line 326
    .line 327
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object p0

    .line 331
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V

    .line 332
    .line 333
    .line 334
    :cond_14
    :goto_7
    return-void
.end method
