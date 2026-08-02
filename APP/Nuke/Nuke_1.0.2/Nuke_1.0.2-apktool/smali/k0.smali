.class public final synthetic Lk0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lnn0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Lxm0;


# direct methods
.method public synthetic constructor <init>(Lxm0;I)V
    .locals 0

    .line 1
    iput p2, p0, Lk0;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Lk0;->i:Lxm0;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lk0;->h:I

    .line 4
    .line 5
    sget-object v2, La83;->a:La83;

    .line 6
    .line 7
    const/16 v3, 0x12

    .line 8
    .line 9
    const/4 v4, 0x2

    .line 10
    const/4 v5, 0x4

    .line 11
    const/4 v6, 0x1

    .line 12
    const/4 v7, 0x0

    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    move-object/from16 v1, p1

    .line 17
    .line 18
    check-cast v1, Lpb2;

    .line 19
    .line 20
    move-object/from16 v8, p2

    .line 21
    .line 22
    check-cast v8, Lpx;

    .line 23
    .line 24
    move-object/from16 v9, p3

    .line 25
    .line 26
    check-cast v9, Ljava/lang/Integer;

    .line 27
    .line 28
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 29
    .line 30
    .line 31
    move-result v9

    .line 32
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    and-int/lit8 v10, v9, 0x6

    .line 36
    .line 37
    if-nez v10, :cond_1

    .line 38
    .line 39
    move-object v10, v8

    .line 40
    check-cast v10, Lgo0;

    .line 41
    .line 42
    invoke-virtual {v10, v1}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v10

    .line 46
    if-eqz v10, :cond_0

    .line 47
    .line 48
    move v4, v5

    .line 49
    :cond_0
    or-int/2addr v9, v4

    .line 50
    :cond_1
    and-int/lit8 v4, v9, 0x13

    .line 51
    .line 52
    if-eq v4, v3, :cond_2

    .line 53
    .line 54
    move v7, v6

    .line 55
    :cond_2
    and-int/lit8 v3, v9, 0x1

    .line 56
    .line 57
    move-object v14, v8

    .line 58
    check-cast v14, Lgo0;

    .line 59
    .line 60
    invoke-virtual {v14, v3, v7}, Lgo0;->O(IZ)Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-eqz v3, :cond_3

    .line 65
    .line 66
    const v3, 0x790b0100

    .line 67
    .line 68
    .line 69
    invoke-static {v3, v14}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v9

    .line 73
    invoke-static {v1}, Lpb2;->a(Lpb2;)Luh1;

    .line 74
    .line 75
    .line 76
    move-result-object v11

    .line 77
    const/4 v15, 0x0

    .line 78
    const/16 v16, 0x38

    .line 79
    .line 80
    iget-object v10, v0, Lk0;->i:Lxm0;

    .line 81
    .line 82
    const/4 v12, 0x0

    .line 83
    const/4 v13, 0x0

    .line 84
    invoke-static/range {v9 .. v16}, Lse;->q(Ljava/lang/String;Lxm0;Luh1;ZILpx;II)V

    .line 85
    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_3
    invoke-virtual {v14}, Lgo0;->R()V

    .line 89
    .line 90
    .line 91
    :goto_0
    return-object v2

    .line 92
    :pswitch_0
    move-object/from16 v1, p1

    .line 93
    .line 94
    check-cast v1, Lxm0;

    .line 95
    .line 96
    move-object/from16 v8, p2

    .line 97
    .line 98
    check-cast v8, Lpx;

    .line 99
    .line 100
    move-object/from16 v9, p3

    .line 101
    .line 102
    check-cast v9, Ljava/lang/Integer;

    .line 103
    .line 104
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 105
    .line 106
    .line 107
    move-result v9

    .line 108
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    and-int/lit8 v10, v9, 0x6

    .line 112
    .line 113
    if-nez v10, :cond_5

    .line 114
    .line 115
    move-object v10, v8

    .line 116
    check-cast v10, Lgo0;

    .line 117
    .line 118
    invoke-virtual {v10, v1}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v10

    .line 122
    if-eqz v10, :cond_4

    .line 123
    .line 124
    move v4, v5

    .line 125
    :cond_4
    or-int/2addr v9, v4

    .line 126
    :cond_5
    and-int/lit8 v4, v9, 0x13

    .line 127
    .line 128
    if-eq v4, v3, :cond_6

    .line 129
    .line 130
    move v3, v6

    .line 131
    goto :goto_1

    .line 132
    :cond_6
    move v3, v7

    .line 133
    :goto_1
    and-int/lit8 v4, v9, 0x1

    .line 134
    .line 135
    check-cast v8, Lgo0;

    .line 136
    .line 137
    invoke-virtual {v8, v4, v3}, Lgo0;->O(IZ)Z

    .line 138
    .line 139
    .line 140
    move-result v3

    .line 141
    if-eqz v3, :cond_b

    .line 142
    .line 143
    sget-object v3, Lx30;->d:Lx30;

    .line 144
    .line 145
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    invoke-static {}, Lpp1;->c()Lop1;

    .line 149
    .line 150
    .line 151
    move-result-object v3

    .line 152
    const-string v4, "CustomInputHint/text"

    .line 153
    .line 154
    invoke-virtual {v3, v4}, Lop1;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    if-nez v3, :cond_7

    .line 159
    .line 160
    const-string v3, ""

    .line 161
    .line 162
    :cond_7
    iget-object v0, v0, Lk0;->i:Lxm0;

    .line 163
    .line 164
    invoke-virtual {v8, v0}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v4

    .line 168
    and-int/lit8 v10, v9, 0xe

    .line 169
    .line 170
    if-ne v10, v5, :cond_8

    .line 171
    .line 172
    goto :goto_2

    .line 173
    :cond_8
    move v6, v7

    .line 174
    :goto_2
    or-int/2addr v4, v6

    .line 175
    invoke-virtual {v8}, Lgo0;->L()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v5

    .line 179
    if-nez v4, :cond_9

    .line 180
    .line 181
    sget-object v4, Lnx;->a:Leb;

    .line 182
    .line 183
    if-ne v5, v4, :cond_a

    .line 184
    .line 185
    :cond_9
    new-instance v5, Lz;

    .line 186
    .line 187
    const/4 v4, 0x6

    .line 188
    invoke-direct {v5, v0, v1, v4}, Lz;-><init>(Lxm0;Lxm0;I)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v8, v5}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    :cond_a
    check-cast v5, Lin0;

    .line 195
    .line 196
    shl-int/lit8 v0, v9, 0x3

    .line 197
    .line 198
    and-int/lit8 v0, v0, 0x70

    .line 199
    .line 200
    invoke-static {v3, v1, v5, v8, v0}, Lci0;->c(Ljava/lang/String;Lxm0;Lin0;Lpx;I)V

    .line 201
    .line 202
    .line 203
    goto :goto_3

    .line 204
    :cond_b
    invoke-virtual {v8}, Lgo0;->R()V

    .line 205
    .line 206
    .line 207
    :goto_3
    return-object v2

    .line 208
    :pswitch_1
    move-object/from16 v1, p1

    .line 209
    .line 210
    check-cast v1, Lpb2;

    .line 211
    .line 212
    move-object/from16 v8, p2

    .line 213
    .line 214
    check-cast v8, Lpx;

    .line 215
    .line 216
    move-object/from16 v9, p3

    .line 217
    .line 218
    check-cast v9, Ljava/lang/Integer;

    .line 219
    .line 220
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 221
    .line 222
    .line 223
    move-result v9

    .line 224
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    and-int/lit8 v10, v9, 0x6

    .line 228
    .line 229
    if-nez v10, :cond_d

    .line 230
    .line 231
    move-object v10, v8

    .line 232
    check-cast v10, Lgo0;

    .line 233
    .line 234
    invoke-virtual {v10, v1}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    move-result v10

    .line 238
    if-eqz v10, :cond_c

    .line 239
    .line 240
    move v4, v5

    .line 241
    :cond_c
    or-int/2addr v9, v4

    .line 242
    :cond_d
    and-int/lit8 v4, v9, 0x13

    .line 243
    .line 244
    if-eq v4, v3, :cond_e

    .line 245
    .line 246
    move v7, v6

    .line 247
    :cond_e
    and-int/lit8 v3, v9, 0x1

    .line 248
    .line 249
    move-object v14, v8

    .line 250
    check-cast v14, Lgo0;

    .line 251
    .line 252
    invoke-virtual {v14, v3, v7}, Lgo0;->O(IZ)Z

    .line 253
    .line 254
    .line 255
    move-result v3

    .line 256
    if-eqz v3, :cond_f

    .line 257
    .line 258
    const v3, 0x790b0111

    .line 259
    .line 260
    .line 261
    invoke-static {v3, v14}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v9

    .line 265
    invoke-static {v1}, Lpb2;->a(Lpb2;)Luh1;

    .line 266
    .line 267
    .line 268
    move-result-object v11

    .line 269
    const/4 v15, 0x0

    .line 270
    const/16 v16, 0x38

    .line 271
    .line 272
    iget-object v10, v0, Lk0;->i:Lxm0;

    .line 273
    .line 274
    const/4 v12, 0x0

    .line 275
    const/4 v13, 0x0

    .line 276
    invoke-static/range {v9 .. v16}, Lse;->r(Ljava/lang/String;Lxm0;Luh1;ZILpx;II)V

    .line 277
    .line 278
    .line 279
    goto :goto_4

    .line 280
    :cond_f
    invoke-virtual {v14}, Lgo0;->R()V

    .line 281
    .line 282
    .line 283
    :goto_4
    return-object v2

    .line 284
    nop

    .line 285
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
