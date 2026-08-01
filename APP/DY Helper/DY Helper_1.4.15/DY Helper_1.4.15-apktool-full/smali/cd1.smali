.class public final synthetic Lcd1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:I

.field public final synthetic η:Ljava/lang/Object;

.field public final synthetic θ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lbl1;ILu11;)V
    .locals 1

    .line 14
    const/4 v0, 0x1

    iput v0, p0, Lcd1;->ε:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcd1;->η:Ljava/lang/Object;

    iput p2, p0, Lcd1;->ζ:I

    iput-object p3, p0, Lcd1;->θ:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ldc1;Ldc1;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcd1;->ε:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lcd1;->η:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lcd1;->θ:Ljava/lang/Object;

    .line 10
    .line 11
    iput p3, p0, Lcd1;->ζ:I

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lcd1;->ε:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Lcd1;->η:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lbl1;

    .line 11
    .line 12
    iget-object v2, v0, Lcd1;->θ:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Lu11;

    .line 15
    .line 16
    move-object/from16 v3, p1

    .line 17
    .line 18
    check-cast v3, Ltn;

    .line 19
    .line 20
    iget v4, v1, Lbl1;->ε:I

    .line 21
    .line 22
    iget v0, v0, Lcd1;->ζ:I

    .line 23
    .line 24
    if-ne v4, v0, :cond_8

    .line 25
    .line 26
    iget-object v4, v1, Lbl1;->ζ:Lu11;

    .line 27
    .line 28
    invoke-static {v2, v4}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-eqz v4, :cond_8

    .line 33
    .line 34
    instance-of v4, v3, Lzn;

    .line 35
    .line 36
    if-eqz v4, :cond_8

    .line 37
    .line 38
    iget-object v4, v2, Lu11;->α:[J

    .line 39
    .line 40
    array-length v5, v4

    .line 41
    add-int/lit8 v5, v5, -0x2

    .line 42
    .line 43
    if-ltz v5, :cond_8

    .line 44
    .line 45
    const/4 v7, 0x0

    .line 46
    :goto_0
    aget-wide v8, v4, v7

    .line 47
    .line 48
    not-long v10, v8

    .line 49
    const/4 v12, 0x7

    .line 50
    shl-long/2addr v10, v12

    .line 51
    and-long/2addr v10, v8

    .line 52
    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    and-long/2addr v10, v12

    .line 58
    cmp-long v10, v10, v12

    .line 59
    .line 60
    if-eqz v10, :cond_7

    .line 61
    .line 62
    sub-int v10, v7, v5

    .line 63
    .line 64
    not-int v10, v10

    .line 65
    ushr-int/lit8 v10, v10, 0x1f

    .line 66
    .line 67
    const/16 v11, 0x8

    .line 68
    .line 69
    rsub-int/lit8 v10, v10, 0x8

    .line 70
    .line 71
    const/4 v12, 0x0

    .line 72
    :goto_1
    if-ge v12, v10, :cond_6

    .line 73
    .line 74
    const-wide/16 v13, 0xff

    .line 75
    .line 76
    and-long/2addr v13, v8

    .line 77
    const-wide/16 v15, 0x80

    .line 78
    .line 79
    cmp-long v13, v13, v15

    .line 80
    .line 81
    if-gez v13, :cond_4

    .line 82
    .line 83
    shl-int/lit8 v13, v7, 0x3

    .line 84
    .line 85
    add-int/2addr v13, v12

    .line 86
    iget-object v14, v2, Lu11;->β:[Ljava/lang/Object;

    .line 87
    .line 88
    aget-object v14, v14, v13

    .line 89
    .line 90
    iget-object v15, v2, Lu11;->γ:[I

    .line 91
    .line 92
    aget v15, v15, v13

    .line 93
    .line 94
    if-eq v15, v0, :cond_0

    .line 95
    .line 96
    const/4 v15, 0x1

    .line 97
    goto :goto_2

    .line 98
    :cond_0
    const/4 v15, 0x0

    .line 99
    :goto_2
    if-eqz v15, :cond_2

    .line 100
    .line 101
    move-object v6, v3

    .line 102
    check-cast v6, Lzn;

    .line 103
    .line 104
    move/from16 p1, v11

    .line 105
    .line 106
    iget-object v11, v6, Lzn;->λ:Lb21;

    .line 107
    .line 108
    invoke-static {v11, v14, v1}, Li81;->χ(Lb21;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move/from16 v16, v0

    .line 112
    .line 113
    instance-of v0, v14, Lfs;

    .line 114
    .line 115
    if-eqz v0, :cond_3

    .line 116
    .line 117
    move-object v0, v14

    .line 118
    check-cast v0, Lfs;

    .line 119
    .line 120
    invoke-virtual {v11, v0}, Lb21;->γ(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v11

    .line 124
    if-nez v11, :cond_1

    .line 125
    .line 126
    iget-object v6, v6, Lzn;->ξ:Lb21;

    .line 127
    .line 128
    invoke-static {v6, v0}, Li81;->ψ(Lb21;Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    :cond_1
    iget-object v0, v1, Lbl1;->η:Lb21;

    .line 132
    .line 133
    if-eqz v0, :cond_3

    .line 134
    .line 135
    invoke-virtual {v0, v14}, Lb21;->λ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    goto :goto_3

    .line 139
    :cond_2
    move/from16 v16, v0

    .line 140
    .line 141
    move/from16 p1, v11

    .line 142
    .line 143
    :cond_3
    :goto_3
    if-eqz v15, :cond_5

    .line 144
    .line 145
    invoke-virtual {v2, v13}, Lu11;->ε(I)V

    .line 146
    .line 147
    .line 148
    goto :goto_4

    .line 149
    :cond_4
    move/from16 v16, v0

    .line 150
    .line 151
    move/from16 p1, v11

    .line 152
    .line 153
    :cond_5
    :goto_4
    shr-long v8, v8, p1

    .line 154
    .line 155
    add-int/lit8 v12, v12, 0x1

    .line 156
    .line 157
    move/from16 v11, p1

    .line 158
    .line 159
    move/from16 v0, v16

    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_6
    move/from16 v16, v0

    .line 163
    .line 164
    move v0, v11

    .line 165
    if-ne v10, v0, :cond_8

    .line 166
    .line 167
    goto :goto_5

    .line 168
    :cond_7
    move/from16 v16, v0

    .line 169
    .line 170
    :goto_5
    if-eq v7, v5, :cond_8

    .line 171
    .line 172
    add-int/lit8 v7, v7, 0x1

    .line 173
    .line 174
    move/from16 v0, v16

    .line 175
    .line 176
    goto/16 :goto_0

    .line 177
    .line 178
    :cond_8
    sget-object v0, Ls62;->α:Ls62;

    .line 179
    .line 180
    return-object v0

    .line 181
    :pswitch_0
    iget-object v1, v0, Lcd1;->η:Ljava/lang/Object;

    .line 182
    .line 183
    check-cast v1, Ldc1;

    .line 184
    .line 185
    iget-object v2, v0, Lcd1;->θ:Ljava/lang/Object;

    .line 186
    .line 187
    check-cast v2, Ldc1;

    .line 188
    .line 189
    move-object/from16 v3, p1

    .line 190
    .line 191
    check-cast v3, Lbe1;

    .line 192
    .line 193
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 197
    .line 198
    .line 199
    move-result v3

    .line 200
    if-eqz v3, :cond_d

    .line 201
    .line 202
    const/4 v1, 0x1

    .line 203
    const-string v4, " \u5757"

    .line 204
    .line 205
    if-eq v3, v1, :cond_c

    .line 206
    .line 207
    const/4 v1, 0x2

    .line 208
    if-eq v3, v1, :cond_b

    .line 209
    .line 210
    const/4 v1, 0x3

    .line 211
    if-eq v3, v1, :cond_a

    .line 212
    .line 213
    const/4 v1, 0x4

    .line 214
    if-ne v3, v1, :cond_9

    .line 215
    .line 216
    const-string v1, "\u5931\u8d25 "

    .line 217
    .line 218
    const-string v2, " \u9879"

    .line 219
    .line 220
    iget v0, v0, Lcd1;->ζ:I

    .line 221
    .line 222
    :goto_6
    invoke-static {v1, v0, v2}, Lnx;->ζ(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    goto :goto_8

    .line 227
    :cond_9
    invoke-static {}, Lγ;->κ()V

    .line 228
    .line 229
    .line 230
    const/4 v0, 0x0

    .line 231
    goto :goto_8

    .line 232
    :cond_a
    iget v0, v2, Ldc1;->ε:I

    .line 233
    .line 234
    const-string v1, "\u6d47\u6c34 "

    .line 235
    .line 236
    :goto_7
    invoke-static {v1, v0, v4}, Lnx;->ζ(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    goto :goto_8

    .line 241
    :cond_b
    iget v0, v2, Ldc1;->δ:I

    .line 242
    .line 243
    const-string v1, "\u79cd\u5730 "

    .line 244
    .line 245
    goto :goto_7

    .line 246
    :cond_c
    iget v0, v2, Ldc1;->γ:I

    .line 247
    .line 248
    const-string v1, "\u6536\u83dc "

    .line 249
    .line 250
    goto :goto_7

    .line 251
    :cond_d
    iget v0, v1, Ldc1;->α:I

    .line 252
    .line 253
    const-string v1, "\u5237\u65b0 "

    .line 254
    .line 255
    const-string v2, " \u4e2a\u8425\u5730"

    .line 256
    .line 257
    goto :goto_6

    .line 258
    :goto_8
    return-object v0

    .line 259
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
