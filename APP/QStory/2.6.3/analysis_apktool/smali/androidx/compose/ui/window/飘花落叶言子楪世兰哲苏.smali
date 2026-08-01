.class public abstract Landroidx/compose/ui/window/飘花落叶言子楪世兰哲苏;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final 飘花落叶言子楪世苏兰哲:Landroidx/compose/runtime/飘花落叶言子楪兰世苏哲;

.field public static final 飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/飘花落叶言子楪兰世苏哲;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Landroidx/compose/ui/window/AndroidPopup_androidKt$LocalPopupTestTag$1;->INSTANCE:Landroidx/compose/ui/window/AndroidPopup_androidKt$LocalPopupTestTag$1;

    .line 2
    .line 3
    new-instance v1, Landroidx/compose/runtime/飘花落叶言子楪兰世苏哲;

    .line 4
    .line 5
    invoke-direct {v1, v0}, Landroidx/compose/runtime/飘花落叶言子楪兰世苏哲;-><init>(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)V

    .line 6
    .line 7
    .line 8
    sput-object v1, Landroidx/compose/ui/window/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/飘花落叶言子楪兰世苏哲;

    .line 9
    .line 10
    sget-object v0, Landroidx/compose/ui/window/AndroidPopup_androidKt$LocalIsInPopupLayout$1;->INSTANCE:Landroidx/compose/ui/window/AndroidPopup_androidKt$LocalIsInPopupLayout$1;

    .line 11
    .line 12
    new-instance v1, Landroidx/compose/runtime/飘花落叶言子楪兰世苏哲;

    .line 13
    .line 14
    invoke-direct {v1, v0}, Landroidx/compose/runtime/飘花落叶言子楪兰世苏哲;-><init>(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)V

    .line 15
    .line 16
    .line 17
    sput-object v1, Landroidx/compose/ui/window/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:Landroidx/compose/runtime/飘花落叶言子楪兰世苏哲;

    .line 18
    .line 19
    return-void
.end method

.method public static final 飘花落叶言子楪世苏兰哲(Landroid/view/View;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    instance-of v0, p0, Landroid/view/WindowManager$LayoutParams;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    check-cast p0, Landroid/view/WindowManager$LayoutParams;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    :goto_0
    const/4 v0, 0x0

    .line 18
    if-eqz p0, :cond_1

    .line 19
    .line 20
    iget p0, p0, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 21
    .line 22
    and-int/lit16 p0, p0, 0x2000

    .line 23
    .line 24
    if-eqz p0, :cond_1

    .line 25
    .line 26
    const/4 p0, 0x1

    .line 27
    return p0

    .line 28
    :cond_1
    return v0
.end method

.method public static final 飘花落叶言子楪世苏哲兰(Landroidx/compose/ui/window/飘花落叶言子楪兰哲苏世;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;Landroidx/compose/ui/window/飘花落叶言子世楪苏哲兰;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;II)V
    .locals 23

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v9, p3

    .line 4
    .line 5
    move/from16 v10, p5

    .line 6
    .line 7
    move-object/from16 v11, p4

    .line 8
    .line 9
    check-cast v11, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;

    .line 10
    .line 11
    const v0, -0x699ff8ef

    .line 12
    .line 13
    .line 14
    invoke-virtual {v11, v0}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子苏楪世兰哲(I)Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;

    .line 15
    .line 16
    .line 17
    and-int/lit8 v0, v10, 0x6

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {v11, v1}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    const/4 v0, 0x4

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 v0, 0x2

    .line 30
    :goto_0
    or-int/2addr v0, v10

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move v0, v10

    .line 33
    :goto_1
    and-int/lit8 v2, p6, 0x2

    .line 34
    .line 35
    if-eqz v2, :cond_3

    .line 36
    .line 37
    or-int/lit8 v0, v0, 0x30

    .line 38
    .line 39
    :cond_2
    move-object/from16 v3, p1

    .line 40
    .line 41
    goto :goto_3

    .line 42
    :cond_3
    and-int/lit8 v3, v10, 0x30

    .line 43
    .line 44
    if-nez v3, :cond_2

    .line 45
    .line 46
    move-object/from16 v3, p1

    .line 47
    .line 48
    invoke-virtual {v11, v3}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    if-eqz v4, :cond_4

    .line 53
    .line 54
    const/16 v4, 0x20

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_4
    const/16 v4, 0x10

    .line 58
    .line 59
    :goto_2
    or-int/2addr v0, v4

    .line 60
    :goto_3
    and-int/lit8 v4, p6, 0x4

    .line 61
    .line 62
    if-eqz v4, :cond_6

    .line 63
    .line 64
    or-int/lit16 v0, v0, 0x180

    .line 65
    .line 66
    :cond_5
    move-object/from16 v5, p2

    .line 67
    .line 68
    goto :goto_5

    .line 69
    :cond_6
    and-int/lit16 v5, v10, 0x180

    .line 70
    .line 71
    if-nez v5, :cond_5

    .line 72
    .line 73
    move-object/from16 v5, p2

    .line 74
    .line 75
    invoke-virtual {v11, v5}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v6

    .line 79
    if-eqz v6, :cond_7

    .line 80
    .line 81
    const/16 v6, 0x100

    .line 82
    .line 83
    goto :goto_4

    .line 84
    :cond_7
    const/16 v6, 0x80

    .line 85
    .line 86
    :goto_4
    or-int/2addr v0, v6

    .line 87
    :goto_5
    and-int/lit16 v6, v10, 0xc00

    .line 88
    .line 89
    if-nez v6, :cond_9

    .line 90
    .line 91
    invoke-virtual {v11, v9}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v6

    .line 95
    if-eqz v6, :cond_8

    .line 96
    .line 97
    const/16 v6, 0x800

    .line 98
    .line 99
    goto :goto_6

    .line 100
    :cond_8
    const/16 v6, 0x400

    .line 101
    .line 102
    :goto_6
    or-int/2addr v0, v6

    .line 103
    :cond_9
    move v15, v0

    .line 104
    and-int/lit16 v0, v15, 0x493

    .line 105
    .line 106
    const/16 v6, 0x492

    .line 107
    .line 108
    const/4 v8, 0x0

    .line 109
    if-eq v0, v6, :cond_a

    .line 110
    .line 111
    const/4 v0, 0x1

    .line 112
    goto :goto_7

    .line 113
    :cond_a
    move v0, v8

    .line 114
    :goto_7
    and-int/lit8 v6, v15, 0x1

    .line 115
    .line 116
    invoke-virtual {v11, v6, v0}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世哲兰楪苏(IZ)Z

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    if-eqz v0, :cond_21

    .line 121
    .line 122
    if-eqz v2, :cond_b

    .line 123
    .line 124
    const/16 v18, 0x0

    .line 125
    .line 126
    goto :goto_8

    .line 127
    :cond_b
    move-object/from16 v18, v3

    .line 128
    .line 129
    :goto_8
    if-eqz v4, :cond_c

    .line 130
    .line 131
    new-instance v2, Landroidx/compose/ui/window/飘花落叶言子世楪苏哲兰;

    .line 132
    .line 133
    const/16 v3, 0x1f

    .line 134
    .line 135
    invoke-direct {v2, v3}, Landroidx/compose/ui/window/飘花落叶言子世楪苏哲兰;-><init>(I)V

    .line 136
    .line 137
    .line 138
    move-object/from16 v19, v2

    .line 139
    .line 140
    goto :goto_9

    .line 141
    :cond_c
    move-object/from16 v19, v5

    .line 142
    .line 143
    :goto_9
    sget-object v2, Landroidx/compose/ui/platform/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰哲苏:Landroidx/compose/runtime/飘花落叶言子哲兰世苏楪;

    .line 144
    .line 145
    invoke-virtual {v11, v2}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏哲兰世(Landroidx/compose/runtime/飘花落叶言子苏哲兰楪世;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    move-object v4, v2

    .line 150
    check-cast v4, Landroid/view/View;

    .line 151
    .line 152
    sget-object v2, Landroidx/compose/ui/platform/飘花落叶言子苏世兰楪哲;->飘花落叶言子楪苏世兰哲:Landroidx/compose/runtime/飘花落叶言子哲兰世苏楪;

    .line 153
    .line 154
    invoke-virtual {v11, v2}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏哲兰世(Landroidx/compose/runtime/飘花落叶言子苏哲兰楪世;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    move-object v5, v2

    .line 159
    check-cast v5, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世哲苏兰;

    .line 160
    .line 161
    sget-object v2, Landroidx/compose/ui/window/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/飘花落叶言子楪兰世苏哲;

    .line 162
    .line 163
    invoke-virtual {v11, v2}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏哲兰世(Landroidx/compose/runtime/飘花落叶言子苏哲兰楪世;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    move-object/from16 v20, v2

    .line 168
    .line 169
    check-cast v20, Ljava/lang/String;

    .line 170
    .line 171
    sget-object v2, Landroidx/compose/ui/platform/飘花落叶言子苏世兰楪哲;->飘花落叶言子楪哲世兰苏:Landroidx/compose/runtime/飘花落叶言子哲兰世苏楪;

    .line 172
    .line 173
    invoke-virtual {v11, v2}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏哲兰世(Landroidx/compose/runtime/飘花落叶言子苏哲兰楪世;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    move-object/from16 v21, v2

    .line 178
    .line 179
    check-cast v21, Landroidx/compose/ui/unit/LayoutDirection;

    .line 180
    .line 181
    invoke-static {v11}, Landroidx/compose/runtime/飘花落叶言子楪哲苏世兰;->飘花落叶言子世苏兰楪哲(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;)Landroidx/compose/runtime/飘花落叶言子世楪兰苏哲;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    invoke-static {v9, v11}, Landroidx/compose/runtime/飘花落叶言子楪哲苏世兰;->飘花落叶言子世苏兰哲楪(Ljava/lang/Object;Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;)Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

    .line 186
    .line 187
    .line 188
    move-result-object v3

    .line 189
    new-array v6, v8, [Ljava/lang/Object;

    .line 190
    .line 191
    invoke-virtual {v11}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世哲楪兰苏()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    sget-object v12, Landroidx/compose/runtime/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/飘花落叶言子楪世哲兰苏;

    .line 196
    .line 197
    if-ne v0, v12, :cond_d

    .line 198
    .line 199
    sget-object v0, Landroidx/compose/ui/window/AndroidPopup_androidKt$Popup$popupId$1$1;->INSTANCE:Landroidx/compose/ui/window/AndroidPopup_androidKt$Popup$popupId$1$1;

    .line 200
    .line 201
    invoke-virtual {v11, v0}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子苏世哲兰楪(Ljava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    :cond_d
    check-cast v0, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;

    .line 205
    .line 206
    invoke-static {v6, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v6

    .line 210
    sget-object v7, L飘花落叶言子世哲苏兰楪/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世兰苏楪哲;

    .line 211
    .line 212
    const/16 v8, 0xd80

    .line 213
    .line 214
    invoke-static {v6, v7, v0, v11, v8}, L飘花落叶言子世哲苏兰楪/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰([Ljava/lang/Object;L飘花落叶言子世哲苏兰楪/飘花落叶言子楪苏兰世哲;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    move-object v7, v0

    .line 219
    check-cast v7, Ljava/util/UUID;

    .line 220
    .line 221
    sget-object v0, Landroidx/compose/ui/window/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:Landroidx/compose/runtime/飘花落叶言子楪兰世苏哲;

    .line 222
    .line 223
    invoke-virtual {v11, v0}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏哲兰世(Landroidx/compose/runtime/飘花落叶言子苏哲兰楪世;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    check-cast v0, Ljava/lang/Boolean;

    .line 228
    .line 229
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 230
    .line 231
    .line 232
    move-result v8

    .line 233
    invoke-virtual {v11}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世哲楪兰苏()Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    if-ne v0, v12, :cond_e

    .line 238
    .line 239
    new-instance v0, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;

    .line 240
    .line 241
    move-object v6, v1

    .line 242
    move-object v13, v2

    .line 243
    move-object v14, v3

    .line 244
    move-object/from16 v1, v18

    .line 245
    .line 246
    move-object/from16 v2, v19

    .line 247
    .line 248
    move-object/from16 v3, v20

    .line 249
    .line 250
    const/4 v9, 0x0

    .line 251
    const/16 v22, 0x0

    .line 252
    .line 253
    invoke-direct/range {v0 .. v8}, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;-><init>(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;Landroidx/compose/ui/window/飘花落叶言子世楪苏哲兰;Ljava/lang/String;Landroid/view/View;L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世哲苏兰;Landroidx/compose/ui/window/飘花落叶言子楪兰哲苏世;Ljava/util/UUID;Z)V

    .line 254
    .line 255
    .line 256
    move-object v1, v6

    .line 257
    new-instance v2, Landroidx/compose/ui/window/AndroidPopup_androidKt$Popup$popupLayout$1$1$1;

    .line 258
    .line 259
    invoke-direct {v2, v0, v14}, Landroidx/compose/ui/window/AndroidPopup_androidKt$Popup$popupLayout$1$1$1;-><init>(Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;Landroidx/compose/runtime/飘花落叶言子哲兰世楪苏;)V

    .line 260
    .line 261
    .line 262
    new-instance v4, Landroidx/compose/runtime/internal/飘花落叶言子楪世兰苏哲;

    .line 263
    .line 264
    const v5, -0x11bbdae4

    .line 265
    .line 266
    .line 267
    const/4 v6, 0x1

    .line 268
    invoke-direct {v4, v5, v6, v2}, Landroidx/compose/runtime/internal/飘花落叶言子楪世兰苏哲;-><init>(IZLkotlin/飘花落叶言子楪世兰苏哲;)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {v0, v13, v4}, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲世苏兰(Landroidx/compose/runtime/飘花落叶言子楪苏兰哲世;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v11, v0}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子苏世哲兰楪(Ljava/lang/Object;)V

    .line 275
    .line 276
    .line 277
    goto :goto_a

    .line 278
    :cond_e
    move-object/from16 v3, v20

    .line 279
    .line 280
    const/4 v9, 0x0

    .line 281
    const/16 v22, 0x0

    .line 282
    .line 283
    :goto_a
    check-cast v0, Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;

    .line 284
    .line 285
    invoke-virtual {v11, v0}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;)Z

    .line 286
    .line 287
    .line 288
    move-result v2

    .line 289
    and-int/lit8 v4, v15, 0x70

    .line 290
    .line 291
    const/16 v5, 0x20

    .line 292
    .line 293
    if-ne v4, v5, :cond_f

    .line 294
    .line 295
    const/4 v7, 0x1

    .line 296
    goto :goto_b

    .line 297
    :cond_f
    move/from16 v7, v22

    .line 298
    .line 299
    :goto_b
    or-int/2addr v2, v7

    .line 300
    and-int/lit16 v5, v15, 0x380

    .line 301
    .line 302
    const/16 v6, 0x100

    .line 303
    .line 304
    if-ne v5, v6, :cond_10

    .line 305
    .line 306
    const/4 v7, 0x1

    .line 307
    goto :goto_c

    .line 308
    :cond_10
    move/from16 v7, v22

    .line 309
    .line 310
    :goto_c
    or-int/2addr v2, v7

    .line 311
    invoke-virtual {v11, v3}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;)Z

    .line 312
    .line 313
    .line 314
    move-result v6

    .line 315
    or-int/2addr v2, v6

    .line 316
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Enum;->ordinal()I

    .line 317
    .line 318
    .line 319
    move-result v6

    .line 320
    invoke-virtual {v11, v6}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世哲兰苏(I)Z

    .line 321
    .line 322
    .line 323
    move-result v6

    .line 324
    or-int/2addr v2, v6

    .line 325
    invoke-virtual {v11}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世哲楪兰苏()Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object v6

    .line 329
    if-nez v2, :cond_11

    .line 330
    .line 331
    if-ne v6, v12, :cond_12

    .line 332
    .line 333
    :cond_11
    new-instance v16, Landroidx/compose/ui/window/AndroidPopup_androidKt$Popup$2$1;

    .line 334
    .line 335
    move-object/from16 v17, v0

    .line 336
    .line 337
    move-object/from16 v20, v3

    .line 338
    .line 339
    invoke-direct/range {v16 .. v21}, Landroidx/compose/ui/window/AndroidPopup_androidKt$Popup$2$1;-><init>(Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;Landroidx/compose/ui/window/飘花落叶言子世楪苏哲兰;Ljava/lang/String;Landroidx/compose/ui/unit/LayoutDirection;)V

    .line 340
    .line 341
    .line 342
    move-object/from16 v6, v16

    .line 343
    .line 344
    invoke-virtual {v11, v6}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子苏世哲兰楪(Ljava/lang/Object;)V

    .line 345
    .line 346
    .line 347
    :cond_12
    check-cast v6, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 348
    .line 349
    invoke-static {v0, v6, v11}, Landroidx/compose/runtime/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;)V

    .line 350
    .line 351
    .line 352
    invoke-virtual {v11, v0}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;)Z

    .line 353
    .line 354
    .line 355
    move-result v2

    .line 356
    const/16 v6, 0x20

    .line 357
    .line 358
    if-ne v4, v6, :cond_13

    .line 359
    .line 360
    const/4 v7, 0x1

    .line 361
    goto :goto_d

    .line 362
    :cond_13
    move/from16 v7, v22

    .line 363
    .line 364
    :goto_d
    or-int/2addr v2, v7

    .line 365
    const/16 v6, 0x100

    .line 366
    .line 367
    if-ne v5, v6, :cond_14

    .line 368
    .line 369
    const/4 v7, 0x1

    .line 370
    goto :goto_e

    .line 371
    :cond_14
    move/from16 v7, v22

    .line 372
    .line 373
    :goto_e
    or-int/2addr v2, v7

    .line 374
    invoke-virtual {v11, v3}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;)Z

    .line 375
    .line 376
    .line 377
    move-result v4

    .line 378
    or-int/2addr v2, v4

    .line 379
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Enum;->ordinal()I

    .line 380
    .line 381
    .line 382
    move-result v4

    .line 383
    invoke-virtual {v11, v4}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世哲兰苏(I)Z

    .line 384
    .line 385
    .line 386
    move-result v4

    .line 387
    or-int/2addr v2, v4

    .line 388
    invoke-virtual {v11}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世哲楪兰苏()Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v4

    .line 392
    if-nez v2, :cond_16

    .line 393
    .line 394
    if-ne v4, v12, :cond_15

    .line 395
    .line 396
    goto :goto_f

    .line 397
    :cond_15
    move-object/from16 v2, v21

    .line 398
    .line 399
    goto :goto_10

    .line 400
    :cond_16
    :goto_f
    new-instance v16, Landroidx/compose/ui/window/AndroidPopup_androidKt$Popup$3$1;

    .line 401
    .line 402
    move-object/from16 v17, v0

    .line 403
    .line 404
    move-object/from16 v20, v3

    .line 405
    .line 406
    invoke-direct/range {v16 .. v21}, Landroidx/compose/ui/window/AndroidPopup_androidKt$Popup$3$1;-><init>(Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;Landroidx/compose/ui/window/飘花落叶言子世楪苏哲兰;Ljava/lang/String;Landroidx/compose/ui/unit/LayoutDirection;)V

    .line 407
    .line 408
    .line 409
    move-object/from16 v4, v16

    .line 410
    .line 411
    move-object/from16 v2, v21

    .line 412
    .line 413
    invoke-virtual {v11, v4}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子苏世哲兰楪(Ljava/lang/Object;)V

    .line 414
    .line 415
    .line 416
    :goto_10
    check-cast v4, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;

    .line 417
    .line 418
    invoke-static {v4, v11}, Landroidx/compose/runtime/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪苏哲世兰(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;)V

    .line 419
    .line 420
    .line 421
    invoke-virtual {v11, v0}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;)Z

    .line 422
    .line 423
    .line 424
    move-result v3

    .line 425
    and-int/lit8 v4, v15, 0xe

    .line 426
    .line 427
    const/4 v5, 0x4

    .line 428
    if-ne v4, v5, :cond_17

    .line 429
    .line 430
    const/4 v7, 0x1

    .line 431
    goto :goto_11

    .line 432
    :cond_17
    move/from16 v7, v22

    .line 433
    .line 434
    :goto_11
    or-int/2addr v3, v7

    .line 435
    invoke-virtual {v11}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世哲楪兰苏()Ljava/lang/Object;

    .line 436
    .line 437
    .line 438
    move-result-object v4

    .line 439
    if-nez v3, :cond_18

    .line 440
    .line 441
    if-ne v4, v12, :cond_19

    .line 442
    .line 443
    :cond_18
    new-instance v4, Landroidx/compose/ui/window/AndroidPopup_androidKt$Popup$4$1;

    .line 444
    .line 445
    invoke-direct {v4, v0, v1}, Landroidx/compose/ui/window/AndroidPopup_androidKt$Popup$4$1;-><init>(Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;Landroidx/compose/ui/window/飘花落叶言子楪兰哲苏世;)V

    .line 446
    .line 447
    .line 448
    invoke-virtual {v11, v4}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子苏世哲兰楪(Ljava/lang/Object;)V

    .line 449
    .line 450
    .line 451
    :cond_19
    check-cast v4, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 452
    .line 453
    invoke-static {v1, v4, v11}, Landroidx/compose/runtime/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;)V

    .line 454
    .line 455
    .line 456
    invoke-virtual {v11, v0}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;)Z

    .line 457
    .line 458
    .line 459
    move-result v3

    .line 460
    invoke-virtual {v11}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世哲楪兰苏()Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object v4

    .line 464
    if-nez v3, :cond_1a

    .line 465
    .line 466
    if-ne v4, v12, :cond_1b

    .line 467
    .line 468
    :cond_1a
    new-instance v4, Landroidx/compose/ui/window/AndroidPopup_androidKt$Popup$5$1;

    .line 469
    .line 470
    invoke-direct {v4, v0, v9}, Landroidx/compose/ui/window/AndroidPopup_androidKt$Popup$5$1;-><init>(Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 471
    .line 472
    .line 473
    invoke-virtual {v11, v4}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子苏世哲兰楪(Ljava/lang/Object;)V

    .line 474
    .line 475
    .line 476
    :cond_1b
    check-cast v4, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 477
    .line 478
    invoke-static {v11, v0, v4}, Landroidx/compose/runtime/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪苏世哲兰(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;Ljava/lang/Object;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;)V

    .line 479
    .line 480
    .line 481
    invoke-virtual {v11, v0}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;)Z

    .line 482
    .line 483
    .line 484
    move-result v3

    .line 485
    invoke-virtual {v11}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世哲楪兰苏()Ljava/lang/Object;

    .line 486
    .line 487
    .line 488
    move-result-object v4

    .line 489
    if-nez v3, :cond_1c

    .line 490
    .line 491
    if-ne v4, v12, :cond_1d

    .line 492
    .line 493
    :cond_1c
    new-instance v4, Landroidx/compose/ui/window/AndroidPopup_androidKt$Popup$7$1;

    .line 494
    .line 495
    invoke-direct {v4, v0}, Landroidx/compose/ui/window/AndroidPopup_androidKt$Popup$7$1;-><init>(Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;)V

    .line 496
    .line 497
    .line 498
    invoke-virtual {v11, v4}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子苏世哲兰楪(Ljava/lang/Object;)V

    .line 499
    .line 500
    .line 501
    :cond_1d
    check-cast v4, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 502
    .line 503
    sget-object v3, Landroidx/compose/ui/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/飘花落叶言子楪哲世苏兰;

    .line 504
    .line 505
    invoke-static {v3, v4}, Landroidx/compose/ui/layout/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪哲世兰苏(Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;

    .line 506
    .line 507
    .line 508
    move-result-object v3

    .line 509
    invoke-virtual {v11, v0}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;)Z

    .line 510
    .line 511
    .line 512
    move-result v4

    .line 513
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 514
    .line 515
    .line 516
    move-result v5

    .line 517
    invoke-virtual {v11, v5}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世哲兰苏(I)Z

    .line 518
    .line 519
    .line 520
    move-result v5

    .line 521
    or-int/2addr v4, v5

    .line 522
    invoke-virtual {v11}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世哲楪兰苏()Ljava/lang/Object;

    .line 523
    .line 524
    .line 525
    move-result-object v5

    .line 526
    if-nez v4, :cond_1e

    .line 527
    .line 528
    if-ne v5, v12, :cond_1f

    .line 529
    .line 530
    :cond_1e
    new-instance v5, Landroidx/compose/ui/window/飘花落叶言子楪世兰苏哲;

    .line 531
    .line 532
    invoke-direct {v5, v0, v2}, Landroidx/compose/ui/window/飘花落叶言子楪世兰苏哲;-><init>(Landroidx/compose/ui/window/飘花落叶言子楪兰世哲苏;Landroidx/compose/ui/unit/LayoutDirection;)V

    .line 533
    .line 534
    .line 535
    invoke-virtual {v11, v5}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子苏世哲兰楪(Ljava/lang/Object;)V

    .line 536
    .line 537
    .line 538
    :cond_1f
    check-cast v5, Landroidx/compose/ui/layout/飘花落叶言子世兰苏楪哲;

    .line 539
    .line 540
    iget-wide v6, v11, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世兰苏哲楪:J

    .line 541
    .line 542
    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    .line 543
    .line 544
    .line 545
    move-result v0

    .line 546
    invoke-virtual {v11}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏兰哲世()Landroidx/compose/runtime/internal/飘花落叶言子楪苏哲世兰;

    .line 547
    .line 548
    .line 549
    move-result-object v2

    .line 550
    invoke-static {v11, v3}, Landroidx/compose/ui/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;)Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;

    .line 551
    .line 552
    .line 553
    move-result-object v3

    .line 554
    sget-object v4, Landroidx/compose/ui/node/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:Landroidx/compose/ui/node/飘花落叶言子楪世兰哲苏;

    .line 555
    .line 556
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 557
    .line 558
    .line 559
    sget-object v4, Landroidx/compose/ui/node/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;

    .line 560
    .line 561
    invoke-virtual {v11}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子苏楪哲兰世()V

    .line 562
    .line 563
    .line 564
    iget-boolean v6, v11, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世兰苏楪哲:Z

    .line 565
    .line 566
    if-eqz v6, :cond_20

    .line 567
    .line 568
    invoke-virtual {v11, v4}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏兰世哲(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)V

    .line 569
    .line 570
    .line 571
    goto :goto_12

    .line 572
    :cond_20
    invoke-virtual {v11}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子苏哲楪世兰()V

    .line 573
    .line 574
    .line 575
    :goto_12
    sget-object v4, Landroidx/compose/ui/node/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 576
    .line 577
    invoke-static {v11, v5, v4}, Landroidx/compose/runtime/飘花落叶言子楪哲苏世兰;->飘花落叶言子世哲楪兰苏(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;Ljava/lang/Object;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;)V

    .line 578
    .line 579
    .line 580
    sget-object v4, Landroidx/compose/ui/node/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 581
    .line 582
    invoke-static {v11, v2, v4}, Landroidx/compose/runtime/飘花落叶言子楪哲苏世兰;->飘花落叶言子世哲楪兰苏(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;Ljava/lang/Object;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;)V

    .line 583
    .line 584
    .line 585
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 586
    .line 587
    .line 588
    move-result-object v0

    .line 589
    sget-object v2, Landroidx/compose/ui/node/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世哲兰:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 590
    .line 591
    invoke-static {v11, v0, v2}, Landroidx/compose/runtime/飘花落叶言子楪哲苏世兰;->飘花落叶言子世哲楪兰苏(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;Ljava/lang/Object;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;)V

    .line 592
    .line 593
    .line 594
    sget-object v0, Landroidx/compose/ui/node/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 595
    .line 596
    invoke-static {v11, v0}, Landroidx/compose/runtime/飘花落叶言子楪哲苏世兰;->飘花落叶言子世苏哲兰楪(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)V

    .line 597
    .line 598
    .line 599
    sget-object v0, Landroidx/compose/ui/node/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 600
    .line 601
    invoke-static {v11, v3, v0}, Landroidx/compose/runtime/飘花落叶言子楪哲苏世兰;->飘花落叶言子世哲楪兰苏(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;Ljava/lang/Object;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;)V

    .line 602
    .line 603
    .line 604
    const/4 v6, 0x1

    .line 605
    invoke-virtual {v11, v6}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪哲苏兰世(Z)V

    .line 606
    .line 607
    .line 608
    move-object/from16 v2, v18

    .line 609
    .line 610
    move-object/from16 v3, v19

    .line 611
    .line 612
    goto :goto_13

    .line 613
    :cond_21
    invoke-virtual {v11}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世兰楪哲苏()V

    .line 614
    .line 615
    .line 616
    move-object v2, v3

    .line 617
    move-object v3, v5

    .line 618
    :goto_13
    invoke-virtual {v11}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪哲兰苏世()Landroidx/compose/runtime/飘花落叶言子苏哲兰世楪;

    .line 619
    .line 620
    .line 621
    move-result-object v7

    .line 622
    if-eqz v7, :cond_22

    .line 623
    .line 624
    new-instance v0, Landroidx/compose/ui/window/AndroidPopup_androidKt$Popup$9;

    .line 625
    .line 626
    move-object/from16 v4, p3

    .line 627
    .line 628
    move/from16 v6, p6

    .line 629
    .line 630
    move v5, v10

    .line 631
    invoke-direct/range {v0 .. v6}, Landroidx/compose/ui/window/AndroidPopup_androidKt$Popup$9;-><init>(Landroidx/compose/ui/window/飘花落叶言子楪兰哲苏世;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;Landroidx/compose/ui/window/飘花落叶言子世楪苏哲兰;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;II)V

    .line 632
    .line 633
    .line 634
    iput-object v0, v7, Landroidx/compose/runtime/飘花落叶言子苏哲兰世楪;->飘花落叶言子楪世哲兰苏:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 635
    .line 636
    :cond_22
    return-void
.end method
