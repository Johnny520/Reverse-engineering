.class public final synthetic Lcom/materialkolor/dynamiccolor/飘花落叶言子楪哲世兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;


# instance fields
.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/materialkolor/dynamiccolor/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v0, v0, Lcom/materialkolor/dynamiccolor/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲苏兰世:I

    .line 4
    .line 5
    const-wide/high16 v1, 0x4059000000000000L    # 100.0

    .line 6
    .line 7
    const-wide v3, 0x4056800000000000L    # 90.0

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    const-wide/high16 v5, 0x3ff0000000000000L    # 1.0

    .line 13
    .line 14
    const-wide v7, 0x3ffb333333333333L    # 1.7

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    sget-object v9, Lcom/materialkolor/dynamiccolor/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世苏哲兰:Lcom/materialkolor/dynamiccolor/飘花落叶言子楪兰世苏哲;

    .line 20
    .line 21
    const-wide/high16 v10, 0x4018000000000000L    # 6.0

    .line 22
    .line 23
    const-wide/16 v12, 0x0

    .line 24
    .line 25
    const-wide/high16 v14, 0x401c000000000000L    # 7.0

    .line 26
    .line 27
    const/16 v16, 0x0

    .line 28
    .line 29
    packed-switch v0, :pswitch_data_0

    .line 30
    .line 31
    .line 32
    move-object/from16 v0, p1

    .line 33
    .line 34
    check-cast v0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    iget-object v0, v0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰:L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世苏兰哲;

    .line 40
    .line 41
    return-object v0

    .line 42
    :pswitch_0
    move-object/from16 v0, p1

    .line 43
    .line 44
    check-cast v0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;

    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    iget-boolean v1, v0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰:Z

    .line 50
    .line 51
    if-nez v1, :cond_4

    .line 52
    .line 53
    iget-object v1, v0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:Lcom/materialkolor/scheme/Variant;

    .line 54
    .line 55
    sget-object v2, Lcom/materialkolor/scheme/Variant;->NEUTRAL:Lcom/materialkolor/scheme/Variant;

    .line 56
    .line 57
    if-ne v1, v2, :cond_0

    .line 58
    .line 59
    const-wide/high16 v0, 0x4004000000000000L    # 2.5

    .line 60
    .line 61
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    goto :goto_0

    .line 66
    :cond_0
    sget-object v2, Lcom/materialkolor/scheme/Variant;->TONAL_SPOT:Lcom/materialkolor/scheme/Variant;

    .line 67
    .line 68
    if-ne v1, v2, :cond_1

    .line 69
    .line 70
    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    goto :goto_0

    .line 75
    :cond_1
    sget-object v2, Lcom/materialkolor/scheme/Variant;->EXPRESSIVE:Lcom/materialkolor/scheme/Variant;

    .line 76
    .line 77
    if-ne v1, v2, :cond_3

    .line 78
    .line 79
    iget-object v0, v0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰:L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世苏兰哲;

    .line 80
    .line 81
    iget-object v0, v0, L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言楪兰子世哲苏/飘花落叶言子楪世苏兰哲;

    .line 82
    .line 83
    invoke-virtual {v0}, L飘花落叶言楪兰子世哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲()Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-eqz v0, :cond_2

    .line 88
    .line 89
    const-wide v0, 0x400599999999999aL    # 2.7

    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    goto :goto_0

    .line 99
    :cond_2
    const-wide/high16 v0, 0x3ffc000000000000L    # 1.75

    .line 100
    .line 101
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    goto :goto_0

    .line 106
    :cond_3
    sget-object v0, Lcom/materialkolor/scheme/Variant;->VIBRANT:Lcom/materialkolor/scheme/Variant;

    .line 107
    .line 108
    if-ne v1, v0, :cond_4

    .line 109
    .line 110
    const-wide v0, 0x3ff5c28f5c28f5c3L    # 1.36

    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    goto :goto_0

    .line 120
    :cond_4
    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    :goto_0
    return-object v0

    .line 125
    :pswitch_1
    move-object/from16 v0, p1

    .line 126
    .line 127
    check-cast v0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;

    .line 128
    .line 129
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    iget-boolean v1, v0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰:Z

    .line 133
    .line 134
    if-eqz v1, :cond_5

    .line 135
    .line 136
    const-wide/high16 v3, 0x4010000000000000L    # 4.0

    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_5
    iget-object v1, v0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰:L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世苏兰哲;

    .line 140
    .line 141
    iget-object v1, v1, L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言楪兰子世哲苏/飘花落叶言子楪世苏兰哲;

    .line 142
    .line 143
    invoke-virtual {v1}, L飘花落叶言楪兰子世哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲()Z

    .line 144
    .line 145
    .line 146
    move-result v1

    .line 147
    if-eqz v1, :cond_6

    .line 148
    .line 149
    goto :goto_1

    .line 150
    :cond_6
    iget-object v0, v0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:Lcom/materialkolor/scheme/Variant;

    .line 151
    .line 152
    sget-object v1, Lcom/materialkolor/scheme/Variant;->VIBRANT:Lcom/materialkolor/scheme/Variant;

    .line 153
    .line 154
    if-ne v0, v1, :cond_7

    .line 155
    .line 156
    const-wide v3, 0x4055400000000000L    # 85.0

    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_7
    const-wide v3, 0x4055c00000000000L    # 87.0

    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    :goto_1
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    return-object v0

    .line 172
    :pswitch_2
    move-object/from16 v0, p1

    .line 173
    .line 174
    check-cast v0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;

    .line 175
    .line 176
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    iget-object v0, v0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰:L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世苏兰哲;

    .line 180
    .line 181
    return-object v0

    .line 182
    :pswitch_3
    move-object/from16 v0, p1

    .line 183
    .line 184
    check-cast v0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;

    .line 185
    .line 186
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    sget-object v0, Lcom/materialkolor/scheme/DynamicScheme$Platform;->Companion:L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世苏兰哲;

    .line 190
    .line 191
    return-object v16

    .line 192
    :pswitch_4
    move-object/from16 v0, p1

    .line 193
    .line 194
    check-cast v0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;

    .line 195
    .line 196
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    iget-object v0, v0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲:L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世苏兰哲;

    .line 200
    .line 201
    return-object v0

    .line 202
    :pswitch_5
    move-object/from16 v0, p1

    .line 203
    .line 204
    check-cast v0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;

    .line 205
    .line 206
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    iget-object v1, v0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世苏兰哲;

    .line 210
    .line 211
    iget-boolean v2, v0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰:Z

    .line 212
    .line 213
    iget-object v5, v0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰:Lcom/materialkolor/scheme/DynamicScheme$Platform;

    .line 214
    .line 215
    sget-object v6, Lcom/materialkolor/scheme/DynamicScheme$Platform;->WATCH:Lcom/materialkolor/scheme/DynamicScheme$Platform;

    .line 216
    .line 217
    const-wide/high16 v7, 0x403e000000000000L    # 30.0

    .line 218
    .line 219
    if-ne v5, v6, :cond_8

    .line 220
    .line 221
    goto :goto_2

    .line 222
    :cond_8
    iget-object v0, v0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:Lcom/materialkolor/scheme/Variant;

    .line 223
    .line 224
    sget-object v5, Lcom/materialkolor/scheme/Variant;->NEUTRAL:Lcom/materialkolor/scheme/Variant;

    .line 225
    .line 226
    if-ne v0, v5, :cond_9

    .line 227
    .line 228
    if-eqz v2, :cond_11

    .line 229
    .line 230
    :goto_2
    move-wide v3, v7

    .line 231
    goto :goto_5

    .line 232
    :cond_9
    sget-object v5, Lcom/materialkolor/scheme/Variant;->TONAL_SPOT:Lcom/materialkolor/scheme/Variant;

    .line 233
    .line 234
    const-wide v9, 0x4057400000000000L    # 93.0

    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    if-ne v0, v5, :cond_b

    .line 240
    .line 241
    if-eqz v2, :cond_a

    .line 242
    .line 243
    const-wide v2, 0x4041800000000000L    # 35.0

    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    invoke-static {v1, v2, v3, v9, v10}, L飘花落叶言楪哲子世苏兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子世楪兰苏哲(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世苏兰哲;DD)D

    .line 249
    .line 250
    .line 251
    move-result-wide v3

    .line 252
    goto :goto_5

    .line 253
    :cond_a
    invoke-static {v1, v12, v13, v3, v4}, L飘花落叶言楪哲子世苏兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子世楪哲兰苏(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世苏兰哲;DD)D

    .line 254
    .line 255
    .line 256
    move-result-wide v3

    .line 257
    goto :goto_5

    .line 258
    :cond_b
    sget-object v3, Lcom/materialkolor/scheme/Variant;->EXPRESSIVE:Lcom/materialkolor/scheme/Variant;

    .line 259
    .line 260
    const/16 v4, 0x58

    .line 261
    .line 262
    if-ne v0, v3, :cond_e

    .line 263
    .line 264
    if-eqz v2, :cond_c

    .line 265
    .line 266
    invoke-static {v1, v7, v8, v9, v10}, L飘花落叶言楪哲子世苏兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子世楪哲兰苏(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世苏兰哲;DD)D

    .line 267
    .line 268
    .line 269
    move-result-wide v3

    .line 270
    goto :goto_5

    .line 271
    :cond_c
    iget-object v0, v1, L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言楪兰子世哲苏/飘花落叶言子楪世苏兰哲;

    .line 272
    .line 273
    invoke-virtual {v0}, L飘花落叶言楪兰子世哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰()Z

    .line 274
    .line 275
    .line 276
    move-result v0

    .line 277
    if-eqz v0, :cond_d

    .line 278
    .line 279
    goto :goto_3

    .line 280
    :cond_d
    const/16 v4, 0x5a

    .line 281
    .line 282
    :goto_3
    int-to-double v2, v4

    .line 283
    const-wide v4, 0x4053800000000000L    # 78.0

    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    invoke-static {v1, v4, v5, v2, v3}, L飘花落叶言楪哲子世苏兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子世楪哲兰苏(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世苏兰哲;DD)D

    .line 289
    .line 290
    .line 291
    move-result-wide v3

    .line 292
    goto :goto_5

    .line 293
    :cond_e
    const-wide v5, 0x4050800000000000L    # 66.0

    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    if-eqz v2, :cond_f

    .line 299
    .line 300
    invoke-static {v1, v5, v6, v9, v10}, L飘花落叶言楪哲子世苏兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子世楪兰苏哲(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世苏兰哲;DD)D

    .line 301
    .line 302
    .line 303
    move-result-wide v3

    .line 304
    goto :goto_5

    .line 305
    :cond_f
    iget-object v0, v1, L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言楪兰子世哲苏/飘花落叶言子楪世苏兰哲;

    .line 306
    .line 307
    invoke-virtual {v0}, L飘花落叶言楪兰子世哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰()Z

    .line 308
    .line 309
    .line 310
    move-result v0

    .line 311
    if-eqz v0, :cond_10

    .line 312
    .line 313
    goto :goto_4

    .line 314
    :cond_10
    const/16 v4, 0x5d

    .line 315
    .line 316
    :goto_4
    int-to-double v2, v4

    .line 317
    invoke-static {v1, v5, v6, v2, v3}, L飘花落叶言楪哲子世苏兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子世楪哲兰苏(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世苏兰哲;DD)D

    .line 318
    .line 319
    .line 320
    move-result-wide v3

    .line 321
    :cond_11
    :goto_5
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 322
    .line 323
    .line 324
    move-result-object v0

    .line 325
    return-object v0

    .line 326
    :pswitch_6
    move-object/from16 v0, p1

    .line 327
    .line 328
    check-cast v0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;

    .line 329
    .line 330
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 331
    .line 332
    .line 333
    iget-object v0, v0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世苏兰哲;

    .line 334
    .line 335
    return-object v0

    .line 336
    :pswitch_7
    move-object/from16 v0, p1

    .line 337
    .line 338
    check-cast v0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;

    .line 339
    .line 340
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 341
    .line 342
    .line 343
    iget-object v0, v0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰:Lcom/materialkolor/scheme/DynamicScheme$Platform;

    .line 344
    .line 345
    sget-object v1, Lcom/materialkolor/scheme/DynamicScheme$Platform;->PHONE:Lcom/materialkolor/scheme/DynamicScheme$Platform;

    .line 346
    .line 347
    if-ne v0, v1, :cond_12

    .line 348
    .line 349
    invoke-static {v10, v11}, L飘花落叶言楪哲子世苏兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏(D)Lcom/materialkolor/dynamiccolor/飘花落叶言子楪兰苏世哲;

    .line 350
    .line 351
    .line 352
    move-result-object v0

    .line 353
    goto :goto_6

    .line 354
    :cond_12
    invoke-static {v14, v15}, L飘花落叶言楪哲子世苏兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏(D)Lcom/materialkolor/dynamiccolor/飘花落叶言子楪兰苏世哲;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    :goto_6
    return-object v0

    .line 359
    :pswitch_8
    move-object/from16 v0, p1

    .line 360
    .line 361
    check-cast v0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;

    .line 362
    .line 363
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 364
    .line 365
    .line 366
    invoke-virtual {v9}, Lcom/materialkolor/dynamiccolor/飘花落叶言子楪兰世苏哲;->飘花落叶言子世楪苏兰哲()Lcom/materialkolor/dynamiccolor/飘花落叶言子楪兰哲苏世;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    return-object v0

    .line 371
    :pswitch_9
    move-object/from16 v0, p1

    .line 372
    .line 373
    check-cast v0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;

    .line 374
    .line 375
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 376
    .line 377
    .line 378
    iget-object v0, v0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏:L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世苏兰哲;

    .line 379
    .line 380
    return-object v0

    .line 381
    :pswitch_a
    move-object/from16 v0, p1

    .line 382
    .line 383
    check-cast v0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;

    .line 384
    .line 385
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 386
    .line 387
    .line 388
    sget-object v0, Lcom/materialkolor/scheme/DynamicScheme$Platform;->Companion:L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世苏兰哲;

    .line 389
    .line 390
    return-object v16

    .line 391
    :pswitch_b
    move-object/from16 v0, p1

    .line 392
    .line 393
    check-cast v0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;

    .line 394
    .line 395
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 396
    .line 397
    .line 398
    sget-object v0, Lcom/materialkolor/scheme/DynamicScheme$Platform;->Companion:L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世苏兰哲;

    .line 399
    .line 400
    return-object v16

    .line 401
    :pswitch_c
    move-object/from16 v0, p1

    .line 402
    .line 403
    check-cast v0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;

    .line 404
    .line 405
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 406
    .line 407
    .line 408
    iget-object v0, v0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏:L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世苏兰哲;

    .line 409
    .line 410
    return-object v0

    .line 411
    :pswitch_d
    move-object/from16 v0, p1

    .line 412
    .line 413
    check-cast v0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;

    .line 414
    .line 415
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 416
    .line 417
    .line 418
    iget-object v0, v0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰:Lcom/materialkolor/scheme/DynamicScheme$Platform;

    .line 419
    .line 420
    sget-object v1, Lcom/materialkolor/scheme/DynamicScheme$Platform;->PHONE:Lcom/materialkolor/scheme/DynamicScheme$Platform;

    .line 421
    .line 422
    if-ne v0, v1, :cond_13

    .line 423
    .line 424
    invoke-static {v10, v11}, L飘花落叶言楪哲子世苏兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏(D)Lcom/materialkolor/dynamiccolor/飘花落叶言子楪兰苏世哲;

    .line 425
    .line 426
    .line 427
    move-result-object v0

    .line 428
    goto :goto_7

    .line 429
    :cond_13
    invoke-static {v14, v15}, L飘花落叶言楪哲子世苏兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏(D)Lcom/materialkolor/dynamiccolor/飘花落叶言子楪兰苏世哲;

    .line 430
    .line 431
    .line 432
    move-result-object v0

    .line 433
    :goto_7
    return-object v0

    .line 434
    :pswitch_e
    move-object/from16 v0, p1

    .line 435
    .line 436
    check-cast v0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;

    .line 437
    .line 438
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 439
    .line 440
    .line 441
    invoke-virtual {v9}, Lcom/materialkolor/dynamiccolor/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪兰世哲苏()Lcom/materialkolor/dynamiccolor/飘花落叶言子楪兰哲苏世;

    .line 442
    .line 443
    .line 444
    move-result-object v0

    .line 445
    return-object v0

    .line 446
    :pswitch_f
    move-object/from16 v0, p1

    .line 447
    .line 448
    check-cast v0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;

    .line 449
    .line 450
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 451
    .line 452
    .line 453
    iget-object v0, v0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲:L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世苏兰哲;

    .line 454
    .line 455
    return-object v0

    .line 456
    :pswitch_10
    move-object/from16 v0, p1

    .line 457
    .line 458
    check-cast v0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;

    .line 459
    .line 460
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 461
    .line 462
    .line 463
    invoke-static {v14, v15}, L飘花落叶言楪哲子世苏兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏(D)Lcom/materialkolor/dynamiccolor/飘花落叶言子楪兰苏世哲;

    .line 464
    .line 465
    .line 466
    move-result-object v0

    .line 467
    return-object v0

    .line 468
    :pswitch_11
    move-object/from16 v0, p1

    .line 469
    .line 470
    check-cast v0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;

    .line 471
    .line 472
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 473
    .line 474
    .line 475
    iget-object v0, v0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰:L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世苏兰哲;

    .line 476
    .line 477
    return-object v0

    .line 478
    :pswitch_12
    move-object/from16 v0, p1

    .line 479
    .line 480
    check-cast v0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;

    .line 481
    .line 482
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 483
    .line 484
    .line 485
    iget-boolean v0, v0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰:Z

    .line 486
    .line 487
    if-eqz v0, :cond_14

    .line 488
    .line 489
    move-wide v1, v12

    .line 490
    :cond_14
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 491
    .line 492
    .line 493
    move-result-object v0

    .line 494
    return-object v0

    .line 495
    :pswitch_13
    move-object/from16 v0, p1

    .line 496
    .line 497
    check-cast v0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;

    .line 498
    .line 499
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 500
    .line 501
    .line 502
    iget-object v0, v0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰:L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世苏兰哲;

    .line 503
    .line 504
    return-object v0

    .line 505
    :pswitch_14
    move-object/from16 v0, p1

    .line 506
    .line 507
    check-cast v0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;

    .line 508
    .line 509
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 510
    .line 511
    .line 512
    iget-boolean v1, v0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰:Z

    .line 513
    .line 514
    if-eqz v1, :cond_15

    .line 515
    .line 516
    iget-object v0, v0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰:Lcom/materialkolor/scheme/DynamicScheme$Platform;

    .line 517
    .line 518
    sget-object v1, Lcom/materialkolor/scheme/DynamicScheme$Platform;->PHONE:Lcom/materialkolor/scheme/DynamicScheme$Platform;

    .line 519
    .line 520
    if-ne v0, v1, :cond_15

    .line 521
    .line 522
    const-wide/high16 v0, 0x4026000000000000L    # 11.0

    .line 523
    .line 524
    invoke-static {v0, v1}, L飘花落叶言楪哲子世苏兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏(D)Lcom/materialkolor/dynamiccolor/飘花落叶言子楪兰苏世哲;

    .line 525
    .line 526
    .line 527
    move-result-object v0

    .line 528
    goto :goto_8

    .line 529
    :cond_15
    const-wide/high16 v0, 0x4022000000000000L    # 9.0

    .line 530
    .line 531
    invoke-static {v0, v1}, L飘花落叶言楪哲子世苏兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏(D)Lcom/materialkolor/dynamiccolor/飘花落叶言子楪兰苏世哲;

    .line 532
    .line 533
    .line 534
    move-result-object v0

    .line 535
    :goto_8
    return-object v0

    .line 536
    :pswitch_15
    move-object/from16 v0, p1

    .line 537
    .line 538
    check-cast v0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;

    .line 539
    .line 540
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 541
    .line 542
    .line 543
    iget-object v1, v0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰:Lcom/materialkolor/scheme/DynamicScheme$Platform;

    .line 544
    .line 545
    sget-object v2, Lcom/materialkolor/scheme/DynamicScheme$Platform;->PHONE:Lcom/materialkolor/scheme/DynamicScheme$Platform;

    .line 546
    .line 547
    if-ne v1, v2, :cond_1b

    .line 548
    .line 549
    iget-object v1, v0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:Lcom/materialkolor/scheme/Variant;

    .line 550
    .line 551
    sget-object v2, Lcom/materialkolor/scheme/Variant;->NEUTRAL:Lcom/materialkolor/scheme/Variant;

    .line 552
    .line 553
    if-ne v1, v2, :cond_16

    .line 554
    .line 555
    const-wide v5, 0x400199999999999aL    # 2.2

    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    goto :goto_9

    .line 561
    :cond_16
    sget-object v2, Lcom/materialkolor/scheme/Variant;->TONAL_SPOT:Lcom/materialkolor/scheme/Variant;

    .line 562
    .line 563
    if-ne v1, v2, :cond_17

    .line 564
    .line 565
    move-wide v5, v7

    .line 566
    goto :goto_9

    .line 567
    :cond_17
    sget-object v2, Lcom/materialkolor/scheme/Variant;->EXPRESSIVE:Lcom/materialkolor/scheme/Variant;

    .line 568
    .line 569
    if-ne v1, v2, :cond_1a

    .line 570
    .line 571
    iget-object v1, v0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰:L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世苏兰哲;

    .line 572
    .line 573
    iget-object v1, v1, L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言楪兰子世哲苏/飘花落叶言子楪世苏兰哲;

    .line 574
    .line 575
    invoke-virtual {v1}, L飘花落叶言楪兰子世哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲()Z

    .line 576
    .line 577
    .line 578
    move-result v1

    .line 579
    if-eqz v1, :cond_19

    .line 580
    .line 581
    iget-boolean v0, v0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰:Z

    .line 582
    .line 583
    if-eqz v0, :cond_18

    .line 584
    .line 585
    const-wide/high16 v5, 0x4008000000000000L    # 3.0

    .line 586
    .line 587
    goto :goto_9

    .line 588
    :cond_18
    const-wide v5, 0x4002666666666666L    # 2.3

    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    goto :goto_9

    .line 594
    :cond_19
    const-wide v5, 0x3ff999999999999aL    # 1.6

    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    :cond_1a
    :goto_9
    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 600
    .line 601
    .line 602
    move-result-object v0

    .line 603
    goto :goto_a

    .line 604
    :cond_1b
    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 605
    .line 606
    .line 607
    move-result-object v0

    .line 608
    :goto_a
    return-object v0

    .line 609
    :pswitch_16
    move-object/from16 v0, p1

    .line 610
    .line 611
    check-cast v0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;

    .line 612
    .line 613
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 614
    .line 615
    .line 616
    iget-object v0, v0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰:L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世苏兰哲;

    .line 617
    .line 618
    return-object v0

    .line 619
    :pswitch_17
    move-object/from16 v0, p1

    .line 620
    .line 621
    check-cast v0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;

    .line 622
    .line 623
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 624
    .line 625
    .line 626
    sget-object v0, Lcom/materialkolor/scheme/DynamicScheme$Platform;->Companion:L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世苏兰哲;

    .line 627
    .line 628
    return-object v16

    .line 629
    :pswitch_18
    move-object/from16 v0, p1

    .line 630
    .line 631
    check-cast v0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;

    .line 632
    .line 633
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 634
    .line 635
    .line 636
    iget-object v0, v0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世苏兰哲;

    .line 637
    .line 638
    return-object v0

    .line 639
    :pswitch_19
    move-object/from16 v0, p1

    .line 640
    .line 641
    check-cast v0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;

    .line 642
    .line 643
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 644
    .line 645
    .line 646
    iget-object v0, v0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰:Lcom/materialkolor/scheme/DynamicScheme$Platform;

    .line 647
    .line 648
    sget-object v1, Lcom/materialkolor/scheme/DynamicScheme$Platform;->PHONE:Lcom/materialkolor/scheme/DynamicScheme$Platform;

    .line 649
    .line 650
    if-ne v0, v1, :cond_1c

    .line 651
    .line 652
    invoke-static {v10, v11}, L飘花落叶言楪哲子世苏兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏(D)Lcom/materialkolor/dynamiccolor/飘花落叶言子楪兰苏世哲;

    .line 653
    .line 654
    .line 655
    move-result-object v0

    .line 656
    goto :goto_b

    .line 657
    :cond_1c
    invoke-static {v14, v15}, L飘花落叶言楪哲子世苏兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏(D)Lcom/materialkolor/dynamiccolor/飘花落叶言子楪兰苏世哲;

    .line 658
    .line 659
    .line 660
    move-result-object v0

    .line 661
    :goto_b
    return-object v0

    .line 662
    :pswitch_1a
    move-object/from16 v0, p1

    .line 663
    .line 664
    check-cast v0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;

    .line 665
    .line 666
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 667
    .line 668
    .line 669
    invoke-virtual {v9}, Lcom/materialkolor/dynamiccolor/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲世苏兰()Lcom/materialkolor/dynamiccolor/飘花落叶言子楪兰哲苏世;

    .line 670
    .line 671
    .line 672
    move-result-object v0

    .line 673
    return-object v0

    .line 674
    :pswitch_1b
    move-object/from16 v0, p1

    .line 675
    .line 676
    check-cast v0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;

    .line 677
    .line 678
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 679
    .line 680
    .line 681
    iget-object v0, v0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世苏兰哲;

    .line 682
    .line 683
    invoke-static {v0, v12, v13, v1, v2}, L飘花落叶言楪哲子世苏兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子世楪哲兰苏(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世苏兰哲;DD)D

    .line 684
    .line 685
    .line 686
    move-result-wide v0

    .line 687
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 688
    .line 689
    .line 690
    move-result-object v0

    .line 691
    return-object v0

    .line 692
    :pswitch_1c
    move-object/from16 v0, p1

    .line 693
    .line 694
    check-cast v0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;

    .line 695
    .line 696
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 697
    .line 698
    .line 699
    iget-object v0, v0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世苏兰哲;

    .line 700
    .line 701
    return-object v0

    .line 702
    nop

    .line 703
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
.end method
