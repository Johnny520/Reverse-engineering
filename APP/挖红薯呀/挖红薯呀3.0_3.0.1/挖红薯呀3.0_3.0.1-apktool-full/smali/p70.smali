.class public final synthetic Lp70;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lxw;


# instance fields
.field public final synthetic d:Ld80;

.field public final synthetic e:Lpe0;

.field public final synthetic f:Lr70;

.field public final synthetic g:Loh0;


# direct methods
.method public synthetic constructor <init>(Ld80;Lpe0;Lr70;Loh0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lp70;->d:Ld80;

    .line 5
    .line 6
    iput-object p2, p0, Lp70;->e:Lpe0;

    .line 7
    .line 8
    iput-object p3, p0, Lp70;->f:Lr70;

    .line 9
    .line 10
    iput-object p4, p0, Lp70;->g:Loh0;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    check-cast p1, Lww0;

    .line 2
    .line 3
    check-cast p2, Lji;

    .line 4
    .line 5
    check-cast p3, Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    check-cast p2, Lpi;

    .line 11
    .line 12
    invoke-virtual {p2}, Lpi;->L()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p3

    .line 16
    const/4 v0, 0x0

    .line 17
    sget-object v1, Lii;->a:Lr3;

    .line 18
    .line 19
    if-ne p3, v1, :cond_0

    .line 20
    .line 21
    new-instance p3, Ln70;

    .line 22
    .line 23
    new-instance v2, Lq70;

    .line 24
    .line 25
    iget-object v3, p0, Lp70;->g:Loh0;

    .line 26
    .line 27
    invoke-direct {v2, v3, v0}, Lq70;-><init>(Loh0;I)V

    .line 28
    .line 29
    .line 30
    invoke-direct {p3, p1, v2}, Ln70;-><init>(Lww0;Lq70;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p2, p3}, Lpi;->g0(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    move-object v4, p3

    .line 37
    check-cast v4, Ln70;

    .line 38
    .line 39
    invoke-virtual {p2}, Lpi;->L()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    if-ne p1, v1, :cond_1

    .line 44
    .line 45
    new-instance p1, Lx41;

    .line 46
    .line 47
    new-instance p3, Ld;

    .line 48
    .line 49
    invoke-direct {p3, v4}, Ld;-><init>(Ln70;)V

    .line 50
    .line 51
    .line 52
    invoke-direct {p1, p3}, Lx41;-><init>(La51;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p2, p1}, Lpi;->g0(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    :cond_1
    move-object v5, p1

    .line 59
    check-cast v5, Lx41;

    .line 60
    .line 61
    iget-object v3, p0, Lp70;->d:Ld80;

    .line 62
    .line 63
    if-eqz v3, :cond_c

    .line 64
    .line 65
    const p1, 0x67eb8deb

    .line 66
    .line 67
    .line 68
    invoke-virtual {p2, p1}, Lpi;->W(I)V

    .line 69
    .line 70
    .line 71
    const p1, 0x34e696b7

    .line 72
    .line 73
    .line 74
    invoke-virtual {p2, p1}, Lpi;->W(I)V

    .line 75
    .line 76
    .line 77
    sget-object p1, Les0;->a:Lds0;

    .line 78
    .line 79
    if-eqz p1, :cond_2

    .line 80
    .line 81
    const p3, 0x503387d0

    .line 82
    .line 83
    .line 84
    invoke-virtual {p2, p3}, Lpi;->W(I)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p2, v0}, Lpi;->p(Z)V

    .line 88
    .line 89
    .line 90
    :goto_0
    move-object v6, p1

    .line 91
    goto :goto_2

    .line 92
    :cond_2
    const p1, 0x50344781

    .line 93
    .line 94
    .line 95
    invoke-virtual {p2, p1}, Lpi;->W(I)V

    .line 96
    .line 97
    .line 98
    sget-object p1, Lr4;->e:Lg41;

    .line 99
    .line 100
    invoke-virtual {p2, p1}, Lpi;->j(Lat0;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    check-cast p1, Landroid/view/View;

    .line 105
    .line 106
    invoke-virtual {p2, p1}, Lpi;->f(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result p3

    .line 110
    invoke-virtual {p2}, Lpi;->L()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    if-nez p3, :cond_3

    .line 115
    .line 116
    if-ne v2, v1, :cond_6

    .line 117
    .line 118
    :cond_3
    const p3, 0x7f060031

    .line 119
    .line 120
    .line 121
    invoke-virtual {p1, p3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    instance-of v6, v2, Lcs0;

    .line 126
    .line 127
    if-eqz v6, :cond_4

    .line 128
    .line 129
    check-cast v2, Lcs0;

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_4
    const/4 v2, 0x0

    .line 133
    :goto_1
    if-nez v2, :cond_5

    .line 134
    .line 135
    new-instance v2, Lj6;

    .line 136
    .line 137
    invoke-direct {v2, p1}, Lj6;-><init>(Landroid/view/View;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p1, p3, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    :cond_5
    invoke-virtual {p2, v2}, Lpi;->g0(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    :cond_6
    move-object p1, v2

    .line 147
    check-cast p1, Lcs0;

    .line 148
    .line 149
    invoke-virtual {p2, v0}, Lpi;->p(Z)V

    .line 150
    .line 151
    .line 152
    goto :goto_0

    .line 153
    :goto_2
    invoke-virtual {p2, v0}, Lpi;->p(Z)V

    .line 154
    .line 155
    .line 156
    filled-new-array {v3, v4, v5, v6}, [Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    invoke-virtual {p2, v3}, Lpi;->f(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result p3

    .line 164
    invoke-virtual {p2, v4}, Lpi;->h(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v2

    .line 168
    or-int/2addr p3, v2

    .line 169
    invoke-virtual {p2, v5}, Lpi;->h(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v2

    .line 173
    or-int/2addr p3, v2

    .line 174
    invoke-virtual {p2, v6}, Lpi;->h(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-result v2

    .line 178
    or-int/2addr p3, v2

    .line 179
    invoke-virtual {p2}, Lpi;->L()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    if-nez p3, :cond_7

    .line 184
    .line 185
    if-ne v2, v1, :cond_8

    .line 186
    .line 187
    :cond_7
    new-instance v2, Ly6;

    .line 188
    .line 189
    const/4 v7, 0x1

    .line 190
    invoke-direct/range {v2 .. v7}, Ly6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {p2, v2}, Lpi;->g0(Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    :cond_8
    check-cast v2, Lsw;

    .line 197
    .line 198
    const/4 p3, 0x4

    .line 199
    invoke-static {p1, p3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    array-length p3, p1

    .line 204
    move v6, v0

    .line 205
    move v7, v6

    .line 206
    :goto_3
    if-ge v6, p3, :cond_9

    .line 207
    .line 208
    aget-object v8, p1, v6

    .line 209
    .line 210
    invoke-virtual {p2, v8}, Lpi;->f(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-result v8

    .line 214
    or-int/2addr v7, v8

    .line 215
    add-int/lit8 v6, v6, 0x1

    .line 216
    .line 217
    goto :goto_3

    .line 218
    :cond_9
    invoke-virtual {p2}, Lpi;->L()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    if-nez v7, :cond_a

    .line 223
    .line 224
    if-ne p1, v1, :cond_b

    .line 225
    .line 226
    :cond_a
    new-instance p1, Lmo;

    .line 227
    .line 228
    invoke-direct {p1, v2}, Lmo;-><init>(Lsw;)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {p2, p1}, Lpi;->g0(Ljava/lang/Object;)V

    .line 232
    .line 233
    .line 234
    :cond_b
    :goto_4
    invoke-virtual {p2, v0}, Lpi;->p(Z)V

    .line 235
    .line 236
    .line 237
    goto :goto_5

    .line 238
    :cond_c
    const p1, 0x678cf6cd

    .line 239
    .line 240
    .line 241
    invoke-virtual {p2, p1}, Lpi;->W(I)V

    .line 242
    .line 243
    .line 244
    goto :goto_4

    .line 245
    :goto_5
    sget p1, Le80;->a:I

    .line 246
    .line 247
    iget-object p1, p0, Lp70;->e:Lpe0;

    .line 248
    .line 249
    if-eqz v3, :cond_e

    .line 250
    .line 251
    new-instance p3, Li91;

    .line 252
    .line 253
    invoke-direct {p3, v3}, Li91;-><init>(Ld80;)V

    .line 254
    .line 255
    .line 256
    invoke-interface {p1, p3}, Lpe0;->c(Lpe0;)Lpe0;

    .line 257
    .line 258
    .line 259
    move-result-object p3

    .line 260
    if-nez p3, :cond_d

    .line 261
    .line 262
    goto :goto_6

    .line 263
    :cond_d
    move-object p1, p3

    .line 264
    :cond_e
    :goto_6
    invoke-virtual {p2, v4}, Lpi;->f(Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    move-result p3

    .line 268
    iget-object p0, p0, Lp70;->f:Lr70;

    .line 269
    .line 270
    invoke-virtual {p2, p0}, Lpi;->f(Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    move-result v0

    .line 274
    or-int/2addr p3, v0

    .line 275
    invoke-virtual {p2}, Lpi;->L()Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    if-nez p3, :cond_f

    .line 280
    .line 281
    if-ne v0, v1, :cond_10

    .line 282
    .line 283
    :cond_f
    new-instance v0, Led;

    .line 284
    .line 285
    const/4 p3, 0x5

    .line 286
    invoke-direct {v0, p3, v4, p0}, Led;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {p2, v0}, Lpi;->g0(Ljava/lang/Object;)V

    .line 290
    .line 291
    .line 292
    :cond_10
    check-cast v0, Lww;

    .line 293
    .line 294
    const/16 p0, 0x8

    .line 295
    .line 296
    invoke-static {v5, p1, v0, p2, p0}, Li4;->g(Lx41;Lpe0;Lww;Lji;I)V

    .line 297
    .line 298
    .line 299
    sget-object p0, Lna1;->a:Lna1;

    .line 300
    .line 301
    return-object p0
.end method
