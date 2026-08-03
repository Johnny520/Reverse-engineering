.class public final synthetic Lwb/be;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Z

.field public final synthetic k:I

.field public final synthetic l:Ljava/lang/Object;

.field public final synthetic m:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lwb/be;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwb/be;->l:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lwb/be;->h:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p3, p0, Lwb/be;->i:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p4, p0, Lwb/be;->m:Ljava/lang/Object;

    .line 14
    .line 15
    iput-boolean p5, p0, Lwb/be;->j:Z

    .line 16
    .line 17
    iput p6, p0, Lwb/be;->k:I

    .line 18
    .line 19
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;ZLfg/a;Lsf/b;II)V
    .locals 0

    .line 20
    iput p7, p0, Lwb/be;->g:I

    iput-object p1, p0, Lwb/be;->h:Ljava/lang/String;

    iput-object p2, p0, Lwb/be;->i:Ljava/lang/String;

    iput-boolean p3, p0, Lwb/be;->j:Z

    iput-object p4, p0, Lwb/be;->l:Ljava/lang/Object;

    iput-object p5, p0, Lwb/be;->m:Ljava/lang/Object;

    iput p6, p0, Lwb/be;->k:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lwb/be;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwb/be;->l:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v4, v0

    .line 9
    check-cast v4, Lfg/a;

    .line 10
    .line 11
    iget-object v0, p0, Lwb/be;->m:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v5, v0

    .line 14
    check-cast v5, Lfg/l;

    .line 15
    .line 16
    move-object v6, p1

    .line 17
    check-cast v6, Li0/h0;

    .line 18
    .line 19
    check-cast p2, Ljava/lang/Integer;

    .line 20
    .line 21
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget p1, p0, Lwb/be;->k:I

    .line 25
    .line 26
    or-int/lit8 p1, p1, 0x1

    .line 27
    .line 28
    invoke-static {p1}, Li0/r;->C(I)I

    .line 29
    .line 30
    .line 31
    move-result v7

    .line 32
    iget-object v1, p0, Lwb/be;->h:Ljava/lang/String;

    .line 33
    .line 34
    iget-object v2, p0, Lwb/be;->i:Ljava/lang/String;

    .line 35
    .line 36
    iget-boolean v3, p0, Lwb/be;->j:Z

    .line 37
    .line 38
    invoke-static/range {v1 .. v7}, Lwb/ho;->W3(Ljava/lang/String;Ljava/lang/String;ZLfg/a;Lfg/l;Li0/h0;I)V

    .line 39
    .line 40
    .line 41
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 42
    .line 43
    return-object p1

    .line 44
    :pswitch_0
    iget-object v0, p0, Lwb/be;->l:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v0, Lfg/a;

    .line 47
    .line 48
    iget-object v1, p0, Lwb/be;->m:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v1, Lfg/a;

    .line 51
    .line 52
    move-object v5, p1

    .line 53
    check-cast v5, Li0/h0;

    .line 54
    .line 55
    check-cast p2, Ljava/lang/Integer;

    .line 56
    .line 57
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    and-int/lit8 p2, p1, 0x3

    .line 62
    .line 63
    const/4 v2, 0x2

    .line 64
    const/4 v3, 0x1

    .line 65
    const/4 v8, 0x0

    .line 66
    if-eq p2, v2, :cond_0

    .line 67
    .line 68
    move p2, v3

    .line 69
    goto :goto_1

    .line 70
    :cond_0
    move p2, v8

    .line 71
    :goto_1
    and-int/2addr p1, v3

    .line 72
    invoke-virtual {v5, p1, p2}, Li0/h0;->S(IZ)Z

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    if-eqz p1, :cond_a

    .line 77
    .line 78
    iget-object p1, p0, Lwb/be;->h:Ljava/lang/String;

    .line 79
    .line 80
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 81
    .line 82
    .line 83
    move-result p2

    .line 84
    iget-object v2, p0, Lwb/be;->i:Ljava/lang/String;

    .line 85
    .line 86
    if-eqz p2, :cond_1

    .line 87
    .line 88
    const-string p2, "\u672a\u9009\u62e9"

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_1
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 92
    .line 93
    .line 94
    move-result p2

    .line 95
    if-eqz p2, :cond_2

    .line 96
    .line 97
    new-instance p2, Ljava/io/File;

    .line 98
    .line 99
    invoke-direct {p2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p2}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 107
    .line 108
    .line 109
    move-result v4

    .line 110
    if-eqz v4, :cond_3

    .line 111
    .line 112
    const-string p2, "\u5df2\u9009\u62e9\u6587\u4ef6"

    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_2
    move-object p2, v2

    .line 116
    :cond_3
    :goto_2
    iget-boolean v4, p0, Lwb/be;->j:Z

    .line 117
    .line 118
    invoke-virtual {v5, v4}, Li0/h0;->g(Z)Z

    .line 119
    .line 120
    .line 121
    move-result v6

    .line 122
    invoke-virtual {v5, v0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v7

    .line 126
    or-int/2addr v6, v7

    .line 127
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v7

    .line 131
    sget-object v9, Li0/l;->a:Li0/e;

    .line 132
    .line 133
    if-nez v6, :cond_4

    .line 134
    .line 135
    if-ne v7, v9, :cond_5

    .line 136
    .line 137
    :cond_4
    new-instance v7, Ll/g;

    .line 138
    .line 139
    const/4 v6, 0x1

    .line 140
    invoke-direct {v7, v4, v0, v6}, Ll/g;-><init>(ZLfg/a;I)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v5, v7}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    :cond_5
    check-cast v7, Lfg/a;

    .line 147
    .line 148
    const/4 v0, 0x6

    .line 149
    const-string v6, "\u9009\u62e9\u8f93\u5165\u6587\u4ef6"

    .line 150
    .line 151
    invoke-static {v6, p2, v7, v5, v0}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 152
    .line 153
    .line 154
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 155
    .line 156
    .line 157
    move-result p1

    .line 158
    const/4 p2, 0x0

    .line 159
    if-nez p1, :cond_8

    .line 160
    .line 161
    const p1, -0x46998c92

    .line 162
    .line 163
    .line 164
    invoke-virtual {v5, p1}, Li0/h0;->a0(I)V

    .line 165
    .line 166
    .line 167
    invoke-static {p2, v5, v8, v3}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v5, v4}, Li0/h0;->g(Z)Z

    .line 171
    .line 172
    .line 173
    move-result p1

    .line 174
    invoke-virtual {v5, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-result v0

    .line 178
    or-int/2addr p1, v0

    .line 179
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    if-nez p1, :cond_6

    .line 184
    .line 185
    if-ne v0, v9, :cond_7

    .line 186
    .line 187
    :cond_6
    new-instance v0, Ll/g;

    .line 188
    .line 189
    const/4 p1, 0x2

    .line 190
    invoke-direct {v0, v4, v1, p1}, Ll/g;-><init>(ZLfg/a;I)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v5, v0}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    :cond_7
    check-cast v0, Lfg/a;

    .line 197
    .line 198
    const/16 p1, 0x36

    .line 199
    .line 200
    const-string v1, "\u6e05\u7a7a\u8f93\u5165\u6587\u4ef6"

    .line 201
    .line 202
    const-string v4, "\u79fb\u9664\u5f53\u524d\u5df2\u9009\u6587\u4ef6"

    .line 203
    .line 204
    invoke-static {v1, v4, v0, v5, p1}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v5, v8}, Li0/h0;->p(Z)V

    .line 208
    .line 209
    .line 210
    goto :goto_3

    .line 211
    :cond_8
    const p1, -0x46969287

    .line 212
    .line 213
    .line 214
    invoke-virtual {v5, p1}, Li0/h0;->a0(I)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v5, v8}, Li0/h0;->p(Z)V

    .line 218
    .line 219
    .line 220
    :goto_3
    iget p1, p0, Lwb/be;->k:I

    .line 221
    .line 222
    if-eq p1, v3, :cond_9

    .line 223
    .line 224
    const v0, -0x4695463f

    .line 225
    .line 226
    .line 227
    invoke-virtual {v5, v0}, Li0/h0;->a0(I)V

    .line 228
    .line 229
    .line 230
    invoke-static {p2, v5, v8, v3}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 231
    .line 232
    .line 233
    invoke-static {p1, v2}, Lwb/ho;->D4(ILjava/lang/String;)Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v3

    .line 237
    const/4 v6, 0x6

    .line 238
    const/4 v7, 0x4

    .line 239
    const-string v2, "\u8f93\u51fa\u6587\u4ef6"

    .line 240
    .line 241
    const/4 v4, 0x0

    .line 242
    invoke-static/range {v2 .. v7}, Lwb/ho;->B1(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v5, v8}, Li0/h0;->p(Z)V

    .line 246
    .line 247
    .line 248
    goto :goto_4

    .line 249
    :cond_9
    const p1, -0x46930ba7

    .line 250
    .line 251
    .line 252
    invoke-virtual {v5, p1}, Li0/h0;->a0(I)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v5, v8}, Li0/h0;->p(Z)V

    .line 256
    .line 257
    .line 258
    goto :goto_4

    .line 259
    :cond_a
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 260
    .line 261
    .line 262
    :goto_4
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 263
    .line 264
    return-object p1

    .line 265
    :pswitch_1
    iget-object v0, p0, Lwb/be;->l:Ljava/lang/Object;

    .line 266
    .line 267
    move-object v1, v0

    .line 268
    check-cast v1, Landroid/content/SharedPreferences;

    .line 269
    .line 270
    iget-object v0, p0, Lwb/be;->m:Ljava/lang/Object;

    .line 271
    .line 272
    move-object v4, v0

    .line 273
    check-cast v4, Ljava/lang/String;

    .line 274
    .line 275
    move-object v6, p1

    .line 276
    check-cast v6, Li0/h0;

    .line 277
    .line 278
    check-cast p2, Ljava/lang/Integer;

    .line 279
    .line 280
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 281
    .line 282
    .line 283
    iget p1, p0, Lwb/be;->k:I

    .line 284
    .line 285
    or-int/lit8 p1, p1, 0x1

    .line 286
    .line 287
    invoke-static {p1}, Li0/r;->C(I)I

    .line 288
    .line 289
    .line 290
    move-result v7

    .line 291
    iget-object v2, p0, Lwb/be;->h:Ljava/lang/String;

    .line 292
    .line 293
    iget-object v3, p0, Lwb/be;->i:Ljava/lang/String;

    .line 294
    .line 295
    iget-boolean v5, p0, Lwb/be;->j:Z

    .line 296
    .line 297
    invoke-static/range {v1 .. v7}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 298
    .line 299
    .line 300
    goto/16 :goto_0

    .line 301
    .line 302
    nop

    .line 303
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
