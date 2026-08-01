.class public abstract L飘花落叶言子楪兰世哲苏/飘花落叶言子楪世哲苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final 飘花落叶言子楪世苏哲兰:[Ljava/lang/StackTraceElement;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/StackTraceElement;

    .line 3
    .line 4
    sput-object v0, L飘花落叶言子楪兰世哲苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:[Ljava/lang/StackTraceElement;

    .line 5
    .line 6
    return-void
.end method

.method public static final 飘花落叶言子楪世苏哲兰(Landroidx/compose/ui/text/飘花落叶言子楪苏世哲兰;)Landroidx/compose/ui/platform/飘花落叶言子苏楪哲兰世;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_0
    iget-object v1, v0, Landroidx/compose/ui/text/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:Ljava/util/ArrayList;

    .line 8
    .line 9
    new-instance v2, Landroidx/compose/ui/platform/飘花落叶言子苏楪哲兰世;

    .line 10
    .line 11
    if-nez v1, :cond_1

    .line 12
    .line 13
    sget-object v3, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    move-object v3, v1

    .line 17
    :goto_0
    iget-object v0, v0, Landroidx/compose/ui/text/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 18
    .line 19
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_2

    .line 24
    .line 25
    :goto_1
    move-object/from16 v16, v2

    .line 26
    .line 27
    goto/16 :goto_6

    .line 28
    .line 29
    :cond_2
    new-instance v3, Landroid/text/SpannableString;

    .line 30
    .line 31
    invoke-direct {v3, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 32
    .line 33
    .line 34
    new-instance v0, L飘花落叶言子楪兰世哲苏/飘花落叶言子楪世苏哲兰;

    .line 35
    .line 36
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    iput-object v4, v0, L飘花落叶言子楪兰世哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/os/Parcel;

    .line 44
    .line 45
    if-nez v1, :cond_3

    .line 46
    .line 47
    sget-object v1, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 48
    .line 49
    :cond_3
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    const/4 v6, 0x0

    .line 54
    :goto_2
    if-ge v6, v4, :cond_16

    .line 55
    .line 56
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v7

    .line 60
    check-cast v7, Landroidx/compose/ui/text/飘花落叶言子楪世兰苏哲;

    .line 61
    .line 62
    iget-object v8, v7, Landroidx/compose/ui/text/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v8, Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;

    .line 65
    .line 66
    iget v9, v7, Landroidx/compose/ui/text/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:I

    .line 67
    .line 68
    iget v7, v7, Landroidx/compose/ui/text/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰:I

    .line 69
    .line 70
    iget-object v10, v0, L飘花落叶言子楪兰世哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/os/Parcel;

    .line 71
    .line 72
    invoke-virtual {v10}, Landroid/os/Parcel;->recycle()V

    .line 73
    .line 74
    .line 75
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 76
    .line 77
    .line 78
    move-result-object v10

    .line 79
    iput-object v10, v0, L飘花落叶言子楪兰世哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/os/Parcel;

    .line 80
    .line 81
    iget-object v10, v8, Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言子苏哲楪兰世/飘花落叶言子楪哲世兰苏;

    .line 82
    .line 83
    iget-wide v11, v8, Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪苏兰哲世:J

    .line 84
    .line 85
    iget-wide v13, v8, Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪苏世兰哲:J

    .line 86
    .line 87
    move v15, v6

    .line 88
    iget-wide v5, v8, Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世苏兰哲:J

    .line 89
    .line 90
    move-object/from16 v17, v1

    .line 91
    .line 92
    move-object/from16 v16, v2

    .line 93
    .line 94
    invoke-interface {v10}, L飘花落叶言子苏哲楪兰世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲()J

    .line 95
    .line 96
    .line 97
    move-result-wide v1

    .line 98
    move-object v10, v3

    .line 99
    move/from16 v18, v4

    .line 100
    .line 101
    sget-wide v3, Landroidx/compose/ui/graphics/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏世兰哲:J

    .line 102
    .line 103
    invoke-static {v1, v2, v3, v4}, Landroidx/compose/ui/graphics/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世哲苏兰(JJ)Z

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    const/4 v2, 0x1

    .line 108
    if-nez v1, :cond_4

    .line 109
    .line 110
    invoke-virtual {v0, v2}, L飘花落叶言子楪兰世哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(B)V

    .line 111
    .line 112
    .line 113
    iget-object v1, v8, Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言子苏哲楪兰世/飘花落叶言子楪哲世兰苏;

    .line 114
    .line 115
    move-wide/from16 v19, v3

    .line 116
    .line 117
    invoke-interface {v1}, L飘花落叶言子苏哲楪兰世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲()J

    .line 118
    .line 119
    .line 120
    move-result-wide v2

    .line 121
    iget-object v1, v0, L飘花落叶言子楪兰世哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/os/Parcel;

    .line 122
    .line 123
    invoke-virtual {v1, v2, v3}, Landroid/os/Parcel;->writeLong(J)V

    .line 124
    .line 125
    .line 126
    goto :goto_3

    .line 127
    :cond_4
    move-wide/from16 v19, v3

    .line 128
    .line 129
    :goto_3
    sget-wide v1, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲苏兰:J

    .line 130
    .line 131
    invoke-static {v5, v6, v1, v2}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰(JJ)Z

    .line 132
    .line 133
    .line 134
    move-result v3

    .line 135
    const/4 v4, 0x2

    .line 136
    if-nez v3, :cond_5

    .line 137
    .line 138
    invoke-virtual {v0, v4}, L飘花落叶言子楪兰世哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(B)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v0, v5, v6}, L飘花落叶言子楪兰世哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲(J)V

    .line 142
    .line 143
    .line 144
    :cond_5
    iget-object v3, v8, Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世哲苏兰:Landroidx/compose/ui/text/font/飘花落叶言子楪哲兰苏世;

    .line 145
    .line 146
    const/4 v5, 0x3

    .line 147
    if-eqz v3, :cond_6

    .line 148
    .line 149
    invoke-virtual {v0, v5}, L飘花落叶言子楪兰世哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(B)V

    .line 150
    .line 151
    .line 152
    iget v3, v3, Landroidx/compose/ui/text/font/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲苏兰世:I

    .line 153
    .line 154
    iget-object v6, v0, L飘花落叶言子楪兰世哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/os/Parcel;

    .line 155
    .line 156
    invoke-virtual {v6, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 157
    .line 158
    .line 159
    :cond_6
    iget-object v3, v8, Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世哲兰苏:Landroidx/compose/ui/text/font/飘花落叶言子楪哲苏兰世;

    .line 160
    .line 161
    if-eqz v3, :cond_9

    .line 162
    .line 163
    iget v3, v3, Landroidx/compose/ui/text/font/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰:I

    .line 164
    .line 165
    const/4 v6, 0x4

    .line 166
    invoke-virtual {v0, v6}, L飘花落叶言子楪兰世哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(B)V

    .line 167
    .line 168
    .line 169
    if-nez v3, :cond_8

    .line 170
    .line 171
    :cond_7
    const/4 v3, 0x0

    .line 172
    goto :goto_4

    .line 173
    :cond_8
    const/4 v6, 0x1

    .line 174
    if-ne v3, v6, :cond_7

    .line 175
    .line 176
    const/4 v3, 0x1

    .line 177
    :goto_4
    invoke-virtual {v0, v3}, L飘花落叶言子楪兰世哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(B)V

    .line 178
    .line 179
    .line 180
    :cond_9
    iget-object v3, v8, Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世兰苏哲:Landroidx/compose/ui/text/font/飘花落叶言子楪哲兰世苏;

    .line 181
    .line 182
    if-eqz v3, :cond_e

    .line 183
    .line 184
    iget v3, v3, Landroidx/compose/ui/text/font/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:I

    .line 185
    .line 186
    const/4 v6, 0x5

    .line 187
    invoke-virtual {v0, v6}, L飘花落叶言子楪兰世哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(B)V

    .line 188
    .line 189
    .line 190
    if-nez v3, :cond_b

    .line 191
    .line 192
    :cond_a
    const/4 v4, 0x0

    .line 193
    goto :goto_5

    .line 194
    :cond_b
    const v6, 0xffff

    .line 195
    .line 196
    .line 197
    if-ne v3, v6, :cond_c

    .line 198
    .line 199
    const/4 v4, 0x1

    .line 200
    goto :goto_5

    .line 201
    :cond_c
    const/4 v6, 0x1

    .line 202
    if-ne v3, v6, :cond_d

    .line 203
    .line 204
    goto :goto_5

    .line 205
    :cond_d
    if-ne v3, v4, :cond_a

    .line 206
    .line 207
    move v4, v5

    .line 208
    :goto_5
    invoke-virtual {v0, v4}, L飘花落叶言子楪兰世哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(B)V

    .line 209
    .line 210
    .line 211
    :cond_e
    iget-object v3, v8, Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪苏世哲兰:Ljava/lang/String;

    .line 212
    .line 213
    if-eqz v3, :cond_f

    .line 214
    .line 215
    const/4 v4, 0x6

    .line 216
    invoke-virtual {v0, v4}, L飘花落叶言子楪兰世哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(B)V

    .line 217
    .line 218
    .line 219
    iget-object v4, v0, L飘花落叶言子楪兰世哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/os/Parcel;

    .line 220
    .line 221
    invoke-virtual {v4, v3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    :cond_f
    invoke-static {v13, v14, v1, v2}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰(JJ)Z

    .line 225
    .line 226
    .line 227
    move-result v1

    .line 228
    if-nez v1, :cond_10

    .line 229
    .line 230
    const/4 v1, 0x7

    .line 231
    invoke-virtual {v0, v1}, L飘花落叶言子楪兰世哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(B)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v0, v13, v14}, L飘花落叶言子楪兰世哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲(J)V

    .line 235
    .line 236
    .line 237
    :cond_10
    iget-object v1, v8, Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪苏哲世兰:L飘花落叶言子苏哲楪兰世/飘花落叶言子楪世苏哲兰;

    .line 238
    .line 239
    if-eqz v1, :cond_11

    .line 240
    .line 241
    iget v1, v1, L飘花落叶言子苏哲楪兰世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:F

    .line 242
    .line 243
    const/16 v2, 0x8

    .line 244
    .line 245
    invoke-virtual {v0, v2}, L飘花落叶言子楪兰世哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(B)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v0, v1}, L飘花落叶言子楪兰世哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏(F)V

    .line 249
    .line 250
    .line 251
    :cond_11
    iget-object v1, v8, Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪苏哲兰世:L飘花落叶言子苏哲楪兰世/飘花落叶言子楪哲苏世兰;

    .line 252
    .line 253
    if-eqz v1, :cond_12

    .line 254
    .line 255
    const/16 v2, 0x9

    .line 256
    .line 257
    invoke-virtual {v0, v2}, L飘花落叶言子楪兰世哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(B)V

    .line 258
    .line 259
    .line 260
    iget v2, v1, L飘花落叶言子苏哲楪兰世/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏哲兰:F

    .line 261
    .line 262
    invoke-virtual {v0, v2}, L飘花落叶言子楪兰世哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏(F)V

    .line 263
    .line 264
    .line 265
    iget v1, v1, L飘花落叶言子苏哲楪兰世/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏兰哲:F

    .line 266
    .line 267
    invoke-virtual {v0, v1}, L飘花落叶言子楪兰世哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏(F)V

    .line 268
    .line 269
    .line 270
    :cond_12
    move-wide/from16 v1, v19

    .line 271
    .line 272
    invoke-static {v11, v12, v1, v2}, Landroidx/compose/ui/graphics/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世哲苏兰(JJ)Z

    .line 273
    .line 274
    .line 275
    move-result v1

    .line 276
    if-nez v1, :cond_13

    .line 277
    .line 278
    const/16 v1, 0xa

    .line 279
    .line 280
    invoke-virtual {v0, v1}, L飘花落叶言子楪兰世哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(B)V

    .line 281
    .line 282
    .line 283
    iget-object v1, v0, L飘花落叶言子楪兰世哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/os/Parcel;

    .line 284
    .line 285
    invoke-virtual {v1, v11, v12}, Landroid/os/Parcel;->writeLong(J)V

    .line 286
    .line 287
    .line 288
    :cond_13
    iget-object v1, v8, Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪哲世苏兰:L飘花落叶言子苏哲楪兰世/飘花落叶言子楪苏兰世哲;

    .line 289
    .line 290
    if-eqz v1, :cond_14

    .line 291
    .line 292
    const/16 v2, 0xb

    .line 293
    .line 294
    invoke-virtual {v0, v2}, L飘花落叶言子楪兰世哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(B)V

    .line 295
    .line 296
    .line 297
    iget v1, v1, L飘花落叶言子苏哲楪兰世/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:I

    .line 298
    .line 299
    iget-object v2, v0, L飘花落叶言子楪兰世哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/os/Parcel;

    .line 300
    .line 301
    invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 302
    .line 303
    .line 304
    :cond_14
    iget-object v1, v8, Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪哲世兰苏:Landroidx/compose/ui/graphics/飘花落叶言子世兰楪苏哲;

    .line 305
    .line 306
    if-eqz v1, :cond_15

    .line 307
    .line 308
    const/16 v2, 0xc

    .line 309
    .line 310
    invoke-virtual {v0, v2}, L飘花落叶言子楪兰世哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(B)V

    .line 311
    .line 312
    .line 313
    iget-wide v2, v1, Landroidx/compose/ui/graphics/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪世苏哲兰:J

    .line 314
    .line 315
    iget-object v4, v0, L飘花落叶言子楪兰世哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/os/Parcel;

    .line 316
    .line 317
    invoke-virtual {v4, v2, v3}, Landroid/os/Parcel;->writeLong(J)V

    .line 318
    .line 319
    .line 320
    iget-wide v2, v1, Landroidx/compose/ui/graphics/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪世苏兰哲:J

    .line 321
    .line 322
    const/16 v4, 0x20

    .line 323
    .line 324
    shr-long v4, v2, v4

    .line 325
    .line 326
    long-to-int v4, v4

    .line 327
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 328
    .line 329
    .line 330
    move-result v4

    .line 331
    invoke-virtual {v0, v4}, L飘花落叶言子楪兰世哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏(F)V

    .line 332
    .line 333
    .line 334
    const-wide v4, 0xffffffffL

    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    and-long/2addr v2, v4

    .line 340
    long-to-int v2, v2

    .line 341
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 342
    .line 343
    .line 344
    move-result v2

    .line 345
    invoke-virtual {v0, v2}, L飘花落叶言子楪兰世哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏(F)V

    .line 346
    .line 347
    .line 348
    iget v1, v1, Landroidx/compose/ui/graphics/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪世哲苏兰:F

    .line 349
    .line 350
    invoke-virtual {v0, v1}, L飘花落叶言子楪兰世哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏(F)V

    .line 351
    .line 352
    .line 353
    :cond_15
    new-instance v1, Landroid/text/Annotation;

    .line 354
    .line 355
    iget-object v2, v0, L飘花落叶言子楪兰世哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/os/Parcel;

    .line 356
    .line 357
    invoke-virtual {v2}, Landroid/os/Parcel;->marshall()[B

    .line 358
    .line 359
    .line 360
    move-result-object v2

    .line 361
    const/4 v3, 0x0

    .line 362
    invoke-static {v2, v3}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object v2

    .line 366
    const-string v4, "androidx.compose.text.SpanStyle"

    .line 367
    .line 368
    invoke-direct {v1, v4, v2}, Landroid/text/Annotation;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 369
    .line 370
    .line 371
    const/16 v2, 0x21

    .line 372
    .line 373
    invoke-virtual {v10, v1, v9, v7, v2}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 374
    .line 375
    .line 376
    add-int/lit8 v6, v15, 0x1

    .line 377
    .line 378
    move-object v3, v10

    .line 379
    move-object/from16 v2, v16

    .line 380
    .line 381
    move-object/from16 v1, v17

    .line 382
    .line 383
    move/from16 v4, v18

    .line 384
    .line 385
    goto/16 :goto_2

    .line 386
    .line 387
    :cond_16
    move-object v10, v3

    .line 388
    move-object v0, v10

    .line 389
    goto/16 :goto_1

    .line 390
    .line 391
    :goto_6
    const-string v1, "plain text"

    .line 392
    .line 393
    invoke-static {v1, v0}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    .line 394
    .line 395
    .line 396
    move-result-object v0

    .line 397
    move-object/from16 v1, v16

    .line 398
    .line 399
    invoke-direct {v1, v0}, Landroidx/compose/ui/platform/飘花落叶言子苏楪哲兰世;-><init>(Landroid/content/ClipData;)V

    .line 400
    .line 401
    .line 402
    return-object v1
.end method
