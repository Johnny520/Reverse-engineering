.class public final synthetic Lwb/v9;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Li0/a1;

.field public final synthetic i:Li0/a1;

.field public final synthetic j:Ljava/util/List;

.field public final synthetic k:Lfg/a;

.field public final synthetic l:Ljava/util/List;

.field public final synthetic m:Lfg/a;

.field public final synthetic n:Ljava/util/List;

.field public final synthetic o:Ljava/util/ArrayList;

.field public final synthetic p:Li0/a1;

.field public final synthetic q:Li0/a1;

.field public final synthetic r:Lfg/p;

.field public final synthetic s:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Li0/a1;Li0/a1;Ljava/util/List;Lfg/a;Ljava/util/List;Lfg/a;Ljava/util/List;Ljava/util/ArrayList;Li0/a1;Li0/a1;Lfg/p;Li0/a1;I)V
    .locals 0

    .line 1
    iput p13, p0, Lwb/v9;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/v9;->h:Li0/a1;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/v9;->i:Li0/a1;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/v9;->j:Ljava/util/List;

    .line 8
    .line 9
    iput-object p4, p0, Lwb/v9;->k:Lfg/a;

    .line 10
    .line 11
    iput-object p5, p0, Lwb/v9;->l:Ljava/util/List;

    .line 12
    .line 13
    iput-object p6, p0, Lwb/v9;->m:Lfg/a;

    .line 14
    .line 15
    iput-object p7, p0, Lwb/v9;->n:Ljava/util/List;

    .line 16
    .line 17
    iput-object p8, p0, Lwb/v9;->o:Ljava/util/ArrayList;

    .line 18
    .line 19
    iput-object p9, p0, Lwb/v9;->p:Li0/a1;

    .line 20
    .line 21
    iput-object p10, p0, Lwb/v9;->q:Li0/a1;

    .line 22
    .line 23
    iput-object p11, p0, Lwb/v9;->r:Lfg/p;

    .line 24
    .line 25
    iput-object p12, p0, Lwb/v9;->s:Li0/a1;

    .line 26
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lwb/v9;->g:I

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
    new-instance v2, Lwb/s1;

    .line 16
    .line 17
    const/16 v3, 0x1b

    .line 18
    .line 19
    iget-object v4, v0, Lwb/v9;->h:Li0/a1;

    .line 20
    .line 21
    invoke-direct {v2, v4, v3}, Lwb/s1;-><init>(Li0/a1;I)V

    .line 22
    .line 23
    .line 24
    new-instance v3, Ls0/d;

    .line 25
    .line 26
    const v4, -0x50b21aa9

    .line 27
    .line 28
    .line 29
    const/4 v5, 0x1

    .line 30
    invoke-direct {v3, v4, v2, v5}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 31
    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    const/4 v4, 0x3

    .line 35
    invoke-static {v1, v2, v3, v4}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 36
    .line 37
    .line 38
    iget-object v14, v0, Lwb/v9;->i:Li0/a1;

    .line 39
    .line 40
    invoke-interface {v14}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    check-cast v3, Ljava/lang/Boolean;

    .line 45
    .line 46
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    iget-object v7, v0, Lwb/v9;->j:Ljava/util/List;

    .line 51
    .line 52
    iget-object v9, v0, Lwb/v9;->l:Ljava/util/List;

    .line 53
    .line 54
    if-nez v3, :cond_0

    .line 55
    .line 56
    sget-object v3, Lwb/p0;->R3:Ls0/d;

    .line 57
    .line 58
    invoke-static {v1, v2, v3, v4}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 59
    .line 60
    .line 61
    new-instance v6, Lwb/ce;

    .line 62
    .line 63
    const/4 v11, 0x1

    .line 64
    iget-object v8, v0, Lwb/v9;->k:Lfg/a;

    .line 65
    .line 66
    iget-object v10, v0, Lwb/v9;->m:Lfg/a;

    .line 67
    .line 68
    invoke-direct/range {v6 .. v11}, Lwb/ce;-><init>(Ljava/util/List;Lfg/a;Ljava/util/List;Lfg/a;I)V

    .line 69
    .line 70
    .line 71
    new-instance v3, Ls0/d;

    .line 72
    .line 73
    const v8, -0x19db4e57

    .line 74
    .line 75
    .line 76
    invoke-direct {v3, v8, v6, v5}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 77
    .line 78
    .line 79
    invoke-static {v1, v2, v3, v4}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 80
    .line 81
    .line 82
    :cond_0
    new-instance v3, Lwb/nd;

    .line 83
    .line 84
    const/4 v6, 0x2

    .line 85
    move-object v12, v7

    .line 86
    iget-object v7, v0, Lwb/v9;->n:Ljava/util/List;

    .line 87
    .line 88
    invoke-direct {v3, v6, v7}, Lwb/nd;-><init>(ILjava/util/List;)V

    .line 89
    .line 90
    .line 91
    new-instance v6, Ls0/d;

    .line 92
    .line 93
    const v8, -0x375c99b2

    .line 94
    .line 95
    .line 96
    invoke-direct {v6, v8, v3, v5}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 97
    .line 98
    .line 99
    invoke-static {v1, v2, v6, v4}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 100
    .line 101
    .line 102
    new-instance v6, Lwb/de;

    .line 103
    .line 104
    const/16 v16, 0x1

    .line 105
    .line 106
    iget-object v8, v0, Lwb/v9;->o:Ljava/util/ArrayList;

    .line 107
    .line 108
    move-object v11, v9

    .line 109
    iget-object v9, v0, Lwb/v9;->p:Li0/a1;

    .line 110
    .line 111
    iget-object v10, v0, Lwb/v9;->q:Li0/a1;

    .line 112
    .line 113
    iget-object v13, v0, Lwb/v9;->r:Lfg/p;

    .line 114
    .line 115
    iget-object v15, v0, Lwb/v9;->s:Li0/a1;

    .line 116
    .line 117
    invoke-direct/range {v6 .. v16}, Lwb/de;-><init>(Ljava/util/List;Ljava/util/ArrayList;Li0/a1;Li0/a1;Ljava/util/List;Ljava/util/List;Lfg/p;Li0/a1;Li0/a1;I)V

    .line 118
    .line 119
    .line 120
    new-instance v3, Ls0/d;

    .line 121
    .line 122
    const v7, 0x3c820e8f

    .line 123
    .line 124
    .line 125
    invoke-direct {v3, v7, v6, v5}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 126
    .line 127
    .line 128
    invoke-static {v1, v2, v3, v4}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 129
    .line 130
    .line 131
    :goto_0
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 132
    .line 133
    return-object v1

    .line 134
    :pswitch_0
    move-object/from16 v1, p1

    .line 135
    .line 136
    check-cast v1, Lr/h;

    .line 137
    .line 138
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    new-instance v2, Lwb/s1;

    .line 142
    .line 143
    const/16 v3, 0x15

    .line 144
    .line 145
    iget-object v4, v0, Lwb/v9;->h:Li0/a1;

    .line 146
    .line 147
    invoke-direct {v2, v4, v3}, Lwb/s1;-><init>(Li0/a1;I)V

    .line 148
    .line 149
    .line 150
    new-instance v3, Ls0/d;

    .line 151
    .line 152
    const v4, 0x24232c73

    .line 153
    .line 154
    .line 155
    const/4 v5, 0x1

    .line 156
    invoke-direct {v3, v4, v2, v5}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 157
    .line 158
    .line 159
    const/4 v2, 0x0

    .line 160
    const/4 v4, 0x3

    .line 161
    invoke-static {v1, v2, v3, v4}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 162
    .line 163
    .line 164
    iget-object v14, v0, Lwb/v9;->i:Li0/a1;

    .line 165
    .line 166
    invoke-interface {v14}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v3

    .line 170
    check-cast v3, Ljava/lang/Boolean;

    .line 171
    .line 172
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 173
    .line 174
    .line 175
    move-result v3

    .line 176
    iget-object v7, v0, Lwb/v9;->j:Ljava/util/List;

    .line 177
    .line 178
    iget-object v9, v0, Lwb/v9;->l:Ljava/util/List;

    .line 179
    .line 180
    if-nez v3, :cond_1

    .line 181
    .line 182
    sget-object v3, Lwb/p0;->v3:Ls0/d;

    .line 183
    .line 184
    invoke-static {v1, v2, v3, v4}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 185
    .line 186
    .line 187
    new-instance v6, Lwb/ce;

    .line 188
    .line 189
    const/4 v11, 0x0

    .line 190
    iget-object v8, v0, Lwb/v9;->k:Lfg/a;

    .line 191
    .line 192
    iget-object v10, v0, Lwb/v9;->m:Lfg/a;

    .line 193
    .line 194
    invoke-direct/range {v6 .. v11}, Lwb/ce;-><init>(Ljava/util/List;Lfg/a;Ljava/util/List;Lfg/a;I)V

    .line 195
    .line 196
    .line 197
    new-instance v3, Ls0/d;

    .line 198
    .line 199
    const v8, 0x5af9f8c5

    .line 200
    .line 201
    .line 202
    invoke-direct {v3, v8, v6, v5}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 203
    .line 204
    .line 205
    invoke-static {v1, v2, v3, v4}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 206
    .line 207
    .line 208
    :cond_1
    new-instance v3, Lwb/nd;

    .line 209
    .line 210
    const/4 v6, 0x1

    .line 211
    move-object v12, v7

    .line 212
    iget-object v7, v0, Lwb/v9;->n:Ljava/util/List;

    .line 213
    .line 214
    invoke-direct {v3, v6, v7}, Lwb/nd;-><init>(ILjava/util/List;)V

    .line 215
    .line 216
    .line 217
    new-instance v6, Ls0/d;

    .line 218
    .line 219
    const v8, 0x3d78ad6a

    .line 220
    .line 221
    .line 222
    invoke-direct {v6, v8, v3, v5}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 223
    .line 224
    .line 225
    invoke-static {v1, v2, v6, v4}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 226
    .line 227
    .line 228
    new-instance v6, Lwb/de;

    .line 229
    .line 230
    const/16 v16, 0x0

    .line 231
    .line 232
    iget-object v8, v0, Lwb/v9;->o:Ljava/util/ArrayList;

    .line 233
    .line 234
    move-object v11, v9

    .line 235
    iget-object v9, v0, Lwb/v9;->p:Li0/a1;

    .line 236
    .line 237
    iget-object v10, v0, Lwb/v9;->q:Li0/a1;

    .line 238
    .line 239
    iget-object v13, v0, Lwb/v9;->r:Lfg/p;

    .line 240
    .line 241
    iget-object v15, v0, Lwb/v9;->s:Li0/a1;

    .line 242
    .line 243
    invoke-direct/range {v6 .. v16}, Lwb/de;-><init>(Ljava/util/List;Ljava/util/ArrayList;Li0/a1;Li0/a1;Ljava/util/List;Ljava/util/List;Lfg/p;Li0/a1;Li0/a1;I)V

    .line 244
    .line 245
    .line 246
    new-instance v3, Ls0/d;

    .line 247
    .line 248
    const v7, -0x4ea8aa55

    .line 249
    .line 250
    .line 251
    invoke-direct {v3, v7, v6, v5}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 252
    .line 253
    .line 254
    invoke-static {v1, v2, v3, v4}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 255
    .line 256
    .line 257
    goto :goto_0

    .line 258
    nop

    .line 259
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
