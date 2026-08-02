.class public final synthetic Liw;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:I

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;

.field public final synthetic m:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/Object;

.field public final synthetic o:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILin0;Lin0;Lxk1;Lyk1;Ljava/lang/Object;Ljava/util/List;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Liw;->h:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p5, p0, Liw;->k:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p4, p0, Liw;->l:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p7, p0, Liw;->m:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p6, p0, Liw;->i:Ljava/lang/Object;

    .line 14
    .line 15
    iput-object p2, p0, Liw;->n:Ljava/lang/Object;

    .line 16
    .line 17
    iput-object p3, p0, Liw;->o:Ljava/lang/Object;

    .line 18
    .line 19
    iput p1, p0, Liw;->j:I

    .line 20
    .line 21
    return-void
.end method

.method public synthetic constructor <init>(Lkw;Ljava/lang/Object;Ljava/lang/Boolean;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 1

    .line 22
    const/4 v0, 0x0

    iput v0, p0, Liw;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Liw;->k:Ljava/lang/Object;

    iput-object p2, p0, Liw;->i:Ljava/lang/Object;

    iput-object p3, p0, Liw;->o:Ljava/lang/Object;

    iput-object p4, p0, Liw;->l:Ljava/lang/Object;

    iput-object p5, p0, Liw;->m:Ljava/lang/Object;

    iput-object p6, p0, Liw;->n:Ljava/lang/Object;

    iput p7, p0, Liw;->j:I

    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Liw;->h:I

    .line 4
    .line 5
    sget-object v2, La83;->a:La83;

    .line 6
    .line 7
    iget-object v3, v0, Liw;->o:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, v0, Liw;->k:Ljava/lang/Object;

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    move-object v6, v4

    .line 16
    check-cast v6, Lyk1;

    .line 17
    .line 18
    iget-object v1, v0, Liw;->l:Ljava/lang/Object;

    .line 19
    .line 20
    move-object v10, v1

    .line 21
    check-cast v10, Lxk1;

    .line 22
    .line 23
    iget-object v1, v0, Liw;->m:Ljava/lang/Object;

    .line 24
    .line 25
    move-object v13, v1

    .line 26
    check-cast v13, Ljava/util/List;

    .line 27
    .line 28
    iget-object v1, v0, Liw;->n:Ljava/lang/Object;

    .line 29
    .line 30
    move-object v8, v1

    .line 31
    check-cast v8, Lin0;

    .line 32
    .line 33
    move-object v9, v3

    .line 34
    check-cast v9, Lin0;

    .line 35
    .line 36
    move-object/from16 v1, p1

    .line 37
    .line 38
    check-cast v1, Lpx;

    .line 39
    .line 40
    move-object/from16 v3, p2

    .line 41
    .line 42
    check-cast v3, Ljava/lang/Integer;

    .line 43
    .line 44
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    and-int/lit8 v4, v3, 0x3

    .line 49
    .line 50
    const/4 v7, 0x2

    .line 51
    if-eq v4, v7, :cond_0

    .line 52
    .line 53
    move v4, v5

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    const/4 v4, 0x0

    .line 56
    :goto_0
    and-int/2addr v3, v5

    .line 57
    check-cast v1, Lgo0;

    .line 58
    .line 59
    invoke-virtual {v1, v3, v4}, Lgo0;->O(IZ)Z

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-eqz v3, :cond_3

    .line 64
    .line 65
    const/16 v3, 0x5a

    .line 66
    .line 67
    const/4 v4, 0x0

    .line 68
    const/4 v11, 0x6

    .line 69
    invoke-static {v3, v4, v11}, Lup0;->J(ILgd0;I)Lm43;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    invoke-static {v3, v7}, Lnf0;->a(Lm43;I)Lsf0;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    const/16 v12, 0x78

    .line 78
    .line 79
    invoke-static {v12, v4, v11}, Lup0;->J(ILgd0;I)Lm43;

    .line 80
    .line 81
    .line 82
    move-result-object v14

    .line 83
    and-int/2addr v5, v7

    .line 84
    const/4 v7, 0x0

    .line 85
    if-eqz v5, :cond_1

    .line 86
    .line 87
    const/high16 v5, 0x43c80000    # 400.0f

    .line 88
    .line 89
    const/4 v14, 0x5

    .line 90
    invoke-static {v7, v5, v4, v14}, Lup0;->G(FFLjava/lang/Object;I)Lqt2;

    .line 91
    .line 92
    .line 93
    move-result-object v14

    .line 94
    :cond_1
    new-instance v5, Lph0;

    .line 95
    .line 96
    new-instance v15, Lz33;

    .line 97
    .line 98
    new-instance v7, Luh0;

    .line 99
    .line 100
    invoke-direct {v7, v14}, Luh0;-><init>(Lfj0;)V

    .line 101
    .line 102
    .line 103
    const/16 v19, 0x0

    .line 104
    .line 105
    const/16 v20, 0x7e

    .line 106
    .line 107
    const/16 v17, 0x0

    .line 108
    .line 109
    const/16 v18, 0x0

    .line 110
    .line 111
    move-object/from16 v16, v7

    .line 112
    .line 113
    invoke-direct/range {v15 .. v20}, Lz33;-><init>(Luh0;Lt11;Lcd2;Ljava/util/LinkedHashMap;I)V

    .line 114
    .line 115
    .line 116
    invoke-direct {v5, v15}, Lph0;-><init>(Lz33;)V

    .line 117
    .line 118
    .line 119
    invoke-interface {v10}, Lgu2;->getValue()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v7

    .line 123
    check-cast v7, Ljava/lang/Boolean;

    .line 124
    .line 125
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 126
    .line 127
    .line 128
    move-result v7

    .line 129
    if-eqz v7, :cond_2

    .line 130
    .line 131
    const/high16 v7, 0x3f800000    # 1.0f

    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_2
    const/4 v7, 0x0

    .line 135
    :goto_1
    const v14, 0x3f51eb85    # 0.82f

    .line 136
    .line 137
    .line 138
    invoke-static {v14, v7}, Lrb3;->a(FF)J

    .line 139
    .line 140
    .line 141
    move-result-wide v14

    .line 142
    invoke-static {v12, v4, v11}, Lup0;->J(ILgd0;I)Lm43;

    .line 143
    .line 144
    .line 145
    move-result-object v4

    .line 146
    new-instance v7, Lph0;

    .line 147
    .line 148
    new-instance v16, Lz33;

    .line 149
    .line 150
    new-instance v11, Lcd2;

    .line 151
    .line 152
    invoke-direct {v11, v14, v15, v4}, Lcd2;-><init>(JLm43;)V

    .line 153
    .line 154
    .line 155
    const/16 v20, 0x0

    .line 156
    .line 157
    const/16 v21, 0x77

    .line 158
    .line 159
    const/16 v17, 0x0

    .line 160
    .line 161
    const/16 v18, 0x0

    .line 162
    .line 163
    move-object/from16 v19, v11

    .line 164
    .line 165
    invoke-direct/range {v16 .. v21}, Lz33;-><init>(Luh0;Lt11;Lcd2;Ljava/util/LinkedHashMap;I)V

    .line 166
    .line 167
    .line 168
    move-object/from16 v4, v16

    .line 169
    .line 170
    invoke-direct {v7, v4}, Lph0;-><init>(Lz33;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v5, v7}, Lph0;->a(Lph0;)Lph0;

    .line 174
    .line 175
    .line 176
    move-result-object v4

    .line 177
    move-object v11, v6

    .line 178
    new-instance v6, Lbr1;

    .line 179
    .line 180
    iget v7, v0, Liw;->j:I

    .line 181
    .line 182
    iget-object v12, v0, Liw;->i:Ljava/lang/Object;

    .line 183
    .line 184
    invoke-direct/range {v6 .. v13}, Lbr1;-><init>(ILin0;Lin0;Lxk1;Lyk1;Ljava/lang/Object;Ljava/util/List;)V

    .line 185
    .line 186
    .line 187
    const v0, 0x97e0cc0

    .line 188
    .line 189
    .line 190
    invoke-static {v0, v6, v1}, Lxe1;->i0(ILun0;Lpx;)Lkw;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    const v13, 0x30180

    .line 195
    .line 196
    .line 197
    const/4 v7, 0x0

    .line 198
    const/4 v10, 0x0

    .line 199
    move-object v12, v1

    .line 200
    move-object v8, v3

    .line 201
    move-object v9, v4

    .line 202
    move-object v6, v11

    .line 203
    move-object v11, v0

    .line 204
    invoke-static/range {v6 .. v13}, Lrp0;->D(Lyk1;Luh1;Lsf0;Lph0;Ljava/lang/String;Lkw;Lpx;I)V

    .line 205
    .line 206
    .line 207
    goto :goto_2

    .line 208
    :cond_3
    move-object v12, v1

    .line 209
    invoke-virtual {v12}, Lgo0;->R()V

    .line 210
    .line 211
    .line 212
    :goto_2
    return-object v2

    .line 213
    :pswitch_0
    check-cast v4, Lkw;

    .line 214
    .line 215
    check-cast v3, Ljava/lang/Boolean;

    .line 216
    .line 217
    move-object/from16 v9, p1

    .line 218
    .line 219
    check-cast v9, Lpx;

    .line 220
    .line 221
    move-object/from16 v1, p2

    .line 222
    .line 223
    check-cast v1, Ljava/lang/Integer;

    .line 224
    .line 225
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 226
    .line 227
    .line 228
    iget v1, v0, Liw;->j:I

    .line 229
    .line 230
    invoke-static {v1}, Lpp0;->N(I)I

    .line 231
    .line 232
    .line 233
    move-result v1

    .line 234
    or-int/lit8 v10, v1, 0x1

    .line 235
    .line 236
    move-object v5, v3

    .line 237
    move-object v3, v4

    .line 238
    iget-object v4, v0, Liw;->i:Ljava/lang/Object;

    .line 239
    .line 240
    iget-object v6, v0, Liw;->l:Ljava/lang/Object;

    .line 241
    .line 242
    iget-object v7, v0, Liw;->m:Ljava/lang/Object;

    .line 243
    .line 244
    iget-object v8, v0, Liw;->n:Ljava/lang/Object;

    .line 245
    .line 246
    invoke-virtual/range {v3 .. v10}, Lkw;->i(Ljava/lang/Object;Ljava/lang/Boolean;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lpx;I)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    return-object v2

    .line 250
    nop

    .line 251
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
