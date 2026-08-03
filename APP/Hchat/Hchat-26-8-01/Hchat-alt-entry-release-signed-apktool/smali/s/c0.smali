.class public final synthetic Ls/c0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:Ls/m0;

.field public final synthetic h:Ly0/o;

.field public final synthetic i:Lr/o;

.field public final synthetic j:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Ls/m0;Ly0/o;Lr/o;Li0/a1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ls/c0;->g:Ls/m0;

    .line 5
    .line 6
    iput-object p2, p0, Ls/c0;->h:Ly0/o;

    .line 7
    .line 8
    iput-object p3, p0, Ls/c0;->i:Lr/o;

    .line 9
    .line 10
    iput-object p4, p0, Ls/c0;->j:Li0/a1;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    check-cast p1, Lv0/c;

    .line 2
    .line 3
    check-cast p2, Li0/h0;

    .line 4
    .line 5
    check-cast p3, Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p2}, Li0/h0;->P()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p3

    .line 14
    sget-object v0, Li0/l;->a:Li0/e;

    .line 15
    .line 16
    if-ne p3, v0, :cond_0

    .line 17
    .line 18
    new-instance p3, Ls/b0;

    .line 19
    .line 20
    new-instance v1, Lb0/j;

    .line 21
    .line 22
    const/16 v2, 0xc

    .line 23
    .line 24
    iget-object v3, p0, Ls/c0;->j:Li0/a1;

    .line 25
    .line 26
    invoke-direct {v1, v3, v2}, Lb0/j;-><init>(Li0/a1;I)V

    .line 27
    .line 28
    .line 29
    invoke-direct {p3, p1, v1}, Ls/b0;-><init>(Lv0/c;Lb0/j;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p2, p3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    check-cast p3, Ls/b0;

    .line 36
    .line 37
    invoke-virtual {p2}, Li0/h0;->P()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    if-ne p1, v0, :cond_1

    .line 42
    .line 43
    new-instance p1, Lv1/j1;

    .line 44
    .line 45
    new-instance v1, Lp4/t;

    .line 46
    .line 47
    invoke-direct {v1, p3}, Lp4/t;-><init>(Ls/b0;)V

    .line 48
    .line 49
    .line 50
    invoke-direct {p1, v1}, Lv1/j1;-><init>(Lv1/l1;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p2, p1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    :cond_1
    check-cast p1, Lv1/j1;

    .line 57
    .line 58
    iget-object v1, p0, Ls/c0;->g:Ls/m0;

    .line 59
    .line 60
    const/4 v2, 0x0

    .line 61
    if-eqz v1, :cond_9

    .line 62
    .line 63
    const v3, 0x67eb8deb

    .line 64
    .line 65
    .line 66
    invoke-virtual {p2, v3}, Li0/h0;->a0(I)V

    .line 67
    .line 68
    .line 69
    const v3, 0x34e696b7

    .line 70
    .line 71
    .line 72
    invoke-virtual {p2, v3}, Li0/h0;->a0(I)V

    .line 73
    .line 74
    .line 75
    sget-object v3, Ls/c1;->a:Ls/b1;

    .line 76
    .line 77
    if-eqz v3, :cond_2

    .line 78
    .line 79
    const v4, 0x503387d0

    .line 80
    .line 81
    .line 82
    invoke-virtual {p2, v4}, Li0/h0;->a0(I)V

    .line 83
    .line 84
    .line 85
    :goto_0
    invoke-virtual {p2, v2}, Li0/h0;->p(Z)V

    .line 86
    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_2
    const v3, 0x50344781

    .line 90
    .line 91
    .line 92
    invoke-virtual {p2, v3}, Li0/h0;->a0(I)V

    .line 93
    .line 94
    .line 95
    sget-object v3, Ly1/i0;->f:Li0/m2;

    .line 96
    .line 97
    invoke-virtual {p2, v3}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    check-cast v3, Landroid/view/View;

    .line 102
    .line 103
    invoke-virtual {p2, v3}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v4

    .line 107
    invoke-virtual {p2}, Li0/h0;->P()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    if-nez v4, :cond_3

    .line 112
    .line 113
    if-ne v5, v0, :cond_6

    .line 114
    .line 115
    :cond_3
    const v4, 0x7f060032

    .line 116
    .line 117
    .line 118
    invoke-virtual {v3, v4}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v5

    .line 122
    instance-of v6, v5, Ls/a1;

    .line 123
    .line 124
    if-eqz v6, :cond_4

    .line 125
    .line 126
    check-cast v5, Ls/a1;

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_4
    const/4 v5, 0x0

    .line 130
    :goto_1
    if-nez v5, :cond_5

    .line 131
    .line 132
    new-instance v5, Ls/b;

    .line 133
    .line 134
    invoke-direct {v5, v3}, Ls/b;-><init>(Landroid/view/View;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v3, v4, v5}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    :cond_5
    invoke-virtual {p2, v5}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    :cond_6
    move-object v3, v5

    .line 144
    check-cast v3, Ls/a1;

    .line 145
    .line 146
    goto :goto_0

    .line 147
    :goto_2
    invoke-virtual {p2, v2}, Li0/h0;->p(Z)V

    .line 148
    .line 149
    .line 150
    filled-new-array {v1, p3, p1, v3}, [Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v4

    .line 154
    invoke-virtual {p2, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result v5

    .line 158
    invoke-virtual {p2, p3}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v6

    .line 162
    or-int/2addr v5, v6

    .line 163
    invoke-virtual {p2, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v6

    .line 167
    or-int/2addr v5, v6

    .line 168
    invoke-virtual {p2, v3}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result v6

    .line 172
    or-int/2addr v5, v6

    .line 173
    invoke-virtual {p2}, Li0/h0;->P()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v6

    .line 177
    if-nez v5, :cond_7

    .line 178
    .line 179
    if-ne v6, v0, :cond_8

    .line 180
    .line 181
    :cond_7
    new-instance v6, Ls/e0;

    .line 182
    .line 183
    invoke-direct {v6, v1, p3, p1, v3}, Ls/e0;-><init>(Ls/m0;Ls/b0;Lv1/j1;Ls/a1;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {p2, v6}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    :cond_8
    check-cast v6, Lfg/l;

    .line 190
    .line 191
    invoke-static {v4, v6, p2}, Li0/r;->e([Ljava/lang/Object;Lfg/l;Li0/h0;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {p2, v2}, Li0/h0;->p(Z)V

    .line 195
    .line 196
    .line 197
    goto :goto_3

    .line 198
    :cond_9
    const v3, 0x67f47fcd

    .line 199
    .line 200
    .line 201
    invoke-virtual {p2, v3}, Li0/h0;->a0(I)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {p2, v2}, Li0/h0;->p(Z)V

    .line 205
    .line 206
    .line 207
    :goto_3
    sget v2, Ls/n0;->a:I

    .line 208
    .line 209
    iget-object v2, p0, Ls/c0;->h:Ly0/o;

    .line 210
    .line 211
    if-eqz v1, :cond_b

    .line 212
    .line 213
    new-instance v3, Ls/f1;

    .line 214
    .line 215
    invoke-direct {v3, v1}, Ls/f1;-><init>(Ls/m0;)V

    .line 216
    .line 217
    .line 218
    invoke-interface {v2, v3}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    if-nez v1, :cond_a

    .line 223
    .line 224
    goto :goto_4

    .line 225
    :cond_a
    move-object v2, v1

    .line 226
    :cond_b
    :goto_4
    invoke-virtual {p2, p3}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    move-result v1

    .line 230
    iget-object v3, p0, Ls/c0;->i:Lr/o;

    .line 231
    .line 232
    invoke-virtual {p2, v3}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 233
    .line 234
    .line 235
    move-result v4

    .line 236
    or-int/2addr v1, v4

    .line 237
    invoke-virtual {p2}, Li0/h0;->P()Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v4

    .line 241
    if-nez v1, :cond_c

    .line 242
    .line 243
    if-ne v4, v0, :cond_d

    .line 244
    .line 245
    :cond_c
    new-instance v4, Lb0/q;

    .line 246
    .line 247
    const/16 v0, 0xb

    .line 248
    .line 249
    invoke-direct {v4, p3, v0, v3}, Lb0/q;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {p2, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    :cond_d
    check-cast v4, Lfg/p;

    .line 256
    .line 257
    const/16 p3, 0x8

    .line 258
    .line 259
    invoke-static {p1, v2, v4, p2, p3}, Lv1/w;->a(Lv1/j1;Ly0/o;Lfg/p;Li0/h0;I)V

    .line 260
    .line 261
    .line 262
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 263
    .line 264
    return-object p1
.end method
