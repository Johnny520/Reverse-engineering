.class public final Lh/d1;
.super Lh/x0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public v:Li/r0;

.field public w:J

.field public x:J

.field public y:Z

.field public final z:Li0/j1;


# direct methods
.method public constructor <init>(Li/r0;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lh/x0;-><init>(I)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, Lh/d1;->v:Li/r0;

    .line 6
    .line 7
    sget-wide v0, Lh/d0;->a:J

    .line 8
    .line 9
    iput-wide v0, p0, Lh/d1;->w:J

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    const/16 v0, 0xf

    .line 13
    .line 14
    invoke-static {p1, p1, p1, p1, v0}, Lu2/b;->b(IIIII)J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    iput-wide v0, p0, Lh/d1;->x:J

    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    invoke-static {p1}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iput-object p1, p0, Lh/d1;->z:Li0/j1;

    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public final c1()V
    .locals 2

    .line 1
    sget-wide v0, Lh/d0;->a:J

    .line 2
    .line 3
    iput-wide v0, p0, Lh/d1;->w:J

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lh/d1;->y:Z

    .line 7
    .line 8
    return-void
.end method

.method public final e1()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lh/d1;->z:Li0/j1;

    .line 3
    .line 4
    invoke-virtual {v1, v0}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final j(Lv1/p0;Lv1/m0;J)Lv1/o0;
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-wide/from16 v6, p3

    .line 4
    .line 5
    invoke-interface/range {p1 .. p1}, Lv1/o;->u0()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v2, 0x1

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iput-wide v6, v1, Lh/d1;->x:J

    .line 13
    .line 14
    iput-boolean v2, v1, Lh/d1;->y:Z

    .line 15
    .line 16
    invoke-interface/range {p2 .. p4}, Lv1/m0;->Q(J)Lv1/b1;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    :goto_0
    move-object v8, v0

    .line 21
    goto :goto_3

    .line 22
    :cond_0
    iget-boolean v0, v1, Lh/d1;->y:Z

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    iget-wide v3, v1, Lh/d1;->x:J

    .line 27
    .line 28
    :goto_1
    move-object/from16 v0, p2

    .line 29
    .line 30
    goto :goto_2

    .line 31
    :cond_1
    move-wide v3, v6

    .line 32
    goto :goto_1

    .line 33
    :goto_2
    invoke-interface {v0, v3, v4}, Lv1/m0;->Q(J)Lv1/b1;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    goto :goto_0

    .line 38
    :goto_3
    iget v0, v8, Lv1/b1;->g:I

    .line 39
    .line 40
    iget v3, v8, Lv1/b1;->h:I

    .line 41
    .line 42
    int-to-long v4, v0

    .line 43
    const/16 v9, 0x20

    .line 44
    .line 45
    shl-long/2addr v4, v9

    .line 46
    int-to-long v10, v3

    .line 47
    const-wide v12, 0xffffffffL

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    and-long/2addr v10, v12

    .line 53
    or-long/2addr v10, v4

    .line 54
    invoke-interface/range {p1 .. p1}, Lv1/o;->u0()Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_2

    .line 59
    .line 60
    iput-wide v10, v1, Lh/d1;->w:J

    .line 61
    .line 62
    move/from16 p2, v9

    .line 63
    .line 64
    move-wide v0, v10

    .line 65
    move-wide/from16 v16, v0

    .line 66
    .line 67
    goto/16 :goto_9

    .line 68
    .line 69
    :cond_2
    iget-wide v3, v1, Lh/d1;->w:J

    .line 70
    .line 71
    sget-wide v14, Lh/d0;->a:J

    .line 72
    .line 73
    invoke-static {v3, v4, v14, v15}, Lu2/l;->a(JJ)Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-nez v0, :cond_3

    .line 78
    .line 79
    iget-wide v3, v1, Lh/d1;->w:J

    .line 80
    .line 81
    goto :goto_4

    .line 82
    :cond_3
    move-wide v3, v10

    .line 83
    :goto_4
    iget-object v14, v1, Lh/d1;->z:Li0/j1;

    .line 84
    .line 85
    invoke-virtual {v14}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    check-cast v0, Lh/a1;

    .line 90
    .line 91
    if-eqz v0, :cond_7

    .line 92
    .line 93
    iget-object v5, v0, Lh/a1;->a:Li/c;

    .line 94
    .line 95
    invoke-virtual {v5}, Li/c;->d()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v15

    .line 99
    check-cast v15, Lu2/l;

    .line 100
    .line 101
    move/from16 p2, v9

    .line 102
    .line 103
    move-wide/from16 v16, v10

    .line 104
    .line 105
    iget-wide v9, v15, Lu2/l;->a:J

    .line 106
    .line 107
    invoke-static {v3, v4, v9, v10}, Lu2/l;->a(JJ)Z

    .line 108
    .line 109
    .line 110
    move-result v9

    .line 111
    if-nez v9, :cond_4

    .line 112
    .line 113
    iget-object v9, v5, Li/c;->d:Li0/j1;

    .line 114
    .line 115
    invoke-virtual {v9}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v9

    .line 119
    check-cast v9, Ljava/lang/Boolean;

    .line 120
    .line 121
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 122
    .line 123
    .line 124
    move-result v9

    .line 125
    if-nez v9, :cond_4

    .line 126
    .line 127
    goto :goto_5

    .line 128
    :cond_4
    const/4 v2, 0x0

    .line 129
    :goto_5
    iget-object v9, v5, Li/c;->e:Li0/j1;

    .line 130
    .line 131
    invoke-virtual {v9}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v9

    .line 135
    check-cast v9, Lu2/l;

    .line 136
    .line 137
    iget-wide v9, v9, Lu2/l;->a:J

    .line 138
    .line 139
    invoke-static {v3, v4, v9, v10}, Lu2/l;->a(JJ)Z

    .line 140
    .line 141
    .line 142
    move-result v9

    .line 143
    if-eqz v9, :cond_6

    .line 144
    .line 145
    if-eqz v2, :cond_5

    .line 146
    .line 147
    goto :goto_6

    .line 148
    :cond_5
    move-object v1, v0

    .line 149
    goto :goto_7

    .line 150
    :cond_6
    :goto_6
    invoke-virtual {v5}, Li/c;->d()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    check-cast v2, Lu2/l;

    .line 155
    .line 156
    iget-wide v9, v2, Lu2/l;->a:J

    .line 157
    .line 158
    iput-wide v9, v0, Lh/a1;->b:J

    .line 159
    .line 160
    invoke-virtual {v1}, Ly0/n;->Y0()Lqg/t;

    .line 161
    .line 162
    .line 163
    move-result-object v9

    .line 164
    move-object v1, v0

    .line 165
    new-instance v0, Lh/b1;

    .line 166
    .line 167
    const/4 v5, 0x0

    .line 168
    move-wide v2, v3

    .line 169
    move-object/from16 v4, p0

    .line 170
    .line 171
    invoke-direct/range {v0 .. v5}, Lh/b1;-><init>(Lh/a1;JLh/d1;Lwf/c;)V

    .line 172
    .line 173
    .line 174
    const/4 v2, 0x3

    .line 175
    const/4 v3, 0x0

    .line 176
    invoke-static {v9, v3, v0, v2}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 177
    .line 178
    .line 179
    :goto_7
    move-object v0, v1

    .line 180
    goto :goto_8

    .line 181
    :cond_7
    move/from16 p2, v9

    .line 182
    .line 183
    move-wide/from16 v16, v10

    .line 184
    .line 185
    new-instance v0, Lh/a1;

    .line 186
    .line 187
    new-instance v1, Li/c;

    .line 188
    .line 189
    new-instance v5, Lu2/l;

    .line 190
    .line 191
    invoke-direct {v5, v3, v4}, Lu2/l;-><init>(J)V

    .line 192
    .line 193
    .line 194
    sget-object v9, Li/d;->q:Li/m1;

    .line 195
    .line 196
    int-to-long v10, v2

    .line 197
    shl-long v18, v10, p2

    .line 198
    .line 199
    and-long/2addr v10, v12

    .line 200
    or-long v10, v18, v10

    .line 201
    .line 202
    new-instance v2, Lu2/l;

    .line 203
    .line 204
    invoke-direct {v2, v10, v11}, Lu2/l;-><init>(J)V

    .line 205
    .line 206
    .line 207
    const/16 v10, 0x8

    .line 208
    .line 209
    invoke-direct {v1, v5, v9, v2, v10}, Li/c;-><init>(Ljava/lang/Object;Li/m1;Ljava/lang/Object;I)V

    .line 210
    .line 211
    .line 212
    invoke-direct {v0, v1, v3, v4}, Lh/a1;-><init>(Li/c;J)V

    .line 213
    .line 214
    .line 215
    :goto_8
    invoke-virtual {v14, v0}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 216
    .line 217
    .line 218
    iget-object v0, v0, Lh/a1;->a:Li/c;

    .line 219
    .line 220
    invoke-virtual {v0}, Li/c;->d()Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    check-cast v0, Lu2/l;

    .line 225
    .line 226
    iget-wide v0, v0, Lu2/l;->a:J

    .line 227
    .line 228
    invoke-static {v6, v7, v0, v1}, Lu2/b;->d(JJ)J

    .line 229
    .line 230
    .line 231
    move-result-wide v0

    .line 232
    :goto_9
    shr-long v2, v0, p2

    .line 233
    .line 234
    long-to-int v4, v2

    .line 235
    and-long/2addr v0, v12

    .line 236
    long-to-int v5, v0

    .line 237
    new-instance v0, Lh/c1;

    .line 238
    .line 239
    move-object/from16 v1, p0

    .line 240
    .line 241
    move-object/from16 v6, p1

    .line 242
    .line 243
    move-object v7, v8

    .line 244
    move-wide/from16 v2, v16

    .line 245
    .line 246
    invoke-direct/range {v0 .. v7}, Lh/c1;-><init>(Lh/d1;JIILv1/p0;Lv1/b1;)V

    .line 247
    .line 248
    .line 249
    sget-object v1, Ltf/u;->g:Ltf/u;

    .line 250
    .line 251
    invoke-interface {v6, v4, v5, v1, v0}, Lv1/p0;->z(IILjava/util/Map;Lfg/l;)Lv1/o0;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    return-object v0
.end method
