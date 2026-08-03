.class public final synthetic Lxb/l;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lxb/o;


# direct methods
.method public synthetic constructor <init>(Lxb/o;I)V
    .locals 0

    .line 1
    iput p2, p0, Lxb/l;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lxb/l;->h:Lxb/o;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lxb/l;->g:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p1

    .line 9
    .line 10
    check-cast v1, Ls1/t;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object v1, v0, Lxb/l;->h:Lxb/o;

    .line 16
    .line 17
    iget-object v2, v1, Lxb/o;->a:Lqg/t;

    .line 18
    .line 19
    new-instance v3, Lxb/n;

    .line 20
    .line 21
    const/4 v4, 0x1

    .line 22
    const/4 v5, 0x0

    .line 23
    invoke-direct {v3, v1, v5, v4}, Lxb/n;-><init>(Lxb/o;Lwf/c;I)V

    .line 24
    .line 25
    .line 26
    const/4 v1, 0x3

    .line 27
    invoke-static {v2, v5, v3, v1}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 28
    .line 29
    .line 30
    :goto_0
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 31
    .line 32
    return-object v1

    .line 33
    :pswitch_0
    move-object/from16 v1, p1

    .line 34
    .line 35
    check-cast v1, Ls1/t;

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    iget-wide v1, v1, Ls1/t;->c:J

    .line 41
    .line 42
    iget-object v3, v0, Lxb/l;->h:Lxb/o;

    .line 43
    .line 44
    iput-wide v1, v3, Lxb/o;->g:J

    .line 45
    .line 46
    iget-object v1, v3, Lxb/o;->a:Lqg/t;

    .line 47
    .line 48
    new-instance v2, Lxb/n;

    .line 49
    .line 50
    const/4 v4, 0x0

    .line 51
    const/4 v5, 0x0

    .line 52
    invoke-direct {v2, v3, v5, v4}, Lxb/n;-><init>(Lxb/o;Lwf/c;I)V

    .line 53
    .line 54
    .line 55
    const/4 v3, 0x3

    .line 56
    invoke-static {v1, v5, v2, v3}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :pswitch_1
    move-object/from16 v2, p1

    .line 61
    .line 62
    check-cast v2, Lx1/h0;

    .line 63
    .line 64
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    iget-object v1, v2, Lx1/h0;->g:Lh1/b;

    .line 68
    .line 69
    iget-object v10, v0, Lxb/l;->h:Lxb/o;

    .line 70
    .line 71
    iget-object v3, v10, Lxb/o;->e:Li/c;

    .line 72
    .line 73
    invoke-virtual {v3}, Li/c;->d()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    check-cast v3, Ljava/lang/Number;

    .line 78
    .line 79
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 80
    .line 81
    .line 82
    move-result v11

    .line 83
    const/4 v12, 0x0

    .line 84
    cmpl-float v3, v11, v12

    .line 85
    .line 86
    if-lez v3, :cond_4

    .line 87
    .line 88
    sget-wide v13, Lf1/w;->c:J

    .line 89
    .line 90
    const v3, 0x3d75c28f    # 0.06f

    .line 91
    .line 92
    .line 93
    mul-float/2addr v3, v11

    .line 94
    invoke-static {v13, v14, v3}, Lf1/w;->b(JF)J

    .line 95
    .line 96
    .line 97
    move-result-wide v3

    .line 98
    const/16 v8, 0xc

    .line 99
    .line 100
    const/16 v9, 0x3e

    .line 101
    .line 102
    const-wide/16 v5, 0x0

    .line 103
    .line 104
    const/4 v7, 0x0

    .line 105
    invoke-static/range {v2 .. v9}, Lh1/d;->Z(Lh1/d;JJFII)V

    .line 106
    .line 107
    .line 108
    iget-object v3, v10, Lxb/o;->h:Landroid/graphics/RuntimeShader;

    .line 109
    .line 110
    invoke-static {v3}, Lai/a;->e(Ljava/lang/Object;)Landroid/graphics/RuntimeShader;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    iget-object v4, v10, Lxb/o;->b:Lsh/j;

    .line 115
    .line 116
    invoke-interface {v1}, Lh1/d;->a()J

    .line 117
    .line 118
    .line 119
    move-result-wide v5

    .line 120
    new-instance v7, Le1/e;

    .line 121
    .line 122
    invoke-direct {v7, v5, v6}, Le1/e;-><init>(J)V

    .line 123
    .line 124
    .line 125
    iget-object v5, v10, Lxb/o;->f:Li/c;

    .line 126
    .line 127
    invoke-virtual {v5}, Li/c;->d()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v5

    .line 131
    invoke-virtual {v4, v7, v5}, Lsh/j;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    check-cast v4, Le1/b;

    .line 136
    .line 137
    iget-wide v4, v4, Le1/b;->a:J

    .line 138
    .line 139
    invoke-interface {v1}, Lh1/d;->a()J

    .line 140
    .line 141
    .line 142
    move-result-wide v6

    .line 143
    const/16 v8, 0x20

    .line 144
    .line 145
    shr-long/2addr v6, v8

    .line 146
    long-to-int v6, v6

    .line 147
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 148
    .line 149
    .line 150
    move-result v6

    .line 151
    invoke-interface {v1}, Lh1/d;->a()J

    .line 152
    .line 153
    .line 154
    move-result-wide v15

    .line 155
    const-wide v17, 0xffffffffL

    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    move/from16 p1, v8

    .line 161
    .line 162
    and-long v8, v15, v17

    .line 163
    .line 164
    long-to-int v7, v8

    .line 165
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 166
    .line 167
    .line 168
    move-result v7

    .line 169
    invoke-static {v3, v6, v7}, Lxb/k;->d(Landroid/graphics/RuntimeShader;FF)V

    .line 170
    .line 171
    .line 172
    const v6, 0x3df5c28f    # 0.12f

    .line 173
    .line 174
    .line 175
    mul-float/2addr v11, v6

    .line 176
    invoke-static {v13, v14, v11}, Lf1/w;->b(JF)J

    .line 177
    .line 178
    .line 179
    move-result-wide v6

    .line 180
    invoke-static {v6, v7}, Lf1/c0;->w(J)I

    .line 181
    .line 182
    .line 183
    move-result v6

    .line 184
    invoke-static {v3, v6}, Lxb/k;->e(Landroid/graphics/RuntimeShader;I)V

    .line 185
    .line 186
    .line 187
    invoke-interface {v1}, Lh1/d;->a()J

    .line 188
    .line 189
    .line 190
    move-result-wide v6

    .line 191
    invoke-static {v6, v7}, Le1/e;->b(J)F

    .line 192
    .line 193
    .line 194
    move-result v6

    .line 195
    const v7, 0x3f99999a    # 1.2f

    .line 196
    .line 197
    .line 198
    mul-float/2addr v6, v7

    .line 199
    invoke-static {v3, v6}, Lxb/k;->c(Landroid/graphics/RuntimeShader;F)V

    .line 200
    .line 201
    .line 202
    shr-long v6, v4, p1

    .line 203
    .line 204
    long-to-int v6, v6

    .line 205
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 206
    .line 207
    .line 208
    move-result v6

    .line 209
    invoke-interface {v1}, Lh1/d;->a()J

    .line 210
    .line 211
    .line 212
    move-result-wide v7

    .line 213
    shr-long v7, v7, p1

    .line 214
    .line 215
    long-to-int v7, v7

    .line 216
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 217
    .line 218
    .line 219
    move-result v7

    .line 220
    cmpg-float v8, v6, v12

    .line 221
    .line 222
    if-gez v8, :cond_0

    .line 223
    .line 224
    move v6, v12

    .line 225
    :cond_0
    cmpl-float v8, v6, v7

    .line 226
    .line 227
    if-lez v8, :cond_1

    .line 228
    .line 229
    goto :goto_1

    .line 230
    :cond_1
    move v7, v6

    .line 231
    :goto_1
    and-long v4, v4, v17

    .line 232
    .line 233
    long-to-int v4, v4

    .line 234
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 235
    .line 236
    .line 237
    move-result v4

    .line 238
    invoke-interface {v1}, Lh1/d;->a()J

    .line 239
    .line 240
    .line 241
    move-result-wide v5

    .line 242
    and-long v5, v5, v17

    .line 243
    .line 244
    long-to-int v1, v5

    .line 245
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 246
    .line 247
    .line 248
    move-result v1

    .line 249
    cmpg-float v5, v4, v12

    .line 250
    .line 251
    if-gez v5, :cond_2

    .line 252
    .line 253
    goto :goto_2

    .line 254
    :cond_2
    move v12, v4

    .line 255
    :goto_2
    cmpl-float v4, v12, v1

    .line 256
    .line 257
    if-lez v4, :cond_3

    .line 258
    .line 259
    goto :goto_3

    .line 260
    :cond_3
    move v1, v12

    .line 261
    :goto_3
    invoke-static {v3, v7, v1}, Lxb/k;->f(Landroid/graphics/RuntimeShader;FF)V

    .line 262
    .line 263
    .line 264
    iget-object v1, v10, Lxb/o;->h:Landroid/graphics/RuntimeShader;

    .line 265
    .line 266
    new-instance v3, Lf1/t;

    .line 267
    .line 268
    invoke-direct {v3, v1}, Lf1/t;-><init>(Landroid/graphics/Shader;)V

    .line 269
    .line 270
    .line 271
    const/16 v10, 0xc

    .line 272
    .line 273
    const/16 v11, 0x3e

    .line 274
    .line 275
    const-wide/16 v4, 0x0

    .line 276
    .line 277
    const-wide/16 v6, 0x0

    .line 278
    .line 279
    const/4 v8, 0x0

    .line 280
    const/4 v9, 0x0

    .line 281
    invoke-static/range {v2 .. v11}, Lh1/d;->V0(Lh1/d;Lf1/s;JJFLh1/c;II)V

    .line 282
    .line 283
    .line 284
    :cond_4
    invoke-virtual {v2}, Lx1/h0;->e()V

    .line 285
    .line 286
    .line 287
    goto/16 :goto_0

    .line 288
    .line 289
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
