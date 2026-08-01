.class public final Lb3;
.super Lcom/mr/elaris/xposedcompat/XC_MethodHook;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# virtual methods
.method public final afterHookedMethod(Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;)V
    .locals 14

    .line 1
    sget-object p0, Lh3;->c:Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lg3;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/ThreadLocal;->remove()V

    .line 10
    .line 11
    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object p0, p1, Lg3;->b:Ljava/lang/Object;

    .line 16
    .line 17
    iget-object v0, p1, Lg3;->a:Ljava/lang/Object;

    .line 18
    .line 19
    iget-object v1, p1, Lg3;->d:Ljava/io/File;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/io/File;->length()J

    .line 22
    .line 23
    .line 24
    move-result-wide v2

    .line 25
    invoke-static {v2, v3, v1}, Lh3;->e(JLjava/io/File;)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p1, Lg3;->c:Ljava/lang/Object;

    .line 29
    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    invoke-static {v0, p0}, Lh3;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    :goto_0
    const-string v2, ""

    .line 38
    .line 39
    const-string v3, " entity=patched"

    .line 40
    .line 41
    const-string v4, "download redirect QQ state synchronized final="

    .line 42
    .line 43
    if-nez p1, :cond_2

    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-static {p0}, Lh3;->H(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    const-string p1, "download redirect QQ state entity missing final="

    .line 54
    .line 55
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_2
    invoke-static {v1}, Lh3;->d(Ljava/io/File;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    const-string v6, "getFilePath"

    .line 68
    .line 69
    const-string v7, "strFilePath"

    .line 70
    .line 71
    invoke-static {p1, v6, v7}, Lh3;->K(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v8

    .line 75
    const-string v9, "getStatus"

    .line 76
    .line 77
    const-string v10, "status"

    .line 78
    .line 79
    invoke-static {p1, v9, v10}, Lh3;->t(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)I

    .line 80
    .line 81
    .line 82
    move-result v11

    .line 83
    invoke-virtual {v8}, Ljava/lang/String;->isEmpty()Z

    .line 84
    .line 85
    .line 86
    move-result v12

    .line 87
    const/4 v13, 0x1

    .line 88
    if-nez v12, :cond_3

    .line 89
    .line 90
    new-instance v12, Ljava/io/File;

    .line 91
    .line 92
    invoke-direct {v12, v8}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-static {v12}, Lh3;->d(Ljava/io/File;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v8

    .line 99
    invoke-virtual {v5, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 100
    .line 101
    .line 102
    move-result v8

    .line 103
    if-eqz v8, :cond_3

    .line 104
    .line 105
    if-ne v11, v13, :cond_3

    .line 106
    .line 107
    invoke-static {v5}, Lh3;->H(Ljava/lang/String;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    const-string p1, "download redirect QQ state confirmed final="

    .line 112
    .line 113
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    return-void

    .line 121
    :cond_3
    invoke-static {v1}, Lh3;->d(Ljava/io/File;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v8

    .line 125
    invoke-static {p1, v7, v8}, Lh3;->J(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Z

    .line 126
    .line 127
    .line 128
    move-result v11

    .line 129
    const-string v12, "filePath"

    .line 130
    .line 131
    invoke-static {p1, v12, v8}, Lh3;->J(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Z

    .line 132
    .line 133
    .line 134
    move-result v8

    .line 135
    or-int/2addr v8, v11

    .line 136
    const-string v11, "fileName"

    .line 137
    .line 138
    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    invoke-static {p1, v11, v1}, Lh3;->J(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Z

    .line 143
    .line 144
    .line 145
    move-result v1

    .line 146
    or-int/2addr v1, v8

    .line 147
    invoke-static {p1, v10, v13}, Lh3;->I(Ljava/lang/Object;Ljava/lang/String;I)Z

    .line 148
    .line 149
    .line 150
    move-result v8

    .line 151
    or-int/2addr v1, v8

    .line 152
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    move-result-object v8

    .line 156
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    move-result-object v11

    .line 160
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    move-result-object v12

    .line 164
    invoke-static {v8, v11, v12}, Lh3;->m(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 165
    .line 166
    .line 167
    move-result-object v8

    .line 168
    invoke-virtual {v8, v13}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 169
    .line 170
    .line 171
    sget-object v11, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 172
    .line 173
    filled-new-array {p0, p1, v11}, [Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    invoke-virtual {v8, v0, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    invoke-static {p1, v6, v7}, Lh3;->K(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object p0

    .line 184
    invoke-static {p1, v9, v10}, Lh3;->t(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)I

    .line 185
    .line 186
    .line 187
    move-result p1

    .line 188
    new-instance v0, Ljava/lang/StringBuilder;

    .line 189
    .line 190
    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    invoke-static {v5}, Lh3;->H(Ljava/lang/String;)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v4

    .line 197
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    const-string v4, " status="

    .line 201
    .line 202
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    const-string p1, " path="

    .line 209
    .line 210
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    invoke-static {p0}, Lh3;->H(Ljava/lang/String;)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object p0

    .line 217
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    if-eqz v1, :cond_4

    .line 221
    .line 222
    move-object p0, v3

    .line 223
    goto :goto_1

    .line 224
    :cond_4
    move-object p0, v2

    .line 225
    :goto_1
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object p0

    .line 232
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 233
    .line 234
    .line 235
    return-void

    .line 236
    :catchall_0
    move-exception p0

    .line 237
    new-instance p1, Ljava/lang/StringBuilder;

    .line 238
    .line 239
    const-string v0, "download redirect QQ state sync failed final="

    .line 240
    .line 241
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    invoke-static {v5}, Lh3;->H(Ljava/lang/String;)Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 249
    .line 250
    .line 251
    if-eqz v1, :cond_5

    .line 252
    .line 253
    move-object v2, v3

    .line 254
    :cond_5
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    const-string v0, " reason="

    .line 258
    .line 259
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 260
    .line 261
    .line 262
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    const-string v0, ": "

    .line 274
    .line 275
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 276
    .line 277
    .line 278
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object p0

    .line 282
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object p0

    .line 286
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 287
    .line 288
    .line 289
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object p0

    .line 293
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V

    .line 294
    .line 295
    .line 296
    return-void
.end method

.method public final beforeHookedMethod(Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;)V
    .locals 19

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    sget-object v0, La3;->a:Ljava/lang/Object;

    .line 4
    .line 5
    const-string v0, "direct_download_write"

    .line 6
    .line 7
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto/16 :goto_5

    .line 14
    .line 15
    :cond_0
    sget-object v0, Lh3;->c:Ljava/lang/ThreadLocal;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->remove()V

    .line 18
    .line 19
    .line 20
    iget-object v0, v1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    aget-object v2, v0, v2

    .line 24
    .line 25
    iget-object v0, v1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {v0, v2}, Lh3;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    const-string v4, " final="

    .line 32
    .line 33
    const-string v5, "download redirect finalization failed write="

    .line 34
    .line 35
    const-string v0, " msg_record=patched file_element_patched="

    .line 36
    .line 37
    const-string v6, "download redirected completed write="

    .line 38
    .line 39
    const-string v7, "download redirect staging cleanup failed file="

    .line 40
    .line 41
    const-string v8, "redirect staging size mismatch expected="

    .line 42
    .line 43
    if-eqz v2, :cond_4

    .line 44
    .line 45
    const-string v10, "getTrasferStatus"

    .line 46
    .line 47
    const-string v11, "trasferStatus"

    .line 48
    .line 49
    invoke-static {v2, v10, v11}, Lh3;->t(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)I

    .line 50
    .line 51
    .line 52
    move-result v10

    .line 53
    const/4 v11, 0x4

    .line 54
    if-eq v10, v11, :cond_1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    const-string v10, "getFilePath"

    .line 58
    .line 59
    const-string v11, "filePath"

    .line 60
    .line 61
    invoke-static {v2, v10, v11}, Lh3;->K(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v10

    .line 65
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 66
    .line 67
    .line 68
    move-result v12

    .line 69
    if-nez v12, :cond_2

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_2
    new-instance v12, Ljava/io/File;

    .line 73
    .line 74
    invoke-direct {v12, v10}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-static {v12}, La3;->m(Ljava/io/File;)Lz2;

    .line 78
    .line 79
    .line 80
    move-result-object v13

    .line 81
    if-nez v13, :cond_5

    .line 82
    .line 83
    const/16 v0, 0x5c

    .line 84
    .line 85
    const/16 v4, 0x2f

    .line 86
    .line 87
    invoke-virtual {v10, v0, v4}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    const-string v4, "/data/data/com.tencent.mobileqq/qqfile_recv/"

    .line 96
    .line 97
    invoke-virtual {v0, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 98
    .line 99
    .line 100
    move-result v4

    .line 101
    if-nez v4, :cond_3

    .line 102
    .line 103
    const-string v4, "/data/user/0/com.tencent.mobileqq/qqfile_recv/"

    .line 104
    .line 105
    invoke-virtual {v0, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    if-nez v4, :cond_3

    .line 110
    .line 111
    const-string v4, "/android/data/com.tencent.mobileqq/"

    .line 112
    .line 113
    invoke-virtual {v0, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 114
    .line 115
    .line 116
    move-result v4

    .line 117
    if-eqz v4, :cond_4

    .line 118
    .line 119
    const-string v4, "/tencent/qqfile_recv/"

    .line 120
    .line 121
    invoke-virtual {v0, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    if-eqz v0, :cond_4

    .line 126
    .line 127
    :cond_3
    invoke-static {v10}, Lh3;->H(Ljava/lang/String;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    const-string v4, "download redirect completion rejected reason=private-source source="

    .line 132
    .line 133
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    :cond_4
    :goto_0
    const/4 v9, 0x0

    .line 141
    goto/16 :goto_4

    .line 142
    .line 143
    :cond_5
    :try_start_0
    invoke-virtual {v12}, Ljava/io/File;->isFile()Z

    .line 144
    .line 145
    .line 146
    move-result v10

    .line 147
    if-eqz v10, :cond_e

    .line 148
    .line 149
    invoke-virtual {v12}, Ljava/io/File;->length()J

    .line 150
    .line 151
    .line 152
    move-result-wide v14

    .line 153
    const-wide/16 v16, 0x0

    .line 154
    .line 155
    cmp-long v10, v14, v16

    .line 156
    .line 157
    if-lez v10, :cond_e

    .line 158
    .line 159
    const-string v10, "getTotalSize"

    .line 160
    .line 161
    const-string v14, "totalSize"

    .line 162
    .line 163
    invoke-static {v2, v10, v14}, Lh3;->w(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)J

    .line 164
    .line 165
    .line 166
    move-result-wide v14

    .line 167
    iget-wide v9, v13, Lz2;->c:J

    .line 168
    .line 169
    cmp-long v18, v9, v16

    .line 170
    .line 171
    if-lez v18, :cond_6

    .line 172
    .line 173
    move-wide v14, v9

    .line 174
    :cond_6
    cmp-long v9, v14, v16

    .line 175
    .line 176
    if-lez v9, :cond_8

    .line 177
    .line 178
    invoke-virtual {v12}, Ljava/io/File;->length()J

    .line 179
    .line 180
    .line 181
    move-result-wide v9

    .line 182
    cmp-long v9, v9, v14

    .line 183
    .line 184
    if-nez v9, :cond_7

    .line 185
    .line 186
    goto :goto_1

    .line 187
    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 188
    .line 189
    new-instance v6, Ljava/lang/StringBuilder;

    .line 190
    .line 191
    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v6, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    const-string v7, " actual="

    .line 198
    .line 199
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v12}, Ljava/io/File;->length()J

    .line 203
    .line 204
    .line 205
    move-result-wide v7

    .line 206
    invoke-virtual {v6, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v6

    .line 213
    invoke-direct {v0, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    throw v0

    .line 217
    :catchall_0
    move-exception v0

    .line 218
    goto/16 :goto_3

    .line 219
    .line 220
    :cond_8
    :goto_1
    iget-object v8, v13, Lz2;->b:Ljava/io/File;

    .line 221
    .line 222
    invoke-static {v12, v8}, Lh3;->E(Ljava/io/File;Ljava/io/File;)Ljava/io/File;

    .line 223
    .line 224
    .line 225
    move-result-object v8

    .line 226
    if-eqz v8, :cond_d

    .line 227
    .line 228
    invoke-virtual {v8}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v9

    .line 232
    invoke-static {v2, v11, v9}, Lh3;->J(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Z

    .line 233
    .line 234
    .line 235
    move-result v9

    .line 236
    if-eqz v9, :cond_c

    .line 237
    .line 238
    const-string v9, "getCommonFileInfo"

    .line 239
    .line 240
    const-string v10, "commonFileInfo"

    .line 241
    .line 242
    invoke-static {v2, v9, v10}, Lh3;->A(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v9

    .line 246
    if-eqz v9, :cond_9

    .line 247
    .line 248
    invoke-virtual {v8}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v10

    .line 252
    invoke-static {v9, v11, v10}, Lh3;->J(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Z

    .line 253
    .line 254
    .line 255
    :cond_9
    invoke-static {v2, v8, v14, v15}, Lh3;->B(Ljava/lang/Object;Ljava/io/File;J)I

    .line 256
    .line 257
    .line 258
    move-result v9

    .line 259
    invoke-static {v8, v14, v15, v12}, Lh3;->G(Ljava/io/File;JLjava/io/File;)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v12}, Ljava/io/File;->delete()Z

    .line 263
    .line 264
    .line 265
    move-result v10

    .line 266
    if-nez v10, :cond_a

    .line 267
    .line 268
    invoke-virtual {v12}, Ljava/io/File;->exists()Z

    .line 269
    .line 270
    .line 271
    move-result v10

    .line 272
    if-eqz v10, :cond_a

    .line 273
    .line 274
    invoke-virtual {v12}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v10

    .line 278
    invoke-static {v10}, Lh3;->H(Ljava/lang/String;)Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v10

    .line 282
    invoke-virtual {v7, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v7

    .line 286
    invoke-static {v7}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    :cond_a
    new-instance v7, Ljava/lang/StringBuilder;

    .line 290
    .line 291
    invoke-direct {v7, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v12}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v6

    .line 298
    invoke-static {v6}, Lh3;->H(Ljava/lang/String;)Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v6

    .line 302
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 303
    .line 304
    .line 305
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 306
    .line 307
    .line 308
    invoke-virtual {v8}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object v6

    .line 312
    invoke-static {v6}, Lh3;->H(Ljava/lang/String;)Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v6

    .line 316
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 317
    .line 318
    .line 319
    const-string v6, " mode=target-staging-mediastore"

    .line 320
    .line 321
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 322
    .line 323
    .line 324
    if-lez v9, :cond_b

    .line 325
    .line 326
    new-instance v6, Ljava/lang/StringBuilder;

    .line 327
    .line 328
    invoke-direct {v6, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 332
    .line 333
    .line 334
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    goto :goto_2

    .line 339
    :cond_b
    const-string v0, " msg_record=unpatched"

    .line 340
    .line 341
    :goto_2
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 342
    .line 343
    .line 344
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 349
    .line 350
    .line 351
    invoke-static {v13}, La3;->f(Lz2;)V

    .line 352
    .line 353
    .line 354
    move-object v9, v8

    .line 355
    goto :goto_4

    .line 356
    :cond_c
    :try_start_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 357
    .line 358
    const-string v6, "notify filePath update failed"

    .line 359
    .line 360
    invoke-direct {v0, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 361
    .line 362
    .line 363
    throw v0

    .line 364
    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 365
    .line 366
    const-string v6, "redirect final publication failed"

    .line 367
    .line 368
    invoke-direct {v0, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 369
    .line 370
    .line 371
    throw v0

    .line 372
    :cond_e
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 373
    .line 374
    const-string v6, "redirect staging file missing"

    .line 375
    .line 376
    invoke-direct {v0, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 377
    .line 378
    .line 379
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 380
    :goto_3
    :try_start_2
    new-instance v6, Ljava/lang/StringBuilder;

    .line 381
    .line 382
    invoke-direct {v6, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 383
    .line 384
    .line 385
    invoke-virtual {v12}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object v5

    .line 389
    invoke-static {v5}, Lh3;->H(Ljava/lang/String;)Ljava/lang/String;

    .line 390
    .line 391
    .line 392
    move-result-object v5

    .line 393
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 394
    .line 395
    .line 396
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 397
    .line 398
    .line 399
    iget-object v4, v13, Lz2;->b:Ljava/io/File;

    .line 400
    .line 401
    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 402
    .line 403
    .line 404
    move-result-object v4

    .line 405
    invoke-static {v4}, Lh3;->H(Ljava/lang/String;)Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object v4

    .line 409
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 410
    .line 411
    .line 412
    const-string v4, " reason="

    .line 413
    .line 414
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 415
    .line 416
    .line 417
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 418
    .line 419
    .line 420
    move-result-object v4

    .line 421
    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object v4

    .line 425
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 426
    .line 427
    .line 428
    const-string v4, ": "

    .line 429
    .line 430
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 431
    .line 432
    .line 433
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 434
    .line 435
    .line 436
    move-result-object v0

    .line 437
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 438
    .line 439
    .line 440
    move-result-object v0

    .line 441
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 442
    .line 443
    .line 444
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 445
    .line 446
    .line 447
    move-result-object v0

    .line 448
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 449
    .line 450
    .line 451
    invoke-static {v13}, La3;->f(Lz2;)V

    .line 452
    .line 453
    .line 454
    goto/16 :goto_0

    .line 455
    .line 456
    :catchall_1
    move-exception v0

    .line 457
    invoke-static {v13}, La3;->f(Lz2;)V

    .line 458
    .line 459
    .line 460
    throw v0

    .line 461
    :goto_4
    if-nez v9, :cond_f

    .line 462
    .line 463
    :goto_5
    return-void

    .line 464
    :cond_f
    if-eqz v3, :cond_10

    .line 465
    .line 466
    goto :goto_6

    .line 467
    :cond_10
    iget-object v0, v1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 468
    .line 469
    invoke-static {v0, v2}, Lh3;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 470
    .line 471
    .line 472
    move-result-object v3

    .line 473
    :goto_6
    sget-object v0, Lh3;->c:Ljava/lang/ThreadLocal;

    .line 474
    .line 475
    new-instance v4, Lg3;

    .line 476
    .line 477
    iget-object v1, v1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 478
    .line 479
    invoke-direct {v4, v1, v2, v3, v9}, Lg3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/io/File;)V

    .line 480
    .line 481
    .line 482
    invoke-virtual {v0, v4}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 483
    .line 484
    .line 485
    return-void
.end method
