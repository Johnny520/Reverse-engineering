.class public final synthetic Lwe;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Lxm0;


# direct methods
.method public synthetic constructor <init>(Lxm0;I)V
    .locals 0

    .line 1
    const/4 p2, 0x1

    .line 2
    iput p2, p0, Lwe;->h:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwe;->i:Lxm0;

    .line 8
    .line 9
    return-void
.end method

.method public synthetic constructor <init>(Lxm0;IB)V
    .locals 0

    .line 10
    iput p2, p0, Lwe;->h:I

    iput-object p1, p0, Lwe;->i:Lxm0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lwe;->h:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x0

    .line 8
    sget-object v5, La83;->a:La83;

    .line 9
    .line 10
    const/4 v6, 0x1

    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    move-object/from16 v1, p1

    .line 15
    .line 16
    check-cast v1, Lpx;

    .line 17
    .line 18
    move-object/from16 v7, p2

    .line 19
    .line 20
    check-cast v7, Ljava/lang/Integer;

    .line 21
    .line 22
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 23
    .line 24
    .line 25
    move-result v7

    .line 26
    and-int/lit8 v8, v7, 0x3

    .line 27
    .line 28
    if-eq v8, v3, :cond_0

    .line 29
    .line 30
    move v3, v6

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move v3, v4

    .line 33
    :goto_0
    and-int/2addr v7, v6

    .line 34
    check-cast v1, Lgo0;

    .line 35
    .line 36
    invoke-virtual {v1, v7, v3}, Lgo0;->O(IZ)Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_1

    .line 41
    .line 42
    const v3, 0x790b016c

    .line 43
    .line 44
    .line 45
    invoke-static {v3, v1}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v8

    .line 49
    const v3, 0x790b016d

    .line 50
    .line 51
    .line 52
    invoke-static {v3, v1}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v10

    .line 56
    sget-object v11, Lci0;->l:Lkw;

    .line 57
    .line 58
    const/16 v18, 0xc00

    .line 59
    .line 60
    const/16 v19, 0x1f2

    .line 61
    .line 62
    const/4 v9, 0x0

    .line 63
    const/4 v12, 0x0

    .line 64
    const/4 v13, 0x0

    .line 65
    const/4 v14, 0x0

    .line 66
    const/4 v15, 0x0

    .line 67
    const/16 v16, 0x0

    .line 68
    .line 69
    move-object/from16 v17, v1

    .line 70
    .line 71
    invoke-static/range {v8 .. v19}, Lsp0;->g(Ljava/lang/String;Luh1;Ljava/lang/String;Lmn0;Lmn0;Lmn0;ZLxm0;Lin0;Lpx;II)V

    .line 72
    .line 73
    .line 74
    invoke-static {v2, v1, v4, v6}, Lci0;->f(FLpx;II)V

    .line 75
    .line 76
    .line 77
    const v2, 0x790b015e

    .line 78
    .line 79
    .line 80
    invoke-static {v2, v1}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v8

    .line 84
    sget-object v11, Lci0;->m:Lkw;

    .line 85
    .line 86
    const/16 v19, 0x176

    .line 87
    .line 88
    const/4 v10, 0x0

    .line 89
    iget-object v15, v0, Lwe;->i:Lxm0;

    .line 90
    .line 91
    invoke-static/range {v8 .. v19}, Lsp0;->g(Ljava/lang/String;Luh1;Ljava/lang/String;Lmn0;Lmn0;Lmn0;ZLxm0;Lin0;Lpx;II)V

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_1
    move-object/from16 v17, v1

    .line 96
    .line 97
    invoke-virtual/range {v17 .. v17}, Lgo0;->R()V

    .line 98
    .line 99
    .line 100
    :goto_1
    return-object v5

    .line 101
    :pswitch_0
    move-object/from16 v1, p1

    .line 102
    .line 103
    check-cast v1, Lpx;

    .line 104
    .line 105
    move-object/from16 v2, p2

    .line 106
    .line 107
    check-cast v2, Ljava/lang/Integer;

    .line 108
    .line 109
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    invoke-static {v6}, Lpp0;->N(I)I

    .line 113
    .line 114
    .line 115
    move-result v2

    .line 116
    iget-object v0, v0, Lwe;->i:Lxm0;

    .line 117
    .line 118
    invoke-static {v0, v1, v2}, Lse;->n(Lxm0;Lpx;I)V

    .line 119
    .line 120
    .line 121
    return-object v5

    .line 122
    :pswitch_1
    move-object/from16 v1, p1

    .line 123
    .line 124
    check-cast v1, Lpx;

    .line 125
    .line 126
    move-object/from16 v7, p2

    .line 127
    .line 128
    check-cast v7, Ljava/lang/Integer;

    .line 129
    .line 130
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 131
    .line 132
    .line 133
    move-result v7

    .line 134
    and-int/lit8 v8, v7, 0x3

    .line 135
    .line 136
    if-eq v8, v3, :cond_2

    .line 137
    .line 138
    move v3, v6

    .line 139
    goto :goto_2

    .line 140
    :cond_2
    move v3, v4

    .line 141
    :goto_2
    and-int/2addr v7, v6

    .line 142
    check-cast v1, Lgo0;

    .line 143
    .line 144
    invoke-virtual {v1, v7, v3}, Lgo0;->O(IZ)Z

    .line 145
    .line 146
    .line 147
    move-result v3

    .line 148
    if-eqz v3, :cond_3

    .line 149
    .line 150
    const v3, 0x790b015f

    .line 151
    .line 152
    .line 153
    invoke-static {v3, v1}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v8

    .line 157
    const v3, 0x790b0160

    .line 158
    .line 159
    .line 160
    invoke-static {v3, v1}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v10

    .line 164
    sget-object v11, Lci0;->s:Lkw;

    .line 165
    .line 166
    const/16 v18, 0xc00

    .line 167
    .line 168
    const/16 v19, 0x1f2

    .line 169
    .line 170
    const/4 v9, 0x0

    .line 171
    const/4 v12, 0x0

    .line 172
    const/4 v13, 0x0

    .line 173
    const/4 v14, 0x0

    .line 174
    const/4 v15, 0x0

    .line 175
    const/16 v16, 0x0

    .line 176
    .line 177
    move-object/from16 v17, v1

    .line 178
    .line 179
    invoke-static/range {v8 .. v19}, Lsp0;->g(Ljava/lang/String;Luh1;Ljava/lang/String;Lmn0;Lmn0;Lmn0;ZLxm0;Lin0;Lpx;II)V

    .line 180
    .line 181
    .line 182
    invoke-static {v2, v1, v4, v6}, Lci0;->f(FLpx;II)V

    .line 183
    .line 184
    .line 185
    const v2, 0x790b016b

    .line 186
    .line 187
    .line 188
    invoke-static {v2, v1}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v8

    .line 192
    sget-object v11, Lci0;->t:Lkw;

    .line 193
    .line 194
    const/16 v19, 0x176

    .line 195
    .line 196
    const/4 v10, 0x0

    .line 197
    iget-object v15, v0, Lwe;->i:Lxm0;

    .line 198
    .line 199
    invoke-static/range {v8 .. v19}, Lsp0;->g(Ljava/lang/String;Luh1;Ljava/lang/String;Lmn0;Lmn0;Lmn0;ZLxm0;Lin0;Lpx;II)V

    .line 200
    .line 201
    .line 202
    goto :goto_3

    .line 203
    :cond_3
    move-object/from16 v17, v1

    .line 204
    .line 205
    invoke-virtual/range {v17 .. v17}, Lgo0;->R()V

    .line 206
    .line 207
    .line 208
    :goto_3
    return-object v5

    .line 209
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
