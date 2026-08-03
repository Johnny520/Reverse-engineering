.class public final Lh/h;
.super Lgg/m;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:Li/k1;

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Lfg/l;

.field public final synthetic j:Lh/t;

.field public final synthetic k:Lw0/p;

.field public final synthetic l:Ls0/d;


# direct methods
.method public constructor <init>(Li/k1;Ljava/lang/Object;Lfg/l;Lh/t;Lw0/p;Ls0/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lh/h;->g:Li/k1;

    .line 2
    .line 3
    iput-object p2, p0, Lh/h;->h:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lh/h;->i:Lfg/l;

    .line 6
    .line 7
    iput-object p4, p0, Lh/h;->j:Lh/t;

    .line 8
    .line 9
    iput-object p5, p0, Lh/h;->k:Lw0/p;

    .line 10
    .line 11
    iput-object p6, p0, Lh/h;->l:Ls0/d;

    .line 12
    .line 13
    const/4 p1, 0x2

    .line 14
    invoke-direct {p0, p1}, Lgg/m;-><init>(I)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    move-object v7, p1

    .line 2
    check-cast v7, Li0/h0;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Number;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    and-int/lit8 p2, p1, 0x3

    .line 11
    .line 12
    const/4 v0, 0x2

    .line 13
    const/4 v1, 0x1

    .line 14
    if-eq p2, v0, :cond_0

    .line 15
    .line 16
    move p2, v1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p2, 0x0

    .line 19
    :goto_0
    and-int/2addr p1, v1

    .line 20
    invoke-virtual {v7, p1, p2}, Li0/h0;->S(IZ)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-eqz p1, :cond_c

    .line 25
    .line 26
    invoke-virtual {v7}, Li0/h0;->P()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iget-object p2, p0, Lh/h;->i:Lfg/l;

    .line 31
    .line 32
    iget-object v0, p0, Lh/h;->j:Lh/t;

    .line 33
    .line 34
    sget-object v1, Li0/l;->a:Li0/e;

    .line 35
    .line 36
    if-ne p1, v1, :cond_1

    .line 37
    .line 38
    invoke-interface {p2, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    check-cast p1, Lh/e0;

    .line 43
    .line 44
    invoke-virtual {v7, p1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    :cond_1
    check-cast p1, Lh/e0;

    .line 48
    .line 49
    move-object v2, v0

    .line 50
    iget-object v0, p0, Lh/h;->g:Li/k1;

    .line 51
    .line 52
    invoke-virtual {v0}, Li/k1;->f()Li/e1;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    iget-object v4, v0, Li/k1;->d:Li0/j1;

    .line 57
    .line 58
    invoke-interface {v3}, Li/e1;->c()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    iget-object v5, p0, Lh/h;->h:Ljava/lang/Object;

    .line 63
    .line 64
    invoke-static {v3, v5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    invoke-virtual {v7, v3}, Li0/h0;->g(Z)Z

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    invoke-virtual {v7}, Li0/h0;->P()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    if-nez v3, :cond_2

    .line 77
    .line 78
    if-ne v6, v1, :cond_4

    .line 79
    .line 80
    :cond_2
    invoke-virtual {v0}, Li/k1;->f()Li/e1;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    invoke-interface {v3}, Li/e1;->c()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    invoke-static {v3, v5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    if-eqz v3, :cond_3

    .line 93
    .line 94
    sget-object p2, Lh/s0;->b:Lh/s0;

    .line 95
    .line 96
    :goto_1
    move-object v6, p2

    .line 97
    goto :goto_2

    .line 98
    :cond_3
    invoke-interface {p2, v2}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p2

    .line 102
    check-cast p2, Lh/e0;

    .line 103
    .line 104
    iget-object p2, p2, Lh/e0;->b:Lh/s0;

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :goto_2
    invoke-virtual {v7, v6}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    :cond_4
    check-cast v6, Lh/s0;

    .line 111
    .line 112
    invoke-virtual {v7}, Li0/h0;->P()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p2

    .line 116
    if-ne p2, v1, :cond_5

    .line 117
    .line 118
    new-instance p2, Lh/o;

    .line 119
    .line 120
    invoke-virtual {v4}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    invoke-static {v5, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v3

    .line 128
    invoke-direct {p2, v3}, Lh/o;-><init>(Z)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v7, p2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    :cond_5
    check-cast p2, Lh/o;

    .line 135
    .line 136
    iget-object v3, p1, Lh/e0;->a:Lh/r0;

    .line 137
    .line 138
    invoke-virtual {v7, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v8

    .line 142
    invoke-virtual {v7}, Li0/h0;->P()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v9

    .line 146
    if-nez v8, :cond_6

    .line 147
    .line 148
    if-ne v9, v1, :cond_7

    .line 149
    .line 150
    :cond_6
    new-instance v9, Lh/e;

    .line 151
    .line 152
    invoke-direct {v9, p1}, Lh/e;-><init>(Lh/e0;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v7, v9}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    :cond_7
    check-cast v9, Lfg/q;

    .line 159
    .line 160
    sget-object p1, Ly0/l;->a:Ly0/l;

    .line 161
    .line 162
    invoke-static {p1, v9}, Lv1/w;->k(Ly0/o;Lfg/q;)Ly0/o;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    invoke-virtual {v4}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v4

    .line 170
    invoke-static {v5, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v4

    .line 174
    iget-object v8, p2, Lh/o;->a:Li0/j1;

    .line 175
    .line 176
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 177
    .line 178
    .line 179
    move-result-object v4

    .line 180
    invoke-virtual {v8, v4}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    invoke-interface {p1, p2}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    invoke-virtual {v7, v5}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result p2

    .line 191
    invoke-virtual {v7}, Li0/h0;->P()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v4

    .line 195
    if-nez p2, :cond_8

    .line 196
    .line 197
    if-ne v4, v1, :cond_9

    .line 198
    .line 199
    :cond_8
    new-instance v4, Lb1/f;

    .line 200
    .line 201
    const/16 p2, 0xb

    .line 202
    .line 203
    invoke-direct {v4, v5, p2}, Lb1/f;-><init>(Ljava/lang/Object;I)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v7, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 207
    .line 208
    .line 209
    :cond_9
    check-cast v4, Lfg/l;

    .line 210
    .line 211
    invoke-virtual {v7, v6}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result p2

    .line 215
    invoke-virtual {v7}, Li0/h0;->P()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v8

    .line 219
    if-nez p2, :cond_a

    .line 220
    .line 221
    if-ne v8, v1, :cond_b

    .line 222
    .line 223
    :cond_a
    new-instance v8, La1/h;

    .line 224
    .line 225
    const/4 p2, 0x1

    .line 226
    invoke-direct {v8, v6, p2}, La1/h;-><init>(Ljava/lang/Object;I)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v7, v8}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 230
    .line 231
    .line 232
    :cond_b
    check-cast v8, Lfg/p;

    .line 233
    .line 234
    new-instance p2, Lh/g;

    .line 235
    .line 236
    iget-object v1, p0, Lh/h;->k:Lw0/p;

    .line 237
    .line 238
    iget-object v9, p0, Lh/h;->l:Ls0/d;

    .line 239
    .line 240
    invoke-direct {p2, v1, v5, v2, v9}, Lh/g;-><init>(Lw0/p;Ljava/lang/Object;Lh/t;Ls0/d;)V

    .line 241
    .line 242
    .line 243
    const v1, -0x88b4ab7

    .line 244
    .line 245
    .line 246
    invoke-static {v1, p2, v7}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 247
    .line 248
    .line 249
    move-result-object p2

    .line 250
    move-object v5, v8

    .line 251
    const/high16 v8, 0xc00000

    .line 252
    .line 253
    move-object v2, p1

    .line 254
    move-object v1, v4

    .line 255
    move-object v4, v6

    .line 256
    move-object v6, p2

    .line 257
    invoke-static/range {v0 .. v8}, Lh/a0;->a(Li/k1;Lfg/l;Ly0/o;Lh/r0;Lh/s0;Lfg/p;Ls0/d;Li0/h0;I)V

    .line 258
    .line 259
    .line 260
    goto :goto_3

    .line 261
    :cond_c
    invoke-virtual {v7}, Li0/h0;->V()V

    .line 262
    .line 263
    .line 264
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 265
    .line 266
    return-object p1
.end method
