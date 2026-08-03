.class public final Lwb/zp;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic h:I

.field public i:I

.field public final synthetic j:Li0/a1;

.field public final synthetic k:Z

.field public final synthetic l:Li0/a1;

.field public synthetic m:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/Object;

.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;

.field public final synthetic q:Ljava/lang/Object;

.field public final synthetic r:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lgb/o;ZLi0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Lwf/c;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lwb/zp;->h:I

    .line 3
    .line 4
    iput-object p1, p0, Lwb/zp;->m:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lwb/zp;->n:Ljava/lang/Object;

    .line 7
    .line 8
    iput-boolean p3, p0, Lwb/zp;->k:Z

    .line 9
    .line 10
    iput-object p4, p0, Lwb/zp;->j:Li0/a1;

    .line 11
    .line 12
    iput-object p5, p0, Lwb/zp;->l:Li0/a1;

    .line 13
    .line 14
    iput-object p6, p0, Lwb/zp;->o:Ljava/lang/Object;

    .line 15
    .line 16
    iput-object p7, p0, Lwb/zp;->p:Ljava/lang/Object;

    .line 17
    .line 18
    iput-object p8, p0, Lwb/zp;->q:Ljava/lang/Object;

    .line 19
    .line 20
    iput-object p9, p0, Lwb/zp;->r:Ljava/lang/Object;

    .line 21
    .line 22
    const/4 p1, 0x2

    .line 23
    invoke-direct {p0, p1, p10}, Lyf/i;-><init>(ILwf/c;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public constructor <init>(Li0/a1;Li/c;ZLp/r1;Lu2/c;Ly1/g2;Li/c;Li0/a1;Lwf/c;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lwb/zp;->h:I

    .line 27
    iput-object p1, p0, Lwb/zp;->j:Li0/a1;

    iput-object p2, p0, Lwb/zp;->n:Ljava/lang/Object;

    iput-boolean p3, p0, Lwb/zp;->k:Z

    iput-object p4, p0, Lwb/zp;->o:Ljava/lang/Object;

    iput-object p5, p0, Lwb/zp;->p:Ljava/lang/Object;

    iput-object p6, p0, Lwb/zp;->q:Ljava/lang/Object;

    iput-object p7, p0, Lwb/zp;->r:Ljava/lang/Object;

    iput-object p8, p0, Lwb/zp;->l:Li0/a1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p9}, Lyf/i;-><init>(ILwf/c;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lwf/c;)Lwf/c;
    .locals 13

    .line 1
    iget v0, p0, Lwb/zp;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v1, Lwb/zp;

    .line 7
    .line 8
    iget-object v0, p0, Lwb/zp;->n:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v3, v0

    .line 11
    check-cast v3, Li/c;

    .line 12
    .line 13
    iget-object v0, p0, Lwb/zp;->o:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v5, v0

    .line 16
    check-cast v5, Lp/r1;

    .line 17
    .line 18
    iget-object v0, p0, Lwb/zp;->p:Ljava/lang/Object;

    .line 19
    .line 20
    move-object v6, v0

    .line 21
    check-cast v6, Lu2/c;

    .line 22
    .line 23
    iget-object v0, p0, Lwb/zp;->q:Ljava/lang/Object;

    .line 24
    .line 25
    move-object v7, v0

    .line 26
    check-cast v7, Ly1/g2;

    .line 27
    .line 28
    iget-object v0, p0, Lwb/zp;->r:Ljava/lang/Object;

    .line 29
    .line 30
    move-object v8, v0

    .line 31
    check-cast v8, Li/c;

    .line 32
    .line 33
    iget-object v9, p0, Lwb/zp;->l:Li0/a1;

    .line 34
    .line 35
    iget-object v2, p0, Lwb/zp;->j:Li0/a1;

    .line 36
    .line 37
    iget-boolean v4, p0, Lwb/zp;->k:Z

    .line 38
    .line 39
    move-object v10, p2

    .line 40
    invoke-direct/range {v1 .. v10}, Lwb/zp;-><init>(Li0/a1;Li/c;ZLp/r1;Lu2/c;Ly1/g2;Li/c;Li0/a1;Lwf/c;)V

    .line 41
    .line 42
    .line 43
    iput-object p1, v1, Lwb/zp;->m:Ljava/lang/Object;

    .line 44
    .line 45
    return-object v1

    .line 46
    :pswitch_0
    move-object v10, p2

    .line 47
    new-instance v2, Lwb/zp;

    .line 48
    .line 49
    iget-object p1, p0, Lwb/zp;->m:Ljava/lang/Object;

    .line 50
    .line 51
    move-object v3, p1

    .line 52
    check-cast v3, Landroid/content/Context;

    .line 53
    .line 54
    iget-object p1, p0, Lwb/zp;->n:Ljava/lang/Object;

    .line 55
    .line 56
    move-object v4, p1

    .line 57
    check-cast v4, Lgb/o;

    .line 58
    .line 59
    iget-object p1, p0, Lwb/zp;->o:Ljava/lang/Object;

    .line 60
    .line 61
    move-object v8, p1

    .line 62
    check-cast v8, Li0/a1;

    .line 63
    .line 64
    iget-object p1, p0, Lwb/zp;->p:Ljava/lang/Object;

    .line 65
    .line 66
    move-object v9, p1

    .line 67
    check-cast v9, Li0/a1;

    .line 68
    .line 69
    iget-object p1, p0, Lwb/zp;->q:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast p1, Li0/a1;

    .line 72
    .line 73
    iget-object p2, p0, Lwb/zp;->r:Ljava/lang/Object;

    .line 74
    .line 75
    move-object v11, p2

    .line 76
    check-cast v11, Li0/a1;

    .line 77
    .line 78
    iget-boolean v5, p0, Lwb/zp;->k:Z

    .line 79
    .line 80
    iget-object v6, p0, Lwb/zp;->j:Li0/a1;

    .line 81
    .line 82
    iget-object v7, p0, Lwb/zp;->l:Li0/a1;

    .line 83
    .line 84
    move-object v12, v10

    .line 85
    move-object v10, p1

    .line 86
    invoke-direct/range {v2 .. v12}, Lwb/zp;-><init>(Landroid/content/Context;Lgb/o;ZLi0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Lwf/c;)V

    .line 87
    .line 88
    .line 89
    return-object v2

    .line 90
    nop

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lwb/zp;->h:I

    .line 2
    .line 3
    check-cast p1, Lqg/t;

    .line 4
    .line 5
    check-cast p2, Lwf/c;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Lwb/zp;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lwb/zp;

    .line 15
    .line 16
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lwb/zp;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lwb/zp;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lwb/zp;

    .line 28
    .line 29
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Lwb/zp;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v4, p0

    .line 2
    .line 3
    iget v0, v4, Lwb/zp;->h:I

    .line 4
    .line 5
    iget-boolean v1, v4, Lwb/zp;->k:Z

    .line 6
    .line 7
    iget-object v2, v4, Lwb/zp;->n:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v3, v4, Lwb/zp;->l:Li0/a1;

    .line 10
    .line 11
    const-string v5, "call to \'resume\' before \'invoke\' with coroutine"

    .line 12
    .line 13
    sget-object v6, Lxf/a;->g:Lxf/a;

    .line 14
    .line 15
    iget-object v7, v4, Lwb/zp;->r:Ljava/lang/Object;

    .line 16
    .line 17
    iget-object v8, v4, Lwb/zp;->j:Li0/a1;

    .line 18
    .line 19
    sget-object v9, Lsf/n;->a:Lsf/n;

    .line 20
    .line 21
    const/4 v10, 0x1

    .line 22
    const/4 v11, 0x0

    .line 23
    packed-switch v0, :pswitch_data_0

    .line 24
    .line 25
    .line 26
    check-cast v7, Li/c;

    .line 27
    .line 28
    iget-object v0, v4, Lwb/zp;->m:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, Lqg/t;

    .line 31
    .line 32
    iget v12, v4, Lwb/zp;->i:I

    .line 33
    .line 34
    const/4 v13, 0x3

    .line 35
    if-eqz v12, :cond_5

    .line 36
    .line 37
    if-eq v12, v10, :cond_4

    .line 38
    .line 39
    const/4 v0, 0x2

    .line 40
    if-eq v12, v0, :cond_1

    .line 41
    .line 42
    if-ne v12, v13, :cond_0

    .line 43
    .line 44
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    invoke-static {v5}, Lj8/o;->A(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    move-object v6, v11

    .line 52
    goto/16 :goto_3

    .line 53
    .line 54
    :cond_1
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iput-object v11, v4, Lwb/zp;->m:Ljava/lang/Object;

    .line 58
    .line 59
    iput v13, v4, Lwb/zp;->i:I

    .line 60
    .line 61
    invoke-virtual {v7, v4}, Li/c;->f(Lyf/i;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    if-ne v0, v6, :cond_2

    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_2
    :goto_0
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 69
    .line 70
    invoke-interface {v8, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    check-cast v0, Lfg/a;

    .line 78
    .line 79
    if-eqz v0, :cond_3

    .line 80
    .line 81
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    :cond_3
    :goto_1
    move-object v6, v9

    .line 85
    goto :goto_3

    .line 86
    :cond_4
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_5
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 94
    .line 95
    invoke-interface {v8, v3}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    new-instance v3, Lwb/n3;

    .line 99
    .line 100
    invoke-direct {v3, v7, v11, v10}, Lwb/n3;-><init>(Li/c;Lwf/c;I)V

    .line 101
    .line 102
    .line 103
    invoke-static {v0, v11, v3, v13}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 104
    .line 105
    .line 106
    move-object v0, v2

    .line 107
    check-cast v0, Li/c;

    .line 108
    .line 109
    move v12, v1

    .line 110
    new-instance v1, Ljava/lang/Float;

    .line 111
    .line 112
    const/high16 v2, 0x3f800000    # 1.0f

    .line 113
    .line 114
    invoke-direct {v1, v2}, Ljava/lang/Float;-><init>(F)V

    .line 115
    .line 116
    .line 117
    if-eqz v12, :cond_6

    .line 118
    .line 119
    const-wide v2, 0x401921fb54442d18L    # 6.283185307179586

    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    const v5, 0x3e99999a    # 0.3f

    .line 125
    .line 126
    .line 127
    float-to-double v7, v5

    .line 128
    div-double/2addr v2, v7

    .line 129
    mul-double/2addr v2, v2

    .line 130
    double-to-float v2, v2

    .line 131
    const/4 v3, 0x4

    .line 132
    const v5, 0x3f666666    # 0.9f

    .line 133
    .line 134
    .line 135
    invoke-static {v5, v2, v11, v3}, Li/d;->o(FFLjava/lang/Object;I)Li/r0;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    goto :goto_2

    .line 140
    :cond_6
    new-instance v2, Ljava/lang/Float;

    .line 141
    .line 142
    const v3, 0x38d1b717    # 1.0E-4f

    .line 143
    .line 144
    .line 145
    invoke-direct {v2, v3}, Ljava/lang/Float;-><init>(F)V

    .line 146
    .line 147
    .line 148
    new-instance v3, Li/r0;

    .line 149
    .line 150
    const v5, 0x3f6147ae    # 0.88f

    .line 151
    .line 152
    .line 153
    const/high16 v7, 0x43e10000    # 450.0f

    .line 154
    .line 155
    invoke-direct {v3, v5, v7, v2}, Li/r0;-><init>(FFLjava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    move-object v2, v3

    .line 159
    :goto_2
    iput-object v11, v4, Lwb/zp;->m:Ljava/lang/Object;

    .line 160
    .line 161
    iput v10, v4, Lwb/zp;->i:I

    .line 162
    .line 163
    const/4 v3, 0x0

    .line 164
    const/16 v5, 0xc

    .line 165
    .line 166
    invoke-static/range {v0 .. v5}, Li/c;->c(Li/c;Ljava/lang/Object;Li/k;Lfg/l;Lwf/c;I)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    if-ne v0, v6, :cond_3

    .line 171
    .line 172
    :goto_3
    return-object v6

    .line 173
    :pswitch_0
    move v12, v1

    .line 174
    check-cast v2, Lgb/o;

    .line 175
    .line 176
    iget-object v0, v4, Lwb/zp;->m:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast v0, Landroid/content/Context;

    .line 179
    .line 180
    iget v1, v4, Lwb/zp;->i:I

    .line 181
    .line 182
    if-eqz v1, :cond_8

    .line 183
    .line 184
    if-ne v1, v10, :cond_7

    .line 185
    .line 186
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    move-object/from16 v1, p1

    .line 190
    .line 191
    goto :goto_4

    .line 192
    :cond_7
    invoke-static {v5}, Lj8/o;->A(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    move-object v6, v11

    .line 196
    goto/16 :goto_c

    .line 197
    .line 198
    :cond_8
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    sget-object v1, Lqg/c0;->a:Lxg/e;

    .line 202
    .line 203
    sget-object v1, Lxg/d;->i:Lxg/d;

    .line 204
    .line 205
    new-instance v5, Lwb/yp;

    .line 206
    .line 207
    invoke-direct {v5, v0, v2, v12, v11}, Lwb/yp;-><init>(Landroid/content/Context;Lgb/o;ZLwf/c;)V

    .line 208
    .line 209
    .line 210
    iput v10, v4, Lwb/zp;->i:I

    .line 211
    .line 212
    invoke-static {v1, v5, v4}, Lqg/v;->x(Lwf/g;Lfg/p;Lwf/c;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    if-ne v1, v6, :cond_9

    .line 217
    .line 218
    goto/16 :goto_c

    .line 219
    .line 220
    :cond_9
    :goto_4
    check-cast v1, Lsf/g;

    .line 221
    .line 222
    iget-object v1, v1, Lsf/g;->g:Ljava/lang/Object;

    .line 223
    .line 224
    iget-object v5, v4, Lwb/zp;->o:Ljava/lang/Object;

    .line 225
    .line 226
    check-cast v5, Li0/a1;

    .line 227
    .line 228
    iget-object v6, v4, Lwb/zp;->p:Ljava/lang/Object;

    .line 229
    .line 230
    check-cast v6, Li0/a1;

    .line 231
    .line 232
    iget-object v10, v4, Lwb/zp;->q:Ljava/lang/Object;

    .line 233
    .line 234
    check-cast v10, Li0/a1;

    .line 235
    .line 236
    invoke-static {v1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 237
    .line 238
    .line 239
    move-result-object v12

    .line 240
    if-nez v12, :cond_10

    .line 241
    .line 242
    check-cast v1, Lgb/i;

    .line 243
    .line 244
    sget-object v12, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 245
    .line 246
    invoke-interface {v8, v12}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 247
    .line 248
    .line 249
    iget-object v8, v1, Lgb/i;->d:Ljava/lang/Long;

    .line 250
    .line 251
    if-eqz v8, :cond_e

    .line 252
    .line 253
    invoke-virtual {v8}, Ljava/lang/Number;->longValue()J

    .line 254
    .line 255
    .line 256
    move-result-wide v13

    .line 257
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v8

    .line 261
    move-object v12, v8

    .line 262
    check-cast v12, Lgb/o;

    .line 263
    .line 264
    if-eqz v12, :cond_a

    .line 265
    .line 266
    const-wide/16 v17, 0x0

    .line 267
    .line 268
    const/16 v19, 0xf7f

    .line 269
    .line 270
    const-wide/16 v15, 0x0

    .line 271
    .line 272
    invoke-static/range {v12 .. v19}, Lgb/o;->a(Lgb/o;JJJI)Lgb/o;

    .line 273
    .line 274
    .line 275
    move-result-object v8

    .line 276
    goto :goto_5

    .line 277
    :cond_a
    move-object v8, v11

    .line 278
    :goto_5
    invoke-interface {v3, v8}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 279
    .line 280
    .line 281
    invoke-interface {v5}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v3

    .line 285
    move-object v12, v3

    .line 286
    check-cast v12, Lgb/o;

    .line 287
    .line 288
    if-eqz v12, :cond_b

    .line 289
    .line 290
    const-wide/16 v17, 0x0

    .line 291
    .line 292
    const/16 v19, 0xf7f

    .line 293
    .line 294
    const-wide/16 v15, 0x0

    .line 295
    .line 296
    invoke-static/range {v12 .. v19}, Lgb/o;->a(Lgb/o;JJJI)Lgb/o;

    .line 297
    .line 298
    .line 299
    move-result-object v3

    .line 300
    goto :goto_6

    .line 301
    :cond_b
    move-object v3, v11

    .line 302
    :goto_6
    invoke-interface {v5, v3}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 303
    .line 304
    .line 305
    invoke-interface {v6}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object v3

    .line 309
    check-cast v3, Ljava/util/List;

    .line 310
    .line 311
    new-instance v5, Ljava/util/ArrayList;

    .line 312
    .line 313
    invoke-static {v3}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 314
    .line 315
    .line 316
    move-result v8

    .line 317
    invoke-direct {v5, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 318
    .line 319
    .line 320
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 321
    .line 322
    .line 323
    move-result-object v3

    .line 324
    :goto_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 325
    .line 326
    .line 327
    move-result v8

    .line 328
    if-eqz v8, :cond_d

    .line 329
    .line 330
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v8

    .line 334
    move-object v12, v8

    .line 335
    check-cast v12, Lgb/o;

    .line 336
    .line 337
    iget-object v8, v12, Lgb/o;->a:Ljava/lang/String;

    .line 338
    .line 339
    iget-object v15, v2, Lgb/o;->a:Ljava/lang/String;

    .line 340
    .line 341
    invoke-virtual {v8, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 342
    .line 343
    .line 344
    move-result v8

    .line 345
    if-eqz v8, :cond_c

    .line 346
    .line 347
    const-wide/16 v17, 0x0

    .line 348
    .line 349
    const/16 v19, 0xf7f

    .line 350
    .line 351
    const-wide/16 v15, 0x0

    .line 352
    .line 353
    invoke-static/range {v12 .. v19}, Lgb/o;->a(Lgb/o;JJJI)Lgb/o;

    .line 354
    .line 355
    .line 356
    move-result-object v12

    .line 357
    :cond_c
    invoke-virtual {v5, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 358
    .line 359
    .line 360
    goto :goto_7

    .line 361
    :cond_d
    invoke-interface {v6, v5}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 362
    .line 363
    .line 364
    :cond_e
    iget-boolean v1, v1, Lgb/i;->c:Z

    .line 365
    .line 366
    if-eqz v1, :cond_f

    .line 367
    .line 368
    const-string v1, "\u66f4\u65b0\u6210\u529f\uff0c\u63d2\u4ef6\u5df2\u4fdd\u6301\u7981\u7528"

    .line 369
    .line 370
    goto :goto_8

    .line 371
    :cond_f
    const-string v1, "\u5b89\u88c5\u6210\u529f\uff0c\u63d2\u4ef6\u9ed8\u8ba4\u7981\u7528"

    .line 372
    .line 373
    :goto_8
    invoke-interface {v10, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 374
    .line 375
    .line 376
    invoke-interface {v10}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object v1

    .line 380
    check-cast v1, Ljava/lang/String;

    .line 381
    .line 382
    const/4 v2, 0x0

    .line 383
    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 384
    .line 385
    .line 386
    move-result-object v0

    .line 387
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 388
    .line 389
    .line 390
    goto :goto_b

    .line 391
    :cond_10
    instance-of v0, v12, Lgb/f;

    .line 392
    .line 393
    if-eqz v0, :cond_11

    .line 394
    .line 395
    move-object v0, v12

    .line 396
    check-cast v0, Lgb/f;

    .line 397
    .line 398
    iget-object v0, v0, Lgb/f;->g:Ljava/lang/String;

    .line 399
    .line 400
    const-string v1, "UPLOADER_BLACKLISTED"

    .line 401
    .line 402
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 403
    .line 404
    .line 405
    move-result v0

    .line 406
    if-eqz v0, :cond_11

    .line 407
    .line 408
    const-string v0, "\u5f53\u524d\u5fae\u4fe1\u8d26\u53f7\u5df2\u88ab\u7981\u6b62\u4e0a\u4f20\u5728\u7ebf\u63d2\u4ef6"

    .line 409
    .line 410
    goto :goto_a

    .line 411
    :cond_11
    invoke-virtual {v12}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object v0

    .line 415
    if-eqz v0, :cond_12

    .line 416
    .line 417
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 418
    .line 419
    .line 420
    move-result-object v0

    .line 421
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object v0

    .line 425
    goto :goto_9

    .line 426
    :cond_12
    move-object v0, v11

    .line 427
    :goto_9
    if-eqz v0, :cond_13

    .line 428
    .line 429
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 430
    .line 431
    .line 432
    move-result v1

    .line 433
    if-eqz v1, :cond_14

    .line 434
    .line 435
    :cond_13
    move-object v0, v11

    .line 436
    :cond_14
    if-eqz v0, :cond_15

    .line 437
    .line 438
    goto :goto_a

    .line 439
    :cond_15
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 440
    .line 441
    .line 442
    move-result-object v0

    .line 443
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 444
    .line 445
    .line 446
    move-result-object v0

    .line 447
    :goto_a
    const-string v1, "\u5b89\u88c5\u5931\u8d25: "

    .line 448
    .line 449
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 450
    .line 451
    .line 452
    move-result-object v0

    .line 453
    invoke-interface {v10, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 454
    .line 455
    .line 456
    :goto_b
    check-cast v7, Li0/a1;

    .line 457
    .line 458
    invoke-interface {v7, v11}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 459
    .line 460
    .line 461
    move-object v6, v9

    .line 462
    :goto_c
    return-object v6

    .line 463
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
