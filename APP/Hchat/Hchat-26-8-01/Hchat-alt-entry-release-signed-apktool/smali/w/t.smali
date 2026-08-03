.class public final synthetic Lw/t;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:Lw/q0;

.field public final synthetic h:Li2/n0;

.field public final synthetic i:I

.field public final synthetic j:I

.field public final synthetic k:Lw/j1;

.field public final synthetic l:Ln2/s;

.field public final synthetic m:Lj8/o;

.field public final synthetic n:Ly0/o;

.field public final synthetic o:Ly0/o;

.field public final synthetic p:Ly0/o;

.field public final synthetic q:Ly0/o;

.field public final synthetic r:Lt/c;

.field public final synthetic s:Lh0/d1;

.field public final synthetic t:Z

.field public final synthetic u:Lfg/l;

.field public final synthetic v:Lb5/k;

.field public final synthetic w:Lu2/c;


# direct methods
.method public synthetic constructor <init>(Lw/q0;Li2/n0;IILw/j1;Ln2/s;Lj8/o;Ly0/o;Ly0/o;Ly0/o;Ly0/o;Lt/c;Lh0/d1;ZLfg/l;Lb5/k;Lu2/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lw/t;->g:Lw/q0;

    .line 5
    .line 6
    iput-object p2, p0, Lw/t;->h:Li2/n0;

    .line 7
    .line 8
    iput p3, p0, Lw/t;->i:I

    .line 9
    .line 10
    iput p4, p0, Lw/t;->j:I

    .line 11
    .line 12
    iput-object p5, p0, Lw/t;->k:Lw/j1;

    .line 13
    .line 14
    iput-object p6, p0, Lw/t;->l:Ln2/s;

    .line 15
    .line 16
    iput-object p7, p0, Lw/t;->m:Lj8/o;

    .line 17
    .line 18
    iput-object p8, p0, Lw/t;->n:Ly0/o;

    .line 19
    .line 20
    iput-object p9, p0, Lw/t;->o:Ly0/o;

    .line 21
    .line 22
    iput-object p10, p0, Lw/t;->p:Ly0/o;

    .line 23
    .line 24
    iput-object p11, p0, Lw/t;->q:Ly0/o;

    .line 25
    .line 26
    iput-object p12, p0, Lw/t;->r:Lt/c;

    .line 27
    .line 28
    iput-object p13, p0, Lw/t;->s:Lh0/d1;

    .line 29
    .line 30
    iput-boolean p14, p0, Lw/t;->t:Z

    .line 31
    .line 32
    iput-object p15, p0, Lw/t;->u:Lfg/l;

    .line 33
    .line 34
    move-object/from16 p1, p16

    .line 35
    .line 36
    iput-object p1, p0, Lw/t;->v:Lb5/k;

    .line 37
    .line 38
    move-object/from16 p1, p17

    .line 39
    .line 40
    iput-object p1, p0, Lw/t;->w:Lu2/c;

    .line 41
    .line 42
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Li0/h0;

    .line 6
    .line 7
    move-object/from16 v2, p2

    .line 8
    .line 9
    check-cast v2, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    and-int/lit8 v3, v2, 0x3

    .line 16
    .line 17
    const/4 v4, 0x1

    .line 18
    const/4 v5, 0x2

    .line 19
    if-eq v3, v5, :cond_0

    .line 20
    .line 21
    move v3, v4

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v3, 0x0

    .line 24
    :goto_0
    and-int/2addr v2, v4

    .line 25
    invoke-virtual {v1, v2, v3}, Li0/h0;->S(IZ)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_8

    .line 30
    .line 31
    iget-object v8, v0, Lw/t;->g:Lw/q0;

    .line 32
    .line 33
    iget-object v2, v8, Lw/q0;->g:Li0/j1;

    .line 34
    .line 35
    invoke-virtual {v2}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    check-cast v2, Lu2/f;

    .line 40
    .line 41
    iget v2, v2, Lu2/f;->g:F

    .line 42
    .line 43
    const/4 v3, 0x0

    .line 44
    sget-object v6, Ly0/l;->a:Ly0/l;

    .line 45
    .line 46
    invoke-static {v6, v2, v3, v5}, Lp/h1;->g(Ly0/o;FFI)Ly0/o;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    iget v3, v0, Lw/t;->i:I

    .line 51
    .line 52
    iget v14, v0, Lw/t;->j:I

    .line 53
    .line 54
    invoke-static {v3, v14}, Lw/s;->A(II)V

    .line 55
    .line 56
    .line 57
    iget-object v5, v0, Lw/t;->h:Li2/n0;

    .line 58
    .line 59
    if-ne v3, v4, :cond_1

    .line 60
    .line 61
    const v6, 0x7fffffff

    .line 62
    .line 63
    .line 64
    if-ne v14, v6, :cond_1

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_1
    new-instance v6, Lw/i0;

    .line 68
    .line 69
    invoke-direct {v6, v5, v3, v14}, Lw/i0;-><init>(Li2/n0;II)V

    .line 70
    .line 71
    .line 72
    invoke-interface {v2, v6}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    :goto_1
    invoke-virtual {v1, v8}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    invoke-virtual {v1}, Li0/h0;->P()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    if-nez v3, :cond_2

    .line 85
    .line 86
    sget-object v3, Li0/l;->a:Li0/e;

    .line 87
    .line 88
    if-ne v6, v3, :cond_3

    .line 89
    .line 90
    :cond_2
    new-instance v6, Lv0/a;

    .line 91
    .line 92
    const/4 v3, 0x4

    .line 93
    invoke-direct {v6, v8, v3}, Lv0/a;-><init>(Ljava/lang/Object;I)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1, v6}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    :cond_3
    check-cast v6, Lfg/a;

    .line 100
    .line 101
    iget-object v3, v0, Lw/t;->k:Lw/j1;

    .line 102
    .line 103
    iget-object v7, v3, Lw/j1;->f:Li0/j1;

    .line 104
    .line 105
    invoke-virtual {v7}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v7

    .line 109
    check-cast v7, Lm/p1;

    .line 110
    .line 111
    iget-object v11, v0, Lw/t;->l:Ln2/s;

    .line 112
    .line 113
    iget-wide v9, v11, Ln2/s;->b:J

    .line 114
    .line 115
    sget v12, Li2/m0;->c:I

    .line 116
    .line 117
    const/16 p1, 0x20

    .line 118
    .line 119
    shr-long v12, v9, p1

    .line 120
    .line 121
    long-to-int v12, v12

    .line 122
    move-object v13, v5

    .line 123
    iget-wide v4, v3, Lw/j1;->e:J

    .line 124
    .line 125
    move-wide v15, v4

    .line 126
    shr-long v4, v15, p1

    .line 127
    .line 128
    long-to-int v4, v4

    .line 129
    if-eq v12, v4, :cond_4

    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_4
    const-wide v17, 0xffffffffL

    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    and-long v4, v9, v17

    .line 138
    .line 139
    long-to-int v12, v4

    .line 140
    and-long v4, v15, v17

    .line 141
    .line 142
    long-to-int v4, v4

    .line 143
    if-eq v12, v4, :cond_5

    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_5
    invoke-static {v9, v10}, Li2/m0;->f(J)I

    .line 147
    .line 148
    .line 149
    move-result v12

    .line 150
    :goto_2
    iget-wide v4, v11, Ln2/s;->b:J

    .line 151
    .line 152
    iput-wide v4, v3, Lw/j1;->e:J

    .line 153
    .line 154
    iget-object v4, v11, Ln2/s;->a:Li2/g;

    .line 155
    .line 156
    iget-object v5, v0, Lw/t;->m:Lj8/o;

    .line 157
    .line 158
    invoke-static {v5, v4}, Lw/s;->p(Lj8/o;Li2/g;)Ln2/z;

    .line 159
    .line 160
    .line 161
    move-result-object v4

    .line 162
    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    .line 163
    .line 164
    .line 165
    move-result v5

    .line 166
    if-eqz v5, :cond_7

    .line 167
    .line 168
    const/4 v7, 0x1

    .line 169
    if-ne v5, v7, :cond_6

    .line 170
    .line 171
    new-instance v5, Lw/l0;

    .line 172
    .line 173
    invoke-direct {v5, v3, v12, v4, v6}, Lw/l0;-><init>(Lw/j1;ILn2/z;Lfg/a;)V

    .line 174
    .line 175
    .line 176
    goto :goto_3

    .line 177
    :cond_6
    invoke-static {}, Lokio/a;->k()V

    .line 178
    .line 179
    .line 180
    const/4 v1, 0x0

    .line 181
    return-object v1

    .line 182
    :cond_7
    new-instance v5, Lw/r1;

    .line 183
    .line 184
    invoke-direct {v5, v3, v12, v4, v6}, Lw/r1;-><init>(Lw/j1;ILn2/z;Lfg/a;)V

    .line 185
    .line 186
    .line 187
    :goto_3
    invoke-static {v2}, Lc1/h;->c(Ly0/o;)Ly0/o;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    invoke-interface {v2, v5}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    iget-object v3, v0, Lw/t;->n:Ly0/o;

    .line 196
    .line 197
    invoke-interface {v2, v3}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 198
    .line 199
    .line 200
    move-result-object v2

    .line 201
    iget-object v3, v0, Lw/t;->o:Ly0/o;

    .line 202
    .line 203
    invoke-interface {v2, v3}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 204
    .line 205
    .line 206
    move-result-object v2

    .line 207
    new-instance v3, Lw/k1;

    .line 208
    .line 209
    invoke-direct {v3, v13}, Lw/k1;-><init>(Li2/n0;)V

    .line 210
    .line 211
    .line 212
    invoke-interface {v2, v3}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 213
    .line 214
    .line 215
    move-result-object v2

    .line 216
    iget-object v3, v0, Lw/t;->p:Ly0/o;

    .line 217
    .line 218
    invoke-interface {v2, v3}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    iget-object v3, v0, Lw/t;->q:Ly0/o;

    .line 223
    .line 224
    invoke-interface {v2, v3}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    iget-object v3, v0, Lw/t;->r:Lt/c;

    .line 229
    .line 230
    invoke-static {v2, v3}, Lt/d;->a(Ly0/o;Lt/c;)Ly0/o;

    .line 231
    .line 232
    .line 233
    move-result-object v2

    .line 234
    new-instance v6, Lw/u;

    .line 235
    .line 236
    iget-object v7, v0, Lw/t;->s:Lh0/d1;

    .line 237
    .line 238
    iget-boolean v9, v0, Lw/t;->t:Z

    .line 239
    .line 240
    iget-object v10, v0, Lw/t;->u:Lfg/l;

    .line 241
    .line 242
    iget-object v12, v0, Lw/t;->v:Lb5/k;

    .line 243
    .line 244
    iget-object v13, v0, Lw/t;->w:Lu2/c;

    .line 245
    .line 246
    invoke-direct/range {v6 .. v14}, Lw/u;-><init>(Lh0/d1;Lw/q0;ZLfg/l;Ln2/s;Lb5/k;Lu2/c;I)V

    .line 247
    .line 248
    .line 249
    const v3, 0x54340ce8

    .line 250
    .line 251
    .line 252
    invoke-static {v3, v6, v1}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 253
    .line 254
    .line 255
    move-result-object v3

    .line 256
    const/16 v4, 0x30

    .line 257
    .line 258
    invoke-static {v2, v3, v1, v4}, Lbe/h;->c(Ly0/o;Ls0/d;Li0/h0;I)V

    .line 259
    .line 260
    .line 261
    goto :goto_4

    .line 262
    :cond_8
    invoke-virtual {v1}, Li0/h0;->V()V

    .line 263
    .line 264
    .line 265
    :goto_4
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 266
    .line 267
    return-object v1
.end method
