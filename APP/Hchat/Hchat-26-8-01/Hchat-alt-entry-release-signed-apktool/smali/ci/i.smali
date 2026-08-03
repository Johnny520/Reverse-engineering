.class public final Lci/i;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ltg/e;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lci/i;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lci/i;->h:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Lwf/c;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget p2, p0, Lci/i;->g:I

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Number;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iget-object p2, p0, Lci/i;->h:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p2, Ly1/z1;

    .line 15
    .line 16
    iget-object p2, p2, Ly1/z1;->i:Li0/f1;

    .line 17
    .line 18
    invoke-virtual {p2, p1}, Li0/f1;->h(F)V

    .line 19
    .line 20
    .line 21
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_0
    iget-object p2, p0, Lci/i;->h:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p2, Lgg/u;

    .line 27
    .line 28
    iput-object p1, p2, Lgg/u;->g:Ljava/lang/Object;

    .line 29
    .line 30
    new-instance p1, Lug/a;

    .line 31
    .line 32
    invoke-direct {p1, p0}, Lug/a;-><init>(Ltg/e;)V

    .line 33
    .line 34
    .line 35
    throw p1

    .line 36
    :pswitch_1
    check-cast p1, Lsf/n;

    .line 37
    .line 38
    iget-object p1, p0, Lci/i;->h:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, Lf0/n;

    .line 41
    .line 42
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 43
    .line 44
    const/16 v0, 0x22

    .line 45
    .line 46
    if-lt p2, v0, :cond_0

    .line 47
    .line 48
    invoke-virtual {p1}, Lf0/n;->a()Landroid/view/inputmethod/InputMethodManager;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    iget-object p1, p1, Lf0/n;->b:Landroid/view/View;

    .line 53
    .line 54
    invoke-static {p2, p1}, Lai/a;->y(Landroid/view/inputmethod/InputMethodManager;Landroid/view/View;)V

    .line 55
    .line 56
    .line 57
    :cond_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 58
    .line 59
    return-object p1

    .line 60
    :pswitch_2
    check-cast p1, Ln/j;

    .line 61
    .line 62
    iget-object p2, p0, Lci/i;->h:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast p2, Lci/n0;

    .line 65
    .line 66
    instance-of v0, p1, Ln/m;

    .line 67
    .line 68
    if-eqz v0, :cond_1

    .line 69
    .line 70
    const p1, 0x3f59999a    # 0.85f

    .line 71
    .line 72
    .line 73
    invoke-static {p2, p1}, Lci/n0;->k1(Lci/n0;F)V

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_1
    instance-of v0, p1, Ln/n;

    .line 78
    .line 79
    const/high16 v1, 0x3f800000    # 1.0f

    .line 80
    .line 81
    if-eqz v0, :cond_2

    .line 82
    .line 83
    invoke-static {p2, v1}, Lci/n0;->k1(Lci/n0;F)V

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_2
    instance-of p1, p1, Ln/l;

    .line 88
    .line 89
    if-eqz p1, :cond_3

    .line 90
    .line 91
    invoke-static {p2, v1}, Lci/n0;->k1(Lci/n0;F)V

    .line 92
    .line 93
    .line 94
    :cond_3
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 95
    .line 96
    return-object p1

    .line 97
    :pswitch_3
    check-cast p1, Ln/j;

    .line 98
    .line 99
    iget-object p2, p0, Lci/i;->h:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast p2, Lci/k;

    .line 102
    .line 103
    iget-boolean v0, p2, Lci/k;->w:Z

    .line 104
    .line 105
    iget-boolean v1, p2, Lci/k;->x:Z

    .line 106
    .line 107
    iget-boolean v2, p2, Lci/k;->y:Z

    .line 108
    .line 109
    iget-boolean v3, p2, Lci/k;->z:Z

    .line 110
    .line 111
    instance-of v4, p1, Ln/m;

    .line 112
    .line 113
    const/4 v5, 0x1

    .line 114
    if-eqz v4, :cond_4

    .line 115
    .line 116
    iput-boolean v5, p2, Lci/k;->w:Z

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_4
    instance-of v4, p1, Ln/n;

    .line 120
    .line 121
    const/4 v6, 0x0

    .line 122
    if-nez v4, :cond_b

    .line 123
    .line 124
    instance-of v4, p1, Ln/l;

    .line 125
    .line 126
    if-eqz v4, :cond_5

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_5
    instance-of v4, p1, Ln/h;

    .line 130
    .line 131
    if-eqz v4, :cond_6

    .line 132
    .line 133
    iput-boolean v5, p2, Lci/k;->x:Z

    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_6
    instance-of v4, p1, Ln/i;

    .line 137
    .line 138
    if-eqz v4, :cond_7

    .line 139
    .line 140
    iput-boolean v6, p2, Lci/k;->x:Z

    .line 141
    .line 142
    goto :goto_2

    .line 143
    :cond_7
    instance-of v4, p1, Ln/f;

    .line 144
    .line 145
    if-eqz v4, :cond_8

    .line 146
    .line 147
    iput-boolean v5, p2, Lci/k;->y:Z

    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_8
    instance-of v4, p1, Ln/g;

    .line 151
    .line 152
    if-eqz v4, :cond_9

    .line 153
    .line 154
    iput-boolean v6, p2, Lci/k;->y:Z

    .line 155
    .line 156
    goto :goto_2

    .line 157
    :cond_9
    instance-of v4, p1, Lzh/a;

    .line 158
    .line 159
    if-eqz v4, :cond_a

    .line 160
    .line 161
    iput-boolean v5, p2, Lci/k;->z:Z

    .line 162
    .line 163
    goto :goto_2

    .line 164
    :cond_a
    instance-of p1, p1, Lzh/b;

    .line 165
    .line 166
    if-eqz p1, :cond_15

    .line 167
    .line 168
    iput-boolean v6, p2, Lci/k;->z:Z

    .line 169
    .line 170
    goto :goto_2

    .line 171
    :cond_b
    :goto_1
    iput-boolean v6, p2, Lci/k;->w:Z

    .line 172
    .line 173
    :goto_2
    iget-boolean p1, p2, Lci/k;->w:Z

    .line 174
    .line 175
    if-ne v0, p1, :cond_c

    .line 176
    .line 177
    iget-boolean v0, p2, Lci/k;->x:Z

    .line 178
    .line 179
    if-ne v1, v0, :cond_c

    .line 180
    .line 181
    iget-boolean v0, p2, Lci/k;->y:Z

    .line 182
    .line 183
    if-ne v2, v0, :cond_c

    .line 184
    .line 185
    iget-boolean v0, p2, Lci/k;->z:Z

    .line 186
    .line 187
    if-eq v3, v0, :cond_15

    .line 188
    .line 189
    :cond_c
    new-instance v0, Lgg/r;

    .line 190
    .line 191
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 192
    .line 193
    .line 194
    iget-boolean v1, p2, Lci/k;->x:Z

    .line 195
    .line 196
    if-eqz v1, :cond_d

    .line 197
    .line 198
    iget v1, v0, Lgg/r;->g:F

    .line 199
    .line 200
    const v2, 0x3d75c28f    # 0.06f

    .line 201
    .line 202
    .line 203
    add-float/2addr v1, v2

    .line 204
    iput v1, v0, Lgg/r;->g:F

    .line 205
    .line 206
    :cond_d
    iget-boolean v1, p2, Lci/k;->y:Z

    .line 207
    .line 208
    if-eqz v1, :cond_e

    .line 209
    .line 210
    iget v1, v0, Lgg/r;->g:F

    .line 211
    .line 212
    const v2, 0x3da3d70a    # 0.08f

    .line 213
    .line 214
    .line 215
    add-float/2addr v1, v2

    .line 216
    iput v1, v0, Lgg/r;->g:F

    .line 217
    .line 218
    :cond_e
    const v1, 0x3dcccccd    # 0.1f

    .line 219
    .line 220
    .line 221
    if-eqz p1, :cond_f

    .line 222
    .line 223
    iget p1, v0, Lgg/r;->g:F

    .line 224
    .line 225
    add-float/2addr p1, v1

    .line 226
    iput p1, v0, Lgg/r;->g:F

    .line 227
    .line 228
    :cond_f
    iget-boolean p1, p2, Lci/k;->z:Z

    .line 229
    .line 230
    if-eqz p1, :cond_10

    .line 231
    .line 232
    iget p1, v0, Lgg/r;->g:F

    .line 233
    .line 234
    add-float/2addr p1, v1

    .line 235
    iput p1, v0, Lgg/r;->g:F

    .line 236
    .line 237
    :cond_10
    iget p1, v0, Lgg/r;->g:F

    .line 238
    .line 239
    const/4 v1, 0x0

    .line 240
    cmpg-float p1, p1, v1

    .line 241
    .line 242
    const/4 v1, 0x3

    .line 243
    const/4 v2, 0x0

    .line 244
    if-nez p1, :cond_12

    .line 245
    .line 246
    iget-object p1, p2, Lci/k;->C:Lqg/e1;

    .line 247
    .line 248
    if-eqz p1, :cond_11

    .line 249
    .line 250
    invoke-virtual {p1, v2}, Lqg/y0;->a(Ljava/util/concurrent/CancellationException;)V

    .line 251
    .line 252
    .line 253
    :cond_11
    invoke-virtual {p2}, Ly0/n;->Y0()Lqg/t;

    .line 254
    .line 255
    .line 256
    move-result-object p1

    .line 257
    new-instance v3, Lc0/m;

    .line 258
    .line 259
    const/4 v4, 0x2

    .line 260
    invoke-direct {v3, p2, v0, v2, v4}, Lc0/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 261
    .line 262
    .line 263
    invoke-static {p1, v2, v3, v1}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 264
    .line 265
    .line 266
    move-result-object p1

    .line 267
    iput-object p1, p2, Lci/k;->C:Lqg/e1;

    .line 268
    .line 269
    goto :goto_3

    .line 270
    :cond_12
    iget-object p1, p2, Lci/k;->B:Lqg/e1;

    .line 271
    .line 272
    if-eqz p1, :cond_13

    .line 273
    .line 274
    invoke-virtual {p1, v2}, Lqg/y0;->a(Ljava/util/concurrent/CancellationException;)V

    .line 275
    .line 276
    .line 277
    :cond_13
    iget-object p1, p2, Lci/k;->C:Lqg/e1;

    .line 278
    .line 279
    if-eqz p1, :cond_14

    .line 280
    .line 281
    invoke-virtual {p1, v2}, Lqg/y0;->a(Ljava/util/concurrent/CancellationException;)V

    .line 282
    .line 283
    .line 284
    :cond_14
    invoke-virtual {p2}, Ly0/n;->Y0()Lqg/t;

    .line 285
    .line 286
    .line 287
    move-result-object p1

    .line 288
    new-instance v3, Lci/j;

    .line 289
    .line 290
    const/4 v4, 0x0

    .line 291
    invoke-direct {v3, p2, v0, v2, v4}, Lci/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 292
    .line 293
    .line 294
    invoke-static {p1, v2, v3, v1}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 295
    .line 296
    .line 297
    move-result-object p1

    .line 298
    iput-object p1, p2, Lci/k;->B:Lqg/e1;

    .line 299
    .line 300
    :cond_15
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 301
    .line 302
    return-object p1

    .line 303
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
