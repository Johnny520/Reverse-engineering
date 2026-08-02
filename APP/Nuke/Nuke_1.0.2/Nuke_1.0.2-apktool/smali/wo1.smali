.class public final synthetic Lwo1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lin0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:J

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(JLxm0;Lxk1;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lwo1;->h:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-wide p1, p0, Lwo1;->i:J

    .line 8
    .line 9
    iput-object p3, p0, Lwo1;->j:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p4, p0, Lwo1;->k:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Lx13;J)V
    .locals 1

    .line 14
    const/4 v0, 0x1

    iput v0, p0, Lwo1;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwo1;->j:Ljava/lang/Object;

    iput-object p2, p0, Lwo1;->k:Ljava/lang/Object;

    iput-wide p3, p0, Lwo1;->i:J

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lwo1;->h:I

    .line 4
    .line 5
    sget-object v2, La83;->a:La83;

    .line 6
    .line 7
    const/16 v3, 0x20

    .line 8
    .line 9
    const/high16 v4, 0x40000000    # 2.0f

    .line 10
    .line 11
    const-wide v5, 0xffffffffL

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    iget-object v7, v0, Lwo1;->k:Ljava/lang/Object;

    .line 17
    .line 18
    iget-object v8, v0, Lwo1;->j:Ljava/lang/Object;

    .line 19
    .line 20
    packed-switch v1, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    check-cast v8, Ljava/util/List;

    .line 24
    .line 25
    check-cast v7, Lx13;

    .line 26
    .line 27
    move-object/from16 v9, p1

    .line 28
    .line 29
    check-cast v9, Lnc0;

    .line 30
    .line 31
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-interface {v9}, Lnc0;->d()J

    .line 35
    .line 36
    .line 37
    move-result-wide v10

    .line 38
    and-long/2addr v10, v5

    .line 39
    long-to-int v1, v10

    .line 40
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    div-float/2addr v1, v4

    .line 45
    invoke-interface {v9}, Lnc0;->d()J

    .line 46
    .line 47
    .line 48
    move-result-wide v10

    .line 49
    and-long/2addr v10, v5

    .line 50
    long-to-int v10, v10

    .line 51
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 52
    .line 53
    .line 54
    move-result v10

    .line 55
    div-float/2addr v10, v4

    .line 56
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    int-to-long v11, v1

    .line 61
    invoke-static {v10}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    int-to-long v13, v1

    .line 66
    shl-long v10, v11, v3

    .line 67
    .line 68
    and-long v12, v13, v5

    .line 69
    .line 70
    or-long v15, v10, v12

    .line 71
    .line 72
    invoke-static {v8}, Lz8;->l(Ljava/util/List;)Lbb1;

    .line 73
    .line 74
    .line 75
    move-result-object v10

    .line 76
    const/16 v17, 0x0

    .line 77
    .line 78
    const/16 v18, 0xf6

    .line 79
    .line 80
    const-wide/16 v11, 0x0

    .line 81
    .line 82
    const-wide/16 v13, 0x0

    .line 83
    .line 84
    invoke-static/range {v9 .. v18}, Lnc0;->s0(Lnc0;Lan;JJJLop0;I)V

    .line 85
    .line 86
    .line 87
    iget v1, v7, Lx13;->a:F

    .line 88
    .line 89
    const/4 v7, 0x0

    .line 90
    const v8, 0x43b3ffdf    # 359.999f

    .line 91
    .line 92
    .line 93
    invoke-static {v1, v7, v8}, Lci0;->C(FFF)F

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    div-float/2addr v1, v8

    .line 98
    invoke-interface {v9}, Lnc0;->d()J

    .line 99
    .line 100
    .line 101
    move-result-wide v7

    .line 102
    shr-long/2addr v7, v3

    .line 103
    long-to-int v7, v7

    .line 104
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 105
    .line 106
    .line 107
    move-result v7

    .line 108
    mul-float/2addr v7, v1

    .line 109
    invoke-interface {v9}, Lnc0;->d()J

    .line 110
    .line 111
    .line 112
    move-result-wide v10

    .line 113
    and-long/2addr v10, v5

    .line 114
    long-to-int v1, v10

    .line 115
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    div-float/2addr v1, v4

    .line 120
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 121
    .line 122
    .line 123
    move-result v4

    .line 124
    int-to-long v7, v4

    .line 125
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    int-to-long v10, v1

    .line 130
    shl-long v3, v7, v3

    .line 131
    .line 132
    and-long/2addr v5, v10

    .line 133
    or-long v13, v3, v5

    .line 134
    .line 135
    sget-wide v10, Lju;->c:J

    .line 136
    .line 137
    const/high16 v1, 0x41200000    # 10.0f

    .line 138
    .line 139
    invoke-interface {v9, v1}, Le70;->A(F)F

    .line 140
    .line 141
    .line 142
    move-result v12

    .line 143
    new-instance v15, Lxv2;

    .line 144
    .line 145
    const/high16 v1, 0x40400000    # 3.0f

    .line 146
    .line 147
    invoke-interface {v9, v1}, Le70;->A(F)F

    .line 148
    .line 149
    .line 150
    move-result v4

    .line 151
    const/4 v7, 0x0

    .line 152
    const/16 v8, 0x1e

    .line 153
    .line 154
    const/4 v5, 0x0

    .line 155
    const/4 v6, 0x0

    .line 156
    move-object v3, v15

    .line 157
    invoke-direct/range {v3 .. v8}, Lxv2;-><init>(FFIII)V

    .line 158
    .line 159
    .line 160
    const/16 v16, 0x68

    .line 161
    .line 162
    invoke-static/range {v9 .. v16}, Lnc0;->O(Lnc0;JFJLxv2;I)V

    .line 163
    .line 164
    .line 165
    const/high16 v1, 0x40c00000    # 6.0f

    .line 166
    .line 167
    invoke-interface {v9, v1}, Le70;->A(F)F

    .line 168
    .line 169
    .line 170
    move-result v12

    .line 171
    const/4 v15, 0x0

    .line 172
    const/16 v16, 0x78

    .line 173
    .line 174
    iget-wide v10, v0, Lwo1;->i:J

    .line 175
    .line 176
    invoke-static/range {v9 .. v16}, Lnc0;->O(Lnc0;JFJLxv2;I)V

    .line 177
    .line 178
    .line 179
    return-object v2

    .line 180
    :pswitch_0
    check-cast v8, Lxm0;

    .line 181
    .line 182
    check-cast v7, Lxk1;

    .line 183
    .line 184
    move-object/from16 v1, p1

    .line 185
    .line 186
    check-cast v1, Lca2;

    .line 187
    .line 188
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    const-wide/16 v9, 0x0

    .line 192
    .line 193
    iget-wide v11, v0, Lwo1;->i:J

    .line 194
    .line 195
    invoke-static {v11, v12, v9, v10}, Lrs1;->b(JJ)Z

    .line 196
    .line 197
    .line 198
    move-result v0

    .line 199
    if-eqz v0, :cond_0

    .line 200
    .line 201
    invoke-interface {v7}, Lgu2;->getValue()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    check-cast v0, Lh11;

    .line 206
    .line 207
    iget-wide v9, v0, Lh11;->a:J

    .line 208
    .line 209
    shr-long/2addr v9, v3

    .line 210
    long-to-int v0, v9

    .line 211
    int-to-float v0, v0

    .line 212
    div-float/2addr v0, v4

    .line 213
    invoke-interface {v7}, Lgu2;->getValue()Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v7

    .line 217
    check-cast v7, Lh11;

    .line 218
    .line 219
    iget-wide v9, v7, Lh11;->a:J

    .line 220
    .line 221
    and-long/2addr v9, v5

    .line 222
    long-to-int v7, v9

    .line 223
    int-to-float v7, v7

    .line 224
    div-float/2addr v7, v4

    .line 225
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 226
    .line 227
    .line 228
    move-result v0

    .line 229
    int-to-long v9, v0

    .line 230
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 231
    .line 232
    .line 233
    move-result v0

    .line 234
    int-to-long v11, v0

    .line 235
    shl-long v3, v9, v3

    .line 236
    .line 237
    and-long/2addr v5, v11

    .line 238
    or-long v11, v3, v5

    .line 239
    .line 240
    :cond_0
    invoke-interface {v8}, Lxm0;->a()Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    check-cast v0, Ljava/lang/Number;

    .line 245
    .line 246
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 247
    .line 248
    .line 249
    move-result v0

    .line 250
    const/4 v3, 0x1

    .line 251
    invoke-virtual {v1, v3}, Lca2;->g(Z)V

    .line 252
    .line 253
    .line 254
    new-instance v3, Lap1;

    .line 255
    .line 256
    invoke-direct {v3, v0, v11, v12}, Lap1;-><init>(FJ)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v1, v3}, Lca2;->p(Leq2;)V

    .line 260
    .line 261
    .line 262
    return-object v2

    .line 263
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
