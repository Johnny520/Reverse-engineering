.class public final Lr71;
.super Loe0;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lr50;
.implements Ltq;
.implements Lvz0;


# instance fields
.field public A:Lp71;

.field public B:Lq71;

.field public r:Ljava/lang/String;

.field public s:Ls71;

.field public t:Ljv;

.field public u:I

.field public v:Z

.field public w:I

.field public x:I

.field public y:Ljava/util/HashMap;

.field public z:Lzo0;


# virtual methods
.method public final B(Ld60;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-boolean v1, v0, Loe0;->q:Z

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    goto/16 :goto_4

    .line 8
    .line 9
    :cond_0
    iget-object v1, v0, Lr71;->B:Lq71;

    .line 10
    .line 11
    if-eqz v1, :cond_2

    .line 12
    .line 13
    iget-boolean v2, v1, Lq71;->c:Z

    .line 14
    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    const/4 v1, 0x0

    .line 19
    :goto_0
    if-eqz v1, :cond_2

    .line 20
    .line 21
    iget-object v1, v1, Lq71;->d:Lzo0;

    .line 22
    .line 23
    if-nez v1, :cond_3

    .line 24
    .line 25
    :cond_2
    invoke-virtual {v0}, Lr71;->w0()Lzo0;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    :cond_3
    iget-object v2, v1, Lzo0;->j:Ly5;

    .line 30
    .line 31
    if-eqz v2, :cond_d

    .line 32
    .line 33
    move-object/from16 v3, p1

    .line 34
    .line 35
    iget-object v3, v3, Ld60;->d:Ldd;

    .line 36
    .line 37
    iget-object v3, v3, Ldd;->e:Lo8;

    .line 38
    .line 39
    invoke-virtual {v3}, Lo8;->f()Lbd;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    iget-boolean v3, v1, Lzo0;->k:Z

    .line 44
    .line 45
    const-wide v10, 0xffffffffL

    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    const/16 v12, 0x20

    .line 51
    .line 52
    if-eqz v3, :cond_4

    .line 53
    .line 54
    iget-wide v5, v1, Lzo0;->l:J

    .line 55
    .line 56
    shr-long v7, v5, v12

    .line 57
    .line 58
    long-to-int v1, v7

    .line 59
    int-to-float v7, v1

    .line 60
    and-long/2addr v5, v10

    .line 61
    long-to-int v1, v5

    .line 62
    int-to-float v8, v1

    .line 63
    invoke-interface {v4}, Lbd;->i()V

    .line 64
    .line 65
    .line 66
    const/4 v6, 0x0

    .line 67
    const/4 v9, 0x1

    .line 68
    const/4 v5, 0x0

    .line 69
    invoke-interface/range {v4 .. v9}, Lbd;->d(FFFFI)V

    .line 70
    .line 71
    .line 72
    :cond_4
    :try_start_0
    iget-object v1, v0, Lr71;->s:Ls71;

    .line 73
    .line 74
    iget-object v1, v1, Ls71;->a:Lj31;

    .line 75
    .line 76
    iget-object v5, v1, Lj31;->m:Lu61;

    .line 77
    .line 78
    if-nez v5, :cond_5

    .line 79
    .line 80
    sget-object v5, Lu61;->b:Lu61;

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :catchall_0
    move-exception v0

    .line 84
    goto/16 :goto_5

    .line 85
    .line 86
    :cond_5
    :goto_1
    iget-object v6, v1, Lj31;->n:Lv01;

    .line 87
    .line 88
    if-nez v6, :cond_6

    .line 89
    .line 90
    sget-object v6, Lv01;->d:Lv01;

    .line 91
    .line 92
    :cond_6
    iget-object v7, v1, Lj31;->o:Lo30;

    .line 93
    .line 94
    if-nez v7, :cond_7

    .line 95
    .line 96
    sget-object v7, Lqt;->Q:Lqt;

    .line 97
    .line 98
    :cond_7
    iget-object v1, v1, Lj31;->a:Lx61;

    .line 99
    .line 100
    invoke-interface {v1}, Lx61;->e()Lpf1;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    const/4 v8, 0x3

    .line 105
    if-eqz v1, :cond_8

    .line 106
    .line 107
    iget-object v0, v0, Lr71;->s:Ls71;

    .line 108
    .line 109
    iget-object v0, v0, Ls71;->a:Lj31;

    .line 110
    .line 111
    iget-object v0, v0, Lj31;->a:Lx61;

    .line 112
    .line 113
    invoke-interface {v0}, Lx61;->f()F

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    iget-object v9, v2, Ly5;->a:Lc6;

    .line 118
    .line 119
    iget-object v9, v9, Lc6;->g:Lm6;

    .line 120
    .line 121
    iget v13, v9, Lm6;->c:I

    .line 122
    .line 123
    invoke-virtual {v2}, Ly5;->c()F

    .line 124
    .line 125
    .line 126
    move-result v14

    .line 127
    invoke-virtual {v2}, Ly5;->b()F

    .line 128
    .line 129
    .line 130
    move-result v15

    .line 131
    invoke-static {v14}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 132
    .line 133
    .line 134
    move-result v14

    .line 135
    move-wide/from16 v16, v10

    .line 136
    .line 137
    int-to-long v10, v14

    .line 138
    invoke-static {v15}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 139
    .line 140
    .line 141
    move-result v14

    .line 142
    int-to-long v14, v14

    .line 143
    shl-long/2addr v10, v12

    .line 144
    and-long v14, v14, v16

    .line 145
    .line 146
    or-long/2addr v10, v14

    .line 147
    invoke-virtual {v9, v1, v10, v11, v0}, Lm6;->c(Lpf1;JF)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v9, v6}, Lm6;->f(Lv01;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v9, v5}, Lm6;->g(Lu61;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v9, v7}, Lm6;->e(Lo30;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v9, v8}, Lm6;->b(I)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v2, v4}, Ly5;->d(Lbd;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v9, v13}, Lm6;->b(I)V

    .line 166
    .line 167
    .line 168
    goto :goto_3

    .line 169
    :cond_8
    sget-wide v9, Lff;->g:J

    .line 170
    .line 171
    const-wide/16 v11, 0x10

    .line 172
    .line 173
    cmp-long v1, v9, v11

    .line 174
    .line 175
    if-eqz v1, :cond_9

    .line 176
    .line 177
    goto :goto_2

    .line 178
    :cond_9
    iget-object v1, v0, Lr71;->s:Ls71;

    .line 179
    .line 180
    invoke-virtual {v1}, Ls71;->b()J

    .line 181
    .line 182
    .line 183
    move-result-wide v9

    .line 184
    cmp-long v1, v9, v11

    .line 185
    .line 186
    if-eqz v1, :cond_a

    .line 187
    .line 188
    iget-object v0, v0, Lr71;->s:Ls71;

    .line 189
    .line 190
    invoke-virtual {v0}, Ls71;->b()J

    .line 191
    .line 192
    .line 193
    move-result-wide v9

    .line 194
    goto :goto_2

    .line 195
    :cond_a
    sget-wide v9, Lff;->b:J

    .line 196
    .line 197
    :goto_2
    iget-object v0, v2, Ly5;->a:Lc6;

    .line 198
    .line 199
    iget-object v0, v0, Lc6;->g:Lm6;

    .line 200
    .line 201
    iget v1, v0, Lm6;->c:I

    .line 202
    .line 203
    invoke-virtual {v0, v9, v10}, Lm6;->d(J)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v0, v6}, Lm6;->f(Lv01;)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v0, v5}, Lm6;->g(Lu61;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v0, v7}, Lm6;->e(Lo30;)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v0, v8}, Lm6;->b(I)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v2, v4}, Ly5;->d(Lbd;)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v0, v1}, Lm6;->b(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 222
    .line 223
    .line 224
    :goto_3
    if-eqz v3, :cond_b

    .line 225
    .line 226
    invoke-interface {v4}, Lbd;->g()V

    .line 227
    .line 228
    .line 229
    :cond_b
    :goto_4
    return-void

    .line 230
    :goto_5
    if-eqz v3, :cond_c

    .line 231
    .line 232
    invoke-interface {v4}, Lbd;->g()V

    .line 233
    .line 234
    .line 235
    :cond_c
    throw v0

    .line 236
    :cond_d
    new-instance v1, Ljava/lang/StringBuilder;

    .line 237
    .line 238
    const-string v2, "Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache="

    .line 239
    .line 240
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    iget-object v2, v0, Lr71;->z:Lzo0;

    .line 244
    .line 245
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    const-string v2, ", textSubstitution="

    .line 249
    .line 250
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    iget-object v0, v0, Lr71;->B:Lq71;

    .line 254
    .line 255
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 256
    .line 257
    .line 258
    const/16 v0, 0x29

    .line 259
    .line 260
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    invoke-static {v0}, Lz10;->b(Ljava/lang/String;)Ljava/lang/Void;

    .line 268
    .line 269
    .line 270
    new-instance v0, Lsg;

    .line 271
    .line 272
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 273
    .line 274
    .line 275
    throw v0
.end method

.method public final G(Lyb0;Lsd0;I)I
    .locals 0

    .line 1
    iget-object p2, p0, Lr71;->B:Lq71;

    .line 2
    .line 3
    if-eqz p2, :cond_1

    .line 4
    .line 5
    iget-boolean p3, p2, Lq71;->c:Z

    .line 6
    .line 7
    if-eqz p3, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p2, 0x0

    .line 11
    :goto_0
    if-eqz p2, :cond_1

    .line 12
    .line 13
    iget-object p2, p2, Lq71;->d:Lzo0;

    .line 14
    .line 15
    if-nez p2, :cond_2

    .line 16
    .line 17
    :cond_1
    invoke-virtual {p0}, Lr71;->w0()Lzo0;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    :cond_2
    invoke-virtual {p2, p1}, Lzo0;->d(Lym;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {p1}, Ll30;->getLayoutDirection()Lk50;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p2, p0}, Lzo0;->e(Lk50;)Lyo0;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-interface {p0}, Lyo0;->a()F

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    invoke-static {p0}, Lv50;->e(F)I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    return p0
.end method

.method public final S(Lf01;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lr71;->A:Lp71;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lp71;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v0, p0, v1}, Lp71;-><init>(Lr71;I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lr71;->A:Lp71;

    .line 12
    .line 13
    :cond_0
    new-instance v1, Lf8;

    .line 14
    .line 15
    iget-object v2, p0, Lr71;->r:Ljava/lang/String;

    .line 16
    .line 17
    invoke-direct {v1, v2}, Lf8;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    sget-object v2, Ld01;->a:[Lu40;

    .line 21
    .line 22
    sget-object v2, Lb01;->A:Le01;

    .line 23
    .line 24
    invoke-static {v1}, Lo30;->v(Ljava/lang/Object;)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-interface {p1, v2, v1}, Lf01;->a(Le01;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, Lr71;->B:Lq71;

    .line 32
    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    iget-boolean v2, v1, Lq71;->c:Z

    .line 36
    .line 37
    sget-object v3, Lb01;->C:Le01;

    .line 38
    .line 39
    sget-object v4, Ld01;->a:[Lu40;

    .line 40
    .line 41
    const/16 v5, 0x11

    .line 42
    .line 43
    aget-object v5, v4, v5

    .line 44
    .line 45
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-interface {p1, v3, v2}, Lf01;->a(Le01;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    new-instance v2, Lf8;

    .line 53
    .line 54
    iget-object v1, v1, Lq71;->b:Ljava/lang/String;

    .line 55
    .line 56
    invoke-direct {v2, v1}, Lf8;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sget-object v1, Lb01;->B:Le01;

    .line 60
    .line 61
    const/16 v3, 0x10

    .line 62
    .line 63
    aget-object v3, v4, v3

    .line 64
    .line 65
    invoke-interface {p1, v1, v2}, Lf01;->a(Le01;Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    :cond_1
    new-instance v1, Lp71;

    .line 69
    .line 70
    const/4 v2, 0x1

    .line 71
    invoke-direct {v1, p0, v2}, Lp71;-><init>(Lr71;I)V

    .line 72
    .line 73
    .line 74
    sget-object v2, Lrz0;->l:Le01;

    .line 75
    .line 76
    new-instance v3, Lo0;

    .line 77
    .line 78
    const/4 v4, 0x0

    .line 79
    invoke-direct {v3, v4, v1}, Lo0;-><init>(Ljava/lang/String;Lex;)V

    .line 80
    .line 81
    .line 82
    invoke-interface {p1, v2, v3}, Lf01;->a(Le01;Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    new-instance v1, Lp71;

    .line 86
    .line 87
    const/4 v2, 0x2

    .line 88
    invoke-direct {v1, p0, v2}, Lp71;-><init>(Lr71;I)V

    .line 89
    .line 90
    .line 91
    sget-object v2, Lrz0;->m:Le01;

    .line 92
    .line 93
    new-instance v3, Lo0;

    .line 94
    .line 95
    invoke-direct {v3, v4, v1}, Lo0;-><init>(Ljava/lang/String;Lex;)V

    .line 96
    .line 97
    .line 98
    invoke-interface {p1, v2, v3}, Lf01;->a(Le01;Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    new-instance v1, Lk6;

    .line 102
    .line 103
    const/16 v2, 0xe

    .line 104
    .line 105
    invoke-direct {v1, v2, p0}, Lk6;-><init>(ILjava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    sget-object p0, Lrz0;->n:Le01;

    .line 109
    .line 110
    new-instance v2, Lo0;

    .line 111
    .line 112
    invoke-direct {v2, v4, v1}, Lo0;-><init>(Ljava/lang/String;Lex;)V

    .line 113
    .line 114
    .line 115
    invoke-interface {p1, p0, v2}, Lf01;->a(Le01;Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    sget-object p0, Lrz0;->a:Le01;

    .line 119
    .line 120
    new-instance v1, Lo0;

    .line 121
    .line 122
    invoke-direct {v1, v4, v0}, Lo0;-><init>(Ljava/lang/String;Lex;)V

    .line 123
    .line 124
    .line 125
    invoke-interface {p1, p0, v1}, Lf01;->a(Le01;Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    return-void
.end method

.method public final Y(Lzd0;Lsd0;J)Lyd0;
    .locals 4

    .line 1
    const-string v0, "TextStringSimpleNode::measure"

    .line 2
    .line 3
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object v0, p0, Lr71;->B:Lq71;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-boolean v1, v0, Lq71;->c:Z

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    :goto_0
    if-eqz v0, :cond_1

    .line 17
    .line 18
    iget-object v0, v0, Lq71;->d:Lzo0;

    .line 19
    .line 20
    if-nez v0, :cond_2

    .line 21
    .line 22
    :cond_1
    invoke-virtual {p0}, Lr71;->w0()Lzo0;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    :cond_2
    invoke-virtual {v0, p1}, Lzo0;->d(Lym;)V

    .line 27
    .line 28
    .line 29
    invoke-interface {p1}, Ll30;->getLayoutDirection()Lk50;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v0, p3, p4, v1}, Lzo0;->b(JLk50;)Z

    .line 34
    .line 35
    .line 36
    move-result p3

    .line 37
    iget-object p4, v0, Lzo0;->n:Lyo0;

    .line 38
    .line 39
    if-eqz p4, :cond_3

    .line 40
    .line 41
    invoke-interface {p4}, Lyo0;->b()Z

    .line 42
    .line 43
    .line 44
    :cond_3
    iget-object p4, v0, Lzo0;->j:Ly5;

    .line 45
    .line 46
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    iget-object p4, p4, Ly5;->d:Le71;

    .line 50
    .line 51
    iget-wide v0, v0, Lzo0;->l:J

    .line 52
    .line 53
    if-eqz p3, :cond_5

    .line 54
    .line 55
    const/4 p3, 0x2

    .line 56
    invoke-static {p0, p3}, Lpf1;->O(Lrm;I)Lqj0;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-virtual {v2}, Lqj0;->N0()V

    .line 61
    .line 62
    .line 63
    iget-object v2, p0, Lr71;->y:Ljava/util/HashMap;

    .line 64
    .line 65
    if-nez v2, :cond_4

    .line 66
    .line 67
    new-instance v2, Ljava/util/HashMap;

    .line 68
    .line 69
    invoke-direct {v2, p3}, Ljava/util/HashMap;-><init>(I)V

    .line 70
    .line 71
    .line 72
    iput-object v2, p0, Lr71;->y:Ljava/util/HashMap;

    .line 73
    .line 74
    :cond_4
    sget-object p3, Lr2;->a:Lcz;

    .line 75
    .line 76
    const/4 v3, 0x0

    .line 77
    invoke-virtual {p4, v3}, Le71;->c(I)F

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    invoke-interface {v2, p3, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    sget-object p3, Lr2;->b:Lcz;

    .line 93
    .line 94
    iget v3, p4, Le71;->f:I

    .line 95
    .line 96
    add-int/lit8 v3, v3, -0x1

    .line 97
    .line 98
    invoke-virtual {p4, v3}, Le71;->c(I)F

    .line 99
    .line 100
    .line 101
    move-result p4

    .line 102
    invoke-static {p4}, Ljava/lang/Math;->round(F)I

    .line 103
    .line 104
    .line 105
    move-result p4

    .line 106
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 107
    .line 108
    .line 109
    move-result-object p4

    .line 110
    invoke-interface {v2, p3, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    :cond_5
    const/16 p3, 0x20

    .line 114
    .line 115
    shr-long p3, v0, p3

    .line 116
    .line 117
    long-to-int p3, p3

    .line 118
    const-wide v2, 0xffffffffL

    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    and-long/2addr v0, v2

    .line 124
    long-to-int p4, v0

    .line 125
    invoke-static {p3, p3, p4, p4}, Lo30;->o(IIII)J

    .line 126
    .line 127
    .line 128
    move-result-wide v0

    .line 129
    invoke-interface {p2, v0, v1}, Lsd0;->e(J)Lxq0;

    .line 130
    .line 131
    .line 132
    move-result-object p2

    .line 133
    iget-object p0, p0, Lr71;->y:Ljava/util/HashMap;

    .line 134
    .line 135
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    new-instance v0, Lx9;

    .line 139
    .line 140
    const/4 v1, 0x5

    .line 141
    invoke-direct {v0, p2, v1}, Lx9;-><init>(Lxq0;I)V

    .line 142
    .line 143
    .line 144
    invoke-interface {p1, p3, p4, p0, v0}, Lzd0;->Q(IILjava/util/Map;Lsw;)Lyd0;

    .line 145
    .line 146
    .line 147
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 148
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 149
    .line 150
    .line 151
    return-object p0

    .line 152
    :catchall_0
    move-exception p0

    .line 153
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 154
    .line 155
    .line 156
    throw p0
.end method

.method public final d(Lyb0;Lsd0;I)I
    .locals 0

    .line 1
    iget-object p2, p0, Lr71;->B:Lq71;

    .line 2
    .line 3
    if-eqz p2, :cond_1

    .line 4
    .line 5
    iget-boolean p3, p2, Lq71;->c:Z

    .line 6
    .line 7
    if-eqz p3, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p2, 0x0

    .line 11
    :goto_0
    if-eqz p2, :cond_1

    .line 12
    .line 13
    iget-object p2, p2, Lq71;->d:Lzo0;

    .line 14
    .line 15
    if-nez p2, :cond_2

    .line 16
    .line 17
    :cond_1
    invoke-virtual {p0}, Lr71;->w0()Lzo0;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    :cond_2
    invoke-virtual {p2, p1}, Lzo0;->d(Lym;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {p1}, Ll30;->getLayoutDirection()Lk50;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p2, p0}, Lzo0;->e(Lk50;)Lyo0;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-interface {p0}, Lyo0;->c()F

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    invoke-static {p0}, Lv50;->e(F)I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    return p0
.end method

.method public final i(Lyb0;Lsd0;I)I
    .locals 1

    .line 1
    iget-object p2, p0, Lr71;->B:Lq71;

    .line 2
    .line 3
    if-eqz p2, :cond_1

    .line 4
    .line 5
    iget-boolean v0, p2, Lq71;->c:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p2, 0x0

    .line 11
    :goto_0
    if-eqz p2, :cond_1

    .line 12
    .line 13
    iget-object p2, p2, Lq71;->d:Lzo0;

    .line 14
    .line 15
    if-nez p2, :cond_2

    .line 16
    .line 17
    :cond_1
    invoke-virtual {p0}, Lr71;->w0()Lzo0;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    :cond_2
    invoke-virtual {p2, p1}, Lzo0;->d(Lym;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {p1}, Ll30;->getLayoutDirection()Lk50;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p2, p3, p0}, Lzo0;->a(ILk50;)I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    return p0
.end method

.method public final l0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final s(Lyb0;Lsd0;I)I
    .locals 1

    .line 1
    iget-object p2, p0, Lr71;->B:Lq71;

    .line 2
    .line 3
    if-eqz p2, :cond_1

    .line 4
    .line 5
    iget-boolean v0, p2, Lq71;->c:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p2, 0x0

    .line 11
    :goto_0
    if-eqz p2, :cond_1

    .line 12
    .line 13
    iget-object p2, p2, Lq71;->d:Lzo0;

    .line 14
    .line 15
    if-nez p2, :cond_2

    .line 16
    .line 17
    :cond_1
    invoke-virtual {p0}, Lr71;->w0()Lzo0;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    :cond_2
    invoke-virtual {p2, p1}, Lzo0;->d(Lym;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {p1}, Ll30;->getLayoutDirection()Lk50;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p2, p3, p0}, Lzo0;->a(ILk50;)I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    return p0
.end method

.method public final w0()Lzo0;
    .locals 9

    .line 1
    iget-object v0, p0, Lr71;->z:Lzo0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Lzo0;

    .line 6
    .line 7
    iget-object v2, p0, Lr71;->r:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v3, p0, Lr71;->s:Ls71;

    .line 10
    .line 11
    iget-object v4, p0, Lr71;->t:Ljv;

    .line 12
    .line 13
    iget v5, p0, Lr71;->u:I

    .line 14
    .line 15
    iget-boolean v6, p0, Lr71;->v:Z

    .line 16
    .line 17
    iget v7, p0, Lr71;->w:I

    .line 18
    .line 19
    iget v8, p0, Lr71;->x:I

    .line 20
    .line 21
    invoke-direct/range {v1 .. v8}, Lzo0;-><init>(Ljava/lang/String;Ls71;Ljv;IZII)V

    .line 22
    .line 23
    .line 24
    iput-object v1, p0, Lr71;->z:Lzo0;

    .line 25
    .line 26
    :cond_0
    iget-object p0, p0, Lr71;->z:Lzo0;

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    return-object p0
.end method
