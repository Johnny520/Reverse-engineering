.class public final synthetic Lwb/f9;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/util/ArrayList;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Lfg/l;

.field public final synthetic k:Lfg/p;

.field public final synthetic l:Lfg/l;

.field public final synthetic m:Lfg/l;

.field public final synthetic n:Li0/a1;

.field public final synthetic o:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Ljava/util/ArrayList;Ljava/lang/String;Lfg/l;Lfg/p;Lfg/l;Lfg/l;Li0/a1;Li0/a1;I)V
    .locals 0

    .line 1
    iput p9, p0, Lwb/f9;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/f9;->h:Ljava/util/ArrayList;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/f9;->i:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/f9;->j:Lfg/l;

    .line 8
    .line 9
    iput-object p4, p0, Lwb/f9;->k:Lfg/p;

    .line 10
    .line 11
    iput-object p5, p0, Lwb/f9;->l:Lfg/l;

    .line 12
    .line 13
    iput-object p6, p0, Lwb/f9;->m:Lfg/l;

    .line 14
    .line 15
    iput-object p7, p0, Lwb/f9;->n:Li0/a1;

    .line 16
    .line 17
    iput-object p8, p0, Lwb/f9;->o:Li0/a1;

    .line 18
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lwb/f9;->g:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p1

    .line 9
    .line 10
    check-cast v1, Lr/h;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    new-instance v2, Lc9/g0;

    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    iget-object v4, v0, Lwb/f9;->j:Lfg/l;

    .line 19
    .line 20
    iget-object v5, v0, Lwb/f9;->i:Ljava/lang/String;

    .line 21
    .line 22
    invoke-direct {v2, v3, v4, v5}, Lc9/g0;-><init>(ILfg/l;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    new-instance v3, Ls0/d;

    .line 26
    .line 27
    const v4, 0x6262c924

    .line 28
    .line 29
    .line 30
    const/4 v5, 0x1

    .line 31
    invoke-direct {v3, v4, v2, v5}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 32
    .line 33
    .line 34
    const/4 v2, 0x0

    .line 35
    const/4 v4, 0x3

    .line 36
    invoke-static {v1, v2, v3, v4}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 37
    .line 38
    .line 39
    iget-object v3, v0, Lwb/f9;->h:Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    if-eqz v6, :cond_0

    .line 46
    .line 47
    sget-object v3, Lwb/p0;->S0:Ls0/d;

    .line 48
    .line 49
    invoke-static {v1, v2, v3, v4}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_0
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    const/4 v6, 0x0

    .line 58
    move v9, v6

    .line 59
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v6

    .line 63
    if-eqz v6, :cond_2

    .line 64
    .line 65
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    add-int/lit8 v16, v9, 0x1

    .line 70
    .line 71
    if-ltz v9, :cond_1

    .line 72
    .line 73
    move-object v8, v6

    .line 74
    check-cast v8, Lx8/b;

    .line 75
    .line 76
    new-instance v6, Lwb/yb;

    .line 77
    .line 78
    const/4 v7, 0x0

    .line 79
    invoke-direct {v6, v9, v7}, Lwb/yb;-><init>(II)V

    .line 80
    .line 81
    .line 82
    new-instance v7, Ls0/d;

    .line 83
    .line 84
    const v10, 0x9d43852

    .line 85
    .line 86
    .line 87
    invoke-direct {v7, v10, v6, v5}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 88
    .line 89
    .line 90
    invoke-static {v1, v2, v7, v4}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 91
    .line 92
    .line 93
    new-instance v7, Lwb/zb;

    .line 94
    .line 95
    const/4 v15, 0x0

    .line 96
    iget-object v10, v0, Lwb/f9;->k:Lfg/p;

    .line 97
    .line 98
    iget-object v11, v0, Lwb/f9;->l:Lfg/l;

    .line 99
    .line 100
    iget-object v12, v0, Lwb/f9;->m:Lfg/l;

    .line 101
    .line 102
    iget-object v13, v0, Lwb/f9;->n:Li0/a1;

    .line 103
    .line 104
    iget-object v14, v0, Lwb/f9;->o:Li0/a1;

    .line 105
    .line 106
    invoke-direct/range {v7 .. v15}, Lwb/zb;-><init>(Ljava/lang/Object;ILfg/p;Lfg/l;Lfg/l;Li0/a1;Li0/a1;I)V

    .line 107
    .line 108
    .line 109
    new-instance v6, Ls0/d;

    .line 110
    .line 111
    const v8, -0x2403faf7

    .line 112
    .line 113
    .line 114
    invoke-direct {v6, v8, v7, v5}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 115
    .line 116
    .line 117
    invoke-static {v1, v2, v6, v4}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 118
    .line 119
    .line 120
    move/from16 v9, v16

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_1
    invoke-static {}, La/a;->Q0()V

    .line 124
    .line 125
    .line 126
    throw v2

    .line 127
    :cond_2
    :goto_1
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 128
    .line 129
    return-object v1

    .line 130
    :pswitch_0
    move-object/from16 v1, p1

    .line 131
    .line 132
    check-cast v1, Lr/h;

    .line 133
    .line 134
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    new-instance v2, Lc9/g0;

    .line 138
    .line 139
    const/4 v3, 0x2

    .line 140
    iget-object v4, v0, Lwb/f9;->j:Lfg/l;

    .line 141
    .line 142
    iget-object v5, v0, Lwb/f9;->i:Ljava/lang/String;

    .line 143
    .line 144
    invoke-direct {v2, v3, v4, v5}, Lc9/g0;-><init>(ILfg/l;Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    new-instance v3, Ls0/d;

    .line 148
    .line 149
    const v4, -0x30c24cc0

    .line 150
    .line 151
    .line 152
    const/4 v5, 0x1

    .line 153
    invoke-direct {v3, v4, v2, v5}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 154
    .line 155
    .line 156
    const/4 v2, 0x0

    .line 157
    const/4 v4, 0x3

    .line 158
    invoke-static {v1, v2, v3, v4}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 159
    .line 160
    .line 161
    iget-object v3, v0, Lwb/f9;->h:Ljava/util/ArrayList;

    .line 162
    .line 163
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 164
    .line 165
    .line 166
    move-result v6

    .line 167
    if-eqz v6, :cond_3

    .line 168
    .line 169
    sget-object v3, Lwb/p0;->M0:Ls0/d;

    .line 170
    .line 171
    invoke-static {v1, v2, v3, v4}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 172
    .line 173
    .line 174
    goto :goto_3

    .line 175
    :cond_3
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 176
    .line 177
    .line 178
    move-result-object v3

    .line 179
    const/4 v6, 0x0

    .line 180
    move v9, v6

    .line 181
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 182
    .line 183
    .line 184
    move-result v6

    .line 185
    if-eqz v6, :cond_5

    .line 186
    .line 187
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v6

    .line 191
    add-int/lit8 v16, v9, 0x1

    .line 192
    .line 193
    if-ltz v9, :cond_4

    .line 194
    .line 195
    move-object v8, v6

    .line 196
    check-cast v8, Lv8/a;

    .line 197
    .line 198
    new-instance v6, Lwb/yb;

    .line 199
    .line 200
    const/4 v7, 0x1

    .line 201
    invoke-direct {v6, v9, v7}, Lwb/yb;-><init>(II)V

    .line 202
    .line 203
    .line 204
    new-instance v7, Ls0/d;

    .line 205
    .line 206
    const v10, -0x1cf2ff4e

    .line 207
    .line 208
    .line 209
    invoke-direct {v7, v10, v6, v5}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 210
    .line 211
    .line 212
    invoke-static {v1, v2, v7, v4}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 213
    .line 214
    .line 215
    new-instance v7, Lwb/zb;

    .line 216
    .line 217
    const/4 v15, 0x1

    .line 218
    iget-object v10, v0, Lwb/f9;->k:Lfg/p;

    .line 219
    .line 220
    iget-object v11, v0, Lwb/f9;->l:Lfg/l;

    .line 221
    .line 222
    iget-object v12, v0, Lwb/f9;->m:Lfg/l;

    .line 223
    .line 224
    iget-object v13, v0, Lwb/f9;->n:Li0/a1;

    .line 225
    .line 226
    iget-object v14, v0, Lwb/f9;->o:Li0/a1;

    .line 227
    .line 228
    invoke-direct/range {v7 .. v15}, Lwb/zb;-><init>(Ljava/lang/Object;ILfg/p;Lfg/l;Lfg/l;Li0/a1;Li0/a1;I)V

    .line 229
    .line 230
    .line 231
    new-instance v6, Ls0/d;

    .line 232
    .line 233
    const v8, -0x1bda5257

    .line 234
    .line 235
    .line 236
    invoke-direct {v6, v8, v7, v5}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 237
    .line 238
    .line 239
    invoke-static {v1, v2, v6, v4}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 240
    .line 241
    .line 242
    move/from16 v9, v16

    .line 243
    .line 244
    goto :goto_2

    .line 245
    :cond_4
    invoke-static {}, La/a;->Q0()V

    .line 246
    .line 247
    .line 248
    throw v2

    .line 249
    :cond_5
    :goto_3
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 250
    .line 251
    return-object v1

    .line 252
    nop

    .line 253
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
