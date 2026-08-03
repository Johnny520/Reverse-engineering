.class public final synthetic Lg0/l;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lg0/n;


# direct methods
.method public synthetic constructor <init>(Lg0/n;I)V
    .locals 0

    .line 1
    iput p2, p0, Lg0/l;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lg0/l;->h:Lg0/n;

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
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lg0/l;->g:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p1

    .line 9
    .line 10
    check-cast v1, Ljava/lang/Boolean;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    iget-object v2, v0, Lg0/l;->h:Lg0/n;

    .line 17
    .line 18
    iget-object v3, v2, Lg0/n;->F:Lg0/m;

    .line 19
    .line 20
    if-nez v3, :cond_0

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iput-boolean v1, v3, Lg0/m;->c:Z

    .line 25
    .line 26
    invoke-static {v2}, Lx1/k;->n(Lx1/z1;)V

    .line 27
    .line 28
    .line 29
    invoke-static {v2}, Lx1/k;->m(Lx1/v;)V

    .line 30
    .line 31
    .line 32
    invoke-static {v2}, Lx1/k;->l(Lx1/m;)V

    .line 33
    .line 34
    .line 35
    const/4 v1, 0x1

    .line 36
    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    return-object v1

    .line 41
    :pswitch_0
    move-object/from16 v1, p1

    .line 42
    .line 43
    check-cast v1, Li2/g;

    .line 44
    .line 45
    iget-object v3, v1, Li2/g;->h:Ljava/lang/String;

    .line 46
    .line 47
    iget-object v1, v0, Lg0/l;->h:Lg0/n;

    .line 48
    .line 49
    iget-object v2, v1, Lg0/n;->F:Lg0/m;

    .line 50
    .line 51
    if-eqz v2, :cond_2

    .line 52
    .line 53
    iget-object v4, v2, Lg0/m;->b:Ljava/lang/String;

    .line 54
    .line 55
    invoke-static {v3, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    if-eqz v4, :cond_1

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_1
    iput-object v3, v2, Lg0/m;->b:Ljava/lang/String;

    .line 63
    .line 64
    iget-object v2, v2, Lg0/m;->d:Lg0/e;

    .line 65
    .line 66
    if-eqz v2, :cond_3

    .line 67
    .line 68
    iget-object v4, v1, Lg0/n;->v:Li2/n0;

    .line 69
    .line 70
    iget-object v5, v1, Lg0/n;->w:Lm2/d;

    .line 71
    .line 72
    iget v6, v1, Lg0/n;->x:I

    .line 73
    .line 74
    iget-boolean v7, v1, Lg0/n;->y:Z

    .line 75
    .line 76
    iget v8, v1, Lg0/n;->z:I

    .line 77
    .line 78
    iget v9, v1, Lg0/n;->A:I

    .line 79
    .line 80
    invoke-virtual/range {v2 .. v9}, Lg0/e;->f(Ljava/lang/String;Li2/n0;Lm2/d;IZII)V

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_2
    new-instance v10, Lg0/m;

    .line 85
    .line 86
    iget-object v2, v1, Lg0/n;->u:Ljava/lang/String;

    .line 87
    .line 88
    invoke-direct {v10, v2, v3}, Lg0/m;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    new-instance v2, Lg0/e;

    .line 92
    .line 93
    iget-object v4, v1, Lg0/n;->v:Li2/n0;

    .line 94
    .line 95
    iget-object v5, v1, Lg0/n;->w:Lm2/d;

    .line 96
    .line 97
    iget v6, v1, Lg0/n;->x:I

    .line 98
    .line 99
    iget-boolean v7, v1, Lg0/n;->y:Z

    .line 100
    .line 101
    iget v8, v1, Lg0/n;->z:I

    .line 102
    .line 103
    iget v9, v1, Lg0/n;->A:I

    .line 104
    .line 105
    invoke-direct/range {v2 .. v9}, Lg0/e;-><init>(Ljava/lang/String;Li2/n0;Lm2/d;IZII)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1}, Lg0/n;->k1()Lg0/e;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    iget-object v3, v3, Lg0/e;->i:Lu2/c;

    .line 113
    .line 114
    invoke-virtual {v2, v3}, Lg0/e;->d(Lu2/c;)V

    .line 115
    .line 116
    .line 117
    iput-object v2, v10, Lg0/m;->d:Lg0/e;

    .line 118
    .line 119
    iput-object v10, v1, Lg0/n;->F:Lg0/m;

    .line 120
    .line 121
    :cond_3
    :goto_1
    invoke-static {v1}, Lx1/k;->n(Lx1/z1;)V

    .line 122
    .line 123
    .line 124
    invoke-static {v1}, Lx1/k;->m(Lx1/v;)V

    .line 125
    .line 126
    .line 127
    invoke-static {v1}, Lx1/k;->l(Lx1/m;)V

    .line 128
    .line 129
    .line 130
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 131
    .line 132
    return-object v1

    .line 133
    :pswitch_1
    move-object/from16 v1, p1

    .line 134
    .line 135
    check-cast v1, Ljava/util/List;

    .line 136
    .line 137
    iget-object v2, v0, Lg0/l;->h:Lg0/n;

    .line 138
    .line 139
    invoke-virtual {v2}, Lg0/n;->k1()Lg0/e;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    iget-object v4, v2, Lg0/n;->v:Li2/n0;

    .line 144
    .line 145
    sget-wide v5, Lf1/w;->g:J

    .line 146
    .line 147
    const-wide/16 v14, 0x0

    .line 148
    .line 149
    const v16, 0xfffffe

    .line 150
    .line 151
    .line 152
    const-wide/16 v7, 0x0

    .line 153
    .line 154
    const/4 v9, 0x0

    .line 155
    const/4 v10, 0x0

    .line 156
    const-wide/16 v11, 0x0

    .line 157
    .line 158
    const/4 v13, 0x0

    .line 159
    invoke-static/range {v4 .. v16}, Li2/n0;->c(Li2/n0;JJLm2/k;Lm2/p;JIJI)Li2/n0;

    .line 160
    .line 161
    .line 162
    move-result-object v19

    .line 163
    iget-object v2, v3, Lg0/e;->o:Lu2/m;

    .line 164
    .line 165
    const/4 v4, 0x0

    .line 166
    if-nez v2, :cond_4

    .line 167
    .line 168
    :goto_2
    move-object v7, v4

    .line 169
    goto :goto_3

    .line 170
    :cond_4
    iget-object v5, v3, Lg0/e;->i:Lu2/c;

    .line 171
    .line 172
    if-nez v5, :cond_5

    .line 173
    .line 174
    goto :goto_2

    .line 175
    :cond_5
    new-instance v6, Li2/g;

    .line 176
    .line 177
    iget-object v7, v3, Lg0/e;->a:Ljava/lang/String;

    .line 178
    .line 179
    invoke-direct {v6, v7}, Li2/g;-><init>(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    iget-object v7, v3, Lg0/e;->j:Li2/a;

    .line 183
    .line 184
    if-nez v7, :cond_6

    .line 185
    .line 186
    goto :goto_2

    .line 187
    :cond_6
    iget-object v7, v3, Lg0/e;->n:Li2/t;

    .line 188
    .line 189
    if-nez v7, :cond_7

    .line 190
    .line 191
    goto :goto_2

    .line 192
    :cond_7
    iget-wide v7, v3, Lg0/e;->p:J

    .line 193
    .line 194
    const-wide v9, -0x1fffffffdL

    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    and-long v27, v7, v9

    .line 200
    .line 201
    new-instance v7, Li2/k0;

    .line 202
    .line 203
    new-instance v17, Li2/j0;

    .line 204
    .line 205
    iget v8, v3, Lg0/e;->f:I

    .line 206
    .line 207
    iget-boolean v9, v3, Lg0/e;->e:Z

    .line 208
    .line 209
    iget v10, v3, Lg0/e;->d:I

    .line 210
    .line 211
    iget-object v11, v3, Lg0/e;->c:Lm2/d;

    .line 212
    .line 213
    sget-object v20, Ltf/t;->g:Ltf/t;

    .line 214
    .line 215
    move-object/from16 v25, v2

    .line 216
    .line 217
    move-object/from16 v24, v5

    .line 218
    .line 219
    move-object/from16 v18, v6

    .line 220
    .line 221
    move/from16 v21, v8

    .line 222
    .line 223
    move/from16 v22, v9

    .line 224
    .line 225
    move/from16 v23, v10

    .line 226
    .line 227
    move-object/from16 v26, v11

    .line 228
    .line 229
    invoke-direct/range {v17 .. v28}, Li2/j0;-><init>(Li2/g;Li2/n0;Ljava/util/List;IZILu2/c;Lu2/m;Lm2/d;J)V

    .line 230
    .line 231
    .line 232
    move-object/from16 v2, v17

    .line 233
    .line 234
    move-object/from16 v21, v24

    .line 235
    .line 236
    move-object/from16 v22, v26

    .line 237
    .line 238
    new-instance v11, Li2/o;

    .line 239
    .line 240
    new-instance v17, Lbe/k;

    .line 241
    .line 242
    invoke-direct/range {v17 .. v22}, Lbe/k;-><init>(Li2/g;Li2/n0;Ljava/util/List;Lu2/c;Lm2/d;)V

    .line 243
    .line 244
    .line 245
    iget v15, v3, Lg0/e;->f:I

    .line 246
    .line 247
    iget v5, v3, Lg0/e;->d:I

    .line 248
    .line 249
    move/from16 v16, v5

    .line 250
    .line 251
    move-object/from16 v12, v17

    .line 252
    .line 253
    move-wide/from16 v13, v27

    .line 254
    .line 255
    invoke-direct/range {v11 .. v16}, Li2/o;-><init>(Lbe/k;JII)V

    .line 256
    .line 257
    .line 258
    iget-wide v5, v3, Lg0/e;->l:J

    .line 259
    .line 260
    invoke-direct {v7, v2, v11, v5, v6}, Li2/k0;-><init>(Li2/j0;Li2/o;J)V

    .line 261
    .line 262
    .line 263
    :goto_3
    if-eqz v7, :cond_8

    .line 264
    .line 265
    invoke-interface {v1, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    move-object v4, v7

    .line 269
    :cond_8
    if-eqz v4, :cond_9

    .line 270
    .line 271
    const/4 v1, 0x1

    .line 272
    goto :goto_4

    .line 273
    :cond_9
    const/4 v1, 0x0

    .line 274
    :goto_4
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 275
    .line 276
    .line 277
    move-result-object v1

    .line 278
    return-object v1

    .line 279
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
