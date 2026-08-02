.class public final synthetic Lnh;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lnn0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Lkx1;


# direct methods
.method public synthetic constructor <init>(Lkx1;I)V
    .locals 0

    .line 1
    iput p2, p0, Lnh;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Lnh;->i:Lkx1;

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
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lnh;->h:I

    .line 4
    .line 5
    sget-object v2, La83;->a:La83;

    .line 6
    .line 7
    sget-object v3, Lnx;->a:Leb;

    .line 8
    .line 9
    const/high16 v4, 0x41400000    # 12.0f

    .line 10
    .line 11
    sget-object v5, Lrh1;->a:Lrh1;

    .line 12
    .line 13
    const/16 v6, 0x10

    .line 14
    .line 15
    const/4 v7, 0x0

    .line 16
    const/4 v8, 0x1

    .line 17
    iget-object v0, v0, Lnh;->i:Lkx1;

    .line 18
    .line 19
    packed-switch v1, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    move-object/from16 v1, p1

    .line 23
    .line 24
    check-cast v1, Lbv;

    .line 25
    .line 26
    move-object/from16 v9, p2

    .line 27
    .line 28
    check-cast v9, Lpx;

    .line 29
    .line 30
    move-object/from16 v10, p3

    .line 31
    .line 32
    check-cast v10, Ljava/lang/Integer;

    .line 33
    .line 34
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 35
    .line 36
    .line 37
    move-result v10

    .line 38
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    and-int/lit8 v1, v10, 0x11

    .line 42
    .line 43
    if-eq v1, v6, :cond_0

    .line 44
    .line 45
    move v1, v8

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    move v1, v7

    .line 48
    :goto_0
    and-int/lit8 v6, v10, 0x1

    .line 49
    .line 50
    move-object v15, v9

    .line 51
    check-cast v15, Lgo0;

    .line 52
    .line 53
    invoke-virtual {v15, v6, v1}, Lgo0;->O(IZ)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_2

    .line 58
    .line 59
    const v1, 0x790b0235

    .line 60
    .line 61
    .line 62
    invoke-static {v1, v15}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-static {v1, v15, v7}, Lse;->l(Ljava/lang/String;Lpx;I)V

    .line 67
    .line 68
    .line 69
    const v1, 0x790b0239

    .line 70
    .line 71
    .line 72
    invoke-static {v5, v4, v15, v1, v15}, Lvi0;->f(Lrh1;FLgo0;ILgo0;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v10

    .line 76
    invoke-virtual {v15}, Lgo0;->L()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    if-ne v1, v3, :cond_1

    .line 81
    .line 82
    new-instance v1, Lq0;

    .line 83
    .line 84
    const/4 v3, 0x6

    .line 85
    invoke-direct {v1, v0, v3}, Lq0;-><init>(Lkx1;I)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v15, v1}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    :cond_1
    move-object v11, v1

    .line 92
    check-cast v11, Lxm0;

    .line 93
    .line 94
    const/16 v16, 0x30

    .line 95
    .line 96
    const/16 v17, 0x3c

    .line 97
    .line 98
    const/4 v12, 0x0

    .line 99
    const/4 v13, 0x0

    .line 100
    const/4 v14, 0x0

    .line 101
    invoke-static/range {v10 .. v17}, Lse;->r(Ljava/lang/String;Lxm0;Luh1;ZILpx;II)V

    .line 102
    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_2
    invoke-virtual {v15}, Lgo0;->R()V

    .line 106
    .line 107
    .line 108
    :goto_1
    return-object v2

    .line 109
    :pswitch_0
    move-object/from16 v1, p1

    .line 110
    .line 111
    check-cast v1, Lbv;

    .line 112
    .line 113
    move-object/from16 v9, p2

    .line 114
    .line 115
    check-cast v9, Lpx;

    .line 116
    .line 117
    move-object/from16 v10, p3

    .line 118
    .line 119
    check-cast v10, Ljava/lang/Integer;

    .line 120
    .line 121
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 122
    .line 123
    .line 124
    move-result v10

    .line 125
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    and-int/lit8 v1, v10, 0x11

    .line 129
    .line 130
    if-eq v1, v6, :cond_3

    .line 131
    .line 132
    move v1, v8

    .line 133
    goto :goto_2

    .line 134
    :cond_3
    move v1, v7

    .line 135
    :goto_2
    and-int/lit8 v6, v10, 0x1

    .line 136
    .line 137
    move-object v15, v9

    .line 138
    check-cast v15, Lgo0;

    .line 139
    .line 140
    invoke-virtual {v15, v6, v1}, Lgo0;->O(IZ)Z

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    if-eqz v1, :cond_5

    .line 145
    .line 146
    const v1, 0x790b0085

    .line 147
    .line 148
    .line 149
    invoke-static {v1, v15}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    invoke-static {v1, v15, v7}, Lt11;->i(Ljava/lang/String;Lpx;I)V

    .line 154
    .line 155
    .line 156
    const v1, 0x790b008a

    .line 157
    .line 158
    .line 159
    invoke-static {v5, v4, v15, v1, v15}, Lvi0;->f(Lrh1;FLgo0;ILgo0;)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v10

    .line 163
    invoke-virtual {v15}, Lgo0;->L()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    if-ne v1, v3, :cond_4

    .line 168
    .line 169
    new-instance v1, Lq0;

    .line 170
    .line 171
    const/4 v3, 0x4

    .line 172
    invoke-direct {v1, v0, v3}, Lq0;-><init>(Lkx1;I)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v15, v1}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    :cond_4
    move-object v11, v1

    .line 179
    check-cast v11, Lxm0;

    .line 180
    .line 181
    const/16 v16, 0x30

    .line 182
    .line 183
    const/16 v17, 0x3c

    .line 184
    .line 185
    const/4 v12, 0x0

    .line 186
    const/4 v13, 0x0

    .line 187
    const/4 v14, 0x0

    .line 188
    invoke-static/range {v10 .. v17}, Lse;->r(Ljava/lang/String;Lxm0;Luh1;ZILpx;II)V

    .line 189
    .line 190
    .line 191
    goto :goto_3

    .line 192
    :cond_5
    invoke-virtual {v15}, Lgo0;->R()V

    .line 193
    .line 194
    .line 195
    :goto_3
    return-object v2

    .line 196
    :pswitch_1
    move-object/from16 v1, p1

    .line 197
    .line 198
    check-cast v1, Lbv;

    .line 199
    .line 200
    move-object/from16 v9, p2

    .line 201
    .line 202
    check-cast v9, Lpx;

    .line 203
    .line 204
    move-object/from16 v10, p3

    .line 205
    .line 206
    check-cast v10, Ljava/lang/Integer;

    .line 207
    .line 208
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 209
    .line 210
    .line 211
    move-result v10

    .line 212
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    and-int/lit8 v1, v10, 0x11

    .line 216
    .line 217
    if-eq v1, v6, :cond_6

    .line 218
    .line 219
    move v1, v8

    .line 220
    goto :goto_4

    .line 221
    :cond_6
    move v1, v7

    .line 222
    :goto_4
    and-int/lit8 v6, v10, 0x1

    .line 223
    .line 224
    move-object v15, v9

    .line 225
    check-cast v15, Lgo0;

    .line 226
    .line 227
    invoke-virtual {v15, v6, v1}, Lgo0;->O(IZ)Z

    .line 228
    .line 229
    .line 230
    move-result v1

    .line 231
    if-eqz v1, :cond_8

    .line 232
    .line 233
    const v1, 0x790b005f

    .line 234
    .line 235
    .line 236
    invoke-static {v1, v15}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v1

    .line 240
    invoke-static {v1, v15, v7}, Ls11;->e(Ljava/lang/String;Lpx;I)V

    .line 241
    .line 242
    .line 243
    const v1, 0x790b0068

    .line 244
    .line 245
    .line 246
    invoke-static {v5, v4, v15, v1, v15}, Lvi0;->f(Lrh1;FLgo0;ILgo0;)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v10

    .line 250
    invoke-virtual {v15}, Lgo0;->L()Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v1

    .line 254
    if-ne v1, v3, :cond_7

    .line 255
    .line 256
    new-instance v1, Lq0;

    .line 257
    .line 258
    const/4 v3, 0x3

    .line 259
    invoke-direct {v1, v0, v3}, Lq0;-><init>(Lkx1;I)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v15, v1}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 263
    .line 264
    .line 265
    :cond_7
    move-object v11, v1

    .line 266
    check-cast v11, Lxm0;

    .line 267
    .line 268
    const/16 v16, 0x30

    .line 269
    .line 270
    const/16 v17, 0x3c

    .line 271
    .line 272
    const/4 v12, 0x0

    .line 273
    const/4 v13, 0x0

    .line 274
    const/4 v14, 0x0

    .line 275
    invoke-static/range {v10 .. v17}, Lse;->r(Ljava/lang/String;Lxm0;Luh1;ZILpx;II)V

    .line 276
    .line 277
    .line 278
    goto :goto_5

    .line 279
    :cond_8
    invoke-virtual {v15}, Lgo0;->R()V

    .line 280
    .line 281
    .line 282
    :goto_5
    return-object v2

    .line 283
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
