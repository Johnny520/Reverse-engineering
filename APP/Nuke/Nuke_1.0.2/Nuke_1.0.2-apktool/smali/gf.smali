.class public final synthetic Lgf;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Lc73;

.field public final synthetic j:Lin0;


# direct methods
.method public synthetic constructor <init>(Lc73;Lin0;)V
    .locals 1

    .line 12
    const/4 v0, 0x1

    iput v0, p0, Lgf;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgf;->i:Lc73;

    iput-object p2, p0, Lgf;->j:Lin0;

    return-void
.end method

.method public synthetic constructor <init>(Lin0;Lc73;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lgf;->h:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lgf;->j:Lin0;

    .line 8
    .line 9
    iput-object p2, p0, Lgf;->i:Lc73;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lgf;->h:I

    .line 4
    .line 5
    sget-object v2, La83;->a:La83;

    .line 6
    .line 7
    sget-object v3, Lnx;->a:Leb;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x1

    .line 11
    iget-object v6, v0, Lgf;->j:Lin0;

    .line 12
    .line 13
    iget-object v0, v0, Lgf;->i:Lc73;

    .line 14
    .line 15
    const/4 v7, 0x2

    .line 16
    packed-switch v1, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    move-object/from16 v1, p1

    .line 20
    .line 21
    check-cast v1, Lpx;

    .line 22
    .line 23
    move-object/from16 v8, p2

    .line 24
    .line 25
    check-cast v8, Ljava/lang/Integer;

    .line 26
    .line 27
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 28
    .line 29
    .line 30
    move-result v8

    .line 31
    and-int/lit8 v9, v8, 0x3

    .line 32
    .line 33
    if-eq v9, v7, :cond_0

    .line 34
    .line 35
    move v4, v5

    .line 36
    :cond_0
    and-int/2addr v5, v8

    .line 37
    move-object v13, v1

    .line 38
    check-cast v13, Lgo0;

    .line 39
    .line 40
    invoke-virtual {v13, v5, v4}, Lgo0;->O(IZ)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_3

    .line 45
    .line 46
    iget-boolean v8, v0, Lc73;->c:Z

    .line 47
    .line 48
    invoke-virtual {v13, v6}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    invoke-virtual {v13, v0}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    or-int/2addr v1, v4

    .line 57
    invoke-virtual {v13}, Lgo0;->L()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    if-nez v1, :cond_1

    .line 62
    .line 63
    if-ne v4, v3, :cond_2

    .line 64
    .line 65
    :cond_1
    new-instance v4, Lhf;

    .line 66
    .line 67
    invoke-direct {v4, v6, v0, v7}, Lhf;-><init>(Lin0;Lc73;I)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v13, v4}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    :cond_2
    move-object v9, v4

    .line 74
    check-cast v9, Lin0;

    .line 75
    .line 76
    const/4 v14, 0x0

    .line 77
    const/16 v15, 0x3c

    .line 78
    .line 79
    const/4 v10, 0x0

    .line 80
    const/4 v11, 0x0

    .line 81
    const/4 v12, 0x0

    .line 82
    invoke-static/range {v8 .. v15}, Lsp0;->i(ZLin0;Luh1;ZILpx;II)V

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_3
    invoke-virtual {v13}, Lgo0;->R()V

    .line 87
    .line 88
    .line 89
    :goto_0
    return-object v2

    .line 90
    :pswitch_0
    move-object/from16 v1, p1

    .line 91
    .line 92
    check-cast v1, Lpx;

    .line 93
    .line 94
    move-object/from16 v8, p2

    .line 95
    .line 96
    check-cast v8, Ljava/lang/Integer;

    .line 97
    .line 98
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 99
    .line 100
    .line 101
    move-result v8

    .line 102
    and-int/lit8 v9, v8, 0x3

    .line 103
    .line 104
    if-eq v9, v7, :cond_4

    .line 105
    .line 106
    move v4, v5

    .line 107
    :cond_4
    and-int/2addr v5, v8

    .line 108
    check-cast v1, Lgo0;

    .line 109
    .line 110
    invoke-virtual {v1, v5, v4}, Lgo0;->O(IZ)Z

    .line 111
    .line 112
    .line 113
    move-result v4

    .line 114
    if-eqz v4, :cond_7

    .line 115
    .line 116
    const v4, 0x790b0113

    .line 117
    .line 118
    .line 119
    invoke-static {v4, v1}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v7

    .line 123
    const v4, 0x790b0114

    .line 124
    .line 125
    .line 126
    invoke-static {v4, v1}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v9

    .line 130
    new-instance v4, Lgf;

    .line 131
    .line 132
    invoke-direct {v4, v0, v6}, Lgf;-><init>(Lc73;Lin0;)V

    .line 133
    .line 134
    .line 135
    const v5, -0x829495d

    .line 136
    .line 137
    .line 138
    invoke-static {v5, v4, v1}, Lxe1;->i0(ILun0;Lpx;)Lkw;

    .line 139
    .line 140
    .line 141
    move-result-object v11

    .line 142
    invoke-virtual {v1, v6}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v4

    .line 146
    invoke-virtual {v1, v0}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result v5

    .line 150
    or-int/2addr v4, v5

    .line 151
    invoke-virtual {v1}, Lgo0;->L()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v5

    .line 155
    if-nez v4, :cond_5

    .line 156
    .line 157
    if-ne v5, v3, :cond_6

    .line 158
    .line 159
    :cond_5
    new-instance v5, Lr1;

    .line 160
    .line 161
    const/4 v3, 0x4

    .line 162
    invoke-direct {v5, v3, v6, v0}, Lr1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v1, v5}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    :cond_6
    move-object v14, v5

    .line 169
    check-cast v14, Lxm0;

    .line 170
    .line 171
    const/16 v17, 0x6000

    .line 172
    .line 173
    const/16 v18, 0x16a

    .line 174
    .line 175
    const/4 v8, 0x0

    .line 176
    const/4 v10, 0x0

    .line 177
    const/4 v12, 0x0

    .line 178
    const/4 v13, 0x0

    .line 179
    const/4 v15, 0x0

    .line 180
    move-object/from16 v16, v1

    .line 181
    .line 182
    invoke-static/range {v7 .. v18}, Lsp0;->g(Ljava/lang/String;Luh1;Ljava/lang/String;Lmn0;Lmn0;Lmn0;ZLxm0;Lin0;Lpx;II)V

    .line 183
    .line 184
    .line 185
    goto :goto_1

    .line 186
    :cond_7
    move-object/from16 v16, v1

    .line 187
    .line 188
    invoke-virtual/range {v16 .. v16}, Lgo0;->R()V

    .line 189
    .line 190
    .line 191
    :goto_1
    return-object v2

    .line 192
    nop

    .line 193
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
