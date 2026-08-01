.class public final Lza;
.super Lcom/mr/elaris/xposedcompat/XC_MethodHook;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# virtual methods
.method public final afterHookedMethod(Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;)V
    .locals 33

    .line 1
    const-string v0, "block_avatar_pendant"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_4

    .line 8
    .line 9
    move-object/from16 v1, p1

    .line 10
    .line 11
    iget-object v1, v1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    const-wide/16 v4, 0x0

    .line 19
    .line 20
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    if-eqz v1, :cond_4

    .line 25
    .line 26
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_0

    .line 31
    .line 32
    goto/16 :goto_4

    .line 33
    .line 34
    :cond_0
    const-string v0, "pendantId"

    .line 35
    .line 36
    invoke-static {v1, v0, v4}, Lw4;->d(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    const-string v0, "pendantDiyInfoId"

    .line 40
    .line 41
    invoke-static {v1, v0, v3}, Lw4;->d(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    const-string v31, "avatarPendant"

    .line 45
    .line 46
    const-string v32, "avatarPendantInfo"

    .line 47
    .line 48
    const-string v5, "dynamicAvatar"

    .line 49
    .line 50
    const-string v6, "dynamicAvatarInfo"

    .line 51
    .line 52
    const-string v7, "dynamicHead"

    .line 53
    .line 54
    const-string v8, "dynamicHeadInfo"

    .line 55
    .line 56
    const-string v9, "dynamicFace"

    .line 57
    .line 58
    const-string v10, "dynamicFaceInfo"

    .line 59
    .line 60
    const-string v11, "avatarAnimation"

    .line 61
    .line 62
    const-string v12, "avatarAnimationInfo"

    .line 63
    .line 64
    const-string v13, "avatarDynamic"

    .line 65
    .line 66
    const-string v14, "avatarDynamicInfo"

    .line 67
    .line 68
    const-string v15, "avatarVideo"

    .line 69
    .line 70
    const-string v16, "avatarVideoUrl"

    .line 71
    .line 72
    const-string v17, "avatarPag"

    .line 73
    .line 74
    const-string v18, "avatarSvga"

    .line 75
    .line 76
    const-string v19, "avatarLottie"

    .line 77
    .line 78
    const-string v20, "avatarVapie"

    .line 79
    .line 80
    const-string v21, "headAnimation"

    .line 81
    .line 82
    const-string v22, "headVideoUrl"

    .line 83
    .line 84
    const-string v23, "headPendant"

    .line 85
    .line 86
    const-string v24, "headPendantInfo"

    .line 87
    .line 88
    const-string v25, "avatarFrame"

    .line 89
    .line 90
    const-string v26, "avatarFrameInfo"

    .line 91
    .line 92
    const-string v27, "avatarBorder"

    .line 93
    .line 94
    const-string v28, "avatarBorderInfo"

    .line 95
    .line 96
    const-string v29, "avatarEffect"

    .line 97
    .line 98
    const-string v30, "avatarEffectInfo"

    .line 99
    .line 100
    filled-new-array/range {v5 .. v32}, [Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    move v5, v2

    .line 105
    :goto_0
    const/16 v6, 0x1c

    .line 106
    .line 107
    if-ge v5, v6, :cond_1

    .line 108
    .line 109
    aget-object v6, v0, v5

    .line 110
    .line 111
    const/4 v7, 0x0

    .line 112
    invoke-static {v1, v6, v7}, Lw4;->d(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    add-int/lit8 v5, v5, 0x1

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_1
    const-string v22, "avatarDecorId"

    .line 119
    .line 120
    const-string v23, "headDecorId"

    .line 121
    .line 122
    const-string v6, "dynamicAvatarId"

    .line 123
    .line 124
    const-string v7, "dynamicHeadId"

    .line 125
    .line 126
    const-string v8, "dynamicFaceId"

    .line 127
    .line 128
    const-string v9, "avatarAnimationId"

    .line 129
    .line 130
    const-string v10, "avatarDynamicId"

    .line 131
    .line 132
    const-string v11, "avatarVideoId"

    .line 133
    .line 134
    const-string v12, "avatarFrameId"

    .line 135
    .line 136
    const-string v13, "avatarBorderId"

    .line 137
    .line 138
    const-string v14, "avatarEffectId"

    .line 139
    .line 140
    const-string v15, "avatarPendantId"

    .line 141
    .line 142
    const-string v16, "pendantId"

    .line 143
    .line 144
    const-string v17, "avatarPendantId"

    .line 145
    .line 146
    const-string v18, "headPendantId"

    .line 147
    .line 148
    const-string v19, "headFrameId"

    .line 149
    .line 150
    const-string v20, "headBorderId"

    .line 151
    .line 152
    const-string v21, "headEffectId"

    .line 153
    .line 154
    filled-new-array/range {v6 .. v23}, [Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    move v5, v2

    .line 159
    :goto_1
    const/16 v6, 0x12

    .line 160
    .line 161
    if-ge v5, v6, :cond_2

    .line 162
    .line 163
    aget-object v6, v0, v5

    .line 164
    .line 165
    invoke-static {v1, v6, v4}, Lw4;->d(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    aget-object v6, v0, v5

    .line 169
    .line 170
    invoke-static {v1, v6, v3}, Lw4;->d(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    add-int/lit8 v5, v5, 0x1

    .line 174
    .line 175
    goto :goto_1

    .line 176
    :cond_2
    const-string v23, "hasHeadDecor"

    .line 177
    .line 178
    const-string v24, "showHeadDecor"

    .line 179
    .line 180
    const-string v6, "hasDynamicAvatar"

    .line 181
    .line 182
    const-string v7, "isDynamicAvatar"

    .line 183
    .line 184
    const-string v8, "showDynamicAvatar"

    .line 185
    .line 186
    const-string v9, "useDynamicAvatar"

    .line 187
    .line 188
    const-string v10, "hasAvatarAnimation"

    .line 189
    .line 190
    const-string v11, "showAvatarAnimation"

    .line 191
    .line 192
    const-string v12, "isAvatarDynamic"

    .line 193
    .line 194
    const-string v13, "hasAvatarEffect"

    .line 195
    .line 196
    const-string v14, "showAvatarEffect"

    .line 197
    .line 198
    const-string v15, "hasAvatarPendant"

    .line 199
    .line 200
    const-string v16, "showAvatarPendant"

    .line 201
    .line 202
    const-string v17, "hasHeadPendant"

    .line 203
    .line 204
    const-string v18, "showHeadPendant"

    .line 205
    .line 206
    const-string v19, "hasAvatarFrame"

    .line 207
    .line 208
    const-string v20, "showAvatarFrame"

    .line 209
    .line 210
    const-string v21, "hasAvatarBorder"

    .line 211
    .line 212
    const-string v22, "showAvatarBorder"

    .line 213
    .line 214
    filled-new-array/range {v6 .. v24}, [Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    move v3, v2

    .line 219
    :goto_2
    const/16 v4, 0x13

    .line 220
    .line 221
    if-ge v3, v4, :cond_3

    .line 222
    .line 223
    aget-object v4, v0, v3

    .line 224
    .line 225
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 226
    .line 227
    invoke-static {v1, v4, v5}, Lw4;->d(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 228
    .line 229
    .line 230
    add-int/lit8 v3, v3, 0x1

    .line 231
    .line 232
    goto :goto_2

    .line 233
    :cond_3
    const-string v18, "avatarBorderUrl"

    .line 234
    .line 235
    const-string v19, "headDecorUrl"

    .line 236
    .line 237
    const-string v4, "dynamicAvatarUrl"

    .line 238
    .line 239
    const-string v5, "dynamicHeadUrl"

    .line 240
    .line 241
    const-string v6, "dynamicFaceUrl"

    .line 242
    .line 243
    const-string v7, "avatarAnimationUrl"

    .line 244
    .line 245
    const-string v8, "avatarDynamicUrl"

    .line 246
    .line 247
    const-string v9, "avatarVideoUrl"

    .line 248
    .line 249
    const-string v10, "avatarPagUrl"

    .line 250
    .line 251
    const-string v11, "avatarSvgaUrl"

    .line 252
    .line 253
    const-string v12, "avatarLottieUrl"

    .line 254
    .line 255
    const-string v13, "avatarVapieUrl"

    .line 256
    .line 257
    const-string v14, "avatarEffectUrl"

    .line 258
    .line 259
    const-string v15, "avatarPendantUrl"

    .line 260
    .line 261
    const-string v16, "headPendantUrl"

    .line 262
    .line 263
    const-string v17, "avatarFrameUrl"

    .line 264
    .line 265
    filled-new-array/range {v4 .. v19}, [Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    :goto_3
    const/16 v3, 0x10

    .line 270
    .line 271
    if-ge v2, v3, :cond_4

    .line 272
    .line 273
    aget-object v3, v0, v2

    .line 274
    .line 275
    const-string v4, ""

    .line 276
    .line 277
    invoke-static {v1, v3, v4}, Lw4;->d(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 278
    .line 279
    .line 280
    add-int/lit8 v2, v2, 0x1

    .line 281
    .line 282
    goto :goto_3

    .line 283
    :cond_4
    :goto_4
    return-void
.end method
