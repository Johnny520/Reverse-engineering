.class public final synthetic Lsr;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Lin0;

.field public final synthetic j:Z


# direct methods
.method public synthetic constructor <init>(ILin0;Z)V
    .locals 0

    .line 12
    iput p1, p0, Lsr;->h:I

    iput-boolean p3, p0, Lsr;->j:Z

    iput-object p2, p0, Lsr;->i:Lin0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lin0;Z)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lsr;->h:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lsr;->i:Lin0;

    .line 8
    .line 9
    iput-boolean p2, p0, Lsr;->j:Z

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lsr;->h:I

    .line 4
    .line 5
    sget-object v2, La83;->a:La83;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    const/4 v5, 0x2

    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    move-object/from16 v1, p1

    .line 14
    .line 15
    check-cast v1, Lpx;

    .line 16
    .line 17
    move-object/from16 v6, p2

    .line 18
    .line 19
    check-cast v6, Ljava/lang/Integer;

    .line 20
    .line 21
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 22
    .line 23
    .line 24
    move-result v6

    .line 25
    and-int/lit8 v7, v6, 0x3

    .line 26
    .line 27
    if-eq v7, v5, :cond_0

    .line 28
    .line 29
    move v3, v4

    .line 30
    :cond_0
    and-int/2addr v4, v6

    .line 31
    move-object v10, v1

    .line 32
    check-cast v10, Lgo0;

    .line 33
    .line 34
    invoke-virtual {v10, v4, v3}, Lgo0;->O(IZ)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_1

    .line 39
    .line 40
    const/4 v11, 0x0

    .line 41
    const/16 v12, 0x3c

    .line 42
    .line 43
    iget-boolean v5, v0, Lsr;->j:Z

    .line 44
    .line 45
    iget-object v6, v0, Lsr;->i:Lin0;

    .line 46
    .line 47
    const/4 v7, 0x0

    .line 48
    const/4 v8, 0x0

    .line 49
    const/4 v9, 0x0

    .line 50
    invoke-static/range {v5 .. v12}, Lsp0;->i(ZLin0;Luh1;ZILpx;II)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    invoke-virtual {v10}, Lgo0;->R()V

    .line 55
    .line 56
    .line 57
    :goto_0
    return-object v2

    .line 58
    :pswitch_0
    move-object/from16 v1, p1

    .line 59
    .line 60
    check-cast v1, Lpx;

    .line 61
    .line 62
    move-object/from16 v6, p2

    .line 63
    .line 64
    check-cast v6, Ljava/lang/Integer;

    .line 65
    .line 66
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    and-int/lit8 v7, v6, 0x3

    .line 71
    .line 72
    if-eq v7, v5, :cond_2

    .line 73
    .line 74
    move v3, v4

    .line 75
    :cond_2
    and-int/2addr v4, v6

    .line 76
    move-object v15, v1

    .line 77
    check-cast v15, Lgo0;

    .line 78
    .line 79
    invoke-virtual {v15, v4, v3}, Lgo0;->O(IZ)Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-eqz v1, :cond_5

    .line 84
    .line 85
    const v1, 0x790b0147

    .line 86
    .line 87
    .line 88
    invoke-static {v1, v15}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    const v1, 0x790b0148

    .line 93
    .line 94
    .line 95
    invoke-static {v1, v15}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v8

    .line 99
    sget-object v9, Lsp0;->d:Lkw;

    .line 100
    .line 101
    new-instance v1, Lsr;

    .line 102
    .line 103
    iget-object v3, v0, Lsr;->i:Lin0;

    .line 104
    .line 105
    iget-boolean v0, v0, Lsr;->j:Z

    .line 106
    .line 107
    invoke-direct {v1, v5, v3, v0}, Lsr;-><init>(ILin0;Z)V

    .line 108
    .line 109
    .line 110
    const v4, 0x3237db80

    .line 111
    .line 112
    .line 113
    invoke-static {v4, v1, v15}, Lxe1;->i0(ILun0;Lpx;)Lkw;

    .line 114
    .line 115
    .line 116
    move-result-object v10

    .line 117
    invoke-virtual {v15, v3}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    invoke-virtual {v15, v0}, Lgo0;->g(Z)Z

    .line 122
    .line 123
    .line 124
    move-result v4

    .line 125
    or-int/2addr v1, v4

    .line 126
    invoke-virtual {v15}, Lgo0;->L()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v4

    .line 130
    if-nez v1, :cond_3

    .line 131
    .line 132
    sget-object v1, Lnx;->a:Leb;

    .line 133
    .line 134
    if-ne v4, v1, :cond_4

    .line 135
    .line 136
    :cond_3
    new-instance v4, Lqh;

    .line 137
    .line 138
    const/4 v1, 0x4

    .line 139
    invoke-direct {v4, v1, v3, v0}, Lqh;-><init>(ILin0;Z)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v15, v4}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    :cond_4
    move-object v13, v4

    .line 146
    check-cast v13, Lxm0;

    .line 147
    .line 148
    const/16 v16, 0x6c00

    .line 149
    .line 150
    const/16 v17, 0x162

    .line 151
    .line 152
    const/4 v7, 0x0

    .line 153
    const/4 v11, 0x0

    .line 154
    const/4 v12, 0x0

    .line 155
    const/4 v14, 0x0

    .line 156
    invoke-static/range {v6 .. v17}, Lsp0;->g(Ljava/lang/String;Luh1;Ljava/lang/String;Lmn0;Lmn0;Lmn0;ZLxm0;Lin0;Lpx;II)V

    .line 157
    .line 158
    .line 159
    goto :goto_1

    .line 160
    :cond_5
    invoke-virtual {v15}, Lgo0;->R()V

    .line 161
    .line 162
    .line 163
    :goto_1
    return-object v2

    .line 164
    :pswitch_1
    move-object/from16 v1, p1

    .line 165
    .line 166
    check-cast v1, Lpx;

    .line 167
    .line 168
    move-object/from16 v6, p2

    .line 169
    .line 170
    check-cast v6, Ljava/lang/Integer;

    .line 171
    .line 172
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 173
    .line 174
    .line 175
    move-result v6

    .line 176
    and-int/lit8 v7, v6, 0x3

    .line 177
    .line 178
    if-eq v7, v5, :cond_6

    .line 179
    .line 180
    move v3, v4

    .line 181
    :cond_6
    and-int/2addr v4, v6

    .line 182
    move-object v10, v1

    .line 183
    check-cast v10, Lgo0;

    .line 184
    .line 185
    invoke-virtual {v10, v4, v3}, Lgo0;->O(IZ)Z

    .line 186
    .line 187
    .line 188
    move-result v1

    .line 189
    if-eqz v1, :cond_7

    .line 190
    .line 191
    const/4 v7, 0x0

    .line 192
    const/16 v8, 0xb

    .line 193
    .line 194
    sget-object v3, Lrh1;->a:Lrh1;

    .line 195
    .line 196
    const/4 v4, 0x0

    .line 197
    const/4 v5, 0x0

    .line 198
    const/high16 v6, 0x41600000    # 14.0f

    .line 199
    .line 200
    invoke-static/range {v3 .. v8}, Lfg1;->G(Luh1;FFFFI)Luh1;

    .line 201
    .line 202
    .line 203
    move-result-object v7

    .line 204
    const/16 v11, 0x180

    .line 205
    .line 206
    const/16 v12, 0x38

    .line 207
    .line 208
    iget-boolean v5, v0, Lsr;->j:Z

    .line 209
    .line 210
    iget-object v6, v0, Lsr;->i:Lin0;

    .line 211
    .line 212
    const/4 v8, 0x0

    .line 213
    const/4 v9, 0x0

    .line 214
    invoke-static/range {v5 .. v12}, Lsp0;->i(ZLin0;Luh1;ZILpx;II)V

    .line 215
    .line 216
    .line 217
    goto :goto_2

    .line 218
    :cond_7
    invoke-virtual {v10}, Lgo0;->R()V

    .line 219
    .line 220
    .line 221
    :goto_2
    return-object v2

    .line 222
    nop

    .line 223
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
