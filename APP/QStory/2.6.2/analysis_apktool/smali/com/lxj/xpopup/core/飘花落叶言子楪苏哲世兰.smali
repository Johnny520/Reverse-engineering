.class public final Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲世兰;
.super Landroid/app/Dialog;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public 飘花落叶言子楪哲苏兰世:Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;


# direct methods
.method public static 飘花落叶言子楪世苏哲兰()Z
    .locals 9

    .line 1
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "Y"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    const/4 v3, 0x0

    .line 11
    if-nez v1, :cond_1

    .line 12
    .line 13
    const-string v1, "y"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    const-string v1, "V"

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_1

    .line 28
    .line 29
    const-string v1, "v"

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move v0, v3

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    :goto_0
    move v0, v2

    .line 41
    :goto_1
    sget-object v1, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:[Ljava/lang/String;

    .line 42
    .line 43
    aget-object v4, v1, v3

    .line 44
    .line 45
    const-string v5, "unknown"

    .line 46
    .line 47
    sget-object v6, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏世哲:Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;

    .line 48
    .line 49
    if-eqz v6, :cond_2

    .line 50
    .line 51
    goto/16 :goto_5

    .line 52
    .line 53
    :cond_2
    new-instance v6, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;

    .line 54
    .line 55
    const/16 v7, 0x13

    .line 56
    .line 57
    invoke-direct {v6, v7, v3}, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;-><init>(IZ)V

    .line 58
    .line 59
    .line 60
    sput-object v6, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏世哲:Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;

    .line 61
    .line 62
    :try_start_0
    sget-object v6, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 63
    .line 64
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 65
    .line 66
    .line 67
    move-result v7

    .line 68
    if-nez v7, :cond_3

    .line 69
    .line 70
    invoke-virtual {v6}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    goto :goto_2

    .line 75
    :catchall_0
    :cond_3
    move-object v6, v5

    .line 76
    :goto_2
    :try_start_1
    sget-object v7, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 77
    .line 78
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 79
    .line 80
    .line 81
    move-result v8

    .line 82
    if-nez v8, :cond_4

    .line 83
    .line 84
    invoke-virtual {v7}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 88
    :catchall_1
    :cond_4
    sget-object v7, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:[Ljava/lang/String;

    .line 89
    .line 90
    invoke-static {v6, v5, v7}, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Z

    .line 91
    .line 92
    .line 93
    move-result v8

    .line 94
    if-eqz v8, :cond_6

    .line 95
    .line 96
    sget-object v1, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏世哲:Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;

    .line 97
    .line 98
    aget-object v5, v7, v3

    .line 99
    .line 100
    iput-object v5, v1, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 101
    .line 102
    const-string v1, "ro.build.version.emui"

    .line 103
    .line 104
    invoke-static {v1}, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    const-string v5, "_"

    .line 109
    .line 110
    invoke-virtual {v1, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    array-length v6, v5

    .line 115
    if-le v6, v2, :cond_5

    .line 116
    .line 117
    sget-object v1, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏世哲:Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;

    .line 118
    .line 119
    aget-object v5, v5, v2

    .line 120
    .line 121
    iput-object v5, v1, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_5
    sget-object v5, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏世哲:Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;

    .line 125
    .line 126
    iput-object v1, v5, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 127
    .line 128
    :goto_3
    sget-object v6, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏世哲:Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;

    .line 129
    .line 130
    goto/16 :goto_5

    .line 131
    .line 132
    :cond_6
    invoke-static {v6, v5, v1}, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Z

    .line 133
    .line 134
    .line 135
    move-result v7

    .line 136
    if-eqz v7, :cond_7

    .line 137
    .line 138
    sget-object v5, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏世哲:Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;

    .line 139
    .line 140
    aget-object v1, v1, v3

    .line 141
    .line 142
    iput-object v1, v5, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 143
    .line 144
    const-string v1, "ro.vivo.os.build.display.id"

    .line 145
    .line 146
    invoke-static {v1}, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    iput-object v1, v5, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 151
    .line 152
    sget-object v6, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏世哲:Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;

    .line 153
    .line 154
    goto/16 :goto_5

    .line 155
    .line 156
    :cond_7
    sget-object v1, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:[Ljava/lang/String;

    .line 157
    .line 158
    invoke-static {v6, v5, v1}, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Z

    .line 159
    .line 160
    .line 161
    move-result v7

    .line 162
    if-eqz v7, :cond_8

    .line 163
    .line 164
    sget-object v5, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏世哲:Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;

    .line 165
    .line 166
    aget-object v1, v1, v3

    .line 167
    .line 168
    iput-object v1, v5, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 169
    .line 170
    const-string v1, "ro.build.version.incremental"

    .line 171
    .line 172
    invoke-static {v1}, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    iput-object v1, v5, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 177
    .line 178
    sget-object v6, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏世哲:Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;

    .line 179
    .line 180
    goto/16 :goto_5

    .line 181
    .line 182
    :cond_8
    sget-object v1, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏:[Ljava/lang/String;

    .line 183
    .line 184
    invoke-static {v6, v5, v1}, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Z

    .line 185
    .line 186
    .line 187
    move-result v7

    .line 188
    if-eqz v7, :cond_9

    .line 189
    .line 190
    sget-object v5, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏世哲:Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;

    .line 191
    .line 192
    aget-object v1, v1, v3

    .line 193
    .line 194
    iput-object v1, v5, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 195
    .line 196
    const-string v1, "ro.build.version.opporom"

    .line 197
    .line 198
    invoke-static {v1}, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    iput-object v1, v5, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 203
    .line 204
    sget-object v6, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏世哲:Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;

    .line 205
    .line 206
    goto/16 :goto_5

    .line 207
    .line 208
    :cond_9
    sget-object v1, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲:[Ljava/lang/String;

    .line 209
    .line 210
    invoke-static {v6, v5, v1}, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Z

    .line 211
    .line 212
    .line 213
    move-result v7

    .line 214
    if-eqz v7, :cond_a

    .line 215
    .line 216
    sget-object v5, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏世哲:Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;

    .line 217
    .line 218
    aget-object v1, v1, v3

    .line 219
    .line 220
    iput-object v1, v5, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 221
    .line 222
    const-string v1, "ro.letv.release.version"

    .line 223
    .line 224
    invoke-static {v1}, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    iput-object v1, v5, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 229
    .line 230
    sget-object v6, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏世哲:Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;

    .line 231
    .line 232
    goto/16 :goto_5

    .line 233
    .line 234
    :cond_a
    sget-object v1, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏:[Ljava/lang/String;

    .line 235
    .line 236
    invoke-static {v6, v5, v1}, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Z

    .line 237
    .line 238
    .line 239
    move-result v7

    .line 240
    if-eqz v7, :cond_b

    .line 241
    .line 242
    sget-object v5, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏世哲:Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;

    .line 243
    .line 244
    aget-object v1, v1, v3

    .line 245
    .line 246
    iput-object v1, v5, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 247
    .line 248
    const-string v1, "ro.build.uiversion"

    .line 249
    .line 250
    invoke-static {v1}, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v1

    .line 254
    iput-object v1, v5, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 255
    .line 256
    sget-object v6, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏世哲:Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;

    .line 257
    .line 258
    goto/16 :goto_5

    .line 259
    .line 260
    :cond_b
    sget-object v1, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰:[Ljava/lang/String;

    .line 261
    .line 262
    invoke-static {v6, v5, v1}, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Z

    .line 263
    .line 264
    .line 265
    move-result v7

    .line 266
    if-eqz v7, :cond_c

    .line 267
    .line 268
    sget-object v5, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏世哲:Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;

    .line 269
    .line 270
    aget-object v1, v1, v3

    .line 271
    .line 272
    iput-object v1, v5, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 273
    .line 274
    const-string v1, "ro.build.MiFavor_version"

    .line 275
    .line 276
    invoke-static {v1}, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v1

    .line 280
    iput-object v1, v5, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 281
    .line 282
    sget-object v6, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏世哲:Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;

    .line 283
    .line 284
    goto/16 :goto_5

    .line 285
    .line 286
    :cond_c
    sget-object v1, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世兰哲:[Ljava/lang/String;

    .line 287
    .line 288
    invoke-static {v6, v5, v1}, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Z

    .line 289
    .line 290
    .line 291
    move-result v7

    .line 292
    if-eqz v7, :cond_d

    .line 293
    .line 294
    sget-object v5, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏世哲:Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;

    .line 295
    .line 296
    aget-object v1, v1, v3

    .line 297
    .line 298
    iput-object v1, v5, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 299
    .line 300
    const-string v1, "ro.rom.version"

    .line 301
    .line 302
    invoke-static {v1}, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object v1

    .line 306
    iput-object v1, v5, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 307
    .line 308
    sget-object v6, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏世哲:Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;

    .line 309
    .line 310
    goto/16 :goto_5

    .line 311
    .line 312
    :cond_d
    sget-object v1, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰:[Ljava/lang/String;

    .line 313
    .line 314
    invoke-static {v6, v5, v1}, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Z

    .line 315
    .line 316
    .line 317
    move-result v7

    .line 318
    if-eqz v7, :cond_e

    .line 319
    .line 320
    sget-object v5, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏世哲:Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;

    .line 321
    .line 322
    aget-object v1, v1, v3

    .line 323
    .line 324
    iput-object v1, v5, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 325
    .line 326
    const-string v1, "ro.build.rom.id"

    .line 327
    .line 328
    invoke-static {v1}, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object v1

    .line 332
    iput-object v1, v5, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 333
    .line 334
    sget-object v6, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏世哲:Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;

    .line 335
    .line 336
    goto/16 :goto_5

    .line 337
    .line 338
    :cond_e
    sget-object v1, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世:[Ljava/lang/String;

    .line 339
    .line 340
    invoke-static {v6, v5, v1}, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Z

    .line 341
    .line 342
    .line 343
    move-result v7

    .line 344
    if-eqz v7, :cond_f

    .line 345
    .line 346
    sget-object v5, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏世哲:Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;

    .line 347
    .line 348
    aget-object v1, v1, v3

    .line 349
    .line 350
    iput-object v1, v5, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 351
    .line 352
    goto/16 :goto_4

    .line 353
    .line 354
    :cond_f
    sget-object v1, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏兰世哲:[Ljava/lang/String;

    .line 355
    .line 356
    invoke-static {v6, v5, v1}, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Z

    .line 357
    .line 358
    .line 359
    move-result v7

    .line 360
    if-eqz v7, :cond_10

    .line 361
    .line 362
    sget-object v5, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏世哲:Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;

    .line 363
    .line 364
    aget-object v1, v1, v3

    .line 365
    .line 366
    iput-object v1, v5, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 367
    .line 368
    goto/16 :goto_4

    .line 369
    .line 370
    :cond_10
    sget-object v1, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏兰哲世:[Ljava/lang/String;

    .line 371
    .line 372
    invoke-static {v6, v5, v1}, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Z

    .line 373
    .line 374
    .line 375
    move-result v7

    .line 376
    if-eqz v7, :cond_11

    .line 377
    .line 378
    sget-object v5, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏世哲:Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;

    .line 379
    .line 380
    aget-object v1, v1, v3

    .line 381
    .line 382
    iput-object v1, v5, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 383
    .line 384
    goto/16 :goto_4

    .line 385
    .line 386
    :cond_11
    sget-object v1, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世苏兰:[Ljava/lang/String;

    .line 387
    .line 388
    invoke-static {v6, v5, v1}, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Z

    .line 389
    .line 390
    .line 391
    move-result v7

    .line 392
    if-eqz v7, :cond_12

    .line 393
    .line 394
    sget-object v5, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏世哲:Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;

    .line 395
    .line 396
    aget-object v1, v1, v3

    .line 397
    .line 398
    iput-object v1, v5, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 399
    .line 400
    goto/16 :goto_4

    .line 401
    .line 402
    :cond_12
    sget-object v1, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世兰苏:[Ljava/lang/String;

    .line 403
    .line 404
    invoke-static {v6, v5, v1}, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Z

    .line 405
    .line 406
    .line 407
    move-result v7

    .line 408
    if-eqz v7, :cond_13

    .line 409
    .line 410
    sget-object v5, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏世哲:Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;

    .line 411
    .line 412
    aget-object v1, v1, v3

    .line 413
    .line 414
    iput-object v1, v5, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 415
    .line 416
    goto :goto_4

    .line 417
    :cond_13
    sget-object v1, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏世兰:[Ljava/lang/String;

    .line 418
    .line 419
    invoke-static {v6, v5, v1}, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Z

    .line 420
    .line 421
    .line 422
    move-result v7

    .line 423
    if-eqz v7, :cond_14

    .line 424
    .line 425
    sget-object v5, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏世哲:Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;

    .line 426
    .line 427
    aget-object v1, v1, v3

    .line 428
    .line 429
    iput-object v1, v5, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 430
    .line 431
    goto :goto_4

    .line 432
    :cond_14
    sget-object v1, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:[Ljava/lang/String;

    .line 433
    .line 434
    invoke-static {v6, v5, v1}, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Z

    .line 435
    .line 436
    .line 437
    move-result v7

    .line 438
    if-eqz v7, :cond_15

    .line 439
    .line 440
    sget-object v5, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏世哲:Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;

    .line 441
    .line 442
    aget-object v1, v1, v3

    .line 443
    .line 444
    iput-object v1, v5, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 445
    .line 446
    goto :goto_4

    .line 447
    :cond_15
    sget-object v1, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:[Ljava/lang/String;

    .line 448
    .line 449
    invoke-static {v6, v5, v1}, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Z

    .line 450
    .line 451
    .line 452
    move-result v7

    .line 453
    if-eqz v7, :cond_16

    .line 454
    .line 455
    sget-object v5, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏世哲:Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;

    .line 456
    .line 457
    aget-object v1, v1, v3

    .line 458
    .line 459
    iput-object v1, v5, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 460
    .line 461
    goto :goto_4

    .line 462
    :cond_16
    sget-object v1, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:[Ljava/lang/String;

    .line 463
    .line 464
    invoke-static {v6, v5, v1}, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Z

    .line 465
    .line 466
    .line 467
    move-result v7

    .line 468
    if-eqz v7, :cond_17

    .line 469
    .line 470
    sget-object v5, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏世哲:Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;

    .line 471
    .line 472
    aget-object v1, v1, v3

    .line 473
    .line 474
    iput-object v1, v5, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 475
    .line 476
    goto :goto_4

    .line 477
    :cond_17
    sget-object v1, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世苏哲:[Ljava/lang/String;

    .line 478
    .line 479
    invoke-static {v6, v5, v1}, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Z

    .line 480
    .line 481
    .line 482
    move-result v7

    .line 483
    if-eqz v7, :cond_18

    .line 484
    .line 485
    sget-object v5, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏世哲:Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;

    .line 486
    .line 487
    aget-object v1, v1, v3

    .line 488
    .line 489
    iput-object v1, v5, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 490
    .line 491
    goto :goto_4

    .line 492
    :cond_18
    sget-object v1, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世哲苏:[Ljava/lang/String;

    .line 493
    .line 494
    invoke-static {v6, v5, v1}, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Z

    .line 495
    .line 496
    .line 497
    move-result v6

    .line 498
    if-eqz v6, :cond_19

    .line 499
    .line 500
    sget-object v5, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏世哲:Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;

    .line 501
    .line 502
    aget-object v1, v1, v3

    .line 503
    .line 504
    iput-object v1, v5, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 505
    .line 506
    goto :goto_4

    .line 507
    :cond_19
    sget-object v1, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏世哲:Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;

    .line 508
    .line 509
    iput-object v5, v1, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 510
    .line 511
    :goto_4
    sget-object v1, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏世哲:Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;

    .line 512
    .line 513
    const-string v5, ""

    .line 514
    .line 515
    invoke-static {v5}, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)Ljava/lang/String;

    .line 516
    .line 517
    .line 518
    move-result-object v5

    .line 519
    iput-object v5, v1, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 520
    .line 521
    sget-object v6, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏世哲:Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;

    .line 522
    .line 523
    :goto_5
    iget-object v1, v6, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 524
    .line 525
    check-cast v1, Ljava/lang/String;

    .line 526
    .line 527
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 528
    .line 529
    .line 530
    move-result v1

    .line 531
    if-eqz v1, :cond_1a

    .line 532
    .line 533
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 534
    .line 535
    const/16 v4, 0x1b

    .line 536
    .line 537
    if-ne v1, v4, :cond_1a

    .line 538
    .line 539
    if-eqz v0, :cond_1a

    .line 540
    .line 541
    goto :goto_6

    .line 542
    :cond_1a
    move v2, v3

    .line 543
    :goto_6
    return v2
.end method


# virtual methods
.method public final dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 6

    .line 1
    invoke-static {}, Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const-string v3, "dimen"

    .line 20
    .line 21
    const-string v4, "android"

    .line 22
    .line 23
    const-string v5, "status_bar_height"

    .line 24
    .line 25
    invoke-virtual {v2, v5, v3, v4}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    int-to-float v2, v2

    .line 34
    add-float/2addr v1, v2

    .line 35
    invoke-virtual {p1, v0, v1}, Landroid/view/MotionEvent;->setLocation(FF)V

    .line 36
    .line 37
    .line 38
    :cond_0
    invoke-super {p0, p1}, Landroid/app/Dialog;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    return p0
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 5

    .line 1
    invoke-super {p0, p1}, Landroid/app/Dialog;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    if-eqz p1, :cond_5

    .line 9
    .line 10
    iget-object p1, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;

    .line 11
    .line 12
    if-eqz p1, :cond_5

    .line 13
    .line 14
    iget-object p1, p1, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupInfo:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;

    .line 15
    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    goto/16 :goto_2

    .line 19
    .line 20
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    const/4 v0, 0x0

    .line 28
    invoke-virtual {p1, v0}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    const/4 v0, 0x0

    .line 40
    invoke-virtual {p1, v0, v0, v0, v0}, Landroid/view/View;->setPadding(IIII)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    const/high16 v1, 0x1000000

    .line 48
    .line 49
    invoke-virtual {p1, v1, v1}, Landroid/view/Window;->setFlags(II)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    const/16 v1, 0x10

    .line 57
    .line 58
    invoke-virtual {p1, v1}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    const/16 v1, 0x500

    .line 70
    .line 71
    invoke-virtual {p1, v1}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-virtual {p1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    iget v1, p1, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 83
    .line 84
    const v2, -0xc000001

    .line 85
    .line 86
    .line 87
    and-int/2addr v1, v2

    .line 88
    iput v1, p1, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 89
    .line 90
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-virtual {v1, p1}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-virtual {p1, v0}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 102
    .line 103
    .line 104
    iget-object p1, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;

    .line 105
    .line 106
    iget-object p1, p1, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupInfo:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;

    .line 107
    .line 108
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    sget p1, L飘花落叶言楪哲苏兰子世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 112
    .line 113
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    const/high16 v1, -0x80000000

    .line 118
    .line 119
    invoke-virtual {p1, v1}, Landroid/view/Window;->addFlags(I)V

    .line 120
    .line 121
    .line 122
    iget-object p1, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;

    .line 123
    .line 124
    iget-object p1, p1, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupInfo:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;

    .line 125
    .line 126
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    iget-object p1, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;

    .line 130
    .line 131
    iget-object p1, p1, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupInfo:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;

    .line 132
    .line 133
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    iget-object p1, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;

    .line 137
    .line 138
    iget-object p1, p1, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupInfo:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;

    .line 139
    .line 140
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    iget-object p1, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;

    .line 144
    .line 145
    iget-object p1, p1, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupInfo:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;

    .line 146
    .line 147
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    iget-object p1, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;

    .line 151
    .line 152
    iget-object p1, p1, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupInfo:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;

    .line 153
    .line 154
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    iget-object p1, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;

    .line 158
    .line 159
    iget-object p1, p1, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupInfo:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;

    .line 160
    .line 161
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    const/4 v1, -0x1

    .line 169
    invoke-virtual {p1, v1, v1}, Landroid/view/Window;->setLayout(II)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    iget p1, p1, Landroid/content/res/Configuration;->orientation:I

    .line 185
    .line 186
    const/4 v2, 0x1

    .line 187
    if-ne p1, v2, :cond_1

    .line 188
    .line 189
    move v0, v2

    .line 190
    :cond_1
    invoke-static {}, Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰()Z

    .line 191
    .line 192
    .line 193
    move-result p1

    .line 194
    if-eqz p1, :cond_4

    .line 195
    .line 196
    if-eqz v0, :cond_4

    .line 197
    .line 198
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    const-string v2, "dimen"

    .line 211
    .line 212
    const-string v3, "android"

    .line 213
    .line 214
    const-string v4, "status_bar_height"

    .line 215
    .line 216
    invoke-virtual {v0, v4, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 217
    .line 218
    .line 219
    move-result v2

    .line 220
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 221
    .line 222
    .line 223
    move-result v0

    .line 224
    neg-int v0, v0

    .line 225
    int-to-float v0, v0

    .line 226
    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationY(F)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    const-string v2, "window"

    .line 238
    .line 239
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    check-cast v0, Landroid/view/WindowManager;

    .line 244
    .line 245
    if-nez v0, :cond_2

    .line 246
    .line 247
    move v0, v1

    .line 248
    goto :goto_0

    .line 249
    :cond_2
    new-instance v3, Landroid/graphics/Point;

    .line 250
    .line 251
    invoke-direct {v3}, Landroid/graphics/Point;-><init>()V

    .line 252
    .line 253
    .line 254
    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    invoke-virtual {v0, v3}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V

    .line 259
    .line 260
    .line 261
    iget v0, v3, Landroid/graphics/Point;->x:I

    .line 262
    .line 263
    :goto_0
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 264
    .line 265
    .line 266
    move-result-object v3

    .line 267
    invoke-virtual {v3, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v2

    .line 271
    check-cast v2, Landroid/view/WindowManager;

    .line 272
    .line 273
    if-nez v2, :cond_3

    .line 274
    .line 275
    goto :goto_1

    .line 276
    :cond_3
    new-instance v1, Landroid/graphics/Point;

    .line 277
    .line 278
    invoke-direct {v1}, Landroid/graphics/Point;-><init>()V

    .line 279
    .line 280
    .line 281
    invoke-interface {v2}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 282
    .line 283
    .line 284
    move-result-object v2

    .line 285
    invoke-virtual {v2, v1}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V

    .line 286
    .line 287
    .line 288
    iget v1, v1, Landroid/graphics/Point;->y:I

    .line 289
    .line 290
    :goto_1
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 291
    .line 292
    .line 293
    move-result-object v2

    .line 294
    invoke-static {v2}, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏(Landroid/content/Context;)I

    .line 295
    .line 296
    .line 297
    move-result v2

    .line 298
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 299
    .line 300
    .line 301
    move-result v1

    .line 302
    invoke-virtual {p1, v0, v1}, Landroid/view/Window;->setLayout(II)V

    .line 303
    .line 304
    .line 305
    :cond_4
    iget-object p1, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;

    .line 306
    .line 307
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 308
    .line 309
    .line 310
    :cond_5
    :goto_2
    return-void
.end method

.method public final onWindowFocusChanged(Z)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/app/Dialog;->onWindowFocusChanged(Z)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;

    .line 5
    .line 6
    iget-object v0, v0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupInfo:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;

    .line 12
    .line 13
    iget-object v0, v0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupInfo:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    sget v0, L飘花落叶言楪哲苏兰子世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 19
    .line 20
    iget-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;

    .line 21
    .line 22
    iget-object v0, v0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupInfo:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;

    .line 28
    .line 29
    iget-object v0, v0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupInfo:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    if-eqz p1, :cond_0

    .line 35
    .line 36
    iget-object p1, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;

    .line 37
    .line 38
    if-eqz p1, :cond_0

    .line 39
    .line 40
    iget-boolean v0, p1, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->hasMoveUp:Z

    .line 41
    .line 42
    if-eqz v0, :cond_0

    .line 43
    .line 44
    iget-object v0, p1, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupStatus:Lcom/lxj/xpopup/enums/PopupStatus;

    .line 45
    .line 46
    sget-object v1, Lcom/lxj/xpopup/enums/PopupStatus;->Show:Lcom/lxj/xpopup/enums/PopupStatus;

    .line 47
    .line 48
    if-ne v0, v1, :cond_0

    .line 49
    .line 50
    invoke-virtual {p1}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->focusAndProcessBackPress()V

    .line 51
    .line 52
    .line 53
    iget-object p0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;

    .line 54
    .line 55
    invoke-static {p0}, Lcom/lxj/xpopup/util/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(Landroid/view/View;)V

    .line 56
    .line 57
    .line 58
    :cond_0
    return-void
.end method
