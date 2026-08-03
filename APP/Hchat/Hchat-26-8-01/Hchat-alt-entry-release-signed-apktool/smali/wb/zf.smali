.class public final synthetic Lwb/zf;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Z

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ZLsf/b;II)V
    .locals 0

    .line 14
    iput p5, p0, Lwb/zf;->g:I

    iput-object p1, p0, Lwb/zf;->j:Ljava/lang/Object;

    iput-boolean p2, p0, Lwb/zf;->h:Z

    iput-object p3, p0, Lwb/zf;->i:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ZLfg/a;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lwb/zf;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwb/zf;->j:Ljava/lang/Object;

    .line 8
    .line 9
    iput-boolean p2, p0, Lwb/zf;->h:Z

    .line 10
    .line 11
    iput-object p3, p0, Lwb/zf;->i:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(ZLfg/a;Lfg/l;I)V
    .locals 0

    .line 15
    const/4 p4, 0x1

    iput p4, p0, Lwb/zf;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lwb/zf;->h:Z

    iput-object p2, p0, Lwb/zf;->i:Ljava/lang/Object;

    iput-object p3, p0, Lwb/zf;->j:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(ZLfg/l;Ljava/util/List;)V
    .locals 1

    .line 16
    const/4 v0, 0x2

    iput v0, p0, Lwb/zf;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lwb/zf;->h:Z

    iput-object p2, p0, Lwb/zf;->j:Ljava/lang/Object;

    iput-object p3, p0, Lwb/zf;->i:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Lwb/zf;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwb/zf;->j:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lwb/k5;

    .line 9
    .line 10
    iget-object v1, p0, Lwb/zf;->i:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lfg/l;

    .line 13
    .line 14
    check-cast p1, Li0/h0;

    .line 15
    .line 16
    check-cast p2, Ljava/lang/Integer;

    .line 17
    .line 18
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    const/4 p2, 0x1

    .line 22
    invoke-static {p2}, Li0/r;->C(I)I

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    iget-boolean v2, p0, Lwb/zf;->h:Z

    .line 27
    .line 28
    invoke-static {v0, v2, v1, p1, p2}, Lwb/ho;->T1(Lwb/k5;ZLfg/l;Li0/h0;I)V

    .line 29
    .line 30
    .line 31
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 32
    .line 33
    return-object p1

    .line 34
    :pswitch_0
    iget-object v0, p0, Lwb/zf;->j:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, Lwb/m5;

    .line 37
    .line 38
    iget-object v1, p0, Lwb/zf;->i:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v1, Lfg/a;

    .line 41
    .line 42
    check-cast p1, Li0/h0;

    .line 43
    .line 44
    check-cast p2, Ljava/lang/Integer;

    .line 45
    .line 46
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    const/4 p2, 0x1

    .line 50
    invoke-static {p2}, Li0/r;->C(I)I

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    iget-boolean v2, p0, Lwb/zf;->h:Z

    .line 55
    .line 56
    invoke-static {v0, v2, v1, p1, p2}, Lwb/ho;->U1(Lwb/m5;ZLfg/a;Li0/h0;I)V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :pswitch_1
    iget-object v0, p0, Lwb/zf;->j:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v0, Lwb/bp;

    .line 63
    .line 64
    iget-object v1, p0, Lwb/zf;->i:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v1, Lfg/a;

    .line 67
    .line 68
    check-cast p1, Li0/h0;

    .line 69
    .line 70
    check-cast p2, Ljava/lang/Integer;

    .line 71
    .line 72
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    const/4 p2, 0x1

    .line 76
    invoke-static {p2}, Li0/r;->C(I)I

    .line 77
    .line 78
    .line 79
    move-result p2

    .line 80
    iget-boolean v2, p0, Lwb/zf;->h:Z

    .line 81
    .line 82
    invoke-static {v0, v2, v1, p1, p2}, Lwb/ho;->x2(Lwb/bp;ZLfg/a;Li0/h0;I)V

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :pswitch_2
    iget-object v0, p0, Lwb/zf;->j:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v0, Lfg/l;

    .line 89
    .line 90
    iget-object v1, p0, Lwb/zf;->i:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v1, Ljava/util/List;

    .line 93
    .line 94
    move-object v5, p1

    .line 95
    check-cast v5, Li0/h0;

    .line 96
    .line 97
    check-cast p2, Ljava/lang/Integer;

    .line 98
    .line 99
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    and-int/lit8 p2, p1, 0x3

    .line 104
    .line 105
    const/4 v2, 0x2

    .line 106
    const/4 v10, 0x0

    .line 107
    const/4 v11, 0x1

    .line 108
    if-eq p2, v2, :cond_0

    .line 109
    .line 110
    move p2, v11

    .line 111
    goto :goto_1

    .line 112
    :cond_0
    move p2, v10

    .line 113
    :goto_1
    and-int/2addr p1, v11

    .line 114
    invoke-virtual {v5, p1, p2}, Li0/h0;->S(IZ)Z

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    if-eqz p1, :cond_4

    .line 119
    .line 120
    invoke-virtual {v5, v0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p2

    .line 128
    if-nez p1, :cond_1

    .line 129
    .line 130
    sget-object p1, Li0/l;->a:Li0/e;

    .line 131
    .line 132
    if-ne p2, p1, :cond_2

    .line 133
    .line 134
    :cond_1
    new-instance p2, Li/x0;

    .line 135
    .line 136
    const/4 p1, 0x6

    .line 137
    invoke-direct {p2, v0, p1}, Li/x0;-><init>(Lfg/l;I)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v5, p2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    :cond_2
    move-object v6, p2

    .line 144
    check-cast v6, Lfg/l;

    .line 145
    .line 146
    const/16 v8, 0x1b0

    .line 147
    .line 148
    const/16 v9, 0x8

    .line 149
    .line 150
    iget-boolean v2, p0, Lwb/zf;->h:Z

    .line 151
    .line 152
    const-string v3, "\u542f\u7528\u5b9a\u65f6\u4efb\u52a1"

    .line 153
    .line 154
    const-string v4, "\u5f00\u542f\u540e\u6309\u8ba1\u5212\u65f6\u95f4\u53d1\u9001\u804a\u5929\u6d88\u606f\u6216\u53d1\u5e03\u670b\u53cb\u5708"

    .line 155
    .line 156
    move-object v7, v5

    .line 157
    const/4 v5, 0x0

    .line 158
    invoke-static/range {v2 .. v9}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 159
    .line 160
    .line 161
    const/4 p1, 0x0

    .line 162
    invoke-static {p1, v7, v10, v11}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 163
    .line 164
    .line 165
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 166
    .line 167
    .line 168
    move-result p1

    .line 169
    if-eqz p1, :cond_3

    .line 170
    .line 171
    const-string p1, "\u6682\u65e0\u4efb\u52a1"

    .line 172
    .line 173
    :goto_2
    move-object v3, p1

    .line 174
    goto :goto_3

    .line 175
    :cond_3
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 176
    .line 177
    .line 178
    move-result p1

    .line 179
    const-string p2, " \u4e2a"

    .line 180
    .line 181
    invoke-static {p1, p2}, Lp/a;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    goto :goto_2

    .line 186
    :goto_3
    const/4 v6, 0x6

    .line 187
    move-object v5, v7

    .line 188
    const/4 v7, 0x4

    .line 189
    const-string v2, "\u5f53\u524d\u4efb\u52a1"

    .line 190
    .line 191
    const/4 v4, 0x0

    .line 192
    invoke-static/range {v2 .. v7}, Lwb/ho;->B1(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 193
    .line 194
    .line 195
    goto :goto_4

    .line 196
    :cond_4
    move-object v7, v5

    .line 197
    invoke-virtual {v7}, Li0/h0;->V()V

    .line 198
    .line 199
    .line 200
    :goto_4
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 201
    .line 202
    return-object p1

    .line 203
    :pswitch_3
    iget-object v0, p0, Lwb/zf;->i:Ljava/lang/Object;

    .line 204
    .line 205
    check-cast v0, Lfg/a;

    .line 206
    .line 207
    iget-object v1, p0, Lwb/zf;->j:Ljava/lang/Object;

    .line 208
    .line 209
    check-cast v1, Lfg/l;

    .line 210
    .line 211
    check-cast p1, Li0/h0;

    .line 212
    .line 213
    check-cast p2, Ljava/lang/Integer;

    .line 214
    .line 215
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    const/16 p2, 0xdb1

    .line 219
    .line 220
    invoke-static {p2}, Li0/r;->C(I)I

    .line 221
    .line 222
    .line 223
    move-result p2

    .line 224
    iget-boolean v2, p0, Lwb/zf;->h:Z

    .line 225
    .line 226
    invoke-static {v2, v0, v1, p1, p2}, Lwb/ho;->D2(ZLfg/a;Lfg/l;Li0/h0;I)V

    .line 227
    .line 228
    .line 229
    goto/16 :goto_0

    .line 230
    .line 231
    :pswitch_4
    iget-object v0, p0, Lwb/zf;->j:Ljava/lang/Object;

    .line 232
    .line 233
    check-cast v0, Ljava/lang/String;

    .line 234
    .line 235
    iget-object v1, p0, Lwb/zf;->i:Ljava/lang/Object;

    .line 236
    .line 237
    check-cast v1, Lfg/a;

    .line 238
    .line 239
    check-cast p1, Li0/h0;

    .line 240
    .line 241
    check-cast p2, Ljava/lang/Integer;

    .line 242
    .line 243
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 244
    .line 245
    .line 246
    move-result p2

    .line 247
    and-int/lit8 v2, p2, 0x3

    .line 248
    .line 249
    const/4 v3, 0x2

    .line 250
    const/4 v4, 0x1

    .line 251
    if-eq v2, v3, :cond_5

    .line 252
    .line 253
    move v2, v4

    .line 254
    goto :goto_5

    .line 255
    :cond_5
    const/4 v2, 0x0

    .line 256
    :goto_5
    and-int/2addr p2, v4

    .line 257
    invoke-virtual {p1, p2, v2}, Li0/h0;->S(IZ)Z

    .line 258
    .line 259
    .line 260
    move-result p2

    .line 261
    if-eqz p2, :cond_8

    .line 262
    .line 263
    invoke-static {v0}, Lwb/ho;->E4(Ljava/lang/String;)Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object p2

    .line 267
    iget-boolean v0, p0, Lwb/zf;->h:Z

    .line 268
    .line 269
    invoke-virtual {p1, v0}, Li0/h0;->g(Z)Z

    .line 270
    .line 271
    .line 272
    move-result v2

    .line 273
    invoke-virtual {p1, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    move-result v3

    .line 277
    or-int/2addr v2, v3

    .line 278
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v3

    .line 282
    if-nez v2, :cond_6

    .line 283
    .line 284
    sget-object v2, Li0/l;->a:Li0/e;

    .line 285
    .line 286
    if-ne v3, v2, :cond_7

    .line 287
    .line 288
    :cond_6
    new-instance v3, Ll/g;

    .line 289
    .line 290
    const/4 v2, 0x3

    .line 291
    invoke-direct {v3, v0, v1, v2}, Ll/g;-><init>(ZLfg/a;I)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {p1, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 295
    .line 296
    .line 297
    :cond_7
    check-cast v3, Lfg/a;

    .line 298
    .line 299
    const/4 v0, 0x6

    .line 300
    const-string v1, "\u9009\u62e9\u804a\u5929"

    .line 301
    .line 302
    invoke-static {v1, p2, v3, p1, v0}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 303
    .line 304
    .line 305
    goto :goto_6

    .line 306
    :cond_8
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 307
    .line 308
    .line 309
    :goto_6
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 310
    .line 311
    return-object p1

    .line 312
    nop

    .line 313
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
