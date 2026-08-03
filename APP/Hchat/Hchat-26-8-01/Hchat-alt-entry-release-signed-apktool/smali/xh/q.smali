.class public final synthetic Lxh/q;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/r;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Li0/a1;I)V
    .locals 0

    .line 1
    iput p2, p0, Lxh/q;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lxh/q;->h:Li0/a1;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lxh/q;->g:I

    .line 2
    .line 3
    check-cast p1, Ljava/lang/Boolean;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    check-cast p2, Lfg/p;

    .line 10
    .line 11
    check-cast p3, Li0/h0;

    .line 12
    .line 13
    check-cast p4, Ljava/lang/Integer;

    .line 14
    .line 15
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result p4

    .line 19
    packed-switch v0, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    and-int/lit8 v0, p4, 0x6

    .line 26
    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    invoke-virtual {p3, p1}, Li0/h0;->g(Z)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    const/4 v0, 0x4

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const/4 v0, 0x2

    .line 38
    :goto_0
    or-int/2addr v0, p4

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    move v0, p4

    .line 41
    :goto_1
    and-int/lit8 p4, p4, 0x30

    .line 42
    .line 43
    if-nez p4, :cond_3

    .line 44
    .line 45
    invoke-virtual {p3, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result p4

    .line 49
    if-eqz p4, :cond_2

    .line 50
    .line 51
    const/16 p4, 0x20

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_2
    const/16 p4, 0x10

    .line 55
    .line 56
    :goto_2
    or-int/2addr v0, p4

    .line 57
    :cond_3
    and-int/lit16 p4, v0, 0x93

    .line 58
    .line 59
    const/16 v1, 0x92

    .line 60
    .line 61
    const/4 v2, 0x1

    .line 62
    const/4 v3, 0x0

    .line 63
    if-eq p4, v1, :cond_4

    .line 64
    .line 65
    move p4, v2

    .line 66
    goto :goto_3

    .line 67
    :cond_4
    move p4, v3

    .line 68
    :goto_3
    and-int/2addr v0, v2

    .line 69
    invoke-virtual {p3, v0, p4}, Li0/h0;->S(IZ)Z

    .line 70
    .line 71
    .line 72
    move-result p4

    .line 73
    if-eqz p4, :cond_8

    .line 74
    .line 75
    if-eqz p1, :cond_7

    .line 76
    .line 77
    const p1, 0x71d50222

    .line 78
    .line 79
    .line 80
    invoke-virtual {p3, p1}, Li0/h0;->a0(I)V

    .line 81
    .line 82
    .line 83
    iget-object p1, p0, Lxh/q;->h:Li0/a1;

    .line 84
    .line 85
    invoke-virtual {p3, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result p4

    .line 89
    invoke-virtual {p3}, Li0/h0;->P()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    if-nez p4, :cond_5

    .line 94
    .line 95
    sget-object p4, Li0/l;->a:Li0/e;

    .line 96
    .line 97
    if-ne v0, p4, :cond_6

    .line 98
    .line 99
    :cond_5
    new-instance v0, Lwb/ht;

    .line 100
    .line 101
    const/16 p4, 0x8

    .line 102
    .line 103
    invoke-direct {v0, p1, p4}, Lwb/ht;-><init>(Li0/a1;I)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p3, v0}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    :cond_6
    check-cast v0, Lfg/a;

    .line 110
    .line 111
    new-instance p1, Ly2/u;

    .line 112
    .line 113
    sget-object p4, Ly2/d0;->g:Ly2/d0;

    .line 114
    .line 115
    invoke-direct {p1, v3, p4, v3, v3}, Ly2/u;-><init>(ZLy2/d0;ZZ)V

    .line 116
    .line 117
    .line 118
    new-instance p4, Lsh/i0;

    .line 119
    .line 120
    const/4 v1, 0x7

    .line 121
    invoke-direct {p4, v1, p2}, Lsh/i0;-><init>(ILfg/p;)V

    .line 122
    .line 123
    .line 124
    const p2, -0x53797147

    .line 125
    .line 126
    .line 127
    invoke-static {p2, p4, p3}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 128
    .line 129
    .line 130
    move-result-object p2

    .line 131
    const/16 p4, 0x180

    .line 132
    .line 133
    invoke-static {v0, p1, p2, p3, p4}, Lx6/d;->a(Lfg/a;Ly2/u;Ls0/d;Li0/h0;I)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p3, v3}, Li0/h0;->p(Z)V

    .line 137
    .line 138
    .line 139
    goto :goto_4

    .line 140
    :cond_7
    const p1, 0x71d9991b

    .line 141
    .line 142
    .line 143
    invoke-virtual {p3, p1}, Li0/h0;->a0(I)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p3, v3}, Li0/h0;->p(Z)V

    .line 147
    .line 148
    .line 149
    goto :goto_4

    .line 150
    :cond_8
    invoke-virtual {p3}, Li0/h0;->V()V

    .line 151
    .line 152
    .line 153
    :goto_4
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 154
    .line 155
    return-object p1

    .line 156
    :pswitch_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    and-int/lit8 v0, p4, 0x6

    .line 160
    .line 161
    if-nez v0, :cond_a

    .line 162
    .line 163
    invoke-virtual {p3, p1}, Li0/h0;->g(Z)Z

    .line 164
    .line 165
    .line 166
    move-result v0

    .line 167
    if-eqz v0, :cond_9

    .line 168
    .line 169
    const/4 v0, 0x4

    .line 170
    goto :goto_5

    .line 171
    :cond_9
    const/4 v0, 0x2

    .line 172
    :goto_5
    or-int/2addr v0, p4

    .line 173
    goto :goto_6

    .line 174
    :cond_a
    move v0, p4

    .line 175
    :goto_6
    and-int/lit8 p4, p4, 0x30

    .line 176
    .line 177
    if-nez p4, :cond_c

    .line 178
    .line 179
    invoke-virtual {p3, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    move-result p4

    .line 183
    if-eqz p4, :cond_b

    .line 184
    .line 185
    const/16 p4, 0x20

    .line 186
    .line 187
    goto :goto_7

    .line 188
    :cond_b
    const/16 p4, 0x10

    .line 189
    .line 190
    :goto_7
    or-int/2addr v0, p4

    .line 191
    :cond_c
    and-int/lit16 p4, v0, 0x93

    .line 192
    .line 193
    const/16 v1, 0x92

    .line 194
    .line 195
    const/4 v2, 0x1

    .line 196
    const/4 v3, 0x0

    .line 197
    if-eq p4, v1, :cond_d

    .line 198
    .line 199
    move p4, v2

    .line 200
    goto :goto_8

    .line 201
    :cond_d
    move p4, v3

    .line 202
    :goto_8
    and-int/2addr v0, v2

    .line 203
    invoke-virtual {p3, v0, p4}, Li0/h0;->S(IZ)Z

    .line 204
    .line 205
    .line 206
    move-result p4

    .line 207
    if-eqz p4, :cond_11

    .line 208
    .line 209
    if-eqz p1, :cond_10

    .line 210
    .line 211
    const p1, 0x107a0096

    .line 212
    .line 213
    .line 214
    invoke-virtual {p3, p1}, Li0/h0;->a0(I)V

    .line 215
    .line 216
    .line 217
    iget-object p1, p0, Lxh/q;->h:Li0/a1;

    .line 218
    .line 219
    invoke-virtual {p3, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    move-result p4

    .line 223
    invoke-virtual {p3}, Li0/h0;->P()Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    if-nez p4, :cond_e

    .line 228
    .line 229
    sget-object p4, Li0/l;->a:Li0/e;

    .line 230
    .line 231
    if-ne v0, p4, :cond_f

    .line 232
    .line 233
    :cond_e
    new-instance v0, Lwb/ht;

    .line 234
    .line 235
    const/4 p4, 0x4

    .line 236
    invoke-direct {v0, p1, p4}, Lwb/ht;-><init>(Li0/a1;I)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {p3, v0}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 240
    .line 241
    .line 242
    :cond_f
    check-cast v0, Lfg/a;

    .line 243
    .line 244
    new-instance p1, Ly2/u;

    .line 245
    .line 246
    sget-object p4, Ly2/d0;->g:Ly2/d0;

    .line 247
    .line 248
    invoke-direct {p1, v3, p4, v3, v3}, Ly2/u;-><init>(ZLy2/d0;ZZ)V

    .line 249
    .line 250
    .line 251
    new-instance p4, Lsh/i0;

    .line 252
    .line 253
    const/4 v1, 0x6

    .line 254
    invoke-direct {p4, v1, p2}, Lsh/i0;-><init>(ILfg/p;)V

    .line 255
    .line 256
    .line 257
    const p2, -0x6ad643bb

    .line 258
    .line 259
    .line 260
    invoke-static {p2, p4, p3}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 261
    .line 262
    .line 263
    move-result-object p2

    .line 264
    const/16 p4, 0x180

    .line 265
    .line 266
    invoke-static {v0, p1, p2, p3, p4}, Lx6/d;->a(Lfg/a;Ly2/u;Ls0/d;Li0/h0;I)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {p3, v3}, Li0/h0;->p(Z)V

    .line 270
    .line 271
    .line 272
    goto :goto_9

    .line 273
    :cond_10
    const p1, 0x107e978f

    .line 274
    .line 275
    .line 276
    invoke-virtual {p3, p1}, Li0/h0;->a0(I)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {p3, v3}, Li0/h0;->p(Z)V

    .line 280
    .line 281
    .line 282
    goto :goto_9

    .line 283
    :cond_11
    invoke-virtual {p3}, Li0/h0;->V()V

    .line 284
    .line 285
    .line 286
    :goto_9
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 287
    .line 288
    return-object p1

    .line 289
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
