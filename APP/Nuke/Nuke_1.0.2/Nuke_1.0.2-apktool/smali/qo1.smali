.class public final synthetic Lqo1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Z


# direct methods
.method public synthetic constructor <init>(ILjava/lang/String;Z)V
    .locals 0

    .line 1
    iput p1, p0, Lqo1;->h:I

    .line 2
    .line 3
    iput-object p2, p0, Lqo1;->i:Ljava/lang/String;

    .line 4
    .line 5
    iput-boolean p3, p0, Lqo1;->j:Z

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lqo1;->h:I

    .line 4
    .line 5
    sget-object v2, La83;->a:La83;

    .line 6
    .line 7
    const/16 v3, 0xe

    .line 8
    .line 9
    const v4, 0x3ee66666    # 0.45f

    .line 10
    .line 11
    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v6, 0x2

    .line 14
    const/4 v7, 0x1

    .line 15
    iget-boolean v8, v0, Lqo1;->j:Z

    .line 16
    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    move-object/from16 v1, p1

    .line 21
    .line 22
    check-cast v1, Lpx;

    .line 23
    .line 24
    move-object/from16 v9, p2

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
    and-int/lit8 v10, v9, 0x3

    .line 33
    .line 34
    if-eq v10, v6, :cond_0

    .line 35
    .line 36
    move v5, v7

    .line 37
    :cond_0
    and-int/lit8 v6, v9, 0x1

    .line 38
    .line 39
    check-cast v1, Lgo0;

    .line 40
    .line 41
    invoke-virtual {v1, v6, v5}, Lgo0;->O(IZ)Z

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    if-eqz v5, :cond_2

    .line 46
    .line 47
    new-instance v9, Lm13;

    .line 48
    .line 49
    sget-object v5, Lur1;->a:Ltu2;

    .line 50
    .line 51
    invoke-virtual {v1, v5}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    check-cast v5, Llp1;

    .line 56
    .line 57
    iget-wide v5, v5, Llp1;->g:J

    .line 58
    .line 59
    if-eqz v8, :cond_1

    .line 60
    .line 61
    const/high16 v4, 0x3f800000    # 1.0f

    .line 62
    .line 63
    :cond_1
    invoke-static {v4, v5, v6}, Lju;->b(FJ)J

    .line 64
    .line 65
    .line 66
    move-result-wide v10

    .line 67
    invoke-static {v3}, Lrg3;->D(I)J

    .line 68
    .line 69
    .line 70
    move-result-wide v12

    .line 71
    sget-object v14, Lim0;->m:Lim0;

    .line 72
    .line 73
    const/16 v21, 0x0

    .line 74
    .line 75
    const v22, 0xfffff8

    .line 76
    .line 77
    .line 78
    const-wide/16 v15, 0x0

    .line 79
    .line 80
    const/16 v17, 0x0

    .line 81
    .line 82
    const-wide/16 v18, 0x0

    .line 83
    .line 84
    const/16 v20, 0x0

    .line 85
    .line 86
    invoke-direct/range {v9 .. v22}, Lm13;-><init>(JJLim0;JIJLw02;Lya1;I)V

    .line 87
    .line 88
    .line 89
    const/16 v18, 0x3fa

    .line 90
    .line 91
    move-object v11, v9

    .line 92
    iget-object v9, v0, Lqo1;->i:Ljava/lang/String;

    .line 93
    .line 94
    const/4 v10, 0x0

    .line 95
    const/4 v12, 0x0

    .line 96
    const/4 v13, 0x0

    .line 97
    const/4 v14, 0x0

    .line 98
    const/4 v15, 0x0

    .line 99
    move-object/from16 v16, v1

    .line 100
    .line 101
    invoke-static/range {v9 .. v18}, Leu;->a(Ljava/lang/String;Luh1;Lm13;IZIILpx;II)V

    .line 102
    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_2
    move-object/from16 v16, v1

    .line 106
    .line 107
    invoke-virtual/range {v16 .. v16}, Lgo0;->R()V

    .line 108
    .line 109
    .line 110
    :goto_0
    return-object v2

    .line 111
    :pswitch_0
    move-object/from16 v1, p1

    .line 112
    .line 113
    check-cast v1, Lpx;

    .line 114
    .line 115
    move-object/from16 v9, p2

    .line 116
    .line 117
    check-cast v9, Ljava/lang/Integer;

    .line 118
    .line 119
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 120
    .line 121
    .line 122
    move-result v9

    .line 123
    and-int/lit8 v10, v9, 0x3

    .line 124
    .line 125
    if-eq v10, v6, :cond_3

    .line 126
    .line 127
    move v6, v7

    .line 128
    goto :goto_1

    .line 129
    :cond_3
    move v6, v5

    .line 130
    :goto_1
    and-int/2addr v7, v9

    .line 131
    check-cast v1, Lgo0;

    .line 132
    .line 133
    invoke-virtual {v1, v7, v6}, Lgo0;->O(IZ)Z

    .line 134
    .line 135
    .line 136
    move-result v6

    .line 137
    if-eqz v6, :cond_5

    .line 138
    .line 139
    new-instance v9, Lm13;

    .line 140
    .line 141
    if-eqz v8, :cond_4

    .line 142
    .line 143
    const v4, 0x5da73972

    .line 144
    .line 145
    .line 146
    invoke-virtual {v1, v4}, Lgo0;->W(I)V

    .line 147
    .line 148
    .line 149
    sget-object v4, Lur1;->a:Ltu2;

    .line 150
    .line 151
    invoke-virtual {v1, v4}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v4

    .line 155
    check-cast v4, Llp1;

    .line 156
    .line 157
    iget-wide v6, v4, Llp1;->f:J

    .line 158
    .line 159
    invoke-virtual {v1, v5}, Lgo0;->p(Z)V

    .line 160
    .line 161
    .line 162
    :goto_2
    move-wide v10, v6

    .line 163
    goto :goto_3

    .line 164
    :cond_4
    const v6, 0x5da8625e

    .line 165
    .line 166
    .line 167
    invoke-virtual {v1, v6}, Lgo0;->W(I)V

    .line 168
    .line 169
    .line 170
    sget-object v6, Lur1;->a:Ltu2;

    .line 171
    .line 172
    invoke-virtual {v1, v6}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v6

    .line 176
    check-cast v6, Llp1;

    .line 177
    .line 178
    iget-wide v6, v6, Llp1;->f:J

    .line 179
    .line 180
    invoke-static {v4, v6, v7}, Lju;->b(FJ)J

    .line 181
    .line 182
    .line 183
    move-result-wide v6

    .line 184
    invoke-virtual {v1, v5}, Lgo0;->p(Z)V

    .line 185
    .line 186
    .line 187
    goto :goto_2

    .line 188
    :goto_3
    invoke-static {v3}, Lrg3;->D(I)J

    .line 189
    .line 190
    .line 191
    move-result-wide v12

    .line 192
    sget-object v14, Lim0;->l:Lim0;

    .line 193
    .line 194
    const/16 v21, 0x0

    .line 195
    .line 196
    const v22, 0xfffff8

    .line 197
    .line 198
    .line 199
    const-wide/16 v15, 0x0

    .line 200
    .line 201
    const/16 v17, 0x0

    .line 202
    .line 203
    const-wide/16 v18, 0x0

    .line 204
    .line 205
    const/16 v20, 0x0

    .line 206
    .line 207
    invoke-direct/range {v9 .. v22}, Lm13;-><init>(JJLim0;JIJLw02;Lya1;I)V

    .line 208
    .line 209
    .line 210
    const/16 v18, 0x3fa

    .line 211
    .line 212
    iget-object v0, v0, Lqo1;->i:Ljava/lang/String;

    .line 213
    .line 214
    const/4 v10, 0x0

    .line 215
    const/4 v12, 0x0

    .line 216
    const/4 v13, 0x0

    .line 217
    const/4 v14, 0x0

    .line 218
    const/4 v15, 0x0

    .line 219
    move-object/from16 v16, v1

    .line 220
    .line 221
    move-object v11, v9

    .line 222
    move-object v9, v0

    .line 223
    invoke-static/range {v9 .. v18}, Leu;->a(Ljava/lang/String;Luh1;Lm13;IZIILpx;II)V

    .line 224
    .line 225
    .line 226
    goto :goto_4

    .line 227
    :cond_5
    move-object/from16 v16, v1

    .line 228
    .line 229
    invoke-virtual/range {v16 .. v16}, Lgo0;->R()V

    .line 230
    .line 231
    .line 232
    :goto_4
    return-object v2

    .line 233
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
